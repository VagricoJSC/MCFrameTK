package mcframe.clientMSBE.MSBEP0010;

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
import mcframe.clientMAUB.MAUBP0340.*;
import mcframe.clientMAUB.MAUBP0440.*;
import mcframe.clientMAUB.MAUBP5030.*;
import mcframe.clientMAUB.MAUBP5040.*;
import mcframe.clientMAUB.MAUBP5050.*;
import mcframe.clientMAUB.MAUBP5120.*;
import mcframe.clientMAUB.MAUBP5170.*;
import mcframe.clientMAUB.MAUBP5250.*;
import mcframe.clientMAUB.MAUBP5260.*;
import mcframe.clientMAUB.MAUBP5270.*;
import mcframe.clientMAUB.MAUBP5280.*;
import mcframe.clientMAUB.MAUBP5290.*;
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
import static mcframe.commonFX.notice.FX_Msg.*;
//FMCB CUSTOM_IMPORT END

/**
 * 画面"MSBEP_StkSrch"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MSBEP_StkSrch_MC extends MSBEP_StkSrch_MC_A {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START

	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MSBEP_StkSrch_MC() {
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
	public MSBEP_StkSrch_MC(String name) {
		super(name);
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR_LIST START

		//FMCB CUSTOM_CONSTRUCTOR_LIST END
	}

	//画面処理メソッドはこれより下に定義してください。
	//FMCB CUSTOM_METHOD START

	/**
	 * Panel[Cnd]のボタン[select_all]の押下時の処理
	 */
	@Override
	public void doCnd_select_all(MCEventInfo info) {
		setDispTabSelectAll(true);
	}
	/**
	 * Panel[Cnd]のボタン[deselect_all]の押下時の処理
	 */
	@Override
	public void doCnd_deselect_all(MCEventInfo info) {
		setDispTabSelectAll(false);
	}
	/**
	 * Panel[Ctrl]のボタン[ctrl_Ope_srch]の押下時の処理
	 */
	@Override
	public void doCtrl_ctrl_Ope_srch(MCEventInfo info) {
		callMS_MSBEL0010_Srch01();
	}
	/**
	 * Panel[RPnl]のボタン[dwnld]の押下時の処理
	 */
	@Override
	public void doRPnl_dwnld(MCEventInfo info) {
		createMS_MSBEL0010_Srch01().execDL();
	}
	/**
	 * Panel[Btn]のボタン[open_MSBEP0030]の押下時の処理
	 */
	@Override
	public void doBtn_open_MSBEP0030(MCEventInfo info) {
		RsltR r = RsltTable.getSelectedMCRow();
		if (r == null) {
			dialog(msgNoSelectedRow());
			return;
		}
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MS", "MSBEP0030");
		aso.runValueInit();
		aso.putCnd(crtOpenMSBEP0030CndR(aso, r));
		aso.putSearchAction();
		aso.show();
	}

	protected mcframe.clientMSBE.MSBEP0030.CndR crtOpenMSBEP0030CndR(MAUCP_AppScreenOpener aso, RsltR r) {
		mcframe.clientMSBE.MSBEP0030.CndR to = mcframe.clientMSBE.MSBEP0030.CndR.create();

		to.loc_cd(r.loc_cd());
		to.str_ln_cd(r.str_ln_cd());
		to.stk_arrv_bp_cd(r.stk_arrv_bp_cd());
		to.site_cd(r.site_cd());
		to.wg_cd(r.wg_cd());
		to.lg_grp_cd(r.lg_grp_cd());
		to.alloc_grp_cd(r.alloc_grp_cd());
		to.loc_grp_cd(r.loc_grp_cd());
		to.dpt_cd(r.dpt_cd());
		to.itm_cd(r.itm_cd());
		to.itm_sub1(r.itm_sub1());
		to.itm_sub2(r.itm_sub2());
		to.itm_sub3(r.itm_sub3());
		to.itm_nm(r.itm_nm());
		to.lot_no(r.lot_no());
		to.sublot_no(r.sublot_no());
		to.sno1(r.sno1());
		to.sno2(r.sno2());
		to.sno3(r.sno3());
		to.sno4(r.sno4());
		to.gd_cd(r.gd_cd());
		to.in_xfr_typ(r.in_xfr_typ());
		to.quality_typ(r.quality_typ());
		to.stk_insp_typ(r.stk_insp_typ());
		to.asst_typ(r.asst_typ());
		to.stk_id_typ(r.stk_id_typ());
		to.fix_no_typ(r.fix_no_typ());
		to.fix_no(r.fix_no());
		to.stk_bp_cd(r.stk_bp_cd());
		to.pack_unit_cd(r.pack_unit_cd());

		return to;
	}

	/**
	 * Panel[Btn]のボタン[open_MSBEP0080]の押下時の処理
	 */
	@Override
	public void doBtn_open_MSBEP0080(MCEventInfo info) {
		RsltR r = RsltTable.getSelectedMCRow();
		if (r == null) {
			dialog(msgNoSelectedRow());
			return;
		}
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MS", "MSBEP0080");
		aso.runValueInit();
		aso.putCnd(crtOpenMSBEP0080CndR(aso, r));
		aso.putSearchAction();
		aso.show();
	}


	protected mcframe.clientMSBE.MSBEP0080.CndR crtOpenMSBEP0080CndR(MAUCP_AppScreenOpener aso, RsltR r) {
		mcframe.clientMSBE.MSBEP0080.CndR to = mcframe.clientMSBE.MSBEP0080.CndR.create();

		to.itm_cd(r.itm_cd());
		to.itm_sub1(r.itm_sub1());
		to.itm_sub2(r.itm_sub2());
		to.itm_sub3(r.itm_sub3());
		to.itm_nm(r.itm_nm());
		to.lot_no(r.lot_no());
		to.sublot_no(r.sublot_no());
		to.loc_cd(r.loc_cd());
		to.str_ln_cd(r.str_ln_cd());
		to.site_cd(r.site_cd());
		to.lg_grp_cd(r.lg_grp_cd());
		to.alloc_grp_cd(r.alloc_grp_cd());
		to.loc_grp_cd(r.loc_grp_cd());
		to.gd_cd(r.gd_cd());
		to.in_xfr_typ(r.in_xfr_typ());
		to.quality_typ(r.quality_typ());
		to.stk_insp_typ(r.stk_insp_typ());
		to.sno1(r.sno1());
		to.sno2(r.sno2());
		to.sno3(r.sno3());
		to.sno4(r.sno4());
		to.asst_typ(r.asst_typ());
		to.stk_id_typ(r.stk_id_typ());
		to.stk_bp_cd(r.stk_bp_cd());
		to.fix_no_typ(r.fix_no_typ());
		to.fix_no(r.fix_no());
		to.stk_arrv_bp_cd(r.stk_arrv_bp_cd());
		to.pack_unit_cd(r.pack_unit_cd());

		return to;
	}


	/**
	 * Panel[Btn]のボタン[open_MSBEP0040]の押下時の処理
	 */
	@Override
	public void doBtn_open_MSBEP0040(MCEventInfo info) {
		RsltR r = RsltTable.getSelectedMCRow();
		if (r == null) {
			dialog(msgNoSelectedRow());
			return;
		}
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MS", "MSBEP0040");
		aso.runValueInit();
		aso.putCnd(crtOpenMSBEP0040CndR(aso, r));
		aso.putSearchAction();
		aso.show();
	}

	protected mcframe.clientMSBE.MSBEP0040.CndR crtOpenMSBEP0040CndR(MAUCP_AppScreenOpener aso, RsltR r) {
		mcframe.clientMSBE.MSBEP0040.MSBEP_AllocSrch p = (mcframe.clientMSBE.MSBEP0040.MSBEP_AllocSrch) aso.getPanel();
		mcframe.clientMSBE.MSBEP0040.CndR to = mcframe.clientMSBE.MSBEP0040.CndR.create();

		to.ope(p.Cnd_ope_ALLOC.getActionCommand());
		if (Cnd_ope_LOC_ALLOC.isSelected()) {
			to.tgt(p.Cnd_tgt_LOC.getActionCommand());
		}
		else if (Cnd_ope_GRS_ALLOC.isSelected()) {
			to.tgt(p.Cnd_tgt_GRS.getActionCommand());
			to.alloc_grp_cd(r.alloc_grp_cd());
		}
		to.lg_grp_cd(r.lg_grp_cd());
		to.itm_cd(r.itm_cd());
		to.itm_sub1(r.itm_sub1());
		to.itm_sub2(r.itm_sub2());
		to.itm_sub3(r.itm_sub3());
		to.ver_no(r.ver_no());
		to.sno1(r.sno1());
		to.sno2(r.sno2());
		to.sno3(r.sno3());
		to.sno4(r.sno4());
		to.wrk_no(r.wrk_no());
		to.wrk_nm(r.wrk_nm());

		return to;
	}

	/**
	 * Panel[Btn]のボタン[open_MSBEP0110]の押下時の処理
	 */
	@Override
	public void doBtn_open_MSBEP0110(MCEventInfo info) {
		MCList<RsltR> list = MCList.create(RsltR.class);
		for (RsltR r : getRsltL()){
			if (r.check()){
				list.add(r);
			}
		}
		if (list.isEmpty()){
			throw new MCAppException(FXBAP0038);
		}

		openPanel("MS", "MSBEP0110", T6, list.get(0), list);
	}


	/**
	 * [MS_MSBEL0010_Srch01]の定型処理のInnerClass
	 */
	protected class MS_MSBEL0010_Srch01Caller<P extends MSBEP_StkSrch, B extends MS_MSBEL0010_Srch01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Searcher<P, B> {

		protected MS_MSBEL0010_Srch01Caller(P p, B b) {
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

		@Override
		protected void setMode() {
			super.setMode();
			setREFStatus();
			changeDisp();
		}

		@Override
		protected void setModeNoDown() {
			super.setModeNoDown();
			setSRCHStatus();
		}
	}

	protected void changeDisp() {
		doChangeDisp();
	}

	protected void doChangeDisp() {
		changeDispSubRemove();
	}

	protected void changeDispSubRemove() {
		changeDispDpt();
		changeDispWg();
		changeDispLoc();
		changeDispStrLn();
		changeDispStkArrvBp();
		changeDispSite();
		changeDispLocGrp();
		changeDispLgGrp();
		changeDispAllocGrp();
		changeDispPackUnit();
		changeDispGd();
		changeDispLot();
		changeDispSublot();
		changeDispLotInfo();
		changeDispSno1();
		changeDispSno2();
		changeDispSno3();
		changeDispSno4();
		changeDispFixNoTyp();
		changeDispFixNo();
		changeDispExctrlCols();
	}

	protected void changeDispDpt() {
		if (getCndR().dpt_flg()) {
			columnRslt_dpt_cd.setMode(getDefaultMode(columnRslt_dpt_cd));
			columnRslt_dpt_nm.setMode(getDefaultMode(columnRslt_dpt_nm));
		}
		else {
			columnRslt_dpt_cd.setMode(MCMode.INVISIBLE);
			columnRslt_dpt_nm.setMode(MCMode.INVISIBLE);
		}
	}

	protected void changeDispWg() {
		if (getCndR().wg_flg()) {
			columnRslt_wg_cd.setMode(getDefaultMode(columnRslt_wg_cd));
			columnRslt_wg_nm.setMode(getDefaultMode(columnRslt_wg_nm));
			columnRslt_std_unit_cost.setMode(getDefaultMode(columnRslt_std_unit_cost));
			columnRslt_stk_amt.setMode(getDefaultMode(columnRslt_stk_amt));
			columnRslt_base_cur_cd.setMode(getDefaultMode(columnRslt_base_cur_cd));
			columnRslt_base_cur_nm.setMode(getDefaultMode(columnRslt_base_cur_nm));
		}
		else {
			columnRslt_wg_cd.setMode(MCMode.INVISIBLE);
			columnRslt_wg_nm.setMode(MCMode.INVISIBLE);
			columnRslt_std_unit_cost.setMode(MCMode.INVISIBLE);
			columnRslt_stk_amt.setMode(MCMode.INVISIBLE);
			columnRslt_base_cur_cd.setMode(MCMode.INVISIBLE);
			columnRslt_base_cur_nm.setMode(MCMode.INVISIBLE);
		}
	}

	protected void changeDispLoc() {
		if (getCndR().loc_flg()) {
			columnRslt_loc_cd.setMode(getDefaultMode(columnRslt_loc_cd));
			columnRslt_loc_nm.setMode(getDefaultMode(columnRslt_loc_nm));
		}
		else {
			columnRslt_loc_cd.setMode(MCMode.INVISIBLE);
			columnRslt_loc_nm.setMode(MCMode.INVISIBLE);
		}
	}

	protected void changeDispStrLn() {
		if (getCndR().str_ln_flg()) {
			columnRslt_str_ln_cd.setMode(getDefaultMode(columnRslt_str_ln_cd));
			columnRslt_str_ln_nm.setMode(getDefaultMode(columnRslt_str_ln_nm));
			columnRslt_str_ln_cd_none_flg.setMode(getDefaultMode(columnRslt_str_ln_cd_none_flg));
		}
		else {
			columnRslt_str_ln_cd.setMode(MCMode.INVISIBLE);
			columnRslt_str_ln_nm.setMode(MCMode.INVISIBLE);
			columnRslt_str_ln_cd_none_flg.setMode(MCMode.INVISIBLE);
		}
	}

	protected void changeDispStkArrvBp() {
		if (getCndR().stk_arrv_bp_flg()) {
			columnRslt_stk_arrv_bp_cd.setMode(getDefaultMode(columnRslt_stk_arrv_bp_cd));
			columnRslt_stk_arrv_bp_nm.setMode(getDefaultMode(columnRslt_stk_arrv_bp_nm));
		}
		else {
			columnRslt_stk_arrv_bp_cd.setMode(MCMode.INVISIBLE);
			columnRslt_stk_arrv_bp_nm.setMode(MCMode.INVISIBLE);
		}
	}

	protected void changeDispSite() {
		if (getCndR().site_flg()) {
			columnRslt_site_cd.setMode(getDefaultMode(columnRslt_site_cd));
			columnRslt_site_nm.setMode(getDefaultMode(columnRslt_site_nm));
		}
		else {
			columnRslt_site_cd.setMode(MCMode.INVISIBLE);
			columnRslt_site_nm.setMode(MCMode.INVISIBLE);
		}
	}

	protected void changeDispLgGrp() {
		if (getCndR().lg_grp_flg()) {
			columnRslt_lg_grp_cd.setMode(getDefaultMode(columnRslt_lg_grp_cd));
			columnRslt_lg_grp_nm.setMode(getDefaultMode(columnRslt_lg_grp_nm));
		}
		else {
			columnRslt_lg_grp_cd.setMode(MCMode.INVISIBLE);
			columnRslt_lg_grp_nm.setMode(MCMode.INVISIBLE);
		}
	}

	protected void changeDispAllocGrp() {
		if (getCndR().alloc_grp_flg()) {
			columnRslt_alloc_grp_cd.setMode(getDefaultMode(columnRslt_alloc_grp_cd));
			columnRslt_alloc_grp_nm.setMode(getDefaultMode(columnRslt_alloc_grp_nm));
		}
		else {
			columnRslt_alloc_grp_cd.setMode(MCMode.INVISIBLE);
			columnRslt_alloc_grp_nm.setMode(MCMode.INVISIBLE);
		}
	}

	protected void changeDispPackUnit() {
		if (getCndR().pack_unit_flg()) {
			columnRslt_pack_unit_cd.setMode(getDefaultMode(columnRslt_pack_unit_cd));
			columnRslt_pack_unit_nm.setMode(getDefaultMode(columnRslt_pack_unit_nm));
			columnRslt_pack_unit_qty.setMode(getDefaultMode(columnRslt_pack_unit_qty));
		}
		else {
			columnRslt_pack_unit_cd.setMode(MCMode.INVISIBLE);
			columnRslt_pack_unit_nm.setMode(MCMode.INVISIBLE);
			columnRslt_pack_unit_qty.setMode(MCMode.INVISIBLE);
		}
	}

	protected void changeDispLocGrp() {
		if (getCndR().loc_grp_flg()) {
			columnRslt_loc_grp_cd.setMode(getDefaultMode(columnRslt_loc_grp_cd));
			columnRslt_loc_grp_nm.setMode(getDefaultMode(columnRslt_loc_grp_nm));
		}
		else {
			columnRslt_loc_grp_cd.setMode(MCMode.INVISIBLE);
			columnRslt_loc_grp_nm.setMode(MCMode.INVISIBLE);
		}
	}

	protected void changeDispGd() {
		if (getCndR().gd_flg()) {
			columnRslt_gd_cd.setMode(getDefaultMode(columnRslt_gd_cd));
			columnRslt_gd_nm.setMode(getDefaultMode(columnRslt_gd_nm));
		}
		else {
			columnRslt_gd_cd.setMode(MCMode.INVISIBLE);
			columnRslt_gd_nm.setMode(MCMode.INVISIBLE);
		}
	}

	protected void changeDispLot() {
		if (getCndR().lot_flg()) {
			columnRslt_lot_no.setMode(getDefaultMode(columnRslt_lot_no));
		}
		else {
			columnRslt_lot_no.setMode(MCMode.INVISIBLE);
		}
	}

	protected void changeDispSublot() {
		if (getCndR().sublot_flg()) {
			columnRslt_sublot_no.setMode(getDefaultMode(columnRslt_sublot_no));
		}
		else {
			columnRslt_sublot_no.setMode(MCMode.INVISIBLE);
		}
	}

	protected void changeDispLotInfo() {
		//ロットとサブロットのいずれかが集計されたらロット管理情報の項目、有効成分の項目は非表示にする
		if (getCndR().lot_flg() && getCndR().sublot_flg()) {
			columnRslt_ver_no.setMode(getDefaultMode(columnRslt_ver_no));
			columnRslt_act_cont_qty.setMode(getDefaultMode(columnRslt_act_cont_qty));
			columnRslt_act_cont_fctr.setMode(getDefaultMode(columnRslt_act_cont_fctr));
			columnRslt_std_cont_qty.setMode(getDefaultMode(columnRslt_std_cont_qty));
			columnRslt_std_cont_fctr.setMode(getDefaultMode(columnRslt_std_cont_fctr));
			columnRslt_cont_fctr_unit_cd.setMode(getDefaultMode(columnRslt_cont_fctr_unit_cd));
			columnRslt_cont_fctr_unit_nm.setMode(getDefaultMode(columnRslt_cont_fctr_unit_nm));
			columnRslt_lot_quality_typ.setMode(getDefaultMode(columnRslt_lot_quality_typ));
			columnRslt_lot_quality_typ_nm.setMode(getDefaultMode(columnRslt_lot_quality_typ_nm));
			columnRslt_lot_stk_insp_typ.setMode(getDefaultMode(columnRslt_lot_stk_insp_typ));
			columnRslt_lot_stk_insp_typ_nm.setMode(getDefaultMode(columnRslt_lot_stk_insp_typ_nm));
			columnRslt_mfg_aprv_sts_typ.setMode(getDefaultMode(columnRslt_mfg_aprv_sts_typ));
			columnRslt_mfg_aprv_sts_typ_nm.setMode(getDefaultMode(columnRslt_mfg_aprv_sts_typ_nm));
			columnRslt_plnt_aprv_sts_typ.setMode(getDefaultMode(columnRslt_plnt_aprv_sts_typ));
			columnRslt_plnt_aprv_sts_typ_nm.setMode(getDefaultMode(columnRslt_plnt_aprv_sts_typ_nm));
			columnRslt_first_gr_dt.setMode(getDefaultMode(columnRslt_first_gr_dt));
			columnRslt_unreg_lmt_flg.setMode(getDefaultMode(columnRslt_unreg_lmt_flg));
			columnRslt_vld_dt.setMode(getDefaultMode(columnRslt_vld_dt));
			columnRslt_lmt_dt.setMode(getDefaultMode(columnRslt_lmt_dt));
			columnRslt_mrkt_judg_sts_typ.setMode(getDefaultMode(columnRslt_mrkt_judg_sts_typ));
			columnRslt_mrkt_judg_sts_typ_nm.setMode(getDefaultMode(columnRslt_mrkt_judg_sts_typ_nm));
			columnRslt_lot_rmrks.setMode(getDefaultMode(columnRslt_lot_rmrks));
			columnRslt_lot_sub_char1.setMode(getDefaultMode(columnRslt_lot_sub_char1));
			columnRslt_lot_sub_char2.setMode(getDefaultMode(columnRslt_lot_sub_char2));
			columnRslt_lot_sub_char3.setMode(getDefaultMode(columnRslt_lot_sub_char3));
			//業者ロットＮＯは集計項目のため、ロット、サブロットの集計がされていない場合に非表示にするか判断する
			changeDispBpLot();
		}
		else {
			columnRslt_ver_no.setMode(MCMode.INVISIBLE);
			columnRslt_act_cont_qty.setMode(MCMode.INVISIBLE);
			columnRslt_act_cont_fctr.setMode(MCMode.INVISIBLE);
			columnRslt_std_cont_qty.setMode(MCMode.INVISIBLE);
			columnRslt_std_cont_fctr.setMode(MCMode.INVISIBLE);
			columnRslt_cont_fctr_unit_cd.setMode(MCMode.INVISIBLE);
			columnRslt_cont_fctr_unit_nm.setMode(MCMode.INVISIBLE);
			columnRslt_lot_quality_typ.setMode(MCMode.INVISIBLE);
			columnRslt_lot_quality_typ_nm.setMode(MCMode.INVISIBLE);
			columnRslt_lot_stk_insp_typ.setMode(MCMode.INVISIBLE);
			columnRslt_lot_stk_insp_typ_nm.setMode(MCMode.INVISIBLE);
			columnRslt_mfg_aprv_sts_typ.setMode(MCMode.INVISIBLE);
			columnRslt_mfg_aprv_sts_typ_nm.setMode(MCMode.INVISIBLE);
			columnRslt_plnt_aprv_sts_typ.setMode(MCMode.INVISIBLE);
			columnRslt_plnt_aprv_sts_typ_nm.setMode(MCMode.INVISIBLE);
			columnRslt_first_gr_dt.setMode(MCMode.INVISIBLE);
			columnRslt_unreg_lmt_flg.setMode(MCMode.INVISIBLE);
			columnRslt_vld_dt.setMode(MCMode.INVISIBLE);
			columnRslt_lmt_dt.setMode(MCMode.INVISIBLE);
			columnRslt_mrkt_judg_sts_typ.setMode(MCMode.INVISIBLE);
			columnRslt_mrkt_judg_sts_typ_nm.setMode(MCMode.INVISIBLE);
			columnRslt_lot_rmrks.setMode(MCMode.INVISIBLE);
			columnRslt_lot_sub_char1.setMode(MCMode.INVISIBLE);
			columnRslt_lot_sub_char2.setMode(MCMode.INVISIBLE);
			columnRslt_lot_sub_char3.setMode(MCMode.INVISIBLE);
			columnRslt_bp_lot_no.setMode(MCMode.INVISIBLE);
		}
	}

	protected void changeDispSno1() {
		if (getCndR().sno1_flg()) {
			columnRslt_sno1.setMode(getDefaultMode(columnRslt_sno1));
			columnRslt_wrk_no.setMode(getDefaultMode(columnRslt_wrk_no));
			columnRslt_wrk_nm.setMode(getDefaultMode(columnRslt_wrk_nm));
		}
		else {
			columnRslt_sno1.setMode(MCMode.INVISIBLE);
			columnRslt_wrk_no.setMode(MCMode.INVISIBLE);
			columnRslt_wrk_nm.setMode(MCMode.INVISIBLE);
		}
	}

	protected void changeDispSno2() {
		if (getCndR().sno2_flg()) {
			columnRslt_sno2.setMode(getDefaultMode(columnRslt_sno2));
		}
		else {
			columnRslt_sno2.setMode(MCMode.INVISIBLE);
		}
	}

	protected void changeDispSno3() {
		if (getCndR().sno3_flg()) {
			columnRslt_sno3.setMode(getDefaultMode(columnRslt_sno3));
		}
		else {
			columnRslt_sno3.setMode(MCMode.INVISIBLE);
		}
	}

	protected void changeDispSno4() {
		if (getCndR().sno4_flg()) {
			columnRslt_sno4.setMode(getDefaultMode(columnRslt_sno4));
		}
		else {
			columnRslt_sno4.setMode(MCMode.INVISIBLE);
		}
	}

	protected void changeDispFixNoTyp() {
		if (getCndR().fix_no_typ_flg()) {
			columnRslt_fix_no_typ.setMode(getDefaultMode(columnRslt_fix_no_typ));
			columnRslt_fix_no_typ_nm.setMode(getDefaultMode(columnRslt_fix_no_typ_nm));
		}
		else {
			columnRslt_fix_no_typ.setMode(MCMode.INVISIBLE);
			columnRslt_fix_no_typ_nm.setMode(MCMode.INVISIBLE);
		}
	}

	protected void changeDispFixNo() {
		if (getCndR().fix_no_flg()) {
			columnRslt_fix_no.setMode(getDefaultMode(columnRslt_fix_no));
		}
		else {
			columnRslt_fix_no.setMode(MCMode.INVISIBLE);
		}
	}

	protected void changeDispBpLot() {
		if (getCndR().bp_lot_flg()) {
			columnRslt_bp_lot_no.setMode(getDefaultMode(columnRslt_bp_lot_no));
		}
		else {
			columnRslt_bp_lot_no.setMode(MCMode.INVISIBLE);
		}
	}

	protected void changeDispExctrlCols() {
		//ひとつでも集計されたら制御用カラムは非表示
		if (getCndR().dpt_flg()
				&& getCndR().wg_flg()
				&& getCndR().loc_flg()
				&& getCndR().str_ln_flg()
				&& getCndR().stk_arrv_bp_flg()
				&& getCndR().site_flg()
				&& getCndR().loc_grp_flg()
				&& getCndR().lg_grp_flg()
				&& getCndR().alloc_grp_flg()
				&& getCndR().pack_unit_flg()
				&& getCndR().gd_flg()
				&& getCndR().lot_flg()
				&& getCndR().sublot_flg()
				&& getCndR().sno1_flg()
				&& getCndR().sno2_flg()
				&& getCndR().sno3_flg()
				&& getCndR().sno4_flg()
				&& getCndR().fix_no_typ_flg()
				&& getCndR().fix_no_flg()
				&& getCndR().bp_lot_flg()) {
			columnRslt_ins_usr_id.setMode(getDefaultMode(columnRslt_ins_usr_id));
			columnRslt_ins_usr_nm.setMode(getDefaultMode(columnRslt_ins_usr_nm));
			columnRslt_ins_func_id.setMode(getDefaultMode(columnRslt_ins_func_id));
			columnRslt_ins_func_nm.setMode(getDefaultMode(columnRslt_ins_func_nm));
			columnRslt_ins_ts.setMode(getDefaultMode(columnRslt_ins_ts));
			columnRslt_upd_usr_id.setMode(getDefaultMode(columnRslt_upd_usr_id));
			columnRslt_upd_usr_nm.setMode(getDefaultMode(columnRslt_upd_usr_nm));
			columnRslt_upd_func_id.setMode(getDefaultMode(columnRslt_upd_func_id));
			columnRslt_upd_func_nm.setMode(getDefaultMode(columnRslt_upd_func_nm));
			columnRslt_upd_ts.setMode(getDefaultMode(columnRslt_upd_ts));
			columnRslt_upd_srv_req_no.setMode(getDefaultMode(columnRslt_upd_srv_req_no));
		}
		else {
			columnRslt_ins_usr_id.setMode(MCMode.INVISIBLE);
			columnRslt_ins_usr_nm.setMode(MCMode.INVISIBLE);
			columnRslt_ins_func_id.setMode(MCMode.INVISIBLE);
			columnRslt_ins_func_nm.setMode(MCMode.INVISIBLE);
			columnRslt_ins_ts.setMode(MCMode.INVISIBLE);
			columnRslt_upd_usr_id.setMode(MCMode.INVISIBLE);
			columnRslt_upd_usr_nm.setMode(MCMode.INVISIBLE);
			columnRslt_upd_func_id.setMode(MCMode.INVISIBLE);
			columnRslt_upd_func_nm.setMode(MCMode.INVISIBLE);
			columnRslt_upd_ts.setMode(MCMode.INVISIBLE);
			columnRslt_upd_srv_req_no.setMode(MCMode.INVISIBLE);
		}
	}

	@Override
	public void setREFStatus() {
		super.setREFStatus();
		// 検索後ステータス
		if (Cnd_ope_STK.isSelected()) {
			setSTKStatus();
		}
		else if (Cnd_ope_LOC_ALLOC.isSelected()) {
			setLOC_ALLOCStatus();
		}
		else if (Cnd_ope_GRS_ALLOC.isSelected()) {
			setGRS_ALLOCStatus();
		}
		else if (Cnd_ope_PRNT.isSelected()) {
			setPRNTStatus();
		}
		RsltTable.selectLeftmostColumn(0);
		setBtnMode();
		Ctrl_ctrl_PPanel.expand(false);
	}

	@Override
	public void setSRCHStatus() {
		super.setSRCHStatus();

		// 検索前ステータス
		if (Cnd_ope_STK.isSelected()) {
			setSTKStatus();
		}
		else if (Cnd_ope_LOC_ALLOC.isSelected()) {
			setLOC_ALLOCStatus();
		}
		else if (Cnd_ope_GRS_ALLOC.isSelected()) {
			setGRS_ALLOCStatus();
		}
		else if (Cnd_ope_PRNT.isSelected()) {
			setPRNTStatus();
		}
		FoldTab.focusActiveFirstComponent();
		setBtnMode();
		Ctrl_ctrl_PPanel.expand(true);
	}

	protected void setBtnMode() {
		RsltR r = RsltTable.getSelectedMCRow();

		// 画面遷移ボタン
		if (isEnableBtn_open_MSBEP0030(r)) {
			Btn_open_MSBEP0030.setMode(MCMode.ENABLE);
		}
		else {
			setDefaultMode(Btn_open_MSBEP0030);
		}
		if (isEnableBtn_open_MSBEP0080(r)) {
			Btn_open_MSBEP0080.setMode(MCMode.ENABLE);
		}
		else {
			setDefaultMode(Btn_open_MSBEP0080);
		}
		if (isEnableBtn_open_MSBEP0040(r)) {
			Btn_open_MSBEP0040.setMode(MCMode.ENABLE);
		}
		else {
			setDefaultMode(Btn_open_MSBEP0040);
		}
		if (isEnableBtn_open_MSBEP0110()) {
			Btn_open_MSBEP0110.setMode(MCMode.ENABLE);
		}
		else {
			setDefaultMode(Btn_open_MSBEP0110);
		}
	}

	@Override
	public void setPRNTStatus() {
		super.setPRNTStatus();
		getCndR().dpt_flg(true);
		getCndR().wg_flg(true);
		getCndR().loc_flg(true);
		getCndR().str_ln_flg(true);
		getCndR().stk_arrv_bp_flg(true);
		getCndR().site_flg(true);
		getCndR().lg_grp_flg(true);
		getCndR().alloc_grp_flg(true);
		getCndR().loc_grp_flg(true);
		getCndR().lot_flg(true);
		getCndR().sublot_flg(true);
		getCndR().sno1_flg(true);
		getCndR().sno2_flg(true);
		getCndR().sno3_flg(true);
		getCndR().sno4_flg(true);
		getCndR().fix_no_typ_flg(true);
		getCndR().fix_no_flg(true);
		getCndR().bp_lot_flg(true);
		getCndR().pack_unit_flg(true);
		getCndR().gd_flg(true);
	}

	/**
	 * 月次在庫受払詳細照会画面に遷移できるか
	 * @return
	 */
	protected boolean isEnableBtn_open_MSBEP0030(RsltR r) {
		if (r == null) {
			return false;
		}
		return true;
	}
	/**
	 * 受払実績一覧照会画面に遷移できるか
	 * @return
	 */
	protected boolean isEnableBtn_open_MSBEP0080(RsltR r) {
		if (r == null) {
			return false;
		}
		return true;
	}

	/**
	 * 在庫引当状況画面に遷移できるか
	 * @return
	 */
	protected boolean isEnableBtn_open_MSBEP0040(RsltR r) {
		if (r == null) {
			return false;
		}
		//遷移先で物流Ｇが必須
		if (isNull(r.lg_grp_cd())) {
			return false;
		}
		return true;
	}

	/**
	 * 現品票発行画面に遷移できるか
	 * @return
	 */
	protected boolean isEnableBtn_open_MSBEP0110() {
		MCList<RsltR> l = getRsltL().subList("check", true);
		if (l.isEmpty()) {
			return false;
		}
		return true;
	}

	//イベント
	@Override
	public void doCnd_ope_NC(MCEventInfo info) {
		super.doCnd_ope_NC(info);

		clearContainers(getRsltL());
		clearCnd();
		setSRCHStatus();
	}

	protected void clearCnd() {
		setDispTabSelectAll(true);
		if (Cnd_ope_STK.isSelected() || Cnd_ope_PRNT.isSelected()) {
			setValueEx(Cnd_positive_alloc_qty_flg, false);
			setValueEx(Cnd_negative_alloc_qty_flg, false);
			setValueEx(Cnd_except_alloc_wait_flg, false);
			setValueEx(Cnd_abnormal_alloc_flg, false);
			setValueEx(Cnd_ignore_margin_days, null);
			
			setValueEx(Cnd_positive_stk_qty_flg, false);
			if (Cnd_ope_PRNT.isSelected()) {
				setValueEx(Cnd_positive_stk_qty_flg, true);
			}
		}
		else if (Cnd_ope_LOC_ALLOC.isSelected() || Cnd_ope_GRS_ALLOC.isSelected()) {
			setValueEx(Cnd_positive_stk_qty_flg, false);
			setValueEx(Cnd_negative_stk_qty_flg, false);
			setValueEx(Cnd_in_xfr_typ, null);
			setValueEx(Cnd_stk_insp_typ, null);
			setValueEx(Cnd_stk_id_typ, null);
			setValueEx(Cnd_fix_no_typ, null);
			setValueEx(Cnd_fix_no, null);
			if (Cnd_ope_GRS_ALLOC.isSelected()) {
				setValueEx(Cnd_dpt_cd, null);
				setValueEx(Cnd_dpt_nm, null);
				setValueEx(Cnd_loc_cd, null);
				setValueEx(Cnd_loc_nm, null);
				setValueEx(Cnd_str_ln_cd, null);
				setValueEx(Cnd_str_ln_nm, null);
				setValueEx(Cnd_stk_arrv_bp_cd, null);
				setValueEx(Cnd_stk_arrv_bp_nm, null);
				setValueEx(Cnd_site_cd, null);
				setValueEx(Cnd_site_nm, null);
				setValueEx(Cnd_loc_grp_cd, null);
				setValueEx(Cnd_loc_grp_nm, null);
				setValueEx(Cnd_lot_no, null);
				setValueEx(Cnd_sublot_no, null);
				setValueEx(Cnd_bp_lot_no, null);
				setValueEx(Cnd_pack_unit_cd, null);
				setValueEx(Cnd_pack_unit_nm, null);
			}
		}
	}

	@Override
	public void doCnd_loc_flg_NC(MCEventInfo info) {
		super.doCnd_loc_flg_NC(info);
		if (!getCndR().loc_flg()) {
			setValueEx(Cnd_str_ln_flg, false);
		}
	}

	@Override
	public void doCnd_str_ln_flg_NC(MCEventInfo info) {
		super.doCnd_str_ln_flg_NC(info);
		if (getCndR().str_ln_flg()) {
			setValueEx(Cnd_loc_flg, true);
		}
	}

	@Override
	public void doCnd_fix_no_typ_flg_NC(MCEventInfo info) {
		super.doCnd_fix_no_typ_flg_NC(info);
		if (!getCndR().fix_no_typ_flg()) {
			setValueEx(Cnd_fix_no_flg, false);
		}
	}

	@Override
	public void doCnd_fix_no_flg_NC(MCEventInfo info) {
		super.doCnd_fix_no_flg_NC(info);
		if (getCndR().fix_no_flg()) {
			setValueEx(Cnd_fix_no_typ_flg, true);
		}
	}

	@Override
	public void doRslt_NC(MCEventInfo info) {
		super.doRslt_NC(info);
		setBtnMode();
	}

	@Override
	public void doRslt_check_NC(MCEventInfo info){
		super.doRslt_check_NC(info);
		setBtnMode();
	}

	@Override
	public void doCnd_positive_alloc_qty_flg_NC(MCEventInfo info) {
		super.doCnd_positive_alloc_qty_flg_NC(info);
		//0以上と0以下の両方がオンにならないようにする。
		if (getCndR().positive_alloc_qty_flg()) {
			setValueEx(Cnd_negative_alloc_qty_flg, false);
		}
	}

	@Override
	public void doCnd_negative_alloc_qty_flg_NC(MCEventInfo info) {
		super.doCnd_negative_alloc_qty_flg_NC(info);
		//0以上と0以下の両方がオンにならないようにする。
		if (getCndR().negative_alloc_qty_flg()) {
			setValueEx(Cnd_positive_alloc_qty_flg, false);
		}
	}

	@Override
	public void doCnd_positive_stk_qty_flg_NC(MCEventInfo info) {
		super.doCnd_positive_stk_qty_flg_NC(info);
		//0以上と0以下の両方がオンにならないようにする。
		if (getCndR().positive_stk_qty_flg()) {
			setValueEx(Cnd_negative_stk_qty_flg, false);
		}
	}

	@Override
	public void doCnd_negative_stk_qty_flg_NC(MCEventInfo info) {
		super.doCnd_negative_stk_qty_flg_NC(info);
		//0以上と0以下の両方がオンにならないようにする。
		if (getCndR().negative_stk_qty_flg()) {
			setValueEx(Cnd_positive_stk_qty_flg, false);
		}
	}

	/**
	 * 検索条件のチェックの共通処理
	 * @param msgList
	 */
	protected void checkForCallStackForSrch(MCMessageList msgList) {
		msgList.addAll(checkBeforeAfter(Cnd_vld_dt_fr, Cnd_vld_dt_to));
		msgList.addAll(checkBeforeAfter(Cnd_lmt_dt_fr, Cnd_lmt_dt_to));
		msgList.addAll(checkBeforeAfter(Cnd_first_gr_dt_fr, Cnd_first_gr_dt_to));
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
	protected void setupParts() {
		super.setupParts();

		//数量項目
		Rslt_pack_unit_qty_p_PPanel.setRelateBeans(columnRslt_pack_unit_cd, columnRslt_pack_unit_dec_place);
		Rslt_stk_qty_p_PPanel.setRelateBeans(columnRslt_base_unit_cd, columnRslt_base_unit_dec_place);
		Rslt_gr_schd_qty_p_PPanel.setRelateBeans(columnRslt_alloc_unit_cd, columnRslt_alloc_unit_dec_place);
		Rslt_alloc_qty_p_PPanel.setRelateBeans(columnRslt_alloc_unit_cd, columnRslt_alloc_unit_dec_place);
		Rslt_wait_qty_p_PPanel.setRelateBeans(columnRslt_alloc_unit_cd, columnRslt_alloc_unit_dec_place);
		Rslt_alloc_avl_qty_p_PPanel.setRelateBeans(columnRslt_alloc_unit_cd, columnRslt_alloc_unit_dec_place);

		// 標準単価
		Rslt_std_unit_cost_amt_p_PPanel.setRelateBeans(columnRslt_base_cur_cd, columnRslt_stk_amt_dec_place);
		// 在庫金額
		Rslt_stk_amt_p_PPanel.setRelateBeans(columnRslt_base_cur_cd, columnRslt_stk_amt_dec_place);

		//有効成分
		Rslt_act_cont_qty_p_PPanel.setRelateBeans(columnRslt_cont_fctr_flg, columnRslt_stk_qty, null,
												columnRslt_act_cont_fctr, columnRslt_cont_fctr_dec_place, columnRslt_cont_fctr_rnd_typ);
		Rslt_std_cont_qty_p_PPanel.setRelateBeans(columnRslt_cont_fctr_flg, columnRslt_stk_qty, columnRslt_std_cont_fctr,
				null, columnRslt_cont_fctr_dec_place, columnRslt_cont_fctr_rnd_typ);

		//品目分類
		Rslt_itm_grp_p_PPanel.setRelateBeans(Cnd_itm_grp_p_PPanel);

		//版
		Cnd_ver_no_p_PPanel.setRelateBeans(Cnd_itm_cd, Cnd_itm_sub1, Cnd_itm_sub2, Cnd_itm_sub3, Cnd_site_cd, null);
	}

	/**
	 * 集計タブの全チェックオン／オフ処理
	 * @param flg
	 */
	protected void setDispTabSelectAll(boolean flg) {

		setValueEx(Cnd_wg_flg, flg);
		setValueEx(Cnd_lg_grp_flg, flg);
		setValueEx(Cnd_alloc_grp_flg, flg);
		setValueEx(Cnd_sno1_flg, flg);
		setValueEx(Cnd_sno2_flg, flg);
		setValueEx(Cnd_sno3_flg, flg);
		setValueEx(Cnd_sno4_flg, flg);
		setValueEx(Cnd_gd_flg, flg);

		if (!Cnd_ope_GRS_ALLOC.isSelected()) {
			setValueEx(Cnd_dpt_flg, flg);
			setValueEx(Cnd_loc_flg, flg);
			setValueEx(Cnd_str_ln_flg, flg);
			setValueEx(Cnd_stk_arrv_bp_flg, flg);
			setValueEx(Cnd_site_flg, flg);
			setValueEx(Cnd_loc_grp_flg, flg);
			setValueEx(Cnd_lot_flg, flg);
			setValueEx(Cnd_sublot_flg, flg);
			setValueEx(Cnd_fix_no_typ_flg, flg);
			setValueEx(Cnd_fix_no_flg, flg);
			setValueEx(Cnd_bp_lot_flg, flg);
			setValueEx(Cnd_pack_unit_flg, flg);
		}
		else {
			setValueEx(Cnd_dpt_flg, false);
			setValueEx(Cnd_loc_flg, false);
			setValueEx(Cnd_str_ln_flg, false);
			setValueEx(Cnd_stk_arrv_bp_flg, false);
			setValueEx(Cnd_site_flg, false);
			setValueEx(Cnd_loc_grp_flg, false);
			setValueEx(Cnd_lot_flg, false);
			setValueEx(Cnd_sublot_flg, false);
			setValueEx(Cnd_fix_no_typ_flg, false);
			setValueEx(Cnd_fix_no_flg, false);
			setValueEx(Cnd_bp_lot_flg, false);
			setValueEx(Cnd_pack_unit_flg, false);
		}
	}

	@Override
	protected void valueInit() {
		super.valueInit();

		setValueEx(Cnd_positive_alloc_qty_flg, false);
		setValueEx(Cnd_negative_alloc_qty_flg, false);
		setValueEx(Cnd_except_alloc_wait_flg, false);
		setValueEx(Cnd_positive_stk_qty_flg, false);
		setValueEx(Cnd_negative_stk_qty_flg, false);

		setDispTabSelectAll(true);
	}

	@Override
	protected void setInvisibleBySysParam() {
		super.setInvisibleBySysParam();

		MCBeans[] bs = getInvisibleBeans();
		if (bs != null) {
			setComponentInvisibleAllStatus(bs);
		}
	}

	protected MCBeans[] getInvisibleBeans() {
		boolean mfgAprvEnable = isSame(getSysParm("MFG_APRV_ENABLE_FLG"), "1");

		if (!mfgAprvEnable) {
			return getMfgAprvInvisibleBeans();
		}
		return null;
	}

	protected MCBeans[] getMfgAprvInvisibleBeans() {
		return mcframe.commonCore.util.MCCollectionUtil.concat(
				new MCBeans[] {columnRslt_mrkt_judg_sts_typ, columnRslt_mrkt_judg_sts_typ_nm});
	}
	@SuppressWarnings("unchecked")
	@Override
	public MCList<MCRow> getCnd_stk_id_typ(MCRow row, MCEventInfo info) {
		MCList<MCRow> list = super.getCnd_stk_id_typ(row, info);
		MCList<MCRow> rsltL = MCList.create(MCRow.create());
		if (Cnd_ope_LOC_ALLOC.isSelected() || Cnd_ope_GRS_ALLOC.isSelected()) {
			for (MCRow r : list) {
				String stkIdTyp = r.getStringNE("stk_id_typ");
				if (MSC_STK_ID_TYP.isCOSTK(stkIdTyp)
						|| MSC_STK_ID_TYP.isCSTSTK(stkIdTyp)
						|| MSC_STK_ID_TYP.isRNT_RCV(stkIdTyp)
						|| MSC_STK_ID_TYP.isACCPT_DFCT(stkIdTyp)
						|| MSC_STK_ID_TYP.isNCV_RCV(stkIdTyp)
						|| MSC_STK_ID_TYP.isONR_PROV(stkIdTyp)
						) {
					rsltL.add(r);
				}
			}
			return rsltL;
		}
		else {
			return list;	
		}
	}

}