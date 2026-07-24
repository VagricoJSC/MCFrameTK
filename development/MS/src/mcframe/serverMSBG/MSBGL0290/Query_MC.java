package mcframe.serverMSBG.MSBGL0290;

import static mcframe.serverCore.queryapi.IFMCSQL.*;
import static mcframe.serverCore.queryapi.MCQueryExecution.*;

import mcframe.serverMA.dbc.*;
import mcframe.serverMS.dbc.*;

public class Query_MC {

	/**
	 * -- MSBGL0290_MST_BILL_HIS_Query_S01
	 */
	static MCQueryPlan MSBGL0290_MST_BILL_HIS_S01() {
		
		MST_BILL_HIS_R billHis1 = MST_BILL_HIS_R.create("billHis1");
		MST_WRK_R wrk1 = MST_WRK_R.create("wrk1");
		MAM_BP_R bp1 = MAM_BP_R.create("bp1");
		MAM_CUR_R cur1 = MAM_CUR_R.create("cur1");
		MAVM_RD_DPT_R rdDpt1 = MAVM_RD_DPT_R.create("rdDpt1");
		MAM_DPT_R dpt1 = MAM_DPT_R.create("dpt1");
		MST_BILL_R bill1 = MST_BILL_R.create("bill1");
		MAM_WG_R wg1 = MAM_WG_R.create("wg1");
		
		return createQueryPlan()
			.setQuery(
				sql("MSBGL0290_MST_BILL_HIS_Query_S01")
					.mainQuery()
					.select(
						billHis1.bill_his_no,
						billHis1.bill_no,
						billHis1.bill_rev,
						billHis1.latest_flg,
						billHis1.can_flg,
						billHis1.bill_cl_dt,
						bill1.bill_dt,
						billHis1.bill_each_sls_flg,
						billHis1.iv_no,
						billHis1.wrk_no,
						billHis1.bcst_cd,
						billHis1.bill_dpt_cd,
						bill1.wg_cd,
						wg1.wg_nm,
						billHis1.bill_xrate,
						billHis1.trd_cur_cd,
						billHis1.last_bill_amt,
						billHis1.rcv_amt,
						billHis1.sw_amt,
						billHis1.bfw_amt,
						billHis1.sls_amt,
						billHis1.dscnt_amt,
						billHis1.ret_amt,
						billHis1.setoff_amt,
						billHis1.tax_amt,
						billHis1.sw_to_amt,
						billHis1.bill_amt,
						billHis1.adv_amt_bal,
						billHis1.adv_amt,
						billHis1.adv_setoff_amt,
						billHis1.adv_setoff_tax_amt,
						billHis1.sub_char1,
						billHis1.sub_char2,
						billHis1.sub_char3,
						billHis1.ins_usr_id,
						billHis1.ins_usr_nm,
						billHis1.ins_func_id,
						billHis1.upd_usr_id,
						billHis1.upd_usr_nm,
						billHis1.upd_func_id,
						billHis1.ins_ts,
						billHis1.upd_ts,
						billHis1.upd_srv_req_no,
						wrk1.wrk_nm,
						bill1.edi_flg,
						bp1.bp_nm.as("bcst_nm"),
						dpt1.dpt_nm.as("bill_dpt_nm"),
						cur1.cur_nm.as("trd_cur_nm")
					)
					.from(
						billHis1
						.leftOuterJoin(wrk1).on(
							wrk1.wrk_no.eq(billHis1.wrk_no)
						)
						.leftOuterJoin(bp1).on(
							bp1.bp_cd.eq(billHis1.bcst_cd)
						)
						.leftOuterJoin(bill1).on(
							bill1.bill_no.eq(billHis1.bill_no)
						)
						.leftOuterJoin(dpt1).on(
							dpt1.dpt_cd.eq(bill1.bill_dpt_cd)
							.and(bill1.base_dt.between(dpt1.st_dt, dpt1.end_dt))
						)
						.leftOuterJoin(cur1).on(
							cur1.cur_cd.eq(billHis1.trd_cur_cd)
						)
						.innerJoin(rdDpt1).on(
							rdDpt1.dpt_cd.eq(billHis1.bill_dpt_cd)
						)
						.leftOuterJoin(wg1).on(
							wg1.wg_cd.eq(bill1.wg_cd)
						)
					)
					.where(
						value(0).eq(value(0))
						.and(billHis1.bill_no.eq(bind("bill_no")))
						.cutoff$and(billHis1.bill_rev.eq(bind("bill_rev")))
						.cutoff$and(billHis1.latest_flg.eq(bind("latest_flg_str")))
					)
			);
	}

