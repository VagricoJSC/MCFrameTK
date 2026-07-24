package mcframe.serverMAUD.MAUDL6010;

import java.util.ArrayList;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;

import mcframe.commonCore.container.MCContainer;
import mcframe.commonCore.container.MCConstRow;
import mcframe.commonCore.container.MCIndexKey;
import mcframe.commonCore.container.MCList;
import mcframe.commonCore.container.MCRow;
import mcframe.commonCore.container.MCRow.Status;
import mcframe.commonCore.notice.MCLog;
import mcframe.commonCore.notice.MCMessage;
import mcframe.commonCore.notice.MCMessageList;
import mcframe.commonCore.util.MCCollectionUtil;
import mcframe.serverCore.logic.MCController;
import mcframe.serverCore.logic.MCDBSubOperation;
import mcframe.serverCore.notice.MCMessagePool;
import mcframe.serverCore.queryapi.MCDBContainer;
import mcframe.serverCore.queryapi.MCQueryApiBuilder;
import mcframe.commonFX.notice.FX_Msg;
import mcframe.serverFXUC.FXUCL0010.FXUCL_DataUtil;
import mcframe.commonMA.notice.MA_Msg;
import mcframe.serverMAUC.MAUCL6010.MAUCL_StEndUtil;
import mcframe.serverMAUD.MAUDL5010.MAUDL_RLUtil;
import mcframe.commonMA.constant.MAC_STR;
import mcframe.serverMAUC.MAUCL0010.MAUCL_MCDataUtil;
import mcframe.serverMAUC.MAUCL1120.MAUCL_ContextUtil;

/**
 * 上り電文データをDBのデータと比較、必要であれば補正を行い、下り電文への設定を行います。
 */
abstract class MAUDL_RLStEndDupChecker_MC extends MAUDL_RLUpdater {
	
	protected final boolean _doUpdate = false;

	protected String[] _correctStopMsgs = new String[]{MA_Msg.MAUDL0379};

	@Override
	protected void doIt() {
		if (_doUpdate) {
			super.doIt();
		}
	}
	
	@Override
	protected void insertTblNm() {
		List<String> list = new ArrayList<>();

		List<MCController> updSubOpes = getSubOpes(UPDATE);
		if (updSubOpes != null) {
			for (MCController upd : updSubOpes){
				if (upd instanceof MCDBSubOperation) {
					String table = ((MCDBSubOperation<?>)upd).dbc().tableName();// ユーティリティに渡すテーブル名を取得
					list.add(table);
				}
			}
		}
		tables = list.toArray(new String[list.size()]);
		if (tables.length != 0) {
			MAUCL_ContextUtil.enableDelFlgOn(tables);
		}
	}

	protected void copyBeforeKeyToUpd() {

		MCContainer upC = up(0);
		if (upC instanceof MCList) {
			for (Object o : (MCList<?>) upC) {
				if (o instanceof MCRow) {
					MCRow upR = (MCRow) o;
					MCDBContainer updR = getUpdDbcRow(upR.getParamRowIndex());
					copyBeforeKeyToUpd(updR, upR);
					copyBeforeKeyToUpdDelKey(updR, upR);
				}
			}
		}
	}
	@Override
	public void copyBeforeKeyToUpd(MCDBContainer dest, MCRow src) {
		// 更新可能なキーのみコピー
		for (String c : MAUDL_RLUtil.getBeforeKeyColumns(getUpdatableKeys(dest))) {
			dest.setValue(c, src.getValue(c));
		}
	}

	@Override
	protected void defCheck() {
		initMsgList();
		MCMessageList msgList = getMsgList();

		beforeDefChk(msgList);
		if (_doUpdate) {
			MCLog.write(new MCMessage(FX_Msg.FXBAL0018));
			chkMainTable(msgList);
		}
		throwMsgList();
	}
	@Override
	protected void beforeDefChk(MCMessageList msgList) {
		MCMessageList ml = new MCMessageList();
		correctUp(ml);
		MCMessagePool.addAll(ml);
	}

