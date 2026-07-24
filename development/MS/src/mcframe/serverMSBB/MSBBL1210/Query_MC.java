package mcframe.serverMSBB.MSBBL1210;

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
	 * -- MSBBL1210_MST_QTN_D_Query_S01
	 */
	static MCQueryPlan MSBBL1210_MST_QTN_D_S01() {
		MST_QTN_D_R S0_T1 = MST_QTN_D_R.create("T1");
		MST_QTN_R S0_T2 = MST_QTN_R.create("T2");
		MAM_ITM_R S0_M1 = MAM_ITM_R.create("M1");
		MAM_CO_R S0_M13 = MAM_CO_R.create("M13");
		MAM_BP_R S0_M14 = MAM_BP_R.create("M14");
		MAM_BP_R S0_M15 = MAM_BP_R.create("M15");
		MAM_ITM_LCL_R S0_M16 = MAM_ITM_LCL_R.create("M16");
		MAM_TAX_R S0_M20 = MAM_TAX_R.create("M20");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBBL1210_MST_QTN_D_Query_S01")
					.mainQuery()
					.select(
						S0_T1.qtn_d_no,
						S0_T1.itm_cd,
						S0_T1.itm_sub1,
						S0_T1.itm_sub2,
						S0_T1.itm_sub3,
						nvl(
							S0_T1.itm_nm,
							S0_M1.itm_nm
						).as("itm_nm"),
						S0_M1.dscnt_itm_flg,
						S0_M1.stk_mng_typ,
						S0_M1.asset_mng_typ,
						S0_T1.sundry_itm_flg,
						S0_M1.lot_mng_typ,
						S0_M1.lot_no_typ,
						S0_M1.sublot_mng_typ,
						S0_M1.sublot_no_typ,
						S0_M1.sno1_mng_typ,
						S0_M1.sno2_mng_typ,
						S0_M1.sno3_mng_typ,
						S0_M1.sno4_mng_typ,
						S0_M1.sno1_num_typ,
						S0_M1.sno2_num_typ,
						S0_M1.sno3_num_typ,
						S0_M1.sno4_num_typ,
						S0_M1.slo_sno1_flg,
						S0_M1.slo_sno2_flg,
						S0_M1.slo_sno3_flg,
						S0_M1.slo_sno4_flg,
						S0_M1.bill_crryovr_times.as("itm_bill_crryovr_times"),
						S0_M1.slo_proc_flg,
						S0_M1.sls_upri_cng_flg,
						S0_M1.ver_flg,
						decode(
							S0_M1.sundry_itm_flg,
							value(true),
							S0_T1.iv_itm_nm,
							nvl(
								S0_M16.itm_nm,
								S0_M1.itm_nm
							)
						).as("iv_itm_nm"),
						S0_T1.cntry_org_cd,
						S0_T1.trd_unit_cd,
						S0_T1.trd_unit_qty.as("qtn_trd_unit_qty"),
						S0_T1.trd_unit_qty.subtract(S0_T1.slo_trnst_qty).subtract(S0_T1.sls_trnst_qty).as("trd_unit_qty"),
						S0_T1.base_unit_cd,
						S0_T1.interim_flg,
						S0_T1.trd_cur_upri,
						value(true).as("upri_not_tgt_flg"),
						S0_T1.trd_cur_dscnt_amt,
						S0_T1.dscnt_rsn_cd,
						S0_T1.tax_fix_flg,
						S0_T1.tax_cd,
						S0_T1.cost_upri,
						nvl(
							S0_M1.bill_crryovr_times,
							S0_M15.bill_crryovr_times
						).as("bill_crryovr_times"),
						S0_T1.gd_cd,
						S0_T1.sno1,
						S0_T1.sno2,
						S0_T1.sno3,
						S0_T1.sno4,
						S0_T1.set_itm_grp_no,
						S0_T1.cst_itm_cd,
						S0_T1.cst_itm_nm,
						S0_T1.dlv_cd,
						S0_T1.dlv_sundry_flg,
						nvl(
							S0_T1.dlv_nm,
							S0_M14.bp_nm
						).as("dlv_nm"),
						S0_T1.dlv_cntct_dpt,
						S0_T1.dlv_cntct_psn,
						S0_T1.dlv_zip_cd,
						S0_T1.dlv_addr1,
						S0_T1.dlv_addr2,
						S0_T1.dlv_addr3,
						S0_T1.dlv_addr4,
						S0_T1.dlv_tel,
						S0_T1.dlv_fax,
						S0_M14.cntry_cd.as("dlv_cntry_cd"),
						S0_M14.lg_grp_cd.as("dlv_lg_grp_cd"),
						S0_M14.prnt_lcl_cd,
						S0_M14.tdlv_req_flg,
						S0_M14.pri_prnt_flg,
						S0_T1.dest_cd1,
						S0_T1.dest_cd2,
						S0_T1.dest_cd3,
						value(MAC_VIA_DLV_TYP.NOT_VIA.value()).as("via_dlv_typ"),
						S0_M1.slo_proc_typ.as("def_proc_typ"),
						S0_M1.ship_inst_typ.as("def_ship_inst_typ"),
						nvl(
							S0_M15.ship_schd_split_typ,
							S0_M13.ship_schd_split_typ
						).as("ship_schd_split_typ"),
						nvl(
							S0_M15.sls_upri_req_typ,
							S0_M13.sls_upri_req_typ
						).as("sls_upri_req_typ"),
						S0_M1.ship_term_cd,
						S0_T1.cst_itm_cd,
						S0_T1.cst_itm_nm,
						S0_T1.base_unit_qty.as("init_schd_qty"),
						S0_T1.trd_cur_dscnt_amt.as("init_schd_dscnt_amt"),
						MAPA_TAX$F_GET_WTAX_RATE(
							S0_T1.itm_cd,
							S0_T1.itm_sub1,
							S0_T1.itm_sub2,
							S0_T1.itm_sub3,
							bind("today")
						).as("wtax_rate"),
						S0_M20.tax_cd.as("new_tax_cd"),
						S0_M20.tax_nm.as("new_tax_nm"),
						S0_M20.inc_tax_flg.as("new_inc_tax_flg"),
						S0_M20.tax_rate.as("new_tax_rate")
					)
					.from(
						S0_T1
						.innerJoin(S0_T2).on(
							bracket(
								S0_T2.qtn_no.eq(S0_T1.qtn_no)
								.and(S0_T2.qtn_rev.eq(S0_T1.qtn_rev))
							)
						)
						.leftOuterJoin(S0_M1).on(
							bracket(
								S0_M1.itm_cd.eq(S0_T1.itm_cd)
								.and(S0_M1.itm_sub1.eq(S0_T1.itm_sub1))
								.and(S0_M1.itm_sub2.eq(S0_T1.itm_sub2))
								.and(S0_M1.itm_sub3.eq(S0_T1.itm_sub3))
							)
						)
						.leftOuterJoin(S0_M13).on(value(0).eq(value(0)))
						.leftOuterJoin(S0_M14).on(S0_M14.bp_cd.eq(S0_T1.dlv_cd))
						.leftOuterJoin(S0_M15).on(S0_M15.bp_cd.eq(S0_T2.cst_cd))
						.leftOuterJoin(S0_M16).on(
							bracket(
								S0_M16.itm_cd.eq(S0_T1.itm_cd)
								.and(S0_M16.itm_sub1.eq(S0_T1.itm_sub1))
								.and(S0_M16.itm_sub2.eq(S0_T1.itm_sub2))
								.and(S0_M16.itm_sub3.eq(S0_T1.itm_sub3))
								.and(S0_M16.lcl_cd.eq(S0_M14.prnt_lcl_cd))
							)
						)
						.leftOuterJoin(S0_M20).on(
							bracket(
								MAPA_TAX$F_GET_SLS_TAX_CD(
									S0_T1.itm_cd,
									S0_T1.itm_sub1,
									S0_T1.itm_sub2,
									S0_T1.itm_sub3,
									S0_T2.cst_cd,
									bind("today")
								).eq(S0_M20.tax_cd)
							)
						)
					)
					.where(
						value(0).eq(value(0))
						.and(S0_T1.qtn_no.eq(bind("qtn_no")))
						.and(S0_T1.qtn_rev.eq(bind("qtn_rev")))
						.and(S0_T1.trd_unit_qty.gt(S0_T1.slo_trnst_qty.add(S0_T1.sls_trnst_qty)))
					)
					.orderBy(S0_T1.disp_seq.asc())
			)
			.setJoinInfo(
				joinInfo(
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
							m.dec_place
						))
						.addMap((r, m) -> {
							r.setNumberNE("trd_unit_dec_place", m.dec_place());
							r.setNumberNE("trd_unit_conv_base_qty", m.conv_base_qty());
							r.setNumberNE("trd_unit_conv_qty", m.conv_qty());
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
							r.getStringNE("itm_cd"),
							r.getStringNE("itm_sub1"),
							r.getStringNE("itm_sub2"),
							r.getStringNE("itm_sub3"),
							r.getStringNE("base_unit_cd")
						))
						.addSelect(m -> toArray(
							m.dec_place,
							m.rnd_typ
						))
						.addMap((r, m) -> {
							r.setNumberNE("base_unit_dec_place", m.dec_place());
							r.setStringNE("base_unit_rnd_typ", m.rnd_typ());
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
							r.getStringNE("dlv_cntry_cd")
						))
						.addSelect(m -> toArray(
							m.cntry_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("dlv_cntry_nm", m.cntry_nm());
					}),
					j -> j
						.add(MAM_LG_GRP_R.class, r -> toCondition(
							r.getStringNE("dlv_lg_grp_cd")
						))
						.addSelect(m -> toArray(
							m.lg_grp_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("dlv_lg_grp_nm", m.lg_grp_nm());
					}),
					j -> j
						.add(MAM_SHIP_TERM_R.class, r -> toCondition(
							r.getStringNE("ship_term_cd")
						))
						.addSelect(m -> toArray(
							m.ship_term_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("ship_term_nm", m.ship_term_nm());
					})
				)
			);
	}
	
	/**
	 * -- MSBBL1210_MST_QTN_Query_S01
	 */
	static MCQueryPlan MSBBL1210_MST_QTN_S01() {
		MST_QTN_R S0_T1 = MST_QTN_R.create("T1");
		MAM_DPT_R S0_M3 = MAM_DPT_R.create("M3");
		MAM_BP_R S0_M5 = MAM_BP_R.create("M5");
		MAM_DPT_R S0_M12 = MAM_DPT_R.create("M12");
		MAVM_RD_DPT_R S0_DAC = MAVM_RD_DPT_R.create("DAC");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBBL1210_MST_QTN_Query_S01")
					.mainQuery()
					.select(
						S0_T1.trd_cd,
						S0_T1.trd_ptn_typ,
						S0_T1.qtn_no,
						S0_T1.qtn_rev,
						S0_T1.qtn_typ,
						S0_T1.valid_dt.as("qtn_valid_dt"),
						S0_T1.failure_flg,
						S0_T1.aprv_flg,
						S0_T1.aprv_no,
						S0_T1.aprv_sts_typ,
						S0_T1.cst_cd,
						S0_T1.cst_sundry_flg,
						S0_M5.bp_nm.as("cst_nm"),
						S0_M5.sls_basis_typ,
						S0_M5.sls_upri_cng_flg,
						S0_M5.cst_iv_flg,
						S0_M5.bill_crryovr_times.as("cst_bill_crryovr_times"),
						S0_M5.sls_upri_req_typ,
						S0_M5.ship_schd_split_typ,
						S0_M5.sls_amt_rnd_typ,
						S0_M5.sls_tax_rnd_typ,
						S0_M5.ar_dpt_typ,
						S0_M5.not_lg_mix_flg.as("hdr_not_lg_mix_flg"),
						S0_M5.not_lot_mix_flg.as("hdr_not_lot_mix_flg"),
						S0_M5.not_sublot_mix_flg.as("hdr_not_sublot_mix_flg"),
						S0_T1.sls_usr_cd,
						S0_T1.sls_dpt_cd,
						S0_M3.dpt_nm.as("sls_dpt_nm"),
						S0_T1.wg_cd,
						value(MSC_SHIP_ASSORT_TYP.NON.value()).as("assort_typ"),
						S0_T1.trd_cur_cd,
						S0_T1.xrate_inpt_flg,
						cases()
							.when(S0_T1.xrate_inpt_flg.eq(value(true)))
								.then(S0_T1.xrate)
							.otherwise(
								nvl(
									S0_T1.xrate,
									MAPA_XCHNG$F_GET_SLS_XRATE_NE(
										S0_T1.trd_cur_cd,
										bind("today")
									)
								)
							).as("xrate"),
						S0_T1.wrk_no,
						S0_T1.trnspt_cd,
						S0_T1.tterm_cd1,
						S0_T1.tterm_rmrks1,
						S0_T1.tterm_cd2,
						S0_T1.tterm_rmrks2,
						S0_T1.tterm_cd3,
						S0_T1.tterm_rmrks3,
						S0_M5.acst_cd,
						cases()
							.when(S0_M5.ar_dpt_typ.eq(value(MAC_AR_DPT_TYP.SLS.value())))
								.then(S0_T1.sls_dpt_cd)
							.when(S0_M5.ar_dpt_typ.eq(value(MAC_AR_DPT_TYP.AR.value())))
								.then(
									MAPA_BP$F_GET_AR_DPT_CD_NE(
										S0_M5.bp_cd,
										bind("today"),
										value(false)
									)
							)
							.otherwise(nullValue()).as("ar_dpt_cd"),
						cases()
							.when(S0_M5.ar_dpt_typ.eq(value(MAC_AR_DPT_TYP.SLS.value())))
								.then(S0_M3.dpt_nm)
							.when(S0_M5.ar_dpt_typ.eq(value(MAC_AR_DPT_TYP.AR.value())))
								.then(S0_M12.dpt_nm)
							.otherwise(nullValue()).as("ar_dpt_nm"),
						S0_T1.upd_cntr.as("qtn_upd_cntr")
					)
					.from(
						S0_T1
						.leftOuterJoin(S0_M3).on(
							bracket(
								S0_M3.dpt_cd.eq(S0_T1.sls_dpt_cd)
								.and(bind("today").between(S0_M3.st_dt, S0_M3.end_dt))
							)
						)
						.leftOuterJoin(S0_M5).on(S0_M5.bp_cd.eq(S0_T1.cst_cd))
						.leftOuterJoin(S0_M12).on(
							bracket(
								S0_M12.dpt_cd.eq(MAPA_BP$F_GET_AR_DPT_CD_NE(
										S0_M5.bp_cd,
										bind("today"),
										value(false)
									)
								)
								.and(bind("today").between(S0_M12.st_dt, S0_M12.end_dt))
							)
						)
						.innerJoin(S0_DAC).on(
							bracket(
								S0_DAC.dpt_cd.eq(S0_T1.sls_dpt_cd)
							)
						)
					)
					.where(
						value(0).eq(value(0))
						.and(S0_T1.qtn_no.eq(bind("qtn_no")))
						.and(S0_T1.qtn_rev.eq(bind("qtn_rev")))
						.and(S0_T1.can_flg.eq(value(false)))
						.and(S0_T1.failure_flg.eq(value(false)))
						.and(S0_T1.qtn_typ.eq(value(MSC_QTN_TYP.QTN.value())))
						.and(
							S0_T1.aprv_flg.eq(value(false))
							.or(S0_T1.aprv_sts_typ.eq(value(MAC_APRV_STS_TYP.ACPT.value())))
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
					})
				)
			);
	}
	
	/**
	 * -- MSBBL1210_MST_SHIP_SCHD_Query_S01
	 */
	static MCQueryPlan MSBBL1210_MST_SHIP_SCHD_S01() {
		MST_SHIP_SCHD_R S0_T1 = MST_SHIP_SCHD_R.create("T1");
		MST_SHIP_PR_R S0_T2 = MST_SHIP_PR_R.create("T2");
		MSW_SLO_D_KEY_R S0_W1 = MSW_SLO_D_KEY_R.create("W1");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBBL1210_MST_SHIP_SCHD_Query_S01")
					.mainQuery()
					.select(
						S0_W1.slo_d_no,
						sum(S0_T1.alloc_qty).as("alloc_qty"),
						sum(S0_T1.wait_qty).as("wait_qty"),
						max(S0_T1.not_dt_calc_flg).as("not_dt_calc_flg")
					)
					.from(
						S0_T1
						.innerJoin(S0_T2).on(S0_T2.ship_pr_no.eq(S0_T1.ship_pr_no))
						.innerJoin(S0_W1).on(S0_T2.slo_d_no.eq(S0_W1.slo_d_no))
					)
					.groupBy(S0_W1.slo_d_no)
			);
	}
	/**
	 * -- MSBBL1210_MST_SHIP_SCHD_Query_S02
	 */
	static MCQueryPlan MSBBL1210_MST_SHIP_SCHD_S02() {
		MST_SHIP_SCHD_R S0_SHIPSCHD = MST_SHIP_SCHD_R.create("SHIPSCHD");
		MST_SHIP_PR_R S0_SHIPPR = MST_SHIP_PR_R.create("SHIPPR");
		MSW_SLO_D_KEY_R S0_KEY = MSW_SLO_D_KEY_R.create("KEY");
		
		return createQueryPlan()
			.setQuery(
				sql("MSBBL1210_MST_SHIP_SCHD_Query_S02")
					.mainQuery()
					.select(
						S0_KEY.slo_d_no,
						S0_SHIPSCHD.base_unit_qty,
						S0_SHIPSCHD.ship_inst_qty,
						S0_SHIPSCHD.ship_act_qty,
						S0_SHIPSCHD.sls_qty,
						S0_SHIPSCHD.sls_act_d_no,
						S0_SHIPSCHD.iv_schd_qty
					)
					.from(
						S0_SHIPSCHD
						.innerJoin(S0_SHIPPR).on(S0_SHIPPR.ship_pr_no.eq(S0_SHIPSCHD.ship_pr_no))
						.innerJoin(S0_KEY).on(S0_SHIPPR.slo_d_no.eq(S0_KEY.slo_d_no))
					)
					.where(
						value(0).eq(value(0))
						.and(S0_SHIPPR.ship_inst_typ.neq(value(MAC_SHIP_INST_TYP.NO_PICK.value())))
						.and(S0_SHIPPR.purc_ddlv_flg.eq(value(false)))
					)
			);
	}
	
	/**
	 * -- MSBBL1210_MST_SLO_D_Query_S01
	 */
	static MCQueryPlan MSBBL1210_MST_SLO_D_S01() {
		MST_SLO_D_P_R S0_T1 = MST_SLO_D_P_R.create("T1");
		MST_SLO_P_R S0_T5 = MST_SLO_P_R.create("T5");
		MST_SHIP_PR_R S0_T6 = MST_SHIP_PR_R.create("T6");
		MAM_ITM_R S0_M1 = MAM_ITM_R.create("M1");
		MAM_BP_R S0_M8 = MAM_BP_R.create("M8");
		MAM_BP_R S0_M14 = MAM_BP_R.create("M14");
		MAM_DPT_R S0_M27 = MAM_DPT_R.create("M27");
		MAM_ITM_LCL_R S0_M33 = MAM_ITM_LCL_R.create("M33");
		MAVM_RD_DPT_R S0_DAC = MAVM_RD_DPT_R.create("DAC");
		MST_SHIP_SCHD_R S1_TM = MST_SHIP_SCHD_R.create("TM");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBBL1210_MST_SLO_D_Query_S01")
					.mainQuery()
					.select(
						S0_T1.abort_flg,
						S0_T1.abort_flg.as("org_abort_flg"),
						S0_T6.sls_sts_typ,
						S0_T1.disp_seq,
						S0_T1.slo_d_no,
						S0_T1.itm_cd,
						S0_T1.itm_sub1,
						S0_T1.itm_sub2,
						S0_T1.itm_sub3,
						decode(
							S0_M1.sundry_itm_flg,
							value(true),
							S0_T1.itm_nm,
							S0_M1.itm_nm
						).as("itm_nm"),
						S0_M1.sundry_itm_flg,
						decode(
							S0_M1.sundry_itm_flg,
							value(true),
							S0_T1.iv_itm_nm,
							nvl(
								S0_M33.itm_nm,
								S0_M1.itm_nm
							)
						).as("iv_itm_nm"),
						S0_M1.stk_mng_typ,
						S0_M1.asset_mng_typ,
						S0_M1.lot_mng_typ,
						S0_M1.lot_no_typ,
						S0_M1.sublot_mng_typ,
						S0_M1.sublot_no_typ,
						S0_M1.sno1_mng_typ,
						S0_M1.sno2_mng_typ,
						S0_M1.sno3_mng_typ,
						S0_M1.sno4_mng_typ,
						S0_M1.sno1_num_typ,
						S0_M1.sno2_num_typ,
						S0_M1.sno3_num_typ,
						S0_M1.sno4_num_typ,
						S0_M1.slo_sno1_flg,
						S0_M1.slo_sno2_flg,
						S0_M1.slo_sno3_flg,
						S0_M1.slo_sno4_flg,
						S0_M1.bill_crryovr_times.as("itm_bill_crryovr_times"),
						S0_M1.dscnt_itm_flg,
						S0_M1.slo_proc_flg,
						S0_M1.ver_flg,
						S0_T1.cntry_org_cd,
						S0_T1.vmi_flg,
						S0_T1.trd_unit_cd,
						S0_M1.sls_upri_cng_flg,
						S0_T1.trd_unit_qty,
						S0_T1.trd_cur_upri,
						S0_T1.interim_flg,
						S0_T1.upri_not_tgt_flg,
						S0_T1.cost_upri,
						S0_T1.cost_amt,
						S0_T1.trd_cur_amt,
						S0_T1.trd_cur_tax_amt,
						S0_T1.trd_cur_amt.add(S0_T1.trd_cur_tax_amt).as("trd_cur_inc_tax_amt"),
						S0_T1.trd_cur_dscnt_amt,
						S0_T1.dscnt_rsn_cd,
						S0_T1.iv_upri,
						S0_T1.iv_amt,
						S0_T1.tax_fix_flg,
						S0_T1.tax_cd,
						S0_T1.wtax_rate,
						S0_T1.wtax_amt,
						S0_T1.bill_crryovr_times,
						S0_T1.gd_cd,
						S0_T1.sno1,
						S0_T1.sno2,
						S0_T1.sno3,
						S0_T1.sno4,
						S0_T5.wrk_no,
						S0_T1.sno1_null_flg,
						S0_T1.sno2_null_flg,
						S0_T1.sno3_null_flg,
						S0_T1.sno4_null_flg,
						S0_T1.set_itm_grp_no,
						trunc(
							S0_T1.ship_rqst_tm,
							MCDateFmt.DD
						).as("ship_rqst_dt"),
						S0_T1.ship_rqst_tm.as("ship_rqst_hm"),
						trunc(
							S0_T1.dlv_rqst_tm,
							MCDateFmt.DD
						).as("dlv_rqst_dt"),
						S0_T1.dlv_rqst_tm.as("dlv_rqst_hm"),
						S0_T1.sls_schd_dt,
						S0_T1.accpt_schd_dt,
						S0_T6.ship_schd_split_flg,
						trunc(
							S0_T6.ship_schd_tm,
							MCDateFmt.DD
						).as("ship_schd_dt"),
						S0_T6.ship_schd_tm.as("ship_schd_hm"),
						trunc(
							S0_T6.dlv_schd_tm,
							MCDateFmt.DD
						).as("dlv_schd_dt"),
						S0_T6.dlv_schd_tm.as("dlv_schd_hm"),
						S0_T1.dlv_cd,
						S0_T1.dlv_sundry_flg,
						decode(
							S0_T1.dlv_sundry_flg,
							value(true),
							S0_T1.dlv_nm,
							S0_M8.bp_nm
						).as("dlv_nm"),
						S0_T1.dlv_cntct_dpt.as("dlv_cntct_dpt"),
						S0_T1.dlv_cntct_psn.as("dlv_cntct_psn"),
						S0_T1.dlv_zip_cd.as("dlv_zip_cd"),
						S0_T1.dlv_addr1.as("dlv_addr1"),
						S0_T1.dlv_addr2.as("dlv_addr2"),
						S0_T1.dlv_addr3.as("dlv_addr3"),
						S0_T1.dlv_addr4.as("dlv_addr4"),
						S0_T1.dlv_tel.as("dlv_tel"),
						S0_T1.dlv_fax.as("dlv_fax"),
						S0_M8.cntry_cd.as("dlv_cntry_cd"),
						S0_T1.dlv_lg_grp_cd.as("dlv_lg_grp_cd"),
						S0_T1.pri_prnt_flg,
						S0_M8.prnt_lcl_cd,
						S0_M8.tdlv_req_flg,
						S0_T1.dest_cd1,
						S0_T1.dest_cd2,
						S0_T1.dest_cd3,
						S0_T1.tdlv_cd,
						S0_T1.tdlv_sundry_flg,
						decode(
							S0_T1.tdlv_sundry_flg,
							value(true),
							S0_T1.tdlv_nm,
							S0_M14.bp_nm
						).as("tdlv_nm"),
						S0_T1.via_dlv_typ,
						S0_T1.tdlv_cntct_dpt.as("tdlv_cntct_dpt"),
						S0_T1.tdlv_cntct_psn.as("tdlv_cntct_psn"),
						S0_T1.tdlv_zip_cd.as("tdlv_zip_cd"),
						S0_T1.tdlv_addr1.as("tdlv_addr1"),
						S0_T1.tdlv_addr2.as("tdlv_addr2"),
						S0_T1.tdlv_addr3.as("tdlv_addr3"),
						S0_T1.tdlv_addr4.as("tdlv_addr4"),
						S0_T1.tdlv_tel.as("tdlv_tel"),
						S0_T1.tdlv_fax.as("tdlv_fax"),
						S0_M14.cntry_cd.as("tdlv_cntry_cd"),
						S0_T1.tdlv_lg_grp_cd.as("tdlv_lg_grp_cd"),
						S0_T1.dlv_day_week_typ,
						S0_T1.sls_cststk_flg,
						S0_T1.proc_typ,
						S0_T1.ship_inst_typ,
						S0_T1.ship_schd_split_typ,
						S0_T1.alloc_scope_typ,
						S0_T1.not_lg_mix_flg,
						S0_T1.alloc_typ,
						S0_T1.rqst_to_loc_cd,
						S0_T1.sppl_cd,
						S0_T1.maker_cd,
						S0_T1.rqst_dt,
						S0_T1.rqst_dlv_rqst_dt,
						S0_T1.wg_rqst_cnt_rmrks,
						S0_T1.alloc_grp_cd,
						S0_T1.ship_lg_grp_cd,
						S0_T1.def_loc_cd,
						S0_T1.loc_cd,
						S0_T1.str_ln_cd,
						S0_T1.lot_no,
						S0_T1.sublot_no,
						S0_T1.not_lot_mix_flg,
						S0_T1.not_sublot_mix_flg,
						S0_T1.ver_no,
						S0_T1.ship_term_cd,
						decode(
							bracket(
								subQuery()
								.select(countAll())
								.from(S1_TM)
								.where(
									S1_TM.ship_pr_no.eq(S0_T6.ship_pr_no)
									.and(S1_TM.ship_block_flg.eq(value(true)))
								)
							),
							value(0),
							value(false),
							value(true)
						).as("ship_block_flg"),
						S0_T1.ship_cnt_rmrks,
						S0_T1.cst_po_d_no,
						S0_T1.cst_itm_cd,
						S0_T1.cst_itm_nm,
						S0_T1.cst_po_d_rmrks,
						S0_T1.sls_rsn_cd,
						S0_T1.bd_dpt_cd,
						S0_M27.dpt_nm.as("bd_dpt_nm"),
						S0_T1.sls_upri_req_typ,
						S0_T1.trd_d_rmrks,
						S0_T1.intr_rmrks,
						S0_T1.sub_char1,
						S0_T1.sub_char2,
						S0_T1.sub_char3,
						S0_T1.edi_sub_d_char1,
						S0_T1.edi_sub_d_char2,
						S0_T1.edi_sub_d_char3,
						S0_T1.edi_sub_d_char4,
						S0_T1.edi_sub_d_char5,
						S0_T1.edi_sub_d_num1,
						S0_T1.edi_sub_d_dt1,
						S0_T1.can_rsn_cd,
						S0_T1.slo_d_can_rmkrs,
						S0_T6.ship_cmpl_flg,
						S0_T6.sls_cmpl_flg,
						S0_T1.base_unit_qty,
						S0_T1.base_unit_cd,
						S0_T6.ship_inst_qty,
						S0_T6.ship_act_qty,
						S0_T6.iv_schd_qty,
						S0_T6.iv_act_qty,
						S0_T6.sls_qty,
						S0_T6.ship_ret_qty,
						S0_T6.re_ship_schd_qty,
						S0_T6.ship_schd_abort_qty,
						S0_T6.sls_schd_abort_qty,
						S0_T6.base_unit_qty.as("ship_pr_base_unit_qty"),
						nullValue().as("answerd_flg"),
						S0_T1.qtn_d_no,
						S0_T6.upd_cntr.as("ship_pr_upd_cntr"),
						S0_T6.ship_pr_no
					)
					.from(
						S0_T1
						.innerJoin(S0_T5).on(
							bracket(
								S0_T1.slo_no.eq(S0_T5.slo_no)
								.and(S0_T1.slo_rev.eq(S0_T5.slo_rev))
							)
						)
						.leftOuterJoin(S0_T6).on(
							bracket(
								S0_T1.slo_d_no.eq(S0_T6.slo_d_no)
							)
						)
						.leftOuterJoin(S0_M1).on(
							bracket(
								S0_T1.itm_cd.eq(S0_M1.itm_cd)
								.and(S0_T1.itm_sub1.eq(S0_M1.itm_sub1))
								.and(S0_T1.itm_sub2.eq(S0_M1.itm_sub2))
								.and(S0_T1.itm_sub3.eq(S0_M1.itm_sub3))
							)
						)
						.leftOuterJoin(S0_M8).on(
							bracket(
								S0_T1.dlv_cd.eq(S0_M8.bp_cd)
							)
						)
						.leftOuterJoin(S0_M14).on(
							bracket(
								S0_T1.tdlv_cd.eq(S0_M14.bp_cd)
							)
						)
						.leftOuterJoin(S0_M27).on(
							bracket(
								S0_T1.bd_dpt_cd.eq(S0_M27.dpt_cd)
								.and(S0_T5.slo_dt.between(S0_M27.st_dt, S0_M27.end_dt))
							)
						)
						.leftOuterJoin(S0_M33).on(
							bracket(
								S0_T1.itm_cd.eq(S0_M33.itm_cd)
								.and(S0_T1.itm_sub1.eq(S0_M33.itm_sub1))
								.and(S0_T1.itm_sub2.eq(S0_M33.itm_sub2))
								.and(S0_T1.itm_sub3.eq(S0_M33.itm_sub3))
								.and(S0_M8.prnt_lcl_cd.eq(S0_M33.lcl_cd))
							)
						)
						.innerJoin(S0_DAC).on(
							bracket(
								S0_DAC.dpt_cd.eq(S0_T5.sls_dpt_cd)
							)
						)
					)
					.where(
						value(1).eq(value(1))
						.and(S0_T1.slo_no.eq(bind("slo_no")))
						.and(S0_T1.slo_rev.eq(bind("slo_rev")))
						.and(S0_T1.can_flg.eq(value(false)))
					)
					.orderBy(S0_T1.disp_seq.asc())
			)
			.setJoinInfo(
				joinInfo(
					j -> j
						.add(MST_QTN_D_R.class, r -> toCondition(
							r.getStringNE("qtn_d_no")
						))
						.addSelect(m -> toArray(
							m.base_unit_qty,
							m.trd_cur_dscnt_amt
						))
						.addMap((r, m) -> {
							r.setNumberNE("init_schd_qty", m.base_unit_qty());
							r.setNumberNE("init_schd_dscnt_amt", m.trd_cur_dscnt_amt());
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
							m.dec_place
							,m.rnd_typ
						))
						.addMap((r, m) -> {
							r.setNumberNE("trd_unit_dec_place", m.dec_place());
							r.setNumberNE("trd_unit_conv_base_qty", m.conv_base_qty());
							r.setNumberNE("trd_unit_conv_qty", m.conv_qty());
							r.setStringNE("trd_unit_rnd_typ", m.rnd_typ());
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
							r.setNumberNE("tax_rate", m.tax_rate());
							r.setBooleanNE("inc_tax_flg", m.inc_tax_flg());
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
						.add(MAM_LG_GRP_R.class, r -> toCondition(
							r.getStringNE("dlv_lg_grp_cd")
						))
						.addSelect(m -> toArray(
							m.lg_grp_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("dlv_lg_grp_nm", m.lg_grp_nm());
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
						.add(MAM_LG_GRP_R.class, r -> toCondition(
							r.getStringNE("tdlv_lg_grp_cd")
						))
						.addSelect(m -> toArray(
							m.lg_grp_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("tdlv_lg_grp_nm", m.lg_grp_nm());
					}),
					j -> j
						.add(MAM_LOC_R.class, r -> toCondition(
							r.getStringNE("rqst_to_loc_cd")
						))
						.addSelect(m -> toArray(
							m.loc_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("rqst_to_loc_nm", m.loc_nm());
					}),
					j -> j
						.add(MAM_BP_R.class, r -> toCondition(
							r.getStringNE("sppl_cd")
						))
						.addSelect(m -> toArray(
							m.bp_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("sppl_nm", m.bp_nm());
					}),
					j -> j
						.add(MAM_BP_R.class, r -> toCondition(
							r.getStringNE("maker_cd")
						))
						.addSelect(m -> toArray(
							m.bp_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("maker_nm", m.bp_nm());
					}),
					j -> j
						.add(MAM_ALLOC_GRP_R.class, r -> toCondition(
							r.getStringNE("alloc_grp_cd")
						))
						.addSelect(m -> toArray(
							m.alloc_grp_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("alloc_grp_nm", m.alloc_grp_nm());
					}),
					j -> j
						.add(MAM_LG_GRP_R.class, r -> toCondition(
							r.getStringNE("ship_lg_grp_cd")
						))
						.addSelect(m -> toArray(
							m.lg_grp_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("ship_lg_grp_nm", m.lg_grp_nm());
					}),
					j -> j
						.add(MAM_LOC_R.class, r -> toCondition(
							r.getStringNE("def_loc_cd")
						))
						.addSelect(m -> toArray(
							m.loc_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("def_loc_nm", m.loc_nm());
					}),
					j -> j
						.add(MAM_LOC_R.class, r -> toCondition(
							r.getStringNE("loc_cd")
						))
						.addSelect(m -> toArray(
							m.loc_nm,
							m.str_ln_tgt_flg,
							m.wg_cd
						))
						.addMap((r, m) -> {
							r.setStringNE("loc_nm", m.loc_nm());
							r.setBooleanNE("str_ln_tgt_flg", m.str_ln_tgt_flg());
							r.setStringNE("wg_cd", m.wg_cd());
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
						.add(MAM_SHIP_TERM_R.class, r -> toCondition(
							r.getStringNE("ship_term_cd")
						))
						.addSelect(m -> toArray(
							m.ship_term_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("ship_term_nm", m.ship_term_nm());
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
						.add(MST_SLO_RSN_R.class, r -> toCondition(
							r.getStringNE("can_rsn_cd")
						))
						.addSelect(m -> toArray(
							m.slo_rsn_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("can_rsn_nm", m.slo_rsn_nm());
					}),
					j -> j
						.add(MAVM_ITM_UNIT_R.class, r -> toCondition(
							r.getStringNE("itm_cd"),
							r.getStringNE("itm_sub1"),
							r.getStringNE("itm_sub2"),
							r.getStringNE("itm_sub3"),
							r.getStringNE("base_unit_cd")
						))
						.addSelect(m -> toArray(
							m.dec_place,
							m.rnd_typ
						))
						.addMap((r, m) -> {
							r.setNumberNE("base_unit_dec_place", m.dec_place());
							r.setStringNE("base_unit_rnd_typ", m.rnd_typ());
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
						.add(MAM_CNTRY_R.class, r -> toCondition(
							r.getStringNE("dlv_cntry_cd")
						))
						.addSelect(m -> toArray(
							m.cntry_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("dlv_cntry_nm", m.cntry_nm());
					}),
					j -> j
						.add(MAM_CNTRY_R.class, r -> toCondition(
							r.getStringNE("tdlv_cntry_cd")
						))
						.addSelect(m -> toArray(
							m.cntry_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("tdlv_cntry_nm", m.cntry_nm());
					})
				)
			);
	}
	
	/**
	 * -- MSBBL1210_MST_SLO_D_Query_S02
	 */
	static MCQueryPlan MSBBL1210_MST_SLO_D_S02() {
		MST_SLO_D_R S0_T1 = MST_SLO_D_R.create("T1");
		MST_SLO_R S0_T2 = MST_SLO_R.create("T2");
		MST_SHIP_PR_R S0_T3 = MST_SHIP_PR_R.create("T3");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBBL1210_MST_SLO_D_Query_S02")
					.mainQuery()
					.select(
						S0_T3.sls_sts_typ,
						S0_T1.disp_seq,
						S0_T1.slo_d_no,
						S0_T1.sno1,
						S0_T1.sno2,
						S0_T1.sno3,
						S0_T1.sno4,
						S0_T1.sls_schd_dt,
						S0_T1.accpt_schd_dt,
						S0_T3.ship_schd_split_flg,
						trunc(
							S0_T3.ship_schd_tm,
							MCDateFmt.DD
						).as("ship_schd_dt"),
						S0_T3.ship_schd_tm.as("ship_schd_hm"),
						trunc(
							S0_T3.dlv_schd_tm,
							MCDateFmt.DD
						).as("dlv_schd_dt"),
						S0_T3.dlv_schd_tm.as("dlv_schd_hm"),
						S0_T1.alloc_scope_typ,
						S0_T1.alloc_typ,
						S0_T1.rqst_to_loc_cd,
						S0_T1.sppl_cd,
						S0_T1.maker_cd,
						S0_T1.rqst_dt,
						S0_T1.rqst_dlv_rqst_dt,
						S0_T1.alloc_grp_cd,
						S0_T1.ship_lg_grp_cd,
						S0_T1.def_loc_cd,
						S0_T1.loc_cd,
						S0_T1.str_ln_cd,
						S0_T3.base_unit_qty.as("ship_pr_base_unit_qty"),
						S0_T3.ship_inst_qty,
						S0_T3.ship_act_qty,
						S0_T3.iv_schd_qty,
						S0_T3.iv_act_qty,
						S0_T3.sls_qty,
						S0_T3.ship_ret_qty,
						S0_T3.re_ship_schd_qty,
						S0_T3.ship_schd_abort_qty,
						S0_T3.sls_schd_abort_qty
					)
					.from(
						S0_T1
						.innerJoin(S0_T2).on(S0_T2.slo_no.eq(S0_T1.slo_no))
						.innerJoin(S0_T3).on(S0_T3.slo_d_no.eq(S0_T1.slo_d_no))
					)
					.where(
						value(0).eq(value(0))
						.and(S0_T2.slo_no.eq(bind("slo_no")))
						.and(S0_T1.can_flg.eq(value(false)))
					)
			)
			.setJoinInfo(
				joinInfo(
					j -> j
						.add(MAM_LOC_R.class, r -> toCondition(
							r.getStringNE("rqst_to_loc_cd")
						))
						.addSelect(m -> toArray(
							m.loc_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("rqst_to_loc_nm", m.loc_nm());
					}),
					j -> j
						.add(MAM_BP_R.class, r -> toCondition(
							r.getStringNE("sppl_cd")
						))
						.addSelect(m -> toArray(
							m.bp_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("sppl_nm", m.bp_nm());
					}),
					j -> j
						.add(MAM_BP_R.class, r -> toCondition(
							r.getStringNE("maker_cd")
						))
						.addSelect(m -> toArray(
							m.bp_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("maker_nm", m.bp_nm());
					}),
					j -> j
						.add(MAM_ALLOC_GRP_R.class, r -> toCondition(
							r.getStringNE("alloc_grp_cd")
						))
						.addSelect(m -> toArray(
							m.alloc_grp_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("alloc_grp_nm", m.alloc_grp_nm());
					}),
					j -> j
						.add(MAM_LG_GRP_R.class, r -> toCondition(
							r.getStringNE("ship_lg_grp_cd")
						))
						.addSelect(m -> toArray(
							m.lg_grp_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("ship_lg_grp_nm", m.lg_grp_nm());
					}),
					j -> j
						.add(MAM_LOC_R.class, r -> toCondition(
							r.getStringNE("def_loc_cd")
						))
						.addSelect(m -> toArray(
							m.loc_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("def_loc_nm", m.loc_nm());
					}),
					j -> j
						.add(MAM_LOC_R.class, r -> toCondition(
							r.getStringNE("loc_cd")
						))
						.addSelect(m -> toArray(
							m.loc_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("loc_nm", m.loc_nm());
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
	 * -- MSBBL1210_MST_SLO_Query_S01
	 */
	static MCQueryPlan MSBBL1210_MST_SLO_S01() {
		MST_SLO_P_R S0_T1 = MST_SLO_P_R.create("T1");
		MBT_APRV_R S0_T2 = MBT_APRV_R.create("T2");
		MAM_DPT_R S0_M5 = MAM_DPT_R.create("M5");
		MAM_CO_R S0_M8 = MAM_CO_R.create("M8");
		MAM_DPT_R S0_M18 = MAM_DPT_R.create("M18");
		MAVM_RD_DPT_R S0_DAC = MAVM_RD_DPT_R.create("DAC");
		MAM_CO_R S0_CO = MAM_CO_R.create("CO");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBBL1210_MST_SLO_Query_S01")
					.mainQuery()
					.select(
						S0_T1.trd_cd,
						S0_T1.slo_no,
						S0_T1.slo_rev,
						S0_T1.slo_dt,
						S0_T1.slo_typ,
						S0_T1.aprv_flg,
						S0_T1.aprv_no,
						S0_T1.aprv_sts_typ,
						S0_T2.aprv_upd_flg,
						S0_T2.aprv_can_flg,
						S0_T1.qtn_no,
						S0_T1.qtn_rev,
						S0_T1.cst_cd,
						S0_T1.sls_basis_typ,
						S0_T1.sls_usr_cd,
						S0_T1.sls_dpt_cd,
						S0_M5.dpt_nm.as("sls_dpt_nm"),
						S0_T1.sls_usr_cd.as("cst_usr_cd"),
						S0_T1.sls_dpt_cd.as("cst_dpt_cd"),
						S0_T1.ar_dpt_cd.as("lnk_ar_dpt_cd"),
						S0_T1.wg_cd,
						S0_T1.assort_typ,
						S0_T1.trd_cur_cd,
						S0_T1.xrate_inpt_flg,
						S0_T1.xrate,
						S0_M8.base_cur_cd,
						S0_M8.ptax_cur_cd,
						S0_T1.ptax_xrate_inpt_flg,
						S0_T1.ptax_xrate,
						S0_CO.xrate_rnd_typ,
						S0_CO.wtax_rnd_typ,
						S0_T1.wrk_no,
						S0_T1.trnspt_cd,
						S0_T1.vssl_flght,
						S0_T1.load_port_cd,
						S0_T1.etd_dt,
						S0_T1.dschrg_port_cd,
						S0_T1.eta_dt,
						S0_T1.via_port_cd,
						S0_T1.via_schd_dt,
						S0_T1.iv_no,
						S0_T1.adv_ship_ctrl_typ,
						S0_T1.adv_bill_amt,
						S0_T1.adv_rcv_amt,
						S0_T1.tterm_cd1,
						S0_T1.tterm_rmrks1,
						S0_T1.tterm_cd2,
						S0_T1.tterm_rmrks2,
						S0_T1.tterm_cd3,
						S0_T1.tterm_rmrks3,
						S0_T1.cst_po_no,
						S0_T1.cst_po_rev,
						S0_T1.ar_dpt_cd,
						S0_M18.dpt_nm.as("ar_dpt_nm"),
						S0_T1.rcpt_dt,
						S0_T1.rcpt_usr_cd,
						S0_T1.cst_po_rmrks,
						S0_T1.trd_rmrks,
						S0_T1.intr_rmrks,
						S0_T1.sub_char1,
						S0_T1.sub_char2,
						S0_T1.sub_char3,
						S0_T1.edi_sub_char1,
						S0_T1.edi_sub_char2,
						S0_T1.edi_sub_char3,
						S0_T1.edi_sub_char4,
						S0_T1.edi_sub_char5,
						S0_T1.edi_sub_num1,
						S0_T1.edi_sub_dt1,
						S0_T1.can_rsn_cd,
						S0_T1.edi_flg,
						S0_T1.can_flg,
						S0_T1.can_rmrks,
						S0_T1.aprv_flg.as("old_aprv_flg"),
						S0_T1.aprv_no.as("old_aprv_no"),
						S0_T1.aprv_sts_typ.as("old_aprv_sts_typ"),
						S0_T2.aprv_upd_flg.as("old_can_upd_flg"),
						S0_T2.aprv_can_flg.as("old_can_del_flg"),
						S0_T1.ins_usr_id,
						S0_T1.ins_usr_nm,
						S0_T1.ins_func_id,
						S0_T1.ins_ts,
						S0_T1.upd_usr_id,
						S0_T1.upd_usr_nm,
						S0_T1.upd_func_id,
						S0_T1.upd_ts,
						S0_T1.upd_srv_req_no,
						S0_T1.sls_basis_typ.as("bp_sls_basis_typ")
					)
					.from(
						S0_T1
						.leftOuterJoin(S0_T2).on(
							bracket(
								S0_T1.aprv_no.eq(S0_T2.aprv_no)
								.and(S0_T2.can_flg.eq(value(false)))
							)
						)
						.leftOuterJoin(S0_M5).on(
							bracket(
								S0_T1.sls_dpt_cd.eq(S0_M5.dpt_cd)
								.and(S0_T1.slo_dt.between(S0_M5.st_dt, S0_M5.end_dt))
							)
						)
						.leftOuterJoin(S0_M8).on(
							bracket(
								value(1).eq(value(1))
							)
						)
						.leftOuterJoin(S0_M18).on(
							bracket(
								S0_T1.ar_dpt_cd.eq(S0_M18.dpt_cd)
								.and(S0_T1.slo_dt.between(S0_M18.st_dt, S0_M18.end_dt))
							)
						)
						.innerJoin(S0_DAC).on(
							bracket(
								S0_DAC.dpt_cd.eq(S0_T1.sls_dpt_cd)
							)
						)
						.crossJoin(S0_CO)
					)
					.where(
						value(1).eq(value(1))
						.and(S0_T1.slo_no.eq(bind("slo_no")))
						.and(S0_T1.slo_rev.eq(bind("slo_rev")))
					)
			)
			.setJoinInfo(
				joinInfo(
					j -> j
						.add(MST_SLO_R.class, r -> toCondition(
							r.getStringNE("slo_no")
						))
						.addSelect(m -> toArray(
							m.upd_cntr
						))
						.addMap((r, m) -> {
							r.setNumberNE("slo_upd_cntr", m.upd_cntr());
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
						.add(MST_QTN_R.class, r -> toCondition(
							r.getStringNE("qtn_no"),
							r.getNumberNE("qtn_rev")
						))
						.addSelect(m -> toArray(
							m.upd_cntr
						))
						.addMap((r, m) -> {
							r.setNumberNE("qtn_upd_cntr", m.upd_cntr());
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
						.add(MAM_BP_R.class, r -> toCondition(
							r.getStringNE("cst_cd")
						))
						.addSelect(m -> toArray(
							m.acst_cd,
							m.ar_dpt_typ,
							m.bill_crryovr_times,
							m.bp_nm,
							m.cntry_cd,
							m.cst_iv_flg,
							m.ship_schd_split_typ,
							m.sls_amt_rnd_typ,
							m.sls_tax_rnd_typ,
							m.sls_upri_cng_flg,
							m.sls_upri_req_typ,
							m.not_lg_mix_flg,
							m.not_lot_mix_flg,
							m.not_sublot_mix_flg
						))
						.addMap((r, m) -> {
							r.setStringNE("cst_nm", m.bp_nm());
							r.setStringNE("ar_dpt_typ", m.ar_dpt_typ());
							r.setStringNE("cntry_cd", m.cntry_cd());
							r.setBooleanNE("sls_upri_cng_flg", m.sls_upri_cng_flg());
							r.setBooleanNE("cst_iv_flg", m.cst_iv_flg());
							r.setNumberNE("cst_bill_crryovr_times", m.bill_crryovr_times());
							r.setStringNE("sls_upri_req_typ", m.sls_upri_req_typ());
							r.setStringNE("ship_schd_split_typ", m.ship_schd_split_typ());
							r.setStringNE("sls_amt_rnd_typ", m.sls_amt_rnd_typ());
							r.setStringNE("sls_tax_rnd_typ", m.sls_tax_rnd_typ());
							r.setStringNE("acst_cd", m.acst_cd());
							r.setBooleanNE("hdr_not_lg_mix_flg", m.not_lg_mix_flg());
							r.setBooleanNE("hdr_not_lot_mix_flg", m.not_lot_mix_flg());
							r.setBooleanNE("hdr_not_sublot_mix_flg", m.not_sublot_mix_flg());
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
					}),
					j -> j
						.add(MAM_USR_R.class, r -> toCondition(
							r.getStringNE("rcpt_usr_cd")
						))
						.addSelect(m -> toArray(
							m.usr_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("rcpt_usr_nm", m.usr_nm());
					}),
					j -> j
						.add(MST_SLO_RSN_R.class, r -> toCondition(
							r.getStringNE("can_rsn_cd")
						))
						.addSelect(m -> toArray(
							m.slo_rsn_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("can_rsn_nm", m.slo_rsn_nm());
					})
				)
			);
	}
}