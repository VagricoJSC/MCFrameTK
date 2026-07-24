package mcframe.serverMSBE.MSBEL2240;

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
	 * -- MSBEL2240_MST_PURC_SCHD_Query_S01
	 */
	static MCQueryPlan MSBEL2240_MST_PURC_SCHD_S01() {
		MST_PURC_SCHD_R S0_T1 = MST_PURC_SCHD_R.create("T1");
		MST_ARR_PR_R S0_T2 = MST_ARR_PR_R.create("T2");
		MST_PO_D_R S0_T3 = MST_PO_D_R.create("T3");
		MST_PO_R S0_T4 = MST_PO_R.create("T4");
		MST_ARR_SCHD_R S0_T5 = MST_ARR_SCHD_R.create("T5");
		MST_PO_SCHD_R S0_T6 = MST_PO_SCHD_R.create("T6");
		MST_SLO_D_R S0_T8 = MST_SLO_D_R.create("T8");
		MST_SLO_R S0_T7 = MST_SLO_R.create("T7");
		MST_PRMS_RCPT_D_R S0_T10 = MST_PRMS_RCPT_D_R.create("T10");
		MST_DLV_INST_D_R S0_T11 = MST_DLV_INST_D_R.create("T11");
		MAM_ITM_R S0_M2 = MAM_ITM_R.create("M2");
		MAM_DPT_R S0_M8 = MAM_DPT_R.create("M8");
		MAM_BP_R S0_M16 = MAM_BP_R.create("M16");
		MAM_LOC_R S0_M17 = MAM_LOC_R.create("M17");
		MAM_BP_R S0_M20 = MAM_BP_R.create("M20");
		MAM_ITM_LCL_R S0_M24 = MAM_ITM_LCL_R.create("M24");
		MAM_DPT_R S0_M26 = MAM_DPT_R.create("M26");
		MAM_DPT_R S0_M29 = MAM_DPT_R.create("M29");
		MAVM_RD_WG_R S1_DAC = MAVM_RD_WG_R.create("DAC");
		MCDynamicSQLID REP1 = createDynamicSQLID("REP1");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBEL2240_MST_PURC_SCHD_Query_S01")
					.mainQuery()
					.select(
						S0_T5.pr_sts_typ,
						S0_T4.trd_cd,
						S0_T3.po_no,
						S0_T3.po_d_no,
						S0_T1.purc_schd_no,
						S0_T5.arr_schd_no,
						S0_T1.purc_schd_dt,
						trunc(
							S0_T5.arr_schd_tm,
							MCDateFmt.DD
						).as("arr_schd_dt"),
						S0_T5.arr_schd_tm.as("arr_schd_hm"),
						S0_T1.non_purc_flg,
						S0_T3.itm_cd,
						S0_T3.itm_sub1,
						S0_T3.itm_sub2,
						S0_T3.itm_sub3,
						decode(
							S0_T3.sundry_itm_flg,
							value(true),
							S0_T3.itm_nm,
							S0_M2.itm_nm
						).as("itm_nm"),
						decode(
							S0_T3.sundry_itm_flg,
							value(true),
							S0_T3.iv_itm_nm,
							S0_M24.itm_nm
						).as("iv_itm_nm"),
						S0_T5.sundry_itm_flg,
						S0_M2.stk_mng_typ,
						S0_M2.asset_mng_typ,
						S0_M2.dscnt_itm_flg,
						S0_M2.sno1_mng_typ,
						S0_M2.sno2_mng_typ,
						S0_M2.sno3_mng_typ,
						S0_M2.sno4_mng_typ,
						S0_M2.exim_xpns_typ,
						S0_T3.maker_cd,
						S0_T3.trd_unit_cd.as("po_trd_unit_cd"),
						S0_T3.trd_unit_qty.as("po_trd_unit_qty"),
						S0_T3.trd_cur_upri.as("po_trd_cur_upri"),
						S0_T3.trd_cur_dscnt_amt.as("po_trd_cur_dscnt_amt"),
						decode(
								S0_T3.outsrc_flg,
								value(true),
								S0_M20.repurc_obli_flg,
								value(false)
								).as("repurc_obli_flg"),
						S0_T3.trd_cur_proc_upri.as("po_trd_cur_proc_upri"),
						S0_T3.trd_cur_onr_prov_upri.as("po_trd_cur_onr_prov_upri"),
						S0_T3.trd_cur_amt.as("po_trd_cur_amt"),
						S0_T3.trd_cur_proc_amt.as("po_trd_cur_proc_amt"),
						S0_T3.trd_cur_onr_prov_amt.as("po_trd_cur_onr_prov_amt"),
						S0_T3.trd_cur_tax_amt.as("po_trd_cur_tax_amt"),
						S0_T3.trd_cur_amt.add(S0_T3.trd_cur_tax_amt).as("po_trd_cur_inc_ctax_amt"),
						S0_T3.dscnt_rsn_cd,
						S0_T3.wtax_amt.as("po_wtax_amt"),
						S0_T3.wtax_rate,
						S0_T4.sppl_cd,
						S0_M20.purc_amt_rnd_typ,
						S0_M20.purc_tax_rnd_typ,
						S0_T3.interim_flg,
						S0_T3.tax_fix_flg,
						S0_T3.tax_cd,
						S0_T3.trd_cur_tax_amt,
						S0_T4.trd_cur_cd,
						S0_T4.xrate_inpt_flg,
						S0_T4.xrate,
						S0_T4.ptax_xrate_inpt_flg,
						S0_T4.ptax_xrate,
						S0_T3.sppl_itm_cd,
						S0_T3.sppl_itm_nm,
						bracket(
								cases()
									.when(S0_T3.dlv_cd.isNotNull())
										.then(S0_T8.cst_itm_cd)
									.otherwise(nullValue())
							).as("cst_itm_cd"),
						bracket(
								cases()
									.when(S0_T3.dlv_cd.isNotNull())
										.then(S0_T8.cst_itm_nm)
									.otherwise(nullValue())
							).as("cst_itm_nm"),
						S0_T3.purc_id_typ,
						S0_T3.purc_rsn_cd,
						S0_T3.sno1,
						S0_T3.sno2,
						S0_T3.sno3,
						S0_T3.sno4,
						S0_T4.purc_usr_cd,
						S0_T4.purc_dpt_cd,
						S0_M8.dpt_nm.as("purc_dpt_nm"),
						S0_T3.bd_itm_cd,
						S0_T3.bd_itm_sub1,
						S0_T3.bd_itm_sub2,
						S0_T3.bd_itm_sub3,
						S0_T3.bd_sno1,
						S0_T3.bd_sno2,
						S0_T3.bd_sno3,
						S0_T3.bd_sno4,
						S0_T3.bd_loc_cd,
						S0_T3.bd_lot_no,
						S0_T3.bd_sublot_no,
						S0_T3.bd_dpt_cd,
						S0_M29.dpt_nm.as("bd_dpt_nm"),
						S0_T3.bd_ctg_cd,
						S0_T3.bd_oper_cd,
						S0_T3.bd_slo_no,
						S0_T3.bd_iv_no,
						S0_T3.bd_po_no,
						S0_T3.slo_no,
						S0_T3.slo_d_no,
						S0_T4.tterm_cd1.as("purc_tterm_cd1"),
						S0_T4.tterm_rmrks1.as("purc_tterm_rmrks1"),
						S0_T4.tterm_cd2.as("purc_tterm_cd2"),
						S0_T4.tterm_rmrks2.as("purc_tterm_rmrks2"),
						S0_T4.tterm_cd3.as("purc_tterm_cd3"),
						S0_T4.tterm_rmrks3.as("purc_tterm_rmrks3"),
						S0_T3.purc_basis_typ,
						S0_T4.trd_rmrks,
						S0_T4.po_print_rmrks,
						S0_T1.sub_char1,
						S0_T1.sub_char2,
						S0_T1.sub_char3,
						S0_T8.cntry_org_cd,
						S0_T4.wrk_no,
						S0_T3.ap_dpt_cd,
						S0_M26.dpt_nm.as("ap_dpt_nm"),
						S0_T3.po_print_d_rmrks,
						S0_T1.base_unit_cd,
						S0_T3.base_unit_qty.as("po_base_unit_qty"),
						decode(
							S0_T5.arr_skip_flg,
							value(true),
							S0_T1.base_unit_schd_qty,
							S0_T5.base_unit_qty
						).as("arr_schd_qty"),
						S0_T5.wg_cd.as("arr_loc_wg_cd"),
						addDynamicSelect(REP1),
						// this field is appended by sql coverter.
						S0_T8.slo_no.as("join_slo_no_"),
						// this field is appended by sql coverter.
						S0_T3.base_unit_cd.as("join_base_unit_cd_")
					)
					.from(
						S0_T1
						.innerJoin(S0_T2).on(
							bracket(
								S0_T1.arr_pr_no.eq(S0_T2.arr_pr_no)
							)
						)
						.innerJoin(S0_T3).on(
							bracket(
								S0_T2.po_d_no.eq(S0_T3.po_d_no)
							)
						)
						.innerJoin(S0_T4).on(
							bracket(
								S0_T3.po_no.eq(S0_T4.po_no)
							)
						)
						.innerJoin(S0_T5).on(
							bracket(
								S0_T1.arr_schd_no.eq(S0_T5.arr_schd_no)
							)
						)
						.leftOuterJoin(S0_T6).on(
							bracket(
								S0_T3.po_schd_no.eq(S0_T6.po_schd_no)
							)
						)
						.leftOuterJoin(S0_T8).on(
							bracket(
								S0_T6.slo_d_no.eq(S0_T8.slo_d_no)
								.and(S0_T6.dlv_cd.eq(S0_T8.dlv_cd))
							)
						)
						.leftOuterJoin(S0_T10).on(
							bracket(
								S0_T5.prms_rcpt_d_no.eq(S0_T10.prms_rcpt_d_no)
							)
						)
						.leftOuterJoin(S0_T11).on(
							bracket(
								S0_T5.dlv_inst_d_no.eq(S0_T11.dlv_inst_d_no)
								.or(S0_T10.dlv_inst_d_no.eq(S0_T11.dlv_inst_d_no))
							)
						)
						.leftOuterJoin(S0_M2).on(
							bracket(
								S0_T3.itm_cd.eq(S0_M2.itm_cd)
								.and(S0_T3.itm_sub1.eq(S0_M2.itm_sub1))
								.and(S0_T3.itm_sub2.eq(S0_M2.itm_sub2))
								.and(S0_T3.itm_sub3.eq(S0_M2.itm_sub3))
							)
						)
						.leftOuterJoin(S0_M8).on(
							bracket(
								S0_T4.purc_dpt_cd.eq(S0_M8.dpt_cd)
								.and(S0_T4.po_dt.between(S0_M8.st_dt, S0_M8.end_dt))
							)
						)
						.leftOuterJoin(S0_M16).on(
							bracket(
								nvl(
									S0_T11.dlv_cd,
									S0_T3.dlv_cd
								).eq(S0_M16.bp_cd)
							)
						)
						.leftOuterJoin(S0_M17).on(
							bracket(
								S0_T3.in_to_loc_cd.eq(S0_M17.loc_cd)
							)
						)
						.leftOuterJoin(S0_M20).on(
							bracket(
								S0_T4.sppl_cd.eq(S0_M20.bp_cd)
							)
						)
						.leftOuterJoin(S0_M24).on(
							bracket(
								S0_T3.itm_cd.eq(S0_M24.itm_cd)
								.and(S0_T3.itm_sub1.eq(S0_M24.itm_sub1))
								.and(S0_T3.itm_sub2.eq(S0_M24.itm_sub2))
								.and(S0_T3.itm_sub3.eq(S0_M24.itm_sub3))
								.and(S0_M24.lcl_cd.eq(S0_M20.prnt_lcl_cd))
							)
						)
						.leftOuterJoin(S0_M26).on(
							bracket(
								S0_T3.ap_dpt_cd.eq(S0_M26.dpt_cd)
								.and(S0_T4.po_dt.between(S0_M26.st_dt, S0_M26.end_dt))
							)
						)
						.leftOuterJoin(S0_M29).on(
							bracket(
								S0_T3.bd_dpt_cd.eq(S0_M29.dpt_cd)
								.and(S0_T4.po_dt.between(S0_M29.st_dt, S0_M29.end_dt))
							)
						)
						.addDynamicView()
						.addDynamicView(REP1)
					)
					.where(
						value(0).eq(value(0))
						.and(S0_T4.can_flg.eq(value(false)))
						.and(S0_M20.sppl_iv_flg.eq(value(true)))
						.and(S0_T1.abort_flg.eq(value(false)))
						.and(
							S0_T4.aprv_sts_typ.isNull()
							.or(S0_T4.aprv_sts_typ.eq(value(MAC_APRV_STS_TYP.ACPT.value())))
						)
						.and(
							exists(
								subQuery()
								.select(value("X"))
								.from(S1_DAC)
								.where(
									S1_DAC.wg_cd.eq(S0_T4.wg_cd)
								)
							)
						)
						.cutoff$and(
							nvl2(
								S0_T3.dlv_cd,
								value(MSC_IN_TO_ID_TYP.SCST.value()),
								value(MSC_IN_TO_ID_TYP.LOC.value())
							).eq(bind("in_to_id_typ"))
						)
						.cutoff$and(
							nvl2(
								S0_T3.dlv_cd,
								nvl(
									S0_T11.dlv_cd,
									S0_T3.dlv_cd
								),
								S0_T3.in_to_loc_cd
							).eq(bind("in_to_id_cd"))
						)
						.cutoff$and(
							nvl2(
								S0_T11.dlv_cd,
								nvl(
									S0_T11.dlv_nm,
									S0_M16.bp_nm
								),
								nvl2(
									S0_T3.dlv_cd,
									nvl(
										S0_T3.dlv_nm,
										S0_M16.bp_nm
									),
									S0_M17.loc_nm
								)
							).eq(bind("in_to_id_nm"))
						)
						.cutoff$and(
							nvl2(
								S0_T3.dlv_cd,
								nvl2(
									S0_T11.dlv_cd,
									S0_T11.dlv_zip_cd,
									S0_T3.dlv_zip_cd
								),
								MAPA_LOC$F_GET_LOC_ADDR(
									S0_T3.in_to_loc_cd,
									S0_T4.po_dt,
									value(MAC_BP_ADDR_TYP.ZIP_CD.value()),
									nullValue()
								)
							).eq(bind("in_to_zip_cd"))
						)
						.cutoff$and(
							nvl2(
								S0_T3.dlv_cd,
								nvl2(
									S0_T11.dlv_cd,
									S0_T11.dlv_addr1,
									S0_T3.dlv_addr1
								),
								MAPA_LOC$F_GET_LOC_ADDR(
									S0_T3.in_to_loc_cd,
									S0_T4.po_dt,
									value(MAC_BP_ADDR_TYP.ADDR1.value()),
									nullValue()
								)
							).eq(bind("in_to_addr1"))
						)
						.cutoff$and(
							nvl2(
								S0_T3.dlv_cd,
								nvl2(
									S0_T11.dlv_cd,
									S0_T11.dlv_addr2,
									S0_T3.dlv_addr2
								),
								MAPA_LOC$F_GET_LOC_ADDR(
									S0_T3.in_to_loc_cd,
									S0_T4.po_dt,
									value(MAC_BP_ADDR_TYP.ADDR2.value()),
									nullValue()
								)
							).eq(bind("in_to_addr2"))
						)
						.cutoff$and(
							nvl2(
								S0_T3.dlv_cd,
								nvl2(
									S0_T11.dlv_cd,
									S0_T11.dlv_addr3,
									S0_T3.dlv_addr3
								),
								MAPA_LOC$F_GET_LOC_ADDR(
									S0_T3.in_to_loc_cd,
									S0_T4.po_dt,
									value(MAC_BP_ADDR_TYP.ADDR3.value()),
									nullValue()
								)
							).eq(bind("in_to_addr3"))
						)
						.cutoff$and(
							nvl2(
								S0_T3.dlv_cd,
								nvl2(
									S0_T11.dlv_cd,
									S0_T11.dlv_addr4,
									S0_T3.dlv_addr4
								),
								MAPA_LOC$F_GET_LOC_ADDR(
									S0_T3.in_to_loc_cd,
									S0_T4.po_dt,
									value(MAC_BP_ADDR_TYP.ADDR4.value()),
									nullValue()
								)
							).eq(bind("in_to_addr4"))
						)
						.cutoff$and(
							nvl2(
								S0_T3.dlv_cd,
								S0_M16.cntry_cd,
								S0_M17.cntry_cd
							).eq(bind("in_to_cntry_cd"))
						)
						.cutoff$and(
							nvl2(
								S0_T3.dlv_cd,
								nvl2(
									S0_T11.dlv_cd,
									S0_T11.dlv_tel,
									S0_T3.dlv_tel
								),
								MAPA_LOC$F_GET_LOC_ADDR(
									S0_T3.in_to_loc_cd,
									S0_T4.po_dt,
									value(MAC_BP_ADDR_TYP.TEL.value()),
									nullValue()
								)
							).eq(bind("in_to_tel"))
						)
						.cutoff$and(
							nvl2(
								S0_T3.dlv_cd,
								nvl2(
									S0_T11.dlv_cd,
									S0_T11.dlv_fax,
									S0_T3.dlv_fax
								),
								MAPA_LOC$F_GET_LOC_ADDR(
									S0_T3.in_to_loc_cd,
									S0_T4.po_dt,
									value(MAC_BP_ADDR_TYP.FAX.value()),
									nullValue()
								)
							).eq(bind("in_to_fax"))
						)
						.cutoff$and(
							nvl2(
								S0_T11.dlv_cd,
								S0_T11.dlv_cntct_dpt,
								S0_T3.dlv_cntct_dpt
							).eq(bind("in_to_cntct_dpt"))
						)
						.cutoff$and(
							nvl2(
								S0_T11.dlv_cd,
								S0_T11.dlv_cntct_psn,
								S0_T3.dlv_cntct_psn
							).eq(bind("in_to_cntct_psn"))
						)
						.cutoff$and(S0_T4.sppl_cd.eq(bind("sppl_cd")))
						.cutoff$and(S0_T4.trd_cur_cd.eq(bind("trd_cur_cd")))
						.addDynamicPredicate()
						.addDynamicPredicate(REP1)
					)
					.orderBy(
						addDynamicOrderBy(REP1)
					)
			)
			.setDynamicSQLInfo(
				when(boundOr("slo_cur_cd", "cst_cd", "slo_trd_ptn_typ", "sls_basis_typ", "slo_tterm_cd1", "slo_tterm_cd2", "slo_tterm_cd3"))
					.view(v -> v.leftOuterJoin(S0_T7).on(bracket(S0_T8.slo_no.eq(S0_T7.slo_no))))
					.predicate(p -> p.cutoff$and(S0_T7.trd_cur_cd.eq(bind("slo_cur_cd"))).cutoff$and(S0_T7.cst_cd.eq(bind("cst_cd"))).cutoff$and(S0_T7.trd_ptn_typ.eq(bind("slo_trd_ptn_typ"))).cutoff$and(S0_T7.sls_basis_typ.eq(bind("sls_basis_typ"))).cutoff$and(S0_T7.tterm_cd1.eq(bind("slo_tterm_cd1"))).cutoff$and(S0_T7.tterm_cd2.eq(bind("slo_tterm_cd2"))).cutoff$and(S0_T7.tterm_cd3.eq(bind("slo_tterm_cd3"))))
			)
			.setJoinInfo(
				joinInfo(
					j -> j
						.add(MST_SLO_R.class, r -> toCondition(
							r.getStringNE("join_slo_no_")
						))
						.addSelect(m -> toArray(
							m.dschrg_port_cd,
							m.eta_dt,
							m.etd_dt,
							m.load_port_cd,
							m.ptax_xrate,
							m.trnspt_cd,
							m.tterm_rmrks1,
							m.tterm_rmrks2,
							m.tterm_rmrks3,
							m.via_port_cd,
							m.via_schd_dt,
							m.vssl_flght,
							m.xrate
						))
						.addMap((r, m) -> {
							r.setStringNE("trnspt_cd", m.trnspt_cd());
							r.setStringNE("vssl_flght", m.vssl_flght());
							r.setStringNE("load_port_cd", m.load_port_cd());
							r.setDateNE("etd_dt", m.etd_dt());
							r.setStringNE("dschrg_port_cd", m.dschrg_port_cd());
							r.setDateNE("eta_dt", m.eta_dt());
							r.setStringNE("via_port_cd", m.via_port_cd());
							r.setDateNE("via_schd_dt", m.via_schd_dt());
							r.setNumberNE("slo_xrate", m.xrate());
							r.setNumberNE("slo_ptax_xrate", m.ptax_xrate());
							r.setStringNE("slo_tterm_rmrks1", m.tterm_rmrks1());
							r.setStringNE("slo_tterm_rmrks2", m.tterm_rmrks2());
							r.setStringNE("slo_tterm_rmrks3", m.tterm_rmrks3());
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
							r.getStringNE("maker_cd")
						))
						.addSelect(m -> toArray(
							m.bp_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("maker_nm", m.bp_nm());
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
							r.setBooleanNE("inc_tax_flg", m.inc_tax_flg());
							r.setNumberNE("tax_rate", m.tax_rate());
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
							r.setNumberNE("trd_amt_dec_place", m.amt_dec_place());
							r.setNumberNE("trd_upri_dec_place", m.upri_dec_place());
					}),
					j -> j
						.add(MAM_USR_R.class, r -> toCondition(
							r.getStringNE("purc_usr_cd")
						))
						.addSelect(m -> toArray(
							m.usr_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("purc_usr_nm", m.usr_nm());
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
							r.getStringNE("purc_tterm_cd1")
						))
						.addSelect(m -> toArray(
							m.tterm_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("purc_tterm_nm1", m.tterm_nm());
					}),
					j -> j
						.add(MAM_TTERM_R.class, r -> toCondition(
							r.getStringNE("purc_tterm_cd2")
						))
						.addSelect(m -> toArray(
							m.tterm_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("purc_tterm_nm3", m.tterm_nm());
					}),
					j -> j
						.add(MAM_TTERM_R.class, r -> toCondition(
							r.getStringNE("purc_tterm_cd3")
						))
						.addSelect(m -> toArray(
							m.tterm_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("purc_tterm_nm4", m.tterm_nm());
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
							r.getStringNE("trd_unit_cd")
						))
						.addSelect(m -> toArray(
							m.conv_base_qty,
							m.conv_qty,
							m.dec_place,
							m.rnd_typ
						))
						.addMap((r, m) -> {
							r.setNumberNE("trd_unit_conv_qty", m.conv_qty());
							r.setNumberNE("trd_unit_conv_base_qty", m.conv_base_qty());
							r.setNumberNE("trd_unit_dec_place", m.dec_place());
							r.setStringNE("trd_unit_rnd_typ", m.rnd_typ());
							r.setNumberNE("trd_unit_conv_base_qty", m.conv_base_qty());
							r.setNumberNE("trd_unit_conv_qty", m.conv_qty());
					}),
					j -> j
						.add(MAVM_ITM_UNIT_R.class, r -> toCondition(
							r.getStringNE("itm_cd"),
							r.getStringNE("itm_sub1"),
							r.getStringNE("itm_sub2"),
							r.getStringNE("itm_sub3"),
							r.getStringNE("join_base_unit_cd_")
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
						.add(MAVM_ITM_UNIT_R.class, r -> toCondition(
							r.getStringNE("itm_cd"),
							r.getStringNE("itm_sub1"),
							r.getStringNE("itm_sub2"),
							r.getStringNE("itm_sub3"),
							r.getStringNE("po_trd_unit_cd")
						))
						.addSelect(m -> toArray(
							m.conv_base_qty,
							m.conv_qty
						))
						.addMap((r, m) -> {
							r.setNumberNE("po_trd_unit_conv_base_qty", m.conv_base_qty());
							r.setNumberNE("po_trd_unit_conv_qty", m.conv_qty());
					}),
					j -> j
						.add(MAM_BIZ_RSN_R.class, r -> toCondition(
							r.getStringNE("purc_rsn_cd")
						))
						.addSelect(m -> toArray(
							m.biz_rsn_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("purc_rsn_nm", m.biz_rsn_nm());
					}),
					j -> j
						.add(MAM_ITM_R.class, r -> toCondition(
							r.getStringNE("bd_itm_cd"),
							r.getStringNE("bd_itm_sub1"),
							r.getStringNE("bd_itm_sub2"),
							r.getStringNE("bd_itm_sub3")
						))
						.addSelect(m -> toArray(
							m.itm_nm,
							m.lot_mng_typ,
							m.lot_no_typ,
							m.sno1_mng_typ,
							m.sno2_mng_typ,
							m.sno3_mng_typ,
							m.sno4_mng_typ,
							m.sublot_mng_typ,
							m.sublot_no_typ
						))
						.addMap((r, m) -> {
							r.setStringNE("bd_itm_nm", m.itm_nm());
							r.setStringNE("bd_lot_mng_typ", m.lot_mng_typ());
							r.setStringNE("bd_sublot_mng_typ", m.sublot_mng_typ());
							r.setStringNE("bd_lot_no_typ", m.lot_no_typ());
							r.setStringNE("bd_sublot_no_typ", m.sublot_no_typ());
							r.setStringNE("bd_sno1_mng_typ", m.sno1_mng_typ());
							r.setStringNE("bd_sno2_mng_typ", m.sno2_mng_typ());
							r.setStringNE("bd_sno3_mng_typ", m.sno3_mng_typ());
							r.setStringNE("bd_sno4_mng_typ", m.sno4_mng_typ());
					}),
					j -> j
						.add(MAM_LOC_R.class, r -> toCondition(
							r.getStringNE("bd_loc_cd")
						))
						.addSelect(m -> toArray(
							m.loc_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("bd_loc_nm", m.loc_nm());
					}),
					j -> j
						.add(MAM_COST_CTG_R.class, r -> toCondition(
							r.getStringNE("bd_ctg_cd")
						))
						.addSelect(m -> toArray(
							m.ctg_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("bd_ctg_nm", m.ctg_nm());
					}),
					j -> j
						.add(MAM_OPER_R.class, r -> toCondition(
							r.getStringNE("bd_oper_cd")
						))
						.addSelect(m -> toArray(
							m.oper_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("bd_oper_nm", m.oper_nm());
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
					})
				)
			);
	}
	/**
	 * MSBEL2240_MST_PURC_SCHD_S01_WHERE01
	 */
	static MCDynamicSQLInfo MSBEL2240_MST_PURC_SCHD_S01_WHERE01() {
		MST_PURC_SCHD_R S0_T1 = MST_PURC_SCHD_R.create("T1");
		MST_PO_D_R S0_T3 = MST_PO_D_R.create("T3");
		MST_ARR_SCHD_R S0_T5 = MST_ARR_SCHD_R.create("T5");
		MST_RCPT_IV_MAP_R S0_T22 = MST_RCPT_IV_MAP_R.create("T22");
		MST_ARR_ACT_R W1 = MST_ARR_ACT_R.create("W1");
		MST_RCPT_IV_MAP_R W2 = MST_RCPT_IV_MAP_R.create("W2");
		MST_RCPT_IV_D_R W3 = MST_RCPT_IV_D_R.create("W3");
		MCDynamicSQLID REP1 = createDynamicSQLID("REP1");
		
		return when(null)
			.select(REP1,
				nullValue().as("arr_dt"),
				nullValue().as("arr_hm"),
				S0_T1.trd_unit_cd,
				decode(
					S0_T5.arr_skip_flg,
					value(true),
					S0_T1.trd_unit_schd_qty,
					S0_T5.trd_unit_qty
				).as("trd_unit_qty"),
				decode(
					S0_T5.arr_skip_flg,
					value(true),
					S0_T1.base_unit_schd_qty,
					S0_T5.base_unit_qty
				).as("base_unit_qty"),
				decode(
					S0_T5.arr_skip_flg,
					value(true),
					value(0),
					S0_T5.arr_qty
				).as("arr_act_qty"),
				nullValue().as("arr_act_no"),
				nullValue().as("rcpt_iv_no"),
				S0_T5.ins_usr_id,
				S0_T5.ins_usr_nm,
				S0_T5.ins_func_id,
				S0_T5.ins_ts,
				S0_T5.upd_cntr,
				S0_T5.upd_usr_id,
				S0_T5.upd_usr_nm,
				S0_T5.upd_func_id,
				S0_T5.upd_ts,
				S0_T5.upd_srv_req_no
			)
			.view(REP1, v ->
				v.leftOuterJoin(S0_T22).on(
					S0_T22.arr_schd_no.eq(S0_T5.arr_schd_no)
				)
			)
			.predicate(REP1, p ->
				p.and(S0_T5.abort_flg.eq(value(false)))
				.and(
					notExists(subQuery()
						.select(value("x"))
						.from(W3)
						.where(
							W3.rcpt_iv_d_no.eq(S0_T22.rcpt_iv_d_no)
						)
					)
				)
				.and(
					notExists(subQuery()
						.select(value("x"))
						.from(W1
							.innerJoin(W2).on(
								W2.arr_act_no.eq(W1.arr_act_no)
								.and(W2.rcpt_iv_d_no.neq(value(MAC_STR.NULL_VAL.value())))
							)
						)
						.where(
							W1.arr_schd_no.eq(S0_T5.arr_schd_no)
							.and(W1.can_flg.eq(value(false)))
						)
					)
				)
			)
			.orderBy(
				S0_T3.po_no.asc(),
				S0_T3.po_d_no.asc(),
				S0_T5.arr_schd_no.asc()
			);
	}
	/**
	 * MSBEL2240_MST_PURC_SCHD_S01_WHERE02
	 */
	static MCDynamicSQLInfo MSBEL2240_MST_PURC_SCHD_S01_WHERE02() {
		MST_PO_D_R S0_T3 = MST_PO_D_R.create("T3");
		MST_ARR_SCHD_R S0_T5 = MST_ARR_SCHD_R.create("T5");
		MST_ARR_ACT_R S0_T21 = MST_ARR_ACT_R.create("T21");
		MST_RCPT_IV_MAP_R S0_T22 = MST_RCPT_IV_MAP_R.create("T22");
		MST_RCPT_IV_MAP_R S0_T23 = MST_RCPT_IV_MAP_R.create("T23");
		MST_RCPT_IV_MAP_R W1 = MST_RCPT_IV_MAP_R.create("W1");
		MST_RCPT_IV_D_R W2 = MST_RCPT_IV_D_R.create("W2");
		MCDynamicSQLID REP1 = createDynamicSQLID("REP1");
		
		return when(null)
			.select(REP1,
				trunc(
					S0_T21.arr_tm,
					MCDateFmt.DD
				).as("arr_dt"),
				S0_T21.arr_tm.as("arr_hm"),
				S0_T21.trd_unit_cd,
				// 取引単位数量は基準単位数量から算出する
				S0_T21.base_unit_qty.subtract(
					nvl(subQuery()
						.select(sum(W1.base_unit_qty))
						.from(W1)
						.where(
							W1.arr_act_no.eq(S0_T21.arr_act_no)	
							.and(W1.rcpt_iv_d_no.neq(value(MAC_STR.NULL_VAL.value())))
						), value(0))
				).as("base_unit_qty"),
				S0_T21.base_unit_qty.as("arr_act_qty"),
				S0_T21.arr_act_no,
				decode(
					S0_T22.rcpt_iv_d_no,
					value(MAC_STR.NULL_VAL.value()),
					S0_T22.rcpt_iv_no,
					nullValue()
				).as("rcpt_iv_no"),
				S0_T21.ins_usr_id,
				S0_T21.ins_usr_nm,
				S0_T21.ins_func_id,
				S0_T21.ins_ts,
				S0_T21.upd_cntr,
				S0_T21.upd_usr_id,
				S0_T21.upd_usr_nm,
				S0_T21.upd_func_id,
				S0_T21.upd_ts,
				S0_T21.upd_srv_req_no
			)
			.view(REP1, v ->
				v.innerJoin(S0_T21).on(
					S0_T21.arr_schd_no.eq(S0_T5.arr_schd_no)
					.and(S0_T21.can_flg.eq(value(false)))
				)
				// 入荷実績と受領インボイスマップは１対Ｎで紐付く
				.leftOuterJoin(S0_T22).on(
					S0_T22.arr_act_no.eq(S0_T21.arr_act_no)
				)
				// 入荷予定と受領インボイスマップは１対１で紐付く
				.leftOuterJoin(S0_T23).on(
					S0_T23.arr_schd_no.eq(S0_T5.arr_schd_no)
				)
			)
			.predicate(REP1, p ->
				// 入荷予定と紐付け済みは対象外
				p.and(
					notExists(subQuery()
						.select(value("x"))
						.from(W2)
						.where(
							W2.rcpt_iv_d_no.eq(S0_T23.rcpt_iv_d_no)
						)
					)
				)
			)
			.orderBy(
				S0_T3.po_no.asc(),
				S0_T3.po_d_no.asc(),
				S0_T5.arr_schd_no.asc(),
				S0_T21.arr_act_no.asc()
			);
	}
}