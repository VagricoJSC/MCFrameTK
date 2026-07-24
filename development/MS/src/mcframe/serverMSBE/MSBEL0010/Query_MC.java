package mcframe.serverMSBE.MSBEL0010;

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
	 * -- MSBEL0010_MST_STK_Query_S01
	 */
	static MCQueryPlan MSBEL0010_MST_STK_S01() {
		MST_STK_R S0T1 = MST_STK_R.create("T1");
		MAM_ITM_R S0M1 = MAM_ITM_R.create("M1");
		MAM_ITM_TYP_D_R S0M2 = MAM_ITM_TYP_D_R.create("M2");
		MAM_LOC_R S0M3 = MAM_LOC_R.create("M3");
		MAM_SITE_R S0M4 = MAM_SITE_R.create("M4");
		MAM_WG_R S0M5 = MAM_WG_R.create("M5");
		MAM_LG_GRP_R S0M6 = MAM_LG_GRP_R.create("M6");
		MAM_ALLOC_GRP_R S0M7 = MAM_ALLOC_GRP_R.create("M7");
		MAM_LOC_GRP_R S0M8 = MAM_LOC_GRP_R.create("M8");
		MAM_STR_LN_R S0M9 = MAM_STR_LN_R.create("M9");
		MAM_BP_R S0M10 = MAM_BP_R.create("M10");
		MAM_STK_GD_R S0M11 = MAM_STK_GD_R.create("M11");
		MAM_BP_R S0M12 = MAM_BP_R.create("M12");
		MAM_UNIT_R S0M13 = MAM_UNIT_R.create("M13");
		MAM_ITM_SITE_R S0M17 = MAM_ITM_SITE_R.create("M17");
		MSVT_LOT_LIST_R S0T3 = MSVT_LOT_LIST_R.create("T3");
		MSVT_WRK_SNO_R S0T5 = MSVT_WRK_SNO_R.create("T5");
		MST_INSP_SCHD_R S0T6 = MST_INSP_SCHD_R.create("T6");
		MST_INSP_SCHD_R S0T7 = MST_INSP_SCHD_R.create("T7");
		MST_INSP_SCHD_R S0T8 = MST_INSP_SCHD_R.create("T8");
		MAM_SUNDRY_ITM_R S0M19 = MAM_SUNDRY_ITM_R.create("M19");
		MAM_CO_R S0M20 = MAM_CO_R.create("M20");
		MAM_LOC_SUB_R S0M22 = MAM_LOC_SUB_R.create("M22");
		MAM_DPT_R S0M18 = MAM_DPT_R.create("M18");
		MAVM_RD_LOC_R S0M99 = MAVM_RD_LOC_R.create("M99");
		MAM_ITM_GRP_R S0MM1 = MAM_ITM_GRP_R.create("MM1");
		MAM_ITM_GRP_R S0MM2 = MAM_ITM_GRP_R.create("MM2");
		MAM_ITM_GRP_R S0MM3 = MAM_ITM_GRP_R.create("MM3");
		MAM_ITM_GRP_R S0MM4 = MAM_ITM_GRP_R.create("MM4");
		MAM_ITM_GRP_R S0MM5 = MAM_ITM_GRP_R.create("MM5");
		MAM_ITM_GRP_R S0MM6 = MAM_ITM_GRP_R.create("MM6");
		MAM_ITM_GRP_R S0MM7 = MAM_ITM_GRP_R.create("MM7");
		MAM_ITM_GRP_R S0MM8 = MAM_ITM_GRP_R.create("MM8");
		MAM_ITM_GRP_R S0MM9 = MAM_ITM_GRP_R.create("MM9");
		MAM_ITM_GRP_R S0MM10 = MAM_ITM_GRP_R.create("MM10");
		
		MCDynamicSQLID DS0C_ITM_GRP = createDynamicSQLID("DS0C_ITM_GRP");
		MCDynamicSQLID ORDERBY = createDynamicSQLID("ORDERBY");
		
		return createQueryPlan()
			.setQuery(
				sql("MSBEL0010_MST_STK_Query_S01")
					.mainQuery()
					.select(
						S0M3.wg_cd,
						coalesce(
							S0M22.asst_dpt_cd,
							S0M3.asst_dpt_cd
						).as("dpt_cd"),
						S0M18.dpt_nm,
						S0T1.itm_cd,
						S0T1.itm_sub1,
						S0T1.itm_sub2,
						S0T1.itm_sub3,
						coalesce(
							S0M19.itm_nm,
							S0M1.itm_nm
						).as("itm_nm"),
						S0T3.ver_no,
						S0T1.lot_no,
						S0T1.sublot_no,
						S0T1.loc_cd,
						S0M3.loc_nm,
						S0T1.str_ln_cd,
						S0M3.site_cd,
						S0M3.lg_grp_cd,
						S0M3.alloc_grp_cd,
						S0M3.loc_grp_cd,
						S0T1.gd_cd,
						S0T1.quality_typ,
						S0T1.stk_insp_typ,
						S0T1.sno1,
						S0T1.sno2,
						S0T1.sno3,
						S0T1.sno4,
						S0T1.in_xfr_typ,
						S0T1.asst_typ,
						S0T1.stk_id_typ,
						S0T1.stk_bp_cd,
						S0T1.fix_no_typ,
						S0T1.fix_no,
						S0T1.stk_arrv_bp_cd,
						S0T1.pack_unit_qty,
						S0T1.pack_unit_cd,
						S0T1.base_unit_qty.as("stk_qty"),
						S0M1.unit_cd.as("base_unit_cd"),
						S0M1.dec_place.as("base_unit_dec_place"),
						MAPA_STD_COST$F_GET_STD_UPRI(
							S0T1.itm_cd,
							S0T1.itm_sub1,
							S0T1.itm_sub2,
							S0T1.itm_sub3,
							bind("base_dt"),
							S0M3.wg_cd,
							S0M20.stk_std_upri_typ
						).as("std_unit_cost"),
						MAPA_STD_COST$F_GET_STD_AMT(
							S0T1.itm_cd,
							S0T1.itm_sub1,
							S0T1.itm_sub2,
							S0T1.itm_sub3,
							bind("base_dt"),
							S0M3.wg_cd,
							S0T1.base_unit_qty,
							S0M20.stk_std_upri_typ
						).as("stk_amt"),
						S0M20.base_cur_cd,
						S0M20.stk_amt_dec_place.as("stk_amt_dec_place"),
						S0M20.stk_amt_rnd_typ.as("stk_amt_rnd_typ"),
						S0T3.act_cont_fctr,
						S0M1.cont_fctr_flg,
						S0M1.std_cont_fctr,
						S0M1.cont_fctr_unit_cd,
						S0M1.cont_fctr_rnd_typ,
						S0M1.cont_fctr_dec_place,
						S0T3.bp_lot_no,
						S0T3.quality_typ.as("lot_quality_typ"),
						S0T3.stk_insp_typ.as("lot_stk_insp_typ"),
						S0T3.mfg_aprv_sts_typ,
						S0T3.plnt_aprv_sts_typ,
						S0T3.first_gr_dt,
						S0T3.unreg_lmt_flg,
						S0T3.vld_dt,
						S0T3.lmt_dt,
						S0T3.mrkt_judg_sts_typ,
						S0T1.sub_char1.as("stk_sub_char1"),
						S0T1.sub_char2.as("stk_sub_char2"),
						S0T1.sub_char3.as("stk_sub_char3"),
						S0T3.lot_rmrks,
						S0T3.lot_sub_char1,
						S0T3.lot_sub_char2,
						S0T3.lot_sub_char3,
						S0M1.itm_typ,
						S0M1.itm_typ_d_cd,
						S0T1.ins_usr_id,
						S0T1.ins_usr_nm,
						S0T1.ins_func_id,
						S0T1.ins_ts,
						S0T1.upd_usr_id,
						S0T1.upd_usr_nm,
						S0T1.upd_func_id,
						S0T1.upd_ts,
						S0T1.upd_srv_req_no,
						nvl(
							decode(
								S0T1.fix_no_typ,
								value(MSC_FIX_NO_TYP.INSP_SCHD_NO.value()),
								S0T6.in_prmt_insp_flg,
								value(MSC_FIX_NO_TYP.YIELD_ACT_NO.value()),
								S0T7.in_prmt_insp_flg,
								value(MSC_FIX_NO_TYP.ARR_ACT_NO.value()),
								S0T8.in_prmt_insp_flg
							),
							S0M17.in_prmt_insp_flg
						).as("in_prmt_insp_flg"),
						addDynamicSelect(DS0C_ITM_GRP)
					)
					.from(
						S0T1
						.leftOuterJoin(S0M1).on(
							S0T1.itm_cd.eq(S0M1.itm_cd)
							.and(S0T1.itm_sub1.eq(S0M1.itm_sub1))
							.and(S0T1.itm_sub2.eq(S0M1.itm_sub2))
							.and(S0T1.itm_sub3.eq(S0M1.itm_sub3))
						)
						.leftOuterJoin(S0M3).on(S0T1.loc_cd.eq(S0M3.loc_cd))
						.leftOuterJoin(S0T3).on(
							S0T1.itm_cd.eq(S0T3.itm_cd)
							.and(S0T1.itm_sub1.eq(S0T3.itm_sub1))
							.and(S0T1.itm_sub2.eq(S0T3.itm_sub2))
							.and(S0T1.itm_sub3.eq(S0T3.itm_sub3))
							.and(S0T1.lot_no.eq(S0T3.lot_no))
							.and(S0T1.sublot_no.eq(S0T3.sublot_no))
						)
						.leftOuterJoin(S0M19).on(
							S0T1.itm_cd.eq(S0M19.itm_cd)
							.and(S0T1.itm_sub1.eq(S0M19.itm_sub1))
							.and(S0T1.itm_sub2.eq(S0M19.itm_sub2))
							.and(S0T1.itm_sub3.eq(S0M19.itm_sub3))
							.and(S0T1.sno1.eq(S0M19.sno1))
							.and(S0T1.sno2.eq(S0M19.sno2))
							.and(S0T1.sno3.eq(S0M19.sno3))
							.and(S0T1.sno4.eq(S0M19.sno4))
						)
						.crossJoin(S0M20)
						.leftOuterJoin(S0M22).on(
							S0T1.loc_cd.eq(S0M22.loc_cd)
							.and(bind("base_dt").gte(S0M22.st_dt))
							.and(bind("base_dt").lte(S0M22.end_dt))
						)
						.leftOuterJoin(S0M18).on(
							coalesce(
								S0M22.asst_dpt_cd,
								S0M3.asst_dpt_cd
							).eq(S0M18.dpt_cd)
							.and(bind("base_dt").between(S0M18.st_dt, S0M18.end_dt))
						)
						.leftOuterJoin(S0M17).on(
							S0M3.site_cd.eq(S0M17.site_cd)
							.and(S0T1.itm_cd.eq(S0M17.itm_cd))
							.and(S0T1.itm_sub1.eq(S0M17.itm_sub1))
							.and(S0T1.itm_sub2.eq(S0M17.itm_sub2))
							.and(S0T1.itm_sub3.eq(S0M17.itm_sub3))
						)
						.leftOuterJoin(S0T6).on(
							S0T1.fix_no.eq(S0T6.insp_schd_no)
							.and(S0T1.fix_no_typ.eq(value(MSC_FIX_NO_TYP.INSP_SCHD_NO.value())))
						)
						.leftOuterJoin(S0T7).on(
							S0T1.fix_no.eq(S0T7.src_no4)
							.and(S0T1.fix_no_typ.eq(value(MSC_FIX_NO_TYP.YIELD_ACT_NO.value())))
							.and(S0T7.insp_typ.eq(value(MSC_INSP_TYP.PRDCT.value())))
						)
						.leftOuterJoin(S0T8).on(
							S0T1.fix_no.eq(S0T8.src_no4)
							.and(S0T1.fix_no_typ.eq(value(MSC_FIX_NO_TYP.ARR_ACT_NO.value())))
							.and(S0T8.insp_typ.eq(value(MSC_INSP_TYP.ACCPT.value())))
							.and(
								S0T1.stk_insp_typ.eq(value(MSC_STK_INSP_TYP.YET.value()))
								.or(S0T1.stk_insp_typ.eq(value(MSC_STK_INSP_TYP.ING.value())))
								.or(S0T1.stk_insp_typ.eq(value(MSC_STK_INSP_TYP.WAIT_JUDG.value())))
							)
						)
						.innerJoin(S0M99).on(S0T1.loc_cd.eq(S0M99.loc_cd))
						.addDynamicView()
						.addDynamicView(DS0C_ITM_GRP)
					)
					.where(
						value(0).eq(value(0))
						.cutoff$and(S0T1.loc_cd.like(bind("loc_cd")))
						.cutoff$and(S0M3.loc_nm.like(bind("loc_nm")))
						.cutoff$and(S0T1.str_ln_cd.like(bind("str_ln_cd")))
						.addDynamicPredicate()
						.cutoff$and(S0M3.site_cd.like(bind("site_cd")))
						.cutoff$and(S0M3.wg_cd.like(bind("wg_cd")))
						.cutoff$and(S0M3.lg_grp_cd.like(bind("lg_grp_cd")))
						.cutoff$and(S0M3.alloc_grp_cd.like(bind("alloc_grp_cd")))
						.cutoff$and(S0M3.loc_grp_cd.like(bind("loc_grp_cd")))
						.cutoff$and(
							coalesce(
								S0M22.asst_dpt_cd,
								S0M3.asst_dpt_cd
							).like(bind("dpt_cd"))
						)
						.cutoff$and(S0M18.dpt_nm.like(bind("dpt_nm")))
						.cutoff$and(S0M1.itm_typ.like(bind("itm_typ")))
						.cutoff$and(S0M1.itm_typ_d_cd.like(bind("itm_typ_d_cd")))
						.cutoff$and(S0T1.itm_cd.like(bind("itm_cd")))
						.cutoff$and(S0T1.itm_sub1.like(bind("itm_sub1")))
						.cutoff$and(S0T1.itm_sub2.like(bind("itm_sub2")))
						.cutoff$and(S0T1.itm_sub3.like(bind("itm_sub3")))
						.cutoff$and(
							coalesce(
								S0M19.itm_nm,
								S0M1.itm_nm
							).like(bind("itm_nm"))
						)
						.cutoff$and(S0T3.ver_no.like(bind("ver_no")))
						.cutoff$and(S0T1.lot_no.like(bind("lot_no")))
						.cutoff$and(S0T1.sublot_no.like(bind("sublot_no")))
						.cutoff$and(S0T3.bp_lot_no.like(bind("bp_lot_no")))
						.cutoff$and(S0T1.sno1.like(bind("sno1")))
						.cutoff$and(S0T1.sno2.like(bind("sno2")))
						.cutoff$and(S0T1.sno3.like(bind("sno3")))
						.cutoff$and(S0T1.sno4.like(bind("sno4")))
						.cutoff$and(S0T3.vld_dt.gte(bind("vld_dt_fr")))
						.cutoff$and(S0T3.vld_dt.lte(bind("vld_dt_to")))
						.cutoff$and(S0T3.lmt_dt.gte(bind("lmt_dt_fr")))
						.cutoff$and(S0T3.lmt_dt.lte(bind("lmt_dt_to")))
						.cutoff$and(S0T3.unreg_lmt_flg.eq(bind("only_unreg_lmt_true")))
						.cutoff$and(S0T1.asst_typ.like(bind("asst_typ")))
						.cutoff$and(S0T1.stk_id_typ.like(bind("stk_id_typ")))
						.cutoff$and(S0T1.stk_bp_cd.like(bind("stk_bp_cd")))
						.cutoff$and(S0T1.in_xfr_typ.like(bind("in_xfr_typ")))
						.cutoff$and(S0T1.quality_typ.like(bind("quality_typ")))
						.cutoff$and(S0T1.stk_insp_typ.like(bind("stk_insp_typ")))
						.cutoff$and(S0T1.gd_cd.like(bind("gd_cd")))
						.cutoff$and(S0T1.stk_arrv_bp_cd.like(bind("stk_arrv_bp_cd")))
						.cutoff$and(
							not(
								S0M3.sppl_cd.isNull()
								.and(S0T1.stk_arrv_bp_cd.neq(value(MAC_STR.NULL_VAL.value())))
							)
							.and(bind("only_int_true").isNotNull())
						)
						.cutoff$and(S0T1.fix_no_typ.like(bind("fix_no_typ")))
						.cutoff$and(S0T1.fix_no.like(bind("fix_no")))
						.cutoff$and(S0T1.pack_unit_cd.like(bind("pack_unit_cd")))
						.cutoff$and(S0T3.first_gr_dt.gte(bind("first_gr_dt_fr")))
						.cutoff$and(S0T3.first_gr_dt.lte(bind("first_gr_dt_to")))
						.cutoff$and(S0M1.stk_lst_flg.eq(bind("only_stk_lst_flg_true")))
						.cutoff$and(S0T1.sub_char1.like(bind("stk_sub_char1")))
						.cutoff$and(S0T1.sub_char2.like(bind("stk_sub_char2")))
						.cutoff$and(S0T1.sub_char3.like(bind("stk_sub_char3")))
						.cutoff$and(S0T3.lot_rmrks.like(bind("lot_rmrks")))
						.cutoff$and(S0T3.lot_sub_char1.like(bind("lot_sub_char1")))
						.cutoff$and(S0T3.lot_sub_char2.like(bind("lot_sub_char2")))
						.cutoff$and(S0T3.lot_sub_char3.like(bind("lot_sub_char3")))
						.addDynamicPredicate(DS0C_ITM_GRP)
					)
					.orderBy(addDynamicOrderBy(ORDERBY))
			)
			.setDynamicSQLInfo(
				when(boundOr("itm_typ_d_nm"))
					.view(v -> v.leftOuterJoin(S0M2).on(S0M1.itm_typ.eq(S0M2.itm_typ).and(S0M1.itm_typ_d_cd.eq(S0M2.itm_typ_d_cd))))
					.predicate(p -> p.cutoff$and(S0M2.itm_typ_d_nm.like(bind("itm_typ_d_nm")))),
				when(boundOr("site_nm"))
					.view(v -> v.leftOuterJoin(S0M4).on(S0M3.site_cd.eq(S0M4.site_cd)))
					.predicate(p -> p.cutoff$and(S0M4.site_nm.like(bind("site_nm")))),
				when(boundOr("wg_nm"))
					.view(v -> v.leftOuterJoin(S0M5).on(S0M3.wg_cd.eq(S0M5.wg_cd)))
					.predicate(p -> p.cutoff$and(S0M5.wg_nm.like(bind("wg_nm")))),
				when(boundOr("lg_grp_nm"))
					.view(v -> v.leftOuterJoin(S0M6).on(S0M3.lg_grp_cd.eq(S0M6.lg_grp_cd)))
					.predicate(p -> p.cutoff$and(S0M6.lg_grp_nm.like(bind("lg_grp_nm")))),
				when(boundOr("alloc_grp_nm"))
					.view(v -> v.leftOuterJoin(S0M7).on(S0M3.alloc_grp_cd.eq(S0M7.alloc_grp_cd)))
					.predicate(p -> p.cutoff$and(S0M7.alloc_grp_nm.like(bind("alloc_grp_nm")))),
				when(boundOr("loc_grp_nm"))
					.view(v -> v.leftOuterJoin(S0M8).on(S0M3.loc_grp_cd.eq(S0M8.loc_grp_cd)))
					.predicate(p -> p.cutoff$and(S0M8.loc_grp_nm.like(bind("loc_grp_nm")))),
				when(boundOr("str_ln_nm"))
					.view(v -> v.leftOuterJoin(S0M9).on(S0T1.loc_cd.eq(S0M9.loc_cd).and(S0T1.str_ln_cd.eq(S0M9.str_ln_cd))))
					.predicate(p -> p.cutoff$and(S0M9.str_ln_nm.like(bind("str_ln_nm")))),
				when(boundOr("stk_arrv_bp_nm"))
					.view(v -> v.leftOuterJoin(S0M10).on(S0T1.stk_arrv_bp_cd.eq(S0M10.bp_cd)))
					.predicate(p -> p.cutoff$and(S0M10.bp_nm.like(bind("stk_arrv_bp_nm")))),
				when(boundOr("gd_nm"))
					.view(v -> v.leftOuterJoin(S0M11).on(S0T1.gd_cd.eq(S0M11.gd_cd)))
					.predicate(p -> p.cutoff$and(S0M11.gd_nm.like(bind("gd_nm")))),
				when(boundOr("stk_bp_nm"))
					.view(v -> v.leftOuterJoin(S0M12).on(S0T1.stk_bp_cd.eq(S0M12.bp_cd)))
					.predicate(p -> p.cutoff$and(S0M12.bp_nm.like(bind("stk_bp_nm")))),
				when(boundOr("pack_unit_nm"))
					.view(v -> v.leftOuterJoin(S0M13).on(S0T1.pack_unit_cd.eq(S0M13.unit_cd)))
					.predicate(p -> p.cutoff$and(S0M13.unit_nm.like(bind("pack_unit_nm")))),
				when(boundOr("wrk_no", "wrk_nm"))
					.view(v -> v.leftOuterJoin(S0T5).on(S0T1.sno1.eq(S0T5.sno1)))
					.predicate(p -> p.cutoff$and(S0T5.wrk_no.like(bind("wrk_no"))).cutoff$and(S0T5.wrk_nm.like(bind("wrk_nm")))),
				when(boundOr("itm_grp_flg1"))
					.select(DS0C_ITM_GRP, S0M1.itm_grp_cd1.as("itm_grp_cd1"), S0MM1.itm_grp_nm.as("itm_grp_nm1"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0MM1).on(S0M1.itm_grp_cd1.eq(S0MM1.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP1.value()).eq(S0MM1.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0MM1.itm_grp_cd.like(bind("itm_grp_cd1"))).cutoff$and(S0MM1.itm_grp_nm.like(bind("itm_grp_nm1")))),
				when(boundOr("itm_grp_flg2"))
					.select(DS0C_ITM_GRP, S0M1.itm_grp_cd2.as("itm_grp_cd2"), S0MM2.itm_grp_nm.as("itm_grp_nm2"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0MM2).on(S0M1.itm_grp_cd2.eq(S0MM2.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP2.value()).eq(S0MM2.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0MM2.itm_grp_cd.like(bind("itm_grp_cd2"))).cutoff$and(S0MM2.itm_grp_nm.like(bind("itm_grp_nm2")))),
				when(boundOr("itm_grp_flg3"))
					.select(DS0C_ITM_GRP, S0M1.itm_grp_cd3.as("itm_grp_cd3"), S0MM3.itm_grp_nm.as("itm_grp_nm3"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0MM3).on(S0M1.itm_grp_cd3.eq(S0MM3.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP3.value()).eq(S0MM3.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0MM3.itm_grp_cd.like(bind("itm_grp_cd3"))).cutoff$and(S0MM3.itm_grp_nm.like(bind("itm_grp_nm3")))),
				when(boundOr("itm_grp_flg4"))
					.select(DS0C_ITM_GRP, S0M1.itm_grp_cd4.as("itm_grp_cd4"), S0MM4.itm_grp_nm.as("itm_grp_nm4"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0MM4).on(S0M1.itm_grp_cd4.eq(S0MM4.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP4.value()).eq(S0MM4.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0MM4.itm_grp_cd.like(bind("itm_grp_cd4"))).cutoff$and(S0MM4.itm_grp_nm.like(bind("itm_grp_nm4")))),
				when(boundOr("itm_grp_flg5"))
					.select(DS0C_ITM_GRP, S0M1.itm_grp_cd5.as("itm_grp_cd5"), S0MM5.itm_grp_nm.as("itm_grp_nm5"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0MM5).on(S0M1.itm_grp_cd5.eq(S0MM5.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP5.value()).eq(S0MM5.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0MM5.itm_grp_cd.like(bind("itm_grp_cd5"))).cutoff$and(S0MM5.itm_grp_nm.like(bind("itm_grp_nm5")))),
				when(boundOr("itm_grp_flg6"))
					.select(DS0C_ITM_GRP, S0M1.itm_grp_cd6.as("itm_grp_cd6"), S0MM6.itm_grp_nm.as("itm_grp_nm6"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0MM6).on(S0M1.itm_grp_cd6.eq(S0MM6.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP6.value()).eq(S0MM6.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0MM6.itm_grp_cd.like(bind("itm_grp_cd6"))).cutoff$and(S0MM6.itm_grp_nm.like(bind("itm_grp_nm6")))),
				when(boundOr("itm_grp_flg7"))
					.select(DS0C_ITM_GRP, S0M1.itm_grp_cd7.as("itm_grp_cd7"), S0MM7.itm_grp_nm.as("itm_grp_nm7"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0MM7).on(S0M1.itm_grp_cd7.eq(S0MM7.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP7.value()).eq(S0MM7.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0MM7.itm_grp_cd.like(bind("itm_grp_cd7"))).cutoff$and(S0MM7.itm_grp_nm.like(bind("itm_grp_nm7")))),
				when(boundOr("itm_grp_flg8"))
					.select(DS0C_ITM_GRP, S0M1.itm_grp_cd8.as("itm_grp_cd8"), S0MM8.itm_grp_nm.as("itm_grp_nm8"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0MM8).on(S0M1.itm_grp_cd8.eq(S0MM8.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP8.value()).eq(S0MM8.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0MM8.itm_grp_cd.like(bind("itm_grp_cd8"))).cutoff$and(S0MM8.itm_grp_nm.like(bind("itm_grp_nm8")))),
				when(boundOr("itm_grp_flg9"))
					.select(DS0C_ITM_GRP, S0M1.itm_grp_cd9.as("itm_grp_cd9"), S0MM9.itm_grp_nm.as("itm_grp_nm9"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0MM9).on(S0M1.itm_grp_cd9.eq(S0MM9.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP9.value()).eq(S0MM9.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0MM9.itm_grp_cd.like(bind("itm_grp_cd9"))).cutoff$and(S0MM9.itm_grp_nm.like(bind("itm_grp_nm9")))),
				when(boundOr("itm_grp_flg10"))
					.select(DS0C_ITM_GRP, S0M1.itm_grp_cd10.as("itm_grp_cd10"), S0MM10.itm_grp_nm.as("itm_grp_nm10"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0MM10).on(S0M1.itm_grp_cd10.eq(S0MM10.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP10.value()).eq(S0MM10.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0MM10.itm_grp_cd.like(bind("itm_grp_cd10"))).cutoff$and(S0MM10.itm_grp_nm.like(bind("itm_grp_nm10"))))
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
						.add(MAVM_ITM_UNIT_R.class, r -> toCondition(
							r.getStringNE("itm_cd"),
							r.getStringNE("itm_sub1"),
							r.getStringNE("itm_sub2"),
							r.getStringNE("itm_sub3"),
							r.getStringNE("pack_unit_cd")
						))
						.addSelect(m -> toArray(
							m.dec_place
						))
						.addMap((r, m) -> {
							r.setNumberNE("pack_unit_dec_place", m.dec_place());
					}),
					j -> j
						.add(MAM_UNIT_R.class, r -> toCondition(
							r.getStringNE("cont_fctr_unit_cd")
						))
						.addSelect(m -> toArray(
							m.unit_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("cont_fctr_unit_nm", m.unit_nm());
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
						.add(MAM_CUR_R.class, r -> toCondition(
							r.getStringNE("base_cur_cd")
						))
						.addSelect(m -> toArray(
							m.cur_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("base_cur_nm", m.cur_nm());
					})
				)
			);
	}
	
	/**
	 * -- MSBEL0010_MSW_ALLOC_ITM_Query_I01
	 */
	static MCQueryPlan MSBEL0010_MSW_ALLOC_ITM_I01() {
		MSW_ALLOC_ITM_R S0 = MSW_ALLOC_ITM_R.create();
		MSVT_AVL_STK_R S1_T1 = MSVT_AVL_STK_R.create("T1");
		MSVT_WRK_SNO_R S1_T5 = MSVT_WRK_SNO_R.create("T5");
		MAM_ITM_R S1_M1 = MAM_ITM_R.create("M1");
		MAM_ITM_TYP_D_R S1_M2 = MAM_ITM_TYP_D_R.create("M2");
		MAM_LOC_R S1_M3 = MAM_LOC_R.create("M3");
		MAM_SITE_R S1_M4 = MAM_SITE_R.create("M4");
		MAM_WG_R S1_M5 = MAM_WG_R.create("M5");
		MAM_LG_GRP_R S1_M6 = MAM_LG_GRP_R.create("M6");
		MAM_ALLOC_GRP_R S1_M7 = MAM_ALLOC_GRP_R.create("M7");
		MAM_LOC_GRP_R S1_M8 = MAM_LOC_GRP_R.create("M8");
		MAM_STK_GD_R S1_M11 = MAM_STK_GD_R.create("M11");
		MAM_BP_R S1_M12 = MAM_BP_R.create("M12");
		MAM_DPT_R S1_M18 = MAM_DPT_R.create("M18");
		MAM_SUNDRY_ITM_R S1_M19 = MAM_SUNDRY_ITM_R.create("M19");
		MAM_LOC_SUB_R S1_M20 = MAM_LOC_SUB_R.create("M20");
		MAVM_RD_LOC_R S1_M99 = MAVM_RD_LOC_R.create("M99");
		MSVT_AVL_IO_SCHD_R S2_T1 = MSVT_AVL_IO_SCHD_R.create("T1");
		MAM_ITM_R S2_M1 = MAM_ITM_R.create("M1");
		MAM_ITM_TYP_D_R S2_M2 = MAM_ITM_TYP_D_R.create("M2");
		MAM_LOC_R S2_M3 = MAM_LOC_R.create("M3");
		MAM_SITE_R S2_M4 = MAM_SITE_R.create("M4");
		MAM_WG_R S2_M5 = MAM_WG_R.create("M5");
		MAM_LG_GRP_R S2_M6 = MAM_LG_GRP_R.create("M6");
		MAM_ALLOC_GRP_R S2_M7 = MAM_ALLOC_GRP_R.create("M7");
		MAM_LOC_GRP_R S2_M8 = MAM_LOC_GRP_R.create("M8");
		MAM_STK_GD_R S2_M11 = MAM_STK_GD_R.create("M11");
		MAM_BP_R S2_M12 = MAM_BP_R.create("M12");
		MAM_DPT_R S2_M18 = MAM_DPT_R.create("M18");
		MSVT_WRK_SNO_R S2_T5 = MSVT_WRK_SNO_R.create("T5");
		MAM_SUNDRY_ITM_R S2_M19 = MAM_SUNDRY_ITM_R.create("M19");
		MAM_LOC_SUB_R S2_M20 = MAM_LOC_SUB_R.create("M20");
		MAVM_RD_LOC_R S2_M99 = MAVM_RD_LOC_R.create("M99");
		MAM_ITM_GRP_R S1MM1 = MAM_ITM_GRP_R.create("MM1");
		MAM_ITM_GRP_R S1MM2 = MAM_ITM_GRP_R.create("MM2");
		MAM_ITM_GRP_R S1MM3 = MAM_ITM_GRP_R.create("MM3");
		MAM_ITM_GRP_R S1MM4 = MAM_ITM_GRP_R.create("MM4");
		MAM_ITM_GRP_R S1MM5 = MAM_ITM_GRP_R.create("MM5");
		MAM_ITM_GRP_R S1MM6 = MAM_ITM_GRP_R.create("MM6");
		MAM_ITM_GRP_R S1MM7 = MAM_ITM_GRP_R.create("MM7");
		MAM_ITM_GRP_R S1MM8 = MAM_ITM_GRP_R.create("MM8");
		MAM_ITM_GRP_R S1MM9 = MAM_ITM_GRP_R.create("MM9");
		MAM_ITM_GRP_R S1MM10 = MAM_ITM_GRP_R.create("MM10");
		MAM_ITM_GRP_R S2MM1 = MAM_ITM_GRP_R.create("MM1");
		MAM_ITM_GRP_R S2MM2 = MAM_ITM_GRP_R.create("MM2");
		MAM_ITM_GRP_R S2MM3 = MAM_ITM_GRP_R.create("MM3");
		MAM_ITM_GRP_R S2MM4 = MAM_ITM_GRP_R.create("MM4");
		MAM_ITM_GRP_R S2MM5 = MAM_ITM_GRP_R.create("MM5");
		MAM_ITM_GRP_R S2MM6 = MAM_ITM_GRP_R.create("MM6");
		MAM_ITM_GRP_R S2MM7 = MAM_ITM_GRP_R.create("MM7");
		MAM_ITM_GRP_R S2MM8 = MAM_ITM_GRP_R.create("MM8");
		MAM_ITM_GRP_R S2MM9 = MAM_ITM_GRP_R.create("MM9");
		MAM_ITM_GRP_R S2MM10 = MAM_ITM_GRP_R.create("MM10");
		
		MCDynamicSQLID DS0C_ITM_GRP = createDynamicSQLID("DS0C_ITM_GRP");
		MCDynamicSQLID DS1C_ITM_GRP = createDynamicSQLID("DS1C_ITM_GRP");
		
		return createQueryPlan()
			.setQuery(
				sql("MSBEL0010_MSW_ALLOC_ITM_Query_I01")
					.insert(S0)
					.columns(
						S0.itm_cd,
						S0.itm_sub1,
						S0.itm_sub2,
						S0.itm_sub3,
						S0.sno1,
						S0.sno2,
						S0.sno3,
						S0.sno4,
						S0.gd_cd,
						S0.in_xfr_typ,
						S0.quality_typ,
						S0.stk_insp_typ,
						S0.stk_id_typ,
						S0.stk_bp_cd
					)
					.query(
						subQuery()
						.select(
							S1_T1.itm_cd,
							S1_T1.itm_sub1,
							S1_T1.itm_sub2,
							S1_T1.itm_sub3,
							S1_T1.sno1,
							S1_T1.sno2,
							S1_T1.sno3,
							S1_T1.sno4,
							S1_T1.gd_cd,
							S1_T1.in_xfr_typ,
							S1_T1.quality_typ,
							S1_T1.stk_insp_typ,
							S1_T1.stk_id_typ,
							S1_T1.stk_bp_cd
						)
						.from(
							S1_T1
							.leftOuterJoin(S1_T5).on(S1_T1.sno1.eq(S1_T5.sno1))
							.leftOuterJoin(S1_M1).on(
								S1_T1.itm_cd.eq(S1_M1.itm_cd)
								.and(S1_T1.itm_sub1.eq(S1_M1.itm_sub1))
								.and(S1_T1.itm_sub2.eq(S1_M1.itm_sub2))
								.and(S1_T1.itm_sub3.eq(S1_M1.itm_sub3))
							)
							.leftOuterJoin(S1_M2).on(
								S1_M1.itm_typ.eq(S1_M2.itm_typ)
								.and(S1_M1.itm_typ_d_cd.eq(S1_M2.itm_typ_d_cd))
							)
							.leftOuterJoin(S1_M3).on(S1_T1.loc_cd.eq(S1_M3.loc_cd))
							.leftOuterJoin(S1_M4).on(S1_M3.site_cd.eq(S1_M4.site_cd))
							.leftOuterJoin(S1_M5).on(S1_M3.wg_cd.eq(S1_M5.wg_cd))
							.leftOuterJoin(S1_M6).on(S1_M3.lg_grp_cd.eq(S1_M6.lg_grp_cd))
							.leftOuterJoin(S1_M7).on(S1_M3.alloc_grp_cd.eq(S1_M7.alloc_grp_cd))
							.leftOuterJoin(S1_M8).on(S1_M3.loc_grp_cd.eq(S1_M8.loc_grp_cd))
							.leftOuterJoin(S1_M11).on(S1_T1.gd_cd.eq(S1_M11.gd_cd))
							.leftOuterJoin(S1_M12).on(S1_T1.stk_bp_cd.eq(S1_M12.bp_cd))
							.leftOuterJoin(S1_M20).on(
									S1_T1.loc_cd.eq(S1_M20.loc_cd)
									.and(bind("base_dt").gte(S1_M20.st_dt))
									.and(bind("base_dt").lte(S1_M20.end_dt))
								)
							.leftOuterJoin(S1_M18).on(
								coalesce(
									S1_M20.asst_dpt_cd,
									S1_M3.asst_dpt_cd
								).eq(S1_M18.dpt_cd)
								.and(bind("base_dt").between(S1_M18.st_dt, S1_M18.end_dt))
							)
							.leftOuterJoin(S1_M19).on(
								S1_T1.itm_cd.eq(S1_M19.itm_cd)
								.and(S1_T1.itm_sub1.eq(S1_M19.itm_sub1))
								.and(S1_T1.itm_sub2.eq(S1_M19.itm_sub2))
								.and(S1_T1.itm_sub3.eq(S1_M19.itm_sub3))
								.and(S1_T1.sno1.eq(S1_M19.sno1))
								.and(S1_T1.sno2.eq(S1_M19.sno2))
								.and(S1_T1.sno3.eq(S1_M19.sno3))
								.and(S1_T1.sno4.eq(S1_M19.sno4))
							)
							.innerJoin(S1_M99).on(S1_T1.loc_cd.eq(S1_M99.loc_cd))
							.addDynamicView(DS0C_ITM_GRP)
						)
						.where(
							value(0).eq(value(0))
							.cutoff$and(S1_T1.loc_cd.like(bind("loc_cd")))
							.cutoff$and(S1_M3.loc_nm.like(bind("loc_nm")))
							.cutoff$and(S1_M3.site_cd.like(bind("site_cd")))
							.cutoff$and(S1_M4.site_nm.like(bind("site_nm")))
							.cutoff$and(S1_M3.wg_cd.like(bind("wg_cd")))
							.cutoff$and(S1_M5.wg_nm.like(bind("wg_nm")))
							.cutoff$and(S1_M3.lg_grp_cd.like(bind("lg_grp_cd")))
							.cutoff$and(S1_M6.lg_grp_nm.like(bind("lg_grp_nm")))
							.cutoff$and(S1_M3.alloc_grp_cd.like(bind("alloc_grp_cd")))
							.cutoff$and(S1_M7.alloc_grp_nm.like(bind("alloc_grp_nm")))
							.cutoff$and(S1_M3.loc_grp_cd.like(bind("loc_grp_cd")))
							.cutoff$and(S1_M8.loc_grp_nm.like(bind("loc_grp_nm")))
							.cutoff$and(
								coalesce(
									S1_M20.asst_dpt_cd,
									S1_M3.asst_dpt_cd
								).like(bind("dpt_cd"))
							)
							.cutoff$and(S1_M18.dpt_nm.like(bind("dpt_nm")))
							.cutoff$and(S1_M1.itm_typ.like(bind("itm_typ")))
							.cutoff$and(S1_M1.itm_typ_d_cd.like(bind("itm_typ_d_cd")))
							.cutoff$and(S1_M2.itm_typ_d_nm.like(bind("itm_typ_d_nm")))
							.cutoff$and(S1_T1.itm_cd.like(bind("itm_cd")))
							.cutoff$and(S1_T1.itm_sub1.like(bind("itm_sub1")))
							.cutoff$and(S1_T1.itm_sub2.like(bind("itm_sub2")))
							.cutoff$and(S1_T1.itm_sub3.like(bind("itm_sub3")))
							.cutoff$and(
								coalesce(
									S1_M19.itm_nm,
									S1_M1.itm_nm
								).like(bind("itm_nm"))
							)
							.cutoff$and(S1_T1.lot_no.like(bind("lot_no")))
							.cutoff$and(S1_T1.sublot_no.like(bind("sublot_no")))
							.cutoff$and(S1_T1.sno1.like(bind("sno1")))
							.cutoff$and(S1_T1.sno2.like(bind("sno2")))
							.cutoff$and(S1_T1.sno3.like(bind("sno3")))
							.cutoff$and(S1_T1.sno4.like(bind("sno4")))
							.cutoff$and(S1_T5.wrk_no.like(bind("wrk_no")))
							.cutoff$and(S1_T5.wrk_nm.like(bind("wrk_nm")))
							.cutoff$and(S1_T1.asst_typ.like(bind("asst_typ")))
							.cutoff$and(S1_T1.stk_id_typ.like(bind("stk_id_typ")))
							.cutoff$and(S1_T1.stk_bp_cd.like(bind("stk_bp_cd")))
							.cutoff$and(S1_M12.bp_nm.like(bind("stk_bp_nm")))
							.cutoff$and(S1_T1.quality_typ.like(bind("quality_typ")))
							.cutoff$and(S1_T1.gd_cd.like(bind("gd_cd")))
							.cutoff$and(S1_M11.gd_nm.like(bind("gd_nm")))
							.cutoff$and(S1_T1.sub_char1.like(bind("stk_sub_char1")))
							.cutoff$and(S1_T1.sub_char2.like(bind("stk_sub_char2")))
							.cutoff$and(S1_T1.sub_char3.like(bind("stk_sub_char3")))
							.addDynamicPredicate(DS0C_ITM_GRP)
						)
						.union(
							subQuery()
							.select(
								S2_T1.itm_cd,
								S2_T1.itm_sub1,
								S2_T1.itm_sub2,
								S2_T1.itm_sub3,
								S2_T1.sno1,
								S2_T1.sno2,
								S2_T1.sno3,
								S2_T1.sno4,
								S2_T1.gd_cd,
								S2_T1.in_xfr_typ,
								S2_T1.quality_typ,
								S2_T1.stk_insp_typ,
								S2_T1.stk_id_typ,
								S2_T1.stk_bp_cd
							)
							.from(
								S2_T1
								.leftOuterJoin(S2_M1).on(
									S2_T1.itm_cd.eq(S2_M1.itm_cd)
									.and(S2_T1.itm_sub1.eq(S2_M1.itm_sub1))
									.and(S2_T1.itm_sub2.eq(S2_M1.itm_sub2))
									.and(S2_T1.itm_sub3.eq(S2_M1.itm_sub3))
								)
								.leftOuterJoin(S2_M2).on(
									S2_M1.itm_typ.eq(S2_M2.itm_typ)
									.and(S2_M1.itm_typ_d_cd.eq(S2_M2.itm_typ_d_cd))
								)
								.leftOuterJoin(S2_M3).on(S2_T1.loc_cd.eq(S2_M3.loc_cd))
								.leftOuterJoin(S2_M4).on(S2_M3.site_cd.eq(S2_M4.site_cd))
								.leftOuterJoin(S2_M5).on(S2_M3.wg_cd.eq(S2_M5.wg_cd))
								.leftOuterJoin(S2_M6).on(S2_M3.lg_grp_cd.eq(S2_M6.lg_grp_cd))
								.leftOuterJoin(S2_M7).on(S2_M3.alloc_grp_cd.eq(S2_M7.alloc_grp_cd))
								.leftOuterJoin(S2_M8).on(S2_M3.loc_grp_cd.eq(S2_M8.loc_grp_cd))
								.leftOuterJoin(S2_M11).on(S2_T1.gd_cd.eq(S2_M11.gd_cd))
								.leftOuterJoin(S2_M12).on(S2_T1.stk_bp_cd.eq(S2_M12.bp_cd))
								.leftOuterJoin(S2_M20).on(
										S2_T1.loc_cd.eq(S2_M20.loc_cd)
										.and(bind("base_dt").gte(S2_M20.st_dt))
										.and(bind("base_dt").lte(S2_M20.end_dt))
									)
								.leftOuterJoin(S2_M18).on(
									coalesce(
										S2_M20.asst_dpt_cd,
										S2_M3.asst_dpt_cd
									).eq(S2_M18.dpt_cd)
									.and(bind("base_dt").between(S2_M18.st_dt, S2_M18.end_dt))
								)
								.leftOuterJoin(S2_T5).on(S2_T1.sno1.eq(S2_T5.sno1))
								.leftOuterJoin(S2_M19).on(
									S2_T1.itm_cd.eq(S2_M19.itm_cd)
									.and(S2_T1.itm_sub1.eq(S2_M19.itm_sub1))
									.and(S2_T1.itm_sub2.eq(S2_M19.itm_sub2))
									.and(S2_T1.itm_sub3.eq(S2_M19.itm_sub3))
									.and(S2_T1.sno1.eq(S2_M19.sno1))
									.and(S2_T1.sno2.eq(S2_M19.sno2))
									.and(S2_T1.sno3.eq(S2_M19.sno3))
									.and(S2_T1.sno4.eq(S2_M19.sno4))
								)
								.innerJoin(S2_M99).on(S2_T1.loc_cd.eq(S2_M99.loc_cd))
								.addDynamicView(DS1C_ITM_GRP)
							)
							.where(
								value(0).eq(value(0))
								.cutoff$and(S2_T1.loc_cd.like(bind("loc_cd")))
								.cutoff$and(S2_M3.loc_nm.like(bind("loc_nm")))
								.cutoff$and(S2_M3.site_cd.like(bind("site_cd")))
								.cutoff$and(S2_M4.site_nm.like(bind("site_nm")))
								.cutoff$and(S2_M3.wg_cd.like(bind("wg_cd")))
								.cutoff$and(S2_M5.wg_nm.like(bind("wg_nm")))
								.cutoff$and(S2_M3.lg_grp_cd.like(bind("lg_grp_cd")))
								.cutoff$and(S2_M6.lg_grp_nm.like(bind("lg_grp_nm")))
								.cutoff$and(S2_M3.alloc_grp_cd.like(bind("alloc_grp_cd")))
								.cutoff$and(S2_M7.alloc_grp_nm.like(bind("alloc_grp_nm")))
								.cutoff$and(S2_M3.loc_grp_cd.like(bind("loc_grp_cd")))
								.cutoff$and(S2_M8.loc_grp_nm.like(bind("loc_grp_nm")))
								.cutoff$and(
									coalesce(
										S2_M20.asst_dpt_cd,
										S2_M3.asst_dpt_cd
									).like(bind("dpt_cd"))
								)
								.cutoff$and(S2_M18.dpt_nm.like(bind("dpt_nm")))
								.cutoff$and(S2_M1.itm_typ.like(bind("itm_typ")))
								.cutoff$and(S2_M1.itm_typ_d_cd.like(bind("itm_typ_d_cd")))
								.cutoff$and(S2_M2.itm_typ_d_nm.like(bind("itm_typ_d_nm")))
								.cutoff$and(S2_T1.itm_cd.like(bind("itm_cd")))
								.cutoff$and(S2_T1.itm_sub1.like(bind("itm_sub1")))
								.cutoff$and(S2_T1.itm_sub2.like(bind("itm_sub2")))
								.cutoff$and(S2_T1.itm_sub3.like(bind("itm_sub3")))
								.cutoff$and(
									coalesce(
										S2_M19.itm_nm,
										S2_M1.itm_nm
									).like(bind("itm_nm"))
								)
								.cutoff$and(S2_T1.lot_no.like(bind("lot_no")))
								.cutoff$and(S2_T1.sublot_no.like(bind("sublot_no")))
								.cutoff$and(S2_T1.sno1.like(bind("sno1")))
								.cutoff$and(S2_T1.sno2.like(bind("sno2")))
								.cutoff$and(S2_T1.sno3.like(bind("sno3")))
								.cutoff$and(S2_T1.sno4.like(bind("sno4")))
								.cutoff$and(S2_T5.wrk_no.like(bind("wrk_no")))
								.cutoff$and(S2_T5.wrk_nm.like(bind("wrk_nm")))
								.cutoff$and(S2_T1.asst_typ.like(bind("asst_typ")))
								.cutoff$and(S2_T1.stk_id_typ.like(bind("stk_id_typ")))
								.cutoff$and(S2_T1.stk_bp_cd.like(bind("stk_bp_cd")))
								.cutoff$and(S2_M12.bp_nm.like(bind("stk_bp_nm")))
								.cutoff$and(S2_T1.quality_typ.like(bind("quality_typ")))
								.cutoff$and(S2_T1.gd_cd.like(bind("gd_cd")))
								.cutoff$and(S2_M11.gd_nm.like(bind("gd_nm")))
								.cutoff$and(S2_T1.sub_char1.like(bind("stk_sub_char1")))
								.cutoff$and(S2_T1.sub_char2.like(bind("stk_sub_char2")))
								.cutoff$and(S2_T1.sub_char3.like(bind("stk_sub_char3")))
								.addDynamicPredicate(DS1C_ITM_GRP)
							)
						)
					)
			)
			.setDynamicSQLInfo(
				when(boundOr("itm_grp_flg1"))
					.select(DS0C_ITM_GRP, S1_M1.itm_grp_cd1.as("itm_grp_cd1"), S1MM1.itm_grp_nm.as("itm_grp_nm1"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S1MM1).on(S1_M1.itm_grp_cd1.eq(S1MM1.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP1.value()).eq(S1MM1.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S1MM1.itm_grp_cd.like(bind("itm_grp_cd1"))).cutoff$and(S1MM1.itm_grp_nm.like(bind("itm_grp_nm1")))),
				when(boundOr("itm_grp_flg2"))
					.select(DS0C_ITM_GRP, S1_M1.itm_grp_cd2.as("itm_grp_cd2"), S1MM2.itm_grp_nm.as("itm_grp_nm2"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S1MM2).on(S1_M1.itm_grp_cd2.eq(S1MM2.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP2.value()).eq(S1MM2.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S1MM2.itm_grp_cd.like(bind("itm_grp_cd2"))).cutoff$and(S1MM2.itm_grp_nm.like(bind("itm_grp_nm2")))),
				when(boundOr("itm_grp_flg3"))
					.select(DS0C_ITM_GRP, S1_M1.itm_grp_cd3.as("itm_grp_cd3"), S1MM3.itm_grp_nm.as("itm_grp_nm3"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S1MM3).on(S1_M1.itm_grp_cd3.eq(S1MM3.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP3.value()).eq(S1MM3.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S1MM3.itm_grp_cd.like(bind("itm_grp_cd3"))).cutoff$and(S1MM3.itm_grp_nm.like(bind("itm_grp_nm3")))),
				when(boundOr("itm_grp_flg4"))
					.select(DS0C_ITM_GRP, S1_M1.itm_grp_cd4.as("itm_grp_cd4"), S1MM4.itm_grp_nm.as("itm_grp_nm4"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S1MM4).on(S1_M1.itm_grp_cd4.eq(S1MM4.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP4.value()).eq(S1MM4.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S1MM4.itm_grp_cd.like(bind("itm_grp_cd4"))).cutoff$and(S1MM4.itm_grp_nm.like(bind("itm_grp_nm4")))),
				when(boundOr("itm_grp_flg5"))
					.select(DS0C_ITM_GRP, S1_M1.itm_grp_cd5.as("itm_grp_cd5"), S1MM5.itm_grp_nm.as("itm_grp_nm5"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S1MM5).on(S1_M1.itm_grp_cd5.eq(S1MM5.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP5.value()).eq(S1MM5.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S1MM5.itm_grp_cd.like(bind("itm_grp_cd5"))).cutoff$and(S1MM5.itm_grp_nm.like(bind("itm_grp_nm5")))),
				when(boundOr("itm_grp_flg6"))
					.select(DS0C_ITM_GRP, S1_M1.itm_grp_cd6.as("itm_grp_cd6"), S1MM6.itm_grp_nm.as("itm_grp_nm6"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S1MM6).on(S1_M1.itm_grp_cd6.eq(S1MM6.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP6.value()).eq(S1MM6.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S1MM6.itm_grp_cd.like(bind("itm_grp_cd6"))).cutoff$and(S1MM6.itm_grp_nm.like(bind("itm_grp_nm6")))),
				when(boundOr("itm_grp_flg7"))
					.select(DS0C_ITM_GRP, S1_M1.itm_grp_cd7.as("itm_grp_cd7"), S1MM7.itm_grp_nm.as("itm_grp_nm7"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S1MM7).on(S1_M1.itm_grp_cd7.eq(S1MM7.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP7.value()).eq(S1MM7.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S1MM7.itm_grp_cd.like(bind("itm_grp_cd7"))).cutoff$and(S1MM7.itm_grp_nm.like(bind("itm_grp_nm7")))),
				when(boundOr("itm_grp_flg8"))
					.select(DS0C_ITM_GRP, S1_M1.itm_grp_cd8.as("itm_grp_cd8"), S1MM8.itm_grp_nm.as("itm_grp_nm8"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S1MM8).on(S1_M1.itm_grp_cd8.eq(S1MM8.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP8.value()).eq(S1MM8.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S1MM8.itm_grp_cd.like(bind("itm_grp_cd8"))).cutoff$and(S1MM8.itm_grp_nm.like(bind("itm_grp_nm8")))),
				when(boundOr("itm_grp_flg9"))
					.select(DS0C_ITM_GRP, S1_M1.itm_grp_cd9.as("itm_grp_cd9"), S1MM9.itm_grp_nm.as("itm_grp_nm9"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S1MM9).on(S1_M1.itm_grp_cd9.eq(S1MM9.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP9.value()).eq(S1MM9.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S1MM9.itm_grp_cd.like(bind("itm_grp_cd9"))).cutoff$and(S1MM9.itm_grp_nm.like(bind("itm_grp_nm9")))),
				when(boundOr("itm_grp_flg10"))
					.select(DS0C_ITM_GRP, S1_M1.itm_grp_cd10.as("itm_grp_cd10"), S1MM10.itm_grp_nm.as("itm_grp_nm10"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S1MM10).on(S1_M1.itm_grp_cd10.eq(S1MM10.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP10.value()).eq(S1MM10.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S1MM10.itm_grp_cd.like(bind("itm_grp_cd10"))).cutoff$and(S1MM10.itm_grp_nm.like(bind("itm_grp_nm10")))),
				when(boundOr("itm_grp_flg1"))
					.select(DS1C_ITM_GRP, S2_M1.itm_grp_cd1.as("itm_grp_cd1"), S2MM1.itm_grp_nm.as("itm_grp_nm1"))
					.view(DS1C_ITM_GRP, v -> v.leftOuterJoin(S2MM1).on(S2_M1.itm_grp_cd1.eq(S2MM1.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP1.value()).eq(S2MM1.itm_grp_typ))))
					.predicate(DS1C_ITM_GRP, p -> p.cutoff$and(S2MM1.itm_grp_cd.like(bind("itm_grp_cd1"))).cutoff$and(S2MM1.itm_grp_nm.like(bind("itm_grp_nm1")))),
				when(boundOr("itm_grp_flg2"))
					.select(DS1C_ITM_GRP, S2_M1.itm_grp_cd2.as("itm_grp_cd2"), S2MM2.itm_grp_nm.as("itm_grp_nm2"))
					.view(DS1C_ITM_GRP, v -> v.leftOuterJoin(S2MM2).on(S2_M1.itm_grp_cd2.eq(S2MM2.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP2.value()).eq(S2MM2.itm_grp_typ))))
					.predicate(DS1C_ITM_GRP, p -> p.cutoff$and(S2MM2.itm_grp_cd.like(bind("itm_grp_cd2"))).cutoff$and(S2MM2.itm_grp_nm.like(bind("itm_grp_nm2")))),
				when(boundOr("itm_grp_flg3"))
					.select(DS1C_ITM_GRP, S2_M1.itm_grp_cd3.as("itm_grp_cd3"), S2MM3.itm_grp_nm.as("itm_grp_nm3"))
					.view(DS1C_ITM_GRP, v -> v.leftOuterJoin(S2MM3).on(S2_M1.itm_grp_cd3.eq(S2MM3.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP3.value()).eq(S2MM3.itm_grp_typ))))
					.predicate(DS1C_ITM_GRP, p -> p.cutoff$and(S2MM3.itm_grp_cd.like(bind("itm_grp_cd3"))).cutoff$and(S2MM3.itm_grp_nm.like(bind("itm_grp_nm3")))),
				when(boundOr("itm_grp_flg4"))
					.select(DS1C_ITM_GRP, S2_M1.itm_grp_cd4.as("itm_grp_cd4"), S2MM4.itm_grp_nm.as("itm_grp_nm4"))
					.view(DS1C_ITM_GRP, v -> v.leftOuterJoin(S2MM4).on(S2_M1.itm_grp_cd4.eq(S2MM4.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP4.value()).eq(S2MM4.itm_grp_typ))))
					.predicate(DS1C_ITM_GRP, p -> p.cutoff$and(S2MM4.itm_grp_cd.like(bind("itm_grp_cd4"))).cutoff$and(S2MM4.itm_grp_nm.like(bind("itm_grp_nm4")))),
				when(boundOr("itm_grp_flg5"))
					.select(DS1C_ITM_GRP, S2_M1.itm_grp_cd5.as("itm_grp_cd5"), S2MM5.itm_grp_nm.as("itm_grp_nm5"))
					.view(DS1C_ITM_GRP, v -> v.leftOuterJoin(S2MM5).on(S2_M1.itm_grp_cd5.eq(S2MM5.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP5.value()).eq(S2MM5.itm_grp_typ))))
					.predicate(DS1C_ITM_GRP, p -> p.cutoff$and(S2MM5.itm_grp_cd.like(bind("itm_grp_cd5"))).cutoff$and(S2MM5.itm_grp_nm.like(bind("itm_grp_nm5")))),
				when(boundOr("itm_grp_flg6"))
					.select(DS1C_ITM_GRP, S2_M1.itm_grp_cd6.as("itm_grp_cd6"), S2MM6.itm_grp_nm.as("itm_grp_nm6"))
					.view(DS1C_ITM_GRP, v -> v.leftOuterJoin(S2MM6).on(S2_M1.itm_grp_cd6.eq(S2MM6.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP6.value()).eq(S2MM6.itm_grp_typ))))
					.predicate(DS1C_ITM_GRP, p -> p.cutoff$and(S2MM6.itm_grp_cd.like(bind("itm_grp_cd6"))).cutoff$and(S2MM6.itm_grp_nm.like(bind("itm_grp_nm6")))),
				when(boundOr("itm_grp_flg7"))
					.select(DS1C_ITM_GRP, S2_M1.itm_grp_cd7.as("itm_grp_cd7"), S2MM7.itm_grp_nm.as("itm_grp_nm7"))
					.view(DS1C_ITM_GRP, v -> v.leftOuterJoin(S2MM7).on(S2_M1.itm_grp_cd7.eq(S2MM7.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP7.value()).eq(S2MM7.itm_grp_typ))))
					.predicate(DS1C_ITM_GRP, p -> p.cutoff$and(S2MM7.itm_grp_cd.like(bind("itm_grp_cd7"))).cutoff$and(S2MM7.itm_grp_nm.like(bind("itm_grp_nm7")))),
				when(boundOr("itm_grp_flg8"))
					.select(DS1C_ITM_GRP, S2_M1.itm_grp_cd8.as("itm_grp_cd8"), S2MM8.itm_grp_nm.as("itm_grp_nm8"))
					.view(DS1C_ITM_GRP, v -> v.leftOuterJoin(S2MM8).on(S2_M1.itm_grp_cd8.eq(S2MM8.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP8.value()).eq(S2MM8.itm_grp_typ))))
					.predicate(DS1C_ITM_GRP, p -> p.cutoff$and(S2MM8.itm_grp_cd.like(bind("itm_grp_cd8"))).cutoff$and(S2MM8.itm_grp_nm.like(bind("itm_grp_nm8")))),
				when(boundOr("itm_grp_flg9"))
					.select(DS1C_ITM_GRP, S2_M1.itm_grp_cd9.as("itm_grp_cd9"), S2MM9.itm_grp_nm.as("itm_grp_nm9"))
					.view(DS1C_ITM_GRP, v -> v.leftOuterJoin(S2MM9).on(S2_M1.itm_grp_cd9.eq(S2MM9.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP9.value()).eq(S2MM9.itm_grp_typ))))
					.predicate(DS1C_ITM_GRP, p -> p.cutoff$and(S2MM9.itm_grp_cd.like(bind("itm_grp_cd9"))).cutoff$and(S2MM9.itm_grp_nm.like(bind("itm_grp_nm9")))),
				when(boundOr("itm_grp_flg10"))
					.select(DS1C_ITM_GRP, S2_M1.itm_grp_cd10.as("itm_grp_cd10"), S2MM10.itm_grp_nm.as("itm_grp_nm10"))
					.view(DS1C_ITM_GRP, v -> v.leftOuterJoin(S2MM10).on(S2_M1.itm_grp_cd10.eq(S2MM10.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP10.value()).eq(S2MM10.itm_grp_typ))))
					.predicate(DS1C_ITM_GRP, p -> p.cutoff$and(S2MM10.itm_grp_cd.like(bind("itm_grp_cd10"))).cutoff$and(S2MM10.itm_grp_nm.like(bind("itm_grp_nm10"))))
			);
	}
	
	/**
	 * -- MSBEL0010_MSW_ALLOC_LOCK_KEY_Query_I01
	 */
	static MCQueryPlan MSBEL0010_MSW_ALLOC_LOCK_KEY_I01() {
		MSW_ALLOC_LOCK_KEY_R S0 = MSW_ALLOC_LOCK_KEY_R.create();
		MSVT_AVL_STK_R S1_T1 = MSVT_AVL_STK_R.create("T1");
		MSVT_WRK_SNO_R S1_T5 = MSVT_WRK_SNO_R.create("T5");
		MAM_ITM_R S1_M1 = MAM_ITM_R.create("M1");
		MAM_ITM_TYP_D_R S1_M2 = MAM_ITM_TYP_D_R.create("M2");
		MAM_LOC_R S1_M3 = MAM_LOC_R.create("M3");
		MAM_SITE_R S1_M4 = MAM_SITE_R.create("M4");
		MAM_WG_R S1_M5 = MAM_WG_R.create("M5");
		MAM_LG_GRP_R S1_M6 = MAM_LG_GRP_R.create("M6");
		MAM_ALLOC_GRP_R S1_M7 = MAM_ALLOC_GRP_R.create("M7");
		MAM_LOC_GRP_R S1_M8 = MAM_LOC_GRP_R.create("M8");
		MAM_STK_GD_R S1_M11 = MAM_STK_GD_R.create("M11");
		MAM_BP_R S1_M12 = MAM_BP_R.create("M12");
		MAM_DPT_R S1_M18 = MAM_DPT_R.create("M18");
		MAM_SUNDRY_ITM_R S1_M19 = MAM_SUNDRY_ITM_R.create("M19");
		MAM_LOC_SUB_R S1_M20 = MAM_LOC_SUB_R.create("M20");
		MAVM_RD_LOC_R S1_M99 = MAVM_RD_LOC_R.create("M99");
		MSVT_AVL_IO_SCHD_R S2_T1 = MSVT_AVL_IO_SCHD_R.create("T1");
		MSVT_WRK_SNO_R S2_T5 = MSVT_WRK_SNO_R.create("T5");
		MAM_ITM_R S2_M1 = MAM_ITM_R.create("M1");
		MAM_ITM_TYP_D_R S2_M2 = MAM_ITM_TYP_D_R.create("M2");
		MAM_LOC_R S2_M3 = MAM_LOC_R.create("M3");
		MAM_SITE_R S2_M4 = MAM_SITE_R.create("M4");
		MAM_WG_R S2_M5 = MAM_WG_R.create("M5");
		MAM_LG_GRP_R S2_M6 = MAM_LG_GRP_R.create("M6");
		MAM_ALLOC_GRP_R S2_M7 = MAM_ALLOC_GRP_R.create("M7");
		MAM_LOC_GRP_R S2_M8 = MAM_LOC_GRP_R.create("M8");
		MAM_STK_GD_R S2_M11 = MAM_STK_GD_R.create("M11");
		MAM_BP_R S2_M12 = MAM_BP_R.create("M12");
		MAM_DPT_R S2_M18 = MAM_DPT_R.create("M18");
		MAM_SUNDRY_ITM_R S2_M19 = MAM_SUNDRY_ITM_R.create("M19");
		MAM_LOC_SUB_R S2_M20 = MAM_LOC_SUB_R.create("M20");
		MAVM_RD_LOC_R S2_M99 = MAVM_RD_LOC_R.create("M99");
		MAM_ITM_GRP_R S1MM1 = MAM_ITM_GRP_R.create("MM1");
		MAM_ITM_GRP_R S1MM2 = MAM_ITM_GRP_R.create("MM2");
		MAM_ITM_GRP_R S1MM3 = MAM_ITM_GRP_R.create("MM3");
		MAM_ITM_GRP_R S1MM4 = MAM_ITM_GRP_R.create("MM4");
		MAM_ITM_GRP_R S1MM5 = MAM_ITM_GRP_R.create("MM5");
		MAM_ITM_GRP_R S1MM6 = MAM_ITM_GRP_R.create("MM6");
		MAM_ITM_GRP_R S1MM7 = MAM_ITM_GRP_R.create("MM7");
		MAM_ITM_GRP_R S1MM8 = MAM_ITM_GRP_R.create("MM8");
		MAM_ITM_GRP_R S1MM9 = MAM_ITM_GRP_R.create("MM9");
		MAM_ITM_GRP_R S1MM10 = MAM_ITM_GRP_R.create("MM10");
		MAM_ITM_GRP_R S2MM1 = MAM_ITM_GRP_R.create("MM1");
		MAM_ITM_GRP_R S2MM2 = MAM_ITM_GRP_R.create("MM2");
		MAM_ITM_GRP_R S2MM3 = MAM_ITM_GRP_R.create("MM3");
		MAM_ITM_GRP_R S2MM4 = MAM_ITM_GRP_R.create("MM4");
		MAM_ITM_GRP_R S2MM5 = MAM_ITM_GRP_R.create("MM5");
		MAM_ITM_GRP_R S2MM6 = MAM_ITM_GRP_R.create("MM6");
		MAM_ITM_GRP_R S2MM7 = MAM_ITM_GRP_R.create("MM7");
		MAM_ITM_GRP_R S2MM8 = MAM_ITM_GRP_R.create("MM8");
		MAM_ITM_GRP_R S2MM9 = MAM_ITM_GRP_R.create("MM9");
		MAM_ITM_GRP_R S2MM10 = MAM_ITM_GRP_R.create("MM10");
		
		MCDynamicSQLID DS0C_ITM_GRP = createDynamicSQLID("DS0C_ITM_GRP");
		MCDynamicSQLID DS1C_ITM_GRP = createDynamicSQLID("DS1C_ITM_GRP");
		
		return createQueryPlan()
			.setQuery(
				sql("MSBEL0010_MSW_ALLOC_LOCK_KEY_Query_I01")
					.insert(S0)
					.columns(
						S0.itm_cd,
						S0.itm_sub1,
						S0.itm_sub2,
						S0.itm_sub3,
						S0.loc_cd
					)
					.query(
						subQuery()
						.select(
							S1_T1.itm_cd,
							S1_T1.itm_sub1,
							S1_T1.itm_sub2,
							S1_T1.itm_sub3,
							S1_T1.loc_cd
						)
						.from(
							S1_T1
							.leftOuterJoin(S1_T5).on(S1_T1.sno1.eq(S1_T5.sno1))
							.leftOuterJoin(S1_M1).on(
								S1_T1.itm_cd.eq(S1_M1.itm_cd)
								.and(S1_T1.itm_sub1.eq(S1_M1.itm_sub1))
								.and(S1_T1.itm_sub2.eq(S1_M1.itm_sub2))
								.and(S1_T1.itm_sub3.eq(S1_M1.itm_sub3))
							)
							.leftOuterJoin(S1_M2).on(
								S1_M1.itm_typ.eq(S1_M2.itm_typ)
								.and(S1_M1.itm_typ_d_cd.eq(S1_M2.itm_typ_d_cd))
							)
							.leftOuterJoin(S1_M3).on(S1_T1.loc_cd.eq(S1_M3.loc_cd))
							.leftOuterJoin(S1_M4).on(S1_M3.site_cd.eq(S1_M4.site_cd))
							.leftOuterJoin(S1_M5).on(S1_M3.wg_cd.eq(S1_M5.wg_cd))
							.leftOuterJoin(S1_M6).on(S1_M3.lg_grp_cd.eq(S1_M6.lg_grp_cd))
							.leftOuterJoin(S1_M7).on(S1_M3.alloc_grp_cd.eq(S1_M7.alloc_grp_cd))
							.leftOuterJoin(S1_M8).on(S1_M3.loc_grp_cd.eq(S1_M8.loc_grp_cd))
							.leftOuterJoin(S1_M11).on(S1_T1.gd_cd.eq(S1_M11.gd_cd))
							.leftOuterJoin(S1_M12).on(S1_T1.stk_bp_cd.eq(S1_M12.bp_cd))
							.leftOuterJoin(S1_M20).on(
									S1_T1.loc_cd.eq(S1_M20.loc_cd)
									.and(bind("base_dt").gte(S1_M20.st_dt))
									.and(bind("base_dt").lte(S1_M20.end_dt))
								)
							.leftOuterJoin(S1_M18).on(
								coalesce(
									S1_M20.asst_dpt_cd,
									S1_M3.asst_dpt_cd
								).eq(S1_M18.dpt_cd)
								.and(bind("base_dt").between(S1_M18.st_dt, S1_M18.end_dt))
							)
							.leftOuterJoin(S1_M19).on(
								S1_T1.itm_cd.eq(S1_M19.itm_cd)
								.and(S1_T1.itm_sub1.eq(S1_M19.itm_sub1))
								.and(S1_T1.itm_sub2.eq(S1_M19.itm_sub2))
								.and(S1_T1.itm_sub3.eq(S1_M19.itm_sub3))
								.and(S1_T1.sno1.eq(S1_M19.sno1))
								.and(S1_T1.sno2.eq(S1_M19.sno2))
								.and(S1_T1.sno3.eq(S1_M19.sno3))
								.and(S1_T1.sno4.eq(S1_M19.sno4))
							)
							.innerJoin(S1_M99).on(S1_T1.loc_cd.eq(S1_M99.loc_cd))
							.addDynamicView(DS0C_ITM_GRP)
						)
						.where(
							value(0).eq(value(0))
							.cutoff$and(S1_T1.loc_cd.like(bind("loc_cd")))
							.cutoff$and(S1_M3.loc_nm.like(bind("loc_nm")))
							.cutoff$and(S1_M3.site_cd.like(bind("site_cd")))
							.cutoff$and(S1_M4.site_nm.like(bind("site_nm")))
							.cutoff$and(S1_M3.wg_cd.like(bind("wg_cd")))
							.cutoff$and(S1_M5.wg_nm.like(bind("wg_nm")))
							.cutoff$and(S1_M3.lg_grp_cd.like(bind("lg_grp_cd")))
							.cutoff$and(S1_M6.lg_grp_nm.like(bind("lg_grp_nm")))
							.cutoff$and(S1_M3.alloc_grp_cd.like(bind("alloc_grp_cd")))
							.cutoff$and(S1_M7.alloc_grp_nm.like(bind("alloc_grp_nm")))
							.cutoff$and(S1_M3.loc_grp_cd.like(bind("loc_grp_cd")))
							.cutoff$and(S1_M8.loc_grp_nm.like(bind("loc_grp_nm")))
							.cutoff$and(
								coalesce(
									S1_M20.asst_dpt_cd,
									S1_M3.asst_dpt_cd
								).like(bind("dpt_cd"))
							)
							.cutoff$and(S1_M18.dpt_nm.like(bind("dpt_nm")))
							.cutoff$and(S1_M1.itm_typ.like(bind("itm_typ")))
							.cutoff$and(S1_M1.itm_typ_d_cd.like(bind("itm_typ_d_cd")))
							.cutoff$and(S1_M2.itm_typ_d_nm.like(bind("itm_typ_d_nm")))
							.cutoff$and(S1_T1.itm_cd.like(bind("itm_cd")))
							.cutoff$and(S1_T1.itm_sub1.like(bind("itm_sub1")))
							.cutoff$and(S1_T1.itm_sub2.like(bind("itm_sub2")))
							.cutoff$and(S1_T1.itm_sub3.like(bind("itm_sub3")))
							.cutoff$and(
								coalesce(
									S1_M19.itm_nm,
									S1_M1.itm_nm
								).like(bind("itm_nm"))
							)
							.cutoff$and(S1_T1.lot_no.like(bind("lot_no")))
							.cutoff$and(S1_T1.sublot_no.like(bind("sublot_no")))
							.cutoff$and(S1_T1.sno1.like(bind("sno1")))
							.cutoff$and(S1_T1.sno2.like(bind("sno2")))
							.cutoff$and(S1_T1.sno3.like(bind("sno3")))
							.cutoff$and(S1_T1.sno4.like(bind("sno4")))
							.cutoff$and(S1_T5.wrk_no.like(bind("wrk_no")))
							.cutoff$and(S1_T5.wrk_nm.like(bind("wrk_nm")))
							.cutoff$and(S1_T1.asst_typ.like(bind("asst_typ")))
							.cutoff$and(S1_T1.stk_id_typ.like(bind("stk_id_typ")))
							.cutoff$and(S1_T1.stk_bp_cd.like(bind("stk_bp_cd")))
							.cutoff$and(S1_M12.bp_nm.like(bind("stk_bp_nm")))
							.cutoff$and(S1_T1.quality_typ.like(bind("quality_typ")))
							.cutoff$and(S1_T1.gd_cd.like(bind("gd_cd")))
							.cutoff$and(S1_M11.gd_nm.like(bind("gd_nm")))
							.cutoff$and(S1_T1.sub_char1.like(bind("stk_sub_char1")))
							.cutoff$and(S1_T1.sub_char2.like(bind("stk_sub_char2")))
							.cutoff$and(S1_T1.sub_char3.like(bind("stk_sub_char3")))
							.addDynamicPredicate(DS0C_ITM_GRP)
						)
						.union(
							subQuery()
							.select(
								S2_T1.itm_cd,
								S2_T1.itm_sub1,
								S2_T1.itm_sub2,
								S2_T1.itm_sub3,
								S2_T1.loc_cd
							)
							.from(
								S2_T1
								.leftOuterJoin(S2_T5).on(S2_T1.sno1.eq(S2_T5.sno1))
								.leftOuterJoin(S2_M1).on(
									S2_T1.itm_cd.eq(S2_M1.itm_cd)
									.and(S2_T1.itm_sub1.eq(S2_M1.itm_sub1))
									.and(S2_T1.itm_sub2.eq(S2_M1.itm_sub2))
									.and(S2_T1.itm_sub3.eq(S2_M1.itm_sub3))
								)
								.leftOuterJoin(S2_M2).on(
									S2_M1.itm_typ.eq(S2_M2.itm_typ)
									.and(S2_M1.itm_typ_d_cd.eq(S2_M2.itm_typ_d_cd))
								)
								.leftOuterJoin(S2_M3).on(S2_T1.loc_cd.eq(S2_M3.loc_cd))
								.leftOuterJoin(S2_M4).on(S2_M3.site_cd.eq(S2_M4.site_cd))
								.leftOuterJoin(S2_M5).on(S2_M3.wg_cd.eq(S2_M5.wg_cd))
								.leftOuterJoin(S2_M6).on(S2_M3.lg_grp_cd.eq(S2_M6.lg_grp_cd))
								.leftOuterJoin(S2_M7).on(S2_M3.alloc_grp_cd.eq(S2_M7.alloc_grp_cd))
								.leftOuterJoin(S2_M8).on(S2_M3.loc_grp_cd.eq(S2_M8.loc_grp_cd))
								.leftOuterJoin(S2_M11).on(S2_T1.gd_cd.eq(S2_M11.gd_cd))
								.leftOuterJoin(S2_M12).on(S2_T1.stk_bp_cd.eq(S2_M12.bp_cd))
								.leftOuterJoin(S2_M20).on(
										S2_T1.loc_cd.eq(S2_M20.loc_cd)
										.and(bind("base_dt").gte(S2_M20.st_dt))
										.and(bind("base_dt").lte(S2_M20.end_dt))
									)
								.leftOuterJoin(S2_M18).on(
									coalesce(
										S2_M20.asst_dpt_cd,
										S2_M3.asst_dpt_cd
									).eq(S2_M18.dpt_cd)
									.and(bind("base_dt").between(S2_M18.st_dt, S2_M18.end_dt))
								)
								.leftOuterJoin(S2_M19).on(
									S2_T1.itm_cd.eq(S2_M19.itm_cd)
									.and(S2_T1.itm_sub1.eq(S2_M19.itm_sub1))
									.and(S2_T1.itm_sub2.eq(S2_M19.itm_sub2))
									.and(S2_T1.itm_sub3.eq(S2_M19.itm_sub3))
									.and(S2_T1.sno1.eq(S2_M19.sno1))
									.and(S2_T1.sno2.eq(S2_M19.sno2))
									.and(S2_T1.sno3.eq(S2_M19.sno3))
									.and(S2_T1.sno4.eq(S2_M19.sno4))
								)
								.innerJoin(S2_M99).on(S2_T1.loc_cd.eq(S2_M99.loc_cd))
								.addDynamicView(DS1C_ITM_GRP)
							)
							.where(
								value(0).eq(value(0))
								.cutoff$and(S2_T1.loc_cd.like(bind("loc_cd")))
								.cutoff$and(S2_M3.loc_nm.like(bind("loc_nm")))
								.cutoff$and(S2_M3.site_cd.like(bind("site_cd")))
								.cutoff$and(S2_M4.site_nm.like(bind("site_nm")))
								.cutoff$and(S2_M3.wg_cd.like(bind("wg_cd")))
								.cutoff$and(S2_M5.wg_nm.like(bind("wg_nm")))
								.cutoff$and(S2_M3.lg_grp_cd.like(bind("lg_grp_cd")))
								.cutoff$and(S2_M6.lg_grp_nm.like(bind("lg_grp_nm")))
								.cutoff$and(S2_M3.alloc_grp_cd.like(bind("alloc_grp_cd")))
								.cutoff$and(S2_M7.alloc_grp_nm.like(bind("alloc_grp_nm")))
								.cutoff$and(S2_M3.loc_grp_cd.like(bind("loc_grp_cd")))
								.cutoff$and(S2_M8.loc_grp_nm.like(bind("loc_grp_nm")))
								.cutoff$and(
									coalesce(
										S2_M20.asst_dpt_cd,
										S2_M3.asst_dpt_cd
									).like(bind("dpt_cd"))
								)
								.cutoff$and(S2_M18.dpt_nm.like(bind("dpt_nm")))
								.cutoff$and(S2_M1.itm_typ.like(bind("itm_typ")))
								.cutoff$and(S2_M1.itm_typ_d_cd.like(bind("itm_typ_d_cd")))
								.cutoff$and(S2_M2.itm_typ_d_nm.like(bind("itm_typ_d_nm")))
								.cutoff$and(S2_T1.itm_cd.like(bind("itm_cd")))
								.cutoff$and(S2_T1.itm_sub1.like(bind("itm_sub1")))
								.cutoff$and(S2_T1.itm_sub2.like(bind("itm_sub2")))
								.cutoff$and(S2_T1.itm_sub3.like(bind("itm_sub3")))
								.cutoff$and(
									coalesce(
										S2_M19.itm_nm,
										S2_M1.itm_nm
									).like(bind("itm_nm"))
								)
								.cutoff$and(S2_T1.lot_no.like(bind("lot_no")))
								.cutoff$and(S2_T1.sublot_no.like(bind("sublot_no")))
								.cutoff$and(S2_T1.sno1.like(bind("sno1")))
								.cutoff$and(S2_T1.sno2.like(bind("sno2")))
								.cutoff$and(S2_T1.sno3.like(bind("sno3")))
								.cutoff$and(S2_T1.sno4.like(bind("sno4")))
								.cutoff$and(S2_T5.wrk_no.like(bind("wrk_no")))
								.cutoff$and(S2_T5.wrk_nm.like(bind("wrk_nm")))
								.cutoff$and(S2_T1.asst_typ.like(bind("asst_typ")))
								.cutoff$and(S2_T1.stk_id_typ.like(bind("stk_id_typ")))
								.cutoff$and(S2_T1.stk_bp_cd.like(bind("stk_bp_cd")))
								.cutoff$and(S2_M12.bp_nm.like(bind("stk_bp_nm")))
								.cutoff$and(S2_T1.quality_typ.like(bind("quality_typ")))
								.cutoff$and(S2_T1.gd_cd.like(bind("gd_cd")))
								.cutoff$and(S2_M11.gd_nm.like(bind("gd_nm")))
								.cutoff$and(S2_T1.sub_char1.like(bind("stk_sub_char1")))
								.cutoff$and(S2_T1.sub_char2.like(bind("stk_sub_char2")))
								.cutoff$and(S2_T1.sub_char3.like(bind("stk_sub_char3")))
								.addDynamicPredicate(DS1C_ITM_GRP)
							)
						)
					)
			)
			.setDynamicSQLInfo(
				when(boundOr("itm_grp_flg1"))
					.select(DS0C_ITM_GRP, S1_M1.itm_grp_cd1.as("itm_grp_cd1"), S1MM1.itm_grp_nm.as("itm_grp_nm1"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S1MM1).on(S1_M1.itm_grp_cd1.eq(S1MM1.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP1.value()).eq(S1MM1.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S1MM1.itm_grp_cd.like(bind("itm_grp_cd1"))).cutoff$and(S1MM1.itm_grp_nm.like(bind("itm_grp_nm1")))),
				when(boundOr("itm_grp_flg2"))
					.select(DS0C_ITM_GRP, S1_M1.itm_grp_cd2.as("itm_grp_cd2"), S1MM2.itm_grp_nm.as("itm_grp_nm2"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S1MM2).on(S1_M1.itm_grp_cd2.eq(S1MM2.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP2.value()).eq(S1MM2.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S1MM2.itm_grp_cd.like(bind("itm_grp_cd2"))).cutoff$and(S1MM2.itm_grp_nm.like(bind("itm_grp_nm2")))),
				when(boundOr("itm_grp_flg3"))
					.select(DS0C_ITM_GRP, S1_M1.itm_grp_cd3.as("itm_grp_cd3"), S1MM3.itm_grp_nm.as("itm_grp_nm3"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S1MM3).on(S1_M1.itm_grp_cd3.eq(S1MM3.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP3.value()).eq(S1MM3.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S1MM3.itm_grp_cd.like(bind("itm_grp_cd3"))).cutoff$and(S1MM3.itm_grp_nm.like(bind("itm_grp_nm3")))),
				when(boundOr("itm_grp_flg4"))
					.select(DS0C_ITM_GRP, S1_M1.itm_grp_cd4.as("itm_grp_cd4"), S1MM4.itm_grp_nm.as("itm_grp_nm4"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S1MM4).on(S1_M1.itm_grp_cd4.eq(S1MM4.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP4.value()).eq(S1MM4.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S1MM4.itm_grp_cd.like(bind("itm_grp_cd4"))).cutoff$and(S1MM4.itm_grp_nm.like(bind("itm_grp_nm4")))),
				when(boundOr("itm_grp_flg5"))
					.select(DS0C_ITM_GRP, S1_M1.itm_grp_cd5.as("itm_grp_cd5"), S1MM5.itm_grp_nm.as("itm_grp_nm5"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S1MM5).on(S1_M1.itm_grp_cd5.eq(S1MM5.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP5.value()).eq(S1MM5.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S1MM5.itm_grp_cd.like(bind("itm_grp_cd5"))).cutoff$and(S1MM5.itm_grp_nm.like(bind("itm_grp_nm5")))),
				when(boundOr("itm_grp_flg6"))
					.select(DS0C_ITM_GRP, S1_M1.itm_grp_cd6.as("itm_grp_cd6"), S1MM6.itm_grp_nm.as("itm_grp_nm6"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S1MM6).on(S1_M1.itm_grp_cd6.eq(S1MM6.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP6.value()).eq(S1MM6.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S1MM6.itm_grp_cd.like(bind("itm_grp_cd6"))).cutoff$and(S1MM6.itm_grp_nm.like(bind("itm_grp_nm6")))),
				when(boundOr("itm_grp_flg7"))
					.select(DS0C_ITM_GRP, S1_M1.itm_grp_cd7.as("itm_grp_cd7"), S1MM7.itm_grp_nm.as("itm_grp_nm7"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S1MM7).on(S1_M1.itm_grp_cd7.eq(S1MM7.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP7.value()).eq(S1MM7.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S1MM7.itm_grp_cd.like(bind("itm_grp_cd7"))).cutoff$and(S1MM7.itm_grp_nm.like(bind("itm_grp_nm7")))),
				when(boundOr("itm_grp_flg8"))
					.select(DS0C_ITM_GRP, S1_M1.itm_grp_cd8.as("itm_grp_cd8"), S1MM8.itm_grp_nm.as("itm_grp_nm8"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S1MM8).on(S1_M1.itm_grp_cd8.eq(S1MM8.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP8.value()).eq(S1MM8.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S1MM8.itm_grp_cd.like(bind("itm_grp_cd8"))).cutoff$and(S1MM8.itm_grp_nm.like(bind("itm_grp_nm8")))),
				when(boundOr("itm_grp_flg9"))
					.select(DS0C_ITM_GRP, S1_M1.itm_grp_cd9.as("itm_grp_cd9"), S1MM9.itm_grp_nm.as("itm_grp_nm9"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S1MM9).on(S1_M1.itm_grp_cd9.eq(S1MM9.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP9.value()).eq(S1MM9.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S1MM9.itm_grp_cd.like(bind("itm_grp_cd9"))).cutoff$and(S1MM9.itm_grp_nm.like(bind("itm_grp_nm9")))),
				when(boundOr("itm_grp_flg10"))
					.select(DS0C_ITM_GRP, S1_M1.itm_grp_cd10.as("itm_grp_cd10"), S1MM10.itm_grp_nm.as("itm_grp_nm10"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S1MM10).on(S1_M1.itm_grp_cd10.eq(S1MM10.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP10.value()).eq(S1MM10.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S1MM10.itm_grp_cd.like(bind("itm_grp_cd10"))).cutoff$and(S1MM10.itm_grp_nm.like(bind("itm_grp_nm10")))),
				when(boundOr("itm_grp_flg1"))
					.select(DS1C_ITM_GRP, S2_M1.itm_grp_cd1.as("itm_grp_cd1"), S2MM1.itm_grp_nm.as("itm_grp_nm1"))
					.view(DS1C_ITM_GRP, v -> v.leftOuterJoin(S2MM1).on(S2_M1.itm_grp_cd1.eq(S2MM1.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP1.value()).eq(S2MM1.itm_grp_typ))))
					.predicate(DS1C_ITM_GRP, p -> p.cutoff$and(S2MM1.itm_grp_cd.like(bind("itm_grp_cd1"))).cutoff$and(S2MM1.itm_grp_nm.like(bind("itm_grp_nm1")))),
				when(boundOr("itm_grp_flg2"))
					.select(DS1C_ITM_GRP, S2_M1.itm_grp_cd2.as("itm_grp_cd2"), S2MM2.itm_grp_nm.as("itm_grp_nm2"))
					.view(DS1C_ITM_GRP, v -> v.leftOuterJoin(S2MM2).on(S2_M1.itm_grp_cd2.eq(S2MM2.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP2.value()).eq(S2MM2.itm_grp_typ))))
					.predicate(DS1C_ITM_GRP, p -> p.cutoff$and(S2MM2.itm_grp_cd.like(bind("itm_grp_cd2"))).cutoff$and(S2MM2.itm_grp_nm.like(bind("itm_grp_nm2")))),
				when(boundOr("itm_grp_flg3"))
					.select(DS1C_ITM_GRP, S2_M1.itm_grp_cd3.as("itm_grp_cd3"), S2MM3.itm_grp_nm.as("itm_grp_nm3"))
					.view(DS1C_ITM_GRP, v -> v.leftOuterJoin(S2MM3).on(S2_M1.itm_grp_cd3.eq(S2MM3.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP3.value()).eq(S2MM3.itm_grp_typ))))
					.predicate(DS1C_ITM_GRP, p -> p.cutoff$and(S2MM3.itm_grp_cd.like(bind("itm_grp_cd3"))).cutoff$and(S2MM3.itm_grp_nm.like(bind("itm_grp_nm3")))),
				when(boundOr("itm_grp_flg4"))
					.select(DS1C_ITM_GRP, S2_M1.itm_grp_cd4.as("itm_grp_cd4"), S2MM4.itm_grp_nm.as("itm_grp_nm4"))
					.view(DS1C_ITM_GRP, v -> v.leftOuterJoin(S2MM4).on(S2_M1.itm_grp_cd4.eq(S2MM4.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP4.value()).eq(S2MM4.itm_grp_typ))))
					.predicate(DS1C_ITM_GRP, p -> p.cutoff$and(S2MM4.itm_grp_cd.like(bind("itm_grp_cd4"))).cutoff$and(S2MM4.itm_grp_nm.like(bind("itm_grp_nm4")))),
				when(boundOr("itm_grp_flg5"))
					.select(DS1C_ITM_GRP, S2_M1.itm_grp_cd5.as("itm_grp_cd5"), S2MM5.itm_grp_nm.as("itm_grp_nm5"))
					.view(DS1C_ITM_GRP, v -> v.leftOuterJoin(S2MM5).on(S2_M1.itm_grp_cd5.eq(S2MM5.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP5.value()).eq(S2MM5.itm_grp_typ))))
					.predicate(DS1C_ITM_GRP, p -> p.cutoff$and(S2MM5.itm_grp_cd.like(bind("itm_grp_cd5"))).cutoff$and(S2MM5.itm_grp_nm.like(bind("itm_grp_nm5")))),
				when(boundOr("itm_grp_flg6"))
					.select(DS1C_ITM_GRP, S2_M1.itm_grp_cd6.as("itm_grp_cd6"), S2MM6.itm_grp_nm.as("itm_grp_nm6"))
					.view(DS1C_ITM_GRP, v -> v.leftOuterJoin(S2MM6).on(S2_M1.itm_grp_cd6.eq(S2MM6.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP6.value()).eq(S2MM6.itm_grp_typ))))
					.predicate(DS1C_ITM_GRP, p -> p.cutoff$and(S2MM6.itm_grp_cd.like(bind("itm_grp_cd6"))).cutoff$and(S2MM6.itm_grp_nm.like(bind("itm_grp_nm6")))),
				when(boundOr("itm_grp_flg7"))
					.select(DS1C_ITM_GRP, S2_M1.itm_grp_cd7.as("itm_grp_cd7"), S2MM7.itm_grp_nm.as("itm_grp_nm7"))
					.view(DS1C_ITM_GRP, v -> v.leftOuterJoin(S2MM7).on(S2_M1.itm_grp_cd7.eq(S2MM7.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP7.value()).eq(S2MM7.itm_grp_typ))))
					.predicate(DS1C_ITM_GRP, p -> p.cutoff$and(S2MM7.itm_grp_cd.like(bind("itm_grp_cd7"))).cutoff$and(S2MM7.itm_grp_nm.like(bind("itm_grp_nm7")))),
				when(boundOr("itm_grp_flg8"))
					.select(DS1C_ITM_GRP, S2_M1.itm_grp_cd8.as("itm_grp_cd8"), S2MM8.itm_grp_nm.as("itm_grp_nm8"))
					.view(DS1C_ITM_GRP, v -> v.leftOuterJoin(S2MM8).on(S2_M1.itm_grp_cd8.eq(S2MM8.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP8.value()).eq(S2MM8.itm_grp_typ))))
					.predicate(DS1C_ITM_GRP, p -> p.cutoff$and(S2MM8.itm_grp_cd.like(bind("itm_grp_cd8"))).cutoff$and(S2MM8.itm_grp_nm.like(bind("itm_grp_nm8")))),
				when(boundOr("itm_grp_flg9"))
					.select(DS1C_ITM_GRP, S2_M1.itm_grp_cd9.as("itm_grp_cd9"), S2MM9.itm_grp_nm.as("itm_grp_nm9"))
					.view(DS1C_ITM_GRP, v -> v.leftOuterJoin(S2MM9).on(S2_M1.itm_grp_cd9.eq(S2MM9.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP9.value()).eq(S2MM9.itm_grp_typ))))
					.predicate(DS1C_ITM_GRP, p -> p.cutoff$and(S2MM9.itm_grp_cd.like(bind("itm_grp_cd9"))).cutoff$and(S2MM9.itm_grp_nm.like(bind("itm_grp_nm9")))),
				when(boundOr("itm_grp_flg10"))
					.select(DS1C_ITM_GRP, S2_M1.itm_grp_cd10.as("itm_grp_cd10"), S2MM10.itm_grp_nm.as("itm_grp_nm10"))
					.view(DS1C_ITM_GRP, v -> v.leftOuterJoin(S2MM10).on(S2_M1.itm_grp_cd10.eq(S2MM10.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP10.value()).eq(S2MM10.itm_grp_typ))))
					.predicate(DS1C_ITM_GRP, p -> p.cutoff$and(S2MM10.itm_grp_cd.like(bind("itm_grp_cd10"))).cutoff$and(S2MM10.itm_grp_nm.like(bind("itm_grp_nm10"))))
			);
	}
}