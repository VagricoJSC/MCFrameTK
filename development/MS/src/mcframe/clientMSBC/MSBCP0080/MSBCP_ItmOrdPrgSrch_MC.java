package mcframe.clientMSBC.MSBCP0080;

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
import mcframe.clientMAUB.MAUBP5170.*;
import mcframe.clientMAUB.MAUBP5190.*;
import mcframe.clientMAUB.MAUBP5250.*;
import mcframe.clientMAUB.MAUBP5260.*;
import mcframe.clientMAUB.MAUBP5270.*;
import mcframe.clientMAUB.MAUBP5280.*;
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
 * 画面"MSBCP_ItmOrdPrgSrch"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MSBCP_ItmOrdPrgSrch_MC extends MSBCP_ItmOrdPrgSrch_MC_A {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START

	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MSBCP_ItmOrdPrgSrch_MC() {
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
	public MSBCP_ItmOrdPrgSrch_MC(String name) {
		super(name);
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR_LIST START

		//FMCB CUSTOM_CONSTRUCTOR_LIST END
	}

	//画面処理メソッドはこれより下に定義してください。
	//FMCB CUSTOM_METHOD START

	/**
	 * [MS_MSBCL0080_Srch01]の定型処理のInnerClass
	 */
	protected class MS_MSBCL0080_Srch01Caller<P extends MSBCP_ItmOrdPrgSrch, B extends MS_MSBCL0080_Srch01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Searcher<P, B> {

		protected MS_MSBCL0080_Srch01Caller(P p, B b) {
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

		protected void checkForCallStackSub(MCMessageList msgList) {
			msgList.addAll(checkAtLeastOne(StsPanel));
			msgList.addAll(checkAtLeastOne(OrdTypPanel));
			msgList.addAll(checkAtLeastOne(FixFlgPanel));
			msgList.addAll(checkAtLeastOne(OrdRcvPanel));
			msgList.addAll(checkAtLeastOne(OrdSndPanel));
			msgList.addAll(checkBeforeAfter(Cnd_po_schd_dt_fr, Cnd_po_schd_dt_to));
			msgList.addAll(checkBeforeAfter(Cnd_gi_schd_dt_fr, Cnd_gi_schd_dt_to));
			msgList.addAll(checkBeforeAfter(Cnd_mfg_st_schd_dt_fr, Cnd_mfg_st_schd_dt_to));
			msgList.addAll(checkBeforeAfter(Cnd_mfg_end_schd_dt_fr, Cnd_mfg_end_schd_dt_to));
			msgList.addAll(checkBeforeAfter(Cnd_accpt_schd_dt_fr, Cnd_accpt_schd_dt_to));
			msgList.addAll(checkBeforeAfter(Cnd_avl_schd_dt_fr, Cnd_avl_schd_dt_to));
			msgList.addAll(checkBeforeAfter(Cnd_strg_schd_dt_fr, Cnd_strg_schd_dt_to));
			msgList.addAll(checkBeforeAfter(Cnd_insp_st_schd_dt_fr, Cnd_insp_st_schd_dt_to));
			msgList.addAll(checkBeforeAfter(Cnd_insp_end_schd_dt_fr, Cnd_insp_end_schd_dt_to));
			msgList.addAll(checkSmallLarge(Cnd_arr_yield_rate_fr, Cnd_arr_yield_rate_to));
			msgList.addAll(checkSmallLarge(Cnd_purc_rate_fr, Cnd_purc_rate_to));
		}

		@Override
		protected void clear() {
			super.clear();
			panel.clearHiddenList();
		}

		@Override
		protected void setMode() {
			super.setMode();
			showItmOrd();
			setREFStatus();
		}

		@Override
		protected void setModeNoDown() {
			super.setModeNoDown();
			setSRCHStatus();
		}

		@Override
		protected void afterCall() {
			super.afterCall();
			panel.setHiddenList(bridge.down0());
		}

	}


	/**
	 * Panel[Ctrl]のボタン[ctrl_Ope_srch]の押下時の処理
	 */
	@Override
	public void doCtrl_ctrl_Ope_srch(MCEventInfo info) {
		callMS_MSBCL0080_Srch01();
	}
	/**
	 * Panel[RPnl]のボタン[dwnld]の押下時の処理
	 */
	@Override
	public void doRPnl_dwnld(MCEventInfo info) {
		createMS_MSBCL0080_Srch01().execDL();
	}
	/**
	 * Panel[Btn]のボタン[open_MSBCP0090]の押下時の処理
	 */
	@Override
	public void doBtn_open_MSBCP0090(MCEventInfo info) {
		// 工程オーダ進捗一覧照会画面
		MAUCP_AppScreenOpener scrnOpnr = getMsbcp0090ScrnOpnr();
		if(scrnOpnr != null) {
			scrnOpnr.show();
		}
	}
	
	protected MAUCP_AppScreenOpener getMsbcp0090ScrnOpnr() {
		RsltR r = RsltTable.getSelectedMCRow();
		if (r == null) {
			dialog(msgNoSelectedRow());
			return null;
		}
		
		MAUCP_AppScreenOpener so = new MAUCP_AppScreenOpener("MS", "MSBCP0090");
		mcframe.clientMSBC.MSBCP0090.CndR cnd = mcframe.clientMSBC.MSBCP0090.CndR.create();
		
		cnd.itm_ord_no(r.itm_ord_no());
		cnd.opn_flg(true);
		cnd.sav_flg(true);
		cnd.fix_flg(true);
		cnd.part_inst_flg(true);
		cnd.inst_flg(true);
		cnd.cmpl_flg(true);
		cnd.ord_rcv_tgt_flg(true);
		cnd.not_ord_rcv_tgt_flg(true);
		cnd.ord_snd_tgt_flg(true);
		cnd.not_ord_snd_tgt_flg(true);
		cnd.no_problem_flg(true);
		cnd.oper_qty_red_flg(true);
		cnd.st_dt_red_flg(true);
		cnd.end_dt_red_flg(true);
		
		so.putCnd(cnd);
		so.putSearchAction();

		return so;
	}

	/**
	 * Panel[Btn]のボタン[open_MSBCP0070]の押下時の処理
	 */
	@Override
	public void doBtn_open_MSBCP0070(MCEventInfo info) {
		// オーダ展開画面
		MAUCP_AppScreenOpener scrnOpnr = getMsbcp0070ScrnOpnr();
		if(scrnOpnr != null) {
			scrnOpnr.show();
		}
	}
	
	protected MAUCP_AppScreenOpener getMsbcp0070ScrnOpnr() {
		RsltR r = RsltTable.getSelectedMCRow();
		if (r == null) {
			dialog(msgNoSelectedRow());
			return null;
		}

		MAUCP_AppScreenOpener so = new MAUCP_AppScreenOpener("MS", "MSBCP0070");
		mcframe.clientMSBC.MSBCP0070.CndR cnd = mcframe.clientMSBC.MSBCP0070.CndR.create();
		mcframe.clientMSBC.MSBCP0070.MSBCP_OrdExtInfSrch p =
				(mcframe.clientMSBC.MSBCP0070.MSBCP_OrdExtInfSrch) so.getPanel();

		cnd.ope(p.Cnd_ope_ORD.getActionCommand());
		cnd.itm_ord_no(r.itm_ord_no());

		so.putCnd(cnd);
		so.putSearchAction();
		
		return so;
	}
	
	/**
	 * Panel[Btn]のボタン[open_MSBCP0060]の押下時の処理
	 */
	@Override
	public void doBtn_open_MSBCP0060(MCEventInfo info) {
		// オーダ逆展開画面
		openMsbcp0060();
	}
	
	//DCと画面遷移ボタンで共有
	protected void openMsbcp0060() {
		MAUCP_AppScreenOpener scrnOpnr = getMsbcp0060ScrnOpnr();
		if(scrnOpnr != null) {
			scrnOpnr.show();
		}
	}
	
	protected MAUCP_AppScreenOpener getMsbcp0060ScrnOpnr() {
		RsltR r = RsltTable.getSelectedMCRow();
		if (r == null) {
			dialog(msgNoSelectedRow());
			return null;
		}

		MAUCP_AppScreenOpener so = new MAUCP_AppScreenOpener("MS", "MSBCP0060");
		mcframe.clientMSBC.MSBCP0060.CndR cnd = mcframe.clientMSBC.MSBCP0060.CndR.create();
		mcframe.clientMSBC.MSBCP0060.MSBCP_OrdRevExtInfSrch p =
			(mcframe.clientMSBC.MSBCP0060.MSBCP_OrdRevExtInfSrch) so.getPanel();

		cnd.ope(p.Cnd_ope_ORD.getActionCommand());
		cnd.itm_ord_no(r.itm_ord_no());
		
		so.putCnd(cnd);
		so.putSearchAction();

		return so;
	}

	/**
	 * Panel[Btn]のボタン[open_DtlInfo]の押下時の処理
	 */
	@Override
	public void doBtn_open_DtlInfo(MCEventInfo info) {
		RsltR fr = RsltTable.getSelectedMCRow();
		if (fr == null) {
			dialog(msgNoSelectedRow());
			return;
		}

		MSC_ITM_ORD_TYP typ = MSC_ITM_ORD_TYP.getNE(fr.itm_ord_typ());
		if (MSC_ITM_ORD_TYP.isMFG(typ)) {
			MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MS", "MSBCP1070");
			MCRow asoRow = crtOpenMSBCP1070CndR(aso, fr);
			aso.putCnd(asoRow);
			aso.putSearchAction();
			aso.show();
		}
		else if (MSC_ITM_ORD_TYP.isPURC(typ) || MSC_ITM_ORD_TYP.isOUTSRC(typ)){
			MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MS", "MSBDP0090");
			MCRow asoRow = crtOpenMSBDP0090CndR(aso, fr);
			aso.putCnd(asoRow);
			aso.putSearchAction();
			aso.show();
		}
		else if (MSC_ITM_ORD_TYP.isXFR(typ) || MSC_ITM_ORD_TYP.isWG_XFR(typ)) {
			MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MS", "MSBEP1000");
			MCRow asoRow = crtOpenMSBEP1000CndR(aso, fr);
			aso.putCnd(asoRow);
			aso.putSearchAction();
			aso.show();
		}
	}
	
	/**
	 * 遷移先[MSBCP1070]の検索条件Rowコンテナを返します。
	 * @param aso 
	 * @param fr 
	 */
	protected mcframe.clientMSBC.MSBCP1070.CndR crtOpenMSBCP1070CndR(MAUCP_AppScreenOpener aso, RsltR fr) {
		mcframe.clientMSBC.MSBCP1070.CndR to = mcframe.clientMSBC.MSBCP1070.CndR.create();
		mcframe.clientMSBC.MSBCP1070.MSBCP_MfgInstPrSrch p = (mcframe.clientMSBC.MSBCP1070.MSBCP_MfgInstPrSrch) aso.getPanel();

		to.tmp_sts_sav_flg(true);
		to.tmp_sts_ord_flg(true);
		to.tmp_sts_stt_flg(true);
		to.tmp_sts_cmpl_flg(true);
		to.disp_unit1(p.Cnd_disp_unit1_HDR.getActionCommand());
		to.disp_unit2(p.Cnd_disp_unit2_INST.getActionCommand());
		to.unschd_act_flg(true);
		to.not_unschd_act_flg(true);
		to.itm_ord_no(fr.itm_ord_no());

		return to;
	}
	
	/**
	 * 遷移先[MSBDP0090]の検索条件Rowコンテナを返します。
	 * @param aso 
	 * @param fr 
	 */
	protected mcframe.clientMSBD.MSBDP0090.CndR crtOpenMSBDP0090CndR(MAUCP_AppScreenOpener aso, RsltR fr) {
		mcframe.clientMSBD.MSBDP0090.CndR to = mcframe.clientMSBD.MSBDP0090.CndR.create();
		mcframe.clientMSBD.MSBDP0090.MSBDP_PoListReg p = (mcframe.clientMSBD.MSBDP0090.MSBDP_PoListReg) aso.getPanel();

		to.ope(p.Cnd_ope_REF.getActionCommand());
		to.po_schd_src_typ(MSC_PO_SCHD_SRC_TYP.PPLN.value());
		to.po_schd_src_no(fr.itm_ord_no());

		return to;
	}
	
	/**
	 * 遷移先[MSBEP1000]の検索条件Rowコンテナを返します。
	 * @param aso 
	 * @param fr 
	 */
	protected mcframe.clientMSBE.MSBEP1000.CndR crtOpenMSBEP1000CndR(MAUCP_AppScreenOpener aso, RsltR fr) {
		mcframe.clientMSBE.MSBEP1000.CndR to = mcframe.clientMSBE.MSBEP1000.CndR.create();
		mcframe.clientMSBE.MSBEP1000.MSBEP_XfrSchdReg p = (mcframe.clientMSBE.MSBEP1000.MSBEP_XfrSchdReg) aso.getPanel();

		to.ope(p.Cnd_ope_REF.getActionCommand());
		if (MSC_ITM_ORD_TYP.isXFR(fr.itm_ord_typ())) {
			to.xfr_src_typ(MSC_XFR_SRC_TYP.ITM_ORD.value());
			to.xfr_src_no(fr.itm_ord_no());
		}
		else if (MSC_ITM_ORD_TYP.isWG_XFR(fr.itm_ord_typ())) {
			to.xfr_src_typ(MSC_XFR_SRC_TYP.WG_RQST.value());
			to.itm_ord_no(fr.itm_ord_no());
		}
		to.rqst_can_t_flg(true);
		to.rqst_can_f_flg(true);

		return to;
	}
	
	
	/**
	 * Panel[Btn]のボタン[open_MSBEP0010]の押下時の処理
	 */
	@Override
	public void doBtn_open_MSBEP0010(MCEventInfo info) {
		// 受注登録画面
		MAUCP_AppScreenOpener scrnOpnr = getMsbep0010ScrnOpnr();
		if(scrnOpnr != null) {
			scrnOpnr.show();
		}
	}
	
	protected MAUCP_AppScreenOpener getMsbep0010ScrnOpnr() {
		RsltR r = RsltTable.getSelectedMCRow();
		if (r == null) {
			dialog(msgNoSelectedRow());
			return null;
		}
		
		MAUCP_AppScreenOpener so = new MAUCP_AppScreenOpener("MS", "MSBEP0010");
		mcframe.clientMSBE.MSBEP0010.CndR cnd = mcframe.clientMSBE.MSBEP0010.CndR.create();
		mcframe.clientMSBE.MSBEP0010.MSBEP_StkSrch p =
				(mcframe.clientMSBE.MSBEP0010.MSBEP_StkSrch)so.getPanel();
		
		cnd.ope(p.Cnd_ope_STK.getActionCommand());
		cnd.itm_cd(r.itm_cd());
		cnd.itm_sub1(r.itm_sub1());
		cnd.itm_sub2(r.itm_sub2());
		cnd.itm_sub3(r.itm_sub3());
		cnd.sno1(r.sno1());
		cnd.sno2(r.sno2());
		cnd.sno3(r.sno3());
		cnd.sno4(r.sno4());
		
		so.putCnd(cnd);
		so.putSearchAction();
		
		return so;
	}

	// 画面起動処理（ここから）
	@Override
	protected void valueInit() {
		super.valueInit();
		valueInitSub();
	}

	protected void valueInitSub() {
		setValueEx(Cnd_opn_flg, true);
		setValueEx(Cnd_sav_flg, true);
		setValueEx(Cnd_fix_flg, true);
		setValueEx(Cnd_part_inst_flg, true);
		setValueEx(Cnd_inst_flg, true);
		setValueEx(Cnd_cmpl_flg, true);

		setValueEx(Cnd_mfg_flg, true);
		setValueEx(Cnd_purc_flg, true);
		setValueEx(Cnd_outsrc_flg, true);
		setValueEx(Cnd_xfr_flg, true);
		setValueEx(Cnd_wg_xfr_flg, true);

		setValueEx(Cnd_true_not_fix_flg, true);
		setValueEx(Cnd_false_not_fix_flg, true);

		setValueEx(Cnd_no_problem_flg, true);
		setValueEx(Cnd_schd_yield_red_flg, true);
		setValueEx(Cnd_st_dt_red_flg, true);
		setValueEx(Cnd_end_dt_red_flg, true);
		setValueEx(Cnd_avl_schd_dt_red_flg, true);
		setValueEx(Cnd_alloc_pln_red_flg, true);
		setValueEx(Cnd_surplus_ord_flg, true);
		setValueEx(Cnd_ord_rcv_tgt_flg, true);
		setValueEx(Cnd_not_ord_rcv_tgt_flg, true);
		setValueEx(Cnd_ord_snd_tgt_flg, true);
		setValueEx(Cnd_not_ord_snd_tgt_flg, true);
	}

	@Override
	protected void setupParts() {
		super.setupParts();

		Cnd_ver_no_p_PPanel.setRelateBeans(Cnd_itm_cd, Cnd_itm_sub1, Cnd_itm_sub2, Cnd_itm_sub3, null, null);
		Rslt_inst_qty_p_PPanel.setRelateBeans(columnRslt_base_unit_cd, columnRslt_dec_place);
		Rslt_yield_schd_qty_p_PPanel.setRelateBeans(columnRslt_base_unit_cd, columnRslt_dec_place);
		Rslt_inst_yield_schd_qty_p_PPanel.setRelateBeans(columnRslt_base_unit_cd, columnRslt_dec_place);
		Rslt_yield_act_qty_p_PPanel.setRelateBeans(columnRslt_base_unit_cd, columnRslt_dec_place);
		Rslt_purc_act_qty_p_PPanel.setRelateBeans(columnRslt_base_unit_cd, columnRslt_dec_place);
		Rslt_insp_act_qty_p_PPanel.setRelateBeans(columnRslt_base_unit_cd, columnRslt_dec_place);
		Rslt_schd_alloc_qty_p_PPanel.setRelateBeans(columnRslt_base_unit_cd, columnRslt_dec_place);
		Rslt_surplus_qty_p_PPanel.setRelateBeans(columnRslt_base_unit_cd, columnRslt_dec_place);
		Rslt_abort_qty_p_PPanel.setRelateBeans(columnRslt_base_unit_cd, columnRslt_dec_place);
		Rslt_yield_remain_qty_p_PPanel.setRelateBeans(columnRslt_base_unit_cd, columnRslt_dec_place);
		Rslt_purc_remain_qty_p_PPanel.setRelateBeans(columnRslt_base_unit_cd, columnRslt_dec_place);
		Rslt_insp_remain_qty_p_PPanel.setRelateBeans(columnRslt_base_unit_cd, columnRslt_dec_place);

		Rslt_cont_fctr_inst_qty_p_PPanel.setRelateBeans(
				columnRslt_cont_fctr_flg,
				columnRslt_inst_qty,
				columnRslt_std_cont_fctr,
				null,
				columnRslt_cont_fctr_dec_place,
				columnRslt_cont_fctr_rnd_typ);
		Rslt_cont_fctr_schd_yield_qty_p_PPanel.setRelateBeans(
				columnRslt_cont_fctr_flg,
				columnRslt_yield_schd_qty,
				columnRslt_std_cont_fctr,
				null,
				columnRslt_cont_fctr_dec_place,
				columnRslt_cont_fctr_rnd_typ);

		Rslt_itm_grp_p_PPanel.setRelateBeans(Cnd_itm_grp_p_PPanel);
		Rslt_bp_grp_p_PPanel.setRelateBeans(Cnd_bp_grp_p_PPanel);
	}

	// 画面起動処理（ここまで）
	// 画面ステータス及びフォーカス（ここから）
	public void setREFStatus() {
		super.setREFStatus();
		RsltTable.selectLeftmostColumn(0);
		Ctrl_ctrl_PPanel.expand(false);
		setBtnMode();
	}

	@Override
	public void setSRCHStatus() {
		super.setSRCHStatus();
		StsPanel.focusFirstComponent();
		Ctrl_ctrl_PPanel.expand(true);
	}
	// 画面ステータス及びフォーカス（ここまで）

	// イベント処理（ここから）	
	@Override
	public void doCnd_no_problem_flg_NC(MCEventInfo info) {
		super.doCnd_no_problem_flg_NC(info);
		showItmOrd();
	}

	@Override
	public void doCnd_schd_yield_red_flg_NC(MCEventInfo info) {
		super.doCnd_schd_yield_red_flg_NC(info);
		showItmOrd();
	}

	@Override
	public void doCnd_st_dt_red_flg_NC(MCEventInfo info) {
		super.doCnd_st_dt_red_flg_NC(info);
		showItmOrd();
	}

	@Override
	public void doCnd_end_dt_red_flg_NC(MCEventInfo info) {
		super.doCnd_end_dt_red_flg_NC(info);
		showItmOrd();
	}

	@Override
	public void doCnd_avl_schd_dt_red_flg_NC(MCEventInfo info) {
		super.doCnd_avl_schd_dt_red_flg_NC(info);
		showItmOrd();
	}

	@Override
	public void doCnd_alloc_pln_red_flg_NC(MCEventInfo info) {
		super.doCnd_alloc_pln_red_flg_NC(info);
		showItmOrd();
	}

	@Override
	public void doCnd_surplus_ord_flg_NC(MCEventInfo info) {
		super.doCnd_surplus_ord_flg_NC(info);
		showItmOrd();
	}
	@Override
	public void doRslt_NC(MCEventInfo info) {
		super.doRslt_NC(info);

		setBtnMode();
	}
	
	// ダブルクリック
	@Override
	public void doDCEvent(MCDCBeans compo, MCEventInfo info) {
		super.doDCEvent(compo, info);
		if (compo == RsltTable) {
			openMsbcp0060();
		}
	}
	
	// イベント処理（ここまで）

	// 裏リスト関連（ここから）
	/**
	 * 品目オーダ一覧の検索結果を保持
	 */
	protected MCList<RsltR> _itmOrdList;

	protected void clearHiddenList() {
		_itmOrdList = null;
	}

	protected void setHiddenList(MCList<RsltR> itm) {
		_itmOrdList = itm;
	}

	protected void showItmOrd() {
		MCList<RsltR> list = MCList.create(RsltR.class);
		List<String> tarCol = getDispTarCol();

		RsltTable.clear();

		if (_itmOrdList == null) {
			return;
		}
		for (RsltR r : _itmOrdList) {
			boolean isDisp = false;
			for (String col : tarCol) {
				if (r.getBoolean(col)) {
					isDisp = true;
					break;
				}
			}
			if (isDisp) {
				list.add(r);
			}
		}
		getRsltL().setAll(list);
		sort(RsltTable);
	}

	protected List<String> getDispTarCol() {
		List<String> tarCol = new ArrayList<String>();
		if (getCndR().no_problem_flg()) {
			tarCol.add(RsltR.$no_problem_flg);
		}

		if (getCndR().no_problem_flg()) {
			tarCol.add(RsltR.$no_problem_flg);
		}
		if (getCndR().schd_yield_red_flg()) {
			tarCol.add(RsltR.$schd_yield_red_flg);
		}
		if (getCndR().st_dt_red_flg()) {
			tarCol.add(RsltR.$st_dt_red_flg);
		}
		if (getCndR().end_dt_red_flg()) {
			tarCol.add(RsltR.$end_dt_red_flg);
		}
		if (getCndR().avl_schd_dt_red_flg()){
			tarCol.add(RsltR.$avl_schd_dt_red_flg);
		}
		if (getCndR().alloc_pln_red_flg()){
			tarCol.add(RsltR.$alloc_pln_red_flg);
		}
		if (getCndR().surplus_ord_flg()){
			tarCol.add(RsltR.$surplus_ord_flg);
		}
		return tarCol;
	}

	protected void setBtnMode(){
		RsltR r = RsltTable.getSelectedMCRow();

		if (!isNull(r)) {

			MSC_ITM_ORD_TYP typ = MSC_ITM_ORD_TYP.getNE(r.itm_ord_typ());
			if (MSC_ITM_ORD_TYP.isMFG(typ)) {
				Btn_open_MSBCP0090.setMode(MCMode.ENABLE);
				Btn_open_MSBCP0070.setMode(MCMode.ENABLE);
				Btn_open_MSBCP0060.setMode(MCMode.ENABLE);
			}
			else if (MSC_ITM_ORD_TYP.isPURC(typ)){
				Btn_open_MSBCP0060.setMode(MCMode.ENABLE);
				Btn_open_MSBCP0090.setMode(MCMode.READ_ONLY);
				Btn_open_MSBCP0070.setMode(MCMode.READ_ONLY);
			}
			else if (MSC_ITM_ORD_TYP.isOUTSRC(typ)){
				Btn_open_MSBCP0090.setMode(MCMode.ENABLE);
				Btn_open_MSBCP0070.setMode(MCMode.ENABLE);
				Btn_open_MSBCP0060.setMode(MCMode.ENABLE);
			}
			else if (MSC_ITM_ORD_TYP.isXFR(typ)) {
				Btn_open_MSBCP0060.setMode(MCMode.ENABLE);
				Btn_open_MSBCP0090.setMode(MCMode.READ_ONLY);
				Btn_open_MSBCP0070.setMode(MCMode.ENABLE);
			}
			else{
				Btn_open_MSBCP0060.setMode(MCMode.ENABLE);
				Btn_open_MSBCP0090.setMode(MCMode.READ_ONLY);
				Btn_open_MSBCP0070.setMode(MCMode.READ_ONLY);
			}

			MSC_ITM_ORD_STS_TYP stsTyp = MSC_ITM_ORD_STS_TYP.getNE(r.itm_ord_sts_typ());
			if (MSC_ITM_ORD_STS_TYP.isCMPL(stsTyp) || MSC_ITM_ORD_STS_TYP.isINST(stsTyp) || MSC_ITM_ORD_STS_TYP.isPART_INST(stsTyp)) {
				Btn_open_DtlInfo.setMode(MCMode.ENABLE);
			}
			else{
				Btn_open_DtlInfo.setMode(MCMode.READ_ONLY);
			}
		}
	}

		// ツールバーより画面クリアを行ったときに、裏リストもクリアする。
		@Override
		public void screenClearBody() {
			super.screenClearBody();
			clearHiddenList();
		}
	// 裏リスト関連（ここまで）
	// セルコンフィグ（ここから）
	/** 異常の色 */
	protected Color _RED_BG_COLOR = getPgmSettingColor(
			MSBCP_ItmOrdPrgSrch.class, "color.red");

	@Override
	protected void setCellConfig() {
		super.setCellConfig();
		RsltTable.setCellConfig(crtRsltCellConfig());
	}

	protected RsltCellConfig crtRsltCellConfig() {
		return new RsltCellConfig();
	}

	protected class RsltCellConfig extends MAUDP_CellConfig {

		@Override
		public Color getPriorBG(int index, MCColumnConfig column, MCTable table, MCMode mode) {
			RsltR row = getRsltL().get(index);

			MSC_ITM_ORD_TYP typ = MSC_ITM_ORD_TYP.getNE(row.itm_ord_typ());

			if (MSC_ITM_ORD_TYP.isMFG(typ)) {
				if (columnRslt_mfg_st_schd_dt == column) {
					if (row.st_dt_red_flg()) {
						return _RED_BG_COLOR;
					}
				}
				else if (columnRslt_mfg_end_schd_dt == column) {
					if (row.end_dt_red_flg()) {
						return _RED_BG_COLOR;
					}
				}
			}
			else if (MSC_ITM_ORD_TYP.isPURC(typ) || MSC_ITM_ORD_TYP.isOUTSRC(typ)) {
				if (columnRslt_po_schd_dt == column) {
					if (row.st_dt_red_flg()) {
						return _RED_BG_COLOR;
					}
				}
			}
			else if (MSC_ITM_ORD_TYP.isXFR(typ) || MSC_ITM_ORD_TYP.isWG_XFR(typ)) {
				if (columnRslt_gi_schd_dt == column) {
					if (row.st_dt_red_flg()) {
						return _RED_BG_COLOR;
					}
				}
			}
			else if (columnRslt_avl_schd_dt == column) {
				if (row.alloc_pln_red_flg()) {
					return _RED_BG_COLOR;
				}
			}
			return super.getPriorBG(index, column, table, mode);
		}

	}
	// セルコンフィグ（ここまで）
	@Override
	public MCList<?> getList(MCEventBeans combo, MCRow row, MCEventInfo info) {
		MCList<?> list =  super.getList(combo, row, info);
		if (combo == Cnd_ord_gnrt_typ) {
			// オーダ生成区分=計画外は検索対象外のため、検索条件からも除く
			list = list.subList(r -> !MSC_ORD_GNRT_TYP.isUPLND(r.getStringNE(MSC_ORD_GNRT_TYP.$VALUE)));
		}
		return list;
	}
}