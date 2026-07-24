package mcframe.serverMSBH.MSBHL0190;

import static mcframe.serverCore.queryapi.IFMCSQL.*;
import static mcframe.serverCore.queryapi.MCQueryExecution.*;

import mcframe.serverMA.dbc.*;
import mcframe.serverMS.dbc.*;

public class Query_MC {

	/**
	 * -- MSBHL0190_MST_PAY_NTC_HIS_Query_S01
	 */
	static MCQueryPlan MSBHL0190_MST_PAY_NTC_HIS_S01() {
		
		MST_PAY_NTC_HIS_R payNtcHis1 = MST_PAY_NTC_HIS_R.create("payNtcHis1");
		MST_WRK_R wrk1 = MST_WRK_R.create("wrk1");
		MAM_BP_R bp1 = MAM_BP_R.create("bp1");
		MAM_CUR_R cur1 = MAM_CUR_R.create("cur1");
		MAVM_RD_DPT_R rdDpt1 = MAVM_RD_DPT_R.create("rdDpt1");
		MAM_DPT_R dpt1 = MAM_DPT_R.create("dpt1");
		MST_PAY_CHK_R payChk1 = MST_PAY_CHK_R.create("payChk1");
		MAM_WG_R wg1 = MAM_WG_R.create("wg1");
		
		return createQueryPlan()
			.setQuery(
				sql("MSBHL0190_MST_PAY_NTC_HIS_Query_S01")
					.mainQuery()
					.select(
						payNtcHis1.pay_chk_no,
						payNtcHis1.pay_ntc_rev,
						payNtcHis1.pay_ntc_his_no,
						payNtcHis1.latest_flg,
						payNtcHis1.can_flg,
						payNtcHis1.bsppl_cl_dt,
						payNtcHis1.reg_dt,
						payNtcHis1.pay_spot_flg,
						payNtcHis1.rcpt_iv_no,
						payNtcHis1.wrk_no,
						payNtcHis1.bsppl_cd,
						payNtcHis1.bsppl_dpt_cd,
						dpt1.wg_cd,
						wg1.wg_nm,
						payNtcHis1.pay_xrate,
						payNtcHis1.trd_cur_cd,
						payNtcHis1.last_pay_schd_amt,
						payNtcHis1.pay_amt,
						payNtcHis1.sw_amt,
						payNtcHis1.bfw_amt,
						payNtcHis1.purc_amt,
						payNtcHis1.purc_dscnt_amt,
						payNtcHis1.purc_ret_amt,
						payNtcHis1.setoff_amt,
						payNtcHis1.tax_amt,
						payNtcHis1.sw_to_amt,
						payNtcHis1.schd_pay_amt,
						payNtcHis1.adv_pay_bal,
						payNtcHis1.adv_pay_amt,
						payNtcHis1.adv_pay_setoff_amt,
						payNtcHis1.adv_pay_setoff_tax_amt,
						payNtcHis1.sub_char1,
						payNtcHis1.sub_char2,
						payNtcHis1.sub_char3,
						payNtcHis1.ins_usr_id,
						payNtcHis1.ins_usr_nm,
						payNtcHis1.ins_func_id,
						payNtcHis1.upd_usr_id,
						payNtcHis1.upd_usr_nm,
						payNtcHis1.upd_func_id,
						payNtcHis1.ins_ts,
						payNtcHis1.upd_ts,
						payNtcHis1.upd_srv_req_no,
						wrk1.wrk_nm,
						bp1.bp_nm.as("bsppl_nm"),
						dpt1.dpt_nm.as("bsppl_dpt_nm"),
						cur1.cur_nm.as("trd_cur_nm")
					)
					.from(
						payNtcHis1
						.leftOuterJoin(wrk1).on(
							wrk1.wrk_no.eq(payNtcHis1.wrk_no)
						)
						.leftOuterJoin(bp1).on(
							bp1.bp_cd.eq(payNtcHis1.bsppl_cd)
						)
						.leftOuterJoin(payChk1).on(
							payChk1.pay_chk_no.eq(payNtcHis1.pay_chk_no)
						)
						.leftOuterJoin(dpt1).on(
							dpt1.dpt_cd.eq(payNtcHis1.bsppl_dpt_cd)
							.and(payChk1.reg_dt.between(dpt1.st_dt, dpt1.end_dt))
						)
						.leftOuterJoin(cur1).on(
							cur1.cur_cd.eq(payNtcHis1.trd_cur_cd)
						)
						.innerJoin(rdDpt1).on(
							rdDpt1.dpt_cd.eq(payNtcHis1.bsppl_dpt_cd)
						)
						.leftOuterJoin(wg1).on(
							wg1.wg_cd.eq(dpt1.wg_cd)
						)
					)
					.where(
						value(0).eq(value(0))
						.and(payNtcHis1.pay_chk_no.eq(bind("pay_chk_no")))
						.cutoff$and(payNtcHis1.pay_ntc_rev.eq(bind("pay_ntc_rev")))
						.cutoff$and(payNtcHis1.latest_flg.eq(bind("latest_flg_str")))
					)
			);
	}
	
