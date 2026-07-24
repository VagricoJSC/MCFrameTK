package mcframe.serverMGBF.MGBFL0230;

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
	 * -- MGBFL0230_MAM_CALC_RPT_PTN_Query_S01
	 */
	static MCQueryPlan MGBFL0230_MAM_CALC_RPT_PTN_S01() {
		MAM_CALC_RPT_PTN_R S0_M01 = MAM_CALC_RPT_PTN_R.create("M01");
		MAM_RPT_PTN_R S0_M02 = MAM_RPT_PTN_R.create("M02");
		MAM_RPT_KEY_R S0_M03 = MAM_RPT_KEY_R.create("M03");
		MCTempView S0_T01 = createTempView("T01");
		MGT_ARG_R S0_T02 = MGT_ARG_R.create("T02");
		MGT_RPT_R S1_MA01 = MGT_RPT_R.create("MA01");
		MAM_RPT_PTN_R S1_MA02 = MAM_RPT_PTN_R.create("MA02");
		MAM_RPT_KEY_R S1_MA03 = MAM_RPT_KEY_R.create("MA03");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MGBFL0230_MAM_CALC_RPT_PTN_Query_S01")
					.mainQuery()
					.select(
						S0_M01.calc_grp_cd,
						S0_M01.rpt_ptn_cd,
						S0_M02.rpt_ptn_nm,
						S0_M01.rpt_key_cd,
						S0_M03.rpt_key_nm,
						S0_M03.rpt_key_typ,
						S0_M01.auto_flg,
						S0_M01.memo1,
						S0_M01.memo2,
						S0_M01.memo3,
						bind("calc_no").as("calc_no"),
						decode(
							S0_T01.pr(S1_MA01.rpt_ptn_cd),
							nullValue(),
							value(false),
							value(true)
						).as("made_flg"),
						S0_T02.end_ym.as("ym")
					)
					.from(
						S0_M01
						.innerJoin(S0_M02).on(S0_M02.rpt_ptn_cd.eq(S0_M01.rpt_ptn_cd))
						.innerJoin(S0_M03).on(S0_M03.rpt_key_cd.eq(S0_M01.rpt_key_cd))
						.leftOuterJoin(
							subQuery()
							.selectDistinct(
								S1_MA01.rpt_ptn_cd,
								S1_MA01.rpt_key_cd
							)
							.from(
								S1_MA01
								.innerJoin(S1_MA02).on(S1_MA02.rpt_ptn_cd.eq(S1_MA01.rpt_ptn_cd))
								.innerJoin(S1_MA03).on(S1_MA03.rpt_key_cd.eq(S1_MA01.rpt_key_cd))
							)
							.where(
								value(0).eq(value(0))
								.and(S1_MA01.calc_grp_cd.eq(bind("calc_grp_cd")))
								.and(S1_MA01.calc_no.eq(bind("calc_no")))
								.cutoff$and(S1_MA01.rpt_ptn_cd.like(bind("rpt_ptn_cd")))
								.cutoff$and(S1_MA02.rpt_ptn_nm.like(bind("rpt_ptn_nm")))
								.cutoff$and(S1_MA01.rpt_key_cd.like(bind("rpt_key_cd")))
								.cutoff$and(S1_MA03.rpt_key_nm.like(bind("rpt_key_nm")))
							).view(S0_T01)
						).on(
							S0_T01.pr(S1_MA01.rpt_ptn_cd).eq(S0_M01.rpt_ptn_cd)
							.and(S0_T01.pr(S1_MA01.rpt_key_cd).eq(S0_M01.rpt_key_cd))
						)
						.innerJoin(S0_T02).on(
							S0_T02.calc_no.eq(bind("calc_no"))
							.and(S0_T02.calc_grp_cd.eq(bind("calc_grp_cd")))
						)
					)
					.where(
						value(0).eq(value(0))
						.and(S0_M01.calc_grp_cd.eq(bind("calc_grp_cd")))
						.cutoff$and(S0_M01.rpt_ptn_cd.like(bind("rpt_ptn_cd")))
						.cutoff$and(S0_M02.rpt_ptn_nm.like(bind("rpt_ptn_nm")))
						.cutoff$and(S0_M01.rpt_key_cd.like(bind("rpt_key_cd")))
						.cutoff$and(S0_M03.rpt_key_nm.like(bind("rpt_key_nm")))
						.cutoff$and(S0_M03.rpt_key_typ.like(bind("rpt_key_typ")))
						.cutoff$and(S0_M01.memo1.like(bind("memo1")))
						.cutoff$and(S0_M01.memo2.like(bind("memo2")))
						.cutoff$and(S0_M01.memo3.like(bind("memo3")))
					)
			);
	}
	
	/**
	 * -- MGBFL0230_MGT_RPT_Query_D01
	 */
	static MCQueryPlan MGBFL0230_MGT_RPT_D01() {
		MGT_RPT_R S0_T01 = MGT_RPT_R.create("T01");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MGBFL0230_MGT_RPT_Query_D01")
					.delete(S0_T01)
					.where(
						value(0).eq(value(0))
						.and(S0_T01.calc_no.eq(bind("calc_no")))
						.and(S0_T01.calc_grp_cd.eq(bind("calc_grp_cd")))
						.and(S0_T01.rpt_ptn_cd.eq(bind("rpt_ptn_cd")))
						.and(S0_T01.rpt_key_cd.eq(bind("rpt_key_cd")))
					)
			);
	}
	
	/**
	 * -- MGBFL0230_MGT_RPT_Query_S01
	 */
	static MCQueryPlan MGBFL0230_MGT_RPT_S01() {
		MGT_RPT_R S0_T01 = MGT_RPT_R.create("T01");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MGBFL0230_MGT_RPT_Query_S01")
					.mainQuery()
					.select(countAll().as("cnt"))
					.from(S0_T01)
					.where(
						value(0).eq(value(0))
						.and(S0_T01.calc_no.eq(bind("calc_no")))
						.and(S0_T01.calc_grp_cd.eq(bind("calc_grp_cd")))
						.and(S0_T01.rpt_ptn_cd.eq(bind("rpt_ptn_cd")))
						.and(S0_T01.rpt_key_cd.eq(bind("rpt_key_cd")))
					)
			);
	}
}