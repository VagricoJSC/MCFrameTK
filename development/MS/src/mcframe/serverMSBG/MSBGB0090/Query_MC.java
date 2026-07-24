package mcframe.serverMSBG.MSBGB0090;

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
	 * -- MSBGB0090_MST_BILL_D_APPL_BAL_Query_S01
	 */
	static MCQueryPlan MSBGB0090_MST_BILL_D_APPL_BAL_S01() {
		MST_BILL_D_APPL_BAL_R S0_TA1 = MST_BILL_D_APPL_BAL_R.create("TA1");
		MST_BILL_D_R S0_TA2 = MST_BILL_D_R.create("TA2");
		MST_BILL_R S0_TA3 = MST_BILL_R.create("TA3");
		MST_BILL_ACST_R S0_TA4 = MST_BILL_ACST_R.create("TA4");
		MST_AR_APPL_SCHD_R S0_TA5 = MST_AR_APPL_SCHD_R.create("TA5");
		MST_BILL_D_R S0_TA6 = MST_BILL_D_R.create("TA6");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBGB0090_MST_BILL_D_APPL_BAL_Query_S01")
					.mainQuery()
					.select(
						S0_TA1.bill_d_no,
						S0_TA1.parent_bill_d_no,
						S0_TA1.not_appl_bal,
						S0_TA1.appl_amt,
						S0_TA2.ac_ym,
						S0_TA2.bill_mng_no,
						S0_TA2.ar_typ,
						S0_TA2.iv_no,
						S0_TA3.wrk_no,
						S0_TA3.trd_cur_cd,
						S0_TA3.bcst_cd,
						S0_TA3.bill_dpt_cd,
						S0_TA4.acst_cd,
						S0_TA4.ar_dpt_cd,
						S0_TA5.rcv_schd_dt,
						S0_TA5.ar_appl_schd_no,
						S0_TA5.rcv_mtd_cd.as("ar_sttl_cd1"),
						S0_TA6.slip_sts_typ.as("par_slip_sts_typ"),
						S0_TA6.act_d_no.as("par_act_d_no"),
						S0_TA6.act_d_seq.as("par_act_d_seq")
					)
					.from(
						S0_TA1
						.innerJoin(S0_TA2).on(
							bracket(
								S0_TA1.bill_d_no.eq(S0_TA2.bill_d_no)
							)
						)
						.innerJoin(S0_TA3).on(
							bracket(
								S0_TA2.bill_mng_no.eq(S0_TA3.bill_mng_no)
							)
						)
						.innerJoin(S0_TA4).on(
							bracket(
								S0_TA2.bill_acst_no.eq(S0_TA4.bill_acst_no)
							)
						)
						.innerJoin(S0_TA5).on(
							bracket(
								S0_TA4.bill_acst_no.eq(S0_TA5.bill_acst_no)
								.and(S0_TA2.ar_typ.eq(S0_TA5.ar_typ))
								.and(S0_TA2.iv_no.eq(S0_TA5.iv_no))
							)
						)
						.innerJoin(S0_TA6).on(
							bracket(
								S0_TA1.parent_bill_d_no.eq(S0_TA6.bill_d_no)
							)
						)
					)
					.where(
						value(0).eq(value(0))
						.and(S0_TA3.bill_cl_sts_typ.neq(value(MSC_BILL_CL_STS_TYP.NOT_BILL.value())))
						.and(S0_TA1.not_appl_bal.neq(value(0)))
						.and(S0_TA5.ar_appl_schd_no.eq(bind("ar_appl_schd_no")))
					)
					.orderBy(
						S0_TA5.rcv_schd_dt.asc(),
						S0_TA6.ac_dt.asc(),
						S0_TA3.bill_no.asc(),
						S0_TA6.act_no.asc(),
						S0_TA6.act_d_no.asc()
					)
					.forUpdateNoWait()
			);
	}
}