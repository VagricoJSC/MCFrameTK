package mcframe.serverMAUD.MAUDL5030;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import mcframe.commonCore.container.MCContainer;
import mcframe.commonCore.container.MCList;
import mcframe.commonCore.container.MCRow;
import mcframe.commonCore.container.MCJoinKey;
import mcframe.commonCore.lang.MCNumber;
import mcframe.commonCore.notice.MCMessageList;
import mcframe.commonCore.notice.MCAppException;
import mcframe.commonCore.notice.MCException;
import mcframe.commonCore.notice.MCLog;
import mcframe.serverCore.logic.MCController;
import mcframe.serverCore.logic.MCDBSubOperation;
import mcframe.serverCore.logic.MCOperation;
import mcframe.serverCore.notice.MCMessagePool;
import mcframe.serverCore.queryapi.MCDBContainer;
import mcframe.serverCore.queryapi.MCQueryApiBuilder;
import static mcframe.commonFX.notice.FX_Msg.*;
import mcframe.serverFXBA.FXBAL0050.FXBAL_MCRLUpdater;
import mcframe.serverFXBA.FXBAL0060.FXBAL_MCRLUtil;
import mcframe.serverFXUC.FXUCL0010.FXUCL_DataUtil;
import mcframe.serverMAUD.MAUDL5010.MAUDL_LogicBase;
import mcframe.serverMAUC.MAUCL0010.MAUCL_MCDataUtil;
import mcframe.serverMAUC.MAUCL1120.MAUCL_ContextUtil;

import static mcframe.serverCore.queryapi.IFMCSQL.*;
import static mcframe.serverMAUC.MAUCL7080.MAUCL_DbUtil.*;
import static mcframe.commonMA.notice.MA_Msg.*;

abstract public class MAUDL_RLUpdater_MC extends FXBAL_MCRLUpdater {
	/** 
	 * モジュールID<p>
	 *
	 * ロジックインスタンスもしくはオペレーションインスタンスから参照する場合には{@link #getModuleID()}を使用してください。
	 */
	public static final String MODULE_ID = "MA";
	/** 
	 * サブモジュールID<p>
	 *
	 * ロジックインスタンスもしくはオペレーションインスタンスから参照する場合には{@link #getSubmoduleID()}を使用してください。
	 */
	public static final String SUBMODULE_ID = "MAUD";
	/** 
	 * ロジックID<p>
	 *
	 * ロジックはモジュールIDとロジックIDで一意に特定できます。<br>
	 * ロジックインスタンスもしくはオペレーションインスタンスから参照する場合には{@link #getLogicID()}を使用してください。
	 */
	public static final String LOGIC_ID = "MAUDL5030";

	/** モジュールIDを取得します。 */
	public String getModuleID(){ return MODULE_ID; }
	/** サブモジュールIDを取得します。 */
	public String getSubmoduleID(){ return SUBMODULE_ID; }
	/** ロジックIDを取得します。 */
	public String getLogicID(){ return LOGIC_ID; }

	/** 更新カウンタチェック（排他チェック）フラグ（デフォルト：オフ） */
	protected boolean _chkUpdCntr = false;

	/**論理削除フラグの制御を行うテーブル名を保持する配列*/
	protected String[] tables; 

	@Override
	protected void call() {
		insertTblNm();
		super.call();
		deleteTblNm();
	}

	/**
	 * 更新カウンタチェック（排他チェック）フラグを設定する
	 * デフォルト=false 更新カウンタチェックを行わない
	 */
	public void setChkUpdCntr(boolean flg) {
		_chkUpdCntr = flg;
	}

	/**
	 * 論理削除フラグ制御ワークに対してinsertを行う
	 */
	protected void insertTblNm() {
		List<String> list = new ArrayList<>();
		
		for (List<MCController> subOpeL : getAllSubOpes().values()) {
			for (MCController subOpe : subOpeL) {
				if (subOpe instanceof MCOperation) {
					List<MCController> updSubOpes = ((MCOperation)subOpe).getSubOpes(UPDATE);
					if (updSubOpes != null) {
						for (MCController upd : updSubOpes){
							if (upd instanceof MCDBSubOperation) {
								String table = ((MCDBSubOperation<?>)upd).dbc().tableName();// ユーティリティに渡すテーブル名を取得
								list.add(table);
							}
						}
					}
				}
			}
		}
		tables = list.toArray(new String[list.size()]);
		if (tables.length != 0) {
			MAUCL_ContextUtil.enableDelFlgOn(tables);
		}
	}
	
