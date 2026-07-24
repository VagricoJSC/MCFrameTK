package mcframe.clientMSBD.MSBDP0170;

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
import mcframe.clientMAUB.MAUBP0340.*;
import mcframe.clientMAUB.MAUBP5030.*;
import mcframe.clientMAUB.MAUBP5040.*;
import mcframe.clientMAUB.MAUBP5050.*;
import mcframe.clientMAUB.MAUBP5060.*;
import mcframe.clientMAUB.MAUBP5170.*;
import mcframe.clientMAUB.MAUBP5190.*;
import mcframe.clientMAUB.MAUBP5250.*;
import mcframe.clientMAUB.MAUBP5260.*;
import mcframe.clientMAUB.MAUBP5270.*;
import mcframe.clientMAUB.MAUBP5280.*;
import mcframe.clientMAUB.MAUBP5300.*;
import mcframe.clientMAUB.MAUBP5330.*;
import mcframe.clientMAUB.MAUBP5360.*;
import mcframe.clientMAUB.MAUBP5390.*;
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
import java.util.Map;
import java.util.HashMap;
//FMCB CUSTOM_IMPORT END

/**
 * 画面"MSBDP_PurcRetSrch"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MSBDP_PurcRetSrch_MC extends MSBDP_PurcRetSrch_MC_A {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START

	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MSBDP_PurcRetSrch_MC() {
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
	public MSBDP_PurcRetSrch_MC(String name) {
		super(name);
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR_LIST START

		//FMCB CUSTOM_CONSTRUCTOR_LIST END
	}

	//画面処理メソッドはこれより下に定義してください。
	//FMCB CUSTOM_METHOD START

	/**
	 * Panel[Btn]のボタン[open_MSBDP0180]の押下時の処理
	 */
	@Override
	public void doBtn_open_MSBDP0180(MCEventInfo info) {
		RsltR r = RsltTable.getSelectedMCRow();
		if (r == null) {
			dialog(msgNoSelectedRow());
			return;
		}
		
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MS", "MSBDP0180");
		aso.putCnd(crtOpenMSBDP0180CndR(aso, r));
		aso.putSearchAction();
		aso.show();
	}

	/**
	 * 遷移先[MABDP0180]の検索条件Rowコンテナを返します。
	 */
	protected mcframe.clientMSBD.MSBDP0180.CndR crtOpenMSBDP0180CndR(MAUCP_AppScreenOpener aso, RsltR r) {
		mcframe.clientMSBD.MSBDP0180.MSBDP_PurcDscntReg p = 
				(mcframe.clientMSBD.MSBDP0180.MSBDP_PurcDscntReg) aso.getPanel();
		mcframe.clientMSBD.MSBDP0180.CndR to = 
				mcframe.clientMSBD.MSBDP0180.CndR.create();
		
		to.ope(p.Cnd_ope_REF.getActionCommand());
		to.srch_tgt_no(r.purc_act_no());
		return to;
	}
	/**
	 * [MS_MSBDL0170_Srch01]の定型処理のInnerClass
	 */
	protected class MS_MSBDL0170_Srch01Caller<P extends MSBDP_PurcRetSrch, B extends MS_MSBDL0170_Srch01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Searcher<P, B> {

		protected MS_MSBDL0170_Srch01Caller(P p, B b) {
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
			checkForCallStackSub(msgList);
		}
		
		@Override
		protected void setMode() {
			super.setMode();
			setFocus();
		}
		
		@Override
		protected void setModeNoDown() {
			super.setModeNoDown();
			setFocus();
		}
	}

	/**
	 * [MS_MSBDL0170_Srch02]の定型処理のInnerClass
	 */
	protected class MS_MSBDL0170_Srch02Caller<P extends MSBDP_PurcRetSrch, B extends MS_MSBDL0170_Srch02Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Searcher<P, B> {

		protected MS_MSBDL0170_Srch02Caller(P p, B b) {
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
			checkForCallStackSub(msgList);
		}
		@Override
		protected void setMode() {
			super.setMode();
			
			if (Cnd_ope_PRNT.isSelected()) {
				setStatus(PRNT);
			}
			else {
				if (Cnd_mode_SRCH_HDR.isSelected()) {
					setStatus(REF_ACT_HDR);
				}
				else if (Cnd_mode_SRCH_DTL.isSelected()) {
					setStatus(REF_ACT_DTL);
				}
				else if (Cnd_mode_SRCH_LST.isSelected()) {
					setStatus(REF_ACT_LST);
				}
			}
			
			setFocus();

		}
		
		@Override
		protected void setModeNoDown() {
			super.setModeNoDown();
			
			if (Cnd_ope_PRNT.isSelected()) {
				setStatus(SRCH_PRNT);
			}
			else {
				if (Cnd_mode_SRCH_HDR.isSelected()) {
					setStatus(SRCH_ACT_HDR);
				}
				else if (Cnd_mode_SRCH_DTL.isSelected()) {
					setStatus(SRCH_ACT_DTL);
				}
				else if (Cnd_mode_SRCH_LST.isSelected()) {
					setStatus(SRCH_ACT_LST);
				}
			}
			
			setFocus();

		}
	}
		@Override
		public void setREF_ACT_HDRStatus() {
			super.setREF_ACT_HDRStatus();
			setModeToIncCanFlg();
		}
		@Override
		public void setSRCH_ACT_HDRStatus() {
			super.setSRCH_ACT_HDRStatus();
			setModeToIncCanFlg();
		}
		
	/**
	 * [MS_MSBDL0170_Prnt01]の定型処理のInnerClass
	 */
	protected class MS_MSBDL0170_Prnt01Caller<P extends MSBDP_PurcRetSrch, B extends MS_MSBDL0170_Prnt01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Printer<P, B> {

		protected MS_MSBDL0170_Prnt01Caller(P p, B b) {
			super(p, b);
		}
		
		@Override
		protected void initCaller() {
			super.initCaller();
			setCheckedRowMode(true);
		}
	}


	/**
	 * Panel[Ctrl]のボタン[ctrl_Ope_srch]の押下時の処理
	 */
	@Override
	public void doCtrl_ctrl_Ope_srch(MCEventInfo info) {
		if (Cnd_ope_SRCH_SCHD_REF.isSelected()) {
			callMS_MSBDL0170_Srch01();
		}
		else if (Cnd_ope_SRCH_ACT_REF.isSelected() || Cnd_ope_PRNT.isSelected()) {
			callMS_MSBDL0170_Srch02();
		}
	}
	/**
	 * Panel[RPnl]のボタン[dwnld]の押下時の処理
	 */
	@Override
	public void doRPnl_dwnld(MCEventInfo info) {
		if (Cnd_ope_SRCH_SCHD_REF.isSelected()) {
			createMS_MSBDL0170_Srch01().execDL();
		}
		else if (Cnd_ope_SRCH_ACT_REF.isSelected() || Cnd_ope_PRNT.isSelected()) {
			createMS_MSBDL0170_Srch02().execDL();
		}
	}
	/**
	 * Panel[Btn]のボタン[open_MSBDP0150]の押下時の処理
	 */
	@Override
	public void doBtn_open_MSBDP0150(MCEventInfo info) {
		RsltR r = RsltTable.getSelectedMCRow();
		if (r == null) {
			dialog(msgNoSelectedRow());
			return;
		}
		
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MS", "MSBDP0150");
		aso.putCnd(crtOpenMSBDP0150CndR(aso, r));
		aso.putSearchAction();
		aso.show();
	}
	/**
	 * 遷移先[MABDP0150]の検索条件Rowコンテナを返します。
	 */
	protected mcframe.clientMSBD.MSBDP0150.CndR crtOpenMSBDP0150CndR(MAUCP_AppScreenOpener aso, RsltR r) {
		mcframe.clientMSBD.MSBDP0150.MSBDP_PurcRetSchdReg p = 
				(mcframe.clientMSBD.MSBDP0150.MSBDP_PurcRetSchdReg) aso.getPanel();
		mcframe.clientMSBD.MSBDP0150.CndR to = 
				mcframe.clientMSBD.MSBDP0150.CndR.create();
		
		to.ope(p.Cnd_ope_REF.getActionCommand());
		to.srch_tgt_no(r.purc_ret_schd_no());
		return to;
	}
	/**
	 * Panel[Btn]のボタン[open_MSBDP0160]の押下時の処理
	 */
	@Override
	public void doBtn_open_MSBDP0160(MCEventInfo info) {
		RsltR r = RsltTable.getSelectedMCRow();
		if (r == null) {
			dialog(msgNoSelectedRow());
			return;
		}
		
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MS", "MSBDP0160");
		aso.putCnd(crtOpenMSBDP0160CndR(aso, r));
		aso.putSearchAction();
		aso.show();
	}

	/**
	 * 遷移先[MABDP0160]の検索条件Rowコンテナを返します。
	 */
	protected mcframe.clientMSBD.MSBDP0160.CndR crtOpenMSBDP0160CndR(MAUCP_AppScreenOpener aso, RsltR r) {
		mcframe.clientMSBD.MSBDP0160.MSBDP_PurcRetReg p = 
				(mcframe.clientMSBD.MSBDP0160.MSBDP_PurcRetReg) aso.getPanel();
		mcframe.clientMSBD.MSBDP0160.CndR to = 
				mcframe.clientMSBD.MSBDP0160.CndR.create();
		
		if (Cnd_ope_SRCH_SCHD_REF.isSelected()) {
			to.ope(p.Cnd_ope_INS.getActionCommand());
			to.srch_tgt_typ_nm(MSC_PURC_SRCH_TGT_TYP.PURC_RET_SCHD_NO.name());
			to.srch_tgt_no(r.purc_ret_schd_no());
		}
		else {
			to.ope(p.Cnd_ope_REF.getActionCommand());
			to.srch_tgt_no(r.purc_ret_act_no());
			to.srch_tgt_rev(r.purc_ret_act_rev());
		}
		return to;
	}
	
	public void Open_MBBCP0020(MCRootPanel panel, Map<String, String> args) {
		
		mcframe.clientMSBD.MSBDP0170.MSBDP_PurcRetSrch rootP = (mcframe.clientMSBD.MSBDP0170.MSBDP_PurcRetSrch)panel;
		if(!rootP.Cnd_ope_PRNT.isSelected() &&
		   !(rootP.Cnd_ope_SRCH_ACT_REF.isSelected() && rootP.Cnd_mode_SRCH_HDR.isSelected())) {
			dialog(MSBDP0101);
			return;
		}
		
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MB", "MBBCP0020");
		
		mcframe.clientMBBC.MBBCP0020.MBBCP_AttachmentLstReg_MC p = (mcframe.clientMBBC.MBBCP0020.MBBCP_AttachmentLstReg_MC)aso.getPanel();
		
		p.screenOpen(rootP, args);
	}
	
	/**
	 * Panel[Btn]のボタン[prnt]の押下時の処理
	 */
	@Override
	public void doBtn_prnt(MCEventInfo info) {
		callMS_MSBDL0170_Prnt01();
	}
	/**
	 * Panel[Btn]のボタン[select_all]の押下時の処理
	 */
	@Override
	public void doBtn_select_all(MCEventInfo info) {
		doSelectAll(RsltTable);
	}
	/**
	 * Panel[Btn]のボタン[deselect_all]の押下時の処理
	 */
	@Override
	public void doBtn_deselect_all(MCEventInfo info) {
		doDeselectAll(RsltTable);
	}
	// --------------------画面初期値設定start--------------------
	@Override
	protected void setupParts() {
		super.setupParts();
		Cnd_ver_no_p_PPanel.setRelateBeans(Cnd_itm_cd, Cnd_itm_sub1, Cnd_itm_sub2, Cnd_itm_sub3, null, null);
		Rslt_ver_no_p_PPanel.setRelateBeans(Rslt_itm_p_PPanel.columnItm_itm_cd, 
					Rslt_itm_p_PPanel.columnItm_itm_sub1, 
					Rslt_itm_p_PPanel.columnItm_itm_sub2, 
					Rslt_itm_p_PPanel.columnItm_itm_sub3, 
					columnRslt_site_cd, columnRslt_ver_flg);
		Rslt_trd_unit_qty_p_PPanel.setRelateBeans(columnRslt_trd_unit_cd, columnRslt_trd_qty_dec_place);
		Rslt_base_unit_qty_p_PPanel.setRelateBeans(columnRslt_base_unit_cd, columnRslt_base_qty_dec_place);
		Rslt_ret_qty_p_PPanel.setRelateBeans(columnRslt_base_unit_cd, columnRslt_base_qty_dec_place);
		
		Rslt_trd_cur_upri_p_PPanel.setRelateBeans(columnRslt_trd_cur_cd, columnRslt_trd_upri_dec_place);
		Rslt_trd_cur_proc_upri_p_PPanel.setRelateBeans(columnRslt_trd_cur_cd, columnRslt_trd_upri_dec_place);
		Rslt_trd_cur_onr_prov_upri_p_PPanel.setRelateBeans(columnRslt_trd_cur_cd, columnRslt_trd_upri_dec_place);
		Rslt_trd_cur_dscnt_amt_p_PPanel.setRelateBeans(columnRslt_trd_cur_cd, columnRslt_trd_amt_dec_place);
		Rslt_trd_cur_amt_p_PPanel.setRelateBeans(columnRslt_trd_cur_cd, columnRslt_trd_amt_dec_place);
		Rslt_trd_cur_proc_amt_p_PPanel.setRelateBeans(columnRslt_trd_cur_cd, columnRslt_trd_amt_dec_place);
		Rslt_trd_cur_onr_prov_amt_p_PPanel.setRelateBeans(columnRslt_trd_cur_cd, columnRslt_trd_amt_dec_place);
		Rslt_trd_cur_amt_inc_tax_cur_amt_p_PPanel.setRelateBeans(columnRslt_trd_cur_cd, columnRslt_trd_amt_dec_place);
		Rslt_trd_cur_tax_amt_p_PPanel.setRelateBeans(columnRslt_trd_cur_cd, columnRslt_trd_amt_dec_place);
		
		Rslt_base_cur_upri_p_PPanel.setRelateBeans(columnRslt_base_cur_cd, columnRslt_base_upri_dec_place);
		Rslt_base_cur_proc_upri_p_PPanel.setRelateBeans(columnRslt_base_cur_cd, columnRslt_base_upri_dec_place);
		Rslt_base_cur_onr_prov_upri_p_PPanel.setRelateBeans(columnRslt_base_cur_cd, columnRslt_base_upri_dec_place);
		Rslt_base_cur_dscnt_amt_p_PPanel.setRelateBeans(columnRslt_base_cur_cd, columnRslt_base_amt_dec_place);
		Rslt_base_cur_amt_p_PPanel.setRelateBeans(columnRslt_base_cur_cd, columnRslt_base_amt_dec_place);
		Rslt_base_cur_proc_amt_p_PPanel.setRelateBeans(columnRslt_base_cur_cd, columnRslt_base_amt_dec_place);
		Rslt_base_cur_onr_prov_amt_p_PPanel.setRelateBeans(columnRslt_base_cur_cd, columnRslt_base_amt_dec_place);
		Rslt_base_cur_amt_inc_tax_cur_amt_p_PPanel.setRelateBeans(columnRslt_base_cur_cd, columnRslt_base_amt_dec_place);
		Rslt_base_cur_tax_amt_p_PPanel.setRelateBeans(columnRslt_base_cur_cd, columnRslt_base_amt_dec_place);

		Rslt_ptax_cur_upri_p_PPanel.setRelateBeans(columnRslt_ptax_cur_cd, columnRslt_ptax_upri_dec_place);
		Rslt_ptax_cur_proc_upri_p_PPanel.setRelateBeans(columnRslt_ptax_cur_cd, columnRslt_ptax_upri_dec_place);
		Rslt_ptax_cur_onr_prov_upri_p_PPanel.setRelateBeans(columnRslt_ptax_cur_cd, columnRslt_ptax_upri_dec_place);
		Rslt_ptax_cur_dscnt_amt_p_PPanel.setRelateBeans(columnRslt_ptax_cur_cd, columnRslt_ptax_amt_dec_place);
		Rslt_ptax_cur_amt_p_PPanel.setRelateBeans(columnRslt_ptax_cur_cd, columnRslt_ptax_amt_dec_place);
		Rslt_ptax_cur_tax_amt_p_PPanel.setRelateBeans(columnRslt_ptax_cur_cd, columnRslt_ptax_amt_dec_place);
		Rslt_ptax_cur_inc_tax_amt_p_PPanel.setRelateBeans(columnRslt_ptax_cur_cd, columnRslt_ptax_amt_dec_place);

		Rslt_wtax_amt_p_PPanel.setRelateBeans(columnRslt_trd_cur_cd, columnRslt_trd_amt_dec_place);
		
		Rslt_purc_cont_qty_p_PPanel.setRelateBeans(columnRslt_cont_fctr_flg, 
									Rslt_cont_qty_p_PPanel.columnContQty_cont_qty, 
									Rslt_std_cont_fctr_p_PPanel.columnStdContFctr_std_cont_fctr, 
									null, 
									columnRslt_cont_fctr_dec_place, columnRslt_cont_fctr_rnd_typ);

		Rslt_cont_qty_p_PPanel.setRelateBeans(columnRslt_cont_fctr_flg, 
									Rslt_cont_qty_p_PPanel.columnContQty_cont_qty, 
									Rslt_std_cont_fctr_p_PPanel.columnStdContFctr_std_cont_fctr, 
									null, 
									columnRslt_cont_fctr_dec_place, columnRslt_cont_fctr_rnd_typ);
		
		Rslt_sppl_grp_p_PPanel.setRelateBeans(Cnd_sppl_grp_p_PPanel);
		Rslt_itm_grp_p_PPanel.setRelateBeans(Cnd_itm_grp_p_PPanel);
		Rslt_ret_sppl_addr_p_PPanel.setRelateBeans(columnRslt_ret_sppl_nm);
	}
	
	@Override
	protected void valueInit() {
		super.valueInit();
		valueInitSub();
	}
	
	protected void valueInitSub() {
		setValueEx(Cnd_ope_Group, Cnd_ope_SRCH_SCHD_REF.getActionCommand());
		setValueEx(Cnd_mode_Group, Cnd_mode_SRCH_HDR.getActionCommand());
		
		setBoolean(TrnstPanel, true);
		setBoolean(IvPanel, true);
		setBoolean(ProcTypPanel, true);
	}
	
	@Override
	public void setOpenFocus() {
		super.setOpenFocus();
		FoldTab.focusActiveFirstComponent();
	}
	// --------------------画面初期値設定end----------------------
	// --------------------イベント処理start------------------------
	protected void setFocus() {
		
		if (getRsltL().size() > 0) {
			RsltTable.selectLeftmostColumn(0);
			Ctrl_ctrl_PPanel.expand(false);
		}
		else {
			CndPanel.focusFirstComponent();
			Ctrl_ctrl_PPanel.expand(true);
		}
	}
	
	@Override
	public void doCnd_ope_NC(MCEventInfo info) {
		super.doCnd_ope_NC(info);
		if (Cnd_ope_PRNT.isSelected()) {
			setValueEx(Cnd_mode_Group, Cnd_mode_SRCH_HDR.getActionCommand());
		}
		setStatusSub();
		setFocus();
	}
	
	@Override
	public void doCnd_mode_NC(MCEventInfo info) {
		super.doCnd_mode_NC(info);
		setStatusSub();
	}
	
	/**
	 * ステータス選択＆画面クリア処理
	 */
	protected void setStatusSub() {
		clear(RsltTable);
		if (Cnd_ope_SRCH_SCHD_REF.isSelected()) {
			setValueEx(Cnd_purc_ret_dt_fr, null);
			setValueEx(Cnd_purc_ret_dt_to, null);
			setValueEx(Cnd_ac_dt_fr, null);
			setValueEx(Cnd_ac_dt_to, null);
			setValueEx(Cnd_inc_ret_dscnt_flg, false);
			setValueEx(Cnd_purc_ret_act_no, null);
			setValueEx(Cnd_purc_ret_act_d_no, null);
			setValueEx(Cnd_purc_ret_print_rmrks, null);
			setValueEx(Cnd_purc_ret_print_d_rmrks, null);
			setValueEx(Cnd_act_trd_rmrks, null);
			setValueEx(Cnd_act_trd_d_rmrks, null);
			setValueEx(Cnd_act_intr_rmrks, null);
			setValueEx(Cnd_act_intr_d_rmrks, null);
			setValueEx(Cnd_act_sub_char1, null);
			setValueEx(Cnd_act_sub_char2, null);
			setValueEx(Cnd_act_sub_char3, null);
			setValueEx(Cnd_act_d_sub_char1, null);
			setValueEx(Cnd_act_d_sub_char2, null);
			setValueEx(Cnd_act_d_sub_char3, null);
			setValueEx(Cnd_act_io_sub_char1, null);
			setValueEx(Cnd_act_io_sub_char2, null);
			setValueEx(Cnd_act_io_sub_char3, null);
			setValueEx(Cnd_inc_can_flg, false);
			setBoolean(ProcTypPanel, false);
			setBoolean(TrnstPanel, true);
			
			if (Cnd_mode_SRCH_HDR.isSelected()) {
				setBoolean(TrnstPanel, false);
				setValueEx(Cnd_po_no, null);
				setValueEx(Cnd_schd_trd_d_rmrks, null);
				setValueEx(Cnd_schd_d_sub_char1, null);
				setValueEx(Cnd_schd_d_sub_char2, null);
				setValueEx(Cnd_schd_d_sub_char3, null);
				setValueEx(Cnd_schd_io_sub_char1, null);
				setValueEx(Cnd_schd_io_sub_char2, null);
				setValueEx(Cnd_schd_io_sub_char3, null);
				
				clearHdrModeColumn();

				setStatus(SRCH_SCHD_HDR);
			}
			else if (Cnd_mode_SRCH_DTL.isSelected()) {
				setValueEx(Cnd_schd_io_sub_char1, null);
				setValueEx(Cnd_schd_io_sub_char2, null);
				setValueEx(Cnd_schd_io_sub_char3, null);
				setStatus(SRCH_SCHD_DTL);
			}
			else if (Cnd_mode_SRCH_LST.isSelected()) {
				setStatus(SRCH_SCHD_LST);
			}
		}
		else if (Cnd_ope_SRCH_ACT_REF.isSelected() || Cnd_ope_PRNT.isSelected()) {
			setBoolean(TrnstPanel, false);
			setValueEx(Cnd_schd_dt_fr, null);
			setValueEx(Cnd_schd_dt_to, null);
			setValueEx(Cnd_schd_trd_rmrks, null);
			setValueEx(Cnd_schd_trd_d_rmrks, null);
			setValueEx(Cnd_schd_intr_rmrks, null);
			setValueEx(Cnd_schd_intr_d_rmrks, null);
			setValueEx(Cnd_schd_sub_char1, null);
			setValueEx(Cnd_schd_sub_char2, null);
			setValueEx(Cnd_schd_sub_char3, null);
			setValueEx(Cnd_schd_d_sub_char1, null);
			setValueEx(Cnd_schd_d_sub_char2, null);
			setValueEx(Cnd_schd_d_sub_char3, null);
			setValueEx(Cnd_schd_io_sub_char1, null);
			setValueEx(Cnd_schd_io_sub_char2, null);
			setValueEx(Cnd_schd_io_sub_char3, null);

			setBoolean(ProcTypPanel,true);
			
			if (Cnd_mode_SRCH_HDR.isSelected()) {
				setValueEx(Cnd_purc_ret_act_d_no, null);
				setValueEx(Cnd_purc_ret_print_d_rmrks, null);
				setValueEx(Cnd_act_trd_d_rmrks, null);
				setValueEx(Cnd_act_intr_d_rmrks, null);
				setValueEx(Cnd_act_d_sub_char1, null);
				setValueEx(Cnd_act_d_sub_char2, null);
				setValueEx(Cnd_act_d_sub_char3, null);
				setValueEx(Cnd_act_io_sub_char1, null);
				setValueEx(Cnd_act_io_sub_char2, null);
				setValueEx(Cnd_act_io_sub_char3, null);
				
				clearHdrModeColumn();
				if (Cnd_ope_SRCH_ACT_REF.isSelected()) {
					setStatus(SRCH_ACT_HDR);
				}
				else {
					setStatus(SRCH_PRNT);
					Cnd_mode_SRCH_DTL.setMode(MCMode.DISABLE);
					Cnd_mode_SRCH_LST.setMode(MCMode.DISABLE);
				}
				
			}
			else if (Cnd_mode_SRCH_DTL.isSelected()) {
				setValueEx(Cnd_act_io_sub_char1, null);
				setValueEx(Cnd_act_io_sub_char2, null);
				setValueEx(Cnd_act_io_sub_char3, null);
				
				setStatus(SRCH_ACT_DTL);
			}
			else if (Cnd_mode_SRCH_LST.isSelected()) {
				setStatus(SRCH_ACT_LST);
			}
		}

		setValueEx(Cnd_inc_past_flg, false);
	}
	/**
	 * 検索モード:ヘッダ時に値を消すカラム
	 */
	protected void clearHdrModeColumn() {
		setValueEx(Cnd_site_cd, null);
		setValueEx(Cnd_site_nm, null);
		setValueEx(Cnd_loc_wg_cd, null);
		setValueEx(Cnd_loc_wg_nm, null);
		setValueEx(Cnd_purc_ret_loc_cd, null);
		setValueEx(Cnd_purc_ret_loc_nm, null);
		setValueEx(Cnd_str_ln_cd, null);
		setValueEx(Cnd_str_ln_nm, null);
		setValueEx(Cnd_itm_typ_p_PPanel.ItmTyp_itm_typ, null);
		setValueEx(Cnd_itm_typ_p_PPanel.ItmTyp_itm_typ_d_cd, null);
		setValueEx(Cnd_itm_typ_p_PPanel.ItmTyp_itm_typ_d_nm, null);
		setValueEx(Cnd_itm_p_PPanel.Itm_itm_cd, null);
		setValueEx(Cnd_itm_p_PPanel.Itm_itm_sub1, null);
		setValueEx(Cnd_itm_p_PPanel.Itm_itm_sub2, null);
		setValueEx(Cnd_itm_p_PPanel.Itm_itm_sub3, null);
		setValueEx(Cnd_itm_p_PPanel.Itm_itm_nm, null);
		setValueEx(Cnd_ver_no, null);
		setValueEx(Cnd_lot_no, null);
		setValueEx(Cnd_sublot_no, null);
		setValueEx(Cnd_iv_itm_nm, null);
		setValueEx(Cnd_gd_cd, null);
		setValueEx(Cnd_gd_nm, null);
		setValueEx(Cnd_sno_p_PPanel.SnoWrkNo_sno1, null);
		setValueEx(Cnd_sno_p_PPanel.SnoWrkNo_sno2, null);
		setValueEx(Cnd_sno_p_PPanel.SnoWrkNo_sno3, null);
		setValueEx(Cnd_sno_p_PPanel.SnoWrkNo_sno4, null);
		setValueEx(Cnd_ap_dpt_cd, null);
		setValueEx(Cnd_ap_dpt_nm, null);
		setValueEx(Cnd_purc_ret_schd_d_no, null);
		setValueEx(Cnd_maker_cd, null);
		setValueEx(Cnd_maker_nm, null);
		
		setValueEx(Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_flg1, false);
		setValueEx(Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_flg2, false);
		setValueEx(Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_flg3, false);
		setValueEx(Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_flg4, false);
		setValueEx(Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_flg5, false);
		setValueEx(Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_flg6, false);
		setValueEx(Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_flg7, false);
		setValueEx(Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_flg8, false);
		setValueEx(Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_flg9, false);
		setValueEx(Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_flg10, false);
	}
	
	@Override
	public void doRslt_NC(MCEventInfo info){
		super.doRslt_NC(info);
		RsltR r = RsltTable.getSelectedMCRow();

		setDefaultMode(Btn_open_MSBDP0150);
		setDefaultMode(Btn_open_MSBDP0160);
		setDefaultMode(Btn_open_MSBDP0180);
		if (!isNull(r)) {
			if (Cnd_ope_SRCH_SCHD_REF.isSelected() && !isNull(r.purc_ret_schd_no())) {
				Btn_open_MSBDP0150.setMode(MCMode.ENABLE);
			}
			else if (Cnd_ope_SRCH_ACT_REF.isSelected() && !isNull(r.purc_ret_act_no())) {
				Btn_open_MSBDP0160.setMode(MCMode.ENABLE);
			}
			else if (Cnd_ope_SRCH_ACT_REF.isSelected() && !isNull(r.purc_act_no())) {
				Btn_open_MSBDP0180.setMode(MCMode.ENABLE);
			}
			
			if (!r.abort_flg() && Cnd_ope_SRCH_SCHD_REF.isSelected()
					&& (MSC_PRET_SCHD_STS_TYP.isNON(r.sret_schd_sts_typ())
							|| MSC_PRET_SCHD_STS_TYP.isPART(r.sret_schd_sts_typ()))) {
				Btn_open_MSBDP0160.setMode(MCMode.ENABLE);
			}
		}
	}
	@Override
	public void doDCEvent(MCDCBeans compo, MCEventInfo info) {
		super.doDCEvent(compo, info);
		if (compo == RsltTable) {
			for (MCButton b : getDCOpenTgt()) {
				if (b.isEnabled()) {
					b.doAP();
					break;
				}	
			}
		}	
	}
	
	/**
	 * DCイベントで実行するボタンを返す。
	 * 優先順で格納されたボタンの配列を返す。
	 */
	protected MCButton[] getDCOpenTgt() {
		return new MCButton[]{Btn_open_MSBDP0180,Btn_open_MSBDP0160,Btn_open_MSBDP0150};
	}
	// --------------------イベント処理end--------------------------
	
	
	protected void checkForCallStackSub(MCMessageList msgList) {
		if (Cnd_ope_SRCH_SCHD_REF.isSelected()) {
			if (!Cnd_mode_SRCH_HDR.isSelected()) {
				msgList.addAll(checkAtLeastOne(TrnstPanel));
			}
			msgList.addAll(checkAtLeastOne(IvPanel));
			msgList.addAll(checkBeforeAfter(Cnd_schd_dt_fr, Cnd_schd_dt_to));
		}
		else if (Cnd_ope_SRCH_ACT_REF.isSelected() || Cnd_ope_PRNT.isSelected()) {
			msgList.addAll(checkAtLeastOne(ProcTypPanel));
			msgList.addAll(checkBeforeAfter(Cnd_purc_ret_dt_fr, Cnd_purc_ret_dt_to));
			msgList.addAll(checkBeforeAfter(Cnd_ac_dt_fr, Cnd_ac_dt_to));
		}
	}
	@Override
	public void doCnd_inc_past_flg_NC(MCEventInfo info) {
		super.doCnd_inc_past_flg_NC(info);
		setModeToIncCanFlg();
	}
	
	protected void setModeToIncCanFlg() {
		if (getCndR().inc_past_flg()) {
			setValueEx(Cnd_inc_can_flg, true);
			Cnd_inc_can_flg.setMode(MCMode.READ_ONLY);
		}
		else {
			setDefaultMode(Cnd_inc_can_flg);
		}
	}

}