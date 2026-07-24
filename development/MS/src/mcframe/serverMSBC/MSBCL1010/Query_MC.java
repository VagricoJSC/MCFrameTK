package mcframe.serverMSBC.MSBCL1010;

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
	 * -- MSBCL1010_MST_INPT_SCHD_ALL_R_Query_S01
	 */
	static MCQueryPlan MSBCL1010_MST_INPT_SCHD_ALL_R_S01() {
		MST_INPT_SCHD_P_R S0_T1 = MST_INPT_SCHD_P_R.create("T1");
		MSVT_INPT_SCHD_PR_R S0_T2 = MSVT_INPT_SCHD_PR_R.create("T2");
		MSVT_LOT_LIST_R S0_T3 = MSVT_LOT_LIST_R.create("T3");
		MST_OPER_INST_P_R S0_T4 = MST_OPER_INST_P_R.create("T4");
		MAM_ITM_R S0_M1 = MAM_ITM_R.create("M1");
		MAM_SUNDRY_ITM_R S0_M2 = MAM_SUNDRY_ITM_R.create("M2");
		MAM_LOC_R S0_M3 = MAM_LOC_R.create("M3");
		MAM_STR_LN_R S0_M4 = MAM_STR_LN_R.create("M4");
		MAM_ALT_GRP_R S0_M5 = MAM_ALT_GRP_R.create("M5");
		MAM_UNIT_R S0_M6 = MAM_UNIT_R.create("M6");
		MAM_UNIT_R S0_M7 = MAM_UNIT_R.create("M7");
		MAM_STK_GD_R S0_M8 = MAM_STK_GD_R.create("M8");
		MAM_BIZ_RSN_R S0_M9 = MAM_BIZ_RSN_R.create("M9");
		MST_INPT_SCHD_R S1_T1 = MST_INPT_SCHD_R.create("T1");
		MSVT_INPT_SCHD_PR_R S1_T2 = MSVT_INPT_SCHD_PR_R.create("T2");
		MSVT_LOT_LIST_R S1_T3 = MSVT_LOT_LIST_R.create("T3");
		MAM_ITM_R S1_M1 = MAM_ITM_R.create("M1");
		MAM_SUNDRY_ITM_R S1_M2 = MAM_SUNDRY_ITM_R.create("M2");
		MST_OPER_INST_R S1_T4 = MST_OPER_INST_R.create("T4");
		MAM_LOC_R S1_M3 = MAM_LOC_R.create("M3");
		MAM_STR_LN_R S1_M4 = MAM_STR_LN_R.create("M4");
		MAM_ALT_GRP_R S1_M5 = MAM_ALT_GRP_R.create("M5");
		MAM_UNIT_R S1_M6 = MAM_UNIT_R.create("M6");
		MAM_UNIT_R S1_M7 = MAM_UNIT_R.create("M7");
		MAM_STK_GD_R S1_M8 = MAM_STK_GD_R.create("M8");
		MAM_BIZ_RSN_R S1_M9 = MAM_BIZ_RSN_R.create("M9");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBCL1010_MST_INPT_SCHD_ALL_R_Query_S01")
					.mainQuery()
					.select(
						S0_M1.th_image,
						S0_T1.alt_grp_cd,
						S0_M5.alt_grp_nm,
						S0_T1.alt_grp_seq,
						S0_T1.alt_itm_fix_flg,
						S0_T1.itm_cd,
						S0_T1.itm_sub1,
						S0_T1.itm_sub2,
						S0_T1.itm_sub3,
						nvl(
							S0_M2.itm_nm,
							S0_M1.itm_nm
						).as("itm_nm"),
						S0_T1.ver_no,
						S0_M1.ver_flg,
						S0_M1.lot_mng_typ,
						S0_M1.sublot_mng_typ,
						S0_M1.sno1_mng_typ,
						S0_M1.sno2_mng_typ,
						S0_M1.sno3_mng_typ,
						S0_M1.sno4_mng_typ,
						S0_T1.base_unit_alt_qty,
						S0_T1.base_unit_inpt_qty,
						S0_T1.base_unit_rqmt_qty,
						S0_T1.base_unit_fxd_rqmt_qty,
						bracket(
							S0_T1.base_unit_rqmt_qty.add(S0_T1.base_unit_fxd_rqmt_qty)
						).as("base_unit_sum_rqmt_qty"),
						S0_T1.base_unit_cd,
						S0_M6.unit_nm.as("base_unit_nm"),
						S0_M1.dec_place.as("base_unit_dec_place"),
						S0_M1.rnd_typ.as("base_unit_rnd_typ"),
						S0_M1.cont_fctr_flg,
						S0_M1.cont_fctr_rnd_typ,
						S0_M1.cont_fctr_dec_place,
						S0_T1.act_cont_fctr,
						S0_T1.cont_inpt_qty,
						S0_T1.cont_rqmt_qty,
						S0_T1.cont_fxd_rqmt_qty,
						bracket(
							S0_T1.cont_rqmt_qty.add(S0_T1.cont_fxd_rqmt_qty)
						).as("sum_cont_rqmt_qty"),
						S0_T1.cont_fctr_unit_cd,
						S0_M7.unit_nm.as("cont_fctr_unit_nm"),
						S0_T1.std_cont_fctr,
						trunc(
							S0_T1.schd_tm,
							MCDateFmt.DD
						).as("schd_dt"),
						S0_T1.schd_tm.as("schd_hm"),
						S0_T1.alloc_flg,
						cases()
							.when(
								S0_T1.lot_no.isNotNull()
								.and(S0_T1.lot_no.neq(value(MAC_STR.NULL_VAL.value())))
							)
								.then(value(false))
							.when(
								S0_T1.sublot_no.isNotNull()
								.and(S0_T1.sublot_no.neq(value(MAC_STR.NULL_VAL.value())))
							)
								.then(value(false))
							.otherwise(value(true)).as("no_lot_fix_flg"),
						S0_T1.inst_lot_fix_flg,
						S0_T1.lot_no,
						S0_T1.sublot_no,
						S0_T3.vld_dt,
						S0_T3.first_gr_dt,
						S0_T3.lot_seq,
						S0_T1.sno1,
						S0_T1.sno1_null_flg,
						S0_T1.sno2,
						S0_T1.sno2_null_flg,
						S0_T1.sno3,
						S0_T1.sno3_null_flg,
						S0_T1.sno4,
						S0_T1.sno4_null_flg,
						S0_T1.alloc_sno1,
						S0_T1.alloc_sno2,
						S0_T1.alloc_sno3,
						S0_T1.alloc_sno4,
						S0_T1.inpt_loc_cd,
						S0_M3.loc_nm.as("inpt_loc_nm"),
						S0_M3.str_ln_tgt_flg,
						S1_M3.str_ln_tgt_flg.as("inpt_str_ln_tgt_flg"),
						S0_T1.inpt_str_ln_cd,
						S0_M4.str_ln_nm.as("inpt_str_ln_nm"),
						S0_T1.gd_cd,
						S0_M8.gd_nm,
						S0_T1.intr_rmrks,
						S0_T1.inst_rpt_rmrks,
						S0_T1.sub_char1,
						S0_T1.sub_char2,
						S0_T1.sub_char3,
						S0_T1.bkf_typ,
						S0_T1.par_inst_qty,
						S0_T1.chd_inpt_qty,
						S0_T1.chd_rqmt_qty,
						S0_T1.fxd_chd_rqmt_qty,
						S0_T1.main_itm_flg,
						S0_T1.bom_id_no,
						S0_T1.chd_itm_seq,
						S0_T1.bom_memo1,
						S0_T1.bom_memo2,
						S0_T1.bom_memo3,
						S0_T1.yield_calc_flg,
						S0_T1.alloc_ctl_typ,
						S0_T1.inpt_ctl_typ,
						S0_T1.in_offst_typ,
						S0_T1.in_offst,
						S0_T1.lot_mix_flg,
						S0_T1.sublot_mix_flg,
						S0_M1.stk_mng_typ,
						S0_T1.prov_typ,
						S0_T1.alt_itm_typ,
						S0_T1.alt_alloc_prio,
						S0_T1.alt_itm_ratio,
						S0_T1.mfg_inst_no,
						S0_T1.oper_inst_no,
						S0_T1.inpt_schd_no,
						S0_T2.mfg_sts_typ,
						S0_T1.disp_seq,
						S0_T4.disp_seq.as("oper_disp_seq"),
						S0_T1.inpt_rsn_cd,
						S0_M9.biz_rsn_nm.as("inpt_rsn_nm")
					)
					.from(
						S0_T1
						.leftOuterJoin(S0_T2).on(
							bracket(
								S0_T1.inpt_schd_no.eq(S0_T2.inpt_schd_no)
							)
						)
						.leftOuterJoin(S0_T3).on(
							bracket(
								S0_T1.itm_cd.eq(S0_T3.itm_cd)
								.and(S0_T1.itm_sub1.eq(S0_T3.itm_sub1))
								.and(S0_T1.itm_sub2.eq(S0_T3.itm_sub2))
								.and(S0_T1.itm_sub3.eq(S0_T3.itm_sub3))
								.and(S0_T1.lot_no.eq(S0_T3.lot_no))
								.and(S0_T1.sublot_no.eq(S0_T3.sublot_no))
							)
						)
						.innerJoin(S0_T4).on(
							bracket(
								S0_T1.mfg_inst_no.eq(S0_T4.mfg_inst_no)
								.and(S0_T1.mfg_inst_rev.eq(S0_T4.mfg_inst_rev))
								.and(S0_T1.oper_inst_no.eq(S0_T4.oper_inst_no))
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
								S0_T1.itm_cd.eq(S0_M2.itm_cd)
								.and(S0_T1.itm_sub1.eq(S0_M2.itm_sub1))
								.and(S0_T1.itm_sub2.eq(S0_M2.itm_sub2))
								.and(S0_T1.itm_sub3.eq(S0_M2.itm_sub3))
								.and(
									nvl(
										S0_T1.alloc_sno1,
										S0_T1.sno1
									).eq(S0_M2.sno1)
								)
								.and(
									nvl(
										S0_T1.alloc_sno2,
										S0_T1.sno2
									).eq(S0_M2.sno2)
								)
								.and(
									nvl(
										S0_T1.alloc_sno3,
										S0_T1.sno3
									).eq(S0_M2.sno3)
								)
								.and(
									nvl(
										S0_T1.alloc_sno4,
										S0_T1.sno4
									).eq(S0_M2.sno4)
								)
							)
						)
						.leftOuterJoin(S0_M3).on(
							bracket(
								S0_T1.inpt_loc_cd.eq(S0_M3.loc_cd)
							)
						)
						.leftOuterJoin(S0_M4).on(
							bracket(
								S0_T1.inpt_loc_cd.eq(S0_M4.loc_cd)
								.and(S0_T1.inpt_str_ln_cd.eq(S0_M4.str_ln_cd))
							)
						)
						.leftOuterJoin(S0_M5).on(
							bracket(
								S0_T1.alt_grp_cd.eq(S0_M5.alt_grp_cd)
								.and(S0_M3.wg_cd.eq(S0_M5.wg_cd))
							)
						)
						.leftOuterJoin(S0_M6).on(
							bracket(
								S0_T1.base_unit_cd.eq(S0_M6.unit_cd)
							)
						)
						.leftOuterJoin(S0_M7).on(
							bracket(
								S0_T1.cont_fctr_unit_cd.eq(S0_M7.unit_cd)
							)
						)
						.leftOuterJoin(S0_M8).on(
							bracket(
								S0_T1.gd_cd.eq(S0_M8.gd_cd)
							)
						)
						.leftOuterJoin(S0_M9).on(
							bracket(
								S0_T1.inpt_rsn_cd.eq(S0_M9.biz_rsn_cd)
							)
						)
					)
					.where(
						value(0).eq(value(0))
						.and(S0_T1.mfg_inst_no.eq(bind("srch_tgt_no")))
						.and(S0_T1.mfg_inst_rev.eq(bind("mfg_inst_rev")))
						.and(S0_T1.can_flg.eq(value(false)))
					)
					.unionAll(
						subQuery()
						.select(
							S1_M1.th_image,
							S1_T1.alt_grp_cd,
							S1_M5.alt_grp_nm,
							S1_T1.alt_grp_seq,
							S1_T1.alt_itm_fix_flg,
							S1_T1.itm_cd,
							S1_T1.itm_sub1,
							S1_T1.itm_sub2,
							S1_T1.itm_sub3,
							nvl(
								S1_M2.itm_nm,
								S1_M1.itm_nm
							).as("itm_nm"),
							S1_T1.ver_no,
							S1_M1.ver_flg,
							S1_M1.lot_mng_typ,
							S1_M1.sublot_mng_typ,
							S1_M1.sno1_mng_typ,
							S1_M1.sno2_mng_typ,
							S1_M1.sno3_mng_typ,
							S1_M1.sno4_mng_typ,
							S1_T1.base_unit_alt_qty,
							S1_T1.base_unit_inpt_qty,
							S1_T1.base_unit_rqmt_qty,
							S1_T1.base_unit_fxd_rqmt_qty,
							bracket(
								S1_T1.base_unit_rqmt_qty.add(S1_T1.base_unit_fxd_rqmt_qty)
							).as("base_unit_sum_rqmt_qty"),
							S1_T1.base_unit_cd,
							S1_M6.unit_nm.as("base_unit_nm"),
							S1_M1.dec_place.as("base_unit_dec_place"),
							S1_M1.rnd_typ.as("base_unit_rnd_typ"),
							S1_M1.cont_fctr_flg,
							S1_M1.cont_fctr_rnd_typ,
							S1_M1.cont_fctr_dec_place,
							S1_T1.act_cont_fctr,
							S1_T1.cont_inpt_qty,
							S1_T1.cont_rqmt_qty,
							S1_T1.cont_fxd_rqmt_qty,
							bracket(
								S1_T1.cont_rqmt_qty.add(S1_T1.cont_fxd_rqmt_qty)
							).as("sum_cont_rqmt_qty"),
							S1_T1.cont_fctr_unit_cd,
							S1_M7.unit_nm.as("cont_fctr_unit_nm"),
							S1_T1.std_cont_fctr,
							trunc(
								S1_T1.schd_tm,
								MCDateFmt.DD
							).as("schd_dt"),
							S1_T1.schd_tm.as("schd_hm"),
							S1_T1.alloc_flg,
							cases()
								.when(
									S1_T1.lot_no.isNotNull()
									.and(S1_T1.lot_no.neq(value(MAC_STR.NULL_VAL.value())))
								)
									.then(value(false))
								.when(
									S1_T1.sublot_no.isNotNull()
									.and(S1_T1.sublot_no.neq(value(MAC_STR.NULL_VAL.value())))
								)
									.then(value(false))
								.otherwise(value(true)).as("no_lot_fix_flg"),
							S1_T1.inst_lot_fix_flg,
							S1_T1.lot_no,
							S1_T1.sublot_no,
							S1_T3.vld_dt,
							S1_T3.first_gr_dt,
							S1_T3.lot_seq,
							S1_T1.sno1,
							S1_T1.sno1_null_flg,
							S1_T1.sno2,
							S1_T1.sno2_null_flg,
							S1_T1.sno3,
							S1_T1.sno3_null_flg,
							S1_T1.sno4,
							S1_T1.sno4_null_flg,
							S1_T1.alloc_sno1,
							S1_T1.alloc_sno2,
							S1_T1.alloc_sno3,
							S1_T1.alloc_sno4,
							S1_T1.inpt_loc_cd,
							S1_M3.loc_nm.as("inpt_loc_nm"),
							S1_M3.str_ln_tgt_flg,
							S1_M3.str_ln_tgt_flg.as("inpt_str_ln_tgt_flg"),
							S1_T1.inpt_str_ln_cd,
							S1_M4.str_ln_nm.as("inpt_str_ln_nm"),
							S1_T1.gd_cd,
							S1_M8.gd_nm,
							S1_T1.intr_rmrks,
							S1_T1.inst_rpt_rmrks,
							S1_T1.sub_char1,
							S1_T1.sub_char2,
							S1_T1.sub_char3,
							S1_T1.bkf_typ,
							S1_T1.par_inst_qty,
							S1_T1.chd_inpt_qty,
							S1_T1.chd_rqmt_qty,
							S1_T1.fxd_chd_rqmt_qty,
							S1_T1.main_itm_flg,
							S1_T1.bom_id_no,
							S1_T1.chd_itm_seq,
							S1_T1.bom_memo1,
							S1_T1.bom_memo2,
							S1_T1.bom_memo3,
							S1_T1.yield_calc_flg,
							S1_T1.alloc_ctl_typ,
							S1_T1.inpt_ctl_typ,
							S1_T1.in_offst_typ,
							S1_T1.in_offst,
							S1_T1.lot_mix_flg,
							S1_T1.sublot_mix_flg,
							S1_M1.stk_mng_typ,
							S1_T1.prov_typ,
							S1_T1.alt_itm_typ,
							S1_T1.alt_alloc_prio,
							S1_T1.alt_itm_ratio,
							S1_T1.mfg_inst_no,
							S1_T1.oper_inst_no,
							S1_T1.inpt_schd_no,
							S1_T2.mfg_sts_typ,
							S1_T1.disp_seq,
							S1_T4.disp_seq.as("oper_disp_seq"),
							S1_T1.inpt_rsn_cd,
							S1_M9.biz_rsn_nm.as("inpt_rsn_nm")
						)
						.from(
							S1_T1
							.leftOuterJoin(S1_T2).on(
								bracket(
									S1_T1.inpt_schd_no.eq(S1_T2.inpt_schd_no)
								)
							)
							.leftOuterJoin(S1_T3).on(
								bracket(
									S1_T1.itm_cd.eq(S1_T3.itm_cd)
									.and(S1_T1.itm_sub1.eq(S1_T3.itm_sub1))
									.and(S1_T1.itm_sub2.eq(S1_T3.itm_sub2))
									.and(S1_T1.itm_sub3.eq(S1_T3.itm_sub3))
									.and(S1_T1.lot_no.eq(S1_T3.lot_no))
									.and(S1_T1.sublot_no.eq(S1_T3.sublot_no))
								)
							)
							.leftOuterJoin(S1_M1).on(
								bracket(
									S1_T1.itm_cd.eq(S1_M1.itm_cd)
									.and(S1_T1.itm_sub1.eq(S1_M1.itm_sub1))
									.and(S1_T1.itm_sub2.eq(S1_M1.itm_sub2))
									.and(S1_T1.itm_sub3.eq(S1_M1.itm_sub3))
								)
							)
							.leftOuterJoin(S1_M2).on(
								bracket(
									S1_T1.itm_cd.eq(S1_M2.itm_cd)
									.and(S1_T1.itm_sub1.eq(S1_M2.itm_sub1))
									.and(S1_T1.itm_sub2.eq(S1_M2.itm_sub2))
									.and(S1_T1.itm_sub3.eq(S1_M2.itm_sub3))
									.and(
										nvl(
											S1_T1.alloc_sno1,
											S1_T1.sno1
										).eq(S1_M2.sno1)
									)
									.and(
										nvl(
											S1_T1.alloc_sno2,
											S1_T1.sno2
										).eq(S1_M2.sno2)
									)
									.and(
										nvl(
											S1_T1.alloc_sno3,
											S1_T1.sno3
										).eq(S1_M2.sno3)
									)
									.and(
										nvl(
											S1_T1.alloc_sno4,
											S1_T1.sno4
										).eq(S1_M2.sno4)
									)
								)
							)
							.innerJoin(S1_T4).on(
								bracket(
									S1_T1.oper_inst_no.eq(S1_T4.oper_inst_no)
								)
							)
							.leftOuterJoin(S1_M3).on(
								bracket(
									S1_T1.inpt_loc_cd.eq(S1_M3.loc_cd)
								)
							)
							.leftOuterJoin(S1_M4).on(
								bracket(
									S1_T1.inpt_loc_cd.eq(S1_M4.loc_cd)
									.and(S1_T1.inpt_str_ln_cd.eq(S1_M4.str_ln_cd))
								)
							)
							.leftOuterJoin(S1_M5).on(
								bracket(
									S1_T1.alt_grp_cd.eq(S1_M5.alt_grp_cd)
									.and(S1_M3.wg_cd.eq(S1_M5.wg_cd))
								)
							)
							.leftOuterJoin(S1_M6).on(
								bracket(
									S1_T1.base_unit_cd.eq(S1_M6.unit_cd)
								)
							)
							.leftOuterJoin(S1_M7).on(
								bracket(
									S1_T1.cont_fctr_unit_cd.eq(S1_M7.unit_cd)
								)
							)
							.leftOuterJoin(S1_M8).on(
								bracket(
									S1_T1.gd_cd.eq(S1_M8.gd_cd)
								)
							)
							.leftOuterJoin(S1_M9).on(
								bracket(
									S1_T1.inpt_rsn_cd.eq(S1_M9.biz_rsn_cd)
								)
							)
						)
						.where(
							value(0).eq(value(0))
							.and(S1_T1.itm_mfg_inst_no.eq(bind("itm_mfg_inst_no")))
							.cutoff$and(
								bracket(
									S1_T1.mfg_inst_no.isNull()
									.or(S1_T1.mfg_inst_no.neq(bind("mfg_inst_no")))
								)
							)
							.and(S1_T1.can_flg.eq(value(false)))
						)
					)
					.orderBy(
						pr("oper_disp_seq").asc(),
						pr("disp_seq").asc(),
						pr("alt_grp_cd").asc(),
						pr("alt_grp_seq").asc(),
						pr("itm_cd").asc()
					)
			);
	}
	
	/**
	 * -- MSBCL1010_MST_ITM_MFG_INST_ALL_R_Query_S01
	 */
	static MCQueryPlan MSBCL1010_MST_ITM_MFG_INST_ALL_R_S01() {
		MST_ITM_MFG_INST_R S0_T0 = MST_ITM_MFG_INST_R.create("T0");
		MST_ITM_MFG_INST_P_R S0_T1 = MST_ITM_MFG_INST_P_R.create("T1");
		MSVT_WRK_SNO_R S0_T2 = MSVT_WRK_SNO_R.create("T2");
		MST_ITM_ORDER_R S0_T3 = MST_ITM_ORDER_R.create("T3");
		MAM_ITM_R S0_M1 = MAM_ITM_R.create("M1");
		MAM_SUNDRY_ITM_R S0_M2 = MAM_SUNDRY_ITM_R.create("M2");
		MAVM_ITM_WG_R S0_M3 = MAVM_ITM_WG_R.create("M3");
		MAM_LOC_R S0_M4 = MAM_LOC_R.create("M4");
		MAM_LOC_R S0_M5 = MAM_LOC_R.create("M5");
		MAVM_ITM_DTL_MFG_R S0_M6 = MAVM_ITM_DTL_MFG_R.create("M6");
		MAM_UNIT_R S0_M7 = MAM_UNIT_R.create("M7");
		MAM_WG_R S0_M8 = MAM_WG_R.create("M8");
		MAM_SITE_R S0_M9 = MAM_SITE_R.create("M9");
		MAM_STR_LN_R S0_M10 = MAM_STR_LN_R.create("M10");
		MAM_STR_LN_R S0_M11 = MAM_STR_LN_R.create("M11");
		MAM_BP_R S0_M12 = MAM_BP_R.create("M12");
		MST_ITM_MFG_INST_R S1_TMP = MST_ITM_MFG_INST_R.create("TMP");
		MAVM_RD_LOC_R S2_V1 = MAVM_RD_LOC_R.create("V1");
		MST_ITM_MFG_INST_R S3_T1 = MST_ITM_MFG_INST_R.create("T1");
		MSVT_WRK_SNO_R S3_T2 = MSVT_WRK_SNO_R.create("T2");
		MST_ITM_ORDER_R S3_T3 = MST_ITM_ORDER_R.create("T3");
		MAM_ITM_R S3_M1 = MAM_ITM_R.create("M1");
		MAM_SUNDRY_ITM_R S3_M2 = MAM_SUNDRY_ITM_R.create("M2");
		MAVM_ITM_WG_R S3_M3 = MAVM_ITM_WG_R.create("M3");
		MAM_LOC_R S3_M4 = MAM_LOC_R.create("M4");
		MAM_LOC_R S3_M5 = MAM_LOC_R.create("M5");
		MAVM_ITM_DTL_MFG_R S3_M6 = MAVM_ITM_DTL_MFG_R.create("M6");
		MAM_UNIT_R S3_M7 = MAM_UNIT_R.create("M7");
		MAM_WG_R S3_M8 = MAM_WG_R.create("M8");
		MAM_SITE_R S3_M9 = MAM_SITE_R.create("M9");
		MAM_STR_LN_R S3_M10 = MAM_STR_LN_R.create("M10");
		MAM_STR_LN_R S3_M11 = MAM_STR_LN_R.create("M11");
		MAM_BP_R S3_M12 = MAM_BP_R.create("M12");
		MST_ITM_MFG_INST_R S4_TMP = MST_ITM_MFG_INST_R.create("TMP");
		MAVM_RD_LOC_R S5_V1 = MAVM_RD_LOC_R.create("V1");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBCL1010_MST_ITM_MFG_INST_ALL_R_Query_S01")
					.mainQuery()
					.select(
						S0_T1.mfg_mtd_typ,
						nullValue().as("mfg_sts_typ"),
						S0_T1.master_dt,
						nullValue().as("rqst_dlv_rqst_dt"),
						nullValue().as("rqst_dlv_rqst_hm"),
						nullValue().as("st_schd_dt"),
						nullValue().as("st_schd_hm"),
						nullValue().as("end_schd_dt"),
						nullValue().as("end_schd_hm"),
						S0_T1.itm_cd,
						S0_T1.itm_sub1,
						S0_T1.itm_sub2,
						S0_T1.itm_sub3,
						nvl(
							S0_M2.itm_nm,
							S0_M1.itm_nm
						).as("itm_nm"),
						S0_M1.lot_mng_typ,
						S0_M1.lot_no_typ,
						S0_M1.lot_no_ptn_cd,
						S0_M1.lot_mng_typ,
						S0_M1.lot_no_typ,
						S0_M1.lot_no_ptn_cd,
						S0_M1.sublot_mng_typ,
						S0_M1.sublot_no_typ,
						S0_M1.sublot_no_ptn_cd,
						S0_M1.sno1_mng_typ,
						S0_M1.sno2_mng_typ,
						S0_M1.sno3_mng_typ,
						S0_M1.sno4_mng_typ,
						S0_M3.inpt_itm_add_flg,
						S0_M3.inpt_itm_del_flg,
						S0_T1.mfg_loc_cd,
						S0_M4.loc_nm.as("mfg_loc_nm"),
						S0_M4.str_ln_tgt_flg.as("mfg_str_ln_tgt_flg"),
						S0_T1.strg_loc_cd,
						S0_M5.loc_nm.as("strg_loc_nm"),
						S0_M5.str_ln_tgt_flg.as("strg_str_ln_tgt_flg"),
						S0_T1.sppl_cd,
						S0_M12.bp_nm.as("sppl_nm"),
						S0_T1.bom_ptn,
						S0_T1.oper_ptn,
						S0_M6.yield_schd_qty.as("mst_yield_schd_qty"),
						S0_M6.mfg_inst_qty.as("mst_mfg_inst_qty"),
						S0_M6.fxd_rqmt_qty.as("mst_fxd_rqmt_qty"),
						S0_M6.lot_issue_typ,
						S0_M6.ln_stk_flg,
						S0_M6.bkf_flg,
						S0_T1.base_unit_inst_qty,
						S0_T1.base_unit_yield_qty,
						S0_T1.base_unit_cd,
						S0_M7.unit_nm.as("base_unit_nm"),
						S0_M1.dec_place.as("base_unit_dec_place"),
						nullValue().as("inst_dt"),
						nullValue().as("inst_usr_cd"),
						nullValue().as("inst_usr_nm"),
						nullValue().as("inst_dpt_cd"),
						nullValue().as("inst_dpt_nm"),
						S0_T1.lot_no,
						S0_T1.sublot_no,
						S0_T1.sno1,
						S0_T1.sno2,
						S0_T1.sno3,
						S0_T1.sno4,
						S0_T2.wrk_no,
						S0_T2.wrk_nm,
						S0_T1.mfg_str_ln_cd.as("mfg_str_ln_cd"),
						S0_M10.str_ln_nm.as("mfg_str_ln_nm"),
						S0_T1.strg_str_ln_cd.as("strg_str_ln_cd"),
						S0_M11.str_ln_nm.as("strg_str_ln_nm"),
						nullValue().as("po_locked_flg"),
						nullValue().as("inst_abort_flg"),
						nullValue().as("org_inst_abort_flg"),
						nullValue().as("inst_rpt_rmrks"),
						nullValue().as("intr_rmrks"),
						nullValue().as("inst_po_cnt_rmrks"),
						nullValue().as("disp_pd"),
						S0_T1.itm_lower_yield,
						S0_T1.itm_std_yield,
						S0_T1.itm_upper_yield,
						nullValue().as("mfg_inst_no"),
						nullValue().as("mfg_inst_rev_no"),
						nullValue().as("inst_prnt_tm"),
						nullValue().as("inst_prnt_flg"),
						nullValue().as("can_flg"),
						S0_T1.itm_mfg_inst_no,
						S0_T1.itm_ord_no,
						nullValue().as("mfg_inst_unit_typ"),
						S0_T1.unschd_inst_flg,
						S0_T1.unschd_act_flg,
						nullValue().as("schd_chg_flg"),
						S0_T3.inst_qty.as("base_unit_ord_qty"),
						S0_T3.not_inst_qty.as("base_unit_not_inst_qty"),
						cases()
							.when(S0_T3.not_inst_qty.gt(value(0)))
								.then(value(false))
							.when(
								S0_T3.inst_qty.gt(subQuery()
									.select(sum(S1_TMP.base_unit_inst_qty))
									.from(S1_TMP)
									.where(
										S1_TMP.itm_ord_no.eq(S0_T3.itm_ord_no)
										.and(S1_TMP.can_flg.eq(value(false)))
									)
								)
							)
								.then(value(true))
							.otherwise(value(false)).as("ord_abort_flg"),
						S0_T3.mfg_st_schd_dt.as("ord_mfg_st_schd_dt"),
						S0_T3.mfg_end_schd_dt.as("ord_mfg_end_schd_dt"),
						S0_T3.itm_ord_sts_typ,
						S0_T3.for_scheduler_frozen_flg,
						S0_T1.wg_cd.as("mfg_loc_wg_cd"),
						S0_M8.wg_nm.as("mfg_loc_wg_nm"),
						S0_M4.site_cd.as("mfg_loc_site_cd"),
						S0_M9.site_nm.as("mfg_loc_site_nm"),
						nullValue().as("po_d_no"),
						nullValue().as("po_aprv_sts_typ"),
						nullValue().as("po_auto_reg_flg"),
						S0_T1.sub_char1.as("itm_mfg_inst_sub_char1"),
						S0_T1.sub_char2.as("itm_mfg_inst_sub_char2"),
						S0_T1.sub_char3.as("itm_mfg_inst_sub_char3"),
						nullValue().as("mfg_inst_sub_char1"),
						nullValue().as("mfg_inst_sub_char2"),
						nullValue().as("mfg_inst_sub_char3"),
						S0_M1.th_image,
						nullValue().as("mfg_aprv_sts_typ"),
						nullValue().as("aprv_dt"),
						nullValue().as("aprv_tm"),
						nullValue().as("aprv_dpt_cd"),
						nullValue().as("aprv_dpt_nm"),
						nullValue().as("aprv_usr_cd"),
						nullValue().as("aprv_usr_nm"),
						nullValue().as("aprv_rsn"),
						nullValue().as("ins_usr_id"),
						nullValue().as("ins_usr_nm"),
						nullValue().as("ins_func_id"),
						nullValue().as("ins_ts"),
						S0_T3.upd_cntr.as("itm_ord_upd_cntr"),
						S0_T0.upd_cntr.as("itm_mfg_inst_upd_cntr"),
						nullValue().as("mfg_inst_upd_cntr"),
						nullValue().as("upd_usr_id"),
						nullValue().as("upd_usr_nm"),
						nullValue().as("upd_func_id"),
						nullValue().as("upd_ts"),
						nullValue().as("upd_srv_req_no")
					)
					.from(
						S0_T0
						.innerJoin(S0_T1).on(
							bracket(
								S0_T0.itm_mfg_inst_no.eq(S0_T1.itm_mfg_inst_no)
							)
						)
						.leftOuterJoin(S0_T2).on(
							bracket(
								S0_T1.sno1.eq(S0_T2.sno1)
							)
						)
						.innerJoin(S0_T3).on(
							bracket(
								S0_T1.itm_ord_no.eq(S0_T3.itm_ord_no)
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
								S0_T1.itm_cd.eq(S0_M2.itm_cd)
								.and(S0_T1.itm_sub1.eq(S0_M2.itm_sub1))
								.and(S0_T1.itm_sub2.eq(S0_M2.itm_sub2))
								.and(S0_T1.itm_sub3.eq(S0_M2.itm_sub3))
								.and(S0_T1.sno1.eq(S0_M2.sno1))
								.and(S0_T1.sno2.eq(S0_M2.sno2))
								.and(S0_T1.sno3.eq(S0_M2.sno3))
								.and(S0_T1.sno4.eq(S0_M2.sno4))
							)
						)
						.leftOuterJoin(S0_M3).on(
							bracket(
								S0_T1.itm_cd.eq(S0_M3.itm_cd)
								.and(S0_T1.itm_sub1.eq(S0_M3.itm_sub1))
								.and(S0_T1.itm_sub2.eq(S0_M3.itm_sub2))
								.and(S0_T1.itm_sub3.eq(S0_M3.itm_sub3))
								.and(S0_T1.wg_cd.eq(S0_M3.wg_cd))
							)
						)
						.leftOuterJoin(S0_M4).on(
							bracket(
								S0_T1.mfg_loc_cd.eq(S0_M4.loc_cd)
							)
						)
						.leftOuterJoin(S0_M5).on(
							bracket(
								S0_T1.strg_loc_cd.eq(S0_M5.loc_cd)
							)
						)
						.leftOuterJoin(S0_M6).on(
							bracket(
								S0_T1.itm_cd.eq(S0_M6.itm_cd)
								.and(S0_T1.itm_sub1.eq(S0_M6.itm_sub1))
								.and(S0_T1.itm_sub2.eq(S0_M6.itm_sub2))
								.and(S0_T1.itm_sub3.eq(S0_M6.itm_sub3))
								.and(S0_T1.mfg_loc_cd.eq(S0_M6.mfg_loc_cd))
								.and(S0_M6.sppl_cd.eq(value(MAC_STR.NULL_VAL.value())))
								.and(S0_M6.maker_cd.eq(value(MAC_STR.NULL_VAL.value())))
								.and(S0_M6.rqst_loc_cd.eq(value(MAC_STR.NULL_VAL.value())))
								.and(S0_T1.wg_cd.eq(S0_M6.wg_cd))
								.and(S0_T1.bom_ptn.eq(S0_M6.bom_ptn))
								.and(S0_T1.master_dt.between(S0_M6.st_dt, S0_M6.end_dt))
							)
						)
						.leftOuterJoin(S0_M7).on(
							bracket(
								S0_T1.base_unit_cd.eq(S0_M7.unit_cd)
							)
						)
						.leftOuterJoin(S0_M8).on(
							bracket(
								S0_T1.wg_cd.eq(S0_M8.wg_cd)
							)
						)
						.leftOuterJoin(S0_M9).on(
							bracket(
								S0_T1.site_cd.eq(S0_M9.site_cd)
							)
						)
						.leftOuterJoin(S0_M10).on(
							bracket(
								S0_T1.mfg_loc_cd.eq(S0_M10.loc_cd)
								.and(S0_T1.mfg_str_ln_cd.eq(S0_M10.str_ln_cd))
							)
						)
						.leftOuterJoin(S0_M11).on(
							bracket(
								S0_T1.strg_loc_cd.eq(S0_M11.loc_cd)
								.and(S0_T1.strg_str_ln_cd.eq(S0_M11.str_ln_cd))
							)
						)
						.leftOuterJoin(S0_M12).on(
							bracket(
								S0_T1.sppl_cd.eq(S0_M12.bp_cd)
							)
						)
					)
					.where(
						value(0).eq(value(0))
						.and(S0_T1.mfg_inst_no.eq(bind("mfg_inst_no")))
						.and(S0_T1.mfg_inst_rev.eq(bind("mfg_inst_rev")))
						.and(
							bracket(
								bind("ope_val").eq(value(true))
								.and(
									exists(
										subQuery()
										.select(value("X"))
										.from(S2_V1)
										.where(
											S2_V1.loc_cd.eq(S0_T1.mfg_loc_cd)
										)
									)
								)
							)
							.or(bind("ope_val").neq(value(true)))
						)
					)
					.unionAll(
						subQuery()
						.select(
							S3_T1.mfg_mtd_typ,
							nullValue().as("mfg_sts_typ"),
							S3_T1.master_dt,
							nullValue().as("rqst_dlv_rqst_dt"),
							nullValue().as("rqst_dlv_rqst_hm"),
							nullValue().as("st_schd_dt"),
							nullValue().as("st_schd_hm"),
							nullValue().as("end_schd_dt"),
							nullValue().as("end_schd_hm"),
							S3_T1.itm_cd,
							S3_T1.itm_sub1,
							S3_T1.itm_sub2,
							S3_T1.itm_sub3,
							nvl(
								S3_M2.itm_nm,
								S3_M1.itm_nm
							).as("itm_nm"),
							S3_M1.lot_mng_typ,
							S3_M1.lot_no_typ,
							S3_M1.lot_no_ptn_cd,
							S3_M1.lot_mng_typ,
							S3_M1.lot_no_typ,
							S3_M1.lot_no_ptn_cd,
							S3_M1.sublot_mng_typ,
							S3_M1.sublot_no_typ,
							S3_M1.sublot_no_ptn_cd,
							S3_M1.sno1_mng_typ,
							S3_M1.sno2_mng_typ,
							S3_M1.sno3_mng_typ,
							S3_M1.sno4_mng_typ,
							S3_M3.inpt_itm_add_flg,
							S3_M3.inpt_itm_del_flg,
							S3_T1.mfg_loc_cd,
							S3_M4.loc_nm.as("mfg_loc_nm"),
							S3_M4.str_ln_tgt_flg.as("mfg_str_ln_tgt_flg"),
							S3_T1.strg_loc_cd,
							S3_M5.loc_nm.as("strg_loc_nm"),
							S3_M5.str_ln_tgt_flg.as("strg_str_ln_tgt_flg"),
							S3_T1.sppl_cd,
							S3_M12.bp_nm.as("sppl_nm"),
							S3_T1.bom_ptn,
							S3_T1.oper_ptn,
							S3_M6.yield_schd_qty.as("mst_yield_schd_qty"),
							S3_M6.mfg_inst_qty.as("mst_mfg_inst_qty"),
							S3_M6.fxd_rqmt_qty.as("mst_fxd_rqmt_qty"),
							S3_M6.lot_issue_typ,
							S3_M6.ln_stk_flg,
							S3_M6.bkf_flg,
							S3_T1.base_unit_inst_qty,
							S3_T1.base_unit_yield_qty,
							S3_T1.base_unit_cd,
							S3_M7.unit_nm.as("base_unit_nm"),
							S3_M1.dec_place.as("base_unit_dec_place"),
							nullValue().as("inst_dt"),
							nullValue().as("inst_usr_cd"),
							nullValue().as("inst_usr_nm"),
							nullValue().as("inst_dpt_cd"),
							nullValue().as("inst_dpt_nm"),
							S3_T1.lot_no,
							S3_T1.sublot_no,
							S3_T1.sno1,
							S3_T1.sno2,
							S3_T1.sno3,
							S3_T1.sno4,
							S3_T2.wrk_no,
							S3_T2.wrk_nm,
							S3_T1.mfg_str_ln_cd.as("mfg_str_ln_cd"),
							S3_M10.str_ln_nm.as("mfg_str_ln_nm"),
							S3_T1.strg_str_ln_cd.as("strg_str_ln_cd"),
							S3_M11.str_ln_nm.as("strg_str_ln_nm"),
							nullValue().as("po_locked_flg"),
							nullValue().as("inst_abort_flg"),
							nullValue().as("org_inst_abort_flg"),
							nullValue().as("inst_rpt_rmrks"),
							nullValue().as("intr_rmrks"),
							S3_T3.inst_po_cnt_rmrks.as("inst_po_cnt_rmrks"),
							nullValue().as("disp_pd"),
							S3_T1.itm_lower_yield,
							S3_T1.itm_std_yield,
							S3_T1.itm_upper_yield,
							nullValue().as("mfg_inst_no"),
							nullValue().as("mfg_inst_rev_no"),
							nullValue().as("inst_prnt_tm"),
							nullValue().as("inst_prnt_flg"),
							nullValue().as("can_flg"),
							S3_T1.itm_mfg_inst_no,
							S3_T1.itm_ord_no,
							S3_T3.mfg_inst_unit_typ,
							S3_T1.unschd_inst_flg,
							S3_T1.unschd_act_flg,
							nullValue().as("schd_chg_flg"),
							S3_T3.inst_qty.as("base_unit_ord_qty"),
							S3_T3.not_inst_qty.as("base_unit_not_inst_qty"),
							cases()
								.when(S3_T3.not_inst_qty.gt(value(0)))
									.then(value(false))
								.when(
									S3_T3.inst_qty.gt(subQuery()
										.select(sum(S4_TMP.base_unit_inst_qty))
										.from(S4_TMP)
										.where(
											S4_TMP.itm_ord_no.eq(S3_T3.itm_ord_no)
										)
									)
								)
									.then(value(true))
								.otherwise(value(false)).as("ord_abort_flg"),
							S3_T3.mfg_st_schd_dt.as("ord_mfg_st_schd_dt"),
							S3_T3.mfg_end_schd_dt.as("ord_mfg_end_schd_dt"),
							S3_T3.itm_ord_sts_typ,
							S3_T3.for_scheduler_frozen_flg,
							S3_T1.wg_cd.as("mfg_loc_wg_cd"),
							S3_M8.wg_nm.as("mfg_loc_wg_nm"),
							S3_M4.site_cd.as("mfg_loc_site_cd"),
							S3_M9.site_nm.as("mfg_loc_site_nm"),
							nullValue().as("po_d_no"),
							nullValue().as("po_aprv_sts_typ"),
							nullValue().as("po_auto_reg_flg"),
							S3_T1.sub_char1.as("itm_mfg_inst_sub_char1"),
							S3_T1.sub_char2.as("itm_mfg_inst_sub_char2"),
							S3_T1.sub_char3.as("itm_mfg_inst_sub_char3"),
							nullValue().as("mfg_inst_sub_char1"),
							nullValue().as("mfg_inst_sub_char2"),
							nullValue().as("mfg_inst_sub_char3"),
							S3_M1.th_image,
							nullValue().as("mfg_aprv_sts_typ"),
							nullValue().as("aprv_dt"),
							nullValue().as("aprv_tm"),
							nullValue().as("aprv_dpt_cd"),
							nullValue().as("aprv_dpt_nm"),
							nullValue().as("aprv_usr_cd"),
							nullValue().as("aprv_usr_nm"),
							nullValue().as("aprv_rsn"),
							nullValue().as("ins_usr_id"),
							nullValue().as("ins_usr_nm"),
							nullValue().as("ins_func_id"),
							nullValue().as("ins_ts"),
							S3_T3.upd_cntr.as("itm_ord_upd_cntr"),
							S3_T1.upd_cntr.as("itm_mfg_inst_upd_cntr"),
							nullValue().as("mfg_inst_upd_cntr"),
							nullValue().as("upd_usr_id"),
							nullValue().as("upd_usr_nm"),
							nullValue().as("upd_func_id"),
							nullValue().as("upd_ts"),
							nullValue().as("upd_srv_req_no")
						)
						.from(
							S3_T1
							.leftOuterJoin(S3_T2).on(
								bracket(
									S3_T1.sno1.eq(S3_T2.sno1)
								)
							)
							.innerJoin(S3_T3).on(
								bracket(
									S3_T1.itm_ord_no.eq(S3_T3.itm_ord_no)
								)
							)
							.leftOuterJoin(S3_M1).on(
								bracket(
									S3_T1.itm_cd.eq(S3_M1.itm_cd)
									.and(S3_T1.itm_sub1.eq(S3_M1.itm_sub1))
									.and(S3_T1.itm_sub2.eq(S3_M1.itm_sub2))
									.and(S3_T1.itm_sub3.eq(S3_M1.itm_sub3))
								)
							)
							.leftOuterJoin(S3_M2).on(
								bracket(
									S3_T1.itm_cd.eq(S3_M2.itm_cd)
									.and(S3_T1.itm_sub1.eq(S3_M2.itm_sub1))
									.and(S3_T1.itm_sub2.eq(S3_M2.itm_sub2))
									.and(S3_T1.itm_sub3.eq(S3_M2.itm_sub3))
									.and(S3_T1.sno1.eq(S3_M2.sno1))
									.and(S3_T1.sno2.eq(S3_M2.sno2))
									.and(S3_T1.sno3.eq(S3_M2.sno3))
									.and(S3_T1.sno4.eq(S3_M2.sno4))
								)
							)
							.leftOuterJoin(S3_M3).on(
								bracket(
									S3_T1.itm_cd.eq(S3_M3.itm_cd)
									.and(S3_T1.itm_sub1.eq(S3_M3.itm_sub1))
									.and(S3_T1.itm_sub2.eq(S3_M3.itm_sub2))
									.and(S3_T1.itm_sub3.eq(S3_M3.itm_sub3))
									.and(S3_T1.wg_cd.eq(S3_M3.wg_cd))
								)
							)
							.leftOuterJoin(S3_M4).on(
								bracket(
									S3_T1.mfg_loc_cd.eq(S3_M4.loc_cd)
								)
							)
							.leftOuterJoin(S3_M5).on(
								bracket(
									S3_T1.strg_loc_cd.eq(S3_M5.loc_cd)
								)
							)
							.leftOuterJoin(S3_M6).on(
								bracket(
									S3_T1.itm_cd.eq(S3_M6.itm_cd)
									.and(S3_T1.itm_sub1.eq(S3_M6.itm_sub1))
									.and(S3_T1.itm_sub2.eq(S3_M6.itm_sub2))
									.and(S3_T1.itm_sub3.eq(S3_M6.itm_sub3))
									.and(S3_T1.mfg_loc_cd.eq(S3_M6.mfg_loc_cd))
									.and(S3_M6.sppl_cd.eq(value(MAC_STR.NULL_VAL.value())))
									.and(S3_M6.maker_cd.eq(value(MAC_STR.NULL_VAL.value())))
									.and(S3_M6.rqst_loc_cd.eq(value(MAC_STR.NULL_VAL.value())))
									.and(S3_T1.wg_cd.eq(S3_M6.wg_cd))
									.and(S3_T1.bom_ptn.eq(S3_M6.bom_ptn))
									.and(S3_T1.master_dt.between(S3_M6.st_dt, S3_M6.end_dt))
								)
							)
							.leftOuterJoin(S3_M7).on(
								bracket(
									S3_T1.base_unit_cd.eq(S3_M7.unit_cd)
								)
							)
							.leftOuterJoin(S3_M8).on(
								bracket(
									S3_T1.wg_cd.eq(S3_M8.wg_cd)
								)
							)
							.leftOuterJoin(S3_M9).on(
								bracket(
									S3_T1.site_cd.eq(S3_M9.site_cd)
								)
							)
							.leftOuterJoin(S3_M10).on(
								bracket(
									S3_T1.mfg_loc_cd.eq(S3_M10.loc_cd)
									.and(S3_T1.mfg_str_ln_cd.eq(S3_M10.str_ln_cd))
								)
							)
							.leftOuterJoin(S3_M11).on(
								bracket(
									S3_T1.strg_loc_cd.eq(S3_M11.loc_cd)
									.and(S3_T1.strg_str_ln_cd.eq(S3_M11.str_ln_cd))
								)
							)
							.leftOuterJoin(S3_M12).on(
								bracket(
									S3_T1.sppl_cd.eq(S3_M12.bp_cd)
								)
							)
						)
						.where(
							value(0).eq(value(0))
							.and(S3_T1.itm_mfg_inst_no.eq(bind("itm_mfg_inst_no")))
							.and(
								bracket(
									bind("ope_val").eq(value(true))
									.and(
										exists(
											subQuery()
											.select(value("X"))
											.from(S5_V1)
											.where(
												S5_V1.loc_cd.eq(S3_T1.mfg_loc_cd)
											)
										)
									)
								)
								.or(bind("ope_val").neq(value(true)))
							)
						)
					)
			);
	}
	
	/**
	 * -- MSBCL1010_MST_ITM_ORDER_Query_S01
	 */
	static MCQueryPlan MSBCL1010_MST_ITM_ORDER_S01() {
		MST_ITM_ORDER_R S0_T1 = MST_ITM_ORDER_R.create("T1");
		MCTempView S0_T3 = createTempView("T3");
		MCTempView S0_T4 = createTempView("T4");
		MAM_ITM_R S0_M1 = MAM_ITM_R.create("M1");
		MAM_SUNDRY_ITM_R S0_M2 = MAM_SUNDRY_ITM_R.create("M2");
		MAVM_RD_LOC_R S0_M4 = MAVM_RD_LOC_R.create("M4");
		MAVM_ITM_DTL_MFG_R S0_M6 = MAVM_ITM_DTL_MFG_R.create("M6");
		MAM_ITM_NOT_FIX_R S0_M13 = MAM_ITM_NOT_FIX_R.create("M13");
		MAM_STR_LN_R S0_M14 = MAM_STR_LN_R.create("M14");
		MST_PO_SCHD_R S1_A = MST_PO_SCHD_R.create("A");
		MST_PO_D_R S2_A = MST_PO_D_R.create("A");
		MST_ITM_ORDER_R S1_T1 = MST_ITM_ORDER_R.create("ST1");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBCL1010_MST_ITM_ORDER_Query_S01")
					.mainQuery()
					.select(
						cases()
							.when(S0_T1.itm_ord_typ.eq(value(MSC_ITM_ORD_TYP.MFG.value())))
								.then(value(MSC_MFG_MTD_TYP.INTNL.value()))
							.otherwise(value(MSC_MFG_MTD_TYP.EXTNL.value())).as("mfg_mtd_typ"),
						S0_T1.master_dt.as("master_dt"),
						cases()
							.when(S0_T1.itm_ord_typ.eq(value(MSC_ITM_ORD_TYP.MFG.value())))
								.then(value((MCDate)null))
							.otherwise(S0_T1.strg_schd_dt).as("rqst_dlv_rqst_dt"),
						nullValue().as("rqst_dlv_rqst_hm"),
						S0_T1.mfg_st_schd_dt.as("st_schd_dt"),
						nullValue().as("st_schd_hm"),
						S0_T1.mfg_end_schd_dt.as("end_schd_dt"),
						nullValue().as("end_schd_hm"),
						S0_T1.itm_cd,
						S0_T1.itm_sub1,
						S0_T1.itm_sub2,
						S0_T1.itm_sub3,
						nvl(
							S0_M2.itm_nm,
							S0_M1.itm_nm
						).as("itm_nm"),
						S0_M1.lot_mng_typ,
						S0_M1.lot_no_typ,
						S0_M1.lot_no_ptn_cd,
						S0_M1.sublot_mng_typ,
						S0_M1.sublot_no_typ,
						S0_M1.sublot_no_ptn_cd,
						S0_M1.sno1_mng_typ,
						S0_M1.sno2_mng_typ,
						S0_M1.sno3_mng_typ,
						S0_M1.sno4_mng_typ,
						S0_T1.mfg_loc_cd,
						S0_M4.loc_nm.as("mfg_loc_nm"),
						S0_M4.str_ln_tgt_flg.as("mfg_str_ln_tgt_flg"),
						S0_M4.sppl_cd,
						S0_T1.strg_loc_cd,
						S0_T1.bom_ptn,
						S0_T1.oper_ptn,
						S0_M6.yield_schd_qty.as("mst_yield_schd_qty"),
						S0_M6.mfg_inst_qty.as("mst_mfg_inst_qty"),
						S0_M6.fxd_rqmt_qty.as("mst_fxd_rqmt_qty"),
						S0_M6.lot_issue_typ,
						S0_M6.ln_stk_flg,
						S0_M6.bkf_flg,
						S0_T1.not_inst_qty.as("base_unit_inst_qty"),
						S0_T1.yield_schd_qty.as("base_unit_yield_qty"),
						S0_M1.unit_cd.as("base_unit_cd"),
						S0_M1.dec_place.as("base_unit_dec_place"),
						nullValue().as("inst_dt"),
						nullValue().as("inst_usr_cd"),
						nullValue().as("inst_usr_nm"),
						nullValue().as("inst_dpt_cd"),
						nullValue().as("inst_dpt_nm"),
						nullValue().as("lot_no"),
						nullValue().as("sublot_no"),
						S0_T1.sno1,
						S0_T1.sno2,
						S0_T1.sno3,
						S0_T1.sno4,
						value(MAC_STR.NULL_VAL.value()).as("mfg_str_ln_cd"),
						nullValue().as("mfg_str_ln_nm"),
						value(MAC_STR.NULL_VAL.value()).as("strg_str_ln_cd"),
						nullValue().as("strg_str_ln_nm"),
						value(false).as("po_locked_flg"),
						value(false).as("inst_abort_flg"),
						value(false).as("org_inst_abort_flg"),
						nullValue().as("inst_rpt_rmrks"),
						nullValue().as("intr_rmrks"),
						cases()
							.when(
								S0_T1.itm_ord_typ.eq(value(MSC_ITM_ORD_TYP.OUTSRC.value()))
								.and(S0_T1.ord_gnrt_typ.eq(value(MSC_ORD_GNRT_TYP.UPLND.value())))
							)
								.then(
									subQuery()
									.select(S1_T1.inst_po_cnt_rmrks)
									.from(S1_T1)
									.where(
										S1_T1.io_schd_pr_no.eq(S0_T1.io_schd_pr_no)
										.and(S1_T1.ord_gnrt_typ.eq(value(MSC_ORD_GNRT_TYP.MNL.value())))
									)
								)
							.otherwise(S0_T1.inst_po_cnt_rmrks).as("inst_po_cnt_rmrks"),
						nullValue().as("disp_pd"),
						S0_M6.itm_lower_yield,
						S0_M6.itm_std_yield,
						S0_M6.itm_upper_yield,
						nullValue().as("mfg_inst_no"),
						nullValue().as("mfg_inst_rev"),
						nullValue().as("inst_prnt_tm"),
						value(false).as("inst_prnt_flg"),
						value(false).as("can_flg"),
						nullValue().as("itm_mfg_inst_no"),
						S0_T1.itm_ord_no,
						value(false).as("unschd_inst_flg"),
						value(false).as("unschd_act_flg"),
						value(false).as("schd_chg_flg"),
						S0_T1.inst_qty.as("base_unit_ord_qty"),
						S0_T1.not_inst_qty.as("base_unit_not_inst_qty"),
						value(false).as("ord_abort_flg"),
						S0_T1.mfg_st_schd_dt.as("ord_mfg_st_schd_dt"),
						S0_T1.mfg_end_schd_dt.as("ord_mfg_end_schd_dt"),
						S0_T1.itm_ord_sts_typ,
						S0_T1.wg_cd.as("mfg_loc_wg_cd"),
						S0_M4.site_cd.as("mfg_loc_site_cd"),
						S0_T4.pr("po_d_no"),
						nullValue().as("po_aprv_sts_typ"),
						value(false).as("po_auto_reg_flg"),
						nullValue().as("itm_mfg_inst_sub_char1"),
						nullValue().as("itm_mfg_inst_sub_char2"),
						nullValue().as("itm_mfg_inst_sub_char3"),
						nullValue().as("mfg_inst_sub_char1"),
						nullValue().as("mfg_inst_sub_char2"),
						nullValue().as("mfg_inst_sub_char3"),
						S0_M1.th_image,
						nullValue().as("mfg_aprv_sts_typ"),
						nullValue().as("aprv_dt"),
						nullValue().as("aprv_tm"),
						nullValue().as("aprv_dpt_cd"),
						nullValue().as("aprv_dpt_nm"),
						nullValue().as("aprv_usr_cd"),
						nullValue().as("aprv_usr_nm"),
						nullValue().as("aprv_rsn"),
						S0_T1.for_scheduler_frozen_flg,
						S0_T1.ins_usr_id.as("ins_usr_id"),
						S0_T1.ins_usr_nm.as("ins_usr_nm"),
						S0_T1.ins_func_id.as("ins_func_id"),
						S0_T1.ins_ts.as("ins_ts"),
						S0_T1.upd_cntr.as("itm_ord_upd_cntr"),
						nullValue().as("itm_mfg_inst_upd_cntr"),
						nullValue().as("mfg_inst_upd_cntr"),
						S0_T1.upd_usr_id.as("upd_usr_id"),
						S0_T1.upd_usr_nm.as("upd_usr_nm"),
						S0_T1.upd_func_id.as("upd_func_id"),
						S0_T1.upd_ts.as("upd_ts"),
						S0_T1.upd_srv_req_no.as("upd_srv_req_no")
					)
					.from(
						S0_T1
						.leftOuterJoin(
							subQuery()
							.select(S1_A.prAll())
							.from(S1_A)
							.where(
								S1_A.can_flg.eq(value(false))
								.and(S1_A.po_flg.eq(value(false)))
							).view(S0_T3)
						).on(
							bracket(
								S0_T1.itm_ord_no.eq(S0_T3.pr("outsrc_itm_ord_no"))
							)
						)
						.leftOuterJoin(
							subQuery()
							.select(S2_A.prAll())
							.from(S2_A)
							.where(
								S2_A.can_flg.eq(value(false))
							).view(S0_T4)
						).on(
							bracket(
								S0_T1.itm_ord_no.eq(S0_T4.pr("outsrc_itm_ord_no"))
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
								S0_T1.itm_cd.eq(S0_M2.itm_cd)
								.and(S0_T1.itm_sub1.eq(S0_M2.itm_sub1))
								.and(S0_T1.itm_sub2.eq(S0_M2.itm_sub2))
								.and(S0_T1.itm_sub3.eq(S0_M2.itm_sub3))
								.and(S0_T1.sno1.eq(S0_M2.sno1))
								.and(S0_T1.sno2.eq(S0_M2.sno2))
								.and(S0_T1.sno3.eq(S0_M2.sno3))
								.and(S0_T1.sno4.eq(S0_M2.sno4))
							)
						)
						.innerJoin(S0_M4).on(
							bracket(
								S0_T1.mfg_loc_cd.eq(S0_M4.loc_cd)
							)
						)
						.leftOuterJoin(S0_M6).on(
							bracket(
								S0_T1.itm_cd.eq(S0_M6.itm_cd)
								.and(S0_T1.itm_sub1.eq(S0_M6.itm_sub1))
								.and(S0_T1.itm_sub2.eq(S0_M6.itm_sub2))
								.and(S0_T1.itm_sub3.eq(S0_M6.itm_sub3))
								.and(S0_T1.mfg_loc_cd.eq(S0_M6.mfg_loc_cd))
								.and(S0_M6.sppl_cd.eq(value(MAC_STR.NULL_VAL.value())))
								.and(S0_M6.maker_cd.eq(value(MAC_STR.NULL_VAL.value())))
								.and(S0_M6.rqst_loc_cd.eq(value(MAC_STR.NULL_VAL.value())))
								.and(S0_T1.wg_cd.eq(S0_M6.wg_cd))
								.and(S0_T1.bom_ptn.eq(S0_M6.bom_ptn))
								.and(S0_T1.master_dt.between(S0_M6.st_dt, S0_M6.end_dt))
							)
						)
						.leftOuterJoin(S0_M13).on(
							bracket(
								S0_T1.itm_cd.eq(S0_M13.itm_cd)
								.and(S0_T1.itm_sub1.eq(S0_M13.itm_sub1))
								.and(S0_T1.itm_sub2.eq(S0_M13.itm_sub2))
								.and(S0_T1.itm_sub3.eq(S0_M13.itm_sub3))
								.and(S0_T1.sno1.eq(S0_M13.sno1))
								.and(S0_T1.sno2.eq(S0_M13.sno2))
								.and(S0_T1.sno3.eq(S0_M13.sno3))
								.and(S0_T1.sno4.eq(S0_M13.sno4))
								.and(S0_T1.wg_cd.eq(S0_M13.wg_cd))
							)
						)
						.leftOuterJoin(S0_M14).on(
							bracket(
								S0_T1.strg_loc_cd.eq(S0_M14.loc_cd)
								.and(S0_T3.pr("str_ln_cd").eq(S0_M14.str_ln_cd))
							)
						)
					)
					.where(
						value(0).eq(value(0))
						.and(S0_T1.itm_ord_no.eq(bind("srch_tgt_no")))
						.and(
							S0_T1.itm_ord_sts_typ.in(
								value(MSC_ITM_ORD_STS_TYP.FIX.value()),
								value(MSC_ITM_ORD_STS_TYP.PART_INST.value()),
								value(MSC_ITM_ORD_STS_TYP.INST.value())
							)
							.or(
								S0_T1.itm_ord_sts_typ.in(
									value(MSC_ITM_ORD_STS_TYP.OPN.value()),
									value(MSC_ITM_ORD_STS_TYP.SAV.value())
								)
								.and(
									decode(
										S0_M13.itm_cd,
										nullValue(),
										S0_T1.not_fix_flg,
										value(true)
									).eq(value(false))
								)
							)
						)
						.and(
							S0_T1.itm_ord_typ.in(
								value(MSC_ITM_ORD_TYP.MFG.value()),
								value(MSC_ITM_ORD_TYP.OUTSRC.value())
							)
						)
						.and(
							value(true).eq(cases()
									.when(S0_T1.itm_ord_typ.eq(value(MSC_ITM_ORD_TYP.MFG.value())))
										.then(value(true))
									.when(S0_T3.pr("po_schd_no").isNotNull())
										.then(value(true))
									.when(S0_T4.pr("po_d_no").isNotNull())
										.then(value(true))
									.otherwise(value(false))
							)
						)
						.and(S0_T1.not_inst_qty.gt(value(0)))
					)
			)
			.setJoinInfo(
				joinInfo(
					j -> j
						.add(MSVT_WRK_SNO_R.class, r -> toCondition(
							r.getStringNE("sno1")
						))
						.addSelect(m -> toArray(
							m.wrk_nm,
							m.wrk_no
						))
						.addMap((r, m) -> {
							r.setStringNE("wrk_no", m.wrk_no());
							r.setStringNE("wrk_nm", m.wrk_nm());
					}),
					j -> j
						.add(MAVM_ITM_WG_R.class, r -> toCondition(
							r.getStringNE("itm_cd"),
							r.getStringNE("itm_sub1"),
							r.getStringNE("itm_sub2"),
							r.getStringNE("itm_sub3"),
							r.getStringNE("mfg_loc_wg_cd")
						))
						.addSelect(m -> toArray(
							m.inpt_itm_add_flg,
							m.inpt_itm_del_flg,
							m.mfg_inst_unit_typ
						))
						.addMap((r, m) -> {
							r.setBooleanNE("inpt_itm_add_flg", m.inpt_itm_add_flg());
							r.setBooleanNE("inpt_itm_del_flg", m.inpt_itm_del_flg());
							r.setStringNE("mfg_inst_unit_typ", m.mfg_inst_unit_typ());
					}),
					j -> j
						.add(MAM_LOC_R.class, r -> toCondition(
							r.getStringNE("strg_loc_cd")
						))
						.addSelect(m -> toArray(
							m.loc_nm,
							m.str_ln_tgt_flg
						))
						.addMap((r, m) -> {
							r.setStringNE("strg_loc_nm", m.loc_nm());
							r.setBooleanNE("strg_str_ln_tgt_flg", m.str_ln_tgt_flg());
					}),
					j -> j
						.add(MAM_UNIT_R.class, r -> toCondition(
							r.getStringNE("base_unit_cd")
						))
						.addSelect(m -> toArray(
							m.unit_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("base_unit_nm", m.unit_nm());
					}),
					j -> j
						.add(MAM_WG_R.class, r -> toCondition(
							r.getStringNE("mfg_loc_wg_cd")
						))
						.addSelect(m -> toArray(
							m.wg_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("mfg_loc_wg_nm", m.wg_nm());
					}),
					j -> j
						.add(MAM_SITE_R.class, r -> toCondition(
							r.getStringNE("mfg_loc_site_cd")
						))
						.addSelect(m -> toArray(
							m.site_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("mfg_loc_site_nm", m.site_nm());
					}),
					j -> j
						.add(MAM_BP_R.class, r -> toCondition(
							r.getStringNE("sppl_cd")
						))
						.addSelect(m -> toArray(
							m.bp_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("sppl_nm", m.bp_nm());
					})
				)
			);
	}
	
	/**
	 * -- MSBCL1010_MST_MFG_INST_ALL_R_Query_S01
	 */
	static MCQueryPlan MSBCL1010_MST_MFG_INST_ALL_R_S01() {
		MST_MFG_INST_R S0_T0 = MST_MFG_INST_R.create("T0");
		MST_MFG_INST_P_R S0_T1 = MST_MFG_INST_P_R.create("T1");
		MST_ITM_MFG_INST_R S0_T2 = MST_ITM_MFG_INST_R.create("T2");
		MSVT_MFG_INST_PR_R S0_T6 = MSVT_MFG_INST_PR_R.create("T6");
		MAM_DPT_R S0_M12 = MAM_DPT_R.create("M12");
		MAM_DPT_R S0_M14 = MAM_DPT_R.create("M14");
		MAVM_APRV_USR_R S1_V2 = MAVM_APRV_USR_R.create("V2");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBCL1010_MST_MFG_INST_ALL_R_Query_S01")
					.mainQuery()
					.select(
						nullValue().as("mfg_mtd_typ"),
						S0_T6.mfg_sts_typ,
						nullValue().as("master_dt"),
						trunc(
							S0_T1.rqst_dlv_rqst_tm,
							MCDateFmt.DD
						).as("rqst_dlv_rqst_dt"),
						S0_T1.rqst_dlv_rqst_tm.as("rqst_dlv_rqst_hm"),
						trunc(
							S0_T1.st_schd_tm,
							MCDateFmt.DD
						).as("st_schd_dt"),
						S0_T1.st_schd_tm.as("st_schd_hm"),
						trunc(
							S0_T1.end_schd_tm,
							MCDateFmt.DD
						).as("end_schd_dt"),
						S0_T1.end_schd_tm.as("end_schd_hm"),
						nullValue().as("itm_cd"),
						nullValue().as("itm_sub1"),
						nullValue().as("itm_sub2"),
						nullValue().as("itm_sub3"),
						nullValue().as("itm_nm"),
						nullValue().as("lot_mng_typ"),
						nullValue().as("lot_no_typ"),
						nullValue().as("lot_no_ptn_cd"),
						nullValue().as("lot_mng_typ"),
						nullValue().as("lot_no_typ"),
						nullValue().as("lot_no_ptn_cd"),
						nullValue().as("sublot_mng_typ"),
						nullValue().as("sublot_no_typ"),
						nullValue().as("sublot_no_ptn_cd"),
						nullValue().as("sno1_mng_typ"),
						nullValue().as("sno2_mng_typ"),
						nullValue().as("sno3_mng_typ"),
						nullValue().as("sno4_mng_typ"),
						nullValue().as("inpt_itm_add_flg"),
						nullValue().as("inpt_itm_del_flg"),
						nullValue().as("mfg_loc_cd"),
						nullValue().as("mfg_loc_nm"),
						nullValue().as("mfg_str_ln_tgt_flg"),
						nullValue().as("strg_loc_cd"),
						nullValue().as("strg_loc_nm"),
						nullValue().as("strg_str_ln_tgt_flg"),
						nullValue().as("bom_ptn"),
						nullValue().as("oper_ptn"),
						nullValue().as("mst_yield_schd_qty"),
						nullValue().as("mst_mfg_inst_qty"),
						nullValue().as("mst_fxd_rqmt_qty"),
						nullValue().as("lot_issue_typ"),
						nullValue().as("ln_stk_flg"),
						S0_T1.base_unit_inst_qty,
						S0_T1.base_unit_yield_qty,
						nullValue().as("base_unit_cd"),
						nullValue().as("base_unit_nm"),
						nullValue().as("base_unit_dec_place"),
						S0_T1.inst_dt,
						S0_T1.inst_usr_cd,
						S0_T1.inst_dpt_cd,
						S0_M12.dpt_nm.as("inst_dpt_nm"),
						nullValue().as("lot_no"),
						nullValue().as("sublot_no"),
						nullValue().as("sno1"),
						nullValue().as("sno2"),
						nullValue().as("sno3"),
						nullValue().as("sno4"),
						nullValue().as("wrk_no"),
						nullValue().as("wrk_nm"),
						nullValue().as("mfg_str_ln_cd"),
						nullValue().as("mfg_str_ln_nm"),
						nullValue().as("strg_str_ln_cd"),
						nullValue().as("strg_str_ln_nm"),
						S0_T1.po_locked_flg,
						S0_T1.abort_flg.as("inst_abort_flg"),
						S0_T1.abort_flg.as("org_inst_abort_flg"),
						S0_T1.inst_rpt_rmrks,
						S0_T1.intr_rmrks,
						S0_T1.inst_po_cnt_rmrks,
						S0_T1.disp_pd,
						S0_T1.mfg_inst_no,
						S0_T1.mfg_inst_rev,
						S0_T1.inst_prnt_tm,
						S0_T1.inst_prnt_flg,
						S0_T1.can_flg,
						S0_T1.itm_mfg_inst_no,
						nullValue().as("itm_ord_no"),
						S0_T1.mfg_inst_unit_typ,
						nullValue().as("unschd_inst_flg"),
						nullValue().as("unschd_act_flg"),
						S0_T1.schd_chg_flg,
						nullValue().as("base_unit_ord_qty"),
						nullValue().as("base_unit_not_inst_qty"),
						nullValue().as("ord_abort_flg"),
						nullValue().as("ord_mfg_st_schd_dt"),
						nullValue().as("ord_mfg_end_schd_dt"),
						nullValue().as("itm_ord_sts_typ"),
						nullValue().as("mfg_loc_wg_cd"),
						nullValue().as("mfg_loc_wg_nm"),
						nullValue().as("mfg_loc_site_cd"),
						nullValue().as("mfg_loc_site_nm"),
						S0_T1.po_d_no.as("po_d_no"),
						S0_T1.po_auto_reg_flg,
						cases()
							.when(
								MAC_MFG_INST_UNIT_TYP$IS_OPER(S0_T1.mfg_inst_unit_typ).eq(value(true))
								.and(S0_T2.frst_mfg_inst_no.eq(S0_T1.mfg_inst_no))
							)
								.then(value(true))
							.otherwise(value(false)).as("frst_mfg_inst_flg"),
						nullValue().as("itm_mfg_inst_sub_char1"),
						nullValue().as("itm_mfg_inst_sub_char2"),
						nullValue().as("itm_mfg_inst_sub_char3"),
						S0_T1.sub_char1.as("mfg_inst_sub_char1"),
						S0_T1.sub_char2.as("mfg_inst_sub_char2"),
						S0_T1.sub_char3.as("mfg_inst_sub_char3"),
						nullValue().as("tm_th_image"),
						S0_T1.mfg_aprv_sts_typ,
						S0_T1.aprv_dt,
						S0_T1.aprv_tm,
						S0_T1.aprv_dpt_cd,
						S0_M14.dpt_nm.as("aprv_dpt_nm"),
						S0_T1.aprv_usr_cd,
						S0_T1.aprv_rsn,
						S0_T1.ins_usr_id.as("ins_usr_id"),
						S0_T1.ins_usr_nm.as("ins_usr_nm"),
						S0_T1.ins_func_id.as("ins_func_id"),
						S0_T1.ins_ts.as("ins_ts"),
						nullValue().as("itm_ord_upd_cntr"),
						nullValue().as("itm_mfg_inst_upd_cntr"),
						S0_T0.upd_cntr.as("mfg_inst_upd_cntr"),
						S0_T1.upd_usr_id.as("upd_usr_id"),
						S0_T1.upd_usr_nm.as("upd_usr_nm"),
						S0_T1.upd_func_id.as("upd_func_id"),
						S0_T1.upd_ts.as("upd_ts"),
						S0_T1.upd_srv_req_no.as("upd_srv_req_no")
					)
					.from(
						S0_T0
						.innerJoin(S0_T1).on(
							bracket(
								S0_T0.mfg_inst_no.eq(S0_T1.mfg_inst_no)
							)
						)
						.innerJoin(S0_T2).on(
							bracket(
								S0_T1.itm_mfg_inst_no.eq(S0_T2.itm_mfg_inst_no)
							)
						)
						.innerJoin(S0_T6).on(
							bracket(
								S0_T1.mfg_inst_no.eq(S0_T6.mfg_inst_no)
							)
						)
						.leftOuterJoin(S0_M12).on(
							bracket(
								S0_T1.inst_dpt_cd.eq(S0_M12.dpt_cd)
								.and(S0_T1.inst_dt.between(S0_M12.st_dt, S0_M12.end_dt))
							)
						)
						.leftOuterJoin(S0_M14).on(
							bracket(
								S0_T1.aprv_dpt_cd.eq(S0_M14.dpt_cd)
								.and(S0_T1.aprv_dt.between(S0_M14.st_dt, S0_M14.end_dt))
							)
						)
					)
					.where(
						value(0).eq(value(0))
						.and(S0_T1.mfg_inst_no.eq(bind("srch_tgt_no")))
						.and(S0_T1.mfg_inst_rev.eq(bind("mfg_inst_rev")))
						.and(
							bracket(
								bracket(
									bind("ope_val").eq(value("2"))
									.or(
										bind("ope_val").eq(value("3"))
										.and(S0_T1.mfg_aprv_sts_typ.eq(value(MSC_MFG_APRV_STS_TYP.INST_ACPT.value())))
									)
								)
								.and(
									exists(
										subQuery()
										.select(value("X"))
										.from(S1_V2)
										.where(
											S1_V2.aprv_role_cd.eq(S0_T1.mfg_aprv_role_cd)
											.and(S1_V2.usr_cd.eq(bind("tmp_aprv_usr")))
											.and(S1_V2.st_dt.lte(bind("tmp_today")))
											.and(
												S1_V2.end_dt.isNull()
												.or(S1_V2.end_dt.gte(bind("tmp_today")))
											)
										)
									)
								)
							)
							.or(
								bind("ope_val").neq(value("2"))
								.and(
									bind("ope_val").neq(value("3"))
									.or(S0_T1.mfg_aprv_sts_typ.isNull())
									.or(S0_T1.mfg_aprv_sts_typ.neq(value(MSC_MFG_APRV_STS_TYP.INST_ACPT.value())))
								)
							)
						)
					)
			)
			.setJoinInfo(
				joinInfo(
					j -> j
						.add(MST_PO_D_R.class, r -> toCondition(
							r.getStringNE("po_d_no")
						))
						.addSelect(m -> toArray(
							m.po_no
						))
						.addMap((r, m) -> {
							r.setStringNE("join_po_no_", m.po_no());
					}),
					j -> j
						.add(MST_PO_R.class, r -> toCondition(
							r.getStringNE("join_po_no_")
						))
						.addSelect(m -> toArray(
							m.aprv_sts_typ
						))
						.addMap((r, m) -> {
							r.setStringNE("po_aprv_sts_typ", m.aprv_sts_typ());
					}),
					j -> j
						.add(MAM_USR_R.class, r -> toCondition(
							r.getStringNE("inst_usr_cd")
						))
						.addSelect(m -> toArray(
							m.usr_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("inst_usr_nm", m.usr_nm());
					}),
					j -> j
						.add(MAM_USR_R.class, r -> toCondition(
							r.getStringNE("aprv_usr_cd")
						))
						.addSelect(m -> toArray(
							m.usr_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("aprv_usr_nm", m.usr_nm());
					})
				)
			);
	}
	
	/**
	 * -- MSBCL1010_MST_OPER_INST_ALL_R_Query_S01
	 */
	static MCQueryPlan MSBCL1010_MST_OPER_INST_ALL_R_S01() {
		MST_OPER_INST_P_R S0_T1 = MST_OPER_INST_P_R.create("T1");
		MSVT_OPER_INST_PR_R S0_T3 = MSVT_OPER_INST_PR_R.create("T3");
		MST_OPER_ORDER_R S0_T4 = MST_OPER_ORDER_R.create("T4");
		MAM_OPER_R S0_M1 = MAM_OPER_R.create("M1");
		MAM_UNIT_R S0_M3 = MAM_UNIT_R.create("M3");
		MAM_LOC_R S0_M4 = MAM_LOC_R.create("M4");
		MAM_UNIT_R S0_M5 = MAM_UNIT_R.create("M5");
		MAM_STR_LN_R S0_M6 = MAM_STR_LN_R.create("M6");
		MAM_USR_R S0_M7 = MAM_USR_R.create("M7");
		MST_OPER_INST_R S1_T1 = MST_OPER_INST_R.create("T1");
		MSVT_OPER_INST_PR_R S1_T3 = MSVT_OPER_INST_PR_R.create("T3");
		MST_OPER_ORDER_R S1_T4 = MST_OPER_ORDER_R.create("T4");
		MAM_OPER_R S1_M1 = MAM_OPER_R.create("M1");
		MAM_UNIT_R S1_M3 = MAM_UNIT_R.create("M3");
		MAM_LOC_R S1_M4 = MAM_LOC_R.create("M4");
		MAM_UNIT_R S1_M5 = MAM_UNIT_R.create("M5");
		MAM_STR_LN_R S1_M6 = MAM_STR_LN_R.create("M6");
		MAM_USR_R S1_M7 = MAM_USR_R.create("M7");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBCL1010_MST_OPER_INST_ALL_R_Query_S01")
					.mainQuery()
					.select(
						S0_T1.oper_cd,
						S0_M1.oper_nm,
						S0_T1.oper_seq,
						trunc(
							S0_T1.st_schd_tm,
							MCDateFmt.DD
						).as("st_schd_dt"),
						S0_T1.st_schd_tm.as("st_schd_hm"),
						trunc(
							S0_T1.end_schd_tm,
							MCDateFmt.DD
						).as("end_schd_dt"),
						S0_T1.end_schd_tm.as("end_schd_hm"),
						S0_T1.base_unit_qty,
						S0_T1.base_unit_cd,
						S0_M5.unit_nm.as("base_unit_nm"),
						S0_M5.dec_place.as("base_unit_dec_place"),
						S0_T1.oper_std_qty,
						S0_T1.oper_conv_qty,
						S0_T1.oper_unit_conv_rnd_typ,
						S0_T1.oper_unit_dec_place,
						S0_T1.oper_unit_cd,
						S0_M3.unit_nm.as("oper_unit_nm"),
						S0_T1.oper_loc_cd,
						S0_M4.loc_nm.as("oper_loc_nm"),
						S0_M4.str_ln_tgt_flg.as("oper_str_ln_tgt_flg"),
						S0_T1.oper_str_ln_cd,
						S0_M6.str_ln_nm.as("oper_str_ln_nm"),
						S0_T1.oper_lower_yield,
						S0_T1.oper_std_yield,
						S0_T1.oper_upper_yield,
						S0_T1.usr_cd,
						S0_M7.usr_nm,
						S0_T1.oper_abort_flg,
						S0_T1.disp_seq,
						S0_T1.oper_rsrc,
						S0_T1.intr_rmrks,
						S0_T1.inst_rpt_rmrks,
						S0_T1.sub_char1,
						S0_T1.sub_char2,
						S0_T1.sub_char3,
						S0_T1.bkf_flg,
						S0_T1.mes_flg.as("last_mes_flg"),
						S0_T1.wk_cost_calc_flg,
						S0_T1.oper_inst_grp,
						S0_T1.oper_ord_no,
						S0_T4.scheduler_frozen_flg,
						S0_T1.mfg_inst_no,
						S0_T1.oper_inst_no,
						S0_T1.unschd_inst_flg,
						S0_T1.unschd_act_flg,
						S0_T3.mfg_sts_typ,
						S0_T1.yield_oper_flg,
						S0_T1.yield_oper_ratio,
						S0_T1.oper_lt,
						S0_T1.oper_lt_add_qty,
						S0_T1.oper_offst,
						S0_T1.oper_offst_add_qty,
						S0_T1.oper_offst_typ
					)
					.from(
						S0_T1
						.innerJoin(S0_T3).on(
							bracket(
								S0_T1.oper_inst_no.eq(S0_T3.oper_inst_no)
							)
						)
						.leftOuterJoin(S0_T4).on(
							bracket(
								S0_T1.oper_ord_no.eq(S0_T4.oper_ord_no)
							)
						)
						.leftOuterJoin(S0_M1).on(
							bracket(
								S0_T1.oper_cd.eq(S0_M1.oper_cd)
							)
						)
						.leftOuterJoin(S0_M3).on(
							bracket(
								S0_T1.oper_unit_cd.eq(S0_M3.unit_cd)
							)
						)
						.leftOuterJoin(S0_M4).on(
							bracket(
								S0_T1.oper_loc_cd.eq(S0_M4.loc_cd)
							)
						)
						.leftOuterJoin(S0_M5).on(
							bracket(
								S0_T1.base_unit_cd.eq(S0_M5.unit_cd)
							)
						)
						.leftOuterJoin(S0_M6).on(
							bracket(
								S0_T1.oper_loc_cd.eq(S0_M6.loc_cd)
								.and(S0_T1.oper_str_ln_cd.eq(S0_M6.str_ln_cd))
							)
						)
						.leftOuterJoin(S0_M7).on(
							bracket(
								S0_T1.usr_cd.eq(S0_M7.usr_cd)
							)
						)
					)
					.where(
						value(0).eq(value(0))
						.and(S0_T1.mfg_inst_no.eq(bind("srch_tgt_no")))
						.and(S0_T1.mfg_inst_rev.eq(bind("mfg_inst_rev")))
						.and(S0_T1.can_flg.eq(value(false)))
					)
					.unionAll(
						subQuery()
						.select(
							S1_T1.oper_cd,
							S1_M1.oper_nm,
							S1_T1.oper_seq,
							trunc(
								S1_T1.st_schd_tm,
								MCDateFmt.DD
							).as("st_schd_dt"),
							S1_T1.st_schd_tm.as("st_schd_hm"),
							trunc(
								S1_T1.end_schd_tm,
								MCDateFmt.DD
							).as("end_schd_dt"),
							S1_T1.end_schd_tm.as("end_schd_hm"),
							S1_T1.base_unit_qty,
							S1_T1.base_unit_cd,
							S1_M5.unit_nm.as("base_unit_nm"),
							S1_M5.dec_place.as("base_unit_dec_place"),
							S1_T1.oper_std_qty,
							S1_T1.oper_conv_qty,
							S1_T1.oper_unit_conv_rnd_typ,
							S1_T1.oper_unit_dec_place,
							S1_T1.oper_unit_cd,
							S1_M3.unit_nm.as("oper_unit_nm"),
							S1_T1.oper_loc_cd,
							S1_M4.loc_nm.as("oper_loc_nm"),
							S1_M4.str_ln_tgt_flg.as("oper_str_ln_tgt_flg"),
							S1_T1.oper_str_ln_cd,
							S1_M6.str_ln_nm.as("oper_str_ln_nm"),
							S1_T1.oper_lower_yield,
							S1_T1.oper_std_yield,
							S1_T1.oper_upper_yield,
							S1_T1.usr_cd,
							S1_M7.usr_nm,
							S1_T1.oper_abort_flg,
							S1_T1.disp_seq,
							S1_T1.oper_rsrc,
							S1_T1.intr_rmrks,
							S1_T1.inst_rpt_rmrks,
							S1_T1.sub_char1,
							S1_T1.sub_char2,
							S1_T1.sub_char3,
							S1_T1.bkf_flg,
							S1_T1.mes_flg.as("last_mes_flg"),
							S1_T1.wk_cost_calc_flg,
							S1_T1.oper_inst_grp,
							S1_T1.oper_ord_no,
							S1_T4.scheduler_frozen_flg,
							S1_T1.mfg_inst_no,
							S1_T1.oper_inst_no,
							S1_T1.unschd_inst_flg,
							S1_T1.unschd_act_flg,
							S1_T3.mfg_sts_typ,
							S1_T1.yield_oper_flg,
							S1_T1.yield_oper_ratio,
							S1_T1.oper_lt,
							S1_T1.oper_lt_add_qty,
							S1_T1.oper_offst,
							S1_T1.oper_offst_add_qty,
							S1_T1.oper_offst_typ
						)
						.from(
							S1_T1
							.innerJoin(S1_T3).on(
								bracket(
									S1_T1.oper_inst_no.eq(S1_T3.oper_inst_no)
								)
							)
							.leftOuterJoin(S1_T4).on(
									bracket(
										S1_T1.oper_ord_no.eq(S1_T4.oper_ord_no)
									)
								)
							.leftOuterJoin(S1_M1).on(
								bracket(
									S1_T1.oper_cd.eq(S1_M1.oper_cd)
								)
							)
							.leftOuterJoin(S1_M3).on(
								bracket(
									S1_T1.oper_unit_cd.eq(S1_M3.unit_cd)
								)
							)
							.leftOuterJoin(S1_M4).on(
								bracket(
									S1_T1.oper_loc_cd.eq(S1_M4.loc_cd)
								)
							)
							.leftOuterJoin(S1_M5).on(
								bracket(
									S1_T1.base_unit_cd.eq(S1_M5.unit_cd)
								)
							)
							.leftOuterJoin(S1_M6).on(
								bracket(
									S1_T1.oper_loc_cd.eq(S1_M6.loc_cd)
									.and(S1_T1.oper_str_ln_cd.eq(S1_M6.str_ln_cd))
								)
							)
							.leftOuterJoin(S1_M7).on(
								bracket(
									S1_T1.usr_cd.eq(S1_M7.usr_cd)
								)
							)
						)
						.where(
							value(0).eq(value(0))
							.and(S1_T1.itm_mfg_inst_no.eq(bind("itm_mfg_inst_no")))
							.cutoff$and(
								bracket(
									S1_T1.mfg_inst_no.isNull()
									.or(S1_T1.mfg_inst_no.neq(bind("mfg_inst_no")))
								)
							)
							.and(S1_T1.can_flg.eq(value(false)))
						)
					)
					.orderBy(pr("disp_seq").asc())
			);
	}
	
	/**
	 * -- MSBCL1010_MST_OPER_ORDER_Query_S01
	 */
	static MCQueryPlan MSBCL1010_MST_OPER_ORDER_S01() {
		MST_OPER_ORDER_R S0_T1 = MST_OPER_ORDER_R.create("T1");
		MST_ITM_ORDER_R S0_T2 = MST_ITM_ORDER_R.create("T2");
		MAM_ITM_OPER_R S0_M2 = MAM_ITM_OPER_R.create("M2");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBCL1010_MST_OPER_ORDER_Query_S01")
					.mainQuery()
					.select(
						S0_T1.oper_cd,
						S0_T1.oper_seq,
						trunc(
							S0_T1.st_schd_tm,
							MCDateFmt.DD
						).as("st_schd_dt"),
						S0_T1.st_schd_tm.as("st_schd_hm"),
						trunc(
							S0_T1.end_schd_tm,
							MCDateFmt.DD
						).as("end_schd_dt"),
						S0_T1.end_schd_tm.as("end_schd_hm"),
						S0_T1.not_oper_schd_qty.as("base_unit_qty"),
						nullValue().as("base_unit_cd"),
						nullValue().as("base_unit_nm"),
						nullValue().as("base_unit_dec_place"),
						S0_M2.oper_std_qty,
						S0_M2.oper_conv_qty,
						S0_M2.unit_conv_rnd_typ.as("oper_unit_conv_rnd_typ"),
						S0_M2.dec_place.as("oper_unit_dec_place"),
						S0_M2.oper_unit_cd,
						S0_T1.loc_cd.as("oper_loc_cd"),
						value(MAC_STR.NULL_VAL.value()).as("oper_str_ln_cd"),
						nullValue().as("oper_str_ln_nm"),
						S0_M2.oper_lower_yield,
						S0_M2.oper_std_yield,
						S0_M2.oper_upper_yield,
						nullValue().as("usr_cd"),
						nullValue().as("usr_nm"),
						value(false).as("oper_abort_flg"),
						S0_T1.disp_seq,
						S0_T1.oper_rsrc,
						nullValue().as("intr_rmrks"),
						nullValue().as("inst_rpt_rmrks"),
						nullValue().as("sub_char1"),
						nullValue().as("sub_char2"),
						nullValue().as("sub_char3"),
						value(false).as("bkf_flg"),
						cases()
							.when(S0_T2.itm_ord_typ.eq(value(MSC_ITM_ORD_TYP.MFG.value())))
								.then(value(true))
							.otherwise(value(false)).as("wk_cost_calc_flg"),
						S0_M2.oper_inst_grp,
						S0_T1.oper_ord_no,
						nullValue().as("mfg_inst_no"),
						nullValue().as("oper_inst_no"),
						value(false).as("unschd_inst_flg"),
						value(false).as("unschd_act_flg"),
						nullValue().as("mfg_sts_typ"),
						S0_T1.oper_ptn,
						cases()
							.when(S0_T1.oper_ptn.eq(value(MAC_STR.NULL_VAL.value())))
								.then(value(true))
							.otherwise(S0_M2.yield_oper_flg).as("yield_oper_flg"),
						cases()
							.when(S0_T1.oper_ptn.eq(value(MAC_STR.NULL_VAL.value())))
								.then(value(1))
							.otherwise(S0_M2.yield_oper_ratio).as("yield_oper_ratio"),
						S0_T1.scheduler_frozen_flg
					)
					.from(
						S0_T1
						.innerJoin(S0_T2).on(
							bracket(
								S0_T1.itm_ord_no.eq(S0_T2.itm_ord_no)
							)
						)
						.leftOuterJoin(S0_M2).on(
							bracket(
								S0_T2.itm_cd.eq(S0_M2.itm_cd)
								.and(S0_T2.itm_sub1.eq(S0_M2.itm_sub1))
								.and(S0_T2.itm_sub2.eq(S0_M2.itm_sub2))
								.and(S0_T2.itm_sub3.eq(S0_M2.itm_sub3))
								.and(S0_T2.mst_mfg_loc_cd.eq(S0_M2.loc_cd))
								.and(S0_T1.oper_ptn.eq(S0_M2.oper_ptn))
								.and(S0_T1.oper_cd.eq(S0_M2.oper_cd))
								.and(S0_T1.oper_seq.eq(S0_M2.oper_seq))
								.and(S0_T2.mfg_st_schd_dt.between(S0_M2.st_dt, S0_M2.end_dt))
							)
						)
					)
					.where(
						value(0).eq(value(0))
						.and(S0_T1.itm_ord_no.eq(bind("itm_ord_no")))
						.and(S0_T1.not_oper_schd_qty.gt(value(0)))
					)
					.orderBy(S0_T1.disp_seq.asc())
			)
			.setJoinInfo(
				joinInfo(
					j -> j
						.add(MAM_OPER_R.class, r -> toCondition(
							r.getStringNE("oper_cd")
						))
						.addSelect(m -> toArray(
							m.oper_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("oper_nm", m.oper_nm());
					}),
					j -> j
						.add(MAM_UNIT_R.class, r -> toCondition(
							r.getStringNE("oper_unit_cd")
						))
						.addSelect(m -> toArray(
							m.unit_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("oper_unit_nm", m.unit_nm());
					}),
					j -> j
						.add(MAM_LOC_R.class, r -> toCondition(
							r.getStringNE("oper_loc_cd")
						))
						.addSelect(m -> toArray(
							m.loc_nm,
							m.str_ln_tgt_flg
						))
						.addMap((r, m) -> {
							r.setStringNE("oper_loc_nm", m.loc_nm());
							r.setBooleanNE("oper_str_ln_tgt_flg", m.str_ln_tgt_flg());
					})
				)
			);
	}
	
	/**
	 * -- MSBCL1010_MST_RE_EXT_HST_Query_S01
	 */
	static MCQueryPlan MSBCL1010_MST_RE_EXT_HST_S01() {
		MST_RE_EXT_HST_R S0_T1 = MST_RE_EXT_HST_R.create("T1");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBCL1010_MST_RE_EXT_HST_Query_S01")
					.mainQuery()
					.select(
						S0_T1.ref_ord,
						S0_T1.chng_no,
						S0_T1.re_ext_typ,
						cases()
							.when(S0_T1.re_ext_typ.eq(value(MSC_RE_EXT_TYP.UNNECES.value())))
								.then(value(true))
							.otherwise(value(false)).as("unneces_flg"),
						S0_T1.oper_chng_flg,
						S0_T1.intr_rmrks,
						S0_T1.plm_cnt_rmrks,
						S0_T1.sub_char1,
						S0_T1.sub_char2,
						S0_T1.sub_char3
					)
					.from(S0_T1)
					.where(
						value(0).eq(value(0))
						.and(S0_T1.mfg_inst_no.eq(bind("srch_tgt_no")))
					)
					.orderBy(S0_T1.ref_ord.asc())
			);
	}
	
	/**
	 * -- MSBCL1010_MST_WK_SCHD_ALL_R_Query_S01
	 */
	static MCQueryPlan MSBCL1010_MST_WK_SCHD_ALL_R_S01() {
		MST_WK_SCHD_P_R S0_T1 = MST_WK_SCHD_P_R.create("T1");
		MSVT_WK_SCHD_PR_R S0_T2 = MSVT_WK_SCHD_PR_R.create("T2");
		MAM_WK_COST_R S0_M1 = MAM_WK_COST_R.create("M1");
		MST_OPER_INST_P_R S0_T3 = MST_OPER_INST_P_R.create("T3");
		MST_WK_SCHD_R S1_T1 = MST_WK_SCHD_R.create("T1");
		MSVT_WK_SCHD_PR_R S1_T2 = MSVT_WK_SCHD_PR_R.create("T2");
		MST_OPER_INST_R S1_T3 = MST_OPER_INST_R.create("T3");
		MAM_WK_COST_R S1_M1 = MAM_WK_COST_R.create("M1");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBCL1010_MST_WK_SCHD_ALL_R_Query_S01")
					.mainQuery()
					.select(
						S0_T1.wk_cost_cd,
						S0_M1.wk_cost_nm,
						S0_T1.wk_cost,
						S0_T1.fxd_wk_cost,
						bracket(
							S0_T1.wk_cost.add(S0_T1.fxd_wk_cost)
						).as("sum_wk_cost"),
						S0_M1.wk_cost_unit_nm,
						S0_M1.dec_place.as("wk_cost_dec_place"),
						S0_T1.wk_cost_calc_flg,
						S0_T1.mst_wk_cost,
						S0_T1.mst_fxd_wk_cost,
						S0_T1.intr_rmrks,
						S0_T1.sub_char1,
						S0_T1.sub_char2,
						S0_T1.sub_char3,
						S0_T1.mfg_inst_no,
						S0_T1.oper_inst_no,
						S0_T1.wk_schd_no,
						S0_T2.mfg_sts_typ,
						S0_T1.disp_seq,
						S0_T3.disp_seq.as("oper_disp_seq")
					)
					.from(
						S0_T1
						.innerJoin(S0_T2).on(
							bracket(
								S0_T1.wk_schd_no.eq(S0_T2.wk_schd_no)
							)
						)
						.leftOuterJoin(S0_M1).on(
							bracket(
								S0_T1.wk_cost_cd.eq(S0_M1.wk_cost_cd)
							)
						)
						.innerJoin(S0_T3).on(
							bracket(
								S0_T1.mfg_inst_no.eq(S0_T3.mfg_inst_no)
								.and(S0_T1.mfg_inst_rev.eq(S0_T3.mfg_inst_rev))
								.and(S0_T1.oper_inst_no.eq(S0_T3.oper_inst_no))
							)
						)
					)
					.where(
						value(0).eq(value(0))
						.and(S0_T1.mfg_inst_no.eq(bind("srch_tgt_no")))
						.and(S0_T1.mfg_inst_rev.eq(bind("mfg_inst_rev")))
						.and(S0_T1.can_flg.eq(value(false)))
					)
					.unionAll(
						subQuery()
						.select(
							S1_T1.wk_cost_cd,
							S1_M1.wk_cost_nm,
							S1_T1.wk_cost,
							S1_T1.fxd_wk_cost,
							bracket(
								S1_T1.wk_cost.add(S1_T1.fxd_wk_cost)
							).as("sum_wk_cost"),
							S1_M1.wk_cost_unit_nm,
							S1_M1.dec_place.as("wk_cost_dec_place"),
							S1_T1.wk_cost_calc_flg,
							S1_T1.mst_wk_cost,
							S1_T1.mst_fxd_wk_cost,
							S1_T1.intr_rmrks,
							S1_T1.sub_char1,
							S1_T1.sub_char2,
							S1_T1.sub_char3,
							S1_T1.mfg_inst_no,
							S1_T1.oper_inst_no,
							S1_T1.wk_schd_no,
							S1_T2.mfg_sts_typ,
							S1_T1.disp_seq,
							S1_T3.disp_seq.as("oper_disp_seq")
						)
						.from(
							S1_T1
							.innerJoin(S1_T2).on(
								bracket(
									S1_T1.wk_schd_no.eq(S1_T2.wk_schd_no)
								)
							)
							.innerJoin(S1_T3).on(
								bracket(
									S1_T1.oper_inst_no.eq(S1_T3.oper_inst_no)
								)
							)
							.leftOuterJoin(S1_M1).on(
								bracket(
									S1_T1.wk_cost_cd.eq(S1_M1.wk_cost_cd)
								)
							)
						)
						.where(
							value(0).eq(value(0))
							.and(S1_T1.itm_mfg_inst_no.eq(bind("itm_mfg_inst_no")))
							.cutoff$and(
								bracket(
									S1_T1.mfg_inst_no.isNull()
									.or(S1_T1.mfg_inst_no.neq(bind("mfg_inst_no")))
								)
							)
							.and(S1_T1.can_flg.eq(value(false)))
						)
					)
					.orderBy(
						pr("oper_disp_seq").asc(),
						pr("disp_seq").asc()
					)
			);
	}
	
	/**
	 * -- MSBCL1010_MST_YIELD_SCHD_ALL_R_Query_S01
	 */
	static MCQueryPlan MSBCL1010_MST_YIELD_SCHD_ALL_R_S01() {
		MST_YIELD_SCHD_P_R S0_T1 = MST_YIELD_SCHD_P_R.create("T1");
		MSVT_YIELD_SCHD_PR_R S0_T2 = MSVT_YIELD_SCHD_PR_R.create("T2");
		MAM_UNIT_R S0_M1 = MAM_UNIT_R.create("M1");
		MAVM_ITM_UNIT_R S0_M2 = MAVM_ITM_UNIT_R.create("M2");
		MAM_LOC_R S0_M3 = MAM_LOC_R.create("M3");
		MAM_STR_LN_R S0_M4 = MAM_STR_LN_R.create("M4");
		MAM_ITM_R S0_M5 = MAM_ITM_R.create("M5");
		MAM_UNIT_R S0_M7 = MAM_UNIT_R.create("M7");
		MST_OPER_INST_P_R S0_T3 = MST_OPER_INST_P_R.create("T3");
		MST_YIELD_SCHD_R S1_T1 = MST_YIELD_SCHD_R.create("T1");
		MSVT_YIELD_SCHD_PR_R S1_T2 = MSVT_YIELD_SCHD_PR_R.create("T2");
		MST_OPER_INST_R S1_T3 = MST_OPER_INST_R.create("T3");
		MAM_UNIT_R S1_M1 = MAM_UNIT_R.create("M1");
		MAVM_ITM_UNIT_R S1_M2 = MAVM_ITM_UNIT_R.create("M2");
		MAM_LOC_R S1_M3 = MAM_LOC_R.create("M3");
		MAM_STR_LN_R S1_M4 = MAM_STR_LN_R.create("M4");
		MAM_ITM_R S1_M5 = MAM_ITM_R.create("M5");
		MAM_UNIT_R S1_M7 = MAM_UNIT_R.create("M7");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBCL1010_MST_YIELD_SCHD_ALL_R_Query_S01")
					.mainQuery()
					.select(
						S0_T1.trd_unit_cd,
						S0_M1.unit_nm.as("trd_unit_nm"),
						S0_T1.trd_unit_yield_qty,
						S0_M2.dec_place.as("trd_unit_dec_place"),
						S0_M5.rnd_typ.as("base_unit_conv_rnd_typ"),
						S0_M2.conv_base_qty,
						S0_M2.conv_qty,
						S0_T1.base_unit_cd,
						S0_M7.unit_nm.as("base_unit_nm"),
						S0_T1.base_unit_yield_qty,
						S0_M5.dec_place.as("base_unit_dec_place"),
						trunc(
							S0_T1.schd_tm,
							MCDateFmt.DD
						).as("schd_dt"),
						S0_T1.schd_tm.as("schd_hm"),
						S0_T1.strg_loc_cd,
						S0_M3.loc_nm.as("strg_loc_nm"),
						S0_M3.str_ln_tgt_flg.as("strg_str_ln_tgt_flg"),
						S0_T1.strg_str_ln_cd,
						S0_M4.str_ln_nm.as("strg_str_ln_nm"),
						S0_T1.intr_rmrks,
						S0_T1.inst_rpt_rmrks,
						S0_T1.insp_cnt_rmrks,
						S0_T2.stk_lst_prnt_flg,
						S0_T1.sub_char1,
						S0_T1.sub_char2,
						S0_T1.sub_char3,
						S0_T1.yield_schd_no,
						S0_T1.mfg_inst_no,
						S0_T1.oper_inst_no,
						S0_T2.mfg_sts_typ,
						S0_T1.disp_seq,
						S0_T3.disp_seq.as("oper_disp_seq")
					)
					.from(
						S0_T1
						.innerJoin(S0_T2).on(
							bracket(
								S0_T1.yield_schd_no.eq(S0_T2.yield_schd_no)
							)
						)
						.leftOuterJoin(S0_M1).on(
							bracket(
								S0_T1.trd_unit_cd.eq(S0_M1.unit_cd)
							)
						)
						.leftOuterJoin(S0_M2).on(
							bracket(
								S0_T1.itm_cd.eq(S0_M2.itm_cd)
								.and(S0_T1.itm_sub1.eq(S0_M2.itm_sub1))
								.and(S0_T1.itm_sub2.eq(S0_M2.itm_sub2))
								.and(S0_T1.itm_sub3.eq(S0_M2.itm_sub3))
								.and(S0_T1.trd_unit_cd.eq(S0_M2.unit_cd))
							)
						)
						.leftOuterJoin(S0_M3).on(
							bracket(
								S0_T1.strg_loc_cd.eq(S0_M3.loc_cd)
							)
						)
						.leftOuterJoin(S0_M4).on(
							bracket(
								S0_T1.strg_loc_cd.eq(S0_M4.loc_cd)
								.and(S0_T1.strg_str_ln_cd.eq(S0_M4.str_ln_cd))
							)
						)
						.leftOuterJoin(S0_M5).on(
							bracket(
								S0_T1.itm_cd.eq(S0_M5.itm_cd)
								.and(S0_T1.itm_sub1.eq(S0_M5.itm_sub1))
								.and(S0_T1.itm_sub2.eq(S0_M5.itm_sub2))
								.and(S0_T1.itm_sub3.eq(S0_M5.itm_sub3))
							)
						)
						.leftOuterJoin(S0_M7).on(
							bracket(
								S0_T1.base_unit_cd.eq(S0_M7.unit_cd)
							)
						)
						.innerJoin(S0_T3).on(
							bracket(
								S0_T3.mfg_inst_no.eq(S0_T1.mfg_inst_no)
								.and(S0_T3.mfg_inst_rev.eq(S0_T1.mfg_inst_rev))
								.and(S0_T1.oper_inst_no.eq(S0_T3.oper_inst_no))
							)
						)
					)
					.where(
						value(0).eq(value(0))
						.and(S0_T1.mfg_inst_no.eq(bind("srch_tgt_no")))
						.and(S0_T1.mfg_inst_rev.eq(bind("mfg_inst_rev")))
						.and(S0_T1.yield_typ.eq(value(MAC_YIELD_TYP.GOOD.value())))
						.and(S0_T1.can_flg.eq(value(false)))
					)
					.unionAll(
						subQuery()
						.select(
							S1_T1.trd_unit_cd,
							S1_M1.unit_nm.as("trd_unit_nm"),
							S1_T1.trd_unit_yield_qty,
							S1_M2.dec_place.as("trd_unit_dec_place"),
							S1_M5.rnd_typ.as("base_unit_conv_rnd_typ"),
							S1_M2.conv_base_qty,
							S1_M2.conv_qty,
							S1_T1.base_unit_cd,
							S1_M7.unit_nm.as("base_unit_nm"),
							S1_T1.base_unit_yield_qty,
							S1_M5.dec_place.as("base_unit_dec_place"),
							trunc(
								S1_T1.schd_tm,
								MCDateFmt.DD
							).as("schd_dt"),
							S1_T1.schd_tm.as("schd_hm"),
							S1_T1.strg_loc_cd,
							S1_M3.loc_nm.as("strg_loc_nm"),
							S1_M3.str_ln_tgt_flg.as("strg_str_ln_tgt_flg"),
							S1_T1.strg_str_ln_cd,
							S1_M4.str_ln_nm.as("strg_str_ln_nm"),
							S1_T1.intr_rmrks,
							S1_T1.inst_rpt_rmrks,
							S1_T1.insp_cnt_rmrks,
							S1_T2.stk_lst_prnt_flg,
							S1_T1.sub_char1,
							S1_T1.sub_char2,
							S1_T1.sub_char3,
							S1_T1.yield_schd_no,
							S1_T1.mfg_inst_no,
							S1_T1.oper_inst_no,
							S1_T2.mfg_sts_typ,
							S1_T1.disp_seq,
							S1_T3.disp_seq.as("oper_disp_seq")
						)
						.from(
							S1_T1
							.innerJoin(S1_T2).on(
								bracket(
									S1_T1.yield_schd_no.eq(S1_T2.yield_schd_no)
								)
							)
							.innerJoin(S1_T3).on(
								bracket(
									S1_T1.oper_inst_no.eq(S1_T3.oper_inst_no)
								)
							)
							.leftOuterJoin(S1_M1).on(
								bracket(
									S1_T1.trd_unit_cd.eq(S1_M1.unit_cd)
								)
							)
							.leftOuterJoin(S1_M2).on(
								bracket(
									S1_T1.itm_cd.eq(S1_M2.itm_cd)
									.and(S1_T1.itm_sub1.eq(S1_M2.itm_sub1))
									.and(S1_T1.itm_sub2.eq(S1_M2.itm_sub2))
									.and(S1_T1.itm_sub3.eq(S1_M2.itm_sub3))
									.and(S1_T1.trd_unit_cd.eq(S1_M2.unit_cd))
								)
							)
							.leftOuterJoin(S1_M3).on(
								bracket(
									S1_T1.strg_loc_cd.eq(S1_M3.loc_cd)
								)
							)
							.leftOuterJoin(S1_M4).on(
								bracket(
									S1_T1.strg_loc_cd.eq(S1_M4.loc_cd)
									.and(S1_T1.strg_str_ln_cd.eq(S1_M4.str_ln_cd))
								)
							)
							.leftOuterJoin(S1_M5).on(
								bracket(
									S1_T1.itm_cd.eq(S1_M5.itm_cd)
									.and(S1_T1.itm_sub1.eq(S1_M5.itm_sub1))
									.and(S1_T1.itm_sub2.eq(S1_M5.itm_sub2))
									.and(S1_T1.itm_sub3.eq(S1_M5.itm_sub3))
								)
							)
							.leftOuterJoin(S1_M7).on(
								bracket(
									S1_T1.base_unit_cd.eq(S1_M7.unit_cd)
								)
							)
						)
						.where(
							value(0).eq(value(0))
							.and(S1_T1.itm_mfg_inst_no.eq(bind("itm_mfg_inst_no")))
							.cutoff$and(
								bracket(
									S1_T1.mfg_inst_no.isNull()
									.or(S1_T1.mfg_inst_no.neq(bind("mfg_inst_no")))
								)
							)
							.and(S1_T1.yield_typ.eq(value(MAC_YIELD_TYP.GOOD.value())))
							.and(S1_T1.can_flg.eq(value(false)))
						)
					)
					.orderBy(
						pr("oper_disp_seq").asc(),
						pr("disp_seq").asc()
					)
			);
	}
	
	/**
	 * -- MSBCL1010_MST_YIELD_SCHD_ALL_R_Query_S02
	 */
	static MCQueryPlan MSBCL1010_MST_YIELD_SCHD_ALL_R_S02() {
		MST_YIELD_SCHD_P_R S0_T1 = MST_YIELD_SCHD_P_R.create("T1");
		MSVT_YIELD_SCHD_PR_R S0_T2 = MSVT_YIELD_SCHD_PR_R.create("T2");
		MST_OPER_INST_P_R S0_T3 = MST_OPER_INST_P_R.create("T3");
		MAM_UNIT_R S0_M1 = MAM_UNIT_R.create("M1");
		MAVM_ITM_UNIT_R S0_M2 = MAVM_ITM_UNIT_R.create("M2");
		MAM_LOC_R S0_M3 = MAM_LOC_R.create("M3");
		MAM_STR_LN_R S0_M4 = MAM_STR_LN_R.create("M4");
		MAM_ITM_R S0_M5 = MAM_ITM_R.create("M5");
		MAM_UNIT_R S0_M7 = MAM_UNIT_R.create("M7");
		MST_YIELD_SCHD_R S1_T1 = MST_YIELD_SCHD_R.create("T1");
		MSVT_YIELD_SCHD_PR_R S1_T2 = MSVT_YIELD_SCHD_PR_R.create("T2");
		MST_OPER_INST_R S1_T3 = MST_OPER_INST_R.create("T3");
		MAM_UNIT_R S1_M1 = MAM_UNIT_R.create("M1");
		MAVM_ITM_UNIT_R S1_M2 = MAVM_ITM_UNIT_R.create("M2");
		MAM_LOC_R S1_M3 = MAM_LOC_R.create("M3");
		MAM_STR_LN_R S1_M4 = MAM_STR_LN_R.create("M4");
		MAM_ITM_R S1_M5 = MAM_ITM_R.create("M5");
		MAM_UNIT_R S1_M7 = MAM_UNIT_R.create("M7");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBCL1010_MST_YIELD_SCHD_ALL_R_Query_S02")
					.mainQuery()
					.select(
						S0_M5.th_image,
						S0_T1.itm_cd,
						S0_T1.itm_sub1,
						S0_T1.itm_sub2,
						S0_T1.itm_sub3,
						S0_M5.itm_nm,
						S0_M5.lot_mng_typ,
						S0_M5.lot_no_typ,
						S0_M5.lot_no_ptn_cd,
						S0_M5.sublot_mng_typ,
						S0_M5.sublot_no_typ,
						S0_M5.sublot_no_ptn_cd,
						S0_M5.sno1_mng_typ,
						S0_M5.sno2_mng_typ,
						S0_M5.sno3_mng_typ,
						S0_M5.sno4_mng_typ,
						S0_T1.trd_unit_cd,
						S0_M1.unit_nm.as("trd_unit_nm"),
						S0_T1.trd_unit_yield_qty,
						S0_M2.dec_place.as("trd_unit_dec_place"),
						S0_M5.rnd_typ.as("base_unit_conv_rnd_typ"),
						S0_M2.conv_base_qty,
						S0_M2.conv_qty,
						S0_T1.base_unit_cd,
						S0_M7.unit_nm.as("base_unit_nm"),
						S0_T1.base_unit_yield_qty,
						S0_M5.dec_place.as("base_unit_dec_place"),
						trunc(
							S0_T1.schd_tm,
							MCDateFmt.DD
						).as("schd_dt"),
						S0_T1.schd_tm.as("schd_hm"),
						S0_T1.lot_no,
						S0_T1.sublot_no,
						S0_T1.sno1,
						S0_T1.sno2,
						S0_T1.sno3,
						S0_T1.sno4,
						S0_T1.strg_loc_cd,
						S0_M3.loc_nm.as("strg_loc_nm"),
						S0_M3.str_ln_tgt_flg.as("strg_str_ln_tgt_flg"),
						S0_T1.strg_str_ln_cd,
						S0_M4.str_ln_nm.as("strg_str_ln_nm"),
						S0_T1.bkf_typ,
						S0_T1.par_inst_qty,
						S0_T1.chd_inpt_qty,
						S0_T1.chd_rqmt_qty,
						S0_T1.fxd_chd_rqmt_qty,
						S0_T1.intr_rmrks,
						S0_T1.inst_rpt_rmrks,
						S0_T2.stk_lst_prnt_flg,
						S0_T1.sub_char1,
						S0_T1.sub_char2,
						S0_T1.sub_char3,
						S0_T1.yield_schd_no,
						S0_T1.mfg_inst_no,
						S0_T1.oper_inst_no,
						S0_T2.mfg_sts_typ,
						S0_T1.disp_seq,
						S0_T3.disp_seq.as("oper_disp_seq")
					)
					.from(
						S0_T1
						.innerJoin(S0_T2).on(
							bracket(
								S0_T1.yield_schd_no.eq(S0_T2.yield_schd_no)
							)
						)
						.innerJoin(S0_T3).on(
							bracket(
								S0_T1.mfg_inst_no.eq(S0_T3.mfg_inst_no)
								.and(S0_T1.mfg_inst_rev.eq(S0_T3.mfg_inst_rev))
								.and(S0_T1.oper_inst_no.eq(S0_T3.oper_inst_no))
							)
						)
						.leftOuterJoin(S0_M1).on(
							bracket(
								S0_T1.trd_unit_cd.eq(S0_M1.unit_cd)
							)
						)
						.leftOuterJoin(S0_M2).on(
							bracket(
								S0_T1.itm_cd.eq(S0_M2.itm_cd)
								.and(S0_T1.itm_sub1.eq(S0_M2.itm_sub1))
								.and(S0_T1.itm_sub2.eq(S0_M2.itm_sub2))
								.and(S0_T1.itm_sub3.eq(S0_M2.itm_sub3))
								.and(S0_T1.trd_unit_cd.eq(S0_M2.unit_cd))
							)
						)
						.leftOuterJoin(S0_M3).on(
							bracket(
								S0_T1.strg_loc_cd.eq(S0_M3.loc_cd)
							)
						)
						.leftOuterJoin(S0_M4).on(
							bracket(
								S0_T1.strg_loc_cd.eq(S0_M4.loc_cd)
								.and(S0_T1.strg_str_ln_cd.eq(S0_M4.str_ln_cd))
							)
						)
						.leftOuterJoin(S0_M5).on(
							bracket(
								S0_T1.itm_cd.eq(S0_M5.itm_cd)
								.and(S0_T1.itm_sub1.eq(S0_M5.itm_sub1))
								.and(S0_T1.itm_sub2.eq(S0_M5.itm_sub2))
								.and(S0_T1.itm_sub3.eq(S0_M5.itm_sub3))
							)
						)
						.leftOuterJoin(S0_M7).on(
							bracket(
								S0_T1.base_unit_cd.eq(S0_M7.unit_cd)
							)
						)
					)
					.where(
						value(0).eq(value(0))
						.and(S0_T1.mfg_inst_no.eq(bind("srch_tgt_no")))
						.and(S0_T1.mfg_inst_rev.eq(bind("mfg_inst_rev")))
						.and(S0_T1.can_flg.eq(value(false)))
						.and(S0_T1.yield_typ.eq(value(MAC_YIELD_TYP.BYPROD.value())))
					)
					.unionAll(
						subQuery()
						.select(
							S1_M5.th_image,
							S1_T1.itm_cd,
							S1_T1.itm_sub1,
							S1_T1.itm_sub2,
							S1_T1.itm_sub3,
							S1_M5.itm_nm,
							S1_M5.lot_mng_typ,
							S1_M5.lot_no_typ,
							S1_M5.lot_no_ptn_cd,
							S1_M5.sublot_mng_typ,
							S1_M5.sublot_no_typ,
							S1_M5.sublot_no_ptn_cd,
							S1_M5.sno1_mng_typ,
							S1_M5.sno2_mng_typ,
							S1_M5.sno3_mng_typ,
							S1_M5.sno4_mng_typ,
							S1_T1.trd_unit_cd,
							S1_M1.unit_nm.as("trd_unit_nm"),
							S1_T1.trd_unit_yield_qty,
							S1_M2.dec_place.as("trd_unit_dec_place"),
							S1_M5.rnd_typ.as("base_unit_conv_rnd_typ"),
							S1_M2.conv_base_qty,
							S1_M2.conv_qty,
							S1_T1.base_unit_cd,
							S1_M7.unit_nm.as("base_unit_nm"),
							S1_T1.base_unit_yield_qty,
							S1_M5.dec_place.as("base_unit_dec_place"),
							trunc(
								S1_T1.schd_tm,
								MCDateFmt.DD
							).as("schd_dt"),
							S1_T1.schd_tm.as("schd_hm"),
							S1_T1.lot_no,
							S1_T1.sublot_no,
							S1_T1.sno1,
							S1_T1.sno2,
							S1_T1.sno3,
							S1_T1.sno4,
							S1_T1.strg_loc_cd,
							S1_M3.loc_nm.as("strg_loc_nm"),
							S1_M3.str_ln_tgt_flg.as("strg_str_ln_tgt_flg"),
							S1_T1.strg_str_ln_cd,
							S1_M4.str_ln_nm.as("strg_str_ln_nm"),
							S1_T1.bkf_typ,
							S1_T1.par_inst_qty,
							S1_T1.chd_inpt_qty,
							S1_T1.chd_rqmt_qty,
							S1_T1.fxd_chd_rqmt_qty,
							S1_T1.intr_rmrks,
							S1_T1.inst_rpt_rmrks,
							S1_T2.stk_lst_prnt_flg,
							S1_T1.sub_char1,
							S1_T1.sub_char2,
							S1_T1.sub_char3,
							S1_T1.yield_schd_no,
							S1_T1.mfg_inst_no,
							S1_T1.oper_inst_no,
							S1_T2.mfg_sts_typ,
							S1_T1.disp_seq,
							S1_T3.disp_seq.as("oper_disp_seq")
						)
						.from(
							S1_T1
							.innerJoin(S1_T2).on(
								bracket(
									S1_T1.yield_schd_no.eq(S1_T2.yield_schd_no)
								)
							)
							.innerJoin(S1_T3).on(
								bracket(
									S1_T1.oper_inst_no.eq(S1_T3.oper_inst_no)
								)
							)
							.leftOuterJoin(S1_M1).on(
								bracket(
									S1_T1.trd_unit_cd.eq(S1_M1.unit_cd)
								)
							)
							.leftOuterJoin(S1_M2).on(
								bracket(
									S1_T1.itm_cd.eq(S1_M2.itm_cd)
									.and(S1_T1.itm_sub1.eq(S1_M2.itm_sub1))
									.and(S1_T1.itm_sub2.eq(S1_M2.itm_sub2))
									.and(S1_T1.itm_sub3.eq(S1_M2.itm_sub3))
									.and(S1_T1.trd_unit_cd.eq(S1_M2.unit_cd))
								)
							)
							.leftOuterJoin(S1_M3).on(
								bracket(
									S1_T1.strg_loc_cd.eq(S1_M3.loc_cd)
								)
							)
							.leftOuterJoin(S1_M4).on(
								bracket(
									S1_T1.strg_loc_cd.eq(S1_M4.loc_cd)
									.and(S1_T1.strg_str_ln_cd.eq(S1_M4.str_ln_cd))
								)
							)
							.leftOuterJoin(S1_M5).on(
								bracket(
									S1_T1.itm_cd.eq(S1_M5.itm_cd)
									.and(S1_T1.itm_sub1.eq(S1_M5.itm_sub1))
									.and(S1_T1.itm_sub2.eq(S1_M5.itm_sub2))
									.and(S1_T1.itm_sub3.eq(S1_M5.itm_sub3))
								)
							)
							.leftOuterJoin(S1_M7).on(
								bracket(
									S1_T1.base_unit_cd.eq(S1_M7.unit_cd)
								)
							)
						)
						.where(
							value(0).eq(value(0))
							.and(S1_T1.itm_mfg_inst_no.eq(bind("itm_mfg_inst_no")))
							.cutoff$and(
								bracket(
									S1_T1.mfg_inst_no.isNull()
									.or(S1_T1.mfg_inst_no.neq(bind("mfg_inst_no")))
								)
							)
							.and(S1_T1.can_flg.eq(value(false)))
							.and(S1_T1.yield_typ.eq(value(MAC_YIELD_TYP.BYPROD.value())))
						)
					)
					.orderBy(
						pr("oper_disp_seq").asc(),
						pr("disp_seq").asc()
					)
			);
	}
}