package mcframe.serverMGBA.MGBAL5040;

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
	 * -- MGBAL5040_MGW_WG_Query_I01
	 */
	static MCQueryPlan MGBAL5040_MGW_WG_I01() {
		MGW_WG_R S0 = MGW_WG_R.create();
		MAM_WG_R S1_T = MAM_WG_R.create("T");
		MAVM_WR_WG_R S1_W = MAVM_WR_WG_R.create("W");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MGBAL5040_MGW_WG_Query_I01")
					.insert(S0)
					.columns(S0.wg_cd)
					.query(
						subQuery()
						.select(S1_T.wg_cd)
						.from(
							S1_T
							.innerJoin(S1_W).on(S1_T.wg_cd.eq(S1_W.wg_cd))
						)
						.where(
							value(0).eq(value(0))
							.cutoff$and(S1_T.wg_cd.like(bind("wg_cd")))
							.and(
								value(0).eq(value(1))
								.or(S1_T.sls_flg.eq(value(true)))
								.or(S1_T.lg_flg.eq(value(true)))
								.or(S1_T.mfg_flg.eq(value(true)))
								.or(S1_T.purc_flg.eq(value(true)))
								.or(S1_T.sls_flg.eq(value(false)))
								.and(S1_T.lg_flg.eq(value(false)))
								.and(S1_T.mfg_flg.eq(value(false)))
								.and(S1_T.purc_flg.eq(value(false)))
								.and(S1_T.ar_flg.eq(value(false)))
								.and(S1_T.ap_flg.eq(value(false)))
								.and(S1_T.sd_flg.eq(value(false)))
								.and(S1_T.plm_flg.eq(value(false)))
							)
						)
					)
			);
	}
}