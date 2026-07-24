package mcframe.clientMSBC.MSBCP1070;

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
import mcframe.clientMAUB.MAUBP0030.*;
import mcframe.clientMAUB.MAUBP0100.*;
import mcframe.clientMAUB.MAUBP0250.*;
import mcframe.clientMAUB.MAUBP0260.*;
import mcframe.clientMAUB.MAUBP0400.*;
import mcframe.clientMAUB.MAUBP5030.*;
import mcframe.clientMAUB.MAUBP5040.*;
import mcframe.clientMAUB.MAUBP5170.*;
import mcframe.clientMAUB.MAUBP5190.*;
import mcframe.clientMSUB.MSUBP0020.*;
import mcframe.clientMSUB.MSUBP5020.*;

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
 * 画面"MSBCP_MfgInstPrSrch"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MSBCP_MfgInstPrSrch_MC extends MSBCP_MfgInstPrSrch_MC_A {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START

	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MSBCP_MfgInstPrSrch_MC() {
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
	public MSBCP_MfgInstPrSrch_MC(String name) {
		super(name);
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR_LIST START

		//FMCB CUSTOM_CONSTRUCTOR_LIST END
	}

	//画面処理メソッドはこれより下に定義してください。
	//FMCB CUSTOM_METHOD START

	/**
	 * [MS_MSBCL1070_Srch01]の定型処理のInnerClass
	 */
	protected class MS_MSBCL1070_Srch01Caller<P extends MSBCP_MfgInstPrSrch, B extends MS_MSBCL1070_Srch01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Searcher<P, B> {

		protected MS_MSBCL1070_Srch01Caller(P p, B b) {
			super(p, b);
		}
		
		@Override
		protected void initCaller() {
			super.initCaller();
			setDLMode();
		}


		@Override
		protected void checkForCallStack(MCMessageList msgList) {
			super.checkForCallStack(msgList);
			msgList.addAll(checkBeforeAfter(Cnd_inst_dt_fr, Cnd_inst_dt_to));
			msgList.addAll(checkBeforeAfter(Cnd_aprv_dt_fr, Cnd_aprv_dt_to));
			msgList.addAll(checkBeforeAfter(Cnd_st_ac_dt_fr, Cnd_st_ac_dt_to));
			msgList.addAll(checkBeforeAfter(Cnd_end_ac_dt_fr, Cnd_end_ac_dt_to));
			msgList.addAll(checkBeforeAfter(Cnd_yield_ac_dt_fr, Cnd_yield_ac_dt_to));
			msgList.addAll(checkBeforeAfter(Cnd_upd_ts_fr, Cnd_upd_ts_to));
			msgList.addAll(checkSmallLarge(Cnd_pr_rate_fr, Cnd_pr_rate_to));
			msgList.addAll(checkAtLeastOne(StsPanel));
			msgList.addAll(checkAtLeastOne(UnschdActSrchCndPanel));
		}
		
		@Override
		protected void setMode() {
			setRefStatus();
		}
		
		@Override
		protected void setModeNoDown() {
			setSrchStatus();
		}
		
	}


	/**
	 * Panel[Ctrl]のボタン[ctrl_Ope_srch]の押下時の処理
	 */
	@Override
	public void doCtrl_ctrl_Ope_srch(MCEventInfo info) {
		callMS_MSBCL1070_Srch01();
	}
	/**
	 * Panel[RPnl]のボタン[dwnld]の押下時の処理
	 */
	@Override
	public void doRPnl_dwnld(MCEventInfo info) {
		createMS_MSBCL1070_Srch01().execDL();
	}
	/**
	 * Panel[Btn]のボタン[open_MSBCP1010]の押下時の処理
	 */
	@Override
	public void doBtn_open_MSBCP1010(MCEventInfo info) {
		RsltR r = RsltTable.getSelectedMCRow();
		if (r == null) {
			dialog(msgNoSelectedRow());
			return;
		}
		doBtn_open_MSBCP1010(r);
	}
	protected void doBtn_open_MSBCP1010(RsltR r){
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MS", "MSBCP1010");
		mcframe.clientMSBC.MSBCP1010.MSBCP_MfgInstReg msbcp1010 = 
				(mcframe.clientMSBC.MSBCP1010.MSBCP_MfgInstReg) aso.getPanel();
		mcframe.clientMSBC.MSBCP1010.CndR to = mcframe.clientMSBC.MSBCP1010.CndR.create();
		to.ope(msbcp1010.Cnd_ope_REF.getActionCommand());
		to.srch_tgt_no(r.mfg_inst_no());
		aso.putCnd(to);
		aso.putSearchAction();
		aso.show();
	}
	
	/**
	 * Panel[Btn]のボタン[open_MSBCP1100]の押下時の処理
	 */
	@Override
	public void doBtn_open_MSBCP1100(MCEventInfo info) {
		RsltR r = RsltTable.getSelectedMCRow();
		if (r == null) {
			dialog(msgNoSelectedRow());
			return;
		}
		doBtn_open_MSBCP1100(r);
	}
	
	protected void doBtn_open_MSBCP1100(RsltR r){
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MS", "MSBCP1100");
		mcframe.clientMSBC.MSBCP1100.MSBCP_MfgActReg msbcp1100 = 
				(mcframe.clientMSBC.MSBCP1100.MSBCP_MfgActReg) aso.getPanel();
		mcframe.clientMSBC.MSBCP1100.CndR to = mcframe.clientMSBC.MSBCP1100.CndR.create();
		boolean isRunValueInit = false;
		if (MSC_MFG_STS_TYP.isORD(r.mfg_sts_typ())) {
			to.ope(msbcp1100.Cnd_ope_INS.getActionCommand());
			isRunValueInit = true;
		}
		else {
			to.ope(msbcp1100.Cnd_ope_REF.getActionCommand());
			to.srch_tgt_typ_nm(MSC_PROD_SRCH_TGT_TYP.MFG_INST_NO.name());
		}
		if (isRunValueInit) {
			aso.runValueInit();
		}
		to.srch_tgt_no(r.mfg_inst_no());
		to.div_seq(r.div_seq());
		aso.putCnd(to);
		if (!isNull(r.div_seq()) || MSC_MFG_STS_TYP.isORD(r.mfg_sts_typ())) {
			aso.putSearchAction();
		}
		aso.show();
	}

	@Override
	public void doDCEvent(MCDCBeans compo, MCEventInfo info) {
		super.doDCEvent(compo, info);
		if (compo == RsltTable) {
			RsltR r = getRsltL().get(info.getEventIndex());
			if (!(r == null)) {
				if (Cnd_disp_unit2_INST.isSelected()) {
					doBtn_open_MSBCP1010(r);
				}
				else {
					doBtn_open_MSBCP1100(r);
				}
			}
		}
	}


	@Override
	protected void setupParts() {
		super.setupParts();
		Rslt_inst_qty_p_PPanel.setRelateBeans(columnRslt_base_unit_cd, columnRslt_base_unit_dec_place);
		Rslt_yield_schd_qty_p_PPanel.setRelateBeans(columnRslt_base_unit_cd, columnRslt_base_unit_dec_place);
		Rslt_base_unit_mfg_qty_p_PPanel.setRelateBeans(columnRslt_base_unit_cd, columnRslt_base_unit_dec_place);
		Rslt_base_unit_mfg_rem_st_qty_p_PPanel.setRelateBeans(columnRslt_base_unit_cd, columnRslt_base_unit_dec_place);
		Rslt_base_unit_mfg_rem_qty_p_PPanel.setRelateBeans(columnRslt_base_unit_cd, columnRslt_base_unit_dec_place);
		Rslt_base_unit_mfg_abort_qty_p_PPanel.setRelateBeans(columnRslt_base_unit_cd, columnRslt_base_unit_dec_place);
		Rslt_base_unit_yield_qty_p_PPanel.setRelateBeans(columnRslt_base_unit_cd, columnRslt_base_unit_dec_place);
		Rslt_base_unit_dfct_qty_p_PPanel.setRelateBeans(columnRslt_base_unit_cd, columnRslt_base_unit_dec_place);
		Rslt_oper_std_qty_p_PPanel.setRelateBeans(columnRslt_base_unit_cd, columnRslt_base_unit_dec_place);
		Rslt_ord_qty_p_PPanel.setRelateBeans(columnRslt_base_unit_cd, columnRslt_base_unit_dec_place);
		Rslt_not_inst_qty_p_PPanel.setRelateBeans(columnRslt_base_unit_cd, columnRslt_base_unit_dec_place);
		Rslt_oper_unit_qty_p_PPanel.setRelateBeans(columnRslt_base_unit_cd, columnRslt_base_unit_dec_place);
		Rslt_oper_unit_act_qty_p_PPanel.setRelateBeans(columnRslt_base_unit_cd, columnRslt_base_unit_dec_place);
		Rslt_oper_unit_schd_qty_p_PPanel.setRelateBeans(columnRslt_base_unit_cd, columnRslt_base_unit_dec_place);
		Rslt_oper_unit_rem_qty_p_PPanel.setRelateBeans(columnRslt_base_unit_cd, columnRslt_base_unit_dec_place);
		Rslt_trd_unit_yield_schd_qty_p_PPanel.setRelateBeans(columnRslt_trd_unit_cd, columnRslt_trd_unit_dec_place);
		Rslt_trd_unit_yield_qty_p_PPanel.setRelateBeans(columnRslt_trd_unit_cd, columnRslt_trd_unit_dec_place);
		Rslt_trd_unit_dfct_qty_p_PPanel.setRelateBeans(columnRslt_trd_unit_cd, columnRslt_trd_unit_dec_place);
		Rslt_itm_grp_p_PPanel.setRelateBeans(Cnd_itm_grp_p_PPanel);
		Rslt_sppl_grp_p_PPanel.setRelateBeans(Cnd_sppl_grp_p_PPanel);
	}
	
	// -----------------------------------------------
	// init-screen
	@Override
	protected void valueInit() {
		super.valueInit();
		valueInitSub();
	}

	protected void valueInitSub() {
		setValueEx(Cnd_disp_unit1_Group, Cnd_disp_unit1_HDR.getActionCommand());
		setValueEx(Cnd_not_unschd_act_flg, true);
		setValueEx(Cnd_unschd_act_flg, true);
		clearCndDisp();
	}

	/**
	 * 表示単位変更時
	 */
	protected void clearCndDisp() {
		if(Cnd_disp_unit2_INST.isSelected()){
			setValueEx(Cnd_tmp_sts_sav_flg, true);
			setValueEx(Cnd_tmp_sts_ord_flg, true);
			setValueEx(Cnd_tmp_sts_stt_flg, true);
			setValueEx(Cnd_tmp_sts_cmpl_flg, true);
			if(Cnd_disp_unit1_HDR.isSelected()){
				setValueEx(Cnd_oper_usr_cd, null);
				setValueEx(Cnd_oper_usr_nm, null);
				setValueEx(Cnd_oper_inst_no, null);
				setValueEx(Cnd_oper_ord_no, null);
				setValueEx(Cnd_oper_loc_cd, null);
				setValueEx(Cnd_oper_loc_nm, null);
				setValueEx(Cnd_oper_str_ln_cd, null);
				setValueEx(Cnd_oper_str_ln_nm, null);
				setValueEx(Cnd_oper_cd, null);
				setValueEx(Cnd_oper_nm, null);
				setValueEx(Cnd_oper_inst_rpt_rmrks, null);
				setValueEx(Cnd_oper_intr_rmrks, null);
				setValueEx(Cnd_oper_rsrc, null);
				setValueEx(Cnd_sub_char1, null);
				setValueEx(Cnd_sub_char2, null);
				setValueEx(Cnd_sub_char3, null);
				setValueEx(Cnd_yield_schd_no, null);
				setValueEx(Cnd_act_usr_cd, null);
				setValueEx(Cnd_act_usr_nm, null);
				setValueEx(Cnd_act_dpt_cd, null);
				setValueEx(Cnd_act_dpt_nm, null);
				setValueEx(Cnd_mfg_act_no, null);
				setValueEx(Cnd_oper_act_no, null);
				setValueEx(Cnd_yield_act_no, null);
				setValueEx(Cnd_yield_schd_intr_rmrks, null);
				setValueEx(Cnd_yield_schd_rpt_rmrks, null);
				setValueEx(Cnd_insp_cnt_rmrks, null);
				setValueEx(Cnd_yield_schd_sub_char1, null);
				setValueEx(Cnd_yield_schd_sub_char2, null);
				setValueEx(Cnd_yield_schd_sub_char3, null);
				setValueEx(Cnd_yield_typ, null);
				setValueEx(Cnd_yield_rsn_cd, null);
				setValueEx(Cnd_gd_cd, null);
			}
			else if(Cnd_disp_unit1_OPER.isSelected()){
				setValueEx(Cnd_yield_schd_no, null);
				setValueEx(Cnd_act_usr_cd, null);
				setValueEx(Cnd_act_usr_nm, null);
				setValueEx(Cnd_act_dpt_cd, null);
				setValueEx(Cnd_act_dpt_nm, null);
				setValueEx(Cnd_mfg_act_no, null);
				setValueEx(Cnd_oper_act_no, null);
				setValueEx(Cnd_yield_act_no, null);
				setValueEx(Cnd_yield_schd_intr_rmrks, null);
				setValueEx(Cnd_yield_schd_rpt_rmrks, null);
				setValueEx(Cnd_insp_cnt_rmrks, null);
				setValueEx(Cnd_yield_schd_sub_char1, null);
				setValueEx(Cnd_yield_schd_sub_char2, null);
				setValueEx(Cnd_yield_schd_sub_char3, null);
				setValueEx(Cnd_yield_typ, null);
				setValueEx(Cnd_yield_rsn_cd, null);
				setValueEx(Cnd_gd_cd, null);
			}
			else {
				setValueEx(Cnd_inc_yield_oper_flg, false);
				setValueEx(Cnd_act_usr_cd, null);
				setValueEx(Cnd_act_usr_nm, null);
				setValueEx(Cnd_act_dpt_cd, null);
				setValueEx(Cnd_act_dpt_nm, null);
				setValueEx(Cnd_mfg_act_no, null);
				setValueEx(Cnd_oper_act_no, null);
				setValueEx(Cnd_yield_act_no, null);
				setValueEx(Cnd_yield_rsn_cd, null);
				setValueEx(Cnd_gd_cd, null);
			}
		}
		else {
			setValueEx(Cnd_tmp_sts_sav_flg, false);
			setValueEx(Cnd_tmp_sts_ord_flg, false);
			setValueEx(Cnd_tmp_sts_stt_flg, true);
			setValueEx(Cnd_tmp_sts_cmpl_flg, true);
			setValueEx(Cnd_pr_rate_fr, null);
			setValueEx(Cnd_pr_rate_to, null);
			setValueEx(Cnd_abort_flg, false);
			if(Cnd_disp_unit1_HDR.isSelected()){
				setValueEx(Cnd_lot_no, null);
				setValueEx(Cnd_sublot_no, null);
				setValueEx(Cnd_oper_usr_cd, null);
				setValueEx(Cnd_oper_usr_nm, null);
				setValueEx(Cnd_oper_inst_no, null);
				setValueEx(Cnd_oper_ord_no, null);
				setValueEx(Cnd_oper_loc_cd, null);
				setValueEx(Cnd_oper_loc_nm, null);
				setValueEx(Cnd_oper_str_ln_cd, null);
				setValueEx(Cnd_oper_str_ln_nm, null);
				setValueEx(Cnd_oper_cd, null);
				setValueEx(Cnd_oper_nm, null);
				setValueEx(Cnd_oper_inst_rpt_rmrks, null);
				setValueEx(Cnd_oper_intr_rmrks, null);
				setValueEx(Cnd_oper_rsrc, null);
				setValueEx(Cnd_sub_char1, null);
				setValueEx(Cnd_sub_char2, null);
				setValueEx(Cnd_sub_char3, null);
				setValueEx(Cnd_yield_schd_no, null);
				setValueEx(Cnd_oper_act_no, null);
				setValueEx(Cnd_yield_act_no, null);
				setValueEx(Cnd_yield_schd_intr_rmrks, null);
				setValueEx(Cnd_yield_schd_rpt_rmrks, null);
				setValueEx(Cnd_insp_cnt_rmrks, null);
				setValueEx(Cnd_yield_schd_sub_char1, null);
				setValueEx(Cnd_yield_schd_sub_char2, null);
				setValueEx(Cnd_yield_schd_sub_char3, null);
				setValueEx(Cnd_yield_typ, null);
				setValueEx(Cnd_yield_rsn_cd, null);
				setValueEx(Cnd_gd_cd, null);
			}
			else if(Cnd_disp_unit1_OPER.isSelected()){
				setValueEx(Cnd_lot_no, null);
				setValueEx(Cnd_sublot_no, null);
				setValueEx(Cnd_yield_schd_no, null);
				setValueEx(Cnd_yield_act_no, null);
				setValueEx(Cnd_yield_schd_intr_rmrks, null);
				setValueEx(Cnd_yield_schd_rpt_rmrks, null);
				setValueEx(Cnd_insp_cnt_rmrks, null);
				setValueEx(Cnd_yield_schd_sub_char1, null);
				setValueEx(Cnd_yield_schd_sub_char2, null);
				setValueEx(Cnd_yield_schd_sub_char3, null);
				setValueEx(Cnd_yield_typ, null);
				setValueEx(Cnd_yield_rsn_cd, null);
				setValueEx(Cnd_gd_cd, null);
			}
			else {
				setValueEx(Cnd_inc_yield_oper_flg, false);
			}
		}
	}
	
	//ヘッダ/指図
	@Override
	public void setSRCH_INST_HDRStatus() {
		super.setSRCH_INST_HDRStatus();
		FoldTab.focusActiveFirstComponent();
		setBtnMode();
	}

	//工程/指図
	@Override
	public void setSRCH_INST_OPERStatus() {
		super.setSRCH_INST_OPERStatus();		
		FoldTab.focusActiveFirstComponent();
		setBtnMode();
	}
	
	//出来高/指図
	@Override
	public void setSRCH_INST_YIELDStatus() {
		super.setSRCH_INST_YIELDStatus();		
		FoldTab.focusActiveFirstComponent();
		setBtnMode();
	}

	//ヘッダ/実績
	@Override
	public void setSRCH_ACT_HDRStatus() {
		super.setSRCH_ACT_HDRStatus();
		FoldTab.focusActiveFirstComponent();
		setBtnMode();
	}

	//工程/実績
	@Override
	public void setSRCH_ACT_OPERStatus() {
		super.setSRCH_ACT_OPERStatus();		
		FoldTab.focusActiveFirstComponent();
		setBtnMode();
	}
	
	//出来高/実績
	@Override
	public void setSRCH_ACT_YIELDStatus() {
		super.setSRCH_ACT_YIELDStatus();		
		FoldTab.focusActiveFirstComponent();
		setBtnMode();
	}
	
	//ヘッダ/指図
	@Override
	public void setREF_INST_HDRStatus() {
		super.setREF_INST_HDRStatus();
		RsltTable.selectRow(0);
		setBtnMode();
	}

	//工程/指図
	@Override
	public void setREF_INST_OPERStatus() {
		super.setREF_INST_OPERStatus();		
		RsltTable.selectRow(0);
		setBtnMode();
	}
	
	//出来高/指図
	@Override
	public void setREF_INST_YIELDStatus() {
		super.setREF_INST_YIELDStatus();		
		RsltTable.selectRow(0);
		setBtnMode();
	}

	//ヘッダ/実績
	@Override
	public void setREF_ACT_HDRStatus() {
		super.setREF_ACT_HDRStatus();
		RsltTable.selectRow(0);
		setBtnMode();
	}

	//工程/実績
	@Override
	public void setREF_ACT_OPERStatus() {
		super.setREF_ACT_OPERStatus();		
		RsltTable.selectRow(0);
		setBtnMode();
	}
	
	//出来高/実績
	@Override
	public void setREF_ACT_YIELDStatus() {
		super.setREF_ACT_YIELDStatus();		
		RsltTable.selectRow(0);
		setBtnMode();
	}
	
	protected void setBtnMode() {
		RsltR r = RsltTable.getSelectedMCRow();
		
		// 画面遷移ボタン
		if(r == null){
			Btn_open_MSBCP1010.setMode(MCMode.DISABLE);
			Btn_open_MSBCP1100.setMode(MCMode.DISABLE);
		}
		else{
			setDefaultMode(Btn_open_MSBCP1010);
			if (MSC_MFG_STS_TYP.isSAV(r.mfg_sts_typ())) {
				Btn_open_MSBCP1100.setMode(MCMode.DISABLE);
			}
			else {
				setDefaultMode(Btn_open_MSBCP1100);
			}
		}
	}

	@Override
	public void doRslt_NC(MCEventInfo info) {
		super.doRslt_NC(info);
		setBtnMode();
	}

	@Override
	public void doCnd_disp_unit1_NC(MCEventInfo info){
		super.doCnd_disp_unit1_NC(info);
		clearContainers(getRsltL());
		setSrchStatus();
		clearCndDisp();
	}

	@Override
	public void doCnd_disp_unit2_NC(MCEventInfo info){
		super.doCnd_disp_unit2_NC(info);
		clearContainers(getRsltL());
		setSrchStatus();
		clearCndDisp();
	}
	
	protected void setSrchStatus() {
		if(Cnd_disp_unit2_INST.isSelected()){
			if(Cnd_disp_unit1_HDR.isSelected()){
				setSRCH_INST_HDRStatus();
			}
			else if(Cnd_disp_unit1_OPER.isSelected()){
				setSRCH_INST_OPERStatus();
			}
			else {
				setSRCH_INST_YIELDStatus();
			}
		}
		else {
			if(Cnd_disp_unit1_HDR.isSelected()){
				setSRCH_ACT_HDRStatus();
			}
			else if(Cnd_disp_unit1_OPER.isSelected()){
				setSRCH_ACT_OPERStatus();
			}
			else {
				setSRCH_ACT_YIELDStatus();
			}
		}

		Ctrl_ctrl_PPanel.expand(true);
	}
	
	protected void setRefStatus() {
		if(Cnd_disp_unit2_INST.isSelected()){
			if(Cnd_disp_unit1_HDR.isSelected()){
				setREF_INST_HDRStatus();
			}
			else if(Cnd_disp_unit1_OPER.isSelected()){
				setREF_INST_OPERStatus();
			}
			else {
				setREF_INST_YIELDStatus();
			}
		}
		else {
			if(Cnd_disp_unit1_HDR.isSelected()){
				setREF_ACT_HDRStatus();
			}
			else if(Cnd_disp_unit1_OPER.isSelected()){
				setREF_ACT_OPERStatus();
			}
			else {
				setREF_ACT_YIELDStatus();
			}
		}
		Ctrl_ctrl_PPanel.expand(false);
	}

	@Override
	public MCList getCnd_yield_typ(MCRow row, MCEventInfo info) {
		return super.getCnd_yield_typ(row, info).subList(r -> !MAC_YIELD_TYP.isBYPROD(r.getString(YieldTypCols.$o_yield_typ)));
	}

}