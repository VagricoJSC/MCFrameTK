package mcframe.serverMSBI.MSBIL5010;

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
	 * -- MSBIL5010_MST_CLOSE_Query_S01
	 */
	static MCQueryPlan MSBIL5010_MST_CLOSE_S01() {
		MST_CLOSE_R S0_T1 = MST_CLOSE_R.create("T1");
		MST_CLOSE_R S1_T2 = MST_CLOSE_R.create("T2");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBIL5010_MST_CLOSE_Query_S01")
					.mainQuery()
					.select(S0_T1.ym)
					.from(S0_T1)
					.where(
						S0_T1.ym.eq(subQuery()
							.select(max(S1_T2.ym))
							.from(S1_T2)
							.where(
								value(0).eq(value(0))
								.and(S1_T2.sls_cl_flg.eq(value(true)))
							)
						)
					)
			);
	}
	
	/**
	 * -- MSBIL5010_MST_CLOSE_Query_S02
	 */
	static MCQueryPlan MSBIL5010_MST_CLOSE_S02() {
		MST_CLOSE_R S0_T1 = MST_CLOSE_R.create("T1");
		MST_CLOSE_R S1_T2 = MST_CLOSE_R.create("T2");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBIL5010_MST_CLOSE_Query_S02")
					.mainQuery()
					.select(S0_T1.ym)
					.from(S0_T1)
					.where(
						S0_T1.ym.eq(subQuery()
							.select(max(S1_T2.ym))
							.from(S1_T2)
							.where(
								value(0).eq(value(0))
								.and(S1_T2.rcv_cl_flg.eq(value(true)))
							)
						)
					)
			);
	}
	
	/**
	 * -- MSBIL5010_MST_CLOSE_Query_S03
	 */
	static MCQueryPlan MSBIL5010_MST_CLOSE_S03() {
		MST_CLOSE_R S0_T1 = MST_CLOSE_R.create("T1");
		MST_CLOSE_R S1_T2 = MST_CLOSE_R.create("T2");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBIL5010_MST_CLOSE_Query_S03")
					.mainQuery()
					.select(S0_T1.ym)
					.from(S0_T1)
					.where(
						S0_T1.ym.eq(subQuery()
							.select(max(S1_T2.ym))
							.from(S1_T2)
							.where(
								value(0).eq(value(0))
								.and(S1_T2.purc_cl_flg.eq(value(true)))
							)
						)
					)
			);
	}
	
	/**
	 * -- MSBIL5010_MST_CLOSE_Query_S04
	 */
	static MCQueryPlan MSBIL5010_MST_CLOSE_S04() {
		MST_CLOSE_R S0_T1 = MST_CLOSE_R.create("T1");
		MST_CLOSE_R S1_T2 = MST_CLOSE_R.create("T2");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBIL5010_MST_CLOSE_Query_S04")
					.mainQuery()
					.select(S0_T1.ym)
					.from(S0_T1)
					.where(
						S0_T1.ym.eq(subQuery()
							.select(max(S1_T2.ym))
							.from(S1_T2)
							.where(
								value(0).eq(value(0))
								.and(S1_T2.pay_cl_flg.eq(value(true)))
							)
						)
					)
			);
	}
	
	/**
	 * -- MSBIL5010_MST_CLOSE_Query_S05
	 */
	static MCQueryPlan MSBIL5010_MST_CLOSE_S05() {
		MST_CLOSE_R S0_T1 = MST_CLOSE_R.create("T1");
		MST_CLOSE_R S1_T2 = MST_CLOSE_R.create("T2");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBIL5010_MST_CLOSE_Query_S05")
					.mainQuery()
					.select(S0_T1.ym)
					.from(S0_T1)
					.where(
						S0_T1.ym.eq(subQuery()
							.select(max(S1_T2.ym))
							.from(S1_T2)
							.where(
								value(0).eq(value(0))
								.and(S1_T2.stk_cl_flg.eq(value(true)))
							)
						)
					)
			);
	}
	/**
	 * -- MSBIL5010_MST_CLOSE_Query_S06
	 */
	public static MCQueryPlan MSBIL5010_MST_CLOSE_S06() {
		MST_CLOSE_R S0_T1 = MST_CLOSE_R.create("T1");
		MAM_USR_R S0_USR1 = MAM_USR_R.create("USR1");
		MST_CLOSE_R S1_T2 = MST_CLOSE_R.create("T2");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBIL5010_MST_CLOSE_Query_S06")
					.mainQuery()
					.select(
						S0_T1.ym.as("sls_cl_ym"),
						S0_T1.sls_cl_usr_cd,
						S0_T1.sls_cl_tm,
						S0_USR1.usr_nm.as("sls_cl_usr_nm")
					)
					.from(
						S0_T1
						.leftOuterJoin(S0_USR1).on(
							bracket(
								S0_T1.sls_cl_usr_cd.eq(S0_USR1.usr_cd)
							)
						)
					)
					.where(
						S0_T1.ym.eq(subQuery()
							.select(max(S1_T2.ym))
							.from(S1_T2)
							.where(
								value(0).eq(value(0))
								.and(S1_T2.sls_cl_flg.eq(value(true)))
							)
						)
					)
			);
	}
	
	/**
	 * -- MSBIL5010_MST_CLOSE_Query_S07
	 */
	public static MCQueryPlan MSBIL5010_MST_CLOSE_S07() {
		MST_CLOSE_R S0_T1 = MST_CLOSE_R.create("T1");
		MAM_USR_R S0_USR1 = MAM_USR_R.create("USR1");
		MST_CLOSE_R S1_T2 = MST_CLOSE_R.create("T2");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBIL5010_MST_CLOSE_Query_S07")
					.mainQuery()
					.select(
						S0_T1.ym.as("rcv_cl_ym"),
						S0_T1.rcv_cl_usr_cd,
						S0_T1.rcv_cl_tm,
						S0_USR1.usr_nm.as("rcv_cl_usr_nm")
					)
					.from(
						S0_T1
						.leftOuterJoin(S0_USR1).on(
							bracket(
								S0_T1.rcv_cl_usr_cd.eq(S0_USR1.usr_cd)
							)
						)
					)
					.where(
						S0_T1.ym.eq(subQuery()
							.select(max(S1_T2.ym))
							.from(S1_T2)
							.where(
								value(0).eq(value(0))
								.and(S1_T2.rcv_cl_flg.eq(value(true)))
							)
						)
					)
			);
	}
	
	/**
	 * -- MSBIL5010_MST_CLOSE_Query_S08
	 */
	public static MCQueryPlan MSBIL5010_MST_CLOSE_S08() {
		MST_CLOSE_R S0_T1 = MST_CLOSE_R.create("T1");
		MAM_USR_R S0_USR1 = MAM_USR_R.create("USR1");
		MST_CLOSE_R S1_T2 = MST_CLOSE_R.create("T2");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBIL5010_MST_CLOSE_Query_S08")
					.mainQuery()
					.select(
						S0_T1.ym.as("purc_cl_ym"),
						S0_T1.purc_cl_usr_cd,
						S0_T1.purc_cl_tm,
						S0_USR1.usr_nm.as("purc_cl_usr_nm")
					)
					.from(
						S0_T1
						.leftOuterJoin(S0_USR1).on(
							bracket(
								S0_T1.purc_cl_usr_cd.eq(S0_USR1.usr_cd)
							)
						)
					)
					.where(
						S0_T1.ym.eq(subQuery()
							.select(max(S1_T2.ym))
							.from(S1_T2)
							.where(
								value(0).eq(value(0))
								.and(S1_T2.purc_cl_flg.eq(value(true)))
							)
						)
					)
			);
	}
	
	/**
	 * -- MSBIL5010_MST_CLOSE_Query_S09
	 */
	public static MCQueryPlan MSBIL5010_MST_CLOSE_S09() {
		MST_CLOSE_R S0_T1 = MST_CLOSE_R.create("T1");
		MAM_USR_R S0_USR1 = MAM_USR_R.create("USR1");
		MST_CLOSE_R S1_T2 = MST_CLOSE_R.create("T2");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBIL5010_MST_CLOSE_Query_S09")
					.mainQuery()
					.select(
						S0_T1.ym.as("pay_cl_ym"),
						S0_T1.pay_cl_usr_cd,
						S0_T1.pay_cl_tm,
						S0_USR1.usr_nm.as("pay_cl_usr_nm")
					)
					.from(
						S0_T1
						.leftOuterJoin(S0_USR1).on(
							bracket(
								S0_T1.pay_cl_usr_cd.eq(S0_USR1.usr_cd)
							)
						)
					)
					.where(
						S0_T1.ym.eq(subQuery()
							.select(max(S1_T2.ym))
							.from(S1_T2)
							.where(
								value(0).eq(value(0))
								.and(S1_T2.pay_cl_flg.eq(value(true)))
							)
						)
					)
			);
	}
	
	/**
	 * -- MSBIL5010_MST_CLOSE_Query_S10
	 */
	public static MCQueryPlan MSBIL5010_MST_CLOSE_S10() {
		MST_CLOSE_R S0_T1 = MST_CLOSE_R.create("T1");
		MAM_USR_R S0_USR1 = MAM_USR_R.create("USR1");
		MST_CLOSE_R S1_T2 = MST_CLOSE_R.create("T2");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBIL5010_MST_CLOSE_Query_S10")
					.mainQuery()
					.select(
						S0_T1.ym.as("stk_cl_ym"),
						S0_T1.stk_cl_usr_cd,
						S0_T1.stk_cl_tm,
						S0_USR1.usr_nm.as("stk_cl_usr_nm")
					)
					.from(
						S0_T1
						.leftOuterJoin(S0_USR1).on(
							bracket(
								S0_T1.stk_cl_usr_cd.eq(S0_USR1.usr_cd)
							)
						)
					)
					.where(
						S0_T1.ym.eq(subQuery()
							.select(max(S1_T2.ym))
							.from(S1_T2)
							.where(
								value(0).eq(value(0))
								.and(S1_T2.stk_cl_flg.eq(value(true)))
							)
						)
					)
			);
	}
	
	/**
	 * -- MSBIL5010_MST_CLOSE_Query_S11
	 */
	static MCQueryPlan MSBIL5010_MST_CLOSE_S11() {
		MST_CLOSE_R S0_T1 = MST_CLOSE_R.create("T1");
		MAM_USR_R S0_USR1 = MAM_USR_R.create("USR1");
		MST_CLOSE_R S1_T2 = MST_CLOSE_R.create("T2");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBIL5010_MST_CLOSE_Query_S11")
					.mainQuery()
					.select(
						S0_T1.ar_pre_cl_usr_cd,
						S0_T1.ar_pre_cl_tm,
						S0_USR1.usr_nm.as("ar_pre_cl_usr_nm")
					)
					.from(
						S0_T1
						.leftOuterJoin(S0_USR1).on(
							bracket(
								S0_T1.ar_pre_cl_usr_cd.eq(S0_USR1.usr_cd)
							)
						)
					)
					.where(
						S0_T1.ym.eq(subQuery()
							.select(max(S1_T2.ym))
							.from(S1_T2)
							.where(
								value(0).eq(value(0))
								.and(S1_T2.ar_pre_cl_flg.eq(value(true)))
							)
						)
					)
			);
	}
	
	/**
	 * -- MSBIL5010_MST_CLOSE_Query_S12
	 */
	static MCQueryPlan MSBIL5010_MST_CLOSE_S12() {
		MST_CLOSE_R S0_T1 = MST_CLOSE_R.create("T1");
		MAM_USR_R S0_USR1 = MAM_USR_R.create("USR1");
		MST_CLOSE_R S1_T2 = MST_CLOSE_R.create("T2");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBIL5010_MST_CLOSE_Query_S12")
					.mainQuery()
					.select(
						S0_T1.ap_pre_cl_usr_cd,
						S0_T1.ap_pre_cl_tm,
						S0_USR1.usr_nm.as("ap_pre_cl_usr_nm")
					)
					.from(
						S0_T1
						.leftOuterJoin(S0_USR1).on(
							bracket(
								S0_T1.ap_pre_cl_usr_cd.eq(S0_USR1.usr_cd)
							)
						)
					)
					.where(
						S0_T1.ym.eq(subQuery()
							.select(max(S1_T2.ym))
							.from(S1_T2)
							.where(
								value(0).eq(value(0))
								.and(S1_T2.ap_pre_cl_flg.eq(value(true)))
							)
						)
					)
			);
	}
	
	/**
	 * -- MSBIL5010_MST_MLY_AR_BAL_Query_I01
	 */
	static MCQueryPlan MSBIL5010_MST_MLY_AR_BAL_I01() {
		MST_MLY_AR_BAL_R S0 = MST_MLY_AR_BAL_R.create();
		MST_MLY_AR_BAL_R S1_TA1 = MST_MLY_AR_BAL_R.create("TA1");
		MST_MLY_AR_BAL_R S2_TB1 = MST_MLY_AR_BAL_R.create("TB1");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBIL5010_MST_MLY_AR_BAL_Query_I01")
					.insert(S0)
					.columns(
						S0.ac_ym,
						S0.acst_cd,
						S0.ar_dpt_cd,
						S0.trd_cur_cd,
						S0.iv_no,
						S0.wrk_no,
						S0.ar_typ,
						S0.init_bal,
						S0.sls_amt,
						S0.ret_amt,
						S0.dscnt_amt,
						S0.sw_to_amt,
						S0.tax_amt,
						S0.cash_amt,
						S0.note_amt,
						S0.xfr_amt,
						S0.setoff_amt,
						S0.sw_amt,
						S0.end_bal,
						S0.ar_appl_amt,
						S0.ar_not_appl_bal,
						S0.rcv_appl_amt,
						S0.rcv_not_appl_bal,
						S0.base_cur_cd,
						S0.base_cur_init_bal,
						S0.base_cur_sls_amt,
						S0.base_cur_ret_amt,
						S0.base_cur_dscnt_amt,
						S0.base_cur_tax_amt,
						S0.base_cur_cash_amt,
						S0.base_cur_note_amt,
						S0.base_cur_xfr_amt,
						S0.base_cur_setoff_amt,
						S0.base_cur_sw_amt,
						S0.base_cur_end_bal,
						S0.base_cur_ar_appl_amt,
						S0.base_cur_ar_not_appl_bal,
						S0.base_cur_rcv_appl_amt,
						S0.base_cur_rcv_not_appl_bal,
						S0.exc_gain_loss,
						S0.total_exc_gain_loss
					)
					.query(
						subQuery()
						.select(
							addMonths(
								bind("ym"),
								value(1)
							),
							S1_TA1.acst_cd,
							S1_TA1.ar_dpt_cd,
							S1_TA1.trd_cur_cd,
							S1_TA1.iv_no,
							S1_TA1.wrk_no,
							S1_TA1.ar_typ,
							S1_TA1.end_bal,
							value(0),
							value(0),
							value(0),
							value(0),
							value(0),
							value(0),
							value(0),
							value(0),
							value(0),
							value(0),
							S1_TA1.end_bal,
							value(0),
							value(0),
							value(0),
							value(0),
							S1_TA1.base_cur_cd,
							S1_TA1.base_cur_end_bal,
							value(0),
							value(0),
							value(0),
							value(0),
							value(0),
							value(0),
							value(0),
							value(0),
							value(0),
							S1_TA1.base_cur_end_bal,
							value(0),
							value(0),
							value(0),
							value(0),
							value(0),
							S1_TA1.total_exc_gain_loss
						)
						.from(S1_TA1)
						.where(
							value(0).eq(value(0))
							.and(S1_TA1.ac_ym.eq(bind("ym")))
							.and(
								notExists(
									subQuery()
									.select(value("X"))
									.from(S2_TB1)
									.where(
										value(0).eq(value(0))
										.and(
											S2_TB1.ac_ym.eq(addMonths(
													bind("ym"),
													value(1)
												)
											)
										)
										.and(S2_TB1.acst_cd.eq(S1_TA1.acst_cd))
										.and(S2_TB1.ar_dpt_cd.eq(S1_TA1.ar_dpt_cd))
										.and(S2_TB1.trd_cur_cd.eq(S1_TA1.trd_cur_cd))
										.and(S2_TB1.iv_no.eq(S1_TA1.iv_no))
										.and(
											S2_TB1.wrk_no.eq(S1_TA1.wrk_no)
											.or(S2_TB1.wrk_no.isNull())
											.and(S1_TA1.wrk_no.isNull())
										)
										.and(S2_TB1.ar_typ.eq(S1_TA1.ar_typ))
									)
								)
							)
							.and(S1_TA1.end_bal.neq(value(0)))
						)
					)
			);
	}
	
	/**
	 * -- MSBIL5010_MST_PURC_ACT_Query_S01
	 */
	static MCQueryPlan MSBIL5010_MST_PURC_ACT_S01() {
		MST_PURC_ACT_R S0_T1 = MST_PURC_ACT_R.create("T1");
		MST_PURC_ACT_D_R S0_T2 = MST_PURC_ACT_D_R.create("T2");
		MAM_BP_R S0_M1 = MAM_BP_R.create("M1");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBIL5010_MST_PURC_ACT_Query_S01")
					.mainQuery()
					.select(countAll().as("cnt"))
					.from(
						S0_T1
						.innerJoin(S0_T2).on(
							bracket(
								S0_T2.purc_act_no.eq(S0_T1.purc_act_no)
								.and(S0_T2.purc_act_seq.eq(S0_T1.purc_act_seq))
							)
						)
						.innerJoin(S0_M1).on(
							bracket(
								S0_M1.bp_cd.eq(S0_T1.bsppl_cd)
								.and(S0_M1.purc_interim_cl_flg.eq(value(false)))
							)
						)
					)
					.where(
						S0_T2.interim_flg.eq(value(true))
						.and(S0_T1.slip_sts_typ.eq(value(MAC_SLIP_STS_TYP.CRT.value())))
						.and(S0_T1.ac_ym.eq(bind("ym")))
					)
			);
	}
	
	/**
	 * -- MSBIL5010_MST_SLS_ACT_Query_S01
	 */
	static MCQueryPlan MSBIL5010_MST_SLS_ACT_S01() {
		MST_SLS_ACT_R S0_T1 = MST_SLS_ACT_R.create("T1");
		MST_SLS_ACT_D_R S0_T2 = MST_SLS_ACT_D_R.create("T2");
		MAM_BP_R S0_M1 = MAM_BP_R.create("M1");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBIL5010_MST_SLS_ACT_Query_S01")
					.mainQuery()
					.select(countAll().as("cnt"))
					.from(
						S0_T1
						.innerJoin(S0_T2).on(
							bracket(
								S0_T2.sls_act_no.eq(S0_T1.sls_act_no)
								.and(S0_T2.sls_act_seq.eq(S0_T1.sls_act_seq))
							)
						)
						.innerJoin(S0_M1).on(
							bracket(
								S0_M1.bp_cd.eq(S0_T1.bcst_cd)
								.and(S0_M1.sls_interim_cl_flg.eq(value(false)))
							)
						)
					)
					.where(
						S0_T2.interim_flg.eq(value(true))
						.and(S0_T1.slip_sts_typ.eq(value(MAC_SLIP_STS_TYP.CRT.value())))
						.and(S0_T1.ac_ym.eq(bind("ym")))
					)
			);
	}
	
	/**
	 * -- MSBIL5010_MST_STKTK_Query_S01
	 */
	static MCQueryPlan MSBIL5010_MST_STKTK_S01() {
		MST_STKTK_R S0_STK = MST_STKTK_R.create("STK");
		MCTempView S0_STK2 = createTempView("STK2");
		MST_STKTK_R S1_V = MST_STKTK_R.create("V");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBIL5010_MST_STKTK_Query_S01")
					.mainQuery()
					.select(
						S0_STK.loc_cd,
						S0_STK.ctrl_tgt_dt
					)
					.from(
						S0_STK
						.innerJoin(
							subQuery()
							.select(
								S1_V.loc_cd,
								S1_V.itm_cd,
								S1_V.itm_sub1,
								S1_V.itm_sub2,
								S1_V.itm_sub3,
								max(S1_V.ctrl_tgt_dt).as("ctrl_tgt_dt")
							)
							.from(S1_V)
							.where(
								S1_V.io_ctrl_flg.eq(value(true))
								.and(S1_V.itm_cd.eq(value(MAC_STR.NULL_VAL.value())))
								.and(S1_V.itm_sub1.eq(value(MAC_STR.NULL_VAL.value())))
								.and(S1_V.itm_sub2.eq(value(MAC_STR.NULL_VAL.value())))
								.and(S1_V.itm_sub3.eq(value(MAC_STR.NULL_VAL.value())))
								.cutoff$and(S1_V.loc_cd.like(bind("loc_cd")))
							)
							.groupBy(
								S1_V.loc_cd,
								S1_V.itm_cd,
								S1_V.itm_sub1,
								S1_V.itm_sub2,
								S1_V.itm_sub3
							).view(S0_STK2)
						).on(
							S0_STK.itm_cd.eq(S0_STK2.pr(S1_V.itm_cd))
							.and(S0_STK.itm_sub1.eq(S0_STK2.pr(S1_V.itm_sub1)))
							.and(S0_STK.itm_sub2.eq(S0_STK2.pr(S1_V.itm_sub2)))
							.and(S0_STK.itm_sub3.eq(S0_STK2.pr(S1_V.itm_sub3)))
							.and(S0_STK.loc_cd.eq(S0_STK2.pr(S1_V.loc_cd)))
							.and(S0_STK.ctrl_tgt_dt.eq(S0_STK2.pr("ctrl_tgt_dt")))
						)
					)
					.where(
						S0_STK.io_ctrl_flg.eq(value(true))
					)
			);
	}
	
	/**
	 * -- MSBIL5010_MST_STKTK_Query_S02
	 */
	static MCQueryPlan MSBIL5010_MST_STKTK_S02() {
		MST_STKTK_R S0_STK = MST_STKTK_R.create("STK");
		MSW_STKTK_KEY_R S0_KEY = MSW_STKTK_KEY_R.create("KEY");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBIL5010_MST_STKTK_Query_S02")
					.mainQuery()
					.select(
						S0_STK.loc_cd,
						S0_STK.itm_cd,
						S0_STK.itm_sub1,
						S0_STK.itm_sub2,
						S0_STK.itm_sub3,
						S0_STK.ctrl_tgt_dt
					)
					.from(
						S0_STK
						.innerJoin(S0_KEY).on(
							S0_STK.itm_cd.eq(S0_KEY.itm_cd)
							.and(S0_STK.itm_sub1.eq(S0_KEY.itm_sub1))
							.and(S0_STK.itm_sub2.eq(S0_KEY.itm_sub2))
							.and(S0_STK.itm_sub3.eq(S0_KEY.itm_sub3))
							.and(S0_STK.loc_cd.eq(S0_KEY.loc_cd))
							.and(S0_STK.ctrl_tgt_dt.gte(S0_KEY.ctrl_tgt_dt))
						)
					)
					.where(
						S0_STK.io_ctrl_flg.eq(value(true))
					)
			);
	}
	
	/**
	 * -- MSBIL5010_MST_STKTK_Query_S03
	 */
	static MCQueryPlan MSBIL5010_MST_STKTK_S03() {
		MST_STKTK_R S0_T = MST_STKTK_R.create("T");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBIL5010_MST_STKTK_Query_S03")
					.mainQuery()
					.select(
						max(S0_T.ctrl_tgt_dt).as("ctrl_tgt_dt"),
						S0_T.loc_cd,
						S0_T.itm_cd,
						S0_T.itm_sub1,
						S0_T.itm_sub2,
						S0_T.itm_sub3,
						S0_T.stktk_typ
					)
					.from(S0_T)
					.where(
						value(0).eq(value(0))
						.and(S0_T.ctrl_tgt_dt.lte(bind("cl_dt")))
						.and(S0_T.stktk_sts_typ.eq(value(MSC_STKTK_STS_TYP.STKTK_ST.value())))
					)
					.groupBy(
						S0_T.loc_cd,
						S0_T.itm_cd,
						S0_T.itm_sub1,
						S0_T.itm_sub2,
						S0_T.itm_sub3,
						S0_T.stktk_typ
					)
			);
	}
}