	/**
	 * -- MSBGL0290_MST_BILL_D_HIS_Query_S01
	 */
	static MCQueryPlan MSBGL0290_MST_BILL_D_HIS_S01() {
		MST_BILL_D_HIS_R billDHis1 = MST_BILL_D_HIS_R.create("billDHis1");
		MAM_TRD_R trd1 = MAM_TRD_R.create("trd1");
		MAM_ITM_R itm1 = MAM_ITM_R.create("itm1");
		MAM_TAX_R tax1 = MAM_TAX_R.create("tax1");
		MAM_UNIT_R unit1 = MAM_UNIT_R.create("unit1");
		MAM_STTL_R sttl1 = MAM_STTL_R.create("sttl1");
		MAM_BP_R bp1 = MAM_BP_R.create("bp1");
		MAM_BP_R bp2 = MAM_BP_R.create("bp2");

		return createQueryPlan()
			.setQuery(
				sql("MSBGL0290_MST_BILL_D_HIS_Query_S01")
					.mainQuery()
					.select(
						billDHis1.trd_cd,
						billDHis1.slip_sts_typ,
						billDHis1.bill_d_his_typ,
						billDHis1.act_no,
						billDHis1.act_seq,
						billDHis1.act_rev,
						billDHis1.act_d_no,
						billDHis1.act_d_seq,
						billDHis1.rcv_mtd_cd,
						billDHis1.cst_cd,
						billDHis1.dlv_cd,
						billDHis1.dlv_dt,
						billDHis1.base_sls_ac_dt,
						billDHis1.rcv_dt,
						billDHis1.itm_cd,
						billDHis1.itm_sub1,
						billDHis1.itm_sub2,
						billDHis1.itm_sub3,
						decode(
							billDHis1.sundry_itm_flg,
							value(true),
							billDHis1.itm_nm,
							itm1.itm_nm
						).as("itm_nm"),
						billDHis1.sundry_itm_flg,
						billDHis1.cst_itm_cd,
						billDHis1.cst_itm_nm,
						billDHis1.trd_unit_cd,
						billDHis1.trd_unit_qty,
						billDHis1.trd_cur_upri,
						billDHis1.trd_cur_amt,
						billDHis1.trd_cur_dscnt_amt,
						billDHis1.interim_flg,
						billDHis1.base_cur_upri,
						billDHis1.base_cur_amt,
						billDHis1.base_cur_tax_amt,
						billDHis1.base_cur_dscnt_amt,
						billDHis1.tax_cd,
						billDHis1.trd_cur_tax_amt,
						billDHis1.trd_d_rmrks,
						billDHis1.bill_d_rmrks,
						billDHis1.dlv_slip_no,
						billDHis1.dlv_slip_d_no,
						billDHis1.ship_dlv_slip_no,
						billDHis1.ship_dlv_slip_d_no,
						billDHis1.ship_dlv_slip_multi_flg,
						billDHis1.bill_mtd_typ,
						billDHis1.sub_char1,
						billDHis1.sub_char2,
						billDHis1.sub_char3,
						billDHis1.ins_usr_id,
						billDHis1.ins_usr_nm,
						billDHis1.ins_func_id,
						billDHis1.upd_usr_id,
						billDHis1.upd_usr_nm,
						billDHis1.upd_func_id,
						billDHis1.ins_ts,
						billDHis1.upd_ts,
						billDHis1.upd_srv_req_no,
						trd1.trd_ptn_typ,
						trd1.trd_nm,
						sttl1.sttl_nm,
						tax1.tax_nm,
						tax1.inc_tax_flg,
						tax1.tax_rate,
						unit1.unit_nm,
						itm1.dscnt_itm_flg,
						bp1.bp_nm.as("cst_nm"),
						bp2.bp_nm.as("dlv_nm")
					)
					.from(
						billDHis1
						.leftOuterJoin(trd1).on(
							trd1.trd_cd.eq(billDHis1.trd_cd)
						)
						.leftOuterJoin(sttl1).on(
							sttl1.sttl_cd.eq(billDHis1.rcv_mtd_cd)
						)
						.leftOuterJoin(itm1).on(
							itm1.itm_cd.eq(billDHis1.itm_cd)
							.and(itm1.itm_sub1.eq(billDHis1.itm_sub1))
							.and(itm1.itm_sub2.eq(billDHis1.itm_sub2))
							.and(itm1.itm_sub3.eq(billDHis1.itm_sub3))
						)
						.leftOuterJoin(tax1).on(
							tax1.tax_cd.eq(billDHis1.tax_cd)
						)
						.leftOuterJoin(unit1).on(
							unit1.unit_cd.eq(billDHis1.trd_unit_cd)
						)
						.leftOuterJoin(bp1).on(
							bp1.bp_cd.eq(billDHis1.cst_cd)
						)
						.leftOuterJoin(bp2).on(
							bp2.bp_cd.eq(billDHis1.dlv_cd)
						)
					)
					.where(
						value(0).eq(value(0))
						.and(billDHis1.bill_his_no.eq(bind("bill_his_no")))
					)
			);
	}
}
