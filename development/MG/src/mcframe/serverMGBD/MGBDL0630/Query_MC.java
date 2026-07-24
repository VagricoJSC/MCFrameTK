package mcframe.serverMGBD.MGBDL0630;

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
	 * -- MGBDL0630_MGT_STD_ALC_RATE_Query_S01
	 */
	static MCQueryPlan MGBDL0630_MGT_STD_ALC_RATE_S01() {
		MGT_STD_ALC_RATE_R S0_T = MGT_STD_ALC_RATE_R.create("T");
		MAM_CALC_CTG_R S0_CALC_CTG = MAM_CALC_CTG_R.create("CALC_CTG");
		MAM_WG_R S0_WG = MAM_WG_R.create("WG");
		MAM_TERM_R S0_TERM = MAM_TERM_R.create("TERM");
		MAM_ALC_AC_R S0_ALC_AC = MAM_ALC_AC_R.create("ALC_AC");
		MAM_COST_DPT_R S0_DPT = MAM_COST_DPT_R.create("DPT");
		MAM_LOC_R S0_LOC = MAM_LOC_R.create("LOC");
		MAM_OPER_R S0_OPER = MAM_OPER_R.create("OPER");
		MAM_BP_R S0_BP = MAM_BP_R.create("BP");
		MAM_COST_CTG_R S0_CTG = MAM_COST_CTG_R.create("CTG");
		MAM_ITM_R S0_ITM = MAM_ITM_R.create("ITM");
		MAM_ALC_PTN_R S0_ALC_PTN = MAM_ALC_PTN_R.create("ALC_PTN");
		MAM_EXPNS_R S0_EXPNS = MAM_EXPNS_R.create("EXPNS");
		MAM_CALC_GRP_R S0_CALC_GRP = MAM_CALC_GRP_R.create("CALC_GRP");
		MAM_ALC_AC_GRP_R S0_ALC_AC_GRP1 = MAM_ALC_AC_GRP_R.create("ALC_AC_GRP1");
		MAM_ALC_AC_GRP_R S0_ALC_AC_GRP2 = MAM_ALC_AC_GRP_R.create("ALC_AC_GRP2");
		MAM_ALC_AC_GRP_R S0_ALC_AC_GRP3 = MAM_ALC_AC_GRP_R.create("ALC_AC_GRP3");
		MAVM_RD_WG_R S1_RDWG = MAVM_RD_WG_R.create("RDWG");
		
		MCDynamicSQLID DS0D = createDynamicSQLID("DS0D");
		
		return createQueryPlan()
			.setQuery(
				sql("MGBDL0630_MGT_STD_ALC_RATE_Query_S01")
					.mainQuery()
					.select(
						S0_T.fix_flg,
						S0_T.calc_ctg_cd,
						S0_T.wg_cd,
						S0_T.term,
						S0_T.alc_ac_cd,
						S0_T.dpt_cd,
						S0_T.loc_cd,
						S0_T.oper_cd,
						S0_T.bp_cd,
						S0_T.ctg_cd,
						S0_T.itm_cd,
						S0_T.itm_sub1,
						S0_T.itm_sub2,
						S0_T.itm_sub3,
						S0_T.alc_rate,
						S0_T.fix_alc_ptn_cd,
						S0_T.fix_expns_cd,
						S0_T.calc_grp_cd,
						S0_T.calc_no,
						S0_T.rmrks,
						S0_T.sub_char1,
						S0_T.sub_char2,
						S0_T.sub_char3,
						S0_T.non_calc_flg,
						S0_T.ins_usr_id,
						S0_T.ins_usr_nm,
						S0_T.ins_ts,
						S0_T.ins_func_id,
						S0_T.upd_cntr,
						S0_T.upd_usr_id,
						S0_T.upd_usr_nm,
						S0_T.upd_ts,
						S0_T.upd_func_id,
						S0_T.upd_srv_req_no,
						addDynamicSelect(DS0D)
					)
					.from(
						S0_T
						.addDynamicView()
						.addDynamicView(DS0D)
					)
					.where(
						value(0).eq(value(0))
						.and(
							exists(
								subQuery()
								.select(value("X"))
								.from(S1_RDWG)
								.where(
									S1_RDWG.wg_cd.eq(S0_T.wg_cd)
								)
							)
						)
						.cutoff$and(S0_T.calc_ctg_cd.like(bind("calc_ctg_cd")))
						.addDynamicPredicate()
						.cutoff$and(S0_T.wg_cd.like(bind("wg_cd")))
						.cutoff$and(S0_T.term.gte(bind("term_fr")))
						.cutoff$and(S0_T.term.lte(bind("term_to")))
						.cutoff$and(S0_T.alc_ac_cd.like(bind("alc_ac_cd")))
						.cutoff$and(S0_T.dpt_cd.like(bind("dpt_cd")))
						.cutoff$and(S0_T.loc_cd.like(bind("loc_cd")))
						.cutoff$and(S0_T.oper_cd.like(bind("oper_cd")))
						.cutoff$and(S0_T.bp_cd.like(bind("bp_cd")))
						.cutoff$and(S0_T.ctg_cd.like(bind("ctg_cd")))
						.cutoff$and(S0_T.itm_cd.like(bind("itm_cd")))
						.cutoff$and(S0_T.itm_sub1.like(bind("itm_sub1")))
						.cutoff$and(S0_T.itm_sub2.like(bind("itm_sub2")))
						.cutoff$and(S0_T.itm_sub3.like(bind("itm_sub3")))
						.cutoff$and(S0_T.rmrks.like(bind("rmrks")))
						.cutoff$and(S0_T.sub_char1.like(bind("sub_char1")))
						.cutoff$and(S0_T.sub_char2.like(bind("sub_char2")))
						.cutoff$and(S0_T.sub_char3.like(bind("sub_char3")))
						.cutoff$and(
							bind("no_dpt_flg_str").eq(value(true))
							.and(S0_T.dpt_cd.isNull())
						)
						.cutoff$and(
							bind("no_loc_flg_str").eq(value(true))
							.and(S0_T.loc_cd.isNull())
						)
						.cutoff$and(
							bind("no_oper_flg_str").eq(value(true))
							.and(S0_T.oper_cd.isNull())
						)
						.cutoff$and(
							bind("no_bp_flg_str").eq(value(true))
							.and(S0_T.bp_cd.isNull())
						)
						.cutoff$and(
							bind("no_ctg_flg_str").eq(value(true))
							.and(S0_T.ctg_cd.isNull())
						)
						.cutoff$and(
							bind("no_itm_flg_str").eq(value(true))
							.and(S0_T.itm_cd.isNull())
						)
						.cutoff$and(S0_T.non_calc_flg.eq(bind("non_calc_flg_str")))
						.cutoff$and(S0_T.fix_flg.eq(bind("fix_flg_str")))
						.addDynamicPredicate(DS0D)
					)
					.orderBy(
						S0_T.calc_ctg_cd.asc(),
						S0_T.wg_cd.asc(),
						S0_T.term.asc(),
						S0_T.alc_ac_cd.asc(),
						S0_T.dpt_cd.asc(),
						S0_T.loc_cd.asc(),
						S0_T.oper_cd.asc(),
						S0_T.bp_cd.asc(),
						S0_T.ctg_cd.asc(),
						S0_T.itm_cd.asc(),
						S0_T.itm_sub1.asc(),
						S0_T.itm_sub2.asc(),
						S0_T.itm_sub3.asc()
					)
			)
			.setDynamicSQLInfo(
				when(boundOr("calc_ctg_nm"))
					.view(v -> v.leftOuterJoin(S0_CALC_CTG).on(S0_T.calc_ctg_cd.eq(S0_CALC_CTG.calc_ctg_cd)))
					.predicate(p -> p.cutoff$and(S0_CALC_CTG.calc_ctg_nm.like(bind("calc_ctg_nm")))),
				when(boundOr("wg_nm"))
					.view(v -> v.leftOuterJoin(S0_WG).on(S0_T.wg_cd.eq(S0_WG.wg_cd)))
					.predicate(p -> p.cutoff$and(S0_WG.wg_nm.like(bind("wg_nm")))),
				when(boundOr("alc_ac_grp_nm1", "alc_ac_grp_nm2", "alc_ac_grp_nm3", "alc_ac_nm", "alc_ac_grp_cd1", "alc_ac_grp_cd2", "alc_ac_grp_cd3"))
					.view(v -> v.leftOuterJoin(S0_ALC_AC).on(S0_T.alc_ac_cd.eq(S0_ALC_AC.alc_ac_cd)))
					.predicate(p -> p.cutoff$and(S0_ALC_AC.alc_ac_nm.like(bind("alc_ac_nm"))).cutoff$and(S0_ALC_AC.alc_ac_grp_cd1.like(bind("alc_ac_grp_cd1"))).cutoff$and(S0_ALC_AC.alc_ac_grp_cd2.like(bind("alc_ac_grp_cd2"))).cutoff$and(S0_ALC_AC.alc_ac_grp_cd3.like(bind("alc_ac_grp_cd3")))),
				when(boundOr("dpt_nm"))
					.view(v -> v.leftOuterJoin(S0_DPT).on(S0_T.dpt_cd.eq(S0_DPT.dpt_cd).and(S0_T.term.eq(S0_DPT.term))))
					.predicate(p -> p.cutoff$and(S0_DPT.dpt_nm.like(bind("dpt_nm")))),
				when(boundOr("loc_nm"))
					.view(v -> v.leftOuterJoin(S0_LOC).on(S0_T.loc_cd.eq(S0_LOC.loc_cd)))
					.predicate(p -> p.cutoff$and(S0_LOC.loc_nm.like(bind("loc_nm")))),
				when(boundOr("oper_nm"))
					.view(v -> v.leftOuterJoin(S0_OPER).on(S0_T.oper_cd.eq(S0_OPER.oper_cd)))
					.predicate(p -> p.cutoff$and(S0_OPER.oper_nm.like(bind("oper_nm")))),
				when(boundOr("bp_nm"))
					.view(v -> v.leftOuterJoin(S0_BP).on(S0_T.bp_cd.eq(S0_BP.bp_cd)))
					.predicate(p -> p.cutoff$and(S0_BP.bp_nm.like(bind("bp_nm")))),
				when(boundOr("ctg_nm"))
					.view(v -> v.leftOuterJoin(S0_CTG).on(S0_T.ctg_cd.eq(S0_CTG.ctg_cd)))
					.predicate(p -> p.cutoff$and(S0_CTG.ctg_nm.like(bind("ctg_nm")))),
				when(boundOr("itm_nm"))
					.view(v -> v.leftOuterJoin(S0_ITM).on(S0_T.itm_cd.eq(S0_ITM.itm_cd).and(S0_T.itm_sub1.eq(S0_ITM.itm_sub1)).and(S0_T.itm_sub2.eq(S0_ITM.itm_sub2)).and(S0_T.itm_sub3.eq(S0_ITM.itm_sub3))))
					.predicate(p -> p.cutoff$and(S0_ITM.itm_nm.like(bind("itm_nm")))),
				when(boundOr("alc_ac_grp_nm1"))
					.view(DS0D, v -> v.leftOuterJoin(S0_ALC_AC_GRP1).on(value(MAC_ALC_AC_GRP_TYP.GRP1.value()).eq(S0_ALC_AC_GRP1.alc_ac_grp_typ).and(S0_ALC_AC.alc_ac_grp_cd1.eq(S0_ALC_AC_GRP1.alc_ac_grp_cd))))
					.predicate(DS0D, p -> p.cutoff$and(S0_ALC_AC_GRP1.alc_ac_grp_nm.like(bind("alc_ac_grp_nm1")))),
				when(boundOr("alc_ac_grp_nm2"))
					.view(DS0D, v -> v.leftOuterJoin(S0_ALC_AC_GRP2).on(value(MAC_ALC_AC_GRP_TYP.GRP2.value()).eq(S0_ALC_AC_GRP2.alc_ac_grp_typ).and(S0_ALC_AC.alc_ac_grp_cd2.eq(S0_ALC_AC_GRP2.alc_ac_grp_cd))))
					.predicate(DS0D, p -> p.cutoff$and(S0_ALC_AC_GRP2.alc_ac_grp_nm.like(bind("alc_ac_grp_nm2")))),
				when(boundOr("alc_ac_grp_nm3"))
					.view(DS0D, v -> v.leftOuterJoin(S0_ALC_AC_GRP3).on(value(MAC_ALC_AC_GRP_TYP.GRP3.value()).eq(S0_ALC_AC_GRP3.alc_ac_grp_typ).and(S0_ALC_AC.alc_ac_grp_cd3.eq(S0_ALC_AC_GRP3.alc_ac_grp_cd))))
					.predicate(DS0D, p -> p.cutoff$and(S0_ALC_AC_GRP3.alc_ac_grp_nm.like(bind("alc_ac_grp_nm3"))))
			)
			.setJoinInfo(
				joinInfo(
					j -> j
						.add(MAM_CALC_CTG_R.class, r -> toCondition(
							r.getStringNE("calc_ctg_cd")
						))
						.addSelect(m -> toArray(
							m.calc_ctg_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("calc_ctg_nm", m.calc_ctg_nm());
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
						.add(MAM_TERM_R.class, r -> toCondition(
							r.getDateNE("term")
						))
						.addSelect(m -> toArray(
							m.term_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("term_nm", m.term_nm());
					}),
					j -> j
						.add(MAM_ALC_AC_R.class, r -> toCondition(
							r.getStringNE("alc_ac_cd")
						))
						.addSelect(m -> toArray(
							m.alc_ac_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("alc_ac_nm", m.alc_ac_nm());
					}),
					j -> j
						.add(MAM_COST_DPT_R.class, r -> toCondition(
							r.getStringNE("dpt_cd"),
							r.getDateNE("term")
						))
						.addSelect(m -> toArray(
							m.dpt_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("dpt_nm", m.dpt_nm());
					}),
					j -> j
						.add(MAM_LOC_R.class, r -> toCondition(
							r.getStringNE("loc_cd")
						))
						.addSelect(m -> toArray(
							m.loc_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("loc_nm", m.loc_nm());
					}),
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
						.add(MAM_BP_R.class, r -> toCondition(
							r.getStringNE("bp_cd")
						))
						.addSelect(m -> toArray(
							m.bp_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("bp_nm", m.bp_nm());
					}),
					j -> j
						.add(MAM_COST_CTG_R.class, r -> toCondition(
							r.getStringNE("ctg_cd")
						))
						.addSelect(m -> toArray(
							m.ctg_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("ctg_nm", m.ctg_nm());
					}),
					j -> j
						.add(MAM_ITM_R.class, r -> toCondition(
							r.getStringNE("itm_cd"),
							r.getStringNE("itm_sub1"),
							r.getStringNE("itm_sub2"),
							r.getStringNE("itm_sub3")
						))
						.addSelect(m -> toArray(
							m.itm_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("itm_nm", m.itm_nm());
					}),
					j -> j
						.add(MAM_ALC_PTN_R.class, r -> toCondition(
							r.getStringNE("fix_alc_ptn_cd")
						))
						.addSelect(m -> toArray(
							m.alc_ptn_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("fix_alc_ptn_nm", m.alc_ptn_nm());
					}),
					j -> j
						.add(MAM_EXPNS_R.class, r -> toCondition(
							r.getStringNE("fix_expns_cd")
						))
						.addSelect(m -> toArray(
							m.expns_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("fix_expns_nm", m.expns_nm());
					}),
					j -> j
						.add(MAM_CALC_GRP_R.class, r -> toCondition(
							r.getStringNE("calc_grp_cd")
						))
						.addSelect(m -> toArray(
							m.calc_grp_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("calc_grp_nm", m.calc_grp_nm());
					})
				)
			);
	}
}