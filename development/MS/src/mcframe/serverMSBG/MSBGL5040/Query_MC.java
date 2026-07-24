package mcframe.serverMSBG.MSBGL5040;

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
	 * -- MSBGL5040_MST_BILL_ACST_Query_S01
	 */
	static MCQueryPlan MSBGL5040_MST_BILL_ACST_S01() {
		MST_BILL_ACST_R S0_T1 = MST_BILL_ACST_R.create("T1");
		MST_BILL_R S0_T2 = MST_BILL_R.create("T2");
		MAM_BP_R S0_M1 = MAM_BP_R.create("M1");
		MAM_BP_SUB_R S0_M2 = MAM_BP_SUB_R.create("M2");
		MAM_CO_R S0_M3 = MAM_CO_R.create("M3");
		MAM_CNTRY_R S0_M4 = MAM_CNTRY_R.create("M4");
		MAM_CNTRY_R S0_M5 = MAM_CNTRY_R.create("M5");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBGL5040_MST_BILL_ACST_Query_S01")
					.mainQuery()
					.select(
						S0_T1.acst_cd.as("bp_cd"),
						S0_M1.bp_nm,
						S0_M1.bp_alt_nm1,
						S0_M1.bp_alt_nm2,
						S0_M1.bp_alt_nm3,
						S0_M1.bp_alt_nm4,
						decode(
							S0_M2.bp_cd,
							nullValue(),
							S0_M1.zip_cd,
							S0_M2.zip_cd
						).as("zip_cd"),
						decode(
							S0_M2.bp_cd,
							nullValue(),
							S0_M1.addr1,
							S0_M2.addr1
						).as("addr1"),
						decode(
							S0_M2.bp_cd,
							nullValue(),
							S0_M1.addr2,
							S0_M2.addr2
						).as("addr2"),
						decode(
							S0_M2.bp_cd,
							nullValue(),
							S0_M1.addr3,
							S0_M2.addr3
						).as("addr3"),
						decode(
							S0_M2.bp_cd,
							nullValue(),
							S0_M1.addr4,
							S0_M2.addr4
						).as("addr4"),
						decode(
							S0_M2.bp_cd,
							nullValue(),
							S0_M1.tel,
							S0_M2.tel
						).as("tel"),
						S0_T1.bill_acst_no
						,S0_M4.cntry_nm
						,S0_M5.cntry_nm.as("bp_cntry_nm")
					)
					.from(
						S0_T1
						.innerJoin(S0_T2).on(S0_T1.bill_mng_no.eq(S0_T2.bill_mng_no))
						.leftOuterJoin(S0_M1).on(S0_M1.bp_cd.eq(S0_T1.acst_cd))
						.leftOuterJoin(S0_M2).on(
							bracket(
								S0_M2.bp_cd.eq(S0_T1.acst_cd)
								.and(S0_M2.st_dt.lte(S0_T2.bill_cl_dt))
								.and(S0_M2.end_dt.gte(S0_T2.bill_cl_dt))
							)
						)
						.crossJoin(S0_M3)
						.leftOuterJoin(S0_M4).on(
							bracket(
								S0_M4.cntry_cd.eq(S0_M3.cntry_cd)
							)
						)
						.leftOuterJoin(S0_M5).on(
							bracket(
								S0_M5.cntry_cd.eq(S0_M1.cntry_cd)
							)
						)
					)
					.where(
						value(0).eq(value(0))
						.and(S0_T1.acst_cd.isNotNull())
						.and(S0_T1.bill_mng_no.eq(bind("bill_mng_no")))
					)
			);
	}
	
	/**
	 * -- MSBGL5040_MST_BILL_D_Query_S01
	 */
	static MCQueryPlan MSBGL5040_MST_BILL_D_S01() {
		MST_BILL_D_R S0_T1 = MST_BILL_D_R.create("T1");
		MSW_BILL_KEY_R S0_W = MSW_BILL_KEY_R.create("W");
		MST_BILL_D_R S0_T2 = MST_BILL_D_R.create("T2");
		MST_BILL_D_R S0_T3 = MST_BILL_D_R.create("T3");
		MST_BILL_ACST_R S0_BILLACST = MST_BILL_ACST_R.create("BILLACST");
		MCTempView S0_T5 = createTempView("T5");
		MST_RCV_ACT_D_R S0_T6= MST_RCV_ACT_D_R.create("T6");
		MST_RCV_ACT_R S0_T7= MST_RCV_ACT_R.create("T7");
		MST_RCV_ACT_D_R S1_T1= MST_RCV_ACT_D_R.create("ST1");
		MAM_ITM_R S0_M4 = MAM_ITM_R.create("M4");
		MAM_BP_R S0_M7 = MAM_BP_R.create("M7");
		MCTempView S1_W1 = createTempView("W1");
		MST_RCV_ACT_D_R S2_T1 = MST_RCV_ACT_D_R.create("T1");
		MST_RCV_ACT_R S2_T2 = MST_RCV_ACT_R.create("T2");
		MSW_BILL_KEY_R S2_W = MSW_BILL_KEY_R.create("W");
		
		return createQueryPlan()
			.setQuery(
				sql("MSBGL5040_MST_BILL_D_Query_S01")
					.mainQuery()
					.select(
						S1_W1.prAll(),
						S0_T3.trd_cur_amt.add(S0_T3.trd_cur_tax_amt).as("part_bill_ttl_amt"))
					.from(
						subQuery()
						.select(
						S0_T1.dlv_dt,
						S0_T1.ac_ym,
						S0_T1.ac_dt,
						S0_T1.rcv_dt,
						cases()
							.when(
								S0_T1.ar_trd_grp_typ.in(
									value(MAC_AR_TRD_GRP_TYP.SLS.value()),
									value(MAC_AR_TRD_GRP_TYP.SLS_RTN.value()),
									value(MAC_AR_TRD_GRP_TYP.SLS_DSCNT.value()),
									value(MAC_AR_TRD_GRP_TYP.TAX_DIFF.value())
								)
							)
								.then(
									nvl(
										S0_T1.dlv_dt,
										S0_T1.ac_dt
									)
							)
							.when(
								S0_T1.ar_trd_grp_typ.in(
									value(MAC_AR_TRD_GRP_TYP.RCV.value()),
									value(MAC_AR_TRD_GRP_TYP.SETOFF.value()),
									value(MAC_AR_TRD_GRP_TYP.ARSW.value())
								)
							)
								.then(S0_T1.rcv_dt)
							.otherwise(S0_T1.ac_dt).as("sort_dlv_dt"),
						S0_T1.base_sls_ac_dt,
						S0_T1.dlv_slip_no,
						S0_T1.dlv_slip_d_no,
						S0_T1.ship_dlv_slip_no,
						S0_T1.ship_dlv_slip_d_no,
						S0_T1.ship_dlv_slip_multi_flg,
						S0_T1.slip_sts_typ,
						S0_T1.itm_cd,
						S0_T1.itm_sub1,
						S0_T1.itm_sub2,
						S0_T1.itm_sub3,
						nvl(
							S0_T1.itm_nm,
							S0_M4.itm_nm
						).as("itm_nm"),
						S0_M4.itm_alt_nm1,
						S0_M4.itm_alt_nm2,
						S0_M4.itm_alt_nm3,
						S0_M4.itm_alt_nm4,
						S0_M4.dscnt_itm_flg,
						S0_T1.cst_itm_cd,
						S0_T1.cst_itm_nm,
						S0_T1.trd_cd,
						S0_T1.trd_unit_qty,
						S0_T1.trd_unit_cd,
						S0_T1.trd_cur_upri,
						S0_T1.interim_flg,
						S0_T1.trd_cur_amt,
						nvl(S0_T6.trd_cur_amt1, value(0)).as("trd_cur_amt1"),
						nvl(S0_T6.trd_cur_amt2, value(0)).as("trd_cur_amt2"),
						nvl(S0_T6.trd_cur_amt3, value(0)).as("trd_cur_amt3"),
						S0_T1.trd_cur_dscnt_amt,
						S0_T1.trd_cur_tax_amt,
						S0_T1.base_cur_tax_amt,
						nvl(S0_T6.trd_cur_tax_amt1, value(0)).as("trd_cur_tax_amt1"),
						nvl(S0_T6.trd_cur_tax_amt2, value(0)).as("trd_cur_tax_amt2"),
						nvl(S0_T6.trd_cur_tax_amt3, value(0)).as("trd_cur_tax_amt3"),
						nvl(S0_T6.base_cur_tax_amt1, value(0)).as("base_cur_tax_amt1"),
						nvl(S0_T6.base_cur_tax_amt2, value(0)).as("base_cur_tax_amt2"),
						nvl(S0_T6.base_cur_tax_amt3, value(0)).as("base_cur_tax_amt3"),
						S0_T1.tax_cd,
						S0_T1.trd_d_rmrks,
						S0_T1.bill_d_rmrks,
						S0_T1.sub_char1.as("d_sub_char1"),
						S0_T1.sub_char2.as("d_sub_char2"),
						S0_T1.sub_char3.as("d_sub_char3"),
						S0_T1.bill_mng_no,
						S0_T1.ar_trd_grp_typ,
						S0_T1.trd_ptn_typ,
						S0_T1.bill_d_typ,
						S0_T1.act_no,
						S0_T1.act_seq,
						S0_T1.act_rev,
						S0_T1.act_d_no,
						S0_T1.act_d_seq,
						S0_T1.wrk_no,
						S0_T1.cst_cd,
						S0_T1.dlv_cd,
						nvl(
							S0_T1.dlv_nm,
							S0_M7.bp_nm
						).as("dlv_nm"),
						S0_T1.par_act_no,
						S0_T1.bill_acst_no,
						S0_T1.bill_mtd_typ,
						S0_T1.bill_d_no,
						cases()
						.when(S0_T1.crryovr_flg.eq(value(true)))
							.then(value(true))
						.when(S0_T1.bill_mtd_typ.eq(value(MSC_BILL_MTD_TYP.PART_BILL.value())))
							.then(value(true))
						.otherwise(value(false)).as("crryovr_flg"),
						S0_T1.bill_prnt_tgt_flg,
						S0_BILLACST.acst_cd,
						MSPA_AR_UTIL$F_GET_ORG_BILL_D_NO(S0_T1.bill_d_no).as("crryovr_src_bill_d_no"),
						S0_T2.trd_cur_amt.add(S0_T2.trd_cur_tax_amt).as("part_bill_crryovr_amt"),
						S0_T1.cst_po_no,
						S0_T1.cst_po_d_no,
						S0_T1.iv_no,
						S0_T1.ar_typ,
						S0_T5.pr("rcv_act_d_cnt"),
						// this field is appended by sql coverter.
						S0_T1.rcv_mtd_cd.as("join_rcv_mtd_cd_")
						,S0_T7.ar_sttl_cd1
						,S0_T7.ar_sttl_typ1
						,S0_T7.tax_cd1
						,S0_T7.ar_sttl_cd2
						,S0_T7.ar_sttl_typ2
						,S0_T7.tax_cd2
					)
					.from(
						S0_T1
						.innerJoin(S0_W).on(
							bracket(
								S0_W.bill_mng_no.eq(S0_T1.bill_mng_no)
							)
						)
						.leftOuterJoin(S0_T2).on(
							bracket(
								S0_T2.bill_d_no.eq(S0_T1.crryovr_bill_d_no)
							)
						)
						.innerJoin(S0_BILLACST).on(S0_T1.bill_acst_no.eq(S0_BILLACST.bill_acst_no))
						.leftOuterJoin(S0_M4).on(
							bracket(
								S0_M4.itm_cd.eq(S0_T1.itm_cd)
								.and(S0_M4.itm_sub1.eq(S0_T1.itm_sub1))
								.and(S0_M4.itm_sub2.eq(S0_T1.itm_sub2))
								.and(S0_M4.itm_sub3.eq(S0_T1.itm_sub3))
							)
						)
						.leftOuterJoin(
							subQuery()
								.select(
									count(value(1)).as("rcv_act_d_cnt"),
									S1_T1.rcv_act_no,
									S1_T1.rcv_act_seq,
									S1_T1.iv_no,
									S1_T1.ar_typ
								)
								.from(S1_T1)
								.groupBy(S1_T1.rcv_act_no, S1_T1.rcv_act_seq, S1_T1.iv_no, S1_T1.ar_typ)
								.view(S0_T5)
						).on(
							bracket(
								S0_T5.pr(S1_T1.rcv_act_no).eq(S0_T1.act_no)
								.and(S0_T5.pr(S1_T1.rcv_act_seq).eq(S0_T1.act_seq))
								.and(S0_T5.pr(S1_T1.iv_no).eq(S0_T1.iv_no))
								.and(S0_T5.pr(S1_T1.ar_typ).eq(S0_T1.ar_typ))
								.and(S0_T1.bill_d_typ.eq(value(MSC_BILL_D_TYP.RCV.value())))
							)
						)
						.leftOuterJoin(S0_T6).on(
							bracket(
								S0_T6.rcv_act_d_no.eq(S0_T1.act_d_no)
								.and(S0_T6.rcv_act_d_seq.eq(S0_T1.act_d_seq))
								.and(S0_T1.bill_d_typ.eq(value(MSC_BILL_D_TYP.RCV.value())))
							)
						)
						.leftOuterJoin(S0_T7).on(
							bracket(
								S0_T7.rcv_act_no.eq(S0_T1.act_no)
								.and(S0_T7.rcv_act_seq.eq(S0_T1.act_seq))
								.and(S0_T1.bill_d_typ.eq(value(MSC_BILL_D_TYP.RCV.value())))
							)
						)
						.leftOuterJoin(S0_M7).on(S0_M7.bp_cd.eq(S0_T1.dlv_cd))
					)
					.where(
						value(0).eq(value(0))
						.and(S0_T1.valid_flg.eq(value(true)))
					)
					.unionAll(
						subQuery()
						.select(
							nullValue().as("dlv_dt"),
							S2_T2.ac_ym,
							S2_T2.ac_dt,
							S2_T2.rcv_dt,
							S2_T2.rcv_dt.as("sort_dlv_dt"),
							nullValue().as("base_sls_ac_dt"),
							nullValue().as("dlv_slip_no"),
							nullValue().as("dlv_slip_d_no"),
							nullValue().as("ship_dlv_slip_no"),
							nullValue().as("ship_dlv_slip_d_no"),
							value(false).as("ship_dlv_slip_multi_flg"),
							S2_T2.slip_sts_typ,
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
							nullValue().as("cst_itm_cd"),
							nullValue().as("cst_itm_nm"),
							S2_T2.trd_cd,
							value(0).as("trd_unit_qty"),
							nullValue().as("trd_unit_cd"),
							value(0).as("trd_cur_upri"),
							value(false).as("interim_flg"),
							value(0).as("trd_cur_amt"),
							S2_T1.trd_cur_amt1,
							S2_T1.trd_cur_amt2,
							S2_T1.trd_cur_amt3,
							value(0).as("trd_cur_dscnt_amt"),
							value(0).as("trd_cur_tax_amt"),
							value(0).as("base_cur_tax_amt"),
							S2_T1.trd_cur_tax_amt1,
							S2_T1.trd_cur_tax_amt2,
							S2_T1.trd_cur_tax_amt3,
							S2_T1.base_cur_tax_amt1,
							S2_T1.base_cur_tax_amt2,
							S2_T1.base_cur_tax_amt3,
							nullValue().as("tax_cd"),
							nullValue().as("trd_d_rmrks"),
							S2_T1.bill_d_rmrks,
							S2_T2.sub_char1.as("d_sub_char1"),
							S2_T2.sub_char2.as("d_sub_char2"),
							S2_T2.sub_char3.as("d_sub_char3"),
							S2_T1.bill_mng_no,
							value(MAC_AR_TRD_GRP_TYP.RCV.value()).as("ar_trd_grp_typ"),
							S2_T2.trd_ptn_typ,
							value(MSC_BILL_D_TYP.RCV.value()).as("bill_d_typ"),
							S2_T2.rcv_act_no.as("act_no"),
							S2_T2.rcv_act_seq.as("act_seq"),
							S2_T2.rcv_act_rev.as("act_rev"),
							S2_T1.rcv_act_d_no.as("act_d_no"),
							S2_T1.rcv_act_d_seq.as("act_d_seq"),
							S2_T1.wrk_no,
							nullValue().as("cst_cd"),
							nullValue().as("dlv_cd"),
							nullValue().as("dlv_nm"),
							S2_T2.par_rcv_act_no.as("par_act_no"),
							nullValue().as("bill_acst_no"),
							nullValue().as("bill_mtd_typ"),
							nullValue().as("bill_d_no"),
							value(false).as("crryovr_flg"),
							value(true).as("bill_prnt_tgt_flg"),
							nullValue().as("acst_cd"),
							nullValue().as("crryovr_src_bill_d_no"),
							value(0).as("part_bill_crryovr_amt"),
							nullValue().as("cst_po_no"),
							nullValue().as("cst_po_d_no"),
							S2_T1.iv_no,
							S2_T1.ar_typ,
							value(0).as("rcv_act_d_cnt"),
							S2_T2.ar_sttl_cd1.as("join_rcv_mtd_cd_"),
							S2_T2.ar_sttl_cd1,
							S2_T2.ar_sttl_typ1,
							S2_T2.tax_cd1,
							S2_T2.ar_sttl_cd2,
							S2_T2.ar_sttl_typ2,
							S2_T2.tax_cd2
						)
						.from(
							S2_T1
							.innerJoin(S2_W).on(
								bracket(
									S0_W.bill_mng_no.eq(S0_T1.bill_mng_no)
								)
							)
							.innerJoin(S2_T2).on(
								bracket(
									S2_T2.rcv_act_no.eq(S2_T1.rcv_act_no)
									.and(S2_T2.rcv_act_seq.eq(S2_T1.rcv_act_seq))
								)
							)
						)
						.where(
							S2_T2.trd_ptn_typ.in(
								value(MAC_TRD_PTN_TYP.RCV_ADV.value()), 
								value(MAC_TRD_PTN_TYP.SETOFF_ADV_OTH.value()), 
								value(MAC_TRD_PTN_TYP.SETOFF_SUSP_ADV.value())
							)
						)
					).view(S1_W1)
					.leftOuterJoin(S0_T3).on(
						bracket(
							S0_T3.bill_d_no.eq(S1_W1.pr("crryovr_src_bill_d_no"))
						)
					)
				)
				.orderBy(
						S1_W1.pr(S0_T1.bill_mng_no).asc(),
						S1_W1.pr(S0_T1.bill_d_no).asc()
						,S1_W1.pr(S0_T1.act_d_no).asc()
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
							m.unit_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("unit_nm", m.unit_nm());
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
							r.setStringNE("tax_nm", m.tax_nm());
							r.setBooleanNE("inc_tax_flg", m.inc_tax_flg());
							r.setNumberNE("tax_rate", m.tax_rate());
					}),
					j -> j
						.add(MAM_TAX_R.class, r -> toCondition(
							r.getStringNE("tax_cd1")
						))
						.addSelect(m -> toArray(
							m.tax_nm,
							m.inc_tax_flg,
							m.tax_rate
						))
						.addMap((r, m) -> {
							r.setStringNE("tax_nm1", m.tax_nm());
							r.setBooleanNE("inc_tax_flg1", m.inc_tax_flg());
							r.setNumberNE("tax_rate1", m.tax_rate());
					}),
					j -> j
						.add(MAM_TAX_R.class, r -> toCondition(
							r.getStringNE("tax_cd2")
						))
						.addSelect(m -> toArray(
							m.tax_nm,
							m.inc_tax_flg,
							m.tax_rate
						))
						.addMap((r, m) -> {
							r.setStringNE("tax_nm2", m.tax_nm());
							r.setBooleanNE("inc_tax_flg2", m.inc_tax_flg());
							r.setNumberNE("tax_rate2", m.tax_rate());
					}),
					j -> j
						.add(MAVM_ITM_UNIT_R.class, r -> toCondition(
							r.getStringNE("itm_cd"),
							r.getStringNE("itm_sub1"),
							r.getStringNE("itm_sub2"),
							r.getStringNE("itm_sub3"),
							r.getStringNE("trd_unit_cd")
						))
						.addSelect(m -> toArray(
							m.dec_place
						))
						.addMap((r, m) -> {
							r.setNumberNE("trd_unit_dec_place", m.dec_place());
					}),
					j -> j
						.add(MAM_STTL_R.class, r -> toCondition(
							r.getStringNE("join_rcv_mtd_cd_")
						))
						.addSelect(m -> toArray(
							m.sttl_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("rcv_nm", m.sttl_nm());
					})
					,j -> j
						.add(MAM_STTL_R.class, r -> toCondition(
							r.getStringNE("ar_sttl_cd1")
						))
						.addSelect(m -> toArray(
							m.sttl_nm
							,m.bill_tax_disp_flg
						))
						.addMap((r, m) -> {
							r.setStringNE("ar_sttl_nm1", m.sttl_nm());
							r.setBooleanNE("bill_tax_disp_flg1", m.bill_tax_disp_flg());
					})
					,j -> j
						.add(MAM_STTL_R.class, r -> toCondition(
							r.getStringNE("ar_sttl_cd2")
						))
						.addSelect(m -> toArray(
							m.sttl_nm
							,m.bill_tax_disp_flg
						))
						.addMap((r, m) -> {
							r.setStringNE("ar_sttl_nm2", m.sttl_nm());
							r.setBooleanNE("bill_tax_disp_flg2", m.bill_tax_disp_flg());
					})
				)
			);
	}
	
	/**
	 * -- MSBGL5040_MST_BILL_D_Query_S02
	 */
	static MCQueryPlan MSBGL5040_MST_BILL_D_S02() {
		MST_BILL_D_R S0_T1 = MST_BILL_D_R.create("T1");
		MST_BILL_R S0_T2 = MST_BILL_R.create("T2");
		MAM_BP_R S0_M1 = MAM_BP_R.create("M1");
		MAM_BP_SUB_R S0_M2 = MAM_BP_SUB_R.create("M2");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBGL5040_MST_BILL_D_Query_S02")
					.mainQuery()
					.selectDistinct(
						S0_T1.cst_cd.as("bp_cd"),
						S0_M1.bp_nm,
						S0_M1.bp_alt_nm1,
						S0_M1.bp_alt_nm2,
						S0_M1.bp_alt_nm3,
						S0_M1.bp_alt_nm4,
						decode(
							S0_M2.bp_cd,
							nullValue(),
							S0_M1.zip_cd,
							S0_M2.zip_cd
						).as("zip_cd"),
						decode(
							S0_M2.bp_cd,
							nullValue(),
							S0_M1.addr1,
							S0_M2.addr1
						).as("addr1"),
						decode(
							S0_M2.bp_cd,
							nullValue(),
							S0_M1.addr2,
							S0_M2.addr2
						).as("addr2"),
						decode(
							S0_M2.bp_cd,
							nullValue(),
							S0_M1.addr3,
							S0_M2.addr3
						).as("addr3"),
						decode(
							S0_M2.bp_cd,
							nullValue(),
							S0_M1.addr4,
							S0_M2.addr4
						).as("addr4"),
						decode(
							S0_M2.bp_cd,
							nullValue(),
							S0_M1.tel,
							S0_M2.tel
						).as("tel")
					)
					.from(
						S0_T1
						.innerJoin(S0_T2).on(S0_T1.bill_mng_no.eq(S0_T2.bill_mng_no))
						.leftOuterJoin(S0_M1).on(S0_M1.bp_cd.eq(S0_T1.cst_cd))
						.leftOuterJoin(S0_M2).on(
							bracket(
								S0_M2.bp_cd.eq(S0_T1.cst_cd)
								.and(S0_M2.st_dt.lte(S0_T2.bill_cl_dt))
								.and(S0_M2.end_dt.gte(S0_T2.bill_cl_dt))
							)
						)
					)
					.where(
						value(0).eq(value(0))
						.and(S0_T1.valid_flg.eq(value(true)))
						.and(S0_T1.cst_cd.isNotNull())
						.and(S0_T1.bill_mng_no.eq(bind("bill_mng_no")))
					)
			);
	}
	
	/**
	 * -- MSBGL5040_MST_BILL_Query_S01
	 */
	static MCQueryPlan MSBGL5040_MST_BILL_S01() {
		MST_BILL_R S0_T1 = MST_BILL_R.create("T1");
		MSW_BILL_KEY_R S0_W = MSW_BILL_KEY_R.create("W");
		MST_WRK_R S0_T3 = MST_WRK_R.create("T3");
		MAM_BP_R S0_M1 = MAM_BP_R.create("M1");
		MAM_DPT_R S0_M2 = MAM_DPT_R.create("M2");
		MAM_CUR_R S0_M3 = MAM_CUR_R.create("M3");
		MAM_BANK_AC_R S0_M4 = MAM_BANK_AC_R.create("M4");
		MAM_BANK_R S0_M5 = MAM_BANK_R.create("M5");
		MAM_BANK_BRANCH_R S0_M6 = MAM_BANK_BRANCH_R.create("M6");
		MAM_BP_SUB_R S0_M7 = MAM_BP_SUB_R.create("M7");
		MAM_CO_R S0_M8 = MAM_CO_R.create("M8");
		MAM_CNTRY_R S0_M9 = MAM_CNTRY_R.create("M9");
		MAM_CNTRY_R S0_M10 = MAM_CNTRY_R.create("M10");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBGL5040_MST_BILL_Query_S01")
					.mainQuery()
					.select(
						S0_T1.bill_cl_dt,
						MSPA_AR_UTIL$F_GET_BILL_CL_DAY(
							S0_T1.bill_cl_dt,
							nvl(
								S0_T1.bill_cl_typ,
								S0_M1.bill_cl_typ
							),
							nullValue()
						).as("bill_cl_day"),
						S0_T1.bill_dt,
						FCPA_CO$F_GET_CO_NM1(FCPA_CONTEXT$F_GET_LOCALE()).as("co_nm"),
						S0_T1.prnt_flg,
						S0_T1.bill_no,
						S0_T1.bill_rev,
						S0_T1.wrk_no,
						S0_T3.wrk_nm,
						S0_T1.bcst_cd,
						S0_M1.bp_nm.as("bcst_nm"),
						S0_M1.bp_alt_nm1,
						S0_M1.bp_alt_nm2,
						S0_M1.bp_alt_nm3,
						S0_M1.bp_alt_nm4,
						S0_T1.rcv_schd_adjst_flg,
						decode(
							S0_M7.bp_cd,
							nullValue(),
							S0_M1.bill_zip_cd,
							S0_M7.bill_zip_cd
						).as("bill_zip_cd"),
						decode(
							S0_M7.bp_cd,
							nullValue(),
							S0_M1.bill_addr1,
							S0_M7.bill_addr1
						).as("bill_addr1"),
						decode(
							S0_M7.bp_cd,
							nullValue(),
							S0_M1.bill_addr2,
							S0_M7.bill_addr2
						).as("bill_addr2"),
						decode(
							S0_M7.bp_cd,
							nullValue(),
							S0_M1.bill_addr3,
							S0_M7.bill_addr3
						).as("bill_addr3"),
						decode(
							S0_M7.bp_cd,
							nullValue(),
							S0_M1.bill_addr4,
							S0_M7.bill_addr4
						).as("bill_addr4"),
						decode(
							S0_M7.bp_cd,
							nullValue(),
							S0_M1.bill_bcst_nm,
							S0_M7.bill_bcst_nm
						).as("bill_bcst_nm"),
						decode(
							S0_M7.bp_cd,
							nullValue(),
							S0_M1.bill_bcst_dpt,
							S0_M7.bill_bcst_dpt
						).as("bill_bcst_dpt"),
						decode(
							S0_M7.bp_cd,
							nullValue(),
							S0_M1.bill_bcst_psn,
							S0_M7.bill_bcst_psn
						).as("bill_bcst_psn"),
						decode(
							S0_M7.bp_cd,
							nullValue(),
							S0_M1.bill_bcst_psn_title,
							S0_M7.bill_bcst_psn_title
						).as("bill_bcst_psn_title"),
						decode(
							S0_M7.bp_cd,
							nullValue(),
							S0_M1.bill_tel,
							S0_M7.bill_tel
						).as("bill_tel"),
						S0_M1.bill_can_slip_typ,
						S0_M1.bill_dtl_sort_typ,
						S0_M1.bill_dtl_subttl_typ,
						S0_M1.bill_dtl_outp_flg,
						S0_M1.bill_dtl_brk_typ,
						S0_M1.bfw_bal_disp_flg,
						S0_M1.bill_dtl_rcv_flg,
						S0_M1.bill_prnt_typ,
						S0_M1.sls_dtl_outp_typ,
						S0_T1.bill_each_sls_flg,
						S0_T1.bill_dpt_cd,
						S0_M2.dpt_nm,
						S0_M2.tel.as("dpt_tel"),
						S0_T1.bill_amt,
						S0_T1.adv_amt_bal,
						S0_T1.adv_amt,
						S0_T1.adv_setoff_amt,
						S0_T1.adv_setoff_tax_amt,
						S0_T1.trd_cur_cd.as("cur_cd"),
						S0_M3.cur_nm,
						S0_M3.amt_dec_place,
						S0_M3.upri_dec_place,
						S0_T1.bill_xrate,
						S0_T1.last_bill_amt,
						S0_M2.rcv_bank_ac_cd,
						S0_M4.bank_cd,
						S0_M5.bank_nm,
						S0_M4.branch_cd.as("bank_ac_cd"),
						S0_M6.branch_nm.as("bank_ac_nm"),
						S0_M4.bank_ac_typ,
						S0_M4.bank_ac_no,
						S0_M4.bank_ac_holder,
						S0_T1.sub_char1,
						S0_T1.sub_char2,
						S0_T1.sub_char3,
						S0_T1.bill_mng_no
						,S0_T1.bill_d_sel_flg
						,S0_M9.cntry_nm
						,S0_M10.cntry_nm.as("bill_cntry_nm")
					)
					.from(
						S0_T1
						.innerJoin(S0_W).on(S0_W.bill_mng_no.eq(S0_T1.bill_mng_no))
						.leftOuterJoin(S0_T3).on(S0_T3.wrk_no.eq(S0_T1.wrk_no))
						.leftOuterJoin(S0_M1).on(S0_M1.bp_cd.eq(S0_T1.bcst_cd))
						.leftOuterJoin(S0_M2).on(
							bracket(
								S0_M2.dpt_cd.eq(S0_T1.bill_dpt_cd)
								.and(S0_T1.base_dt.between(S0_M2.st_dt, S0_M2.end_dt))
							)
						)
						.leftOuterJoin(S0_M3).on(S0_M3.cur_cd.eq(S0_T1.trd_cur_cd))
						.leftOuterJoin(S0_M4).on(S0_M4.bank_ac_cd.eq(S0_M2.rcv_bank_ac_cd))
						.leftOuterJoin(S0_M5).on(S0_M5.bank_cd.eq(S0_M4.bank_cd))
						.leftOuterJoin(S0_M6).on(
							bracket(
								S0_M6.bank_cd.eq(S0_M4.bank_cd)
								.and(S0_M6.branch_cd.eq(S0_M4.branch_cd))
							)
						)
						.leftOuterJoin(S0_M7).on(
							bracket(
								S0_M7.bp_cd.eq(S0_T1.bcst_cd)
								.and(S0_M7.st_dt.lte(S0_T1.bill_cl_dt))
								.and(S0_M7.end_dt.gte(S0_T1.bill_cl_dt))
							)
						)
						.crossJoin(S0_M8)
						.leftOuterJoin(S0_M9).on(
							bracket(
								S0_M9.cntry_cd.eq(S0_M8.cntry_cd)
							)
						)
						.leftOuterJoin(S0_M10).on(
							bracket(
								S0_M10.cntry_cd.eq(S0_M1.cntry_cd)
							)
						)
					)
					.where(
						value(0).eq(value(0))
					)
					.orderBy(S0_T1.bill_mng_no.asc())
					.forUpdate(S0_T1.bill_mng_no)
			);
	}
	/**
	 * -- MSBGL5040_MST_DLV_SLIP_D_Query_S01
	 */
	static MCQueryPlan MSBGL5040_MST_DLV_SLIP_D_S01() {
		MCTempView S0_W = createTempView("W");
		MST_BILL_D_R S1_T1 = MST_BILL_D_R.create("T1");
		MSW_BILL_KEY_R S1_W = MSW_BILL_KEY_R.create("W");
		MST_SLS_ACT_D_R S1_T2 = MST_SLS_ACT_D_R.create("T2");
		MST_IV_MAP_R S1_T3 = MST_IV_MAP_R.create("T3");
		MST_SHIP_ALLOC_STS_R S1_T4 = MST_SHIP_ALLOC_STS_R.create("T4");
		MST_SHIP_ACT_D_R S1_T5 = MST_SHIP_ACT_D_R.create("T5");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBGL5040_MST_DLV_SLIP_D_Query_S01")
					.mainQuery()
					.select(
						S0_W.pr(S1_T1.act_d_no),
						S0_W.pr(S1_T1.act_d_seq),
						listAgg(S0_W.pr(S1_T5.dlv_slip_d_no), value(":"))
							.withinGroup()
							.orderBy(S0_W.pr(S1_T5.dlv_slip_d_no).asc()).as("ship_dlv_slip_d_no")
					)
					.from(
						subQuery()
						.selectDistinct(
							S1_T1.act_d_no,
							S1_T1.act_d_seq,
							S1_T5.dlv_slip_d_no
						)
						.from(
							S1_T1
							.innerJoin(S1_W).on(
								bracket(
									S1_W.bill_mng_no.eq(S1_T1.bill_mng_no)
								)
							)
							.leftOuterJoin(S1_T2).on(
								bracket(
									S1_T2.sls_act_d_no.eq(S1_T1.act_d_no)
									.and(S1_T2.sls_act_d_seq.eq(S1_T1.act_d_seq))
								)
							)
							.leftOuterJoin(S1_T3).on(
								bracket(
									S1_T3.iv_d_no.eq(S1_T2.iv_d_no)
								)
							)
							.leftOuterJoin(S1_T4).on(
								bracket(
									S1_T4.ship_schd_no.eq(S1_T3.ship_schd_no)
									.and(S1_T4.ship_act_qty.neq(value(0)))
								)
							)
							.leftOuterJoin(S1_T5).on(
								bracket(
									S1_T5.ship_alloc_sts_no.eq(S1_T4.ship_alloc_sts_no)
									.and(S1_T5.can_flg.eq(value(false)))
								)
							)
						)
						.where(
							value(0).eq(value(0))
							.and(S1_T1.bill_d_typ.eq(value(MSC_BILL_D_TYP.SLS.value())))
							.and(S1_T1.trd_ptn_typ.neq(value(MAC_TRD_PTN_TYP.TAX_DIFF_BILL_CL.value())))
							.and(S1_T1.valid_flg.eq(value(true)))
							.and(S1_T1.bill_prnt_tgt_flg.eq(value(true)))
							.and(S1_T1.ship_dlv_slip_multi_flg.eq(value(true)))
						).view(S0_W)
					)
					.groupBy(
						S0_W.pr(S1_T1.act_d_no),
						S0_W.pr(S1_T1.act_d_seq)
					)
			);
	}
	
}