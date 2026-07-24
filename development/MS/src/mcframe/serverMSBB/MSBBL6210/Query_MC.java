package mcframe.serverMSBB.MSBBL6210;

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
	 * -- MSBBL6210_MST_ARR_ACT_Query_S1
	 */
	static MCQueryPlan MSBBL6210_MST_ARR_ACT_S1() {
		MST_ARR_ACT_R S0_T1 = MST_ARR_ACT_R.create("T1");
		MST_ARR_SCHD_R S0_T2 = MST_ARR_SCHD_R.create("T2");
		MST_ARR_PR_R S0_T3 = MST_ARR_PR_R.create("T3");
		MST_SLS_RET_SCHD_D_R S0_T4 = MST_SLS_RET_SCHD_D_R.create("T4");
		MST_SLS_ACT_IO_R S0_T5 = MST_SLS_ACT_IO_R.create("T5");
		MST_SLS_ACT_D_R S0_T6 = MST_SLS_ACT_D_R.create("T6");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBBL6210_MST_ARR_ACT_Query_S1")
					.mainQuery()
					.select(
						S0_T1.arr_act_no,
						S0_T1.arr_schd_no,
						S0_T1.trd_cd,
						S0_T1.trd_ptn_typ,
						S0_T1.arr_tm,
						S0_T1.ac_dt,
						S0_T3.sls_ret_schd_d_no,
						S0_T4.sls_ret_schd_no,
						S0_T5.sls_act_io_no,
						S0_T5.sls_act_io_seq,
						S0_T5.sls_act_d_no,
						S0_T5.sls_act_d_seq,
						S0_T6.sls_act_no,
						S0_T6.sls_act_seq,
						S0_T6.disp_seq
					)
					.from(
						S0_T1
						.innerJoin(S0_T2).on(
							bracket(
								S0_T2.arr_schd_no.eq(S0_T1.arr_schd_no)
							)
						)
						.innerJoin(S0_T3).on(
							bracket(
								S0_T3.arr_pr_no.eq(S0_T2.arr_pr_no)
							)
						)
						.innerJoin(S0_T4).on(
							bracket(
								S0_T4.sls_ret_schd_d_no.eq(S0_T3.sls_ret_schd_d_no)
							)
						)
						.leftOuterJoin(S0_T5).on(
							bracket(
								S0_T1.arr_act_no.eq(S0_T5.arr_act_no)
							)
						)
						.leftOuterJoin(S0_T6).on(
							bracket(
								S0_T6.sls_act_d_no.eq(S0_T5.sls_act_d_no)
								.and(S0_T6.sls_act_d_seq.eq(S0_T5.sls_act_d_seq))
							)
						)
					)
					.where(
						S0_T1.arr_act_no.eq(bind("arr_act_no"))
					)
			);
	}
	
	/**
	 * -- MSBBL6210_MST_ARR_ACT_Query_S2
	 */
	static MCQueryPlan MSBBL6210_MST_ARR_ACT_S2() {
		MST_ARR_ACT_R S0_T1 = MST_ARR_ACT_R.create("T1");
		MST_ARR_SCHD_R S0_T2 = MST_ARR_SCHD_R.create("T2");
		MST_ARR_PR_R S0_T3 = MST_ARR_PR_R.create("T3");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBBL6210_MST_ARR_ACT_Query_S2")
					.mainQuery()
					.select(
						S0_T1.trd_unit_cd,
						S0_T1.trd_unit_qty,
						S0_T1.base_unit_cd,
						S0_T1.base_unit_qty,
						S0_T1.pack_unit_cd,
						S0_T1.pack_unit_qty,
						S0_T1.gd_cd,
						S0_T1.arr_loc_cd.as("loc_cd"),
						S0_T1.str_ln_cd,
						S0_T1.lot_no,
						S0_T1.sublot_no,
						S0_T1.sno1,
						S0_T1.sno2,
						S0_T1.sno3,
						S0_T1.sno4,
						S0_T1.arr_act_no,
						cases()
							.when(S0_T3.arr_schd_abort_qty.gt(value(0)))
								.then(value(true))
							.otherwise(value(false)).as("sls_ret_schd_abort_flg")
					)
					.from(
						S0_T1
						.innerJoin(S0_T2).on(
							bracket(
								S0_T2.arr_schd_no.eq(S0_T1.arr_schd_no)
							)
						)
						.innerJoin(S0_T3).on(
							bracket(
								S0_T3.arr_pr_no.eq(S0_T2.arr_pr_no)
							)
						)
					)
					.where(
						S0_T1.arr_act_no.eq(bind("arr_act_no"))
					)
					.orderBy(
						S0_T1.ac_dt.asc(),
						S0_T1.arr_act_no.asc()
					)
			);
	}
	
	/**
	 * -- MSBBL6210_MST_ARR_ACT_Query_S3
	 */
	static MCQueryPlan MSBBL6210_MST_ARR_ACT_S3() {
		MST_ARR_ACT_R S0_T1 = MST_ARR_ACT_R.create("T1");
		MST_ARR_SCHD_R S0_T2 = MST_ARR_SCHD_R.create("T2");
		MST_ARR_PR_R S0_T3 = MST_ARR_PR_R.create("T3");
		MST_SLS_RET_SCHD_D_R S0_T4 = MST_SLS_RET_SCHD_D_R.create("T4");
		MST_SLS_ACT_IO_R S0_T5 = MST_SLS_ACT_IO_R.create("T5");
		MST_SLS_ACT_D_R S0_T6 = MST_SLS_ACT_D_R.create("T6");
		MST_SLS_ACT_IO_R S1_W = MST_SLS_ACT_IO_R.create("W");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBBL6210_MST_ARR_ACT_Query_S3")
					.mainQuery()
					.select(
						S0_T1.arr_act_no,
						S0_T1.arr_schd_no,
						S0_T1.trd_ptn_typ,
						S0_T1.arr_tm,
						S0_T1.ac_dt,
						S0_T3.sls_ret_schd_d_no,
						S0_T4.sls_ret_schd_no,
						S0_T1.trd_cd,
						S0_T5.sls_act_io_no,
						S0_T5.sls_act_io_seq,
						S0_T5.sls_act_d_no,
						S0_T5.sls_act_d_seq,
						S0_T6.sls_act_no,
						S0_T6.sls_act_seq,
						S0_T6.disp_seq,
						S0_T1.trd_unit_cd,
						S0_T1.trd_unit_qty,
						S0_T1.base_unit_cd,
						S0_T1.base_unit_qty,
						S0_T1.pack_unit_cd,
						S0_T1.pack_unit_qty,
						S0_T1.gd_cd,
						S0_T1.arr_loc_cd,
						S0_T1.str_ln_cd,
						S0_T1.lot_no,
						S0_T1.sublot_no,
						S0_T1.sno1,
						S0_T1.sno2,
						S0_T1.sno3,
						S0_T1.sno4,
						S0_T3.arr_schd_abort_qty.as("abort_qty"),
						S0_T4.ref_dlv_slip_no,
						S0_T4.ref_dlv_slip_d_no,
						S0_T4.slo_d_no
					)
					.from(
						S0_T1
						.innerJoin(S0_T2).on(
							bracket(
								S0_T2.arr_schd_no.eq(S0_T1.arr_schd_no)
							)
						)
						.innerJoin(S0_T3).on(
							bracket(
								S0_T3.arr_pr_no.eq(S0_T2.arr_pr_no)
							)
						)
						.innerJoin(S0_T4).on(
							bracket(
								S0_T4.sls_ret_schd_d_no.eq(S0_T3.sls_ret_schd_d_no)
							)
						)
						.leftOuterJoin(S0_T5).on(
							bracket(
								S0_T1.arr_act_no.eq(S0_T5.arr_act_no)
								.and(
									S0_T5.sls_act_io_seq.eq(subQuery()
										.select(max(S1_W.sls_act_io_seq))
										.from(S1_W)
										.where(
											S0_T1.arr_act_no.eq(S1_W.arr_act_no)
										)
									)
								)
							)
						)
						.leftOuterJoin(S0_T6).on(
							bracket(
								S0_T6.sls_act_d_no.eq(S0_T5.sls_act_d_no)
								.and(S0_T6.sls_act_d_seq.eq(S0_T5.sls_act_d_seq))
							)
						)
					)
					.where(
						S0_T1.arr_act_no.eq(bind("arr_act_no"))
					)
			);
	}
	
	/**
	 * -- MSBBL6210_MST_ARR_PR_Query_S1
	 */
	static MCQueryPlan MSBBL6210_MST_ARR_PR_S1() {
		MST_ARR_PR_R S0_T1 = MST_ARR_PR_R.create("T1");
		MST_ARR_SCHD_R S0_T2 = MST_ARR_SCHD_R.create("T2");
		MST_ARR_ACT_R S0_T3 = MST_ARR_ACT_R.create("T3");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBBL6210_MST_ARR_PR_Query_S1")
					.mainQuery()
					.select(S0_T2.arr_schd_no)
					.from(
						S0_T1
						.innerJoin(S0_T2).on(S0_T2.arr_pr_no.eq(S0_T1.arr_pr_no))
						.innerJoin(S0_T3).on(S0_T2.arr_schd_no.eq(S0_T3.arr_schd_no))
					)
					.where(
						S0_T1.sls_ret_schd_d_no.eq(bind("sls_ret_schd_d_no"))
						.and(S0_T3.arr_act_no.eq(bind("arr_act_no")))
					)
			);
	}
	
	/**
	 * -- MSBBL6210_MST_SLS_ACT_D_Query_S2
	 */
	static MCQueryPlan MSBBL6210_MST_SLS_ACT_D_S2() {
		MST_SLS_ACT_D_R S0_T1 = MST_SLS_ACT_D_R.create("T1");
		MST_ARR_PR_R S0_T2 = MST_ARR_PR_R.create("T2");
		MAM_ITM_R S0_M1 = MAM_ITM_R.create("M1");
		MAM_TAX_R S0_M2 = MAM_TAX_R.create("M2");
		MAVM_ITM_UNIT_R S0_M3 = MAVM_ITM_UNIT_R.create("M3");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBBL6210_MST_SLS_ACT_D_Query_S2")
					.mainQuery()
					.select(
						S0_T1.sls_act_d_no,
						S0_T1.sls_act_d_seq,
						S0_T1.sls_act_no,
						S0_T1.sls_act_seq,
						S0_T1.sls_ret_schd_d_no,
						S0_T1.disp_seq,
						S0_T1.itm_cd,
						S0_T1.itm_sub1,
						S0_T1.itm_sub2,
						S0_T1.itm_sub3,
						nvl(
							S0_T1.itm_nm,
							S0_M1.itm_nm
						).as("itm_nm"),
						nvl(
							S0_T1.iv_itm_nm,
							S0_M1.itm_nm
						).as("iv_itm_nm"),
						S0_M1.stk_mng_typ,
						S0_M1.itm_jnl_cd,
						S0_T1.sundry_itm_flg,
						S0_T1.dlv_cd,
						S0_T1.dlv_sundry_flg,
						S0_T1.dlv_nm,
						S0_T1.dlv_cntct_dpt,
						S0_T1.dlv_cntct_psn,
						S0_T1.dlv_zip_cd,
						S0_T1.dlv_addr1,
						S0_T1.dlv_addr2,
						S0_T1.dlv_addr3,
						S0_T1.dlv_addr4,
						S0_T1.dlv_tel,
						S0_T1.dlv_fax,
						S0_T1.pri_prnt_flg,
						S0_T1.dest_cd1,
						S0_T1.dest_cd2,
						S0_T1.dest_cd3,
						S0_T1.cntry_org_cd,
						S0_T1.trd_unit_cd,
						S0_T1.trd_unit_qty,
						S0_T1.base_unit_cd,
						S0_T1.base_unit_qty,
						S0_T1.gd_cd,
						S0_T1.sno1,
						S0_T1.sno2,
						S0_T1.sno3,
						S0_T1.sno4,
						S0_T1.wrk_no,
						S0_T1.loc_cd,
						S0_T1.str_ln_cd,
						S0_T1.lot_no,
						S0_T1.sublot_no,
						S0_T1.cst_po_d_no,
						S0_T1.cst_itm_cd,
						S0_T1.cst_itm_nm,
						S0_T1.rsn_cd,
						S0_T1.bd_dpt_cd,
						S0_T1.trd_d_rmrks,
						S0_T1.ref_sls_act_no,
						S0_T1.ref_sls_act_seq,
						S0_T1.ref_sls_act_d_no,
						S0_T1.ref_sls_act_d_seq,
						S0_T1.slo_no,
						S0_T1.slo_d_no,
						S0_T1.bill_crryovr_times,
						S0_T1.dlv_slip_d_no,
						S0_T1.trd_cur_upri,
						S0_T1.upri_not_tgt_flg,
						S0_T1.interim_flg,
						S0_T1.trd_cur_dscnt_amt,
						S0_T1.dscnt_rsn_cd,
						S0_T1.cost_upri,
						S0_T1.tax_cd,
						S0_T1.wtax_rate,
						S0_T1.base_sls_ac_dt,
						S0_T2.arr_schd_abort_qty,
						S0_M2.inc_tax_flg,
						S0_M2.tax_rate,
						S0_M2.tax_typ,
						S0_M1.sno1_mng_typ,
						S0_M1.sno2_mng_typ,
						S0_M1.sno3_mng_typ,
						S0_M1.sno4_mng_typ,
						nvl(
							S0_M3.conv_base_qty,
							value(1)
						).as("conv_base_qty"),
						nvl(
							S0_M3.conv_qty,
							value(1)
						).as("conv_qty"),
						S0_M1.dec_place,
						S0_M1.rnd_typ
						,S0_T1.trd_cur_amt.as("scrn_trd_cur_amt")
						,S0_T1.trd_cur_tax_amt.as("scrn_trd_cur_tax_amt")
					)
					.from(
						S0_T1
						.leftOuterJoin(S0_T2).on(
							bracket(
								S0_T2.sls_ret_schd_d_no.eq(S0_T1.sls_ret_schd_d_no)
							)
						)
						.leftOuterJoin(S0_M1).on(
							bracket(
								S0_T1.itm_cd.eq(S0_M1.itm_cd)
								.and(S0_T1.itm_sub1.eq(S0_M1.itm_sub1))
								.and(S0_T1.itm_sub2.eq(S0_M1.itm_sub2))
								.and(S0_T1.itm_sub3.eq(S0_M1.itm_sub3))
							)
						)
						.leftOuterJoin(S0_M2).on(
							bracket(
								S0_T1.tax_cd.eq(S0_M2.tax_cd)
							)
						)
						.leftOuterJoin(S0_M3).on(
							bracket(
								S0_T1.trd_unit_cd.eq(S0_M3.unit_cd)
								.and(S0_T1.itm_cd.eq(S0_M3.itm_cd))
								.and(S0_T1.itm_sub1.eq(S0_M3.itm_sub1))
								.and(S0_T1.itm_sub2.eq(S0_M3.itm_sub2))
								.and(S0_T1.itm_sub3.eq(S0_M3.itm_sub3))
							)
						)
					)
					.where(
						S0_T1.sls_act_no.eq(bind("sls_act_no"))
						.and(S0_T1.sls_act_seq.eq(bind("sls_act_seq")))
					)
					.orderBy(S0_T1.disp_seq.asc())
			);
	}
	
	/**
	 * -- MSBBL6210_MST_SLS_RET_SCHD_D_Query_S03
	 */
	static MCQueryPlan MSBBL6210_MST_SLS_RET_SCHD_D_S03() {
		MST_SLS_RET_SCHD_D_R S0_T1 = MST_SLS_RET_SCHD_D_R.create("T1");
		MST_SLS_RET_SCHD_R S0_T2 = MST_SLS_RET_SCHD_R.create("T2");
		MAM_UNIT_R S0_M1 = MAM_UNIT_R.create("M1");
		MAVM_ITM_UNIT_R S0_M2 = MAVM_ITM_UNIT_R.create("M2");
		MAM_TAX_R S0_M3 = MAM_TAX_R.create("M3");
		MAM_CUR_R S0_M4 = MAM_CUR_R.create("M4");
		MAM_BP_R S0_M5 = MAM_BP_R.create("M5");
		MAM_TAX_R S0_M6 = MAM_TAX_R.create("M6");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBBL6210_MST_SLS_RET_SCHD_D_Query_S03")
					.mainQuery()
					.select(
						S0_T1.trd_unit_cd,
						S0_T1.trd_unit_qty,
						S0_T1.trd_cur_upri,
						S0_T1.trd_cur_dscnt_amt,
						S0_T1.trd_cur_amt,
						S0_T1.trd_cur_tax_amt,
						S0_T1.base_unit_cd,
						S0_M1.dec_place.as("base_unit_dec_place"),
						S0_M1.rnd_typ.as("base_unit_rnd_typ"),
						S0_M2.conv_base_qty.as("trd_unit_conv_base_qty"),
						S0_M2.conv_qty.as("trd_unit_conv_qty"),
						S0_M2.dec_place.as("trd_unit_dec_place"),
						S0_M2.rnd_typ.as("trd_unit_rnd_typ"),
						S0_M3.tax_rate,
						S0_M3.inc_tax_flg,
						S0_M4.amt_dec_place,
						S0_M4.upri_dec_place,
						S0_M5.sls_amt_rnd_typ.as("amt_rnd_typ"),
						S0_M5.sls_tax_rnd_typ.as("tax_rnd_typ"),
						S0_M6.tax_rate.as("act_tax_rate"),
						S0_M6.inc_tax_flg.as("act_inc_tax_flg")
					)
					.from(
						S0_T1
						.leftOuterJoin(S0_T2).on(S0_T2.sls_ret_schd_no.eq(S0_T1.sls_ret_schd_no))
						.leftOuterJoin(S0_M1).on(S0_M1.unit_cd.eq(S0_T1.base_unit_cd))
						.leftOuterJoin(S0_M2).on(
							bracket(
								S0_T1.itm_cd.eq(S0_M2.itm_cd)
								.and(S0_T1.itm_sub1.eq(S0_M2.itm_sub1))
								.and(S0_T1.itm_sub2.eq(S0_M2.itm_sub2))
								.and(S0_T1.itm_sub3.eq(S0_M2.itm_sub3))
								.and(S0_T1.trd_unit_cd.eq(S0_M2.unit_cd))
							)
						)
						.leftOuterJoin(S0_M3).on(S0_T1.tax_cd.eq(S0_M3.tax_cd))
						.leftOuterJoin(S0_M4).on(S0_T2.trd_cur_cd.eq(S0_M4.cur_cd))
						.leftOuterJoin(S0_M5).on(S0_T2.cst_cd.eq(S0_M5.bp_cd))
						.leftOuterJoin(S0_M6).on(
							bracket(
								decode(
									S0_T1.tax_fix_flg,
									value(true),
									S0_T1.tax_cd,
									MAPA_TAX$F_GET_SLS_TAX_CD(
										S0_T1.itm_cd,
										S0_T1.itm_sub1,
										S0_T1.itm_sub2,
										S0_T1.itm_sub3,
										S0_T2.cst_cd,
										bind("today")
									)
								).eq(S0_M6.tax_cd)
							)
						)
					)
					.where(
						value(0).eq(value(0))
						.and(S0_T1.sls_ret_schd_d_no.eq(bind("sls_ret_schd_d_no")))
					)
			);
	}
	
	/**
	 * -- MSBBL6210_MST_SLS_RET_SCHD_D_Query_S1
	 */
	static MCQueryPlan MSBBL6210_MST_SLS_RET_SCHD_D_S1() {
		MST_SLS_RET_SCHD_D_R S0_T1 = MST_SLS_RET_SCHD_D_R.create("T1");
		MST_SLS_RET_SCHD_R S0_T2 = MST_SLS_RET_SCHD_R.create("T2");
		MAM_ITM_R S0_M1 = MAM_ITM_R.create("M1");
		MAM_BP_R S0_M2 = MAM_BP_R.create("M2");
		MST_WRK_SNO_R S0_T4 = MST_WRK_SNO_R.create("T4");
		MST_ARR_PR_R S0_T3 = MST_ARR_PR_R.create("T3");
		MAM_TAX_R S0_M3 = MAM_TAX_R.create("M3");
		MAVM_ITM_UNIT_R S0_M4 = MAVM_ITM_UNIT_R.create("M4");
		MAM_TAX_R S0_M5 = MAM_TAX_R.create("M5");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBBL6210_MST_SLS_RET_SCHD_D_Query_S1")
					.mainQuery()
					.select(
						S0_T1.sls_ret_schd_d_no,
						S0_T1.disp_seq,
						S0_T1.itm_cd,
						S0_T1.itm_sub1,
						S0_T1.itm_sub2,
						S0_T1.itm_sub3,
						nvl(
							S0_T1.itm_nm,
							S0_M1.itm_nm
						).as("itm_nm"),
						nvl(
							S0_T1.iv_itm_nm,
							S0_M1.itm_nm
						).as("iv_itm_nm"),
						S0_M1.stk_mng_typ,
						S0_M1.itm_jnl_cd,
						S0_T1.sundry_itm_flg,
						S0_T1.sret_fr_cd.as("dlv_cd"),
						S0_T1.sret_fr_sundry_flg.as("dlv_sundry_flg"),
						nvl(
							S0_T1.sret_fr_nm,
							S0_M2.bp_nm
						).as("dlv_nm"),
						S0_T1.sret_fr_cntct_dpt.as("dlv_cntct_dpt"),
						S0_T1.sret_fr_cntct_psn.as("dlv_cntct_psn"),
						S0_T1.sret_fr_zip_cd.as("dlv_zip_cd"),
						S0_T1.sret_fr_addr1.as("dlv_addr1"),
						S0_T1.sret_fr_addr2.as("dlv_addr2"),
						S0_T1.sret_fr_addr3.as("dlv_addr3"),
						S0_T1.sret_fr_addr4.as("dlv_addr4"),
						S0_T1.sret_fr_tel.as("dlv_tel"),
						S0_T1.sret_fr_fax.as("dlv_fax"),
						S0_T1.pri_prnt_flg,
						S0_T1.dest_cd1,
						S0_T1.dest_cd2,
						S0_T1.dest_cd3,
						S0_T1.cntry_org_cd,
						S0_T1.trd_unit_cd,
						S0_T1.trd_unit_qty,
						S0_T1.base_unit_cd,
						S0_T1.base_unit_qty,
						S0_T1.gd_cd,
						S0_T1.sno1,
						S0_T1.sno2,
						S0_T1.sno3,
						S0_T1.sno4,
						S0_T4.wrk_no,
						S0_T1.loc_cd,
						S0_T1.str_ln_cd,
						S0_T1.lot_no,
						S0_T1.sublot_no,
						S0_T1.vmi_flg,
						S0_T1.cst_po_d_no,
						S0_T1.cst_itm_cd,
						S0_T1.cst_itm_nm,
						S0_T1.ret_rsn_cd,
						S0_T1.bd_dpt_cd,
						S0_T1.trd_d_rmrks,
						S0_T1.ref_sls_act_no,
						S0_T1.ref_sls_act_seq,
						S0_T1.ref_sls_act_d_no,
						S0_T1.ref_sls_act_d_seq,
						S0_T1.slo_no,
						S0_T1.slo_d_no,
						S0_T3.arr_schd_abort_qty.as("abort_qty"),
						S0_T1.bill_crryovr_times,
						S0_T1.trd_cur_upri,
						S0_T1.upri_not_tgt_flg,
						S0_T1.interim_flg,
						S0_T1.trd_cur_dscnt_amt,
						S0_T1.dscnt_rsn_cd,
						S0_T1.cost_upri,
						S0_T1.tax_fix_flg,
						S0_T1.tax_cd,
						S0_T1.base_sls_ac_dt,
						S0_M3.inc_tax_flg,
						S0_M3.tax_rate,
						S0_M3.tax_typ,
						S0_T1.wtax_rate,
						nvl(
							S0_M4.conv_base_qty,
							value(1)
						).as("conv_base_qty"),
						nvl(
							S0_M4.conv_qty,
							value(1)
						).as("conv_qty"),
						S0_M1.dec_place,
						S0_M1.rnd_typ,
						S0_M1.sno1_mng_typ,
						S0_M1.sno2_mng_typ,
						S0_M1.sno3_mng_typ,
						S0_M1.sno4_mng_typ,
						S0_T1.ref_dlv_slip_no,
						S0_T1.ref_dlv_slip_d_no,
						S0_M5.tax_cd.as("new_tax_cd"),
						S0_M5.inc_tax_flg.as("new_inc_tax_flg"),
						S0_M5.tax_rate.as("new_tax_rate"),
						S0_M5.tax_typ.as("new_tax_typ")
						,S0_T1.trd_cur_amt.as("scrn_trd_cur_amt")
						,S0_T1.trd_cur_tax_amt.as("scrn_trd_cur_tax_amt")
					)
					.from(
						S0_T1
						.leftOuterJoin(S0_T2).on(S0_T2.sls_ret_schd_no.eq(S0_T1.sls_ret_schd_no))
						.leftOuterJoin(S0_M1).on(
							bracket(
								S0_M1.itm_cd.eq(S0_T1.itm_cd)
								.and(S0_M1.itm_sub1.eq(S0_T1.itm_sub1))
								.and(S0_M1.itm_sub2.eq(S0_T1.itm_sub2))
								.and(S0_M1.itm_sub3.eq(S0_T1.itm_sub3))
							)
						)
						.leftOuterJoin(S0_M2).on(
							bracket(
								S0_M2.bp_cd.eq(S0_T1.sret_fr_cd)
							)
						)
						.leftOuterJoin(S0_T4).on(
							bracket(
								S0_T4.sno1.eq(S0_T1.sno1)
							)
						)
						.leftOuterJoin(S0_T3).on(
							bracket(
								S0_T3.sls_ret_schd_d_no.eq(S0_T1.sls_ret_schd_d_no)
							)
						)
						.leftOuterJoin(S0_M3).on(
							bracket(
								S0_T1.tax_cd.eq(S0_M3.tax_cd)
							)
						)
						.leftOuterJoin(S0_M4).on(
							bracket(
								S0_T1.trd_unit_cd.eq(S0_M4.unit_cd)
								.and(S0_T1.itm_cd.eq(S0_M4.itm_cd))
								.and(S0_T1.itm_sub1.eq(S0_M4.itm_sub1))
								.and(S0_T1.itm_sub2.eq(S0_M4.itm_sub2))
								.and(S0_T1.itm_sub3.eq(S0_M4.itm_sub3))
							)
						)
						.leftOuterJoin(S0_M5).on(
							bracket(
								MAPA_TAX$F_GET_SLS_TAX_CD(
									S0_T1.itm_cd,
									S0_T1.itm_sub1,
									S0_T1.itm_sub2,
									S0_T1.itm_sub3,
									S0_T2.cst_cd,
									bind("arr_tm")
								).eq(S0_M5.tax_cd)
							)
						)
					)
					.where(
						S0_T1.sls_ret_schd_d_no.eq(bind("sls_ret_schd_d_no"))
					)
					.orderBy(S0_T1.disp_seq.asc())
			);
	}
	
	/**
	 * -- MSBBL6210_MST_SLS_RET_SCHD_Query_S1
	 */
	static MCQueryPlan MSBBL6210_MST_SLS_RET_SCHD_S1() {
		MST_SLS_RET_SCHD_R S0_T1 = MST_SLS_RET_SCHD_R.create("T1");
		MAM_BP_R S0_CST = MAM_BP_R.create("CST");
		MAM_BP_R S0_ACST = MAM_BP_R.create("ACST");
		MAM_BP_R S0_BCST = MAM_BP_R.create("BCST");
		MAM_CUR_R S0_CUR = MAM_CUR_R.create("CUR");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBBL6210_MST_SLS_RET_SCHD_Query_S1")
					.mainQuery()
					.select(
						S0_T1.sls_ret_schd_no,
						S0_T1.trd_cd,
						S0_T1.trd_ptn_typ,
						S0_T1.iv_no,
						S0_T1.ref_iv_no,
						S0_T1.cst_cd,
						S0_T1.sls_usr_cd,
						S0_T1.sls_dpt_cd,
						S0_T1.wg_cd,
						S0_T1.cst_po_no,
						S0_T1.ar_dpt_cd,
						S0_T1.trd_rmrks,
						S0_T1.tterm_cd1,
						S0_T1.tterm_rmrks1,
						S0_T1.tterm_cd2,
						S0_T1.tterm_rmrks2,
						S0_T1.tterm_cd3,
						S0_T1.tterm_rmrks3,
						S0_T1.trd_cur_cd,
						S0_T1.xrate_inpt_flg,
						S0_T1.xrate,
						S0_T1.ptax_xrate_inpt_flg,
						S0_T1.ptax_xrate,
						S0_T1.rcv_schd_dt,
						S0_BCST.ar_cred_cd.as("cred_cd"),
						S0_ACST.bcst_cd,
						S0_CST.acst_cd,
						S0_CUR.amt_dec_place
					)
					.from(
						S0_T1
						.leftOuterJoin(S0_CST).on(
							bracket(
								S0_T1.cst_cd.eq(S0_CST.bp_cd)
							)
						)
						.leftOuterJoin(S0_ACST).on(
							bracket(
								S0_CST.acst_cd.eq(S0_ACST.bp_cd)
							)
						)
						.leftOuterJoin(S0_BCST).on(
							bracket(
								S0_ACST.bcst_cd.eq(S0_BCST.bp_cd)
							)
						)
						.leftOuterJoin(S0_CUR).on(
							bracket(
								S0_T1.trd_cur_cd.eq(S0_CUR.cur_cd)
							)
						)
					)
					.where(
						S0_T1.sls_ret_schd_no.eq(bind("sls_ret_schd_no"))
					)
			);
	}
}