	/**
	 * 論理削除フラグ制御ワークに対してdeleteを行う
	 */
	protected void deleteTblNm() {
		if (tables.length != 0) {
			MAUCL_ContextUtil.unableDelFlgOn(tables);
		}
	}

	/**
	 * 引数のＤＢコンテナで更新します。
	 * 
	 * @param builder クエリAPIビルダー
	 * @param list キー変更行がinsertとdeleteの2行に分割されて格納されているＤＢコンテナ
	 */
	@Override
	protected <R extends MCDBContainer> void updateMain(
			MCQueryApiBuilder builder, MCList<R> list) {
		dbLockDelUpdInsByStatusCheck(builder, list, _chkUpdCntr);
	}

	/**
	 * 変更可能なキー項目を返します。
	 */
	protected String[] getUpdatableKeys() {
		return new String[]{};
	}
	/**
	 * 変更可能なキー項目があれば返します。
	 */
	protected String[] getUpdatableKeys(MCDBContainer row) {
		List<String> keys = Arrays.asList(getUpdatableKeys());
		List<String> l = new ArrayList<String>();
		for (String c : row.getKeyColumn()) {
			if (keys.contains(c)) {
				l.add(c);
			}
		}
		return (String[])l.toArray(new String[0]);
	}

	/**
	 * 変更可能なキー項目と対応する変更前キー項目のマップを返します。
	 */
	protected Map<String, String> getUpdatableKeyMap(MCDBContainer row) {
		String[] keys = getUpdatableKeys(row);
		String[] bfrKeys = FXBAL_MCRLUtil.getBeforeKeyColumns(keys);
		Map<String, String> m = new HashMap<String, String>();

		for (int i = 0; i < keys.length; i++) {
			m.put(keys[i], bfrKeys[i]);
		}
		return m;
	}

	protected String[] getBfrKeys(MCDBContainer row) {
		Map<String, String> m = getUpdatableKeyMap(row);
		List<String> l = new ArrayList<String>();
		for (String c : row.getKeyColumn()) {
			if (m.containsKey(c)) {
				l.add(m.get(c));
			}
			else {
				l.add(c);
			}
		}
		return (String[])l.toArray(new String[0]);
	}
	
	@Override
	protected void copyBeforeKeyToUpd() {
		// エラー回避（getUpdDbcRowの部分）
		if (getSubOpes(UPDATE) == null) {
			return ;
		}

		// 変更可能なキー項目があればコピーする
		MCContainer upC = up(0);
		if (upC instanceof MCList) {
			for (Object o : (MCList<?>) upC) {
				if (o instanceof MCRow) {
					MCRow upR = (MCRow) o;
					MCDBContainer updR = getUpdDbcRow(upR.getParamRowIndex());
					for (String col : FXBAL_MCRLUtil.getBeforeKeyColumns(getUpdatableKeys(updR))) {
						if (upR.contains(col)) {
							updR.setValue(col, upR.getValue(col));
						}
					}
				}
			}
		}
	}

	@Override
	protected boolean isKeyUpd(MCDBContainer r) {
		// キー変更不可
		return false;
	}

	@Override
	protected void chkMainTable(MCMessageList m) {
		// エラー回避
		if (getSubOpes(MAIN) != null) {
			super.chkMainTable(m);
		}
	}

	/** CALL_OPEnnサブオペレーショングループ名の接頭辞 */
	protected static final String CALL_OPE_PREFIX = "CALL_OPE";

	@Override
	protected void doIt() {
		if (getSubOpes(UPDATE) != null) {
			super.doIt();
		}
		
		setNullVal();
		setSysVal();
		for (String grpNm : getSortedCallOpeGrpNms()) {
			callOpes(grpNm);
		}
	}

	/** NULL文字対応項目の項目属性ＩＤ */
	protected static final String NULL_VAL = "NULL_VAL";

