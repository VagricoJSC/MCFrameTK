package mcframe.serverMSBH.MSBHL5060;

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
	 * -- MSBHL5060_MST_AP_APPL_SCHD_SO1
	 */
	static MCQueryPlan MSBHL5060_MST_AP_APPL_SCHD_SO1() {
		MST_AP_APPL_SCHD_R S0_T1 = MST_AP_APPL_SCHD_R.create("T1");
		MST_PAY_SCHD_R S0_T2 = MST_PAY_SCHD_R.create("T2");
		MST_PAY_CHK_R S0_T3 = MST_PAY_CHK_R.create("T3");
		MSW_AP_APPL_SCHD_KEY_R S0_W1 = MSW_AP_APPL_SCHD_KEY_R.create("W1");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBHL5060_MST_AP_APPL_SCHD_SO1")
					.mainQuery()
					.select(
						S0_T1.ap_appl_schd_no,
						nullValue().as("wg_cd"),
						S0_T3.reg_dt.as("ac_dt"),
						nullValue().as("ac_ym"),
						nullValue().as("pay_ap_typ"),
						S0_T3.pay_chk_no,
						S0_T2.ap_dpt_cd,
						S0_T2.pay_dpt_cd,
						S0_T3.bsppl_dpt_cd,
						S0_T3.bsppl_cd,
						nullValue().as("psppl_cd"),
						S0_T2.asppl_cd,
						nullValue().as("base_cur_cd"),
						nullValue().as("base_cur_amt"),
						S0_T3.trd_cur_cd,
						S0_T1.trd_cur_amt,
						nullValue().as("xrate_cd"),
						S0_T2.xrate,
						S0_T3.pay_spot_flg,
						S0_T2.pay_schd_dt,
						S0_T2.ap_sttl_cd.as("sttl_cd"),
						S0_T2.ap_sttl_typ,
						S0_T2.ap_typ,
						S0_T2.bank_ac_cd,
						S0_T2.pay_bank_ac_cd,
						S0_T2.drawer_nm,
						S0_T2.note_no,
						S0_T2.due_dt,
						S0_T2.draw_dt,
						S0_T2.rcv_bill_no,
						nullValue().as("usr_cd"),
						S0_T1.rcpt_iv_no.as("iv_no"),
						S0_T3.wrk_no,
						nullValue().as("trd_rmrks"),
						S0_T2.trd_d_rmrks,
						S0_T3.aprv_flg,
						S0_T3.aprv_no,
						S0_T3.aprv_sts_typ
					)
					.from(
						S0_T1
						.leftOuterJoin(S0_T2).on(
							bracket(
								S0_T1.pay_schd_no.eq(S0_T2.pay_schd_no)
							)
						)
						.leftOuterJoin(S0_T3).on(
							bracket(
								S0_T2.pay_chk_mng_no.eq(S0_T3.pay_chk_mng_no)
							)
						)
						.innerJoin(S0_W1).on(
							bracket(
								S0_W1.ap_appl_schd_no.eq(S0_T1.ap_appl_schd_no)
							)
						)
					)
					.where(
						value(0).eq(value(0))
					)
			);
	}
	
	/**
	 * -- MSBHL5060_MST_PAY_SCHD_IF_SO1
	 */
	static MCQueryPlan MSBHL5060_MST_PAY_SCHD_IF_SO1() {
		MST_PAY_SCHD_IF_R S0_T1 = MST_PAY_SCHD_IF_R.create("T1");
		MSW_AP_APPL_SCHD_KEY_R S0_W1 = MSW_AP_APPL_SCHD_KEY_R.create("W1");
		MST_PAY_SCHD_IF_R S1_V1 = MST_PAY_SCHD_IF_R.create("V1");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBHL5060_MST_PAY_SCHD_IF_SO1")
					.mainQuery()
					.select(
						S0_T1.pay_schd_if_no,
						S0_T1.data_crud_typ,
						S0_T1.ap_appl_schd_no
					)
					.from(
						S0_T1
						.innerJoin(S0_W1).on(
							bracket(
								S0_W1.ap_appl_schd_no.eq(S0_T1.ap_appl_schd_no)
							)
						)
					)
					.where(
						value(0).eq(value(0))
						.and(
							notExists(
								subQuery()
								.select(value(0))
								.from(S1_V1)
								.where(
									S1_V1.ap_appl_schd_no.eq(S0_T1.ap_appl_schd_no)
									.and(S1_V1.pay_schd_if_no.gt(S0_T1.pay_schd_if_no))
								)
							)
						)
					)
			);
	}
}