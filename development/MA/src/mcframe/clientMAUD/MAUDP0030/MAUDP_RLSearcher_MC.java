package mcframe.clientMAUD.MAUDP0030;

import java.util.List;

import mcframe.clientCore.beans.*;
import mcframe.commonCore.notice.MCException;
import mcframe.commonCore.notice.MCLog;
import mcframe.commonCore.container.MCContainer;
import mcframe.commonCore.notice.MCMessageList;
import mcframe.clientFXBA.FXBAP0050.FXBAP_RLSearcher;
import mcframe.clientFXBA.FXBAP0010.IfHPartsForCaller;
import mcframe.clientFXBA.FXBAP0010.IfDPartsForCaller;
import static mcframe.commonMA.notice.MA_Msg.*;

public class MAUDP_RLSearcher_MC<P extends MAUDP_RLBase, O extends MCCallerPanelBridge>
		extends FXBAP_RLSearcher<P, O> {

	/**
	 * コンストラクタです。
	 *
	 * @param panel 画面
	 * @param operation オペレーション
	 */
	public MAUDP_RLSearcher_MC(P panel, O operation) {
		super(panel, operation);
	}

	@Override
	protected void checkForCallStack(MCMessageList msgList) {
		super.checkForCallStack(msgList);
		
		panel.checkAtLeastOneCndDelFlg(msgList);
	}

	@Override
	protected void setMode() {
		MCLog.write(MAUDP0133);
		if (panel instanceof IfRLBase) {
			panel.setStatusByOpe();
		}
		else {
			super.setMode();
		}
		MCLog.write(MAUDP0134);
	}

	@Override
	protected void setModeNoDown() {
		MCLog.write(MAUDP0121);
		if (panel instanceof IfRLBase) {
			panel.setStatusByOpe();
		}
		else {
			super.setModeNoDown();
		}
		MCLog.write(MAUDP0122);
	}


	@Override
	protected void moveFocus() {
		MCLog.write(MAUDP0135);
		if (panel instanceof IfRLBase) {
			if (panel.getDtlTable() != null && panel.getDtlTable().isVisible()) {
				panel.getDtlTable().selectLeftmostColumn(0);
			}
		}
		else {
			super.moveFocus();
		}
		MCLog.write(MAUDP0136);
	}

	@Override
	protected void moveFocusNoDown() {
		MCLog.write(MAUDP0123);
		if (panel instanceof IfRLBase) {
			panel.moveFocusCndPanel();
		}
		else {
			super.moveFocusNoDown();
		}
		MCLog.write(MAUDP0124);
	}

	@Override
	protected void afterCallSub() {
		// 何もしない
	}
	
	@Override
	protected void clear() {
		MCLog.write(MAUDP0106);
		super.clear();
		MCLog.write(MAUDP0107);
	}
	
	@Override
	protected void setupParam() {
		MCLog.write(MAUDP0110);
		super.setupParam();
		MCLog.write(MAUDP0111);
	}
	
	@Override
	protected void beforeCall() {
		MCLog.write(MAUDP0112);
		super.beforeCall();
		MCLog.write(MAUDP0113);
	}
	
	@Override
	protected void setLimitParamSize() {
		MCLog.write(MAUDP0114);
		super.setLimitParamSize();
		MCLog.write(MAUDP0115);
	}
	
	@Override
	protected boolean checkLimitULSize() {
		MCLog.write(MAUDP0166);
		boolean r = super.checkLimitULSize();
		MCLog.write(MAUDP0167);
		return r;
	}
	
	@Override
	protected boolean checkInvisibleRowInUpParam() {
		MCLog.write(MAUDP0068);
		boolean r = super.checkInvisibleRowInUpParam();
		MCLog.write(MAUDP0069);
		return r;
	}
	
	@Override
	protected void call() {
		MCLog.write(MAUDP0118);
		super.call();
		MCLog.write(MAUDP0119);
	}
	
	@Override
	protected void handleMCEx(MCException ex) {
		MCLog.write(MAUDP0120);
		super.handleMCEx(ex);
	}
	
	@Override
	protected void afterCapError() {
		MCLog.write(MAUDP0125);
		super.afterCapError();
		MCLog.write(MAUDP0126);
	}
	
	@Override
	protected void showCanceledMsg() {
		MCLog.write(MAUDP0164);
		super.showCanceledMsg();
		MCLog.write(MAUDP0165);
	}
	
	@Override
	protected void resultNoDataFound() {
		MCLog.write(MAUDP0149);
		super.resultNoDataFound();
		MCLog.write(MAUDP0150);
	}
	
	@Override
	protected void showMsg() {
		MCLog.write(MAUDP0137);
		super.showMsg();
		MCLog.write(MAUDP0138);
	}
	
	@Override
	protected void print() {
		MCLog.write(MAUDP0139);
		super.print();
		MCLog.write(MAUDP0140);
	}
	
	@Override
	protected void resultSuccess() {
		MCLog.write(MAUDP0141);
		super.resultSuccess();
		MCLog.write(MAUDP0142);
		
	}
	
	@Override
	protected void showNoDownDataMsg() {
		MCLog.write(MAUDP0147);
		super.showNoDownDataMsg();
		MCLog.write(MAUDP0148);
	}
	
	@Override
	protected void afterCall() {
		MCLog.write(MAUDP0127);
		super.afterCall();
		MCLog.write(MAUDP0128);
	}
	
	@Override
	protected void show() {
		MCLog.write(MAUDP0129);
		super.show();
		MCLog.write(MAUDP0130);
	}

	@Override
	protected void adjustList() {
		MCLog.write(MAUDP0131);
		super.adjustList();
		MCLog.write(MAUDP0132);
	}

	@Override
	protected void sort() {
		MCLog.write(MAUDP0157);
		super.sort();
		MCLog.write(MAUDP0158);
	}
}

