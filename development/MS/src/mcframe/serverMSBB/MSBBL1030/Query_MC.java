package mcframe.serverMSBB.MSBBL1030;

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
	 * -- MABBL1030_MST_CST_WRK_Query_S01
	 */
	static MCQueryPlan MABBL1030_MST_CST_WRK_S01() {
		MST_CST_WRK_R S0_T1 = MST_CST_WRK_R.create("T1");
		MAM_BP_R S0_M1 = MAM_BP_R.create("M1");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MABBL1030_MST_CST_WRK_Query_S01")
					.mainQuery()
					.select(
						S0_T1.wrk_no,
						S0_T1.cst_cd,
						S0_T1.cst_sundry_flg,
						nvl(
							S0_T1.cst_nm,
							S0_M1.bp_nm
						).as("cst_nm"),
						S0_T1.cst_cntct_dpt,
						S0_T1.cst_cntct_psn,
						S0_T1.zip_cd,
						S0_T1.addr1,
						S0_T1.addr2,
						S0_T1.addr3,
						S0_T1.addr4,
						S0_T1.tel,
						S0_T1.fax,
						S0_T1.capital,
						S0_T1.emp_num,
						S0_T1.sub_char1,
						S0_T1.sub_char2,
						S0_T1.sub_char3,
						S0_T1.ins_usr_id,
						S0_T1.ins_usr_nm,
						S0_T1.ins_ts,
						S0_T1.ins_func_id,
						S0_T1.upd_cntr,
						S0_T1.upd_usr_id,
						S0_T1.upd_usr_nm,
						S0_T1.upd_ts,
						S0_T1.upd_func_id,
						S0_T1.upd_srv_req_no
					)
					.from(
						S0_T1
						.leftOuterJoin(S0_M1).on(
							bracket(
								S0_T1.cst_cd.eq(S0_M1.bp_cd)
							)
						)
					)
					.where(
						value(0).eq(value(0))
						.and(S0_T1.wrk_no.eq(bind("wrk_no")))
					)
					.orderBy(S0_T1.cst_cd.asc())
			);
	}
	
	/**
	 * -- MABBL1030_MST_WRK_Query_S01
	 */
	static MCQueryPlan MABBL1030_MST_WRK_S01() {
		MST_WRK_R S0_T1 = MST_WRK_R.create("T1");
		MST_WRK_MNG_R S0_T2 = MST_WRK_MNG_R.create("T2");
		MST_WRK_MNG_R S0_T3 = MST_WRK_MNG_R.create("T3");
		MAM_CUR_R S0_M1 = MAM_CUR_R.create("M1");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MABBL1030_MST_WRK_Query_S01")
					.mainQuery()
					.select(
						S0_T1.wrk_no,
						S0_T1.wrk_nm,
						S0_T1.st_dt,
						S0_T1.end_dt,
						S0_T1.wrk_desc,
						S0_T1.term_cond,
						S0_T1.wrk_sts_cd,
						S0_T2.wrk_mng_nm.as("wrk_sts_nm"),
						S0_T1.slo_acc_cd,
						S0_T3.wrk_mng_nm.as("slo_acc_nm"),
						S0_T1.cur_cd,
						S0_M1.cur_nm,
						S0_M1.amt_dec_place,
						S0_T1.budget,
						S0_T1.slo_rsn,
						S0_T1.fail_rsn,
						S0_T1.wrk_rmrks,
						S0_T1.sub_char1,
						S0_T1.sub_char2,
						S0_T1.sub_char3,
						S0_T1.wrk_ar_flg,
						S0_T1.wrk_ap_flg,
						S0_T1.can_flg,
						S0_T1.ins_usr_id,
						S0_T1.ins_usr_nm,
						S0_T1.ins_ts,
						S0_T1.ins_func_id,
						S0_T1.upd_cntr,
						S0_T1.upd_usr_id,
						S0_T1.upd_usr_nm,
						S0_T1.upd_ts,
						S0_T1.upd_func_id,
						S0_T1.upd_srv_req_no
					)
					.from(
						S0_T1
						.leftOuterJoin(S0_T2).on(
							bracket(
								S0_T1.wrk_sts_cd.eq(S0_T2.wrk_mng_cd)
								.and(S0_T2.wrk_mng_typ.eq(value(MSC_WRK_MNG_TYP.WRK_STS.value())))
							)
						)
						.leftOuterJoin(S0_T3).on(
							bracket(
								S0_T1.slo_acc_cd.eq(S0_T3.wrk_mng_cd)
								.and(S0_T3.wrk_mng_typ.eq(value(MSC_WRK_MNG_TYP.SLO_ACC.value())))
							)
						)
						.leftOuterJoin(S0_M1).on(
							bracket(
								S0_T1.cur_cd.eq(S0_M1.cur_cd)
							)
						)
					)
					.where(
						value(0).eq(value(0))
						.and(S0_T1.wrk_no.eq(bind("wrk_no")))
					)
			);
	}
	
	/**
	 * -- MSBBL1030_MST_QTN_Query_S01
	 */
	static MCQueryPlan MSBBL1030_MST_QTN_S01() {
		MST_QTN_R S0_T1 = MST_QTN_R.create("T1");
		MAM_USR_R S0_M1 = MAM_USR_R.create("M1");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBBL1030_MST_QTN_Query_S01")
					.mainQuery()
					.select(
						S0_T1.qtn_no,
						S0_T1.qtn_rev,
						S0_T1.qtn_typ,
						S0_T1.qtn_dt,
						S0_T1.valid_dt,
						S0_T1.rcpt_dt,
						S0_T1.rcpt_usr_cd,
						S0_M1.usr_nm.as("rcpt_usr_nm"),
						S0_T1.qtn_rmrks,
						S0_T1.ins_usr_id,
						S0_T1.ins_usr_nm,
						S0_T1.ins_ts,
						S0_T1.ins_func_id,
						S0_T1.upd_cntr,
						S0_T1.upd_usr_id,
						S0_T1.upd_usr_nm,
						S0_T1.upd_ts,
						S0_T1.upd_func_id,
						S0_T1.upd_srv_req_no
					)
					.from(
						S0_T1
						.leftOuterJoin(S0_M1).on(
							bracket(
								S0_T1.rcpt_usr_cd.eq(S0_M1.usr_cd)
							)
						)
					)
					.where(
						value(0).eq(value(0))
						.and(S0_T1.wrk_no.eq(bind("wrk_no")))
					)
					.orderBy(
						S0_T1.qtn_no.asc(),
						S0_T1.qtn_rev.asc()
					)
			);
	}
	
	/**
	 * -- MSBBL1030_MST_WRK_ACT_HIST_Query_S01
	 */
	static MCQueryPlan MSBBL1030_MST_WRK_ACT_HIST_S01() {
		MST_WRK_ACT_HIST_R S0_T1 = MST_WRK_ACT_HIST_R.create("T1");
		MST_WRK_MNG_R S0_M1 = MST_WRK_MNG_R.create("M1");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBBL1030_MST_WRK_ACT_HIST_Query_S01")
					.mainQuery()
					.select(
						S0_T1.wrk_no,
						S0_T1.hist_no,
						S0_T1.act_sts_cd,
						S0_M1.wrk_mng_nm.as("act_sts_nm"),
						S0_T1.act_hist,
						S0_T1.act_schd_dt,
						S0_T1.act_schd,
						S0_T1.act_act_dt,
						S0_T1.act_act,
						S0_T1.sub_char1,
						S0_T1.sub_char2,
						S0_T1.sub_char3,
						S0_T1.ins_usr_id,
						S0_T1.ins_usr_nm,
						S0_T1.ins_ts,
						S0_T1.ins_func_id,
						S0_T1.upd_cntr,
						S0_T1.upd_usr_id,
						S0_T1.upd_usr_nm,
						S0_T1.upd_ts,
						S0_T1.upd_func_id,
						S0_T1.upd_srv_req_no
					)
					.from(
						S0_T1
						.leftOuterJoin(S0_M1).on(
							bracket(
								S0_T1.act_sts_cd.eq(S0_M1.wrk_mng_cd)
								.and(S0_M1.wrk_mng_typ.eq(value(MSC_WRK_MNG_TYP.WRK_ACT_STS.value())))
							)
						)
					)
					.where(
						value(0).eq(value(0))
						.and(S0_T1.wrk_no.eq(bind("wrk_no")))
					)
					.orderBy(
						S0_T1.act_schd_dt.asc(),
						S0_T1.act_act_dt.asc()
					)
			);
	}
	
	/**
	 * -- MSBBL1030_MST_WRK_COMP_Query_S01
	 */
	static MCQueryPlan MSBBL1030_MST_WRK_COMP_S01() {
		MST_WRK_COMP_R S0_T1 = MST_WRK_COMP_R.create("T1");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBBL1030_MST_WRK_COMP_Query_S01")
					.mainQuery()
					.select(
						S0_T1.wrk_no,
						S0_T1.comp_no,
						S0_T1.comp_dt,
						S0_T1.comp_info,
						S0_T1.sub_char1,
						S0_T1.sub_char2,
						S0_T1.sub_char3,
						S0_T1.ins_usr_id,
						S0_T1.ins_usr_nm,
						S0_T1.ins_ts,
						S0_T1.ins_func_id,
						S0_T1.upd_cntr,
						S0_T1.upd_usr_id,
						S0_T1.upd_usr_nm,
						S0_T1.upd_ts,
						S0_T1.upd_func_id,
						S0_T1.upd_srv_req_no
					)
					.from(S0_T1)
					.where(
						value(0).eq(value(0))
						.and(S0_T1.wrk_no.eq(bind("wrk_no")))
					)
					.orderBy(S0_T1.comp_dt.asc())
			);
	}
	
	/**
	 * -- MSBBL1030_MST_WRK_SNO_Query_S01
	 */
	static MCQueryPlan MSBBL1030_MST_WRK_SNO_S01() {
		MST_WRK_SNO_R S0_T1 = MST_WRK_SNO_R.create("T1");
		MCTempView S0_T2 = createTempView("T2");
		MCTempView S0_T3 = createTempView("T3");
		MST_QTN_R S1_ST1 = MST_QTN_R.create("ST1");
		MST_QTN_D_R S1_ST2 = MST_QTN_D_R.create("ST2");
		MST_SLO_R S2_ST3 = MST_SLO_R.create("ST3");
		MST_SLO_D_R S2_ST4 = MST_SLO_D_R.create("ST4");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBBL1030_MST_WRK_SNO_Query_S01")
					.mainQuery()
					.select(
						S0_T1.wrk_no,
						S0_T1.sno1,
						decode(
							S0_T2.pr(S1_ST1.wrk_no),
							nullValue(),
							value(false),
							value(true)
						).as("qtn_flg"),
						decode(
							S0_T3.pr(S2_ST3.wrk_no),
							nullValue(),
							value(false),
							value(true)
						).as("slo_flg"),
						S0_T1.ins_usr_id,
						S0_T1.ins_usr_nm,
						S0_T1.ins_ts,
						S0_T1.ins_func_id,
						S0_T1.upd_cntr,
						S0_T1.upd_usr_id,
						S0_T1.upd_usr_nm,
						S0_T1.upd_ts,
						S0_T1.upd_func_id,
						S0_T1.upd_srv_req_no
					)
					.from(
						S0_T1
						.leftOuterJoin(
							subQuery()
							.selectDistinct(
								S1_ST1.wrk_no,
								S1_ST2.sno1
							)
							.from(
								S1_ST1
								.leftOuterJoin(S1_ST2).on(
									bracket(
										S1_ST2.qtn_no.eq(S1_ST1.qtn_no)
										.and(S1_ST2.qtn_rev.eq(S1_ST1.qtn_rev))
									)
								)
							)
							.where(
								S1_ST1.wrk_no.isNotNull()
								.and(S1_ST1.can_flg.eq(value(false)))
							).view(S0_T2)
						).on(
							bracket(
								S0_T2.pr(S1_ST1.wrk_no).eq(S0_T1.wrk_no)
								.and(S0_T2.pr(S1_ST2.sno1).eq(S0_T1.sno1))
							)
						)
						.leftOuterJoin(
							subQuery()
							.selectDistinct(
								S2_ST3.wrk_no,
								S2_ST4.sno1
							)
							.from(
								S2_ST3
								.leftOuterJoin(S2_ST4).on(
									bracket(
										S2_ST4.slo_no.eq(S2_ST3.slo_no)
										.and(S2_ST4.slo_rev.eq(S2_ST3.slo_rev))
									)
								)
							)
							.where(
								S2_ST3.wrk_no.isNotNull()
								.and(S2_ST3.can_flg.eq(value(false)))
							).view(S0_T3)
						).on(
							bracket(
								S0_T3.pr(S2_ST3.wrk_no).eq(S0_T1.wrk_no)
								.and(S0_T3.pr(S2_ST4.sno1).eq(S0_T1.sno1))
							)
						)
					)
					.where(
						value(0).eq(value(0))
						.and(S0_T1.wrk_no.eq(bind("wrk_no")))
					)
					.orderBy(S0_T1.sno1.asc())
			);
	}
}