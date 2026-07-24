package mcframe.clientMGBF.MGBFP0020;

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
import mcframe.clientMGUC.MGUCP0030.MGUCP_CCtrl;
import mcframe.clientMGUC.MGUCP0020.ExpnsR;
import static mcframe.clientMGUC.MGUCP0050.MGUCP_Color.*;
//FMCB CUSTOM_IMPORT END

/**
 * 画面"MGBFP_CmpCostSrch"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MGBFP_CmpCostSrch_MC extends MGBFP_CmpCostSrch_MC_A {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START

	protected MGUCP_CCtrl<RsltR> _cc = new MGUCP_CCtrl<>();

	// 合計行
	protected RsltR _sumRow = null;

	// 合計行の色
	protected Color _ttlColor = getVTtlColor(this);

	// 検索時の検索条件
	protected CndR _cndR = CndR.create();
	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MGBFP_CmpCostSrch_MC() {
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
	public MGBFP_CmpCostSrch_MC(String name) {
		super(name);
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR_LIST START

		//FMCB CUSTOM_CONSTRUCTOR_LIST END
	}

	//画面処理メソッドはこれより下に定義してください。
	//FMCB CUSTOM_METHOD START

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
		to.itm_cd(r.itm_cd());
		to.itm_sub1(r.itm_sub1());
		to.itm_sub2(r.itm_sub2());
		to.itm_sub3(r.itm_sub3());
		to.itm_nm(r.itm_nm());
		to.itm_jnl_cd(r.itm_jnl_cd());
		to.itm_typ(r.itm_typ());
		to.itm_typ_d_cd(r.itm_typ_d_cd());
		to.lot_no(r.lot_no());
		to.sublot_no(r.sublot_no());
		to.sno1(r.sno1());
		to.sno2(r.sno2());
		to.sno3(r.sno3());
		to.sno4(r.sno4());
		to.itm_mfg_inst_no(r.itm_mfg_inst_no());
		to.mfg_act_no(r.mfg_act_no());
		to.asst_typ(r.asst_typ());
		to.loc_cd(r.loc_cd());
		to.str_ln_cd(r.str_ln_cd());
		to.bp_cd(r.bp_cd());
		to.cntry_cd(r.cntry_cd());
		to.area_cd(r.area_cd());
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

		if (isNull(r.bp_cd()) && _cndR.bp_flg()) {
			to.no_bp_flg(true);
		}
		if (isNull(r.po_no()) && _cndR.po_no_flg()) {
			to.no_po_no_flg(true);
		}
		if (isNull(r.slo_no()) && _cndR.slo_no_flg()) {
			to.no_slo_no_flg(true);
		}
		if (isNull(r.iv_no()) && _cndR.iv_no_flg()) {
			to.no_iv_no_flg(true);
		}

		aso.putCnd(to);
		aso.runValueInit();
		aso.putSearchAction();
		aso.show();
	}

	/**
	 * Panel[Btn]のボタン[open_MGBFP0030]の押下時の処理
	 */
	@Override
	public void doBtn_open_MGBFP0030(MCEventInfo info) {
		RsltR r = RsltTable.getSelectedMCRow();
		if (r == null) {
			dialog(msgNoSelectedRow());
			return;
		}
		doBtn_open_MGBFP0030(r);
	}

	protected void doBtn_open_MGBFP0030(RsltR r) {
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MG", "MGBFP0030");
		mcframe.clientMGBF.MGBFP0030.CndR to = mcframe.clientMGBF.MGBFP0030.CndR.create();

		to.calc_grp_cd(_cndR.calc_grp_cd());
		to.calc_no(_cndR.calc_no());
		to.wg_cd(r.wg_cd());
		to.ym(r.ym());
		to.itm_cd(r.itm_cd());
		to.itm_sub1(r.itm_sub1());
		to.itm_sub2(r.itm_sub2());
		to.itm_sub3(r.itm_sub3());
		to.itm_nm(r.itm_nm());
		to.itm_mfg_inst_no(r.itm_mfg_inst_no());
		to.mfg_act_no(r.mfg_act_no());

		if (!isNull(r.itm_mfg_inst_no())) {
			to.mng_dpt_cd(r.mng_dpt_cd());
			to.mng_dpt_nm(r.mng_dpt_nm());
		}
		else {
			to.itm_jnl_cd(r.itm_jnl_cd());
			to.itm_typ(r.itm_typ());
			to.itm_typ_d_cd(r.itm_typ_d_cd());
			to.lot_no(r.lot_no());
			to.sublot_no(r.sublot_no());
			to.sno1(r.sno1());
			to.sno2(r.sno2());
			to.sno3(r.sno3());
			to.sno4(r.sno4());
			to.asst_typ(r.asst_typ());
			to.bp_cd(r.bp_cd());
			to.cntry_cd(r.cntry_cd());
			to.area_cd(r.area_cd());
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

			if (isNull(r.po_no()) && _cndR.po_no_flg()) {
				to.no_po_no_flg(true);
			}
			if (isNull(r.slo_no()) && _cndR.slo_no_flg()) {
				to.no_slo_no_flg(true);
			}
			if (isNull(r.iv_no()) && _cndR.iv_no_flg()) {
				to.no_iv_no_flg(true);
			}
		}

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
		to.itm_nm(r.itm_nm());
		to.itm_mfg_inst_no(r.itm_mfg_inst_no());
		to.mfg_act_no(r.mfg_act_no());

		if (isNull(r.itm_mfg_inst_no())) {
			to.itm_typ(r.itm_typ());
			to.itm_jnl_cd(r.itm_jnl_cd());
			to.lot_no(r.lot_no());
			to.sublot_no(r.sublot_no());
			to.sno1(r.sno1());
			to.sno2(r.sno2());
			to.sno3(r.sno3());
			to.sno4(r.sno4());
			to.asst_typ(r.asst_typ());
			to.loc_cd(r.loc_cd());
			to.str_ln_cd(r.str_ln_cd());
			to.site_cd(r.site_cd());
			to.bp_cd(r.bp_cd());
			to.cntry_cd(r.cntry_cd());
			to.area_cd(r.area_cd());
			to.oper_cd(r.oper_cd());
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

			if (isNull(r.bp_cd()) && _cndR.bp_flg()) {
				to.no_bp_flg(true);
			}
			if (isNull(r.po_no()) && _cndR.po_no_flg()) {
				to.no_po_no_flg(true);
			}
			if (isNull(r.slo_no()) && _cndR.slo_no_flg()) {
				to.no_slo_no_flg(true);
			}
			if (isNull(r.iv_no()) && _cndR.iv_no_flg()) {
				to.no_iv_no_flg(true);
			}
		}

		aso.putCnd(to);
		aso.runValueInit();
		aso.putSearchAction();
		aso.show();
	}

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
		to.mng_dpt_cd(r.mng_dpt_cd());
		to.mng_dpt_nm(r.mng_dpt_nm());
		to.itm_cd(r.itm_cd());
		to.itm_sub1(r.itm_sub1());
		to.itm_sub2(r.itm_sub2());
		to.itm_sub3(r.itm_sub3());
		to.itm_nm(r.itm_nm());
		to.itm_mfg_inst_no(r.itm_mfg_inst_no());
		to.mfg_act_no(r.mfg_act_no());

		if (isNull(r.itm_mfg_inst_no())) {
			to.itm_typ(r.itm_typ());
			to.itm_jnl_cd(r.itm_jnl_cd());
			to.lot_no(r.lot_no());
			to.sublot_no(r.sublot_no());
			to.sno1(r.sno1());
			to.sno2(r.sno2());
			to.sno3(r.sno3());
			to.sno4(r.sno4());
			to.asst_typ(r.asst_typ());
			to.loc_cd(r.loc_cd());
			to.str_ln_cd(r.str_ln_cd());
			to.site_cd(r.site_cd());
			to.bp_cd(r.bp_cd());
			to.cntry_cd(r.cntry_cd());
			to.area_cd(r.area_cd());
			to.oper_cd(r.oper_cd());
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

			if (isNull(r.bp_cd()) && _cndR.bp_flg()) {
				to.no_bp_flg(true);
			}
			if (isNull(r.po_no()) && _cndR.po_no_flg()) {
				to.no_po_no_flg(true);
			}
			if (isNull(r.slo_no()) && _cndR.slo_no_flg()) {
				to.no_slo_no_flg(true);
			}
			if (isNull(r.iv_no()) && _cndR.iv_no_flg()) {
				to.no_iv_no_flg(true);
			}
		}

		aso.putCnd(to);
		aso.runValueInit();
		aso.putSearchAction();
		aso.show();
	}

	/**
	 * Panel[Btn]のボタン[open_MGBFP0090]の押下時の処理
	 */
	@Override
	public void doBtn_open_MGBFP0090(MCEventInfo info) {
		RsltR r = RsltTable.getSelectedMCRow();
		if (r == null) {
			dialog(msgNoSelectedRow());
			return;
		}
		doBtn_open_MGBFP0090(r);
	}

	protected void doBtn_open_MGBFP0090(RsltR r) {
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MG", "MGBFP0090");
		mcframe.clientMGBF.MGBFP0090.CndR to = mcframe.clientMGBF.MGBFP0090.CndR.create();

		to.calc_grp_cd(_cndR.calc_grp_cd());
		to.calc_no(_cndR.calc_no());
		to.wg_cd(r.wg_cd());
		to.ym(r.ym());
		to.par_itm_cd(r.itm_cd());
		to.par_itm_sub1(r.itm_sub1());
		to.par_itm_sub2(r.itm_sub2());
		to.par_itm_sub3(r.itm_sub3());
		to.par_itm_nm(r.itm_nm());
		to.mng_dpt_cd(r.mng_dpt_cd());
		to.mng_dpt_nm(r.mng_dpt_nm());
		to.itm_mfg_inst_no(r.itm_mfg_inst_no());
		to.mfg_act_no(r.mfg_act_no());

		if (isNull(r.itm_mfg_inst_no())) {
			to.loc_cd(r.loc_cd());
			to.str_ln_cd(r.str_ln_cd());
			to.site_cd(r.site_cd());
			to.bp_cd(r.bp_cd());
			to.cntry_cd(r.cntry_cd());
			to.area_cd(r.area_cd());
			to.oper_cd(r.oper_cd());
			to.po_no(r.po_no());
			to.slo_no(r.slo_no());
			to.iv_no(r.iv_no());
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

			if (isNull(r.bp_cd()) && _cndR.bp_flg()) {
				to.no_bp_flg(true);
			}
			if (isNull(r.po_no()) && _cndR.po_no_flg()) {
				to.no_po_no_flg(true);
			}
			if (isNull(r.slo_no()) && _cndR.slo_no_flg()) {
				to.no_slo_no_flg(true);
			}
			if (isNull(r.iv_no()) && _cndR.iv_no_flg()) {
				to.no_iv_no_flg(true);
			}
		}

		aso.putCnd(to);
		aso.runValueInit();
		aso.putSearchAction();
		aso.show();
	}

	/**
	 * Panel[Btn]のボタン[open_MGBFP0120]の押下時の処理
	 */
	@Override
	public void doBtn_open_MGBFP0120(MCEventInfo info) {
		RsltR r = RsltTable.getSelectedMCRow();
		if (r == null) {
			dialog(msgNoSelectedRow());
			return;
		}
		doBtn_open_MGBFP0120(r);
	}

	protected void doBtn_open_MGBFP0120(RsltR r) {
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MG", "MGBFP0120");
		mcframe.clientMGBF.MGBFP0120.CndR to = mcframe.clientMGBF.MGBFP0120.CndR.create();

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
		to.itm_nm(r.itm_nm());
		to.itm_mfg_inst_no(r.itm_mfg_inst_no());
		to.mfg_act_no(r.mfg_act_no());

		if (isNull(r.itm_mfg_inst_no())) {
			to.itm_typ(r.itm_typ());
			to.itm_jnl_cd(r.itm_jnl_cd());
			to.lot_no(r.lot_no());
			to.sublot_no(r.sublot_no());
			to.sno1(r.sno1());
			to.sno2(r.sno2());
			to.sno3(r.sno3());
			to.sno4(r.sno4());
			to.asst_typ(r.asst_typ());
			to.loc_cd(r.loc_cd());
			to.str_ln_cd(r.str_ln_cd());
			to.site_cd(r.site_cd());
			to.bp_cd(r.bp_cd());
			to.oper_cd(r.oper_cd());
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

			if (isNull(r.po_no()) && _cndR.po_no_flg()) {
				to.no_po_no_flg(true);
			}
			if (isNull(r.slo_no()) && _cndR.slo_no_flg()) {
				to.no_slo_no_flg(true);
			}
			if (isNull(r.iv_no()) && _cndR.iv_no_flg()) {
				to.no_iv_no_flg(true);
			}
		}

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
		to.itm_nm(r.itm_nm());
		to.itm_mfg_inst_no(r.itm_mfg_inst_no());
		to.mfg_act_no(r.mfg_act_no());

		if (isNull(r.itm_mfg_inst_no())) {
			to.itm_typ(r.itm_typ());
			to.itm_jnl_cd(r.itm_jnl_cd());
			to.lot_no(r.lot_no());
			to.sublot_no(r.sublot_no());
			to.sno1(r.sno1());
			to.sno2(r.sno2());
			to.sno3(r.sno3());
			to.sno4(r.sno4());
			to.asst_typ(r.asst_typ());
			to.loc_cd(r.loc_cd());
			to.str_ln_cd(r.str_ln_cd());
			to.site_cd(r.site_cd());
			to.bp_cd(r.bp_cd());
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

			if (isNull(r.po_no()) && _cndR.po_no_flg()) {
				to.no_po_no_flg(true);
			}
			if (isNull(r.slo_no()) && _cndR.slo_no_flg()) {
				to.no_slo_no_flg(true);
			}
			if (isNull(r.iv_no()) && _cndR.iv_no_flg()) {
				to.no_iv_no_flg(true);
			}
		}

		aso.putCnd(to);
		aso.runValueInit();
		aso.putSearchAction();
		aso.show();
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

		if (isNull(r.itm_mfg_inst_no())) {
			to.lot_no(r.lot_no());
			to.sublot_no(r.sublot_no());
			to.sno1(r.sno1());
			to.sno2(r.sno2());
			to.sno3(r.sno3());
			to.sno4(r.sno4());
			to.loc_cd(r.loc_cd());
			to.str_ln_cd(r.str_ln_cd());
			to.site_cd(r.site_cd());
			to.po_no(r.po_no());
			to.slo_no(r.slo_no());
			to.iv_no(r.iv_no());

			if (isNull(r.po_no()) && _cndR.po_no_flg()) {
				to.no_po_no_flg(true);
			}
			if (isNull(r.slo_no()) && _cndR.slo_no_flg()) {
				to.no_slo_no_flg(true);
			}
			if (isNull(r.iv_no()) && _cndR.iv_no_flg()) {
				to.no_iv_no_flg(true);
			}
		}

		aso.putCnd(to);
		aso.runValueInit();
		aso.putSearchAction();
		aso.show();
	}

	/**
	 * Panel[Btn]のボタン[open_MGBFP0200]の押下時の処理
	 */
	@Override
	public void doBtn_open_MGBFP0200(MCEventInfo info) {
		RsltR r = RsltTable.getSelectedMCRow();
		if (r == null) {
			dialog(msgNoSelectedRow());
			return;
		}
		doBtn_open_MGBFP0200(r);
	}

	protected void doBtn_open_MGBFP0200(RsltR r) {
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MG", "MGBFP0200");
		mcframe.clientMGBF.MGBFP0200.CndR to = mcframe.clientMGBF.MGBFP0200.CndR.create();
		mcframe.clientMGBF.MGBFP0200.MGBFP_CostBreakdownSrch p = (mcframe.clientMGBF.MGBFP0200.MGBFP_CostBreakdownSrch) aso
				.getPanel();

		to.ope(p.Cnd_ope_INST.getActionCommand());
		to.calc_grp_cd(_cndR.calc_grp_cd());
		to.calc_no(_cndR.calc_no());
		to.wg_cd(r.wg_cd());
		to.ym_fr(r.ym());
		to.ym_to(r.ym());
		to.mng_dpt_cd(r.mng_dpt_cd());
		to.itm_cd(r.itm_cd());
		to.itm_sub1(r.itm_sub1());
		to.itm_sub2(r.itm_sub2());
		to.itm_sub3(r.itm_sub3());
		to.itm_mfg_inst_no(r.itm_mfg_inst_no());
		to.mfg_act_no(r.mfg_act_no());

		if (isNull(r.itm_mfg_inst_no())) {
			to.lot_no(r.lot_no());
			to.sublot_no(r.sublot_no());
			to.sno1(r.sno1());
			to.sno2(r.sno2());
			to.sno3(r.sno3());
			to.sno4(r.sno4());
			to.loc_cd(r.loc_cd());
			to.str_ln_cd(r.str_ln_cd());
			to.po_no(r.po_no());
			to.slo_no(r.slo_no());
			to.iv_no(r.iv_no());

			if (isNull(r.po_no()) && _cndR.po_no_flg()) {
				to.no_po_no_flg(true);
			}
			if (isNull(r.slo_no()) && _cndR.slo_no_flg()) {
				to.no_slo_no_flg(true);
			}
			if (isNull(r.iv_no()) && _cndR.iv_no_flg()) {
				to.no_iv_no_flg(true);
			}
		}

		aso.putCnd(to);
		aso.runValueInit();
		if (!isNull(to.wg_cd()) && !isNull(to.itm_cd())) {
			aso.putSearchAction();
		}
		aso.show();
	}

	/**
	 * [MG_MGBFL0020_Srch01]の定型処理のInnerClass
	 */
	protected class MG_MGBFL0020_Srch01Caller<P extends MGBFP_CmpCostSrch, B extends MG_MGBFL0020_Srch01Bridge>
			extends mcframe.clientMAUD.MAUDP0010.MAUDP_Searcher<P, B> {

		protected MG_MGBFL0020_Srch01Caller(P p, B b) {
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
		protected void afterCall() {
			super.afterCall();

			// カラム表示に使用するため保持
			_cndR = getCndR().clone();

			for (RsltR row : bridge.down0()) {
				calcUnitElm(row);
				row.unit_diff2(row.unit_diff());
				row.std_upri2(row.std_upri());
				row.upri2(row.upri());
			}
		}

		/**
		 * 費目と費目Ｇの単価を計算する
		 */
		protected void calcUnitElm(RsltR row) {
			_cc.calcUnit(row, row.qty(), false);
		}

		@Override
		protected void showReplaceSub() {
			super.showReplaceSub();

			// 合計行を保持
			_sumRow = getRsltL().get(getRsltL().size() - 1);

			// 単価表示時は合計行を表示しない
			if (getLPnlR().disp_unit()) {
				getRsltL().remove(getRsltL().size() - 1);
			}
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
		callMG_MGBFL0020_Srch01();
	}

	// -----------------------------------------------
	// init-parts
	@Override
	protected void setupParts() {
		super.setupParts();
		Cnd_calc_no_p_PPanel.setRelateBeans(Cnd_calc_grp_cd);
		Rslt_qty_p_PPanel.setRelateBeans(columnRslt_unit_cd, columnRslt_dec_place);
		Rslt_odr_qty_p_PPanel.setRelateBeans(columnRslt_unit_cd, columnRslt_dec_place);
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
		_cc.setExpns(getCustomExpnsL(), LPnl_disp_expns, LPnl_disp_expns_grp,
				LPnl_disp_unit);
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
	public boolean sort(MCTable<?> table, MCSortPolicy policy) {
		if (getLPnlR().disp_unit()) {
			return super.sort(table, policy);
		}
		return sortWithoutBottom(table, policy);
	}

	@Override
	protected void tableInit() {
		super.tableInit();
		setColorInfo();
	}

	protected void setColorInfo() {
		MGUDP_CellConfig cc = (MGUDP_CellConfig) RsltTable.getCellConfig();
		Color rslt = getExpnsSrchRsltColor(this);
		for (MCColumnConfig c : RsltTable.getColumnConfigs()) {
			cc.putColumnBG(c, rslt);
		}
		cc.putColumnBG(columnRslt_unit_diff, getMoneyDiffColor(this));
		cc.putColumnBG(columnRslt_std_upri, getStdUpriColor(this));
		cc.putColumnBG(columnRslt_unit_diff2, getMoneyDiffColor(this));
		cc.putColumnBG(columnRslt_std_upri2, getStdUpriColor(this));
		cc.putColumnBG(columnRslt_upri2, getAllTtlColor(this));
		cc.putColumnBG(columnRslt_unit_var, getVarFxdColor(this));
		cc.putColumnBG(columnRslt_unit_fxd, getVarFxdColor(this));
		cc.putColumnBG(columnRslt_amt_diff, getMoneyDiffColor(this));
		cc.putColumnBG(columnRslt_std_cost, getStdUpriColor(this));
		cc.putColumnBG(columnRslt_ttl, getAllTtlColor(this));
		cc.putColumnBG(columnRslt_var, getVarFxdColor(this));
		cc.putColumnBG(columnRslt_fxd, getVarFxdColor(this));
		cc.putColumnBG(_cc.getExpnsGColumnConfigs(), getExpnsGSubTtlColor(this));
	}

	@Override
	protected void setCellConfig() {
		super.setCellConfig();
		RsltTable.setCellConfig(createRsltCellConfig());
	}

	protected RsltCellConfig createRsltCellConfig() {
		return new RsltCellConfig();
	}

	public class RsltCellConfig extends MGUDP_CellConfig {
		@Override
		public Color getPriorBG(int index, MCColumnConfig column, MCTable table,
				MCMode mode) {
			if (!getLPnlR().disp_unit() && index == getRsltL().size() - 1) {
				return _ttlColor;
			}
			return super.getPriorBG(index, column, table, mode);
		}
	}

	@Override
	protected void valueInit() {
		super.valueInit();
		setValueEx(Cnd_wg_flg, true);
		setValueEx(Cnd_mng_dpt_flg, true);
		setValueEx(Cnd_itm_flg, true);
		setValueEx(Cnd_itm_typ_flg, true);
		setValueEx(Cnd_itm_typ_d_flg, true);
		setValueEx(Cnd_itm_jnl_flg, true);
		setValueEx(Cnd_qty_flg, true);
		setValueEx(LPnl_disp_expns, true);
		setValueEx(LPnl_disp_expns_grp, true);
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
		setCndMode();
		displayColumn();
		setBtnMode();
		FoldTab.focusActiveFirstComponent();
	}

	@Override
	public void setREFStatus() {
		super.setREFStatus();
		setCndMode();
		displayColumn();
		setBtnMode();
		RsltTable.selectLeftmostColumn(0);
	}

	@Override
	public void setStatus(String status) {
		super.setStatus(status);
		setDispUnitMode();
	}

	public void setCndMode() {
		setDispUnitMode();
	}

	protected void setDispUnitMode() {
		if (getCndR().qty_flg()) {
			setDefaultMode(LPnl_disp_unit);
		}
		else {
			setValueEx(LPnl_disp_unit, false);
			LPnl_disp_unit.setMode(MCMode.READ_ONLY);
		}
	}

	protected void setBtnMode() {
		RsltR r = RsltTable.getSelectedMCRow();

		setBtnModeByFlg(Btn_open_MGBFP0010, isEnableBtn_open(r));
		setBtnModeByFlg(Btn_open_MGBFP0030, isEnableBtn_open(r));
		setBtnModeByFlg(Btn_open_MGBFP0070, isEnableBtn_open(r));
		setBtnModeByFlg(Btn_open_MGBFP0080, isEnableBtn_open(r));
		setBtnModeByFlg(Btn_open_MGBFP0090, isEnableBtn_open(r));
		setBtnModeByFlg(Btn_open_MGBFP0120, isEnableBtn_open(r));
		setBtnModeByFlg(Btn_open_MGBFP0130, isEnableBtn_open(r));
		setBtnModeByFlg(Btn_open_MGBFP0140, isEnableBtn_open_MGBFP0140(r));
		setBtnModeByFlg(Btn_open_MGBFP0200, isEnableBtn_open_MGBFP0200(r));
	}

	protected boolean isEnableBtn_open(RsltR r) {
		if (r == null) {
			return false;
		}

		if (getLPnlR().disp_unit()) {
			return true;
		}
		return getRsltL().size() - 1 != r.getGUIIndex();
	}

	protected boolean isEnableBtn_open_MGBFP0140(RsltR r) {
		if (r == null) {
			return false;
		}
		return true;
	}

	protected boolean isEnableBtn_open_MGBFP0200(RsltR r) {
		if (r == null) {
			return false;
		}
		return true;
	}

	// -----------------------------------------------
	// Event
	@Override
	public void doRslt_NC(MCEventInfo info) {
		super.doRslt_NC(info);
		setBtnMode();
	}

	@Override
	public void doCnd_no_ac_rsn_flg_NC(MCEventInfo info) {
		super.doCnd_no_ac_rsn_flg_NC(info);
		if (getCndR().no_ac_rsn_flg()) {
			setValueEx(Cnd_ac_rsn_cd, null);
			setValueEx(Cnd_ac_rsn_nm, null);
		}
	}

	@Override
	public void doCnd_ac_rsn_cd_LC(MCEventInfo info) {
		super.doCnd_ac_rsn_cd_LC(info);
		if (!isNull(getCndR().ac_rsn_cd())) {
			setValueEx(Cnd_no_ac_rsn_flg, false);
		}
	}

	@Override
	public void doCnd_ac_rsn_nm_LC(MCEventInfo info) {
		super.doCnd_ac_rsn_nm_LC(info);
		if (!isNull(getCndR().ac_rsn_nm())) {
			setValueEx(Cnd_no_ac_rsn_flg, false);
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
	public void doCnd_no_slo_no_flg_NC(MCEventInfo info) {
		super.doCnd_no_slo_no_flg_NC(info);
		if (getCndR().no_slo_no_flg()) {
			setValueEx(Cnd_slo_no, null);
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
	public void doCnd_no_po_no_flg_NC(MCEventInfo info) {
		super.doCnd_no_po_no_flg_NC(info);
		if (getCndR().no_po_no_flg()) {
			setValueEx(Cnd_po_no, null);
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
	public void doCnd_itm_mfg_inst_flg_NC(MCEventInfo info) {
		super.doCnd_itm_mfg_inst_flg_NC(info);
		if (getCndR().itm_mfg_inst_flg()) {
			setValueEx(Cnd_itm_flg, true);
		}
	}

	@Override
	public void doCnd_mfg_act_flg_NC(MCEventInfo info) {
		super.doCnd_mfg_act_flg_NC(info);
		if (getCndR().mfg_act_flg()) {
			setValueEx(Cnd_itm_flg, true);
		}
	}

	@Override
	public void doCnd_itm_flg_NC(MCEventInfo info) {
		super.doCnd_itm_flg_NC(info);
		if (!getCndR().itm_flg()) {
			setValueEx(Cnd_itm_mfg_inst_flg, false);
			setValueEx(Cnd_mfg_act_flg, false);
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
			getCndR().str_ln_flg(false);
		}
	}

	@Override
	public void doCnd_str_ln_flg_NC(MCEventInfo info) {
		super.doCnd_str_ln_flg_NC(info);
		if (getCndR().str_ln_flg()) {
			getCndR().loc_flg(true);
		}
	}

	@Override
	public void doCnd_qty_flg_NC(MCEventInfo info) {
		super.doCnd_qty_flg_NC(info);
		setDispUnitMode();
		if (!getCndR().qty_flg()) {
			getCndR().odr_qty_flg(false);
		}
	}

	@Override
	public void doCnd_odr_qty_flg_NC(MCEventInfo info) {
		super.doCnd_odr_qty_flg_NC(info);
		if (getCndR().odr_qty_flg()) {
			getCndR().qty_flg(true);
		}
	}

	@Override
	public void doLPnl_disp_std_NC(MCEventInfo info) {
		super.doLPnl_disp_std_NC(info);
		_cc.displayColumn();
		displayStdColumn();
		RsltTable.adjustWidth();
	}

	@Override
	public void doLPnl_disp_unit_NC(MCEventInfo info) {
		super.doLPnl_disp_unit_NC(info);
		_cc.displayColumn();
		displayStdColumn();
		displaySumRow();
		RsltTable.adjustWidth();
	}

	// -----------------------------------------------
	// Display

	protected void displayColumn() {
		if (getCndR().qty_flg()) {
			setDefaultMode(LPnl_disp_unit);
		}
		else {
			getLPnlR().disp_unit(false);
			LPnl_disp_unit.setMode(MCMode.READ_ONLY);
		}

		changeColumnMode(RsltTable, getCndR(), RsltR.$$SHOW);
		_cc.displayColumn();
		displayStdColumn();
	}

	// 標準表示・単価表示で表示制御する項目
	protected void displayStdColumn() {

		// 単価表示のみで制御
		setColModeByFlg(columnRslt_ttl, !getLPnlR().disp_unit());
		setColModeByFlg(columnRslt_var, !getLPnlR().disp_unit());
		setColModeByFlg(columnRslt_fxd, !getLPnlR().disp_unit());

		// 標準表示・単価表示で制御
		setColModeByFlg(columnRslt_std_cost,
				getLPnlR().disp_std() && !getLPnlR().disp_unit());
		setColModeByFlg(columnRslt_amt_diff,
				getLPnlR().disp_std() && !getLPnlR().disp_unit());

		setColModeByFlg(columnRslt_unit_diff,
				getLPnlR().disp_std() && _cndR.wg_flg() && _cndR.itm_flg() && _cndR.qty_flg() && !getLPnlR().disp_unit());
		setColModeByFlg(columnRslt_std_upri,
				getLPnlR().disp_std() && _cndR.wg_flg() && _cndR.itm_flg() && _cndR.qty_flg() && !getLPnlR().disp_unit());
		setColModeByFlg(columnRslt_unit_diff2,
				getLPnlR().disp_std() && _cndR.wg_flg() && _cndR.itm_flg() && _cndR.qty_flg() && getLPnlR().disp_unit());
		setColModeByFlg(columnRslt_std_upri2,
				getLPnlR().disp_std() && _cndR.wg_flg() && _cndR.itm_flg() && _cndR.qty_flg() && getLPnlR().disp_unit());

		setColModeByFlg(columnRslt_upri, _cndR.qty_flg() && !getLPnlR().disp_unit());
		setColModeByFlg(columnRslt_upri2, _cndR.qty_flg() && getLPnlR().disp_unit());
		setColModeByFlg(columnRslt_unit_var, _cndR.qty_flg() && getLPnlR().disp_unit());
		setColModeByFlg(columnRslt_unit_fxd, _cndR.qty_flg() && getLPnlR().disp_unit());
		setColModeByFlg(columnRslt_odr_upri,
				_cndR.odr_qty_flg() && !getLPnlR().disp_unit());
	}

	protected void displaySumRow() {
		if (getRsltL().size() > 0) {
			if (getLPnlR().disp_unit()) {
				getRsltL().remove(getRsltL().size() - 1);
			}
			else {
				getRsltL().add(_sumRow);
			}
		}

	}

}