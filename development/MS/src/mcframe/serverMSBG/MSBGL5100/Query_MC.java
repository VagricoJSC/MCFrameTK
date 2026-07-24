package mcframe.serverMSBG.MSBGL5100;

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
	 * -- MSBGL5100_MST_BILL_D_APPL_BAL_Query_S01
	 */
	static MCQueryPlan MSBGL5100_MST_BILL_D_APPL_BAL_S01() {
		MST_RCV_ACT_D_R S0_TA1 = MST_RCV_ACT_D_R.create("TA1");
		MCTempView S0_TA2 = createTempView("TA2");
		MST_AR_APPL_SCHD_R S0_TA3 = MST_AR_APPL_SCHD_R.create("TA3");
		MST_BILL_ACST_R S0_TA4 = MST_BILL_ACST_R.create("TA4");
		MST_BILL_R S0_TA5 = MST_BILL_R.create("TA5");
		MST_BILL_D_R S0_TA6 = MST_BILL_D_R.create("TA6");
		MST_BILL_D_APPL_BAL_R S0_TA7 = MST_BILL_D_APPL_BAL_R.create("TA7");
		MST_BILL_D_R S0_TA8 = MST_BILL_D_R.create("TA8");
		MST_RCV_ACT_R S0_TA9 = MST_RCV_ACT_R.create("TA9");
		MST_AR_APPL_ACT_R S1_TB1 = MST_AR_APPL_ACT_R.create("TB1");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBGL5100_MST_BILL_D_APPL_BAL_Query_S01")
					.mainQuery()
					.select(
						S0_TA9.ac_ym.as("rcv_act_ac_ym"),
						S0_TA9.rcv_act_no,
						S0_TA9.rcv_act_seq,
						S0_TA9.trd_cd,
						S0_TA9.trd_cur_cd,
						S0_TA1.rcv_act_d_no,
						S0_TA1.rcv_act_d_seq,
						S0_TA1.acst_cd,
						S0_TA1.ar_dpt_cd,
						S0_TA1.iv_no,
						S0_TA1.wrk_no,
						S0_TA1.ar_typ,
						S0_TA5.bcst_cd,
						S0_TA5.bill_dpt_cd,
						S0_TA5.bill_mng_no,
						S0_TA6.ac_dt,
						S0_TA7.bill_d_no,
						S0_TA7.parent_bill_d_no,
						S0_TA7.not_appl_bal,
						S0_TA7.appl_amt,
						S0_TA8.slip_sts_typ.as("par_slip_sts_typ"),
						S0_TA8.act_d_no.as("par_act_d_no"),
						S0_TA8.act_d_seq.as("par_act_d_seq")
					)
					.from(
						S0_TA1
						.innerJoin(
							subQuery()
							.select(
								S1_TB1.rcv_act_d_no,
								S1_TB1.rcv_act_d_seq,
								S1_TB1.ar_appl_schd_no
							)
							.from(S1_TB1)
							.groupBy(
								S1_TB1.rcv_act_d_no,
								S1_TB1.rcv_act_d_seq,
								S1_TB1.ar_appl_schd_no
							).view(S0_TA2)
						).on(
							bracket(
								S0_TA1.rcv_act_d_no.eq(S0_TA2.pr(S1_TB1.rcv_act_d_no))
								.and(S0_TA1.rcv_act_d_seq.eq(S0_TA2.pr(S1_TB1.rcv_act_d_seq)))
							)
						)
						.innerJoin(S0_TA3).on(
							bracket(
								S0_TA2.pr(S1_TB1.ar_appl_schd_no).eq(S0_TA3.ar_appl_schd_no)
							)
						)
						.innerJoin(S0_TA4).on(
							bracket(
								S0_TA3.bill_acst_no.eq(S0_TA4.bill_acst_no)
							)
						)
						.innerJoin(S0_TA5).on(
							bracket(
								S0_TA4.bill_mng_no.eq(S0_TA5.bill_mng_no)
							)
						)
						.innerJoin(S0_TA6).on(
							bracket(
								S0_TA4.bill_acst_no.eq(S0_TA6.bill_acst_no)
								.and(S0_TA3.iv_no.eq(S0_TA6.iv_no))
							)
						)
						.innerJoin(S0_TA7).on(
							bracket(
								S0_TA6.bill_d_no.eq(S0_TA7.bill_d_no)
							)
						)
						.innerJoin(S0_TA8).on(
							bracket(
								S0_TA7.parent_bill_d_no.eq(S0_TA8.bill_d_no)
							)
						)
						.innerJoin(S0_TA9).on(
							bracket(
								S0_TA1.rcv_act_no.eq(S0_TA9.rcv_act_no)
								.and(S0_TA1.rcv_act_seq.eq(S0_TA9.rcv_act_seq))
							)
						)
					)
					.where(
						value(0).eq(value(0))
						.and(S0_TA1.rcv_act_d_no.eq(bind("rcv_act_d_no")))
						.and(S0_TA1.rcv_act_d_seq.eq(bind("rcv_act_d_seq")))
						.and(S0_TA5.bill_cl_sts_typ.neq(value(MSC_BILL_CL_STS_TYP.NOT_BILL.value())))
						.and(S0_TA7.not_appl_bal.neq(value(0)))
					)
					.orderBy(
						S0_TA6.ac_dt.asc(),
						S0_TA5.bill_mng_no.asc(),
						S0_TA7.parent_bill_d_no.asc()
					)
			);
	}
	
	/**
	 * -- MSBGL5100_MST_BILL_D_APPL_BAL_Query_S02
	 */
	static MCQueryPlan MSBGL5100_MST_BILL_D_APPL_BAL_S02() {
		MST_BILL_D_APPL_BAL_R S0_TA1 = MST_BILL_D_APPL_BAL_R.create("TA1");
		MST_BILL_D_R S0_TA2 = MST_BILL_D_R.create("TA2");
		MST_BILL_R S0_TA3 = MST_BILL_R.create("TA3");
		MST_BILL_ACST_R S0_TA4 = MST_BILL_ACST_R.create("TA4");
		MST_BILL_D_R S0_TA5 = MST_BILL_D_R.create("TA5");
		MST_BILL_D_APPL_BAL_R S0_TA6 = MST_BILL_D_APPL_BAL_R.create("TA6");
		MST_BILL_D_R S1_TB1 = MST_BILL_D_R.create("TB1");
		MST_BILL_D_APPL_BAL_R S1_TB2 = MST_BILL_D_APPL_BAL_R.create("TB2");
		MST_BILL_R S1_TB3 = MST_BILL_R.create("TB3");
		MST_BILL_ACST_R S1_TB4 = MST_BILL_ACST_R.create("TB4");
		MST_BILL_D_R S1_TB5 = MST_BILL_D_R.create("TB5");
		MST_BILL_D_R S2_TB1 = MST_BILL_D_R.create("TB1");
		MST_BILL_D_APPL_BAL_R S2_TB2 = MST_BILL_D_APPL_BAL_R.create("TB2");
		MST_BILL_R S2_TB3 = MST_BILL_R.create("TB3");
		MST_BILL_ACST_R S2_TB4 = MST_BILL_ACST_R.create("TB4");
		MST_BILL_D_R S2_TB5 = MST_BILL_D_R.create("TB5");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBGL5100_MST_BILL_D_APPL_BAL_Query_S02")
					.mainQuery()
					.select(
						cases()
							.when(S0_TA2.slip_sts_typ.eq(value(MAC_SLIP_STS_TYP.DIS.value())))
								.then(
									S0_TA2.act_d_no.concat(
										toChar(
											S0_TA2.act_d_seq,
											4,
											0
										)
									)
							)
							.when(S0_TA2.slip_sts_typ.eq(value(MAC_SLIP_STS_TYP.CAN.value())))
								.then(
									S0_TA2.act_d_no.concat(
										toChar(
											S0_TA2.act_d_seq.subtract(value(1)),
											4,
											0
										)
									)
							)
							.when(S0_TA2.slip_sts_typ.eq(value(MAC_SLIP_STS_TYP.CRT.value())))
								.then(
									S0_TA2.act_d_no.concat(
										toChar(
											S0_TA2.act_d_seq,
											4,
											0
										)
									)
							)
							.otherwise(nullValue()).as("grp_id"),
						nullValue().as("rcv_act_ac_ym"),
						nullValue().as("rcv_act_no"),
						nullValue().as("rcv_act_seq"),
						nullValue().as("trd_cd"),
						S0_TA3.bill_mng_no,
						S0_TA3.trd_cur_cd,
						nullValue().as("rcv_act_d_no"),
						nullValue().as("rcv_act_d_seq"),
						S0_TA4.acst_cd,
						S0_TA4.ar_dpt_cd,
						S0_TA3.iv_no,
						S0_TA3.wrk_no,
						S0_TA3.bcst_cd,
						S0_TA3.bill_dpt_cd,
						S0_TA2.ac_dt,
						S0_TA2.xrate,
						S0_TA1.bill_d_no,
						S0_TA1.parent_bill_d_no,
						S0_TA1.not_appl_bal,
						S0_TA1.appl_amt
					)
					.from(
						S0_TA1
						.innerJoin(S0_TA2).on(S0_TA1.bill_d_no.eq(S0_TA2.bill_d_no))
						.innerJoin(S0_TA3).on(S0_TA2.bill_mng_no.eq(S0_TA3.bill_mng_no))
						.innerJoin(S0_TA4).on(S0_TA2.bill_acst_no.eq(S0_TA4.bill_acst_no))
						.innerJoin(S0_TA5).on(S0_TA5.bill_d_no.eq(S0_TA1.parent_bill_d_no))
						.innerJoin(S0_TA6).on(S0_TA6.bill_d_no.eq(S0_TA1.parent_bill_d_no))
					)
					.where(
						value(0).eq(value(0))
						.and(S0_TA1.appl_amt.eq(value(0)))
						.and(S0_TA1.not_appl_bal.neq(value(0)))
						.and(S0_TA3.bill_cl_sts_typ.neq(value(MSC_BILL_CL_STS_TYP.NOT_BILL.value())))
						.and(S0_TA3.bill_each_sls_flg.eq(value(true)))
						.and(
							bracket(
								S0_TA5.slip_sts_typ.eq(value(MAC_SLIP_STS_TYP.CAN.value()))
								.and(
									exists(
										subQuery()
										.select(value("X"))
										.from(
											S1_TB1
											.innerJoin(S1_TB2).on(S1_TB1.bill_d_no.eq(S1_TB2.parent_bill_d_no))
											.innerJoin(S1_TB3).on(
												S0_TA3.bcst_cd.eq(S1_TB3.bcst_cd)
												.and(S0_TA3.bill_dpt_cd.eq(S1_TB3.bill_dpt_cd))
												.and(S0_TA3.trd_cur_cd.eq(S1_TB3.trd_cur_cd))
												.and(S0_TA3.iv_no.eq(S1_TB3.iv_no))
												.and(S1_TB3.bill_cl_sts_typ.neq(value(MSC_BILL_CL_STS_TYP.NOT_BILL.value())))
												.and(S1_TB3.bill_each_sls_flg.eq(value(true)))
											)
											.innerJoin(S1_TB4).on(
												S0_TA4.acst_cd.eq(S1_TB4.acst_cd)
												.and(S0_TA4.ar_dpt_cd.eq(S1_TB4.ar_dpt_cd))
											)
											.innerJoin(S1_TB5).on(
												S1_TB2.bill_d_no.eq(S1_TB5.bill_d_no)
												.and(S1_TB5.bill_acst_no.eq(S1_TB4.bill_acst_no))
												.and(S1_TB5.bill_mng_no.eq(S1_TB3.bill_mng_no))
											)
										)
										.where(
											value(0).eq(value(0))
											.and(S1_TB1.act_d_no.eq(S0_TA5.act_d_no))
											.and(S1_TB1.act_d_seq.eq(S0_TA5.act_d_seq.subtract(value(1))))
											.and(
												S0_TA3.wrk_no.eq(S1_TB3.wrk_no)
												.or(S0_TA3.wrk_no.isNull())
												.and(S1_TB3.wrk_no.isNull())
											)
											.and(S1_TB2.appl_tgt_amt.add(S0_TA6.appl_tgt_amt).eq(value(0)))
											.and(S1_TB2.appl_amt.eq(value(0)))
										)
									)
								)
							)
							.or(
								S0_TA5.slip_sts_typ.eq(value(MAC_SLIP_STS_TYP.DIS.value()))
								.and(
									exists(
										subQuery()
										.select(value("X"))
										.from(
											S2_TB1
											.innerJoin(S2_TB2).on(S2_TB1.bill_d_no.eq(S2_TB2.parent_bill_d_no))
											.innerJoin(S2_TB3).on(
												S0_TA3.bcst_cd.eq(S2_TB3.bcst_cd)
												.and(S0_TA3.bill_dpt_cd.eq(S2_TB3.bill_dpt_cd))
												.and(S0_TA3.trd_cur_cd.eq(S2_TB3.trd_cur_cd))
												.and(S0_TA3.iv_no.eq(S2_TB3.iv_no))
												.and(S2_TB3.bill_cl_sts_typ.neq(value(MSC_BILL_CL_STS_TYP.NOT_BILL.value())))
												.and(S2_TB3.bill_each_sls_flg.eq(value(true)))
											)
											.innerJoin(S2_TB4).on(
												S0_TA4.acst_cd.eq(S2_TB4.acst_cd)
												.and(S0_TA4.ar_dpt_cd.eq(S2_TB4.ar_dpt_cd))
											)
											.innerJoin(S2_TB5).on(
												S2_TB2.bill_d_no.eq(S2_TB5.bill_d_no)
												.and(S2_TB5.bill_acst_no.eq(S2_TB4.bill_acst_no))
												.and(S2_TB5.bill_mng_no.eq(S2_TB3.bill_mng_no))
											)
										)
										.where(
											value(0).eq(value(0))
											.and(S2_TB1.act_d_no.eq(S0_TA5.act_d_no))
											.and(S2_TB1.act_d_seq.eq(S0_TA5.act_d_seq.add(value(1))))
											.and(
												S0_TA3.wrk_no.eq(S2_TB3.wrk_no)
												.or(S0_TA3.wrk_no.isNull())
												.and(S2_TB3.wrk_no.isNull())
											)
											.and(S2_TB2.appl_tgt_amt.add(S0_TA6.appl_tgt_amt).eq(value(0)))
											.and(S2_TB2.appl_amt.eq(value(0)))
										)
									)
								)
							)
						)
					)
					.orderBy(
						S0_TA3.bcst_cd.asc(),
						S0_TA3.bill_dpt_cd.asc(),
						S0_TA3.trd_cur_cd.asc(),
						S0_TA3.iv_no.asc(),
						S0_TA3.wrk_no.asc()
					)
					.forUpdate(S0_TA3.bill_mng_no)
			);
	}
	
	/**
	 * -- MSBGL5100_MST_RCV_ACT_D_Query_S01
	 */
	static MCQueryPlan MSBGL5100_MST_RCV_ACT_D_S01() {
		MST_RCV_ACT_D_R S0_T1 = MST_RCV_ACT_D_R.create("T1");
		MST_BILL_D_APPL_ACT_R S0_T2 = MST_BILL_D_APPL_ACT_R.create("T2");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBGL5100_MST_RCV_ACT_D_Query_S01")
					.mainQuery()
					.select(
						S0_T1.rcv_act_d_no,
						S0_T1.rcv_act_d_seq,
						S0_T1.trd_cur_amt1.add(S0_T1.trd_cur_amt2).add(S0_T1.trd_cur_amt3).subtract(
									nvl(
										sum(S0_T2.appl_amt),
										value(0)
									)
								).as("not_appl_bal")
					)
					.from(
						S0_T1
						.leftOuterJoin(S0_T2).on(S0_T1.rcv_act_d_no.eq(S0_T2.rcv_act_d_no))
					)
					.where(
						value(0).eq(value(0))
						.and(S0_T1.rcv_act_no.eq(bind("rcv_act_no")))
					)
					.groupBy(
						S0_T1.rcv_act_d_no,
						S0_T1.rcv_act_d_seq,
						S0_T1.trd_cur_amt1,
						S0_T1.trd_cur_amt2,
						S0_T1.trd_cur_amt3
					)
			);
	}
}