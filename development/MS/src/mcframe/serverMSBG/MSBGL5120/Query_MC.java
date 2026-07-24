package mcframe.serverMSBG.MSBGL5120;

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
	 * -- MSBGL5120_MST_BILL_D_Query_S01
	 */
	static MCQueryPlan MSBGL5120_MST_BILL_D_S01() {
		MST_BILL_D_R S0_SWBILLD = MST_BILL_D_R.create("SWBILLD");
		MCTempView S0_V = createTempView("V");
		MST_BILL_D_R S1_BILLD = MST_BILL_D_R.create("BILLD");
		MST_BILL_ACST_R S1_ACST = MST_BILL_ACST_R.create("ACST");
		MST_BILL_R S1_BILL = MST_BILL_R.create("BILL");
		MST_BILL_D_APPL_BAL_R S1_BAL = MST_BILL_D_APPL_BAL_R.create("BAL");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBGL5120_MST_BILL_D_Query_S01")
					.mainQuery()
					.select(
						S0_SWBILLD.bill_d_no,
						S0_SWBILLD.xrate,
						S0_SWBILLD.ac_ym
					)
					.from(
						S0_SWBILLD
						.innerJoin(
							subQuery()
							.select(S1_BILLD.bill_d_no)
							.from(
								S1_BILLD
								.leftOuterJoin(S1_ACST).on(
									bracket(
										S1_BILLD.bill_acst_no.eq(S1_ACST.bill_acst_no)
									)
								)
								.leftOuterJoin(S1_BILL).on(
									bracket(
										S1_ACST.bill_mng_no.eq(S1_BILL.bill_mng_no)
									)
								)
								.leftOuterJoin(S1_BAL).on(
									bracket(
										S1_BILLD.bill_d_no.eq(S1_BAL.bill_d_no)
									)
								)
							)
							.where(
								value(0).eq(value(0))
								.and(S1_BILL.trd_cur_cd.eq(bind("trd_cur_cd")))
								.and(S1_ACST.acst_cd.eq(bind("acst_cd")))
								.and(S1_ACST.ar_dpt_cd.eq(bind("ar_dpt_cd")))
								.and(S1_BILLD.iv_no.eq(bind("iv_no")))
								.and(S1_ACST.ar_typ.eq(bind("ar_typ")))
								.and(
									S1_BILL.wrk_no.eq(bind("wrk_no"))
									.or(S1_BILL.wrk_no.isNull())
									.and(bind("wrk_no").isNull())
								)
								.and(S1_BILLD.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.ARSW_IN_BILL_BAL.value())))
								.and(S1_BAL.bill_d_no.neq(S1_BAL.parent_bill_d_no))
								.and(
									bind("include_compl_flg").eq(value(true))
									.or(value(0).lt(S1_BAL.not_appl_bal))
								)
								.and(S1_BILLD.valid_flg.eq(value(true)))
							)
							.groupBy(S1_BILLD.bill_d_no).view(S0_V)
						).on(S0_V.pr(S1_BILLD.bill_d_no).eq(S0_SWBILLD.bill_d_no))
					)
			);
	}
	
	/**
	 * -- MSBGL5120_MST_BILL_D_Query_S02
	 */
	static MCQueryPlan MSBGL5120_MST_BILL_D_S02() {
		MST_BILL_D_R S0_BILLD = MST_BILL_D_R.create("BILLD");
		MST_BILL_R S0_BILL = MST_BILL_R.create("BILL");
		MST_BILL_ACST_R S0_ACST = MST_BILL_ACST_R.create("ACST");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBGL5120_MST_BILL_D_Query_S02")
					.mainQuery()
					.select(S0_BILLD.xrate)
					.from(
						S0_BILLD
						.innerJoin(S0_BILL).on(
							bracket(
								S0_BILLD.bill_mng_no.eq(S0_BILL.bill_mng_no)
							)
						)
						.innerJoin(S0_ACST).on(
							bracket(
								S0_BILLD.bill_acst_no.eq(S0_ACST.bill_acst_no)
							)
						)
					)
					.where(
						value(0).eq(value(0))
						.and(S0_BILL.trd_cur_cd.eq(bind("trd_cur_cd")))
						.and(S0_ACST.acst_cd.eq(bind("acst_cd")))
						.and(S0_ACST.ar_dpt_cd.eq(bind("ar_dpt_cd")))
						.and(S0_ACST.ar_typ.eq(bind("ar_typ")))
						.and(S0_BILLD.iv_no.eq(bind("iv_no")))
						.and(
							S0_BILL.wrk_no.eq(bind("wrk_no"))
							.or(S0_BILL.wrk_no.isNull())
							.and(bind("wrk_no").isNull())
						)
						.and(S0_BILLD.slip_sts_typ.eq(value(MAC_SLIP_STS_TYP.CRT.value())))
						.and(S0_BILLD.bill_d_typ.eq(value(MSC_BILL_D_TYP.SLS.value())))
						.and(S0_BILLD.valid_flg.eq(value(true)))
						.cutoff$and(S0_BILLD.ac_ym.lte(bind("ac_ym")))
					)
					.groupBy(S0_BILLD.xrate)
			);
	}
	
	/**
	 * -- MSBGL5120_MST_BILL_D_Query_S03
	 */
	static MCQueryPlan MSBGL5120_MST_BILL_D_S03() {
		MCTempView S0_V = createTempView("V");
		MST_BILL_D_R S0_MAXBILLD = MST_BILL_D_R.create("MAXBILLD");
		MST_BILL_D_R S1_BILLD = MST_BILL_D_R.create("BILLD");
		MST_BILL_R S1_BILL = MST_BILL_R.create("BILL");
		MST_BILL_ACST_R S1_ACST = MST_BILL_ACST_R.create("ACST");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBGL5120_MST_BILL_D_Query_S03")
					.mainQuery()
					.select(S0_MAXBILLD.xrate)
					.from(
						subQuery()
						.select(max(S1_BILLD.bill_d_no).as("bill_d_no"))
						.from(
							S1_BILLD
							.innerJoin(S1_BILL).on(
								bracket(
									S1_BILLD.bill_mng_no.eq(S1_BILL.bill_mng_no)
								)
							)
							.innerJoin(S1_ACST).on(
								bracket(
									S1_BILLD.bill_acst_no.eq(S1_ACST.bill_acst_no)
								)
							)
						)
						.where(
							value(0).eq(value(0))
							.and(S1_BILL.trd_cur_cd.eq(bind("trd_cur_cd")))
							.and(S1_ACST.acst_cd.eq(bind("acst_cd")))
							.and(S1_ACST.ar_dpt_cd.eq(bind("ar_dpt_cd")))
							.and(S1_ACST.ar_typ.eq(bind("ar_typ")))
							.and(S1_BILLD.iv_no.eq(bind("iv_no")))
							.and(
								S1_BILL.wrk_no.eq(bind("wrk_no"))
								.or(S1_BILL.wrk_no.isNull())
								.and(bind("wrk_no").isNull())
							)
							.and(S1_BILLD.bill_d_typ.eq(value(MSC_BILL_D_TYP.SLS.value())))
							.and(S1_BILLD.valid_flg.eq(value(true)))
							.cutoff$and(S1_BILLD.ac_ym.lte(bind("ac_ym")))
						).view(S0_V)
						.innerJoin(S0_MAXBILLD).on(
							bracket(
								S0_V.pr("bill_d_no").eq(S0_MAXBILLD.bill_d_no)
							)
						)
					)
			);
	}
}