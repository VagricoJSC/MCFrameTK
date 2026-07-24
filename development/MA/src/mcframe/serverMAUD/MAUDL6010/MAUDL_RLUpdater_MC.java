package mcframe.serverMAUD.MAUDL6010;

import java.util.List;
import java.util.Map;

import mcframe.commonCore.container.MCContainer;
import mcframe.commonCore.container.MCList;
import mcframe.commonCore.container.MCRow;
import mcframe.commonCore.container.MCRow.Status;
import mcframe.commonCore.container.MCRowMatcher;
import mcframe.commonCore.container.MCIndexKey;
import mcframe.commonCore.container.MCJoinKey;
import mcframe.commonCore.lang.MCNumber;
import mcframe.commonCore.lang.MCStringUtil;
import mcframe.commonCore.notice.MCMessageList;
import mcframe.commonCore.param.MCParam;
import mcframe.commonCore.util.MCCollectionUtil;
import mcframe.commonCore.notice.MCAppException;
import mcframe.commonCore.notice.MCException;
import mcframe.commonCore.notice.MCLog;
import mcframe.serverCore.logic.MCController;
import mcframe.serverCore.logic.MCDBSubOperation;
import mcframe.serverCore.resource.MCConfig;
import mcframe.serverCore.resource.MCConst;
import mcframe.serverCore.sys.MCSys;

import static mcframe.serverCore.database.MCSQLClause.*;
import static mcframe.serverCore.dbc.CoreFunction.*;
import static mcframe.serverCore.queryapi.IFMCSQL.*;
import static mcframe.commonFX.notice.FX_Msg.*;
import static mcframe.commonMA.notice.MA_Msg.*;
import static mcframe.serverFXUC.FXUCL0010.FXUCL_DataUtil.*;
import mcframe.serverFXBA.FXBAL0060.FXBAL_MCRLUtil;
import mcframe.serverFXUC.FXUCL0010.FXUCL_DataUtil;
import mcframe.serverMAUC.MAUCL6010.MAUCL_StEndUtil;
import mcframe.serverMAUC.MAUCL7080.MAUCL_DbUtil;

import static mcframe.serverMAUC.MAUCL7080.MAUCL_DbUtil.*;
import static mcframe.serverFXUC.FXUCL0160.FXUCL_DateUtil.*;
import mcframe.serverCore.queryapi.MCDBContainer;
import mcframe.serverCore.queryapi.MCQueryApiBuilder;

