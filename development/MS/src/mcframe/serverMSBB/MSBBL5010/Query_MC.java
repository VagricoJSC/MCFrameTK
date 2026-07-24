package mcframe.serverMSBB.MSBBL5010;

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
import mcframe.commonMS.constant.*;
import mcframe.serverCore.dbc.*;
import mcframe.serverMA.dbc.*;
import mcframe.serverMB.dbc.*;
import mcframe.serverPF.dbc.*;
import mcframe.serverMS.dbc.*;

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
import static mcframe.serverMS.dbc.MSFunction.*;
import static mcframe.serverMS.dbc.MSBBFunction.*;
import static mcframe.serverMS.dbc.MSBCFunction.*;
import static mcframe.serverMS.dbc.MSBDFunction.*;
import static mcframe.serverMS.dbc.MSBEFunction.*;
import static mcframe.serverMS.dbc.MSBFFunction.*;
import static mcframe.serverMS.dbc.MSBGFunction.*;
import static mcframe.serverMS.dbc.MSBHFunction.*;
import static mcframe.serverMS.dbc.MSBIFunction.*;
import static mcframe.serverMS.dbc.MSLCFunction.*;
import static mcframe.serverMS.dbc.MSUAFunction.*;

public class Query_MC {
	
	/**
	 * -- MSBBL5010_MAM_SPLN_ITM_CONF_Query_S01
	 */
	static MCQueryPlan MSBBL5010_MAM_SPLN_ITM_CONF_S01() {
		MAM_SPLN_ITM_CONF_R S0_M1 = MAM_SPLN_ITM_CONF_R.create("M1");
		MAW_SPLN_ITM_CONF_KEY_R S1_WK = MAW_SPLN_ITM_CONF_KEY_R.create("WK");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBBL5010_MAM_SPLN_ITM_CONF_Query_S01")
					.mainQuery()
					.select(
						S0_M1.dpt_cd,
						S0_M1.spln_itm_cd,
						S0_M1.itm_cd,
						S0_M1.itm_sub1,
						S0_M1.itm_sub2,
						S0_M1.itm_sub3,
						S0_M1.st_ym,
						S0_M1.end_ym,
						S0_M1.calc_rate,
						S0_M1.calc_seq,
						S0_M1.upri_unit_cd,
						S0_M1.lot_qty
					)
					.from(S0_M1)
					.where(
						exists(
							subQuery()
							.select(value(1))
							.from(S1_WK)
							.where(
								bracket(
									S1_WK.dpt_cd.eq(S0_M1.dpt_cd)
									.or(S0_M1.dpt_cd.eq(value(MAC_STR.NULL_VAL.value())))
								)
								.and(
									bracket(
										S1_WK.spln_itm_cd.eq(S0_M1.spln_itm_cd)
										.and(S1_WK.spln_itm_cd.neq(value(MAC_STR.NULL_VAL.value())))
									)
									.or(
										S1_WK.itm_cd.eq(S0_M1.itm_cd)
										.and(S1_WK.itm_sub1.eq(S0_M1.itm_sub1))
										.and(S1_WK.itm_sub2.eq(S0_M1.itm_sub2))
										.and(S1_WK.itm_sub3.eq(S0_M1.itm_sub3))
									)
								)
							)
						)
					)
			);
	}
	
	/**
	 * -- MSBBL5010_MAM_TAX_Query_S01
	 */
	static MCQueryPlan MSBBL5010_MAM_TAX_S01() {
		MAM_TAX_R S0_M1 = MAM_TAX_R.create("M1");
		MCTempView S0_V1 = createTempView("V1");
		MSW_SPLN_FMT_R S1_WK = MSW_SPLN_FMT_R.create("WK");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBBL5010_MAM_TAX_Query_S01")
					.mainQuery()
					.select(
						S0_V1.pr(S1_WK.itm_cd),
						S0_V1.pr(S1_WK.itm_sub1),
						S0_V1.pr(S1_WK.itm_sub2),
						S0_V1.pr(S1_WK.itm_sub3),
						S0_V1.pr(S1_WK.cst_cd),
						S0_V1.pr("spln_ym"),
						S0_M1.tax_rate,
						S0_M1.tax_typ,
						S0_M1.inc_tax_flg
					)
					.from(
						S0_M1
						.innerJoin(
							subQuery()
							.select(
								S1_WK.itm_cd,
								S1_WK.itm_sub1,
								S1_WK.itm_sub2,
								S1_WK.itm_sub3,
								S1_WK.cst_cd,
								S1_WK.st_ym.as("spln_ym"),
								MAPA_TAX$F_GET_SLS_TAX_CD(
									S1_WK.itm_cd,
									S1_WK.itm_sub1,
									S1_WK.itm_sub2,
									S1_WK.itm_sub3,
									S1_WK.cst_cd,
									MAPA_DT$F_GET_YM_ST_DT_NE2(
										S1_WK.st_ym,
										bind("ac_cl_day"),
										bind("ac_cl_mon_base")
									)
								).as("tax_cd")
							)
							.from(S1_WK).view(S0_V1)
						).on(
							bracket(
								S0_V1.pr("tax_cd").eq(S0_M1.tax_cd)
							)
						)
					)
			);
	}
}