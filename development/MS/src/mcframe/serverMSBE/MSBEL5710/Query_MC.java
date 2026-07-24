package mcframe.serverMSBE.MSBEL5710;

import mcframe.commonCore.lang.MCNumber;
import mcframe.commonCore.lang.MCDate;
import mcframe.commonCore.lang.MCTimestamp;

import mcframe.serverCore.cache.MCJoinerList;

import static mcframe.commonCore.util.MCCollectionUtil.*;
import static mcframe.serverCore.cache.MCJoinerList.*;
import static mcframe.serverCore.queryapi.IFMCSQL.*;
import static mcframe.serverCore.queryapi.MCQueryExecution.*;

import mcframe.commonMA.constant.*;
import mcframe.commonMB.constant.*;
import mcframe.commonMS.constant.*;
import mcframe.serverCore.dbc.*;
import mcframe.serverMA.dbc.*;
import mcframe.serverMB.dbc.*;
import mcframe.serverPF.dbc.*;
import mcframe.serverMS.dbc.*;

import static mcframe.serverCore.dbc.CoreFunction.*;
import static mcframe.serverMA.dbc.MAFunction.*;
import static mcframe.serverMA.dbc.MABCFunction.*;
import static mcframe.serverMA.dbc.MABGFunction.*;
import static mcframe.serverMA.dbc.MABSFunction.*;
import static mcframe.serverMA.dbc.MAUAFunction.*;
import static mcframe.serverMB.dbc.MBBAFunction.*;
import static mcframe.serverMB.dbc.MBBBFunction.*;
import static mcframe.serverMB.dbc.MBBEFunction.*;
import static mcframe.serverPF.dbc.PFFunction.*;
import static mcframe.serverMS.dbc.MSFunction.*;
import static mcframe.serverMS.dbc.MSBBFunction.*;
import static mcframe.serverMS.dbc.MSBCFunction.*;
import static mcframe.serverMS.dbc.MSBDFunction.*;
import static mcframe.serverMS.dbc.MSBEFunction.*;
import static mcframe.serverMS.dbc.MSBFFunction.*;
import static mcframe.serverMS.dbc.MSBGFunction.*;
import static mcframe.serverMS.dbc.MSBHFunction.*;
import static mcframe.serverMS.dbc.MSBIFunction.*;
import static mcframe.serverMS.dbc.MSLCFunction.*;
import static mcframe.serverMS.dbc.MSUAFunction.*;

public class Query_MC {
	