abstract public class MAUDL_RLUpdater_MC extends
		mcframe.serverMAUD.MAUDL5030.MAUDL_RLUpdater {
	
	protected String _ins_usr_id = "ins_usr_id";
	protected String _ins_usr_nm = "ins_usr_nm";
	protected String _ins_func_id = "ins_func_id";
	protected String _upd_usr_id = "upd_usr_id";
	protected String _upd_usr_nm = "upd_usr_nm";
	protected String _upd_func_id = "upd_func_id";
	protected String _upd_srv_req_no = "upd_srv_req_no";

	/** 論理削除ＦＬＧのカラム名 */
	protected String _delFlagColName = "del_flg";

	/** 終了日のカラム名 */
	protected String _endDtColName = "end_dt";

	/**
	 * 変更可能なキー項目を返します。
	 */
	protected String[] getUpdatableKeys() {
		return new String[]{"st_dt"};
	}

	/**
	 * 更新対象コンテナ
	 */

	protected MCList<MCDBContainer> _oldList = null;
	protected MCIndexKey _oldListKeyIdx = null;
	
	//---- MAIN ---------------------------
	@Override
	protected <R extends MCDBContainer> void dbLockDelUpdInsByStatusCheck(
			MCQueryApiBuilder builder, MCList<R> list, boolean updChk) {
		_oldList = (MCList<MCDBContainer>) list.createInstance();
		
		MCList<R> ins = (MCList<R>) list.subList(Status.CREATE);
		MCList<R> upd = (MCList<R>) list.subList(Status.MODIFY);
		MCList<R> del = (MCList<R>) list.subList(Status.DELETE);

		if (!isSame(list.size(), FXUCL_DataUtil.sum(ins.size(), upd.size(), del.size()))) {
			// try catchされることを考慮するとインスタンスそのものを操作してはいけない
			MCList<R> c = (MCList<R>) list.clone();
			c.removeAll(ins);
			c.removeAll(upd);
			c.removeAll(del);
			throw new MCAppException(c.get(0), null, FXUDL0004, c.get(0));
		}

		// 登録・更新担当者、機能ＩＤ、更新リクエストＮＯの設定
		addValuesUpdInfo(builder);
		addSetUpdInfo(builder);

		// Delete処理
		dbSortLockDelEx(builder, del, updChk);

		// Update処理
		dbSortLockUpdEx(builder, upd, updChk);

		// Insert処理
		ins.sort(builder.getBaseDbc().getKeyColumn());
		dbInsertEx(createSqlId("MAUDL6010", builder.getBaseDbc(), "MAUDL_RLUpdater_I01"), ins, builder, FXUDL0005);

		_oldListKeyIdx = _oldList.createIndex(builder.getBaseDbc().getKeyColumn());

	}

	@Override
	protected <R extends MCDBContainer> void updDbcCustomize(MCQueryApiBuilder builder, MCList<R> list) {
		super.updDbcCustomize(builder, list);

		MCList<R> insUpdL = list.subList(r -> r.isStatusCreate() || r.isStatusModify());

		if (insUpdL.isEmpty()) {
			return ;
		}
		
		// 登録・更新担当者、機能ＩＤ、更新リクエストＮＯの設定
		@SuppressWarnings("unchecked")
		R infoR = (R)builder.getBaseDbc().createInstance();
		selectUpdInfo(infoR);

		String usrId = infoR.getString(_ins_usr_id);
		String usrNm = infoR.getString(_ins_usr_nm);
		String funcId = infoR.getString(_ins_func_id);

		insUpdL.setValueNE(_ins_usr_id, usrId);
		insUpdL.setValueNE(_ins_usr_nm, usrNm);
		insUpdL.setValueNE(_ins_func_id, funcId);
		insUpdL.setValueNE(_upd_srv_req_no, infoR.getValueNE(_upd_srv_req_no));
		insUpdL.setValueNE(_upd_usr_id, usrId);
		insUpdL.setValueNE(_upd_usr_nm, usrNm);
		insUpdL.setValueNE(_upd_func_id, funcId);
	}

	/**
	 * 登録・更新担当者、機能ＩＤ、更新リクエストＮＯを取得します。
	 */
	protected <R extends MCDBContainer> void selectUpdInfo(R dbc) {
		sql(createSqlId("MAUDL6010",dbc, "MAUDL_RLUpdater_S01"))
			.mainQuery()
			.select(
					nvl(FCPA_CONTEXT$F_GET_USERID(), FCPA_CONTEXT$F_GET_OS_USR()).as("ins_usr_id"),
					FCPA_CONTEXT$F_GET_USERNM().as("ins_usr_nm"),
					FCPA_CONTEXT$F_GET_CALL_PG_ID().as("ins_func_id"),
					FCPA_CONTEXT$F_GET_PROCESSID().as("upd_srv_req_no"))
			.executeQuery(dbc);
		dbc.setStringNE(_upd_usr_id, dbc.getStringNE(_ins_usr_id));
		dbc.setStringNE(_upd_usr_nm, dbc.getStringNE(_ins_usr_nm));
		dbc.setStringNE(_upd_func_id, dbc.getStringNE(_ins_func_id));
	}

	/**
	 * VALUES句に登録・更新担当者、機能ＩＤ、更新リクエストＮＯを追加します。
	 */
	protected void addValuesUpdInfo(MCQueryApiBuilder builder) {
		String[] colnames = new String[] {
				_ins_usr_id, _ins_usr_nm, _ins_func_id,
				_upd_usr_id, _upd_usr_nm, _upd_func_id, _upd_srv_req_no};

		for (String colname : colnames) {
			builder.addValues(colname, builder.getBaseDbc().getColumn$(colname));
		}
	}
	
	/**
	 * SET句に更新担当者、機能ＩＤ、更新リクエストＮＯを追加します。
	 */
	protected void addSetUpdInfo(MCQueryApiBuilder builder) {
		MCDBContainer dbc = builder.getBaseDbc();
		builder.addSet(dbc.getColumn$(_upd_usr_id));
		builder.addSet(dbc.getColumn$(_upd_usr_nm));
		builder.addSet(dbc.getColumn$(_upd_func_id));
		builder.addSet(dbc.getColumn$(_upd_srv_req_no));
	}

	/**
	 * ワークテーブルを使った削除処理です。
	 */
	protected <R extends MCDBContainer> void dbSortLockDelEx(MCQueryApiBuilder builder, MCList<R> del, boolean updChk) {
		if (del.isEmpty()) {
			return ;
		}

		MCList<R> delLocked = (MCList<R>) del.createInstance();
		MCList<R> delNotLocked = (MCList<R>) del.createInstance();
		MCList<R> sel = (MCList<R>) del.createInstance();
		MCMessageList updCntrErrMsgL = new MCMessageList();

		try {
			// ロック
			selectForUpdateNoWait(builder, sel, del);

			String[] keys = del.createRow().getKeyColumn();

			// 排他チェック
			MCJoinKey<MCList<R>> jk = del.join(keys, sel, sel.createIndex(keys));
			for (R row : del) {
				R lockedRow = row.getJoinedRow(jk);
				// ロックできた場合
				if (lockedRow != null) {
					if (updChk) {
						// 排他チェックエラーマルチメッセージ対応（排他エラーメッセージを溜めておく）
						MCMessageList msgL = checkUpdCntrNE(row, UPD_CNTR_NAME, lockedRow);
						if (!msgL.isEmpty()) {
							updCntrErrMsgL.addAll(msgL);
							continue ;
						}
					}
					delLocked.add(lockedRow);
				}
				// ロックができなかった場合
				else {
					delNotLocked.add(row);
				}
			}

			// ロックできなかった行がキー変更元行の場合はエラーとする
			checkDelExclusion(delNotLocked, (R)getUpdDbc(), (MCList<R>)getUpdUp1());

			// 排他チェックエラーマルチメッセージ対応（排他エラーがあったら例外をスロー）
			if (!updCntrErrMsgL.isEmpty()) {
				MCAppException ex = new MCAppException(MAUDL0006);
				ex.setCauseMessageList(updCntrErrMsgL);
				throw ex;
			}

			if (!delLocked.isEmpty()) {
				dbDeleteKey(createSqlId("MAUDL6010", builder.getBaseDbc(), "MAUDL_RLUpdater_D01"), delLocked, builder);
			}
		}
		catch (MCException ex) {
			// そのままthrow
			throw ex;
		}
		_oldList.addAll(delLocked);
	}

	@Override
	protected <R extends MCDBContainer> void dbSortLockUpdEx(MCQueryApiBuilder builder, MCList<R> upd, boolean updChk) {
		if (upd.isEmpty()) {
			return ;
		}

		MCList<R> locked = (MCList<R>) upd.createInstance();
		MCMessageList updCntrErrMsgL = new MCMessageList();

		try {
			// ロック
			selectForUpdateNoWait(builder, locked, upd);

			String[] keys = upd.createRow().getKeyColumn();
			String[] bfrKeys = getBfrKeys(upd.createRow());

			if (updChk) {
				// 排他チェック
				MCJoinKey<MCList<R>> jk = upd.join(bfrKeys, locked, locked.createIndex(keys));
				for (R row : upd) {
					R lockedRow = row.getJoinedRow(jk);
					if (lockedRow != null) {
						// 排他チェックエラーマルチメッセージ対応（排他エラーメッセージを溜めておく）
						MCMessageList msgL = checkUpdCntrNE(row, UPD_CNTR_NAME, lockedRow);
						if (!msgL.isEmpty()) {
							updCntrErrMsgL.addAll(msgL);
							continue ;
						}
					}
					else {
						// ロック行対象が消えていた場合は、引数にかかわらず、
						// 呼び出す（結果、例外になる）
						checkUpdCntr(row, lockedRow);
					}
				}
			}
			// 排他チェックエラーマルチメッセージ対応（排他エラーがあったら例外をスロー）
			if (!updCntrErrMsgL.isEmpty()) {
				MCAppException ex = new MCAppException(MAUDL0004);
				ex.setCauseMessageList(updCntrErrMsgL);
				throw ex;
			}

			// 更新
			dbUpdateKeyAt(createSqlId("MAUDL6010", builder.getBaseDbc(), "MAUDL_RLUpdater_U01"), upd, builder, bfrKeys);
		}
		catch (MCException ex) {
			if (isDupValOnIndex(ex)) {
				MCLog.write(ex);
				throw new MCAppException(FXBAL0021);
			}
			else {
				// それ以外はそのままthrow
				throw ex;
			}
		}
		_oldList.addAll(locked);
	}

	@Override
	protected <R extends MCDBContainer> void selectForUpdateNoWait(MCQueryApiBuilder builder, MCList<R> locked, MCList<R> upd) {
		upd.sort(builder.getBaseDbc().getKeyColumn());

		// 更新可能キー項目があった場合、変更前キー項目の値をキー項目に設定してからロックを行う。
		// 削除時（＝ステータスがDELETE）は行わない
		MCList<R> b = (MCList<R>) upd.clone();
		for (R r : b) {
			if (!b.isStatusDelete()) {
				for (Map.Entry<String, String> e : getUpdatableKeyMap(r).entrySet()) {
					r.setValue(e.getKey(), r.getValueNE(e.getValue()));
				}
			}
		}

		MCDBContainer wkTbl = builder.getBaseDbc().getPkWorkDbc("W1");
		// 通常のロック
		if (isNull(wkTbl)) {
			MCDBContainer dbc = builder.getBaseDbc();
			MCQueryApiBuilder lockBldr = MCQueryApiBuilder.create(dbc);
			lockBldr.setOrderByAsc(dbc.getKeyColumn$());
			removeRefViewCol(lockBldr);
			dbSelectKeyForUpdateNoWait(createSqlId("MAUDL6010", lockBldr.getBaseDbc(), "MAUDL_RLUpdater_S02"), locked, lockBldr, b);
		}
		// ワークテーブルを用いたロック（パフォーマンス対応）
		else {
			// ワークテーブルへのinsertおよびメインテーブルのロックを行う
			selectForUpdateNoWaitPkWk(createSqlId("MAUDL6010", builder.getBaseDbc(), "MAUDL_RLUpdater_S03"), locked, builder.getBaseDbc(), b);
		}
	}
	
	protected void removeRefViewCol(MCQueryApiBuilder lockBldr) {
		for (String col : lockBldr.getBaseDbc().getUpdSkipColumn()) {
			if (col.startsWith("base_")) {
				// クエリAPIは、select for updateの場合、参照用ビューではなく更新用ビューを参照する場合がある
				// （参照用ビューでLCLテーブルと外部結合しているテーブルの場合）
				// baseで始まる更新対象外カラムは更新用ビューには存在しないためremoveする
				lockBldr.removeSelect(col);
			}
		}
	}

	/**
	 * MAIN処理時にロックした更新前のレコードの情報を取得します。
	 * 
	 * @param row 更新後のレコードの情報（getUpdDbcRowで取得できるRow）
	 * @return
	 */
	protected MCDBContainer getOldRow(MCDBContainer row) {
		Comparable<?>[] vals = new Comparable[row.getKeyColumn().length];
		int i = 0;
		for (String col :FXBAL_MCRLUtil.getBeforeKeyColumns(row.getKeyColumn())) {
			vals[i++] = row.getValue(col);
		}
		return (MCDBContainer)_oldList.getFirst(_oldListKeyIdx, vals);
	}
	
	@Override
	protected <R extends MCDBContainer> void afterUpdate(
			MCList<R> dbc) {
		super.afterUpdate(dbc);
		if (isStEndDt(dbc.createRow())){
			checkStEndDtValid(dbc);
		}
	}
	
	protected <R extends MCDBContainer> void checkStEndDtValid(MCList<R> dbc) {
		for (MCDBContainer r :dbc) {
			// 追加、更新行のみチェックする
			if(r.isStatusCreate() || r.isStatusModify()){
				MAUCL_StEndUtil.checkStEndDtValid(r, getBaseKey(r), getMsgList());
			}
		}
	}

	@Override
	protected void up() {
		// paramRowIndexの設定（PCM連携対応）
		setParamRowIndex();

		super.up();

		// 上り電文の項目を「OTHER_」で始まるサブオペレーションの上り電文にセット
		Map<String, List<MCController>> grpMap = getAllSubOpes();
		for (String key :grpMap.keySet()) {
			if (!key.startsWith(_OTHER_UPD_ATT_PREFIX)) {
				continue;
			}
			mapUpContainers(key);
		}
	}

	/**
	 * PCM連携から呼ばれる場合、paramRowIndexが未設定（-1）のため
	 * １行目しか処理されないので未設定ならば設定する。
	 */
	protected void setParamRowIndex() {
		int rIdx = 0;
		MCContainer upC = up(0);
		if (upC instanceof MCList) {
			for (Object o : (MCList<?>) upC) {
				if (o instanceof MCRow) {
					MCRow upR = (MCRow) o;
					if (upR.getParamRowIndex() < 0) {
						upR.setParamRowIndex(rIdx++);
					}
				}
			}
		}
	}

	/**
	 * 開始日終了日の重複チェック対象かどうかを返す。
	 * 
	 * @param cond 更新対象のＤＢコンテナ
	 * @return 開始日終了日の重複チェック対象の場合true
	 */
	protected boolean isStEndDt(MCDBContainer cond) {
		return MAUCL_StEndUtil.isStEndDt(cond);
	}
	
	/**
	 * 「[ベースキー]_key」という項目名で、condにベースキーの更新前の値を保持する。
	 * 保持できない場合はfalseを返す。
	 * このメソッドがfalseを返す場合、開始日終了日の重複チェックは行われません。
	 * 
	 * @param cond 更新対象のＤＢコンテナ
	 */
	protected boolean rslvOldValBeforeBaseKey(MCDBContainer cond) {
		return true;
	}
	
	/**
	 * 開始日終了日重複チェックをするベースキーの配列を返す。
	 * condが更新ステータスの場合、「[ベースキー]_key」という項目名で、condに
	 * 更新前の値を保持しなければならない。
	 * 
	 * @param cond 更新対象のＤＢコンテナ
	 * @return ベースキー
	 */
	protected String[] getBaseKey(MCDBContainer cond) {
		return MAUCL_StEndUtil.getBaseKey(cond);
	}
	
	//---- OTHER（属性変更） ---------------------------
	@Override
	protected void chkOtherTable(MCMessageList m) {
		super.chkOtherTable(m);
		chkOtherTableAttUpd(m);
	}
	
	protected static final String _OTHER_UPD_ATT_PREFIX = "OTHER_";
	
	/**
	 * OTHER_ サブオペレーショングループの処理
	 * <p>
	 * 削除（キー変更含む）行が他テーブルで使用されている場合、そのメッセージを引数のMCMessageListに格納します。
	 */
	protected void chkOtherTableAttUpd(MCMessageList m) {
		Map<String, List<MCController>> subOpeGrpMap = getAllSubOpes();
		for (String subOpeGrp :subOpeGrpMap.keySet()) {
			if (!subOpeGrp.startsWith(_OTHER_UPD_ATT_PREFIX)) {
				continue;
			}
			List<MCController> os = getSubOpes(subOpeGrp);
			if (os != null) {
				for (int i = 0; i < os.size(); i++) {
					MCController ctrl = os.get(i);
					if (ctrl instanceof MCDBSubOperation) {
						MCList<?> d = ((MCDBSubOperation<?>) ctrl).up1;
						if (((MCDBSubOperation<?>) ctrl).dbc() instanceof MCDBContainer) {
							@SuppressWarnings("unchecked")
							MCList<MCDBContainer> dbcL = (MCList<MCDBContainer>) d;

							chkOtherListAttUpd(dbcL, m, ctrl, subOpeGrp);
						}
					}
				}
			}
		}
	}
	
	protected <R extends MCDBContainer> void chkOtherListAttUpd(
			MCList<R> dbcL, MCMessageList m, MCController ctrl, String subOpeGrp) {
		for (MCDBContainer dbc : dbcL) {
			chkOtherRowAttUpd(dbc, m, ctrl, subOpeGrp);
		}
	}
	
	protected void chkOtherRowAttUpd(MCDBContainer dbc, MCMessageList m, MCController ctrl, String subOpeGrp) {
		MCDBContainer newRow = getUpdDbcRow(dbc.getParamRowIndex());
		MCDBContainer oldRow = getOldRow(newRow);
		// 削除
		if (newRow.isStatusDelete()) {
			chkOtherRow(dbc, m, ctrl);
			return;
		}
		// キー変更時
		if (isKeyUpd(newRow)) {
			dbc.setStatus(Status.DELETE);
			chkOtherRow(dbc, m, ctrl);
			return;
		}
		// 削除行、キー変更行、更新行以外は対象外
		if (!newRow.isStatusModify()) {
			return;
		}
		// 属性変更時
		if (isOtherAttUpd(newRow, oldRow, subOpeGrp)) {
			if (alreadyUsedAttUpd(dbc, newRow, oldRow, subOpeGrp)) {
				m.add(getOtherErrMsg(dbc));
				return;
			}
		}
		// 無効
		if (isDelFlgOn(newRow, oldRow, subOpeGrp)) {
			chkOtherRow(dbc, m, ctrl);
		}
	}

	/**
	 * 論理削除ＦＬＧがオンになったときに、OTHERチェックをするかどうかを判定します。
	 * 
	 * @param newRow 被参照マスタの更新後のレコード
	 * @param oldRow 被参照マスタの更新前のレコード
	 * @param subOpeGrp OTHERのサブオペレーショングループ名
	 * @return
	 */
	protected <R extends MCDBContainer> boolean isDelFlgOn(R newRow, R oldRow,
			String subOpeGrp) {
		return newRow.contains(_delFlagColName) && newRow.getBoolean(_delFlagColName);
	}
	
	/**
	 * 被参照マスタの更新前と更新後のレコードの状態を比較し、OTHER（属性変更）チェックをするかどうかを判定します。
	 * デフォルト実装は常にfalse（チェックしない）を返します。
	 * 参照マスタの状態を加味する必要が無い場合、このメソッドをO/RするだけでOTHER（属性変更）チェックの実装が可能です。
	 * 参照マスタの状態を加味する場合は、alreadyUsedAttUpdも合わせてO/Rする必要があります。
	 * 
	 * @param newRow 被参照マスタの更新後のレコード
	 * @param oldRow 被参照マスタの更新前のレコード
	 * @param subOpeGrp OTHER（属性変更）のサブオペレーショングループ名
	 * @return
	 */
	protected <R extends MCDBContainer> boolean isOtherAttUpd(R newRow, R oldRow, String subOpeGrp) {
		return false;
	}
	
	/**
	 * 参照マスタの状態を加味して被参照マスタの更新可／不可をチェックします。
	 * デフォルト実装はOTHER（属性変更）のサブオペレーションの上り電文を条件に参照マスタの件数を調べ、
	 * 1件以上の場合にtrueを返します。件数取得時には論理削除ＦＬＧの状態や適用日は加味されません。
	 * 
	 * @param cond OTHER（属性変更）のサブオペレーションの上り電文
	 * @param newRow 被参照マスタの更新後のレコード
	 * @param oldRow 被参照マスタの更新前のレコード
	 * @param subOpeGrp OTHER（属性変更）のサブオペレーショングループ名
	 * @return
	 */
	protected <R extends MCDBContainer> boolean alreadyUsedAttUpd(MCDBContainer cond, R newRow, R oldRow, String subOpeGrp) {
		// デフォルトでは引数のコンテナを条件に件数を調べる
		// （superなので論理削除ＦＬＧなどは考慮しない）
		return super.alreadyUsed(cond);
	}
	
	//---- OTHER ---------------------------
	@Override
	protected <R extends MCDBContainer> MCRowMatcher<R> createDeleteKeyRowMatcher(
			R row) {
		return new CML_DeleteKeyRowMatcher<R>();
	}

	/**
	 * 論理削除ＦＬＧを考慮したRowMatcherクラスです。
	 */
	public class CML_DeleteKeyRowMatcher<R extends MCDBContainer> extends DeleteKeyRowMatcher<R> {

		@Override
		public boolean match(R row) {

			MCDBContainer mr = getUpdDbcRow(row.getParamRowIndex());

			if (mr.isStatusDelete()) {
				return true;
			}
			if (mr.contains(_delFlagColName)
					&& mr.getBoolean(_delFlagColName) 
					&& !mr.isStatusCreate()) {
				return true;
			}
			// キー変更行の場合は対象。無効も許さないのでDELETEステータスを設定
			if (isKeyUpd(mr)) {
				row.setStatus(Status.DELETE);
				return true;
			}
			else {
				return false;
			}
		}

	}
	
	/**
	 * 論理削除の場合、論理削除（論理削除ＦＬＧ）と使用期間も考慮してチェックします。<BR>
	 * 物理削除の場合は親クラスの処理結果を返します。
	 */
	@Override
	protected boolean alreadyUsed(MCDBContainer r) {
		MCDBContainer mr = getUpdDbcRow(r.getParamRowIndex());
		
		if (r.isStatusDelete()
				|| (r.isStatusModify() && isKeyUpd(mr) && mr.getBooleanNE(_delFlagColName))) {
			return super.alreadyUsed(r);
		}

		MCDBContainer c = (MCDBContainer) r.createInstance();
		MCPredicate where = allWhere(c);
		// 論理削除ＦＬＧがオフのみに絞り込み
		if (c.contains(_delFlagColName)) {
			where = where.and(MCQueryApiBuilder.makeEq(c.getColumn$(_delFlagColName), value(false)));
		}
		// 使用期間内に絞り込み
		if (isStEndDt(r)) {
			where = where.and(MCQueryApiBuilder.makeEq(c.getColumn$(_endDtColName), value(getToday())));
		}

		sql(createSqlId("MAUDL6010", c, "MAUDL_RLUpdater_S02"))
			.mainQuery()
			.select(MAUCL_DbUtil.COUNT_COL)
			.from(r)
			.where(where)
			.executeQuery(r, c);
		MCNumber n = c.getNumber(MAUCL_DbUtil.COUNT_NAME);

		return n.gt(0);
	}

	/**
	 * OTHERサブオペレーショングループチェック対象のRowを持つListを返します。
	 */
	protected <R extends MCDBContainer> MCList<R> getChkOtherList(MCList<R> list){
		MCList<R> l1 = list.subList(createDeleteKeyRowMatcher(list.createRow()));
		MCList<R> l2 = l1.createInstance();
		for(R r : l1) {
			MCDBContainer row = getUpdDbcRow(r.getParamRowIndex());
			if(!isRowUnderDelete(row)) {
				l2.add(r);
			}
		}
		return l2 ;
	}

	// ///////////////////////////////////////////////
	// 簡易マルチスレッド対応
	// ///////////////////////////////////////////////
	@Override
	protected int getSplitRowCount() {
		return getThreadBatchSize();
	}

	@Override
	protected boolean isThreadExec(MCParam p) {
		// 上り電文にリストコンテナが２つ以上存在する場合はマルチスレッドにしない
		if (!checkOneListUp(p)) {
			return false;
		}
		return super.isThreadExec(p);
	}
	/**
	 * 上り電文にリストコンテナが２つ以上存在していないかチェックします。</br>
	 * <P>
	 * 簡易マルチスレッドではリストコンテナ２つ以上の更新に対応していないので</br>
	 * その場合に簡易マルチスレッドで実行されないようにチェックしています。</br>
	 * 通常のマルチスレッドでリストコンテナ２つ以上に対応する場合は</br>
	 * このメソッドをオーバーライドしてtrueを返してください。
	 * </P>
	 */
	protected boolean checkOneListUp(MCParam p) {
		List<MCContainer> contL = p.getContainerParam().up();
		int cnt = 0;
		for (int i = 0; i < contL.size(); i++) {
			if (contL.get(i) instanceof MCList) {
				if (++cnt > 1) {
					return false;
				}
			}
		}
		return true;
	}
	/**
	 * バッチサイズ（１スレッドあたりの処理数）をMCConfigServerリソースから取得する。</br>
	 * <P>
	 * リソースキー：[mid].[lid].[oid].thread.batchSize</br>
	 * ※[mid].[lid].[oid]はMCSys.requestから取得する。</br>
	 * リソースの設定が無い場合や0以下の値が指定されていた場合は、</br>
	 * <B>CUL_Cacheのキャッシュ機能のキャッシュサイズ</B>をリソースより取得して返す。
	 * </P>
	 */
	protected int getThreadBatchSize() {
		int batchSize = getResourceThreadBatchSize();
		if (batchSize > 0) {
			return batchSize;
		}
		return getCacheSize();
	}
	/**
	 * バッチサイズ（１スレッドあたりの処理数）をMCConfigServerリソースから取得する。</br>
	 * <P>
	 * リソースキー：[mid].[lid].[oid].thread.batchSize</br>
	 * ※[mid].[lid].[oid]はMCSys.requestから取得する。</br>
	 * リソースの設定が無い場合はデフォルト値(-1)を返す</br>
	 * </P>
	 */
	protected int getResourceThreadBatchSize() {
		String mid = MCSys.request.moduleId();
		String lid = MCSys.request.logicId();
		String oid = MCSys.request.operationId();
		String key = MCConfig.server.findHierarchy(mid, lid, oid, "thread.batchSize");
		if (MCStringUtil.isNull(key)) {
			return -1;
		}
		return MCConfig.server.getInteger(key, -1);
	}
	/**
	 * CUL_Cacheのキャッシュ機能のキャッシュサイズの最大値をMCAppServerリソースから取得する。
	 * <P>
	 * 以下の順にキーを探索し最初に合致した物の値を採用する。</br>
	 * cache_size.[mid].[lid].[oid]</br>
	 * cache_size.[mid].[lid]</br>
	 * cache_size.[mid]</br>
	 * cache_size</br>
	 * いずれの方法でもキャッシュサイズが設定されていない場合はデフォルト値（1000）を返す。
	 * ※[mid].[lid].[oid]はMCSys.requestから取得する。</br>
	 * </P>
	 */
	protected int getCacheSize() {
		String mid = MCSys.request.moduleId();
		String lid = MCSys.request.logicId();
		String oid = MCSys.request.operationId();
		String[] keys = new String[] {
				"cache_size", mid, lid, oid
		};
		for (int i = keys.length; i > 0; i--) {
			String[] k = MCCollectionUtil.subArray(keys, 0, i, String.class);
			int cacheSize = MCConst.app.getInteger(MCConst.createKey(k), -1);
			if (cacheSize > 0) {
				return cacheSize;
			}
		}
		return 1000;
	}

}

