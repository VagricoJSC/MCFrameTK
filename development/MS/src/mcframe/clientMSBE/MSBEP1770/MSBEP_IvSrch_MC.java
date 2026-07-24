package mcframe.clientMSBE.MSBEP1770;

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
import mcframe.clientMAUB.MAUBP5050.*;
import mcframe.clientMAUB.MAUBP5060.*;
import mcframe.clientMAUB.MAUBP5150.*;
import mcframe.clientMAUB.MAUBP5170.*;
import mcframe.clientMAUB.MAUBP5190.*;
import mcframe.clientMAUB.MAUBP5250.*;
import mcframe.clientMAUB.MAUBP5310.*;
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
 * 画面"MSBEP_IvSrch"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MSBEP_IvSrch_MC extends MSBEP_IvSrch_MC_A {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START

	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MSBEP_IvSrch_MC() {
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
	public MSBEP_IvSrch_MC(String name) {
		super(name);
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR_LIST START

		//FMCB CUSTOM_CONSTRUCTOR_LIST END
	}

	//画面処理メソッドはこれより下に定義してください。
	//FMCB CUSTOM_METHOD START

	/**
	 * [MS_MSBEL1770_Prnt01]の定型処理のInnerClass
	 */
	protected class MS_MSBEL1770_Prnt01Caller<P extends MSBEP_IvSrch, B extends MS_MSBEL1770_Prnt01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Printer<P, B> {

		protected MS_MSBEL1770_Prnt01Caller(P p, B b) {
			super(p, b);
		}
		
		@Override
		protected void initCaller() {
			super.initCaller();
			setCheckedRowMode(true);
		}
		
		@Override
		protected void setMode() {
			super.setMode();
			
			setSRCH_PRNTStatus();
			setBtnMode(); // 発行前後でボタンのモードが変わらないようにするため実行する
		}

	}

	/**
	 * [MS_MSBEL1770_Prnt02]の定型処理のInnerClass
	 */
	protected class MS_MSBEL1770_Prnt02Caller<P extends MSBEP_IvSrch, B extends MS_MSBEL1770_Prnt02Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Printer<P, B> {

		protected MS_MSBEL1770_Prnt02Caller(P p, B b) {
			super(p, b);
		}
		
		@Override
		protected void initCaller() {
			super.initCaller();
			setCheckedRowMode(true);
		}
		
		@Override
		protected void setMode() {
			super.setMode();
			
			setSRCH_PRNTStatus();
			setBtnMode(); // 発行前後でボタンのモードが変わらないようにするため実行する
		}
	}

	/**
	 * [MS_MSBEL1770_Srch01]の定型処理のInnerClass
	 */
	protected class MS_MSBEL1770_Srch01Caller<P extends MSBEP_IvSrch, B extends MS_MSBEL1770_Srch01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Searcher<P, B> {

		protected MS_MSBEL1770_Srch01Caller(P p, B b) {
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
			checkForCallStackForSrch(msgList);
		}
		/**
		 * 検索条件のチェックの共通処理
		 * @param msgList
		 */
		protected void checkForCallStackForSrch(MCMessageList msgList) {
			msgList.addAll(checkBeforeAfter(Cnd_cmpl_schd_dt_fr, Cnd_cmpl_schd_dt_to));
			msgList.addAll(checkBeforeAfter(Cnd_cmpl_dt_fr, Cnd_cmpl_dt_to));
			msgList.addAll(checkBeforeAfter(Cnd_iv_dt_fr, Cnd_iv_dt_to));
			msgList.addAll(checkBeforeAfter(Cnd_dlv_rqst_hm_fr, Cnd_dlv_rqst_hm_to));
			msgList.addAll(checkAtLeastOne(ExImPanel));
			if (!Cnd_srch_mode_SHIP_INST.isSelected()
					&& !Cnd_srch_mode_SHIP_ACT.isSelected()
					&& !Cnd_srch_mode_SLS_ACT.isSelected()) {
				msgList.addAll(checkAtLeastOne(PurcImPanel));
			}
			msgList.addAll(checkAtLeastOne(IvRegPanel));
			msgList.addAll(checkAtLeastOne(PlRegPanel));
			msgList.addAll(checkAtLeastOne(IvPrntPanel));
			msgList.addAll(checkAtLeastOne(PlPrntPanel));
			msgList.addAll(checkAtLeastOne(SlsCststkPanel));
			if (!Cnd_srch_mode_HDR.isSelected()) {
				msgList.addAll(checkAtLeastOne(PrStsPanel));
			}
			if (Cnd_srch_mode_HDR.isSelected()) {
				msgList.addAll(checkAtLeastOne(IvImPanel));
			}

		}
		@Override
		protected void setMode() {
			super.setMode();
			
			if(Cnd_ope_PRNT.isSelected()){
				setPRNTStatus();
			}
			setBtnMode();
			setModeIncCanFlg();
			Ctrl_ctrl_PPanel.expand(false);
			RsltTable.selectLeftmostColumn(0);
		}
		
		@Override
		protected void setModeNoDown() {
			super.setModeNoDown();

			if(Cnd_ope_PRNT.isSelected()){
				setSRCH_PRNTStatus();
			}
			Ctrl_ctrl_PPanel.expand(true);
		}
	}
	
	public void Open_MBBCP0020(MCRootPanel panel, Map<String, String> args) {
		
		mcframe.clientMSBE.MSBEP1770.MSBEP_IvSrch rootP = (mcframe.clientMSBE.MSBEP1770.MSBEP_IvSrch)panel;
		if(!rootP.Cnd_srch_mode_HDR.isSelected()) {
			message(MSBEP0104);
			return;
		}
		
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MB", "MBBCP0020");
		
		mcframe.clientMBBC.MBBCP0020.MBBCP_AttachmentLstReg_MC p = (mcframe.clientMBBC.MBBCP0020.MBBCP_AttachmentLstReg_MC)aso.getPanel();
		
		p.screenOpen(rootP, args);
	}
	
	@Override
	public <R extends MCRow> void editListForOpenMBBCP0020(MCRootPanel panel, Map<String, String> args, MCList<R> list) {
		super.editListForOpenMBBCP0020(panel, args, list);
		
		String[] keys = {mcframe.clientMBBC.MBBCP0020.RsltR.$biz_key1, mcframe.clientMBBC.MBBCP0020.RsltR.$biz_key2}; 
		for(RsltR dispRow : getRsltL()) {
			// 納品先識別区分：納品先以外のデータは対象外
			if (!MSC_DLV_ID_TYP.isDLV(dispRow.dlv_id_typ())) {
				Comparable<?>[] vals = {dispRow.iv_no(), dispRow.iv_rev().toString()};
				list.remove(list.getFirst(keys, vals));
			}
		}
	}
	
	/**
	 * Panel[Ctrl]のボタン[ctrl_Ope_srch]の押下時の処理
	 */
	@Override
	public void doCtrl_ctrl_Ope_srch(MCEventInfo info) {
		callMS_MSBEL1770_Srch01();
	}
	
	/**
	 * Panel[RPnl]のボタン[dwnld]の押下時の処理
	 */
	@Override
	public void doRPnl_dwnld(MCEventInfo info) {
		createMS_MSBEL1770_Srch01().execDL();
	}
	
	/**
	 * Panel[Btn]のボタン[prnt_iv]の押下時の処理
	 */
	@Override
	public void doBtn_prnt_iv(MCEventInfo info) {
		callMS_MSBEL1770_Prnt01();
	}
	/**
	 * Panel[Btn]のボタン[prnt_pl]の押下時の処理
	 */
	@Override
	public void doBtn_prnt_pl(MCEventInfo info) {
		callMS_MSBEL1770_Prnt02();
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

	@Override
	public void doRslt_NC(MCEventInfo info) {
		super.doRslt_NC(info);
		
		setBtnMode();
	}
	
	@Override
	public void doDCEvent(MCDCBeans compo,MCEventInfo info) {
		super.doDCEvent(compo, info);
		if (compo == RsltTable) {
			doBtn_open_MSBEP1730(info);
		}
	}

	/**
	 * Panel[Btn]のボタン[open_MSBEP1730]の押下時の処理
	 */
	@Override
	public void doBtn_open_MSBEP1730(MCEventInfo info) {
		RsltR r = RsltTable.getSelectedMCRow();
		if (r == null) {
			dialog(msgNoSelectedRow());
			return;
		}
		doBtn_open_MSBEP1730(r);
	}
	
	protected void doBtn_open_MSBEP1730(RsltR r){	
		MCRow bind = MCRow.create();
		if(r.pre_rcpt_iv_flg()) { //仮登録の場合
			bind.addStringColumn("rcpt_iv_mng_no", r.rcpt_iv_mng_no());
			bind.addStringColumn("srch_tgt_no", r.rcpt_iv_no());
		}
		else {
			bind.addStringColumn("rcpt_iv_mng_no", null);
			bind.addStringColumn("srch_tgt_no", r.iv_no());
			bind.addNumberColumn("srch_tgt_rev", r.iv_rev());
			bind.addStringColumn("iv_mng_no", r.iv_mng_no());
		}
		openPanel("MS", "MSBEP1730", T2, bind);
	}

	/**
	 * Panel[Btn]のボタン[open_MSBEP1750]の押下時の処理
	 */
	@Override
	public void doBtn_open_MSBEP1750(MCEventInfo info) {
		RsltR r = RsltTable.getSelectedMCRow();
		if (r == null) {
			dialog(msgNoSelectedRow());
			return;
		}
		doBtn_open_MSBEP1750(r);
	}
	protected void doBtn_open_MSBEP1750(RsltR r){	
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MS", "MSBEP1750");

		mcframe.clientMSBE.MSBEP1750.MSBEP_PlReg p = (mcframe.clientMSBE.MSBEP1750.MSBEP_PlReg) aso.getPanel();
		mcframe.clientMSBE.MSBEP1750.CndR to = mcframe.clientMSBE.MSBEP1750.CndR.create();
		if(r.pl_reg_flg()) {
			to.ope(p.Cnd_ope_SRCH.getActionCommand());
		}
		else {
			to.ope(p.Cnd_ope_INS.getActionCommand());
		}
		to.iv_no(r.iv_no());

		aso.putCnd(to);
		aso.putSearchAction();
		aso.show();
	}

	/**
	 * Panel[Btn]のボタン[open_MSBEP1760]の押下時の処理
	 */
	@Override
	public void doBtn_open_MSBEP1760(MCEventInfo info) {
		RsltR r = RsltTable.getSelectedMCRow();
		if (r == null) {
			dialog(msgNoSelectedRow());
			return;
		}
		doBtn_open_MSBEP1760(r);
	}
	protected void doBtn_open_MSBEP1760(RsltR r){	
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MS", "MSBEP1760");
		mcframe.clientMSBE.MSBEP1760.MSBEP_ExActListReg p = (mcframe.clientMSBE.MSBEP1760.MSBEP_ExActListReg) aso.getPanel();
		mcframe.clientMSBE.MSBEP1760.CndR to = mcframe.clientMSBE.MSBEP1760.CndR.create();
		if(r.ex_im_comp_flg()) {
			to.ope(p.Cnd_ope_UPD.getActionCommand());
		}
		else {
			to.ope(p.Cnd_ope_INS.getActionCommand());
			aso.runValueInit();
		}
		to.iv_no(r.iv_no());

		aso.putCnd(to);
		aso.putSearchAction();
		aso.show();
	}
	// ------------オープン時の処理実装------------			
	@Override
	protected void setupParts() {
		super.setupParts();
		Rslt_tdlv_p_PPanel.setTdlvMode(true);
		Rslt_ttl_trd_cur_amt_p_PPanel.setRelateBeans(columnRslt_trd_cur_cd, columnRslt_trd_cur_amt_dec_place);
		Rslt_ttl_trd_cur_inc_tax_amt_p_PPanel.setRelateBeans(columnRslt_trd_cur_cd, columnRslt_trd_cur_amt_dec_place);
		Rslt_sno_wrk_no_p_PPanel.setRelateBeans(columnRslt_itm_cd, columnRslt_itm_sub1, columnRslt_itm_sub2, columnRslt_itm_sub3, columnRslt_sno1_mng_typ, columnRslt_sno2_mng_typ, columnRslt_sno3_mng_typ, columnRslt_sno4_mng_typ);
		Rslt_ttl_iv_amt_p_PPanel.setRelateBeans(columnRslt_trd_cur_cd, columnRslt_trd_cur_amt_dec_place);
		Rslt_ttl_base_amt_p_PPanel.setRelateBeans(columnRslt_trd_cur_cd, columnRslt_trd_cur_amt_dec_place);
		Rslt_ttl_ncv_amt_p_PPanel.setRelateBeans(columnRslt_trd_cur_cd, columnRslt_trd_cur_amt_dec_place);
		Rslt_ttl_freight_amt_p_PPanel.setRelateBeans(columnRslt_trd_cur_cd, columnRslt_trd_cur_amt_dec_place);
		Rslt_ttl_insurance_amt_p_PPanel.setRelateBeans(columnRslt_trd_cur_cd, columnRslt_trd_cur_amt_dec_place);
		Rslt_ttl_oth_amt_p_PPanel.setRelateBeans(columnRslt_trd_cur_cd, columnRslt_trd_cur_amt_dec_place);
		Rslt_trd_unit_qty_p_PPanel.setRelateBeans(columnRslt_trd_unit_cd, columnRslt_trd_unit_dec_place);
		Rslt_base_unit_qty_p_PPanel.setRelateBeans(columnRslt_base_unit_cd, columnRslt_base_unit_dec_place);
		Rslt_ship_inst_qty_p_PPanel.setRelateBeans(columnRslt_base_unit_cd, columnRslt_base_unit_dec_place);
		Rslt_sum_ship_inst_qty_p_PPanel.setRelateBeans(columnRslt_base_unit_cd, columnRslt_base_unit_dec_place);
		Rslt_ship_act_qty_p_PPanel.setRelateBeans(columnRslt_base_unit_cd, columnRslt_base_unit_dec_place);
		Rslt_sls_qty_p_PPanel.setRelateBeans(columnRslt_base_unit_cd, columnRslt_base_unit_dec_place);
		Rslt_trd_cur_upri_p_PPanel.setRelateBeans(columnRslt_trd_cur_cd, columnRslt_trd_cur_upri_dec_place);
		Rslt_trd_cur_amt_p_PPanel.setRelateBeans(columnRslt_trd_cur_cd, columnRslt_trd_cur_amt_dec_place);
		Rslt_trd_cur_inc_tax_amt_p_PPanel.setRelateBeans(columnRslt_trd_cur_cd, columnRslt_trd_cur_amt_dec_place);
		Rslt_trd_cur_tax_amt_p_PPanel.setRelateBeans(columnRslt_trd_cur_cd, columnRslt_trd_cur_amt_dec_place);
		Rslt_trd_cur_dscnt_amt_p_PPanel.setRelateBeans(columnRslt_trd_cur_cd, columnRslt_trd_cur_amt_dec_place);
		Rslt_ptax_cur_amt_p_PPanel.setRelateBeans(columnRslt_ptax_cur_cd, columnRslt_ptax_cur_amt_dec_place);
		Rslt_wtax_amt_p_PPanel.setRelateBeans(columnRslt_trd_cur_cd, columnRslt_trd_cur_amt_dec_place);
		Rslt_iv_upri_p_PPanel.setRelateBeans(columnRslt_trd_cur_cd, columnRslt_trd_cur_upri_dec_place);
		Rslt_iv_amt_p_PPanel.setRelateBeans(columnRslt_trd_cur_cd, columnRslt_trd_cur_amt_dec_place);
		Rslt_ship_rqst_id_grp_p_PPanel.setRelateBeans(Cnd_ship_rqst_id_grp_p_PPanel);
		Rslt_dlv_id_grp_p_PPanel.setRelateBeans(Cnd_dlv_id_grp_p_PPanel);
		Rslt_itm_grp_p_PPanel.setRelateBeans(Cnd_itm_grp_p_PPanel);
	}
	@Override
	protected void valueInit() {
		super.valueInit();
		valueInitSub();
	}

	protected void valueInitSub() {
		setValueEx(Cnd_ope_Group, Cnd_ope_REF.getActionCommand());
		setValueEx(Cnd_srch_mode_Group, Cnd_srch_mode_HDR.getActionCommand());
		setValueEx(Cnd_ex_im_not_comp_flg, true);
		setValueEx(Cnd_ex_im_comp_flg, true);
		setValueEx(Cnd_purc_im_not_comp_flg, true);
		setValueEx(Cnd_purc_im_comp_flg, true);
		setValueEx(Cnd_iv_not_reg_flg, true);
		setValueEx(Cnd_iv_reg_flg, true);
		setValueEx(Cnd_pl_not_reg_flg, true);
		setValueEx(Cnd_pl_reg_flg, true);
		setValueEx(Cnd_pl_skip_flg, true);
		setValueEx(Cnd_iv_prnt_yet_flg, true);
		setValueEx(Cnd_iv_prnt_done_flg, true);
		setValueEx(Cnd_pl_prnt_yet_flg, true);
		setValueEx(Cnd_pl_prnt_done_flg, true);
		setValueEx(Cnd_iv_comp_flg, true);
		setValueEx(Cnd_iv_not_comp_flg, true);
		setValueEx(Cnd_sls_cststk_flg, true);
		setValueEx(Cnd_sls_cststk_invalid_flg, true);
	}
	//  ------------イベント処理実装------------	
	
	@Override
	public boolean doCnd_ope_VC(MCEventInfo info) {
		
		// 帳票発行するから切り替える場合にクリア確認を出す
		if (isSame(getStatus(), PRNT) && !isStatusNone(getRsltL())) {
			return confirmRegDataClear();
		}
		return super.doCnd_ope_VC(info);
	}

	@Override
	public void doCnd_ope_NC(mcframe.clientCore.event.MCEventInfo info) {
		super.doCnd_ope_NC(info);
		
		RsltTable.clear();
		setModeStatus();
		setCndFlg();
		setModeIncCanFlg();
	}
	
	@Override
	public void doCnd_srch_mode_NC(mcframe.clientCore.event.MCEventInfo info) {
		super.doCnd_srch_mode_NC(info);

		RsltTable.clear();
		setModeStatus();
		clearCnd();
		setCndFlg();
	}
	
	@Override
	public void doCnd_inc_past_flg_NC(mcframe.clientCore.event.MCEventInfo info) {
		super.doCnd_inc_past_flg_NC(info);
		setModeIncCanFlg();
	}
	protected void setModeIncCanFlg() {
		if (getCndR().inc_past_flg()) {
			getCndR().inc_can_flg(true);
			Cnd_inc_can_flg.setMode(MCMode.READ_ONLY);
		}
		else {
			setDefaultMode(Cnd_inc_can_flg);
		}
	}
	
	protected void setModeStatus(){
		
		// 検索モードによる制御
		if(Cnd_ope_REF.isSelected()){
			if(Cnd_srch_mode_HDR.isSelected()){
				setHDRStatus();
			}
			else if(Cnd_srch_mode_DTL.isSelected()){
				setDTLStatus();
			}
			else if(Cnd_srch_mode_SHIP_INST.isSelected()){
				setSHIP_INSTStatus();
			}
			else if(Cnd_srch_mode_SHIP_ACT.isSelected()){
				setSHIP_ACTStatus();
			}
			else if(Cnd_srch_mode_SLS_ACT.isSelected()){
				setSLS_ACTStatus();
			}
		}
		else if(Cnd_ope_PRNT.isSelected()){
			setValueEx(Cnd_srch_mode_Group, Cnd_srch_mode_HDR.getActionCommand());
			setSRCH_PRNTStatus();
		}
		
		setBtnMode();
		
		Ctrl_ctrl_PPanel.expand(true);
	}

	protected void clearCnd() {
		if(Cnd_srch_mode_HDR.isSelected()){
			Cnd_dlv_rqst_dt_fr.clear();
			Cnd_dlv_rqst_hm_fr.clear();
			Cnd_dlv_rqst_dt_to.clear();
			Cnd_dlv_rqst_hm_to.clear();
			Cnd_ship_loc_cd.clear();
			Cnd_ship_loc_nm.clear();
			Cnd_ship_site_cd.clear();
			Cnd_ship_site_nm.clear();
			Cnd_slo_no.clear();
			Cnd_ship_rqst_no.clear();
			Cnd_cst_po_no.clear();
			Cnd_cst_po_d_no.clear();
			Cnd_trd_cd.clear();
			Cnd_trd_nm.clear();
			Cnd_sls_usr_cd.clear();
			Cnd_sls_usr_nm.clear();
			Cnd_sls_dpt_cd.clear();
			Cnd_sls_dpt_nm.clear();
			Cnd_itm_typ.clear();
			Cnd_itm_typ_d_cd.clear();
			Cnd_itm_typ_d_nm.clear();
			Cnd_itm_cd.clear();
			Cnd_itm_sub1.clear();
			Cnd_itm_sub2.clear();
			Cnd_itm_sub3.clear();
			Cnd_itm_nm.clear();
			Cnd_cst_itm_cd.clear();
			Cnd_iv_d_rmrks.clear();
			Cnd_iv_d_intr_rmrks.clear();
			Cnd_iv_d_sub_char1.clear();
			Cnd_iv_d_sub_char2.clear();
			Cnd_iv_d_sub_char3.clear();
			Cnd_itm_grp_flg1.clear();
			Cnd_itm_grp_flg2.clear();
			Cnd_itm_grp_flg3.clear();
			Cnd_itm_grp_flg4.clear();
			Cnd_itm_grp_flg5.clear();
			Cnd_itm_grp_flg6.clear();
			Cnd_itm_grp_flg7.clear();
			Cnd_itm_grp_flg8.clear();
			Cnd_itm_grp_flg9.clear();
			Cnd_itm_grp_flg10.clear();
			Cnd_ship_fr_lg_grp_cd.clear();
			Cnd_ship_fr_lg_grp_nm.clear();
		}
		else if(Cnd_srch_mode_DTL.isSelected()){
			Cnd_ship_loc_cd.clear();
			Cnd_ship_loc_nm.clear();
			Cnd_ship_site_cd.clear();
			Cnd_ship_site_nm.clear();
		}
		else if(Cnd_srch_mode_SHIP_INST.isSelected()
				|| Cnd_srch_mode_SHIP_ACT.isSelected()
				|| Cnd_srch_mode_SLS_ACT.isSelected()){
			Cnd_rcpt_iv_no.clear();
		}
	}
	
	protected void setCndFlg(){
		
		// 検索モードのによる制御
		if(Cnd_srch_mode_HDR.isSelected()){
			getCndR().ex_im_comp_flg(true);
			getCndR().ex_im_not_comp_flg(true);
			getCndR().purc_im_comp_flg(true);
			getCndR().purc_im_not_comp_flg(true);
			getCndR().iv_reg_flg(true);
			getCndR().iv_not_reg_flg(true);
			getCndR().pl_reg_flg(true);
			getCndR().pl_skip_flg(true);
			getCndR().pl_not_reg_flg(true);
			getCndR().not_iv_flg(false);
			getCndR().not_inst_flg(false);
			getCndR().part_inst_flg(false);
			getCndR().inst_flg(false);
			getCndR().not_ship_flg(false);
			getCndR().part_ship_flg(false);
			getCndR().ship_flg(false);
			getCndR().not_sls_flg(false);
			getCndR().sls_flg(false);
			getCndR().comp_flg(false);
			getCndR().iv_not_comp_flg(true);
			getCndR().iv_comp_flg(true);
			getCndR().sls_cststk_flg(true);
			getCndR().sls_cststk_invalid_flg(true);
		}
		else if(Cnd_srch_mode_DTL.isSelected()){
			getCndR().ex_im_comp_flg(true);
			getCndR().ex_im_not_comp_flg(true);
			getCndR().purc_im_comp_flg(true);
			getCndR().purc_im_not_comp_flg(true);
			getCndR().iv_reg_flg(true);
			getCndR().iv_not_reg_flg(true);
			getCndR().pl_reg_flg(true);
			getCndR().pl_skip_flg(true);
			getCndR().pl_not_reg_flg(true);
			getCndR().not_iv_flg(true);
			getCndR().not_inst_flg(true);
			getCndR().part_inst_flg(true);
			getCndR().inst_flg(true);
			getCndR().not_ship_flg(true);
			getCndR().part_ship_flg(true);
			getCndR().ship_flg(true);
			getCndR().not_sls_flg(true);
			getCndR().sls_flg(true);
			getCndR().comp_flg(true);
			getCndR().iv_not_comp_flg(false);
			getCndR().iv_comp_flg(false);
			getCndR().sls_cststk_flg(true);
			getCndR().sls_cststk_invalid_flg(true);
			getCndR().inc_past_flg(false);
		}
		else if(Cnd_srch_mode_SHIP_INST.isSelected()){
			getCndR().ex_im_comp_flg(true);
			getCndR().ex_im_not_comp_flg(true);
			getCndR().purc_im_comp_flg(false);
			getCndR().purc_im_not_comp_flg(false);
			getCndR().iv_reg_flg(true);
			getCndR().iv_not_reg_flg(false);
			getCndR().pl_reg_flg(true);
			getCndR().pl_skip_flg(true);
			getCndR().pl_not_reg_flg(true);
			getCndR().not_iv_flg(false);
			getCndR().not_inst_flg(false);
			getCndR().part_inst_flg(true);
			getCndR().inst_flg(true);
			getCndR().not_ship_flg(false);
			getCndR().part_ship_flg(true);
			getCndR().ship_flg(true);
			getCndR().not_sls_flg(false);
			getCndR().sls_flg(false);
			getCndR().comp_flg(true);
			getCndR().iv_not_comp_flg(false);
			getCndR().iv_comp_flg(false);
			getCndR().sls_cststk_flg(true);
			getCndR().sls_cststk_invalid_flg(true);
			getCndR().inc_can_flg(false);
			getCndR().inc_past_flg(false);
		}
		else if(Cnd_srch_mode_SHIP_ACT.isSelected()){
			getCndR().ex_im_comp_flg(true);
			getCndR().ex_im_not_comp_flg(true);
			getCndR().purc_im_comp_flg(false);
			getCndR().purc_im_not_comp_flg(false);
			getCndR().iv_reg_flg(true);
			getCndR().iv_not_reg_flg(false);
			getCndR().pl_reg_flg(true);
			getCndR().pl_skip_flg(true);
			getCndR().pl_not_reg_flg(true);
			getCndR().not_iv_flg(false);
			getCndR().not_inst_flg(false);
			getCndR().part_inst_flg(false);
			getCndR().inst_flg(false);
			getCndR().not_ship_flg(false);
			getCndR().part_ship_flg(true);
			getCndR().ship_flg(true);
			getCndR().not_sls_flg(false);
			getCndR().sls_flg(false);
			getCndR().comp_flg(true);
			getCndR().iv_not_comp_flg(false);
			getCndR().iv_comp_flg(false);
			getCndR().sls_cststk_flg(true);
			getCndR().sls_cststk_invalid_flg(true);
			getCndR().inc_can_flg(false);
			getCndR().inc_past_flg(false);
		}
		else if(Cnd_srch_mode_SLS_ACT.isSelected()){
			getCndR().ex_im_comp_flg(true);
			getCndR().ex_im_not_comp_flg(true);
			getCndR().purc_im_comp_flg(false);
			getCndR().purc_im_not_comp_flg(false);
			getCndR().iv_reg_flg(true);
			getCndR().iv_not_reg_flg(false);
			getCndR().pl_reg_flg(true);
			getCndR().pl_skip_flg(true);
			getCndR().pl_not_reg_flg(true);
			getCndR().not_iv_flg(false);
			getCndR().not_inst_flg(false);
			getCndR().part_inst_flg(true);
			getCndR().inst_flg(true);
			getCndR().not_ship_flg(false);
			getCndR().part_ship_flg(true);
			getCndR().ship_flg(false);
			getCndR().not_sls_flg(false);
			getCndR().sls_flg(true);
			getCndR().comp_flg(true);
			getCndR().iv_not_comp_flg(false);
			getCndR().iv_comp_flg(false);
			getCndR().sls_cststk_flg(true);
			getCndR().sls_cststk_invalid_flg(true);
			getCndR().inc_can_flg(false);
			getCndR().inc_past_flg(false);
		}
		
		// 操作種別による制御
		if(Cnd_ope_PRNT.isSelected()){
			getCndR().iv_not_reg_flg(false); // インボイス未登録状態は何も発行できない
			getCndR().iv_reg_flg(true);
		}
	}
	
	protected void setBtnMode(){
		if(getRsltL().isEmpty()){
			Btn_open_MSBEP1730.setMode(MCMode.DISABLE);
			Btn_open_MSBEP1750.setMode(MCMode.DISABLE);
			Btn_open_MSBEP1760.setMode(MCMode.DISABLE);
			Btn_prnt_iv.setMode(MCMode.DISABLE);
			Btn_prnt_pl.setMode(MCMode.DISABLE);
			return;
		}
		
		RsltR r = RsltTable.getSelectedMCRow();
		if (isNull(r)) {
			return;
		}

		Btn_open_MSBEP1730.setMode(MCMode.ENABLE);
		if(r.pre_rcpt_iv_flg()) { //仮登録の場合
			Btn_open_MSBEP1750.setMode(MCMode.DISABLE);
			Btn_open_MSBEP1760.setMode(MCMode.DISABLE);
		}
		else {
			setBtn_open_MSBEP1750_Mode(r);
			setBtn_open_MSBEP1760_Mode(r);
		}
	}

	protected void setBtn_open_MSBEP1750_Mode(RsltR r) {
		if(r.pl_skip_flg()) {
			Btn_open_MSBEP1750.setMode(MCMode.DISABLE);
		}
		else {
			Btn_open_MSBEP1750.setMode(MCMode.ENABLE);
		}
	}

	protected void setBtn_open_MSBEP1760_Mode(RsltR r) {
		if(r.non_cmpl_flg()) {
			Btn_open_MSBEP1760.setMode(MCMode.DISABLE);
		}
		else if(!r.pl_reg_flg() && !r.pl_skip_flg()) {
			Btn_open_MSBEP1760.setMode(MCMode.DISABLE);
		}
		else {
			Btn_open_MSBEP1760.setMode(MCMode.ENABLE);
		}
	}

}