	/**
	 * NULL文字項目がnullだった場合にNULL文字を設定する
	 */
	protected void setNullVal() {
		// 画面から呼ばれるときのみ処理を実行
		if (getSortedCallOpeGrpNms().isEmpty()) {
			return ;
		}

		int i = 0;
		while(up(i) != null) {
			MAUCL_MCDataUtil.setNullVal(up(i++));
		}
	}
	
	/**
	 * システムパラメータの設定値で項目を補完する
	 */
	protected void setSysVal() {
		int i = 0;
		while(up(i) != null) {
			MAUCL_MCDataUtil.setSysVal(up(i++));
		}
	}

	protected List<String> getSortedCallOpeGrpNms() {
		List<String> l = new ArrayList<String>();
		for (String nm : getGrpNames()) {
			if (nm.startsWith(CALL_OPE_PREFIX)) {
				l.add(nm);
			}
		}
		Collections.sort(l);
		return l;
	}

	/**
	 * 指定されたオペレーショングループ名に属するサブオペレーションを実行する
	 */
	protected void callOpes(String subGrpNm) {
		// 上り電文の値をサブオペレーションの上り電文にセット
		mapUpContainers(subGrpNm);

		List<MCController> opes = getSubOpes(subGrpNm);
		if (opes == null) return ;

		// getSubOpesは実装仕様書の定義順で返すので、「チェック->更新」の順で定義すること
		for (MCController ctrl : opes) {

			if (ctrl instanceof MCOperation) {
				MCOperation ope = (MCOperation) ctrl;

				if (ope instanceof MAUDL_LogicBase.Checker) {
					callChkOpe((MAUDL_LogicBase.Checker) ope);
				}
				else if (ope instanceof mcframe.serverMAUD.MAUDL5030.MAUDL_RLUpdater) {
					callUpdOpe((mcframe.serverMAUD.MAUDL5030.MAUDL_RLUpdater) ope);
				}
			}
		}
	}

	/**
	 * チェックオペレーションの実行
	 * 実行後にエラーメッセージの処理を行う
	 * 
	 * @param ope 実行するサブオペレーション
	 */
	protected void callChkOpe(MAUDL_LogicBase.Checker ope) {

		ope.exec();

		if (hasMessage()) {
			throw addExMsg();
		};
	}

	/**
	 * 更新オペレーションの実行
	 * 実行前に更新カウンタチェックのフラグをたてる
	 * 
	 * @param ope 実行するサブオペレーション
	 */
	protected void callUpdOpe(mcframe.serverMAUD.MAUDL5030.MAUDL_RLUpdater ope) {
		ope.setChkUpdCntr(true);
		ope.exec();
	}

	// メッセージ後処理
	/**
	 * MCMessagePool が空でない場合に true を返す
	 * @return
	 */
	protected boolean hasMessage() {
		if (!MCMessagePool.isEmpty()) {
			return true;
		}
		else {
			return false;
		}
	}

	protected MCAppException addExMsg() {
		MCMessageList msgList = getMessage();
		MCAppException ex = new MCAppException(MAUDL0004);
		ex.addCauseMessageList(msgList);
		return ex;
	}
	/**
	 * MCMessagePool に格納されているメッセージを返す
	 * @return
	 */
	protected MCMessageList getMessage() {
		return MCMessagePool.getMessageList();
	}

	/**
	 * 更新対象コンテナ
	 */
	protected MCList<? extends MCDBContainer> _curList = null;

