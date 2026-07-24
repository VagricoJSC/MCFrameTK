package mcframe.serverMGBD.MGBDL0250;

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
	 * -- MGBDL0250_MGT_PRE_ALC_PATH_Query_S01
	 */
	static MCQueryPlan MGBDL0250_MGT_PRE_ALC_PATH_S01() {
		MGT_PRE_ALC_PATH_R S0T = MGT_PRE_ALC_PATH_R.create("T");
		MGT_PRE_ALC_PATH_R S0T2 = MGT_PRE_ALC_PATH_R.create("T2");
		MAM_ALC_AC_R S0SRC_ALC_AC = MAM_ALC_AC_R.create("SRC_ALC_AC");
		MAM_ALC_AC_R S0DEST_ALC_AC = MAM_ALC_AC_R.create("DEST_ALC_AC");
		MAVM_RD_WG_R S0SRC_DAC = MAVM_RD_WG_R.create("SRC_DAC");
		MAVM_RD_WG_R S0DEST_DAC = MAVM_RD_WG_R.create("DEST_DAC");
		MAM_TERM_R TERM = MAM_TERM_R.create("TERM");
		MAM_ITM_R ITM = MAM_ITM_R.create("ITM");
		MAM_ALC_AC_GRP_R SRC_ALC_AC_GRP1 = MAM_ALC_AC_GRP_R.create("SRC_ALC_AC_GRP1");
		MAM_ALC_AC_GRP_R SRC_ALC_AC_GRP2 = MAM_ALC_AC_GRP_R.create("SRC_ALC_AC_GRP2");
		MAM_ALC_AC_GRP_R SRC_ALC_AC_GRP3 = MAM_ALC_AC_GRP_R.create("SRC_ALC_AC_GRP3");
		MAM_ALC_AC_GRP_R DEST_ALC_AC_GRP1 = MAM_ALC_AC_GRP_R.create("DEST_ALC_AC_GRP1");
		MAM_ALC_AC_GRP_R DEST_ALC_AC_GRP2 = MAM_ALC_AC_GRP_R.create("DEST_ALC_AC_GRP2");
		MAM_ALC_AC_GRP_R DEST_ALC_AC_GRP3 = MAM_ALC_AC_GRP_R.create("DEST_ALC_AC_GRP3");
		MAM_COST_DPT_R DPT = MAM_COST_DPT_R.create("DPT");
		MAM_LOC_R LOC = MAM_LOC_R.create("LOC");
		MAM_OPER_R OPER = MAM_OPER_R.create("OPER");
		MAM_BP_R BP = MAM_BP_R.create("BP");
		MAM_COST_CTG_R CTG = MAM_COST_CTG_R.create("CTG");
		MAM_ITM_TYP_D_R ITM_TYP_D = MAM_ITM_TYP_D_R.create("ITM_TYP_D");
		MAM_SUNDRY_ITM_R SUNDRY_ITM = MAM_SUNDRY_ITM_R.create("SUNDRY_ITM");
		MAM_COST_DPT_R DPT2 = MAM_COST_DPT_R.create("DPT2");

		MCTempView T = createTempView("T");

		MCDynamicSQLID core = createDynamicSQLID("core");
		MCDynamicSQLID aggr = createDynamicSQLID("aggr");

		return createQueryPlan()
			.setQuery(
				sql("MGBDL0250_MGT_PRE_ALC_PATH_Query_S01")
				.mainQuery()
				.select(
					addDynamicSelect(aggr)
				)
				.from(
					subQuery()
					.select(
							S0T.pre_alc_lvl,
							S0T.ym,
							S0T.wg_cd.as("src_wg_cd"),
							S0SRC_DAC.wg_nm.as("src_wg_nm"),
							S0T.alc_ac_cd.as("src_alc_ac_cd"),
							S0T.dpt_cd,
							S0T.loc_cd,
							S0T.oper_cd,
							S0T.bp_cd,
							S0T.ctg_cd,
							S0T.itm_cd,
							S0T.itm_sub1,
							S0T.itm_sub2,
							S0T.itm_sub3,
							S0T.lot_no,
							S0T.sublot_no,
							S0T.sno1,
							S0T.sno2,
							S0T.sno3,
							S0T.sno4,
							S0T.itm_mfg_inst_no,
							S0T.iv_no,
							S0T.po_no,
							S0T.slo_no,
							S0T2.wg_cd.as("dest_wg_cd"),
							S0DEST_DAC.wg_nm.as("dest_wg_nm"),
							S0T2.alc_ac_cd.as("dest_alc_ac_cd"),
							S0T2.dpt_cd.as("dest_dpt_cd"),
							nvl(
								S0T2.dpt_cd,
								value(MAC_STR.NULL_VAL.value())
							).as("dpt_cd2"),
							S0T2.amt,
							addDynamicSelect(core)
						)
						.from(
							S0T
							.innerJoin(S0T2).on(
								S0T2.calc_no.eq(S0T.calc_no)
								.and(S0T2.calc_grp_cd.eq(S0T.calc_grp_cd))
							)
							.leftOuterJoin(S0SRC_ALC_AC).on(S0T.alc_ac_cd.eq(S0SRC_ALC_AC.alc_ac_cd))
							.leftOuterJoin(S0DEST_ALC_AC).on(S0T2.alc_ac_cd.eq(S0DEST_ALC_AC.alc_ac_cd))
							.innerJoin(S0SRC_DAC).on(S0T.wg_cd.eq(S0SRC_DAC.wg_cd))
							.innerJoin(S0DEST_DAC).on(S0T2.wg_cd.eq(S0DEST_DAC.wg_cd))
							.addDynamicView(core)
						)
						.where(
							value(0).eq(value(0))
							.cutoff$and(S0T.calc_no.like(bind("calc_no")))
							.and(S0T.calc_grp_cd.eq(bind("calc_grp_cd")))
							.cutoff$and(S0SRC_ALC_AC.alc_ac_nm.like(bind("src_alc_ac_nm")))
							.cutoff$and(S0SRC_ALC_AC.alc_ac_grp_cd1.like(bind("src_alc_ac_grp_cd1")))
							.cutoff$and(S0SRC_ALC_AC.alc_ac_grp_cd2.like(bind("src_alc_ac_grp_cd2")))
							.cutoff$and(S0SRC_ALC_AC.alc_ac_grp_cd3.like(bind("src_alc_ac_grp_cd3")))
							.cutoff$and(S0DEST_ALC_AC.alc_ac_nm.like(bind("dest_alc_ac_nm")))
							.cutoff$and(S0DEST_ALC_AC.alc_ac_grp_cd1.like(bind("dest_alc_ac_grp_cd1")))
							.cutoff$and(S0DEST_ALC_AC.alc_ac_grp_cd2.like(bind("dest_alc_ac_grp_cd2")))
							.cutoff$and(S0DEST_ALC_AC.alc_ac_grp_cd3.like(bind("dest_alc_ac_grp_cd3")))
							.cutoff$and(
								bind("pre_alc_lvl_flg_off").eq(value(false))
								.and(S0T2.top_pre_alc_seq.eq(S0T.pre_alc_seq))
								.and(S0T.pre_alc_lvl.eq(value(0)))
								.and(S0T2.fin_flg.eq(value(true)))
							)
							.cutoff$and(
								bind("pre_alc_lvl_flg_on").eq(value(true))
								.and(S0T2.src_pre_alc_seq.eq(S0T.pre_alc_seq))
							)
							.cutoff$and(S0T.wg_cd.like(bind("src_wg_cd")))
							.cutoff$and(S0SRC_DAC.wg_nm.like(bind("src_wg_nm")))
							.cutoff$and(S0T.alc_ac_cd.like(bind("src_alc_ac_cd")))
							.cutoff$and(S0T2.wg_cd.like(bind("dest_wg_cd")))
							.cutoff$and(S0DEST_DAC.wg_nm.like(bind("dest_wg_nm")))
							.cutoff$and(S0T2.alc_ac_cd.like(bind("dest_alc_ac_cd")))
							.cutoff$and(S0T.ym.gte(bind("ym_fr")))
							.cutoff$and(S0T.ym.lte(bind("ym_to")))
							.cutoff$and(S0T.dpt_cd.like(bind("dpt_cd")))
							.cutoff$and(S0T.loc_cd.like(bind("loc_cd")))
							.cutoff$and(S0T.oper_cd.like(bind("oper_cd")))
							.cutoff$and(S0T.bp_cd.like(bind("bp_cd")))
							.cutoff$and(S0T.ctg_cd.like(bind("ctg_cd")))
							.cutoff$and(S0T.itm_cd.like(bind("itm_cd")))
							.cutoff$and(S0T.itm_sub1.like(bind("itm_sub1")))
							.cutoff$and(S0T.itm_sub2.like(bind("itm_sub2")))
							.cutoff$and(S0T.itm_sub3.like(bind("itm_sub3")))
							.cutoff$and(S0T.lot_no.like(bind("lot_no")))
							.cutoff$and(S0T.sublot_no.like(bind("sublot_no")))
							.cutoff$and(S0T.sno1.like(bind("sno1")))
							.cutoff$and(S0T.sno2.like(bind("sno2")))
							.cutoff$and(S0T.sno3.like(bind("sno3")))
							.cutoff$and(S0T.sno4.like(bind("sno4")))
							.cutoff$and(S0T.itm_mfg_inst_no.like(bind("itm_mfg_inst_no")))
							.cutoff$and(S0T.iv_no.like(bind("iv_no")))
							.cutoff$and(S0T.po_no.like(bind("po_no")))
							.cutoff$and(S0T.slo_no.like(bind("slo_no")))
							.addDynamicPredicate(core)
						)
					.view(T)
				)
				.groupBy(
					addDynamicGroupBy(aggr)
				)
			)
			.setDynamicSQLInfo(
					when(boundOr("dpt_flg","dpt_nm","down1_flg"))
						.view(core, v -> v.innerJoin(TERM).on(S0T.ym.gte(TERM.term).and(S0T.ym.lt(TERM.term_end_ym)))),
					when(boundOr("itm_flg","itm_typ_flg","itm_typ_d_flg","itm_nm","itm_typ","itm_typ_d_cd","itm_typ_d_nm"))
						.view(core, v -> v.leftOuterJoin(ITM).on(S0T.itm_cd.eq(ITM.itm_cd).and(S0T.itm_sub1.eq(ITM.itm_sub1)).and(S0T.itm_sub2.eq(ITM.itm_sub2)).and(S0T.itm_sub3.eq(ITM.itm_sub3))))
						.predicate(core, p -> p.cutoff$and(ITM.itm_typ.like(bind("ITM_TYP"))).cutoff$and(ITM.itm_typ_d_cd.like(bind("ITM_TYP_D_CD")))),
					when(boundOr("pre_alc_lvl_flg"))
						.select(aggr,T.pr("pre_alc_lvl"))
						.groupBy(aggr,T.pr("pre_alc_lvl")),
					when(boundOr("ym_flg"))
						.select(aggr,T.pr("ym"))
						.groupBy(aggr,T.pr("ym")),
					when(boundOr("src_wg_flg"))
						.select(aggr,T.pr("src_wg_cd"))
						.groupBy(aggr,T.pr("src_wg_cd")),
					when(boundOr("src_wg_flg"))
						.select(aggr,T.pr("src_wg_nm"))
						.groupBy(aggr,T.pr("src_wg_nm")),
					when(boundOr("src_alc_ac_flg"))
						.select(aggr,T.pr("src_alc_ac_cd"))
						.groupBy(aggr,T.pr("src_alc_ac_cd")),
					when(boundOr("src_alc_ac_flg"))
						.select(core,S0SRC_ALC_AC.alc_ac_nm.as("src_alc_ac_nm"))
						.select(aggr,T.pr("src_alc_ac_nm"))
						.groupBy(core,S0SRC_ALC_AC.alc_ac_nm)
						.groupBy(aggr,T.pr("src_alc_ac_nm")),
					when(boundOr("src_alc_ac_grp_nm1"))
						.view(core, v -> v.leftOuterJoin(SRC_ALC_AC_GRP1).on(value(MAC_ALC_AC_GRP_TYP.GRP1.value()).eq(SRC_ALC_AC_GRP1.alc_ac_grp_typ).and(S0SRC_ALC_AC.alc_ac_grp_cd1.eq(SRC_ALC_AC_GRP1.alc_ac_grp_cd))))
						.predicate(core, p -> p.cutoff$and(SRC_ALC_AC_GRP1.alc_ac_grp_nm.like(bind("SRC_ALC_AC_GRP_NM1")))),
					when(boundOr("src_alc_ac_grp_nm2"))
						.view(core, v -> v.leftOuterJoin(SRC_ALC_AC_GRP2).on(value(MAC_ALC_AC_GRP_TYP.GRP2.value()).eq(SRC_ALC_AC_GRP2.alc_ac_grp_typ).and(S0SRC_ALC_AC.alc_ac_grp_cd2.eq(SRC_ALC_AC_GRP2.alc_ac_grp_cd))))
						.predicate(core, p -> p.cutoff$and(SRC_ALC_AC_GRP2.alc_ac_grp_nm.like(bind("SRC_ALC_AC_GRP_NM2")))),
					when(boundOr("src_alc_ac_grp_nm3"))
						.view(core, v -> v.leftOuterJoin(SRC_ALC_AC_GRP3).on(value(MAC_ALC_AC_GRP_TYP.GRP3.value()).eq(SRC_ALC_AC_GRP3.alc_ac_grp_typ).and(S0SRC_ALC_AC.alc_ac_grp_cd3.eq(SRC_ALC_AC_GRP3.alc_ac_grp_cd))))
						.predicate(core, p -> p.cutoff$and(SRC_ALC_AC_GRP3.alc_ac_grp_nm.like(bind("SRC_ALC_AC_GRP_NM3")))),
					when(boundOr("dest_wg_flg"))
						.select(aggr,T.pr("dest_wg_cd"))
						.groupBy(aggr,T.pr("dest_wg_cd")),
					when(boundOr("dest_wg_flg"))
						.select(aggr,T.pr("dest_wg_nm"))
						.groupBy(aggr,T.pr("dest_wg_nm")),
					when(boundOr("dest_alc_ac_flg"))
						.select(aggr,T.pr("dest_alc_ac_cd"))
						.groupBy(aggr,T.pr("dest_alc_ac_cd")),
					when(boundOr("dest_alc_ac_flg"))
						.select(core,S0DEST_ALC_AC.alc_ac_nm.as("dest_alc_ac_nm"))
						.select(aggr,T.pr("dest_alc_ac_nm"))
						.groupBy(core,S0DEST_ALC_AC.alc_ac_nm)
						.groupBy(aggr,T.pr("dest_alc_ac_nm")),
					when(boundOr("dest_alc_ac_grp_nm1"))
						.view(core, v -> v.leftOuterJoin(DEST_ALC_AC_GRP1).on(value(MAC_ALC_AC_GRP_TYP.GRP1.value()).eq(DEST_ALC_AC_GRP1.alc_ac_grp_typ).and(S0DEST_ALC_AC.alc_ac_grp_cd1.eq(DEST_ALC_AC_GRP1.alc_ac_grp_cd))))
						.predicate(core, p -> p.cutoff$and(DEST_ALC_AC_GRP1.alc_ac_grp_nm.like(bind("DEST_ALC_AC_GRP_NM1")))),
					when(boundOr("dest_alc_ac_grp_nm2"))
						.view(core, v -> v.leftOuterJoin(DEST_ALC_AC_GRP2).on(value(MAC_ALC_AC_GRP_TYP.GRP2.value()).eq(DEST_ALC_AC_GRP2.alc_ac_grp_typ).and(S0DEST_ALC_AC.alc_ac_grp_cd2.eq(DEST_ALC_AC_GRP2.alc_ac_grp_cd))))
						.predicate(core, p -> p.cutoff$and(DEST_ALC_AC_GRP2.alc_ac_grp_nm.like(bind("DEST_ALC_AC_GRP_NM2")))),
					when(boundOr("dest_alc_ac_grp_nm3"))
						.view(core, v -> v.leftOuterJoin(DEST_ALC_AC_GRP3).on(value(MAC_ALC_AC_GRP_TYP.GRP3.value()).eq(DEST_ALC_AC_GRP3.alc_ac_grp_typ).and(S0DEST_ALC_AC.alc_ac_grp_cd3.eq(DEST_ALC_AC_GRP3.alc_ac_grp_cd))))
						.predicate(core, p -> p.cutoff$and(DEST_ALC_AC_GRP3.alc_ac_grp_nm.like(bind("DEST_ALC_AC_GRP_NM3")))),
					when(boundOr("dpt_flg"))
						.select(aggr,T.pr("dpt_cd"))
						.groupBy(aggr,T.pr("dpt_cd")),
					when(boundOr("dpt_flg"))
						.select(core,DPT.dpt_nm.as("dpt_nm"))
						.select(aggr,T.pr("dpt_nm"))
						.groupBy(core,DPT.dpt_nm)
						.groupBy(aggr,T.pr("dpt_nm")),
					when(boundOr("dpt_flg","dpt_nm"))
						.view(core, v -> v.leftOuterJoin(DPT).on(S0T.dpt_cd.eq(DPT.dpt_cd).and(TERM.term.eq(DPT.term))))
						.predicate(core, p -> p.cutoff$and(DPT.dpt_nm.like(bind("DPT_NM")))),
					when(boundOr("loc_flg"))
						.select(aggr,T.pr("loc_cd"))
						.groupBy(aggr,T.pr("loc_cd")),
					when(boundOr("loc_flg"))
						.select(core,LOC.loc_nm.as("loc_nm"))
						.select(aggr,T.pr("loc_nm"))
						.groupBy(core,LOC.loc_nm)
						.groupBy(aggr,T.pr("loc_nm")),
					when(boundOr("loc_flg","loc_nm"))
						.view(core, v -> v.leftOuterJoin(LOC).on(S0T.loc_cd.eq(LOC.loc_cd)))
						.predicate(core, p -> p.cutoff$and(LOC.loc_nm.like(bind("LOC_NM")))),
					when(boundOr("oper_flg"))
						.select(aggr,T.pr("oper_cd"))
						.groupBy(aggr,T.pr("oper_cd")),
					when(boundOr("oper_flg"))
						.select(core,OPER.oper_nm.as("oper_nm"))
						.select(aggr,T.pr("oper_nm"))
						.groupBy(core,OPER.oper_nm)
						.groupBy(aggr,T.pr("oper_nm")),
					when(boundOr("oper_flg","oper_nm"))
						.view(core, v -> v.leftOuterJoin(OPER).on(S0T.oper_cd.eq(OPER.oper_cd)))
						.predicate(core, p -> p.cutoff$and(OPER.oper_nm.like(bind("OPER_NM")))),
					when(boundOr("bp_flg"))
						.select(aggr,T.pr("bp_cd"))
						.groupBy(aggr,T.pr("bp_cd")),
					when(boundOr("bp_flg"))
						.select(core,BP.bp_nm.as("bp_nm"))
						.select(aggr,T.pr("bp_nm"))
						.groupBy(core,BP.bp_nm)
						.groupBy(aggr,T.pr("bp_nm")),
					when(boundOr("bp_flg","bp_nm"))
						.view(core, v -> v.leftOuterJoin(BP).on(S0T.bp_cd.eq(BP.bp_cd)))
						.predicate(core, p -> p.cutoff$and(BP.bp_nm.like(bind("BP_NM")))),
					when(boundOr("ctg_flg"))
						.select(aggr,T.pr("ctg_cd"))
						.groupBy(aggr,T.pr("ctg_cd")),
					when(boundOr("ctg_flg"))
						.select(core,CTG.ctg_nm.as("ctg_nm"))
						.select(aggr,T.pr("ctg_nm"))
						.groupBy(core,CTG.ctg_nm)
						.groupBy(aggr,T.pr("ctg_nm")),
					when(boundOr("ctg_flg","ctg_nm"))
						.view(core, v -> v.leftOuterJoin(CTG).on(S0T.ctg_cd.eq(CTG.ctg_cd)))
						.predicate(core, p -> p.cutoff$and(CTG.ctg_nm.like(bind("CTG_NM")))),
					when(boundOr("itm_typ_flg"))
						.select(core,ITM.itm_typ.as("itm_typ"))
						.select(aggr,T.pr("itm_typ"))
						.groupBy(core,ITM.itm_typ)
						.groupBy(aggr,T.pr("itm_typ")),
					when(boundOr("itm_typ_d_flg"))
						.select(core,ITM.itm_typ_d_cd.as("itm_typ_d_cd"))
						.select(aggr,T.pr("itm_typ_d_cd"))
						.groupBy(core,ITM.itm_typ_d_cd)
						.groupBy(aggr,T.pr("itm_typ_d_cd")),
					when(boundOr("itm_typ_d_flg"))
						.select(core,ITM_TYP_D.itm_typ_d_nm.as("itm_typ_d_nm"))
						.select(aggr,T.pr("itm_typ_d_nm"))
						.groupBy(core,ITM_TYP_D.itm_typ_d_nm)
						.groupBy(aggr,T.pr("itm_typ_d_nm")),
					when(boundOr("itm_typ_d_flg","itm_typ_d_nm"))
						.view(core, v -> v.leftOuterJoin(ITM_TYP_D).on(ITM.itm_typ.eq(ITM_TYP_D.itm_typ).and(ITM.itm_typ_d_cd.eq(ITM_TYP_D.itm_typ_d_cd))))
						.predicate(core, p -> p.cutoff$and(ITM_TYP_D.itm_typ_d_nm.like(bind("ITM_TYP_D_NM")))),
					when(boundOr("itm_flg"))
						.select(aggr,T.pr("itm_cd"))
						.groupBy(aggr,T.pr("itm_cd")),
					when(boundOr("itm_flg"))
						.select(aggr,T.pr("itm_sub1"))
						.groupBy(aggr,T.pr("itm_sub1")),
					when(boundOr("itm_flg"))
						.select(aggr,T.pr("itm_sub2"))
						.groupBy(aggr,T.pr("itm_sub2")),
					when(boundOr("itm_flg"))
						.select(aggr,T.pr("itm_sub3"))
						.groupBy(aggr,T.pr("itm_sub3")),
					when(boundOr("itm_flg"))
						.select(core,nvl(SUNDRY_ITM.itm_nm,ITM.itm_nm).as("itm_nm"))
						.select(aggr,T.pr("itm_nm"))
						.groupBy(core,nvl(SUNDRY_ITM.itm_nm,ITM.itm_nm))
						.groupBy(aggr,T.pr("itm_nm")),
					when(boundOr("itm_flg","itm_nm"))
						.view(core, v -> v.leftOuterJoin(SUNDRY_ITM).on(S0T.itm_cd.eq(SUNDRY_ITM.itm_cd).and(S0T.itm_sub1.eq(SUNDRY_ITM.itm_sub1)).and(S0T.itm_sub2.eq(SUNDRY_ITM.itm_sub2)).and(S0T.itm_sub3.eq(SUNDRY_ITM.itm_sub3)).and(S0T.sno1.eq(SUNDRY_ITM.sno1)).and(S0T.sno2.eq(SUNDRY_ITM.sno2)).and(S0T.sno3.eq(SUNDRY_ITM.sno3)).and(S0T.sno4.eq(SUNDRY_ITM.sno4))))
						.predicate(core, p -> p.cutoff$and(nvl(SUNDRY_ITM.itm_nm,ITM.itm_nm).like(bind("ITM_NM")))),
					when(boundOr("lot_flg"))
						.select(aggr,T.pr("lot_no"))
						.groupBy(aggr,T.pr("lot_no")),
					when(boundOr("sublot_flg"))
						.select(aggr,T.pr("sublot_no"))
						.groupBy(aggr,T.pr("sublot_no")),
					when(boundOr("sno1_flg"))
						.select(aggr,T.pr("sno1"))
						.groupBy(aggr,T.pr("sno1")),
					when(boundOr("sno2_flg"))
						.select(aggr,T.pr("sno2"))
						.groupBy(aggr,T.pr("sno2")),
					when(boundOr("sno3_flg"))
						.select(aggr,T.pr("sno3"))
						.groupBy(aggr,T.pr("sno3")),
					when(boundOr("sno4_flg"))
						.select(aggr,T.pr("sno4"))
						.groupBy(aggr,T.pr("sno4")),
					when(boundOr("itm_mfg_inst_flg"))
						.select(aggr,T.pr("itm_mfg_inst_no"))
						.groupBy(aggr,T.pr("itm_mfg_inst_no")),
					when(boundOr("iv_flg"))
						.select(aggr,T.pr("iv_no"))
						.groupBy(aggr,T.pr("iv_no")),
					when(boundOr("po_flg"))
						.select(aggr,T.pr("po_no"))
						.groupBy(aggr,T.pr("po_no")),
					when(boundOr("slo_flg"))
						.select(aggr,T.pr("slo_no"))
						.groupBy(aggr,T.pr("slo_no")),
					when(boundOr("down0_flg"))
						.select(aggr,nvl(sum(T.pr("amt")),value(0)).as("ttl")),
					when(boundOr("down0_flg"))
						.select(aggr,T.pr("dpt_cd2"))
						.groupBy(aggr,T.pr("dpt_cd2")),
					when(boundOr("down1_flg"))
						.select(aggr,T.pr("dpt_cd2"))
						.groupBy(aggr,T.pr("dpt_cd2")),
					when(boundOr("down1_flg"))
						.select(core,DPT2.dpt_nm.as("dpt_nm2"))
						.select(aggr,T.pr("dpt_nm2"))
						.groupBy(core,DPT2.dpt_nm)
						.groupBy(aggr,T.pr("dpt_nm2")),
					when(boundOr("down1_flg","down1_flg"))
						.view(core, v -> v.leftOuterJoin(DPT2).on(S0T2.dpt_cd.eq(DPT2.dpt_cd).and(TERM.term.eq(DPT2.term))))
				);
	}
	
	/**
	 * -- MGBDL0250_MGT_PRE_ALC_PATH_Query_S02
	 */
	static MCQueryPlan MGBDL0250_MGT_PRE_ALC_PATH_S02() {
		MGT_PRE_ALC_PATH_R S0T2 = MGT_PRE_ALC_PATH_R.create("T2");
		MGT_PRE_ALC_PATH_R S0T = MGT_PRE_ALC_PATH_R.create("T");
		MAM_ALC_AC_R S0SRC_ALC_AC = MAM_ALC_AC_R.create("SRC_ALC_AC");
		MAM_ALC_AC_R S0DEST_ALC_AC = MAM_ALC_AC_R.create("DEST_ALC_AC");
		MAVM_RD_WG_R S0SRC_DAC = MAVM_RD_WG_R.create("SRC_DAC");
		MAVM_RD_WG_R S0DEST_DAC = MAVM_RD_WG_R.create("DEST_DAC");
		MAM_TERM_R TERM = MAM_TERM_R.create("TERM");
		MAM_ITM_R ITM = MAM_ITM_R.create("ITM");
		MAM_ALC_AC_GRP_R SRC_ALC_AC_GRP1 = MAM_ALC_AC_GRP_R.create("SRC_ALC_AC_GRP1");
		MAM_ALC_AC_GRP_R SRC_ALC_AC_GRP2 = MAM_ALC_AC_GRP_R.create("SRC_ALC_AC_GRP2");
		MAM_ALC_AC_GRP_R SRC_ALC_AC_GRP3 = MAM_ALC_AC_GRP_R.create("SRC_ALC_AC_GRP3");
		MAM_ALC_AC_GRP_R DEST_ALC_AC_GRP1 = MAM_ALC_AC_GRP_R.create("DEST_ALC_AC_GRP1");
		MAM_ALC_AC_GRP_R DEST_ALC_AC_GRP2 = MAM_ALC_AC_GRP_R.create("DEST_ALC_AC_GRP2");
		MAM_ALC_AC_GRP_R DEST_ALC_AC_GRP3 = MAM_ALC_AC_GRP_R.create("DEST_ALC_AC_GRP3");
		MAM_COST_DPT_R DPT = MAM_COST_DPT_R.create("DPT");
		MAM_LOC_R LOC = MAM_LOC_R.create("LOC");
		MAM_OPER_R OPER = MAM_OPER_R.create("OPER");
		MAM_BP_R BP = MAM_BP_R.create("BP");
		MAM_COST_CTG_R CTG = MAM_COST_CTG_R.create("CTG");
		MAM_ITM_TYP_D_R ITM_TYP_D = MAM_ITM_TYP_D_R.create("ITM_TYP_D");
		MAM_SUNDRY_ITM_R SUNDRY_ITM = MAM_SUNDRY_ITM_R.create("SUNDRY_ITM");
		MAM_COST_DPT_R DPT2 = MAM_COST_DPT_R.create("DPT2");

		MCTempView T = createTempView("T");

		MCDynamicSQLID core = createDynamicSQLID("core");
		MCDynamicSQLID aggr = createDynamicSQLID("aggr");

		return createQueryPlan()
			.setQuery(
				sql("MGBDL0250_MGT_PRE_ALC_PATH_Query_S02")
				.mainQuery()
				.select(
					addDynamicSelect(aggr)
				)
				.from(
					subQuery()
					.select(
							S0T.pre_alc_lvl,
							S0T.ym,
							S0T.wg_cd.as("dest_wg_cd"),
							S0DEST_DAC.wg_nm.as("dest_wg_nm"),
							S0T.alc_ac_cd.as("dest_alc_ac_cd"),
							S0T.dpt_cd,
							S0T.loc_cd,
							S0T.oper_cd,
							S0T.bp_cd,
							S0T.ctg_cd,
							S0T.itm_cd,
							S0T.itm_sub1,
							S0T.itm_sub2,
							S0T.itm_sub3,
							S0T.wg_cd,
							S0DEST_DAC.wg_nm,
							S0T.lot_no,
							S0T.sublot_no,
							S0T.sno1,
							S0T.sno2,
							S0T.sno3,
							S0T.sno4,
							S0T.itm_mfg_inst_no,
							S0T.iv_no,
							S0T.po_no,
							S0T.slo_no,
							S0T2.wg_cd.as("src_wg_cd"),
							S0SRC_DAC.wg_nm.as("src_wg_nm"),
							S0T2.alc_ac_cd.as("src_alc_ac_cd"),
							nvl(
								S0T2.dpt_cd,
								value(MAC_STR.NULL_VAL.value())
							).as("dpt_cd2"),
							S0T.amt,
							addDynamicSelect(core)
						)
						.from(
							S0T2
							.innerJoin(S0T).on(
								S0T.calc_no.eq(S0T2.calc_no)
								.and(S0T.calc_grp_cd.eq(S0T2.calc_grp_cd))
							)
							.leftOuterJoin(S0SRC_ALC_AC).on(S0T2.alc_ac_cd.eq(S0SRC_ALC_AC.alc_ac_cd))
							.leftOuterJoin(S0DEST_ALC_AC).on(S0T.alc_ac_cd.eq(S0DEST_ALC_AC.alc_ac_cd))
							.innerJoin(S0SRC_DAC).on(S0T2.wg_cd.eq(S0SRC_DAC.wg_cd))
							.innerJoin(S0DEST_DAC).on(S0T.wg_cd.eq(S0DEST_DAC.wg_cd))
							.addDynamicView(core)
						)
						.where(
							value(0).eq(value(0))
							.cutoff$and(S0T2.calc_no.like(bind("calc_no")))
							.and(S0T2.calc_grp_cd.eq(bind("calc_grp_cd")))
							.cutoff$and(S0SRC_ALC_AC.alc_ac_nm.like(bind("src_alc_ac_nm")))
							.cutoff$and(S0SRC_ALC_AC.alc_ac_grp_cd1.like(bind("src_alc_ac_grp_cd1")))
							.cutoff$and(S0SRC_ALC_AC.alc_ac_grp_cd2.like(bind("src_alc_ac_grp_cd2")))
							.cutoff$and(S0SRC_ALC_AC.alc_ac_grp_cd3.like(bind("src_alc_ac_grp_cd3")))
							.cutoff$and(S0DEST_ALC_AC.alc_ac_nm.like(bind("dest_alc_ac_nm")))
							.cutoff$and(S0DEST_ALC_AC.alc_ac_grp_cd1.like(bind("dest_alc_ac_grp_cd1")))
							.cutoff$and(S0DEST_ALC_AC.alc_ac_grp_cd2.like(bind("dest_alc_ac_grp_cd2")))
							.cutoff$and(S0DEST_ALC_AC.alc_ac_grp_cd3.like(bind("dest_alc_ac_grp_cd3")))
							.cutoff$and(
								bind("pre_alc_lvl_flg_off").eq(value(false))
								.and(S0T2.pre_alc_lvl.eq(value(0)))
								.and(S0T.top_pre_alc_seq.eq(S0T2.pre_alc_seq))
								.and(S0T.fin_flg.eq(value(true)))
							)
							.cutoff$and(
								bind("pre_alc_lvl_flg_on").eq(value(true))
								.and(S0T.src_pre_alc_seq.eq(S0T2.pre_alc_seq))
							)
							.cutoff$and(S0T2.wg_cd.like(bind("src_wg_cd")))
							.cutoff$and(S0SRC_DAC.wg_nm.like(bind("src_wg_nm")))
							.cutoff$and(S0T2.alc_ac_cd.like(bind("src_alc_ac_cd")))
							.cutoff$and(S0T.wg_cd.like(bind("dest_wg_cd")))
							.cutoff$and(S0DEST_DAC.wg_nm.like(bind("dest_wg_nm")))
							.cutoff$and(S0T.alc_ac_cd.like(bind("dest_alc_ac_cd")))
							.cutoff$and(S0T.ym.gte(bind("ym_fr")))
							.cutoff$and(S0T.ym.lte(bind("ym_to")))
							.cutoff$and(S0T.dpt_cd.like(bind("dpt_cd")))
							.cutoff$and(S0T.loc_cd.like(bind("loc_cd")))
							.cutoff$and(S0T.oper_cd.like(bind("oper_cd")))
							.cutoff$and(S0T.bp_cd.like(bind("bp_cd")))
							.cutoff$and(S0T.ctg_cd.like(bind("ctg_cd")))
							.cutoff$and(S0T.itm_cd.like(bind("itm_cd")))
							.cutoff$and(S0T.itm_sub1.like(bind("itm_sub1")))
							.cutoff$and(S0T.itm_sub2.like(bind("itm_sub2")))
							.cutoff$and(S0T.itm_sub3.like(bind("itm_sub3")))
							.cutoff$and(S0T.lot_no.like(bind("lot_no")))
							.cutoff$and(S0T.sublot_no.like(bind("sublot_no")))
							.cutoff$and(S0T.sno1.like(bind("sno1")))
							.cutoff$and(S0T.sno2.like(bind("sno2")))
							.cutoff$and(S0T.sno3.like(bind("sno3")))
							.cutoff$and(S0T.sno4.like(bind("sno4")))
							.cutoff$and(S0T.itm_mfg_inst_no.like(bind("itm_mfg_inst_no")))
							.cutoff$and(S0T.iv_no.like(bind("iv_no")))
							.cutoff$and(S0T.po_no.like(bind("po_no")))
							.cutoff$and(S0T.slo_no.like(bind("slo_no")))
							.addDynamicPredicate(core)
						)
					.view(T)
				)
				.groupBy(
					addDynamicGroupBy(aggr)
				)
		)
			.setDynamicSQLInfo(
				when(boundOr("dpt_flg","dpt_nm","down1_flg"))
					.view(core, v -> v.innerJoin(TERM).on(S0T.ym.gte(TERM.term).and(S0T.ym.lt(TERM.term_end_ym)))),
				when(boundOr("itm_flg","itm_typ_flg","itm_typ_d_flg","itm_nm","itm_typ","itm_typ_d_cd","itm_typ_d_nm"))
					.view(core, v -> v.leftOuterJoin(ITM).on(S0T.itm_cd.eq(ITM.itm_cd).and(S0T.itm_sub1.eq(ITM.itm_sub1)).and(S0T.itm_sub2.eq(ITM.itm_sub2)).and(S0T.itm_sub3.eq(ITM.itm_sub3))))
					.predicate(core, p -> p.cutoff$and(ITM.itm_typ.like(bind("ITM_TYP"))).cutoff$and(ITM.itm_typ_d_cd.like(bind("ITM_TYP_D_CD")))),
				when(boundOr("pre_alc_lvl_flg"))
					.select(aggr,T.pr("pre_alc_lvl"))
					.groupBy(aggr,T.pr("pre_alc_lvl")),
				when(boundOr("ym_flg"))
					.select(aggr,T.pr("ym"))
					.groupBy(aggr,T.pr("ym")),
				when(boundOr("src_wg_flg"))
					.select(aggr,T.pr("src_wg_cd"))
					.groupBy(aggr,T.pr("src_wg_cd")),
				when(boundOr("src_wg_flg"))
					.select(aggr,T.pr("src_wg_nm"))
					.groupBy(aggr,T.pr("src_wg_nm")),
				when(boundOr("src_alc_ac_flg"))
					.select(aggr,T.pr("src_alc_ac_cd"))
					.groupBy(aggr,T.pr("src_alc_ac_cd")),
				when(boundOr("src_alc_ac_flg"))
					.select(core,S0SRC_ALC_AC.alc_ac_nm.as("src_alc_ac_nm"))
					.select(aggr,T.pr("src_alc_ac_nm"))
					.groupBy(core,S0SRC_ALC_AC.alc_ac_nm)
					.groupBy(aggr,T.pr("src_alc_ac_nm")),
				when(boundOr("src_alc_ac_grp_nm1"))
					.view(core, v -> v.leftOuterJoin(SRC_ALC_AC_GRP1).on(value(MAC_ALC_AC_GRP_TYP.GRP1.value()).eq(SRC_ALC_AC_GRP1.alc_ac_grp_typ).and(S0SRC_ALC_AC.alc_ac_grp_cd1.eq(SRC_ALC_AC_GRP1.alc_ac_grp_cd))))
					.predicate(core, p -> p.cutoff$and(SRC_ALC_AC_GRP1.alc_ac_grp_nm.like(bind("SRC_ALC_AC_GRP_NM1")))),
				when(boundOr("src_alc_ac_grp_nm2"))
					.view(core, v -> v.leftOuterJoin(SRC_ALC_AC_GRP2).on(value(MAC_ALC_AC_GRP_TYP.GRP2.value()).eq(SRC_ALC_AC_GRP2.alc_ac_grp_typ).and(S0SRC_ALC_AC.alc_ac_grp_cd2.eq(SRC_ALC_AC_GRP2.alc_ac_grp_cd))))
					.predicate(core, p -> p.cutoff$and(SRC_ALC_AC_GRP2.alc_ac_grp_nm.like(bind("SRC_ALC_AC_GRP_NM2")))),
				when(boundOr("src_alc_ac_grp_nm3"))
					.view(core, v -> v.leftOuterJoin(SRC_ALC_AC_GRP3).on(value(MAC_ALC_AC_GRP_TYP.GRP3.value()).eq(SRC_ALC_AC_GRP3.alc_ac_grp_typ).and(S0SRC_ALC_AC.alc_ac_grp_cd3.eq(SRC_ALC_AC_GRP3.alc_ac_grp_cd))))
					.predicate(core, p -> p.cutoff$and(SRC_ALC_AC_GRP3.alc_ac_grp_nm.like(bind("SRC_ALC_AC_GRP_NM3")))),
				when(boundOr("dest_wg_flg"))
					.select(aggr,T.pr("dest_wg_cd"))
					.groupBy(aggr,T.pr("dest_wg_cd")),
				when(boundOr("dest_wg_flg"))
					.select(aggr,T.pr("dest_wg_nm"))
					.groupBy(aggr,T.pr("dest_wg_nm")),
				when(boundOr("dest_alc_ac_flg"))
					.select(aggr,T.pr("dest_alc_ac_cd"))
					.groupBy(aggr,T.pr("dest_alc_ac_cd")),
				when(boundOr("dest_alc_ac_flg"))
					.select(core,S0DEST_ALC_AC.alc_ac_nm.as("dest_alc_ac_nm"))
					.select(aggr,T.pr("dest_alc_ac_nm"))
					.groupBy(core,S0DEST_ALC_AC.alc_ac_nm)
					.groupBy(aggr,T.pr("dest_alc_ac_nm")),
				when(boundOr("dest_alc_ac_grp_nm1"))
					.view(core, v -> v.leftOuterJoin(DEST_ALC_AC_GRP1).on(value(MAC_ALC_AC_GRP_TYP.GRP1.value()).eq(DEST_ALC_AC_GRP1.alc_ac_grp_typ).and(S0DEST_ALC_AC.alc_ac_grp_cd1.eq(DEST_ALC_AC_GRP1.alc_ac_grp_cd))))
					.predicate(core, p -> p.cutoff$and(DEST_ALC_AC_GRP1.alc_ac_grp_nm.like(bind("DEST_ALC_AC_GRP_NM1")))),
				when(boundOr("dest_alc_ac_grp_nm2"))
					.view(core, v -> v.leftOuterJoin(DEST_ALC_AC_GRP2).on(value(MAC_ALC_AC_GRP_TYP.GRP2.value()).eq(DEST_ALC_AC_GRP2.alc_ac_grp_typ).and(S0DEST_ALC_AC.alc_ac_grp_cd2.eq(DEST_ALC_AC_GRP2.alc_ac_grp_cd))))
					.predicate(core, p -> p.cutoff$and(DEST_ALC_AC_GRP2.alc_ac_grp_nm.like(bind("DEST_ALC_AC_GRP_NM2")))),
				when(boundOr("dest_alc_ac_grp_nm3"))
					.view(core, v -> v.leftOuterJoin(DEST_ALC_AC_GRP3).on(value(MAC_ALC_AC_GRP_TYP.GRP3.value()).eq(DEST_ALC_AC_GRP3.alc_ac_grp_typ).and(S0DEST_ALC_AC.alc_ac_grp_cd3.eq(DEST_ALC_AC_GRP3.alc_ac_grp_cd))))
					.predicate(core, p -> p.cutoff$and(DEST_ALC_AC_GRP3.alc_ac_grp_nm.like(bind("DEST_ALC_AC_GRP_NM3")))),
				when(boundOr("dpt_flg"))
					.select(aggr,T.pr("dpt_cd"))
					.groupBy(aggr,T.pr("dpt_cd")),
				when(boundOr("dpt_flg"))
					.select(core,DPT.dpt_nm.as("dpt_nm"))
					.select(aggr,T.pr("dpt_nm"))
					.groupBy(core,DPT.dpt_nm)
					.groupBy(aggr,T.pr("dpt_nm")),
				when(boundOr("dpt_flg","dpt_nm"))
					.view(core, v -> v.leftOuterJoin(DPT).on(S0T.dpt_cd.eq(DPT.dpt_cd).and(TERM.term.eq(DPT.term))))
					.predicate(core, p -> p.cutoff$and(DPT.dpt_nm.like(bind("DPT_NM")))),
				when(boundOr("loc_flg"))
					.select(aggr,T.pr("loc_cd"))
					.groupBy(aggr,T.pr("loc_cd")),
				when(boundOr("loc_flg"))
					.select(core,LOC.loc_nm.as("loc_nm"))
					.select(aggr,T.pr("loc_nm"))
					.groupBy(core,LOC.loc_nm)
					.groupBy(aggr,T.pr("loc_nm")),
				when(boundOr("loc_flg","loc_nm"))
					.view(core, v -> v.leftOuterJoin(LOC).on(S0T.loc_cd.eq(LOC.loc_cd)))
					.predicate(core, p -> p.cutoff$and(LOC.loc_nm.like(bind("LOC_NM")))),
				when(boundOr("oper_flg"))
					.select(aggr,T.pr("oper_cd"))
					.groupBy(aggr,T.pr("oper_cd")),
				when(boundOr("oper_flg"))
					.select(core,OPER.oper_nm.as("oper_nm"))
					.select(aggr,T.pr("oper_nm"))
					.groupBy(core,OPER.oper_nm)
					.groupBy(aggr,T.pr("oper_nm")),
				when(boundOr("oper_flg","oper_nm"))
					.view(core, v -> v.leftOuterJoin(OPER).on(S0T.oper_cd.eq(OPER.oper_cd)))
					.predicate(core, p -> p.cutoff$and(OPER.oper_nm.like(bind("OPER_NM")))),
				when(boundOr("bp_flg"))
					.select(aggr,T.pr("bp_cd"))
					.groupBy(aggr,T.pr("bp_cd")),
				when(boundOr("bp_flg"))
					.select(core,BP.bp_nm.as("bp_nm"))
					.select(aggr,T.pr("bp_nm"))
					.groupBy(core,BP.bp_nm)
					.groupBy(aggr,T.pr("bp_nm")),
				when(boundOr("bp_flg","bp_nm"))
					.view(core, v -> v.leftOuterJoin(BP).on(S0T.bp_cd.eq(BP.bp_cd)))
					.predicate(core, p -> p.cutoff$and(BP.bp_nm.like(bind("BP_NM")))),
				when(boundOr("ctg_flg"))
					.select(aggr,T.pr("ctg_cd"))
					.groupBy(aggr,T.pr("ctg_cd")),
				when(boundOr("ctg_flg"))
					.select(core,CTG.ctg_nm.as("ctg_nm"))
					.select(aggr,T.pr("ctg_nm"))
					.groupBy(core,CTG.ctg_nm)
					.groupBy(aggr,T.pr("ctg_nm")),
				when(boundOr("ctg_flg","ctg_nm"))
					.view(core, v -> v.leftOuterJoin(CTG).on(S0T.ctg_cd.eq(CTG.ctg_cd)))
					.predicate(core, p -> p.cutoff$and(CTG.ctg_nm.like(bind("CTG_NM")))),
				when(boundOr("itm_typ_flg"))
					.select(core,ITM.itm_typ.as("itm_typ"))
					.select(aggr,T.pr("itm_typ"))
					.groupBy(core,ITM.itm_typ)
					.groupBy(aggr,T.pr("itm_typ")),
				when(boundOr("itm_typ_d_flg"))
					.select(core,ITM.itm_typ_d_cd.as("itm_typ_d_cd"))
					.select(aggr,T.pr("itm_typ_d_cd"))
					.groupBy(core,ITM.itm_typ_d_cd)
					.groupBy(aggr,T.pr("itm_typ_d_cd")),
				when(boundOr("itm_typ_d_flg"))
					.select(core,ITM_TYP_D.itm_typ_d_nm.as("itm_typ_d_nm"))
					.select(aggr,T.pr("itm_typ_d_nm"))
					.groupBy(core,ITM_TYP_D.itm_typ_d_nm)
					.groupBy(aggr,T.pr("itm_typ_d_nm")),
				when(boundOr("itm_typ_d_flg","itm_typ_d_nm"))
					.view(core, v -> v.leftOuterJoin(ITM_TYP_D).on(ITM.itm_typ.eq(ITM_TYP_D.itm_typ).and(ITM.itm_typ_d_cd.eq(ITM_TYP_D.itm_typ_d_cd))))
					.predicate(core, p -> p.cutoff$and(ITM_TYP_D.itm_typ_d_nm.like(bind("ITM_TYP_D_NM")))),
				when(boundOr("itm_flg"))
					.select(aggr,T.pr("itm_cd"))
					.groupBy(aggr,T.pr("itm_cd")),
				when(boundOr("itm_flg"))
					.select(aggr,T.pr("itm_sub1"))
					.groupBy(aggr,T.pr("itm_sub1")),
				when(boundOr("itm_flg"))
					.select(aggr,T.pr("itm_sub2"))
					.groupBy(aggr,T.pr("itm_sub2")),
				when(boundOr("itm_flg"))
					.select(aggr,T.pr("itm_sub3"))
					.groupBy(aggr,T.pr("itm_sub3")),
				when(boundOr("itm_flg"))
					.select(core,nvl(SUNDRY_ITM.itm_nm,ITM.itm_nm).as("itm_nm"))
					.select(aggr,T.pr("itm_nm"))
					.groupBy(core,nvl(SUNDRY_ITM.itm_nm,ITM.itm_nm))
					.groupBy(aggr,T.pr("itm_nm")),
				when(boundOr("itm_flg","itm_nm"))
					.view(core, v -> v.leftOuterJoin(SUNDRY_ITM).on(S0T.itm_cd.eq(SUNDRY_ITM.itm_cd).and(S0T.itm_sub1.eq(SUNDRY_ITM.itm_sub1)).and(S0T.itm_sub2.eq(SUNDRY_ITM.itm_sub2)).and(S0T.itm_sub3.eq(SUNDRY_ITM.itm_sub3)).and(S0T.sno1.eq(SUNDRY_ITM.sno1)).and(S0T.sno2.eq(SUNDRY_ITM.sno2)).and(S0T.sno3.eq(SUNDRY_ITM.sno3)).and(S0T.sno4.eq(SUNDRY_ITM.sno4))))
					.predicate(core, p -> p.cutoff$and(nvl(SUNDRY_ITM.itm_nm,ITM.itm_nm).like(bind("ITM_NM")))),
				when(boundOr("lot_flg"))
					.select(aggr,T.pr("lot_no"))
					.groupBy(aggr,T.pr("lot_no")),
				when(boundOr("sublot_flg"))
					.select(aggr,T.pr("sublot_no"))
					.groupBy(aggr,T.pr("sublot_no")),
				when(boundOr("sno1_flg"))
					.select(aggr,T.pr("sno1"))
					.groupBy(aggr,T.pr("sno1")),
				when(boundOr("sno2_flg"))
					.select(aggr,T.pr("sno2"))
					.groupBy(aggr,T.pr("sno2")),
				when(boundOr("sno3_flg"))
					.select(aggr,T.pr("sno3"))
					.groupBy(aggr,T.pr("sno3")),
				when(boundOr("sno4_flg"))
					.select(aggr,T.pr("sno4"))
					.groupBy(aggr,T.pr("sno4")),
				when(boundOr("itm_mfg_inst_flg"))
					.select(aggr,T.pr("itm_mfg_inst_no"))
					.groupBy(aggr,T.pr("itm_mfg_inst_no")),
				when(boundOr("iv_flg"))
					.select(aggr,T.pr("iv_no"))
					.groupBy(aggr,T.pr("iv_no")),
				when(boundOr("po_flg"))
					.select(aggr,T.pr("po_no"))
					.groupBy(aggr,T.pr("po_no")),
				when(boundOr("slo_flg"))
					.select(aggr,T.pr("slo_no"))
					.groupBy(aggr,T.pr("slo_no")),
				when(boundOr("down0_flg"))
					.select(aggr,nvl(sum(T.pr("amt")),value(0)).as("ttl")),
				when(boundOr("down0_flg"))
					.select(aggr,T.pr("dpt_cd2"))
					.groupBy(aggr,T.pr("dpt_cd2")),
				when(boundOr("down1_flg"))
					.select(aggr,T.pr("dpt_cd2"))
					.groupBy(aggr,T.pr("dpt_cd2")),
				when(boundOr("down1_flg"))
					.select(core,DPT2.dpt_nm.as("dpt_nm2"))
					.select(aggr,T.pr("dpt_nm2"))
					.groupBy(core,DPT2.dpt_nm)
					.groupBy(aggr,T.pr("dpt_nm2")),
				when(boundOr("down1_flg","down1_flg"))
					.view(core, v -> v.leftOuterJoin(DPT2).on(S0T2.dpt_cd.eq(DPT2.dpt_cd).and(TERM.term.eq(DPT2.term))))
				);
	}
}