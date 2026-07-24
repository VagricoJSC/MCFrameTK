package mcframe.serverMGBB.MGBBL0140;

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
	 * -- MGBBL0140_MGT_ACT_OTHER_WK_Query_S01
	 */
	static MCQueryPlan MGBBL0140_MGT_ACT_OTHER_WK_S01() {
		MCTempView S0_T = createTempView("T");
		MGT_ACT_OTHER_WK_R S1_T = MGT_ACT_OTHER_WK_R.create("T");
		MAVM_RD_WG_R S1_WG = MAVM_RD_WG_R.create("WG");
		MAM_WK_COST_R S1_WK_COST = MAM_WK_COST_R.create("WK_COST");
		MAM_CALC_CTG_R S1_CALC_CTG = MAM_CALC_CTG_R.create("CALC_CTG");
		MAM_COST_DPT_R S1_DPT = MAM_COST_DPT_R.create("DPT");
		MAM_COST_CTG_R S1_CTG = MAM_COST_CTG_R.create("CTG");
		MAM_LOC_R S1_LOC = MAM_LOC_R.create("LOC");
		MAM_SITE_R S1_SITE = MAM_SITE_R.create("SITE");
		MAM_OPER_R S1_OPER = MAM_OPER_R.create("OPER");
		MAM_WK_RSN_R S1_WK_RSN = MAM_WK_RSN_R.create("WK_RSN");
		MAM_TERM_R S1_TERM = MAM_TERM_R.create("TERM");
		
		MCDynamicSQLID DS0D = createDynamicSQLID("DS0D");
		MCDynamicSQLID DS1D = createDynamicSQLID("DS1D");
		
		return createQueryPlan()
			.setQuery(
				sql("MGBBL0140_MGT_ACT_OTHER_WK_Query_S01")
					.mainQuery()
					.select(addDynamicSelect(DS0D))
					.from(
						subQuery()
						.select(
							S1_T.calc_ctg_cd,
							S1_T.wg_cd,
							S1_WG.wg_nm,
							S1_T.ym,
							S1_T.ac_dt,
							S1_T.dpt_cd,
							S1_T.ctg_cd,
							S1_T.loc_cd,
							S1_T.oper_cd,
							S1_T.lot_no,
							S1_T.sublot_no,
							S1_T.sno1,
							S1_T.sno2,
							S1_T.sno3,
							S1_T.sno4,
							S1_T.wk_cost_cd,
							S1_T.wk_rsn_cd,
							S1_T.wk_cost,
							S1_WK_COST.wk_cost_nm,
							S1_WK_COST.dec_place,
							S1_WK_COST.wk_cost_unit_nm,
							S1_T.act_other_wk_id,
							S1_T.rmrks,
							S1_T.sub_char1,
							S1_T.sub_char2,
							S1_T.sub_char3,
							S1_T.ins_usr_id,
							S1_T.ins_usr_nm,
							S1_T.ins_func_id,
							S1_T.ins_ts,
							S1_T.upd_usr_id,
							S1_T.upd_usr_nm,
							S1_T.upd_func_id,
							S1_T.upd_ts,
							S1_T.upd_srv_req_no,
							addDynamicSelect(DS1D)
						)
						.from(
							S1_T
							.innerJoin(S1_WG).on(S1_T.wg_cd.eq(S1_WG.wg_cd))
							.leftOuterJoin(S1_WK_COST).on(S1_T.wk_cost_cd.eq(S1_WK_COST.wk_cost_cd))
							.addDynamicView(DS1D)
						)
						.where(
							value(0).eq(value(0))
							.cutoff$and(S1_T.calc_ctg_cd.like(bind("calc_ctg_cd")))
							.cutoff$and(S1_T.wg_cd.like(bind("wg_cd")))
							.cutoff$and(S1_WG.wg_nm.like(bind("wg_nm")))
							.cutoff$and(S1_T.ym.gte(bind("ym_fr")))
							.cutoff$and(S1_T.ym.lte(bind("ym_to")))
							.cutoff$and(S1_T.lot_no.like(bind("lot_no")))
							.cutoff$and(S1_T.sublot_no.like(bind("sublot_no")))
							.cutoff$and(S1_T.sno1.like(bind("sno1")))
							.cutoff$and(S1_T.sno2.like(bind("sno2")))
							.cutoff$and(S1_T.sno3.like(bind("sno3")))
							.cutoff$and(S1_T.sno4.like(bind("sno4")))
							.cutoff$and(S1_T.dpt_cd.like(bind("dpt_cd")))
							.cutoff$and(S1_T.loc_cd.like(bind("loc_cd")))
							.cutoff$and(S1_T.oper_cd.like(bind("oper_cd")))
							.cutoff$and(S1_T.wk_cost_cd.like(bind("wk_cost_cd")))
							.cutoff$and(S1_T.wk_rsn_cd.like(bind("wk_rsn_cd")))
							.cutoff$and(S1_T.rmrks.like(bind("rmrks")))
							.cutoff$and(S1_T.sub_char1.like(bind("sub_char1")))
							.cutoff$and(S1_T.sub_char2.like(bind("sub_char2")))
							.cutoff$and(S1_T.sub_char3.like(bind("sub_char3")))
							.cutoff$and(S1_WK_COST.wk_cost_nm.like(bind("wk_cost_nm")))
							.addDynamicPredicate(DS1D)
						).view(S0_T)
					)
					.groupBy(addDynamicGroupBy(DS0D))
					.having(
						value(0).eq(value(0))
						.addDynamicPredicate(DS0D)
					)
					.orderBy(
						addDynamicOrderBy(DS0D)
					)
			)
			.setDynamicSQLInfo(
				when(boundOr("calc_ctg_flg"))
					.select(DS0D, S0_T.pr(S1_T.calc_ctg_cd))
					.groupBy(DS0D, S0_T.pr(S1_T.calc_ctg_cd)),
				when(boundOr("calc_ctg_flg"))
					.select(DS0D, S0_T.pr("calc_ctg_nm"))
					.groupBy(DS0D, S0_T.pr("calc_ctg_nm")),
				when(boundOr("wg_flg"))
					.select(DS0D, S0_T.pr(S1_T.wg_cd))
					.groupBy(DS0D, S0_T.pr(S1_T.wg_cd)),
				when(boundOr("wg_flg"))
					.select(DS0D, S0_T.pr(S1_WG.wg_nm))
					.groupBy(DS0D, S0_T.pr(S1_WG.wg_nm)),
				when(boundOr("ym_flg"))
					.select(DS0D, S0_T.pr(S1_T.ym))
					.groupBy(DS0D, S0_T.pr(S1_T.ym)),
				when(boundOr("ac_dt_flg"))
					.select(DS0D, S0_T.pr(S1_T.ac_dt))
					.groupBy(DS0D, S0_T.pr(S1_T.ac_dt)),
				when(boundOr("dpt_flg"))
					.select(DS0D, S0_T.pr(S1_T.dpt_cd))
					.groupBy(DS0D, S0_T.pr(S1_T.dpt_cd)),
				when(boundOr("dpt_flg"))
					.select(DS0D, S0_T.pr("dpt_nm"))
					.groupBy(DS0D, S0_T.pr("dpt_nm")),
				when(boundOr("ctg_flg"))
					.select(DS0D, S0_T.pr(S1_T.ctg_cd))
					.groupBy(DS0D, S0_T.pr(S1_T.ctg_cd)),
				when(boundOr("ctg_flg"))
					.select(DS0D, S0_T.pr("ctg_nm"))
					.groupBy(DS0D, S0_T.pr("ctg_nm")),
				when(boundOr("site_flg"))
					.select(DS0D, S0_T.pr("site_cd"))
					.groupBy(DS0D, S0_T.pr("site_cd")),
				when(boundOr("site_flg"))
					.select(DS0D, S0_T.pr("site_nm"))
					.groupBy(DS0D, S0_T.pr("site_nm")),
				when(boundOr("loc_flg"))
					.select(DS0D, S0_T.pr(S1_T.loc_cd))
					.groupBy(DS0D, S0_T.pr(S1_T.loc_cd)),
				when(boundOr("loc_flg"))
					.select(DS0D, S0_T.pr("loc_nm"))
					.groupBy(DS0D, S0_T.pr("loc_nm")),
				when(boundOr("oper_flg"))
					.select(DS0D, S0_T.pr(S1_T.oper_cd))
					.groupBy(DS0D, S0_T.pr(S1_T.oper_cd)),
				when(boundOr("oper_flg"))
					.select(DS0D, S0_T.pr("oper_nm"))
					.groupBy(DS0D, S0_T.pr("oper_nm")),
				when(boundOr("lot_flg"))
					.select(DS0D, S0_T.pr(S1_T.lot_no))
					.groupBy(DS0D, S0_T.pr(S1_T.lot_no)),
				when(boundOr("sublot_flg"))
					.select(DS0D, S0_T.pr(S1_T.sublot_no))
					.groupBy(DS0D, S0_T.pr(S1_T.sublot_no)),
				when(boundOr("sno1_flg"))
					.select(DS0D, S0_T.pr(S1_T.sno1))
					.groupBy(DS0D, S0_T.pr(S1_T.sno1)),
				when(boundOr("sno2_flg"))
					.select(DS0D, S0_T.pr(S1_T.sno2))
					.groupBy(DS0D, S0_T.pr(S1_T.sno2)),
				when(boundOr("sno3_flg"))
					.select(DS0D, S0_T.pr(S1_T.sno3))
					.groupBy(DS0D, S0_T.pr(S1_T.sno3)),
				when(boundOr("sno4_flg"))
					.select(DS0D, S0_T.pr(S1_T.sno4))
					.groupBy(DS0D, S0_T.pr(S1_T.sno4)),
				when(boundOr("wk_rsn_flg"))
					.select(DS0D, S0_T.pr(S1_T.wk_rsn_cd))
					.groupBy(DS0D, S0_T.pr(S1_T.wk_rsn_cd)),
				when(boundOr("wk_rsn_flg"))
					.select(DS0D, S0_T.pr("wk_rsn_nm"))
					.groupBy(DS0D, S0_T.pr("wk_rsn_nm")),
				when(boundOr("act_other_wk_id_flg"))
					.select(DS0D, S0_T.pr(S1_T.act_other_wk_id))
					.groupBy(DS0D, S0_T.pr(S1_T.act_other_wk_id)),
				when(boundOr("act_other_wk_id_flg"))
					.select(DS0D, S0_T.pr(S1_T.rmrks))
					.groupBy(DS0D, S0_T.pr(S1_T.rmrks)),
				when(boundOr("act_other_wk_id_flg"))
					.select(DS0D, S0_T.pr(S1_T.sub_char1))
					.groupBy(DS0D, S0_T.pr(S1_T.sub_char1)),
				when(boundOr("act_other_wk_id_flg"))
					.select(DS0D, S0_T.pr(S1_T.sub_char2))
					.groupBy(DS0D, S0_T.pr(S1_T.sub_char2)),
				when(boundOr("act_other_wk_id_flg"))
					.select(DS0D, S0_T.pr(S1_T.sub_char3))
					.groupBy(DS0D, S0_T.pr(S1_T.sub_char3)),
				when(boundOr("act_other_wk_id_flg"))
					.select(DS0D, S0_T.pr(S1_T.ins_usr_id))
					.groupBy(DS0D, S0_T.pr(S1_T.ins_usr_id)),
				when(boundOr("act_other_wk_id_flg"))
					.select(DS0D, S0_T.pr(S1_T.ins_usr_nm))
					.groupBy(DS0D, S0_T.pr(S1_T.ins_usr_nm)),
				when(boundOr("act_other_wk_id_flg"))
					.select(DS0D, S0_T.pr(S1_T.ins_func_id))
					.groupBy(DS0D, S0_T.pr(S1_T.ins_func_id)),
				when(boundOr("act_other_wk_id_flg"))
					.select(DS0D, S0_T.pr(S1_T.ins_ts))
					.groupBy(DS0D, S0_T.pr(S1_T.ins_ts)),
				when(boundOr("act_other_wk_id_flg"))
					.select(DS0D, S0_T.pr(S1_T.upd_usr_id))
					.groupBy(DS0D, S0_T.pr(S1_T.upd_usr_id)),
				when(boundOr("act_other_wk_id_flg"))
					.select(DS0D, S0_T.pr(S1_T.upd_usr_nm))
					.groupBy(DS0D, S0_T.pr(S1_T.upd_usr_nm)),
				when(boundOr("act_other_wk_id_flg"))
					.select(DS0D, S0_T.pr(S1_T.upd_func_id))
					.groupBy(DS0D, S0_T.pr(S1_T.upd_func_id)),
				when(boundOr("act_other_wk_id_flg"))
					.select(DS0D, S0_T.pr(S1_T.upd_ts))
					.groupBy(DS0D, S0_T.pr(S1_T.upd_ts)),
				when(boundOr("act_other_wk_id_flg"))
					.select(DS0D, S0_T.pr(S1_T.upd_srv_req_no))
					.groupBy(DS0D, S0_T.pr(S1_T.upd_srv_req_no)),
				when(null)
					.select(DS0D, S0_T.pr(S1_T.wk_cost_cd))
					.groupBy(DS0D, S0_T.pr(S1_T.wk_cost_cd)),
				when(null)
					.select(DS0D, S0_T.pr(S1_WK_COST.wk_cost_nm))
					.groupBy(DS0D, S0_T.pr(S1_WK_COST.wk_cost_nm)),
				when(null)
					.select(DS0D, S0_T.pr(S1_WK_COST.dec_place))
					.groupBy(DS0D, S0_T.pr(S1_WK_COST.dec_place)),
				when(null)
					.select(DS0D, S0_T.pr(S1_WK_COST.wk_cost_unit_nm))
					.groupBy(DS0D, S0_T.pr(S1_WK_COST.wk_cost_unit_nm)),
				when(null)
					.select(DS0D, sum(S0_T.pr(S1_T.wk_cost)).as("wk_cost")),
				when(boundOr("calc_ctg_flg"))
					.select(DS1D, S1_CALC_CTG.calc_ctg_nm.as("calc_ctg_nm"))
					.groupBy(DS1D, S1_CALC_CTG.calc_ctg_nm),
				when(boundOr("calc_ctg_flg", "calc_ctg_nm"))
					.view(DS1D, v -> v.leftOuterJoin(S1_CALC_CTG).on(S1_T.calc_ctg_cd.eq(S1_CALC_CTG.calc_ctg_cd)))
					.predicate(DS1D, p -> p.cutoff$and(S1_CALC_CTG.calc_ctg_nm.like(bind("calc_ctg_nm")))),
				when(boundOr("dpt_flg", "dpt_nm"))
					.view(DS1D, v -> v.innerJoin(S1_TERM).on(S1_T.ym.gte(S1_TERM.term).and(S1_T.ym.lt(S1_TERM.term_end_ym)))),
				when(boundOr("dpt_flg"))
					.select(DS1D, S1_DPT.dpt_nm.as("dpt_nm"))
					.groupBy(DS1D, S1_DPT.dpt_nm),
				when(boundOr("dpt_flg", "dpt_nm"))
					.view(DS1D, v -> v.leftOuterJoin(S1_DPT).on(S1_T.dpt_cd.eq(S1_DPT.dpt_cd).and(S1_TERM.term.eq(S1_DPT.term))))
					.predicate(DS1D, p -> p.cutoff$and(S1_DPT.dpt_nm.like(bind("dpt_nm")))),
				when(boundOr("ctg_flg"))
					.select(DS1D, S1_CTG.ctg_nm.as("ctg_nm"))
					.groupBy(DS1D, S1_CTG.ctg_nm),
				when(boundOr("ctg_flg", "ctg_nm"))
					.view(DS1D, v -> v.leftOuterJoin(S1_CTG).on(S1_T.ctg_cd.eq(S1_CTG.ctg_cd)))
					.predicate(DS1D, p -> p.cutoff$and(S1_CTG.ctg_nm.like(bind("ctg_nm")))),
				when(boundOr("loc_flg", "site_flg", "site_cd", "site_nm", "loc_nm"))
					.view(DS1D, v -> v.leftOuterJoin(S1_LOC).on(S1_T.loc_cd.eq(S1_LOC.loc_cd)))
					.predicate(DS1D, p -> p.cutoff$and(S1_LOC.site_cd.like(bind("site_cd"))).cutoff$and(S1_LOC.loc_nm.like(bind("loc_nm")))),
				when(boundOr("site_flg"))
					.select(DS1D, S1_LOC.site_cd.as("site_cd"))
					.groupBy(DS1D, S1_LOC.site_cd),
				when(boundOr("site_flg"))
					.select(DS1D, S1_SITE.site_nm.as("site_nm"))
					.groupBy(DS1D, S1_SITE.site_nm),
				when(boundOr("site_flg", "site_nm"))
					.view(DS1D, v -> v.leftOuterJoin(S1_SITE).on(S1_LOC.site_cd.eq(S1_SITE.site_cd)))
					.predicate(DS1D, p -> p.cutoff$and(S1_SITE.site_nm.like(bind("site_nm")))),
				when(boundOr("loc_flg"))
					.select(DS1D, S1_LOC.loc_nm.as("loc_nm"))
					.groupBy(DS1D, S1_LOC.loc_nm),
				when(boundOr("oper_flg"))
					.select(DS1D, S1_OPER.oper_nm.as("oper_nm"))
					.groupBy(DS1D, S1_OPER.oper_nm),
				when(boundOr("oper_flg", "oper_nm"))
					.view(DS1D, v -> v.leftOuterJoin(S1_OPER).on(S1_T.oper_cd.eq(S1_OPER.oper_cd)))
					.predicate(DS1D, p -> p.cutoff$and(S1_OPER.oper_nm.like(bind("oper_nm")))),
				when(boundOr("wk_rsn_flg"))
					.select(DS1D, S1_WK_RSN.wk_rsn_nm.as("wk_rsn_nm"))
					.groupBy(DS1D, S1_WK_RSN.wk_rsn_nm),
				when(boundOr("wk_rsn_flg", "wk_rsn_nm"))
					.view(DS1D, v -> v.leftOuterJoin(S1_WK_RSN).on(S1_T.wk_rsn_cd.eq(S1_WK_RSN.wk_rsn_cd)))
					.predicate(DS1D, p -> p.cutoff$and(S1_WK_RSN.wk_rsn_nm.like(bind("wk_rsn_nm")))),
				when(boundOr("calc_ctg_flg"))
					.orderBy(DS0D, S0_T.pr(S1_T.calc_ctg_cd).asc()),
				when(boundOr("wg_flg"))
					.orderBy(DS0D, S0_T.pr(S1_T.wg_cd).asc()),
				when(boundOr("ym_flg"))
					.orderBy(DS0D, S0_T.pr(S1_T.ym).asc()),
				when(boundOr("ac_dt_flg"))
					.orderBy(DS0D, S0_T.pr(S1_T.ac_dt).asc()),
				when(boundOr("act_other_wk_id_flg"))
					.orderBy(DS0D, S0_T.pr(S1_T.act_other_wk_id).asc())
			);
	}
}