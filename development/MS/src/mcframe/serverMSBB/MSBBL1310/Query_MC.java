package mcframe.serverMSBB.MSBBL1310;

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
	 * -- MSBBL1310_DLV_SLIP_D_Query_S01
	 */
	static MCQueryPlan MSBBL1310_DLV_SLIP_D_S01() {
		MST_DLV_SLIP_R S0_T1 = MST_DLV_SLIP_R.create("T1");
		MST_DLV_SLIP_D_R S0_T2 = MST_DLV_SLIP_D_R.create("T2");
		MST_SLS_SCHD_R S0_T3 = MST_SLS_SCHD_R.create("T3");
		MST_SLO_D_R S0_T4 = MST_SLO_D_R.create("T4");
		MST_SHIP_PR_R S0_T6 = MST_SHIP_PR_R.create("T6");
		MAM_ITM_R S0_ITM = MAM_ITM_R.create("ITM");
		MAM_BP_R S0_DLV = MAM_BP_R.create("DLV");
		MAM_BP_R S0_CST = MAM_BP_R.create("CST");
		MAVM_ITM_UNIT_R S0_BIU = MAVM_ITM_UNIT_R.create("BIU");
		MAM_TAX_R S0_TAX = MAM_TAX_R.create("TAX");
		MAM_DPT_R S0_DPT = MAM_DPT_R.create("DPT");
		MAM_EDI_IF_CTL_R S0_EDI = MAM_EDI_IF_CTL_R.create("EDI");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBBL1310_DLV_SLIP_D_Query_S01")
					.mainQuery()
					.select(
						value(false).as("abort_flg"),
						value(false).as("sls_cststk_flg"),
						S0_T2.itm_cd,
						S0_T2.itm_sub1,
						S0_T2.itm_sub2,
						S0_T2.itm_sub3,
						nvl(
							S0_T2.itm_nm,
							S0_ITM.itm_nm
						).as("itm_nm"),
						S0_ITM.asset_mng_typ,
						S0_T2.sundry_itm_flg,
						S0_T3.sls_schd_dt,
						S0_T1.dlv_id_cd.as("dlv_cd"),
						nvl(
							S0_T1.dlv_id_nm,
							S0_DLV.bp_nm
						).as("dlv_nm"),
						S0_T1.dlv_zip_cd,
						S0_T1.dlv_addr1,
						S0_T1.dlv_addr2,
						S0_T1.dlv_addr3,
						S0_T1.dlv_addr4,
						S0_T1.dlv_cntct_dpt,
						S0_T1.dlv_cntct_psn,
						S0_T1.dlv_tel,
						S0_T1.dlv_fax,
						S0_DLV.cntry_cd,
						S0_T1.pri_prnt_flg,
						S0_T4.dest_cd1,
						S0_T4.dest_cd2,
						S0_T4.dest_cd3,
						S0_T2.trd_unit_cd,
						S0_T2.base_unit_cd,
						bracket(
							S0_T3.base_unit_qty.subtract(S0_T3.base_unit_sls_qty)
						).as("base_unit_qty"),
						S0_T2.base_unit_qty.as("ship_qty"),
						S0_T3.base_unit_abort_qty.as("abort_qty"),
						S0_T3.base_unit_sls_qty.as("sls_qty"),
						S0_T2.interim_flg,
						S0_T4.upri_not_tgt_flg,
						nvl(
							S0_T4.tax_fix_flg,
							value(false)
						).as("tax_fix_flg"),
						S0_T2.tax_cd,
						S0_TAX.tax_nm,
						S0_TAX.tax_rate,
						S0_T4.dscnt_rsn_cd,
						nvl(
							S0_T4.cost_upri,
							MAPA_STD_COST$F_GET_STD_UPRI(
								S0_T2.itm_cd,
								S0_T2.itm_sub1,
								S0_T2.itm_sub2,
								S0_T2.itm_sub3,
								trunc(
									S0_T1.ship_tm,
									MCDateFmt.DD
								),
								bind("wg_cd"),
								value("1")
							)
						).as("cost_upri"),
						nvl(
							nvl(
								S0_T4.bill_crryovr_times,
								S0_ITM.bill_crryovr_times
							),
							S0_CST.bill_crryovr_times
						).as("bill_crryovr_times"),
						S0_T2.lot_no,
						S0_T2.sublot_no,
						S0_T2.sno1,
						S0_T2.sno2,
						S0_T2.sno3,
						S0_T2.sno4,
						S0_T2.cst_po_d_no,
						S0_T2.cst_itm_cd,
						S0_T2.cst_itm_nm,
						S0_T2.rsn_cd.as("sls_rsn_cd"),
						S0_T2.bd_dpt_cd,
						S0_DPT.dpt_nm.as("bd_dpt_nm"),
						S0_T2.wtax_rate,
						S0_T2.wtax_amt,
						S0_T2.trd_d_rmrks,
						cases()
							.when(S0_EDI.bp_cd.isNotNull())
								.then(nullValue())
							.otherwise(value(MSC_ACCPT_STS_TYP.OTR.value())).as("accpt_sts_typ"),
						S0_T4.qtn_d_no,
						S0_T2.slo_d_no,
						S0_T2.dlv_slip_d_no.as("ship_dlv_slip_d_no"),
						S0_T2.dlv_slip_d_seq,
						S0_ITM.lot_mng_typ,
						S0_ITM.sublot_mng_typ,
						S0_ITM.ver_flg,
						S0_T4.not_lot_mix_flg,
						S0_T4.not_sublot_mix_flg,
						S0_ITM.sno1_mng_typ,
						S0_ITM.sno2_mng_typ,
						S0_ITM.sno3_mng_typ,
						S0_ITM.sno4_mng_typ,
						S0_ITM.bill_crryovr_times.as("itm_bill_crryovr_times"),
						S0_ITM.stk_mng_typ,
						S0_ITM.dscnt_itm_flg,
						S0_ITM.sls_upri_cng_flg,
						S0_ITM.dec_place.as("base_unit_dec_place"),
						S0_ITM.rnd_typ.as("base_unit_rnd_typ"),
						S0_TAX.inc_tax_flg,
						S0_TAX.tax_typ,
						S0_T1.dlv_sundry_flg,
						S0_T3.sls_schd_no,
						S0_T3.base_unit_qty.as("sls_schd_qty"),
						S0_T3.upd_cntr.as("sls_schd_upd_cntr"),
						S0_T6.ship_pr_no,
						S0_T6.upd_cntr.as("ship_pr_upd_cntr"),
						nvl(
							S0_T2.trd_unit_cd,
							S0_T4.trd_unit_cd
						).as("src_trd_unit_cd"),
						nvl(
							S0_T2.trd_unit_qty,
							S0_T4.trd_unit_qty
						).as("src_trd_unit_qty"),
						nvl(
							S0_T2.trd_cur_upri,
							S0_T4.trd_cur_upri
						).as("src_trd_cur_upri"),
						nvl(
							S0_T2.trd_cur_amt,
							S0_T4.trd_cur_amt
						).as("src_trd_cur_amt"),
						nvl(
							S0_T2.trd_cur_tax_amt,
							S0_T4.trd_cur_tax_amt
						).as("src_trd_cur_tax_amt"),
						nvl(
							S0_T2.trd_cur_dscnt_amt,
							S0_T4.trd_cur_dscnt_amt
						).as("src_trd_cur_dscnt_amt"),
						bracket(
							nvl(
								S0_T2.trd_cur_amt,
								S0_T4.trd_cur_amt
							).add(
								nvl(
									S0_T2.trd_cur_tax_amt,
									S0_T4.trd_cur_tax_amt
								)
							)
						).as("src_trd_cur_inc_tax_amt"),
						S0_T4.base_unit_qty.as("init_schd_qty"),
						S0_T4.trd_cur_dscnt_amt.as("init_schd_dscnt_amt"),
						decode(
							S0_TAX.inc_tax_flg,
							value(false),
							S0_T2.trd_cur_amt,
							S0_T2.trd_cur_amt.add(S0_T2.trd_cur_tax_amt)
						).as("init_schd_amt"),
						S0_T4.itm_cd.as("join_itm_cd_"),
						S0_T4.itm_sub1.as("join_itm_sub1_"),
						S0_T4.itm_sub2.as("join_itm_sub2_"),
						S0_T4.itm_sub3.as("join_itm_sub3_"),
						S0_T4.trd_unit_cd.as("join_trd_unit_cd_")
					)
					.from(
						S0_T1
						.innerJoin(S0_T2).on(
							bracket(
								S0_T1.dlv_slip_no.eq(S0_T2.dlv_slip_no)
								.and(S0_T1.dlv_slip_seq.eq(S0_T2.dlv_slip_d_seq))
							)
						)
						.innerJoin(S0_T3).on(
							bracket(
								S0_T2.dlv_slip_d_no.eq(S0_T3.dlv_slip_d_no)
							)
						)
						.leftOuterJoin(S0_T4).on(
							bracket(
								S0_T2.slo_d_no.eq(S0_T4.slo_d_no)
							)
						)
						.leftOuterJoin(S0_T6).on(
							bracket(
								S0_T4.slo_d_no.eq(S0_T6.slo_d_no)
							)
						)
						.leftOuterJoin(S0_ITM).on(
							bracket(
								S0_T2.itm_cd.eq(S0_ITM.itm_cd)
								.and(S0_T2.itm_sub1.eq(S0_ITM.itm_sub1))
								.and(S0_T2.itm_sub2.eq(S0_ITM.itm_sub2))
								.and(S0_T2.itm_sub3.eq(S0_ITM.itm_sub3))
							)
						)
						.leftOuterJoin(S0_DLV).on(
							bracket(
								S0_T1.dlv_id_cd.eq(S0_DLV.bp_cd)
							)
						)
						.leftOuterJoin(S0_CST).on(
							bracket(
								S0_T1.bp_cd.eq(S0_CST.bp_cd)
							)
						)
						.leftOuterJoin(S0_BIU).on(
							bracket(
								S0_T2.itm_cd.eq(S0_BIU.itm_cd)
								.and(S0_T2.itm_sub1.eq(S0_BIU.itm_sub1))
								.and(S0_T2.itm_sub2.eq(S0_BIU.itm_sub2))
								.and(S0_T2.itm_sub3.eq(S0_BIU.itm_sub3))
								.and(S0_T2.base_unit_cd.eq(S0_BIU.unit_cd))
							)
						)
						.leftOuterJoin(S0_TAX).on(
							bracket(
								S0_T2.tax_cd.eq(S0_TAX.tax_cd)
							)
						)
						.leftOuterJoin(S0_DPT).on(
							bracket(
								S0_T2.bd_dpt_cd.eq(S0_DPT.dpt_cd)
								.and(S0_T1.ac_dt.between(S0_DPT.st_dt, S0_DPT.end_dt))
							)
						)
						.leftOuterJoin(S0_EDI).on(
							bracket(
								S0_EDI.bp_cd.eq(S0_T1.bp_cd)
								.and(S0_EDI.if_proc_typ.eq(value(MAC_IF_PROC_TYP.ACCPT_RECV.value())))
								.and(bind("today").between(S0_EDI.st_dt, S0_EDI.end_dt))
							)
						)
					)
					.where(
						value(1).eq(value(1))
						.and(S0_T1.dlv_slip_no.eq(bind("ship_dlv_slip_no")))
						.and(S0_T1.dlv_slip_seq.eq(bind("ship_dlv_slip_seq")))
						.and(S0_T3.cmpl_flg.eq(value(false)))
						.and(S0_T3.sls_ac_abl_flg.eq(value(true)))
					)
					.orderBy(S0_T2.dlv_slip_d_no.asc())
			)
			.setJoinInfo(
				joinInfo(
					j -> j
						.add(MAM_CNTRY_R.class, r -> toCondition(
							r.getStringNE("cntry_cd")
						))
						.addSelect(m -> toArray(
							m.cntry_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("cntry_nm", m.cntry_nm());
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
						.add(MAVM_ITM_UNIT_R.class, r -> toCondition(
							r.getStringNE("itm_cd"),
							r.getStringNE("itm_sub1"),
							r.getStringNE("itm_sub2"),
							r.getStringNE("itm_sub3"),
							r.getStringNE("trd_unit_cd")
						))
						.addSelect(m -> toArray(
							m.conv_base_qty,
							m.conv_qty,
							m.dec_place,
							m.rnd_typ
						))
						.addMap((r, m) -> {
							r.setNumberNE("trd_unit_dec_place", m.dec_place());
							r.setNumberNE("trd_unit_conv_base_qty", m.conv_base_qty());
							r.setNumberNE("trd_unit_conv_qty", m.conv_qty());
							r.setStringNE("trd_unit_rnd_typ", m.rnd_typ());
							r.setNumberNE("schd_trd_unit_conv_base_qty", m.conv_base_qty());
							r.setNumberNE("schd_trd_unit_conv_qty", m.conv_qty());
					}),
					j -> j
						.add(MAM_UNIT_R.class, r -> toCondition(
							r.getStringNE("base_unit_cd")
						))
						.addSelect(m -> toArray(
							m.unit_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("base_unit_nm", m.unit_nm());
					}),
					j -> j
						.add(MAVM_ITM_UNIT_R.class, r -> toCondition(
							r.getStringNE("join_itm_cd_"),
							r.getStringNE("join_itm_sub1_"),
							r.getStringNE("join_itm_sub2_"),
							r.getStringNE("join_itm_sub3_"),
							r.getStringNE("join_trd_unit_cd_")
						))
						.addSelect(m -> toArray(
							m.conv_base_qty,
							m.conv_qty,
							m.dec_place,
							m.rnd_typ
						))
						.addMap((r, m) -> {
							r.setNumberNE("src_trd_unit_dec_place", m.dec_place());
							r.setNumberNE("src_trd_unit_conv_base_qty", m.conv_base_qty());
							r.setNumberNE("src_trd_unit_conv_qty", m.conv_qty());
							r.setStringNE("src_trd_unit_rnd_typ", m.rnd_typ());
					}),
					j -> j
						.add(MAM_TAX_R.class, r -> toCondition(
							r.getStringNE("tax_cd")
						))
						.addSelect(m -> toArray(
							m.inc_tax_flg,
							m.tax_rate
						))
						.addMap((r, m) -> {
							r.setNumberNE("schd_tax_rate", m.tax_rate());
							r.setBooleanNE("schd_inc_tax_flg", m.inc_tax_flg());
					}),
					j -> j
						.add(MAM_BIZ_RSN_R.class, r -> toCondition(
							r.getStringNE("dscnt_rsn_cd")
						))
						.addSelect(m -> toArray(
							m.biz_rsn_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("dscnt_rsn_nm", m.biz_rsn_nm());
					}),
					j -> j
						.add(MAM_BIZ_RSN_R.class, r -> toCondition(
							r.getStringNE("sls_rsn_cd")
						))
						.addSelect(m -> toArray(
							m.biz_rsn_nm,
							m.sls_acxfr_flg
						))
						.addMap((r, m) -> {
							r.setStringNE("sls_rsn_nm", m.biz_rsn_nm());
							r.setBooleanNE("sls_acxfr_flg", m.sls_acxfr_flg());
					}),
					j -> j
						.add(MSVT_WRK_SNO_R.class, r -> toCondition(
							r.getStringNE("sno1")
						))
						.addSelect(m -> toArray(
							m.wrk_no
						))
						.addMap((r, m) -> {
							r.setStringNE("wrk_no", m.wrk_no());
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
					})
				)
			);
	}
	
	/**
	 * -- MSBBL1310_DLV_SLIP_Query_S01
	 */
	static MCQueryPlan MSBBL1310_DLV_SLIP_S01() {
		MST_DLV_SLIP_R S0_T1 = MST_DLV_SLIP_R.create("T1");
		MAM_CO_R S0_CO = MAM_CO_R.create("CO");
		MST_SHIP_ACT_R S0_T2 = MST_SHIP_ACT_R.create("T2");
		MST_SLO_R S0_T3 = MST_SLO_R.create("T3");
		MAM_BP_R S0_CST = MAM_BP_R.create("CST");
		MAM_DPT_R S0_DPT1 = MAM_DPT_R.create("DPT1");
		MAM_DPT_R S0_DPT2 = MAM_DPT_R.create("DPT2");
		MAM_CUR_R S0_PCUR = MAM_CUR_R.create("PCUR");
		MAVM_RD_DPT_R S0_DAC = MAVM_RD_DPT_R.create("DAC");
		MAM_EDI_IF_CTL_R S1_MA = MAM_EDI_IF_CTL_R.create("MA");
		MST_DLV_SLIP_R S0_W1 = MST_DLV_SLIP_R.create("W1");
		MCTempView S0_W2 = createTempView("W2");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBBL1310_DLV_SLIP_Query_S01")
					.mainQuery()
					.select(
						S0_T1.trd_cd,
						S0_T1.dlv_slip_no.as("ship_dlv_slip_no"),
						S0_T1.dlv_slip_seq.as("ship_dlv_slip_seq"),
						S0_T1.dlv_slip_act_no.as("ship_act_no"),
						trunc(
							S0_T2.ship_tm,
							MCDateFmt.DD
						).as("ship_dt"),
						S0_T2.ship_tm.as("ship_hm"),
						trunc(
							S0_T2.dlv_tm,
							MCDateFmt.DD
						).as("dlv_dt"),
						S0_T2.dlv_tm.as("dlv_hm"),
						S0_T1.bp_cd.as("cst_cd"),
						S0_CST.bp_nm.as("cst_nm"),
						S0_T1.sls_basis_typ,
						S0_T1.usr_cd.as("sls_usr_cd"),
						S0_T1.dpt_cd.as("sls_dpt_cd"),
						S0_DPT1.dpt_nm.as("sls_dpt_nm"),
						S0_T1.usr_cd.as("cst_usr_cd"),
						S0_T1.dpt_cd.as("cst_dpt_cd"),
						S0_T1.wg_cd,
						S0_T1.trd_cur_cd,
						S0_CO.base_cur_cd,
						S0_T3.xrate_inpt_flg,
						cases()
							.when(S0_T3.xrate_inpt_flg.eq(value(true)))
								.then(S0_T3.xrate)
							.otherwise(
								MAPA_XCHNG$F_GET_SLS_XRATE_NE(
									S0_T1.trd_cur_cd,
									bind("today")
								)
							).as("xrate"),
						S0_CO.ptax_cur_cd,
						S0_PCUR.cur_nm.as("ptax_cur_nm"),
						S0_T3.ptax_xrate_inpt_flg,
						cases()
							.when(S0_CO.ptax_cur_cd.isNotNull())
								.then(
									cases()
										.when(S0_T3.ptax_xrate_inpt_flg.eq(value(true)))
											.then(S0_T3.ptax_xrate)
										.otherwise(
											MAPA_XCHNG$F_GET_XRATE_NE(
												S0_T1.trd_cur_cd,
												S0_CO.ptax_cur_cd,
												S0_CO.sls_xrate_cd,
												bind("today")
											)
										)
							)
							.otherwise(nullValue()).as("ptax_xrate"),
						S0_T3.qtn_no,
						S0_T3.qtn_rev,
						S0_T1.slo_no,
						S0_T1.cst_po_no,
						S0_T1.slip_prnt_flg.as("dlv_slip_prntd_flg"),
						S0_CST.acst_cd,
						nvl(
							S0_T3.ar_dpt_cd,
							cases()
								.when(S0_CST.ar_dpt_typ.eq(value(MAC_AR_DPT_TYP.SLS.value())))
									.then(S0_T1.dpt_cd)
								.when(S0_CST.ar_dpt_typ.eq(value(MAC_AR_DPT_TYP.AR.value())))
									.then(
										MAPA_BP$F_GET_AR_DPT_CD_NE(
											S0_T1.bp_cd,
											bind("today"),
											value(false)
										)
								)
								.otherwise(nullValue())
						).as("ar_dpt_cd"),
						S0_DPT2.dpt_nm.as("ar_dpt_nm"),
						S0_T1.trd_rmrks,
						S0_T3.tterm_cd1,
						S0_T3.tterm_rmrks1,
						S0_T3.tterm_cd2,
						S0_T3.tterm_rmrks2,
						S0_T3.tterm_cd3,
						S0_T3.tterm_rmrks3,
						S0_CST.bill_crryovr_times.as("cst_bill_crryovr_times"),
						S0_CST.sls_amt_rnd_typ,
						S0_CST.sls_upri_rnd_typ,
						S0_CST.sls_tax_rnd_typ,
						S0_CST.ar_dpt_typ,
						S0_PCUR.amt_dec_place.as("ptax_cur_amt_dec_place"),
						S0_PCUR.upri_dec_place.as("ptax_cur_upri_dec_place"),
						S0_T1.trd_ptn_typ,
						S0_T3.upd_cntr.as("slo_upd_cntr"),
						S0_CO.xrate_rnd_typ,
						S0_CO.wtax_rnd_typ,
						S0_CO.sls_xrate_cd.as("xrate_cd"),
						S0_CST.sls_upri_cng_flg,
						decode(
							bracket(
								subQuery()
								.select(S1_MA.bp_cd)
								.from(S1_MA)
								.where(
									S1_MA.bp_cd.eq(S0_T1.bp_cd)
									.and(bind("today").between(S1_MA.st_dt, S1_MA.end_dt))
									.and(S1_MA.if_proc_typ.eq(value(MAC_IF_PROC_TYP.ACCPT_RECV.value())))
									.and(S1_MA.del_flg.eq(value(false)))
								)
							),
							nullValue(),
							value(false),
							value(true)
						).as("edi_flg")
					)
					.from(
						subQuery()
						.select(
							S0_W1.dlv_slip_no,
							max(S0_W1.dlv_slip_seq).as("dlv_slip_seq")
						)
						.from(S0_W1)
						.where(
							S0_W1.dlv_slip_no.eq(bind("srch_tgt_no"))
							.and(S0_W1.trn_typ.eq(value(MSC_TRN_TYP.SHIP.value())))
							.and(S0_W1.slip_sts_typ.neq(value(MAC_SLIP_STS_TYP.CAN.value())))
						)
						.groupBy(S0_W1.dlv_slip_no)
						.view(S0_W2)
						.innerJoin(S0_T1).on(
							S0_T1.dlv_slip_no.eq(S0_W2.pr("dlv_slip_no"))
							.and(S0_T1.dlv_slip_seq.eq(S0_W2.pr("dlv_slip_seq")))
						)
						.crossJoin(S0_CO)
						.innerJoin(S0_T2).on(
							bracket(
								S0_T1.dlv_slip_act_no.eq(S0_T2.ship_act_no)
								.and(S0_T2.can_flg.eq(value(false)))
							)
						)
						.leftOuterJoin(S0_T3).on(
							bracket(
								S0_T1.slo_no.eq(S0_T3.slo_no)
							)
						)
						.leftOuterJoin(S0_CST).on(
							bracket(
								S0_T1.bp_cd.eq(S0_CST.bp_cd)
							)
						)
						.leftOuterJoin(S0_DPT1).on(
							bracket(
								S0_T1.dpt_cd.eq(S0_DPT1.dpt_cd)
								.and(bind("today").between(S0_DPT1.st_dt, S0_DPT1.end_dt))
							)
						)
						.leftOuterJoin(S0_DPT2).on(
							bracket(
								nvl(
									S0_T3.ar_dpt_cd,
									cases()
										.when(S0_CST.ar_dpt_typ.eq(value(MAC_AR_DPT_TYP.SLS.value())))
											.then(S0_T1.dpt_cd)
										.when(S0_CST.ar_dpt_typ.eq(value(MAC_AR_DPT_TYP.AR.value())))
											.then(
												MAPA_BP$F_GET_AR_DPT_CD_NE(
													S0_T1.bp_cd,
													bind("today"),
													value(false)
												)
										)
										.otherwise(nullValue())
								).eq(S0_DPT2.dpt_cd)
								.and(bind("today").between(S0_DPT2.st_dt, S0_DPT2.end_dt))
							)
						)
						.leftOuterJoin(S0_PCUR).on(
							bracket(
								nvl(
									S0_CO.ptax_cur_cd,
									S0_CO.base_cur_cd
								).eq(S0_PCUR.cur_cd)
							)
						)
						.innerJoin(S0_DAC).on(
							bracket(
								S0_T1.dpt_cd.eq(S0_DAC.dpt_cd)
							)
						)
					)
					.where(
						value(1).eq(value(1))
						.and(
							nvl(
								S0_T3.sls_basis_typ,
								decode(
									S0_T1.sync_flg,
									value(true),
									value(MAC_SLS_BASIS_TYP.SHIP_BASIS.value()),
									S0_T1.sls_basis_typ
								)
							).eq(value(MAC_SLS_BASIS_TYP.IN_BASIS.value()))
							.or(
								nvl(
									S0_T3.sls_basis_typ,
									decode(
										S0_T1.sync_flg,
										value(true),
										value(MAC_SLS_BASIS_TYP.SHIP_BASIS.value()),
										S0_T1.sls_basis_typ
									)
								).eq(value(MAC_SLS_BASIS_TYP.ARRIVAL_BASIS.value()))
							)
						)
						.and(S0_CST.cst_iv_flg.eq(value(false)))
						.and(
							S0_T1.trd_ptn_typ.in(
								value(MAC_TRD_PTN_TYP.SLS.value()),
								value(MAC_TRD_PTN_TYP.SLS_CNSGN.value())
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
						.add(MAM_BP_R.class, r -> toCondition(
							r.getStringNE("acst_cd")
						))
						.addSelect(m -> toArray(
							m.bcst_cd,
							m.bp_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("acst_nm", m.bp_nm());
							r.setStringNE("join_bcst_cd_", m.bcst_cd());
					}),
					j -> j
						.add(MAM_BP_R.class, r -> toCondition(
							r.getStringNE("join_bcst_cd_")
						))
						.addSelect(m -> toArray(
							m.bill_cl_typ
						))
						.addMap((r, m) -> {
							r.setStringNE("bill_cl_typ", m.bill_cl_typ());
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
							r.setNumberNE("trd_cur_amt_dec_place", m.amt_dec_place());
							r.setNumberNE("trd_cur_upri_dec_place", m.upri_dec_place());
					}),
					j -> j
						.add(MAM_CUR_R.class, r -> toCondition(
							r.getStringNE("base_cur_cd")
						))
						.addSelect(m -> toArray(
							m.amt_dec_place,
							m.cur_nm,
							m.upri_dec_place
						))
						.addMap((r, m) -> {
							r.setStringNE("base_cur_nm", m.cur_nm());
							r.setNumberNE("base_cur_amt_dec_place", m.amt_dec_place());
							r.setNumberNE("base_cur_upri_dec_place", m.upri_dec_place());
					}),
					j -> j
						.add(MAM_TTERM_R.class, r -> toCondition(
							r.getStringNE("tterm_cd1")
						))
						.addSelect(m -> toArray(
							m.tterm_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("tterm_nm1", m.tterm_nm());
					}),
					j -> j
						.add(MAM_TTERM_R.class, r -> toCondition(
							r.getStringNE("tterm_cd2")
						))
						.addSelect(m -> toArray(
							m.tterm_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("tterm_nm2", m.tterm_nm());
					}),
					j -> j
						.add(MAM_TTERM_R.class, r -> toCondition(
							r.getStringNE("tterm_cd3")
						))
						.addSelect(m -> toArray(
							m.tterm_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("tterm_nm3", m.tterm_nm());
					})
				)
			);
	}
	
	/**
	 * -- MSBBL1310_MST_SLS_SCHD_Query_S01
	 */
	static MCQueryPlan MSBBL1310_MST_SLS_SCHD_S01() {
		MST_SLS_SCHD_R S0_T1 = MST_SLS_SCHD_R.create("T1");
		MST_DLV_SLIP_D_R S0_T2 = MST_DLV_SLIP_D_R.create("T2");
		MST_SLO_D_R S0_T3 = MST_SLO_D_R.create("T3");
		MST_DLV_SLIP_R S0_T4 = MST_DLV_SLIP_R.create("T4");
		MST_SLO_R S0_T5 = MST_SLO_R.create("T5");
		MST_IV_D_R S0_T6 = MST_IV_D_R.create("T6");
		MST_IV_R S0_T7 = MST_IV_R.create("T7");
		MAVM_ITM_UNIT_R S0_M2 = MAVM_ITM_UNIT_R.create("M2");
		MAM_TAX_R S0_M3 = MAM_TAX_R.create("M3");
		MAM_CUR_R S0_M4 = MAM_CUR_R.create("M4");
		MAM_BP_R S0_M5 = MAM_BP_R.create("M5");
		MST_DLV_SLIP_D_R S1_ST = MST_DLV_SLIP_D_R.create("ST");
		MST_DLV_SLIP_R S1_ST2 = MST_DLV_SLIP_R.create("ST2");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBBL1310_MST_SLS_SCHD_Query_S01")
					.mainQuery()
					.select(
						nvl(
							S0_T6.trd_unit_cd,
							nvl(
								S0_T2.trd_unit_cd,
								S0_T3.trd_unit_cd
							)
						).as("trd_unit_cd"),
						nvl(
							S0_T6.trd_unit_qty,
							nvl(
								S0_T2.trd_unit_qty,
								S0_T3.trd_unit_qty
							)
						).as("trd_unit_qty"),
						nvl(
							S0_T6.trd_cur_upri,
							nvl(
								S0_T2.trd_cur_upri,
								S0_T3.trd_cur_upri
							)
						).as("trd_cur_upri"),
						nvl(
							S0_T6.trd_cur_dscnt_amt,
							nvl(
								S0_T2.trd_cur_dscnt_amt,
								S0_T3.trd_cur_dscnt_amt
							)
						).as("trd_cur_dscnt_amt"),
						nvl(
							S0_T6.trd_cur_amt,
							nvl(
								S0_T2.trd_cur_amt,
								S0_T3.trd_cur_amt
							)
						).as("trd_cur_amt"),
						nvl(
							S0_T6.trd_cur_tax_amt,
							nvl(
								S0_T2.trd_cur_tax_amt,
								S0_T3.trd_cur_tax_amt
							)
						).as("trd_cur_tax_amt"),
						S0_T1.base_unit_cd,
						S0_M2.conv_base_qty.as("trd_unit_conv_base_qty"),
						S0_M2.conv_qty.as("trd_unit_conv_qty"),
						S0_M3.tax_rate,
						S0_M3.inc_tax_flg,
						S0_M4.amt_dec_place,
						S0_M4.upri_dec_place,
						S0_M5.sls_amt_rnd_typ.as("amt_rnd_typ"),
						S0_M5.sls_tax_rnd_typ.as("tax_rnd_typ"),
						S0_T1.base_unit_qty.as("sls_schd_qty"),
						S0_T1.base_unit_sls_qty.add(S0_T1.base_unit_abort_qty).as("base_unit_cmpl_qty")
					)
					.from(
						S0_T1
						.leftOuterJoin(S0_T2).on(
							bracket(
								S0_T1.dlv_slip_d_no.eq(S0_T2.dlv_slip_d_no)
								.and(
									S0_T2.dlv_slip_d_seq.eq(subQuery()
										.select(max(S1_ST.dlv_slip_d_seq))
										.from(
											S1_ST
											.innerJoin(S1_ST2).on(
												S1_ST.dlv_slip_no.eq(S1_ST2.dlv_slip_no)
												.and(S1_ST.dlv_slip_seq.eq(S1_ST2.dlv_slip_seq))
											)
										)
										.where(
											S1_ST.dlv_slip_d_no.eq(S0_T1.dlv_slip_d_no)
											.and(S1_ST2.trn_typ.eq(value(MSC_TRN_TYP.SHIP.value())))
											.and(S1_ST2.slip_sts_typ.neq(value(MAC_SLIP_STS_TYP.CAN.value())))
											.and(S1_ST2.sync_flg.eq(value(false)))
										)
									)
								)
							)
						)
						.leftOuterJoin(S0_T3).on(S0_T3.slo_d_no.eq(S0_T1.slo_d_no))
						.leftOuterJoin(S0_T4).on(
							bracket(
								S0_T4.dlv_slip_no.eq(S0_T2.dlv_slip_no)
								.and(S0_T4.dlv_slip_seq.eq(S0_T2.dlv_slip_seq))
							)
						)
						.leftOuterJoin(S0_T5).on(S0_T5.slo_no.eq(S0_T3.slo_no))
						.leftOuterJoin(S0_T6).on(S0_T6.iv_d_no.eq(S0_T1.iv_d_no))
						.leftOuterJoin(S0_T7).on(S0_T7.iv_mng_no.eq(S0_T6.iv_mng_no))
						.leftOuterJoin(S0_M2).on(
								bracket(
									nvl(
										S0_T6.itm_cd,
										nvl(
											S0_T2.itm_cd,
											S0_T3.itm_cd
										)
									).eq(S0_M2.itm_cd)
									.and(
										nvl(
											S0_T6.itm_sub1,
											nvl(
												S0_T2.itm_sub1,
												S0_T3.itm_sub1
											)
										).eq(S0_M2.itm_sub1)
									)
									.and(
										nvl(
											S0_T6.itm_sub2,
											nvl(
												S0_T2.itm_sub2,
												S0_T3.itm_sub2
											)
										).eq(S0_M2.itm_sub2)
									)
									.and(
										nvl(
											S0_T6.itm_sub3,
											nvl(
												S0_T2.itm_sub3,
												S0_T3.itm_sub3
											)
										).eq(S0_M2.itm_sub3)
									)
									.and(
										nvl(
											S0_T6.trd_unit_cd,
											nvl(
												S0_T2.trd_unit_cd,
												S0_T3.trd_unit_cd
											)
										).eq(S0_M2.unit_cd)
									)
								)
							)
						.leftOuterJoin(S0_M3).on(
							nvl(
								S0_T6.tax_cd,
								nvl(
									S0_T2.tax_cd,
									S0_T3.tax_cd
								)
							).eq(S0_M3.tax_cd)
						)
						.leftOuterJoin(S0_M4).on(
							nvl(
								S0_T7.trd_cur_cd,
								nvl(
									S0_T4.trd_cur_cd,
									S0_T5.trd_cur_cd
								)
							).eq(S0_M4.cur_cd)
						)
						.leftOuterJoin(S0_M5).on(
							nvl(
								S0_T7.ship_rqst_id_cd,
								nvl(
									S0_T4.bp_cd,
									S0_T5.cst_cd
								)
							).eq(S0_M5.bp_cd)
						)
					)
					.where(
						value(0).eq(value(0))
						.and(S0_T1.sls_schd_no.eq(bind("sls_schd_no")))
					)
			)
			.setJoinInfo(
				joinInfo(
					j -> j
						.add(MAM_UNIT_R.class, r -> toCondition(
							r.getStringNE("base_unit_cd")
						))
						.addSelect(m -> toArray(
							m.dec_place,
							m.rnd_typ
						))
						.addMap((r, m) -> {
							r.setNumberNE("base_unit_dec_place", m.dec_place());
							r.setStringNE("base_unit_rnd_typ", m.rnd_typ());
					})
				)
			);
	}
	
	/**
	 * -- MSBBL1310_QTN_D_Query_S01
	 */
	static MCQueryPlan MSBBL1310_QTN_D_S01() {
		MST_QTN_R S0_T1 = MST_QTN_R.create("T1");
		MST_QTN_D_R S0_T2 = MST_QTN_D_R.create("T2");
		MAM_ITM_R S0_ITM = MAM_ITM_R.create("ITM");
		MAM_BP_R S0_DLV = MAM_BP_R.create("DLV");
		MAM_BP_R S0_CST = MAM_BP_R.create("CST");
		MAVM_ITM_UNIT_R S0_BIU = MAVM_ITM_UNIT_R.create("BIU");
		MAM_TAX_R S0_TAX = MAM_TAX_R.create("TAX");
		MAM_TAX_R S0_NEWTAX = MAM_TAX_R.create("NEWTAX");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBBL1310_QTN_D_Query_S01")
					.mainQuery()
					.select(
						value(false).as("abort_flg"),
						value(false).as("sls_cststk_flg"),
						S0_T2.itm_cd,
						S0_T2.itm_sub1,
						S0_T2.itm_sub2,
						S0_T2.itm_sub3,
						nvl(
							S0_T2.itm_nm,
							S0_ITM.itm_nm
						).as("itm_nm"),
						S0_ITM.asset_mng_typ,
						S0_T2.sundry_itm_flg,
						S0_T2.dlv_cd,
						nvl(
							S0_T2.dlv_nm,
							S0_DLV.bp_nm
						).as("dlv_nm"),
						S0_T2.dlv_zip_cd,
						S0_T2.dlv_addr1,
						S0_T2.dlv_addr2,
						S0_T2.dlv_addr3,
						S0_T2.dlv_addr4,
						S0_T2.dlv_cntct_dpt,
						S0_T2.dlv_cntct_psn,
						S0_T2.dlv_tel,
						S0_T2.dlv_fax,
						S0_DLV.cntry_cd,
						S0_DLV.pri_prnt_flg,
						S0_T2.dest_cd1,
						S0_T2.dest_cd2,
						S0_T2.dest_cd3,
						S0_T2.trd_unit_cd,
						bracket(
							S0_T2.trd_unit_qty.subtract(S0_T2.slo_trnst_qty).subtract(S0_T2.sls_trnst_qty)
						).as("trd_unit_qty"),
						S0_T2.base_unit_cd,
						value(0).as("ship_qty"),
						value(0).as("abort_qty"),
						value(0).as("sls_qty"),
						S0_T2.interim_flg,
						S0_T2.trd_cur_upri,
						S0_T2.upri_not_tgt_flg,
						S0_T2.tax_fix_flg,
						S0_T2.tax_cd,
						S0_TAX.tax_nm,
						S0_TAX.tax_rate,
						S0_T2.dscnt_rsn_cd,
						S0_T2.cost_upri,
						nvl(
							S0_ITM.bill_crryovr_times,
							S0_CST.bill_crryovr_times
						).as("bill_crryovr_times"),
						S0_T2.gd_cd,
						S0_T2.sno1,
						S0_T2.sno2,
						S0_T2.sno3,
						S0_T2.sno4,
						S0_T2.cst_itm_cd,
						S0_T2.cst_itm_nm,
						S0_T2.qtn_d_no,
						S0_T2.disp_seq,
						S0_ITM.lot_mng_typ,
						S0_ITM.lot_no_typ,
						S0_ITM.sublot_mng_typ,
						S0_ITM.sublot_no_typ,
						S0_ITM.ver_flg,
						S0_ITM.sno1_mng_typ,
						S0_ITM.sno2_mng_typ,
						S0_ITM.sno3_mng_typ,
						S0_ITM.sno4_mng_typ,
						S0_ITM.bill_crryovr_times.as("itm_bill_crryovr_times"),
						S0_ITM.stk_mng_typ,
						S0_ITM.dscnt_itm_flg,
						S0_ITM.sls_upri_cng_flg,
						S0_ITM.dec_place.as("base_unit_dec_place"),
						S0_ITM.rnd_typ.as("base_unit_rnd_typ"),
						S0_TAX.inc_tax_flg,
						S0_TAX.tax_typ,
						S0_DLV.dlv_sundry_flg,
						S0_ITM.comp_spec_typ,
						S0_T2.trd_unit_cd.as("src_trd_unit_cd"),
						S0_T2.trd_unit_qty.as("src_trd_unit_qty"),
						S0_T2.trd_cur_upri.as("src_trd_cur_upri"),
						S0_T2.trd_cur_amt.as("src_trd_cur_amt"),
						S0_T2.trd_cur_tax_amt.as("src_trd_cur_tax_amt"),
						S0_T2.trd_cur_dscnt_amt.as("src_trd_cur_dscnt_amt"),
						bracket(
							S0_T2.trd_cur_amt.add(S0_T2.trd_cur_tax_amt)
						).as("src_trd_cur_inc_tax_amt"),
						S0_T2.base_unit_qty.as("init_schd_qty"),
						S0_T2.trd_cur_dscnt_amt.as("init_schd_dscnt_amt"),
						S0_T2.trd_cur_amt.as("init_schd_amt"),
						decode(
							S0_TAX.inc_tax_flg,
							value(false),
							S0_T2.trd_cur_amt,
							S0_T2.trd_cur_amt.add(S0_T2.trd_cur_tax_amt)
						).as("init_schd_amt"),
						MAPA_TAX$F_GET_WTAX_RATE(
							S0_T2.itm_cd,
							S0_T2.itm_sub1,
							S0_T2.itm_sub2,
							S0_T2.itm_sub3,
							bind("today")
						).as("wtax_rate"),
						S0_NEWTAX.tax_cd.as("new_tax_cd"),
						S0_NEWTAX.tax_nm.as("new_tax_nm"),
						S0_NEWTAX.inc_tax_flg.as("new_inc_tax_flg"),
						S0_NEWTAX.tax_typ.as("new_tax_typ"),
						S0_NEWTAX.tax_rate.as("new_tax_rate")
					)
					.from(
						S0_T1
						.innerJoin(S0_T2).on(
							bracket(
								S0_T1.qtn_no.eq(S0_T2.qtn_no)
								.and(S0_T1.qtn_rev.eq(S0_T2.qtn_rev))
							)
						)
						.leftOuterJoin(S0_ITM).on(
							bracket(
								S0_T2.itm_cd.eq(S0_ITM.itm_cd)
								.and(S0_T2.itm_sub1.eq(S0_ITM.itm_sub1))
								.and(S0_T2.itm_sub2.eq(S0_ITM.itm_sub2))
								.and(S0_T2.itm_sub3.eq(S0_ITM.itm_sub3))
							)
						)
						.leftOuterJoin(S0_DLV).on(
							bracket(
								S0_T2.dlv_cd.eq(S0_DLV.bp_cd)
							)
						)
						.leftOuterJoin(S0_CST).on(
							bracket(
								S0_T1.cst_cd.eq(S0_CST.bp_cd)
							)
						)
						.leftOuterJoin(S0_BIU).on(
							bracket(
								S0_T2.itm_cd.eq(S0_BIU.itm_cd)
								.and(S0_T2.itm_sub1.eq(S0_BIU.itm_sub1))
								.and(S0_T2.itm_sub2.eq(S0_BIU.itm_sub2))
								.and(S0_T2.itm_sub3.eq(S0_BIU.itm_sub3))
								.and(S0_T2.base_unit_cd.eq(S0_BIU.unit_cd))
							)
						)
						.leftOuterJoin(S0_TAX).on(
							bracket(
								S0_T2.tax_cd.eq(S0_TAX.tax_cd)
							)
						)
						.leftOuterJoin(S0_NEWTAX).on(
							bracket(
								MAPA_TAX$F_GET_SLS_TAX_CD(
									S0_T2.itm_cd,
									S0_T2.itm_sub1,
									S0_T2.itm_sub2,
									S0_T2.itm_sub3,
									S0_T1.cst_cd,
									bind("today")
								).eq(S0_NEWTAX.tax_cd)
							)
						)
					)
					.where(
						value(1).eq(value(1))
						.and(S0_T1.qtn_no.eq(bind("qtn_no")))
						.and(S0_T1.qtn_rev.eq(bind("qtn_rev")))
						.and(S0_T2.trd_unit_qty.gt(S0_T2.slo_trnst_qty.add(S0_T2.sls_trnst_qty)))
					)
					.orderBy(S0_T2.disp_seq.asc())
			)
			.setJoinInfo(
				joinInfo(
					j -> j
						.add(MAM_CNTRY_R.class, r -> toCondition(
							r.getStringNE("cntry_cd")
						))
						.addSelect(m -> toArray(
							m.cntry_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("cntry_nm", m.cntry_nm());
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
						.add(MAVM_ITM_UNIT_R.class, r -> toCondition(
							r.getStringNE("itm_cd"),
							r.getStringNE("itm_sub1"),
							r.getStringNE("itm_sub2"),
							r.getStringNE("itm_sub3"),
							r.getStringNE("trd_unit_cd")
						))
						.addSelect(m -> toArray(
							m.conv_base_qty,
							m.conv_qty,
							m.dec_place,
							m.rnd_typ
						))
						.addMap((r, m) -> {
							r.setNumberNE("trd_unit_dec_place", m.dec_place());
							r.setNumberNE("trd_unit_conv_base_qty", m.conv_base_qty());
							r.setNumberNE("trd_unit_conv_qty", m.conv_qty());
							r.setStringNE("trd_unit_rnd_typ", m.rnd_typ());
							r.setNumberNE("src_trd_unit_dec_place", m.dec_place());
							r.setNumberNE("src_trd_unit_conv_base_qty", m.conv_base_qty());
							r.setNumberNE("src_trd_unit_conv_qty", m.conv_qty());
							r.setStringNE("src_trd_unit_rnd_typ", m.rnd_typ());
							r.setNumberNE("schd_trd_unit_conv_base_qty", m.conv_base_qty());
							r.setNumberNE("schd_trd_unit_conv_qty", m.conv_qty());
					}),
					j -> j
						.add(MAM_UNIT_R.class, r -> toCondition(
							r.getStringNE("base_unit_cd")
						))
						.addSelect(m -> toArray(
							m.unit_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("base_unit_nm", m.unit_nm());
					}),
					j -> j
						.add(MAM_TAX_R.class, r -> toCondition(
							r.getStringNE("tax_cd")
						))
						.addSelect(m -> toArray(
							m.inc_tax_flg,
							m.tax_rate
						))
						.addMap((r, m) -> {
							r.setNumberNE("schd_tax_rate", m.tax_rate());
							r.setBooleanNE("schd_inc_tax_flg", m.inc_tax_flg());
					}),
					j -> j
						.add(MAM_BIZ_RSN_R.class, r -> toCondition(
							r.getStringNE("dscnt_rsn_cd")
						))
						.addSelect(m -> toArray(
							m.biz_rsn_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("dscnt_rsn_nm", m.biz_rsn_nm());
					}),
					j -> j
						.add(MAM_STK_GD_R.class, r -> toCondition(
							r.getStringNE("gd_cd")
						))
						.addSelect(m -> toArray(
							m.gd_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("gd_nm", m.gd_nm());
					}),
					j -> j
						.add(MST_WRK_SNO_R.class, r -> toCondition(
							r.getStringNE("sno1")
						))
						.addSelect(m -> toArray(
							m.wrk_no
						))
						.addMap((r, m) -> {
							r.setStringNE("wrk_no", m.wrk_no());
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
					})
				)
			);
	}
	
	/**
	 * -- MSBBL1310_QTN_Query_S01
	 */
	static MCQueryPlan MSBBL1310_QTN_S01() {
		MST_QTN_R S0_T = MST_QTN_R.create("T");
		MAM_CO_R S0_CO = MAM_CO_R.create("CO");
		MAM_BP_R S0_CST = MAM_BP_R.create("CST");
		MAM_DPT_R S0_DPT1 = MAM_DPT_R.create("DPT1");
		MAM_DPT_R S0_DPT2 = MAM_DPT_R.create("DPT2");
		MAVM_RD_DPT_R S0_DAC = MAVM_RD_DPT_R.create("DAC");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBBL1310_QTN_Query_S01")
					.mainQuery()
					.select(
						S0_T.trd_cd,
						nullValue().as("can_ac_dt"),
						S0_T.cst_cd,
						S0_CST.bp_nm.as("cst_nm"),
						value(MAC_SLS_BASIS_TYP.SHIP_BASIS.value()).as("sls_basis_typ"),
						S0_T.sls_usr_cd,
						S0_T.sls_dpt_cd,
						S0_DPT1.dpt_nm.as("sls_dpt_nm"),
						S0_T.sls_usr_cd.as("cst_usr_cd"),
						S0_T.sls_dpt_cd.as("cst_dpt_cd"),
						S0_T.wg_cd,
						S0_T.trd_cur_cd,
						S0_CO.base_cur_cd,
						S0_T.xrate_inpt_flg,
						cases()
							.when(S0_T.xrate_inpt_flg.eq(value(true)))
								.then(S0_T.xrate)
							.otherwise(
								MAPA_XCHNG$F_GET_SLS_XRATE_NE(
									S0_T.trd_cur_cd,
									bind("today")
								)
							).as("xrate"),
						S0_CO.ptax_cur_cd,
						cases()
							.when(S0_CO.ptax_cur_cd.isNull())
								.then(nullValue())
							.otherwise(
								MAPA_XCHNG$F_GET_XRATE_NE(
									S0_T.trd_cur_cd,
									S0_CO.ptax_cur_cd,
									S0_CO.sls_xrate_cd,
									bind("today")
								)
							).as("ptax_xrate"),
						S0_T.qtn_no,
						S0_T.qtn_rev,
						value(false).as("dlv_slip_prntd_flg"),
						S0_CST.acst_cd,
						cases()
							.when(S0_CST.ar_dpt_typ.eq(value(MAC_AR_DPT_TYP.SLS.value())))
								.then(S0_T.sls_dpt_cd)
							.when(S0_CST.ar_dpt_typ.eq(value(MAC_AR_DPT_TYP.AR.value())))
								.then(
									MAPA_BP$F_GET_AR_DPT_CD_NE(
										S0_T.cst_cd,
										bind("today"),
										value(false)
									)
							)
							.otherwise(nullValue()).as("ar_dpt_cd"),
						S0_DPT2.dpt_nm.as("ar_dpt_nm"),
						S0_T.tterm_cd1,
						S0_T.tterm_rmrks1,
						S0_T.tterm_cd2,
						S0_T.tterm_rmrks2,
						S0_T.tterm_cd3,
						S0_T.tterm_rmrks3,
						S0_CST.bill_crryovr_times.as("cst_bill_crryovr_times"),
						S0_CST.sls_upri_cng_flg,
						S0_CST.sls_amt_rnd_typ,
						S0_CST.sls_upri_rnd_typ,
						S0_CST.sls_tax_rnd_typ,
						S0_CST.ar_dpt_typ,
						S0_T.upd_cntr.as("qtn_upd_cntr"),
						S0_CO.xrate_rnd_typ,
						S0_CO.wtax_rnd_typ,
						S0_CO.sls_xrate_cd.as("xrate_cd"),
						S0_T.valid_dt,
						S0_CST.sls_upri_cng_flg
					)
					.from(
						S0_T
						.crossJoin(S0_CO)
						.leftOuterJoin(S0_CST).on(
							bracket(
								S0_T.cst_cd.eq(S0_CST.bp_cd)
							)
						)
						.leftOuterJoin(S0_DPT1).on(
							bracket(
								S0_T.sls_dpt_cd.eq(S0_DPT1.dpt_cd)
								.and(bind("today").between(S0_DPT1.st_dt, S0_DPT1.end_dt))
							)
						)
						.leftOuterJoin(S0_DPT2).on(
							bracket(
								cases()
									.when(S0_CST.ar_dpt_typ.eq(value(MAC_AR_DPT_TYP.SLS.value())))
										.then(S0_T.sls_dpt_cd)
									.when(S0_CST.ar_dpt_typ.eq(value(MAC_AR_DPT_TYP.AR.value())))
										.then(
											MAPA_BP$F_GET_AR_DPT_CD_NE(
												S0_T.cst_cd,
												bind("today"),
												value(false)
											)
									)
									.otherwise(nullValue()).eq(S0_DPT2.dpt_cd)
								.and(bind("today").between(S0_DPT2.st_dt, S0_DPT2.end_dt))
							)
						)
						.innerJoin(S0_DAC).on(
							bracket(
								S0_T.sls_dpt_cd.eq(S0_DAC.dpt_cd)
							)
						)
					)
					.where(
						value(1).eq(value(1))
						.and(S0_T.qtn_no.eq(bind("srch_tgt_no")))
						.and(S0_T.qtn_rev.eq(bind("srch_tgt_rev")))
						.and(S0_CST.cst_iv_flg.eq(value(false)))
						.and(MSC_QTN_TYP$IS_QTN(S0_T.qtn_typ).eq(value(true)))
						.and(S0_T.failure_flg.eq(value(false)))
						.and(
							S0_T.aprv_flg.eq(value(false))
							.or(MAC_APRV_STS_TYP$IS_ACPT(S0_T.aprv_sts_typ).eq(value(true)))
						)
						.and(S0_T.can_flg.eq(value(false)))
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
						.add(MAM_BP_R.class, r -> toCondition(
							r.getStringNE("acst_cd")
						))
						.addSelect(m -> toArray(
							m.bcst_cd,
							m.bp_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("acst_nm", m.bp_nm());
							r.setStringNE("join_bcst_cd_", m.bcst_cd());
					}),
					j -> j
						.add(MAM_BP_R.class, r -> toCondition(
							r.getStringNE("join_bcst_cd_")
						))
						.addSelect(m -> toArray(
							m.bill_cl_typ
						))
						.addMap((r, m) -> {
							r.setStringNE("bill_cl_typ", m.bill_cl_typ());
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
							r.setNumberNE("trd_cur_amt_dec_place", m.amt_dec_place());
							r.setNumberNE("trd_cur_upri_dec_place", m.upri_dec_place());
					}),
					j -> j
						.add(MAM_CUR_R.class, r -> toCondition(
							r.getStringNE("base_cur_cd")
						))
						.addSelect(m -> toArray(
							m.amt_dec_place,
							m.cur_nm,
							m.upri_dec_place
						))
						.addMap((r, m) -> {
							r.setStringNE("base_cur_nm", m.cur_nm());
							r.setNumberNE("base_cur_amt_dec_place", m.amt_dec_place());
							r.setNumberNE("base_cur_upri_dec_place", m.upri_dec_place());
					}),
					j -> j
						.add(MAM_CUR_R.class, r -> toCondition(
							r.getStringNE("ptax_cur_cd")
						))
						.addSelect(m -> toArray(
							m.amt_dec_place,
							m.cur_nm,
							m.upri_dec_place
						))
						.addMap((r, m) -> {
							r.setStringNE("ptax_cur_nm", m.cur_nm());
							r.setNumberNE("ptax_cur_amt_dec_place", m.amt_dec_place());
							r.setNumberNE("ptax_cur_upri_dec_place", m.upri_dec_place());
					}),
					j -> j
						.add(MAM_TTERM_R.class, r -> toCondition(
							r.getStringNE("tterm_cd1")
						))
						.addSelect(m -> toArray(
							m.tterm_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("tterm_nm1", m.tterm_nm());
					}),
					j -> j
						.add(MAM_TTERM_R.class, r -> toCondition(
							r.getStringNE("tterm_cd2")
						))
						.addSelect(m -> toArray(
							m.tterm_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("tterm_nm2", m.tterm_nm());
					}),
					j -> j
						.add(MAM_TTERM_R.class, r -> toCondition(
							r.getStringNE("tterm_cd3")
						))
						.addSelect(m -> toArray(
							m.tterm_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("tterm_nm3", m.tterm_nm());
					})
				)
			);
	}
	
	/**
	 * -- MSBBL1310_SHIP_ACT_D_Query_S01
	 */
	static MCQueryPlan MSBBL1310_SHIP_ACT_D_S01() {
		MST_DLV_SLIP_R S0_T1 = MST_DLV_SLIP_R.create("T1");
		MST_DLV_SLIP_D_R S0_T2 = MST_DLV_SLIP_D_R.create("T2");
		MST_SHIP_ACT_D_R S0_T3 = MST_SHIP_ACT_D_R.create("T3");
		MST_SLS_SCHD_R S0_T5 = MST_SLS_SCHD_R.create("T5");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBBL1310_SHIP_ACT_D_Query_S01")
					.mainQuery()
					.select(
						S0_T3.trd_unit_cd,
						S0_T3.base_unit_cd,
						S0_T3.base_unit_qty.subtract(S0_T3.ship_ret_qty).as("base_unit_qty"),
						S0_T3.gd_cd,
						S0_T3.ship_loc_cd.as("loc_cd"),
						S0_T3.ship_str_ln_cd.as("str_ln_cd"),
						S0_T3.lot_no,
						S0_T3.sublot_no,
						S0_T3.ver_no,
						S0_T3.sno1,
						S0_T3.sno2,
						S0_T3.sno3,
						S0_T3.sno4,
						S0_T3.ship_act_d_no,
						S0_T2.itm_cd,
						S0_T2.itm_sub1,
						S0_T2.itm_sub2,
						S0_T2.itm_sub3,
						S0_T2.dlv_slip_d_no.as("ship_dlv_slip_d_no")
					)
					.from(
						S0_T1
						.innerJoin(S0_T2).on(
							bracket(
								S0_T1.dlv_slip_no.eq(S0_T2.dlv_slip_no)
								.and(S0_T1.dlv_slip_seq.eq(S0_T2.dlv_slip_d_seq))
							)
						)
						.innerJoin(S0_T3).on(
							bracket(
								S0_T2.dlv_slip_d_no.eq(S0_T3.dlv_slip_d_no)
								.and(S0_T3.can_flg.eq(value(false)))
							)
						)
						.innerJoin(S0_T5).on(
							bracket(
								S0_T2.dlv_slip_d_no.eq(S0_T5.dlv_slip_d_no)
							)
						)
					)
					.where(
						value(1).eq(value(1))
						.and(S0_T1.dlv_slip_no.eq(bind("ship_dlv_slip_no")))
						.and(S0_T1.dlv_slip_seq.eq(bind("ship_dlv_slip_seq")))
						.and(S0_T5.cmpl_flg.eq(value(false)))
						.and(S0_T5.sls_ac_abl_flg.eq(value(true)))
					)
					.orderBy(S0_T3.ship_act_d_no.asc())
			)
			.setJoinInfo(
				joinInfo(
					j -> j
						.add(MAM_ITM_R.class, r -> toCondition(
							r.getStringNE("itm_cd"),
							r.getStringNE("itm_sub1"),
							r.getStringNE("itm_sub2"),
							r.getStringNE("itm_sub3")
						))
						.addSelect(m -> toArray(
							m.dec_place,
							m.lot_mng_typ,
							m.rnd_typ,
							m.sno1_mng_typ,
							m.sno2_mng_typ,
							m.sno3_mng_typ,
							m.sno4_mng_typ,
							m.stk_mng_typ,
							m.sublot_mng_typ,
							m.ver_flg
						))
						.addMap((r, m) -> {
							r.setNumberNE("base_unit_dec_place", m.dec_place());
							r.setStringNE("base_unit_rnd_typ", m.rnd_typ());
							r.setStringNE("lot_mng_typ", m.lot_mng_typ());
							r.setStringNE("sublot_mng_typ", m.sublot_mng_typ());
							r.setBooleanNE("ver_flg", m.ver_flg());
							r.setStringNE("sno1_mng_typ", m.sno1_mng_typ());
							r.setStringNE("sno2_mng_typ", m.sno2_mng_typ());
							r.setStringNE("sno3_mng_typ", m.sno3_mng_typ());
							r.setStringNE("sno4_mng_typ", m.sno4_mng_typ());
							r.setStringNE("stk_mng_typ", m.stk_mng_typ());
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
						.add(MAM_STK_GD_R.class, r -> toCondition(
							r.getStringNE("gd_cd")
						))
						.addSelect(m -> toArray(
							m.gd_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("gd_nm", m.gd_nm());
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
							m.conv_base_qty,
							m.conv_qty,
							m.dec_place,
							m.rnd_typ
						))
						.addMap((r, m) -> {
							r.setNumberNE("trd_unit_dec_place", m.dec_place());
							r.setNumberNE("trd_unit_conv_base_qty", m.conv_base_qty());
							r.setNumberNE("trd_unit_conv_qty", m.conv_qty());
							r.setStringNE("trd_unit_rnd_typ", m.rnd_typ());
					}),
					j -> j
						.add(MAM_UNIT_R.class, r -> toCondition(
							r.getStringNE("base_unit_cd")
						))
						.addSelect(m -> toArray(
							m.unit_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("base_unit_nm", m.unit_nm());
					}),
					j -> j
						.add(MAM_LOC_R.class, r -> toCondition(
							r.getStringNE("loc_cd")
						))
						.addSelect(m -> toArray(
							m.loc_nm,
							m.site_cd,
							m.str_ln_tgt_flg
						))
						.addMap((r, m) -> {
							r.setStringNE("loc_nm", m.loc_nm());
							r.setBooleanNE("str_ln_tgt_flg", m.str_ln_tgt_flg());
							r.setStringNE("site_cd", m.site_cd());
					}),
					j -> j
						.add(MAM_STR_LN_R.class, r -> toCondition(
							r.getStringNE("loc_cd"),
							r.getStringNE("str_ln_cd")
						))
						.addSelect(m -> toArray(
							m.str_ln_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("str_ln_nm", m.str_ln_nm());
					})
				)
			);
	}
	/**
	 * -- MSBBL1310_IV_SHIP_ACT_D_Query_S01
	 */
	static MCQueryPlan MSBBL1310_IV_SHIP_ACT_D_S01() {
		MST_IV_R S0_IV = MST_IV_R.create("IV");
		MST_IV_D_R S0_IVD = MST_IV_D_R.create("IVD");
		MST_IV_SHIP_ACT_MAP_R S0_IVSHIPACTMAP = MST_IV_SHIP_ACT_MAP_R.create("IVSHIPACTMAP");
		MST_SLS_SCHD_R S0_SLSSCHD = MST_SLS_SCHD_R.create("SLSSCHD");
		MST_IV_SHIP_ACT_D_R S0_IVSHIPACTD = MST_IV_SHIP_ACT_D_R.create("IVSHIPACTD");
		MST_SHIP_ACT_D_R S0_SHIPACTD = MST_SHIP_ACT_D_R.create("SHIPACTD");
		
		return createQueryPlan()
			.setQuery(
				sql("MSBBL1310_SHIP_ACT_D_Query_S01")
					.mainQuery()
					.select(
						S0_IVSHIPACTD.trd_unit_cd,
						S0_IVSHIPACTD.base_unit_cd,
						S0_IVSHIPACTMAP.base_unit_qty,
						S0_IVSHIPACTD.gd_cd,
						S0_IVSHIPACTD.ship_loc_cd.as("loc_cd"),
						S0_IVSHIPACTD.ship_str_ln_cd.as("str_ln_cd"),
						S0_IVSHIPACTD.lot_no,
						S0_IVSHIPACTD.sublot_no,
						S0_IVSHIPACTD.ver_no,
						S0_IVSHIPACTD.sno1,
						S0_IVSHIPACTD.sno2,
						S0_IVSHIPACTD.sno3,
						S0_IVSHIPACTD.sno4,
						S0_IVSHIPACTD.ship_act_d_no,
						S0_IVSHIPACTD.itm_cd,
						S0_IVSHIPACTD.itm_sub1,
						S0_IVSHIPACTD.itm_sub2,
						S0_IVSHIPACTD.itm_sub3,
						S0_IVD.iv_d_no
					)
					.from(
						S0_IV
						.innerJoin(S0_IVD).on(
							bracket(
								S0_IV.iv_mng_no.eq(S0_IVD.iv_mng_no)
							)
						)
						.innerJoin(S0_IVSHIPACTMAP).on(
							bracket(
								S0_IVD.iv_d_no.eq(S0_IVSHIPACTMAP.iv_d_no)
							)
						)
						.innerJoin(S0_SLSSCHD).on(
							bracket(
								S0_IVSHIPACTMAP.iv_d_no.eq(S0_SLSSCHD.iv_d_no)
							)
						)
						.innerJoin(S0_IVSHIPACTD).on(
							bracket(
								S0_IVD.iv_d_no.eq(S0_IVSHIPACTD.iv_d_no)
								.and(S0_IVSHIPACTMAP.ship_act_d_no.eq(S0_IVSHIPACTD.ship_act_d_no))
							)
						)
						.innerJoin(S0_SHIPACTD).on(
							bracket(
								S0_IVSHIPACTD.ship_act_d_no.eq(S0_SHIPACTD.ship_act_d_no)
							)
						)
					)
					.where(
						value(1).eq(value(1))
						.and(S0_IV.iv_no.eq(bind("iv_no")))
						.and(S0_SLSSCHD.cmpl_flg.eq(value(false)))
						.and(S0_SLSSCHD.sls_ac_abl_flg.eq(value(true)))
					)
					.orderBy(S0_IVSHIPACTD.ship_act_d_no.asc())
			)
			.setJoinInfo(
				joinInfo(
					j -> j
						.add(MAM_ITM_R.class, r -> toCondition(
							r.getStringNE("itm_cd"),
							r.getStringNE("itm_sub1"),
							r.getStringNE("itm_sub2"),
							r.getStringNE("itm_sub3")
						))
						.addSelect(m -> toArray(
							m.dec_place,
							m.lot_mng_typ,
							m.rnd_typ,
							m.sno1_mng_typ,
							m.sno2_mng_typ,
							m.sno3_mng_typ,
							m.sno4_mng_typ,
							m.stk_mng_typ,
							m.sublot_mng_typ,
							m.ver_flg
						))
						.addMap((r, m) -> {
							r.setNumberNE("base_unit_dec_place", m.dec_place());
							r.setStringNE("base_unit_rnd_typ", m.rnd_typ());
							r.setStringNE("lot_mng_typ", m.lot_mng_typ());
							r.setStringNE("sublot_mng_typ", m.sublot_mng_typ());
							r.setBooleanNE("ver_flg", m.ver_flg());
							r.setStringNE("sno1_mng_typ", m.sno1_mng_typ());
							r.setStringNE("sno2_mng_typ", m.sno2_mng_typ());
							r.setStringNE("sno3_mng_typ", m.sno3_mng_typ());
							r.setStringNE("sno4_mng_typ", m.sno4_mng_typ());
							r.setStringNE("stk_mng_typ", m.stk_mng_typ());
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
						.add(MAM_STK_GD_R.class, r -> toCondition(
							r.getStringNE("gd_cd")
						))
						.addSelect(m -> toArray(
							m.gd_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("gd_nm", m.gd_nm());
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
							m.conv_base_qty,
							m.conv_qty,
							m.dec_place,
							m.rnd_typ
						))
						.addMap((r, m) -> {
							r.setNumberNE("trd_unit_dec_place", m.dec_place());
							r.setNumberNE("trd_unit_conv_base_qty", m.conv_base_qty());
							r.setNumberNE("trd_unit_conv_qty", m.conv_qty());
							r.setStringNE("trd_unit_rnd_typ", m.rnd_typ());
					}),
					j -> j
						.add(MAM_UNIT_R.class, r -> toCondition(
							r.getStringNE("base_unit_cd")
						))
						.addSelect(m -> toArray(
							m.unit_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("base_unit_nm", m.unit_nm());
					}),
					j -> j
						.add(MAM_LOC_R.class, r -> toCondition(
							r.getStringNE("loc_cd")
						))
						.addSelect(m -> toArray(
							m.loc_nm,
							m.site_cd,
							m.str_ln_tgt_flg
						))
						.addMap((r, m) -> {
							r.setStringNE("loc_nm", m.loc_nm());
							r.setBooleanNE("str_ln_tgt_flg", m.str_ln_tgt_flg());
							r.setStringNE("site_cd", m.site_cd());
					}),
					j -> j
						.add(MAM_STR_LN_R.class, r -> toCondition(
							r.getStringNE("loc_cd"),
							r.getStringNE("str_ln_cd")
						))
						.addSelect(m -> toArray(
							m.str_ln_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("str_ln_nm", m.str_ln_nm());
					})
				)
			);
	}
	
	/**
	 * -- MSBBL1310_SHIP_ACT_D_Query_S02
	 */
	static MCQueryPlan MSBBL1310_SHIP_ACT_D_S02() {
		MST_IV_R S0_IV = MST_IV_R.create("IV");
		MST_IV_D_R S0_IVD = MST_IV_D_R.create("IVD");
		MST_IV_SHIP_ACT_MAP_R S0_IVACTMAP = MST_IV_SHIP_ACT_MAP_R.create("IVACTMAP");
		MST_SLS_SCHD_R S0_SLSSCHD = MST_SLS_SCHD_R.create("SLSSCHD");
		MST_SHIP_ACT_D_R S0_SHIPACTD = MST_SHIP_ACT_D_R.create("SHIPACTD");
		MST_DLV_SLIP_D_R S0_SLIPD = MST_DLV_SLIP_D_R.create("SLIPD");
		
		return createQueryPlan()
			.setQuery(
				sql("MSBBL1310_SHIP_ACT_D_Query_S02")
					.mainQuery()
					.select(
						S0_SHIPACTD.trd_unit_cd,
						S0_SHIPACTD.base_unit_cd,
						S0_IVACTMAP.base_unit_qty,
						S0_SHIPACTD.gd_cd,
						S0_SHIPACTD.ship_loc_cd.as("loc_cd"),
						S0_SHIPACTD.ship_str_ln_cd.as("str_ln_cd"),
						S0_SHIPACTD.lot_no,
						S0_SHIPACTD.sublot_no,
						S0_SHIPACTD.ver_no,
						S0_SHIPACTD.sno1,
						S0_SHIPACTD.sno2,
						S0_SHIPACTD.sno3,
						S0_SHIPACTD.sno4,
						S0_SHIPACTD.ship_act_d_no,
						S0_SHIPACTD.itm_cd,
						S0_SHIPACTD.itm_sub1,
						S0_SHIPACTD.itm_sub2,
						S0_SHIPACTD.itm_sub3,
						S0_SLIPD.dlv_slip_d_no.as("ship_dlv_slip_d_no"),
						S0_IVD.iv_d_no
					)
					.from(
						S0_IV
						.innerJoin(S0_IVD).on(
							bracket(
								S0_IV.iv_mng_no.eq(S0_IVD.iv_mng_no)
							)
						)
						.innerJoin(S0_IVACTMAP).on(
							bracket(
								S0_IVD.iv_d_no.eq(S0_IVACTMAP.iv_d_no)
							)
						)
						.innerJoin(S0_SLSSCHD).on(
							bracket(
								S0_IVACTMAP.iv_d_no.eq(S0_SLSSCHD.iv_d_no)
							)
						)
						.innerJoin(S0_SHIPACTD).on(
							bracket(
								S0_IVACTMAP.ship_act_d_no.eq(S0_SHIPACTD.ship_act_d_no)
								.and(S0_SHIPACTD.can_flg.eq(value(false)))
							)
						)
						.innerJoin(S0_SLIPD).on(
							bracket(
								S0_SHIPACTD.dlv_slip_d_no.eq(S0_SLIPD.dlv_slip_d_no)
								.and(S0_SHIPACTD.dlv_slip_seq.eq(S0_SLIPD.dlv_slip_d_seq))
							)
						)
					)
					.where(
						value(1).eq(value(1))
						.and(S0_IV.iv_no.eq(bind("iv_no")))
						.and(S0_SLSSCHD.cmpl_flg.eq(value(false)))
						.and(S0_SLSSCHD.sls_ac_abl_flg.eq(value(true)))
					)
					.orderBy(S0_SHIPACTD.ship_act_d_no.asc())
			)
			.setJoinInfo(
				joinInfo(
					j -> j
						.add(MAM_ITM_R.class, r -> toCondition(
							r.getStringNE("itm_cd"),
							r.getStringNE("itm_sub1"),
							r.getStringNE("itm_sub2"),
							r.getStringNE("itm_sub3")
						))
						.addSelect(m -> toArray(
							m.dec_place,
							m.lot_mng_typ,
							m.rnd_typ,
							m.sno1_mng_typ,
							m.sno2_mng_typ,
							m.sno3_mng_typ,
							m.sno4_mng_typ,
							m.stk_mng_typ,
							m.sublot_mng_typ,
							m.ver_flg
						))
						.addMap((r, m) -> {
							r.setNumberNE("base_unit_dec_place", m.dec_place());
							r.setStringNE("base_unit_rnd_typ", m.rnd_typ());
							r.setStringNE("lot_mng_typ", m.lot_mng_typ());
							r.setStringNE("sublot_mng_typ", m.sublot_mng_typ());
							r.setBooleanNE("ver_flg", m.ver_flg());
							r.setStringNE("sno1_mng_typ", m.sno1_mng_typ());
							r.setStringNE("sno2_mng_typ", m.sno2_mng_typ());
							r.setStringNE("sno3_mng_typ", m.sno3_mng_typ());
							r.setStringNE("sno4_mng_typ", m.sno4_mng_typ());
							r.setStringNE("stk_mng_typ", m.stk_mng_typ());
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
						.add(MAM_STK_GD_R.class, r -> toCondition(
							r.getStringNE("gd_cd")
						))
						.addSelect(m -> toArray(
							m.gd_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("gd_nm", m.gd_nm());
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
							m.conv_base_qty,
							m.conv_qty,
							m.dec_place,
							m.rnd_typ
						))
						.addMap((r, m) -> {
							r.setNumberNE("trd_unit_dec_place", m.dec_place());
							r.setNumberNE("trd_unit_conv_base_qty", m.conv_base_qty());
							r.setNumberNE("trd_unit_conv_qty", m.conv_qty());
							r.setStringNE("trd_unit_rnd_typ", m.rnd_typ());
					}),
					j -> j
						.add(MAM_UNIT_R.class, r -> toCondition(
							r.getStringNE("base_unit_cd")
						))
						.addSelect(m -> toArray(
							m.unit_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("base_unit_nm", m.unit_nm());
					}),
					j -> j
						.add(MAM_LOC_R.class, r -> toCondition(
							r.getStringNE("loc_cd")
						))
						.addSelect(m -> toArray(
							m.loc_nm,
							m.site_cd,
							m.str_ln_tgt_flg
						))
						.addMap((r, m) -> {
							r.setStringNE("loc_nm", m.loc_nm());
							r.setBooleanNE("str_ln_tgt_flg", m.str_ln_tgt_flg());
							r.setStringNE("site_cd", m.site_cd());
					}),
					j -> j
						.add(MAM_STR_LN_R.class, r -> toCondition(
							r.getStringNE("loc_cd"),
							r.getStringNE("str_ln_cd")
						))
						.addSelect(m -> toArray(
							m.str_ln_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("str_ln_nm", m.str_ln_nm());
					})
				)
			);
	}
	/**
	 * -- MSBBL1310_SHIP_ALLOC_STS_Query_S01
	 */
	static MCQueryPlan MSBBL1310_SHIP_ALLOC_STS_S01() {
		MST_SLO_R S0_T1 = MST_SLO_R.create("T1");
		MST_SLO_D_R S0_T2 = MST_SLO_D_R.create("T2");
		MST_SHIP_PR_R S0_T6 = MST_SHIP_PR_R.create("T6");
		MST_SHIP_SCHD_R S0_T5 = MST_SHIP_SCHD_R.create("T5");
		MST_SHIP_ALLOC_STS_R S0_T4 = MST_SHIP_ALLOC_STS_R.create("T4");
		MAM_LOC_R S0_DLOC = MAM_LOC_R.create("DLOC");
		MAM_LG_GRP_R S0_LG = MAM_LG_GRP_R.create("LG");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBBL1310_SHIP_ALLOC_STS_Query_S01")
					.mainQuery()
					.select(
						S0_T4.ship_alloc_sts_no,
						S0_T4.trd_unit_cd,
						S0_T4.trd_unit_qty,
						S0_T4.base_unit_cd,
						bracket(
							S0_T4.base_unit_qty.subtract(S0_T4.ship_act_qty)
						).as("base_unit_qty"),
						S0_T4.gd_cd,
						S0_T4.ship_loc_cd.as("loc_cd"),
						S0_T4.ship_str_ln_cd.as("str_ln_cd"),
						S0_T4.lot_no,
						S0_T4.sublot_no,
						S0_T4.ver_no,
						S0_T4.sno1,
						S0_T4.sno2,
						S0_T4.sno3,
						S0_T4.sno4,
						S0_T2.itm_cd,
						S0_T2.itm_sub1,
						S0_T2.itm_sub2,
						S0_T2.itm_sub3,
						S0_T2.slo_d_no,
						S0_T5.ship_schd_no,
						S0_T6.def_loc_cd,
						S0_DLOC.loc_nm.as("def_loc_nm"),
						S0_DLOC.str_ln_tgt_flg.as("def_str_ln_tgt_flg"),
						decode(
							S0_T5.ship_fr_lg_grp_cd,
							S0_DLOC.lg_grp_cd,
							S0_LG.ship_loc_prio_flg,
							value(false)
						).as("ship_loc_prio_flg"),
						S0_T4.alloc_scope_typ
					)
					.from(
						S0_T1
						.innerJoin(S0_T2).on(
							bracket(
								S0_T1.slo_no.eq(S0_T2.slo_no)
							)
						)
						.innerJoin(S0_T6).on(
							bracket(
								S0_T2.slo_d_no.eq(S0_T6.slo_d_no)
							)
						)
						.innerJoin(S0_T5).on(
							bracket(
								S0_T6.ship_pr_no.eq(S0_T5.ship_pr_no)
							)
						)
						.innerJoin(S0_T4).on(
							bracket(
								S0_T5.ship_schd_no.eq(S0_T4.ship_schd_no)
							)
						)
						.leftOuterJoin(S0_DLOC).on(
							bracket(
								S0_T6.def_loc_cd.eq(S0_DLOC.loc_cd)
							)
						)
						.leftOuterJoin(S0_LG).on(
							bracket(
								S0_T5.ship_fr_lg_grp_cd.eq(S0_LG.lg_grp_cd)
							)
						)
					)
					.where(
						value(1).eq(value(1))
						.and(S0_T1.slo_no.eq(bind("slo_no")))
						.and(S0_T2.can_flg.eq(value(false)))
						.and(S0_T2.abort_flg.eq(value(false)))
						.and(MAC_SLO_PROC_TYP$IS_PURC_DDLV(S0_T2.proc_typ).eq(value(false)))
						.and(S0_T4.base_unit_qty.subtract(S0_T4.ship_act_qty).gt(value(0)))
						.and(
							S0_T2.sls_cststk_flg.eq(value(true))
							.or(MAC_SHIP_INST_TYP$IS_NON(S0_T2.ship_inst_typ).eq(value(true)))
						)
					)
					.orderBy(S0_T2.slo_d_no.asc())
			)
			.setJoinInfo(
				joinInfo(
					j -> j
						.add(MAM_ITM_R.class, r -> toCondition(
							r.getStringNE("itm_cd"),
							r.getStringNE("itm_sub1"),
							r.getStringNE("itm_sub2"),
							r.getStringNE("itm_sub3")
						))
						.addSelect(m -> toArray(
							m.dec_place,
							m.lot_mng_typ,
							m.rnd_typ,
							m.sno1_mng_typ,
							m.sno2_mng_typ,
							m.sno3_mng_typ,
							m.sno4_mng_typ,
							m.stk_mng_typ,
							m.sublot_mng_typ,
							m.ver_flg
						))
						.addMap((r, m) -> {
							r.setNumberNE("base_unit_dec_place", m.dec_place());
							r.setStringNE("base_unit_rnd_typ", m.rnd_typ());
							r.setStringNE("lot_mng_typ", m.lot_mng_typ());
							r.setStringNE("sublot_mng_typ", m.sublot_mng_typ());
							r.setBooleanNE("ver_flg", m.ver_flg());
							r.setStringNE("sno1_mng_typ", m.sno1_mng_typ());
							r.setStringNE("sno2_mng_typ", m.sno2_mng_typ());
							r.setStringNE("sno3_mng_typ", m.sno3_mng_typ());
							r.setStringNE("sno4_mng_typ", m.sno4_mng_typ());
							r.setStringNE("stk_mng_typ", m.stk_mng_typ());
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
						.add(MAVM_ITM_UNIT_R.class, r -> toCondition(
							r.getStringNE("itm_cd"),
							r.getStringNE("itm_sub1"),
							r.getStringNE("itm_sub2"),
							r.getStringNE("itm_sub3"),
							r.getStringNE("trd_unit_cd")
						))
						.addSelect(m -> toArray(
							m.conv_base_qty,
							m.conv_qty,
							m.dec_place,
							m.rnd_typ
						))
						.addMap((r, m) -> {
							r.setNumberNE("trd_unit_dec_place", m.dec_place());
							r.setNumberNE("trd_unit_conv_base_qty", m.conv_base_qty());
							r.setNumberNE("trd_unit_conv_qty", m.conv_qty());
							r.setStringNE("trd_unit_rnd_typ", m.rnd_typ());
					}),
					j -> j
						.add(MAM_UNIT_R.class, r -> toCondition(
							r.getStringNE("base_unit_cd")
						))
						.addSelect(m -> toArray(
							m.unit_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("base_unit_nm", m.unit_nm());
					}),
					j -> j
						.add(MAM_STK_GD_R.class, r -> toCondition(
							r.getStringNE("gd_cd")
						))
						.addSelect(m -> toArray(
							m.gd_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("gd_nm", m.gd_nm());
					}),
					j -> j
						.add(MAM_LOC_R.class, r -> toCondition(
							r.getStringNE("loc_cd")
						))
						.addSelect(m -> toArray(
							m.loc_nm,
							m.site_cd,
							m.str_ln_tgt_flg
						))
						.addMap((r, m) -> {
							r.setStringNE("loc_nm", m.loc_nm());
							r.setBooleanNE("str_ln_tgt_flg", m.str_ln_tgt_flg());
							r.setStringNE("site_cd", m.site_cd());
					}),
					j -> j
						.add(MAM_STR_LN_R.class, r -> toCondition(
							r.getStringNE("loc_cd"),
							r.getStringNE("str_ln_cd")
						))
						.addSelect(m -> toArray(
							m.str_ln_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("str_ln_nm", m.str_ln_nm());
					})
				)
			);
	}

	/**
	 * -- MSBBL1310_SHIP_ALLOC_STS_Query_S02
	 */
	static MCQueryPlan MSBBL1310_SHIP_ALLOC_STS_S02() {
		MST_SLO_R S0_SLO = MST_SLO_R.create("SLO");
		MST_SLO_D_R S0_SLODR = MST_SLO_D_R.create("SLODR");
		MST_SHIP_PR_R S0_SHIPPR = MST_SHIP_PR_R.create("SHIPPR");
		MST_SHIP_SCHD_R S0_SHIPSCHD = MST_SHIP_SCHD_R.create("SHIPSCHD");
		MST_SHIP_ALLOC_STS_R S0_ALLOCSTS = MST_SHIP_ALLOC_STS_R.create("ALLOCSTS");
		MST_IV_MAP_R S0_IVMAP = MST_IV_MAP_R.create("IVMAP");
		MST_IV_D_R S0_IVD = MST_IV_D_R.create("IVD");
		MST_IV_R S0_IV = MST_IV_R.create("IV");
		
		MAM_LOC_R S0_DLOC = MAM_LOC_R.create("DLOC");
		MAM_LG_GRP_R S0_LG = MAM_LG_GRP_R.create("LG");
		
		return createQueryPlan()
			.setQuery(
				sql("MSBBL1310_SHIP_ALLOC_STS_Query_S02")
					.mainQuery()
					.select(
						S0_ALLOCSTS.ship_alloc_sts_no,
						S0_ALLOCSTS.trd_unit_cd,
						S0_ALLOCSTS.base_unit_cd,
						S0_IVMAP.base_unit_qty.as("base_unit_qty"),
						S0_ALLOCSTS.gd_cd,
						S0_ALLOCSTS.ship_loc_cd.as("loc_cd"),
						S0_ALLOCSTS.ship_str_ln_cd.as("str_ln_cd"),
						S0_ALLOCSTS.lot_no,
						S0_ALLOCSTS.sublot_no,
						S0_ALLOCSTS.ver_no,
						S0_ALLOCSTS.sno1,
						S0_ALLOCSTS.sno2,
						S0_ALLOCSTS.sno3,
						S0_ALLOCSTS.sno4,
						S0_SLODR.itm_cd,
						S0_SLODR.itm_sub1,
						S0_SLODR.itm_sub2,
						S0_SLODR.itm_sub3,
						S0_SLODR.slo_d_no,
						S0_SHIPSCHD.ship_schd_no,
						S0_SHIPPR.def_loc_cd,
						S0_DLOC.loc_nm.as("def_loc_nm"),
						S0_DLOC.str_ln_tgt_flg.as("def_str_ln_tgt_flg"),
						decode(
							S0_SHIPSCHD.ship_fr_lg_grp_cd,
							S0_DLOC.lg_grp_cd,
							S0_LG.ship_loc_prio_flg,
							value(false)
						).as("ship_loc_prio_flg"),
						S0_ALLOCSTS.alloc_scope_typ,
						S0_IVD.iv_d_no
					)
					.from(
						S0_SLO
						.innerJoin(S0_SLODR).on(
							bracket(
								S0_SLO.slo_no.eq(S0_SLODR.slo_no)
							)
						)
						.innerJoin(S0_SHIPPR).on(
							bracket(
								S0_SLODR.slo_d_no.eq(S0_SHIPPR.slo_d_no)
							)
						)
						.innerJoin(S0_SHIPSCHD).on(
							bracket(
								S0_SHIPPR.ship_pr_no.eq(S0_SHIPSCHD.ship_pr_no)
							)
						)
						.innerJoin(S0_ALLOCSTS).on(
							bracket(
								S0_SHIPSCHD.ship_schd_no.eq(S0_ALLOCSTS.ship_schd_no)
							)
						)
						.innerJoin(S0_IVMAP).on(
							bracket(
								S0_ALLOCSTS.ship_schd_no.eq(S0_IVMAP.ship_schd_no)
							)
						)
						.innerJoin(S0_IVD).on(
							bracket(
								S0_IVMAP.iv_d_no.eq(S0_IVD.iv_d_no)
							)
						)
						.innerJoin(S0_IV).on(
							bracket(
								S0_IVD.iv_mng_no.eq(S0_IV.iv_mng_no)
							)
						)
						.leftOuterJoin(S0_DLOC).on(
							bracket(
								S0_SHIPPR.def_loc_cd.eq(S0_DLOC.loc_cd)
							)
						)
						.leftOuterJoin(S0_LG).on(
							bracket(
								S0_SHIPSCHD.ship_fr_lg_grp_cd.eq(S0_LG.lg_grp_cd)
							)
						)
					)
					.where(
						value(1).eq(value(1))
						.and(S0_IV.iv_no.eq(bind("iv_no")))
						.and(S0_SLODR.can_flg.eq(value(false)))
						.and(S0_SLODR.abort_flg.eq(value(false)))
						.and(MAC_SLO_PROC_TYP$IS_PURC_DDLV(S0_SLODR.proc_typ).eq(value(false)))
						.and(S0_ALLOCSTS.base_unit_qty.subtract(S0_ALLOCSTS.ship_act_qty).gt(value(0)))
						.and(
							S0_SLODR.sls_cststk_flg.eq(value(true))
							.or(MAC_SHIP_INST_TYP$IS_NON(S0_SLODR.ship_inst_typ).eq(value(true)))
						)
					)
					.orderBy(S0_SLODR.slo_d_no.asc())
			)
			.setJoinInfo(
				joinInfo(
					j -> j
						.add(MAM_ITM_R.class, r -> toCondition(
							r.getStringNE("itm_cd"),
							r.getStringNE("itm_sub1"),
							r.getStringNE("itm_sub2"),
							r.getStringNE("itm_sub3")
						))
						.addSelect(m -> toArray(
							m.dec_place,
							m.lot_mng_typ,
							m.rnd_typ,
							m.sno1_mng_typ,
							m.sno2_mng_typ,
							m.sno3_mng_typ,
							m.sno4_mng_typ,
							m.stk_mng_typ,
							m.sublot_mng_typ,
							m.ver_flg
						))
						.addMap((r, m) -> {
							r.setNumberNE("base_unit_dec_place", m.dec_place());
							r.setStringNE("base_unit_rnd_typ", m.rnd_typ());
							r.setStringNE("lot_mng_typ", m.lot_mng_typ());
							r.setStringNE("sublot_mng_typ", m.sublot_mng_typ());
							r.setBooleanNE("ver_flg", m.ver_flg());
							r.setStringNE("sno1_mng_typ", m.sno1_mng_typ());
							r.setStringNE("sno2_mng_typ", m.sno2_mng_typ());
							r.setStringNE("sno3_mng_typ", m.sno3_mng_typ());
							r.setStringNE("sno4_mng_typ", m.sno4_mng_typ());
							r.setStringNE("stk_mng_typ", m.stk_mng_typ());
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
						.add(MAVM_ITM_UNIT_R.class, r -> toCondition(
							r.getStringNE("itm_cd"),
							r.getStringNE("itm_sub1"),
							r.getStringNE("itm_sub2"),
							r.getStringNE("itm_sub3"),
							r.getStringNE("trd_unit_cd")
						))
						.addSelect(m -> toArray(
							m.conv_base_qty,
							m.conv_qty,
							m.dec_place,
							m.rnd_typ
						))
						.addMap((r, m) -> {
							r.setNumberNE("trd_unit_dec_place", m.dec_place());
							r.setNumberNE("trd_unit_conv_base_qty", m.conv_base_qty());
							r.setNumberNE("trd_unit_conv_qty", m.conv_qty());
							r.setStringNE("trd_unit_rnd_typ", m.rnd_typ());
					}),
					j -> j
						.add(MAM_UNIT_R.class, r -> toCondition(
							r.getStringNE("base_unit_cd")
						))
						.addSelect(m -> toArray(
							m.unit_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("base_unit_nm", m.unit_nm());
					}),
					j -> j
						.add(MAM_STK_GD_R.class, r -> toCondition(
							r.getStringNE("gd_cd")
						))
						.addSelect(m -> toArray(
							m.gd_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("gd_nm", m.gd_nm());
					}),
					j -> j
						.add(MAM_LOC_R.class, r -> toCondition(
							r.getStringNE("loc_cd")
						))
						.addSelect(m -> toArray(
							m.loc_nm,
							m.site_cd,
							m.str_ln_tgt_flg
						))
						.addMap((r, m) -> {
							r.setStringNE("loc_nm", m.loc_nm());
							r.setBooleanNE("str_ln_tgt_flg", m.str_ln_tgt_flg());
							r.setStringNE("site_cd", m.site_cd());
					}),
					j -> j
						.add(MAM_STR_LN_R.class, r -> toCondition(
							r.getStringNE("loc_cd"),
							r.getStringNE("str_ln_cd")
						))
						.addSelect(m -> toArray(
							m.str_ln_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("str_ln_nm", m.str_ln_nm());
					})
				)
			);
	}
	/**
	 * -- MSBBL1310_SLO_D_Query_S01
	 */
	static MCQueryPlan MSBBL1310_SLO_D_S01() {
		MST_SLO_R S0_T1 = MST_SLO_R.create("T1");
		MST_SLO_D_R S0_T2 = MST_SLO_D_R.create("T2");
		MST_SHIP_PR_R S0_T4 = MST_SHIP_PR_R.create("T4");
		MST_SHIP_SCHD_R S0_T5 = MST_SHIP_SCHD_R.create("T5");
		MST_SLS_SCHD_R S0_T3 = MST_SLS_SCHD_R.create("T3");
		MAM_ITM_R S0_ITM = MAM_ITM_R.create("ITM");
		MAM_BP_R S0_DLV = MAM_BP_R.create("DLV");
		MAVM_ITM_UNIT_R S0_BIU = MAVM_ITM_UNIT_R.create("BIU");
		MAM_TAX_R S0_TAX = MAM_TAX_R.create("TAX");
		MAM_TAX_R S0_NEWTAX = MAM_TAX_R.create("NEWTAX");
		MAM_DPT_R S0_DPT = MAM_DPT_R.create("DPT");
		MST_SHIP_ACT_D_R S1_X = MST_SHIP_ACT_D_R.create("X");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBBL1310_SLO_D_Query_S01")
					.mainQuery()
					.select(
						value(false).as("abort_flg"),
						S0_T2.sls_cststk_flg,
						S0_T2.itm_cd,
						S0_T2.itm_sub1,
						S0_T2.itm_sub2,
						S0_T2.itm_sub3,
						nvl(
							S0_T2.itm_nm,
							S0_ITM.itm_nm
						).as("itm_nm"),
						S0_ITM.asset_mng_typ,
						S0_T2.sundry_itm_flg,
						S0_T3.sls_schd_dt,
						nvl(
							S0_T5.dlv_cd,
							S0_T2.dlv_cd
						).as("dlv_cd"),
						nvl2(
							S0_T5.dlv_cd,
							nvl(
								S0_T5.dlv_nm,
								S0_DLV.bp_nm
							),
							nvl(
								S0_T2.dlv_nm,
								S0_DLV.bp_nm
							)
						).as("dlv_nm"),
						nvl2(
							S0_T5.dlv_cd,
							S0_T5.dlv_sundry_flg,
							S0_T2.dlv_sundry_flg
						).as("dlv_sundry_flg"),
						nvl2(
							S0_T5.dlv_cd,
							S0_T5.dlv_zip_cd,
							S0_T2.dlv_zip_cd
						).as("dlv_zip_cd"),
						nvl2(
							S0_T5.dlv_cd,
							S0_T5.dlv_addr1,
							S0_T2.dlv_addr1
						).as("dlv_addr1"),
						nvl2(
							S0_T5.dlv_cd,
							S0_T5.dlv_addr2,
							S0_T2.dlv_addr2
						).as("dlv_addr2"),
						nvl2(
							S0_T5.dlv_cd,
							S0_T5.dlv_addr3,
							S0_T2.dlv_addr3
						).as("dlv_addr3"),
						nvl2(
							S0_T5.dlv_cd,
							S0_T5.dlv_addr4,
							S0_T2.dlv_addr4
						).as("dlv_addr4"),
						nvl2(
							S0_T5.dlv_cd,
							S0_T5.dlv_cntct_dpt,
							S0_T2.dlv_cntct_dpt
						).as("dlv_cntct_dpt"),
						nvl2(
							S0_T5.dlv_cd,
							S0_T5.dlv_cntct_psn,
							S0_T2.dlv_cntct_psn
						).as("dlv_cntct_psn"),
						nvl2(
							S0_T5.dlv_cd,
							S0_T5.dlv_tel,
							S0_T2.dlv_tel
						).as("dlv_tel"),
						nvl2(
							S0_T5.dlv_cd,
							S0_T5.dlv_fax,
							S0_T2.dlv_fax
						).as("dlv_fax"),
						S0_DLV.cntry_cd,
						nvl2(
							S0_T5.dlv_cd,
							S0_T5.pri_prnt_flg,
							S0_T2.pri_prnt_flg
						).as("pri_prnt_flg"),
						S0_T2.dest_cd1,
						S0_T2.dest_cd2,
						S0_T2.dest_cd3,
						S0_T3.trd_unit_cd,
						S0_T3.base_unit_cd,
						bracket(
							S0_T3.base_unit_qty.subtract(S0_T3.base_unit_sls_qty)
						).as("base_unit_qty"),
						bracket(
							subQuery()
							.select(sum(S1_X.base_unit_qty))
							.from(S1_X)
							.where(
								S1_X.dlv_slip_d_no.eq(S0_T3.dlv_slip_d_no)
								.and(S1_X.can_flg.eq(value(false)))
							)
						).as("ship_qty"),
						S0_T3.base_unit_abort_qty.as("abort_qty"),
						S0_T3.base_unit_sls_qty.as("sls_qty"),
						S0_T2.interim_flg,
						S0_T2.upri_not_tgt_flg,
						S0_T2.tax_fix_flg,
						S0_T2.tax_cd,
						S0_TAX.tax_nm,
						S0_TAX.tax_rate,
						S0_T2.dscnt_rsn_cd,
						S0_T2.cost_upri,
						S0_T2.bill_crryovr_times,
						S0_T2.gd_cd,
						S0_T2.loc_cd,
						S0_T2.str_ln_cd,
						S0_T2.lot_no,
						S0_T2.sublot_no,
						S0_T2.ver_no,
						S0_T2.not_lot_mix_flg,
						S0_T2.not_sublot_mix_flg,
						S0_T2.sno1,
						S0_T2.sno2,
						S0_T2.sno3,
						S0_T2.sno4,
						S0_T1.wrk_no,
						S0_T2.cst_po_d_no,
						S0_T2.cst_itm_cd,
						S0_T2.cst_itm_nm,
						S0_T2.sls_rsn_cd,
						S0_T2.bd_dpt_cd,
						S0_DPT.dpt_nm.as("bd_dpt_nm"),
						S0_T2.wtax_rate,
						S0_T2.wtax_amt,
						S0_T2.trd_d_rmrks,
						S0_T2.qtn_d_no,
						S0_T2.slo_d_no,
						S0_T2.disp_seq,
						S0_ITM.lot_mng_typ,
						S0_ITM.lot_no_typ,
						S0_ITM.sublot_mng_typ,
						S0_ITM.sublot_no_typ,
						S0_ITM.ver_flg,
						S0_ITM.sno1_mng_typ,
						S0_ITM.sno2_mng_typ,
						S0_ITM.sno3_mng_typ,
						S0_ITM.sno4_mng_typ,
						S0_ITM.bill_crryovr_times.as("itm_bill_crryovr_times"),
						S0_ITM.stk_mng_typ,
						S0_ITM.dscnt_itm_flg,
						S0_ITM.sls_upri_cng_flg,
						S0_ITM.dec_place.as("base_unit_dec_place"),
						S0_ITM.rnd_typ.as("base_unit_rnd_typ"),
						S0_TAX.inc_tax_flg,
						S0_TAX.tax_typ,
						S0_T3.sls_schd_no,
						S0_T3.base_unit_qty.as("sls_schd_qty"),
						S0_T2.ship_inst_typ,
						S0_T3.upd_cntr.as("sls_schd_upd_cntr"),
						S0_T4.ship_pr_no,
						S0_T5.ship_schd_no,
						S0_T5.dlv_schd_tm,
						S0_T4.upd_cntr.as("ship_pr_upd_cntr"),
						S0_T2.trd_unit_cd.as("src_trd_unit_cd"),
						S0_T2.trd_unit_qty.as("src_trd_unit_qty"),
						S0_T2.trd_cur_upri.as("src_trd_cur_upri"),
						S0_T2.trd_cur_amt.as("src_trd_cur_amt"),
						S0_T2.trd_cur_tax_amt.as("src_trd_cur_tax_amt"),
						S0_T2.trd_cur_dscnt_amt.as("src_trd_cur_dscnt_amt"),
						bracket(
							S0_T2.trd_cur_amt.add(S0_T2.trd_cur_tax_amt)
						).as("src_trd_cur_inc_tax_amt"),
						S0_T2.base_unit_qty.as("init_schd_qty"),
						S0_T2.trd_cur_dscnt_amt.as("init_schd_dscnt_amt"),
						decode(
							S0_TAX.inc_tax_flg,
							value(false),
							S0_T2.trd_cur_amt,
							S0_T2.trd_cur_amt.add(S0_T2.trd_cur_tax_amt)
						).as("init_schd_amt"),
						S0_NEWTAX.tax_cd.as("new_tax_cd"),
						S0_NEWTAX.tax_nm.as("new_tax_nm"),
						S0_NEWTAX.tax_rate.as("new_tax_rate"),
						S0_NEWTAX.tax_typ.as("new_tax_typ"),
						S0_NEWTAX.inc_tax_flg.as("new_inc_tax_flg")
					)
					.from(
						S0_T1
						.innerJoin(S0_T2).on(
							bracket(
								S0_T1.slo_no.eq(S0_T2.slo_no)
							)
						)
						.innerJoin(S0_T4).on(
							bracket(
								S0_T2.slo_d_no.eq(S0_T4.slo_d_no)
							)
						)
						.innerJoin(S0_T5).on(
							bracket(
								S0_T4.ship_pr_no.eq(S0_T5.ship_pr_no)
							)
						)
						.innerJoin(S0_T3).on(
							bracket(
								S0_T5.ship_schd_no.eq(S0_T3.ship_schd_no)
								.and(S0_T3.cmpl_flg.eq(value(false)))
								.and(S0_T3.sls_ac_abl_flg.eq(value(true)))
							)
						)
						.leftOuterJoin(S0_ITM).on(
							bracket(
								S0_T2.itm_cd.eq(S0_ITM.itm_cd)
								.and(S0_T2.itm_sub1.eq(S0_ITM.itm_sub1))
								.and(S0_T2.itm_sub2.eq(S0_ITM.itm_sub2))
								.and(S0_T2.itm_sub3.eq(S0_ITM.itm_sub3))
							)
						)
						.leftOuterJoin(S0_DLV).on(
							bracket(
								nvl(
									S0_T5.dlv_cd,
									S0_T2.dlv_cd
								).eq(S0_DLV.bp_cd)
							)
						)
						.leftOuterJoin(S0_BIU).on(
							bracket(
								S0_T2.itm_cd.eq(S0_BIU.itm_cd)
								.and(S0_T2.itm_sub1.eq(S0_BIU.itm_sub1))
								.and(S0_T2.itm_sub2.eq(S0_BIU.itm_sub2))
								.and(S0_T2.itm_sub3.eq(S0_BIU.itm_sub3))
								.and(S0_T3.base_unit_cd.eq(S0_BIU.unit_cd))
							)
						)
						.leftOuterJoin(S0_TAX).on(
							bracket(
								S0_T2.tax_cd.eq(S0_TAX.tax_cd)
							)
						)
						.leftOuterJoin(S0_NEWTAX).on(
							bracket(
								MAPA_TAX$F_GET_SLS_TAX_CD(
									S0_T2.itm_cd,
									S0_T2.itm_sub1,
									S0_T2.itm_sub2,
									S0_T2.itm_sub3,
									S0_T1.cst_cd,
									bind("today")
								).eq(S0_NEWTAX.tax_cd)
							)
						)
						.leftOuterJoin(S0_DPT).on(
							bracket(
								S0_T2.bd_dpt_cd.eq(S0_DPT.dpt_cd)
								.and(bind("today").between(S0_DPT.st_dt, S0_DPT.end_dt))
							)
						)
					)
					.where(
						value(1).eq(value(1))
						.and(S0_T1.slo_no.eq(bind("slo_no")))
						.and(S0_T2.can_flg.eq(value(false)))
						.and(S0_T2.abort_flg.eq(value(false)))
						.and(MAC_SLO_PROC_TYP$IS_PURC_DDLV(S0_T2.proc_typ).eq(value(false)))
						.and(
							S0_T2.sls_cststk_flg.eq(value(true))
							.or(MAC_SHIP_INST_TYP$IS_NON(S0_T2.ship_inst_typ).eq(value(true)))
							.and(S0_T1.sls_basis_typ.eq(value(MAC_SLS_BASIS_TYP.SHIP_BASIS.value())))
						)
					)
					.orderBy(S0_T2.disp_seq.asc())
			)
			.setJoinInfo(
				joinInfo(
					j -> j
						.add(MAM_CNTRY_R.class, r -> toCondition(
							r.getStringNE("cntry_cd")
						))
						.addSelect(m -> toArray(
							m.cntry_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("cntry_nm", m.cntry_nm());
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
						.add(MAVM_ITM_UNIT_R.class, r -> toCondition(
							r.getStringNE("itm_cd"),
							r.getStringNE("itm_sub1"),
							r.getStringNE("itm_sub2"),
							r.getStringNE("itm_sub3"),
							r.getStringNE("trd_unit_cd")
						))
						.addSelect(m -> toArray(
							m.conv_base_qty,
							m.conv_qty,
							m.dec_place,
							m.rnd_typ
						))
						.addMap((r, m) -> {
							r.setNumberNE("trd_unit_dec_place", m.dec_place());
							r.setNumberNE("trd_unit_conv_base_qty", m.conv_base_qty());
							r.setNumberNE("trd_unit_conv_qty", m.conv_qty());
							r.setStringNE("trd_unit_rnd_typ", m.rnd_typ());
							r.setNumberNE("schd_trd_unit_conv_base_qty", m.conv_base_qty());
							r.setNumberNE("schd_trd_unit_conv_qty", m.conv_qty());
					}),
					j -> j
						.add(MAVM_ITM_UNIT_R.class, r -> toCondition(
							r.getStringNE("itm_cd"),
							r.getStringNE("itm_sub1"),
							r.getStringNE("itm_sub2"),
							r.getStringNE("itm_sub3"),
							r.getStringNE("src_trd_unit_cd")
						))
						.addSelect(m -> toArray(
							m.conv_base_qty,
							m.conv_qty,
							m.dec_place,
							m.rnd_typ
						))
						.addMap((r, m) -> {
							r.setNumberNE("src_trd_unit_dec_place", m.dec_place());
							r.setNumberNE("src_trd_unit_conv_base_qty", m.conv_base_qty());
							r.setNumberNE("src_trd_unit_conv_qty", m.conv_qty());
							r.setStringNE("src_trd_unit_rnd_typ", m.rnd_typ());
					}),
					j -> j
						.add(MAM_UNIT_R.class, r -> toCondition(
							r.getStringNE("base_unit_cd")
						))
						.addSelect(m -> toArray(
							m.unit_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("base_unit_nm", m.unit_nm());
					}),
					j -> j
						.add(MAM_TAX_R.class, r -> toCondition(
							r.getStringNE("tax_cd")
						))
						.addSelect(m -> toArray(
							m.inc_tax_flg,
							m.tax_rate
						))
						.addMap((r, m) -> {
							r.setNumberNE("schd_tax_rate", m.tax_rate());
							r.setBooleanNE("schd_inc_tax_flg", m.inc_tax_flg());
					}),
					j -> j
						.add(MAM_BIZ_RSN_R.class, r -> toCondition(
							r.getStringNE("dscnt_rsn_cd")
						))
						.addSelect(m -> toArray(
							m.biz_rsn_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("dscnt_rsn_nm", m.biz_rsn_nm());
					}),
					j -> j
						.add(MAM_BIZ_RSN_R.class, r -> toCondition(
							r.getStringNE("sls_rsn_cd")
						))
						.addSelect(m -> toArray(
							m.biz_rsn_nm,
							m.sls_acxfr_flg
						))
						.addMap((r, m) -> {
							r.setStringNE("sls_rsn_nm", m.biz_rsn_nm());
							r.setBooleanNE("sls_acxfr_flg", m.sls_acxfr_flg());
					}),
					j -> j
						.add(MAM_LOC_R.class, r -> toCondition(
							r.getStringNE("loc_cd")
						))
						.addSelect(m -> toArray(
							m.loc_nm,
							m.site_cd,
							m.str_ln_tgt_flg
						))
						.addMap((r, m) -> {
							r.setStringNE("loc_nm", m.loc_nm());
							r.setBooleanNE("str_ln_tgt_flg", m.str_ln_tgt_flg());
							r.setStringNE("site_cd", m.site_cd());
					}),
					j -> j
						.add(MAM_STR_LN_R.class, r -> toCondition(
							r.getStringNE("loc_cd"),
							r.getStringNE("str_ln_cd")
						))
						.addSelect(m -> toArray(
							m.str_ln_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("str_ln_nm", m.str_ln_nm());
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
						.add(MAM_STK_GD_R.class, r -> toCondition(
							r.getStringNE("gd_cd")
						))
						.addSelect(m -> toArray(
							m.gd_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("gd_nm", m.gd_nm());
					})
				)
			);
	}
	
	
	/**
	 * -- MSBBL1310_SLO_Query_S01
	 */
	static MCQueryPlan MSBBL1310_SLO_S01() {
		MST_SLO_R S0_T = MST_SLO_R.create("T");
		MAM_CO_R S0_CO = MAM_CO_R.create("CO");
		MAM_BP_R S0_CST = MAM_BP_R.create("CST");
		MAM_DPT_R S0_DPT1 = MAM_DPT_R.create("DPT1");
		MAM_DPT_R S0_DPT2 = MAM_DPT_R.create("DPT2");
		MAVM_RD_DPT_R S0_DAC = MAVM_RD_DPT_R.create("DAC");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBBL1310_SLO_Query_S01")
					.mainQuery()
					.select(
						S0_T.trd_cd,
						S0_T.cst_cd,
						S0_CST.bp_nm.as("cst_nm"),
						value(MAC_SLS_BASIS_TYP.SHIP_BASIS.value()).as("sls_basis_typ"),
						S0_T.sls_usr_cd,
						S0_T.sls_dpt_cd,
						S0_DPT1.dpt_nm.as("sls_dpt_nm"),
						S0_T.sls_usr_cd.as("cst_usr_cd"),
						S0_T.sls_dpt_cd.as("cst_dpt_cd"),
						S0_T.wg_cd,
						S0_T.trd_cur_cd,
						S0_CO.base_cur_cd,
						S0_T.xrate_inpt_flg,
						cases()
							.when(S0_T.xrate_inpt_flg.eq(value(true)))
								.then(S0_T.xrate)
							.otherwise(
								MAPA_XCHNG$F_GET_SLS_XRATE_NE(
									S0_T.trd_cur_cd,
									bind("today")
								)
							).as("xrate"),
						S0_CO.ptax_cur_cd,
						S0_T.ptax_xrate_inpt_flg,
						cases()
							.when(S0_T.ptax_xrate_inpt_flg.eq(value(true)))
								.then(S0_T.ptax_xrate)
							.when(S0_CO.ptax_cur_cd.isNull())
								.then(nullValue())
							.otherwise(
								MAPA_XCHNG$F_GET_XRATE_NE(
									S0_T.trd_cur_cd,
									S0_CO.ptax_cur_cd,
									S0_CO.sls_xrate_cd,
									bind("today")
								)
							).as("ptax_xrate"),
						S0_T.qtn_no,
						S0_T.qtn_rev,
						S0_T.slo_no,
						S0_T.cst_po_no,
						value(false).as("dlv_slip_prntd_flg"),
						S0_CST.acst_cd,
						S0_T.ar_dpt_cd,
						S0_DPT2.dpt_nm.as("ar_dpt_nm"),
						S0_T.trd_rmrks,
						S0_T.tterm_cd1,
						S0_T.tterm_rmrks1,
						S0_T.tterm_cd2,
						S0_T.tterm_rmrks2,
						S0_T.tterm_cd3,
						S0_T.tterm_rmrks3,
						S0_CST.bill_crryovr_times.as("cst_bill_crryovr_times"),
						S0_CST.sls_upri_cng_flg,
						S0_CST.sls_amt_rnd_typ,
						S0_CST.sls_upri_rnd_typ,
						S0_CST.sls_tax_rnd_typ,
						S0_CST.ar_dpt_typ,
						S0_T.upd_cntr.as("slo_upd_cntr"),
						S0_CO.xrate_rnd_typ,
						S0_CO.wtax_rnd_typ,
						S0_CO.sls_xrate_cd.as("xrate_cd"),
						S0_CST.sls_upri_cng_flg
					)
					.from(
						S0_T
						.crossJoin(S0_CO)
						.leftOuterJoin(S0_CST).on(
							bracket(
								S0_T.cst_cd.eq(S0_CST.bp_cd)
							)
						)
						.leftOuterJoin(S0_DPT1).on(
							bracket(
								S0_T.sls_dpt_cd.eq(S0_DPT1.dpt_cd)
								.and(bind("today").between(S0_DPT1.st_dt, S0_DPT1.end_dt))
							)
						)
						.leftOuterJoin(S0_DPT2).on(
							bracket(
								S0_T.ar_dpt_cd.eq(S0_DPT2.dpt_cd)
								.and(bind("today").between(S0_DPT2.st_dt, S0_DPT2.end_dt))
							)
						)
						.innerJoin(S0_DAC).on(
							bracket(
								S0_T.sls_dpt_cd.eq(S0_DAC.dpt_cd)
							)
						)
					)
					.where(
						value(1).eq(value(1))
						.and(S0_T.slo_no.eq(bind("srch_tgt_no")))
						.and(S0_T.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.SLS.value())))
						.and(S0_T.slo_typ.eq(value(MSC_SLO_TYP.SLO.value())))
						.and(S0_T.can_flg.eq(value(false)))
						.and(
							S0_T.aprv_flg.eq(value(false))
							.or(S0_T.aprv_flg.eq(value(true)))
							.and(MAC_APRV_STS_TYP$IS_ACPT(S0_T.aprv_sts_typ).eq(value(true)))
						)
						.and(S0_CST.cst_iv_flg.eq(value(false)))
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
						.add(MAM_BP_R.class, r -> toCondition(
							r.getStringNE("acst_cd")
						))
						.addSelect(m -> toArray(
							m.bcst_cd,
							m.bp_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("acst_nm", m.bp_nm());
							r.setStringNE("join_bcst_cd_", m.bcst_cd());
					}),
					j -> j
						.add(MAM_BP_R.class, r -> toCondition(
							r.getStringNE("join_bcst_cd_")
						))
						.addSelect(m -> toArray(
							m.bill_cl_typ
						))
						.addMap((r, m) -> {
							r.setStringNE("bill_cl_typ", m.bill_cl_typ());
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
							r.setNumberNE("trd_cur_amt_dec_place", m.amt_dec_place());
							r.setNumberNE("trd_cur_upri_dec_place", m.upri_dec_place());
					}),
					j -> j
						.add(MAM_CUR_R.class, r -> toCondition(
							r.getStringNE("base_cur_cd")
						))
						.addSelect(m -> toArray(
							m.amt_dec_place,
							m.cur_nm,
							m.upri_dec_place
						))
						.addMap((r, m) -> {
							r.setStringNE("base_cur_nm", m.cur_nm());
							r.setNumberNE("base_cur_amt_dec_place", m.amt_dec_place());
							r.setNumberNE("base_cur_upri_dec_place", m.upri_dec_place());
					}),
					j -> j
						.add(MAM_CUR_R.class, r -> toCondition(
							r.getStringNE("ptax_cur_cd")
						))
						.addSelect(m -> toArray(
							m.amt_dec_place,
							m.cur_nm,
							m.upri_dec_place
						))
						.addMap((r, m) -> {
							r.setStringNE("ptax_cur_nm", m.cur_nm());
							r.setNumberNE("ptax_cur_amt_dec_place", m.amt_dec_place());
							r.setNumberNE("ptax_cur_upri_dec_place", m.upri_dec_place());
					}),
					j -> j
						.add(MAM_TTERM_R.class, r -> toCondition(
							r.getStringNE("tterm_cd1")
						))
						.addSelect(m -> toArray(
							m.tterm_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("tterm_nm1", m.tterm_nm());
					}),
					j -> j
						.add(MAM_TTERM_R.class, r -> toCondition(
							r.getStringNE("tterm_cd2")
						))
						.addSelect(m -> toArray(
							m.tterm_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("tterm_nm2", m.tterm_nm());
					}),
					j -> j
						.add(MAM_TTERM_R.class, r -> toCondition(
							r.getStringNE("tterm_cd3")
						))
						.addSelect(m -> toArray(
							m.tterm_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("tterm_nm3", m.tterm_nm());
					})
				)
			);
	}
	
	/**
	 * -- MSBBL1310_IV_D_Query_S01
	 */
	static MCQueryPlan MSBBL1310_IV_D_S01() {
		MST_IV_R S0_IV = MST_IV_R.create("IV");
		MST_IV_D_R S0_IVD = MST_IV_D_R.create("IVD");
		MST_SLS_SCHD_R S0_SLSSCHD = MST_SLS_SCHD_R.create("SLSSCHD");
		MST_SLO_R S0_SLO = MST_SLO_R.create("SLO");
		MST_SLO_D_R S0_SLOD = MST_SLO_D_R.create("SLOD");
		MST_SHIP_PR_R S0_SHIPPR = MST_SHIP_PR_R.create("SHIPPR");
		MCTempView S0_SHIPACTD = createTempView("SHIPACTD");
		MST_SHIP_ACT_D_R S1_SHIPACTD = MST_SHIP_ACT_D_R.create("SHIPACTD1");
		MST_IV_MAP_R S1_IVMAP = MST_IV_MAP_R.create("IVMAP1");
		MST_SHIP_ALLOC_STS_R S1_SHIPALLOCSTS = MST_SHIP_ALLOC_STS_R.create("SHIPALLOCSTS1");
		MCTempView S2_W = createTempView("W");
		MST_SHIP_ACT_D_R S2_SHIPACTD = MST_SHIP_ACT_D_R.create("SHIPACTD2");
		MST_IV_MAP_R S2_IVMAP = MST_IV_MAP_R.create("IVMAP2");
		MST_SHIP_ALLOC_STS_R S2_SHIPALLOCSTS = MST_SHIP_ALLOC_STS_R.create("SHIPALLOCSTS2");
		
		
		MAM_ITM_R S0_ITM = MAM_ITM_R.create("ITM");
		MAM_BP_R S0_DLV = MAM_BP_R.create("DLV");
		MAM_BP_R S0_CST = MAM_BP_R.create("CST");
		MAVM_ITM_UNIT_R S0_BIU = MAVM_ITM_UNIT_R.create("BIU");
		MAM_TAX_R S0_TAX = MAM_TAX_R.create("TAX");
		MAM_DPT_R S0_DPT1 = MAM_DPT_R.create("DPT1");
		MAM_DPT_R S0_DPT2 = MAM_DPT_R.create("DPT2");
		MAM_DPT_R S0_DPT3 = MAM_DPT_R.create("DPT3");
		MAM_ITM_LCL_R S0_ITMLCL = MAM_ITM_LCL_R.create("ITMLCL");
		
		return createQueryPlan()
			.setQuery(
				sql("MSBBL1310_IV_D_Query_S01")
					.mainQuery()
					.select(
						value(false).as("abort_flg"),
						S0_SLOD.sls_cststk_flg.as("sls_cststk_flg"),
						S0_IVD.trd_cd,
						S0_IVD.itm_cd,
						S0_IVD.itm_sub1,
						S0_IVD.itm_sub2,
						S0_IVD.itm_sub3,
						nvl(
							S0_IVD.itm_nm,
							S0_ITM.itm_nm
						).as("itm_nm"),
						decode(
							S0_IVD.sundry_itm_flg,
							value(true),
							S0_IVD.iv_itm_nm,
							nvl(
								S0_ITMLCL.itm_nm,
								S0_ITM.itm_nm
							)
						).as("iv_itm_nm"),
						S0_ITM.asset_mng_typ,
						S0_IVD.sundry_itm_flg,
						S0_SLSSCHD.sls_schd_dt,
						S0_IV.dlv_id_cd.as("dlv_cd"),
						nvl(
							S0_IV.dlv_id_nm,
							S0_DLV.bp_nm
						).as("dlv_nm"),
						S0_IV.dlv_zip_cd,
						S0_IV.dlv_addr1,
						S0_IV.dlv_addr2,
						S0_IV.dlv_addr3,
						S0_IV.dlv_addr4,
						S0_IV.dlv_cntct_dpt,
						S0_IV.dlv_cntct_psn,
						S0_IV.dlv_tel,
						S0_IV.dlv_fax,
						S0_DLV.cntry_cd,
						S0_IVD.cntry_org_cd,
						S0_SLOD.dest_cd1,
						S0_SLOD.dest_cd2,
						S0_SLOD.dest_cd3,
						S0_IVD.sls_usr_cd,
						S0_IVD.sls_dpt_cd,
						S0_DPT2.dpt_nm.as("sls_dpt_nm"),
						S0_IVD.trd_unit_cd,
						S0_IVD.base_unit_cd,
						bracket(
							S0_SLSSCHD.base_unit_qty.subtract(S0_SLSSCHD.base_unit_sls_qty)
						).as("base_unit_qty"),
						S0_IVD.base_unit_qty.as("ship_qty"),
						S0_SLSSCHD.base_unit_abort_qty.as("abort_qty"),
						S0_SLSSCHD.base_unit_sls_qty.as("sls_qty"),
						S0_IVD.interim_flg,
						S0_IVD.upri_not_tgt_flg,
						S0_IVD.tax_fix_flg,
						S0_IVD.tax_cd,
						S0_TAX.tax_nm,
						S0_TAX.tax_rate,
						S0_IVD.dscnt_rsn_cd,
						S0_SLOD.cost_upri,
						nvl(
							nvl(
								S0_SLOD.bill_crryovr_times,
								S0_ITM.bill_crryovr_times
							),
							S0_CST.bill_crryovr_times
						).as("bill_crryovr_times"),
						S0_IVD.sno1,
						S0_IVD.sno2,
						S0_IVD.sno3,
						S0_IVD.sno4,
						S0_IVD.cst_po_no,
						S0_IVD.cst_po_d_no,
						S0_IVD.cst_itm_cd,
						S0_IVD.cst_itm_nm,
						S0_IVD.rsn_cd.as("sls_rsn_cd"),
						S0_IVD.bd_dpt_cd,
						S0_DPT1.dpt_nm.as("bd_dpt_nm"),
						S0_IVD.wtax_rate,
						S0_IVD.wtax_amt,
						S0_IVD.ar_dpt_cd,
						S0_DPT3.dpt_nm.as("ar_dpt_nm"),
						S0_IVD.iv_d_rmrks,
						S0_IVD.trd_d_rmrks.as("iv_trd_d_rmrks"),
						S0_IVD.trd_rmrks.as("iv_trd_rmrks"),
						S0_IVD.intr_d_rmrks.as("iv_intr_d_rmrks"),
						S0_IVD.sub_char1.as("iv_sub_char1"),
						S0_IVD.sub_char2.as("iv_sub_char2"),
						S0_IVD.sub_char3.as("iv_sub_char3"),
						S0_IVD.trd_d_rmrks.as("trd_d_rmrks"),
						S0_SLOD.qtn_d_no,
						S0_SLO.qtn_no,
						S0_SLO.qtn_rev,
						S0_IVD.slo_d_no,
						S0_SLO.slo_no,
						S0_IVD.iv_d_no,
						S0_ITM.lot_mng_typ,
						S0_ITM.sublot_mng_typ,
						S0_ITM.ver_flg,
						S0_SLOD.not_lot_mix_flg,
						S0_SLOD.not_sublot_mix_flg,
						S0_ITM.sno1_mng_typ,
						S0_ITM.sno2_mng_typ,
						S0_ITM.sno3_mng_typ,
						S0_ITM.sno4_mng_typ,
						S0_ITM.bill_crryovr_times.as("itm_bill_crryovr_times"),
						S0_ITM.stk_mng_typ,
						S0_ITM.dscnt_itm_flg,
						S0_ITM.sls_upri_cng_flg,
						S0_ITM.dec_place.as("base_unit_dec_place"),
						S0_ITM.rnd_typ.as("base_unit_rnd_typ"),
						S0_ITM.exim_xpns_typ,
						S0_TAX.inc_tax_flg,
						S0_TAX.tax_typ,
						S0_IV.dlv_sundry_flg,
						S0_SLSSCHD.sls_schd_no,
						S0_SLSSCHD.base_unit_qty.as("sls_schd_qty"),
						S0_SLSSCHD.upd_cntr.as("sls_schd_upd_cntr"),
						S0_SHIPPR.ship_pr_no,
						S0_SHIPPR.upd_cntr.as("ship_pr_upd_cntr"),
						S0_IVD.trd_cur_upri,
						S0_IVD.trd_cur_dscnt_amt,
						S0_IVD.trd_cur_amt,
						S0_IVD.trd_cur_tax_amt,
						S0_IVD.trd_cur_amt.add(S0_IVD.trd_cur_tax_amt).as("trd_cur_inc_tax_amt"),
						S0_SLSSCHD.base_unit_qty,
						S0_IVD.iv_upri,
						S0_IVD.iv_amt,
						S0_IVD.gd_cd,
						S0_IVD.itm_cd.as("join_itm_cd_"),
						S0_IVD.itm_sub1.as("join_itm_sub1_"),
						S0_IVD.itm_sub2.as("join_itm_sub2_"),
						S0_IVD.itm_sub3.as("join_itm_sub3_"),
						S0_IVD.trd_unit_cd.as("join_trd_unit_cd_"),
						S0_SHIPACTD.pr("dlv_slip_d_no").as("ship_dlv_slip_d_no"),
						S0_SHIPACTD.pr("dlv_slip_no").as("ship_dlv_slip_no"),
						bracket(
							subQuery()
							.select(count(S2_W.pr(S2_SHIPACTD.dlv_slip_d_no)))
							.from(
								subQuery()
								.selectDistinct(S2_SHIPACTD.dlv_slip_d_no)
								.from(
									S2_IVMAP
									.innerJoin(S2_SHIPALLOCSTS).on(S2_IVMAP.ship_schd_no.eq(S2_SHIPALLOCSTS.ship_schd_no))
									.innerJoin(S2_SHIPACTD).on(S2_SHIPALLOCSTS.ship_alloc_sts_no.eq(S2_SHIPACTD.ship_alloc_sts_no))
								)
								.where(
									value(0).eq(value(0))
									.and(S2_SHIPALLOCSTS.ship_act_qty.neq(value(0)))
									.and(S2_SHIPACTD.can_flg.eq(value(false)))
									.and(S2_IVMAP.iv_d_no.eq(S0_SLSSCHD.iv_d_no))
								).view(S2_W)
							)
						).as("dlv_slip_d_cnt")
					)
					.from(
						S0_IV
						.innerJoin(S0_IVD).on(
							bracket(
								S0_IV.iv_mng_no.eq(S0_IVD.iv_mng_no)
							)
						)
						.innerJoin(S0_SLSSCHD).on(
							bracket(
								S0_IVD.iv_d_no.eq(S0_SLSSCHD.iv_d_no)
							)
						)
						.leftOuterJoin(S0_SLOD).on(
							bracket(
								S0_IVD.slo_d_no.eq(S0_SLOD.slo_d_no)
							)
						)
						.leftOuterJoin(S0_SLO).on(
							bracket(
								S0_SLOD.slo_no.eq(S0_SLO.slo_no)
							)
						)
						.leftOuterJoin(S0_SHIPPR).on(
							bracket(
								S0_SLOD.slo_d_no.eq(S0_SHIPPR.slo_d_no)
							)
						)
						.leftOuterJoin(
							subQuery()
								.select(
									max(S1_SHIPACTD.dlv_slip_no).as("dlv_slip_no"),
									max(S1_SHIPACTD.dlv_slip_d_no).as("dlv_slip_d_no"),
									S1_IVMAP.iv_d_no
								)
								.from(
									S1_IVMAP
									.innerJoin(S1_SHIPALLOCSTS).on(S1_IVMAP.ship_schd_no.eq(S1_SHIPALLOCSTS.ship_schd_no))
									.innerJoin(S1_SHIPACTD).on(S1_SHIPALLOCSTS.ship_alloc_sts_no.eq(S1_SHIPACTD.ship_alloc_sts_no))
								)
								.where(
									value(0).eq(value(0))
									.and(S1_SHIPALLOCSTS.ship_act_qty.neq(value(0)))
									.and(S1_SHIPACTD.can_flg.eq(value(false)))
								)
								.groupBy(S1_IVMAP.iv_d_no).view(S0_SHIPACTD)
							).on(S0_SLSSCHD.iv_d_no.eq(S0_SHIPACTD.pr(S1_IVMAP.iv_d_no))
						)
						.leftOuterJoin(S0_ITM).on(
							bracket(
								S0_IVD.itm_cd.eq(S0_ITM.itm_cd)
								.and(S0_IVD.itm_sub1.eq(S0_ITM.itm_sub1))
								.and(S0_IVD.itm_sub2.eq(S0_ITM.itm_sub2))
								.and(S0_IVD.itm_sub3.eq(S0_ITM.itm_sub3))
							)
						)
						.leftOuterJoin(S0_DLV).on(
							bracket(
								S0_IV.dlv_id_cd.eq(S0_DLV.bp_cd)
							)
						)
						.leftOuterJoin(S0_CST).on(
							bracket(
								S0_IV.ship_rqst_id_cd.eq(S0_CST.bp_cd)
							)
						)
						.leftOuterJoin(S0_BIU).on(
							bracket(
								S0_IVD.itm_cd.eq(S0_BIU.itm_cd)
								.and(S0_IVD.itm_sub1.eq(S0_BIU.itm_sub1))
								.and(S0_IVD.itm_sub2.eq(S0_BIU.itm_sub2))
								.and(S0_IVD.itm_sub3.eq(S0_BIU.itm_sub3))
								.and(S0_IVD.base_unit_cd.eq(S0_BIU.unit_cd))
							)
						)
						.leftOuterJoin(S0_TAX).on(
							bracket(
								S0_IVD.tax_cd.eq(S0_TAX.tax_cd)
							)
						)
						.leftOuterJoin(S0_DPT1).on(
							bracket(
								S0_IVD.bd_dpt_cd.eq(S0_DPT1.dpt_cd)
								.and(bind("today").between(S0_DPT1.st_dt, S0_DPT1.end_dt))
							)
						)
						.leftOuterJoin(S0_DPT2).on(
							bracket(
								S0_IVD.sls_dpt_cd.eq(S0_DPT2.dpt_cd)
								.and(bind("today").between(S0_DPT2.st_dt, S0_DPT2.end_dt))
							)
						)
						.leftOuterJoin(S0_DPT3).on(
							bracket(
								S0_IVD.ar_dpt_cd.eq(S0_DPT3.dpt_cd)
								.and(bind("today").between(S0_DPT3.st_dt, S0_DPT3.end_dt))
							)
						)
						.leftOuterJoin(S0_ITMLCL).on(
							bracket(
								S0_IVD.itm_cd.eq(S0_ITMLCL.itm_cd)
								.and(S0_IVD.itm_sub1.eq(S0_ITMLCL.itm_sub1))
								.and(S0_IVD.itm_sub2.eq(S0_ITMLCL.itm_sub2))
								.and(S0_IVD.itm_sub3.eq(S0_ITMLCL.itm_sub3))
								.and(S0_ITMLCL.lcl_cd.eq(S0_DLV.prnt_lcl_cd))
							)
						)
					)
					.where(
						value(1).eq(value(1))
						.and(S0_IV.iv_no.eq(bind("iv_no")))
						.and(S0_SLSSCHD.cmpl_flg.eq(value(false)))
						.and(S0_SLSSCHD.sls_ac_abl_flg.eq(value(true)))
						.and(MAC_SLO_PROC_TYP$IS_PURC_DDLV(S0_SLOD.proc_typ).eq(value(false)))
					)
					.orderBy(S0_IVD.disp_seq.asc())
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
						.add(MAM_CNTRY_R.class, r -> toCondition(
							r.getStringNE("cntry_cd")
						))
						.addSelect(m -> toArray(
							m.cntry_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("cntry_nm", m.cntry_nm());
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
						.add(MAVM_ITM_UNIT_R.class, r -> toCondition(
							r.getStringNE("itm_cd"),
							r.getStringNE("itm_sub1"),
							r.getStringNE("itm_sub2"),
							r.getStringNE("itm_sub3"),
							r.getStringNE("trd_unit_cd")
						))
						.addSelect(m -> toArray(
							m.conv_base_qty,
							m.conv_qty,
							m.dec_place,
							m.rnd_typ
						))
						.addMap((r, m) -> {
							r.setNumberNE("trd_unit_dec_place", m.dec_place());
							r.setNumberNE("trd_unit_conv_base_qty", m.conv_base_qty());
							r.setNumberNE("trd_unit_conv_qty", m.conv_qty());
							r.setStringNE("trd_unit_rnd_typ", m.rnd_typ());
							r.setNumberNE("schd_trd_unit_conv_base_qty", m.conv_base_qty());
							r.setNumberNE("schd_trd_unit_conv_qty", m.conv_qty());
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
						.add(MAM_UNIT_R.class, r -> toCondition(
							r.getStringNE("base_unit_cd")
						))
						.addSelect(m -> toArray(
							m.unit_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("base_unit_nm", m.unit_nm());
					}),
					j -> j
						.add(MAVM_ITM_UNIT_R.class, r -> toCondition(
							r.getStringNE("join_itm_cd_"),
							r.getStringNE("join_itm_sub1_"),
							r.getStringNE("join_itm_sub2_"),
							r.getStringNE("join_itm_sub3_"),
							r.getStringNE("join_trd_unit_cd_")
						))
						.addSelect(m -> toArray(
							m.conv_base_qty,
							m.conv_qty,
							m.dec_place,
							m.rnd_typ
						))
						.addMap((r, m) -> {
							r.setNumberNE("trd_unit_dec_place", m.dec_place());
							r.setNumberNE("trd_unit_conv_base_qty", m.conv_base_qty());
							r.setNumberNE("trd_unit_conv_qty", m.conv_qty());
							r.setStringNE("trd_unit_rnd_typ", m.rnd_typ());
					}),
					j -> j
						.add(MAM_TAX_R.class, r -> toCondition(
							r.getStringNE("tax_cd")
						))
						.addSelect(m -> toArray(
							m.inc_tax_flg,
							m.tax_rate
						))
						.addMap((r, m) -> {
							r.setNumberNE("schd_tax_rate", m.tax_rate());
							r.setBooleanNE("schd_inc_tax_flg", m.inc_tax_flg());
					}),
					j -> j
						.add(MAM_BIZ_RSN_R.class, r -> toCondition(
							r.getStringNE("dscnt_rsn_cd")
						))
						.addSelect(m -> toArray(
							m.biz_rsn_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("dscnt_rsn_nm", m.biz_rsn_nm());
					}),
					j -> j
						.add(MAM_BIZ_RSN_R.class, r -> toCondition(
							r.getStringNE("sls_rsn_cd")
						))
						.addSelect(m -> toArray(
							m.biz_rsn_nm,
							m.sls_acxfr_flg
						))
						.addMap((r, m) -> {
							r.setStringNE("sls_rsn_nm", m.biz_rsn_nm());
							r.setBooleanNE("sls_acxfr_flg", m.sls_acxfr_flg());
					}),
					j -> j
						.add(MSVT_WRK_SNO_R.class, r -> toCondition(
							r.getStringNE("sno1")
						))
						.addSelect(m -> toArray(
							m.wrk_no
						))
						.addMap((r, m) -> {
							r.setStringNE("wrk_no", m.wrk_no());
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
					.add(MAM_CNTRY_R.class, r -> toCondition(
						r.getStringNE("cntry_org_cd")
					))
					.addSelect(m -> toArray(
						m.cntry_nm
					))
					.addMap((r, m) -> {
						r.setStringNE("cntry_org_nm", m.cntry_nm());
					}),
					j -> j
						.add(MAM_STK_GD_R.class, r -> toCondition(
							r.getStringNE("gd_cd")
						))
						.addSelect(m -> toArray(
							m.gd_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("gd_nm", m.gd_nm());
					})
				)
			);
	}
	
	/**
	 * -- MSBBL1310_IV_Query_S01
	 */
	static MCQueryPlan MSBBL1310_IV_S01() {
		MST_IV_R S0_IV = MST_IV_R.create("IV");
		MST_IV_D_R S0_IVD = MST_IV_D_R.create("IVD");
		MST_IV_SHIP_ACT_MAP_R S0_IVACTMAP = MST_IV_SHIP_ACT_MAP_R.create("IVACTMAP");
		MST_SHIP_ACT_D_R S0_SHIPACTD = MST_SHIP_ACT_D_R.create("SHIPACTD");
		MST_SLO_R S0_SLO = MST_SLO_R.create("SLO");
		MST_QTN_R S0_QTN = MST_QTN_R.create("QTN");
		
		MAM_CO_R S0_CO = MAM_CO_R.create("CO");
		MAM_BP_R S0_CST = MAM_BP_R.create("CST");
		MAM_DPT_R S0_DPT1 = MAM_DPT_R.create("DPT1");
		MAM_DPT_R S0_DPT2 = MAM_DPT_R.create("DPT2");
		MAM_EDI_IF_CTL_R S1_EDI = MAM_EDI_IF_CTL_R.create("EDI");
		
		return createQueryPlan()
			.setQuery(
				sql("MSBBL1310_IV_Query_S01")
					.mainQuery()
					.select(
						S0_IVD.trd_cd,
						decode(
								bracket(
									subQuery()
									.select(S1_EDI.bp_cd)
									.from(S1_EDI)
									.where(
											S1_EDI.bp_cd.eq(S0_IV.ship_rqst_id_cd)
										.and(bind("today").between(S1_EDI.st_dt, S1_EDI.end_dt))
										.and(S1_EDI.if_proc_typ.eq(value(MAC_IF_PROC_TYP.ACCPT_RECV.value())))
										.and(S1_EDI.del_flg.eq(value(false)))
									)
								),
								nullValue(),
								value(false),
								value(true)
							).as("edi_flg"),
						S0_SHIPACTD.dlv_slip_no.as("ship_dlv_slip_no"),
						S0_IV.ship_rqst_id_cd.as("cst_cd"),
						S0_CST.bp_nm.as("cst_nm"),
						value(true).as("cst_iv_flg"),
						S0_IV.sls_basis_typ,
						S0_IVD.sls_usr_cd,
						S0_IVD.sls_dpt_cd,
						S0_DPT1.dpt_nm.as("sls_dpt_nm"),
						S0_IVD.sls_usr_cd.as("cst_usr_cd"),
						S0_IVD.sls_dpt_cd.as("cst_dpt_cd"),
						S0_IV.trd_cur_cd,
						S0_CO.base_cur_cd,
						S0_IV.xrate_inpt_flg,
						cases()
							.when(S0_IV.xrate_inpt_flg.eq(value(true)))
								.then(S0_IV.xrate)
							.otherwise(
								MAPA_XCHNG$F_GET_SLS_XRATE_NE(
									S0_IV.trd_cur_cd,
									bind("today")
								)
							).as("xrate"),
						S0_CO.ptax_cur_cd,
						S0_IV.ptax_xrate_inpt_flg,
						cases()
							.when(S0_IV.ptax_xrate_inpt_flg.eq(value(true)))
								.then(S0_IV.ptax_xrate)
							.when(S0_CO.ptax_cur_cd.isNull())
								.then(nullValue())
							.otherwise(
								MAPA_XCHNG$F_GET_XRATE_NE(
									S0_IV.trd_cur_cd,
									S0_CO.ptax_cur_cd,
									S0_CO.sls_xrate_cd,
									bind("today")
								)
							).as("ptax_xrate"),
						value(false).as("dlv_slip_prntd_flg"),
						S0_CST.acst_cd,
						S0_IVD.ar_dpt_cd,
						S0_DPT2.dpt_nm.as("ar_dpt_nm"),
						S0_CST.bill_crryovr_times.as("cst_bill_crryovr_times"),
						S0_CST.sls_upri_cng_flg,
						S0_CST.sls_amt_rnd_typ,
						S0_CST.sls_upri_rnd_typ,
						S0_CST.sls_tax_rnd_typ,
						S0_CST.ar_dpt_typ,
						S0_IV.upd_cntr.as("iv_upd_cntr"),
						S0_SLO.upd_cntr.as("slo_upd_cntr"),
						S0_QTN.upd_cntr.as("qtn_upd_cntr"),
						S0_CO.xrate_rnd_typ,
						S0_CO.wtax_rnd_typ,
						S0_CO.sls_xrate_cd.as("xrate_cd"),
						S0_SHIPACTD.ship_act_no,
						S0_IVD.slo_no,
						S0_IVD.cst_po_no,
						S0_SLO.qtn_no,
						S0_SLO.qtn_rev,
						S0_IV.iv_src_typ,
						S0_IV.iv_mng_no,
						S0_IV.iv_no,
						S0_IV.iv_rev,
						value(true).as("iv_latest_flg"),
						S0_IV.iv_dt,
						S0_IV.iv_prnt_flg,
						S0_IV.pl_skip_flg,
						S0_IV.pl_reg_flg,
						S0_IV.trnspt_cd,
						S0_IV.vssl_flght,
						S0_IV.load_port_cd,
						S0_IV.etd_dt,
						S0_IV.dschrg_port_cd,
						S0_IV.eta_dt,
						S0_IV.via_port_cd,
						S0_IV.via_schd_dt,
						S0_IV.tterm_cd1.as("iv_tterm_cd1"),
						S0_IV.tterm_rmrks1.as("iv_tterm_rmrks1"),
						S0_IV.tterm_cd2.as("iv_tterm_cd2"),
						S0_IV.tterm_rmrks2.as("iv_tterm_rmrks2"),
						S0_IV.tterm_cd3.as("iv_tterm_cd3"),
						S0_IV.tterm_rmrks3.as("iv_tterm_rmrks3"),
						S0_IV.rcv_schd_dt,
						S0_IV.lc_no,
						S0_IV.lc_dt,
						S0_IV.lc_rmrks,
						S0_IV.bl_no,
						S0_IV.bl_dt,
						S0_IV.bl_rmrks,
						S0_IV.iv_rmrks,
						S0_IVD.trd_rmrks,
						S0_IV.case_mrk1,
						S0_IV.case_mrk2,
						S0_IV.case_mrk3,
						S0_IV.case_mrk4,
						S0_IV.case_mrk5,
						S0_IV.case_mrk6,
						S0_IV.intr_rmrks.as("iv_intr_rmrks"),
						S0_IV.sub_char1.as("iv_sub_char1"),
						S0_IV.sub_char2.as("iv_sub_char2"),
						S0_IV.sub_char3.as("iv_sub_char3")
					)
					.from(
						S0_IV
						.crossJoin(S0_CO)
						.leftOuterJoin(S0_CST).on(
							bracket(
								S0_IV.ship_rqst_id_cd.eq(S0_CST.bp_cd)
							)
						)
						.innerJoin(S0_IVD).on(
							bracket(
								S0_IV.iv_mng_no.eq(S0_IVD.iv_mng_no)
							)
						)
						.leftOuterJoin(S0_IVACTMAP).on(
							bracket(
								S0_IVD.iv_d_no.eq(S0_IVACTMAP.iv_d_no)
							)
						)
						.leftOuterJoin(S0_SHIPACTD).on(
							bracket(
								S0_IVACTMAP.ship_act_d_no.eq(S0_SHIPACTD.ship_act_d_no)
							)
						)
						.leftOuterJoin(S0_SLO).on(
							bracket(
								S0_IVD.slo_no.eq(S0_SLO.slo_no)
							)
						)
						.leftOuterJoin(S0_QTN).on(
							bracket(
								S0_SLO.qtn_no.eq(S0_QTN.qtn_no)
								.and(S0_SLO.qtn_rev.eq(S0_QTN.qtn_rev))
							)
						)
						.leftOuterJoin(S0_DPT1).on(
							bracket(
								S0_IVD.sls_dpt_cd.eq(S0_DPT1.dpt_cd)
								.and(bind("today").between(S0_DPT1.st_dt, S0_DPT1.end_dt))
							)
						)
						.leftOuterJoin(S0_DPT2).on(
							bracket(
								S0_IVD.ar_dpt_cd.eq(S0_DPT2.dpt_cd)
								.and(bind("today").between(S0_DPT2.st_dt, S0_DPT2.end_dt))
							)
						)
					)
					.where(
						value(1).eq(value(1))
						.and(S0_IV.iv_no.eq(bind("srch_tgt_no")))
						.and(S0_CST.cst_iv_flg.eq(value(true)))
						.and(S0_IV.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.SLS.value())))
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
						.add(MAM_BP_R.class, r -> toCondition(
							r.getStringNE("acst_cd")
						))
						.addSelect(m -> toArray(
							m.bcst_cd,
							m.bp_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("acst_nm", m.bp_nm());
							r.setStringNE("join_bcst_cd_", m.bcst_cd());
					}),
					j -> j
						.add(MAM_BP_R.class, r -> toCondition(
							r.getStringNE("join_bcst_cd_")
						))
						.addSelect(m -> toArray(
							m.bill_cl_typ
						))
						.addMap((r, m) -> {
							r.setStringNE("bill_cl_typ", m.bill_cl_typ());
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
							r.setNumberNE("trd_cur_amt_dec_place", m.amt_dec_place());
							r.setNumberNE("trd_cur_upri_dec_place", m.upri_dec_place());
					}),
					j -> j
						.add(MAM_CUR_R.class, r -> toCondition(
							r.getStringNE("base_cur_cd")
						))
						.addSelect(m -> toArray(
							m.amt_dec_place,
							m.cur_nm,
							m.upri_dec_place
						))
						.addMap((r, m) -> {
							r.setStringNE("base_cur_nm", m.cur_nm());
							r.setNumberNE("base_cur_amt_dec_place", m.amt_dec_place());
							r.setNumberNE("base_cur_upri_dec_place", m.upri_dec_place());
					}),
					j -> j
						.add(MAM_CUR_R.class, r -> toCondition(
							r.getStringNE("ptax_cur_cd")
						))
						.addSelect(m -> toArray(
							m.amt_dec_place,
							m.cur_nm,
							m.upri_dec_place
						))
						.addMap((r, m) -> {
							r.setStringNE("ptax_cur_nm", m.cur_nm());
							r.setNumberNE("ptax_cur_amt_dec_place", m.amt_dec_place());
							r.setNumberNE("ptax_cur_upri_dec_place", m.upri_dec_place());
					}),
					j -> j
					.add(MAM_TRNSPT_R.class, r -> toCondition(
						r.getStringNE("trnspt_cd")
					))
					.addSelect(m -> toArray(
						m.trnspt_nm
					))
					.addMap((r, m) -> {
						r.setStringNE("trnspt_nm", m.trnspt_nm());
					}),
					j -> j
						.add(MAM_EXIM_PORT_R.class, r -> toCondition(
							r.getStringNE("load_port_cd")
						))
						.addSelect(m -> toArray(
							m.port_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("load_port_nm", m.port_nm());
					}),
					j -> j
						.add(MAM_EXIM_PORT_R.class, r -> toCondition(
							r.getStringNE("dschrg_port_cd")
						))
						.addSelect(m -> toArray(
							m.port_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("dschrg_port_nm", m.port_nm());
					}),
					j -> j
						.add(MAM_EXIM_PORT_R.class, r -> toCondition(
							r.getStringNE("via_port_cd")
						))
						.addSelect(m -> toArray(
							m.port_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("via_port_nm", m.port_nm());
					}),
					j -> j
						.add(MAM_TTERM_R.class, r -> toCondition(
							r.getStringNE("iv_tterm_cd1")
						))
						.addSelect(m -> toArray(
							m.tterm_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("iv_tterm_nm1", m.tterm_nm());
					}),
					j -> j
						.add(MAM_TTERM_R.class, r -> toCondition(
							r.getStringNE("iv_tterm_cd2")
						))
						.addSelect(m -> toArray(
							m.tterm_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("iv_tterm_nm2", m.tterm_nm());
					}),
					j -> j
						.add(MAM_TTERM_R.class, r -> toCondition(
							r.getStringNE("iv_tterm_cd3")
						))
						.addSelect(m -> toArray(
							m.tterm_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("iv_tterm_nm3", m.tterm_nm());
					})
				)
			);
	}
	/**
	 * -- MSBBL1310_SLS_ACT_D_Query_S01
	 */
	static MCQueryPlan MSBBL1310_SLS_ACT_D_S01() {
		MST_SLS_ACT_R S0_T1 = MST_SLS_ACT_R.create("T1");
		MST_SLS_ACT_D_R S0_T2 = MST_SLS_ACT_D_R.create("T2");
		MST_SLS_SCHD_R S0_T3 = MST_SLS_SCHD_R.create("T3");
		MST_SLO_D_R S0_T4 = MST_SLO_D_R.create("T4");
		MST_QTN_D_R S0_T5 = MST_QTN_D_R.create("T5");
		MST_SHIP_PR_R S0_T7 = MST_SHIP_PR_R.create("T7");
		MST_LOT_R S0_T8 = MST_LOT_R.create("T8");
		MAM_BP_R S0_DLV = MAM_BP_R.create("DLV");
		MAM_ITM_R S0_ITM = MAM_ITM_R.create("ITM");
		MAVM_ITM_UNIT_R S0_BIU = MAVM_ITM_UNIT_R.create("BIU");
		MAM_DPT_R S0_DPT = MAM_DPT_R.create("DPT");
		MAM_EDI_IF_CTL_R S0_EDI = MAM_EDI_IF_CTL_R.create("EDI");
		MAM_EXT_SYS_R S0_EXT = MAM_EXT_SYS_R.create("EXT");
		MST_SLS_SCHD_R S1_W = MST_SLS_SCHD_R.create("W");
		MST_SLS_SCHD_R S2_W = MST_SLS_SCHD_R.create("W");
		MST_SHIP_SCHD_R S3_X = MST_SHIP_SCHD_R.create("X");
		MST_SHIP_ACT_D_R S4_X = MST_SHIP_ACT_D_R.create("X");
		MST_SLS_SCHD_R S5_W = MST_SLS_SCHD_R.create("W");
		MST_SLS_SCHD_R S6_W = MST_SLS_SCHD_R.create("W");
		MST_SLS_SCHD_R S7_W = MST_SLS_SCHD_R.create("W");
		MST_SLS_SCHD_R S8_W = MST_SLS_SCHD_R.create("W");
		MST_QTN_D_R S9_W = MST_QTN_D_R.create("W");
		MST_DLV_SLIP_D_R S10_W = MST_DLV_SLIP_D_R.create("W");
		MST_SLO_D_R S12_W = MST_SLO_D_R.create("W");
		MST_QTN_D_R S13_W = MST_QTN_D_R.create("W");
		MST_QTN_D_R S14_W = MST_QTN_D_R.create("W");
		MST_DLV_SLIP_D_R S15_W = MST_DLV_SLIP_D_R.create("W");
		MST_SLO_D_R S17_W = MST_SLO_D_R.create("W");
		MST_QTN_D_R S18_W = MST_QTN_D_R.create("W");
		MST_QTN_D_R S19_W = MST_QTN_D_R.create("W");
		MAM_TAX_R S19_STAX = MAM_TAX_R.create("STAX");
		MST_DLV_SLIP_D_R S20_W = MST_DLV_SLIP_D_R.create("W");
		MAM_TAX_R S20_STAX = MAM_TAX_R.create("STAX");
		MST_SLO_D_R S22_W = MST_SLO_D_R.create("W");
		MAM_TAX_R S22_STAX = MAM_TAX_R.create("STAX");
		MST_QTN_D_R S23_W = MST_QTN_D_R.create("W");
		MAM_TAX_R S23_STAX = MAM_TAX_R.create("STAX");
		MST_QTN_D_R S24_W = MST_QTN_D_R.create("W");
		MAVM_ITM_UNIT_R S24_WIU = MAVM_ITM_UNIT_R.create("WIU");
		MST_DLV_SLIP_D_R S25_W = MST_DLV_SLIP_D_R.create("W");
		MAVM_ITM_UNIT_R S25_WIU = MAVM_ITM_UNIT_R.create("WIU");
		MST_SLO_D_R S27_W = MST_SLO_D_R.create("W");
		MAVM_ITM_UNIT_R S27_WIU = MAVM_ITM_UNIT_R.create("WIU");
		MST_QTN_D_R S28_W = MST_QTN_D_R.create("W");
		MAVM_ITM_UNIT_R S28_WIU = MAVM_ITM_UNIT_R.create("WIU");
		MST_QTN_D_R S29_W = MST_QTN_D_R.create("W");
		MAVM_ITM_UNIT_R S29_WIU = MAVM_ITM_UNIT_R.create("WIU");
		MST_DLV_SLIP_D_R S30_W = MST_DLV_SLIP_D_R.create("W");
		MAVM_ITM_UNIT_R S30_WIU = MAVM_ITM_UNIT_R.create("WIU");
		MST_SLO_D_R S32_W = MST_SLO_D_R.create("W");
		MAVM_ITM_UNIT_R S32_WIU = MAVM_ITM_UNIT_R.create("WIU");
		MST_QTN_D_R S33_W = MST_QTN_D_R.create("W");
		MAVM_ITM_UNIT_R S33_WIU = MAVM_ITM_UNIT_R.create("WIU");
		MST_QTN_D_R S34_W = MST_QTN_D_R.create("W");
		MST_DLV_SLIP_D_R S35_W = MST_DLV_SLIP_D_R.create("W");
		MST_SLO_D_R S37_W = MST_SLO_D_R.create("W");
		MST_QTN_D_R S38_W = MST_QTN_D_R.create("W");
		MST_QTN_D_R S39_W = MST_QTN_D_R.create("W");
		MST_DLV_SLIP_D_R S40_W = MST_DLV_SLIP_D_R.create("W");
		MST_SLO_D_R S42_W = MST_SLO_D_R.create("W");
		MST_QTN_D_R S43_W = MST_QTN_D_R.create("W");
		MST_QTN_D_R S44_W = MST_QTN_D_R.create("W");
		MST_DLV_SLIP_D_R S45_W = MST_DLV_SLIP_D_R.create("W");
		MST_SLO_D_R S47_W = MST_SLO_D_R.create("W");
		MST_QTN_D_R S48_W = MST_QTN_D_R.create("W");
		MST_QTN_D_R S49_W = MST_QTN_D_R.create("W");
		MST_DLV_SLIP_D_R S50_W = MST_DLV_SLIP_D_R.create("W");
		MST_SLO_D_R S52_W = MST_SLO_D_R.create("W");
		MST_QTN_D_R S53_W = MST_QTN_D_R.create("W");
		MAM_TAX_R S54_WM = MAM_TAX_R.create("WM");
		MST_QTN_D_R S54_WT = MST_QTN_D_R.create("WT");
		MAM_TAX_R S55_WM = MAM_TAX_R.create("WM");
		MST_DLV_SLIP_D_R S55_WT = MST_DLV_SLIP_D_R.create("WT");
		MAM_TAX_R S57_WM = MAM_TAX_R.create("WM");
		MST_SLO_D_R S57_WT = MST_SLO_D_R.create("WT");
		MAM_TAX_R S58_WM = MAM_TAX_R.create("WM");
		MST_QTN_D_R S58_WT = MST_QTN_D_R.create("WT");
		MAM_TAX_R S59_WM = MAM_TAX_R.create("WM");
		MST_QTN_D_R S59_WT = MST_QTN_D_R.create("WT");
		MAM_TAX_R S60_WM = MAM_TAX_R.create("WM");
		MST_DLV_SLIP_D_R S60_WT = MST_DLV_SLIP_D_R.create("WT");
		MAM_TAX_R S62_WM = MAM_TAX_R.create("WM");
		MST_SLO_D_R S62_WT = MST_SLO_D_R.create("WT");
		MAM_TAX_R S63_WM = MAM_TAX_R.create("WM");
		MST_QTN_D_R S63_WT = MST_QTN_D_R.create("WT");
		MST_QTN_D_R S64_W = MST_QTN_D_R.create("W");
		MST_DLV_SLIP_D_R S65_W = MST_DLV_SLIP_D_R.create("W");
		MST_SLO_D_R S67_W = MST_SLO_D_R.create("W");
		MST_QTN_D_R S68_W = MST_QTN_D_R.create("W");
		MST_DLV_SLIP_D_R W1 = MST_DLV_SLIP_D_R.create("W1");
		MST_DLV_SLIP_R W2 = MST_DLV_SLIP_R.create("W2");
		MCSubQuery SLIPD_dlv_slip_d_seq = 
			subQuery()
				.select(max(W1.dlv_slip_d_seq))
				.from(W1
					.innerJoin(W2).on(
						W2.dlv_slip_no.eq(W1.dlv_slip_no)
						.and(W2.dlv_slip_seq.eq(W1.dlv_slip_seq))
					)
				)
				.where(
					W1.dlv_slip_d_no.eq(S0_T3.dlv_slip_d_no)
					.and(W2.trn_typ.eq(value(MSC_TRN_TYP.SHIP.value())))
					.and(W2.slip_sts_typ.neq(value(MAC_SLIP_STS_TYP.CAN.value())))
				);
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBBL1310_SLS_ACT_D_Query_S01")
					.mainQuery()
					.select(
						cases()
							.when(S0_T2.slo_d_no.isNull())
								.then(
									cases()
										.when(
											nvl(
												bracket(
													subQuery()
													.select(sum(S1_W.base_unit_abort_qty))
													.from(S1_W)
													.where(
														S1_W.sls_schd_no.eq(S0_T3.sls_schd_no)
														.and(S1_W.abort_flg.eq(value(true)))
													)
												),
												value(0)
											).gt(value(0))
										)
											.then(value(true))
										.otherwise(value(false))
							)
							.otherwise(
								cases()
									.when(
										nvl(
											bracket(
												subQuery()
												.select(sum(S2_W.base_unit_abort_qty))
												.from(S2_W)
												.where(
													S2_W.slo_d_no.eq(S0_T2.slo_d_no)
													.and(S2_W.abort_flg.eq(value(true)))
												)
											),
											value(0)
										).gt(value(0))
									)
										.then(value(true))
									.otherwise(value(false))
							).as("abort_flg"),
						nvl(
							S0_T4.sls_cststk_flg,
							value(false)
						).as("sls_cststk_flg"),
						S0_T2.itm_cd,
						S0_T2.itm_sub1,
						S0_T2.itm_sub2,
						S0_T2.itm_sub3,
						nvl(
							S0_T2.itm_nm,
							S0_ITM.itm_nm
						).as("itm_nm"),
						S0_ITM.asset_mng_typ,
						S0_T2.sundry_itm_flg,
						S0_T3.sls_schd_dt,
						S0_T2.dlv_cd,
						nvl(
							S0_T2.dlv_nm,
							S0_DLV.bp_nm
						).as("dlv_nm"),
						S0_T2.dlv_zip_cd,
						S0_T2.dlv_addr1,
						S0_T2.dlv_addr2,
						S0_T2.dlv_addr3,
						S0_T2.dlv_addr4,
						S0_T2.dlv_cntct_dpt,
						S0_T2.dlv_cntct_psn,
						S0_T2.dlv_tel,
						S0_T2.dlv_fax,
						S0_DLV.cntry_cd,
						S0_T2.pri_prnt_flg,
						S0_T2.dest_cd1,
						S0_T2.dest_cd2,
						S0_T2.dest_cd3,
						S0_T2.trd_unit_cd,
						S0_T2.trd_unit_qty,
						S0_T2.base_unit_cd,
						S0_T2.base_unit_qty,
						S0_T2.base_unit_qty.as("base_unit_qty_bef"),
						cases()
							.when(S0_T4.sls_cststk_flg.eq(value(true)))
								.then(
									subQuery()
									.select(
										nvl(
											sum(S3_X.ship_act_qty),
											value(0)
										)
									)
									.from(S3_X)
									.where(
										S3_X.sls_act_d_no.eq(S0_T2.sls_act_d_no)
									)
							)
							.otherwise(
								subQuery()
								.select(
									nvl(
										sum(S4_X.base_unit_qty),
										value(0)
									)
								)
								.from(S4_X)
								.where(
									S4_X.dlv_slip_d_no.eq(nvl(
											S0_T3.dlv_slip_d_no,
											S0_T2.dlv_slip_d_no
										)
									)
									.and(S4_X.can_flg.eq(value(false)))
								)
							).as("ship_qty"),
						cases()
							.when(S0_T2.slo_d_no.isNull())
								.then(
									nvl(
										bracket(
											subQuery()
											.select(sum(S5_W.base_unit_abort_qty))
											.from(S5_W)
											.where(
												S5_W.sls_schd_no.eq(S0_T3.sls_schd_no)
												.and(S5_W.abort_flg.eq(value(true)))
											)
										),
										value(0)
									)
							)
							.otherwise(
								nvl(
									bracket(
										subQuery()
										.select(sum(S6_W.base_unit_abort_qty))
										.from(S6_W)
										.where(
											S6_W.slo_d_no.eq(S0_T2.slo_d_no)
											.and(S6_W.abort_flg.eq(value(true)))
										)
									),
									value(0)
								)
							).as("abort_qty"),
						cases()
							.when(S0_T2.slo_d_no.isNull())
								.then(
									nvl(
										bracket(
											subQuery()
											.select(sum(S7_W.base_unit_sls_qty))
											.from(S7_W)
											.where(
												S7_W.sls_schd_no.eq(S0_T3.sls_schd_no)
											)
										),
										value(0)
									)
							)
							.otherwise(
								nvl(
									bracket(
										subQuery()
										.select(sum(S8_W.base_unit_sls_qty))
										.from(S8_W)
										.where(
											S8_W.slo_d_no.eq(S0_T2.slo_d_no)
										)
									),
									value(0)
								)
							).as("sls_qty"),
						S0_T2.interim_flg,
						S0_T2.trd_cur_upri,
						S0_T2.upri_not_tgt_flg,
						S0_T2.trd_cur_amt,
						bracket(
							S0_T2.trd_cur_amt.add(S0_T2.trd_cur_tax_amt)
						).as("trd_cur_inc_tax_amt"),
						nvl(
							nvl(
								S0_T4.tax_fix_flg,
								S0_T5.tax_fix_flg
							),
							value(false)
						).as("tax_fix_flg"),
						S0_T2.tax_cd,
						S0_T2.trd_cur_tax_amt,
						S0_T2.trd_cur_dscnt_amt,
						S0_T2.dscnt_rsn_cd,
						S0_T2.base_cur_upri,
						S0_T2.base_cur_amt,
						bracket(
							S0_T2.base_cur_amt.add(S0_T2.base_cur_tax_amt)
						).as("base_cur_inc_tax_amt"),
						S0_T2.base_cur_tax_amt,
						S0_T2.base_cur_dscnt_amt,
						S0_T2.ptax_cur_upri,
						S0_T2.ptax_cur_amt,
						bracket(
							S0_T2.ptax_cur_amt.add(S0_T2.ptax_cur_tax_amt)
						).as("ptax_cur_inc_tax_amt"),
						S0_T2.ptax_cur_tax_amt,
						S0_T2.ptax_cur_dscnt_amt,
						S0_T2.cost_upri,
						S0_T2.cost_amt,
						S0_T2.bill_crryovr_times,
						S0_T2.gd_cd,
						S0_T2.loc_cd,
						S0_T2.str_ln_cd,
						S0_T2.lot_no,
						S0_T2.sublot_no,
						decode(
							S0_ITM.ver_flg,
							value(true),
							S0_T8.ver_no,
							nullValue()
						).as("ver_no"),
						S0_T2.sno1,
						S0_T2.sno2,
						S0_T2.sno3,
						S0_T2.sno4,
						S0_T2.cst_po_d_no,
						S0_T2.cst_itm_cd,
						S0_T2.cst_itm_nm,
						S0_T2.rsn_cd.as("sls_rsn_cd"),
						S0_T2.bd_dpt_cd,
						S0_DPT.dpt_nm.as("bd_dpt_nm"),
						S0_T2.wtax_rate,
						S0_T2.wtax_amt,
						S0_T2.ext_sys_cd,
						S0_EXT.ext_sys_nm,
						S0_T2.ext_purc_act_d_no,
						S0_T2.trd_d_rmrks,
						S0_T2.intr_rmrks,
						S0_T2.sub_char1,
						S0_T2.sub_char2,
						S0_T2.sub_char3,
						cases()
							.when(S0_EDI.bp_cd.isNotNull())
								.then(nullValue())
							.otherwise(value(MSC_ACCPT_STS_TYP.OTR.value())).as("accpt_sts_typ"),
						S0_T2.qtn_d_no,
						S0_T2.slo_d_no,
						S0_T2.dlv_slip_d_no,
						S0_T2.sls_act_d_no,
						S0_T2.disp_seq,
						S0_ITM.lot_mng_typ,
						S0_ITM.sublot_mng_typ,
						S0_ITM.ver_flg,
						S0_T4.not_lot_mix_flg,
						S0_T4.not_sublot_mix_flg,
						S0_T2.sno1_mng_typ,
						S0_T2.sno2_mng_typ,
						S0_T2.sno3_mng_typ,
						S0_T2.sno4_mng_typ,
						S0_ITM.bill_crryovr_times.as("itm_bill_crryovr_times"),
						S0_ITM.stk_mng_typ,
						S0_ITM.dscnt_itm_flg,
						S0_ITM.sls_upri_cng_flg,
						S0_ITM.dec_place.as("base_unit_dec_place"),
						S0_ITM.rnd_typ.as("base_unit_rnd_typ"),
						S0_DLV.dlv_sundry_flg,
						S0_T1.sls_act_no,
						S0_T1.sls_act_seq,
						S0_T2.sls_act_d_seq,
						S0_T3.base_unit_qty.as("sls_schd_qty"),
						S0_T3.sls_schd_no,
						S0_T3.upd_cntr.as("sls_schd_upd_cntr"),
						S0_T7.ship_pr_no,
						S0_T7.upd_cntr.as("ship_pr_upd_cntr"),
						S0_T2.purc_ddlv_po_d_no,
						S0_T2.purc_act_no,
						cases()
							.when(S0_T3.sls_schd_no.isNull())
								.then(
									cases()
										.when(S0_T2.qtn_d_no.isNotNull())
											.then(
												subQuery()
												.select(S9_W.base_unit_qty)
												.from(S9_W)
												.where(
													S9_W.qtn_d_no.eq(S0_T2.qtn_d_no)
												)
										)
										.otherwise(nullValue())
							)
							.otherwise(
								cases()
									.when(S0_T1.sls_basis_typ.eq(value(MAC_SLS_BASIS_TYP.IN_BASIS.value())).or(S0_T1.sls_basis_typ.eq(value(MAC_SLS_BASIS_TYP.ARRIVAL_BASIS.value()))))
										.then(
											subQuery()
											.select(S10_W.base_unit_qty)
											.from(
												S10_W
											)
											.where(
												S10_W.dlv_slip_d_no.eq(S0_T3.dlv_slip_d_no)
												.and(S10_W.dlv_slip_d_seq.eq(SLIPD_dlv_slip_d_seq))
											)
									)
									.otherwise(
										cases()
											.when(S0_T2.qtn_d_no.isNull())
												.then(
													cases()
														.when(S0_T2.slo_d_no.isNull())
															.then(S0_T2.base_unit_qty)
														.otherwise(
															subQuery()
															.select(S12_W.base_unit_qty)
															.from(S12_W)
															.where(
																S12_W.slo_d_no.eq(S0_T2.slo_d_no)
															)
														)
											)
											.otherwise(
												subQuery()
												.select(S13_W.base_unit_qty)
												.from(S13_W)
												.where(
													S13_W.qtn_d_no.eq(S0_T2.qtn_d_no)
												)
											)
									)
							).as("init_schd_qty"),
						cases()
							.when(S0_T3.sls_schd_no.isNull())
								.then(
									cases()
										.when(S0_T2.qtn_d_no.isNotNull())
											.then(
												subQuery()
												.select(S14_W.trd_cur_dscnt_amt)
												.from(S14_W)
												.where(
													S14_W.qtn_d_no.eq(S0_T2.qtn_d_no)
												)
										)
										.otherwise(nullValue())
							)
							.otherwise(
								cases()
									.when(S0_T1.sls_basis_typ.eq(value(MAC_SLS_BASIS_TYP.IN_BASIS.value())).or(S0_T1.sls_basis_typ.eq(value(MAC_SLS_BASIS_TYP.ARRIVAL_BASIS.value()))))
										.then(
											subQuery()
											.select(S15_W.trd_cur_dscnt_amt)
											.from(
												S15_W
											)
											.where(
												S15_W.dlv_slip_d_no.eq(S0_T3.dlv_slip_d_no)
												.and(S15_W.dlv_slip_d_seq.eq(SLIPD_dlv_slip_d_seq))
											)
									)
									.otherwise(
										cases()
											.when(S0_T2.qtn_d_no.isNull())
												.then(
													cases()
														.when(S0_T2.slo_d_no.isNull())
															.then(nullValue())
														.otherwise(
															subQuery()
															.select(S17_W.trd_cur_dscnt_amt)
															.from(S17_W)
															.where(
																S17_W.slo_d_no.eq(S0_T2.slo_d_no)
															)
														)
											)
											.otherwise(
												subQuery()
												.select(S18_W.trd_cur_dscnt_amt)
												.from(S18_W)
												.where(
													S18_W.qtn_d_no.eq(S0_T2.qtn_d_no)
												)
											)
									)
							).as("init_schd_dscnt_amt"),
						cases()
							.when(S0_T3.sls_schd_no.isNull())
								.then(
									cases()
										.when(S0_T2.qtn_d_no.isNotNull())
											.then(
												subQuery()
												.select(
													decode(
														S19_STAX.inc_tax_flg,
														value(false),
														S19_W.trd_cur_amt,
														S19_W.trd_cur_amt.add(S19_W.trd_cur_tax_amt)
													)
												)
												.from(
													S19_W
													.leftOuterJoin(S19_STAX).on(S0_T2.tax_cd.eq(S19_STAX.tax_cd))
												)
												.where(
													S19_W.qtn_d_no.eq(S0_T2.qtn_d_no)
												)
										)
										.otherwise(nullValue())
							)
							.otherwise(
								cases()
									.when(S0_T1.sls_basis_typ.eq(value(MAC_SLS_BASIS_TYP.IN_BASIS.value())).or(S0_T1.sls_basis_typ.eq(value(MAC_SLS_BASIS_TYP.ARRIVAL_BASIS.value()))))
										.then(
											subQuery()
											.select(
												decode(
													S20_STAX.inc_tax_flg,
													value(false),
													S20_W.trd_cur_amt,
													S20_W.trd_cur_amt.add(S20_W.trd_cur_tax_amt)
												)
											)
											.from(
												S20_W
												.leftOuterJoin(S20_STAX).on(S0_T2.tax_cd.eq(S20_STAX.tax_cd))
											)
											.where(
												S20_W.dlv_slip_d_no.eq(S0_T3.dlv_slip_d_no)
												.and(S20_W.dlv_slip_d_seq.eq(SLIPD_dlv_slip_d_seq))
											)
									)
									.otherwise(
										cases()
											.when(S0_T2.qtn_d_no.isNull())
												.then(
													cases()
														.when(S0_T2.slo_d_no.isNull())
															.then(nullValue())
														.otherwise(
															subQuery()
															.select(
																decode(
																	S22_STAX.inc_tax_flg,
																	value(false),
																	S22_W.trd_cur_amt,
																	S22_W.trd_cur_amt.add(S22_W.trd_cur_tax_amt)
																)
															)
															.from(
																S22_W
																.leftOuterJoin(S22_STAX).on(S0_T2.tax_cd.eq(S22_STAX.tax_cd))
															)
															.where(
																S22_W.slo_d_no.eq(S0_T2.slo_d_no)
															)
														)
											)
											.otherwise(
												subQuery()
												.select(
													decode(
														S23_STAX.inc_tax_flg,
														value(false),
														S23_W.trd_cur_amt,
														S23_W.trd_cur_amt.add(S23_W.trd_cur_tax_amt)
													)
												)
												.from(
													S23_W
													.leftOuterJoin(S23_STAX).on(S0_T2.tax_cd.eq(S23_STAX.tax_cd))
												)
												.where(
													S23_W.qtn_d_no.eq(S0_T2.qtn_d_no)
												)
											)
									)
							).as("init_schd_amt"),
						cases()
							.when(S0_T3.sls_schd_no.isNull())
								.then(
									cases()
										.when(S0_T2.qtn_d_no.isNotNull())
											.then(
												subQuery()
												.select(S24_WIU.conv_base_qty)
												.from(
													S24_W
													.innerJoin(S24_WIU).on(
														S24_W.itm_cd.eq(S24_WIU.itm_cd)
														.and(S24_W.itm_sub1.eq(S24_WIU.itm_sub1))
														.and(S24_W.itm_sub2.eq(S24_WIU.itm_sub2))
														.and(S24_W.itm_sub3.eq(S24_WIU.itm_sub3))
														.and(S24_W.trd_unit_cd.eq(S24_WIU.unit_cd))
													)
												)
												.where(
													S24_W.qtn_d_no.eq(S0_T2.qtn_d_no)
												)
										)
										.otherwise(nullValue())
							)
							.otherwise(
								cases()
									.when(S0_T1.sls_basis_typ.eq(value(MAC_SLS_BASIS_TYP.IN_BASIS.value())).or(S0_T1.sls_basis_typ.eq(value(MAC_SLS_BASIS_TYP.ARRIVAL_BASIS.value()))))
										.then(
											subQuery()
											.select(S25_WIU.conv_base_qty)
											.from(
												S25_W
												.innerJoin(S25_WIU).on(
													S25_W.itm_cd.eq(S25_WIU.itm_cd)
													.and(S25_W.itm_sub1.eq(S25_WIU.itm_sub1))
													.and(S25_W.itm_sub2.eq(S25_WIU.itm_sub2))
													.and(S25_W.itm_sub3.eq(S25_WIU.itm_sub3))
													.and(S25_W.trd_unit_cd.eq(S25_WIU.unit_cd))
												)
											)
											.where(
												S25_W.dlv_slip_d_no.eq(S0_T3.dlv_slip_d_no)
												.and(S25_W.dlv_slip_d_seq.eq(SLIPD_dlv_slip_d_seq))
											)
									)
									.otherwise(
										cases()
											.when(S0_T2.qtn_d_no.isNull())
												.then(
													cases()
														.when(S0_T2.slo_d_no.isNull())
															.then(nullValue())
														.otherwise(
															subQuery()
															.select(S27_WIU.conv_base_qty)
															.from(
																S27_W
																.innerJoin(S27_WIU).on(
																	S27_W.itm_cd.eq(S27_WIU.itm_cd)
																	.and(S27_W.itm_sub1.eq(S27_WIU.itm_sub1))
																	.and(S27_W.itm_sub2.eq(S27_WIU.itm_sub2))
																	.and(S27_W.itm_sub3.eq(S27_WIU.itm_sub3))
																	.and(S27_W.trd_unit_cd.eq(S27_WIU.unit_cd))
																)
															)
															.where(
																S27_W.slo_d_no.eq(S0_T2.slo_d_no)
															)
														)
											)
											.otherwise(
												subQuery()
												.select(S28_WIU.conv_base_qty)
												.from(
													S28_W
													.innerJoin(S28_WIU).on(
														S28_W.itm_cd.eq(S28_WIU.itm_cd)
														.and(S28_W.itm_sub1.eq(S28_WIU.itm_sub1))
														.and(S28_W.itm_sub2.eq(S28_WIU.itm_sub2))
														.and(S28_W.itm_sub3.eq(S28_WIU.itm_sub3))
														.and(S28_W.trd_unit_cd.eq(S28_WIU.unit_cd))
													)
												)
												.where(
													S28_W.qtn_d_no.eq(S0_T2.qtn_d_no)
												)
											)
									)
							).as("schd_trd_unit_conv_base_qty"),
						cases()
							.when(S0_T3.sls_schd_no.isNull())
								.then(
									cases()
										.when(S0_T2.qtn_d_no.isNotNull())
											.then(
												subQuery()
												.select(S29_WIU.conv_qty)
												.from(
													S29_W
													.innerJoin(S29_WIU).on(
														S29_W.itm_cd.eq(S29_WIU.itm_cd)
														.and(S29_W.itm_sub1.eq(S29_WIU.itm_sub1))
														.and(S29_W.itm_sub2.eq(S29_WIU.itm_sub2))
														.and(S29_W.itm_sub3.eq(S29_WIU.itm_sub3))
														.and(S29_W.trd_unit_cd.eq(S29_WIU.unit_cd))
													)
												)
												.where(
													S29_W.qtn_d_no.eq(S0_T2.qtn_d_no)
												)
										)
										.otherwise(nullValue())
							)
							.otherwise(
								cases()
									.when(S0_T1.sls_basis_typ.eq(value(MAC_SLS_BASIS_TYP.IN_BASIS.value())).or(S0_T1.sls_basis_typ.eq(value(MAC_SLS_BASIS_TYP.ARRIVAL_BASIS.value()))))
										.then(
											subQuery()
											.select(S30_WIU.conv_qty)
											.from(
												S30_W
												.innerJoin(S30_WIU).on(
													S30_W.itm_cd.eq(S30_WIU.itm_cd)
													.and(S30_W.itm_sub1.eq(S30_WIU.itm_sub1))
													.and(S30_W.itm_sub2.eq(S30_WIU.itm_sub2))
													.and(S30_W.itm_sub3.eq(S30_WIU.itm_sub3))
													.and(S30_W.trd_unit_cd.eq(S30_WIU.unit_cd))
												)
											)
											.where(
												S30_W.dlv_slip_d_no.eq(S0_T3.dlv_slip_d_no)
												.and(S30_W.dlv_slip_d_seq.eq(SLIPD_dlv_slip_d_seq))
											)
									)
									.otherwise(
										cases()
											.when(S0_T2.qtn_d_no.isNull())
												.then(
													cases()
														.when(S0_T2.slo_d_no.isNull())
															.then(nullValue())
														.otherwise(
															subQuery()
															.select(S32_WIU.conv_qty)
															.from(
																S32_W
																.innerJoin(S32_WIU).on(
																	S32_W.itm_cd.eq(S32_WIU.itm_cd)
																	.and(S32_W.itm_sub1.eq(S32_WIU.itm_sub1))
																	.and(S32_W.itm_sub2.eq(S32_WIU.itm_sub2))
																	.and(S32_W.itm_sub3.eq(S32_WIU.itm_sub3))
																	.and(S32_W.trd_unit_cd.eq(S32_WIU.unit_cd))
																)
															)
															.where(
																S32_W.slo_d_no.eq(S0_T2.slo_d_no)
															)
														)
											)
											.otherwise(
												subQuery()
												.select(S33_WIU.conv_qty)
												.from(
													S33_W
													.innerJoin(S33_WIU).on(
														S33_W.itm_cd.eq(S33_WIU.itm_cd)
														.and(S33_W.itm_sub1.eq(S33_WIU.itm_sub1))
														.and(S33_W.itm_sub2.eq(S33_WIU.itm_sub2))
														.and(S33_W.itm_sub3.eq(S33_WIU.itm_sub3))
														.and(S33_W.trd_unit_cd.eq(S33_WIU.unit_cd))
													)
												)
												.where(
													S33_W.qtn_d_no.eq(S0_T2.qtn_d_no)
												)
											)
									)
							).as("schd_trd_unit_conv_qty"),
						S0_T2.sls_dtl_upd_flg,
						cases()
							.when(S0_T3.sls_schd_no.isNull())
								.then(
									cases()
										.when(S0_T2.qtn_d_no.isNotNull())
											.then(
												subQuery()
												.select(S34_W.trd_cur_tax_amt)
												.from(S34_W)
												.where(
													S34_W.qtn_d_no.eq(S0_T2.qtn_d_no)
												)
										)
										.otherwise(nullValue())
							)
							.otherwise(
								cases()
									.when(S0_T1.sls_basis_typ.eq(value(MAC_SLS_BASIS_TYP.IN_BASIS.value())).or(S0_T1.sls_basis_typ.eq(value(MAC_SLS_BASIS_TYP.ARRIVAL_BASIS.value()))))
										.then(
											subQuery()
											.select(S35_W.trd_cur_tax_amt)
											.from(
												S35_W
											)
											.where(
												S35_W.dlv_slip_d_no.eq(S0_T3.dlv_slip_d_no)
												.and(S35_W.dlv_slip_d_seq.eq(SLIPD_dlv_slip_d_seq))
											)
									)
									.otherwise(
										cases()
											.when(S0_T2.qtn_d_no.isNull())
												.then(
													cases()
														.when(S0_T2.slo_d_no.isNull())
															.then(nullValue())
														.otherwise(
															subQuery()
															.select(S37_W.trd_cur_tax_amt)
															.from(S37_W)
															.where(
																S37_W.slo_d_no.eq(S0_T2.slo_d_no)
															)
														)
											)
											.otherwise(
												subQuery()
												.select(S38_W.trd_cur_tax_amt)
												.from(S38_W)
												.where(
													S38_W.qtn_d_no.eq(S0_T2.qtn_d_no)
												)
											)
									)
							).as("init_trd_cur_tax_amt"),
						cases()
							.when(S0_T3.sls_schd_no.isNull())
								.then(
									cases()
										.when(S0_T2.qtn_d_no.isNotNull())
											.then(
												subQuery()
												.select(S39_W.trd_unit_cd)
												.from(S39_W)
												.where(
													S39_W.qtn_d_no.eq(S0_T2.qtn_d_no)
												)
										)
										.otherwise(nullValue())
							)
							.otherwise(
								cases()
									.when(S0_T1.sls_basis_typ.eq(value(MAC_SLS_BASIS_TYP.IN_BASIS.value())).or(S0_T1.sls_basis_typ.eq(value(MAC_SLS_BASIS_TYP.ARRIVAL_BASIS.value()))))
										.then(
											subQuery()
											.select(S40_W.trd_unit_cd)
											.from(
												S40_W
											)
											.where(
												S40_W.dlv_slip_d_no.eq(S0_T3.dlv_slip_d_no)
												.and(S40_W.dlv_slip_d_seq.eq(SLIPD_dlv_slip_d_seq))
											)
									)
									.otherwise(
										cases()
											.when(S0_T2.qtn_d_no.isNull())
												.then(
													cases()
														.when(S0_T2.slo_d_no.isNull())
															.then(nullValue())
														.otherwise(
															subQuery()
															.select(S42_W.trd_unit_cd)
															.from(S42_W)
															.where(
																S42_W.slo_d_no.eq(S0_T2.slo_d_no)
															)
														)
											)
											.otherwise(
												subQuery()
												.select(S43_W.trd_unit_cd)
												.from(S43_W)
												.where(
													S43_W.qtn_d_no.eq(S0_T2.qtn_d_no)
												)
											)
									)
							).as("init_trd_unit_cd"),
						cases()
							.when(S0_T3.sls_schd_no.isNull())
								.then(
									cases()
										.when(S0_T2.qtn_d_no.isNotNull())
											.then(
												subQuery()
												.select(S44_W.trd_unit_qty)
												.from(S44_W)
												.where(
													S44_W.qtn_d_no.eq(S0_T2.qtn_d_no)
												)
										)
										.otherwise(nullValue())
							)
							.otherwise(
								cases()
									.when(S0_T1.sls_basis_typ.eq(value(MAC_SLS_BASIS_TYP.IN_BASIS.value())).or(S0_T1.sls_basis_typ.eq(value(MAC_SLS_BASIS_TYP.ARRIVAL_BASIS.value()))))
										.then(
											subQuery()
											.select(S45_W.trd_unit_qty)
											.from(
												S45_W
											)
											.where(
												S45_W.dlv_slip_d_no.eq(S0_T3.dlv_slip_d_no)
												.and(S45_W.dlv_slip_d_seq.eq(SLIPD_dlv_slip_d_seq))
											)
									)
									.otherwise(
										cases()
											.when(S0_T2.qtn_d_no.isNull())
												.then(
													cases()
														.when(S0_T2.slo_d_no.isNull())
															.then(nullValue())
														.otherwise(
															subQuery()
															.select(S47_W.trd_unit_qty)
															.from(S47_W)
															.where(
																S47_W.slo_d_no.eq(S0_T2.slo_d_no)
															)
														)
											)
											.otherwise(
												subQuery()
												.select(S48_W.trd_unit_qty)
												.from(S48_W)
												.where(
													S48_W.qtn_d_no.eq(S0_T2.qtn_d_no)
												)
											)
									)
							).as("init_trd_unit_qty"),
						cases()
							.when(S0_T3.sls_schd_no.isNull())
								.then(
									cases()
										.when(S0_T2.qtn_d_no.isNotNull())
											.then(
												subQuery()
												.select(S49_W.trd_cur_upri)
												.from(S49_W)
												.where(
													S49_W.qtn_d_no.eq(S0_T2.qtn_d_no)
												)
										)
										.otherwise(nullValue())
							)
							.otherwise(
								cases()
									.when(S0_T1.sls_basis_typ.eq(value(MAC_SLS_BASIS_TYP.IN_BASIS.value())).or(S0_T1.sls_basis_typ.eq(value(MAC_SLS_BASIS_TYP.ARRIVAL_BASIS.value()))))
										.then(
											subQuery()
											.select(S50_W.trd_cur_upri)
											.from(
												S50_W
											)
											.where(
												S50_W.dlv_slip_d_no.eq(S0_T3.dlv_slip_d_no)
												.and(S50_W.dlv_slip_d_seq.eq(SLIPD_dlv_slip_d_seq))
											)
									)
									.otherwise(
										cases()
											.when(S0_T2.qtn_d_no.isNull())
												.then(
													cases()
														.when(S0_T2.slo_d_no.isNull())
															.then(nullValue())
														.otherwise(
															subQuery()
															.select(S52_W.trd_cur_upri)
															.from(S52_W)
															.where(
																S52_W.slo_d_no.eq(S0_T2.slo_d_no)
															)
														)
											)
											.otherwise(
												subQuery()
												.select(S53_W.trd_cur_upri)
												.from(S53_W)
												.where(
													S53_W.qtn_d_no.eq(S0_T2.qtn_d_no)
												)
											)
									)
							).as("init_trd_cur_upri"),
						cases()
							.when(S0_T3.sls_schd_no.isNull())
								.then(
									cases()
										.when(S0_T2.qtn_d_no.isNotNull())
											.then(
												subQuery()
												.select(S54_WM.inc_tax_flg)
												.from(
													S54_WM
													.innerJoin(S54_WT).on(S54_WM.tax_cd.eq(S54_WT.tax_cd))
												)
												.where(
													S54_WT.qtn_d_no.eq(S0_T2.qtn_d_no)
												)
										)
										.otherwise(nullValue())
							)
							.otherwise(
								cases()
									.when(S0_T1.sls_basis_typ.eq(value(MAC_SLS_BASIS_TYP.IN_BASIS.value())).or(S0_T1.sls_basis_typ.eq(value(MAC_SLS_BASIS_TYP.ARRIVAL_BASIS.value()))))
										.then(
											subQuery()
											.select(S55_WM.inc_tax_flg)
											.from(
												S55_WM
												.innerJoin(S55_WT).on(S55_WM.tax_cd.eq(S55_WT.tax_cd))
											)
											.where(
												S55_WT.dlv_slip_d_no.eq(S0_T3.dlv_slip_d_no)
												.and(S55_WT.dlv_slip_d_seq.eq(SLIPD_dlv_slip_d_seq))
											)
									)
									.otherwise(
										cases()
											.when(S0_T2.qtn_d_no.isNull())
												.then(
													cases()
														.when(S0_T2.slo_d_no.isNull())
															.then(nullValue())
														.otherwise(
															subQuery()
															.select(S57_WM.inc_tax_flg)
															.from(
																S57_WM
																.innerJoin(S57_WT).on(S57_WM.tax_cd.eq(S57_WT.tax_cd))
															)
															.where(
																S57_WT.slo_d_no.eq(S0_T2.slo_d_no)
															)
														)
											)
											.otherwise(
												subQuery()
												.select(S58_WM.inc_tax_flg)
												.from(
													S58_WM
													.innerJoin(S58_WT).on(S58_WM.tax_cd.eq(S58_WT.tax_cd))
												)
												.where(
													S58_WT.qtn_d_no.eq(S0_T2.qtn_d_no)
												)
											)
									)
							).as("init_inc_tax_flg"),
						cases()
							.when(S0_T3.sls_schd_no.isNull())
								.then(
									cases()
										.when(S0_T2.qtn_d_no.isNotNull())
											.then(
												subQuery()
												.select(S59_WM.tax_rate)
												.from(
													S59_WM
													.innerJoin(S59_WT).on(S59_WM.tax_cd.eq(S59_WT.tax_cd))
												)
												.where(
													S59_WT.qtn_d_no.eq(S0_T2.qtn_d_no)
												)
										)
										.otherwise(nullValue())
							)
							.otherwise(
								cases()
									.when(S0_T1.sls_basis_typ.eq(value(MAC_SLS_BASIS_TYP.IN_BASIS.value())).or(S0_T1.sls_basis_typ.eq(value(MAC_SLS_BASIS_TYP.ARRIVAL_BASIS.value()))))
										.then(
											subQuery()
											.select(S60_WM.tax_rate)
											.from(
												S60_WM
												.innerJoin(S60_WT).on(S60_WM.tax_cd.eq(S60_WT.tax_cd))
											)
											.where(
												S60_WT.dlv_slip_d_no.eq(S0_T3.dlv_slip_d_no)
												.and(S60_WT.dlv_slip_d_seq.eq(SLIPD_dlv_slip_d_seq))
											)
									)
									.otherwise(
										cases()
											.when(S0_T2.qtn_d_no.isNull())
												.then(
													cases()
														.when(S0_T2.slo_d_no.isNull())
															.then(nullValue())
														.otherwise(
															subQuery()
															.select(S62_WM.tax_rate)
															.from(
																S62_WM
																.innerJoin(S62_WT).on(S62_WM.tax_cd.eq(S62_WT.tax_cd))
															)
															.where(
																S62_WT.slo_d_no.eq(S0_T2.slo_d_no)
															)
														)
											)
											.otherwise(
												subQuery()
												.select(S63_WM.tax_rate)
												.from(
													S63_WM
													.innerJoin(S63_WT).on(S63_WM.tax_cd.eq(S63_WT.tax_cd))
												)
												.where(
													S63_WT.qtn_d_no.eq(S0_T2.qtn_d_no)
												)
											)
									)
							).as("init_tax_rate"),
						cases()
							.when(S0_T3.sls_schd_no.isNull())
								.then(
									cases()
										.when(S0_T2.qtn_d_no.isNotNull())
											.then(
												subQuery()
												.select(S64_W.trd_cur_dscnt_amt)
												.from(S64_W)
												.where(
													S64_W.qtn_d_no.eq(S0_T2.qtn_d_no)
												)
										)
										.otherwise(nullValue())
							)
							.otherwise(
								cases()
									.when(S0_T1.sls_basis_typ.eq(value(MAC_SLS_BASIS_TYP.IN_BASIS.value())).or(S0_T1.sls_basis_typ.eq(value(MAC_SLS_BASIS_TYP.ARRIVAL_BASIS.value()))))
										.then(
											subQuery()
											.select(S65_W.trd_cur_dscnt_amt)
											.from(
												S65_W
											)
											.where(
												S65_W.dlv_slip_d_no.eq(S0_T3.dlv_slip_d_no)
												.and(S65_W.dlv_slip_d_seq.eq(SLIPD_dlv_slip_d_seq))
											)
									)
									.otherwise(
										cases()
											.when(S0_T2.qtn_d_no.isNull())
												.then(
													cases()
														.when(S0_T2.slo_d_no.isNull())
															.then(nullValue())
														.otherwise(
															subQuery()
															.select(S67_W.trd_cur_dscnt_amt)
															.from(S67_W)
															.where(
																S67_W.slo_d_no.eq(S0_T2.slo_d_no)
															)
														)
											)
											.otherwise(
												subQuery()
												.select(S68_W.trd_cur_dscnt_amt)
												.from(S68_W)
												.where(
													S68_W.qtn_d_no.eq(S0_T2.qtn_d_no)
												)
											)
									)
							).as("init_trd_cur_dscnt_amt"),
						S0_T2.ship_dlv_slip_d_no
					)
					.from(
						S0_T1
						.innerJoin(S0_T2).on(
							bracket(
								S0_T1.sls_act_no.eq(S0_T2.sls_act_no)
								.and(S0_T1.sls_act_seq.eq(S0_T2.sls_act_seq))
							)
						)
						.leftOuterJoin(S0_T3).on(
							bracket(
								S0_T2.sls_schd_no.eq(S0_T3.sls_schd_no)
							)
						)
						.leftOuterJoin(S0_T4).on(
							bracket(
								S0_T2.slo_d_no.eq(S0_T4.slo_d_no)
							)
						)
						.leftOuterJoin(S0_T5).on(
							bracket(
								S0_T2.qtn_d_no.eq(S0_T5.qtn_d_no)
							)
						)
						.leftOuterJoin(S0_T7).on(
							bracket(
								S0_T2.slo_d_no.eq(S0_T7.slo_d_no)
							)
						)
						.leftOuterJoin(S0_T8).on(
							bracket(
								S0_T2.itm_cd.eq(S0_T8.itm_cd)
								.and(S0_T2.itm_sub1.eq(S0_T8.itm_sub1))
								.and(S0_T2.itm_sub2.eq(S0_T8.itm_sub2))
								.and(S0_T2.itm_sub3.eq(S0_T8.itm_sub3))
								.and(S0_T2.lot_no.eq(S0_T8.lot_no))
								.and(S0_T2.sublot_no.eq(S0_T8.sublot_no))
							)
						)
						.leftOuterJoin(S0_DLV).on(
							bracket(
								S0_T2.dlv_cd.eq(S0_DLV.bp_cd)
							)
						)
						.leftOuterJoin(S0_ITM).on(
							bracket(
								S0_T2.itm_cd.eq(S0_ITM.itm_cd)
								.and(S0_T2.itm_sub1.eq(S0_ITM.itm_sub1))
								.and(S0_T2.itm_sub2.eq(S0_ITM.itm_sub2))
								.and(S0_T2.itm_sub3.eq(S0_ITM.itm_sub3))
							)
						)
						.leftOuterJoin(S0_BIU).on(
							bracket(
								S0_T2.itm_cd.eq(S0_BIU.itm_cd)
								.and(S0_T2.itm_sub1.eq(S0_BIU.itm_sub1))
								.and(S0_T2.itm_sub2.eq(S0_BIU.itm_sub2))
								.and(S0_T2.itm_sub3.eq(S0_BIU.itm_sub3))
								.and(S0_T2.base_unit_cd.eq(S0_BIU.unit_cd))
							)
						)
						.leftOuterJoin(S0_DPT).on(
							bracket(
								S0_T2.bd_dpt_cd.eq(S0_DPT.dpt_cd)
								.and(S0_T1.ac_dt.between(S0_DPT.st_dt, S0_DPT.end_dt))
							)
						)
						.leftOuterJoin(S0_EDI).on(
							bracket(
								S0_EDI.bp_cd.eq(S0_T1.cst_cd)
								.and(S0_EDI.if_proc_typ.eq(value(MAC_IF_PROC_TYP.ACCPT_RECV.value())))
								.and(S0_T1.sls_dt.between(S0_EDI.st_dt, S0_EDI.end_dt))
							)
						)
						.leftOuterJoin(S0_EXT).on(
								bracket(
									S0_T2.ext_sys_cd.eq(S0_EXT.ext_sys_cd)
								)
							)
						)
					.where(
						value(1).eq(value(1))
						.and(S0_T1.sls_act_no.eq(bind("sls_act_no")))
						.and(S0_T1.sls_act_seq.eq(bind("sls_act_seq")))
					)
					.orderBy(S0_T2.disp_seq.asc())
			)
			.setJoinInfo(
				joinInfo(
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
						.add(MAVM_ITM_UNIT_R.class, r -> toCondition(
							r.getStringNE("itm_cd"),
							r.getStringNE("itm_sub1"),
							r.getStringNE("itm_sub2"),
							r.getStringNE("itm_sub3"),
							r.getStringNE("trd_unit_cd")
						))
						.addSelect(m -> toArray(
							m.conv_base_qty,
							m.conv_qty,
							m.dec_place,
							m.rnd_typ
						))
						.addMap((r, m) -> {
							r.setNumberNE("trd_unit_dec_place", m.dec_place());
							r.setNumberNE("trd_unit_conv_base_qty", m.conv_base_qty());
							r.setNumberNE("trd_unit_conv_qty", m.conv_qty());
							r.setStringNE("trd_unit_rnd_typ", m.rnd_typ());
					}),
					j -> j
						.add(MAM_UNIT_R.class, r -> toCondition(
							r.getStringNE("base_unit_cd")
						))
						.addSelect(m -> toArray(
							m.unit_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("base_unit_nm", m.unit_nm());
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
						.add(MAM_CNTRY_R.class, r -> toCondition(
							r.getStringNE("cntry_cd")
						))
						.addSelect(m -> toArray(
							m.cntry_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("cntry_nm", m.cntry_nm());
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
							r.setStringNE("tax_nm", m.tax_nm());
							r.setNumberNE("tax_rate", m.tax_rate());
							r.setBooleanNE("inc_tax_flg", m.inc_tax_flg());
							r.setStringNE("tax_typ", m.tax_typ());
					}),
					j -> j
						.add(MAM_BIZ_RSN_R.class, r -> toCondition(
							r.getStringNE("dscnt_rsn_cd")
						))
						.addSelect(m -> toArray(
							m.biz_rsn_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("dscnt_rsn_nm", m.biz_rsn_nm());
					}),
					j -> j
						.add(MAM_BIZ_RSN_R.class, r -> toCondition(
							r.getStringNE("sls_rsn_cd")
						))
						.addSelect(m -> toArray(
							m.biz_rsn_nm,
							m.sls_acxfr_flg
						))
						.addMap((r, m) -> {
							r.setStringNE("sls_rsn_nm", m.biz_rsn_nm());
							r.setBooleanNE("sls_acxfr_flg", m.sls_acxfr_flg());
					}),
					j -> j
						.add(MAM_STK_GD_R.class, r -> toCondition(
							r.getStringNE("gd_cd")
						))
						.addSelect(m -> toArray(
							m.gd_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("gd_nm", m.gd_nm());
					}),
					j -> j
						.add(MAM_LOC_R.class, r -> toCondition(
							r.getStringNE("loc_cd")
						))
						.addSelect(m -> toArray(
							m.loc_nm,
							m.site_cd,
							m.str_ln_tgt_flg
						))
						.addMap((r, m) -> {
							r.setStringNE("loc_nm", m.loc_nm());
							r.setBooleanNE("str_ln_tgt_flg", m.str_ln_tgt_flg());
							r.setStringNE("site_cd", m.site_cd());
					}),
					j -> j
						.add(MAM_STR_LN_R.class, r -> toCondition(
							r.getStringNE("loc_cd"),
							r.getStringNE("str_ln_cd")
						))
						.addSelect(m -> toArray(
							m.str_ln_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("str_ln_nm", m.str_ln_nm());
					}),
					j -> j
						.add(MSVT_WRK_SNO_R.class, r -> toCondition(
							r.getStringNE("sno1")
						))
						.addSelect(m -> toArray(
							m.wrk_no
						))
						.addMap((r, m) -> {
							r.setStringNE("wrk_no", m.wrk_no());
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
					})
				)
			);
	}
	
	/**
	 * -- MSBBL1310_SLS_ACT_IO_Query_S01
	 */
	static MCQueryPlan MSBBL1310_SLS_ACT_IO_S01() {
		MST_SLS_ACT_R S0_T1 = MST_SLS_ACT_R.create("T1");
		MST_SLS_ACT_D_R S0_T2 = MST_SLS_ACT_D_R.create("T2");
		MST_SLS_ACT_IO_R S0_T3 = MST_SLS_ACT_IO_R.create("T3");
		MST_SHIP_ACT_D_R S0_T4 = MST_SHIP_ACT_D_R.create("T4");
		MST_LOT_R S0_T5 = MST_LOT_R.create("T5");
		MAM_ITM_R S0_ITM = MAM_ITM_R.create("ITM");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBBL1310_SLS_ACT_IO_Query_S01")
					.mainQuery()
					.select(
						S0_T3.trd_unit_cd,
						S0_T3.trd_unit_qty,
						S0_T3.base_unit_cd,
						S0_T3.base_unit_qty,
						S0_T3.gd_cd,
						S0_T3.loc_cd,
						S0_T3.str_ln_cd,
						S0_T3.lot_no,
						S0_T3.sublot_no,
						decode(
							S0_T3.ship_act_d_no,
							nullValue(),
							decode(
								S0_ITM.ver_flg,
								value(true),
								S0_T5.ver_no,
								nullValue()
							),
							S0_T4.ver_no
						).as("ver_no"),
						S0_T3.sno1,
						S0_T3.sno2,
						S0_T3.sno3,
						S0_T3.sno4,
						S0_T3.ship_act_d_no,
						S0_T3.sls_act_io_no,
						S0_T3.sub_char1,
						S0_T3.sub_char2,
						S0_T3.sub_char3,
						S0_ITM.dec_place.as("base_unit_dec_place"),
						S0_ITM.rnd_typ.as("base_unit_rnd_typ"),
						S0_ITM.lot_mng_typ,
						S0_ITM.sublot_mng_typ,
						S0_ITM.ver_flg,
						S0_ITM.sno1_mng_typ,
						S0_ITM.sno2_mng_typ,
						S0_ITM.sno3_mng_typ,
						S0_ITM.sno4_mng_typ,
						S0_ITM.stk_mng_typ,
						S0_T2.itm_cd,
						S0_T2.itm_sub1,
						S0_T2.itm_sub2,
						S0_T2.itm_sub3,
						S0_T1.sls_act_no,
						S0_T1.sls_act_seq,
						S0_T2.sls_act_d_no,
						S0_T2.sls_act_d_seq,
						S0_T3.sls_act_io_seq
					)
					.from(
						S0_T1
						.innerJoin(S0_T2).on(
							bracket(
								S0_T1.sls_act_no.eq(S0_T2.sls_act_no)
								.and(S0_T1.sls_act_seq.eq(S0_T2.sls_act_seq))
							)
						)
						.innerJoin(S0_T3).on(
							bracket(
								S0_T2.sls_act_d_no.eq(S0_T3.sls_act_d_no)
								.and(S0_T2.sls_act_d_seq.eq(S0_T3.sls_act_d_seq))
							)
						)
						.leftOuterJoin(S0_T4).on(
							bracket(
								S0_T3.ship_act_d_no.eq(S0_T4.ship_act_d_no)
							)
						)
						.leftOuterJoin(S0_T5).on(
							bracket(
								S0_T2.itm_cd.eq(S0_T5.itm_cd)
								.and(S0_T2.itm_sub1.eq(S0_T5.itm_sub1))
								.and(S0_T2.itm_sub2.eq(S0_T5.itm_sub2))
								.and(S0_T2.itm_sub3.eq(S0_T5.itm_sub3))
								.and(S0_T3.lot_no.eq(S0_T5.lot_no))
								.and(S0_T3.sublot_no.eq(S0_T5.sublot_no))
							)
						)
						.leftOuterJoin(S0_ITM).on(
							bracket(
								S0_T2.itm_cd.eq(S0_ITM.itm_cd)
								.and(S0_T2.itm_sub1.eq(S0_ITM.itm_sub1))
								.and(S0_T2.itm_sub2.eq(S0_ITM.itm_sub2))
								.and(S0_T2.itm_sub3.eq(S0_ITM.itm_sub3))
							)
						)
					)
					.where(
						value(1).eq(value(1))
						.and(S0_T1.sls_act_no.eq(bind("sls_act_no")))
						.and(S0_T1.sls_act_seq.eq(bind("sls_act_seq")))
					)
					.orderBy(S0_T3.sls_act_io_no.asc())
			)
			.setJoinInfo(
				joinInfo(
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
						.add(MAVM_ITM_UNIT_R.class, r -> toCondition(
							r.getStringNE("itm_cd"),
							r.getStringNE("itm_sub1"),
							r.getStringNE("itm_sub2"),
							r.getStringNE("itm_sub3"),
							r.getStringNE("trd_unit_cd")
						))
						.addSelect(m -> toArray(
							m.conv_base_qty,
							m.conv_qty,
							m.dec_place,
							m.rnd_typ
						))
						.addMap((r, m) -> {
							r.setNumberNE("trd_unit_dec_place", m.dec_place());
							r.setNumberNE("trd_unit_conv_base_qty", m.conv_base_qty());
							r.setNumberNE("trd_unit_conv_qty", m.conv_qty());
							r.setStringNE("trd_unit_rnd_typ", m.rnd_typ());
					}),
					j -> j
						.add(MAM_UNIT_R.class, r -> toCondition(
							r.getStringNE("base_unit_cd")
						))
						.addSelect(m -> toArray(
							m.unit_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("base_unit_nm", m.unit_nm());
					}),
					j -> j
						.add(MAM_STK_GD_R.class, r -> toCondition(
							r.getStringNE("gd_cd")
						))
						.addSelect(m -> toArray(
							m.gd_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("gd_nm", m.gd_nm());
					}),
					j -> j
						.add(MAM_LOC_R.class, r -> toCondition(
							r.getStringNE("loc_cd")
						))
						.addSelect(m -> toArray(
							m.loc_nm,
							m.site_cd,
							m.str_ln_tgt_flg
						))
						.addMap((r, m) -> {
							r.setStringNE("loc_nm", m.loc_nm());
							r.setBooleanNE("str_ln_tgt_flg", m.str_ln_tgt_flg());
							r.setStringNE("site_cd", m.site_cd());
					}),
					j -> j
						.add(MAM_STR_LN_R.class, r -> toCondition(
							r.getStringNE("loc_cd"),
							r.getStringNE("str_ln_cd")
						))
						.addSelect(m -> toArray(
							m.str_ln_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("str_ln_nm", m.str_ln_nm());
					})
				)
			);
	}
	
	/**
	 * -- MSBBL1310_SLS_ACT_Query_S01
	 */
	static MCQueryPlan MSBBL1310_SLS_ACT_S01() {
		MST_SLS_ACT_R S0_T = MST_SLS_ACT_R.create("T");
		MAM_CO_R S0_CO = MAM_CO_R.create("CO");
		MAM_BP_R S0_CST = MAM_BP_R.create("CST");
		MAM_DPT_R S0_DPT1 = MAM_DPT_R.create("DPT1");
		MAM_DPT_R S0_DPT2 = MAM_DPT_R.create("DPT2");
		MST_SLO_R S0_SLO = MST_SLO_R.create("SLO");
		MST_QTN_R S0_QTN = MST_QTN_R.create("QTN");
		MCTempView S0_T1 = createTempView("T1");
		MAVM_RD_DPT_R S0_DAC = MAVM_RD_DPT_R.create("DAC");
		MST_DLV_SLIP_R S1_X = MST_DLV_SLIP_R.create("X");
		MST_SLS_ACT_R S5 = MST_SLS_ACT_R.create();
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBBL1310_SLS_ACT_Query_S01")
					.mainQuery()
					.select(
						S0_T.trd_cd,
						S0_T.slip_sts_typ,
						S0_T.ac_ym,
						S0_T.sls_act_no,
						S0_T.sls_act_rev,
						S0_T.sls_act_seq,
						S0_T.dlv_slip_no,
						S0_T.ship_act_no,
						S0_T.sls_dt,
						S0_T.ac_dt,
						trunc(
							S0_T.ship_tm,
							MCDateFmt.DD
						).as("ship_dt"),
						S0_T.ship_tm.as("ship_hm"),
						trunc(
							S0_T.dlv_tm,
							MCDateFmt.DD
						).as("dlv_dt"),
						S0_T.dlv_tm.as("dlv_hm"),
						S0_T.bill_basis_dt,
						S0_T.cst_cd,
						S0_CST.bp_nm.as("cst_nm"),
						S0_CST.cst_iv_flg,
						S0_CST.prnt_lcl_cd,
						S0_T.sls_basis_typ,
						S0_T.sls_usr_cd,
						S0_T.sls_dpt_cd,
						S0_DPT1.dpt_nm.as("sls_dpt_nm"),
						S0_T.sls_usr_cd.as("cst_usr_cd"),
						S0_T.sls_dpt_cd.as("cst_dpt_cd"),
						S0_T.wg_cd,
						S0_T.trd_cur_cd,
						S0_T.base_cur_cd,
						nvl(
							S0_SLO.xrate_inpt_flg,
							S0_QTN.xrate_inpt_flg
						).as("xrate_inpt_flg"),
						S0_T.xrate,
						S0_T.ptax_cur_cd,
						S0_SLO.ptax_xrate_inpt_flg,
						S0_T.ptax_xrate,
						S0_T.qtn_no,
						S0_T.qtn_rev,
						S0_T.slo_no,
						S0_T.cst_po_no,
						cases()
							.when(
								exists(
									subQuery()
									.select(value("X"))
									.from(S1_X)
									.where(
										S1_X.dlv_slip_no.eq(S0_T.dlv_slip_no)
										.and(
											S1_X.dlv_slip_seq.eq(
												S0_T.dlv_slip_seq.add(
													decode(
														S0_T.sls_act_rev,
														S0_T1.pr("max_rev"),
														decode(
															S0_T.slip_sts_typ,
															value(MAC_SLIP_STS_TYP.DIS.value()),
															value(1),
															value(0)
														),
														value(0)
													)
												)
											)
										)
										.and(S1_X.slip_prnt_flg.eq(value(true)))
									)
								)
							)
								.then(value(true))
							.otherwise(value(false)).as("dlv_slip_prntd_flg"),
						S0_T.acst_cd,
						S0_T.ar_dpt_cd,
						S0_DPT2.dpt_nm.as("ar_dpt_nm"),
						S0_T.trd_rmrks,
						S0_T.intr_rmrks,
						S0_T.tterm_cd1,
						S0_T.tterm_rmrks1,
						S0_T.tterm_cd2,
						S0_T.tterm_rmrks2,
						S0_T.tterm_cd3,
						S0_T.tterm_rmrks3,
						S0_T.sub_char1,
						S0_T.sub_char2,
						S0_T.sub_char3,
						S0_T.edi_flg,
						S0_CST.bill_crryovr_times.as("cst_bill_crryovr_times"),
						S0_CST.sls_upri_cng_flg,
						S0_CST.sls_amt_rnd_typ,
						S0_CST.sls_upri_rnd_typ,
						S0_CST.sls_tax_rnd_typ,
						S0_CST.ar_dpt_typ,
						S0_T.ins_usr_id,
						S0_T.ins_usr_nm,
						S0_T.ins_func_id,
						S0_T.ins_ts,
						S0_T.upd_usr_id,
						S0_T.upd_usr_nm,
						S0_T.upd_func_id,
						S0_T.upd_ts,
						S0_T.upd_srv_req_no,
						S0_T.upd_cntr,
						S0_QTN.upd_cntr.as("qtn_upd_cntr"),
						S0_SLO.upd_cntr.as("slo_upd_cntr"),
						S0_CO.xrate_rnd_typ,
						S0_CO.wtax_rnd_typ,
						S0_CO.sls_xrate_cd.as("xrate_cd"),
						S0_T.ship_dlv_slip_no,
						bracket(
							S0_T.dlv_slip_seq.add(
								decode(
									S0_T.sls_act_rev,
									S0_T1.pr("max_rev"),
									decode(
										S0_T.slip_sts_typ,
										value(MAC_SLIP_STS_TYP.DIS.value()),
										value(1),
										value(0)
									),
									value(0)
								)
							)
						).as("dlv_slip_seq"),
						S0_T.bcst_cd.as("join_bcst_cd_")
					)
					.from(
						S0_T
						.crossJoin(S0_CO)
						.leftOuterJoin(S0_CST).on(
							bracket(
								S0_T.cst_cd.eq(S0_CST.bp_cd)
							)
						)
						.leftOuterJoin(S0_DPT1).on(
							bracket(
								S0_T.sls_dpt_cd.eq(S0_DPT1.dpt_cd)
								.and(S0_T.ac_dt.between(S0_DPT1.st_dt, S0_DPT1.end_dt))
							)
						)
						.leftOuterJoin(S0_DPT2).on(
							bracket(
								S0_T.ar_dpt_cd.eq(S0_DPT2.dpt_cd)
								.and(S0_T.ac_dt.between(S0_DPT2.st_dt, S0_DPT2.end_dt))
							)
						)
						.leftOuterJoin(S0_SLO).on(
							bracket(
								S0_T.slo_no.eq(S0_SLO.slo_no)
							)
						)
						.leftOuterJoin(S0_QTN).on(
							bracket(
								S0_T.qtn_no.eq(S0_QTN.qtn_no)
								.and(S0_T.qtn_rev.eq(S0_QTN.qtn_rev))
							)
						)
						.leftOuterJoin(
							subQuery()
							.select(
								S5.sls_act_no,
								max(S5.sls_act_rev).as("max_rev"),
								max(S5.sls_act_seq).as("max_seq")
							)
							.from(S5)
							.groupBy(S5.sls_act_no).view(S0_T1)
						).on(
							bracket(
								S0_T.sls_act_no.eq(S0_T1.pr(S5.sls_act_no))
							)
						)
						.innerJoin(S0_DAC).on(
							bracket(
								S0_T.sls_dpt_cd.eq(S0_DAC.dpt_cd)
							)
						)
					)
					.where(
						value(1).eq(value(1))
						.and(S0_T.sls_act_no.eq(bind("srch_tgt_no")))
						.and(
							S0_T.trd_ptn_typ.in(
								value(MAC_TRD_PTN_TYP.SLS.value()),
								value(MAC_TRD_PTN_TYP.SLS_CNSGN.value())
							)
						)
						.cutoff$and(
							S0_T.slip_sts_typ.eq(value(MAC_SLIP_STS_TYP.CRT.value()))
							.and(bind("latest_flg_str").eq(value(true)))
						)
						.cutoff$and(
							S0_T.sls_act_rev.eq(bind("srch_tgt_rev"))
							.and(S0_T.slip_sts_typ.neq(value(MAC_SLIP_STS_TYP.CAN.value())))
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
							m.trd_nm,
							m.trd_ptn_typ
						))
						.addMap((r, m) -> {
							r.setStringNE("trd_nm", m.trd_nm());
							r.setStringNE("trd_ptn_typ", m.trd_ptn_typ());
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
							r.setNumberNE("trd_cur_amt_dec_place", m.amt_dec_place());
							r.setNumberNE("trd_cur_upri_dec_place", m.upri_dec_place());
					}),
					j -> j
						.add(MAM_CUR_R.class, r -> toCondition(
							r.getStringNE("base_cur_cd")
						))
						.addSelect(m -> toArray(
							m.amt_dec_place,
							m.cur_nm,
							m.upri_dec_place
						))
						.addMap((r, m) -> {
							r.setStringNE("base_cur_nm", m.cur_nm());
							r.setNumberNE("base_cur_amt_dec_place", m.amt_dec_place());
							r.setNumberNE("base_cur_upri_dec_place", m.upri_dec_place());
					}),
					j -> j
						.add(MAM_CUR_R.class, r -> toCondition(
							r.getStringNE("ptax_cur_cd")
						))
						.addSelect(m -> toArray(
							m.amt_dec_place,
							m.cur_nm,
							m.upri_dec_place
						))
						.addMap((r, m) -> {
							r.setStringNE("ptax_cur_nm", m.cur_nm());
							r.setNumberNE("ptax_cur_amt_dec_place", m.amt_dec_place());
							r.setNumberNE("ptax_cur_upri_dec_place", m.upri_dec_place());
					}),
					j -> j
						.add(MAM_BP_R.class, r -> toCondition(
							r.getStringNE("acst_cd")
						))
						.addSelect(m -> toArray(
							m.bp_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("acst_nm", m.bp_nm());
					}),
					j -> j
						.add(MAM_BP_R.class, r -> toCondition(
							r.getStringNE("join_bcst_cd_")
						))
						.addSelect(m -> toArray(
							m.bill_cl_typ
						))
						.addMap((r, m) -> {
							r.setStringNE("bill_cl_typ", m.bill_cl_typ());
					}),
					j -> j
						.add(MAM_TTERM_R.class, r -> toCondition(
							r.getStringNE("tterm_cd1")
						))
						.addSelect(m -> toArray(
							m.tterm_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("tterm_nm1", m.tterm_nm());
					}),
					j -> j
						.add(MAM_TTERM_R.class, r -> toCondition(
							r.getStringNE("tterm_cd2")
						))
						.addSelect(m -> toArray(
							m.tterm_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("tterm_nm2", m.tterm_nm());
					}),
					j -> j
						.add(MAM_TTERM_R.class, r -> toCondition(
							r.getStringNE("tterm_cd3")
						))
						.addSelect(m -> toArray(
							m.tterm_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("tterm_nm3", m.tterm_nm());
					})
				)
			);
	}

	/**
	 * -- MSBBL1310_SLS_ACT_D_Query_S02
	 */
	static MCQueryPlan MSBBL1310_SLS_ACT_D_S02() {
		MST_SLS_ACT_R S0_SLSACT = MST_SLS_ACT_R.create("SLSACT");
		MST_SLS_ACT_D_R S0_SLSACTD = MST_SLS_ACT_D_R.create("SLSACTD");
		MST_SLS_SCHD_R S0_SLSSCHD = MST_SLS_SCHD_R.create("SLSSCHD");
		MST_SLO_D_R S0_SLOD = MST_SLO_D_R.create("SLOD");
		MST_QTN_D_R S0_QTND = MST_QTN_D_R.create("QTND");
		MST_SHIP_PR_R S0_SHIPPR = MST_SHIP_PR_R.create("SHIPPR");
		MST_LOT_R S0_LOT = MST_LOT_R.create("LOT");
		MST_IV_D_R S0_IVD = MST_IV_D_R.create("IVD");
		MST_SLO_R S0_SLO = MST_SLO_R.create("SLO");
		MST_QTN_R S0_QTN = MST_QTN_R.create("QTN");
		
		MAM_ITM_LCL_R S0_ITMLCL = MAM_ITM_LCL_R.create("ITMLCL");
		MAM_BP_R S0_DLV = MAM_BP_R.create("DLV");
		MAM_ITM_R S0_ITM = MAM_ITM_R.create("ITM");
		MAVM_ITM_UNIT_R S0_BIU = MAVM_ITM_UNIT_R.create("BIU");
		MAM_DPT_R S0_DPT1 = MAM_DPT_R.create("DPT1");
		MAM_DPT_R S0_DPT2 = MAM_DPT_R.create("DPT2");
		MAM_DPT_R S0_DPT3 = MAM_DPT_R.create("DPT3");
		MAM_EDI_IF_CTL_R S0_EDI = MAM_EDI_IF_CTL_R.create("EDI");
		MAM_EXT_SYS_R S0_EXT = MAM_EXT_SYS_R.create("EXT");
		MST_IV_D_R S9_W = MST_IV_D_R.create("W");
		MAM_TAX_R S9_STAX = MAM_TAX_R.create("STAX");
		MST_IV_D_R S10_W = MST_IV_D_R.create("W");
		MAVM_ITM_UNIT_R S10_WIU = MAVM_ITM_UNIT_R.create("WIU");
		MST_IV_D_R S11_W = MST_IV_D_R.create("W");
		MAVM_ITM_UNIT_R S11_WIU = MAVM_ITM_UNIT_R.create("WIU");
		MAM_TAX_R S12_WM = MAM_TAX_R.create("WM");
		MST_IV_D_R S12_WT = MST_IV_D_R.create("WT");
		MAM_TAX_R S13_WM = MAM_TAX_R.create("WM");
		MST_IV_D_R S13_WT = MST_IV_D_R.create("WT");
		
		return createQueryPlan()
			.setQuery(
				sql("MSBBL1310_SLS_ACT_D_Query_S02")
					.mainQuery()
					.select(
						S0_SLSSCHD.abort_flg,
						nvl(
							S0_SLOD.sls_cststk_flg,
							value(false)
						).as("sls_cststk_flg"),
						S0_SLSACT.trd_cd,
						S0_SLSACTD.itm_cd,
						S0_SLSACTD.itm_sub1,
						S0_SLSACTD.itm_sub2,
						S0_SLSACTD.itm_sub3,
						nvl(
							S0_SLSACTD.itm_nm,
							S0_ITM.itm_nm
						).as("itm_nm"),
						S0_ITM.asset_mng_typ,
						S0_SLSACTD.sundry_itm_flg,
						S0_SLSSCHD.sls_schd_dt,
						S0_SLSACTD.dlv_cd,
						nvl(
							S0_SLSACTD.dlv_nm,
							S0_DLV.bp_nm
						).as("dlv_nm"),
						S0_SLSACTD.dlv_zip_cd,
						S0_SLSACTD.dlv_addr1,
						S0_SLSACTD.dlv_addr2,
						S0_SLSACTD.dlv_addr3,
						S0_SLSACTD.dlv_addr4,
						S0_SLSACTD.dlv_cntct_dpt,
						S0_SLSACTD.dlv_cntct_psn,
						S0_SLSACTD.dlv_tel,
						S0_SLSACTD.dlv_fax,
						S0_DLV.prnt_lcl_cd,
						S0_DLV.cntry_cd,
						S0_SLSACTD.cntry_org_cd,
						S0_SLSACTD.pri_prnt_flg,
						S0_SLSACTD.dest_cd1,
						S0_SLSACTD.dest_cd2,
						S0_SLSACTD.dest_cd3,
						S0_SLSACT.ac_dt,
						S0_SLSACT.sls_usr_cd,
						S0_SLSACT.sls_dpt_cd,
						S0_DPT2.dpt_nm.as("sls_dpt_nm"),
						S0_SLSACT.wg_cd,
						S0_SLSACTD.trd_unit_cd,
						S0_SLSACTD.trd_unit_qty,
						S0_SLSACTD.base_unit_cd,
						S0_SLSACTD.base_unit_qty,
						S0_SLSACTD.base_unit_qty.as("base_unit_qty_bef"),
						S0_IVD.base_unit_qty.as("ship_qty"),
						S0_SLSSCHD.base_unit_abort_qty.as("abort_qty"),
						S0_SLSSCHD.base_unit_sls_qty.as("sls_qty"),
						S0_SLSACTD.interim_flg,
						S0_SLSACTD.trd_cur_upri,
						S0_SLSACTD.upri_not_tgt_flg,
						S0_SLSACTD.trd_cur_amt,
						bracket(
							S0_SLSACTD.trd_cur_amt.add(S0_SLSACTD.trd_cur_tax_amt)
						).as("trd_cur_inc_tax_amt"),
						S0_IVD.tax_fix_flg,
						S0_SLSACTD.tax_cd,
						S0_SLSACTD.trd_cur_tax_amt,
						S0_SLSACTD.trd_cur_dscnt_amt,
						S0_SLSACTD.dscnt_rsn_cd,
						S0_SLSACTD.base_cur_upri,
						S0_SLSACTD.base_cur_amt,
						bracket(
							S0_SLSACTD.base_cur_amt.add(S0_SLSACTD.base_cur_tax_amt)
						).as("base_cur_inc_tax_amt"),
						S0_SLSACTD.base_cur_tax_amt,
						S0_SLSACTD.base_cur_dscnt_amt,
						S0_SLSACTD.ptax_cur_upri,
						S0_SLSACTD.ptax_cur_amt,
						bracket(
							S0_SLSACTD.ptax_cur_amt.add(S0_SLSACTD.ptax_cur_tax_amt)
						).as("ptax_cur_inc_tax_amt"),
						S0_SLSACTD.ptax_cur_tax_amt,
						S0_SLSACTD.ptax_cur_dscnt_amt,
						S0_SLSACTD.cost_upri,
						S0_SLSACTD.cost_amt,
						S0_IVD.iv_upri,
						S0_IVD.iv_amt,
						S0_SLSACTD.bill_crryovr_times,
						S0_SLSACTD.gd_cd,
						S0_SLSACTD.loc_cd,
						S0_SLSACTD.str_ln_cd,
						S0_SLSACTD.lot_no,
						S0_SLSACTD.sublot_no,
						decode(
							S0_ITM.ver_flg,
							value(true),
							S0_LOT.ver_no,
							nullValue()
						).as("ver_no"),
						S0_SLSACTD.sno1,
						S0_SLSACTD.sno2,
						S0_SLSACTD.sno3,
						S0_SLSACTD.sno4,
						S0_SLSACTD.cst_po_d_no,
						S0_SLSACT.cst_po_no,
						S0_SLSACTD.cst_itm_cd,
						S0_SLSACTD.cst_itm_nm,
						S0_SLSACTD.rsn_cd.as("sls_rsn_cd"),
						decode(
							S0_SLSACTD.sundry_itm_flg,
							value(true),
							S0_SLSACTD.iv_itm_nm,
							nvl(
								S0_ITMLCL.itm_nm,
								S0_ITM.itm_nm
							)
						).as("iv_itm_nm"),
						S0_SLSACTD.bd_dpt_cd,
						S0_DPT1.dpt_nm.as("bd_dpt_nm"),
						S0_SLSACTD.wtax_rate,
						S0_SLSACTD.wtax_amt,
						S0_SLSACT.ar_dpt_cd,
						S0_DPT3.dpt_nm.as("ar_dpt_nm"),
						S0_IVD.iv_d_rmrks,
						S0_SLSACTD.ext_sys_cd,
						S0_EXT.ext_sys_nm,
						S0_SLSACTD.ext_purc_act_d_no,
						S0_IVD.iv_d_rmrks,
						S0_IVD.trd_d_rmrks.as("iv_trd_d_rmrks"),
						S0_IVD.trd_rmrks.as("iv_trd_rmrks"),
						S0_IVD.intr_d_rmrks.as("iv_intr_d_rmrks"),
						S0_IVD.sub_char1.as("iv_sub_char1"),
						S0_IVD.sub_char2.as("iv_sub_char2"),
						S0_IVD.sub_char3.as("iv_sub_char3"),
						S0_SLSACTD.trd_d_rmrks,
						S0_SLSACTD.intr_rmrks,
						S0_SLSACTD.sub_char1,
						S0_SLSACTD.sub_char2,
						S0_SLSACTD.sub_char3,
						cases()
							.when(S0_EDI.bp_cd.isNotNull())
								.then(nullValue())
							.otherwise(value(MSC_ACCPT_STS_TYP.OTR.value())).as("accpt_sts_typ"),
						S0_SLSACT.qtn_no,
						S0_SLSACT.qtn_rev,
						S0_SLSACTD.qtn_d_no,
						S0_SLSACT.slo_no,
						S0_SLSACTD.slo_d_no,
						S0_SLSACTD.dlv_slip_d_no,
						S0_SLSACT.dlv_slip_no,
						S0_SLSACT.dlv_slip_seq,
						S0_SLSACT.ship_act_no,
						S0_SLSACTD.sls_act_d_no,
						S0_SLSACTD.iv_d_no,
						S0_ITM.exim_xpns_typ,
						S0_SLSACTD.disp_seq,
						S0_ITM.lot_mng_typ,
						S0_ITM.sublot_mng_typ,
						S0_ITM.ver_flg,
						S0_SLOD.not_lot_mix_flg,
						S0_SLOD.not_sublot_mix_flg,
						S0_SLSACTD.sno1_mng_typ,
						S0_SLSACTD.sno2_mng_typ,
						S0_SLSACTD.sno3_mng_typ,
						S0_SLSACTD.sno4_mng_typ,
						S0_ITM.bill_crryovr_times.as("itm_bill_crryovr_times"),
						S0_ITM.stk_mng_typ,
						S0_ITM.dscnt_itm_flg,
						S0_ITM.sls_upri_cng_flg,
						S0_ITM.dec_place.as("base_unit_dec_place"),
						S0_ITM.rnd_typ.as("base_unit_rnd_typ"),
						S0_DLV.dlv_sundry_flg,
						S0_SLSACT.sls_act_no,
						S0_SLSACT.sls_act_rev,
						S0_SLSACT.sls_act_seq,
						S0_SLSACTD.sls_act_d_seq,
						S0_SLSSCHD.base_unit_qty.as("sls_schd_qty"),
						S0_SLSSCHD.sls_schd_no,
						S0_SLSSCHD.upd_cntr.as("sls_schd_upd_cntr"),
						S0_SHIPPR.ship_pr_no,
						S0_SLSACT.upd_cntr.as("upd_cntr"),
						S0_QTN.upd_cntr.as("qtn_upd_cntr"),
						S0_SLO.upd_cntr.as("slo_upd_cntr"),
						S0_SLSACTD.purc_ddlv_po_d_no,
						S0_SLSACTD.purc_act_no,
						S0_IVD.base_unit_qty.as("init_schd_qty"),
						S0_IVD.trd_cur_dscnt_amt.as("init_schd_dscnt_amt"),
						subQuery()
							.select(
								decode(
									S9_STAX.inc_tax_flg,
									value(false),
									S9_W.trd_cur_amt,
									S9_W.trd_cur_amt.add(S9_W.trd_cur_tax_amt)
								)
							)
							.from(
								S9_W
								.leftOuterJoin(S9_STAX).on(S0_SLSACTD.tax_cd.eq(S9_STAX.tax_cd))
							)
							.where(
								S9_W.iv_d_no.eq(S0_SLSACTD.iv_d_no)
							).as("init_schd_amt"),
						subQuery()
						.select(S10_WIU.conv_base_qty)
							.from(
								S10_W
								.innerJoin(S10_WIU).on(
									S10_W.itm_cd.eq(S10_WIU.itm_cd)
									.and(S10_W.itm_sub1.eq(S10_WIU.itm_sub1))
									.and(S10_W.itm_sub2.eq(S10_WIU.itm_sub2))
									.and(S10_W.itm_sub3.eq(S10_WIU.itm_sub3))
									.and(S10_W.trd_unit_cd.eq(S10_WIU.unit_cd))
								)
							)
							.where(
								S10_W.iv_d_no.eq(S0_SLSACTD.iv_d_no)
							).as("schd_trd_unit_conv_base_qty"),
						subQuery()
							.select(S11_WIU.conv_qty)
							.from(
								S11_W
								.innerJoin(S11_WIU).on(
									S11_W.itm_cd.eq(S11_WIU.itm_cd)
									.and(S11_W.itm_sub1.eq(S11_WIU.itm_sub1))
									.and(S11_W.itm_sub2.eq(S11_WIU.itm_sub2))
									.and(S11_W.itm_sub3.eq(S11_WIU.itm_sub3))
									.and(S11_W.trd_unit_cd.eq(S11_WIU.unit_cd))
								)
							)
							.where(
								S11_W.iv_d_no.eq(S0_SLSACTD.iv_d_no)
							).as("schd_trd_unit_conv_qty"),
						S0_SLSACTD.sls_dtl_upd_flg,
						S0_IVD.trd_cur_tax_amt.as("init_trd_cur_tax_amt"),
						S0_IVD.trd_unit_cd.as("init_trd_unit_cd"),
						S0_IVD.trd_unit_qty.as("init_trd_unit_qty"),
						S0_IVD.trd_cur_upri.as("init_trd_cur_upri"),
						subQuery()
							.select(S12_WM.inc_tax_flg)
							.from(
								S12_WM
								.innerJoin(S12_WT).on(S12_WM.tax_cd.eq(S12_WT.tax_cd))
							)
							.where(
								S12_WT.iv_d_no.eq(S0_SLSACTD.iv_d_no)
							).as("init_inc_tax_flg"),
						subQuery()
							.select(S13_WM.tax_rate)
							.from(
								S13_WM
								.innerJoin(S13_WT).on(S13_WM.tax_cd.eq(S13_WT.tax_cd))
							)
							.where(
								S13_WT.iv_d_no.eq(S0_SLSACTD.iv_d_no)
							)
							.as("init_tax_rate"),
						S0_IVD.trd_cur_dscnt_amt.as("init_trd_cur_dscnt_amt"),
						S0_SLSACTD.ship_dlv_slip_d_no
					)
					.from(
						S0_SLSACT
						.innerJoin(S0_SLSACTD).on(
							bracket(
								S0_SLSACT.sls_act_no.eq(S0_SLSACTD.sls_act_no)
								.and(S0_SLSACT.sls_act_seq.eq(S0_SLSACTD.sls_act_seq))
							)
						)
						.leftOuterJoin(S0_SLSSCHD).on(
							bracket(
								S0_SLSACTD.sls_schd_no.eq(S0_SLSSCHD.sls_schd_no)
							)
						)
						.leftOuterJoin(S0_SLOD).on(
							bracket(
								S0_SLSACTD.slo_d_no.eq(S0_SLOD.slo_d_no)
							)
						)
						.leftOuterJoin(S0_QTND).on(
							bracket(
								S0_SLSACTD.qtn_d_no.eq(S0_QTND.qtn_d_no)
							)
						)
						.leftOuterJoin(S0_SHIPPR).on(
							bracket(
								S0_SLSACTD.slo_d_no.eq(S0_SHIPPR.slo_d_no)
							)
						)
						.leftOuterJoin(S0_LOT).on(
							bracket(
								S0_SLSACTD.itm_cd.eq(S0_LOT.itm_cd)
								.and(S0_SLSACTD.itm_sub1.eq(S0_LOT.itm_sub1))
								.and(S0_SLSACTD.itm_sub2.eq(S0_LOT.itm_sub2))
								.and(S0_SLSACTD.itm_sub3.eq(S0_LOT.itm_sub3))
								.and(S0_SLSACTD.lot_no.eq(S0_LOT.lot_no))
								.and(S0_SLSACTD.sublot_no.eq(S0_LOT.sublot_no))
							)
						)
						.innerJoin(S0_IVD).on(
							bracket(
								S0_SLSACTD.iv_d_no.eq(S0_IVD.iv_d_no)
							)
						)
						.leftOuterJoin(S0_SLO).on(
							bracket(
								S0_SLSACT.slo_no.eq(S0_SLO.slo_no)
							)
						)
						.leftOuterJoin(S0_QTN).on(
							bracket(
								S0_SLSACT.qtn_no.eq(S0_QTN.qtn_no)
								.and(S0_SLSACT.qtn_rev.eq(S0_QTN.qtn_rev))
							)
						)
						.leftOuterJoin(S0_DLV).on(
							bracket(
								S0_SLSACTD.dlv_cd.eq(S0_DLV.bp_cd)
							)
						)
						.leftOuterJoin(S0_ITM).on(
							bracket(
								S0_SLSACTD.itm_cd.eq(S0_ITM.itm_cd)
								.and(S0_SLSACTD.itm_sub1.eq(S0_ITM.itm_sub1))
								.and(S0_SLSACTD.itm_sub2.eq(S0_ITM.itm_sub2))
								.and(S0_SLSACTD.itm_sub3.eq(S0_ITM.itm_sub3))
							)
						)
						.leftOuterJoin(S0_BIU).on(
							bracket(
								S0_SLSACTD.itm_cd.eq(S0_BIU.itm_cd)
								.and(S0_SLSACTD.itm_sub1.eq(S0_BIU.itm_sub1))
								.and(S0_SLSACTD.itm_sub2.eq(S0_BIU.itm_sub2))
								.and(S0_SLSACTD.itm_sub3.eq(S0_BIU.itm_sub3))
								.and(S0_SLSACTD.base_unit_cd.eq(S0_BIU.unit_cd))
							)
						)
						.leftOuterJoin(S0_DPT1).on(
							bracket(
								S0_SLSACTD.bd_dpt_cd.eq(S0_DPT1.dpt_cd)
								.and(S0_SLSACT.ac_dt.between(S0_DPT1.st_dt, S0_DPT1.end_dt))
							)
						)
						.leftOuterJoin(S0_DPT2).on(
							bracket(
								S0_SLSACT.sls_dpt_cd.eq(S0_DPT2.dpt_cd)
								.and(S0_SLSACT.ac_dt.between(S0_DPT2.st_dt, S0_DPT2.end_dt))
							)
						)
						.leftOuterJoin(S0_DPT3).on(
							bracket(
								S0_SLSACT.ar_dpt_cd.eq(S0_DPT3.dpt_cd)
								.and(S0_SLSACT.ac_dt.between(S0_DPT3.st_dt, S0_DPT3.end_dt))
							)
						)
						.leftOuterJoin(S0_EDI).on(
							bracket(
								S0_EDI.bp_cd.eq(S0_SLSACT.cst_cd)
								.and(S0_EDI.if_proc_typ.eq(value(MAC_IF_PROC_TYP.ACCPT_RECV.value())))
								.and(S0_SLSACT.sls_dt.between(S0_EDI.st_dt, S0_EDI.end_dt))
							)
						)
						.leftOuterJoin(S0_EXT).on(
								bracket(
									S0_SLSACTD.ext_sys_cd.eq(S0_EXT.ext_sys_cd)
								)
							)
						.leftOuterJoin(S0_ITMLCL).on(
							bracket(
								S0_SLSACTD.itm_cd.eq(S0_ITMLCL.itm_cd)
								.and(S0_SLSACTD.itm_sub1.eq(S0_ITMLCL.itm_sub1))
								.and(S0_SLSACTD.itm_sub2.eq(S0_ITMLCL.itm_sub2))
								.and(S0_SLSACTD.itm_sub3.eq(S0_ITMLCL.itm_sub3))
								.and(S0_ITMLCL.lcl_cd.eq(S0_DLV.prnt_lcl_cd))
							)
						)
					)
					.where(
						value(1).eq(value(1))
						.and(S0_SLSACT.sls_act_no.eq(bind("sls_act_no")))
						.and(S0_SLSACT.sls_act_seq.eq(bind("sls_act_seq")))
					)
					.orderBy(S0_SLSACTD.disp_seq.asc())
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
						.add(MAVM_ITM_UNIT_R.class, r -> toCondition(
							r.getStringNE("itm_cd"),
							r.getStringNE("itm_sub1"),
							r.getStringNE("itm_sub2"),
							r.getStringNE("itm_sub3"),
							r.getStringNE("trd_unit_cd")
						))
						.addSelect(m -> toArray(
							m.conv_base_qty,
							m.conv_qty,
							m.dec_place,
							m.rnd_typ
						))
						.addMap((r, m) -> {
							r.setNumberNE("trd_unit_dec_place", m.dec_place());
							r.setNumberNE("trd_unit_conv_base_qty", m.conv_base_qty());
							r.setNumberNE("trd_unit_conv_qty", m.conv_qty());
							r.setStringNE("trd_unit_rnd_typ", m.rnd_typ());
					}),
					j -> j
						.add(MAM_UNIT_R.class, r -> toCondition(
							r.getStringNE("base_unit_cd")
						))
						.addSelect(m -> toArray(
							m.unit_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("base_unit_nm", m.unit_nm());
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
						.add(MAM_CNTRY_R.class, r -> toCondition(
							r.getStringNE("cntry_cd")
						))
						.addSelect(m -> toArray(
							m.cntry_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("cntry_nm", m.cntry_nm());
					}),
					j -> j
					.add(MAM_CNTRY_R.class, r -> toCondition(
						r.getStringNE("cntry_org_cd")
					))
					.addSelect(m -> toArray(
						m.cntry_nm
					))
					.addMap((r, m) -> {
						r.setStringNE("cntry_org_nm", m.cntry_nm());
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
							r.setStringNE("tax_nm", m.tax_nm());
							r.setNumberNE("tax_rate", m.tax_rate());
							r.setBooleanNE("inc_tax_flg", m.inc_tax_flg());
							r.setStringNE("tax_typ", m.tax_typ());
					}),
					j -> j
						.add(MAM_BIZ_RSN_R.class, r -> toCondition(
							r.getStringNE("dscnt_rsn_cd")
						))
						.addSelect(m -> toArray(
							m.biz_rsn_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("dscnt_rsn_nm", m.biz_rsn_nm());
					}),
					j -> j
						.add(MAM_BIZ_RSN_R.class, r -> toCondition(
							r.getStringNE("sls_rsn_cd")
						))
						.addSelect(m -> toArray(
							m.biz_rsn_nm,
							m.sls_acxfr_flg
						))
						.addMap((r, m) -> {
							r.setStringNE("sls_rsn_nm", m.biz_rsn_nm());
							r.setBooleanNE("sls_acxfr_flg", m.sls_acxfr_flg());
					}),
					j -> j
						.add(MAM_STK_GD_R.class, r -> toCondition(
							r.getStringNE("gd_cd")
						))
						.addSelect(m -> toArray(
							m.gd_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("gd_nm", m.gd_nm());
					}),
					j -> j
						.add(MAM_LOC_R.class, r -> toCondition(
							r.getStringNE("loc_cd")
						))
						.addSelect(m -> toArray(
							m.loc_nm,
							m.site_cd,
							m.str_ln_tgt_flg
						))
						.addMap((r, m) -> {
							r.setStringNE("loc_nm", m.loc_nm());
							r.setBooleanNE("str_ln_tgt_flg", m.str_ln_tgt_flg());
							r.setStringNE("site_cd", m.site_cd());
					}),
					j -> j
						.add(MAM_STR_LN_R.class, r -> toCondition(
							r.getStringNE("loc_cd"),
							r.getStringNE("str_ln_cd")
						))
						.addSelect(m -> toArray(
							m.str_ln_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("str_ln_nm", m.str_ln_nm());
					}),
					j -> j
						.add(MSVT_WRK_SNO_R.class, r -> toCondition(
							r.getStringNE("sno1")
						))
						.addSelect(m -> toArray(
							m.wrk_no
						))
						.addMap((r, m) -> {
							r.setStringNE("wrk_no", m.wrk_no());
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
					})
				)
			);
	}
		
	/**
	 * -- MSBBL1310_SLS_ACT_IO_Query_S02
	 */
	static MCQueryPlan MSBBL1310_SLS_ACT_IO_S02() {
		MST_SLS_ACT_R S0_SLSACT = MST_SLS_ACT_R.create("SLSACT");
		MST_SLS_ACT_D_R S0_SLSACTD = MST_SLS_ACT_D_R.create("SLSACTD");
		MST_SLS_ACT_IO_R S0_SLSACTIO = MST_SLS_ACT_IO_R.create("SLSACTIO");
		MST_SHIP_ACT_D_R S0_SHIPACTD = MST_SHIP_ACT_D_R.create("SHIPACTD");
		MST_LOT_R S0_LOT = MST_LOT_R.create("LOT");
		
		MAM_ITM_R S0_ITM = MAM_ITM_R.create("ITM");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBBL1310_SLS_ACT_IO_Query_S02")
					.mainQuery()
					.select(
						S0_SLSACTIO.trd_unit_cd,
						S0_SLSACTIO.trd_unit_qty,
						S0_SLSACTIO.base_unit_cd,
						S0_SLSACTIO.base_unit_qty,
						S0_SLSACTIO.gd_cd,
						S0_SLSACTIO.loc_cd,
						S0_SLSACTIO.str_ln_cd,
						S0_SLSACTIO.lot_no,
						S0_SLSACTIO.sublot_no,
						decode(
							S0_SLSACTIO.ship_act_d_no,
							nullValue(),
							decode(
								S0_ITM.ver_flg,
								value(true),
								S0_LOT.ver_no,
								nullValue()
							),
							S0_SHIPACTD.ver_no
						).as("ver_no"),
						S0_SLSACTIO.sno1,
						S0_SLSACTIO.sno2,
						S0_SLSACTIO.sno3,
						S0_SLSACTIO.sno4,
						S0_SLSACTIO.ship_act_d_no,
						S0_SLSACTIO.sls_act_io_no,
						S0_SLSACTIO.sub_char1,
						S0_SLSACTIO.sub_char2,
						S0_SLSACTIO.sub_char3,
						S0_ITM.dec_place.as("base_unit_dec_place"),
						S0_ITM.rnd_typ.as("base_unit_rnd_typ"),
						S0_ITM.lot_mng_typ,
						S0_ITM.sublot_mng_typ,
						S0_ITM.ver_flg,
						S0_ITM.sno1_mng_typ,
						S0_ITM.sno2_mng_typ,
						S0_ITM.sno3_mng_typ,
						S0_ITM.sno4_mng_typ,
						S0_ITM.stk_mng_typ,
						S0_SLSACTD.itm_cd,
						S0_SLSACTD.itm_sub1,
						S0_SLSACTD.itm_sub2,
						S0_SLSACTD.itm_sub3,
						S0_SLSACT.sls_act_no,
						S0_SLSACT.sls_act_seq,
						S0_SLSACTD.sls_act_d_no,
						S0_SLSACTD.sls_act_d_seq,
						S0_SLSACTIO.sls_act_io_seq,
						S0_SLSACTD.iv_d_no
					)
					.from(
						S0_SLSACT
						.innerJoin(S0_SLSACTD).on(
							bracket(
								S0_SLSACT.sls_act_no.eq(S0_SLSACTD.sls_act_no)
								.and(S0_SLSACT.sls_act_seq.eq(S0_SLSACTD.sls_act_seq))
							)
						)
						.innerJoin(S0_SLSACTIO).on(
							bracket(
								S0_SLSACTD.sls_act_d_no.eq(S0_SLSACTIO.sls_act_d_no)
								.and(S0_SLSACTD.sls_act_d_seq.eq(S0_SLSACTIO.sls_act_d_seq))
							)
						)
						.leftOuterJoin(S0_SHIPACTD).on(
							bracket(
								S0_SLSACTIO.ship_act_d_no.eq(S0_SHIPACTD.ship_act_d_no)
							)
						)
						.leftOuterJoin(S0_LOT).on(
							bracket(
								S0_SLSACTD.itm_cd.eq(S0_LOT.itm_cd)
								.and(S0_SLSACTD.itm_sub1.eq(S0_LOT.itm_sub1))
								.and(S0_SLSACTD.itm_sub2.eq(S0_LOT.itm_sub2))
								.and(S0_SLSACTD.itm_sub3.eq(S0_LOT.itm_sub3))
								.and(S0_SLSACTIO.lot_no.eq(S0_LOT.lot_no))
								.and(S0_SLSACTIO.sublot_no.eq(S0_LOT.sublot_no))
							)
						)
						.leftOuterJoin(S0_ITM).on(
							bracket(
								S0_SLSACTD.itm_cd.eq(S0_ITM.itm_cd)
								.and(S0_SLSACTD.itm_sub1.eq(S0_ITM.itm_sub1))
								.and(S0_SLSACTD.itm_sub2.eq(S0_ITM.itm_sub2))
								.and(S0_SLSACTD.itm_sub3.eq(S0_ITM.itm_sub3))
							)
						)
					)
					.where(
						value(1).eq(value(1))
						.and(S0_SLSACT.sls_act_no.eq(bind("sls_act_no")))
						.and(S0_SLSACT.sls_act_seq.eq(bind("sls_act_seq")))
					)
					.orderBy(S0_SLSACTIO.sls_act_io_no.asc())
			)
			.setJoinInfo(
				joinInfo(
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
						.add(MAVM_ITM_UNIT_R.class, r -> toCondition(
							r.getStringNE("itm_cd"),
							r.getStringNE("itm_sub1"),
							r.getStringNE("itm_sub2"),
							r.getStringNE("itm_sub3"),
							r.getStringNE("trd_unit_cd")
						))
						.addSelect(m -> toArray(
							m.conv_base_qty,
							m.conv_qty,
							m.dec_place,
							m.rnd_typ
						))
						.addMap((r, m) -> {
							r.setNumberNE("trd_unit_dec_place", m.dec_place());
							r.setNumberNE("trd_unit_conv_base_qty", m.conv_base_qty());
							r.setNumberNE("trd_unit_conv_qty", m.conv_qty());
							r.setStringNE("trd_unit_rnd_typ", m.rnd_typ());
					}),
					j -> j
						.add(MAM_UNIT_R.class, r -> toCondition(
							r.getStringNE("base_unit_cd")
						))
						.addSelect(m -> toArray(
							m.unit_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("base_unit_nm", m.unit_nm());
					}),
					j -> j
						.add(MAM_STK_GD_R.class, r -> toCondition(
							r.getStringNE("gd_cd")
						))
						.addSelect(m -> toArray(
							m.gd_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("gd_nm", m.gd_nm());
					}),
					j -> j
						.add(MAM_LOC_R.class, r -> toCondition(
							r.getStringNE("loc_cd")
						))
						.addSelect(m -> toArray(
							m.loc_nm,
							m.site_cd,
							m.str_ln_tgt_flg
						))
						.addMap((r, m) -> {
							r.setStringNE("loc_nm", m.loc_nm());
							r.setBooleanNE("str_ln_tgt_flg", m.str_ln_tgt_flg());
							r.setStringNE("site_cd", m.site_cd());
					}),
					j -> j
						.add(MAM_STR_LN_R.class, r -> toCondition(
							r.getStringNE("loc_cd"),
							r.getStringNE("str_ln_cd")
						))
						.addSelect(m -> toArray(
							m.str_ln_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("str_ln_nm", m.str_ln_nm());
					})
				)
			);
	}
		
	/**
	 * -- MSBBL1310_SLS_ACT_Query_S02
	 */
	static MCQueryPlan MSBBL1310_SLS_ACT_S02() {
		MST_SLS_ACT_R S0_SLSACT = MST_SLS_ACT_R.create("SLSACT");
		MST_SLO_R S0_SLO = MST_SLO_R.create("SLO");
		MST_QTN_R S0_QTN = MST_QTN_R.create("QTN");
		MST_IV_R S0_IV = MST_IV_R.create("IV");
		
		MAM_CO_R S0_CO = MAM_CO_R.create("CO");
		MAM_BP_R S0_CST = MAM_BP_R.create("CST");
		MAM_DPT_R S0_DPT1 = MAM_DPT_R.create("DPT1");
		MAM_DPT_R S0_DPT2 = MAM_DPT_R.create("DPT2");
		MCTempView S0_T1 = createTempView("T1");
		MST_DLV_SLIP_R S1_X = MST_DLV_SLIP_R.create("X");
		MST_SLS_ACT_R S5 = MST_SLS_ACT_R.create();
		
		MCDynamicSQLID REP1 = createDynamicSQLID("REP1");
		
		return createQueryPlan()
			.setQuery(
				sql("MSBBL1310_SLS_ACT_Query_S02")
					.mainQuery()
					.select(
						S0_SLSACT.trd_cd,
						S0_SLSACT.slip_sts_typ,
						S0_SLSACT.ac_ym,
						S0_SLSACT.sls_act_no,
						S0_SLSACT.sls_act_rev,
						S0_SLSACT.sls_act_seq,
						S0_SLSACT.dlv_slip_no,
						S0_SLSACT.ship_act_no,
						S0_SLSACT.sls_dt,
						S0_SLSACT.ac_dt,
						trunc(
							S0_SLSACT.ship_tm,
							MCDateFmt.DD
						).as("ship_dt"),
						S0_SLSACT.ship_tm.as("ship_hm"),
						trunc(
							S0_SLSACT.dlv_tm,
							MCDateFmt.DD
						).as("dlv_dt"),
						S0_SLSACT.dlv_tm.as("dlv_hm"),
						S0_SLSACT.bill_basis_dt,
						S0_SLSACT.cst_cd,
						S0_CST.bp_nm.as("cst_nm"),
						S0_CST.cst_iv_flg,
						S0_SLSACT.sls_basis_typ,
						S0_SLSACT.sls_usr_cd,
						S0_SLSACT.sls_dpt_cd,
						S0_DPT1.dpt_nm.as("sls_dpt_nm"),
						S0_SLSACT.sls_usr_cd.as("cst_usr_cd"),
						S0_SLSACT.sls_dpt_cd.as("cst_dpt_cd"),
						S0_SLSACT.wg_cd,
						S0_SLSACT.trd_cur_cd,
						S0_SLSACT.base_cur_cd,
						nvl(
							S0_SLO.xrate_inpt_flg,
							S0_QTN.xrate_inpt_flg
						).as("xrate_inpt_flg"),
						S0_SLSACT.xrate,
						S0_SLSACT.ptax_cur_cd,
						S0_SLO.ptax_xrate_inpt_flg,
						S0_SLSACT.ptax_xrate,
						S0_SLSACT.qtn_no,
						S0_SLSACT.qtn_rev,
						S0_SLSACT.slo_no,
						S0_SLSACT.cst_po_no,
						cases()
							.when(
								exists(
									subQuery()
									.select(value("X"))
									.from(S1_X)
									.where(
										S1_X.dlv_slip_no.eq(S0_SLSACT.dlv_slip_no)
										.and(
											S1_X.dlv_slip_seq.eq(
												S0_SLSACT.dlv_slip_seq.add(
													decode(
														S0_SLSACT.sls_act_rev,
														S0_T1.pr("max_rev"),
														decode(
															S0_SLSACT.slip_sts_typ,
															value(MAC_SLIP_STS_TYP.DIS.value()),
															value(1),
															value(0)
														),
														value(0)
													)
												)
											)
										)
										.and(S1_X.slip_prnt_flg.eq(value(true)))
									)
								)
							)
								.then(value(true))
							.otherwise(value(false)).as("dlv_slip_prntd_flg"),
						S0_SLSACT.acst_cd,
						S0_SLSACT.ar_dpt_cd,
						S0_DPT2.dpt_nm.as("ar_dpt_nm"),
						S0_IV.pl_skip_flg,
						S0_IV.pl_reg_flg,
						S0_IV.iv_src_typ,
						S0_SLSACT.trd_rmrks,
						S0_SLSACT.intr_rmrks,
						S0_SLSACT.tterm_cd1,
						S0_SLSACT.tterm_rmrks1,
						S0_SLSACT.tterm_cd2,
						S0_SLSACT.tterm_rmrks2,
						S0_SLSACT.tterm_cd3,
						S0_SLSACT.tterm_rmrks3,
						S0_SLSACT.sub_char1,
						S0_SLSACT.sub_char2,
						S0_SLSACT.sub_char3,
						S0_SLSACT.edi_flg,
						S0_CST.bill_crryovr_times.as("cst_bill_crryovr_times"),
						S0_CST.sls_upri_cng_flg,
						S0_CST.sls_amt_rnd_typ,
						S0_CST.sls_upri_rnd_typ,
						S0_CST.sls_tax_rnd_typ,
						S0_CST.ar_dpt_typ,
						S0_SLSACT.ins_usr_id,
						S0_SLSACT.ins_usr_nm,
						S0_SLSACT.ins_func_id,
						S0_SLSACT.ins_ts,
						S0_SLSACT.upd_usr_id,
						S0_SLSACT.upd_usr_nm,
						S0_SLSACT.upd_func_id,
						S0_SLSACT.upd_ts,
						S0_SLSACT.upd_srv_req_no,
						S0_SLSACT.upd_cntr,
						S0_QTN.upd_cntr.as("qtn_upd_cntr"),
						S0_SLO.upd_cntr.as("slo_upd_cntr"),
						S0_IV.upd_cntr.as("iv_upd_cntr"),
						S0_CO.xrate_rnd_typ,
						S0_CO.wtax_rnd_typ,
						S0_CO.sls_xrate_cd.as("xrate_cd"),
						S0_SLSACT.ship_dlv_slip_no,
						bracket(
							S0_SLSACT.dlv_slip_seq.add(
								decode(
									S0_SLSACT.sls_act_rev,
									S0_T1.pr("max_rev"),
									decode(
										S0_SLSACT.slip_sts_typ,
										value(MAC_SLIP_STS_TYP.DIS.value()),
										value(1),
										value(0)
									),
									value(0)
								)
							)
						).as("dlv_slip_seq"),
						S0_IV.iv_mng_no,
						S0_IV.iv_no,
						S0_IV.iv_rev,
						value(true).as("iv_latest_flg"),
						S0_IV.iv_dt,
						S0_IV.iv_prnt_flg,
						S0_IV.trnspt_cd,
						S0_IV.vssl_flght,
						S0_IV.load_port_cd,
						S0_IV.etd_dt,
						S0_IV.dschrg_port_cd,
						S0_IV.eta_dt,
						S0_IV.via_port_cd,
						S0_IV.via_schd_dt,
						S0_IV.tterm_cd1.as("iv_tterm_cd1"),
						S0_IV.tterm_rmrks1.as("iv_tterm_rmrks1"),
						S0_IV.tterm_cd2.as("iv_tterm_cd2"),
						S0_IV.tterm_rmrks2.as("iv_tterm_rmrks2"),
						S0_IV.tterm_cd3.as("iv_tterm_cd3"),
						S0_IV.tterm_rmrks3.as("iv_tterm_rmrks3"),
						S0_SLSACT.rcv_schd_dt,
						S0_IV.lc_no,
						S0_IV.lc_dt,
						S0_IV.lc_rmrks,
						S0_IV.bl_no,
						S0_IV.bl_dt,
						S0_IV.bl_rmrks,
						S0_IV.iv_rmrks,
						S0_IV.case_mrk1,
						S0_IV.case_mrk2,
						S0_IV.case_mrk3,
						S0_IV.case_mrk4,
						S0_IV.case_mrk5,
						S0_IV.case_mrk6,
						S0_IV.intr_rmrks.as("iv_intr_rmrks"),
						S0_IV.sub_char1.as("iv_sub_char1"),
						S0_IV.sub_char2.as("iv_sub_char2"),
						S0_IV.sub_char3.as("iv_sub_char3"),
						S0_SLSACT.bcst_cd.as("join_bcst_cd_")
					)
					.from(
						S0_SLSACT
						.crossJoin(S0_CO)
						.leftOuterJoin(S0_CST).on(
							bracket(
								S0_SLSACT.cst_cd.eq(S0_CST.bp_cd)
							)
						)
						.leftOuterJoin(S0_DPT1).on(
							bracket(
								S0_SLSACT.sls_dpt_cd.eq(S0_DPT1.dpt_cd)
								.and(S0_SLSACT.ac_dt.between(S0_DPT1.st_dt, S0_DPT1.end_dt))
							)
						)
						.leftOuterJoin(S0_DPT2).on(
							bracket(
								S0_SLSACT.ar_dpt_cd.eq(S0_DPT2.dpt_cd)
								.and(S0_SLSACT.ac_dt.between(S0_DPT2.st_dt, S0_DPT2.end_dt))
							)
						)
						.leftOuterJoin(S0_SLO).on(
							bracket(
								S0_SLSACT.slo_no.eq(S0_SLO.slo_no)
							)
						)
						.leftOuterJoin(S0_QTN).on(
							bracket(
								S0_SLSACT.qtn_no.eq(S0_QTN.qtn_no)
								.and(S0_SLSACT.qtn_rev.eq(S0_QTN.qtn_rev))
							)
						)
						.leftOuterJoin(
							subQuery()
							.select(
								S5.sls_act_no,
								max(S5.sls_act_rev).as("max_rev"),
								max(S5.sls_act_seq).as("max_seq")
							)
							.from(S5)
							.groupBy(S5.sls_act_no).view(S0_T1)
						).on(
							bracket(
								S0_SLSACT.sls_act_no.eq(S0_T1.pr(S5.sls_act_no))
							)
						)
						.innerJoin(S0_IV).on(
							bracket(
								S0_SLSACT.iv_no.eq(S0_IV.iv_no)
							)
						)
					)
					.where(
						value(1).eq(value(1))
						.and(
							S0_SLSACT.trd_ptn_typ.in(
								value(MAC_TRD_PTN_TYP.SLS.value()),
								value(MAC_TRD_PTN_TYP.SLS_CNSGN.value())
							)
						)
						.and(S0_CST.cst_iv_flg.eq(value(true)))
						.addDynamicPredicate(REP1)
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
							r.setNumberNE("trd_cur_amt_dec_place", m.amt_dec_place());
							r.setNumberNE("trd_cur_upri_dec_place", m.upri_dec_place());
					}),
					j -> j
						.add(MAM_CUR_R.class, r -> toCondition(
							r.getStringNE("base_cur_cd")
						))
						.addSelect(m -> toArray(
							m.amt_dec_place,
							m.cur_nm,
							m.upri_dec_place
						))
						.addMap((r, m) -> {
							r.setStringNE("base_cur_nm", m.cur_nm());
							r.setNumberNE("base_cur_amt_dec_place", m.amt_dec_place());
							r.setNumberNE("base_cur_upri_dec_place", m.upri_dec_place());
					}),
					j -> j
						.add(MAM_CUR_R.class, r -> toCondition(
							r.getStringNE("ptax_cur_cd")
						))
						.addSelect(m -> toArray(
							m.amt_dec_place,
							m.cur_nm,
							m.upri_dec_place
						))
						.addMap((r, m) -> {
							r.setStringNE("ptax_cur_nm", m.cur_nm());
							r.setNumberNE("ptax_cur_amt_dec_place", m.amt_dec_place());
							r.setNumberNE("ptax_cur_upri_dec_place", m.upri_dec_place());
					}),
					j -> j
						.add(MAM_BP_R.class, r -> toCondition(
							r.getStringNE("acst_cd")
						))
						.addSelect(m -> toArray(
							m.bp_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("acst_nm", m.bp_nm());
					}),
					j -> j
						.add(MAM_BP_R.class, r -> toCondition(
							r.getStringNE("join_bcst_cd_")
						))
						.addSelect(m -> toArray(
							m.bill_cl_typ
						))
						.addMap((r, m) -> {
							r.setStringNE("bill_cl_typ", m.bill_cl_typ());
					}),
					j -> j
						.add(MAM_TTERM_R.class, r -> toCondition(
							r.getStringNE("tterm_cd1")
						))
						.addSelect(m -> toArray(
							m.tterm_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("tterm_nm1", m.tterm_nm());
					}),
					j -> j
						.add(MAM_TTERM_R.class, r -> toCondition(
							r.getStringNE("tterm_cd2")
						))
						.addSelect(m -> toArray(
							m.tterm_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("tterm_nm2", m.tterm_nm());
					}),
					j -> j
						.add(MAM_TTERM_R.class, r -> toCondition(
							r.getStringNE("tterm_cd3")
						))
						.addSelect(m -> toArray(
							m.tterm_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("tterm_nm3", m.tterm_nm());
					})
					,
					j -> j
					.add(MAM_TRNSPT_R.class, r -> toCondition(
						r.getStringNE("trnspt_cd")
					))
					.addSelect(m -> toArray(
						m.trnspt_nm
					))
					.addMap((r, m) -> {
						r.setStringNE("trnspt_nm", m.trnspt_nm());
					}),
					j -> j
						.add(MAM_EXIM_PORT_R.class, r -> toCondition(
							r.getStringNE("load_port_cd")
						))
						.addSelect(m -> toArray(
							m.port_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("load_port_nm", m.port_nm());
					}),
					j -> j
						.add(MAM_EXIM_PORT_R.class, r -> toCondition(
							r.getStringNE("dschrg_port_cd")
						))
						.addSelect(m -> toArray(
							m.port_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("dschrg_port_nm", m.port_nm());
					}),
					j -> j
						.add(MAM_EXIM_PORT_R.class, r -> toCondition(
							r.getStringNE("via_port_cd")
						))
						.addSelect(m -> toArray(
							m.port_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("via_port_nm", m.port_nm());
					}),
					j -> j
						.add(MAM_TTERM_R.class, r -> toCondition(
							r.getStringNE("iv_tterm_cd1")
						))
						.addSelect(m -> toArray(
							m.tterm_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("iv_tterm_nm1", m.tterm_nm());
					}),
					j -> j
						.add(MAM_TTERM_R.class, r -> toCondition(
							r.getStringNE("iv_tterm_cd2")
						))
						.addSelect(m -> toArray(
							m.tterm_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("iv_tterm_nm2", m.tterm_nm());
					}),
					j -> j
						.add(MAM_TTERM_R.class, r -> toCondition(
							r.getStringNE("iv_tterm_cd3")
						))
						.addSelect(m -> toArray(
							m.tterm_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("iv_tterm_nm3", m.tterm_nm());
					})
				)
			);
	}
		
	/*
	 * MSBBL1310_SLS_ACT_S02_WHERE01
	 */
	static MCDynamicSQLInfo MSBBL1310_SLS_ACT_S02_WHERE01() {
		MST_SLS_ACT_R S0_SLSACT = MST_SLS_ACT_R.create("SLSACT");
		MCDynamicSQLID REP1 = createDynamicSQLID("REP1");

		return when(null)
				.predicate(REP1, p -> p.and(S0_SLSACT.sls_act_no.eq(bind("srch_tgt_no"))
						.cutoff$and(S0_SLSACT.slip_sts_typ.eq(value(MAC_SLIP_STS_TYP.CRT.value())).and(bind("latest_flg_str").eq(value(true))))
						.cutoff$and(S0_SLSACT.sls_act_rev.eq(bind("srch_tgt_rev")).and(S0_SLSACT.slip_sts_typ.neq(value(MAC_SLIP_STS_TYP.CAN.value()))))
						));
	}
	
	/*
	 * MSBBL1310_SLS_ACT_S02_WHERE02
	 */
	static MCDynamicSQLInfo MSBBL1310_SLS_ACT_S02_WHERE02() {
		MST_IV_R S0_IV = MST_IV_R.create("IV");
		MST_SLS_ACT_R S0_SLSACT = MST_SLS_ACT_R.create("SLSACT");
		MCDynamicSQLID REP1 = createDynamicSQLID("REP1");

		return when(null)
				.predicate(REP1, p -> p.and(S0_IV.iv_no.eq(bind("srch_tgt_no"))
						.cutoff$and(S0_SLSACT.slip_sts_typ.eq(value(MAC_SLIP_STS_TYP.CRT.value())))
						));
	}
}