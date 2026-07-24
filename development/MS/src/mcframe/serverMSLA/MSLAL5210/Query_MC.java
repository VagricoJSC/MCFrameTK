package mcframe.serverMSLA.MSLAL5210;

import static mcframe.serverCore.queryapi.IFMCSQL.*;
import static mcframe.serverCore.queryapi.MCQueryExecution.*;

import mcframe.commonMA.constant.*;
import mcframe.commonMS.constant.MSC_BILL_CL_STS_TYP;
import mcframe.commonMS.constant.MSC_BILL_D_TYP;
import mcframe.serverMA.dbc.*;
import mcframe.serverMS.dbc.*;
import static mcframe.serverCore.dbc.CoreFunction.*;


public class Query_MC {
	
	/**
	 * -- MSLAL5210_MST_BILL_Query_S01
	 */
	static MCQueryPlan MSLAL5210_MST_BILL_S01() {
		MST_BILL_R S0_MST_BILL = MST_BILL_R.create("T1");
		MST_BILL_D_R S0_MST_BILL_D = MST_BILL_D_R.create("T2");
		MST_BILL_D_R S1_MST_BILL_D = MST_BILL_D_R.create("T3");
		MST_BILL_D_R S2_MST_BILL_D = MST_BILL_D_R.create("T7");
		MST_BILL_D_R S3_MST_BILL_D = MST_BILL_D_R.create("T8");
		MST_WRK_R S0_MST_WRK = MST_WRK_R.create("T4");
		MST_RCV_ACT_R S0_MST_RCV_ACT = MST_RCV_ACT_R.create("T5");
		MST_RCV_ACT_D_R S0_MST_RCV_D_ACT = MST_RCV_ACT_D_R.create("T6");
		MSW_BILL_KEY_R S0_MSW_BILL_KEY = MSW_BILL_KEY_R.create("W");

		MAM_BANK_AC_R M_BANK_AC = MAM_BANK_AC_R.create("M1");
		MAM_BANK_BRANCH_R M_BANK_BRANCH = MAM_BANK_BRANCH_R.create("M2");
		MAM_BANK_R M_BANK = MAM_BANK_R.create("M3");
		MAM_BP_R M_BP = MAM_BP_R.create("M4");
		MAM_BP_SUB_R M_BP_SUB = MAM_BP_SUB_R.create("M5");
		MAM_CO_R M_CO = MAM_CO_R.create("M6");
		MAM_CUR_R M_CUR = MAM_CUR_R.create("M7");
		MAM_DPT_R M_DPT = MAM_DPT_R.create("M8");
		MAM_EDI_IF_CTL_R M_EDI_IF_CTL = MAM_EDI_IF_CTL_R.create("M9");
		MAM_ITM_R M_ITM = MAM_ITM_R.create("M10");
		MAM_TAX_R M_TAX = MAM_TAX_R.create("M11");
		MAM_TRD_R M_TRD = MAM_TRD_R.create("M12");
		MAM_UNIT_R M_UNIT = MAM_UNIT_R.create("M13");
		MAM_STTL_R M_STTL1 = MAM_STTL_R.create("M14");
		MAM_STTL_R M_STTL2 = MAM_STTL_R.create("M15");
		MAM_TAX_R M_TAX1 = MAM_TAX_R.create("M16");
		MAM_TAX_R M_TAX2 = MAM_TAX_R.create("M17");
		MAM_EXT_SYS_R M_EXT_SYS = MAM_EXT_SYS_R.create("M18");
		
		return createQueryPlan()
			.setQuery(
				sql("MSLAL5210_MST_BILL_Query_S01")
					.mainQuery()
					.select(
						M_EDI_IF_CTL.ext_sys_cd,
						S0_MST_BILL.bill_mng_no,
						S0_MST_BILL.bill_cl_dt,
						S0_MST_BILL.bill_dt,
						S0_MST_BILL.bill_no,
						S0_MST_BILL_D.bill_d_no,
						S0_MST_BILL.pre_bill_no,
						S0_MST_BILL.pre_bill_dt,
						S0_MST_BILL.iv_no,
						S0_MST_BILL.wrk_no,
						S0_MST_WRK.wrk_nm,
						FCPA_CO$F_GET_CO_NM1(FCPA_CONTEXT$F_GET_DEF_LOCALE_CD()).as("co_nm"),
						M_CO.ein,
						M_CO.biz_co_no,
						M_CO.zip_cd,
						M_CO.addr1,
						M_CO.addr2,
						M_CO.addr3,
						M_CO.addr4,
						S0_MST_BILL.bill_dpt_cd,
						M_DPT.dpt_nm.as("bill_dpt"),
						M_CO.tel,
						M_CO.cntry_cd,
						S0_MST_BILL.bcst_cd,
						M_BP.bp_nm.as("bcst_nm"),
						decode(
							M_BP_SUB.bp_cd,
							nullValue(),
							M_BP.bill_bcst_nm,
							M_BP_SUB.bill_bcst_nm
						).as("bill_bcst_nm"),
						M_BP.ein.as("bcst_ein"),
						M_BP.biz_co_no.as("bcst_biz_co_no"),
						decode(
							M_BP_SUB.bp_cd,
							nullValue(),
							M_BP.bill_zip_cd,
							M_BP_SUB.bill_zip_cd
						).as("bcst_zip_cd"),
						decode(
							M_BP_SUB.bp_cd,
							nullValue(),
							M_BP.bill_addr1,
							M_BP_SUB.bill_addr1
						).as("bcst_addr1"),
						decode(
							M_BP_SUB.bp_cd,
							nullValue(),
							M_BP.addr2,
							M_BP_SUB.addr2
						).as("bcst_addr2"),
						decode(
							M_BP_SUB.bp_cd,
							nullValue(),
							M_BP.addr3,
							M_BP_SUB.addr3
						).as("bcst_addr3"),
						decode(
							M_BP_SUB.bp_cd,
							nullValue(),
							M_BP.addr4,
							M_BP_SUB.addr4
						).as("bcst_addr4"),
						decode(
							M_BP_SUB.bp_cd,
							nullValue(),
							M_BP.bill_bcst_dpt,
							M_BP_SUB.bill_bcst_dpt
						).as("bill_bcst_dpt"),
						decode(
							M_BP_SUB.bp_cd,
							nullValue(),
							M_BP.bill_tel,
							M_BP_SUB.bill_bcst_dpt
						).as("bill_tel"),
						M_BP.cntry_cd.as("bcst_cntry_cd"),
						S0_MST_BILL.trd_cur_cd,
						S0_MST_BILL.bill_xrate,
						S0_MST_BILL.last_bill_amt,
						S0_MST_BILL.xfr_amt.add(S0_MST_BILL.note_amt).add(S0_MST_BILL.cash_amt).as("rcv_amt"),
						S0_MST_BILL.sw_amt,
						S0_MST_BILL.setoff_amt.multiply(value(-1)).as("setoff_amt"),
						S0_MST_BILL.bfw_amt,
						S0_MST_BILL.sls_amt,
						S0_MST_BILL.dscnt_amt,
						S0_MST_BILL.ret_amt,
						S0_MST_BILL.tax_amt,
						S0_MST_BILL.sw_to_amt,
						S0_MST_BILL.bill_amt,
						S0_MST_BILL.adv_amt_bal,
						S0_MST_BILL.adv_amt,
						S0_MST_BILL.adv_setoff_amt,
						S0_MST_BILL.adv_setoff_tax_amt,
						M_DPT.rcv_bank_ac_cd.as("bank_ac_cd"),
						M_BANK_AC.bank_ac_typ,
						M_BANK_AC.bank_ac_no,
						M_BANK_AC.bank_ac_holder,
						M_BANK_AC.bank_ac_holder_sub,
						M_BANK_AC.bank_cd,
						M_BANK.bank_nm,
						M_BANK_AC.branch_cd,
						M_BANK_BRANCH.branch_nm,
						S0_MST_BILL_D.trd_cd,
						M_TRD.trd_nm,
						M_TRD.trd_ptn_typ,
						S0_MST_BILL_D.slip_sts_typ,
						S0_MST_BILL_D.dlv_slip_no,
						S0_MST_BILL_D.dlv_slip_d_no,
						S0_MST_BILL_D.ship_dlv_slip_no,
						S0_MST_BILL_D.ship_dlv_slip_d_no,
						S0_MST_BILL_D.act_no,
						S0_MST_BILL_D.act_rev,
						S0_MST_BILL_D.act_d_no,
						S0_MST_BILL_D.cst_po_no,
						S0_MST_BILL_D.cst_po_d_no,
						S0_MST_BILL_D.ac_dt,
						S0_MST_BILL_D.dlv_dt,
						S0_MST_BILL_D.rcv_dt,
						S0_MST_BILL_D.bill_basis_dt,
						S0_MST_BILL_D.base_sls_ac_dt.as("base_ac_dt"),
						S0_MST_BILL_D.itm_cd,
						S0_MST_BILL_D.itm_sub1,
						S0_MST_BILL_D.itm_sub2,
						S0_MST_BILL_D.itm_sub3,
						decode(
								M_ITM.sundry_itm_flg,
								value(true),
								S0_MST_BILL_D.itm_nm,
								M_ITM.itm_nm
							).as("itm_nm"),
						M_ITM.itm_alt_nm1,
						M_ITM.itm_alt_nm2,
						M_ITM.itm_alt_nm3,
						M_ITM.itm_alt_nm4,
						M_ITM.dscnt_itm_flg,
						S0_MST_BILL_D.sno1,
						S0_MST_BILL_D.sno2,
						S0_MST_BILL_D.sno3,
						S0_MST_BILL_D.sno4,
						S0_MST_BILL_D.trd_unit_cd,
						M_UNIT.unit_nm.as("trd_unit_nm"),
						nvl(S0_MST_BILL_D.trd_unit_qty, value(0)).as("trd_unit_qty"),
						S0_MST_BILL_D.interim_flg,
						nvl(S0_MST_BILL_D.trd_cur_upri, value(0)).as("trd_cur_upri"),
						nvl(S0_MST_BILL_D.trd_cur_amt, value(0)).as("trd_cur_amt"),
						S0_MST_BILL_D.trd_cur_dscnt_amt,
						S0_MST_BILL_D.tax_cd,
						M_TAX.tax_nm,
						M_TAX.tax_rate,
						M_TAX.inc_tax_flg,
						nvl(S0_MST_BILL_D.trd_cur_tax_amt, value(0)).as("trd_cur_tax_amt"),
						S0_MST_BILL_D.trd_d_rmrks,
						M_CUR.amt_dec_place,
						M_BP.bill_cl_typ,
						M_BP.bill_cl_day1,
						M_BP.bill_cl_day2,
						M_BP.bill_cl_day3,
						M_BP.bill_cl_day4,
						M_BP.bill_cl_day5,
						S0_MST_RCV_ACT.rcv_dt.as("ar_rcv_dt"),
						S0_MST_RCV_ACT.rcv_act_no,
						S0_MST_RCV_ACT.ar_sttl_cd1,
						S0_MST_RCV_ACT.ar_sttl_cd2,
						S0_MST_RCV_ACT.ar_sttl_typ1,
						S0_MST_RCV_ACT.ar_sttl_typ2,
						nvl(S0_MST_RCV_D_ACT.trd_cur_amt1, value(0)).as("trd_cur_amt1"),
						nvl(S0_MST_RCV_D_ACT.trd_cur_amt2, value(0)).as("trd_cur_amt2"),
						nvl(S0_MST_RCV_D_ACT.trd_cur_tax_amt1, value(0)).as("trd_cur_tax_amt1"),
						nvl(S0_MST_RCV_D_ACT.trd_cur_tax_amt2, value(0)).as("trd_cur_tax_amt2"),
						nvl(S0_MST_RCV_D_ACT.base_cur_tax_amt1, value(0)).as("base_cur_tax_amt1"),
						nvl(S0_MST_RCV_D_ACT.base_cur_tax_amt2, value(0)).as("base_cur_tax_amt2"),
						M_STTL1.sttl_nm.as("ar_sttl_nm1"),
						M_STTL2.sttl_nm.as("ar_sttl_nm2"),
						M_STTL1.bill_tax_disp_flg.as("bill_tax_disp_flg1"),
						M_STTL2.bill_tax_disp_flg.as("bill_tax_disp_flg2"),
						M_TAX1.tax_cd.as("ar_tax_cd1"),
						M_TAX2.tax_cd.as("ar_tax_cd2"),
						M_TAX1.tax_nm.as("ar_tax_nm1"),
						M_TAX2.tax_nm.as("ar_tax_nm2"),
						M_TAX1.tax_rate.as("ar_tax_rate1"),
						M_TAX2.tax_rate.as("ar_tax_rate2"),
						M_TAX1.inc_tax_flg.as("inc_tax_flg1"),
						M_TAX2.inc_tax_flg.as("inc_tax_flg2"),
						S0_MST_BILL_D.trd_cur_amt.as("tax_sls_amt"),
						S0_MST_BILL_D.trd_cur_tax_amt.as("tax_tax_amt"),
						S0_MST_BILL_D.ar_trd_grp_typ,
						M_BP.bfw_bal_disp_flg,
						S0_MST_BILL.bill_each_sls_flg,
						nvl(S0_MST_BILL_D.base_cur_tax_amt, value(0)).as("base_cur_tax_amt"),
						M_EXT_SYS.null_val_if_flg,
						S0_MST_BILL.bill_rev,
						S0_MST_BILL.wg_cd
					)
					.from(
						S0_MSW_BILL_KEY
						.innerJoin(S0_MST_BILL).on(S0_MSW_BILL_KEY.bill_mng_no.eq(S0_MST_BILL.bill_mng_no))
						.leftOuterJoin(S0_MST_WRK).on(S0_MST_WRK.wrk_no.eq(S0_MST_BILL.wrk_no))
						.leftOuterJoin(M_BP).on(M_BP.bp_cd.eq(S0_MST_BILL.bcst_cd))
						.leftOuterJoin(M_BP_SUB).on(
							bracket(
								M_BP_SUB.bp_cd.eq(S0_MST_BILL.bcst_cd)
								.and(M_BP_SUB.st_dt.lte(S0_MST_BILL.bill_cl_dt))
								.and(M_BP_SUB.end_dt.gte(S0_MST_BILL.bill_cl_dt))
							)
						)
						.leftOuterJoin(M_DPT).on(
							bracket(
								M_DPT.dpt_cd.eq(S0_MST_BILL.bill_dpt_cd)
								.and(S0_MST_BILL.base_dt.between(M_DPT.st_dt, M_DPT.end_dt))
							)
						)
						.innerJoin(S0_MST_BILL_D).on(
							S0_MST_BILL_D.bill_mng_no.eq(S0_MST_BILL.bill_mng_no)
							.and(S0_MST_BILL_D.valid_flg.eq(value(true)))
						)
						.leftOuterJoin(S0_MST_RCV_ACT).on(
							bracket(
									S0_MST_RCV_ACT.rcv_act_no.eq(S0_MST_BILL_D.act_no)
								.and(S0_MST_RCV_ACT.rcv_act_seq.eq(S0_MST_BILL_D.act_seq))
								.and(S0_MST_BILL_D.bill_d_typ.eq(value(MSC_BILL_D_TYP.RCV.value())))
							)
						)
						.leftOuterJoin(S0_MST_RCV_D_ACT).on(
							bracket(
									S0_MST_RCV_D_ACT.rcv_act_d_no.eq(S0_MST_BILL_D.act_d_no)
								.and(S0_MST_RCV_D_ACT.rcv_act_d_seq.eq(S0_MST_BILL_D.act_d_seq))
								.and(S0_MST_BILL_D.bill_d_typ.eq(value(MSC_BILL_D_TYP.RCV.value())))
								)
							)
						.leftOuterJoin(M_STTL1).on(S0_MST_RCV_ACT.ar_sttl_cd1.eq(M_STTL1.sttl_cd))
						.leftOuterJoin(M_STTL2).on(S0_MST_RCV_ACT.ar_sttl_cd2.eq(M_STTL2.sttl_cd))
						.leftOuterJoin(M_TAX1).on(S0_MST_RCV_ACT.tax_cd1.eq(M_TAX1.tax_cd))
						.leftOuterJoin(M_TAX2).on(S0_MST_RCV_ACT.tax_cd2.eq(M_TAX2.tax_cd))
						.leftOuterJoin(M_BANK_AC).on(M_BANK_AC.bank_ac_cd.eq(M_DPT.rcv_bank_ac_cd))
						.leftOuterJoin(M_BANK).on(M_BANK.bank_cd.eq(M_BANK_AC.bank_cd))
						.leftOuterJoin(M_BANK_BRANCH).on(
							bracket(
								M_BANK_BRANCH.bank_cd.eq(M_BANK_AC.bank_cd)
								.and(M_BANK_BRANCH.branch_cd.eq(M_BANK_AC.branch_cd))
							)
						)
						.innerJoin(M_CO).on(M_CO.co_cd.eq(FCPA_CONTEXT$F_GET_CO_CD()))
						.innerJoin(M_TRD).on(M_TRD.trd_cd.eq(S0_MST_BILL_D.trd_cd))
						.leftOuterJoin(M_ITM).on(
							bracket(
								M_ITM.itm_cd.eq(S0_MST_BILL_D.itm_cd)
								.and(M_ITM.itm_sub1.eq(S0_MST_BILL_D.itm_sub1))
								.and(M_ITM.itm_sub2.eq(S0_MST_BILL_D.itm_sub2))
								.and(M_ITM.itm_sub3.eq(S0_MST_BILL_D.itm_sub3))
							)
						)
						.leftOuterJoin(M_UNIT).on(M_UNIT.unit_cd.eq(S0_MST_BILL_D.trd_unit_cd))
						.leftOuterJoin(M_TAX).on(S0_MST_BILL_D.tax_cd.eq(M_TAX.tax_cd))
						.innerJoin(M_EDI_IF_CTL).on(
							bracket(
								M_BP.bp_cd.eq(M_EDI_IF_CTL.bp_cd)
								.and(M_EDI_IF_CTL.if_proc_typ.eq(value(MAC_IF_PROC_TYP.BILL_SEND.value())))
								.and(bind("today").between(M_EDI_IF_CTL.st_dt, M_EDI_IF_CTL.end_dt))
							)
						)
						.innerJoin(M_CUR).on(S0_MST_BILL.trd_cur_cd.eq(M_CUR.cur_cd))
						.innerJoin(M_EXT_SYS).on(M_EXT_SYS.ext_sys_cd.eq(M_EDI_IF_CTL.ext_sys_cd))
					)
					.where(
						value(0).eq(value(0))
						.and(
							bracket(
								M_BP.bfw_bal_disp_flg.eq(value(true))
							)
							.or(
								bracket(
									M_BP.bfw_bal_disp_flg.eq(value(false))
									.and(
										value(0).neq(
											subQuery()
											.select(count(S0_MST_BILL_D.bill_mng_no))
											.from(S0_MST_BILL_D)
											.where(
												S0_MST_BILL_D.bill_mng_no.eq(S0_MST_BILL.bill_mng_no)
												.and(S0_MST_BILL_D.bill_d_typ.eq(value(MSC_BILL_D_TYP.SLS.value()))
													.or(
														S0_MST_BILL_D.trd_ptn_typ.in(
															value(MAC_TRD_PTN_TYP.ARSW_OUT_BILL_BAL.value()), 
															value(MAC_TRD_PTN_TYP.ARSW_IN_BILL_BAL.value()), 
															value(MAC_TRD_PTN_TYP.TAX_DIFF_BILL_CL.value())
														)
													)
												)
											)
										)
									)
								)
							)
						)
					)
					.orderBy(S0_MST_BILL.bill_mng_no.asc())
			);
	}
	
