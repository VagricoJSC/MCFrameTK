package mcframe.clientMGBF.MGBFP0130;

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
import mcframe.clientMAUB.MAUBP5030.*;
import mcframe.clientMAUB.MAUBP5040.*;
import mcframe.clientMGUB.MGUBP0010.*;

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
import static mcframe.commonMBUD.MBUDC0120.MBUDC_ListLogicBase.*;
import static mcframe.clientMBUC.MBUCP0010.MBUCP_MCDataUtil.*;
import static mcframe.clientMGUC.MGUCP0020.MGUCP_AppSys.*;
import mcframe.commonMG.constant.*;
import static mcframe.commonMG.notice.MG_Msg.*;
import mcframe.clientMGUD.MGUDP0020.MGUDP_CellConfig;


//カスタマイズのimportはこの間に記述してください。
//FMCB CUSTOM_IMPORT START
import java.util.Arrays;
import java.util.Set;

import mcframe.clientMGUC.MGUCP0030.MGUCP_CCtrl;
import mcframe.clientMGUC.MGUCP0020.ExpnsR;
import static mcframe.clientMGUC.MGUCP0050.MGUCP_Color.*;
//FMCB CUSTOM_IMPORT END

/**
 * 画面"MGBFP_MfgCostDiffLst"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MGBFP_MfgCostDiffLst_MC extends MGBFP_MfgCostDiffLst_MC_A {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START

	protected MGUCP_CCtrl<? extends MCConstRow> _cc = new MGUCP_CCtrl<>();

	protected CndR _cndR;
	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MGBFP_MfgCostDiffLst_MC() {
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
	public MGBFP_MfgCostDiffLst_MC(String name) {
		super(name);
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR_LIST START

		//FMCB CUSTOM_CONSTRUCTOR_LIST END
	}

	//画面処理メソッドはこれより下に定義してください。
	//FMCB CUSTOM_METHOD START

	/**
	 * Panel[Btn]のボタン[open_MGBFP0080]の押下時の処理
	 */
	@Override
	public void doBtn_open_MGBFP0080(MCEventInfo info) {
		RsltR r = RsltTable.getSelectedMCRow();
		if (r == null) {
			dialog(msgNoSelectedRow());
			return;
		}
		doBtn_open_MGBFP0080(r);
	}
	protected void doBtn_open_MGBFP0080(RsltR r) {
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MG", "MGBFP0080");
		mcframe.clientMGBF.MGBFP0080.CndR to = mcframe.clientMGBF.MGBFP0080.CndR.create();
		to.calc_grp_cd(_cndR.calc_grp_cd());
		to.calc_no(_cndR.calc_no());
		to.wg_cd(r.wg_cd());
		to.ym(r.ym());
		to.itm_cd(r.itm_cd());
		to.itm_sub1(r.itm_sub1());
		to.itm_sub2(r.itm_sub2());
		to.itm_sub3(r.itm_sub3());
		to.itm_typ(r.itm_typ());
		to.itm_typ_d_cd(r.itm_typ_d_cd());
		to.itm_jnl_cd(r.itm_jnl_cd());
		to.lot_no(r.lot_no());
		to.sublot_no(r.sublot_no());
		to.sno1(r.sno1());
		to.sno2(r.sno2());
		to.sno3(r.sno3());
		to.sno4(r.sno4());
		to.itm_mfg_inst_no(r.itm_mfg_inst_no());
		to.mfg_act_no(r.mfg_act_no());
		to.asst_typ(r.asst_typ());
		to.mng_dpt_cd(r.mng_dpt_cd());
		to.mng_dpt_nm(r.mng_dpt_nm());
		to.site_cd(r.site_cd());
		to.loc_cd(r.loc_cd());
		to.str_ln_cd(r.str_ln_cd());
		to.bp_cd(r.bp_cd());
		to.cntry_cd(r.bp_cntry_cd());
		to.area_cd(r.bp_area_cd());
		to.po_no(r.po_no());
		to.slo_no(r.slo_no());
		to.iv_no(r.iv_no());
		to.itm_grp_cd1(r.itm_grp_cd1());
		to.itm_grp_cd2(r.itm_grp_cd2());
		to.itm_grp_cd3(r.itm_grp_cd3());
		to.itm_grp_cd4(r.itm_grp_cd4());
		to.itm_grp_cd5(r.itm_grp_cd5());
		to.itm_grp_cd6(r.itm_grp_cd6());
		to.itm_grp_cd7(r.itm_grp_cd7());
		to.itm_grp_cd8(r.itm_grp_cd8());
		to.itm_grp_cd9(r.itm_grp_cd9());
		to.itm_grp_cd10(r.itm_grp_cd10());
		to.bp_grp_cd1(r.bp_grp_cd1());
		to.bp_grp_cd2(r.bp_grp_cd2());
		to.bp_grp_cd3(r.bp_grp_cd3());
		to.bp_grp_cd4(r.bp_grp_cd4());
		to.bp_grp_cd5(r.bp_grp_cd5());
		to.bp_grp_cd6(r.bp_grp_cd6());
		to.bp_grp_cd7(r.bp_grp_cd7());
		to.bp_grp_cd8(r.bp_grp_cd8());
		to.bp_grp_cd9(r.bp_grp_cd9());
		to.bp_grp_cd10(r.bp_grp_cd10());
		if (_cndR.bp_flg() && isNull(r.bp_cd())) {
			to.no_bp_flg(true);
		}
		if (_cndR.po_no_flg() && isNull(r.po_no())) {
			to.no_po_no_flg(true);
		}
		if (_cndR.slo_no_flg() && isNull(r.slo_no())) {
			to.no_slo_no_flg(true);
		}
		if (_cndR.iv_no_flg() && isNull(r.iv_no())) {
			to.no_iv_no_flg(true);
		}
		aso.putCnd(to);
		aso.runValueInit();
		aso.putSearchAction();
		aso.show();
	}
	/**
	 * Panel[Btn]のボタン[open_MGBFP0270]の押下時の処理
	 */
	@Override
	public void doBtn_open_MGBFP0270(MCEventInfo info) {
		RsltR r = RsltTable.getSelectedMCRow();
		if (r == null) {
			dialog(msgNoSelectedRow());
			return;
		}
		doBtn_open_MGBFP0270(r);
	}
	protected void doBtn_open_MGBFP0270(RsltR r) {
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MG", "MGBFP0270");
		mcframe.clientMGBF.MGBFP0270.CndR to = mcframe.clientMGBF.MGBFP0270.CndR.create();
		to.calc_grp_cd(_cndR.calc_grp_cd());
		to.calc_no(_cndR.calc_no());
		to.wg_cd(r.wg_cd());
		to.ym(r.ym());
		to.par_itm_cd(r.itm_cd());
		to.par_itm_sub1(r.itm_sub1());
		to.par_itm_sub2(r.itm_sub2());
		to.par_itm_sub3(r.itm_sub3());
		to.par_itm_typ(r.itm_typ());
		to.par_itm_typ_d_cd(r.itm_typ_d_cd());
		to.par_itm_jnl_cd(r.itm_jnl_cd());
		to.par_lot_no(r.lot_no());
		to.par_sublot_no(r.sublot_no());
		to.par_sno1(r.sno1());
		to.par_sno2(r.sno2());
		to.par_sno3(r.sno3());
		to.par_sno4(r.sno4());
		to.itm_mfg_inst_no(r.itm_mfg_inst_no());
		to.mfg_act_no(r.mfg_act_no());
		to.par_asst_typ(r.asst_typ());
		to.mng_dpt_cd(r.mng_dpt_cd());
		to.mng_dpt_nm(r.mng_dpt_nm());
		to.site_cd(r.site_cd());
		to.loc_cd(r.loc_cd());
		to.str_ln_cd(r.str_ln_cd());
		to.bp_cd(r.bp_cd());
		to.cntry_cd(r.bp_cntry_cd());
		to.area_cd(r.bp_area_cd());
		to.po_no(r.po_no());
		to.slo_no(r.slo_no());
		to.iv_no(r.iv_no());
		to.par_itm_grp_cd1(r.itm_grp_cd1());
		to.par_itm_grp_cd2(r.itm_grp_cd2());
		to.par_itm_grp_cd3(r.itm_grp_cd3());
		to.par_itm_grp_cd4(r.itm_grp_cd4());
		to.par_itm_grp_cd5(r.itm_grp_cd5());
		to.par_itm_grp_cd6(r.itm_grp_cd6());
		to.par_itm_grp_cd7(r.itm_grp_cd7());
		to.par_itm_grp_cd8(r.itm_grp_cd8());
		to.par_itm_grp_cd9(r.itm_grp_cd9());
		to.par_itm_grp_cd10(r.itm_grp_cd10());
		to.bp_grp_cd1(r.bp_grp_cd1());
		to.bp_grp_cd2(r.bp_grp_cd2());
		to.bp_grp_cd3(r.bp_grp_cd3());
		to.bp_grp_cd4(r.bp_grp_cd4());
		to.bp_grp_cd5(r.bp_grp_cd5());
		to.bp_grp_cd6(r.bp_grp_cd6());
		to.bp_grp_cd7(r.bp_grp_cd7());
		to.bp_grp_cd8(r.bp_grp_cd8());
		to.bp_grp_cd9(r.bp_grp_cd9());
		to.bp_grp_cd10(r.bp_grp_cd10());
		if (_cndR.bp_flg() && isNull(r.bp_cd())) {
			to.no_bp_flg(true);
		}
		if (_cndR.po_no_flg() && isNull(r.po_no())) {
			to.no_po_no_flg(true);
		}
		if (_cndR.slo_no_flg() && isNull(r.slo_no())) {
			to.no_slo_no_flg(true);
		}
		if (_cndR.iv_no_flg() && isNull(r.iv_no())) {
			to.no_iv_no_flg(true);
		}
		aso.putCnd(to);
		aso.runValueInit();
		aso.putSearchAction();
		aso.show();
	}
	/**
	 * [MG_MGBFL0130_Srch01]の定型処理のInnerClass
	 */
	protected class MG_MGBFL0130_Srch01Caller<P extends MGBFP_MfgCostDiffLst, B extends MG_MGBFL0130_Srch01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Searcher<P, B> {

		protected MG_MGBFL0130_Srch01Caller(P p, B b) {
			super(p, b);
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

		@Override
		protected void show() {
			super.show();

			_cndR = getCndR().clone();
		}
	}


	/**
	 * Panel[Cnd]のボタン[select_all]の押下時の処理
	 */
	@Override
	public void doCnd_select_all(MCEventInfo info) {
		setBoolean(TtlPanel, true);
	}
	/**
	 * Panel[Cnd]のボタン[deselect_all]の押下時の処理
	 */
	@Override
	public void doCnd_deselect_all(MCEventInfo info) {
		setBoolean(TtlPanel, false);
	}
	/**
	 * Panel[Ctrl]のボタン[ctrl_Ope_srch]の押下時の処理
	 */
	@Override
	public void doCtrl_ctrl_Ope_srch(MCEventInfo info) {
		callMG_MGBFL0130_Srch01();
	}
	/**
	 * Panel[Btn]のボタン[open_MGBFP0140]の押下時の処理
	 */
	@Override
	public void doBtn_open_MGBFP0140(MCEventInfo info) {
		RsltR r = RsltTable.getSelectedMCRow();
		if (r == null) {
			dialog(msgNoSelectedRow());
			return;
		}
		doBtn_open_MGBFP0140(r);
	}
	protected void doBtn_open_MGBFP0140(RsltR r) {
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MG", "MGBFP0140");
		mcframe.clientMGBF.MGBFP0140.CndR to = mcframe.clientMGBF.MGBFP0140.CndR.create();
		to.calc_grp_cd(_cndR.calc_grp_cd());
		to.calc_no(_cndR.calc_no());
		to.wg_cd(r.wg_cd());
		to.ym(r.ym());
		to.itm_cd(r.itm_cd());
		to.itm_sub1(r.itm_sub1());
		to.itm_sub2(r.itm_sub2());
		to.itm_sub3(r.itm_sub3());
		to.itm_mfg_inst_no(r.itm_mfg_inst_no());
		to.mfg_act_no(r.mfg_act_no());
		to.lot_no(r.lot_no());
		to.sublot_no(r.sublot_no());
		to.sno1(r.sno1());
		to.sno2(r.sno2());
		to.sno3(r.sno3());
		to.sno4(r.sno4());
		to.site_cd(r.site_cd());
		to.loc_cd(r.loc_cd());
		to.str_ln_cd(r.str_ln_cd());
		to.po_no(r.po_no());
		to.slo_no(r.slo_no());
		to.iv_no(r.iv_no());
		if (_cndR.po_no_flg() && isNull(r.po_no())) {
			to.no_po_no_flg(true);
		}
		if (_cndR.slo_no_flg() && isNull(r.slo_no())) {
			to.no_slo_no_flg(true);
		}
		if (_cndR.iv_no_flg() && isNull(r.iv_no())) {
			to.no_iv_no_flg(true);
		}
		to.mfg_inpt_flg(_cndR.mfg_inpt_flg());
		to.except_inpt_flg(_cndR.except_inpt_flg());
		aso.putCnd(to);
		aso.runValueInit();
		aso.putSearchAction();
		aso.show();
	}
	/**
	 * Panel[Btn]のボタン[open_MGBFP0010]の押下時の処理
	 */
	@Override
	public void doBtn_open_MGBFP0010(MCEventInfo info) {
		RsltR r = RsltTable.getSelectedMCRow();
		if (r == null) {
			dialog(msgNoSelectedRow());
			return;
		}
		doBtn_open_MGBFP0010(r);
	}
	protected void doBtn_open_MGBFP0010(RsltR r) {
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MG", "MGBFP0010");
		mcframe.clientMGBF.MGBFP0010.CndR to = mcframe.clientMGBF.MGBFP0010.CndR.create();
		to.calc_grp_cd(_cndR.calc_grp_cd());
		to.calc_no(_cndR.calc_no());
		to.wg_cd(r.wg_cd());
		to.ym(r.ym());
		to.mng_dpt_cd(r.mng_dpt_cd());
		to.mng_dpt_nm(r.mng_dpt_nm());
		to.itm_typ(r.itm_typ());
		to.itm_typ_d_cd(r.itm_typ_d_cd());
		to.itm_jnl_cd(r.itm_jnl_cd());
		to.itm_cd(r.itm_cd());
		to.itm_sub1(r.itm_sub1());
		to.itm_sub2(r.itm_sub2());
		to.itm_sub3(r.itm_sub3());
		to.itm_mfg_inst_no(r.itm_mfg_inst_no());
		to.mfg_act_no(r.mfg_act_no());
		to.itm_grp_cd1(r.itm_grp_cd1());
		to.itm_grp_cd2(r.itm_grp_cd2());
		to.itm_grp_cd3(r.itm_grp_cd3());
		to.itm_grp_cd4(r.itm_grp_cd4());
		to.itm_grp_cd5(r.itm_grp_cd5());
		to.itm_grp_cd6(r.itm_grp_cd6());
		to.itm_grp_cd7(r.itm_grp_cd7());
		to.itm_grp_cd8(r.itm_grp_cd8());
		to.itm_grp_cd9(r.itm_grp_cd9());
		to.itm_grp_cd10(r.itm_grp_cd10());
		to.lot_no(r.lot_no());
		to.sublot_no(r.sublot_no());
		to.sno1(r.sno1());
		to.sno2(r.sno2());
		to.sno3(r.sno3());
		to.sno4(r.sno4());
		to.loc_cd(r.loc_cd());
		to.str_ln_cd(r.str_ln_cd());
		to.bp_cd(r.bp_cd());
		if (_cndR.bp_flg() && isNull(r.bp_cd())) {
			to.no_bp_flg(true);
		}
		to.bp_grp_cd1(r.bp_grp_cd1());
		to.bp_grp_cd2(r.bp_grp_cd2());
		to.bp_grp_cd3(r.bp_grp_cd3());
		to.bp_grp_cd4(r.bp_grp_cd4());
		to.bp_grp_cd5(r.bp_grp_cd5());
		to.bp_grp_cd6(r.bp_grp_cd6());
		to.bp_grp_cd7(r.bp_grp_cd7());
		to.bp_grp_cd8(r.bp_grp_cd8());
		to.bp_grp_cd9(r.bp_grp_cd9());
		to.bp_grp_cd10(r.bp_grp_cd10());
		to.cntry_cd(r.bp_cntry_cd());
		to.area_cd(r.bp_area_cd());
		to.po_no(r.po_no());
		to.slo_no(r.slo_no());
		to.iv_no(r.iv_no());
		if (_cndR.po_no_flg() && isNull(r.po_no())) {
			to.no_po_no_flg(true);
		}
		if (_cndR.slo_no_flg() && isNull(r.slo_no())) {
			to.no_slo_no_flg(true);
		}
		if (_cndR.iv_no_flg() && isNull(r.iv_no())) {
			to.no_iv_no_flg(true);
		}
		to.asst_typ(r.asst_typ());
		aso.putCnd(to);
		aso.runValueInit();
		aso.putSearchAction();
		aso.show();
	}
	/**
	 * Panel[Btn]のボタン[open_MGBFP0070]の押下時の処理
	 */
	@Override
	public void doBtn_open_MGBFP0070(MCEventInfo info) {
		RsltR r = RsltTable.getSelectedMCRow();
		if (r == null) {
			dialog(msgNoSelectedRow());
			return;
		}
		doBtn_open_MGBFP0070(r);
	}
	protected void doBtn_open_MGBFP0070(RsltR r) {
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MG", "MGBFP0070");
		mcframe.clientMGBF.MGBFP0070.CndR to = mcframe.clientMGBF.MGBFP0070.CndR.create();
		to.calc_grp_cd(_cndR.calc_grp_cd());
		to.calc_no(_cndR.calc_no());
		to.wg_cd(r.wg_cd());
		to.ym(r.ym());
		to.mng_dpt_cd(r.mng_dpt_cd());
		to.mng_dpt_nm(r.mng_dpt_nm());
		to.itm_cd(r.itm_cd());
		to.itm_sub1(r.itm_sub1());
		to.itm_sub2(r.itm_sub2());
		to.itm_sub3(r.itm_sub3());
		to.itm_mfg_inst_no(r.itm_mfg_inst_no());
		to.mfg_act_no(r.mfg_act_no());
		to.itm_typ(r.itm_typ());
		to.itm_typ_d_cd(r.itm_typ_d_cd());
		to.itm_jnl_cd(r.itm_jnl_cd());
		to.itm_grp_cd1(r.itm_grp_cd1());
		to.itm_grp_cd2(r.itm_grp_cd2());
		to.itm_grp_cd3(r.itm_grp_cd3());
		to.itm_grp_cd4(r.itm_grp_cd4());
		to.itm_grp_cd5(r.itm_grp_cd5());
		to.itm_grp_cd6(r.itm_grp_cd6());
		to.itm_grp_cd7(r.itm_grp_cd7());
		to.itm_grp_cd8(r.itm_grp_cd8());
		to.itm_grp_cd9(r.itm_grp_cd9());
		to.itm_grp_cd10(r.itm_grp_cd10());
		to.lot_no(r.lot_no());
		to.sublot_no(r.sublot_no());
		to.sno1(r.sno1());
		to.sno2(r.sno2());
		to.sno3(r.sno3());
		to.sno4(r.sno4());
		to.site_cd(r.site_cd());
		to.loc_cd(r.loc_cd());
		to.str_ln_cd(r.str_ln_cd());
		to.bp_cd(r.bp_cd());
		if (_cndR.bp_flg() && isNull(r.bp_cd())) {
			to.no_bp_flg(true);
		}
		to.bp_grp_cd1(r.bp_grp_cd1());
		to.bp_grp_cd2(r.bp_grp_cd2());
		to.bp_grp_cd3(r.bp_grp_cd3());
		to.bp_grp_cd4(r.bp_grp_cd4());
		to.bp_grp_cd5(r.bp_grp_cd5());
		to.bp_grp_cd6(r.bp_grp_cd6());
		to.bp_grp_cd7(r.bp_grp_cd7());
		to.bp_grp_cd8(r.bp_grp_cd8());
		to.bp_grp_cd9(r.bp_grp_cd9());
		to.bp_grp_cd10(r.bp_grp_cd10());
		to.cntry_cd(r.bp_cntry_cd());
		to.area_cd(r.bp_area_cd());
		to.po_no(r.po_no());
		to.slo_no(r.slo_no());
		to.iv_no(r.iv_no());
		if (_cndR.po_no_flg() && isNull(r.po_no())) {
			to.no_po_no_flg(true);
		}
		if (_cndR.slo_no_flg() && isNull(r.slo_no())) {
			to.no_slo_no_flg(true);
		}
		if (_cndR.iv_no_flg() && isNull(r.iv_no())) {
			to.no_iv_no_flg(true);
		}
		to.asst_typ(r.asst_typ());
		aso.putCnd(to);
		aso.runValueInit();
		aso.putSearchAction();
		aso.show();
	}
	/**
	 * Panel[Btn]のボタン[open_MGBFP0130]の押下時の処理
	 */
	@Override
	public void doBtn_open_MGBFP0130(MCEventInfo info) {
		RsltR r = RsltTable.getSelectedMCRow();
		if (r == null) {
			dialog(msgNoSelectedRow());
			return;
		}
		doBtn_open_MGBFP0130(r);
	}
	protected void doBtn_open_MGBFP0130(RsltR r) {
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MG", "MGBFP0130");
		mcframe.clientMGBF.MGBFP0130.CndR to = mcframe.clientMGBF.MGBFP0130.CndR.create();
		to.calc_grp_cd(_cndR.calc_grp_cd());
		to.calc_no(_cndR.calc_no());
		to.wg_cd(r.wg_cd());
		to.ym(r.ym());
		to.mng_dpt_cd(r.mng_dpt_cd());
		to.mng_dpt_nm(r.mng_dpt_nm());
		to.itm_cd(r.itm_cd());
		to.itm_sub1(r.itm_sub1());
		to.itm_sub2(r.itm_sub2());
		to.itm_sub3(r.itm_sub3());
		to.itm_mfg_inst_no(r.itm_mfg_inst_no());
		to.mfg_act_no(r.mfg_act_no());
		to.itm_typ(r.itm_typ());
		to.itm_typ_d_cd(r.itm_typ_d_cd());
		to.itm_jnl_cd(r.itm_jnl_cd());
		to.itm_grp_cd1(r.itm_grp_cd1());
		to.itm_grp_cd2(r.itm_grp_cd2());
		to.itm_grp_cd3(r.itm_grp_cd3());
		to.itm_grp_cd4(r.itm_grp_cd4());
		to.itm_grp_cd5(r.itm_grp_cd5());
		to.itm_grp_cd6(r.itm_grp_cd6());
		to.itm_grp_cd7(r.itm_grp_cd7());
		to.itm_grp_cd8(r.itm_grp_cd8());
		to.itm_grp_cd9(r.itm_grp_cd9());
		to.itm_grp_cd10(r.itm_grp_cd10());
		to.lot_no(r.lot_no());
		to.sublot_no(r.sublot_no());
		to.sno1(r.sno1());
		to.sno2(r.sno2());
		to.sno3(r.sno3());
		to.sno4(r.sno4());
		to.site_cd(r.site_cd());
		to.loc_cd(r.loc_cd());
		to.str_ln_cd(r.str_ln_cd());
		to.bp_cd(r.bp_cd());
		if (_cndR.bp_flg() && isNull(r.bp_cd())) {
			to.no_bp_flg(true);
		}
		to.bp_grp_cd1(r.bp_grp_cd1());
		to.bp_grp_cd2(r.bp_grp_cd2());
		to.bp_grp_cd3(r.bp_grp_cd3());
		to.bp_grp_cd4(r.bp_grp_cd4());
		to.bp_grp_cd5(r.bp_grp_cd5());
		to.bp_grp_cd6(r.bp_grp_cd6());
		to.bp_grp_cd7(r.bp_grp_cd7());
		to.bp_grp_cd8(r.bp_grp_cd8());
		to.bp_grp_cd9(r.bp_grp_cd9());
		to.bp_grp_cd10(r.bp_grp_cd10());
		to.bp_cntry_cd(r.bp_cntry_cd());
		to.bp_area_cd(r.bp_area_cd());
		to.po_no(r.po_no());
		to.slo_no(r.slo_no());
		to.iv_no(r.iv_no());
		if (_cndR.po_no_flg() && isNull(r.po_no())) {
			to.no_po_no_flg(true);
		}
		if (_cndR.slo_no_flg() && isNull(r.slo_no())) {
			to.no_slo_no_flg(true);
		}
		if (_cndR.iv_no_flg() && isNull(r.iv_no())) {
			to.no_iv_no_flg(true);
		}
		to.asst_typ(r.asst_typ());
		aso.putCnd(to);
		aso.runValueInit();
		aso.putSearchAction();
		aso.showChild(this);
	}

	// -----------------------------------------------
	// init-parts
	@Override
	protected void setupParts() {
		super.setupParts();

		Cnd_calc_no_p_PPanel.setRelateBeans(Cnd_calc_grp_cd);

		Rslt_qty_p_PPanel.setRelateBeans(columnRslt_unit_cd, columnRslt_dec_place);
		Rslt_inst_p_PPanel.setRelateBeans(columnRslt_unit_cd, columnRslt_dec_place);
	}

	// -----------------------------------------------
	// init-screen
	@Override
	public void mcInitStatus() {
		super.mcInitStatus();
		initCCInfo();
	}

	/**
	 * カラム制御クラスの初期化
	 */
	protected void initCCInfo() {
		_cc.init(this, RsltTable);
		_cc.setExpns(getCustomExpnsL(), LPnl_disp_expns, LPnl_disp_expns_grp);
	}

	/**
	 * 表示する費目項目を返します。<p>
	 * @return 表示する費目項目
	 */
	protected MCList<ExpnsR> getCustomExpnsL() {
		MCList<ExpnsR> l = getExpns();
		MCList<ExpnsR> retL = MCList.create(ExpnsR.class);
		for (ExpnsR r : l) {
			if (MAC_EXPNS_TYP.isPROD(r.expns_typ())) {
				retL.add(r);
			}
		}
		return retL;
	}

	@Override
	protected void tableInit() {
		super.tableInit();
		setColorInfo();
	}

	protected Color _expnsSrchRsltColor = getExpnsSrchRsltColor(this);
	protected Color _expnsGSubTtlColor = getExpnsGSubTtlColor(this);

	protected void setColorInfo() {
		Color varFxdColor = getVarFxdColor(this);
		Color allTtlColor = getAllTtlColor(this);

		MGUDP_CellConfig cc = (MGUDP_CellConfig) RsltTable.getCellConfig();
		cc.putColumnBG(RsltTable.getColumnConfigs(), _expnsSrchRsltColor);
		for (MCColumnConfig c : _cc.getExpnsGColumnConfigs(RsltTable)) {
			cc.putColumnBG(c, _expnsGSubTtlColor);
		}
		cc.putColumnBG(columnRslt_sub_ttl, varFxdColor);
		cc.putColumnBG(columnRslt_fxd_cost, varFxdColor);
		cc.putColumnBG(columnRslt_var_cost, varFxdColor);
		cc.putColumnBG(columnRslt_ttl, allTtlColor);
	}

	@Override
	protected Set<MCColumnConfig> getCachedVisibleColumnConfigs(MCTable tbl, String type) {
		if (tbl == RsltTable) {
			return null;
		}
		return super.getCachedVisibleColumnConfigs(tbl, type);
	}

	@Override
	protected void customVisibleColumnConfigs(MCTable table, String type,
			Set<MCColumnConfig> confSet) {
		if (table == RsltTable) {
			confSet.removeAll(Arrays.asList(RsltTable.getAllColumnConfigs()));
			confSet.addAll(Arrays.asList(RsltTable.getViewColumnConfigs()));
		}
		super.customVisibleColumnConfigs(table, type, confSet);
	}

	@Override
	protected void valueInit() {
		super.valueInit();
		valueInitSub();
	}
	protected void valueInitSub() {
		setValueEx(LPnl_disp_expns, true);
		setValueEx(LPnl_disp_expns_grp, true);

		setValueEx(Cnd_wg_flg, true);
		setValueEx(Cnd_mng_dpt_flg, true);
		setValueEx(Cnd_itm_flg, true);
		setValueEx(Cnd_itm_typ_flg, true);
		setValueEx(Cnd_itm_typ_d_flg, true);
		setValueEx(Cnd_itm_jnl_flg, true);
		setValueEx(Cnd_itm_mfg_inst_no_flg, true);
		setValueEx(Cnd_mfg_act_no_flg, true);

		displayColumn();
	}

	// -----------------------------------------------
	// status
	protected void setSrchStatus() {
		setSRCHStatus();
		Ctrl_ctrl_PPanel.expand(true);
	}

	protected void setRefStatus() {
		setREFStatus();
		Ctrl_ctrl_PPanel.expand(false);
	}

	@Override
	public void setSRCHStatus() {
		super.setSRCHStatus();
		displayColumn();
		setBtnMode();
		setFocus();
	}

	@Override
	public void setREFStatus() {
		super.setREFStatus();
		displayColumn();
		setBtnMode();
		setFocus();
	}

	protected void displayColumn() {
		changeColumnMode(RsltTable, getCndR(), RsltR.$$SHOW);
		_cc.displayColumn();
		displayInptColumn();
	}

	protected void displayInptColumn() {
		if (_cndR != null && _cndR.mfg_inpt_flg()) {
			setDefaultMode(columnRslt_mfg_inpt_cost);
			setDefaultMode(columnRslt_sub_ttl);
		}
		else {
			columnRslt_mfg_inpt_cost.setMode(MCMode.INVISIBLE);
			columnRslt_sub_ttl.setMode(MCMode.INVISIBLE);
		}
	}

	protected void setBtnMode() {
		RsltR r = RsltTable.getSelectedMCRow();

		// 画面遷移ボタン
		setBtnModeByFlg(Btn_open_MGBFP0140, isEnableBtn_open_MGBFP0140(r));
		setBtnModeByFlg(Btn_open_MGBFP0010, isEnableBtn_open_MGBFP0010(r));
		setBtnModeByFlg(Btn_open_MGBFP0070, isEnableBtn_open_MGBFP0070(r));
		setBtnModeByFlg(Btn_open_MGBFP0130, isEnableBtn_open_MGBFP0130(r));
	}

	/**
	 * 製造原価差異内訳照会画面に遷移できるか
	 * @return
	 */
	protected boolean isEnableBtn_open_MGBFP0140(RsltR r) {
		if (r == null || !_cndR.itm_flg()) {
			return false;
		}
		return true;
	}

	/**
	 * 製造原価一覧照会画面に遷移できるか
	 * @return
	 */
	protected boolean isEnableBtn_open_MGBFP0010(RsltR r) {
		if (r == null) {
			return false;
		}
		return true;
	}

	/**
	 * 工程原価一覧照会画面に遷移できるか
	 * @return
	 */
	protected boolean isEnableBtn_open_MGBFP0070(RsltR r) {
		if (r == null) {
			return false;
		}
		return true;
	}

	/**
	 * 製造原価差異一覧照会画面に遷移できるか
	 * @return
	 */
	protected boolean isEnableBtn_open_MGBFP0130(RsltR r) {
		if (r == null) {
			return false;
		}
		return true;
	}

	protected void setFocus() {
		if (getRsltL().isEmpty()) {
			FoldTab.focusActiveFirstComponent();
		}
		else {
			RsltTable.selectLeftmostColumn(0);
		}
	}

	// -----------------------------------------------
	// Event
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
			int index = info.getEventIndex();
			RsltR r = getRsltL().get(index);
			if (isEnableBtn_open_MGBFP0140(r)) {
				doBtn_open_MGBFP0140(r);
			}
		}
	}

	@Override
	public void doCnd_no_po_no_flg_NC(MCEventInfo info) {
		super.doCnd_no_po_no_flg_NC(info);
		if (getCndR().no_po_no_flg()) {
			setValueEx(Cnd_po_no, null);
		}
	}
	@Override
	public void doCnd_po_no_LC(MCEventInfo info) {
		super.doCnd_po_no_LC(info);
		if (!isNull(getCndR().po_no())) {
			setValueEx(Cnd_no_po_no_flg, false);
		}
	}

	@Override
	public void doCnd_no_slo_no_flg_NC(MCEventInfo info) {
		super.doCnd_no_slo_no_flg_NC(info);
		if (getCndR().no_slo_no_flg()) {
			setValueEx(Cnd_slo_no, null);
		}
	}
	@Override
	public void doCnd_slo_no_LC(MCEventInfo info) {
		super.doCnd_slo_no_LC(info);
		if (!isNull(getCndR().slo_no())) {
			setValueEx(Cnd_no_slo_no_flg, false);
		}
	}

	@Override
	public void doCnd_no_iv_no_flg_NC(MCEventInfo info) {
		super.doCnd_no_iv_no_flg_NC(info);
		if (getCndR().no_iv_no_flg()) {
			setValueEx(Cnd_iv_no, null);
		}
	}
	@Override
	public void doCnd_iv_no_LC(MCEventInfo info) {
		super.doCnd_iv_no_LC(info);
		if (!isNull(getCndR().iv_no())) {
			setValueEx(Cnd_no_iv_no_flg, false);
		}
	}

	@Override
	public void doCnd_no_bp_flg_NC(MCEventInfo info) {
		super.doCnd_no_bp_flg_NC(info);
		if (getCndR().no_bp_flg()) {
			setValueEx(Cnd_bp_cd, null);
			setValueEx(Cnd_bp_nm, null);
		}
	}
	@Override
	public void doCnd_bp_cd_LC(MCEventInfo info) {
		super.doCnd_bp_cd_LC(info);
		if (!isNull(getCndR().bp_cd())) {
			setValueEx(Cnd_no_bp_flg, false);
		}
	}
	@Override
	public void doCnd_bp_nm_LC(MCEventInfo info) {
		super.doCnd_bp_nm_LC(info);
		if (!isNull(getCndR().bp_nm())) {
			setValueEx(Cnd_no_bp_flg, false);
		}
	}

	@Override
	public void doCnd_itm_flg_NC(MCEventInfo info) {
		super.doCnd_itm_flg_NC(info);

		if (!getCndR().itm_flg()) {
			setValueEx(Cnd_itm_mfg_inst_no_flg, false);
			setValueEx(Cnd_mfg_act_no_flg, false);
			setValueEx(Cnd_inst_qty_flg, false);
		}
	}

	@Override
	public void doCnd_itm_mfg_inst_no_flg_NC(MCEventInfo info) {
		super.doCnd_itm_mfg_inst_no_flg_NC(info);

		if (getCndR().itm_mfg_inst_no_flg()) {
			setValueEx(Cnd_itm_flg, true);
		}
	}

	@Override
	public void doCnd_mfg_act_no_flg_NC(MCEventInfo info) {
		super.doCnd_mfg_act_no_flg_NC(info);

		if (getCndR().mfg_act_no_flg()) {
			setValueEx(Cnd_itm_flg, true);
		}
	}

	@Override
	public void doCnd_inst_qty_flg_NC(MCEventInfo info) {
		super.doCnd_inst_qty_flg_NC(info);

		if (getCndR().inst_qty_flg()) {
			setValueEx(Cnd_itm_flg, true);
		}
	}

	@Override
	public void doCnd_itm_typ_flg_NC(MCEventInfo info) {
		super.doCnd_itm_typ_flg_NC(info);

		if (!getCndR().itm_typ_flg()) {
			setValueEx(Cnd_itm_typ_d_flg, false);
		}
	}

	@Override
	public void doCnd_itm_typ_d_flg_NC(MCEventInfo info) {
		super.doCnd_itm_typ_d_flg_NC(info);

		if (getCndR().itm_typ_d_flg()) {
			setValueEx(Cnd_itm_typ_flg, true);
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

	// -----------------------------------------------
	// CellConfig
	protected Color _topColor = getTopColor(this);
	protected Color _moneyDiffColor = getMoneyDiffColor(this);

	@Override
	protected void setCellConfig() {
		super.setCellConfig();
		RsltTable.setCellConfig(createRsltCellConfig());
	}

	protected RsltCellConfig createRsltCellConfig() {
		return new RsltCellConfig();
	}

	protected class RsltCellConfig extends MGUDP_CellConfig {

		static final String TOP_KEY = "act_cost";
		static final String DIFF_TTL_KEY = "diff_ttl";

		@Override
		public Boolean getPriorReverseFG(int index, MCColumnConfig column, MCTable<?> table, MCMode mode) {
			RsltR r = (RsltR) table.getBaseTable().getRow(index);
			if (!isSame(r.key(), TOP_KEY) && !getLPnlR().disp_key()) {
				if (getInvisibleColumnConfigs().contains(column)) {
					return true;
				}
			}
			return null;
		}

		protected ArrayList<MCColumnConfig> _invisibleColumnConfigs = null;

		protected ArrayList<MCColumnConfig> getInvisibleColumnConfigs() {
			if (_invisibleColumnConfigs == null) {
				_invisibleColumnConfigs = getGroupColumnConfigs(RsltTable, RsltR.$$CLEAR);
			}
			return _invisibleColumnConfigs;
		}

		@Override
		public Color getPriorBG(int index, MCColumnConfig column, MCTable table, MCMode mode) {
			RsltR r = (RsltR) table.getBaseTable().getRow(index);
			if (isSame(r.key(), TOP_KEY)) {
				return _topColor;
			}
			else if (isSame(r.key(), DIFF_TTL_KEY)) {
				if (!getInvisibleColumnConfigs().contains(column)) {
					return _moneyDiffColor;
				}
			}
			return super.getPriorBG(index, column, table, mode);
		}
	}

}