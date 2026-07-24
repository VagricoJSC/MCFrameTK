package mcframe.serverMGBE.MGBEL0120;

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
	 * -- MGBEL0120_MAM_STDCOST_Query_I01
	 */
	static MCQueryPlan MGBEL0120_MAM_STDCOST_I01() {
		MAM_STDCOST__R S0 = MAM_STDCOST__R.create();
		MGT_STD_FIX_R S1_T = MGT_STD_FIX_R.create("T");
		MGT_ITM_R S1_ITM = MGT_ITM_R.create("ITM");
		MAM_STDCOST__R S2_W = MAM_STDCOST__R.create("W");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MGBEL0120_MAM_STDCOST_Query_I01")
					.insert(S0)
					.columns(
						S0.itm_cd,
						S0.itm_sub1,
						S0.itm_sub2,
						S0.itm_sub3,
						S0.term,
						S0.wg_cd,
						S0.std_qty,
						S0.std_upri
					)
					.query(
						subQuery()
						.select(
							S1_T.itm_cd,
							S1_T.itm_sub1,
							S1_T.itm_sub2,
							S1_T.itm_sub3,
							S1_T.term,
							decode(
								nvl(
									bind("wg_cmn_upri_flg_str"),
									S1_ITM.cmn_upri_flg
								),
								value(true),
								value(MAC_STR.NULL_VAL.value()),
								S1_T.wg_cd
							),
							S1_T.std_qty,
							MAPA_CALC$F_RND(
								S1_T.std_upri,
								bind("dec_place"),
								bind("rnd_typ")
							)
						)
						.from(
							S1_T
							.innerJoin(S1_ITM).on(
								S1_ITM.itm_cd.eq(S1_T.itm_cd)
								.and(S1_ITM.itm_sub1.eq(S1_T.itm_sub1))
								.and(S1_ITM.itm_sub2.eq(S1_T.itm_sub2))
								.and(S1_ITM.itm_sub3.eq(S1_T.itm_sub3))
								.and(S1_ITM.term.eq(S1_T.term))
								.and(S1_ITM.calc_ctg_cd.eq(S1_T.calc_ctg_cd))
								.and(S1_ITM.wg_cd.eq(S1_T.wg_cd))
							)
						)
						.where(
							value(0).eq(value(0))
							.and(S1_T.term.eq(bind("term")))
							.and(S1_T.calc_ctg_cd.eq(bind("calc_ctg_cd")))
							.and(S1_T.wg_cd.eq(bind("wg_cd")))
							.and(
								notExists(
									subQuery()
									.select(value("X"))
									.from(S2_W)
									.where(
										value(0).eq(value(0))
										.and(S2_W.itm_cd.eq(S1_T.itm_cd))
										.and(S2_W.itm_sub1.eq(S1_T.itm_sub1))
										.and(S2_W.itm_sub2.eq(S1_T.itm_sub2))
										.and(S2_W.itm_sub3.eq(S1_T.itm_sub3))
										.and(S2_W.term.eq(S1_T.term))
										.and(
											S2_W.wg_cd.eq(decode(
													nvl(
														bind("wg_cmn_upri_flg_str"),
														S1_ITM.cmn_upri_flg
													),
													value(true),
													value(MAC_STR.NULL_VAL.value()),
													S1_T.wg_cd
												)
											)
										)
									)
								)
							)
						)
					)
			);
	}
	
	/**
	 * -- MGBEL0120_MAM_STDCOST_Query_S01
	 */
	static MCQueryPlan MGBEL0120_MAM_STDCOST_S01() {
		MAM_STDCOST__R S0_M1 = MAM_STDCOST__R.create("M1");
		MAW_STDCOST_KEY_R S0_W1 = MAW_STDCOST_KEY_R.create("W1");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MGBEL0120_MAM_STDCOST_Query_S01")
					.mainQuery()
					.select(
						S0_M1.itm_cd,
						S0_M1.itm_sub1,
						S0_M1.itm_sub2,
						S0_M1.itm_sub3,
						S0_M1.term,
						S0_M1.wg_cd
					)
					.from(
						S0_M1
						.innerJoin(S0_W1).on(
							bracket(
								S0_M1.itm_cd.eq(S0_W1.itm_cd)
								.and(S0_M1.itm_sub1.eq(S0_W1.itm_sub1))
								.and(S0_M1.itm_sub2.eq(S0_W1.itm_sub2))
								.and(S0_M1.itm_sub3.eq(S0_W1.itm_sub3))
								.and(S0_M1.term.eq(S0_W1.term))
								.and(S0_M1.wg_cd.eq(S0_W1.wg_cd))
							)
						)
					)
					.forUpdate(S0_M1.itm_cd)
			);
	}
	
	/**
	 * -- MGBEL0120_MGT_STD_FIX_Query_S01
	 */
	static MCQueryPlan MGBEL0120_MGT_STD_FIX_S01() {
		MGT_STD_FIX_R S0_X = MGT_STD_FIX_R.create("X");
		MGT_ITM_R S0_ITM = MGT_ITM_R.create("ITM");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MGBEL0120_MGT_STD_FIX_Query_S01")
					.mainQuery()
					.select(
						S0_X.itm_cd,
						S0_X.itm_sub1,
						S0_X.itm_sub2,
						S0_X.itm_sub3,
						S0_X.term,
						decode(
							nvl(
								bind("wg_cmn_upri_flg_str"),
								S0_ITM.cmn_upri_flg
							),
							value(true),
							value(MAC_STR.NULL_VAL.value()),
							S0_X.wg_cd
						).as("wg_cd"),
						S0_X.std_qty,
						S0_X.std_upri
					)
					.from(
						S0_X
						.innerJoin(S0_ITM).on(
							S0_ITM.itm_cd.eq(S0_X.itm_cd)
							.and(S0_ITM.itm_sub1.eq(S0_X.itm_sub1))
							.and(S0_ITM.itm_sub2.eq(S0_X.itm_sub2))
							.and(S0_ITM.itm_sub3.eq(S0_X.itm_sub3))
							.and(S0_ITM.term.eq(S0_X.term))
							.and(S0_ITM.calc_ctg_cd.eq(S0_X.calc_ctg_cd))
							.and(S0_ITM.wg_cd.eq(S0_X.wg_cd))
						)
					)
					.where(
						value(0).eq(value(0))
						.and(S0_X.term.eq(bind("term")))
						.and(S0_X.calc_ctg_cd.eq(bind("calc_ctg_cd")))
						.and(S0_X.wg_cd.eq(bind("wg_cd")))
					)
			);
	}
}