	/**
	 * -- MSLAL5210_MST_BILL_Query_S02
	 */
	static MCQueryPlan MSLAL5210_MST_BILL_S02() {
		MST_BILL_R S0_MST_BILL = MST_BILL_R.create("T1");
		MST_WRK_R S0_MST_WRK = MST_WRK_R.create("T2");
		MST_BILL_D_R S0_MST_BILL_D = MST_BILL_D_R.create("T3");
		MSW_BILL_KEY_R S0_MSW_BILL_KEY = MSW_BILL_KEY_R.create("W");

		MAM_BANK_AC_R M_BANK_AC = MAM_BANK_AC_R.create("M1");
		MAM_BANK_BRANCH_R M_BANK_BRANCH = MAM_BANK_BRANCH_R.create("M2");
		MAM_BANK_R M_BANK = MAM_BANK_R.create("M3");
		MAM_BP_R M_BP = MAM_BP_R.create("M4");
		MAM_BP_SUB_R M_BP_SUB = MAM_BP_SUB_R.create("M5");
		MAM_CO_R M_CO = MAM_CO_R.create("M6");
		MAM_CUR_R M_CUR = MAM_CUR_R.create("M7");
		MAM_DPT_R M_DPT = MAM_DPT_R.create("M8");
		MAM_EDI_IF_CTL_R M_EDI_IF_CTL = MAM_EDI_IF_CTL_R.create("M9");
		MAM_EXT_SYS_R M_EXT_SYS = MAM_EXT_SYS_R.create("M10");
		
		return createQueryPlan()
			.setQuery(
				sql("MSLAL5210_MST_BILL_Query_S02")
					.mainQuery()
					.select(
						M_EDI_IF_CTL.ext_sys_cd,
						S0_MST_BILL.bill_mng_no,
						S0_MST_BILL.bill_cl_dt,
						S0_MST_BILL.bill_dt,
						S0_MST_BILL.bill_no,
						value("*").as("bill_d_no"),
						S0_MST_BILL.pre_bill_no,
						S0_MST_BILL.pre_bill_dt,
						S0_MST_BILL.iv_no,
						S0_MST_BILL.wrk_no,
						S0_MST_WRK.wrk_nm,
						FCPA_CO$F_GET_CO_NM1(FCPA_CONTEXT$F_GET_DEF_LOCALE_CD()).as("co_nm"),
						M_CO.ein,
						M_CO.biz_co_no,
						M_CO.zip_cd,
						M_CO.addr1,
						M_CO.addr2,
						M_CO.addr3,
						M_CO.addr4,
						S0_MST_BILL.bill_dpt_cd,
						M_DPT.dpt_nm.as("bill_dpt"),
						M_CO.tel,
						M_CO.cntry_cd,
						S0_MST_BILL.bcst_cd,
						M_BP.bp_nm.as("bcst_nm"),
						decode(
							M_BP_SUB.bp_cd,
							nullValue(),
							M_BP.bill_bcst_nm,
							M_BP_SUB.bill_bcst_nm
						).as("bill_bcst_nm"),
						M_BP.ein.as("bcst_ein"),
						M_BP.biz_co_no.as("bcst_biz_co_no"),
						decode(
							M_BP_SUB.bp_cd,
							nullValue(),
							M_BP.bill_zip_cd,
							M_BP_SUB.bill_zip_cd
						).as("bcst_zip_cd"),
						decode(
							M_BP_SUB.bp_cd,
							nullValue(),
							M_BP.bill_addr1,
							M_BP_SUB.bill_addr1
						).as("bcst_addr1"),
						decode(
							M_BP_SUB.bp_cd,
							nullValue(),
							M_BP.addr2,
							M_BP_SUB.addr2
						).as("bcst_addr2"),
						decode(
							M_BP_SUB.bp_cd,
							nullValue(),
							M_BP.addr3,
							M_BP_SUB.addr3
						).as("bcst_addr3"),
						decode(
							M_BP_SUB.bp_cd,
							nullValue(),
							M_BP.addr4,
							M_BP_SUB.addr4
						).as("bcst_addr4"),
						decode(
							M_BP_SUB.bp_cd,
							nullValue(),
							M_BP.bill_bcst_dpt,
							M_BP_SUB.bill_bcst_dpt
						).as("bill_bcst_dpt"),
						decode(
							M_BP_SUB.bp_cd,
							nullValue(),
							M_BP.bill_tel,
							M_BP_SUB.bill_bcst_dpt
						).as("bill_tel"),
						M_BP.cntry_cd.as("bcst_cntry_cd"),
						S0_MST_BILL.trd_cur_cd,
						S0_MST_BILL.bill_xrate,
						S0_MST_BILL.last_bill_amt,
						S0_MST_BILL.xfr_amt.add(S0_MST_BILL.note_amt).add(S0_MST_BILL.cash_amt).as("rcv_amt"),
						S0_MST_BILL.sw_amt,
						S0_MST_BILL.setoff_amt.multiply(value(-1)).as("setoff_amt"),
						S0_MST_BILL.bfw_amt,
						S0_MST_BILL.sls_amt,
						S0_MST_BILL.dscnt_amt,
						S0_MST_BILL.ret_amt,
						S0_MST_BILL.tax_amt,
						S0_MST_BILL.sw_to_amt,
						S0_MST_BILL.bill_amt,
						S0_MST_BILL.adv_amt_bal,
						S0_MST_BILL.adv_amt,
						S0_MST_BILL.adv_setoff_amt,
						S0_MST_BILL.adv_setoff_tax_amt,
						M_DPT.rcv_bank_ac_cd.as("bank_ac_cd"),
						M_BANK_AC.bank_ac_typ,
						M_BANK_AC.bank_ac_no,
						M_BANK_AC.bank_ac_holder,
						M_BANK_AC.bank_ac_holder_sub,
						M_BANK_AC.bank_cd,
						M_BANK.bank_nm,
						M_BANK_AC.branch_cd,
						M_BANK_BRANCH.branch_nm,
						nullValue().as("trd_cd"),
						nullValue().as("trd_nm"),
						nullValue().as("trd_ptn_typ"),
						nullValue().as("slip_sts_typ"),
						nullValue().as("dlv_slip_no"),
						nullValue().as("dlv_slip_d_no"),
						nullValue().as("ship_dlv_slip_no"),
						nullValue().as("ship_dlv_slip_d_no"),
						nullValue().as("act_no"),
						nullValue().as("act_rev"),
						nullValue().as("act_d_no"),
						nullValue().as("cst_po_no"),
						nullValue().as("cst_po_d_no"),
						nullValue().as("ac_dt"),
						nullValue().as("dlv_dt"),
						nullValue().as("rcv_dt"),
						nullValue().as("bill_basis_dt"),
						nullValue().as("base_ac_dt"),
						nullValue().as("itm_cd"),
						nullValue().as("itm_sub1"),
						nullValue().as("itm_sub2"),
						nullValue().as("itm_sub3"),
						nullValue().as("itm_nm"),
						nullValue().as("itm_alt_nm1"),
						nullValue().as("itm_alt_nm2"),
						nullValue().as("itm_alt_nm3"),
						nullValue().as("itm_alt_nm4"),
						value(false).as("dscnt_itm_flg"),
						value("*").as("sno1"),
						value("*").as("sno2"),
						value("*").as("sno3"),
						value("*").as("sno4"),
						nullValue().as("trd_unit_cd"),
						nullValue().as("trd_unit_nm"),
						value(0).as("trd_unit_qty"),
						value(false).as("interim_flg"),
						value(0).as("trd_cur_upri"),
						value(0).as("trd_cur_amt"),
						value(0).as("trd_cur_dscnt_amt"),
						nullValue().as("tax_cd"),
						nullValue().as("tax_nm"),
						nullValue().as("tax_rate"),
						nullValue().as("inc_tax_flg"),
						value(0).as("trd_cur_tax_amt"),
						nullValue().as("trd_d_rmrks"),
						M_CUR.amt_dec_place,
						M_BP.bill_cl_typ,
						M_BP.bill_cl_day1,
						M_BP.bill_cl_day2,
						M_BP.bill_cl_day3,
						M_BP.bill_cl_day4,
						M_BP.bill_cl_day5,
						nullValue().as("ar_rcv_dt"),
						nullValue().as("rcv_act_no"),
						nullValue().as("ar_sttl_cd1"),
						nullValue().as("ar_sttl_cd2"),
						nullValue().as("ar_sttl_typ1"),
						nullValue().as("ar_sttl_typ2"),
						value(0).as("trd_cur_amt1"),
						value(0).as("trd_cur_amt2"),
						value(0).as("trd_cur_tax_amt1"),
						value(0).as("trd_cur_tax_amt2"),
						value(0).as("base_cur_tax_amt1"),
						value(0).as("base_cur_tax_amt2"),
						nullValue().as("ar_sttl_nm1"),
						nullValue().as("ar_sttl_nm2"),
						nullValue().as("bill_tax_disp_flg1"),
						nullValue().as("bill_tax_disp_flg2"),
						nullValue().as("ar_tax_cd1"),
						nullValue().as("ar_tax_cd2"),
						nullValue().as("ar_tax_nm1"),
						nullValue().as("ar_tax_nm2"),
						nullValue().as("ar_tax_rate1"),
						nullValue().as("ar_tax_rate2"),
						nullValue().as("inc_tax_flg1"),
						nullValue().as("inc_tax_flg2"),
						value(0).as("tax_sls_amt"),
						value(0).as("tax_tax_amt"),
						nullValue().as("ar_trd_grp_typ"),
						M_BP.bfw_bal_disp_flg,
						S0_MST_BILL.bill_each_sls_flg,
						value(0).as("base_cur_tax_amt"),
						M_EXT_SYS.null_val_if_flg,
						S0_MST_BILL.bill_rev,
						S0_MST_BILL.wg_cd
					)
					.from(
						S0_MSW_BILL_KEY
						.innerJoin(S0_MST_BILL).on(S0_MSW_BILL_KEY.bill_mng_no.eq(S0_MST_BILL.bill_mng_no))

						.leftOuterJoin(S0_MST_WRK).on(S0_MST_WRK.wrk_no.eq(S0_MST_BILL.wrk_no))
						.leftOuterJoin(M_BP).on(M_BP.bp_cd.eq(S0_MST_BILL.bcst_cd))
						.leftOuterJoin(M_BP_SUB).on(
							bracket(
								M_BP_SUB.bp_cd.eq(S0_MST_BILL.bcst_cd)
								.and(M_BP_SUB.st_dt.lte(S0_MST_BILL.bill_cl_dt))
								.and(M_BP_SUB.end_dt.gte(S0_MST_BILL.bill_cl_dt))
							)
						)
						.leftOuterJoin(M_DPT).on(
							bracket(
								M_DPT.dpt_cd.eq(S0_MST_BILL.bill_dpt_cd)
								.and(S0_MST_BILL.base_dt.between(M_DPT.st_dt, M_DPT.end_dt))
							)
						)
						.leftOuterJoin(M_BANK_AC).on(M_BANK_AC.bank_ac_cd.eq(M_DPT.rcv_bank_ac_cd))
						.leftOuterJoin(M_BANK).on(M_BANK.bank_cd.eq(M_BANK_AC.bank_cd))
						.leftOuterJoin(M_BANK_BRANCH).on(
							bracket(
								M_BANK_BRANCH.bank_cd.eq(M_BANK_AC.bank_cd)
								.and(M_BANK_BRANCH.branch_cd.eq(M_BANK_AC.branch_cd))
							)
						)
						.innerJoin(M_CO).on(M_CO.co_cd.eq(FCPA_CONTEXT$F_GET_CO_CD()))
						.innerJoin(M_EDI_IF_CTL).on(
							bracket(
								M_BP.bp_cd.eq(M_EDI_IF_CTL.bp_cd)
								.and(M_EDI_IF_CTL.if_proc_typ.eq(value(MAC_IF_PROC_TYP.BILL_SEND.value())))
								.and(bind("today").between(M_EDI_IF_CTL.st_dt, M_EDI_IF_CTL.end_dt))
							)
						)
						.innerJoin(M_CUR).on(S0_MST_BILL.trd_cur_cd.eq(M_CUR.cur_cd))
						.innerJoin(M_EXT_SYS).on(M_EXT_SYS.ext_sys_cd.eq(M_EDI_IF_CTL.ext_sys_cd))
					)
					.where(
						value(0).eq(value(0))
					)
					.orderBy(S0_MST_BILL.bill_mng_no.asc())
			);
	}
	
