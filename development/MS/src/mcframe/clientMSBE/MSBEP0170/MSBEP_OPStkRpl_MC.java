package mcframe.clientMSBE.MSBEP0170;

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
import mcframe.clientMAUB.MAUBP5030.*;
import mcframe.clientMAUB.MAUBP5040.*;
import mcframe.clientMAUB.MAUBP5120.*;
import mcframe.clientMAUB.MAUBP5250.*;
import mcframe.clientMAUB.MAUBP5260.*;
import mcframe.clientMAUB.MAUBP5270.*;
import mcframe.clientMAUB.MAUBP5280.*;
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
import mcframe.clientMAUD.MAUDP0010.IfListRegPanel;
import mcframe.clientMAUA.MAUAP0010.MAUAP_List;
//FMCB CUSTOM_IMPORT END

/**
 * 画面"MSBEP_OPStkRpl"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MSBEP_OPStkRpl_MC extends MSBEP_OPStkRpl_MC_A implements IfListRegPanel {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START

	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MSBEP_OPStkRpl_MC() {
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
	public MSBEP_OPStkRpl_MC(String name) {
		super(name);
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR_LIST START

		//FMCB CUSTOM_CONSTRUCTOR_LIST END
	}

	//画面処理メソッドはこれより下に定義してください。
	//FMCB CUSTOM_METHOD START

	/**
	 * [MS_MSBEL0170_Srch01]の定型処理のInnerClass
	 */
	protected class MS_MSBEL0170_Srch01Caller<P extends MSBEP_OPStkRpl, B extends MS_MSBEL0170_Srch01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Searcher<P, B> {

		protected MS_MSBEL0170_Srch01Caller(P p, B b) {
			super(p, b);
		}
		
		@Override
		protected void show() {
			super.show();
			showSub();
		}
		
		protected void showSub() {
			getLPnlR().master_dt(getCndR().master_dt());
			for (RsltR r : getRsltL()) {
				r.master_dt(getLPnlR().master_dt());
			}
		}
		
		@Override
		protected void setMode() {
			super.setMode();
			setUPDStatus();
		}
		
		@Override
		protected void setModeNoDown() {
			super.setModeNoDown();
			setSRCHStatus();
		}
	}

	/**
	 * [MS_MSBEL0170_Sprt01]の定型処理のInnerClass
	 */
	protected class MS_MSBEL0170_Sprt01Caller<P extends MSBEP_OPStkRpl, B extends MS_MSBEL0170_Sprt01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_InputSupporter<P, B> {

		protected MS_MSBEL0170_Sprt01Caller(P p, B b) {
			super(p, b);
		}
	}

	/**
	 * [MS_MSBEL0170_Ins01]の定型処理のInnerClass
	 */
	protected class MS_MSBEL0170_Ins01Caller<P extends MSBEP_OPStkRpl, B extends MS_MSBEL0170_Ins01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Updater<P, B> {

		protected MS_MSBEL0170_Ins01Caller(P p, B b) {
			super(p, b);
		}
	}



	/**
	 * Panel[Ctrl]のボタン[ctrl_Ope_srch]の押下時の処理
	 */
	@Override
	public void doCtrl_ctrl_Ope_srch(MCEventInfo info) {
		callMS_MSBEL0170_Srch01();
	}
	/**
	 * Panel[Btn]のボタン[open_MSBEP0010]の押下時の処理
	 */
	@Override
	public void doBtn_open_MSBEP0010(MCEventInfo info) {
		RsltR r = RsltTable.getSelectedMCRow();
		if (r == null) {
			dialog(msgNoSelectedRow());
			return ;
		}
		doBtn_open_MSBEP0010(r);
	}
	protected void doBtn_open_MSBEP0010(RsltR r) {
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MS", "MSBEP0010");
		aso.runValueInit();
		aso.putCnd(crtOpenMSBEP0010CndR(aso, r));
		aso.putSearchAction();
		aso.show();
	}
	protected mcframe.clientMSBE.MSBEP0010.CndR crtOpenMSBEP0010CndR(
			MAUCP_AppScreenOpener aso, RsltR r) {
		mcframe.clientMSBE.MSBEP0010.CndR to = mcframe.clientMSBE.MSBEP0010.CndR.create();

		to.loc_cd(r.strg_loc_cd());
		to.itm_cd(r.itm_cd());
		to.itm_sub1(r.itm_sub1());
		to.itm_sub2(r.itm_sub2());
		to.itm_sub3(r.itm_sub3());
		to.quality_typ(MAC_QUALITY_TYP.GOOD.value());
		to.stk_insp_typ(MSC_STK_INSP_TYP.FIN.value());
		to.gd_cd(getDefaultFeedStkGd().gd_cd());
		
		return to;
	}
	
	/**
	 * Panel[Btn]のボタン[open_MSBEP0060]の押下時の処理
	 */
	@Override
	public void doBtn_open_MSBEP0060(MCEventInfo info) {
		RsltR r = RsltTable.getSelectedMCRow();
		if (r == null) {
			dialog(msgNoSelectedRow());
			return ;
		}
		doBtn_open_MSBEP0060(r);
	}
	protected void doBtn_open_MSBEP0060(RsltR r) {
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MS", "MSBEP0060");
		aso.runValueInit();
		aso.putCnd(crtOpenMSBEP0060CndR(aso, r), crtOpenMSBEP0060CndRClear());
		aso.putSearchAction();
		aso.show();
	}
	protected mcframe.clientMSBE.MSBEP0060.CndR crtOpenMSBEP0060CndR(
			MAUCP_AppScreenOpener aso, RsltR r) {
		mcframe.clientMSBE.MSBEP0060.MSBEP_IoTrnsSrch p = (mcframe.clientMSBE.MSBEP0060.MSBEP_IoTrnsSrch) aso
				.getPanel();
		mcframe.clientMSBE.MSBEP0060.CndR to = mcframe.clientMSBE.MSBEP0060.CndR.create();

		to.ope(p.Cnd_ope_SRCH_USE.getActionCommand());
		to.loc_cd(r.strg_loc_cd());
		to.itm_cd(r.itm_cd());
		to.itm_sub1(r.itm_sub1());
		to.itm_sub2(r.itm_sub2());
		to.itm_sub3(r.itm_sub3());
		to.gd_cd(getDefaultFeedStkGd().gd_cd());
		
		return to;
	}
	protected List<String> crtOpenMSBEP0060CndRClear(){
		List<String> l = new ArrayList<>();
		l.add(mcframe.clientMSBE.MSBEP0060.CndR.$gi_prcd_flg);
		l.add(mcframe.clientMSBE.MSBEP0060.CndR.$gr_prcd_flg);
		return l;
	}
	
	/**
	 * Panel[Btn]のボタン[open_dtl]の押下時の処理
	 */
	@Override
	public void doBtn_open_dtl(MCEventInfo info) {
		RsltR r = RsltTable.getSelectedMCRow();
		if (r == null) {
			dialog(msgNoSelectedRow());
			return ;
		}
		doBtn_open_dtl(r);
	}
	protected void doBtn_open_dtl(RsltR r) {
		if (MSC_OP_RPL_MTD_TYP.isMFG(r.op_rpl_mtd_typ())
				&& !isNullOrNullVal(r.mfg_loc_cd())) {
			doBtn_open_MSBCP0050(r);
		}
		else if (!isNullOr(r.strg_wg_cd(), r.rqst_wg_cd())
				&& !isSame(r.strg_wg_cd(), r.rqst_wg_cd())) {
			doBtn_open_MSBAP0100(r);
		}
		else if (MSC_OP_RPL_MTD_TYP.isOUTSRC(r.op_rpl_mtd_typ())
				&& !isNullOrNullVal(r.mfg_loc_cd())) {
			doBtn_open_MSBDP0030(r);
		}
		else if (MSC_OP_RPL_MTD_TYP.isPURC(r.op_rpl_mtd_typ())
				&& !isNullOrNullVal(r.sppl_cd())) {
			doBtn_open_MSBDP0030(r);
		}
		else if (MSC_OP_RPL_MTD_TYP.isXFR(r.op_rpl_mtd_typ())
				&& !isNullOrNullVal(r.rqst_loc_cd())) {
			doBtn_open_MSBEP1000(r);
		}
	}
	protected void doBtn_open_MSBCP0050(RsltR r){
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MS", "MSBCP0050");
		aso.runValueInit();
		aso.putCnd(crtOpenMSBCP0050CndR(aso, r));
		aso.putSearchAction();
		aso.show();
	}
	protected mcframe.clientMSBC.MSBCP0050.CndR crtOpenMSBCP0050CndR(MAUCP_AppScreenOpener aso, RsltR r) {		
		mcframe.clientMSBC.MSBCP0050.MSBCP_OrdSrch p = (mcframe.clientMSBC.MSBCP0050.MSBCP_OrdSrch) aso
				.getPanel();
		mcframe.clientMSBC.MSBCP0050.CndR to = mcframe.clientMSBC.MSBCP0050.CndR.create();
		
		to.ope(p.Cnd_ope_REF.getActionCommand());
		to.itm_cd(r.itm_cd());
		to.itm_sub1(r.itm_sub1());
		to.itm_sub2(r.itm_sub2());
		to.itm_sub3(r.itm_sub3());
		to.strg_loc_cd(r.strg_loc_cd());
		to.mfg_loc_cd(r.mfg_loc_cd());
		to.mfg_st_schd_dt_fr(getStDt(r));
		to.avl_schd_dt_fr(r.end_schd_dt());
		to.ord_gnrt_typ(MSC_ORD_GNRT_TYP.MNL.value());
		
		return to;
	}
	protected void doBtn_open_MSBDP0030(RsltR r) {
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MS", "MSBDP0030");
		aso.runValueInit();
		aso.putCnd(crtOpenMSBDP0030CndR(aso, r));
		aso.putSearchAction();
		aso.show();
	}
	protected mcframe.clientMSBD.MSBDP0030.CndR crtOpenMSBDP0030CndR(MAUCP_AppScreenOpener aso, RsltR r) {
		mcframe.clientMSBD.MSBDP0030.MSBDP_PoSchdListReg p = (mcframe.clientMSBD.MSBDP0030.MSBDP_PoSchdListReg) aso
				.getPanel();
		mcframe.clientMSBD.MSBDP0030.CndR to = mcframe.clientMSBD.MSBDP0030.CndR.create();

		to.ope(p.Cnd_ope_REF.getActionCommand());
		to.itm_cd(r.itm_cd());
		to.itm_sub1(r.itm_sub1());
		to.itm_sub2(r.itm_sub2());
		to.itm_sub3(r.itm_sub3());
		to.in_to_loc_cd(r.strg_loc_cd());
		to.sppl_cd(r.sppl_cd());
		to.maker_cd(r.maker_cd());
		if (!isNullOrNullVal(r.mfg_loc_cd())) {
			// 外注
			to.sppl_cd(r.mfg_loc_sppl_cd());
			to.maker_cd(null);
		}
		to.reg_dt_fr(getToday());
		to.reg_dt_to(getToday());
		to.po_schd_src_typ(MSC_PO_SCHD_SRC_TYP.OP.value());
		
		return to;
	}
	protected void doBtn_open_MSBEP1000(RsltR r){
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MS", "MSBEP1000");
		aso.runValueInit();
		aso.putCnd(crtOpenMSBEP1000CndR(aso, r));
		aso.putSearchAction();
		aso.show();
	}
	protected mcframe.clientMSBE.MSBEP1000.CndR crtOpenMSBEP1000CndR(MAUCP_AppScreenOpener aso, RsltR r) {
		mcframe.clientMSBE.MSBEP1000.MSBEP_XfrSchdReg p = (mcframe.clientMSBE.MSBEP1000.MSBEP_XfrSchdReg) aso
				.getPanel();
		mcframe.clientMSBE.MSBEP1000.CndR to = mcframe.clientMSBE.MSBEP1000.CndR.create();

		to.ope(p.Cnd_ope_REF.getActionCommand());
		to.itm_cd(r.itm_cd());
		to.itm_sub1(r.itm_sub1());
		to.itm_sub2(r.itm_sub2());
		to.itm_sub3(r.itm_sub3());
		to.gr_loc_cd(r.strg_loc_cd());
		to.gi_loc_cd(r.rqst_loc_cd());
		to.gi_str_ln_cd(r.rqst_str_ln_cd());
		to.rcpt_dt_fr(getToday());
		to.rcpt_dt_to(getToday());
		to.xfr_src_typ(MSC_XFR_SRC_TYP.OP_RPL.value());
		
		return to;
	}
	protected void doBtn_open_MSBAP0100(RsltR r){
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MS", "MSBAP0100");
		aso.runValueInit();
		aso.putCnd(crtOpenMSBAP0100CndR(aso, r));
		aso.putSearchAction();
		aso.show();
	}
	protected MCConstRow crtOpenMSBAP0100CndR(MAUCP_AppScreenOpener aso, RsltR r) {
		mcframe.clientMSBA.MSBAP0100.MSBAP_WgRqstReg p = (mcframe.clientMSBA.MSBAP0100.MSBAP_WgRqstReg) aso.getPanel();
		mcframe.clientMSBA.MSBAP0100.CndR to = mcframe.clientMSBA.MSBAP0100.CndR.create();

		to.ope(p.Cnd_ope_REF.getActionCommand());
		to.itm_cd(r.itm_cd());
		to.itm_sub1(r.itm_sub1());
		to.itm_sub2(r.itm_sub2());
		to.itm_sub3(r.itm_sub3());
		to.rqst_to_wg_cd(r.rqst_wg_cd());
		to.rqst_fr_wg_cd(r.strg_wg_cd());
		to.gr_loc_cd(r.strg_loc_cd());
		// 購買
		if (!isNullOrNullVal(r.sppl_cd())) {
			to.sppl_cd(r.sppl_cd());
		}
		// 外注
		if (!isNullOrNullVal(r.mfg_loc_cd())) {
			to.sppl_cd(r.mfg_loc_sppl_cd());
		}
		to.rqst_dt_fr(getToday());
		to.rqst_dt_to(getToday());
		to.wg_rqst_src_typ(MSC_WG_RQST_SRC_TYP.OP_RPL.value());
		
		return to;
	}
	protected MCDate getStDt(RsltR r) {
		if (isNullAnd(r.st_schd_dt(), r.end_schd_dt())) {
			return getToday();
		}
		return r.st_schd_dt();
	}
	/**
	 * Panel[Btn]のボタン[sprt_due_dt]の押下時の処理
	 */
	@Override
	public void doBtn_sprt_due_dt(MCEventInfo info) {
		callMS_MSBEL0170_Sprt01();
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
	/**
	 * Panel[Btn]のボタン[rdel]の押下時の処理
	 */
	@Override
	public void doBtn_rdel(MCEventInfo info) {
		deleteRow(RsltTable);
	}
	/**
	 * Panel[Btn]のボタン[rcopy]の押下時の処理
	 */
	@Override
	public void doBtn_rcopy(MCEventInfo info) {
		copyRow(RsltTable);
	}
	@Override
	protected List<String> getNotInheritCols(String type, MCContainer cont) {
		List<String> l = super.getNotInheritCols(type, cont);
		l.add(RsltR.$rqst_qty);
		return l;
	}
	/**
	 * Panel[Btn]のボタン[upd]の押下時の処理
	 */
	@Override
	public void doBtn_upd(MCEventInfo info) {
		callMS_MSBEL0170_Ins01();
	}
	
	// -----------------------------------------------
	// init-parts
	@Override
	public MCTable getListRegTable() {
		return RsltTable;
	}

	@Override
	protected void setupParts() {
		super.setupParts();
		Rslt_rqst_qty_p_PPanel.setRelateBeans(columnRslt_unit_cd, columnRslt_dec_place);
		Rslt_gr_schd_qty_p_PPanel.setRelateBeans(columnRslt_unit_cd, columnRslt_dec_place);
		Rslt_stk_qty_p_PPanel.setRelateBeans(columnRslt_unit_cd, columnRslt_dec_place);
		Rslt_gi_schd_qty_p_PPanel.setRelateBeans(columnRslt_unit_cd, columnRslt_dec_place);
		Rslt_rord_stk_qty_p_PPanel.setRelateBeans(columnRslt_unit_cd, columnRslt_dec_place);
		Rslt_shortage_qty_p_PPanel.setRelateBeans(columnRslt_unit_cd, columnRslt_dec_place);
		Rslt_rord_rqst_qty_p_PPanel.setRelateBeans(columnRslt_unit_cd, columnRslt_dec_place);
		
		Rslt_gr_schd_cont_qty_p_PPanel.setRelateBeans(columnRslt_cont_fctr_flg, null,
				null, null, columnRslt_cont_fctr_dec_place, null);
		Rslt_stk_cont_qty_p_PPanel.setRelateBeans(columnRslt_cont_fctr_flg, null,
				null, null, columnRslt_cont_fctr_dec_place, null);
		Rslt_gi_schd_cont_qty_p_PPanel.setRelateBeans(columnRslt_cont_fctr_flg, null,
				null, null, columnRslt_cont_fctr_dec_place, null);
		Rslt_shortage_cont_qty_p_PPanel.setRelateBeans(columnRslt_cont_fctr_flg, null,
				null, null, columnRslt_cont_fctr_dec_place, null);
		
		Rslt_sno_wrk_no_p_PPanel
				.setRelateBeans(columnRslt_itm_cd, columnRslt_itm_sub1,
						columnRslt_itm_sub2, columnRslt_itm_sub3,
						columnRslt_sno1_mng_typ, columnRslt_sno2_mng_typ,
						columnRslt_sno3_mng_typ, columnRslt_sno4_mng_typ);
		
		Rslt_ver_no_p_PPanel.setRelateBeans(columnRslt_itm_cd, columnRslt_itm_sub1,
				columnRslt_itm_sub2, columnRslt_itm_sub3, columnRslt_strg_site_cd,
				columnRslt_ver_flg);
		Rslt_str_ln_p_PPanel.setRelateBeans(columnRslt_rqst_loc_cd, columnRslt_rqst_str_ln_tgt_flg);
		
	}
	
	@Override
	protected void linkBeansToISPanel() {
		super.linkBeansToISPanel();
		
		// 発注先、メーカは入力補助も使用可能とする。
		linkBeansToISPanelCustom(columnRslt_sppl_cd);
		linkBeansToISPanelCustom(columnRslt_maker_cd);
	}

	@Override
	public MCList getRslt_mfg_loc_cd(MCRow row, MCEventInfo info) {
		int idx = info.getEventIndex();
		RsltR r = getRsltL().get(idx);
		if (MSC_OP_RPL_MTD_TYP.isMFG(r.op_rpl_mtd_typ())) {
			row.setBooleanNE(mcframe.commonMSUA.MSUAC0040.MSUAC_List.ItmDtlMfgLocCols.$i_mfg_flg, true);
		}
		else if (MSC_OP_RPL_MTD_TYP.isOUTSRC(r.op_rpl_mtd_typ())) {
			row.setBooleanNE(mcframe.commonMSUA.MSUAC0040.MSUAC_List.ItmDtlMfgLocCols.$i_outsrc_flg, true);
		}
		return super.getRslt_mfg_loc_cd(row, info);
	}

	@Override
	public MCList<MCRow> getRslt_op_rpl_mtd_typ(MCRow row, MCEventInfo info) {
		MCList<MCRow> opRplMtdTypL = super.getRslt_op_rpl_mtd_typ(row, info);
		MCList<MCRow> rsltL = MCList.create(MCRow.class);
		RsltR rsltR = getRsltL().get(info.getEventIndex());
		for (MCRow r : opRplMtdTypL) {
			if (isMatchOpRplMtdTyp(rsltR, r.getStringNE(MSC_OP_RPL_MTD_TYP.$VALUE))) {
				rsltL.add(r);
			}
		}
		return rsltL;
	}

	/**
	 * 適切な発注点在庫補充方法区分であるか否かを判定します。
	 * @param rsltR
	 * @param opRplMtdTyp
	 * @return
	 */
	protected boolean isMatchOpRplMtdTyp(RsltR rsltR, String opRplMtdTyp) {
		if (MSC_OP_RPL_MTD_TYP.isMFG(opRplMtdTyp)) {
			// 格納場所が外注場所の場合は対象外
			if (!isNull(rsltR.strg_sppl_cd())) {
				return false;
			}
		}
		if (MSC_OP_RPL_MTD_TYP.isOUTSRC(opRplMtdTyp)) {
			// 格納場所が外注場所の場合は対象外
			if (!isNull(rsltR.strg_sppl_cd())) {
				return false;
			}
		}
		return true;
	}

	// -----------------------------------------------
	// init-screen
	@Override
	protected void valueInit() {
		super.valueInit();
		valueInitSub();
	}

	protected void valueInitSub() {
		setValueEx(Cnd_master_dt, getToday());
		setValueEx(Cnd_shortage_flg, true);
	}
	
	// -----------------------------------------------
	// status
	@Override
	public void setSRCHStatus() {
		super.setSRCHStatus();
		Ctrl_ctrl_PPanel.expand(true);
		FoldTab.focusActiveFirstComponent();
		setModeByDisp();
		setBtnMode();
	}
	
	@Override
	public void setUPDStatus() {
		super.setUPDStatus();
		Ctrl_ctrl_PPanel.expand(false);
		setModeByDisp();
		RsltTable.selectLeftmostColumn(0);
		setBtnMode();
	}
	
	protected void setModeByDisp() {
		int sno_typ = getSnoTyp(this);
		if(sno_typ == 0) {
			LPnl_show_sno_flg.setMode(MCMode.INVISIBLE);
		}

		setModeByDisp(columnRslt_sno1, getLPnlR().show_sno_flg());
		setModeByDisp(columnRslt_sno2, getLPnlR().show_sno_flg());
		setModeByDisp(columnRslt_sno3, getLPnlR().show_sno_flg());
		setModeByDisp(columnRslt_sno4, getLPnlR().show_sno_flg());
		setModeByDisp(columnRslt_wrk_no, getLPnlR().show_sno_flg());
		setModeByDisp(columnRslt_wrk_nm, getLPnlR().show_sno_flg());
	}
	
	protected void setModeByDisp(MCColumnConfig column, boolean boo) {
		if (boo) {
			setDefaultMode(column);
		}
		else {
			column.setMode(MCMode.INVISIBLE);
		}
	}	

	protected void setBtnMode() {
		RsltR r = RsltTable.getSelectedMCRow();
		
		// 行削除、行コピーボタン
		if (isUpdStatus()) {
			if (r == null) {
				// テーブル操作ボタン
				Btn_rdel.setMode(MCMode.DISABLE);
				Btn_rcopy.setMode(MCMode.DISABLE);
			}
			else {
				if (r.isStatusCreate()) {
					setDefaultMode(Btn_rdel);
				}
				else {
					Btn_rdel.setMode(MCMode.DISABLE);
				}
				setDefaultMode(Btn_rcopy);
			}
		}
		
		// 画面遷移ボタン
		if (isEnableBtn_open_MSBEP0010(r)) {
			setDefaultMode(Btn_open_MSBEP0010);
		}
		else {
			Btn_open_MSBEP0010.setMode(MCMode.DISABLE);
		}
		if (isEnableBtn_open_MSBEP0060(r)) {
			setDefaultMode(Btn_open_MSBEP0060);
		}
		else {
			Btn_open_MSBEP0060.setMode(MCMode.DISABLE);
		}
		if (isEnableBtn_open_dtl(r)) {
			setDefaultMode(Btn_open_dtl);
		}
		else {
			Btn_open_dtl.setMode(MCMode.DISABLE);
		}

	}

	protected boolean isEnableBtn_open_MSBEP0010(RsltR r) {
		if (r == null) {
			return false;
		}
		return true;
	}
	
	protected boolean isEnableBtn_open_MSBEP0060(RsltR r) {
		if (r == null) {
			return false;
		}
		return true;
	}
	
	protected boolean isEnableBtn_open_dtl(RsltR r) {
		if (r == null) {
			return false;
		}
		if (isNull(r.op_rpl_mtd_typ())) {
			return false;
		}
		if (isNullOrNullVal(r.mfg_loc_cd()) && isNullOrNullVal(r.sppl_cd())
				&& isNullOrNullVal(r.rqst_loc_cd())) {
			return false;
		}
		return true;
	}
	
	protected boolean isUpdStatus() {
		return isSame(getStatus(), UPD);
	}

	// -----------------------------------------------
	// event/listener
	@Override
	public void doRslt_NC(MCEventInfo info) {
		super.doRslt_NC(info);
		setBtnMode();
	}

	// その他イベント
	@Override
	public void doRslt_op_rpl_mtd_typ_LC(MCEventInfo info) {
		super.doRslt_op_rpl_mtd_typ_LC(info);
		int idx = info.getEventIndex();
		setValueEx(columnRslt_mfg_loc_cd, idx, null);
		setValueEx(columnRslt_sppl_cd, idx, null);
		setValueEx(columnRslt_rqst_loc_cd, idx, null);
		setValueEx(columnRslt_ver_no, idx, null);
	}
	
	@Override
	public void doRslt_mfg_loc_cd_LC(MCEventInfo info) {
		super.doRslt_mfg_loc_cd_LC(info);
		int idx = info.getEventIndex();
		if (idx >= 0) {
			setValueEx(columnRslt_bom_ptn, idx, null);
			String val = (String)info.getNewValue();
			if (!isNullOrNullVal(val)) {
				setFirstBomPtn(getRsltL().get(idx), info);
			}
		}
		
	}
	
	protected void setFirstBomPtn(RsltR r, MCEventInfo info) {
		MCRow cnd = MCRow.create();
		cnd.addDateColumn(mcframe.commonMSUA.MSUAC0040.MSUAC_List.ItmDtlBomPtnCols.$i_dt, r.master_dt());
		cnd.addStringColumn(mcframe.commonMSUA.MSUAC0040.MSUAC_List.ItmDtlBomPtnCols.$i_itm_cd, r.itm_cd());
		cnd.addStringColumn(mcframe.commonMSUA.MSUAC0040.MSUAC_List.ItmDtlBomPtnCols.$i_itm_sub1, r.itm_sub1());
		cnd.addStringColumn(mcframe.commonMSUA.MSUAC0040.MSUAC_List.ItmDtlBomPtnCols.$i_itm_sub2, r.itm_sub2());
		cnd.addStringColumn(mcframe.commonMSUA.MSUAC0040.MSUAC_List.ItmDtlBomPtnCols.$i_itm_sub3, r.itm_sub3());
		cnd.addStringColumn(mcframe.commonMSUA.MSUAC0040.MSUAC_List.ItmDtlBomPtnCols.$i_wg_cd, r.strg_wg_cd());
		cnd.addStringColumn(mcframe.commonMSUA.MSUAC0040.MSUAC_List.ItmDtlBomPtnCols.$i_mfg_loc_cd, r.mfg_loc_cd());
		MCList<?> l = getRslt_bom_ptn(cnd, info);
		if (!isNull(l)) {
			MCRow base = l.get(0);
			r.bom_ptn(base.getStringNE(mcframe.commonMSUA.MSUAC0040.MSUAC_List.ItmDtlBomPtnCols.$o_bom_ptn));
			r.rqst_wg_cd(base.getStringNE(mcframe.commonMSUA.MSUAC0040.MSUAC_List.ItmDtlBomPtnCols.$o_rqst_wg_cd));
			r.rqst_wg_nm(base.getStringNE(mcframe.commonMSUA.MSUAC0040.MSUAC_List.ItmDtlBomPtnCols.$o_rqst_wg_nm));
		}
		
	}
	
	@Override
	public void doRslt_sppl_cd_LC(MCEventInfo info) {
		super.doRslt_sppl_cd_LC(info);
		int idx = info.getEventIndex();
		if (idx >= 0) {
			setValueEx(columnRslt_maker_cd, idx, null);
			String val = (String)info.getNewValue();
			if (!isNullOrNullVal(val)) {
				setFirstMaker(getRsltL().get(idx), info);
			}
		}
	}
	
	protected void setFirstMaker(RsltR r, MCEventInfo info) {
		MCRow cnd = MCRow.create();
		cnd.addDateColumn(mcframe.commonMSUA.MSUAC0040.MSUAC_List.ItmDtlMakerCols.$i_master_dt, r.master_dt());
		cnd.addStringColumn(mcframe.commonMSUA.MSUAC0040.MSUAC_List.ItmDtlMakerCols.$i_itm_cd, r.itm_cd());
		cnd.addStringColumn(mcframe.commonMSUA.MSUAC0040.MSUAC_List.ItmDtlMakerCols.$i_itm_sub1, r.itm_sub1());
		cnd.addStringColumn(mcframe.commonMSUA.MSUAC0040.MSUAC_List.ItmDtlMakerCols.$i_itm_sub2, r.itm_sub2());
		cnd.addStringColumn(mcframe.commonMSUA.MSUAC0040.MSUAC_List.ItmDtlMakerCols.$i_itm_sub3, r.itm_sub3());
		cnd.addStringColumn(mcframe.commonMSUA.MSUAC0040.MSUAC_List.ItmDtlMakerCols.$i_wg_cd, r.strg_wg_cd());
		cnd.addStringColumn(mcframe.commonMSUA.MSUAC0040.MSUAC_List.ItmDtlMakerCols.$i_sppl_cd, r.sppl_cd());
		MCList<?> l = getRslt_maker_cd(cnd, info);
		if (!isNull(l)) {
			MCRow base = l.get(0);
			r.maker_cd(base.getStringNE(mcframe.commonMSUA.MSUAC0040.MSUAC_List.ItmDtlMakerCols.$o_bp_cd));
			r.maker_nm(base.getStringNE(mcframe.commonMSUA.MSUAC0040.MSUAC_List.ItmDtlMakerCols.$o_bp_nm));
			r.rqst_wg_cd(base.getStringNE(mcframe.commonMSUA.MSUAC0040.MSUAC_List.ItmDtlMakerCols.$o_rqst_wg_cd));
			r.rqst_wg_nm(base.getStringNE(mcframe.commonMSUA.MSUAC0040.MSUAC_List.ItmDtlMakerCols.$o_rqst_wg_nm));
		}
		
	}
	
	// 一括設定
	@Override
	public void setDefaultValueWhenChecked(MCRow srcRow) {
		if (srcRow instanceof RsltR) {
			RsltR r = (RsltR) srcRow;
			if (isNull(r.st_schd_dt())) {
				bulkSet(LPnl_st_schd_dt, r);
			}
			if (isNull(r.end_schd_dt())) {
				bulkSet(LPnl_end_schd_dt, r);
			}
		}
	}
	
	@Override
	public void doRslt_check_NC(MCEventInfo info) {
		super.doRslt_check_NC(info);
		RsltR r = getRsltL().get(info.getEventIndex());
		if (r.check()) {
			if (isNull(r.st_schd_dt())) {
				bulkSet(LPnl_st_schd_dt, r);
			}
			if (isNull(r.end_schd_dt())) {
				bulkSet(LPnl_end_schd_dt, r);
			}
		}
	}	
	
	protected void bulkSet(MCBeans b) {
		for (RsltR r : RsltTable.getViewRows()) {
			if (r.check()) {
				 bulkSet(b, r);
			}
		}
	}
	
	 protected void bulkSet(MCBeans b, RsltR r) {
		 if (b == LPnl_st_schd_dt && isEditable(columnRslt_st_schd_dt, r.getGUIIndex())) {
			 r.st_schd_dt(getLPnlR().st_schd_dt());
		 }
		 if (b == LPnl_end_schd_dt && isEditable(columnRslt_end_schd_dt, r.getGUIIndex())) {
			 r.end_schd_dt(getLPnlR().end_schd_dt());
		 }
	}
	
	@Override
	public void doLPnl_st_schd_dt_LC(MCEventInfo info) {
		super.doLPnl_st_schd_dt_LC(info);
		bulkSet(LPnl_st_schd_dt);
	}
	
	 @Override
	public void doLPnl_end_schd_dt_LC(MCEventInfo info) {
		super.doLPnl_end_schd_dt_LC(info);
		bulkSet(LPnl_end_schd_dt);
	}

	 
	// 表示非表示切替
	@Override
	public void doLPnl_show_sno_flg_NC(MCEventInfo info) {
		super.doLPnl_show_sno_flg_NC(info);
		setModeByDisp();
	}
	
	// ダブルクリック
	@Override
	public void doDCEvent(MCDCBeans compo, MCEventInfo info) {
		super.doDCEvent(compo, info);
		if (compo == RsltTable) {
			RsltR r = getRsltL().get(info.getEventIndex());
			if (isEnableBtn_open_MSBEP0010(r)) {
				doBtn_open_MSBEP0010(r);
			}
		}
	}

	@Override
	public MCList getRslt_rqst_wg_cd(MCRow row, MCEventInfo info) {
		RsltR r = getRsltL().get(info.getEventIndex());
		MAUAP_List lst = (MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this);
		MCList<MCRow> tmpL = MCList.create(MCRow.class);
		tmpL.addStringColumn("RQST_WG_CD");
		tmpL.addStringColumn("RQST_WG_NM");
		// 棚卸資産管理しない品目は購買ＷＧから選択
		if (MAC_ASSET_MNG_TYP.isNOT_MNG(r.asset_mng_typ())
				&& MSC_OP_RPL_MTD_TYP.isPURC(r.op_rpl_mtd_typ())) {
			tmpL = lst.getPurcWg(row, info);
		}
		else {
			tmpL = lst.getWg(row, info);
		} 
		for(MCRow tmpR : tmpL) {
			tmpR.setStringNE("RQST_WG_CD", tmpR.getStringNE("WG_CD"));
			tmpR.setStringNE("RQST_WG_NM", tmpR.getStringNE("WG_NM"));
		}
		return tmpL;
	}

	// -----------------------------------------------
	// CellConfig
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
		public MCMode getPriorMode(int index, MCColumnConfig column, MCTable table) {
			RsltR r = (RsltR)table.getBaseTable().getRow(index);

			if (MAC_RTN_STS_TYP.isOK(r.rtn_sts_typ())) {
				return MCMode.READ_ONLY;
			}

			if (isUpdStatus()) {
				if (!MSC_OP_RPL_MTD_TYP.isMFG(r.op_rpl_mtd_typ())
						&& !MSC_OP_RPL_MTD_TYP.isOUTSRC(r.op_rpl_mtd_typ())) {
					if (column == columnRslt_mfg_loc_cd || column == columnRslt_bom_ptn) {
						return MCMode.READ_ONLY;
					}
				}
				if (!MSC_OP_RPL_MTD_TYP.isPURC(r.op_rpl_mtd_typ())) {
					if (column == columnRslt_sppl_cd
							|| column == columnRslt_maker_cd) {
						return MCMode.READ_ONLY;
					}
				}
				if (!MSC_OP_RPL_MTD_TYP.isXFR(r.op_rpl_mtd_typ())) {
					if (column == columnRslt_rqst_loc_cd) {
						return MCMode.READ_ONLY;
					}
				}
				
				if (column == columnRslt_ver_no) {
					if(MSC_OP_RPL_MTD_TYP.isMFG(r.op_rpl_mtd_typ())) {
						return MCMode.READ_ONLY;
					}
				}
				
				if (column == columnRslt_rqst_wg_cd) {
					if (!MAC_ASSET_MNG_TYP.isNOT_MNG(r.asset_mng_typ())
							|| !MSC_OP_RPL_MTD_TYP.isPURC(r.op_rpl_mtd_typ())) {
						return MCMode.READ_ONLY;
					}
				}
			}
			return super.getPriorMode(index, column, table);
		}
	}

}