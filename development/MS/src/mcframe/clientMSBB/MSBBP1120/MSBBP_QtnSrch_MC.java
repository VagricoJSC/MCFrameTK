package mcframe.clientMSBB.MSBBP1120;

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
import mcframe.clientMAUB.MAUBP5070.*;
import mcframe.clientMAUB.MAUBP5150.*;
import mcframe.clientMAUB.MAUBP5170.*;
import mcframe.clientMAUB.MAUBP5190.*;
import mcframe.clientMAUB.MAUBP5310.*;
import mcframe.clientMSUB.MSUBP0020.*;
import mcframe.clientMSUB.MSUBP5010.*;

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
 * 画面"MSBBP_QtnSrch"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MSBBP_QtnSrch_MC extends MSBBP_QtnSrch_MC_A {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START

	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MSBBP_QtnSrch_MC() {
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
	public MSBBP_QtnSrch_MC(String name) {
		super(name);
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR_LIST START

		//FMCB CUSTOM_CONSTRUCTOR_LIST END
	}

	//画面処理メソッドはこれより下に定義してください。
	//FMCB CUSTOM_METHOD START

	/**
	 * [MS_MSBBL1120_Srch01]の定型処理のInnerClass
	 */
	protected class MS_MSBBL1120_Srch01Caller<P extends MSBBP_QtnSrch, B extends MS_MSBBL1120_Srch01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Searcher<P, B> {

		protected MS_MSBBL1120_Srch01Caller(P p, B b) {
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
			
			if (Cnd_ope_PRNT.isSelected()) {
				setStatus(PRNT);
			}
			else {
				if (Cnd_disp_HDR.isSelected()) {
					setStatus(REF_HDR);
				}
				else if (Cnd_disp_DTL.isSelected()) {
					setStatus(REF_DTL);
				}
			}
		}
		
		@Override
		protected void setModeNoDown() {
			super.setModeNoDown();
			setFocus();
			
			if (Cnd_ope_PRNT.isSelected()) {
				setStatus(SRCH_PRNT);
			}
			else {
				if (Cnd_disp_HDR.isSelected()) {
					setStatus(SRCH_HDR);
				}
				else if (Cnd_disp_DTL.isSelected()) {
					setStatus(SRCH_DTL);
				}
			}
		}
	}

	/**
	 * [MS_MSBBL1120_Prnt01]の定型処理のInnerClass
	 */
	protected class MS_MSBBL1120_Prnt01Caller<P extends MSBBP_QtnSrch, B extends MS_MSBBL1120_Prnt01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Printer<P, B> {

		protected MS_MSBBL1120_Prnt01Caller(P p, B b) {
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
		}
	}


	/**
	 * Panel[Ctrl]のボタン[ctrl_Ope_srch]の押下時の処理
	 */
	@Override
	public void doCtrl_ctrl_Ope_srch(MCEventInfo info) {
		callMS_MSBBL1120_Srch01();
	}
	/**
	 * Panel[RPnl]のボタン[dwnld]の押下時の処理
	 */
	@Override
	public void doRPnl_dwnld(MCEventInfo info) {
		createMS_MSBBL1120_Srch01().execDL();
	}
	/**
	 * Panel[Btn]のボタン[open_MSBBP1210]の押下時の処理
	 */
	@Override
	public void doBtn_open_MSBBP1210(MCEventInfo info) {
		RsltR r = RsltTable.getSelectedMCRow();
		if (r == null) {
			dialog(msgNoSelectedRow());
			return;
		}
		
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MS", "MSBBP1210");
		aso.putCnd(crtOpenMSBBP1210CndR(aso, r));
		aso.putSearchAction();
		aso.show();
	}
	
	/**
	 * 遷移先[MSBBP1210]の検索条件Rowコンテナを返します。
	 */
	protected mcframe.clientMSBB.MSBBP1210.CndR crtOpenMSBBP1210CndR(MAUCP_AppScreenOpener aso, RsltR r) {
		mcframe.clientMSBB.MSBBP1210.MSBBP_SloReg p = 
				(mcframe.clientMSBB.MSBBP1210.MSBBP_SloReg) aso.getPanel();
		mcframe.clientMSBB.MSBBP1210.CndR to = mcframe.clientMSBB.MSBBP1210.CndR.create();

		to.ope(p.Cnd_ope_INS.getActionCommand());
		to.srch_tgt_no(r.qtn_no());
		to.srch_tgt_rev(r.qtn_rev());
		return to;
	}
	/**
	 * Panel[Btn]のボタン[open_MSBBP1310]の押下時の処理
	 */
	@Override
	public void doBtn_open_MSBBP1310(MCEventInfo info) {
		RsltR r = RsltTable.getSelectedMCRow();
		if (r == null) {
			dialog(msgNoSelectedRow());
			return;
		}
		
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MS", "MSBBP1310");
		aso.putCnd(crtOpenMSBBP1310CndR(aso, r));
		aso.putSearchAction();
		aso.show();
	}
	
	/**
	 * 遷移先[MSBBP1310]の検索条件Rowコンテナを返します。
	 */
	protected mcframe.clientMSBB.MSBBP1310.CndR crtOpenMSBBP1310CndR(MAUCP_AppScreenOpener aso, RsltR r) {
		mcframe.clientMSBB.MSBBP1310.MSBBP_SlsActReg p = 
				(mcframe.clientMSBB.MSBBP1310.MSBBP_SlsActReg) aso.getPanel();
		mcframe.clientMSBB.MSBBP1310.CndR to = mcframe.clientMSBB.MSBBP1310.CndR.create();

		to.ope(p.Cnd_ope_INS.getActionCommand());
		to.srch_tgt_typ_nm(MSC_SLS_SRCH_TGT_TYP.QTN_NO.name());
		to.srch_tgt_no(r.qtn_no());
		to.srch_tgt_rev(r.qtn_rev());
		return to;
	}
	
	@Override
	public void doDCEvent(MCDCBeans compo, MCEventInfo info) {
		super.doDCEvent(compo, info);
		
		if (compo == RsltTable) {
			RsltR r = getRsltL().get(info.getEventIndex());
			doBtn_open_MSBBP1110(r);
		}
	}
	
	/**
	 * Panel[Btn]のボタン[open_MSBBP1110]の押下時の処理
	 */
	@Override
	public void doBtn_open_MSBBP1110(MCEventInfo info) {
		RsltR r = RsltTable.getSelectedMCRow();
		if (r == null) {
			dialog(msgNoSelectedRow());
			return;
		}
		
		doBtn_open_MSBBP1110(r);
	}
	
	protected void doBtn_open_MSBBP1110(RsltR r) {
		
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MS", "MSBBP1110");
		aso.putCnd(crtOpenMSBBP1110CndR(aso, r));
		aso.putSearchAction();
		aso.show();
	}
	
	/**
	 * 遷移先[MSBBP1110]の検索条件Rowコンテナを返します。
	 */
	protected mcframe.clientMSBB.MSBBP1110.CndR crtOpenMSBBP1110CndR(MAUCP_AppScreenOpener aso, RsltR r) {
		mcframe.clientMSBB.MSBBP1110.MSBBP_QtnReg p = 
				(mcframe.clientMSBB.MSBBP1110.MSBBP_QtnReg) aso.getPanel();
		mcframe.clientMSBB.MSBBP1110.CndR to = mcframe.clientMSBB.MSBBP1110.CndR.create();

		to.ope(p.Cnd_ope_REF.getActionCommand());
		to.qtn_no(r.qtn_no());
		to.qtn_rev(r.qtn_rev());
		return to;
	}
	
	public void Open_MBBCP0020(MCRootPanel panel, Map<String, String> args) {
		mcframe.clientMSBB.MSBBP1120.MSBBP_QtnSrch rootP =
				(mcframe.clientMSBB.MSBBP1120.MSBBP_QtnSrch)panel;
		if(!rootP.Cnd_disp_HDR.isSelected()) {
			dialog(MSBBP0103);
			return;
		}
		
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MB", "MBBCP0020");
		
		mcframe.clientMBBC.MBBCP0020.MBBCP_AttachmentLstReg_MC p = (mcframe.clientMBBC.MBBCP0020.MBBCP_AttachmentLstReg_MC)aso.getPanel();
		
		p.screenOpen(rootP, args);
	}
	
	/**
	 * Panel[Btn]のボタン[prnt_qtn]の押下時の処理
	 */
	@Override
	public void doBtn_prnt_qtn(MCEventInfo info) {
		callMS_MSBBL1120_Prnt01();
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
		Rslt_trd_unit_qty_p_PPanel.setRelateBeans(columnRslt_trd_unit_cd, columnRslt_trd_qty_dec_place);
		Rslt_base_unit_qty_p_PPanel.setRelateBeans(columnRslt_base_unit_cd, columnRslt_base_qty_dec_place);

		Rslt_trd_cur_std_sls_upri_p_PPanel.setRelateBeans(columnRslt_trd_cur_cd, columnRslt_trd_cur_upri_dec_place);
		Rslt_trd_cur_std_sls_amt_p_PPanel.setRelateBeans(columnRslt_trd_cur_cd, columnRslt_trd_cur_amt_dec_place);
		Rslt_trd_cur_std_sls_inc_tax_amt_p_PPanel.setRelateBeans(columnRslt_trd_cur_cd, columnRslt_trd_cur_amt_dec_place);
		Rslt_trd_cur_upri_p_PPanel.setRelateBeans(columnRslt_trd_cur_cd, columnRslt_trd_cur_upri_dec_place);
		Rslt_trd_cur_amt_p_PPanel.setRelateBeans(columnRslt_trd_cur_cd, columnRslt_trd_cur_amt_dec_place);
		Rslt_trd_cur_inc_tax_amt_p_PPanel.setRelateBeans(columnRslt_trd_cur_cd, columnRslt_trd_cur_amt_dec_place);
		Rslt_trd_cur_dscnt_amt_p_PPanel.setRelateBeans(columnRslt_trd_cur_cd, columnRslt_trd_cur_amt_dec_place);
		Rslt_trd_cur_std_sls_tax_amt_p_PPanel.setRelateBeans(columnRslt_trd_cur_cd, columnRslt_trd_cur_amt_dec_place);
		Rslt_trd_cur_tax_amt_p_PPanel.setRelateBeans(columnRslt_trd_cur_cd, columnRslt_trd_cur_amt_dec_place);

		Rslt_base_cur_std_upri_p_PPanel.setRelateBeans(columnRslt_base_cur_cd, columnRslt_base_cur_upri_dec_place);
		Rslt_base_cur_std_amt_p_PPanel.setRelateBeans(columnRslt_base_cur_cd, columnRslt_base_cur_amt_dec_place);
		Rslt_base_cur_std_inc_tax_amt_p_PPanel.setRelateBeans(columnRslt_base_cur_cd, columnRslt_base_cur_amt_dec_place);
		Rslt_base_cur_std_tax_amt_p_PPanel.setRelateBeans(columnRslt_base_cur_cd, columnRslt_base_cur_amt_dec_place);
		Rslt_base_cur_upri_p_PPanel.setRelateBeans(columnRslt_base_cur_cd, columnRslt_base_cur_upri_dec_place);
		Rslt_base_cur_amt_p_PPanel.setRelateBeans(columnRslt_base_cur_cd, columnRslt_base_cur_amt_dec_place);
		Rslt_base_cur_inc_tax_amt_p_PPanel.setRelateBeans(columnRslt_base_cur_cd, columnRslt_base_cur_amt_dec_place);
		Rslt_base_cur_tax_amt_p_PPanel.setRelateBeans(columnRslt_base_cur_cd, columnRslt_base_cur_amt_dec_place);

		Rslt_slo_trnst_qty_p_PPanel.setRelateBeans(columnRslt_trd_unit_cd, columnRslt_trd_qty_dec_place);
		Rslt_sls_trnst_qty_p_PPanel.setRelateBeans(columnRslt_trd_unit_cd, columnRslt_trd_qty_dec_place);

		Rslt_cst_grp_p_PPanel.setRelateBeans(Cnd_cst_grp_p_PPanel);
		Rslt_dlv_grp_p_PPanel.setRelateBeans(Cnd_dlv_grp_p_PPanel);
		Rslt_itm_grp_p_PPanel.setRelateBeans(Cnd_itm_grp_p_PPanel);
	}

	@Override
	protected void valueInit() {
		super.valueInit();
		valueInitSub();
	}
	
	protected void valueInitSub() {
		setValueEx(Cnd_ope_Group, Cnd_ope_REF.getActionCommand());
		setValueEx(Cnd_disp_Group, Cnd_disp_DTL.getActionCommand());
		
		setBoolean(Qtn_typPanel, true);
		setBoolean(Aprv_sts_typPanel, true);
		setBoolean(QtnPrntPanel, true);
		setBoolean(IvPanel, true);
	}
	
	@Override
	public void setOpenFocus() {
		super.setOpenFocus();
		FoldTab.focusActiveFirstComponent();
	}
	// --------------------画面初期値設定end----------------------
	// --------------------イベント処理start------------------------
	protected void setFocus() {
		
		if(getRsltL().size() > 0){
			RsltTable.selectLeftmostColumn(0);
			Ctrl_ctrl_PPanel.expand(false);
		}else{
			CndPanel.focusFirstComponent();
			Ctrl_ctrl_PPanel.expand(true);
		}
	}
	
	@Override
	public void doCnd_ope_NC(MCEventInfo info) {
		super.doCnd_ope_NC(info);
		
		setValueEx(Cnd_disp_Group, Cnd_disp_HDR.getActionCommand());
		setStatusSub();
	}
	
	@Override
	public void doCnd_disp_NC(MCEventInfo info) {
		super.doCnd_disp_NC(info);
		setStatusSub();
	}
	
	/**
	 * ステータス選択＆画面クリア処理
	 */
	protected void setStatusSub() {
		getRsltL().clear();
		
		if (Cnd_ope_PRNT.isSelected()) {
			setValueEx(Cnd_creating, false);
			setValueEx(Cnd_opn, false);
			setValueEx(Cnd_fix, false);
			setValueEx(Cnd_rjct, false);
			setValueEx(Cnd_last_rjct, false);
			setValueEx(Cnd_inc_can_flg, false);
			

			
			clearHdrDispColumn();
			setStatus(SRCH_PRNT);
		}
		else {
			setValueEx(Cnd_creating, true);
			setValueEx(Cnd_opn, true);
			setValueEx(Cnd_fix, true);
			setValueEx(Cnd_rjct, true);
			setValueEx(Cnd_last_rjct, true);

			if (Cnd_disp_HDR.isSelected()) {
				clearHdrDispColumn();
				setStatus(SRCH_HDR);
			}
			else if (Cnd_disp_DTL.isSelected()) {
				setBoolean(Qtn_sts_typPanel, true);
				setStatus(SRCH_DTL);
			}
		}
	}
	
	@Override
	public void doRslt_NC(MCEventInfo info){
		super.doRslt_NC(info);
		RsltR r = RsltTable.getSelectedMCRow();
		
		if(!isNull(r)) {
			if (r.failure_flg()
					|| r.can_flg()
					|| (r.aprv_flg() && !MAC_APRV_STS_TYP.isACPT(r.aprv_sts_typ()))) {
				
				Btn_open_MSBBP1210.setMode(MCMode.DISABLE);
				Btn_open_MSBBP1310.setMode(MCMode.DISABLE);
			}
			else {
				setDefaultMode(Btn_open_MSBBP1210);
				setDefaultMode(Btn_open_MSBBP1310);
			}
		}
	}
	
	/**
	 * 検索モード:ヘッダ時に値を変更するカラム
	 */
	protected void clearHdrDispColumn() {
		setBoolean(Qtn_sts_typPanel, false);
		
		setValueEx(Cnd_dlv_cd, null);
		setValueEx(Cnd_dlv_nm, null);
		setValueEx(Cnd_dest_cd1, null);
		setValueEx(Cnd_dest_nm1, null);
		setValueEx(Cnd_dest_cd2, null);
		setValueEx(Cnd_dest_nm2, null);
		setValueEx(Cnd_dest_cd3, null);
		setValueEx(Cnd_dest_nm3, null);
		
		setValueEx(Cnd_itm_typ_p_PPanel.ItmTyp_itm_typ, null);
		setValueEx(Cnd_itm_typ_p_PPanel.ItmTyp_itm_typ_d_cd, null);
		setValueEx(Cnd_itm_typ_p_PPanel.ItmTyp_itm_typ_d_nm, null);
		setValueEx(Cnd_itm_p_PPanel.Itm_itm_cd, null);
		setValueEx(Cnd_itm_p_PPanel.Itm_itm_sub1, null);
		setValueEx(Cnd_itm_p_PPanel.Itm_itm_sub2, null);
		setValueEx(Cnd_itm_p_PPanel.Itm_itm_sub3, null);
		setValueEx(Cnd_itm_p_PPanel.Itm_itm_nm, null);
		setValueEx(Cnd_sno_p_PPanel.SnoWrkNo_sno1, null);
		setValueEx(Cnd_sno_p_PPanel.SnoWrkNo_sno2, null);
		setValueEx(Cnd_sno_p_PPanel.SnoWrkNo_sno3, null);
		setValueEx(Cnd_sno_p_PPanel.SnoWrkNo_sno4, null);
		setValueEx(Cnd_qtn_d_rmrks, null);
		setValueEx(Cnd_intr_d_rmrks, null);
		setValueEx(Cnd_cst_qtn_rqst_d_no, null);
		setValueEx(Cnd_cst_itm_cd, null);
		setValueEx(Cnd_cst_itm_nm, null);
		setValueEx(Cnd_gd_cd, null);
		setValueEx(Cnd_gd_nm, null);
		setValueEx(Cnd_qtn_d_rslt_rsn_cd, null);
		setValueEx(Cnd_qtn_d_rslt_rsn_nm, null);
		setValueEx(Cnd_qtn_d_sub_char1, null);
		setValueEx(Cnd_qtn_d_sub_char2, null);
		setValueEx(Cnd_qtn_d_sub_char3, null);
		
		setValueEx(Cnd_dlv_grp_p_PPanel.BpGrp_bp_grp_flg1, false);
		setValueEx(Cnd_dlv_grp_p_PPanel.BpGrp_bp_grp_flg2, false);
		setValueEx(Cnd_dlv_grp_p_PPanel.BpGrp_bp_grp_flg3, false);
		setValueEx(Cnd_dlv_grp_p_PPanel.BpGrp_bp_grp_flg4, false);
		setValueEx(Cnd_dlv_grp_p_PPanel.BpGrp_bp_grp_flg5, false);
		setValueEx(Cnd_dlv_grp_p_PPanel.BpGrp_bp_grp_flg6, false);
		setValueEx(Cnd_dlv_grp_p_PPanel.BpGrp_bp_grp_flg7, false);
		setValueEx(Cnd_dlv_grp_p_PPanel.BpGrp_bp_grp_flg8, false);
		setValueEx(Cnd_dlv_grp_p_PPanel.BpGrp_bp_grp_flg9, false);
		setValueEx(Cnd_dlv_grp_p_PPanel.BpGrp_bp_grp_flg10, false);
		
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
	
	protected void checkForCallStackSub(MCMessageList msgList) {
		msgList.addAll(checkBeforeAfter(Cnd_qtn_dt_fr, Cnd_qtn_dt_to));
		msgList.addAll(checkBeforeAfter(Cnd_valid_dt_fr, Cnd_valid_dt_to));
		msgList.addAll(checkBeforeAfter(Cnd_rcpt_dt_fr, Cnd_rcpt_dt_to));
		
		msgList.addAll(checkAtLeastOne(Qtn_typPanel));
		msgList.addAll(checkAtLeastOne(Aprv_sts_typPanel));
		msgList.addAll(checkAtLeastOne(QtnPrntPanel));
		msgList.addAll(checkAtLeastOne(IvPanel));
		
		if(Cnd_disp_DTL.isSelected()) {
			msgList.addAll(checkAtLeastOne(Qtn_sts_typPanel));
		}
	}

}