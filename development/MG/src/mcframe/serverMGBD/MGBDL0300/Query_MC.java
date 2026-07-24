package mcframe.serverMGBD.MGBDL0300;

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
	 * -- MGBDL0300_MGT_ACT_INPT_EXPNS_Query_D01
	 */
	static MCQueryPlan MGBDL0300_MGT_ACT_INPT_EXPNS_D01() {
		MGT_ACT_INPT_EXPNS_R S0_T1 = MGT_ACT_INPT_EXPNS_R.create("T1");
		MGT_ACT_INPT_R S1_T2 = MGT_ACT_INPT_R.create("T2");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MGBDL0300_MGT_ACT_INPT_EXPNS_Query_D01")
					.delete(S0_T1)
					.where(
						value(0).eq(value(0))
						.and(
							exists(
								subQuery()
								.select(S1_T2.act_inpt_id)
								.from(S1_T2)
								.where(
									value(0).eq(value(0))
									.and(S1_T2.act_inpt_id.eq(S0_T1.act_inpt_id))
									.and(S1_T2.act_inpt_id_sub.eq(S1_T2.act_inpt_id_sub))
									.and(S1_T2.calc_ctg_cd.eq(bind("calc_ctg_cd_to")))
									.and(S1_T2.ym.eq(bind("ym_to")))
									.and(S1_T2.wg_cd.eq(bind("wg_cd")))
								)
							)
						)
					)
			);
	}
	
	/**
	 * -- MGBDL0300_MGT_ACT_INPT_Query_S01
	 */
	static MCQueryPlan MGBDL0300_MGT_ACT_INPT_S01() {
		MGT_ACT_INPT_R S0_T = MGT_ACT_INPT_R.create("T");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MGBDL0300_MGT_ACT_INPT_Query_S01")
					.mainQuery()
					.select(S0_T.prAll())
					.from(S0_T)
					.where(
						value(0).eq(value(0))
						.and(S0_T.calc_ctg_cd.eq(bind("calc_ctg_cd_fr")))
						.and(S0_T.ym.eq(bind("ym_fr")))
						.and(S0_T.wg_cd.eq(bind("wg_cd")))
					)
			);
	}
	
	/**
	 * -- MGBDL0300_MGT_ACT_IO_EXPNS_Query_D01
	 */
	static MCQueryPlan MGBDL0300_MGT_ACT_IO_EXPNS_D01() {
		MGT_ACT_IO_EXPNS_R S0_T1 = MGT_ACT_IO_EXPNS_R.create("T1");
		MGT_ACT_IO_R S1_T2 = MGT_ACT_IO_R.create("T2");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MGBDL0300_MGT_ACT_IO_EXPNS_Query_D01")
					.delete(S0_T1)
					.where(
						value(0).eq(value(0))
						.and(
							exists(
								subQuery()
								.select(S1_T2.act_io_id)
								.from(S1_T2)
								.where(
									value(0).eq(value(0))
									.and(S1_T2.act_io_id.eq(S0_T1.act_io_id))
									.and(S1_T2.act_io_id_sub.eq(S1_T2.act_io_id_sub))
									.and(S1_T2.calc_ctg_cd.eq(bind("calc_ctg_cd_to")))
									.and(S1_T2.ym.eq(bind("ym_to")))
									.and(S1_T2.wg_cd.eq(bind("wg_cd")))
								)
							)
						)
					)
			);
	}
	
	/**
	 * -- MGBDL0300_MGT_ACT_IO_Query_S01
	 */
	static MCQueryPlan MGBDL0300_MGT_ACT_IO_S01() {
		MGT_ACT_IO_R S0_T = MGT_ACT_IO_R.create("T");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MGBDL0300_MGT_ACT_IO_Query_S01")
					.mainQuery()
					.select(S0_T.prAll())
					.from(S0_T)
					.where(
						value(0).eq(value(0))
						.and(S0_T.calc_ctg_cd.eq(bind("calc_ctg_cd_fr")))
						.and(S0_T.ym.eq(bind("ym_fr")))
						.and(S0_T.wg_cd.eq(bind("wg_cd")))
					)
			);
	}
	
	/**
	 * -- MGBDL0300_MGT_ACT_SLS_EXPNS_Query_D01
	 */
	static MCQueryPlan MGBDL0300_MGT_ACT_SLS_EXPNS_D01() {
		MGT_ACT_SLS_EXPNS_R S0_T1 = MGT_ACT_SLS_EXPNS_R.create("T1");
		MGT_ACT_SLS_R S1_T2 = MGT_ACT_SLS_R.create("T2");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MGBDL0300_MGT_ACT_SLS_EXPNS_Query_D01")
					.delete(S0_T1)
					.where(
						value(0).eq(value(0))
						.and(
							exists(
								subQuery()
								.select(S1_T2.act_sls_id)
								.from(S1_T2)
								.where(
									value(0).eq(value(0))
									.and(S1_T2.act_sls_id.eq(S0_T1.act_sls_id))
									.and(S1_T2.act_sls_id_sub.eq(S1_T2.act_sls_id_sub))
									.and(S1_T2.calc_ctg_cd.eq(bind("calc_ctg_cd_to")))
									.and(S1_T2.ym.eq(bind("ym_to")))
									.and(S1_T2.wg_cd.eq(bind("wg_cd")))
								)
							)
						)
					)
			);
	}
	
	/**
	 * -- MGBDL0300_MGT_ACT_SLS_Query_S01
	 */
	static MCQueryPlan MGBDL0300_MGT_ACT_SLS_S01() {
		MGT_ACT_SLS_R S0_T = MGT_ACT_SLS_R.create("T");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MGBDL0300_MGT_ACT_SLS_Query_S01")
					.mainQuery()
					.select(S0_T.prAll())
					.from(S0_T)
					.where(
						value(0).eq(value(0))
						.and(S0_T.calc_ctg_cd.eq(bind("calc_ctg_cd_fr")))
						.and(S0_T.ym.eq(bind("ym_fr")))
						.and(S0_T.wg_cd.eq(bind("wg_cd")))
					)
			);
	}
}