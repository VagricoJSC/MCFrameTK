package mcframe.serverMGBD.MGBDB0020;

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
	 * -- MGBDB0020_MAM_WG_Query_S01
	 */
	static MCQueryPlan MGBDB0020_MAM_WG_S01() {
		MAM_WG_R S0_WG = MAM_WG_R.create("WG");
		MAVM_WR_WG_R S1_W = MAVM_WR_WG_R.create("W");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MGBDB0020_MAM_WG_Query_S01")
				.mainQuery()
				.select(S0_WG.wg_cd)
					.from(
						S0_WG
						.innerJoin(S1_W).on(S0_WG.wg_cd.eq(S1_W.wg_cd))
					)
					.where(
						value(0).eq(value(0))
						.and(
							value(0).eq(value(1))
							.or(S0_WG.sls_flg.eq(value(true)))
							.or(S0_WG.lg_flg.eq(value(true)))
							.or(S0_WG.mfg_flg.eq(value(true)))
							.or(S0_WG.purc_flg.eq(value(true)))
							.or(S0_WG.sls_flg.eq(value(false)))
							.and(S0_WG.lg_flg.eq(value(false)))
							.and(S0_WG.mfg_flg.eq(value(false)))
							.and(S0_WG.purc_flg.eq(value(false)))
							.and(S0_WG.ar_flg.eq(value(false)))
							.and(S0_WG.ap_flg.eq(value(false)))
							.and(S0_WG.sd_flg.eq(value(false)))
							.and(S0_WG.plm_flg.eq(value(false)))
						)
					)
			);
	}
}