	/**
	 * -- MSLAL5210_MST_RCV_ACT_D_Query_S01
	 */
	static MCQueryPlan MSLAL5210_MST_RCV_ACT_D_S01() {
		MST_BILL_R S0_MST_BILL = MST_BILL_R.create("T1");
		MST_WRK_R S0_MST_WRK = MST_WRK_R.create("T4");
		MST_RCV_ACT_R S0_MST_RCV_ACT = MST_RCV_ACT_R.create("T5");
		MST_RCV_ACT_D_R S0_MST_RCV_ACT_D = MST_RCV_ACT_D_R.create("T6");
		MSW_BILL_KEY_R S0_MSW_BILL_KEY = MSW_BILL_KEY_R.create("W");

		MAM_BANK_AC_R M_BANK_AC = MAM_BANK_AC_R.create("M1");
		MAM_BANK_BRANCH_R M_BANK_BRANCH = MAM_BANK_BRANCH_R.create("M2");
		MAM_BANK_R M_BANK = MAM_BANK_R.create("M3");
		MAM_BP_R M_BP = MAM_BP_R.create("M4");
		MAM_BP_SUB_R M_BP_SUB = MAM_BP_SUB_R.create("M5");
		MAM_CO_R M_CO = MAM_CO_R.create("M6");
		MAM_CUR_R M_CUR = MAM_CUR_R.create("M7");
		MAM_DPT_R M_DPT = MAM_DPT_R.create("M8");
		MAM_EDI_IF_CTL_R M_EDI_IF_CTL = MAM_EDI_IF_CTL_R.create("M9");
		MAM_TRD_R M_TRD = MAM_TRD_R.create("M12");
		MAM_STTL_R M_STTL1 = MAM_STTL_R.create("M14");
		MAM_STTL_R M_STTL2 = MAM_STTL_R.create("M15");
		MAM_TAX_R M_TAX1 = MAM_TAX_R.create("M16");
		MAM_TAX_R M_TAX2 = MAM_TAX_R.create("M17");
		MAM_EXT_SYS_R M_EXT_SYS = MAM_EXT_SYS_R.create("M18");
		
		return createQueryPlan()
			.setQuery(
				sql("MSLAL5210_MST_RCV_ACT_D_Query_S01")
					.mainQuery()
					.select(
						M_EDI_IF_CTL.ext_sys_cd,
						S0_MST_BILL.bill_mng_no,
						S0_MST_BILL.bill_cl_dt,
						S0_MST_BILL.bill_dt,
						S0_MST_BILL.bill_no,
						value("*").as("bill_d_no"),
						S0_MST_BILL.pre_bill_no,
						S0_MST_BILL.pre_bill_dt,
						S0_MST_RCV_ACT_D.iv_no,
						S0_MST_RCV_ACT_D.wrk_no,
						S0_MST_WRK.wrk_nm,
						FCPA_CO$F_GET_CO_NM1(FCPA_CONTEXT$F_GET_DEF_LOCALE_CD()).as("co_nm"),
						M_CO.ein,
						M_CO.biz_co_no,
						M_CO.zip_cd,
						M_CO.addr1,
						M_CO.addr2,
						M_CO.addr3,
						M_CO.addr4,
						S0_MST_BILL.bill_dpt_cd,
						M_DPT.dpt_nm.as("bill_dpt"),
						M_CO.tel,
						M_CO.cntry_cd,
						S0_MST_BILL.bcst_cd,
						M_BP.bp_nm.as("bcst_nm"),
						decode(
							M_BP_SUB.bp_cd,
							nullValue(),
							M_BP.bill_bcst_nm,
							M_BP_SUB.bill_bcst_nm
						).as("bill_bcst_nm"),
						M_BP.ein.as("bcst_ein"),
						M_BP.biz_co_no.as("bcst_biz_co_no"),
						decode(
							M_BP_SUB.bp_cd,
							nullValue(),
							M_BP.bill_zip_cd,
							M_BP_SUB.bill_zip_cd
						).as("bcst_zip_cd"),
						decode(
							M_BP_SUB.bp_cd,
							nullValue(),
							M_BP.bill_addr1,
							M_BP_SUB.bill_addr1
						).as("bcst_addr1"),
						decode(
							M_BP_SUB.bp_cd,
							nullValue(),
							M_BP.addr2,
							M_BP_SUB.addr2
						).as("bcst_addr2"),
						decode(
							M_BP_SUB.bp_cd,
							nullValue(),
							M_BP.addr3,
							M_BP_SUB.addr3
						).as("bcst_addr3"),
						decode(
							M_BP_SUB.bp_cd,
							nullValue(),
							M_BP.addr4,
							M_BP_SUB.addr4
						).as("bcst_addr4"),
						decode(
							M_BP_SUB.bp_cd,
							nullValue(),
							M_BP.bill_bcst_dpt,
							M_BP_SUB.bill_bcst_dpt
						).as("bill_bcst_dpt"),
						decode(
							M_BP_SUB.bp_cd,
							nullValue(),
							M_BP.bill_tel,
							M_BP_SUB.bill_bcst_dpt
						).as("bill_tel"),
						M_BP.cntry_cd.as("bcst_cntry_cd"),
						S0_MST_BILL.trd_cur_cd,
						S0_MST_BILL.bill_xrate,
						S0_MST_BILL.last_bill_amt,
						S0_MST_BILL.xfr_amt.add(S0_MST_BILL.note_amt).add(S0_MST_BILL.cash_amt).as("rcv_amt"),
						S0_MST_BILL.sw_amt,
						S0_MST_BILL.setoff_amt.multiply(value(-1)).as("setoff_amt"),
						S0_MST_BILL.bfw_amt,
						S0_MST_BILL.sls_amt,
						S0_MST_BILL.dscnt_amt,
						S0_MST_BILL.ret_amt,
						S0_MST_BILL.tax_amt,
						S0_MST_BILL.sw_to_amt,
						S0_MST_BILL.bill_amt,
						S0_MST_BILL.adv_amt_bal,
						S0_MST_BILL.adv_amt,
						S0_MST_BILL.adv_setoff_amt,
						S0_MST_BILL.adv_setoff_tax_amt,
						M_DPT.rcv_bank_ac_cd.as("bank_ac_cd"),
						M_BANK_AC.bank_ac_typ,
						M_BANK_AC.bank_ac_no,
						M_BANK_AC.bank_ac_holder,
						M_BANK_AC.bank_ac_holder_sub,
						M_BANK_AC.bank_cd,
						M_BANK.bank_nm,
						M_BANK_AC.branch_cd,
						M_BANK_BRANCH.branch_nm,
						S0_MST_RCV_ACT.trd_cd,
						M_TRD.trd_nm,
						S0_MST_RCV_ACT.trd_ptn_typ,
						value("*").as("slip_sts_typ"),
						nullValue().as("dlv_slip_no"),
						nullValue().as("dlv_slip_d_no"),
						nullValue().as("ship_dlv_slip_no"),
						nullValue().as("ship_dlv_slip_d_no"),
						S0_MST_RCV_ACT.rcv_act_no.as("act_no"),
						S0_MST_RCV_ACT.rcv_act_rev.as("act_rev"),
						S0_MST_RCV_ACT_D.rcv_act_d_no.as("act_d_no"),
						nullValue().as("cst_po_no"),
						nullValue().as("cst_po_d_no"),
						S0_MST_RCV_ACT.ac_dt,
						nullValue().as("dlv_dt"),
						S0_MST_RCV_ACT.rcv_dt,
						nullValue().as("bill_basis_dt"),
						nullValue().as("base_ac_dt"),
						nullValue().as("itm_cd"),
						nullValue().as("itm_sub1"),
						nullValue().as("itm_sub2"),
						nullValue().as("itm_sub3"),
						nullValue().as("itm_nm"),
						nullValue().as("itm_alt_nm1"),
						nullValue().as("itm_alt_nm2"),
						nullValue().as("itm_alt_nm3"),
						nullValue().as("itm_alt_nm4"),
						value(false).as("dscnt_itm_flg"),
						value("*").as("sno1"),
						value("*").as("sno2"),
						value("*").as("sno3"),
						value("*").as("sno4"),
						nullValue().as("trd_unit_cd"),
						nullValue().as("trd_unit_nm"),
						value(0).as("trd_unit_qty"),
						value(false).as("interim_flg"),
						value(0).as("trd_cur_upri"),
						value(0).as("trd_cur_amt"),
						value(0).as("trd_cur_dscnt_amt"),
						nullValue().as("tax_cd"),
						nullValue().as("tax_nm"),
						nullValue().as("tax_rate"),
						nullValue().as("inc_tax_flg"),
						value(0).as("trd_cur_tax_amt"),
						nullValue().as("trd_d_rmrks"),
						M_CUR.amt_dec_place,
						M_BP.bill_cl_typ,
						M_BP.bill_cl_day1,
						M_BP.bill_cl_day2,
						M_BP.bill_cl_day3,
						M_BP.bill_cl_day4,
						M_BP.bill_cl_day5,
						S0_MST_RCV_ACT.rcv_dt.as("ar_rcv_dt"),
						S0_MST_RCV_ACT.rcv_act_no,
						S0_MST_RCV_ACT.ar_sttl_cd1,
						S0_MST_RCV_ACT.ar_sttl_cd2,
						S0_MST_RCV_ACT.ar_sttl_typ1,
						S0_MST_RCV_ACT.ar_sttl_typ2,
						nvl(S0_MST_RCV_ACT_D.trd_cur_amt1, value(0)).as("trd_cur_amt1"),
						nvl(S0_MST_RCV_ACT_D.trd_cur_amt2, value(0)).as("trd_cur_amt2"),
						nvl(S0_MST_RCV_ACT_D.trd_cur_tax_amt1, value(0)).as("trd_cur_tax_amt1"),
						nvl(S0_MST_RCV_ACT_D.trd_cur_tax_amt2, value(0)).as("trd_cur_tax_amt2"),
						nvl(S0_MST_RCV_ACT_D.base_cur_tax_amt1, value(0)).as("base_cur_tax_amt1"),
						nvl(S0_MST_RCV_ACT_D.base_cur_tax_amt2, value(0)).as("base_cur_tax_amt2"),
						M_STTL1.sttl_nm.as("ar_sttl_nm1"),
						M_STTL2.sttl_nm.as("ar_sttl_nm2"),
						M_STTL1.bill_tax_disp_flg.as("bill_tax_disp_flg1"),
						M_STTL2.bill_tax_disp_flg.as("bill_tax_disp_flg2"),
						M_TAX1.tax_cd.as("ar_tax_cd1"),
						M_TAX2.tax_cd.as("ar_tax_cd2"),
						M_TAX1.tax_nm.as("ar_tax_nm1"),
						M_TAX2.tax_nm.as("ar_tax_nm2"),
						M_TAX1.tax_rate.as("ar_tax_rate1"),
						M_TAX2.tax_rate.as("ar_tax_rate2"),
						M_TAX1.inc_tax_flg.as("inc_tax_flg1"),
						M_TAX2.inc_tax_flg.as("inc_tax_flg2"),
						value(MAC_AR_TRD_GRP_TYP.RCV.value()).as("ar_trd_grp_typ"),
						M_BP.bfw_bal_disp_flg,
						S0_MST_BILL.bill_each_sls_flg,
						value(0).as("base_cur_tax_amt"),
						M_EXT_SYS.null_val_if_flg,
						S0_MST_BILL.bill_rev,
						S0_MST_BILL.wg_cd
					)
					.from(
						S0_MSW_BILL_KEY
						.innerJoin(S0_MST_RCV_ACT_D).on(S0_MSW_BILL_KEY.bill_mng_no.eq(S0_MST_RCV_ACT_D.bill_mng_no))
						.leftOuterJoin(S0_MST_BILL).on(S0_MST_RCV_ACT_D.bill_mng_no.eq(S0_MST_BILL.bill_mng_no))
						.leftOuterJoin(S0_MST_RCV_ACT).on(
							bracket(
									S0_MST_RCV_ACT.rcv_act_no.eq(S0_MST_RCV_ACT_D.rcv_act_no)
									.and(S0_MST_RCV_ACT.rcv_act_seq.eq(S0_MST_RCV_ACT_D.rcv_act_seq))
								)
						)
						.leftOuterJoin(M_STTL1).on(S0_MST_RCV_ACT.ar_sttl_cd1.eq(M_STTL1.sttl_cd))
						.leftOuterJoin(M_STTL2).on(S0_MST_RCV_ACT.ar_sttl_cd2.eq(M_STTL2.sttl_cd))
						.leftOuterJoin(M_TAX1).on(S0_MST_RCV_ACT.tax_cd1.eq(M_TAX1.tax_cd))
						.leftOuterJoin(M_TAX2).on(S0_MST_RCV_ACT.tax_cd2.eq(M_TAX2.tax_cd))
						.leftOuterJoin(M_BP).on(M_BP.bp_cd.eq(S0_MST_BILL.bcst_cd))
						.leftOuterJoin(M_BP_SUB).on(
							bracket(
								M_BP_SUB.bp_cd.eq(S0_MST_BILL.bcst_cd)
								.and(M_BP_SUB.st_dt.lte(S0_MST_BILL.bill_cl_dt))
								.and(M_BP_SUB.end_dt.gte(S0_MST_BILL.bill_cl_dt))
							)
						)
						.leftOuterJoin(M_DPT).on(
							bracket(
								M_DPT.dpt_cd.eq(S0_MST_BILL.bill_dpt_cd)
								.and(S0_MST_BILL.base_dt.between(M_DPT.st_dt, M_DPT.end_dt))
							)
						)
						.leftOuterJoin(S0_MST_WRK).on(S0_MST_WRK.wrk_no.eq(S0_MST_RCV_ACT_D.wrk_no))
						.leftOuterJoin(M_BANK_AC).on(M_BANK_AC.bank_ac_cd.eq(M_DPT.rcv_bank_ac_cd))
						.leftOuterJoin(M_BANK).on(M_BANK.bank_cd.eq(M_BANK_AC.bank_cd))
						.leftOuterJoin(M_BANK_BRANCH).on(
							bracket(
								M_BANK_BRANCH.bank_cd.eq(M_BANK_AC.bank_cd)
								.and(M_BANK_BRANCH.branch_cd.eq(M_BANK_AC.branch_cd))
							)
						)
						.innerJoin(M_CO).on(M_CO.co_cd.eq(FCPA_CONTEXT$F_GET_CO_CD()))
						.innerJoin(M_TRD).on(M_TRD.trd_cd.eq(S0_MST_RCV_ACT.trd_cd))
						.innerJoin(M_EDI_IF_CTL).on(
							bracket(
								M_BP.bp_cd.eq(M_EDI_IF_CTL.bp_cd)
								.and(M_EDI_IF_CTL.if_proc_typ.eq(value(MAC_IF_PROC_TYP.BILL_SEND.value())))
								.and(bind("today").between(M_EDI_IF_CTL.st_dt, M_EDI_IF_CTL.end_dt))
							)
						)
						.innerJoin(M_CUR).on(S0_MST_BILL.trd_cur_cd.eq(M_CUR.cur_cd))
						.innerJoin(M_EXT_SYS).on(M_EXT_SYS.ext_sys_cd.eq(M_EDI_IF_CTL.ext_sys_cd))
					)
					.where(
						S0_MST_RCV_ACT.trd_ptn_typ.in(
								value(MAC_TRD_PTN_TYP.RCV_ADV.value()), 
								value(MAC_TRD_PTN_TYP.SETOFF_ADV_OTH.value()), 
								value(MAC_TRD_PTN_TYP.SETOFF_SUSP_ADV.value())
							)
					)
					.orderBy(S0_MST_BILL.bill_mng_no.asc())
			);
	}
	
