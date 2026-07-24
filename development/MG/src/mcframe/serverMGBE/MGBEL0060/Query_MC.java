package mcframe.serverMGBE.MGBEL0060;

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
import mcframe.commonMG.constant.*;
import mcframe.serverCore.dbc.*;
import mcframe.serverMA.dbc.*;
import mcframe.serverMB.dbc.*;
import mcframe.serverPF.dbc.*;
import mcframe.serverMG.dbc.*;

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
import static mcframe.serverMG.dbc.MGFunction.*;

public class Query_MC {
	
	/**
	 * -- MGBEL0060_STD_ALC_Query_S01
	 */
	static MCQueryPlan MGBEL0060_STD_ALC_S01() {
		MGT_STD_ALC_R S0_T1 = MGT_STD_ALC_R.create("T1");
		MGT_STD_TOP_R S0_T2 = MGT_STD_TOP_R.create("T2");
		MGT_ARG_R S0_T3 = MGT_ARG_R.create("T3");
		MAVM_RD_WG_R S0_WG = MAVM_RD_WG_R.create("WG");
		MAM_EXPNS_R S0_M1 = MAM_EXPNS_R.create("M1");
		MAM_EXPNS_GRP_R S0_M2 = MAM_EXPNS_GRP_R.create("M2");
		MAM_ALC_AC_R S0_M3 = MAM_ALC_AC_R.create("M3");
		MAM_COST_DPT_R S0_M4 = MAM_COST_DPT_R.create("M4");
		MAM_LOC_R S0_M5 = MAM_LOC_R.create("M5");
		MAM_OPER_R S0_M6 = MAM_OPER_R.create("M6");
		MAM_BP_R S0_M7 = MAM_BP_R.create("M7");
		MAM_COST_CTG_R S0_M8 = MAM_COST_CTG_R.create("M8");
		MAM_ITM_R S0_M9 = MAM_ITM_R.create("M9");
		MAM_ITM_TYP_D_R S0_ITM_TYP_D = MAM_ITM_TYP_D_R.create("ITM_TYP_D");
		MAM_ALC_PTN_R S0_M10 = MAM_ALC_PTN_R.create("M10");
		MAM_ALC_AC_GRP_R S0_ALC_AC_GRP1 = MAM_ALC_AC_GRP_R.create("ALC_AC_GRP1");
		MAM_ALC_AC_GRP_R S0_ALC_AC_GRP2 = MAM_ALC_AC_GRP_R.create("ALC_AC_GRP2");
		MAM_ALC_AC_GRP_R S0_ALC_AC_GRP3 = MAM_ALC_AC_GRP_R.create("ALC_AC_GRP3");
		MAM_WG_R S0_WG_2 = MAM_WG_R.create("WG_2");
		MAM_COST_DPT_R S0_M4_2 = MAM_COST_DPT_R.create("M4_2");
		MAM_LOC_R S0_M5_2 = MAM_LOC_R.create("M5_2");
		MAM_ITM_R S0_M9_2 = MAM_ITM_R.create("M9_2");
		MAM_BP_R S0_SPPL = MAM_BP_R.create("SPPL");
		MAM_BP_R S0_CST = MAM_BP_R.create("CST");
		MAM_BP_R S0_DLV = MAM_BP_R.create("DLV");
		MAM_BP_R S0_DEST1 = MAM_BP_R.create("DEST1");
		MAM_BP_R S0_DEST2 = MAM_BP_R.create("DEST2");
		MAM_BP_R S0_DEST3 = MAM_BP_R.create("DEST3");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MGBEL0060_STD_ALC_Query_S01")
					.mainQuery()
					.select(
						S0_T1.alc_ac_cd,
						S0_M3.alc_ac_nm,
						S0_T1.wg_cd,
						S0_WG.wg_nm,
						S0_T1.dpt_cd,
						S0_M4.dpt_nm,
						S0_T1.loc_cd,
						S0_M5.loc_nm,
						S0_T1.oper_cd,
						S0_M6.oper_nm,
						S0_T1.bp_cd,
						S0_M7.bp_nm,
						S0_T1.ctg_cd,
						S0_M8.ctg_nm,
						S0_M9.itm_typ.as("itm_typ"),
						S0_M9.itm_typ_d_cd.as("itm_typ_d_cd"),
						S0_ITM_TYP_D.itm_typ_d_nm.as("itm_typ_d_nm"),
						S0_T1.itm_cd,
						S0_T1.itm_sub1,
						S0_T1.itm_sub2,
						S0_T1.itm_sub3,
						S0_M9.itm_nm,
						S0_M1.expns_grp_cd,
						S0_M2.expns_grp_nm,
						S0_M2.expns_grp_seq.as("expnsg_seq"),
						S0_T1.expns_cd,
						S0_M1.expns_nm,
						S0_M1.expns_seq.as("expns_seq"),
						S0_T1.alc_ptn_cd,
						S0_M10.alc_ptn_nm,
						sum(S0_T1.alc_amt).as("alc_amt"),
						sum(S0_T1.alc_tgt_val).as("alc_tgt_val"),
						S0_T1.alc_rate,
						S0_T1.coef_val,
						sum(
							nvl(
								S0_T1.alc_org_tgt_val,
								decode(
									S0_T1.coef_val,
									value(0),
									value(0),
									nvl(
										S0_T1.alc_tgt_val.divide(S0_T1.coef_val),
										value(0)
									)
								)
							)
						).as("alc_org_tgt_val")
					)
					.from(
						S0_T1
						.innerJoin(S0_T2).on(
							S0_T1.calc_no.eq(S0_T2.calc_no)
							.and(S0_T1.calc_grp_cd.eq(S0_T2.calc_grp_cd))
							.and(S0_T1.top_rec_no.eq(S0_T2.top_rec_no))
						)
						.innerJoin(S0_T3).on(
							S0_T1.calc_no.eq(S0_T3.calc_no)
							.and(S0_T1.calc_grp_cd.eq(S0_T3.calc_grp_cd))
						)
						.innerJoin(S0_WG).on(S0_T1.wg_cd.eq(S0_WG.wg_cd))
						.leftOuterJoin(S0_M1).on(S0_T1.expns_cd.eq(S0_M1.expns_cd))
						.leftOuterJoin(S0_M2).on(S0_M1.expns_grp_cd.eq(S0_M2.expns_grp_cd))
						.leftOuterJoin(S0_M3).on(S0_T1.alc_ac_cd.eq(S0_M3.alc_ac_cd))
						.leftOuterJoin(S0_M4).on(
							S0_T1.dpt_cd.eq(S0_M4.dpt_cd)
							.and(S0_T3.term.eq(S0_M4.term))
						)
						.leftOuterJoin(S0_M5).on(S0_T1.loc_cd.eq(S0_M5.loc_cd))
						.leftOuterJoin(S0_M6).on(S0_T1.oper_cd.eq(S0_M6.oper_cd))
						.leftOuterJoin(S0_M7).on(S0_T1.bp_cd.eq(S0_M7.bp_cd))
						.leftOuterJoin(S0_M8).on(S0_T1.ctg_cd.eq(S0_M8.ctg_cd))
						.leftOuterJoin(S0_M9).on(
							S0_T1.itm_cd.eq(S0_M9.itm_cd)
							.and(S0_T1.itm_sub1.eq(S0_M9.itm_sub1))
							.and(S0_T1.itm_sub2.eq(S0_M9.itm_sub2))
							.and(S0_T1.itm_sub3.eq(S0_M9.itm_sub3))
						)
						.leftOuterJoin(S0_ITM_TYP_D).on(
							S0_M9.itm_typ.eq(S0_ITM_TYP_D.itm_typ)
							.and(S0_M9.itm_typ_d_cd.eq(S0_ITM_TYP_D.itm_typ_d_cd))
						)
						.leftOuterJoin(S0_M10).on(S0_T1.alc_ptn_cd.eq(S0_M10.alc_ptn_cd))
						.leftOuterJoin(S0_ALC_AC_GRP1).on(
							value(MAC_ALC_AC_GRP_TYP.GRP1.value()).eq(S0_ALC_AC_GRP1.alc_ac_grp_typ)
							.and(S0_M3.alc_ac_grp_cd1.eq(S0_ALC_AC_GRP1.alc_ac_grp_cd))
						)
						.leftOuterJoin(S0_ALC_AC_GRP2).on(
							value(MAC_ALC_AC_GRP_TYP.GRP2.value()).eq(S0_ALC_AC_GRP2.alc_ac_grp_typ)
							.and(S0_M3.alc_ac_grp_cd2.eq(S0_ALC_AC_GRP2.alc_ac_grp_cd))
						)
						.leftOuterJoin(S0_ALC_AC_GRP3).on(
							value(MAC_ALC_AC_GRP_TYP.GRP3.value()).eq(S0_ALC_AC_GRP3.alc_ac_grp_typ)
							.and(S0_M3.alc_ac_grp_cd3.eq(S0_ALC_AC_GRP3.alc_ac_grp_cd))
						)
						.addDynamicView()
					)
					.where(
						value(0).eq(value(0))
						.and(S0_T1.calc_no.eq(bind("calc_no")))
						.and(S0_T1.calc_grp_cd.eq(bind("calc_grp_cd")))
						.cutoff$and(S0_T2.wg_cd.like(bind("wg_cd")))
						.addDynamicPredicate()
						.cutoff$and(S0_T2.itm_cd.like(bind("itm_cd")))
						.cutoff$and(S0_T2.itm_sub1.like(bind("itm_sub1")))
						.cutoff$and(S0_T2.itm_sub2.like(bind("itm_sub2")))
						.cutoff$and(S0_T2.itm_sub3.like(bind("itm_sub3")))
						.cutoff$and(S0_T2.loc_cd.like(bind("loc_cd")))
						.cutoff$and(S0_T2.sppl_cd.like(bind("sppl_cd")))
						.cutoff$and(S0_T2.cst_cd.like(bind("cst_cd")))
						.cutoff$and(S0_T2.dlv_cd.like(bind("dlv_cd")))
						.cutoff$and(S0_T2.dest_cd1.like(bind("dest_cd1")))
						.cutoff$and(S0_T2.dest_cd2.like(bind("dest_cd2")))
						.cutoff$and(S0_T2.dest_cd3.like(bind("dest_cd3")))
						.cutoff$and(S0_T2.dpt_cd.like(bind("dpt_cd")))
						.cutoff$and(S0_T1.expns_cd.like(bind("expns_cd")))
						.cutoff$and(S0_M1.expns_nm.like(bind("expns_nm")))
						.cutoff$and(S0_M1.expns_grp_cd.like(bind("expns_grp_cd")))
						.cutoff$and(S0_M2.expns_grp_nm.like(bind("expns_grp_nm")))
						.cutoff$and(S0_M1.expns_typ.like(bind("expns_typ")))
						.cutoff$and(
							bind("amt_zero_flg_str").eq(value(true))
							.and(S0_T1.alc_amt.neq(value(0)))
						)
						.cutoff$and(
							bind("no_loc_flg_str").eq(value(true))
							.and(S0_T2.loc_cd.isNull())
						)
						.cutoff$and(
							bind("no_sppl_flg_str").eq(value(true))
							.and(S0_T2.sppl_cd.isNull())
						)
						.cutoff$and(
							bind("no_cst_flg_str").eq(value(true))
							.and(S0_T2.cst_cd.isNull())
						)
						.cutoff$and(
							bind("no_dlv_flg_str").eq(value(true))
							.and(S0_T2.dlv_cd.isNull())
						)
						.cutoff$and(
							bind("no_dest1_flg_str").eq(value(true))
							.and(S0_T2.dest_cd1.isNull())
						)
						.cutoff$and(
							bind("no_dest2_flg_str").eq(value(true))
							.and(S0_T2.dest_cd2.isNull())
						)
						.cutoff$and(
							bind("no_dest3_flg_str").eq(value(true))
							.and(S0_T2.dest_cd3.isNull())
						)
						.cutoff$and(
							bind("no_dpt_flg_str").eq(value(true))
							.and(S0_T2.dpt_cd.isNull())
						)
						.cutoff$and(S0_T1.alc_ac_cd.like(bind("alc_ac_cd")))
						.cutoff$and(S0_M3.alc_ac_nm.like(bind("alc_ac_nm")))
						.cutoff$and(S0_M3.alc_ac_grp_cd1.like(bind("alc_ac_grp_cd1")))
						.cutoff$and(S0_ALC_AC_GRP1.alc_ac_grp_nm.like(bind("alc_ac_grp_nm1")))
						.cutoff$and(S0_M3.alc_ac_grp_cd2.like(bind("alc_ac_grp_cd2")))
						.cutoff$and(S0_ALC_AC_GRP2.alc_ac_grp_nm.like(bind("alc_ac_grp_nm2")))
						.cutoff$and(S0_M3.alc_ac_grp_cd3.like(bind("alc_ac_grp_cd3")))
						.cutoff$and(S0_ALC_AC_GRP3.alc_ac_grp_nm.like(bind("alc_ac_grp_nm3")))
						.cutoff$and(S0_T1.dpt_cd.like(bind("dpt_cd2")))
						.cutoff$and(S0_M4.dpt_nm.like(bind("dpt_nm2")))
						.cutoff$and(S0_T1.loc_cd.like(bind("loc_cd2")))
						.cutoff$and(S0_M5.loc_nm.like(bind("loc_nm2")))
						.cutoff$and(S0_T1.oper_cd.like(bind("oper_cd")))
						.cutoff$and(S0_M6.oper_nm.like(bind("oper_nm")))
						.cutoff$and(S0_T1.bp_cd.like(bind("bp_cd")))
						.cutoff$and(S0_M7.bp_nm.like(bind("bp_nm")))
						.cutoff$and(S0_T1.ctg_cd.like(bind("ctg_cd")))
						.cutoff$and(S0_M8.ctg_nm.like(bind("ctg_nm")))
						.cutoff$and(S0_T1.itm_cd.like(bind("itm_cd2")))
						.cutoff$and(S0_T1.itm_sub1.like(bind("itm_sub1_2")))
						.cutoff$and(S0_T1.itm_sub2.like(bind("itm_sub2_2")))
						.cutoff$and(S0_T1.itm_sub3.like(bind("itm_sub3_2")))
						.cutoff$and(S0_M9.itm_nm.like(bind("itm_nm2")))
						.cutoff$and(
							bind("no_dpt2_flg_str").eq(value(true))
							.and(S0_T1.dpt_cd.isNull())
						)
						.cutoff$and(
							bind("no_loc2_flg_str").eq(value(true))
							.and(S0_T1.loc_cd.isNull())
						)
						.cutoff$and(
							bind("no_oper_flg_str").eq(value(true))
							.and(S0_T1.oper_cd.isNull())
						)
						.cutoff$and(
							bind("no_bp_flg_str").eq(value(true))
							.and(S0_T1.bp_cd.isNull())
						)
						.cutoff$and(
							bind("no_ctg_flg_str").eq(value(true))
							.and(S0_T1.ctg_cd.isNull())
						)
						.cutoff$and(
							bind("no_itm2_flg_str").eq(value(true))
							.and(S0_T1.itm_cd.isNull())
						)
					)
					.groupBy(
						S0_T1.alc_ac_cd,
						S0_M3.alc_ac_nm,
						S0_T1.wg_cd,
						S0_WG.wg_nm,
						S0_T1.dpt_cd,
						S0_M4.dpt_nm,
						S0_T1.loc_cd,
						S0_M5.loc_nm,
						S0_T1.oper_cd,
						S0_M6.oper_nm,
						S0_T1.bp_cd,
						S0_M7.bp_nm,
						S0_T1.ctg_cd,
						S0_M8.ctg_nm,
						S0_M9.itm_typ,
						S0_M9.itm_typ_d_cd,
						S0_ITM_TYP_D.itm_typ_d_nm,
						S0_T1.itm_cd,
						S0_T1.itm_sub1,
						S0_T1.itm_sub2,
						S0_T1.itm_sub3,
						S0_M9.itm_nm,
						S0_M1.expns_grp_cd,
						S0_M2.expns_grp_nm,
						S0_M2.expns_grp_seq,
						S0_T1.expns_cd,
						S0_M1.expns_nm,
						S0_M1.expns_seq,
						S0_T1.alc_ptn_cd,
						S0_M10.alc_ptn_nm,
						S0_T1.alc_rate,
						S0_T1.coef_val
					)
					.orderBy(
						S0_M2.expns_grp_seq.asc(),
						S0_M1.expns_grp_cd.asc(),
						S0_M1.expns_seq.asc(),
						S0_T1.expns_cd.asc(),
						S0_T1.alc_ac_cd.asc(),
						S0_T1.wg_cd.asc(),
						S0_T1.dpt_cd.asc(),
						S0_T1.loc_cd.asc(),
						S0_T1.oper_cd.asc(),
						S0_T1.bp_cd.asc(),
						S0_T1.ctg_cd.asc(),
						S0_T1.itm_cd.asc(),
						S0_T1.itm_sub1.asc(),
						S0_T1.itm_sub2.asc(),
						S0_T1.itm_sub3.asc()
					)
			)
			.setDynamicSQLInfo(
				when(boundOr("wg_nm"))
					.view(v -> v.leftOuterJoin(S0_WG_2).on(S0_T2.wg_cd.eq(S0_WG_2.wg_cd)))
					.predicate(p -> p.cutoff$and(S0_WG_2.wg_nm.like(bind("wg_nm")))),
				when(boundOr("dpt_nm"))
					.view(v -> v.leftOuterJoin(S0_M4_2).on(S0_T2.dpt_cd.eq(S0_M4_2.dpt_cd).and(S0_T3.term.eq(S0_M4_2.term))))
					.predicate(p -> p.cutoff$and(S0_M4_2.dpt_nm.like(bind("dpt_nm")))),
				when(boundOr("loc_nm"))
					.view(v -> v.leftOuterJoin(S0_M5_2).on(S0_T2.loc_cd.eq(S0_M5_2.loc_cd)))
					.predicate(p -> p.cutoff$and(S0_M5_2.loc_nm.like(bind("loc_nm")))),
				when(boundOr("itm_nm"))
					.view(v -> v.leftOuterJoin(S0_M9_2).on(S0_T2.itm_cd.eq(S0_M9_2.itm_cd).and(S0_T2.itm_sub1.eq(S0_M9_2.itm_sub1)).and(S0_T2.itm_sub2.eq(S0_M9_2.itm_sub2)).and(S0_T2.itm_sub3.eq(S0_M9_2.itm_sub3))))
					.predicate(p -> p.cutoff$and(S0_M9_2.itm_nm.like(bind("itm_nm")))),
				when(boundOr("sppl_nm"))
					.view(v -> v.leftOuterJoin(S0_SPPL).on(S0_T2.sppl_cd.eq(S0_SPPL.bp_cd)))
					.predicate(p -> p.cutoff$and(S0_SPPL.bp_nm.like(bind("sppl_nm")))),
				when(boundOr("cst_nm"))
					.view(v -> v.leftOuterJoin(S0_CST).on(S0_T2.cst_cd.eq(S0_CST.bp_cd)))
					.predicate(p -> p.cutoff$and(S0_CST.bp_nm.like(bind("cst_nm")))),
				when(boundOr("dlv_nm"))
					.view(v -> v.leftOuterJoin(S0_DLV).on(S0_T2.dlv_cd.eq(S0_DLV.bp_cd)))
					.predicate(p -> p.cutoff$and(S0_DLV.bp_nm.like(bind("dlv_nm")))),
				when(boundOr("dest_nm1"))
					.view(v -> v.leftOuterJoin(S0_DEST1).on(S0_T2.dest_cd1.eq(S0_DEST1.bp_cd)))
					.predicate(p -> p.cutoff$and(S0_DEST1.bp_nm.like(bind("dest_nm1")))),
				when(boundOr("dest_nm2"))
					.view(v -> v.leftOuterJoin(S0_DEST2).on(S0_T2.dest_cd2.eq(S0_DEST2.bp_cd)))
					.predicate(p -> p.cutoff$and(S0_DEST2.bp_nm.like(bind("dest_nm2")))),
				when(boundOr("dest_nm3"))
					.view(v -> v.leftOuterJoin(S0_DEST3).on(S0_T2.dest_cd3.eq(S0_DEST3.bp_cd)))
					.predicate(p -> p.cutoff$and(S0_DEST3.bp_nm.like(bind("dest_nm3"))))
			);
	}
}