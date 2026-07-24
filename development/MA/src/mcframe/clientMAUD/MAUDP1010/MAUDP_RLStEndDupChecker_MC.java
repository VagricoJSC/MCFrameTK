package mcframe.clientMAUD.MAUDP1010;

import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;
import mcframe.clientMAUC.MAUCP1010.MAUCP_StEndUtil;
import mcframe.clientMAUD.MAUDP0010.MAUDP_PanelBase;
import mcframe.clientCore.beans.MCCallerPanelBridge;
import mcframe.clientCore.beans.message.MCProgressInfo;
import mcframe.clientCore.beans.table.MCColumnConfig;
import mcframe.clientCore.beans.table.MCTable;
import mcframe.commonMA.notice.MA_Msg;
import mcframe.commonCore.container.MCContainer;
import mcframe.commonCore.container.MCIndexKey;
import mcframe.commonCore.container.MCList;
import mcframe.commonCore.container.MCRow;
import mcframe.commonCore.lang.*;
import mcframe.commonCore.meta.MCMeta;
import mcframe.commonCore.notice.MCMessage;
import mcframe.commonCore.notice.MCMessageList;
import mcframe.commonCore.util.MCCollectionUtil;
import mcframe.commonFX.notice.FX_Msg;
import mcframe.commonCore.container.MCConstRow;
import mcframe.commonMA.constant.MAC_STR;
import static mcframe.commonMA.meta.MA_META.*;
import static mcframe.clientMAUC.MAUCP0010.MAUCP_MCDataUtil.*;

/**
 * 期間重複補正通信提携処理クラスです。<p>
 *
 * 下り電文の第1ブロックはDtlであることが必要です。
 * @param <P>
 * @param <O>
 */
public class MAUDP_RLStEndDupChecker_MC<P extends MAUDP_RLBase, O extends MCCallerPanelBridge> extends MAUDP_RLUpdater<P, O> {

	public static final String ST_DT_COL = "st_dt";
	public static final String END_DT_COL = "end_dt";
	public static final String UPD_CNTR_COL = "upd_cntr";

	/**
	 * コンストラクタです。
	 *
	 * @param panel 画面
	 * @param operation オペレーション
	 */
	public MAUDP_RLStEndDupChecker_MC(P panel, O operation) {
		super(panel, operation);
	}

	@Override
	protected void checkStEndDtValid(MCMessageList ml) {
		String[] base_key = MAUCP_StEndUtil.getBaseKey((MAUDP_RLBase)_implRLPanel);
		checkStEndDtValidMain(base_key, ml);
	}
	
	protected void checkStEndDtValidMain(String[] base_key, MCMessageList ml) {
		MAUCP_StEndUtil.checkStEndDtValid(
				getPickedList(_implRLPanel.getDtlTable().getList()), 
				base_key, ml);
	}

	/**
	 * 補正実行確認メッセージを返します。
	 */
	@Override
	protected MCMessage msgExecConfirm() {
		return new MCMessage(MA_Msg.MAUDP0376);
	}
	
	@Override
	protected void showDownMsg() {
		MCMessageList msgList = getMessages();
		modDownMsg(msgList);
		
		panel.sortMessageList(msgList);
		if (msgList.size() > 0) {
			if (MA_Msg.MAUDL0380.equals(msgList.get(0).getID())) {
				panel.dialog(new MCMessage(MA_Msg.MAUDP0377));
			}
			else {
				MCMessage msg = msgEndWithMessages();
				if (msg != null) {
					msgList.add(0, msg);
				}
				panel.messageNoSort(msgList);
			}
		}
		else {
			panel.messageNoSort(msgList);	
		}
	}
	
	/**
	 * 正常終了したときのメッセージを加工する。
	 * @param msgList 加工されるメッセージリスト
	 */
	protected void modDownMsg(MCMessageList msgList) {


		MCColumnConfig[] bkcfgs = _implRLPanel.getColumnConfigs(
				_implRLPanel.getDtlTable(), 
				MAUCP_StEndUtil.getBaseKey((MAUDP_RLBase)_implRLPanel)
				);
		
		IdentityHashMap<MCRow, Boolean> modRows = new IdentityHashMap<MCRow, Boolean>();

		
		for (int i = 0 ; i < msgList.size() ; i++) {
			MCMessage m = msgList.get(i);
			MCRow cr = m.getCauseRow();
			if (MA_Msg.MAUDL0382.equals(m.getID())) {
				if (!modRows.containsKey(cr)){
					modRows.put(cr, null/*dummy*/);
					msgList.set(i, getNewDownMsg(MA_Msg.MAUDP0372, bkcfgs, m));
				}
				else {
					msgList.remove(i--);
				}	
			}
			else if (MA_Msg.MAUDL0381.equals(m.getID())) {
				if (!modRows.containsKey(cr)){
					modRows.put(cr, null/*dummy*/);
					msgList.set(i, getNewDownMsg(MA_Msg.MAUDP0373, bkcfgs, m));
				}
				else {
					msgList.remove(i--);
				}	
			}
			else if (MA_Msg.MAUDL0379.equals(m.getID())) {
				if (!modRows.containsKey(cr)){
					modRows.put(cr, null/*dummy*/);
					msgList.set(i, getNewDownMsg(MA_Msg.MAUDP0374, bkcfgs, m));
				}
				else {
					msgList.remove(i--);
				}
			}
		}
	}
	