	/**
	 * -- MSLAL5210_MST_BILL_CL_CAN_Query_S01
	 */
	static MCQueryPlan MSLAL5210_MST_BILL_CL_CAN_S01() {
		
		MST_BILL_CL_CAN_R S0_MST_BILL_CL_CAN = MST_BILL_CL_CAN_R.create("T1");
		MST_WRK_R S0_MST_WRK = MST_WRK_R.create("T2");
		MAM_BP_R M_BP = MAM_BP_R.create("M1");
		MAM_CO_R M_CO = MAM_CO_R.create("M2");
		MAM_DPT_R M_DPT = MAM_DPT_R.create("M3");
		MAM_EDI_IF_CTL_R M_EDI_IF_CTL = MAM_EDI_IF_CTL_R.create("M4");
		MAM_BP_SUB_R M_BP_SUB = MAM_BP_SUB_R.create("M8");
		MAM_EXT_SYS_R M_EXT_SYS = MAM_EXT_SYS_R.create("M9");

		return createQueryPlan()
			.setQuery(
				sql("MSLAL5210_MST_BILL_Query_S01")
					.mainQuery()
					.select(
						M_EDI_IF_CTL.ext_sys_cd,
						S0_MST_BILL_CL_CAN.bill_mng_no,
						S0_MST_BILL_CL_CAN.bill_cl_dt,
						S0_MST_BILL_CL_CAN.bill_dt,
						S0_MST_BILL_CL_CAN.bill_no,
						S0_MST_BILL_CL_CAN.bill_no.as("pre_bill_no"),
						S0_MST_BILL_CL_CAN.bill_dt.as("pre_bill_dt"),
						S0_MST_BILL_CL_CAN.iv_no,
						S0_MST_BILL_CL_CAN.wrk_no,
						S0_MST_WRK.wrk_nm,
						FCPA_CO$F_GET_CO_NM1(FCPA_CONTEXT$F_GET_DEF_LOCALE_CD()).as("co_nm"),
						M_CO.ein,
						M_CO.biz_co_no,
						M_CO.zip_cd,
						M_CO.addr1,
						M_CO.addr2,
						M_CO.addr3,
						M_CO.addr4,
						S0_MST_BILL_CL_CAN.bill_dpt_cd,
						M_DPT.dpt_nm.as("bill_dpt"),
						M_CO.tel,
						M_CO.cntry_cd,
						S0_MST_BILL_CL_CAN.bcst_cd,
						M_BP.bp_nm.as("bcst_nm"),
						decode(
							M_BP_SUB.bp_cd,
							nullValue(),
							M_BP.bill_bcst_nm,
							M_BP_SUB.bill_bcst_nm
						).as("bill_bcst_nm"),
						M_BP.ein.as("bcst_ein"),
						M_BP.biz_co_no.as("bcst_biz_co_no"),
						decode(
							M_BP_SUB.bp_cd,
							nullValue(),
							M_BP.bill_zip_cd,
							M_BP_SUB.bill_zip_cd
						).as("bcst_zip_cd"),
						decode(
							M_BP_SUB.bp_cd,
							nullValue(),
							M_BP.bill_addr1,
							M_BP_SUB.bill_addr1
						).as("bcst_addr1"),
						decode(
							M_BP_SUB.bp_cd,
							nullValue(),
							M_BP.addr2,
							M_BP_SUB.addr2
						).as("bcst_addr2"),
						decode(
							M_BP_SUB.bp_cd,
							nullValue(),
							M_BP.addr3,
							M_BP_SUB.addr3
						).as("bcst_addr3"),
						decode(
							M_BP_SUB.bp_cd,
							nullValue(),
							M_BP.addr4,
							M_BP_SUB.addr4
						).as("bcst_addr4"),
						decode(
							M_BP_SUB.bp_cd,
							nullValue(),
							M_BP.bill_bcst_dpt,
							M_BP_SUB.bill_bcst_dpt
						).as("bill_bcst_dpt"),
						decode(
							M_BP_SUB.bp_cd,
							nullValue(),
							M_BP.bill_tel,
							M_BP_SUB.bill_bcst_dpt
						).as("bill_tel"),
						M_BP.cntry_cd.as("bcst_cntry_cd"),
						S0_MST_BILL_CL_CAN.trd_cur_cd,
						S0_MST_BILL_CL_CAN.bill_xrate,
						value("*").as("bill_d_no"),
						value(0).as("last_bill_amt"),
						value(0).as("rcv_amt"),
						value(0).as("sw_amt"),
						value(0).as("setoff_amt"),
						value(0).as("bfw_amt"),
						value(0).as("sls_amt"),
						value(0).as("dscnt_amt"),
						value(0).as("ret_amt"),
						value(0).as("tax_amt"),
						value(0).as("sw_to_amt"),
						value(0).as("bill_amt"),
						value(0).as("adv_amt_bal"),
						value(0).as("adv_amt"),
						value(0).as("adv_setoff_amt"),
						value(0).as("adv_setoff_tax_amt"),
						nullValue().as("bank_ac_cd"),
						nullValue().as("bank_ac_typ"),
						nullValue().as("bank_ac_no"),
						nullValue().as("bank_ac_holder"),
						nullValue().as("bank_ac_holder_sub"),
						nullValue().as("bank_cd"),
						nullValue().as("bank_nm"),
						nullValue().as("branch_cd"),
						nullValue().as("branch_nm"),
						nullValue().as("trd_cd"),
						nullValue().as("trd_ptn_typ"),
						nullValue().as("slip_sts_typ"),
						nullValue().as("bill_basis_dt"),
						nullValue().as("base_ac_dt"),
						nullValue().as("itm_cd"),
						nullValue().as("itm_sub1"),
						nullValue().as("itm_sub2"),
						nullValue().as("itm_sub3"),
						nullValue().as("itm_nm"),
						nullValue().as("itm_alt_nm1"),
						nullValue().as("itm_alt_nm2"),
						nullValue().as("itm_alt_nm3"),
						nullValue().as("itm_alt_nm4"),
						value(false).as("dscnt_itm_flg"),
						value("*").as("sno1"),
						value("*").as("sno2"),
						value("*").as("sno3"),
						value("*").as("sno4"),
						nullValue().as("trd_unit_cd"),
						nullValue().as("trd_unit_nm"),
						value(0).as("trd_unit_qty"),
						value(false).as("interim_flg"),
						value(0).as("trd_cur_upri"),
						value(0).as("trd_cur_amt"),
						value(false).as("inc_tax_flg"),
						value(0).as("trd_cur_tax_amt"),
						M_BP.bill_cl_typ,
						M_BP.bill_cl_day1,
						M_BP.bill_cl_day2,
						M_BP.bill_cl_day3,
						M_BP.bill_cl_day4,
						M_BP.bill_cl_day5,
						value(0).as("base_cur_tax_amt"),
						M_EXT_SYS.null_val_if_flg,
						S0_MST_BILL_CL_CAN.bill_rev,
						S0_MST_BILL_CL_CAN.wg_cd
					)
					.from(
						S0_MST_BILL_CL_CAN
						.leftOuterJoin(M_BP).on(M_BP.bp_cd.eq(S0_MST_BILL_CL_CAN.bcst_cd))
						.leftOuterJoin(M_BP_SUB).on(
							bracket(
								M_BP_SUB.bp_cd.eq(S0_MST_BILL_CL_CAN.bcst_cd)
								.and(M_BP_SUB.st_dt.lte(S0_MST_BILL_CL_CAN.bill_cl_dt))
								.and(M_BP_SUB.end_dt.gte(S0_MST_BILL_CL_CAN.bill_cl_dt))
							)
						)
						.leftOuterJoin(S0_MST_WRK).on(S0_MST_WRK.wrk_no.eq(S0_MST_BILL_CL_CAN.wrk_no))
						.leftOuterJoin(M_DPT).on(
							bracket(
								M_DPT.dpt_cd.eq(S0_MST_BILL_CL_CAN.bill_dpt_cd)
								.and(S0_MST_BILL_CL_CAN.base_dt.between(M_DPT.st_dt, M_DPT.end_dt))
							)
						)
						.innerJoin(M_CO).on(M_CO.co_cd.eq(FCPA_CONTEXT$F_GET_CO_CD()))
						.innerJoin(M_EDI_IF_CTL).on(
							bracket(
								M_BP.bp_cd.eq(M_EDI_IF_CTL.bp_cd)
								.and(M_EDI_IF_CTL.if_proc_typ.eq(value(MAC_IF_PROC_TYP.BILL_SEND.value())))
								.and(bind("today").between(M_EDI_IF_CTL.st_dt, M_EDI_IF_CTL.end_dt))
							)
						)
						.innerJoin(M_EXT_SYS).on(M_EXT_SYS.ext_sys_cd.eq(M_EDI_IF_CTL.ext_sys_cd))
					)
					.where(
						value(0).eq(value(0))
						.and(S0_MST_BILL_CL_CAN.bill_mng_no.eq(bind("bill_mng_no")))
					)
					.orderBy(S0_MST_BILL_CL_CAN.bill_mng_no.asc())
			);
	}
	
