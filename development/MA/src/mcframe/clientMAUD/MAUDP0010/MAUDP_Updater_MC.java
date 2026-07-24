package mcframe.clientMAUD.MAUDP0010;

import java.awt.Component;
import java.util.ArrayList;
import java.util.List;

import mcframe.clientCore.beans.message.MCDialogButton;
import mcframe.clientCore.beans.*;
import mcframe.clientCore.beans.table.MCTable;
import mcframe.clientFXBA.FXBAP0010.FXBAP_Updater;
import mcframe.commonCore.container.MCContainer;
import mcframe.commonCore.container.MCList;
import mcframe.commonCore.container.MCRow;
import mcframe.commonCore.notice.MCMessage;
import mcframe.commonCore.notice.MCMessageList;
import static mcframe.commonMA.notice.MA_Msg.*;
import static mcframe.commonFX.notice.FX_Msg.*;
import static mcframe.clientMAUC.MAUCP0010.MAUCP_MCDataUtil.*;

public class MAUDP_Updater_MC<P extends MAUDP_PanelBase, O extends MCCallerPanelBridge> extends FXBAP_Updater<P, O> {
	/**
	 * コンストラクタです。
	 *
	 * @param panel 画面
	 * @param operation オペレーション
	 */
	public MAUDP_Updater_MC(P panel, O operation) {
		super(panel, operation);
	}

	// マルチメッセージの確認ダイアログ（入力値チェック）（ここから）
	protected boolean confirmForCall() {
		MCMessageList msgList = new MCMessageList();
		confirmForCallStack(msgList);
		if (msgList.size() == 0) {
			return true;
		}

		if (confirm(msgList) == MCMessageBox.YES_OPTION) {
			return true;
		}
		return false;
	}

	public int confirm(MCMessageList msgList) {
		MCMessage h_msg = msgConfirmHeader();
		MCDialogButton btn = panel.getConfirmFocus(h_msg);
		if (btn == null) {
			btn = panel.getConfirmFocus(FXBAP_Updater);
		}
		MCMessageList newMsgList = new MCMessageList();
		newMsgList.add(h_msg);
		panel.sortMessageList(msgList);
		newMsgList.addAll(msgList);
		return panel.confirm(btn, newMsgList);
	}

	/**
	 * {@link #confirm(MCMessageList)}で使用する、メッセージリストの先頭に
	 * 追加するメッセージ。
	 *
	 */
	protected MCMessage msgConfirmHeader() {
		MCMessage h_msg = new MCMessage(MAUDP0093);
		return h_msg;
	}

	protected void confirmForCallStack(MCMessageList msgList) {
	}
	// マルチメッセージの確認ダイアログ（入力値チェック）（ここまで）

	@Override
	protected void checkReq(MCMessageList msgList) {
		for (MCContainer c : getAllUpBlocks()) {
			checkReqSub(msgList, c);
		}
	}
	
	@SuppressWarnings("unchecked")
	// unchecked : exceptEmptyの引数キャスト
	protected void checkReqSub(MCMessageList msgList, MCContainer c) {
		if (panel instanceof IfListRegPanel) {
			if (((IfListRegPanel) panel).getListRegTable().getList() == c) {
				msgList.addAll(panel.checkReq(getCheckedRows((IfListRegPanel) panel)));
				return;
			}
		}
		// NULL文字対応のため、テーブルに配置されている
		// 何もデータが登録されていない状態のMCRowがisEmptyがtrueでない
		// 場合があるので、exceptViewEmpty で対象を選別している
		if (c instanceof MCList) {
			MCList list = (MCList) c;
			Component compo = panel.getComponent(list);
			if (panel instanceof MAUDP_PanelBase && compo instanceof MCTable) {
				MCTable table = (MCTable) compo;
				MAUDP_PanelBase cpp = (MAUDP_PanelBase) panel;
				msgList.addAll(panel.checkReq((cpp.exceptDeleteAndViewEmpty(table))));
			}
			else {
				msgList.addAll(panel.checkReq((panel.exceptDeleteAndEmpty((MCList) c))));
			}
		}
		else {
			msgList.addAll(panel.checkReq(c));
		}
	}

	public MCMessageList getParamMessage() {
		return bridge.getParamMessage();
	}

	@Override
	protected void afterCall() {
		setGUIIndexAtDownParam();
		super.afterCall();
	}

	// ///////////////////////////////////////////////
	// 一覧登録画面の実装（ここから）
	// ///////////////////////////////////////////////
	@Override
	protected void setupUpParam() {
		if (panel instanceof IfListRegPanel) {
			IfListRegPanel p = (IfListRegPanel)panel;
			for (MCContainer c : getUpBlocks()) {
				if (c == p.getListRegTable().getList()) {
					param().addUpBlock(getCheckedRows(p));
					continue;
				}
				if (c instanceof MCList) {
					param().addUpBlock(panel.exceptEmpty((MCList<?>) c));
				}
				else {
					param().addUpBlock(c);
				}
			}
		}
		else {
			for (MCContainer c : getUpBlocks()) {
				if (c instanceof MCList) {
					param().addUpBlock(panel.exceptEmpty((MCList) c));
				}
				else {
					param().addUpBlock(c);
				}
			}
		}
	}

