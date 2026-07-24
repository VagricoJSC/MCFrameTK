package mcframe.clientMABC.MABCP0030;

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


import mcframe.commonMA.constant.*;
import mcframe.commonMAUC.MAUCC2010.MAUCC_RowMapperWith;
import mcframe.clientMAUC.MAUCP0040.MAUCP_AppScreenOpener;
import static mcframe.commonMA.notice.MA_Msg.*;
import static mcframe.commonMAUD.MAUDC0120.MAUDC_ListLogicBase.*;
import static mcframe.clientMAUC.MAUCP0010.MAUCP_MCDataUtil.*;
import static mcframe.clientMAUC.MAUCP0020.MAUCP_AppSys.*;


//カスタマイズのimportはこの間に記述してください。
//FMCB CUSTOM_IMPORT START
import java.util.Map;
import mcframe.commonMA.constant.MAC_MST_NM;
import mcframe.clientMAUD.MAUDP1020.MAUDP_LCLRLBase;
import mcframe.clientMAUD.MAUDP1020.MAUDP_LCLRLBaseCellConfig;
//FMCB CUSTOM_IMPORT END

/**
 * 画面"MABCP_MultiReg"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MABCP_MultiReg_MC extends MABCP_MultiReg_MC_A {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START

	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MABCP_MultiReg_MC() {
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
	public MABCP_MultiReg_MC(String name) {
		super(name);
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR_LIST START

		//FMCB CUSTOM_CONSTRUCTOR_LIST END
	}

	//画面処理メソッドはこれより下に定義してください。
	//FMCB CUSTOM_METHOD START

	/**
	 * Panel[Cnd]のボタン[srch_site_co]の押下時の処理
	 */
	@Override
	public void doCnd_srch_site_co(MCEventInfo info) {
		callMA_MABCL0030_Srch01();
	}
	/**
	 * Panel[Btn]のボタン[upd_site_co]の押下時の処理
	 */
	@Override
	public void doBtn_upd_site_co(MCEventInfo info) {
		callMA_MABCL0030_Upd01();
	}
	/**
	 * Panel[Btn]のボタン[upd_admin_site_co]の押下時の処理
	 */
	@Override
	public void doBtn_upd_admin_site_co(MCEventInfo info) {
		callMA_MABCL0030_Upd01();
	}
	/**
	 * Panel[Btn]のボタン[del_site_co]の押下時の処理
	 */
	@Override
	public void doBtn_del_site_co(MCEventInfo info) {
		callMA_MABCL0030_Del01();
	}
	/**
	 * Panel[Btn]のボタン[upd_gp_alc]の押下時の処理
	 */
	@Override
	public void doBtn_upd_gp_alc(MCEventInfo info) {
		callMA_MABCL0030_Upd01();
	}
	/**
	 * Panel[Btn]のボタン[upd_calc_ctg]の押下時の処理
	 */
	@Override
	public void doBtn_upd_calc_ctg(MCEventInfo info) {
		callMA_MABCL0030_Upd01();
	}
	/**
	 * Panel[Btn]のボタン[upd_rpt_ptn]の押下時の処理
	 */
	@Override
	public void doBtn_upd_rpt_ptn(MCEventInfo info) {
		callMA_MABCL0030_Upd01();
	}
	/**
	 * Panel[Btn]のボタン[upd_cost_menu]の押下時の処理
	 */
	@Override
	public void doBtn_upd_cost_menu(MCEventInfo info) {
		callMA_MABCL0030_Upd01();
	}
	/**
	 * Panel[Cnd]のボタン[srch_gp_alc]の押下時の処理
	 */
	@Override
	public void doCnd_srch_gp_alc(MCEventInfo info) {
		callMA_MABCL0030_Srch01();
	}
	/**
	 * Panel[Cnd]のボタン[srch_calc_ctg]の押下時の処理
	 */
	@Override
	public void doCnd_srch_calc_ctg(MCEventInfo info) {
		callMA_MABCL0030_Srch01();
	}
	/**
	 * Panel[Cnd]のボタン[srch_rpt_ptn]の押下時の処理
	 */
	@Override
	public void doCnd_srch_rpt_ptn(MCEventInfo info) {
		callMA_MABCL0030_Srch01();
	}
	/**
	 * Panel[Cnd]のボタン[srch_cost_menu]の押下時の処理
	 */
	@Override
	public void doCnd_srch_cost_menu(MCEventInfo info) {
		callMA_MABCL0030_Srch01();
	}
	/**
	 * Panel[Btn]のボタン[upd_admin_gp_alc]の押下時の処理
	 */
	@Override
	public void doBtn_upd_admin_gp_alc(MCEventInfo info) {
		callMA_MABCL0030_Upd01();
	}
	/**
	 * Panel[Btn]のボタン[upd_admin_calc_ctg]の押下時の処理
	 */
	@Override
	public void doBtn_upd_admin_calc_ctg(MCEventInfo info) {
		callMA_MABCL0030_Upd01();
	}
	/**
	 * Panel[Btn]のボタン[upd_admin_rpt_ptn]の押下時の処理
	 */
	@Override
	public void doBtn_upd_admin_rpt_ptn(MCEventInfo info) {
		callMA_MABCL0030_Upd01();
	}
	/**
	 * Panel[Btn]のボタン[upd_admin_cost_menu]の押下時の処理
	 */
	@Override
	public void doBtn_upd_admin_cost_menu(MCEventInfo info) {
		callMA_MABCL0030_Upd01();
	}
	/**
	 * Panel[Btn]のボタン[del_gp_alc]の押下時の処理
	 */
	@Override
	public void doBtn_del_gp_alc(MCEventInfo info) {
		callMA_MABCL0030_Del01();
	}
	/**
	 * Panel[Btn]のボタン[del_calc_ctg]の押下時の処理
	 */
	@Override
	public void doBtn_del_calc_ctg(MCEventInfo info) {
		callMA_MABCL0030_Del01();
	}
	/**
	 * Panel[Btn]のボタン[del_rpt_ptn]の押下時の処理
	 */
	@Override
	public void doBtn_del_rpt_ptn(MCEventInfo info) {
		callMA_MABCL0030_Del01();
	}
	/**
	 * Panel[Btn]のボタン[del_cost_menu]の押下時の処理
	 */
	@Override
	public void doBtn_del_cost_menu(MCEventInfo info) {
		callMA_MABCL0030_Del01();
	}
	/**
	 * Panel[Cnd]のボタン[srch_ship_wk]の押下時の処理
	 */
	@Override
	public void doCnd_srch_ship_wk(MCEventInfo info) {
		callMA_MABCL0030_Srch01();
	}
	/**
	 * Panel[Btn]のボタン[upd_ship_wk]の押下時の処理
	 */
	@Override
	public void doBtn_upd_ship_wk(MCEventInfo info) {
		callMA_MABCL0030_Upd01();
	}
	/**
	 * Panel[Btn]のボタン[upd_admin_ship_wk]の押下時の処理
	 */
	@Override
	public void doBtn_upd_admin_ship_wk(MCEventInfo info) {
		callMA_MABCL0030_Upd01();
	}
	/**
	 * Panel[Btn]のボタン[del_ship_wk]の押下時の処理
	 */
	@Override
	public void doBtn_del_ship_wk(MCEventInfo info) {
		callMA_MABCL0030_Del01();
	}
	/**
	 * Panel[Cnd]のボタン[srch_rsrc]の押下時の処理
	 */
	@Override
	public void doCnd_srch_rsrc(MCEventInfo info) {
		callMA_MABCL0030_Srch01();
	}
	/**
	 * Panel[Cnd]のボタン[srch_hs_grp]の押下時の処理
	 */
	@Override
	public void doCnd_srch_hs_grp(MCEventInfo info) {
		callMA_MABCL0030_Srch01();
	}
	/**
	 * Panel[Cnd]のボタン[srch_alc_ptn]の押下時の処理
	 */
	@Override
	public void doCnd_srch_alc_ptn(MCEventInfo info) {
		callMA_MABCL0030_Srch01();
	}
	/**
	 * Panel[Cnd]のボタン[srch_ctg_grp]の押下時の処理
	 */
	@Override
	public void doCnd_srch_ctg_grp(MCEventInfo info) {
		callMA_MABCL0030_Srch01();
	}
	/**
	 * Panel[Cnd]のボタン[srch_act_ptn]の押下時の処理
	 */
	@Override
	public void doCnd_srch_act_ptn(MCEventInfo info) {
		callMA_MABCL0030_Srch01();
	}
	/**
	 * Panel[Btn]のボタン[upd_rsrc]の押下時の処理
	 */
	@Override
	public void doBtn_upd_rsrc(MCEventInfo info) {
		callMA_MABCL0030_Upd01();
	}
	/**
	 * Panel[Btn]のボタン[upd_hs_grp]の押下時の処理
	 */
	@Override
	public void doBtn_upd_hs_grp(MCEventInfo info) {
		callMA_MABCL0030_Upd01();
	}
	/**
	 * Panel[Btn]のボタン[upd_alc_ptn]の押下時の処理
	 */
	@Override
	public void doBtn_upd_alc_ptn(MCEventInfo info) {
		callMA_MABCL0030_Upd01();
	}
	/**
	 * Panel[Btn]のボタン[upd_ctg_grp]の押下時の処理
	 */
	@Override
	public void doBtn_upd_ctg_grp(MCEventInfo info) {
		callMA_MABCL0030_Upd01();
	}
	/**
	 * Panel[Btn]のボタン[upd_act_ptn]の押下時の処理
	 */
	@Override
	public void doBtn_upd_act_ptn(MCEventInfo info) {
		callMA_MABCL0030_Upd01();
	}
	/**
	 * Panel[Btn]のボタン[upd_admin_rsrc]の押下時の処理
	 */
	@Override
	public void doBtn_upd_admin_rsrc(MCEventInfo info) {
		callMA_MABCL0030_Upd01();
	}
	/**
	 * Panel[Btn]のボタン[upd_admin_hs_grp]の押下時の処理
	 */
	@Override
	public void doBtn_upd_admin_hs_grp(MCEventInfo info) {
		callMA_MABCL0030_Upd01();
	}
	/**
	 * Panel[Btn]のボタン[upd_admin_alc_ptn]の押下時の処理
	 */
	@Override
	public void doBtn_upd_admin_alc_ptn(MCEventInfo info) {
		callMA_MABCL0030_Upd01();
	}
	/**
	 * Panel[Btn]のボタン[upd_admin_ctg_grp]の押下時の処理
	 */
	@Override
	public void doBtn_upd_admin_ctg_grp(MCEventInfo info) {
		callMA_MABCL0030_Upd01();
	}
	/**
	 * Panel[Btn]のボタン[upd_admin_act_ptn]の押下時の処理
	 */
	@Override
	public void doBtn_upd_admin_act_ptn(MCEventInfo info) {
		callMA_MABCL0030_Upd01();
	}
	/**
	 * Panel[Btn]のボタン[del_rsrc]の押下時の処理
	 */
	@Override
	public void doBtn_del_rsrc(MCEventInfo info) {
		callMA_MABCL0030_Del01();
	}
	/**
	 * Panel[Btn]のボタン[del_hs_grp]の押下時の処理
	 */
	@Override
	public void doBtn_del_hs_grp(MCEventInfo info) {
		callMA_MABCL0030_Del01();
	}
	/**
	 * Panel[Btn]のボタン[del_alc_ptn]の押下時の処理
	 */
	@Override
	public void doBtn_del_alc_ptn(MCEventInfo info) {
		callMA_MABCL0030_Del01();
	}
	/**
	 * Panel[Btn]のボタン[del_ctg_grp]の押下時の処理
	 */
	@Override
	public void doBtn_del_ctg_grp(MCEventInfo info) {
		callMA_MABCL0030_Del01();
	}
	/**
	 * Panel[Btn]のボタン[del_act_ptn]の押下時の処理
	 */
	@Override
	public void doBtn_del_act_ptn(MCEventInfo info) {
		callMA_MABCL0030_Del01();
	}
	/**
	 * Panel[Cnd]のボタン[srch_ship_term]の押下時の処理
	 */
	@Override
	public void doCnd_srch_ship_term(MCEventInfo info) {
		callMA_MABCL0030_Srch01();
	}
	/**
	 * Panel[Btn]のボタン[upd_ship_term]の押下時の処理
	 */
	@Override
	public void doBtn_upd_ship_term(MCEventInfo info) {
		callMA_MABCL0030_Upd01();
	}
	/**
	 * Panel[Btn]のボタン[upd_admin_ship_term]の押下時の処理
	 */
	@Override
	public void doBtn_upd_admin_ship_term(MCEventInfo info) {
		callMA_MABCL0030_Upd01();
	}
	/**
	 * Panel[Btn]のボタン[del_ship_term]の押下時の処理
	 */
	@Override
	public void doBtn_del_ship_term(MCEventInfo info) {
		callMA_MABCL0030_Del01();
	}
	/**
	 * Panel[Cnd]のボタン[srch_da]の押下時の処理
	 */
	@Override
	public void doCnd_srch_da(MCEventInfo info) {
		callMA_MABCL0030_Srch01();
	}
	/**
	 * Panel[Cnd]のボタン[srch_dpt_base]の押下時の処理
	 */
	@Override
	public void doCnd_srch_dpt_base(MCEventInfo info) {
		callMA_MABCL0030_Srch01();
	}
	/**
	 * Panel[Cnd]のボタン[srch_dpt_lvl]の押下時の処理
	 */
	@Override
	public void doCnd_srch_dpt_lvl(MCEventInfo info) {
		callMA_MABCL0030_Srch01();
	}
	/**
	 * Panel[Cnd]のボタン[srch_aprv_role]の押下時の処理
	 */
	@Override
	public void doCnd_srch_aprv_role(MCEventInfo info) {
		callMA_MABCL0030_Srch01();
	}
	/**
	 * Panel[Cnd]のボタン[srch_cntry]の押下時の処理
	 */
	@Override
	public void doCnd_srch_cntry(MCEventInfo info) {
		callMA_MABCL0030_Srch01();
	}
	/**
	 * Panel[Cnd]のボタン[srch_area]の押下時の処理
	 */
	@Override
	public void doCnd_srch_area(MCEventInfo info) {
		callMA_MABCL0030_Srch01();
	}
	/**
	 * Panel[Cnd]のボタン[srch_cur]の押下時の処理
	 */
	@Override
	public void doCnd_srch_cur(MCEventInfo info) {
		callMA_MABCL0030_Srch01();
	}
	/**
	 * Panel[Cnd]のボタン[srch_unit]の押下時の処理
	 */
	@Override
	public void doCnd_srch_unit(MCEventInfo info) {
		callMA_MABCL0030_Srch01();
	}
	/**
	 * Panel[Cnd]のボタン[srch_bank]の押下時の処理
	 */
	@Override
	public void doCnd_srch_bank(MCEventInfo info) {
		callMA_MABCL0030_Srch01();
	}
	/**
	 * Panel[Cnd]のボタン[srch_bank_branch]の押下時の処理
	 */
	@Override
	public void doCnd_srch_bank_branch(MCEventInfo info) {
		callMA_MABCL0030_Srch01();
	}
	/**
	 * Panel[Cnd]のボタン[srch_bank_ac]の押下時の処理
	 */
	@Override
	public void doCnd_srch_bank_ac(MCEventInfo info) {
		callMA_MABCL0030_Srch01();
	}
	/**
	 * Panel[Cnd]のボタン[srch_xrate]の押下時の処理
	 */
	@Override
	public void doCnd_srch_xrate(MCEventInfo info) {
		callMA_MABCL0030_Srch01();
	}
	/**
	 * Panel[Cnd]のボタン[srch_cal_base]の押下時の処理
	 */
	@Override
	public void doCnd_srch_cal_base(MCEventInfo info) {
		callMA_MABCL0030_Srch01();
	}
	/**
	 * Panel[Cnd]のボタン[srch_itm_jnl]の押下時の処理
	 */
	@Override
	public void doCnd_srch_itm_jnl(MCEventInfo info) {
		callMA_MABCL0030_Srch01();
	}
	/**
	 * Panel[Cnd]のボタン[srch_ac_itm_grp]の押下時の処理
	 */
	@Override
	public void doCnd_srch_ac_itm_grp(MCEventInfo info) {
		callMA_MABCL0030_Srch01();
	}
	/**
	 * Panel[Cnd]のボタン[srch_ac_rsn]の押下時の処理
	 */
	@Override
	public void doCnd_srch_ac_rsn(MCEventInfo info) {
		callMA_MABCL0030_Srch01();
	}
	/**
	 * Panel[Cnd]のボタン[srch_site]の押下時の処理
	 */
	@Override
	public void doCnd_srch_site(MCEventInfo info) {
		callMA_MABCL0030_Srch01();
	}
	/**
	 * Panel[Cnd]のボタン[srch_loc_grp]の押下時の処理
	 */
	@Override
	public void doCnd_srch_loc_grp(MCEventInfo info) {
		callMA_MABCL0030_Srch01();
	}
	/**
	 * Panel[Cnd]のボタン[srch_lg_grp]の押下時の処理
	 */
	@Override
	public void doCnd_srch_lg_grp(MCEventInfo info) {
		callMA_MABCL0030_Srch01();
	}
	/**
	 * Panel[Cnd]のボタン[srch_alloc_grp]の押下時の処理
	 */
	@Override
	public void doCnd_srch_alloc_grp(MCEventInfo info) {
		callMA_MABCL0030_Srch01();
	}
	/**
	 * Panel[Cnd]のボタン[srch_wg]の押下時の処理
	 */
	@Override
	public void doCnd_srch_wg(MCEventInfo info) {
		callMA_MABCL0030_Srch01();
	}
	/**
	 * Panel[Cnd]のボタン[srch_oper]の押下時の処理
	 */
	@Override
	public void doCnd_srch_oper(MCEventInfo info) {
		callMA_MABCL0030_Srch01();
	}
	/**
	 * Panel[Cnd]のボタン[srch_wk_cost]の押下時の処理
	 */
	@Override
	public void doCnd_srch_wk_cost(MCEventInfo info) {
		callMA_MABCL0030_Srch01();
	}
	/**
	 * Panel[Cnd]のボタン[srch_wk_rsn]の押下時の処理
	 */
	@Override
	public void doCnd_srch_wk_rsn(MCEventInfo info) {
		callMA_MABCL0030_Srch01();
	}
	/**
	 * Panel[Cnd]のボタン[srch_sls_upri_grp]の押下時の処理
	 */
	@Override
	public void doCnd_srch_sls_upri_grp(MCEventInfo info) {
		callMA_MABCL0030_Srch01();
	}
	/**
	 * Panel[Cnd]のボタン[srch_sls_upri_rank]の押下時の処理
	 */
	@Override
	public void doCnd_srch_sls_upri_rank(MCEventInfo info) {
		callMA_MABCL0030_Srch01();
	}
	/**
	 * Panel[Cnd]のボタン[srch_setoff_grp]の押下時の処理
	 */
	@Override
	public void doCnd_srch_setoff_grp(MCEventInfo info) {
		callMA_MABCL0030_Srch01();
	}
	/**
	 * Panel[Cnd]のボタン[srch_ship_valid]の押下時の処理
	 */
	@Override
	public void doCnd_srch_ship_valid(MCEventInfo info) {
		callMA_MABCL0030_Srch01();
	}
	/**
	 * Panel[Cnd]のボタン[srch_itm_ship_grp]の押下時の処理
	 */
	@Override
	public void doCnd_srch_itm_ship_grp(MCEventInfo info) {
		callMA_MABCL0030_Srch01();
	}
	/**
	 * Panel[Cnd]のボタン[srch_trnspt]の押下時の処理
	 */
	@Override
	public void doCnd_srch_trnspt(MCEventInfo info) {
		callMA_MABCL0030_Srch01();
	}
	/**
	 * Panel[Cnd]のボタン[srch_ex_cntnr]の押下時の処理
	 */
	@Override
	public void doCnd_srch_ex_cntnr(MCEventInfo info) {
		callMA_MABCL0030_Srch01();
	}
	/**
	 * Panel[Cnd]のボタン[srch_exim_port]の押下時の処理
	 */
	@Override
	public void doCnd_srch_exim_port(MCEventInfo info) {
		callMA_MABCL0030_Srch01();
	}
	/**
	 * Panel[Cnd]のボタン[srch_stk_gd]の押下時の処理
	 */
	@Override
	public void doCnd_srch_stk_gd(MCEventInfo info) {
		callMA_MABCL0030_Srch01();
	}
	/**
	 * Panel[Cnd]のボタン[srch_trd]の押下時の処理
	 */
	@Override
	public void doCnd_srch_trd(MCEventInfo info) {
		callMA_MABCL0030_Srch01();
	}
	/**
	 * Panel[Cnd]のボタン[srch_slip_form]の押下時の処理
	 */
	@Override
	public void doCnd_srch_slip_form(MCEventInfo info) {
		callMA_MABCL0030_Srch01();
	}
	/**
	 * Panel[Cnd]のボタン[srch_pf_grp]の押下時の処理
	 */
	@Override
	public void doCnd_srch_pf_grp(MCEventInfo info) {
		callMA_MABCL0030_Srch01();
	}
	/**
	 * Panel[Cnd]のボタン[srch_itm_spec_grp]の押下時の処理
	 */
	@Override
	public void doCnd_srch_itm_spec_grp(MCEventInfo info) {
		callMA_MABCL0030_Srch01();
	}
	/**
	 * Panel[Cnd]のボタン[srch_itm_comp_grp]の押下時の処理
	 */
	@Override
	public void doCnd_srch_itm_comp_grp(MCEventInfo info) {
		callMA_MABCL0030_Srch01();
	}
	/**
	 * Panel[Cnd]のボタン[srch_jnl_act]の押下時の処理
	 */
	@Override
	public void doCnd_srch_jnl_act(MCEventInfo info) {
		callMA_MABCL0030_Srch01();
	}
	/**
	 * Panel[Cnd]のボタン[srch_jnl_grp]の押下時の処理
	 */
	@Override
	public void doCnd_srch_jnl_grp(MCEventInfo info) {
		callMA_MABCL0030_Srch01();
	}
	/**
	 * Panel[Cnd]のボタン[srch_jnl_ptn_base]の押下時の処理
	 */
	@Override
	public void doCnd_srch_jnl_ptn_base(MCEventInfo info) {
		callMA_MABCL0030_Srch01();
	}
	/**
	 * Panel[Cnd]のボタン[srch_auto_jnl_key]の押下時の処理
	 */
	@Override
	public void doCnd_srch_auto_jnl_key(MCEventInfo info) {
		callMA_MABCL0030_Srch01();
	}
	/**
	 * Panel[Cnd]のボタン[srch_insp_ptn]の押下時の処理
	 */
	@Override
	public void doCnd_srch_insp_ptn(MCEventInfo info) {
		callMA_MABCL0030_Srch01();
	}
	/**
	 * Panel[Cnd]のボタン[srch_wk_day]の押下時の処理
	 */
	@Override
	public void doCnd_srch_wk_day(MCEventInfo info) {
		callMA_MABCL0030_Srch01();
	}
	/**
	 * Panel[Btn]のボタン[upd_da]の押下時の処理
	 */
	@Override
	public void doBtn_upd_da(MCEventInfo info) {
		callMA_MABCL0030_Upd01();
	}
	/**
	 * Panel[Btn]のボタン[upd_dpt_base]の押下時の処理
	 */
	@Override
	public void doBtn_upd_dpt_base(MCEventInfo info) {
		callMA_MABCL0030_Upd01();
	}
	/**
	 * Panel[Btn]のボタン[upd_dpt_lvl]の押下時の処理
	 */
	@Override
	public void doBtn_upd_dpt_lvl(MCEventInfo info) {
		callMA_MABCL0030_Upd01();
	}
	/**
	 * Panel[Btn]のボタン[upd_aprv_role]の押下時の処理
	 */
	@Override
	public void doBtn_upd_aprv_role(MCEventInfo info) {
		callMA_MABCL0030_Upd01();
	}
	/**
	 * Panel[Btn]のボタン[upd_cntry]の押下時の処理
	 */
	@Override
	public void doBtn_upd_cntry(MCEventInfo info) {
		callMA_MABCL0030_Upd01();
	}
	/**
	 * Panel[Btn]のボタン[upd_area]の押下時の処理
	 */
	@Override
	public void doBtn_upd_area(MCEventInfo info) {
		callMA_MABCL0030_Upd01();
	}
	/**
	 * Panel[Btn]のボタン[upd_cur]の押下時の処理
	 */
	@Override
	public void doBtn_upd_cur(MCEventInfo info) {
		callMA_MABCL0030_Upd01();
	}
	/**
	 * Panel[Btn]のボタン[upd_unit]の押下時の処理
	 */
	@Override
	public void doBtn_upd_unit(MCEventInfo info) {
		callMA_MABCL0030_Upd01();
	}
	/**
	 * Panel[Btn]のボタン[upd_bank]の押下時の処理
	 */
	@Override
	public void doBtn_upd_bank(MCEventInfo info) {
		callMA_MABCL0030_Upd01();
	}
	/**
	 * Panel[Btn]のボタン[upd_bank_branch]の押下時の処理
	 */
	@Override
	public void doBtn_upd_bank_branch(MCEventInfo info) {
		callMA_MABCL0030_Upd01();
	}
	/**
	 * Panel[Btn]のボタン[upd_bank_ac]の押下時の処理
	 */
	@Override
	public void doBtn_upd_bank_ac(MCEventInfo info) {
		callMA_MABCL0030_Upd01();
	}
	/**
	 * Panel[Btn]のボタン[upd_xrate]の押下時の処理
	 */
	@Override
	public void doBtn_upd_xrate(MCEventInfo info) {
		callMA_MABCL0030_Upd01();
	}
	/**
	 * Panel[Btn]のボタン[upd_cal_base]の押下時の処理
	 */
	@Override
	public void doBtn_upd_cal_base(MCEventInfo info) {
		callMA_MABCL0030_Upd01();
	}
	/**
	 * Panel[Btn]のボタン[upd_itm_jnl]の押下時の処理
	 */
	@Override
	public void doBtn_upd_itm_jnl(MCEventInfo info) {
		callMA_MABCL0030_Upd01();
	}
	/**
	 * Panel[Btn]のボタン[upd_ac_itm_grp]の押下時の処理
	 */
	@Override
	public void doBtn_upd_ac_itm_grp(MCEventInfo info) {
		callMA_MABCL0030_Upd01();
	}
	/**
	 * Panel[Btn]のボタン[upd_ac_rsn]の押下時の処理
	 */
	@Override
	public void doBtn_upd_ac_rsn(MCEventInfo info) {
		callMA_MABCL0030_Upd01();
	}
	/**
	 * Panel[Btn]のボタン[upd_site]の押下時の処理
	 */
	@Override
	public void doBtn_upd_site(MCEventInfo info) {
		callMA_MABCL0030_Upd01();
	}
	/**
	 * Panel[Btn]のボタン[upd_loc_grp]の押下時の処理
	 */
	@Override
	public void doBtn_upd_loc_grp(MCEventInfo info) {
		callMA_MABCL0030_Upd01();
	}
	/**
	 * Panel[Btn]のボタン[upd_lg_grp]の押下時の処理
	 */
	@Override
	public void doBtn_upd_lg_grp(MCEventInfo info) {
		callMA_MABCL0030_Upd01();
	}
	/**
	 * Panel[Btn]のボタン[upd_alloc_grp]の押下時の処理
	 */
	@Override
	public void doBtn_upd_alloc_grp(MCEventInfo info) {
		callMA_MABCL0030_Upd01();
	}
	/**
	 * Panel[Btn]のボタン[upd_wg]の押下時の処理
	 */
	@Override
	public void doBtn_upd_wg(MCEventInfo info) {
		callMA_MABCL0030_Upd01();
	}
	/**
	 * Panel[Btn]のボタン[upd_oper]の押下時の処理
	 */
	@Override
	public void doBtn_upd_oper(MCEventInfo info) {
		callMA_MABCL0030_Upd01();
	}
	/**
	 * Panel[Btn]のボタン[upd_wk_cost]の押下時の処理
	 */
	@Override
	public void doBtn_upd_wk_cost(MCEventInfo info) {
		callMA_MABCL0030_Upd01();
	}
	/**
	 * Panel[Btn]のボタン[upd_wk_rsn]の押下時の処理
	 */
	@Override
	public void doBtn_upd_wk_rsn(MCEventInfo info) {
		callMA_MABCL0030_Upd01();
	}
	/**
	 * Panel[Btn]のボタン[upd_sls_upri_grp]の押下時の処理
	 */
	@Override
	public void doBtn_upd_sls_upri_grp(MCEventInfo info) {
		callMA_MABCL0030_Upd01();
	}
	/**
	 * Panel[Btn]のボタン[upd_sls_upri_rank]の押下時の処理
	 */
	@Override
	public void doBtn_upd_sls_upri_rank(MCEventInfo info) {
		callMA_MABCL0030_Upd01();
	}
	/**
	 * Panel[Btn]のボタン[upd_setoff_grp]の押下時の処理
	 */
	@Override
	public void doBtn_upd_setoff_grp(MCEventInfo info) {
		callMA_MABCL0030_Upd01();
	}
	/**
	 * Panel[Btn]のボタン[upd_ship_valid]の押下時の処理
	 */
	@Override
	public void doBtn_upd_ship_valid(MCEventInfo info) {
		callMA_MABCL0030_Upd01();
	}
	/**
	 * Panel[Btn]のボタン[upd_itm_ship_grp]の押下時の処理
	 */
	@Override
	public void doBtn_upd_itm_ship_grp(MCEventInfo info) {
		callMA_MABCL0030_Upd01();
	}
	/**
	 * Panel[Btn]のボタン[upd_trnspt]の押下時の処理
	 */
	@Override
	public void doBtn_upd_trnspt(MCEventInfo info) {
		callMA_MABCL0030_Upd01();
	}
	/**
	 * Panel[Btn]のボタン[upd_ex_cntnr]の押下時の処理
	 */
	@Override
	public void doBtn_upd_ex_cntnr(MCEventInfo info) {
		callMA_MABCL0030_Upd01();
	}
	/**
	 * Panel[Btn]のボタン[upd_exim_port]の押下時の処理
	 */
	@Override
	public void doBtn_upd_exim_port(MCEventInfo info) {
		callMA_MABCL0030_Upd01();
	}
	/**
	 * Panel[Btn]のボタン[upd_stk_gd]の押下時の処理
	 */
	@Override
	public void doBtn_upd_stk_gd(MCEventInfo info) {
		callMA_MABCL0030_Upd01();
	}
	/**
	 * Panel[Btn]のボタン[upd_trd]の押下時の処理
	 */
	@Override
	public void doBtn_upd_trd(MCEventInfo info) {
		callMA_MABCL0030_Upd01();
	}
	/**
	 * Panel[Btn]のボタン[upd_slip_form]の押下時の処理
	 */
	@Override
	public void doBtn_upd_slip_form(MCEventInfo info) {
		callMA_MABCL0030_Upd01();
	}
	/**
	 * Panel[Btn]のボタン[upd_pf_grp]の押下時の処理
	 */
	@Override
	public void doBtn_upd_pf_grp(MCEventInfo info) {
		callMA_MABCL0030_Upd01();
	}
	/**
	 * Panel[Btn]のボタン[upd_itm_spec_grp]の押下時の処理
	 */
	@Override
	public void doBtn_upd_itm_spec_grp(MCEventInfo info) {
		callMA_MABCL0030_Upd01();
	}
	/**
	 * Panel[Btn]のボタン[upd_itm_comp_grp]の押下時の処理
	 */
	@Override
	public void doBtn_upd_itm_comp_grp(MCEventInfo info) {
		callMA_MABCL0030_Upd01();
	}
	/**
	 * Panel[Btn]のボタン[upd_jnl_act]の押下時の処理
	 */
	@Override
	public void doBtn_upd_jnl_act(MCEventInfo info) {
		callMA_MABCL0030_Upd01();
	}
	/**
	 * Panel[Btn]のボタン[upd_jnl_grp]の押下時の処理
	 */
	@Override
	public void doBtn_upd_jnl_grp(MCEventInfo info) {
		callMA_MABCL0030_Upd01();
	}
	/**
	 * Panel[Btn]のボタン[upd_jnl_ptn_base]の押下時の処理
	 */
	@Override
	public void doBtn_upd_jnl_ptn_base(MCEventInfo info) {
		callMA_MABCL0030_Upd01();
	}
	/**
	 * Panel[Btn]のボタン[upd_auto_jnl_key]の押下時の処理
	 */
	@Override
	public void doBtn_upd_auto_jnl_key(MCEventInfo info) {
		callMA_MABCL0030_Upd01();
	}
	/**
	 * Panel[Btn]のボタン[upd_insp_ptn]の押下時の処理
	 */
	@Override
	public void doBtn_upd_insp_ptn(MCEventInfo info) {
		callMA_MABCL0030_Upd01();
	}
	/**
	 * Panel[Btn]のボタン[upd_wk_day]の押下時の処理
	 */
	@Override
	public void doBtn_upd_wk_day(MCEventInfo info) {
		callMA_MABCL0030_Upd01();
	}
	/**
	 * Panel[Btn]のボタン[upd_admin_da]の押下時の処理
	 */
	@Override
	public void doBtn_upd_admin_da(MCEventInfo info) {
		callMA_MABCL0030_Upd01();
	}
	/**
	 * Panel[Btn]のボタン[upd_admin_dpt_base]の押下時の処理
	 */
	@Override
	public void doBtn_upd_admin_dpt_base(MCEventInfo info) {
		callMA_MABCL0030_Upd01();
	}
	/**
	 * Panel[Btn]のボタン[upd_admin_dpt_lvl]の押下時の処理
	 */
	@Override
	public void doBtn_upd_admin_dpt_lvl(MCEventInfo info) {
		callMA_MABCL0030_Upd01();
	}
	/**
	 * Panel[Btn]のボタン[upd_admin_aprv_role]の押下時の処理
	 */
	@Override
	public void doBtn_upd_admin_aprv_role(MCEventInfo info) {
		callMA_MABCL0030_Upd01();
	}
	/**
	 * Panel[Btn]のボタン[upd_admin_cntry]の押下時の処理
	 */
	@Override
	public void doBtn_upd_admin_cntry(MCEventInfo info) {
		callMA_MABCL0030_Upd01();
	}
	/**
	 * Panel[Btn]のボタン[upd_admin_area]の押下時の処理
	 */
	@Override
	public void doBtn_upd_admin_area(MCEventInfo info) {
		callMA_MABCL0030_Upd01();
	}
	/**
	 * Panel[Btn]のボタン[upd_admin_cur]の押下時の処理
	 */
	@Override
	public void doBtn_upd_admin_cur(MCEventInfo info) {
		callMA_MABCL0030_Upd01();
	}
	/**
	 * Panel[Btn]のボタン[upd_admin_unit]の押下時の処理
	 */
	@Override
	public void doBtn_upd_admin_unit(MCEventInfo info) {
		callMA_MABCL0030_Upd01();
	}
	/**
	 * Panel[Btn]のボタン[upd_admin_bank]の押下時の処理
	 */
	@Override
	public void doBtn_upd_admin_bank(MCEventInfo info) {
		callMA_MABCL0030_Upd01();
	}
	/**
	 * Panel[Btn]のボタン[upd_admin_bank_branch]の押下時の処理
	 */
	@Override
	public void doBtn_upd_admin_bank_branch(MCEventInfo info) {
		callMA_MABCL0030_Upd01();
	}
	/**
	 * Panel[Btn]のボタン[upd_admin_bank_ac]の押下時の処理
	 */
	@Override
	public void doBtn_upd_admin_bank_ac(MCEventInfo info) {
		callMA_MABCL0030_Upd01();
	}
	/**
	 * Panel[Btn]のボタン[upd_admin_xrate]の押下時の処理
	 */
	@Override
	public void doBtn_upd_admin_xrate(MCEventInfo info) {
		callMA_MABCL0030_Upd01();
	}
	/**
	 * Panel[Btn]のボタン[upd_admin_cal_base]の押下時の処理
	 */
	@Override
	public void doBtn_upd_admin_cal_base(MCEventInfo info) {
		callMA_MABCL0030_Upd01();
	}
	/**
	 * Panel[Btn]のボタン[upd_admin_itm_jnl]の押下時の処理
	 */
	@Override
	public void doBtn_upd_admin_itm_jnl(MCEventInfo info) {
		callMA_MABCL0030_Upd01();
	}
	/**
	 * Panel[Btn]のボタン[upd_admin_ac_itm_grp]の押下時の処理
	 */
	@Override
	public void doBtn_upd_admin_ac_itm_grp(MCEventInfo info) {
		callMA_MABCL0030_Upd01();
	}
	/**
	 * Panel[Btn]のボタン[upd_admin_ac_rsn]の押下時の処理
	 */
	@Override
	public void doBtn_upd_admin_ac_rsn(MCEventInfo info) {
		callMA_MABCL0030_Upd01();
	}
	/**
	 * Panel[Btn]のボタン[upd_admin_site]の押下時の処理
	 */
	@Override
	public void doBtn_upd_admin_site(MCEventInfo info) {
		callMA_MABCL0030_Upd01();
	}
	/**
	 * Panel[Btn]のボタン[upd_admin_loc_grp]の押下時の処理
	 */
	@Override
	public void doBtn_upd_admin_loc_grp(MCEventInfo info) {
		callMA_MABCL0030_Upd01();
	}
	/**
	 * Panel[Btn]のボタン[upd_admin_lg_grp]の押下時の処理
	 */
	@Override
	public void doBtn_upd_admin_lg_grp(MCEventInfo info) {
		callMA_MABCL0030_Upd01();
	}
	/**
	 * Panel[Btn]のボタン[upd_admin_alloc_grp]の押下時の処理
	 */
	@Override
	public void doBtn_upd_admin_alloc_grp(MCEventInfo info) {
		callMA_MABCL0030_Upd01();
	}
	/**
	 * Panel[Btn]のボタン[upd_admin_wg]の押下時の処理
	 */
	@Override
	public void doBtn_upd_admin_wg(MCEventInfo info) {
		callMA_MABCL0030_Upd01();
	}
	/**
	 * Panel[Btn]のボタン[upd_admin_oper]の押下時の処理
	 */
	@Override
	public void doBtn_upd_admin_oper(MCEventInfo info) {
		callMA_MABCL0030_Upd01();
	}
	/**
	 * Panel[Btn]のボタン[upd_admin_wk_cost]の押下時の処理
	 */
	@Override
	public void doBtn_upd_admin_wk_cost(MCEventInfo info) {
		callMA_MABCL0030_Upd01();
	}
	/**
	 * Panel[Btn]のボタン[upd_admin_wk_rsn]の押下時の処理
	 */
	@Override
	public void doBtn_upd_admin_wk_rsn(MCEventInfo info) {
		callMA_MABCL0030_Upd01();
	}
	/**
	 * Panel[Btn]のボタン[upd_admin_sls_upri_grp]の押下時の処理
	 */
	@Override
	public void doBtn_upd_admin_sls_upri_grp(MCEventInfo info) {
		callMA_MABCL0030_Upd01();
	}
	/**
	 * Panel[Btn]のボタン[upd_admin_sls_upri_rank]の押下時の処理
	 */
	@Override
	public void doBtn_upd_admin_sls_upri_rank(MCEventInfo info) {
		callMA_MABCL0030_Upd01();
	}
	/**
	 * Panel[Btn]のボタン[upd_admin_setoff_grp]の押下時の処理
	 */
	@Override
	public void doBtn_upd_admin_setoff_grp(MCEventInfo info) {
		callMA_MABCL0030_Upd01();
	}
	/**
	 * Panel[Btn]のボタン[upd_admin_ship_valid]の押下時の処理
	 */
	@Override
	public void doBtn_upd_admin_ship_valid(MCEventInfo info) {
		callMA_MABCL0030_Upd01();
	}
	/**
	 * Panel[Btn]のボタン[upd_admin_itm_ship_grp]の押下時の処理
	 */
	@Override
	public void doBtn_upd_admin_itm_ship_grp(MCEventInfo info) {
		callMA_MABCL0030_Upd01();
	}
	/**
	 * Panel[Btn]のボタン[upd_admin_trnspt]の押下時の処理
	 */
	@Override
	public void doBtn_upd_admin_trnspt(MCEventInfo info) {
		callMA_MABCL0030_Upd01();
	}
	/**
	 * Panel[Btn]のボタン[upd_admin_ex_cntnr]の押下時の処理
	 */
	@Override
	public void doBtn_upd_admin_ex_cntnr(MCEventInfo info) {
		callMA_MABCL0030_Upd01();
	}
	/**
	 * Panel[Btn]のボタン[upd_admin_exim_port]の押下時の処理
	 */
	@Override
	public void doBtn_upd_admin_exim_port(MCEventInfo info) {
		callMA_MABCL0030_Upd01();
	}
	/**
	 * Panel[Btn]のボタン[upd_admin_stk_gd]の押下時の処理
	 */
	@Override
	public void doBtn_upd_admin_stk_gd(MCEventInfo info) {
		callMA_MABCL0030_Upd01();
	}
	/**
	 * Panel[Btn]のボタン[upd_admin_trd]の押下時の処理
	 */
	@Override
	public void doBtn_upd_admin_trd(MCEventInfo info) {
		callMA_MABCL0030_Upd01();
	}
	/**
	 * Panel[Btn]のボタン[upd_admin_slip_form]の押下時の処理
	 */
	@Override
	public void doBtn_upd_admin_slip_form(MCEventInfo info) {
		callMA_MABCL0030_Upd01();
	}
	/**
	 * Panel[Btn]のボタン[upd_admin_pf_grp]の押下時の処理
	 */
	@Override
	public void doBtn_upd_admin_pf_grp(MCEventInfo info) {
		callMA_MABCL0030_Upd01();
	}
	/**
	 * Panel[Btn]のボタン[upd_admin_itm_spec_grp]の押下時の処理
	 */
	@Override
	public void doBtn_upd_admin_itm_spec_grp(MCEventInfo info) {
		callMA_MABCL0030_Upd01();
	}
	/**
	 * Panel[Btn]のボタン[upd_admin_itm_comp_grp]の押下時の処理
	 */
	@Override
	public void doBtn_upd_admin_itm_comp_grp(MCEventInfo info) {
		callMA_MABCL0030_Upd01();
	}
	/**
	 * Panel[Btn]のボタン[upd_admin_jnl_act]の押下時の処理
	 */
	@Override
	public void doBtn_upd_admin_jnl_act(MCEventInfo info) {
		callMA_MABCL0030_Upd01();
	}
	/**
	 * Panel[Btn]のボタン[upd_admin_jnl_grp]の押下時の処理
	 */
	@Override
	public void doBtn_upd_admin_jnl_grp(MCEventInfo info) {
		callMA_MABCL0030_Upd01();
	}
	/**
	 * Panel[Btn]のボタン[upd_admin_jnl_ptn_base]の押下時の処理
	 */
	@Override
	public void doBtn_upd_admin_jnl_ptn_base(MCEventInfo info) {
		callMA_MABCL0030_Upd01();
	}
	/**
	 * Panel[Btn]のボタン[upd_admin_auto_jnl_key]の押下時の処理
	 */
	@Override
	public void doBtn_upd_admin_auto_jnl_key(MCEventInfo info) {
		callMA_MABCL0030_Upd01();
	}
	/**
	 * Panel[Btn]のボタン[upd_admin_insp_ptn]の押下時の処理
	 */
	@Override
	public void doBtn_upd_admin_insp_ptn(MCEventInfo info) {
		callMA_MABCL0030_Upd01();
	}
	/**
	 * Panel[Btn]のボタン[upd_admin_wk_day]の押下時の処理
	 */
	@Override
	public void doBtn_upd_admin_wk_day(MCEventInfo info) {
		callMA_MABCL0030_Upd01();
	}
	/**
	 * Panel[Btn]のボタン[del_da]の押下時の処理
	 */
	@Override
	public void doBtn_del_da(MCEventInfo info) {
		callMA_MABCL0030_Del01();
	}
	/**
	 * Panel[Btn]のボタン[del_dpt_base]の押下時の処理
	 */
	@Override
	public void doBtn_del_dpt_base(MCEventInfo info) {
		callMA_MABCL0030_Del01();
	}
	/**
	 * Panel[Btn]のボタン[del_dpt_lvl]の押下時の処理
	 */
	@Override
	public void doBtn_del_dpt_lvl(MCEventInfo info) {
		callMA_MABCL0030_Del01();
	}
	/**
	 * Panel[Btn]のボタン[del_aprv_role]の押下時の処理
	 */
	@Override
	public void doBtn_del_aprv_role(MCEventInfo info) {
		callMA_MABCL0030_Del01();
	}
	/**
	 * Panel[Btn]のボタン[del_cntry]の押下時の処理
	 */
	@Override
	public void doBtn_del_cntry(MCEventInfo info) {
		callMA_MABCL0030_Del01();
	}
	/**
	 * Panel[Btn]のボタン[del_area]の押下時の処理
	 */
	@Override
	public void doBtn_del_area(MCEventInfo info) {
		callMA_MABCL0030_Del01();
	}
	/**
	 * Panel[Btn]のボタン[del_cur]の押下時の処理
	 */
	@Override
	public void doBtn_del_cur(MCEventInfo info) {
		callMA_MABCL0030_Del01();
	}
	/**
	 * Panel[Btn]のボタン[del_unit]の押下時の処理
	 */
	@Override
	public void doBtn_del_unit(MCEventInfo info) {
		callMA_MABCL0030_Del01();
	}
	/**
	 * Panel[Btn]のボタン[del_bank]の押下時の処理
	 */
	@Override
	public void doBtn_del_bank(MCEventInfo info) {
		callMA_MABCL0030_Del01();
	}
	/**
	 * Panel[Btn]のボタン[del_bank_branch]の押下時の処理
	 */
	@Override
	public void doBtn_del_bank_branch(MCEventInfo info) {
		callMA_MABCL0030_Del01();
	}
	/**
	 * Panel[Btn]のボタン[del_bank_ac]の押下時の処理
	 */
	@Override
	public void doBtn_del_bank_ac(MCEventInfo info) {
		callMA_MABCL0030_Del01();
	}
	/**
	 * Panel[Btn]のボタン[del_xrate]の押下時の処理
	 */
	@Override
	public void doBtn_del_xrate(MCEventInfo info) {
		callMA_MABCL0030_Del01();
	}
	/**
	 * Panel[Btn]のボタン[del_cal_base]の押下時の処理
	 */
	@Override
	public void doBtn_del_cal_base(MCEventInfo info) {
		callMA_MABCL0030_Del01();
	}
	/**
	 * Panel[Btn]のボタン[del_itm_jnl]の押下時の処理
	 */
	@Override
	public void doBtn_del_itm_jnl(MCEventInfo info) {
		callMA_MABCL0030_Del01();
	}
	/**
	 * Panel[Btn]のボタン[del_ac_itm_grp]の押下時の処理
	 */
	@Override
	public void doBtn_del_ac_itm_grp(MCEventInfo info) {
		callMA_MABCL0030_Del01();
	}
	/**
	 * Panel[Btn]のボタン[del_ac_rsn]の押下時の処理
	 */
	@Override
	public void doBtn_del_ac_rsn(MCEventInfo info) {
		callMA_MABCL0030_Del01();
	}
	/**
	 * Panel[Btn]のボタン[del_site]の押下時の処理
	 */
	@Override
	public void doBtn_del_site(MCEventInfo info) {
		callMA_MABCL0030_Del01();
	}
	/**
	 * Panel[Btn]のボタン[del_loc_grp]の押下時の処理
	 */
	@Override
	public void doBtn_del_loc_grp(MCEventInfo info) {
		callMA_MABCL0030_Del01();
	}
	/**
	 * Panel[Btn]のボタン[del_lg_grp]の押下時の処理
	 */
	@Override
	public void doBtn_del_lg_grp(MCEventInfo info) {
		callMA_MABCL0030_Del01();
	}
	/**
	 * Panel[Btn]のボタン[del_alloc_grp]の押下時の処理
	 */
	@Override
	public void doBtn_del_alloc_grp(MCEventInfo info) {
		callMA_MABCL0030_Del01();
	}
	/**
	 * Panel[Btn]のボタン[del_wg]の押下時の処理
	 */
	@Override
	public void doBtn_del_wg(MCEventInfo info) {
		callMA_MABCL0030_Del01();
	}
	/**
	 * Panel[Btn]のボタン[del_oper]の押下時の処理
	 */
	@Override
	public void doBtn_del_oper(MCEventInfo info) {
		callMA_MABCL0030_Del01();
	}
	/**
	 * Panel[Btn]のボタン[del_wk_cost]の押下時の処理
	 */
	@Override
	public void doBtn_del_wk_cost(MCEventInfo info) {
		callMA_MABCL0030_Del01();
	}
	/**
	 * Panel[Btn]のボタン[del_wk_rsn]の押下時の処理
	 */
	@Override
	public void doBtn_del_wk_rsn(MCEventInfo info) {
		callMA_MABCL0030_Del01();
	}
	/**
	 * Panel[Btn]のボタン[del_sls_upri_grp]の押下時の処理
	 */
	@Override
	public void doBtn_del_sls_upri_grp(MCEventInfo info) {
		callMA_MABCL0030_Del01();
	}
	/**
	 * Panel[Btn]のボタン[del_sls_upri_rank]の押下時の処理
	 */
	@Override
	public void doBtn_del_sls_upri_rank(MCEventInfo info) {
		callMA_MABCL0030_Del01();
	}
	/**
	 * Panel[Btn]のボタン[del_setoff_grp]の押下時の処理
	 */
	@Override
	public void doBtn_del_setoff_grp(MCEventInfo info) {
		callMA_MABCL0030_Del01();
	}
	/**
	 * Panel[Btn]のボタン[del_ship_valid]の押下時の処理
	 */
	@Override
	public void doBtn_del_ship_valid(MCEventInfo info) {
		callMA_MABCL0030_Del01();
	}
	/**
	 * Panel[Btn]のボタン[del_itm_ship_grp]の押下時の処理
	 */
	@Override
	public void doBtn_del_itm_ship_grp(MCEventInfo info) {
		callMA_MABCL0030_Del01();
	}
	/**
	 * Panel[Btn]のボタン[del_trnspt]の押下時の処理
	 */
	@Override
	public void doBtn_del_trnspt(MCEventInfo info) {
		callMA_MABCL0030_Del01();
	}
	/**
	 * Panel[Btn]のボタン[del_ex_cntnr]の押下時の処理
	 */
	@Override
	public void doBtn_del_ex_cntnr(MCEventInfo info) {
		callMA_MABCL0030_Del01();
	}
	/**
	 * Panel[Btn]のボタン[del_exim_port]の押下時の処理
	 */
	@Override
	public void doBtn_del_exim_port(MCEventInfo info) {
		callMA_MABCL0030_Del01();
	}
	/**
	 * Panel[Btn]のボタン[del_stk_gd]の押下時の処理
	 */
	@Override
	public void doBtn_del_stk_gd(MCEventInfo info) {
		callMA_MABCL0030_Del01();
	}
	/**
	 * Panel[Btn]のボタン[del_trd]の押下時の処理
	 */
	@Override
	public void doBtn_del_trd(MCEventInfo info) {
		callMA_MABCL0030_Del01();
	}
	/**
	 * Panel[Btn]のボタン[del_slip_form]の押下時の処理
	 */
	@Override
	public void doBtn_del_slip_form(MCEventInfo info) {
		callMA_MABCL0030_Del01();
	}
	/**
	 * Panel[Btn]のボタン[del_pf_grp]の押下時の処理
	 */
	@Override
	public void doBtn_del_pf_grp(MCEventInfo info) {
		callMA_MABCL0030_Del01();
	}
	/**
	 * Panel[Btn]のボタン[del_itm_spec_grp]の押下時の処理
	 */
	@Override
	public void doBtn_del_itm_spec_grp(MCEventInfo info) {
		callMA_MABCL0030_Del01();
	}
	/**
	 * Panel[Btn]のボタン[del_itm_comp_grp]の押下時の処理
	 */
	@Override
	public void doBtn_del_itm_comp_grp(MCEventInfo info) {
		callMA_MABCL0030_Del01();
	}
	/**
	 * Panel[Btn]のボタン[del_jnl_act]の押下時の処理
	 */
	@Override
	public void doBtn_del_jnl_act(MCEventInfo info) {
		callMA_MABCL0030_Del01();
	}
	/**
	 * Panel[Btn]のボタン[del_jnl_grp]の押下時の処理
	 */
	@Override
	public void doBtn_del_jnl_grp(MCEventInfo info) {
		callMA_MABCL0030_Del01();
	}
	/**
	 * Panel[Btn]のボタン[del_jnl_ptn_base]の押下時の処理
	 */
	@Override
	public void doBtn_del_jnl_ptn_base(MCEventInfo info) {
		callMA_MABCL0030_Del01();
	}
	/**
	 * Panel[Btn]のボタン[del_auto_jnl_key]の押下時の処理
	 */
	@Override
	public void doBtn_del_auto_jnl_key(MCEventInfo info) {
		callMA_MABCL0030_Del01();
	}
	/**
	 * Panel[Btn]のボタン[del_insp_ptn]の押下時の処理
	 */
	@Override
	public void doBtn_del_insp_ptn(MCEventInfo info) {
		callMA_MABCL0030_Del01();
	}
	/**
	 * Panel[Btn]のボタン[del_wk_day]の押下時の処理
	 */
	@Override
	public void doBtn_del_wk_day(MCEventInfo info) {
		callMA_MABCL0030_Del01();
	}
	/**
	 * [MA_MABCL0030_Srch01]の定型処理のInnerClass
	 */
	protected class MA_MABCL0030_Srch01Caller<P extends MABCP_MultiReg, B extends MA_MABCL0030_Srch01Bridge> extends mcframe.clientMAUD.MAUDP1020.MAUDP_LCLRLSearcher<P, B> {

		protected MA_MABCL0030_Srch01Caller(P p, B b) {
			super(p, b);
		}
		@Override
		protected void afterCall() {
			super.afterCall();

			// 検索結果のフラグを変更前フラグにコピーする
			bridge.down0().setColumnValue(DtlR.$org_sls_flg, bridge.down0(), DtlR.$sls_flg);
			bridge.down0().setColumnValue(DtlR.$org_lg_flg, bridge.down0(), DtlR.$lg_flg);
			bridge.down0().setColumnValue(DtlR.$org_mfg_flg, bridge.down0(), DtlR.$mfg_flg);
			bridge.down0().setColumnValue(DtlR.$org_purc_flg, bridge.down0(), DtlR.$purc_flg);
			bridge.down0().setColumnValue(DtlR.$org_ar_flg, bridge.down0(), DtlR.$ar_flg);
			bridge.down0().setColumnValue(DtlR.$org_ap_flg, bridge.down0(), DtlR.$ap_flg);
			bridge.down0().setColumnValue(DtlR.$org_sd_flg, bridge.down0(), DtlR.$sd_flg);
			bridge.down0().setColumnValue(DtlR.$org_plm_flg, bridge.down0(), DtlR.$plm_flg);
			bridge.down0().setColumnValue(DtlR.$org_slo_flg, bridge.down0(), DtlR.$slo_flg);
		}		
	}
	/**
	 * [MA_MABCL0030_Upd01]の定型処理のInnerClass
	 */
	protected class MA_MABCL0030_Upd01Caller<P extends MABCP_MultiReg, B extends MA_MABCL0030_Upd01Bridge> extends mcframe.clientMAUD.MAUDP1020.MAUDP_LCLRLUpdater<P, B> {

		protected MA_MABCL0030_Upd01Caller(P p, B b) {
			super(p, b);
		}

		@Override
		protected void setMode() {
			super.setMode();
			setColInvisible();
		}

		protected void checkDuplicateMain(MCMessageList msgList, MCTable<?> tbl) {
			Map<String, String> map = tbl.getList().createRow().getExtMap("VISIBLE");
			ArrayList<String> list = new ArrayList<String>();

			for (String key : tbl.getList().createRow().getKeys()) {
				if (isSame(map.get(key), getCndR().mst_nm()) || (tbl == getLclTable() && isSame(key, "lcl_cd"))) {
					list.add(key);
				}
			}

			panel.checkDuplicate(msgList, tbl, list.toArray(new String[0]));
		}
		
		@Override
		protected boolean isUpBlockStatusNone() {
			// ヘッダの変更有無は見ないようにカスタマイズ
			int pickedCnt = 0;
			for (MCContainer c : getAllUpBlocks()) {
				if (c instanceof MCList && isCheckList(c)) {
					pickedCnt = pickedCnt + getPickedList(c).size();
				}
			}
			return pickedCnt == 0;
		}
	}

	/**
	 * [MA_MABCL0030_Del01]の定型処理のInnerClass
	 */
	protected class MA_MABCL0030_Del01Caller<P extends MABCP_MultiReg, B extends MA_MABCL0030_Del01Bridge> extends mcframe.clientMAUD.MAUDP1020.MAUDP_LCLRLDeleter<P, B> {

		protected MA_MABCL0030_Del01Caller(P p, B b) {
			super(p, b);
		}

		@Override
		protected void setMode() {
			super.setMode();
			setColInvisible();
		}
	}


	/**
	 * Panel[DtlBtn]のボタン[select_all]の押下時の処理
	 */
	@Override
	public void doDtlBtn_select_all(MCEventInfo info) {
		doSelectAll(DtlTable);
	}
	/**
	 * Panel[DtlBtn]のボタン[deselect_all]の押下時の処理
	 */
	@Override
	public void doDtlBtn_deselect_all(MCEventInfo info) {
		doDeselectAll(DtlTable);
	}
	/**
	 * Panel[DtlBtn]のボタン[radd]の押下時の処理
	 */
	@Override
	public void doDtlBtn_radd(MCEventInfo info) {
		insertRow(DtlTable);
	}
	/**
	 * Panel[DtlBtn]のボタン[rdel]の押下時の処理
	 */
	@Override
	public void doDtlBtn_rdel(MCEventInfo info) {
		deleteRow(DtlTable);
	}
	/**
	 * Panel[DtlBtn]のボタン[rcopy]の押下時の処理
	 */
	@Override
	public void doDtlBtn_rcopy(MCEventInfo info) {
		copyRow(DtlTable);
	}
	/**
	 * Panel[LclBtn]のボタン[select_all]の押下時の処理
	 */
	@Override
	public void doLclBtn_select_all(MCEventInfo info) {
		doSelectAll(LclTable);
	}
	/**
	 * Panel[LclBtn]のボタン[deselect_all]の押下時の処理
	 */
	@Override
	public void doLclBtn_deselect_all(MCEventInfo info) {
		doDeselectAll(LclTable);
	}
	/**
	 * Panel[LclBtn]のボタン[radd]の押下時の処理
	 */
	@Override
	public void doLclBtn_radd(MCEventInfo info) {
		insertRow(LclTable);
	}
	/**
	 * Panel[LclBtn]のボタン[rdel]の押下時の処理
	 */
	@Override
	public void doLclBtn_rdel(MCEventInfo info) {
		deleteRow(LclTable);
	}
	/**
	 * Panel[LclBtn]のボタン[rcopy]の押下時の処理
	 */
	@Override
	public void doLclBtn_rcopy(MCEventInfo info) {
		copyRow(LclTable);
	}

	// -- 個別実装　（ここから）

	@Override
	protected void valueInit() {
		super.valueInit();
		getCndR().match_typ(Cnd_match_typ_1.getActionCommand());
	}

	@Override
	public void mcInitStatus() {
		super.mcInitStatus();
		setColInvisible();
	}

	@Override
	public void doDtl_bank_ac_bank_cd_LC(MCEventInfo info) {
		super.doDtl_bank_ac_bank_cd_LC(info);
		setValueEx(columnDtl_bank_ac_branch_cd, info.getEventIndex(), null);
	}
	@Override
	public boolean doCnd_mst_nm_VC(MCEventInfo info) {
		if (!checkAllTableClear()) {
			return false;
		}
		return super.doCnd_mst_nm_VC(info);
	}
	
	@Override
	protected void setStatusByOpe() {
		if (isNull(getCndR().mst_nm())) {
			// マスタが未入力の場合は入力不可
			setFIXStatus();
		}
		else {
			super.setStatusByOpe();
		}
		setColInvisible();
	}

	/**
	 * マスタ名に設定されたマスタ以外の項目を非表示にする
	 */
	protected void setColInvisible() {
		Map<String, String> map = DtlR.create().getExtMap("VISIBLE");
		for(String key : map.keySet()) {
			if (!isSame(map.get(key), getCndR().mst_nm())) {
				DtlTable.getColumnConfig("Dtl."+key).setMode(MCMode.INVISIBLE);
			}
		}
		DtlTable.adjustWidth();

		map = LclR.create().getExtMap("VISIBLE");
		for(String key : map.keySet()) {
			if (!isSame(map.get(key), getCndR().mst_nm())) {
				LclTable.getColumnConfig("Lcl."+key).setMode(MCMode.INVISIBLE);
			}
		}
		LclTable.adjustWidth();

		// 検索・実行・削除ボタンも非表示
		for (String grp : new String[]{"srch","upd","del"}) {
			for (MCButton b : getButtons(grp)) {
				if (isNull(getCndR().mst_nm()) || !b.getACType().endsWith(getCndR().mst_nm().toLowerCase())) {
					b.setMode(MCMode.INVISIBLE);
				}
			}
		}

		// インフォメーションも非表示
		if (isNull(getCndR().mst_nm()) || (
			!isSame(getCndR().mst_nm(), "LG_GRP") &&
			!isSame(getCndR().mst_nm(), "ALLOC_GRP") &&
			!isSame(getCndR().mst_nm(), "WG"))) {

			Btn_inf_lbl.setMode(MCMode.INVISIBLE);
		}
	}

	@Override
	public java.lang.String[] getLclRKeyColumns() {
		Map<String, String> map = LclR.create().getExtMap("VISIBLE");
		List<String> l = new ArrayList<String>();
		for (String key : super.getLclRKeyColumns()) {
			if (isSame(key, LclR.$lcl_cd) || isSame(map.get(key), getCndR().mst_nm())) {
				l.add(key);
			}
		}
		return l.toArray(new String[0]);
	}

	@Override
	protected MCButton getSrchButton() {
		List<MCButton> l = getButtons("srch");
		if (!l.isEmpty() && getCndR().mst_nm() != null) {
			for (MCButton b : l) {
				if (b.getACType().endsWith(getCndR().mst_nm().toLowerCase())) {
					return b;
				}
			}
		}
		return null;
	}
	@Override
	protected MCButton getUpdButton() {
		List<MCButton> l = getButtons("upd");
		if (!l.isEmpty() && getCndR().mst_nm() != null) {
			for (MCButton b : l) {
				if (!b.getACType().startsWith("upd_admin")
						&& b.getACType().startsWith("upd")
						&& b.getACType().endsWith(getCndR().mst_nm().toLowerCase())) {
					return b;
				}
			}
		}
		return null;
	}
	@Override
	protected MCButton getUpdAdminButton() {
		List<MCButton> l = getButtons("upd");
		if (!l.isEmpty() && getCndR().mst_nm() != null) {
			for (MCButton b : l) {
				if (b.getACType().startsWith("upd_admin")
						&& b.getACType().endsWith(getCndR().mst_nm().toLowerCase())) {
					return b;
				}
			}
		}
		return null;
	}
	@Override
	protected MCButton getDelButton() {
		List<MCButton> l = getButtons("del");
		if (!l.isEmpty() && getCndR().mst_nm() != null) {
			for (MCButton b : l) {
				if (b.getACType().endsWith(getCndR().mst_nm().toLowerCase())) {
					return b;
				}
			}
		}
		return null;
	}

	@Override
	public void doCnd_mst_nm_LC(MCEventInfo info) {
		super.doCnd_mst_nm_LC(info);

		getCndR().mst_set_typ_nm(getRLUtil().getMstSetTypNm(MAC_MST_NM.getNE(getCndR().mst_nm())));

		clearAll();
		setStatusByOpe();
		refreshTitle();
	}

	/**
	 * タイトルバーの内容を更新する
	 */
	protected void refreshTitle() {
		setFrameTitle(getTitle());
	}
	@Override
	public String getTitle() {
		String s = super.getTitle();
		if (getCndR().mst_nm_nm() != null) {
			return s.replaceAll(getScreenName(), getScrNm());
		}
		return s;
	}
	@Override
	public String getWindowMenuScreenName() {
		String menuStr = getScrNm();
		if (menuStr.length() > 50) {
			menuStr = menuStr.substring(0, 50);
		}
		return menuStr;
	}
	/**
	 * タイトルバーに表示する画面名の取得
	 */
	protected String getScrNm() {
		if (isNull(getCndR().mst_nm_nm())) {
			return getScreenName();
		}
		String scrNm = getScreenName() + " - " + getCndR().mst_nm_nm();
		return scrNm;
	}
	
	@Override
	public void doDtl_loc_flg_NC(MCEventInfo info) {
		super.doDtl_loc_flg_NC(info);

		int idx = info.getEventIndex();
		DtlR r = getDtlL().get(idx);

		if (!r.loc_flg())  {
			setValueEx(columnDtl_lg_grp_wg_cd, idx, null);
			setValueEx(columnDtl_ship_slip_flg, idx, false);
			setValueEx(columnDtl_pick_list_flg, idx, false);
			setValueEx(columnDtl_ship_inst_flg, idx, false);
			setValueEx(columnDtl_ship_slip_act_flg, idx, false);
			setValueEx(columnDtl_lg_grp_cal_cd, idx, null);
			setValueEx(columnDtl_lg_grp_site_co_cd, idx, null);
			setValueEx(columnDtl_gi_minus_stk_chk_flg, idx, false);
			setValueEx(columnDtl_ship_loc_prio_flg, idx, false);
		}
	}
	
	@Override
	public void doDtl_mfg_flg_NC(MCEventInfo info) {
		super.doDtl_mfg_flg_NC(info);

		int idx = info.getEventIndex();
		DtlR r = getDtlL().get(idx);

		if (!r.mfg_flg())  {
			if (!r.lg_flg()) {
				setValueEx(columnDtl_mrp_prefix, idx, null);
				setValueEx(columnDtl_mrp_proc_typ, idx, null);
				setValueEx(columnDtl_alloc_margin_days, idx, null);
				setValueEx(columnDtl_mrp_alloc_margin_days, idx, null);
				setValueEx(columnDtl_mrp_opn_xfr_days, idx, null);
			}
			setValueEx(columnDtl_rqmt_typ, idx, null);
			setValueEx(columnDtl_prod_pln_typ, idx, null);
			setValueEx(columnDtl_mfg_inst_unit_typ, idx, null);
		}
	}
	
	@Override
	public void doDtl_lg_flg_NC(MCEventInfo info) {
		super.doDtl_lg_flg_NC(info);

		int idx = info.getEventIndex();
		DtlR r = getDtlL().get(idx);

		if (!r.lg_flg() && !r.mfg_flg())  {
			setValueEx(columnDtl_mrp_prefix, idx, null);
			setValueEx(columnDtl_mrp_proc_typ, idx, null);
			setValueEx(columnDtl_alloc_margin_days, idx, null);
			setValueEx(columnDtl_mrp_alloc_margin_days, idx, null);
			setValueEx(columnDtl_mrp_opn_xfr_days, idx, null);
		}
	}

	@Override
	public void doDtl_weekly_period_num_LC(MCEventInfo info) {
		super.doDtl_weekly_period_num_LC(info);

		int idx = info.getEventIndex();
		DtlR r = getDtlL().get(idx);

		if (!isNull(r.weekly_period_num())) {
			if (r.weekly_period_num().eq(0)) {
				setValueEx(columnDtl_weekly_period_st, idx, MCNumber.ONE);
			}
			else if (r.weekly_period_num().gte(1)) {
				setValueEx(columnDtl_tendays_period_num, idx, MCNumber.ZERO);
				setValueEx(columnDtl_tendays_period_st, idx, MCNumber.ONE);
			}
		}
	}
	
	@Override
	public void doDtl_tendays_period_num_LC(MCEventInfo info) {
		super.doDtl_tendays_period_num_LC(info);

		int idx = info.getEventIndex();
		DtlR r = getDtlL().get(idx);

		if (!isNull(r.tendays_period_num())) {
			if (r.tendays_period_num().eq(0)) {
				setValueEx(columnDtl_tendays_period_st, idx, MCNumber.ONE);
			}
			else if (r.tendays_period_num().gte(1)) {
				setValueEx(columnDtl_weekly_period_num, idx, MCNumber.ZERO);
				setValueEx(columnDtl_weekly_period_st, idx, MCNumber.ONE);
			}
		}
	}

	@Override
	public void doDtl_monthly_period_num_LC(MCEventInfo info) {
		super.doDtl_monthly_period_num_LC(info);

		int idx = info.getEventIndex();
		DtlR r = getDtlL().get(idx);

		if (!isNull(r.monthly_period_num())) {
			if (r.monthly_period_num().eq(0)) {
				setValueEx(columnDtl_monthly_period_st, idx, MCNumber.ONE);
			}
		}
	}

	@Override
	public void doDtl_trd_ptn_typ_LC(MCEventInfo info) {
		super.doDtl_trd_ptn_typ_LC(info);

		int idx = info.getEventIndex();
		DtlR r = getDtlL().get(idx);

		if (isNull(r.trd_ptn_typ()) || !MAC_TRD_PTN_TYP.get(r.trd_ptn_typ()).is_ac_rsn_req()) {
			setValueEx(columnDtl_trd_ac_rsn_cd, idx, null);
		}
		if (isNull(r.trd_ptn_typ()) || !MAC_TRD_PTN_TYP.get(r.trd_ptn_typ()).is_lot_slip_set()) {
			setValueEx(columnDtl_slip_each_lot_typ, idx, null);
		}
		if (isNull(r.trd_ptn_typ()) || !MAC_TRD_PTN_TYP.get(r.trd_ptn_typ()).is_slip_form_set()) {
			setValueEx(columnDtl_trd_slip_form_cd, idx, null);
		}
		if (isNull(r.trd_ptn_typ()) || !MAC_TRD_PTN_TYP.get(r.trd_ptn_typ()).is_ga_tgt_sls_slip()) {
			setValueEx(columnDtl_not_sls_slip_snd_flg, idx, false);
		}
		if (isNull(r.trd_ptn_typ()) || !MAC_TRD_PTN_TYP.get(r.trd_ptn_typ()).is_ga_tgt_purc_slip()) {
			setValueEx(columnDtl_not_purc_slip_snd_flg, idx, false);
		}
	}

	@Override
	public void doDtl_alloc_margin_days_LC(MCEventInfo info) {
		super.doDtl_alloc_margin_days_LC(info);

		int idx = info.getEventIndex();
		DtlR r = getDtlL().get(idx);

		if (isNull(r.alloc_margin_days()) || !r.alloc_margin_days().isNegative()) {
			setValueEx(columnDtl_not_xfr_flg, idx, false);
		}
	}

	@Override
	public MCList getDtl_ap_typ(MCRow row, MCEventInfo info) {
		row.setBooleanNE(MAC_AP_TYP.AP.key(), true);
		row.setBooleanNE(MAC_AP_TYP.AC.key(), true);
		return super.getDtl_ap_typ(row, info);
	}

	// ------------CellConfig------------
	@Override
	protected void setCellConfig() {
		super.setCellConfig();
		DtlTable.setCellConfig(createDtlConf());
	}

	protected MCCellConfig createDtlConf() {
		return new DtlConf(this);
	}
	
	public class DtlConf extends MAUDP_LCLRLBaseCellConfig {
		public DtlConf(MAUDP_LCLRLBase _panel) {
			super(_panel);
		}

		@Override
		public MCMode getPriorMode(int index, MCColumnConfig column, MCTable table) {
			if (table.getBaseTable() == DtlTable) {

				DtlR r = (DtlR) table.getBaseTable().getRow(index);
				
				if (getStatus() == UPD && isAdminCol(column)) {
					if (r.upd_cntr() != null) {
						if (!isEditableFlgColumn(column, r)) {
							return MCMode.READ_ONLY;
						}
					}
				}
				
				if (getStatus() == UPD || getStatus() == UPD_ADMIN) {
					if (column == columnDtl_lg_grp_wg_cd
					 || column == columnDtl_ship_slip_flg
					 || column == columnDtl_pick_list_flg
					 || column == columnDtl_ship_inst_flg
					 || column == columnDtl_ship_slip_act_flg
					 || column == columnDtl_lg_grp_site_co_cd
					 || column == columnDtl_gi_minus_stk_chk_flg
					 || column == columnDtl_ship_loc_prio_flg
					 || column == columnDtl_lg_grp_cal_cd) {
						if (!r.loc_flg()) {
							return MCMode.READ_ONLY;
						}
					}
					else if (column == columnDtl_mrp_prefix || column == columnDtl_mrp_proc_typ
							|| column == columnDtl_alloc_margin_days || column == columnDtl_mrp_alloc_margin_days
							|| column == columnDtl_mrp_opn_xfr_days) {
						if (!r.mfg_flg() && !r.lg_flg()) {
							return MCMode.READ_ONLY;
						}
					}
					else if (column == columnDtl_rqmt_typ || column == columnDtl_prod_pln_typ
							|| column == columnDtl_mfg_inst_unit_typ) {
						if (!r.mfg_flg()) {
							return MCMode.READ_ONLY;
						}
					}
					else if (column == columnDtl_weekly_period_num) {
						if (!isNull(r.tendays_period_num()) && r.tendays_period_num().gte(1)) {
							return MCMode.READ_ONLY;
						}
					}
					else if (column == columnDtl_weekly_period_st) {
						if (!isNull(r.weekly_period_num()) && r.weekly_period_num().eq(0)) {
							return MCMode.READ_ONLY;
						}
					}
					else if (column == columnDtl_tendays_period_num) {
						if (!isNull(r.weekly_period_num()) && r.weekly_period_num().gte(1)) {
							return MCMode.READ_ONLY;
						}
					}
					else if (column == columnDtl_tendays_period_st) {
						if (!isNull(r.tendays_period_num()) && r.tendays_period_num().eq(0)) {
							return MCMode.READ_ONLY;
						}
					}
					else if (column == columnDtl_monthly_period_st) {
						if (!isNull(r.monthly_period_num()) && r.monthly_period_num().eq(0)) {
							return MCMode.READ_ONLY;
						}
					}
					else if (column == columnDtl_trd_ac_rsn_cd) {
						if (isNull(r.trd_ptn_typ()) || !MAC_TRD_PTN_TYP.get(r.trd_ptn_typ()).is_ac_rsn_req()) {
							return MCMode.READ_ONLY;
						}
						else if (MAC_TRD_PTN_TYP.isTAX_DIFF_BILL_CL(r.trd_ptn_typ()) || MAC_TRD_PTN_TYP.isTAX_DIFF_PAY_SCHD_CL(r.trd_ptn_typ())) {
							return MCMode.ENABLE;
						}
					}
					else if (column == columnDtl_slip_each_lot_typ) {
						if (isNull(r.trd_ptn_typ()) || !MAC_TRD_PTN_TYP.get(r.trd_ptn_typ()).is_lot_slip_set()) {
							return MCMode.READ_ONLY;
						}
					}
					else if (column == columnDtl_trd_slip_form_cd) {
						if (isNull(r.trd_ptn_typ()) || !MAC_TRD_PTN_TYP.get(r.trd_ptn_typ()).is_slip_form_set()) {
							return MCMode.READ_ONLY;
						}
					}
					else if (column == columnDtl_not_sls_slip_snd_flg) {
						if (isNull(r.trd_ptn_typ()) || !MAC_TRD_PTN_TYP.get(r.trd_ptn_typ()).is_ga_tgt_sls_slip()) {
							return MCMode.READ_ONLY;
						}
					}
					else if (column == columnDtl_not_purc_slip_snd_flg) {
						if (isNull(r.trd_ptn_typ()) || !MAC_TRD_PTN_TYP.get(r.trd_ptn_typ()).is_ga_tgt_purc_slip()) {
							return MCMode.READ_ONLY;
						}
					}
					else if (column == columnDtl_not_xfr_flg) {
						if (isNull(r.alloc_margin_days()) || !r.alloc_margin_days().isNegative()) {
							return MCMode.READ_ONLY;
						}
					}

					if (getStatus() == UPD && !isNull(r.upd_cntr())) {
						if (column == columnDtl_slo_flg) {
							if (r.org_slo_flg()){
								return MCMode.READ_ONLY;
							}
						}
					}
				}
			}
			return super.getPriorMode(index, column, table);
		}

		protected boolean isAdminCol(MCColumnConfig column) {
			Map<String, String> adminMap = DtlR.create().getExtMap("ADMIN");
			return adminMap.containsKey(column.getBaseRowColumnName());
		}

		/**
		 * isAdminColかつ登録種別かつ登録済みのレコードで編集可能なカラムか判定する
		 * <P>
		 * ・検索結果＝オンのＦＬＧはオフにできない
		 * </P>
		 * 
		 * @param column 判定するカラム
		 * @param dtl Rowクラス
		 * @return 入力可能ならtrue
		 */
		protected boolean isEditableFlgColumn(MCColumnConfig column, DtlR dtl) {
			if ((column == columnDtl_sls_flg && !dtl.org_sls_flg())
					|| (column == columnDtl_lg_flg  && !dtl.org_lg_flg())
					|| (column == columnDtl_mfg_flg && !dtl.org_mfg_flg())
					|| (column == columnDtl_purc_flg && !dtl.org_purc_flg())
					|| (column == columnDtl_ar_flg && !dtl.org_ar_flg())
					|| (column == columnDtl_ap_flg && !dtl.org_ap_flg())
					|| (column == columnDtl_sd_flg && !dtl.org_sd_flg())
					|| (column == columnDtl_plm_flg && !dtl.org_plm_flg())
					) {
				return true;
			}
			return false;
		}
	}

	/**
	 * 他画面から呼び出された場合の初期化を実装します。<br>
	 * <P>
	 * <li>起動タイプ：T1 （通常の画面遷移）<br>
	 * バインド値 ＜必須＞<br>
	 * <table border = 1>
	 * <tr>
	 * <th>カラム名</th>
	 * <th>型</th>
	 * <th>備考</th>
	 * </tr>
	 * <tr>
	 * <td>mst_nm</td>
	 * <td>String</td>
	 * <td>必須</td>
	 * </tr>
	 * <tr>
	 * <td>srch_flg</td>
	 * <td>Boolean</td>
	 * <td>必須</td>
	 * </tr>
	 * </table><br>
	 * その他の引数：なし</li>
	 * <li>起動タイプ：X1 （メインメニューから起動）<br>
	 * バインド値：なし<br>
	 * その他の引数：mst_nm</li>
	 *
	 * @param openTyp 起動タイプ
	 * @param bind バインド値
	 * @pram args その他の引数
	 */
	@Override
	protected void initByScreenParam(String openTyp, MCRow bind, Object... args) {
		super.initByScreenParam(openTyp, bind, args);
		if(T1 == openTyp){
			valueInit();
			setValueEx(Cnd_mst_nm, bind.getStringNE("mst_nm"));
			if (bind.getBooleanNE("srch_flg")) {
				MCButton btn = getSrchButton();
				// ボタンがenable=権限ありなら検索実行
				if (btn != null && btn.isEnabled()) {
					addDoBehind(btn);
				}
			}
		}
		else if(isSame(openTyp, "X1")){
			valueInit();
			if (args == null || args.length < 1) {
				return ;
			}
			String mstNm = (String)args[0];
			if (mstNm != null && Cnd_mst_nm.checkValue(mstNm).size() == 0) {
				Cnd_mst_nm.setValue(mstNm);
			}
		}
	}

}