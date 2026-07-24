package mcframe.serverMSBE.MSBEL0090;

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
	 * -- MSBEL0090_MST_IO_SCHD_Query_S01
	 */
	static MCQueryPlan MSBEL0090_MST_IO_SCHD_S01(MCDynamicSQLID REP) {
		MCTempView S0 = createTempView("T");
		MAVM_RD_LOC_R S0_M1 = MAVM_RD_LOC_R.create("M1");
		MAM_STR_LN_R S0_M2 = MAM_STR_LN_R.create("M2");
		MAM_BP_R S0_M3 = MAM_BP_R.create("M3");
		MAM_SITE_R S0_M4 = MAM_SITE_R.create("M4");
		MAM_WG_R S0_M5 = MAM_WG_R.create("M5");
		MAM_LG_GRP_R S0_M6 = MAM_LG_GRP_R.create("M6");
		MAM_ALLOC_GRP_R S0_M7 = MAM_ALLOC_GRP_R.create("M7");
		MAM_LOC_GRP_R S0_M8 = MAM_LOC_GRP_R.create("M8");
		MAM_ITM_R S0_M9 = MAM_ITM_R.create("M9");
		MAM_UNIT_R S0_M10 = MAM_UNIT_R.create("M10");
		MAM_ALT_GRP_R S0_M12 = MAM_ALT_GRP_R.create("M12");
		MAM_STK_GD_R S0_M13 = MAM_STK_GD_R.create("M13");
		MAM_BP_R S0_M14 = MAM_BP_R.create("M14");
		MAM_BP_R S0_M15 = MAM_BP_R.create("M15");
		MAM_ITM_TYP_D_R S0_M16 = MAM_ITM_TYP_D_R.create("M16");
		MAM_SUNDRY_ITM_R S0_M17 = MAM_SUNDRY_ITM_R.create("M17");
		MSVT_WRK_SNO_R S0_T2 = MSVT_WRK_SNO_R.create("T2");
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
				sql("MSBEL0090_MST_IO_SCHD_Query_S01")
					.mainQuery()
					.select(
						S0.pr("slip_schd_no"),
						S0.pr("schd_dt"),
						S0.pr("accpt_schd_dt"),
						S0.pr("avl_schd_dt"),
						S0.pr("loc_cd"),
						S0_M1.loc_nm,
						S0.pr("str_ln_cd"),
						S0.pr("stk_arrv_bp_cd"),
						S0_M1.site_cd,
						S0.pr("wg_cd"),
						S0_M1.lg_grp_cd,
						S0_M1.alloc_grp_cd,
						S0_M1.loc_grp_cd,
						S0.pr("sppl_cd"),
						S0.pr("itm_cd"),
						S0.pr("itm_sub1"),
						S0.pr("itm_sub2"),
						S0.pr("itm_sub3"),
						coalesce(
							S0_M17.itm_nm,
							S0_M9.itm_nm
						).as("itm_nm"),
						S0.pr("lot_no"),
						S0.pr("sublot_no"),
						S0.pr("sno1_null_flg"),
						S0.pr("sno1"),
						S0.pr("sno2_null_flg"),
						S0.pr("sno2"),
						S0.pr("sno3_null_flg"),
						S0.pr("sno3"),
						S0.pr("sno4_null_flg"),
						S0.pr("sno4"),
						S0.pr("io_schd_typ"),
						S0.pr("ver_no"),
						S0.pr("io_schd_sts_typ"),
						S0.pr("io_typ"),
						decode(
							S0.pr("io_typ"),
							value(MSC_IO_TYP.GR.value()),
							S0.pr("pack_unit_qty"),
							nullValue()
						).as("i_pack_unit_qty"),
						decode(
							S0.pr("io_typ"),
							value(MSC_IO_TYP.GI.value()),
							S0.pr("pack_unit_qty"),
							nullValue()
						).as("o_pack_unit_qty"),
						S0.pr("pack_unit_cd"),
						decode(
							S0.pr("io_typ"),
							value(MSC_IO_TYP.GR.value()),
							S0.pr("base_unit_qty"),
							nullValue()
						).as("i_base_unit_qty"),
						decode(
							S0.pr("io_typ"),
							value(MSC_IO_TYP.GI.value()),
							S0.pr("base_unit_qty"),
							nullValue()
						).as("o_base_unit_qty"),
						S0.pr("base_unit_cd"),
						S0.pr("alt_grp_cd"),
						S0.pr("alt_grp_seq"),
						S0.pr("oper_inst_no"),
						S0.pr("oper_ord_no"),
						S0.pr("alt_qty"),
						S0.pr("alt_itm_typ"),
						S0.pr("alt_itm_ratio"),
						S0.pr("alt_alloc_prio"),
						S0.pr("gd_cd"),
						S0.pr("in_xfr_typ"),
						S0.pr("quality_typ"),
						S0.pr("asst_typ"),
						S0.pr("stk_insp_typ"),
						S0.pr("stk_id_typ"),
						S0.pr("stk_bp_cd"),
						S0.pr("alloc_tgt_flg"),
						S0.pr("alloc_scope_typ"),
						S0.pr("alloc_flg"),
						S0.pr("alloc_wait_flg"),
						S0.pr("vld_dt_fr"),
						S0.pr("vld_dt_to"),
						S0.pr("inpt_ctl_typ"),
						S0.pr("io_schd_no"),
						S0.pr("io_schd_seq"),
						S0.pr("io_schd_sub_typ1"),
						S0.pr("io_schd_sub_no1"),
						S0.pr("io_schd_sub_seq1"),
						S0.pr("io_schd_sub_typ2"),
						S0.pr("io_schd_sub_no2"),
						S0.pr("io_schd_sub_seq2"),
						S0.pr("io_schd_sub_typ3"),
						S0.pr("io_schd_sub_no3"),
						S0.pr("io_schd_sub_seq3"),
						S0.pr("io_schd_sub_typ4"),
						S0.pr("io_schd_sub_no4"),
						S0.pr("io_schd_sub_seq4"),
						S0.pr("io_schd_pr_no"),
						S0.pr("sub_char1"),
						S0.pr("sub_char2"),
						S0.pr("sub_char3"),
						S0.pr("sub_char4"),
						S0.pr("sub_char5"),
						S0.pr("sub_num1"),
						S0.pr("sub_num2"),
						S0.pr("sub_num3"),
						S0.pr("sub_dt1"),
						S0.pr("sub_dt2"),
						S0.pr("sub_dt3"),
						S0_M9.itm_typ,
						S0_M9.itm_typ_d_cd,
						S0.pr("ins_usr_id"),
						S0.pr("ins_usr_nm"),
						S0.pr("ins_ts"),
						S0.pr("ins_func_id"),
						nullValue().as("ins_func_nm"),
						S0.pr("upd_usr_id"),
						S0.pr("upd_usr_nm"),
						S0.pr("upd_ts"),
						S0.pr("upd_func_id"),
						nullValue().as("upd_func_nm"),
						S0.pr("upd_srv_req_no"),
						addDynamicSelect(DS0C_ITM_GRP),
						// this field is appended by sql coverter.
						S0_M1.wg_cd.as("join_wg_cd_"),
						// this field is appended by sql coverter.
						S0.pr("gi_loc_cd").as("join_gi_loc_cd_")
					)
					.from(
						addDynamicView(REP)
						.innerJoin(S0_M1).on(
							bracket(
								S0.pr("loc_cd").eq(S0_M1.loc_cd)
							)
						)
						.leftOuterJoin(S0_M9).on(
							bracket(
								S0.pr("itm_cd").eq(S0_M9.itm_cd)
								.and(S0.pr("itm_sub1").eq(S0_M9.itm_sub1))
								.and(S0.pr("itm_sub2").eq(S0_M9.itm_sub2))
								.and(S0.pr("itm_sub3").eq(S0_M9.itm_sub3))
							)
						)
						.leftOuterJoin(S0_M17).on(
							bracket(
								S0.pr("itm_cd").eq(S0_M17.itm_cd)
								.and(S0.pr("itm_sub1").eq(S0_M17.itm_sub1))
								.and(S0.pr("itm_sub2").eq(S0_M17.itm_sub2))
								.and(S0.pr("itm_sub3").eq(S0_M17.itm_sub3))
								.and(S0.pr("sno1").eq(S0_M17.sno1))
								.and(S0.pr("sno2").eq(S0_M17.sno2))
								.and(S0.pr("sno3").eq(S0_M17.sno3))
								.and(S0.pr("sno4").eq(S0_M17.sno4))
							)
						)
						.addDynamicView()
						.addDynamicView(DS0C_ITM_GRP)
					)
					.where(
						value(0).eq(value(0))
						.cutoff$and(S0.pr("schd_dt").gte(bind("schd_dt_fr")))
						.cutoff$and(S0.pr("schd_dt").lte(bind("schd_dt_to")))
						.cutoff$and(S0.pr("accpt_schd_dt").gte(bind("accpt_schd_dt_fr")))
						.cutoff$and(S0.pr("accpt_schd_dt").lte(bind("accpt_schd_dt_to")))
						.cutoff$and(S0.pr("avl_schd_dt").gte(bind("avl_schd_dt_fr")))
						.cutoff$and(S0.pr("avl_schd_dt").lte(bind("avl_schd_dt_to")))
						.cutoff$and(S0.pr("loc_cd").like(bind("loc_cd")))
						.cutoff$and(S0_M1.loc_nm.like(bind("loc_nm")))
						.cutoff$and(S0.pr("str_ln_cd").like(bind("str_ln_cd")))
						.addDynamicPredicate()
						.cutoff$and(S0.pr("stk_arrv_bp_cd").like(bind("stk_arrv_bp_cd")))
						.cutoff$and(S0_M1.site_cd.like(bind("site_cd")))
						.cutoff$and(S0.pr("wg_cd").like(bind("wg_cd")))
						.cutoff$and(S0_M1.lg_grp_cd.like(bind("lg_grp_cd")))
						.cutoff$and(S0_M1.alloc_grp_cd.like(bind("alloc_grp_cd")))
						.cutoff$and(S0_M1.loc_grp_cd.like(bind("loc_grp_cd")))
						.cutoff$and(S0.pr("sppl_cd").like(bind("sppl_cd")))
						.cutoff$and(S0_M9.itm_typ.like(bind("itm_typ")))
						.cutoff$and(S0_M9.itm_typ_d_cd.like(bind("itm_typ_d_cd")))
						.cutoff$and(S0.pr("itm_cd").like(bind("itm_cd")))
						.cutoff$and(S0.pr("itm_sub1").like(bind("itm_sub1")))
						.cutoff$and(S0.pr("itm_sub2").like(bind("itm_sub2")))
						.cutoff$and(S0.pr("itm_sub3").like(bind("itm_sub3")))
						.cutoff$and(
							coalesce(
								S0_M17.itm_nm,
								S0_M9.itm_nm
							).like(bind("itm_nm"))
						)
						.cutoff$and(S0.pr("ver_no").like(bind("ver_no")))
						.cutoff$and(S0.pr("lot_no").like(bind("lot_no")))
						.cutoff$and(S0.pr("sublot_no").like(bind("sublot_no")))
						.cutoff$and(S0.pr("sno1").like(bind("sno1")))
						.cutoff$and(S0.pr("sno2").like(bind("sno2")))
						.cutoff$and(S0.pr("sno3").like(bind("sno3")))
						.cutoff$and(S0.pr("sno4").like(bind("sno4")))
						.cutoff$and(S0.pr("sno1_null_flg").eq(bind("sno1_null_flg")))
						.cutoff$and(S0.pr("sno2_null_flg").eq(bind("sno2_null_flg")))
						.cutoff$and(S0.pr("sno3_null_flg").eq(bind("sno3_null_flg")))
						.cutoff$and(S0.pr("sno4_null_flg").eq(bind("sno4_null_flg")))
						.cutoff$and(S0.pr("pack_unit_cd").like(bind("pack_unit_cd")))
						.cutoff$and(S0.pr("alt_grp_cd").like(bind("alt_grp_cd")))
						.cutoff$and(S0.pr("oper_inst_no").like(bind("oper_inst_no")))
						.cutoff$and(S0.pr("oper_ord_no").like(bind("oper_ord_no")))
						.cutoff$and(S0.pr("alt_itm_typ").like(bind("alt_itm_typ")))
						.cutoff$and(S0.pr("gd_cd").like(bind("gd_cd")))
						.cutoff$and(S0.pr("in_xfr_typ").like(bind("in_xfr_typ")))
						.cutoff$and(S0.pr("quality_typ").like(bind("quality_typ")))
						.cutoff$and(S0.pr("asst_typ").like(bind("asst_typ")))
						.cutoff$and(S0.pr("stk_insp_typ").like(bind("stk_insp_typ")))
						.cutoff$and(S0.pr("stk_id_typ").like(bind("stk_id_typ")))
						.cutoff$and(S0.pr("stk_bp_cd").like(bind("stk_bp_cd")))
						.cutoff$and(S0.pr("inpt_ctl_typ").like(bind("inpt_ctl_typ")))
						.cutoff$and(S0.pr("io_schd_typ").like(bind("io_schd_typ")))
						.cutoff$and(S0.pr("io_typ").like(bind("io_typ")))
						.cutoff$and(S0.pr("io_schd_sts_typ").like(bind("io_schd_sts_typ")))
						.cutoff$and(S0.pr("alloc_tgt_flg").eq(bind("alloc_tgt_flg")))
						.cutoff$and(S0.pr("alloc_scope_typ").like(bind("alloc_scope_typ")))
						.cutoff$and(S0.pr("alloc_flg").eq(bind("alloc_flg")))
						.cutoff$and(S0.pr("alloc_wait_flg").eq(bind("alloc_wait_flg")))
						.cutoff$and(bind("vld_dt").between(S0.pr("vld_dt_fr"), S0.pr("vld_dt_to")))
						.cutoff$and(S0.pr("vld_dt_fr").gte(bind("vld_dt_fr_fr")))
						.cutoff$and(S0.pr("vld_dt_fr").lte(bind("vld_dt_fr_to")))
						.cutoff$and(S0.pr("vld_dt_to").gte(bind("vld_dt_to_fr")))
						.cutoff$and(S0.pr("vld_dt_to").lte(bind("vld_dt_to_to")))
						.cutoff$and(S0.pr("io_schd_no").like(bind("io_schd_no")))
						.cutoff$and(S0.pr("io_schd_sub_typ1").like(bind("io_schd_sub_typ1")))
						.cutoff$and(S0.pr("io_schd_sub_no1").like(bind("io_schd_sub_no1")))
						.cutoff$and(S0.pr("io_schd_sub_typ2").like(bind("io_schd_sub_typ2")))
						.cutoff$and(S0.pr("io_schd_sub_no2").like(bind("io_schd_sub_no2")))
						.cutoff$and(S0.pr("io_schd_sub_typ3").like(bind("io_schd_sub_typ3")))
						.cutoff$and(S0.pr("io_schd_sub_no3").like(bind("io_schd_sub_no3")))
						.cutoff$and(S0.pr("io_schd_sub_typ4").like(bind("io_schd_sub_typ4")))
						.cutoff$and(S0.pr("io_schd_sub_no4").like(bind("io_schd_sub_no4")))
						.cutoff$and(S0.pr("io_schd_pr_no").like(bind("io_schd_pr_no")))
						.cutoff$and(S0.pr("slip_schd_no").like(bind("slip_schd_no")))
						.cutoff$and(S0.pr("sub_char1").like(bind("sub_char1")))
						.cutoff$and(S0.pr("sub_char2").like(bind("sub_char2")))
						.cutoff$and(S0.pr("sub_char3").like(bind("sub_char3")))
						.cutoff$and(S0.pr("sub_char4").like(bind("sub_char4")))
						.cutoff$and(S0.pr("sub_char5").like(bind("sub_char5")))
						.cutoff$and(S0.pr("sub_dt1").eq(bind("sub_dt1")))
						.cutoff$and(S0.pr("sub_dt2").eq(bind("sub_dt2")))
						.cutoff$and(S0.pr("sub_dt3").eq(bind("sub_dt3")))
						.addDynamicPredicate(DS0C_ITM_GRP)
					)
			)
			.setDynamicSQLInfo(
				when(boundOr("str_ln_nm"))
					.view(v -> v.leftOuterJoin(S0_M2).on(bracket(S0.pr("loc_cd").eq(S0_M2.loc_cd).and(S0.pr("str_ln_cd").eq(S0_M2.str_ln_cd)))))
					.predicate(p -> p.cutoff$and(S0_M2.str_ln_nm.like(bind("str_ln_nm")))),
				when(boundOr("stk_arrv_bp_nm"))
					.view(v -> v.leftOuterJoin(S0_M3).on(bracket(S0.pr("stk_arrv_bp_cd").eq(S0_M3.bp_cd))))
					.predicate(p -> p.cutoff$and(S0_M3.bp_nm.like(bind("stk_arrv_bp_nm")))),
				when(boundOr("site_nm"))
					.view(v -> v.leftOuterJoin(S0_M4).on(bracket(S0_M1.site_cd.eq(S0_M4.site_cd))))
					.predicate(p -> p.cutoff$and(S0_M4.site_nm.like(bind("site_nm")))),
				when(boundOr("wg_nm"))
					.view(v -> v.leftOuterJoin(S0_M5).on(bracket(S0_M1.wg_cd.eq(S0_M5.wg_cd))))
					.predicate(p -> p.cutoff$and(S0_M5.wg_nm.like(bind("wg_nm")))),
				when(boundOr("lg_grp_nm"))
					.view(v -> v.leftOuterJoin(S0_M6).on(bracket(S0_M1.lg_grp_cd.eq(S0_M6.lg_grp_cd))))
					.predicate(p -> p.cutoff$and(S0_M6.lg_grp_nm.like(bind("lg_grp_nm")))),
				when(boundOr("alloc_grp_nm"))
					.view(v -> v.leftOuterJoin(S0_M7).on(bracket(S0_M1.alloc_grp_cd.eq(S0_M7.alloc_grp_cd))))
					.predicate(p -> p.cutoff$and(S0_M7.alloc_grp_nm.like(bind("alloc_grp_nm")))),
				when(boundOr("loc_grp_nm"))
					.view(v -> v.leftOuterJoin(S0_M8).on(bracket(S0_M1.loc_grp_cd.eq(S0_M8.loc_grp_cd))))
					.predicate(p -> p.cutoff$and(S0_M8.loc_grp_nm.like(bind("loc_grp_nm")))),
				when(boundOr("pack_unit_nm"))
					.view(v -> v.leftOuterJoin(S0_M10).on(bracket(S0.pr("pack_unit_cd").eq(S0_M10.unit_cd))))
					.predicate(p -> p.cutoff$and(S0_M10.unit_nm.like(bind("pack_unit_nm")))),
				when(boundOr("alt_grp_nm"))
					.view(v -> v.leftOuterJoin(S0_M12).on(bracket(S0.pr("alt_grp_cd").eq(S0_M12.alt_grp_cd).and(S0.pr("wg_cd").eq(S0_M12.wg_cd)))))
					.predicate(p -> p.cutoff$and(S0_M12.alt_grp_nm.like(bind("alt_grp_nm")))),
				when(boundOr("gd_nm"))
					.view(v -> v.leftOuterJoin(S0_M13).on(bracket(S0.pr("gd_cd").eq(S0_M13.gd_cd))))
					.predicate(p -> p.cutoff$and(S0_M13.gd_nm.like(bind("gd_nm")))),
				when(boundOr("stk_bp_nm"))
					.view(v -> v.leftOuterJoin(S0_M14).on(bracket(S0.pr("stk_bp_cd").eq(S0_M14.bp_cd))))
					.predicate(p -> p.cutoff$and(S0_M14.bp_nm.like(bind("stk_bp_nm")))),
				when(boundOr("sppl_nm"))
					.view(v -> v.leftOuterJoin(S0_M15).on(bracket(S0.pr("sppl_cd").eq(S0_M15.bp_cd))))
					.predicate(p -> p.cutoff$and(S0_M15.bp_nm.like(bind("sppl_nm")))),
				when(boundOr("itm_typ_d_nm"))
					.view(v -> v.leftOuterJoin(S0_M16).on(bracket(S0_M9.itm_typ.eq(S0_M16.itm_typ).and(S0_M9.itm_typ_d_cd.eq(S0_M16.itm_typ_d_cd)))))
					.predicate(p -> p.cutoff$and(S0_M16.itm_typ_d_nm.like(bind("itm_typ_d_nm")))),
				when(boundOr("wrk_no", "wkk_nm"))
					.view(v -> v.leftOuterJoin(S0_T2).on(bracket(S0.pr("sno1").eq(S0_T2.sno1))))
					.predicate(p -> p.cutoff$and(S0_T2.wrk_no.like(bind("wrk_no"))).cutoff$and(S0_T2.wrk_nm.like(bind("wkk_nm")))),
				when(boundOr("itm_grp_flg1"))
					.select(DS0C_ITM_GRP, S0_M9.itm_grp_cd1.as("itm_grp_cd1"), S0_MM1.itm_grp_nm.as("itm_grp_nm1"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM1).on(S0_M9.itm_grp_cd1.eq(S0_MM1.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP1.value()).eq(S0_MM1.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M9.itm_grp_cd1.like(bind("itm_grp_cd1"))).cutoff$and(S0_MM1.itm_grp_nm.like(bind("itm_grp_nm1")))),
				when(boundOr("itm_grp_flg2"))
					.select(DS0C_ITM_GRP, S0_M9.itm_grp_cd2.as("itm_grp_cd2"), S0_MM2.itm_grp_nm.as("itm_grp_nm2"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM2).on(S0_M9.itm_grp_cd2.eq(S0_MM2.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP2.value()).eq(S0_MM2.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M9.itm_grp_cd2.like(bind("itm_grp_cd2"))).cutoff$and(S0_MM2.itm_grp_nm.like(bind("itm_grp_nm2")))),
				when(boundOr("itm_grp_flg3"))
					.select(DS0C_ITM_GRP, S0_M9.itm_grp_cd3.as("itm_grp_cd3"), S0_MM3.itm_grp_nm.as("itm_grp_nm3"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM3).on(S0_M9.itm_grp_cd3.eq(S0_MM3.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP3.value()).eq(S0_MM3.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M9.itm_grp_cd3.like(bind("itm_grp_cd3"))).cutoff$and(S0_MM3.itm_grp_nm.like(bind("itm_grp_nm3")))),
				when(boundOr("itm_grp_flg4"))
					.select(DS0C_ITM_GRP, S0_M9.itm_grp_cd4.as("itm_grp_cd4"), S0_MM4.itm_grp_nm.as("itm_grp_nm4"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM4).on(S0_M9.itm_grp_cd4.eq(S0_MM4.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP4.value()).eq(S0_MM4.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M9.itm_grp_cd4.like(bind("itm_grp_cd4"))).cutoff$and(S0_MM4.itm_grp_nm.like(bind("itm_grp_nm4")))),
				when(boundOr("itm_grp_flg5"))
					.select(DS0C_ITM_GRP, S0_M9.itm_grp_cd5.as("itm_grp_cd5"), S0_MM5.itm_grp_nm.as("itm_grp_nm5"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM5).on(S0_M9.itm_grp_cd5.eq(S0_MM5.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP5.value()).eq(S0_MM5.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M9.itm_grp_cd5.like(bind("itm_grp_cd5"))).cutoff$and(S0_MM5.itm_grp_nm.like(bind("itm_grp_nm5")))),
				when(boundOr("itm_grp_flg6"))
					.select(DS0C_ITM_GRP, S0_M9.itm_grp_cd6.as("itm_grp_cd6"), S0_MM6.itm_grp_nm.as("itm_grp_nm6"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM6).on(S0_M9.itm_grp_cd6.eq(S0_MM6.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP6.value()).eq(S0_MM6.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M9.itm_grp_cd6.like(bind("itm_grp_cd6"))).cutoff$and(S0_MM6.itm_grp_nm.like(bind("itm_grp_nm6")))),
				when(boundOr("itm_grp_flg7"))
					.select(DS0C_ITM_GRP, S0_M9.itm_grp_cd7.as("itm_grp_cd7"), S0_MM7.itm_grp_nm.as("itm_grp_nm7"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM7).on(S0_M9.itm_grp_cd7.eq(S0_MM7.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP7.value()).eq(S0_MM7.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M9.itm_grp_cd7.like(bind("itm_grp_cd7"))).cutoff$and(S0_MM7.itm_grp_nm.like(bind("itm_grp_nm7")))),
				when(boundOr("itm_grp_flg8"))
					.select(DS0C_ITM_GRP, S0_M9.itm_grp_cd8.as("itm_grp_cd8"), S0_MM8.itm_grp_nm.as("itm_grp_nm8"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM8).on(S0_M9.itm_grp_cd8.eq(S0_MM8.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP8.value()).eq(S0_MM8.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M9.itm_grp_cd8.like(bind("itm_grp_cd8"))).cutoff$and(S0_MM8.itm_grp_nm.like(bind("itm_grp_nm8")))),
				when(boundOr("itm_grp_flg9"))
					.select(DS0C_ITM_GRP, S0_M9.itm_grp_cd9.as("itm_grp_cd9"), S0_MM9.itm_grp_nm.as("itm_grp_nm9"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM9).on(S0_M9.itm_grp_cd9.eq(S0_MM9.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP9.value()).eq(S0_MM9.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M9.itm_grp_cd9.like(bind("itm_grp_cd9"))).cutoff$and(S0_MM9.itm_grp_nm.like(bind("itm_grp_nm9")))),
				when(boundOr("itm_grp_flg10"))
					.select(DS0C_ITM_GRP, S0_M9.itm_grp_cd10.as("itm_grp_cd10"), S0_MM10.itm_grp_nm.as("itm_grp_nm10"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM10).on(S0_M9.itm_grp_cd10.eq(S0_MM10.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP10.value()).eq(S0_MM10.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M9.itm_grp_cd10.like(bind("itm_grp_cd10"))).cutoff$and(S0_MM10.itm_grp_nm.like(bind("itm_grp_nm10"))))
			)
			.setJoinInfo(
				joinInfo(
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
						.add(MAM_BP_R.class, r -> toCondition(
							r.getStringNE("stk_arrv_bp_cd")
						))
						.addSelect(m -> toArray(
							m.bp_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("stk_arrv_bp_nm", m.bp_nm());
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
							r.getStringNE("join_wg_cd_")
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
						.add(MAM_UNIT_R.class, r -> toCondition(
							r.getStringNE("pack_unit_cd")
						))
						.addSelect(m -> toArray(
							m.unit_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("pack_unit_nm", m.unit_nm());
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
						.add(MAM_ALT_GRP_R.class, r -> toCondition(
							r.getStringNE("alt_grp_cd"),
							r.getStringNE("wg_cd")
						))
						.addSelect(m -> toArray(
							m.alt_grp_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("alt_grp_nm", m.alt_grp_nm());
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
							m.bp_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("stk_bp_nm", m.bp_nm());
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
					}),
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
						.add(MAM_LOC_R.class, r -> toCondition(
							r.getStringNE("join_gi_loc_cd_")
						))
						.addSelect(m -> toArray(
							m.lg_grp_cd
						))
						.addMap((r, m) -> {
							r.setStringNE("gi_lg_grp_cd", m.lg_grp_cd());
					})
				)
			);
	}
}