	/**
	 * -- MSBEL5710_MST_IV_SHIP_ACT_D_Query_S02
	 */
	static MCQueryPlan MSBEL5710_MST_IV_SHIP_ACT_D_S02() {
		MST_IV_R S0_T1 = MST_IV_R.create("T1");
		MSW_IV_KEY_R S0_T1W = MSW_IV_KEY_R.create("T1W");
		MST_IV_D_R S0_T2 = MST_IV_D_R.create("T2");
		MST_IV_MAP_R S0_T3 = MST_IV_MAP_R.create("T3");
		MST_SHIP_SCHD_R S0_T4 = MST_SHIP_SCHD_R.create("T4");
		MST_SHIP_ALLOC_STS_R S0_T5 = MST_SHIP_ALLOC_STS_R.create("T5");
		MST_SHIP_ACT_D_R S0_T6 = MST_SHIP_ACT_D_R.create("T6");
		MST_IV_SHIP_ACT_D_R S0_T7 = MST_IV_SHIP_ACT_D_R.create("T7");
		MST_ARR_PR_R S0_T8 = MST_ARR_PR_R.create("T8");
		MST_ARR_SCHD_R S0_T9 = MST_ARR_SCHD_R.create("T9");
		MST_ARR_ACT_R S0_T10 = MST_ARR_ACT_R.create("T10");
		MST_PROV_SCHD_R S0_T11 = MST_PROV_SCHD_R.create("T11");
		MST_SLS_ACT_R S0_T12 = MST_SLS_ACT_R.create("T12");
		MST_IV_SHIP_ACT_MAP_R S0_T13 = MST_IV_SHIP_ACT_MAP_R.create("T13");
		MST_SHIP_ACT_R S0_T14 = MST_SHIP_ACT_R.create("T14");
		MST_SLO_D_R S0_T15 = MST_SLO_D_R.create("T15");
		MST_SLS_ACT_D_R S0_T16 = MST_SLS_ACT_D_R.create("T16");
		MAM_ITM_R S0_M1 = MAM_ITM_R.create("M1");
		MAVM_ITM_UNIT_R S0_M2 = MAVM_ITM_UNIT_R.create("M2");
		MAVM_ITM_UNIT_R S0_M3 = MAVM_ITM_UNIT_R.create("M3");
		MAM_SUNDRY_ITM_R S0_M4 = MAM_SUNDRY_ITM_R.create("M4");
		MAM_BP_R S0_M5 = MAM_BP_R.create("M5");
		MAM_LOC_R S0_M6 = MAM_LOC_R.create("M6");
		MAM_ITM_LCL_R S0_M7 = MAM_ITM_LCL_R.create("M7");
		MAM_BP_R S0_M8 = MAM_BP_R.create("M8");
		MAM_LOC_R S0_M9 = MAM_LOC_R.create("M9");
		MAM_DPT_R S0_M10 = MAM_DPT_R.create("M10");
		MST_IV_R S1_T1 = MST_IV_R.create("T1");
		MSW_IV_KEY_R S1_T1W = MSW_IV_KEY_R.create("T1W");
		MST_IV_D_R S1_T2 = MST_IV_D_R.create("T2");
		MST_IV_SHIP_ACT_D_R S1_T7 = MST_IV_SHIP_ACT_D_R.create("T7");
		MAM_ITM_R S1_M1 = MAM_ITM_R.create("M1");
		MAM_SUNDRY_ITM_R S1_M4 = MAM_SUNDRY_ITM_R.create("M4");
		MAM_BP_R S1_M5 = MAM_BP_R.create("M5");
		MAM_ITM_LCL_R S1_M7 = MAM_ITM_LCL_R.create("M7");
		MAM_BP_R S1_M8 = MAM_BP_R.create("M8");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBEL5710_MST_IV_SHIP_ACT_D_Query_S02")
					.mainQuery()
					.select(
						S0_T2.manual_add_flg,
						S0_T1.trd_ptn_typ,
						S0_T1.trd_cur_cd,
						S0_T1.trd_schd_dt,
						S0_T1.iv_no,
						S0_T1.cmpl_schd_dt,
						S0_T1.cmpl_dt,
						S0_T1.ac_dt,
						S0_T1.ship_fr_lg_grp_cd,
						S0_T1.prov_basis_typ,
						S0_T1.xrate,
						S0_T1.ptax_xrate,
						S0_M9.wg_cd.as("gi_wg_cd"),
						S0_M9.gi_vmi_flg,
						S0_M6.wg_cd.as("gr_wg_cd"),
						S0_T2.slo_no,
						S0_T2.trd_cd,
						S0_T2.iv_d_no,
						S0_T2.tax_cd,
						S0_T2.trd_cur_upri,
						S0_T2.trd_cur_amt,
						S0_T2.trd_cur_tax_amt,
						S0_T2.slo_d_no,
						S0_T2.itm_cd,
						S0_T2.itm_sub1,
						S0_T2.itm_sub2,
						S0_T2.itm_sub3,
						cases()
							.when(S0_T2.manual_add_flg.eq(value(true)))
								.then(
									nvl(
										S0_T2.itm_nm,
										S0_M4.itm_nm
									)
							)
							.otherwise(nullValue()).as("itm_nm"),
						cases()
							.when(S0_T2.sundry_itm_flg.eq(value(true)))
								.then(
									nvl(
										S0_T2.iv_itm_nm,
										S0_M4.itm_nm
									)
							)
							.otherwise(
								nvl(
									S0_M7.itm_nm,
									S0_M1.itm_nm
								)
							).as("iv_itm_nm"),
						S0_T2.trd_unit_cd.as("iv_d_trd_unit_cd"),
						S0_T2.trd_unit_qty.as("iv_d_trd_unit_qty"),
						S0_T4.ship_pr_no,
						S0_T4.ship_schd_no,
						S0_T7.stk_mng_typ,
						S0_T7.sundry_itm_flg,
						S0_T7.sno1,
						S0_T7.sno2,
						S0_T7.sno3,
						S0_T7.sno4,
						S0_T7.ship_str_ln_cd,
						S0_T7.arr_str_ln_cd,
						S0_T7.ver_no,
						S0_T7.gd_cd,
						S0_T7.quality_typ,
						S0_T7.stk_insp_typ,
						S0_T7.stk_id_typ,
						S0_T7.stk_bp_cd,
						S0_T3.base_unit_qty.as("map_qty"),
						S0_T7.ship_act_d_no,
						S0_T7.io_schd_pr_no,
						S0_T6.arr_cnt_rmrks,
						S0_T7.sub_char1,
						S0_T7.sub_char2,
						S0_T7.sub_char3,
						S0_T6.dlv_slip_no,
						S0_T6.dlv_slip_d_no,
						S0_T7.iv_ship_act_d_no,
						S0_T7.ship_loc_cd,
						S0_T7.stk_arrv_bp_cd,
						S0_T7.lot_no,
						S0_T7.sublot_no,
						S0_T7.trd_unit_qty,
						S0_T7.trd_unit_cd,
						S0_T7.base_unit_cd,
						S0_T7.base_unit_qty,
						S0_T7.pack_unit_cd,
						S0_T7.pack_unit_qty,
						S0_T7.sync_flg,
						S0_T6.sno1_mng_typ,
						S0_T6.sno2_mng_typ,
						S0_T6.sno3_mng_typ,
						S0_T6.sno4_mng_typ,
						S0_T14.uplnd_flg,
						S0_T15.sls_cststk_flg,
						S0_T1.dlv_id_cd,
						S0_T1.tdlv_cd,
						S0_M8.acst_cd,
						S0_T1.ship_rqst_id_cd,
						S0_T2.cst_itm_cd,
						S0_T2.cst_itm_nm,
						S0_T2.rsn_cd,
						S0_T2.bd_dpt_cd,
						S0_M10.wg_cd.as("bd_wg_cd"),
						S0_T2.trd_rmrks,
						S0_T2.trd_d_rmrks,
						S0_T11.accpt_schd_dt,
						S0_T11.prov_typ,
						S0_M1.dec_place.as("base_dec_place"),
						S0_M1.rnd_typ.as("base_rnd_typ"),
						S0_M2.conv_base_qty.as("trd_conv_base_qty"),
						S0_M2.conv_qty.as("trd_conv_qty"),
						S0_M3.conv_base_qty.as("pack_conv_base_qty"),
						S0_M3.conv_qty.as("pack_conv_qty"),
						S0_M3.dec_place.as("pack_dec_place"),
						S0_M3.rnd_typ.as("pack_rnd_typ"),
						S0_T8.arr_pr_no,
						S0_T9.arr_schd_no,
						S0_T10.arr_act_no,
						S0_T12.sls_act_no
					)
					.from(
						S0_T1
						.innerJoin(S0_T1W).on(
							bracket(
								S0_T1.iv_mng_no.eq(S0_T1W.iv_mng_no)
							)
						)
						.innerJoin(S0_T2).on(
							bracket(
								S0_T1.iv_mng_no.eq(S0_T2.iv_mng_no)
							)
						)
						.leftOuterJoin(S0_T3).on(
							bracket(
								S0_T2.iv_d_no.eq(S0_T3.iv_d_no)
							)
						)
						.leftOuterJoin(S0_T4).on(
							bracket(
								S0_T3.ship_schd_no.eq(S0_T4.ship_schd_no)
							)
						)
						.leftOuterJoin(S0_T5).on(
							bracket(
								S0_T4.ship_schd_no.eq(S0_T5.ship_schd_no)
							)
						)
						.leftOuterJoin(S0_T13).on(
							bracket(
								S0_T2.iv_d_no.eq(S0_T13.iv_d_no)
								.and(S0_T13.ship_schd_no.eq(value(MAC_STR.NULL_VAL.value())))
							)
						)
						.innerJoin(S0_T6).on(
							bracket(
								S0_T5.ship_alloc_sts_no.eq(S0_T6.ship_alloc_sts_no)
								.and(S0_T6.can_flg.eq(value(false)))
							)
							.or(
									bracket(
											S0_T13.ship_act_d_no.eq(S0_T6.ship_act_d_no)
									)
							)
						)
						.leftOuterJoin(S0_T14).on(
							bracket(
								S0_T6.ship_act_no.eq(S0_T14.ship_act_no)
							)
						)
						.leftOuterJoin(S0_T15).on(
							bracket(
								S0_T2.slo_d_no.eq(S0_T15.slo_d_no)
							)
						)
						.innerJoin(S0_T7).on(
							bracket(
								S0_T1.iv_no.eq(S0_T7.iv_no)
								.and(S0_T2.iv_d_no.eq(S0_T7.iv_d_no))
								.and(S0_T6.ship_act_d_no.eq(S0_T7.ship_act_d_no))
							)
						)
						.leftOuterJoin(S0_T8).on(
							bracket(
								S0_T2.iv_d_no.eq(S0_T8.iv_d_no)
								.and(S0_T6.dlv_slip_d_no.eq(S0_T8.dlv_slip_d_no))
							)
						)
						.leftOuterJoin(S0_T9).on(
							bracket(
								S0_T8.arr_pr_no.eq(S0_T9.arr_pr_no)
							)
						)
						.leftOuterJoin(S0_T10).on(
							bracket(
								S0_T9.arr_schd_no.eq(S0_T10.arr_schd_no)
								.and(S0_T10.can_flg.eq(value(false)))
							)
						)
						.leftOuterJoin(S0_T11).on(
							bracket(
								S0_T4.ship_schd_no.eq(S0_T11.prov_src_schd_no1)
								.and(MAC_TRD_PTN_TYP$IS_PROV(S0_T11.trd_ptn_typ).eq(value(true)))
							)
						)
						.leftOuterJoin(S0_T16).on(
							bracket(
								S0_T7.iv_d_no.eq(S0_T16.iv_d_no)
							)
						)
						.leftOuterJoin(S0_T12).on(
							bracket(
								S0_T16.sls_act_no.eq(S0_T12.sls_act_no)
								.and(S0_T16.sls_act_seq.eq(S0_T12.sls_act_seq))
								.and(S0_T12.slip_sts_typ.eq(value(MAC_SLIP_STS_TYP.CRT.value())))
							)
						)
						.leftOuterJoin(S0_M1).on(
							bracket(
								S0_T2.itm_cd.eq(S0_M1.itm_cd)
								.and(S0_T2.itm_sub1.eq(S0_M1.itm_sub1))
								.and(S0_T2.itm_sub2.eq(S0_M1.itm_sub2))
								.and(S0_T2.itm_sub3.eq(S0_M1.itm_sub3))
							)
						)
						.leftOuterJoin(S0_M2).on(
							bracket(
								S0_T2.itm_cd.eq(S0_M2.itm_cd)
								.and(S0_T2.itm_sub1.eq(S0_M2.itm_sub1))
								.and(S0_T2.itm_sub2.eq(S0_M2.itm_sub2))
								.and(S0_T2.itm_sub3.eq(S0_M2.itm_sub3))
								.and(S0_T7.trd_unit_cd.eq(S0_M2.unit_cd))
							)
						)
						.leftOuterJoin(S0_M3).on(
							bracket(
								S0_T2.itm_cd.eq(S0_M3.itm_cd)
								.and(S0_T2.itm_sub1.eq(S0_M3.itm_sub1))
								.and(S0_T2.itm_sub2.eq(S0_M3.itm_sub2))
								.and(S0_T2.itm_sub3.eq(S0_M3.itm_sub3))
								.and(S0_T7.pack_unit_cd.eq(S0_M3.unit_cd))
							)
						)
						.leftOuterJoin(S0_M4).on(
							bracket(
								S0_T2.itm_cd.eq(S0_M4.itm_cd)
								.and(S0_T2.itm_sub1.eq(S0_M4.itm_sub1))
								.and(S0_T2.itm_sub2.eq(S0_M4.itm_sub2))
								.and(S0_T2.itm_sub3.eq(S0_M4.itm_sub3))
								.and(S0_T2.sno1.eq(S0_M4.sno1))
								.and(S0_T2.sno2.eq(S0_M4.sno2))
								.and(S0_T2.sno3.eq(S0_M4.sno3))
								.and(S0_T2.sno4.eq(S0_M4.sno4))
							)
						)
						.leftOuterJoin(S0_M5).on(
							bracket(
								S0_T1.dlv_id_cd.eq(S0_M5.bp_cd)
							)
						)
						.leftOuterJoin(S0_M6).on(
							bracket(
								S0_T1.dlv_id_cd.eq(S0_M6.loc_cd)
							)
						)
						.leftOuterJoin(S0_M7).on(
							bracket(
								S0_T2.itm_cd.eq(S0_M7.itm_cd)
								.and(S0_T2.itm_sub1.eq(S0_M7.itm_sub1))
								.and(S0_T2.itm_sub2.eq(S0_M7.itm_sub2))
								.and(S0_T2.itm_sub3.eq(S0_M7.itm_sub3))
								.and(
									bracket(
										S0_T1.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.SLS.value()))
										.and(S0_M5.prnt_lcl_cd.eq(S0_M7.lcl_cd))
									)
									.or(
										S0_T1.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.PROV.value()))
										.and(S0_M6.prnt_lcl_cd.eq(S0_M7.lcl_cd))
									)
									.or(
										S0_T1.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.XFR.value()))
										.and(S0_M6.prnt_lcl_cd.eq(S0_M7.lcl_cd))
									)
									.or(
										S0_T1.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.XFR_RTN.value()))
										.and(S0_M6.prnt_lcl_cd.eq(S0_M7.lcl_cd))
									)
								)
							)
						)
						.leftOuterJoin(S0_M8).on(
							bracket(
								S0_T1.ship_rqst_id_cd.eq(S0_M8.bp_cd)
							)
						)
						.leftOuterJoin(S0_M9).on(
							bracket(
								S0_T6.ship_loc_cd.eq(S0_M9.loc_cd)
							)
						)
						.leftOuterJoin(S0_M10).on(
							bracket(
								S0_T2.bd_dpt_cd.eq(S0_M10.dpt_cd)
								.and(S0_T1.ac_dt.between(S0_M10.st_dt, S0_M10.end_dt))
							)
						)
					)
					.where(
						value(0).eq(value(0))
						.and(S0_T2.manual_add_flg.eq(value(false)))
					)
					.unionAll(
						subQuery()
						.select(
							S1_T2.manual_add_flg,
							S1_T1.trd_ptn_typ,
							S1_T1.trd_cur_cd,
							S1_T1.trd_schd_dt,
							S1_T1.iv_no,
							S1_T1.cmpl_schd_dt,
							S1_T1.cmpl_dt,
							S1_T1.ac_dt,
							S1_T1.ship_fr_lg_grp_cd,
							S1_T1.prov_basis_typ,
							S1_T1.xrate,
							S1_T1.ptax_xrate,
							nullValue().as("gi_wg_cd"),
							value(false).as("gi_vmi_flg"),
							nullValue().as("gr_wg_cd"),
							S1_T2.slo_no,
							S1_T2.trd_cd,
							S1_T2.iv_d_no,
							S1_T2.tax_cd,
							S1_T2.trd_cur_upri,
							S1_T2.trd_cur_amt,
							S1_T2.trd_cur_tax_amt,
							S1_T2.slo_d_no,
							S1_T2.itm_cd,
							S1_T2.itm_sub1,
							S1_T2.itm_sub2,
							S1_T2.itm_sub3,
							cases()
								.when(S1_T2.manual_add_flg.eq(value(true)))
									.then(
										nvl(
											S1_T2.itm_nm,
											S1_M4.itm_nm
										)
								)
								.otherwise(S1_M1.itm_nm).as("itm_nm"),
							cases()
								.when(S1_T2.sundry_itm_flg.eq(value(true)))
									.then(
										nvl(
											S1_T2.iv_itm_nm,
											S1_M4.itm_nm
										)
								)
								.otherwise(
									nvl(
										S1_M7.itm_nm,
										S1_M1.itm_nm
									)
								).as("iv_itm_nm"),
							S1_T2.trd_unit_cd.as("iv_d_trd_unit_cd"),
							S1_T2.trd_unit_qty.as("iv_d_trd_unit_qty"),
							nullValue().as("ship_pr_no"),
							nullValue().as("ship_schd_no"),
							S1_T7.stk_mng_typ,
							S1_T7.sundry_itm_flg,
							S1_T7.sno1,
							S1_T7.sno2,
							S1_T7.sno3,
							S1_T7.sno4,
							S1_T7.ship_str_ln_cd,
							S1_T7.arr_str_ln_cd,
							S1_T7.ver_no,
							S1_T7.gd_cd,
							S1_T7.quality_typ,
							S1_T7.stk_insp_typ,
							S1_T7.stk_id_typ,
							S1_T7.stk_bp_cd,
							nullValue().as("map_qty"),
							S1_T7.ship_act_d_no,
							S1_T7.io_schd_pr_no,
							nullValue().as("arr_cnt_rmrks"),
							S1_T7.sub_char1,
							S1_T7.sub_char2,
							S1_T7.sub_char3,
							nullValue().as("dlv_slip_no"),
							nullValue().as("dlv_slip_d_no"),
							S1_T7.iv_ship_act_d_no,
							S1_T7.ship_loc_cd,
							S1_T7.stk_arrv_bp_cd,
							S1_T7.lot_no,
							S1_T7.sublot_no,
							S1_T7.trd_unit_qty,
							S1_T7.trd_unit_cd,
							S1_T7.base_unit_cd,
							S1_T7.base_unit_qty,
							S1_T7.pack_unit_cd,
							S1_T7.pack_unit_qty,
							S1_T7.sync_flg,
							S1_M1.sno1_mng_typ,
							S1_M1.sno2_mng_typ,
							S1_M1.sno3_mng_typ,
							S1_M1.sno4_mng_typ,
							value(false).as("uplnd_flg"),
							value(false).as("sls_cststk_flg"),
							S1_T1.dlv_id_cd,
							S1_T1.tdlv_cd,
							S1_M8.acst_cd,
							S1_T1.ship_rqst_id_cd,
							S1_T2.cst_itm_cd,
							S1_T2.cst_itm_nm,
							nullValue().as("rsn_cd"),
							nullValue().as("bd_dpt_cd"),
							nullValue().as("bd_wg_cd"),
							S1_T2.trd_rmrks,
							S1_T2.trd_d_rmrks,
							nullValue().as("accpt_schd_dt"),
							nullValue().as("prov_typ"),
							S1_M1.dec_place.as("base_dec_place"),
							S1_M1.rnd_typ.as("base_rnd_typ"),
							nullValue().as("trd_conv_base_qty"),
							nullValue().as("trd_conv_qty"),
							nullValue().as("pack_conv_base_qty"),
							nullValue().as("pack_conv_qty"),
							nullValue().as("pack_dec_place"),
							nullValue().as("pack_rnd_typ"),
							nullValue().as("arr_pr_no"),
							nullValue().as("arr_schd_no"),
							nullValue().as("arr_act_no"),
							nullValue().as("sls_act_no")
						)
						.from(
							S1_T1
							.innerJoin(S1_T1W).on(
								bracket(
									S1_T1.iv_mng_no.eq(S1_T1W.iv_mng_no)
								)
							)
							.innerJoin(S1_T2).on(
								bracket(
									S1_T1.iv_mng_no.eq(S1_T2.iv_mng_no)
								)
							)
							.innerJoin(S1_T7).on(
								bracket(
									S1_T1.iv_no.eq(S1_T7.iv_no)
									.and(S1_T2.iv_d_no.eq(S1_T7.iv_d_no))
								)
							)
							.leftOuterJoin(S1_M1).on(
								bracket(
									S1_T2.itm_cd.eq(S1_M1.itm_cd)
									.and(S1_T2.itm_sub1.eq(S1_M1.itm_sub1))
									.and(S1_T2.itm_sub2.eq(S1_M1.itm_sub2))
									.and(S1_T2.itm_sub3.eq(S1_M1.itm_sub3))
								)
							)
							.leftOuterJoin(S1_M4).on(
								bracket(
									S1_T2.itm_cd.eq(S1_M4.itm_cd)
									.and(S1_T2.itm_sub1.eq(S1_M4.itm_sub1))
									.and(S1_T2.itm_sub2.eq(S1_M4.itm_sub2))
									.and(S1_T2.itm_sub3.eq(S1_M4.itm_sub3))
									.and(S1_T2.sno1.eq(S1_M4.sno1))
									.and(S1_T2.sno2.eq(S1_M4.sno2))
									.and(S1_T2.sno3.eq(S1_M4.sno3))
									.and(S1_T2.sno4.eq(S1_M4.sno4))
								)
							)
							.leftOuterJoin(S1_M5).on(
								bracket(
									S1_T1.dlv_id_cd.eq(S1_M5.bp_cd)
								)
							)
							.leftOuterJoin(S1_M7).on(
								bracket(
									S1_T2.itm_cd.eq(S1_M7.itm_cd)
									.and(S1_T2.itm_sub1.eq(S1_M7.itm_sub1))
									.and(S1_T2.itm_sub2.eq(S1_M7.itm_sub2))
									.and(S1_T2.itm_sub3.eq(S1_M7.itm_sub3))
									.and(S1_M5.prnt_lcl_cd.eq(S1_M7.lcl_cd))
								)
							)
							.leftOuterJoin(S1_M8).on(
								bracket(
									S1_T1.ship_rqst_id_cd.eq(S1_M8.bp_cd)
								)
							)
						)
						.where(
							value(0).eq(value(0))
							.and(S1_T2.manual_add_flg.eq(value(true)))
						)
					)
					.orderBy(
						pr("ship_act_d_no").asc(),
						pr("iv_no").asc(),
						pr("iv_d_no").asc(),
						pr("ship_schd_no").asc()
					)
			);
	}
	
	/**
	 * -- MSBEL5710_MST_SHIP_ACT_D_Query_S01
	 */
	static MCQueryPlan MSBEL5710_MST_SHIP_ACT_D_S01() {
		MST_IV_R S0_T1 = MST_IV_R.create("T1");
		MSW_IV_KEY_R S0_T1W = MSW_IV_KEY_R.create("T1W");
		MST_IV_D_R S0_T2 = MST_IV_D_R.create("T2");
		MST_IV_MAP_R S0_T3 = MST_IV_MAP_R.create("T3");
		MST_SHIP_SCHD_R S0_T4 = MST_SHIP_SCHD_R.create("T4");
		MST_SHIP_ALLOC_STS_R S0_T5 = MST_SHIP_ALLOC_STS_R.create("T5");
		MST_SHIP_ACT_D_R S0_T6 = MST_SHIP_ACT_D_R.create("T6");
		MST_ARR_PR_R S0_T7 = MST_ARR_PR_R.create("T7");
		MST_ARR_SCHD_R S0_T8 = MST_ARR_SCHD_R.create("T8");
		MST_PROV_SCHD_R S0_T9 = MST_PROV_SCHD_R.create("T9");
		MST_XFR_SCHD_R S0_T10 = MST_XFR_SCHD_R.create("T10");
		MST_IV_SHIP_ACT_MAP_R S0_T11 = MST_IV_SHIP_ACT_MAP_R.create("T11");
		MST_SHIP_ACT_R S0_T12 = MST_SHIP_ACT_R.create("T12");
		MST_SLO_D_R S0_T13 = MST_SLO_D_R.create("T13");
		MAM_ITM_R S0_M1 = MAM_ITM_R.create("M1");
		MAVM_ITM_UNIT_R S0_M2 = MAVM_ITM_UNIT_R.create("M2");
		MAVM_ITM_UNIT_R S0_M3 = MAVM_ITM_UNIT_R.create("M3");
		MAM_SUNDRY_ITM_R S0_M4 = MAM_SUNDRY_ITM_R.create("M4");
		MAM_BP_R S0_M5 = MAM_BP_R.create("M5");
		MAM_LOC_R S0_M6 = MAM_LOC_R.create("M6");
		MAM_ITM_LCL_R S0_M7 = MAM_ITM_LCL_R.create("M7");
		MAM_BP_R S0_M8 = MAM_BP_R.create("M8");
		MAM_LOC_R S0_M9 = MAM_LOC_R.create("M9");
		MAM_SITE_R S0_M10 = MAM_SITE_R.create("M10");
		MAVM_ITM_UNIT_R S0_M11 = MAVM_ITM_UNIT_R.create("M11");
		MAM_DPT_R S0_M12 = MAM_DPT_R.create("M12");
		MST_IV_SHIP_ACT_D_R S1_TD = MST_IV_SHIP_ACT_D_R.create("TD");
		MST_IV_SHIP_ACT_D_R S2_TD = MST_IV_SHIP_ACT_D_R.create("TD");
		MST_IV_SHIP_ACT_D_R S3_TD = MST_IV_SHIP_ACT_D_R.create("TD");
		MST_IV_R S4_T1 = MST_IV_R.create("T1");
		MSW_IV_KEY_R S4_T1W = MSW_IV_KEY_R.create("T1W");
		MST_IV_D_R S4_T2 = MST_IV_D_R.create("T2");
		MAM_ITM_R S4_M1 = MAM_ITM_R.create("M1");
		MAVM_ITM_UNIT_R S4_M2 = MAVM_ITM_UNIT_R.create("M2");
		MAM_SUNDRY_ITM_R S4_M4 = MAM_SUNDRY_ITM_R.create("M4");
		MAM_BP_R S4_M5 = MAM_BP_R.create("M5");
		MAM_ITM_LCL_R S4_M7 = MAM_ITM_LCL_R.create("M7");
		MAM_BP_R S4_M8 = MAM_BP_R.create("M8");
		
		// マスタデータの副問い合わせ(MAVM_ITM_UNIT_R)
		// MAVM_ITM_UNIT_R(S0_M2)
		MCSubQuery S0_M2_conv_base_qty = subQuery().select(S0_M2.conv_base_qty).from(S0_M2).where(
				bracket(
						S0_T2.itm_cd.eq(S0_M2.itm_cd)
						.and(S0_T2.itm_sub1.eq(S0_M2.itm_sub1))
						.and(S0_T2.itm_sub2.eq(S0_M2.itm_sub2))
						.and(S0_T2.itm_sub3.eq(S0_M2.itm_sub3))
						.and(S0_T6.trd_unit_cd.eq(S0_M2.unit_cd))
						)
				);
		MCSubQuery S0_M2_conv_qty = subQuery().select(S0_M2.conv_qty).from(S0_M2).where(
				bracket(
						S0_T2.itm_cd.eq(S0_M2.itm_cd)
						.and(S0_T2.itm_sub1.eq(S0_M2.itm_sub1))
						.and(S0_T2.itm_sub2.eq(S0_M2.itm_sub2))
						.and(S0_T2.itm_sub3.eq(S0_M2.itm_sub3))
						.and(S0_T6.trd_unit_cd.eq(S0_M2.unit_cd))
						)
				);
		MCSubQuery S0_M2_dec_place = subQuery().select(S0_M2.dec_place).from(S0_M2).where(
				bracket(
						S0_T2.itm_cd.eq(S0_M2.itm_cd)
						.and(S0_T2.itm_sub1.eq(S0_M2.itm_sub1))
						.and(S0_T2.itm_sub2.eq(S0_M2.itm_sub2))
						.and(S0_T2.itm_sub3.eq(S0_M2.itm_sub3))
						.and(S0_T6.trd_unit_cd.eq(S0_M2.unit_cd))
						)
				);
		MCSubQuery S0_M2_rnd_typ = subQuery().select(S0_M2.rnd_typ).from(S0_M2).where(
				bracket(
						S0_T2.itm_cd.eq(S0_M2.itm_cd)
						.and(S0_T2.itm_sub1.eq(S0_M2.itm_sub1))
						.and(S0_T2.itm_sub2.eq(S0_M2.itm_sub2))
						.and(S0_T2.itm_sub3.eq(S0_M2.itm_sub3))
						.and(S0_T6.trd_unit_cd.eq(S0_M2.unit_cd))
						)
				);
		// MAVM_ITM_UNIT_R(S0_M3)
		MCSubQuery S0_M3_conv_base_qty = subQuery().select(S0_M3.conv_base_qty).from(S0_M3).where(
				bracket(
						S0_T2.itm_cd.eq(S0_M3.itm_cd)
						.and(S0_T2.itm_sub1.eq(S0_M3.itm_sub1))
						.and(S0_T2.itm_sub2.eq(S0_M3.itm_sub2))
						.and(S0_T2.itm_sub3.eq(S0_M3.itm_sub3))
						.and(S0_T6.pack_unit_cd.eq(S0_M3.unit_cd))
						)
				);
		MCSubQuery S0_M3_conv_qty = subQuery().select(S0_M3.conv_qty).from(S0_M3).where(
				bracket(
						S0_T2.itm_cd.eq(S0_M3.itm_cd)
						.and(S0_T2.itm_sub1.eq(S0_M3.itm_sub1))
						.and(S0_T2.itm_sub2.eq(S0_M3.itm_sub2))
						.and(S0_T2.itm_sub3.eq(S0_M3.itm_sub3))
						.and(S0_T6.pack_unit_cd.eq(S0_M3.unit_cd))
						)
				);
		MCSubQuery S0_M3_dec_place = subQuery().select(S0_M3.dec_place).from(S0_M3).where(
				bracket(
						S0_T2.itm_cd.eq(S0_M3.itm_cd)
						.and(S0_T2.itm_sub1.eq(S0_M3.itm_sub1))
						.and(S0_T2.itm_sub2.eq(S0_M3.itm_sub2))
						.and(S0_T2.itm_sub3.eq(S0_M3.itm_sub3))
						.and(S0_T6.pack_unit_cd.eq(S0_M3.unit_cd))
						)
				);
		MCSubQuery S0_M3_rnd_typ = subQuery().select(S0_M3.rnd_typ).from(S0_M3).where(
				bracket(
						S0_T2.itm_cd.eq(S0_M3.itm_cd)
						.and(S0_T2.itm_sub1.eq(S0_M3.itm_sub1))
						.and(S0_T2.itm_sub2.eq(S0_M3.itm_sub2))
						.and(S0_T2.itm_sub3.eq(S0_M3.itm_sub3))
						.and(S0_T6.pack_unit_cd.eq(S0_M3.unit_cd))
						)
				);
		// MAVM_ITM_UNIT_R(S0_M11)
		MCSubQuery S0_M11_conv_base_qty = subQuery().select(S0_M11.conv_base_qty).from(S0_M11).where(
				bracket(
						S0_T2.itm_cd.eq(S0_M11.itm_cd)
						.and(S0_T2.itm_sub1.eq(S0_M11.itm_sub1))
						.and(S0_T2.itm_sub2.eq(S0_M11.itm_sub2))
						.and(S0_T2.itm_sub3.eq(S0_M11.itm_sub3))
						.and(S0_T4.trd_unit_cd.eq(S0_M11.unit_cd))
						)
				);
		MCSubQuery S0_M11_conv_qty = subQuery().select(S0_M11.conv_qty).from(S0_M11).where(
				bracket(
						S0_T2.itm_cd.eq(S0_M11.itm_cd)
						.and(S0_T2.itm_sub1.eq(S0_M11.itm_sub1))
						.and(S0_T2.itm_sub2.eq(S0_M11.itm_sub2))
						.and(S0_T2.itm_sub3.eq(S0_M11.itm_sub3))
						.and(S0_T4.trd_unit_cd.eq(S0_M11.unit_cd))
						)
				);
		// MAVM_ITM_UNIT_R(S4_M2)
		MCSubQuery S4_M2_pack_flg = subQuery().select(S4_M2.pack_flg).from(S4_M2).where(
				bracket(
						S4_T2.itm_cd.eq(S4_M2.itm_cd)
						.and(S4_T2.itm_sub1.eq(S4_M2.itm_sub1))
						.and(S4_T2.itm_sub2.eq(S4_M2.itm_sub2))
						.and(S4_T2.itm_sub3.eq(S4_M2.itm_sub3))
						.and(S4_T2.trd_unit_cd.eq(S4_M2.unit_cd))
						)
				);
		return createQueryPlan()
			.setQuery(
				sql("MSBEL5710_MST_SHIP_ACT_D_Query_S01")
					.mainQuery()
					.select(
						S0_T2.manual_add_flg,
						S0_T1.trd_ptn_typ,
						cases()
							.when(S0_T1.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.SLS.value())))
								.then(
									decode(
										S0_T1.sls_basis_typ,
										value(MAC_SLS_BASIS_TYP.SHIP_BASIS.value()),
										value(true),
										value(false)
									)
							)
							.when(S0_T1.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.PROV.value())))
								.then(
									decode(
										S0_M8.prov_rcv_typ,
										value(MAC_PROV_RCV_TYP.NOT_ARR.value()),
										value(true),
										value(false)
									)
							)
							.when(S0_T1.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.XFR.value())))
								.then(
									decode(
										S0_M10.arr_flg,
										value(false),
										value(true),
										value(false)
									)
							)
							.when(S0_T1.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.XFR_RTN.value())))
								.then(
									decode(
										S0_M10.arr_flg,
										value(false),
										value(true),
										value(false)
									)
							)
							.otherwise(nullValue()).as("sync_flg"),
						S0_T1.trd_cur_cd,
						S0_T1.trd_schd_dt,
						S0_T1.iv_no,
						S0_T1.cmpl_schd_dt,
						S0_T1.cmpl_dt,
						S0_T1.ac_dt,
						S0_T1.ship_fr_lg_grp_cd,
						S0_T1.prov_basis_typ,
						S0_T1.xrate,
						S0_T1.ptax_xrate,
						S0_M9.wg_cd.as("gi_wg_cd"),
						S0_M9.gi_vmi_flg,
						S0_M6.wg_cd.as("gr_wg_cd"),
						S0_T2.slo_no,
						S0_T2.trd_cd,
						S0_T2.iv_d_no,
						S0_T2.tax_cd,
						S0_T2.trd_cur_upri,
						S0_T2.trd_cur_amt,
						S0_T2.trd_cur_tax_amt,
						S0_T2.slo_d_no,
						S0_T2.itm_cd,
						S0_T2.itm_sub1,
						S0_T2.itm_sub2,
						S0_T2.itm_sub3,
						cases()
							.when(S0_T2.sundry_itm_flg.eq(value(true)))
								.then(
									nvl(
										S0_T2.itm_nm,
										S0_M4.itm_nm
									)
							)
							.otherwise(nullValue()).as("itm_nm"),
						cases()
							.when(S0_T2.sundry_itm_flg.eq(value(true)))
								.then(
									nvl(
										S0_T2.iv_itm_nm,
										S0_M4.itm_nm
									)
							)
							.otherwise(
								nvl(
									S0_M7.itm_nm,
									S0_M1.itm_nm
								)
							).as("iv_itm_nm"),
						S0_T2.trd_unit_cd.as("iv_d_trd_unit_cd"),
						S0_T2.trd_unit_qty.as("iv_d_trd_unit_qty"),
						S0_T4.ship_pr_no,
						S0_T4.ship_schd_no,
						S0_T6.stk_mng_typ,
						S0_T6.sundry_itm_flg,
						S0_T6.sno1,
						S0_T6.sno2,
						S0_T6.sno3,
						S0_T6.sno4,
						S0_T6.ship_loc_cd,
						S0_T6.stk_arrv_bp_cd,
						S0_T6.ship_str_ln_cd,
						S0_T6.dlv_str_ln_cd.as("arr_str_ln_cd"),
						S0_T6.lot_no,
						S0_T6.sublot_no,
						S0_T6.ver_no,
						S0_T6.gd_cd,
						S0_T6.quality_typ,
						S0_T6.stk_insp_typ,
						S0_T6.stk_id_typ,
						S0_T6.stk_bp_cd,
						decode(
							S0_T12.uplnd_flg,
							value(true),
							S0_T2.base_unit_qty,
							S0_T3.base_unit_qty
						).as("map_base_unit_qty"),
						bracket(
							nvl(
								S0_T6.trd_unit_qty,
								value(0)
							).subtract(
								nvl(
									bracket(
										subQuery()
										.select(sum(S1_TD.trd_unit_qty))
										.from(S1_TD)
										.where(
											S0_T6.ship_act_d_no.eq(S1_TD.ship_act_d_no)
										)
									),
									value(0)
								)
							)
						).as("trd_unit_qty"),
						S0_T6.trd_unit_cd,
						bracket(
							nvl(
								S0_T6.base_unit_qty,
								value(0)
							).subtract(
								nvl(
									bracket(
										subQuery()
										.select(sum(S2_TD.base_unit_qty))
										.from(S2_TD)
										.where(
											S0_T6.ship_act_d_no.eq(S2_TD.ship_act_d_no)
										)
									),
									value(0)
								)
							)
						).as("base_unit_qty"),
						S0_T6.base_unit_cd,
						S0_T6.pack_unit_cd,
						bracket(
							nvl(
								S0_T6.pack_unit_qty,
								value(0)
							).subtract(
								nvl(
									bracket(
										subQuery()
										.select(sum(S3_TD.pack_unit_qty))
										.from(S3_TD)
										.where(
											S0_T6.ship_act_d_no.eq(S3_TD.ship_act_d_no)
										)
									),
									value(0)
								)
							)
						).as("pack_unit_qty"),
						S0_T6.ship_ret_qty,
						S0_T6.ship_act_d_no,
						S0_T6.io_schd_pr_no,
						S0_T6.arr_cnt_rmrks,
						S0_T6.dlv_slip_no,
						S0_T6.dlv_slip_d_no,
						S0_T6.sno1_mng_typ,
						S0_T6.sno2_mng_typ,
						S0_T6.sno3_mng_typ,
						S0_T6.sno4_mng_typ,
						S0_T12.uplnd_flg,
						S0_T1.dlv_id_cd,
						S0_T1.tdlv_cd,
						S0_M8.acst_cd,
						S0_T1.ship_rqst_id_cd,
						S0_T2.cst_itm_cd,
						S0_T2.cst_itm_nm,
						S0_T2.rsn_cd,
						S0_T2.bd_dpt_cd,
						S0_M12.wg_cd.as("bd_wg_cd"),
						S0_T2.trd_rmrks,
						S0_T2.trd_d_rmrks,
						S0_T9.accpt_schd_dt,
						nvl(
							S0_T9.prov_typ,
							S0_T10.prov_typ
						).as("prov_typ"),
						S0_M1.dec_place.as("base_dec_place"),
						S0_M1.rnd_typ.as("base_rnd_typ"),
						S0_M2_conv_base_qty.as("trd_conv_base_qty"),
						S0_M2_conv_qty.as("trd_conv_qty"),
						S0_M2_dec_place.as("trd_dec_place"),
						S0_M2_rnd_typ.as("trd_rnd_typ"),
						S0_M3_conv_base_qty.as("pack_conv_base_qty"),
						S0_M3_conv_qty.as("pack_conv_qty"),
						S0_M3_dec_place.as("pack_dec_place"),
						S0_M3_rnd_typ.as("pack_rnd_typ"),
						S0_M11_conv_base_qty.as("schd_trd_conv_base_qty"),
						S0_M11_conv_qty.as("schd_trd_conv_qty"),
						S0_T7.arr_pr_no,
						S0_T8.arr_schd_no,
						S0_T13.sls_cststk_flg
					)
					.from(
						S0_T1
						.innerJoin(S0_T1W).on(
							bracket(
								S0_T1.iv_mng_no.eq(S0_T1W.iv_mng_no)
							)
						)
						.innerJoin(S0_T2).on(
							bracket(
								S0_T1.iv_mng_no.eq(S0_T2.iv_mng_no)
							)
						)
						.leftOuterJoin(S0_T3).on(
							bracket(
								S0_T2.iv_d_no.eq(S0_T3.iv_d_no)
							)
						)
						.leftOuterJoin(S0_T4).on(
							bracket(
								S0_T3.ship_schd_no.eq(S0_T4.ship_schd_no)
							)
						)
						.leftOuterJoin(S0_T5).on(
							bracket(
								S0_T4.ship_schd_no.eq(S0_T5.ship_schd_no)
							)
						)
						.leftOuterJoin(S0_T11).on(
							bracket(
								S0_T2.iv_d_no.eq(S0_T11.iv_d_no)
								.and(S0_T11.ship_schd_no.eq(value(MAC_STR.NULL_VAL.value())))
							)
						)
						.leftOuterJoin(S0_T6).on(
							bracket(
								S0_T5.ship_alloc_sts_no.eq(S0_T6.ship_alloc_sts_no)
								.and(S0_T6.can_flg.eq(value(false)))
							)
							.or(
									bracket(
											S0_T11.ship_act_d_no.eq(S0_T6.ship_act_d_no)
									)
							)
						)
						.leftOuterJoin(S0_T12).on(
							bracket(
								S0_T6.ship_act_no.eq(S0_T12.ship_act_no)
							)
						)
						.leftOuterJoin(S0_T7).on(
							bracket(
								S0_T2.iv_d_no.eq(S0_T7.iv_d_no)
							)
						)
						.leftOuterJoin(S0_T8).on(
							bracket(
								S0_T7.arr_pr_no.eq(S0_T8.arr_pr_no)
							)
						)
						.leftOuterJoin(S0_T9).on(
							bracket(
								S0_T4.ship_schd_no.eq(S0_T9.prov_src_schd_no1)
								.and(MAC_TRD_PTN_TYP$IS_PROV(S0_T9.trd_ptn_typ).eq(value(true)))
							)
						)
						.leftOuterJoin(S0_T10).on(
							bracket(
								S0_T2.xfr_schd_no.eq(S0_T10.xfr_schd_no)
							)
						)
						.leftOuterJoin(S0_T13).on(
							bracket(
								S0_T2.slo_d_no.eq(S0_T13.slo_d_no)
							)
						)
						.leftOuterJoin(S0_M1).on(
							bracket(
								S0_T2.itm_cd.eq(S0_M1.itm_cd)
								.and(S0_T2.itm_sub1.eq(S0_M1.itm_sub1))
								.and(S0_T2.itm_sub2.eq(S0_M1.itm_sub2))
								.and(S0_T2.itm_sub3.eq(S0_M1.itm_sub3))
							)
						)
						.leftOuterJoin(S0_M4).on(
							bracket(
								S0_T2.itm_cd.eq(S0_M4.itm_cd)
								.and(S0_T2.itm_sub1.eq(S0_M4.itm_sub1))
								.and(S0_T2.itm_sub2.eq(S0_M4.itm_sub2))
								.and(S0_T2.itm_sub3.eq(S0_M4.itm_sub3))
								.and(S0_T2.sno1.eq(S0_M4.sno1))
								.and(S0_T2.sno2.eq(S0_M4.sno2))
								.and(S0_T2.sno3.eq(S0_M4.sno3))
								.and(S0_T2.sno4.eq(S0_M4.sno4))
							)
						)
						.leftOuterJoin(S0_M5).on(
							bracket(
								S0_T1.dlv_id_cd.eq(S0_M5.bp_cd)
							)
						)
						.leftOuterJoin(S0_M6).on(
							bracket(
								S0_T1.dlv_id_cd.eq(S0_M6.loc_cd)
							)
						)
						.leftOuterJoin(S0_M7).on(
							bracket(
								S0_T2.itm_cd.eq(S0_M7.itm_cd)
								.and(S0_T2.itm_sub1.eq(S0_M7.itm_sub1))
								.and(S0_T2.itm_sub2.eq(S0_M7.itm_sub2))
								.and(S0_T2.itm_sub3.eq(S0_M7.itm_sub3))
								.and(
									bracket(
										S0_T1.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.SLS.value()))
										.and(S0_M5.prnt_lcl_cd.eq(S0_M7.lcl_cd))
									)
									.or(
										S0_T1.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.PROV.value()))
										.and(S0_M6.prnt_lcl_cd.eq(S0_M7.lcl_cd))
									)
									.or(
										S0_T1.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.XFR.value()))
										.and(S0_M6.prnt_lcl_cd.eq(S0_M7.lcl_cd))
									)
									.or(
										S0_T1.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.XFR_RTN.value()))
										.and(S0_M6.prnt_lcl_cd.eq(S0_M7.lcl_cd))
									)
								)
							)
						)
						.leftOuterJoin(S0_M8).on(
							bracket(
								S0_T1.ship_rqst_id_cd.eq(S0_M8.bp_cd)
							)
						)
						.leftOuterJoin(S0_M9).on(
							bracket(
								S0_T6.ship_loc_cd.eq(S0_M9.loc_cd)
							)
						)
						.leftOuterJoin(S0_M10).on(
							bracket(
								S0_M6.site_cd.eq(S0_M10.site_cd)
							)
						)
						.leftOuterJoin(S0_M12).on(
							bracket(
								S0_T2.bd_dpt_cd.eq(S0_M12.dpt_cd)
								.and(S0_T1.ac_dt.between(S0_M12.st_dt, S0_M12.end_dt))
							)
						)
					)
					.where(
						value(0).eq(value(0))
						.and(S0_T2.manual_add_flg.eq(value(false)))
					)
					.unionAll(
						subQuery()
						.select(
							S4_T2.manual_add_flg,
							S4_T1.trd_ptn_typ,
							decode(
								S4_T1.sls_basis_typ,
								value(MAC_SLS_BASIS_TYP.SHIP_BASIS.value()),
								value(true),
								value(false)
							).as("sync_flg"),
							S4_T1.trd_cur_cd,
							S4_T1.trd_schd_dt,
							S4_T1.iv_no,
							S4_T1.cmpl_schd_dt,
							S4_T1.cmpl_dt,
							S4_T1.ac_dt,
							S4_T1.ship_fr_lg_grp_cd,
							S4_T1.prov_basis_typ,
							S4_T1.xrate,
							S4_T1.ptax_xrate,
							nullValue().as("gi_wg_cd"),
							value(false).as("gi_vmi_flg"),
							nullValue().as("gr_wg_cd"),
							S4_T2.slo_no,
							S4_T2.trd_cd,
							S4_T2.iv_d_no,
							S4_T2.tax_cd,
							S4_T2.trd_cur_upri,
							S4_T2.trd_cur_amt,
							S4_T2.trd_cur_tax_amt,
							S4_T2.slo_d_no,
							S4_T2.itm_cd,
							S4_T2.itm_sub1,
							S4_T2.itm_sub2,
							S4_T2.itm_sub3,
							cases()
								.when(S4_T2.sundry_itm_flg.eq(value(true)))
									.then(
										nvl(
											S4_T2.itm_nm,
											S4_M4.itm_nm
										)
								)
								.otherwise(S4_M1.itm_nm).as("itm_nm"),
							cases()
								.when(S4_T2.sundry_itm_flg.eq(value(true)))
									.then(
										nvl(
											S4_T2.iv_itm_nm,
											S4_M4.itm_nm
										)
								)
								.otherwise(
									nvl(
										S4_M7.itm_nm,
										S4_M1.itm_nm
									)
								).as("iv_itm_nm"),
							S4_T2.trd_unit_cd.as("iv_d_trd_unit_cd"),
							S4_T2.trd_unit_qty.as("iv_d_trd_unit_qty"),
							nullValue().as("ship_pr_no"),
							nullValue().as("ship_schd_no"),
							value(MAC_STK_MNG_TYP.NOT_MNG.value()).as("stk_mng_typ"),
							S4_T2.sundry_itm_flg,
							S4_T2.sno1,
							S4_T2.sno2,
							S4_T2.sno3,
							S4_T2.sno4,
							nullValue().as("ship_loc_cd"),
							value(MAC_STR.NULL_VAL.value()).as("stk_arrv_bp_cd"),
							nullValue().as("ship_str_ln_cd"),
							nullValue().as("arr_str_ln_cd"),
							value(MAC_STR.NULL_VAL.value()).as("lot_no"),
							value(MAC_STR.NULL_VAL.value()).as("sublot_no"),
							nullValue().as("ver_no"),
							nullValue().as("gd_cd"),
							value(MAC_QUALITY_TYP.GOOD.value()).as("quality_typ"),
							value(MSC_STK_INSP_TYP.FIN.value()).as("stk_insp_typ"),
							value(MSC_STK_ID_TYP.COSTK.value()).as("stk_id_typ"),
							value(MAC_STR.NULL_VAL.value()).as("stk_bp_cd"),
							nullValue().as("map_base_unit_qty"),
							S4_T2.trd_unit_qty,
							S4_T2.trd_unit_cd,
							S4_T2.base_unit_qty,
							S4_T2.base_unit_cd,
							cases()
								.when(S4_M2_pack_flg.eq(value(true)))
									.then(S4_T2.trd_unit_cd)
								.when(S4_M2_pack_flg.eq(value(false)))
									.then(S4_T2.base_unit_cd)
								.otherwise(nullValue()).as("pack_unit_cd"),
							cases()
								.when(S4_M2_pack_flg.eq(value(true)))
									.then(S4_T2.trd_unit_qty)
								.when(S4_M2_pack_flg.eq(value(false)))
									.then(S4_T2.base_unit_qty)
								.otherwise(nullValue()).as("pack_unit_qty"),
							nullValue().as("ship_ret_qty"),
							nullValue().as("ship_act_d_no"),
							nullValue().as("io_schd_pr_no"),
							nullValue().as("arr_cnt_rmrks"),
							nullValue().as("dlv_slip_no"),
							nullValue().as("dlv_slip_d_no"),
							S4_M1.sno1_mng_typ,
							S4_M1.sno2_mng_typ,
							S4_M1.sno3_mng_typ,
							S4_M1.sno4_mng_typ,
							value(false).as("uplnd_flg"),
							S4_T1.dlv_id_cd,
							S4_T1.tdlv_cd,
							S4_M8.acst_cd,
							S4_T1.ship_rqst_id_cd,
							S4_T2.cst_itm_cd,
							S4_T2.cst_itm_nm,
							nullValue().as("rsn_cd"),
							nullValue().as("bd_dpt_cd"),
							nullValue().as("bd_wg_cd"),
							S4_T2.trd_rmrks,
							S4_T2.trd_d_rmrks,
							nullValue().as("accpt_schd_dt"),
							nullValue().as("prov_typ"),
							nullValue().as("base_dec_place"),
							nullValue().as("base_rnd_typ"),
							nullValue().as("trd_conv_base_qty"),
							nullValue().as("trd_conv_qty"),
							nullValue().as("trd_dec_place"),
							nullValue().as("trd_rnd_typ"),
							nullValue().as("pack_conv_base_qty"),
							nullValue().as("pack_conv_qty"),
							nullValue().as("pack_dec_place"),
							nullValue().as("pack_rnd_typ"),
							nullValue().as("schd_trd_conv_base_qty"),
							nullValue().as("schd_trd_conv_qty"),
							nullValue().as("arr_pr_no"),
							nullValue().as("arr_schd_no"),
							value(false).as("sls_cststk_flg")
						)
						.from(
							S4_T1
							.innerJoin(S4_T1W).on(
								bracket(
									S4_T1.iv_mng_no.eq(S4_T1W.iv_mng_no)
								)
							)
							.innerJoin(S4_T2).on(
								bracket(
									S4_T1.iv_mng_no.eq(S4_T2.iv_mng_no)
								)
							)
							.leftOuterJoin(S4_M1).on(
								bracket(
									S4_T2.itm_cd.eq(S4_M1.itm_cd)
									.and(S4_T2.itm_sub1.eq(S4_M1.itm_sub1))
									.and(S4_T2.itm_sub2.eq(S4_M1.itm_sub2))
									.and(S4_T2.itm_sub3.eq(S4_M1.itm_sub3))
								)
							)
							.leftOuterJoin(S4_M4).on(
								bracket(
									S4_T2.itm_cd.eq(S4_M4.itm_cd)
									.and(S4_T2.itm_sub1.eq(S4_M4.itm_sub1))
									.and(S4_T2.itm_sub2.eq(S4_M4.itm_sub2))
									.and(S4_T2.itm_sub3.eq(S4_M4.itm_sub3))
									.and(S4_T2.sno1.eq(S4_M4.sno1))
									.and(S4_T2.sno2.eq(S4_M4.sno2))
									.and(S4_T2.sno3.eq(S4_M4.sno3))
									.and(S4_T2.sno4.eq(S4_M4.sno4))
								)
							)
							.leftOuterJoin(S4_M5).on(
								bracket(
									S4_T1.dlv_id_cd.eq(S4_M5.bp_cd)
								)
							)
							.leftOuterJoin(S4_M7).on(
								bracket(
									S4_T2.itm_cd.eq(S4_M7.itm_cd)
									.and(S4_T2.itm_sub1.eq(S4_M7.itm_sub1))
									.and(S4_T2.itm_sub2.eq(S4_M7.itm_sub2))
									.and(S4_T2.itm_sub3.eq(S4_M7.itm_sub3))
									.and(S4_M5.prnt_lcl_cd.eq(S4_M7.lcl_cd))
								)
							)
							.leftOuterJoin(S4_M8).on(
								bracket(
									S4_T1.ship_rqst_id_cd.eq(S4_M8.bp_cd)
								)
							)
						)
						.where(
							value(0).eq(value(0))
							.and(S4_T2.manual_add_flg.eq(value(true)))
						)
					)
					.orderBy(
						pr("ship_act_d_no").asc(),
						pr("iv_no").asc(),
						pr("iv_d_no").asc(),
						pr("ship_schd_no").asc()
					)
			);
	}
}