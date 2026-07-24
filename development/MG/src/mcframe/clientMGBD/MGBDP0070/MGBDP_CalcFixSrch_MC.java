package mcframe.clientMGBD.MGBDP0070;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import mcframe.clientCore.beans.action.*;
import mcframe.clientCore.beans.combobox.*;
import mcframe.clientCore.beans.*;
import mcframe.clientCore.event.*;
import mcframe.commonCore.lang.*;
import mcframe.commonCore.notice.*;
import mcframe.commonCore.container.*;
import mcframe.commonCore.container.MCRow.Status;
import mcframe.commonCore.container.MCList.SortType;
import mcframe.clientCore.beans.table.*;
import mcframe.clientCore.beans.tree.*;
import mcframe.clientCore.container.MCConstRow;

import mcframe.clientFXBA.FXBAP0130.*;

import mcframe.commonMA.constant.*;
import mcframe.commonMAUC.MAUCC2010.MAUCC_RowMapperWith;
import mcframe.clientMAUC.MAUCP0040.MAUCP_AppScreenOpener;
import mcframe.clientMAUD.MAUDP0080.MAUDP_CellConfig;
import static mcframe.commonMA.notice.MA_Msg.*;
import static mcframe.commonMAUA.MAUAC0010.MAUAC_List.*;
import static mcframe.commonMAUD.MAUDC0120.MAUDC_ListLogicBase.*;
import static mcframe.clientMAUC.MAUCP0010.MAUCP_MCDataUtil.*;
import static mcframe.clientMAUC.MAUCP0020.MAUCP_AppSys.*;
import mcframe.commonMB.constant.*;
import static mcframe.commonMB.notice.MB_Msg.*;
import static mcframe.commonMBUD.MBUDC0120.MBUDC_ListLogicBase.*;
import static mcframe.clientMBUC.MBUCP0010.MBUCP_MCDataUtil.*;
import static mcframe.clientMGUC.MGUCP0020.MGUCP_AppSys.*;
import mcframe.commonMG.constant.*;
import static mcframe.commonMG.notice.MG_Msg.*;
import mcframe.clientMGUD.MGUDP0020.MGUDP_CellConfig;


//カスタマイズのimportはこの間に記述してください。
//FMCB CUSTOM_IMPORT START

//FMCB CUSTOM_IMPORT END

/**
 * 画面"MGBDP_CalcFixSrch"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MGBDP_CalcFixSrch_MC extends MGBDP_CalcFixSrch_MC_A {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START

	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MGBDP_CalcFixSrch_MC() {
		super();
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR START

		//FMCB CUSTOM_CONSTRUCTOR END
	}

	/**
	 * コンストラクタです。埋込カラムとして作成するときに使用します。
	 *
	 * @param name 対応するInnerRow項目名
	 */
	public MGBDP_CalcFixSrch_MC(String name) {
		super(name);
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR_LIST START

		//FMCB CUSTOM_CONSTRUCTOR_LIST END
	}

	//画面処理メソッドはこれより下に定義してください。
	//FMCB CUSTOM_METHOD START

	/**
	 * [MG_MGBDL0070_Srch01]の定型処理のInnerClass
	 */
	protected class MG_MGBDL0070_Srch01Caller<P extends MGBDP_CalcFixSrch, B extends MG_MGBDL0070_Srch01Bridge>
			extends mcframe.clientMAUD.MAUDP0010.MAUDP_Searcher<P, B> {

		protected MG_MGBDL0070_Srch01Caller(P p, B b) {
			super(p, b);
		}

		@Override
		protected void checkForCallStack(MCMessageList msgList) {
			super.checkForCallStack(msgList);

			checkForCallStackSub(msgList);
		}

		protected void checkForCallStackSub(MCMessageList msgList) {
			msgList.addAll(checkBeforeAfter(Cnd_ym_fr, Cnd_ym_to));
		}

		@Override
		protected void setMode() {
			super.setMode();

			setRefStatus();
		}

		@Override
		protected void setModeNoDown() {
			super.setModeNoDown();

			setSrchStatus();
		}
	}

	/**
	 * Panel[Ctrl]のボタン[ctrl_Ope_srch]の押下時の処理
	 */
	@Override
	public void doCtrl_ctrl_Ope_srch(MCEventInfo info) {
		callMG_MGBDL0070_Srch01();
	}

	// ///////////////////// INIT /////////////////////////////////////////////
	@Override
	protected void valueInit() {
		super.valueInit();

		valueInitSub();
	}

	protected void valueInitSub() {
		setValueEx(Cnd_typ_Group, Cnd_typ_REG.getActionCommand());

		setYmFrTo();
	}

	protected void setYmFrTo() {
		mcframe.clientMAUC.MAUCP0020.TermR term = getTermInfo(this);

		if (term != null) {
			setValueEx(Cnd_ym_fr, term.term());
			setValueEx(Cnd_ym_to, term.term_end_ym().addMonth(-1));
		}
	}

	@Override
	public void setOpenFocus() {
		super.setOpenFocus();

		CndPanel.focusFirstComponent();
	}

	// ///////////////////// Notification Change //////////////////////////////
	@Override
	public void doCnd_typ_NC(MCEventInfo info) {
		super.doCnd_typ_NC(info);

		setInsInfoMode();
		tableClear();

		CndPanel.focusFirstComponent();
	}

	protected void setInsInfoMode() {
		if (Cnd_typ_MLY.isSelected()) {
			columnRslt_fix_usr_cd.setMode(MCMode.INVISIBLE);
			columnRslt_fix_usr_nm.setMode(MCMode.INVISIBLE);
			columnRslt_fix_ts.setMode(MCMode.INVISIBLE);
		}
		else {
			setDefaultMode(columnRslt_fix_usr_cd);
			setDefaultMode(columnRslt_fix_usr_nm);
			setDefaultMode(columnRslt_fix_ts);
		}
	}

	protected void tableClear() {
		RsltTable.clear();
	}

	// ///////////////////// Status ///////////////////////////////////////////
	protected void setSrchStatus() {
		setSRCHStatus();
		setInsInfoMode();

		CndPanel.focusFirstComponent();
		Ctrl_ctrl_PPanel.expand(true);
	}

	protected void setRefStatus() {
		setREFStatus();
		setInsInfoMode();

		RsltTable.selectLeftmostColumn(0);
		Ctrl_ctrl_PPanel.expand(false);
	}

}