	protected MCMessage getNewDownMsg(String id, MCColumnConfig[] bindc, MCMessage src) {

		MCRow cr = src.getCauseRow();

		return new MCMessage(
				cr, 
				src.getCauseColumn(), 
				id,
				getMsgForKeyInfo(cr, bindc));
	}
	
	public MCMessage msgEndWithMessages() {
		MCMessage m = msgEndHeader();
		if (m != null) {
			return new MCMessage(FX_Msg.FXBAP0031, m.toString());
		}
		return new MCMessage(FX_Msg.FXBAP0032);
	}
	
	protected MCMessage msgEndHeader() {
		return new MCMessage(MA_Msg.MAUDP0377);
	}
	
	@Override
	protected void showEndMsg() {
		panel.dialog(new MCMessage(MA_Msg.MAUDP0375));
	}

	@Override
	protected void addProgressPanel() {
		super.addProgressPanel();
		addProgressPanelMain();
	}
	
	@Override
	protected void show() {
		showReplace();
		
	}
	
	/**
	 * 上り電文に存在しないDtlのデータを下り電文に設定します。<p>
	 * GUIIndexの一致するコンテナのデータを設定します。
	 */
	@Override
	protected void showReplace() {
		setGUIIndexAtDownParam();
		MCContainer down = param().getContainerParam().down().get(0);
		String[] upc = getUpItemNames(0);
		String[] downc = down.getColumnPathArray();
		String[] exptUpc = MCCollectionUtil.remove(downc, 
				new String[0], upc);
		MCList<?> dtl = _implRLPanel.getDtlL();
		String[] keys = getKeyRemoveStdt(_implRLPanel.getDtlRKeyColumns());
		MCIndexKey idxkey = dtl.createIndex(keys);

		MCTimestamp ref = dtl.getRefTime();
		if (down instanceof MCList) {
			MCList<MCRow> dl = (MCList<MCRow>)down;
			for (int i = 0 ; i < dl.size() ; i++) {
				MCRow dr = dl.get(i);

				// ステータスがNONE以外ならば「選択」＝オン
				if (!dr.isStatusNone()){
					if (dr.contains(getCheckColumn())) {
						dr.setBoolean(getCheckColumn(), true);
					}
				}

				int dgi = dr.getGUIIndex();
				if (dgi >= 0) {
					MCRow sr = dtl.get(dgi);
					if (!dr.isStatusNone()){
						//足りないデータをテーブルのコンテナからコピー
						merge(dr, sr, exptUpc);
						
					}
					//messageのcauseRowを一致させるため、
					//テーブルのコンテナにdrの全データをコピーし、
					//コンテナを入れ替える
					merge(sr, dr, downc);
					dl.set(i, sr);
				}
				// 補正元のデータが手入力、かつ分割されたレコードの補完
				else if (dr.getNumber(UPD_CNTR_COL) == null
						// 既存行から分割されたデータと区別するため以下の条件が必要
						&& dr.getTimestamp("upd_ts") == null) {
					MCRow sr = getSrcRec(dr, dtl, idxkey, keys);
					if (sr != null) {
						// 足りないデータをテーブルのコンテナからコピー
						merge(dr, sr, exptUpc);
					}
				}
			}
		}
		down.setRefTime(ref);
		super.showReplace();
		MCTable t = _implRLPanel.getDtlTable();
		t.fillSpace();
	}

	/**
	 * 補正で分割されたレコードの元のレコードを返します。
	 */
	protected MCRow getSrcRec(MCRow destRow, MCList dtlL, MCIndexKey idxkey, String[] keys) {
		Comparable[] vals = new Comparable[keys.length];
		for(int j = 0; j < keys.length; j++) {
			vals[j] = destRow.getValue(keys[j]);
		}
		MCList<MCRow> srcL = (MCList<MCRow>)dtlL.subList(idxkey, vals);
		MCRow sr = srcL.getFirst(ST_DT_COL, destRow.getDate(ST_DT_COL));
		if (sr != null) {
			return sr;
		}
		sr = srcL.getFirst(END_DT_COL, destRow.getDate(END_DT_COL));
		if (sr != null) {
			return sr;
		}
		for (MCRow r : srcL) {
			if (destRow.getDate(ST_DT_COL).gte(r.getDate(ST_DT_COL))
					&& destRow.getDate(END_DT_COL).lte(r.getDate(END_DT_COL))) {
				return r;
			}
		}
		return sr;
	}

