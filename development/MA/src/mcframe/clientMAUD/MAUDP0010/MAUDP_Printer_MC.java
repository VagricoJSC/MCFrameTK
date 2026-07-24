package mcframe.clientMAUD.MAUDP0010;

import static mcframe.commonMA.notice.MA_Msg.*;
import static mcframe.commonFX.notice.FX_Msg.*;

import java.util.ArrayList;
import java.util.List;

import mcframe.clientCore.beans.MCCallerPanelBridge;
import mcframe.clientCore.beans.MCMessageBox;
import mcframe.clientCore.beans.message.MCDialogButton;
import mcframe.clientFXBA.FXBAP0010.FXBAP_Printer;
import mcframe.commonCore.container.MCContainer;
import mcframe.commonCore.container.MCList;
import mcframe.commonCore.container.MCRow;
import mcframe.commonCore.notice.MCMessage;
import mcframe.commonCore.notice.MCMessageList;

public class MAUDP_Printer_MC<P extends MAUDP_PanelBase, O extends MCCallerPanelBridge> extends
	FXBAP_Printer<P, O> {
	/**
	 * コンストラクタです。
	 *
	 * @param panel 画面
	 * @param operation オペレーション
	 */
	public MAUDP_Printer_MC(P panel, O operation) {
		super(panel, operation);
	}

	@Override
	protected boolean checkForCall() {
		MCList list = getCheckedRowsContainer();
		if (list != null) {
			if (!checkCheckedRowSize(list)) {
				return false;
			}
		}
		
		if (!super.checkForCall()) {
			return false;
		}
		return confirmForCall();		
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
			btn = panel.getConfirmFocus(FXBAP_Printer);
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
	
	protected boolean _checkedRowMode = false;
	
	/**
	 * 画面が  {@link IfListRegPanel} ではない場合に利用します。
	 * <p>
	 * チェックカラムで対象行を選択する場合は true を設定します。
	 * このメソッドで true を設定する場合は、以下の全ての条件に該当している必要があります。
	 * <ul>
	 * <li>チェックカラムのカラム名が"check"である。</li>
	 * <li>対象行を選択するリストの上り電文ブロックのブロック番号が"0"である。</li>
	 * </ul>
	 * 
	 * @param mode チェックカラムで対象行を選択する場合は true
	 */
	public void setCheckedRowMode(boolean mode) {
		_checkedRowMode = mode;
	}
	
	/**
	 * チェックカラムで対象行を選択するリストを返します。
	 * 
	 * @return チェックカラムで対象行を選択するリスト。リストが見つからなかった場合は null。
	 */
	protected MCList getCheckedRowsContainer() {
		if (panel instanceof IfListRegPanel) {
			return ((IfListRegPanel)panel).getListRegTable().getList();
		}
		else if (_checkedRowMode) {
			return (MCList) getAllUpBlocks().get(0);
		}
		return null;
	}
	
	@Override
	protected void checkReq(MCMessageList msgList) {
		MCList list = getCheckedRowsContainer();
		if (list == null) {
			super.checkReq(msgList);
			return;
		}
		for (MCContainer cont : getAllUpBlocks()) {
			if (cont == list) {
				msgList.addAll(panel.checkReq(getCheckedRows(list)));
			}
			else {
				super.checkReq(msgList, cont);
			}
		}
	}
	
	@Override
	protected void setupUpParam() {
		MCList list = getCheckedRowsContainer();
		if (list == null) {
			super.setupUpParam();
			return;
		}
		for (MCContainer cont : getUpBlocks()) {
			if (cont == list) {
				param().addUpBlock(getCheckedRows(list));
			}
			else {
				super.setupUpParam(cont);
			}
		}
	}
		
	@Override
	protected boolean isUpBlockStatusNone() {
		MCList list = getCheckedRowsContainer();
		if (list == null) {
			return super.isUpBlockStatusNone();
		}
		List<MCContainer> conts = new ArrayList<>();
		for (MCContainer cont : getUpBlocks()) {
			if (cont == list) {
				conts.add(getCheckedRows(list));
			}
			else {
				conts.add(cont);
			}
		}
		return panel.isStatusNone(conts);
	}
	
	/**
	 * 対象データ存在チェック。対象が無ければエラーメッセージを表示。
	 */
	protected boolean checkCheckedRowSize(MCList list) {
		if (getCheckedRows(list).isEmpty()) {
			panel.dialog(new MCMessage(FXBAP0038));
			return false;
		}
		return true;
	}

	protected MCList getCheckedRows(MCList list) {
		return list.subList("check", true);
	}
	
	@Override
	public MCMessage msgPrintedWithMessages() {
		if (panel instanceof IfListRegPanel || _checkedRowMode) {
			return new MCMessage(FXBAP0032);
		}
		return super.msgPrintedWithMessages();
	}

	@Override
	protected void afterCall() {
		setGUIIndexAtDownParam();
		super.afterCall();
	}
	
	public MCMessageList getParamMessage() {
		return bridge.getParamMessage();
	}

	// ///////////////////////////////////////////////
	// 一覧登録画面の実装（ここから）
	// ///////////////////////////////////////////////

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
		String baseCol = realCol.substring(0, realCol.lastIndexOf("."));
		
		return new String[]{"rtn_sts_typ", baseCol + ".rtn_sts_typ_nm", baseCol + ".msg_id", baseCol + ".msg"};
	}

	// ///////////////////////////////////////////////
	// 一覧登録画面の実装（ここまで）
	// ///////////////////////////////////////////////
	
}