	/**
	 * 開始、終了日のチェック及び補正を行います。<p>
	 */
	protected void correctUp(MCMessageList msgList) {

		IdentityHashMap<MCRow, MCMessageList> rowToMsg = new IdentityHashMap<MCRow, MCMessageList>();

		@SuppressWarnings("unchecked")
		MCList<MCDBContainer> upd = (MCList<MCDBContainer>) getUpdUp1();
		MCQueryApiBuilder srch = MCQueryApiBuilder.create(getUpdDbc());
		setNullVal(upd);
		MCQueryApiBuilder builder = MCQueryApiBuilder.create((MCDBContainer)getUpdDbc().createInstance());
		MCList<MCDBContainer> srchList = upd.createInstance();
		dbcCustomize(srch, srchList);

		//キー更新行をINSとDELに分割
		MCList<MCDBContainer> tmp = keyUpdToInsAndDel(upd);

		MCList<MCDBContainer> marged = MAUCL_StEndUtil.correctRange(
				tmp, srch, srchList,
				rowToMsg,
				_correctStopMsgs
				);

		//#insAndDelToKeyUpdは、#keyUpdToInsAndDel で行った分割を元に戻すだけではないので注意。
		//#keyUpdToInsAndDel で分割したものを元に戻せる場合は戻し、さらに
		//DBレコードの開始日が変更になり、DELとINSになったものもキー更新にする。
		insAndDelToKeyUpd(builder, marged, rowToMsg);

		setConvdCorrectMsg(builder, upd, rowToMsg, msgList);
		upd.setAll(marged);
	}
	
	/**
	 * key項目のNULL_VAL文字項目がnullだった場合にNULL文字を設定する
	 */
	protected void setNullVal(MCList<MCDBContainer> updTmp) {
		
		if (up(0) instanceof MCList) {
			@SuppressWarnings("unchecked")
			MCList<MCConstRow> l = (MCList<MCConstRow>) up(0);

			MCConstRow r = l.createRow();
			Map<String, String> map = r.getExtMap(NULL_VAL);
			if (map != null) {
				for (MCDBContainer u : updTmp) {
					for (String col : map.keySet()) {
						if (u.isStatusCreate()) {
							if (u.getValue(col) == null) {
								u.setValue(col, MAC_STR.NULL_VAL.value());
							}
						}
					}
				}
			}
		}
	}
	
	/**
	 * 
	 * ユーティリティによって作成されたメッセージを加工し、msgListに設定します。<p>
	 * 
	 * 
	 * DBレコード間期間重複メッセージの原因コンテナを画面上のコンテナに変更します。
	 * @param upd
	 * @param rowToMsg
	 * @param msgList
	 */
	protected void setConvdCorrectMsg(MCQueryApiBuilder builder, MCList<MCDBContainer> upd, IdentityHashMap<MCRow, MCMessageList> rowToMsg, MCMessageList msgList){

		String[] kc = builder.getBaseDbc().getKeyColumn();
		String[] bkc = MAUCL_StEndUtil.getBaseKey(upd.get(0));
		upd.sort(kc);
		MCIndexKey updk = upd.createIndex(kc);
		MCRow dbDupliMsgAddedRow = null;
		for(Map.Entry<MCRow, MCMessageList> e: rowToMsg.entrySet()) {
			MCRow r = e.getKey();
			MCMessageList ml = e.getValue();
			//画面のコンテナをcauseRowとしていないものは下らせない。ただし、
			//DBレコード間重複メッセージは最少開始日の画面のコンテナにメッセージを移動する。
			if (e.getKey().getParamRowIndex() >= 0) { 
				msgList.addAll(ml);
			}
			else {
				for(MCMessage m : ml) {
					if (MA_Msg.MAUDL0379.equals(m.getID())) {
						MCRow cr = upd.getFirst(updk, r.toArray(bkc));
						if (cr == null || dbDupliMsgAddedRow == cr) {
							break;
						}
						dbDupliMsgAddedRow = cr;
						m.setCauseRow(cr, null);
						msgList.add(m);
						break;
						
					}
				}
			}
		}

	}
	
