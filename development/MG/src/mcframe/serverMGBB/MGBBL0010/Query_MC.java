package mcframe.serverMGBB.MGBBL0010;

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
	 * -- MGBBL0010_MGT_CALC_FIX_Query_S01
	 */
	static MCQueryPlan MGBBL0010_MGT_CALC_FIX_S01() {
		MGT_CALC_FIX_R S0_T = MGT_CALC_FIX_R.create("T");
		MAM_CALC_GRP_R S0_CALC_GRP = MAM_CALC_GRP_R.create("CALC_GRP");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MGBBL0010_MGT_CALC_FIX_Query_S01")
					.mainQuery()
					.select(max(S0_T.ym).as("ym"))
					.from(
						S0_T
						.innerJoin(S0_CALC_GRP).on(S0_CALC_GRP.calc_grp_cd.eq(S0_T.calc_grp_cd))
					)
					.where(
						value(0).eq(value(0))
						.and(MAC_SA_TYP$IS_ACT(S0_CALC_GRP.sa_typ).eq(value(true)))
					)
			);
	}
	
	/**
	 * -- MGBBL0010_MGVT_MST_IO_ACT_Query_S01
	 */
	static MCQueryPlan MGBBL0010_MGVT_MST_IO_ACT_S01() {
		MCTempView S0_T = createTempView("T");
		MGVT_MST_IO_ACT_R S1_T = MGVT_MST_IO_ACT_R.create("T");
		MGVT_MST_IO_ACT_R S2_T = MGVT_MST_IO_ACT_R.create("T");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MGBBL0010_MGVT_MST_IO_ACT_Query_S01")
					.mainQuery()
					.select(
						max(S0_T.pr("upd_ts")).as("last_upd_dt"),
						sum(S0_T.pr("cnt")).as("no_imp_cnt")
					)
					.from(
						subQuery()
						.select(
							max(S1_T.upd_ts).as("upd_ts"),
							value(0).as("cnt")
						)
						.from(S1_T)
						.where(
							value(0).eq(value(0))
							.and(S1_T.ac_ym.eq(bind("ym")))
							.and(S1_T.send_flg.eq(value(true)))
						)
						.unionAll(
							subQuery()
							.select(
								max(S2_T.upd_ts).as("upd_ts"),
								countAll().as("cnt")
							)
							.from(S2_T)
							.where(
								value(0).eq(value(0))
								.and(S2_T.ac_ym.eq(bind("ym")))
								.and(S2_T.send_flg.eq(value(true)))
								.and(S2_T.c_imp_flg.eq(value(false)))
							)
						).view(S0_T)
					)
			);
	}
	
	/**
	 * -- MGBBL0010_MGVT_MST_MLY_STK_DTL_Query_S01
	 */
	static MCQueryPlan MGBBL0010_MGVT_MST_MLY_STK_DTL_S01() {
		MGVT_MST_MLY_STK_DTL_R S0_T = MGVT_MST_MLY_STK_DTL_R.create("T");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MGBBL0010_MGVT_MST_MLY_STK_DTL_Query_S01")
					.mainQuery()
					.select(
						max(S0_T.upd_ts).as("last_upd_dt"),
						countAll().as("no_imp_cnt")
					)
					.from(S0_T)
					.where(
						value(0).eq(value(0))
						.and(S0_T.ac_ym.eq(bind("ym")))
						.and(S0_T.io_act_typ.eq(value(MGC_IO_ACT_TYP.END_STK.value())))
						.and(S0_T.base_unit_qty.neq(value(0)))
					)
			);
	}
	
	/**
	 * -- MGBBL0010_MGVT_MST_MLY_WIP_Query_S01
	 */
	static MCQueryPlan MGBBL0010_MGVT_MST_MLY_WIP_S01() {
		MGVT_MST_MLY_WIP_R S0_T = MGVT_MST_MLY_WIP_R.create("T");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MGBBL0010_MGVT_MST_MLY_WIP_Query_S01")
					.mainQuery()
					.select(
						max(S0_T.upd_ts).as("last_upd_dt"),
						countAll().as("no_imp_cnt")
					)
					.from(S0_T)
					.where(
						value(0).eq(value(0))
						.and(S0_T.ym.eq(bind("ym")))
						.and(S0_T.cmpl_flg.eq(value(false)))
						.and(S0_T.base_unit_wip_qty.neq(value(0)))
					)
			);
	}
	
	/**
	 * -- MGBBL0010_MGVT_MST_WK_ACT_Query_S01
	 */
	static MCQueryPlan MGBBL0010_MGVT_MST_WK_ACT_S01() {
		MGVT_MST_WK_ACT_R S0_T = MGVT_MST_WK_ACT_R.create("T");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MGBBL0010_MGVT_MST_WK_ACT_Query_S01")
					.mainQuery()
					.select(
						max(S0_T.upd_ts).as("last_upd_dt"),
						countAll().as("no_imp_cnt")
					)
					.from(S0_T)
					.where(
						value(0).eq(value(0))
						.and(S0_T.ac_dt.between(bind("ym_st_dt"), bind("ym_end_dt")))
						.and(S0_T.wk_cost.neq(value(0)))
					)
			);
	}
}