package mcframe.serverMSBH.MSBHL0180;

import static mcframe.serverCore.queryapi.IFMCSQL.bind;
import static mcframe.serverCore.queryapi.IFMCSQL.sql;
import static mcframe.serverCore.queryapi.IFMCSQL.value;
import static mcframe.serverCore.queryapi.MCQueryExecution.createQueryPlan;

import mcframe.serverCore.queryapi.MCQueryExecution.MCQueryPlan;
import mcframe.serverMA.dbc.MAM_BP_R;
import mcframe.serverMA.dbc.MAM_CUR_R;
import mcframe.serverMA.dbc.MAM_ITM_R;
import mcframe.serverMA.dbc.MAM_TAX_R;
import mcframe.serverMA.dbc.MAM_TRD_R;
import mcframe.serverMA.dbc.MAM_UNIT_R;
import mcframe.serverMS.dbc.MST_BILL_RCPT_D_R;
import mcframe.serverMS.dbc.MST_BILL_RCPT_R;

public class Query_MC {
	
	/**
	 * -- MSBHL0180_MST_BILL_RCPT_Query_S01
	 */
	static MCQueryPlan MSBHL0180_MST_BILL_RCPT_S01() {
		
		MST_BILL_RCPT_R T1 = MST_BILL_RCPT_R.create("T");	// 請求受領ヘッダテーブル
		MAM_BP_R BP = MAM_BP_R.create("BP");				// 取引先マスタ
		MAM_CUR_R CUR = MAM_CUR_R.create("CUR");			// 通貨マスタ
		return
			createQueryPlan()
				.setQuery(
				sql("MSBHL0180_MST_BILL_RCPT_Query_S01")
				.mainQuery()
				.select(
					T1.bill_cl_dt,
					T1.bill_dt,
					T1.bill_no,
					T1.invalid_flg,
					T1.pre_bill_no,
					T1.pre_bill_dt,
					T1.bill_st_dt,
					T1.bill_end_dt,
					T1.iv_no,
					T1.wrk_no,
					T1.wrk_nm,
					T1.bill_src_cd,
					BP.bp_nm.as(Srch01_HdrR.$bill_src_nm),
					T1.bill_src_dpt,
					T1.trd_cur_cd,
					CUR.cur_nm.as(Srch01_HdrR.$trd_cur_nm),
					T1.bill_xrate,
					T1.last_bill_amt,
					T1.rcv_amt,
					T1.sw_amt,
					T1.setoff_amt,
					T1.bfw_amt,
					T1.sls_amt,
					T1.dscnt_amt,
					T1.ret_amt,
					T1.tax_amt,
					T1.sw_to_amt,
					T1.bill_amt,
					T1.adv_amt_bal,
					T1.adv_amt,
					T1.adv_setoff_amt,
					T1.adv_setoff_tax_amt,
					T1.ins_usr_id,
					T1.ins_usr_nm,
					T1.ins_func_id,
					T1.ins_ts,
					T1.upd_usr_id,
					T1.upd_usr_nm,
					T1.upd_func_id,
					T1.upd_ts,
					T1.upd_srv_req_no,
					T1.upd_cntr
				)
				.from(
					T1
					.leftOuterJoin(BP).on(T1.bill_src_cd.eq(BP.bp_cd).and(BP.bsppl_flg.eq(value(true))))
					.leftOuterJoin(CUR).on(T1.trd_cur_cd.eq(CUR.cur_cd))
				)
				.where(
					value(0).eq(value(0))
					.cutoff$and(T1.bill_rcpt_no.eq(bind(Srch01_CndR.$bill_rcpt_no)))
				)
			);
	}
	/**
	 * -- MSBHL0180_MST_BILL_RCPT_D_Query_S02
	 */
	static MCQueryPlan MSBHL0180_MST_BILL_RCPT_D_S02() {

		MST_BILL_RCPT_D_R T1 = MST_BILL_RCPT_D_R.create("T1");		// 請求受領明細テーブル
		MAM_TRD_R TRD = MAM_TRD_R.create("TRD");					// 取引マスタ
		MAM_ITM_R ITM = MAM_ITM_R.create("ITM");					// 品目マスタ
		MAM_UNIT_R UNIT = MAM_UNIT_R.create("UNIT");				// 単位マスタ
		MAM_TAX_R TAX = MAM_TAX_R.create("TAX");					// 税マスタ
		
		return
			createQueryPlan()
				.setQuery(
				sql("MSBHL0180_MST_BILL_RCPT_D_Query_S02")
				.mainQuery()
				.select(
					T1.bill_rcpt_d_no,
					T1.trd_cd,
					TRD.trd_nm,
					T1.ac_dt,
					T1.dlv_dt,
					T1.rcv_dt,
					T1.bill_basis_dt,
					T1.base_ac_dt,
					T1.bill_d_no,
					T1.dlv_slip_no,
					T1.dlv_slip_d_no,
					T1.ship_dlv_slip_no,
					T1.ship_dlv_slip_d_no,
					T1.act_no,
					T1.act_rev,
					T1.act_d_no,
					T1.po_no,
					T1.po_d_no,
					T1.itm_cd,
					T1.itm_sub1,
					T1.itm_sub2,
					T1.itm_sub3,
					ITM.itm_nm,
					T1.sno1,
					T1.sno2,
					T1.sno3,
					T1.sno4,
					T1.trd_unit_cd,
					UNIT.unit_nm.as(Srch01_DtlR.$trd_unit_nm),
					T1.trd_unit_qty,
					T1.trd_cur_upri,
					T1.interim_flg,
					T1.trd_cur_amt,
					(T1.trd_cur_amt.add(T1.trd_cur_tax_amt)).as(Srch01_DtlR.$trd_inc_tax_amt),
					T1.tax_cd,
					TAX.tax_nm,
					T1.tax_rate,
					T1.trd_cur_tax_amt,
					T1.inc_tax_flg,
					T1.trd_cur_dscnt_amt,
					T1.trd_d_rmrks,
					T1.ins_usr_id,
					T1.ins_usr_nm,
					T1.ins_func_id,
					T1.ins_ts,
					T1.upd_usr_id,
					T1.upd_usr_nm,
					T1.upd_func_id,
					T1.upd_ts,
					T1.upd_srv_req_no
				)
				.from(
					T1
					.leftOuterJoin(TRD).on(T1.trd_cd.eq(TRD.trd_cd))
					.leftOuterJoin(ITM).on(
							value(0).eq(value(0))
							.and(T1.itm_cd.eq(ITM.itm_cd))
							.and(T1.itm_sub1.eq(ITM.itm_sub1))
							.and(T1.itm_sub2.eq(ITM.itm_sub2))
							.and(T1.itm_sub3.eq(ITM.itm_sub3))
							)
					.leftOuterJoin(UNIT).on(T1.trd_unit_cd.eq(UNIT.unit_cd))
					.leftOuterJoin(TAX).on(T1.tax_cd.eq(TAX.tax_cd))
				)
				.where(
					T1.bill_rcpt_no.eq(bind(Srch01_CndR.$bill_rcpt_no))
				)
				.orderBy(
					T1.bill_rcpt_d_no.asc()
				)
			);
	}
}