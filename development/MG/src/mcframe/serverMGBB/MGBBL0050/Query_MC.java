package mcframe.serverMGBB.MGBBL0050;

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
	 * -- MGBBL0050_MGT_ITM_MFG_INST_Query_U01
	 */
	static MCQueryPlan MGBBL0050_MGT_ITM_MFG_INST_U01() {
		MGT_ITM_MFG_INST_R S0_T = MGT_ITM_MFG_INST_R.create("T");
		MGVT_MST_MFG_ACT_R S1_T1 = MGVT_MST_MFG_ACT_R.create("T1");
		MGVT_MST_MFG_INST_R S1_T2 = MGVT_MST_MFG_INST_R.create("T2");
		MGVT_MST_ITM_MFG_INST_R S1_T3 = MGVT_MST_ITM_MFG_INST_R.create("T3");
		MGW_ITM_MFG_INST_KEY_R S2_W1 = MGW_ITM_MFG_INST_KEY_R.create("W1");
		MGW_ITM_MFG_INST_KEY_R S3_W1 = MGW_ITM_MFG_INST_KEY_R.create("W1");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MGBBL0050_MGT_ITM_MFG_INST_Query_U01")
					.update(S0_T)
					.set(
						S0_T.qty,
						S0_T.schd_st_dt,
						S0_T.schd_end_dt,
						S0_T.act_st_dt,
						S0_T.act_end_dt,
						S0_T.rmrks
					).eq(subQuery()
						.select(
							S1_T2.base_unit_inst_qty,
							trunc(
								S1_T2.st_schd_tm,
								MCDateFmt.DD
							),
							trunc(
								S1_T2.end_schd_tm,
								MCDateFmt.DD
							),
							trunc(
								S1_T1.st_act_tm,
								MCDateFmt.DD
							),
							trunc(
								S1_T1.end_act_tm,
								MCDateFmt.DD
							),
							S1_T2.inst_rpt_rmrks
						)
						.from(
							S1_T1
							.innerJoin(S1_T2).on(S1_T2.mfg_inst_no.eq(S1_T1.mfg_inst_no))
							.innerJoin(S1_T3).on(S1_T3.itm_mfg_inst_no.eq(S1_T1.itm_mfg_inst_no))
						)
						.where(
							value(0).eq(value(0))
							.and(S1_T1.itm_mfg_inst_no.eq(S0_T.itm_mfg_inst_no))
							.and(S1_T1.mfg_act_no.eq(S0_T.mfg_act_no))
							.and(
								exists(
									subQuery()
									.select(value("X"))
									.from(S2_W1)
									.where(
										value(0).eq(value(0))
										.and(S2_W1.calc_ctg_cd.eq(S0_T.calc_ctg_cd))
										.and(S2_W1.itm_cd.eq(S1_T3.itm_cd))
										.and(S2_W1.itm_sub1.eq(S1_T3.itm_sub1))
										.and(S2_W1.itm_sub2.eq(S1_T3.itm_sub2))
										.and(S2_W1.itm_sub3.eq(S1_T3.itm_sub3))
										.and(S2_W1.itm_mfg_inst_no.eq(S1_T1.itm_mfg_inst_no))
										.and(S2_W1.mfg_act_no.eq(S1_T1.mfg_act_no))
									)
								)
							)
						)
					)
					.where(
						value(0).eq(value(0))
						.and(
							exists(
								subQuery()
								.select(value("X"))
								.from(S3_W1)
								.where(
									value(0).eq(value(0))
									.and(S3_W1.calc_ctg_cd.eq(S0_T.calc_ctg_cd))
									.and(S3_W1.itm_cd.eq(S0_T.itm_cd))
									.and(S3_W1.itm_sub1.eq(S0_T.itm_sub1))
									.and(S3_W1.itm_sub2.eq(S0_T.itm_sub2))
									.and(S3_W1.itm_sub3.eq(S0_T.itm_sub3))
									.and(S3_W1.itm_mfg_inst_no.eq(S0_T.itm_mfg_inst_no))
									.and(S3_W1.mfg_act_no.eq(S0_T.mfg_act_no))
								)
							)
						)
					)
			);
	}
	
	/**
	 * -- MGBBL0050_MGT_ITM_MFG_INST_Query_S01
	 */
	static MCQueryPlan MGBBL0050_MGT_ITM_MFG_INST_S01() {
		MGW_INST_OPER_KEY_R S0_W1 = MGW_INST_OPER_KEY_R.create("W1");
		MGT_INST_OPER_R S0_T1 = MGT_INST_OPER_R.create("T1");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MGBBL0050_MGT_ITM_MFG_INST_Query_S01")
					.mainQuery()
					.select(
						S0_T1.calc_ctg_cd,
						S0_T1.itm_cd,
						S0_T1.itm_sub1,
						S0_T1.itm_sub2,
						S0_T1.itm_sub3,
						S0_T1.itm_mfg_inst_no,
						S0_T1.mfg_act_no,
						S0_T1.oper_act_no
					)
					.from(
						S0_W1
						.innerJoin(S0_T1).on(
							bracket(
								S0_W1.calc_ctg_cd.eq(S0_T1.calc_ctg_cd)
								.and(S0_W1.itm_cd.eq(S0_T1.itm_cd))
								.and(S0_W1.itm_sub1.eq(S0_T1.itm_sub1))
								.and(S0_W1.itm_sub2.eq(S0_T1.itm_sub2))
								.and(S0_W1.itm_sub3.eq(S0_T1.itm_sub3))
								.and(S0_W1.itm_mfg_inst_no.eq(S0_T1.itm_mfg_inst_no))
								.and(S0_W1.mfg_act_no.eq(S0_T1.mfg_act_no))
								.and(S0_W1.oper_act_no.eq(S0_T1.oper_act_no))
							)
						)
					)
					.forUpdate(S0_T1.calc_ctg_cd)
			);
	}
	
	/**
	 * -- MGBBL0050_MGW_CALC_ITM_MFG_INST_Query_I01
	 */
	static MCQueryPlan MGBBL0050_MGW_CALC_ITM_MFG_INST_I01() {
		MGW_ITM_MFG_INST_KEY_R S0 = MGW_ITM_MFG_INST_KEY_R.create();
		MCTempView S1_T = createTempView("T");
		MGT_ACT_MFG_IF_R S2_T = MGT_ACT_MFG_IF_R.create("T");
		MAVM_WR_WG_R S2_WG = MAVM_WR_WG_R.create("WG");
		MGT_ACT_INPT_IF_R S3_T = MGT_ACT_INPT_IF_R.create("T");
		MAVM_WR_WG_R S3_WG = MAVM_WR_WG_R.create("WG");
		MGT_ACT_INST_WK_IF_R S4_T = MGT_ACT_INST_WK_IF_R.create("T");
		MAVM_WR_WG_R S4_WG = MAVM_WR_WG_R.create("WG");
		MGT_ACT_INST_WIP_IF_R S5_T = MGT_ACT_INST_WIP_IF_R.create("T");
		MAVM_WR_WG_R S5_WG = MAVM_WR_WG_R.create("WG");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MGBBL0050_MGW_CALC_ITM_MFG_INST_Query_I01")
					.insert(S0)
					.columns(
						S0.calc_ctg_cd,
						S0.itm_cd,
						S0.itm_sub1,
						S0.itm_sub2,
						S0.itm_sub3,
						S0.itm_mfg_inst_no,
						S0.mfg_act_no
					)
					.query(
						subQuery()
						.selectDistinct(
							S1_T.pr(S2_T.calc_ctg_cd),
							S1_T.pr(S2_T.itm_cd),
							S1_T.pr(S2_T.itm_sub1),
							S1_T.pr(S2_T.itm_sub2),
							S1_T.pr(S2_T.itm_sub3),
							S1_T.pr(S2_T.itm_mfg_inst_no),
							S1_T.pr(S2_T.mfg_act_no)
						)
						.from(
							subQuery()
							.select(
								S2_T.calc_ctg_cd,
								S2_T.itm_cd,
								S2_T.itm_sub1,
								S2_T.itm_sub2,
								S2_T.itm_sub3,
								S2_T.itm_mfg_inst_no,
								S2_T.mfg_act_no
							)
							.from(
								S2_T
								.innerJoin(S2_WG).on(S2_WG.wg_cd.eq(S2_T.wg_cd))
							)
							.where(
								value(0).eq(value(0))
								.cutoff$and(S2_T.calc_ctg_cd.like(bind("calc_ctg_cd")))
								.and(S2_T.ym.between(bind("ym_fr"), bind("ym_to")))
							)
							.unionAll(
								subQuery()
								.select(
									S3_T.calc_ctg_cd,
									S3_T.itm_cd,
									S3_T.itm_sub1,
									S3_T.itm_sub2,
									S3_T.itm_sub3,
									S3_T.itm_mfg_inst_no,
									S3_T.mfg_act_no
								)
								.from(
									S3_T
									.innerJoin(S3_WG).on(S3_WG.wg_cd.eq(S3_T.wg_cd))
								)
								.where(
									value(0).eq(value(0))
									.cutoff$and(S3_T.calc_ctg_cd.like(bind("calc_ctg_cd")))
									.and(S3_T.ym.between(bind("ym_fr"), bind("ym_to")))
								)
								.unionAll(
									subQuery()
									.select(
										S4_T.calc_ctg_cd,
										S4_T.itm_cd,
										S4_T.itm_sub1,
										S4_T.itm_sub2,
										S4_T.itm_sub3,
										S4_T.itm_mfg_inst_no,
										S4_T.mfg_act_no
									)
									.from(
										S4_T
										.innerJoin(S4_WG).on(S4_WG.wg_cd.eq(S4_T.wg_cd))
									)
									.where(
										value(0).eq(value(0))
										.cutoff$and(S4_T.calc_ctg_cd.like(bind("calc_ctg_cd")))
										.and(S4_T.ym.between(bind("ym_fr"), bind("ym_to")))
									)
									.unionAll(
										subQuery()
										.select(
											S5_T.calc_ctg_cd,
											S5_T.itm_cd,
											S5_T.itm_sub1,
											S5_T.itm_sub2,
											S5_T.itm_sub3,
											S5_T.itm_mfg_inst_no,
											S5_T.mfg_act_no
										)
										.from(
											S5_T
											.innerJoin(S5_WG).on(S5_WG.wg_cd.eq(S5_T.wg_cd))
										)
										.where(
											value(0).eq(value(0))
											.cutoff$and(S5_T.calc_ctg_cd.like(bind("calc_ctg_cd")))
											.and(S5_T.ym.between(bind("ym_fr"), bind("ym_to")))
										)
									)
								)
							).view(S1_T)
						)
					)
			);
	}
	
	/**
	 * -- MGBBL0050_MGW_ITM_MFG_INST_KEY_Query_S01
	 */
	static MCQueryPlan MGBBL0050_MGW_ITM_MFG_INST_KEY_S01() {
		MCTempView S0_TTT = createTempView("TTT");
		MGT_ITM_MFG_INST_R S0_T4 = MGT_ITM_MFG_INST_R.create("T4");
		MGW_ITM_MFG_INST_KEY_R S1_W1 = MGW_ITM_MFG_INST_KEY_R.create("W1");
		MGVT_MST_MFG_ACT_R S1_T1 = MGVT_MST_MFG_ACT_R.create("T1");
		MGVT_MST_ITM_MFG_INST_R S1_T2 = MGVT_MST_ITM_MFG_INST_R.create("T2");
		MGVT_MST_OPER_ACT_R S1_T3 = MGVT_MST_OPER_ACT_R.create("T3");
		MGVT_MST_OPER_INST_R S1_T4 = MGVT_MST_OPER_INST_R.create("T4");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MGBBL0050_MGW_ITM_MFG_INST_KEY_Query_S01")
					.mainQuery()
					.select(
						S0_TTT.pr(S1_W1.calc_ctg_cd),
						S0_TTT.pr(S1_T2.itm_cd),
						S0_TTT.pr(S1_T2.itm_sub1),
						S0_TTT.pr(S1_T2.itm_sub2),
						S0_TTT.pr(S1_T2.itm_sub3),
						S0_TTT.pr(S1_T2.itm_mfg_inst_no),
						S0_TTT.pr(S1_T1.mfg_act_no),
						S0_TTT.pr(S1_T3.oper_act_no),
						S0_TTT.pr(S1_T2.wg_cd),
						S0_T4.mng_dpt_cd,
						S0_TTT.pr(S1_T4.oper_cd),
						S0_TTT.pr("oper_seq"),
						S0_TTT.pr(S1_T4.disp_seq),
						S0_TTT.pr("qty"),
						S0_TTT.pr("schd_st_dt"),
						S0_TTT.pr("schd_end_dt"),
						S0_TTT.pr("act_st_dt"),
						S0_TTT.pr("act_end_dt"),
						S0_TTT.pr("rmrks")
					)
					.from(
						subQuery()
						.select(
							S1_W1.calc_ctg_cd,
							S1_T2.itm_cd,
							S1_T2.itm_sub1,
							S1_T2.itm_sub2,
							S1_T2.itm_sub3,
							S1_T2.itm_mfg_inst_no,
							S1_T1.mfg_act_no,
							S1_T3.oper_act_no,
							S1_T2.wg_cd,
							S1_T4.oper_cd,
							nvl(
								S1_T4.oper_seq,
								value(0)
							).as("oper_seq"),
							S1_T4.disp_seq,
							S1_T3.base_unit_qty.as("qty"),
							trunc(
								S1_T4.st_schd_tm,
								MCDateFmt.DD
							).as("schd_st_dt"),
							trunc(
								S1_T4.end_schd_tm,
								MCDateFmt.DD
							).as("schd_end_dt"),
							trunc(
								S1_T3.st_act_tm,
								MCDateFmt.DD
							).as("act_st_dt"),
							trunc(
								S1_T3.end_act_tm,
								MCDateFmt.DD
							).as("act_end_dt"),
							S1_T3.act_rpt_rmrks.as("rmrks")
						)
						.from(
							S1_W1
							.innerJoin(S1_T1).on(
								S1_T1.itm_mfg_inst_no.eq(S1_W1.itm_mfg_inst_no)
								.and(S1_T1.mfg_act_no.eq(S1_W1.mfg_act_no))
							)
							.innerJoin(S1_T2).on(
								S1_T2.itm_cd.eq(S1_W1.itm_cd)
								.and(S1_T2.itm_sub1.eq(S1_W1.itm_sub1))
								.and(S1_T2.itm_sub2.eq(S1_W1.itm_sub2))
								.and(S1_T2.itm_sub3.eq(S1_W1.itm_sub3))
								.and(S1_T2.itm_mfg_inst_no.eq(S1_W1.itm_mfg_inst_no))
							)
							.innerJoin(S1_T3).on(
								S1_T3.itm_mfg_inst_no.eq(S1_T1.itm_mfg_inst_no)
								.and(S1_T3.mfg_act_no.eq(S1_T1.mfg_act_no))
							)
							.innerJoin(S1_T4).on(S1_T4.oper_inst_no.eq(S1_T3.oper_inst_no))
						)
						.where(
							value(0).eq(value(0))
							.and(S1_T4.oper_cd.isNotNull())
							.and(S1_T4.oper_cd.neq(value(MAC_STR.NULL_VAL.value())))
						).view(S0_TTT)
						.innerJoin(S0_T4).on(
							S0_T4.calc_ctg_cd.eq(S0_TTT.pr(S1_W1.calc_ctg_cd))
							.and(S0_T4.itm_cd.eq(S0_TTT.pr(S1_T2.itm_cd)))
							.and(S0_T4.itm_sub1.eq(S0_TTT.pr(S1_T2.itm_sub1)))
							.and(S0_T4.itm_sub2.eq(S0_TTT.pr(S1_T2.itm_sub2)))
							.and(S0_T4.itm_sub3.eq(S0_TTT.pr(S1_T2.itm_sub3)))
							.and(S0_T4.itm_mfg_inst_no.eq(S0_TTT.pr(S1_T2.itm_mfg_inst_no)))
							.and(S0_T4.mfg_act_no.eq(S0_TTT.pr(S1_T1.mfg_act_no)))
						)
					)
					.where(
						value(0).eq(value(0))
					)
			);
	}
}