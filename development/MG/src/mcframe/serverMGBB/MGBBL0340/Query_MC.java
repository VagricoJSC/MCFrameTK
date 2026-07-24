package mcframe.serverMGBB.MGBBL0340;

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
	 * -- MGBBL0340_MGT_ACT_OTHER_WK_IF_Query_S01
	 */
	static MCQueryPlan MGBBL0340_MGT_ACT_OTHER_WK_IF_S01() {
		MGT_ACT_OTHER_WK_IF_R S0_T = MGT_ACT_OTHER_WK_IF_R.create("T");
		MAVM_RD_WG_R S0_WG = MAVM_RD_WG_R.create("WG");
		MAM_TERM_R S0_TERM = MAM_TERM_R.create("TERM");
		MAM_CALC_CTG_R S0_CALC_CTG = MAM_CALC_CTG_R.create("CALC_CTG");
		MAM_COST_DPT_R S0_DPT = MAM_COST_DPT_R.create("DPT");
		MAM_COST_CTG_R S0_CTG = MAM_COST_CTG_R.create("CTG");
		MAM_LOC_R S0_LOC = MAM_LOC_R.create("LOC");
		MAM_SITE_R S0_SITE = MAM_SITE_R.create("SITE");
		MAM_OPER_R S0_OPER = MAM_OPER_R.create("OPER");
		MAM_WK_COST_R S0_WK_COST = MAM_WK_COST_R.create("WK_COST");
		MAM_WK_RSN_R S0_WK_RSN = MAM_WK_RSN_R.create("WK_RSN");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MGBBL0340_MGT_ACT_OTHER_WK_IF_Query_S01")
					.mainQuery()
					.select(
						S0_T.data_lno,
						S0_T.calc_ctg_cd,
						S0_T.wg_cd,
						S0_T.ym,
						S0_T.ac_dt,
						S0_T.mfg_act_grp,
						S0_T.dpt_cd,
						S0_T.ctg_cd,
						S0_T.loc_cd,
						S0_T.oper_cd,
						S0_T.lot_no,
						S0_T.sublot_no,
						S0_T.sno1,
						S0_T.sno2,
						S0_T.sno3,
						S0_T.sno4,
						S0_T.wk_cost_cd,
						S0_T.wk_rsn_cd,
						S0_T.wk_cost,
						S0_T.no_pln_flg,
						S0_T.wk_act_no,
						S0_T.rmrks,
						S0_T.sub_char1,
						S0_T.sub_char2,
						S0_T.sub_char3,
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
						S0_WG.wg_nm,
						S0_WG.mfg_flg,
						// this field is appended by sql coverter.
						S0_TERM.term.as("join_term_")
					)
					.from(
						S0_T
						.innerJoin(S0_WG).on(S0_T.wg_cd.eq(S0_WG.wg_cd))
						.innerJoin(S0_TERM).on(
							S0_T.ym.gte(S0_TERM.term)
							.and(S0_T.ym.lt(S0_TERM.term_end_ym))
						)
						.addDynamicView()
					)
					.where(
						value(0).eq(value(0))
						.cutoff$and(S0_T.calc_ctg_cd.like(bind("calc_ctg_cd")))
						.addDynamicPredicate()
						.cutoff$and(S0_T.wg_cd.like(bind("wg_cd")))
						.cutoff$and(S0_WG.wg_nm.like(bind("wg_nm")))
						.cutoff$and(S0_T.ym.gte(bind("ym_fr")))
						.cutoff$and(S0_T.ym.lte(bind("ym_to")))
						.cutoff$and(S0_T.wk_act_no.like(bind("wk_act_no")))
						.cutoff$and(S0_T.mfg_act_grp.like(bind("mfg_act_grp")))
						.cutoff$and(S0_T.dpt_cd.like(bind("dpt_cd")))
						.cutoff$and(S0_T.ctg_cd.like(bind("ctg_cd")))
						.cutoff$and(S0_T.loc_cd.like(bind("loc_cd")))
						.cutoff$and(S0_T.oper_cd.like(bind("oper_cd")))
						.cutoff$and(S0_T.lot_no.like(bind("lot_no")))
						.cutoff$and(S0_T.sublot_no.like(bind("sublot_no")))
						.cutoff$and(S0_T.sno1.like(bind("sno1")))
						.cutoff$and(S0_T.sno2.like(bind("sno2")))
						.cutoff$and(S0_T.sno3.like(bind("sno3")))
						.cutoff$and(S0_T.sno4.like(bind("sno4")))
						.cutoff$and(S0_T.wk_cost_cd.like(bind("wk_cost_cd")))
						.cutoff$and(S0_T.wk_rsn_cd.like(bind("wk_rsn_cd")))
						.cutoff$and(S0_T.rmrks.like(bind("rmrks")))
						.cutoff$and(S0_T.sub_char1.like(bind("sub_char1")))
						.cutoff$and(S0_T.sub_char2.like(bind("sub_char2")))
						.cutoff$and(S0_T.sub_char3.like(bind("sub_char3")))
					)
					.orderBy(
						S0_T.calc_ctg_cd.asc(),
						S0_T.wg_cd.asc(),
						S0_T.ym.asc(),
						S0_T.ac_dt.asc(),
						S0_T.wk_act_no.asc(),
						S0_T.data_lno.asc()
					)
			)
			.setDynamicSQLInfo(
				when(boundOr("calc_ctg_nm"))
					.view(v -> v.leftOuterJoin(S0_CALC_CTG).on(S0_T.calc_ctg_cd.eq(S0_CALC_CTG.calc_ctg_cd)))
					.predicate(p -> p.cutoff$and(S0_CALC_CTG.calc_ctg_nm.like(bind("calc_ctg_nm")))),
				when(boundOr("dpt_nm"))
					.view(v -> v.leftOuterJoin(S0_DPT).on(S0_T.dpt_cd.eq(S0_DPT.dpt_cd).and(S0_TERM.term.eq(S0_DPT.term))))
					.predicate(p -> p.cutoff$and(S0_DPT.dpt_nm.like(bind("dpt_nm")))),
				when(boundOr("ctg_nm"))
					.view(v -> v.leftOuterJoin(S0_CTG).on(S0_T.ctg_cd.eq(S0_CTG.ctg_cd)))
					.predicate(p -> p.cutoff$and(S0_CTG.ctg_nm.like(bind("ctg_nm")))),
				when(boundOr("site_nm", "loc_nm", "site_cd"))
					.view(v -> v.leftOuterJoin(S0_LOC).on(S0_T.loc_cd.eq(S0_LOC.loc_cd)))
					.predicate(p -> p.cutoff$and(S0_LOC.loc_nm.like(bind("loc_nm"))).cutoff$and(S0_LOC.site_cd.like(bind("site_cd")))),
				when(boundOr("site_nm"))
					.view(v -> v.leftOuterJoin(S0_SITE).on(S0_LOC.site_cd.eq(S0_SITE.site_cd)))
					.predicate(p -> p.cutoff$and(S0_SITE.site_nm.like(bind("site_nm")))),
				when(boundOr("oper_nm"))
					.view(v -> v.leftOuterJoin(S0_OPER).on(S0_T.oper_cd.eq(S0_OPER.oper_cd)))
					.predicate(p -> p.cutoff$and(S0_OPER.oper_nm.like(bind("oper_nm")))),
				when(boundOr("wk_cost_nm"))
					.view(v -> v.leftOuterJoin(S0_WK_COST).on(S0_T.wk_cost_cd.eq(S0_WK_COST.wk_cost_cd)))
					.predicate(p -> p.cutoff$and(S0_WK_COST.wk_cost_nm.like(bind("wk_cost_nm")))),
				when(boundOr("wk_rsn_nm"))
					.view(v -> v.leftOuterJoin(S0_WK_RSN).on(S0_T.wk_rsn_cd.eq(S0_WK_RSN.wk_rsn_cd)))
					.predicate(p -> p.cutoff$and(S0_WK_RSN.wk_rsn_nm.like(bind("wk_rsn_nm"))))
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
						.add(MAM_COST_DPT_R.class, r -> toCondition(
							r.getStringNE("dpt_cd"),
							r.getDateNE("join_term_")
						))
						.addSelect(m -> toArray(
							m.dpt_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("dpt_nm", m.dpt_nm());
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
						.add(MAM_LOC_R.class, r -> toCondition(
							r.getStringNE("loc_cd")
						))
						.addSelect(m -> toArray(
							m.loc_nm,
							m.site_cd
						))
						.addMap((r, m) -> {
							r.setStringNE("loc_nm", m.loc_nm());
							r.setStringNE("site_cd", m.site_cd());
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
						.add(MAM_WK_COST_R.class, r -> toCondition(
							r.getStringNE("wk_cost_cd")
						))
						.addSelect(m -> toArray(
							m.dec_place,
							m.wk_cost_nm,
							m.wk_cost_unit_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("wk_cost_nm", m.wk_cost_nm());
							r.setNumberNE("dec_place", m.dec_place());
							r.setStringNE("wk_cost_unit_nm", m.wk_cost_unit_nm());
					}),
					j -> j
						.add(MAM_WK_RSN_R.class, r -> toCondition(
							r.getStringNE("wk_rsn_cd")
						))
						.addSelect(m -> toArray(
							m.wk_rsn_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("wk_rsn_nm", m.wk_rsn_nm());
					})
				)
			);
	}
}