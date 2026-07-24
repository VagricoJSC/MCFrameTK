package mcframe.serverMAUA.MAUAL0010;

import static mcframe.commonFXBA.FXBAC0020.FXBAC_ListLogicBase.$INPUT_VAL;
import static mcframe.commonMAUA.MAUAC0010.MAUAC_List.*;
import static mcframe.serverCore.queryapi.IFMCSQL.*;
import static mcframe.serverFXUC.FXUCL0010.FXUCL_DataUtil.*;
import static mcframe.serverMA.dbc.MABCFunction.*;
import static mcframe.serverMA.dbc.MABSFunction.*;
import static mcframe.serverMAUC.MAUCL0010.MAUCL_MCDataUtil.*;
import static mcframe.serverMAUC.MAUCL7080.MAUCL_DbUtil.*;

import java.util.ArrayList;
import java.util.function.Function;

import mcframe.commonCore.container.*;
import mcframe.commonCore.lang.MCBooleanUtil;
import mcframe.commonMA.constant.*;
import mcframe.serverCore.queryapi.MCQueryApiBuilder;
import mcframe.serverMA.dbc.*;
import mcframe.serverMAUC.MAUCL0020.MAUCL_AppSys;

abstract public class MAUAL_ListItmDtl_MC extends MAUAL_ListItm_MC {

	// -- ItmDtl:品目詳細 (START)
	protected Function<MCRow, Function<MCQueryApiBuilder, Function<MAM_ITM_DTL_R, Function<MCList<MAM_ITM_DTL_R>, MCList<MAM_ITM_DTL_R>>>>>
	_itmDtlSelect = (row) -> (builder) -> (t) -> (result) -> {
		MCList<MAM_ITM_DTL_R> tempList = result.clone();
		for (MCMainQuery query : getItmDtlSelectSqls(row)) {
			MCList<MAM_ITM_DTL_R> tempRslt = tempList.clone();
			query.executeQuery(row, tempRslt);
			if  (result.isEmpty()) {
				result = tempRslt;
			}
			else {
				result.addAll(tempRslt);
			}
		}

		// キャッシュから属性情報を取得・設定
		itmDtlSetDbcValues(row, result);

		return result;
	};

	@Override
	public MCList<MCRow> getItmDtl(MCRow row) {
		MCList<MAM_ITM_DTL_R> result = MCList.create(MAM_ITM_DTL_R.class);
		MAM_ITM_DTL_R t = MAM_ITM_DTL_R.create("T");
		MCQueryApiBuilder builder = MCQueryApiBuilder.create(t);

		getItmDtl_Set(row, builder, t, result);
		result = _itmDtlSelect.apply(row).apply(builder).apply(t).apply(result);
		MCList<? extends MCRow> down = getItmDtl_AfterSelect(row, builder, t, result);
		down = listlogicCommon_AfterSelect(row, result, down, "MA.MAUAL0010.ItmDtl");
		if (isNull(down)) return null;
		return getItmDtl_SubColumns(row, down);
	}

	@Override
	protected  void getItmDtl_Set(MCRow row, MCQueryApiBuilder builder, MAM_ITM_DTL_R t, MCList<?> result) {
		// out項目には存在するが、MAM_ITM_DTLに存在しない項目の追加
		result.addNumberColumn(ItmDtlCols.$o_wtax_rate);
		result.addNumberColumn(ItmDtlCols.$o_conts_qty);
		result.addNumberColumn(ItmDtlCols.$o_pay_crryovr_times);
		result.addNumberColumn(ItmDtlCols.$o_std_cont_fctr);
		result.addNumberColumn(ItmDtlCols.$o_cont_fctr_dec_place);
		result.addNumberColumn(ItmDtlCols.$o_dec_place);
		result.addNumberColumn(ItmDtlCols.$o_dim);
		result.addNumberColumn(ItmDtlCols.$o_wt);
		result.addNumberColumn(ItmDtlCols.$o_rqmt_rstr_qty);
		result.addNumberColumn(ItmDtlCols.$o_alloc_margin_days);
		result.addNumberColumn(ItmDtlCols.$o_mrp_alloc_margin_days);
		result.addNumberColumn(ItmDtlCols.$o_mrp_opn_xfr_days);
		result.addStringColumn(ItmDtlCols.$o_itm_alt_nm1);
		result.addStringColumn(ItmDtlCols.$o_itm_alt_nm2);
		result.addStringColumn(ItmDtlCols.$o_itm_alt_nm3);
		result.addStringColumn(ItmDtlCols.$o_itm_alt_nm4);
		result.addStringColumn(ItmDtlCols.$o_itm_typ);
		result.addStringColumn(ItmDtlCols.$o_itm_typ_d_cd);
		result.addStringColumn(ItmDtlCols.$o_itm_typ_d_nm);
		result.addStringColumn(ItmDtlCols.$o_stk_mng_typ);
		result.addStringColumn(ItmDtlCols.$o_asset_mng_typ);
		result.addStringColumn(ItmDtlCols.$o_purc_tax_cd);
		result.addStringColumn(ItmDtlCols.$o_prov_tax_cd);
		result.addStringColumn(ItmDtlCols.$o_zip_cd);
		result.addStringColumn(ItmDtlCols.$o_addr1);
		result.addStringColumn(ItmDtlCols.$o_addr2);
		result.addStringColumn(ItmDtlCols.$o_addr3);
		result.addStringColumn(ItmDtlCols.$o_addr4);
		result.addStringColumn(ItmDtlCols.$o_tel);
		result.addStringColumn(ItmDtlCols.$o_fax);
		result.addStringColumn(ItmDtlCols.$o_cur_cd);
		result.addStringColumn(ItmDtlCols.$o_cur_nm);
		result.addStringColumn(ItmDtlCols.$o_cntry_cd);
		result.addStringColumn(ItmDtlCols.$o_cntry_nm);
		result.addStringColumn(ItmDtlCols.$o_area_cd);
		result.addStringColumn(ItmDtlCols.$o_area_nm);
		result.addStringColumn(ItmDtlCols.$o_asst_dpt_cd);
		result.addStringColumn(ItmDtlCols.$o_sls_dpt_cd);
		result.addStringColumn(ItmDtlCols.$o_site_cd);
		result.addStringColumn(ItmDtlCols.$o_site_nm);
		result.addStringColumn(ItmDtlCols.$o_lg_grp_cd);
		result.addStringColumn(ItmDtlCols.$o_lg_grp_nm);
		result.addStringColumn(ItmDtlCols.$o_loc_grp_cd);
		result.addStringColumn(ItmDtlCols.$o_loc_grp_nm);
		result.addStringColumn(ItmDtlCols.$o_alloc_grp_cd);
		result.addStringColumn(ItmDtlCols.$o_alloc_grp_nm);
		result.addStringColumn(ItmDtlCols.$o_loc_cal_cd);
		result.addStringColumn(ItmDtlCols.$o_loc_mng_typ);
		result.addStringColumn(ItmDtlCols.$o_rsrc_cd1);
		result.addStringColumn(ItmDtlCols.$o_rsrc_cd2);
		result.addStringColumn(ItmDtlCols.$o_prnt_lcl_cd);
		result.addStringColumn(ItmDtlCols.$o_asppl_cd);
		result.addStringColumn(ItmDtlCols.$o_vmi_purc_dpt_cd);
		result.addStringColumn(ItmDtlCols.$o_mrkt_judg_role_cd);
		result.addStringColumn(ItmDtlCols.$o_po_print_cd);
		result.addStringColumn(ItmDtlCols.$o_sppl_ship_form_cd);
		result.addStringColumn(ItmDtlCols.$o_sppl_cntct_dpt);
		result.addStringColumn(ItmDtlCols.$o_sppl_cntct_psn);
		result.addStringColumn(ItmDtlCols.$o_sppl_cntct_psn_title);
		result.addStringColumn(ItmDtlCols.$o_purc_upri_req_typ);
		result.addStringColumn(ItmDtlCols.$o_purc_amt_rnd_typ);
		result.addStringColumn(ItmDtlCols.$o_purc_tax_rnd_typ);
		result.addStringColumn(ItmDtlCols.$o_purc_tax_calc_typ);
		result.addStringColumn(ItmDtlCols.$o_prov_rcv_typ);
		result.addStringColumn(ItmDtlCols.$o_prov_basis_typ);
		result.addStringColumn(ItmDtlCols.$o_prov_amt_rnd_typ);
		result.addStringColumn(ItmDtlCols.$o_prov_tax_rnd_typ);
		result.addStringColumn(ItmDtlCols.$o_prov_tax_calc_typ);
		result.addStringColumn(ItmDtlCols.$o_sppl_cal_cd);
		result.addStringColumn(ItmDtlCols.$o_sppl_tterm_cd1);
		result.addStringColumn(ItmDtlCols.$o_sppl_tterm_cd2);
		result.addStringColumn(ItmDtlCols.$o_sppl_tterm_cd3);
		result.addStringColumn(ItmDtlCols.$o_unit_cd);
		result.addStringColumn(ItmDtlCols.$o_unit_nm);
		result.addStringColumn(ItmDtlCols.$o_rnd_typ);
		result.addStringColumn(ItmDtlCols.$o_dim_unit_cd);
		result.addStringColumn(ItmDtlCols.$o_wt_unit_cd);
		result.addStringColumn(ItmDtlCols.$o_conts_unit_cd);
		result.addStringColumn(ItmDtlCols.$o_hs_cd);
		result.addStringColumn(ItmDtlCols.$o_itm_jnl_cd);
		result.addStringColumn(ItmDtlCols.$o_ac_itm_grp_cd);
		result.addStringColumn(ItmDtlCols.$o_ship_unit_cd);
		result.addStringColumn(ItmDtlCols.$o_mfg_unit_cd);
		result.addStringColumn(ItmDtlCols.$o_purc_unit_cd);
		result.addStringColumn(ItmDtlCols.$o_pckg_unit_cd);
		result.addStringColumn(ItmDtlCols.$o_lot_mng_typ);
		result.addStringColumn(ItmDtlCols.$o_lot_no_typ);
		result.addStringColumn(ItmDtlCols.$o_lot_no_ptn_cd);
		result.addStringColumn(ItmDtlCols.$o_sublot_mng_typ);
		result.addStringColumn(ItmDtlCols.$o_sublot_no_typ);
		result.addStringColumn(ItmDtlCols.$o_sublot_no_ptn_cd);
		result.addStringColumn(ItmDtlCols.$o_insp_bind_typ);
		result.addStringColumn(ItmDtlCols.$o_lmt_ctl_categ);
		result.addStringColumn(ItmDtlCols.$o_cont_fctr_unit_cd);
		result.addStringColumn(ItmDtlCols.$o_cont_fctr_rnd_typ);
		result.addStringColumn(ItmDtlCols.$o_sno1_mng_typ);
		result.addStringColumn(ItmDtlCols.$o_sno1_num_typ);
		result.addStringColumn(ItmDtlCols.$o_sno1_ptn_cd);
		result.addStringColumn(ItmDtlCols.$o_sno2_mng_typ);
		result.addStringColumn(ItmDtlCols.$o_sno2_num_typ);
		result.addStringColumn(ItmDtlCols.$o_sno2_ptn_cd);
		result.addStringColumn(ItmDtlCols.$o_sno3_mng_typ);
		result.addStringColumn(ItmDtlCols.$o_sno3_num_typ);
		result.addStringColumn(ItmDtlCols.$o_sno3_ptn_cd);
		result.addStringColumn(ItmDtlCols.$o_sno4_mng_typ);
		result.addStringColumn(ItmDtlCols.$o_sno4_num_typ);
		result.addStringColumn(ItmDtlCols.$o_sno4_ptn_cd);
		result.addStringColumn(ItmDtlCols.$o_mfg_inst_unit_typ);
		result.addStringColumn(ItmDtlCols.$o_mrp_proc_typ);
		result.addStringColumn(ItmDtlCols.$o_cntry_org_cd);
		result.addStringColumn(ItmDtlCols.$o_comp_spec_typ);
		result.addStringColumn(ItmDtlCols.$o_itm_spec_grp_cd);
		result.addStringColumn(ItmDtlCols.$o_slo_proc_typ);
		result.addStringColumn(ItmDtlCols.$o_ship_inst_typ);
		result.addStringColumn(ItmDtlCols.$o_itm_ship_grp_cd);
		result.addStringColumn(ItmDtlCols.$o_ship_valid_grp_cd);
		result.addStringColumn(ItmDtlCols.$o_ship_term_cd);
		result.addStringColumn(ItmDtlCols.$o_exim_xpns_typ);
		result.addBooleanColumn(ItmDtlCols.$o_sundry_itm_flg);
		result.addBooleanColumn(ItmDtlCols.$o_purc_upri_cng_flg);
		result.addBooleanColumn(ItmDtlCols.$o_prov_upri_cng_flg);
		result.addBooleanColumn(ItmDtlCols.$o_foreign_flg);
		result.addBooleanColumn(ItmDtlCols.$o_lg_def_flg);
		result.addBooleanColumn(ItmDtlCols.$o_pre_outsrc_act_flg);
		result.addBooleanColumn(ItmDtlCols.$o_ddlv_prov_insp_flg);
		result.addBooleanColumn(ItmDtlCols.$o_str_ln_tgt_flg);
		result.addBooleanColumn(ItmDtlCols.$o_alloc_lmt_flg);
		result.addBooleanColumn(ItmDtlCols.$o_gi_pack_xfer_flg);
		result.addBooleanColumn(ItmDtlCols.$o_gi_vmi_flg);
		result.addBooleanColumn(ItmDtlCols.$o_dscnt_itm_flg);
		result.addBooleanColumn(ItmDtlCols.$o_minus_stk_flg);
		result.addBooleanColumn(ItmDtlCols.$o_not_new_lot_flg);
		result.addBooleanColumn(ItmDtlCols.$o_gi_alloc_flg);
		result.addBooleanColumn(ItmDtlCols.$o_pack_alloc_flg);
		result.addBooleanColumn(ItmDtlCols.$o_bp_lot_flg);
		result.addBooleanColumn(ItmDtlCols.$o_skip_chk_ship_flg);
		result.addBooleanColumn(ItmDtlCols.$o_mrkt_judg_flg);
		result.addBooleanColumn(ItmDtlCols.$o_lmt_ctl_flg);
		result.addBooleanColumn(ItmDtlCols.$o_cont_fctr_flg);
		result.addBooleanColumn(ItmDtlCols.$o_slo_sno1_flg);
		result.addBooleanColumn(ItmDtlCols.$o_rqmt_sno1_flg);
		result.addBooleanColumn(ItmDtlCols.$o_slo_sno2_flg);
		result.addBooleanColumn(ItmDtlCols.$o_rqmt_sno2_flg);
		result.addBooleanColumn(ItmDtlCols.$o_slo_sno3_flg);
		result.addBooleanColumn(ItmDtlCols.$o_rqmt_sno3_flg);
		result.addBooleanColumn(ItmDtlCols.$o_slo_sno4_flg);
		result.addBooleanColumn(ItmDtlCols.$o_rqmt_sno4_flg);
		result.addBooleanColumn(ItmDtlCols.$o_inpt_itm_add_flg);
		result.addBooleanColumn(ItmDtlCols.$o_inpt_itm_del_flg);
		result.addBooleanColumn(ItmDtlCols.$o_sch_flg);
		result.addBooleanColumn(ItmDtlCols.$o_comp_rev_at_slo_flg);
		result.addBooleanColumn(ItmDtlCols.$o_comp_core_itm_flg);
		result.addBooleanColumn(ItmDtlCols.$o_slo_proc_flg);
		result.addBooleanColumn(ItmDtlCols.$o_ship_lot_back_stop_flg);
		result.addBooleanColumn(ItmDtlCols.$o_arr_skip_flg);
		result.addBooleanColumn(ItmDtlCols.$o_purc_dlv_slip_flg);
		result.addBooleanColumn(ItmDtlCols.$o_stk_lst_flg);
		result.addBooleanColumn(ItmDtlCols.$o_ver_flg);
		result.addBooleanColumn(ItmDtlCols.$o_subcon_flg);
		result.addBooleanColumn(ItmDtlCols.$o_wrk_po_flg);
		result.addBooleanColumn(ItmDtlCols.$o_wrk_ap_flg);
		result.addBooleanColumn(ItmDtlCols.$o_onr_prsppl_flg);
		result.addBooleanColumn(ItmDtlCols.$o_sppl_iv_flg);
		result.addBooleanColumn(ItmDtlCols.$o_prms_recv_flg);
		result.addBinaryColumn(ItmDtlCols.$o_th_image);
		result.addBooleanColumn(ItmDtlCols.$i_mfg_flg);
		result.addBooleanColumn(ItmDtlCols.$i_purc_flg);
		result.addBooleanColumn(ItmDtlCols.$i_outsrc_flg);
		result.addBooleanColumn(ItmDtlCols.$i_wg_xfr_flg);
		result.addBooleanColumn(_$asset_not_mng_flg);
		result.addBooleanColumn(ItmDtlCols.$o_repurc_obli_flg);
		result.addStringColumn(ItmDtlCols.$o_outsrc_upri_typ);
		
		// 直接入力時
		if (isInput(row)) {
			// 入力された値で絞り込む
			row.setStringNE("itm_cd", row.getStringNE($INPUT_VAL));
			return;
		}
		
		// 入力補助画面の検索条件
		row.setStringNE(ItmDtlCols.$i_wg_cd, getEditString(row, ItmDtlCols.$i_wg_cd));
		row.setStringNE(ItmDtlCols.$i_wg_nm, getEditString(row, ItmDtlCols.$i_wg_nm));
		row.setStringNE(ItmDtlCols.$i_itm_cd, getEditString(row, ItmDtlCols.$i_itm_cd));
		row.setStringNE(ItmDtlCols.$i_itm_sub1, getEditString(row, ItmDtlCols.$i_itm_sub1));
		row.setStringNE(ItmDtlCols.$i_itm_sub2, getEditString(row, ItmDtlCols.$i_itm_sub2));
		row.setStringNE(ItmDtlCols.$i_itm_sub3, getEditString(row, ItmDtlCols.$i_itm_sub3));
		row.setStringNE(ItmDtlCols.$i_itm_nm, getEditString(row, ItmDtlCols.$i_itm_nm));
		row.setStringNE(ItmDtlCols.$i_itm_alt_nm1, getEditString(row, ItmDtlCols.$i_itm_alt_nm1));
		row.setStringNE(ItmDtlCols.$i_itm_alt_nm2, getEditString(row, ItmDtlCols.$i_itm_alt_nm2));
		row.setStringNE(ItmDtlCols.$i_itm_alt_nm3, getEditString(row, ItmDtlCols.$i_itm_alt_nm3));
		row.setStringNE(ItmDtlCols.$i_itm_alt_nm4, getEditString(row, ItmDtlCols.$i_itm_alt_nm4));
		row.setStringNE(ItmDtlCols.$i_itm_typ, getEditString(row, ItmDtlCols.$i_itm_typ));
		row.setStringNE(ItmDtlCols.$i_itm_typ_d_cd, getEditString(row, ItmDtlCols.$i_itm_typ_d_cd));
		row.setStringNE(ItmDtlCols.$i_itm_typ_d_nm, getEditString(row, ItmDtlCols.$i_itm_typ_d_nm));
		row.setStringNE(ItmDtlCols.$i_stk_mng_typ, getEditString(row, ItmDtlCols.$i_stk_mng_typ));
		row.setStringNE(ItmDtlCols.$i_asset_mng_typ, getEditString(row, ItmDtlCols.$i_asset_mng_typ));
		row.setStringNE(ItmDtlCols.$i_site_cd, getEditString(row, ItmDtlCols.$i_site_cd));
		row.setStringNE(ItmDtlCols.$i_site_nm, getEditString(row, ItmDtlCols.$i_site_nm));
		row.setStringNE(ItmDtlCols.$i_lg_grp_cd, getEditString(row, ItmDtlCols.$i_lg_grp_cd));
		row.setStringNE(ItmDtlCols.$i_lg_grp_nm, getEditString(row, ItmDtlCols.$i_lg_grp_nm));
		row.setStringNE(ItmDtlCols.$i_alloc_grp_cd, getEditString(row, ItmDtlCols.$i_alloc_grp_cd));
		row.setStringNE(ItmDtlCols.$i_alloc_grp_nm, getEditString(row, ItmDtlCols.$i_alloc_grp_nm));
		row.setStringNE(ItmDtlCols.$i_loc_grp_cd, getEditString(row, ItmDtlCols.$i_loc_grp_cd));
		row.setStringNE(ItmDtlCols.$i_loc_grp_nm, getEditString(row, ItmDtlCols.$i_loc_grp_nm));
		row.setStringNE(ItmDtlCols.$i_loc_mng_typ, getEditString(row, ItmDtlCols.$i_loc_mng_typ));
		row.setStringNE(ItmDtlCols.$i_sppl_cd, getEditString(row, ItmDtlCols.$i_sppl_cd));
		row.setStringNE(ItmDtlCols.$i_sppl_nm, getEditString(row, ItmDtlCols.$i_sppl_nm));
		row.setStringNE(ItmDtlCols.$i_ein, getEditString(row, ItmDtlCols.$i_ein));
		row.setStringNE(ItmDtlCols.$i_sppl_alt_nm1, getEditString(row, ItmDtlCols.$i_sppl_alt_nm1));
		row.setStringNE(ItmDtlCols.$i_sppl_alt_nm2, getEditString(row, ItmDtlCols.$i_sppl_alt_nm2));
		row.setStringNE(ItmDtlCols.$i_sppl_alt_nm3, getEditString(row, ItmDtlCols.$i_sppl_alt_nm3));
		row.setStringNE(ItmDtlCols.$i_sppl_alt_nm4, getEditString(row, ItmDtlCols.$i_sppl_alt_nm4));
		row.setStringNE(ItmDtlCols.$i_cntry_cd, getEditString(row, ItmDtlCols.$i_cntry_cd));
		row.setStringNE(ItmDtlCols.$i_cntry_nm, getEditString(row, ItmDtlCols.$i_cntry_nm));
		row.setStringNE(ItmDtlCols.$i_area_cd, getEditString(row, ItmDtlCols.$i_area_cd));
		row.setStringNE(ItmDtlCols.$i_area_nm, getEditString(row, ItmDtlCols.$i_area_nm));
		row.setStringNE(ItmDtlCols.$i_itm_grp_cd1, getEditString(row, ItmDtlCols.$i_itm_grp_cd1));
		row.setStringNE(ItmDtlCols.$i_itm_grp_cd2, getEditString(row, ItmDtlCols.$i_itm_grp_cd2));
		row.setStringNE(ItmDtlCols.$i_itm_grp_cd3, getEditString(row, ItmDtlCols.$i_itm_grp_cd3));
		row.setStringNE(ItmDtlCols.$i_itm_grp_cd4, getEditString(row, ItmDtlCols.$i_itm_grp_cd4));
		row.setStringNE(ItmDtlCols.$i_itm_grp_cd5, getEditString(row, ItmDtlCols.$i_itm_grp_cd5));
		row.setStringNE(ItmDtlCols.$i_itm_grp_cd6, getEditString(row, ItmDtlCols.$i_itm_grp_cd6));
		row.setStringNE(ItmDtlCols.$i_itm_grp_cd7, getEditString(row, ItmDtlCols.$i_itm_grp_cd7));
		row.setStringNE(ItmDtlCols.$i_itm_grp_cd8, getEditString(row, ItmDtlCols.$i_itm_grp_cd8));
		row.setStringNE(ItmDtlCols.$i_itm_grp_cd9, getEditString(row, ItmDtlCols.$i_itm_grp_cd9));
		row.setStringNE(ItmDtlCols.$i_itm_grp_cd10, getEditString(row, ItmDtlCols.$i_itm_grp_cd10));
		row.setStringNE(ItmDtlCols.$i_itm_grp_nm1, getEditString(row, ItmDtlCols.$i_itm_grp_nm1));
		row.setStringNE(ItmDtlCols.$i_itm_grp_nm2, getEditString(row, ItmDtlCols.$i_itm_grp_nm2));
		row.setStringNE(ItmDtlCols.$i_itm_grp_nm3, getEditString(row, ItmDtlCols.$i_itm_grp_nm3));
		row.setStringNE(ItmDtlCols.$i_itm_grp_nm4, getEditString(row, ItmDtlCols.$i_itm_grp_nm4));
		row.setStringNE(ItmDtlCols.$i_itm_grp_nm5, getEditString(row, ItmDtlCols.$i_itm_grp_nm5));
		row.setStringNE(ItmDtlCols.$i_itm_grp_nm6, getEditString(row, ItmDtlCols.$i_itm_grp_nm6));
		row.setStringNE(ItmDtlCols.$i_itm_grp_nm7, getEditString(row, ItmDtlCols.$i_itm_grp_nm7));
		row.setStringNE(ItmDtlCols.$i_itm_grp_nm8, getEditString(row, ItmDtlCols.$i_itm_grp_nm8));
		row.setStringNE(ItmDtlCols.$i_itm_grp_nm9, getEditString(row, ItmDtlCols.$i_itm_grp_nm9));
		row.setStringNE(ItmDtlCols.$i_itm_grp_nm10, getEditString(row, ItmDtlCols.$i_itm_grp_nm10));
		row.setStringNE(ItmDtlCols.$i_sppl_grp_cd1, getEditString(row, ItmDtlCols.$i_sppl_grp_cd1));
		row.setStringNE(ItmDtlCols.$i_sppl_grp_cd2, getEditString(row, ItmDtlCols.$i_sppl_grp_cd2));
		row.setStringNE(ItmDtlCols.$i_sppl_grp_cd3, getEditString(row, ItmDtlCols.$i_sppl_grp_cd3));
		row.setStringNE(ItmDtlCols.$i_sppl_grp_cd4, getEditString(row, ItmDtlCols.$i_sppl_grp_cd4));
		row.setStringNE(ItmDtlCols.$i_sppl_grp_cd5, getEditString(row, ItmDtlCols.$i_sppl_grp_cd5));
		row.setStringNE(ItmDtlCols.$i_sppl_grp_cd6, getEditString(row, ItmDtlCols.$i_sppl_grp_cd6));
		row.setStringNE(ItmDtlCols.$i_sppl_grp_cd7, getEditString(row, ItmDtlCols.$i_sppl_grp_cd7));
		row.setStringNE(ItmDtlCols.$i_sppl_grp_cd8, getEditString(row, ItmDtlCols.$i_sppl_grp_cd8));
		row.setStringNE(ItmDtlCols.$i_sppl_grp_cd9, getEditString(row, ItmDtlCols.$i_sppl_grp_cd9));
		row.setStringNE(ItmDtlCols.$i_sppl_grp_cd10, getEditString(row, ItmDtlCols.$i_sppl_grp_cd10));
		row.setStringNE(ItmDtlCols.$i_sppl_grp_nm1, getEditString(row, ItmDtlCols.$i_sppl_grp_nm1));
		row.setStringNE(ItmDtlCols.$i_sppl_grp_nm2, getEditString(row, ItmDtlCols.$i_sppl_grp_nm2));
		row.setStringNE(ItmDtlCols.$i_sppl_grp_nm3, getEditString(row, ItmDtlCols.$i_sppl_grp_nm3));
		row.setStringNE(ItmDtlCols.$i_sppl_grp_nm4, getEditString(row, ItmDtlCols.$i_sppl_grp_nm4));
		row.setStringNE(ItmDtlCols.$i_sppl_grp_nm5, getEditString(row, ItmDtlCols.$i_sppl_grp_nm5));
		row.setStringNE(ItmDtlCols.$i_sppl_grp_nm6, getEditString(row, ItmDtlCols.$i_sppl_grp_nm6));
		row.setStringNE(ItmDtlCols.$i_sppl_grp_nm7, getEditString(row, ItmDtlCols.$i_sppl_grp_nm7));
		row.setStringNE(ItmDtlCols.$i_sppl_grp_nm8, getEditString(row, ItmDtlCols.$i_sppl_grp_nm8));
		row.setStringNE(ItmDtlCols.$i_sppl_grp_nm9, getEditString(row, ItmDtlCols.$i_sppl_grp_nm9));
		row.setStringNE(ItmDtlCols.$i_sppl_grp_nm10, getEditString(row, ItmDtlCols.$i_sppl_grp_nm10));
		row.setStringNE(ItmDtlCols.$i_memo1, getEditString(row, ItmDtlCols.$i_memo1));
		row.setStringNE(ItmDtlCols.$i_memo2, getEditString(row, ItmDtlCols.$i_memo2));
		row.setStringNE(ItmDtlCols.$i_memo3, getEditString(row, ItmDtlCols.$i_memo3));
		row.setStringNE("mfg_loc_cd", getEditString(row, ItmDtlCols.$i_mfg_loc_cd));
		row.setStringNE("mfg_loc_nm", getEditString(row, ItmDtlCols.$i_mfg_loc_nm));
		row.setStringNE("rqst_loc_cd", getEditString(row, ItmDtlCols.$i_rqst_loc_cd));
		row.setStringNE("rqst_loc_nm", getEditString(row, ItmDtlCols.$i_rqst_loc_nm));
		row.setStringNE("o_own_cntry_cd", MAUCL_AppSys.getCo().cntry_cd());
		if (row.getBooleanNE(ItmDtlCols.$i_foreign_flg)) {
			// getCo(MCRow)と競合するため、MAUCL_AppSysをつける
			row.setStringNE("own_cntry_cd", MAUCL_AppSys.getCo().cntry_cd());
		}
	}

	@Override
	protected  MCList<?> getItmDtl_AfterSelect(MCRow row, MCQueryApiBuilder builder, MAM_ITM_DTL_R t, MCList<?> result) {
		MCList<?> l = super.getItmDtl_AfterSelect(row, builder, t, result);
		if (isInput(row)) {
			l = getItmDtl_NoDupList(row, result, l, ItmDtlCols.$o_itm_cd, "MA.MAUAL0010.ItmDtl");
		}
		// 区分名の設定
		l.addStringColumn(MAC_ITM_TYP.$NAME);
		l.addStringColumn(MAC_STK_MNG_TYP.$NAME);
		l.addStringColumn(MAC_ASSET_MNG_TYP.$NAME);
		l.addStringColumn(MAC_LOC_MNG_TYP.$NAME);
		MAC_ITM_TYP.putNameNE(l, MAC_ITM_TYP.$VALUE, MAC_ITM_TYP.$NAME);
		MAC_STK_MNG_TYP.putNameNE(l, MAC_STK_MNG_TYP.$VALUE, MAC_STK_MNG_TYP.$NAME);
		MAC_ASSET_MNG_TYP.putNameNE(l, MAC_ASSET_MNG_TYP.$VALUE, MAC_ASSET_MNG_TYP.$NAME);
		MAC_LOC_MNG_TYP.putNameNE(l, MAC_LOC_MNG_TYP.$VALUE, MAC_LOC_MNG_TYP.$NAME);
		return l;
	}

	/**
	 * 製造、購買、外注、ＷＧ間依頼ＦＬＧに応じたSELECT文を返します。
	 * ※getItmDtlSelect は対応するSQLをUNIONしたSQLを返すが、本メソッドはUNIONせず個々のSQLを返す
	 */
	protected MCMainQuery[] getItmDtlSelectSqls(MCRow row) {
		boolean isEveryFlagsFalse = false;
		if (!row.getBooleanNE(ItmDtlCols.$i_mfg_flg)
				&& !row.getBooleanNE(ItmDtlCols.$i_purc_flg)
				&& !row.getBooleanNE(ItmDtlCols.$i_outsrc_flg)
				&& !row.getBooleanNE(ItmDtlCols.$i_wg_xfr_flg)) {
			isEveryFlagsFalse = true;
		}

		MAVM_ITM_WG_R m3 = MAVM_ITM_WG_R.create("M3");
		MCPredicate sundryFlgCnd = null;
		if (row.getBooleanNE(ItmDtlCols.$i_sundry_itm_flg_on)
				&& row.getBooleanNE(ItmDtlCols.$i_sundry_itm_flg_off)) {
		}
		else if (row.getBooleanNE(ItmDtlCols.$i_sundry_itm_flg_on)) {
			sundryFlgCnd = makeEqVal(m3.sundry_itm_flg, true);
		}
		else if (row.getBooleanNE(ItmDtlCols.$i_sundry_itm_flg_off)) {
			sundryFlgCnd = makeEqVal(m3.sundry_itm_flg, false);
		}

		ArrayList<MCMainQuery> queries = new ArrayList<>();
		String logicName = "MA.MAUAL0010.ItmDtlSelectSqls";
		
		if (row.getBooleanNE(ItmDtlCols.$i_mfg_flg) || isEveryFlagsFalse) {
			// 製造フラグON
			MAVM_ITM_DTL_MFG_R itmDtlMfg = MAVM_ITM_DTL_MFG_R.create("m1");
			MAVM_WR_LOC_R wr_loc = MAVM_WR_LOC_R.create("M4");
			MCQueryApiBuilder builder = MCQueryApiBuilder.create(itmDtlMfg);
			// sql文を構築
			addSelectItmDtlMfg(builder);
			builder.addInnerJoin(wr_loc, 
					itmDtlMfg.mfg_loc_cd.eq(wr_loc.loc_cd).and(wr_loc.sppl_cd.isNull()));
			if (isInput(row) || isCombo(row)) {
				addWhereItmDtlMfgForDirectInpt(builder);
			}
			else {
				addJoinItmDtlMfgForInptAssist(builder, row);
				addSelectItmDtlMfgForInptAssist(builder);
			}
			if (sundryFlgCnd != null) {
				builder.addWhereWithAnd(sundryFlgCnd);
			}
			queries.add(builder.buildSelect(
					createSqlId(logicName, itmDtlMfg, "S01")));
		}
		if (row.getBooleanNE(ItmDtlCols.$i_purc_flg) || isEveryFlagsFalse) {
			// 購買フラグON
			MAVM_ITM_DTL_PURC_R itmDtlPurc = MAVM_ITM_DTL_PURC_R.create("m1");
			MCQueryApiBuilder builder = MCQueryApiBuilder.create(itmDtlPurc);
			MAM_BP_R bp = MAM_BP_R.create("M5");
			// sql文を構築
			addSelectItmDtlPurc(builder);
			if (isInput(row) || isCombo(row)) {
				addWhereItmDtlPurcForDirectInpt(builder);
			}
			else {
				addJoinItmDtlPurcForInptAssist(builder, row);
				addWhereItmDtlPurcForInptAssist(builder);
			}
			if (sundryFlgCnd != null) {
				builder.addWhereWithAnd(sundryFlgCnd);
			}
			queries.add(builder.buildSelect(
					createSqlId(logicName, itmDtlPurc, "S01")));

			MAVM_ITM_WG_R itmWg = MAVM_ITM_WG_R.create("m3");
			builder = MCQueryApiBuilder.create(itmWg);
			// sql文を構築
			addSelectItmWg(builder);
			builder.addLeftOuterJoin(bp, bp.bp_cd.like(bind("sppl_cd")));

			if (isInput(row) || isCombo(row)) {
				addWhereItmWgForDirectInpt(builder);
			}
			else {
				addJoinItmWgForInptAssist(builder, row);
				addWhereItmWgForInptAssist(builder);
			}
			if (sundryFlgCnd != null) {
				builder.addWhereWithAnd(sundryFlgCnd);
			}
			queries.add(builder.buildSelect(
					createSqlId(logicName, itmWg, "S01")));
		}
		if (row.getBooleanNE(ItmDtlCols.$i_outsrc_flg) || isEveryFlagsFalse) {
			// 外注フラグON
			MAVM_ITM_DTL_MFG_R itmDtlMfg = MAVM_ITM_DTL_MFG_R.create("m1");
			MAVM_WR_LOC_R wr_loc = MAVM_WR_LOC_R.create("M4");
			MAM_BP_R bp =  MAM_BP_R.create("M5");
			MCQueryApiBuilder builder = MCQueryApiBuilder.create(itmDtlMfg);
			// sql文を構築
			addSelectItmDtlMfgOutsrc(builder);
			builder.addInnerJoin(wr_loc, itmDtlMfg.mfg_loc_cd.eq(wr_loc.loc_cd));
			builder.addInnerJoin(bp, wr_loc.sppl_cd.eq(bp.bp_cd));
			if (isInput(row) || isCombo(row)) {
				addWhereItmDtlMfgOutsrcForDirectInpt(builder);
			}
			else {
				addJoinItmDtlMfgOutsrcForInptAssist(builder, row);
				addWhereItmDtlMfgOutsrcForInputAssist(builder);
			}
			if (sundryFlgCnd != null) {
				builder.addWhereWithAnd(sundryFlgCnd);
			}
			queries.add(builder.buildSelect(
					createSqlId(logicName, itmDtlMfg, "S01")));
		}
		if (row.getBooleanNE(ItmDtlCols.$i_wg_xfr_flg) || isEveryFlagsFalse) {
			// WG間輸送フラグON
			MAVM_ITM_DTL_RQST_R itmDtlRqst = MAVM_ITM_DTL_RQST_R.create("m1");
			MAM_LOC_R loc = MAM_LOC_R.create("M4");
			MCQueryApiBuilder builder = MCQueryApiBuilder.create(itmDtlRqst);
			// sql文を構築
			addSelectItmDtlRqst(builder);
			builder.addInnerJoin(loc, itmDtlRqst.rqst_loc_cd.eq(loc.loc_cd));
			if (isInput(row) || isCombo(row)) {
				addWhereItmDtlRqstForDirectInpt(builder);
			}
			else {
				addJoinItmDtlRqstForInptAssist(builder, row);
				addWhereItmDtlRqstForInptAssist(builder);
			}
			if (sundryFlgCnd != null) {
				builder.addWhereWithAnd(sundryFlgCnd);
			}
			queries.add(builder.buildSelect(
					createSqlId(logicName, itmDtlRqst, "S01")));
		}
		return queries.toArray(new MCMainQuery[queries.size()]);
	}

	/**
	 * 製造ＦＬＧに対応するSELECT句をbuilderに追加します。
	 * @param builder クエリAPIビルダー
	 */
	protected void addSelectItmDtlMfg(MCQueryApiBuilder builder) {
		
		MAVM_ITM_DTL_MFG_R m1 = (MAVM_ITM_DTL_MFG_R) builder.getBaseDbc();
		MAVM_WR_LOC_R m4 = MAVM_WR_LOC_R.create("M4");

		builder.addSelect(
				m1.wg_cd,
				nullValue().as("wg_nm"),
				m1.itm_cd,
				m1.itm_sub1,
				m1.itm_sub2,
				m1.itm_sub3,
				nullValue().as("itm_nm"),
				nullValue().as("itm_alt_nm1"),
				nullValue().as("itm_alt_nm2"),
				nullValue().as("itm_alt_nm3"),
				nullValue().as("itm_alt_nm4"),
				nullValue().as("itm_typ"),
				nullValue().as("itm_typ_d_cd"),
				nullValue().as("stk_mng_typ"),
				nullValue().as("asset_mng_typ"),
				value(false).as("sundry_itm_flg"),
				m1.mfg_loc_cd,
				m4.loc_nm.as("mfg_loc_nm"),
				m1.bom_ptn,
				m1.sppl_cd,
				nullValue().as("sppl_nm"),
				m1.maker_cd,
				m1.rqst_loc_cd,
				nullValue().as("rqst_loc_nm"),
				m1.st_dt,
				m1.end_dt,
				m1.oper_ptn,
				m1.mfg_lt,
				m1.mfg_lt_add_qty,
				m1.purc_lt,
				m1.purc_lt_add_qty,
				m1.accpt_insp_lt,
				m1.buf_lt,
				m1.ord_fix_pd,
				m1.sz_day_week_typ,
				m1.sz_week,
				m1.lot_sz_pd,
				m1.min_lot_qty,
				m1.batch_lot_qty,
				m1.max_lot_qty,
				m1.max_order,
				m1.prio,
				m1.order_ratio,
				m1.yield_schd_qty,
				m1.mfg_inst_qty,
				m1.fxd_rqmt_qty,
				m1.lot_issue_typ,
				m1.bkf_flg,
				m1.ln_stk_flg,
				m1.pre_po_tgt_flg,
				m1.inst_rec_issue_flg,
				m1.no_mfg_aprv_flg,
				m1.itm_lower_yield,
				m1.itm_std_yield,
				m1.itm_upper_yield,
				m1.purc_id_typ,
				m1.rqst_wg_cd,
				m1.rsrc_std_qty1,
				m1.rsrc_unit_qty1,
				m1.rsrc_std_qty2,
				m1.rsrc_unit_qty2,
				m1.sno1,
				m1.sno2,
				m1.sno3,
				m1.sno4,
				m1.not_mrp_flg,
				m1.memo1,
				m1.memo2,
				m1.memo3,
				m1.ins_ts,
				m1.upd_ts,
				nullValue().as("purc_tax_cd"),
				nullValue().as("prov_tax_cd"),
				MAPA_LOC$F_GET_LOC_ADDR(
					m1.mfg_loc_cd,
					bind("dt"),
					value(MAC_LOC_ADDR_TYP.ZIP_CD.value()),
					nullValue()
				).as("zip_cd"),
				MAPA_LOC$F_GET_LOC_ADDR(
					m1.mfg_loc_cd,
					bind("dt"),
					value(MAC_LOC_ADDR_TYP.ADDR1.value()),
					nullValue()
				).as("addr1"),
				MAPA_LOC$F_GET_LOC_ADDR(
					m1.mfg_loc_cd,
					bind("dt"),
					value(MAC_LOC_ADDR_TYP.ADDR2.value()),
					nullValue()
				).as("addr2"),
				MAPA_LOC$F_GET_LOC_ADDR(
					m1.mfg_loc_cd,
					bind("dt"),
					value(MAC_LOC_ADDR_TYP.ADDR3.value()),
					nullValue()
				).as("addr3"),
				MAPA_LOC$F_GET_LOC_ADDR(
					m1.mfg_loc_cd,
					bind("dt"),
					value(MAC_LOC_ADDR_TYP.ADDR4.value()),
					nullValue()
				).as("addr4"),
				MAPA_LOC$F_GET_LOC_ADDR(
					m1.mfg_loc_cd,
					bind("dt"),
					value(MAC_LOC_ADDR_TYP.TEL.value()),
					nullValue()
				).as("tel"),
				MAPA_LOC$F_GET_LOC_ADDR(
					m1.mfg_loc_cd,
					bind("dt"),
					value(MAC_LOC_ADDR_TYP.FAX.value()),
					nullValue()
				).as("fax"),
				value(false).as("purc_upri_cng_flg"),
				value(false).as("prov_upri_cng_flg"),
				nullValue().as("cur_cd"),
				nullValue().as("cntry_cd"),
				value(false).as("foreign_flg"),
				nullValue().as("area_cd"),
				MAPA_LOC$F_GET_ASST_DPT_CD_NE(
					m1.mfg_loc_cd,
					bind("dt"),
					value(false)
				).as("asst_dpt_cd"),
				MAPA_LOC$F_GET_SLS_DPT_CD_NE(
					m1.mfg_loc_cd,
					bind("dt"),
					value(false)
				).as("sls_dpt_cd"),
				m4.site_cd,
				m4.lg_grp_cd,
				m4.lg_def_flg,
				m4.loc_grp_cd,
				m4.alloc_grp_cd,
				m4.pre_outsrc_act_flg,
				m4.ddlv_prov_insp_flg,
				m4.cal_cd.as("loc_cal_cd"),
				m4.loc_mng_typ,
				m4.str_ln_tgt_flg,
				m4.alloc_lmt_flg,
				m4.gi_pack_xfer_flg,
				m4.gi_vmi_flg,
				m4.rsrc_cd1,
				m4.rsrc_cd2,
				nullValue().as("prnt_lcl_cd"),
				nullValue().as("asppl_cd"),
				nullValue().as("vmi_purc_dpt_cd"),
				value(false).as("subcon_flg"),
				nullValue().as("po_print_cd"),
				nullValue().as("sppl_ship_form_cd"),
				nullValue().as("pay_crryovr_times"),
				nullValue().as("sppl_cntct_dpt"),
				nullValue().as("sppl_cntct_psn"),
				nullValue().as("sppl_cntct_psn_title"),
				nullValue().as("purc_upri_req_typ"),
				nullValue().as("purc_amt_rnd_typ"),
				nullValue().as("purc_tax_rnd_typ"),
				nullValue().as("purc_tax_calc_typ"),
				value(false).as("wrk_po_flg"),
				value(false).as("wrk_ap_flg"),
				nullValue().as("prov_rcv_typ"),
				value(false).as("onr_prsppl_flg"),
				nullValue().as("prov_basis_typ"),
				nullValue().as("prov_amt_rnd_typ"),
				nullValue().as("prov_tax_rnd_typ"),
				nullValue().as("prov_tax_calc_typ"),
				nullValue().as("sppl_cal_cd"),
				value(false).as("sppl_iv_flg"),
				value(false).as("prms_recv_flg"),
				nullValue().as("sppl_tterm_cd1"),
				nullValue().as("sppl_tterm_cd2"),
				nullValue().as("sppl_tterm_cd3"),
				value(false).as("dscnt_itm_flg"),
				nullValue().as("unit_cd"),
				nullValue().as("unit_nm"),
				nullValue().as("dec_place"),
				nullValue().as("rnd_typ"),
				nullValue().as("dim_unit_cd"),
				nullValue().as("dim"),
				nullValue().as("wt_unit_cd"),
				nullValue().as("wt"),
				nullValue().as("conts_unit_cd"),
				nullValue().as("conts_qty"),
				nullValue().as("hs_cd"),
				nullValue().as("itm_jnl_cd"),
				nullValue().as("ac_itm_grp_cd"),
				value(false).as("minus_stk_flg"),
				value(false).as("not_new_lot_flg"),
				value(false).as("gi_alloc_flg"),
				MAPA_TAX$F_GET_WTAX_RATE(
					m1.itm_cd,
					m1.itm_sub1,
					m1.itm_sub2,
					m1.itm_sub3,
					bind("dt")
				).as("wtax_rate"),
				nullValue().as("ship_unit_cd"),
				nullValue().as("mfg_unit_cd"),
				nullValue().as("purc_unit_cd"),
				nullValue().as("pckg_unit_cd"),
				value(false).as("pack_alloc_flg"),
				nullValue().as("lot_mng_typ"),
				nullValue().as("lot_no_typ"),
				nullValue().as("lot_no_ptn_cd"),
				nullValue().as("sublot_mng_typ"),
				nullValue().as("sublot_no_typ"),
				nullValue().as("sublot_no_ptn_cd"),
				value(false).as("bp_lot_flg"),
				nullValue().as("insp_bind_typ"),
				value(false).as("skip_chk_ship_flg"),
				value(false).as("mrkt_judg_flg"),
				nullValue().as("mrkt_judg_role_cd"),
				value(false).as("lmt_ctl_flg"),
				nullValue().as("lmt_ctl_categ"),
				value(false).as("cont_fctr_flg"),
				nullValue().as("std_cont_fctr"),
				nullValue().as("cont_fctr_unit_cd"),
				nullValue().as("cont_fctr_unit_nm"),
				nullValue().as("cont_fctr_rnd_typ"),
				nullValue().as("cont_fctr_dec_place"),
				nullValue().as("sno1_mng_typ"),
				value(false).as("slo_sno1_flg"),
				value(false).as("rqmt_sno1_flg"),
				nullValue().as("sno1_num_typ"),
				nullValue().as("sno1_ptn_cd"),
				nullValue().as("sno2_mng_typ"),
				value(false).as("slo_sno2_flg"),
				value(false).as("rqmt_sno2_flg"),
				nullValue().as("sno2_num_typ"),
				nullValue().as("sno2_ptn_cd"),
				nullValue().as("sno3_mng_typ"),
				value(false).as("slo_sno3_flg"),
				value(false).as("rqmt_sno3_flg"),
				nullValue().as("sno3_num_typ"),
				nullValue().as("sno3_ptn_cd"),
				nullValue().as("sno4_mng_typ"),
				value(false).as("slo_sno4_flg"),
				value(false).as("rqmt_sno4_flg"),
				nullValue().as("sno4_num_typ"),
				nullValue().as("sno4_ptn_cd"),
				nullValue().as("mfg_inst_unit_typ"),
				nullValue().as("mrp_proc_typ"),
				nullValue().as("alloc_margin_days"),
				nullValue().as("mrp_alloc_margin_days"),
				nullValue().as("rqmt_rstr_qty"),
				value(false).as("inpt_itm_add_flg"),
				value(false).as("inpt_itm_del_flg"),
				value(false).as("sch_flg"),
				nullValue().as("cntry_org_cd"),
				nullValue().as("comp_spec_typ"),
				value(false).as("comp_rev_at_slo_flg"),
				value(false).as("comp_core_itm_flg"),
				nullValue().as("itm_spec_grp_cd"),
				value(false).as("slo_proc_flg"),
				nullValue().as("slo_proc_typ"),
				nullValue().as("ship_inst_typ"),
				value(false).as("ship_lot_back_stop_flg"),
				nullValue().as("itm_ship_grp_cd"),
				nullValue().as("ship_valid_grp_cd"),
				value(false).as("arr_skip_flg"),
				value(false).as("purc_dlv_slip_flg"),
				nullValue().as("ship_term_cd"),
				nullValue().as("exim_xpns_typ"),
				value(false).as("stk_lst_flg"),
				value(false).as("ver_flg"),
				nullValue().as("th_image"),
				nullValue().as("mrp_opn_xfr_days"),
				nullValue().as("itm_typ_d_nm"),
				nullValue().as("maker_nm"),
				nullValue().as("site_nm"),
				nullValue().as("loc_grp_nm"),
				nullValue().as("alloc_grp_nm"),
				nullValue().as("lg_grp_nm"),
				nullValue().as("cur_nm"),
				nullValue().as("cntry_nm"),
				nullValue().as("area_nm"),
				value(true).as("mfg_flg"),
				value(false).as("repurc_obli_flg"),
				nullValue().as("outsrc_upri_typ")
		);
	}

	/**
	 * 製造ＦＬＧに対応する結合条件（JOIN句）をbuilderに追加します。
	 * @param builder クエリAPIビルダー
	 * @param row バインド値を格納したrow
	 */
	protected void addJoinItmDtlMfgForInptAssist(MCQueryApiBuilder builder, MCRow row) {
		
		MAVM_ITM_DTL_MFG_R m1 = (MAVM_ITM_DTL_MFG_R) builder.getBaseDbc();
		MAM_WG_R m2 = MAM_WG_R.create("M2");
		MAVM_ITM_WG_R m3 = MAVM_ITM_WG_R.create("M3");
		MAVM_WR_LOC_R m4 = MAVM_WR_LOC_R.create("M4");
		MAM_ITM_TYP_D_R m10 = MAM_ITM_TYP_D_R.create("M10");
		MAM_SITE_R m11 = MAM_SITE_R.create("M11");
		MAM_LOC_GRP_R m12 = MAM_LOC_GRP_R.create("M12");
		MAM_ALLOC_GRP_R m13 = MAM_ALLOC_GRP_R.create("M13");
		MAM_LG_GRP_R m14 = MAM_LG_GRP_R.create("M14");
		MAM_ITM_GRP_R m20 = MAM_ITM_GRP_R.create("M20");
		MAM_ITM_GRP_R m21 = MAM_ITM_GRP_R.create("M21");
		MAM_ITM_GRP_R m22 = MAM_ITM_GRP_R.create("M22");
		MAM_ITM_GRP_R m23 = MAM_ITM_GRP_R.create("M23");
		MAM_ITM_GRP_R m24 = MAM_ITM_GRP_R.create("M24");
		MAM_ITM_GRP_R m25 = MAM_ITM_GRP_R.create("M25");
		MAM_ITM_GRP_R m26 = MAM_ITM_GRP_R.create("M26");
		MAM_ITM_GRP_R m27 = MAM_ITM_GRP_R.create("M27");
		MAM_ITM_GRP_R m28 = MAM_ITM_GRP_R.create("M28");
		MAM_ITM_GRP_R m29 = MAM_ITM_GRP_R.create("M29");

		builder.addInnerJoin(m2, m1.wg_cd.eq(m2.wg_cd));
		builder.addInnerJoin(m3,
				m1.itm_cd.eq(m3.itm_cd)
				.and(m1.itm_sub1.eq(m3.itm_sub1))
				.and(m1.itm_sub2.eq(m3.itm_sub2))
				.and(m1.itm_sub3.eq(m3.itm_sub3))
				.and(m1.wg_cd.eq(m3.wg_cd)));
		builder.addLeftOuterJoin(m10,
				m3.itm_typ.eq(m10.itm_typ)
				.and(m3.itm_typ_d_cd.eq(m10.itm_typ_d_cd)));
		builder.addLeftOuterJoin(m11, m4.site_cd.eq(m11.site_cd));
		builder.addLeftOuterJoin(m12, m4.loc_grp_cd.eq(m12.loc_grp_cd));
		builder.addLeftOuterJoin(m13, m4.alloc_grp_cd.eq(m13.alloc_grp_cd));
		builder.addLeftOuterJoin(m14, m4.lg_grp_cd.eq(m14.lg_grp_cd));
		if (!isNull(row.getStringNE(ItmDtlCols.$i_itm_grp_nm1))) {
			builder.addInnerJoin(m20,
					m20.itm_grp_typ.eq(value(MAC_ITM_GRP_TYP.GRP1.value()))
					.and(m3.itm_grp_cd1.eq(m20.itm_grp_cd))
					.and(m20.itm_grp_nm.like(bind(ItmDtlCols.$i_itm_grp_nm1))));
		}
		if (!isNull(row.getStringNE(ItmDtlCols.$i_itm_grp_nm2))) {
			builder.addInnerJoin(m21,
					m21.itm_grp_typ.eq(value(MAC_ITM_GRP_TYP.GRP2.value()))
					.and(m3.itm_grp_cd2.eq(m21.itm_grp_cd))
					.and(m21.itm_grp_nm.like(bind(ItmDtlCols.$i_itm_grp_nm2))));
		}
		if (!isNull(row.getStringNE(ItmDtlCols.$i_itm_grp_nm3))) {
			builder.addInnerJoin(m22,
					m22.itm_grp_typ.eq(value(MAC_ITM_GRP_TYP.GRP3.value()))
					.and(m3.itm_grp_cd3.eq(m22.itm_grp_cd))
					.and(m22.itm_grp_nm.like(bind(ItmDtlCols.$i_itm_grp_nm3))));
		}
		if (!isNull(row.getStringNE(ItmDtlCols.$i_itm_grp_nm4))) {
			builder.addInnerJoin(m23,
					m23.itm_grp_typ.eq(value(MAC_ITM_GRP_TYP.GRP4.value()))
					.and(m3.itm_grp_cd4.eq(m23.itm_grp_cd))
					.and(m23.itm_grp_nm.like(bind(ItmDtlCols.$i_itm_grp_nm4))));
		}
		if (!isNull(row.getStringNE(ItmDtlCols.$i_itm_grp_nm5))) {
			builder.addInnerJoin(m24,
					m24.itm_grp_typ.eq(value(MAC_ITM_GRP_TYP.GRP5.value()))
					.and(m3.itm_grp_cd5.eq(m24.itm_grp_cd))
					.and(m24.itm_grp_nm.like(bind(ItmDtlCols.$i_itm_grp_nm5))));
		}
		if (!isNull(row.getStringNE(ItmDtlCols.$i_itm_grp_nm6))) {
			builder.addInnerJoin(m25,
					m25.itm_grp_typ.eq(value(MAC_ITM_GRP_TYP.GRP6.value()))
					.and(m3.itm_grp_cd6.eq(m25.itm_grp_cd))
					.and(m25.itm_grp_nm.like(bind(ItmDtlCols.$i_itm_grp_nm6))));
		}
		if (!isNull(row.getStringNE(ItmDtlCols.$i_itm_grp_nm7))) {
			builder.addInnerJoin(m26,
					m26.itm_grp_typ.eq(value(MAC_ITM_GRP_TYP.GRP7.value()))
					.and(m3.itm_grp_cd7.eq(m26.itm_grp_cd))
					.and(m26.itm_grp_nm.like(bind(ItmDtlCols.$i_itm_grp_nm7))));
		}
		if (!isNull(row.getStringNE(ItmDtlCols.$i_itm_grp_nm8))) {
			builder.addInnerJoin(m27,
					m27.itm_grp_typ.eq(value(MAC_ITM_GRP_TYP.GRP8.value()))
					.and(m3.itm_grp_cd8.eq(m27.itm_grp_cd))
					.and(m27.itm_grp_nm.like(bind(ItmDtlCols.$i_itm_grp_nm8))));
		}
		if (!isNull(row.getStringNE(ItmDtlCols.$i_itm_grp_nm9))) {
			builder.addInnerJoin(m28,
					m28.itm_grp_typ.eq(value(MAC_ITM_GRP_TYP.GRP9.value()))
					.and(m3.itm_grp_cd9.eq(m28.itm_grp_cd))
					.and(m28.itm_grp_nm.like(bind(ItmDtlCols.$i_itm_grp_nm9))));
		}
		if (!isNull(row.getStringNE(ItmDtlCols.$i_itm_grp_nm10))) {
			builder.addInnerJoin(m29,
					m29.itm_grp_typ.eq(value(MAC_ITM_GRP_TYP.GRP10.value()))
					.and(m3.itm_grp_cd10.eq(m29.itm_grp_cd))
					.and(m29.itm_grp_nm.like(bind(ItmDtlCols.$i_itm_grp_nm10))));
		}
	}

	/**
	 * 製造ＦＬＧに対応する直接入力条件（Where句）をbuilderに追加します。
	 * @param builder クエリAPIビルダー
	 */
	protected void addWhereItmDtlMfgForDirectInpt(MCQueryApiBuilder builder) {
		
		MAVM_ITM_DTL_MFG_R m1 = (MAVM_ITM_DTL_MFG_R) builder.getBaseDbc();

		builder.setWhere(value(0).eq(value(0)));
		builder.addWhereWithAnd(bind("dt").between(m1.st_dt, m1.end_dt));
		builder.addWhereWithCutOffAnd(m1.wg_cd.eq(bind("wg_cd")));
		builder.addWhereWithCutOffAnd(m1.itm_cd.eq(bind("itm_cd")));
		builder.addWhereWithCutOffAnd(m1.itm_sub1.eq(bind("itm_sub1")));
		builder.addWhereWithCutOffAnd(m1.itm_sub2.eq(bind("itm_sub2")));
		builder.addWhereWithCutOffAnd(m1.itm_sub3.eq(bind("itm_sub3")));
		builder.addWhereWithCutOffAnd(m1.mfg_loc_cd.eq(bind("mfg_loc_cd")));
		builder.addWhereWithCutOffAnd(nullValue().eq(bind("sppl_cd")));
	}

	/**
	 * 製造ＦＬＧに対応する入力補助条件（Where句）をbuilderに追加します。
	 * @param builder クエリAPIビルダー
	 */
	protected void addSelectItmDtlMfgForInptAssist(MCQueryApiBuilder builder) {
		
		MAVM_ITM_DTL_MFG_R m1 = (MAVM_ITM_DTL_MFG_R) builder.getBaseDbc();
		MAM_WG_R m2 = MAM_WG_R.create("M2");
		MAVM_ITM_WG_R m3 = MAVM_ITM_WG_R.create("M3");
		MAVM_WR_LOC_R m4 = MAVM_WR_LOC_R.create("M4");
		MAM_ITM_TYP_D_R m10 = MAM_ITM_TYP_D_R.create("M10");
		MAM_SITE_R m11 = MAM_SITE_R.create("M11");
		MAM_LOC_GRP_R m12 = MAM_LOC_GRP_R.create("M12");
		MAM_ALLOC_GRP_R m13 = MAM_ALLOC_GRP_R.create("M13");
		MAM_LG_GRP_R m14 = MAM_LG_GRP_R.create("M14");

		builder.setWhere(value(0).eq(value(0)));
		builder.addWhereWithAnd(bind("dt").between(m1.st_dt, m1.end_dt));
		builder.addWhereWithCutOffAnd(m1.wg_cd.like(bind("wg_cd")));
		builder.addWhereWithCutOffAnd(m2.wg_nm.like(bind("wg_nm")));
		builder.addWhereWithCutOffAnd(m1.itm_cd.like(bind("itm_cd")));
		builder.addWhereWithCutOffAnd(m1.itm_sub1.like(bind("itm_sub1")));
		builder.addWhereWithCutOffAnd(m1.itm_sub2.like(bind("itm_sub2")));
		builder.addWhereWithCutOffAnd(m1.itm_sub3.like(bind("itm_sub3")));
		builder.addWhereWithCutOffAnd(m3.itm_nm.like(bind("itm_nm")));
		builder.addWhereWithCutOffAnd(m3.itm_alt_nm1.like(bind("itm_alt_nm1")));
		builder.addWhereWithCutOffAnd(m3.itm_alt_nm2.like(bind("itm_alt_nm2")));
		builder.addWhereWithCutOffAnd(m3.itm_alt_nm3.like(bind("itm_alt_nm3")));
		builder.addWhereWithCutOffAnd(m3.itm_alt_nm4.like(bind("itm_alt_nm4")));
		builder.addWhereWithCutOffAnd(m3.itm_typ.like(bind("itm_typ")));
		builder.addWhereWithCutOffAnd(m3.itm_typ_d_cd.like(bind("itm_typ_d_cd")));
		builder.addWhereWithCutOffAnd(m10.itm_typ_d_nm.like(bind("itm_typ_d_nm")));
		builder.addWhereWithCutOffAnd(m3.stk_mng_typ.like(bind("stk_mng_typ")));
		builder.addWhereWithCutOffAnd(m3.asset_mng_typ.like(bind("asset_mng_typ")));
		builder.addWhereWithCutOffAnd(m1.mfg_loc_cd.like(bind("mfg_loc_cd")));
		builder.addWhereWithCutOffAnd(m4.loc_nm.like(bind("mfg_loc_nm")));
		builder.addWhereWithCutOffAnd(m4.site_cd.like(bind("site_cd")));
		builder.addWhereWithCutOffAnd(m11.site_nm.like(bind("site_nm")));
		builder.addWhereWithCutOffAnd(m4.lg_grp_cd.like(bind("lg_grp_cd")));
		builder.addWhereWithCutOffAnd(m14.lg_grp_nm.like(bind("lg_grp_nm")));
		builder.addWhereWithCutOffAnd(m4.alloc_grp_cd.like(bind("alloc_grp_cd")));
		builder.addWhereWithCutOffAnd(m13.alloc_grp_nm.like(bind("alloc_grp_nm")));
		builder.addWhereWithCutOffAnd(m4.loc_grp_cd.like(bind("loc_grp_cd")));
		builder.addWhereWithCutOffAnd(m12.loc_grp_nm.like(bind("loc_grp_nm")));
		builder.addWhereWithCutOffAnd(m4.loc_mng_typ.like(bind("loc_mng_typ")));
		builder.addWhereWithCutOffAnd(nullValue().like(bind("sppl_cd")));
		builder.addWhereWithCutOffAnd(nullValue().like(bind("sppl_nm")));
		builder.addWhereWithCutOffAnd(nullValue().like(bind("ein")));
		builder.addWhereWithCutOffAnd(nullValue().like(bind("sppl_alt_nm1")));
		builder.addWhereWithCutOffAnd(nullValue().like(bind("sppl_alt_nm2")));
		builder.addWhereWithCutOffAnd(nullValue().like(bind("sppl_alt_nm3")));
		builder.addWhereWithCutOffAnd(nullValue().like(bind("sppl_alt_nm4")));
		builder.addWhereWithCutOffAnd(nullValue().like(bind("cntry_cd")));
		builder.addWhereWithCutOffAnd(nullValue().like(bind("cntry_nm")));
		builder.addWhereWithCutOffAnd(nullValue().like(bind("area_cd")));
		builder.addWhereWithCutOffAnd(nullValue().like(bind("area_nm")));
		builder.addWhereWithCutOffAnd(m3.itm_grp_cd1.like(bind("itm_grp_cd1")));
		builder.addWhereWithCutOffAnd(m3.itm_grp_cd2.like(bind("itm_grp_cd2")));
		builder.addWhereWithCutOffAnd(m3.itm_grp_cd3.like(bind("itm_grp_cd3")));
		builder.addWhereWithCutOffAnd(m3.itm_grp_cd4.like(bind("itm_grp_cd4")));
		builder.addWhereWithCutOffAnd(m3.itm_grp_cd5.like(bind("itm_grp_cd5")));
		builder.addWhereWithCutOffAnd(m3.itm_grp_cd6.like(bind("itm_grp_cd6")));
		builder.addWhereWithCutOffAnd(m3.itm_grp_cd7.like(bind("itm_grp_cd7")));
		builder.addWhereWithCutOffAnd(m3.itm_grp_cd8.like(bind("itm_grp_cd8")));
		builder.addWhereWithCutOffAnd(m3.itm_grp_cd9.like(bind("itm_grp_cd9")));
		builder.addWhereWithCutOffAnd(m3.itm_grp_cd10.like(bind("itm_grp_cd10")));
		builder.addWhereWithCutOffAnd(nullValue().like(bind("sppl_grp_cd1")));
		builder.addWhereWithCutOffAnd(nullValue().like(bind("sppl_grp_cd2")));
		builder.addWhereWithCutOffAnd(nullValue().like(bind("sppl_grp_cd3")));
		builder.addWhereWithCutOffAnd(nullValue().like(bind("sppl_grp_cd4")));
		builder.addWhereWithCutOffAnd(nullValue().like(bind("sppl_grp_cd5")));
		builder.addWhereWithCutOffAnd(nullValue().like(bind("sppl_grp_cd6")));
		builder.addWhereWithCutOffAnd(nullValue().like(bind("sppl_grp_cd7")));
		builder.addWhereWithCutOffAnd(nullValue().like(bind("sppl_grp_cd8")));
		builder.addWhereWithCutOffAnd(nullValue().like(bind("sppl_grp_cd9")));
		builder.addWhereWithCutOffAnd(nullValue().like(bind("sppl_grp_cd10")));
		builder.addWhereWithCutOffAnd(m1.memo1.like(bind("memo1")));
		builder.addWhereWithCutOffAnd(m1.memo2.like(bind("memo2")));
		builder.addWhereWithCutOffAnd(m1.memo3.like(bind("memo3")));
		builder.addWhereWithCutOffAnd(nullValue().neq(bind("own_cntry_cd")));
	}

	/**
	 * 購買ＦＬＧに対応する、品目詳細マスタ（購買）ビュー検索のためのSELECT句をbuilderに追加します。
	 * @param builder クエリAPIビルダー
	 */
	protected void addSelectItmDtlPurc(MCQueryApiBuilder builder) {

		MAVM_ITM_DTL_PURC_R m1 = (MAVM_ITM_DTL_PURC_R) builder.getBaseDbc();
		
		builder.addSelect(
				m1.wg_cd,
				nullValue().as("wg_nm"),
				m1.itm_cd,
				m1.itm_sub1,
				m1.itm_sub2,
				m1.itm_sub3,
				nullValue().as("itm_nm"),
				nullValue().as("itm_alt_nm1"),
				nullValue().as("itm_alt_nm2"),
				nullValue().as("itm_alt_nm3"),
				nullValue().as("itm_alt_nm4"),
				nullValue().as("itm_typ"),
				nullValue().as("itm_typ_d_cd"),
				nullValue().as("stk_mng_typ"),
				nullValue().as("asset_mng_typ"),
				value(false).as("sundry_itm_flg"),
				m1.mfg_loc_cd,
				nullValue().as("mfg_loc_nm"),
				m1.bom_ptn,
				m1.sppl_cd,
				nullValue().as("sppl_nm"),
				m1.maker_cd,
				m1.rqst_loc_cd,
				nullValue().as("rqst_loc_nm"),
				m1.st_dt,
				m1.end_dt,
				m1.oper_ptn,
				m1.mfg_lt,
				m1.mfg_lt_add_qty,
				m1.purc_lt,
				m1.purc_lt_add_qty,
				m1.accpt_insp_lt,
				m1.buf_lt,
				m1.ord_fix_pd,
				m1.sz_day_week_typ,
				m1.sz_week,
				m1.lot_sz_pd,
				m1.min_lot_qty,
				m1.batch_lot_qty,
				m1.max_lot_qty,
				m1.max_order,
				m1.prio,
				m1.order_ratio,
				m1.yield_schd_qty,
				m1.mfg_inst_qty,
				m1.fxd_rqmt_qty,
				m1.lot_issue_typ,
				m1.bkf_flg,
				m1.ln_stk_flg,
				m1.pre_po_tgt_flg,
				m1.inst_rec_issue_flg,
				m1.no_mfg_aprv_flg,
				m1.itm_lower_yield,
				m1.itm_std_yield,
				m1.itm_upper_yield,
				m1.purc_id_typ,
				m1.rqst_wg_cd,
				m1.rsrc_std_qty1,
				m1.rsrc_unit_qty1,
				m1.rsrc_std_qty2,
				m1.rsrc_unit_qty2,
				m1.sno1,
				m1.sno2,
				m1.sno3,
				m1.sno4,
				m1.not_mrp_flg,
				m1.memo1,
				m1.memo2,
				m1.memo3,
				m1.ins_ts,
				m1.upd_ts,
				MAPA_TAX$F_GET_PURC_TAX_CD(
					m1.itm_cd,
					m1.itm_sub1,
					m1.itm_sub2,
					m1.itm_sub3,
					m1.sppl_cd,
					bind("dt")
				).as("purc_tax_cd"),
				MAPA_TAX$F_GET_PROV_TAX_CD(
					m1.itm_cd,
					m1.itm_sub1,
					m1.itm_sub2,
					m1.itm_sub3,
					m1.sppl_cd,
					bind("dt")
				).as("prov_tax_cd"),
				MAPA_BP$F_GET_BP_ADDR(
					m1.sppl_cd,
					bind("dt"),
					value(MAC_BP_ADDR_TYP.ZIP_CD.value())
				).as("zip_cd"),
				MAPA_BP$F_GET_BP_ADDR(
					m1.sppl_cd,
					bind("dt"),
					value(MAC_BP_ADDR_TYP.ADDR1.value())
				).as("addr1"),
				MAPA_BP$F_GET_BP_ADDR(
					m1.sppl_cd,
					bind("dt"),
					value(MAC_BP_ADDR_TYP.ADDR2.value())
				).as("addr2"),
				MAPA_BP$F_GET_BP_ADDR(
					m1.sppl_cd,
					bind("dt"),
					value(MAC_BP_ADDR_TYP.ADDR3.value())
				).as("addr3"),
				MAPA_BP$F_GET_BP_ADDR(
					m1.sppl_cd,
					bind("dt"),
					value(MAC_BP_ADDR_TYP.ADDR4.value())
				).as("addr4"),
				MAPA_BP$F_GET_BP_ADDR(
					m1.sppl_cd,
					bind("dt"),
					value(MAC_BP_ADDR_TYP.TEL.value())
				).as("tel"),
				MAPA_BP$F_GET_BP_ADDR(
					m1.sppl_cd,
					bind("dt"),
					value(MAC_BP_ADDR_TYP.FAX.value())
				).as("fax"),
				value(false).as("purc_upri_cng_flg"),
				value(false).as("prov_upri_cng_flg"),
				nullValue().as("cur_cd"),
				nullValue().as("cntry_cd"),
				value(false).as("foreign_flg"),
				nullValue().as("area_cd"),
				nullValue().as("asst_dpt_cd"),
				nullValue().as("sls_dpt_cd"),
				nullValue().as("site_cd"),
				nullValue().as("lg_grp_cd"),
				value(false).as("lg_def_flg"),
				nullValue().as("loc_grp_cd"),
				nullValue().as("alloc_grp_cd"),
				value(false).as("pre_outsrc_act_flg"),
				value(false).as("ddlv_prov_insp_flg"),
				nullValue().as("loc_cal_cd"),
				nullValue().as("loc_mng_typ"),
				value(false).as("str_ln_tgt_flg"),
				value(false).as("alloc_lmt_flg"),
				value(false).as("gi_pack_xfer_flg"),
				value(false).as("gi_vmi_flg"),
				nullValue().as("rsrc_cd1"),
				nullValue().as("rsrc_cd2"),
				nullValue().as("prnt_lcl_cd"),
				nullValue().as("asppl_cd"),
				MAPA_BP$F_GET_VMI_PURC_DPT_CD_NE(
					m1.sppl_cd,
					bind("dt"),
					value(false)
				).as("vmi_purc_dpt_cd"),
				value(false).as("subcon_flg"),
				nullValue().as("po_print_cd"),
				nullValue().as("sppl_ship_form_cd"),
				nullValue().as("pay_crryovr_times"),
				MAPA_BP$F_GET_BP_ADDR(
					m1.sppl_cd,
					bind("dt"),
					value(MAC_BP_ADDR_TYP.SPPL_CNTCT_DPT.value())
				).as("sppl_cntct_dpt"),
				MAPA_BP$F_GET_BP_ADDR(
					m1.sppl_cd,
					bind("dt"),
					value(MAC_BP_ADDR_TYP.SPPL_CNTCT_PSN.value())
				).as("sppl_cntct_psn"),
				MAPA_BP$F_GET_BP_ADDR(
					m1.sppl_cd,
					bind("dt"),
					value(MAC_BP_ADDR_TYP.SPPL_CNTCT_PSN_TITLE.value())
				).as("sppl_cntct_psn_title"),
				nullValue().as("purc_upri_req_typ"),
				nullValue().as("purc_amt_rnd_typ"),
				nullValue().as("purc_tax_rnd_typ"),
				nullValue().as("purc_tax_calc_typ"),
				value(false).as("wrk_po_flg"),
				value(false).as("wrk_ap_flg"),
				nullValue().as("prov_rcv_typ"),
				value(false).as("onr_prsppl_flg"),
				nullValue().as("prov_basis_typ"),
				nullValue().as("prov_amt_rnd_typ"),
				nullValue().as("prov_tax_rnd_typ"),
				nullValue().as("prov_tax_calc_typ"),
				nullValue().as("sppl_cal_cd"),
				value(false).as("sppl_iv_flg"),
				value(false).as("prms_recv_flg"),
				nullValue().as("sppl_tterm_cd1"),
				nullValue().as("sppl_tterm_cd2"),
				nullValue().as("sppl_tterm_cd3"),
				value(false).as("dscnt_itm_flg"),
				nullValue().as("unit_cd"),
				nullValue().as("unit_nm"),
				nullValue().as("dec_place"),
				nullValue().as("rnd_typ"),
				nullValue().as("dim_unit_cd"),
				nullValue().as("dim"),
				nullValue().as("wt_unit_cd"),
				nullValue().as("wt"),
				nullValue().as("conts_unit_cd"),
				nullValue().as("conts_qty"),
				nullValue().as("hs_cd"),
				nullValue().as("itm_jnl_cd"),
				nullValue().as("ac_itm_grp_cd"),
				value(false).as("minus_stk_flg"),
				value(false).as("not_new_lot_flg"),
				value(false).as("gi_alloc_flg"),
				MAPA_TAX$F_GET_WTAX_RATE(
					m1.itm_cd,
					m1.itm_sub1,
					m1.itm_sub2,
					m1.itm_sub3,
					bind("dt")
				).as("wtax_rate"),
				nullValue().as("ship_unit_cd"),
				nullValue().as("mfg_unit_cd"),
				nullValue().as("purc_unit_cd"),
				nullValue().as("pckg_unit_cd"),
				value(false).as("pack_alloc_flg"),
				nullValue().as("lot_mng_typ"),
				nullValue().as("lot_no_typ"),
				nullValue().as("lot_no_ptn_cd"),
				nullValue().as("sublot_mng_typ"),
				nullValue().as("sublot_no_typ"),
				nullValue().as("sublot_no_ptn_cd"),
				value(false).as("bp_lot_flg"),
				nullValue().as("insp_bind_typ"),
				value(false).as("skip_chk_ship_flg"),
				value(false).as("mrkt_judg_flg"),
				nullValue().as("mrkt_judg_role_cd"),
				value(false).as("lmt_ctl_flg"),
				nullValue().as("lmt_ctl_categ"),
				value(false).as("cont_fctr_flg"),
				nullValue().as("std_cont_fctr"),
				nullValue().as("cont_fctr_unit_cd"),
				nullValue().as("cont_fctr_unit_nm"),
				nullValue().as("cont_fctr_rnd_typ"),
				nullValue().as("cont_fctr_dec_place"),
				nullValue().as("sno1_mng_typ"),
				value(false).as("slo_sno1_flg"),
				value(false).as("rqmt_sno1_flg"),
				nullValue().as("sno1_num_typ"),
				nullValue().as("sno1_ptn_cd"),
				nullValue().as("sno2_mng_typ"),
				value(false).as("slo_sno2_flg"),
				value(false).as("rqmt_sno2_flg"),
				nullValue().as("sno2_num_typ"),
				nullValue().as("sno2_ptn_cd"),
				nullValue().as("sno3_mng_typ"),
				value(false).as("slo_sno3_flg"),
				value(false).as("rqmt_sno3_flg"),
				nullValue().as("sno3_num_typ"),
				nullValue().as("sno3_ptn_cd"),
				nullValue().as("sno4_mng_typ"),
				value(false).as("slo_sno4_flg"),
				value(false).as("rqmt_sno4_flg"),
				nullValue().as("sno4_num_typ"),
				nullValue().as("sno4_ptn_cd"),
				nullValue().as("mfg_inst_unit_typ"),
				nullValue().as("mrp_proc_typ"),
				nullValue().as("alloc_margin_days"),
				nullValue().as("mrp_alloc_margin_days"),
				nullValue().as("rqmt_rstr_qty"),
				value(false).as("inpt_itm_add_flg"),
				value(false).as("inpt_itm_del_flg"),
				value(false).as("sch_flg"),
				nullValue().as("cntry_org_cd"),
				nullValue().as("comp_spec_typ"),
				value(false).as("comp_rev_at_slo_flg"),
				value(false).as("comp_core_itm_flg"),
				nullValue().as("itm_spec_grp_cd"),
				value(false).as("slo_proc_flg"),
				nullValue().as("slo_proc_typ"),
				nullValue().as("ship_inst_typ"),
				value(false).as("ship_lot_back_stop_flg"),
				nullValue().as("itm_ship_grp_cd"),
				nullValue().as("ship_valid_grp_cd"),
				value(false).as("arr_skip_flg"),
				value(false).as("purc_dlv_slip_flg"),
				nullValue().as("ship_term_cd"),
				nullValue().as("exim_xpns_typ"),
				value(false).as("stk_lst_flg"),
				value(false).as("ver_flg"),
				nullValue().as("th_image"),
				nullValue().as("mrp_opn_xfr_days"),
				nullValue().as("itm_typ_d_nm"),
				nullValue().as("maker_nm"),
				nullValue().as("site_nm"),
				nullValue().as("loc_grp_nm"),
				nullValue().as("alloc_grp_nm"),
				nullValue().as("lg_grp_nm"),
				nullValue().as("cur_nm"),
				nullValue().as("cntry_nm"),
				nullValue().as("area_nm"),
				value(true).as("purc_flg"),
				value(false).as("repurc_obli_flg"),
				nullValue().as("outsrc_upri_typ"));
	}

	/**
	 * 購買ＦＬＧに対応する、品目詳細マスタ（購買）ビュー検索のための結合条件（JOIN句）をbuilderに追加します。
	 * @param builder クエリAPIビルダー
	 * @param row バインド値を格納したrow
	 */
	protected void addJoinItmDtlPurcForInptAssist(MCQueryApiBuilder builder, MCRow row) {
		
		MAVM_ITM_DTL_PURC_R m1 = (MAVM_ITM_DTL_PURC_R) builder.getBaseDbc();
		MAM_WG_R m2 = MAM_WG_R.create("M2");
		MAVM_ITM_WG_R m3 = MAVM_ITM_WG_R.create("M3");
		MAM_BP_R m5 = MAM_BP_R.create("M5");
		MAM_ITM_TYP_D_R m10 = MAM_ITM_TYP_D_R.create("M10");
		MAM_CNTRY_R m17 = MAM_CNTRY_R.create("M17");
		MAM_AREA_R m18 = MAM_AREA_R.create("M18");
		MAM_ITM_GRP_R m20 = MAM_ITM_GRP_R.create("M20");
		MAM_ITM_GRP_R m21 = MAM_ITM_GRP_R.create("M21");
		MAM_ITM_GRP_R m22 = MAM_ITM_GRP_R.create("M22");
		MAM_ITM_GRP_R m23 = MAM_ITM_GRP_R.create("M23");
		MAM_ITM_GRP_R m24 = MAM_ITM_GRP_R.create("M24");
		MAM_ITM_GRP_R m25 = MAM_ITM_GRP_R.create("M25");
		MAM_ITM_GRP_R m26 = MAM_ITM_GRP_R.create("M26");
		MAM_ITM_GRP_R m27 = MAM_ITM_GRP_R.create("M27");
		MAM_ITM_GRP_R m28 = MAM_ITM_GRP_R.create("M28");
		MAM_ITM_GRP_R m29 = MAM_ITM_GRP_R.create("M29");
		MAM_BP_GRP_R m30 = MAM_BP_GRP_R.create("M30");
		MAM_BP_GRP_R m31 = MAM_BP_GRP_R.create("M31");
		MAM_BP_GRP_R m32 = MAM_BP_GRP_R.create("M32");
		MAM_BP_GRP_R m33 = MAM_BP_GRP_R.create("M33");
		MAM_BP_GRP_R m34 = MAM_BP_GRP_R.create("M34");
		MAM_BP_GRP_R m35 = MAM_BP_GRP_R.create("M35");
		MAM_BP_GRP_R m36 = MAM_BP_GRP_R.create("M36");
		MAM_BP_GRP_R m37 = MAM_BP_GRP_R.create("M37");
		MAM_BP_GRP_R m38 = MAM_BP_GRP_R.create("M38");
		MAM_BP_GRP_R m39 = MAM_BP_GRP_R.create("M39");

		builder.addInnerJoin(m2, m1.wg_cd.eq(m2.wg_cd));
		builder.addInnerJoin(m3,
				m1.itm_cd.eq(m3.itm_cd)
				.and(m1.itm_sub1.eq(m3.itm_sub1))
				.and(m1.itm_sub2.eq(m3.itm_sub2))
				.and(m1.itm_sub3.eq(m3.itm_sub3))
				.and(m1.wg_cd.eq(m3.wg_cd)));
		builder.addInnerJoin(m5, m1.sppl_cd.eq(m5.bp_cd));
		builder.addLeftOuterJoin(m10,
				m3.itm_typ.eq(m10.itm_typ)
				.and(m3.itm_typ_d_cd.eq(m10.itm_typ_d_cd)));
		builder.addLeftOuterJoin(m17, m5.cntry_cd.eq(m17.cntry_cd));
		builder.addLeftOuterJoin(m18, m5.area_cd.eq(m18.area_cd));
		if (!isNull(row.getStringNE(ItmDtlCols.$i_itm_grp_nm1))) {
			builder.addInnerJoin(m20,
					m20.itm_grp_typ.eq(value(MAC_ITM_GRP_TYP.GRP1.value()))
					.and(m3.itm_grp_cd1.eq(m20.itm_grp_cd))
					.and(m20.itm_grp_nm.like(bind(ItmDtlCols.$i_itm_grp_nm1))));
		}
		if (!isNull(row.getStringNE(ItmDtlCols.$i_itm_grp_nm2))) {
			builder.addInnerJoin(m21,
					m21.itm_grp_typ.eq(value(MAC_ITM_GRP_TYP.GRP2.value()))
					.and(m3.itm_grp_cd2.eq(m21.itm_grp_cd))
					.and(m21.itm_grp_nm.like(bind(ItmDtlCols.$i_itm_grp_nm2))));
		}
		if (!isNull(row.getStringNE(ItmDtlCols.$i_itm_grp_nm3))) {
			builder.addInnerJoin(m22,
					m22.itm_grp_typ.eq(value(MAC_ITM_GRP_TYP.GRP3.value()))
					.and(m3.itm_grp_cd3.eq(m22.itm_grp_cd))
					.and(m22.itm_grp_nm.like(bind(ItmDtlCols.$i_itm_grp_nm3))));
		}
		if (!isNull(row.getStringNE(ItmDtlCols.$i_itm_grp_nm4))) {
			builder.addInnerJoin(m23,
					m23.itm_grp_typ.eq(value(MAC_ITM_GRP_TYP.GRP4.value()))
					.and(m3.itm_grp_cd4.eq(m23.itm_grp_cd))
					.and(m23.itm_grp_nm.like(bind(ItmDtlCols.$i_itm_grp_nm4))));
		}
		if (!isNull(row.getStringNE(ItmDtlCols.$i_itm_grp_nm5))) {
			builder.addInnerJoin(m24,
					m24.itm_grp_typ.eq(value(MAC_ITM_GRP_TYP.GRP5.value()))
					.and(m3.itm_grp_cd5.eq(m24.itm_grp_cd))
					.and(m24.itm_grp_nm.like(bind(ItmDtlCols.$i_itm_grp_nm5))));
		}
		if (!isNull(row.getStringNE(ItmDtlCols.$i_itm_grp_nm6))) {
			builder.addInnerJoin(m25,
					m25.itm_grp_typ.eq(value(MAC_ITM_GRP_TYP.GRP6.value()))
					.and(m3.itm_grp_cd6.eq(m25.itm_grp_cd))
					.and(m25.itm_grp_nm.like(bind(ItmDtlCols.$i_itm_grp_nm6))));
		}
		if (!isNull(row.getStringNE(ItmDtlCols.$i_itm_grp_nm7))) {
			builder.addInnerJoin(m26,
					m26.itm_grp_typ.eq(value(MAC_ITM_GRP_TYP.GRP7.value()))
					.and(m3.itm_grp_cd7.eq(m26.itm_grp_cd))
					.and(m26.itm_grp_nm.like(bind(ItmDtlCols.$i_itm_grp_nm7))));
		}
		if (!isNull(row.getStringNE(ItmDtlCols.$i_itm_grp_nm8))) {
			builder.addInnerJoin(m27,
					m27.itm_grp_typ.eq(value(MAC_ITM_GRP_TYP.GRP8.value()))
					.and(m3.itm_grp_cd8.eq(m27.itm_grp_cd))
					.and(m27.itm_grp_nm.like(bind(ItmDtlCols.$i_itm_grp_nm8))));
		}
		if (!isNull(row.getStringNE(ItmDtlCols.$i_itm_grp_nm9))) {
			builder.addInnerJoin(m28,
					m28.itm_grp_typ.eq(value(MAC_ITM_GRP_TYP.GRP9.value()))
					.and(m3.itm_grp_cd9.eq(m28.itm_grp_cd))
					.and(m28.itm_grp_nm.like(bind(ItmDtlCols.$i_itm_grp_nm9))));
		}
		if (!isNull(row.getStringNE(ItmDtlCols.$i_itm_grp_nm10))) {
			builder.addInnerJoin(m29,
					m29.itm_grp_typ.eq(value(MAC_ITM_GRP_TYP.GRP10.value()))
					.and(m3.itm_grp_cd10.eq(m29.itm_grp_cd))
					.and(m29.itm_grp_nm.like(bind(ItmDtlCols.$i_itm_grp_nm10))));
		}
		if (!isNull(row.getStringNE(ItmDtlCols.$i_sppl_grp_nm1))) {
			builder.addInnerJoin(m30,
					m30.bp_grp_typ.eq(value(MAC_BP_GRP_TYP.GRP1.value()))
					.and(m5.bp_grp_cd1.eq(m30.bp_grp_cd))
					.and(m30.bp_grp_nm.like(bind(ItmDtlCols.$i_sppl_grp_nm1))));
		}
		if (!isNull(row.getStringNE(ItmDtlCols.$i_sppl_grp_nm2))) {
			builder.addInnerJoin(m31,
					m31.bp_grp_typ.eq(value(MAC_BP_GRP_TYP.GRP2.value()))
					.and(m5.bp_grp_cd2.eq(m31.bp_grp_cd))
					.and(m31.bp_grp_nm.like(bind(ItmDtlCols.$i_sppl_grp_nm2))));
		}
		if (!isNull(row.getStringNE(ItmDtlCols.$i_sppl_grp_nm3))) {
			builder.addInnerJoin(m32,
					m32.bp_grp_typ.eq(value(MAC_BP_GRP_TYP.GRP3.value()))
					.and(m5.bp_grp_cd3.eq(m32.bp_grp_cd))
					.and(m32.bp_grp_nm.like(bind(ItmDtlCols.$i_sppl_grp_nm3))));
		}
		if (!isNull(row.getStringNE(ItmDtlCols.$i_sppl_grp_nm4))) {
			builder.addInnerJoin(m33,
					m33.bp_grp_typ.eq(value(MAC_BP_GRP_TYP.GRP4.value()))
					.and(m5.bp_grp_cd4.eq(m33.bp_grp_cd))
					.and(m33.bp_grp_nm.like(bind(ItmDtlCols.$i_sppl_grp_nm4))));
		}
		if (!isNull(row.getStringNE(ItmDtlCols.$i_sppl_grp_nm5))) {
			builder.addInnerJoin(m34,
					m34.bp_grp_typ.eq(value(MAC_BP_GRP_TYP.GRP5.value()))
					.and(m5.bp_grp_cd5.eq(m34.bp_grp_cd))
					.and(m34.bp_grp_nm.like(bind(ItmDtlCols.$i_sppl_grp_nm5))));
		}
		if (!isNull(row.getStringNE(ItmDtlCols.$i_sppl_grp_nm6))) {
			builder.addInnerJoin(m35,
					m35.bp_grp_typ.eq(value(MAC_BP_GRP_TYP.GRP6.value()))
					.and(m5.bp_grp_cd6.eq(m35.bp_grp_cd))
					.and(m35.bp_grp_nm.like(bind(ItmDtlCols.$i_sppl_grp_nm6))));
		}
		if (!isNull(row.getStringNE(ItmDtlCols.$i_sppl_grp_nm7))) {
			builder.addInnerJoin(m36,
					m36.bp_grp_typ.eq(value(MAC_BP_GRP_TYP.GRP7.value()))
					.and(m5.bp_grp_cd7.eq(m36.bp_grp_cd))
					.and(m36.bp_grp_nm.like(bind(ItmDtlCols.$i_sppl_grp_nm7))));
		}
		if (!isNull(row.getStringNE(ItmDtlCols.$i_sppl_grp_nm8))) {
			builder.addInnerJoin(m37,
					m37.bp_grp_typ.eq(value(MAC_BP_GRP_TYP.GRP8.value()))
					.and(m5.bp_grp_cd8.eq(m37.bp_grp_cd))
					.and(m37.bp_grp_nm.like(bind(ItmDtlCols.$i_sppl_grp_nm8))));
		}
		if (!isNull(row.getStringNE(ItmDtlCols.$i_sppl_grp_nm9))) {
			builder.addInnerJoin(m38,
					m38.bp_grp_typ.eq(value(MAC_BP_GRP_TYP.GRP9.value()))
					.and(m5.bp_grp_cd9.eq(m38.bp_grp_cd))
					.and(m38.bp_grp_nm.like(bind(ItmDtlCols.$i_sppl_grp_nm9))));
		}
		if (!isNull(row.getStringNE(ItmDtlCols.$i_sppl_grp_nm10))) {
			builder.addInnerJoin(m39,
					m39.bp_grp_typ.eq(value(MAC_BP_GRP_TYP.GRP10.value()))
					.and(m5.bp_grp_cd10.eq(m39.bp_grp_cd))
					.and(m39.bp_grp_nm.like(bind(ItmDtlCols.$i_sppl_grp_nm10))));
		}
	}

	/**
	 * 購買ＦＬＧに対応する、品目詳細マスタ（購買）ビュー検索のための直接入力条件（Where句）をbuilderに追加します。
	 * @param builder クエリAPIビルダー
	 */
	protected void addWhereItmDtlPurcForDirectInpt(MCQueryApiBuilder builder) {
		
		MAVM_ITM_DTL_PURC_R m1 = (MAVM_ITM_DTL_PURC_R) builder.getBaseDbc();

		builder.setWhere(value(0).eq(value(0)));
		builder.addWhereWithAnd(bind("dt").between(m1.st_dt, m1.end_dt));
		builder.addWhereWithCutOffAnd(m1.wg_cd.eq(bind("wg_cd")));
		builder.addWhereWithCutOffAnd(m1.itm_cd.eq(bind("itm_cd")));
		builder.addWhereWithCutOffAnd(m1.itm_sub1.eq(bind("itm_sub1")));
		builder.addWhereWithCutOffAnd(m1.itm_sub2.eq(bind("itm_sub2")));
		builder.addWhereWithCutOffAnd(m1.itm_sub3.eq(bind("itm_sub3")));
		builder.addWhereWithCutOffAnd(nullValue().eq(bind("loc_cd")));
		builder.addWhereWithCutOffAnd(m1.sppl_cd.eq(bind("sppl_cd")));
	}

	/**
	 * 購買ＦＬＧに対応する、品目詳細マスタ（購買）ビュー検索のための入力補助条件（Where句）をbuilderに追加します。
	 * @param builder クエリAPIビルダー
	 */
	protected void addWhereItmDtlPurcForInptAssist(MCQueryApiBuilder builder) {
		
		MAVM_ITM_DTL_PURC_R m1 = (MAVM_ITM_DTL_PURC_R) builder.getBaseDbc();
		MAM_WG_R m2 = MAM_WG_R.create("M2");
		MAVM_ITM_WG_R m3 = MAVM_ITM_WG_R.create("M3");
		MAM_BP_R m5 = MAM_BP_R.create("M5");
		MAM_ITM_TYP_D_R m10 = MAM_ITM_TYP_D_R.create("M10");
		MAM_CNTRY_R m17 = MAM_CNTRY_R.create("M17");
		MAM_AREA_R m18 = MAM_AREA_R.create("M18");

		builder.setWhere(value(0).eq(value(0)));
		builder.addWhereWithAnd(bind("dt").between(m1.st_dt, m1.end_dt));
		builder.addWhereWithCutOffAnd(m1.wg_cd.like(bind("wg_cd")));
		builder.addWhereWithCutOffAnd(m2.wg_nm.like(bind("wg_nm")));
		builder.addWhereWithCutOffAnd(m1.itm_cd.like(bind("itm_cd")));
		builder.addWhereWithCutOffAnd(m1.itm_sub1.like(bind("itm_sub1")));
		builder.addWhereWithCutOffAnd(m1.itm_sub2.like(bind("itm_sub2")));
		builder.addWhereWithCutOffAnd(m1.itm_sub3.like(bind("itm_sub3")));
		builder.addWhereWithCutOffAnd(m3.itm_nm.like(bind("itm_nm")));
		builder.addWhereWithCutOffAnd(m3.itm_alt_nm1.like(bind("itm_alt_nm1")));
		builder.addWhereWithCutOffAnd(m3.itm_alt_nm2.like(bind("itm_alt_nm2")));
		builder.addWhereWithCutOffAnd(m3.itm_alt_nm3.like(bind("itm_alt_nm3")));
		builder.addWhereWithCutOffAnd(m3.itm_alt_nm4.like(bind("itm_alt_nm4")));
		builder.addWhereWithCutOffAnd(m3.itm_typ.like(bind("itm_typ")));
		builder.addWhereWithCutOffAnd(m3.itm_typ_d_cd.like(bind("itm_typ_d_cd")));
		builder.addWhereWithCutOffAnd(m10.itm_typ_d_nm.like(bind("itm_typ_d_nm")));
		builder.addWhereWithCutOffAnd(m3.stk_mng_typ.like(bind("stk_mng_typ")));
		builder.addWhereWithCutOffAnd(m3.asset_mng_typ.like(bind("asset_mng_typ")));
		builder.addWhereWithCutOffAnd(nullValue().like(bind("loc_cd")));
		builder.addWhereWithCutOffAnd(nullValue().like(bind("loc_nm")));
		builder.addWhereWithCutOffAnd(nullValue().like(bind("site_cd")));
		builder.addWhereWithCutOffAnd(nullValue().like(bind("site_nm")));
		builder.addWhereWithCutOffAnd(nullValue().like(bind("lg_grp_cd")));
		builder.addWhereWithCutOffAnd(nullValue().like(bind("lg_grp_nm")));
		builder.addWhereWithCutOffAnd(nullValue().like(bind("alloc_grp_cd")));
		builder.addWhereWithCutOffAnd(nullValue().like(bind("alloc_grp_nm")));
		builder.addWhereWithCutOffAnd(nullValue().like(bind("loc_grp_cd")));
		builder.addWhereWithCutOffAnd(nullValue().like(bind("loc_grp_nm")));
		builder.addWhereWithCutOffAnd(nullValue().like(bind("loc_mng_typ")));
		builder.addWhereWithCutOffAnd(m1.sppl_cd.like(bind("sppl_cd")));
		builder.addWhereWithCutOffAnd(m5.bp_nm.like(bind("sppl_nm")));
		builder.addWhereWithCutOffAnd(m5.ein.like(bind("ein")));
		builder.addWhereWithCutOffAnd(m5.bp_alt_nm1.like(bind("sppl_alt_nm1")));
		builder.addWhereWithCutOffAnd(m5.bp_alt_nm2.like(bind("sppl_alt_nm2")));
		builder.addWhereWithCutOffAnd(m5.bp_alt_nm3.like(bind("sppl_alt_nm3")));
		builder.addWhereWithCutOffAnd(m5.bp_alt_nm4.like(bind("sppl_alt_nm4")));
		builder.addWhereWithCutOffAnd(m5.cntry_cd.like(bind("cntry_cd")));
		builder.addWhereWithCutOffAnd(m17.cntry_nm.like(bind("cntry_nm")));
		builder.addWhereWithCutOffAnd(m5.area_cd.like(bind("area_cd")));
		builder.addWhereWithCutOffAnd(m18.area_nm.like(bind("area_nm")));
		builder.addWhereWithCutOffAnd(m3.itm_grp_cd1.like(bind("itm_grp_cd1")));
		builder.addWhereWithCutOffAnd(m3.itm_grp_cd2.like(bind("itm_grp_cd2")));
		builder.addWhereWithCutOffAnd(m3.itm_grp_cd3.like(bind("itm_grp_cd3")));
		builder.addWhereWithCutOffAnd(m3.itm_grp_cd4.like(bind("itm_grp_cd4")));
		builder.addWhereWithCutOffAnd(m3.itm_grp_cd5.like(bind("itm_grp_cd5")));
		builder.addWhereWithCutOffAnd(m3.itm_grp_cd6.like(bind("itm_grp_cd6")));
		builder.addWhereWithCutOffAnd(m3.itm_grp_cd7.like(bind("itm_grp_cd7")));
		builder.addWhereWithCutOffAnd(m3.itm_grp_cd8.like(bind("itm_grp_cd8")));
		builder.addWhereWithCutOffAnd(m3.itm_grp_cd9.like(bind("itm_grp_cd9")));
		builder.addWhereWithCutOffAnd(m3.itm_grp_cd10.like(bind("itm_grp_cd10")));
		builder.addWhereWithCutOffAnd(m5.bp_grp_cd1.like(bind("sppl_grp_cd1")));
		builder.addWhereWithCutOffAnd(m5.bp_grp_cd2.like(bind("sppl_grp_cd2")));
		builder.addWhereWithCutOffAnd(m5.bp_grp_cd3.like(bind("sppl_grp_cd3")));
		builder.addWhereWithCutOffAnd(m5.bp_grp_cd4.like(bind("sppl_grp_cd4")));
		builder.addWhereWithCutOffAnd(m5.bp_grp_cd5.like(bind("sppl_grp_cd5")));
		builder.addWhereWithCutOffAnd(m5.bp_grp_cd6.like(bind("sppl_grp_cd6")));
		builder.addWhereWithCutOffAnd(m5.bp_grp_cd7.like(bind("sppl_grp_cd7")));
		builder.addWhereWithCutOffAnd(m5.bp_grp_cd8.like(bind("sppl_grp_cd8")));
		builder.addWhereWithCutOffAnd(m5.bp_grp_cd9.like(bind("sppl_grp_cd9")));
		builder.addWhereWithCutOffAnd(m5.bp_grp_cd10.like(bind("sppl_grp_cd10")));
		builder.addWhereWithCutOffAnd(m1.memo1.like(bind("memo1")));
		builder.addWhereWithCutOffAnd(m1.memo2.like(bind("memo2")));
		builder.addWhereWithCutOffAnd(m1.memo3.like(bind("memo3")));
		builder.addWhereWithCutOffAnd(m5.cntry_cd.neq(bind("own_cntry_cd")));
	}

	/**
	 * 購買ＦＬＧに対応する、品目マスタ（WG）ビュー検索のためのSELECT句をbuilderに追加します。
	 * @param builder クエリAPIビルダー
	 */
	protected void addSelectItmWg(MCQueryApiBuilder builder) {
		
		MAVM_ITM_WG_R m3 = (MAVM_ITM_WG_R) builder.getBaseDbc();
		MAM_BP_R m5 = MAM_BP_R.create("M5");
		
		builder.addSelect(
				m3.wg_cd,
				nullValue().as("wg_nm"),
				m3.itm_cd,
				m3.itm_sub1,
				m3.itm_sub2,
				m3.itm_sub3,
				nullValue().as("itm_nm"),
				nullValue().as("itm_alt_nm1"),
				nullValue().as("itm_alt_nm2"),
				nullValue().as("itm_alt_nm3"),
				nullValue().as("itm_alt_nm4"),
				nullValue().as("itm_typ"),
				nullValue().as("itm_typ_d_cd"),
				nullValue().as("stk_mng_typ"),
				nullValue().as("asset_mng_typ"),
				value(false).as("sundry_itm_flg"),
				value(MAC_STR.NULL_VAL.value()).as("mfg_loc_cd"),
				nullValue().as("mfg_loc_nm"),
				nullValue().as("bom_ptn"),
				m5.bp_cd.as("sppl_cd"),
				m5.bp_nm.as("sppl_nm"),
				value(MAC_STR.NULL_VAL.value()).as("maker_cd"),
				value(MAC_STR.NULL_VAL.value()).as("rqst_loc_cd"),
				nullValue().as("rqst_loc_nm"),
				nullValue().as("st_dt"),
				nullValue().as("end_dt"),
				nullValue().as("oper_ptn"),
				nullValue().as("mfg_lt"),
				nullValue().as("mfg_lt_add_qty"),
				nullValue().as("purc_lt"),
				nullValue().as("purc_lt_add_qty"),
				nullValue().as("accpt_insp_lt"),
				nullValue().as("buf_lt"),
				nullValue().as("ord_fix_pd"),
				nullValue().as("sz_day_week_typ"),
				nullValue().as("sz_week"),
				nullValue().as("lot_sz_pd"),
				nullValue().as("min_lot_qty"),
				nullValue().as("batch_lot_qty"),
				nullValue().as("max_lot_qty"),
				nullValue().as("max_order"),
				nullValue().as("prio"),
				nullValue().as("order_ratio"),
				nullValue().as("yield_schd_qty"),
				nullValue().as("mfg_inst_qty"),
				nullValue().as("fxd_rqmt_qty"),
				nullValue().as("lot_issue_typ"),
				value(false).as("bkf_flg"),
				value(false).as("ln_stk_flg"),
				value(false).as("pre_po_tgt_flg"),
				value(false).as("inst_rec_issue_flg"),
				value(false).as("no_mfg_aprv_flg"),
				nullValue().as("itm_lower_yield"),
				nullValue().as("itm_std_yield"),
				nullValue().as("itm_upper_yield"),
				nullValue().as("purc_id_typ"),
				nullValue().as("rqst_wg_cd"),
				nullValue().as("rsrc_std_qty1"),
				nullValue().as("rsrc_unit_qty1"),
				nullValue().as("rsrc_std_qty2"),
				nullValue().as("rsrc_unit_qty2"),
				nullValue().as("sno1"),
				nullValue().as("sno2"),
				nullValue().as("sno3"),
				nullValue().as("sno4"),
				value(false).as("not_mrp_flg"),
				nullValue().as("memo1"),
				nullValue().as("memo2"),
				nullValue().as("memo3"),
				nullValue().as("ins_ts"),
				nullValue().as("upd_ts"),
				decode(
					m5.bp_cd,
					nullValue(),
					nullValue(),
					MAPA_TAX$F_GET_PURC_TAX_CD(
						m3.itm_cd,
						m3.itm_sub1,
						m3.itm_sub2,
						m3.itm_sub3,
						m5.bp_cd,
						bind("dt")
					)
				).as("purc_tax_cd"),
				decode(
					m5.bp_cd,
					nullValue(),
					nullValue(),
					MAPA_TAX$F_GET_PROV_TAX_CD(
						m3.itm_cd,
						m3.itm_sub1,
						m3.itm_sub2,
						m3.itm_sub3,
						m5.bp_cd,
						bind("dt")
					)
				).as("prov_tax_cd"),
				decode(
					m5.bp_cd,
					nullValue(),
					nullValue(),
					MAPA_BP$F_GET_BP_ADDR(
						m5.bp_cd,
						bind("dt"),
						value(MAC_BP_ADDR_TYP.ZIP_CD.value())
					)
				).as("zip_cd"),
				decode(
					m5.bp_cd,
					nullValue(),
					nullValue(),
					MAPA_BP$F_GET_BP_ADDR(
						m5.bp_cd,
						bind("dt"),
						value(MAC_BP_ADDR_TYP.ADDR1.value())
					)
				).as("addr1"),
				decode(
					m5.bp_cd,
					nullValue(),
					nullValue(),
					MAPA_BP$F_GET_BP_ADDR(
						m5.bp_cd,
						bind("dt"),
						value(MAC_BP_ADDR_TYP.ADDR2.value())
					)
				).as("addr2"),
				decode(
					m5.bp_cd,
					nullValue(),
					nullValue(),
					MAPA_BP$F_GET_BP_ADDR(
						m5.bp_cd,
						bind("dt"),
						value(MAC_BP_ADDR_TYP.ADDR3.value())
					)
				).as("addr3"),
				decode(
					m5.bp_cd,
					nullValue(),
					nullValue(),
					MAPA_BP$F_GET_BP_ADDR(
						m5.bp_cd,
						bind("dt"),
						value(MAC_BP_ADDR_TYP.ADDR4.value())
					)
				).as("addr4"),
				decode(
					m5.bp_cd,
					nullValue(),
					nullValue(),
					MAPA_BP$F_GET_BP_ADDR(
						m5.bp_cd,
						bind("dt"),
						value(MAC_BP_ADDR_TYP.TEL.value())
					)
				).as("tel"),
				decode(
					m5.bp_cd,
					nullValue(),
					nullValue(),
					MAPA_BP$F_GET_BP_ADDR(
						m5.bp_cd,
						bind("dt"),
						value(MAC_BP_ADDR_TYP.FAX.value())
					)
				).as("fax"),
				value(false).as("purc_upri_cng_flg"),
				value(false).as("prov_upri_cng_flg"),
				nullValue().as("cur_cd"),
				nullValue().as("cntry_cd"),
				value(false).as("foreign_flg"),
				nullValue().as("area_cd"),
				nullValue().as("asst_dpt_cd"),
				nullValue().as("sls_dpt_cd"),
				nullValue().as("site_cd"),
				nullValue().as("lg_grp_cd"),
				value(false).as("lg_def_flg"),
				nullValue().as("loc_grp_cd"),
				nullValue().as("alloc_grp_cd"),
				value(false).as("pre_outsrc_act_flg"),
				value(false).as("ddlv_prov_insp_flg"),
				nullValue().as("loc_cal_cd"),
				nullValue().as("loc_mng_typ"),
				value(false).as("str_ln_tgt_flg"),
				value(false).as("alloc_lmt_flg"),
				value(false).as("gi_pack_xfer_flg"),
				value(false).as("gi_vmi_flg"),
				nullValue().as("rsrc_cd1"),
				nullValue().as("rsrc_cd2"),
				nullValue().as("prnt_lcl_cd"),
				nullValue().as("asppl_cd"),
				MAPA_BP$F_GET_VMI_PURC_DPT_CD_NE(
					m5.bp_cd,
					bind("dt"),
					value(false)
				).as("vmi_purc_dpt_cd"),
				value(false).as("subcon_flg"),
				nullValue().as("po_print_cd"),
				nullValue().as("sppl_ship_form_cd"),
				nullValue().as("pay_crryovr_times"),
				decode(
					m5.bp_cd,
					nullValue(),
					nullValue(),
					MAPA_BP$F_GET_BP_ADDR(
						m5.bp_cd,
						bind("dt"),
						value(MAC_BP_ADDR_TYP.SPPL_CNTCT_DPT.value())
					)
				).as("sppl_cntct_dpt"),
				decode(
					m5.bp_cd,
					nullValue(),
					nullValue(),
					MAPA_BP$F_GET_BP_ADDR(
						m5.bp_cd,
						bind("dt"),
						value(MAC_BP_ADDR_TYP.SPPL_CNTCT_PSN.value())
					)
				).as("sppl_cntct_psn"),
				decode(
					m5.bp_cd,
					nullValue(),
					nullValue(),
					MAPA_BP$F_GET_BP_ADDR(
						m5.bp_cd,
						bind("dt"),
						value(MAC_BP_ADDR_TYP.SPPL_CNTCT_PSN_TITLE.value())
					)
				).as("sppl_cntct_psn_title"),
				nullValue().as("purc_upri_req_typ"),
				nullValue().as("purc_amt_rnd_typ"),
				nullValue().as("purc_tax_rnd_typ"),
				nullValue().as("purc_tax_calc_typ"),
				value(false).as("wrk_po_flg"),
				value(false).as("wrk_ap_flg"),
				nullValue().as("prov_rcv_typ"),
				value(false).as("onr_prsppl_flg"),
				nullValue().as("prov_basis_typ"),
				nullValue().as("prov_amt_rnd_typ"),
				nullValue().as("prov_tax_rnd_typ"),
				nullValue().as("prov_tax_calc_typ"),
				nullValue().as("sppl_cal_cd"),
				value(false).as("sppl_iv_flg"),
				value(false).as("prms_recv_flg"),
				nullValue().as("sppl_tterm_cd1"),
				nullValue().as("sppl_tterm_cd2"),
				nullValue().as("sppl_tterm_cd3"),
				value(false).as("dscnt_itm_flg"),
				nullValue().as("unit_cd"),
				nullValue().as("unit_nm"),
				nullValue().as("dec_place"),
				nullValue().as("rnd_typ"),
				nullValue().as("dim_unit_cd"),
				nullValue().as("dim"),
				nullValue().as("wt_unit_cd"),
				nullValue().as("wt"),
				nullValue().as("conts_unit_cd"),
				nullValue().as("conts_qty"),
				nullValue().as("hs_cd"),
				nullValue().as("itm_jnl_cd"),
				nullValue().as("ac_itm_grp_cd"),
				value(false).as("minus_stk_flg"),
				value(false).as("not_new_lot_flg"),
				value(false).as("gi_alloc_flg"),
				MAPA_TAX$F_GET_WTAX_RATE(
					m3.itm_cd,
					m3.itm_sub1,
					m3.itm_sub2,
					m3.itm_sub3,
					bind("dt")
				).as("wtax_rate"),
				nullValue().as("ship_unit_cd"),
				nullValue().as("mfg_unit_cd"),
				nullValue().as("purc_unit_cd"),
				nullValue().as("pckg_unit_cd"),
				value(false).as("pack_alloc_flg"),
				nullValue().as("lot_mng_typ"),
				nullValue().as("lot_no_typ"),
				nullValue().as("lot_no_ptn_cd"),
				nullValue().as("sublot_mng_typ"),
				nullValue().as("sublot_no_typ"),
				nullValue().as("sublot_no_ptn_cd"),
				value(false).as("bp_lot_flg"),
				nullValue().as("insp_bind_typ"),
				value(false).as("skip_chk_ship_flg"),
				value(false).as("mrkt_judg_flg"),
				nullValue().as("mrkt_judg_role_cd"),
				value(false).as("lmt_ctl_flg"),
				nullValue().as("lmt_ctl_categ"),
				value(false).as("cont_fctr_flg"),
				nullValue().as("std_cont_fctr"),
				nullValue().as("cont_fctr_unit_cd"),
				nullValue().as("cont_fctr_unit_nm"),
				nullValue().as("cont_fctr_rnd_typ"),
				nullValue().as("cont_fctr_dec_place"),
				nullValue().as("sno1_mng_typ"),
				value(false).as("slo_sno1_flg"),
				value(false).as("rqmt_sno1_flg"),
				nullValue().as("sno1_num_typ"),
				nullValue().as("sno1_ptn_cd"),
				nullValue().as("sno2_mng_typ"),
				value(false).as("slo_sno2_flg"),
				value(false).as("rqmt_sno2_flg"),
				nullValue().as("sno2_num_typ"),
				nullValue().as("sno2_ptn_cd"),
				nullValue().as("sno3_mng_typ"),
				value(false).as("slo_sno3_flg"),
				value(false).as("rqmt_sno3_flg"),
				nullValue().as("sno3_num_typ"),
				nullValue().as("sno3_ptn_cd"),
				nullValue().as("sno4_mng_typ"),
				value(false).as("slo_sno4_flg"),
				value(false).as("rqmt_sno4_flg"),
				nullValue().as("sno4_num_typ"),
				nullValue().as("sno4_ptn_cd"),
				nullValue().as("mfg_inst_unit_typ"),
				nullValue().as("mrp_proc_typ"),
				nullValue().as("alloc_margin_days"),
				nullValue().as("mrp_alloc_margin_days"),
				nullValue().as("rqmt_rstr_qty"),
				value(false).as("inpt_itm_add_flg"),
				value(false).as("inpt_itm_del_flg"),
				value(false).as("sch_flg"),
				nullValue().as("cntry_org_cd"),
				nullValue().as("comp_spec_typ"),
				value(false).as("comp_rev_at_slo_flg"),
				value(false).as("comp_core_itm_flg"),
				nullValue().as("itm_spec_grp_cd"),
				value(false).as("slo_proc_flg"),
				nullValue().as("slo_proc_typ"),
				nullValue().as("ship_inst_typ"),
				value(false).as("ship_lot_back_stop_flg"),
				nullValue().as("itm_ship_grp_cd"),
				nullValue().as("ship_valid_grp_cd"),
				value(false).as("arr_skip_flg"),
				value(false).as("purc_dlv_slip_flg"),
				nullValue().as("ship_term_cd"),
				nullValue().as("exim_xpns_typ"),
				value(false).as("stk_lst_flg"),
				value(false).as("ver_flg"),
				nullValue().as("th_image"),
				nullValue().as("mrp_opn_xfr_days"),
				nullValue().as("itm_typ_d_nm"),
				nullValue().as("maker_nm"),
				nullValue().as("site_nm"),
				nullValue().as("loc_grp_nm"),
				nullValue().as("alloc_grp_nm"),
				nullValue().as("lg_grp_nm"),
				nullValue().as("cur_nm"),
				nullValue().as("cntry_nm"),
				nullValue().as("area_nm"),
				value(true).as("purc_flg"),
				value(true).as("asset_not_mng_flg"),
				value(false).as("repurc_obli_flg"),
				nullValue().as("outsrc_upri_typ"));
	}

	/**
	 * 購買ＦＬＧに対応する、品目マスタ（WG）ビュー検索のための結合条件（JOIN句）をbuilderに追加します。
	 * @param builder クエリAPIビルダー
	 * @param row バインド値を格納したrow
	 */
	protected void addJoinItmWgForInptAssist(MCQueryApiBuilder builder, MCRow row) {
		
		MAM_WG_R m2 = MAM_WG_R.create("M2");
		MAVM_ITM_WG_R m3 = MAVM_ITM_WG_R.create("M3");
		MAM_BP_R m5 = MAM_BP_R.create("M5");
		MAM_ITM_TYP_D_R m10 = MAM_ITM_TYP_D_R.create("M10");
		MAM_CNTRY_R m17 = MAM_CNTRY_R.create("M17");
		MAM_AREA_R m18 = MAM_AREA_R.create("M18");
		MAM_ITM_GRP_R m20 = MAM_ITM_GRP_R.create("M20");
		MAM_ITM_GRP_R m21 = MAM_ITM_GRP_R.create("M21");
		MAM_ITM_GRP_R m22 = MAM_ITM_GRP_R.create("M22");
		MAM_ITM_GRP_R m23 = MAM_ITM_GRP_R.create("M23");
		MAM_ITM_GRP_R m24 = MAM_ITM_GRP_R.create("M24");
		MAM_ITM_GRP_R m25 = MAM_ITM_GRP_R.create("M25");
		MAM_ITM_GRP_R m26 = MAM_ITM_GRP_R.create("M26");
		MAM_ITM_GRP_R m27 = MAM_ITM_GRP_R.create("M27");
		MAM_ITM_GRP_R m28 = MAM_ITM_GRP_R.create("M28");
		MAM_ITM_GRP_R m29 = MAM_ITM_GRP_R.create("M29");
		MAM_BP_GRP_R m30 = MAM_BP_GRP_R.create("M30");
		MAM_BP_GRP_R m31 = MAM_BP_GRP_R.create("M31");
		MAM_BP_GRP_R m32 = MAM_BP_GRP_R.create("M32");
		MAM_BP_GRP_R m33 = MAM_BP_GRP_R.create("M33");
		MAM_BP_GRP_R m34 = MAM_BP_GRP_R.create("M34");
		MAM_BP_GRP_R m35 = MAM_BP_GRP_R.create("M35");
		MAM_BP_GRP_R m36 = MAM_BP_GRP_R.create("M36");
		MAM_BP_GRP_R m37 = MAM_BP_GRP_R.create("M37");
		MAM_BP_GRP_R m38 = MAM_BP_GRP_R.create("M38");
		MAM_BP_GRP_R m39 = MAM_BP_GRP_R.create("M39");

		builder.addInnerJoin(m2, m2.wg_cd.eq(m3.wg_cd));
		builder.addLeftOuterJoin(m10, m3.itm_typ.eq(m10.itm_typ)
				.and(m3.itm_typ_d_cd.eq(m10.itm_typ_d_cd)));
		builder.addLeftOuterJoin(m17, m5.cntry_cd.eq(m17.cntry_cd));
		builder.addLeftOuterJoin(m18, m5.area_cd.eq(m18.area_cd));
		if (!isNull(row.getStringNE(ItmDtlCols.$i_itm_grp_nm1))) {
			builder.addInnerJoin(m20,
					m20.itm_grp_typ.eq(value(MAC_ITM_GRP_TYP.GRP1.value()))
					.and(m3.itm_grp_cd1.eq(m20.itm_grp_cd))
					.and(m20.itm_grp_nm.like(bind(ItmDtlCols.$i_itm_grp_nm1))));
		}
		if (!isNull(row.getStringNE(ItmDtlCols.$i_itm_grp_nm2))) {
			builder.addInnerJoin(m21,
					m21.itm_grp_typ.eq(value(MAC_ITM_GRP_TYP.GRP2.value()))
					.and(m3.itm_grp_cd2.eq(m21.itm_grp_cd))
					.and(m21.itm_grp_nm.like(bind(ItmDtlCols.$i_itm_grp_nm2))));
		}
		if (!isNull(row.getStringNE(ItmDtlCols.$i_itm_grp_nm3))) {
			builder.addInnerJoin(m22,
					m22.itm_grp_typ.eq(value(MAC_ITM_GRP_TYP.GRP3.value()))
					.and(m3.itm_grp_cd3.eq(m22.itm_grp_cd))
					.and(m22.itm_grp_nm.like(bind(ItmDtlCols.$i_itm_grp_nm3))));
		}
		if (!isNull(row.getStringNE(ItmDtlCols.$i_itm_grp_nm4))) {
			builder.addInnerJoin(m23,
					m23.itm_grp_typ.eq(value(MAC_ITM_GRP_TYP.GRP4.value()))
					.and(m3.itm_grp_cd4.eq(m23.itm_grp_cd))
					.and(m23.itm_grp_nm.like(bind(ItmDtlCols.$i_itm_grp_nm4))));
		}
		if (!isNull(row.getStringNE(ItmDtlCols.$i_itm_grp_nm5))) {
			builder.addInnerJoin(m24,
					m24.itm_grp_typ.eq(value(MAC_ITM_GRP_TYP.GRP5.value()))
					.and(m3.itm_grp_cd5.eq(m24.itm_grp_cd))
					.and(m24.itm_grp_nm.like(bind(ItmDtlCols.$i_itm_grp_nm5))));
		}
		if (!isNull(row.getStringNE(ItmDtlCols.$i_itm_grp_nm6))) {
			builder.addInnerJoin(m25,
					m25.itm_grp_typ.eq(value(MAC_ITM_GRP_TYP.GRP6.value()))
					.and(m3.itm_grp_cd6.eq(m25.itm_grp_cd))
					.and(m25.itm_grp_nm.like(bind(ItmDtlCols.$i_itm_grp_nm6))));
		}
		if (!isNull(row.getStringNE(ItmDtlCols.$i_itm_grp_nm7))) {
			builder.addInnerJoin(m26,
					m26.itm_grp_typ.eq(value(MAC_ITM_GRP_TYP.GRP7.value()))
					.and(m3.itm_grp_cd7.eq(m26.itm_grp_cd))
					.and(m26.itm_grp_nm.like(bind(ItmDtlCols.$i_itm_grp_nm7))));
		}
		if (!isNull(row.getStringNE(ItmDtlCols.$i_itm_grp_nm8))) {
			builder.addInnerJoin(m27,
					m27.itm_grp_typ.eq(value(MAC_ITM_GRP_TYP.GRP8.value()))
					.and(m3.itm_grp_cd8.eq(m27.itm_grp_cd))
					.and(m27.itm_grp_nm.like(bind(ItmDtlCols.$i_itm_grp_nm8))));
		}
		if (!isNull(row.getStringNE(ItmDtlCols.$i_itm_grp_nm9))) {
			builder.addInnerJoin(m28,
					m28.itm_grp_typ.eq(value(MAC_ITM_GRP_TYP.GRP9.value()))
					.and(m3.itm_grp_cd9.eq(m28.itm_grp_cd))
					.and(m28.itm_grp_nm.like(bind(ItmDtlCols.$i_itm_grp_nm9))));
		}
		if (!isNull(row.getStringNE(ItmDtlCols.$i_itm_grp_nm10))) {
			builder.addInnerJoin(m29,
					m29.itm_grp_typ.eq(value(MAC_ITM_GRP_TYP.GRP10.value()))
					.and(m3.itm_grp_cd10.eq(m29.itm_grp_cd))
					.and(m29.itm_grp_nm.like(bind(ItmDtlCols.$i_itm_grp_nm10))));
		}
		if (!isNull(row.getStringNE(ItmDtlCols.$i_itm_grp_nm1))) {
			builder.addInnerJoin(m30,
					m30.bp_grp_typ.eq(value(MAC_BP_GRP_TYP.GRP1.value()))
					.and(m5.bp_grp_cd1.eq(m30.bp_grp_cd))
					.and(m30.bp_grp_nm.like(bind(ItmDtlCols.$i_sppl_grp_nm1))));
		}
		if (!isNull(row.getStringNE(ItmDtlCols.$i_sppl_grp_nm2))) {
			builder.addInnerJoin(m31,
					m31.bp_grp_typ.eq(value(MAC_BP_GRP_TYP.GRP2.value()))
					.and(m5.bp_grp_cd2.eq(m31.bp_grp_cd))
					.and(m31.bp_grp_nm.like(bind(ItmDtlCols.$i_sppl_grp_nm2))));
		}
		if (!isNull(row.getStringNE(ItmDtlCols.$i_sppl_grp_nm3))) {
			builder.addInnerJoin(m32,
					m32.bp_grp_typ.eq(value(MAC_BP_GRP_TYP.GRP3.value()))
					.and(m5.bp_grp_cd3.eq(m32.bp_grp_cd))
					.and(m32.bp_grp_nm.like(bind(ItmDtlCols.$i_sppl_grp_nm3))));
		}
		if (!isNull(row.getStringNE(ItmDtlCols.$i_sppl_grp_nm4))) {
			builder.addInnerJoin(m33,
					m33.bp_grp_typ.eq(value(MAC_BP_GRP_TYP.GRP4.value()))
					.and(m5.bp_grp_cd4.eq(m33.bp_grp_cd))
					.and(m33.bp_grp_nm.like(bind(ItmDtlCols.$i_sppl_grp_nm4))));
		}
		if (!isNull(row.getStringNE(ItmDtlCols.$i_sppl_grp_nm5))) {
			builder.addInnerJoin(m34,
					m34.bp_grp_typ.eq(value(MAC_BP_GRP_TYP.GRP5.value()))
					.and(m5.bp_grp_cd5.eq(m34.bp_grp_cd))
					.and(m34.bp_grp_nm.like(bind(ItmDtlCols.$i_sppl_grp_nm5))));
		}
		if (!isNull(row.getStringNE(ItmDtlCols.$i_sppl_grp_nm6))) {
			builder.addInnerJoin(m35,
					m35.bp_grp_typ.eq(value(MAC_BP_GRP_TYP.GRP6.value()))
					.and(m5.bp_grp_cd6.eq(m35.bp_grp_cd))
					.and(m35.bp_grp_nm.like(bind(ItmDtlCols.$i_sppl_grp_nm6))));
		}
		if (!isNull(row.getStringNE(ItmDtlCols.$i_sppl_grp_nm7))) {
			builder.addInnerJoin(m36,
					m36.bp_grp_typ.eq(value(MAC_BP_GRP_TYP.GRP7.value()))
					.and(m5.bp_grp_cd7.eq(m36.bp_grp_cd))
					.and(m36.bp_grp_nm.like(bind(ItmDtlCols.$i_sppl_grp_nm7))));
		}
		if (!isNull(row.getStringNE(ItmDtlCols.$i_sppl_grp_nm8))) {
			builder.addInnerJoin(m37,
					m37.bp_grp_typ.eq(value(MAC_BP_GRP_TYP.GRP8.value()))
					.and(m5.bp_grp_cd8.eq(m37.bp_grp_cd))
					.and(m37.bp_grp_nm.like(bind(ItmDtlCols.$i_sppl_grp_nm8))));
		}
		if (!isNull(row.getStringNE(ItmDtlCols.$i_sppl_grp_nm9))) {
			builder.addInnerJoin(m38,
					m38.bp_grp_typ.eq(value(MAC_BP_GRP_TYP.GRP9.value()))
					.and(m5.bp_grp_cd9.eq(m38.bp_grp_cd))
					.and(m38.bp_grp_nm.like(bind(ItmDtlCols.$i_sppl_grp_nm9))));
		}
		if (!isNull(row.getStringNE(ItmDtlCols.$i_sppl_grp_nm10))) {
			builder.addInnerJoin(m39,
					m39.bp_grp_typ.eq(value(MAC_BP_GRP_TYP.GRP10.value()))
					.and(m5.bp_grp_cd10.eq(m39.bp_grp_cd))
					.and(m39.bp_grp_nm.like(bind(ItmDtlCols.$i_sppl_grp_nm10))));
		}
	}

	/**
	 * 購買ＦＬＧに対応する、品目マスタ（WG）ビュー検索のための直接入力条件（Where句）をbuilderに追加します。
	 * @param builder クエリAPIビルダー
	 */
	protected void addWhereItmWgForDirectInpt(MCQueryApiBuilder builder) {
		
		MAVM_ITM_DTL_PURC_R x1 = MAVM_ITM_DTL_PURC_R.create("X");
		MAVM_ITM_WG_R m3 = MAVM_ITM_WG_R.create("M3");

		builder.addWhereWithAnd(m3.asset_mng_typ.eq(value(MAC_ASSET_MNG_TYP.NOT_MNG.value())));
		builder.addWhereWithAnd(
				notExists(
						subQuery()
						.select(value("X"))
						.from(x1)
						.where(value(0).eq(value(0))
								.and(bind("dt").between(x1.st_dt, x1.end_dt))
								.and(x1.itm_cd.eq(m3.itm_cd))
								.and(x1.itm_sub1.eq(m3.itm_sub1))
								.and(x1.itm_sub2.eq(m3.itm_sub2))
								.and(x1.itm_sub3.eq(m3.itm_sub3))
								.and(x1.wg_cd.eq(m3.wg_cd))
								.cutoff$and(x1.sppl_cd.like(bind("sppl_cd"))))
						));
		builder.addWhereWithCutOffAnd(m3.wg_cd.eq(bind("wg_cd")));
		builder.addWhereWithCutOffAnd(m3.itm_cd.eq(bind("itm_cd")));
		builder.addWhereWithCutOffAnd(m3.itm_sub1.eq(bind("itm_sub1")));
		builder.addWhereWithCutOffAnd(m3.itm_sub2.eq(bind("itm_sub2")));
		builder.addWhereWithCutOffAnd(m3.itm_sub3.eq(bind("itm_sub3")));
		builder.addWhereWithCutOffAnd(nullValue().eq(bind("loc_cd")));
	}

	/**
	 * 購買ＦＬＧに対応する、品目マスタ（WG）ビュー検索のための入力補助条件（Where句）をbuilderに追加します。
	 * @param builder クエリAPIビルダー
	 */
	protected void addWhereItmWgForInptAssist(MCQueryApiBuilder builder) {
		
		MAVM_ITM_DTL_PURC_R x1 = MAVM_ITM_DTL_PURC_R.create("X");
		MAM_WG_R m2 = MAM_WG_R.create("M2");
		MAVM_ITM_WG_R m3 = MAVM_ITM_WG_R.create("M3");
		MAM_BP_R m5 = MAM_BP_R.create("M5");
		MAM_ITM_TYP_D_R m10 = MAM_ITM_TYP_D_R.create("M10");
		MAM_CNTRY_R m17 = MAM_CNTRY_R.create("M17");
		MAM_AREA_R m18 = MAM_AREA_R.create("M18");

		builder.addWhereWithAnd(m3.asset_mng_typ.eq(value(MAC_ASSET_MNG_TYP.NOT_MNG.value())));
		builder.addWhereWithAnd(
				notExists(
						subQuery()
						.select(value("X"))
						.from(x1)
						.where(value(0).eq(value(0))
								.and(bind("dt").between(x1.st_dt, x1.end_dt))
								.and(x1.itm_cd.eq(m3.itm_cd))
								.and(x1.itm_sub1.eq(m3.itm_sub1))
								.and(x1.itm_sub2.eq(m3.itm_sub2))
								.and(x1.itm_sub3.eq(m3.itm_sub3))
								.and(x1.wg_cd.eq(m3.wg_cd))
								.cutoff$and(x1.sppl_cd.like(bind("sppl_cd"))))
						));
		builder.addWhereWithCutOffAnd(m3.wg_cd.like(bind("wg_cd")));
		builder.addWhereWithCutOffAnd(m2.wg_nm.like(bind("wg_nm")));
		builder.addWhereWithCutOffAnd(m3.itm_cd.like(bind("itm_cd")));
		builder.addWhereWithCutOffAnd(m3.itm_sub1.like(bind("itm_sub1")));
		builder.addWhereWithCutOffAnd(m3.itm_sub2.like(bind("itm_sub2")));
		builder.addWhereWithCutOffAnd(m3.itm_sub3.like(bind("itm_sub3")));
		builder.addWhereWithCutOffAnd(m3.itm_nm.like(bind("itm_nm")));
		builder.addWhereWithCutOffAnd(m3.itm_alt_nm1.like(bind("itm_alt_nm1")));
		builder.addWhereWithCutOffAnd(m3.itm_alt_nm2.like(bind("itm_alt_nm2")));
		builder.addWhereWithCutOffAnd(m3.itm_alt_nm3.like(bind("itm_alt_nm3")));
		builder.addWhereWithCutOffAnd(m3.itm_alt_nm4.like(bind("itm_alt_nm4")));
		builder.addWhereWithCutOffAnd(m3.itm_typ.like(bind("itm_typ")));
		builder.addWhereWithCutOffAnd(m3.itm_typ_d_cd.like(bind("itm_typ_d_cd")));
		builder.addWhereWithCutOffAnd(m10.itm_typ_d_nm.like(bind("itm_typ_d_nm")));
		builder.addWhereWithCutOffAnd(m3.stk_mng_typ.like(bind("stk_mng_typ")));
		builder.addWhereWithCutOffAnd(m3.asset_mng_typ.like(bind("asset_mng_typ")));
		builder.addWhereWithCutOffAnd(nullValue().like(bind("loc_cd")));
		builder.addWhereWithCutOffAnd(nullValue().like(bind("loc_nm")));
		builder.addWhereWithCutOffAnd(nullValue().like(bind("site_cd")));
		builder.addWhereWithCutOffAnd(nullValue().like(bind("site_nm")));
		builder.addWhereWithCutOffAnd(nullValue().like(bind("lg_grp_cd")));
		builder.addWhereWithCutOffAnd(nullValue().like(bind("lg_grp_nm")));
		builder.addWhereWithCutOffAnd(nullValue().like(bind("alloc_grp_cd")));
		builder.addWhereWithCutOffAnd(nullValue().like(bind("alloc_grp_nm")));
		builder.addWhereWithCutOffAnd(nullValue().like(bind("loc_grp_cd")));
		builder.addWhereWithCutOffAnd(nullValue().like(bind("loc_grp_nm")));
		builder.addWhereWithCutOffAnd(nullValue().like(bind("loc_mng_typ")));
		builder.addWhereWithCutOffAnd(m5.bp_nm.like(bind("sppl_nm")));
		builder.addWhereWithCutOffAnd(m5.ein.like(bind("ein")));
		builder.addWhereWithCutOffAnd(m5.bp_alt_nm1.like(bind("sppl_alt_nm1")));
		builder.addWhereWithCutOffAnd(m5.bp_alt_nm2.like(bind("sppl_alt_nm2")));
		builder.addWhereWithCutOffAnd(m5.bp_alt_nm3.like(bind("sppl_alt_nm3")));
		builder.addWhereWithCutOffAnd(m5.bp_alt_nm4.like(bind("sppl_alt_nm4")));
		builder.addWhereWithCutOffAnd(m5.cntry_cd.like(bind("cntry_cd")));
		builder.addWhereWithCutOffAnd(m17.cntry_nm.like(bind("cntry_nm")));
		builder.addWhereWithCutOffAnd(m5.area_cd.like(bind("area_cd")));
		builder.addWhereWithCutOffAnd(m18.area_nm.like(bind("area_nm")));
		builder.addWhereWithCutOffAnd(m3.itm_grp_cd1.like(bind("itm_grp_cd1")));
		builder.addWhereWithCutOffAnd(m3.itm_grp_cd2.like(bind("itm_grp_cd2")));
		builder.addWhereWithCutOffAnd(m3.itm_grp_cd3.like(bind("itm_grp_cd3")));
		builder.addWhereWithCutOffAnd(m3.itm_grp_cd4.like(bind("itm_grp_cd4")));
		builder.addWhereWithCutOffAnd(m3.itm_grp_cd5.like(bind("itm_grp_cd5")));
		builder.addWhereWithCutOffAnd(m3.itm_grp_cd6.like(bind("itm_grp_cd6")));
		builder.addWhereWithCutOffAnd(m3.itm_grp_cd7.like(bind("itm_grp_cd7")));
		builder.addWhereWithCutOffAnd(m3.itm_grp_cd8.like(bind("itm_grp_cd8")));
		builder.addWhereWithCutOffAnd(m3.itm_grp_cd9.like(bind("itm_grp_cd9")));
		builder.addWhereWithCutOffAnd(m3.itm_grp_cd10.like(bind("itm_grp_cd10")));
		builder.addWhereWithCutOffAnd(m5.bp_grp_cd1.like(bind("sppl_grp_cd1")));
		builder.addWhereWithCutOffAnd(m5.bp_grp_cd2.like(bind("sppl_grp_cd2")));
		builder.addWhereWithCutOffAnd(m5.bp_grp_cd3.like(bind("sppl_grp_cd3")));
		builder.addWhereWithCutOffAnd(m5.bp_grp_cd4.like(bind("sppl_grp_cd4")));
		builder.addWhereWithCutOffAnd(m5.bp_grp_cd5.like(bind("sppl_grp_cd5")));
		builder.addWhereWithCutOffAnd(m5.bp_grp_cd6.like(bind("sppl_grp_cd6")));
		builder.addWhereWithCutOffAnd(m5.bp_grp_cd7.like(bind("sppl_grp_cd7")));
		builder.addWhereWithCutOffAnd(m5.bp_grp_cd8.like(bind("sppl_grp_cd8")));
		builder.addWhereWithCutOffAnd(m5.bp_grp_cd9.like(bind("sppl_grp_cd9")));
		builder.addWhereWithCutOffAnd(m5.bp_grp_cd10.like(bind("sppl_grp_cd10")));
		builder.addWhereWithCutOffAnd(nullValue().like(bind("memo1")));
		builder.addWhereWithCutOffAnd(nullValue().like(bind("memo2")));
		builder.addWhereWithCutOffAnd(nullValue().like(bind("memo3")));
		builder.addWhereWithCutOffAnd(m5.cntry_cd.neq(bind("own_cntry_cd")));
	}

	/**
	 * 外注ＦＬＧに対応するSELECT句をbuilderに追加します。
	 * @param builder クエリAPIビルダー
	 */
	protected void addSelectItmDtlMfgOutsrc(MCQueryApiBuilder builder) {
		
		MAVM_ITM_DTL_MFG_R m1 = (MAVM_ITM_DTL_MFG_R) builder.getBaseDbc();
		MAVM_WR_LOC_R m4 = MAVM_WR_LOC_R.create("M4");
		MAM_BP_R m5 = MAM_BP_R.create("M5");

		builder.addSelect(m1.wg_cd,
				nullValue().as("wg_nm"),
				m1.itm_cd,
				m1.itm_sub1,
				m1.itm_sub2,
				m1.itm_sub3,
				nullValue().as("itm_nm"),
				nullValue().as("itm_alt_nm1"),
				nullValue().as("itm_alt_nm2"),
				nullValue().as("itm_alt_nm3"),
				nullValue().as("itm_alt_nm4"),
				nullValue().as("itm_typ"),
				nullValue().as("itm_typ_d_cd"),
				nullValue().as("stk_mng_typ"),
				nullValue().as("asset_mng_typ"),
				value(false).as("sundry_itm_flg"),
				m1.mfg_loc_cd,
				m4.loc_nm.as("mfg_loc_nm"),
				m1.bom_ptn,
				m4.sppl_cd,
				nullValue().as("sppl_nm"),
				nvl(
					m4.maker_cd,
					value(MAC_STR.NULL_VAL.value())
				).as("maker_cd"),
				m1.rqst_loc_cd,
				nullValue().as("rqst_loc_nm"),
				m1.st_dt,
				m1.end_dt,
				m1.oper_ptn,
				m1.mfg_lt,
				m1.mfg_lt_add_qty,
				m1.purc_lt,
				m1.purc_lt_add_qty,
				m1.accpt_insp_lt,
				m1.buf_lt,
				m1.ord_fix_pd,
				m1.sz_day_week_typ,
				m1.sz_week,
				m1.lot_sz_pd,
				m1.min_lot_qty,
				m1.batch_lot_qty,
				m1.max_lot_qty,
				m1.max_order,
				m1.prio,
				m1.order_ratio,
				m1.yield_schd_qty,
				m1.mfg_inst_qty,
				m1.fxd_rqmt_qty,
				m1.lot_issue_typ,
				m1.bkf_flg,
				m1.ln_stk_flg,
				m1.pre_po_tgt_flg,
				m1.inst_rec_issue_flg,
				m1.no_mfg_aprv_flg,
				m1.itm_lower_yield,
				m1.itm_std_yield,
				m1.itm_upper_yield,
				m1.purc_id_typ,
				m1.rqst_wg_cd,
				m1.rsrc_std_qty1,
				m1.rsrc_unit_qty1,
				m1.rsrc_std_qty2,
				m1.rsrc_unit_qty2,
				m1.sno1,
				m1.sno2,
				m1.sno3,
				m1.sno4,
				m1.not_mrp_flg,
				m1.memo1,
				m1.memo2,
				m1.memo3,
				m1.ins_ts,
				m1.upd_ts,
				MAPA_TAX$F_GET_PURC_TAX_CD(
					m1.itm_cd,
					m1.itm_sub1,
					m1.itm_sub2,
					m1.itm_sub3,
					m4.sppl_cd,
					bind("dt")
				).as("purc_tax_cd"),
				MAPA_TAX$F_GET_PROV_TAX_CD(
					m1.itm_cd,
					m1.itm_sub1,
					m1.itm_sub2,
					m1.itm_sub3,
					m4.sppl_cd,
					bind("dt")
				).as("prov_tax_cd"),
				MAPA_LOC$F_GET_LOC_ADDR(
					m1.mfg_loc_cd,
					bind("dt"),
					value(MAC_LOC_ADDR_TYP.ZIP_CD.value()),
					nullValue()
				).as("zip_cd"),
				MAPA_LOC$F_GET_LOC_ADDR(
					m1.mfg_loc_cd,
					bind("dt"),
					value(MAC_LOC_ADDR_TYP.ADDR1.value()),
					nullValue()
				).as("addr1"),
				MAPA_LOC$F_GET_LOC_ADDR(
					m1.mfg_loc_cd,
					bind("dt"),
					value(MAC_LOC_ADDR_TYP.ADDR2.value()),
					nullValue()
				).as("addr2"),
				MAPA_LOC$F_GET_LOC_ADDR(
					m1.mfg_loc_cd,
					bind("dt"),
					value(MAC_LOC_ADDR_TYP.ADDR3.value()),
					nullValue()
				).as("addr3"),
				MAPA_LOC$F_GET_LOC_ADDR(
					m1.mfg_loc_cd,
					bind("dt"),
					value(MAC_LOC_ADDR_TYP.ADDR4.value()),
					nullValue()
				).as("addr4"),
				MAPA_LOC$F_GET_LOC_ADDR(
					m1.mfg_loc_cd,
					bind("dt"),
					value(MAC_LOC_ADDR_TYP.TEL.value()),
					nullValue()
				).as("tel"),
				MAPA_LOC$F_GET_LOC_ADDR(
					m1.mfg_loc_cd,
					bind("dt"),
					value(MAC_LOC_ADDR_TYP.FAX.value()),
					nullValue()
				).as("fax"),
				value(false).as("purc_upri_cng_flg"),
				value(false).as("prov_upri_cng_flg"),
				nullValue().as("cur_cd"),
				nullValue().as("cntry_cd"),
				value(false).as("foreign_flg"),
				nullValue().as("area_cd"),
				MAPA_LOC$F_GET_ASST_DPT_CD_NE(
					m1.mfg_loc_cd,
					bind("dt"),
					value(false)
				).as("asst_dpt_cd"),
				MAPA_LOC$F_GET_SLS_DPT_CD_NE(
					m1.mfg_loc_cd,
					bind("dt"),
					value(false)
				).as("sls_dpt_cd"),
				m4.site_cd,
				m4.lg_grp_cd,
				m4.lg_def_flg,
				m4.loc_grp_cd,
				m4.alloc_grp_cd,
				m4.pre_outsrc_act_flg,
				m4.ddlv_prov_insp_flg,
				m4.cal_cd.as("loc_cal_cd"),
				m4.loc_mng_typ,
				m4.str_ln_tgt_flg,
				m4.alloc_lmt_flg,
				m4.gi_pack_xfer_flg,
				m4.gi_vmi_flg,
				m4.rsrc_cd1,
				m4.rsrc_cd2,
				nullValue().as("prnt_lcl_cd"),
				nullValue().as("asppl_cd"),
				MAPA_BP$F_GET_VMI_PURC_DPT_CD_NE(
					m4.sppl_cd,
					bind("dt"),
					value(false)
				).as("vmi_purc_dpt_cd"),
				value(false).as("subcon_flg"),
				nullValue().as("po_print_cd"),
				nullValue().as("sppl_ship_form_cd"),
				nullValue().as("pay_crryovr_times"),
				MAPA_BP$F_GET_BP_ADDR(
					m4.sppl_cd,
					bind("dt"),
					value(MAC_BP_ADDR_TYP.SPPL_CNTCT_DPT.value())
				).as("sppl_cntct_dpt"),
				MAPA_BP$F_GET_BP_ADDR(
					m4.sppl_cd,
					bind("dt"),
					value(MAC_BP_ADDR_TYP.SPPL_CNTCT_PSN.value())
				).as("sppl_cntct_psn"),
				MAPA_BP$F_GET_BP_ADDR(
					m4.sppl_cd,
					bind("dt"),
					value(MAC_BP_ADDR_TYP.SPPL_CNTCT_PSN_TITLE.value())
				).as("sppl_cntct_psn_title"),
				nullValue().as("purc_upri_req_typ"),
				nullValue().as("purc_amt_rnd_typ"),
				nullValue().as("purc_tax_rnd_typ"),
				nullValue().as("purc_tax_calc_typ"),
				value(false).as("wrk_po_flg"),
				value(false).as("wrk_ap_flg"),
				nullValue().as("prov_rcv_typ"),
				value(false).as("onr_prsppl_flg"),
				nullValue().as("prov_basis_typ"),
				nullValue().as("prov_amt_rnd_typ"),
				nullValue().as("prov_tax_rnd_typ"),
				nullValue().as("prov_tax_calc_typ"),
				nullValue().as("sppl_cal_cd"),
				value(false).as("sppl_iv_flg"),
				value(false).as("prms_recv_flg"),
				nullValue().as("sppl_tterm_cd1"),
				nullValue().as("sppl_tterm_cd2"),
				nullValue().as("sppl_tterm_cd3"),
				value(false).as("dscnt_itm_flg"),
				nullValue().as("unit_cd"),
				nullValue().as("unit_nm"),
				nullValue().as("dec_place"),
				nullValue().as("rnd_typ"),
				nullValue().as("dim_unit_cd"),
				nullValue().as("dim"),
				nullValue().as("wt_unit_cd"),
				nullValue().as("wt"),
				nullValue().as("conts_unit_cd"),
				nullValue().as("conts_qty"),
				nullValue().as("hs_cd"),
				nullValue().as("itm_jnl_cd"),
				nullValue().as("ac_itm_grp_cd"),
				value(false).as("minus_stk_flg"),
				value(false).as("not_new_lot_flg"),
				value(false).as("gi_alloc_flg"),
				MAPA_TAX$F_GET_WTAX_RATE(
					m1.itm_cd,
					m1.itm_sub1,
					m1.itm_sub2,
					m1.itm_sub3,
					bind("dt")
				).as("wtax_rate"),
				nullValue().as("ship_unit_cd"),
				nullValue().as("mfg_unit_cd"),
				nullValue().as("purc_unit_cd"),
				nullValue().as("pckg_unit_cd"),
				value(false).as("pack_alloc_flg"),
				nullValue().as("lot_mng_typ"),
				nullValue().as("lot_no_typ"),
				nullValue().as("lot_no_ptn_cd"),
				nullValue().as("sublot_mng_typ"),
				nullValue().as("sublot_no_typ"),
				nullValue().as("sublot_no_ptn_cd"),
				value(false).as("bp_lot_flg"),
				nullValue().as("insp_bind_typ"),
				value(false).as("skip_chk_ship_flg"),
				value(false).as("mrkt_judg_flg"),
				nullValue().as("mrkt_judg_role_cd"),
				value(false).as("lmt_ctl_flg"),
				nullValue().as("lmt_ctl_categ"),
				value(false).as("cont_fctr_flg"),
				nullValue().as("std_cont_fctr"),
				nullValue().as("cont_fctr_unit_cd"),
				nullValue().as("cont_fctr_unit_nm"),
				nullValue().as("cont_fctr_rnd_typ"),
				nullValue().as("cont_fctr_dec_place"),
				nullValue().as("sno1_mng_typ"),
				value(false).as("slo_sno1_flg"),
				value(false).as("rqmt_sno1_flg"),
				nullValue().as("sno1_num_typ"),
				nullValue().as("sno1_ptn_cd"),
				nullValue().as("sno2_mng_typ"),
				value(false).as("slo_sno2_flg"),
				value(false).as("rqmt_sno2_flg"),
				nullValue().as("sno2_num_typ"),
				nullValue().as("sno2_ptn_cd"),
				nullValue().as("sno3_mng_typ"),
				value(false).as("slo_sno3_flg"),
				value(false).as("rqmt_sno3_flg"),
				nullValue().as("sno3_num_typ"),
				nullValue().as("sno3_ptn_cd"),
				nullValue().as("sno4_mng_typ"),
				value(false).as("slo_sno4_flg"),
				value(false).as("rqmt_sno4_flg"),
				nullValue().as("sno4_num_typ"),
				nullValue().as("sno4_ptn_cd"),
				nullValue().as("mfg_inst_unit_typ"),
				nullValue().as("mrp_proc_typ"),
				nullValue().as("alloc_margin_days"),
				nullValue().as("mrp_alloc_margin_days"),
				nullValue().as("rqmt_rstr_qty"),
				value(false).as("inpt_itm_add_flg"),
				value(false).as("inpt_itm_del_flg"),
				value(false).as("sch_flg"),
				nullValue().as("cntry_org_cd"),
				nullValue().as("comp_spec_typ"),
				value(false).as("comp_rev_at_slo_flg"),
				value(false).as("comp_core_itm_flg"),
				nullValue().as("itm_spec_grp_cd"),
				value(false).as("slo_proc_flg"),
				nullValue().as("slo_proc_typ"),
				nullValue().as("ship_inst_typ"),
				value(false).as("ship_lot_back_stop_flg"),
				nullValue().as("itm_ship_grp_cd"),
				nullValue().as("ship_valid_grp_cd"),
				value(false).as("arr_skip_flg"),
				value(false).as("purc_dlv_slip_flg"),
				nullValue().as("ship_term_cd"),
				nullValue().as("exim_xpns_typ"),
				value(false).as("stk_lst_flg"),
				value(false).as("ver_flg"),
				nullValue().as("th_image"),
				nullValue().as("mrp_opn_xfr_days"),
				nullValue().as("itm_typ_d_nm"),
				nullValue().as("maker_nm"),
				nullValue().as("site_nm"),
				nullValue().as("loc_grp_nm"),
				nullValue().as("alloc_grp_nm"),
				nullValue().as("lg_grp_nm"),
				nullValue().as("cur_nm"),
				nullValue().as("cntry_nm"),
				nullValue().as("area_nm"),
				value(true).as("outsrc_flg"),
				m5.repurc_obli_flg,
				nvl(m5.outsrc_upri_typ, value(MAUCL_AppSys.getCo().outsrc_upri_typ())).as("outsrc_upri_typ"));
	}

	/**
	 * 外注ＦＬＧに対応する結合条件（JOIN句）をbuilderに追加します。
	 * @param builder クエリAPIビルダー
	 * @param row バインド値を格納したrow
	 */
	protected void addJoinItmDtlMfgOutsrcForInptAssist(MCQueryApiBuilder builder, MCRow row) {
		
		MAVM_ITM_DTL_MFG_R m1 = (MAVM_ITM_DTL_MFG_R) builder.getBaseDbc();
		MAM_WG_R m2 = MAM_WG_R.create("M2");
		MAVM_ITM_WG_R m3 = MAVM_ITM_WG_R.create("M3");
		MAVM_WR_LOC_R m4 = MAVM_WR_LOC_R.create("M4");
		MAM_BP_R m5 = MAM_BP_R.create("M5");
		MAM_ITM_TYP_D_R m10 = MAM_ITM_TYP_D_R.create("M10");
		MAM_SITE_R m11 = MAM_SITE_R.create("M11");
		MAM_LOC_GRP_R m12 = MAM_LOC_GRP_R.create("M12");
		MAM_ALLOC_GRP_R m13 = MAM_ALLOC_GRP_R.create("M13");
		MAM_LG_GRP_R m14 = MAM_LG_GRP_R.create("M14");
		MAM_CNTRY_R m17 = MAM_CNTRY_R.create("M17");
		MAM_AREA_R m18 = MAM_AREA_R.create("M18");
		MAM_ITM_GRP_R m20 = MAM_ITM_GRP_R.create("M20");
		MAM_ITM_GRP_R m21 = MAM_ITM_GRP_R.create("M21");
		MAM_ITM_GRP_R m22 = MAM_ITM_GRP_R.create("M22");
		MAM_ITM_GRP_R m23 = MAM_ITM_GRP_R.create("M23");
		MAM_ITM_GRP_R m24 = MAM_ITM_GRP_R.create("M24");
		MAM_ITM_GRP_R m25 = MAM_ITM_GRP_R.create("M25");
		MAM_ITM_GRP_R m26 = MAM_ITM_GRP_R.create("M26");
		MAM_ITM_GRP_R m27 = MAM_ITM_GRP_R.create("M27");
		MAM_ITM_GRP_R m28 = MAM_ITM_GRP_R.create("M28");
		MAM_ITM_GRP_R m29 = MAM_ITM_GRP_R.create("M29");
		MAM_BP_GRP_R m30 = MAM_BP_GRP_R.create("M30");
		MAM_BP_GRP_R m31 = MAM_BP_GRP_R.create("M31");
		MAM_BP_GRP_R m32 = MAM_BP_GRP_R.create("M32");
		MAM_BP_GRP_R m33 = MAM_BP_GRP_R.create("M33");
		MAM_BP_GRP_R m34 = MAM_BP_GRP_R.create("M34");
		MAM_BP_GRP_R m35 = MAM_BP_GRP_R.create("M35");
		MAM_BP_GRP_R m36 = MAM_BP_GRP_R.create("M36");
		MAM_BP_GRP_R m37 = MAM_BP_GRP_R.create("M37");
		MAM_BP_GRP_R m38 = MAM_BP_GRP_R.create("M38");
		MAM_BP_GRP_R m39 = MAM_BP_GRP_R.create("M39");

		builder.addInnerJoin(m2, m1.wg_cd.eq(m2.wg_cd));
		builder.addInnerJoin(m3,
				m1.itm_cd.eq(m3.itm_cd)
				.and(m1.itm_sub1.eq(m3.itm_sub1))
				.and(m1.itm_sub2.eq(m3.itm_sub2))
				.and(m1.itm_sub3.eq(m3.itm_sub3))
				.and(m1.wg_cd.eq(m3.wg_cd)));
		builder.addLeftOuterJoin(m10,
				m3.itm_typ.eq(m10.itm_typ)
				.and(m3.itm_typ_d_cd.eq(m10.itm_typ_d_cd)));
		builder.addLeftOuterJoin(m11, m4.site_cd.eq(m11.site_cd));
		builder.addLeftOuterJoin(m12, m4.loc_grp_cd.eq(m12.loc_grp_cd));
		builder.addLeftOuterJoin(m13, m4.alloc_grp_cd.eq(m13.alloc_grp_cd));
		builder.addLeftOuterJoin(m14, m4.lg_grp_cd.eq(m14.lg_grp_cd));
		builder.addLeftOuterJoin(m17, m5.cntry_cd.eq(m17.cntry_cd));
		builder.addLeftOuterJoin(m18, m5.area_cd.eq(m18.area_cd));
		if (!isNull(row.getStringNE(ItmDtlCols.$i_itm_grp_nm1))) {
			builder.addInnerJoin(m20,
					m20.itm_grp_typ.eq(value(MAC_ITM_GRP_TYP.GRP1.value()))
					.and(m3.itm_grp_cd1.eq(m20.itm_grp_cd))
					.and(m20.itm_grp_nm.like(bind(ItmDtlCols.$i_itm_grp_nm1))));
		}
		if (!isNull(row.getStringNE(ItmDtlCols.$i_itm_grp_nm2))) {
			builder.addInnerJoin(m21,
					m21.itm_grp_typ.eq(value(MAC_ITM_GRP_TYP.GRP2.value()))
					.and(m3.itm_grp_cd2.eq(m21.itm_grp_cd))
					.and(m21.itm_grp_nm.like(bind(ItmDtlCols.$i_itm_grp_nm2))));
		}
		if (!isNull(row.getStringNE(ItmDtlCols.$i_itm_grp_nm3))) {
			builder.addInnerJoin(m22,
					m22.itm_grp_typ.eq(value(MAC_ITM_GRP_TYP.GRP3.value()))
					.and(m3.itm_grp_cd3.eq(m22.itm_grp_cd))
					.and(m22.itm_grp_nm.like(bind(ItmDtlCols.$i_itm_grp_nm3))));
		}
		if (!isNull(row.getStringNE(ItmDtlCols.$i_itm_grp_nm4))) {
			builder.addInnerJoin(m23,
					m23.itm_grp_typ.eq(value(MAC_ITM_GRP_TYP.GRP4.value()))
					.and(m3.itm_grp_cd4.eq(m23.itm_grp_cd))
					.and(m23.itm_grp_nm.like(bind(ItmDtlCols.$i_itm_grp_nm4))));
		}
		if (!isNull(row.getStringNE(ItmDtlCols.$i_itm_grp_nm5))) {
			builder.addInnerJoin(m24,
					m24.itm_grp_typ.eq(value(MAC_ITM_GRP_TYP.GRP5.value()))
					.and(m3.itm_grp_cd5.eq(m24.itm_grp_cd))
					.and(m24.itm_grp_nm.like(bind(ItmDtlCols.$i_itm_grp_nm5))));
		}
		if (!isNull(row.getStringNE(ItmDtlCols.$i_itm_grp_nm6))) {
			builder.addInnerJoin(m25,
					m25.itm_grp_typ.eq(value(MAC_ITM_GRP_TYP.GRP6.value()))
					.and(m3.itm_grp_cd6.eq(m25.itm_grp_cd))
					.and(m25.itm_grp_nm.like(bind(ItmDtlCols.$i_itm_grp_nm6))));
		}
		if (!isNull(row.getStringNE(ItmDtlCols.$i_itm_grp_nm7))) {
			builder.addInnerJoin(m26,
					m26.itm_grp_typ.eq(value(MAC_ITM_GRP_TYP.GRP7.value()))
					.and(m3.itm_grp_cd7.eq(m26.itm_grp_cd))
					.and(m26.itm_grp_nm.like(bind(ItmDtlCols.$i_itm_grp_nm7))));
		}
		if (!isNull(row.getStringNE(ItmDtlCols.$i_itm_grp_nm8))) {
			builder.addInnerJoin(m27,
					m27.itm_grp_typ.eq(value(MAC_ITM_GRP_TYP.GRP8.value()))
					.and(m3.itm_grp_cd8.eq(m27.itm_grp_cd))
					.and(m27.itm_grp_nm.like(bind(ItmDtlCols.$i_itm_grp_nm8))));
		}
		if (!isNull(row.getStringNE(ItmDtlCols.$i_itm_grp_nm9))) {
			builder.addInnerJoin(m28,
					m28.itm_grp_typ.eq(value(MAC_ITM_GRP_TYP.GRP9.value()))
					.and(m3.itm_grp_cd9.eq(m28.itm_grp_cd))
					.and(m28.itm_grp_nm.like(bind(ItmDtlCols.$i_itm_grp_nm9))));
		}
		if (!isNull(row.getStringNE(ItmDtlCols.$i_itm_grp_nm10))) {
			builder.addInnerJoin(m29,
					m29.itm_grp_typ.eq(value(MAC_ITM_GRP_TYP.GRP10.value()))
					.and(m3.itm_grp_cd10.eq(m29.itm_grp_cd))
					.and(m29.itm_grp_nm.like(bind(ItmDtlCols.$i_itm_grp_nm10))));
		}
		if (!isNull(row.getStringNE(ItmDtlCols.$i_sppl_grp_nm1))) {
			builder.addInnerJoin(m30,
					m30.bp_grp_typ.eq(value(MAC_BP_GRP_TYP.GRP1.value()))
					.and(m5.bp_grp_cd1.eq(m30.bp_grp_cd))
					.and(m30.bp_grp_nm.like(bind(ItmDtlCols.$i_sppl_grp_nm1))));
		}
		if (!isNull(row.getStringNE(ItmDtlCols.$i_sppl_grp_nm2))) {
			builder.addInnerJoin(m31,
					m31.bp_grp_typ.eq(value(MAC_BP_GRP_TYP.GRP2.value()))
					.and(m5.bp_grp_cd2.eq(m31.bp_grp_cd))
					.and(m31.bp_grp_nm.like(bind(ItmDtlCols.$i_sppl_grp_nm2))));
		}
		if (!isNull(row.getStringNE(ItmDtlCols.$i_sppl_grp_nm3))) {
			builder.addInnerJoin(m32,
					m32.bp_grp_typ.eq(value(MAC_BP_GRP_TYP.GRP3.value()))
					.and(m5.bp_grp_cd3.eq(m32.bp_grp_cd))
					.and(m32.bp_grp_nm.like(bind(ItmDtlCols.$i_sppl_grp_nm3))));
		}
		if (!isNull(row.getStringNE(ItmDtlCols.$i_sppl_grp_nm4))) {
			builder.addInnerJoin(m33,
					m33.bp_grp_typ.eq(value(MAC_BP_GRP_TYP.GRP4.value()))
					.and(m5.bp_grp_cd4.eq(m33.bp_grp_cd))
					.and(m33.bp_grp_nm.like(bind(ItmDtlCols.$i_sppl_grp_nm4))));
		}
		if (!isNull(row.getStringNE(ItmDtlCols.$i_sppl_grp_nm5))) {
			builder.addInnerJoin(m34,
					m34.bp_grp_typ.eq(value(MAC_BP_GRP_TYP.GRP5.value()))
					.and(m5.bp_grp_cd5.eq(m34.bp_grp_cd))
					.and(m34.bp_grp_nm.like(bind(ItmDtlCols.$i_sppl_grp_nm5))));
		}
		if (!isNull(row.getStringNE(ItmDtlCols.$i_sppl_grp_nm6))) {
			builder.addInnerJoin(m35,
					m35.bp_grp_typ.eq(value(MAC_BP_GRP_TYP.GRP6.value()))
					.and(m5.bp_grp_cd6.eq(m35.bp_grp_cd))
					.and(m35.bp_grp_nm.like(bind(ItmDtlCols.$i_sppl_grp_nm6))));
		}
		if (!isNull(row.getStringNE(ItmDtlCols.$i_sppl_grp_nm7))) {
			builder.addInnerJoin(m36,
					m36.bp_grp_typ.eq(value(MAC_BP_GRP_TYP.GRP7.value()))
					.and(m5.bp_grp_cd7.eq(m36.bp_grp_cd))
					.and(m36.bp_grp_nm.like(bind(ItmDtlCols.$i_sppl_grp_nm7))));
		}
		if (!isNull(row.getStringNE(ItmDtlCols.$i_sppl_grp_nm8))) {
			builder.addInnerJoin(m37,
					m37.bp_grp_typ.eq(value(MAC_BP_GRP_TYP.GRP8.value()))
					.and(m5.bp_grp_cd8.eq(m37.bp_grp_cd))
					.and(m37.bp_grp_nm.like(bind(ItmDtlCols.$i_sppl_grp_nm8))));
		}
		if (!isNull(row.getStringNE(ItmDtlCols.$i_sppl_grp_nm9))) {
			builder.addInnerJoin(m38,
					m38.bp_grp_typ.eq(value(MAC_BP_GRP_TYP.GRP9.value()))
					.and(m5.bp_grp_cd9.eq(m38.bp_grp_cd))
					.and(m38.bp_grp_nm.like(bind(ItmDtlCols.$i_sppl_grp_nm9))));
		}
		if (!isNull(row.getStringNE(ItmDtlCols.$i_sppl_grp_nm10))) {
				builder.addInnerJoin(m39,
						m39.bp_grp_typ.eq(value(MAC_BP_GRP_TYP.GRP10.value()))
						.and(m5.bp_grp_cd10.eq(m39.bp_grp_cd))
						.and(m39.bp_grp_nm.like(bind(ItmDtlCols.$i_sppl_grp_nm10))));
		}
	}

	/**
	 * 外注ＦＬＧに対応する直接入力条件（Where句）をbuilderに追加します。
	 * @param builder クエリAPIビルダー
	 */
	protected void addWhereItmDtlMfgOutsrcForDirectInpt(MCQueryApiBuilder builder) {
		
		MAVM_ITM_DTL_MFG_R m1 = (MAVM_ITM_DTL_MFG_R) builder.getBaseDbc();
		MAVM_WR_LOC_R m4 = MAVM_WR_LOC_R.create("M4");

		builder.setWhere(value(0).eq(value(0)));
		builder.addWhereWithAnd(bind("dt").between(m1.st_dt, m1.end_dt));
		builder.addWhereWithCutOffAnd(m1.wg_cd.eq(bind("wg_cd")));
		builder.addWhereWithCutOffAnd(m1.itm_cd.eq(bind("itm_cd")));
		builder.addWhereWithCutOffAnd(m1.itm_sub1.eq(bind("itm_sub1")));
		builder.addWhereWithCutOffAnd(m1.itm_sub2.eq(bind("itm_sub2")));
		builder.addWhereWithCutOffAnd(m1.itm_sub3.eq(bind("itm_sub3")));
		builder.addWhereWithCutOffAnd(m1.mfg_loc_cd.eq(bind("mfg_loc_cd")));
		builder.addWhereWithCutOffAnd(m4.sppl_cd.eq(bind("sppl_cd")));
	}

	/**
	 * 外注ＦＬＧに対応する入力補助条件（Where句）をbuilderに追加します。
	 * @param builder クエリAPIビルダー
	 */
	protected void addWhereItmDtlMfgOutsrcForInputAssist(MCQueryApiBuilder builder) {
		
		MAVM_ITM_DTL_MFG_R m1 = (MAVM_ITM_DTL_MFG_R) builder.getBaseDbc();
		MAM_WG_R m2 = MAM_WG_R.create("M2");
		MAVM_ITM_WG_R m3 = MAVM_ITM_WG_R.create("M3");
		MAVM_WR_LOC_R m4 = MAVM_WR_LOC_R.create("M4");
		MAM_BP_R m5 = MAM_BP_R.create("M5");
		MAM_ITM_TYP_D_R m10 = MAM_ITM_TYP_D_R.create("M10");
		MAM_SITE_R m11 = MAM_SITE_R.create("M11");
		MAM_LOC_GRP_R m12 = MAM_LOC_GRP_R.create("M12");
		MAM_ALLOC_GRP_R m13 = MAM_ALLOC_GRP_R.create("M13");
		MAM_LG_GRP_R m14 = MAM_LG_GRP_R.create("M14");
		MAM_CNTRY_R m17 = MAM_CNTRY_R.create("M17");
		MAM_AREA_R m18 = MAM_AREA_R.create("M18");

		builder.setWhere(value(0).eq(value(0)));
		builder.addWhereWithAnd(bind("dt").between(m1.st_dt, m1.end_dt));
		builder.addWhereWithCutOffAnd(m1.wg_cd.like(bind("wg_cd")));
		builder.addWhereWithCutOffAnd(m2.wg_nm.like(bind("wg_nm")));
		builder.addWhereWithCutOffAnd(m1.itm_cd.like(bind("itm_cd")));
		builder.addWhereWithCutOffAnd(m1.itm_sub1.like(bind("itm_sub1")));
		builder.addWhereWithCutOffAnd(m1.itm_sub2.like(bind("itm_sub2")));
		builder.addWhereWithCutOffAnd(m1.itm_sub3.like(bind("itm_sub3")));
		builder.addWhereWithCutOffAnd(m3.itm_nm.like(bind("itm_nm")));
		builder.addWhereWithCutOffAnd(m3.itm_alt_nm1.like(bind("itm_alt_nm1")));
		builder.addWhereWithCutOffAnd(m3.itm_alt_nm2.like(bind("itm_alt_nm2")));
		builder.addWhereWithCutOffAnd(m3.itm_alt_nm3.like(bind("itm_alt_nm3")));
		builder.addWhereWithCutOffAnd(m3.itm_alt_nm4.like(bind("itm_alt_nm4")));
		builder.addWhereWithCutOffAnd(m3.itm_typ.like(bind("itm_typ")));
		builder.addWhereWithCutOffAnd(m3.itm_typ_d_cd.like(bind("itm_typ_d_cd")));
		builder.addWhereWithCutOffAnd(m10.itm_typ_d_nm.like(bind("itm_typ_d_nm")));
		builder.addWhereWithCutOffAnd(m3.stk_mng_typ.like(bind("stk_mng_typ")));
		builder.addWhereWithCutOffAnd(m3.asset_mng_typ.like(bind("asset_mng_typ")));
		builder.addWhereWithCutOffAnd(m1.mfg_loc_cd.like(bind("mfg_loc_cd")));
		builder.addWhereWithCutOffAnd(m4.loc_nm.like(bind("mfg_loc_nm")));
		builder.addWhereWithCutOffAnd(m4.site_cd.like(bind("site_cd")));
		builder.addWhereWithCutOffAnd(m11.site_nm.like(bind("site_nm")));
		builder.addWhereWithCutOffAnd(m4.lg_grp_cd.like(bind("lg_grp_cd")));
		builder.addWhereWithCutOffAnd(m14.lg_grp_nm.like(bind("lg_grp_nm")));
		builder.addWhereWithCutOffAnd(m4.alloc_grp_cd.like(bind("alloc_grp_cd")));
		builder.addWhereWithCutOffAnd(m13.alloc_grp_nm.like(bind("alloc_grp_nm")));
		builder.addWhereWithCutOffAnd(m4.loc_grp_cd.like(bind("loc_grp_cd")));
		builder.addWhereWithCutOffAnd(m12.loc_grp_nm.like(bind("loc_grp_nm")));
		builder.addWhereWithCutOffAnd(m4.loc_mng_typ.like(bind("loc_mng_typ")));
		builder.addWhereWithCutOffAnd(m4.sppl_cd.like(bind("sppl_cd")));
		builder.addWhereWithCutOffAnd(m5.bp_nm.like(bind("sppl_nm")));
		builder.addWhereWithCutOffAnd(m5.ein.like(bind("ein")));
		builder.addWhereWithCutOffAnd(m5.bp_alt_nm1.like(bind("sppl_alt_nm1")));
		builder.addWhereWithCutOffAnd(m5.bp_alt_nm2.like(bind("sppl_alt_nm2")));
		builder.addWhereWithCutOffAnd(m5.bp_alt_nm3.like(bind("sppl_alt_nm3")));
		builder.addWhereWithCutOffAnd(m5.bp_alt_nm4.like(bind("sppl_alt_nm4")));
		builder.addWhereWithCutOffAnd(m5.cntry_cd.like(bind("cntry_cd")));
		builder.addWhereWithCutOffAnd(m17.cntry_nm.like(bind("cntry_nm")));
		builder.addWhereWithCutOffAnd(m5.area_cd.like(bind("area_cd")));
		builder.addWhereWithCutOffAnd(m18.area_nm.like(bind("area_nm")));
		builder.addWhereWithCutOffAnd(m3.itm_grp_cd1.like(bind("itm_grp_cd1")));
		builder.addWhereWithCutOffAnd(m3.itm_grp_cd2.like(bind("itm_grp_cd2")));
		builder.addWhereWithCutOffAnd(m3.itm_grp_cd3.like(bind("itm_grp_cd3")));
		builder.addWhereWithCutOffAnd(m3.itm_grp_cd4.like(bind("itm_grp_cd4")));
		builder.addWhereWithCutOffAnd(m3.itm_grp_cd5.like(bind("itm_grp_cd5")));
		builder.addWhereWithCutOffAnd(m3.itm_grp_cd6.like(bind("itm_grp_cd6")));
		builder.addWhereWithCutOffAnd(m3.itm_grp_cd7.like(bind("itm_grp_cd7")));
		builder.addWhereWithCutOffAnd(m3.itm_grp_cd8.like(bind("itm_grp_cd8")));
		builder.addWhereWithCutOffAnd(m3.itm_grp_cd9.like(bind("itm_grp_cd9")));
		builder.addWhereWithCutOffAnd(m3.itm_grp_cd10.like(bind("itm_grp_cd10")));
		builder.addWhereWithCutOffAnd(m5.bp_grp_cd1.like(bind("sppl_grp_cd1")));
		builder.addWhereWithCutOffAnd(m5.bp_grp_cd2.like(bind("sppl_grp_cd2")));
		builder.addWhereWithCutOffAnd(m5.bp_grp_cd3.like(bind("sppl_grp_cd3")));
		builder.addWhereWithCutOffAnd(m5.bp_grp_cd4.like(bind("sppl_grp_cd4")));
		builder.addWhereWithCutOffAnd(m5.bp_grp_cd5.like(bind("sppl_grp_cd5")));
		builder.addWhereWithCutOffAnd(m5.bp_grp_cd6.like(bind("sppl_grp_cd6")));
		builder.addWhereWithCutOffAnd(m5.bp_grp_cd7.like(bind("sppl_grp_cd7")));
		builder.addWhereWithCutOffAnd(m5.bp_grp_cd8.like(bind("sppl_grp_cd8")));
		builder.addWhereWithCutOffAnd(m5.bp_grp_cd9.like(bind("sppl_grp_cd9")));
		builder.addWhereWithCutOffAnd(m5.bp_grp_cd10.like(bind("sppl_grp_cd10")));
		builder.addWhereWithCutOffAnd(m1.memo1.like(bind("memo1")));
		builder.addWhereWithCutOffAnd(m1.memo2.like(bind("memo2")));
		builder.addWhereWithCutOffAnd(m1.memo3.like(bind("memo3")));
		builder.addWhereWithCutOffAnd(m5.cntry_cd.neq(bind("own_cntry_cd")));

	}

	/**
	 * ＷＧ間依頼ＦＬＧに対応するSELECT句をbuilderに追加します。
	 * @param builder クエリAPIビルダー
	 */
	protected void addSelectItmDtlRqst(MCQueryApiBuilder builder) {
		
		MAVM_ITM_DTL_RQST_R m1 = (MAVM_ITM_DTL_RQST_R) builder.getBaseDbc();
		MAM_LOC_R m4 = MAM_LOC_R.create("M4");

		builder.addSelect(
				m1.wg_cd,
				nullValue().as("wg_nm"),
				m1.itm_cd,
				m1.itm_sub1,
				m1.itm_sub2,
				m1.itm_sub3,
				nullValue().as("itm_nm"),
				nullValue().as("itm_alt_nm1"),
				nullValue().as("itm_alt_nm2"),
				nullValue().as("itm_alt_nm3"),
				nullValue().as("itm_alt_nm4"),
				nullValue().as("itm_typ"),
				nullValue().as("itm_typ_d_cd"),
				nullValue().as("stk_mng_typ"),
				nullValue().as("asset_mng_typ"),
				value(false).as("sundry_itm_flg"),
				m1.mfg_loc_cd,
				nullValue().as("mfg_loc_nm"),
				m1.bom_ptn,
				m1.sppl_cd,
				nullValue().as("sppl_nm"),
				m1.maker_cd,
				m1.rqst_loc_cd,
				m4.loc_nm.as("rqst_loc_nm"),
				m1.st_dt,
				m1.end_dt,
				m1.oper_ptn,
				m1.mfg_lt,
				m1.mfg_lt_add_qty,
				m1.purc_lt,
				m1.purc_lt_add_qty,
				m1.accpt_insp_lt,
				m1.buf_lt,
				m1.ord_fix_pd,
				m1.sz_day_week_typ,
				m1.sz_week,
				m1.lot_sz_pd,
				m1.min_lot_qty,
				m1.batch_lot_qty,
				m1.max_lot_qty,
				m1.max_order,
				m1.prio,
				m1.order_ratio,
				m1.yield_schd_qty,
				m1.mfg_inst_qty,
				m1.fxd_rqmt_qty,
				m1.lot_issue_typ,
				m1.bkf_flg,
				m1.ln_stk_flg,
				m1.pre_po_tgt_flg,
				m1.inst_rec_issue_flg,
				m1.no_mfg_aprv_flg,
				m1.itm_lower_yield,
				m1.itm_std_yield,
				m1.itm_upper_yield,
				m1.purc_id_typ,
				m1.rqst_wg_cd,
				m1.rsrc_std_qty1,
				m1.rsrc_unit_qty1,
				m1.rsrc_std_qty2,
				m1.rsrc_unit_qty2,
				m1.sno1,
				m1.sno2,
				m1.sno3,
				m1.sno4,
				m1.not_mrp_flg,
				m1.memo1,
				m1.memo2,
				m1.memo3,
				m1.ins_ts,
				m1.upd_ts,
				nullValue().as("purc_tax_cd"),
				nullValue().as("prov_tax_cd"),
				MAPA_LOC$F_GET_LOC_ADDR(
					m1.rqst_loc_cd,
					bind("dt"),
					value(MAC_LOC_ADDR_TYP.ZIP_CD.value()),
					nullValue()
				).as("zip_cd"),
				MAPA_LOC$F_GET_LOC_ADDR(
					m1.rqst_loc_cd,
					bind("dt"),
					value(MAC_LOC_ADDR_TYP.ADDR1.value()),
					nullValue()
				).as("addr1"),
				MAPA_LOC$F_GET_LOC_ADDR(
					m1.rqst_loc_cd,
					bind("dt"),
					value(MAC_LOC_ADDR_TYP.ADDR2.value()),
					nullValue()
				).as("addr2"),
				MAPA_LOC$F_GET_LOC_ADDR(
					m1.rqst_loc_cd,
					bind("dt"),
					value(MAC_LOC_ADDR_TYP.ADDR3.value()),
					nullValue()
				).as("addr3"),
				MAPA_LOC$F_GET_LOC_ADDR(
					m1.rqst_loc_cd,
					bind("dt"),
					value(MAC_LOC_ADDR_TYP.ADDR4.value()),
					nullValue()
				).as("addr4"),
				MAPA_LOC$F_GET_LOC_ADDR(
					m1.rqst_loc_cd,
					bind("dt"),
					value(MAC_LOC_ADDR_TYP.TEL.value()),
					nullValue()
				).as("tel"),
				MAPA_LOC$F_GET_LOC_ADDR(
					m1.rqst_loc_cd,
					bind("dt"),
					value(MAC_LOC_ADDR_TYP.FAX.value()),
					nullValue()
				).as("fax"),
				value(false).as("purc_upri_cng_flg"),
				value(false).as("prov_upri_cng_flg"),
				nullValue().as("cur_cd"),
				nullValue().as("cntry_cd"),
				value(false).as("foreign_flg"),
				nullValue().as("area_cd"),
				MAPA_LOC$F_GET_ASST_DPT_CD_NE(
					m1.rqst_loc_cd,
					bind("dt"),
					value(false)
				).as("asst_dpt_cd"),
				MAPA_LOC$F_GET_SLS_DPT_CD_NE(
					m1.rqst_loc_cd,
					bind("dt"),
					value(false)
				).as("sls_dpt_cd"),
				m4.site_cd,
				m4.lg_grp_cd,
				m4.lg_def_flg,
				m4.loc_grp_cd,
				m4.alloc_grp_cd,
				m4.pre_outsrc_act_flg,
				m4.ddlv_prov_insp_flg,
				m4.cal_cd.as("loc_cal_cd"),
				m4.loc_mng_typ,
				m4.str_ln_tgt_flg,
				m4.alloc_lmt_flg,
				m4.gi_pack_xfer_flg,
				m4.gi_vmi_flg,
				nullValue().as("rsrc_cd1"),
				nullValue().as("rsrc_cd2"),
				nullValue().as("prnt_lcl_cd"),
				nullValue().as("asppl_cd"),
				nullValue().as("vmi_purc_dpt_cd"),
				value(false).as("subcon_flg"),
				nullValue().as("po_print_cd"),
				nullValue().as("sppl_ship_form_cd"),
				nullValue().as("pay_crryovr_times"),
				nullValue().as("sppl_cntct_dpt"),
				nullValue().as("sppl_cntct_psn"),
				nullValue().as("sppl_cntct_psn_title"),
				nullValue().as("purc_upri_req_typ"),
				nullValue().as("purc_amt_rnd_typ"),
				nullValue().as("purc_tax_rnd_typ"),
				nullValue().as("purc_tax_calc_typ"),
				value(false).as("wrk_po_flg"),
				value(false).as("wrk_ap_flg"),
				nullValue().as("prov_rcv_typ"),
				value(false).as("onr_prsppl_flg"),
				nullValue().as("prov_basis_typ"),
				nullValue().as("prov_amt_rnd_typ"),
				nullValue().as("prov_tax_rnd_typ"),
				nullValue().as("prov_tax_calc_typ"),
				nullValue().as("sppl_cal_cd"),
				value(false).as("sppl_iv_flg"),
				value(false).as("prms_recv_flg"),
				nullValue().as("sppl_tterm_cd1"),
				nullValue().as("sppl_tterm_cd2"),
				nullValue().as("sppl_tterm_cd3"),
				value(false).as("dscnt_itm_flg"),
				nullValue().as("unit_cd"),
				nullValue().as("unit_nm"),
				nullValue().as("dec_place"),
				nullValue().as("rnd_typ"),
				nullValue().as("dim_unit_cd"),
				nullValue().as("dim"),
				nullValue().as("wt_unit_cd"),
				nullValue().as("wt"),
				nullValue().as("conts_unit_cd"),
				nullValue().as("conts_qty"),
				nullValue().as("hs_cd"),
				nullValue().as("itm_jnl_cd"),
				nullValue().as("ac_itm_grp_cd"),
				value(false).as("minus_stk_flg"),
				value(false).as("not_new_lot_flg"),
				value(false).as("gi_alloc_flg"),
				MAPA_TAX$F_GET_WTAX_RATE(
					m1.itm_cd,
					m1.itm_sub1,
					m1.itm_sub2,
					m1.itm_sub3,
					bind("dt")
				).as("wtax_rate"),
				nullValue().as("ship_unit_cd"),
				nullValue().as("mfg_unit_cd"),
				nullValue().as("purc_unit_cd"),
				nullValue().as("pckg_unit_cd"),
				value(false).as("pack_alloc_flg"),
				nullValue().as("lot_mng_typ"),
				nullValue().as("lot_no_typ"),
				nullValue().as("lot_no_ptn_cd"),
				nullValue().as("sublot_mng_typ"),
				nullValue().as("sublot_no_typ"),
				nullValue().as("sublot_no_ptn_cd"),
				value(false).as("bp_lot_flg"),
				nullValue().as("insp_bind_typ"),
				value(false).as("skip_chk_ship_flg"),
				value(false).as("mrkt_judg_flg"),
				nullValue().as("mrkt_judg_role_cd"),
				value(false).as("lmt_ctl_flg"),
				nullValue().as("lmt_ctl_categ"),
				value(false).as("cont_fctr_flg"),
				nullValue().as("std_cont_fctr"),
				nullValue().as("cont_fctr_unit_cd"),
				nullValue().as("cont_fctr_unit_nm"),
				nullValue().as("cont_fctr_rnd_typ"),
				nullValue().as("cont_fctr_dec_place"),
				nullValue().as("sno1_mng_typ"),
				value(false).as("slo_sno1_flg"),
				value(false).as("rqmt_sno1_flg"),
				nullValue().as("sno1_num_typ"),
				nullValue().as("sno1_ptn_cd"),
				nullValue().as("sno2_mng_typ"),
				value(false).as("slo_sno2_flg"),
				value(false).as("rqmt_sno2_flg"),
				nullValue().as("sno2_num_typ"),
				nullValue().as("sno2_ptn_cd"),
				nullValue().as("sno3_mng_typ"),
				value(false).as("slo_sno3_flg"),
				value(false).as("rqmt_sno3_flg"),
				nullValue().as("sno3_num_typ"),
				nullValue().as("sno3_ptn_cd"),
				nullValue().as("sno4_mng_typ"),
				value(false).as("slo_sno4_flg"),
				value(false).as("rqmt_sno4_flg"),
				nullValue().as("sno4_num_typ"),
				nullValue().as("sno4_ptn_cd"),
				nullValue().as("mfg_inst_unit_typ"),
				nullValue().as("mrp_proc_typ"),
				nullValue().as("alloc_margin_days"),
				nullValue().as("mrp_alloc_margin_days"),
				nullValue().as("rqmt_rstr_qty"),
				value(false).as("inpt_itm_add_flg"),
				value(false).as("inpt_itm_del_flg"),
				value(false).as("sch_flg"),
				nullValue().as("cntry_org_cd"),
				nullValue().as("comp_spec_typ"),
				value(false).as("comp_rev_at_slo_flg"),
				value(false).as("comp_core_itm_flg"),
				nullValue().as("itm_spec_grp_cd"),
				value(false).as("slo_proc_flg"),
				nullValue().as("slo_proc_typ"),
				nullValue().as("ship_inst_typ"),
				value(false).as("ship_lot_back_stop_flg"),
				nullValue().as("itm_ship_grp_cd"),
				nullValue().as("ship_valid_grp_cd"),
				value(false).as("arr_skip_flg"),
				value(false).as("purc_dlv_slip_flg"),
				nullValue().as("ship_term_cd"),
				nullValue().as("exim_xpns_typ"),
				value(false).as("stk_lst_flg"),
				value(false).as("ver_flg"),
				nullValue().as("th_image"),
				nullValue().as("mrp_opn_xfr_days"),
				nullValue().as("itm_typ_d_nm"),
				nullValue().as("maker_nm"),
				nullValue().as("site_nm"),
				nullValue().as("loc_grp_nm"),
				nullValue().as("alloc_grp_nm"),
				nullValue().as("lg_grp_nm"),
				nullValue().as("cur_nm"),
				nullValue().as("cntry_nm"),
				nullValue().as("area_nm"),
				value(true).as("wg_xfr_flg"),
				value(false).as("repurc_obli_flg"),
				nullValue().as("outsrc_upri_typ"));
	}

	/**
	 * ＷＧ間依頼ＦＬＧに対応する結合条件（JOIN句）をbuilderに追加します。
	 * @param builder クエリAPIビルダー
	 * @param row バインド値を格納したrow
	 */
	protected void addJoinItmDtlRqstForInptAssist(MCQueryApiBuilder builder, MCRow row) {
		
		MAVM_ITM_DTL_RQST_R m1 = (MAVM_ITM_DTL_RQST_R) builder.getBaseDbc();
		MAVM_WR_WG_R m2 = MAVM_WR_WG_R.create("M2");
		MAVM_ITM_WG_R m3 = MAVM_ITM_WG_R.create("M3");
		MAM_LOC_R m4 = MAM_LOC_R.create("M4");
		MAM_ITM_TYP_D_R m10 = MAM_ITM_TYP_D_R.create("M10");
		MAM_SITE_R m11 = MAM_SITE_R.create("M11");
		MAM_LOC_GRP_R m12 = MAM_LOC_GRP_R.create("M12");
		MAM_ALLOC_GRP_R m13 = MAM_ALLOC_GRP_R.create("M13");
		MAM_LG_GRP_R m14 = MAM_LG_GRP_R.create("M14");
		MAM_ITM_GRP_R m20 = MAM_ITM_GRP_R.create("M20");
		MAM_ITM_GRP_R m21 = MAM_ITM_GRP_R.create("M21");
		MAM_ITM_GRP_R m22 = MAM_ITM_GRP_R.create("M22");
		MAM_ITM_GRP_R m23 = MAM_ITM_GRP_R.create("M23");
		MAM_ITM_GRP_R m24 = MAM_ITM_GRP_R.create("M24");
		MAM_ITM_GRP_R m25 = MAM_ITM_GRP_R.create("M25");
		MAM_ITM_GRP_R m26 = MAM_ITM_GRP_R.create("M26");
		MAM_ITM_GRP_R m27 = MAM_ITM_GRP_R.create("M27");
		MAM_ITM_GRP_R m28 = MAM_ITM_GRP_R.create("M28");
		MAM_ITM_GRP_R m29 = MAM_ITM_GRP_R.create("M29");

		builder.addInnerJoin(m2, m1.wg_cd.eq(m2.wg_cd));
		builder.addInnerJoin(m3,
				m1.itm_cd.eq(m3.itm_cd)
				.and(m1.itm_sub1.eq(m3.itm_sub1))
				.and(m1.itm_sub2.eq(m3.itm_sub2))
				.and(m1.itm_sub3.eq(m3.itm_sub3))
				.and(m1.wg_cd.eq(m3.wg_cd)));
		builder.addLeftOuterJoin(m10,
				m3.itm_typ.eq(m10.itm_typ)
				.and(m3.itm_typ_d_cd.eq(m10.itm_typ_d_cd)));
		builder.addLeftOuterJoin(m11, m4.site_cd.eq(m11.site_cd));
		builder.addLeftOuterJoin(m12, m4.loc_grp_cd.eq(m12.loc_grp_cd));
		builder.addLeftOuterJoin(m13, m4.alloc_grp_cd.eq(m13.alloc_grp_cd));
		builder.addLeftOuterJoin(m14, m4.lg_grp_cd.eq(m14.lg_grp_cd));
		if (!isNull(row.getStringNE(ItmDtlCols.$i_itm_grp_nm1))) {
			builder.addInnerJoin(m20,
					m20.itm_grp_typ.eq(value(MAC_ITM_GRP_TYP.GRP1.value()))
					.and(m3.itm_grp_cd1.eq(m20.itm_grp_cd))
					.and(m20.itm_grp_nm.like(bind(ItmDtlCols.$i_itm_grp_nm1))));
		}
		if (!isNull(row.getStringNE(ItmDtlCols.$i_itm_grp_nm2))) {
			builder.addInnerJoin(m21,
					m21.itm_grp_typ.eq(value(MAC_ITM_GRP_TYP.GRP2.value()))
					.and(m3.itm_grp_cd2.eq(m21.itm_grp_cd))
					.and(m21.itm_grp_nm.like(bind(ItmDtlCols.$i_itm_grp_nm2))));
		}
		if (!isNull(row.getStringNE(ItmDtlCols.$i_itm_grp_nm3))) {
			builder.addInnerJoin(m22,
					m22.itm_grp_typ.eq(value(MAC_ITM_GRP_TYP.GRP3.value()))
					.and(m3.itm_grp_cd3.eq(m22.itm_grp_cd))
					.and(m22.itm_grp_nm.like(bind(ItmDtlCols.$i_itm_grp_nm3))));
		}
		if (!isNull(row.getStringNE(ItmDtlCols.$i_itm_grp_nm4))) {
			builder.addInnerJoin(m23,
					m23.itm_grp_typ.eq(value(MAC_ITM_GRP_TYP.GRP4.value()))
					.and(m3.itm_grp_cd4.eq(m23.itm_grp_cd))
					.and(m23.itm_grp_nm.like(bind(ItmDtlCols.$i_itm_grp_nm4))));
		}
		if (!isNull(row.getStringNE(ItmDtlCols.$i_itm_grp_nm5))) {
			builder.addInnerJoin(m24,
					m24.itm_grp_typ.eq(value(MAC_ITM_GRP_TYP.GRP5.value()))
					.and(m3.itm_grp_cd5.eq(m24.itm_grp_cd))
					.and(m24.itm_grp_nm.like(bind(ItmDtlCols.$i_itm_grp_nm5))));
		}
		if (!isNull(row.getStringNE(ItmDtlCols.$i_itm_grp_nm6))) {
			builder.addInnerJoin(m25,
					m25.itm_grp_typ.eq(value(MAC_ITM_GRP_TYP.GRP6.value()))
					.and(m3.itm_grp_cd6.eq(m25.itm_grp_cd))
					.and(m25.itm_grp_nm.like(bind(ItmDtlCols.$i_itm_grp_nm6))));
		}
		if (!isNull(row.getStringNE(ItmDtlCols.$i_itm_grp_nm7))) {
			builder.addInnerJoin(m26,
					m26.itm_grp_typ.eq(value(MAC_ITM_GRP_TYP.GRP7.value()))
					.and(m3.itm_grp_cd7.eq(m26.itm_grp_cd))
					.and(m26.itm_grp_nm.like(bind(ItmDtlCols.$i_itm_grp_nm7))));
		}
		if (!isNull(row.getStringNE(ItmDtlCols.$i_itm_grp_nm8))) {
			builder.addInnerJoin(m27,
					m27.itm_grp_typ.eq(value(MAC_ITM_GRP_TYP.GRP8.value()))
					.and(m3.itm_grp_cd8.eq(m27.itm_grp_cd))
					.and(m27.itm_grp_nm.like(bind(ItmDtlCols.$i_itm_grp_nm8))));
		}
		if (!isNull(row.getStringNE(ItmDtlCols.$i_itm_grp_nm9))) {
			builder.addInnerJoin(m28,
					m28.itm_grp_typ.eq(value(MAC_ITM_GRP_TYP.GRP9.value()))
					.and(m3.itm_grp_cd9.eq(m28.itm_grp_cd))
					.and(m28.itm_grp_nm.like(bind(ItmDtlCols.$i_itm_grp_nm9))));
		}
		if (!isNull(row.getStringNE(ItmDtlCols.$i_itm_grp_nm10))) {
			builder.addInnerJoin(m29,
					m29.itm_grp_typ.eq(value(MAC_ITM_GRP_TYP.GRP10.value()))
					.and(m3.itm_grp_cd10.eq(m29.itm_grp_cd))
					.and(m29.itm_grp_nm.like(bind(ItmDtlCols.$i_itm_grp_nm10))));
		}
	}

	/**
	 * ＷＧ間依頼ＦＬＧに対応する直接入力条件（Where句）をbuilderに追加します。
	 * @param builder クエリAPIビルダー
	 */
	protected void addWhereItmDtlRqstForDirectInpt(MCQueryApiBuilder builder) {
		
		MAVM_ITM_DTL_RQST_R m1 = (MAVM_ITM_DTL_RQST_R) builder.getBaseDbc();

		builder.setWhere(value("0").eq(value("0")));
		builder.addWhereWithAnd(bind("dt").between(m1.st_dt, m1.end_dt));
		builder.addWhereWithCutOffAnd(m1.wg_cd.eq(bind("wg_cd")));
		builder.addWhereWithCutOffAnd(m1.itm_cd.eq(bind("itm_cd")));
		builder.addWhereWithCutOffAnd(m1.itm_sub1.eq(bind("itm_sub1")));
		builder.addWhereWithCutOffAnd(m1.itm_sub2.eq(bind("itm_sub2")));
		builder.addWhereWithCutOffAnd(m1.itm_sub3.eq(bind("itm_sub3")));
		builder.addWhereWithCutOffAnd(m1.rqst_loc_cd.eq(bind("rqst_loc_cd")));
		builder.addWhereWithCutOffAnd(nullValue().eq(bind("sppl_cd")));
	}

	/**
	 * ＷＧ間依頼ＦＬＧに対応する入力補助条件（Where句）をbuilderに追加します。
	 * @param builder クエリAPIビルダー
	 */
	protected void addWhereItmDtlRqstForInptAssist(MCQueryApiBuilder builder) {
		
		MAVM_ITM_DTL_RQST_R m1 = (MAVM_ITM_DTL_RQST_R) builder.getBaseDbc();
		MAVM_WR_WG_R m2 = MAVM_WR_WG_R.create("M2");
		MAVM_ITM_WG_R m3 = MAVM_ITM_WG_R.create("M3");
		MAM_LOC_R m4 = MAM_LOC_R.create("M4");
		MAM_ITM_TYP_D_R m10 = MAM_ITM_TYP_D_R.create("M10");
		MAM_SITE_R m11 = MAM_SITE_R.create("M11");
		MAM_LOC_GRP_R m12 = MAM_LOC_GRP_R.create("M12");
		MAM_ALLOC_GRP_R m13 = MAM_ALLOC_GRP_R.create("M13");
		MAM_LG_GRP_R m14 = MAM_LG_GRP_R.create("M14");

		builder.setWhere(value("0").eq(value("0")));
		builder.addWhereWithAnd(bind("dt").between(m1.st_dt, m1.end_dt));
		builder.addWhereWithCutOffAnd(m1.wg_cd.like(bind("wg_cd")));
		builder.addWhereWithCutOffAnd(m2.wg_nm.like(bind("wg_nm")));
		builder.addWhereWithCutOffAnd(m1.itm_cd.like(bind("itm_cd")));
		builder.addWhereWithCutOffAnd(m1.itm_sub1.like(bind("itm_sub1")));
		builder.addWhereWithCutOffAnd(m1.itm_sub2.like(bind("itm_sub2")));
		builder.addWhereWithCutOffAnd(m1.itm_sub3.like(bind("itm_sub3")));
		builder.addWhereWithCutOffAnd(m3.itm_nm.like(bind("itm_nm")));
		builder.addWhereWithCutOffAnd(m3.itm_alt_nm1.like(bind("itm_alt_nm1")));
		builder.addWhereWithCutOffAnd(m3.itm_alt_nm2.like(bind("itm_alt_nm2")));
		builder.addWhereWithCutOffAnd(m3.itm_alt_nm3.like(bind("itm_alt_nm3")));
		builder.addWhereWithCutOffAnd(m3.itm_alt_nm4.like(bind("itm_alt_nm4")));
		builder.addWhereWithCutOffAnd(m3.itm_typ.like(bind("itm_typ")));
		builder.addWhereWithCutOffAnd(m3.itm_typ_d_cd.like(bind("itm_typ_d_cd")));
		builder.addWhereWithCutOffAnd(m10.itm_typ_d_nm.like(bind("itm_typ_d_nm")));
		builder.addWhereWithCutOffAnd(m3.stk_mng_typ.like(bind("stk_mng_typ")));
		builder.addWhereWithCutOffAnd(m3.asset_mng_typ.like(bind("asset_mng_typ")));
		builder.addWhereWithCutOffAnd(m1.rqst_loc_cd.like(bind("rqst_loc_cd")));
		builder.addWhereWithCutOffAnd(m4.loc_nm.like(bind("rqst_loc_nm")));
		builder.addWhereWithCutOffAnd(m4.site_cd.like(bind("site_cd")));
		builder.addWhereWithCutOffAnd(m11.site_nm.like(bind("site_nm")));
		builder.addWhereWithCutOffAnd(m4.lg_grp_cd.like(bind("lg_grp_cd")));
		builder.addWhereWithCutOffAnd(m14.lg_grp_nm.like(bind("lg_grp_nm")));
		builder.addWhereWithCutOffAnd(m4.alloc_grp_cd.like(bind("alloc_grp_cd")));
		builder.addWhereWithCutOffAnd(m13.alloc_grp_nm.like(bind("alloc_grp_nm")));
		builder.addWhereWithCutOffAnd(m4.loc_grp_cd.like(bind("loc_grp_cd")));
		builder.addWhereWithCutOffAnd(m12.loc_grp_nm.like(bind("loc_grp_nm")));
		builder.addWhereWithCutOffAnd(m4.loc_mng_typ.like(bind("loc_mng_typ")));
		builder.addWhereWithCutOffAnd(nullValue().like(bind("sppl_cd")));
		builder.addWhereWithCutOffAnd(nullValue().like(bind("sppl_nm")));
		builder.addWhereWithCutOffAnd(nullValue().like(bind("ein")));
		builder.addWhereWithCutOffAnd(nullValue().like(bind("sppl_alt_nm1")));
		builder.addWhereWithCutOffAnd(nullValue().like(bind("sppl_alt_nm2")));
		builder.addWhereWithCutOffAnd(nullValue().like(bind("sppl_alt_nm3")));
		builder.addWhereWithCutOffAnd(nullValue().like(bind("sppl_alt_nm4")));
		builder.addWhereWithCutOffAnd(nullValue().like(bind("cntry_cd")));
		builder.addWhereWithCutOffAnd(nullValue().like(bind("cntry_nm")));
		builder.addWhereWithCutOffAnd(nullValue().like(bind("area_cd")));
		builder.addWhereWithCutOffAnd(nullValue().like(bind("area_nm")));
		builder.addWhereWithCutOffAnd(m3.itm_grp_cd1.like(bind("itm_grp_cd1")));
		builder.addWhereWithCutOffAnd(m3.itm_grp_cd2.like(bind("itm_grp_cd2")));
		builder.addWhereWithCutOffAnd(m3.itm_grp_cd3.like(bind("itm_grp_cd3")));
		builder.addWhereWithCutOffAnd(m3.itm_grp_cd4.like(bind("itm_grp_cd4")));
		builder.addWhereWithCutOffAnd(m3.itm_grp_cd5.like(bind("itm_grp_cd5")));
		builder.addWhereWithCutOffAnd(m3.itm_grp_cd6.like(bind("itm_grp_cd6")));
		builder.addWhereWithCutOffAnd(m3.itm_grp_cd7.like(bind("itm_grp_cd7")));
		builder.addWhereWithCutOffAnd(m3.itm_grp_cd8.like(bind("itm_grp_cd8")));
		builder.addWhereWithCutOffAnd(m3.itm_grp_cd9.like(bind("itm_grp_cd9")));
		builder.addWhereWithCutOffAnd(m3.itm_grp_cd10.like(bind("itm_grp_cd10")));
		builder.addWhereWithCutOffAnd(nullValue().like(bind("sppl_grp_cd1")));
		builder.addWhereWithCutOffAnd(nullValue().like(bind("sppl_grp_cd2")));
		builder.addWhereWithCutOffAnd(nullValue().like(bind("sppl_grp_cd3")));
		builder.addWhereWithCutOffAnd(nullValue().like(bind("sppl_grp_cd4")));
		builder.addWhereWithCutOffAnd(nullValue().like(bind("sppl_grp_cd5")));
		builder.addWhereWithCutOffAnd(nullValue().like(bind("sppl_grp_cd6")));
		builder.addWhereWithCutOffAnd(nullValue().like(bind("sppl_grp_cd7")));
		builder.addWhereWithCutOffAnd(nullValue().like(bind("sppl_grp_cd8")));
		builder.addWhereWithCutOffAnd(nullValue().like(bind("sppl_grp_cd9")));
		builder.addWhereWithCutOffAnd(nullValue().like(bind("sppl_grp_cd10")));
		builder.addWhereWithCutOffAnd(m1.memo1.like(bind("memo1")));
		builder.addWhereWithCutOffAnd(m1.memo2.like(bind("memo2")));
		builder.addWhereWithCutOffAnd(m1.memo3.like(bind("memo3")));
		builder.addWhereWithCutOffAnd(nullValue().neq(bind("own_cntry_cd")));
	}

	// -- ItmDtl:品目詳細 (END)

	// -- ItmDtlSub1:品目詳細（枝番１） (START)

	@Override
	public MCList<MCRow> getItmDtlSub1(MCRow row) {
		if (isNull(row.getStringNE(ItmDtlSub1Cols.$i_itm_cd))) {
			return null;
		}
		MCList<MAM_ITM_DTL_R> result = MCList.create(MAM_ITM_DTL_R.class);
		MAM_ITM_DTL_R t = MAM_ITM_DTL_R.create("T");
		MCQueryApiBuilder builder = MCQueryApiBuilder.create(t);
		getItmDtlSub1_Set(row, builder, t, result);
		result = _itmDtlSelect.apply(row).apply(builder).apply(t).apply(result);
		MCList<? extends MCRow> down = getItmDtlSub1_AfterSelect(row, builder, t, result);
		down = listlogicCommon_AfterSelect(row, result, down, "MA.MAUAL0010.ItmDtlSub1");
		if (isNull(down)) return null;
		return getItmDtlSub1_SubColumns(row, down);
	}

	@Override
	protected  void getItmDtlSub1_Set(MCRow row, MCQueryApiBuilder builder, MAM_ITM_DTL_R t, MCList<?> result) {
		// out項目には存在するが、MAM_ITM_DTLに存在しない項目の追加
		result.addNumberColumn(ItmDtlSub1Cols.$o_wtax_rate);
		result.addNumberColumn(ItmDtlSub1Cols.$o_conts_qty);
		result.addNumberColumn(ItmDtlSub1Cols.$o_pay_crryovr_times);
		result.addNumberColumn(ItmDtlSub1Cols.$o_std_cont_fctr);
		result.addNumberColumn(ItmDtlSub1Cols.$o_cont_fctr_dec_place);
		result.addNumberColumn(ItmDtlSub1Cols.$o_dec_place);
		result.addNumberColumn(ItmDtlSub1Cols.$o_dim);
		result.addNumberColumn(ItmDtlSub1Cols.$o_wt);
		result.addNumberColumn(ItmDtlSub1Cols.$o_rqmt_rstr_qty);
		result.addNumberColumn(ItmDtlSub1Cols.$o_alloc_margin_days);
		result.addNumberColumn(ItmDtlSub1Cols.$o_mrp_alloc_margin_days);
		result.addNumberColumn(ItmDtlSub1Cols.$o_mrp_opn_xfr_days);
		result.addStringColumn(ItmDtlSub1Cols.$o_itm_alt_nm1);
		result.addStringColumn(ItmDtlSub1Cols.$o_itm_alt_nm2);
		result.addStringColumn(ItmDtlSub1Cols.$o_itm_alt_nm3);
		result.addStringColumn(ItmDtlSub1Cols.$o_itm_alt_nm4);
		result.addStringColumn(ItmDtlSub1Cols.$o_itm_typ);
		result.addStringColumn(ItmDtlSub1Cols.$o_itm_typ_d_cd);
		result.addStringColumn(ItmDtlSub1Cols.$o_itm_typ_d_nm);
		result.addStringColumn(ItmDtlSub1Cols.$o_stk_mng_typ);
		result.addStringColumn(ItmDtlSub1Cols.$o_asset_mng_typ);
		result.addStringColumn(ItmDtlSub1Cols.$o_purc_tax_cd);
		result.addStringColumn(ItmDtlSub1Cols.$o_prov_tax_cd);
		result.addStringColumn(ItmDtlSub1Cols.$o_zip_cd);
		result.addStringColumn(ItmDtlSub1Cols.$o_addr1);
		result.addStringColumn(ItmDtlSub1Cols.$o_addr2);
		result.addStringColumn(ItmDtlSub1Cols.$o_addr3);
		result.addStringColumn(ItmDtlSub1Cols.$o_addr4);
		result.addStringColumn(ItmDtlSub1Cols.$o_tel);
		result.addStringColumn(ItmDtlSub1Cols.$o_fax);
		result.addStringColumn(ItmDtlSub1Cols.$o_cur_cd);
		result.addStringColumn(ItmDtlSub1Cols.$o_cur_nm);
		result.addStringColumn(ItmDtlSub1Cols.$o_cntry_cd);
		result.addStringColumn(ItmDtlSub1Cols.$o_cntry_nm);
		result.addStringColumn(ItmDtlSub1Cols.$o_area_cd);
		result.addStringColumn(ItmDtlSub1Cols.$o_area_nm);
		result.addStringColumn(ItmDtlSub1Cols.$o_asst_dpt_cd);
		result.addStringColumn(ItmDtlSub1Cols.$o_sls_dpt_cd);
		result.addStringColumn(ItmDtlSub1Cols.$o_site_cd);
		result.addStringColumn(ItmDtlSub1Cols.$o_site_nm);
		result.addStringColumn(ItmDtlSub1Cols.$o_lg_grp_cd);
		result.addStringColumn(ItmDtlSub1Cols.$o_lg_grp_nm);
		result.addStringColumn(ItmDtlSub1Cols.$o_loc_grp_cd);
		result.addStringColumn(ItmDtlSub1Cols.$o_loc_grp_nm);
		result.addStringColumn(ItmDtlSub1Cols.$o_alloc_grp_cd);
		result.addStringColumn(ItmDtlSub1Cols.$o_alloc_grp_nm);
		result.addStringColumn(ItmDtlSub1Cols.$o_loc_cal_cd);
		result.addStringColumn(ItmDtlSub1Cols.$o_loc_mng_typ);
		result.addStringColumn(ItmDtlSub1Cols.$o_rsrc_cd1);
		result.addStringColumn(ItmDtlSub1Cols.$o_rsrc_cd2);
		result.addStringColumn(ItmDtlSub1Cols.$o_prnt_lcl_cd);
		result.addStringColumn(ItmDtlSub1Cols.$o_asppl_cd);
		result.addStringColumn(ItmDtlSub1Cols.$o_vmi_purc_dpt_cd);
		result.addStringColumn(ItmDtlSub1Cols.$o_mrkt_judg_role_cd);
		result.addStringColumn(ItmDtlSub1Cols.$o_po_print_cd);
		result.addStringColumn(ItmDtlSub1Cols.$o_sppl_ship_form_cd);
		result.addStringColumn(ItmDtlSub1Cols.$o_sppl_cntct_dpt);
		result.addStringColumn(ItmDtlSub1Cols.$o_sppl_cntct_psn);
		result.addStringColumn(ItmDtlSub1Cols.$o_sppl_cntct_psn_title);
		result.addStringColumn(ItmDtlSub1Cols.$o_purc_upri_req_typ);
		result.addStringColumn(ItmDtlSub1Cols.$o_purc_amt_rnd_typ);
		result.addStringColumn(ItmDtlSub1Cols.$o_purc_tax_rnd_typ);
		result.addStringColumn(ItmDtlSub1Cols.$o_purc_tax_calc_typ);
		result.addStringColumn(ItmDtlSub1Cols.$o_prov_rcv_typ);
		result.addStringColumn(ItmDtlSub1Cols.$o_prov_basis_typ);
		result.addStringColumn(ItmDtlSub1Cols.$o_prov_amt_rnd_typ);
		result.addStringColumn(ItmDtlSub1Cols.$o_prov_tax_rnd_typ);
		result.addStringColumn(ItmDtlSub1Cols.$o_prov_tax_calc_typ);
		result.addStringColumn(ItmDtlSub1Cols.$o_sppl_cal_cd);
		result.addStringColumn(ItmDtlSub1Cols.$o_sppl_tterm_cd1);
		result.addStringColumn(ItmDtlSub1Cols.$o_sppl_tterm_cd2);
		result.addStringColumn(ItmDtlSub1Cols.$o_sppl_tterm_cd3);
		result.addStringColumn(ItmDtlSub1Cols.$o_unit_cd);
		result.addStringColumn(ItmDtlSub1Cols.$o_unit_nm);
		result.addStringColumn(ItmDtlSub1Cols.$o_rnd_typ);
		result.addStringColumn(ItmDtlSub1Cols.$o_dim_unit_cd);
		result.addStringColumn(ItmDtlSub1Cols.$o_wt_unit_cd);
		result.addStringColumn(ItmDtlSub1Cols.$o_conts_unit_cd);
		result.addStringColumn(ItmDtlSub1Cols.$o_hs_cd);
		result.addStringColumn(ItmDtlSub1Cols.$o_itm_jnl_cd);
		result.addStringColumn(ItmDtlSub1Cols.$o_ac_itm_grp_cd);
		result.addStringColumn(ItmDtlSub1Cols.$o_ship_unit_cd);
		result.addStringColumn(ItmDtlSub1Cols.$o_mfg_unit_cd);
		result.addStringColumn(ItmDtlSub1Cols.$o_purc_unit_cd);
		result.addStringColumn(ItmDtlSub1Cols.$o_pckg_unit_cd);
		result.addStringColumn(ItmDtlSub1Cols.$o_lot_mng_typ);
		result.addStringColumn(ItmDtlSub1Cols.$o_lot_no_typ);
		result.addStringColumn(ItmDtlSub1Cols.$o_lot_no_ptn_cd);
		result.addStringColumn(ItmDtlSub1Cols.$o_sublot_mng_typ);
		result.addStringColumn(ItmDtlSub1Cols.$o_sublot_no_typ);
		result.addStringColumn(ItmDtlSub1Cols.$o_sublot_no_ptn_cd);
		result.addStringColumn(ItmDtlSub1Cols.$o_insp_bind_typ);
		result.addStringColumn(ItmDtlSub1Cols.$o_lmt_ctl_categ);
		result.addStringColumn(ItmDtlSub1Cols.$o_cont_fctr_unit_cd);
		result.addStringColumn(ItmDtlSub1Cols.$o_cont_fctr_rnd_typ);
		result.addStringColumn(ItmDtlSub1Cols.$o_sno1_mng_typ);
		result.addStringColumn(ItmDtlSub1Cols.$o_sno1_num_typ);
		result.addStringColumn(ItmDtlSub1Cols.$o_sno1_ptn_cd);
		result.addStringColumn(ItmDtlSub1Cols.$o_sno2_mng_typ);
		result.addStringColumn(ItmDtlSub1Cols.$o_sno2_num_typ);
		result.addStringColumn(ItmDtlSub1Cols.$o_sno2_ptn_cd);
		result.addStringColumn(ItmDtlSub1Cols.$o_sno3_mng_typ);
		result.addStringColumn(ItmDtlSub1Cols.$o_sno3_num_typ);
		result.addStringColumn(ItmDtlSub1Cols.$o_sno3_ptn_cd);
		result.addStringColumn(ItmDtlSub1Cols.$o_sno4_mng_typ);
		result.addStringColumn(ItmDtlSub1Cols.$o_sno4_num_typ);
		result.addStringColumn(ItmDtlSub1Cols.$o_sno4_ptn_cd);
		result.addStringColumn(ItmDtlSub1Cols.$o_mfg_inst_unit_typ);
		result.addStringColumn(ItmDtlSub1Cols.$o_mrp_proc_typ);
		result.addStringColumn(ItmDtlSub1Cols.$o_cntry_org_cd);
		result.addStringColumn(ItmDtlSub1Cols.$o_comp_spec_typ);
		result.addStringColumn(ItmDtlSub1Cols.$o_itm_spec_grp_cd);
		result.addStringColumn(ItmDtlSub1Cols.$o_slo_proc_typ);
		result.addStringColumn(ItmDtlSub1Cols.$o_ship_inst_typ);
		result.addStringColumn(ItmDtlSub1Cols.$o_itm_ship_grp_cd);
		result.addStringColumn(ItmDtlSub1Cols.$o_ship_valid_grp_cd);
		result.addStringColumn(ItmDtlSub1Cols.$o_ship_term_cd);
		result.addStringColumn(ItmDtlSub1Cols.$o_exim_xpns_typ);
		result.addBooleanColumn(ItmDtlSub1Cols.$o_sundry_itm_flg);
		result.addBooleanColumn(ItmDtlSub1Cols.$o_purc_upri_cng_flg);
		result.addBooleanColumn(ItmDtlSub1Cols.$o_prov_upri_cng_flg);
		result.addBooleanColumn(ItmDtlSub1Cols.$o_foreign_flg);
		result.addBooleanColumn(ItmDtlSub1Cols.$o_lg_def_flg);
		result.addBooleanColumn(ItmDtlSub1Cols.$o_pre_outsrc_act_flg);
		result.addBooleanColumn(ItmDtlSub1Cols.$o_ddlv_prov_insp_flg);
		result.addBooleanColumn(ItmDtlSub1Cols.$o_str_ln_tgt_flg);
		result.addBooleanColumn(ItmDtlSub1Cols.$o_alloc_lmt_flg);
		result.addBooleanColumn(ItmDtlSub1Cols.$o_gi_pack_xfer_flg);
		result.addBooleanColumn(ItmDtlSub1Cols.$o_gi_vmi_flg);
		result.addBooleanColumn(ItmDtlSub1Cols.$o_dscnt_itm_flg);
		result.addBooleanColumn(ItmDtlSub1Cols.$o_minus_stk_flg);
		result.addBooleanColumn(ItmDtlSub1Cols.$o_not_new_lot_flg);
		result.addBooleanColumn(ItmDtlSub1Cols.$o_gi_alloc_flg);
		result.addBooleanColumn(ItmDtlSub1Cols.$o_pack_alloc_flg);
		result.addBooleanColumn(ItmDtlSub1Cols.$o_bp_lot_flg);
		result.addBooleanColumn(ItmDtlSub1Cols.$o_skip_chk_ship_flg);
		result.addBooleanColumn(ItmDtlSub1Cols.$o_mrkt_judg_flg);
		result.addBooleanColumn(ItmDtlSub1Cols.$o_lmt_ctl_flg);
		result.addBooleanColumn(ItmDtlSub1Cols.$o_cont_fctr_flg);
		result.addBooleanColumn(ItmDtlSub1Cols.$o_slo_sno1_flg);
		result.addBooleanColumn(ItmDtlSub1Cols.$o_rqmt_sno1_flg);
		result.addBooleanColumn(ItmDtlSub1Cols.$o_slo_sno2_flg);
		result.addBooleanColumn(ItmDtlSub1Cols.$o_rqmt_sno2_flg);
		result.addBooleanColumn(ItmDtlSub1Cols.$o_slo_sno3_flg);
		result.addBooleanColumn(ItmDtlSub1Cols.$o_rqmt_sno3_flg);
		result.addBooleanColumn(ItmDtlSub1Cols.$o_slo_sno4_flg);
		result.addBooleanColumn(ItmDtlSub1Cols.$o_rqmt_sno4_flg);
		result.addBooleanColumn(ItmDtlSub1Cols.$o_inpt_itm_add_flg);
		result.addBooleanColumn(ItmDtlSub1Cols.$o_inpt_itm_del_flg);
		result.addBooleanColumn(ItmDtlSub1Cols.$o_sch_flg);
		result.addBooleanColumn(ItmDtlSub1Cols.$o_comp_rev_at_slo_flg);
		result.addBooleanColumn(ItmDtlSub1Cols.$o_comp_core_itm_flg);
		result.addBooleanColumn(ItmDtlSub1Cols.$o_slo_proc_flg);
		result.addBooleanColumn(ItmDtlSub1Cols.$o_ship_lot_back_stop_flg);
		result.addBooleanColumn(ItmDtlSub1Cols.$o_arr_skip_flg);
		result.addBooleanColumn(ItmDtlSub1Cols.$o_purc_dlv_slip_flg);
		result.addBooleanColumn(ItmDtlSub1Cols.$o_stk_lst_flg);
		result.addBooleanColumn(ItmDtlSub1Cols.$o_ver_flg);
		result.addBooleanColumn(ItmDtlSub1Cols.$o_subcon_flg);
		result.addBooleanColumn(ItmDtlSub1Cols.$o_wrk_po_flg);
		result.addBooleanColumn(ItmDtlSub1Cols.$o_wrk_ap_flg);
		result.addBooleanColumn(ItmDtlSub1Cols.$o_onr_prsppl_flg);
		result.addBooleanColumn(ItmDtlSub1Cols.$o_sppl_iv_flg);
		result.addBooleanColumn(ItmDtlSub1Cols.$o_prms_recv_flg);
		result.addBinaryColumn(ItmDtlSub1Cols.$o_th_image);
		result.addBooleanColumn(ItmDtlSub1Cols.$i_mfg_flg);
		result.addBooleanColumn(ItmDtlSub1Cols.$i_purc_flg);
		result.addBooleanColumn(ItmDtlSub1Cols.$i_outsrc_flg);
		result.addBooleanColumn(ItmDtlSub1Cols.$i_wg_xfr_flg);
		result.addBooleanColumn(_$asset_not_mng_flg);
		result.addBooleanColumn(ItmDtlSub1Cols.$o_repurc_obli_flg);
		result.addStringColumn(ItmDtlSub1Cols.$o_outsrc_upri_typ);
		
		// 直接入力時
		if (isInput(row)) {
			// 入力された値で絞り込む
			row.setStringNE("itm_sub1", row.getStringNE($INPUT_VAL));
			return;
		}
	}

	@Override
	protected  MCList<?> getItmDtlSub1_AfterSelect(MCRow row, MCQueryApiBuilder builder, MAM_ITM_DTL_R t, MCList<?> result) {
		MCList<?> l = super.getItmDtlSub1_AfterSelect(row, builder, t, result);
		if (isInput(row) || isCombo(row)) {
			l = getItmDtl_NoDupList(row, result, l, ItmDtlCols.$o_itm_sub1, "MA.MAUAL0010.ItmDtlSub1");
		}
		// 区分名の設定
		l.addStringColumn(MAC_ITM_TYP.$NAME);
		l.addStringColumn(MAC_STK_MNG_TYP.$NAME);
		l.addStringColumn(MAC_ASSET_MNG_TYP.$NAME);
		l.addStringColumn(MAC_LOC_MNG_TYP.$NAME);
		MAC_ITM_TYP.putNameNE(l, MAC_ITM_TYP.$VALUE, MAC_ITM_TYP.$NAME);
		MAC_STK_MNG_TYP.putNameNE(l, MAC_STK_MNG_TYP.$VALUE, MAC_STK_MNG_TYP.$NAME);
		MAC_ASSET_MNG_TYP.putNameNE(l, MAC_ASSET_MNG_TYP.$VALUE, MAC_ASSET_MNG_TYP.$NAME);
		MAC_LOC_MNG_TYP.putNameNE(l, MAC_LOC_MNG_TYP.$VALUE, MAC_LOC_MNG_TYP.$NAME);
		return l;
	}

	// -- ItmDtlSub1:品目詳細（枝番１） (END)

	// -- ItmDtlSub2:品目詳細（枝番２） (START)

	@Override
	public MCList<MCRow> getItmDtlSub2(MCRow row) {
		if (isNull(row.getStringNE(ItmDtlSub2Cols.$i_itm_cd))
				|| isNull(row.getStringNE(ItmDtlSub2Cols.$i_itm_sub1))) {
			return null;
		}
		MCList<MAM_ITM_DTL_R> result = MCList.create(MAM_ITM_DTL_R.class);
		MAM_ITM_DTL_R t = MAM_ITM_DTL_R.create("T");
		MCQueryApiBuilder builder = MCQueryApiBuilder.create(t);
		getItmDtlSub2_Set(row, builder, t, result);
		result = _itmDtlSelect.apply(row).apply(builder).apply(t).apply(result);
		MCList<? extends MCRow> down = getItmDtlSub2_AfterSelect(row, builder, t, result);
		down = listlogicCommon_AfterSelect(row, result, down, "MA.MAUAL0010.ItmDtlSub2");
		if (isNull(down)) return null;
		return getItmDtlSub2_SubColumns(row, down);
	}

	@Override
	protected  void getItmDtlSub2_Set(MCRow row, MCQueryApiBuilder builder, MAM_ITM_DTL_R t, MCList<?> result) {
		// out項目には存在するが、MAM_ITM_DTLに存在しない項目の追加
		result.addNumberColumn(ItmDtlSub2Cols.$o_wtax_rate);
		result.addNumberColumn(ItmDtlSub2Cols.$o_conts_qty);
		result.addNumberColumn(ItmDtlSub2Cols.$o_pay_crryovr_times);
		result.addNumberColumn(ItmDtlSub2Cols.$o_std_cont_fctr);
		result.addNumberColumn(ItmDtlSub2Cols.$o_cont_fctr_dec_place);
		result.addNumberColumn(ItmDtlSub2Cols.$o_dec_place);
		result.addNumberColumn(ItmDtlSub2Cols.$o_dim);
		result.addNumberColumn(ItmDtlSub2Cols.$o_wt);
		result.addNumberColumn(ItmDtlSub2Cols.$o_rqmt_rstr_qty);
		result.addNumberColumn(ItmDtlSub2Cols.$o_alloc_margin_days);
		result.addNumberColumn(ItmDtlSub2Cols.$o_mrp_alloc_margin_days);
		result.addNumberColumn(ItmDtlSub2Cols.$o_mrp_opn_xfr_days);
		result.addStringColumn(ItmDtlSub2Cols.$o_itm_alt_nm1);
		result.addStringColumn(ItmDtlSub2Cols.$o_itm_alt_nm2);
		result.addStringColumn(ItmDtlSub2Cols.$o_itm_alt_nm3);
		result.addStringColumn(ItmDtlSub2Cols.$o_itm_alt_nm4);
		result.addStringColumn(ItmDtlSub2Cols.$o_itm_typ);
		result.addStringColumn(ItmDtlSub2Cols.$o_itm_typ_d_cd);
		result.addStringColumn(ItmDtlSub2Cols.$o_itm_typ_d_nm);
		result.addStringColumn(ItmDtlSub2Cols.$o_stk_mng_typ);
		result.addStringColumn(ItmDtlSub2Cols.$o_asset_mng_typ);
		result.addStringColumn(ItmDtlSub2Cols.$o_purc_tax_cd);
		result.addStringColumn(ItmDtlSub2Cols.$o_prov_tax_cd);
		result.addStringColumn(ItmDtlSub2Cols.$o_zip_cd);
		result.addStringColumn(ItmDtlSub2Cols.$o_addr1);
		result.addStringColumn(ItmDtlSub2Cols.$o_addr2);
		result.addStringColumn(ItmDtlSub2Cols.$o_addr3);
		result.addStringColumn(ItmDtlSub2Cols.$o_addr4);
		result.addStringColumn(ItmDtlSub2Cols.$o_tel);
		result.addStringColumn(ItmDtlSub2Cols.$o_fax);
		result.addStringColumn(ItmDtlSub2Cols.$o_cur_cd);
		result.addStringColumn(ItmDtlSub2Cols.$o_cur_nm);
		result.addStringColumn(ItmDtlSub2Cols.$o_cntry_cd);
		result.addStringColumn(ItmDtlSub2Cols.$o_cntry_nm);
		result.addStringColumn(ItmDtlSub2Cols.$o_area_cd);
		result.addStringColumn(ItmDtlSub2Cols.$o_area_nm);
		result.addStringColumn(ItmDtlSub2Cols.$o_asst_dpt_cd);
		result.addStringColumn(ItmDtlSub2Cols.$o_sls_dpt_cd);
		result.addStringColumn(ItmDtlSub2Cols.$o_site_cd);
		result.addStringColumn(ItmDtlSub2Cols.$o_site_nm);
		result.addStringColumn(ItmDtlSub2Cols.$o_lg_grp_cd);
		result.addStringColumn(ItmDtlSub2Cols.$o_lg_grp_nm);
		result.addStringColumn(ItmDtlSub2Cols.$o_loc_grp_cd);
		result.addStringColumn(ItmDtlSub2Cols.$o_loc_grp_nm);
		result.addStringColumn(ItmDtlSub2Cols.$o_alloc_grp_cd);
		result.addStringColumn(ItmDtlSub2Cols.$o_alloc_grp_nm);
		result.addStringColumn(ItmDtlSub2Cols.$o_loc_cal_cd);
		result.addStringColumn(ItmDtlSub2Cols.$o_loc_mng_typ);
		result.addStringColumn(ItmDtlSub2Cols.$o_rsrc_cd1);
		result.addStringColumn(ItmDtlSub2Cols.$o_rsrc_cd2);
		result.addStringColumn(ItmDtlSub2Cols.$o_prnt_lcl_cd);
		result.addStringColumn(ItmDtlSub2Cols.$o_asppl_cd);
		result.addStringColumn(ItmDtlSub2Cols.$o_vmi_purc_dpt_cd);
		result.addStringColumn(ItmDtlSub2Cols.$o_mrkt_judg_role_cd);
		result.addStringColumn(ItmDtlSub2Cols.$o_po_print_cd);
		result.addStringColumn(ItmDtlSub2Cols.$o_sppl_ship_form_cd);
		result.addStringColumn(ItmDtlSub2Cols.$o_sppl_cntct_dpt);
		result.addStringColumn(ItmDtlSub2Cols.$o_sppl_cntct_psn);
		result.addStringColumn(ItmDtlSub2Cols.$o_sppl_cntct_psn_title);
		result.addStringColumn(ItmDtlSub2Cols.$o_purc_upri_req_typ);
		result.addStringColumn(ItmDtlSub2Cols.$o_purc_amt_rnd_typ);
		result.addStringColumn(ItmDtlSub2Cols.$o_purc_tax_rnd_typ);
		result.addStringColumn(ItmDtlSub2Cols.$o_purc_tax_calc_typ);
		result.addStringColumn(ItmDtlSub2Cols.$o_prov_rcv_typ);
		result.addStringColumn(ItmDtlSub2Cols.$o_prov_basis_typ);
		result.addStringColumn(ItmDtlSub2Cols.$o_prov_amt_rnd_typ);
		result.addStringColumn(ItmDtlSub2Cols.$o_prov_tax_rnd_typ);
		result.addStringColumn(ItmDtlSub2Cols.$o_prov_tax_calc_typ);
		result.addStringColumn(ItmDtlSub2Cols.$o_sppl_cal_cd);
		result.addStringColumn(ItmDtlSub2Cols.$o_sppl_tterm_cd1);
		result.addStringColumn(ItmDtlSub2Cols.$o_sppl_tterm_cd2);
		result.addStringColumn(ItmDtlSub2Cols.$o_sppl_tterm_cd3);
		result.addStringColumn(ItmDtlSub2Cols.$o_unit_cd);
		result.addStringColumn(ItmDtlSub2Cols.$o_unit_nm);
		result.addStringColumn(ItmDtlSub2Cols.$o_rnd_typ);
		result.addStringColumn(ItmDtlSub2Cols.$o_dim_unit_cd);
		result.addStringColumn(ItmDtlSub2Cols.$o_wt_unit_cd);
		result.addStringColumn(ItmDtlSub2Cols.$o_conts_unit_cd);
		result.addStringColumn(ItmDtlSub2Cols.$o_hs_cd);
		result.addStringColumn(ItmDtlSub2Cols.$o_itm_jnl_cd);
		result.addStringColumn(ItmDtlSub2Cols.$o_ac_itm_grp_cd);
		result.addStringColumn(ItmDtlSub2Cols.$o_ship_unit_cd);
		result.addStringColumn(ItmDtlSub2Cols.$o_mfg_unit_cd);
		result.addStringColumn(ItmDtlSub2Cols.$o_purc_unit_cd);
		result.addStringColumn(ItmDtlSub2Cols.$o_pckg_unit_cd);
		result.addStringColumn(ItmDtlSub2Cols.$o_lot_mng_typ);
		result.addStringColumn(ItmDtlSub2Cols.$o_lot_no_typ);
		result.addStringColumn(ItmDtlSub2Cols.$o_lot_no_ptn_cd);
		result.addStringColumn(ItmDtlSub2Cols.$o_sublot_mng_typ);
		result.addStringColumn(ItmDtlSub2Cols.$o_sublot_no_typ);
		result.addStringColumn(ItmDtlSub2Cols.$o_sublot_no_ptn_cd);
		result.addStringColumn(ItmDtlSub2Cols.$o_insp_bind_typ);
		result.addStringColumn(ItmDtlSub2Cols.$o_lmt_ctl_categ);
		result.addStringColumn(ItmDtlSub2Cols.$o_cont_fctr_unit_cd);
		result.addStringColumn(ItmDtlSub2Cols.$o_cont_fctr_rnd_typ);
		result.addStringColumn(ItmDtlSub2Cols.$o_sno1_mng_typ);
		result.addStringColumn(ItmDtlSub2Cols.$o_sno1_num_typ);
		result.addStringColumn(ItmDtlSub2Cols.$o_sno1_ptn_cd);
		result.addStringColumn(ItmDtlSub2Cols.$o_sno2_mng_typ);
		result.addStringColumn(ItmDtlSub2Cols.$o_sno2_num_typ);
		result.addStringColumn(ItmDtlSub2Cols.$o_sno2_ptn_cd);
		result.addStringColumn(ItmDtlSub2Cols.$o_sno3_mng_typ);
		result.addStringColumn(ItmDtlSub2Cols.$o_sno3_num_typ);
		result.addStringColumn(ItmDtlSub2Cols.$o_sno3_ptn_cd);
		result.addStringColumn(ItmDtlSub2Cols.$o_sno4_mng_typ);
		result.addStringColumn(ItmDtlSub2Cols.$o_sno4_num_typ);
		result.addStringColumn(ItmDtlSub2Cols.$o_sno4_ptn_cd);
		result.addStringColumn(ItmDtlSub2Cols.$o_mfg_inst_unit_typ);
		result.addStringColumn(ItmDtlSub2Cols.$o_mrp_proc_typ);
		result.addStringColumn(ItmDtlSub2Cols.$o_cntry_org_cd);
		result.addStringColumn(ItmDtlSub2Cols.$o_comp_spec_typ);
		result.addStringColumn(ItmDtlSub2Cols.$o_itm_spec_grp_cd);
		result.addStringColumn(ItmDtlSub2Cols.$o_slo_proc_typ);
		result.addStringColumn(ItmDtlSub2Cols.$o_ship_inst_typ);
		result.addStringColumn(ItmDtlSub2Cols.$o_itm_ship_grp_cd);
		result.addStringColumn(ItmDtlSub2Cols.$o_ship_valid_grp_cd);
		result.addStringColumn(ItmDtlSub2Cols.$o_ship_term_cd);
		result.addStringColumn(ItmDtlSub2Cols.$o_exim_xpns_typ);
		result.addBooleanColumn(ItmDtlSub2Cols.$o_sundry_itm_flg);
		result.addBooleanColumn(ItmDtlSub2Cols.$o_purc_upri_cng_flg);
		result.addBooleanColumn(ItmDtlSub2Cols.$o_prov_upri_cng_flg);
		result.addBooleanColumn(ItmDtlSub2Cols.$o_foreign_flg);
		result.addBooleanColumn(ItmDtlSub2Cols.$o_lg_def_flg);
		result.addBooleanColumn(ItmDtlSub2Cols.$o_pre_outsrc_act_flg);
		result.addBooleanColumn(ItmDtlSub2Cols.$o_ddlv_prov_insp_flg);
		result.addBooleanColumn(ItmDtlSub2Cols.$o_str_ln_tgt_flg);
		result.addBooleanColumn(ItmDtlSub2Cols.$o_alloc_lmt_flg);
		result.addBooleanColumn(ItmDtlSub2Cols.$o_gi_pack_xfer_flg);
		result.addBooleanColumn(ItmDtlSub2Cols.$o_gi_vmi_flg);
		result.addBooleanColumn(ItmDtlSub2Cols.$o_dscnt_itm_flg);
		result.addBooleanColumn(ItmDtlSub2Cols.$o_minus_stk_flg);
		result.addBooleanColumn(ItmDtlSub2Cols.$o_not_new_lot_flg);
		result.addBooleanColumn(ItmDtlSub2Cols.$o_gi_alloc_flg);
		result.addBooleanColumn(ItmDtlSub2Cols.$o_pack_alloc_flg);
		result.addBooleanColumn(ItmDtlSub2Cols.$o_bp_lot_flg);
		result.addBooleanColumn(ItmDtlSub2Cols.$o_skip_chk_ship_flg);
		result.addBooleanColumn(ItmDtlSub2Cols.$o_mrkt_judg_flg);
		result.addBooleanColumn(ItmDtlSub2Cols.$o_lmt_ctl_flg);
		result.addBooleanColumn(ItmDtlSub2Cols.$o_cont_fctr_flg);
		result.addBooleanColumn(ItmDtlSub2Cols.$o_slo_sno1_flg);
		result.addBooleanColumn(ItmDtlSub2Cols.$o_rqmt_sno1_flg);
		result.addBooleanColumn(ItmDtlSub2Cols.$o_slo_sno2_flg);
		result.addBooleanColumn(ItmDtlSub2Cols.$o_rqmt_sno2_flg);
		result.addBooleanColumn(ItmDtlSub2Cols.$o_slo_sno3_flg);
		result.addBooleanColumn(ItmDtlSub2Cols.$o_rqmt_sno3_flg);
		result.addBooleanColumn(ItmDtlSub2Cols.$o_slo_sno4_flg);
		result.addBooleanColumn(ItmDtlSub2Cols.$o_rqmt_sno4_flg);
		result.addBooleanColumn(ItmDtlSub2Cols.$o_inpt_itm_add_flg);
		result.addBooleanColumn(ItmDtlSub2Cols.$o_inpt_itm_del_flg);
		result.addBooleanColumn(ItmDtlSub2Cols.$o_sch_flg);
		result.addBooleanColumn(ItmDtlSub2Cols.$o_comp_rev_at_slo_flg);
		result.addBooleanColumn(ItmDtlSub2Cols.$o_comp_core_itm_flg);
		result.addBooleanColumn(ItmDtlSub2Cols.$o_slo_proc_flg);
		result.addBooleanColumn(ItmDtlSub2Cols.$o_ship_lot_back_stop_flg);
		result.addBooleanColumn(ItmDtlSub2Cols.$o_arr_skip_flg);
		result.addBooleanColumn(ItmDtlSub2Cols.$o_purc_dlv_slip_flg);
		result.addBooleanColumn(ItmDtlSub2Cols.$o_stk_lst_flg);
		result.addBooleanColumn(ItmDtlSub2Cols.$o_ver_flg);
		result.addBooleanColumn(ItmDtlSub2Cols.$o_subcon_flg);
		result.addBooleanColumn(ItmDtlSub2Cols.$o_wrk_po_flg);
		result.addBooleanColumn(ItmDtlSub2Cols.$o_wrk_ap_flg);
		result.addBooleanColumn(ItmDtlSub2Cols.$o_onr_prsppl_flg);
		result.addBooleanColumn(ItmDtlSub2Cols.$o_sppl_iv_flg);
		result.addBooleanColumn(ItmDtlSub2Cols.$o_prms_recv_flg);
		result.addBinaryColumn(ItmDtlSub2Cols.$o_th_image);
		result.addBooleanColumn(ItmDtlSub2Cols.$i_mfg_flg);
		result.addBooleanColumn(ItmDtlSub2Cols.$i_purc_flg);
		result.addBooleanColumn(ItmDtlSub2Cols.$i_outsrc_flg);
		result.addBooleanColumn(ItmDtlSub2Cols.$i_wg_xfr_flg);
		result.addBooleanColumn(_$asset_not_mng_flg);
		result.addBooleanColumn(ItmDtlSub2Cols.$o_repurc_obli_flg);
		result.addStringColumn(ItmDtlSub2Cols.$o_outsrc_upri_typ);
		
		// 直接入力時
		if (isInput(row)) {
			// 入力された値で絞り込む
			row.setStringNE("itm_sub2", row.getStringNE($INPUT_VAL));
			return;
		}
	}

	@Override
	protected  MCList<?> getItmDtlSub2_AfterSelect(MCRow row, MCQueryApiBuilder builder, MAM_ITM_DTL_R t, MCList<?> result) {
		MCList<?> l = super.getItmDtlSub2_AfterSelect(row, builder, t, result);
		if (isInput(row) || isCombo(row)) {
			l = getItmDtl_NoDupList(row, result, l, ItmDtlCols.$o_itm_sub2, "MA.MAUAL0010.ItmDtlSub2");
		}
		// 区分名の設定
		l.addStringColumn(MAC_ITM_TYP.$NAME);
		l.addStringColumn(MAC_STK_MNG_TYP.$NAME);
		l.addStringColumn(MAC_ASSET_MNG_TYP.$NAME);
		l.addStringColumn(MAC_LOC_MNG_TYP.$NAME);
		MAC_ITM_TYP.putNameNE(l, MAC_ITM_TYP.$VALUE, MAC_ITM_TYP.$NAME);
		MAC_STK_MNG_TYP.putNameNE(l, MAC_STK_MNG_TYP.$VALUE, MAC_STK_MNG_TYP.$NAME);
		MAC_ASSET_MNG_TYP.putNameNE(l, MAC_ASSET_MNG_TYP.$VALUE, MAC_ASSET_MNG_TYP.$NAME);
		MAC_LOC_MNG_TYP.putNameNE(l, MAC_LOC_MNG_TYP.$VALUE, MAC_LOC_MNG_TYP.$NAME);
		return l;
	}

	// -- ItmDtlSub2:品目詳細（枝番２） (END)

	// -- ItmDtlSub3:品目詳細（枝番３） (START)

	@Override
	public MCList<MCRow> getItmDtlSub3(MCRow row) {
		if (isNull(row.getStringNE(ItmDtlSub3Cols.$i_itm_cd))
				|| isNull(row.getStringNE(ItmDtlSub3Cols.$i_itm_sub1))
				|| isNull(row.getStringNE(ItmDtlSub3Cols.$i_itm_sub2))) {
			return null;
		}
		MCList<MAM_ITM_DTL_R> result = MCList.create(MAM_ITM_DTL_R.class);
		MAM_ITM_DTL_R t = MAM_ITM_DTL_R.create("T");
		MCQueryApiBuilder builder = MCQueryApiBuilder.create(t);
		getItmDtlSub3_Set(row, builder, t, result);
		result = _itmDtlSelect.apply(row).apply(builder).apply(t).apply(result);
		MCList<? extends MCRow> down = getItmDtlSub3_AfterSelect(row, builder , t, result);
		down = listlogicCommon_AfterSelect(row, result, down, "MA.MAUAL0010.ItmDtlSub3");
		if (isNull(down)) return null;
		return getItmDtlSub3_SubColumns(row, down);
	}

	@Override
	protected  void getItmDtlSub3_Set(MCRow row, MCQueryApiBuilder builder, MAM_ITM_DTL_R t, MCList<?> result) {
		// out項目には存在するが、MAM_ITM_DTLに存在しない項目の追加
		result.addNumberColumn(ItmDtlSub3Cols.$o_wtax_rate);
		result.addNumberColumn(ItmDtlSub3Cols.$o_conts_qty);
		result.addNumberColumn(ItmDtlSub3Cols.$o_pay_crryovr_times);
		result.addNumberColumn(ItmDtlSub3Cols.$o_std_cont_fctr);
		result.addNumberColumn(ItmDtlSub3Cols.$o_cont_fctr_dec_place);
		result.addNumberColumn(ItmDtlSub3Cols.$o_dec_place);
		result.addNumberColumn(ItmDtlSub3Cols.$o_dim);
		result.addNumberColumn(ItmDtlSub3Cols.$o_wt);
		result.addNumberColumn(ItmDtlSub3Cols.$o_rqmt_rstr_qty);
		result.addNumberColumn(ItmDtlSub3Cols.$o_alloc_margin_days);
		result.addNumberColumn(ItmDtlSub3Cols.$o_mrp_alloc_margin_days);
		result.addNumberColumn(ItmDtlSub3Cols.$o_mrp_opn_xfr_days);
		result.addStringColumn(ItmDtlSub3Cols.$o_itm_alt_nm1);
		result.addStringColumn(ItmDtlSub3Cols.$o_itm_alt_nm2);
		result.addStringColumn(ItmDtlSub3Cols.$o_itm_alt_nm3);
		result.addStringColumn(ItmDtlSub3Cols.$o_itm_alt_nm4);
		result.addStringColumn(ItmDtlSub3Cols.$o_itm_typ);
		result.addStringColumn(ItmDtlSub3Cols.$o_itm_typ_d_cd);
		result.addStringColumn(ItmDtlSub3Cols.$o_itm_typ_d_nm);
		result.addStringColumn(ItmDtlSub3Cols.$o_stk_mng_typ);
		result.addStringColumn(ItmDtlSub3Cols.$o_asset_mng_typ);
		result.addStringColumn(ItmDtlSub3Cols.$o_purc_tax_cd);
		result.addStringColumn(ItmDtlSub3Cols.$o_prov_tax_cd);
		result.addStringColumn(ItmDtlSub3Cols.$o_zip_cd);
		result.addStringColumn(ItmDtlSub3Cols.$o_addr1);
		result.addStringColumn(ItmDtlSub3Cols.$o_addr2);
		result.addStringColumn(ItmDtlSub3Cols.$o_addr3);
		result.addStringColumn(ItmDtlSub3Cols.$o_addr4);
		result.addStringColumn(ItmDtlSub3Cols.$o_tel);
		result.addStringColumn(ItmDtlSub3Cols.$o_fax);
		result.addStringColumn(ItmDtlSub3Cols.$o_cur_cd);
		result.addStringColumn(ItmDtlSub3Cols.$o_cur_nm);
		result.addStringColumn(ItmDtlSub3Cols.$o_cntry_cd);
		result.addStringColumn(ItmDtlSub3Cols.$o_cntry_nm);
		result.addStringColumn(ItmDtlSub3Cols.$o_area_cd);
		result.addStringColumn(ItmDtlSub3Cols.$o_area_nm);
		result.addStringColumn(ItmDtlSub3Cols.$o_asst_dpt_cd);
		result.addStringColumn(ItmDtlSub3Cols.$o_sls_dpt_cd);
		result.addStringColumn(ItmDtlSub3Cols.$o_site_cd);
		result.addStringColumn(ItmDtlSub3Cols.$o_site_nm);
		result.addStringColumn(ItmDtlSub3Cols.$o_lg_grp_cd);
		result.addStringColumn(ItmDtlSub3Cols.$o_lg_grp_nm);
		result.addStringColumn(ItmDtlSub3Cols.$o_loc_grp_cd);
		result.addStringColumn(ItmDtlSub3Cols.$o_loc_grp_nm);
		result.addStringColumn(ItmDtlSub3Cols.$o_alloc_grp_cd);
		result.addStringColumn(ItmDtlSub3Cols.$o_alloc_grp_nm);
		result.addStringColumn(ItmDtlSub3Cols.$o_loc_cal_cd);
		result.addStringColumn(ItmDtlSub3Cols.$o_loc_mng_typ);
		result.addStringColumn(ItmDtlSub3Cols.$o_rsrc_cd1);
		result.addStringColumn(ItmDtlSub3Cols.$o_rsrc_cd2);
		result.addStringColumn(ItmDtlSub3Cols.$o_prnt_lcl_cd);
		result.addStringColumn(ItmDtlSub3Cols.$o_asppl_cd);
		result.addStringColumn(ItmDtlSub3Cols.$o_vmi_purc_dpt_cd);
		result.addStringColumn(ItmDtlSub3Cols.$o_mrkt_judg_role_cd);
		result.addStringColumn(ItmDtlSub3Cols.$o_po_print_cd);
		result.addStringColumn(ItmDtlSub3Cols.$o_sppl_ship_form_cd);
		result.addStringColumn(ItmDtlSub3Cols.$o_sppl_cntct_dpt);
		result.addStringColumn(ItmDtlSub3Cols.$o_sppl_cntct_psn);
		result.addStringColumn(ItmDtlSub3Cols.$o_sppl_cntct_psn_title);
		result.addStringColumn(ItmDtlSub3Cols.$o_purc_upri_req_typ);
		result.addStringColumn(ItmDtlSub3Cols.$o_purc_amt_rnd_typ);
		result.addStringColumn(ItmDtlSub3Cols.$o_purc_tax_rnd_typ);
		result.addStringColumn(ItmDtlSub3Cols.$o_purc_tax_calc_typ);
		result.addStringColumn(ItmDtlSub3Cols.$o_prov_rcv_typ);
		result.addStringColumn(ItmDtlSub3Cols.$o_prov_basis_typ);
		result.addStringColumn(ItmDtlSub3Cols.$o_prov_amt_rnd_typ);
		result.addStringColumn(ItmDtlSub3Cols.$o_prov_tax_rnd_typ);
		result.addStringColumn(ItmDtlSub3Cols.$o_prov_tax_calc_typ);
		result.addStringColumn(ItmDtlSub3Cols.$o_sppl_cal_cd);
		result.addStringColumn(ItmDtlSub3Cols.$o_sppl_tterm_cd1);
		result.addStringColumn(ItmDtlSub3Cols.$o_sppl_tterm_cd2);
		result.addStringColumn(ItmDtlSub3Cols.$o_sppl_tterm_cd3);
		result.addStringColumn(ItmDtlSub3Cols.$o_unit_cd);
		result.addStringColumn(ItmDtlSub3Cols.$o_unit_nm);
		result.addStringColumn(ItmDtlSub3Cols.$o_rnd_typ);
		result.addStringColumn(ItmDtlSub3Cols.$o_dim_unit_cd);
		result.addStringColumn(ItmDtlSub3Cols.$o_wt_unit_cd);
		result.addStringColumn(ItmDtlSub3Cols.$o_conts_unit_cd);
		result.addStringColumn(ItmDtlSub3Cols.$o_hs_cd);
		result.addStringColumn(ItmDtlSub3Cols.$o_itm_jnl_cd);
		result.addStringColumn(ItmDtlSub3Cols.$o_ac_itm_grp_cd);
		result.addStringColumn(ItmDtlSub3Cols.$o_ship_unit_cd);
		result.addStringColumn(ItmDtlSub3Cols.$o_mfg_unit_cd);
		result.addStringColumn(ItmDtlSub3Cols.$o_purc_unit_cd);
		result.addStringColumn(ItmDtlSub3Cols.$o_pckg_unit_cd);
		result.addStringColumn(ItmDtlSub3Cols.$o_lot_mng_typ);
		result.addStringColumn(ItmDtlSub3Cols.$o_lot_no_typ);
		result.addStringColumn(ItmDtlSub3Cols.$o_lot_no_ptn_cd);
		result.addStringColumn(ItmDtlSub3Cols.$o_sublot_mng_typ);
		result.addStringColumn(ItmDtlSub3Cols.$o_sublot_no_typ);
		result.addStringColumn(ItmDtlSub3Cols.$o_sublot_no_ptn_cd);
		result.addStringColumn(ItmDtlSub3Cols.$o_insp_bind_typ);
		result.addStringColumn(ItmDtlSub3Cols.$o_lmt_ctl_categ);
		result.addStringColumn(ItmDtlSub3Cols.$o_cont_fctr_unit_cd);
		result.addStringColumn(ItmDtlSub3Cols.$o_cont_fctr_rnd_typ);
		result.addStringColumn(ItmDtlSub3Cols.$o_sno1_mng_typ);
		result.addStringColumn(ItmDtlSub3Cols.$o_sno1_num_typ);
		result.addStringColumn(ItmDtlSub3Cols.$o_sno1_ptn_cd);
		result.addStringColumn(ItmDtlSub3Cols.$o_sno2_mng_typ);
		result.addStringColumn(ItmDtlSub3Cols.$o_sno2_num_typ);
		result.addStringColumn(ItmDtlSub3Cols.$o_sno2_ptn_cd);
		result.addStringColumn(ItmDtlSub3Cols.$o_sno3_mng_typ);
		result.addStringColumn(ItmDtlSub3Cols.$o_sno3_num_typ);
		result.addStringColumn(ItmDtlSub3Cols.$o_sno3_ptn_cd);
		result.addStringColumn(ItmDtlSub3Cols.$o_sno4_mng_typ);
		result.addStringColumn(ItmDtlSub3Cols.$o_sno4_num_typ);
		result.addStringColumn(ItmDtlSub3Cols.$o_sno4_ptn_cd);
		result.addStringColumn(ItmDtlSub3Cols.$o_mfg_inst_unit_typ);
		result.addStringColumn(ItmDtlSub3Cols.$o_mrp_proc_typ);
		result.addStringColumn(ItmDtlSub3Cols.$o_cntry_org_cd);
		result.addStringColumn(ItmDtlSub3Cols.$o_comp_spec_typ);
		result.addStringColumn(ItmDtlSub3Cols.$o_itm_spec_grp_cd);
		result.addStringColumn(ItmDtlSub3Cols.$o_slo_proc_typ);
		result.addStringColumn(ItmDtlSub3Cols.$o_ship_inst_typ);
		result.addStringColumn(ItmDtlSub3Cols.$o_itm_ship_grp_cd);
		result.addStringColumn(ItmDtlSub3Cols.$o_ship_valid_grp_cd);
		result.addStringColumn(ItmDtlSub3Cols.$o_ship_term_cd);
		result.addStringColumn(ItmDtlSub3Cols.$o_exim_xpns_typ);
		result.addBooleanColumn(ItmDtlSub3Cols.$o_sundry_itm_flg);
		result.addBooleanColumn(ItmDtlSub3Cols.$o_purc_upri_cng_flg);
		result.addBooleanColumn(ItmDtlSub3Cols.$o_prov_upri_cng_flg);
		result.addBooleanColumn(ItmDtlSub3Cols.$o_foreign_flg);
		result.addBooleanColumn(ItmDtlSub3Cols.$o_lg_def_flg);
		result.addBooleanColumn(ItmDtlSub3Cols.$o_pre_outsrc_act_flg);
		result.addBooleanColumn(ItmDtlSub3Cols.$o_ddlv_prov_insp_flg);
		result.addBooleanColumn(ItmDtlSub3Cols.$o_str_ln_tgt_flg);
		result.addBooleanColumn(ItmDtlSub3Cols.$o_alloc_lmt_flg);
		result.addBooleanColumn(ItmDtlSub3Cols.$o_gi_pack_xfer_flg);
		result.addBooleanColumn(ItmDtlSub3Cols.$o_gi_vmi_flg);
		result.addBooleanColumn(ItmDtlSub3Cols.$o_dscnt_itm_flg);
		result.addBooleanColumn(ItmDtlSub3Cols.$o_minus_stk_flg);
		result.addBooleanColumn(ItmDtlSub3Cols.$o_not_new_lot_flg);
		result.addBooleanColumn(ItmDtlSub3Cols.$o_gi_alloc_flg);
		result.addBooleanColumn(ItmDtlSub3Cols.$o_pack_alloc_flg);
		result.addBooleanColumn(ItmDtlSub3Cols.$o_bp_lot_flg);
		result.addBooleanColumn(ItmDtlSub3Cols.$o_skip_chk_ship_flg);
		result.addBooleanColumn(ItmDtlSub3Cols.$o_mrkt_judg_flg);
		result.addBooleanColumn(ItmDtlSub3Cols.$o_lmt_ctl_flg);
		result.addBooleanColumn(ItmDtlSub3Cols.$o_cont_fctr_flg);
		result.addBooleanColumn(ItmDtlSub3Cols.$o_slo_sno1_flg);
		result.addBooleanColumn(ItmDtlSub3Cols.$o_rqmt_sno1_flg);
		result.addBooleanColumn(ItmDtlSub3Cols.$o_slo_sno2_flg);
		result.addBooleanColumn(ItmDtlSub3Cols.$o_rqmt_sno2_flg);
		result.addBooleanColumn(ItmDtlSub3Cols.$o_slo_sno3_flg);
		result.addBooleanColumn(ItmDtlSub3Cols.$o_rqmt_sno3_flg);
		result.addBooleanColumn(ItmDtlSub3Cols.$o_slo_sno4_flg);
		result.addBooleanColumn(ItmDtlSub3Cols.$o_rqmt_sno4_flg);
		result.addBooleanColumn(ItmDtlSub3Cols.$o_inpt_itm_add_flg);
		result.addBooleanColumn(ItmDtlSub3Cols.$o_inpt_itm_del_flg);
		result.addBooleanColumn(ItmDtlSub3Cols.$o_sch_flg);
		result.addBooleanColumn(ItmDtlSub3Cols.$o_comp_rev_at_slo_flg);
		result.addBooleanColumn(ItmDtlSub3Cols.$o_comp_core_itm_flg);
		result.addBooleanColumn(ItmDtlSub3Cols.$o_slo_proc_flg);
		result.addBooleanColumn(ItmDtlSub3Cols.$o_ship_lot_back_stop_flg);
		result.addBooleanColumn(ItmDtlSub3Cols.$o_arr_skip_flg);
		result.addBooleanColumn(ItmDtlSub3Cols.$o_purc_dlv_slip_flg);
		result.addBooleanColumn(ItmDtlSub3Cols.$o_stk_lst_flg);
		result.addBooleanColumn(ItmDtlSub3Cols.$o_ver_flg);
		result.addBooleanColumn(ItmDtlSub3Cols.$o_subcon_flg);
		result.addBooleanColumn(ItmDtlSub3Cols.$o_wrk_po_flg);
		result.addBooleanColumn(ItmDtlSub3Cols.$o_wrk_ap_flg);
		result.addBooleanColumn(ItmDtlSub3Cols.$o_onr_prsppl_flg);
		result.addBooleanColumn(ItmDtlSub3Cols.$o_sppl_iv_flg);
		result.addBooleanColumn(ItmDtlSub3Cols.$o_prms_recv_flg);
		result.addBinaryColumn(ItmDtlSub3Cols.$o_th_image);
		result.addBooleanColumn(ItmDtlSub3Cols.$i_mfg_flg);
		result.addBooleanColumn(ItmDtlSub3Cols.$i_purc_flg);
		result.addBooleanColumn(ItmDtlSub3Cols.$i_outsrc_flg);
		result.addBooleanColumn(ItmDtlSub3Cols.$i_wg_xfr_flg);
		result.addBooleanColumn(_$asset_not_mng_flg);
		result.addBooleanColumn(ItmDtlSub3Cols.$o_repurc_obli_flg);
		result.addStringColumn(ItmDtlSub3Cols.$o_outsrc_upri_typ);
		
		// 直接入力時
		if (isInput(row)) {
			// 入力された値で絞り込む
			row.setStringNE("itm_sub3", row.getStringNE($INPUT_VAL));
			return;
		}
	}

	@Override
	protected  MCList<?> getItmDtlSub3_AfterSelect(MCRow row, MCQueryApiBuilder builder, MAM_ITM_DTL_R t, MCList<?> result) {
		MCList<?> l = super.getItmDtlSub3_AfterSelect(row, builder, t, result);
		if (isInput(row) || isCombo(row)) {
			l = getItmDtl_NoDupList(row, result, l, ItmDtlSub1Cols.$o_itm_sub3, "MA.MAUAL0010.ItmDtlSub3");
		}
		// 区分名の設定
		l.addStringColumn(MAC_ITM_TYP.$NAME);
		l.addStringColumn(MAC_STK_MNG_TYP.$NAME);
		l.addStringColumn(MAC_ASSET_MNG_TYP.$NAME);
		l.addStringColumn(MAC_LOC_MNG_TYP.$NAME);
		MAC_ITM_TYP.putNameNE(l, MAC_ITM_TYP.$VALUE, MAC_ITM_TYP.$NAME);
		MAC_STK_MNG_TYP.putNameNE(l, MAC_STK_MNG_TYP.$VALUE, MAC_STK_MNG_TYP.$NAME);
		MAC_ASSET_MNG_TYP.putNameNE(l, MAC_ASSET_MNG_TYP.$VALUE, MAC_ASSET_MNG_TYP.$NAME);
		MAC_LOC_MNG_TYP.putNameNE(l, MAC_LOC_MNG_TYP.$VALUE, MAC_LOC_MNG_TYP.$NAME);
		return l;
	}

	// -- ItmDtlSub3:品目詳細（枝番３） (END)

	// -- ItmDtl:品目詳細（共通） (START)

	// 購買フラグ(2)で取得したデータを表すフラグ
	protected final String _$asset_not_mng_flg = "asset_not_mng_flg";
	protected final String _$mfg_flg = "mfg_flg";
	protected final String _$purc_flg = "purc_flg";
	protected final String _$outsrc_flg = "outsrc_flg";
	protected final String _$wg_xfr_flg = "wg_xfr_flg";

	/**
	 * 品目詳細のＤＢコンテナキャッシュをまとめて管理するクラス
	 */
	protected DbcCacheMap _itmDtlCache = new DbcCacheMap();

	/**
	 * 品目詳細で使用するＤＢコンテナキャッシュを生成します。
	 * 
	 * @param bindL キャッシュ生成の元になるバインドリスト
	 */
	protected void itmDtlInitCache(MCList<MAM_ITM_DTL_R> bindL) {
		MAM_ITM_R itmDbc = MAM_ITM_R.create("T");
		MAM_ITM_TYP_D_R itmTypD1 = MAM_ITM_TYP_D_R.create("M1");
		MCQueryApiBuilder itmBuilder = MCQueryApiBuilder.create(itmDbc);
		itmBuilder.setSelect(
				itmDbc.itm_cd,
				itmDbc.itm_sub1,
				itmDbc.itm_sub2,
				itmDbc.itm_sub3,
				itmTypD1.base_itm_typ_d_nm);
		itmBuilder.addLeftOuterJoin(itmTypD1,
				itmTypD1.itm_typ.eq(itmDbc.itm_typ)
				.and(itmTypD1.itm_typ_d_cd.eq(itmDbc.itm_typ_d_cd)));
		_itmDtlCache.set("MAM_ITM", itmBuilder, bindL, "itm_cd", "itm_sub1", "itm_sub2", "itm_sub3");

		MAM_WG_R wgDbc = MAM_WG_R.create("T");
		MCQueryApiBuilder wgBuilder = MCQueryApiBuilder.create(wgDbc);
		wgBuilder.setSelect(
				wgDbc.wg_cd,
				wgDbc.wg_nm);
		_itmDtlCache.set("MAM_WG", wgBuilder, bindL, "wg_cd");

		MAVM_ITM_WG_R itmWgDbc = MAVM_ITM_WG_R.create("T");
		MAM_UNIT_R unit1 = MAM_UNIT_R.create("M1");
		MAM_UNIT_R unit2 = MAM_UNIT_R.create("M2");
		MCQueryApiBuilder itmWgBuilder = MCQueryApiBuilder.create(itmWgDbc);
		itmWgBuilder.addSelect(
				unit1.unit_nm,
				unit2.unit_nm.as("cont_fctr_unit_nm"));
		itmWgBuilder.addLeftOuterJoin(unit1, unit1.unit_cd.eq(itmWgDbc.unit_cd));
		itmWgBuilder.addLeftOuterJoin(unit2, unit2.unit_cd.eq(itmWgDbc.cont_fctr_unit_cd));
		_itmDtlCache.set("MAVM_ITM_WG", itmWgBuilder, bindL, "itm_cd", "itm_sub1", "itm_sub2", "itm_sub3", "wg_cd");

		_itmDtlCache.set("MAM_SITE", "site_nm", bindL, "site_cd");
		_itmDtlCache.set("MAM_LOC_GRP", "loc_grp_nm", bindL, "loc_grp_cd");
		_itmDtlCache.set("MAM_ALLOC_GRP", "alloc_grp_nm", bindL, "alloc_grp_cd");
		_itmDtlCache.set("MAM_LG_GRP", "lg_grp_nm", bindL, "lg_grp_cd");
		_itmDtlCache.set("MAM_CUR", "cur_nm", bindL, "cur_cd");
		_itmDtlCache.set("MAM_CNTRY", "cntry_nm", bindL, "cntry_cd");
		_itmDtlCache.set("MAM_AREA", "area_nm", bindL, "area_cd");

		MCList<?> list = bindL.clone();
		String[][] cols = {
			{"maker_cd", "sppl_cd"}
		};
		for (String[] col : cols) {
			bindL.groupBy(col[0])
				.subList(r -> !isNullOrNullVal(r.getStringNE(col[0])))
				.forEach(r -> list.add().setStringNE(col[1], r.getStringNE(col[0])));
		}
		MAM_BP_R bpDbc = MAM_BP_R.create("T");
		MAM_CUR_R cur1 = MAM_CUR_R.create("M1");
		MAM_CNTRY_R cntry1 = MAM_CNTRY_R.create("M2");
		MAM_AREA_R area1 = MAM_AREA_R.create("M3");
		MCQueryApiBuilder bpBuilder = MCQueryApiBuilder.create(bpDbc);
		bpBuilder.addSelectNEActiveForeign(
				cur1.cur_nm,
				cntry1.cntry_nm,
				area1.area_nm);
		bpBuilder.addLeftOuterJoin(cur1, cur1.cur_cd.eq(bpDbc.cur_cd))
				.addLeftOuterJoin(cntry1, cntry1.cntry_cd.eq(bpDbc.cntry_cd))
				.addLeftOuterJoin(area1, area1.area_cd.eq(bpDbc.area_cd));
		_itmDtlCache.set("MAM_BP", bpBuilder, list, "sppl_cd");
	}

	/**
	 * 検索結果に対してＤＢコンテナキャッシュから属性情報を補完します。
	 * 
	 * @param row 検索条件
	 * @param result 検索結果
	 */
	protected void itmDtlSetDbcValues(MCRow row, MCList<MAM_ITM_DTL_R> result) {
		itmDtlInitCache(result);
		MCList<MAM_ITM_DTL_R> rmL = MCList.create(MAM_ITM_DTL_R.class);
		for (MAM_ITM_DTL_R r : result) {
			// 発注先を考慮するか
			boolean spplFlg = r.getBooleanNE("purc_flg") || r.getBooleanNE("outsrc_flg");

			MAM_ITM_R itmR = _itmDtlCache.get(MAM_ITM_R.class, r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3());
			MAM_WG_R wgR = _itmDtlCache.get(MAM_WG_R.class, r.wg_cd());
			MAVM_ITM_WG_R itmWgR = _itmDtlCache.get(MAVM_ITM_WG_R.class, r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3(), r.wg_cd());
			MAM_BP_R spplR = _itmDtlCache.get(MAM_BP_R.class, r.sppl_cd());
			if (isNullOr(
					itmR.itm_cd(), itmR.itm_sub1(), itmR.itm_sub2(), itmR.itm_sub3(),
					wgR.wg_cd(), itmWgR.wg_cd(),
					itmWgR.itm_cd(), itmWgR.itm_sub1(), itmWgR.itm_sub2(), itmWgR.itm_sub3()))  {
				// INNER JOINを考慮（取得できないレコードは、検索結果から除外する）
				rmL.add(r);
				continue;
			}

			r.setStringNE(ItmDtlCols.$o_wg_nm, wgR.wg_nm());
			r.setStringNE(ItmDtlCols.$o_unit_nm, itmWgR.getStringNE("unit_nm"));
			r.setStringNE(ItmDtlCols.$o_cont_fctr_unit_nm, itmWgR.getStringNE("cont_fctr_unit_nm"));
			r.setStringNE(ItmDtlCols.$o_itm_typ_d_nm, itmR.getStringNE("base_itm_typ_d_nm"));
			r.setStringNE(ItmDtlCols.$o_maker_nm, _itmDtlCache.get(MAM_BP_R.class, r.maker_cd()).bp_nm());
			r.setStringNE(ItmDtlCols.$o_site_nm, _itmDtlCache.get(MAM_SITE_R.class, r.getStringNE(ItmDtlCols.$o_site_cd)).site_nm());
			r.setStringNE(ItmDtlCols.$o_loc_grp_nm, _itmDtlCache.get(MAM_LOC_GRP_R.class, r.getStringNE(ItmDtlCols.$o_loc_grp_cd)).loc_grp_nm());
			r.setStringNE(ItmDtlCols.$o_alloc_grp_nm, _itmDtlCache.get(MAM_ALLOC_GRP_R.class, r.getStringNE(ItmDtlCols.$o_alloc_grp_cd)).alloc_grp_nm());
			r.setStringNE(ItmDtlCols.$o_lg_grp_nm, _itmDtlCache.get(MAM_LG_GRP_R.class, r.getStringNE(ItmDtlCols.$o_lg_grp_cd)).lg_grp_nm());
			r.setStringNE(ItmDtlCols.$o_cur_nm, spplR.getStringNE("cur_nm"));
			r.setStringNE(ItmDtlCols.$o_cntry_nm, spplR.getStringNE("cntry_nm"));
			r.setStringNE(ItmDtlCols.$o_area_nm, spplR.getStringNE("area_nm"));

			if (spplFlg) {
				if (!r.getBooleanNE(_$asset_not_mng_flg) && isNull(spplR.bp_cd())) {
					rmL.add(r);
					continue;
				}
				// 取引先マスタから属性情報を補完
				r.setStringNE(ItmDtlCols.$o_sppl_nm, spplR.bp_nm());
				r.setBooleanNE(ItmDtlCols.$o_purc_upri_cng_flg, spplR.purc_upri_cng_flg() || itmWgR.purc_upri_cng_flg());
				r.setBooleanNE(ItmDtlCols.$o_prov_upri_cng_flg, spplR.prov_upri_cng_flg() || itmWgR.prov_upri_cng_flg());
				if (!isNull(spplR.cntry_cd()) && !isSame(row.getStringNE("o_own_cntry_cd"), spplR.cntry_cd())) {
					r.setBooleanNE(ItmDtlCols.$o_foreign_flg, true);
				}
				r.setNumberNE(ItmDtlCols.$o_pay_crryovr_times, nvl(itmWgR.pay_crryovr_times(), spplR.pay_crryovr_times()));
				r.setStringNE(ItmDtlCols.$o_cur_cd, spplR.cur_cd());
				r.setStringNE(ItmDtlCols.$o_cntry_cd, spplR.cntry_cd());
				r.setStringNE(ItmDtlCols.$o_area_cd, spplR.area_cd());
				r.setStringNE(ItmDtlCols.$o_prnt_lcl_cd, spplR.prnt_lcl_cd());
				r.setStringNE(ItmDtlCols.$o_asppl_cd, spplR.asppl_cd());
				r.setBooleanNE(ItmDtlCols.$o_subcon_flg, spplR.subcon_flg());
				r.setStringNE(ItmDtlCols.$o_po_print_cd, spplR.po_print_cd());
				r.setStringNE(ItmDtlCols.$o_sppl_ship_form_cd, spplR.sppl_ship_form_cd());
				r.setStringNE(ItmDtlCols.$o_purc_upri_req_typ, spplR.purc_upri_req_typ());
				r.setStringNE(ItmDtlCols.$o_purc_amt_rnd_typ, spplR.purc_amt_rnd_typ());
				r.setStringNE(ItmDtlCols.$o_purc_tax_rnd_typ, spplR.purc_tax_rnd_typ());
				r.setStringNE(ItmDtlCols.$o_purc_tax_calc_typ, spplR.purc_tax_calc_typ());
				r.setBooleanNE(ItmDtlCols.$o_wrk_po_flg, spplR.wrk_po_flg());
				r.setBooleanNE(ItmDtlCols.$o_wrk_ap_flg, spplR.wrk_ap_flg());
				r.setStringNE(ItmDtlCols.$o_prov_rcv_typ, spplR.prov_rcv_typ());
				r.setBooleanNE(ItmDtlCols.$o_onr_prsppl_flg, spplR.onr_prsppl_flg());
				r.setStringNE(ItmDtlCols.$o_prov_basis_typ, spplR.prov_basis_typ());
				r.setStringNE(ItmDtlCols.$o_prov_amt_rnd_typ, spplR.prov_amt_rnd_typ());
				r.setStringNE(ItmDtlCols.$o_prov_tax_rnd_typ, spplR.prov_tax_rnd_typ());
				r.setStringNE(ItmDtlCols.$o_prov_tax_calc_typ, spplR.prov_tax_calc_typ());
				r.setStringNE(ItmDtlCols.$o_sppl_cal_cd, spplR.sppl_cal_cd());
				r.setBooleanNE(ItmDtlCols.$o_sppl_iv_flg, spplR.sppl_iv_flg());
				r.setBooleanNE(ItmDtlCols.$o_prms_recv_flg, spplR.prms_recv_flg());
				r.setStringNE(ItmDtlCols.$o_sppl_tterm_cd1, spplR.sppl_tterm_cd1());
				r.setStringNE(ItmDtlCols.$o_sppl_tterm_cd2, spplR.sppl_tterm_cd2());
				r.setStringNE(ItmDtlCols.$o_sppl_tterm_cd3, spplR.sppl_tterm_cd3());
				
				// 品目詳細マスタの仕入計上区分がnullの場合は、取引先マスタから取得する。
				// 取引先マスタの仕入計上区分もnullの場合は、「仕入計上区分：任意」を設定する。
				if (isNull(r.getStringNE(ItmDtlCols.$o_purc_basis_typ)) && !isNull(spplR.bp_cd())) {
					r.setStringNE(ItmDtlCols.$o_purc_basis_typ, nvl(spplR.purc_basis_typ(), MAC_PURC_BASIS_TYP.ANY_BASIS.value()));
				}
				if(r.getBooleanNE("outsrc_flg")) {
					r.setBooleanNE(ItmDtlCols.$o_repurc_obli_flg, spplR.repurc_obli_flg());
					r.setStringNE(ItmDtlCols.$o_outsrc_upri_typ, spplR.outsrc_upri_typ());
				}
			}
			else {
				r.setBooleanNE(ItmDtlCols.$o_purc_upri_cng_flg, itmWgR.purc_upri_cng_flg());
				r.setBooleanNE(ItmDtlCols.$o_prov_upri_cng_flg, itmWgR.prov_upri_cng_flg());
				r.setNumberNE(ItmDtlCols.$o_pay_crryovr_times, itmWgR.pay_crryovr_times());
			}

			// 品目ＷＧマスタから属性情報を補完
			r.setStringNE(ItmDtlCols.$o_itm_nm, itmWgR.itm_nm());
			r.setStringNE(ItmDtlCols.$o_itm_alt_nm1, itmWgR.itm_alt_nm1());
			r.setStringNE(ItmDtlCols.$o_itm_alt_nm2, itmWgR.itm_alt_nm2());
			r.setStringNE(ItmDtlCols.$o_itm_alt_nm3, itmWgR.itm_alt_nm3());
			r.setStringNE(ItmDtlCols.$o_itm_alt_nm4, itmWgR.itm_alt_nm4());
			r.setStringNE(ItmDtlCols.$o_itm_typ, itmWgR.itm_typ());
			r.setStringNE(ItmDtlCols.$o_itm_typ_d_cd, itmWgR.itm_typ_d_cd());
			r.setStringNE(ItmDtlCols.$o_stk_mng_typ, itmWgR.stk_mng_typ());
			r.setStringNE(ItmDtlCols.$o_asset_mng_typ, itmWgR.asset_mng_typ());
			r.setBooleanNE(ItmDtlCols.$o_sundry_itm_flg, itmWgR.sundry_itm_flg());
			r.setBooleanNE(ItmDtlCols.$o_dscnt_itm_flg, itmWgR.dscnt_itm_flg());
			r.setStringNE(ItmDtlCols.$o_unit_cd, itmWgR.unit_cd());
			r.setNumberNE(ItmDtlCols.$o_dec_place, itmWgR.dec_place());
			r.setStringNE(ItmDtlCols.$o_rnd_typ, itmWgR.rnd_typ());
			r.setStringNE(ItmDtlCols.$o_dim_unit_cd, itmWgR.dim_unit_cd());
			r.setNumberNE(ItmDtlCols.$o_dim, itmWgR.dim());
			r.setStringNE(ItmDtlCols.$o_wt_unit_cd, itmWgR.wt_unit_cd());
			r.setNumberNE(ItmDtlCols.$o_wt, itmWgR.wt());
			r.setStringNE(ItmDtlCols.$o_conts_unit_cd, itmWgR.conts_unit_cd());
			r.setNumberNE(ItmDtlCols.$o_conts_qty, itmWgR.conts_qty());
			r.setStringNE(ItmDtlCols.$o_hs_cd, itmWgR.hs_cd());
			r.setStringNE(ItmDtlCols.$o_itm_jnl_cd, itmWgR.itm_jnl_cd());
			r.setStringNE(ItmDtlCols.$o_ac_itm_grp_cd, itmWgR.ac_itm_grp_cd());
			r.setBooleanNE(ItmDtlCols.$o_minus_stk_flg, itmWgR.minus_stk_flg());
			r.setBooleanNE(ItmDtlCols.$o_not_new_lot_flg, itmWgR.not_new_lot_flg());
			r.setBooleanNE(ItmDtlCols.$o_gi_alloc_flg, itmWgR.gi_alloc_flg());
			r.setStringNE(ItmDtlCols.$o_ship_unit_cd, itmWgR.ship_unit_cd());
			r.setStringNE(ItmDtlCols.$o_mfg_unit_cd, itmWgR.mfg_unit_cd());
			r.setStringNE(ItmDtlCols.$o_purc_unit_cd, itmWgR.purc_unit_cd());
			r.setStringNE(ItmDtlCols.$o_pckg_unit_cd, itmWgR.pckg_unit_cd());
			r.setBooleanNE(ItmDtlCols.$o_pack_alloc_flg, itmWgR.pack_alloc_flg());
			r.setStringNE(ItmDtlCols.$o_lot_mng_typ, itmWgR.lot_mng_typ());
			r.setStringNE(ItmDtlCols.$o_lot_no_typ, itmWgR.lot_no_typ());
			r.setStringNE(ItmDtlCols.$o_lot_no_ptn_cd, itmWgR.lot_no_ptn_cd());
			r.setStringNE(ItmDtlCols.$o_sublot_mng_typ, itmWgR.sublot_mng_typ());
			r.setStringNE(ItmDtlCols.$o_sublot_no_typ, itmWgR.sublot_no_typ());
			r.setStringNE(ItmDtlCols.$o_sublot_no_ptn_cd, itmWgR.sublot_no_ptn_cd());
			r.setBooleanNE(ItmDtlCols.$o_bp_lot_flg, itmWgR.bp_lot_flg());
			r.setStringNE(ItmDtlCols.$o_insp_bind_typ, itmWgR.insp_bind_typ());
			r.setBooleanNE(ItmDtlCols.$o_skip_chk_ship_flg, itmWgR.skip_chk_ship_flg());
			r.setBooleanNE(ItmDtlCols.$o_mrkt_judg_flg, itmWgR.mrkt_judg_flg());
			r.setStringNE(ItmDtlCols.$o_mrkt_judg_role_cd, itmWgR.mrkt_judg_role_cd());
			r.setBooleanNE(ItmDtlCols.$o_lmt_ctl_flg, itmWgR.lmt_ctl_flg());
			r.setStringNE(ItmDtlCols.$o_lmt_ctl_categ, itmWgR.lmt_ctl_categ());
			r.setBooleanNE(ItmDtlCols.$o_cont_fctr_flg, itmWgR.cont_fctr_flg());
			r.setNumberNE(ItmDtlCols.$o_std_cont_fctr, itmWgR.std_cont_fctr());
			r.setStringNE(ItmDtlCols.$o_cont_fctr_unit_cd, itmWgR.cont_fctr_unit_cd());
			r.setStringNE(ItmDtlCols.$o_cont_fctr_rnd_typ, itmWgR.cont_fctr_rnd_typ());
			r.setNumberNE(ItmDtlCols.$o_cont_fctr_dec_place, itmWgR.cont_fctr_dec_place());
			r.setStringNE(ItmDtlCols.$o_sno1_mng_typ, itmWgR.sno1_mng_typ());
			r.setBooleanNE(ItmDtlCols.$o_slo_sno1_flg, itmWgR.slo_sno1_flg());
			r.setBooleanNE(ItmDtlCols.$o_rqmt_sno1_flg, itmWgR.rqmt_sno1_flg());
			r.setStringNE(ItmDtlCols.$o_sno1_num_typ, itmWgR.sno1_num_typ());
			r.setStringNE(ItmDtlCols.$o_sno1_ptn_cd, itmWgR.sno1_ptn_cd());
			r.setStringNE(ItmDtlCols.$o_sno2_mng_typ, itmWgR.sno2_mng_typ());
			r.setBooleanNE(ItmDtlCols.$o_slo_sno2_flg, itmWgR.slo_sno2_flg());
			r.setBooleanNE(ItmDtlCols.$o_rqmt_sno2_flg, itmWgR.rqmt_sno2_flg());
			r.setStringNE(ItmDtlCols.$o_sno2_num_typ, itmWgR.sno2_num_typ());
			r.setStringNE(ItmDtlCols.$o_sno2_ptn_cd, itmWgR.sno2_ptn_cd());
			r.setStringNE(ItmDtlCols.$o_sno3_mng_typ, itmWgR.sno3_mng_typ());
			r.setBooleanNE(ItmDtlCols.$o_slo_sno3_flg, itmWgR.slo_sno3_flg());
			r.setBooleanNE(ItmDtlCols.$o_rqmt_sno3_flg, itmWgR.rqmt_sno3_flg());
			r.setStringNE(ItmDtlCols.$o_sno3_num_typ, itmWgR.sno3_num_typ());
			r.setStringNE(ItmDtlCols.$o_sno3_ptn_cd, itmWgR.sno3_ptn_cd());
			r.setStringNE(ItmDtlCols.$o_sno4_mng_typ, itmWgR.sno4_mng_typ());
			r.setBooleanNE(ItmDtlCols.$o_slo_sno4_flg, itmWgR.slo_sno4_flg());
			r.setBooleanNE(ItmDtlCols.$o_rqmt_sno4_flg, itmWgR.rqmt_sno4_flg());
			r.setStringNE(ItmDtlCols.$o_sno4_num_typ, itmWgR.sno4_num_typ());
			r.setStringNE(ItmDtlCols.$o_sno4_ptn_cd, itmWgR.sno4_ptn_cd());
			r.setStringNE(ItmDtlCols.$o_mfg_inst_unit_typ,
					r.getBooleanNE("outsrc_flg") ? MAC_MFG_INST_UNIT_TYP.ITM.value() : itmWgR.mfg_inst_unit_typ());
			r.setStringNE(ItmDtlCols.$o_mrp_proc_typ, itmWgR.mrp_proc_typ());
			r.setNumberNE(ItmDtlCols.$o_alloc_margin_days, itmWgR.alloc_margin_days());
			r.setNumberNE(ItmDtlCols.$o_mrp_alloc_margin_days, itmWgR.mrp_alloc_margin_days());
			r.setNumberNE(ItmDtlCols.$o_rqmt_rstr_qty, itmWgR.rqmt_rstr_qty());
			r.setBooleanNE(ItmDtlCols.$o_inpt_itm_add_flg, itmWgR.inpt_itm_add_flg());
			r.setBooleanNE(ItmDtlCols.$o_inpt_itm_del_flg, itmWgR.inpt_itm_del_flg());
			r.setBooleanNE(ItmDtlCols.$o_sch_flg, itmWgR.sch_flg());
			r.setStringNE(ItmDtlCols.$o_cntry_org_cd, itmWgR.cntry_org_cd());
			r.setStringNE(ItmDtlCols.$o_comp_spec_typ, itmWgR.comp_spec_typ());
			r.setBooleanNE(ItmDtlCols.$o_comp_rev_at_slo_flg, itmWgR.comp_rev_at_slo_flg());
			r.setBooleanNE(ItmDtlCols.$o_comp_core_itm_flg, itmWgR.comp_core_itm_flg());
			r.setStringNE(ItmDtlCols.$o_itm_spec_grp_cd, itmWgR.itm_spec_grp_cd());
			r.setBooleanNE(ItmDtlCols.$o_slo_proc_flg, itmWgR.slo_proc_flg());
			r.setStringNE(ItmDtlCols.$o_slo_proc_typ, itmWgR.slo_proc_typ());
			r.setStringNE(ItmDtlCols.$o_ship_inst_typ, itmWgR.ship_inst_typ());
			r.setBooleanNE(ItmDtlCols.$o_ship_lot_back_stop_flg, itmWgR.ship_lot_back_stop_flg());
			r.setStringNE(ItmDtlCols.$o_itm_ship_grp_cd, itmWgR.itm_ship_grp_cd());
			r.setStringNE(ItmDtlCols.$o_ship_valid_grp_cd, itmWgR.ship_valid_grp_cd());
			r.setBooleanNE(ItmDtlCols.$o_arr_skip_flg, itmWgR.arr_skip_flg());
			r.setBooleanNE(ItmDtlCols.$o_purc_dlv_slip_flg, itmWgR.purc_dlv_slip_flg());
			r.setStringNE(ItmDtlCols.$o_ship_term_cd, itmWgR.ship_term_cd());
			r.setStringNE(ItmDtlCols.$o_exim_xpns_typ, itmWgR.exim_xpns_typ());
			r.setBooleanNE(ItmDtlCols.$o_stk_lst_flg, itmWgR.stk_lst_flg());
			r.setBooleanNE(ItmDtlCols.$o_ver_flg, itmWgR.ver_flg());
			r.setBinaryNE(ItmDtlCols.$o_th_image, itmWgR.th_image());
			r.setNumberNE(ItmDtlCols.$o_mrp_opn_xfr_days, itmWgR.mrp_opn_xfr_days());
		}
		if (!rmL.isEmpty()) {
			result.removeAll(rmL);
		}
	}

	// -- ItmDtl:品目詳細（共通） (END)

	// -- ItmDtlPurcUpri:品目詳細（購買単価用） (START)

	@Override
	public MCList<MCRow> getItmDtlPurcUpri(MCRow row) {
		MCList<MAM_ITM_DTL_R> result = MCList.create(MAM_ITM_DTL_R.class);
		MAM_ITM_DTL_R t = MAM_ITM_DTL_R.create("T");
		MCQueryApiBuilder builder = MCQueryApiBuilder.create(t);
		setDelFlgCtl(false);	//CONTEXTを設定、削除FLG=ONを対象とする
		setReleaseFlgCtl(false);	//CONTEXTを設定、リリースFLG=OFFを対象とする
		getItmDtlPurcUpri_Set(row, builder, t, result);
		result = _itmDtlSelect.apply(row).apply(builder).apply(t).apply(result);
		MCList<? extends MCRow> down = getItmDtlPurcUpri_AfterSelect(row, builder, t, result);
		down = listlogicCommon_AfterSelect(row, result, down, "MA.MAUAL0010.ItmDtlPurcUpri");
		if (isNull(down)) return null;
		return getItmDtlPurcUpri_SubColumns(row, down);
	}

	@Override
	protected  void getItmDtlPurcUpri_Set(MCRow row, MCQueryApiBuilder builder, MAM_ITM_DTL_R t, MCList<?> result) {
		// out項目には存在するが、MAM_ITM_DTLに存在しない項目の追加
		result.addNumberColumn(ItmDtlPurcUpriCols.$o_wtax_rate);
		result.addNumberColumn(ItmDtlPurcUpriCols.$o_conts_qty);
		result.addNumberColumn(ItmDtlPurcUpriCols.$o_pay_crryovr_times);
		result.addNumberColumn(ItmDtlPurcUpriCols.$o_std_cont_fctr);
		result.addNumberColumn(ItmDtlPurcUpriCols.$o_cont_fctr_dec_place);
		result.addNumberColumn(ItmDtlPurcUpriCols.$o_dec_place);
		result.addNumberColumn(ItmDtlPurcUpriCols.$o_dim);
		result.addNumberColumn(ItmDtlPurcUpriCols.$o_wt);
		result.addNumberColumn(ItmDtlPurcUpriCols.$o_rqmt_rstr_qty);
		result.addNumberColumn(ItmDtlPurcUpriCols.$o_alloc_margin_days);
		result.addNumberColumn(ItmDtlPurcUpriCols.$o_mrp_alloc_margin_days);
		result.addNumberColumn(ItmDtlPurcUpriCols.$o_mrp_opn_xfr_days);
		result.addStringColumn(ItmDtlPurcUpriCols.$o_itm_alt_nm1);
		result.addStringColumn(ItmDtlPurcUpriCols.$o_itm_alt_nm2);
		result.addStringColumn(ItmDtlPurcUpriCols.$o_itm_alt_nm3);
		result.addStringColumn(ItmDtlPurcUpriCols.$o_itm_alt_nm4);
		result.addStringColumn(ItmDtlPurcUpriCols.$o_itm_typ);
		result.addStringColumn(ItmDtlPurcUpriCols.$o_itm_typ_d_cd);
		result.addStringColumn(ItmDtlPurcUpriCols.$o_itm_typ_d_nm);
		result.addStringColumn(ItmDtlPurcUpriCols.$o_stk_mng_typ);
		result.addStringColumn(ItmDtlPurcUpriCols.$o_asset_mng_typ);
		result.addStringColumn(ItmDtlPurcUpriCols.$o_purc_tax_cd);
		result.addStringColumn(ItmDtlPurcUpriCols.$o_prov_tax_cd);
		result.addStringColumn(ItmDtlPurcUpriCols.$o_zip_cd);
		result.addStringColumn(ItmDtlPurcUpriCols.$o_addr1);
		result.addStringColumn(ItmDtlPurcUpriCols.$o_addr2);
		result.addStringColumn(ItmDtlPurcUpriCols.$o_addr3);
		result.addStringColumn(ItmDtlPurcUpriCols.$o_addr4);
		result.addStringColumn(ItmDtlPurcUpriCols.$o_tel);
		result.addStringColumn(ItmDtlPurcUpriCols.$o_fax);
		result.addStringColumn(ItmDtlPurcUpriCols.$o_cur_cd);
		result.addStringColumn(ItmDtlPurcUpriCols.$o_cur_nm);
		result.addStringColumn(ItmDtlPurcUpriCols.$o_cntry_cd);
		result.addStringColumn(ItmDtlPurcUpriCols.$o_cntry_nm);
		result.addStringColumn(ItmDtlPurcUpriCols.$o_area_cd);
		result.addStringColumn(ItmDtlPurcUpriCols.$o_area_nm);
		result.addStringColumn(ItmDtlPurcUpriCols.$o_asst_dpt_cd);
		result.addStringColumn(ItmDtlPurcUpriCols.$o_sls_dpt_cd);
		result.addStringColumn(ItmDtlPurcUpriCols.$o_site_cd);
		result.addStringColumn(ItmDtlPurcUpriCols.$o_site_nm);
		result.addStringColumn(ItmDtlPurcUpriCols.$o_lg_grp_cd);
		result.addStringColumn(ItmDtlPurcUpriCols.$o_lg_grp_nm);
		result.addStringColumn(ItmDtlPurcUpriCols.$o_loc_grp_cd);
		result.addStringColumn(ItmDtlPurcUpriCols.$o_loc_grp_nm);
		result.addStringColumn(ItmDtlPurcUpriCols.$o_alloc_grp_cd);
		result.addStringColumn(ItmDtlPurcUpriCols.$o_alloc_grp_nm);
		result.addStringColumn(ItmDtlPurcUpriCols.$o_loc_cal_cd);
		result.addStringColumn(ItmDtlPurcUpriCols.$o_loc_mng_typ);
		result.addStringColumn(ItmDtlPurcUpriCols.$o_rsrc_cd1);
		result.addStringColumn(ItmDtlPurcUpriCols.$o_rsrc_cd2);
		result.addStringColumn(ItmDtlPurcUpriCols.$o_prnt_lcl_cd);
		result.addStringColumn(ItmDtlPurcUpriCols.$o_asppl_cd);
		result.addStringColumn(ItmDtlPurcUpriCols.$o_vmi_purc_dpt_cd);
		result.addStringColumn(ItmDtlPurcUpriCols.$o_mrkt_judg_role_cd);
		result.addStringColumn(ItmDtlPurcUpriCols.$o_po_print_cd);
		result.addStringColumn(ItmDtlPurcUpriCols.$o_sppl_ship_form_cd);
		result.addStringColumn(ItmDtlPurcUpriCols.$o_sppl_cntct_dpt);
		result.addStringColumn(ItmDtlPurcUpriCols.$o_sppl_cntct_psn);
		result.addStringColumn(ItmDtlPurcUpriCols.$o_sppl_cntct_psn_title);
		result.addStringColumn(ItmDtlPurcUpriCols.$o_purc_upri_req_typ);
		result.addStringColumn(ItmDtlPurcUpriCols.$o_purc_amt_rnd_typ);
		result.addStringColumn(ItmDtlPurcUpriCols.$o_purc_tax_rnd_typ);
		result.addStringColumn(ItmDtlPurcUpriCols.$o_purc_tax_calc_typ);
		result.addStringColumn(ItmDtlPurcUpriCols.$o_prov_rcv_typ);
		result.addStringColumn(ItmDtlPurcUpriCols.$o_prov_basis_typ);
		result.addStringColumn(ItmDtlPurcUpriCols.$o_prov_amt_rnd_typ);
		result.addStringColumn(ItmDtlPurcUpriCols.$o_prov_tax_rnd_typ);
		result.addStringColumn(ItmDtlPurcUpriCols.$o_prov_tax_calc_typ);
		result.addStringColumn(ItmDtlPurcUpriCols.$o_sppl_cal_cd);
		result.addStringColumn(ItmDtlPurcUpriCols.$o_sppl_tterm_cd1);
		result.addStringColumn(ItmDtlPurcUpriCols.$o_sppl_tterm_cd2);
		result.addStringColumn(ItmDtlPurcUpriCols.$o_sppl_tterm_cd3);
		result.addStringColumn(ItmDtlPurcUpriCols.$o_unit_cd);
		result.addStringColumn(ItmDtlPurcUpriCols.$o_unit_nm);
		result.addStringColumn(ItmDtlPurcUpriCols.$o_rnd_typ);
		result.addStringColumn(ItmDtlPurcUpriCols.$o_dim_unit_cd);
		result.addStringColumn(ItmDtlPurcUpriCols.$o_wt_unit_cd);
		result.addStringColumn(ItmDtlPurcUpriCols.$o_conts_unit_cd);
		result.addStringColumn(ItmDtlPurcUpriCols.$o_hs_cd);
		result.addStringColumn(ItmDtlPurcUpriCols.$o_itm_jnl_cd);
		result.addStringColumn(ItmDtlPurcUpriCols.$o_ac_itm_grp_cd);
		result.addStringColumn(ItmDtlPurcUpriCols.$o_ship_unit_cd);
		result.addStringColumn(ItmDtlPurcUpriCols.$o_mfg_unit_cd);
		result.addStringColumn(ItmDtlPurcUpriCols.$o_purc_unit_cd);
		result.addStringColumn(ItmDtlPurcUpriCols.$o_pckg_unit_cd);
		result.addStringColumn(ItmDtlPurcUpriCols.$o_lot_mng_typ);
		result.addStringColumn(ItmDtlPurcUpriCols.$o_lot_no_typ);
		result.addStringColumn(ItmDtlPurcUpriCols.$o_lot_no_ptn_cd);
		result.addStringColumn(ItmDtlPurcUpriCols.$o_sublot_mng_typ);
		result.addStringColumn(ItmDtlPurcUpriCols.$o_sublot_no_typ);
		result.addStringColumn(ItmDtlPurcUpriCols.$o_sublot_no_ptn_cd);
		result.addStringColumn(ItmDtlPurcUpriCols.$o_insp_bind_typ);
		result.addStringColumn(ItmDtlPurcUpriCols.$o_lmt_ctl_categ);
		result.addStringColumn(ItmDtlPurcUpriCols.$o_cont_fctr_unit_cd);
		result.addStringColumn(ItmDtlPurcUpriCols.$o_cont_fctr_rnd_typ);
		result.addStringColumn(ItmDtlPurcUpriCols.$o_sno1_mng_typ);
		result.addStringColumn(ItmDtlPurcUpriCols.$o_sno1_num_typ);
		result.addStringColumn(ItmDtlPurcUpriCols.$o_sno1_ptn_cd);
		result.addStringColumn(ItmDtlPurcUpriCols.$o_sno2_mng_typ);
		result.addStringColumn(ItmDtlPurcUpriCols.$o_sno2_num_typ);
		result.addStringColumn(ItmDtlPurcUpriCols.$o_sno2_ptn_cd);
		result.addStringColumn(ItmDtlPurcUpriCols.$o_sno3_mng_typ);
		result.addStringColumn(ItmDtlPurcUpriCols.$o_sno3_num_typ);
		result.addStringColumn(ItmDtlPurcUpriCols.$o_sno3_ptn_cd);
		result.addStringColumn(ItmDtlPurcUpriCols.$o_sno4_mng_typ);
		result.addStringColumn(ItmDtlPurcUpriCols.$o_sno4_num_typ);
		result.addStringColumn(ItmDtlPurcUpriCols.$o_sno4_ptn_cd);
		result.addStringColumn(ItmDtlPurcUpriCols.$o_mfg_inst_unit_typ);
		result.addStringColumn(ItmDtlPurcUpriCols.$o_mrp_proc_typ);
		result.addStringColumn(ItmDtlPurcUpriCols.$o_cntry_org_cd);
		result.addStringColumn(ItmDtlPurcUpriCols.$o_comp_spec_typ);
		result.addStringColumn(ItmDtlPurcUpriCols.$o_itm_spec_grp_cd);
		result.addStringColumn(ItmDtlPurcUpriCols.$o_slo_proc_typ);
		result.addStringColumn(ItmDtlPurcUpriCols.$o_ship_inst_typ);
		result.addStringColumn(ItmDtlPurcUpriCols.$o_itm_ship_grp_cd);
		result.addStringColumn(ItmDtlPurcUpriCols.$o_ship_valid_grp_cd);
		result.addStringColumn(ItmDtlPurcUpriCols.$o_ship_term_cd);
		result.addStringColumn(ItmDtlPurcUpriCols.$o_exim_xpns_typ);
		result.addBooleanColumn(ItmDtlPurcUpriCols.$o_sundry_itm_flg);
		result.addBooleanColumn(ItmDtlPurcUpriCols.$o_purc_upri_cng_flg);
		result.addBooleanColumn(ItmDtlPurcUpriCols.$o_prov_upri_cng_flg);
		result.addBooleanColumn(ItmDtlPurcUpriCols.$o_foreign_flg);
		result.addBooleanColumn(ItmDtlPurcUpriCols.$o_lg_def_flg);
		result.addBooleanColumn(ItmDtlPurcUpriCols.$o_pre_outsrc_act_flg);
		result.addBooleanColumn(ItmDtlPurcUpriCols.$o_ddlv_prov_insp_flg);
		result.addBooleanColumn(ItmDtlPurcUpriCols.$o_str_ln_tgt_flg);
		result.addBooleanColumn(ItmDtlPurcUpriCols.$o_alloc_lmt_flg);
		result.addBooleanColumn(ItmDtlPurcUpriCols.$o_gi_pack_xfer_flg);
		result.addBooleanColumn(ItmDtlPurcUpriCols.$o_gi_vmi_flg);
		result.addBooleanColumn(ItmDtlPurcUpriCols.$o_dscnt_itm_flg);
		result.addBooleanColumn(ItmDtlPurcUpriCols.$o_minus_stk_flg);
		result.addBooleanColumn(ItmDtlPurcUpriCols.$o_not_new_lot_flg);
		result.addBooleanColumn(ItmDtlPurcUpriCols.$o_gi_alloc_flg);
		result.addBooleanColumn(ItmDtlPurcUpriCols.$o_pack_alloc_flg);
		result.addBooleanColumn(ItmDtlPurcUpriCols.$o_bp_lot_flg);
		result.addBooleanColumn(ItmDtlPurcUpriCols.$o_skip_chk_ship_flg);
		result.addBooleanColumn(ItmDtlPurcUpriCols.$o_mrkt_judg_flg);
		result.addBooleanColumn(ItmDtlPurcUpriCols.$o_lmt_ctl_flg);
		result.addBooleanColumn(ItmDtlPurcUpriCols.$o_cont_fctr_flg);
		result.addBooleanColumn(ItmDtlPurcUpriCols.$o_slo_sno1_flg);
		result.addBooleanColumn(ItmDtlPurcUpriCols.$o_rqmt_sno1_flg);
		result.addBooleanColumn(ItmDtlPurcUpriCols.$o_slo_sno2_flg);
		result.addBooleanColumn(ItmDtlPurcUpriCols.$o_rqmt_sno2_flg);
		result.addBooleanColumn(ItmDtlPurcUpriCols.$o_slo_sno3_flg);
		result.addBooleanColumn(ItmDtlPurcUpriCols.$o_rqmt_sno3_flg);
		result.addBooleanColumn(ItmDtlPurcUpriCols.$o_slo_sno4_flg);
		result.addBooleanColumn(ItmDtlPurcUpriCols.$o_rqmt_sno4_flg);
		result.addBooleanColumn(ItmDtlPurcUpriCols.$o_inpt_itm_add_flg);
		result.addBooleanColumn(ItmDtlPurcUpriCols.$o_inpt_itm_del_flg);
		result.addBooleanColumn(ItmDtlPurcUpriCols.$o_sch_flg);
		result.addBooleanColumn(ItmDtlPurcUpriCols.$o_comp_rev_at_slo_flg);
		result.addBooleanColumn(ItmDtlPurcUpriCols.$o_comp_core_itm_flg);
		result.addBooleanColumn(ItmDtlPurcUpriCols.$o_slo_proc_flg);
		result.addBooleanColumn(ItmDtlPurcUpriCols.$o_ship_lot_back_stop_flg);
		result.addBooleanColumn(ItmDtlPurcUpriCols.$o_arr_skip_flg);
		result.addBooleanColumn(ItmDtlPurcUpriCols.$o_purc_dlv_slip_flg);
		result.addBooleanColumn(ItmDtlPurcUpriCols.$o_stk_lst_flg);
		result.addBooleanColumn(ItmDtlPurcUpriCols.$o_ver_flg);
		result.addBooleanColumn(ItmDtlPurcUpriCols.$o_subcon_flg);
		result.addBooleanColumn(ItmDtlPurcUpriCols.$o_wrk_po_flg);
		result.addBooleanColumn(ItmDtlPurcUpriCols.$o_wrk_ap_flg);
		result.addBooleanColumn(ItmDtlPurcUpriCols.$o_onr_prsppl_flg);
		result.addBooleanColumn(ItmDtlPurcUpriCols.$o_sppl_iv_flg);
		result.addBooleanColumn(ItmDtlPurcUpriCols.$o_prms_recv_flg);
		result.addBinaryColumn(ItmDtlPurcUpriCols.$o_th_image);
		result.addBooleanColumn(_$mfg_flg);
		result.addBooleanColumn(ItmDtlPurcUpriCols.$i_purc_flg);
		result.addBooleanColumn(_$outsrc_flg);
		result.addBooleanColumn(_$wg_xfr_flg);
		result.addBooleanColumn(_$asset_not_mng_flg);
		result.addBooleanColumn(ItmDtlPurcUpriCols.$o_repurc_obli_flg);
		result.addStringColumn(ItmDtlPurcUpriCols.$o_outsrc_upri_typ);

		// 購買ＦＬＧのみ、オンにする
		row.setBooleanNE(_$mfg_flg, false);
		row.setBooleanNE(ItmDtlPurcUpriCols.$i_purc_flg, true);
		row.setBooleanNE(_$outsrc_flg, false);
		row.setBooleanNE(_$wg_xfr_flg, false);

		// 直接入力時
		if (isInput(row)) {
			// 入力された値で絞り込む
			row.setStringNE("itm_cd", row.getStringNE($INPUT_VAL));
			return;
		}
		
		// 入力補助画面の検索条件
		row.setStringNE(ItmDtlPurcUpriCols.$i_wg_cd, getEditString(row, ItmDtlPurcUpriCols.$i_wg_cd));
		row.setStringNE(ItmDtlPurcUpriCols.$i_wg_nm, getEditString(row, ItmDtlPurcUpriCols.$i_wg_nm));
		row.setStringNE(ItmDtlPurcUpriCols.$i_itm_cd, getEditString(row, ItmDtlPurcUpriCols.$i_itm_cd));
		row.setStringNE(ItmDtlPurcUpriCols.$i_itm_sub1, getEditString(row, ItmDtlPurcUpriCols.$i_itm_sub1));
		row.setStringNE(ItmDtlPurcUpriCols.$i_itm_sub2, getEditString(row, ItmDtlPurcUpriCols.$i_itm_sub2));
		row.setStringNE(ItmDtlPurcUpriCols.$i_itm_sub3, getEditString(row, ItmDtlPurcUpriCols.$i_itm_sub3));
		row.setStringNE(ItmDtlPurcUpriCols.$i_itm_nm, getEditString(row, ItmDtlPurcUpriCols.$i_itm_nm));
		row.setStringNE(ItmDtlPurcUpriCols.$i_itm_alt_nm1, getEditString(row, ItmDtlPurcUpriCols.$i_itm_alt_nm1));
		row.setStringNE(ItmDtlPurcUpriCols.$i_itm_alt_nm2, getEditString(row, ItmDtlPurcUpriCols.$i_itm_alt_nm2));
		row.setStringNE(ItmDtlPurcUpriCols.$i_itm_alt_nm3, getEditString(row, ItmDtlPurcUpriCols.$i_itm_alt_nm3));
		row.setStringNE(ItmDtlPurcUpriCols.$i_itm_alt_nm4, getEditString(row, ItmDtlPurcUpriCols.$i_itm_alt_nm4));
		row.setStringNE(ItmDtlPurcUpriCols.$i_itm_typ, getEditString(row, ItmDtlPurcUpriCols.$i_itm_typ));
		row.setStringNE(ItmDtlPurcUpriCols.$i_itm_typ_d_cd, getEditString(row, ItmDtlPurcUpriCols.$i_itm_typ_d_cd));
		row.setStringNE(ItmDtlPurcUpriCols.$i_itm_typ_d_nm, getEditString(row, ItmDtlPurcUpriCols.$i_itm_typ_d_nm));
		row.setStringNE(ItmDtlPurcUpriCols.$i_stk_mng_typ, getEditString(row, ItmDtlPurcUpriCols.$i_stk_mng_typ));
		row.setStringNE(ItmDtlPurcUpriCols.$i_asset_mng_typ, getEditString(row, ItmDtlPurcUpriCols.$i_asset_mng_typ));
		row.setStringNE(ItmDtlPurcUpriCols.$i_site_cd, getEditString(row, ItmDtlPurcUpriCols.$i_site_cd));
		row.setStringNE(ItmDtlPurcUpriCols.$i_site_nm, getEditString(row, ItmDtlPurcUpriCols.$i_site_nm));
		row.setStringNE(ItmDtlPurcUpriCols.$i_lg_grp_cd, getEditString(row, ItmDtlPurcUpriCols.$i_lg_grp_cd));
		row.setStringNE(ItmDtlPurcUpriCols.$i_lg_grp_nm, getEditString(row, ItmDtlPurcUpriCols.$i_lg_grp_nm));
		row.setStringNE(ItmDtlPurcUpriCols.$i_alloc_grp_cd, getEditString(row, ItmDtlPurcUpriCols.$i_alloc_grp_cd));
		row.setStringNE(ItmDtlPurcUpriCols.$i_alloc_grp_nm, getEditString(row, ItmDtlPurcUpriCols.$i_alloc_grp_nm));
		row.setStringNE(ItmDtlPurcUpriCols.$i_loc_grp_cd, getEditString(row, ItmDtlPurcUpriCols.$i_loc_grp_cd));
		row.setStringNE(ItmDtlPurcUpriCols.$i_loc_grp_nm, getEditString(row, ItmDtlPurcUpriCols.$i_loc_grp_nm));
		row.setStringNE(ItmDtlPurcUpriCols.$i_loc_mng_typ, getEditString(row, ItmDtlPurcUpriCols.$i_loc_mng_typ));
		row.setStringNE(ItmDtlPurcUpriCols.$i_sppl_cd, getEditString(row, ItmDtlPurcUpriCols.$i_sppl_cd));
		row.setStringNE(ItmDtlPurcUpriCols.$i_sppl_nm, getEditString(row, ItmDtlPurcUpriCols.$i_sppl_nm));
		row.setStringNE(ItmDtlPurcUpriCols.$i_ein, getEditString(row, ItmDtlPurcUpriCols.$i_ein));
		row.setStringNE(ItmDtlPurcUpriCols.$i_sppl_alt_nm1, getEditString(row, ItmDtlPurcUpriCols.$i_sppl_alt_nm1));
		row.setStringNE(ItmDtlPurcUpriCols.$i_sppl_alt_nm2, getEditString(row, ItmDtlPurcUpriCols.$i_sppl_alt_nm2));
		row.setStringNE(ItmDtlPurcUpriCols.$i_sppl_alt_nm3, getEditString(row, ItmDtlPurcUpriCols.$i_sppl_alt_nm3));
		row.setStringNE(ItmDtlPurcUpriCols.$i_sppl_alt_nm4, getEditString(row, ItmDtlPurcUpriCols.$i_sppl_alt_nm4));
		row.setStringNE(ItmDtlPurcUpriCols.$i_cntry_cd, getEditString(row, ItmDtlPurcUpriCols.$i_cntry_cd));
		row.setStringNE(ItmDtlPurcUpriCols.$i_cntry_nm, getEditString(row, ItmDtlPurcUpriCols.$i_cntry_nm));
		row.setStringNE(ItmDtlPurcUpriCols.$i_area_cd, getEditString(row, ItmDtlPurcUpriCols.$i_area_cd));
		row.setStringNE(ItmDtlPurcUpriCols.$i_area_nm, getEditString(row, ItmDtlPurcUpriCols.$i_area_nm));
		row.setStringNE(ItmDtlPurcUpriCols.$i_itm_grp_cd1, getEditString(row, ItmDtlPurcUpriCols.$i_itm_grp_cd1));
		row.setStringNE(ItmDtlPurcUpriCols.$i_itm_grp_cd2, getEditString(row, ItmDtlPurcUpriCols.$i_itm_grp_cd2));
		row.setStringNE(ItmDtlPurcUpriCols.$i_itm_grp_cd3, getEditString(row, ItmDtlPurcUpriCols.$i_itm_grp_cd3));
		row.setStringNE(ItmDtlPurcUpriCols.$i_itm_grp_cd4, getEditString(row, ItmDtlPurcUpriCols.$i_itm_grp_cd4));
		row.setStringNE(ItmDtlPurcUpriCols.$i_itm_grp_cd5, getEditString(row, ItmDtlPurcUpriCols.$i_itm_grp_cd5));
		row.setStringNE(ItmDtlPurcUpriCols.$i_itm_grp_cd6, getEditString(row, ItmDtlPurcUpriCols.$i_itm_grp_cd6));
		row.setStringNE(ItmDtlPurcUpriCols.$i_itm_grp_cd7, getEditString(row, ItmDtlPurcUpriCols.$i_itm_grp_cd7));
		row.setStringNE(ItmDtlPurcUpriCols.$i_itm_grp_cd8, getEditString(row, ItmDtlPurcUpriCols.$i_itm_grp_cd8));
		row.setStringNE(ItmDtlPurcUpriCols.$i_itm_grp_cd9, getEditString(row, ItmDtlPurcUpriCols.$i_itm_grp_cd9));
		row.setStringNE(ItmDtlPurcUpriCols.$i_itm_grp_cd10, getEditString(row, ItmDtlPurcUpriCols.$i_itm_grp_cd10));
		row.setStringNE(ItmDtlPurcUpriCols.$i_itm_grp_nm1, getEditString(row, ItmDtlPurcUpriCols.$i_itm_grp_nm1));
		row.setStringNE(ItmDtlPurcUpriCols.$i_itm_grp_nm2, getEditString(row, ItmDtlPurcUpriCols.$i_itm_grp_nm2));
		row.setStringNE(ItmDtlPurcUpriCols.$i_itm_grp_nm3, getEditString(row, ItmDtlPurcUpriCols.$i_itm_grp_nm3));
		row.setStringNE(ItmDtlPurcUpriCols.$i_itm_grp_nm4, getEditString(row, ItmDtlPurcUpriCols.$i_itm_grp_nm4));
		row.setStringNE(ItmDtlPurcUpriCols.$i_itm_grp_nm5, getEditString(row, ItmDtlPurcUpriCols.$i_itm_grp_nm5));
		row.setStringNE(ItmDtlPurcUpriCols.$i_itm_grp_nm6, getEditString(row, ItmDtlPurcUpriCols.$i_itm_grp_nm6));
		row.setStringNE(ItmDtlPurcUpriCols.$i_itm_grp_nm7, getEditString(row, ItmDtlPurcUpriCols.$i_itm_grp_nm7));
		row.setStringNE(ItmDtlPurcUpriCols.$i_itm_grp_nm8, getEditString(row, ItmDtlPurcUpriCols.$i_itm_grp_nm8));
		row.setStringNE(ItmDtlPurcUpriCols.$i_itm_grp_nm9, getEditString(row, ItmDtlPurcUpriCols.$i_itm_grp_nm9));
		row.setStringNE(ItmDtlPurcUpriCols.$i_itm_grp_nm10, getEditString(row, ItmDtlPurcUpriCols.$i_itm_grp_nm10));
		row.setStringNE(ItmDtlPurcUpriCols.$i_sppl_grp_cd1, getEditString(row, ItmDtlPurcUpriCols.$i_sppl_grp_cd1));
		row.setStringNE(ItmDtlPurcUpriCols.$i_sppl_grp_cd2, getEditString(row, ItmDtlPurcUpriCols.$i_sppl_grp_cd2));
		row.setStringNE(ItmDtlPurcUpriCols.$i_sppl_grp_cd3, getEditString(row, ItmDtlPurcUpriCols.$i_sppl_grp_cd3));
		row.setStringNE(ItmDtlPurcUpriCols.$i_sppl_grp_cd4, getEditString(row, ItmDtlPurcUpriCols.$i_sppl_grp_cd4));
		row.setStringNE(ItmDtlPurcUpriCols.$i_sppl_grp_cd5, getEditString(row, ItmDtlPurcUpriCols.$i_sppl_grp_cd5));
		row.setStringNE(ItmDtlPurcUpriCols.$i_sppl_grp_cd6, getEditString(row, ItmDtlPurcUpriCols.$i_sppl_grp_cd6));
		row.setStringNE(ItmDtlPurcUpriCols.$i_sppl_grp_cd7, getEditString(row, ItmDtlPurcUpriCols.$i_sppl_grp_cd7));
		row.setStringNE(ItmDtlPurcUpriCols.$i_sppl_grp_cd8, getEditString(row, ItmDtlPurcUpriCols.$i_sppl_grp_cd8));
		row.setStringNE(ItmDtlPurcUpriCols.$i_sppl_grp_cd9, getEditString(row, ItmDtlPurcUpriCols.$i_sppl_grp_cd9));
		row.setStringNE(ItmDtlPurcUpriCols.$i_sppl_grp_cd10, getEditString(row, ItmDtlPurcUpriCols.$i_sppl_grp_cd10));
		row.setStringNE(ItmDtlPurcUpriCols.$i_sppl_grp_nm1, getEditString(row, ItmDtlPurcUpriCols.$i_sppl_grp_nm1));
		row.setStringNE(ItmDtlPurcUpriCols.$i_sppl_grp_nm2, getEditString(row, ItmDtlPurcUpriCols.$i_sppl_grp_nm2));
		row.setStringNE(ItmDtlPurcUpriCols.$i_sppl_grp_nm3, getEditString(row, ItmDtlPurcUpriCols.$i_sppl_grp_nm3));
		row.setStringNE(ItmDtlPurcUpriCols.$i_sppl_grp_nm4, getEditString(row, ItmDtlPurcUpriCols.$i_sppl_grp_nm4));
		row.setStringNE(ItmDtlPurcUpriCols.$i_sppl_grp_nm5, getEditString(row, ItmDtlPurcUpriCols.$i_sppl_grp_nm5));
		row.setStringNE(ItmDtlPurcUpriCols.$i_sppl_grp_nm6, getEditString(row, ItmDtlPurcUpriCols.$i_sppl_grp_nm6));
		row.setStringNE(ItmDtlPurcUpriCols.$i_sppl_grp_nm7, getEditString(row, ItmDtlPurcUpriCols.$i_sppl_grp_nm7));
		row.setStringNE(ItmDtlPurcUpriCols.$i_sppl_grp_nm8, getEditString(row, ItmDtlPurcUpriCols.$i_sppl_grp_nm8));
		row.setStringNE(ItmDtlPurcUpriCols.$i_sppl_grp_nm9, getEditString(row, ItmDtlPurcUpriCols.$i_sppl_grp_nm9));
		row.setStringNE(ItmDtlPurcUpriCols.$i_sppl_grp_nm10, getEditString(row, ItmDtlPurcUpriCols.$i_sppl_grp_nm10));
		row.setStringNE(ItmDtlPurcUpriCols.$i_memo1, getEditString(row, ItmDtlPurcUpriCols.$i_memo1));
		row.setStringNE(ItmDtlPurcUpriCols.$i_memo2, getEditString(row, ItmDtlPurcUpriCols.$i_memo2));
		row.setStringNE(ItmDtlPurcUpriCols.$i_memo3, getEditString(row, ItmDtlPurcUpriCols.$i_memo3));
		row.setStringNE("o_own_cntry_cd", MAUCL_AppSys.getCo().cntry_cd());
		if (row.getBooleanNE(ItmDtlPurcUpriCols.$i_foreign_flg)) {
			// getCo(MCRow)と競合するため、MAUCL_AppSysをつける
			row.setStringNE("own_cntry_cd", MAUCL_AppSys.getCo().cntry_cd());
		}
	}

	@Override
	protected  MCList<?> getItmDtlPurcUpri_AfterSelect(MCRow row, MCQueryApiBuilder builder, MAM_ITM_DTL_R t, MCList<?> result) {
		MCList<?> l = super.getItmDtlPurcUpri_AfterSelect(row, builder, t, result);
		if (isInput(row)) {
			l = getItmDtl_NoDupList(row, result, l, ItmDtlPurcUpriCols.$o_itm_cd,
					"MA.MAUAL0010.ItmDtlPurcUpri");
		}
		// 区分名の設定
		l.addStringColumn(MAC_ITM_TYP.$NAME);
		l.addStringColumn(MAC_STK_MNG_TYP.$NAME);
		l.addStringColumn(MAC_ASSET_MNG_TYP.$NAME);
		l.addStringColumn(MAC_LOC_MNG_TYP.$NAME);
		MAC_ITM_TYP.putNameNE(l, MAC_ITM_TYP.$VALUE, MAC_ITM_TYP.$NAME);
		MAC_STK_MNG_TYP.putNameNE(l, MAC_STK_MNG_TYP.$VALUE, MAC_STK_MNG_TYP.$NAME);
		MAC_ASSET_MNG_TYP.putNameNE(l, MAC_ASSET_MNG_TYP.$VALUE, MAC_ASSET_MNG_TYP.$NAME);
		MAC_LOC_MNG_TYP.putNameNE(l, MAC_LOC_MNG_TYP.$VALUE, MAC_LOC_MNG_TYP.$NAME);
		return l;
	}

	// -- ItmDtlPurcUpri:品目詳細（購買単価用） (END)

	// -- ItmDtlPurcUpriSub1:品目詳細（購買単価用）（枝番１） (START)

	@Override
	public MCList<MCRow> getItmDtlPurcUpriSub1(MCRow row) {
		if (isNull(row.getStringNE(ItmDtlPurcUpriSub1Cols.$i_itm_cd))) {
			return null;
		}
		setDelFlgCtl(false);	//CONTEXTを設定、削除FLG=ONを対象とする
		setReleaseFlgCtl(false);	//CONTEXTを設定、リリースFLG=OFFを対象とする
		MCList<MAM_ITM_DTL_R> result = MCList.create(MAM_ITM_DTL_R.class);
		MAM_ITM_DTL_R t = MAM_ITM_DTL_R.create("T");
		MCQueryApiBuilder builder = MCQueryApiBuilder.create(t);
		getItmDtlPurcUpriSub1_Set(row, builder, t, result);
		result = _itmDtlSelect.apply(row).apply(builder).apply(t).apply(result);
		MCList<? extends MCRow> down = getItmDtlPurcUpriSub1_AfterSelect(row, builder, t, result);
		down = listlogicCommon_AfterSelect(row, result, down, "MA.MAUAL0010.ItmDtlPurcUpriSub1");
		if (isNull(down)) return null;
		return getItmDtlPurcUpriSub1_SubColumns(row, down);
	}

	@Override
	protected  void getItmDtlPurcUpriSub1_Set(MCRow row, MCQueryApiBuilder builder, MAM_ITM_DTL_R t, MCList<?> result) {
		// out項目には存在するが、MAM_ITM_DTLに存在しない項目の追加
		result.addNumberColumn(ItmDtlPurcUpriSub1Cols.$o_wtax_rate);
		result.addNumberColumn(ItmDtlPurcUpriSub1Cols.$o_conts_qty);
		result.addNumberColumn(ItmDtlPurcUpriSub1Cols.$o_pay_crryovr_times);
		result.addNumberColumn(ItmDtlPurcUpriSub1Cols.$o_std_cont_fctr);
		result.addNumberColumn(ItmDtlPurcUpriSub1Cols.$o_cont_fctr_dec_place);
		result.addNumberColumn(ItmDtlPurcUpriSub1Cols.$o_dec_place);
		result.addNumberColumn(ItmDtlPurcUpriSub1Cols.$o_dim);
		result.addNumberColumn(ItmDtlPurcUpriSub1Cols.$o_wt);
		result.addNumberColumn(ItmDtlPurcUpriSub1Cols.$o_rqmt_rstr_qty);
		result.addNumberColumn(ItmDtlPurcUpriSub1Cols.$o_alloc_margin_days);
		result.addNumberColumn(ItmDtlPurcUpriSub1Cols.$o_mrp_alloc_margin_days);
		result.addNumberColumn(ItmDtlPurcUpriSub1Cols.$o_mrp_opn_xfr_days);
		result.addStringColumn(ItmDtlPurcUpriSub1Cols.$o_itm_alt_nm1);
		result.addStringColumn(ItmDtlPurcUpriSub1Cols.$o_itm_alt_nm2);
		result.addStringColumn(ItmDtlPurcUpriSub1Cols.$o_itm_alt_nm3);
		result.addStringColumn(ItmDtlPurcUpriSub1Cols.$o_itm_alt_nm4);
		result.addStringColumn(ItmDtlPurcUpriSub1Cols.$o_itm_typ);
		result.addStringColumn(ItmDtlPurcUpriSub1Cols.$o_itm_typ_d_cd);
		result.addStringColumn(ItmDtlPurcUpriSub1Cols.$o_itm_typ_d_nm);
		result.addStringColumn(ItmDtlPurcUpriSub1Cols.$o_stk_mng_typ);
		result.addStringColumn(ItmDtlPurcUpriSub1Cols.$o_asset_mng_typ);
		result.addStringColumn(ItmDtlPurcUpriSub1Cols.$o_purc_tax_cd);
		result.addStringColumn(ItmDtlPurcUpriSub1Cols.$o_prov_tax_cd);
		result.addStringColumn(ItmDtlPurcUpriSub1Cols.$o_zip_cd);
		result.addStringColumn(ItmDtlPurcUpriSub1Cols.$o_addr1);
		result.addStringColumn(ItmDtlPurcUpriSub1Cols.$o_addr2);
		result.addStringColumn(ItmDtlPurcUpriSub1Cols.$o_addr3);
		result.addStringColumn(ItmDtlPurcUpriSub1Cols.$o_addr4);
		result.addStringColumn(ItmDtlPurcUpriSub1Cols.$o_tel);
		result.addStringColumn(ItmDtlPurcUpriSub1Cols.$o_fax);
		result.addStringColumn(ItmDtlPurcUpriSub1Cols.$o_cur_cd);
		result.addStringColumn(ItmDtlPurcUpriSub1Cols.$o_cur_nm);
		result.addStringColumn(ItmDtlPurcUpriSub1Cols.$o_cntry_cd);
		result.addStringColumn(ItmDtlPurcUpriSub1Cols.$o_cntry_nm);
		result.addStringColumn(ItmDtlPurcUpriSub1Cols.$o_area_cd);
		result.addStringColumn(ItmDtlPurcUpriSub1Cols.$o_area_nm);
		result.addStringColumn(ItmDtlPurcUpriSub1Cols.$o_asst_dpt_cd);
		result.addStringColumn(ItmDtlPurcUpriSub1Cols.$o_sls_dpt_cd);
		result.addStringColumn(ItmDtlPurcUpriSub1Cols.$o_site_cd);
		result.addStringColumn(ItmDtlPurcUpriSub1Cols.$o_site_nm);
		result.addStringColumn(ItmDtlPurcUpriSub1Cols.$o_lg_grp_cd);
		result.addStringColumn(ItmDtlPurcUpriSub1Cols.$o_lg_grp_nm);
		result.addStringColumn(ItmDtlPurcUpriSub1Cols.$o_loc_grp_cd);
		result.addStringColumn(ItmDtlPurcUpriSub1Cols.$o_loc_grp_nm);
		result.addStringColumn(ItmDtlPurcUpriSub1Cols.$o_alloc_grp_cd);
		result.addStringColumn(ItmDtlPurcUpriSub1Cols.$o_alloc_grp_nm);
		result.addStringColumn(ItmDtlPurcUpriSub1Cols.$o_loc_cal_cd);
		result.addStringColumn(ItmDtlPurcUpriSub1Cols.$o_loc_mng_typ);
		result.addStringColumn(ItmDtlPurcUpriSub1Cols.$o_rsrc_cd1);
		result.addStringColumn(ItmDtlPurcUpriSub1Cols.$o_rsrc_cd2);
		result.addStringColumn(ItmDtlPurcUpriSub1Cols.$o_prnt_lcl_cd);
		result.addStringColumn(ItmDtlPurcUpriSub1Cols.$o_asppl_cd);
		result.addStringColumn(ItmDtlPurcUpriSub1Cols.$o_vmi_purc_dpt_cd);
		result.addStringColumn(ItmDtlPurcUpriSub1Cols.$o_mrkt_judg_role_cd);
		result.addStringColumn(ItmDtlPurcUpriSub1Cols.$o_po_print_cd);
		result.addStringColumn(ItmDtlPurcUpriSub1Cols.$o_sppl_ship_form_cd);
		result.addStringColumn(ItmDtlPurcUpriSub1Cols.$o_sppl_cntct_dpt);
		result.addStringColumn(ItmDtlPurcUpriSub1Cols.$o_sppl_cntct_psn);
		result.addStringColumn(ItmDtlPurcUpriSub1Cols.$o_sppl_cntct_psn_title);
		result.addStringColumn(ItmDtlPurcUpriSub1Cols.$o_purc_upri_req_typ);
		result.addStringColumn(ItmDtlPurcUpriSub1Cols.$o_purc_amt_rnd_typ);
		result.addStringColumn(ItmDtlPurcUpriSub1Cols.$o_purc_tax_rnd_typ);
		result.addStringColumn(ItmDtlPurcUpriSub1Cols.$o_purc_tax_calc_typ);
		result.addStringColumn(ItmDtlPurcUpriSub1Cols.$o_prov_rcv_typ);
		result.addStringColumn(ItmDtlPurcUpriSub1Cols.$o_prov_basis_typ);
		result.addStringColumn(ItmDtlPurcUpriSub1Cols.$o_prov_amt_rnd_typ);
		result.addStringColumn(ItmDtlPurcUpriSub1Cols.$o_prov_tax_rnd_typ);
		result.addStringColumn(ItmDtlPurcUpriSub1Cols.$o_prov_tax_calc_typ);
		result.addStringColumn(ItmDtlPurcUpriSub1Cols.$o_sppl_cal_cd);
		result.addStringColumn(ItmDtlPurcUpriSub1Cols.$o_sppl_tterm_cd1);
		result.addStringColumn(ItmDtlPurcUpriSub1Cols.$o_sppl_tterm_cd2);
		result.addStringColumn(ItmDtlPurcUpriSub1Cols.$o_sppl_tterm_cd3);
		result.addStringColumn(ItmDtlPurcUpriSub1Cols.$o_unit_cd);
		result.addStringColumn(ItmDtlPurcUpriSub1Cols.$o_unit_nm);
		result.addStringColumn(ItmDtlPurcUpriSub1Cols.$o_rnd_typ);
		result.addStringColumn(ItmDtlPurcUpriSub1Cols.$o_dim_unit_cd);
		result.addStringColumn(ItmDtlPurcUpriSub1Cols.$o_wt_unit_cd);
		result.addStringColumn(ItmDtlPurcUpriSub1Cols.$o_conts_unit_cd);
		result.addStringColumn(ItmDtlPurcUpriSub1Cols.$o_hs_cd);
		result.addStringColumn(ItmDtlPurcUpriSub1Cols.$o_itm_jnl_cd);
		result.addStringColumn(ItmDtlPurcUpriSub1Cols.$o_ac_itm_grp_cd);
		result.addStringColumn(ItmDtlPurcUpriSub1Cols.$o_ship_unit_cd);
		result.addStringColumn(ItmDtlPurcUpriSub1Cols.$o_mfg_unit_cd);
		result.addStringColumn(ItmDtlPurcUpriSub1Cols.$o_purc_unit_cd);
		result.addStringColumn(ItmDtlPurcUpriSub1Cols.$o_pckg_unit_cd);
		result.addStringColumn(ItmDtlPurcUpriSub1Cols.$o_lot_mng_typ);
		result.addStringColumn(ItmDtlPurcUpriSub1Cols.$o_lot_no_typ);
		result.addStringColumn(ItmDtlPurcUpriSub1Cols.$o_lot_no_ptn_cd);
		result.addStringColumn(ItmDtlPurcUpriSub1Cols.$o_sublot_mng_typ);
		result.addStringColumn(ItmDtlPurcUpriSub1Cols.$o_sublot_no_typ);
		result.addStringColumn(ItmDtlPurcUpriSub1Cols.$o_sublot_no_ptn_cd);
		result.addStringColumn(ItmDtlPurcUpriSub1Cols.$o_insp_bind_typ);
		result.addStringColumn(ItmDtlPurcUpriSub1Cols.$o_lmt_ctl_categ);
		result.addStringColumn(ItmDtlPurcUpriSub1Cols.$o_cont_fctr_unit_cd);
		result.addStringColumn(ItmDtlPurcUpriSub1Cols.$o_cont_fctr_rnd_typ);
		result.addStringColumn(ItmDtlPurcUpriSub1Cols.$o_sno1_mng_typ);
		result.addStringColumn(ItmDtlPurcUpriSub1Cols.$o_sno1_num_typ);
		result.addStringColumn(ItmDtlPurcUpriSub1Cols.$o_sno1_ptn_cd);
		result.addStringColumn(ItmDtlPurcUpriSub1Cols.$o_sno2_mng_typ);
		result.addStringColumn(ItmDtlPurcUpriSub1Cols.$o_sno2_num_typ);
		result.addStringColumn(ItmDtlPurcUpriSub1Cols.$o_sno2_ptn_cd);
		result.addStringColumn(ItmDtlPurcUpriSub1Cols.$o_sno3_mng_typ);
		result.addStringColumn(ItmDtlPurcUpriSub1Cols.$o_sno3_num_typ);
		result.addStringColumn(ItmDtlPurcUpriSub1Cols.$o_sno3_ptn_cd);
		result.addStringColumn(ItmDtlPurcUpriSub1Cols.$o_sno4_mng_typ);
		result.addStringColumn(ItmDtlPurcUpriSub1Cols.$o_sno4_num_typ);
		result.addStringColumn(ItmDtlPurcUpriSub1Cols.$o_sno4_ptn_cd);
		result.addStringColumn(ItmDtlPurcUpriSub1Cols.$o_mfg_inst_unit_typ);
		result.addStringColumn(ItmDtlPurcUpriSub1Cols.$o_mrp_proc_typ);
		result.addStringColumn(ItmDtlPurcUpriSub1Cols.$o_cntry_org_cd);
		result.addStringColumn(ItmDtlPurcUpriSub1Cols.$o_comp_spec_typ);
		result.addStringColumn(ItmDtlPurcUpriSub1Cols.$o_itm_spec_grp_cd);
		result.addStringColumn(ItmDtlPurcUpriSub1Cols.$o_slo_proc_typ);
		result.addStringColumn(ItmDtlPurcUpriSub1Cols.$o_ship_inst_typ);
		result.addStringColumn(ItmDtlPurcUpriSub1Cols.$o_itm_ship_grp_cd);
		result.addStringColumn(ItmDtlPurcUpriSub1Cols.$o_ship_valid_grp_cd);
		result.addStringColumn(ItmDtlPurcUpriSub1Cols.$o_ship_term_cd);
		result.addStringColumn(ItmDtlPurcUpriSub1Cols.$o_exim_xpns_typ);
		result.addBooleanColumn(ItmDtlPurcUpriSub1Cols.$o_sundry_itm_flg);
		result.addBooleanColumn(ItmDtlPurcUpriSub1Cols.$o_purc_upri_cng_flg);
		result.addBooleanColumn(ItmDtlPurcUpriSub1Cols.$o_prov_upri_cng_flg);
		result.addBooleanColumn(ItmDtlPurcUpriSub1Cols.$o_foreign_flg);
		result.addBooleanColumn(ItmDtlPurcUpriSub1Cols.$o_lg_def_flg);
		result.addBooleanColumn(ItmDtlPurcUpriSub1Cols.$o_pre_outsrc_act_flg);
		result.addBooleanColumn(ItmDtlPurcUpriSub1Cols.$o_ddlv_prov_insp_flg);
		result.addBooleanColumn(ItmDtlPurcUpriSub1Cols.$o_str_ln_tgt_flg);
		result.addBooleanColumn(ItmDtlPurcUpriSub1Cols.$o_alloc_lmt_flg);
		result.addBooleanColumn(ItmDtlPurcUpriSub1Cols.$o_gi_pack_xfer_flg);
		result.addBooleanColumn(ItmDtlPurcUpriSub1Cols.$o_gi_vmi_flg);
		result.addBooleanColumn(ItmDtlPurcUpriSub1Cols.$o_dscnt_itm_flg);
		result.addBooleanColumn(ItmDtlPurcUpriSub1Cols.$o_minus_stk_flg);
		result.addBooleanColumn(ItmDtlPurcUpriSub1Cols.$o_not_new_lot_flg);
		result.addBooleanColumn(ItmDtlPurcUpriSub1Cols.$o_gi_alloc_flg);
		result.addBooleanColumn(ItmDtlPurcUpriSub1Cols.$o_pack_alloc_flg);
		result.addBooleanColumn(ItmDtlPurcUpriSub1Cols.$o_bp_lot_flg);
		result.addBooleanColumn(ItmDtlPurcUpriSub1Cols.$o_skip_chk_ship_flg);
		result.addBooleanColumn(ItmDtlPurcUpriSub1Cols.$o_mrkt_judg_flg);
		result.addBooleanColumn(ItmDtlPurcUpriSub1Cols.$o_lmt_ctl_flg);
		result.addBooleanColumn(ItmDtlPurcUpriSub1Cols.$o_cont_fctr_flg);
		result.addBooleanColumn(ItmDtlPurcUpriSub1Cols.$o_slo_sno1_flg);
		result.addBooleanColumn(ItmDtlPurcUpriSub1Cols.$o_rqmt_sno1_flg);
		result.addBooleanColumn(ItmDtlPurcUpriSub1Cols.$o_slo_sno2_flg);
		result.addBooleanColumn(ItmDtlPurcUpriSub1Cols.$o_rqmt_sno2_flg);
		result.addBooleanColumn(ItmDtlPurcUpriSub1Cols.$o_slo_sno3_flg);
		result.addBooleanColumn(ItmDtlPurcUpriSub1Cols.$o_rqmt_sno3_flg);
		result.addBooleanColumn(ItmDtlPurcUpriSub1Cols.$o_slo_sno4_flg);
		result.addBooleanColumn(ItmDtlPurcUpriSub1Cols.$o_rqmt_sno4_flg);
		result.addBooleanColumn(ItmDtlPurcUpriSub1Cols.$o_inpt_itm_add_flg);
		result.addBooleanColumn(ItmDtlPurcUpriSub1Cols.$o_inpt_itm_del_flg);
		result.addBooleanColumn(ItmDtlPurcUpriSub1Cols.$o_sch_flg);
		result.addBooleanColumn(ItmDtlPurcUpriSub1Cols.$o_comp_rev_at_slo_flg);
		result.addBooleanColumn(ItmDtlPurcUpriSub1Cols.$o_comp_core_itm_flg);
		result.addBooleanColumn(ItmDtlPurcUpriSub1Cols.$o_slo_proc_flg);
		result.addBooleanColumn(ItmDtlPurcUpriSub1Cols.$o_ship_lot_back_stop_flg);
		result.addBooleanColumn(ItmDtlPurcUpriSub1Cols.$o_arr_skip_flg);
		result.addBooleanColumn(ItmDtlPurcUpriSub1Cols.$o_purc_dlv_slip_flg);
		result.addBooleanColumn(ItmDtlPurcUpriSub1Cols.$o_stk_lst_flg);
		result.addBooleanColumn(ItmDtlPurcUpriSub1Cols.$o_ver_flg);
		result.addBooleanColumn(ItmDtlPurcUpriSub1Cols.$o_subcon_flg);
		result.addBooleanColumn(ItmDtlPurcUpriSub1Cols.$o_wrk_po_flg);
		result.addBooleanColumn(ItmDtlPurcUpriSub1Cols.$o_wrk_ap_flg);
		result.addBooleanColumn(ItmDtlPurcUpriSub1Cols.$o_onr_prsppl_flg);
		result.addBooleanColumn(ItmDtlPurcUpriSub1Cols.$o_sppl_iv_flg);
		result.addBooleanColumn(ItmDtlPurcUpriSub1Cols.$o_prms_recv_flg);
		result.addBinaryColumn(ItmDtlPurcUpriSub1Cols.$o_th_image);
		result.addBooleanColumn(_$mfg_flg);
		result.addBooleanColumn(ItmDtlPurcUpriSub1Cols.$i_purc_flg);
		result.addBooleanColumn(_$outsrc_flg);
		result.addBooleanColumn(_$wg_xfr_flg);
		result.addBooleanColumn(_$asset_not_mng_flg);
		result.addBooleanColumn(ItmDtlPurcUpriSub1Cols.$o_repurc_obli_flg);
		result.addStringColumn(ItmDtlPurcUpriSub1Cols.$o_outsrc_upri_typ);

		// 購買ＦＬＧのみ、オンにする
		row.setBooleanNE(_$mfg_flg, false);
		row.setBooleanNE(ItmDtlPurcUpriSub1Cols.$i_purc_flg, true);
		row.setBooleanNE(_$outsrc_flg, false);
		row.setBooleanNE(_$wg_xfr_flg, false);

		// 直接入力時
		if (isInput(row)) {
			// 入力された値で絞り込む
			row.setStringNE("itm_sub1", row.getStringNE($INPUT_VAL));
			return;
		}
	}

	@Override
	protected  MCList<?> getItmDtlPurcUpriSub1_AfterSelect(MCRow row, MCQueryApiBuilder builder, MAM_ITM_DTL_R t, MCList<?> result) {
		MCList<?> l = super.getItmDtlPurcUpriSub1_AfterSelect(row, builder, t, result);
		if (isInput(row) || isCombo(row)) {
			l = getItmDtl_NoDupList(row, result, l, ItmDtlCols.$o_itm_sub1, "MA.MAUAL0010.ItmDtlPurcUpriSub1");
		}
		// 区分名の設定
		l.addStringColumn(MAC_ITM_TYP.$NAME);
		l.addStringColumn(MAC_STK_MNG_TYP.$NAME);
		l.addStringColumn(MAC_ASSET_MNG_TYP.$NAME);
		l.addStringColumn(MAC_LOC_MNG_TYP.$NAME);
		MAC_ITM_TYP.putNameNE(l, MAC_ITM_TYP.$VALUE, MAC_ITM_TYP.$NAME);
		MAC_STK_MNG_TYP.putNameNE(l, MAC_STK_MNG_TYP.$VALUE, MAC_STK_MNG_TYP.$NAME);
		MAC_ASSET_MNG_TYP.putNameNE(l, MAC_ASSET_MNG_TYP.$VALUE, MAC_ASSET_MNG_TYP.$NAME);
		MAC_LOC_MNG_TYP.putNameNE(l, MAC_LOC_MNG_TYP.$VALUE, MAC_LOC_MNG_TYP.$NAME);
		return l;
	}

	// -- ItmDtlPurcUpriSub1:品目詳細（購買単価用）（枝番１） (END)

	// -- ItmDtlPurcUpriSub2:品目詳細（購買単価用）（枝番２） (START)

	@Override
	public MCList<MCRow> getItmDtlPurcUpriSub2(MCRow row) {
		if (isNull(row.getStringNE(ItmDtlPurcUpriSub2Cols.$i_itm_cd))
				|| isNull(row.getStringNE(ItmDtlPurcUpriSub2Cols.$i_itm_sub1))) {
			return null;
		}
		setDelFlgCtl(false);	//CONTEXTを設定、削除FLG=ONを対象とする
		setReleaseFlgCtl(false);	//CONTEXTを設定、リリースFLG=OFFを対象とする
		MCList<MAM_ITM_DTL_R> result = MCList.create(MAM_ITM_DTL_R.class);
		MAM_ITM_DTL_R t = MAM_ITM_DTL_R.create("T");
		MCQueryApiBuilder builder = MCQueryApiBuilder.create(t);
		getItmDtlPurcUpriSub2_Set(row, builder, t, result);
		result = _itmDtlSelect.apply(row).apply(builder).apply(t).apply(result);
		MCList<? extends MCRow> down = getItmDtlPurcUpriSub2_AfterSelect(row, builder, t, result);
		down = listlogicCommon_AfterSelect(row, result, down, "MA.MAUAL0010.ItmDtlPurcUpriSub2");
		if (isNull(down)) return null;
		return getItmDtlPurcUpriSub2_SubColumns(row, down);
	}

	@Override
	protected  void getItmDtlPurcUpriSub2_Set(MCRow row, MCQueryApiBuilder builder, MAM_ITM_DTL_R t, MCList<?> result) {
		// out項目には存在するが、MAM_ITM_DTLに存在しない項目の追加
		result.addNumberColumn(ItmDtlPurcUpriSub2Cols.$o_wtax_rate);
		result.addNumberColumn(ItmDtlPurcUpriSub2Cols.$o_conts_qty);
		result.addNumberColumn(ItmDtlPurcUpriSub2Cols.$o_pay_crryovr_times);
		result.addNumberColumn(ItmDtlPurcUpriSub2Cols.$o_std_cont_fctr);
		result.addNumberColumn(ItmDtlPurcUpriSub2Cols.$o_cont_fctr_dec_place);
		result.addNumberColumn(ItmDtlPurcUpriSub2Cols.$o_dec_place);
		result.addNumberColumn(ItmDtlPurcUpriSub2Cols.$o_dim);
		result.addNumberColumn(ItmDtlPurcUpriSub2Cols.$o_wt);
		result.addNumberColumn(ItmDtlPurcUpriSub2Cols.$o_rqmt_rstr_qty);
		result.addNumberColumn(ItmDtlPurcUpriSub2Cols.$o_alloc_margin_days);
		result.addNumberColumn(ItmDtlPurcUpriSub2Cols.$o_mrp_alloc_margin_days);
		result.addNumberColumn(ItmDtlPurcUpriSub2Cols.$o_mrp_opn_xfr_days);
		result.addStringColumn(ItmDtlPurcUpriSub2Cols.$o_itm_alt_nm1);
		result.addStringColumn(ItmDtlPurcUpriSub2Cols.$o_itm_alt_nm2);
		result.addStringColumn(ItmDtlPurcUpriSub2Cols.$o_itm_alt_nm3);
		result.addStringColumn(ItmDtlPurcUpriSub2Cols.$o_itm_alt_nm4);
		result.addStringColumn(ItmDtlPurcUpriSub2Cols.$o_itm_typ);
		result.addStringColumn(ItmDtlPurcUpriSub2Cols.$o_itm_typ_d_cd);
		result.addStringColumn(ItmDtlPurcUpriSub2Cols.$o_itm_typ_d_nm);
		result.addStringColumn(ItmDtlPurcUpriSub2Cols.$o_stk_mng_typ);
		result.addStringColumn(ItmDtlPurcUpriSub2Cols.$o_asset_mng_typ);
		result.addStringColumn(ItmDtlPurcUpriSub2Cols.$o_purc_tax_cd);
		result.addStringColumn(ItmDtlPurcUpriSub2Cols.$o_prov_tax_cd);
		result.addStringColumn(ItmDtlPurcUpriSub2Cols.$o_zip_cd);
		result.addStringColumn(ItmDtlPurcUpriSub2Cols.$o_addr1);
		result.addStringColumn(ItmDtlPurcUpriSub2Cols.$o_addr2);
		result.addStringColumn(ItmDtlPurcUpriSub2Cols.$o_addr3);
		result.addStringColumn(ItmDtlPurcUpriSub2Cols.$o_addr4);
		result.addStringColumn(ItmDtlPurcUpriSub2Cols.$o_tel);
		result.addStringColumn(ItmDtlPurcUpriSub2Cols.$o_fax);
		result.addStringColumn(ItmDtlPurcUpriSub2Cols.$o_cur_cd);
		result.addStringColumn(ItmDtlPurcUpriSub2Cols.$o_cur_nm);
		result.addStringColumn(ItmDtlPurcUpriSub2Cols.$o_cntry_cd);
		result.addStringColumn(ItmDtlPurcUpriSub2Cols.$o_cntry_nm);
		result.addStringColumn(ItmDtlPurcUpriSub2Cols.$o_area_cd);
		result.addStringColumn(ItmDtlPurcUpriSub2Cols.$o_area_nm);
		result.addStringColumn(ItmDtlPurcUpriSub2Cols.$o_asst_dpt_cd);
		result.addStringColumn(ItmDtlPurcUpriSub2Cols.$o_sls_dpt_cd);
		result.addStringColumn(ItmDtlPurcUpriSub2Cols.$o_site_cd);
		result.addStringColumn(ItmDtlPurcUpriSub2Cols.$o_site_nm);
		result.addStringColumn(ItmDtlPurcUpriSub2Cols.$o_lg_grp_cd);
		result.addStringColumn(ItmDtlPurcUpriSub2Cols.$o_lg_grp_nm);
		result.addStringColumn(ItmDtlPurcUpriSub2Cols.$o_loc_grp_cd);
		result.addStringColumn(ItmDtlPurcUpriSub2Cols.$o_loc_grp_nm);
		result.addStringColumn(ItmDtlPurcUpriSub2Cols.$o_alloc_grp_cd);
		result.addStringColumn(ItmDtlPurcUpriSub2Cols.$o_alloc_grp_nm);
		result.addStringColumn(ItmDtlPurcUpriSub2Cols.$o_loc_cal_cd);
		result.addStringColumn(ItmDtlPurcUpriSub2Cols.$o_loc_mng_typ);
		result.addStringColumn(ItmDtlPurcUpriSub2Cols.$o_rsrc_cd1);
		result.addStringColumn(ItmDtlPurcUpriSub2Cols.$o_rsrc_cd2);
		result.addStringColumn(ItmDtlPurcUpriSub2Cols.$o_prnt_lcl_cd);
		result.addStringColumn(ItmDtlPurcUpriSub2Cols.$o_asppl_cd);
		result.addStringColumn(ItmDtlPurcUpriSub2Cols.$o_vmi_purc_dpt_cd);
		result.addStringColumn(ItmDtlPurcUpriSub2Cols.$o_mrkt_judg_role_cd);
		result.addStringColumn(ItmDtlPurcUpriSub2Cols.$o_po_print_cd);
		result.addStringColumn(ItmDtlPurcUpriSub2Cols.$o_sppl_ship_form_cd);
		result.addStringColumn(ItmDtlPurcUpriSub2Cols.$o_sppl_cntct_dpt);
		result.addStringColumn(ItmDtlPurcUpriSub2Cols.$o_sppl_cntct_psn);
		result.addStringColumn(ItmDtlPurcUpriSub2Cols.$o_sppl_cntct_psn_title);
		result.addStringColumn(ItmDtlPurcUpriSub2Cols.$o_purc_upri_req_typ);
		result.addStringColumn(ItmDtlPurcUpriSub2Cols.$o_purc_amt_rnd_typ);
		result.addStringColumn(ItmDtlPurcUpriSub2Cols.$o_purc_tax_rnd_typ);
		result.addStringColumn(ItmDtlPurcUpriSub2Cols.$o_purc_tax_calc_typ);
		result.addStringColumn(ItmDtlPurcUpriSub2Cols.$o_prov_rcv_typ);
		result.addStringColumn(ItmDtlPurcUpriSub2Cols.$o_prov_basis_typ);
		result.addStringColumn(ItmDtlPurcUpriSub2Cols.$o_prov_amt_rnd_typ);
		result.addStringColumn(ItmDtlPurcUpriSub2Cols.$o_prov_tax_rnd_typ);
		result.addStringColumn(ItmDtlPurcUpriSub2Cols.$o_prov_tax_calc_typ);
		result.addStringColumn(ItmDtlPurcUpriSub2Cols.$o_sppl_cal_cd);
		result.addStringColumn(ItmDtlPurcUpriSub2Cols.$o_sppl_tterm_cd1);
		result.addStringColumn(ItmDtlPurcUpriSub2Cols.$o_sppl_tterm_cd2);
		result.addStringColumn(ItmDtlPurcUpriSub2Cols.$o_sppl_tterm_cd3);
		result.addStringColumn(ItmDtlPurcUpriSub2Cols.$o_unit_cd);
		result.addStringColumn(ItmDtlPurcUpriSub2Cols.$o_unit_nm);
		result.addStringColumn(ItmDtlPurcUpriSub2Cols.$o_rnd_typ);
		result.addStringColumn(ItmDtlPurcUpriSub2Cols.$o_dim_unit_cd);
		result.addStringColumn(ItmDtlPurcUpriSub2Cols.$o_wt_unit_cd);
		result.addStringColumn(ItmDtlPurcUpriSub2Cols.$o_conts_unit_cd);
		result.addStringColumn(ItmDtlPurcUpriSub2Cols.$o_hs_cd);
		result.addStringColumn(ItmDtlPurcUpriSub2Cols.$o_itm_jnl_cd);
		result.addStringColumn(ItmDtlPurcUpriSub2Cols.$o_ac_itm_grp_cd);
		result.addStringColumn(ItmDtlPurcUpriSub2Cols.$o_ship_unit_cd);
		result.addStringColumn(ItmDtlPurcUpriSub2Cols.$o_mfg_unit_cd);
		result.addStringColumn(ItmDtlPurcUpriSub2Cols.$o_purc_unit_cd);
		result.addStringColumn(ItmDtlPurcUpriSub2Cols.$o_pckg_unit_cd);
		result.addStringColumn(ItmDtlPurcUpriSub2Cols.$o_lot_mng_typ);
		result.addStringColumn(ItmDtlPurcUpriSub2Cols.$o_lot_no_typ);
		result.addStringColumn(ItmDtlPurcUpriSub2Cols.$o_lot_no_ptn_cd);
		result.addStringColumn(ItmDtlPurcUpriSub2Cols.$o_sublot_mng_typ);
		result.addStringColumn(ItmDtlPurcUpriSub2Cols.$o_sublot_no_typ);
		result.addStringColumn(ItmDtlPurcUpriSub2Cols.$o_sublot_no_ptn_cd);
		result.addStringColumn(ItmDtlPurcUpriSub2Cols.$o_insp_bind_typ);
		result.addStringColumn(ItmDtlPurcUpriSub2Cols.$o_lmt_ctl_categ);
		result.addStringColumn(ItmDtlPurcUpriSub2Cols.$o_cont_fctr_unit_cd);
		result.addStringColumn(ItmDtlPurcUpriSub2Cols.$o_cont_fctr_rnd_typ);
		result.addStringColumn(ItmDtlPurcUpriSub2Cols.$o_sno1_mng_typ);
		result.addStringColumn(ItmDtlPurcUpriSub2Cols.$o_sno1_num_typ);
		result.addStringColumn(ItmDtlPurcUpriSub2Cols.$o_sno1_ptn_cd);
		result.addStringColumn(ItmDtlPurcUpriSub2Cols.$o_sno2_mng_typ);
		result.addStringColumn(ItmDtlPurcUpriSub2Cols.$o_sno2_num_typ);
		result.addStringColumn(ItmDtlPurcUpriSub2Cols.$o_sno2_ptn_cd);
		result.addStringColumn(ItmDtlPurcUpriSub2Cols.$o_sno3_mng_typ);
		result.addStringColumn(ItmDtlPurcUpriSub2Cols.$o_sno3_num_typ);
		result.addStringColumn(ItmDtlPurcUpriSub2Cols.$o_sno3_ptn_cd);
		result.addStringColumn(ItmDtlPurcUpriSub2Cols.$o_sno4_mng_typ);
		result.addStringColumn(ItmDtlPurcUpriSub2Cols.$o_sno4_num_typ);
		result.addStringColumn(ItmDtlPurcUpriSub2Cols.$o_sno4_ptn_cd);
		result.addStringColumn(ItmDtlPurcUpriSub2Cols.$o_mfg_inst_unit_typ);
		result.addStringColumn(ItmDtlPurcUpriSub2Cols.$o_mrp_proc_typ);
		result.addStringColumn(ItmDtlPurcUpriSub2Cols.$o_cntry_org_cd);
		result.addStringColumn(ItmDtlPurcUpriSub2Cols.$o_comp_spec_typ);
		result.addStringColumn(ItmDtlPurcUpriSub2Cols.$o_itm_spec_grp_cd);
		result.addStringColumn(ItmDtlPurcUpriSub2Cols.$o_slo_proc_typ);
		result.addStringColumn(ItmDtlPurcUpriSub2Cols.$o_ship_inst_typ);
		result.addStringColumn(ItmDtlPurcUpriSub2Cols.$o_itm_ship_grp_cd);
		result.addStringColumn(ItmDtlPurcUpriSub2Cols.$o_ship_valid_grp_cd);
		result.addStringColumn(ItmDtlPurcUpriSub2Cols.$o_ship_term_cd);
		result.addStringColumn(ItmDtlPurcUpriSub2Cols.$o_exim_xpns_typ);
		result.addBooleanColumn(ItmDtlPurcUpriSub2Cols.$o_sundry_itm_flg);
		result.addBooleanColumn(ItmDtlPurcUpriSub2Cols.$o_purc_upri_cng_flg);
		result.addBooleanColumn(ItmDtlPurcUpriSub2Cols.$o_prov_upri_cng_flg);
		result.addBooleanColumn(ItmDtlPurcUpriSub2Cols.$o_foreign_flg);
		result.addBooleanColumn(ItmDtlPurcUpriSub2Cols.$o_lg_def_flg);
		result.addBooleanColumn(ItmDtlPurcUpriSub2Cols.$o_pre_outsrc_act_flg);
		result.addBooleanColumn(ItmDtlPurcUpriSub2Cols.$o_ddlv_prov_insp_flg);
		result.addBooleanColumn(ItmDtlPurcUpriSub2Cols.$o_str_ln_tgt_flg);
		result.addBooleanColumn(ItmDtlPurcUpriSub2Cols.$o_alloc_lmt_flg);
		result.addBooleanColumn(ItmDtlPurcUpriSub2Cols.$o_gi_pack_xfer_flg);
		result.addBooleanColumn(ItmDtlPurcUpriSub2Cols.$o_gi_vmi_flg);
		result.addBooleanColumn(ItmDtlPurcUpriSub2Cols.$o_dscnt_itm_flg);
		result.addBooleanColumn(ItmDtlPurcUpriSub2Cols.$o_minus_stk_flg);
		result.addBooleanColumn(ItmDtlPurcUpriSub2Cols.$o_not_new_lot_flg);
		result.addBooleanColumn(ItmDtlPurcUpriSub2Cols.$o_gi_alloc_flg);
		result.addBooleanColumn(ItmDtlPurcUpriSub2Cols.$o_pack_alloc_flg);
		result.addBooleanColumn(ItmDtlPurcUpriSub2Cols.$o_bp_lot_flg);
		result.addBooleanColumn(ItmDtlPurcUpriSub2Cols.$o_skip_chk_ship_flg);
		result.addBooleanColumn(ItmDtlPurcUpriSub2Cols.$o_mrkt_judg_flg);
		result.addBooleanColumn(ItmDtlPurcUpriSub2Cols.$o_lmt_ctl_flg);
		result.addBooleanColumn(ItmDtlPurcUpriSub2Cols.$o_cont_fctr_flg);
		result.addBooleanColumn(ItmDtlPurcUpriSub2Cols.$o_slo_sno1_flg);
		result.addBooleanColumn(ItmDtlPurcUpriSub2Cols.$o_rqmt_sno1_flg);
		result.addBooleanColumn(ItmDtlPurcUpriSub2Cols.$o_slo_sno2_flg);
		result.addBooleanColumn(ItmDtlPurcUpriSub2Cols.$o_rqmt_sno2_flg);
		result.addBooleanColumn(ItmDtlPurcUpriSub2Cols.$o_slo_sno3_flg);
		result.addBooleanColumn(ItmDtlPurcUpriSub2Cols.$o_rqmt_sno3_flg);
		result.addBooleanColumn(ItmDtlPurcUpriSub2Cols.$o_slo_sno4_flg);
		result.addBooleanColumn(ItmDtlPurcUpriSub2Cols.$o_rqmt_sno4_flg);
		result.addBooleanColumn(ItmDtlPurcUpriSub2Cols.$o_inpt_itm_add_flg);
		result.addBooleanColumn(ItmDtlPurcUpriSub2Cols.$o_inpt_itm_del_flg);
		result.addBooleanColumn(ItmDtlPurcUpriSub2Cols.$o_sch_flg);
		result.addBooleanColumn(ItmDtlPurcUpriSub2Cols.$o_comp_rev_at_slo_flg);
		result.addBooleanColumn(ItmDtlPurcUpriSub2Cols.$o_comp_core_itm_flg);
		result.addBooleanColumn(ItmDtlPurcUpriSub2Cols.$o_slo_proc_flg);
		result.addBooleanColumn(ItmDtlPurcUpriSub2Cols.$o_ship_lot_back_stop_flg);
		result.addBooleanColumn(ItmDtlPurcUpriSub2Cols.$o_arr_skip_flg);
		result.addBooleanColumn(ItmDtlPurcUpriSub2Cols.$o_purc_dlv_slip_flg);
		result.addBooleanColumn(ItmDtlPurcUpriSub2Cols.$o_stk_lst_flg);
		result.addBooleanColumn(ItmDtlPurcUpriSub2Cols.$o_ver_flg);
		result.addBooleanColumn(ItmDtlPurcUpriSub2Cols.$o_subcon_flg);
		result.addBooleanColumn(ItmDtlPurcUpriSub2Cols.$o_wrk_po_flg);
		result.addBooleanColumn(ItmDtlPurcUpriSub2Cols.$o_wrk_ap_flg);
		result.addBooleanColumn(ItmDtlPurcUpriSub2Cols.$o_onr_prsppl_flg);
		result.addBooleanColumn(ItmDtlPurcUpriSub2Cols.$o_sppl_iv_flg);
		result.addBooleanColumn(ItmDtlPurcUpriSub2Cols.$o_prms_recv_flg);
		result.addBinaryColumn(ItmDtlPurcUpriSub2Cols.$o_th_image);
		result.addBooleanColumn(_$mfg_flg);
		result.addBooleanColumn(ItmDtlPurcUpriSub2Cols.$i_purc_flg);
		result.addBooleanColumn(_$outsrc_flg);
		result.addBooleanColumn(_$wg_xfr_flg);
		result.addBooleanColumn(_$asset_not_mng_flg);
		result.addBooleanColumn(ItmDtlPurcUpriSub2Cols.$o_repurc_obli_flg);
		result.addStringColumn(ItmDtlPurcUpriSub2Cols.$o_outsrc_upri_typ);

		// 購買ＦＬＧのみ、オンにする
		row.setBooleanNE(_$mfg_flg, false);
		row.setBooleanNE(ItmDtlPurcUpriSub2Cols.$i_purc_flg, true);
		row.setBooleanNE(_$outsrc_flg, false);
		row.setBooleanNE(_$wg_xfr_flg, false);
		
		// 直接入力時
		if (isInput(row)) {
			// 入力された値で絞り込む
			row.setStringNE("itm_sub2", row.getStringNE($INPUT_VAL));
			return;
		}
	}

	@Override
	protected  MCList<?> getItmDtlPurcUpriSub2_AfterSelect(MCRow row, MCQueryApiBuilder builder, MAM_ITM_DTL_R t, MCList<?> result) {
		MCList<?> l = super.getItmDtlPurcUpriSub2_AfterSelect(row, builder, t, result);
		if (isInput(row) || isCombo(row)) {
			l = getItmDtl_NoDupList(row, result, l, ItmDtlCols.$o_itm_sub2, "MA.MAUAL0010.ItmDtlPurcUpriSub2");
		}
		// 区分名の設定
		l.addStringColumn(MAC_ITM_TYP.$NAME);
		l.addStringColumn(MAC_STK_MNG_TYP.$NAME);
		l.addStringColumn(MAC_ASSET_MNG_TYP.$NAME);
		l.addStringColumn(MAC_LOC_MNG_TYP.$NAME);
		MAC_ITM_TYP.putNameNE(l, MAC_ITM_TYP.$VALUE, MAC_ITM_TYP.$NAME);
		MAC_STK_MNG_TYP.putNameNE(l, MAC_STK_MNG_TYP.$VALUE, MAC_STK_MNG_TYP.$NAME);
		MAC_ASSET_MNG_TYP.putNameNE(l, MAC_ASSET_MNG_TYP.$VALUE, MAC_ASSET_MNG_TYP.$NAME);
		MAC_LOC_MNG_TYP.putNameNE(l, MAC_LOC_MNG_TYP.$VALUE, MAC_LOC_MNG_TYP.$NAME);
		return l;
	}

	// -- ItmDtlPurcUpriSub2:品目詳細（購買単価用）（枝番２） (END)

	// -- ItmDtlPurcUpriSub3:品目詳細（購買単価用）（枝番３） (START)

	@Override
	public MCList<MCRow> getItmDtlPurcUpriSub3(MCRow row) {
		if (isNull(row.getStringNE(ItmDtlPurcUpriSub3Cols.$i_itm_cd))
				|| isNull(row.getStringNE(ItmDtlPurcUpriSub3Cols.$i_itm_sub1))
				|| isNull(row.getStringNE(ItmDtlPurcUpriSub3Cols.$i_itm_sub2))) {
			return null;
		}
		setDelFlgCtl(false);	//CONTEXTを設定、削除FLG=ONを対象とする
		setReleaseFlgCtl(false);	//CONTEXTを設定、リリースFLG=OFFを対象とする
		MCList<MAM_ITM_DTL_R> result = MCList.create(MAM_ITM_DTL_R.class);
		MAM_ITM_DTL_R t = MAM_ITM_DTL_R.create("T");
		MCQueryApiBuilder builder = MCQueryApiBuilder.create(t);
		getItmDtlPurcUpriSub3_Set(row, builder, t, result);
		result = _itmDtlSelect.apply(row).apply(builder).apply(t).apply(result);
		MCList<? extends MCRow> down = getItmDtlPurcUpriSub3_AfterSelect(row, builder, t, result);
		down = listlogicCommon_AfterSelect(row, result, down, "MA.MAUAL0010.ItmDtlPurcUpriSub3");
		if (isNull(down)) return null;
		return getItmDtlPurcUpriSub3_SubColumns(row, down);
	}

	@Override
	protected  void getItmDtlPurcUpriSub3_Set(MCRow row, MCQueryApiBuilder builder, MAM_ITM_DTL_R t, MCList<?> result) {
		// out項目には存在するが、MAM_ITM_DTLに存在しない項目の追加
		result.addNumberColumn(ItmDtlPurcUpriSub3Cols.$o_wtax_rate);
		result.addNumberColumn(ItmDtlPurcUpriSub3Cols.$o_conts_qty);
		result.addNumberColumn(ItmDtlPurcUpriSub3Cols.$o_pay_crryovr_times);
		result.addNumberColumn(ItmDtlPurcUpriSub3Cols.$o_std_cont_fctr);
		result.addNumberColumn(ItmDtlPurcUpriSub3Cols.$o_cont_fctr_dec_place);
		result.addNumberColumn(ItmDtlPurcUpriSub3Cols.$o_dec_place);
		result.addNumberColumn(ItmDtlPurcUpriSub3Cols.$o_dim);
		result.addNumberColumn(ItmDtlPurcUpriSub3Cols.$o_wt);
		result.addNumberColumn(ItmDtlPurcUpriSub3Cols.$o_rqmt_rstr_qty);
		result.addNumberColumn(ItmDtlPurcUpriSub3Cols.$o_alloc_margin_days);
		result.addNumberColumn(ItmDtlPurcUpriSub3Cols.$o_mrp_alloc_margin_days);
		result.addNumberColumn(ItmDtlPurcUpriSub3Cols.$o_mrp_opn_xfr_days);
		result.addStringColumn(ItmDtlPurcUpriSub3Cols.$o_itm_alt_nm1);
		result.addStringColumn(ItmDtlPurcUpriSub3Cols.$o_itm_alt_nm2);
		result.addStringColumn(ItmDtlPurcUpriSub3Cols.$o_itm_alt_nm3);
		result.addStringColumn(ItmDtlPurcUpriSub3Cols.$o_itm_alt_nm4);
		result.addStringColumn(ItmDtlPurcUpriSub3Cols.$o_itm_typ);
		result.addStringColumn(ItmDtlPurcUpriSub3Cols.$o_itm_typ_d_cd);
		result.addStringColumn(ItmDtlPurcUpriSub3Cols.$o_itm_typ_d_nm);
		result.addStringColumn(ItmDtlPurcUpriSub3Cols.$o_stk_mng_typ);
		result.addStringColumn(ItmDtlPurcUpriSub3Cols.$o_asset_mng_typ);
		result.addStringColumn(ItmDtlPurcUpriSub3Cols.$o_purc_tax_cd);
		result.addStringColumn(ItmDtlPurcUpriSub3Cols.$o_prov_tax_cd);
		result.addStringColumn(ItmDtlPurcUpriSub3Cols.$o_zip_cd);
		result.addStringColumn(ItmDtlPurcUpriSub3Cols.$o_addr1);
		result.addStringColumn(ItmDtlPurcUpriSub3Cols.$o_addr2);
		result.addStringColumn(ItmDtlPurcUpriSub3Cols.$o_addr3);
		result.addStringColumn(ItmDtlPurcUpriSub3Cols.$o_addr4);
		result.addStringColumn(ItmDtlPurcUpriSub3Cols.$o_tel);
		result.addStringColumn(ItmDtlPurcUpriSub3Cols.$o_fax);
		result.addStringColumn(ItmDtlPurcUpriSub3Cols.$o_cur_cd);
		result.addStringColumn(ItmDtlPurcUpriSub3Cols.$o_cur_nm);
		result.addStringColumn(ItmDtlPurcUpriSub3Cols.$o_cntry_cd);
		result.addStringColumn(ItmDtlPurcUpriSub3Cols.$o_cntry_nm);
		result.addStringColumn(ItmDtlPurcUpriSub3Cols.$o_area_cd);
		result.addStringColumn(ItmDtlPurcUpriSub3Cols.$o_area_nm);
		result.addStringColumn(ItmDtlPurcUpriSub3Cols.$o_asst_dpt_cd);
		result.addStringColumn(ItmDtlPurcUpriSub3Cols.$o_sls_dpt_cd);
		result.addStringColumn(ItmDtlPurcUpriSub3Cols.$o_site_cd);
		result.addStringColumn(ItmDtlPurcUpriSub3Cols.$o_site_nm);
		result.addStringColumn(ItmDtlPurcUpriSub3Cols.$o_lg_grp_cd);
		result.addStringColumn(ItmDtlPurcUpriSub3Cols.$o_lg_grp_nm);
		result.addStringColumn(ItmDtlPurcUpriSub3Cols.$o_loc_grp_cd);
		result.addStringColumn(ItmDtlPurcUpriSub3Cols.$o_loc_grp_nm);
		result.addStringColumn(ItmDtlPurcUpriSub3Cols.$o_alloc_grp_cd);
		result.addStringColumn(ItmDtlPurcUpriSub3Cols.$o_alloc_grp_nm);
		result.addStringColumn(ItmDtlPurcUpriSub3Cols.$o_loc_cal_cd);
		result.addStringColumn(ItmDtlPurcUpriSub3Cols.$o_loc_mng_typ);
		result.addStringColumn(ItmDtlPurcUpriSub3Cols.$o_rsrc_cd1);
		result.addStringColumn(ItmDtlPurcUpriSub3Cols.$o_rsrc_cd2);
		result.addStringColumn(ItmDtlPurcUpriSub3Cols.$o_prnt_lcl_cd);
		result.addStringColumn(ItmDtlPurcUpriSub3Cols.$o_asppl_cd);
		result.addStringColumn(ItmDtlPurcUpriSub3Cols.$o_vmi_purc_dpt_cd);
		result.addStringColumn(ItmDtlPurcUpriSub3Cols.$o_mrkt_judg_role_cd);
		result.addStringColumn(ItmDtlPurcUpriSub3Cols.$o_po_print_cd);
		result.addStringColumn(ItmDtlPurcUpriSub3Cols.$o_sppl_ship_form_cd);
		result.addStringColumn(ItmDtlPurcUpriSub3Cols.$o_sppl_cntct_dpt);
		result.addStringColumn(ItmDtlPurcUpriSub3Cols.$o_sppl_cntct_psn);
		result.addStringColumn(ItmDtlPurcUpriSub3Cols.$o_sppl_cntct_psn_title);
		result.addStringColumn(ItmDtlPurcUpriSub3Cols.$o_purc_upri_req_typ);
		result.addStringColumn(ItmDtlPurcUpriSub3Cols.$o_purc_amt_rnd_typ);
		result.addStringColumn(ItmDtlPurcUpriSub3Cols.$o_purc_tax_rnd_typ);
		result.addStringColumn(ItmDtlPurcUpriSub3Cols.$o_purc_tax_calc_typ);
		result.addStringColumn(ItmDtlPurcUpriSub3Cols.$o_prov_rcv_typ);
		result.addStringColumn(ItmDtlPurcUpriSub3Cols.$o_prov_basis_typ);
		result.addStringColumn(ItmDtlPurcUpriSub3Cols.$o_prov_amt_rnd_typ);
		result.addStringColumn(ItmDtlPurcUpriSub3Cols.$o_prov_tax_rnd_typ);
		result.addStringColumn(ItmDtlPurcUpriSub3Cols.$o_prov_tax_calc_typ);
		result.addStringColumn(ItmDtlPurcUpriSub3Cols.$o_sppl_cal_cd);
		result.addStringColumn(ItmDtlPurcUpriSub3Cols.$o_sppl_tterm_cd1);
		result.addStringColumn(ItmDtlPurcUpriSub3Cols.$o_sppl_tterm_cd2);
		result.addStringColumn(ItmDtlPurcUpriSub3Cols.$o_sppl_tterm_cd3);
		result.addStringColumn(ItmDtlPurcUpriSub3Cols.$o_unit_cd);
		result.addStringColumn(ItmDtlPurcUpriSub3Cols.$o_unit_nm);
		result.addStringColumn(ItmDtlPurcUpriSub3Cols.$o_rnd_typ);
		result.addStringColumn(ItmDtlPurcUpriSub3Cols.$o_dim_unit_cd);
		result.addStringColumn(ItmDtlPurcUpriSub3Cols.$o_wt_unit_cd);
		result.addStringColumn(ItmDtlPurcUpriSub3Cols.$o_conts_unit_cd);
		result.addStringColumn(ItmDtlPurcUpriSub3Cols.$o_hs_cd);
		result.addStringColumn(ItmDtlPurcUpriSub3Cols.$o_itm_jnl_cd);
		result.addStringColumn(ItmDtlPurcUpriSub3Cols.$o_ac_itm_grp_cd);
		result.addStringColumn(ItmDtlPurcUpriSub3Cols.$o_ship_unit_cd);
		result.addStringColumn(ItmDtlPurcUpriSub3Cols.$o_mfg_unit_cd);
		result.addStringColumn(ItmDtlPurcUpriSub3Cols.$o_purc_unit_cd);
		result.addStringColumn(ItmDtlPurcUpriSub3Cols.$o_pckg_unit_cd);
		result.addStringColumn(ItmDtlPurcUpriSub3Cols.$o_lot_mng_typ);
		result.addStringColumn(ItmDtlPurcUpriSub3Cols.$o_lot_no_typ);
		result.addStringColumn(ItmDtlPurcUpriSub3Cols.$o_lot_no_ptn_cd);
		result.addStringColumn(ItmDtlPurcUpriSub3Cols.$o_sublot_mng_typ);
		result.addStringColumn(ItmDtlPurcUpriSub3Cols.$o_sublot_no_typ);
		result.addStringColumn(ItmDtlPurcUpriSub3Cols.$o_sublot_no_ptn_cd);
		result.addStringColumn(ItmDtlPurcUpriSub3Cols.$o_insp_bind_typ);
		result.addStringColumn(ItmDtlPurcUpriSub3Cols.$o_lmt_ctl_categ);
		result.addStringColumn(ItmDtlPurcUpriSub3Cols.$o_cont_fctr_unit_cd);
		result.addStringColumn(ItmDtlPurcUpriSub3Cols.$o_cont_fctr_rnd_typ);
		result.addStringColumn(ItmDtlPurcUpriSub3Cols.$o_sno1_mng_typ);
		result.addStringColumn(ItmDtlPurcUpriSub3Cols.$o_sno1_num_typ);
		result.addStringColumn(ItmDtlPurcUpriSub3Cols.$o_sno1_ptn_cd);
		result.addStringColumn(ItmDtlPurcUpriSub3Cols.$o_sno2_mng_typ);
		result.addStringColumn(ItmDtlPurcUpriSub3Cols.$o_sno2_num_typ);
		result.addStringColumn(ItmDtlPurcUpriSub3Cols.$o_sno2_ptn_cd);
		result.addStringColumn(ItmDtlPurcUpriSub3Cols.$o_sno3_mng_typ);
		result.addStringColumn(ItmDtlPurcUpriSub3Cols.$o_sno3_num_typ);
		result.addStringColumn(ItmDtlPurcUpriSub3Cols.$o_sno3_ptn_cd);
		result.addStringColumn(ItmDtlPurcUpriSub3Cols.$o_sno4_mng_typ);
		result.addStringColumn(ItmDtlPurcUpriSub3Cols.$o_sno4_num_typ);
		result.addStringColumn(ItmDtlPurcUpriSub3Cols.$o_sno4_ptn_cd);
		result.addStringColumn(ItmDtlPurcUpriSub3Cols.$o_mfg_inst_unit_typ);
		result.addStringColumn(ItmDtlPurcUpriSub3Cols.$o_mrp_proc_typ);
		result.addStringColumn(ItmDtlPurcUpriSub3Cols.$o_cntry_org_cd);
		result.addStringColumn(ItmDtlPurcUpriSub3Cols.$o_comp_spec_typ);
		result.addStringColumn(ItmDtlPurcUpriSub3Cols.$o_itm_spec_grp_cd);
		result.addStringColumn(ItmDtlPurcUpriSub3Cols.$o_slo_proc_typ);
		result.addStringColumn(ItmDtlPurcUpriSub3Cols.$o_ship_inst_typ);
		result.addStringColumn(ItmDtlPurcUpriSub3Cols.$o_itm_ship_grp_cd);
		result.addStringColumn(ItmDtlPurcUpriSub3Cols.$o_ship_valid_grp_cd);
		result.addStringColumn(ItmDtlPurcUpriSub3Cols.$o_ship_term_cd);
		result.addStringColumn(ItmDtlPurcUpriSub3Cols.$o_exim_xpns_typ);
		result.addBooleanColumn(ItmDtlPurcUpriSub3Cols.$o_sundry_itm_flg);
		result.addBooleanColumn(ItmDtlPurcUpriSub3Cols.$o_purc_upri_cng_flg);
		result.addBooleanColumn(ItmDtlPurcUpriSub3Cols.$o_prov_upri_cng_flg);
		result.addBooleanColumn(ItmDtlPurcUpriSub3Cols.$o_foreign_flg);
		result.addBooleanColumn(ItmDtlPurcUpriSub3Cols.$o_lg_def_flg);
		result.addBooleanColumn(ItmDtlPurcUpriSub3Cols.$o_pre_outsrc_act_flg);
		result.addBooleanColumn(ItmDtlPurcUpriSub3Cols.$o_ddlv_prov_insp_flg);
		result.addBooleanColumn(ItmDtlPurcUpriSub3Cols.$o_str_ln_tgt_flg);
		result.addBooleanColumn(ItmDtlPurcUpriSub3Cols.$o_alloc_lmt_flg);
		result.addBooleanColumn(ItmDtlPurcUpriSub3Cols.$o_gi_pack_xfer_flg);
		result.addBooleanColumn(ItmDtlPurcUpriSub3Cols.$o_gi_vmi_flg);
		result.addBooleanColumn(ItmDtlPurcUpriSub3Cols.$o_dscnt_itm_flg);
		result.addBooleanColumn(ItmDtlPurcUpriSub3Cols.$o_minus_stk_flg);
		result.addBooleanColumn(ItmDtlPurcUpriSub3Cols.$o_not_new_lot_flg);
		result.addBooleanColumn(ItmDtlPurcUpriSub3Cols.$o_gi_alloc_flg);
		result.addBooleanColumn(ItmDtlPurcUpriSub3Cols.$o_pack_alloc_flg);
		result.addBooleanColumn(ItmDtlPurcUpriSub3Cols.$o_bp_lot_flg);
		result.addBooleanColumn(ItmDtlPurcUpriSub3Cols.$o_skip_chk_ship_flg);
		result.addBooleanColumn(ItmDtlPurcUpriSub3Cols.$o_mrkt_judg_flg);
		result.addBooleanColumn(ItmDtlPurcUpriSub3Cols.$o_lmt_ctl_flg);
		result.addBooleanColumn(ItmDtlPurcUpriSub3Cols.$o_cont_fctr_flg);
		result.addBooleanColumn(ItmDtlPurcUpriSub3Cols.$o_slo_sno1_flg);
		result.addBooleanColumn(ItmDtlPurcUpriSub3Cols.$o_rqmt_sno1_flg);
		result.addBooleanColumn(ItmDtlPurcUpriSub3Cols.$o_slo_sno2_flg);
		result.addBooleanColumn(ItmDtlPurcUpriSub3Cols.$o_rqmt_sno2_flg);
		result.addBooleanColumn(ItmDtlPurcUpriSub3Cols.$o_slo_sno3_flg);
		result.addBooleanColumn(ItmDtlPurcUpriSub3Cols.$o_rqmt_sno3_flg);
		result.addBooleanColumn(ItmDtlPurcUpriSub3Cols.$o_slo_sno4_flg);
		result.addBooleanColumn(ItmDtlPurcUpriSub3Cols.$o_rqmt_sno4_flg);
		result.addBooleanColumn(ItmDtlPurcUpriSub3Cols.$o_inpt_itm_add_flg);
		result.addBooleanColumn(ItmDtlPurcUpriSub3Cols.$o_inpt_itm_del_flg);
		result.addBooleanColumn(ItmDtlPurcUpriSub3Cols.$o_sch_flg);
		result.addBooleanColumn(ItmDtlPurcUpriSub3Cols.$o_comp_rev_at_slo_flg);
		result.addBooleanColumn(ItmDtlPurcUpriSub3Cols.$o_comp_core_itm_flg);
		result.addBooleanColumn(ItmDtlPurcUpriSub3Cols.$o_slo_proc_flg);
		result.addBooleanColumn(ItmDtlPurcUpriSub3Cols.$o_ship_lot_back_stop_flg);
		result.addBooleanColumn(ItmDtlPurcUpriSub3Cols.$o_arr_skip_flg);
		result.addBooleanColumn(ItmDtlPurcUpriSub3Cols.$o_purc_dlv_slip_flg);
		result.addBooleanColumn(ItmDtlPurcUpriSub3Cols.$o_stk_lst_flg);
		result.addBooleanColumn(ItmDtlPurcUpriSub3Cols.$o_ver_flg);
		result.addBooleanColumn(ItmDtlPurcUpriSub3Cols.$o_subcon_flg);
		result.addBooleanColumn(ItmDtlPurcUpriSub3Cols.$o_wrk_po_flg);
		result.addBooleanColumn(ItmDtlPurcUpriSub3Cols.$o_wrk_ap_flg);
		result.addBooleanColumn(ItmDtlPurcUpriSub3Cols.$o_onr_prsppl_flg);
		result.addBooleanColumn(ItmDtlPurcUpriSub3Cols.$o_sppl_iv_flg);
		result.addBooleanColumn(ItmDtlPurcUpriSub3Cols.$o_prms_recv_flg);
		result.addBinaryColumn(ItmDtlPurcUpriSub3Cols.$o_th_image);
		result.addBooleanColumn(_$mfg_flg);
		result.addBooleanColumn(ItmDtlPurcUpriSub3Cols.$i_purc_flg);
		result.addBooleanColumn(_$outsrc_flg);
		result.addBooleanColumn(_$wg_xfr_flg);
		result.addBooleanColumn(_$asset_not_mng_flg);
		result.addBooleanColumn(ItmDtlPurcUpriSub3Cols.$o_repurc_obli_flg);
		result.addStringColumn(ItmDtlPurcUpriSub3Cols.$o_outsrc_upri_typ);

		// 購買ＦＬＧのみ、オンにする
		row.setBooleanNE(_$mfg_flg, false);
		row.setBooleanNE(ItmDtlPurcUpriSub3Cols.$i_purc_flg, true);
		row.setBooleanNE(_$outsrc_flg, false);
		row.setBooleanNE(_$wg_xfr_flg, false);
		
		// 直接入力時
		if (isInput(row)) {
			// 入力された値で絞り込む
			row.setStringNE("itm_sub3", row.getStringNE($INPUT_VAL));
			return;
		}
	}

	@Override
	protected  MCList<?> getItmDtlPurcUpriSub3_AfterSelect(MCRow row, MCQueryApiBuilder builder, MAM_ITM_DTL_R t, MCList<?> result) {
		MCList<?> l = super.getItmDtlPurcUpriSub3_AfterSelect(row, builder, t, result);
		if (isInput(row) || isCombo(row)) {
			l = getItmDtl_NoDupList(row, result, l, ItmDtlPurcUpriSub1Cols.$o_itm_sub3, "MA.MAUAL0010.ItmDtlPurcUpriSub3");
		}
		// 区分名の設定
		l.addStringColumn(MAC_ITM_TYP.$NAME);
		l.addStringColumn(MAC_STK_MNG_TYP.$NAME);
		l.addStringColumn(MAC_ASSET_MNG_TYP.$NAME);
		l.addStringColumn(MAC_LOC_MNG_TYP.$NAME);
		MAC_ITM_TYP.putNameNE(l, MAC_ITM_TYP.$VALUE, MAC_ITM_TYP.$NAME);
		MAC_STK_MNG_TYP.putNameNE(l, MAC_STK_MNG_TYP.$VALUE, MAC_STK_MNG_TYP.$NAME);
		MAC_ASSET_MNG_TYP.putNameNE(l, MAC_ASSET_MNG_TYP.$VALUE, MAC_ASSET_MNG_TYP.$NAME);
		MAC_LOC_MNG_TYP.putNameNE(l, MAC_LOC_MNG_TYP.$VALUE, MAC_LOC_MNG_TYP.$NAME);
		return l;
	}

	// -- ItmDtlPurcUpriSub3:品目詳細（購買単価用）（枝番３） (END)

	// -- ItmDtlProcUpri:品目詳細（加工単価用） (START)

	@Override
	public MCList<MCRow> getItmDtlProcUpri(MCRow row) {
		setDelFlgCtl(false);	//CONTEXTを設定、削除FLG=ONを対象とする
		setReleaseFlgCtl(false);	//CONTEXTを設定、リリースFLG=OFFを対象とする
		MCList<MAM_ITM_DTL_R> result = MCList.create(MAM_ITM_DTL_R.class);
		MAM_ITM_DTL_R t = MAM_ITM_DTL_R.create("T");
		MCQueryApiBuilder builder = MCQueryApiBuilder.create(t);
		getItmDtlProcUpri_Set(row, builder, t, result);
		result = _itmDtlSelect.apply(row).apply(builder).apply(t).apply(result);
		MCList<? extends MCRow> down = getItmDtlProcUpri_AfterSelect(row, builder, t, result);
		down = listlogicCommon_AfterSelect(row, result, down, "MA.MAUAL0010.ItmDtlProcUpri");
		if (isNull(down)) return null;
		return getItmDtlProcUpri_SubColumns(row, down);
	}

	@Override
	protected  void getItmDtlProcUpri_Set(MCRow row, MCQueryApiBuilder builder, MAM_ITM_DTL_R t, MCList<?> result) {
		// out項目には存在するが、MAM_ITM_DTLに存在しない項目の追加
		result.addNumberColumn(ItmDtlProcUpriCols.$o_wtax_rate);
		result.addNumberColumn(ItmDtlProcUpriCols.$o_conts_qty);
		result.addNumberColumn(ItmDtlProcUpriCols.$o_pay_crryovr_times);
		result.addNumberColumn(ItmDtlProcUpriCols.$o_std_cont_fctr);
		result.addNumberColumn(ItmDtlProcUpriCols.$o_cont_fctr_dec_place);
		result.addNumberColumn(ItmDtlProcUpriCols.$o_dec_place);
		result.addNumberColumn(ItmDtlProcUpriCols.$o_dim);
		result.addNumberColumn(ItmDtlProcUpriCols.$o_wt);
		result.addNumberColumn(ItmDtlProcUpriCols.$o_rqmt_rstr_qty);
		result.addNumberColumn(ItmDtlProcUpriCols.$o_alloc_margin_days);
		result.addNumberColumn(ItmDtlProcUpriCols.$o_mrp_alloc_margin_days);
		result.addNumberColumn(ItmDtlProcUpriCols.$o_mrp_opn_xfr_days);
		result.addStringColumn(ItmDtlProcUpriCols.$o_itm_alt_nm1);
		result.addStringColumn(ItmDtlProcUpriCols.$o_itm_alt_nm2);
		result.addStringColumn(ItmDtlProcUpriCols.$o_itm_alt_nm3);
		result.addStringColumn(ItmDtlProcUpriCols.$o_itm_alt_nm4);
		result.addStringColumn(ItmDtlProcUpriCols.$o_itm_typ);
		result.addStringColumn(ItmDtlProcUpriCols.$o_itm_typ_d_cd);
		result.addStringColumn(ItmDtlProcUpriCols.$o_itm_typ_d_nm);
		result.addStringColumn(ItmDtlProcUpriCols.$o_stk_mng_typ);
		result.addStringColumn(ItmDtlProcUpriCols.$o_asset_mng_typ);
		result.addStringColumn(ItmDtlProcUpriCols.$o_purc_tax_cd);
		result.addStringColumn(ItmDtlProcUpriCols.$o_prov_tax_cd);
		result.addStringColumn(ItmDtlProcUpriCols.$o_zip_cd);
		result.addStringColumn(ItmDtlProcUpriCols.$o_addr1);
		result.addStringColumn(ItmDtlProcUpriCols.$o_addr2);
		result.addStringColumn(ItmDtlProcUpriCols.$o_addr3);
		result.addStringColumn(ItmDtlProcUpriCols.$o_addr4);
		result.addStringColumn(ItmDtlProcUpriCols.$o_tel);
		result.addStringColumn(ItmDtlProcUpriCols.$o_fax);
		result.addStringColumn(ItmDtlProcUpriCols.$o_cur_cd);
		result.addStringColumn(ItmDtlProcUpriCols.$o_cur_nm);
		result.addStringColumn(ItmDtlProcUpriCols.$o_cntry_cd);
		result.addStringColumn(ItmDtlProcUpriCols.$o_cntry_nm);
		result.addStringColumn(ItmDtlProcUpriCols.$o_area_cd);
		result.addStringColumn(ItmDtlProcUpriCols.$o_area_nm);
		result.addStringColumn(ItmDtlProcUpriCols.$o_asst_dpt_cd);
		result.addStringColumn(ItmDtlProcUpriCols.$o_sls_dpt_cd);
		result.addStringColumn(ItmDtlProcUpriCols.$o_site_cd);
		result.addStringColumn(ItmDtlProcUpriCols.$o_site_nm);
		result.addStringColumn(ItmDtlProcUpriCols.$o_lg_grp_cd);
		result.addStringColumn(ItmDtlProcUpriCols.$o_lg_grp_nm);
		result.addStringColumn(ItmDtlProcUpriCols.$o_loc_grp_cd);
		result.addStringColumn(ItmDtlProcUpriCols.$o_loc_grp_nm);
		result.addStringColumn(ItmDtlProcUpriCols.$o_alloc_grp_cd);
		result.addStringColumn(ItmDtlProcUpriCols.$o_alloc_grp_nm);
		result.addStringColumn(ItmDtlProcUpriCols.$o_loc_cal_cd);
		result.addStringColumn(ItmDtlProcUpriCols.$o_loc_mng_typ);
		result.addStringColumn(ItmDtlProcUpriCols.$o_rsrc_cd1);
		result.addStringColumn(ItmDtlProcUpriCols.$o_rsrc_cd2);
		result.addStringColumn(ItmDtlProcUpriCols.$o_prnt_lcl_cd);
		result.addStringColumn(ItmDtlProcUpriCols.$o_asppl_cd);
		result.addStringColumn(ItmDtlProcUpriCols.$o_vmi_purc_dpt_cd);
		result.addStringColumn(ItmDtlProcUpriCols.$o_mrkt_judg_role_cd);
		result.addStringColumn(ItmDtlProcUpriCols.$o_po_print_cd);
		result.addStringColumn(ItmDtlProcUpriCols.$o_sppl_ship_form_cd);
		result.addStringColumn(ItmDtlProcUpriCols.$o_sppl_cntct_dpt);
		result.addStringColumn(ItmDtlProcUpriCols.$o_sppl_cntct_psn);
		result.addStringColumn(ItmDtlProcUpriCols.$o_sppl_cntct_psn_title);
		result.addStringColumn(ItmDtlProcUpriCols.$o_purc_upri_req_typ);
		result.addStringColumn(ItmDtlProcUpriCols.$o_purc_amt_rnd_typ);
		result.addStringColumn(ItmDtlProcUpriCols.$o_purc_tax_rnd_typ);
		result.addStringColumn(ItmDtlProcUpriCols.$o_purc_tax_calc_typ);
		result.addStringColumn(ItmDtlProcUpriCols.$o_prov_rcv_typ);
		result.addStringColumn(ItmDtlProcUpriCols.$o_prov_basis_typ);
		result.addStringColumn(ItmDtlProcUpriCols.$o_prov_amt_rnd_typ);
		result.addStringColumn(ItmDtlProcUpriCols.$o_prov_tax_rnd_typ);
		result.addStringColumn(ItmDtlProcUpriCols.$o_prov_tax_calc_typ);
		result.addStringColumn(ItmDtlProcUpriCols.$o_sppl_cal_cd);
		result.addStringColumn(ItmDtlProcUpriCols.$o_sppl_tterm_cd1);
		result.addStringColumn(ItmDtlProcUpriCols.$o_sppl_tterm_cd2);
		result.addStringColumn(ItmDtlProcUpriCols.$o_sppl_tterm_cd3);
		result.addStringColumn(ItmDtlProcUpriCols.$o_unit_cd);
		result.addStringColumn(ItmDtlProcUpriCols.$o_unit_nm);
		result.addStringColumn(ItmDtlProcUpriCols.$o_rnd_typ);
		result.addStringColumn(ItmDtlProcUpriCols.$o_dim_unit_cd);
		result.addStringColumn(ItmDtlProcUpriCols.$o_wt_unit_cd);
		result.addStringColumn(ItmDtlProcUpriCols.$o_conts_unit_cd);
		result.addStringColumn(ItmDtlProcUpriCols.$o_hs_cd);
		result.addStringColumn(ItmDtlProcUpriCols.$o_itm_jnl_cd);
		result.addStringColumn(ItmDtlProcUpriCols.$o_ac_itm_grp_cd);
		result.addStringColumn(ItmDtlProcUpriCols.$o_ship_unit_cd);
		result.addStringColumn(ItmDtlProcUpriCols.$o_mfg_unit_cd);
		result.addStringColumn(ItmDtlProcUpriCols.$o_purc_unit_cd);
		result.addStringColumn(ItmDtlProcUpriCols.$o_pckg_unit_cd);
		result.addStringColumn(ItmDtlProcUpriCols.$o_lot_mng_typ);
		result.addStringColumn(ItmDtlProcUpriCols.$o_lot_no_typ);
		result.addStringColumn(ItmDtlProcUpriCols.$o_lot_no_ptn_cd);
		result.addStringColumn(ItmDtlProcUpriCols.$o_sublot_mng_typ);
		result.addStringColumn(ItmDtlProcUpriCols.$o_sublot_no_typ);
		result.addStringColumn(ItmDtlProcUpriCols.$o_sublot_no_ptn_cd);
		result.addStringColumn(ItmDtlProcUpriCols.$o_insp_bind_typ);
		result.addStringColumn(ItmDtlProcUpriCols.$o_lmt_ctl_categ);
		result.addStringColumn(ItmDtlProcUpriCols.$o_cont_fctr_unit_cd);
		result.addStringColumn(ItmDtlProcUpriCols.$o_cont_fctr_rnd_typ);
		result.addStringColumn(ItmDtlProcUpriCols.$o_sno1_mng_typ);
		result.addStringColumn(ItmDtlProcUpriCols.$o_sno1_num_typ);
		result.addStringColumn(ItmDtlProcUpriCols.$o_sno1_ptn_cd);
		result.addStringColumn(ItmDtlProcUpriCols.$o_sno2_mng_typ);
		result.addStringColumn(ItmDtlProcUpriCols.$o_sno2_num_typ);
		result.addStringColumn(ItmDtlProcUpriCols.$o_sno2_ptn_cd);
		result.addStringColumn(ItmDtlProcUpriCols.$o_sno3_mng_typ);
		result.addStringColumn(ItmDtlProcUpriCols.$o_sno3_num_typ);
		result.addStringColumn(ItmDtlProcUpriCols.$o_sno3_ptn_cd);
		result.addStringColumn(ItmDtlProcUpriCols.$o_sno4_mng_typ);
		result.addStringColumn(ItmDtlProcUpriCols.$o_sno4_num_typ);
		result.addStringColumn(ItmDtlProcUpriCols.$o_sno4_ptn_cd);
		result.addStringColumn(ItmDtlProcUpriCols.$o_mfg_inst_unit_typ);
		result.addStringColumn(ItmDtlProcUpriCols.$o_mrp_proc_typ);
		result.addStringColumn(ItmDtlProcUpriCols.$o_cntry_org_cd);
		result.addStringColumn(ItmDtlProcUpriCols.$o_comp_spec_typ);
		result.addStringColumn(ItmDtlProcUpriCols.$o_itm_spec_grp_cd);
		result.addStringColumn(ItmDtlProcUpriCols.$o_slo_proc_typ);
		result.addStringColumn(ItmDtlProcUpriCols.$o_ship_inst_typ);
		result.addStringColumn(ItmDtlProcUpriCols.$o_itm_ship_grp_cd);
		result.addStringColumn(ItmDtlProcUpriCols.$o_ship_valid_grp_cd);
		result.addStringColumn(ItmDtlProcUpriCols.$o_ship_term_cd);
		result.addStringColumn(ItmDtlProcUpriCols.$o_exim_xpns_typ);
		result.addBooleanColumn(ItmDtlProcUpriCols.$o_sundry_itm_flg);
		result.addBooleanColumn(ItmDtlProcUpriCols.$o_purc_upri_cng_flg);
		result.addBooleanColumn(ItmDtlProcUpriCols.$o_prov_upri_cng_flg);
		result.addBooleanColumn(ItmDtlProcUpriCols.$o_foreign_flg);
		result.addBooleanColumn(ItmDtlProcUpriCols.$o_lg_def_flg);
		result.addBooleanColumn(ItmDtlProcUpriCols.$o_pre_outsrc_act_flg);
		result.addBooleanColumn(ItmDtlProcUpriCols.$o_ddlv_prov_insp_flg);
		result.addBooleanColumn(ItmDtlProcUpriCols.$o_str_ln_tgt_flg);
		result.addBooleanColumn(ItmDtlProcUpriCols.$o_alloc_lmt_flg);
		result.addBooleanColumn(ItmDtlProcUpriCols.$o_gi_pack_xfer_flg);
		result.addBooleanColumn(ItmDtlProcUpriCols.$o_gi_vmi_flg);
		result.addBooleanColumn(ItmDtlProcUpriCols.$o_dscnt_itm_flg);
		result.addBooleanColumn(ItmDtlProcUpriCols.$o_minus_stk_flg);
		result.addBooleanColumn(ItmDtlProcUpriCols.$o_not_new_lot_flg);
		result.addBooleanColumn(ItmDtlProcUpriCols.$o_gi_alloc_flg);
		result.addBooleanColumn(ItmDtlProcUpriCols.$o_pack_alloc_flg);
		result.addBooleanColumn(ItmDtlProcUpriCols.$o_bp_lot_flg);
		result.addBooleanColumn(ItmDtlProcUpriCols.$o_skip_chk_ship_flg);
		result.addBooleanColumn(ItmDtlProcUpriCols.$o_mrkt_judg_flg);
		result.addBooleanColumn(ItmDtlProcUpriCols.$o_lmt_ctl_flg);
		result.addBooleanColumn(ItmDtlProcUpriCols.$o_cont_fctr_flg);
		result.addBooleanColumn(ItmDtlProcUpriCols.$o_slo_sno1_flg);
		result.addBooleanColumn(ItmDtlProcUpriCols.$o_rqmt_sno1_flg);
		result.addBooleanColumn(ItmDtlProcUpriCols.$o_slo_sno2_flg);
		result.addBooleanColumn(ItmDtlProcUpriCols.$o_rqmt_sno2_flg);
		result.addBooleanColumn(ItmDtlProcUpriCols.$o_slo_sno3_flg);
		result.addBooleanColumn(ItmDtlProcUpriCols.$o_rqmt_sno3_flg);
		result.addBooleanColumn(ItmDtlProcUpriCols.$o_slo_sno4_flg);
		result.addBooleanColumn(ItmDtlProcUpriCols.$o_rqmt_sno4_flg);
		result.addBooleanColumn(ItmDtlProcUpriCols.$o_inpt_itm_add_flg);
		result.addBooleanColumn(ItmDtlProcUpriCols.$o_inpt_itm_del_flg);
		result.addBooleanColumn(ItmDtlProcUpriCols.$o_sch_flg);
		result.addBooleanColumn(ItmDtlProcUpriCols.$o_comp_rev_at_slo_flg);
		result.addBooleanColumn(ItmDtlProcUpriCols.$o_comp_core_itm_flg);
		result.addBooleanColumn(ItmDtlProcUpriCols.$o_slo_proc_flg);
		result.addBooleanColumn(ItmDtlProcUpriCols.$o_ship_lot_back_stop_flg);
		result.addBooleanColumn(ItmDtlProcUpriCols.$o_arr_skip_flg);
		result.addBooleanColumn(ItmDtlProcUpriCols.$o_purc_dlv_slip_flg);
		result.addBooleanColumn(ItmDtlProcUpriCols.$o_stk_lst_flg);
		result.addBooleanColumn(ItmDtlProcUpriCols.$o_ver_flg);
		result.addBooleanColumn(ItmDtlProcUpriCols.$o_subcon_flg);
		result.addBooleanColumn(ItmDtlProcUpriCols.$o_wrk_po_flg);
		result.addBooleanColumn(ItmDtlProcUpriCols.$o_wrk_ap_flg);
		result.addBooleanColumn(ItmDtlProcUpriCols.$o_onr_prsppl_flg);
		result.addBooleanColumn(ItmDtlProcUpriCols.$o_sppl_iv_flg);
		result.addBooleanColumn(ItmDtlProcUpriCols.$o_prms_recv_flg);
		result.addBinaryColumn(ItmDtlProcUpriCols.$o_th_image);
		result.addBooleanColumn(_$mfg_flg);
		result.addBooleanColumn(_$purc_flg);
		result.addBooleanColumn(ItmDtlProcUpriCols.$i_outsrc_flg);
		result.addBooleanColumn(_$wg_xfr_flg);
		result.addBooleanColumn(_$asset_not_mng_flg);
		result.addBooleanColumn(ItmDtlProcUpriCols.$o_repurc_obli_flg);
		result.addStringColumn(ItmDtlProcUpriCols.$o_outsrc_upri_typ);

		// 外注ＦＬＧのみ、オンにする
		row.setBooleanNE(_$mfg_flg, false);
		row.setBooleanNE(_$purc_flg, false);
		row.setBooleanNE(ItmDtlProcUpriCols.$i_outsrc_flg, true);
		row.setBooleanNE(_$wg_xfr_flg, false);

		// 直接入力時
		if (isInput(row)) {
			// 入力された値で絞り込む
			row.setStringNE("itm_cd", row.getStringNE($INPUT_VAL));
			return;
		}
		
		// 入力補助画面の検索条件
		row.setStringNE(ItmDtlProcUpriCols.$i_wg_cd, getEditString(row, ItmDtlProcUpriCols.$i_wg_cd));
		row.setStringNE(ItmDtlProcUpriCols.$i_wg_nm, getEditString(row, ItmDtlProcUpriCols.$i_wg_nm));
		row.setStringNE(ItmDtlProcUpriCols.$i_itm_cd, getEditString(row, ItmDtlProcUpriCols.$i_itm_cd));
		row.setStringNE(ItmDtlProcUpriCols.$i_itm_sub1, getEditString(row, ItmDtlProcUpriCols.$i_itm_sub1));
		row.setStringNE(ItmDtlProcUpriCols.$i_itm_sub2, getEditString(row, ItmDtlProcUpriCols.$i_itm_sub2));
		row.setStringNE(ItmDtlProcUpriCols.$i_itm_sub3, getEditString(row, ItmDtlProcUpriCols.$i_itm_sub3));
		row.setStringNE(ItmDtlProcUpriCols.$i_itm_nm, getEditString(row, ItmDtlProcUpriCols.$i_itm_nm));
		row.setStringNE(ItmDtlProcUpriCols.$i_itm_alt_nm1, getEditString(row, ItmDtlProcUpriCols.$i_itm_alt_nm1));
		row.setStringNE(ItmDtlProcUpriCols.$i_itm_alt_nm2, getEditString(row, ItmDtlProcUpriCols.$i_itm_alt_nm2));
		row.setStringNE(ItmDtlProcUpriCols.$i_itm_alt_nm3, getEditString(row, ItmDtlProcUpriCols.$i_itm_alt_nm3));
		row.setStringNE(ItmDtlProcUpriCols.$i_itm_alt_nm4, getEditString(row, ItmDtlProcUpriCols.$i_itm_alt_nm4));
		row.setStringNE(ItmDtlProcUpriCols.$i_itm_typ, getEditString(row, ItmDtlProcUpriCols.$i_itm_typ));
		row.setStringNE(ItmDtlProcUpriCols.$i_itm_typ_d_cd, getEditString(row, ItmDtlProcUpriCols.$i_itm_typ_d_cd));
		row.setStringNE(ItmDtlProcUpriCols.$i_itm_typ_d_nm, getEditString(row, ItmDtlProcUpriCols.$i_itm_typ_d_nm));
		row.setStringNE(ItmDtlProcUpriCols.$i_stk_mng_typ, getEditString(row, ItmDtlProcUpriCols.$i_stk_mng_typ));
		row.setStringNE(ItmDtlProcUpriCols.$i_asset_mng_typ, getEditString(row, ItmDtlProcUpriCols.$i_asset_mng_typ));
		row.setStringNE(ItmDtlProcUpriCols.$i_site_cd, getEditString(row, ItmDtlProcUpriCols.$i_site_cd));
		row.setStringNE(ItmDtlProcUpriCols.$i_site_nm, getEditString(row, ItmDtlProcUpriCols.$i_site_nm));
		row.setStringNE(ItmDtlProcUpriCols.$i_lg_grp_cd, getEditString(row, ItmDtlProcUpriCols.$i_lg_grp_cd));
		row.setStringNE(ItmDtlProcUpriCols.$i_lg_grp_nm, getEditString(row, ItmDtlProcUpriCols.$i_lg_grp_nm));
		row.setStringNE(ItmDtlProcUpriCols.$i_alloc_grp_cd, getEditString(row, ItmDtlProcUpriCols.$i_alloc_grp_cd));
		row.setStringNE(ItmDtlProcUpriCols.$i_alloc_grp_nm, getEditString(row, ItmDtlProcUpriCols.$i_alloc_grp_nm));
		row.setStringNE(ItmDtlProcUpriCols.$i_loc_grp_cd, getEditString(row, ItmDtlProcUpriCols.$i_loc_grp_cd));
		row.setStringNE(ItmDtlProcUpriCols.$i_loc_grp_nm, getEditString(row, ItmDtlProcUpriCols.$i_loc_grp_nm));
		row.setStringNE(ItmDtlProcUpriCols.$i_loc_mng_typ, getEditString(row, ItmDtlProcUpriCols.$i_loc_mng_typ));
		row.setStringNE(ItmDtlProcUpriCols.$i_sppl_cd, getEditString(row, ItmDtlProcUpriCols.$i_sppl_cd));
		row.setStringNE(ItmDtlProcUpriCols.$i_sppl_nm, getEditString(row, ItmDtlProcUpriCols.$i_sppl_nm));
		row.setStringNE(ItmDtlProcUpriCols.$i_ein, getEditString(row, ItmDtlProcUpriCols.$i_ein));
		row.setStringNE(ItmDtlProcUpriCols.$i_sppl_alt_nm1, getEditString(row, ItmDtlProcUpriCols.$i_sppl_alt_nm1));
		row.setStringNE(ItmDtlProcUpriCols.$i_sppl_alt_nm2, getEditString(row, ItmDtlProcUpriCols.$i_sppl_alt_nm2));
		row.setStringNE(ItmDtlProcUpriCols.$i_sppl_alt_nm3, getEditString(row, ItmDtlProcUpriCols.$i_sppl_alt_nm3));
		row.setStringNE(ItmDtlProcUpriCols.$i_sppl_alt_nm4, getEditString(row, ItmDtlProcUpriCols.$i_sppl_alt_nm4));
		row.setStringNE(ItmDtlProcUpriCols.$i_cntry_cd, getEditString(row, ItmDtlProcUpriCols.$i_cntry_cd));
		row.setStringNE(ItmDtlProcUpriCols.$i_cntry_nm, getEditString(row, ItmDtlProcUpriCols.$i_cntry_nm));
		row.setStringNE(ItmDtlProcUpriCols.$i_area_cd, getEditString(row, ItmDtlProcUpriCols.$i_area_cd));
		row.setStringNE(ItmDtlProcUpriCols.$i_area_nm, getEditString(row, ItmDtlProcUpriCols.$i_area_nm));
		row.setStringNE(ItmDtlProcUpriCols.$i_itm_grp_cd1, getEditString(row, ItmDtlProcUpriCols.$i_itm_grp_cd1));
		row.setStringNE(ItmDtlProcUpriCols.$i_itm_grp_cd2, getEditString(row, ItmDtlProcUpriCols.$i_itm_grp_cd2));
		row.setStringNE(ItmDtlProcUpriCols.$i_itm_grp_cd3, getEditString(row, ItmDtlProcUpriCols.$i_itm_grp_cd3));
		row.setStringNE(ItmDtlProcUpriCols.$i_itm_grp_cd4, getEditString(row, ItmDtlProcUpriCols.$i_itm_grp_cd4));
		row.setStringNE(ItmDtlProcUpriCols.$i_itm_grp_cd5, getEditString(row, ItmDtlProcUpriCols.$i_itm_grp_cd5));
		row.setStringNE(ItmDtlProcUpriCols.$i_itm_grp_cd6, getEditString(row, ItmDtlProcUpriCols.$i_itm_grp_cd6));
		row.setStringNE(ItmDtlProcUpriCols.$i_itm_grp_cd7, getEditString(row, ItmDtlProcUpriCols.$i_itm_grp_cd7));
		row.setStringNE(ItmDtlProcUpriCols.$i_itm_grp_cd8, getEditString(row, ItmDtlProcUpriCols.$i_itm_grp_cd8));
		row.setStringNE(ItmDtlProcUpriCols.$i_itm_grp_cd9, getEditString(row, ItmDtlProcUpriCols.$i_itm_grp_cd9));
		row.setStringNE(ItmDtlProcUpriCols.$i_itm_grp_cd10, getEditString(row, ItmDtlProcUpriCols.$i_itm_grp_cd10));
		row.setStringNE(ItmDtlProcUpriCols.$i_itm_grp_nm1, getEditString(row, ItmDtlProcUpriCols.$i_itm_grp_nm1));
		row.setStringNE(ItmDtlProcUpriCols.$i_itm_grp_nm2, getEditString(row, ItmDtlProcUpriCols.$i_itm_grp_nm2));
		row.setStringNE(ItmDtlProcUpriCols.$i_itm_grp_nm3, getEditString(row, ItmDtlProcUpriCols.$i_itm_grp_nm3));
		row.setStringNE(ItmDtlProcUpriCols.$i_itm_grp_nm4, getEditString(row, ItmDtlProcUpriCols.$i_itm_grp_nm4));
		row.setStringNE(ItmDtlProcUpriCols.$i_itm_grp_nm5, getEditString(row, ItmDtlProcUpriCols.$i_itm_grp_nm5));
		row.setStringNE(ItmDtlProcUpriCols.$i_itm_grp_nm6, getEditString(row, ItmDtlProcUpriCols.$i_itm_grp_nm6));
		row.setStringNE(ItmDtlProcUpriCols.$i_itm_grp_nm7, getEditString(row, ItmDtlProcUpriCols.$i_itm_grp_nm7));
		row.setStringNE(ItmDtlProcUpriCols.$i_itm_grp_nm8, getEditString(row, ItmDtlProcUpriCols.$i_itm_grp_nm8));
		row.setStringNE(ItmDtlProcUpriCols.$i_itm_grp_nm9, getEditString(row, ItmDtlProcUpriCols.$i_itm_grp_nm9));
		row.setStringNE(ItmDtlProcUpriCols.$i_itm_grp_nm10, getEditString(row, ItmDtlProcUpriCols.$i_itm_grp_nm10));
		row.setStringNE(ItmDtlProcUpriCols.$i_sppl_grp_cd1, getEditString(row, ItmDtlProcUpriCols.$i_sppl_grp_cd1));
		row.setStringNE(ItmDtlProcUpriCols.$i_sppl_grp_cd2, getEditString(row, ItmDtlProcUpriCols.$i_sppl_grp_cd2));
		row.setStringNE(ItmDtlProcUpriCols.$i_sppl_grp_cd3, getEditString(row, ItmDtlProcUpriCols.$i_sppl_grp_cd3));
		row.setStringNE(ItmDtlProcUpriCols.$i_sppl_grp_cd4, getEditString(row, ItmDtlProcUpriCols.$i_sppl_grp_cd4));
		row.setStringNE(ItmDtlProcUpriCols.$i_sppl_grp_cd5, getEditString(row, ItmDtlProcUpriCols.$i_sppl_grp_cd5));
		row.setStringNE(ItmDtlProcUpriCols.$i_sppl_grp_cd6, getEditString(row, ItmDtlProcUpriCols.$i_sppl_grp_cd6));
		row.setStringNE(ItmDtlProcUpriCols.$i_sppl_grp_cd7, getEditString(row, ItmDtlProcUpriCols.$i_sppl_grp_cd7));
		row.setStringNE(ItmDtlProcUpriCols.$i_sppl_grp_cd8, getEditString(row, ItmDtlProcUpriCols.$i_sppl_grp_cd8));
		row.setStringNE(ItmDtlProcUpriCols.$i_sppl_grp_cd9, getEditString(row, ItmDtlProcUpriCols.$i_sppl_grp_cd9));
		row.setStringNE(ItmDtlProcUpriCols.$i_sppl_grp_cd10, getEditString(row, ItmDtlProcUpriCols.$i_sppl_grp_cd10));
		row.setStringNE(ItmDtlProcUpriCols.$i_sppl_grp_nm1, getEditString(row, ItmDtlProcUpriCols.$i_sppl_grp_nm1));
		row.setStringNE(ItmDtlProcUpriCols.$i_sppl_grp_nm2, getEditString(row, ItmDtlProcUpriCols.$i_sppl_grp_nm2));
		row.setStringNE(ItmDtlProcUpriCols.$i_sppl_grp_nm3, getEditString(row, ItmDtlProcUpriCols.$i_sppl_grp_nm3));
		row.setStringNE(ItmDtlProcUpriCols.$i_sppl_grp_nm4, getEditString(row, ItmDtlProcUpriCols.$i_sppl_grp_nm4));
		row.setStringNE(ItmDtlProcUpriCols.$i_sppl_grp_nm5, getEditString(row, ItmDtlProcUpriCols.$i_sppl_grp_nm5));
		row.setStringNE(ItmDtlProcUpriCols.$i_sppl_grp_nm6, getEditString(row, ItmDtlProcUpriCols.$i_sppl_grp_nm6));
		row.setStringNE(ItmDtlProcUpriCols.$i_sppl_grp_nm7, getEditString(row, ItmDtlProcUpriCols.$i_sppl_grp_nm7));
		row.setStringNE(ItmDtlProcUpriCols.$i_sppl_grp_nm8, getEditString(row, ItmDtlProcUpriCols.$i_sppl_grp_nm8));
		row.setStringNE(ItmDtlProcUpriCols.$i_sppl_grp_nm9, getEditString(row, ItmDtlProcUpriCols.$i_sppl_grp_nm9));
		row.setStringNE(ItmDtlProcUpriCols.$i_sppl_grp_nm10, getEditString(row, ItmDtlProcUpriCols.$i_sppl_grp_nm10));
		row.setStringNE(ItmDtlProcUpriCols.$i_memo1, getEditString(row, ItmDtlProcUpriCols.$i_memo1));
		row.setStringNE(ItmDtlProcUpriCols.$i_memo2, getEditString(row, ItmDtlProcUpriCols.$i_memo2));
		row.setStringNE(ItmDtlProcUpriCols.$i_memo3, getEditString(row, ItmDtlProcUpriCols.$i_memo3));
		row.setStringNE("o_own_cntry_cd", MAUCL_AppSys.getCo().cntry_cd());
		if (row.getBooleanNE(ItmDtlProcUpriCols.$i_foreign_flg)) {
			// getCo(MCRow)と競合するため、MAUCL_AppSysをつける
			row.setStringNE("own_cntry_cd", MAUCL_AppSys.getCo().cntry_cd());
		}
	}

	@Override
	protected  MCList<?> getItmDtlProcUpri_AfterSelect(MCRow row, MCQueryApiBuilder builder, MAM_ITM_DTL_R t, MCList<?> result) {
		MCList<?> l = super.getItmDtlProcUpri_AfterSelect(row, builder, t, result);
		if (isInput(row)) {
			l = getItmDtl_NoDupList(row, result, l, ItmDtlProcUpriCols.$o_itm_cd,
					"MA.MAUAL0010.ItmDtlProcUpri");
		}
		// 区分名の設定
		l.addStringColumn(MAC_ITM_TYP.$NAME);
		l.addStringColumn(MAC_STK_MNG_TYP.$NAME);
		l.addStringColumn(MAC_ASSET_MNG_TYP.$NAME);
		l.addStringColumn(MAC_LOC_MNG_TYP.$NAME);
		MAC_ITM_TYP.putNameNE(l, MAC_ITM_TYP.$VALUE, MAC_ITM_TYP.$NAME);
		MAC_STK_MNG_TYP.putNameNE(l, MAC_STK_MNG_TYP.$VALUE, MAC_STK_MNG_TYP.$NAME);
		MAC_ASSET_MNG_TYP.putNameNE(l, MAC_ASSET_MNG_TYP.$VALUE, MAC_ASSET_MNG_TYP.$NAME);
		MAC_LOC_MNG_TYP.putNameNE(l, MAC_LOC_MNG_TYP.$VALUE, MAC_LOC_MNG_TYP.$NAME);
		return l;
	}

	// -- ItmDtlProcUpri:品目詳細（加工単価用） (END)

	// -- ItmDtlProcUpriSub1:品目詳細（加工単価用）（枝番１） (START)

	@Override
	public MCList<MCRow> getItmDtlProcUpriSub1(MCRow row) {
		if (isNull(row.getStringNE(ItmDtlProcUpriSub1Cols.$i_itm_cd))) {
			return null;
		}
		setDelFlgCtl(false);	//CONTEXTを設定、削除FLG=ONを対象とする
		setReleaseFlgCtl(false);	//CONTEXTを設定、リリースFLG=OFFを対象とする
		MCList<MAM_ITM_DTL_R> result = MCList.create(MAM_ITM_DTL_R.class);
		MAM_ITM_DTL_R t = MAM_ITM_DTL_R.create("T");
		MCQueryApiBuilder builder = MCQueryApiBuilder.create(t);
		getItmDtlProcUpriSub1_Set(row, builder, t, result);
		result = _itmDtlSelect.apply(row).apply(builder).apply(t).apply(result);
		MCList<? extends MCRow> down = getItmDtlProcUpriSub1_AfterSelect(row, builder, t, result);
		down = listlogicCommon_AfterSelect(row, result, down, "MA.MAUAL0010.ItmDtlProcUpriSub1");
		if (isNull(down)) return null;
		return getItmDtlProcUpriSub1_SubColumns(row, down);
	}

	@Override
	protected  void getItmDtlProcUpriSub1_Set(MCRow row, MCQueryApiBuilder builder, MAM_ITM_DTL_R t, MCList<?> result) {
		// out項目には存在するが、MAM_ITM_DTLに存在しない項目の追加
		result.addNumberColumn(ItmDtlProcUpriSub1Cols.$o_wtax_rate);
		result.addNumberColumn(ItmDtlProcUpriSub1Cols.$o_conts_qty);
		result.addNumberColumn(ItmDtlProcUpriSub1Cols.$o_pay_crryovr_times);
		result.addNumberColumn(ItmDtlProcUpriSub1Cols.$o_std_cont_fctr);
		result.addNumberColumn(ItmDtlProcUpriSub1Cols.$o_cont_fctr_dec_place);
		result.addNumberColumn(ItmDtlProcUpriSub1Cols.$o_dec_place);
		result.addNumberColumn(ItmDtlProcUpriSub1Cols.$o_dim);
		result.addNumberColumn(ItmDtlProcUpriSub1Cols.$o_wt);
		result.addNumberColumn(ItmDtlProcUpriSub1Cols.$o_rqmt_rstr_qty);
		result.addNumberColumn(ItmDtlProcUpriSub1Cols.$o_alloc_margin_days);
		result.addNumberColumn(ItmDtlProcUpriSub1Cols.$o_mrp_alloc_margin_days);
		result.addNumberColumn(ItmDtlProcUpriSub1Cols.$o_mrp_opn_xfr_days);
		result.addStringColumn(ItmDtlProcUpriSub1Cols.$o_itm_alt_nm1);
		result.addStringColumn(ItmDtlProcUpriSub1Cols.$o_itm_alt_nm2);
		result.addStringColumn(ItmDtlProcUpriSub1Cols.$o_itm_alt_nm3);
		result.addStringColumn(ItmDtlProcUpriSub1Cols.$o_itm_alt_nm4);
		result.addStringColumn(ItmDtlProcUpriSub1Cols.$o_itm_typ);
		result.addStringColumn(ItmDtlProcUpriSub1Cols.$o_itm_typ_d_cd);
		result.addStringColumn(ItmDtlProcUpriSub1Cols.$o_itm_typ_d_nm);
		result.addStringColumn(ItmDtlProcUpriSub1Cols.$o_stk_mng_typ);
		result.addStringColumn(ItmDtlProcUpriSub1Cols.$o_asset_mng_typ);
		result.addStringColumn(ItmDtlProcUpriSub1Cols.$o_purc_tax_cd);
		result.addStringColumn(ItmDtlProcUpriSub1Cols.$o_prov_tax_cd);
		result.addStringColumn(ItmDtlProcUpriSub1Cols.$o_zip_cd);
		result.addStringColumn(ItmDtlProcUpriSub1Cols.$o_addr1);
		result.addStringColumn(ItmDtlProcUpriSub1Cols.$o_addr2);
		result.addStringColumn(ItmDtlProcUpriSub1Cols.$o_addr3);
		result.addStringColumn(ItmDtlProcUpriSub1Cols.$o_addr4);
		result.addStringColumn(ItmDtlProcUpriSub1Cols.$o_tel);
		result.addStringColumn(ItmDtlProcUpriSub1Cols.$o_fax);
		result.addStringColumn(ItmDtlProcUpriSub1Cols.$o_cur_cd);
		result.addStringColumn(ItmDtlProcUpriSub1Cols.$o_cur_nm);
		result.addStringColumn(ItmDtlProcUpriSub1Cols.$o_cntry_cd);
		result.addStringColumn(ItmDtlProcUpriSub1Cols.$o_cntry_nm);
		result.addStringColumn(ItmDtlProcUpriSub1Cols.$o_area_cd);
		result.addStringColumn(ItmDtlProcUpriSub1Cols.$o_area_nm);
		result.addStringColumn(ItmDtlProcUpriSub1Cols.$o_asst_dpt_cd);
		result.addStringColumn(ItmDtlProcUpriSub1Cols.$o_sls_dpt_cd);
		result.addStringColumn(ItmDtlProcUpriSub1Cols.$o_site_cd);
		result.addStringColumn(ItmDtlProcUpriSub1Cols.$o_site_nm);
		result.addStringColumn(ItmDtlProcUpriSub1Cols.$o_lg_grp_cd);
		result.addStringColumn(ItmDtlProcUpriSub1Cols.$o_lg_grp_nm);
		result.addStringColumn(ItmDtlProcUpriSub1Cols.$o_loc_grp_cd);
		result.addStringColumn(ItmDtlProcUpriSub1Cols.$o_loc_grp_nm);
		result.addStringColumn(ItmDtlProcUpriSub1Cols.$o_alloc_grp_cd);
		result.addStringColumn(ItmDtlProcUpriSub1Cols.$o_alloc_grp_nm);
		result.addStringColumn(ItmDtlProcUpriSub1Cols.$o_loc_cal_cd);
		result.addStringColumn(ItmDtlProcUpriSub1Cols.$o_loc_mng_typ);
		result.addStringColumn(ItmDtlProcUpriSub1Cols.$o_rsrc_cd1);
		result.addStringColumn(ItmDtlProcUpriSub1Cols.$o_rsrc_cd2);
		result.addStringColumn(ItmDtlProcUpriSub1Cols.$o_prnt_lcl_cd);
		result.addStringColumn(ItmDtlProcUpriSub1Cols.$o_asppl_cd);
		result.addStringColumn(ItmDtlProcUpriSub1Cols.$o_vmi_purc_dpt_cd);
		result.addStringColumn(ItmDtlProcUpriSub1Cols.$o_mrkt_judg_role_cd);
		result.addStringColumn(ItmDtlProcUpriSub1Cols.$o_po_print_cd);
		result.addStringColumn(ItmDtlProcUpriSub1Cols.$o_sppl_ship_form_cd);
		result.addStringColumn(ItmDtlProcUpriSub1Cols.$o_sppl_cntct_dpt);
		result.addStringColumn(ItmDtlProcUpriSub1Cols.$o_sppl_cntct_psn);
		result.addStringColumn(ItmDtlProcUpriSub1Cols.$o_sppl_cntct_psn_title);
		result.addStringColumn(ItmDtlProcUpriSub1Cols.$o_purc_upri_req_typ);
		result.addStringColumn(ItmDtlProcUpriSub1Cols.$o_purc_amt_rnd_typ);
		result.addStringColumn(ItmDtlProcUpriSub1Cols.$o_purc_tax_rnd_typ);
		result.addStringColumn(ItmDtlProcUpriSub1Cols.$o_purc_tax_calc_typ);
		result.addStringColumn(ItmDtlProcUpriSub1Cols.$o_prov_rcv_typ);
		result.addStringColumn(ItmDtlProcUpriSub1Cols.$o_prov_basis_typ);
		result.addStringColumn(ItmDtlProcUpriSub1Cols.$o_prov_amt_rnd_typ);
		result.addStringColumn(ItmDtlProcUpriSub1Cols.$o_prov_tax_rnd_typ);
		result.addStringColumn(ItmDtlProcUpriSub1Cols.$o_prov_tax_calc_typ);
		result.addStringColumn(ItmDtlProcUpriSub1Cols.$o_sppl_cal_cd);
		result.addStringColumn(ItmDtlProcUpriSub1Cols.$o_sppl_tterm_cd1);
		result.addStringColumn(ItmDtlProcUpriSub1Cols.$o_sppl_tterm_cd2);
		result.addStringColumn(ItmDtlProcUpriSub1Cols.$o_sppl_tterm_cd3);
		result.addStringColumn(ItmDtlProcUpriSub1Cols.$o_unit_cd);
		result.addStringColumn(ItmDtlProcUpriSub1Cols.$o_unit_nm);
		result.addStringColumn(ItmDtlProcUpriSub1Cols.$o_rnd_typ);
		result.addStringColumn(ItmDtlProcUpriSub1Cols.$o_dim_unit_cd);
		result.addStringColumn(ItmDtlProcUpriSub1Cols.$o_wt_unit_cd);
		result.addStringColumn(ItmDtlProcUpriSub1Cols.$o_conts_unit_cd);
		result.addStringColumn(ItmDtlProcUpriSub1Cols.$o_hs_cd);
		result.addStringColumn(ItmDtlProcUpriSub1Cols.$o_itm_jnl_cd);
		result.addStringColumn(ItmDtlProcUpriSub1Cols.$o_ac_itm_grp_cd);
		result.addStringColumn(ItmDtlProcUpriSub1Cols.$o_ship_unit_cd);
		result.addStringColumn(ItmDtlProcUpriSub1Cols.$o_mfg_unit_cd);
		result.addStringColumn(ItmDtlProcUpriSub1Cols.$o_purc_unit_cd);
		result.addStringColumn(ItmDtlProcUpriSub1Cols.$o_pckg_unit_cd);
		result.addStringColumn(ItmDtlProcUpriSub1Cols.$o_lot_mng_typ);
		result.addStringColumn(ItmDtlProcUpriSub1Cols.$o_lot_no_typ);
		result.addStringColumn(ItmDtlProcUpriSub1Cols.$o_lot_no_ptn_cd);
		result.addStringColumn(ItmDtlProcUpriSub1Cols.$o_sublot_mng_typ);
		result.addStringColumn(ItmDtlProcUpriSub1Cols.$o_sublot_no_typ);
		result.addStringColumn(ItmDtlProcUpriSub1Cols.$o_sublot_no_ptn_cd);
		result.addStringColumn(ItmDtlProcUpriSub1Cols.$o_insp_bind_typ);
		result.addStringColumn(ItmDtlProcUpriSub1Cols.$o_lmt_ctl_categ);
		result.addStringColumn(ItmDtlProcUpriSub1Cols.$o_cont_fctr_unit_cd);
		result.addStringColumn(ItmDtlProcUpriSub1Cols.$o_cont_fctr_rnd_typ);
		result.addStringColumn(ItmDtlProcUpriSub1Cols.$o_sno1_mng_typ);
		result.addStringColumn(ItmDtlProcUpriSub1Cols.$o_sno1_num_typ);
		result.addStringColumn(ItmDtlProcUpriSub1Cols.$o_sno1_ptn_cd);
		result.addStringColumn(ItmDtlProcUpriSub1Cols.$o_sno2_mng_typ);
		result.addStringColumn(ItmDtlProcUpriSub1Cols.$o_sno2_num_typ);
		result.addStringColumn(ItmDtlProcUpriSub1Cols.$o_sno2_ptn_cd);
		result.addStringColumn(ItmDtlProcUpriSub1Cols.$o_sno3_mng_typ);
		result.addStringColumn(ItmDtlProcUpriSub1Cols.$o_sno3_num_typ);
		result.addStringColumn(ItmDtlProcUpriSub1Cols.$o_sno3_ptn_cd);
		result.addStringColumn(ItmDtlProcUpriSub1Cols.$o_sno4_mng_typ);
		result.addStringColumn(ItmDtlProcUpriSub1Cols.$o_sno4_num_typ);
		result.addStringColumn(ItmDtlProcUpriSub1Cols.$o_sno4_ptn_cd);
		result.addStringColumn(ItmDtlProcUpriSub1Cols.$o_mfg_inst_unit_typ);
		result.addStringColumn(ItmDtlProcUpriSub1Cols.$o_mrp_proc_typ);
		result.addStringColumn(ItmDtlProcUpriSub1Cols.$o_cntry_org_cd);
		result.addStringColumn(ItmDtlProcUpriSub1Cols.$o_comp_spec_typ);
		result.addStringColumn(ItmDtlProcUpriSub1Cols.$o_itm_spec_grp_cd);
		result.addStringColumn(ItmDtlProcUpriSub1Cols.$o_slo_proc_typ);
		result.addStringColumn(ItmDtlProcUpriSub1Cols.$o_ship_inst_typ);
		result.addStringColumn(ItmDtlProcUpriSub1Cols.$o_itm_ship_grp_cd);
		result.addStringColumn(ItmDtlProcUpriSub1Cols.$o_ship_valid_grp_cd);
		result.addStringColumn(ItmDtlProcUpriSub1Cols.$o_ship_term_cd);
		result.addStringColumn(ItmDtlProcUpriSub1Cols.$o_exim_xpns_typ);
		result.addBooleanColumn(ItmDtlProcUpriSub1Cols.$o_sundry_itm_flg);
		result.addBooleanColumn(ItmDtlProcUpriSub1Cols.$o_purc_upri_cng_flg);
		result.addBooleanColumn(ItmDtlProcUpriSub1Cols.$o_prov_upri_cng_flg);
		result.addBooleanColumn(ItmDtlProcUpriSub1Cols.$o_foreign_flg);
		result.addBooleanColumn(ItmDtlProcUpriSub1Cols.$o_lg_def_flg);
		result.addBooleanColumn(ItmDtlProcUpriSub1Cols.$o_pre_outsrc_act_flg);
		result.addBooleanColumn(ItmDtlProcUpriSub1Cols.$o_ddlv_prov_insp_flg);
		result.addBooleanColumn(ItmDtlProcUpriSub1Cols.$o_str_ln_tgt_flg);
		result.addBooleanColumn(ItmDtlProcUpriSub1Cols.$o_alloc_lmt_flg);
		result.addBooleanColumn(ItmDtlProcUpriSub1Cols.$o_gi_pack_xfer_flg);
		result.addBooleanColumn(ItmDtlProcUpriSub1Cols.$o_gi_vmi_flg);
		result.addBooleanColumn(ItmDtlProcUpriSub1Cols.$o_dscnt_itm_flg);
		result.addBooleanColumn(ItmDtlProcUpriSub1Cols.$o_minus_stk_flg);
		result.addBooleanColumn(ItmDtlProcUpriSub1Cols.$o_not_new_lot_flg);
		result.addBooleanColumn(ItmDtlProcUpriSub1Cols.$o_gi_alloc_flg);
		result.addBooleanColumn(ItmDtlProcUpriSub1Cols.$o_pack_alloc_flg);
		result.addBooleanColumn(ItmDtlProcUpriSub1Cols.$o_bp_lot_flg);
		result.addBooleanColumn(ItmDtlProcUpriSub1Cols.$o_skip_chk_ship_flg);
		result.addBooleanColumn(ItmDtlProcUpriSub1Cols.$o_mrkt_judg_flg);
		result.addBooleanColumn(ItmDtlProcUpriSub1Cols.$o_lmt_ctl_flg);
		result.addBooleanColumn(ItmDtlProcUpriSub1Cols.$o_cont_fctr_flg);
		result.addBooleanColumn(ItmDtlProcUpriSub1Cols.$o_slo_sno1_flg);
		result.addBooleanColumn(ItmDtlProcUpriSub1Cols.$o_rqmt_sno1_flg);
		result.addBooleanColumn(ItmDtlProcUpriSub1Cols.$o_slo_sno2_flg);
		result.addBooleanColumn(ItmDtlProcUpriSub1Cols.$o_rqmt_sno2_flg);
		result.addBooleanColumn(ItmDtlProcUpriSub1Cols.$o_slo_sno3_flg);
		result.addBooleanColumn(ItmDtlProcUpriSub1Cols.$o_rqmt_sno3_flg);
		result.addBooleanColumn(ItmDtlProcUpriSub1Cols.$o_slo_sno4_flg);
		result.addBooleanColumn(ItmDtlProcUpriSub1Cols.$o_rqmt_sno4_flg);
		result.addBooleanColumn(ItmDtlProcUpriSub1Cols.$o_inpt_itm_add_flg);
		result.addBooleanColumn(ItmDtlProcUpriSub1Cols.$o_inpt_itm_del_flg);
		result.addBooleanColumn(ItmDtlProcUpriSub1Cols.$o_sch_flg);
		result.addBooleanColumn(ItmDtlProcUpriSub1Cols.$o_comp_rev_at_slo_flg);
		result.addBooleanColumn(ItmDtlProcUpriSub1Cols.$o_comp_core_itm_flg);
		result.addBooleanColumn(ItmDtlProcUpriSub1Cols.$o_slo_proc_flg);
		result.addBooleanColumn(ItmDtlProcUpriSub1Cols.$o_ship_lot_back_stop_flg);
		result.addBooleanColumn(ItmDtlProcUpriSub1Cols.$o_arr_skip_flg);
		result.addBooleanColumn(ItmDtlProcUpriSub1Cols.$o_purc_dlv_slip_flg);
		result.addBooleanColumn(ItmDtlProcUpriSub1Cols.$o_stk_lst_flg);
		result.addBooleanColumn(ItmDtlProcUpriSub1Cols.$o_ver_flg);
		result.addBooleanColumn(ItmDtlProcUpriSub1Cols.$o_subcon_flg);
		result.addBooleanColumn(ItmDtlProcUpriSub1Cols.$o_wrk_po_flg);
		result.addBooleanColumn(ItmDtlProcUpriSub1Cols.$o_wrk_ap_flg);
		result.addBooleanColumn(ItmDtlProcUpriSub1Cols.$o_onr_prsppl_flg);
		result.addBooleanColumn(ItmDtlProcUpriSub1Cols.$o_sppl_iv_flg);
		result.addBooleanColumn(ItmDtlProcUpriSub1Cols.$o_prms_recv_flg);
		result.addBinaryColumn(ItmDtlProcUpriSub1Cols.$o_th_image);
		result.addBooleanColumn(_$mfg_flg);
		result.addBooleanColumn(_$purc_flg);
		result.addBooleanColumn(ItmDtlProcUpriSub1Cols.$i_outsrc_flg);
		result.addBooleanColumn(_$wg_xfr_flg);
		result.addBooleanColumn(_$asset_not_mng_flg);
		result.addBooleanColumn(ItmDtlProcUpriSub1Cols.$o_repurc_obli_flg);
		result.addStringColumn(ItmDtlProcUpriSub1Cols.$o_outsrc_upri_typ);

		// 外注ＦＬＧのみ、オンにする
		row.setBooleanNE(_$mfg_flg, false);
		row.setBooleanNE(_$purc_flg, false);
		row.setBooleanNE(ItmDtlProcUpriSub1Cols.$i_outsrc_flg, true);
		row.setBooleanNE(_$wg_xfr_flg, false);

		// 直接入力時
		if (isInput(row)) {
			// 入力された値で絞り込む
			row.setStringNE("itm_sub1", row.getStringNE($INPUT_VAL));
			return;
		}
	}

	@Override
	protected  MCList<?> getItmDtlProcUpriSub1_AfterSelect(MCRow row, MCQueryApiBuilder builder, MAM_ITM_DTL_R t, MCList<?> result) {
		MCList<?> l = super.getItmDtlProcUpriSub1_AfterSelect(row, builder, t, result);
		if (isInput(row) || isCombo(row)) {
			l = getItmDtl_NoDupList(row, result, l, ItmDtlCols.$o_itm_sub1, "MA.MAUAL0010.ItmDtlProcUpriSub1");
		}
		// 区分名の設定
		l.addStringColumn(MAC_ITM_TYP.$NAME);
		l.addStringColumn(MAC_STK_MNG_TYP.$NAME);
		l.addStringColumn(MAC_ASSET_MNG_TYP.$NAME);
		l.addStringColumn(MAC_LOC_MNG_TYP.$NAME);
		MAC_ITM_TYP.putNameNE(l, MAC_ITM_TYP.$VALUE, MAC_ITM_TYP.$NAME);
		MAC_STK_MNG_TYP.putNameNE(l, MAC_STK_MNG_TYP.$VALUE, MAC_STK_MNG_TYP.$NAME);
		MAC_ASSET_MNG_TYP.putNameNE(l, MAC_ASSET_MNG_TYP.$VALUE, MAC_ASSET_MNG_TYP.$NAME);
		MAC_LOC_MNG_TYP.putNameNE(l, MAC_LOC_MNG_TYP.$VALUE, MAC_LOC_MNG_TYP.$NAME);
		return l;
	}

	// -- ItmDtlProcUpriSub1:品目詳細（加工単価用）（枝番１） (END)

	// -- ItmDtlProcUpriSub2:品目詳細（加工単価用）（枝番２） (START)

	@Override
	public MCList<MCRow> getItmDtlProcUpriSub2(MCRow row) {
		if (isNull(row.getStringNE(ItmDtlProcUpriSub2Cols.$i_itm_cd))
				|| isNull(row.getStringNE(ItmDtlProcUpriSub2Cols.$i_itm_sub1))) {
			return null;
		}
		setDelFlgCtl(false);	//CONTEXTを設定、削除FLG=ONを対象とする
		setReleaseFlgCtl(false);	//CONTEXTを設定、リリースFLG=OFFを対象とする
		MCList<MAM_ITM_DTL_R> result = MCList.create(MAM_ITM_DTL_R.class);
		MAM_ITM_DTL_R t = MAM_ITM_DTL_R.create("T");
		MCQueryApiBuilder builder = MCQueryApiBuilder.create(t);
		getItmDtlProcUpriSub2_Set(row, builder, t, result);
		result = _itmDtlSelect.apply(row).apply(builder).apply(t).apply(result);
		MCList<? extends MCRow> down = getItmDtlProcUpriSub2_AfterSelect(row, builder, t, result);
		down = listlogicCommon_AfterSelect(row, result, down, "MA.MAUAL0010.ItmDtlProcUpriSub2");
		if (isNull(down)) return null;
		return getItmDtlProcUpriSub2_SubColumns(row, down);
	}

	@Override
	protected  void getItmDtlProcUpriSub2_Set(MCRow row, MCQueryApiBuilder builder, MAM_ITM_DTL_R t, MCList<?> result) {
		// out項目には存在するが、MAM_ITM_DTLに存在しない項目の追加
		result.addNumberColumn(ItmDtlProcUpriSub2Cols.$o_wtax_rate);
		result.addNumberColumn(ItmDtlProcUpriSub2Cols.$o_conts_qty);
		result.addNumberColumn(ItmDtlProcUpriSub2Cols.$o_pay_crryovr_times);
		result.addNumberColumn(ItmDtlProcUpriSub2Cols.$o_std_cont_fctr);
		result.addNumberColumn(ItmDtlProcUpriSub2Cols.$o_cont_fctr_dec_place);
		result.addNumberColumn(ItmDtlProcUpriSub2Cols.$o_dec_place);
		result.addNumberColumn(ItmDtlProcUpriSub2Cols.$o_dim);
		result.addNumberColumn(ItmDtlProcUpriSub2Cols.$o_wt);
		result.addNumberColumn(ItmDtlProcUpriSub2Cols.$o_rqmt_rstr_qty);
		result.addNumberColumn(ItmDtlProcUpriSub2Cols.$o_alloc_margin_days);
		result.addNumberColumn(ItmDtlProcUpriSub2Cols.$o_mrp_alloc_margin_days);
		result.addNumberColumn(ItmDtlProcUpriSub2Cols.$o_mrp_opn_xfr_days);
		result.addStringColumn(ItmDtlProcUpriSub2Cols.$o_itm_alt_nm1);
		result.addStringColumn(ItmDtlProcUpriSub2Cols.$o_itm_alt_nm2);
		result.addStringColumn(ItmDtlProcUpriSub2Cols.$o_itm_alt_nm3);
		result.addStringColumn(ItmDtlProcUpriSub2Cols.$o_itm_alt_nm4);
		result.addStringColumn(ItmDtlProcUpriSub2Cols.$o_itm_typ);
		result.addStringColumn(ItmDtlProcUpriSub2Cols.$o_itm_typ_d_cd);
		result.addStringColumn(ItmDtlProcUpriSub2Cols.$o_itm_typ_d_nm);
		result.addStringColumn(ItmDtlProcUpriSub2Cols.$o_stk_mng_typ);
		result.addStringColumn(ItmDtlProcUpriSub2Cols.$o_asset_mng_typ);
		result.addStringColumn(ItmDtlProcUpriSub2Cols.$o_purc_tax_cd);
		result.addStringColumn(ItmDtlProcUpriSub2Cols.$o_prov_tax_cd);
		result.addStringColumn(ItmDtlProcUpriSub2Cols.$o_zip_cd);
		result.addStringColumn(ItmDtlProcUpriSub2Cols.$o_addr1);
		result.addStringColumn(ItmDtlProcUpriSub2Cols.$o_addr2);
		result.addStringColumn(ItmDtlProcUpriSub2Cols.$o_addr3);
		result.addStringColumn(ItmDtlProcUpriSub2Cols.$o_addr4);
		result.addStringColumn(ItmDtlProcUpriSub2Cols.$o_tel);
		result.addStringColumn(ItmDtlProcUpriSub2Cols.$o_fax);
		result.addStringColumn(ItmDtlProcUpriSub2Cols.$o_cur_cd);
		result.addStringColumn(ItmDtlProcUpriSub2Cols.$o_cur_nm);
		result.addStringColumn(ItmDtlProcUpriSub2Cols.$o_cntry_cd);
		result.addStringColumn(ItmDtlProcUpriSub2Cols.$o_cntry_nm);
		result.addStringColumn(ItmDtlProcUpriSub2Cols.$o_area_cd);
		result.addStringColumn(ItmDtlProcUpriSub2Cols.$o_area_nm);
		result.addStringColumn(ItmDtlProcUpriSub2Cols.$o_asst_dpt_cd);
		result.addStringColumn(ItmDtlProcUpriSub2Cols.$o_sls_dpt_cd);
		result.addStringColumn(ItmDtlProcUpriSub2Cols.$o_site_cd);
		result.addStringColumn(ItmDtlProcUpriSub2Cols.$o_site_nm);
		result.addStringColumn(ItmDtlProcUpriSub2Cols.$o_lg_grp_cd);
		result.addStringColumn(ItmDtlProcUpriSub2Cols.$o_lg_grp_nm);
		result.addStringColumn(ItmDtlProcUpriSub2Cols.$o_loc_grp_cd);
		result.addStringColumn(ItmDtlProcUpriSub2Cols.$o_loc_grp_nm);
		result.addStringColumn(ItmDtlProcUpriSub2Cols.$o_alloc_grp_cd);
		result.addStringColumn(ItmDtlProcUpriSub2Cols.$o_alloc_grp_nm);
		result.addStringColumn(ItmDtlProcUpriSub2Cols.$o_loc_cal_cd);
		result.addStringColumn(ItmDtlProcUpriSub2Cols.$o_loc_mng_typ);
		result.addStringColumn(ItmDtlProcUpriSub2Cols.$o_rsrc_cd1);
		result.addStringColumn(ItmDtlProcUpriSub2Cols.$o_rsrc_cd2);
		result.addStringColumn(ItmDtlProcUpriSub2Cols.$o_prnt_lcl_cd);
		result.addStringColumn(ItmDtlProcUpriSub2Cols.$o_asppl_cd);
		result.addStringColumn(ItmDtlProcUpriSub2Cols.$o_vmi_purc_dpt_cd);
		result.addStringColumn(ItmDtlProcUpriSub2Cols.$o_mrkt_judg_role_cd);
		result.addStringColumn(ItmDtlProcUpriSub2Cols.$o_po_print_cd);
		result.addStringColumn(ItmDtlProcUpriSub2Cols.$o_sppl_ship_form_cd);
		result.addStringColumn(ItmDtlProcUpriSub2Cols.$o_sppl_cntct_dpt);
		result.addStringColumn(ItmDtlProcUpriSub2Cols.$o_sppl_cntct_psn);
		result.addStringColumn(ItmDtlProcUpriSub2Cols.$o_sppl_cntct_psn_title);
		result.addStringColumn(ItmDtlProcUpriSub2Cols.$o_purc_upri_req_typ);
		result.addStringColumn(ItmDtlProcUpriSub2Cols.$o_purc_amt_rnd_typ);
		result.addStringColumn(ItmDtlProcUpriSub2Cols.$o_purc_tax_rnd_typ);
		result.addStringColumn(ItmDtlProcUpriSub2Cols.$o_purc_tax_calc_typ);
		result.addStringColumn(ItmDtlProcUpriSub2Cols.$o_prov_rcv_typ);
		result.addStringColumn(ItmDtlProcUpriSub2Cols.$o_prov_basis_typ);
		result.addStringColumn(ItmDtlProcUpriSub2Cols.$o_prov_amt_rnd_typ);
		result.addStringColumn(ItmDtlProcUpriSub2Cols.$o_prov_tax_rnd_typ);
		result.addStringColumn(ItmDtlProcUpriSub2Cols.$o_prov_tax_calc_typ);
		result.addStringColumn(ItmDtlProcUpriSub2Cols.$o_sppl_cal_cd);
		result.addStringColumn(ItmDtlProcUpriSub2Cols.$o_sppl_tterm_cd1);
		result.addStringColumn(ItmDtlProcUpriSub2Cols.$o_sppl_tterm_cd2);
		result.addStringColumn(ItmDtlProcUpriSub2Cols.$o_sppl_tterm_cd3);
		result.addStringColumn(ItmDtlProcUpriSub2Cols.$o_unit_cd);
		result.addStringColumn(ItmDtlProcUpriSub2Cols.$o_unit_nm);
		result.addStringColumn(ItmDtlProcUpriSub2Cols.$o_rnd_typ);
		result.addStringColumn(ItmDtlProcUpriSub2Cols.$o_dim_unit_cd);
		result.addStringColumn(ItmDtlProcUpriSub2Cols.$o_wt_unit_cd);
		result.addStringColumn(ItmDtlProcUpriSub2Cols.$o_conts_unit_cd);
		result.addStringColumn(ItmDtlProcUpriSub2Cols.$o_hs_cd);
		result.addStringColumn(ItmDtlProcUpriSub2Cols.$o_itm_jnl_cd);
		result.addStringColumn(ItmDtlProcUpriSub2Cols.$o_ac_itm_grp_cd);
		result.addStringColumn(ItmDtlProcUpriSub2Cols.$o_ship_unit_cd);
		result.addStringColumn(ItmDtlProcUpriSub2Cols.$o_mfg_unit_cd);
		result.addStringColumn(ItmDtlProcUpriSub2Cols.$o_purc_unit_cd);
		result.addStringColumn(ItmDtlProcUpriSub2Cols.$o_pckg_unit_cd);
		result.addStringColumn(ItmDtlProcUpriSub2Cols.$o_lot_mng_typ);
		result.addStringColumn(ItmDtlProcUpriSub2Cols.$o_lot_no_typ);
		result.addStringColumn(ItmDtlProcUpriSub2Cols.$o_lot_no_ptn_cd);
		result.addStringColumn(ItmDtlProcUpriSub2Cols.$o_sublot_mng_typ);
		result.addStringColumn(ItmDtlProcUpriSub2Cols.$o_sublot_no_typ);
		result.addStringColumn(ItmDtlProcUpriSub2Cols.$o_sublot_no_ptn_cd);
		result.addStringColumn(ItmDtlProcUpriSub2Cols.$o_insp_bind_typ);
		result.addStringColumn(ItmDtlProcUpriSub2Cols.$o_lmt_ctl_categ);
		result.addStringColumn(ItmDtlProcUpriSub2Cols.$o_cont_fctr_unit_cd);
		result.addStringColumn(ItmDtlProcUpriSub2Cols.$o_cont_fctr_rnd_typ);
		result.addStringColumn(ItmDtlProcUpriSub2Cols.$o_sno1_mng_typ);
		result.addStringColumn(ItmDtlProcUpriSub2Cols.$o_sno1_num_typ);
		result.addStringColumn(ItmDtlProcUpriSub2Cols.$o_sno1_ptn_cd);
		result.addStringColumn(ItmDtlProcUpriSub2Cols.$o_sno2_mng_typ);
		result.addStringColumn(ItmDtlProcUpriSub2Cols.$o_sno2_num_typ);
		result.addStringColumn(ItmDtlProcUpriSub2Cols.$o_sno2_ptn_cd);
		result.addStringColumn(ItmDtlProcUpriSub2Cols.$o_sno3_mng_typ);
		result.addStringColumn(ItmDtlProcUpriSub2Cols.$o_sno3_num_typ);
		result.addStringColumn(ItmDtlProcUpriSub2Cols.$o_sno3_ptn_cd);
		result.addStringColumn(ItmDtlProcUpriSub2Cols.$o_sno4_mng_typ);
		result.addStringColumn(ItmDtlProcUpriSub2Cols.$o_sno4_num_typ);
		result.addStringColumn(ItmDtlProcUpriSub2Cols.$o_sno4_ptn_cd);
		result.addStringColumn(ItmDtlProcUpriSub2Cols.$o_mfg_inst_unit_typ);
		result.addStringColumn(ItmDtlProcUpriSub2Cols.$o_mrp_proc_typ);
		result.addStringColumn(ItmDtlProcUpriSub2Cols.$o_cntry_org_cd);
		result.addStringColumn(ItmDtlProcUpriSub2Cols.$o_comp_spec_typ);
		result.addStringColumn(ItmDtlProcUpriSub2Cols.$o_itm_spec_grp_cd);
		result.addStringColumn(ItmDtlProcUpriSub2Cols.$o_slo_proc_typ);
		result.addStringColumn(ItmDtlProcUpriSub2Cols.$o_ship_inst_typ);
		result.addStringColumn(ItmDtlProcUpriSub2Cols.$o_itm_ship_grp_cd);
		result.addStringColumn(ItmDtlProcUpriSub2Cols.$o_ship_valid_grp_cd);
		result.addStringColumn(ItmDtlProcUpriSub2Cols.$o_ship_term_cd);
		result.addStringColumn(ItmDtlProcUpriSub2Cols.$o_exim_xpns_typ);
		result.addBooleanColumn(ItmDtlProcUpriSub2Cols.$o_sundry_itm_flg);
		result.addBooleanColumn(ItmDtlProcUpriSub2Cols.$o_purc_upri_cng_flg);
		result.addBooleanColumn(ItmDtlProcUpriSub2Cols.$o_prov_upri_cng_flg);
		result.addBooleanColumn(ItmDtlProcUpriSub2Cols.$o_foreign_flg);
		result.addBooleanColumn(ItmDtlProcUpriSub2Cols.$o_lg_def_flg);
		result.addBooleanColumn(ItmDtlProcUpriSub2Cols.$o_pre_outsrc_act_flg);
		result.addBooleanColumn(ItmDtlProcUpriSub2Cols.$o_ddlv_prov_insp_flg);
		result.addBooleanColumn(ItmDtlProcUpriSub2Cols.$o_str_ln_tgt_flg);
		result.addBooleanColumn(ItmDtlProcUpriSub2Cols.$o_alloc_lmt_flg);
		result.addBooleanColumn(ItmDtlProcUpriSub2Cols.$o_gi_pack_xfer_flg);
		result.addBooleanColumn(ItmDtlProcUpriSub2Cols.$o_gi_vmi_flg);
		result.addBooleanColumn(ItmDtlProcUpriSub2Cols.$o_dscnt_itm_flg);
		result.addBooleanColumn(ItmDtlProcUpriSub2Cols.$o_minus_stk_flg);
		result.addBooleanColumn(ItmDtlProcUpriSub2Cols.$o_not_new_lot_flg);
		result.addBooleanColumn(ItmDtlProcUpriSub2Cols.$o_gi_alloc_flg);
		result.addBooleanColumn(ItmDtlProcUpriSub2Cols.$o_pack_alloc_flg);
		result.addBooleanColumn(ItmDtlProcUpriSub2Cols.$o_bp_lot_flg);
		result.addBooleanColumn(ItmDtlProcUpriSub2Cols.$o_skip_chk_ship_flg);
		result.addBooleanColumn(ItmDtlProcUpriSub2Cols.$o_mrkt_judg_flg);
		result.addBooleanColumn(ItmDtlProcUpriSub2Cols.$o_lmt_ctl_flg);
		result.addBooleanColumn(ItmDtlProcUpriSub2Cols.$o_cont_fctr_flg);
		result.addBooleanColumn(ItmDtlProcUpriSub2Cols.$o_slo_sno1_flg);
		result.addBooleanColumn(ItmDtlProcUpriSub2Cols.$o_rqmt_sno1_flg);
		result.addBooleanColumn(ItmDtlProcUpriSub2Cols.$o_slo_sno2_flg);
		result.addBooleanColumn(ItmDtlProcUpriSub2Cols.$o_rqmt_sno2_flg);
		result.addBooleanColumn(ItmDtlProcUpriSub2Cols.$o_slo_sno3_flg);
		result.addBooleanColumn(ItmDtlProcUpriSub2Cols.$o_rqmt_sno3_flg);
		result.addBooleanColumn(ItmDtlProcUpriSub2Cols.$o_slo_sno4_flg);
		result.addBooleanColumn(ItmDtlProcUpriSub2Cols.$o_rqmt_sno4_flg);
		result.addBooleanColumn(ItmDtlProcUpriSub2Cols.$o_inpt_itm_add_flg);
		result.addBooleanColumn(ItmDtlProcUpriSub2Cols.$o_inpt_itm_del_flg);
		result.addBooleanColumn(ItmDtlProcUpriSub2Cols.$o_sch_flg);
		result.addBooleanColumn(ItmDtlProcUpriSub2Cols.$o_comp_rev_at_slo_flg);
		result.addBooleanColumn(ItmDtlProcUpriSub2Cols.$o_comp_core_itm_flg);
		result.addBooleanColumn(ItmDtlProcUpriSub2Cols.$o_slo_proc_flg);
		result.addBooleanColumn(ItmDtlProcUpriSub2Cols.$o_ship_lot_back_stop_flg);
		result.addBooleanColumn(ItmDtlProcUpriSub2Cols.$o_arr_skip_flg);
		result.addBooleanColumn(ItmDtlProcUpriSub2Cols.$o_purc_dlv_slip_flg);
		result.addBooleanColumn(ItmDtlProcUpriSub2Cols.$o_stk_lst_flg);
		result.addBooleanColumn(ItmDtlProcUpriSub2Cols.$o_ver_flg);
		result.addBooleanColumn(ItmDtlProcUpriSub2Cols.$o_subcon_flg);
		result.addBooleanColumn(ItmDtlProcUpriSub2Cols.$o_wrk_po_flg);
		result.addBooleanColumn(ItmDtlProcUpriSub2Cols.$o_wrk_ap_flg);
		result.addBooleanColumn(ItmDtlProcUpriSub2Cols.$o_onr_prsppl_flg);
		result.addBooleanColumn(ItmDtlProcUpriSub2Cols.$o_sppl_iv_flg);
		result.addBooleanColumn(ItmDtlProcUpriSub2Cols.$o_prms_recv_flg);
		result.addBinaryColumn(ItmDtlProcUpriSub2Cols.$o_th_image);
		result.addBooleanColumn(_$mfg_flg);
		result.addBooleanColumn(_$purc_flg);
		result.addBooleanColumn(ItmDtlProcUpriSub2Cols.$i_outsrc_flg);
		result.addBooleanColumn(_$wg_xfr_flg);
		result.addBooleanColumn(_$asset_not_mng_flg);
		result.addBooleanColumn(ItmDtlProcUpriSub2Cols.$o_repurc_obli_flg);
		result.addStringColumn(ItmDtlProcUpriSub2Cols.$o_outsrc_upri_typ);

		// 外注ＦＬＧのみ、オンにする
		row.setBooleanNE(_$mfg_flg, false);
		row.setBooleanNE(_$purc_flg, false);
		row.setBooleanNE(ItmDtlProcUpriSub2Cols.$i_outsrc_flg, true);
		row.setBooleanNE(_$wg_xfr_flg, false);

		// 直接入力時
		if (isInput(row)) {
			// 入力された値で絞り込む
			row.setStringNE("itm_sub2", row.getStringNE($INPUT_VAL));
			return;
		}
	}

	@Override
	protected  MCList<?> getItmDtlProcUpriSub2_AfterSelect(MCRow row, MCQueryApiBuilder builder, MAM_ITM_DTL_R t, MCList<?> result) {
		MCList<?> l = super.getItmDtlProcUpriSub2_AfterSelect(row, builder, t, result);
		if (isInput(row) || isCombo(row)) {
			l = getItmDtl_NoDupList(row, result, l, ItmDtlCols.$o_itm_sub2, "MA.MAUAL0010.ItmDtlProcUpriSub2");
		}
		// 区分名の設定
		l.addStringColumn(MAC_ITM_TYP.$NAME);
		l.addStringColumn(MAC_STK_MNG_TYP.$NAME);
		l.addStringColumn(MAC_ASSET_MNG_TYP.$NAME);
		l.addStringColumn(MAC_LOC_MNG_TYP.$NAME);
		MAC_ITM_TYP.putNameNE(l, MAC_ITM_TYP.$VALUE, MAC_ITM_TYP.$NAME);
		MAC_STK_MNG_TYP.putNameNE(l, MAC_STK_MNG_TYP.$VALUE, MAC_STK_MNG_TYP.$NAME);
		MAC_ASSET_MNG_TYP.putNameNE(l, MAC_ASSET_MNG_TYP.$VALUE, MAC_ASSET_MNG_TYP.$NAME);
		MAC_LOC_MNG_TYP.putNameNE(l, MAC_LOC_MNG_TYP.$VALUE, MAC_LOC_MNG_TYP.$NAME);
		return l;
	}

	// -- ItmDtlProcUpriSub2:品目詳細（加工単価用）（枝番２） (END)

	// -- ItmDtlProcUpriSub3:品目詳細（加工単価用）（枝番３） (START)

	@Override
	public MCList<MCRow> getItmDtlProcUpriSub3(MCRow row) {
		if (isNull(row.getStringNE(ItmDtlProcUpriSub3Cols.$i_itm_cd))
				|| isNull(row.getStringNE(ItmDtlProcUpriSub3Cols.$i_itm_sub1))
				|| isNull(row.getStringNE(ItmDtlProcUpriSub3Cols.$i_itm_sub2))) {
			return null;
		}
		setDelFlgCtl(false);	//CONTEXTを設定、削除FLG=ONを対象とする
		setReleaseFlgCtl(false);	//CONTEXTを設定、リリースFLG=OFFを対象とする
		MCList<MAM_ITM_DTL_R> result = MCList.create(MAM_ITM_DTL_R.class);
		MAM_ITM_DTL_R t = MAM_ITM_DTL_R.create("T");
		MCQueryApiBuilder builder = MCQueryApiBuilder.create(t);
		getItmDtlProcUpriSub3_Set(row, builder, t, result);
		result = _itmDtlSelect.apply(row).apply(builder).apply(t).apply(result);
		MCList<? extends MCRow> down = getItmDtlProcUpriSub3_AfterSelect(row, builder, t, result);
		down = listlogicCommon_AfterSelect(row, result, down, "MA.MAUAL0010.ItmDtlProcUpriSub3");
		if (isNull(down)) return null;
		return getItmDtlProcUpriSub3_SubColumns(row, down);
	}

	@Override
	protected  void getItmDtlProcUpriSub3_Set(MCRow row, MCQueryApiBuilder builder, MAM_ITM_DTL_R t, MCList<?> result) {
		// out項目には存在するが、MAM_ITM_DTLに存在しない項目の追加
		result.addNumberColumn(ItmDtlProcUpriSub3Cols.$o_wtax_rate);
		result.addNumberColumn(ItmDtlProcUpriSub3Cols.$o_conts_qty);
		result.addNumberColumn(ItmDtlProcUpriSub3Cols.$o_pay_crryovr_times);
		result.addNumberColumn(ItmDtlProcUpriSub3Cols.$o_std_cont_fctr);
		result.addNumberColumn(ItmDtlProcUpriSub3Cols.$o_cont_fctr_dec_place);
		result.addNumberColumn(ItmDtlProcUpriSub3Cols.$o_dec_place);
		result.addNumberColumn(ItmDtlProcUpriSub3Cols.$o_dim);
		result.addNumberColumn(ItmDtlProcUpriSub3Cols.$o_wt);
		result.addNumberColumn(ItmDtlProcUpriSub3Cols.$o_rqmt_rstr_qty);
		result.addNumberColumn(ItmDtlProcUpriSub3Cols.$o_alloc_margin_days);
		result.addNumberColumn(ItmDtlProcUpriSub3Cols.$o_mrp_alloc_margin_days);
		result.addNumberColumn(ItmDtlProcUpriSub3Cols.$o_mrp_opn_xfr_days);
		result.addStringColumn(ItmDtlProcUpriSub3Cols.$o_itm_alt_nm1);
		result.addStringColumn(ItmDtlProcUpriSub3Cols.$o_itm_alt_nm2);
		result.addStringColumn(ItmDtlProcUpriSub3Cols.$o_itm_alt_nm3);
		result.addStringColumn(ItmDtlProcUpriSub3Cols.$o_itm_alt_nm4);
		result.addStringColumn(ItmDtlProcUpriSub3Cols.$o_itm_typ);
		result.addStringColumn(ItmDtlProcUpriSub3Cols.$o_itm_typ_d_cd);
		result.addStringColumn(ItmDtlProcUpriSub3Cols.$o_itm_typ_d_nm);
		result.addStringColumn(ItmDtlProcUpriSub3Cols.$o_stk_mng_typ);
		result.addStringColumn(ItmDtlProcUpriSub3Cols.$o_asset_mng_typ);
		result.addStringColumn(ItmDtlProcUpriSub3Cols.$o_purc_tax_cd);
		result.addStringColumn(ItmDtlProcUpriSub3Cols.$o_prov_tax_cd);
		result.addStringColumn(ItmDtlProcUpriSub3Cols.$o_zip_cd);
		result.addStringColumn(ItmDtlProcUpriSub3Cols.$o_addr1);
		result.addStringColumn(ItmDtlProcUpriSub3Cols.$o_addr2);
		result.addStringColumn(ItmDtlProcUpriSub3Cols.$o_addr3);
		result.addStringColumn(ItmDtlProcUpriSub3Cols.$o_addr4);
		result.addStringColumn(ItmDtlProcUpriSub3Cols.$o_tel);
		result.addStringColumn(ItmDtlProcUpriSub3Cols.$o_fax);
		result.addStringColumn(ItmDtlProcUpriSub3Cols.$o_cur_cd);
		result.addStringColumn(ItmDtlProcUpriSub3Cols.$o_cur_nm);
		result.addStringColumn(ItmDtlProcUpriSub3Cols.$o_cntry_cd);
		result.addStringColumn(ItmDtlProcUpriSub3Cols.$o_cntry_nm);
		result.addStringColumn(ItmDtlProcUpriSub3Cols.$o_area_cd);
		result.addStringColumn(ItmDtlProcUpriSub3Cols.$o_area_nm);
		result.addStringColumn(ItmDtlProcUpriSub3Cols.$o_asst_dpt_cd);
		result.addStringColumn(ItmDtlProcUpriSub3Cols.$o_sls_dpt_cd);
		result.addStringColumn(ItmDtlProcUpriSub3Cols.$o_site_cd);
		result.addStringColumn(ItmDtlProcUpriSub3Cols.$o_site_nm);
		result.addStringColumn(ItmDtlProcUpriSub3Cols.$o_lg_grp_cd);
		result.addStringColumn(ItmDtlProcUpriSub3Cols.$o_lg_grp_nm);
		result.addStringColumn(ItmDtlProcUpriSub3Cols.$o_loc_grp_cd);
		result.addStringColumn(ItmDtlProcUpriSub3Cols.$o_loc_grp_nm);
		result.addStringColumn(ItmDtlProcUpriSub3Cols.$o_alloc_grp_cd);
		result.addStringColumn(ItmDtlProcUpriSub3Cols.$o_alloc_grp_nm);
		result.addStringColumn(ItmDtlProcUpriSub3Cols.$o_loc_cal_cd);
		result.addStringColumn(ItmDtlProcUpriSub3Cols.$o_loc_mng_typ);
		result.addStringColumn(ItmDtlProcUpriSub3Cols.$o_rsrc_cd1);
		result.addStringColumn(ItmDtlProcUpriSub3Cols.$o_rsrc_cd2);
		result.addStringColumn(ItmDtlProcUpriSub3Cols.$o_prnt_lcl_cd);
		result.addStringColumn(ItmDtlProcUpriSub3Cols.$o_asppl_cd);
		result.addStringColumn(ItmDtlProcUpriSub3Cols.$o_vmi_purc_dpt_cd);
		result.addStringColumn(ItmDtlProcUpriSub3Cols.$o_mrkt_judg_role_cd);
		result.addStringColumn(ItmDtlProcUpriSub3Cols.$o_po_print_cd);
		result.addStringColumn(ItmDtlProcUpriSub3Cols.$o_sppl_ship_form_cd);
		result.addStringColumn(ItmDtlProcUpriSub3Cols.$o_sppl_cntct_dpt);
		result.addStringColumn(ItmDtlProcUpriSub3Cols.$o_sppl_cntct_psn);
		result.addStringColumn(ItmDtlProcUpriSub3Cols.$o_sppl_cntct_psn_title);
		result.addStringColumn(ItmDtlProcUpriSub3Cols.$o_purc_upri_req_typ);
		result.addStringColumn(ItmDtlProcUpriSub3Cols.$o_purc_amt_rnd_typ);
		result.addStringColumn(ItmDtlProcUpriSub3Cols.$o_purc_tax_rnd_typ);
		result.addStringColumn(ItmDtlProcUpriSub3Cols.$o_purc_tax_calc_typ);
		result.addStringColumn(ItmDtlProcUpriSub3Cols.$o_prov_rcv_typ);
		result.addStringColumn(ItmDtlProcUpriSub3Cols.$o_prov_basis_typ);
		result.addStringColumn(ItmDtlProcUpriSub3Cols.$o_prov_amt_rnd_typ);
		result.addStringColumn(ItmDtlProcUpriSub3Cols.$o_prov_tax_rnd_typ);
		result.addStringColumn(ItmDtlProcUpriSub3Cols.$o_prov_tax_calc_typ);
		result.addStringColumn(ItmDtlProcUpriSub3Cols.$o_sppl_cal_cd);
		result.addStringColumn(ItmDtlProcUpriSub3Cols.$o_sppl_tterm_cd1);
		result.addStringColumn(ItmDtlProcUpriSub3Cols.$o_sppl_tterm_cd2);
		result.addStringColumn(ItmDtlProcUpriSub3Cols.$o_sppl_tterm_cd3);
		result.addStringColumn(ItmDtlProcUpriSub3Cols.$o_unit_cd);
		result.addStringColumn(ItmDtlProcUpriSub3Cols.$o_unit_nm);
		result.addStringColumn(ItmDtlProcUpriSub3Cols.$o_rnd_typ);
		result.addStringColumn(ItmDtlProcUpriSub3Cols.$o_dim_unit_cd);
		result.addStringColumn(ItmDtlProcUpriSub3Cols.$o_wt_unit_cd);
		result.addStringColumn(ItmDtlProcUpriSub3Cols.$o_conts_unit_cd);
		result.addStringColumn(ItmDtlProcUpriSub3Cols.$o_hs_cd);
		result.addStringColumn(ItmDtlProcUpriSub3Cols.$o_itm_jnl_cd);
		result.addStringColumn(ItmDtlProcUpriSub3Cols.$o_ac_itm_grp_cd);
		result.addStringColumn(ItmDtlProcUpriSub3Cols.$o_ship_unit_cd);
		result.addStringColumn(ItmDtlProcUpriSub3Cols.$o_mfg_unit_cd);
		result.addStringColumn(ItmDtlProcUpriSub3Cols.$o_purc_unit_cd);
		result.addStringColumn(ItmDtlProcUpriSub3Cols.$o_pckg_unit_cd);
		result.addStringColumn(ItmDtlProcUpriSub3Cols.$o_lot_mng_typ);
		result.addStringColumn(ItmDtlProcUpriSub3Cols.$o_lot_no_typ);
		result.addStringColumn(ItmDtlProcUpriSub3Cols.$o_lot_no_ptn_cd);
		result.addStringColumn(ItmDtlProcUpriSub3Cols.$o_sublot_mng_typ);
		result.addStringColumn(ItmDtlProcUpriSub3Cols.$o_sublot_no_typ);
		result.addStringColumn(ItmDtlProcUpriSub3Cols.$o_sublot_no_ptn_cd);
		result.addStringColumn(ItmDtlProcUpriSub3Cols.$o_insp_bind_typ);
		result.addStringColumn(ItmDtlProcUpriSub3Cols.$o_lmt_ctl_categ);
		result.addStringColumn(ItmDtlProcUpriSub3Cols.$o_cont_fctr_unit_cd);
		result.addStringColumn(ItmDtlProcUpriSub3Cols.$o_cont_fctr_rnd_typ);
		result.addStringColumn(ItmDtlProcUpriSub3Cols.$o_sno1_mng_typ);
		result.addStringColumn(ItmDtlProcUpriSub3Cols.$o_sno1_num_typ);
		result.addStringColumn(ItmDtlProcUpriSub3Cols.$o_sno1_ptn_cd);
		result.addStringColumn(ItmDtlProcUpriSub3Cols.$o_sno2_mng_typ);
		result.addStringColumn(ItmDtlProcUpriSub3Cols.$o_sno2_num_typ);
		result.addStringColumn(ItmDtlProcUpriSub3Cols.$o_sno2_ptn_cd);
		result.addStringColumn(ItmDtlProcUpriSub3Cols.$o_sno3_mng_typ);
		result.addStringColumn(ItmDtlProcUpriSub3Cols.$o_sno3_num_typ);
		result.addStringColumn(ItmDtlProcUpriSub3Cols.$o_sno3_ptn_cd);
		result.addStringColumn(ItmDtlProcUpriSub3Cols.$o_sno4_mng_typ);
		result.addStringColumn(ItmDtlProcUpriSub3Cols.$o_sno4_num_typ);
		result.addStringColumn(ItmDtlProcUpriSub3Cols.$o_sno4_ptn_cd);
		result.addStringColumn(ItmDtlProcUpriSub3Cols.$o_mfg_inst_unit_typ);
		result.addStringColumn(ItmDtlProcUpriSub3Cols.$o_mrp_proc_typ);
		result.addStringColumn(ItmDtlProcUpriSub3Cols.$o_cntry_org_cd);
		result.addStringColumn(ItmDtlProcUpriSub3Cols.$o_comp_spec_typ);
		result.addStringColumn(ItmDtlProcUpriSub3Cols.$o_itm_spec_grp_cd);
		result.addStringColumn(ItmDtlProcUpriSub3Cols.$o_slo_proc_typ);
		result.addStringColumn(ItmDtlProcUpriSub3Cols.$o_ship_inst_typ);
		result.addStringColumn(ItmDtlProcUpriSub3Cols.$o_itm_ship_grp_cd);
		result.addStringColumn(ItmDtlProcUpriSub3Cols.$o_ship_valid_grp_cd);
		result.addStringColumn(ItmDtlProcUpriSub3Cols.$o_ship_term_cd);
		result.addStringColumn(ItmDtlProcUpriSub3Cols.$o_exim_xpns_typ);
		result.addBooleanColumn(ItmDtlProcUpriSub3Cols.$o_sundry_itm_flg);
		result.addBooleanColumn(ItmDtlProcUpriSub3Cols.$o_purc_upri_cng_flg);
		result.addBooleanColumn(ItmDtlProcUpriSub3Cols.$o_prov_upri_cng_flg);
		result.addBooleanColumn(ItmDtlProcUpriSub3Cols.$o_foreign_flg);
		result.addBooleanColumn(ItmDtlProcUpriSub3Cols.$o_lg_def_flg);
		result.addBooleanColumn(ItmDtlProcUpriSub3Cols.$o_pre_outsrc_act_flg);
		result.addBooleanColumn(ItmDtlProcUpriSub3Cols.$o_ddlv_prov_insp_flg);
		result.addBooleanColumn(ItmDtlProcUpriSub3Cols.$o_str_ln_tgt_flg);
		result.addBooleanColumn(ItmDtlProcUpriSub3Cols.$o_alloc_lmt_flg);
		result.addBooleanColumn(ItmDtlProcUpriSub3Cols.$o_gi_pack_xfer_flg);
		result.addBooleanColumn(ItmDtlProcUpriSub3Cols.$o_gi_vmi_flg);
		result.addBooleanColumn(ItmDtlProcUpriSub3Cols.$o_dscnt_itm_flg);
		result.addBooleanColumn(ItmDtlProcUpriSub3Cols.$o_minus_stk_flg);
		result.addBooleanColumn(ItmDtlProcUpriSub3Cols.$o_not_new_lot_flg);
		result.addBooleanColumn(ItmDtlProcUpriSub3Cols.$o_gi_alloc_flg);
		result.addBooleanColumn(ItmDtlProcUpriSub3Cols.$o_pack_alloc_flg);
		result.addBooleanColumn(ItmDtlProcUpriSub3Cols.$o_bp_lot_flg);
		result.addBooleanColumn(ItmDtlProcUpriSub3Cols.$o_skip_chk_ship_flg);
		result.addBooleanColumn(ItmDtlProcUpriSub3Cols.$o_mrkt_judg_flg);
		result.addBooleanColumn(ItmDtlProcUpriSub3Cols.$o_lmt_ctl_flg);
		result.addBooleanColumn(ItmDtlProcUpriSub3Cols.$o_cont_fctr_flg);
		result.addBooleanColumn(ItmDtlProcUpriSub3Cols.$o_slo_sno1_flg);
		result.addBooleanColumn(ItmDtlProcUpriSub3Cols.$o_rqmt_sno1_flg);
		result.addBooleanColumn(ItmDtlProcUpriSub3Cols.$o_slo_sno2_flg);
		result.addBooleanColumn(ItmDtlProcUpriSub3Cols.$o_rqmt_sno2_flg);
		result.addBooleanColumn(ItmDtlProcUpriSub3Cols.$o_slo_sno3_flg);
		result.addBooleanColumn(ItmDtlProcUpriSub3Cols.$o_rqmt_sno3_flg);
		result.addBooleanColumn(ItmDtlProcUpriSub3Cols.$o_slo_sno4_flg);
		result.addBooleanColumn(ItmDtlProcUpriSub3Cols.$o_rqmt_sno4_flg);
		result.addBooleanColumn(ItmDtlProcUpriSub3Cols.$o_inpt_itm_add_flg);
		result.addBooleanColumn(ItmDtlProcUpriSub3Cols.$o_inpt_itm_del_flg);
		result.addBooleanColumn(ItmDtlProcUpriSub3Cols.$o_sch_flg);
		result.addBooleanColumn(ItmDtlProcUpriSub3Cols.$o_comp_rev_at_slo_flg);
		result.addBooleanColumn(ItmDtlProcUpriSub3Cols.$o_comp_core_itm_flg);
		result.addBooleanColumn(ItmDtlProcUpriSub3Cols.$o_slo_proc_flg);
		result.addBooleanColumn(ItmDtlProcUpriSub3Cols.$o_ship_lot_back_stop_flg);
		result.addBooleanColumn(ItmDtlProcUpriSub3Cols.$o_arr_skip_flg);
		result.addBooleanColumn(ItmDtlProcUpriSub3Cols.$o_purc_dlv_slip_flg);
		result.addBooleanColumn(ItmDtlProcUpriSub3Cols.$o_stk_lst_flg);
		result.addBooleanColumn(ItmDtlProcUpriSub3Cols.$o_ver_flg);
		result.addBooleanColumn(ItmDtlProcUpriSub3Cols.$o_subcon_flg);
		result.addBooleanColumn(ItmDtlProcUpriSub3Cols.$o_wrk_po_flg);
		result.addBooleanColumn(ItmDtlProcUpriSub3Cols.$o_wrk_ap_flg);
		result.addBooleanColumn(ItmDtlProcUpriSub3Cols.$o_onr_prsppl_flg);
		result.addBooleanColumn(ItmDtlProcUpriSub3Cols.$o_sppl_iv_flg);
		result.addBooleanColumn(ItmDtlProcUpriSub3Cols.$o_prms_recv_flg);
		result.addBinaryColumn(ItmDtlProcUpriSub3Cols.$o_th_image);
		result.addBooleanColumn(_$mfg_flg);
		result.addBooleanColumn(_$purc_flg);
		result.addBooleanColumn(ItmDtlProcUpriSub3Cols.$i_outsrc_flg);
		result.addBooleanColumn(_$wg_xfr_flg);
		result.addBooleanColumn(_$asset_not_mng_flg);
		result.addBooleanColumn(ItmDtlProcUpriSub3Cols.$o_repurc_obli_flg);
		result.addStringColumn(ItmDtlProcUpriSub3Cols.$o_outsrc_upri_typ);

		// 外注ＦＬＧのみ、オンにする
		row.setBooleanNE(_$mfg_flg, false);
		row.setBooleanNE(_$purc_flg, false);
		row.setBooleanNE(ItmDtlProcUpriSub3Cols.$i_outsrc_flg, true);
		row.setBooleanNE(_$wg_xfr_flg, false);
		
		// 直接入力時
		if (isInput(row)) {
			// 入力された値で絞り込む
			row.setStringNE("itm_sub3", row.getStringNE($INPUT_VAL));
			return;
		}
	}

	@Override
	protected  MCList<?> getItmDtlProcUpriSub3_AfterSelect(MCRow row, MCQueryApiBuilder builder, MAM_ITM_DTL_R t, MCList<?> result) {
		MCList<?> l = super.getItmDtlProcUpriSub3_AfterSelect(row, builder, t, result);
		if (isInput(row) || isCombo(row)) {
			l = getItmDtl_NoDupList(row, result, l, ItmDtlProcUpriSub1Cols.$o_itm_sub3, "MA.MAUAL0010.ItmDtlProcUpriSub3");
		}
		// 区分名の設定
		l.addStringColumn(MAC_ITM_TYP.$NAME);
		l.addStringColumn(MAC_STK_MNG_TYP.$NAME);
		l.addStringColumn(MAC_ASSET_MNG_TYP.$NAME);
		l.addStringColumn(MAC_LOC_MNG_TYP.$NAME);
		MAC_ITM_TYP.putNameNE(l, MAC_ITM_TYP.$VALUE, MAC_ITM_TYP.$NAME);
		MAC_STK_MNG_TYP.putNameNE(l, MAC_STK_MNG_TYP.$VALUE, MAC_STK_MNG_TYP.$NAME);
		MAC_ASSET_MNG_TYP.putNameNE(l, MAC_ASSET_MNG_TYP.$VALUE, MAC_ASSET_MNG_TYP.$NAME);
		MAC_LOC_MNG_TYP.putNameNE(l, MAC_LOC_MNG_TYP.$VALUE, MAC_LOC_MNG_TYP.$NAME);
		return l;
	}

	// -- ItmDtlProcUpriSub3:品目詳細（枝番３） (END)

	/**
	 * 論理削除フラグ制御のオン・オフを設定します。<p>
	 * @param flg 論理削除フラグ制御のオン・オフ<p>
	 */
	protected void setDelFlgCtl(boolean flg) {
		
		String tgtid = "MAPA_CONTEXT$SET_DEL_FLG_CTL";
		String bind = "del_flg_ctl";
		MCRow r = MCRow.create();
		
		r.addStringColumn(bind, MCBooleanUtil.booleanToDBString(flg));
		execProc(createSqlId("MAUAL0010", tgtid, "MAUAL_ListItmDtl_setDelFlgCtl") ,
				tgtid, r, ":" + bind);
	}

	/**
	 * リリースフラグ制御のオン・オフを設定します。<p>
	 * @param flg リリースフラグ制御のオン・オフ<p>
	 */
	protected void setReleaseFlgCtl(boolean flg) {
		
		String tgtid = "MAPA_CONTEXT$SET_RELEASE_FLG_CTL";
		String bind = "release_flg_ctl";
		
		MCRow r = MCRow.create();
		r.addStringColumn(bind, MCBooleanUtil.booleanToDBString(flg));
		execProc(createSqlId("MAUAL0010", tgtid, "MAUAL_ListItmDtl_setReleaseFlgCtl") ,
				tgtid, r, ":" + bind);
	}

	/**
	 * 検索結果に対象カラムの値が重複するレコードが存在している場合、
	 * 「入力条件によって一意に定まる項目のカラムと対象カラム」以外にnullをセットした上で、重複レコードを１つにまとめたリストを返します。
	 * 重複がないレコードには何もしません。
	 *
	 * @param row 検索条件
	 * @param d DBコンテナ
	 * @param sl 検索結果
	 * @param tarCol 対象カラム（String型データに限る）
	 * @param listLogicId　リストロジックＩＤ
	 * @return 検索結果から重複を除いたリスト
	 */
	protected  MCList<?> getItmDtl_NoDupList(
			MCRow row, MCList<?> result, MCList sl, String tarCol, String listLogicId) {
		if (sl.size() < 2) {
			return sl;
		}
		
		// キーカラムセット
		final String[] chkCols = {
				"itm_cd", "itm_sub1", "itm_sub2", "itm_sub3",
				"wg_cd",
				"mfg_loc_cd", "sppl_cd", "rqst_loc_cd"
		};
		
		// Itmのメソッドを共用
		return getItm_NoDupListSub(row, result, sl, tarCol, listLogicId, chkCols);
	}

}
