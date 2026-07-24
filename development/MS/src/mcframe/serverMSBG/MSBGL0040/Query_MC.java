package mcframe.serverMSBG.MSBGL0040;

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
	 * -- MSBGL0040_MST_BILL_D_Query_S01
	 */
	static MCQueryPlan MSBGL0040_MST_BILL_D_S01() {
		MST_BILL_D_R S0_T1 = MST_BILL_D_R.create("T1");
		MST_BILL_R S0_T2 = MST_BILL_R.create("T2");
		MAM_DPT_R S0_M5 = MAM_DPT_R.create("M5");
		MAM_ITM_R S0_M10 = MAM_ITM_R.create("M10");
		MAM_BP_R S0_M11 = MAM_BP_R.create("M11");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBGL0040_MST_BILL_D_Query_S01")
					.mainQuery()
					.select(
						S0_T1.bill_d_typ,
						S0_T1.ac_ym,
						S0_T1.ac_dt,
						S0_T1.slip_sts_typ,
						S0_T1.trd_cd,
						S0_T1.ar_typ,
						S0_T1.base_sls_ac_dt,
						S0_T1.act_no,
						S0_T1.act_rev,
						S0_T1.act_seq,
						S0_T1.act_d_no,
						S0_T1.act_d_seq,
						S0_T1.dlv_dt,
						S0_T1.bill_basis_dt,
						S0_T1.bill_crryovr_times,
						S0_T1.itm_cd,
						S0_T1.itm_sub1,
						S0_T1.itm_sub2,
						S0_T1.itm_sub3,
						nvl(
							S0_T1.itm_nm,
							S0_M10.itm_nm
						).as("itm_nm"),
						S0_T1.cst_itm_cd,
						S0_T1.cst_itm_nm,
						S0_T1.sno1,
						S0_T1.sno2,
						S0_T1.sno3,
						S0_T1.sno4,
						S0_M10.dscnt_itm_flg,
						S0_T1.trd_unit_cd,
						S0_T1.trd_unit_qty,
						S0_T1.interim_flg,
						S0_T1.trd_cur_upri,
						S0_T1.trd_cur_amt,
						bracket(
							S0_T1.trd_cur_amt.add(S0_T1.trd_cur_tax_amt)
						).as("trd_inc_tax_amt"),
						S0_T1.tax_cd,
						S0_T1.trd_cur_tax_amt,
						S0_T1.trd_cur_dscnt_amt,
						S0_T1.xrate,
						S0_T1.base_cur_amt,
						S0_T1.base_cur_dscnt_amt,
						S0_T1.base_cur_tax_amt,
						S0_T1.base_cur_upri,
						S0_T1.cst_cd,
						S0_T1.dlv_cd,
						nvl(
							S0_T1.dlv_nm,
							S0_M11.bp_nm
						).as("dlv_nm"),
						S0_T1.dest_cd1,
						S0_T1.dest_cd2,
						S0_T1.dest_cd3,
						S0_T1.sls_usr_cd,
						S0_T1.sls_dpt_cd,
						S0_M5.dpt_nm.as("sls_dpt_nm"),
						S0_T1.slo_no,
						S0_T1.slo_d_no,
						S0_T1.cst_po_no,
						S0_T1.cst_po_d_no,
						S0_T1.dlv_slip_no,
						S0_T1.dlv_slip_d_no,
						S0_T1.ship_dlv_slip_no,
						S0_T1.ship_dlv_slip_d_no,
						S0_T1.ship_dlv_slip_multi_flg,
						S0_T2.wrk_no,
						S0_T1.wrk_no.as("sls_wrk_no"),
						S0_T1.trd_d_rmrks,
						S0_T1.bill_d_rmrks,
						S0_T1.bill_d_no,
						S0_T1.rcv_dt,
						S0_T1.ins_usr_id,
						S0_T1.ins_usr_nm,
						S0_T1.ins_func_id,
						S0_T1.ins_ts,
						S0_T1.upd_usr_id,
						S0_T1.upd_usr_nm,
						S0_T1.upd_func_id,
						S0_T1.upd_ts,
						S0_T1.upd_srv_req_no,
						S0_T1.upd_cntr,
						S0_T2.bill_mng_no
					)
					.from(
						S0_T1
						.innerJoin(S0_T2).on(
							bracket(
								S0_T1.bill_mng_no.eq(S0_T2.bill_mng_no)
							)
						)
						.leftOuterJoin(S0_M5).on(
							bracket(
								S0_T1.sls_dpt_cd.eq(S0_M5.dpt_cd)
								.and(S0_T1.ac_dt.between(S0_M5.st_dt, S0_M5.end_dt))
							)
						)
						.leftOuterJoin(S0_M10).on(
							bracket(
								S0_T1.itm_cd.eq(S0_M10.itm_cd)
								.and(S0_T1.itm_sub1.eq(S0_M10.itm_sub1))
								.and(S0_T1.itm_sub2.eq(S0_M10.itm_sub2))
								.and(S0_T1.itm_sub3.eq(S0_M10.itm_sub3))
							)
						)
						.leftOuterJoin(S0_M11).on(
							bracket(
								S0_T1.dlv_cd.eq(S0_M11.bp_cd)
							)
						)
					)
					.where(
						value(0).eq(value(0))
						.and(S0_T1.bill_mng_no.eq(bind("bill_mng_no")))
						.and(S0_T1.bill_d_typ.eq(bind("bill_d_typ")))
						.and(S0_T1.valid_flg.eq(value(true)))
					)
					.orderBy(
						S0_T1.ac_dt.asc(),
						S0_T1.act_no.asc(),
						S0_T1.act_seq.asc(),
						S0_T1.act_d_no.asc()
					)
			)
			.setJoinInfo(
				joinInfo(
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
						.add(MST_WRK_R.class, r -> toCondition(
							r.getStringNE("sls_wrk_no")
						))
						.addSelect(m -> toArray(
							m.wrk_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("sls_wrk_nm", m.wrk_nm());
					}),
					j -> j
						.add(MAM_TRD_R.class, r -> toCondition(
							r.getStringNE("trd_cd")
						))
						.addSelect(m -> toArray(
							m.trd_nm,
							m.trd_ptn_typ
						))
						.addMap((r, m) -> {
							r.setStringNE("trd_nm", m.trd_nm());
							r.setStringNE("trd_ptn_typ", m.trd_ptn_typ());
					}),
					j -> j
						.add(MAM_UNIT_R.class, r -> toCondition(
							r.getStringNE("trd_unit_cd")
						))
						.addSelect(m -> toArray(
							m.unit_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("trd_unit_nm", m.unit_nm());
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
						.add(MAM_TAX_R.class, r -> toCondition(
							r.getStringNE("tax_cd")
						))
						.addSelect(m -> toArray(
							m.inc_tax_flg,
							m.tax_nm,
							m.tax_rate,
							m.tax_typ
						))
						.addMap((r, m) -> {
							r.setBooleanNE("inc_tax_flg", m.inc_tax_flg());
							r.setStringNE("tax_nm", m.tax_nm());
							r.setStringNE("tax_typ", m.tax_typ());
							r.setNumberNE("tax_rate", m.tax_rate());
					})
				)
			);
	}
	
	/**
	 * -- MSBGL0040_MST_BILL_D_Query_S02
	 */
	static MCQueryPlan MSBGL0040_MST_BILL_D_S02() {
		MST_BILL_D_R S0_T1 = MST_BILL_D_R.create("T1");
		MST_BILL_R S0_T2 = MST_BILL_R.create("T2");
		MST_BILL_ACST_R S0_T3 = MST_BILL_ACST_R.create("T3");
		MST_BILL_D_APPL_BAL_R S1_TB1 = MST_BILL_D_APPL_BAL_R.create("TB1");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBGL0040_MST_BILL_D_Query_S02")
					.mainQuery()
					.select(
						S0_T1.trd_cd,
						S0_T1.act_no,
						S0_T1.act_seq,
						S0_T1.act_rev,
						S0_T1.act_d_no,
						S0_T1.act_d_seq,
						S0_T2.trd_cur_cd,
						S0_T1.bill_mng_no,
						S0_T1.ar_trd_grp_typ,
						S0_T1.trd_ptn_typ,
						S0_T1.rcv_typ,
						S0_T1.rcv_mtd_cd,
						S0_T2.bcst_cd,
						S0_T3.acst_cd,
						S0_T1.cst_cd,
						S0_T1.dlv_cd,
						S0_T1.dlv_nm,
						S0_T1.dlv_sundry_flg,
						S0_T1.dest_cd1,
						S0_T1.dest_cd2,
						S0_T1.dest_cd3,
						S0_T1.ac_dt,
						S0_T1.ac_ym,
						S0_T1.dlv_dt,
						S0_T1.bill_basis_dt,
						S0_T1.rcv_dt,
						S0_T1.bill_crryovr_times,
						S0_T3.ar_dpt_cd,
						S0_T1.sls_dpt_cd,
						S0_T2.bill_dpt_cd,
						S0_T1.sls_usr_cd,
						S0_T1.dlv_slip_no,
						S0_T1.iv_no,
						S0_T1.slo_no,
						S0_T1.slo_d_no,
						S0_T1.cst_po_no,
						S0_T1.cst_po_d_no,
						S0_T1.itm_cd,
						S0_T1.itm_sub1,
						S0_T1.itm_sub2,
						S0_T1.itm_sub3,
						S0_T1.sno1,
						S0_T1.sno2,
						S0_T1.sno3,
						S0_T1.sno4,
						S0_T1.itm_nm,
						S0_T1.sundry_itm_flg,
						S0_T1.cst_itm_cd,
						S0_T1.cst_itm_nm,
						S0_T1.trd_unit_cd,
						S0_T1.trd_unit_qty,
						S0_T1.base_unit_cd,
						S0_T1.base_unit_qty,
						S0_T1.trd_cur_upri,
						S0_T1.interim_flg,
						S0_T1.trd_cur_amt,
						S0_T1.trd_cur_amt1,
						S0_T1.trd_cur_amt2,
						S0_T1.trd_cur_amt3,
						S0_T1.xrate,
						S0_T1.base_cur_upri,
						S0_T1.base_cur_amt,
						S0_T1.base_cur_amt1,
						S0_T1.base_cur_amt2,
						S0_T1.base_cur_amt3,
						S0_T1.base_cur_tax_amt,
						S0_T1.trd_cur_tax_amt,
						S0_T1.tax_cd,
						S0_T1.wtax_rate,
						S0_T1.wtax_amt,
						S0_T1.trd_d_rmrks,
						S0_T1.par_act_no,
						S0_T1.par_act_seq,
						S0_T1.bill_d_typ,
						S0_T1.slip_sts_typ,
						S0_T1.ref_iv_no,
						S0_T2.wrk_no.as("wrk_no"),
						S0_T1.ar_typ,
						S0_T2.bill_cl_dt,
						bracket(
							subQuery()
							.select(
								nvl(
									sum(S1_TB1.appl_amt),
									value(0)
								)
							)
							.from(S1_TB1)
							.where(
								S0_T1.bill_d_no.eq(S1_TB1.parent_bill_d_no)
							)
						).as("appl_amt"),
						S0_T1.bill_d_no
					)
					.from(
						S0_T1
						.innerJoin(S0_T2).on(
							bracket(
								S0_T1.bill_mng_no.eq(S0_T2.bill_mng_no)
							)
						)
						.innerJoin(S0_T3).on(
							bracket(
								S0_T1.bill_acst_no.eq(S0_T3.bill_acst_no)
							)
						)
					)
					.where(
						value(0).eq(value(0))
						.and(S0_T1.bill_d_no.eq(bind("bill_d_no")))
						.and(S0_T1.valid_flg.eq(value(true)))
					)
					.orderBy(
						S0_T1.ac_dt.asc(),
						S0_T1.act_no.asc(),
						S0_T1.act_seq.asc(),
						S0_T1.act_d_no.asc()
					)
			)
			.setJoinInfo(
				joinInfo(
					j -> j
						.add(MAM_TAX_R.class, r -> toCondition(
							r.getStringNE("tax_cd")
						))
						.addSelect(m -> toArray(
							m.inc_tax_flg,
							m.tax_rate,
							m.tax_typ
						))
						.addMap((r, m) -> {
							r.setBooleanNE("inc_tax_flg", m.inc_tax_flg());
							r.setStringNE("tax_typ", m.tax_typ());
							r.setNumberNE("tax_rate", m.tax_rate());
					}),
					j -> j
						.add(MAM_TRD_R.class, r -> toCondition(
							r.getStringNE("trd_cd")
						))
						.addSelect(m -> toArray(
							m.trd_ptn_typ
						))
						.addMap((r, m) -> {
							r.setStringNE("trd_ptn_typ", m.trd_ptn_typ());
					})
				)
			);
	}
	
	/**
	 * -- MSBGL0040_MST_BILL_Query_S01
	 */
	static MCQueryPlan MSBGL0040_MST_BILL_S01() {
		MST_BILL_R S0_T1 = MST_BILL_R.create("T1");
		MAM_DPT_R S0_M1 = MAM_DPT_R.create("M1");
		MAM_BP_R S0_M3 = MAM_BP_R.create("M3");
		MAVM_RD_DPT_R S0_V1 = MAVM_RD_DPT_R.create("V1");
		MST_RCV_SCHD_R S1_T4 = MST_RCV_SCHD_R.create("T4");
		MST_RCV_SCHD_R S2_T4 = MST_RCV_SCHD_R.create("T4");
		MAM_EDI_IF_CTL_R M_EDI_IF_CTL = MAM_EDI_IF_CTL_R.create("M4");
		
		return createQueryPlan()
			.setQuery(
				sql("MSBGL0040_MST_BILL_Query_S01")
					.mainQuery()
					.select(
						S0_T1.bill_no,
						S0_T1.bill_rev,
						S0_T1.bill_cl_dt.as("bill_cl_ym"),
						S0_T1.bill_dt,
						MSPA_AR_UTIL$F_GET_BILL_CL_DAY(
							S0_T1.bill_cl_dt,
							nvl(
								S0_T1.bill_cl_typ,
								S0_M3.bill_cl_typ
							),
							S0_T1.bill_each_sls_flg
						).as("bill_cl_day"),
						bracket(
							subQuery()
							.select(min(S1_T4.rcv_schd_dt))
							.from(S1_T4)
							.where(
								S0_T1.bill_mng_no.eq(S1_T4.bill_mng_no)
							)
						).as("rcv_schd_dt"),
						cases()
							.when(
								bracket(
									subQuery()
									.select(count(S2_T4.rcv_schd_no))
									.from(S2_T4)
									.where(
										S0_T1.bill_mng_no.eq(S2_T4.bill_mng_no)
									)
								).gt(value(1))
							)
								.then(value(true))
							.otherwise(value(false)).as("multi_flg"),
						S0_T1.iv_no,
						S0_T1.prnt_flg,
						S0_T1.bill_dpt_cd,
						S0_M1.dpt_nm.as("bill_dpt_nm"),
						S0_T1.wg_cd,
						S0_T1.bcst_cd,
						S0_M3.bp_nm.as("bcst_nm"),
						S0_T1.foreign_flg,
						S0_T1.trd_cur_cd,
						S0_T1.wrk_no,
						S0_T1.last_bill_amt,
						bracket(
							S0_T1.xfr_amt.add(S0_T1.note_amt).add(S0_T1.cash_amt).add(S0_T1.sw_amt)
						).as("rcv_amt"),
						S0_T1.setoff_amt,
						S0_T1.bfw_amt,
						S0_T1.sls_amt,
						S0_T1.ret_amt,
						S0_T1.dscnt_amt,
						bracket(
							S0_T1.tax_amt.subtract(S0_T1.setoff_tax_amt)
						).as("tax_amt"),
						S0_T1.bill_xrate,
						S0_T1.sw_to_amt,
						S0_T1.bill_amt,
						S0_T1.ins_usr_id,
						S0_T1.ins_usr_nm,
						S0_T1.ins_func_id,
						S0_T1.ins_ts,
						S0_T1.upd_usr_id,
						S0_T1.upd_usr_nm,
						S0_T1.upd_func_id,
						S0_T1.upd_ts,
						S0_T1.upd_srv_req_no,
						S0_T1.upd_cntr,
						S0_T1.bill_mng_no,
						S0_T1.pre_bill_no,
						cases()
						.when(S0_T1.prnt_flg.eq(value(true))).then(S0_T1.edi_flg)
						.when(
								exists(
										subQuery()
										.select(value("X"))
										.from(M_EDI_IF_CTL)
										.where(
											S0_T1.bcst_cd.eq(M_EDI_IF_CTL.bp_cd)
											.and(M_EDI_IF_CTL.if_proc_typ.eq(value(MAC_IF_PROC_TYP.BILL_SEND.value())))
											.and(S0_T1.base_dt.between(M_EDI_IF_CTL.st_dt, M_EDI_IF_CTL.end_dt))
											.and(M_EDI_IF_CTL.del_flg.eq(value(false)))
										)
									)
						).then(value(true))
						.otherwise(value(false))
						.as("edi_flg"),
						S0_T1.bill_cl_sts_typ
					)
					.from(
						S0_T1
						.leftOuterJoin(S0_M1).on(
							bracket(
								S0_T1.bill_dpt_cd.eq(S0_M1.dpt_cd)
								.and(S0_T1.base_dt.between(S0_M1.st_dt, S0_M1.end_dt))
							)
						)
						.leftOuterJoin(S0_M3).on(
							bracket(
								S0_T1.bcst_cd.eq(S0_M3.bp_cd)
							)
						)
						.innerJoin(S0_V1).on(
							bracket(
								S0_T1.bill_dpt_cd.eq(S0_V1.dpt_cd)
							)
						)
					)
					.where(
						value(0).eq(value(0))
						.cutoff$and(S0_T1.bill_no.eq(bind("bill_no")))
						.cutoff$and(S0_T1.bill_mng_no.eq(bind("bill_mng_no")))
					)
			)
			.setJoinInfo(
				joinInfo(
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
						.add(MAM_WG_R.class, r -> toCondition(
							r.getStringNE("wg_cd")
						))
						.addSelect(m -> toArray(
							m.wg_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("wg_nm", m.wg_nm());
					}),
					j -> j
						.add(MAM_CUR_R.class, r -> toCondition(
							r.getStringNE("trd_cur_cd")
						))
						.addSelect(m -> toArray(
							m.amt_dec_place,
							m.cur_nm,
							m.upri_dec_place
						))
						.addMap((r, m) -> {
							r.setStringNE("trd_cur_nm", m.cur_nm());
							r.setNumberNE("upri_dec_place", m.upri_dec_place());
							r.setNumberNE("amt_dec_place", m.amt_dec_place());
					})
				)
			);
	}
	/**
	 * -- MSBGL0040_MST_RCV_ACT_D_Query_S01
	 */
	static MCQueryPlan MSBGL0040_MST_RCV_ACT_D_S01() {
		MST_RCV_ACT_D_R S0_T1 = MST_RCV_ACT_D_R.create("T2");
		MST_RCV_ACT_R S0_T2 = MST_RCV_ACT_R.create("T3");
		
		return createQueryPlan()
			.setQuery(
				sql("MSBGL0040_MST_RCV_ACT_D_Query_S01")
					.mainQuery()
					.select(
						S0_T2.ac_ym,
						S0_T2.ac_dt,
						S0_T2.slip_sts_typ,
						S0_T2.trd_cd,
						S0_T2.rcv_dt,
						S0_T2.rcv_act_no,
						S0_T2.rcv_act_seq,
						S0_T2.rcv_act_rev,
						S0_T1.rcv_act_d_no,
						S0_T1.rcv_act_d_seq,
						S0_T1.upd_cntr.as("rcv_act_d_upd_cntr"),
						bracket(
							cases()
								.when(
									S0_T2.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.SETOFF_SUSP_OTH.value()))
									.or(S0_T2.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.SETOFF_OTR_AR.value())))
									.or(S0_T2.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.SETOFF_ADV_OTH.value())))
								)
								.then(value(0))
								.otherwise(S0_T1.trd_cur_amt1)
						).as("trd_cur_amt"),
						bracket(
							cases()
								.when(
									S0_T2.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.SETOFF_SUSP_OTH.value()))
									.or(S0_T2.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.SETOFF_OTR_AR.value())))
									.or(S0_T2.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.SETOFF_ADV_OTH.value())))
								)
								.then(S0_T1.trd_cur_amt1)
								.otherwise(S0_T1.trd_cur_amt2)
						).as("setoff_amt"),
						bracket(
							cases()
								.when(
									S0_T2.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.SETOFF_SUSP_OTH.value()))
									.or(S0_T2.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.SETOFF_OTR_AR.value())))
									.or(S0_T2.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.SETOFF_ADV_OTH.value())))
								)
								.then(S0_T1.trd_cur_tax_amt1)
								.otherwise(S0_T1.trd_cur_tax_amt2)
						).as("setoff_tax_amt"),
						bracket(
							cases()
								.when(
									S0_T2.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.SETOFF_SUSP_OTH.value()))
									.or(S0_T2.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.SETOFF_OTR_AR.value())))
									.or(S0_T2.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.SETOFF_ADV_OTH.value())))
								)
								.then(S0_T2.tax_cd1)
								.otherwise(S0_T2.tax_cd2)
						).as("setoff_tax_cd"),
						S0_T2.ins_usr_id,
						S0_T2.ins_usr_nm,
						S0_T2.ins_func_id,
						S0_T2.ins_ts,
						S0_T2.upd_usr_id,
						S0_T2.upd_usr_nm,
						S0_T2.upd_func_id,
						S0_T2.upd_ts,
						S0_T2.upd_srv_req_no
					)
					.from(
						S0_T1
						.innerJoin(S0_T2).on(
							bracket(
								S0_T2.rcv_act_no.eq(S0_T1.rcv_act_no)
								.and(S0_T2.rcv_act_seq.eq(S0_T1.rcv_act_seq))
							)
						)
					)
					.where(
						S0_T1.rcv_act_d_no.eq(bind("rcv_act_d_no"))
						.and(S0_T1.rcv_act_d_seq.eq(bind("rcv_act_d_seq")))
					)
					.orderBy(
						S0_T2.ac_dt.asc(),
						S0_T2.rcv_act_no.asc(),
						S0_T2.rcv_act_seq.asc(),
						S0_T1.rcv_act_d_no.asc()
					)
			)
			.setJoinInfo(
				joinInfo(
					j -> j
						.add(MAM_TRD_R.class, r -> toCondition(
							r.getStringNE("trd_cd")
						))
						.addSelect(m -> toArray(
							m.trd_nm,
							m.trd_ptn_typ
						))
						.addMap((r, m) -> {
							r.setStringNE("trd_nm", m.trd_nm());
							r.setStringNE("trd_ptn_typ", m.trd_ptn_typ());
					}),
					j -> j
						.add(MAM_TAX_R.class, r -> toCondition(
							r.getStringNE("setoff_tax_cd")
						))
						.addSelect(m -> toArray(
							m.tax_nm,
							m.tax_rate
						))
						.addMap((r, m) -> {
							r.setStringNE("setoff_tax_nm", m.tax_nm());
							r.setNumberNE("setoff_tax_rate", m.tax_rate());
					})
				)
			);
	}
}