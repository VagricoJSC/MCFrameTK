package mcframe.serverMSBC.MSBCL1060;

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
	 * -- MSBCL1060_MST_STK_Query_S01
	 */
	static MCQueryPlan MSBCL1060_MST_STK_S01() {
		MST_STK_R S0T1 = MST_STK_R.create("T1");
		MAVM_RD_LOC_R S0M0 = MAVM_RD_LOC_R.create("M0");
		MSVT_LOT_LIST_R S0T2 = MSVT_LOT_LIST_R.create("T2");
		MSVT_WRK_SNO_R S0T3 = MSVT_WRK_SNO_R.create("T3");
		MAM_WG_R S0M1 = MAM_WG_R.create("M1");
		MAM_LOC_GRP_R S0M2 = MAM_LOC_GRP_R.create("M2");
		MAM_LOC_R S0M3 = MAM_LOC_R.create("M3");
		MAM_STR_LN_R S0M4 = MAM_STR_LN_R.create("M4");
		MAM_BP_R S0M5 = MAM_BP_R.create("M5");
		MAM_ITM_R S0M6 = MAM_ITM_R.create("M6");
		MAM_ITM_TYP_D_R S0M7 = MAM_ITM_TYP_D_R.create("M7");
		MAM_SITE_R S0M8 = MAM_SITE_R.create("M8");
		MAM_LG_GRP_R S0M9 = MAM_LG_GRP_R.create("M9");
		MAM_ALLOC_GRP_R S0M10 = MAM_ALLOC_GRP_R.create("M10");
		MST_WRK_R S0M11 = MST_WRK_R.create("M11");
		MAM_STK_GD_R S0M12 = MAM_STK_GD_R.create("M12");
		MAM_BP_R S0M13 = MAM_BP_R.create("M13");
		MAM_UNIT_R S0M14 = MAM_UNIT_R.create("M14");
		MAM_SUNDRY_ITM_R S0M19 = MAM_SUNDRY_ITM_R.create("M19");
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
		MCDynamicSQLID REP_ITM = createDynamicSQLID("REP_ITM");
		MCDynamicSQLID REP_LOC = createDynamicSQLID("REP_LOC");
		MCDynamicSQLID REP_SRCH = createDynamicSQLID("REP_SRCH");

		
		return createQueryPlan()
			.setQuery(
				sql("MSBCL1060_MST_STK_Query_S01")
					.mainQuery()
					.select(
						S0T1.itm_cd,
						S0T1.itm_sub1,
						S0T1.itm_sub2,
						S0T1.itm_sub3,
						coalesce(
							S0M19.itm_nm,
							S0M6.itm_nm
						).as("itm_nm"),
						S0T2.ver_no,
						S0T2.bp_lot_no,
						S0T1.lot_no,
						S0T1.sublot_no,
						S0T1.loc_cd,
						S0M3.loc_nm,
						S0T1.str_ln_cd,
						S0T1.gd_cd,
						S0T1.sno1,
						S0T1.sno2,
						S0T1.sno3,
						S0T1.sno4,
						S0T1.in_xfr_typ,
						S0T1.quality_typ,
						S0T1.stk_insp_typ,
						S0T1.stk_id_typ,
						S0T1.asst_typ,
						S0T1.fix_no_typ,
						S0T1.fix_no,
						S0T1.stk_bp_cd,
						S0T1.stk_arrv_bp_cd,
						S0T1.pack_unit_cd,
						S0M6.unit_cd.as("base_unit_cd"),
						S0T2.act_cont_fctr,
						S0M6.cont_fctr_unit_cd,
						S0M6.std_cont_fctr,
						S0M6.cont_fctr_flg,
						S0M6.cont_fctr_rnd_typ,
						S0M6.cont_fctr_dec_place,
						S0T2.first_gr_dt,
						S0T2.unreg_lmt_flg,
						S0T2.vld_dt,
						S0T2.lmt_dt,
						S0T1.pack_unit_qty.as("pack_stk_qty"),
						S0T1.base_unit_qty.as("base_stk_qty"),
						value(0).as("pack_gr_schd_qty"),
						nullValue().as("pack_alloc_qty"),
						nullValue().as("pack_alloc_avl_qty"),
						value(0).as("base_gr_schd_qty"),
						nullValue().as("base_alloc_qty"),
						nullValue().as("base_alloc_avl_qty"),
						// this field is appended by sql coverter.
						S0M0.wg_cd.as("wg_cd_m0"),
						// this field is appended by sql coverter.
						S0M0.loc_grp_cd.as("loc_grp_cd_m0"),
						// this field is appended by sql coverter.
						S0M0.site_cd.as("site_cd_m0"),
						// this field is appended by sql coverter.
						S0M0.lg_grp_cd.as("lg_grp_cd_m0"),
						// this field is appended by sql coverter.
						S0M0.alloc_grp_cd.as("alloc_grp_cd_m0")
					)
					.from(
						S0T1
						.innerJoin(S0M0).on(S0M0.loc_cd.eq(S0T1.loc_cd))
						.leftOuterJoin(S0T2).on(
							S0T2.itm_cd.eq(S0T1.itm_cd)
							.and(S0T2.itm_sub1.eq(S0T1.itm_sub1))
							.and(S0T2.itm_sub2.eq(S0T1.itm_sub2))
							.and(S0T2.itm_sub3.eq(S0T1.itm_sub3))
							.and(S0T2.lot_no.eq(S0T1.lot_no))
							.and(S0T2.sublot_no.eq(S0T1.sublot_no))
						)
						.leftOuterJoin(S0M3).on(S0T1.loc_cd.eq(S0M3.loc_cd))
						.leftOuterJoin(S0M6).on(
							S0T1.itm_cd.eq(S0M6.itm_cd)
							.and(S0T1.itm_sub1.eq(S0M6.itm_sub1))
							.and(S0T1.itm_sub2.eq(S0M6.itm_sub2))
							.and(S0T1.itm_sub3.eq(S0M6.itm_sub3))
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
						.addDynamicView()
						.addDynamicView(DS0C_ITM_GRP)
					)
					.where(
						value(0).eq(value(0))
						.and(S0T1.in_xfr_typ.eq(value(MSC_IN_XFR_TYP.IN_LOC.value())))
						.and(
							value(1).eq(value(0))
							.cutoff$or(S0T1.quality_typ.eq(bind("good")))
							.cutoff$or(S0T1.quality_typ.eq(bind("dfct_oper")))
							.cutoff$or(S0T1.quality_typ.eq(bind("dfct_insp")))
							.cutoff$or(S0T1.quality_typ.eq(bind("sspnd")))
						)
						.and(
							value(1).eq(value(0))
							.cutoff$or(S0T1.stk_insp_typ.eq(bind("yet")))
							.cutoff$or(S0T1.stk_insp_typ.eq(bind("ing")))
							.cutoff$or(S0T1.stk_insp_typ.eq(bind("wait_judg")))
							.cutoff$or(S0T1.stk_insp_typ.eq(bind("fin")))
						)
						.and(
							value(1).eq(value(0))
							.cutoff$or(S0T1.stk_id_typ.eq(bind("costk")))
							.cutoff$or(S0T1.stk_id_typ.eq(bind("rtn_pre_accpt")))
							.cutoff$or(S0T1.stk_id_typ.eq(bind("cststk")))
							.cutoff$or(S0T1.stk_id_typ.eq(bind("rnt_rcv")))
							.cutoff$or(S0T1.stk_id_typ.eq(bind("purc_pre_accpt")))
							.cutoff$or(S0T1.stk_id_typ.eq(bind("accpt_dfct")))
							.cutoff$or(S0T1.stk_id_typ.eq(bind("ncv_rcv")))
							.cutoff$or(S0T1.stk_id_typ.eq(bind("onr_prov")))
						)
						.and(
							value(1).eq(value(0))
							.cutoff$or(S0T2.plnt_aprv_sts_typ.eq(bind("plnt_aprv_sts_typ_opn")))
							.cutoff$or(S0T2.plnt_aprv_sts_typ.eq(bind("plnt_aprv_sts_typ_acpt")))
							.cutoff$or(S0T2.plnt_aprv_sts_typ.eq(bind("plnt_aprv_sts_typ_rjct")))
							.cutoff$or(
								bind("plnt_aprv_sts_typ_non").eq(value(true))
								.and(S0T2.plnt_aprv_sts_typ.isNull())
							)
						)
						.and(
							value(1).eq(value(0))
							.cutoff$or(S0T2.mrkt_judg_sts_typ.eq(bind("mrkt_judg_sts_typ_opn")))
							.cutoff$or(S0T2.mrkt_judg_sts_typ.eq(bind("mrkt_judg_sts_typ_acpt")))
							.cutoff$or(S0T2.mrkt_judg_sts_typ.eq(bind("mrkt_judg_sts_typ_not_acpt")))
							.cutoff$or(
								bind("mrkt_judg_sts_typ_non").eq(value(true))
								.and(S0T2.mrkt_judg_sts_typ.isNull())
							)
						)
						.cutoff$and(S0T1.sno1.like(bind("sno1")))
						.cutoff$and(S0T1.sno2.like(bind("sno2")))
						.cutoff$and(S0T1.sno3.like(bind("sno3")))
						.cutoff$and(S0T1.sno4.like(bind("sno4")))
						.cutoff$and(S0T1.itm_cd.like(bind("itm_cd")))
						.cutoff$and(S0T1.itm_sub1.like(bind("itm_sub1")))
						.cutoff$and(S0T1.itm_sub2.like(bind("itm_sub2")))
						.cutoff$and(S0T1.itm_sub3.like(bind("itm_sub3")))
						.cutoff$and(
							coalesce(
								S0M19.itm_nm,
								S0M6.itm_nm
							).like(bind("itm_nm"))
						)
						.cutoff$and(S0M6.itm_typ.like(bind("itm_typ")))
						.cutoff$and(S0M6.itm_typ_d_cd.like(bind("itm_typ_d_cd")))
						.addDynamicPredicate()
						.cutoff$and(S0T2.ver_no.like(bind("ver_no")))
						.cutoff$and(S0T1.lot_no.like(bind("lot_no")))
						.cutoff$and(S0T1.sublot_no.like(bind("sublot_no")))
						.cutoff$and(S0T2.bp_lot_no.like(bind("bp_lot_no")))
						.cutoff$and(S0T1.loc_cd.like(bind("loc_cd")))
						.cutoff$and(S0M3.loc_nm.like(bind("loc_nm")))
						.cutoff$and(S0T1.str_ln_cd.like(bind("str_ln_cd")))
						.cutoff$and(S0T1.stk_arrv_bp_cd.like(bind("stk_arrv_bp_cd")))
						.cutoff$and(
							not(
								S0M3.sppl_cd.isNull()
								.and(S0T1.stk_arrv_bp_cd.neq(value(MAC_STR.NULL_VAL.value())))
							)
							.and(bind("only_int_true").isNotNull())
						)
						.and(
							value(0).eq(value(0))
							.cutoff$and(S0T2.vld_dt.gte(bind("vld_dt_fr")))
							.cutoff$and(S0T2.vld_dt.lte(bind("vld_dt_to")))
							.cutoff$and(S0T2.lmt_dt.gte(bind("lmt_dt_fr")))
							.cutoff$and(S0T2.lmt_dt.lte(bind("lmt_dt_to")))
							.cutoff$or(S0T2.unreg_lmt_flg.eq(bind("unreg_lmt_true")))
						)
						.cutoff$and(S0T1.gd_cd.like(bind("gd_cd")))
						.cutoff$and(S0T1.stk_bp_cd.like(bind("stk_bp_cd")))
						.cutoff$and(S0T1.asst_typ.like(bind("asst_typ")))
						.cutoff$and(S0T1.fix_no_typ.like(bind("fix_no_typ")))
						.cutoff$and(S0T1.fix_no.like(bind("fix_no")))
						.cutoff$and(S0T1.pack_unit_cd.like(bind("pack_unit_cd")))
						.cutoff$and(S0T2.first_gr_dt.gte(bind("first_gr_dt_fr")))
						.cutoff$and(S0T2.first_gr_dt.lte(bind("first_gr_dt_to")))
						.addDynamicPredicate(DS0C_ITM_GRP)
						.addDynamicPredicate(REP_ITM)
						.addDynamicPredicate(REP_LOC)
						.addDynamicPredicate(REP_SRCH)
					)
			)
			.setDynamicSQLInfo(
					when(boundOr("wrk_nm", "wrk_no"))
						.view(v -> v.leftOuterJoin(S0T3).on(S0T3.sno1.eq(S0T1.sno1)))
						.predicate(p -> p.cutoff$and(S0T3.wrk_no.like(bind("wrk_no")))),
					when(boundOr("wg_cd", "wg_nm"))
						.view(v -> v.leftOuterJoin(S0M1).on(S0M1.wg_cd.eq(S0M0.wg_cd)))
						.predicate(p -> p.cutoff$and(S0M1.wg_cd.like(bind("wg_cd"))).cutoff$and(S0M1.wg_nm.like(bind("wg_nm")))),
					when(boundOr("loc_grp_cd", "loc_grp_nm"))
						.view(v -> v.leftOuterJoin(S0M2).on(S0M2.loc_grp_cd.eq(S0M0.loc_grp_cd)))
						.predicate(p -> p.cutoff$and(S0M2.loc_grp_cd.like(bind("loc_grp_cd"))).cutoff$and(S0M2.loc_grp_nm.like(bind("loc_grp_nm")))),
					when(boundOr("str_ln_nm"))
						.view(v -> v.leftOuterJoin(S0M4).on(S0T1.loc_cd.eq(S0M4.loc_cd).and(S0T1.str_ln_cd.eq(S0M4.str_ln_cd))))
						.predicate(p -> p.cutoff$and(S0M4.str_ln_nm.like(bind("str_ln_nm")))),
					when(boundOr("stk_arrv_bp_nm"))
						.view(v -> v.leftOuterJoin(S0M5).on(S0T1.stk_arrv_bp_cd.eq(S0M5.bp_cd)))
						.predicate(p -> p.cutoff$and(S0M5.bp_nm.like(bind("stk_arrv_bp_nm")))),
					when(boundOr("itm_typ_d_nm"))
						.view(v -> v.leftOuterJoin(S0M7).on(S0M6.itm_typ.eq(S0M7.itm_typ).and(S0M6.itm_typ_d_cd.eq(S0M7.itm_typ_d_cd))))
						.predicate(p -> p.cutoff$and(S0M7.itm_typ_d_nm.like(bind("itm_typ_d_nm")))),
					when(boundOr("site_cd", "site_nm"))
						.view(v -> v.leftOuterJoin(S0M8).on(S0M8.site_cd.eq(S0M0.site_cd)))
						.predicate(p -> p.cutoff$and(S0M8.site_cd.like(bind("site_cd"))).cutoff$and(S0M8.site_nm.like(bind("site_nm")))),
					when(boundOr("lg_grp_cd", "lg_grp_nm"))
						.view(v -> v.leftOuterJoin(S0M9).on(S0M9.lg_grp_cd.eq(S0M0.lg_grp_cd)))
						.predicate(p -> p.cutoff$and(S0M9.lg_grp_cd.like(bind("lg_grp_cd"))).cutoff$and(S0M9.lg_grp_nm.like(bind("lg_grp_nm")))),
					when(boundOr("alloc_grp_cd", "alloc_grp_nm"))
						.view(v -> v.leftOuterJoin(S0M10).on(S0M10.alloc_grp_cd.eq(S0M0.alloc_grp_cd)))
						.predicate(p -> p.cutoff$and(S0M10.alloc_grp_cd.like(bind("alloc_grp_cd"))).cutoff$and(S0M10.alloc_grp_nm.like(bind("alloc_grp_nm")))),
					when(boundOr("wrk_nm"))
						.view(v -> v.leftOuterJoin(S0M11).on(S0T3.wrk_no.eq(S0M11.wrk_no)))
						.predicate(p -> p.cutoff$and(S0M11.wrk_nm.like(bind("wrk_nm")))),
					when(boundOr("gd_nm"))
						.view(v -> v.leftOuterJoin(S0M12).on(S0T1.gd_cd.eq(S0M12.gd_cd)))
						.predicate(p -> p.cutoff$and(S0M12.gd_nm.like(bind("gd_nm")))),
					when(boundOr("stk_bp_nm"))
						.view(v -> v.leftOuterJoin(S0M13).on(S0T1.stk_bp_cd.eq(S0M13.bp_cd)))
						.predicate(p -> p.cutoff$and(S0M13.bp_nm.like(bind("stk_bp_nm")))),
					when(boundOr("pack_unit_nm"))
						.view(v -> v.leftOuterJoin(S0M14).on(S0T1.pack_unit_cd.eq(S0M14.unit_cd)))
						.predicate(p -> p.cutoff$and(S0M14.unit_nm.like(bind("pack_unit_nm")))),
					when(boundOr("itm_grp_flg1"))
						.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0MM1).on(S0M6.itm_grp_cd1.eq(S0MM1.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP1.value()).eq(S0MM1.itm_grp_typ))))
						.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0M6.itm_grp_cd1.like(bind("itm_grp_cd1"))).cutoff$and(S0MM1.itm_grp_nm.like(bind("itm_grp_nm1")))),
					when(boundOr("itm_grp_flg2"))
						.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0MM2).on(S0M6.itm_grp_cd2.eq(S0MM2.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP2.value()).eq(S0MM2.itm_grp_typ))))
						.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0M6.itm_grp_cd2.like(bind("itm_grp_cd2"))).cutoff$and(S0MM2.itm_grp_nm.like(bind("itm_grp_nm2")))),
					when(boundOr("itm_grp_flg3"))
						.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0MM3).on(S0M6.itm_grp_cd3.eq(S0MM3.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP3.value()).eq(S0MM3.itm_grp_typ))))
						.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0M6.itm_grp_cd3.like(bind("itm_grp_cd3"))).cutoff$and(S0MM3.itm_grp_nm.like(bind("itm_grp_nm3")))),
					when(boundOr("itm_grp_flg4"))
						.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0MM4).on(S0M6.itm_grp_cd4.eq(S0MM4.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP4.value()).eq(S0MM4.itm_grp_typ))))
						.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0M6.itm_grp_cd4.like(bind("itm_grp_cd4"))).cutoff$and(S0MM4.itm_grp_nm.like(bind("itm_grp_nm4")))),
					when(boundOr("itm_grp_flg5"))
						.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0MM5).on(S0M6.itm_grp_cd5.eq(S0MM5.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP5.value()).eq(S0MM5.itm_grp_typ))))
						.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0M6.itm_grp_cd5.like(bind("itm_grp_cd5"))).cutoff$and(S0MM5.itm_grp_nm.like(bind("itm_grp_nm5")))),
					when(boundOr("itm_grp_flg6"))
						.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0MM6).on(S0M6.itm_grp_cd6.eq(S0MM6.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP6.value()).eq(S0MM6.itm_grp_typ))))
						.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0M6.itm_grp_cd6.like(bind("itm_grp_cd6"))).cutoff$and(S0MM6.itm_grp_nm.like(bind("itm_grp_nm6")))),
					when(boundOr("itm_grp_flg7"))
						.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0MM7).on(S0M6.itm_grp_cd7.eq(S0MM7.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP7.value()).eq(S0MM7.itm_grp_typ))))
						.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0M6.itm_grp_cd7.like(bind("itm_grp_cd7"))).cutoff$and(S0MM7.itm_grp_nm.like(bind("itm_grp_nm7")))),
					when(boundOr("itm_grp_flg8"))
						.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0MM8).on(S0M6.itm_grp_cd8.eq(S0MM8.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP8.value()).eq(S0MM8.itm_grp_typ))))
						.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0M6.itm_grp_cd8.like(bind("itm_grp_cd8"))).cutoff$and(S0MM8.itm_grp_nm.like(bind("itm_grp_nm8")))),
					when(boundOr("itm_grp_flg9"))
						.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0MM9).on(S0M6.itm_grp_cd9.eq(S0MM9.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP9.value()).eq(S0MM9.itm_grp_typ))))
						.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0M6.itm_grp_cd9.like(bind("itm_grp_cd9"))).cutoff$and(S0MM9.itm_grp_nm.like(bind("itm_grp_nm9")))),
					when(boundOr("itm_grp_flg10"))
						.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0MM10).on(S0M6.itm_grp_cd10.eq(S0MM10.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP10.value()).eq(S0MM10.itm_grp_typ))))
						.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0M6.itm_grp_cd10.like(bind("itm_grp_cd10"))).cutoff$and(S0MM10.itm_grp_nm.like(bind("itm_grp_nm10"))))
				)
			.setJoinInfo(
				joinInfo(
					j -> j
						.add(MSVT_WRK_SNO_R.class, r -> toCondition(
							r.getStringNE("sno1")
						))
						.addSelect(m -> toArray(
							m.wrk_no
						))
						.addMap((r, m) -> {
							r.setStringNE("wrk_no", m.wrk_no());
					}),
					j -> j
						.add(MAM_WG_R.class, r -> toCondition(
							r.getStringNE("wg_cd_m0")
						))
						.addSelect(m -> toArray(
							m.wg_cd,
							m.wg_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("wg_cd", m.wg_cd());
							r.setStringNE("wg_nm", m.wg_nm());
					}),
					j -> j
						.add(MAM_LOC_GRP_R.class, r -> toCondition(
							r.getStringNE("loc_grp_cd_m0")
						))
						.addSelect(m -> toArray(
							m.loc_grp_cd,
							m.loc_grp_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("loc_grp_cd", m.loc_grp_cd());
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
						.add(MAM_SITE_R.class, r -> toCondition(
							r.getStringNE("site_cd_m0")
						))
						.addSelect(m -> toArray(
							m.site_cd,
							m.site_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("site_cd", m.site_cd());
							r.setStringNE("site_nm", m.site_nm());
					}),
					j -> j
						.add(MAM_LG_GRP_R.class, r -> toCondition(
							r.getStringNE("lg_grp_cd_m0")
						))
						.addSelect(m -> toArray(
							m.lg_grp_cd,
							m.lg_grp_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("lg_grp_cd", m.lg_grp_cd());
							r.setStringNE("lg_grp_nm", m.lg_grp_nm());
					}),
					j -> j
						.add(MAM_ALLOC_GRP_R.class, r -> toCondition(
							r.getStringNE("alloc_grp_cd_m0")
						))
						.addSelect(m -> toArray(
							m.alloc_grp_cd,
							m.alloc_grp_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("alloc_grp_cd", m.alloc_grp_cd());
							r.setStringNE("alloc_grp_nm", m.alloc_grp_nm());
					}),
					j -> j
						.add(MST_WRK_R.class, r -> toCondition(
							r.getStringNE("wrk_no")
						))
						.addSelect(m -> toArray(
							m.wrk_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("wrk_nm", m.wrk_nm());
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
							m.dec_place,
							m.rnd_typ,
							m.unit_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("pack_unit_nm", m.unit_nm());
							r.setNumberNE("pack_unit_dec_place", m.dec_place());
							r.setStringNE("pack_unit_rnd_typ", m.rnd_typ());
					}),
					j -> j
						.add(MAM_UNIT_R.class, r -> toCondition(
							r.getStringNE("base_unit_cd")
						))
						.addSelect(m -> toArray(
							m.dec_place,
							m.rnd_typ,
							m.unit_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("base_unit_nm", m.unit_nm());
							r.setNumberNE("base_unit_dec_place", m.dec_place());
							r.setStringNE("base_unit_rnd_typ", m.rnd_typ());
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
						.add(MAVM_ITM_UNIT_R.class, r -> toCondition(
							r.getStringNE("itm_cd"),
							r.getStringNE("itm_sub1"),
							r.getStringNE("itm_sub2"),
							r.getStringNE("itm_sub3"),
							r.getStringNE("pack_unit_cd")
						))
						.addSelect(m -> toArray(
							m.conv_base_qty,
							m.conv_qty
						))
						.addMap((r, m) -> {
							r.setNumberNE("conv_base_qty", m.conv_base_qty());
							r.setNumberNE("conv_qty", m.conv_qty());
					})
				)
			);
	}
	
	/**
	 * -- MSBCL1060_MSVT_AVL_STK_CACHE_Query_S01
	 */
	static MCQueryPlan MSBCL1060_MSVT_AVL_STK_CACHE_S01() {
		MSVT_AVL_STK_R S0T1 = MSVT_AVL_STK_R.create("T1");
		MAVM_RD_LOC_R S0M0 = MAVM_RD_LOC_R.create("M0");
		MSVT_WRK_SNO_R S0T3 = MSVT_WRK_SNO_R.create("T3");
		MAM_WG_R S0M1 = MAM_WG_R.create("M1");
		MAM_LOC_GRP_R S0M2 = MAM_LOC_GRP_R.create("M2");
		MAM_LOC_R S0M3 = MAM_LOC_R.create("M3");
		MAM_STR_LN_R S0M4 = MAM_STR_LN_R.create("M4");
		MAM_BP_R S0M5 = MAM_BP_R.create("M5");
		MAM_ITM_R S0M6 = MAM_ITM_R.create("M6");
		MAM_ITM_TYP_D_R S0M7 = MAM_ITM_TYP_D_R.create("M7");
		MAM_SITE_R S0M8 = MAM_SITE_R.create("M8");
		MAM_LG_GRP_R S0M9 = MAM_LG_GRP_R.create("M9");
		MAM_ALLOC_GRP_R S0M10 = MAM_ALLOC_GRP_R.create("M10");
		MST_WRK_R S0M11 = MST_WRK_R.create("M11");
		MAM_STK_GD_R S0M12 = MAM_STK_GD_R.create("M12");
		MAM_BP_R S0M13 = MAM_BP_R.create("M13");
		MAM_UNIT_R S0M14 = MAM_UNIT_R.create("M14");
		MAM_UNIT_R S0M15 = MAM_UNIT_R.create("M15");
		MAM_UNIT_R S0M16 = MAM_UNIT_R.create("M16");
		MAM_SUNDRY_ITM_R S0M19 = MAM_SUNDRY_ITM_R.create("M19");
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
		MSVT_AVL_IO_SCHD_R S1T1 = MSVT_AVL_IO_SCHD_R.create("T1");
		MAVM_RD_LOC_R S1M0 = MAVM_RD_LOC_R.create("M0");
		MSVT_WRK_SNO_R S1T3 = MSVT_WRK_SNO_R.create("T3");
		MAM_WG_R S1M1 = MAM_WG_R.create("M1");
		MAM_LOC_GRP_R S1M2 = MAM_LOC_GRP_R.create("M2");
		MAM_LOC_R S1M3 = MAM_LOC_R.create("M3");
		MAM_STR_LN_R S1M4 = MAM_STR_LN_R.create("M4");
		MAM_BP_R S1M5 = MAM_BP_R.create("M5");
		MAM_ITM_R S1M6 = MAM_ITM_R.create("M6");
		MAM_ITM_TYP_D_R S1M7 = MAM_ITM_TYP_D_R.create("M7");
		MAM_SITE_R S1M8 = MAM_SITE_R.create("M8");
		MAM_LG_GRP_R S1M9 = MAM_LG_GRP_R.create("M9");
		MAM_ALLOC_GRP_R S1M10 = MAM_ALLOC_GRP_R.create("M10");
		MST_WRK_R S1M11 = MST_WRK_R.create("M11");
		MAM_STK_GD_R S1M12 = MAM_STK_GD_R.create("M12");
		MAM_BP_R S1M13 = MAM_BP_R.create("M13");
		MAM_UNIT_R S1M14 = MAM_UNIT_R.create("M14");
		MAM_UNIT_R S1M15 = MAM_UNIT_R.create("M15");
		MAM_UNIT_R S1M16 = MAM_UNIT_R.create("M16");
		MAM_SUNDRY_ITM_R S1M19 = MAM_SUNDRY_ITM_R.create("M19");
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
		
		MCDynamicSQLID DS0C_ITM_GRP = createDynamicSQLID("DS0C_ITM_GRP");
		MCDynamicSQLID DS1C_ITM_GRP = createDynamicSQLID("DS1C_ITM_GRP");
		MCDynamicSQLID REP_ITM = createDynamicSQLID("REP_ITM");
		MCDynamicSQLID REP_LOC = createDynamicSQLID("REP_LOC");
		
		return createQueryPlan()
			.setQuery(
				sql("MSBCL1060_MSVT_AVL_STK_CACHE_Query_S01")
					.mainQuery()
					.select(
						S0T1.itm_cd,
						S0T1.itm_sub1,
						S0T1.itm_sub2,
						S0T1.itm_sub3,
						S0M6.itm_nm,
						S0M19.itm_nm.as("sundry_itm_nm"),
						S0T1.sno1,
						S0T1.sno2,
						S0T1.sno3,
						S0T1.sno4,
						S0M1.wg_cd,
						S0M1.wg_nm,
						S0T1.lot_no,
						S0T1.sublot_no,
						S0T1.loc_cd,
						S0M3.loc_nm,
						S0T1.str_ln_cd,
						S0M4.str_ln_nm,
						S0M8.site_cd,
						S0M8.site_nm,
						S0M9.lg_grp_cd,
						S0M9.lg_grp_nm,
						S0M10.alloc_grp_cd,
						S0M10.alloc_grp_nm,
						S0M2.loc_grp_cd,
						S0M2.loc_grp_nm,
						S0T1.gd_cd,
						S0M12.gd_nm,
						S0T3.wrk_no,
						S0M11.wrk_nm,
						S0T1.stk_bp_cd,
						S0M13.bp_nm.as("stk_bp_nm"),
						S0T1.stk_arrv_bp_cd,
						S0M5.bp_nm.as("stk_arrv_bp_nm"),
						S0T1.pack_unit_cd,
						S0M14.unit_nm.as("pack_unit_nm"),
						S0M6.unit_cd.as("base_unit_cd"),
						S0M15.unit_nm.as("base_unit_nm"),
						S0M6.cont_fctr_unit_cd,
						S0M16.unit_nm.as("cont_fctr_unit_nm"),
						S0M6.cont_fctr_rnd_typ,
						S0M6.cont_fctr_dec_place
					)
					.from(
						S0T1
						.innerJoin(S0M0).on(S0M0.loc_cd.eq(S0T1.loc_cd))
						.leftOuterJoin(S0T3).on(S0T3.sno1.eq(S0T1.sno1))
						.leftOuterJoin(S0M1).on(S0M1.wg_cd.eq(S0M0.wg_cd))
						.leftOuterJoin(S0M2).on(S0M2.loc_grp_cd.eq(S0M0.loc_grp_cd))
						.leftOuterJoin(S0M3).on(S0T1.loc_cd.eq(S0M3.loc_cd))
						.leftOuterJoin(S0M4).on(
							S0T1.loc_cd.eq(S0M4.loc_cd)
							.and(S0T1.str_ln_cd.eq(S0M4.str_ln_cd))
						)
						.leftOuterJoin(S0M5).on(S0T1.stk_arrv_bp_cd.eq(S0M5.bp_cd))
						.leftOuterJoin(S0M6).on(
							S0T1.itm_cd.eq(S0M6.itm_cd)
							.and(S0T1.itm_sub1.eq(S0M6.itm_sub1))
							.and(S0T1.itm_sub2.eq(S0M6.itm_sub2))
							.and(S0T1.itm_sub3.eq(S0M6.itm_sub3))
						)
						.leftOuterJoin(S0M7).on(
							S0M6.itm_typ.eq(S0M7.itm_typ)
							.and(S0M6.itm_typ_d_cd.eq(S0M7.itm_typ_d_cd))
						)
						.leftOuterJoin(S0M8).on(S0M8.site_cd.eq(S0M0.site_cd))
						.leftOuterJoin(S0M9).on(S0M9.lg_grp_cd.eq(S0M0.lg_grp_cd))
						.leftOuterJoin(S0M10).on(S0M10.alloc_grp_cd.eq(S0M0.alloc_grp_cd))
						.leftOuterJoin(S0M11).on(S0T3.wrk_no.eq(S0M11.wrk_no))
						.leftOuterJoin(S0M12).on(S0T1.gd_cd.eq(S0M12.gd_cd))
						.leftOuterJoin(S0M13).on(S0T1.stk_bp_cd.eq(S0M13.bp_cd))
						.leftOuterJoin(S0M14).on(S0T1.pack_unit_cd.eq(S0M14.unit_cd))
						.leftOuterJoin(S0M15).on(S0M6.unit_cd.eq(S0M15.unit_cd))
						.leftOuterJoin(S0M16).on(S0M6.cont_fctr_unit_cd.eq(S0M16.unit_cd))
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
						.addDynamicView(DS0C_ITM_GRP)
					)
					.where(
						value(0).eq(value(0))
						.and(
							value(1).eq(value(0))
							.cutoff$or(S0T1.quality_typ.eq(bind("good")))
							.cutoff$or(S0T1.quality_typ.eq(bind("dfct_oper")))
							.cutoff$or(S0T1.quality_typ.eq(bind("dfct_insp")))
							.cutoff$or(S0T1.quality_typ.eq(bind("sspnd")))
						)
						.and(
							value(1).eq(value(0))
							.cutoff$or(S0T1.stk_id_typ.eq(bind("costk")))
							.cutoff$or(S0T1.stk_id_typ.eq(bind("cststk")))
							.cutoff$or(S0T1.stk_id_typ.eq(bind("rnt_rcv")))
							.cutoff$or(S0T1.stk_id_typ.eq(bind("accpt_dfct")))
							.cutoff$or(S0T1.stk_id_typ.eq(bind("ncv_rcv")))
							.cutoff$or(S0T1.stk_id_typ.eq(bind("onr_prov")))
						)
						.and(
							value(0).eq(value(0))
							.cutoff$and(S0T1.sno1.like(bind("sno1")))
							.cutoff$or(S0T1.sno1.eq(bind("sno1_expt_val")))
						)
						.and(
							value(0).eq(value(0))
							.cutoff$and(S0T1.sno2.like(bind("sno2")))
							.cutoff$or(S0T1.sno2.eq(bind("sno2_expt_val")))
						)
						.and(
							value(0).eq(value(0))
							.cutoff$and(S0T1.sno3.like(bind("sno3")))
							.cutoff$or(S0T1.sno3.eq(bind("sno3_expt_val")))
						)
						.and(
							value(0).eq(value(0))
							.cutoff$and(S0T1.sno4.like(bind("sno4")))
							.cutoff$or(S0T1.sno4.eq(bind("sno4_expt_val")))
						)
						.cutoff$and(S0T1.itm_cd.like(bind("itm_cd")))
						.cutoff$and(S0T1.itm_sub1.like(bind("itm_sub1")))
						.cutoff$and(S0T1.itm_sub2.like(bind("itm_sub2")))
						.cutoff$and(S0T1.itm_sub3.like(bind("itm_sub3")))
						.cutoff$and(
							coalesce(
								S0M19.itm_nm,
								S0M6.itm_nm
							).like(bind("itm_nm"))
						)
						.cutoff$and(S0T1.lot_no.like(bind("lot_no")))
						.cutoff$and(S0T1.sublot_no.like(bind("sublot_no")))
						.cutoff$and(S0M6.itm_typ.like(bind("itm_typ")))
						.cutoff$and(S0M6.itm_typ_d_cd.like(bind("itm_typ_d_cd")))
						.cutoff$and(S0M7.itm_typ_d_nm.like(bind("itm_typ_d_nm")))
						.cutoff$and(S0T3.wrk_no.like(bind("wrk_no")))
						.cutoff$and(S0M11.wrk_nm.like(bind("wrk_nm")))
						.cutoff$and(S0M1.wg_cd.like(bind("wg_cd")))
						.cutoff$and(S0M1.wg_nm.like(bind("wg_nm")))
						.cutoff$and(S0M2.loc_grp_cd.like(bind("loc_grp_cd")))
						.cutoff$and(S0M2.loc_grp_nm.like(bind("loc_grp_nm")))
						.cutoff$and(S0M8.site_cd.like(bind("site_cd")))
						.cutoff$and(S0M8.site_nm.like(bind("site_nm")))
						.cutoff$and(S0M9.lg_grp_cd.like(bind("lg_grp_cd")))
						.cutoff$and(S0M9.lg_grp_nm.like(bind("lg_grp_nm")))
						.cutoff$and(S0M10.alloc_grp_cd.like(bind("alloc_grp_cd")))
						.cutoff$and(S0M10.alloc_grp_nm.like(bind("alloc_grp_nm")))
						.cutoff$and(S0T1.loc_cd.like(bind("loc_cd")))
						.cutoff$and(S0M3.loc_nm.like(bind("loc_nm")))
						.cutoff$and(S0T1.str_ln_cd.like(bind("str_ln_cd")))
						.cutoff$and(S0M4.str_ln_nm.like(bind("str_ln_nm")))
						.cutoff$and(S0T1.stk_arrv_bp_cd.like(bind("stk_arrv_bp_cd")))
						.cutoff$and(S0M5.bp_nm.like(bind("stk_arrv_bp_nm")))
						.cutoff$and(S0T1.gd_cd.like(bind("gd_cd")))
						.cutoff$and(S0M12.gd_nm.like(bind("gd_nm")))
						.cutoff$and(S0T1.stk_bp_cd.like(bind("stk_bp_cd")))
						.cutoff$and(S0M13.bp_nm.like(bind("stk_bp_nm")))
						.cutoff$and(S0T1.asst_typ.like(bind("asst_typ")))
						.cutoff$and(S0T1.fix_no_typ.like(bind("fix_no_typ")))
						.cutoff$and(S0T1.fix_no.like(bind("fix_no")))
						.addDynamicPredicate(DS0C_ITM_GRP)
						.addDynamicPredicate(REP_ITM)
						.addDynamicPredicate(REP_LOC)
					)
					.union(
						subQuery()
						.select(
							S1T1.itm_cd,
							S1T1.itm_sub1,
							S1T1.itm_sub2,
							S1T1.itm_sub3,
							S1M6.itm_nm,
							S1M19.itm_nm.as("sundry_itm_nm"),
							S1T1.sno1,
							S1T1.sno2,
							S1T1.sno3,
							S1T1.sno4,
							S1M1.wg_cd,
							S1M1.wg_nm,
							S1T1.lot_no,
							S1T1.sublot_no,
							S1T1.loc_cd,
							S1M3.loc_nm,
							S1T1.str_ln_cd,
							S1M4.str_ln_nm,
							S1M8.site_cd,
							S1M8.site_nm,
							S1M9.lg_grp_cd,
							S1M9.lg_grp_nm,
							S1M10.alloc_grp_cd,
							S1M10.alloc_grp_nm,
							S1M2.loc_grp_cd,
							S1M2.loc_grp_nm,
							S1T1.gd_cd,
							S1M12.gd_nm,
							S1T3.wrk_no,
							S1M11.wrk_nm,
							S1T1.stk_bp_cd,
							S1M13.bp_nm.as("stk_bp_nm"),
							S1T1.stk_arrv_bp_cd,
							S1M5.bp_nm.as("stk_arrv_bp_nm"),
							S1T1.pack_unit_cd,
							S1M14.unit_nm.as("pack_unit_nm"),
							S1T1.base_unit_cd,
							S1M15.unit_nm.as("base_unit_nm"),
							S1M6.cont_fctr_unit_cd,
							S1M16.unit_nm.as("cont_fctr_unit_nm"),
							S1M6.cont_fctr_rnd_typ,
							S1M6.cont_fctr_dec_place
						)
						.from(
							S1T1
							.innerJoin(S1M0).on(S1M0.loc_cd.eq(S1T1.loc_cd))
							.leftOuterJoin(S1T3).on(S1T3.sno1.eq(S1T1.sno1))
							.leftOuterJoin(S1M1).on(S1M1.wg_cd.eq(S1M0.wg_cd))
							.leftOuterJoin(S1M2).on(S1M2.loc_grp_cd.eq(S1M0.loc_grp_cd))
							.leftOuterJoin(S1M3).on(S1T1.loc_cd.eq(S1M3.loc_cd))
							.leftOuterJoin(S1M4).on(
								S1T1.loc_cd.eq(S1M4.loc_cd)
								.and(S1T1.str_ln_cd.eq(S1M4.str_ln_cd))
							)
							.leftOuterJoin(S1M5).on(S1T1.stk_arrv_bp_cd.eq(S1M5.bp_cd))
							.leftOuterJoin(S1M6).on(
								S1T1.itm_cd.eq(S1M6.itm_cd)
								.and(S1T1.itm_sub1.eq(S1M6.itm_sub1))
								.and(S1T1.itm_sub2.eq(S1M6.itm_sub2))
								.and(S1T1.itm_sub3.eq(S1M6.itm_sub3))
							)
							.leftOuterJoin(S1M7).on(
								S1M6.itm_typ.eq(S1M7.itm_typ)
								.and(S1M6.itm_typ_d_cd.eq(S1M7.itm_typ_d_cd))
							)
							.leftOuterJoin(S1M8).on(S1M8.site_cd.eq(S1M0.site_cd))
							.leftOuterJoin(S1M9).on(S1M9.lg_grp_cd.eq(S1M0.lg_grp_cd))
							.leftOuterJoin(S1M10).on(S1M10.alloc_grp_cd.eq(S1M0.alloc_grp_cd))
							.leftOuterJoin(S1M11).on(S1T3.wrk_no.eq(S1M11.wrk_no))
							.leftOuterJoin(S1M12).on(S1T1.gd_cd.eq(S1M12.gd_cd))
							.leftOuterJoin(S1M13).on(S1T1.stk_bp_cd.eq(S1M13.bp_cd))
							.leftOuterJoin(S1M14).on(S1T1.pack_unit_cd.eq(S1M14.unit_cd))
							.leftOuterJoin(S1M15).on(S1T1.base_unit_cd.eq(S1M15.unit_cd))
							.leftOuterJoin(S1M16).on(S1M6.cont_fctr_unit_cd.eq(S1M16.unit_cd))
							.leftOuterJoin(S1M19).on(
								S1T1.itm_cd.eq(S1M19.itm_cd)
								.and(S1T1.itm_sub1.eq(S1M19.itm_sub1))
								.and(S1T1.itm_sub2.eq(S1M19.itm_sub2))
								.and(S1T1.itm_sub3.eq(S1M19.itm_sub3))
								.and(S1T1.sno1.eq(S1M19.sno1))
								.and(S1T1.sno2.eq(S1M19.sno2))
								.and(S1T1.sno3.eq(S1M19.sno3))
								.and(S1T1.sno4.eq(S1M19.sno4))
							)
							.addDynamicView(DS1C_ITM_GRP)
						)
						.where(
							value(0).eq(value(0))
							.and(
								value(1).eq(value(0))
								.cutoff$or(S1T1.quality_typ.eq(bind("good")))
								.cutoff$or(S1T1.quality_typ.eq(bind("dfct_oper")))
								.cutoff$or(S1T1.quality_typ.eq(bind("dfct_insp")))
								.cutoff$or(S1T1.quality_typ.eq(bind("sspnd")))
							)
							.and(
								value(1).eq(value(0))
								.cutoff$or(S1T1.stk_id_typ.eq(bind("costk")))
								.cutoff$or(S1T1.stk_id_typ.eq(bind("rtn_pre_accpt")))
								.cutoff$or(S1T1.stk_id_typ.eq(bind("cststk")))
								.cutoff$or(S1T1.stk_id_typ.eq(bind("rnt_rcv")))
								.cutoff$or(S1T1.stk_id_typ.eq(bind("purc_pre_accpt")))
								.cutoff$or(S1T1.stk_id_typ.eq(bind("accpt_dfct")))
								.cutoff$or(S1T1.stk_id_typ.eq(bind("ncv_rcv")))
								.cutoff$or(S1T1.stk_id_typ.eq(bind("onr_prov")))
							)
							.and(
								value(0).eq(value(0))
								.cutoff$and(S1T1.sno1.like(bind("sno1")))
								.cutoff$or(S1T1.sno1.eq(bind("sno1_expt_val")))
							)
							.and(
								value(0).eq(value(0))
								.cutoff$and(S1T1.sno2.like(bind("sno2")))
								.cutoff$or(S1T1.sno2.eq(bind("sno2_expt_val")))
							)
							.and(
								value(0).eq(value(0))
								.cutoff$and(S1T1.sno3.like(bind("sno3")))
								.cutoff$or(S1T1.sno3.eq(bind("sno3_expt_val")))
							)
							.and(
								value(0).eq(value(0))
								.cutoff$and(S1T1.sno4.like(bind("sno4")))
								.cutoff$or(S1T1.sno4.eq(bind("sno4_expt_val")))
							)
							.cutoff$and(S1T1.itm_cd.like(bind("itm_cd")))
							.cutoff$and(S1T1.itm_sub1.like(bind("itm_sub1")))
							.cutoff$and(S1T1.itm_sub2.like(bind("itm_sub2")))
							.cutoff$and(S1T1.itm_sub3.like(bind("itm_sub3")))
							.cutoff$and(S1M6.itm_nm.like(bind("itm_nm")))
							.cutoff$and(S1T1.lot_no.like(bind("lot_no")))
							.cutoff$and(S1T1.sublot_no.like(bind("sublot_no")))
							.cutoff$and(S1M6.itm_typ.like(bind("itm_typ")))
							.cutoff$and(S1M6.itm_typ_d_cd.like(bind("itm_typ_d_cd")))
							.cutoff$and(S1M7.itm_typ_d_nm.like(bind("itm_typ_d_nm")))
							.cutoff$and(S1T3.wrk_no.like(bind("wrk_no")))
							.cutoff$and(S1M11.wrk_nm.like(bind("wrk_nm")))
							.cutoff$and(S1M1.wg_cd.like(bind("wg_cd")))
							.cutoff$and(S1M1.wg_nm.like(bind("wg_nm")))
							.cutoff$and(S1M2.loc_grp_cd.like(bind("loc_grp_cd")))
							.cutoff$and(S1M2.loc_grp_nm.like(bind("loc_grp_nm")))
							.cutoff$and(S1M8.site_cd.like(bind("site_cd")))
							.cutoff$and(S1M8.site_nm.like(bind("site_nm")))
							.cutoff$and(S1M9.lg_grp_cd.like(bind("lg_grp_cd")))
							.cutoff$and(S1M9.lg_grp_nm.like(bind("lg_grp_nm")))
							.cutoff$and(S1M10.alloc_grp_cd.like(bind("alloc_grp_cd")))
							.cutoff$and(S1M10.alloc_grp_nm.like(bind("alloc_grp_nm")))
							.cutoff$and(S1T1.loc_cd.like(bind("loc_cd")))
							.cutoff$and(S1M3.loc_nm.like(bind("loc_nm")))
							.cutoff$and(S1T1.str_ln_cd.like(bind("str_ln_cd")))
							.cutoff$and(S1M4.str_ln_nm.like(bind("str_ln_nm")))
							.cutoff$and(S1T1.stk_arrv_bp_cd.like(bind("stk_arrv_bp_cd")))
							.cutoff$and(S1M5.bp_nm.like(bind("stk_arrv_bp_nm")))
							.cutoff$and(S1T1.gd_cd.like(bind("gd_cd")))
							.cutoff$and(S1M12.gd_nm.like(bind("gd_nm")))
							.cutoff$and(S1T1.stk_bp_cd.like(bind("stk_bp_cd")))
							.cutoff$and(S1M13.bp_nm.like(bind("stk_bp_nm")))
							.cutoff$and(S1T1.asst_typ.like(bind("asst_typ")))
							.cutoff$and(value(MSC_FIX_NO_TYP.NON.value()).like(bind("fix_no_typ")))
							.cutoff$and(value(MAC_STR.NULL_VAL.value()).like(bind("fix_no")))
							.addDynamicPredicate(DS1C_ITM_GRP)
							.addDynamicPredicate(REP_ITM)
							.addDynamicPredicate(REP_LOC)
						)
					)
			)
			.setDynamicSQLInfo(
					when(boundOr("itm_grp_flg1"))
						.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0MM1).on(S0M6.itm_grp_cd1.eq(S0MM1.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP1.value()).eq(S0MM1.itm_grp_typ))))
						.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0M6.itm_grp_cd1.like(bind("itm_grp_cd1"))).cutoff$and(S0MM1.itm_grp_nm.like(bind("itm_grp_nm1")))),
					when(boundOr("itm_grp_flg2"))
						.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0MM2).on(S0M6.itm_grp_cd2.eq(S0MM2.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP2.value()).eq(S0MM2.itm_grp_typ))))
						.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0M6.itm_grp_cd2.like(bind("itm_grp_cd2"))).cutoff$and(S0MM2.itm_grp_nm.like(bind("itm_grp_nm2")))),
					when(boundOr("itm_grp_flg3"))
						.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0MM3).on(S0M6.itm_grp_cd3.eq(S0MM3.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP3.value()).eq(S0MM3.itm_grp_typ))))
						.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0M6.itm_grp_cd3.like(bind("itm_grp_cd3"))).cutoff$and(S0MM3.itm_grp_nm.like(bind("itm_grp_nm3")))),
					when(boundOr("itm_grp_flg4"))
						.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0MM4).on(S0M6.itm_grp_cd4.eq(S0MM4.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP4.value()).eq(S0MM4.itm_grp_typ))))
						.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0M6.itm_grp_cd4.like(bind("itm_grp_cd4"))).cutoff$and(S0MM4.itm_grp_nm.like(bind("itm_grp_nm4")))),
					when(boundOr("itm_grp_flg5"))
						.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0MM5).on(S0M6.itm_grp_cd5.eq(S0MM5.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP5.value()).eq(S0MM5.itm_grp_typ))))
						.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0M6.itm_grp_cd5.like(bind("itm_grp_cd5"))).cutoff$and(S0MM5.itm_grp_nm.like(bind("itm_grp_nm5")))),
					when(boundOr("itm_grp_flg6"))
						.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0MM6).on(S0M6.itm_grp_cd6.eq(S0MM6.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP6.value()).eq(S0MM6.itm_grp_typ))))
						.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0M6.itm_grp_cd6.like(bind("itm_grp_cd6"))).cutoff$and(S0MM6.itm_grp_nm.like(bind("itm_grp_nm6")))),
					when(boundOr("itm_grp_flg7"))
						.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0MM7).on(S0M6.itm_grp_cd7.eq(S0MM7.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP7.value()).eq(S0MM7.itm_grp_typ))))
						.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0M6.itm_grp_cd7.like(bind("itm_grp_cd7"))).cutoff$and(S0MM7.itm_grp_nm.like(bind("itm_grp_nm7")))),
					when(boundOr("itm_grp_flg8"))
						.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0MM8).on(S0M6.itm_grp_cd8.eq(S0MM8.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP8.value()).eq(S0MM8.itm_grp_typ))))
						.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0M6.itm_grp_cd8.like(bind("itm_grp_cd8"))).cutoff$and(S0MM8.itm_grp_nm.like(bind("itm_grp_nm8")))),
					when(boundOr("itm_grp_flg9"))
						.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0MM9).on(S0M6.itm_grp_cd9.eq(S0MM9.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP9.value()).eq(S0MM9.itm_grp_typ))))
						.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0M6.itm_grp_cd9.like(bind("itm_grp_cd9"))).cutoff$and(S0MM9.itm_grp_nm.like(bind("itm_grp_nm9")))),
					when(boundOr("itm_grp_flg10"))
						.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0MM10).on(S0M6.itm_grp_cd10.eq(S0MM10.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP10.value()).eq(S0MM10.itm_grp_typ))))
						.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0M6.itm_grp_cd10.like(bind("itm_grp_cd10"))).cutoff$and(S0MM10.itm_grp_nm.like(bind("itm_grp_nm10")))),
					when(boundOr("itm_grp_flg1"))
						.view(DS1C_ITM_GRP, v -> v.leftOuterJoin(S1MM1).on(S1M6.itm_grp_cd1.eq(S1MM1.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP1.value()).eq(S1MM1.itm_grp_typ))))
						.predicate(DS1C_ITM_GRP, p -> p.cutoff$and(S1M6.itm_grp_cd1.like(bind("itm_grp_cd1"))).cutoff$and(S1MM1.itm_grp_nm.like(bind("itm_grp_nm1")))),
					when(boundOr("itm_grp_flg2"))
						.view(DS1C_ITM_GRP, v -> v.leftOuterJoin(S1MM2).on(S1M6.itm_grp_cd2.eq(S1MM2.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP2.value()).eq(S1MM2.itm_grp_typ))))
						.predicate(DS1C_ITM_GRP, p -> p.cutoff$and(S1M6.itm_grp_cd2.like(bind("itm_grp_cd2"))).cutoff$and(S1MM2.itm_grp_nm.like(bind("itm_grp_nm2")))),
					when(boundOr("itm_grp_flg3"))
						.view(DS1C_ITM_GRP, v -> v.leftOuterJoin(S1MM3).on(S1M6.itm_grp_cd3.eq(S1MM3.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP3.value()).eq(S1MM3.itm_grp_typ))))
						.predicate(DS1C_ITM_GRP, p -> p.cutoff$and(S1M6.itm_grp_cd3.like(bind("itm_grp_cd3"))).cutoff$and(S1MM3.itm_grp_nm.like(bind("itm_grp_nm3")))),
					when(boundOr("itm_grp_flg4"))
						.view(DS1C_ITM_GRP, v -> v.leftOuterJoin(S1MM4).on(S1M6.itm_grp_cd4.eq(S1MM4.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP4.value()).eq(S1MM4.itm_grp_typ))))
						.predicate(DS1C_ITM_GRP, p -> p.cutoff$and(S1M6.itm_grp_cd4.like(bind("itm_grp_cd4"))).cutoff$and(S1MM4.itm_grp_nm.like(bind("itm_grp_nm4")))),
					when(boundOr("itm_grp_flg5"))
						.view(DS1C_ITM_GRP, v -> v.leftOuterJoin(S1MM5).on(S1M6.itm_grp_cd5.eq(S1MM5.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP5.value()).eq(S1MM5.itm_grp_typ))))
						.predicate(DS1C_ITM_GRP, p -> p.cutoff$and(S1M6.itm_grp_cd5.like(bind("itm_grp_cd5"))).cutoff$and(S1MM5.itm_grp_nm.like(bind("itm_grp_nm5")))),
					when(boundOr("itm_grp_flg6"))
						.view(DS1C_ITM_GRP, v -> v.leftOuterJoin(S1MM6).on(S1M6.itm_grp_cd6.eq(S1MM6.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP6.value()).eq(S1MM6.itm_grp_typ))))
						.predicate(DS1C_ITM_GRP, p -> p.cutoff$and(S1M6.itm_grp_cd6.like(bind("itm_grp_cd6"))).cutoff$and(S1MM6.itm_grp_nm.like(bind("itm_grp_nm6")))),
					when(boundOr("itm_grp_flg7"))
						.view(DS1C_ITM_GRP, v -> v.leftOuterJoin(S1MM7).on(S1M6.itm_grp_cd7.eq(S1MM7.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP7.value()).eq(S1MM7.itm_grp_typ))))
						.predicate(DS1C_ITM_GRP, p -> p.cutoff$and(S1M6.itm_grp_cd7.like(bind("itm_grp_cd7"))).cutoff$and(S1MM7.itm_grp_nm.like(bind("itm_grp_nm7")))),
					when(boundOr("itm_grp_flg8"))
						.view(DS1C_ITM_GRP, v -> v.leftOuterJoin(S1MM8).on(S1M6.itm_grp_cd8.eq(S1MM8.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP8.value()).eq(S1MM8.itm_grp_typ))))
						.predicate(DS1C_ITM_GRP, p -> p.cutoff$and(S1M6.itm_grp_cd8.like(bind("itm_grp_cd8"))).cutoff$and(S1MM8.itm_grp_nm.like(bind("itm_grp_nm8")))),
					when(boundOr("itm_grp_flg9"))
						.view(DS1C_ITM_GRP, v -> v.leftOuterJoin(S1MM9).on(S1M6.itm_grp_cd9.eq(S1MM9.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP9.value()).eq(S1MM9.itm_grp_typ))))
						.predicate(DS1C_ITM_GRP, p -> p.cutoff$and(S1M6.itm_grp_cd9.like(bind("itm_grp_cd9"))).cutoff$and(S1MM9.itm_grp_nm.like(bind("itm_grp_nm9")))),
					when(boundOr("itm_grp_flg10"))
						.view(DS1C_ITM_GRP, v -> v.leftOuterJoin(S1MM10).on(S1M6.itm_grp_cd10.eq(S1MM10.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP10.value()).eq(S1MM10.itm_grp_typ))))
						.predicate(DS1C_ITM_GRP, p -> p.cutoff$and(S1M6.itm_grp_cd10.like(bind("itm_grp_cd10"))).cutoff$and(S1MM10.itm_grp_nm.like(bind("itm_grp_nm10"))))
			);
	}

	/**
	 * -- MSBCL1060_MSW_ALLOC_ITM_Query_I01
	 */
	static MCQueryPlan MSBCL1060_MSW_ALLOC_ITM_I01() {
		MSW_ALLOC_ITM_R S0 = MSW_ALLOC_ITM_R.create();
		MSVT_AVL_STK_R S1T1 = MSVT_AVL_STK_R.create("T1");
		MAVM_RD_LOC_R S1M0 = MAVM_RD_LOC_R.create("M0");
		MSVT_WRK_SNO_R S1T3 = MSVT_WRK_SNO_R.create("T3");
		MAM_WG_R S1M1 = MAM_WG_R.create("M1");
		MAM_LOC_GRP_R S1M2 = MAM_LOC_GRP_R.create("M2");
		MAM_LOC_R S1M3 = MAM_LOC_R.create("M3");
		MAM_ITM_R S1M6 = MAM_ITM_R.create("M6");
		MAM_ITM_TYP_D_R S1M7 = MAM_ITM_TYP_D_R.create("M7");
		MAM_SITE_R S1M8 = MAM_SITE_R.create("M8");
		MAM_LG_GRP_R S1M9 = MAM_LG_GRP_R.create("M9");
		MAM_ALLOC_GRP_R S1M10 = MAM_ALLOC_GRP_R.create("M10");
		MST_WRK_R S1M11 = MST_WRK_R.create("M11");
		MAM_STK_GD_R S1M12 = MAM_STK_GD_R.create("M12");
		MAM_BP_R S1M13 = MAM_BP_R.create("M13");
		MAM_UNIT_R S1M14 = MAM_UNIT_R.create("M14");
		MAM_SUNDRY_ITM_R S1M19 = MAM_SUNDRY_ITM_R.create("M19");
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
		MSVT_AVL_IO_SCHD_R S2T1 = MSVT_AVL_IO_SCHD_R.create("T1");
		MAVM_RD_LOC_R S2M0 = MAVM_RD_LOC_R.create("M0");
		MSVT_WRK_SNO_R S2T3 = MSVT_WRK_SNO_R.create("T3");
		MAM_WG_R S2M1 = MAM_WG_R.create("M1");
		MAM_LOC_GRP_R S2M2 = MAM_LOC_GRP_R.create("M2");
		MAM_LOC_R S2M3 = MAM_LOC_R.create("M3");
		MAM_ITM_R S2M6 = MAM_ITM_R.create("M6");
		MAM_ITM_TYP_D_R S2M7 = MAM_ITM_TYP_D_R.create("M7");
		MAM_SITE_R S2M8 = MAM_SITE_R.create("M8");
		MAM_LG_GRP_R S2M9 = MAM_LG_GRP_R.create("M9");
		MAM_ALLOC_GRP_R S2M10 = MAM_ALLOC_GRP_R.create("M10");
		MST_WRK_R S2M11 = MST_WRK_R.create("M11");
		MAM_STK_GD_R S2M12 = MAM_STK_GD_R.create("M12");
		MAM_BP_R S2M13 = MAM_BP_R.create("M13");
		MAM_UNIT_R S2M14 = MAM_UNIT_R.create("M14");
		MAM_SUNDRY_ITM_R S2M19 = MAM_SUNDRY_ITM_R.create("M19");
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
		MCDynamicSQLID REP_ITM = createDynamicSQLID("REP_ITM");
		MCDynamicSQLID REP_LOC = createDynamicSQLID("REP_LOC");

		
		return createQueryPlan()
			.setQuery(
				sql("MSBCL1060_MSW_ALLOC_ITM_Query_I01")
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
							S1T1.itm_cd,
							S1T1.itm_sub1,
							S1T1.itm_sub2,
							S1T1.itm_sub3,
							S1T1.sno1,
							S1T1.sno2,
							S1T1.sno3,
							S1T1.sno4,
							S1T1.gd_cd,
							S1T1.in_xfr_typ,
							S1T1.quality_typ,
							S1T1.stk_insp_typ,
							S1T1.stk_id_typ,
							S1T1.stk_bp_cd
						)
						.from(
							S1T1
							.innerJoin(S1M0).on(S1M0.loc_cd.eq(S1T1.loc_cd))
							.leftOuterJoin(S1T3).on(S1T3.sno1.eq(S1T1.sno1))
							.leftOuterJoin(S1M1).on(S1M1.wg_cd.eq(S1M0.wg_cd))
							.leftOuterJoin(S1M2).on(S1M2.loc_grp_cd.eq(S1M0.loc_grp_cd))
							.leftOuterJoin(S1M3).on(S1T1.loc_cd.eq(S1M3.loc_cd))
							.leftOuterJoin(S1M6).on(
								S1T1.itm_cd.eq(S1M6.itm_cd)
								.and(S1T1.itm_sub1.eq(S1M6.itm_sub1))
								.and(S1T1.itm_sub2.eq(S1M6.itm_sub2))
								.and(S1T1.itm_sub3.eq(S1M6.itm_sub3))
							)
							.leftOuterJoin(S1M7).on(
								S1M6.itm_typ.eq(S1M7.itm_typ)
								.and(S1M6.itm_typ_d_cd.eq(S1M7.itm_typ_d_cd))
							)
							.leftOuterJoin(S1M8).on(S1M8.site_cd.eq(S1M0.site_cd))
							.leftOuterJoin(S1M9).on(S1M9.lg_grp_cd.eq(S1M0.lg_grp_cd))
							.leftOuterJoin(S1M10).on(S1M10.alloc_grp_cd.eq(S1M0.alloc_grp_cd))
							.leftOuterJoin(S1M11).on(S1T3.wrk_no.eq(S1M11.wrk_no))
							.leftOuterJoin(S1M12).on(S1T1.gd_cd.eq(S1M12.gd_cd))
							.leftOuterJoin(S1M13).on(S1T1.stk_bp_cd.eq(S1M13.bp_cd))
							.leftOuterJoin(S1M14).on(S1T1.pack_unit_cd.eq(S1M14.unit_cd))
							.leftOuterJoin(S1M19).on(
								S1T1.itm_cd.eq(S1M19.itm_cd)
								.and(S1T1.itm_sub1.eq(S1M19.itm_sub1))
								.and(S1T1.itm_sub2.eq(S1M19.itm_sub2))
								.and(S1T1.itm_sub3.eq(S1M19.itm_sub3))
								.and(S1T1.sno1.eq(S1M19.sno1))
								.and(S1T1.sno2.eq(S1M19.sno2))
								.and(S1T1.sno3.eq(S1M19.sno3))
								.and(S1T1.sno4.eq(S1M19.sno4))
							)
							.addDynamicView(DS0C_ITM_GRP)
						)
						.where(
							value(0).eq(value(0))
							.and(
								value(1).eq(value(0))
								.cutoff$or(S1T1.quality_typ.eq(bind("good")))
								.cutoff$or(S1T1.quality_typ.eq(bind("dfct_oper")))
								.cutoff$or(S1T1.quality_typ.eq(bind("dfct_insp")))
								.cutoff$or(S1T1.quality_typ.eq(bind("sspnd")))
							)
							.and(
								value(1).eq(value(0))
								.cutoff$or(S1T1.stk_id_typ.eq(bind("costk")))
								.cutoff$or(S1T1.stk_id_typ.eq(bind("cststk")))
								.cutoff$or(S1T1.stk_id_typ.eq(bind("rnt_rcv")))
								.cutoff$or(S1T1.stk_id_typ.eq(bind("accpt_dfct")))
								.cutoff$or(S1T1.stk_id_typ.eq(bind("ncv_rcv")))
								.cutoff$or(S1T1.stk_id_typ.eq(bind("onr_prov")))
							)
							.and(
								value(0).eq(value(0))
								.cutoff$and(S1T1.sno1.like(bind("sno1")))
								.cutoff$or(S1T1.sno1.eq(bind("sno1_expt_val")))
							)
							.and(
								value(0).eq(value(0))
								.cutoff$and(S1T1.sno2.like(bind("sno2")))
								.cutoff$or(S1T1.sno2.eq(bind("sno2_expt_val")))
							)
							.and(
								value(0).eq(value(0))
								.cutoff$and(S1T1.sno3.like(bind("sno3")))
								.cutoff$or(S1T1.sno3.eq(bind("sno3_expt_val")))
							)
							.and(
								value(0).eq(value(0))
								.cutoff$and(S1T1.sno4.like(bind("sno4")))
								.cutoff$or(S1T1.sno4.eq(bind("sno4_expt_val")))
							)
							.cutoff$and(S1T1.itm_cd.like(bind("itm_cd")))
							.cutoff$and(S1T1.itm_sub1.like(bind("itm_sub1")))
							.cutoff$and(S1T1.itm_sub2.like(bind("itm_sub2")))
							.cutoff$and(S1T1.itm_sub3.like(bind("itm_sub3")))
							.cutoff$and(
								coalesce(
									S1M19.itm_nm,
									S1M6.itm_nm
								).like(bind("itm_nm"))
							)
							.cutoff$and(S1T1.lot_no.like(bind("lot_no")))
							.cutoff$and(S1T1.sublot_no.like(bind("sublot_no")))
							.cutoff$and(S1M6.itm_typ.like(bind("itm_typ")))
							.cutoff$and(S1M6.itm_typ_d_cd.like(bind("itm_typ_d_cd")))
							.cutoff$and(S1M7.itm_typ_d_nm.like(bind("itm_typ_d_nm")))
							.cutoff$and(S1T3.wrk_no.like(bind("wrk_no")))
							.cutoff$and(S1M11.wrk_nm.like(bind("wrk_nm")))
							.cutoff$and(S1M1.wg_cd.like(bind("wg_cd")))
							.cutoff$and(S1M1.wg_nm.like(bind("wg_nm")))
							.cutoff$and(S1M2.loc_grp_cd.like(bind("loc_grp_cd")))
							.cutoff$and(S1M2.loc_grp_nm.like(bind("loc_grp_nm")))
							.cutoff$and(S1M8.site_cd.like(bind("site_cd")))
							.cutoff$and(S1M8.site_nm.like(bind("site_nm")))
							.cutoff$and(S1M9.lg_grp_cd.like(bind("lg_grp_cd")))
							.cutoff$and(S1M9.lg_grp_nm.like(bind("lg_grp_nm")))
							.cutoff$and(S1M10.alloc_grp_cd.like(bind("alloc_grp_cd")))
							.cutoff$and(S1M10.alloc_grp_nm.like(bind("alloc_grp_nm")))
							.cutoff$and(S1T1.loc_cd.like(bind("loc_cd")))
							.cutoff$and(S1M3.loc_nm.like(bind("loc_nm")))
							.cutoff$and(S1T1.gd_cd.like(bind("gd_cd")))
							.cutoff$and(S1M12.gd_nm.like(bind("gd_nm")))
							.cutoff$and(S1T1.stk_bp_cd.like(bind("stk_bp_cd")))
							.cutoff$and(S1M13.bp_nm.like(bind("stk_bp_nm")))
							.cutoff$and(S1T1.asst_typ.like(bind("asst_typ")))
							.cutoff$and(S1T1.fix_no_typ.like(bind("fix_no_typ")))
							.cutoff$and(S1T1.fix_no.like(bind("fix_no")))
							.addDynamicPredicate(DS0C_ITM_GRP)
							.addDynamicPredicate(REP_ITM)
							.addDynamicPredicate(REP_LOC)
						)
						.union(
							subQuery()
							.select(
								S2T1.itm_cd,
								S2T1.itm_sub1,
								S2T1.itm_sub2,
								S2T1.itm_sub3,
								S2T1.sno1,
								S2T1.sno2,
								S2T1.sno3,
								S2T1.sno4,
								S2T1.gd_cd,
								S2T1.in_xfr_typ,
								S2T1.quality_typ,
								S2T1.stk_insp_typ,
								S2T1.stk_id_typ,
								S2T1.stk_bp_cd
							)
							.from(
								S2T1
								.innerJoin(S2M0).on(S2M0.loc_cd.eq(S2T1.loc_cd))
								.leftOuterJoin(S2T3).on(S2T3.sno1.eq(S2T1.sno1))
								.leftOuterJoin(S2M1).on(S2M1.wg_cd.eq(S2M0.wg_cd))
								.leftOuterJoin(S2M2).on(S2M2.loc_grp_cd.eq(S2M0.loc_grp_cd))
								.leftOuterJoin(S2M3).on(S2T1.loc_cd.eq(S2M3.loc_cd))
								.leftOuterJoin(S2M6).on(
									S2T1.itm_cd.eq(S2M6.itm_cd)
									.and(S2T1.itm_sub1.eq(S2M6.itm_sub1))
									.and(S2T1.itm_sub2.eq(S2M6.itm_sub2))
									.and(S2T1.itm_sub3.eq(S2M6.itm_sub3))
								)
								.leftOuterJoin(S2M7).on(
									S2M6.itm_typ.eq(S2M7.itm_typ)
									.and(S2M6.itm_typ_d_cd.eq(S2M7.itm_typ_d_cd))
								)
								.leftOuterJoin(S2M8).on(S2M8.site_cd.eq(S2M0.site_cd))
								.leftOuterJoin(S2M9).on(S2M9.lg_grp_cd.eq(S2M0.lg_grp_cd))
								.leftOuterJoin(S2M10).on(S2M10.alloc_grp_cd.eq(S2M0.alloc_grp_cd))
								.leftOuterJoin(S2M11).on(S2T3.wrk_no.eq(S2M11.wrk_no))
								.leftOuterJoin(S2M12).on(S2T1.gd_cd.eq(S2M12.gd_cd))
								.leftOuterJoin(S2M13).on(S2T1.stk_bp_cd.eq(S2M13.bp_cd))
								.leftOuterJoin(S2M14).on(S2T1.pack_unit_cd.eq(S2M14.unit_cd))
								.leftOuterJoin(S2M19).on(
									S2T1.itm_cd.eq(S2M19.itm_cd)
									.and(S2T1.itm_sub1.eq(S2M19.itm_sub1))
									.and(S2T1.itm_sub2.eq(S2M19.itm_sub2))
									.and(S2T1.itm_sub3.eq(S2M19.itm_sub3))
									.and(S2T1.sno1.eq(S2M19.sno1))
									.and(S2T1.sno2.eq(S2M19.sno2))
									.and(S2T1.sno3.eq(S2M19.sno3))
									.and(S2T1.sno4.eq(S2M19.sno4))
								)
								.addDynamicView(DS1C_ITM_GRP)
							)
							.where(
								value(0).eq(value(0))
								.and(
									value(1).eq(value(0))
									.cutoff$or(S2T1.quality_typ.eq(bind("good")))
									.cutoff$or(S2T1.quality_typ.eq(bind("dfct_oper")))
									.cutoff$or(S2T1.quality_typ.eq(bind("dfct_insp")))
									.cutoff$or(S2T1.quality_typ.eq(bind("sspnd")))
								)
								.and(
									value(1).eq(value(0))
									.cutoff$or(S2T1.stk_id_typ.eq(bind("costk")))
									.cutoff$or(S2T1.stk_id_typ.eq(bind("rtn_pre_accpt")))
									.cutoff$or(S2T1.stk_id_typ.eq(bind("cststk")))
									.cutoff$or(S2T1.stk_id_typ.eq(bind("rnt_rcv")))
									.cutoff$or(S2T1.stk_id_typ.eq(bind("purc_pre_accpt")))
									.cutoff$or(S2T1.stk_id_typ.eq(bind("accpt_dfct")))
									.cutoff$or(S2T1.stk_id_typ.eq(bind("ncv_rcv")))
									.cutoff$or(S2T1.stk_id_typ.eq(bind("onr_prov")))
								)
								.and(
									value(0).eq(value(0))
									.cutoff$and(S2T1.sno1.like(bind("sno1")))
									.cutoff$or(S2T1.sno1.eq(bind("sno1_expt_val")))
								)
								.and(
									value(0).eq(value(0))
									.cutoff$and(S2T1.sno2.like(bind("sno2")))
									.cutoff$or(S2T1.sno2.eq(bind("sno2_expt_val")))
								)
								.and(
									value(0).eq(value(0))
									.cutoff$and(S2T1.sno3.like(bind("sno3")))
									.cutoff$or(S2T1.sno3.eq(bind("sno3_expt_val")))
								)
								.and(
									value(0).eq(value(0))
									.cutoff$and(S2T1.sno4.like(bind("sno4")))
									.cutoff$or(S2T1.sno4.eq(bind("sno4_expt_val")))
								)
								.cutoff$and(S2T1.itm_cd.like(bind("itm_cd")))
								.cutoff$and(S2T1.itm_sub1.like(bind("itm_sub1")))
								.cutoff$and(S2T1.itm_sub2.like(bind("itm_sub2")))
								.cutoff$and(S2T1.itm_sub3.like(bind("itm_sub3")))
								.cutoff$and(
									coalesce(
										S2M19.itm_nm,
										S2M6.itm_nm
									).like(bind("itm_nm"))
								)
								.cutoff$and(S2T1.lot_no.like(bind("lot_no")))
								.cutoff$and(S2T1.sublot_no.like(bind("sublot_no")))
								.cutoff$and(S2M6.itm_typ.like(bind("itm_typ")))
								.cutoff$and(S2M6.itm_typ_d_cd.like(bind("itm_typ_d_cd")))
								.cutoff$and(S2M7.itm_typ_d_nm.like(bind("itm_typ_d_nm")))
								.cutoff$and(S2T3.wrk_no.like(bind("wrk_no")))
								.cutoff$and(S2M11.wrk_nm.like(bind("wrk_nm")))
								.cutoff$and(S2M1.wg_cd.like(bind("wg_cd")))
								.cutoff$and(S2M1.wg_nm.like(bind("wg_nm")))
								.cutoff$and(S2M2.loc_grp_cd.like(bind("loc_grp_cd")))
								.cutoff$and(S2M2.loc_grp_nm.like(bind("loc_grp_nm")))
								.cutoff$and(S2M8.site_cd.like(bind("site_cd")))
								.cutoff$and(S2M8.site_nm.like(bind("site_nm")))
								.cutoff$and(S2M9.lg_grp_cd.like(bind("lg_grp_cd")))
								.cutoff$and(S2M9.lg_grp_nm.like(bind("lg_grp_nm")))
								.cutoff$and(S2M10.alloc_grp_cd.like(bind("alloc_grp_cd")))
								.cutoff$and(S2M10.alloc_grp_nm.like(bind("alloc_grp_nm")))
								.cutoff$and(S2T1.loc_cd.like(bind("loc_cd")))
								.cutoff$and(S2M3.loc_nm.like(bind("loc_nm")))
								.cutoff$and(S2T1.gd_cd.like(bind("gd_cd")))
								.cutoff$and(S2M12.gd_nm.like(bind("gd_nm")))
								.cutoff$and(S2T1.stk_bp_cd.like(bind("stk_bp_cd")))
								.cutoff$and(S2M13.bp_nm.like(bind("stk_bp_nm")))
								.cutoff$and(S2T1.asst_typ.like(bind("asst_typ")))
								.cutoff$and(value(MSC_FIX_NO_TYP.NON.value()).like(bind("fix_no_typ")))
								.cutoff$and(value(MAC_STR.NULL_VAL.value()).like(bind("fix_no")))
								.addDynamicPredicate(DS1C_ITM_GRP)
								.addDynamicPredicate(REP_ITM)
								.addDynamicPredicate(REP_LOC)
							)
						)
					)
			)
			.setDynamicSQLInfo(
					when(boundOr("itm_grp_flg1"))
						.view(DS1C_ITM_GRP, v -> v.leftOuterJoin(S1MM1).on(S1M6.itm_grp_cd1.eq(S1MM1.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP1.value()).eq(S1MM1.itm_grp_typ))))
						.predicate(DS1C_ITM_GRP, p -> p.cutoff$and(S1M6.itm_grp_cd1.like(bind("itm_grp_cd1"))).cutoff$and(S1MM1.itm_grp_nm.like(bind("itm_grp_nm1")))),
					when(boundOr("itm_grp_flg2"))
						.view(DS1C_ITM_GRP, v -> v.leftOuterJoin(S1MM2).on(S1M6.itm_grp_cd2.eq(S1MM2.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP2.value()).eq(S1MM2.itm_grp_typ))))
						.predicate(DS1C_ITM_GRP, p -> p.cutoff$and(S1M6.itm_grp_cd2.like(bind("itm_grp_cd2"))).cutoff$and(S1MM2.itm_grp_nm.like(bind("itm_grp_nm2")))),
					when(boundOr("itm_grp_flg3"))
						.view(DS1C_ITM_GRP, v -> v.leftOuterJoin(S1MM3).on(S1M6.itm_grp_cd3.eq(S1MM3.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP3.value()).eq(S1MM3.itm_grp_typ))))
						.predicate(DS1C_ITM_GRP, p -> p.cutoff$and(S1M6.itm_grp_cd3.like(bind("itm_grp_cd3"))).cutoff$and(S1MM3.itm_grp_nm.like(bind("itm_grp_nm3")))),
					when(boundOr("itm_grp_flg4"))
						.view(DS1C_ITM_GRP, v -> v.leftOuterJoin(S1MM4).on(S1M6.itm_grp_cd4.eq(S1MM4.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP4.value()).eq(S1MM4.itm_grp_typ))))
						.predicate(DS1C_ITM_GRP, p -> p.cutoff$and(S1M6.itm_grp_cd4.like(bind("itm_grp_cd4"))).cutoff$and(S1MM4.itm_grp_nm.like(bind("itm_grp_nm4")))),
					when(boundOr("itm_grp_flg5"))
						.view(DS1C_ITM_GRP, v -> v.leftOuterJoin(S1MM5).on(S1M6.itm_grp_cd5.eq(S1MM5.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP5.value()).eq(S1MM5.itm_grp_typ))))
						.predicate(DS1C_ITM_GRP, p -> p.cutoff$and(S1M6.itm_grp_cd5.like(bind("itm_grp_cd5"))).cutoff$and(S1MM5.itm_grp_nm.like(bind("itm_grp_nm5")))),
					when(boundOr("itm_grp_flg6"))
						.view(DS1C_ITM_GRP, v -> v.leftOuterJoin(S1MM6).on(S1M6.itm_grp_cd6.eq(S1MM6.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP6.value()).eq(S1MM6.itm_grp_typ))))
						.predicate(DS1C_ITM_GRP, p -> p.cutoff$and(S1M6.itm_grp_cd6.like(bind("itm_grp_cd6"))).cutoff$and(S1MM6.itm_grp_nm.like(bind("itm_grp_nm6")))),
					when(boundOr("itm_grp_flg7"))
						.view(DS1C_ITM_GRP, v -> v.leftOuterJoin(S1MM7).on(S1M6.itm_grp_cd7.eq(S1MM7.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP7.value()).eq(S1MM7.itm_grp_typ))))
						.predicate(DS1C_ITM_GRP, p -> p.cutoff$and(S1M6.itm_grp_cd7.like(bind("itm_grp_cd7"))).cutoff$and(S1MM7.itm_grp_nm.like(bind("itm_grp_nm7")))),
					when(boundOr("itm_grp_flg8"))
						.view(DS1C_ITM_GRP, v -> v.leftOuterJoin(S1MM8).on(S1M6.itm_grp_cd8.eq(S1MM8.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP8.value()).eq(S1MM8.itm_grp_typ))))
						.predicate(DS1C_ITM_GRP, p -> p.cutoff$and(S1M6.itm_grp_cd8.like(bind("itm_grp_cd8"))).cutoff$and(S1MM8.itm_grp_nm.like(bind("itm_grp_nm8")))),
					when(boundOr("itm_grp_flg9"))
						.view(DS1C_ITM_GRP, v -> v.leftOuterJoin(S1MM9).on(S1M6.itm_grp_cd9.eq(S1MM9.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP9.value()).eq(S1MM9.itm_grp_typ))))
						.predicate(DS1C_ITM_GRP, p -> p.cutoff$and(S1M6.itm_grp_cd9.like(bind("itm_grp_cd9"))).cutoff$and(S1MM9.itm_grp_nm.like(bind("itm_grp_nm9")))),
					when(boundOr("itm_grp_flg10"))
						.view(DS1C_ITM_GRP, v -> v.leftOuterJoin(S1MM10).on(S1M6.itm_grp_cd10.eq(S1MM10.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP10.value()).eq(S1MM10.itm_grp_typ))))
						.predicate(DS1C_ITM_GRP, p -> p.cutoff$and(S1M6.itm_grp_cd10.like(bind("itm_grp_cd10"))).cutoff$and(S1MM10.itm_grp_nm.like(bind("itm_grp_nm10")))),
					when(boundOr("itm_grp_flg1"))
						.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S2MM1).on(S2M6.itm_grp_cd1.eq(S2MM1.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP1.value()).eq(S2MM1.itm_grp_typ))))
						.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S2M6.itm_grp_cd1.like(bind("itm_grp_cd1"))).cutoff$and(S2MM1.itm_grp_nm.like(bind("itm_grp_nm1")))),
					when(boundOr("itm_grp_flg2"))
						.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S2MM2).on(S2M6.itm_grp_cd2.eq(S2MM2.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP2.value()).eq(S2MM2.itm_grp_typ))))
						.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S2M6.itm_grp_cd2.like(bind("itm_grp_cd2"))).cutoff$and(S2MM2.itm_grp_nm.like(bind("itm_grp_nm2")))),
					when(boundOr("itm_grp_flg3"))
						.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S2MM3).on(S2M6.itm_grp_cd3.eq(S2MM3.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP3.value()).eq(S2MM3.itm_grp_typ))))
						.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S2M6.itm_grp_cd3.like(bind("itm_grp_cd3"))).cutoff$and(S2MM3.itm_grp_nm.like(bind("itm_grp_nm3")))),
					when(boundOr("itm_grp_flg4"))
						.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S2MM4).on(S2M6.itm_grp_cd4.eq(S2MM4.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP4.value()).eq(S2MM4.itm_grp_typ))))
						.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S2M6.itm_grp_cd4.like(bind("itm_grp_cd4"))).cutoff$and(S2MM4.itm_grp_nm.like(bind("itm_grp_nm4")))),
					when(boundOr("itm_grp_flg5"))
						.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S2MM5).on(S2M6.itm_grp_cd5.eq(S2MM5.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP5.value()).eq(S2MM5.itm_grp_typ))))
						.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S2M6.itm_grp_cd5.like(bind("itm_grp_cd5"))).cutoff$and(S2MM5.itm_grp_nm.like(bind("itm_grp_nm5")))),
					when(boundOr("itm_grp_flg6"))
						.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S2MM6).on(S2M6.itm_grp_cd6.eq(S2MM6.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP6.value()).eq(S2MM6.itm_grp_typ))))
						.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S2M6.itm_grp_cd6.like(bind("itm_grp_cd6"))).cutoff$and(S2MM6.itm_grp_nm.like(bind("itm_grp_nm6")))),
					when(boundOr("itm_grp_flg7"))
						.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S2MM7).on(S2M6.itm_grp_cd7.eq(S2MM7.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP7.value()).eq(S2MM7.itm_grp_typ))))
						.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S2M6.itm_grp_cd7.like(bind("itm_grp_cd7"))).cutoff$and(S2MM7.itm_grp_nm.like(bind("itm_grp_nm7")))),
					when(boundOr("itm_grp_flg8"))
						.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S2MM8).on(S2M6.itm_grp_cd8.eq(S2MM8.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP8.value()).eq(S2MM8.itm_grp_typ))))
						.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S2M6.itm_grp_cd8.like(bind("itm_grp_cd8"))).cutoff$and(S2MM8.itm_grp_nm.like(bind("itm_grp_nm8")))),
					when(boundOr("itm_grp_flg9"))
						.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S2MM9).on(S2M6.itm_grp_cd9.eq(S2MM9.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP9.value()).eq(S2MM9.itm_grp_typ))))
						.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S2M6.itm_grp_cd9.like(bind("itm_grp_cd9"))).cutoff$and(S2MM9.itm_grp_nm.like(bind("itm_grp_nm9")))),
					when(boundOr("itm_grp_flg10"))
						.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S2MM10).on(S2M6.itm_grp_cd10.eq(S2MM10.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP10.value()).eq(S2MM10.itm_grp_typ))))
						.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S2M6.itm_grp_cd10.like(bind("itm_grp_cd10"))).cutoff$and(S2MM10.itm_grp_nm.like(bind("itm_grp_nm10"))))
			);
	}
	/**
	 * -- MSBCL1060_MSW_ALLOC_LOCK_KEY_Query_I01
	 */
	static MCQueryPlan MSBCL1060_MSW_ALLOC_LOCK_KEY_I01() {
		MSW_ALLOC_LOCK_KEY_R S0 = MSW_ALLOC_LOCK_KEY_R.create();
		MSVT_AVL_STK_R S1T1 = MSVT_AVL_STK_R.create("T1");
		MAVM_RD_LOC_R S1M0 = MAVM_RD_LOC_R.create("M0");
		MSVT_WRK_SNO_R S1T3 = MSVT_WRK_SNO_R.create("T3");
		MAM_WG_R S1M1 = MAM_WG_R.create("M1");
		MAM_LOC_GRP_R S1M2 = MAM_LOC_GRP_R.create("M2");
		MAM_LOC_R S1M3 = MAM_LOC_R.create("M3");
		MAM_ITM_R S1M6 = MAM_ITM_R.create("M6");
		MAM_ITM_TYP_D_R S1M7 = MAM_ITM_TYP_D_R.create("M7");
		MAM_SITE_R S1M8 = MAM_SITE_R.create("M8");
		MAM_LG_GRP_R S1M9 = MAM_LG_GRP_R.create("M9");
		MAM_ALLOC_GRP_R S1M10 = MAM_ALLOC_GRP_R.create("M10");
		MST_WRK_R S1M11 = MST_WRK_R.create("M11");
		MAM_STK_GD_R S1M12 = MAM_STK_GD_R.create("M12");
		MAM_BP_R S1M13 = MAM_BP_R.create("M13");
		MAM_UNIT_R S1M14 = MAM_UNIT_R.create("M14");
		MAM_SUNDRY_ITM_R S1M19 = MAM_SUNDRY_ITM_R.create("M19");
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
		MSVT_AVL_IO_SCHD_R S2T1 = MSVT_AVL_IO_SCHD_R.create("T1");
		MAVM_RD_LOC_R S2M0 = MAVM_RD_LOC_R.create("M0");
		MSVT_WRK_SNO_R S2T3 = MSVT_WRK_SNO_R.create("T3");
		MAM_WG_R S2M1 = MAM_WG_R.create("M1");
		MAM_LOC_GRP_R S2M2 = MAM_LOC_GRP_R.create("M2");
		MAM_LOC_R S2M3 = MAM_LOC_R.create("M3");
		MAM_ITM_R S2M6 = MAM_ITM_R.create("M6");
		MAM_ITM_TYP_D_R S2M7 = MAM_ITM_TYP_D_R.create("M7");
		MAM_SITE_R S2M8 = MAM_SITE_R.create("M8");
		MAM_LG_GRP_R S2M9 = MAM_LG_GRP_R.create("M9");
		MAM_ALLOC_GRP_R S2M10 = MAM_ALLOC_GRP_R.create("M10");
		MST_WRK_R S2M11 = MST_WRK_R.create("M11");
		MAM_STK_GD_R S2M12 = MAM_STK_GD_R.create("M12");
		MAM_BP_R S2M13 = MAM_BP_R.create("M13");
		MAM_UNIT_R S2M14 = MAM_UNIT_R.create("M14");
		MAM_SUNDRY_ITM_R S2M19 = MAM_SUNDRY_ITM_R.create("M19");
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
		MCDynamicSQLID REP_ITM = createDynamicSQLID("REP_ITM");
		MCDynamicSQLID REP_LOC = createDynamicSQLID("REP_LOC");

		return createQueryPlan()
			.setQuery(
				sql("MSBCL1060_MSW_ALLOC_LOCK_KEY_Query_I01")
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
							S1T1.itm_cd,
							S1T1.itm_sub1,
							S1T1.itm_sub2,
							S1T1.itm_sub3,
							S1T1.loc_cd
						)
						.from(
							S1T1
							.innerJoin(S1M0).on(S1M0.loc_cd.eq(S1T1.loc_cd))
							.leftOuterJoin(S1T3).on(S1T3.sno1.eq(S1T1.sno1))
							.leftOuterJoin(S1M1).on(S1M1.wg_cd.eq(S1M0.wg_cd))
							.leftOuterJoin(S1M2).on(S1M2.loc_grp_cd.eq(S1M0.loc_grp_cd))
							.leftOuterJoin(S1M3).on(S1T1.loc_cd.eq(S1M3.loc_cd))
							.leftOuterJoin(S1M6).on(
								S1T1.itm_cd.eq(S1M6.itm_cd)
								.and(S1T1.itm_sub1.eq(S1M6.itm_sub1))
								.and(S1T1.itm_sub2.eq(S1M6.itm_sub2))
								.and(S1T1.itm_sub3.eq(S1M6.itm_sub3))
							)
							.leftOuterJoin(S1M7).on(
								S1M6.itm_typ.eq(S1M7.itm_typ)
								.and(S1M6.itm_typ_d_cd.eq(S1M7.itm_typ_d_cd))
							)
							.leftOuterJoin(S1M8).on(S1M8.site_cd.eq(S1M0.site_cd))
							.leftOuterJoin(S1M9).on(S1M9.lg_grp_cd.eq(S1M0.lg_grp_cd))
							.leftOuterJoin(S1M10).on(S1M10.alloc_grp_cd.eq(S1M0.alloc_grp_cd))
							.leftOuterJoin(S1M11).on(S1T3.wrk_no.eq(S1M11.wrk_no))
							.leftOuterJoin(S1M12).on(S1T1.gd_cd.eq(S1M12.gd_cd))
							.leftOuterJoin(S1M13).on(S1T1.stk_bp_cd.eq(S1M13.bp_cd))
							.leftOuterJoin(S1M14).on(S1T1.pack_unit_cd.eq(S1M14.unit_cd))
							.leftOuterJoin(S1M19).on(
								S1T1.itm_cd.eq(S1M19.itm_cd)
								.and(S1T1.itm_sub1.eq(S1M19.itm_sub1))
								.and(S1T1.itm_sub2.eq(S1M19.itm_sub2))
								.and(S1T1.itm_sub3.eq(S1M19.itm_sub3))
								.and(S1T1.sno1.eq(S1M19.sno1))
								.and(S1T1.sno2.eq(S1M19.sno2))
								.and(S1T1.sno3.eq(S1M19.sno3))
								.and(S1T1.sno4.eq(S1M19.sno4))
							)
							.addDynamicView(DS0C_ITM_GRP)
						)
						.where(
							value(0).eq(value(0))
							.and(
								value(1).eq(value(0))
								.cutoff$or(S1T1.quality_typ.eq(bind("good")))
								.cutoff$or(S1T1.quality_typ.eq(bind("dfct_oper")))
								.cutoff$or(S1T1.quality_typ.eq(bind("dfct_insp")))
								.cutoff$or(S1T1.quality_typ.eq(bind("sspnd")))
							)
							.and(
								value(1).eq(value(0))
								.cutoff$or(S1T1.stk_id_typ.eq(bind("costk")))
								.cutoff$or(S1T1.stk_id_typ.eq(bind("cststk")))
								.cutoff$or(S1T1.stk_id_typ.eq(bind("rnt_rcv")))
								.cutoff$or(S1T1.stk_id_typ.eq(bind("accpt_dfct")))
								.cutoff$or(S1T1.stk_id_typ.eq(bind("ncv_rcv")))
								.cutoff$or(S1T1.stk_id_typ.eq(bind("onr_prov")))
							)
							.and(
								value(0).eq(value(0))
								.cutoff$and(S1T1.sno1.like(bind("sno1")))
								.cutoff$or(S1T1.sno1.eq(bind("sno1_expt_val")))
							)
							.and(
								value(0).eq(value(0))
								.cutoff$and(S1T1.sno2.like(bind("sno2")))
								.cutoff$or(S1T1.sno2.eq(bind("sno2_expt_val")))
							)
							.and(
								value(0).eq(value(0))
								.cutoff$and(S1T1.sno3.like(bind("sno3")))
								.cutoff$or(S1T1.sno3.eq(bind("sno3_expt_val")))
							)
							.and(
								value(0).eq(value(0))
								.cutoff$and(S1T1.sno4.like(bind("sno4")))
								.cutoff$or(S1T1.sno4.eq(bind("sno4_expt_val")))
							)
							.cutoff$and(S1T1.itm_cd.like(bind("itm_cd")))
							.cutoff$and(S1T1.itm_sub1.like(bind("itm_sub1")))
							.cutoff$and(S1T1.itm_sub2.like(bind("itm_sub2")))
							.cutoff$and(S1T1.itm_sub3.like(bind("itm_sub3")))
							.cutoff$and(
								coalesce(
									S1M19.itm_nm,
									S1M6.itm_nm
								).like(bind("itm_nm"))
							)
							.cutoff$and(S1T1.lot_no.like(bind("lot_no")))
							.cutoff$and(S1T1.sublot_no.like(bind("sublot_no")))
							.cutoff$and(S1M6.itm_typ.like(bind("itm_typ")))
							.cutoff$and(S1M6.itm_typ_d_cd.like(bind("itm_typ_d_cd")))
							.cutoff$and(S1M7.itm_typ_d_nm.like(bind("itm_typ_d_nm")))
							.cutoff$and(S1T3.wrk_no.like(bind("wrk_no")))
							.cutoff$and(S1M11.wrk_nm.like(bind("wrk_nm")))
							.cutoff$and(S1M1.wg_cd.like(bind("wg_cd")))
							.cutoff$and(S1M1.wg_nm.like(bind("wg_nm")))
							.cutoff$and(S1M2.loc_grp_cd.like(bind("loc_grp_cd")))
							.cutoff$and(S1M2.loc_grp_nm.like(bind("loc_grp_nm")))
							.cutoff$and(S1M8.site_cd.like(bind("site_cd")))
							.cutoff$and(S1M8.site_nm.like(bind("site_nm")))
							.cutoff$and(S1M9.lg_grp_cd.like(bind("lg_grp_cd")))
							.cutoff$and(S1M9.lg_grp_nm.like(bind("lg_grp_nm")))
							.cutoff$and(S1M10.alloc_grp_cd.like(bind("alloc_grp_cd")))
							.cutoff$and(S1M10.alloc_grp_nm.like(bind("alloc_grp_nm")))
							.cutoff$and(S1T1.loc_cd.like(bind("loc_cd")))
							.cutoff$and(S1M3.loc_nm.like(bind("loc_nm")))
							.cutoff$and(S1T1.gd_cd.like(bind("gd_cd")))
							.cutoff$and(S1M12.gd_nm.like(bind("gd_nm")))
							.cutoff$and(S1T1.stk_bp_cd.like(bind("stk_bp_cd")))
							.cutoff$and(S1M13.bp_nm.like(bind("stk_bp_nm")))
							.cutoff$and(S1T1.asst_typ.like(bind("asst_typ")))
							.cutoff$and(S1T1.fix_no_typ.like(bind("fix_no_typ")))
							.cutoff$and(S1T1.fix_no.like(bind("fix_no")))
							.addDynamicPredicate(DS0C_ITM_GRP)
							.addDynamicPredicate(REP_ITM)
							.addDynamicPredicate(REP_LOC)
						)
						.union(
							subQuery()
							.select(
								S2T1.itm_cd,
								S2T1.itm_sub1,
								S2T1.itm_sub2,
								S2T1.itm_sub3,
								S2T1.loc_cd
							)
							.from(
								S2T1
								.innerJoin(S2M0).on(S2M0.loc_cd.eq(S2T1.loc_cd))
								.leftOuterJoin(S2T3).on(S2T3.sno1.eq(S2T1.sno1))
								.leftOuterJoin(S2M1).on(S2M1.wg_cd.eq(S2M0.wg_cd))
								.leftOuterJoin(S2M2).on(S2M2.loc_grp_cd.eq(S2M0.loc_grp_cd))
								.leftOuterJoin(S2M3).on(S2T1.loc_cd.eq(S2M3.loc_cd))
								.leftOuterJoin(S2M6).on(
									S2T1.itm_cd.eq(S2M6.itm_cd)
									.and(S2T1.itm_sub1.eq(S2M6.itm_sub1))
									.and(S2T1.itm_sub2.eq(S2M6.itm_sub2))
									.and(S2T1.itm_sub3.eq(S2M6.itm_sub3))
								)
								.leftOuterJoin(S2M7).on(
									S2M6.itm_typ.eq(S2M7.itm_typ)
									.and(S2M6.itm_typ_d_cd.eq(S2M7.itm_typ_d_cd))
								)
								.leftOuterJoin(S2M8).on(S2M8.site_cd.eq(S2M0.site_cd))
								.leftOuterJoin(S2M9).on(S2M9.lg_grp_cd.eq(S2M0.lg_grp_cd))
								.leftOuterJoin(S2M10).on(S2M10.alloc_grp_cd.eq(S2M0.alloc_grp_cd))
								.leftOuterJoin(S2M11).on(S2T3.wrk_no.eq(S2M11.wrk_no))
								.leftOuterJoin(S2M12).on(S2T1.gd_cd.eq(S2M12.gd_cd))
								.leftOuterJoin(S2M13).on(S2T1.stk_bp_cd.eq(S2M13.bp_cd))
								.leftOuterJoin(S2M14).on(S2T1.pack_unit_cd.eq(S2M14.unit_cd))
								.leftOuterJoin(S2M19).on(
									S2T1.itm_cd.eq(S2M19.itm_cd)
									.and(S2T1.itm_sub1.eq(S2M19.itm_sub1))
									.and(S2T1.itm_sub2.eq(S2M19.itm_sub2))
									.and(S2T1.itm_sub3.eq(S2M19.itm_sub3))
									.and(S2T1.sno1.eq(S2M19.sno1))
									.and(S2T1.sno2.eq(S2M19.sno2))
									.and(S2T1.sno3.eq(S2M19.sno3))
									.and(S2T1.sno4.eq(S2M19.sno4))
								)
								.addDynamicView(DS1C_ITM_GRP)
							)
							.where(
								value(0).eq(value(0))
								.and(
									value(1).eq(value(0))
									.cutoff$or(S2T1.stk_id_typ.eq(bind("costk")))
									.cutoff$or(S2T1.stk_id_typ.eq(bind("cststk")))
									.cutoff$or(S2T1.stk_id_typ.eq(bind("rnt_rcv")))
									.cutoff$or(S2T1.stk_id_typ.eq(bind("accpt_dfct")))
									.cutoff$or(S2T1.stk_id_typ.eq(bind("ncv_rcv")))
									.cutoff$or(S2T1.stk_id_typ.eq(bind("onr_prov")))
								)
								.and(
									value(0).eq(value(0))
									.cutoff$and(S2T1.sno1.like(bind("sno1")))
									.cutoff$or(S2T1.sno1.eq(bind("sno1_expt_val")))
								)
								.and(
									value(0).eq(value(0))
									.cutoff$and(S2T1.sno2.like(bind("sno2")))
									.cutoff$or(S2T1.sno2.eq(bind("sno2_expt_val")))
								)
								.and(
									value(0).eq(value(0))
									.cutoff$and(S2T1.sno3.like(bind("sno3")))
									.cutoff$or(S2T1.sno3.eq(bind("sno3_expt_val")))
								)
								.and(
									value(0).eq(value(0))
									.cutoff$and(S2T1.sno4.like(bind("sno4")))
									.cutoff$or(S2T1.sno4.eq(bind("sno4_expt_val")))
								)
								.cutoff$and(S2T1.itm_cd.like(bind("itm_cd")))
								.cutoff$and(S2T1.itm_sub1.like(bind("itm_sub1")))
								.cutoff$and(S2T1.itm_sub2.like(bind("itm_sub2")))
								.cutoff$and(S2T1.itm_sub3.like(bind("itm_sub3")))
								.cutoff$and(
									coalesce(
										S2M19.itm_nm,
										S2M6.itm_nm
									).like(bind("itm_nm"))
								)
								.cutoff$and(S2T1.lot_no.like(bind("lot_no")))
								.cutoff$and(S2T1.sublot_no.like(bind("sublot_no")))
								.cutoff$and(S2M6.itm_typ.like(bind("itm_typ")))
								.cutoff$and(S2M6.itm_typ_d_cd.like(bind("itm_typ_d_cd")))
								.cutoff$and(S2M7.itm_typ_d_nm.like(bind("itm_typ_d_nm")))
								.cutoff$and(S2T3.wrk_no.like(bind("wrk_no")))
								.cutoff$and(S2M11.wrk_nm.like(bind("wrk_nm")))
								.cutoff$and(S2M1.wg_cd.like(bind("wg_cd")))
								.cutoff$and(S2M1.wg_nm.like(bind("wg_nm")))
								.cutoff$and(S2M2.loc_grp_cd.like(bind("loc_grp_cd")))
								.cutoff$and(S2M2.loc_grp_nm.like(bind("loc_grp_nm")))
								.cutoff$and(S2M8.site_cd.like(bind("site_cd")))
								.cutoff$and(S2M8.site_nm.like(bind("site_nm")))
								.cutoff$and(S2M9.lg_grp_cd.like(bind("lg_grp_cd")))
								.cutoff$and(S2M9.lg_grp_nm.like(bind("lg_grp_nm")))
								.cutoff$and(S2M10.alloc_grp_cd.like(bind("alloc_grp_cd")))
								.cutoff$and(S2M10.alloc_grp_nm.like(bind("alloc_grp_nm")))
								.cutoff$and(S2T1.loc_cd.like(bind("loc_cd")))
								.cutoff$and(S2M3.loc_nm.like(bind("loc_nm")))
								.cutoff$and(S2T1.gd_cd.like(bind("gd_cd")))
								.cutoff$and(S2M12.gd_nm.like(bind("gd_nm")))
								.cutoff$and(S2T1.stk_bp_cd.like(bind("stk_bp_cd")))
								.cutoff$and(S2M13.bp_nm.like(bind("stk_bp_nm")))
								.cutoff$and(S2T1.asst_typ.like(bind("asst_typ")))
								.cutoff$and(value(MSC_FIX_NO_TYP.NON.value()).like(bind("fix_no_typ")))
								.cutoff$and(value(MAC_STR.NULL_VAL.value()).like(bind("fix_no")))
								.addDynamicPredicate(DS1C_ITM_GRP)
								.addDynamicPredicate(REP_ITM)
								.addDynamicPredicate(REP_LOC)
							)
						)
					)
			)
			.setDynamicSQLInfo(
					when(boundOr("itm_grp_flg1"))
						.view(DS1C_ITM_GRP, v -> v.leftOuterJoin(S1MM1).on(S1M6.itm_grp_cd1.eq(S1MM1.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP1.value()).eq(S1MM1.itm_grp_typ))))
						.predicate(DS1C_ITM_GRP, p -> p.cutoff$and(S1M6.itm_grp_cd1.like(bind("itm_grp_cd1"))).cutoff$and(S1MM1.itm_grp_nm.like(bind("itm_grp_nm1")))),
					when(boundOr("itm_grp_flg2"))
						.view(DS1C_ITM_GRP, v -> v.leftOuterJoin(S1MM2).on(S1M6.itm_grp_cd2.eq(S1MM2.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP2.value()).eq(S1MM2.itm_grp_typ))))
						.predicate(DS1C_ITM_GRP, p -> p.cutoff$and(S1M6.itm_grp_cd2.like(bind("itm_grp_cd2"))).cutoff$and(S1MM2.itm_grp_nm.like(bind("itm_grp_nm2")))),
					when(boundOr("itm_grp_flg3"))
						.view(DS1C_ITM_GRP, v -> v.leftOuterJoin(S1MM3).on(S1M6.itm_grp_cd3.eq(S1MM3.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP3.value()).eq(S1MM3.itm_grp_typ))))
						.predicate(DS1C_ITM_GRP, p -> p.cutoff$and(S1M6.itm_grp_cd3.like(bind("itm_grp_cd3"))).cutoff$and(S1MM3.itm_grp_nm.like(bind("itm_grp_nm3")))),
					when(boundOr("itm_grp_flg4"))
						.view(DS1C_ITM_GRP, v -> v.leftOuterJoin(S1MM4).on(S1M6.itm_grp_cd4.eq(S1MM4.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP4.value()).eq(S1MM4.itm_grp_typ))))
						.predicate(DS1C_ITM_GRP, p -> p.cutoff$and(S1M6.itm_grp_cd4.like(bind("itm_grp_cd4"))).cutoff$and(S1MM4.itm_grp_nm.like(bind("itm_grp_nm4")))),
					when(boundOr("itm_grp_flg5"))
						.view(DS1C_ITM_GRP, v -> v.leftOuterJoin(S1MM5).on(S1M6.itm_grp_cd5.eq(S1MM5.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP5.value()).eq(S1MM5.itm_grp_typ))))
						.predicate(DS1C_ITM_GRP, p -> p.cutoff$and(S1M6.itm_grp_cd5.like(bind("itm_grp_cd5"))).cutoff$and(S1MM5.itm_grp_nm.like(bind("itm_grp_nm5")))),
					when(boundOr("itm_grp_flg6"))
						.view(DS1C_ITM_GRP, v -> v.leftOuterJoin(S1MM6).on(S1M6.itm_grp_cd6.eq(S1MM6.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP6.value()).eq(S1MM6.itm_grp_typ))))
						.predicate(DS1C_ITM_GRP, p -> p.cutoff$and(S1M6.itm_grp_cd6.like(bind("itm_grp_cd6"))).cutoff$and(S1MM6.itm_grp_nm.like(bind("itm_grp_nm6")))),
					when(boundOr("itm_grp_flg7"))
						.view(DS1C_ITM_GRP, v -> v.leftOuterJoin(S1MM7).on(S1M6.itm_grp_cd7.eq(S1MM7.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP7.value()).eq(S1MM7.itm_grp_typ))))
						.predicate(DS1C_ITM_GRP, p -> p.cutoff$and(S1M6.itm_grp_cd7.like(bind("itm_grp_cd7"))).cutoff$and(S1MM7.itm_grp_nm.like(bind("itm_grp_nm7")))),
					when(boundOr("itm_grp_flg8"))
						.view(DS1C_ITM_GRP, v -> v.leftOuterJoin(S1MM8).on(S1M6.itm_grp_cd8.eq(S1MM8.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP8.value()).eq(S1MM8.itm_grp_typ))))
						.predicate(DS1C_ITM_GRP, p -> p.cutoff$and(S1M6.itm_grp_cd8.like(bind("itm_grp_cd8"))).cutoff$and(S1MM8.itm_grp_nm.like(bind("itm_grp_nm8")))),
					when(boundOr("itm_grp_flg9"))
						.view(DS1C_ITM_GRP, v -> v.leftOuterJoin(S1MM9).on(S1M6.itm_grp_cd9.eq(S1MM9.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP9.value()).eq(S1MM9.itm_grp_typ))))
						.predicate(DS1C_ITM_GRP, p -> p.cutoff$and(S1M6.itm_grp_cd9.like(bind("itm_grp_cd9"))).cutoff$and(S1MM9.itm_grp_nm.like(bind("itm_grp_nm9")))),
					when(boundOr("itm_grp_flg10"))
						.view(DS1C_ITM_GRP, v -> v.leftOuterJoin(S1MM10).on(S1M6.itm_grp_cd10.eq(S1MM10.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP10.value()).eq(S1MM10.itm_grp_typ))))
						.predicate(DS1C_ITM_GRP, p -> p.cutoff$and(S1M6.itm_grp_cd10.like(bind("itm_grp_cd10"))).cutoff$and(S1MM10.itm_grp_nm.like(bind("itm_grp_nm10")))),
					when(boundOr("itm_grp_flg1"))
						.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S2MM1).on(S2M6.itm_grp_cd1.eq(S2MM1.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP1.value()).eq(S2MM1.itm_grp_typ))))
						.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S2M6.itm_grp_cd1.like(bind("itm_grp_cd1"))).cutoff$and(S2MM1.itm_grp_nm.like(bind("itm_grp_nm1")))),
					when(boundOr("itm_grp_flg2"))
						.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S2MM2).on(S2M6.itm_grp_cd2.eq(S2MM2.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP2.value()).eq(S2MM2.itm_grp_typ))))
						.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S2M6.itm_grp_cd2.like(bind("itm_grp_cd2"))).cutoff$and(S2MM2.itm_grp_nm.like(bind("itm_grp_nm2")))),
					when(boundOr("itm_grp_flg3"))
						.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S2MM3).on(S2M6.itm_grp_cd3.eq(S2MM3.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP3.value()).eq(S2MM3.itm_grp_typ))))
						.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S2M6.itm_grp_cd3.like(bind("itm_grp_cd3"))).cutoff$and(S2MM3.itm_grp_nm.like(bind("itm_grp_nm3")))),
					when(boundOr("itm_grp_flg4"))
						.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S2MM4).on(S2M6.itm_grp_cd4.eq(S2MM4.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP4.value()).eq(S2MM4.itm_grp_typ))))
						.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S2M6.itm_grp_cd4.like(bind("itm_grp_cd4"))).cutoff$and(S2MM4.itm_grp_nm.like(bind("itm_grp_nm4")))),
					when(boundOr("itm_grp_flg5"))
						.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S2MM5).on(S2M6.itm_grp_cd5.eq(S2MM5.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP5.value()).eq(S2MM5.itm_grp_typ))))
						.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S2M6.itm_grp_cd5.like(bind("itm_grp_cd5"))).cutoff$and(S2MM5.itm_grp_nm.like(bind("itm_grp_nm5")))),
					when(boundOr("itm_grp_flg6"))
						.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S2MM6).on(S2M6.itm_grp_cd6.eq(S2MM6.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP6.value()).eq(S2MM6.itm_grp_typ))))
						.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S2M6.itm_grp_cd6.like(bind("itm_grp_cd6"))).cutoff$and(S2MM6.itm_grp_nm.like(bind("itm_grp_nm6")))),
					when(boundOr("itm_grp_flg7"))
						.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S2MM7).on(S2M6.itm_grp_cd7.eq(S2MM7.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP7.value()).eq(S2MM7.itm_grp_typ))))
						.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S2M6.itm_grp_cd7.like(bind("itm_grp_cd7"))).cutoff$and(S2MM7.itm_grp_nm.like(bind("itm_grp_nm7")))),
					when(boundOr("itm_grp_flg8"))
						.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S2MM8).on(S2M6.itm_grp_cd8.eq(S2MM8.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP8.value()).eq(S2MM8.itm_grp_typ))))
						.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S2M6.itm_grp_cd8.like(bind("itm_grp_cd8"))).cutoff$and(S2MM8.itm_grp_nm.like(bind("itm_grp_nm8")))),
					when(boundOr("itm_grp_flg9"))
						.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S2MM9).on(S2M6.itm_grp_cd9.eq(S2MM9.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP9.value()).eq(S2MM9.itm_grp_typ))))
						.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S2M6.itm_grp_cd9.like(bind("itm_grp_cd9"))).cutoff$and(S2MM9.itm_grp_nm.like(bind("itm_grp_nm9")))),
					when(boundOr("itm_grp_flg10"))
						.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S2MM10).on(S2M6.itm_grp_cd10.eq(S2MM10.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP10.value()).eq(S2MM10.itm_grp_typ))))
						.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S2M6.itm_grp_cd10.like(bind("itm_grp_cd10"))).cutoff$and(S2MM10.itm_grp_nm.like(bind("itm_grp_nm10"))))
			);
	}
}