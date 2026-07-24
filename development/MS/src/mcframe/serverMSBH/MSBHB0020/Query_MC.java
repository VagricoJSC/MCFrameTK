package mcframe.serverMSBH.MSBHB0020;

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
	 * -- MSBHB0020_MST_PAY_CHK_Query_S01
	 */
	static MCQueryPlan MSBHB0020_MST_PAY_CHK_S01() {
		MST_PAY_CHK_R S0_T1 = MST_PAY_CHK_R.create("T1");
		MST_PAY_SCHD_R S0_T2 = MST_PAY_SCHD_R.create("T2");
		MST_AP_APPL_SCHD_R S0_T3 = MST_AP_APPL_SCHD_R.create("T3");
		MAM_BP_R S0_M1 = MAM_BP_R.create("M1");
		MAM_CUR_R S0_M2 = MAM_CUR_R.create("M2");
		MAW_BP_KEY_R S0_W = MAW_BP_KEY_R.create("W");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBHB0020_MST_PAY_CHK_Query_S01")
					.mainQuery()
					.select(
						S0_T2.pay_schd_dt.as("pay_act_dt"),
						S0_T1.pay_chk_mng_no,
						S0_T1.bsppl_cd,
						S0_T1.bsppl_dpt_cd,
						S0_T1.wrk_no,
						S0_T1.trd_cur_cd,
						S0_T2.pay_schd_no,
						S0_T2.asppl_cd,
						S0_T2.ap_dpt_cd,
						S0_T2.pay_dpt_cd,
						S0_T2.ap_typ,
						S0_T2.ap_sttl_cd,
						S0_T2.ap_sttl_cd.as("ap_sttl_cd_grp"),
						S0_T2.ap_sttl_typ,
						S0_T2.pay_bank_ac_cd,
						S0_T2.bank_ac_cd,
						S0_T2.ap_setoff_typ,
						S0_T2.setoff_cd,
						S0_T2.setoff_nm,
						S0_T2.so_dpt_cd,
						S0_T2.trd_cur_com_paid_tax_cd,
						S0_T2.note_no,
						S0_T2.note_typ,
						S0_T2.note_rsn_cd,
						S0_T2.draw_dt,
						S0_T2.due_dt,
						S0_T2.note_days,
						S0_T2.drawer_nm,
						S0_T2.draw_bank_cd,
						S0_T2.draw_branch_cd,
						S0_T2.endrsr,
						S0_T2.accptr,
						S0_T2.trd_d_rmrks,
						S0_T3.ap_appl_schd_no,
						S0_T3.purc_act_no,
						S0_T3.rcpt_iv_mng_no,
						S0_T3.rcpt_iv_no,
						S0_T3.trd_cur_amt.subtract(S0_T3.trd_cur_appl_amt).as("trd_cur_amt"),
						S0_T3.trd_cur_exc_com_paid,
						S0_M1.psppl_cd,
						S0_M2.amt_dec_place.as("trd_cur_amt_dec_place"),
						S0_T1.pay_chk_no,
						S0_T2.pay_schd_dt,
						S0_T1.reg_dt,
						S0_T1.bsppl_cl_dt
					)
					.from(
						S0_T1
						.innerJoin(S0_T2).on(S0_T1.pay_chk_mng_no.eq(S0_T2.pay_chk_mng_no))
						.innerJoin(S0_T3).on(S0_T3.pay_schd_no.eq(S0_T2.pay_schd_no))
						.innerJoin(S0_M1).on(S0_T1.bsppl_cd.eq(S0_M1.bp_cd))
						.innerJoin(S0_M2).on(S0_T1.trd_cur_cd.eq(S0_M2.cur_cd))
						.innerJoin(S0_W).on(
							bracket(
								S0_M1.psppl_cd.eq(S0_W.bp_cd)
							)
						)
					)
					.where(
						value(0).eq(value(0))
						.and(
							S0_T3.pay_sts_typ.in(
								value(MSC_PAY_STS_TYP.NOT_PAY.value()),
								value(MSC_PAY_STS_TYP.PART_PAY.value())
							)
						)
						.and(
							S0_T1.aprv_flg.eq(value(false))
							.or(
								S0_T1.aprv_flg.eq(value(true))
								.and(S0_T1.aprv_sts_typ.eq(value(MAC_APRV_STS_TYP.ACPT.value())))
							)
						)
						.and(S0_T2.pay_schd_dt.lte(bind("today")))
					)
					.orderBy(S0_M1.psppl_cd.asc())
					.forUpdate(S0_T1.pay_chk_mng_no)
			);
	}
}