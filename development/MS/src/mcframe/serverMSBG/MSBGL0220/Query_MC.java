package mcframe.serverMSBG.MSBGL0220;

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
	 * -- MSBGL0220_MST_AR_APPL_SCHD_Query_S01
	 */
	static MCQueryPlan MSBGL0220_MST_AR_APPL_SCHD_S01() {
		MST_AR_APPL_SCHD_R S0_T1 = MST_AR_APPL_SCHD_R.create("T1");
		MST_BILL_ACST_R S0_T2 = MST_BILL_ACST_R.create("T2");
		MST_BILL_R S0_T3 = MST_BILL_R.create("T3");
		MST_BILL_D_R S0_T4 = MST_BILL_D_R.create("T4");
		MST_BILL_D_APPL_BAL_R S0_T5 = MST_BILL_D_APPL_BAL_R.create("T5");
		MST_BILL_D_R S0_T6 = MST_BILL_D_R.create("T6");
		MST_BILL_D_APPL_ACT_R S0_T7 = MST_BILL_D_APPL_ACT_R.create("T7");
		MAM_BP_R DLV = MAM_BP_R.create("DLV");
		MAM_DPT_R S0_M9 = MAM_DPT_R.create("M9");
		MAM_ITM_R S0_M12 = MAM_ITM_R.create("M12");
		MAM_BP_R S0_M13 = MAM_BP_R.create("M13");
		MST_BILL_D_APPL_ACT_R S1_TT1 = MST_BILL_D_APPL_ACT_R.create("TT1");
		MST_BILL_D_APPL_ACT_R S2_TT2 = MST_BILL_D_APPL_ACT_R.create("TT2");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBGL0220_MST_AR_APPL_SCHD_Query_S01")
					.mainQuery()
					.select(
						S0_T6.ac_ym,
						S0_T6.ac_dt,
						S0_T6.slip_sts_typ,
						S0_T6.trd_cd,
						S0_T5.appl_tgt_amt.as("appl_tgt_amt"),
						S0_T5.appl_amt.as("ttl_appl_amt"),
						nvl(
							S0_T7.appl_amt,
							value(0)
						).as("appl_amt"),
						S0_T5.not_appl_bal.as("not_appl_amt"),
						S0_T6.ar_typ,
						S0_T6.dlv_dt,
						S0_T3.bill_cl_dt.as("bill_ym"),
						MSPA_AR_UTIL$F_GET_BILL_CL_DAY(
							S0_T3.bill_cl_dt,
							nvl(
								S0_T3.bill_cl_typ,
								S0_M13.bill_cl_typ
							),
							S0_T3.bill_each_sls_flg
						).as("bill_cl_day"),
						S0_T3.bill_each_sls_flg,
						S0_T6.slip_sts_typ,
						S0_T3.bill_dt,
						S0_T3.bill_no,
						S0_T6.act_no,
						S0_T6.act_seq,
						S0_T6.act_rev,
						S0_T6.act_d_no,
						S0_T6.act_d_seq,
						S0_T6.itm_cd,
						S0_T6.itm_sub1,
						S0_T6.itm_sub2,
						S0_T6.itm_sub3,
						nvl(
							S0_T6.itm_nm,
							S0_M12.itm_nm
						).as("itm_nm"),
						S0_T6.sundry_itm_flg,
						S0_T6.sno1,
						S0_T6.sno2,
						S0_T6.sno3,
						S0_T6.sno4,
						S0_T6.trd_unit_cd,
						S0_T6.trd_unit_qty,
						S0_T6.trd_cur_upri,
						S0_T6.trd_cur_amt,
						S0_T6.tax_cd,
						S0_T6.trd_cur_tax_amt,
						S0_T6.trd_cur_dscnt_amt,
						S0_T6.cst_cd,
						S0_T6.dlv_cd,
						nvl(
								S0_T6.dlv_nm,
								DLV.bp_nm
							).as("dlv_nm"),
						S0_T6.dest_cd1,
						S0_T6.dest_cd2,
						S0_T6.dest_cd3,
						S0_T6.sls_dpt_cd,
						S0_M9.dpt_nm.as("sls_dpt_nm"),
						S0_T6.sls_usr_cd,
						S0_T6.slo_no,
						S0_T6.slo_d_no,
						S0_T6.cst_po_no,
						S0_T6.cst_po_d_no,
						S0_T6.dlv_slip_no,
						S0_T6.dlv_slip_d_no,
						S0_T6.ship_dlv_slip_no,
						S0_T6.ship_dlv_slip_d_no,
						S0_T6.ship_dlv_slip_multi_flg,
						S0_T6.wrk_no,
						S0_T4.ac_ym.as("arsw_ac_ym"),
						S0_T4.ac_dt.as("arsw_ac_dt"),
						S0_T4.trd_cd.as("arsw_trd_cd"),
						S0_T4.act_no.as("arsw_act_no"),
						S0_T4.act_d_no.as("arsw_act_d_no"),
						S0_T5.bill_d_no,
						S0_T5.parent_bill_d_no,
						S0_T3.bill_mng_no,
						S0_T4.upd_cntr.as("bill_d_upd_cntr"),
						S0_T5.upd_cntr.as("bill_d_appl_bal_upd_cntr"),
						S0_T4.trd_ptn_typ.as("arsw_trd_ptn_typ"),
						S0_T6.trd_ptn_typ,
						S0_M12.dscnt_itm_flg
					)
					.from(
						S0_T1
						.innerJoin(S0_T2).on(S0_T1.bill_acst_no.eq(S0_T2.bill_acst_no))
						.innerJoin(S0_T3).on(S0_T2.bill_mng_no.eq(S0_T3.bill_mng_no))
						.innerJoin(S0_T4).on(
							S0_T2.bill_acst_no.eq(S0_T4.bill_acst_no)
							.and(S0_T1.iv_no.eq(S0_T4.iv_no))
						)
						.innerJoin(S0_T5).on(S0_T4.bill_d_no.eq(S0_T5.bill_d_no))
						.innerJoin(S0_T6).on(S0_T5.parent_bill_d_no.eq(S0_T6.bill_d_no))
						.leftOuterJoin(S0_T7).on(
							S0_T5.bill_d_no.eq(S0_T7.bill_d_no)
							.and(S0_T5.parent_bill_d_no.eq(S0_T7.parent_bill_d_no))
							.and(S0_T7.rcv_act_d_no.eq(bind("rcv_act_d_no")))
						)
						.leftOuterJoin(DLV).on(
								S0_T6.dlv_cd.eq(DLV.bp_cd)
						)
						.leftOuterJoin(S0_M9).on(
							S0_T6.sls_dpt_cd.eq(S0_M9.dpt_cd)
							.and(S0_T6.ac_dt.between(S0_M9.st_dt, S0_M9.end_dt))
						)
						.leftOuterJoin(S0_M12).on(
							S0_T6.itm_cd.eq(S0_M12.itm_cd)
							.and(S0_T6.itm_sub1.eq(S0_M12.itm_sub1))
							.and(S0_T6.itm_sub2.eq(S0_M12.itm_sub2))
							.and(S0_T6.itm_sub3.eq(S0_M12.itm_sub3))
						)
						.leftOuterJoin(S0_M13).on(
							bracket(
								S0_T3.bcst_cd.eq(S0_M13.bp_cd)
							)
						)
					)
					.where(
						value(0).eq(value(0))
						.and(S0_T1.ar_appl_schd_no.eq(bind("ar_appl_schd_no")))
						.and(
							notExists(
								subQuery()
								.select(value("X"))
								.from(S1_TT1)
								.where(
									value(0).eq(value(0))
									.and(S1_TT1.rcv_act_d_no.eq(bind("rcv_act_d_no")))
									.and(S0_T5.parent_bill_d_no.eq(S1_TT1.parent_bill_d_no))
									.and(S0_T5.bill_d_no.eq(S1_TT1.bill_d_no))
									.and(S1_TT1.appl_amt.neq(value(0)))
								)
							)
							.and(
								S0_T3.bill_cl_sts_typ.neq(value(MSC_BILL_CL_STS_TYP.NOT_BILL.value()))
								.or(S0_T3.bill_cl_sts_typ.eq(value(MSC_BILL_CL_STS_TYP.NOT_BILL.value())))
								.and(bind("inc_not_bill_flg").eq(value(true)))
							)
							.cutoff$and(
								bracket(
									S0_T6.slo_no.eq(bind("slo_no"))
									.or(bind("inc_otr_slo_flg").eq(value(true)))
								)
							)
							.and(S0_T5.not_appl_bal.neq(value(0)))
							.cutoff$and(S0_T6.ac_dt.gte(bind("ac_dt_fr")))
							.cutoff$and(S0_T6.ac_dt.lte(bind("ac_dt_to")))
							.or(
								exists(
									subQuery()
									.select(value("X"))
									.from(S2_TT2)
									.where(
										value(0).eq(value(0))
										.and(S2_TT2.rcv_act_d_no.eq(bind("rcv_act_d_no")))
										.and(S0_T5.parent_bill_d_no.eq(S2_TT2.parent_bill_d_no))
										.and(S0_T5.bill_d_no.eq(S2_TT2.bill_d_no))
										.and(S2_TT2.appl_amt.neq(value(0)))
									)
								)
							)
						)
					)
			)
			.setJoinInfo(
				joinInfo(
					j -> j
						.add(MAM_TRD_R.class, r -> toCondition(
							r.getStringNE("trd_cd")
						))
						.addSelect(m -> toArray(
							m.trd_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("trd_nm", m.trd_nm());
					}),
					j -> j
						.add(MAM_UNIT_R.class, r -> toCondition(
							r.getStringNE("trd_unit_cd")
						))
						.addSelect(m -> toArray(
							m.dec_place,
							m.unit_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("trd_unit_nm", m.unit_nm());
							r.setNumberNE("qty_dec_place", m.dec_place());
					}),
					j -> j
						.add(MAM_TAX_R.class, r -> toCondition(
							r.getStringNE("tax_cd")
						))
						.addSelect(m -> toArray(
							m.inc_tax_flg,
							m.tax_nm,
							m.tax_rate
						))
						.addMap((r, m) -> {
							r.setBooleanNE("inc_tax_flg", m.inc_tax_flg());
							r.setStringNE("tax_nm", m.tax_nm());
							r.setNumberNE("tax_rate", m.tax_rate());
					}),
					j -> j
						.add(MAM_BP_R.class, r -> toCondition(
							r.getStringNE("cst_cd")
						))
						.addSelect(m -> toArray(
							m.bp_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("cst_nm", m.bp_nm());
					}),
					j -> j
						.add(MAM_BP_R.class, r -> toCondition(
							r.getStringNE("dest_cd1")
						))
						.addSelect(m -> toArray(
							m.bp_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("dest_nm1", m.bp_nm());
					}),
					j -> j
						.add(MAM_BP_R.class, r -> toCondition(
							r.getStringNE("dest_cd2")
						))
						.addSelect(m -> toArray(
							m.bp_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("dest_nm2", m.bp_nm());
					}),
					j -> j
						.add(MAM_BP_R.class, r -> toCondition(
							r.getStringNE("dest_cd3")
						))
						.addSelect(m -> toArray(
							m.bp_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("dest_nm3", m.bp_nm());
					}),
					j -> j
						.add(MAM_USR_R.class, r -> toCondition(
							r.getStringNE("sls_usr_cd")
						))
						.addSelect(m -> toArray(
							m.usr_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("sls_usr_nm", m.usr_nm());
					}),
					j -> j
						.add(MST_WRK_R.class, r -> toCondition(
							r.getStringNE("wrk_no")
						))
						.addSelect(m -> toArray(
							m.wrk_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("wrk_nm", m.wrk_nm());
					}),
					j -> j
						.add(MAM_TRD_R.class, r -> toCondition(
							r.getStringNE("arsw_trd_cd")
						))
						.addSelect(m -> toArray(
							m.trd_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("arsw_trd_nm", m.trd_nm());
					})
				)
			);
	}
	
	/**
	 * -- MSBGL0220_MST_RCV_ACT_D_Query_S01
	 */
	static MCQueryPlan MSBGL0220_MST_RCV_ACT_D_S01() {
		MST_RCV_ACT_D_R S0_T1 = MST_RCV_ACT_D_R.create("T1");
		MST_RCV_ACT_R S0_T2 = MST_RCV_ACT_R.create("T2");
		MST_BILL_D_APPL_ACT_R S0_T3 = MST_BILL_D_APPL_ACT_R.create("T3");
		MST_RCV_R S0_T4 = MST_RCV_R.create("T4");
		MAM_TRD_R S0_M1 = MAM_TRD_R.create("M1");
		MAM_STTL_R S0_M2 = MAM_STTL_R.create("M2");
		MAM_BP_R S0_M3 = MAM_BP_R.create("M3");
		MAM_BP_R S0_M4 = MAM_BP_R.create("M4");
		MAM_DPT_R S0_M5 = MAM_DPT_R.create("M5");
		MAM_BP_R S0_M6 = MAM_BP_R.create("M6");
		MAM_DPT_R S0_M7 = MAM_DPT_R.create("M7");
		MAM_WG_R S0_M8 = MAM_WG_R.create("M8");
		MST_WRK_R S0_T6 = MST_WRK_R.create("T6");
		MAM_CUR_R S0_M9 = MAM_CUR_R.create("M9");
		MAVM_RD_DPT_R S0_M10 = MAVM_RD_DPT_R.create("M10");
		MST_RCV_ACT_D_R S1_TT1 = MST_RCV_ACT_D_R.create("TT1");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBGL0220_MST_RCV_ACT_D_Query_S01")
					.mainQuery()
					.select(
						S0_T2.rcv_dt,
						S0_T2.ac_ym,
						S0_T2.ac_dt,
						S0_T2.trd_cd,
						S0_M1.trd_nm,
						S0_M1.trd_ptn_typ,
						S0_T4.slo_no,
						S0_T1.iv_no,
						S0_T2.ar_sttl_cd1.as("rcv_mtd_cd"),
						S0_M2.sttl_nm.as("rcv_mtd_nm"),
						S0_T2.rcst_cd,
						S0_M3.bp_nm.as("rcst_nm"),
						S0_T1.bcst_cd,
						S0_M4.bp_nm.as("bcst_nm"),
						S0_T1.bill_dpt_cd,
						S0_M5.dpt_nm.as("bill_dpt_nm"),
						S0_T1.acst_cd,
						S0_M6.bp_nm.as("acst_nm"),
						S0_T1.ar_dpt_cd,
						S0_M7.dpt_nm.as("ar_dpt_nm"),
						S0_M7.wg_cd,
						S0_M8.wg_nm,
						S0_T1.wrk_no,
						S0_T6.wrk_nm,
						S0_T1.ar_typ,
						S0_T2.trd_cur_cd,
						S0_M9.cur_nm.as("trd_cur_nm"),
						S0_M9.amt_dec_place,
						S0_M9.upri_dec_place,
						bracket(
							S0_T1.trd_cur_amt1.add(S0_T1.trd_cur_amt2).add(S0_T1.trd_cur_amt3)
						).as("appl_tgt_amt"),
						nvl(
							sum(S0_T3.appl_amt),
							value(0)
						).as("ttl_appl_amt"),
						bracket(
							bracket(
								S0_T1.trd_cur_amt1.add(S0_T1.trd_cur_amt2).add(S0_T1.trd_cur_amt3)
							).subtract(
								nvl(
									sum(S0_T3.appl_amt),
									value(0)
								)
							)
						).as("not_appl_amt"),
						S0_T2.slip_sts_typ,
						S0_T1.rcv_act_d_no,
						S0_T1.rcv_act_d_seq,
						S0_T2.rcv_act_no,
						S0_T2.rcv_act_seq,
						S0_T2.upd_cntr.as("rcv_act_upd_cntr"),
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
						.innerJoin(S0_T2).on(
							S0_T1.rcv_act_no.eq(S0_T2.rcv_act_no)
							.and(S0_T1.rcv_act_seq.eq(S0_T2.rcv_act_seq))
						)
						.leftOuterJoin(S0_T3).on(S0_T1.rcv_act_d_no.eq(S0_T3.rcv_act_d_no))
						.leftOuterJoin(S0_T4).on(S0_T2.rcv_no.eq(S0_T4.rcv_no))
						.leftOuterJoin(S0_M1).on(S0_T2.trd_cd.eq(S0_M1.trd_cd))
						.leftOuterJoin(S0_M2).on(S0_T2.ar_sttl_cd1.eq(S0_M2.sttl_cd))
						.leftOuterJoin(S0_M3).on(S0_T2.rcst_cd.eq(S0_M3.bp_cd))
						.leftOuterJoin(S0_M4).on(S0_T1.bcst_cd.eq(S0_M4.bp_cd))
						.leftOuterJoin(S0_M5).on(
							S0_T1.bill_dpt_cd.eq(S0_M5.dpt_cd)
							.and(S0_T2.ac_dt.between(S0_M5.st_dt, S0_M5.end_dt))
						)
						.leftOuterJoin(S0_M6).on(S0_T1.acst_cd.eq(S0_M6.bp_cd))
						.leftOuterJoin(S0_M7).on(
							S0_T1.ar_dpt_cd.eq(S0_M7.dpt_cd)
							.and(S0_T2.ac_dt.between(S0_M7.st_dt, S0_M7.end_dt))
						)
						.leftOuterJoin(S0_M8).on(S0_M7.wg_cd.eq(S0_M8.wg_cd))
						.leftOuterJoin(S0_T6).on(S0_T1.wrk_no.eq(S0_T6.wrk_no))
						.leftOuterJoin(S0_M9).on(S0_T2.trd_cur_cd.eq(S0_M9.cur_cd))
						.innerJoin(S0_M10).on(S0_T1.ar_dpt_cd.eq(S0_M10.dpt_cd))
					)
					.where(
						value(0).eq(value(0))
						.and(S0_T1.rcv_act_d_no.eq(bind("rcv_act_d_no")))
						.and(
							S0_T1.rcv_act_d_seq.eq(subQuery()
								.select(max(S1_TT1.rcv_act_d_seq))
								.from(S1_TT1)
								.where(
									S1_TT1.rcv_act_d_no.eq(bind("rcv_act_d_no"))
								)
							)
						)
					)
					.groupBy(
						S0_T2.rcv_dt,
						S0_T2.ac_ym,
						S0_T2.ac_dt,
						S0_T2.trd_cd,
						S0_M1.trd_nm,
						S0_M1.trd_ptn_typ,
						S0_T4.slo_no,
						S0_T1.iv_no,
						S0_T2.ar_sttl_cd1,
						S0_M2.sttl_nm,
						S0_T2.rcst_cd,
						S0_M3.bp_nm,
						S0_T1.bcst_cd,
						S0_M4.bp_nm,
						S0_T1.bill_dpt_cd,
						S0_M5.dpt_nm,
						S0_T1.acst_cd,
						S0_M6.bp_nm,
						S0_T1.ar_dpt_cd,
						S0_M7.dpt_nm,
						S0_M7.wg_cd,
						S0_M8.wg_nm,
						S0_T1.wrk_no,
						S0_T6.wrk_nm,
						S0_T1.ar_typ,
						S0_T2.trd_cur_cd,
						S0_M9.cur_nm,
						S0_M9.amt_dec_place,
						S0_M9.upri_dec_place,
						S0_T1.trd_cur_amt1,
						S0_T1.trd_cur_amt2,
						S0_T1.trd_cur_amt3,
						S0_T2.slip_sts_typ,
						S0_T1.rcv_act_d_no,
						S0_T1.rcv_act_d_seq,
						S0_T2.rcv_act_no,
						S0_T2.rcv_act_seq,
						S0_T2.upd_cntr,
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
			);
	}
}