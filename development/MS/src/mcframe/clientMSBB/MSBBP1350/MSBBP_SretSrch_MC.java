package mcframe.clientMSBB.MSBBP1350;

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
import mcframe.clientMAUB.MAUBP5360.*;
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
import mcframe.clientMAUD.MAUDP1010.MAUDP_RLBase;
import mcframe.clientMAUD.MAUDP1010.MAUDP_RLBaseCellConfig;
import java.util.Map;
//FMCB CUSTOM_IMPORT END

/**
 * 画面"MSBBP_SretSrch"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MSBBP_SretSrch_MC extends MSBBP_SretSrch_MC_A {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START

	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MSBBP_SretSrch_MC() {
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
	public MSBBP_SretSrch_MC(String name) {
		super(name);
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR_LIST START

		//FMCB CUSTOM_CONSTRUCTOR_LIST END
	}

	//画面処理メソッドはこれより下に定義してください。
	//FMCB CUSTOM_METHOD START

	/**
	 * [MS_MSBBL1350_Srch01]の定型処理のInnerClass
	 */
	protected class MS_MSBBL1350_Srch01Caller<P extends MSBBP_SretSrch, B extends MS_MSBBL1350_Srch01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Searcher<P, B> {

		protected MS_MSBBL1350_Srch01Caller(P p, B b) {
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
			
			if (Cnd_mode_SRCH_HDR.isSelected()) {
				setStatus(REF_SCHD_HDR);
			}
			else if (Cnd_mode_SRCH_DTL.isSelected()) {
				setStatus(REF_SCHD_DTL);
			}
			else if (Cnd_mode_SRCH_LST.isSelected()) {
				setStatus(REF_SCHD_LST);
			}
			setFocus();
		}
		
		@Override
		protected void setModeNoDown() {
			super.setModeNoDown();
			
			if (Cnd_mode_SRCH_HDR.isSelected()) {
				setStatus(SRCH_SCHD_HDR);
			}
			else if (Cnd_mode_SRCH_DTL.isSelected()) {
				setStatus(SRCH_SCHD_DTL);
			}
			else if (Cnd_mode_SRCH_LST.isSelected()) {
				setStatus(SRCH_SCHD_LST);
			}
			setFocus();
		}
	}

	/**
	 * [MS_MSBBL1350_Srch02]の定型処理のInnerClass
	 */
	protected class MS_MSBBL1350_Srch02Caller<P extends MSBBP_SretSrch, B extends MS_MSBBL1350_Srch02Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Searcher<P, B> {

		protected MS_MSBBL1350_Srch02Caller(P p, B b) {
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
			
			if (Cnd_mode_SRCH_HDR.isSelected()) {
				setStatus(REF_ACT_HDR);
			}
			else if (Cnd_mode_SRCH_DTL.isSelected()) {
				setStatus(REF_ACT_DTL);
			}
			else if (Cnd_mode_SRCH_LST.isSelected()) {
				setStatus(REF_ACT_LST);
			}
			setFocus();

		}
		
		@Override
		protected void setModeNoDown() {
			super.setModeNoDown();
			
			if (Cnd_mode_SRCH_HDR.isSelected()) {
				setStatus(SRCH_ACT_HDR);
			}
			else if (Cnd_mode_SRCH_DTL.isSelected()) {
				setStatus(SRCH_ACT_DTL);
			}
			else if (Cnd_mode_SRCH_LST.isSelected()) {
				setStatus(SRCH_ACT_LST);
			}
			setFocus();
		}
	}


	/**
	 * Panel[Ctrl]のボタン[ctrl_Ope_srch]の押下時の処理
	 */
	@Override
	public void doCtrl_ctrl_Ope_srch(MCEventInfo info) {
		if (Cnd_ope_SRCH_SCHD_REF.isSelected()) {
			callMS_MSBBL1350_Srch01();
		}
		else if (Cnd_ope_SRCH_ACT_REF.isSelected()) {
			callMS_MSBBL1350_Srch02();
		}
	}
	/**
	 * Panel[RPnl]のボタン[dwnld]の押下時の処理
	 */
	@Override
	public void doRPnl_dwnld(MCEventInfo info) {
		if (Cnd_ope_SRCH_SCHD_REF.isSelected()) {
			createMS_MSBBL1350_Srch01().execDL();
		}
		else if (Cnd_ope_SRCH_ACT_REF.isSelected()) {
			createMS_MSBBL1350_Srch02().execDL();
		}
	}
	
	
	@Override
	public void doDCEvent(MCDCBeans compo, MCEventInfo info) {
		super.doDCEvent(compo, info);
		
		if (compo == RsltTable) {
			RsltR r = getRsltL().get(info.getEventIndex());
			if (Cnd_ope_SRCH_SCHD_REF.isSelected()) {
				doBtn_open_MSBBP1330(r);
			}
			else if (Cnd_ope_SRCH_ACT_REF.isSelected()) {
				if (MAC_TRD_PTN_TYP.isSLS_RTN(r.trd_ptn_typ())) {
					doBtn_open_MSBBP1340(r);
				}
			}
		}
	}
	
	/**
	 * Panel[Btn]のボタン[open_MSBBP1330]の押下時の処理
	 */
	@Override
	public void doBtn_open_MSBBP1330(MCEventInfo info) {
		RsltR r = RsltTable.getSelectedMCRow();
		if (r == null) {
			dialog(msgNoSelectedRow());
			return;
		}
		doBtn_open_MSBBP1330(r);
	}
	
	protected void doBtn_open_MSBBP1330(RsltR r) {
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MS", "MSBBP1330");
		aso.putCnd(crtOpenMSBBP1330CndR(aso, r));
		aso.putSearchAction();
		aso.show();
	}
	
	/**
	 * 遷移先[MSBBP1330]の検索条件Rowコンテナを返します。
	 */
	protected mcframe.clientMSBB.MSBBP1330.CndR crtOpenMSBBP1330CndR(MAUCP_AppScreenOpener aso, RsltR r) {
		mcframe.clientMSBB.MSBBP1330.MSBBP_SlsRetSchdReg p = 
				(mcframe.clientMSBB.MSBBP1330.MSBBP_SlsRetSchdReg) aso.getPanel();
		mcframe.clientMSBB.MSBBP1330.CndR to = mcframe.clientMSBB.MSBBP1330.CndR.create();

		to.ope(p.Cnd_ope_REF.getActionCommand());
		to.srch_tgt_no(r.sls_ret_schd_no());
		return to;
	}
	/**
	 * Panel[Btn]のボタン[open_MSBBP1340]の押下時の処理
	 */
	@Override
	public void doBtn_open_MSBBP1340(MCEventInfo info) {
		RsltR r = RsltTable.getSelectedMCRow();
		if (r == null) {
			dialog(msgNoSelectedRow());
			return;
		}
		doBtn_open_MSBBP1340(r);
	}
	
	protected void doBtn_open_MSBBP1340(RsltR r) {
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MS", "MSBBP1340");
		aso.putCnd(crtOpenMSBBP1340CndR(aso, r , getCndR()));
		aso.putSearchAction();
		aso.show();
	}
	
	/**
	 * 遷移先[MSBBP1340]の検索条件Rowコンテナを返します。
	 */
	protected mcframe.clientMSBB.MSBBP1340.CndR crtOpenMSBBP1340CndR(MAUCP_AppScreenOpener aso, RsltR r, CndR cnd) {
		mcframe.clientMSBB.MSBBP1340.MSBBP_SlsRetReg p = 
				(mcframe.clientMSBB.MSBBP1340.MSBBP_SlsRetReg) aso.getPanel();
		mcframe.clientMSBB.MSBBP1340.CndR to = mcframe.clientMSBB.MSBBP1340.CndR.create();
		// 操作種別が予定参照
		if (isSame(cnd.ope(), Cnd_ope_SRCH_SCHD_REF.getActionCommand())) {
			// 登録モードで売上返品予定ＮＯを送る
			to.ope(p.Cnd_ope_INS.getActionCommand());
			to.srch_tgt_typ_nm(MSC_SLS_SRCH_TGT_TYP.SRET_SCHD_NO.name());
			to.srch_tgt_no(r.sls_ret_schd_no());
		}
		// 操作種別が実績参照
		else if (isSame(cnd.ope(), Cnd_ope_SRCH_ACT_REF.getActionCommand())) {
			// 参照モードで売上実績ＮＯを送る
			to.ope(p.Cnd_ope_REF.getActionCommand());
			to.srch_tgt_no(r.sls_act_no());
			if (r.can_flg()) {
				to.srch_tgt_rev(r.sls_act_rev());
			}
		}
		return to;
	}
	public void Open_MBBCP0020(MCRootPanel panel, Map<String, String> args) {
		
		mcframe.clientMSBB.MSBBP1350.MSBBP_SretSrch rootP =
				(mcframe.clientMSBB.MSBBP1350.MSBBP_SretSrch)panel;
		if(!rootP.Cnd_ope_SRCH_ACT_REF.isSelected() || !rootP.Cnd_mode_SRCH_HDR.isSelected()) {
			dialog(MSBBP0104);
			return;
		}
		
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MB", "MBBCP0020");
		
		mcframe.clientMBBC.MBBCP0020.MBBCP_AttachmentLstReg p = (mcframe.clientMBBC.MBBCP0020.MBBCP_AttachmentLstReg)aso.getPanel();

		p.screenOpen(rootP, args);
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
		Rslt_arr_qty_p_PPanel.setRelateBeans(columnRslt_trd_unit_cd, columnRslt_trd_qty_dec_place);
		Rslt_sls_ret_qty_p_PPanel.setRelateBeans(columnRslt_trd_unit_cd, columnRslt_trd_qty_dec_place);

		Rslt_trd_cur_upri_p_PPanel.setRelateBeans(columnRslt_trd_cur_cd, columnRslt_trd_upri_dec_place);
		Rslt_trd_cur_amt_p_PPanel.setRelateBeans(columnRslt_trd_cur_cd, columnRslt_trd_amt_dec_place);
		Rslt_trd_cur_inc_tax_amt_p_PPanel.setRelateBeans(columnRslt_trd_cur_cd, columnRslt_trd_amt_dec_place);
		Rslt_trd_cur_dscnt_amt_p_PPanel.setRelateBeans(columnRslt_trd_cur_cd, columnRslt_trd_amt_dec_place);
		Rslt_cost_upri_p_PPanel.setRelateBeans(columnRslt_trd_cur_cd, columnRslt_trd_upri_dec_place);
		Rslt_trd_cur_tax_amt_p_PPanel.setRelateBeans(columnRslt_trd_cur_cd, columnRslt_trd_amt_dec_place);
	
		Rslt_base_cur_upri_p_PPanel.setRelateBeans(columnRslt_base_cur_cd, columnRslt_base_upri_dec_place);
		Rslt_base_cur_amt_p_PPanel.setRelateBeans(columnRslt_base_cur_cd, columnRslt_base_amt_dec_place);
		Rslt_base_cur_inc_tax_amt_p_PPanel.setRelateBeans(columnRslt_base_cur_cd, columnRslt_base_amt_dec_place);
		Rslt_base_cur_tax_amt_p_PPanel.setRelateBeans(columnRslt_base_cur_cd, columnRslt_base_amt_dec_place);
		Rslt_base_cur_dscnt_amt_p_PPanel.setRelateBeans(columnRslt_base_cur_cd, columnRslt_base_amt_dec_place);
	
		Rslt_ptax_cur_upri_p_PPanel.setRelateBeans(columnRslt_ptax_cur_cd, columnRslt_ptax_upri_dec_place);
		Rslt_ptax_cur_amt_p_PPanel.setRelateBeans(columnRslt_ptax_cur_cd, columnRslt_ptax_amt_dec_place);
		Rslt_ptax_cur_inc_tax_amt_p_PPanel.setRelateBeans(columnRslt_ptax_cur_cd, columnRslt_ptax_amt_dec_place);
		Rslt_ptax_cur_tax_amt_p_PPanel.setRelateBeans(columnRslt_ptax_cur_cd, columnRslt_ptax_amt_dec_place);
		Rslt_ptax_cur_dscnt_amt_p_PPanel.setRelateBeans(columnRslt_ptax_cur_cd, columnRslt_ptax_amt_dec_place);
		
		Rslt_dlv_grp_p_PPanel.setRelateBeans(Cnd_dlv_grp_p_PPanel);
		Rslt_cst_grp_p_PPanel.setRelateBeans(Cnd_cst_grp_p_PPanel);
		Rslt_itm_grp_p_PPanel.setRelateBeans(Cnd_itm_grp_p_PPanel);
		
		Rslt_addr_p_PPanel.setRelateBeans(columnRslt_sret_fr_cd, columnRslt_sret_fr_nm, columnRslt_sret_fr_sundry_flg);
	}
	
	@Override
	protected void valueInit() {
		super.valueInit();
		valueInitSub();
	}
	
	protected void valueInitSub() {
		setValueEx(Cnd_ope_Group, Cnd_ope_SRCH_SCHD_REF.getActionCommand());
		setValueEx(Cnd_mode_Group, Cnd_mode_SRCH_DTL.getActionCommand());
		
		setStsPanelFlg();
		setBoolean(IvPanel, true);
		setBoolean(SyncPanel, true);
		setBoolean(VmiPanel, true);
	}
	
	protected void setStsPanelFlg() {
		setValueEx(Cnd_non_arr_flg, true);
		setValueEx(Cnd_part_arr_non_ac_flg, true);
		setValueEx(Cnd_part_arr_flg, true);
		setValueEx(Cnd_cmpl_arr_non_ac_flg, true);
		setValueEx(Cnd_cmpl_flg, false);
	}
	
	protected void setStsPanelFlgToFalse() {
		setValueEx(Cnd_non_arr_flg, false);
		setValueEx(Cnd_part_arr_non_ac_flg, false);
		setValueEx(Cnd_part_arr_flg, false);
		setValueEx(Cnd_cmpl_arr_non_ac_flg, false);
		setValueEx(Cnd_cmpl_flg, false);
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
		
		setStsPanelFlg();
		
		if (Cnd_ope_SRCH_SCHD_REF.isSelected()) {
			setBoolean(SyncPanel, true);
		}
		setStatusSub();
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
		getRsltL().clear();
		
		if (Cnd_ope_SRCH_SCHD_REF.isSelected()) {
			setValueEx(Cnd_sls_ret_dt_fr, null);
			setValueEx(Cnd_sls_ret_dt_to, null);
			setValueEx(Cnd_ac_ym_fr, null);
			setValueEx(Cnd_ac_ym_to, null);
			setValueEx(Cnd_ac_dt_fr, null);
			setValueEx(Cnd_ac_dt_to, null);
			setValueEx(Cnd_arr_act_no, null);
			setValueEx(Cnd_sls_act_no, null);
			setValueEx(Cnd_sls_act_d_no, null);
			setValueEx(Cnd_dlv_slip_no, null);
			setValueEx(Cnd_inc_ret_dscnt_flg, false);
			
			setValueEx(Cnd_act_intr_rmrks, null);
			setValueEx(Cnd_act_d_intr_rmrks, null);
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

			setStsPanelFlg();
			
			if (Cnd_mode_SRCH_HDR.isSelected()) {
				clearHdrModeColumn();
				setStsPanelFlgToFalse();
				setStatus(SRCH_SCHD_HDR);
			}
			else if (Cnd_mode_SRCH_DTL.isSelected()) {
				setValueEx(Cnd_act_io_sub_char1, null);
				setValueEx(Cnd_act_io_sub_char2, null);
				setValueEx(Cnd_act_io_sub_char3, null);
				setValueEx(Cnd_arr_act_no, null);
				setStatus(SRCH_SCHD_DTL);
			}
			else if (Cnd_mode_SRCH_LST.isSelected()) {
				setStatus(SRCH_SCHD_LST);
			}
		}
		else if (Cnd_ope_SRCH_ACT_REF.isSelected()) {
			setBoolean(SyncPanel, true);
			setStsPanelFlgToFalse();
			
			if (Cnd_mode_SRCH_HDR.isSelected()) {
				
				clearHdrModeColumn();
				
				setStatus(SRCH_ACT_HDR);
			}
			else if (Cnd_mode_SRCH_DTL.isSelected()) {
				setValueEx(Cnd_act_io_sub_char1, null);
				setValueEx(Cnd_act_io_sub_char2, null);
				setValueEx(Cnd_act_io_sub_char3, null);
				setValueEx(Cnd_arr_act_no, null);
				setStatus(SRCH_ACT_DTL);
			}
			else if (Cnd_mode_SRCH_LST.isSelected()) {
				setStatus(SRCH_ACT_LST);
			}
		}
	}
	@Override
	public void doRslt_NC(MCEventInfo info){
		super.doRslt_NC(info);
		RsltR r = RsltTable.getSelectedMCRow();

		if(!isNull(r)) {
			if (!isNull(r.sls_ret_schd_no())) {
				Btn_open_MSBBP1330.setMode(MCMode.ENABLE);
			}
			else {
				setDefaultMode(Btn_open_MSBBP1330);
			}
			
			if (MAC_TRD_PTN_TYP.isSLS_RTN(r.trd_ptn_typ())) {
				if (Cnd_ope_SRCH_SCHD_REF.isSelected()) {
					if (Cnd_mode_SRCH_DTL.isSelected() || Cnd_mode_SRCH_LST.isSelected()) {
						if (MSC_SRET_SCHD_STS_TYP.isCMPL_ARR_NON_AC(r.sret_schd_sts_typ()) ||
								MSC_SRET_SCHD_STS_TYP.isNON_ARR(r.sret_schd_sts_typ()) ||
								MSC_SRET_SCHD_STS_TYP.isPART_ARR(r.sret_schd_sts_typ()) ||
								MSC_SRET_SCHD_STS_TYP.isPART_ARR_NON_AC(r.sret_schd_sts_typ())) {
							Btn_open_MSBBP1340.setMode(MCMode.ENABLE);
						}
						else {
							setDefaultMode(Btn_open_MSBBP1340);
						}
					}
					else {
						Btn_open_MSBBP1340.setMode(MCMode.ENABLE);
					}
				}
				else if (Cnd_ope_SRCH_ACT_REF.isSelected()) {
					Btn_open_MSBBP1340.setMode(MCMode.ENABLE);
				}
			}
			else {
				setDefaultMode(Btn_open_MSBBP1340);
			}
		}
		
	}
	
	/**
	 * 検索モード:ヘッダ時に値を消すカラム
	 */
	protected void clearHdrModeColumn() {
		setBoolean(VmiPanel, true);
		setValueEx(Cnd_inc_abort_flg, false);
		setValueEx(Cnd_sls_ret_schd_d_no, null);
		setValueEx(Cnd_sls_act_d_no, null);
		setValueEx(Cnd_dlv_cd, null);
		setValueEx(Cnd_dlv_nm, null);
		setValueEx(Cnd_dest_cd1, null);
		setValueEx(Cnd_dest_nm1, null);
		setValueEx(Cnd_dest_cd2, null);
		setValueEx(Cnd_dest_nm2, null);
		setValueEx(Cnd_dest_cd3, null);
		setValueEx(Cnd_dest_nm3, null);
		setValueEx(Cnd_site_cd, null);
		setValueEx(Cnd_site_nm, null);
		setValueEx(Cnd_loc_wg_cd, null);
		setValueEx(Cnd_loc_wg_nm, null);
		setValueEx(Cnd_loc_cd, null);
		setValueEx(Cnd_loc_nm, null);
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
		setValueEx(Cnd_lot_no, null);
		setValueEx(Cnd_sublot_no, null);
		setValueEx(Cnd_sno_p_PPanel.SnoWrkNo_sno1, null);
		setValueEx(Cnd_sno_p_PPanel.SnoWrkNo_sno2, null);
		setValueEx(Cnd_sno_p_PPanel.SnoWrkNo_sno3, null);
		setValueEx(Cnd_sno_p_PPanel.SnoWrkNo_sno4, null);
		setValueEx(Cnd_sno_p_PPanel.SnoWrkNo_wrk_no, null);
		setValueEx(Cnd_sno_p_PPanel.SnoWrkNo_wrk_nm, null);
		setValueEx(Cnd_cst_itm_cd, null);
		setValueEx(Cnd_cst_itm_nm, null);
		setValueEx(Cnd_gd_cd, null);
		setValueEx(Cnd_gd_nm, null);
		setValueEx(Cnd_ret_rsn_cd, null);
		setValueEx(Cnd_ret_rsn_nm, null);
		setValueEx(Cnd_cst_po_d_no, null);
		setValueEx(Cnd_trd_d_rmrks, null);
		setValueEx(Cnd_schd_d_intr_rmrks, null);
		setValueEx(Cnd_act_d_intr_rmrks, null);
		setValueEx(Cnd_arr_cnt_rmrks, null);
		setValueEx(Cnd_schd_d_sub_char1, null);
		setValueEx(Cnd_schd_d_sub_char2, null);
		setValueEx(Cnd_schd_d_sub_char3, null);
		
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

		if (Cnd_mode_SRCH_HDR.isSelected()) {
			setValueEx(Cnd_act_d_intr_rmrks, null);
			setValueEx(Cnd_act_d_sub_char1, null);
			setValueEx(Cnd_act_d_sub_char2, null);
			setValueEx(Cnd_act_d_sub_char3, null);
			setValueEx(Cnd_act_io_sub_char1, null);
			setValueEx(Cnd_act_io_sub_char2, null);
			setValueEx(Cnd_act_io_sub_char3, null);
			setValueEx(Cnd_arr_act_no, null);
		}
	}
	

	// --------------------イベント処理end--------------------------
	
	protected void checkForCallStackSub(MCMessageList msgList) {
		msgList.addAll(checkBeforeAfter(Cnd_sls_ret_schd_dt_fr, Cnd_sls_ret_schd_dt_to));
		msgList.addAll(checkBeforeAfter(Cnd_sls_ret_dt_fr, Cnd_sls_ret_dt_to));
		msgList.addAll(checkBeforeAfter(Cnd_ac_ym_fr, Cnd_ac_ym_to));
		msgList.addAll(checkBeforeAfter(Cnd_ac_dt_fr, Cnd_ac_dt_to));
		
		if(!Cnd_ope_SRCH_ACT_REF.isSelected() && !(Cnd_ope_SRCH_SCHD_REF.isSelected() && Cnd_mode_SRCH_HDR.isSelected())) {
			msgList.addAll(checkAtLeastOne(StsPanel));
		}
		msgList.addAll(checkAtLeastOne(IvPanel));
		msgList.addAll(checkAtLeastOne(SyncPanel));
		msgList.addAll(checkAtLeastOne(VmiPanel));
	}

}