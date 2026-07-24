package mcframe.clientMAUD.MAUDP0030;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import mcframe.clientCore.beans.*;
import mcframe.clientCore.beans.table.*;
import mcframe.clientCore.container.MCConstRow;
import mcframe.commonCore.container.MCContainer;
import mcframe.commonCore.container.MCRow;
import mcframe.commonCore.container.MCList;
import mcframe.commonCore.notice.*;
import mcframe.clientFXBA.FXBAP0050.FXBAP_RLUpdater;
import static mcframe.commonFX.notice.FX_Msg.*;
import static mcframe.clientMAUC.MAUCP0010.MAUCP_MCDataUtil.*;
import static mcframe.commonMA.notice.MA_Msg.*;

public class MAUDP_RLUpdater_MC<P extends MAUDP_RLBase, O extends MCCallerPanelBridge>
		extends FXBAP_RLUpdater<P, O> {

	/**
	 * modMsgで重複チェックに用いるメッセージリスト（キー重複用）
	 */
	protected ArrayList<String> _msgArr ;
	
	/**
	 * コンストラクタです。
	 * 
	 * @param panel 画面
	 * @param operation オペレーション
	 */
	public MAUDP_RLUpdater_MC(P panel, O operation) {
		super(panel, operation);
	}

	/**
	 * サーバー処理で例外が発生した場合の、処理を行う。 特に理由がない限り、例外をthrowする。
	 * 
	 * @param ex
	 */
	@Override
	protected void handleMCEx(MCException ex) {

		_msgArr = new ArrayList<String>();

		if (isSame(ex.getID(), FXBAL0012)) {
			MCMessageList am = new MCMessageList();

			String[] c = _implRLPanel.getDtlRKeyColumns();
			String[] bc = _implRLPanel.getBeforeKeyColumns(c);
			MCColumnConfig[] cs = _implRLPanel.getColumnConfigs(_implRLPanel
					.getDtlTable(), c);
			MCColumnConfig[] bcs = _implRLPanel.getColumnConfigs(_implRLPanel
					.getDtlTable(), bc);
			
			for (MCMessage m : ex.getCauseMessageList()) {
				
				modMsg(m, am, cs, bcs);
			}
			if (0 < am.size()) {
				MCAppException ae = new MCAppException(MAUDP0012);
				ae.addCauseMessageList(am);
				throw ae;
			}
		}
		throw ex;
	}

	/**
	 * サーバー処理で例外が発生した場合のメッセージ加工を行う。
	 * @param m メッセージ
	 * @param am メッセージリスト
	 * @param cs キーカラムリスト
	 * @param bcs 変更前キーカラムリスト
	 */ 
	protected void modMsg(MCMessage m, MCMessageList am, MCColumnConfig[] cs, MCColumnConfig[] bcs) {
		if (isSame(m.getID(), FXBAL0013)) {
			MCMessage nm = getMsgForMain(null, MAUDP0013, m, cs, _msgArr);
			if (nm != null) {
				am.add(nm);
			}
		}
		else if (isSame(m.getID(), FXBAL0014)) {
			MCMessage nm = getMsgForOther(null, MAUDP0014, m, cs, bcs, _msgArr);
			if (nm != null) {
				am.add(nm);
			}
		}
		else {
			MCMessage nm = chkDupMsg(m, _msgArr);
			if (nm != null) {
				am.add(nm);
			}
		}
	}
	
	/** 
	 * OTHER サブオペレーションの MCMessage を作成します。 <p>
	 *  return メッセージまたはnull
	 */
	protected MCMessage getMsgForOther(String causeColumn, String msgId,
			MCMessage logicMsg, MCColumnConfig[] cs, MCColumnConfig[] bcs,
			ArrayList<String> msgArr) {
		MCConstRow cr = (MCConstRow) logicMsg.getCauseRow();

		/* ロケールにあったテーブル名をb1に格納 */
		String tableName = logicMsg.getBind(1);
		String b1 = getTableLocaleName(tableName);

		/*
		 * キー項目と値の文字列をb2に格納 ステータスＭＯＤＩＦＹの場合は変更前の項目名と値
		 */
		if (cr.isStatusModify()) {
			cs = bcs;
		}
		String b2 = _implRLPanel.toStringWithMsgLabelNoArray(cr.getGUIIndex(), cs);

		return getNewMsg(msgArr, cr, causeColumn, msgId, b1, b2);
	}

	/** 
	 * 重複したメッセージが表示されないようにしてメッセージを生成する処理を行います。<p>
	 * 一致条件は　[GUIIndex] + [causeColumn] + [msgId] + [binds]　です。<br>
	 */
	protected MCMessage getNewMsg(ArrayList<String> msgArr, MCConstRow cr,
			String causeColumn, String msgId, String... binds) {

		StringBuilder sb = new StringBuilder();

		if(cr != null) {
			sb.append(cr.getGUIIndex());
		}
		sb.append(causeColumn);

		sb.append(msgId);
		
		for (String b : binds) {
			sb.append(b);
		}
		
		String key = sb.toString();
		
		if (!msgArr.contains(key)) {
			MCMessage nm = new MCMessage(cr, causeColumn, msgId, (Object[]) binds);
			msgArr.add(key);
			return nm;
		}

		return null;
	}

	/** 
	 * 重複したメッセージが存在しないかをチェックし、重複が無い場合にのみ
	 * メッセージをそのまま返します。<p>
	 * 一致条件は　[guiIndex] + [causeColumn] + [msgId] + [binds]　です。<br>
	 */
	protected MCMessage chkDupMsg(MCMessage m, ArrayList<String> msgArr) {

		StringBuilder sb = new StringBuilder();
		if(m.getCauseRow() != null) {
			sb.append(m.getCauseRow().getGUIIndex());
		}
		sb.append(m.getCauseColumn());
		sb.append(m.getID());
		
		String[] binds = m.getBindArray();
		for (String b : binds) {
			sb.append(b);
		}

		String key = sb.toString();
		if (!msgArr.contains(key)) {
			msgArr.add(key);
			return m;
		}

		return null;
	}
	
	/** MAIN サブオペレーションの MCMessage を作成します。 */
	protected MCMessage getMsgForMain(String causeColumn, String msgId,
			MCMessage logicMsg, MCColumnConfig[] cs, ArrayList<String> msgArr) {
		MCConstRow cr = (MCConstRow) logicMsg.getCauseRow();

		/* キー項目と値の文字列をb1に格納 */
		String b1 = _implRLPanel.toStringWithMsgLabelNoArray(cr.getGUIIndex(), cs);

		return getNewMsg(msgArr, cr, causeColumn, msgId, b1);

	}

	/**テーブルのオブジェクト名からロケールに対応したテーブル名を取得します。<p>
	 * @param tableName テーブルオブジェクト名
	 * @return ロケールに対応したテーブル名 または テーブルオブジェクト名
	 */
	protected String getTableLocaleName(String tableName) {
		String t = panel.getDBLabel(tableName, null);
		if (t != null) {
			return t;
		}
		return tableName;
	}

	@Override
	protected void statusClear() {
		super.statusClear();

		if (_implRLPanel.getDtlTable() != null) {
			_implRLPanel.getDtlTable().getList().setStatus(MCRow.NONE);
		}
	}

	@Override
	protected boolean checkForCall() {
		setPickedListMap();

		return super.checkForCall();
	}

	@Override
	protected boolean isUpBlockStatusNone() {
		List<MCContainer> l = new ArrayList<MCContainer>();
		int pickedCnt = 0;
		for (MCContainer c : getAllUpBlocks()) {
			if (c instanceof MCList && isCheckList(c)) {
				pickedCnt = pickedCnt + getPickedList(c).size();
			}
			else {
				l.add(c);
			}
		}
		return panel.isStatusNone(l) && pickedCnt == 0;
	}

	@Override
	protected void setupUpParam() {
		for (MCContainer c : getUpBlocks()) {
			if (c instanceof MCList) {
				if (isCheckList(c)) {
					param().addUpBlock(getPickedList(c));
				}
				else {
					param().addUpBlock(panel.exceptEmpty((MCList<?>) c));
				}
			}
			else {
				param().addUpBlock(c);
			}
		}
	}

	@Override
	protected void checkReq(MCMessageList msgList) {
		for (MCContainer c : getAllUpBlocks()) {
			if (c instanceof MCList) {
				if (isCheckList(c)) {
					msgList.addAll(panel.checkReq(getPickedList(c)));
				}
				else {
					msgList.addAll(panel.checkReq((panel
							.exceptDeleteAndEmpty((MCList<?>) c))));
				}
			}
			else {
				msgList.addAll(panel.checkReq(c));
			}
		}
	}

	/**
	 * 指定のコンテナが「選択（check）」項目を持っているかチェック
	 */
	protected boolean isCheckList(MCContainer c) {
		return Arrays.asList(c.getNameArray()).contains(getCheckColumn());
	}

	/**
	 * 「チェック」のカラム名（デフォルトは"check"。）
	 */
	protected String getCheckColumn() {
		return panel.getCheckColumn();
	}

	protected int getUpBlockIndex(MCContainer c) {
		for (int i = 0; i < getUpBlocks().size(); i++) {
			if (getUpBlocks().get(i) == c) {
				return i;
			}
		}
		return -1;
	}

	/**　対象データ格納用 */
	private Map<Integer, MCList<? extends MCConstRow>> _pickedListMap;

	protected MCList<? extends MCConstRow> getPickedList(MCContainer c) {
		return _pickedListMap.get(getUpBlockIndex(c));
	}

	public MCList<? extends MCConstRow> getPickedRows(int i) {
		MCList<? extends MCConstRow> l = (MCList<? extends MCConstRow>) getUpBlocks().get(i);
		return l.subList(getCheckColumn(), true);
	}

	/**
	 * 「選択（check）」項目を持っているテーブルについて、選択されている行をマップに保持する。
	 */
	protected void setPickedListMap() {
		int i = 0;
		for (MCContainer c : getUpBlocks()) {
			if (c instanceof MCList) {
				if (isCheckList(c)) {
					setPickedListMap(c, i);
				}
			}
			i++;
		}
	}
	
	protected void setPickedListMap(MCContainer c, int i) {
		if (_pickedListMap == null) {
			_pickedListMap = new LinkedHashMap<Integer, MCList<? extends MCConstRow>>();
		}
		_pickedListMap.put(i, getPickedRows(i));
	}

}

