package mcframe.clientMSBE.MSBEP0050;

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
import mcframe.clientMAUB.MAUBP0440.*;
import mcframe.clientMAUB.MAUBP5030.*;
import mcframe.clientMAUB.MAUBP5040.*;
import mcframe.clientMAUB.MAUBP5050.*;
import mcframe.clientMAUB.MAUBP5120.*;
import mcframe.clientMAUB.MAUBP5170.*;
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
 * 画面"MSBEP_StkAnlySrch"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MSBEP_StkAnlySrch_MC extends MSBEP_StkAnlySrch_MC_A {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START

	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MSBEP_StkAnlySrch_MC() {
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
	public MSBEP_StkAnlySrch_MC(String name) {
		super(name);
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR_LIST START

		//FMCB CUSTOM_CONSTRUCTOR_LIST END
	}

	//画面処理メソッドはこれより下に定義してください。
	//FMCB CUSTOM_METHOD START

	/**
	 * [MS_MSBEL0050_Srch01]の定型処理のInnerClass
	 */
	protected class MS_MSBEL0050_Srch01Caller<P extends MSBEP_StkAnlySrch, B extends MS_MSBEL0050_Srch01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Searcher<P, B> {

		protected MS_MSBEL0050_Srch01Caller(P p, B b) {
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

	/**
	 * [MS_MSBEL0050_Srch02]の定型処理のInnerClass
	 */
	protected class MS_MSBEL0050_Srch02Caller<P extends MSBEP_StkAnlySrch, B extends MS_MSBEL0050_Srch02Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Searcher<P, B> {

		protected MS_MSBEL0050_Srch02Caller(P p, B b) {
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
		changeDispYm();
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
		changeDispSno1();
		changeDispSno2();
		changeDispSno3();
		changeDispSno4();
		changeDispQtyAmt();
	}
	
	protected void changeDispYm() {
		if (getCndR().ym_flg()) {
			columnRslt_ac_ym.setMode(getDefaultMode(columnRslt_ac_ym));
		}
		else {
			columnRslt_ac_ym.setMode(MCMode.INVISIBLE);
		}
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
			if (Cnd_ope_STK_TRN.isSelected()) {
				columnRslt_base_unit_cd.setMode(MCMode.READ_ONLY);
				columnRslt_base_unit_nm.setMode(MCMode.READ_ONLY);
			}
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

	protected void changeDispQtyAmt() {
		if (getCndR().wg_flg()) {
			columnRslt_ttl_gi_amt.setMode(getDefaultMode(columnRslt_ttl_gi_amt));
			columnRslt_avg_stk_amt.setMode(getDefaultMode(columnRslt_avg_stk_amt));
			columnRslt_avg_gi_amt.setMode(getDefaultMode(columnRslt_avg_gi_amt));
		}
		else {
			columnRslt_ttl_gi_amt.setMode(MCMode.INVISIBLE);
			columnRslt_avg_stk_amt.setMode(MCMode.INVISIBLE);
			columnRslt_avg_gi_amt.setMode(MCMode.INVISIBLE);
		}
	}

	/**
	 * 検索条件のチェックの共通処理
	 * @param msgList
	 */
	protected void checkForCallStackForSrch(MCMessageList msgList) {
		msgList.addAll(checkSmallLarge(Cnd_non_mov_mons_fr, Cnd_non_mov_mons_to));
		msgList.addAll(checkBeforeAfter(Cnd_non_mov_base_ym_fr, Cnd_non_mov_base_ym_to));
		msgList.addAll(checkBeforeAfter(Cnd_ym_fr, Cnd_ym_to));
	}


	/**
	 * Panel[Cnd]のボタン[select_all]の押下時の処理
	 */
	@Override
	public void doCnd_select_all(MCEventInfo info) {
		setDispTabSelectAll(true);
		if (Cnd_ope_STK_TRN.isSelected()) {
			setValueEx(Cnd_ym_flg, true);
		}
	}
	/**
	 * Panel[Cnd]のボタン[deselect_all]の押下時の処理
	 */
	@Override
	public void doCnd_deselect_all(MCEventInfo info) {
		setDispTabSelectAll(false);
		setValueEx(Cnd_ym_flg, false);
	}
	/**
	 * Panel[Ctrl]のボタン[ctrl_Ope_srch]の押下時の処理
	 */
	@Override
	public void doCtrl_ctrl_Ope_srch(MCEventInfo info) {
		if (Cnd_ope_NON_MOV.isSelected()) {
			callMS_MSBEL0050_Srch01();
		}
		else {
			callMS_MSBEL0050_Srch02();
		}
	}
	/**
	 * Panel[RPnl]のボタン[dwnld]の押下時の処理
	 */
	@Override
	public void doRPnl_dwnld(MCEventInfo info) {
		if (Cnd_ope_NON_MOV.isSelected()) {
			createMS_MSBEL0050_Srch01().execDL();
		}
		else if (Cnd_ope_STK_TRN.isSelected()) {
			createMS_MSBEL0050_Srch02().execDL();
		}
		
	}
	/**
	 * Panel[Btn]のボタン[open_MSBEP0090]の押下時の処理
	 */
	@Override
	public void doBtn_open_MSBEP0090(MCEventInfo info) {
		RsltR r = RsltTable.getSelectedMCRow();
		if (r == null) {
			dialog(msgNoSelectedRow());
			return;
		}
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MS", "MSBEP0090");
		aso.runValueInit();
		aso.putCnd(crtOpenMSBEP0090CndR(aso, r));
		aso.putSearchAction();
		aso.show();
	}
	
	protected mcframe.clientMSBE.MSBEP0090.CndR crtOpenMSBEP0090CndR(MAUCP_AppScreenOpener aso, RsltR r) {
		mcframe.clientMSBE.MSBEP0090.CndR to = mcframe.clientMSBE.MSBEP0090.CndR.create();

		to.schd_dt_fr(r.rcnt_gi_schd_dt());
		to.schd_dt_to(r.rcnt_gi_schd_dt());
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
		if (isNullOrNullVal(r.stk_arrv_bp_cd())) {
			to.stk_arrv_bp_cd(null);
		}
		else {
			to.stk_arrv_bp_cd(r.stk_arrv_bp_cd());
		}
		to.pack_unit_cd(r.pack_unit_cd());
		to.io_schd_typ(getCtlIoSchdTyp());

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

		if (Cnd_ope_NON_MOV.isSelected()) {
			to.ac_dt_fr(r.non_mov_base_ym().startOfMonth());
			to.ac_dt_to(r.non_mov_base_ym().startOfMonth().addMonth(1).addDay(-1));
		}
		else if (Cnd_ope_STK_TRN.isSelected()){
			if (getCndR().ym_flg()) {
				to.ac_dt_fr(r.ac_ym().startOfMonth());
				to.ac_dt_to(r.ac_ym().startOfMonth().addMonth(1).addDay(-1));
			}
			else {
				to.ac_dt_fr(getCndR().ym_fr().startOfMonth());
				to.ac_dt_to(getCndR().ym_to().startOfMonth().addMonth(1).addDay(-1));
			}
		}
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
		to.stk_arrv_bp_cd(r.stk_arrv_bp_cd());
		to.pack_unit_cd(r.pack_unit_cd());
		to.io_act_typ(getCtlIoActTyp());

		return to;
	}
	
	/**
	 * 対象の受払予定区分を取得
	 * @return
	 */
	protected String getCtlIoSchdTyp() {
		String[] arr = getSchdTypL().getString(SchdTypR.$io_schd_typ).toArray(new String[getSchdTypL().size()]);
		return MCStringUtil.arrayValueJoin(arr);
	}
	
	/**
	 * 対象の受払区分を取得
	 * @return
	 */
	protected String getCtlIoActTyp() {
		String[] arr = getActTypL().getString(ActTypR.$io_act_typ).toArray(new String[getActTypL().size()]);
		return MCStringUtil.arrayValueJoin(arr);
	}
	
	
	@Override
	public void doCnd_ope_NC(MCEventInfo info) {
		super.doCnd_ope_NC(info);
		clearContainers(getRsltL());
		setStatus();
		clearCnd();
		setSRCHStatus();
	}
	
	@Override
	public void doRslt_NC(MCEventInfo info) {
		super.doRslt_NC(info);
		setBtnMode();
	}
	
	protected void setStatus() {
		if (Cnd_ope_NON_MOV.isSelected()) {
			setNON_MOVStatus();
		}
		else if (Cnd_ope_STK_TRN.isSelected()) {
			setSTK_TRNStatus();
		}
	}
	
	protected void clearCnd() {
		if (Cnd_ope_NON_MOV.isSelected()) {
			setValueEx(Cnd_ym_fr, null);
			setValueEx(Cnd_ym_to, null);
			setValueEx(Cnd_non_mov_cmp_ym, getToday());
			setValueEx(Cnd_non_mov_calc_mons, MCNumber.valueOf("24"));
			
			setDispTabSelectAll(true);
			setValueEx(Cnd_ym_flg, false);
		}
		else if (Cnd_ope_STK_TRN.isSelected()) {
			setValueEx(Cnd_non_mov_mons_fr, null);
			setValueEx(Cnd_non_mov_mons_to, null);
			setValueEx(Cnd_non_mov_base_ym_fr, null);
			setValueEx(Cnd_non_mov_base_ym_to, null);
			setValueEx(Cnd_non_mov_cmp_ym, null);
			setValueEx(Cnd_non_mov_calc_mons, null);
			setValueEx(Cnd_ym_fr, getToday());
			setValueEx(Cnd_ym_to, getToday());
			
			setDispTabSelectAll(true);
			setValueEx(Cnd_ym_flg, true);
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
	protected void setupParts() {
		super.setupParts();

		//数量項目
		Rslt_pack_unit_qty_p_PPanel.setRelateBeans(columnRslt_pack_unit_cd, columnRslt_pack_unit_dec_place);
		Rslt_stk_qty_p_PPanel.setRelateBeans(columnRslt_base_unit_cd, columnRslt_base_unit_dec_place);

		// 標準単価
		Rslt_std_unit_cost_amt_p_PPanel.setRelateBeans(columnRslt_base_cur_cd, columnRslt_stk_amt_dec_place);
		// 在庫金額
		Rslt_stk_amt_p_PPanel.setRelateBeans(columnRslt_base_cur_cd, columnRslt_stk_amt_dec_place);
		
		//品目分類
		Rslt_itm_grp_p_PPanel.setRelateBeans(Cnd_itm_grp_p_PPanel);
	}
	
	/**
	 * 集計タブの全チェックオン／オフ処理
	 * @param flg
	 */
	protected void setDispTabSelectAll(boolean flg) {
		
		setValueEx(Cnd_dpt_flg, flg);
		setValueEx(Cnd_wg_flg, flg);
		setValueEx(Cnd_loc_flg, flg);
		setValueEx(Cnd_str_ln_flg, flg);
		setValueEx(Cnd_stk_arrv_bp_flg, flg);
		setValueEx(Cnd_site_flg, flg);
		setValueEx(Cnd_lg_grp_flg, flg);
		setValueEx(Cnd_alloc_grp_flg, flg);
		setValueEx(Cnd_loc_grp_flg, flg);
		setValueEx(Cnd_lot_flg, flg);
		setValueEx(Cnd_sublot_flg, flg);
		setValueEx(Cnd_sno1_flg, flg);
		setValueEx(Cnd_sno2_flg, flg);
		setValueEx(Cnd_sno3_flg, flg);
		setValueEx(Cnd_sno4_flg, flg);
		setValueEx(Cnd_pack_unit_flg, flg);
		setValueEx(Cnd_gd_flg, flg);
	}

	@Override
	protected void valueInit() {
		super.valueInit();
		
		setValueEx(Cnd_non_mov_cmp_ym, getToday());
		setValueEx(Cnd_non_mov_calc_mons, MCNumber.valueOf("24"));
		
		setDispTabSelectAll(true);
	}
	
	
	@Override
	public void setREFStatus() {
		super.setREFStatus();
		
		RsltTable.selectLeftmostColumn(0);
		setBtnMode();
		Ctrl_ctrl_PPanel.expand(false);
	}
	
	@Override
	public void setSRCHStatus() {
		super.setSRCHStatus();
		
		FoldTab.focusActiveFirstComponent();
		setBtnMode();
		Ctrl_ctrl_PPanel.expand(true);
	}
	
	protected void setBtnMode() {
		RsltR r = RsltTable.getSelectedMCRow();
		
		// 画面遷移ボタン
		if (isEnableBtn_open_MSBEP0090(r)) {
			Btn_open_MSBEP0090.setMode(MCMode.ENABLE);
		}
		else {
			setDefaultMode(Btn_open_MSBEP0090);
		}
		
		if (isEnableBtn_open_MSBEP0080(r)) {
			Btn_open_MSBEP0080.setMode(MCMode.ENABLE);
		}
		else {
			setDefaultMode(Btn_open_MSBEP0080);
		}
	}
	
	// ダブルクリック
	@Override
	public void doDCEvent(MCDCBeans compo, MCEventInfo info) {
		super.doDCEvent(compo, info);
		if (compo == RsltTable) {
			int index = info.getEventIndex();
			RsltR r = getRsltL().get(index);
			if (isEnableBtn_open_MSBEP0080(r)) {
				doBtn_open_MSBEP0080(info);
			}
		}
	}
	
	/**
	 * 受払予定一覧照会画面に遷移できるか
	 * @return
	 */
	protected boolean isEnableBtn_open_MSBEP0090(RsltR r) {
		if (r == null) {
			return false;
		}
		else if (isNull(r.rcnt_gi_schd_dt())) {
			return false;
		}
		else {
			return true;
		}
	}

	/**
	 * 受払実績一覧照会画面に遷移できるか
	 * @return
	 */
	protected boolean isEnableBtn_open_MSBEP0080(RsltR r) {
		if (r == null) {
			return false;
		}
		else if (Cnd_ope_NON_MOV.isSelected() && isNull(r.non_mov_base_ym())) {
			return false;
		}
		else {
			return true;
		}
	}

}