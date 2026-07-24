package mcframe.serverMSBD.MSBDL5200;

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
	 * -- MSBDL5200_MST_PURC_DLV_SLIP_D_Query_S01
	 */
	static MCQueryPlan MSBDL5200_MST_PURC_DLV_SLIP_D_S01() {
		MST_PURC_DLV_SLIP_D_R S0_DLVSLIPD = MST_PURC_DLV_SLIP_D_R.create("DLVSLIPD");
		MST_PURC_DLV_SLIP_R S0_DLVSLIP = MST_PURC_DLV_SLIP_R.create("DLVSLIP");
		MSW_PURC_DLV_SLIP_KEY_R S0_W1 = MSW_PURC_DLV_SLIP_KEY_R.create("W1");
		MST_PO_R S0_PO = MST_PO_R.create("PO");
		MAM_LOC_R S0_LOC = MAM_LOC_R.create("LOC");
		MAM_ITM_R S0_ITM = MAM_ITM_R.create("ITM");
		MAM_TAX_R S0_TAX = MAM_TAX_R.create("TAX");
		MAM_CUR_R S0_CUR = MAM_CUR_R.create("CUR");
		MAM_BP_R S0_OUTSRCBP = MAM_BP_R.create("OUTSRCBP");
		MAM_BP_ITM_R S0_BPITM = MAM_BP_ITM_R.create("BPITM");
		MAM_CNTRY_R S0_CNTRY1 = MAM_CNTRY_R.create("CNTRY1");
		MAM_CNTRY_R S0_CNTRY2 = MAM_CNTRY_R.create("CNTRY2");
		
		return createQueryPlan()
				.setQuery(
					sql("MSBDL5200_MST_PURC_DLV_SLIP_D_Query_S01")
						.mainQuery()
						.select(
							S0_OUTSRCBP.prnt_lcl_cd.as("outsrc_bp_prnt_lcl_cd"),
							S0_DLVSLIPD.prov_ddlv_flg.as("outsrc_prov_ddlv_flg"),
							S0_DLVSLIPD.sundry_itm_flg.as("outsrc_sundry_itm_flg"),
							S0_OUTSRCBP.cntry_cd.as("outsrc_bp_cntry_cd"),
							S0_LOC.cntry_cd.as("outsrc_loc_cntry_cd"),
							S0_DLVSLIP.dlv_slip_mng_no,
							S0_DLVSLIP.dlv_slip_mng_seq,
							S0_DLVSLIP.dlv_slip_no.as("\"hdr.dlv_slip_no\""),
							S0_DLVSLIP.dlv_slip_seq.as("\"hdr.dlv_slip_seq\""),
							S0_DLVSLIP.dlv_slip_seq.as("\"hdr.dlv_slip_seq_view\""),
							S0_DLVSLIP.dlv_slip_rev.as("\"hdr.dlv_slip_rev\""),
							S0_DLVSLIP.slip_sts_typ.as("\"hdr.slip_sts_typ\""),
							S0_DLVSLIP.trd_cd.as("\"hdr.trd_cd\""),
							S0_DLVSLIP.trd_ptn_typ.as("\"hdr.trd_ptn_typ\""),
							S0_DLVSLIP.arr_loc_cd.as("\"hdr.dlv_id_cd\""),
							S0_DLVSLIP.arr_loc_nm.as("\"hdr.dlv_id_nm\""),
							S0_DLVSLIP.usr_cd.as("\"hdr.usr_cd\""),
							S0_DLVSLIP.dpt_cd.as("\"hdr.dpt_cd\""),
							cases()
								.when(
									S0_DLVSLIPD.prov_ddlv_flg.eq(value(true))
								)
								.then(S0_DLVSLIP.sppl_cntct_dpt)
							.otherwise(nullValue()).as("\"hdr.dpt_nm\""),
							cases()
								.when(
									S0_DLVSLIPD.prov_ddlv_flg.eq(value(true))
								)
								.then(S0_DLVSLIP.sppl_cntct_psn)
							.otherwise(nullValue()).as("\"hdr.usr_nm\""),
							S0_PO.po_dt,
							S0_PO.purc_dpt_cd,
							S0_PO.purc_usr_cd,
							nullValue().as("\"hdr.dlv_slip_po_no\""),
							S0_DLVSLIP.trd_rmrks.as("\"hdr.po_trd_rmrks\""),
							S0_DLVSLIP.dlv_rqst_tm.as("\"hdr.dlv_rqst_dt\""),
							S0_DLVSLIP.dlv_rqst_tm.as("\"hdr.dlv_rqst_tm\""),
							S0_DLVSLIP.dlv_rqst_tm.as("\"hdr.dlv_dt\""),
							S0_DLVSLIP.dlv_rqst_tm.as("\"hdr.dlv_tm\""),
							nullValue().as("\"hdr.ship_dt\""),
							nullValue().as("\"hdr.ship_tm\""),
							S0_DLVSLIP.bp_cd.as("\"hdr.slo_co_cd\""),
							S0_DLVSLIP.arr_loc_zip_cd.as("\"hdr.po_co_zip_cd\""),
							S0_DLVSLIP.arr_loc_addr1.as("\"hdr.po_co_addr1\""),
							S0_DLVSLIP.arr_loc_addr2.as("\"hdr.po_co_addr2\""),
							S0_DLVSLIP.arr_loc_addr3.as("\"hdr.po_co_addr3\""),
							S0_DLVSLIP.arr_loc_addr4.as("\"hdr.po_co_addr4\""),
							S0_DLVSLIP.arr_loc_tel.as("\"hdr.po_co_tel\""),
							S0_DLVSLIP.arr_loc_fax.as("\"hdr.po_co_fax\""),
							S0_DLVSLIP.arr_loc_zip_cd.as("\"hdr.dlv_zip_cd\""),
							S0_DLVSLIP.arr_loc_addr1.as("\"hdr.dlv_addr1\""),
							S0_DLVSLIP.arr_loc_addr2.as("\"hdr.dlv_addr2\""),
							S0_DLVSLIP.arr_loc_addr3.as("\"hdr.dlv_addr3\""),
							S0_DLVSLIP.arr_loc_addr4.as("\"hdr.dlv_addr4\""),
							S0_DLVSLIP.arr_loc_tel.as("\"hdr.dlv_tel\""),
							S0_DLVSLIP.arr_loc_fax.as("\"hdr.dlv_fax\""),
							S0_DLVSLIP.bp_cntct_psn.as("\"hdr.dlv_cntct_psn\""),
							S0_DLVSLIP.bp_cntct_dpt.as("\"hdr.dlv_cntct_dpt\""),
							S0_DLVSLIP.trd_cur_nm.as("\"hdr.trd_cur_nm\""),
							S0_DLVSLIP.trd_cur_cd.as("\"hdr.trd_cur_cd\""),
							cases()
								.when(
										S0_DLVSLIPD.prov_ddlv_flg.eq(value(true))
								)
								.then(nvl(S0_DLVSLIP.trd_cur_cd, S0_OUTSRCBP.cur_cd))
							.otherwise(nvl(S0_DLVSLIP.trd_cur_cd, S0_PO.trd_cur_cd)).as("cur_cd_for_attach"),
							S0_DLVSLIP.sub_char1.as("\"hdr.po_sub_char1\""),
							S0_DLVSLIP.sub_char2.as("\"hdr.po_sub_char2\""),
							S0_DLVSLIP.sub_char3.as("\"hdr.po_sub_char3\""),
							S0_DLVSLIP.sppl_zip_cd.as("\"hdr.slo_co_zip_cd\""),
							S0_DLVSLIP.sppl_addr1.as("\"hdr.slo_co_addr1\""),
							S0_DLVSLIP.sppl_addr2.as("\"hdr.slo_co_addr2\""),
							S0_DLVSLIP.sppl_addr3.as("\"hdr.slo_co_addr3\""),
							S0_DLVSLIP.sppl_addr4.as("\"hdr.slo_co_addr4\""),
							S0_DLVSLIP.sppl_tel.as("\"hdr.slo_co_tel\""),
							S0_DLVSLIP.sppl_fax.as("\"hdr.slo_co_fax\""),
							S0_DLVSLIP.sppl_cntct_psn.as("\"hdr.po_co_cntct_psn\""),
							S0_DLVSLIP.sppl_cntct_dpt.as("\"hdr.po_co_cntct_dpt\""),
							cases()
								.when(
										S0_DLVSLIPD.prov_ddlv_flg.eq(value(true))
								)
									.then(S0_OUTSRCBP.sppl_cntct_psn_title)
								.otherwise(nullValue()).as("\"hdr.dlv_cntct_psn_title\""),
							S0_DLVSLIPD.dlv_slip_d_no.as("\"dtl.dlv_slip_d_no\""),
							S0_DLVSLIPD.dlv_slip_d_seq.as("\"dtl.dlv_slip_d_seq\""),
							S0_DLVSLIPD.itm_cd.as("\"dtl.dlv_slip_itm_cd\""),
							S0_DLVSLIPD.itm_sub1.as("\"dtl.itm_sub1_data\""),
							S0_DLVSLIPD.itm_sub2.as("\"dtl.itm_sub2_data\""),
							S0_DLVSLIPD.itm_sub3.as("\"dtl.itm_sub3_data\""),
							cases()
								.when(S0_DLVSLIPD.sundry_itm_flg.eq(value(true)))
									.then(S0_DLVSLIPD.itm_nm)
								.otherwise(S0_ITM.itm_nm).as("\"dtl.dlv_slip_itm_nm\""),
							S0_ITM.itm_alt_nm1.as("\"dtl.dlv_slip_itm_alt_nm1\""),
							S0_ITM.itm_alt_nm2.as("\"dtl.dlv_slip_itm_alt_nm2\""),
							S0_ITM.itm_alt_nm3.as("\"dtl.dlv_slip_itm_alt_nm3\""),
							S0_ITM.itm_alt_nm4.as("\"dtl.dlv_slip_itm_alt_nm4\""),
							S0_DLVSLIPD.trd_unit_cd.as("\"dtl.slo_po_unit_cd\""),
							S0_DLVSLIPD.trd_unit_po_qty.as("\"dtl.trd_unit_po_qty\""),
							S0_DLVSLIPD.trd_unit_po_qty.as("\"dtl.slo_po_qty\""),
							S0_DLVSLIPD.trd_unit_qty.as("\"dtl.trd_unit_qty\""),
							S0_DLVSLIPD.trd_unit_qty.as("\"dtl.dlv_inst_qty\""),
							S0_DLVSLIPD.trd_unit_cd.as("\"dtl.dlv_inst_unit_cd\""),
							S0_DLVSLIPD.trd_unit_cd.as("\"dtl.trd_unit_cd\""),
							S0_DLVSLIPD.interim_flg.as("\"dtl.interim_flg\""),
							S0_DLVSLIPD.trd_cur_upri.as("\"dtl.trd_cur_upri\""),
							S0_DLVSLIPD.trd_cur_amt.as("\"dtl.trd_cur_amt\""),
							S0_DLVSLIPD.trd_cur_dscnt_amt.as("\"dtl.trd_cur_dscnt_amt\""),
							S0_DLVSLIPD.trd_cur_tax_amt.as("\"dtl.trd_cur_tax_amt\""),
							S0_DLVSLIPD.sub_char1.as("\"dtl.arr_schd_sub_char1\""),
							S0_DLVSLIPD.sub_char2.as("\"dtl.arr_schd_sub_char2\""),
							S0_DLVSLIPD.sub_char3.as("\"dtl.arr_schd_sub_char3\""),
							S0_DLVSLIPD.sno1.as("\"dtl.sno1\""),
							S0_DLVSLIPD.sno2.as("\"dtl.sno2\""),
							S0_DLVSLIPD.sno3.as("\"dtl.sno3\""),
							S0_DLVSLIPD.sno4.as("\"dtl.sno4\""),
							S0_DLVSLIPD.lot_no.as("\"dtl.lot_no_data\""),
							S0_DLVSLIPD.sublot_no.as("\"dtl.sublot_no_data\""),
							value(1).as("\"dtl.pack_qty\""),
							value(1).as("\"dtl.ttl_pack_qty\""),
							S0_DLVSLIPD.tax_cd.as("\"dtl.tax_cd\""),
							S0_TAX.tax_nm.as("\"dtl.tax_nm\""),
							S0_TAX.tax_rate.as("\"dtl.tax_rate\""),
							S0_TAX.tax_typ.as("\"dtl.tax_typ\""),
							bracket(
									S0_DLVSLIPD.trd_cur_amt.add(S0_DLVSLIPD.trd_cur_tax_amt)
							).as("\"dtl.trd_cur_tax_in_amt\""),
							S0_DLVSLIPD.dlv_inst_d_no.as("\"dtl.dlv_inst_d_no\""),
							S0_DLVSLIPD.base_unit_qty.as("\"dtl.base_unit_qty\""),
							S0_DLVSLIPD.base_unit_po_qty.as("\"dtl.base_unit_qty\""),
							S0_DLVSLIPD.base_unit_cd.as("\"dtl.base_unit_cd\""),
							cases()
								.when(
										S0_DLVSLIPD.prov_ddlv_flg.eq(value(true))
								)
									.then(S0_BPITM.bp_itm_cd)
								.otherwise(S0_DLVSLIPD.sppl_itm_cd).as("\"dtl.cst_itm_cd\""),
							cases()
								.when(
										S0_DLVSLIPD.prov_ddlv_flg.eq(value(true))
								)
									.then(S0_BPITM.bp_itm_nm)
								.otherwise(S0_DLVSLIPD.sppl_itm_nm).as("\"dtl.cst_itm_nm\""),
							S0_DLVSLIP.wg_cd,
							S0_DLVSLIPD.pri_prnt_flg.as("pri_print_flg"),
							S0_CUR.amt_dec_place.as("amt_dec_place"),
							S0_CUR.upri_dec_place.as("upri_dec_place"),
							S0_TAX.inc_tax_flg.as("\"dtl.inc_tax_flg\""),
							S0_DLVSLIPD.trd_d_rmrks.as("\"dtl.trd_d_rmrks\""),
							S0_DLVSLIPD.purc_ddlv_flg.as("purc_ddlv_flg"),
							S0_DLVSLIPD.prov_ddlv_flg.as("prov_ddlv_flg"),
							S0_LOC.sppl_cd.as("\"hdr.po_co_cd\""),
							S0_OUTSRCBP.bp_nm.as("\"hdr.po_co_nm\""),
							S0_OUTSRCBP.bp_alt_nm1.as("\"hdr.po_co_alt_nm1\""),
							S0_OUTSRCBP.bp_alt_nm2.as("\"hdr.po_co_alt_nm2\""),
							S0_OUTSRCBP.bp_alt_nm3.as("\"hdr.po_co_alt_nm3\""),
							S0_OUTSRCBP.bp_alt_nm4.as("\"hdr.po_co_alt_nm4\""),
							S0_DLVSLIP.trd_rmrks.as("\"hdr.trd_rmrks\""),
							S0_ITM.dscnt_itm_flg.as("\"dtl.dscnt_itm_flg\"")
							,S0_CNTRY1.cntry_nm.as("\"hdr.slo_co_cntry_nm\"")
							,S0_CNTRY2.cntry_nm.as("\"hdr.po_co_cntry_nm\"")
							,S0_CNTRY2.cntry_nm.as("\"hdr.dlv_cntry_nm\"")
						)
						.from(
							S0_DLVSLIPD
							.innerJoin(S0_DLVSLIP).on(
								bracket(
									S0_DLVSLIPD.dlv_slip_mng_no.eq(S0_DLVSLIP.dlv_slip_mng_no)
									.and(S0_DLVSLIPD.dlv_slip_mng_seq.eq(S0_DLVSLIP.dlv_slip_mng_seq))
								)
							)
							.innerJoin(S0_W1).on(
									bracket(
										S0_W1.dlv_slip_mng_no.eq(S0_DLVSLIP.dlv_slip_mng_no)
										.and(S0_W1.dlv_slip_mng_seq.eq(S0_DLVSLIP.dlv_slip_mng_seq))
									)
							)
							.innerJoin(S0_PO).on(
									bracket(
										S0_PO.po_no.eq(S0_DLVSLIP.po_no)
										.and(S0_PO.dlv_slip_form_cd.isNotNull())
									)
							)
							.leftOuterJoin(S0_LOC).on(
								bracket(
									S0_DLVSLIP.arr_loc_cd.eq(S0_LOC.loc_cd)
								)
							)
							.leftOuterJoin(S0_ITM).on(
								bracket(
										S0_DLVSLIPD.itm_cd.eq(S0_ITM.itm_cd)
									.and(S0_DLVSLIPD.itm_sub1.eq(S0_ITM.itm_sub1))
									.and(S0_DLVSLIPD.itm_sub2.eq(S0_ITM.itm_sub2))
									.and(S0_DLVSLIPD.itm_sub3.eq(S0_ITM.itm_sub3))
								)
							)
							.leftOuterJoin(S0_TAX).on(
								bracket(
									S0_DLVSLIPD.tax_cd.eq(S0_TAX.tax_cd)
								)
							)
							.leftOuterJoin(S0_CUR).on(
									bracket(
										S0_DLVSLIP.trd_cur_cd.eq(S0_CUR.cur_cd)
									)
								)
							.leftOuterJoin(S0_OUTSRCBP).on(
								bracket(
									S0_LOC.sppl_cd.eq(S0_OUTSRCBP.bp_cd)
								)
							)
							.leftOuterJoin(S0_BPITM).on(
								bracket(
									S0_LOC.sppl_cd.eq(S0_BPITM.bp_cd)
									.and(S0_DLVSLIPD.itm_cd.eq(S0_BPITM.itm_cd))
									.and(S0_DLVSLIPD.itm_sub1.eq(S0_BPITM.itm_sub1))
									.and(S0_DLVSLIPD.itm_sub2.eq(S0_BPITM.itm_sub2))
									.and(S0_DLVSLIPD.itm_sub3.eq(S0_BPITM.itm_sub3))
									.and(bind("dt").between(S0_BPITM.st_dt, S0_BPITM.end_dt))
								)
							)
							.leftOuterJoin(S0_CNTRY1).on(
								bracket(
									S0_OUTSRCBP.cntry_cd.eq(S0_CNTRY1.cntry_cd)
								)
							)
							.leftOuterJoin(S0_CNTRY2).on(
								bracket(
									S0_LOC.cntry_cd.eq(S0_CNTRY2.cntry_cd)
								)
							)
						)
						.where(
								value(0).eq(value(0))
								.and(S0_DLVSLIPD.dlv_slip_invalid_flg.eq(value(false)))
						)
						.orderBy(
							S0_DLVSLIPD.dlv_slip_mng_d_no.asc(),
							S0_DLVSLIPD.dlv_slip_mng_d_seq.asc()
						)
				)
				.setJoinInfo(
					joinInfo(
						j -> j
							.add(MAM_BP_LCL_R.class, r -> toCondition(
								r.getStringNE("hdr.slo_co_cd"),
								r.getStringNE("outsrc_bp_prnt_lcl_cd")
							))
							.addSelect(m -> toArray(
								m.bp_nm,
								m.bp_alt_nm1,
								m.bp_alt_nm2,
								m.bp_alt_nm3,
								m.bp_alt_nm4
							))
							.addMap((r, m) -> {
								r.setStringNE("prov_hdr.slo_co_nm", m.bp_nm());
								r.setStringNE("prov_hdr.slo_co_alt_nm1", m.bp_alt_nm1());
								r.setStringNE("prov_hdr.slo_co_alt_nm2", m.bp_alt_nm2());
								r.setStringNE("prov_hdr.slo_co_alt_nm3", m.bp_alt_nm3());
								r.setStringNE("prov_hdr.slo_co_alt_nm4", m.bp_alt_nm4());
						}),
						j -> j
							.add(MAM_CNTRY_LCL_R.class, r -> toCondition(
								r.getStringNE("outsrc_loc_cntry_cd"),
								r.getStringNE("outsrc_bp_prnt_lcl_cd")
							))
							.addSelect(m -> toArray(
								m.cntry_nm
							))
							.addMap((r, m) -> {
								r.setStringNE("prov_hdr.po_co_cntry_nm", m.cntry_nm());
								r.setStringNE("prov_hdr.dlv_cntry_nm", m.cntry_nm());
						}),
						j -> j
							.add(MAM_CNTRY_LCL_R.class, r -> toCondition(
								r.getStringNE("outsrc_bp_cntry_cd"),
								r.getStringNE("outsrc_bp_prnt_lcl_cd")
							))
							.addSelect(m -> toArray(
								m.cntry_nm
							))
							.addMap((r, m) -> {
								r.setStringNE("prov_hdr.slo_co_cntry_nm", m.cntry_nm());
						}),
						j -> j
							.add(MAM_BP_LCL_R.class, r -> toCondition(
								r.getStringNE("hdr.po_co_cd"),
								r.getStringNE("outsrc_bp_prnt_lcl_cd")
							))
							.addSelect(m -> toArray(
								m.bp_nm,
								m.bp_alt_nm1,
								m.bp_alt_nm2,
								m.bp_alt_nm3,
								m.bp_alt_nm4
							))
							.addMap((r, m) -> {
								r.setStringNE("prov_hdr.po_co_nm", m.bp_nm());
								r.setStringNE("prov_hdr.po_co_alt_nm1", m.bp_alt_nm1());
								r.setStringNE("prov_hdr.po_co_alt_nm2", m.bp_alt_nm2());
								r.setStringNE("prov_hdr.po_co_alt_nm3", m.bp_alt_nm3());
								r.setStringNE("prov_hdr.po_co_alt_nm4", m.bp_alt_nm4());
						}),
						j -> j
							.add(MAM_TAX_LCL_R.class, r -> toCondition(
								r.getStringNE("dtl.tax_cd"),
								r.getStringNE("outsrc_bp_prnt_lcl_cd")
							))
							.addSelect(m -> toArray(
								m.tax_nm
							))
							.addMap((r, m) -> {
								r.setStringNE("prov_dtl.tax_nm", m.tax_nm());
						}),
						j -> j
							.add(MAM_ITM_LCL_R.class, r -> toCondition(
								r.getStringNE("dtl.dlv_slip_itm_cd"),
								r.getStringNE("dtl.itm_sub1_data"),
								r.getStringNE("dtl.itm_sub2_data"),
								r.getStringNE("dtl.itm_sub3_data"),
								r.getStringNE("outsrc_bp_prnt_lcl_cd")
							))
							.addSelect(m -> toArray(
								m.itm_nm,
								m.itm_alt_nm1,
								m.itm_alt_nm2,
								m.itm_alt_nm3,
								m.itm_alt_nm4
							))
							.addMap((r, m) -> {
								r.setStringNE("prov_dtl.dlv_slip_itm_nm", m.itm_nm());
								r.setStringNE("prov_dtl.dlv_slip_itm_alt_nm1", m.itm_alt_nm1());
								r.setStringNE("prov_dtl.dlv_slip_itm_alt_nm2", m.itm_alt_nm2());
								r.setStringNE("prov_dtl.dlv_slip_itm_alt_nm3", m.itm_alt_nm3());
								r.setStringNE("prov_dtl.dlv_slip_itm_alt_nm4", m.itm_alt_nm4());
						}),
						j -> j
							.add(MAM_USR_LCL_R.class, r -> toCondition(
								r.getStringNE("purc_usr_cd"),
								r.getStringNE("outsrc_bp_prnt_lcl_cd")
							))
							.addSelect(m -> toArray(
								m.usr_nm
							))
							.addMap((r, m) -> {
								r.setStringNE("prov_hdr.usr_nm", m.usr_nm());
						}),
						j -> j
							.add(MAM_DPT_LCL_R.class, r -> toCondition(
								r.getStringNE("purc_dpt_cd"),
								r.getDateNE("po_dt"),
								r.getStringNE("outsrc_bp_prnt_lcl_cd")
							))
							.addSelect(m -> toArray(
								m.dpt_nm
							))
							.addMap((r, m) -> {
								r.setStringNE("prov_hdr.dpt_nm", m.dpt_nm());
						}),
						j -> j
							.add(MAM_UNIT_LCL_R.class, r -> toCondition(
								r.getStringNE("dtl.slo_po_unit_cd"),
								r.getStringNE("outsrc_bp_prnt_lcl_cd")
							))
							.addSelect(m -> toArray(
								m.unit_nm
							))
							.addMap((r, m) -> {
								r.setStringNE("prov_dtl.slo_po_unit_nm", m.unit_nm());
						}),
						j -> j
							.add(MAM_UNIT_LCL_R.class, r -> toCondition(
								r.getStringNE("dtl.dlv_inst_unit_cd"),
								r.getStringNE("outsrc_bp_prnt_lcl_cd")
							))
							.addSelect(m -> toArray(
								m.unit_nm
							))
							.addMap((r, m) -> {
								r.setStringNE("prov_dtl.dlv_inst_unit_nm", m.unit_nm());
								r.setStringNE("prov_dtl.trd_unit_nm", m.unit_nm());
						}),
						j -> j
							.add(MAM_UNIT_LCL_R.class, r -> toCondition(
								r.getStringNE("dtl.base_unit_cd"),
								r.getStringNE("outsrc_bp_prnt_lcl_cd")
							))
							.addSelect(m -> toArray(
								m.unit_nm
							))
							.addMap((r, m) -> {
								r.setStringNE("prov_dtl.base_unit_nm", m.unit_nm());
						}),
						j -> j
							.add(MAM_BP_R.class, r -> toCondition(
								r.getStringNE("hdr.slo_co_cd")
							))
							.addSelect(m -> toArray(
								m.bp_alt_nm1,
								m.bp_alt_nm2,
								m.bp_alt_nm3,
								m.bp_alt_nm4,
								m.bp_nm,
								m.purc_amt_rnd_typ,
								m.purc_tax_rnd_typ,
								m.std_co_cd
							))
							.addMap((r, m) -> {
								r.setStringNE("hdr.slo_co_nm", m.bp_nm());
								r.setStringNE("hdr.slo_co_alt_nm1", m.bp_alt_nm1());
								r.setStringNE("hdr.slo_co_alt_nm2", m.bp_alt_nm2());
								r.setStringNE("hdr.slo_co_alt_nm3", m.bp_alt_nm3());
								r.setStringNE("hdr.slo_co_alt_nm4", m.bp_alt_nm4());
								r.setStringNE("hdr.slo_std_co_cd", m.std_co_cd());
								r.setStringNE("purc_amt_rnd_typ", m.purc_amt_rnd_typ());
								r.setStringNE("purc_tax_rnd_typ", m.purc_tax_rnd_typ());
						}),
						j -> j
							.add(MAM_UNIT_R.class, r -> toCondition(
								r.getStringNE("dtl.slo_po_unit_cd")
							))
							.addSelect(m -> toArray(
								m.unit_nm
							))
							.addMap((r, m) -> {
								r.setStringNE("dtl.slo_po_unit_nm", m.unit_nm());
						}),
						j -> j
							.add(MAM_UNIT_R.class, r -> toCondition(
								r.getStringNE("dtl.dlv_inst_unit_cd")
							))
							.addSelect(m -> toArray(
								m.unit_nm
							))
							.addMap((r, m) -> {
								r.setStringNE("dtl.dlv_inst_unit_nm", m.unit_nm());
								r.setStringNE("dtl.trd_unit_nm", m.unit_nm());
						}),
						j -> j
							.add(MAM_UNIT_R.class, r -> toCondition(
								r.getStringNE("dtl.base_unit_cd")
							))
							.addSelect(m -> toArray(
								m.unit_nm
							))
							.addMap((r, m) -> {
								r.setStringNE("dtl.base_unit_nm", m.unit_nm());
						}),
							j -> j
							.add(MAM_DPT_R.class, r -> toCondition(
								r.getStringNE("purc_dpt_cd") ,r.getDateNE("po_dt")
							))
							.addSelect(m -> toArray(
								m.dpt_nm
							))
							.addMap((r, m) -> {
								r.setStringNE("purc_dpt_nm", m.dpt_nm());
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
						})
					)
				);
				
	}
	
	/**
	 * -- MSBDL5200_MST_DLV_INST_D_Query_S01
	 */
	static MCQueryPlan MSBDL5200_MST_DLV_INST_D_S01() {
		MST_DLV_INST_R S0_INST = MST_DLV_INST_R.create("INST");
		MST_DLV_INST_D_R S0_INSTD = MST_DLV_INST_D_R.create("INSTD");
		MST_PO_D_R S0_POD = MST_PO_D_R.create("POD");
		MST_PO_R S0_PO = MST_PO_R.create("PO");
		MAM_LOC_R S0_LOC = MAM_LOC_R.create("LOC");
		MAM_BP_R S0_DLV = MAM_BP_R.create("DLV");
		MAM_BP_R S0_TDLV = MAM_BP_R.create("TDLV");
		MAM_BP_R S0_IDLV = MAM_BP_R.create("IDLV");
		MAM_BP_R S0_ITDLV = MAM_BP_R.create("ITDLV");
		MAM_BP_R S0_BP = MAM_BP_R.create("BP");
		MAM_CNTRY_R S0_CNTRY = MAM_CNTRY_R.create("CNTRY");
		MSW_DLV_INST_KEY_R S0_W1 = MSW_DLV_INST_KEY_R.create("W1");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBDL5200_MST_DLV_INST_D_Query_S01")
					.mainQuery()
					.select(
						S0_INSTD.dlv_inst_no,
						S0_INSTD.dlv_inst_d_no,
						S0_INSTD.dlv_rqst_tm.as("dtl_dlv_rqst_dt"),
						S0_INSTD.dlv_rqst_tm.as("dtl_dlv_rqst_tm"),
						S0_INSTD.trd_unit_qty,
						S0_INSTD.trd_unit_cd,
						coalesce(
							S0_INSTD.tdlv_cd,
							S0_POD.tdlv_cd,
							S0_INSTD.dlv_cd,
							S0_POD.dlv_cd,
							S0_INSTD.in_to_loc_cd
						).as("dtl_in_to_loc_cd"),
						nvl2(
							S0_INSTD.tdlv_cd,
							nvl(
								S0_INSTD.tdlv_nm,
								S0_ITDLV.bp_nm
							),
							nvl2(
								S0_POD.tdlv_cd,
								nvl(
									S0_POD.tdlv_nm,
									S0_TDLV.bp_nm
								),
								nvl2(
									S0_INSTD.dlv_cd,
									nvl(
										S0_INSTD.dlv_nm,
										S0_IDLV.bp_nm
									),
									nvl2(
										S0_POD.dlv_cd,
										nvl(
											S0_POD.dlv_nm,
											S0_DLV.bp_nm
										),
										S0_LOC.loc_nm
									)
								)
							)
						).as("dtl_in_to_loc_nm"),
						nvl2(
							S0_INSTD.tdlv_cd,
							S0_ITDLV.bp_alt_nm1,
							nvl2(
								S0_POD.tdlv_cd,
								S0_TDLV.bp_alt_nm1,
								nvl2(
									S0_INSTD.dlv_cd,
									S0_IDLV.bp_alt_nm1,
									nvl2(
										S0_POD.dlv_cd,
										S0_DLV.bp_alt_nm1,
										nullValue()
									)
								)
							)
						).as("dtl_in_to_loc_alt_nm1"),
						nvl2(
							S0_INSTD.tdlv_cd,
							S0_ITDLV.bp_alt_nm2,
							nvl2(
								S0_POD.tdlv_cd,
								S0_TDLV.bp_alt_nm2,
								nvl2(
									S0_INSTD.dlv_cd,
									S0_IDLV.bp_alt_nm2,
									nvl2(
										S0_POD.dlv_cd,
										S0_DLV.bp_alt_nm2,
										nullValue()
									)
								)
							)
						).as("dtl_in_to_loc_alt_nm2"),
						nvl2(
							S0_INSTD.tdlv_cd,
							S0_ITDLV.bp_alt_nm3,
							nvl2(
								S0_POD.tdlv_cd,
								S0_TDLV.bp_alt_nm3,
								nvl2(
									S0_INSTD.dlv_cd,
									S0_IDLV.bp_alt_nm3,
									nvl2(
										S0_POD.dlv_cd,
										S0_DLV.bp_alt_nm3,
										nullValue()
									)
								)
							)
						).as("dtl_in_to_loc_alt_nm3"),
						nvl2(
							S0_INSTD.tdlv_cd,
							S0_ITDLV.bp_alt_nm4,
							nvl2(
								S0_POD.tdlv_cd,
								S0_TDLV.bp_alt_nm4,
								nvl2(
									S0_INSTD.dlv_cd,
									S0_IDLV.bp_alt_nm4,
									nvl2(
										S0_POD.dlv_cd,
										S0_DLV.bp_alt_nm4,
										nullValue()
									)
								)
							)
						).as("dtl_in_to_loc_alt_nm4"),
						S0_INSTD.dlv_inst_print_d_rmrks.as("dlv_inst_prnt_d_rmrks"),
						S0_INSTD.sub_char1.as("dlv_inst_d_sub_char1"),
						S0_INSTD.sub_char2.as("dlv_inst_d_sub_char2"),
						S0_INSTD.sub_char3.as("dlv_inst_d_sub_char3"),
						MAPA_LOC$F_GET_LOC_ADDR(
							S0_INSTD.in_to_loc_cd,
							S0_INST.dlv_inst_dt,
							value(MAC_LOC_ADDR_TYP.ZIP_CD.value()),
							S0_BP.prnt_lcl_cd
						).as("dtl_in_to_loc_zip_cd"),
						MAPA_LOC$F_GET_LOC_ADDR(
							S0_INSTD.in_to_loc_cd,
							S0_INST.dlv_inst_dt,
							value(MAC_LOC_ADDR_TYP.ADDR1.value()),
							S0_BP.prnt_lcl_cd
						).as("dtl_in_to_loc_addr1"),
						MAPA_LOC$F_GET_LOC_ADDR(
							S0_INSTD.in_to_loc_cd,
							S0_INST.dlv_inst_dt,
							value(MAC_LOC_ADDR_TYP.ADDR2.value()),
							S0_BP.prnt_lcl_cd
						).as("dtl_in_to_loc_addr2"),
						MAPA_LOC$F_GET_LOC_ADDR(
							S0_INSTD.in_to_loc_cd,
							S0_INST.dlv_inst_dt,
							value(MAC_LOC_ADDR_TYP.ADDR3.value()),
							S0_BP.prnt_lcl_cd
						).as("dtl_in_to_loc_addr3"),
						MAPA_LOC$F_GET_LOC_ADDR(
							S0_INSTD.in_to_loc_cd,
							S0_INST.dlv_inst_dt,
							value(MAC_LOC_ADDR_TYP.ADDR4.value()),
							S0_BP.prnt_lcl_cd
						).as("dtl_in_to_loc_addr4"),
						MAPA_LOC$F_GET_LOC_ADDR(
							S0_INSTD.in_to_loc_cd,
							S0_INST.dlv_inst_dt,
							value(MAC_LOC_ADDR_TYP.TEL.value()),
							S0_BP.prnt_lcl_cd
						).as("dtl_in_to_loc_tel"),
						MAPA_LOC$F_GET_LOC_ADDR(
							S0_INSTD.in_to_loc_cd,
							S0_INST.dlv_inst_dt,
							value(MAC_LOC_ADDR_TYP.FAX.value()),
							S0_BP.prnt_lcl_cd
						).as("dtl_in_to_loc_fax"),
						// this field is appended by sql coverter.
						S0_POD.itm_cd.as("join_itm_cd_"),
						// this field is appended by sql coverter.
						S0_POD.itm_sub1.as("join_itm_sub1_"),
						// this field is appended by sql coverter.
						S0_POD.itm_sub2.as("join_itm_sub2_"),
						// this field is appended by sql coverter.
						S0_POD.itm_sub3.as("join_itm_sub3_")
						,S0_CNTRY.cntry_nm.as("dtl_in_to_cntry_nm")
					)
					.from(
						S0_INST
						.innerJoin(S0_W1).on(
							bracket(
								S0_INST.dlv_inst_no.eq(S0_W1.dlv_inst_no)
							)
						)
						.innerJoin(S0_INSTD).on(
							bracket(
								S0_INST.dlv_inst_no.eq(S0_INSTD.dlv_inst_no)
							)
						)
						.innerJoin(S0_POD).on(
							bracket(
								S0_INST.po_d_no.eq(S0_POD.po_d_no)
							)
						)
						.innerJoin(S0_PO).on(
							bracket(
								S0_POD.po_no.eq(S0_PO.po_no)
							)
						)
						.leftOuterJoin(S0_LOC).on(
							bracket(
								S0_INSTD.in_to_loc_cd.eq(S0_LOC.loc_cd)
							)
						)
						.leftOuterJoin(S0_DLV).on(
							bracket(
								S0_DLV.bp_cd.eq(S0_POD.dlv_cd)
							)
						)
						.leftOuterJoin(S0_TDLV).on(
							bracket(
								S0_TDLV.bp_cd.eq(S0_POD.tdlv_cd)
							)
						)
						.leftOuterJoin(S0_IDLV).on(
							bracket(
								S0_IDLV.bp_cd.eq(S0_INSTD.dlv_cd)
							)
						)
						.leftOuterJoin(S0_ITDLV).on(
							bracket(
								S0_ITDLV.bp_cd.eq(S0_INSTD.tdlv_cd)
							)
						)
						.leftOuterJoin(S0_BP).on(
							bracket(
								S0_PO.sppl_cd.eq(S0_BP.bp_cd)
							)
						)
						.leftOuterJoin(S0_CNTRY).on(
							bracket(
								S0_CNTRY.cntry_cd.eq(S0_LOC.cntry_cd)
							)
						)
					)
					.where(
						S0_INST.can_flg.eq(value(false))
						.and(S0_INSTD.can_flg.eq(value(false)))
					)
					.orderBy(S0_INSTD.dlv_inst_d_no.asc())
			)
			.setJoinInfo(
				joinInfo(
					j -> j
						.add(MAVM_ITM_UNIT_R.class, r -> toCondition(
							r.getStringNE("join_itm_cd_"),
							r.getStringNE("join_itm_sub1_"),
							r.getStringNE("join_itm_sub2_"),
							r.getStringNE("join_itm_sub3_"),
							r.getStringNE("trd_unit_cd")
						))
						.addSelect(m -> toArray(
							m.dec_place
						))
						.addMap((r, m) -> {
							r.setNumberNE("dtl_trd_unit_dec_place", m.dec_place());
					}),
					j -> j
						.add(MAM_UNIT_R.class, r -> toCondition(
							r.getStringNE("trd_unit_cd")
						))
						.addSelect(m -> toArray(
							m.unit_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("dtl_trd_unit_nm", m.unit_nm());
					})
				)
			);
	}
	
	/**
	 * -- MSBDL5200_MST_DLV_INST_Query_S01
	 */
	static MCQueryPlan MSBDL5200_MST_DLV_INST_S01() {
		MST_DLV_INST_R S0_INST = MST_DLV_INST_R.create("INST");
		MST_PO_D_R S0_POD = MST_PO_D_R.create("POD");
		MST_ARR_PR_R S0_PR = MST_ARR_PR_R.create("PR");
		MST_PO_R S0_PO = MST_PO_R.create("PO");
		MAM_DPT_R S0_DPT = MAM_DPT_R.create("DPT");
		MAM_ITM_R S0_ITM = MAM_ITM_R.create("ITM");
		MAM_LOC_R S0_LOC = MAM_LOC_R.create("LOC");
		MAM_BP_R S0_DLV = MAM_BP_R.create("DLV");
		MAM_BP_R S0_TDLV = MAM_BP_R.create("TDLV");
		MAM_BP_R S0_BP = MAM_BP_R.create("BP");
		MAM_CO_R S0_CO = MAM_CO_R.create("CO");
		MAM_CNTRY_R S0_CNTRY1 = MAM_CNTRY_R.create("CNTRY1");
		MAM_CNTRY_R S0_CNTRY2 = MAM_CNTRY_R.create("CNTRY2");
		MAM_CNTRY_R S0_CNTRY3 = MAM_CNTRY_R.create("CNTRY3");
		MAM_CNTRY_R S0_CNTRY4 = MAM_CNTRY_R.create("CNTRY4");
		MSW_DLV_INST_KEY_R S0_W1 = MSW_DLV_INST_KEY_R.create("W1");
		
		return createQueryPlan()
			.setQuery(
				sql("MSBDL5200_MST_DLV_INST_Query_S01")
					.mainQuery()
					.select(
						S0_INST.dlv_inst_no,
						S0_INST.dlv_inst_rev,
						S0_PO.sppl_cd,
						S0_PO.sppl_zip_cd,
						S0_PO.sppl_addr1,
						S0_PO.sppl_addr2,
						S0_PO.sppl_addr3,
						S0_PO.sppl_addr4,
						S0_PO.sppl_tel,
						S0_PO.sppl_fax,
						S0_PO.sppl_cntct_dpt,
						S0_PO.sppl_cntct_psn,
						MAPA_BP$F_GET_BP_ADDR(
							S0_PO.sppl_cd,
							S0_PO.po_dt,
							value(MAC_BP_ADDR_TYP.SPPL_CNTCT_PSN_TITLE.value())
						).as("sppl_cntct_psn_title"),
						S0_DPT.zip_cd.as("dpt_zip_cd"),
						S0_DPT.addr1.as("dpt_addr1"),
						S0_DPT.addr2.as("dpt_addr2"),
						S0_DPT.addr3.as("dpt_addr3"),
						S0_DPT.addr4.as("dpt_addr4"),
						S0_DPT.tel.as("dpt_tel"),
						S0_DPT.fax.as("dpt_fax"),
						S0_PO.purc_dpt_cd,
						S0_DPT.dpt_nm.as("purc_dpt_nm"),
						S0_PO.purc_usr_cd,
						S0_PO.po_no,
						S0_POD.po_d_no,
						S0_POD.itm_cd,
						S0_POD.itm_sub1.as("itm_sub1_data"),
						S0_POD.itm_sub2.as("itm_sub2_data"),
						S0_POD.itm_sub3.as("itm_sub3_data"),
						cases()
							.when(S0_POD.sundry_itm_flg.eq(value(true)))
								.then(S0_POD.itm_nm)
							.otherwise(S0_ITM.itm_nm).as("itm_nm"),
						S0_ITM.itm_alt_nm1,
						S0_ITM.itm_alt_nm2,
						S0_ITM.itm_alt_nm3,
						S0_ITM.itm_alt_nm4,
						S0_POD.ver_no,
						S0_POD.sno1,
						S0_POD.sno2,
						S0_POD.sno3,
						S0_POD.sno4,
						S0_POD.base_unit_qty,
						S0_POD.base_unit_cd,
						S0_POD.trd_unit_qty.as("hdr_trd_unit_qty"),
						S0_POD.trd_unit_cd.as("hdr_trd_unit_cd"),
						S0_PR.arr_qty,
						S0_POD.dlv_rqst_tm.as("dlv_rqst_dt"),
						S0_POD.dlv_rqst_tm.as("dlv_rqst_tm"),
						S0_POD.sppl_itm_cd,
						S0_POD.sppl_itm_nm,
						S0_POD.bp_lot_no,
						S0_POD.maker_cd,
						S0_INST.dlv_inst_dt,
						nvl(
							S0_POD.tdlv_cd,
							nvl(
								S0_POD.dlv_cd,
								S0_POD.in_to_loc_cd
							)
						).as("in_to_loc_cd"),
						nvl2(
							S0_POD.tdlv_cd,
							nvl(
								S0_POD.tdlv_nm,
								S0_TDLV.bp_nm
							),
							nvl2(
								S0_POD.dlv_cd,
								nvl(
									S0_POD.dlv_nm,
									S0_DLV.bp_nm
								),
								S0_LOC.loc_nm
							)
						).as("in_to_loc_nm"),
						nvl2(
							S0_POD.tdlv_cd,
							S0_TDLV.bp_alt_nm1,
							S0_DLV.bp_alt_nm1
						).as("in_to_loc_alt_nm1"),
						nvl2(
							S0_POD.tdlv_cd,
							S0_TDLV.bp_alt_nm2,
							S0_DLV.bp_alt_nm2
						).as("in_to_loc_alt_nm2"),
						nvl2(
							S0_POD.tdlv_cd,
							S0_TDLV.bp_alt_nm3,
							S0_DLV.bp_alt_nm3
						).as("in_to_loc_alt_nm3"),
						nvl2(
							S0_POD.tdlv_cd,
							S0_TDLV.bp_alt_nm4,
							S0_DLV.bp_alt_nm4
						).as("in_to_loc_alt_nm4"),
						S0_INST.dlv_inst_print_rmrks.as("dlv_inst_prnt_rmrks"),
						S0_PO.sub_char1.as("po_sub_char1"),
						S0_PO.sub_char2.as("po_sub_char2"),
						S0_PO.sub_char3.as("po_sub_char3"),
						S0_POD.sub_char1.as("po_d_sub_char1"),
						S0_POD.sub_char2.as("po_d_sub_char2"),
						S0_POD.sub_char3.as("po_d_sub_char3"),
						S0_INST.sub_char1.as("dlv_inst_sub_char1"),
						S0_INST.sub_char2.as("dlv_inst_sub_char2"),
						S0_INST.sub_char3.as("dlv_inst_sub_char3"),
						MAPA_LOC$F_GET_LOC_ADDR(
							S0_POD.in_to_loc_cd,
							S0_PO.po_dt,
							value(MAC_LOC_ADDR_TYP.ZIP_CD.value()),
							S0_BP.prnt_lcl_cd
						).as("in_to_loc_zip_cd"),
						MAPA_LOC$F_GET_LOC_ADDR(
							S0_POD.in_to_loc_cd,
							S0_PO.po_dt,
							value(MAC_LOC_ADDR_TYP.ADDR1.value()),
							S0_BP.prnt_lcl_cd
						).as("in_to_loc_addr1"),
						MAPA_LOC$F_GET_LOC_ADDR(
							S0_POD.in_to_loc_cd,
							S0_PO.po_dt,
							value(MAC_LOC_ADDR_TYP.ADDR2.value()),
							S0_BP.prnt_lcl_cd
						).as("in_to_loc_addr2"),
						MAPA_LOC$F_GET_LOC_ADDR(
							S0_POD.in_to_loc_cd,
							S0_PO.po_dt,
							value(MAC_LOC_ADDR_TYP.ADDR3.value()),
							S0_BP.prnt_lcl_cd
						).as("in_to_loc_addr3"),
						MAPA_LOC$F_GET_LOC_ADDR(
							S0_POD.in_to_loc_cd,
							S0_PO.po_dt,
							value(MAC_LOC_ADDR_TYP.ADDR4.value()),
							S0_BP.prnt_lcl_cd
						).as("in_to_loc_addr4"),
						MAPA_LOC$F_GET_LOC_ADDR(
							S0_POD.in_to_loc_cd,
							S0_PO.po_dt,
							value(MAC_LOC_ADDR_TYP.TEL.value()),
							S0_BP.prnt_lcl_cd
						).as("in_to_loc_tel"),
						MAPA_LOC$F_GET_LOC_ADDR(
							S0_POD.in_to_loc_cd,
							S0_PO.po_dt,
							value(MAC_LOC_ADDR_TYP.FAX.value()),
							S0_BP.prnt_lcl_cd
						).as("in_to_loc_fax"),
						S0_POD.dlv_zip_cd,
						S0_POD.dlv_addr1,
						S0_POD.dlv_addr2,
						S0_POD.dlv_addr3,
						S0_POD.dlv_addr4,
						S0_POD.dlv_tel,
						S0_POD.dlv_fax,
						S0_POD.tdlv_zip_cd,
						S0_POD.tdlv_addr1,
						S0_POD.tdlv_addr2,
						S0_POD.tdlv_addr3,
						S0_POD.tdlv_addr4,
						S0_POD.tdlv_tel,
						S0_POD.tdlv_fax
						,S0_CNTRY1.cntry_nm.as("sppl_cntry_nm")
						,S0_CNTRY2.cntry_nm.as("dpt_cntry_nm")
						,nvl(
							S0_CNTRY3.cntry_nm, 
							nvl(
								S0_CNTRY4.cntry_nm, 
								nullValue()
							)
						).as("in_to_cntry_nm")
						,S0_CNTRY3.cntry_nm.as("dlv_cntry_nm")
						,S0_CNTRY4.cntry_nm.as("tdlv_cntry_nm")
					)
					.from(
						S0_INST
						.innerJoin(S0_W1).on(
							bracket(
								S0_INST.dlv_inst_no.eq(S0_W1.dlv_inst_no)
							)
						)
						.innerJoin(S0_POD).on(
							bracket(
								S0_INST.po_d_no.eq(S0_POD.po_d_no)
							)
						)
						.innerJoin(S0_PR).on(
							bracket(
								S0_PR.po_d_no.eq(S0_POD.po_d_no)
							)
						)
						.innerJoin(S0_PO).on(
							bracket(
								S0_POD.po_no.eq(S0_PO.po_no)
							)
						)
						.leftOuterJoin(S0_DPT).on(
							bracket(
								S0_PO.purc_dpt_cd.eq(S0_DPT.dpt_cd)
								.and(S0_PO.po_dt.between(S0_DPT.st_dt, S0_DPT.end_dt))
							)
						)
						.leftOuterJoin(S0_ITM).on(
							bracket(
								S0_POD.itm_cd.eq(S0_ITM.itm_cd)
								.and(S0_POD.itm_sub1.eq(S0_ITM.itm_sub1))
								.and(S0_POD.itm_sub2.eq(S0_ITM.itm_sub2))
								.and(S0_POD.itm_sub3.eq(S0_ITM.itm_sub3))
							)
						)
						.leftOuterJoin(S0_LOC).on(
							bracket(
								S0_POD.in_to_loc_cd.eq(S0_LOC.loc_cd)
							)
						)
						.leftOuterJoin(S0_DLV).on(
							bracket(
								S0_DLV.bp_cd.eq(S0_POD.dlv_cd)
							)
						)
						.leftOuterJoin(S0_TDLV).on(
							bracket(
								S0_TDLV.bp_cd.eq(S0_POD.tdlv_cd)
							)
						)
						.leftOuterJoin(S0_BP).on(
							bracket(
								S0_PO.sppl_cd.eq(S0_BP.bp_cd)
							)
						)
						.crossJoin(S0_CO)
						.leftOuterJoin(S0_CNTRY1).on(
							bracket(
								S0_CNTRY1.cntry_cd.eq(S0_LOC.cntry_cd)
							)
						)
						.leftOuterJoin(S0_CNTRY2).on(
							bracket(
								S0_CNTRY2.cntry_cd.eq(S0_CO.cntry_cd)
							)
						)
						.leftOuterJoin(S0_CNTRY3).on(
							bracket(
								S0_CNTRY3.cntry_cd.eq(S0_DLV.cntry_cd)
							)
						)
						.leftOuterJoin(S0_CNTRY4).on(
							bracket(
								S0_CNTRY4.cntry_cd.eq(S0_TDLV.cntry_cd)
							)
						)
					)
					.where(
						S0_PO.can_flg.eq(value(false))
						.and(S0_POD.can_flg.eq(value(false)))
					)
			)
			.setJoinInfo(
				joinInfo(
					j -> j
						.add(MAM_BP_R.class, r -> toCondition(
							r.getStringNE("sppl_cd")
						))
						.addSelect(m -> toArray(
							m.bp_alt_nm1,
							m.bp_alt_nm2,
							m.bp_alt_nm3,
							m.bp_alt_nm4,
							m.bp_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("sppl_nm", m.bp_nm());
							r.setStringNE("sppl_alt_nm1", m.bp_alt_nm1());
							r.setStringNE("sppl_alt_nm2", m.bp_alt_nm2());
							r.setStringNE("sppl_alt_nm3", m.bp_alt_nm3());
							r.setStringNE("sppl_alt_nm4", m.bp_alt_nm4());
					}),
					j -> j
						.add(MAM_BP_R.class, r -> toCondition(
							r.getStringNE("maker_cd")
						))
						.addSelect(m -> toArray(
							m.bp_alt_nm1,
							m.bp_alt_nm2,
							m.bp_alt_nm3,
							m.bp_alt_nm4,
							m.bp_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("maker_nm", m.bp_nm());
							r.setStringNE("maker_alt_nm1", m.bp_alt_nm1());
							r.setStringNE("maker_alt_nm2", m.bp_alt_nm2());
							r.setStringNE("maker_alt_nm3", m.bp_alt_nm3());
							r.setStringNE("maker_alt_nm4", m.bp_alt_nm4());
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
						.add(MAVM_ITM_UNIT_R.class, r -> toCondition(
							r.getStringNE("itm_cd"),
							r.getStringNE("itm_sub1_data"),
							r.getStringNE("itm_sub2_data"),
							r.getStringNE("itm_sub3_data"),
							r.getStringNE("base_unit_cd")
						))
						.addSelect(m -> toArray(
							m.dec_place
						))
						.addMap((r, m) -> {
							r.setNumberNE("base_unit_dec_place", m.dec_place());
					}),
					j -> j
						.add(MAVM_ITM_UNIT_R.class, r -> toCondition(
							r.getStringNE("itm_cd"),
							r.getStringNE("itm_sub1_data"),
							r.getStringNE("itm_sub2_data"),
							r.getStringNE("itm_sub3_data"),
							r.getStringNE("hdr_trd_unit_cd")
						))
						.addSelect(m -> toArray(
							m.dec_place
						))
						.addMap((r, m) -> {
							r.setNumberNE("hdr_trd_unit_dec_place", m.dec_place());
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
							r.getStringNE("hdr_trd_unit_cd")
						))
						.addSelect(m -> toArray(
							m.unit_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("hdr_trd_unit_nm", m.unit_nm());
					})
				)
			);
	}
	
	/**
	 * -- MSBDL5200_MST_PO_D_Query_S01
	 */
	static MCQueryPlan MSBDL5200_MST_PO_D_S01() {
		MST_PO_D_R S0_POD = MST_PO_D_R.create("POD");
		MST_PO_R S0_PO = MST_PO_R.create("PO");
		MST_ARR_PR_R S0_PR = MST_ARR_PR_R.create("PR");
		MSW_PO_P_KEY_R S0_POPKEY = MSW_PO_P_KEY_R.create("POPKEY");
		MAM_BP_R S0_BP = MAM_BP_R.create("BP");
		MAM_ITM_R S0_ITM = MAM_ITM_R.create("ITM");
		MAM_ITM_LCL_R S0_ITMLCL = MAM_ITM_LCL_R.create("ITMLCL");
		MAM_UNIT_LCL_R S0_UNITLCL = MAM_UNIT_LCL_R.create("UNITLCL");
		MAM_UNIT_R S0_UNIT = MAM_UNIT_R.create("UNIT");
		MAM_BP_LCL_R S0_MAKERLCL = MAM_BP_LCL_R.create("MAKERLCL");
		MAM_BP_R S0_MAKER = MAM_BP_R.create("MAKER");
		MAM_LOC_LCL_R S0_LOCLCL = MAM_LOC_LCL_R.create("LOCLCL");
		MAM_LOC_R S0_LOC = MAM_LOC_R.create("LOC");
		MAM_BP_LCL_R S0_DLVLCL = MAM_BP_LCL_R.create("DLVLCL");
		MAM_BP_R S0_DLV = MAM_BP_R.create("DLV");
		MAM_BP_LCL_R S0_TDLVLCL = MAM_BP_LCL_R.create("TDLVLCL");
		MAM_BP_R S0_TDLV = MAM_BP_R.create("TDLV");
		MAM_CNTRY_R S0_CNTRY1 = MAM_CNTRY_R.create("CNTRY1");
		MAM_CNTRY_R S0_CNTRY2 = MAM_CNTRY_R.create("CNTRY2");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBDL5200_MST_PO_D_Query_S01")
					.mainQuery()
					.select(
						S0_POD.itm_cd,
						S0_POD.itm_sub1.as("itm_sub1_data"),
						S0_POD.itm_sub2.as("itm_sub2_data"),
						S0_POD.itm_sub3.as("itm_sub3_data"),
						S0_BP.prnt_lcl_cd,
						cases()
							.when(S0_POD.sundry_itm_flg.eq(value(true)))
								.then(S0_POD.itm_nm)
							.otherwise(
								nvl2(
									S0_BP.prnt_lcl_cd,
									S0_ITMLCL.itm_nm,
									S0_ITM.itm_nm
								)
							).as("itm_nm"),
						cases()
							.when(S0_POD.sundry_itm_flg.eq(value(true)))
								.then(S0_POD.iv_itm_nm)
							.otherwise(
								nvl2(
									S0_BP.prnt_lcl_cd,
									S0_ITMLCL.itm_nm,
									S0_ITM.itm_nm
								)
							).as("iv_itm_nm"),
						nvl2(
									S0_BP.prnt_lcl_cd,
							S0_ITMLCL.itm_alt_nm1,
							S0_ITM.itm_alt_nm1
						).as("itm_alt_nm1"),
						nvl2(
							S0_BP.prnt_lcl_cd,
							S0_ITMLCL.itm_alt_nm2,
							S0_ITM.itm_alt_nm2
						).as("itm_alt_nm2"),
						nvl2(
							S0_BP.prnt_lcl_cd,
							S0_ITMLCL.itm_alt_nm3,
							S0_ITM.itm_alt_nm3
						).as("itm_alt_nm3"),
						nvl2(
							S0_BP.prnt_lcl_cd,
							S0_ITMLCL.itm_alt_nm4,
							S0_ITM.itm_alt_nm4
						).as("itm_alt_nm4"),
						S0_POD.sno1,
						S0_POD.sno2,
						S0_POD.sno3,
						S0_POD.sno4,
						S0_POD.ver_no,
						S0_POD.trd_unit_qty,
						S0_POD.trd_unit_cd,
						nvl2(
							S0_BP.prnt_lcl_cd,
							S0_UNITLCL.unit_nm,
							S0_UNIT.unit_nm
						).as("trd_unit_nm"),
						S0_POD.interim_flg,
						decode(
							S0_ITM.dscnt_itm_flg,
							value(true),
							value(0).subtract(S0_POD.trd_cur_upri),
							S0_POD.trd_cur_upri
						).as("trd_cur_upri"),
						decode(
							S0_ITM.dscnt_itm_flg,
							value(true),
							value(0).subtract(S0_POD.trd_cur_amt),
							S0_POD.trd_cur_amt
						).as("trd_cur_amt"),
						S0_POD.trd_cur_dscnt_amt,
						decode(
							S0_ITM.dscnt_itm_flg,
							value(true),
							value(0).subtract(S0_POD.trd_cur_tax_amt),
							S0_POD.trd_cur_tax_amt
						).as("trd_cur_tax_amt"),
						S0_POD.dlv_rqst_tm.as("dlv_rqst_dt"),
						S0_POD.dlv_rqst_tm.as("dlv_rqst_tm"),
						nvl(
							S0_POD.tdlv_cd,
							nvl(
								S0_POD.dlv_cd,
								S0_POD.in_to_loc_cd
							)
						).as("in_to_loc_cd"),
						nvl2(
							S0_POD.tdlv_cd,
							nvl(
								S0_POD.tdlv_nm,
								nvl2(
									S0_BP.prnt_lcl_cd,
									S0_TDLVLCL.bp_nm,
									S0_TDLV.bp_nm
								)
							),
							nvl2(
								S0_POD.dlv_cd,
								nvl(
									S0_POD.dlv_nm,
									nvl2(
									S0_BP.prnt_lcl_cd,
										S0_DLVLCL.bp_nm,
										S0_DLV.bp_nm
									)
								),
								nvl2(
									S0_BP.prnt_lcl_cd,
									S0_LOCLCL.loc_nm,
									S0_LOC.loc_nm
								)
							)
						).as("in_to_loc_nm"),
						nvl2(
							S0_POD.tdlv_cd,
							nvl2(
								S0_BP.prnt_lcl_cd,
								S0_TDLVLCL.bp_alt_nm1,
								S0_TDLV.bp_alt_nm1
							),
							nvl2(
								S0_BP.prnt_lcl_cd,
								S0_DLVLCL.bp_alt_nm1,
								S0_DLV.bp_alt_nm1
							)
						).as("in_to_loc_alt_nm1"),
						nvl2(
							S0_POD.tdlv_cd,
							nvl2(
								S0_BP.prnt_lcl_cd,
								S0_TDLVLCL.bp_alt_nm2,
								S0_TDLV.bp_alt_nm2
							),
							nvl2(
								S0_BP.prnt_lcl_cd,
								S0_DLVLCL.bp_alt_nm2,
								S0_DLV.bp_alt_nm2
							)
						).as("in_to_loc_alt_nm2"),
						nvl2(
							S0_POD.tdlv_cd,
							nvl2(
								S0_BP.prnt_lcl_cd,
								S0_TDLVLCL.bp_alt_nm3,
								S0_TDLV.bp_alt_nm3
							),
							nvl2(
								S0_BP.prnt_lcl_cd,
								S0_DLVLCL.bp_alt_nm3,
								S0_DLV.bp_alt_nm3
							)
						).as("in_to_loc_alt_nm3"),
						nvl2(
							S0_POD.tdlv_cd,
							nvl2(
								S0_BP.prnt_lcl_cd,
								S0_TDLVLCL.bp_alt_nm4,
								S0_TDLV.bp_alt_nm4
							),
							nvl2(
								S0_BP.prnt_lcl_cd,
								S0_DLVLCL.bp_alt_nm4,
								S0_DLV.bp_alt_nm4
							)
						).as("in_to_loc_alt_nm4"),
						S0_POD.sppl_itm_cd,
						S0_POD.sppl_itm_nm,
						S0_POD.bp_lot_no,
						S0_POD.maker_cd,
						nvl2(
							S0_BP.prnt_lcl_cd,
							S0_MAKERLCL.bp_nm,
							S0_MAKER.bp_nm
						).as("maker_nm"),
						nvl2(
							S0_BP.prnt_lcl_cd,
							S0_MAKERLCL.bp_alt_nm1,
							S0_MAKER.bp_alt_nm1
						).as("maker_alt_nm1"),
						nvl2(
							S0_BP.prnt_lcl_cd,
							S0_MAKERLCL.bp_alt_nm2,
							S0_MAKER.bp_alt_nm2
						).as("maker_alt_nm2"),
						nvl2(
							S0_BP.prnt_lcl_cd,
							S0_MAKERLCL.bp_alt_nm3,
							S0_MAKER.bp_alt_nm3
						).as("maker_alt_nm3"),
						nvl2(
							S0_BP.prnt_lcl_cd,
							S0_MAKERLCL.bp_alt_nm4,
							S0_MAKER.bp_alt_nm4
						).as("maker_alt_nm4"),
						S0_POD.po_print_d_rmrks,
						S0_POD.po_d_no,
						S0_PR.abort_flg,
						cases()
							.when(S0_PR.abort_flg.eq(value(true))
								.and(S0_PR.arr_schd_abort_qty.lt(S0_PR.base_unit_qty).or(S0_PR.purc_schd_abort_qty.lt(S0_PR.base_unit_qty))))
								.then(value(true))
							.otherwise(value(false)).as("rem_abort_flg"),
						S0_PR.base_unit_qty,
						cases()
							.when(S0_PR.arr_schd_abort_qty.lt(S0_PR.purc_schd_abort_qty))
								.then(S0_PR.purc_schd_abort_qty)
							.otherwise(S0_PR.arr_schd_abort_qty).as("abort_qty"),
						S0_PR.base_unit_cd,
						S0_POD.trd_cur_proc_upri,
						S0_POD.trd_cur_proc_amt,
						S0_POD.trd_cur_onr_prov_upri,
						S0_POD.trd_cur_onr_prov_amt,
						S0_POD.disp_seq,
						S0_POD.sub_char1.as("d_sub_char1"),
						S0_POD.sub_char2.as("d_sub_char2"),
						S0_POD.sub_char3.as("d_sub_char3"),
						nvl2(
							S0_POD.tdlv_cd,
							S0_POD.tdlv_zip_cd,
							nvl2(
								S0_POD.dlv_cd,
								S0_POD.dlv_zip_cd,
								MAPA_LOC$F_GET_LOC_ADDR(
									S0_POD.in_to_loc_cd,
									S0_PO.po_dt,
									value(MAC_LOC_ADDR_TYP.ZIP_CD.value()),
									S0_BP.prnt_lcl_cd
								)
							)
						).as("in_to_loc_zip_cd"),
						nvl2(
							S0_POD.tdlv_cd,
							S0_POD.tdlv_addr1,
							nvl2(
								S0_POD.dlv_cd,
								S0_POD.dlv_addr1,
								MAPA_LOC$F_GET_LOC_ADDR(
									S0_POD.in_to_loc_cd,
									S0_PO.po_dt,
									value(MAC_LOC_ADDR_TYP.ADDR1.value()),
									S0_BP.prnt_lcl_cd
								)
							)
						).as("in_to_loc_addr1"),
						nvl2(
							S0_POD.tdlv_cd,
							S0_POD.tdlv_addr2,
							nvl2(
								S0_POD.dlv_cd,
								S0_POD.dlv_addr2,
								MAPA_LOC$F_GET_LOC_ADDR(
									S0_POD.in_to_loc_cd,
									S0_PO.po_dt,
									value(MAC_LOC_ADDR_TYP.ADDR2.value()),
									S0_BP.prnt_lcl_cd
								)
							)
						).as("in_to_loc_addr2"),
						nvl2(
							S0_POD.tdlv_cd,
							S0_POD.tdlv_addr3,
							nvl2(
								S0_POD.dlv_cd,
								S0_POD.dlv_addr3,
								MAPA_LOC$F_GET_LOC_ADDR(
									S0_POD.in_to_loc_cd,
									S0_PO.po_dt,
									value(MAC_LOC_ADDR_TYP.ADDR3.value()),
									S0_BP.prnt_lcl_cd
								)
							)
						).as("in_to_loc_addr3"),
						nvl2(
							S0_POD.tdlv_cd,
							S0_POD.tdlv_addr4,
							nvl2(
								S0_POD.dlv_cd,
								S0_POD.dlv_addr4,
								MAPA_LOC$F_GET_LOC_ADDR(
									S0_POD.in_to_loc_cd,
									S0_PO.po_dt,
									value(MAC_LOC_ADDR_TYP.ADDR4.value()),
									S0_BP.prnt_lcl_cd
								)
							)
						).as("in_to_loc_addr4"),
						nvl2(
							S0_POD.tdlv_cd,
							S0_POD.tdlv_tel,
							nvl2(
								S0_POD.dlv_cd,
								S0_POD.dlv_tel,
								MAPA_LOC$F_GET_LOC_ADDR(
									S0_POD.in_to_loc_cd,
									S0_PO.po_dt,
									value(MAC_LOC_ADDR_TYP.TEL.value()),
									S0_BP.prnt_lcl_cd
								)
							)
						).as("in_to_loc_tel"),
						nvl2(
							S0_POD.tdlv_cd,
							S0_POD.tdlv_fax,
							nvl2(
								S0_POD.dlv_cd,
								S0_POD.dlv_fax,
								MAPA_LOC$F_GET_LOC_ADDR(
									S0_POD.in_to_loc_cd,
									S0_PO.po_dt,
									value(MAC_LOC_ADDR_TYP.FAX.value()),
									S0_BP.prnt_lcl_cd
								)
							)
						).as("in_to_loc_fax"),
						nvl2(
							S0_POD.tdlv_cd,
							S0_POD.tdlv_cntct_dpt,
							nvl2(
								S0_POD.dlv_cd,
								S0_POD.dlv_cntct_dpt,
								nullValue()
							)
						).as("in_to_loc_cntct_dpt"),
						nvl2(
							S0_POD.tdlv_cd,
							S0_POD.tdlv_cntct_psn,
							nvl2(
								S0_POD.dlv_cd,
								S0_POD.dlv_cntct_psn,
								nullValue()
							)
						).as("in_to_loc_cntct_psn"),
						S0_POD.dlv_cd,
						S0_POD.dlv_zip_cd,
						S0_POD.dlv_addr1,
						S0_POD.dlv_addr2,
						S0_POD.dlv_addr3,
						S0_POD.dlv_addr4,
						S0_POD.dlv_tel,
						S0_POD.dlv_fax,
						S0_POD.dlv_cntct_dpt,
						S0_POD.dlv_cntct_psn,
						S0_POD.tdlv_cd,
						S0_POD.tdlv_zip_cd,
						S0_POD.tdlv_addr1,
						S0_POD.tdlv_addr2,
						S0_POD.tdlv_addr3,
						S0_POD.tdlv_addr4,
						S0_POD.tdlv_tel,
						S0_POD.tdlv_fax,
						S0_POD.tdlv_cntct_dpt,
						S0_POD.tdlv_cntct_psn,
						// this field is appended by sql coverter.
						S0_POD.tax_cd.as("join_tax_cd_"),
						// this field is appended by sql coverter.
						S0_POD.slo_d_no.as("join_slo_d_no_")
						,S0_PO.po_no
						,S0_PO.po_rev
						,decode(
								S0_POD.outsrc_flg,
								value(true),
								S0_BP.repurc_obli_flg,
								value(false)
							).as("repurc_obli_flg")
						,nvl(
							S0_CNTRY1.cntry_nm, 
							nvl(
								S0_CNTRY2.cntry_nm, 
								nullValue()
							)
						).as("in_to_cntry_nm")
						,S0_CNTRY1.cntry_nm.as("dlv_cntry_nm")
						,S0_CNTRY2.cntry_nm.as("tdlv_cntry_nm")
					)
					.from(
						S0_POD
						.innerJoin(S0_POPKEY).on (
							bracket(
								S0_POD.po_no.eq(S0_POPKEY.po_no)
								.and(S0_POD.po_rev.eq(S0_POPKEY.po_rev))
							)
						)
						.innerJoin(S0_PO).on(
							bracket(
								S0_POD.po_no.eq(S0_PO.po_no)
							)
						)
						.innerJoin(S0_PR).on(
							bracket(
								S0_POD.po_d_no.eq(S0_PR.po_d_no)
							)
						)
						.leftOuterJoin(S0_BP).on(
							bracket(
								S0_PO.sppl_cd.eq(S0_BP.bp_cd)
							)
						)
						.leftOuterJoin(S0_ITM).on(
							bracket(
								S0_POD.itm_cd.eq(S0_ITM.itm_cd)
								.and(S0_POD.itm_sub1.eq(S0_ITM.itm_sub1))
								.and(S0_POD.itm_sub2.eq(S0_ITM.itm_sub2))
								.and(S0_POD.itm_sub3.eq(S0_ITM.itm_sub3))
							)
						)
						.leftOuterJoin(S0_ITMLCL).on(
							bracket(
								S0_POD.itm_cd.eq(S0_ITMLCL.itm_cd)
								.and(S0_POD.itm_sub1.eq(S0_ITMLCL.itm_sub1))
								.and(S0_POD.itm_sub2.eq(S0_ITMLCL.itm_sub2))
								.and(S0_POD.itm_sub3.eq(S0_ITMLCL.itm_sub3))
								.and(S0_ITMLCL.lcl_cd.eq(S0_BP.prnt_lcl_cd))
							)
						)
						.leftOuterJoin(S0_UNITLCL).on(
							bracket(
								S0_POD.trd_unit_cd.eq(S0_UNITLCL.unit_cd)
								.and(S0_UNITLCL.lcl_cd.eq(S0_BP.prnt_lcl_cd))
							)
						)
						.leftOuterJoin(S0_UNIT).on(
							bracket(
								S0_POD.trd_unit_cd.eq(S0_UNIT.unit_cd)
							)
						)
						.leftOuterJoin(S0_MAKERLCL).on(
							bracket(
								S0_POD.maker_cd.eq(S0_MAKERLCL.bp_cd)
								.and(S0_MAKERLCL.lcl_cd.eq(S0_BP.prnt_lcl_cd))
							)
						)
						.leftOuterJoin(S0_MAKER).on(
							bracket(
								S0_POD.maker_cd.eq(S0_MAKER.bp_cd)
							)
						)
						.leftOuterJoin(S0_LOCLCL).on(
							bracket(
								S0_POD.in_to_loc_cd.eq(S0_LOCLCL.loc_cd)
								.and(S0_LOCLCL.lcl_cd.eq(S0_BP.prnt_lcl_cd))
							)
						)
						.leftOuterJoin(S0_LOC).on(
							bracket(
								S0_POD.in_to_loc_cd.eq(S0_LOC.loc_cd)
							)
						)
						.leftOuterJoin(S0_DLVLCL).on(
							bracket(
								S0_POD.dlv_cd.eq(S0_DLVLCL.bp_cd)
								.and(S0_DLVLCL.lcl_cd.eq(S0_BP.prnt_lcl_cd))
							)
						)
						.leftOuterJoin(S0_DLV).on(
							bracket(
								S0_POD.dlv_cd.eq(S0_DLV.bp_cd)
							)
						)
						.leftOuterJoin(S0_TDLVLCL).on(
							bracket(
								S0_POD.tdlv_cd.eq(S0_TDLVLCL.bp_cd)
								.and(S0_TDLVLCL.lcl_cd.eq(S0_BP.prnt_lcl_cd))
							)
						)
						.leftOuterJoin(S0_TDLV).on(
							bracket(
								S0_POD.tdlv_cd.eq(S0_TDLV.bp_cd)
							)
						)
						.leftOuterJoin(S0_CNTRY1).on(
							bracket(
								S0_CNTRY1.cntry_cd.eq(S0_DLV.cntry_cd)
							)
						)
						.leftOuterJoin(S0_CNTRY2).on(
							bracket(
								S0_CNTRY2.cntry_cd.eq(S0_TDLV.cntry_cd)
							)
						)
					)
					.orderBy(S0_POD.disp_seq.asc())
			)
			.setJoinInfo(
				joinInfo(
					j -> j
						.add(MAVM_ITM_UNIT_R.class, r -> toCondition(
							r.getStringNE("itm_cd"),
							r.getStringNE("itm_sub1_data"),
							r.getStringNE("itm_sub2_data"),
							r.getStringNE("itm_sub3_data"),
							r.getStringNE("trd_unit_cd")
						))
						.addSelect(m -> toArray(
							m.dec_place
							,m.conv_base_qty
							,m.conv_qty
							,m.rnd_typ
						))
						.addMap((r, m) -> {
							r.setNumberNE("unit_dec_place", m.dec_place());
							r.setNumberNE("unit_conv_base_qty", m.conv_base_qty());
							r.setNumberNE("unit_conv_qty", m.conv_qty());
							r.setStringNE("unit_rnd_typ", m.rnd_typ());
					}),
					j -> j
						.add(MAM_UNIT_LCL_R.class, r -> toCondition(
							r.getStringNE("base_unit_cd"),
							r.getStringNE("prnt_lcl_cd")
						))
						.addSelect(m -> toArray(
							m.unit_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("unit_nm_lcl", m.unit_nm());
					}),
					j -> j
						.add(MAM_UNIT_R.class, r -> toCondition(
							r.getStringNE("base_unit_cd")
						))
						.addSelect(m -> toArray(
							m.unit_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("base_unit_nm", mcframe.commonFXUC.FXUCC0010.FXUCC_DataUtil.nvl(r.getStringNE("unit_nm_lcl"), m.unit_nm()));
					}),
					j -> j
						.add(MAVM_ITM_UNIT_R.class, r -> toCondition(
							r.getStringNE("itm_cd"),
							r.getStringNE("itm_sub1_data"),
							r.getStringNE("itm_sub2_data"),
							r.getStringNE("itm_sub3_data"),
							r.getStringNE("base_unit_cd")
						))
						.addSelect(m -> toArray(
							m.dec_place,
							m.rnd_typ
						))
						.addMap((r, m) -> {
							r.setNumberNE("base_unit_dec_place", m.dec_place());
					}),
					j -> j
						.add(MAM_TAX_R.class, r -> toCondition(
							r.getStringNE("join_tax_cd_")
						))
						.addSelect(m -> toArray(
							m.inc_tax_flg
							,m.tax_rate
						))
						.addMap((r, m) -> {
							r.setBooleanNE("inc_tax_flg", m.inc_tax_flg());
							r.setNumberNE("tax_rate", m.tax_rate());
					}),
					j -> j
						.add(MST_SLO_D_R.class, r -> toCondition(
							r.getStringNE("join_slo_d_no_")
						))
						.addSelect(m -> toArray(
							m.cst_po_d_no,
							m.slo_no
						))
						.addMap((r, m) -> {
							r.setStringNE("cst_po_d_no", m.cst_po_d_no());
							r.setStringNE("join_slo_no_", m.slo_no());
					}),
					j -> j
						.add(MST_SLO_R.class, r -> toCondition(
							r.getStringNE("join_slo_no_")
						))
						.addSelect(m -> toArray(
							m.cst_po_no
						))
						.addMap((r, m) -> {
							r.setStringNE("cst_po_no", m.cst_po_no());
					})
				)
			);
	}
	
	/**
	 * -- MSBDL5200_MST_PO_Query_S01
	 */
	static MCQueryPlan MSBDL5200_MST_PO_S01() {
		MST_PO_R S0_PO = MST_PO_R.create("PO");
		MAM_BP_R S0_BP = MAM_BP_R.create("BP");
		MAM_BP_LCL_R S0_BPLCL = MAM_BP_LCL_R.create("BPLCL");
		MAM_DPT_LCL_R S0_DPTLCL = MAM_DPT_LCL_R.create("DPTLCL");
		MAM_DPT_R S0_DPT = MAM_DPT_R.create("DPT");
		MAM_USR_LCL_R S0_USRLCL = MAM_USR_LCL_R.create("USRLCL");
		MAM_USR_R S0_USR = MAM_USR_R.create("USR");
		MAM_CUR_R S0_CUR = MAM_CUR_R.create("CUR");
		MAM_CUR_LCL_R S0_CURLCL = MAM_CUR_LCL_R.create("CURLCL");
		MAM_PO_PRINT_R S0_POPRNT = MAM_PO_PRINT_R.create("POPRNT");
		MST_WRK_R S0_WRK = MST_WRK_R.create("WRK");
		MAM_TTERM_LCL_R S0_TTERMLCL1 = MAM_TTERM_LCL_R.create("TTERMLCL1");
		MAM_TTERM_LCL_R S0_TTERMLCL2 = MAM_TTERM_LCL_R.create("TTERMLCL2");
		MAM_TTERM_LCL_R S0_TTERMLCL3 = MAM_TTERM_LCL_R.create("TTERMLCL3");
		MAM_TTERM_R S0_TTERM1 = MAM_TTERM_R.create("TTERM1");
		MAM_TTERM_R S0_TTERM2 = MAM_TTERM_R.create("TTERM2");
		MAM_TTERM_R S0_TTERM3 = MAM_TTERM_R.create("TTERM3");
		MAM_CO_R S0_CO = MAM_CO_R.create("CO");
		MAM_CNTRY_R S0_CNTRY1 = MAM_CNTRY_R.create("CNTRY1");
		MAM_CNTRY_R S0_CNTRY2 = MAM_CNTRY_R.create("CNTRY2");
		
		return createQueryPlan()
			.setQuery(
				sql("MSBDL5200_MST_PO_Query_S01")
					.mainQuery()
					.select(
						S0_PO.po_no,
						S0_PO.po_rev,
						S0_PO.po_dt,
						S0_PO.sppl_cd,
						S0_PO.sppl_zip_cd,
						S0_PO.sppl_addr1,
						S0_PO.sppl_addr2,
						S0_PO.sppl_addr3,
						S0_PO.sppl_addr4,
						nvl2(
							S0_BP.prnt_lcl_cd,
							S0_BPLCL.bp_nm,
							S0_BP.bp_nm
						).as("sppl_nm"),
						nvl2(
							S0_BP.prnt_lcl_cd,
							S0_BPLCL.bp_alt_nm1,
							S0_BP.bp_alt_nm1
						).as("sppl_alt_nm1"),
						nvl2(
							S0_BP.prnt_lcl_cd,
							S0_BPLCL.bp_alt_nm2,
							S0_BP.bp_alt_nm2
						).as("sppl_alt_nm2"),
						nvl2(
							S0_BP.prnt_lcl_cd,
							S0_BPLCL.bp_alt_nm3,
							S0_BP.bp_alt_nm3
						).as("sppl_alt_nm3"),
						nvl2(
							S0_BP.prnt_lcl_cd,
							S0_BPLCL.bp_alt_nm4,
							S0_BP.bp_alt_nm4
						).as("sppl_alt_nm4"),
						S0_PO.sppl_cntct_dpt,
						S0_PO.sppl_cntct_psn,
						MAPA_BP$F_GET_BP_ADDR(
							S0_PO.sppl_cd,
							S0_PO.po_dt,
							value(MAC_BP_ADDR_TYP.SPPL_CNTCT_PSN_TITLE.value())
						).as("sppl_cntct_psn_title"),
						S0_PO.sppl_tel,
						S0_PO.sppl_fax,
						FCPA_CO$F_GET_CO_NM1(S0_BP.prnt_lcl_cd).as("co_nm"),
						nvl2(
							S0_BP.prnt_lcl_cd,
							S0_DPTLCL.zip_cd,
							S0_DPT.zip_cd
						).as("dpt_zip_cd"),
						nvl2(
							S0_BP.prnt_lcl_cd,
							S0_DPTLCL.addr1,
							S0_DPT.addr1
						).as("dpt_addr1"),
						nvl2(
							S0_BP.prnt_lcl_cd,
							S0_DPTLCL.addr2,
							S0_DPT.addr2
						).as("dpt_addr2"),
						nvl2(
							S0_BP.prnt_lcl_cd,
							S0_DPTLCL.addr3,
							S0_DPT.addr3
						).as("dpt_addr3"),
						nvl2(
							S0_BP.prnt_lcl_cd,
							S0_DPTLCL.addr4,
							S0_DPT.addr4
						).as("dpt_addr4"),
						nvl2(
							S0_BP.prnt_lcl_cd,
							S0_DPTLCL.tel,
							S0_DPT.tel
						).as("dpt_tel"),
						nvl2(
							S0_BP.prnt_lcl_cd,
							S0_DPTLCL.fax,
							S0_DPT.fax
						).as("dpt_fax"),
						S0_PO.purc_dpt_cd,
						nvl2(
							S0_BP.prnt_lcl_cd,
							S0_DPTLCL.dpt_nm,
							S0_DPT.dpt_nm
						).as("purc_dpt_nm"),
						S0_PO.purc_usr_cd,
						nvl2(
							S0_BP.prnt_lcl_cd,
							S0_USRLCL.usr_nm,
							S0_USR.usr_nm
						).as("purc_usr_nm"),
						S0_PO.trd_cd,
						S0_PO.sub_char1,
						S0_PO.sub_char2,
						S0_PO.sub_char3,
						S0_PO.trd_cur_cd,
						S0_CUR.amt_dec_place,
						S0_CUR.upri_dec_place,
						nvl2(
							S0_BP.prnt_lcl_cd,
							S0_CURLCL.cur_nm,
							S0_CUR.cur_nm
						).as("trd_cur_nm"),
						S0_PO.po_print_cd,
						bracket(
							cases()
								.when(
									bind("interim_flg").eq(value(true))
									.and(S0_PO.can_flg.eq(value(true)))
								)
									.then(S0_POPRNT.txt_del_on)
								.when(
									bind("interim_flg").eq(value(false))
									.and(S0_PO.can_flg.eq(value(true)))
								)
									.then(S0_POPRNT.txt_del_off)
								.when(
									bind("interim_flg").eq(value(true))
									.and(S0_PO.can_flg.eq(value(false)))
									.and(S0_PO.last_po_rev.isNotNull())
									.and(S0_PO.last_po_rev.neq(S0_PO.po_rev))
								)
									.then(S0_POPRNT.txt_mod_on)
								.when(
									bind("interim_flg").eq(value(false))
									.and(S0_PO.can_flg.eq(value(false)))
									.and(S0_PO.last_po_rev.isNotNull())
									.and(S0_PO.last_po_rev.neq(S0_PO.po_rev))
								)
									.then(S0_POPRNT.txt_mod_off)
								.when(
									bind("interim_flg").eq(value(true))
									.and(S0_PO.last_po_rev.isNull())
								)
									.then(S0_POPRNT.txt_new_on)
								.otherwise(S0_POPRNT.txt_new_off)
						).as("po_print_txt"),
						S0_PO.crct_rsn_cd,
						S0_PO.upd_po_print_schd_dt,
						decode(
							S0_BP.wrk_po_flg,
							value(true),
							S0_PO.wrk_no,
							nullValue()
						).as("wrk_no"),
						decode(
							S0_BP.wrk_po_flg,
							value(true),
							S0_WRK.wrk_nm,
							nullValue()
						).as("wrk_nm"),
						S0_PO.tterm_cd1,
						nvl2(
							S0_BP.prnt_lcl_cd,
							S0_TTERMLCL1.tterm_nm,
							S0_TTERM1.tterm_nm
						).as("tterm_nm1"),
						S0_PO.tterm_rmrks1,
						S0_PO.tterm_cd2,
						nvl2(
							S0_BP.prnt_lcl_cd,
							S0_TTERMLCL2.tterm_nm,
							S0_TTERM2.tterm_nm
						).as("tterm_nm2"),
						S0_PO.tterm_rmrks2,
						S0_PO.tterm_cd3,
						nvl2(
							S0_BP.prnt_lcl_cd,
							S0_TTERMLCL3.tterm_nm,
							S0_TTERM3.tterm_nm
						).as("tterm_nm3"),
						S0_PO.tterm_rmrks3,
						S0_PO.po_print_rmrks,
						S0_BP.prnt_lcl_cd
						,S0_BP.purc_amt_rnd_typ
						,S0_BP.purc_tax_rnd_typ
						,S0_CNTRY1.cntry_nm.as("sppl_cntry_nm")
						,S0_CNTRY2.cntry_nm.as("dpt_cntry_nm")
					)
					.from(
						S0_PO
						.leftOuterJoin(S0_BP).on(
							bracket(
								S0_PO.sppl_cd.eq(S0_BP.bp_cd)
							)
						)
						.leftOuterJoin(S0_BPLCL).on(
							bracket(
								S0_PO.sppl_cd.eq(S0_BPLCL.bp_cd)
								.and(S0_BP.prnt_lcl_cd.eq(S0_BPLCL.lcl_cd))
							)
						)
						.leftOuterJoin(S0_DPTLCL).on(
							bracket(
								S0_PO.purc_dpt_cd.eq(S0_DPTLCL.dpt_cd)
								.and(S0_PO.po_dt.between(S0_DPTLCL.st_dt, S0_DPTLCL.end_dt))
								.and(S0_BP.prnt_lcl_cd.eq(S0_DPTLCL.lcl_cd))
							)
						)
						.leftOuterJoin(S0_DPT).on(
							bracket(
								S0_PO.purc_dpt_cd.eq(S0_DPT.dpt_cd)
								.and(S0_PO.po_dt.between(S0_DPT.st_dt, S0_DPT.end_dt))
							)
						)
						.leftOuterJoin(S0_USRLCL).on(
							bracket(
								S0_PO.purc_usr_cd.eq(S0_USRLCL.usr_cd)
								.and(S0_BP.prnt_lcl_cd.eq(S0_USRLCL.lcl_cd))
							)
						)
						.leftOuterJoin(S0_USR).on(
							bracket(
								S0_PO.purc_usr_cd.eq(S0_USR.usr_cd)
							)
						)
						.leftOuterJoin(S0_CUR).on(
							bracket(
								S0_PO.trd_cur_cd.eq(S0_CUR.cur_cd)
							)
						)
						.leftOuterJoin(S0_CURLCL).on(
							bracket(
								S0_PO.trd_cur_cd.eq(S0_CURLCL.cur_cd)
								.and(S0_BP.prnt_lcl_cd.eq(S0_CURLCL.lcl_cd))
							)
						)
						.leftOuterJoin(S0_POPRNT).on(
							bracket(
								S0_PO.po_print_cd.eq(S0_POPRNT.po_print_cd)
							)
						)
						.leftOuterJoin(S0_WRK).on(
							bracket(
								S0_PO.wrk_no.eq(S0_WRK.wrk_no)
							)
						)
						.leftOuterJoin(S0_TTERMLCL1).on(
							bracket(
								S0_PO.tterm_cd1.eq(S0_TTERMLCL1.tterm_cd)
								.and(S0_BP.prnt_lcl_cd.eq(S0_TTERMLCL1.lcl_cd))
							)
						)
						.leftOuterJoin(S0_TTERMLCL2).on(
							bracket(
								S0_PO.tterm_cd2.eq(S0_TTERMLCL2.tterm_cd)
								.and(S0_BP.prnt_lcl_cd.eq(S0_TTERMLCL2.lcl_cd))
							)
						)
						.leftOuterJoin(S0_TTERMLCL3).on(
							bracket(
								S0_PO.tterm_cd3.eq(S0_TTERMLCL3.tterm_cd)
								.and(S0_BP.prnt_lcl_cd.eq(S0_TTERMLCL3.lcl_cd))
							)
						)
						.leftOuterJoin(S0_TTERM1).on(
							bracket(
								S0_PO.tterm_cd1.eq(S0_TTERM1.tterm_cd)
							)
						)
						.leftOuterJoin(S0_TTERM2).on(
							bracket(
								S0_PO.tterm_cd2.eq(S0_TTERM2.tterm_cd)
							)
						)
						.leftOuterJoin(S0_TTERM3).on(
							bracket(
								S0_PO.tterm_cd3.eq(S0_TTERM3.tterm_cd)
							)
						)
						.crossJoin(S0_CO)
						.leftOuterJoin(S0_CNTRY1).on(
							bracket(
								S0_CNTRY1.cntry_cd.eq(S0_BP.cntry_cd)
							)
						)
						.leftOuterJoin(S0_CNTRY2).on(
							bracket(
								S0_CNTRY2.cntry_cd.eq(S0_CO.cntry_cd)
							)
						)
					)
					.where(
						S0_PO.po_no.eq(bind("po_no"))
						.and(S0_PO.po_rev.eq(bind("po_rev")))
					)
			)
			.setJoinInfo(
				joinInfo(
					j -> j
						.add(MST_PO_CRCT_RSN_R.class, r -> toCondition(
							r.getStringNE("crct_rsn_cd")
						))
						.addSelect(m -> toArray(
							m.po_crct_rsn_nm,
							m.po_crct_rsn_rmrks
						))
						.addMap((r, m) -> {
							r.setStringNE("po_crct_rsn_nm", m.po_crct_rsn_nm());
							r.setStringNE("po_crct_rsn_rmrks", m.po_crct_rsn_rmrks());
					})
				)
			);
	}
	
	/**
	 * -- MSBDL5200_MST_PURC_RET_ACT_D_Query_S01
	 */
	static MCQueryPlan MSBDL5200_MST_PURC_RET_ACT_D_S01() {
		MST_PURC_RET_ACT_D_R S0_T1 = MST_PURC_RET_ACT_D_R.create("T1");
		MST_PURC_RET_ACT_R S0_T8 = MST_PURC_RET_ACT_R.create("T8");
		MCTempView S0_T6 = createTempView("T6");
		MAM_ITM_LCL_R S0_M1 = MAM_ITM_LCL_R.create("M1");
		MAM_UNIT_LCL_R S0_M3 = MAM_UNIT_LCL_R.create("M3");
		MAM_UNIT_R S0_M31 = MAM_UNIT_R.create("M31");
		MAM_BIZ_RSN_LCL_R S0_M5 = MAM_BIZ_RSN_LCL_R.create("M5");
		MAM_BIZ_RSN_R S0_M51 = MAM_BIZ_RSN_R.create("M51");
		MAM_ITM_R S0_ITM = MAM_ITM_R.create("ITM");
		MST_PURC_ACT_D_R S1_TB1 = MST_PURC_ACT_D_R.create("TB1");
		MST_PURC_ACT_R S1_TB2 = MST_PURC_ACT_R.create("TB2");
		MAM_BP_R S0_BP = MAM_BP_R.create("BP");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBDL5200_MST_PURC_RET_ACT_D_Query_S01")
					.mainQuery()
					.select(
						S0_T1.itm_cd,
						S0_T1.itm_sub3.as("itm_sub1_data"),
						S0_T1.itm_sub2.as("itm_sub2_data"),
						S0_T1.itm_sub1.as("itm_sub3_data"),
						cases()
							.when(S0_T1.sundry_itm_flg.eq(value(true)))
								.then(S0_T1.itm_nm)
							.otherwise(
								nvl2(
									bind("prnt_lcl_cd"),
									S0_M1.itm_nm,
									S0_ITM.itm_nm
								)
							).as("itm_nm"),
						nvl2(
							bind("prnt_lcl_cd"),
							S0_M1.itm_alt_nm1,
							S0_ITM.itm_alt_nm1
						).as("itm_alt_nm1"),
						nvl2(
							bind("prnt_lcl_cd"),
							S0_M1.itm_alt_nm2,
							S0_ITM.itm_alt_nm2
						).as("itm_alt_nm2"),
						nvl2(
							bind("prnt_lcl_cd"),
							S0_M1.itm_alt_nm3,
							S0_ITM.itm_alt_nm3
						).as("itm_alt_nm3"),
						nvl2(
							bind("prnt_lcl_cd"),
							S0_M1.itm_alt_nm4,
							S0_ITM.itm_alt_nm4
						).as("itm_alt_nm4"),
						cases()
							.when(S0_T1.sundry_itm_flg.eq(value(true)))
								.then(S0_T1.iv_itm_nm)
							.otherwise(
								nvl2(
									bind("prnt_lcl_cd"),
									S0_M1.itm_nm,
									S0_ITM.itm_nm
								)
							).as("iv_itm_nm"),
						S0_T1.lot_no,
						S0_T1.sublot_no,
						S0_T1.ver_no,
						S0_T1.trd_unit_qty,
						S0_T1.trd_unit_cd,
						nvl2(
							bind("prnt_lcl_cd"),
							S0_M3.unit_nm,
							S0_M31.unit_nm
						).as("trd_unit_nm"),
						S0_T6.pr("interim_flg"),
						decode(
							S0_ITM.dscnt_itm_flg,
							value(true),
							value(0).subtract(S0_T6.pr("trd_cur_upri")),
							S0_T6.pr("trd_cur_upri")
						).as("trd_cur_upri"),
						decode(
							S0_ITM.dscnt_itm_flg,
							value(true),
							value(0).subtract(S0_T6.pr("trd_cur_amt")),
							S0_T6.pr("trd_cur_amt")
						).as("trd_cur_amt"),
						decode(
							S0_ITM.dscnt_itm_flg,
							value(true),
							value(0).subtract(S0_T6.pr("trd_cur_tax_amt")),
							S0_T6.pr("trd_cur_tax_amt")
						).as("trd_cur_tax_amt"),
						S0_T6.pr("trd_cur_dscnt_amt"),
						S0_T1.ret_rsn_cd,
						nvl2(
							bind("prnt_lcl_cd"),
							S0_M5.biz_rsn_nm,
							S0_M51.biz_rsn_nm
						).as("ret_rsn_nm"),
						S0_T1.sppl_itm_cd,
						S0_T1.sppl_itm_nm,
						S0_T1.bp_lot_no,
						S0_T1.purc_ret_print_d_rmrks,
						S0_T1.disp_seq,
						S0_T1.sub_char1.as("purc_ret_act_d_sub_char1"),
						S0_T1.sub_char2.as("purc_ret_act_d_sub_char2"),
						S0_T1.sub_char3.as("purc_ret_act_d_sub_char3"),
						S0_T6.pr("sub_char1").as("purc_act_d_sub_char1"),
						S0_T6.pr("sub_char2").as("purc_act_d_sub_char2"),
						S0_T6.pr("sub_char3").as("purc_act_d_sub_char3"),
						// this field is appended by sql coverter.
						S0_T1.po_no.as("join_po_no_"),
						// this field is appended by sql coverter.
						S0_T6.pr("tax_cd").as("join_tax_cd_")
						,decode(
							S0_T1.purc_typ,
							value(MAC_PURC_TYP.PURC_ITM.value()),
							value(false),
							S0_BP.repurc_obli_flg
						).as("repurc_obli_flg")
						,S0_T6.pr("trd_cur_proc_upri")
						,S0_T6.pr("trd_cur_proc_amt")
						,S0_T6.pr("trd_cur_onr_prov_upri")
						,S0_T6.pr("trd_cur_onr_prov_amt")
					)
					.from(
						S0_T1
						.innerJoin(S0_T8).on(
							bracket(
								S0_T8.purc_ret_act_no.eq(S0_T1.purc_ret_act_no)
								.and(S0_T8.purc_ret_act_rev.eq(S0_T1.purc_ret_act_rev))
								.and(S0_T8.can_flg.eq(value(false)))
							)
						)
						.leftOuterJoin(
							subQuery()
							.select(S1_TB1.prAll())
							.from(
								S1_TB1
								.innerJoin(S1_TB2).on(
									bracket(
										S1_TB2.purc_act_no.eq(S1_TB1.purc_act_no)
										.and(S1_TB2.purc_act_seq.eq(S1_TB1.purc_act_seq))
										.and(value(MAC_SLIP_STS_TYP.CRT.value()).eq(S1_TB2.slip_sts_typ))
									)
								)
							).view(S0_T6)
						).on(
							bracket(
								S0_T1.purc_ret_act_d_no.eq(S0_T6.pr("purc_ret_act_d_no"))
							)
						)
						.leftOuterJoin(S0_M1).on(
							bracket(
								S0_T1.itm_cd.eq(S0_M1.itm_cd)
								.and(S0_T1.itm_sub1.eq(S0_M1.itm_sub1))
								.and(S0_T1.itm_sub2.eq(S0_M1.itm_sub2))
								.and(S0_T1.itm_sub3.eq(S0_M1.itm_sub3))
								.and(S0_M1.lcl_cd.eq(bind("prnt_lcl_cd")))
							)
						)
						.leftOuterJoin(S0_M3).on(
							bracket(
								S0_T1.trd_unit_cd.eq(S0_M3.unit_cd)
								.and(S0_M3.lcl_cd.eq(bind("prnt_lcl_cd")))
							)
						)
						.leftOuterJoin(S0_M31).on(
							bracket(
								S0_T1.trd_unit_cd.eq(S0_M31.unit_cd)
							)
						)
						.leftOuterJoin(S0_M5).on(
							bracket(
								S0_T1.ret_rsn_cd.eq(S0_M5.biz_rsn_cd)
								.and(S0_M5.lcl_cd.eq(bind("prnt_lcl_cd")))
							)
						)
						.leftOuterJoin(S0_M51).on(
							bracket(
								S0_T1.ret_rsn_cd.eq(S0_M51.biz_rsn_cd)
							)
						)
						.leftOuterJoin(S0_ITM).on(
							bracket(
								S0_T1.itm_cd.eq(S0_ITM.itm_cd)
								.and(S0_T1.itm_sub1.eq(S0_ITM.itm_sub1))
								.and(S0_T1.itm_sub2.eq(S0_ITM.itm_sub2))
								.and(S0_T1.itm_sub3.eq(S0_ITM.itm_sub3))
							)
						)
						.leftOuterJoin(S0_BP).on(
							bracket(
								S0_T8.sppl_cd.eq(S0_BP.bp_cd)
							)
						)
					)
					.where(
						value(0).eq(value(0))
						.and(S0_T1.purc_ret_act_no.eq(bind("purc_ret_act_no")))
					)
					.orderBy(S0_T1.disp_seq.asc())
			)
			.setJoinInfo(
				joinInfo(
					j -> j
						.add(MST_PO_R.class, r -> toCondition(
							r.getStringNE("join_po_no_")
						))
						.addSelect(m -> toArray(
							m.po_no
						))
						.addMap((r, m) -> {
							r.setStringNE("po_no", m.po_no());
					}),
					j -> j
						.add(MAVM_ITM_UNIT_R.class, r -> toCondition(
							r.getStringNE("itm_cd"),
							r.getStringNE("itm_sub3_data"),
							r.getStringNE("itm_sub2_data"),
							r.getStringNE("itm_sub1_data"),
							r.getStringNE("trd_unit_cd")
						))
						.addSelect(m -> toArray(
							m.dec_place
						))
						.addMap((r, m) -> {
							r.setNumberNE("unit_dec_place", m.dec_place());
					}),
					j -> j
						.add(MAM_TAX_R.class, r -> toCondition(
							r.getStringNE("join_tax_cd_")
						))
						.addSelect(m -> toArray(
							m.inc_tax_flg
						))
						.addMap((r, m) -> {
							r.setBooleanNE("inc_tax_flg", m.inc_tax_flg());
					})
				)
			);
	}
	/*
	 * MSBDL5200_MST_PURC_RET_ACT_S01
	 */
	static MCQueryPlan MSBDL5200_MST_PURC_RET_ACT_S01() {
		MST_PURC_RET_ACT_R S0_T1 = MST_PURC_RET_ACT_R.create("T1");
		MST_PURC_ACT_R S0_T2 = MST_PURC_ACT_R.create("T2");
		MAM_BP_R S0_M1 = MAM_BP_R.create("M1");
		MAM_BP_LCL_R S0_M2 = MAM_BP_LCL_R.create("M2");
		MAM_DPT_LCL_R S0_M3 = MAM_DPT_LCL_R.create("M3");
		MAM_DPT_R S0_M31 = MAM_DPT_R.create("M31");
		MAM_USR_LCL_R S0_M4 = MAM_USR_LCL_R.create("M4");
		MAM_USR_R S0_M41 = MAM_USR_R.create("M41");
		MAM_CUR_R S0_M5 = MAM_CUR_R.create("M5");
		MAM_CUR_LCL_R S0_M6 = MAM_CUR_LCL_R.create("M6");
		MAM_CO_R S0_M7 = MAM_CO_R.create("M7");
		MAM_CNTRY_R S0_M8 = MAM_CNTRY_R.create("M8");
		MAM_CNTRY_R S0_M9 = MAM_CNTRY_R.create("M9");
		
		return createQueryPlan()
			.setQuery(
				sql("MSBDL5200_MST_PURC_RET_ACT_Query_S01")
					.mainQuery()
					.select(
						S0_T1.purc_ret_act_no,
						S0_T1.purc_ret_act_rev,
						bind("purc_ret_print_dt").as("purc_ret_print_dt"),
						MAPA_BP$F_GET_BP_ADDR(
							S0_T1.sppl_cd,
							S0_T1.purc_ret_dt,
							value(MAC_BP_ADDR_TYP.ZIP_CD.value())
						).as("sppl_zip_cd"),
						MAPA_BP$F_GET_BP_ADDR(
							S0_T1.sppl_cd,
							S0_T1.purc_ret_dt,
							value(MAC_BP_ADDR_TYP.ADDR1.value())
						).as("sppl_addr1"),
						MAPA_BP$F_GET_BP_ADDR(
							S0_T1.sppl_cd,
							S0_T1.purc_ret_dt,
							value(MAC_BP_ADDR_TYP.ADDR2.value())
						).as("sppl_addr2"),
						MAPA_BP$F_GET_BP_ADDR(
							S0_T1.sppl_cd,
							S0_T1.purc_ret_dt,
							value(MAC_BP_ADDR_TYP.ADDR3.value())
						).as("sppl_addr3"),
						MAPA_BP$F_GET_BP_ADDR(
							S0_T1.sppl_cd,
							S0_T1.purc_ret_dt,
							value(MAC_BP_ADDR_TYP.ADDR4.value())
						).as("sppl_addr4"),
						S0_T1.sppl_cd,
						nvl2(
							S0_M1.prnt_lcl_cd,
							S0_M2.bp_nm,
							S0_M1.bp_nm
						).as("sppl_nm"),
						nvl2(
							S0_M1.prnt_lcl_cd,
							S0_M2.bp_alt_nm1,
							S0_M1.bp_alt_nm1
						).as("sppl_alt_nm1"),
						nvl2(
							S0_M1.prnt_lcl_cd,
							S0_M2.bp_alt_nm2,
							S0_M1.bp_alt_nm2
						).as("sppl_alt_nm2"),
						nvl2(
							S0_M1.prnt_lcl_cd,
							S0_M2.bp_alt_nm3,
							S0_M1.bp_alt_nm3
						).as("sppl_alt_nm3"),
						nvl2(
							S0_M1.prnt_lcl_cd,
							S0_M2.bp_alt_nm4,
							S0_M1.bp_alt_nm4
						).as("sppl_alt_nm4"),
						MAPA_BP$F_GET_BP_ADDR(
							S0_T1.sppl_cd,
							S0_T1.purc_ret_dt,
							value(MAC_BP_ADDR_TYP.SPPL_CNTCT_DPT.value())
						).as("sppl_cntct_dpt"),
						MAPA_BP$F_GET_BP_ADDR(
							S0_T1.sppl_cd,
							S0_T1.purc_ret_dt,
							value(MAC_BP_ADDR_TYP.SPPL_CNTCT_PSN.value())
						).as("sppl_cntct_psn"),
						MAPA_BP$F_GET_BP_ADDR(
							S0_T1.sppl_cd,
							S0_T1.purc_ret_dt,
							value(MAC_BP_ADDR_TYP.SPPL_CNTCT_PSN_TITLE.value())
						).as("sppl_cntct_psn_title"),
						MAPA_BP$F_GET_BP_ADDR(
							S0_T1.sppl_cd,
							S0_T1.purc_ret_dt,
							value(MAC_BP_ADDR_TYP.TEL.value())
						).as("sppl_tel"),
						MAPA_BP$F_GET_BP_ADDR(
							S0_T1.sppl_cd,
							S0_T1.purc_ret_dt,
							value(MAC_BP_ADDR_TYP.FAX.value())
						).as("sppl_fax"),
						S0_M1.prnt_lcl_cd,
						FCPA_CO$F_GET_CO_NM1(S0_M1.prnt_lcl_cd).as("co_nm"),
						nvl2(
							S0_M1.prnt_lcl_cd,
							S0_M3.zip_cd,
							S0_M31.zip_cd
						).as("dpt_zip_cd"),
						nvl2(
							S0_M1.prnt_lcl_cd,
							S0_M3.addr1,
							S0_M31.addr1
						).as("dpt_addr1"),
						nvl2(
							S0_M1.prnt_lcl_cd,
							S0_M3.addr2,
							S0_M31.addr2
						).as("dpt_addr2"),
						nvl2(
							S0_M1.prnt_lcl_cd,
							S0_M3.addr3,
							S0_M31.addr3
						).as("dpt_addr3"),
						nvl2(
							S0_M1.prnt_lcl_cd,
							S0_M3.addr4,
							S0_M31.addr4
						).as("dpt_addr4"),
						nvl2(
							S0_M1.prnt_lcl_cd,
							S0_M3.tel,
							S0_M31.tel
						).as("dpt_tel"),
						nvl2(
							S0_M1.prnt_lcl_cd,
							S0_M3.fax,
							S0_M31.fax
						).as("dpt_fax"),
						S0_T1.purc_dpt_cd,
						nvl2(
							S0_M1.prnt_lcl_cd,
							S0_M3.dpt_nm,
							S0_M31.dpt_nm
						).as("purc_dpt_nm"),
						S0_T1.purc_usr_cd,
						nvl2(
							S0_M1.prnt_lcl_cd,
							S0_M4.usr_nm,
							S0_M41.usr_nm
						).as("purc_usr_nm"),
						S0_T1.trd_cd,
						S0_T1.sub_char1.as("purc_ret_act_sub_char1"),
						S0_T1.sub_char2.as("purc_ret_act_sub_char2"),
						S0_T1.sub_char3.as("purc_ret_act_sub_char3"),
						S0_T2.sub_char1.as("purc_act_sub_char1"),
						S0_T2.sub_char2.as("purc_act_sub_char2"),
						S0_T2.sub_char3.as("purc_act_sub_char3"),
						S0_T2.trd_cur_cd,
						S0_M5.amt_dec_place,
						S0_M5.upri_dec_place,
						nvl2(
							S0_M1.prnt_lcl_cd,
							S0_M6.cur_nm,
							S0_M5.cur_nm
						).as("trd_cur_nm"),
						S0_T1.ret_sppl_zip_cd,
						S0_T1.ret_sppl_addr1,
						S0_T1.ret_sppl_addr2,
						S0_T1.ret_sppl_addr3,
						S0_T1.ret_sppl_addr4,
						S0_T1.ret_sppl_nm,
						S0_T1.ret_sppl_cntct_dpt,
						S0_T1.ret_sppl_cntct_psn,
						S0_T1.ret_sppl_cntct_psn_title,
						S0_T1.ret_sppl_tel,
						S0_T1.ret_sppl_fax,
						S0_T1.purc_ret_print_rmrks
						,S0_M8.cntry_nm.as("sppl_cntry_nm")
						,S0_M9.cntry_nm.as("dpt_cntry_nm")
					,S0_T1.purc_ret_dt
					)
					.from(
						S0_T1
						.leftOuterJoin(S0_T2).on(
							bracket(
								S0_T1.purc_ret_act_no.eq(S0_T2.purc_ret_act_no)
								.and(S0_T1.purc_ret_act_rev.eq(S0_T2.purc_ret_act_rev))
								.and(S0_T2.slip_sts_typ.eq(value(MAC_SLIP_STS_TYP.CRT.value())))
							)
						)
						.leftOuterJoin(S0_M1).on(
							bracket(
								S0_T1.sppl_cd.eq(S0_M1.bp_cd)
							)
						)
						.leftOuterJoin(S0_M2).on(
							bracket(
								S0_T1.sppl_cd.eq(S0_M2.bp_cd)
								.and(S0_M1.prnt_lcl_cd.eq(S0_M2.lcl_cd))
							)
						)
						.leftOuterJoin(S0_M3).on(
							bracket(
								S0_T1.purc_dpt_cd.eq(S0_M3.dpt_cd)
								.and(S0_T1.purc_ret_dt.between(S0_M3.st_dt, S0_M3.end_dt))
								.and(S0_M1.prnt_lcl_cd.eq(S0_M3.lcl_cd))
							)
						)
						.leftOuterJoin(S0_M31).on(
							bracket(
								S0_T1.purc_dpt_cd.eq(S0_M31.dpt_cd)
								.and(S0_T1.purc_ret_dt.between(S0_M31.st_dt, S0_M31.end_dt))
							)
						)
						.leftOuterJoin(S0_M4).on(
							bracket(
								S0_T1.purc_usr_cd.eq(S0_M4.usr_cd)
								.and(S0_M1.prnt_lcl_cd.eq(S0_M4.lcl_cd))
							)
						)
						.leftOuterJoin(S0_M41).on(
							bracket(
								S0_T1.purc_usr_cd.eq(S0_M41.usr_cd)
							)
						)
						.leftOuterJoin(S0_M5).on(
							bracket(
								S0_T2.trd_cur_cd.eq(S0_M5.cur_cd)
							)
						)
						.leftOuterJoin(S0_M6).on(
							bracket(
								S0_T2.trd_cur_cd.eq(S0_M6.cur_cd)
								.and(S0_M1.prnt_lcl_cd.eq(S0_M6.lcl_cd))
							)
						)
						.crossJoin(S0_M7)
						.leftOuterJoin(S0_M8).on(
							bracket(
								S0_M8.cntry_cd.eq(S0_M1.cntry_cd)
							)
						)
						.leftOuterJoin(S0_M9).on(
							bracket(
								S0_M9.cntry_cd.eq(S0_M7.cntry_cd)
							)
						)
					)
					.where(
						value(0).eq(value(0))
						.and(S0_T1.purc_ret_act_no.eq(bind("purc_ret_act_no")))
						.and(S0_T1.purc_ret_act_rev.eq(bind("purc_ret_act_rev")))
					)
			);
	}
}