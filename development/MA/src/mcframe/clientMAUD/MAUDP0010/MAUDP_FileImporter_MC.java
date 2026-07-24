package mcframe.clientMAUD.MAUDP0010;

import mcframe.clientCore.beans.*;
import mcframe.commonCore.notice.MCAppException;
import mcframe.commonCore.notice.MCException;
import mcframe.commonCore.notice.MCMessage;
import mcframe.commonCore.notice.MCMessageLevel;
import mcframe.commonCore.notice.MCMessageList;
import mcframe.commonCore.container.*;


public class MAUDP_FileImporter_MC<P extends MAUDP_PanelBase, O extends MCCallerPanelBridge>
		extends MAUDP_Caller<P, O> {
	/**
	 * コンストラクタです。
	 *
	 * @param panel 画面
	 * @param operation オペレーション
	 */
	public MAUDP_FileImporter_MC(P panel, O operation) {
		super(panel, operation);
	}

	@Override
	protected void addProgressPanel() {
		super.addProgressPanelMain();
	}

	@Override
	protected int getProgressType() {
		return MCMessageBox.CANCEL_DIALOG;
	}

	@Override
	protected void initCaller() {
		super.initCaller();

		setScreenAsync(true);

		// チェックカラムをマージ対象とする
		if (panel instanceof IfListRegPanel) {
			addDownItemNames(0, ((IfListRegPanel)panel).getCheckColumn());
		}
	}

	@Override
	protected MCCallBackType callPanelUpdateAction() {
		show();
		setMode();
		adjustList();
		moveFocus();
		showMsg();
		print();
		resultSuccess();
		return MCCallBackType.SUCCESS;
	}

	@Override
	protected MCCallBackType callCanceledAction() {
		setModeNoDown();
		moveFocusNoDown();
		return MCCallBackType.SUCCESS;
	}

	@Override
	protected boolean checkForCall() {
		// ファイル入力時はサーバ側でチェックするため、画面側ではチェックしない
		return true;
	}

	/**
	 * チェック結果が存在しない場合のモード設定
	 */
	protected void setModeNoDown() {

	}

	/**
	 * チェック結果が存在しない場合のフォーカス設定
	 */
	protected void moveFocusNoDown() {

	}

	@Override
	protected void handleMCEx(MCException ex) {
		setModeMCEx(ex);
		setFocusMCEx(ex);
		if (isAddFailedMsg(ex)) {
			throw addFailedMsg(ex);
		}
		throw ex;
	}

	/**
	 * 通信処理で例外が発生した場合のモード設定
	 */
	protected void setModeMCEx(MCException ex) {
		setModeNoDown();
	}

	/**
	 * 通信処理で例外が発生した場合のフォーカス設定
	 */
	protected void setFocusMCEx(MCException ex) {
		moveFocusNoDown();
	}

	/**
	 * メッセージの先頭にチェック失敗メッセージ（ {@link #msgFailed()} ）を追加するかどうかを判断する。
	 * メッセージを追加する場合は true を返す。
	 */
	protected boolean isAddFailedMsg(MCException ex) {
		if (MCMessageLevel.WARN != ex.getLevel()) {
			return false;
		}
		if (isOperationMightBeSuccess(ex)) {
			return false;
		}

		MCMessageList l = ex.getCauseMessageList();
		if (l != null && l.size() > 0) {
			return false;
		}
		return true;
	}

	/**
	 * メッセージの先頭にチェック失敗メッセージ（ {@link #msgFailed()} ）を追加する。<p>
	 * 登録失敗メッセージの例外を新たに作成し、指定された例外のメッセージを
	 * {@link MCException#addCauseMessage(MCMessage)} で追加する。<p>
	 * <font color="red">
	 * このメソッドを利用した場合は、指定された例外が保持している、
	 * メッセージ（ {@link MCException#getMCMessage()} ）
	 * 以外の情報は破棄されるため、注意してください。
	 * </font>
	 */
	protected MCException addFailedMsg(MCException ex) {
		MCException e;
		if (ex instanceof MCAppException) {
			e = new MCAppException(ex, msgFailed());
		}
		else {
			e = new MCException(ex, msgFailed());
		}
		e.addCauseMessage(ex.getMCMessage());
		return e;
	}

	@Override
	protected void show() {
		// 画面のRowの値をクリアし、下り電文のRowの値で置き換える
		// showReplaceと異なり、Rowのインスタンスは変更しない
		if (!isAsync()) {
			clearDownBlocksRow();
			showMerge();
		}
	}

	/**
	 * {@link #getDownBlocks()} のRowの値をクリアします。
	 */
	protected void clearDownBlocksRow() {
		for (MCContainer down : getDownBlocks()) {
			if (down instanceof MCRow) {
				down.clear();
			}
			else if (down instanceof MCList) {
				MCList list = (MCList) down;
				for (int i = 0; i < list.size(); i++) {
					list.get(i).clear();
				}
			}
		}
	}

	public MCMessageList getParamMessage() {
		return bridge.getParamMessage();
	}

	protected final String _sort_tmp_col = "_MAUDP0010_sort_tmp_col";

	@Override
	protected void afterCall() {
		setGUIIndexAtDownParam();
		super.afterCall();
		for (MCContainer c : getDownParams()) {
			if (c instanceof MCList) {
				MCList l = (MCList)c;
				for (int i = 0; i < l.size(); i++) {
					MCRow r = l.get(i);
					r.setNumberNE(_sort_tmp_col, r.getGUIIndex());
				}
				l.sort(_sort_tmp_col);
			}
		}
	}

	@Override
	protected void showEndMsg() {
		panel.dialog(msgFileImported());
	}

	/**
	 * チェックできなかったときのメッセージ
	 */
	public MCMessage msgFailed() {
		return panel.msgFileImportFailed();
	}

	/**
	 * 処理が終了したときのメッセージ
	 */
	public MCMessage msgFileImported() {
		return panel.msgFileImported();
	}

}
