package mcframe.serverMGBA.MGBAL0060;

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
	 * -- MGBAL0060_MGT_PLN_OTHER_WK_Query_S01
	 */
	static MCQueryPlan MGBAL0060_MGT_PLN_OTHER_WK_S01() {
		MGT_PLN_OTHER_WK_R S0_T = MGT_PLN_OTHER_WK_R.create("T");
		MAVM_RD_WG_R S0_WG = MAVM_RD_WG_R.create("WG");
		MAM_TERM_R S0_TERM = MAM_TERM_R.create("TERM");
		MAM_CALC_CTG_R S0_CALC_CTG = MAM_CALC_CTG_R.create("CALC_CTG");
		MAM_COST_DPT_R S0_DPT = MAM_COST_DPT_R.create("DPT");
		MAM_COST_CTG_R S0_CTG = MAM_COST_CTG_R.create("CTG");
		MAM_LOC_R S0_LOC = MAM_LOC_R.create("LOC");
		MAM_SITE_R S0_SITE = MAM_SITE_R.create("SITE");
		MAM_OPER_R S0_OPER = MAM_OPER_R.create("OPER");
		MAM_WK_COST_R S0_WK_COST = MAM_WK_COST_R.create("WK_COST");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MGBAL0060_MGT_PLN_OTHER_WK_Query_S01")
					.mainQuery()
					.select(
						S0_T.pln_other_wk_key,
						S0_T.calc_ctg_cd,
						S0_T.wg_cd,
						S0_T.ym,
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
						S0_T.wk_cost,
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
						S0_CALC_CTG.calc_ctg_nm,
						S0_DPT.dpt_nm,
						S0_CTG.ctg_nm,
						S0_LOC.loc_nm,
						S0_LOC.site_cd,
						S0_SITE.site_nm,
						S0_OPER.oper_nm,
						S0_WK_COST.wk_cost_nm,
						S0_WK_COST.dec_place,
						S0_WK_COST.wk_cost_unit_nm
					)
					.from(
						S0_T
						.innerJoin(S0_WG).on(S0_T.wg_cd.eq(S0_WG.wg_cd))
						.innerJoin(S0_TERM).on(
							S0_T.ym.gte(S0_TERM.term)
							.and(S0_T.ym.lt(S0_TERM.term_end_ym))
						)
						.leftOuterJoin(S0_CALC_CTG).on(S0_T.calc_ctg_cd.eq(S0_CALC_CTG.calc_ctg_cd))
						.leftOuterJoin(S0_DPT).on(
							S0_T.dpt_cd.eq(S0_DPT.dpt_cd)
							.and(S0_TERM.term.eq(S0_DPT.term))
						)
						.leftOuterJoin(S0_CTG).on(S0_T.ctg_cd.eq(S0_CTG.ctg_cd))
						.leftOuterJoin(S0_LOC).on(S0_T.loc_cd.eq(S0_LOC.loc_cd))
						.leftOuterJoin(S0_SITE).on(S0_LOC.site_cd.eq(S0_SITE.site_cd))
						.leftOuterJoin(S0_OPER).on(S0_T.oper_cd.eq(S0_OPER.oper_cd))
						.leftOuterJoin(S0_WK_COST).on(S0_T.wk_cost_cd.eq(S0_WK_COST.wk_cost_cd))
					)
					.where(
						value(0).eq(value(0))
						.cutoff$and(S0_T.calc_ctg_cd.like(bind("calc_ctg_cd")))
						.cutoff$and(S0_CALC_CTG.calc_ctg_nm.like(bind("calc_ctg_nm")))
						.cutoff$and(S0_T.wg_cd.like(bind("wg_cd")))
						.cutoff$and(S0_WG.wg_nm.like(bind("wg_nm")))
						.cutoff$and(S0_T.ym.gte(bind("ym_fr")))
						.cutoff$and(S0_T.ym.lte(bind("ym_to")))
						.cutoff$and(S0_T.dpt_cd.like(bind("dpt_cd")))
						.cutoff$and(S0_DPT.dpt_nm.like(bind("dpt_nm")))
						.cutoff$and(S0_T.ctg_cd.like(bind("ctg_cd")))
						.cutoff$and(S0_CTG.ctg_nm.like(bind("ctg_nm")))
						.cutoff$and(S0_T.loc_cd.like(bind("loc_cd")))
						.cutoff$and(S0_LOC.loc_nm.like(bind("loc_nm")))
						.cutoff$and(S0_LOC.site_cd.like(bind("site_cd")))
						.cutoff$and(S0_SITE.site_nm.like(bind("site_nm")))
						.cutoff$and(S0_T.oper_cd.like(bind("oper_cd")))
						.cutoff$and(S0_OPER.oper_nm.like(bind("oper_nm")))
						.cutoff$and(S0_T.lot_no.like(bind("lot_no")))
						.cutoff$and(S0_T.sublot_no.like(bind("sublot_no")))
						.cutoff$and(S0_T.sno1.like(bind("sno1")))
						.cutoff$and(S0_T.sno2.like(bind("sno2")))
						.cutoff$and(S0_T.sno3.like(bind("sno3")))
						.cutoff$and(S0_T.sno4.like(bind("sno4")))
						.cutoff$and(S0_T.wk_cost_cd.like(bind("wk_cost_cd")))
						.cutoff$and(S0_WK_COST.wk_cost_nm.like(bind("wk_cost_nm")))
						.cutoff$and(S0_T.rmrks.like(bind("rmrks")))
						.cutoff$and(S0_T.sub_char1.like(bind("sub_char1")))
						.cutoff$and(S0_T.sub_char2.like(bind("sub_char2")))
						.cutoff$and(S0_T.sub_char3.like(bind("sub_char3")))
					)
					.orderBy(
						S0_T.calc_ctg_cd.asc(),
						S0_T.wg_cd.asc(),
						S0_T.ym.asc(),
						S0_T.dpt_cd.asc()
					)
			);
	}
}