	//---- MAIN ---------------------------
	@Override
	protected <R extends MCDBContainer> void dbSortLockUpdEx(MCQueryApiBuilder builder,
			MCList<R> upd, boolean updChk) {

		MCList<R> locked = upd.createInstance();
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
						checkUpdCntr(row, lockedRow);
					}
					else {
						// ロック行対象が消えていた場合は、引数にかかわらず、
						// 呼び出す（結果、例外になる）
						checkUpdCntr(row, lockedRow);
					}
				}
			}

			String sqlid = LOGIC_ID + ":" + builder.getBaseDbc().tableName() + ":updateKeyAt";
			// 更新
			dbUpdateKeyAt(sqlid, upd, builder, bfrKeys);
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
	}

	protected <R extends MCDBContainer> void selectForUpdateNoWait(MCQueryApiBuilder builder, 
			MCList<R> locked, MCList<R> upd) {
		upd.sort(builder.getBaseDbc().getKeyColumn());

		// 更新可能キー項目があった場合、変更前キー項目の値をキー項目に設定してからロックを行う。
		MCList<R> bind = upd.clone();
		for (R row : bind) {
			for (Map.Entry<String, String> entry : getUpdatableKeyMap(row).entrySet()) {
				row.setValue(entry.getKey(), row.getValueNE(entry.getValue()));
			}
		}
		String sqlid = LOGIC_ID + ":" + builder.getBaseDbc().tableName() + ":selectKeyForUpdateNoWait";
		dbSelectKeyForUpdateNoWait(sqlid, locked, builder, bind);
	}

	//---- UPDATE ---------------------------

	@Override
	protected <R extends MCDBContainer> void beforeUpdate(
			MCList<R> dbc) {
		super.beforeUpdate(dbc);
	}

	@Override
	protected <R extends MCDBContainer> void chkMainList(
			MCList<R> mainDbc, MCMessageList m, MCController ctrl) {
		setCurList(mainDbc);
		for (MCDBContainer mainRow : mainDbc) {
			chkMainRow(mainRow, m, ctrl);
		}
	}
	

	@Override
	protected boolean alreadyExistKey(MCDBContainer r) {
		//取得された行がキー変更対象行の場合は更新継続可
		MCDBContainer upd = getUpdDbcRow(r.getParamRowIndex());
		MCDBContainer c = (MCDBContainer) r.createInstance();
		
		
		//キー追加行でなければ重複なしと判断する
		if(r.isStatusCreate() || isKeyUpd(upd)){
			String sqlid = createSqlId(LOGIC_ID, c, "MAUDL_RLUpdater_S01");
			sql(sqlid)
				.mainQuery()
				.select(COUNT_COL)
				.from(c)
				.where(createWhere(c, r.getKeyColumn()))
				.executeQuery(r, c);
			MCNumber n = c.getNumber(COUNT_NAME);
			if(n.gt(0)) {
				if(isRowUnderDelete(upd)) {
					return false;
				}
				else {
					return true;
				}
			}
		}
		
		return false;
	}

	/**
	 * キーの重なりが発見された新しいキーを持つＤＢコンテナに
	 * ついて重なりの対象が削除予定行であるかを評価します。
	 * 
	 * @param cond 更新対象のＤＢコンテナ
	 */
	protected boolean isRowUnderDelete(MCDBContainer cond) {
		for(MCDBContainer upR : getCurList()) {
			MCDBContainer row = getUpdDbcRow(upR.getParamRowIndex());
			if(isKeyDiffered(row)) {
				if(FXUCL_DataUtil.isColSame(
						cond, 
						FXBAL_MCRLUtil.getBeforeKeyColumns(row.getKeyColumn()), 
						row, 
						row.getKeyColumn())) {
					return true;
				}
			}
		}
		return false;
	}
	
	/**
	 * 更新対象のＤＢコンテナをセットします。
	 * 
	 * @param curDbc 更新対象のＤＢコンテナ
	 */
	protected void setCurList(MCList<? extends MCDBContainer> curDbc) {
		_curList = curDbc;			
	}
	
	/**
	 * 更新対象のＤＢコンテナを返します。
	 * 
	 * @return 更新対象のＤＢコンテナ
	 */
	protected MCList<? extends MCDBContainer> getCurList() {
		return _curList;
	}

	/**
	 * 変更前のキーで検索する為のロウを返します。
	 * 
	 * @param cond 更新対象のＤＢコンテナ
	 * @return 検索条件用のロウ
	 */
	protected MCRow createKeyBindRow(MCDBContainer cond) {

		MCRow r = cond.createInstance();
		
		for (String c : cond.getKeyColumn()) {
			r.setValueNE(c, cond.getValue(FXBAL_MCRLUtil.getBeforeKeyColumn(c)));
		}
		
		return r;
		
	}
}

