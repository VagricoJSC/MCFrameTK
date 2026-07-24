package mcframe.serverMSBE.MSBEL6600;

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
	 * -- MSBEL6600_MST_STKTK_ACT_Query_S01
	 */
	static MCQueryPlan MSBEL6600_MST_STKTK_ACT_S01() {
		MST_STKTK_ACT_R S0_T1 = MST_STKTK_ACT_R.create("T1");
		MST_STKTK_R S0_T2 = MST_STKTK_R.create("T2");
		MAM_ITM_R S0_M1 = MAM_ITM_R.create("M1");
		MAM_ITM_TYP_D_R S0_M2 = MAM_ITM_TYP_D_R.create("M2");
		MAM_LOC_R S0_M3 = MAM_LOC_R.create("M3");
		MAM_SITE_R S0_M4 = MAM_SITE_R.create("M4");
		MAM_WG_R S0_M5 = MAM_WG_R.create("M5");
		MAM_LG_GRP_R S0_M6 = MAM_LG_GRP_R.create("M6");
		MAM_LOC_GRP_R S0_M7 = MAM_LOC_GRP_R.create("M7");
		MAM_ALLOC_GRP_R S0_M8 = MAM_ALLOC_GRP_R.create("M8");
		MAM_STR_LN_R S0_M9 = MAM_STR_LN_R.create("M9");
		MAM_BP_R S0_M10 = MAM_BP_R.create("M10");
		MAM_STK_GD_R S0_M11 = MAM_STK_GD_R.create("M11");
		MAM_BP_R S0_M12 = MAM_BP_R.create("M12");
		MAM_UNIT_R S0_M13 = MAM_UNIT_R.create("M13");
		MSVT_LOT_LIST_R S0_T3 = MSVT_LOT_LIST_R.create("T3");
		MAM_SUNDRY_ITM_R S0_M16 = MAM_SUNDRY_ITM_R.create("M16");
		MAVM_RD_LOC_R S0_M99 = MAVM_RD_LOC_R.create("M99");
		MAM_ITM_GRP_R S0_MM1 = MAM_ITM_GRP_R.create("MM1");
		MAM_ITM_GRP_R S0_MM2 = MAM_ITM_GRP_R.create("MM2");
		MAM_ITM_GRP_R S0_MM3 = MAM_ITM_GRP_R.create("MM3");
		MAM_ITM_GRP_R S0_MM4 = MAM_ITM_GRP_R.create("MM4");
		MAM_ITM_GRP_R S0_MM5 = MAM_ITM_GRP_R.create("MM5");
		MAM_ITM_GRP_R S0_MM6 = MAM_ITM_GRP_R.create("MM6");
		MAM_ITM_GRP_R S0_MM7 = MAM_ITM_GRP_R.create("MM7");
		MAM_ITM_GRP_R S0_MM8 = MAM_ITM_GRP_R.create("MM8");
		MAM_ITM_GRP_R S0_MM9 = MAM_ITM_GRP_R.create("MM9");
		MAM_ITM_GRP_R S0_MM10 = MAM_ITM_GRP_R.create("MM10");
		
		MCDynamicSQLID DS0C_ITM_GRP = createDynamicSQLID("DS0C_ITM_GRP");
		
		return createQueryPlan()
			.setQuery(
				sql("MSBEL6600_MST_STKTK_ACT_Query_S01")
					.mainQuery()
					.select(
						S0_T1.act_input_flg,
						S0_T1.stktk_base_dt,
						S0_T1.loc_cd,
						S0_M3.loc_nm,
						S0_M3.stktk_amt_flg,
						S0_M3.stktk_tor_disp_flg,
						S0_M3.site_cd,
						S0_M3.wg_cd,
						S0_M3.lg_grp_cd,
						S0_M3.loc_grp_cd,
						S0_M3.alloc_grp_cd,
						S0_M3.sppl_cd,
						S0_M3.str_ln_tgt_flg,
						S0_T1.str_ln_cd,
						S0_T1.stk_arrv_bp_cd,
						S0_M10.bp_nm.as("stk_arrv_bp_nm"),
						S0_M10.bp_alt_nm1.as("stk_arrv_bp_alt_nm1"),
						S0_M10.bp_alt_nm2.as("stk_arrv_bp_alt_nm2"),
						S0_M10.bp_alt_nm3.as("stk_arrv_bp_alt_nm3"),
						S0_M10.bp_alt_nm4.as("stk_arrv_bp_alt_nm4"),
						S0_M10.cnsgn_stktk_flg,
						S0_T1.itm_cd,
						S0_T1.itm_sub1,
						S0_T1.itm_sub2,
						S0_T1.itm_sub3,
						nvl(
							S0_M16.itm_nm,
							S0_M1.itm_nm
						).as("itm_nm"),
						S0_M1.itm_alt_nm1,
						S0_M1.itm_alt_nm2,
						S0_M1.itm_alt_nm3,
						S0_M1.itm_alt_nm4,
						S0_T1.lot_no,
						S0_T1.sublot_no,
						S0_T1.sno1,
						S0_T1.sno2,
						S0_T1.sno3,
						S0_T1.sno4,
						S0_T1.fix_no_flg,
						S0_T1.gd_cd,
						S0_T1.in_xfr_typ,
						S0_T1.quality_typ,
						S0_T1.stk_insp_typ,
						S0_T1.stk_id_typ,
						S0_T1.stk_bp_cd,
						S0_T1.trd_unit_cd,
						S0_T1.tor_qty,
						S0_T1.trd_unit_qty,
						S0_T1.act_diff_qty,
						S0_M1.unit_cd.as("base_unit_cd"),
						S0_M1.dec_place.as("base_unit_dec_place"),
						S0_M1.rnd_typ.as("base_unit_rnd_typ"),
						S0_T1.stktk_act_no,
						S0_T1.stktk_act_rmrks,
						S0_T1.intr_rmrks,
						S0_T1.sub_char1,
						S0_T1.sub_char2,
						S0_T1.sub_char3,
						S0_T1.stktk_itm_spc_flg,
						S0_T2.stktk_sts_typ,
						S0_T1.ins_usr_id,
						S0_T1.ins_usr_nm,
						S0_T1.ins_func_id,
						S0_T1.ins_ts,
						S0_T2.upd_cntr.as("stktk_upd_cntr"),
						S0_T1.upd_cntr.as("stktkact_upd_cntr"),
						S0_T1.upd_usr_id,
						S0_T1.upd_usr_nm,
						S0_T1.upd_func_id,
						S0_T1.upd_ts,
						S0_T1.upd_srv_req_no,
						S0_M1.lot_mng_typ,
						S0_M1.sublot_mng_typ,
						S0_M1.sno1_mng_typ,
						S0_M1.sno2_mng_typ,
						S0_M1.sno3_mng_typ,
						S0_M1.sno4_mng_typ,
						value(MAC_LOT_NO_TYP.MANUAL.value()).as("lot_no_typ"),
						value(MAC_LOT_NO_TYP.MANUAL.value()).as("sublot_no_typ"),
						S0_M1.sundry_itm_flg,
						S0_M1.not_new_lot_flg,
						S0_M1.ver_flg,
						S0_M1.itm_typ,
						S0_M1.itm_typ_d_cd,
						addDynamicSelect(DS0C_ITM_GRP)
					)
					.from(
						S0_T1
						.leftOuterJoin(S0_T2).on(
							bracket(
								S0_T1.loc_cd.eq(S0_T2.loc_cd)
								.and(
									decode(
										S0_T1.stktk_itm_spc_flg,
										value(false),
										value(MAC_STR.NULL_VAL.value()),
										S0_T1.itm_cd
									).eq(S0_T2.itm_cd)
								)
								.and(
									decode(
										S0_T1.stktk_itm_spc_flg,
										value(false),
										value(MAC_STR.NULL_VAL.value()),
										S0_T1.itm_sub1
									).eq(S0_T2.itm_sub1)
								)
								.and(
									decode(
										S0_T1.stktk_itm_spc_flg,
										value(false),
										value(MAC_STR.NULL_VAL.value()),
										S0_T1.itm_sub2
									).eq(S0_T2.itm_sub2)
								)
								.and(
									decode(
										S0_T1.stktk_itm_spc_flg,
										value(false),
										value(MAC_STR.NULL_VAL.value()),
										S0_T1.itm_sub3
									).eq(S0_T2.itm_sub3)
								)
								.and(S0_T1.stktk_base_dt.eq(S0_T2.ctrl_tgt_dt))
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
						.leftOuterJoin(S0_M3).on(
							bracket(
								S0_T1.loc_cd.eq(S0_M3.loc_cd)
							)
						)
						.leftOuterJoin(S0_M10).on(
							bracket(
								S0_T1.stk_arrv_bp_cd.eq(S0_M10.bp_cd)
							)
						)
						.leftOuterJoin(S0_M16).on(
							bracket(
								S0_T1.itm_cd.eq(S0_M16.itm_cd)
								.and(S0_T1.itm_sub1.eq(S0_M16.itm_sub1))
								.and(S0_T1.itm_sub2.eq(S0_M16.itm_sub2))
								.and(S0_T1.itm_sub3.eq(S0_M16.itm_sub3))
								.and(S0_T1.sno1.eq(S0_M16.sno1))
								.and(S0_T1.sno2.eq(S0_M16.sno2))
								.and(S0_T1.sno3.eq(S0_M16.sno3))
								.and(S0_T1.sno4.eq(S0_M16.sno4))
							)
						)
						.innerJoin(S0_M99).on(
							bracket(
								S0_T1.loc_cd.eq(S0_M99.loc_cd)
							)
						)
						.addDynamicView()
						.addDynamicView(DS0C_ITM_GRP)
					)
					.where(
						value(0).eq(value(0))
						.and(S0_T1.keep_data_flg.eq(value(false)))
						.cutoff$and(S0_T1.stktk_base_dt.eq(bind("stktk_base_dt")))
						.cutoff$and(S0_T1.loc_cd.like(bind("loc_cd")))
						.cutoff$and(S0_M3.loc_nm.like(bind("loc_nm")))
						.cutoff$and(S0_M3.site_cd.like(bind("site_cd")))
						.addDynamicPredicate()
						.cutoff$and(S0_M3.wg_cd.like(bind("wg_cd")))
						.cutoff$and(S0_M3.lg_grp_cd.like(bind("lg_grp_cd")))
						.cutoff$and(S0_M3.loc_grp_cd.like(bind("loc_grp_cd")))
						.cutoff$and(S0_M3.alloc_grp_cd.like(bind("alloc_grp_cd")))
						.cutoff$and(S0_T1.str_ln_cd.like(bind("str_ln_cd")))
						.cutoff$and(S0_T1.stk_arrv_bp_cd.like(bind("stk_arrv_bp_cd")))
						.cutoff$and(S0_M10.bp_nm.like(bind("stk_arrv_bp_nm")))
						.cutoff$and(S0_M1.itm_typ.like(bind("itm_typ")))
						.cutoff$and(S0_M1.itm_typ_d_cd.like(bind("itm_typ_d_cd")))
						.cutoff$and(S0_T1.itm_cd.like(bind("itm_cd")))
						.cutoff$and(S0_T1.itm_sub1.like(bind("itm_sub1")))
						.cutoff$and(S0_T1.itm_sub2.like(bind("itm_sub2")))
						.cutoff$and(S0_T1.itm_sub3.like(bind("itm_sub3")))
						.cutoff$and(
							nvl(
								S0_M16.itm_nm,
								S0_M1.itm_nm
							).like(bind("itm_nm"))
						)
						.cutoff$and(S0_T1.lot_no.like(bind("lot_no")))
						.cutoff$and(S0_T1.sublot_no.like(bind("sublot_no")))
						.cutoff$and(S0_T1.sno1.like(bind("sno1")))
						.cutoff$and(S0_T1.sno2.like(bind("sno2")))
						.cutoff$and(S0_T1.sno3.like(bind("sno3")))
						.cutoff$and(S0_T1.sno4.like(bind("sno4")))
						.cutoff$and(S0_T1.gd_cd.like(bind("gd_cd")))
						.cutoff$and(S0_T1.in_xfr_typ.like(bind("in_xfr_typ")))
						.cutoff$and(S0_T1.quality_typ.like(bind("quality_typ")))
						.cutoff$and(S0_T1.stk_insp_typ.like(bind("stk_insp_typ")))
						.cutoff$and(S0_T1.stk_id_typ.like(bind("stk_id_typ")))
						.cutoff$and(S0_T1.stk_bp_cd.like(bind("stk_bp_cd")))
						.cutoff$and(S0_T1.trd_unit_cd.like(bind("trd_unit_cd")))
						.cutoff$and(S0_T1.stktk_act_no.like(bind("stktk_act_no")))
						.cutoff$and(S0_T1.stktk_act_rmrks.like(bind("stktk_act_rmrks")))
						.cutoff$and(S0_T1.intr_rmrks.like(bind("intr_rmrks")))
						.cutoff$and(S0_T1.sub_char1.like(bind("sub_char1")))
						.cutoff$and(S0_T1.sub_char2.like(bind("sub_char2")))
						.cutoff$and(S0_T1.sub_char3.like(bind("sub_char3")))
						.and(
							S0_T1.act_input_flg.eq(value(false))
							.cutoff$or(S0_T1.act_input_flg.eq(bind("inc_entrd_true")))
						)
						.cutoff$and(S0_T2.stktk_sts_typ.eq(bind("only_stktk_true")))
						.cutoff$and(S0_T1.act_diff_qty.neq(bind("only_diff_true")))
						.cutoff$and(S0_T1.stk_id_typ.eq(bind("only_own_true")))
						.cutoff$and(
							not(
								S0_M3.sppl_cd.isNull()
								.and(S0_T1.stk_arrv_bp_cd.neq(value(MAC_STR.NULL_VAL.value())))
							)
							.and(bind("only_int_true").isNotNull())
						)
						.cutoff$and(
							S0_T1.in_xfr_typ.neq(value(MSC_IN_XFR_TYP.IN_XFR.value()))
							.and(
								S0_T1.stk_id_typ.notIn(
									value(MSC_STK_ID_TYP.RNT_RCV.value()),
									value(MSC_STK_ID_TYP.RTN_PRE_ACCPT.value()),
									value(MSC_STK_ID_TYP.PURC_PRE_ACCPT.value()),
									value(MSC_STK_ID_TYP.SLF_SUPPRT.value()),
									value(MSC_STK_ID_TYP.CSTSTK.value()),
									value(MSC_STK_ID_TYP.ACCPT_DFCT.value())
								)
							)
							.and(
								not(
									S0_T1.stk_arrv_bp_cd.neq(value(MAC_STR.NULL_VAL.value()))
									.and(
										(
											S0_T1.fix_no_flg.eq(value(true))
											.and(
												S0_M3.sppl_cd.isNull()
												.or(S0_T1.stk_id_typ.neq(value(MSC_STK_ID_TYP.COSTK.value()))))
										)
										.or(
											S0_T1.fix_no_flg.eq(value(false))
											.and(
												S0_M10.cnsgn_stktk_flg.eq(value(false))
												.and(S0_M3.sppl_cd.isNull())
											)
										)
									)
								)
							)
							.and(
								not(
									S0_T1.stk_id_typ.eq(value(MSC_STK_ID_TYP.NCV_RCV.value()))
									.and(S0_M3.sppl_cd.isNotNull())
									.and(S0_T1.stk_arrv_bp_cd.eq(value(MAC_STR.NULL_VAL.value())))
								)
							)
							.and(
								S0_T1.tor_qty.isNull()
								.or(S0_T1.tor_qty.gte(value(0)))
							)
							.and(bind("only_enable_true").isNotNull())
						)
						.addDynamicPredicate(DS0C_ITM_GRP)
					)
					.orderBy(
						S0_T1.loc_cd.asc(),
						S0_T1.str_ln_cd.asc(),
						S0_T1.itm_cd.asc(),
						S0_T1.itm_sub1.asc(),
						S0_T1.itm_sub2.asc(),
						S0_T1.itm_sub3.asc(),
						S0_T1.quality_typ.asc(),
						S0_T1.stk_insp_typ.asc(),
						S0_T1.stk_id_typ.asc(),
						S0_T1.stk_bp_cd.asc(),
						S0_T1.trd_unit_cd.asc(),
						S0_T1.gd_cd.asc(),
						S0_T1.lot_no.asc(),
						S0_T1.sublot_no.asc(),
						S0_T1.stk_arrv_bp_cd.asc(),
						S0_T1.sno1.asc(),
						S0_T1.sno2.asc(),
						S0_T1.sno3.asc(),
						S0_T1.sno4.asc(),
						S0_T1.in_xfr_typ.asc()
					)
			)
			.setDynamicSQLInfo(
				when(boundOr("itm_typ_d_nm"))
					.view(v -> v.leftOuterJoin(S0_M2).on(bracket(S0_M1.itm_typ.eq(S0_M2.itm_typ).and(S0_M1.itm_typ_d_cd.eq(S0_M2.itm_typ_d_cd)))))
					.predicate(p -> p.cutoff$and(S0_M2.itm_typ_d_nm.like(bind("itm_typ_d_nm")))),
				when(boundOr("site_nm"))
					.view(v -> v.leftOuterJoin(S0_M4).on(bracket(S0_M3.site_cd.eq(S0_M4.site_cd))))
					.predicate(p -> p.cutoff$and(S0_M4.site_nm.like(bind("site_nm")))),
				when(boundOr("wg_nm"))
					.view(v -> v.leftOuterJoin(S0_M5).on(bracket(S0_M3.wg_cd.eq(S0_M5.wg_cd))))
					.predicate(p -> p.cutoff$and(S0_M5.wg_nm.like(bind("wg_nm")))),
				when(boundOr("lg_grp_nm"))
					.view(v -> v.leftOuterJoin(S0_M6).on(bracket(S0_M3.lg_grp_cd.eq(S0_M6.lg_grp_cd))))
					.predicate(p -> p.cutoff$and(S0_M6.lg_grp_nm.like(bind("lg_grp_nm")))),
				when(boundOr("loc_grp_nm"))
					.view(v -> v.leftOuterJoin(S0_M7).on(bracket(S0_M3.loc_grp_cd.eq(S0_M7.loc_grp_cd))))
					.predicate(p -> p.cutoff$and(S0_M7.loc_grp_nm.like(bind("loc_grp_nm")))),
				when(boundOr("alloc_grp_nm"))
					.view(v -> v.leftOuterJoin(S0_M8).on(bracket(S0_M3.alloc_grp_cd.eq(S0_M8.alloc_grp_cd))))
					.predicate(p -> p.cutoff$and(S0_M8.alloc_grp_nm.like(bind("alloc_grp_nm")))),
				when(boundOr("str_ln_nm"))
					.view(v -> v.leftOuterJoin(S0_M9).on(bracket(S0_T1.loc_cd.eq(S0_M9.loc_cd).and(S0_T1.str_ln_cd.eq(S0_M9.str_ln_cd)))))
					.predicate(p -> p.cutoff$and(S0_M9.str_ln_nm.like(bind("str_ln_nm")))),
				when(boundOr("gd_nm"))
					.view(v -> v.leftOuterJoin(S0_M11).on(bracket(S0_T1.gd_cd.eq(S0_M11.gd_cd))))
					.predicate(p -> p.cutoff$and(S0_M11.gd_nm.like(bind("gd_nm")))),
				when(boundOr("stk_bp_nm"))
					.view(v -> v.leftOuterJoin(S0_M12).on(bracket(S0_T1.stk_bp_cd.eq(S0_M12.bp_cd))))
					.predicate(p -> p.cutoff$and(S0_M12.bp_nm.like(bind("stk_bp_nm")))),
				when(boundOr("trd_unit_nm"))
					.view(v -> v.leftOuterJoin(S0_M13).on(bracket(S0_T1.trd_unit_cd.eq(S0_M13.unit_cd))))
					.predicate(p -> p.cutoff$and(S0_M13.unit_nm.like(bind("trd_unit_nm")))),
				when(boundOr("ver_no"))
					.view(v -> v.leftOuterJoin(S0_T3).on(bracket(S0_T1.itm_cd.eq(S0_T3.itm_cd).and(S0_T1.itm_sub1.eq(S0_T3.itm_sub1)).and(S0_T1.itm_sub2.eq(S0_T3.itm_sub2)).and(S0_T1.itm_sub3.eq(S0_T3.itm_sub3)).and(S0_T1.lot_no.eq(S0_T3.lot_no)).and(S0_T1.sublot_no.eq(S0_T3.sublot_no)))))
					.predicate(p -> p.cutoff$and(S0_T3.ver_no.like(bind("ver_no")))),
				when(boundOr("itm_grp_flg1"))
					.select(DS0C_ITM_GRP, S0_M1.itm_grp_cd1.as("itm_grp_cd1"), S0_MM1.itm_grp_nm.as("itm_grp_nm1"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM1).on(S0_M1.itm_grp_cd1.eq(S0_MM1.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP1.value()).eq(S0_MM1.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M1.itm_grp_cd1.like(bind("itm_grp_cd1"))).cutoff$and(S0_MM1.itm_grp_nm.like(bind("itm_grp_nm1")))),
				when(boundOr("itm_grp_flg2"))
					.select(DS0C_ITM_GRP, S0_M1.itm_grp_cd2.as("itm_grp_cd2"), S0_MM2.itm_grp_nm.as("itm_grp_nm2"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM2).on(S0_M1.itm_grp_cd2.eq(S0_MM2.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP2.value()).eq(S0_MM2.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M1.itm_grp_cd2.like(bind("itm_grp_cd2"))).cutoff$and(S0_MM2.itm_grp_nm.like(bind("itm_grp_nm2")))),
				when(boundOr("itm_grp_flg3"))
					.select(DS0C_ITM_GRP, S0_M1.itm_grp_cd3.as("itm_grp_cd3"), S0_MM3.itm_grp_nm.as("itm_grp_nm3"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM3).on(S0_M1.itm_grp_cd3.eq(S0_MM3.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP3.value()).eq(S0_MM3.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M1.itm_grp_cd3.like(bind("itm_grp_cd3"))).cutoff$and(S0_MM3.itm_grp_nm.like(bind("itm_grp_nm3")))),
				when(boundOr("itm_grp_flg4"))
					.select(DS0C_ITM_GRP, S0_M1.itm_grp_cd4.as("itm_grp_cd4"), S0_MM4.itm_grp_nm.as("itm_grp_nm4"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM4).on(S0_M1.itm_grp_cd4.eq(S0_MM4.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP4.value()).eq(S0_MM4.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M1.itm_grp_cd4.like(bind("itm_grp_cd4"))).cutoff$and(S0_MM4.itm_grp_nm.like(bind("itm_grp_nm4")))),
				when(boundOr("itm_grp_flg5"))
					.select(DS0C_ITM_GRP, S0_M1.itm_grp_cd5.as("itm_grp_cd5"), S0_MM5.itm_grp_nm.as("itm_grp_nm5"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM5).on(S0_M1.itm_grp_cd5.eq(S0_MM5.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP5.value()).eq(S0_MM5.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M1.itm_grp_cd5.like(bind("itm_grp_cd5"))).cutoff$and(S0_MM5.itm_grp_nm.like(bind("itm_grp_nm5")))),
				when(boundOr("itm_grp_flg6"))
					.select(DS0C_ITM_GRP, S0_M1.itm_grp_cd6.as("itm_grp_cd6"), S0_MM6.itm_grp_nm.as("itm_grp_nm6"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM6).on(S0_M1.itm_grp_cd6.eq(S0_MM6.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP6.value()).eq(S0_MM6.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M1.itm_grp_cd6.like(bind("itm_grp_cd6"))).cutoff$and(S0_MM6.itm_grp_nm.like(bind("itm_grp_nm6")))),
				when(boundOr("itm_grp_flg7"))
					.select(DS0C_ITM_GRP, S0_M1.itm_grp_cd7.as("itm_grp_cd7"), S0_MM7.itm_grp_nm.as("itm_grp_nm7"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM7).on(S0_M1.itm_grp_cd7.eq(S0_MM7.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP7.value()).eq(S0_MM7.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M1.itm_grp_cd7.like(bind("itm_grp_cd7"))).cutoff$and(S0_MM7.itm_grp_nm.like(bind("itm_grp_nm7")))),
				when(boundOr("itm_grp_flg8"))
					.select(DS0C_ITM_GRP, S0_M1.itm_grp_cd8.as("itm_grp_cd8"), S0_MM8.itm_grp_nm.as("itm_grp_nm8"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM8).on(S0_M1.itm_grp_cd8.eq(S0_MM8.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP8.value()).eq(S0_MM8.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M1.itm_grp_cd8.like(bind("itm_grp_cd8"))).cutoff$and(S0_MM8.itm_grp_nm.like(bind("itm_grp_nm8")))),
				when(boundOr("itm_grp_flg9"))
					.select(DS0C_ITM_GRP, S0_M1.itm_grp_cd9.as("itm_grp_cd9"), S0_MM9.itm_grp_nm.as("itm_grp_nm9"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM9).on(S0_M1.itm_grp_cd9.eq(S0_MM9.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP9.value()).eq(S0_MM9.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M1.itm_grp_cd9.like(bind("itm_grp_cd9"))).cutoff$and(S0_MM9.itm_grp_nm.like(bind("itm_grp_nm9")))),
				when(boundOr("itm_grp_flg10"))
					.select(DS0C_ITM_GRP, S0_M1.itm_grp_cd10.as("itm_grp_cd10"), S0_MM10.itm_grp_nm.as("itm_grp_nm10"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM10).on(S0_M1.itm_grp_cd10.eq(S0_MM10.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP10.value()).eq(S0_MM10.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M1.itm_grp_cd10.like(bind("itm_grp_cd10"))).cutoff$and(S0_MM10.itm_grp_nm.like(bind("itm_grp_nm10"))))
			)
			.setJoinInfo(
				joinInfo(
					j -> j
						.add(MAM_ITM_TYP_D_R.class, r -> toCondition(
							r.getStringNE("itm_typ"),
							r.getStringNE("itm_typ_d_cd")
						))
						.addSelect(m -> toArray(
							m.itm_typ_d_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("itm_typ_d_nm", m.itm_typ_d_nm());
					}),
					j -> j
						.add(MAM_SITE_R.class, r -> toCondition(
							r.getStringNE("site_cd")
						))
						.addSelect(m -> toArray(
							m.site_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("site_nm", m.site_nm());
					}),
					j -> j
						.add(MAM_WG_R.class, r -> toCondition(
							r.getStringNE("wg_cd")
						))
						.addSelect(m -> toArray(
							m.wg_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("wg_nm", m.wg_nm());
					}),
					j -> j
						.add(MAM_LG_GRP_R.class, r -> toCondition(
							r.getStringNE("lg_grp_cd")
						))
						.addSelect(m -> toArray(
							m.lg_grp_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("lg_grp_nm", m.lg_grp_nm());
					}),
					j -> j
						.add(MAM_LOC_GRP_R.class, r -> toCondition(
							r.getStringNE("loc_grp_cd")
						))
						.addSelect(m -> toArray(
							m.loc_grp_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("loc_grp_nm", m.loc_grp_nm());
					}),
					j -> j
						.add(MAM_ALLOC_GRP_R.class, r -> toCondition(
							r.getStringNE("alloc_grp_cd")
						))
						.addSelect(m -> toArray(
							m.alloc_grp_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("alloc_grp_nm", m.alloc_grp_nm());
					}),
					j -> j
						.add(MAM_STR_LN_R.class, r -> toCondition(
							r.getStringNE("loc_cd"),
							r.getStringNE("str_ln_cd")
						))
						.addSelect(m -> toArray(
							m.str_ln_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("str_ln_nm", m.str_ln_nm());
					}),
					j -> j
						.add(MAM_STK_GD_R.class, r -> toCondition(
							r.getStringNE("gd_cd")
						))
						.addSelect(m -> toArray(
							m.gd_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("gd_nm", m.gd_nm());
					}),
					j -> j
						.add(MAM_BP_R.class, r -> toCondition(
							r.getStringNE("stk_bp_cd")
						))
						.addSelect(m -> toArray(
							m.bp_alt_nm1,
							m.bp_alt_nm2,
							m.bp_alt_nm3,
							m.bp_alt_nm4,
							m.bp_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("stk_bp_nm", m.bp_nm());
							r.setStringNE("stk_bp_alt_nm1", m.bp_alt_nm1());
							r.setStringNE("stk_bp_alt_nm2", m.bp_alt_nm2());
							r.setStringNE("stk_bp_alt_nm3", m.bp_alt_nm3());
							r.setStringNE("stk_bp_alt_nm4", m.bp_alt_nm4());
					}),
					j -> j
						.add(MAM_UNIT_R.class, r -> toCondition(
							r.getStringNE("trd_unit_cd")
						))
						.addSelect(m -> toArray(
							m.unit_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("trd_unit_nm", m.unit_nm());
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
						.add(MSVT_LOT_LIST_R.class, r -> toCondition(
							r.getStringNE("itm_cd"),
							r.getStringNE("itm_sub1"),
							r.getStringNE("itm_sub2"),
							r.getStringNE("itm_sub3"),
							r.getStringNE("lot_no"),
							r.getStringNE("sublot_no")
						))
						.addSelect(m -> toArray(
							m.ver_no
						))
						.addMap((r, m) -> {
							r.setStringNE("ver_no", m.ver_no());
					}),
					j -> j
						.add(MAVM_ITM_UNIT_R.class, r -> toCondition(
							r.getStringNE("itm_cd"),
							r.getStringNE("itm_sub1"),
							r.getStringNE("itm_sub2"),
							r.getStringNE("itm_sub3"),
							r.getStringNE("trd_unit_cd")
						))
						.addSelect(m -> toArray(
							m.conv_base_qty,
							m.conv_qty,
							m.dec_place,
							m.rnd_typ
						))
						.addMap((r, m) -> {
							r.setNumberNE("trd_unit_dec_place", m.dec_place());
							r.setStringNE("trd_unit_rnd_typ", m.rnd_typ());
							r.setNumberNE("trd_unit_base_qty", m.conv_base_qty());
							r.setNumberNE("trd_unit_conv_qty", m.conv_qty());
					})
				)
			);
	}
}