	/**
	 * 「st_dt」を除いたキー項目返します。
	 */
	protected String[] getKeyRemoveStdt(String[] keys) {
		String[] newKeys = new String[keys.length-1];
		int i = 0;
		for(String key : keys) {
			if(!key.endsWith(ST_DT_COL)) {
				newKeys[i++] = key;
			}
		}
		return newKeys;
	}

	@Override
	protected void moveFocusSub() {
		MCTable t = _implRLPanel.getDtlTable();
		MCList<MCRow> vl = t.getViewRows();
		if (vl.size() > 0) {
			MCRow r = vl.get(0);
			t.selectLeftmostColumn(r.getGUIIndex());
		}
		else {
			super.moveFocusSub();
		}
	}

	@Override
	protected void setModeSub() {
	}
	
	@Override
	protected void statusClear() {
		// 何もしない
	}

	protected MCMeta[] _itmMetas = {
		ITM_CD, ITM_SUB1, ITM_SUB2, ITM_SUB3
	};

	protected MCMeta[] geItmMetas() {
		return _itmMetas;
	}

	protected MCMeta[] _snoMetas = {
		SNO1, SNO2, SNO3, SNO4
	};

	protected MCMeta[] geSnoMetas() {
		return _snoMetas;
	}

	protected MCMeta[] _dtMetas = {
		DT
	};

	protected MCMeta[] geDtMeta() {
		return _dtMetas;
	}

	/**
	 * キー項目のメタが指定メタと同じ場合、<br>
	 * trueを返し、それ以外は、falseを返します。<br>
	 *
	 * @param metas 指定メタ
	 * @param keyMetas キー項目のメタ
	 * @return キー項目のメタが指定メタと同じ場合、true
	 */
	protected boolean isSameMeta(MCMeta[] metas, MCMeta[] keyMetas, int idx) {
		for (int i = 0; i < metas.length; i++) {
			if (!metas[i].metaEquals(keyMetas[idx++])) {
				return false;
			}
		}
		return true;
	}

	/**
	 * 整形したメッセージ用文字列を返す。
	 *
	 * @param row Rowコンテナ
	 * @param cols 表示カラム
	 * @return 整形したメッセージ用文字列
	 */
	protected String getMsgForKeyInfo(MCRow row, MCColumnConfig... cols) {

		int index = row.getGUIIndex();
		MCMeta[] metaName = new MCMeta[cols.length];
		for (int i = 0; i < cols.length; i++) {
			metaName[i] = row.getMeta(cols[i].getRowColumnName());
		}

		String binds = "";
		for (int i = 0; i < metaName.length;) {
			if (isSameMeta(geItmMetas(), metaName, i)) {
				binds = binds + MAC_STR.DISP_ITM_PREFIX.name() + " : " + toDispItm(
					isNull(cols[i].getValue(index)) ? null : cols[i].getValue(index).toString(),
					isNull(cols[i+1].getValue(index)) ? null : cols[i+1].getValue(index).toString(),
					isNull(cols[i+2].getValue(index)) ? null : cols[i+2].getValue(index).toString(),
					isNull(cols[i+3].getValue(index)) ? null : cols[i+3].getValue(index).toString(),
					panel);
				if (i+3 < metaName.length - 1) {
					binds = binds + MCStringUtil.LF_CODE;
				}
				i += geItmMetas().length;
			}
			else if (isSameMeta(geSnoMetas(), metaName, i)) {
				binds = binds + MAC_STR.DISP_SNO_PREFIX.name() + " : " + toDispSno(
					isNull(cols[i].getValue(index)) ? null : cols[i].getValue(index).toString(),
					isNull(cols[i+1].getValue(index)) ? null : cols[i+1].getValue(index).toString(),
					isNull(cols[i+2].getValue(index)) ? null : cols[i+2].getValue(index).toString(),
					isNull(cols[i+3].getValue(index)) ? null : cols[i+3].getValue(index).toString(),
					panel);
				if (i+3 < metaName.length - 1) {
					binds = binds + MCStringUtil.LF_CODE;
				}
				i += geSnoMetas().length;
			}
			else if (isSameMeta(geDtMeta(), metaName, i)) {
				binds = binds + cols[i].getMessageByLocale() + " : " +
					toYMDString((MCCalendarDate<?>)cols[i].getValue(index));
				if (i < metaName.length - 1) {
					binds = binds + MCStringUtil.LF_CODE;
				}
				i++;
			}
			else {
				binds = binds +
					_implRLPanel.toStringWithMsgLabelNoArray(index, cols[i]);
				i++;
			}
		}
		return binds;
	}

}

