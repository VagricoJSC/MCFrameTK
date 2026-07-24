package mcframe.serverMSBG.MSBGL0020;

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
	 * -- MSBGL0020_MST_BILL_D_Query_S01
	 */
	static MCQueryPlan MSBGL0020_MST_BILL_D_S01() {
		MST_BILL_D_R S0_T1 = MST_BILL_D_R.create("T1");
		MST_BILL_R S0_T2 = MST_BILL_R.create("T2");
		MST_BILL_ACST_R S0_BILLACST = MST_BILL_ACST_R.create("BILLACST");
		MAM_ITM_R S0_M2 = MAM_ITM_R.create("M2");
		MAM_BP_R S0_M6 = MAM_BP_R.create("M6");
		MAM_DPT_R S0_M10 = MAM_DPT_R.create("M10");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBGL0020_MST_BILL_D_Query_S01")
					.mainQuery()
					.select(
						S0_T1.trd_cur_amt,
						S0_T1.trd_cur_tax_amt,
						bracket(
							S0_T1.trd_cur_amt.add(S0_T1.trd_cur_tax_amt)
						).as("inc_tax_amt"),
						S0_T1.trd_cur_dscnt_amt,
						S0_T1.xrate,
						S0_T1.base_cur_amt,
						S0_T1.base_cur_dscnt_amt,
						S0_T1.base_cur_tax_amt,
						S0_T1.base_cur_upri,
						MSPA_AR_UTIL$F_GET_SCHD_BILL_DT(
							bind("bcst_cd"),
							S0_T1.bill_basis_dt,
							S0_T1.bill_crryovr_times,
							value(false)
						).as("bill_ym"),
						MSPA_AR_UTIL$F_GET_SCHD_BILL_DT(
							bind("bcst_cd"),
							S0_T1.bill_basis_dt,
							S0_T1.bill_crryovr_times,
							value(false)
						).as("schd_bill_dt"),
						extract(
							MCDateTimeFld.DAY,
							MSPA_AR_UTIL$F_GET_SCHD_BILL_DT(
								bind("bcst_cd"),
								S0_T1.bill_basis_dt,
								S0_T1.bill_crryovr_times,
								value(false)
							)
						).as("bill_cl_day"),
						S0_T1.ac_dt,
						S0_T1.slip_sts_typ,
						S0_T1.trd_cd,
						S0_T1.ar_typ,
						S0_T1.base_sls_ac_dt,
						S0_T1.act_no,
						S0_T1.act_seq,
						S0_T1.act_rev,
						S0_T1.act_d_no,
						S0_T1.act_d_seq,
						S0_T1.itm_cd,
						S0_T1.itm_sub1,
						S0_T1.itm_sub2,
						S0_T1.itm_sub3,
						nvl(
							S0_T1.itm_nm,
							S0_M2.itm_nm
						).as("itm_nm"),
						S0_T1.cst_itm_cd,
						S0_T1.cst_itm_nm,
						S0_M2.dscnt_itm_flg,
						S0_T1.sno1,
						S0_T1.sno2,
						S0_T1.sno3,
						S0_T1.sno4,
						S0_T1.trd_unit_cd,
						S0_T1.trd_unit_qty,
						S0_T1.trd_cur_upri,
						S0_T1.interim_flg,
						S0_T1.tax_cd,
						S0_T1.dlv_dt,
						S0_T1.bill_basis_dt,
						S0_T1.bill_crryovr_times,
						S0_T1.cst_cd,
						S0_T1.dlv_cd.as("scst_cd"),
						nvl(
							S0_T1.dlv_nm,
							S0_M6.bp_nm
						).as("scst_nm"),
						S0_T1.dest_cd1,
						S0_T1.dest_cd2,
						S0_T1.dest_cd3,
						S0_T1.sls_dpt_cd,
						S0_M10.dpt_nm.as("sls_dpt_nm"),
						S0_T1.sls_usr_cd,
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
						decode(
							S0_T1.wrk_no,
							value(MAC_STR.NULL_VAL.value()),
							nullValue(),
							S0_T1.wrk_no
						).as("sls_wrk_no"),
						S0_T1.trd_d_rmrks,
						S0_T1.bill_d_rmrks,
						S0_T1.rcv_mtd_cd,
						S0_T1.rcv_dt,
						S0_T1.bill_d_typ,
						S0_T1.ar_trd_grp_typ,
						S0_T1.trd_ptn_typ,
						S0_T1.bill_d_no,
						cases()
						.when(S0_T1.crryovr_flg.eq(value(true)))
							.then(value(true))
						.when(S0_T1.bill_mtd_typ.eq(value(MSC_BILL_MTD_TYP.PART_BILL.value())))
							.then(value(true))
						.otherwise(value(false)).as("crryovr_flg"),
						S0_BILLACST.acst_cd,
						decode(
							S0_T1.trd_ptn_typ,
							value(MAC_TRD_PTN_TYP.TAX_DIFF_BILL_CL.value()),
							value(999),
							value(0)
						).as("sort_ord"),
						// this field is appended by sql coverter.
						S0_T1.wrk_no.as("join_wrk_no_"),
						// this field is appended by sql coverter.
						S0_T2.trd_cur_cd.as("join_trd_cur_cd_"),
						// this field is appended by sql coverter.
						S0_T2.bcst_cd.as("join_bcst_cd_")
					)
					.from(
						S0_T1
						.leftOuterJoin(S0_T2).on(
							bracket(
								S0_T1.bill_mng_no.eq(S0_T2.bill_mng_no)
							)
						)
						.innerJoin(S0_BILLACST).on(S0_T1.bill_acst_no.eq(S0_BILLACST.bill_acst_no))
						.leftOuterJoin(S0_M2).on(
							bracket(
								S0_T1.itm_cd.eq(S0_M2.itm_cd)
								.and(S0_T1.itm_sub1.eq(S0_M2.itm_sub1))
								.and(S0_T1.itm_sub2.eq(S0_M2.itm_sub2))
								.and(S0_T1.itm_sub3.eq(S0_M2.itm_sub3))
							)
						)
						.leftOuterJoin(S0_M6).on(
							bracket(
								S0_T1.dlv_cd.eq(S0_M6.bp_cd)
							)
						)
						.leftOuterJoin(S0_M10).on(
							bracket(
								S0_T1.sls_dpt_cd.eq(S0_M10.dpt_cd)
								.and(S0_T2.bill_cl_dt.between(S0_M10.st_dt, S0_M10.end_dt))
							)
						)
					)
					.where(
						value(0).eq(value(0))
						.and(S0_T2.bill_cl_sts_typ.eq(value(MSC_BILL_CL_STS_TYP.NOT_BILL.value())))
						.and(S0_T1.valid_flg.eq(value(true)))
						.and(S0_T2.bcst_cd.eq(bind("bcst_cd")))
						.and(S0_T2.bill_dpt_cd.eq(bind("bill_dpt_cd")))
						.and(S0_T2.trd_cur_cd.eq(bind("trd_cur_cd")))
						.and(
							S0_T2.wrk_no.eq(bind("wrk_no"))
							.or(S0_T2.wrk_no.isNull())
							.and(bind("wrk_no").isNull())
						)
						.and(
							S0_T1.iv_no.eq(bind("iv_no"))
							.or(value(MAC_STR.NULL_VAL.value()).eq(bind("iv_no")))
						)
						.cutoff$and(
							bracket(
								bind("sls").eq(bind("sls"))
								.and(
									bracket(
										S0_T1.bill_d_typ.eq(value(MSC_BILL_D_TYP.RCV.value()))
										.and(S0_T1.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.TAX_DIFF_BILL_CL.value())))
									)
									.or(
										S0_T1.bill_d_typ.eq(value(MSC_BILL_D_TYP.RCV.value()))
										.and(S0_T1.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.ARSW_IN_BILL_BAL.value())))
									)
									.or(S0_T1.bill_d_typ.eq(value(MSC_BILL_D_TYP.SLS.value())))
								)
							)
						)
						.cutoff$and(
							bracket(
								bind("rcv").eq(bind("rcv"))
								.and(S0_T1.bill_d_typ.eq(value(MSC_BILL_D_TYP.RCV.value())))
								.and(S0_T1.trd_ptn_typ.neq(value(MAC_TRD_PTN_TYP.TAX_DIFF_BILL_CL.value())))
								.and(S0_T1.trd_ptn_typ.neq(value(MAC_TRD_PTN_TYP.ARSW_IN_BILL_BAL.value())))
							)
						)
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
							r.getStringNE("join_wrk_no_")
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
							r.setNumberNE("dec_place", m.dec_place());
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
							m.bp_nm,
							m.sls_amt_rnd_typ,
							m.sls_tax_rnd_typ
						))
						.addMap((r, m) -> {
							r.setStringNE("cst_nm", m.bp_nm());
							r.setStringNE("sls_amt_rnd_typ", m.sls_amt_rnd_typ());
							r.setStringNE("sls_tax_rnd_typ", m.sls_tax_rnd_typ());
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
						.add(MAM_STTL_R.class, r -> toCondition(
							r.getStringNE("rcv_mtd_cd")
						))
						.addSelect(m -> toArray(
							m.sttl_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("rcv_mtd_nm", m.sttl_nm());
					}),
					j -> j
						.add(MAM_CUR_R.class, r -> toCondition(
							r.getStringNE("join_trd_cur_cd_")
						))
						.addSelect(m -> toArray(
							m.amt_dec_place,
							m.upri_dec_place
						))
						.addMap((r, m) -> {
							r.setNumberNE("amt_dec_place", m.amt_dec_place());
							r.setNumberNE("upri_dec_place", m.upri_dec_place());
					}),
					j -> j
						.add(MAM_BP_R.class, r -> toCondition(
							r.getStringNE("join_bcst_cd_")
						))
						.addSelect(m -> toArray(
							m.bill_can_slip_typ,
							m.sls_interim_cl_flg,
							m.bill_dtl_subttl_typ,
							m.sls_dtl_outp_typ
						))
						.addMap((r, m) -> {
							r.setStringNE("bill_can_slip_typ", m.bill_can_slip_typ());
							r.setBooleanNE("sls_interim_cl_flg", m.sls_interim_cl_flg());
							r.setStringNE("bill_dtl_subttl_typ", m.bill_dtl_subttl_typ());
							r.setStringNE("sls_dtl_outp_typ", m.sls_dtl_outp_typ());
					})
				)
			);
	}
	/**
	 * -- MSBGL0020_MST_RCV_ACT_D_Query_S01
	 */
	static MCQueryPlan MSBGL0020_MST_RCV_ACT_D_S01() {
		MST_RCV_ACT_D_R S0_T1 = MST_RCV_ACT_D_R.create("T1");
		MST_RCV_ACT_R S0_T2 = MST_RCV_ACT_R.create("T2");
		
		return createQueryPlan()
			.setQuery(
				sql("MSBGL0020_MST_RCV_ACT_D_Query_S01")
					.mainQuery()
					.select(
						S0_T2.ac_dt,
						S0_T2.slip_sts_typ,
						S0_T2.trd_cd,
						S0_T2.rcv_dt,
						S0_T2.rcv_act_no,
						S0_T2.rcv_act_seq,
						S0_T2.rcv_act_rev,
						S0_T1.rcv_act_d_no,
						S0_T1.rcv_act_d_seq,
						S0_T2.upd_cntr.as("rcv_act_upd_cntr"),
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
						).as("setoff_tax_cd")
						,bracket(
							cases()
								.when(
									S0_T2.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.SETOFF_SUSP_OTH.value()))
									.or(S0_T2.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.SETOFF_OTR_AR.value())))
									.or(S0_T2.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.SETOFF_ADV_OTH.value())))
								)
								.then(S0_T2.ar_sttl_cd1)
								.otherwise(S0_T2.ar_sttl_cd2)
						).as("ar_sttl_cd")
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
						value(0).eq(value(0))
						.and(S0_T1.rcv_act_d_no.eq(bind("rcv_act_d_no")))
						.and(S0_T1.rcv_act_d_seq.eq(bind("rcv_act_d_seq")))
					)
					.orderBy(
						S0_T2.ac_dt.asc(),
						S0_T2.rcv_act_no.asc(),
						S0_T2.rcv_act_seq.asc(),
						S0_T2.rcv_act_rev.asc(),
						S0_T1.rcv_act_d_no.asc(),
						S0_T1.rcv_act_d_seq.asc()
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
					,j -> j
						.add(MAM_STTL_R.class, r -> toCondition(
							r.getStringNE("ar_sttl_cd")
						))
						.addSelect(m -> toArray(
							m.bill_tax_disp_flg
						))
						.addMap((r, m) -> {
							r.setBooleanNE("bill_tax_disp_flg", m.bill_tax_disp_flg());
					})
				)
			);
	}
}