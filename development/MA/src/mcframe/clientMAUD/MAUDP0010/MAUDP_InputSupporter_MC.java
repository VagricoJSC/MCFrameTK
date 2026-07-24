package mcframe.clientMAUD.MAUDP0010;

import java.awt.Component;

import mcframe.clientCore.beans.message.MCDialogButton;
import mcframe.clientCore.beans.*;
import mcframe.clientCore.beans.table.MCTable;
import mcframe.commonCore.container.MCContainer;
import mcframe.commonCore.container.MCList;
import mcframe.commonCore.notice.MCMessage;
import mcframe.commonCore.notice.MCMessageList;
import static mcframe.commonFX.notice.FX_Msg.*;

public class MAUDP_InputSupporter_MC<P extends MAUDP_PanelBase, O extends MCCallerPanelBridge> extends MAUDP_Caller<P, O> {
	/**
	 * コンストラクタです。
	 *
	 * @param panel 画面
	 * @param operation オペレーション
	 */
	public MAUDP_InputSupporter_MC(P panel, O operation) {
		super(panel, operation);
	}
	
	// ///////////////////////////////////////////////
	// 入力支援用の実装（ここから）
	// ///////////////////////////////////////////////

	@Override
	protected void addProgressPanel() {
		super.addProgressPanelMain();
	}
	
	@Override
	protected int getProgressType() {
		return MCMessageBox.CANCEL_DIALOG;
	}
	
	@Override
	protected boolean beforeExecMain() {
		initCaller();
		if (!execConfirm()) {
			return false;
		}
		if (!checkForCall()) {
			return false;
		}
		setupParam();
		beforeCall();
		if (!checkLimitULSize() || !checkInvisibleRowInUpParam()) {
			return false;
		}
		return true;
	}
	
	@Override
	protected void initCaller() {
		super.initCaller();
		
		setScreenAsync(true);
	}
	
	/**
	 * 処理を実行するかどうか確認します。
	 */
	protected boolean execConfirm() {
		MCMessage msg = msgExecConfirm();
		return msg == null ? true : (confirm(msg) == MCMessageBox.YES_OPTION);
	}

	/**
	 * 処理の実行を確認するメッセージを取得します。
	 */
	protected MCMessage msgExecConfirm() {
		return null;
	}
	
	protected static final String MAUDP_InputSupporter = "MAUDP_InputSupporter";
	
	/**
	 * 確認ダイアログを表示します。
	 */
	protected int confirm(MCMessage msg) {
		MCDialogButton btn = panel.getConfirmFocus(msg);
		if (btn == null) {
			btn = panel.getConfirmFocus(MAUDP_InputSupporter);
		}
		return panel.confirm(btn, msg);
	}
	
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
	protected boolean checkForCall() {
		if (panel instanceof IfListRegPanel) {
			IfListRegPanel p = (IfListRegPanel)panel;
			if (!checkCheckedRowSize(p)) {
				return false;
			}
		}

		return super.checkForCall();
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
	@SuppressWarnings("unchecked")
	// unchecked : exceptEmptyの引数キャスト
	protected void checkReq(MCMessageList msgList) {
		IfListRegPanel p = null;
		if (panel instanceof IfListRegPanel) {
			p = (IfListRegPanel)panel;
		}

		for (MCContainer c : getAllUpBlocks()) {
			if (p != null && c == p.getListRegTable().getList()) {
				msgList.addAll(panel.checkReq(getCheckedRows(p)));
				continue;
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
					msgList.addAll(panel.checkReq((cpp
							.exceptDeleteAndViewEmpty(table))));
				}
				else {
					msgList.addAll(panel.checkReq((panel
							.exceptDeleteAndEmpty((MCList) c))));
				}
			}
			else {
				msgList.addAll(panel.checkReq(c));
			}
		}
	}

	@Override
	protected void show() {
		showMerge();
	}

	@Override
	protected MCCallBackType callPanelUpdateAction() {
		show();
		setMode();
		// MAUDP_InputSupporterではadjustListを実行する
		adjustList();
		moveFocus();
		showMsg();
		print();
		resultSuccess();
		return MCCallBackType.SUCCESS;
	}
	
	/**
	 * サーバ処理後にテーブルの列幅調整をするためのメソッドです。
	 * <p>
	 * デフォルトでは何もしません。
	 * テーブルの列幅調整をする場合は、このメソッドをオーバーライドして実装してください。
	 */
	@Override
	protected void adjustList() {
		
	}
	
	// ///////////////////////////////////////////////
	// 入力支援用の実装（ここまで）
	// ///////////////////////////////////////////////
	
}
