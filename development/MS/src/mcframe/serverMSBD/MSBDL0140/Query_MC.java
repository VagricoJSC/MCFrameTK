package mcframe.serverMSBD.MSBDL0140;

import mcframe.commonCore.lang.MCNumber;
import mcframe.commonCore.lang.MCDate;
import mcframe.commonCore.lang.MCTimestamp;

import mcframe.serverCore.cache.MCJoinerList;

import static mcframe.commonCore.util.MCCollectionUtil.*;
import static mcframe.serverCore.cache.MCJoinerList.*;
import static mcframe.serverCore.queryapi.IFMCSQL.*;
import static mcframe.serverCore.queryapi.MCQueryExecution.*;
import static mcframe.serverMAUC.MAUCL0020.MAUCL_AppSys.*;

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
	 * -- MSBDL0140_MST_PO_Query_S01
	 */
	static MCQueryPlan MSBDL0140_MST_PO_S01() {
		MST_PO_R S0_T1 = MST_PO_R.create("T1");
		MAM_DPT_R S0_M2 = MAM_DPT_R.create("M2");
		MAM_BP_R S0_M5 = MAM_BP_R.create("M5");
		MAVM_RD_DPT_R S0_M14 = MAVM_RD_DPT_R.create("M14");

		return createQueryPlan()
			.setQuery(
				sql("MSBDL0140_MST_PO_Query_S01")
					.mainQuery()
					.select(
						S0_T1.po_no,
						S0_T1.trd_cd,
						S0_T1.trd_ptn_typ,
						S0_T1.purc_dpt_cd,
						S0_M2.dpt_nm.as("purc_dpt_nm"),
						S0_M2.ap_dpt_flg,
						S0_T1.wg_cd.as("purc_dpt_wg_cd"),
						S0_T1.purc_usr_cd,
						S0_T1.sppl_cd,
						S0_M5.bp_nm.as("sppl_nm"),
						S0_M5.subcon_flg,
						S0_M5.repurc_obli_flg,
						nvl(S0_M5.outsrc_upri_typ, value(getCo().outsrc_upri_typ())).as("outsrc_upri_typ"),
						S0_M5.cntry_cd.as("sppl_cntry_cd"),
						S0_M5.sppl_iv_flg,
						S0_M5.purc_amt_rnd_typ,
						S0_M5.purc_tax_rnd_typ,
						S0_M5.pay_crryovr_times,
						MAPA_BP$F_GET_AP_DPT_CD_NE(
							S0_M5.asppl_cd,
							FCPA_DATE_UTIL$F_GET_TODAY1(),
							value(false)
						).as("mst_ap_dpt_cd"),
						MAPA_BP$F_GET_AP_DPT_CD_NE2(
							S0_T1.sppl_cd,
							S0_M5.asppl_cd,
							FCPA_DATE_UTIL$F_GET_TODAY1(),
							value(false)
						).as("ap_dpt_cd"),
						S0_M5.prnt_lcl_cd,
						S0_M5.purc_tax_calc_typ,
						S0_T1.sppl_cntct_dpt,
						S0_T1.sppl_cntct_psn,
						S0_T1.sppl_tel,
						S0_T1.sppl_fax,
						S0_M5.sppl_iv_flg,
						S0_M5.purc_slip_each_lot_typ,
						S0_M5.asppl_cd,
						S0_T1.trd_cur_cd,
						S0_T1.trd_cur_cd.as("src_trd_cur_cd"),
						S0_T1.xrate,
						S0_T1.xrate_inpt_flg,
						S0_T1.ptax_xrate,
						S0_T1.ptax_xrate_inpt_flg,
						S0_T1.tterm_cd1,
						S0_T1.tterm_rmrks1,
						S0_T1.tterm_cd2,
						S0_T1.tterm_rmrks2,
						S0_T1.tterm_cd3,
						S0_T1.tterm_rmrks3,
						S0_T1.trd_rmrks,
						S0_T1.po_print_rmrks,
						S0_T1.ins_usr_id,
						S0_T1.ins_usr_nm,
						S0_T1.ins_ts,
						S0_T1.ins_func_id,
						S0_T1.upd_cntr,
						S0_T1.upd_usr_id,
						S0_T1.upd_usr_nm,
						S0_T1.upd_ts,
						S0_T1.upd_func_id,
						S0_T1.upd_srv_req_no
					)
					.from(
						S0_T1
						.leftOuterJoin(S0_M2).on(
							bracket(
								S0_T1.purc_dpt_cd.eq(S0_M2.dpt_cd)
								.and(S0_T1.po_dt.between(S0_M2.st_dt, S0_M2.end_dt))
							)
						)
						.leftOuterJoin(S0_M5).on(
							bracket(
								S0_T1.sppl_cd.eq(S0_M5.bp_cd)
							)
						)
						.innerJoin(S0_M14).on(
							bracket(
								S0_T1.purc_dpt_cd.eq(S0_M14.dpt_cd)
							)
						)
					)
					.where(
						value(0).eq(value(0))
						.and(S0_T1.po_no.eq(bind("po_no")))
						.and(S0_T1.can_flg.eq(value(false)))
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
						.add(MAM_WG_R.class, r -> toCondition(
							r.getStringNE("purc_dpt_wg_cd")
						))
						.addSelect(m -> toArray(
							m.wg_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("purc_dpt_wg_nm", m.wg_nm());
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
						.add(MAM_BP_R.class, r -> toCondition(
							r.getStringNE("asppl_cd")
						))
						.addSelect(m -> toArray(
							m.bp_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("asppl_nm", m.bp_nm());
					}),
					j -> j
						.add(MAM_CNTRY_R.class, r -> toCondition(
							r.getStringNE("sppl_cntry_cd")
						))
						.addSelect(m -> toArray(
							m.cntry_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("sppl_cntry_nm", m.cntry_nm());
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
							r.setNumberNE("trd_cur_upri_dec_place", m.upri_dec_place());
							r.setNumberNE("trd_cur_amt_dec_place", m.amt_dec_place());
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
	 * -- MSBDL0140_MST_PURC_ACT_D_Query_S01
	 */
	static MCQueryPlan MSBDL0140_MST_PURC_ACT_D_S01() {
		MST_PURC_ACT_D_R S0_T1 = MST_PURC_ACT_D_R.create("T1");
		MST_PURC_SCHD_R S0_T2 = MST_PURC_SCHD_R.create("T2");
		MST_ARR_SCHD_R S0_T3 = MST_ARR_SCHD_R.create("T3");
		MST_ARR_PR_R S0_T4 = MST_ARR_PR_R.create("T4");
		MST_PO_D_R S0_T5 = MST_PO_D_R.create("T5");
		MAM_ITM_R S0_M1 = MAM_ITM_R.create("M1");
		MST_PURC_ACT_R S0_T6 = MST_PURC_ACT_R.create("T6");
		MST_PRMS_RCPT_D_R S0_T9 = MST_PRMS_RCPT_D_R.create("T9");
		MST_DLV_INST_D_R S0_T10 = MST_DLV_INST_D_R.create("T10");
		MST_SLO_D_R S0_T11 = MST_SLO_D_R.create("T11");
		MST_PURC_ACT_R S0_T12 = MST_PURC_ACT_R.create("T12");
		MST_PO_R S0_T13 = MST_PO_R.create("T13");
		MAM_DPT_R S0_M12 = MAM_DPT_R.create("M12");
		MAM_DPT_R S0_M15 = MAM_DPT_R.create("M15");
		MAM_WG_R S0_M16 = MAM_WG_R.create("M16");
		MAM_BP_R S0_M30 = MAM_BP_R.create("M30");
		MAM_BP_R S0_M31 = MAM_BP_R.create("M31");
		
		MCDynamicSQLID REP1 = createDynamicSQLID("REP1");
		
		return createQueryPlan()
			.setQuery(
				sql("MSBDL0140_MST_PURC_ACT_D_Query_S01")
					.mainQuery()
					.select(
						S0_T1.purc_act_d_no,
						S0_T1.purc_act_d_seq,
						S0_T1.disp_seq,
						S0_T1.purc_schd_no,
						S0_T1.purc_src_typ,
						S0_T1.purc_src_no,
						S0_T1.po_d_no,
						S0_T1.purc_ret_act_d_no,
						S0_T1.sync_flg,
						S0_T5.purc_basis_typ,
						S0_T1.itm_cd,
						S0_T1.itm_sub1,
						S0_T1.itm_sub2,
						S0_T1.itm_sub3,
						decode(
							S0_T1.sundry_itm_flg,
							value(true),
							S0_T1.itm_nm,
							S0_M1.itm_nm
						).as("itm_nm"),
						S0_M1.asset_mng_typ,
						S0_M1.stk_mng_typ,
						S0_M1.lot_mng_typ,
						S0_M1.lot_no_typ,
						S0_M1.sublot_mng_typ,
						S0_M1.sublot_no_typ,
						S0_M1.sno1_mng_typ,
						S0_M1.sno2_mng_typ,
						S0_M1.sno3_mng_typ,
						S0_M1.sno4_mng_typ,
						S0_M1.dscnt_itm_flg,
						S0_M1.purc_upri_cng_flg,
						S0_T1.iv_itm_nm,
						S0_T1.ap_typ,
						S0_T1.purc_typ,
						S0_T1.purc_id_typ,
						S0_T1.mfg_inst_no,
						S0_T1.rsn_cd.as("purc_rsn_cd"),
						S0_T1.sundry_itm_flg,
						S0_T1.sppl_itm_cd,
						S0_T1.sppl_itm_nm,
						bracket(
								cases()
									.when(S0_T5.dlv_cd.isNotNull())
										.then(S0_T11.cst_itm_cd)
									.otherwise(nullValue())
							).as("cst_itm_cd"),
						bracket(
								cases()
									.when(S0_T5.dlv_cd.isNotNull())
										.then(S0_T11.cst_itm_nm)
									.otherwise(nullValue())
							).as("cst_itm_nm"),
						S0_T1.ver_no,
						S0_M1.ver_flg,
						S0_T1.sno1,
						S0_T1.sno2,
						S0_T1.sno3,
						S0_T1.sno4,
						S0_T1.in_to_loc_cd.as("dlv_loc_cd"),
						S0_T1.in_to_loc_wg_cd.as("dlv_loc_wg_cd"),
						S0_T1.str_ln_cd,
						S0_T1.gd_cd,
						S0_T1.quality_typ,
						S0_T1.stk_insp_typ,
						S0_T1.stk_id_typ,
						S0_T1.lot_no,
						S0_T1.sublot_no,
						S0_M1.bp_lot_flg,
						S0_T1.bp_lot_no,
						S0_T1.trd_unit_cd,
						S0_T1.trd_unit_qty,
						S0_T1.base_unit_cd,
						S0_T1.base_unit_qty.as("base_unit_qty_bf_cng"),
						S0_T1.base_unit_qty,
						S0_T1.upri_not_tgt_flg,
						S0_T1.purc_dtl_upd_flg,
						S0_T1.interim_flg,
						S0_T1.tax_cd,
						S0_T5.tax_fix_flg,
						S0_T1.trd_cur_upri,
						S0_T1.trd_cur_amt,
						S0_T1.trd_cur_tax_amt,
						S0_T1.trd_cur_amt.add(S0_T1.trd_cur_tax_amt).as("trd_cur_inc_tax_amt"),
						S0_T1.trd_cur_dscnt_amt,
						S0_T1.trd_cur_proc_upri,
						S0_T1.trd_cur_proc_amt,
						S0_T1.trd_cur_onr_prov_upri,
						S0_T1.trd_cur_onr_prov_amt,
						S0_T1.base_cur_upri,
						S0_T1.base_cur_amt,
						S0_T1.base_cur_tax_amt,
						S0_T1.base_cur_amt.add(S0_T1.base_cur_tax_amt).as("base_cur_inc_tax_amt"),
						S0_T1.base_cur_dscnt_amt,
						S0_T1.base_cur_proc_upri,
						S0_T1.base_cur_proc_amt,
						S0_T1.base_cur_onr_prov_upri,
						S0_T1.base_cur_onr_prov_amt,
						S0_T1.ptax_cur_upri,
						S0_T1.ptax_cur_amt,
						S0_T1.ptax_cur_tax_amt,
						S0_T1.ptax_cur_amt.add(S0_T1.ptax_cur_tax_amt).as("ptax_cur_inc_tax_amt"),
						S0_T1.ptax_cur_dscnt_amt,
						S0_T1.ptax_cur_proc_upri,
						S0_T1.ptax_cur_proc_amt,
						S0_T1.ptax_cur_onr_prov_upri,
						S0_T1.ptax_cur_onr_prov_amt,
						S0_T1.dscnt_rsn_cd,
						S0_T1.wtax_rate,
						S0_T1.wtax_amt.as("trd_cur_wtax_amt"),
						S0_T1.maker_cd,
						S0_T1.ap_dpt_cd,
						S0_M12.dpt_nm.as("ap_dpt_nm"),
						S0_T1.pay_crryovr_times,
						S0_T2.abort_flg,
						S0_T1.ncv_flg,
						S0_T1.edi_flg,
						S0_T1.accpt_dfct_flg,
						S0_T1.re_arr_flg,
						S0_T1.re_arr_sync_flg,
						S0_T1.re_arr_loc_cd,
						S0_T1.re_arr_loc_wg_cd,
						S0_T1.re_arr_str_ln_cd,
						trunc(
							S0_T1.re_arr_rqst_tm,
							MCDateFmt.DD
						).as("re_arr_rqst_dt"),
						S0_T1.re_arr_rqst_tm.as("re_arr_rqst_hm"),
						S0_T1.re_arr_purc_schd_dt,
						S0_T1.trd_unit_re_arr_qty,
						S0_T1.base_unit_re_arr_qty,
						S0_T1.bd_itm_cd,
						S0_T1.bd_itm_sub1,
						S0_T1.bd_itm_sub2,
						S0_T1.bd_itm_sub3,
						S0_T1.bd_sno1,
						S0_T1.bd_sno2,
						S0_T1.bd_sno3,
						S0_T1.bd_sno4,
						S0_T1.bd_loc_cd,
						S0_T1.bd_lot_no,
						S0_T1.bd_sublot_no,
						S0_T1.bd_dpt_cd,
						S0_M15.dpt_nm.as("bd_dpt_nm"),
						S0_T1.bd_ctg_cd,
						S0_T1.bd_oper_cd,
						S0_T1.bd_slo_no,
						S0_T1.bd_iv_no,
						S0_T1.bd_po_no,
						S0_T1.ref_purc_act_no,
						S0_T1.ref_purc_act_seq,
						S0_T1.ref_purc_act_d_no,
						S0_T1.ref_purc_act_d_seq,
						S0_T1.bp_dlv_slip_no,
						S0_T1.bp_dlv_slip_d_no,
						S0_T1.intr_rmrks.as("intr_d_rmrks"),
						S0_T1.trd_d_rmrks,
						S0_T1.sub_char1,
						S0_T1.sub_char2,
						S0_T1.sub_char3,
						nvl(
							S0_T3.arr_ptn_typ,
							value(MSC_ARR_PTN_TYP.NRML.value())
						).as("arr_ptn_typ"),
						S0_T3.arr_schd_no,
						S0_T4.arr_pr_no,
						S0_T4.upd_cntr.as("arr_pr_upd_cntr"),
						S0_M30.dlv_cal_cd.as("scst_cal_cd"),
						S0_T5.mfg_loc_cd,
						S0_T5.bom_ptn,
						nvl(
							S0_T10.dlv_cd,
							S0_T5.dlv_cd
						).as("scst_cd"),
						nvl2(
							S0_T10.dlv_cd,
							nvl(
								S0_T10.dlv_nm,
								S0_M30.bp_nm
							),
							decode(
								S0_T5.dlv_sundry_flg,
								value(true),
								S0_T5.dlv_nm,
								S0_M30.bp_nm
							)
						).as("scst_nm"),
						S0_M30.cntry_cd.as("scst_cntry_cd"),
						nvl2(
							S0_T10.dlv_cd,
							S0_T10.dlv_sundry_flg,
							S0_T5.dlv_sundry_flg
						).as("scst_sundry_flg"),
						nvl2(
							S0_T10.dlv_cd,
							S0_T10.dlv_cntct_dpt,
							S0_T5.dlv_cntct_dpt
						).as("scst_cntct_dpt"),
						nvl2(
							S0_T10.dlv_cd,
							S0_T10.dlv_cntct_psn,
							S0_T5.dlv_cntct_psn
						).as("scst_cntct_psn"),
						nvl2(
							S0_T10.dlv_cd,
							S0_T10.dlv_zip_cd,
							S0_T5.dlv_zip_cd
						).as("scst_zip_cd"),
						nvl2(
							S0_T10.dlv_cd,
							S0_T10.dlv_addr1,
							S0_T5.dlv_addr1
						).as("scst_addr1"),
						nvl2(
							S0_T10.dlv_cd,
							S0_T10.dlv_addr2,
							S0_T5.dlv_addr2
						).as("scst_addr2"),
						nvl2(
							S0_T10.dlv_cd,
							S0_T10.dlv_addr3,
							S0_T5.dlv_addr3
						).as("scst_addr3"),
						nvl2(
							S0_T10.dlv_cd,
							S0_T10.dlv_addr4,
							S0_T5.dlv_addr4
						).as("scst_addr4"),
						nvl2(
							S0_T10.dlv_cd,
							S0_T10.dlv_tel,
							S0_T5.dlv_tel
						).as("scst_tel"),
						nvl2(
							S0_T10.dlv_cd,
							S0_T10.dlv_fax,
							S0_T5.dlv_fax
						).as("scst_fax"),
						S0_T5.drct_dlv_typ,
						nvl(
							S0_T10.tdlv_cd,
							S0_T5.tdlv_cd
						).as("tdlv_cd"),
						nvl2(
							S0_T10.tdlv_cd,
							nvl(
								S0_T10.tdlv_nm,
								S0_M31.bp_nm
							),
							decode(
								S0_T5.tdlv_sundry_flg,
								value(true),
								S0_T5.tdlv_nm,
								S0_M31.bp_nm
							)
						).as("tdlv_nm"),
						S0_M31.cntry_cd.as("tdlv_cntry_cd"),
						nvl2(
							S0_T10.tdlv_cd,
							S0_T10.tdlv_cntct_dpt,
							S0_T5.tdlv_cntct_dpt
						).as("tdlv_cntct_dpt"),
						nvl2(
							S0_T10.tdlv_cd,
							S0_T10.tdlv_cntct_psn,
							S0_T5.tdlv_cntct_psn
						).as("tdlv_cntct_psn"),
						nvl2(
							S0_T10.tdlv_cd,
							S0_T10.tdlv_sundry_flg,
							S0_T5.tdlv_sundry_flg
						).as("tdlv_sundry_flg"),
						nvl2(
							S0_T10.tdlv_cd,
							S0_T10.tdlv_zip_cd,
							S0_T5.tdlv_zip_cd
						).as("tdlv_zip_cd"),
						nvl2(
							S0_T10.tdlv_cd,
							S0_T10.tdlv_addr1,
							S0_T5.tdlv_addr1
						).as("tdlv_addr1"),
						nvl2(
							S0_T10.tdlv_cd,
							S0_T10.tdlv_addr2,
							S0_T5.tdlv_addr2
						).as("tdlv_addr2"),
						nvl2(
							S0_T10.tdlv_cd,
							S0_T10.tdlv_addr3,
							S0_T5.tdlv_addr3
						).as("tdlv_addr3"),
						nvl2(
							S0_T10.tdlv_cd,
							S0_T10.tdlv_addr4,
							S0_T5.tdlv_addr4
						).as("tdlv_addr4"),
						nvl2(
							S0_T10.tdlv_cd,
							S0_T10.tdlv_tel,
							S0_T5.tdlv_tel
						).as("tdlv_tel"),
						nvl2(
							S0_T10.tdlv_cd,
							S0_T10.tdlv_fax,
							S0_T5.tdlv_fax
						).as("tdlv_fax"),
						S0_T5.trd_unit_qty.as("src_trd_unit_qty"),
						S0_T5.trd_unit_cd.as("src_trd_unit_cd"),
						S0_T5.base_unit_qty.as("src_base_unit_qty"),
						S0_T5.trd_cur_upri.as("src_trd_cur_upri"),
						S0_T5.trd_cur_proc_upri.as("src_trd_cur_proc_upri"),
						S0_T5.trd_cur_onr_prov_upri.as("src_trd_cur_onr_prov_upri"),
						S0_T5.trd_cur_amt.as("src_trd_cur_amt"),
						S0_T5.trd_cur_proc_amt.as("src_trd_cur_proc_amt"),
						S0_T5.trd_cur_onr_prov_amt.as("src_trd_cur_onr_prov_amt"),
						S0_T5.trd_cur_tax_amt.as("src_trd_cur_tax_amt"),
						S0_T5.trd_cur_dscnt_amt.as("src_trd_cur_dscnt_amt"),
						S0_T5.wtax_rate.as("src_wtax_rate"),
						S0_T3.arr_qty.as("base_unit_arr_qty"),
						S0_T2.base_unit_schd_qty,
						S0_T2.base_unit_purc_qty,
						S0_T2.base_unit_accpt_dfct_qty,
						S0_T2.base_unit_purc_qty.add(S0_T2.base_unit_accpt_dfct_qty).as("base_unit_purc_act_qty"),
						S0_T1.disp_seq,
						S0_T5.po_print_d_rmrks,
						nvl(
							S0_T3.arr_skip_flg,
							S0_M1.arr_skip_flg
						).as("arr_skip_flg"),
						S0_T4.purc_ddlv_flg,
						S0_T2.purc_schd_dt,
						S0_T3.outsrc_flg,
						S0_T12.purc_act_no,
						S0_T12.purc_act_seq,
						S0_T12.purc_act_rev,
						S0_T12.ac_dt,
						S0_T12.pay_basis_dt,
						S0_T12.xrate,
						S0_T12.ptax_xrate,
						S0_T12.ptax_dt,
						S0_T12.trd_rmrks,
						S0_T12.intr_rmrks,
						S0_T13.po_print_rmrks,
						S0_T1.rcpt_iv_d_no,
						S0_T12.upd_cntr.as("purc_act_upd_cntr"),
						// this field is appended by sql coverter.
						S0_T5.slo_d_no.as("join_slo_d_no_"),
						// this field is appended by sql coverter.
						S0_T1.bd_bp_cd.as("join_bd_bp_cd_"),
						// this field is appended by sql coverter.
						S0_T5.itm_cd.as("join_itm_cd_"),
						// this field is appended by sql coverter.
						S0_T5.itm_sub1.as("join_itm_sub1_"),
						// this field is appended by sql coverter.
						S0_T5.itm_sub2.as("join_itm_sub2_"),
						// this field is appended by sql coverter.
						S0_T5.itm_sub3.as("join_itm_sub3_"),
						// this field is appended by sql coverter.
						S0_T5.tax_cd.as("join_tax_cd_")
					)
					.from(
						S0_T1
						.leftOuterJoin(S0_T2).on(
							bracket(
								S0_T1.purc_schd_no.eq(S0_T2.purc_schd_no)
							)
						)
						.leftOuterJoin(S0_T3).on(
							bracket(
								S0_T2.arr_schd_no.eq(S0_T3.arr_schd_no)
							)
						)
						.leftOuterJoin(S0_T4).on(
							bracket(
								S0_T3.arr_pr_no.eq(S0_T4.arr_pr_no)
							)
						)
						.leftOuterJoin(S0_T5).on(
							bracket(
								S0_T4.po_d_no.eq(S0_T5.po_d_no)
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
						.leftOuterJoin(S0_T6).on(
							bracket(
								S0_T1.purc_act_no.eq(S0_T6.purc_act_no)
								.and(S0_T1.purc_act_seq.eq(S0_T6.purc_act_seq))
							)
						)
						.leftOuterJoin(S0_T9).on(
							bracket(
								S0_T3.prms_rcpt_d_no.eq(S0_T9.prms_rcpt_d_no)
							)
						)
						.leftOuterJoin(S0_T10).on(
							bracket(
								S0_T3.dlv_inst_d_no.eq(S0_T10.dlv_inst_d_no)
								.or(S0_T9.dlv_inst_d_no.eq(S0_T10.dlv_inst_d_no))
							)
						)
						.leftOuterJoin(S0_M12).on(
							bracket(
								S0_T1.ap_dpt_cd.eq(S0_M12.dpt_cd)
								.and(S0_T6.ac_dt.between(S0_M12.st_dt, S0_M12.end_dt))
							)
						)
						.leftOuterJoin(S0_M15).on(
							bracket(
								S0_T1.bd_dpt_cd.eq(S0_M15.dpt_cd)
								.and(S0_T6.ac_dt.between(S0_M15.st_dt, S0_M15.end_dt))
							)
						)
						.leftOuterJoin(S0_M16).on(
							bracket(
								S0_T1.bd_wg_cd.eq(S0_M16.wg_cd)
							)
						)
						.leftOuterJoin(S0_M30).on(
							bracket(
								S0_M30.bp_cd.eq(nvl(
										S0_T10.dlv_cd,
										S0_T5.dlv_cd
									)
								)
							)
						)
						.leftOuterJoin(S0_M31).on(
							bracket(
								S0_M31.bp_cd.eq(nvl(
										S0_T10.tdlv_cd,
										S0_T5.tdlv_cd
									)
								)
							)
						)
						.leftOuterJoin(S0_T11).on
							(bracket(
									S0_T11.slo_d_no.eq(S0_T5.slo_d_no)
								)
						)
						.leftOuterJoin(S0_T12).on
							(bracket(
									S0_T12.purc_act_no.eq(S0_T1.purc_act_no)
									.and(S0_T12.purc_act_seq.eq(S0_T1.purc_act_seq))
								)
						)
						.leftOuterJoin(S0_T13).on
							(bracket(
									S0_T13.po_no.eq(S0_T12.po_no)
								)
						)
					)
					.where(
						value(0).eq(value(0))
						.addDynamicPredicate(REP1)
					)
					.orderBy(S0_T1.disp_seq.asc())
			)
			.setJoinInfo(
				joinInfo(
					j -> j
						.add(MSVT_WRK_SNO_R.class, r -> toCondition(
							r.getStringNE("sno1")
						))
						.addSelect(m -> toArray(
							m.wrk_nm,
							m.wrk_no
						))
						.addMap((r, m) -> {
							r.setStringNE("wrk_no", m.wrk_no());
							r.setStringNE("wrk_nm", m.wrk_nm());
					}),
					j -> j
						.add(MST_SLO_D_R.class, r -> toCondition(
							r.getStringNE("join_slo_d_no_")
						))
						.addSelect(m -> toArray(
							m.slo_d_no,
							m.slo_no
						))
						.addMap((r, m) -> {
							r.setStringNE("slo_d_no", m.slo_d_no());
							r.setStringNE("slo_no", m.slo_no());
					}),
					j -> j
						.add(MAM_BIZ_RSN_R.class, r -> toCondition(
							r.getStringNE("purc_rsn_cd")
						))
						.addSelect(m -> toArray(
							m.biz_rsn_nm,
							m.xpns_purc_flg
						))
						.addMap((r, m) -> {
							r.setStringNE("purc_rsn_nm", m.biz_rsn_nm());
							r.setBooleanNE("xpns_purc_flg", m.xpns_purc_flg());
					}),
					j -> j
						.add(MAM_LOC_R.class, r -> toCondition(
							r.getStringNE("dlv_loc_cd")
						))
						.addSelect(m -> toArray(
							m.loc_nm,
							m.site_cd,
							m.sppl_cd,
							m.str_ln_tgt_flg
						))
						.addMap((r, m) -> {
							r.setStringNE("site_cd", m.site_cd());
							r.setStringNE("dlv_loc_nm", m.loc_nm());
							r.setStringNE("dlv_loc_sppl_cd", m.sppl_cd());
							r.setBooleanNE("str_ln_tgt_flg", m.str_ln_tgt_flg());
					}),
					j -> j
						.add(MAM_WG_R.class, r -> toCondition(
							r.getStringNE("dlv_loc_wg_cd")
						))
						.addSelect(m -> toArray(
							m.wg_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("dlv_loc_wg_nm", m.wg_nm());
					}),
					j -> j
						.add(MAM_STR_LN_R.class, r -> toCondition(
							r.getStringNE("dlv_loc_cd"),
							r.getStringNE("str_ln_cd")
						))
						.addSelect(m -> toArray(
							m.str_ln_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("str_ln_nm", m.str_ln_nm());
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
							m.tax_nm,
							m.tax_rate,
							m.tax_typ
						))
						.addMap((r, m) -> {
							r.setStringNE("tax_nm", m.tax_nm());
							r.setNumberNE("tax_rate", m.tax_rate());
							r.setStringNE("tax_typ", m.tax_typ());
							r.setBooleanNE("inc_tax_flg", m.inc_tax_flg());
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
							r.setStringNE("bd_lot_no_typ", m.lot_no_typ());
							r.setStringNE("bd_sublot_mng_typ", m.sublot_mng_typ());
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
						.add(MAM_BP_R.class, r -> toCondition(
							r.getStringNE("join_bd_bp_cd_")
						))
						.addSelect(m -> toArray(
							m.bp_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("bd_bp_nm", m.bp_nm());
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
						.add(MAM_LOC_R.class, r -> toCondition(
							r.getStringNE("re_arr_loc_cd")
						))
						.addSelect(m -> toArray(
							m.cal_cd,
							m.loc_nm,
							m.site_cd,
							m.sppl_cd,
							m.str_ln_tgt_flg
						))
						.addMap((r, m) -> {
							r.setStringNE("re_arr_loc_nm", m.loc_nm());
							r.setBooleanNE("re_arr_str_ln_tgt_flg", m.str_ln_tgt_flg());
							r.setStringNE("re_arr_loc_site_cd", m.site_cd());
							r.setStringNE("re_arr_loc_cal_cd", m.cal_cd());
							r.setStringNE("re_arr_loc_sppl_cd", m.sppl_cd());
					}),
					j -> j
						.add(MAM_WG_R.class, r -> toCondition(
							r.getStringNE("re_arr_loc_wg_cd")
						))
						.addSelect(m -> toArray(
							m.wg_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("re_arr_loc_wg_nm", m.wg_nm());
					}),
					j -> j
						.add(MAM_STR_LN_R.class, r -> toCondition(
							r.getStringNE("re_arr_loc_cd"),
							r.getStringNE("re_arr_str_ln_cd")
						))
						.addSelect(m -> toArray(
							m.str_ln_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("re_arr_str_ln_nm", m.str_ln_nm());
					}),
					j -> j
						.add(MAVM_ITM_UNIT_R.class, r -> toCondition(
							r.getStringNE("join_itm_cd_"),
							r.getStringNE("join_itm_sub1_"),
							r.getStringNE("join_itm_sub2_"),
							r.getStringNE("join_itm_sub3_"),
							r.getStringNE("src_trd_unit_cd")
						))
						.addSelect(m -> toArray(
							m.conv_base_qty,
							m.conv_qty,
							m.dec_place,
							m.rnd_typ
						))
						.addMap((r, m) -> {
							r.setNumberNE("src_trd_unit_conv_qty", m.conv_qty());
							r.setNumberNE("src_trd_unit_conv_base_qty", m.conv_base_qty());
							r.setNumberNE("src_trd_unit_dec_place", m.dec_place());
							r.setStringNE("src_trd_unit_rnd_typ", m.rnd_typ());
					}),
					j -> j
						.add(MAM_TAX_R.class, r -> toCondition(
							r.getStringNE("join_tax_cd_")
						))
						.addSelect(m -> toArray(
							m.inc_tax_flg,
							m.tax_rate
						))
						.addMap((r, m) -> {
							r.setNumberNE("src_tax_rate", m.tax_rate());
							r.setBooleanNE("src_inc_tax_flg", m.inc_tax_flg());
					}),
					j -> j
						.add(MAM_CNTRY_R.class, r -> toCondition(
							r.getStringNE("scst_cntry_cd")
						))
						.addSelect(m -> toArray(
							m.cntry_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("scst_cntry_nm", m.cntry_nm());
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
	static MCDynamicSQLInfo MSBDL0140_MST_PURC_ACT_D_S01_WHERE01() {
		MST_PURC_ACT_D_R S0_T1 = MST_PURC_ACT_D_R.create("T1");
		
		MCDynamicSQLID REP1 = createDynamicSQLID("REP1");
		
		return
				when(null)
						.predicate(REP1, p ->
							p.cutoff$and(S0_T1.purc_act_no.eq(bind("purc_act_no")))
							.cutoff$and(S0_T1.purc_act_seq.eq(bind("purc_act_seq")))
						);
	}
	
	/**
	 * -- MSBDL0140_MST_PURC_ACT_IO_Query_S01
	 */
	static MCQueryPlan MSBDL0140_MST_PURC_ACT_IO_S01() {
		MST_PURC_ACT_IO_R S0_T1 = MST_PURC_ACT_IO_R.create("T1");
		MST_PURC_ACT_D_R S0_T2 = MST_PURC_ACT_D_R.create("T2");
		MST_PURC_SCHD_R S0_T4 = MST_PURC_SCHD_R.create("T4");
		MST_ARR_SCHD_R S0_T5 = MST_ARR_SCHD_R.create("T5");
		MST_ARR_PR_R S0_T6 = MST_ARR_PR_R.create("T6");
		MST_ARR_ACT_R S0_T10 = MST_ARR_ACT_R.create("T10");
		MST_SLS_ACT_IO_R S0_SLS_ACT_IO = MST_SLS_ACT_IO_R.create("SLS_ACT_IO");
		MST_SLS_ACT_D_R S0_SLS_ACT_D = MST_SLS_ACT_D_R.create("SLS_ACT_D");
		MST_SLS_ACT_R S0_SLS_ACT = MST_SLS_ACT_R.create("SLS_ACT");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBDL0140_MST_PURC_ACT_IO_Query_S01")
					.mainQuery()
					.select(
						S0_T1.purc_act_io_no,
						S0_T1.purc_act_io_seq,
						S0_T1.purc_act_d_no,
						S0_T1.purc_act_d_seq,
						S0_T1.arr_act_no,
						S0_T1.purc_ret_act_io_no,
						S0_T1.in_to_loc_cd.as("dlv_loc_cd"),
						S0_T1.in_to_loc_wg_cd.as("dlv_loc_wg_cd"),
						S0_T1.str_ln_cd,
						S0_T2.itm_cd,
						S0_T2.itm_sub1,
						S0_T2.itm_sub2,
						S0_T2.itm_sub3,
						S0_T1.ver_no,
						S0_T1.lot_no,
						S0_T1.sublot_no,
						S0_T1.gd_cd,
						S0_T1.quality_typ,
						S0_T1.stk_insp_typ,
						S0_T1.stk_id_typ,
						S0_T1.bp_lot_no,
						S0_T1.bp_dlv_slip_no,
						S0_T1.bp_dlv_slip_d_no,
						S0_T1.trd_unit_cd,
						S0_T1.trd_unit_qty,
						S0_T1.base_unit_cd,
						S0_T1.base_unit_qty,
						S0_T1.in_to_loc_cd.as("from_loc_cd"),
						S0_T1.in_to_loc_wg_cd.as("from_loc_wg_cd"),
						S0_T1.str_ln_cd.as("from_str_ln_cd"),
						S0_T1.gd_cd.as("from_gd_cd"),
						S0_T10.ship_fr_valid_dt,
						S0_T10.purc_cont_qty,
						S0_T1.gi_wg_cd,
						S0_T1.gi_loc_cd,
						S0_T1.gi_str_ln_cd,
						S0_T1.gi_unit_cd,
						S0_T1.sub_char1,
						S0_T1.sub_char2,
						S0_T1.sub_char3,
						S0_T2.rcpt_iv_d_no,
						bracket(
							cases()
								.when(exists(
									subQuery()
									.select(value("X"))
									.from(S0_SLS_ACT_IO
										.innerJoin(S0_SLS_ACT_D).on(
											S0_SLS_ACT_D.sls_act_d_no.eq(S0_SLS_ACT_IO.sls_act_d_no)
											.and(S0_SLS_ACT_D.sls_act_d_seq.eq(S0_SLS_ACT_IO.sls_act_d_seq))
										)
										.innerJoin(S0_SLS_ACT).on(
											S0_SLS_ACT.sls_act_no.eq(S0_SLS_ACT_D.sls_act_no)
											.and(S0_SLS_ACT.sls_act_seq.eq(S0_SLS_ACT_D.sls_act_seq))
										)
									)
									.where(
										value(0).eq(value(0))
										.and(S0_SLS_ACT_IO.sync_flg.eq(value(true)))
										.and(S0_SLS_ACT_IO.purc_act_io_no.eq(S0_T1.purc_act_io_no))
										.and(S0_SLS_ACT.slip_sts_typ.eq(value(MAC_SLIP_STS_TYP.CRT.value())))
										)
									)
								)
								.then(value(true))
								.otherwise(value(false))
						).as("sls_sync_flg")
					)
					.from(
						S0_T1
						.innerJoin(S0_T2).on(
							bracket(
								S0_T1.purc_act_d_no.eq(S0_T2.purc_act_d_no)
								.and(S0_T1.purc_act_d_seq.eq(S0_T2.purc_act_d_seq))
							)
						)
						.leftOuterJoin(S0_T4).on(
							bracket(
								S0_T2.purc_schd_no.eq(S0_T4.purc_schd_no)
								.and(S0_T4.non_purc_flg.eq(value(false)))
							)
						)
						.leftOuterJoin(S0_T5).on(
							bracket(
								S0_T4.arr_schd_no.eq(S0_T5.arr_schd_no)
							)
						)
						.leftOuterJoin(S0_T6).on(
							bracket(
								S0_T5.arr_pr_no.eq(S0_T6.arr_pr_no)
							)
						)
						.leftOuterJoin(S0_T10).on(
							bracket(
								S0_T1.arr_act_no.eq(S0_T10.arr_act_no)
								.and(S0_T10.can_flg.eq(value(false)))
							)
						)
					)
					.where(
						value(0).eq(value(0))
						.and(S0_T2.purc_act_no.eq(bind("purc_act_no")))
						.and(S0_T2.purc_act_seq.eq(bind("purc_act_seq")))
					)
					.orderBy(S0_T1.purc_act_io_no.asc())
			)
			.setJoinInfo(
				joinInfo(
					j -> j
						.add(MAM_LOC_R.class, r -> toCondition(
							r.getStringNE("dlv_loc_cd")
						))
						.addSelect(m -> toArray(
							m.loc_nm,
							m.site_cd,
							m.sppl_cd,
							m.str_ln_tgt_flg
						))
						.addMap((r, m) -> {
							r.setStringNE("dlv_loc_nm", m.loc_nm());
							r.setStringNE("dlv_loc_sppl_cd", m.sppl_cd());
							r.setBooleanNE("str_ln_tgt_flg", m.str_ln_tgt_flg());
							r.setStringNE("site_cd", m.site_cd());
					}),
					j -> j
						.add(MAM_WG_R.class, r -> toCondition(
							r.getStringNE("dlv_loc_wg_cd")
						))
						.addSelect(m -> toArray(
							m.wg_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("dlv_loc_wg_nm", m.wg_nm());
					}),
					j -> j
						.add(MAM_STR_LN_R.class, r -> toCondition(
							r.getStringNE("dlv_loc_cd"),
							r.getStringNE("str_ln_cd")
						))
						.addSelect(m -> toArray(
							m.str_ln_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("str_ln_nm", m.str_ln_nm());
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
						.add(MAM_ITM_R.class, r -> toCondition(
							r.getStringNE("itm_cd"),
							r.getStringNE("itm_sub1"),
							r.getStringNE("itm_sub2"),
							r.getStringNE("itm_sub3")
						))
						.addSelect(m -> toArray(
							m.cont_fctr_dec_place,
							m.cont_fctr_flg,
							m.cont_fctr_rnd_typ,
							m.cont_fctr_unit_cd,
							m.purc_upri_cng_flg,
							m.std_cont_fctr
						))
						.addMap((r, m) -> {
							r.setBooleanNE("cont_fctr_flg", m.cont_fctr_flg());
							r.setNumberNE("cont_fctr_dec_place", m.cont_fctr_dec_place());
							r.setStringNE("cont_fctr_rnd_typ", m.cont_fctr_rnd_typ());
							r.setNumberNE("std_cont_fctr", m.std_cont_fctr());
							r.setStringNE("cont_fctr_unit_cd", m.cont_fctr_unit_cd());
							r.setBooleanNE("itm_purc_upri_cng_flg", m.purc_upri_cng_flg());
					}),
					j -> j
						.add(MAM_UNIT_R.class, r -> toCondition(
							r.getStringNE("cont_fctr_unit_cd")
						))
						.addSelect(m -> toArray(
							m.unit_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("cont_fctr_unit_nm", m.unit_nm());
					})
				)
			);
	}
	
	/**
	 * -- MSBDL0140_MST_PURC_ACT_Query_S01
	 */
	static MCQueryPlan MSBDL0140_MST_PURC_ACT_S01() {
		MST_PURC_ACT_R S0_T1 = MST_PURC_ACT_R.create("T1");
		MCTempView S0_T2 = createTempView("T2");
		MAM_DPT_R S0_M2 = MAM_DPT_R.create("M2");
		MAVM_RD_DPT_R S0_M14 = MAVM_RD_DPT_R.create("M14");
		MST_PURC_ACT_R S1 = MST_PURC_ACT_R.create();
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBDL0140_MST_PURC_ACT_Query_S01")
					.mainQuery()
					.select(
						S0_T1.purc_act_no,
						S0_T1.purc_act_seq,
						S0_T1.purc_act_rev,
						decode(
							S0_T1.purc_act_rev,
							S0_T2.pr("max_rev"),
							value(1),
							value(0)
						).as("latest_flg"),
						decode(
							S0_T1.purc_act_rev,
							S0_T2.pr("max_rev"),
							decode(
								S0_T1.slip_sts_typ,
								value(MAC_SLIP_STS_TYP.CRT.value()),
								value(0),
								value(1)
							),
							value(0)
						).as("can_flg"),
						S0_T1.trd_cd,
						S0_T1.trd_ptn_typ,
						S0_T1.slip_sts_typ,
						S0_T1.po_no,
						S0_T1.purc_dpt_cd,
						S0_M2.dpt_nm.as("purc_dpt_nm"),
						S0_T1.wg_cd.as("purc_dpt_wg_cd"),
						S0_T1.purc_usr_cd,
						S0_T1.sppl_cd,
						MAPA_BP$F_GET_BP_ADDR(
							S0_T1.sppl_cd,
							S0_T1.purc_dt,
							value(MAC_BP_ADDR_TYP.SPPL_CNTCT_DPT.value())
						).as("sppl_cntct_dpt"),
						MAPA_BP$F_GET_BP_ADDR(
							S0_T1.sppl_cd,
							S0_T1.purc_dt,
							value(MAC_BP_ADDR_TYP.SPPL_CNTCT_PSN.value())
						).as("sppl_cntct_psn"),
						MAPA_BP$F_GET_BP_ADDR(
							S0_T1.sppl_cd,
							S0_T1.purc_dt,
							value(MAC_BP_ADDR_TYP.TEL.value())
						).as("sppl_tel"),
						MAPA_BP$F_GET_BP_ADDR(
							S0_T1.sppl_cd,
							S0_T1.purc_dt,
							value(MAC_BP_ADDR_TYP.FAX.value())
						).as("sppl_fax"),
						S0_T1.asppl_cd,
						S0_M2.ap_dpt_flg,
						MAPA_BP$F_GET_AP_DPT_CD_NE(
								S0_T1.asppl_cd,
								S0_T1.ac_dt,
								value(false)
							).as("mst_ap_dpt_cd"),
						MAPA_BP$F_GET_AP_DPT_CD_NE2(
							S0_T1.sppl_cd,
							S0_T1.asppl_cd,
							S0_T1.ac_dt,
							value(false)
						).as("ap_dpt_cd"),
						S0_T1.trd_cur_cd,
						S0_T1.ptax_cur_cd,
						S0_T1.base_cur_cd,
						S0_T1.xrate_cd,
						S0_T1.xrate,
						S0_T1.ptax_xrate,
						S0_T1.purc_dt,
						S0_T1.ac_dt,
						S0_T1.pay_basis_dt,
						S0_T1.pay_schd_dt,
						S0_T1.ptax_dt,
						S0_T1.rcpt_iv_no,
						S0_T1.ref_rcpt_iv_no,
						S0_T1.purc_ret_act_no,
						S0_T1.purc_ret_act_rev,
						S0_T1.tterm_cd1,
						S0_T1.tterm_rmrks1,
						S0_T1.tterm_cd2,
						S0_T1.tterm_rmrks2,
						S0_T1.tterm_cd3,
						S0_T1.tterm_rmrks3,
						S0_T1.trd_rmrks,
						S0_T1.intr_rmrks,
						S0_T1.adjst_dt,
						S0_T1.purc_adjst_typ,
						S0_T1.adjst_mtd_typ,
						S0_T1.purc_adjst_flg,
						S0_T1.sub_char1,
						S0_T1.sub_char2,
						S0_T1.sub_char3,
						S0_T1.ins_usr_id,
						S0_T1.ins_usr_nm,
						S0_T1.ins_ts,
						S0_T1.ins_func_id,
						S0_T1.upd_cntr.as("purc_act_upd_cntr"),
						S0_T1.upd_usr_id,
						S0_T1.upd_usr_nm,
						S0_T1.upd_ts,
						S0_T1.upd_func_id,
						S0_T1.upd_srv_req_no
					)
					.from(
						S0_T1
						.leftOuterJoin(
							subQuery()
							.select(
								S1.purc_act_no,
								max(S1.purc_act_rev).as("max_rev")
							)
							.from(S1)
							.groupBy(S1.purc_act_no).view(S0_T2)
						).on(
							bracket(
								S0_T1.purc_act_no.eq(S0_T2.pr(S1.purc_act_no))
							)
						)
						.leftOuterJoin(S0_M2).on(
							bracket(
								S0_T1.purc_dpt_cd.eq(S0_M2.dpt_cd)
								.and(S0_T1.ac_dt.between(S0_M2.st_dt, S0_M2.end_dt))
							)
						)
						.innerJoin(S0_M14).on(
							bracket(
								S0_T1.purc_dpt_cd.eq(S0_M14.dpt_cd)
							)
						)
					)
					.where(
						value(0).eq(value(0))
						.and(
							S0_T1.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.PURC.value()))
							.or(S0_T1.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.PURC_XPNS.value())))
						)
						.and(S0_T1.purc_act_no.eq(bind("purc_act_no")))
						.and(S0_T1.slip_sts_typ.neq(value(MAC_SLIP_STS_TYP.CAN.value())))
						.and(
							bracket(
								bind("newest_flg").eq(value(true))
								.and(S0_T1.purc_act_rev.eq(S0_T2.pr("max_rev")))
							)
							.or(
								bind("newest_flg").eq(value(false))
								.and(S0_T1.purc_act_rev.eq(bind("purc_act_rev")))
							)
						)
					)
			)
			.setJoinInfo(
				joinInfo(
					j -> j
						.add(MST_PO_R.class, r -> toCondition(
							r.getStringNE("po_no")
						))
						.addSelect(m -> toArray(
							m.po_print_rmrks,
							m.ptax_xrate_inpt_flg,
							m.xrate_inpt_flg
						))
						.addMap((r, m) -> {
							r.setBooleanNE("xrate_inpt_flg", m.xrate_inpt_flg());
							r.setBooleanNE("ptax_xrate_inpt_flg", m.ptax_xrate_inpt_flg());
							r.setStringNE("po_print_rmrks", m.po_print_rmrks());
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
						.add(MAM_WG_R.class, r -> toCondition(
							r.getStringNE("purc_dpt_wg_cd")
						))
						.addSelect(m -> toArray(
							m.wg_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("purc_dpt_wg_nm", m.wg_nm());
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
						.add(MAM_BP_R.class, r -> toCondition(
							r.getStringNE("sppl_cd")
						))
						.addSelect(m -> toArray(
							m.bp_nm,
							m.cntry_cd,
							m.pay_crryovr_times,
							m.prnt_lcl_cd,
							m.purc_amt_rnd_typ,
							m.purc_tax_calc_typ,
							m.purc_tax_rnd_typ,
							m.purc_upri_cng_flg,
							m.sppl_iv_flg,
							m.subcon_flg,
							m.repurc_obli_flg,
							m.outsrc_upri_typ
						))
						.addMap((r, m) -> {
							r.setStringNE("sppl_nm", m.bp_nm());
							r.setBooleanNE("subcon_flg", m.subcon_flg());
							r.setStringNE("sppl_cntry_cd", m.cntry_cd());
							r.setBooleanNE("sppl_iv_flg", m.sppl_iv_flg());
							r.setStringNE("purc_amt_rnd_typ", m.purc_amt_rnd_typ());
							r.setStringNE("purc_tax_rnd_typ", m.purc_tax_rnd_typ());
							r.setBooleanNE("purc_upri_cng_flg", m.purc_upri_cng_flg());
							r.setNumberNE("pay_crryovr_times", m.pay_crryovr_times());
							r.setStringNE("prnt_lcl_cd", m.prnt_lcl_cd());
							r.setStringNE("purc_tax_calc_typ", m.purc_tax_calc_typ());
							r.setBooleanNE("repurc_obli_flg", m.repurc_obli_flg());
							r.setStringNE("outsrc_upri_typ", m.bp_cd() == null ? null : m.outsrc_upri_typ() == null ? getCo().outsrc_upri_typ() : m.outsrc_upri_typ());
					}),
					j -> j
						.add(MAM_BP_R.class, r -> toCondition(
							r.getStringNE("asppl_cd")
						))
						.addSelect(m -> toArray(
							m.bp_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("asppl_nm", m.bp_nm());
					}),
					j -> j
						.add(MAM_CNTRY_R.class, r -> toCondition(
							r.getStringNE("sppl_cntry_cd")
						))
						.addSelect(m -> toArray(
							m.cntry_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("sppl_cntry_nm", m.cntry_nm());
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
							r.setNumberNE("trd_cur_upri_dec_place", m.upri_dec_place());
							r.setNumberNE("trd_cur_amt_dec_place", m.amt_dec_place());
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
							r.setNumberNE("ptax_cur_upri_dec_place", m.upri_dec_place());
							r.setNumberNE("ptax_cur_amt_dec_place", m.amt_dec_place());
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
							r.setNumberNE("base_cur_upri_dec_place", m.upri_dec_place());
							r.setNumberNE("base_cur_amt_dec_place", m.amt_dec_place());
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
	 * -- MSBDL0140_MST_PURC_SCHD_Query_S01
	 */
	static MCQueryPlan MSBDL0140_MST_PURC_SCHD_S01() {
		MST_PURC_SCHD_R S0_T1 = MST_PURC_SCHD_R.create("T1");
		MST_ARR_SCHD_R S0_T2 = MST_ARR_SCHD_R.create("T2");
		MST_ARR_PR_R S0_T3 = MST_ARR_PR_R.create("T3");
		MST_PO_D_R S0_T4 = MST_PO_D_R.create("T4");
		MST_PO_R S0_T5 = MST_PO_R.create("T5");
		MST_PRMS_RCPT_D_R S0_T8 = MST_PRMS_RCPT_D_R.create("T8");
		MST_DLV_INST_D_R S0_T9 = MST_DLV_INST_D_R.create("T9");
		MST_SLO_D_R S0_T10 = MST_SLO_D_R.create("T10");
		MAM_ITM_R S0_M1 = MAM_ITM_R.create("M1");
		MAM_BP_R S0_M3 = MAM_BP_R.create("M3");
		MAM_DPT_R S0_M6 = MAM_DPT_R.create("M6");
		MAM_DPT_R S0_M13 = MAM_DPT_R.create("M13");
		MAM_BP_R S0_M30 = MAM_BP_R.create("M30");
		MAM_BP_R S0_M31 = MAM_BP_R.create("M31");
		
		MCDynamicSQLID REP1 = createDynamicSQLID("REP1");
		
		return createQueryPlan()
			.setQuery(
				sql("MSBDL0140_MST_PURC_SCHD_Query_S01")
					.mainQuery()
					.select(
						S0_T1.purc_schd_no,
						S0_T1.arr_schd_no,
						S0_T2.mfg_inst_no,
						S0_T4.po_d_no,
						S0_T4.itm_cd,
						S0_T4.itm_sub1,
						S0_T4.itm_sub2,
						S0_T4.itm_sub3,
						S0_T4.ver_no,
						S0_M1.ver_flg,
						S0_T1.trd_unit_cd.as("schd_unit_cd"),
						S0_M1.unit_cd.as("base_unit_cd"),
						S0_M1.dec_place.as("base_unit_dec_place"),
						S0_M1.rnd_typ.as("base_unit_rnd_typ"),
						S0_M1.stk_mng_typ,
						S0_M1.lot_mng_typ,
						S0_M1.lot_no_typ,
						S0_M1.sublot_mng_typ,
						S0_M1.sublot_no_typ,
						S0_M1.sno1_mng_typ,
						S0_M1.sno2_mng_typ,
						S0_M1.sno3_mng_typ,
						S0_M1.sno4_mng_typ,
						S0_M1.dscnt_itm_flg,
						S0_M1.purc_upri_cng_flg,
						S0_T4.upri_not_tgt_flg,
						S0_T1.purc_schd_dt,
						trunc(
							S0_T2.arr_schd_tm,
							MCDateFmt.DD
						).as("arr_schd_dt"),
						S0_T2.arr_ptn_typ,
						cases()
							.when(S0_T2.arr_qty.eq(value(0)))
								.then(value(0))
							.otherwise(value(1)).as("arr_act_flg"),
						S0_T2.arr_skip_flg,
						S0_T3.purc_ddlv_flg,
						S0_M1.cont_fctr_flg,
						S0_M1.std_cont_fctr,
						S0_M1.cont_fctr_unit_cd,
						S0_M1.cont_fctr_dec_place,
						S0_M1.cont_fctr_rnd_typ,
						S0_M1.std_cont_fctr.as("purc_cont_fctr"),
						S0_M1.asset_mng_typ,
						decode(
							S0_T4.sundry_itm_flg,
							value(true),
							S0_T4.itm_nm,
							S0_M1.itm_nm
						).as("itm_nm"),
						S0_T4.iv_itm_nm,
						S0_T4.sno1,
						S0_T4.sno2,
						S0_T4.sno3,
						S0_T4.sno4,
						S0_T2.gd_cd,
						S0_T2.quality_typ,
						S0_T2.stk_id_typ,
						S0_T2.stk_insp_typ,
						S0_T4.purc_rsn_cd,
						S0_T4.tax_cd.as("src_tax_cd"),
						S0_T4.tax_fix_flg,
						cases()
							.when(S0_T4.tax_fix_flg.eq(value(false)))
								.then(
									MAPA_TAX$F_GET_PURC_TAX_CD(
										S0_T4.itm_cd,
										S0_T4.itm_sub1,
										S0_T4.itm_sub2,
										S0_T4.itm_sub3,
										S0_T5.sppl_cd,
										bind("base_dt")
									)
							)
							.otherwise(nullValue()).as("tax_cd"),
						S0_T4.purc_id_typ,
						S0_T4.sundry_itm_flg,
						S0_T4.sppl_itm_cd,
						S0_T4.sppl_itm_nm,
						bracket(
								cases()
									.when(S0_T4.dlv_cd.isNotNull())
										.then(S0_T10.cst_itm_cd)
									.otherwise(nullValue())
							).as("cst_itm_cd"),
						bracket(
								cases()
									.when(S0_T4.dlv_cd.isNotNull())
										.then(S0_T10.cst_itm_nm)
									.otherwise(nullValue())
							).as("cst_itm_nm"),
						S0_T4.ap_dpt_cd,
						S0_M13.dpt_nm.as("ap_dpt_nm"),
						S0_T4.maker_cd,
						S0_M1.bp_lot_flg,
						S0_T4.bp_lot_no,
						S0_T4.in_to_loc_cd.as("dlv_loc_cd"),
						S0_T4.str_ln_cd,
						S0_T2.sync_flg,
						S0_T2.sync_flg.as("schd_sync_flg"),
						S0_T4.purc_basis_typ,
						S0_T4.interim_flg,
						S0_T4.bd_itm_cd,
						S0_T4.bd_itm_sub1,
						S0_T4.bd_itm_sub2,
						S0_T4.bd_itm_sub3,
						S0_T4.bd_sno1,
						S0_T4.bd_sno2,
						S0_T4.bd_sno3,
						S0_T4.bd_sno4,
						S0_T4.bd_loc_cd,
						S0_T4.bd_lot_no,
						S0_T4.bd_sublot_no,
						S0_T4.bd_dpt_cd,
						S0_M6.dpt_nm.as("bd_dpt_nm"),
						S0_T4.bd_ctg_cd,
						S0_T4.bd_oper_cd,
						S0_T4.bd_slo_no,
						S0_T4.bd_iv_no,
						S0_T4.bd_po_no,
						S0_T4.bd_bp_cd,
						S0_T4.po_print_d_rmrks,
						S0_T4.trd_unit_qty.as("src_trd_unit_qty"),
						S0_T4.trd_unit_cd.as("src_trd_unit_cd"),
						S0_T4.base_unit_qty.as("src_base_unit_qty"),
						S0_T4.trd_cur_upri.as("src_trd_cur_upri"),
						S0_T4.trd_cur_proc_upri.as("src_trd_cur_proc_upri"),
						S0_T4.trd_cur_onr_prov_upri.as("src_trd_cur_onr_prov_upri"),
						S0_T4.trd_cur_amt.as("src_trd_cur_amt"),
						S0_T4.trd_cur_proc_amt.as("src_trd_cur_proc_amt"),
						S0_T4.trd_cur_onr_prov_amt.as("src_trd_cur_onr_prov_amt"),
						S0_T4.trd_cur_tax_amt.as("src_trd_cur_tax_amt"),
						S0_T4.trd_cur_dscnt_amt.as("src_trd_cur_dscnt_amt"),
						S0_T4.wtax_rate.as("src_wtax_rate"),
						S0_T4.dscnt_rsn_cd,
						S0_T4.pay_crryovr_times,
						S0_T4.outsrc_flg,
						value(0).as("base_unit_qty_bf_cng"),
						S0_T1.base_unit_schd_qty,
						S0_T1.base_unit_purc_qty,
						nvl(
							S0_T2.arr_qty,
							value(0)
						).as("base_unit_arr_qty"),
						S0_T1.base_unit_accpt_dfct_qty,
						S0_T1.base_unit_purc_qty.add(S0_T1.base_unit_accpt_dfct_qty).as("base_unit_purc_act_qty"),
						S0_T3.arr_pr_no,
						S0_T3.upd_cntr.as("arr_pr_upd_cntr"),
						S0_M30.dlv_cal_cd.as("scst_cal_cd"),
						nvl(
							S0_T9.dlv_cd,
							S0_T4.dlv_cd
						).as("scst_cd"),
						nvl2(
							S0_T9.dlv_cd,
							nvl(
								S0_T9.dlv_nm,
								S0_M30.bp_nm
							),
							decode(
								S0_T4.dlv_sundry_flg,
								value(true),
								S0_T4.dlv_nm,
								S0_M30.bp_nm
							)
						).as("scst_nm"),
						S0_M30.cntry_cd.as("scst_cntry_cd"),
						nvl2(
							S0_T9.dlv_cd,
							S0_T9.dlv_sundry_flg,
							S0_T4.dlv_sundry_flg
						).as("scst_sundry_flg"),
						nvl2(
							S0_T9.dlv_cd,
							S0_T9.dlv_cntct_dpt,
							S0_T4.dlv_cntct_dpt
						).as("scst_cntct_dpt"),
						nvl2(
							S0_T9.dlv_cd,
							S0_T9.dlv_cntct_psn,
							S0_T4.dlv_cntct_psn
						).as("scst_cntct_psn"),
						nvl2(
							S0_T9.dlv_cd,
							S0_T9.dlv_zip_cd,
							S0_T4.dlv_zip_cd
						).as("scst_zip_cd"),
						nvl2(
							S0_T9.dlv_cd,
							S0_T9.dlv_addr1,
							S0_T4.dlv_addr1
						).as("scst_addr1"),
						nvl2(
							S0_T9.dlv_cd,
							S0_T9.dlv_addr2,
							S0_T4.dlv_addr2
						).as("scst_addr2"),
						nvl2(
							S0_T9.dlv_cd,
							S0_T9.dlv_addr3,
							S0_T4.dlv_addr3
						).as("scst_addr3"),
						nvl2(
							S0_T9.dlv_cd,
							S0_T9.dlv_addr4,
							S0_T4.dlv_addr4
						).as("scst_addr4"),
						nvl2(
							S0_T9.dlv_cd,
							S0_T9.dlv_tel,
							S0_T4.dlv_tel
						).as("scst_tel"),
						nvl2(
							S0_T9.dlv_cd,
							S0_T9.dlv_fax,
							S0_T4.dlv_fax
						).as("scst_fax"),
						S0_T4.drct_dlv_typ,
						nvl(
							S0_T9.tdlv_cd,
							S0_T4.tdlv_cd
						).as("tdlv_cd"),
						nvl2(
							S0_T9.tdlv_cd,
							nvl(
								S0_T9.tdlv_nm,
								S0_M31.bp_nm
							),
							decode(
								S0_T4.tdlv_sundry_flg,
								value(true),
								S0_T4.tdlv_nm,
								S0_M31.bp_nm
							)
						).as("tdlv_nm"),
						S0_M31.cntry_cd.as("tdlv_cntry_cd"),
						nvl2(
							S0_T9.tdlv_cd,
							S0_T9.tdlv_cntct_dpt,
							S0_T4.tdlv_cntct_dpt
						).as("tdlv_cntct_dpt"),
						nvl2(
							S0_T9.tdlv_cd,
							S0_T9.tdlv_cntct_psn,
							S0_T4.tdlv_cntct_psn
						).as("tdlv_cntct_psn"),
						nvl2(
							S0_T9.tdlv_cd,
							S0_T9.tdlv_sundry_flg,
							S0_T4.tdlv_sundry_flg
						).as("tdlv_sundry_flg"),
						nvl2(
							S0_T9.tdlv_cd,
							S0_T9.tdlv_zip_cd,
							S0_T4.tdlv_zip_cd
						).as("tdlv_zip_cd"),
						nvl2(
							S0_T9.tdlv_cd,
							S0_T9.tdlv_addr1,
							S0_T4.tdlv_addr1
						).as("tdlv_addr1"),
						nvl2(
							S0_T9.tdlv_cd,
							S0_T9.tdlv_addr2,
							S0_T4.tdlv_addr2
						).as("tdlv_addr2"),
						nvl2(
							S0_T9.tdlv_cd,
							S0_T9.tdlv_addr3,
							S0_T4.tdlv_addr3
						).as("tdlv_addr3"),
						nvl2(
							S0_T9.tdlv_cd,
							S0_T9.tdlv_addr4,
							S0_T4.tdlv_addr4
						).as("tdlv_addr4"),
						nvl2(
							S0_T9.tdlv_cd,
							S0_T9.tdlv_tel,
							S0_T4.tdlv_tel
						).as("tdlv_tel"),
						nvl2(
							S0_T9.tdlv_cd,
							S0_T9.tdlv_fax,
							S0_T4.tdlv_fax
						).as("tdlv_fax"),
						coalesce(
							S0_T4.wtax_rate,
							MAPA_TAX$F_GET_WTAX_RATE(
								S0_T4.itm_cd,
								S0_T4.itm_sub1,
								S0_T4.itm_sub2,
								S0_T4.itm_sub3,
								bind("base_dt")
							)
						).as("wtax_rate"),
						S0_T4.wtax_amt.as("trd_cur_wtax_amt"),
						S0_T4.trd_d_rmrks,
						S0_T4.mfg_loc_cd,
						S0_T4.bom_ptn,
						// this field is appended by sql coverter.
						S0_T2.sno1.as("join_sno1_"),
						// this field is appended by sql coverter.
						S0_T4.slo_d_no.as("join_slo_d_no_"),
						S0_T1.non_purc_flg,
						addDynamicSelect(REP1)
					)
					.from(
						S0_T1
						.innerJoin(S0_T2).on(
							bracket(
								S0_T1.arr_schd_no.eq(S0_T2.arr_schd_no)
							)
						)
						.innerJoin(S0_T3).on(
							bracket(
								S0_T1.arr_pr_no.eq(S0_T3.arr_pr_no)
							)
						)
						.innerJoin(S0_T4).on(
							bracket(
								S0_T3.po_d_no.eq(S0_T4.po_d_no)
							)
						)
						.innerJoin(S0_T5).on(
							bracket(
								S0_T4.po_no.eq(S0_T5.po_no)
							)
						)
						.leftOuterJoin(S0_T8).on(
							bracket(
								S0_T2.prms_rcpt_d_no.eq(S0_T8.prms_rcpt_d_no)
							)
						)
						.leftOuterJoin(S0_T9).on(
							bracket(
								S0_T2.dlv_inst_d_no.eq(S0_T9.dlv_inst_d_no)
								.or(S0_T8.dlv_inst_d_no.eq(S0_T9.dlv_inst_d_no))
							)
						)
						.leftOuterJoin(S0_M1).on(
							bracket(
								S0_T4.itm_cd.eq(S0_M1.itm_cd)
								.and(S0_T4.itm_sub1.eq(S0_M1.itm_sub1))
								.and(S0_T4.itm_sub2.eq(S0_M1.itm_sub2))
								.and(S0_T4.itm_sub3.eq(S0_M1.itm_sub3))
							)
						)
						.leftOuterJoin(S0_M3).on(
							bracket(
								S0_T5.sppl_cd.eq(S0_M3.bp_cd)
							)
						)
						.leftOuterJoin(S0_M6).on(
							bracket(
								S0_T4.bd_dpt_cd.eq(S0_M6.dpt_cd)
								.and(S0_T5.po_dt.between(S0_M6.st_dt, S0_M6.end_dt))
							)
						)
						.leftOuterJoin(S0_M13).on(
							bracket(
								S0_T4.ap_dpt_cd.eq(S0_M13.dpt_cd)
								.and(S0_T5.po_dt.between(S0_M13.st_dt, S0_M13.end_dt))
							)
						)
						.leftOuterJoin(S0_M30).on(
							bracket(
								S0_M30.bp_cd.eq(nvl(
										S0_T9.dlv_cd,
										S0_T4.dlv_cd
									)
								)
							)
						)
						.leftOuterJoin(S0_M31).on(
							bracket(
								S0_M31.bp_cd.eq(nvl(
										S0_T9.tdlv_cd,
										S0_T4.tdlv_cd
									)
								)
							)
						)
						.leftOuterJoin(S0_T10).on
							(bracket(
									S0_T10.slo_d_no.eq(S0_T4.slo_d_no)
								)
						)
						.addDynamicView(REP1)
					)
					.where(
						value(0).eq(value(0))
						.addDynamicPredicate(REP1)
					)
			)
			.setJoinInfo(
				joinInfo(
					j -> j
						.add(MSVT_WRK_SNO_R.class, r -> toCondition(
							r.getStringNE("join_sno1_")
						))
						.addSelect(m -> toArray(
							m.wrk_nm,
							m.wrk_no
						))
						.addMap((r, m) -> {
							r.setStringNE("wrk_no", m.wrk_no());
							r.setStringNE("wrk_nm", m.wrk_nm());
					}),
					j -> j
						.add(MST_SLO_D_R.class, r -> toCondition(
							r.getStringNE("join_slo_d_no_")
						))
						.addSelect(m -> toArray(
							m.slo_d_no,
							m.slo_no
						))
						.addMap((r, m) -> {
							r.setStringNE("slo_d_no", m.slo_d_no());
							r.setStringNE("slo_no", m.slo_no());
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
							r.getStringNE("schd_unit_cd")
						))
						.addSelect(m -> toArray(
							m.conv_base_qty,
							m.conv_qty,
							m.dec_place,
							m.rnd_typ
						))
						.addMap((r, m) -> {
							r.setNumberNE("schd_trd_unit_conv_qty", m.conv_qty());
							r.setNumberNE("schd_trd_unit_conv_base_qty", m.conv_base_qty());
							r.setNumberNE("schd_trd_unit_dec_place", m.dec_place());
							r.setStringNE("schd_trd_unit_rnd_typ", m.rnd_typ());
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
							r.setStringNE("bd_lot_no_typ", m.lot_no_typ());
							r.setStringNE("bd_sublot_mng_typ", m.sublot_mng_typ());
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
						.add(MAM_BP_R.class, r -> toCondition(
							r.getStringNE("bd_bp_cd")
						))
						.addSelect(m -> toArray(
							m.bp_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("bd_bp_nm", m.bp_nm());
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
						.add(MAM_BIZ_RSN_R.class, r -> toCondition(
							r.getStringNE("purc_rsn_cd")
						))
						.addSelect(m -> toArray(
							m.biz_rsn_nm,
							m.xpns_purc_flg
						))
						.addMap((r, m) -> {
							r.setStringNE("purc_rsn_nm", m.biz_rsn_nm());
							r.setBooleanNE("xpns_purc_flg", m.xpns_purc_flg());
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
						.add(MAM_LOC_R.class, r -> toCondition(
							r.getStringNE("dlv_loc_cd")
						))
						.addSelect(m -> toArray(
							m.loc_mng_typ,
							m.loc_nm,
							m.site_cd,
							m.sppl_cd,
							m.str_ln_tgt_flg,
							m.wg_cd
						))
						.addMap((r, m) -> {
							r.setStringNE("site_cd", m.site_cd());
							r.setStringNE("dlv_loc_nm", m.loc_nm());
							r.setStringNE("dlv_loc_wg_cd", m.wg_cd());
							r.setStringNE("dlv_loc_sppl_cd", m.sppl_cd());
							r.setStringNE("loc_mng_typ", m.loc_mng_typ());
							r.setBooleanNE("str_ln_tgt_flg", m.str_ln_tgt_flg());
					}),
					j -> j
						.add(MAM_STR_LN_R.class, r -> toCondition(
							r.getStringNE("dlv_loc_cd"),
							r.getStringNE("str_ln_cd")
						))
						.addSelect(m -> toArray(
							m.str_ln_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("str_ln_nm", m.str_ln_nm());
					}),
					j -> j
						.add(MAM_TAX_R.class, r -> toCondition(
							r.getStringNE("src_tax_cd")
						))
						.addSelect(m -> toArray(
							m.inc_tax_flg,
							m.tax_nm,
							m.tax_rate,
							m.tax_typ
						))
						.addMap((r, m) -> {
							r.setStringNE("src_tax_nm", m.tax_nm());
							r.setNumberNE("src_tax_rate", m.tax_rate());
							r.setStringNE("src_tax_typ", m.tax_typ());
							r.setBooleanNE("src_inc_tax_flg", m.inc_tax_flg());
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
							r.setNumberNE("src_trd_unit_conv_qty", m.conv_qty());
							r.setNumberNE("src_trd_unit_conv_base_qty", m.conv_base_qty());
							r.setNumberNE("src_trd_unit_dec_place", m.dec_place());
							r.setStringNE("src_trd_unit_rnd_typ", m.rnd_typ());
					}),
					j -> j
						.add(MAM_WG_R.class, r -> toCondition(
							r.getStringNE("dlv_loc_wg_cd")
						))
						.addSelect(m -> toArray(
							m.wg_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("dlv_loc_wg_nm", m.wg_nm());
					}),
					j -> j
						.add(MAM_UNIT_R.class, r -> toCondition(
							r.getStringNE("cont_fctr_unit_cd")
						))
						.addSelect(m -> toArray(
							m.unit_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("cont_unit_nm", m.unit_nm());
					}),
					j -> j
						.add(MAM_CNTRY_R.class, r -> toCondition(
							r.getStringNE("scst_cntry_cd")
						))
						.addSelect(m -> toArray(
							m.cntry_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("scst_cntry_nm", m.cntry_nm());
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
					}),
					j -> j
						.add(MAM_LOC_R.class, r -> toCondition(
							r.getStringNE("dlv_loc_cd")
						))
						.addSelect(m -> toArray(
							m.cal_cd,
							m.loc_cd,
							m.sppl_cd
						))
						.addMap((r, m) -> {
							r.setStringNE("re_arr_loc_site_cd", m.loc_cd());
							r.setStringNE("re_arr_loc_cal_cd", m.cal_cd());
							r.setStringNE("re_arr_loc_sppl_cd", m.sppl_cd());
					}),
					j -> j
						.add(MAM_BP_R.class, r -> toCondition(
							r.getStringNE("re_arr_loc_sppl_cd")
						))
						.addSelect(m -> toArray(
							m.sppl_cal_cd
						))
						.addMap((r, m) -> {
							r.setStringNE("re_arr_loc_sppl_cal_cd", m.sppl_cal_cd());
					})
				)
			);
	}
	
	static MCDynamicSQLInfo MSBDL0140_MST_PURC_SCHD_S01_WHERE01() {
		MST_PURC_SCHD_R S0_T1 = MST_PURC_SCHD_R.create("T1");
		MST_PO_R S0_T5 = MST_PO_R.create("T5");
		MCDynamicSQLID REP1 = createDynamicSQLID("REP1");
		
		return
				when(null)
					.predicate(REP1, p ->
						p.and(S0_T1.cmpl_flg.eq(value(false)))
						.cutoff$and(S0_T5.po_no.eq(bind("po_no")))
						.cutoff$and(S0_T1.purc_schd_dt.lte(bind("purc_schd_dt_to")))
					);
	}
	
	/**
	 * -- MSBDL0140_MST_PURC_SCHD_Query_S02
	 */
	static MCQueryPlan MSBDL0140_MST_PURC_SCHD_S02() {
		MST_PURC_SCHD_R S0_T4 = MST_PURC_SCHD_R.create("T4");
		MST_ARR_SCHD_R S0_T5 = MST_ARR_SCHD_R.create("T5");
		MST_ARR_PR_R S0_T6 = MST_ARR_PR_R.create("T6");
		MST_PO_D_R S0_T7 = MST_PO_D_R.create("T7");
		MST_PO_R S0_T9 = MST_PO_R.create("T9");
		MST_ARR_ACT_R S0_T10 = MST_ARR_ACT_R.create("T10");
		MST_STK_R S0_T11 = MST_STK_R.create("T11");
		MST_PO_SCHD_R S0_T14 = MST_PO_SCHD_R.create("T14");
		MCTempView S0_T15 = createTempView("T15");
		MAM_ITM_R S0_M16 = MAM_ITM_R.create("M16");
		MAM_LOC_R S0_M18 = MAM_LOC_R.create("M18");
		MAM_LOC_R S0_M181 = MAM_LOC_R.create("M181");
		MAM_SITE_R S0_M182 = MAM_SITE_R.create("M182");
		MAM_SITE_R S0_M183 = MAM_SITE_R.create("M183");
		MAM_WG_R S0_M19 = MAM_WG_R.create("M19");
		MAM_WG_R S0_M191 = MAM_WG_R.create("M191");
		MAM_STR_LN_R S0_M20 = MAM_STR_LN_R.create("M20");
		MAM_STR_LN_R S0_M201 = MAM_STR_LN_R.create("M201");
		MAM_STR_LN_R S0_M202 = MAM_STR_LN_R.create("M202");
		MAM_STK_GD_R S0_M21 = MAM_STK_GD_R.create("M21");
		MAM_STK_GD_R S0_M211 = MAM_STK_GD_R.create("M211");
		MAM_STK_GD_R S0_M213 = MAM_STK_GD_R.create("M213");
		MAVM_ITM_UNIT_R S0_M35 = MAVM_ITM_UNIT_R.create("M35");
		MAVM_ITM_UNIT_R S0_M36 = MAVM_ITM_UNIT_R.create("M36");
		MAM_UNIT_R S0_M221 = MAM_UNIT_R.create("M221");
		MAVM_ITM_UNIT_R S0_M351 = MAVM_ITM_UNIT_R.create("M351");
		MAM_UNIT_R S0_M222 = MAM_UNIT_R.create("M222");
		MAVM_ITM_UNIT_R S0_M352 = MAVM_ITM_UNIT_R.create("M352");
		MST_PURC_ACT_IO_R S1_T1 = MST_PURC_ACT_IO_R.create("T1");
		MST_PURC_ACT_D_R S1_T2 = MST_PURC_ACT_D_R.create("T2");
		MST_PURC_ACT_R S1_T3 = MST_PURC_ACT_R.create("T3");
		
		MCDynamicSQLID REP1 = createDynamicSQLID("REP1");
		MCDynamicSQLID REP2 = createDynamicSQLID("REP2");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBDL0140_MST_PURC_SCHD_Query_S02")
					.mainQuery()
					.select(
						S0_T4.purc_schd_no,
						S0_T4.purc_schd_dt,
						S0_T4.arr_schd_no,
						S0_T7.po_d_no,
						S0_T9.po_no,
						S0_T10.arr_act_no,
						S0_T7.itm_cd,
						S0_T7.itm_sub1,
						S0_T7.itm_sub2,
						S0_T7.itm_sub3,
						S0_M16.dscnt_itm_flg,
						S0_M16.ver_flg,
						S0_M16.stk_mng_typ,
						S0_M16.lot_mng_typ,
						S0_M16.lot_no_typ,
						S0_M16.sublot_mng_typ,
						S0_M16.sublot_no_typ,
						S0_M16.sno1_mng_typ,
						S0_M16.sno2_mng_typ,
						S0_M16.sno3_mng_typ,
						S0_M16.sno4_mng_typ,
						S0_M16.bp_lot_flg,
						S0_T7.sno1,
						S0_T7.sno2,
						S0_T7.sno3,
						S0_T7.sno4,
						nvl(
							S0_T10.ver_no,
							S0_T5.ver_no
						).as("ver_no"),
						nvl(
							S0_T11.lot_no,
							S0_T5.lot_no
						).as("lot_no"),
						nvl(
							S0_T11.sublot_no,
							S0_T5.sublot_no
						).as("sublot_no"),
						decode(
							S0_M16.stk_mng_typ,
							value(MAC_STK_MNG_TYP.NOT_MNG.value()),
							S0_T10.quality_typ,
							nvl(
								S0_T11.quality_typ,
								S0_T5.quality_typ
							)
						).as("quality_typ"),
						decode(
							S0_M16.stk_mng_typ,
							value(MAC_STK_MNG_TYP.NOT_MNG.value()),
							S0_T10.stk_insp_typ,
							nvl(
								S0_T11.stk_insp_typ,
								S0_T5.stk_insp_typ
							)
						).as("stk_insp_typ"),
						decode(
							S0_M16.stk_mng_typ,
							value(MAC_STK_MNG_TYP.NOT_MNG.value()),
							S0_T10.stk_id_typ,
							nvl(
								S0_T11.stk_id_typ,
								S0_T5.stk_id_typ
							)
						).as("stk_id_typ"),
						nvl(
							S0_T11.stk_bp_cd,
							S0_T5.stk_bp_cd
						).as("stk_bp_cd"),
						nvl(
							S0_T11.pack_unit_cd,
							S0_T4.trd_unit_cd
						).as("trd_unit_cd"),
						nvl(
							S0_M222.unit_nm,
							S0_M221.unit_nm
						).as("trd_unit_nm"),
						nvl(
							S0_M352.dec_place,
							S0_M351.dec_place
						).as("trd_unit_dec_place"),
						nvl(
							S0_M352.rnd_typ,
							S0_M351.rnd_typ
						).as("trd_unit_rnd_typ"),
						nvl(
							S0_M352.conv_base_qty,
							S0_M351.conv_base_qty
						).as("trd_unit_conv_base_qty"),
						nvl(
							S0_M352.conv_qty,
							S0_M351.conv_qty
						).as("trd_unit_conv_qty"),
						S0_T4.trd_unit_cd.as("schd_trd_unit_cd"),
						decode(
							S0_T5.arr_skip_flg,
							value(true),
							S0_T4.trd_unit_schd_qty,
							S0_T5.trd_unit_qty
						).as("schd_trd_unit_qty"),
						S0_M351.conv_qty.as("schd_trd_unit_conv_qty"),
						S0_M351.conv_base_qty.as("schd_trd_unit_conv_base_qty"),
						S0_M351.dec_place.as("schd_trd_unit_dec_place"),
						S0_M351.rnd_typ.as("schd_trd_unit_rnd_typ"),
						S0_T4.base_unit_cd,
						S0_M16.dec_place.as("base_unit_dec_place"),
						S0_M16.rnd_typ.as("base_unit_rnd_typ"),
						decode(
							S0_T5.arr_skip_flg,
							value(true),
							S0_T4.base_unit_schd_qty,
							S0_T5.base_unit_qty
						).as("base_unit_schd_qty"),
						nvl(
							S0_T11.base_unit_qty,
							S0_T10.base_unit_qty.subtract(
								nvl(
									S0_T15.pr("base_unit_qty"),
									value(0)
								)
							)
						).as("base_unit_qty"),
						S0_T4.base_unit_purc_qty,
						S0_T5.arr_qty.as("base_unit_arr_qty"),
						nvl(
							S0_T10.bp_lot_no,
							S0_T5.bp_lot_no
						).as("bp_lot_no"),
						nvl(
							S0_T11.loc_cd,
							S0_T10.arr_loc_cd
						).as("gi_loc_cd"),
						nvl(
							S0_M181.wg_cd,
							S0_M18.wg_cd
						).as("gi_wg_cd"),
						nvl(
							S0_T11.str_ln_cd,
							S0_T10.str_ln_cd
						).as("gi_str_ln_cd"),
						nvl(
							S0_T11.gd_cd,
							S0_T10.gd_cd
						).as("from_gd_cd"),
						nvl(
							S0_T11.pack_unit_cd,
							S0_T10.pack_unit_cd
						).as("gi_unit_cd"),
						decode(
							S0_M16.stk_mng_typ,
							value(MAC_STK_MNG_TYP.NOT_MNG.value()),
							S0_T10.arr_loc_cd,
							nvl(
								S0_T11.loc_cd,
								S0_T5.arr_loc_cd
							)
						).as("dlv_loc_cd"),
						decode(
							S0_M16.stk_mng_typ,
							value(MAC_STK_MNG_TYP.NOT_MNG.value()),
							S0_M18.loc_nm,
							nvl(
								S0_M181.loc_nm,
								S0_M18.loc_nm
							)
						).as("dlv_loc_nm"),
						nvl(
							S0_M181.sppl_cd,
							S0_M18.sppl_cd
						).as("dlv_loc_sppl_cd"),
						nvl(
							S0_M181.site_cd,
							S0_M18.site_cd
						).as("site_cd"),
						nvl(
							S0_M183.site_nm,
							S0_M182.site_nm
						).as("site_nm"),
						nvl(
							S0_M181.wg_cd,
							S0_M18.wg_cd
						).as("dlv_loc_wg_cd"),
						nvl(
							S0_M191.wg_nm,
							S0_M19.wg_nm
						).as("dlv_loc_wg_nm"),
						nvl(
							S0_M181.str_ln_tgt_flg,
							S0_M18.str_ln_tgt_flg
						).as("str_ln_tgt_flg"),
						decode(
							S0_M16.stk_mng_typ,
							value(MAC_STK_MNG_TYP.NOT_MNG.value()),
							S0_T10.str_ln_cd,
							nvl(
								S0_T11.str_ln_cd,
								S0_T5.str_ln_cd
							)
						).as("str_ln_cd"),
						decode(
							S0_M16.stk_mng_typ,
							value(MAC_STK_MNG_TYP.NOT_MNG.value()),
							S0_M202.str_ln_nm,
							nvl(
								S0_M201.str_ln_nm,
								S0_M20.str_ln_nm
							)
						).as("str_ln_nm"),
						decode(
							S0_M16.stk_mng_typ,
							value(MAC_STK_MNG_TYP.NOT_MNG.value()),
							S0_T10.gd_cd,
							nvl(
								S0_T11.gd_cd,
								S0_T5.gd_cd
							)
						).as("gd_cd"),
						decode(
							S0_M16.stk_mng_typ,
							value(MAC_STK_MNG_TYP.NOT_MNG.value()),
							S0_M213.gd_nm,
							nvl(
								S0_M211.gd_nm,
								S0_M21.gd_nm
							)
						).as("gd_nm"),
						nvl(
							S0_T10.bp_lot_no,
							S0_T5.bp_lot_no
						).as("bp_lot_no"),
						S0_T10.bp_dlv_slip_no,
						S0_T10.bp_dlv_slip_d_no,
						S0_T10.ship_fr_valid_dt,
						nvl2(
							S0_T10.arr_act_no,
							value(false),
							S0_T5.sync_flg
						).as("sync_flg"),
						S0_T10.purc_cont_qty,
						S0_M16.cont_fctr_flg,
						S0_M16.cont_fctr_dec_place,
						S0_M16.cont_fctr_rnd_typ,
						S0_M16.std_cont_fctr,
						S0_M16.cont_fctr_unit_cd,
						S0_M16.purc_upri_cng_flg.as("itm_purc_upri_cng_flg"),
						coalesce(
							S0_T7.wtax_rate,
							MAPA_TAX$F_GET_WTAX_RATE(
								S0_T7.itm_cd,
								S0_T7.itm_sub1,
								S0_T7.itm_sub2,
								S0_T7.itm_sub3,
								bind("base_dt")
							)
						).as("wtax_rate"),
						S0_T7.wtax_amt.as("trd_cur_wtax_amt"),
						S0_T7.upri_not_tgt_flg,
						// this field is appended by sql coverter.
						S0_T5.sno1.as("join_sno1_")
						,addDynamicSelect(REP1)
					)
					.from(
						S0_T4
						.leftOuterJoin(S0_T5).on(
							bracket(
								S0_T4.arr_schd_no.eq(S0_T5.arr_schd_no)
							)
						)
						.leftOuterJoin(S0_T6).on(
							bracket(
								S0_T4.arr_pr_no.eq(S0_T6.arr_pr_no)
							)
						)
						.leftOuterJoin(S0_T7).on(
							bracket(
								S0_T6.po_d_no.eq(S0_T7.po_d_no)
							)
						)
						.leftOuterJoin(S0_T9).on(
							bracket(
								S0_T7.po_no.eq(S0_T9.po_no)
							)
						)
						.leftOuterJoin(S0_T10).on(
							bracket(
								S0_T4.arr_schd_no.eq(S0_T10.arr_schd_no)
								.and(S0_T10.can_flg.eq(value(false)))
							)
						)
						.addDynamicView(REP2)
						.leftOuterJoin(S0_T14).on(
							bracket(
								S0_T7.po_schd_no.eq(S0_T14.po_schd_no)
							)
						)
						.leftOuterJoin(
							subQuery()
							.select(
								S1_T1.arr_act_no,
								sum(S1_T1.base_unit_qty).as("base_unit_qty")
							)
							.from(
								S1_T1
								.innerJoin(S1_T2).on(
									S1_T1.purc_act_d_no.eq(S1_T2.purc_act_d_no)
									.and(S1_T1.purc_act_d_seq.eq(S1_T2.purc_act_d_seq))
								)
								.innerJoin(S1_T3).on(
									S1_T2.purc_act_no.eq(S1_T3.purc_act_no)
									.and(S1_T2.purc_act_seq.eq(S1_T3.purc_act_seq))
								)
							)
							.where(
								S1_T3.slip_sts_typ.eq(value(MAC_SLIP_STS_TYP.CRT.value()))
								.and(S1_T3.po_no.eq(bind("po_no")))
							)
							.groupBy(S1_T1.arr_act_no).view(S0_T15)
						).on(S0_T10.arr_act_no.eq(S0_T15.pr(S1_T1.arr_act_no)))
						.leftOuterJoin(S0_M16).on(
							bracket(
								S0_T7.itm_cd.eq(S0_M16.itm_cd)
								.and(S0_T7.itm_sub1.eq(S0_M16.itm_sub1))
								.and(S0_T7.itm_sub2.eq(S0_M16.itm_sub2))
								.and(S0_T7.itm_sub3.eq(S0_M16.itm_sub3))
							)
						)
						.leftOuterJoin(S0_M18).on(
							bracket(
								S0_T10.arr_loc_cd.eq(S0_M18.loc_cd)
							)
						)
						.leftOuterJoin(S0_M181).on(
							bracket(
								S0_T11.loc_cd.eq(S0_M181.loc_cd)
							)
						)
						.leftOuterJoin(S0_M182).on(
							bracket(
								S0_M18.site_cd.eq(S0_M182.site_cd)
							)
						)
						.leftOuterJoin(S0_M183).on(
							bracket(
								S0_M181.site_cd.eq(S0_M183.site_cd)
							)
						)
						.leftOuterJoin(S0_M19).on(
							bracket(
								S0_M18.wg_cd.eq(S0_M19.wg_cd)
							)
						)
						.leftOuterJoin(S0_M191).on(
							bracket(
								S0_M181.wg_cd.eq(S0_M191.wg_cd)
							)
						)
						.leftOuterJoin(S0_M20).on(
							bracket(
								S0_T5.arr_loc_cd.eq(S0_M20.loc_cd)
								.and(S0_T5.str_ln_cd.eq(S0_M20.str_ln_cd))
							)
						)
						.leftOuterJoin(S0_M201).on(
							bracket(
								S0_T11.loc_cd.eq(S0_M201.loc_cd)
								.and(S0_T11.str_ln_cd.eq(S0_M201.str_ln_cd))
							)
						)
						.leftOuterJoin(S0_M202).on(
							bracket(
								S0_T10.arr_loc_cd.eq(S0_M202.loc_cd)
								.and(S0_T10.str_ln_cd.eq(S0_M202.str_ln_cd))
							)
						)
						.leftOuterJoin(S0_M21).on(
							bracket(
								S0_T5.gd_cd.eq(S0_M21.gd_cd)
							)
						)
						.leftOuterJoin(S0_M211).on(
							bracket(
								S0_T11.gd_cd.eq(S0_M211.gd_cd)
							)
						)
						.leftOuterJoin(S0_M213).on(
							bracket(
								S0_T10.gd_cd.eq(S0_M213.gd_cd)
							)
						)
						.leftOuterJoin(S0_M35).on(
							bracket(
								S0_T7.itm_cd.eq(S0_M35.itm_cd)
								.and(S0_T7.itm_sub1.eq(S0_M35.itm_sub1))
								.and(S0_T7.itm_sub2.eq(S0_M35.itm_sub2))
								.and(S0_T7.itm_sub3.eq(S0_M35.itm_sub3))
								.and(S0_T7.trd_unit_cd.eq(S0_M35.unit_cd))
							)
						)
						.leftOuterJoin(S0_M36).on(
							bracket(
								S0_T7.itm_cd.eq(S0_M36.itm_cd)
								.and(S0_T7.itm_sub1.eq(S0_M36.itm_sub1))
								.and(S0_T7.itm_sub2.eq(S0_M36.itm_sub2))
								.and(S0_T7.itm_sub3.eq(S0_M36.itm_sub3))
								.and(S0_T7.base_unit_cd.eq(S0_M36.unit_cd))
							)
						)
						.leftOuterJoin(S0_M221).on(
							bracket(
								S0_T4.trd_unit_cd.eq(S0_M221.unit_cd)
							)
						)
						.leftOuterJoin(S0_M351).on(
							bracket(
								S0_T7.itm_cd.eq(S0_M351.itm_cd)
								.and(S0_T7.itm_sub1.eq(S0_M351.itm_sub1))
								.and(S0_T7.itm_sub2.eq(S0_M351.itm_sub2))
								.and(S0_T7.itm_sub3.eq(S0_M351.itm_sub3))
								.and(S0_T4.trd_unit_cd.eq(S0_M351.unit_cd))
							)
						)
						.leftOuterJoin(S0_M222).on(
							bracket(
								S0_T11.pack_unit_cd.eq(S0_M222.unit_cd)
							)
						)
						.leftOuterJoin(S0_M352).on(
							bracket(
								S0_T7.itm_cd.eq(S0_M352.itm_cd)
								.and(S0_T7.itm_sub1.eq(S0_M352.itm_sub1))
								.and(S0_T7.itm_sub2.eq(S0_M352.itm_sub2))
								.and(S0_T7.itm_sub3.eq(S0_M352.itm_sub3))
								.and(S0_T11.pack_unit_cd.eq(S0_M352.unit_cd))
							)
						)
						.addDynamicView(REP1)
					)
					.where(
						value(0).eq(value(0))
						.and(S0_T4.abort_flg.eq(value(false)))
						.and(S0_T10.sync_flg.eq(value(false)))
						.and(
							S0_T10.base_unit_qty.subtract(nvl(
									S0_T15.pr("base_unit_qty"),
									value(0)
								)).gt(value(0))
						)
						.addDynamicPredicate(REP1)
					)
			)
			.setJoinInfo(
				joinInfo(
					j -> j
						.add(MSVT_WRK_SNO_R.class, r -> toCondition(
							r.getStringNE("join_sno1_")
						))
						.addSelect(m -> toArray(
							m.wrk_nm,
							m.wrk_no
						))
						.addMap((r, m) -> {
							r.setStringNE("wrk_no", m.wrk_no());
							r.setStringNE("wrk_nm", m.wrk_nm());
					}),
					j -> j
						.add(MAM_UNIT_R.class, r -> toCondition(
							r.getStringNE("cont_fctr_unit_cd")
						))
						.addSelect(m -> toArray(
							m.unit_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("cont_fctr_unit_nm", m.unit_nm());
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
					})
				)
			);
	}
	
	static MCDynamicSQLInfo MSBDL0140_MST_PURC_SCHD_S02_WHERE01() {
		MST_PURC_SCHD_R S0_T4 = MST_PURC_SCHD_R.create("T4");
		MST_PO_D_R S0_T7 = MST_PO_D_R.create("T7");
		MST_PO_R S0_T9 = MST_PO_R.create("T9");
		MST_ARR_ACT_R S0_T10 = MST_ARR_ACT_R.create("T10");
		MST_STK_R S0_T11 = MST_STK_R.create("T11");
		MAVM_RD_DPT_R S0_M0 = MAVM_RD_DPT_R.create("M0");

		MCDynamicSQLID REP1 = createDynamicSQLID("REP1");
		MCDynamicSQLID REP2 = createDynamicSQLID("REP2");

		return
				when(null)
				.view(REP1, v ->
					v.innerJoin(S0_M0).on(
						bracket(
							S0_T9.purc_dpt_cd.eq(S0_M0.dpt_cd)
						)
					)
				)
				.view(REP2, v ->
					v.leftOuterJoin(S0_T11).on(
						bracket(
							S0_T10.arr_act_no.eq(S0_T11.fix_no)
							.and(S0_T11.in_xfr_typ.eq(value(MSC_IN_XFR_TYP.IN_LOC.value())))
							.and(S0_T11.asst_typ.eq(value(MAC_ASST_TYP.OTH.value())))
							.and(S0_T11.stk_id_typ.neq(value(MSC_STK_ID_TYP.ACCPT_DFCT.value())))
							.and(S0_T11.fix_no_typ.eq(value(MSC_FIX_NO_TYP.ARR_ACT_NO.value())))
						)
					)
				)
				.predicate(REP1, p ->
				p.and(S0_T4.non_purc_flg.eq(value(false)))
				.and(S0_T4.cmpl_flg.eq(value(false)))
				.cutoff$and(S0_T7.po_no.eq(bind("po_no")))
				.cutoff$and(S0_T4.purc_schd_dt.lte(bind("purc_schd_dt_to")))
			);
	}
	
	/**
	 * -- MSBDL0140_MST_PURC_SCHD_Query_S03
	 */
	static MCQueryPlan MSBDL0140_MST_PURC_SCHD_S03() {
		MST_PURC_SCHD_R S0_T4 = MST_PURC_SCHD_R.create("T4");
		MST_ARR_SCHD_R S0_T5 = MST_ARR_SCHD_R.create("T5");
		MST_ARR_PR_R S0_T6 = MST_ARR_PR_R.create("T6");
		MST_PO_D_R S0_T7 = MST_PO_D_R.create("T7");
		MST_PO_R S0_T9 = MST_PO_R.create("T9");
		MST_PO_SCHD_R S0_T14 = MST_PO_SCHD_R.create("T14");
		
		MCDynamicSQLID REP1 = createDynamicSQLID("REP1");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBDL0140_MST_PURC_SCHD_Query_S03")
					.mainQuery()
					.select(
						S0_T4.purc_schd_no,
						S0_T4.purc_schd_dt.as("purc_schd_dt"),
						S0_T4.arr_schd_no,
						S0_T7.po_d_no,
						S0_T9.po_no,
						S0_T7.itm_cd,
						S0_T7.itm_sub1,
						S0_T7.itm_sub2,
						S0_T7.itm_sub3,
						S0_T7.sno1,
						S0_T7.sno2,
						S0_T7.sno3,
						S0_T7.sno4,
						S0_T5.ver_no,
						S0_T5.lot_no,
						S0_T5.sublot_no,
						S0_T5.quality_typ,
						S0_T5.stk_insp_typ,
						S0_T5.stk_id_typ,
						S0_T5.stk_bp_cd,
						S0_T4.trd_unit_cd,
						S0_T4.trd_unit_cd.as("schd_trd_unit_cd"),
						decode(
							S0_T5.arr_skip_flg,
							value(true),
							S0_T4.trd_unit_schd_qty,
							S0_T5.trd_unit_qty
						).as("schd_trd_unit_qty"),
						S0_T4.base_unit_cd,
						decode(
							S0_T5.arr_skip_flg,
							value(true),
							S0_T4.base_unit_schd_qty,
							S0_T5.base_unit_qty
						).as("base_unit_schd_qty"),
						decode(
							S0_T5.arr_skip_flg,
							value(true),
							S0_T4.base_unit_schd_qty.subtract(S0_T4.base_unit_purc_qty),
							S0_T5.base_unit_qty.subtract(S0_T5.arr_qty)
						).as("base_unit_qty"),
						S0_T4.base_unit_purc_qty,
						S0_T5.arr_qty.as("base_unit_arr_qty"),
						S0_T5.arr_loc_cd.as("gi_loc_cd"),
						S0_T5.str_ln_cd.as("gi_str_ln_cd"),
						S0_T5.gd_cd.as("from_gd_cd"),
						S0_T5.arr_loc_cd.as("dlv_loc_cd"),
						S0_T5.str_ln_cd,
						S0_T5.gd_cd,
						S0_T5.bp_lot_no,
						S0_T5.sync_flg,
						S0_T5.abort_flg,
						coalesce(
							S0_T7.wtax_rate,
							MAPA_TAX$F_GET_WTAX_RATE(
								S0_T7.itm_cd,
								S0_T7.itm_sub1,
								S0_T7.itm_sub2,
								S0_T7.itm_sub3,
								bind("base_dt")
							)
						).as("wtax_rate"),
						S0_T7.wtax_amt.as("trd_cur_wtax_amt"),
						S0_T7.upri_not_tgt_flg,
						// this field is appended by sql coverter.
						S0_T5.sno1.as("join_sno1_")
						,addDynamicSelect(REP1)
					)
					.from(
						S0_T4
						.leftOuterJoin(S0_T5).on(
							bracket(
								S0_T4.arr_schd_no.eq(S0_T5.arr_schd_no)
							)
						)
						.leftOuterJoin(S0_T6).on(
							bracket(
								S0_T4.arr_pr_no.eq(S0_T6.arr_pr_no)
							)
						)
						.leftOuterJoin(S0_T7).on(
							bracket(
								S0_T6.po_d_no.eq(S0_T7.po_d_no)
							)
						)
						.leftOuterJoin(S0_T9).on(
							bracket(
								S0_T7.po_no.eq(S0_T9.po_no)
							)
						)
						.leftOuterJoin(S0_T14).on(
							bracket(
								S0_T7.po_schd_no.eq(S0_T14.po_schd_no)
							)
						)
						.addDynamicView(REP1)
					)
					.where(
						value(0).eq(value(0))
						.and(S0_T4.abort_flg.eq(value(false)))
						.and(S0_T5.abort_flg.eq(value(false)))
						.addDynamicPredicate(REP1)
					)
			)
			.setJoinInfo(
				joinInfo(
					j -> j
						.add(MSVT_WRK_SNO_R.class, r -> toCondition(
							r.getStringNE("join_sno1_")
						))
						.addSelect(m -> toArray(
							m.wrk_nm,
							m.wrk_no
						))
						.addMap((r, m) -> {
							r.setStringNE("wrk_no", m.wrk_no());
							r.setStringNE("wrk_nm", m.wrk_nm());
					}),
					j -> j
						.add(MAM_ITM_R.class, r -> toCondition(
							r.getStringNE("itm_cd"),
							r.getStringNE("itm_sub1"),
							r.getStringNE("itm_sub2"),
							r.getStringNE("itm_sub3")
						))
						.addSelect(m -> toArray(
							m.bp_lot_flg,
							m.cont_fctr_dec_place,
							m.cont_fctr_flg,
							m.cont_fctr_rnd_typ,
							m.cont_fctr_unit_cd,
							m.dec_place,
							m.dscnt_itm_flg,
							m.lot_mng_typ,
							m.lot_no_typ,
							m.purc_upri_cng_flg,
							m.rnd_typ,
							m.sno1_mng_typ,
							m.sno2_mng_typ,
							m.sno3_mng_typ,
							m.sno4_mng_typ,
							m.std_cont_fctr,
							m.stk_mng_typ,
							m.sublot_mng_typ,
							m.sublot_no_typ,
							m.ver_flg
						))
						.addMap((r, m) -> {
							r.setBooleanNE("dscnt_itm_flg", m.dscnt_itm_flg());
							r.setBooleanNE("ver_flg", m.ver_flg());
							r.setStringNE("stk_mng_typ", m.stk_mng_typ());
							r.setStringNE("lot_mng_typ", m.lot_mng_typ());
							r.setStringNE("lot_no_typ", m.lot_no_typ());
							r.setStringNE("sublot_mng_typ", m.sublot_mng_typ());
							r.setStringNE("sublot_no_typ", m.sublot_no_typ());
							r.setStringNE("sno1_mng_typ", m.sno1_mng_typ());
							r.setStringNE("sno2_mng_typ", m.sno2_mng_typ());
							r.setStringNE("sno3_mng_typ", m.sno3_mng_typ());
							r.setStringNE("sno4_mng_typ", m.sno4_mng_typ());
							r.setBooleanNE("bp_lot_flg", m.bp_lot_flg());
							r.setNumberNE("base_unit_dec_place", m.dec_place());
							r.setStringNE("base_unit_rnd_typ", m.rnd_typ());
							r.setBooleanNE("cont_fctr_flg", m.cont_fctr_flg());
							r.setNumberNE("cont_fctr_dec_place", m.cont_fctr_dec_place());
							r.setStringNE("cont_fctr_rnd_typ", m.cont_fctr_rnd_typ());
							r.setNumberNE("std_cont_fctr", m.std_cont_fctr());
							r.setStringNE("cont_fctr_unit_cd", m.cont_fctr_unit_cd());
							r.setBooleanNE("itm_purc_upri_cng_flg", m.purc_upri_cng_flg());
					}),
					j -> j
						.add(MAM_UNIT_R.class, r -> toCondition(
							r.getStringNE("cont_fctr_unit_cd")
						))
						.addSelect(m -> toArray(
							m.unit_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("cont_fctr_unit_nm", m.unit_nm());
					}),
					j -> j
						.add(MAM_LOC_R.class, r -> toCondition(
							r.getStringNE("gi_loc_cd")
						))
						.addSelect(m -> toArray(
							m.loc_nm,
							m.site_cd,
							m.sppl_cd,
							m.str_ln_tgt_flg,
							m.wg_cd
						))
						.addMap((r, m) -> {
							r.setStringNE("gi_wg_cd", m.wg_cd());
							r.setStringNE("dlv_loc_nm", m.loc_nm());
							r.setStringNE("dlv_loc_sppl_cd", m.sppl_cd());
							r.setStringNE("site_cd", m.site_cd());
							r.setStringNE("dlv_loc_wg_cd", m.wg_cd());
							r.setBooleanNE("str_ln_tgt_flg", m.str_ln_tgt_flg());
					}),
					j -> j
						.add(MAM_SITE_R.class, r -> toCondition(
							r.getStringNE("site_cd")
						))
						.addSelect(m -> toArray(
							m.site_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("site_nm", m.site_nm());
					}),
					j -> j
						.add(MAM_WG_R.class, r -> toCondition(
							r.getStringNE("gi_wg_cd")
						))
						.addSelect(m -> toArray(
							m.wg_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("dlv_loc_wg_nm", m.wg_nm());
					}),
					j -> j
						.add(MAM_STR_LN_R.class, r -> toCondition(
							r.getStringNE("gi_loc_cd"),
							r.getStringNE("gi_str_ln_cd")
						))
						.addSelect(m -> toArray(
							m.str_ln_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("str_ln_nm", m.str_ln_nm());
					}),
					j -> j
						.add(MAM_STK_GD_R.class, r -> toCondition(
							r.getStringNE("from_gd_cd")
						))
						.addSelect(m -> toArray(
							m.gd_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("gd_nm", m.gd_nm());
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
							r.setStringNE("trd_unit_rnd_typ", m.rnd_typ());
							r.setNumberNE("trd_unit_conv_base_qty", m.conv_base_qty());
							r.setNumberNE("trd_unit_conv_qty", m.conv_qty());
							r.setNumberNE("schd_trd_unit_conv_qty", m.conv_qty());
							r.setNumberNE("schd_trd_unit_conv_base_qty", m.conv_base_qty());
							r.setNumberNE("schd_trd_unit_dec_place", m.dec_place());
							r.setStringNE("schd_trd_unit_rnd_typ", m.rnd_typ());
					})
				)
			);
	}
	
		static MCDynamicSQLInfo MSBDL0140_MST_PURC_SCHD_S03_WHERE01() {
			MST_PURC_SCHD_R S0_T4 = MST_PURC_SCHD_R.create("T4");
			MST_ARR_SCHD_R S0_T5 = MST_ARR_SCHD_R.create("T5");
			MST_PO_D_R S0_T7 = MST_PO_D_R.create("T7");
			MST_PO_R S0_T9 = MST_PO_R.create("T9");
			MAVM_RD_DPT_R S0_M0 = MAVM_RD_DPT_R.create("M0");
			
			MCDynamicSQLID REP1 = createDynamicSQLID("REP1");
			
			return
					when(null)
						.view(REP1, v ->
							v.innerJoin(S0_M0).on(
								bracket(
									S0_T9.purc_dpt_cd.eq(S0_M0.dpt_cd)
								)
							)
						)
						.predicate(REP1, p ->
							p.and(S0_T4.non_purc_flg.eq(value(false)))
							.and(S0_T4.cmpl_flg.eq(value(false)))
							.and(S0_T4.base_unit_schd_qty.subtract(S0_T5.arr_qty).gt(value(0)))
							.cutoff$and(S0_T7.po_no.eq(bind("po_no")))
							.cutoff$and(S0_T4.purc_schd_dt.lte(bind("purc_schd_dt_to")))
							.and(
									S0_T7.purc_basis_typ.eq(value(MAC_PURC_BASIS_TYP.IN_BASIS.value()))
									.and(
										S0_T5.arr_qty.eq(value(0))
									)
									.or(S0_T7.purc_basis_typ.neq(value(MAC_PURC_BASIS_TYP.IN_BASIS.value())))
									.or(S0_T7.purc_basis_typ.isNull())
							)
						);
		}
}