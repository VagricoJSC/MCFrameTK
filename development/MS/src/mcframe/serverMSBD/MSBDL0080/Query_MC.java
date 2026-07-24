package mcframe.serverMSBD.MSBDL0080;

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
	 * -- MSBDL0080_MST_PO_D_Query_S01
	 */
	static MCQueryPlan MSBDL0080_MST_PO_D_S01() {
		MST_PO_D_P_R S0_T2 = MST_PO_D_P_R.create("T2");
		MST_ARR_PR_R S0_T5 = MST_ARR_PR_R.create("T5");
		MST_PO_D_R S0_T8 = MST_PO_D_R.create("T8");
		MAM_ITM_R S0_M2 = MAM_ITM_R.create("M2");
		MAM_DPT_R S0_M33 = MAM_DPT_R.create("M33");
		MAM_BP_R S0_M20 = MAM_BP_R.create("M20");
		MAM_BP_R S0_M21 = MAM_BP_R.create("M21");
		MAM_DPT_R S0_M36 = MAM_DPT_R.create("M36");
		MAM_ITM_LCL_R S0_ITMLCL = MAM_ITM_LCL_R.create("ITMLCL");
		MST_ITM_MFG_INST_R S1_SM1 = MST_ITM_MFG_INST_R.create("SM1");
		MST_SLO_D_R S0_T10 = MST_SLO_D_R.create("T10");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBDL0080_MST_PO_D_Query_S01")
					.mainQuery()
					.select(
						S0_T2.bndl_flg,
						S0_T5.abort_flg,
						S0_T5.abort_flg.as("bef_abort_flg"),
						S0_T2.in_to_loc_cd,
						MAPA_LOC$F_GET_LOC_ADDR(
							S0_T2.in_to_loc_cd,
							bind("po_dt"),
							value(MAC_LOC_ADDR_TYP.ZIP_CD.value()),
							nullValue()
						).as("in_to_loc_zip_cd"),
						MAPA_LOC$F_GET_LOC_ADDR(
							S0_T2.in_to_loc_cd,
							bind("po_dt"),
							value(MAC_LOC_ADDR_TYP.ADDR1.value()),
							nullValue()
						).as("in_to_loc_addr1"),
						MAPA_LOC$F_GET_LOC_ADDR(
							S0_T2.in_to_loc_cd,
							bind("po_dt"),
							value(MAC_LOC_ADDR_TYP.ADDR2.value()),
							nullValue()
						).as("in_to_loc_addr2"),
						MAPA_LOC$F_GET_LOC_ADDR(
							S0_T2.in_to_loc_cd,
							bind("po_dt"),
							value(MAC_LOC_ADDR_TYP.ADDR3.value()),
							nullValue()
						).as("in_to_loc_addr3"),
						MAPA_LOC$F_GET_LOC_ADDR(
							S0_T2.in_to_loc_cd,
							bind("po_dt"),
							value(MAC_LOC_ADDR_TYP.ADDR4.value()),
							nullValue()
						).as("in_to_loc_addr4"),
						MAPA_LOC$F_GET_LOC_ADDR(
							S0_T2.in_to_loc_cd,
							bind("po_dt"),
							value(MAC_LOC_ADDR_TYP.TEL.value()),
							nullValue()
						).as("in_to_loc_tel"),
						MAPA_LOC$F_GET_LOC_ADDR(
							S0_T2.in_to_loc_cd,
							bind("po_dt"),
							value(MAC_LOC_ADDR_TYP.FAX.value()),
							nullValue()
						).as("in_to_loc_fax"),
						S0_T2.pri_print_flg,
						S0_T2.drct_dlv_typ,
						S0_T2.str_ln_cd,
						S0_T2.itm_cd,
						S0_T2.itm_sub1,
						S0_T2.itm_sub2,
						S0_T2.itm_sub3,
						decode(
							S0_T2.sundry_itm_flg,
							value(true),
							S0_T2.itm_nm,
							S0_M2.itm_nm
						).as("itm_nm"),
						decode(
							bind("sppl_iv_flg"),
							value(true),
							decode(
								S0_T2.sundry_itm_flg,
								value(true),
								S0_T2.iv_itm_nm,
								S0_ITMLCL.itm_nm
							),
							nullValue()
						).as("iv_itm_nm"),
						S0_T2.sundry_itm_flg,
						S0_M2.asset_mng_typ,
						S0_M2.purc_upri_cng_flg.as("itm_purc_upri_cng_flg"),
						S0_M2.dscnt_itm_flg,
						S0_M2.ver_flg,
						S0_T2.ver_no,
						S0_M2.pay_crryovr_times.as("itm_pay_crryovr_times"),
						S0_M2.sno1_mng_typ,
						S0_M2.sno2_mng_typ,
						S0_M2.sno3_mng_typ,
						S0_M2.sno4_mng_typ,
						S0_M2.stk_mng_typ,
						S0_M2.arr_skip_flg,
						S0_M2.purc_dlv_slip_flg,
						S0_T2.maker_cd,
						S0_T2.bp_lot_no,
						S0_T2.sppl_itm_cd,
						S0_T2.sppl_itm_nm,
						bracket(
								cases()
									.when(S0_T2.dlv_cd.isNotNull())
										.then(S0_T10.cst_itm_cd)
									.otherwise(nullValue())
							).as("cst_itm_cd"),
						bracket(
								cases()
									.when(S0_T2.dlv_cd.isNotNull())
										.then(S0_T10.cst_itm_nm)
									.otherwise(nullValue())
							).as("cst_itm_nm"),
						S0_T2.ap_dpt_cd,
						S0_M33.dpt_nm.as("ap_dpt_nm"),
						S0_T2.dlv_cd,
						S0_T2.dlv_sundry_flg,
						bracket(
							cases()
								.when(S0_T2.dlv_nm.isNull())
									.then(S0_M20.bp_nm)
								.otherwise(S0_T2.dlv_nm)
						).as("dlv_nm"),
						S0_M20.cntry_cd.as("dlv_cntry_cd"),
						S0_T2.dlv_zip_cd,
						S0_T2.dlv_addr1,
						S0_T2.dlv_addr2,
						S0_T2.dlv_addr3,
						S0_T2.dlv_addr4,
						S0_T2.dlv_tel,
						S0_T2.dlv_fax,
						S0_T2.dlv_cntct_dpt,
						S0_T2.dlv_cntct_psn,
						S0_M20.dlv_cal_cd,
						S0_T2.tdlv_cd,
						S0_T2.tdlv_sundry_flg,
						S0_T2.tdlv_nm,
						bracket(
							cases()
								.when(S0_T2.tdlv_nm.isNull())
									.then(S0_M21.bp_nm)
								.otherwise(S0_T2.tdlv_nm)
						).as("tdlv_nm"),
						S0_M21.cntry_cd.as("tdlv_cntry_cd"),
						S0_T2.tdlv_zip_cd,
						S0_T2.tdlv_addr1,
						S0_T2.tdlv_addr2,
						S0_T2.tdlv_addr3,
						S0_T2.tdlv_addr4,
						S0_T2.tdlv_tel,
						S0_T2.tdlv_fax,
						S0_T2.tdlv_cntct_dpt,
						S0_T2.tdlv_cntct_psn,
						trunc(
							S0_T2.rqst_dlv_rqst_tm,
							MCDateFmt.DD
						).as("rqst_dlv_rqst_dt"),
						S0_T2.rqst_dlv_rqst_tm.as("rqst_dlv_rqst_hm"),
						trunc(
							S0_T2.dlv_rqst_tm,
							MCDateFmt.DD
						).as("dlv_rqst_dt"),
						S0_T2.dlv_rqst_tm.as("dlv_rqst_hm"),
						S0_T2.purc_schd_dt,
						S0_T2.rqst_avl_rqst_dt,
						S0_T2.sync_flg,
						S0_T2.purc_basis_typ,
						S0_T2.po_conf_rcpt_flg,
						S0_T2.po_conf_rcpt_dt,
						S0_T2.trd_unit_cd,
						S0_T2.trd_unit_qty,
						S0_T2.base_unit_qty,
						S0_T2.base_unit_cd,
						S0_M2.cont_fctr_flg,
						S0_M2.cont_fctr_dec_place,
						S0_M2.cont_fctr_rnd_typ,
						S0_M2.std_cont_fctr,
						S0_M2.cont_fctr_unit_cd,
						S0_T5.purc_sts_typ,
						S0_T5.dlv_inst_qty,
						S0_T5.dlv_inst_prms_rcpt_qty,
						S0_T5.rcpt_iv_qty,
						S0_T5.arr_qty,
						S0_T5.purc_qty,
						S0_T5.arr_schd_split_flg,
						S0_T5.arr_cmpl_flg,
						S0_T5.purc_cmpl_flg,
						S0_T2.pay_crryovr_times,
						S0_T2.purc_upri_req_typ,
						S0_T2.upri_not_tgt_flg,
						S0_T2.trd_cur_upri,
						S0_T2.interim_flg,
						S0_T2.trd_cur_amt,
						S0_T2.trd_cur_tax_amt,
						S0_T2.trd_cur_amt.add(S0_T2.trd_cur_tax_amt).as("trd_cur_inc_tax_amt"),
						S0_T2.tax_fix_flg,
						S0_T2.tax_cd,
						S0_T2.trd_cur_dscnt_amt,
						S0_T2.dscnt_rsn_cd,
						S0_T2.trd_cur_proc_upri,
						S0_T2.trd_cur_proc_amt,
						S0_T2.trd_cur_onr_prov_upri,
						S0_T2.trd_cur_onr_prov_amt,
						S0_T2.wtax_rate,
						S0_T2.wtax_amt,
						S0_T2.mfg_loc_cd,
						S0_T2.bom_ptn,
						S0_T2.outsrc_flg,
						bracket(
							cases()
								.when(
									bracket(
										subQuery()
										.select(count(S1_SM1.itm_mfg_inst_no))
										.from(S1_SM1)
										.where(
											S1_SM1.itm_ord_no.eq(S0_T2.outsrc_itm_ord_no)
											.and(S1_SM1.can_flg.eq(value(false)))
										)
									).gt(value(0))
								)
									.then(value(true))
								.otherwise(value(false))
						).as("mfg_inst_flg"),
						S0_T2.outsrc_itm_ord_no,
						S0_T2.purc_id_typ,
						S0_T2.purc_rsn_cd,
						S0_T2.sno1,
						S0_T2.sno2,
						S0_T2.sno3,
						S0_T2.sno4,
						S0_T2.bd_itm_cd,
						S0_T2.bd_itm_sub1,
						S0_T2.bd_itm_sub2,
						S0_T2.bd_itm_sub3,
						S0_T2.bd_sno1,
						S0_T2.bd_sno2,
						S0_T2.bd_sno3,
						S0_T2.bd_sno4,
						S0_T2.bd_loc_cd,
						S0_T2.bd_lot_no,
						S0_T2.bd_sublot_no,
						S0_T2.bd_dpt_cd,
						S0_M36.dpt_nm.as("bd_dpt_nm"),
						S0_T2.bd_ctg_cd,
						S0_T2.bd_oper_cd,
						S0_T2.bd_slo_no,
						S0_T2.bd_iv_no,
						S0_T2.bd_po_no,
						S0_T2.ext_po_d_no,
						S0_T2.rqst_can_flg,
						S0_T2.sub_char1,
						S0_T2.sub_char2,
						S0_T2.sub_char3,
						S0_T2.edi_sub_d_char1,
						S0_T2.edi_sub_d_char2,
						S0_T2.edi_sub_d_char3,
						S0_T2.edi_sub_d_char4,
						S0_T2.edi_sub_d_char5,
						S0_T2.edi_sub_d_num1,
						S0_T2.edi_sub_d_dt1,
						S0_T2.intr_rmrks,
						S0_T2.trd_d_rmrks,
						S0_T2.po_print_d_rmrks,
						S0_T2.dlv_slip_d_rmrks,
						S0_T5.arr_cnt_rmrks,
						S0_T2.rqst_slo_flg,
						S0_T2.slo_no,
						S0_T2.slo_d_no,
						S0_T2.dlv_slip_invalid_flg,
						S0_T2.po_schd_no,
						S0_T2.po_no,
						S0_T2.po_rev,
						S0_T2.po_d_no,
						S0_T2.disp_seq,
						bracket(
							cases()
								.when(S0_T5.arr_qty.gt(value(0)))
									.then(value(true))
								.otherwise(value(false))
						).as("arr_flg"),
						bracket(
							cases()
								.when(
									S0_T5.purc_qty.gt(value(0))
									.or(S0_T5.accpt_dfct_qty.gt(value(0)))
								)
									.then(value(true))
								.otherwise(value(false))
						).as("purc_flg"),
						bracket(
							cases()
								.when(S0_T5.rcpt_iv_qty.gt(value(0)))
									.then(value(true))
								.otherwise(value(false))
						).as("rcpt_iv_flg"),
						S0_T5.upd_cntr.as("arr_pr_upd_cntr"),
						bracket(
							cases()
								.when(
									S0_T8.can_flg.eq(value(true))
									.and(bind("can_flg").eq(value(false)))
								)
									.then(value(true))
								.otherwise(value(false))
						).as("pod_del_flg")
					)
					.from(
						S0_T2
						.leftOuterJoin(S0_T5).on(
							bracket(
								S0_T2.po_d_no.eq(S0_T5.po_d_no)
							)
						)
						.leftOuterJoin(S0_T8).on(
							bracket(
								S0_T2.po_d_no.eq(S0_T8.po_d_no)
							)
						)
						.leftOuterJoin(S0_M2).on(
							bracket(
								S0_T2.itm_cd.eq(S0_M2.itm_cd)
								.and(S0_T2.itm_sub1.eq(S0_M2.itm_sub1))
								.and(S0_T2.itm_sub2.eq(S0_M2.itm_sub2))
								.and(S0_T2.itm_sub3.eq(S0_M2.itm_sub3))
							)
						)
						.leftOuterJoin(S0_M33).on(
							bracket(
								S0_T2.ap_dpt_cd.eq(S0_M33.dpt_cd)
								.and(bind("po_dt").between(S0_M33.st_dt, S0_M33.end_dt))
							)
						)
						.leftOuterJoin(S0_M20).on(
							bracket(
								S0_T2.dlv_cd.eq(S0_M20.bp_cd)
							)
						)
						.leftOuterJoin(S0_M21).on(
							bracket(
								S0_T2.tdlv_cd.eq(S0_M21.bp_cd)
							)
						)
						.leftOuterJoin(S0_M36).on(
							bracket(
								S0_T2.bd_dpt_cd.eq(S0_M36.dpt_cd)
							)
							.and(bind("po_dt").between(S0_M36.st_dt, S0_M36.end_dt))
						)
						.leftOuterJoin(S0_ITMLCL).on(
							bracket(
								S0_T2.itm_cd.eq(S0_ITMLCL.itm_cd)
								.and(S0_T2.itm_sub1.eq(S0_ITMLCL.itm_sub1))
								.and(S0_T2.itm_sub2.eq(S0_ITMLCL.itm_sub2))
								.and(S0_T2.itm_sub3.eq(S0_ITMLCL.itm_sub3))
								.and(S0_ITMLCL.lcl_cd.eq(bind("prnt_lcl_cd")))
							)
						)
						.leftOuterJoin(S0_T10).on
							(bracket(
									S0_T10.slo_d_no.eq(S0_T2.slo_d_no)
								)
						)
					)
					.where(
						value(0).eq(value(0))
						.and(S0_T2.po_no.eq(bind("po_no")))
						.and(S0_T2.po_rev.eq(bind("po_rev")))
						.and(
							bracket(
								bind("tmp_can_flg").eq(value(true))
								.and(bind("tmp_latest_flg").eq(value(true)))
								.and(
									bracket(
										bind("can_flg").eq(value(true))
										.and(bind("upd_srv_req_no").eq(S0_T8.upd_srv_req_no))
									)
									.or(
										bind("can_flg").eq(value(false))
										.and(S0_T8.can_flg.eq(value(false)))
									)
								)
							)
							.or(
								bind("tmp_can_flg").eq(value(true))
								.and(bind("tmp_latest_flg").eq(value(false)))
								.and(S0_T2.can_flg.eq(value(false)))
							)
							.or(
								bind("tmp_can_flg").eq(value(false))
								.and(S0_T8.can_flg.eq(value(false)))
							)
						)
					)
					.orderBy(S0_T2.disp_seq.asc())
			)
			.setJoinInfo(
				joinInfo(
					j -> j
						.add(MSVT_WRK_SNO_R.class, r -> toCondition(
							r.getStringNE("sno1")
						))
						.addSelect(m -> toArray(
							m.wrk_no
						))
						.addMap((r, m) -> {
							r.setStringNE("join_wrk_no_", m.wrk_no());
					}),
					j -> j
						.add(MST_PO_SCHD_R.class, r -> toCondition(
							r.getStringNE("po_schd_no")
						))
						.addSelect(m -> toArray(
							m.po_cnt_rmrks,
							m.po_schd_src_no,
							m.po_schd_src_typ,
							m.rqst_fr_usr_cd,
							m.rqst_fr_dpt_cd,
							m.reg_dt
						))
						.addMap((r, m) -> {
							r.setStringNE("po_cnt_rmrks", m.po_cnt_rmrks());
							r.setStringNE("po_schd_src_typ", m.po_schd_src_typ());
							r.setStringNE("po_schd_src_no", m.po_schd_src_no());
							r.setStringNE("rqst_fr_usr_cd", m.rqst_fr_usr_cd());
							r.setStringNE("rqst_fr_dpt_cd", m.rqst_fr_dpt_cd());
							r.setDateNE("reg_dt", m.reg_dt());
					}),
					j -> j
						.add(MAM_USR_R.class, r -> toCondition(
							r.getStringNE("rqst_fr_usr_cd")
						))
						.addSelect(m -> toArray(
							m.usr_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("rqst_fr_usr_nm", m.usr_nm());
					}),
					j -> j
						.add(MAM_DPT_R.class, r -> toCondition(
							r.getStringNE("rqst_fr_dpt_cd"), r.getDateNE("reg_dt")
						))
						.addSelect(m -> toArray(
							m.dpt_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("rqst_fr_dpt_nm", m.dpt_nm());
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
							r.getStringNE("in_to_loc_cd")
						))
						.addSelect(m -> toArray(
							m.cal_cd,
							m.lg_grp_cd,
							m.loc_grp_cd,
							m.loc_mng_typ,
							m.loc_nm,
							m.site_cd,
							m.sppl_cd,
							m.str_ln_tgt_flg,
							m.wg_cd
						))
						.addMap((r, m) -> {
							r.setStringNE("in_to_loc_nm", m.loc_nm());
							r.setStringNE("in_to_loc_wg_cd", m.wg_cd());
							r.setStringNE("outsrc_sppl_cd", m.sppl_cd());
							r.setBooleanNE("str_ln_tgt_flg", m.str_ln_tgt_flg());
							r.setStringNE("loc_mng_typ", m.loc_mng_typ());
							r.setStringNE("in_to_loc_cal_cd", m.cal_cd());
							r.setStringNE("site_cd", m.site_cd());
							r.setStringNE("lg_grp_cd", m.lg_grp_cd());
							r.setStringNE("loc_grp_cd", m.loc_grp_cd());
							r.setStringNE("bef_in_to_loc_wg_cd", m.wg_cd());
							r.setStringNE("bef_lg_grp_cd", m.lg_grp_cd());
							r.setStringNE("bef_loc_grp_cd", m.loc_grp_cd());
					}),
					j -> j
						.add(MAM_WG_R.class, r -> toCondition(
							r.getStringNE("in_to_loc_wg_cd")
						))
						.addSelect(m -> toArray(
							m.wg_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("in_to_loc_wg_nm", m.wg_nm());
					}),
					j -> j
						.add(MAM_STR_LN_R.class, r -> toCondition(
							r.getStringNE("in_to_loc_cd"),
							r.getStringNE("str_ln_cd")
						))
						.addSelect(m -> toArray(
							m.str_ln_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("str_ln_nm", m.str_ln_nm());
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
							m.rnd_typ,
							m.unit_cd
						))
						.addMap((r, m) -> {
							r.setNumberNE("trd_unit_dec_place", m.dec_place());
							r.setStringNE("trd_unit_rnd_typ", m.rnd_typ());
							r.setNumberNE("trd_unit_conv_base_qty", m.conv_base_qty());
							r.setNumberNE("trd_unit_conv_qty", m.conv_qty());
							r.setStringNE("join_unit_cd_", m.unit_cd());
					}),
					j -> j
						.add(MAM_UNIT_R.class, r -> toCondition(
							r.getStringNE("join_unit_cd_")
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
							r.getStringNE("base_unit_cd")
						))
						.addSelect(m -> toArray(
							m.dec_place,
							m.rnd_typ,
							m.unit_cd
						))
						.addMap((r, m) -> {
							r.setNumberNE("base_unit_dec_place", m.dec_place());
							r.setStringNE("base_unit_rnd_typ", m.rnd_typ());
							r.setStringNE("join_unit_cd_", m.unit_cd());
					}),
					j -> j
						.add(MAM_UNIT_R.class, r -> toCondition(
							r.getStringNE("join_unit_cd_")
						))
						.addSelect(m -> toArray(
							m.unit_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("base_unit_nm", m.unit_nm());
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
						.add(MAM_LOC_R.class, r -> toCondition(
							r.getStringNE("mfg_loc_cd")
						))
						.addSelect(m -> toArray(
							m.loc_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("mfg_loc_nm", m.loc_nm());
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
						.add(MST_WRK_R.class, r -> toCondition(
							r.getStringNE("join_wrk_no_")
						))
						.addSelect(m -> toArray(
							m.wrk_nm,
							m.wrk_no
						))
						.addMap((r, m) -> {
							r.setStringNE("wrk_no", m.wrk_no());
							r.setStringNE("wrk_nm", m.wrk_nm());
					})
				)
			);
	}
	
	/**
	 * -- MSBDL0080_MST_PO_Query_S01
	 */
	static MCQueryPlan MSBDL0080_MST_PO_S01() {
		MST_PO_P_R S0_T1 = MST_PO_P_R.create("T1");
		MAVM_RD_DPT_R S0_M99 = MAVM_RD_DPT_R.create("M99");
		MST_PO_R S0_T7 = MST_PO_R.create("T7");
		MAM_DPT_R S0_M11 = MAM_DPT_R.create("M11");
		MAM_BP_R S0_M18 = MAM_BP_R.create("M18");
		MAM_CUR_R S0_M25 = MAM_CUR_R.create("M25");
		MAM_CUR_R S0_M30 = MAM_CUR_R.create("M30");
		MBT_APRV_R S0_T4 = MBT_APRV_R.create("T4");
		MAM_EDI_IF_CTL_R S0_IFCTL = MAM_EDI_IF_CTL_R.create("IFCTL");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBDL0080_MST_PO_Query_S01")
					.mainQuery()
					.select(
						S0_T1.trd_cd.as("trd_cd"),
						S0_T1.po_no.as("po_no"),
						S0_T1.po_rev.as("po_rev"),
						S0_T1.po_print_dt.as("po_print_dt"),
						S0_T1.po_print_flg.as("po_print_flg"),
						S0_T1.aprv_flg.as("aprv_flg"),
						S0_T1.aprv_no.as("aprv_no"),
						S0_T1.aprv_sts_typ.as("aprv_sts_typ"),
						S0_T4.aprv_upd_flg.as("aprv_upd_flg"),
						S0_T4.aprv_can_flg.as("aprv_can_flg"),
						S0_T1.po_dt.as("po_dt"),
						S0_T1.sppl_cd.as("sppl_cd"),
						S0_M18.bp_nm.as("sppl_nm"),
						S0_T1.sppl_zip_cd.as("sppl_zip_cd"),
						S0_T1.sppl_addr1.as("sppl_addr1"),
						S0_T1.sppl_addr2.as("sppl_addr2"),
						S0_T1.sppl_addr3.as("sppl_addr3"),
						S0_T1.sppl_addr4.as("sppl_addr4"),
						S0_T1.sppl_tel.as("sppl_tel"),
						S0_T1.sppl_fax.as("sppl_fax"),
						S0_M18.cntry_cd.as("sppl_cntry_cd"),
						S0_M18.purc_amt_rnd_typ.as("purc_amt_rnd_typ"),
						S0_M18.purc_tax_rnd_typ.as("purc_tax_rnd_typ"),
						S0_M18.sppl_cal_cd.as("sppl_cal_cd"),
						S0_M18.purc_upri_cng_flg.as("sppl_purc_upri_cng_flg"),
						S0_M18.prnt_lcl_cd.as("prnt_lcl_cd"),
						S0_M18.sppl_ship_form_cd.as("sppl_ship_form_cd"),
						S0_M18.po_dlv_slip_flg.as("po_dlv_slip_flg"),
						S0_M18.subcon_flg.as("subcon_flg"),
						S0_M18.repurc_obli_flg.as("repurc_obli_flg"),
						nvl(
							S0_M18.outsrc_upri_typ,
							value(getCo().outsrc_upri_typ())
							).as("outsrc_upri_typ"),
						S0_M18.sppl_iv_flg.as("sppl_iv_flg"),
						S0_M18.pay_crryovr_times.as("sppl_pay_crryovr_times"),
						S0_M18.purc_upri_req_typ,
						S0_T1.edi_flg.as("last_edi_flg"),
						S0_T1.purc_usr_cd.as("purc_usr_cd"),
						S0_T1.purc_dpt_cd.as("purc_dpt_cd"),
						S0_M11.dpt_nm.as("purc_dpt_nm"),
						S0_M11.ap_dpt_flg,
						S0_M11.wg_cd.as("purc_dpt_wg_cd"),
						S0_T1.trd_cur_cd.as("trd_cur_cd"),
						bind("base_cur_cd").as("base_cur_cd"),
						S0_M25.cur_nm.as("base_cur_nm"),
						S0_M25.amt_dec_place.as("base_cur_amt_dec_place"),
						S0_M25.upri_dec_place.as("base_cur_upri_dec_place"),
						S0_T1.xrate.as("xrate"),
						S0_T1.xrate_inpt_flg.as("xrate_inpt_flg"),
						bind("ptax_cur_cd").as("ptax_cur_cd"),
						S0_M30.cur_nm.as("ptax_cur_nm"),
						S0_M30.amt_dec_place.as("ptax_cur_amt_dec_place"),
						S0_M30.upri_dec_place.as("ptax_cur_upri_dec_place"),
						S0_T1.ptax_xrate.as("ptax_xrate"),
						S0_T1.ptax_xrate_inpt_flg.as("ptax_xrate_inpt_flg"),
						S0_T1.wrk_no.as("wrk_no"),
						S0_T1.trd_rmrks.as("trd_rmrks"),
						S0_T1.intr_rmrks.as("intr_rmrks"),
						S0_T1.po_print_rmrks.as("po_print_rmrks"),
						S0_T1.dlv_slip_rmrks.as("dlv_slip_rmrks"),
						S0_T1.po_print_cd.as("po_print_cd"),
						S0_T1.upd_po_print_schd_dt.as("upd_po_print_schd_dt"),
						S0_T1.crct_rsn_cd.as("crct_rsn_cd"),
						S0_T1.tterm_cd1.as("tterm_cd1"),
						S0_T1.tterm_rmrks1.as("tterm_rmrks1"),
						S0_T1.tterm_cd2.as("tterm_cd2"),
						S0_T1.tterm_rmrks2.as("tterm_rmrks2"),
						S0_T1.tterm_cd3.as("tterm_cd3"),
						S0_T1.tterm_rmrks3.as("tterm_rmrks3"),
						S0_M18.asppl_cd.as("asppl_cd"),
						MAPA_BP$F_GET_AP_DPT_CD_NE(
								S0_M18.asppl_cd,
								S0_T1.po_dt,
								value(false)
						).as("mst_ap_dpt_cd"),
						MAPA_BP$F_GET_AP_DPT_CD_NE2(
							S0_T1.sppl_cd,
							S0_M18.asppl_cd,
							S0_T1.po_dt,
							value(false)
						).as("ap_dpt_cd"),
						S0_T1.purc_if_flg,
						S0_T1.ext_sys_cd,
						S0_T1.ext_po_no,
						S0_T1.sub_char1.as("sub_char1"),
						S0_T1.sub_char2.as("sub_char2"),
						S0_T1.sub_char3.as("sub_char3"),
						S0_T1.edi_sub_char1,
						S0_T1.edi_sub_char2,
						S0_T1.edi_sub_char3,
						S0_T1.edi_sub_char4,
						S0_T1.edi_sub_char5,
						S0_T1.edi_sub_num1,
						S0_T1.edi_sub_dt1,
						S0_T1.ins_usr_id.as("ins_usr_id"),
						S0_T1.ins_usr_nm.as("ins_usr_nm"),
						S0_T1.ins_func_id.as("ins_func_id"),
						S0_T1.ins_ts.as("ins_ts"),
						S0_T7.upd_cntr.as("po_upd_cntr"),
						S0_T1.upd_usr_id.as("upd_usr_id"),
						S0_T1.upd_usr_nm.as("upd_usr_nm"),
						S0_T1.upd_func_id.as("upd_func_id"),
						S0_T1.upd_ts.as("upd_ts"),
						S0_T1.upd_srv_req_no.as("upd_srv_req_no"),
						S0_T7.can_flg.as("can_flg"),
						cases()
							.when(bind("tmp_can_flg").eq(value(true)))
								.then(value(false))
							.otherwise(
								decode(
									S0_IFCTL.if_proc_typ,
									nullValue(),
									value(false),
									value(true)
								)
							).as("edi_flg"),
						decode(
							S0_IFCTL.if_proc_typ,
							nullValue(),
							value(false),
							value(true)
						).as("edi_tgt_flg")
					)
					.from(
						S0_T1
						.innerJoin(S0_M99).on(
							bracket(
								S0_T1.purc_dpt_cd.eq(S0_M99.dpt_cd)
							)
						)
						.leftOuterJoin(S0_T7).on(
							bracket(
								S0_T1.po_no.eq(S0_T7.po_no)
							)
						)
						.leftOuterJoin(S0_M11).on(
							bracket(
								S0_T1.purc_dpt_cd.eq(S0_M11.dpt_cd)
								.and(S0_T1.po_dt.between(S0_M11.st_dt, S0_M11.end_dt))
							)
						)
						.leftOuterJoin(S0_M18).on(
							bracket(
								S0_T1.sppl_cd.eq(S0_M18.bp_cd)
							)
						)
						.leftOuterJoin(S0_M25).on(
							bracket(
								bind("base_cur_cd").eq(S0_M25.cur_cd)
							)
						)
						.leftOuterJoin(S0_M30).on(
							bracket(
								bind("ptax_cur_cd").eq(S0_M30.cur_cd)
							)
						)
						.leftOuterJoin(S0_T4).on(
							bracket(
								S0_T1.aprv_no.eq(S0_T4.aprv_no)
								.and(S0_T4.can_flg.eq(value(false)))
							)
						)
						.leftOuterJoin(S0_IFCTL).on(
							bracket(
								S0_T1.sppl_cd.eq(S0_IFCTL.bp_cd)
								.and(bind("today").between(S0_IFCTL.st_dt, S0_IFCTL.end_dt))
								.and(S0_IFCTL.if_proc_typ.eq(value(MAC_IF_PROC_TYP.PO_SEND.value())))
								.and(S0_IFCTL.del_flg.eq(value(false)))
							)
						)
					)
					.where(
						value(0).eq(value(0))
						.and(S0_T1.po_no.eq(bind("po_no")))
						.and(S0_T1.po_rev.eq(bind("rev_no")))
						.and(
							bracket(
								bind("tmp_can_flg").eq(value(true))
							)
							.or(
								bind("tmp_can_flg").eq(value(false))
								.and(S0_T7.can_flg.eq(value(false)))
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
							m.trd_nm,
							m.trd_ptn_typ
						))
						.addMap((r, m) -> {
							r.setStringNE("trd_nm", m.trd_nm());
							r.setStringNE("trd_ptn_typ", m.trd_ptn_typ());
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
							r.setNumberNE("trd_cur_amt_dec_place", m.amt_dec_place());
							r.setNumberNE("trd_cur_upri_dec_place", m.upri_dec_place());
					}),
					j -> j
						.add(MST_PO_CRCT_RSN_R.class, r -> toCondition(
							r.getStringNE("crct_rsn_cd")
						))
						.addSelect(m -> toArray(
							m.po_crct_rsn_nm,
							m.po_crct_rsn_rmrks
						))
						.addMap((r, m) -> {
							r.setStringNE("crct_rsn_nm", m.po_crct_rsn_nm());
							r.setStringNE("crct_rsn_rmrks", m.po_crct_rsn_rmrks());
					}),
					j -> j
						.add(MAM_PO_PRINT_R.class, r -> toCondition(
							r.getStringNE("po_print_cd")
						))
						.addSelect(m -> toArray(
							m.po_print_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("po_print_nm", m.po_print_nm());
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
						.add(MAM_EXT_SYS_R.class, r -> toCondition(
							r.getStringNE("ext_sys_cd")
						))
						.addSelect(m -> toArray(
							m.ext_sys_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("ext_sys_nm", m.ext_sys_nm());
					})
				)
			);
	}
	
	/**
	 * -- MSBDL0080_MST_PO_SCHD_Query_S01
	 */
	static MCQueryPlan MSBDL0080_MST_PO_SCHD_S01() {
		MSW_PO_SCHD_KEY_R S0_WK = MSW_PO_SCHD_KEY_R.create("WK");
		MST_PO_SCHD_R S0_T1 = MST_PO_SCHD_R.create("T1");
		MAVM_RD_WG_R S0_M0 = MAVM_RD_WG_R.create("M0");
		MAM_ITM_R S0_M2 = MAM_ITM_R.create("M2");
		MAM_SUNDRY_ITM_R S0_SUNDRYITM = MAM_SUNDRY_ITM_R.create("SUNDRYITM");
		MAM_ITM_TYP_D_R S0_M23 = MAM_ITM_TYP_D_R.create("M23");
		MAM_WG_R S0_M5 = MAM_WG_R.create("M5");
		MAM_LOC_R S0_M6 = MAM_LOC_R.create("M6");
		MAM_SITE_R S0_M19 = MAM_SITE_R.create("M19");
		MAM_ITM_DTL_R S0_M45 = MAM_ITM_DTL_R.create("M45");
		MAM_ITM_DTL_R S0_M49 = MAM_ITM_DTL_R.create("M49");
		MAM_DPT_R S0_M11 = MAM_DPT_R.create("M11");
		MAM_DPT_R S0_M33 = MAM_DPT_R.create("M33");
		MST_WG_RQST_PRMS_R S0_T4 = MST_WG_RQST_PRMS_R.create("T4");
		MST_WG_RQST_R S0_T5 = MST_WG_RQST_R.create("T5");
		MAM_BP_R S0_M18 = MAM_BP_R.create("M18");
		MAM_DPT_R S0_M44 = MAM_DPT_R.create("M44");
		MAM_BP_R S0_M20 = MAM_BP_R.create("M20");
		MAM_BP_R S0_M21 = MAM_BP_R.create("M21");
		MAM_CUR_R S0_M25 = MAM_CUR_R.create("M25");
		MAM_CUR_R S0_M30 = MAM_CUR_R.create("M30");
		MAM_ITM_LCL_R S0_M36 = MAM_ITM_LCL_R.create("M36");
		MAM_DPT_R S0_M40 = MAM_DPT_R.create("M40");
		MAM_EDI_IF_CTL_R S0_IFCTL = MAM_EDI_IF_CTL_R.create("IFCTL");
		MST_ITM_MFG_INST_R S1_SM1 = MST_ITM_MFG_INST_R.create("SM1");
		MST_SLO_D_R S0_T10 = MST_SLO_D_R.create("T10");
		
		
		return createQueryPlan()
			.setQuery(
					sql("MSBDL0080_MST_PO_SCHD_Query_S01")
					.mainQuery()
					.select(
						S0_T1.trd_cd.as("\"hdr.trd_cd\""),
						S0_T1.trd_ptn_typ.as("\"hdr.trd_ptn_typ\""),
						S0_T1.sppl_cd.as("\"hdr.sppl_cd\""),
						S0_M18.bp_nm.as("\"hdr.sppl_nm\""),
						S0_M18.cntry_cd.as("\"hdr.sppl_cntry_cd\""),
						MAPA_BP$F_GET_BP_ADDR(
							S0_T1.sppl_cd,
							bind("today"),
							value(MAC_BP_ADDR_TYP.ZIP_CD.value())
						).as("\"hdr.sppl_zip_cd\""),
						MAPA_BP$F_GET_BP_ADDR(
							S0_T1.sppl_cd,
							bind("today"),
							value(MAC_BP_ADDR_TYP.ADDR1.value())
						).as("\"hdr.sppl_addr1\""),
						MAPA_BP$F_GET_BP_ADDR(
							S0_T1.sppl_cd,
							bind("today"),
							value(MAC_BP_ADDR_TYP.ADDR2.value())
						).as("\"hdr.sppl_addr2\""),
						MAPA_BP$F_GET_BP_ADDR(
							S0_T1.sppl_cd,
							bind("today"),
							value(MAC_BP_ADDR_TYP.ADDR3.value())
						).as("\"hdr.sppl_addr3\""),
						MAPA_BP$F_GET_BP_ADDR(
							S0_T1.sppl_cd,
							bind("today"),
							value(MAC_BP_ADDR_TYP.ADDR4.value())
						).as("\"hdr.sppl_addr4\""),
						MAPA_BP$F_GET_BP_ADDR(
							S0_T1.sppl_cd,
							bind("today"),
							value(MAC_BP_ADDR_TYP.TEL.value())
						).as("\"hdr.sppl_tel\""),
						MAPA_BP$F_GET_BP_ADDR(
							S0_T1.sppl_cd,
							bind("today"),
							value(MAC_BP_ADDR_TYP.FAX.value())
						).as("\"hdr.sppl_fax\""),
						MAPA_BP$F_GET_BP_ADDR(
							S0_T1.sppl_cd,
							bind("today"),
							value(MAC_BP_ADDR_TYP.SPPL_CNTCT_DPT.value())
						).as("\"hdr.sppl_cntct_dpt\""),
						MAPA_BP$F_GET_BP_ADDR(
							S0_T1.sppl_cd,
							bind("today"),
							value(MAC_BP_ADDR_TYP.SPPL_CNTCT_PSN.value())
						).as("\"hdr.sppl_cntct_psn\""),
						S0_M18.purc_amt_rnd_typ.as("\"hdr.purc_amt_rnd_typ\""),
						S0_M18.purc_tax_rnd_typ.as("\"hdr.purc_tax_rnd_typ\""),
						S0_M18.sppl_cal_cd.as("\"hdr.sppl_cal_cd\""),
						S0_M18.purc_upri_cng_flg.as("\"hdr.sppl_purc_upri_cng_flg\""),
						S0_M18.prnt_lcl_cd.as("\"hdr.prnt_lcl_cd\""),
						S0_M18.sppl_ship_form_cd.as("\"hdr.sppl_ship_form_cd\""),
						S0_M18.po_dlv_slip_flg.as("\"hdr.po_dlv_slip_flg\""),
						S0_M18.subcon_flg.as("\"hdr.subcon_flg\""),
						S0_M18.repurc_obli_flg.as("\"hdr.repurc_obli_flg\""),
						nvl(
							S0_M18.outsrc_upri_typ,
							value(getCo().outsrc_upri_typ())
							).as("\"hdr.outsrc_upri_typ\""),
						S0_M18.sppl_iv_flg.as("\"hdr.sppl_iv_flg\""),
						S0_M18.pay_crryovr_times.as("\"hdr.sppl_pay_crryovr_times\""),
						S0_M18.po_print_cd.as("\"hdr.po_print_cd\""),
						S0_M18.sppl_tterm_cd1.as("\"hdr.tterm_cd1\""),
						S0_M18.sppl_tterm_cd2.as("\"hdr.tterm_cd2\""),
						S0_M18.sppl_tterm_cd3.as("\"hdr.tterm_cd3\""),
						decode(
							S0_IFCTL.if_proc_typ,
							nullValue(),
							value(false),
							value(true)
						).as("\"hdr.edi_flg\""),
						decode(
							S0_IFCTL.if_proc_typ,
							nullValue(),
							value(false),
							value(true)
						).as("\"hdr.edi_tgt_flg\""),
						S0_T1.purc_usr_cd.as("\"hdr.purc_usr_cd\""),
						S0_T1.purc_dpt_cd.as("\"hdr.purc_dpt_cd\""),
						S0_M11.dpt_nm.as("\"hdr.purc_dpt_nm\""),
						S0_M11.ap_dpt_flg.as("\"hdr.ap_dpt_flg\""),
						MAPA_BP$F_GET_AP_DPT_CD_NE(
								S0_M18.asppl_cd,
								bind("today"),
								value(false)
							).as("\"hdr.mst_ap_dpt_cd\""),
						S0_T1.wg_cd.as("\"hdr.purc_dpt_wg_cd\""),
						S0_T1.trd_cur_cd.as("\"hdr.trd_cur_cd\""),
						bind("base_cur_cd").as("\"hdr.base_cur_cd\""),
						S0_M25.cur_nm.as("\"hdr.base_cur_nm\""),
						S0_M25.amt_dec_place.as("\"hdr.base_cur_amt_dec_place\""),
						S0_M25.upri_dec_place.as("\"hdr.base_cur_upri_dec_place\""),
						S0_T1.xrate_inpt_flg.as("\"hdr.xrate_inpt_flg\""),
						S0_T1.xrate.as("\"hdr.xrate\""),
						bind("ptax_cur_cd").as("\"hdr.ptax_cur_cd\""),
						S0_M30.cur_nm.as("\"hdr.ptax_cur_nm\""),
						S0_M30.amt_dec_place.as("\"hdr.ptax_cur_amt_dec_place\""),
						S0_M30.upri_dec_place.as("\"hdr.ptax_cur_upri_dec_place\""),
						S0_T1.upd_cntr.as("po_schd_upd_cntr"),
						S0_T1.ptax_xrate.as("\"hdr.ptax_xrate\""),
						S0_T1.ptax_xrate_inpt_flg.as("\"hdr.ptax_xrate_inpt_flg\""),
						S0_M18.asppl_cd.as("\"hdr.asppl_cd\""),
						S0_T1.in_to_loc_cd,
						S0_M6.loc_nm.as("in_to_loc_nm"),
						MAPA_LOC$F_GET_LOC_ADDR(
							S0_T1.in_to_loc_cd,
							S0_T1.reg_dt,
							value(MAC_LOC_ADDR_TYP.ZIP_CD.value()),
							nullValue()
						).as("in_to_loc_zip_cd"),
						MAPA_LOC$F_GET_LOC_ADDR(
							S0_T1.in_to_loc_cd,
							S0_T1.reg_dt,
							value(MAC_LOC_ADDR_TYP.ADDR1.value()),
							nullValue()
						).as("in_to_loc_addr1"),
						MAPA_LOC$F_GET_LOC_ADDR(
							S0_T1.in_to_loc_cd,
							S0_T1.reg_dt,
							value(MAC_LOC_ADDR_TYP.ADDR2.value()),
							nullValue()
						).as("in_to_loc_addr2"),
						MAPA_LOC$F_GET_LOC_ADDR(
							S0_T1.in_to_loc_cd,
							S0_T1.reg_dt,
							value(MAC_LOC_ADDR_TYP.ADDR3.value()),
							nullValue()
						).as("in_to_loc_addr3"),
						MAPA_LOC$F_GET_LOC_ADDR(
							S0_T1.in_to_loc_cd,
							S0_T1.reg_dt,
							value(MAC_LOC_ADDR_TYP.ADDR4.value()),
							nullValue()
						).as("in_to_loc_addr4"),
						MAPA_LOC$F_GET_LOC_ADDR(
							S0_T1.in_to_loc_cd,
							S0_T1.reg_dt,
							value(MAC_LOC_ADDR_TYP.TEL.value()),
							nullValue()
						).as("in_to_loc_tel"),
						MAPA_LOC$F_GET_LOC_ADDR(
							S0_T1.in_to_loc_cd,
							S0_T1.reg_dt,
							value(MAC_LOC_ADDR_TYP.FAX.value()),
							nullValue()
						).as("in_to_loc_fax"),
						S0_M6.wg_cd.as("in_to_loc_wg_cd"),
						bracket(
							cases()
								.when(S0_M18.sppl_ship_form_cd.isNull())
									.then(value(false))
								.otherwise(value(true))
						).as("pri_print_flg"),
						S0_T1.drct_dlv_typ,
						S0_M6.sppl_cd.as("outsrc_sppl_cd"),
						S0_M6.str_ln_tgt_flg,
						S0_M6.loc_mng_typ,
						S0_M6.cal_cd.as("in_to_loc_cal_cd"),
						S0_M6.site_cd,
						S0_M6.lg_grp_cd,
						S0_M6.loc_grp_cd,
						S0_M6.wg_cd.as("bef_in_to_loc_wg_cd"),
						S0_M6.lg_grp_cd.as("bef_lg_grp_cd"),
						S0_M6.loc_grp_cd.as("bef_loc_grp_cd"),
						S0_T1.str_ln_cd,
						S0_T1.itm_cd,
						S0_T1.itm_sub1,
						S0_T1.itm_sub2,
						S0_T1.itm_sub3,
						coalesce(
							S0_SUNDRYITM.itm_nm,
							S0_T1.itm_nm,
							S0_M2.itm_nm
						).as("itm_nm"),
						decode(
							S0_M18.sppl_iv_flg,
							value(true),
							decode(
								S0_T1.sundry_itm_flg,
								value(true),
								nvl(
									S0_T1.iv_itm_nm,
									S0_M36.itm_nm
								),
								S0_M36.itm_nm
							),
							nullValue()
						).as("iv_itm_nm"),
						S0_M2.sundry_itm_flg,
						S0_M2.asset_mng_typ,
						S0_M2.purc_upri_cng_flg.as("itm_purc_upri_cng_flg"),
						S0_M2.dscnt_itm_flg,
						S0_M2.ver_flg,
						S0_T1.ver_no,
						S0_M2.pay_crryovr_times.as("itm_pay_crryovr_times"),
						S0_M2.sno1_mng_typ,
						S0_M2.sno2_mng_typ,
						S0_M2.sno3_mng_typ,
						S0_M2.sno4_mng_typ,
						S0_M2.stk_mng_typ,
						S0_M2.arr_skip_flg,
						S0_M2.purc_dlv_slip_flg,
						S0_T1.maker_cd,
						S0_T1.sppl_itm_cd,
						S0_T1.sppl_itm_nm,
						bracket(
								cases()
									.when(S0_T1.dlv_cd.isNotNull())
										.then(S0_T10.cst_itm_cd)
									.otherwise(nullValue())
							).as("cst_itm_cd"),
						bracket(
								cases()
									.when(S0_T1.dlv_cd.isNotNull())
										.then(S0_T10.cst_itm_nm)
									.otherwise(nullValue())
							).as("cst_itm_nm"),
						MAPA_BP$F_GET_AP_DPT_CD_NE(
							S0_M18.asppl_cd,
							bind("today"),
							value(false)
						).as("mst_ap_dpt_cd"),
						MAPA_BP$F_GET_AP_DPT_CD_NE2(
							S0_T1.sppl_cd,
							S0_M18.asppl_cd,
							bind("today"),
							value(false)
						).as("ap_dpt_cd"),
						S0_M44.dpt_nm.as("ap_dpt_nm"),
						S0_T1.dlv_cd,
						S0_T1.dlv_sundry_flg,
						bracket(
							cases()
								.when(S0_T1.dlv_nm.isNull())
									.then(S0_M20.bp_nm)
								.otherwise(S0_T1.dlv_nm)
						).as("dlv_nm"),
						S0_M20.cntry_cd.as("dlv_cntry_cd"),
						S0_T1.dlv_cntct_dpt,
						S0_T1.dlv_cntct_psn,
						S0_T1.dlv_zip_cd,
						S0_T1.dlv_addr1,
						S0_T1.dlv_addr2,
						S0_T1.dlv_addr3,
						S0_T1.dlv_addr4,
						S0_T1.dlv_tel,
						S0_T1.dlv_fax,
						S0_T1.dlv_cntct_dpt,
						S0_T1.dlv_cntct_psn,
						S0_M20.dlv_cal_cd,
						S0_T1.tdlv_cd,
						S0_T1.tdlv_sundry_flg,
						bracket(
							cases()
								.when(S0_T1.tdlv_nm.isNull())
									.then(S0_M21.bp_nm)
								.otherwise(S0_T1.tdlv_nm)
						).as("tdlv_nm"),
						S0_M21.cntry_cd.as("tdlv_cntry_cd"),
						S0_T1.tdlv_zip_cd,
						S0_T1.tdlv_addr1,
						S0_T1.tdlv_addr2,
						S0_T1.tdlv_addr3,
						S0_T1.tdlv_addr4,
						S0_T1.tdlv_tel,
						S0_T1.tdlv_fax,
						S0_T1.tdlv_cntct_dpt,
						S0_T1.tdlv_cntct_psn,
						trunc(
							S0_T1.rqst_dlv_rqst_tm,
							MCDateFmt.DD
						).as("rqst_dlv_rqst_dt"),
						S0_T1.rqst_dlv_rqst_tm.as("rqst_dlv_rqst_hm"),
						trunc(
							S0_T1.dlv_rqst_tm,
							MCDateFmt.DD
						).as("dlv_rqst_dt"),
						S0_T1.dlv_rqst_tm.as("dlv_rqst_hm"),
						S0_T1.purc_schd_dt,
						S0_T1.rqst_avl_rqst_dt,
						bracket(
							cases()
								.when(
									trunc(
										S0_T1.dlv_rqst_tm,
										MCDateFmt.DD
									).eq(S0_T1.purc_schd_dt)
									.and(S0_M2.arr_skip_flg.eq(value(false)))
								)
									.then(value(true))
								.otherwise(value(false))
						).as("sync_flg"),
						bracket(
							cases()
								.when(S0_T1.outsrc_flg.eq(value(false))
									.and(S0_M45.purc_basis_typ.isNotNull())
								)
									.then(S0_M45.purc_basis_typ)
								.when(S0_T1.outsrc_flg.eq(value(true))
									.and(S0_M49.purc_basis_typ.isNotNull())
								)
									.then(S0_M49.purc_basis_typ)
								.when(S0_M18.purc_basis_typ.isNotNull())
									.then(S0_M18.purc_basis_typ)
								.otherwise(value(MAC_PURC_BASIS_TYP.ANY_BASIS.value()))
						).as("purc_basis_typ"),
						S0_T1.trd_unit_cd,
						S0_T1.trd_unit_qty,
						S0_T1.base_unit_cd,
						S0_T1.base_unit_qty,
						S0_M2.cont_fctr_flg,
						S0_M2.cont_fctr_dec_place,
						S0_M2.cont_fctr_rnd_typ,
						S0_M2.std_cont_fctr,
						S0_M2.cont_fctr_unit_cd,
						bracket(
							cases()
								.when(S0_M2.pay_crryovr_times.isNull())
									.then(S0_M18.pay_crryovr_times)
								.otherwise(S0_M2.pay_crryovr_times)
						).as("pay_crryovr_times"),
						S0_T1.purc_upri_req_typ,
						S0_T1.upri_not_tgt_flg,
						S0_T1.trd_cur_upri,
						S0_T1.interim_flg,
						S0_T1.trd_cur_amt,
						S0_T1.trd_cur_tax_amt,
						S0_T1.trd_cur_amt.add(S0_T1.trd_cur_tax_amt).as("trd_cur_inc_tax_amt"),
						S0_T1.tax_cd,
						S0_T1.trd_cur_proc_upri,
						S0_T1.trd_cur_onr_prov_upri,
						S0_T1.trd_cur_proc_amt,
						S0_T1.trd_cur_onr_prov_amt,
						MAPA_TAX$F_GET_WTAX_RATE(
							S0_M2.itm_cd,
							S0_M2.itm_sub1,
							S0_M2.itm_sub2,
							S0_M2.itm_sub3,
							bind("today")
						).as("wtax_rate"),
						S0_T1.mfg_loc_cd,
						S0_T1.bom_ptn,
						S0_T1.outsrc_flg,
						S0_T1.outsrc_itm_ord_no,
						bracket(
							cases()
								.when(
									bracket(
										subQuery()
										.select(count(S1_SM1.itm_mfg_inst_no))
										.from(S1_SM1)
										.where(
											S1_SM1.itm_ord_no.eq(S0_T1.outsrc_itm_ord_no)
											.and(S1_SM1.can_flg.eq(value(false)))
										)
									).gt(value(0))
								)
									.then(value(true))
								.otherwise(value(false))
						).as("mfg_inst_flg"),
						bracket(
							cases()
								.when(S0_T1.outsrc_flg.eq(value(false)))
									.then(S0_M45.purc_id_typ)
								.otherwise(S0_M49.purc_id_typ)
						).as("purc_id_typ"),
						S0_T1.purc_rsn_cd,
						S0_T1.sno1,
						S0_T1.sno2,
						S0_T1.sno3,
						S0_T1.sno4,
						S0_T1.bd_itm_cd,
						S0_T1.bd_itm_sub1,
						S0_T1.bd_itm_sub2,
						S0_T1.bd_itm_sub3,
						S0_T1.bd_sno1,
						S0_T1.bd_sno2,
						S0_T1.bd_sno3,
						S0_T1.bd_sno4,
						S0_T1.bd_lot_no,
						S0_T1.bd_sublot_no,
						S0_T1.bd_loc_cd,
						S0_T1.bd_dpt_cd,
						S0_M33.dpt_nm.as("bd_dpt_nm"),
						S0_T1.bd_ctg_cd,
						S0_T1.bd_oper_cd,
						S0_T1.bd_slo_no,
						S0_T1.bd_iv_no,
						S0_T1.bd_po_no,
						S0_T1.rqst_can_flg,
						S0_T1.po_cnt_rmrks,
						S0_T1.slo_no,
						S0_T1.slo_d_no,
						bracket(
							cases()
								.when(S0_T1.slo_d_no.isNull())
									.then(value(false))
								.otherwise(value(true))
						).as("rqst_slo_flg"),
						S0_T1.po_schd_src_typ,
						S0_T1.po_schd_src_no,
						S0_T1.rqst_fr_usr_cd,
						S0_T1.rqst_fr_dpt_cd,
						S0_M40.dpt_nm.as("rqst_fr_dpt_nm"),
						S0_T1.po_schd_no,
						value(true).as("po_schd_flg"),
						S0_T1.trd_d_rmrks
					)
					.from(
						S0_WK
						.innerJoin(S0_T1).on(S0_WK.po_schd_no.eq(S0_T1.po_schd_no))
						.innerJoin(S0_M0).on(S0_T1.wg_cd.eq(S0_M0.wg_cd))
						.leftOuterJoin(S0_M2).on(
							S0_T1.itm_cd.eq(S0_M2.itm_cd)
							.and(S0_T1.itm_sub1.eq(S0_M2.itm_sub1))
							.and(S0_T1.itm_sub2.eq(S0_M2.itm_sub2))
							.and(S0_T1.itm_sub3.eq(S0_M2.itm_sub3))
						)
						.leftOuterJoin(S0_SUNDRYITM).on(
							S0_T1.itm_cd.eq(S0_SUNDRYITM.itm_cd)
							.and(S0_T1.itm_sub1.eq(S0_SUNDRYITM.itm_sub1))
							.and(S0_T1.itm_sub2.eq(S0_SUNDRYITM.itm_sub2))
							.and(S0_T1.itm_sub3.eq(S0_SUNDRYITM.itm_sub3))
							.and(S0_T1.sno1.eq(S0_SUNDRYITM.sno1))
							.and(S0_T1.sno2.eq(S0_SUNDRYITM.sno2))
							.and(S0_T1.sno3.eq(S0_SUNDRYITM.sno3))
							.and(S0_T1.sno4.eq(S0_SUNDRYITM.sno4))
						)
						.leftOuterJoin(S0_M23).on(
							S0_M2.itm_typ.eq(S0_M23.itm_typ)
							.and(S0_M2.itm_typ_d_cd.eq(S0_M23.itm_typ_d_cd))
						)
						.leftOuterJoin(S0_M5).on(S0_T1.rqst_wg_cd.eq(S0_M5.wg_cd))
						.leftOuterJoin(S0_M6).on(S0_T1.in_to_loc_cd.eq(S0_M6.loc_cd))
						.leftOuterJoin(S0_M19).on(S0_M6.site_cd.eq(S0_M19.site_cd))
						.leftOuterJoin(S0_M45).on(
							S0_M2.itm_cd.eq(S0_M45.itm_cd)
							.and(S0_M2.itm_sub1.eq(S0_M45.itm_sub1))
							.and(S0_M2.itm_sub2.eq(S0_M45.itm_sub2))
							.and(S0_M2.itm_sub3.eq(S0_M45.itm_sub3))
							.and(S0_T1.sppl_cd.eq(S0_M45.sppl_cd))
							.and(S0_T1.maker_cd.eq(S0_M45.maker_cd))
							.and(S0_M45.wg_cd.eq(S0_M6.wg_cd))
							.and(S0_M45.mfg_loc_cd.eq(value(MAC_STR.NULL_VAL.value())))
							.and(S0_M45.rqst_loc_cd.eq(value(MAC_STR.NULL_VAL.value())))
							.and(S0_M45.bom_ptn.eq(value(MAC_STR.NULL_VAL.value())))
							.and(
									(cases()
									.when(MAPA_COMM$F_GET_PARM(value("MASTER_DT_BASE")).eq(value("1")))
										.then(S0_T1.rqst_avl_rqst_dt)
										.otherwise(bind("today"))
									).between(S0_M45.st_dt, S0_M45.end_dt)
							)
						)
						.leftOuterJoin(S0_M49).on(
							S0_M2.itm_cd.eq(S0_M49.itm_cd)
							.and(S0_M2.itm_sub1.eq(S0_M49.itm_sub1))
							.and(S0_M2.itm_sub2.eq(S0_M49.itm_sub2))
							.and(S0_M2.itm_sub3.eq(S0_M49.itm_sub3))
							.and(S0_T1.mfg_loc_cd.eq(S0_M49.mfg_loc_cd))
							.and(S0_T1.bom_ptn.eq(S0_M49.bom_ptn))
							.and(S0_M49.wg_cd.eq(S0_M6.wg_cd))
							.and(S0_M49.sppl_cd.eq(value(MAC_STR.NULL_VAL.value())))
							.and(S0_M49.maker_cd.eq(value(MAC_STR.NULL_VAL.value())))
							.and(S0_M49.rqst_loc_cd.eq(value(MAC_STR.NULL_VAL.value())))
							.and(
									(cases()
									.when(MAPA_COMM$F_GET_PARM(value("MASTER_DT_BASE")).eq(value("1")))
										.then(S0_T1.rqst_avl_rqst_dt)
										.otherwise(bind("today"))
									).between(S0_M45.st_dt, S0_M45.end_dt)
							)
						)
						.leftOuterJoin(S0_M11).on(
							S0_T1.purc_dpt_cd.eq(S0_M11.dpt_cd)
							.and(S0_T1.reg_dt.between(S0_M11.st_dt, S0_M11.end_dt))
						)
						.leftOuterJoin(S0_M33).on(
							S0_T1.bd_dpt_cd.eq(S0_M33.dpt_cd)
							.and(S0_T1.reg_dt.between(S0_M33.st_dt, S0_M33.end_dt))
						)
						.leftOuterJoin(S0_T4).on(
							S0_T1.po_schd_src_typ.eq(value(MSC_PO_SCHD_SRC_TYP.RQST.value()))
							.and(S0_T1.po_schd_src_no.eq(S0_T4.wg_rqst_prms_no))
						)
						.leftOuterJoin(S0_T5).on(S0_T4.wg_rqst_no.eq(S0_T5.wg_rqst_no))
						.leftOuterJoin(S0_M18).on(S0_T1.sppl_cd.eq(S0_M18.bp_cd))
						.leftOuterJoin(S0_M44).on(
							MAPA_BP$F_GET_AP_DPT_CD_NE2(
								S0_T1.sppl_cd,
								S0_M18.asppl_cd,
								bind("today"),
								value(false)
							).eq(S0_M44.dpt_cd)
							.and(S0_T1.reg_dt.between(S0_M44.st_dt, S0_M44.end_dt))
						)
						.leftOuterJoin(S0_M20).on(S0_T1.dlv_cd.eq(S0_M20.bp_cd))
						.leftOuterJoin(S0_M21).on(S0_T1.tdlv_cd.eq(S0_M21.bp_cd))
						.leftOuterJoin(S0_M25).on(bind("base_cur_cd").eq(S0_M25.cur_cd))
						.leftOuterJoin(S0_M30).on(bind("ptax_cur_cd").eq(S0_M30.cur_cd))
						.leftOuterJoin(S0_M36).on(
							bracket(
								S0_T1.itm_cd.eq(S0_M36.itm_cd)
								.and(S0_T1.itm_sub1.eq(S0_M36.itm_sub1))
								.and(S0_T1.itm_sub2.eq(S0_M36.itm_sub2))
								.and(S0_T1.itm_sub3.eq(S0_M36.itm_sub3))
								.and(S0_M36.lcl_cd.eq(S0_M18.prnt_lcl_cd))
							)
						)
						.leftOuterJoin(S0_IFCTL).on(
							bracket(
								S0_T1.sppl_cd.eq(S0_IFCTL.bp_cd)
								.and(bind("today").between(S0_IFCTL.st_dt, S0_IFCTL.end_dt))
								.and(S0_IFCTL.if_proc_typ.eq(value(MAC_IF_PROC_TYP.PO_SEND.value())))
								.and(S0_IFCTL.del_flg.eq(value(false)))
							)
						)
						.leftOuterJoin(S0_M40).on(
								S0_T1.rqst_fr_dpt_cd.eq(S0_M40.dpt_cd)
								.and(S0_T1.reg_dt.between(S0_M40.st_dt, S0_M40.end_dt))
						)
						.leftOuterJoin(S0_T10).on
							(bracket(
									S0_T10.slo_d_no.eq(S0_T1.slo_d_no)
								)
						)
					)
					.where(
						value(0).eq(value(0))
						.and(S0_T1.po_flg.eq(value(false)))
						.and(S0_T1.can_flg.eq(value(false)))
						.and(S0_T1.abort_flg.eq(value(false)))
					)
					.orderBy(S0_T1.po_schd_no.asc())
			)
			.setJoinInfo(
				joinInfo(
					j -> j
						.add(MAM_TRD_R.class, r -> toCondition(
							r.getStringNE("hdr.trd_cd")
						))
						.addSelect(m -> toArray(
							m.trd_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("hdr.trd_nm", m.trd_nm());
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
							m.unit_cd
						))
						.addMap((r, m) -> {
							r.setNumberNE("trd_unit_conv_base_qty", m.conv_base_qty());
							r.setNumberNE("trd_unit_conv_qty", m.conv_qty());
							r.setStringNE("join_unit_cd_", m.unit_cd());
					}),
					j -> j
						.add(MAM_UNIT_R.class, r -> toCondition(
							r.getStringNE("join_unit_cd_")
						))
						.addSelect(m -> toArray(
							m.dec_place,
							m.rnd_typ,
							m.unit_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("trd_unit_nm", m.unit_nm());
							r.setNumberNE("trd_unit_dec_place", m.dec_place());
							r.setStringNE("trd_unit_rnd_typ", m.rnd_typ());
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
							m.unit_cd
						))
						.addMap((r, m) -> {
							r.setStringNE("join_unit_cd_", m.unit_cd());
					}),
					j -> j
						.add(MAM_UNIT_R.class, r -> toCondition(
							r.getStringNE("join_unit_cd_")
						))
						.addSelect(m -> toArray(
							m.dec_place,
							m.rnd_typ,
							m.unit_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("base_unit_nm", m.unit_nm());
							r.setNumberNE("base_unit_dec_place", m.dec_place());
							r.setStringNE("base_unit_rnd_typ", m.rnd_typ());
					}),
					j -> j
						.add(MAM_WG_R.class, r -> toCondition(
							r.getStringNE("in_to_loc_wg_cd")
						))
						.addSelect(m -> toArray(
							m.wg_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("in_to_loc_wg_nm", m.wg_nm());
					}),
					j -> j
						.add(MAM_STR_LN_R.class, r -> toCondition(
							r.getStringNE("in_to_loc_cd"),
							r.getStringNE("str_ln_cd")
						))
						.addSelect(m -> toArray(
							m.str_ln_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("str_ln_nm", m.str_ln_nm());
					}),
					j -> j
						.add(MAM_LOC_R.class, r -> toCondition(
							r.getStringNE("mfg_loc_cd")
						))
						.addSelect(m -> toArray(
							m.loc_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("mfg_loc_nm", m.loc_nm());
					}),
					j -> j
						.add(MAM_USR_R.class, r -> toCondition(
							r.getStringNE("hdr.purc_usr_cd")
						))
						.addSelect(m -> toArray(
							m.usr_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("hdr.purc_usr_nm", m.usr_nm());
					}),
					j -> j
						.add(MAM_WG_R.class, r -> toCondition(
							r.getStringNE("hdr.purc_dpt_wg_cd")
						))
						.addSelect(m -> toArray(
							m.wg_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("hdr.purc_dpt_wg_nm", m.wg_nm());
					}),
					j -> j
						.add(MSVT_WRK_SNO_R.class, r -> toCondition(
							r.getStringNE("sno1")
						))
						.addSelect(m -> toArray(
							m.wrk_nm,
							m.wrk_no
						))
						.addMap((r, m) -> {
							r.setStringNE("hdr.wrk_no", m.wrk_no());
							r.setStringNE("hdr.wrk_nm", m.wrk_nm());
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
						.add(MAM_CNTRY_R.class, r -> toCondition(
							r.getStringNE("hdr.sppl_cntry_cd")
						))
						.addSelect(m -> toArray(
							m.cntry_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("hdr.sppl_cntry_nm", m.cntry_nm());
					}),
					j -> j
						.add(MAM_PO_PRINT_R.class, r -> toCondition(
							r.getStringNE("hdr.po_print_cd")
						))
						.addSelect(m -> toArray(
							m.po_print_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("hdr.po_print_nm", m.po_print_nm());
					}),
					j -> j
						.add(MAM_TTERM_R.class, r -> toCondition(
							r.getStringNE("hdr.tterm_cd1")
						))
						.addSelect(m -> toArray(
							m.tterm_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("hdr.tterm_nm1", m.tterm_nm());
					}),
					j -> j
						.add(MAM_TTERM_R.class, r -> toCondition(
							r.getStringNE("hdr.tterm_cd2")
						))
						.addSelect(m -> toArray(
							m.tterm_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("hdr.tterm_nm2", m.tterm_nm());
					}),
					j -> j
						.add(MAM_TTERM_R.class, r -> toCondition(
							r.getStringNE("hdr.tterm_cd3")
						))
						.addSelect(m -> toArray(
							m.tterm_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("hdr.tterm_nm3", m.tterm_nm());
					}),
					j -> j
						.add(MAM_BP_R.class, r -> toCondition(
							r.getStringNE("hdr.asppl_cd")
						))
						.addSelect(m -> toArray(
							m.bp_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("hdr.asppl_nm", m.bp_nm());
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
						.add(MAM_CUR_R.class, r -> toCondition(
							r.getStringNE("hdr.trd_cur_cd")
						))
						.addSelect(m -> toArray(
							m.amt_dec_place,
							m.cur_nm,
							m.upri_dec_place
						))
						.addMap((r, m) -> {
							r.setStringNE("hdr.trd_cur_nm", m.cur_nm());
							r.setNumberNE("hdr.trd_cur_amt_dec_place", m.amt_dec_place());
							r.setNumberNE("hdr.trd_cur_upri_dec_place", m.upri_dec_place());
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
						.add(MAM_USR_R.class, r -> toCondition(
							r.getStringNE("rqst_fr_usr_cd")
						))
						.addSelect(m -> toArray(
							m.usr_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("rqst_fr_usr_nm", m.usr_nm());
					})
				)
			);
	}
	
	/**
	 * -- MSBDL0080_MST_ARR_PURC_SCHD_Query_S01
	 */
	static MCQueryPlan MSBDL0080_MST_ARR_PURC_SCHD_S01() {
		MST_PO_D_R S0_T1 = MST_PO_D_R.create("T1");
		MST_ARR_PR_R S0_T2 = MST_ARR_PR_R.create("T2");
		MST_ARR_SCHD_R S0_T3 = MST_ARR_SCHD_R.create("T3");
		MST_PURC_SCHD_R S0_T4 = MST_PURC_SCHD_R.create("T4");
		MST_RCPT_IV_D_R S0_T5 = MST_RCPT_IV_D_R.create("T5");
		MST_PO_R S0_T6 = MST_PO_R.create("T6");
		MAM_BP_R S0_M1 = MAM_BP_R.create("M1");
		
		return createQueryPlan()
			.setQuery(
				sql("MSBDL0080_MST_ARR_PURC_SCHD_Query_S01")
				.mainQuery()
				.select(
					S0_T2.po_d_no,
					max(cases()
						.when(S0_T2.arr_qty.eq(value(0)).and(S0_T2.purc_qty.eq(value(0))))
							.then(value(false))
						.when(S0_T2.abort_flg.eq(value(false))
							.and(S0_T3.abort_flg.eq(value(true))))
							.then(value(false))
						.when(S0_T3.base_unit_qty.lte(S0_T3.arr_qty))
							.then(value(false))
						.otherwise(value(true))).as("arr_rem_abort_flg"),
					max(cases()
						.when(S0_T2.purc_qty.eq(value(0)).and(S0_T2.arr_qty.eq(value(0))))
							.then(value(false))
						.when(S0_T2.abort_flg.eq(value(false))
							.and(S0_T4.abort_flg.eq(value(true))))
							.then(value(false))
						.when(S0_T4.base_unit_schd_qty.lte(S0_T3.purc_qty.add(S0_T4.base_unit_accpt_dfct_qty)))
							.then(value(false))
						.otherwise(value(true))).as("purc_rem_abort_flg"),
					min(cases()
						.when(S0_M1.sppl_iv_flg.eq(value(true))
							.and(nvl(
									S0_T5.base_unit_qty,
									value(0)
								).gt(value(0)))
							.and(S0_T3.arr_qty.eq(value(0)))
							.and(S0_T3.purc_qty.add(S0_T4.base_unit_accpt_dfct_qty).eq(value(0))))
							.then(value(false))
						.otherwise(value(true))).as("iv_abort_flg")
				)
				.from(
					S0_T1
					.innerJoin(S0_T6).on(
						bracket(
							S0_T6.po_no.eq(S0_T1.po_no)
						)
					)
					.innerJoin(S0_T2).on(
						bracket(
							S0_T2.po_d_no.eq(S0_T1.po_d_no)
						)
					)
					.innerJoin(S0_T3).on(
						bracket(
							S0_T3.arr_pr_no.eq(S0_T2.arr_pr_no)
						)
					)
					.innerJoin(S0_T4).on(
						bracket(
							S0_T4.arr_pr_no.eq(S0_T3.arr_pr_no)
							.and(S0_T4.arr_schd_no.eq(S0_T3.arr_schd_no))
						)
					)
					.leftOuterJoin(S0_T5).on(
						bracket(
							S0_T5.purc_schd_no.eq(S0_T4.purc_schd_no)
						)
					)
					.leftOuterJoin(S0_M1).on(
						bracket(
							S0_T6.sppl_cd.eq(S0_M1.bp_cd)
						)
					)
				)
				.where(
					value(0).eq(value(0))
					.and(S0_T2.po_d_no.eq(bind("po_d_no")))
				)
				.groupBy(S0_T2.po_d_no)
			);
	}
	
	/**
	 * -- MSBDL0080_MST_PURC_DLV_SLIP_Query_S01
	 */
	static MCQueryPlan MSBDL0080_MST_PURC_DLV_SLIP_S01() {
		MST_PURC_DLV_SLIP_R S0_T1 = MST_PURC_DLV_SLIP_R.create("T1");
		MST_PURC_DLV_SLIP_D_R S0_T2 = MST_PURC_DLV_SLIP_D_R.create("T2");
		MST_DLV_SLIP_R S0_T3 = MST_DLV_SLIP_R.create("T3");
		MST_ARR_PR_R S0_T4 = MST_ARR_PR_R.create("T4");
		
		return createQueryPlan()
			.setQuery(
				sql("MSBDL0080_MST_PURC_DLV_SLIP_Query_S01")
				.mainQuery()
				.select(
					S0_T1.po_no,
					S0_T2.po_d_no,
					S0_T1.dlv_slip_no,
					S0_T1.dlv_slip_seq,
					S0_T1.dlv_slip_mng_no,
					S0_T1.dlv_slip_mng_seq,
					S0_T1.slip_prnt_flg.as("dlv_print_flg"),
					S0_T2.purc_ddlv_dlv_slip_no,
					S0_T3.slip_prnt_flg.as("purc_ddlv_dlv_print_flg")
				)
				.from(
					S0_T1
					.innerJoin(S0_T2).on(
						bracket(
							S0_T2.dlv_slip_mng_no.eq(S0_T1.dlv_slip_mng_no)
							.and(S0_T2.dlv_slip_mng_seq.eq(S0_T1.dlv_slip_mng_seq))
						)
					)
					.leftOuterJoin(S0_T3).on(
						bracket(
							S0_T3.dlv_slip_no.eq(S0_T2.purc_ddlv_dlv_slip_no)
							.and(S0_T3.dlv_slip_seq.eq(S0_T2.purc_ddlv_dlv_slip_seq))
						)
					)
					.leftOuterJoin(S0_T4).on(
						bracket(
							S0_T4.po_d_no.eq(S0_T2.po_d_no)
						)
					)
				)
				.where(
					value(0).eq(value(0))
					.and(S0_T1.po_no.eq(bind("po_no")))
					.and(bind("po_rev").between(S0_T1.po_rev, S0_T1.last_po_rev))
					.and(S0_T1.purc_dlv_slip_src_typ.eq(value(MSC_PURC_DLV_SLIP_SRC_TYP.PO.value())))
					.and(
						value(true).eq(
							cases()
							.when(bind("tmp_can_flg").eq(value(true)))
							.then(
								cases()
								.when(S0_T1.slip_sts_typ.eq(value(MAC_SLIP_STS_TYP.CAN.value())))
								.then(value(true))
								.otherwise(value(false))
							)
							.otherwise(
								cases()
								.when(S0_T1.slip_sts_typ.neq(value(MAC_SLIP_STS_TYP.CAN.value())))
								.then(
									cases()
									.when(
										bracket(
											S0_T4.abort_flg.eq(value(true))
										)
									)
									.then(value(false))
									.otherwise(value(true))
								)
								.otherwise(value(false))
							)
						)
					)
				)
				.orderBy(
					S0_T2.po_d_no.asc(),
					S0_T1.po_rev.desc(),
					S0_T1.last_po_rev.asc(),
					S0_T1.slip_sts_typ.asc()
				)
			);
	}
}