	/**
	 * 変更前キーと{@link #_KEY_SPLIT_ROW_FLG_COLUMN}の値が同一である場合、INSERTとDELETEのコンテナををキー更新行にします。<p>
	 * 
	 * @param dbc DBコンテナ
	 * @param d 補正後のリスト
	 * @param rowToMsg コンテナとメッセージとのマップ
	 */
	protected void insAndDelToKeyUpd(MCQueryApiBuilder builder, MCList<MCDBContainer> d, IdentityHashMap<MCRow, MCMessageList> rowToMsg) {

		d.addBooleanColumn(_KEY_SPLIT_ROW_FLG_COLUMN);
		String[] bks = MAUDL_RLUtil.getBeforeKeyColumns(builder.getBaseDbc().getKeyColumn());
		String[] s = MCCollectionUtil.concat(bks, new String[]{_KEY_SPLIT_ROW_FLG_COLUMN});
		d.sort(s);
		
		MCList<MCRow> rmv = MCList.create(MCRow.class);
		for (int i=0 ; i < d.size() -1 ; i++) {
			MCDBContainer r1 = d.get(i);
			MCDBContainer r2 = d.get(i+1);
			if (r1.getBooleanNE(_KEY_SPLIT_ROW_FLG_COLUMN) 
					== r2.getBooleanNE(_KEY_SPLIT_ROW_FLG_COLUMN)){
				if (FXUCL_DataUtil.isColSame(r1, r2, bks)) {
					MCRow dr = null;
					MCRow cr = null;
					if (r1.isStatusDelete() && r2.isStatusCreate()) {
						dr = r1;
						cr = r2;
					}
					else if(r1.isStatusCreate() && r2.isStatusDelete()) {
						dr = r2;
						cr = r1;
					}
					if (dr != null && cr != null) {
						cr.setStatus(Status.MODIFY);
						rowToMsg.remove(dr);
						rmv.add(dr);
					}
				}
			}
		}
		d.removeAll(rmv);
	}
	
	protected <R extends MCDBContainer> void dbcCustomize(MCQueryApiBuilder builder, MCList<R> rslt) {
		setSelectAndFrom(builder);
		MAUDL_RLUtil.setSelectUsrNm(builder);
	}
	
	/** 
	 * select,from句を設定します。<p>
	 * dbcの固定カラム名と一致する、下り電文のカラム名をselect句に設定します。<br>
	 * さらに、そのカラム名から結合情報が取得できる場合はFrom句に結合条件を追加します。<br>
	 */
	protected <R extends MCDBContainer> void setSelectAndFrom(
			MCQueryApiBuilder builder) {
		MCContainer c = down(0);

		if (c instanceof MCList) {
			@SuppressWarnings("unchecked")
			MCList<MCRow> downL = (MCList<MCRow>) c;

			String[] downC = downL.createRow().getConstColumnPathArray();
			MAUDL_RLUtil.setSelectAndFrom(builder, downC, isForeignEQ());

		}
	}
	
	protected boolean isForeignEQ() {
		return false;
	}
	
	@Override
	public void down() {
		super.down();
		downRslt();
		// 定数名の設定
		MAUCL_MCDataUtil.setConstNm(down(0));
		// 機能名の設定
		MAUCL_MCDataUtil.setFuncNm(down(0));
	}
	
	/**
	 * UPDATEサブオペレーションのDBコンテナの情報を下り電文に設定します。
	 */
	@SuppressWarnings("unchecked")
	protected void downRslt() {
		MCList<MCRow> l = (MCList<MCRow>)down(0);
		MCList<MCRow> lr = l.createInstance();
		MCList<? extends MCDBContainer> upd = getUpdUp1();
		for(MCDBContainer r : upd) {
			MCRow r1 = l.createRow();
			r1.setByName(r);
			lr.add(r1);
		}
		l.setAll(lr);
	}
	
}

