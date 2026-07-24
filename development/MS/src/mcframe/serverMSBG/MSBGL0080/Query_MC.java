package mcframe.serverMSBG.MSBGL0080;

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
	 * -- MSBGL0080_MST_BILL_Query_S01
	 */
	static MCQueryPlan MSBGL0080_MST_BILL_S01() {
		MST_BILL_R S0_T1 = MST_BILL_R.create("T1");
		MST_WRK_R S0_T2 = MST_WRK_R.create("T2");
		MAM_DPT_R S0_M1 = MAM_DPT_R.create("M1");
		MAM_BP_R S0_M2 = MAM_BP_R.create("M2");
		MAM_CUR_R S0_M3 = MAM_CUR_R.create("M3");
		MAVM_RD_DPT_R S0_M4 = MAVM_RD_DPT_R.create("M4");
		MAM_WG_R S0_M5 = MAM_WG_R.create("M5");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBGL0080_MST_BILL_Query_S01")
					.mainQuery()
					.select(
						S0_T1.bill_cl_dt.as("bill_ym"),
						MSPA_AR_UTIL$F_GET_BILL_CL_DAY(
							S0_T1.bill_cl_dt,
							nvl(
								S0_T1.bill_cl_typ,
								S0_M2.bill_cl_typ
							),
							S0_T1.bill_each_sls_flg
						).as("bill_cl_day"),
						S0_T1.iv_no,
						S0_T1.prnt_flg,
						S0_M2.bill_dtl_rcv_flg.as("bfw_bal_disp_flg"),
						S0_T1.bill_dpt_cd,
						S0_M1.dpt_nm.as("bill_dpt_nm"),
						S0_T1.wg_cd,
						S0_M5.wg_nm,
						S0_T1.bcst_cd,
						S0_M2.bp_nm.as("bcst_nm"),
						S0_T1.trd_cur_cd,
						S0_M3.cur_nm.as("trd_cur_nm"),
						S0_M3.upri_dec_place,
						S0_M3.amt_dec_place,
						S0_T1.wrk_no,
						S0_T2.wrk_nm,
						S0_T1.sls_amt,
						S0_T1.ret_amt,
						S0_T1.dscnt_amt,
						S0_T1.tax_amt,
						S0_T1.sw_to_amt,
						S0_T1.rcv_schd_amt.as("rcv_schd_amt_total"),
						S0_T1.rcv_act_amt.as("rcv_act_amt_total"),
						S0_T1.not_appl_bal.as("rcv_schd_amt_bal"),
						S0_T1.rcv_schd_adjst_flg,
						S0_T1.bill_mng_no,
						S0_T1.sub_char1,
						S0_T1.sub_char2,
						S0_T1.sub_char3,
						S0_T1.ins_usr_id,
						S0_T1.ins_usr_nm,
						S0_T1.ins_func_id,
						S0_T1.ins_ts,
						S0_T1.upd_usr_id,
						S0_T1.upd_usr_nm,
						S0_T1.upd_func_id,
						S0_T1.upd_ts,
						S0_T1.upd_srv_req_no,
						S0_T1.upd_cntr
					)
					.from(
						S0_T1
						.leftOuterJoin(S0_T2).on(
							bracket(
								S0_T1.wrk_no.eq(S0_T2.wrk_no)
							)
						)
						.leftOuterJoin(S0_M1).on(
							bracket(
								S0_T1.bill_dpt_cd.eq(S0_M1.dpt_cd)
								.and(S0_T1.base_dt.between(S0_M1.st_dt, S0_M1.end_dt))
							)
						)
						.leftOuterJoin(S0_M2).on(
							bracket(
								S0_T1.bcst_cd.eq(S0_M2.bp_cd)
							)
						)
						.leftOuterJoin(S0_M3).on(
							bracket(
								S0_T1.trd_cur_cd.eq(S0_M3.cur_cd)
							)
						)
						.innerJoin(S0_M4).on(
							bracket(
								S0_T1.bill_dpt_cd.eq(S0_M4.dpt_cd)
							)
						)
						.leftOuterJoin(S0_M5).on(
							bracket(
								S0_T1.wg_cd.eq(S0_M5.wg_cd)
							)
						)
					)
					.where(
						S0_T1.bill_no.eq(bind("bill_no"))
					)
			);
	}
	
	/**
	 * -- MSBGL0080_MST_RCV_SCHD_APPL_ACT_Query_S01
	 */
	static MCQueryPlan MSBGL0080_MST_RCV_SCHD_APPL_ACT_S01() {
		MST_RCV_SCHD_APPL_ACT_R S0_T1 = MST_RCV_SCHD_APPL_ACT_R.create("T1");
		MAM_STTL_R S0_M1 = MAM_STTL_R.create("M1");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBGL0080_MST_RCV_SCHD_APPL_ACT_Query_S01")
					.mainQuery()
					.select(
						S0_T1.rcv_mtd_cd.as("rcv_cd"),
						S0_M1.sttl_nm.as("rcv_nm"),
						S0_T1.rcv_act_dt,
						S0_T1.rcv_act_amt,
						S0_T1.sub_char1,
						S0_T1.sub_char2,
						S0_T1.sub_char3,
						S0_T1.ins_usr_id,
						S0_T1.ins_usr_nm,
						S0_T1.ins_func_id,
						S0_T1.ins_ts,
						S0_T1.upd_usr_id,
						S0_T1.upd_usr_nm,
						S0_T1.upd_func_id,
						S0_T1.upd_ts,
						S0_T1.upd_srv_req_no
					)
					.from(
						S0_T1
						.leftOuterJoin(S0_M1).on(
							bracket(
								S0_T1.rcv_mtd_cd.eq(S0_M1.sttl_cd)
							)
						)
					)
					.where(
						S0_T1.bill_mng_no.eq(bind("bill_mng_no"))
						.and(S0_T1.rcv_act_amt.neq(value(0)))
					)
					.orderBy(
						S0_T1.rcv_act_dt.asc(),
						S0_T1.rcv_mtd_cd.asc()
					)
			);
	}
	
	/**
	 * -- MSBGL0080_MST_RCV_SCHD_Query_S01
	 */
	static MCQueryPlan MSBGL0080_MST_RCV_SCHD_S01() {
		MST_RCV_SCHD_R S0_T1 = MST_RCV_SCHD_R.create("T1");
		MAM_STTL_R S0_M1 = MAM_STTL_R.create("M1");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBGL0080_MST_RCV_SCHD_Query_S01")
					.mainQuery()
					.select(
						S0_T1.rcv_schd_dt,
						S0_T1.rcv_mtd_cd.as("rcv_cd"),
						S0_M1.sttl_nm.as("rcv_nm"),
						S0_T1.rcv_typ,
						S0_T1.rcv_schd_amt,
						S0_T1.rcv_schd_no,
						S0_T1.sub_char1,
						S0_T1.sub_char2,
						S0_T1.sub_char3,
						S0_T1.ins_usr_id,
						S0_T1.ins_usr_nm,
						S0_T1.ins_func_id,
						S0_T1.ins_ts,
						S0_T1.upd_usr_id,
						S0_T1.upd_usr_nm,
						S0_T1.upd_func_id,
						S0_T1.upd_ts,
						S0_T1.upd_srv_req_no
					)
					.from(
						S0_T1
						.leftOuterJoin(S0_M1).on(
							bracket(
								S0_T1.rcv_mtd_cd.eq(S0_M1.sttl_cd)
							)
						)
					)
					.where(
						S0_T1.bill_mng_no.eq(bind("bill_mng_no"))
					)
					.orderBy(
						S0_T1.rcv_schd_dt.asc(),
						S0_T1.rcv_mtd_cd.asc()
					)
			);
	}
	
	/**
	 * -- MSBGL0080_MST_RCV_SCHD_Query_U01
	 */
	static MCQueryPlan MSBGL0080_MST_RCV_SCHD_U01() {
		MST_RCV_SCHD_R S0 = MST_RCV_SCHD_R.create();
		MST_RCV_SCHD_R S1 = MST_RCV_SCHD_R.create();
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBGL0080_MST_RCV_SCHD_Query_U01")
					.update(S0)
					.set(S0.rcv_schd_dt).eq(subQuery()
						.select(min(S1.rcv_schd_dt))
						.from(S1)
						.where(
							S1.bill_mng_no.eq(bind("bill_mng_no"))
							.and(S1.rcv_typ.neq(value(MAC_AR_STTL_TYP.WTAX.value())))
						)
					)
					.where(
						value(0).eq(value(0))
						.and(S0.rcv_typ.eq(value(MAC_AR_STTL_TYP.WTAX.value())))
						.and(S0.bill_mng_no.eq(bind("bill_mng_no")))
					)
			);
	}
}