	/**
	 * -- MSBHL0190_MST_PAY_NTC_D_HIS_Query_S01
	 */
	static MCQueryPlan MSBHL0190_MST_PAY_NTC_D_HIS_S01() {

		MST_PAY_NTC_D_HIS_R payNtcDHis1 = MST_PAY_NTC_D_HIS_R.create("payNtcDHis1");
		MAM_TRD_R trd1 = MAM_TRD_R.create("trd1");
		MAM_ITM_R itm1 = MAM_ITM_R.create("itm1");
		MAM_UNIT_R unit1 = MAM_UNIT_R.create("unit1");
		MAM_TAX_R tax1 = MAM_TAX_R.create("tax1");
		MAM_STTL_R sttl1 = MAM_STTL_R.create("sttl1");
		MAM_BP_R bp1 = MAM_BP_R.create("bp1");
		MAM_BP_R bp2 = MAM_BP_R.create("bp2");
		
		return createQueryPlan()
			.setQuery(
				sql("MSBHL0190_MST_PAY_NTC_D_HIS_Query_S01")
					.mainQuery()
					.select(
						payNtcDHis1.ap_d_no,
						payNtcDHis1.pay_act_no,
						payNtcDHis1.pay_act_seq,
						payNtcDHis1.pay_act_d_no,
						payNtcDHis1.pay_act_d_seq,
						payNtcDHis1.adv_pay_act_no,
						payNtcDHis1.adv_pay_act_seq,
						payNtcDHis1.pay_ntc_d_his_typ,
						payNtcDHis1.po_no,
						payNtcDHis1.po_d_no,
						payNtcDHis1.purc_act_no,
						payNtcDHis1.purc_act_rev,
						payNtcDHis1.purc_act_d_no,
						payNtcDHis1.bp_dlv_slip_no,
						payNtcDHis1.bp_dlv_slip_d_no,
						payNtcDHis1.trd_cd,
						payNtcDHis1.slip_sts_typ,
						payNtcDHis1.act_dt,
						payNtcDHis1.itm_cd,
						payNtcDHis1.itm_sub1,
						payNtcDHis1.itm_sub2,
						payNtcDHis1.itm_sub3,
						decode(
							payNtcDHis1.sundry_itm_flg,
							value(true),
							payNtcDHis1.itm_nm,
							itm1.itm_nm
						).as("itm_nm"),
						payNtcDHis1.sundry_itm_flg,
						payNtcDHis1.sppl_itm_cd,
						payNtcDHis1.sppl_itm_nm,
						payNtcDHis1.trd_unit_cd,
						payNtcDHis1.trd_unit_qty,
						payNtcDHis1.tax_cd,
						payNtcDHis1.interim_flg,
						payNtcDHis1.trd_cur_upri,
						payNtcDHis1.trd_cur_amt,
						payNtcDHis1.trd_cur_tax_amt,
						payNtcDHis1.trd_cur_dscnt_amt,
						payNtcDHis1.base_cur_upri,
						payNtcDHis1.base_cur_amt,
						payNtcDHis1.base_cur_tax_amt,
						payNtcDHis1.base_cur_dscnt_amt,
						payNtcDHis1.sppl_cd,
						payNtcDHis1.asppl_cd,
						payNtcDHis1.pay_mtd_typ,
						payNtcDHis1.base_purc_ac_dt,
						payNtcDHis1.pay_ntc_d_print_rmrks,
						payNtcDHis1.ap_sttl_cd,
						payNtcDHis1.pay_act_dt,
						payNtcDHis1.ap_d_sub_char1,
						payNtcDHis1.ap_d_sub_char2,
						payNtcDHis1.ap_d_sub_char3,
						payNtcDHis1.pay_act_d_sub_char1,
						payNtcDHis1.pay_act_d_sub_char2,
						payNtcDHis1.pay_act_d_sub_char3,
						payNtcDHis1.adv_pay_act_sub_char1,
						payNtcDHis1.adv_pay_act_sub_char2,
						payNtcDHis1.adv_pay_act_sub_char3,
						payNtcDHis1.ins_usr_id,
						payNtcDHis1.ins_usr_nm,
						payNtcDHis1.ins_func_id,
						payNtcDHis1.upd_usr_id,
						payNtcDHis1.upd_usr_nm,
						payNtcDHis1.upd_func_id,
						payNtcDHis1.ins_ts,
						payNtcDHis1.upd_ts,
						payNtcDHis1.upd_srv_req_no,
						trd1.trd_ptn_typ,
						trd1.trd_nm,
						unit1.unit_nm,
						tax1.tax_nm,
						tax1.inc_tax_flg,
						tax1.tax_rate,
						sttl1.sttl_nm,
						itm1.dscnt_itm_flg,
						bp1.bp_nm.as("sppl_nm"),
						bp2.bp_nm.as("asppl_nm")
					)
					.from(
						payNtcDHis1
						.leftOuterJoin(trd1).on(
							trd1.trd_cd.eq(payNtcDHis1.trd_cd)
						)
						.leftOuterJoin(itm1).on(
							itm1.itm_cd.eq(payNtcDHis1.itm_cd)
							.and(itm1.itm_sub1.eq(payNtcDHis1.itm_sub1))
							.and(itm1.itm_sub2.eq(payNtcDHis1.itm_sub2))
							.and(itm1.itm_sub3.eq(payNtcDHis1.itm_sub3))
						)
						.leftOuterJoin(unit1).on(
							unit1.unit_cd.eq(payNtcDHis1.trd_unit_cd)
						)
						.leftOuterJoin(tax1).on(
							tax1.tax_cd.eq(payNtcDHis1.tax_cd)
						)
						.leftOuterJoin(sttl1).on(
							sttl1.sttl_cd.eq(payNtcDHis1.ap_sttl_cd)
						)
						.leftOuterJoin(bp1).on(
							bp1.bp_cd.eq(payNtcDHis1.sppl_cd)
						)
						.leftOuterJoin(bp2).on(
							bp2.bp_cd.eq(payNtcDHis1.asppl_cd)
						)
					)
					.where(
						value(0).eq(value(0))
						.and(payNtcDHis1.pay_ntc_his_no.eq(bind("pay_ntc_his_no")))
					)
			);
	}
}
