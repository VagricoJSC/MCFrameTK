package mcframe.clientMSBE.MSBEP2250;

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
import mcframe.clientMAUB.MAUBP5030.*;
import mcframe.clientMAUB.MAUBP5040.*;
import mcframe.clientMAUB.MAUBP5050.*;
import mcframe.clientMAUB.MAUBP5060.*;
import mcframe.clientMAUB.MAUBP5170.*;
import mcframe.clientMAUB.MAUBP5190.*;
import mcframe.clientMAUB.MAUBP5360.*;
import mcframe.clientMSUB.MSUBP5020.*;
import mcframe.clientMSUB.MSUBP5040.*;

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
//FMCB CUSTOM_IMPORT END

/**
 * 画面"MSBEP_RcptIvSrch"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MSBEP_RcptIvSrch_MC extends MSBEP_RcptIvSrch_MC_A {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START

	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MSBEP_RcptIvSrch_MC() {
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
	public MSBEP_RcptIvSrch_MC(String name) {
		super(name);
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR_LIST START

		//FMCB CUSTOM_CONSTRUCTOR_LIST END
	}

	//画面処理メソッドはこれより下に定義してください。
	//FMCB CUSTOM_METHOD START

	/**
	 * [MS_MSBEL2250_Srch01]の定型処理のInnerClass
	 */
	protected class MS_MSBEL2250_Srch01Caller<P extends MSBEP_RcptIvSrch, B extends MS_MSBEL2250_Srch01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Searcher<P, B> {

		protected MS_MSBEL2250_Srch01Caller(P p, B b) {
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
			setRefStatus();
		}
		
		@Override
		protected void setModeNoDown() {
			super.setModeNoDown();
			setSrchStatus();
		}
		
	}
	/**
	 * [MS_MSBEL2250_Srch02]の定型処理のInnerClass
	 */
	protected class MS_MSBEL2250_Srch02Caller<P extends MSBEP_RcptIvSrch, B extends MS_MSBEL2250_Srch02Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Searcher<P, B> {

		protected MS_MSBEL2250_Srch02Caller(P p, B b) {
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
			setRefStatus();
		}
		
		@Override
		protected void setModeNoDown() {
			super.setModeNoDown();
			setSrchStatus();
		}	
		
	}

	
	@Override
	public void doRslt_NC(MCEventInfo info) {
		setBtnMode();
		super.doRslt_NC(info);
	}
	
	/**
	 * Panel[Ctrl]のボタン[ctrl_Ope_srch]の押下時の処理
	 */
	@Override
	public void doCtrl_ctrl_Ope_srch(MCEventInfo info) {
		if (Cnd_hdr_dtl_Dtl.isSelected()) {
			callMS_MSBEL2250_Srch01();
		}
		else if (Cnd_hdr_dtl_Hdr.isSelected()) {
			callMS_MSBEL2250_Srch02();
		}
	}
	/**
	 * Panel[RPnl]のボタン[dwnld]の押下時の処理
	 */
	@Override
	public void doRPnl_dwnld(MCEventInfo info) {
		if (Cnd_hdr_dtl_Dtl.isSelected()) {
			createMS_MSBEL2250_Srch01().execDL();
		}
		else if (Cnd_hdr_dtl_Hdr.isSelected()) {
			createMS_MSBEL2250_Srch02().execDL();
		}
	}
	@Override
	public void doDCEvent(MCDCBeans compo,MCEventInfo info) {
		super.doDCEvent(compo, info);
		if (compo == RsltTable) {
			doBtn_open_MSBEP2210(info);
		}
	}
	/**
	 * Panel[Btn]のボタン[open_MSBEP2210]の押下時の処理
	 */
	@Override
	public void doBtn_open_MSBEP2210(MCEventInfo info) {

		RsltR selR = RsltTable.getSelectedMCRow();

		if (selR == null) {
			dialog(msgNoSelectedRow());
			return;
		}

		MCRow bind = MCRow.create();
		bind.addStringColumn("rcpt_iv_no", selR.rcpt_iv_no());
		bind.addStringColumn("rcpt_iv_mng_no", selR.rcpt_iv_mng_no());
		bind.addNumberColumn("rcpt_iv_rev", selR.rcpt_iv_rev());
		openPanel("MS", "MSBEP2210", T2, bind);
	}
	/**
	 * Panel[Btn]のボタン[open_MSBEP1730]の押下時の処理
	 */
	@Override
	public void doBtn_open_MSBEP1730(MCEventInfo info) {
		RsltR row = RsltTable.getSelectedMCRow();	
		if (row == null) {	
			dialog(msgNoSelectedRow());
			return;
		}
		MCRow bind = MCRow.create();
		bind.addStringColumn("rcpt_iv_mng_no", row.rcpt_iv_mng_no());
		bind.addStringColumn("srch_tgt_no", row.rcpt_iv_no());
		bind.addStringColumn("iv_no", row.iv_no());

		openPanel("MS", "MSBEP1730", T3, bind);

	}
	
	// -----------------------------------------------
	// init-screen
	
	@Override
	protected void valueInit() {
		super.valueInit();
		valueInitSub();
	}
	
	protected void valueInitSub() {
		// 確定の初期表示
		setValueEx(Cnd_fix_flg, true);
		setValueEx(Cnd_not_fix_flg, true);
		
		// 仕入状況の初期表示
		setValueEx(Cnd_im_comp_flg, true);
		setValueEx(Cnd_im_not_comp_flg, true);
		
		// 表示単位の初期表示
		setValueEx(Cnd_hdr_dtl_Group, Cnd_hdr_dtl_Hdr.getActionCommand());
	}
	
	@Override
	public void setOpenFocus() {
		super.setOpenFocus();
		FoldTab.focusActiveFirstComponent();
	}
	
	@Override
	protected void setupParts() {
		super.setupParts();
		// 取引単価
		Rslt_trd_cur_upri_p_PPanel.setRelateBeans(columnRslt_trd_cur_cd, columnRslt_trd_upri_dec_place);
		Rslt_trd_cur_proc_upri_p_PPanel.setRelateBeans(columnRslt_trd_cur_cd, columnRslt_trd_upri_dec_place);
		Rslt_trd_cur_onr_prov_upri_p_PPanel.setRelateBeans(columnRslt_trd_cur_cd, columnRslt_trd_upri_dec_place);
		// 取引金額
		Rslt_ttl_trd_cur_amt_p_PPanel.setRelateBeans(columnRslt_trd_cur_cd, columnRslt_trd_amt_dec_place);
		Rslt_ttl_trd_cur_inc_tax_amt_p_PPanel.setRelateBeans(columnRslt_trd_cur_cd, columnRslt_trd_amt_dec_place);
		Rslt_trd_cur_dscnt_amt_p_PPanel.setRelateBeans(columnRslt_trd_cur_cd, columnRslt_trd_amt_dec_place);
		Rslt_trd_cur_amt_p_PPanel.setRelateBeans(columnRslt_trd_cur_cd, columnRslt_trd_amt_dec_place);
		Rslt_trd_cur_proc_amt_p_PPanel.setRelateBeans(columnRslt_trd_cur_cd, columnRslt_trd_amt_dec_place);
		Rslt_trd_cur_onr_prov_amt_p_PPanel.setRelateBeans(columnRslt_trd_cur_cd, columnRslt_trd_amt_dec_place);
		Rslt_trd_cur_inc_tax_amt_p_PPanel.setRelateBeans(columnRslt_trd_cur_cd, columnRslt_trd_amt_dec_place);
		Rslt_trd_cur_tax_amt_p_PPanel.setRelateBeans(columnRslt_trd_cur_cd, columnRslt_trd_amt_dec_place);
		Rslt_wtax_amt_p_PPanel.setRelateBeans(columnRslt_trd_cur_cd, columnRslt_trd_amt_dec_place);

		// 基準通貨単価
		Rslt_base_cur_upri_p_PPanel.setRelateBeans(columnRslt_base_cur_cd, columnRslt_base_upri_dec_place);
		Rslt_base_cur_proc_upri_p_PPanel.setRelateBeans(columnRslt_base_cur_cd, columnRslt_base_upri_dec_place);
		Rslt_base_cur_onr_prov_upri_p_PPanel.setRelateBeans(columnRslt_base_cur_cd, columnRslt_base_upri_dec_place);
		// 基準通貨金額
		Rslt_base_cur_dscnt_amt_p_PPanel.setRelateBeans(columnRslt_base_cur_cd, columnRslt_base_amt_dec_place);
		Rslt_base_cur_amt_p_PPanel.setRelateBeans(columnRslt_base_cur_cd, columnRslt_base_amt_dec_place);
		Rslt_base_cur_inc_ctax_amt_p_PPanel.setRelateBeans(columnRslt_base_cur_cd, columnRslt_base_amt_dec_place);
		Rslt_base_cur_tax_amt_p_PPanel.setRelateBeans(columnRslt_base_cur_cd, columnRslt_base_amt_dec_place);
		Rslt_base_cur_proc_amt_p_PPanel.setRelateBeans(columnRslt_base_cur_cd, columnRslt_base_amt_dec_place);
		Rslt_base_cur_onr_prov_amt_p_PPanel.setRelateBeans(columnRslt_base_cur_cd, columnRslt_base_amt_dec_place);

		// 納税通貨単価
		Rslt_ptax_cur_upri_p_PPanel.setRelateBeans(columnRslt_ptax_cur_cd, columnRslt_ptax_upri_dec_place);
		Rslt_ptax_cur_proc_upri_p_PPanel.setRelateBeans(columnRslt_ptax_cur_cd, columnRslt_ptax_upri_dec_place);
		Rslt_ptax_cur_onr_prov_upri_p_PPanel.setRelateBeans(columnRslt_ptax_cur_cd, columnRslt_ptax_upri_dec_place);
		// 納税通貨金額
		Rslt_ptax_cur_dscnt_amt_p_PPanel.setRelateBeans(columnRslt_ptax_cur_cd, columnRslt_ptax_amt_dec_place);
		Rslt_ptax_cur_amt_p_PPanel.setRelateBeans(columnRslt_ptax_cur_cd, columnRslt_ptax_amt_dec_place);
		Rslt_ptax_cur_inc_ctax_amt_p_PPanel.setRelateBeans(columnRslt_ptax_cur_cd, columnRslt_ptax_amt_dec_place);
		Rslt_ptax_cur_tax_amt_p_PPanel.setRelateBeans(columnRslt_ptax_cur_cd, columnRslt_ptax_amt_dec_place);
		Rslt_ptax_cur_proc_amt_p_PPanel.setRelateBeans(columnRslt_ptax_cur_cd, columnRslt_ptax_amt_dec_place);
		Rslt_ptax_cur_onr_prov_amt_p_PPanel.setRelateBeans(columnRslt_ptax_cur_cd, columnRslt_ptax_amt_dec_place);

		// 仕入予定数量
		Rslt_trd_unit_qty_p_PPanel.setRelateBeans(columnRslt_trd_unit_cd, columnRslt_trd_unit_dec_place);
		Rslt_purc_qty_p_PPanel.setRelateBeans(columnRslt_trd_unit_cd, columnRslt_trd_unit_dec_place);
		Rslt_arr_qty_p_PPanel.setRelateBeans(columnRslt_trd_unit_cd, columnRslt_trd_unit_dec_place);
		Rslt_base_unit_accpt_dfct_qty_p_PPanel.setRelateBeans(columnRslt_trd_unit_cd, columnRslt_trd_unit_dec_place);
		Rslt_base_unit_abort_qty_p_PPanel.setRelateBeans(columnRslt_trd_unit_cd, columnRslt_trd_unit_dec_place);
		Rslt_abort_qty_p_PPanel.setRelateBeans(columnRslt_trd_unit_cd, columnRslt_trd_unit_dec_place);
		
		// 明細
		Rslt_itm_grp_p_PPanel.setRelateBeans(Cnd_itm_grp_p_PPanel);
		Rslt_bp_grp_p_PPanel.setRelateBeans(Cnd_bp_grp_p_PPanel);
		
		Rslt_in_to_id_p_PPanel.setRelateBeans(columnRslt_in_to_id_cd, columnRslt_in_to_id_nm);
	}
	
	// -----------------------------------------------
	// status
	
	protected void setSrchStatus() {
		if (Cnd_hdr_dtl_Hdr.isSelected()) {
			setSRCH_HDRStatus();
		}
		else if (Cnd_hdr_dtl_Dtl.isSelected()) {
			setSRCH_DTLStatus();
		}
	}
	
	protected void setRefStatus() {
		if (Cnd_hdr_dtl_Hdr.isSelected()) {
			setREF_HDRStatus();
		}
		else if (Cnd_hdr_dtl_Dtl.isSelected()) {
			setREF_DTLStatus();
		}
		Ctrl_ctrl_PPanel.expand(false);
		RsltTable.selectLeftmostColumn(0);
	}
	
	@Override
	public void setSRCH_HDRStatus() {
		super.setSRCH_HDRStatus();
		FoldTab.focusActiveFirstComponent();
	}
	
	@Override
	public void setSRCH_DTLStatus() {
		super.setSRCH_DTLStatus();
		FoldTab.focusActiveFirstComponent();
	}
	
	@Override
	public void setREF_HDRStatus() {
		super.setREF_HDRStatus();
		setModeToIncCanFlg();
	}
	
	@Override
	public void setREF_DTLStatus() {
		super.setREF_DTLStatus();
		setModeToIncCanFlg();
	}
	
	protected void setBtnMode() {
		RsltR r = RsltTable.getSelectedMCRow();
		
		if (r == null) {
			Btn_open_MSBEP2210.setMode(MCMode.DISABLE);
		}
		else {
			Btn_open_MSBEP2210.setMode(MCMode.ENABLE);
		}
		
		if (r == null || isNull(r.iv_no())) {
			Btn_open_MSBEP1730.setMode(MCMode.DISABLE);
		}
		else {
			Btn_open_MSBEP1730.setMode(MCMode.ENABLE);
		}
		
	}
	
	public void Open_MBBCP0020(MCRootPanel panel, Map<String, String> args) {
		
		mcframe.clientMSBE.MSBEP2250.MSBEP_RcptIvSrch rootP = (mcframe.clientMSBE.MSBEP2250.MSBEP_RcptIvSrch)panel;
		if(!rootP.Cnd_hdr_dtl_Hdr.isSelected()) {
			message(MSBEP0104);
			return;
		}
		
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MB", "MBBCP0020");
		
		mcframe.clientMBBC.MBBCP0020.MBBCP_AttachmentLstReg_MC p = (mcframe.clientMBBC.MBBCP0020.MBBCP_AttachmentLstReg_MC)aso.getPanel();
		
		p.screenOpen(rootP, args);
	}
	
	// -----------------------------------------------
	// event
	@Override
	public void doCnd_hdr_dtl_NC(MCEventInfo info) {
		super.doCnd_hdr_dtl_NC(info);
		clearContainers(getRsltL());
		clearCnd();
		setSrchStatus();
	}
	
	protected void clearCnd() {
		if (Cnd_hdr_dtl_Hdr.isSelected()) {
			setValueEx(Cnd_rcpt_iv_d_no, null);
			setValueEx(Cnd_po_no, null);
			setValueEx(Cnd_po_d_no, null);
			setValueEx(Cnd_slo_no, null);
			setValueEx(Cnd_purc_usr_cd, null);
			setValueEx(Cnd_itm_typ, null);
			setValueEx(Cnd_itm_cd, null);
			setValueEx(Cnd_cst_itm_cd, null);
			setValueEx(Cnd_purc_dpt_cd, null);
			setValueEx(Cnd_rcpt_iv_d_rmrks, null);
			setValueEx(Cnd_sub_d_char1, null);
			setValueEx(Cnd_sub_d_char2, null);
			setValueEx(Cnd_sub_d_char3, null);
			setValueEx(Cnd_itm_grp_flg1, false);
			setValueEx(Cnd_itm_grp_flg2, false);
			setValueEx(Cnd_itm_grp_flg3, false);
			setValueEx(Cnd_itm_grp_flg4, false);
			setValueEx(Cnd_itm_grp_flg5, false);
			setValueEx(Cnd_itm_grp_flg6, false);
			setValueEx(Cnd_itm_grp_flg7, false);
			setValueEx(Cnd_itm_grp_flg8, false);
			setValueEx(Cnd_itm_grp_flg9, false);
			setValueEx(Cnd_itm_grp_flg10, false);
		}
		else if (Cnd_hdr_dtl_Dtl.isSelected()) {
			setValueEx(Cnd_inc_past_flg, false);
		}
	}
	
	@Override
	public void doCnd_inc_past_flg_NC(mcframe.clientCore.event.MCEventInfo info) {
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
	
	// -----------------------------------------------

	/**
	 * 検索条件項目のクライアントチェック処理（チェックボックス、日付項目）
	 * 
	 * @parama msgList メッセージ
	 */
	protected void checkForCallStackSub(MCMessageList msgList) {
		msgList.addAll(checkAtLeastOne(StsPanel));
		msgList.addAll(checkAtLeastOne(FixPanel));
		msgList.addAll(checkBeforeAfter(Cnd_purc_schd_dt_fr, Cnd_purc_schd_dt_to));
		msgList.addAll(checkBeforeAfter(Cnd_purc_dt_fr, Cnd_purc_dt_to));
		msgList.addAll(checkBeforeAfter(Cnd_iv_dt_fr, Cnd_iv_dt_to));
	}

}