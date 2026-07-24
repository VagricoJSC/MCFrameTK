package mcframe.clientMSBH.MSBHP0170;

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
import mcframe.clientMAUB.MAUBP0260.*;
import mcframe.clientMAUB.MAUBP5190.*;

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
//import static mcframe.commonMBUA.MBUAC0010.MBUAC_List.*;
import static mcframe.commonMBUD.MBUDC0120.MBUDC_ListLogicBase.*;
import static mcframe.clientMBUC.MBUCP0010.MBUCP_MCDataUtil.*;
import mcframe.commonMS.constant.*;
import static mcframe.commonMS.notice.MS_Msg.*;
import static mcframe.commonMSUA.MSUAC0010.MSUAC_List.*;


//カスタマイズのimportはこの間に記述してください。
//FMCB CUSTOM_IMPORT START

//FMCB CUSTOM_IMPORT END

/**
 * 画面"MSBHP_BillRcptSrch"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MSBHP_BillRcptSrch_MC extends MSBHP_BillRcptSrch_MC_A {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START

	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MSBHP_BillRcptSrch_MC() {
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
	public MSBHP_BillRcptSrch_MC(String name) {
		super(name);
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR_LIST START

		//FMCB CUSTOM_CONSTRUCTOR_LIST END
	}

	//画面処理メソッドはこれより下に定義してください。
	//FMCB CUSTOM_METHOD START

	/**
	 * [MS_MSBHL0170_Srch01]の定型処理のInnerClass
	 */
	protected class MS_MSBHL0170_Srch01Caller<P extends MSBHP_BillRcptSrch, B extends MS_MSBHL0170_Srch01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Searcher<P, B> {

		protected MS_MSBHL0170_Srch01Caller(P p, B b) {
			super(p, b);
		}

		@Override
		protected void checkForCallStack(MCMessageList msgList) {
			super.checkForCallStack(msgList);
			checkForCallStackSub(msgList);
		}

		protected void checkForCallStackSub(MCMessageList msgList) {
			// FromToの前後関係チェック
			msgList.addAll(checkBeforeAfter(Cnd_bill_cl_dt_from, Cnd_bill_cl_dt_to));
			msgList.addAll(checkBeforeAfter(Cnd_pay_schd_dt_from, Cnd_pay_schd_dt_to));
		}

		@Override
		protected void setModeNoDown() {
			setSRCHStatus();
		}

		@Override
		protected void setMode() {
			setREFStatus();
		}
	}
	
	@Override
	protected void setupParts() {
		super.setupParts();
		Rslt_billGrp_p_PPanel.setRelateBeans(Cnd_billGrp_p_PPanel);
	}
	
	/**
	 * Panel[Btn]のボタン[open_MSBHP0180]の押下時の処理
	 */
	@Override
	public void doBtn_open_MSBHP0180(MCEventInfo info) {
		RsltR r = RsltTable.getSelectedMCRow();
		if (r == null) {
			dialog(msgNoSelectedRow());
			return ;
		}
		openPanel("MS", "MSBHP0180", T1, r);
	}
	
	/**
	 * Panel[Ctrl]のボタン[ctrl_Ope_srch]の押下時の処理
	 */
	@Override
	public void doCtrl_ctrl_Ope_srch(MCEventInfo info) {
		callMS_MSBHL0170_Srch01();
	}

	/**
	 * Panel[Ctrl2]のボタン[dwnld]の押下時の処理
	 */
	@Override
	public void doCtrl2_dwnld(MCEventInfo info) {
		createMS_MSBHL0170_Srch01().execDL();
	}
	
	
	@Override
	public void doDCEvent(MCDCBeans compo, MCEventInfo info) {
		super.doDCEvent(compo, info);
		
		if (compo == RsltTable) {
			doBtn_open_MSBHP0180(info);
		}
	}

	@Override
	public void setREFStatus() {

		super.setREFStatus();
		Ctrl_ctrl_PPanel.expand(false);
		RsltTable.selectLeftmostColumn(0);
	}

	@Override
	public void setSRCHStatus() {

		super.setSRCHStatus();
		Ctrl_ctrl_PPanel.expand(true);
		FoldTab.focusActiveFirstComponent();
	}

}