package mcframe.clientMSBH.MSBHP0080;

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
import mcframe.clientMAUB.MAUBP5050.*;
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
 * 画面"MSBHP_AdvPaySrch"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MSBHP_AdvPaySrch_MC extends MSBHP_AdvPaySrch_MC_A {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START

	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MSBHP_AdvPaySrch_MC() {
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
	public MSBHP_AdvPaySrch_MC(String name) {
		super(name);
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR_LIST START

		//FMCB CUSTOM_CONSTRUCTOR_LIST END
	}

	//画面処理メソッドはこれより下に定義してください。
	//FMCB CUSTOM_METHOD START

	/**
	 * [MS_MSBHL0080_Srch01]の定型処理のInnerClass
	 */
	protected class MS_MSBHL0080_Srch01Caller<P extends MSBHP_AdvPaySrch, B extends MS_MSBHL0080_Srch01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Searcher<P, B> {

		protected MS_MSBHL0080_Srch01Caller(P p, B b) {
			super(p, b);
		}
		
		@Override
		protected void checkForCallStack(MCMessageList msgList) {
			super.checkForCallStack(msgList);
			msgList.addAll(checkBeforeAfter(Cnd_ac_dt_fr, Cnd_ac_dt_to));
			msgList.addAll(checkBeforeAfter(Cnd_pay_act_dt_fr, Cnd_pay_act_dt_to));
		}

		@Override
		protected void moveFocus() {
			super.moveFocus();
			RsltTable.selectLeftmostColumn(0);
		}
		
		@Override
		protected void setMode() {
			super.setMode();
			setREFStatus();
			RsltTable.selectLeftmostColumn(0);
			Ctrl_ctrl_PPanel.expand(false);
		}
		
		@Override
		protected void setModeNoDown() {
			super.setModeNoDown();
			setStatus(getStatus());
		}
	}

	/**
	 * Panel[Ctrl]のボタン[ctrl_Ope_srch]の押下時の処理
	 */
	@Override
	public void doCtrl_ctrl_Ope_srch(MCEventInfo info) {
		callMS_MSBHL0080_Srch01();
	}
	/**
	 * Panel[RPnl]のボタン[dwnld]の押下時の処理
	 */
	@Override
	public void doRPnl_dwnld(MCEventInfo info) {
		createMS_MSBHL0080_Srch01().execDL();
	}
	/**
	 * Panel[Btn]のボタン[open_MSBHP0070]の押下時の処理
	 */
	@Override
	public void doBtn_open_MSBHP0070(MCEventInfo info) {
		RsltR r = RsltTable.getSelectedMCRow();
		if (r == null) {
			dialog(msgNoSelectedRow());
			return ;
		}
		doBtn_open_MSBHP0070(r);
	}
	protected void doBtn_open_MSBHP0070(RsltR r) {
		if (isNull(r.adv_pay_act_no())) {
			openPanel("MS", "MSBHP0070", T1, r);
		}
		else {
			MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MS", "MSBHP0070");
			aso.runValueInit();
			aso.putCnd(crtOpenMSBHP0070CndR(aso, r));
			aso.putSearchAction();
			aso.show();
		}
	}
	protected mcframe.clientMSBH.MSBHP0070.CndR crtOpenMSBHP0070CndR(MAUCP_AppScreenOpener aso, RsltR r) {
		mcframe.clientMSBH.MSBHP0070.MSBHP_AdvPayReg p = (mcframe.clientMSBH.MSBHP0070.MSBHP_AdvPayReg) aso.getPanel();
		mcframe.clientMSBH.MSBHP0070.CndR to = mcframe.clientMSBH.MSBHP0070.CndR.create();

		to.ope(p.Cnd_ope_REF.getActionCommand());
		to.adv_pay_act_no(r.adv_pay_act_no());
		to.adv_pay_act_rev(r.adv_pay_act_rev());
		
		return to;
	}
	/**
	 * 一覧の行を選択しているかどうか
	 * @return 
	 */
	protected boolean isSelectedRsltRow() {
		if (RsltTable.getSelectedMCRow() == null) {
			return false;
		}
		return true;
	}
	
	@Override
	public void doRslt_NC(MCEventInfo info) {
		super.doRslt_NC(info);
		int index = info.getEventIndex();
		if (index < 0) {
			return;
		}
		RsltR r = getRsltL().get(index);
		if (isEnableBtn_open_MSBHP0070(r)) {
			Btn_open_MSBHP0070.setMode(MCMode.ENABLE);
		}
		else {
			Btn_open_MSBHP0070.setMode(MCMode.DISABLE);
		}
	}

	@Override
	public void setSRCHStatus() {
		super.setSRCHStatus();
		CndPanel.focusFirstComponent();
	}

	@Override
	public void doDCEvent(MCDCBeans compo, MCEventInfo info) {
		super.doDCEvent(compo, info);
		if (compo == RsltTable) {
			RsltR r = getRsltL().get(info.getEventIndex());
			if (isEnableBtn_open_MSBHP0070(r)) {
				doBtn_open_MSBHP0070(r);
			}
		}
	}

	protected boolean isEnableBtn_open_MSBHP0070(RsltR r) {
		return r != null;
	}

	@Override
	public MCList getCnd_ap_sttl_cd(MCRow row, MCEventInfo info) {
		// 債務決済区分が預金・現金・手形の債務決済方法を選択できる
		MCList<?> list = super.getCnd_ap_sttl_cd(row, info);
		MCList tgtlist = list.clone();
		tgtlist.clear();
		for (MCRow r : list) {
			if (MAC_AP_STTL_TYP.isCASH(r.getStringNE("ap_sttl_typ")) ||
					MAC_AP_STTL_TYP.isNOTE(r.getStringNE("ap_sttl_typ")) ||
					MAC_AP_STTL_TYP.isACNT(r.getStringNE("ap_sttl_typ"))) {
				tgtlist.add(r);
			}
		}
		return tgtlist;
	}
	
	//********************** 画面起動時の初期設定 **************************
	@Override
	protected void setupParts() {
		super.setupParts();
		// 一覧
		Rslt_trd_cur_amt_p_PPanel.setRelateBeans(columnRslt_trd_cur_cd, columnRslt_trd_cur_amt_dec_place);
		Rslt_trd_cur_com_paid_p_PPanel.setRelateBeans(columnRslt_trd_cur_cd, columnRslt_trd_cur_amt_dec_place);
		Rslt_trd_cur_com_paid_tax_amt_p_PPanel.setRelateBeans(columnRslt_trd_cur_cd, columnRslt_trd_cur_amt_dec_place);
		Rslt_trd_cur_exc_com_paid_p_PPanel.setRelateBeans(columnRslt_trd_cur_cd, columnRslt_trd_cur_amt_dec_place);
		Rslt_trd_cur_exc_com_paid_p_PPanel.setRelateBeans(columnRslt_trd_cur_cd, columnRslt_trd_cur_amt_dec_place);
		Rslt_trd_cur_setoff_tgt_amt_p_PPanel.setRelateBeans(columnRslt_trd_cur_cd, columnRslt_trd_cur_amt_dec_place);
		Rslt_trd_cur_setoff_schd_amt_p_PPanel.setRelateBeans(columnRslt_trd_cur_cd, columnRslt_trd_cur_amt_dec_place);
		Rslt_trd_cur_setoff_act_amt_p_PPanel.setRelateBeans(columnRslt_trd_cur_cd, columnRslt_trd_cur_amt_dec_place);
		Rslt_trd_cur_not_proc_bal_p_PPanel.setRelateBeans(columnRslt_trd_cur_cd, columnRslt_trd_cur_amt_dec_place);
		Rslt_base_cur_amt_p_PPanel.setRelateBeans(columnRslt_base_cur_cd, columnRslt_base_cur_amt_dec_place, columnRslt_trd_cur_amt, columnRslt_xrate);
		Rslt_base_cur_com_paid_p_PPanel.setRelateBeans(columnRslt_base_cur_cd, columnRslt_base_cur_amt_dec_place);
		Rslt_base_cur_com_paid_tax_amt_p_PPanel.setRelateBeans(columnRslt_base_cur_cd, columnRslt_base_cur_amt_dec_place);
		Rslt_base_cur_exc_com_paid_p_PPanel.setRelateBeans(columnRslt_base_cur_cd, columnRslt_base_cur_amt_dec_place);
		Rslt_base_cur_setoff_tgt_amt_p_PPanel.setRelateBeans(columnRslt_base_cur_cd, columnRslt_base_cur_amt_dec_place);
		
		Rslt_psppl_grp_p_PPanel.setRelateBeans(Cnd_psppl_grp_p_PPanel);
		Rslt_bsppl_grp_p_PPanel.setRelateBeans(Cnd_bsppl_grp_p_PPanel);
	}

}