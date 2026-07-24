package mcframe.clientMSBC.MSBCP1090;

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
import mcframe.clientMAUB.MAUBP0400.*;
import mcframe.clientMAUB.MAUBP5030.*;
import mcframe.clientMAUB.MAUBP5040.*;
import mcframe.clientMAUB.MAUBP5070.*;
import mcframe.clientMAUB.MAUBP5120.*;
import mcframe.clientMAUB.MAUBP5170.*;
import mcframe.clientMAUB.MAUBP5220.*;
import mcframe.clientMAUB.MAUBP5250.*;
import mcframe.clientMAUB.MAUBP5260.*;
import mcframe.clientMAUB.MAUBP5270.*;
import mcframe.clientMAUB.MAUBP5280.*;
import mcframe.clientMAUB.MAUBP5290.*;
import mcframe.clientMAUB.MAUBP5320.*;
import mcframe.clientMSUB.MSUBP0020.*;
import mcframe.clientMSUB.MSUBP5020.*;
import mcframe.clientMSUB.MSUBP5030.*;

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
 * 画面"MSBCP_InptListSrch"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MSBCP_InptListSrch_MC extends MSBCP_InptListSrch_MC_A {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START

	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MSBCP_InptListSrch_MC() {
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
	public MSBCP_InptListSrch_MC(String name) {
		super(name);
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR_LIST START

		//FMCB CUSTOM_CONSTRUCTOR_LIST END
	}

	//画面処理メソッドはこれより下に定義してください。
	//FMCB CUSTOM_METHOD START

	/**
	 * [MS_MSBCL1090_Srch01]の定型処理のInnerClass
	 */
	protected class MS_MSBCL1090_Srch01Caller<P extends MSBCP_InptListSrch, B extends MS_MSBCL1090_Srch01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Searcher<P, B> {

		protected MS_MSBCL1090_Srch01Caller(P p, B b) {
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
			msgList.addAll(checkBeforeAfter(Cnd_inpt_ac_dt_fr, Cnd_inpt_ac_dt_to));
			msgList.addAll(checkSmallLarge(Cnd_pr_rate_fr, Cnd_pr_rate_to));
			msgList.addAll(checkAtLeastOne(OperStsPanel));
			msgList.addAll(checkAtLeastOne(InptStsPanel));
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
		callMS_MSBCL1090_Srch01();
	}
	/**
	 * Panel[RPnl]のボタン[dwnld]の押下時の処理
	 */
	@Override
	public void doRPnl_dwnld(MCEventInfo info) {
		createMS_MSBCL1090_Srch01().execDL();
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
		to.ope(msbcp1010.Cnd_ope_UPD.getActionCommand());
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

	@Override
	public void doDCEvent(MCDCBeans compo, MCEventInfo info) {
		super.doDCEvent(compo, info);
		if (compo == RsltTable) {
			RsltR r = getRsltL().get(info.getEventIndex());
			if (r != null) {
				if (Cnd_srch_mode1_SCHD.isSelected()) {
					doBtn_open_MSBCP1010(r);
				}
				else {
					doBtn_open_MSBCP1100(r);
				}
			}
		}
	}
	
	protected void doBtn_open_MSBCP1100(RsltR r) {
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MS", "MSBCP1100");
		mcframe.clientMSBC.MSBCP1100.MSBCP_MfgActReg msbcp1100 = 
				(mcframe.clientMSBC.MSBCP1100.MSBCP_MfgActReg) aso.getPanel();
		mcframe.clientMSBC.MSBCP1100.CndR to = mcframe.clientMSBC.MSBCP1100.CndR.create();
		
		if (MSC_MFG_STS_TYP.isSTT(r.oper_mfg_sts_typ())
				|| MSC_MFG_STS_TYP.isCMPL(r.oper_mfg_sts_typ())) {
			to.ope(msbcp1100.Cnd_ope_UPD.getActionCommand());
			to.srch_tgt_typ_nm(MSC_PROD_SRCH_TGT_TYP.MFG_INST_NO.name());
			if (!isNull(r.div_seq())) {
				aso.putSearchAction();
			}
		}
		else {
			aso.runValueInit();
			to.ope(msbcp1100.Cnd_ope_INS.getActionCommand());
			aso.putSearchAction();
		}
		to.srch_tgt_no(r.mfg_inst_no());
		to.div_seq(r.div_seq());
		aso.putCnd(to);
		aso.show();
	}
	
	@Override
	protected void setupParts() {
		super.setupParts();

		Rslt_inpt_qty_p_PPanel.setRelateBeans(columnRslt_base_unit_cd,
				columnRslt_base_unit_dec_place);
		Rslt_sum_loss_qty_p_PPanel.setRelateBeans(columnRslt_base_unit_cd,
				columnRslt_base_unit_dec_place);
		Rslt_sum_fxd_loss_qty_p_PPanel.setRelateBeans(columnRslt_base_unit_cd,
				columnRslt_base_unit_dec_place);
		Rslt_loss_qty_p_PPanel.setRelateBeans(columnRslt_base_unit_cd,
				columnRslt_base_unit_dec_place);
		Rslt_schd_inpt_qty_p_PPanel.setRelateBeans(columnRslt_base_unit_cd,
				columnRslt_base_unit_dec_place);
		Rslt_schd_rqmt_qty_p_PPanel.setRelateBeans(columnRslt_base_unit_cd,
				columnRslt_base_unit_dec_place);
		Rslt_schd_fxd_rqmt_qty_p_PPanel.setRelateBeans(columnRslt_base_unit_cd,
				columnRslt_base_unit_dec_place);
		Rslt_inpt_rem_qty_p_PPanel.setRelateBeans(columnRslt_base_unit_cd,
				columnRslt_base_unit_dec_place);
		Rslt_acxfr_act_qty_p_PPanel.setRelateBeans(columnRslt_base_unit_cd,
				columnRslt_base_unit_dec_place);
		Rslt_cont_inpt_qty_p_PPanel.setRelateBeans(columnRslt_cont_fctr_flg,
				columnRslt_base_unit_inpt_qty, columnRslt_std_cont_fctr,
				columnRslt_act_cont_fctr, columnRslt_cont_fctr_dec_place,
				columnRslt_cont_fctr_rnd_typ);
		Rslt_cont_loss_qty_p_PPanel.setRelateBeans(columnRslt_cont_fctr_flg,
				columnRslt_base_unit_loss_qty, columnRslt_std_cont_fctr,
				columnRslt_act_cont_fctr, columnRslt_cont_fctr_dec_place,
				columnRslt_cont_fctr_rnd_typ);
		Rslt_cont_fxd_loss_qty_p_PPanel.setRelateBeans(columnRslt_cont_fctr_flg,
				columnRslt_base_unit_fxd_loss_qty, columnRslt_std_cont_fctr,
				columnRslt_act_cont_fctr, columnRslt_cont_fctr_dec_place,
				columnRslt_cont_fctr_rnd_typ);
		Rslt_cont_schd_inpt_qty_p_PPanel.setRelateBeans(columnRslt_cont_fctr_flg,
				columnRslt_base_unit_schd_inpt_qty, columnRslt_std_cont_fctr,
				columnRslt_act_cont_fctr, columnRslt_cont_fctr_dec_place,
				columnRslt_cont_fctr_rnd_typ);
		Rslt_cont_schd_rqmt_qty_p_PPanel.setRelateBeans(columnRslt_cont_fctr_flg,
				columnRslt_base_unit_schd_rqmt_qty, columnRslt_std_cont_fctr,
				columnRslt_act_cont_fctr, columnRslt_cont_fctr_dec_place,
				columnRslt_cont_fctr_rnd_typ);
		Rslt_cont_schd_fxd_rqmt_qty_p_PPanel.setRelateBeans(columnRslt_cont_fctr_flg,
				columnRslt_base_unit_schd_fxd_rqmt_qty, columnRslt_std_cont_fctr,
				columnRslt_act_cont_fctr, columnRslt_cont_fctr_dec_place,
				columnRslt_cont_fctr_rnd_typ);
		Rslt_cont_acxfr_act_qty_p_PPanel.setRelateBeans(columnRslt_cont_fctr_flg,
				columnRslt_acxfr_act_qty, columnRslt_std_cont_fctr,
				columnRslt_act_cont_fctr, columnRslt_cont_fctr_dec_place,
				columnRslt_cont_fctr_rnd_typ);
		Rslt_base_unit_mfg_inst_qty_p_PPanel.setRelateBeans(columnRslt_par_base_unit_cd,
				columnRslt_par_base_unit_dec_place);
		Rslt_base_unit_yield_schd_qty_p_PPanel.setRelateBeans(columnRslt_par_base_unit_cd,
				columnRslt_par_base_unit_dec_place);
		Rslt_base_unit_st_act_qty_p_PPanel.setRelateBeans(columnRslt_par_base_unit_cd,
				columnRslt_par_base_unit_dec_place);
		Rslt_base_unit_yield_qty_p_PPanel.setRelateBeans(columnRslt_par_base_unit_cd,
				columnRslt_par_base_unit_dec_place);
		Rslt_base_unit_dfct_qty_p_PPanel.setRelateBeans(columnRslt_par_base_unit_cd,
				columnRslt_par_base_unit_dec_place);
		Rslt_oper_unit_act_qty_p_PPanel.setRelateBeans(columnRslt_oper_unit_cd,
				columnRslt_oper_unit_dec_place);
		Rslt_oper_unit_schd_qty_p_PPanel.setRelateBeans(columnRslt_oper_unit_cd,
				columnRslt_oper_unit_dec_place);
		Rslt_acxfr_act_qty_p_PPanel.setRelateBeans(columnRslt_base_unit_cd,
				columnRslt_base_unit_dec_place);

		Rslt_chd_itm_grp_p_PPanel.setRelateBeans(Cnd_chd_itm_grp_p_PPanel);
		Rslt_par_itm_grp_p_PPanel.setRelateBeans(Cnd_par_itm_grp_p_PPanel);
	}

	// -----------------------------------------------
	// init-screen
	@Override
	protected void valueInit() {
		super.valueInit();
		valueInitSub();
	}

	protected void valueInitSub() {
		setValueEx(Cnd_srch_mode1_Group, Cnd_srch_mode1_SCHD.getActionCommand());
		setValueEx(Cnd_srch_mode2_Group, Cnd_srch_mode2_INPT.getActionCommand());
		clearCndDisp();
	}

	/**
	 * 表示単位変更時
	 */
	protected void clearCndDisp() {
		if (Cnd_srch_mode1_SCHD.isSelected()) {
			setValueEx(Cnd_srch_mode2_Group, Cnd_srch_mode2_INPT.getActionCommand());
			
			setValueEx(Cnd_oper_sav_flg, true);
			setValueEx(Cnd_oper_ord_flg, true);
			setValueEx(Cnd_oper_stt_flg, true);
			setValueEx(Cnd_oper_cmpl_flg, true);
			setValueEx(Cnd_inpt_sav_flg, true);
			setValueEx(Cnd_inpt_ord_flg, true);
			setValueEx(Cnd_inpt_stt_flg, true);
			setValueEx(Cnd_inpt_cmpl_flg, true);
			setValueEx(Cnd_inpt_no_schd_flg, false);
			
			setValueEx(Cnd_inpt_act_dt_fr, null);
			setValueEx(Cnd_inpt_act_hm_fr, null);
			setValueEx(Cnd_inpt_act_dt_to, null);
			setValueEx(Cnd_inpt_act_hm_to, null);
			setValueEx(Cnd_mfg_act_no, null);
			setValueEx(Cnd_oper_act_no, null);
			setValueEx(Cnd_inpt_act_no, null);
			setValueEx(Cnd_loss_act_no, null);
			setValueEx(Cnd_mes_id, null);
			setValueEx(Cnd_data_no, null);
			setValueEx(Cnd_ext_inpt_act_no, null);
			setValueEx(Cnd_inpt_act_rpt_rmrks, null);
			setValueEx(Cnd_inpt_act_intr_rmrks, null);
			setValueEx(Cnd_inpt_act_trd_rmrks, null);
			setValueEx(Cnd_inpt_act_sub_char1, null);
			setValueEx(Cnd_inpt_act_sub_char2, null);
			setValueEx(Cnd_inpt_act_sub_char3, null);
			setValueEx(Cnd_mfg_act_rpt_rmrks, null);
			setValueEx(Cnd_mfg_act_intr_rmrks, null);
			setValueEx(Cnd_mfg_act_sub_char1, null);
			setValueEx(Cnd_mfg_act_sub_char2, null);
			setValueEx(Cnd_mfg_act_sub_char3, null);
			setValueEx(Cnd_oper_act_intr_rmrks, null);
			setValueEx(Cnd_oper_act_rpt_rmrks, null);
			setValueEx(Cnd_oper_act_sub_char1, null);
			setValueEx(Cnd_oper_act_sub_char2, null);
			setValueEx(Cnd_oper_act_sub_char3, null);
		}
		else if (Cnd_srch_mode1_ACT.isSelected()) {
			setValueEx(Cnd_oper_sav_flg, false);
			setValueEx(Cnd_oper_ord_flg, false);
			setValueEx(Cnd_inpt_sav_flg, false);
			setValueEx(Cnd_inpt_ord_flg, false);
			setValueEx(Cnd_oper_stt_flg, true);
			setValueEx(Cnd_oper_cmpl_flg, true);
			setValueEx(Cnd_inpt_stt_flg, true);
			setValueEx(Cnd_inpt_cmpl_flg, true);
			setValueEx(Cnd_inpt_no_schd_flg, true);
			setValueEx(Cnd_pr_rate_fr, null);
			setValueEx(Cnd_pr_rate_to, null);
			setValueEx(Cnd_pr_rate_inc_loss_flg, false);
			
			if (Cnd_srch_mode2_INPT.isSelected()) {
				setValueEx(Cnd_loss_act_no, null);
			}
		}
	}
	
	//検索/指図
	@Override
	public void setSRCH_SCHDStatus() {
		super.setSRCH_SCHDStatus();
		FoldTab.focusActiveFirstComponent();
		setBtnMode();
	}

	//検索/実績/投入
	@Override
	public void setSRCH_ACT_INPTStatus() {
		super.setSRCH_ACT_INPTStatus();
		FoldTab.focusActiveFirstComponent();
		setBtnMode();
	}

	//検索/実績/ロス
	@Override
	public void setSRCH_ACT_LOSSStatus() {
		super.setSRCH_ACT_LOSSStatus();
		FoldTab.focusActiveFirstComponent();
		setBtnMode();
	}

	//参照/指図
	@Override
	public void setREF_SCHDStatus() {
		super.setREF_SCHDStatus();
		RsltTable.selectLeftmostColumn(0);
		setBtnMode();
	}

	//参照/実績/投入
	@Override
	public void setREF_ACT_INPTStatus() {
		super.setREF_ACT_INPTStatus();
		RsltTable.selectLeftmostColumn(0);
		setBtnMode();
	}

	//参照/実績/ロス
	@Override
	public void setREF_ACT_LOSSStatus() {
		super.setREF_ACT_LOSSStatus();
		RsltTable.selectLeftmostColumn(0);
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
			setDefaultMode(Btn_open_MSBCP1100);
		}
	}

	@Override
	public void doRslt_NC(MCEventInfo info) {
		super.doRslt_NC(info);
		setBtnMode();
	}

	@Override
	public void doCnd_srch_mode1_NC(MCEventInfo info){
		super.doCnd_srch_mode1_NC(info);
		clearContainers(getRsltL());
		setSrchStatus();
		clearCndDisp();
	}

	@Override
	public void doCnd_srch_mode2_NC(MCEventInfo info){
		super.doCnd_srch_mode2_NC(info);
		clearContainers(getRsltL());
		setSrchStatus();
		clearCndDisp();
	}
	
	protected void setSrchStatus() {
		if (Cnd_srch_mode1_SCHD.isSelected()) {
			setSRCH_SCHDStatus();
		}
		else if (Cnd_srch_mode1_ACT.isSelected()) {
			if (Cnd_srch_mode2_INPT.isSelected()) {
				setSRCH_ACT_INPTStatus();
			}
			else if (Cnd_srch_mode2_LOSS.isSelected()) {
				setSRCH_ACT_LOSSStatus();
			}
		}
		Ctrl_ctrl_PPanel.expand(true);
	}
	
	protected void setRefStatus() {
		if (Cnd_srch_mode1_SCHD.isSelected()) {
			setREF_SCHDStatus();
		}
		else if (Cnd_srch_mode1_ACT.isSelected()) {
			if (Cnd_srch_mode2_INPT.isSelected()) {
				setREF_ACT_INPTStatus();
			}
			else if (Cnd_srch_mode2_LOSS.isSelected()) {
				setREF_ACT_LOSSStatus();
			}
		}
		Ctrl_ctrl_PPanel.expand(false);
	}

}