	@Override
	protected boolean isUpBlockStatusNone() {
		if (panel instanceof IfListRegPanel) {
			List<MCContainer> l = new ArrayList<MCContainer>();

			IfListRegPanel p = (IfListRegPanel)panel;
			for (MCContainer c : getUpBlocks()) {
				if (c == p.getListRegTable().getList()) {
					l.add(getCheckedRows(p));
				}
				else {
					l.add(c);
				}
			}
			return panel.isStatusNone(l);
		}
		else if (panel instanceof IfOpePanel) {
			// 単票の場合は常にfalse（明細順番入れ替えただけでも登録できるようにするため）
			return false;
		}
		else {
			return super.isUpBlockStatusNone();
		}
	}

	@Override
	protected boolean checkForCall() {
		if (panel instanceof IfListRegPanel) {
			IfListRegPanel p = (IfListRegPanel)panel;
			if (!checkCheckedRowSize(p)) {
				return false;
			}
		}

		if (!super.checkForCall()) {
			return false;
		}
		return confirmForCall();
	}

	/**
	 * 対象データ存在チェック。対象が無ければエラーメッセージを表示。
	 */
	protected boolean checkCheckedRowSize(IfListRegPanel p) {
		if (getCheckedRows(p).isEmpty()) {
			panel.dialog(new MCMessage(FXBAP0038));
			return false;
		}
		return true;
	}

	protected MCList getCheckedRows(IfListRegPanel p) {
		return p.getListRegTable().getList().subList(p.getCheckColumn(), true);
	}

	@Override
	public MCMessage msgUpdatedWithMessages() {
		if (panel instanceof IfListRegPanel) {
			return new MCMessage(FXBAP0032);
		}
		return super.msgUpdatedWithMessages();
	}


	@Override
	protected void merge(MCRow dest, MCRow src, String... cols) {
		// 一覧登録訂正画面では、エラー行の処理結果区分以外の処理結果（サーバで発版されたＮＯなど）をマージしない
		// M7からは更新後にエラーのあった行のみ編集可能にしており、マージするとクライアントの入力制御などがおかしくなるため
		if (panel instanceof IfListRegPanel) {
			if (src.contains("rtn_sts_typ")
					&& mcframe.commonMA.constant.MAC_RTN_STS_TYP.isERR(src.getString("rtn_sts_typ"))) {
				super.merge(dest, src, getMergeColsWhenRtnStsErr(src));
			}
			else {
				super.merge(dest, src, cols);
			}
		}
		else {
			super.merge(dest, src, cols);
		}
	}
	
	/**
	 * 処理結果状況区分がエラーのときにマージするカラムの配列を返します。
	 * 
	 * @return 処理結果状況区分がエラーのときにマージするカラムの配列
	 */
	protected String[] getMergeColsWhenRtnStsErr(MCRow src) {
		String realCol = src.getRealColumnPath("rtn_sts_typ");
		int lastDotIndex = realCol.lastIndexOf(".");
		if (lastDotIndex == -1) {
			// 処理結果状況区分が部品ではない場合
			return new String[]{"rtn_sts_typ"};
		}
		String baseCol = realCol.substring(0, lastDotIndex);
		
		return new String[]{"rtn_sts_typ", baseCol + ".rtn_sts_typ_nm", baseCol + ".msg_id", baseCol + ".msg"};
	}

	// ///////////////////////////////////////////////
	// 一覧登録画面の実装（ここまで）
	// ///////////////////////////////////////////////

	// ///////////////////////////////////////////////
	// 操作種別画面の実装（ここから）
	// ///////////////////////////////////////////////
	@Override
	protected void setMode() {
		super.setMode();
		if (panel instanceof IfOpePanel) {
			IfOpePanel p = (IfOpePanel)panel;
			String ope = p.getOpeButtonGroup().getSelectedButton().getActionCommand();
			if (p.isINSOpe(ope)) {
				p.setFIX_IStatus();
			}
			else if (p.isUPDOpe(ope)) {
				p.setFIX_UStatus();
			}
		}
	}

	// ///////////////////////////////////////////////
	// 操作種別画面の実装（ここまで）
	// ///////////////////////////////////////////////
	
	// ///////////////////////////////////////////////
	// ファイル入力の実装（ここから）
	// ///////////////////////////////////////////////
		
	public MCTable getFileImpTable() {
		return null;
	}

	// ///////////////////////////////////////////////
	// ファイル入力の実装（ここまで）
	// ///////////////////////////////////////////////
		
}