	/**
	 * -- MSLAL5210_MST_DLV_SLIP_Query_S01
	 */
	static MCQueryPlan MSLAL5210_MST_DLV_SLIP_S01() {
		
		MST_DLV_SLIP_R S0_MST_DLV_SLIP = MST_DLV_SLIP_R.create("T1");
		MST_DLV_SLIP_D_R S0_MST_DLV_SLIP_D = MST_DLV_SLIP_D_R.create("T2");
		MSW_DLV_SLIP_KEY_R S0_MSW_DLV_SLIP_KEY = MSW_DLV_SLIP_KEY_R.create("W1");

		MAM_BP_R M_BP = MAM_BP_R.create("M1");
		MAM_CO_R M_CO = MAM_CO_R.create("M2");
		MAM_CUR_R M_CUR = MAM_CUR_R.create("M3");
		MAM_DPT_R M_DPT = MAM_DPT_R.create("M4");
		MAM_EDI_IF_CTL_R M_EDI_IF_CTL = MAM_EDI_IF_CTL_R.create("M5");
		MAM_ITM_R M_ITM = MAM_ITM_R.create("M6");
		MAM_TAX_R M_TAX = MAM_TAX_R.create("M7");
		MAM_TRD_R M_TRD = MAM_TRD_R.create("M8");
		MAM_UNIT_R M_UNIT = MAM_UNIT_R.create("M9");
		MAM_EXT_SYS_R M_EXT_SYS = MAM_EXT_SYS_R.create("M10");
		
		return createQueryPlan()
			.setQuery(
				sql("MSLAL5210_MST_DLV_SLIP_Query_S01")
					.mainQuery()
					.select(
						M_EDI_IF_CTL.ext_sys_cd,
						S0_MST_DLV_SLIP.ac_dt.as("bill_cl_dt"),
						S0_MST_DLV_SLIP.ac_dt.as("bill_dt"),
						S0_MST_DLV_SLIP.dlv_slip_no.as("bill_no"),
						S0_MST_DLV_SLIP_D.dlv_slip_d_no.as("bill_d_no"),
						S0_MST_DLV_SLIP.ac_dt.as("bill_st_dt"),
						S0_MST_DLV_SLIP.ac_dt.as("bill_end_dt"),
						FCPA_CO$F_GET_CO_NM1(FCPA_CONTEXT$F_GET_DEF_LOCALE_CD()).as("co_nm"),
						M_CO.ein,
						M_CO.biz_co_no,
						M_CO.zip_cd,
						M_CO.addr1,
						M_CO.addr2,
						M_CO.addr3,
						M_CO.addr4,
						S0_MST_DLV_SLIP.dpt_cd.as("bill_dpt_cd"),
						M_DPT.dpt_nm.as("bill_dpt"),
						M_CO.tel,
						M_CO.cntry_cd,
						S0_MST_DLV_SLIP.bp_cd.as("bcst_cd"),
						nvl(S0_MST_DLV_SLIP.bp_nm, M_BP.bp_nm).as("bcst_nm"),
						M_BP.bill_bcst_nm,
						M_BP.ein.as("bcst_ein"),
						M_BP.biz_co_no.as("bcst_biz_co_no"),
						S0_MST_DLV_SLIP.bp_zip_cd.as("bcst_zip_cd"),
						S0_MST_DLV_SLIP.bp_addr1.as("bcst_addr1"),
						S0_MST_DLV_SLIP.bp_addr2.as("bcst_addr2"),
						S0_MST_DLV_SLIP.bp_addr3.as("bcst_addr3"),
						S0_MST_DLV_SLIP.bp_addr4.as("bcst_addr4"),
						S0_MST_DLV_SLIP.bp_cntct_dpt.as("bill_bcst_dpt"),
						S0_MST_DLV_SLIP.bp_tel.as("bill_tel"),
						M_BP.cntry_cd.as("bcst_cntry_cd"),
						S0_MST_DLV_SLIP.trd_cur_cd,
						S0_MST_DLV_SLIP.xrate.as("bill_xrate"),
						value(0).as("last_bill_amt"),
						value(0).as("rcv_amt"),
						value(0).as("sw_amt"),
						value(0).as("setoff_amt"),
						value(0).as("bfw_amt"),
						cases()
							.when(S0_MST_DLV_SLIP.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.PROV.value()))).then(nvl(S0_MST_DLV_SLIP.trd_cur_amt, value(0)))
							.otherwise(value(0)).as("sls_amt"),
						nvl(S0_MST_DLV_SLIP.trd_cur_dscnt_amt, value(0)).as("dscnt_amt"),
						cases()
							.when(S0_MST_DLV_SLIP.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.PROV_RTN.value()))).then(nvl(S0_MST_DLV_SLIP.trd_cur_amt, value(0)).multiply(value(-1)))
							.otherwise(value(0)).as("ret_amt"),
						cases()
							.when(S0_MST_DLV_SLIP.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.PROV_RTN.value()))).then(nvl(S0_MST_DLV_SLIP.trd_cur_tax_amt, value(0)).multiply(value(-1)))
							.otherwise(nvl(S0_MST_DLV_SLIP.trd_cur_tax_amt, value(0))).as("tax_amt"),
						value(0).as("sw_to_amt"),
						cases()
							.when(S0_MST_DLV_SLIP.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.PROV.value()))).then(nvl(S0_MST_DLV_SLIP.trd_cur_amt, value(0)))
							.otherwise(value(0)).add(
									nvl(S0_MST_DLV_SLIP.trd_cur_dscnt_amt, value(0)).multiply(value(-1))
								).add(
									cases()
									.when(S0_MST_DLV_SLIP.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.PROV_RTN.value()))).then(nvl(S0_MST_DLV_SLIP.trd_cur_amt, value(0)).multiply(value(-1)))
									.otherwise(value(0))
								).add(
									cases()
									.when(S0_MST_DLV_SLIP.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.PROV_RTN.value()))).then(nvl(S0_MST_DLV_SLIP.trd_cur_tax_amt, value(0)).multiply(value(-1)))
									.otherwise(nvl(S0_MST_DLV_SLIP.trd_cur_tax_amt, value(0))
								)
							).as("bill_amt"),
						value(0).as("adv_amt_bal"),
						value(0).as("adv_amt"),
						value(0).as("adv_setoff_amt"),
						value(0).as("adv_setoff_tax_amt"),
						S0_MST_DLV_SLIP.trd_cd,
						M_TRD.trd_nm,
						M_TRD.trd_ptn_typ,
						S0_MST_DLV_SLIP.slip_sts_typ,
						S0_MST_DLV_SLIP.ship_dlv_slip_no,
						S0_MST_DLV_SLIP_D.ship_dlv_slip_d_no,
						S0_MST_DLV_SLIP.cst_po_no,
						S0_MST_DLV_SLIP_D.cst_po_d_no,
						S0_MST_DLV_SLIP.ac_dt,
						S0_MST_DLV_SLIP.dlv_tm.as("dlv_dt"),
						S0_MST_DLV_SLIP.ac_dt.as("bill_basis_dt"),
						S0_MST_DLV_SLIP_D.base_ac_dt.as("base_ac_dt"),
						S0_MST_DLV_SLIP_D.itm_cd,
						S0_MST_DLV_SLIP_D.itm_sub1,
						S0_MST_DLV_SLIP_D.itm_sub2,
						S0_MST_DLV_SLIP_D.itm_sub3,
						decode(
								M_ITM.sundry_itm_flg,
								value(true),
								S0_MST_DLV_SLIP_D.itm_nm,
								M_ITM.itm_nm
							).as("itm_nm"),
						M_ITM.itm_alt_nm1,
						M_ITM.itm_alt_nm2,
						M_ITM.itm_alt_nm3,
						M_ITM.itm_alt_nm4,
						M_ITM.dscnt_itm_flg,
						S0_MST_DLV_SLIP_D.sno1,
						S0_MST_DLV_SLIP_D.sno2,
						S0_MST_DLV_SLIP_D.sno3,
						S0_MST_DLV_SLIP_D.sno4,
						S0_MST_DLV_SLIP_D.trd_unit_cd,
						M_UNIT.unit_nm.as("trd_unit_nm"),
						S0_MST_DLV_SLIP_D.trd_unit_qty,
						S0_MST_DLV_SLIP_D.interim_flg,
						nvl(S0_MST_DLV_SLIP_D.trd_cur_upri, value(0)).as("trd_cur_upri"),
						nvl(S0_MST_DLV_SLIP_D.trd_cur_amt, value(0)).as("trd_cur_amt"),
						nvl(S0_MST_DLV_SLIP_D.trd_cur_dscnt_amt, value(0)).as("trd_cur_dscnt_amt"),
						S0_MST_DLV_SLIP_D.tax_cd,
						M_TAX.tax_nm,
						M_TAX.tax_rate,
						M_TAX.inc_tax_flg,
						S0_MST_DLV_SLIP_D.trd_cur_tax_amt,
						S0_MST_DLV_SLIP_D.trd_d_rmrks,
						M_CUR.amt_dec_place,
						S0_MST_DLV_SLIP.dlv_slip_seq,
						M_BP.bill_cl_typ,
						M_BP.bill_cl_day1,
						M_BP.bill_cl_day2,
						M_BP.bill_cl_day3,
						M_BP.bill_cl_day4,
						M_BP.bill_cl_day5,
						value(0).as("base_cur_tax_amt"),
						M_EXT_SYS.null_val_if_flg,
						S0_MST_DLV_SLIP.dlv_slip_rev,
						S0_MST_DLV_SLIP.wg_cd,
						S0_MST_DLV_SLIP.ship_tm
					)
					.from(
						S0_MSW_DLV_SLIP_KEY
						.innerJoin(S0_MST_DLV_SLIP).on(
							bracket(
									S0_MSW_DLV_SLIP_KEY.dlv_slip_no.eq(S0_MST_DLV_SLIP.dlv_slip_no))
									.and(S0_MSW_DLV_SLIP_KEY.dlv_slip_seq.eq(S0_MST_DLV_SLIP.dlv_slip_seq))
							)
						.innerJoin(S0_MST_DLV_SLIP_D).on(
							bracket(
									S0_MST_DLV_SLIP.dlv_slip_no.eq(S0_MST_DLV_SLIP_D.dlv_slip_no))
									.and(S0_MST_DLV_SLIP.dlv_slip_seq.eq(S0_MST_DLV_SLIP_D.dlv_slip_seq))
							)
						.leftOuterJoin(M_BP).on(M_BP.bp_cd.eq(S0_MST_DLV_SLIP.bp_cd))
						.leftOuterJoin(M_DPT).on(
							bracket(
								M_DPT.dpt_cd.eq(S0_MST_DLV_SLIP.dpt_cd)
								.and(S0_MST_DLV_SLIP.ac_dt.between(M_DPT.st_dt, M_DPT.end_dt))
							)
						)
						.innerJoin(M_CO).on(M_CO.co_cd.eq(FCPA_CONTEXT$F_GET_CO_CD()))
						.innerJoin(M_TRD).on(M_TRD.trd_cd.eq(S0_MST_DLV_SLIP.trd_cd))
						.leftOuterJoin(M_ITM).on(
							bracket(
								M_ITM.itm_cd.eq(S0_MST_DLV_SLIP_D.itm_cd)
								.and(M_ITM.itm_sub1.eq(S0_MST_DLV_SLIP_D.itm_sub1))
								.and(M_ITM.itm_sub2.eq(S0_MST_DLV_SLIP_D.itm_sub2))
								.and(M_ITM.itm_sub3.eq(S0_MST_DLV_SLIP_D.itm_sub3))
							)
						)
						.leftOuterJoin(M_UNIT).on(
							M_UNIT.unit_cd.eq(S0_MST_DLV_SLIP_D.trd_unit_cd)
						)
						.leftOuterJoin(M_TAX).on(
							S0_MST_DLV_SLIP_D.tax_cd.eq(M_TAX.tax_cd)
						)
						.innerJoin(M_EDI_IF_CTL).on(
							bracket(
								M_BP.bp_cd.eq(M_EDI_IF_CTL.bp_cd)
								.and(M_EDI_IF_CTL.if_proc_typ.eq(value(MAC_IF_PROC_TYP.BILL_SEND.value())))
								.and(bind("today").between(M_EDI_IF_CTL.st_dt, M_EDI_IF_CTL.end_dt))
							)
						)
						.innerJoin(M_CUR).on(
							S0_MST_DLV_SLIP.trd_cur_cd.eq(M_CUR.cur_cd)
						)
						.innerJoin(M_EXT_SYS).on(M_EXT_SYS.ext_sys_cd.eq(M_EDI_IF_CTL.ext_sys_cd))
					)
					.where(
						value(0).eq(value(0))
					)
					.orderBy(S0_MST_DLV_SLIP.dlv_slip_no.asc())
			);
	}
	
}