package mcframe.serverMSBB.MSBBL1220;

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
import mcframe.serverCore.queryapi.IFMCSQL.MCSingleView;
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
	 * -- MSBBL1220_MST_DLV_INST_RCPT_Query_S01
	 */
	static MCQueryPlan MSBBL1220_MST_DLV_INST_RCPT_S01() {
		MST_DLV_INST_RCPT_R S0_T1 = MST_DLV_INST_RCPT_R.create("T1");
		MSW_SLO_D_KEY_R S0_W1 = MSW_SLO_D_KEY_R.create("W1");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBBL1220_MST_DLV_INST_RCPT_Query_S01")
					.mainQuery()
					.select(
						S0_W1.slo_d_no,
						trunc(
							max(S0_T1.dlv_rqst_tm),
							MCDateFmt.DD
						).as("dlv_inst_dt"),
						max(S0_T1.dlv_rqst_tm).as("dlv_inst_hm")
					)
					.from(
						S0_T1
						.innerJoin(S0_W1).on(S0_W1.slo_d_no.eq(S0_T1.slo_d_no))
					)
					.where(
						S0_T1.can_flg.eq(value(false))
					)
					.groupBy(S0_W1.slo_d_no)
			);
	}
	
	/**
	 * -- MSBBL1220_MST_SHIP_SCHD_Query_S01
	 */
	static MCQueryPlan MSBBL1220_MST_SHIP_SCHD_S01() {
		MST_SLO_R S0_T1 = MST_SLO_R.create("T1");
		MST_SLO_D_R S0_T2 = MST_SLO_D_R.create("T2");
		MST_WRK_R S0_T3 = MST_WRK_R.create("T3");
		MST_SLS_ITM_R S0_T4 = MST_SLS_ITM_R.create("T4");
		MST_SLS_ITM_SPEC_R S0_T5 = MST_SLS_ITM_SPEC_R.create("T5");
		MST_SHIP_PR_R S0_T6 = MST_SHIP_PR_R.create("T6");
		MST_SHIP_SCHD_R S0_T7 = MST_SHIP_SCHD_R.create("T7");
		MAM_TRD_R S0_M1 = MAM_TRD_R.create("M1");
		MAM_USR_R S0_M2 = MAM_USR_R.create("M2");
		MAM_DPT_R S0_M3 = MAM_DPT_R.create("M3");
		MAM_WG_R S0_M4 = MAM_WG_R.create("M4");
		MAM_BP_R S0_M5 = MAM_BP_R.create("M5");
		MAM_CUR_R S0_M6 = MAM_CUR_R.create("M6");
		MAM_DPT_R S0_M11 = MAM_DPT_R.create("M11");
		MAM_USR_R S0_M19 = MAM_USR_R.create("M19");
		MAM_BP_R S0_M21 = MAM_BP_R.create("M21");
		MAM_LG_GRP_R S0_M22 = MAM_LG_GRP_R.create("M22");
		MAM_BP_R S0_M23 = MAM_BP_R.create("M23");
		MAM_BP_R S0_M24 = MAM_BP_R.create("M24");
		MAM_BP_R S0_M25 = MAM_BP_R.create("M25");
		MAM_BP_R S0_M26 = MAM_BP_R.create("M26");
		MAM_LG_GRP_R S0_M27 = MAM_LG_GRP_R.create("M27");
		MAM_ITM_R S0_M28 = MAM_ITM_R.create("M28");
		MAM_STK_GD_R S0_M34 = MAM_STK_GD_R.create("M34");
		MAM_LOC_R S0_M35 = MAM_LOC_R.create("M35");
		MAM_BP_R S0_M36 = MAM_BP_R.create("M36");
		MAM_ALLOC_GRP_R S0_M38 = MAM_ALLOC_GRP_R.create("M38");
		MAM_LG_GRP_R S0_M39 = MAM_LG_GRP_R.create("M39");
		MAM_LOC_R S0_M41 = MAM_LOC_R.create("M41");
		MAM_STR_LN_R S0_M42 = MAM_STR_LN_R.create("M42");
		MAM_BIZ_RSN_R S0_M44 = MAM_BIZ_RSN_R.create("M44");
		MAM_DPT_R S0_M45 = MAM_DPT_R.create("M45");
		MAM_ITM_TYP_D_R S0_M49 = MAM_ITM_TYP_D_R.create("M49");
		MAM_BP_R S0_M50 = MAM_BP_R.create("M50");
		MAM_BP_R S0_M52 = MAM_BP_R.create("M52");
		MAM_ITM_LCL_R S0_M55 = MAM_ITM_LCL_R.create("M55");
		MAVM_RD_DPT_R S0_DAC = MAVM_RD_DPT_R.create("DAC");
		MAM_BP_GRP_R S0_MMC1 = MAM_BP_GRP_R.create("MMC1");
		MAM_BP_GRP_R S0_MMC2 = MAM_BP_GRP_R.create("MMC2");
		MAM_BP_GRP_R S0_MMC3 = MAM_BP_GRP_R.create("MMC3");
		MAM_BP_GRP_R S0_MMC4 = MAM_BP_GRP_R.create("MMC4");
		MAM_BP_GRP_R S0_MMC5 = MAM_BP_GRP_R.create("MMC5");
		MAM_BP_GRP_R S0_MMC6 = MAM_BP_GRP_R.create("MMC6");
		MAM_BP_GRP_R S0_MMC7 = MAM_BP_GRP_R.create("MMC7");
		MAM_BP_GRP_R S0_MMC8 = MAM_BP_GRP_R.create("MMC8");
		MAM_BP_GRP_R S0_MMC9 = MAM_BP_GRP_R.create("MMC9");
		MAM_BP_GRP_R S0_MMC10 = MAM_BP_GRP_R.create("MMC10");
		MAM_BP_GRP_R S0_MMD1 = MAM_BP_GRP_R.create("MMD1");
		MAM_BP_GRP_R S0_MMD2 = MAM_BP_GRP_R.create("MMD2");
		MAM_BP_GRP_R S0_MMD3 = MAM_BP_GRP_R.create("MMD3");
		MAM_BP_GRP_R S0_MMD4 = MAM_BP_GRP_R.create("MMD4");
		MAM_BP_GRP_R S0_MMD5 = MAM_BP_GRP_R.create("MMD5");
		MAM_BP_GRP_R S0_MMD6 = MAM_BP_GRP_R.create("MMD6");
		MAM_BP_GRP_R S0_MMD7 = MAM_BP_GRP_R.create("MMD7");
		MAM_BP_GRP_R S0_MMD8 = MAM_BP_GRP_R.create("MMD8");
		MAM_BP_GRP_R S0_MMD9 = MAM_BP_GRP_R.create("MMD9");
		MAM_BP_GRP_R S0_MMD10 = MAM_BP_GRP_R.create("MMD10");
		MAM_ITM_GRP_R S0_MMI1 = MAM_ITM_GRP_R.create("MMI1");
		MAM_ITM_GRP_R S0_MMI2 = MAM_ITM_GRP_R.create("MMI2");
		MAM_ITM_GRP_R S0_MMI3 = MAM_ITM_GRP_R.create("MMI3");
		MAM_ITM_GRP_R S0_MMI4 = MAM_ITM_GRP_R.create("MMI4");
		MAM_ITM_GRP_R S0_MMI5 = MAM_ITM_GRP_R.create("MMI5");
		MAM_ITM_GRP_R S0_MMI6 = MAM_ITM_GRP_R.create("MMI6");
		MAM_ITM_GRP_R S0_MMI7 = MAM_ITM_GRP_R.create("MMI7");
		MAM_ITM_GRP_R S0_MMI8 = MAM_ITM_GRP_R.create("MMI8");
		MAM_ITM_GRP_R S0_MMI9 = MAM_ITM_GRP_R.create("MMI9");
		MAM_ITM_GRP_R S0_MMI10 = MAM_ITM_GRP_R.create("MMI10");
		
		MCDynamicSQLID DS0C_CST_GRP = createDynamicSQLID("DS0C_CST_GRP");
		MCDynamicSQLID DS0C_DLV_GRP = createDynamicSQLID("DS0C_DLV_GRP");
		MCDynamicSQLID DS0C_ITM_GRP = createDynamicSQLID("DS0C_ITM_GRP");
		
		return createQueryPlan()
			.setQuery(
				sql("MSBBL1220_MST_SHIP_SCHD_Query_S01")
					.mainQuery()
					.select(
						S0_T7.pr_sts_typ,
						S0_T1.trd_cd,
						S0_T1.trd_ptn_typ,
						S0_T1.slo_no,
						S0_T1.slo_rev,
						S0_T1.slo_dt,
						S0_T1.edi_flg,
						S0_T2.slo_d_no,
						S0_T1.sls_usr_cd,
						S0_T1.sls_dpt_cd,
						S0_M3.dpt_nm.as("sls_dpt_nm"),
						S0_T1.wg_cd,
						S0_T1.cst_cd,
						S0_T1.sls_basis_typ,
						S0_T1.trd_cur_cd,
						S0_T1.xrate_inpt_flg,
						S0_T1.xrate,
						nvl(
							S0_T7.dlv_day_week_typ,
							S0_T2.dlv_day_week_typ
						).as("dlv_day_week_typ"),
						S0_T1.assort_typ,
						S0_T1.slo_typ,
						S0_T1.cst_po_no,
						S0_T1.cst_po_rev,
						S0_T1.ar_dpt_cd,
						S0_M11.dpt_nm.as("ar_dpt_nm"),
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
						S0_T1.qtn_no,
						S0_T1.qtn_rev,
						S0_T1.wrk_no,
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
						S0_T1.aprv_flg,
						S0_T1.aprv_no,
						S0_T1.aprv_sts_typ,
						S0_T2.abort_flg,
						nvl(
							S0_T7.dlv_cd,
							S0_T2.dlv_cd
						).as("dlv_cd"),
						nvl2(
							S0_T7.dlv_cd,
							S0_T7.dlv_sundry_flg,
							S0_T2.dlv_sundry_flg
						).as("dlv_sundry_flg"),
						nvl2(
							S0_T7.dlv_cd,
							nvl(
								S0_T7.dlv_nm,
								S0_M21.bp_nm
							),
							nvl(
								S0_T2.dlv_nm,
								S0_M21.bp_nm
							)
						).as("dlv_nm"),
						nvl2(
							S0_T7.dlv_cd,
							S0_T7.dlv_cntct_dpt,
							S0_T2.dlv_cntct_dpt
						).as("dlv_cntct_dpt"),
						nvl2(
							S0_T7.dlv_cd,
							S0_T7.dlv_cntct_psn,
							S0_T2.dlv_cntct_psn
						).as("dlv_cntct_psn"),
						nvl2(
							S0_T7.dlv_cd,
							S0_T7.dlv_zip_cd,
							S0_T2.dlv_zip_cd
						).as("dlv_zip_cd"),
						nvl2(
							S0_T7.dlv_cd,
							S0_T7.dlv_addr1,
							S0_T2.dlv_addr1
						).as("dlv_addr1"),
						nvl2(
							S0_T7.dlv_cd,
							S0_T7.dlv_addr2,
							S0_T2.dlv_addr2
						).as("dlv_addr2"),
						nvl2(
							S0_T7.dlv_cd,
							S0_T7.dlv_addr3,
							S0_T2.dlv_addr3
						).as("dlv_addr3"),
						nvl2(
							S0_T7.dlv_cd,
							S0_T7.dlv_addr4,
							S0_T2.dlv_addr4
						).as("dlv_addr4"),
						nvl2(
							S0_T7.dlv_cd,
							S0_T7.dlv_tel,
							S0_T2.dlv_tel
						).as("dlv_tel"),
						nvl2(
							S0_T7.dlv_cd,
							S0_T7.dlv_fax,
							S0_T2.dlv_fax
						).as("dlv_fax"),
						S0_M50.cntry_cd.as("dlv_cntry_cd"),
						nvl2(
							S0_T7.dlv_cd,
							S0_T7.dlv_lg_grp_cd,
							S0_T2.dlv_lg_grp_cd
						).as("dlv_lg_grp_cd"),
						S0_M22.lg_grp_nm.as("dlv_lg_grp_nm"),
						nvl2(
							S0_T7.dlv_cd,
							S0_T7.pri_prnt_flg,
							S0_T2.pri_prnt_flg
						).as("pri_prnt_flg"),
						S0_T2.dest_cd1,
						S0_T2.dest_cd2,
						S0_T2.dest_cd3,
						nvl(
							S0_T7.tdlv_cd,
							S0_T2.tdlv_cd
						).as("tdlv_cd"),
						nvl2(
							S0_T7.tdlv_cd,
							S0_T7.tdlv_sundry_flg,
							S0_T2.tdlv_sundry_flg
						).as("tdlv_sundry_flg"),
						nvl2(
							S0_T7.tdlv_cd,
							nvl(
								S0_T7.tdlv_nm,
								S0_M26.bp_nm
							),
							nvl(
								S0_T2.tdlv_nm,
								S0_M26.bp_nm
							)
						).as("tdlv_nm"),
						nvl2(
							S0_T7.tdlv_cd,
							S0_T7.tdlv_cntct_dpt,
							S0_T2.tdlv_cntct_dpt
						).as("tdlv_cntct_dpt"),
						nvl2(
							S0_T7.tdlv_cd,
							S0_T7.tdlv_cntct_psn,
							S0_T2.tdlv_cntct_psn
						).as("tdlv_cntct_psn"),
						nvl2(
							S0_T7.tdlv_cd,
							S0_T7.tdlv_zip_cd,
							S0_T2.tdlv_zip_cd
						).as("tdlv_zip_cd"),
						nvl2(
							S0_T7.tdlv_cd,
							S0_T7.tdlv_addr1,
							S0_T2.tdlv_addr1
						).as("tdlv_addr1"),
						nvl2(
							S0_T7.tdlv_cd,
							S0_T7.tdlv_addr2,
							S0_T2.tdlv_addr2
						).as("tdlv_addr2"),
						nvl2(
							S0_T7.tdlv_cd,
							S0_T7.tdlv_addr3,
							S0_T2.tdlv_addr3
						).as("tdlv_addr3"),
						nvl2(
							S0_T7.tdlv_cd,
							S0_T7.tdlv_addr4,
							S0_T2.tdlv_addr4
						).as("tdlv_addr4"),
						nvl2(
							S0_T7.tdlv_cd,
							S0_T7.tdlv_tel,
							S0_T2.tdlv_tel
						).as("tdlv_tel"),
						nvl2(
							S0_T7.tdlv_cd,
							S0_T7.tdlv_fax,
							S0_T2.tdlv_fax
						).as("tdlv_fax"),
						S0_M52.cntry_cd.as("tdlv_cntry_cd"),
						nvl2(
							S0_T7.tdlv_cd,
							S0_T7.tdlv_lg_grp_cd,
							S0_T2.tdlv_lg_grp_cd
						).as("tdlv_lg_grp_cd"),
						S0_M27.lg_grp_nm.as("tdlv_lg_grp_nm"),
						S0_T2.itm_cd,
						S0_T2.itm_sub1,
						S0_T2.itm_sub2,
						S0_T2.itm_sub3,
						nvl(
							S0_T2.itm_nm,
							S0_M28.itm_nm
						).as("itm_nm"),
						S0_M28.comp_spec_typ,
						S0_T4.itm_comp_rev_no,
						decode(
							S0_M28.sundry_itm_flg,
							value(true),
							S0_T2.iv_itm_nm,
							nvl(
								S0_M55.itm_nm,
								S0_M28.itm_nm
							)
						).as("iv_itm_nm"),
						S0_T2.cntry_org_cd,
						S0_M28.asset_mng_typ,
						S0_T2.vmi_flg,
						S0_M28.dscnt_itm_flg,
						S0_T2.sundry_itm_flg,
						S0_T7.trd_unit_cd,
						S0_T7.trd_unit_qty,
						S0_T2.upri_not_tgt_flg,
						S0_T2.trd_cur_upri,
						S0_T2.interim_flg,
						S0_T2.dscnt_rsn_cd,
						S0_T2.cost_upri,
						S0_T2.iv_upri,
						S0_T2.tax_fix_flg,
						S0_T2.tax_cd,
						S0_T2.wtax_rate,
						S0_T2.bill_crryovr_times,
						S0_T2.gd_cd,
						S0_T2.sno1_null_flg,
						S0_T2.sno1,
						S0_T2.sno2_null_flg,
						S0_T2.sno2,
						S0_T2.sno3_null_flg,
						S0_T2.sno3,
						S0_T2.sno4_null_flg,
						S0_T2.sno4,
						decode(
							S0_T5.sls_itm_spec_no,
							nullValue(),
							value(false),
							value(true)
						).as("has_spec_flg"),
						S0_T5.sub_char1.as("spec_sub_char1"),
						S0_T5.sub_char2.as("spec_sub_char2"),
						S0_T5.sub_char3.as("spec_sub_char3"),
						S0_T2.set_itm_grp_no,
						trunc(
							S0_T7.ship_rqst_tm,
							MCDateFmt.DD
						).as("ship_rqst_dt"),
						S0_T7.ship_rqst_tm.as("ship_rqst_hm"),
						trunc(
							S0_T2.dlv_rqst_tm,
							MCDateFmt.DD
						).as("dlv_rqst_dt"),
						S0_T2.dlv_rqst_tm.as("dlv_rqst_hm"),
						trunc(
							S0_T7.pd_inst_dlv_tm,
							MCDateFmt.DD
						).as("pd_inst_dlv_dt"),
						S0_T7.pd_inst_dlv_tm.as("pd_inst_dlv_hm"),
						S0_T2.accpt_schd_dt,
						S0_T2.sls_schd_dt,
						S0_T7.ship_abl_flg,
						trunc(
							S0_T7.ship_schd_tm,
							MCDateFmt.DD
						).as("ship_schd_dt"),
						S0_T7.ship_schd_tm.as("ship_schd_hm"),
						trunc(
							S0_T7.dlv_schd_tm,
							MCDateFmt.DD
						).as("dlv_schd_dt"),
						S0_T7.dlv_schd_tm.as("dlv_schd_hm"),
						S0_T2.sls_cststk_flg,
						S0_T2.proc_typ,
						S0_T2.ship_inst_typ,
						S0_T2.ship_schd_split_typ,
						S0_T2.alloc_scope_typ,
						S0_T2.alloc_typ,
						S0_T2.not_lg_mix_flg,
						S0_T2.rqst_to_loc_cd,
						S0_T2.sppl_cd,
						S0_T2.maker_cd,
						S0_T2.rqst_dt,
						S0_T2.rqst_dlv_rqst_dt,
						S0_T2.rqst_prms_dt,
						S0_T2.rqst_prms_dlv_dt,
						S0_T2.wg_rqst_cnt_rmrks,
						S0_T2.alloc_grp_cd,
						S0_T7.ship_fr_lg_grp_cd.as("ship_lg_grp_cd"),
						S0_T2.def_loc_cd,
						S0_T2.loc_cd,
						S0_T2.str_ln_cd,
						S0_T2.lot_no,
						S0_T2.sublot_no,
						S0_T2.not_lot_mix_flg,
						S0_T2.not_sublot_mix_flg,
						S0_T2.ver_no,
						S0_T7.ship_term_cd,
						S0_T7.ship_block_flg,
						S0_T7.ship_cnt_rmrks,
						S0_T7.trd_d_rmrks,
						S0_T2.intr_rmrks.as("slo_d_intr_rmrks"),
						S0_T2.sls_rsn_cd,
						S0_T2.bd_dpt_cd,
						S0_M45.dpt_nm.as("bd_dpt_nm"),
						S0_T2.qtn_d_no,
						S0_T2.cst_po_d_no,
						S0_T2.cst_itm_cd,
						S0_T2.cst_itm_nm,
						S0_T2.cst_po_d_rmrks,
						S0_T2.sls_upri_req_typ,
						S0_T2.sub_char1.as("slo_d_sub_char1"),
						S0_T2.sub_char2.as("slo_d_sub_char2"),
						S0_T2.sub_char3.as("slo_d_sub_char3"),
						S0_T2.edi_sub_d_char1,
						S0_T2.edi_sub_d_char2,
						S0_T2.edi_sub_d_char3,
						S0_T2.edi_sub_d_char4,
						S0_T2.edi_sub_d_char5,
						S0_T2.edi_sub_d_num1,
						S0_T2.edi_sub_d_dt1,
						S0_T7.cmpl_flg.as("ship_cmpl_flg"),
						S0_T2.base_unit_cd,
						S0_T7.base_unit_qty,
						S0_T7.alloc_qty,
						S0_T7.wait_qty,
						S0_T7.ship_inst_qty,
						S0_T7.ship_act_qty,
						S0_T7.iv_schd_qty,
						S0_T7.iv_act_qty,
						S0_T7.sls_qty,
						S0_T7.ship_ret_qty,
						S0_T7.fix_flg,
						S0_T7.re_ship_schd_flg,
						S0_T7.not_dt_calc_flg,
						S0_T7.ship_wk_cd,
						S0_T7.abort_flg.as("ship_abort_flg"),
						S0_T7.ship_schd_no,
						S0_T2.disp_seq,
						S0_T7.ins_usr_id,
						S0_T7.ins_usr_nm,
						S0_T7.ins_func_id,
						S0_T7.ins_ts,
						S0_T7.upd_usr_id,
						S0_T7.upd_usr_nm,
						S0_T7.upd_func_id,
						S0_T7.upd_ts,
						S0_T7.upd_srv_req_no,
						addDynamicSelect(DS0C_CST_GRP),
						addDynamicSelect(DS0C_DLV_GRP),
						addDynamicSelect(DS0C_ITM_GRP)
					)
					.from(
						S0_T1
						.innerJoin(S0_T2).on(S0_T2.slo_no.eq(S0_T1.slo_no))
						.leftOuterJoin(S0_T4).on(S0_T4.sls_itm_no.eq(S0_T2.sls_itm_no))
						.leftOuterJoin(S0_T5).on(S0_T5.sls_itm_no.eq(S0_T4.sls_itm_no))
						.innerJoin(S0_T6).on(S0_T6.slo_d_no.eq(S0_T2.slo_d_no))
						.innerJoin(S0_T7).on(S0_T7.ship_pr_no.eq(S0_T6.ship_pr_no))
						.leftOuterJoin(S0_M3).on(
							S0_M3.dpt_cd.eq(S0_T1.sls_dpt_cd)
							.and(S0_T1.slo_dt.between(S0_M3.st_dt, S0_M3.end_dt))
						)
						.leftOuterJoin(S0_M11).on(
							S0_M11.dpt_cd.eq(S0_T1.ar_dpt_cd)
							.and(S0_T1.slo_dt.between(S0_M11.st_dt, S0_M11.end_dt))
						)
						.leftOuterJoin(S0_M21).on(
							S0_M21.bp_cd.eq(nvl(
									S0_T7.dlv_cd,
									S0_T2.dlv_cd
								)
							)
						)
						.leftOuterJoin(S0_M22).on(
							S0_M22.lg_grp_cd.eq(nvl2(
									S0_T7.dlv_cd,
									S0_T7.dlv_lg_grp_cd,
									S0_T2.dlv_lg_grp_cd
								)
							)
						)
						.leftOuterJoin(S0_M26).on(
							S0_M26.bp_cd.eq(nvl(
									S0_T7.tdlv_cd,
									S0_T2.tdlv_cd
								)
							)
						)
						.leftOuterJoin(S0_M27).on(
							S0_M27.lg_grp_cd.eq(nvl2(
									S0_T7.tdlv_cd,
									S0_T7.tdlv_lg_grp_cd,
									S0_T2.tdlv_lg_grp_cd
								)
							)
						)
						.leftOuterJoin(S0_M28).on(
							S0_M28.itm_cd.eq(S0_T2.itm_cd)
							.and(S0_M28.itm_sub1.eq(S0_T2.itm_sub1))
							.and(S0_M28.itm_sub2.eq(S0_T2.itm_sub2))
							.and(S0_M28.itm_sub3.eq(S0_T2.itm_sub3))
						)
						.leftOuterJoin(S0_M45).on(
							S0_M45.dpt_cd.eq(S0_T2.bd_dpt_cd)
							.and(S0_T1.slo_dt.between(S0_M45.st_dt, S0_M45.end_dt))
						)
						.leftOuterJoin(S0_M50).on(
							S0_M50.bp_cd.eq(nvl(
									S0_T7.dlv_cd,
									S0_T2.dlv_cd
								)
							)
						)
						.leftOuterJoin(S0_M52).on(
							S0_M52.bp_cd.eq(nvl(
									S0_T7.tdlv_cd,
									S0_T2.tdlv_cd
								)
							)
						)
						.leftOuterJoin(S0_M55).on(
							S0_M55.itm_cd.eq(S0_T2.itm_cd)
							.and(S0_M55.itm_sub1.eq(S0_T2.itm_sub1))
							.and(S0_M55.itm_sub2.eq(S0_T2.itm_sub2))
							.and(S0_M55.itm_sub3.eq(S0_T2.itm_sub3))
							.and(S0_M55.lcl_cd.eq(S0_M21.prnt_lcl_cd))
						)
						.innerJoin(S0_DAC).on(S0_DAC.dpt_cd.eq(S0_T1.sls_dpt_cd))
						.addDynamicView()
						.addDynamicView(DS0C_CST_GRP)
						.addDynamicView(DS0C_DLV_GRP)
						.addDynamicView(DS0C_ITM_GRP)
					)
					.where(
						value(0).eq(value(0))
						.and(
							bracket(
								bind("aprv_flg_str").eq(value(true))
								.and(S0_T1.aprv_flg.eq(value(false)))
							)
							.cutoff$or(
								bracket(
									S0_T1.aprv_flg.eq(value(true))
									.and(S0_T1.aprv_sts_typ.like(bind("aprv_sts_typ")))
								)
							)
						)
						.cutoff$and(S0_T1.edi_flg.eq(bind("edi_flg_str")))
						.addDynamicPredicate()
						.cutoff$and(
							bracket(
								bracket(
									bind("not_alloc_flg_str").eq(value(true))
									.and(
										S0_T2.alloc_typ.in(
											value(MAC_ALLOC_TYP.IMMED.value()),
											value(MAC_ALLOC_TYP.LATER.value())
										)
									)
									.and(S0_T7.alloc_qty.eq(value(0)))
								)
								.or(
									bind("part_alloc_flg_str").eq(value(true))
									.and(S0_T7.alloc_qty.lt(S0_T7.base_unit_qty))
									.and(S0_T7.alloc_qty.gt(value(0)))
								)
								.or(
									bind("all_alloc_flg_str").eq(value(true))
									.and(S0_T7.alloc_qty.gte(S0_T7.base_unit_qty))
								)
								.or(
									bind("alloc_invalid_flg_str").eq(value(true))
									.and(
										S0_T2.alloc_typ.eq(value(MAC_ALLOC_TYP.NON.value()))
										.and(S0_T7.alloc_qty.eq(value(0)))
										.or(S0_T2.alloc_typ.isNull())
									)
								)
							)
						)
						.cutoff$and(S0_T7.pr_sts_typ.like(bind("pr_sts_typ")))
						.cutoff$and(S0_T1.slo_dt.gte(bind("slo_dt_fr")))
						.cutoff$and(S0_T1.slo_dt.lte(bind("slo_dt_to")))
						.cutoff$and(S0_T7.ship_rqst_tm.gte(bind("ship_rqst_hm_fr")))
						.cutoff$and(S0_T7.ship_rqst_tm.lte(bind("ship_rqst_hm_to")))
						.cutoff$and(S0_T2.dlv_rqst_tm.gte(bind("dlv_rqst_hm_fr")))
						.cutoff$and(S0_T2.dlv_rqst_tm.lte(bind("dlv_rqst_hm_to")))
						.cutoff$and(S0_T2.sls_schd_dt.gte(bind("sls_schd_dt_fr")))
						.cutoff$and(S0_T2.sls_schd_dt.lte(bind("sls_schd_dt_to")))
						.cutoff$and(S0_T7.ship_schd_tm.gte(bind("ship_schd_hm_fr")))
						.cutoff$and(S0_T7.ship_schd_tm.lte(bind("ship_schd_hm_to")))
						.cutoff$and(S0_T7.dlv_schd_tm.gte(bind("dlv_schd_hm_fr")))
						.cutoff$and(S0_T7.dlv_schd_tm.lte(bind("dlv_schd_hm_to")))
						.cutoff$and(S0_T6.dlv_inst_rcpt_dt.gte(bind("dlv_inst_rcpt_dt_fr")))
						.cutoff$and(S0_T6.dlv_inst_rcpt_dt.lte(bind("dlv_inst_rcpt_dt_to")))
						.cutoff$and(S0_T1.rcpt_dt.gte(bind("rcpt_dt_fr")))
						.cutoff$and(S0_T1.rcpt_dt.lte(bind("rcpt_dt_to")))
						.cutoff$and(S0_T1.sls_usr_cd.like(bind("sls_usr_cd")))
						.cutoff$and(S0_T1.sls_dpt_cd.like(bind("sls_dpt_cd")))
						.cutoff$and(S0_M3.dpt_nm.like(bind("sls_dpt_nm")))
						.cutoff$and(S0_T1.wg_cd.like(bind("wg_cd")))
						.cutoff$and(S0_T1.trd_cd.like(bind("trd_cd")))
						.cutoff$and(S0_T1.slo_no.like(bind("slo_no")))
						.cutoff$and(S0_T2.slo_d_no.like(bind("slo_d_no")))
						.cutoff$and(S0_T1.qtn_no.like(bind("qtn_no")))
						.cutoff$and(S0_T1.qtn_rev.eq(bind("qtn_rev")))
						.cutoff$and(S0_T1.slo_typ.like(bind("slo_typ")))
						.cutoff$and(
							bracket(
								bind("ship_rqst_dt_overdue_flg_str").isNotNull()
								.and(
									MAPA_DT$F_IS_BEFORE_AFTER(
										S0_T7.ship_schd_tm,
										S0_T7.ship_rqst_tm
									).eq(value(false))
								)
							)
						)
						.cutoff$and(
							bracket(
								bind("dlv_rqst_dt_overdue_flg_str").isNotNull()
								.and(MAC_VIA_DLV_TYP$IS_NOT_VIA(nvl(S0_T7.via_dlv_typ, S0_T6.via_dlv_typ)).eq(value(true)))
								.and(
									MAPA_DT$F_IS_BEFORE_AFTER(
										S0_T7.dlv_schd_tm,
										S0_T6.dlv_rqst_tm
									).eq(value(false))
								)
							)
						)
						.cutoff$and(
							bracket(
								bind("pd_inst_dlv_dt_overdue_flg_str").isNotNull()
								.and(
									MAPA_DT$F_IS_BEFORE_AFTER(
										S0_T7.dlv_schd_tm,
										S0_T7.pd_inst_dlv_tm
									).eq(value(false))
								)
							)
						)
						.cutoff$and(
							nvl(
								S0_T7.dlv_cd,
								S0_T2.dlv_cd
							).like(bind("dlv_cd"))
						)
						.cutoff$and(
							nvl2(
								S0_T7.dlv_cd,
								nvl(
									S0_T7.dlv_nm,
									S0_M21.bp_nm
								),
								nvl(
									S0_T2.dlv_nm,
									S0_M21.bp_nm
								)
							).like(bind("dlv_nm"))
						)
						.cutoff$and(S0_T2.dest_cd1.like(bind("dest_cd1")))
						.cutoff$and(S0_T2.dest_cd2.like(bind("dest_cd2")))
						.cutoff$and(S0_T2.dest_cd3.like(bind("dest_cd3")))
						.cutoff$and(
							nvl(
								S0_T7.tdlv_cd,
								S0_T2.tdlv_cd
							).like(bind("tdlv_cd"))
						)
						.cutoff$and(
							nvl2(
								S0_T7.tdlv_cd,
								nvl(
									S0_T7.tdlv_nm,
									S0_M26.bp_nm
								),
								nvl(
									S0_T2.tdlv_nm,
									S0_M26.bp_nm
								)
							).like(bind("tdlv_nm"))
						)
						.cutoff$and(S0_T1.cst_cd.like(bind("cst_cd")))
						.cutoff$and(S0_T1.trd_cur_cd.like(bind("trd_cur_cd")))
						.cutoff$and(S0_M28.itm_typ.like(bind("itm_typ")))
						.cutoff$and(S0_M28.itm_typ_d_cd.like(bind("itm_typ_d_cd")))
						.cutoff$and(S0_T2.itm_cd.like(bind("itm_cd")))
						.cutoff$and(S0_T2.itm_sub1.like(bind("itm_sub1")))
						.cutoff$and(S0_T2.itm_sub2.like(bind("itm_sub2")))
						.cutoff$and(S0_T2.itm_sub3.like(bind("itm_sub3")))
						.cutoff$and(S0_M28.itm_nm.like(bind("itm_nm")))
						.cutoff$and(S0_T2.ver_no.like(bind("ver_no")))
						.cutoff$and(S0_T1.wrk_no.like(bind("wrk_no")))
						.cutoff$and(S0_T1.cst_po_no.like(bind("cst_po_no")))
						.cutoff$and(S0_T2.cst_po_d_no.like(bind("cst_po_d_no")))
						.cutoff$and(S0_T2.cst_itm_cd.like(bind("cst_itm_cd")))
						.cutoff$and(S0_T2.cst_itm_nm.like(bind("cst_itm_nm")))
						.cutoff$and(S0_T2.rqst_to_loc_cd.like(bind("rqst_to_loc_cd")))
						.cutoff$and(S0_T2.sppl_cd.like(bind("sppl_cd")))
						.cutoff$and(S0_T2.ship_inst_typ.like(bind("ship_inst_typ")))
						.cutoff$and(S0_T7.ship_block_flg.eq(bind("ship_block_flg_str")))
						.cutoff$and(S0_T2.gd_cd.like(bind("gd_cd")))
						.cutoff$and(S0_T2.sno1.like(bind("sno1")))
						.cutoff$and(S0_T2.sno2.like(bind("sno2")))
						.cutoff$and(S0_T2.sno3.like(bind("sno3")))
						.cutoff$and(S0_T2.sno4.like(bind("sno4")))
						.cutoff$and(S0_T2.alloc_grp_cd.like(bind("alloc_grp_cd")))
						.cutoff$and(S0_T7.ship_fr_lg_grp_cd.like(bind("ship_lg_grp_cd")))
						.cutoff$and(S0_T2.loc_cd.like(bind("loc_cd")))
						.cutoff$and(S0_T2.str_ln_cd.like(bind("str_ln_cd")))
						.cutoff$and(S0_T2.lot_no.like(bind("lot_no")))
						.cutoff$and(S0_T2.sublot_no.like(bind("sublot_no")))
						.cutoff$and(S0_T1.rcpt_usr_cd.like(bind("rcpt_usr_cd")))
						.cutoff$and(S0_T2.sls_rsn_cd.like(bind("sls_rsn_cd")))
						.cutoff$and(S0_T2.bd_dpt_cd.like(bind("bd_dpt_cd")))
						.cutoff$and(S0_M45.dpt_nm.like(bind("bd_dpt_nm")))
						.cutoff$and(S0_T1.sls_basis_typ.like(bind("sls_basis_typ")))
						.cutoff$and(S0_T2.proc_typ.like(bind("proc_typ")))
						.cutoff$and(S0_T2.alloc_typ.like(bind("alloc_typ")))
						.cutoff$and(S0_T1.aprv_no.like(bind("aprv_no")))
						.cutoff$and(S0_T1.cst_po_rmrks.like(bind("cst_po_rmrks")))
						.cutoff$and(S0_T2.cst_po_d_rmrks.like(bind("cst_po_d_rmrks")))
						.cutoff$and(S0_T1.trd_rmrks.like(bind("trd_rmrks")))
						.cutoff$and(S0_T7.trd_d_rmrks.like(bind("trd_d_rmrks")))
						.cutoff$and(S0_T1.intr_rmrks.like(bind("intr_rmrks")))
						.cutoff$and(S0_T2.intr_rmrks.like(bind("slo_d_intr_rmrks")))
						.cutoff$and(S0_T1.sub_char1.like(bind("sub_char1")))
						.cutoff$and(S0_T1.sub_char2.like(bind("sub_char2")))
						.cutoff$and(S0_T1.sub_char3.like(bind("sub_char3")))
						.cutoff$and(S0_T2.sub_char1.like(bind("slo_d_sub_char1")))
						.cutoff$and(S0_T2.sub_char2.like(bind("slo_d_sub_char2")))
						.cutoff$and(S0_T2.sub_char3.like(bind("slo_d_sub_char3")))
						.cutoff$and(S0_T7.abort_flg.eq(bind("inc_abort_flg_str")))
						.addDynamicPredicate(DS0C_CST_GRP)
						.addDynamicPredicate(DS0C_DLV_GRP)
						.addDynamicPredicate(DS0C_ITM_GRP)
					)
					.orderBy(
						S0_T1.slo_no.asc(),
						S0_T2.disp_seq.asc(),
						S0_T7.ship_schd_tm.asc()
					)
			)
			.setDynamicSQLInfo(
				when(boundOr("wrk_nm"))
					.view(v -> v.leftOuterJoin(S0_T3).on(S0_T3.wrk_no.eq(S0_T1.wrk_no)))
					.predicate(p -> p.cutoff$and(S0_T3.wrk_nm.like(bind("wrk_nm")))),
				when(boundOr("trd_nm"))
					.view(v -> v.leftOuterJoin(S0_M1).on(S0_M1.trd_cd.eq(S0_T1.trd_cd)))
					.predicate(p -> p.cutoff$and(S0_M1.trd_nm.like(bind("trd_nm")))),
				when(boundOr("sls_usr_nm"))
					.view(v -> v.leftOuterJoin(S0_M2).on(S0_M2.usr_cd.eq(S0_T1.sls_usr_cd)))
					.predicate(p -> p.cutoff$and(S0_M2.usr_nm.like(bind("sls_usr_nm")))),
				when(boundOr("wg_nm"))
					.view(v -> v.leftOuterJoin(S0_M4).on(S0_M4.wg_cd.eq(S0_T1.wg_cd)))
					.predicate(p -> p.cutoff$and(S0_M4.wg_nm.like(bind("wg_nm")))),
				when(boundOr("cst_grp_flg1", "cst_grp_flg2", "cst_grp_flg3", "cst_grp_flg4", "cst_grp_flg5", "cst_grp_flg6", "cst_grp_flg7", "cst_grp_flg8", "cst_grp_flg9", "cst_grp_flg10", "iv_trd_flg_str", "cst_nm"))
					.view(v -> v.leftOuterJoin(S0_M5).on(S0_M5.bp_cd.eq(S0_T1.cst_cd)))
					.predicate(p -> p.cutoff$and(S0_M5.cst_iv_flg.eq(bind("iv_trd_flg_str"))).cutoff$and(S0_M5.bp_nm.like(bind("cst_nm")))),
				when(boundOr("trd_cur_nm"))
					.view(v -> v.leftOuterJoin(S0_M6).on(S0_M6.cur_cd.eq(S0_T1.trd_cur_cd)))
					.predicate(p -> p.cutoff$and(S0_M6.cur_nm.like(bind("trd_cur_nm")))),
				when(boundOr("rcpt_usr_nm"))
					.view(v -> v.leftOuterJoin(S0_M19).on(S0_M19.usr_cd.eq(S0_T1.rcpt_usr_cd)))
					.predicate(p -> p.cutoff$and(S0_M19.usr_nm.like(bind("rcpt_usr_nm")))),
				when(boundOr("dest_nm1"))
					.view(v -> v.leftOuterJoin(S0_M23).on(S0_M23.bp_cd.eq(S0_T2.dest_cd1)))
					.predicate(p -> p.cutoff$and(S0_M23.bp_nm.like(bind("dest_nm1")))),
				when(boundOr("dest_nm2"))
					.view(v -> v.leftOuterJoin(S0_M24).on(S0_M24.bp_cd.eq(S0_T2.dest_cd2)))
					.predicate(p -> p.cutoff$and(S0_M24.bp_nm.like(bind("dest_nm2")))),
				when(boundOr("dest_nm3"))
					.view(v -> v.leftOuterJoin(S0_M25).on(S0_M25.bp_cd.eq(S0_T2.dest_cd3)))
					.predicate(p -> p.cutoff$and(S0_M25.bp_nm.like(bind("dest_nm3")))),
				when(boundOr("gd_nm"))
					.view(v -> v.leftOuterJoin(S0_M34).on(S0_M34.gd_cd.eq(S0_T2.gd_cd)))
					.predicate(p -> p.cutoff$and(S0_M34.gd_nm.like(bind("gd_nm")))),
				when(boundOr("rqst_to_loc_nm"))
					.view(v -> v.leftOuterJoin(S0_M35).on(S0_M35.loc_cd.eq(S0_T2.rqst_to_loc_cd)))
					.predicate(p -> p.cutoff$and(S0_M35.loc_nm.like(bind("rqst_to_loc_nm")))),
				when(boundOr("sppl_nm"))
					.view(v -> v.leftOuterJoin(S0_M36).on(S0_M36.bp_cd.eq(S0_T2.sppl_cd)))
					.predicate(p -> p.cutoff$and(S0_M36.bp_nm.like(bind("sppl_nm")))),
				when(boundOr("alloc_grp_nm"))
					.view(v -> v.leftOuterJoin(S0_M38).on(S0_M38.alloc_grp_cd.eq(S0_T2.alloc_grp_cd)))
					.predicate(p -> p.cutoff$and(S0_M38.alloc_grp_nm.like(bind("alloc_grp_nm")))),
				when(boundOr("ship_lg_grp_nm"))
					.view(v -> v.leftOuterJoin(S0_M39).on(S0_M39.lg_grp_cd.eq(S0_T7.ship_fr_lg_grp_cd)))
					.predicate(p -> p.cutoff$and(S0_M39.lg_grp_nm.like(bind("ship_lg_grp_nm")))),
				when(boundOr("loc_nm"))
					.view(v -> v.leftOuterJoin(S0_M41).on(S0_M41.loc_cd.eq(S0_T2.loc_cd)))
					.predicate(p -> p.cutoff$and(S0_M41.loc_nm.like(bind("loc_nm")))),
				when(boundOr("str_ln_nm"))
					.view(v -> v.leftOuterJoin(S0_M42).on(S0_M42.str_ln_cd.eq(S0_T2.str_ln_cd).and(S0_M42.loc_cd.eq(S0_T2.loc_cd))))
					.predicate(p -> p.cutoff$and(S0_M42.str_ln_nm.like(bind("str_ln_nm")))),
				when(boundOr("sls_rsn_nm"))
					.view(v -> v.leftOuterJoin(S0_M44).on(S0_M44.biz_rsn_cd.eq(S0_T2.sls_rsn_cd)))
					.predicate(p -> p.cutoff$and(S0_M44.biz_rsn_nm.like(bind("sls_rsn_nm")))),
				when(boundOr("itm_typ_d_nm"))
					.view(v -> v.leftOuterJoin(S0_M49).on(S0_M49.itm_typ.eq(S0_M28.itm_typ).and(S0_M49.itm_typ_d_cd.eq(S0_M28.itm_typ_d_cd))))
					.predicate(p -> p.cutoff$and(S0_M49.itm_typ_d_nm.like(bind("itm_typ_d_nm")))),
				when(boundOr("cst_grp_flg1"))
					.select(DS0C_CST_GRP, S0_M5.bp_grp_cd1.as("cst_grp_cd1"), S0_MMC1.bp_grp_nm.as("cst_grp_nm1"))
					.view(DS0C_CST_GRP, v -> v.leftOuterJoin(S0_MMC1).on(S0_M5.bp_grp_cd1.eq(S0_MMC1.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP1.value()).eq(S0_MMC1.bp_grp_typ))))
					.predicate(DS0C_CST_GRP, p -> p.cutoff$and(S0_M5.bp_grp_cd1.like(bind("cst_grp_cd1"))).cutoff$and(S0_MMC1.bp_grp_nm.like(bind("cst_grp_nm1")))),
				when(boundOr("cst_grp_flg2"))
					.select(DS0C_CST_GRP, S0_M5.bp_grp_cd2.as("cst_grp_cd2"), S0_MMC2.bp_grp_nm.as("cst_grp_nm2"))
					.view(DS0C_CST_GRP, v -> v.leftOuterJoin(S0_MMC2).on(S0_M5.bp_grp_cd2.eq(S0_MMC2.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP2.value()).eq(S0_MMC2.bp_grp_typ))))
					.predicate(DS0C_CST_GRP, p -> p.cutoff$and(S0_M5.bp_grp_cd2.like(bind("cst_grp_cd2"))).cutoff$and(S0_MMC2.bp_grp_nm.like(bind("cst_grp_nm2")))),
				when(boundOr("cst_grp_flg3"))
					.select(DS0C_CST_GRP, S0_M5.bp_grp_cd3.as("cst_grp_cd3"), S0_MMC3.bp_grp_nm.as("cst_grp_nm3"))
					.view(DS0C_CST_GRP, v -> v.leftOuterJoin(S0_MMC3).on(S0_M5.bp_grp_cd3.eq(S0_MMC3.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP3.value()).eq(S0_MMC3.bp_grp_typ))))
					.predicate(DS0C_CST_GRP, p -> p.cutoff$and(S0_M5.bp_grp_cd3.like(bind("cst_grp_cd3"))).cutoff$and(S0_MMC3.bp_grp_nm.like(bind("cst_grp_nm3")))),
				when(boundOr("cst_grp_flg4"))
					.select(DS0C_CST_GRP, S0_M5.bp_grp_cd4.as("cst_grp_cd4"), S0_MMC4.bp_grp_nm.as("cst_grp_nm4"))
					.view(DS0C_CST_GRP, v -> v.leftOuterJoin(S0_MMC4).on(S0_M5.bp_grp_cd4.eq(S0_MMC4.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP4.value()).eq(S0_MMC4.bp_grp_typ))))
					.predicate(DS0C_CST_GRP, p -> p.cutoff$and(S0_M5.bp_grp_cd4.like(bind("cst_grp_cd4"))).cutoff$and(S0_MMC4.bp_grp_nm.like(bind("cst_grp_nm4")))),
				when(boundOr("cst_grp_flg5"))
					.select(DS0C_CST_GRP, S0_M5.bp_grp_cd5.as("cst_grp_cd5"), S0_MMC5.bp_grp_nm.as("cst_grp_nm5"))
					.view(DS0C_CST_GRP, v -> v.leftOuterJoin(S0_MMC5).on(S0_M5.bp_grp_cd5.eq(S0_MMC5.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP5.value()).eq(S0_MMC5.bp_grp_typ))))
					.predicate(DS0C_CST_GRP, p -> p.cutoff$and(S0_M5.bp_grp_cd5.like(bind("cst_grp_cd5"))).cutoff$and(S0_MMC5.bp_grp_nm.like(bind("cst_grp_nm5")))),
				when(boundOr("cst_grp_flg6"))
					.select(DS0C_CST_GRP, S0_M5.bp_grp_cd6.as("cst_grp_cd6"), S0_MMC6.bp_grp_nm.as("cst_grp_nm6"))
					.view(DS0C_CST_GRP, v -> v.leftOuterJoin(S0_MMC6).on(S0_M5.bp_grp_cd6.eq(S0_MMC6.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP6.value()).eq(S0_MMC6.bp_grp_typ))))
					.predicate(DS0C_CST_GRP, p -> p.cutoff$and(S0_M5.bp_grp_cd6.like(bind("cst_grp_cd6"))).cutoff$and(S0_MMC6.bp_grp_nm.like(bind("cst_grp_nm6")))),
				when(boundOr("cst_grp_flg7"))
					.select(DS0C_CST_GRP, S0_M5.bp_grp_cd7.as("cst_grp_cd7"), S0_MMC7.bp_grp_nm.as("cst_grp_nm7"))
					.view(DS0C_CST_GRP, v -> v.leftOuterJoin(S0_MMC7).on(S0_M5.bp_grp_cd7.eq(S0_MMC7.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP7.value()).eq(S0_MMC7.bp_grp_typ))))
					.predicate(DS0C_CST_GRP, p -> p.cutoff$and(S0_M5.bp_grp_cd7.like(bind("cst_grp_cd7"))).cutoff$and(S0_MMC7.bp_grp_nm.like(bind("cst_grp_nm7")))),
				when(boundOr("cst_grp_flg8"))
					.select(DS0C_CST_GRP, S0_M5.bp_grp_cd8.as("cst_grp_cd8"), S0_MMC8.bp_grp_nm.as("cst_grp_nm8"))
					.view(DS0C_CST_GRP, v -> v.leftOuterJoin(S0_MMC8).on(S0_M5.bp_grp_cd8.eq(S0_MMC8.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP8.value()).eq(S0_MMC8.bp_grp_typ))))
					.predicate(DS0C_CST_GRP, p -> p.cutoff$and(S0_M5.bp_grp_cd8.like(bind("cst_grp_cd8"))).cutoff$and(S0_MMC8.bp_grp_nm.like(bind("cst_grp_nm8")))),
				when(boundOr("cst_grp_flg9"))
					.select(DS0C_CST_GRP, S0_M5.bp_grp_cd9.as("cst_grp_cd9"), S0_MMC9.bp_grp_nm.as("cst_grp_nm9"))
					.view(DS0C_CST_GRP, v -> v.leftOuterJoin(S0_MMC9).on(S0_M5.bp_grp_cd9.eq(S0_MMC9.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP9.value()).eq(S0_MMC9.bp_grp_typ))))
					.predicate(DS0C_CST_GRP, p -> p.cutoff$and(S0_M5.bp_grp_cd9.like(bind("cst_grp_cd9"))).cutoff$and(S0_MMC9.bp_grp_nm.like(bind("cst_grp_nm9")))),
				when(boundOr("cst_grp_flg10"))
					.select(DS0C_CST_GRP, S0_M5.bp_grp_cd10.as("cst_grp_cd10"), S0_MMC10.bp_grp_nm.as("cst_grp_nm10"))
					.view(DS0C_CST_GRP, v -> v.leftOuterJoin(S0_MMC10).on(S0_M5.bp_grp_cd10.eq(S0_MMC10.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP10.value()).eq(S0_MMC10.bp_grp_typ))))
					.predicate(DS0C_CST_GRP, p -> p.cutoff$and(S0_M5.bp_grp_cd10.like(bind("cst_grp_cd10"))).cutoff$and(S0_MMC10.bp_grp_nm.like(bind("cst_grp_nm10")))),
				when(boundOr("dlv_grp_flg1"))
					.select(DS0C_DLV_GRP, S0_M21.bp_grp_cd1.as("dlv_grp_cd1"), S0_MMD1.bp_grp_nm.as("dlv_grp_nm1"))
					.view(DS0C_DLV_GRP, v -> v.leftOuterJoin(S0_MMD1).on(S0_M21.bp_grp_cd1.eq(S0_MMD1.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP1.value()).eq(S0_MMD1.bp_grp_typ))))
					.predicate(DS0C_DLV_GRP, p -> p.cutoff$and(S0_M21.bp_grp_cd1.like(bind("dlv_grp_cd1"))).cutoff$and(S0_MMD1.bp_grp_nm.like(bind("dlv_grp_nm1")))),
				when(boundOr("dlv_grp_flg2"))
					.select(DS0C_DLV_GRP, S0_M21.bp_grp_cd2.as("dlv_grp_cd2"), S0_MMD2.bp_grp_nm.as("dlv_grp_nm2"))
					.view(DS0C_DLV_GRP, v -> v.leftOuterJoin(S0_MMD2).on(S0_M21.bp_grp_cd2.eq(S0_MMD2.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP2.value()).eq(S0_MMD2.bp_grp_typ))))
					.predicate(DS0C_DLV_GRP, p -> p.cutoff$and(S0_M21.bp_grp_cd2.like(bind("dlv_grp_cd2"))).cutoff$and(S0_MMD2.bp_grp_nm.like(bind("dlv_grp_nm2")))),
				when(boundOr("dlv_grp_flg3"))
					.select(DS0C_DLV_GRP, S0_M21.bp_grp_cd3.as("dlv_grp_cd3"), S0_MMD3.bp_grp_nm.as("dlv_grp_nm3"))
					.view(DS0C_DLV_GRP, v -> v.leftOuterJoin(S0_MMD3).on(S0_M21.bp_grp_cd3.eq(S0_MMD3.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP3.value()).eq(S0_MMD3.bp_grp_typ))))
					.predicate(DS0C_DLV_GRP, p -> p.cutoff$and(S0_M21.bp_grp_cd3.like(bind("dlv_grp_cd3"))).cutoff$and(S0_MMD3.bp_grp_nm.like(bind("dlv_grp_nm3")))),
				when(boundOr("dlv_grp_flg4"))
					.select(DS0C_DLV_GRP, S0_M21.bp_grp_cd4.as("dlv_grp_cd4"), S0_MMD4.bp_grp_nm.as("dlv_grp_nm4"))
					.view(DS0C_DLV_GRP, v -> v.leftOuterJoin(S0_MMD4).on(S0_M21.bp_grp_cd4.eq(S0_MMD4.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP4.value()).eq(S0_MMD4.bp_grp_typ))))
					.predicate(DS0C_DLV_GRP, p -> p.cutoff$and(S0_M21.bp_grp_cd4.like(bind("dlv_grp_cd4"))).cutoff$and(S0_MMD4.bp_grp_nm.like(bind("dlv_grp_nm4")))),
				when(boundOr("dlv_grp_flg5"))
					.select(DS0C_DLV_GRP, S0_M21.bp_grp_cd5.as("dlv_grp_cd5"), S0_MMD5.bp_grp_nm.as("dlv_grp_nm5"))
					.view(DS0C_DLV_GRP, v -> v.leftOuterJoin(S0_MMD5).on(S0_M21.bp_grp_cd5.eq(S0_MMD5.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP5.value()).eq(S0_MMD5.bp_grp_typ))))
					.predicate(DS0C_DLV_GRP, p -> p.cutoff$and(S0_M21.bp_grp_cd5.like(bind("dlv_grp_cd5"))).cutoff$and(S0_MMD5.bp_grp_nm.like(bind("dlv_grp_nm5")))),
				when(boundOr("dlv_grp_flg6"))
					.select(DS0C_DLV_GRP, S0_M21.bp_grp_cd6.as("dlv_grp_cd6"), S0_MMD6.bp_grp_nm.as("dlv_grp_nm6"))
					.view(DS0C_DLV_GRP, v -> v.leftOuterJoin(S0_MMD6).on(S0_M21.bp_grp_cd6.eq(S0_MMD6.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP6.value()).eq(S0_MMD6.bp_grp_typ))))
					.predicate(DS0C_DLV_GRP, p -> p.cutoff$and(S0_M21.bp_grp_cd6.like(bind("dlv_grp_cd6"))).cutoff$and(S0_MMD6.bp_grp_nm.like(bind("dlv_grp_nm6")))),
				when(boundOr("dlv_grp_flg7"))
					.select(DS0C_DLV_GRP, S0_M21.bp_grp_cd7.as("dlv_grp_cd7"), S0_MMD7.bp_grp_nm.as("dlv_grp_nm7"))
					.view(DS0C_DLV_GRP, v -> v.leftOuterJoin(S0_MMD7).on(S0_M21.bp_grp_cd7.eq(S0_MMD7.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP7.value()).eq(S0_MMD7.bp_grp_typ))))
					.predicate(DS0C_DLV_GRP, p -> p.cutoff$and(S0_M21.bp_grp_cd7.like(bind("dlv_grp_cd7"))).cutoff$and(S0_MMD7.bp_grp_nm.like(bind("dlv_grp_nm7")))),
				when(boundOr("dlv_grp_flg8"))
					.select(DS0C_DLV_GRP, S0_M21.bp_grp_cd8.as("dlv_grp_cd8"), S0_MMD8.bp_grp_nm.as("dlv_grp_nm8"))
					.view(DS0C_DLV_GRP, v -> v.leftOuterJoin(S0_MMD8).on(S0_M21.bp_grp_cd8.eq(S0_MMD8.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP8.value()).eq(S0_MMD8.bp_grp_typ))))
					.predicate(DS0C_DLV_GRP, p -> p.cutoff$and(S0_M21.bp_grp_cd8.like(bind("dlv_grp_cd8"))).cutoff$and(S0_MMD8.bp_grp_nm.like(bind("dlv_grp_nm8")))),
				when(boundOr("dlv_grp_flg9"))
					.select(DS0C_DLV_GRP, S0_M21.bp_grp_cd9.as("dlv_grp_cd9"), S0_MMD9.bp_grp_nm.as("dlv_grp_nm9"))
					.view(DS0C_DLV_GRP, v -> v.leftOuterJoin(S0_MMD9).on(S0_M21.bp_grp_cd9.eq(S0_MMD9.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP9.value()).eq(S0_MMD9.bp_grp_typ))))
					.predicate(DS0C_DLV_GRP, p -> p.cutoff$and(S0_M21.bp_grp_cd9.like(bind("dlv_grp_cd9"))).cutoff$and(S0_MMD9.bp_grp_nm.like(bind("dlv_grp_nm9")))),
				when(boundOr("dlv_grp_flg10"))
					.select(DS0C_DLV_GRP, S0_M21.bp_grp_cd10.as("dlv_grp_cd10"), S0_MMD10.bp_grp_nm.as("dlv_grp_nm10"))
					.view(DS0C_DLV_GRP, v -> v.leftOuterJoin(S0_MMD10).on(S0_M21.bp_grp_cd10.eq(S0_MMD10.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP10.value()).eq(S0_MMD10.bp_grp_typ))))
					.predicate(DS0C_DLV_GRP, p -> p.cutoff$and(S0_M21.bp_grp_cd10.like(bind("dlv_grp_cd10"))).cutoff$and(S0_MMD10.bp_grp_nm.like(bind("dlv_grp_nm10")))),
				when(boundOr("itm_grp_flg1"))
					.select(DS0C_ITM_GRP, S0_M28.itm_grp_cd1.as("itm_grp_cd1"), S0_MMI1.itm_grp_nm.as("itm_grp_nm1"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MMI1).on(S0_M28.itm_grp_cd1.eq(S0_MMI1.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP1.value()).eq(S0_MMI1.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M28.itm_grp_cd1.like(bind("itm_grp_cd1"))).cutoff$and(S0_MMI1.itm_grp_nm.like(bind("itm_grp_nm1")))),
				when(boundOr("itm_grp_flg2"))
					.select(DS0C_ITM_GRP, S0_M28.itm_grp_cd2.as("itm_grp_cd2"), S0_MMI2.itm_grp_nm.as("itm_grp_nm2"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MMI2).on(S0_M28.itm_grp_cd2.eq(S0_MMI2.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP2.value()).eq(S0_MMI2.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M28.itm_grp_cd2.like(bind("itm_grp_cd2"))).cutoff$and(S0_MMI2.itm_grp_nm.like(bind("itm_grp_nm2")))),
				when(boundOr("itm_grp_flg3"))
					.select(DS0C_ITM_GRP, S0_M28.itm_grp_cd3.as("itm_grp_cd3"), S0_MMI3.itm_grp_nm.as("itm_grp_nm3"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MMI3).on(S0_M28.itm_grp_cd3.eq(S0_MMI3.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP3.value()).eq(S0_MMI3.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M28.itm_grp_cd3.like(bind("itm_grp_cd3"))).cutoff$and(S0_MMI3.itm_grp_nm.like(bind("itm_grp_nm3")))),
				when(boundOr("itm_grp_flg4"))
					.select(DS0C_ITM_GRP, S0_M28.itm_grp_cd4.as("itm_grp_cd4"), S0_MMI4.itm_grp_nm.as("itm_grp_nm4"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MMI4).on(S0_M28.itm_grp_cd4.eq(S0_MMI4.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP4.value()).eq(S0_MMI4.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M28.itm_grp_cd4.like(bind("itm_grp_cd4"))).cutoff$and(S0_MMI4.itm_grp_nm.like(bind("itm_grp_nm4")))),
				when(boundOr("itm_grp_flg5"))
					.select(DS0C_ITM_GRP, S0_M28.itm_grp_cd5.as("itm_grp_cd5"), S0_MMI5.itm_grp_nm.as("itm_grp_nm5"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MMI5).on(S0_M28.itm_grp_cd5.eq(S0_MMI5.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP5.value()).eq(S0_MMI5.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M28.itm_grp_cd5.like(bind("itm_grp_cd5"))).cutoff$and(S0_MMI5.itm_grp_nm.like(bind("itm_grp_nm5")))),
				when(boundOr("itm_grp_flg6"))
					.select(DS0C_ITM_GRP, S0_M28.itm_grp_cd6.as("itm_grp_cd6"), S0_MMI6.itm_grp_nm.as("itm_grp_nm6"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MMI6).on(S0_M28.itm_grp_cd6.eq(S0_MMI6.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP6.value()).eq(S0_MMI6.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M28.itm_grp_cd6.like(bind("itm_grp_cd6"))).cutoff$and(S0_MMI6.itm_grp_nm.like(bind("itm_grp_nm6")))),
				when(boundOr("itm_grp_flg7"))
					.select(DS0C_ITM_GRP, S0_M28.itm_grp_cd7.as("itm_grp_cd7"), S0_MMI7.itm_grp_nm.as("itm_grp_nm7"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MMI7).on(S0_M28.itm_grp_cd7.eq(S0_MMI7.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP7.value()).eq(S0_MMI7.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M28.itm_grp_cd7.like(bind("itm_grp_cd7"))).cutoff$and(S0_MMI7.itm_grp_nm.like(bind("itm_grp_nm7")))),
				when(boundOr("itm_grp_flg8"))
					.select(DS0C_ITM_GRP, S0_M28.itm_grp_cd8.as("itm_grp_cd8"), S0_MMI8.itm_grp_nm.as("itm_grp_nm8"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MMI8).on(S0_M28.itm_grp_cd8.eq(S0_MMI8.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP8.value()).eq(S0_MMI8.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M28.itm_grp_cd8.like(bind("itm_grp_cd8"))).cutoff$and(S0_MMI8.itm_grp_nm.like(bind("itm_grp_nm8")))),
				when(boundOr("itm_grp_flg9"))
					.select(DS0C_ITM_GRP, S0_M28.itm_grp_cd9.as("itm_grp_cd9"), S0_MMI9.itm_grp_nm.as("itm_grp_nm9"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MMI9).on(S0_M28.itm_grp_cd9.eq(S0_MMI9.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP9.value()).eq(S0_MMI9.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M28.itm_grp_cd9.like(bind("itm_grp_cd9"))).cutoff$and(S0_MMI9.itm_grp_nm.like(bind("itm_grp_nm9")))),
				when(boundOr("itm_grp_flg10"))
					.select(DS0C_ITM_GRP, S0_M28.itm_grp_cd10.as("itm_grp_cd10"), S0_MMI10.itm_grp_nm.as("itm_grp_nm10"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MMI10).on(S0_M28.itm_grp_cd10.eq(S0_MMI10.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP10.value()).eq(S0_MMI10.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M28.itm_grp_cd10.like(bind("itm_grp_cd10"))).cutoff$and(S0_MMI10.itm_grp_nm.like(bind("itm_grp_nm10"))))
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
						.add(MAM_BP_R.class, r -> toCondition(
							r.getStringNE("cst_cd")
						))
						.addSelect(m -> toArray(
							m.acst_cd,
							m.bp_nm,
							m.cst_iv_flg
						))
						.addMap((r, m) -> {
							r.setStringNE("cst_nm", m.bp_nm());
							r.setStringNE("acst_cd", m.acst_cd());
							r.setBooleanNE("cst_iv_flg", m.cst_iv_flg());
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
						))
						.addMap((r, m) -> {
							r.setNumberNE("trd_unit_dec_place", m.dec_place());
							r.setNumberNE("trd_unit_conv_base_qty", m.conv_base_qty());
							r.setNumberNE("trd_unit_conv_qty", m.conv_qty());
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
							m.tax_nm,
							m.tax_rate
						))
						.addMap((r, m) -> {
							r.setStringNE("tax_nm", m.tax_nm());
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
							m.biz_rsn_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("sls_rsn_nm", m.biz_rsn_nm());
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
					}),
					j -> j
						.add(MAM_SHIP_WK_R.class, r -> toCondition(
							r.getStringNE("ship_wk_cd")
						))
						.addSelect(m -> toArray(
							m.ship_wk_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("ship_wk_nm", m.ship_wk_nm());
					})
				)
			);
	}
	
	/**
	 * -- MSBBL1220_MST_SHIP_SCHD_Query_S02
	 */
	static MCQueryPlan MSBBL1220_MST_SHIP_SCHD_S02() {
		MST_SHIP_SCHD_R S0_T1 = MST_SHIP_SCHD_R.create("T1");
		MST_SHIP_PR_R S0_T2 = MST_SHIP_PR_R.create("T2");
		MSW_SLO_D_KEY_R S0_W1 = MSW_SLO_D_KEY_R.create("W1");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBBL1220_MST_SHIP_SCHD_Query_S02")
					.mainQuery()
					.select(
						S0_W1.slo_d_no,
						sum(S0_T1.alloc_qty).as("alloc_qty"),
						sum(S0_T1.wait_qty).as("wait_qty"),
						max(S0_T1.ship_block_flg).as("ship_block_flg")
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
	 * -- MSBBL1220_MST_SHIP_SCHD_Query_S03
	 */
	static MCQueryPlan MSBBL1220_MST_SHIP_SCHD_S03() {
		MST_SHIP_SCHD_R S0_T1 = MST_SHIP_SCHD_R.create("T1");
		MST_SHIP_PR_R S0_T2 = MST_SHIP_PR_R.create("T2");
		MSW_SLO_D_KEY_R S0_W1 = MSW_SLO_D_KEY_R.create("W1");
		MST_WG_RQST_R S1_ST1 = MST_WG_RQST_R.create("ST1");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBBL1220_MST_SHIP_SCHD_Query_S03")
					.mainQuery()
					.select(
						S0_T2.slo_d_no,
						S0_T1.ship_schd_tm.as("dt"),
						sum(S0_T1.base_unit_qty).as("ship_schd_qty"),
						sum(S0_T1.ship_act_qty).as("ship_act_qty")
					)
					.from(
						S0_T1
						.innerJoin(S0_T2).on(S0_T2.ship_pr_no.eq(S0_T1.ship_pr_no))
						.innerJoin(S0_W1).on(S0_W1.slo_d_no.eq(S0_T2.slo_d_no))
					)
					.where(
						value(0).eq(value(0))
						.and(S0_T1.abort_flg.eq(value(false)))
						.and(
							exists(
								subQuery()
								.select(value("X"))
								.from(S1_ST1)
								.where(
									value(0).eq(value(0))
									.and(S1_ST1.can_flg.eq(value(false)))
									.and(
										S1_ST1.wg_rqst_typ.in(
											value(MSC_WG_RQST_TYP.PURC.value()),
											value(MSC_WG_RQST_TYP.XFR.value())
										)
									)
									.and(S1_ST1.slo_d_no.eq(S0_T2.slo_d_no))
								)
							)
						)
					)
					.groupBy(
						S0_T2.slo_d_no,
						S0_T1.ship_schd_tm
					)
			);
	}
	
	/**
	 * -- MSBBL1220_MST_SLO_D_Query_S01
	 */
	static MCQueryPlan MSBBL1220_MST_SLO_D_S01() {
		MST_SLO_R S0_T1 = MST_SLO_R.create("T1");
		MST_SLO_D_R S0_T2 = MST_SLO_D_R.create("T2");
		MST_WRK_R S0_T3 = MST_WRK_R.create("T3");
		MST_SLS_ITM_R S0_T4 = MST_SLS_ITM_R.create("T4");
		MST_SLS_ITM_SPEC_R S0_T5 = MST_SLS_ITM_SPEC_R.create("T5");
		MST_SHIP_PR_R S0_T6 = MST_SHIP_PR_R.create("T6");
		MST_SIM_PRMS_RSLT_R S0_T7 = MST_SIM_PRMS_RSLT_R.create("T7");
		MAM_TRD_R S0_M1 = MAM_TRD_R.create("M1");
		MAM_USR_R S0_M2 = MAM_USR_R.create("M2");
		MAM_DPT_R S0_M3 = MAM_DPT_R.create("M3");
		MAM_WG_R S0_M4 = MAM_WG_R.create("M4");
		MAM_BP_R S0_M5 = MAM_BP_R.create("M5");
		MAM_CUR_R S0_M6 = MAM_CUR_R.create("M6");
		MAM_CO_R S0_M7 = MAM_CO_R.create("M7");
		MAM_DPT_R S0_M11 = MAM_DPT_R.create("M11");
		MAM_USR_R S0_M19 = MAM_USR_R.create("M19");
		MST_SLO_RSN_R S0_M20 = MST_SLO_RSN_R.create("M20");
		MAM_BP_R S0_M21 = MAM_BP_R.create("M21");
		MAM_BP_R S0_M23 = MAM_BP_R.create("M23");
		MAM_BP_R S0_M24 = MAM_BP_R.create("M24");
		MAM_BP_R S0_M25 = MAM_BP_R.create("M25");
		MAM_BP_R S0_M26 = MAM_BP_R.create("M26");
		MAM_ITM_R S0_M28 = MAM_ITM_R.create("M28");
		MAM_STK_GD_R S0_M34 = MAM_STK_GD_R.create("M34");
		MAM_LOC_R S0_M35 = MAM_LOC_R.create("M35");
		MAM_BP_R S0_M36 = MAM_BP_R.create("M36");
		MAM_ALLOC_GRP_R S0_M38 = MAM_ALLOC_GRP_R.create("M38");
		MAM_LG_GRP_R S0_M39 = MAM_LG_GRP_R.create("M39");
		MAM_LOC_R S0_M41 = MAM_LOC_R.create("M41");
		MAM_STR_LN_R S0_M42 = MAM_STR_LN_R.create("M42");
		MAM_BIZ_RSN_R S0_M44 = MAM_BIZ_RSN_R.create("M44");
		MAM_DPT_R S0_M45 = MAM_DPT_R.create("M45");
		MST_SLO_RSN_R S0_M46 = MST_SLO_RSN_R.create("M46");
		MAM_ITM_TYP_D_R S0_M49 = MAM_ITM_TYP_D_R.create("M49");
		MAM_ITM_LCL_R S0_M54 = MAM_ITM_LCL_R.create("M54");
		MAVM_RD_DPT_R S0_DAC = MAVM_RD_DPT_R.create("DAC");
		MAM_BP_GRP_R S0_MMC1 = MAM_BP_GRP_R.create("MMC1");
		MAM_BP_GRP_R S0_MMC2 = MAM_BP_GRP_R.create("MMC2");
		MAM_BP_GRP_R S0_MMC3 = MAM_BP_GRP_R.create("MMC3");
		MAM_BP_GRP_R S0_MMC4 = MAM_BP_GRP_R.create("MMC4");
		MAM_BP_GRP_R S0_MMC5 = MAM_BP_GRP_R.create("MMC5");
		MAM_BP_GRP_R S0_MMC6 = MAM_BP_GRP_R.create("MMC6");
		MAM_BP_GRP_R S0_MMC7 = MAM_BP_GRP_R.create("MMC7");
		MAM_BP_GRP_R S0_MMC8 = MAM_BP_GRP_R.create("MMC8");
		MAM_BP_GRP_R S0_MMC9 = MAM_BP_GRP_R.create("MMC9");
		MAM_BP_GRP_R S0_MMC10 = MAM_BP_GRP_R.create("MMC10");
		MAM_BP_GRP_R S0_MMD1 = MAM_BP_GRP_R.create("MMD1");
		MAM_BP_GRP_R S0_MMD2 = MAM_BP_GRP_R.create("MMD2");
		MAM_BP_GRP_R S0_MMD3 = MAM_BP_GRP_R.create("MMD3");
		MAM_BP_GRP_R S0_MMD4 = MAM_BP_GRP_R.create("MMD4");
		MAM_BP_GRP_R S0_MMD5 = MAM_BP_GRP_R.create("MMD5");
		MAM_BP_GRP_R S0_MMD6 = MAM_BP_GRP_R.create("MMD6");
		MAM_BP_GRP_R S0_MMD7 = MAM_BP_GRP_R.create("MMD7");
		MAM_BP_GRP_R S0_MMD8 = MAM_BP_GRP_R.create("MMD8");
		MAM_BP_GRP_R S0_MMD9 = MAM_BP_GRP_R.create("MMD9");
		MAM_BP_GRP_R S0_MMD10 = MAM_BP_GRP_R.create("MMD10");
		MAM_ITM_GRP_R S0_MMI1 = MAM_ITM_GRP_R.create("MMI1");
		MAM_ITM_GRP_R S0_MMI2 = MAM_ITM_GRP_R.create("MMI2");
		MAM_ITM_GRP_R S0_MMI3 = MAM_ITM_GRP_R.create("MMI3");
		MAM_ITM_GRP_R S0_MMI4 = MAM_ITM_GRP_R.create("MMI4");
		MAM_ITM_GRP_R S0_MMI5 = MAM_ITM_GRP_R.create("MMI5");
		MAM_ITM_GRP_R S0_MMI6 = MAM_ITM_GRP_R.create("MMI6");
		MAM_ITM_GRP_R S0_MMI7 = MAM_ITM_GRP_R.create("MMI7");
		MAM_ITM_GRP_R S0_MMI8 = MAM_ITM_GRP_R.create("MMI8");
		MAM_ITM_GRP_R S0_MMI9 = MAM_ITM_GRP_R.create("MMI9");
		MAM_ITM_GRP_R S0_MMI10 = MAM_ITM_GRP_R.create("MMI10");
		MST_SHIP_SCHD_R S1_ST11 = MST_SHIP_SCHD_R.create("ST11");
		MST_SHIP_SCHD_R S2_ST21 = MST_SHIP_SCHD_R.create("ST21");
		MST_SHIP_SCHD_R S3_ST22 = MST_SHIP_SCHD_R.create("ST22");
		MST_SHIP_SCHD_R S4_ST31 = MST_SHIP_SCHD_R.create("ST31");
		MST_SHIP_SCHD_R S5_ST32 = MST_SHIP_SCHD_R.create("ST32");
		MST_SHIP_SCHD_R S6_ST41 = MST_SHIP_SCHD_R.create("ST41");
		
		MCDynamicSQLID DS0C_CST_GRP = createDynamicSQLID("DS0C_CST_GRP");
		MCDynamicSQLID DS0C_DLV_GRP = createDynamicSQLID("DS0C_DLV_GRP");
		MCDynamicSQLID DS0C_ITM_GRP = createDynamicSQLID("DS0C_ITM_GRP");
		
		// 副問い合わせ群
		MCSubQuery S0_T4_itm_comp_rev_no = subQuery().select(S0_T4.itm_comp_rev_no).from(S0_T4).where(
				bracket(
						value(0).eq(value(0))
						.and(S0_T4.sls_itm_no.eq(S0_T2.sls_itm_no))
						));
		
		MCSubQuery S0_T5_sls_itm_spec_no = subQuery().select(S0_T5.sls_itm_spec_no).from(S0_T5).where(
				bracket(
						value(0).eq(value(0))
						.and(S0_T5.sls_itm_no.eq(S0_T2.sls_itm_no))
						));
		
		MCSubQuery S0_T5_sub_char1 = subQuery().select(S0_T5.sub_char1).from(S0_T5).where(
				bracket(
						value(0).eq(value(0))
						.and(S0_T5.sls_itm_no.eq(S0_T2.sls_itm_no))
						));
		
		MCSubQuery S0_T5_sub_char2 = subQuery().select(S0_T5.sub_char2).from(S0_T5).where(
				bracket(
						value(0).eq(value(0))
						.and(S0_T5.sls_itm_no.eq(S0_T2.sls_itm_no))
						));
		
		MCSubQuery S0_T5_sub_char3 = subQuery().select(S0_T5.sub_char3).from(S0_T5).where(
				bracket(
						value(0).eq(value(0))
						.and(S0_T5.sls_itm_no.eq(S0_T2.sls_itm_no))
						));
		
		MCTempView V = createTempView("V");
		MCSubQuery S0_T7_sim_alloc_pln_typ = subQuery().select(V.pr(S0_T7.sim_alloc_pln_typ))
				.from(subQuery()
						.select(S0_T7.sim_alloc_pln_typ,
								S0_T7.slo_d_no,
								rowNumber()
									.over()
									.partitionBy(S0_T7.slo_d_no)
									.orderBy(
										cases()
											.when(S0_T7.sim_alloc_pln_typ.eq(value(MSC_SIM_ALLOC_PLN_TYP.PST_ORD_ALLOC.value())))
												.then(value(1))
											.when(S0_T7.sim_alloc_pln_typ.eq(value(MSC_SIM_ALLOC_PLN_TYP.ORD_ALLOC.value())))
												.then(value(2))
											.otherwise(value(3)).asc()
									).as("rnum"))
						.from(S0_T7).view(V))
				.where(bracket(value(0).eq(value(0)).and(V.pr(S0_T7.slo_d_no).eq(S0_T2.slo_d_no))
						.and(V.pr("rnum").eq(value(1)))));
		
		MCSubQuery S0_M3_dpt_nm = subQuery().select(S0_M3.dpt_nm).from(S0_M3).where(
				bracket(
						value(0).eq(value(0))
						.and(S0_M3.dpt_cd.eq(S0_T1.sls_dpt_cd))
						.and(S0_T1.slo_dt.between(S0_M3.st_dt, S0_M3.end_dt))
						));
		
		MCSubQuery S0_M11_dpt_nm = subQuery().select(S0_M11.dpt_nm).from(S0_M11).where(
				bracket(
						value(0).eq(value(0))
						.and(S0_M11.dpt_cd.eq(S0_T1.ar_dpt_cd))
						.and(S0_T1.slo_dt.between(S0_M11.st_dt, S0_M11.end_dt))
						));
		
		MCSubQuery S0_M26_bp_nm = subQuery().select(S0_M26.bp_nm).from(S0_M26).where(
				bracket(
						value(0).eq(value(0))
						.and(S0_M26.bp_cd.eq(S0_T2.tdlv_cd))
						));
		
		MCSubQuery S0_M45_dpt_nm = subQuery().select(S0_M45.dpt_nm).from(S0_M45).where(
				bracket(
						value(0).eq(value(0))
						.and(S0_M45.dpt_cd.eq(S0_T2.bd_dpt_cd))
						.and(S0_T1.slo_dt.between(S0_M45.st_dt, S0_M45.end_dt))
						));
		
		MCSubQuery S0_M54_itm_nm = subQuery().select(S0_M54.itm_nm).from(S0_M54).where(
				bracket(
						value(0).eq(value(0))
						.and(S0_M54.itm_cd.eq(S0_T2.itm_cd))
						.and(S0_M54.itm_sub1.eq(S0_T2.itm_sub1))
						.and(S0_M54.itm_sub2.eq(S0_T2.itm_sub2))
						.and(S0_M54.itm_sub3.eq(S0_T2.itm_sub3))
						.and(S0_M54.lcl_cd.eq(S0_M21.prnt_lcl_cd))
						));
		
		MCTempView S0_V1 = createTempView("V1");
		
		return createQueryPlan()
			.setQuery(
				sql("MSBBL1220_MST_SLO_D_Query_S01")
					.mainQuery()
					.select(
						S0_V1.pr(S0_T6.sls_sts_typ),
						S0_V1.pr(S0_T1.trd_cd),
						S0_V1.pr(S0_T1.trd_ptn_typ),
						S0_V1.pr(S0_T1.slo_no),
						S0_V1.pr(S0_T1.slo_rev),
						S0_V1.pr(S0_T1.slo_dt),
						S0_V1.pr(S0_T1.edi_flg),
						S0_V1.pr(S0_T2.slo_d_no),
						S0_V1.pr("slo_d_rev"),
						S0_V1.pr("sim_alloc_pln_typ"),
						S0_V1.pr(S0_T1.sls_usr_cd),
						S0_V1.pr(S0_T1.sls_dpt_cd),
						S0_V1.pr("sls_dpt_nm"),
						S0_V1.pr(S0_T1.wg_cd),
						S0_V1.pr(S0_T1.cst_cd),
						S0_V1.pr(S0_T1.sls_basis_typ),
						S0_V1.pr(S0_T1.trd_cur_cd),
						S0_V1.pr(S0_T1.xrate_inpt_flg),
						S0_V1.pr(S0_T1.xrate),
						S0_V1.pr(S0_M7.base_cur_cd),
						S0_V1.pr(S0_M7.ptax_cur_cd),
						S0_V1.pr(S0_T1.ptax_xrate_inpt_flg),
						S0_V1.pr(S0_T1.ptax_xrate),
						S0_V1.pr(S0_T2.dlv_day_week_typ),
						S0_V1.pr(S0_T1.assort_typ),
						S0_V1.pr(S0_T1.slo_typ),
						S0_V1.pr(S0_T1.cst_po_no),
						S0_V1.pr(S0_T1.cst_po_rev),
						S0_V1.pr(S0_T1.ar_dpt_cd),
						S0_V1.pr("ar_dpt_nm"),
						S0_V1.pr(S0_T1.trnspt_cd),
						S0_V1.pr(S0_T1.vssl_flght),
						S0_V1.pr(S0_T1.load_port_cd),
						S0_V1.pr(S0_T1.etd_dt),
						S0_V1.pr(S0_T1.dschrg_port_cd),
						S0_V1.pr(S0_T1.eta_dt),
						S0_V1.pr(S0_T1.via_port_cd),
						S0_V1.pr(S0_T1.via_schd_dt),
						S0_V1.pr(S0_T1.iv_no),
						S0_V1.pr(S0_T1.adv_ship_ctrl_typ),
						S0_V1.pr(S0_T1.adv_bill_amt),
						S0_V1.pr(S0_T1.adv_rcv_amt),
						S0_V1.pr(S0_T1.tterm_cd1),
						S0_V1.pr(S0_T1.tterm_rmrks1),
						S0_V1.pr(S0_T1.tterm_cd2),
						S0_V1.pr(S0_T1.tterm_rmrks2),
						S0_V1.pr(S0_T1.tterm_cd3),
						S0_V1.pr(S0_T1.tterm_rmrks3),
						S0_V1.pr(S0_T1.qtn_no),
						S0_V1.pr(S0_T1.qtn_rev),
						S0_V1.pr(S0_T1.wrk_no),
						S0_V1.pr(S0_T1.rcpt_dt),
						S0_V1.pr(S0_T1.rcpt_usr_cd),
						S0_V1.pr(S0_T1.cst_po_rmrks),
						S0_V1.pr(S0_T1.trd_rmrks),
						S0_V1.pr(S0_T1.intr_rmrks),
						S0_V1.pr(S0_T1.sub_char1),
						S0_V1.pr(S0_T1.sub_char2),
						S0_V1.pr(S0_T1.sub_char3),
						S0_V1.pr(S0_T1.edi_sub_char1),
						S0_V1.pr(S0_T1.edi_sub_char2),
						S0_V1.pr(S0_T1.edi_sub_char3),
						S0_V1.pr(S0_T1.edi_sub_char4),
						S0_V1.pr(S0_T1.edi_sub_char5),
						S0_V1.pr(S0_T1.edi_sub_num1),
						S0_V1.pr(S0_T1.edi_sub_dt1),
						S0_V1.pr(S0_T1.aprv_flg),
						S0_V1.pr(S0_T1.aprv_no),
						S0_V1.pr(S0_T1.aprv_sts_typ),
						S0_V1.pr(S0_T1.can_flg),
						S0_V1.pr(S0_T1.can_rsn_cd),
						S0_V1.pr(S0_T1.can_rmrks),
						S0_V1.pr(S0_T2.abort_flg),
						S0_V1.pr(S0_T2.dlv_cd),
						S0_V1.pr(S0_T2.dlv_sundry_flg),
						S0_V1.pr("dlv_nm"),
						S0_V1.pr(S0_T2.dlv_cntct_dpt),
						S0_V1.pr(S0_T2.dlv_cntct_psn),
						S0_V1.pr(S0_T2.dlv_zip_cd),
						S0_V1.pr(S0_T2.dlv_addr1),
						S0_V1.pr(S0_T2.dlv_addr2),
						S0_V1.pr(S0_T2.dlv_addr3),
						S0_V1.pr(S0_T2.dlv_addr4),
						S0_V1.pr(S0_T2.dlv_tel),
						S0_V1.pr(S0_T2.dlv_fax),
						S0_V1.pr(S0_T2.dlv_lg_grp_cd),
						S0_V1.pr(S0_T2.pri_prnt_flg),
						S0_V1.pr(S0_T2.dest_cd1),
						S0_V1.pr(S0_T2.dest_cd2),
						S0_V1.pr(S0_T2.dest_cd3),
						S0_V1.pr(S0_T2.tdlv_cd),
						S0_V1.pr(S0_T2.tdlv_sundry_flg),
						S0_V1.pr("tdlv_nm"),
						S0_V1.pr(S0_T2.tdlv_cntct_dpt),
						S0_V1.pr(S0_T2.tdlv_cntct_psn),
						S0_V1.pr(S0_T2.tdlv_zip_cd),
						S0_V1.pr(S0_T2.tdlv_addr1),
						S0_V1.pr(S0_T2.tdlv_addr2),
						S0_V1.pr(S0_T2.tdlv_addr3),
						S0_V1.pr(S0_T2.tdlv_addr4),
						S0_V1.pr(S0_T2.tdlv_tel),
						S0_V1.pr(S0_T2.tdlv_fax),
						S0_V1.pr(S0_T2.tdlv_lg_grp_cd),
						S0_V1.pr(S0_T2.itm_cd),
						S0_V1.pr(S0_T2.itm_sub1),
						S0_V1.pr(S0_T2.itm_sub2),
						S0_V1.pr(S0_T2.itm_sub3),
						S0_V1.pr("itm_nm"),
						S0_V1.pr(S0_M28.comp_spec_typ),
						S0_V1.pr("itm_comp_rev_no"),
						S0_V1.pr("iv_itm_nm"),
						S0_V1.pr(S0_T2.cntry_org_cd),
						S0_V1.pr(S0_M28.asset_mng_typ),
						S0_V1.pr(S0_T2.vmi_flg),
						S0_V1.pr(S0_M28.dscnt_itm_flg),
						S0_V1.pr(S0_T2.sundry_itm_flg),
						S0_V1.pr(S0_T2.trd_unit_cd),
						S0_V1.pr(S0_T2.trd_unit_qty),
						S0_V1.pr(S0_T2.upri_not_tgt_flg),
						S0_V1.pr(S0_T2.trd_cur_upri),
						S0_V1.pr(S0_T2.interim_flg),
						S0_V1.pr(S0_T2.trd_cur_amt),
						S0_V1.pr("trd_cur_inc_tax_amt"),
						S0_V1.pr(S0_T2.trd_cur_dscnt_amt),
						S0_V1.pr(S0_T2.dscnt_rsn_cd),
						S0_V1.pr(S0_T2.cost_upri),
						S0_V1.pr(S0_T2.cost_amt),
						S0_V1.pr(S0_T2.iv_upri),
						S0_V1.pr(S0_T2.iv_amt),
						S0_V1.pr(S0_T2.tax_fix_flg),
						S0_V1.pr(S0_T2.tax_cd),
						S0_V1.pr(S0_T2.trd_cur_tax_amt),
						S0_V1.pr(S0_T2.wtax_rate),
						S0_V1.pr(S0_T2.wtax_amt),
						S0_V1.pr(S0_T2.bill_crryovr_times),
						S0_V1.pr(S0_T2.gd_cd),
						S0_V1.pr(S0_T2.sno1_null_flg),
						S0_V1.pr(S0_T2.sno1),
						S0_V1.pr(S0_T2.sno2_null_flg),
						S0_V1.pr(S0_T2.sno2),
						S0_V1.pr(S0_T2.sno3_null_flg),
						S0_V1.pr(S0_T2.sno3),
						S0_V1.pr(S0_T2.sno4_null_flg),
						S0_V1.pr(S0_T2.sno4),
						S0_V1.pr("has_spec_flg"),
						S0_V1.pr("spec_sub_char1"),
						S0_V1.pr("spec_sub_char2"),
						S0_V1.pr("spec_sub_char3"),
						S0_V1.pr(S0_T2.set_itm_grp_no),
						S0_V1.pr("ship_rqst_dt"),
						S0_V1.pr("ship_rqst_hm"),
						S0_V1.pr("dlv_rqst_dt"),
						S0_V1.pr("dlv_rqst_hm"),
						S0_V1.pr(S0_T2.accpt_schd_dt),
						S0_V1.pr(S0_T2.sls_schd_dt),
						S0_V1.pr(S0_T6.ship_schd_split_flg),
						S0_V1.pr("ship_schd_dt"),
						S0_V1.pr("ship_schd_hm"),
						S0_V1.pr("dlv_schd_dt"),
						S0_V1.pr("dlv_schd_hm"),
						S0_V1.pr(S0_T2.sls_cststk_flg),
						S0_V1.pr(S0_T2.proc_typ),
						S0_V1.pr(S0_T2.ship_inst_typ),
						S0_V1.pr(S0_T2.ship_schd_split_typ),
						S0_V1.pr(S0_T2.alloc_scope_typ),
						S0_V1.pr(S0_T2.alloc_typ),
						S0_V1.pr(S0_T2.not_lg_mix_flg),
						S0_V1.pr(S0_T2.rqst_to_loc_cd),
						S0_V1.pr(S0_T2.sppl_cd),
						S0_V1.pr(S0_T2.maker_cd),
						S0_V1.pr(S0_T2.rqst_dt),
						S0_V1.pr(S0_T2.rqst_dlv_rqst_dt),
						S0_V1.pr(S0_T2.rqst_prms_dt),
						S0_V1.pr(S0_T2.rqst_prms_dlv_dt),
						S0_V1.pr(S0_T2.wg_rqst_cnt_rmrks),
						S0_V1.pr(S0_T2.alloc_grp_cd),
						S0_V1.pr(S0_T2.ship_lg_grp_cd),
						S0_V1.pr(S0_T2.def_loc_cd),
						S0_V1.pr(S0_T2.loc_cd),
						S0_V1.pr(S0_T2.str_ln_cd),
						S0_V1.pr(S0_T2.lot_no),
						S0_V1.pr(S0_T2.sublot_no),
						S0_V1.pr(S0_T2.not_lot_mix_flg),
						S0_V1.pr(S0_T2.not_sublot_mix_flg),
						S0_V1.pr(S0_T2.ver_no),
						S0_V1.pr(S0_T2.ship_term_cd),
						S0_V1.pr(S0_T2.ship_cnt_rmrks),
						S0_V1.pr(S0_T2.trd_d_rmrks),
						S0_V1.pr("slo_d_intr_rmrks"),
						S0_V1.pr(S0_T2.sls_rsn_cd),
						S0_V1.pr(S0_T2.bd_dpt_cd),
						S0_V1.pr("bd_dpt_nm"),
						S0_V1.pr(S0_T2.qtn_d_no),
						S0_V1.pr(S0_T2.cst_po_d_no),
						S0_V1.pr(S0_T2.cst_itm_cd),
						S0_V1.pr(S0_T2.cst_itm_nm),
						S0_V1.pr(S0_T2.cst_po_d_rmrks),
						S0_V1.pr(S0_T2.sls_upri_req_typ),
						S0_V1.pr("slo_d_sub_char1"),
						S0_V1.pr("slo_d_sub_char2"),
						S0_V1.pr("slo_d_sub_char3"),
						S0_V1.pr(S0_T2.edi_sub_d_char1),
						S0_V1.pr(S0_T2.edi_sub_d_char2),
						S0_V1.pr(S0_T2.edi_sub_d_char3),
						S0_V1.pr(S0_T2.edi_sub_d_char4),
						S0_V1.pr(S0_T2.edi_sub_d_char5),
						S0_V1.pr(S0_T2.edi_sub_d_num1),
						S0_V1.pr(S0_T2.edi_sub_d_dt1),
						S0_V1.pr("slo_d_can_flg"),
						S0_V1.pr("slo_d_can_rsn_cd"),
						S0_V1.pr(S0_T2.slo_d_can_rmkrs),
						S0_V1.pr(S0_T6.ship_cmpl_flg),
						S0_V1.pr(S0_T6.sls_cmpl_flg),
						S0_V1.pr(S0_T2.base_unit_cd),
						S0_V1.pr(S0_T2.base_unit_qty),
						S0_V1.pr(S0_T6.prms_qty),
						S0_V1.pr(S0_T6.dlv_inst_rcpt_qty),
						S0_V1.pr(S0_T6.dlv_inst_prms_qty),
						S0_V1.pr(S0_T6.ship_inst_qty),
						S0_V1.pr(S0_T6.ship_act_qty),
						S0_V1.pr(S0_T6.iv_schd_qty),
						S0_V1.pr(S0_T6.iv_act_qty),
						S0_V1.pr(S0_T6.sls_qty),
						S0_V1.pr(S0_T6.ship_ret_qty),
						S0_V1.pr(S0_T6.re_ship_schd_qty),
						S0_V1.pr(S0_T6.ship_schd_abort_qty),
						S0_V1.pr(S0_T6.sls_schd_abort_qty),
						S0_V1.pr(S0_T6.prms_dt),
						S0_V1.pr(S0_T6.dlv_inst_rcpt_dt),
						S0_V1.pr(S0_T6.dlv_inst_prms_dt),
						S0_V1.pr(S0_T6.prms_dlv_dt),
						S0_V1.pr("not_dlv_qty"),
						S0_V1.pr("overdue_prspct_qty"),
						S0_V1.pr("ship_pr_rate"),
						S0_V1.pr("sls_pr_rate"),
						S0_V1.pr("ship_dt"),
						S0_V1.pr("ship_hm"),
						S0_V1.pr(S0_T6.ship_tm),
						S0_V1.pr("dlv_dt"),
						S0_V1.pr("dlv_hm"),
						S0_V1.pr(S0_T6.act_dlv_lt),
						S0_V1.pr(S0_T6.sls_dt),
						S0_V1.pr(S0_T6.dlv_qty),
						S0_V1.pr("dlv_rqst_dt_overdue_act_flg"),
						S0_V1.pr("prms_dlv_dt_overdue_act_flg"),
						S0_V1.pr("ship_pr_base_unit_qty"),
						S0_V1.pr(S0_T2.disp_seq),
						S0_V1.pr(S0_T2.ins_usr_id),
						S0_V1.pr(S0_T2.ins_usr_nm),
						S0_V1.pr(S0_T2.ins_func_id),
						S0_V1.pr(S0_T2.ins_ts),
						S0_V1.pr(S0_T2.upd_usr_id),
						S0_V1.pr(S0_T2.upd_usr_nm),
						S0_V1.pr(S0_T2.upd_func_id),
						S0_V1.pr(S0_T2.upd_ts),
						S0_V1.pr(S0_T2.upd_srv_req_no),
						S0_V1.pr(S0_T2.sls_itm_no),
						addDynamicSelect(DS0C_CST_GRP),
						addDynamicSelect(DS0C_DLV_GRP),
						addDynamicSelect(DS0C_ITM_GRP)
					)
					.from(
							subQuery().select(
									S0_T6.sls_sts_typ,
									S0_T1.trd_cd,
									S0_T1.trd_ptn_typ,
									S0_T1.slo_no,
									S0_T1.slo_rev,
									S0_T1.slo_dt,
									S0_T1.edi_flg,
									S0_T2.slo_d_no,
									decode(
										S0_T2.can_flg,
										value(true),
										S0_T2.slo_rev,
										nullValue()
									).as("slo_d_rev"),
									S0_T7_sim_alloc_pln_typ.as("sim_alloc_pln_typ"),
									S0_T1.sls_usr_cd,
									S0_T1.sls_dpt_cd,
									S0_M3_dpt_nm.as("sls_dpt_nm"),
									S0_T1.wg_cd,
									S0_T1.cst_cd,
									S0_T1.sls_basis_typ,
									S0_T1.trd_cur_cd,
									S0_T1.xrate_inpt_flg,
									S0_T1.xrate,
									S0_M7.base_cur_cd,
									S0_M7.ptax_cur_cd,
									S0_T1.ptax_xrate_inpt_flg,
									S0_T1.ptax_xrate,
									S0_T2.dlv_day_week_typ,
									S0_T1.assort_typ,
									S0_T1.slo_typ,
									S0_T1.cst_po_no,
									S0_T1.cst_po_rev,
									S0_T1.ar_dpt_cd,
									S0_M11_dpt_nm.as("ar_dpt_nm"),
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
									S0_T1.qtn_no,
									S0_T1.qtn_rev,
									S0_T1.wrk_no,
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
									S0_T1.aprv_flg,
									S0_T1.aprv_no,
									S0_T1.aprv_sts_typ,
									S0_T1.can_flg,
									S0_T1.can_rsn_cd,
									S0_T1.can_rmrks,
									S0_T2.abort_flg,
									S0_T2.dlv_cd,
									S0_T2.dlv_sundry_flg,
									nvl(
										S0_T2.dlv_nm,
										S0_M21.bp_nm
									).as("dlv_nm"),
									S0_T2.dlv_cntct_dpt,
									S0_T2.dlv_cntct_psn,
									S0_T2.dlv_zip_cd,
									S0_T2.dlv_addr1,
									S0_T2.dlv_addr2,
									S0_T2.dlv_addr3,
									S0_T2.dlv_addr4,
									S0_T2.dlv_tel,
									S0_T2.dlv_fax,
									S0_T2.dlv_lg_grp_cd,
									S0_T2.pri_prnt_flg,
									S0_T2.dest_cd1,
									S0_T2.dest_cd2,
									S0_T2.dest_cd3,
									S0_T2.tdlv_cd,
									S0_T2.tdlv_sundry_flg,
									nvl(
										S0_T2.tdlv_nm,
										S0_M26_bp_nm
									).as("tdlv_nm"),
									S0_T2.tdlv_cntct_dpt,
									S0_T2.tdlv_cntct_psn,
									S0_T2.tdlv_zip_cd,
									S0_T2.tdlv_addr1,
									S0_T2.tdlv_addr2,
									S0_T2.tdlv_addr3,
									S0_T2.tdlv_addr4,
									S0_T2.tdlv_tel,
									S0_T2.tdlv_fax,
									S0_T2.tdlv_lg_grp_cd,
									S0_T2.itm_cd,
									S0_T2.itm_sub1,
									S0_T2.itm_sub2,
									S0_T2.itm_sub3,
									nvl(
										S0_T2.itm_nm,
										S0_M28.itm_nm
									).as("itm_nm"),
									S0_M28.comp_spec_typ,
									S0_T4_itm_comp_rev_no.as("itm_comp_rev_no"),
									decode(
										S0_M28.sundry_itm_flg,
										value(true),
										S0_T2.iv_itm_nm,
										nvl(
											S0_M54_itm_nm,
											S0_M28.itm_nm
										)
									).as("iv_itm_nm"),
									S0_T2.cntry_org_cd,
									S0_M28.asset_mng_typ,
									S0_T2.vmi_flg,
									S0_M28.dscnt_itm_flg,
									S0_T2.sundry_itm_flg,
									S0_T2.trd_unit_cd,
									S0_T2.trd_unit_qty,
									S0_T2.upri_not_tgt_flg,
									S0_T2.trd_cur_upri,
									S0_T2.interim_flg,
									S0_T2.trd_cur_amt,
									S0_T2.trd_cur_amt.add(S0_T2.trd_cur_tax_amt).as("trd_cur_inc_tax_amt"),
									S0_T2.trd_cur_dscnt_amt,
									S0_T2.dscnt_rsn_cd,
									S0_T2.cost_upri,
									S0_T2.cost_amt,
									S0_T2.iv_upri,
									S0_T2.iv_amt,
									S0_T2.tax_fix_flg,
									S0_T2.tax_cd,
									S0_T2.trd_cur_tax_amt,
									S0_T2.wtax_rate,
									S0_T2.wtax_amt,
									S0_T2.bill_crryovr_times,
									S0_T2.gd_cd,
									S0_T2.sno1_null_flg,
									S0_T2.sno1,
									S0_T2.sno2_null_flg,
									S0_T2.sno2,
									S0_T2.sno3_null_flg,
									S0_T2.sno3,
									S0_T2.sno4_null_flg,
									S0_T2.sno4,
									decode(
											S0_T5_sls_itm_spec_no,
											nullValue(),
											value(false),
											value(true)
									).as("has_spec_flg"),
									S0_T5_sub_char1.as("spec_sub_char1"),
									S0_T5_sub_char2.as("spec_sub_char2"),
									S0_T5_sub_char3.as("spec_sub_char3"),
									S0_T2.set_itm_grp_no,
									trunc(
										S0_T2.ship_rqst_tm,
										MCDateFmt.DD
									).as("ship_rqst_dt"),
									S0_T2.ship_rqst_tm.as("ship_rqst_hm"),
									trunc(
										S0_T2.dlv_rqst_tm,
										MCDateFmt.DD
									).as("dlv_rqst_dt"),
									S0_T2.dlv_rqst_tm.as("dlv_rqst_hm"),
									S0_T2.accpt_schd_dt,
									S0_T2.sls_schd_dt,
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
									S0_T2.sls_cststk_flg,
									S0_T2.proc_typ,
									S0_T2.ship_inst_typ,
									S0_T2.ship_schd_split_typ,
									S0_T2.alloc_scope_typ,
									S0_T2.alloc_typ,
									S0_T2.not_lg_mix_flg,
									S0_T2.rqst_to_loc_cd,
									S0_T2.sppl_cd,
									S0_T2.maker_cd,
									S0_T2.rqst_dt,
									S0_T2.rqst_dlv_rqst_dt,
									S0_T2.rqst_prms_dt,
									S0_T2.rqst_prms_dlv_dt,
									S0_T2.wg_rqst_cnt_rmrks,
									S0_T2.alloc_grp_cd,
									S0_T2.ship_lg_grp_cd,
									S0_T2.def_loc_cd,
									S0_T2.loc_cd,
									S0_T2.str_ln_cd,
									S0_T2.lot_no,
									S0_T2.sublot_no,
									S0_T2.not_lot_mix_flg,
									S0_T2.not_sublot_mix_flg,
									S0_T2.ver_no,
									S0_T2.ship_term_cd,
									S0_T2.ship_cnt_rmrks,
									S0_T2.trd_d_rmrks,
									S0_T2.intr_rmrks.as("slo_d_intr_rmrks"),
									S0_T2.sls_rsn_cd,
									S0_T2.bd_dpt_cd,
									S0_M45_dpt_nm.as("bd_dpt_nm"),
									S0_T2.qtn_d_no,
									S0_T2.cst_po_d_no,
									S0_T2.cst_itm_cd,
									S0_T2.cst_itm_nm,
									S0_T2.cst_po_d_rmrks,
									S0_T2.sls_upri_req_typ,
									S0_T2.sub_char1.as("slo_d_sub_char1"),
									S0_T2.sub_char2.as("slo_d_sub_char2"),
									S0_T2.sub_char3.as("slo_d_sub_char3"),
									S0_T2.edi_sub_d_char1,
									S0_T2.edi_sub_d_char2,
									S0_T2.edi_sub_d_char3,
									S0_T2.edi_sub_d_char4,
									S0_T2.edi_sub_d_char5,
									S0_T2.edi_sub_d_num1,
									S0_T2.edi_sub_d_dt1,
									S0_T2.can_flg.as("slo_d_can_flg"),
									S0_T2.can_rsn_cd.as("slo_d_can_rsn_cd"),
									S0_T2.slo_d_can_rmkrs,
									S0_T6.ship_cmpl_flg,
									S0_T6.sls_cmpl_flg,
									S0_T2.base_unit_cd,
									S0_T2.base_unit_qty,
									S0_T6.prms_qty,
									S0_T6.dlv_inst_rcpt_qty,
									S0_T6.dlv_inst_prms_qty,
									S0_T6.ship_inst_qty,
									S0_T6.ship_act_qty,
									S0_T6.iv_schd_qty,
									S0_T6.iv_act_qty,
									S0_T6.sls_qty,
									S0_T6.ship_ret_qty,
									S0_T6.re_ship_schd_qty,
									S0_T6.ship_schd_abort_qty,
									S0_T6.sls_schd_abort_qty,
									S0_T6.prms_dt,
									S0_T6.dlv_inst_rcpt_dt,
									S0_T6.dlv_inst_prms_dt,
									S0_T6.prms_dlv_dt,
									decode(
										S0_T6.ship_cmpl_flg,
										value(true),
										value(0),
										S0_T6.base_unit_qty.subtract(S0_T6.dlv_qty).subtract(S0_T6.ship_schd_abort_qty)
									).as("not_dlv_qty"),
									value(0).as("overdue_prspct_qty"),
									MAPA_CALC$F_CALC_PER(
										S0_T2.base_unit_qty,
										S0_T6.ship_act_qty
									).as("ship_pr_rate"),
									MAPA_CALC$F_CALC_PER(
										S0_T2.base_unit_qty,
										S0_T6.sls_qty
									).as("sls_pr_rate"),
									trunc(
										S0_T6.ship_tm,
										MCDateFmt.DD
									).as("ship_dt"),
									S0_T6.ship_tm.as("ship_hm"),
									S0_T6.ship_tm,
									trunc(
										S0_T6.dlv_tm,
										MCDateFmt.DD
									).as("dlv_dt"),
									S0_T6.dlv_tm.as("dlv_hm"),
									S0_T6.act_dlv_lt,
									S0_T6.sls_dt,
									S0_T6.dlv_qty,
									S0_T6.dlv_rqst_dt_overdue_flg.as("dlv_rqst_dt_overdue_act_flg"),
									S0_T6.prms_dlv_dt_overdue_flg.as("prms_dlv_dt_overdue_act_flg"),
									S0_T6.base_unit_qty.as("ship_pr_base_unit_qty"),
									S0_T2.disp_seq,
									S0_T2.ins_usr_id,
									S0_T2.ins_usr_nm,
									S0_T2.ins_func_id,
									S0_T2.ins_ts,
									S0_T2.upd_usr_id,
									S0_T2.upd_usr_nm,
									S0_T2.upd_func_id,
									S0_T2.upd_ts,
									S0_T2.upd_srv_req_no,
									S0_T2.sls_itm_no,
									S0_M21.bp_grp_cd1,
									S0_M21.bp_grp_cd2,
									S0_M21.bp_grp_cd3,
									S0_M21.bp_grp_cd4,
									S0_M21.bp_grp_cd5,
									S0_M21.bp_grp_cd6,
									S0_M21.bp_grp_cd7,
									S0_M21.bp_grp_cd8,
									S0_M21.bp_grp_cd9,
									S0_M21.bp_grp_cd10,
									S0_M28.itm_typ,
									S0_M28.itm_typ_d_cd,
									S0_M28.itm_grp_cd1,
									S0_M28.itm_grp_cd2,
									S0_M28.itm_grp_cd3,
									S0_M28.itm_grp_cd4,
									S0_M28.itm_grp_cd5,
									S0_M28.itm_grp_cd6,
									S0_M28.itm_grp_cd7,
									S0_M28.itm_grp_cd8,
									S0_M28.itm_grp_cd9,
									S0_M28.itm_grp_cd10
								)
								.from(
									S0_T1
									.innerJoin(S0_T2).on(S0_T2.slo_no.eq(S0_T1.slo_no))
									.leftOuterJoin(S0_T6).on(S0_T6.slo_d_no.eq(S0_T2.slo_d_no))
									.crossJoin(S0_M7)
									.leftOuterJoin(S0_M21).on(S0_M21.bp_cd.eq(S0_T2.dlv_cd))
									.leftOuterJoin(S0_M28).on(
										S0_M28.itm_cd.eq(S0_T2.itm_cd)
										.and(S0_M28.itm_sub1.eq(S0_T2.itm_sub1))
										.and(S0_M28.itm_sub2.eq(S0_T2.itm_sub2))
										.and(S0_M28.itm_sub3.eq(S0_T2.itm_sub3))
									)
									.innerJoin(S0_DAC).on(S0_DAC.dpt_cd.eq(S0_T1.sls_dpt_cd))
								)
								.where(
									value(0).eq(value(0))
									.and(
										bracket(
											bind("aprv_flg_str").eq(value(true))
											.and(S0_T1.aprv_flg.eq(value(false)))
										)
										.cutoff$or(
											bracket(
												S0_T1.aprv_flg.eq(value(true))
												.and(S0_T1.aprv_sts_typ.like(bind("aprv_sts_typ")))
											)
										)
									)
									.cutoff$and(
										bracket(
											bracket(
												S0_T6.sls_sts_typ.like(bind("sls_sts_typ"))
											)
											.or(
												bind("inc_can_flg").eq(value(true))
												.and(S0_T2.can_flg.eq(value(true)))
											)
										)
									)
									.cutoff$and(S0_T1.edi_flg.eq(bind("edi_flg_str")))
									.cutoff$and(
										bracket(
											bracket(
												bind("not_alloc_flg_str").eq(value(true))
												.and(S0_T2.can_flg.eq(value(false)))
												.and(
													S0_T2.alloc_typ.in(
														value(MAC_ALLOC_TYP.IMMED.value()),
														value(MAC_ALLOC_TYP.LATER.value())
													)
												)
												.and(
													notExists(
														subQuery()
														.select(value("X"))
														.from(S1_ST11)
														.where(
															value(0).eq(value(0))
															.and(S1_ST11.alloc_qty.gt(value(0)))
															.and(S1_ST11.ship_pr_no.eq(S0_T6.ship_pr_no))
														)
													)
												)
											)
											.or(
												bind("part_alloc_flg_str").eq(value(true))
												.and(S0_T2.can_flg.eq(value(false)))
												.and(
													exists(
														subQuery()
														.select(value("X"))
														.from(S2_ST21)
														.where(
															value(0).eq(value(0))
															.and(S2_ST21.base_unit_qty.subtract(S2_ST21.abort_qty).subtract(S2_ST21.alloc_qty).gt(value(0)))
															.and(S2_ST21.ship_pr_no.eq(S0_T6.ship_pr_no))
														)
													)
												)
												.and(
													exists(
														subQuery()
														.select(value("X"))
														.from(S3_ST22)
														.where(
															value(0).eq(value(0))
															.and(S3_ST22.alloc_qty.gt(value(0)))
															.and(S3_ST22.ship_pr_no.eq(S0_T6.ship_pr_no))
														)
													)
												)
											)
											.or(
												bind("all_alloc_flg_str").eq(value(true))
												.and(S0_T2.can_flg.eq(value(false)))
												.and(
													notExists(
														subQuery()
														.select(value("X"))
														.from(S4_ST31)
														.where(
															value(0).eq(value(0))
															.and(S4_ST31.base_unit_qty.subtract(S4_ST31.alloc_qty).gt(value(0)))
															.and(S4_ST31.abort_flg.eq(value(false)))
															.and(S4_ST31.ship_pr_no.eq(S0_T6.ship_pr_no))
														)
													)
												)
												.and(
													exists(
														subQuery()
														.select(value("X"))
														.from(S5_ST32)
														.where(
															value(0).eq(value(0))
															.and(S5_ST32.alloc_qty.gt(value(0)))
															.and(S5_ST32.ship_pr_no.eq(S0_T6.ship_pr_no))
														)
													)
												)
											)
											.or(
												bind("alloc_invalid_flg_str").eq(value(true))
												.and(
													bracket(
														S0_T2.alloc_typ.eq(value(MAC_ALLOC_TYP.NON.value()))
														.and(
															notExists(
																subQuery()
																.select(value("X"))
																.from(S6_ST41)
																.where(
																	value(0).eq(value(0))
																	.and(S6_ST41.alloc_qty.gt(value(0)))
																	.and(S6_ST41.ship_pr_no.eq(S0_T6.ship_pr_no))
																)
															)
														)
													)
													.or(S0_T2.alloc_typ.isNull())
													.or(S0_T2.can_flg.eq(value(true)))
												)
											)
										)
									)
									.cutoff$and(S0_T1.slo_dt.gte(bind("slo_dt_fr")))
									.cutoff$and(S0_T1.slo_dt.lte(bind("slo_dt_to")))
									.cutoff$and(S0_T2.ship_rqst_tm.gte(bind("ship_rqst_hm_fr")))
									.cutoff$and(S0_T2.ship_rqst_tm.lte(bind("ship_rqst_hm_to")))
									.cutoff$and(S0_T2.dlv_rqst_tm.gte(bind("dlv_rqst_hm_fr")))
									.cutoff$and(S0_T2.dlv_rqst_tm.lte(bind("dlv_rqst_hm_to")))
									.cutoff$and(S0_T2.sls_schd_dt.gte(bind("sls_schd_dt_fr")))
									.cutoff$and(S0_T2.sls_schd_dt.lte(bind("sls_schd_dt_to")))
									.cutoff$and(S0_T6.ship_schd_tm.gte(bind("ship_schd_hm_fr")))
									.cutoff$and(S0_T6.ship_schd_tm.lte(bind("ship_schd_hm_to")))
									.cutoff$and(S0_T6.dlv_schd_tm.gte(bind("dlv_schd_hm_fr")))
									.cutoff$and(S0_T6.dlv_schd_tm.lte(bind("dlv_schd_hm_to")))
									.cutoff$and(S0_T6.dlv_tm.gte(bind("dlv_hm_fr")))
									.cutoff$and(S0_T6.dlv_tm.lte(bind("dlv_hm_to")))
									.cutoff$and(S0_T6.dlv_inst_rcpt_dt.gte(bind("dlv_inst_rcpt_dt_fr")))
									.cutoff$and(S0_T6.dlv_inst_rcpt_dt.lte(bind("dlv_inst_rcpt_dt_to")))
									.cutoff$and(S0_T1.rcpt_dt.gte(bind("rcpt_dt_fr")))
									.cutoff$and(S0_T1.rcpt_dt.lte(bind("rcpt_dt_to")))
									.cutoff$and(S0_T1.sls_usr_cd.like(bind("sls_usr_cd")))
									.cutoff$and(S0_T1.sls_dpt_cd.like(bind("sls_dpt_cd")))
									.cutoff$and(S0_T1.wg_cd.like(bind("wg_cd")))
									.cutoff$and(S0_T1.trd_cd.like(bind("trd_cd")))
									.cutoff$and(S0_T1.slo_no.like(bind("slo_no")))
									.cutoff$and(S0_T2.slo_d_no.like(bind("slo_d_no")))
									.cutoff$and(S0_T1.qtn_no.like(bind("qtn_no")))
									.cutoff$and(S0_T1.qtn_rev.eq(bind("qtn_rev")))
									.cutoff$and(S0_T1.slo_typ.like(bind("slo_typ")))
									.cutoff$and(
										bracket(
											bind("ship_rqst_dt_overdue_flg_str").isNotNull()
											.and(
												MAPA_DT$F_IS_BEFORE_AFTER(
													S0_T6.ship_schd_tm,
													S0_T6.ship_rqst_tm
												).eq(value(false))
											)
										)
									)
									.cutoff$and(
										bracket(
											bind("dlv_rqst_dt_overdue_flg_str").isNotNull()
											.and(MAC_VIA_DLV_TYP$IS_NOT_VIA(S0_T2.via_dlv_typ).eq(value(true)))
											.and(
												MAPA_DT$F_IS_BEFORE_AFTER(
													S0_T6.dlv_schd_tm,
													S0_T6.dlv_rqst_tm
												).eq(value(false))
											)
										)
									)
									.cutoff$and(S0_T6.dlv_rqst_dt_overdue_flg.eq(bind("dlv_rqst_dt_overdue_act_flg_str")))
									.cutoff$and(S0_T6.prms_dlv_dt_overdue_flg.eq(bind("prms_dlv_dt_0verdue_act_flg_str")))
									.cutoff$and(
										MAPA_CALC$F_CALC_PER(
											S0_T2.base_unit_qty,
											S0_T6.ship_act_qty
										).gte(bind("ship_pr_fr"))
									)
									.cutoff$and(
										MAPA_CALC$F_CALC_PER(
											S0_T2.base_unit_qty,
											S0_T6.ship_act_qty
										).lte(bind("ship_pr_to"))
									)
									.cutoff$and(
										MAPA_CALC$F_CALC_PER(
											S0_T2.base_unit_qty,
											S0_T6.sls_qty
										).gte(bind("sls_pr_fr"))
									)
									.cutoff$and(
										MAPA_CALC$F_CALC_PER(
											S0_T2.base_unit_qty,
											S0_T6.sls_qty
										).lte(bind("sls_pr_to"))
									)
									.cutoff$and(S0_T2.dlv_cd.like(bind("dlv_cd")))
									.cutoff$and(S0_T2.dest_cd1.like(bind("dest_cd1")))
									.cutoff$and(S0_T2.dest_cd2.like(bind("dest_cd2")))
									.cutoff$and(S0_T2.dest_cd3.like(bind("dest_cd3")))
									.cutoff$and(S0_T2.tdlv_cd.like(bind("tdlv_cd")))
									.cutoff$and(S0_T1.cst_cd.like(bind("cst_cd")))
									.cutoff$and(S0_T1.trd_cur_cd.like(bind("trd_cur_cd")))
									.cutoff$and(S0_T2.itm_cd.like(bind("itm_cd")))
									.cutoff$and(S0_T2.itm_sub1.like(bind("itm_sub1")))
									.cutoff$and(S0_T2.itm_sub2.like(bind("itm_sub2")))
									.cutoff$and(S0_T2.itm_sub3.like(bind("itm_sub3")))
									.cutoff$and(S0_T2.ver_no.like(bind("ver_no")))
									.cutoff$and(S0_T1.wrk_no.like(bind("wrk_no")))
									.cutoff$and(S0_T1.cst_po_no.like(bind("cst_po_no")))
									.cutoff$and(S0_T2.cst_po_d_no.like(bind("cst_po_d_no")))
									.cutoff$and(S0_T2.cst_itm_cd.like(bind("cst_itm_cd")))
									.cutoff$and(S0_T2.cst_itm_nm.like(bind("cst_itm_nm")))
									.cutoff$and(S0_T2.rqst_to_loc_cd.like(bind("rqst_to_loc_cd")))
									.cutoff$and(S0_T2.sppl_cd.like(bind("sppl_cd")))
									.cutoff$and(S0_T2.ship_inst_typ.like(bind("ship_inst_typ")))
									.cutoff$and(S0_T2.gd_cd.like(bind("gd_cd")))
									.cutoff$and(S0_T2.sno1.like(bind("sno1")))
									.cutoff$and(S0_T2.sno2.like(bind("sno2")))
									.cutoff$and(S0_T2.sno3.like(bind("sno3")))
									.cutoff$and(S0_T2.sno4.like(bind("sno4")))
									.cutoff$and(S0_T2.alloc_grp_cd.like(bind("alloc_grp_cd")))
									.cutoff$and(S0_T2.ship_lg_grp_cd.like(bind("ship_lg_grp_cd")))
									.cutoff$and(S0_T2.loc_cd.like(bind("loc_cd")))
									.cutoff$and(S0_T2.str_ln_cd.like(bind("str_ln_cd")))
									.cutoff$and(S0_T2.lot_no.like(bind("lot_no")))
									.cutoff$and(S0_T2.sublot_no.like(bind("sublot_no")))
									.cutoff$and(S0_T1.rcpt_usr_cd.like(bind("rcpt_usr_cd")))
									.cutoff$and(S0_T2.sls_rsn_cd.like(bind("sls_rsn_cd")))
									.cutoff$and(S0_T2.bd_dpt_cd.like(bind("bd_dpt_cd")))
									.cutoff$and(S0_T1.sls_basis_typ.like(bind("sls_basis_typ")))
									.cutoff$and(S0_T2.proc_typ.like(bind("proc_typ")))
									.cutoff$and(S0_T2.alloc_typ.like(bind("alloc_typ")))
									.cutoff$and(S0_T1.aprv_no.like(bind("aprv_no")))
									.cutoff$and(S0_T1.can_rsn_cd.like(bind("can_rsn_cd")))
									.cutoff$and(S0_T2.can_rsn_cd.like(bind("slo_d_can_rsn_cd")))
									.cutoff$and(S0_T1.cst_po_rmrks.like(bind("cst_po_rmrks")))
									.cutoff$and(S0_T2.cst_po_d_rmrks.like(bind("cst_po_d_rmrks")))
									.cutoff$and(S0_T1.trd_rmrks.like(bind("trd_rmrks")))
									.cutoff$and(S0_T2.trd_d_rmrks.like(bind("trd_d_rmrks")))
									.cutoff$and(S0_T1.intr_rmrks.like(bind("intr_rmrks")))
									.cutoff$and(S0_T2.intr_rmrks.like(bind("slo_d_intr_rmrks")))
									.cutoff$and(S0_T1.sub_char1.like(bind("sub_char1")))
									.cutoff$and(S0_T1.sub_char2.like(bind("sub_char2")))
									.cutoff$and(S0_T1.sub_char3.like(bind("sub_char3")))
									.cutoff$and(S0_T2.sub_char1.like(bind("slo_d_sub_char1")))
									.cutoff$and(S0_T2.sub_char2.like(bind("slo_d_sub_char2")))
									.cutoff$and(S0_T2.sub_char3.like(bind("slo_d_sub_char3")))
									.cutoff$and(S0_T2.can_flg.eq(bind("inc_can_flg_str")))
									.cutoff$and(S0_T2.abort_flg.eq(bind("inc_abort_flg_str")))
								)
								.view(S0_V1)
								.addDynamicView()
								.addDynamicView(DS0C_CST_GRP)
								.addDynamicView(DS0C_DLV_GRP)
								.addDynamicView(DS0C_ITM_GRP)
					)
					.where(
						value(0).eq(value(0))
						.cutoff$and(S0_V1.pr("sls_dpt_nm").like(bind("sls_dpt_nm")))
						.cutoff$and(S0_V1.pr("dlv_nm").like(bind("dlv_nm")))
						.cutoff$and(S0_V1.pr("tdlv_nm").like(bind("tdlv_nm")))
						.cutoff$and(S0_V1.pr(S0_M28.itm_typ).like(bind("itm_typ")))
						.cutoff$and(S0_V1.pr(S0_M28.itm_typ_d_cd).like(bind("itm_typ_d_cd")))
						.cutoff$and(S0_V1.pr("itm_nm").like(bind("itm_nm")))
						.cutoff$and(S0_V1.pr("bd_dpt_nm").like(bind("bd_dpt_nm")))
						.addDynamicPredicate()
						.addDynamicPredicate(DS0C_CST_GRP)
						.addDynamicPredicate(DS0C_DLV_GRP)
						.addDynamicPredicate(DS0C_ITM_GRP)
					)
					.orderBy(
						S0_V1.pr(S0_T1.slo_no).asc(),
						S0_V1.pr(S0_T2.disp_seq).asc()
					)
			)
			.setDynamicSQLInfo(
				when(boundOr("wrk_nm"))
					.view(v -> v.leftOuterJoin(S0_T3).on(S0_T3.wrk_no.eq(S0_V1.pr(S0_T1.wrk_no))))
					.predicate(p -> p.cutoff$and(S0_T3.wrk_nm.like(bind("wrk_nm")))),
				when(boundOr("trd_nm"))
					.view(v -> v.leftOuterJoin(S0_M1).on(S0_M1.trd_cd.eq(S0_V1.pr(S0_T1.trd_cd))))
					.predicate(p -> p.cutoff$and(S0_M1.trd_nm.like(bind("trd_nm")))),
				when(boundOr("sls_usr_nm"))
					.view(v -> v.leftOuterJoin(S0_M2).on(S0_M2.usr_cd.eq(S0_V1.pr(S0_T1.sls_usr_cd))))
					.predicate(p -> p.cutoff$and(S0_M2.usr_nm.like(bind("sls_usr_nm")))),
				when(boundOr("wg_nm"))
					.view(v -> v.leftOuterJoin(S0_M4).on(S0_M4.wg_cd.eq(S0_V1.pr(S0_T1.wg_cd))))
					.predicate(p -> p.cutoff$and(S0_M4.wg_nm.like(bind("wg_nm")))),
				when(boundOr("cst_grp_flg1", "cst_grp_flg2", "cst_grp_flg3", "cst_grp_flg4", "cst_grp_flg5", "cst_grp_flg6", "cst_grp_flg7", "cst_grp_flg8", "cst_grp_flg9", "cst_grp_flg10", "iv_trd_flg_str", "cst_nm"))
					.view(v -> v.leftOuterJoin(S0_M5).on(S0_M5.bp_cd.eq(S0_V1.pr(S0_T1.cst_cd))))
					.predicate(p -> p.cutoff$and(S0_M5.cst_iv_flg.eq(bind("iv_trd_flg_str"))).cutoff$and(S0_M5.bp_nm.like(bind("cst_nm")))),
				when(boundOr("trd_cur_nm"))
					.view(v -> v.leftOuterJoin(S0_M6).on(S0_M6.cur_cd.eq(S0_V1.pr(S0_T1.trd_cur_cd))))
					.predicate(p -> p.cutoff$and(S0_M6.cur_nm.like(bind("trd_cur_nm")))),
				when(boundOr("rcpt_usr_nm"))
					.view(v -> v.leftOuterJoin(S0_M19).on(S0_M19.usr_cd.eq(S0_V1.pr(S0_T1.rcpt_usr_cd))))
					.predicate(p -> p.cutoff$and(S0_M19.usr_nm.like(bind("rcpt_usr_nm")))),
				when(boundOr("can_rsn_nm"))
					.view(v -> v.leftOuterJoin(S0_M20).on(S0_M20.slo_rsn_cd.eq(S0_V1.pr(S0_T1.can_rsn_cd))))
					.predicate(p -> p.cutoff$and(S0_M20.slo_rsn_nm.like(bind("can_rsn_nm")))),
				when(boundOr("dest_nm1"))
					.view(v -> v.leftOuterJoin(S0_M23).on(S0_M23.bp_cd.eq(S0_V1.pr(S0_T2.dest_cd1))))
					.predicate(p -> p.cutoff$and(S0_M23.bp_nm.like(bind("dest_nm1")))),
				when(boundOr("dest_nm2"))
					.view(v -> v.leftOuterJoin(S0_M24).on(S0_M24.bp_cd.eq(S0_V1.pr(S0_T2.dest_cd2))))
					.predicate(p -> p.cutoff$and(S0_M24.bp_nm.like(bind("dest_nm2")))),
				when(boundOr("dest_nm3"))
					.view(v -> v.leftOuterJoin(S0_M25).on(S0_M25.bp_cd.eq(S0_V1.pr(S0_T2.dest_cd3))))
					.predicate(p -> p.cutoff$and(S0_M25.bp_nm.like(bind("dest_nm3")))),
				when(boundOr("gd_nm"))
					.view(v -> v.leftOuterJoin(S0_M34).on(S0_M34.gd_cd.eq(S0_V1.pr(S0_T2.gd_cd))))
					.predicate(p -> p.cutoff$and(S0_M34.gd_nm.like(bind("gd_nm")))),
				when(boundOr("rqst_to_loc_nm"))
					.view(v -> v.leftOuterJoin(S0_M35).on(S0_M35.loc_cd.eq(S0_V1.pr(S0_T2.rqst_to_loc_cd))))
					.predicate(p -> p.cutoff$and(S0_M35.loc_nm.like(bind("rqst_to_loc_nm")))),
				when(boundOr("sppl_nm"))
					.view(v -> v.leftOuterJoin(S0_M36).on(S0_M36.bp_cd.eq(S0_V1.pr(S0_T2.sppl_cd))))
					.predicate(p -> p.cutoff$and(S0_M36.bp_nm.like(bind("sppl_nm")))),
				when(boundOr("alloc_grp_nm"))
					.view(v -> v.leftOuterJoin(S0_M38).on(S0_M38.alloc_grp_cd.eq(S0_V1.pr(S0_T2.alloc_grp_cd))))
					.predicate(p -> p.cutoff$and(S0_M38.alloc_grp_nm.like(bind("alloc_grp_nm")))),
				when(boundOr("ship_lg_grp_nm"))
					.view(v -> v.leftOuterJoin(S0_M39).on(S0_M39.lg_grp_cd.eq(S0_V1.pr(S0_T2.ship_lg_grp_cd))))
					.predicate(p -> p.cutoff$and(S0_M39.lg_grp_nm.like(bind("ship_lg_grp_nm")))),
				when(boundOr("loc_nm"))
					.view(v -> v.leftOuterJoin(S0_M41).on(S0_M41.loc_cd.eq(S0_V1.pr(S0_T2.loc_cd))))
					.predicate(p -> p.cutoff$and(S0_M41.loc_nm.like(bind("loc_nm")))),
				when(boundOr("str_ln_nm"))
					.view(v -> v.leftOuterJoin(S0_M42).on(S0_M42.str_ln_cd.eq(S0_V1.pr(S0_T2.str_ln_cd)).and(S0_M42.loc_cd.eq(S0_V1.pr(S0_T2.loc_cd)))))
					.predicate(p -> p.cutoff$and(S0_M42.str_ln_nm.like(bind("str_ln_nm")))),
				when(boundOr("sls_rsn_nm"))
					.view(v -> v.leftOuterJoin(S0_M44).on(S0_M44.biz_rsn_cd.eq(S0_V1.pr(S0_T2.sls_rsn_cd))))
					.predicate(p -> p.cutoff$and(S0_M44.biz_rsn_nm.like(bind("sls_rsn_nm")))),
				when(boundOr("slo_d_can_rsn_nm"))
					.view(v -> v.leftOuterJoin(S0_M46).on(S0_M46.slo_rsn_cd.eq(S0_V1.pr("slo_d_can_rsn_cd"))))
					.predicate(p -> p.cutoff$and(S0_M46.slo_rsn_nm.like(bind("slo_d_can_rsn_nm")))),
				when(boundOr("itm_typ_d_nm"))
					.view(v -> v.leftOuterJoin(S0_M49).on(S0_M49.itm_typ.eq(S0_V1.pr(S0_M28.itm_typ)).and(S0_M49.itm_typ_d_cd.eq(S0_V1.pr(S0_M28.itm_typ_d_cd)))))
					.predicate(p -> p.cutoff$and(S0_M49.itm_typ_d_nm.like(bind("itm_typ_d_nm")))),
				when(boundOr("cst_grp_flg1"))
					.select(DS0C_CST_GRP, S0_M5.bp_grp_cd1.as("cst_grp_cd1"), S0_MMC1.bp_grp_nm.as("cst_grp_nm1"))
					.view(DS0C_CST_GRP, v -> v.leftOuterJoin(S0_MMC1).on(S0_M5.bp_grp_cd1.eq(S0_MMC1.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP1.value()).eq(S0_MMC1.bp_grp_typ))))
					.predicate(DS0C_CST_GRP, p -> p.cutoff$and(S0_M5.bp_grp_cd1.like(bind("cst_grp_cd1"))).cutoff$and(S0_MMC1.bp_grp_nm.like(bind("cst_grp_nm1")))),
				when(boundOr("cst_grp_flg2"))
					.select(DS0C_CST_GRP, S0_M5.bp_grp_cd2.as("cst_grp_cd2"), S0_MMC2.bp_grp_nm.as("cst_grp_nm2"))
					.view(DS0C_CST_GRP, v -> v.leftOuterJoin(S0_MMC2).on(S0_M5.bp_grp_cd2.eq(S0_MMC2.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP2.value()).eq(S0_MMC2.bp_grp_typ))))
					.predicate(DS0C_CST_GRP, p -> p.cutoff$and(S0_M5.bp_grp_cd2.like(bind("cst_grp_cd2"))).cutoff$and(S0_MMC2.bp_grp_nm.like(bind("cst_grp_nm2")))),
				when(boundOr("cst_grp_flg3"))
					.select(DS0C_CST_GRP, S0_M5.bp_grp_cd3.as("cst_grp_cd3"), S0_MMC3.bp_grp_nm.as("cst_grp_nm3"))
					.view(DS0C_CST_GRP, v -> v.leftOuterJoin(S0_MMC3).on(S0_M5.bp_grp_cd3.eq(S0_MMC3.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP3.value()).eq(S0_MMC3.bp_grp_typ))))
					.predicate(DS0C_CST_GRP, p -> p.cutoff$and(S0_M5.bp_grp_cd3.like(bind("cst_grp_cd3"))).cutoff$and(S0_MMC3.bp_grp_nm.like(bind("cst_grp_nm3")))),
				when(boundOr("cst_grp_flg4"))
					.select(DS0C_CST_GRP, S0_M5.bp_grp_cd4.as("cst_grp_cd4"), S0_MMC4.bp_grp_nm.as("cst_grp_nm4"))
					.view(DS0C_CST_GRP, v -> v.leftOuterJoin(S0_MMC4).on(S0_M5.bp_grp_cd4.eq(S0_MMC4.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP4.value()).eq(S0_MMC4.bp_grp_typ))))
					.predicate(DS0C_CST_GRP, p -> p.cutoff$and(S0_M5.bp_grp_cd4.like(bind("cst_grp_cd4"))).cutoff$and(S0_MMC4.bp_grp_nm.like(bind("cst_grp_nm4")))),
				when(boundOr("cst_grp_flg5"))
					.select(DS0C_CST_GRP, S0_M5.bp_grp_cd5.as("cst_grp_cd5"), S0_MMC5.bp_grp_nm.as("cst_grp_nm5"))
					.view(DS0C_CST_GRP, v -> v.leftOuterJoin(S0_MMC5).on(S0_M5.bp_grp_cd5.eq(S0_MMC5.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP5.value()).eq(S0_MMC5.bp_grp_typ))))
					.predicate(DS0C_CST_GRP, p -> p.cutoff$and(S0_M5.bp_grp_cd5.like(bind("cst_grp_cd5"))).cutoff$and(S0_MMC5.bp_grp_nm.like(bind("cst_grp_nm5")))),
				when(boundOr("cst_grp_flg6"))
					.select(DS0C_CST_GRP, S0_M5.bp_grp_cd6.as("cst_grp_cd6"), S0_MMC6.bp_grp_nm.as("cst_grp_nm6"))
					.view(DS0C_CST_GRP, v -> v.leftOuterJoin(S0_MMC6).on(S0_M5.bp_grp_cd6.eq(S0_MMC6.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP6.value()).eq(S0_MMC6.bp_grp_typ))))
					.predicate(DS0C_CST_GRP, p -> p.cutoff$and(S0_M5.bp_grp_cd6.like(bind("cst_grp_cd6"))).cutoff$and(S0_MMC6.bp_grp_nm.like(bind("cst_grp_nm6")))),
				when(boundOr("cst_grp_flg7"))
					.select(DS0C_CST_GRP, S0_M5.bp_grp_cd7.as("cst_grp_cd7"), S0_MMC7.bp_grp_nm.as("cst_grp_nm7"))
					.view(DS0C_CST_GRP, v -> v.leftOuterJoin(S0_MMC7).on(S0_M5.bp_grp_cd7.eq(S0_MMC7.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP7.value()).eq(S0_MMC7.bp_grp_typ))))
					.predicate(DS0C_CST_GRP, p -> p.cutoff$and(S0_M5.bp_grp_cd7.like(bind("cst_grp_cd7"))).cutoff$and(S0_MMC7.bp_grp_nm.like(bind("cst_grp_nm7")))),
				when(boundOr("cst_grp_flg8"))
					.select(DS0C_CST_GRP, S0_M5.bp_grp_cd8.as("cst_grp_cd8"), S0_MMC8.bp_grp_nm.as("cst_grp_nm8"))
					.view(DS0C_CST_GRP, v -> v.leftOuterJoin(S0_MMC8).on(S0_M5.bp_grp_cd8.eq(S0_MMC8.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP8.value()).eq(S0_MMC8.bp_grp_typ))))
					.predicate(DS0C_CST_GRP, p -> p.cutoff$and(S0_M5.bp_grp_cd8.like(bind("cst_grp_cd8"))).cutoff$and(S0_MMC8.bp_grp_nm.like(bind("cst_grp_nm8")))),
				when(boundOr("cst_grp_flg9"))
					.select(DS0C_CST_GRP, S0_M5.bp_grp_cd9.as("cst_grp_cd9"), S0_MMC9.bp_grp_nm.as("cst_grp_nm9"))
					.view(DS0C_CST_GRP, v -> v.leftOuterJoin(S0_MMC9).on(S0_M5.bp_grp_cd9.eq(S0_MMC9.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP9.value()).eq(S0_MMC9.bp_grp_typ))))
					.predicate(DS0C_CST_GRP, p -> p.cutoff$and(S0_M5.bp_grp_cd9.like(bind("cst_grp_cd9"))).cutoff$and(S0_MMC9.bp_grp_nm.like(bind("cst_grp_nm9")))),
				when(boundOr("cst_grp_flg10"))
					.select(DS0C_CST_GRP, S0_M5.bp_grp_cd10.as("cst_grp_cd10"), S0_MMC10.bp_grp_nm.as("cst_grp_nm10"))
					.view(DS0C_CST_GRP, v -> v.leftOuterJoin(S0_MMC10).on(S0_M5.bp_grp_cd10.eq(S0_MMC10.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP10.value()).eq(S0_MMC10.bp_grp_typ))))
					.predicate(DS0C_CST_GRP, p -> p.cutoff$and(S0_M5.bp_grp_cd10.like(bind("cst_grp_cd10"))).cutoff$and(S0_MMC10.bp_grp_nm.like(bind("cst_grp_nm10")))),
				when(boundOr("dlv_grp_flg1"))
					.select(DS0C_DLV_GRP, S0_V1.pr(S0_M21.bp_grp_cd1).as("dlv_grp_cd1"), S0_MMD1.bp_grp_nm.as("dlv_grp_nm1"))
					.view(DS0C_DLV_GRP, v -> v.leftOuterJoin(S0_MMD1).on(S0_V1.pr(S0_M21.bp_grp_cd1).eq(S0_MMD1.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP1.value()).eq(S0_MMD1.bp_grp_typ))))
					.predicate(DS0C_DLV_GRP, p -> p.cutoff$and(S0_V1.pr(S0_M21.bp_grp_cd1).like(bind("dlv_grp_cd1"))).cutoff$and(S0_MMD1.bp_grp_nm.like(bind("dlv_grp_nm1")))),
				when(boundOr("dlv_grp_flg2"))
					.select(DS0C_DLV_GRP, S0_V1.pr(S0_M21.bp_grp_cd2).as("dlv_grp_cd2"), S0_MMD2.bp_grp_nm.as("dlv_grp_nm2"))
					.view(DS0C_DLV_GRP, v -> v.leftOuterJoin(S0_MMD2).on(S0_V1.pr(S0_M21.bp_grp_cd2).eq(S0_MMD2.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP2.value()).eq(S0_MMD2.bp_grp_typ))))
					.predicate(DS0C_DLV_GRP, p -> p.cutoff$and(S0_V1.pr(S0_M21.bp_grp_cd2).like(bind("dlv_grp_cd2"))).cutoff$and(S0_MMD2.bp_grp_nm.like(bind("dlv_grp_nm2")))),
				when(boundOr("dlv_grp_flg3"))
					.select(DS0C_DLV_GRP, S0_V1.pr(S0_M21.bp_grp_cd3).as("dlv_grp_cd3"), S0_MMD3.bp_grp_nm.as("dlv_grp_nm3"))
					.view(DS0C_DLV_GRP, v -> v.leftOuterJoin(S0_MMD3).on(S0_V1.pr(S0_M21.bp_grp_cd3).eq(S0_MMD3.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP3.value()).eq(S0_MMD3.bp_grp_typ))))
					.predicate(DS0C_DLV_GRP, p -> p.cutoff$and(S0_V1.pr(S0_M21.bp_grp_cd3).like(bind("dlv_grp_cd3"))).cutoff$and(S0_MMD3.bp_grp_nm.like(bind("dlv_grp_nm3")))),
				when(boundOr("dlv_grp_flg4"))
					.select(DS0C_DLV_GRP, S0_V1.pr(S0_M21.bp_grp_cd4).as("dlv_grp_cd4"), S0_MMD4.bp_grp_nm.as("dlv_grp_nm4"))
					.view(DS0C_DLV_GRP, v -> v.leftOuterJoin(S0_MMD4).on(S0_V1.pr(S0_M21.bp_grp_cd4).eq(S0_MMD4.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP4.value()).eq(S0_MMD4.bp_grp_typ))))
					.predicate(DS0C_DLV_GRP, p -> p.cutoff$and(S0_V1.pr(S0_M21.bp_grp_cd4).like(bind("dlv_grp_cd4"))).cutoff$and(S0_MMD4.bp_grp_nm.like(bind("dlv_grp_nm4")))),
				when(boundOr("dlv_grp_flg5"))
					.select(DS0C_DLV_GRP, S0_V1.pr(S0_M21.bp_grp_cd5).as("dlv_grp_cd5"), S0_MMD5.bp_grp_nm.as("dlv_grp_nm5"))
					.view(DS0C_DLV_GRP, v -> v.leftOuterJoin(S0_MMD5).on(S0_V1.pr(S0_M21.bp_grp_cd5).eq(S0_MMD5.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP5.value()).eq(S0_MMD5.bp_grp_typ))))
					.predicate(DS0C_DLV_GRP, p -> p.cutoff$and(S0_V1.pr(S0_M21.bp_grp_cd5).like(bind("dlv_grp_cd5"))).cutoff$and(S0_MMD5.bp_grp_nm.like(bind("dlv_grp_nm5")))),
				when(boundOr("dlv_grp_flg6"))
					.select(DS0C_DLV_GRP, S0_V1.pr(S0_M21.bp_grp_cd6).as("dlv_grp_cd6"), S0_MMD6.bp_grp_nm.as("dlv_grp_nm6"))
					.view(DS0C_DLV_GRP, v -> v.leftOuterJoin(S0_MMD6).on(S0_V1.pr(S0_M21.bp_grp_cd6).eq(S0_MMD6.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP6.value()).eq(S0_MMD6.bp_grp_typ))))
					.predicate(DS0C_DLV_GRP, p -> p.cutoff$and(S0_V1.pr(S0_M21.bp_grp_cd6).like(bind("dlv_grp_cd6"))).cutoff$and(S0_MMD6.bp_grp_nm.like(bind("dlv_grp_nm6")))),
				when(boundOr("dlv_grp_flg7"))
					.select(DS0C_DLV_GRP, S0_V1.pr(S0_M21.bp_grp_cd7).as("dlv_grp_cd7"), S0_MMD7.bp_grp_nm.as("dlv_grp_nm7"))
					.view(DS0C_DLV_GRP, v -> v.leftOuterJoin(S0_MMD7).on(S0_V1.pr(S0_M21.bp_grp_cd7).eq(S0_MMD7.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP7.value()).eq(S0_MMD7.bp_grp_typ))))
					.predicate(DS0C_DLV_GRP, p -> p.cutoff$and(S0_V1.pr(S0_M21.bp_grp_cd7).like(bind("dlv_grp_cd7"))).cutoff$and(S0_MMD7.bp_grp_nm.like(bind("dlv_grp_nm7")))),
				when(boundOr("dlv_grp_flg8"))
					.select(DS0C_DLV_GRP, S0_V1.pr(S0_M21.bp_grp_cd8).as("dlv_grp_cd8"), S0_MMD8.bp_grp_nm.as("dlv_grp_nm8"))
					.view(DS0C_DLV_GRP, v -> v.leftOuterJoin(S0_MMD8).on(S0_V1.pr(S0_M21.bp_grp_cd8).eq(S0_MMD8.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP8.value()).eq(S0_MMD8.bp_grp_typ))))
					.predicate(DS0C_DLV_GRP, p -> p.cutoff$and(S0_V1.pr(S0_M21.bp_grp_cd8).like(bind("dlv_grp_cd8"))).cutoff$and(S0_MMD8.bp_grp_nm.like(bind("dlv_grp_nm8")))),
				when(boundOr("dlv_grp_flg9"))
					.select(DS0C_DLV_GRP, S0_V1.pr(S0_M21.bp_grp_cd9).as("dlv_grp_cd9"), S0_MMD9.bp_grp_nm.as("dlv_grp_nm9"))
					.view(DS0C_DLV_GRP, v -> v.leftOuterJoin(S0_MMD9).on(S0_V1.pr(S0_M21.bp_grp_cd9).eq(S0_MMD9.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP9.value()).eq(S0_MMD9.bp_grp_typ))))
					.predicate(DS0C_DLV_GRP, p -> p.cutoff$and(S0_V1.pr(S0_M21.bp_grp_cd9).like(bind("dlv_grp_cd9"))).cutoff$and(S0_MMD9.bp_grp_nm.like(bind("dlv_grp_nm9")))),
				when(boundOr("dlv_grp_flg10"))
					.select(DS0C_DLV_GRP, S0_V1.pr(S0_M21.bp_grp_cd10).as("dlv_grp_cd10"), S0_MMD10.bp_grp_nm.as("dlv_grp_nm10"))
					.view(DS0C_DLV_GRP, v -> v.leftOuterJoin(S0_MMD10).on(S0_V1.pr(S0_M21.bp_grp_cd10).eq(S0_MMD10.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP10.value()).eq(S0_MMD10.bp_grp_typ))))
					.predicate(DS0C_DLV_GRP, p -> p.cutoff$and(S0_V1.pr(S0_M21.bp_grp_cd10).like(bind("dlv_grp_cd10"))).cutoff$and(S0_MMD10.bp_grp_nm.like(bind("dlv_grp_nm10")))),
				when(boundOr("itm_grp_flg1"))
					.select(DS0C_ITM_GRP, S0_V1.pr(S0_M28.itm_grp_cd1).as("itm_grp_cd1"), S0_MMI1.itm_grp_nm.as("itm_grp_nm1"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MMI1).on(S0_V1.pr(S0_M28.itm_grp_cd1).eq(S0_MMI1.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP1.value()).eq(S0_MMI1.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_V1.pr(S0_M28.itm_grp_cd1).like(bind("itm_grp_cd1"))).cutoff$and(S0_MMI1.itm_grp_nm.like(bind("itm_grp_nm1")))),
				when(boundOr("itm_grp_flg2"))
					.select(DS0C_ITM_GRP, S0_V1.pr(S0_M28.itm_grp_cd2).as("itm_grp_cd2"), S0_MMI2.itm_grp_nm.as("itm_grp_nm2"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MMI2).on(S0_V1.pr(S0_M28.itm_grp_cd2).eq(S0_MMI2.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP2.value()).eq(S0_MMI2.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_V1.pr(S0_M28.itm_grp_cd2).like(bind("itm_grp_cd2"))).cutoff$and(S0_MMI2.itm_grp_nm.like(bind("itm_grp_nm2")))),
				when(boundOr("itm_grp_flg3"))
					.select(DS0C_ITM_GRP, S0_V1.pr(S0_M28.itm_grp_cd3).as("itm_grp_cd3"), S0_MMI3.itm_grp_nm.as("itm_grp_nm3"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MMI3).on(S0_V1.pr(S0_M28.itm_grp_cd3).eq(S0_MMI3.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP3.value()).eq(S0_MMI3.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_V1.pr(S0_M28.itm_grp_cd3).like(bind("itm_grp_cd3"))).cutoff$and(S0_MMI3.itm_grp_nm.like(bind("itm_grp_nm3")))),
				when(boundOr("itm_grp_flg4"))
					.select(DS0C_ITM_GRP, S0_V1.pr(S0_M28.itm_grp_cd4).as("itm_grp_cd4"), S0_MMI4.itm_grp_nm.as("itm_grp_nm4"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MMI4).on(S0_V1.pr(S0_M28.itm_grp_cd4).eq(S0_MMI4.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP4.value()).eq(S0_MMI4.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_V1.pr(S0_M28.itm_grp_cd4).like(bind("itm_grp_cd4"))).cutoff$and(S0_MMI4.itm_grp_nm.like(bind("itm_grp_nm4")))),
				when(boundOr("itm_grp_flg5"))
					.select(DS0C_ITM_GRP, S0_V1.pr(S0_M28.itm_grp_cd5).as("itm_grp_cd5"), S0_MMI5.itm_grp_nm.as("itm_grp_nm5"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MMI5).on(S0_V1.pr(S0_M28.itm_grp_cd5).eq(S0_MMI5.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP5.value()).eq(S0_MMI5.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_V1.pr(S0_M28.itm_grp_cd5).like(bind("itm_grp_cd5"))).cutoff$and(S0_MMI5.itm_grp_nm.like(bind("itm_grp_nm5")))),
				when(boundOr("itm_grp_flg6"))
					.select(DS0C_ITM_GRP, S0_V1.pr(S0_M28.itm_grp_cd6).as("itm_grp_cd6"), S0_MMI6.itm_grp_nm.as("itm_grp_nm6"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MMI6).on(S0_V1.pr(S0_M28.itm_grp_cd6).eq(S0_MMI6.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP6.value()).eq(S0_MMI6.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_V1.pr(S0_M28.itm_grp_cd6).like(bind("itm_grp_cd6"))).cutoff$and(S0_MMI6.itm_grp_nm.like(bind("itm_grp_nm6")))),
				when(boundOr("itm_grp_flg7"))
					.select(DS0C_ITM_GRP, S0_V1.pr(S0_M28.itm_grp_cd7).as("itm_grp_cd7"), S0_MMI7.itm_grp_nm.as("itm_grp_nm7"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MMI7).on(S0_V1.pr(S0_M28.itm_grp_cd7).eq(S0_MMI7.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP7.value()).eq(S0_MMI7.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_V1.pr(S0_M28.itm_grp_cd7).like(bind("itm_grp_cd7"))).cutoff$and(S0_MMI7.itm_grp_nm.like(bind("itm_grp_nm7")))),
				when(boundOr("itm_grp_flg8"))
					.select(DS0C_ITM_GRP, S0_V1.pr(S0_M28.itm_grp_cd8).as("itm_grp_cd8"), S0_MMI8.itm_grp_nm.as("itm_grp_nm8"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MMI8).on(S0_V1.pr(S0_M28.itm_grp_cd8).eq(S0_MMI8.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP8.value()).eq(S0_MMI8.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_V1.pr(S0_M28.itm_grp_cd8).like(bind("itm_grp_cd8"))).cutoff$and(S0_MMI8.itm_grp_nm.like(bind("itm_grp_nm8")))),
				when(boundOr("itm_grp_flg9"))
					.select(DS0C_ITM_GRP, S0_V1.pr(S0_M28.itm_grp_cd9).as("itm_grp_cd9"), S0_MMI9.itm_grp_nm.as("itm_grp_nm9"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MMI9).on(S0_V1.pr(S0_M28.itm_grp_cd9).eq(S0_MMI9.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP9.value()).eq(S0_MMI9.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_V1.pr(S0_M28.itm_grp_cd9).like(bind("itm_grp_cd9"))).cutoff$and(S0_MMI9.itm_grp_nm.like(bind("itm_grp_nm9")))),
				when(boundOr("itm_grp_flg10"))
					.select(DS0C_ITM_GRP, S0_V1.pr(S0_M28.itm_grp_cd10).as("itm_grp_cd10"), S0_MMI10.itm_grp_nm.as("itm_grp_nm10"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MMI10).on(S0_V1.pr(S0_M28.itm_grp_cd10).eq(S0_MMI10.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP10.value()).eq(S0_MMI10.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_V1.pr(S0_M28.itm_grp_cd10).like(bind("itm_grp_cd10"))).cutoff$and(S0_MMI10.itm_grp_nm.like(bind("itm_grp_nm10"))))
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
						.add(MAM_BP_R.class, r -> toCondition(
							r.getStringNE("cst_cd")
						))
						.addSelect(m -> toArray(
							m.acst_cd,
							m.bp_nm,
							m.cst_iv_flg
						))
						.addMap((r, m) -> {
							r.setStringNE("cst_nm", m.bp_nm());
							r.setStringNE("acst_cd", m.acst_cd());
							r.setBooleanNE("cst_iv_flg", m.cst_iv_flg());
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
						))
						.addMap((r, m) -> {
							r.setNumberNE("trd_unit_dec_place", m.dec_place());
							r.setNumberNE("trd_unit_conv_base_qty", m.conv_base_qty());
							r.setNumberNE("trd_unit_conv_qty", m.conv_qty());
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
							m.tax_nm,
							m.tax_rate
						))
						.addMap((r, m) -> {
							r.setStringNE("tax_nm", m.tax_nm());
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
							m.biz_rsn_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("sls_rsn_nm", m.biz_rsn_nm());
					}),
					j -> j
						.add(MST_SLO_RSN_R.class, r -> toCondition(
							r.getStringNE("slo_d_can_rsn_cd")
						))
						.addSelect(m -> toArray(
							m.slo_rsn_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("slo_d_can_rsn_nm", m.slo_rsn_nm());
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
						.add(MAM_BP_R.class, r -> toCondition(
							r.getStringNE("dlv_cd")
						))
						.addSelect(m -> toArray(
							m.cntry_cd
						))
						.addMap((r, m) -> {
							r.setStringNE("dlv_cntry_cd", m.cntry_cd());
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
						.add(MAM_BP_R.class, r -> toCondition(
							r.getStringNE("tdlv_cd")
						))
						.addSelect(m -> toArray(
							m.cntry_cd
						))
						.addMap((r, m) -> {
							r.setStringNE("tdlv_cntry_cd", m.cntry_cd());
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
	 * -- MSBBL1220_MST_SLO_D_Query_S02
	 */
	static MCQueryPlan MSBBL1220_MST_SLO_D_S02() {
		MST_SLO_D_R S0_T1 = MST_SLO_D_R.create("T1");
		MSW_SLO_D_KEY_R S0_W1 = MSW_SLO_D_KEY_R.create("W1");
		MST_WG_RQST_R S1_ST1 = MST_WG_RQST_R.create("ST1");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBBL1220_MST_SLO_D_Query_S02")
					.mainQuery()
					.select(
						S0_T1.slo_d_no,
						S0_T1.rqst_qty,
						S0_T1.rqst_unit_cd,
						S0_T1.base_unit_cd,
						S0_T1.itm_cd.as("join_itm_cd_"),
						S0_T1.itm_sub1.as("join_itm_sub1_"),
						S0_T1.itm_sub2.as("join_itm_sub2_"),
						S0_T1.itm_sub3.as("join_itm_sub3_")
					)
					.from(
						S0_T1
						.innerJoin(S0_W1).on(S0_W1.slo_d_no.eq(S0_T1.slo_d_no))
					)
					.where(
						value(0).eq(value(0))
						.and(S0_T1.abort_flg.eq(value(false)))
						.and(
							exists(
								subQuery()
								.select(value("X"))
								.from(S1_ST1)
								.where(
									value(0).eq(value(0))
									.and(S1_ST1.can_flg.eq(value(false)))
									.and(
										S1_ST1.wg_rqst_typ.in(
											value(MSC_WG_RQST_TYP.PURC.value()),
											value(MSC_WG_RQST_TYP.XFR.value())
										)
									)
									.and(S1_ST1.slo_d_no.eq(S0_T1.slo_d_no))
								)
							)
						)
					)
			)
			.setJoinInfo(
				joinInfo(
					j -> j
						.add(MAVM_ITM_UNIT_R.class, r -> toCondition(
							r.getStringNE("join_itm_cd_"),
							r.getStringNE("join_itm_sub1_"),
							r.getStringNE("join_itm_sub2_"),
							r.getStringNE("join_itm_sub3_"),
							r.getStringNE("rqst_unit_cd")
						))
						.addSelect(m -> toArray(
							m.conv_base_qty,
							m.conv_qty
						))
						.addMap((r, m) -> {
							r.setNumberNE("conv_base_qty", m.conv_base_qty());
							r.setNumberNE("conv_qty", m.conv_qty());
					}),
					j -> j
						.add(MAVM_ITM_UNIT_R.class, r -> toCondition(
							r.getStringNE("join_itm_cd_"),
							r.getStringNE("join_itm_sub1_"),
							r.getStringNE("join_itm_sub2_"),
							r.getStringNE("join_itm_sub3_"),
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
	 * -- MSBBL1220_MST_SLO_Query_S01
	 */
	static MCQueryPlan MSBBL1220_MST_SLO_S01() {
		MST_SLO_R S0_T1 = MST_SLO_R.create("T1");
		MST_WRK_R S0_T2 = MST_WRK_R.create("T2");
		MAM_TRD_R S0_M1 = MAM_TRD_R.create("M1");
		MAM_USR_R S0_M2 = MAM_USR_R.create("M2");
		MAM_DPT_R S0_M3 = MAM_DPT_R.create("M3");
		MAM_WG_R S0_M4 = MAM_WG_R.create("M4");
		MAM_BP_R S0_M5 = MAM_BP_R.create("M5");
		MAM_CUR_R S0_M6 = MAM_CUR_R.create("M6");
		MAM_CO_R S0_M7 = MAM_CO_R.create("M7");
		MAM_DPT_R S0_M11 = MAM_DPT_R.create("M11");
		MAM_USR_R S0_M19 = MAM_USR_R.create("M19");
		MST_SLO_RSN_R S0_M20 = MST_SLO_RSN_R.create("M20");
		MAVM_RD_DPT_R S0_DAC = MAVM_RD_DPT_R.create("DAC");
		MAM_BP_GRP_R S0_MMC1 = MAM_BP_GRP_R.create("MMC1");
		MAM_BP_GRP_R S0_MMC2 = MAM_BP_GRP_R.create("MMC2");
		MAM_BP_GRP_R S0_MMC3 = MAM_BP_GRP_R.create("MMC3");
		MAM_BP_GRP_R S0_MMC4 = MAM_BP_GRP_R.create("MMC4");
		MAM_BP_GRP_R S0_MMC5 = MAM_BP_GRP_R.create("MMC5");
		MAM_BP_GRP_R S0_MMC6 = MAM_BP_GRP_R.create("MMC6");
		MAM_BP_GRP_R S0_MMC7 = MAM_BP_GRP_R.create("MMC7");
		MAM_BP_GRP_R S0_MMC8 = MAM_BP_GRP_R.create("MMC8");
		MAM_BP_GRP_R S0_MMC9 = MAM_BP_GRP_R.create("MMC9");
		MAM_BP_GRP_R S0_MMC10 = MAM_BP_GRP_R.create("MMC10");
		
		MCDynamicSQLID DS0C_CST_GRP = createDynamicSQLID("DS0C_CST_GRP");
		MST_SLO_D_P_R S0_T3 = MST_SLO_D_P_R.create("S0_T3");
		MAM_ITM_R itmR = MAM_ITM_R.create("ITM");
		MCTempView S0_T3_TempView = createTempView("S0_T3_View");
		MCSingleView S0_T3_View = subQuery().select(
				S0_T3.slo_no,
				S0_T3.slo_rev,
				S0_T3.can_flg,
				sum(
					decode(
						itmR.dscnt_itm_flg,
						value(true),
						S0_T3.trd_cur_amt.multiply(value(-1)).add(
							bracket(
								S0_T3.trd_cur_tax_amt.multiply(value(-1))
							)
						),
						S0_T3.trd_cur_amt.add(S0_T3.trd_cur_tax_amt))
				).as("trd_cur_inc_tax_amt")
			)
			.from(
				S0_T3
				.leftOuterJoin(itmR).on(
					bracket(
						S0_T3.itm_cd.eq(itmR.itm_cd)
						.and(S0_T3.itm_sub1.eq(itmR.itm_sub1))
						.and(S0_T3.itm_sub2.eq(itmR.itm_sub2))
						.and(S0_T3.itm_sub3.eq(itmR.itm_sub3))
					)
				)
			)
			.groupBy(
				S0_T3.slo_no,
				S0_T3.slo_rev,
				S0_T3.can_flg).view(S0_T3_TempView);
		
		return createQueryPlan()
			.setQuery(
				sql("MSBBL1220_MST_SLO_Query_S01")
					.mainQuery()
					.select(
						S0_T1.trd_cd,
						S0_T1.trd_ptn_typ,
						S0_T1.slo_no,
						S0_T1.slo_rev,
						S0_T1.slo_dt,
						S0_T1.edi_flg,
						S0_T1.sls_usr_cd,
						S0_T1.sls_dpt_cd,
						S0_M3.dpt_nm.as("sls_dpt_nm"),
						S0_T1.wg_cd,
						S0_T1.cst_cd,
						S0_T1.sls_basis_typ,
						S0_T1.trd_cur_cd,
						S0_T1.xrate_inpt_flg,
						S0_T1.xrate,
						S0_M7.base_cur_cd,
						S0_M7.ptax_cur_cd,
						S0_T1.ptax_xrate_inpt_flg,
						S0_T1.ptax_xrate,
						S0_T1.assort_typ,
						S0_T1.slo_typ,
						S0_T1.cst_po_no,
						S0_T1.cst_po_rev,
						S0_T1.ar_dpt_cd,
						S0_M11.dpt_nm.as("ar_dpt_nm"),
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
						S0_T1.qtn_no,
						S0_T1.qtn_rev,
						S0_T1.wrk_no,
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
						S0_T1.aprv_flg,
						S0_T1.aprv_no,
						S0_T1.aprv_sts_typ,
						S0_T1.can_flg,
						S0_T1.can_rsn_cd,
						S0_T1.can_rmrks,
						S0_T1.ins_usr_id,
						S0_T1.ins_usr_nm,
						S0_T1.ins_func_id,
						S0_T1.ins_ts,
						S0_T1.upd_usr_id,
						S0_T1.upd_usr_nm,
						S0_T1.upd_func_id,
						S0_T1.upd_ts,
						S0_T1.upd_srv_req_no,
						S0_T3_TempView.pr("trd_cur_inc_tax_amt"),
						addDynamicSelect(DS0C_CST_GRP)
					)
					.from(
						S0_T1
						.leftOuterJoin(S0_M3).on(
							bracket(
								S0_M3.dpt_cd.eq(S0_T1.sls_dpt_cd)
								.and(S0_T1.slo_dt.between(S0_M3.st_dt, S0_M3.end_dt))
							)
						)
						.leftOuterJoin(S0_M7).on(value(0).eq(value(0)))
						.leftOuterJoin(S0_M11).on(
							bracket(
								S0_M11.dpt_cd.eq(S0_T1.ar_dpt_cd)
								.and(S0_T1.slo_dt.between(S0_M11.st_dt, S0_M11.end_dt))
							)
						)
						.innerJoin(S0_DAC).on(S0_DAC.dpt_cd.eq(S0_T1.sls_dpt_cd))
						.leftOuterJoin(S0_T3_View)
						.on(
							value(0).eq(value(0))
							.and(S0_T3_TempView.pr(MST_SLO_D_P_R.$slo_no).eq(S0_T1.slo_no))
							.and(S0_T3_TempView.pr(MST_SLO_D_P_R.$slo_rev).eq(S0_T1.slo_rev))
							.and(S0_T3_TempView.pr(MST_SLO_D_P_R.$can_flg).eq(S0_T1.can_flg))
						)
						.addDynamicView()
						.addDynamicView(DS0C_CST_GRP)
					)
					.where(
						value(0).eq(value(0))
						.and(
							bracket(
								bind("aprv_flg_str").eq(value(true))
								.and(S0_T1.aprv_flg.eq(value(false)))
							)
							.cutoff$or(
								bracket(
									S0_T1.aprv_flg.eq(value(true))
									.and(S0_T1.aprv_sts_typ.like(bind("aprv_sts_typ")))
								)
							)
						)
						.cutoff$and(S0_T1.edi_flg.eq(bind("edi_flg_str")))
						.addDynamicPredicate()
						.cutoff$and(S0_T1.slo_dt.gte(bind("slo_dt_fr")))
						.cutoff$and(S0_T1.slo_dt.lte(bind("slo_dt_to")))
						.cutoff$and(S0_T1.rcpt_dt.gte(bind("rcpt_dt_fr")))
						.cutoff$and(S0_T1.rcpt_dt.lte(bind("rcpt_dt_to")))
						.cutoff$and(S0_T1.sls_usr_cd.like(bind("sls_usr_cd")))
						.cutoff$and(S0_T1.sls_dpt_cd.like(bind("sls_dpt_cd")))
						.cutoff$and(S0_M3.dpt_nm.like(bind("sls_dpt_nm")))
						.cutoff$and(S0_T1.wg_cd.like(bind("wg_cd")))
						.cutoff$and(S0_T1.trd_cd.like(bind("trd_cd")))
						.cutoff$and(S0_T1.slo_no.like(bind("slo_no")))
						.cutoff$and(S0_T1.qtn_no.like(bind("qtn_no")))
						.cutoff$and(S0_T1.qtn_rev.eq(bind("qtn_rev")))
						.cutoff$and(S0_T1.slo_typ.like(bind("slo_typ")))
						.cutoff$and(S0_T1.cst_cd.like(bind("cst_cd")))
						.cutoff$and(S0_T1.trd_cur_cd.like(bind("trd_cur_cd")))
						.cutoff$and(S0_T1.wrk_no.like(bind("wrk_no")))
						.cutoff$and(S0_T1.rcpt_usr_cd.like(bind("rcpt_usr_cd")))
						.cutoff$and(S0_T1.cst_po_no.like(bind("cst_po_no")))
						.cutoff$and(S0_T1.sls_basis_typ.like(bind("sls_basis_typ")))
						.cutoff$and(S0_T1.aprv_no.like(bind("aprv_no")))
						.cutoff$and(S0_T1.can_rsn_cd.like(bind("can_rsn_cd")))
						.cutoff$and(S0_T1.cst_po_rmrks.like(bind("cst_po_rmrks")))
						.cutoff$and(S0_T1.trd_rmrks.like(bind("trd_rmrks")))
						.cutoff$and(S0_T1.intr_rmrks.like(bind("intr_rmrks")))
						.cutoff$and(S0_T1.sub_char1.like(bind("sub_char1")))
						.cutoff$and(S0_T1.sub_char2.like(bind("sub_char2")))
						.cutoff$and(S0_T1.sub_char3.like(bind("sub_char3")))
						.cutoff$and(S0_T1.can_flg.eq(bind("inc_can_flg_str")))
						.addDynamicPredicate(DS0C_CST_GRP)
					)
					.orderBy(S0_T1.slo_no.asc())
			)
			.setDynamicSQLInfo(
				when(boundOr("wrk_nm"))
					.view(v -> v.leftOuterJoin(S0_T2).on(S0_T2.wrk_no.eq(S0_T1.wrk_no)))
					.predicate(p -> p.cutoff$and(S0_T2.wrk_nm.like(bind("wrk_nm")))),
				when(boundOr("trd_nm"))
					.view(v -> v.leftOuterJoin(S0_M1).on(S0_M1.trd_cd.eq(S0_T1.trd_cd)))
					.predicate(p -> p.cutoff$and(S0_M1.trd_nm.like(bind("trd_nm")))),
				when(boundOr("sls_usr_nm"))
					.view(v -> v.leftOuterJoin(S0_M2).on(S0_M2.usr_cd.eq(S0_T1.sls_usr_cd)))
					.predicate(p -> p.cutoff$and(S0_M2.usr_nm.like(bind("sls_usr_nm")))),
				when(boundOr("wg_nm"))
					.view(v -> v.leftOuterJoin(S0_M4).on(S0_M4.wg_cd.eq(S0_T1.wg_cd)))
					.predicate(p -> p.cutoff$and(S0_M4.wg_nm.like(bind("wg_nm")))),
				when(boundOr("cst_grp_flg1", "cst_grp_flg2", "cst_grp_flg3", "cst_grp_flg4", "cst_grp_flg5", "cst_grp_flg6", "cst_grp_flg7", "cst_grp_flg8", "cst_grp_flg9", "cst_grp_flg10", "iv_trd_flg_str", "cst_nm"))
					.view(v -> v.leftOuterJoin(S0_M5).on(S0_M5.bp_cd.eq(S0_T1.cst_cd)))
					.predicate(p -> p.cutoff$and(S0_M5.cst_iv_flg.eq(bind("iv_trd_flg_str"))).cutoff$and(S0_M5.bp_nm.like(bind("cst_nm")))),
				when(boundOr("trd_cur_nm"))
					.view(v -> v.leftOuterJoin(S0_M6).on(S0_M6.cur_cd.eq(S0_T1.trd_cur_cd)))
					.predicate(p -> p.cutoff$and(S0_M6.cur_nm.like(bind("trd_cur_nm")))),
				when(boundOr("rcpt_usr_nm"))
					.view(v -> v.leftOuterJoin(S0_M19).on(S0_M19.usr_cd.eq(S0_T1.rcpt_usr_cd)))
					.predicate(p -> p.cutoff$and(S0_M19.usr_nm.like(bind("rcpt_usr_nm")))),
				when(boundOr("can_rsn_nm"))
					.view(v -> v.leftOuterJoin(S0_M20).on(S0_M20.slo_rsn_cd.eq(S0_T1.can_rsn_cd)))
					.predicate(p -> p.cutoff$and(S0_M20.slo_rsn_nm.like(bind("can_rsn_nm")))),
				when(boundOr("cst_grp_flg1"))
					.select(DS0C_CST_GRP, S0_M5.bp_grp_cd1.as("cst_grp_cd1"), S0_MMC1.bp_grp_nm.as("cst_grp_nm1"))
					.view(DS0C_CST_GRP, v -> v.leftOuterJoin(S0_MMC1).on(S0_M5.bp_grp_cd1.eq(S0_MMC1.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP1.value()).eq(S0_MMC1.bp_grp_typ))))
					.predicate(DS0C_CST_GRP, p -> p.cutoff$and(S0_M5.bp_grp_cd1.like(bind("cst_grp_cd1"))).cutoff$and(S0_MMC1.bp_grp_nm.like(bind("cst_grp_nm1")))),
				when(boundOr("cst_grp_flg2"))
					.select(DS0C_CST_GRP, S0_M5.bp_grp_cd2.as("cst_grp_cd2"), S0_MMC2.bp_grp_nm.as("cst_grp_nm2"))
					.view(DS0C_CST_GRP, v -> v.leftOuterJoin(S0_MMC2).on(S0_M5.bp_grp_cd2.eq(S0_MMC2.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP2.value()).eq(S0_MMC2.bp_grp_typ))))
					.predicate(DS0C_CST_GRP, p -> p.cutoff$and(S0_M5.bp_grp_cd2.like(bind("cst_grp_cd2"))).cutoff$and(S0_MMC2.bp_grp_nm.like(bind("cst_grp_nm2")))),
				when(boundOr("cst_grp_flg3"))
					.select(DS0C_CST_GRP, S0_M5.bp_grp_cd3.as("cst_grp_cd3"), S0_MMC3.bp_grp_nm.as("cst_grp_nm3"))
					.view(DS0C_CST_GRP, v -> v.leftOuterJoin(S0_MMC3).on(S0_M5.bp_grp_cd3.eq(S0_MMC3.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP3.value()).eq(S0_MMC3.bp_grp_typ))))
					.predicate(DS0C_CST_GRP, p -> p.cutoff$and(S0_M5.bp_grp_cd3.like(bind("cst_grp_cd3"))).cutoff$and(S0_MMC3.bp_grp_nm.like(bind("cst_grp_nm3")))),
				when(boundOr("cst_grp_flg4"))
					.select(DS0C_CST_GRP, S0_M5.bp_grp_cd4.as("cst_grp_cd4"), S0_MMC4.bp_grp_nm.as("cst_grp_nm4"))
					.view(DS0C_CST_GRP, v -> v.leftOuterJoin(S0_MMC4).on(S0_M5.bp_grp_cd4.eq(S0_MMC4.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP4.value()).eq(S0_MMC4.bp_grp_typ))))
					.predicate(DS0C_CST_GRP, p -> p.cutoff$and(S0_M5.bp_grp_cd4.like(bind("cst_grp_cd4"))).cutoff$and(S0_MMC4.bp_grp_nm.like(bind("cst_grp_nm4")))),
				when(boundOr("cst_grp_flg5"))
					.select(DS0C_CST_GRP, S0_M5.bp_grp_cd5.as("cst_grp_cd5"), S0_MMC5.bp_grp_nm.as("cst_grp_nm5"))
					.view(DS0C_CST_GRP, v -> v.leftOuterJoin(S0_MMC5).on(S0_M5.bp_grp_cd5.eq(S0_MMC5.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP5.value()).eq(S0_MMC5.bp_grp_typ))))
					.predicate(DS0C_CST_GRP, p -> p.cutoff$and(S0_M5.bp_grp_cd5.like(bind("cst_grp_cd5"))).cutoff$and(S0_MMC5.bp_grp_nm.like(bind("cst_grp_nm5")))),
				when(boundOr("cst_grp_flg6"))
					.select(DS0C_CST_GRP, S0_M5.bp_grp_cd6.as("cst_grp_cd6"), S0_MMC6.bp_grp_nm.as("cst_grp_nm6"))
					.view(DS0C_CST_GRP, v -> v.leftOuterJoin(S0_MMC6).on(S0_M5.bp_grp_cd6.eq(S0_MMC6.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP6.value()).eq(S0_MMC6.bp_grp_typ))))
					.predicate(DS0C_CST_GRP, p -> p.cutoff$and(S0_M5.bp_grp_cd6.like(bind("cst_grp_cd6"))).cutoff$and(S0_MMC6.bp_grp_nm.like(bind("cst_grp_nm6")))),
				when(boundOr("cst_grp_flg7"))
					.select(DS0C_CST_GRP, S0_M5.bp_grp_cd7.as("cst_grp_cd7"), S0_MMC7.bp_grp_nm.as("cst_grp_nm7"))
					.view(DS0C_CST_GRP, v -> v.leftOuterJoin(S0_MMC7).on(S0_M5.bp_grp_cd7.eq(S0_MMC7.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP7.value()).eq(S0_MMC7.bp_grp_typ))))
					.predicate(DS0C_CST_GRP, p -> p.cutoff$and(S0_M5.bp_grp_cd7.like(bind("cst_grp_cd7"))).cutoff$and(S0_MMC7.bp_grp_nm.like(bind("cst_grp_nm7")))),
				when(boundOr("cst_grp_flg8"))
					.select(DS0C_CST_GRP, S0_M5.bp_grp_cd8.as("cst_grp_cd8"), S0_MMC8.bp_grp_nm.as("cst_grp_nm8"))
					.view(DS0C_CST_GRP, v -> v.leftOuterJoin(S0_MMC8).on(S0_M5.bp_grp_cd8.eq(S0_MMC8.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP8.value()).eq(S0_MMC8.bp_grp_typ))))
					.predicate(DS0C_CST_GRP, p -> p.cutoff$and(S0_M5.bp_grp_cd8.like(bind("cst_grp_cd8"))).cutoff$and(S0_MMC8.bp_grp_nm.like(bind("cst_grp_nm8")))),
				when(boundOr("cst_grp_flg9"))
					.select(DS0C_CST_GRP, S0_M5.bp_grp_cd9.as("cst_grp_cd9"), S0_MMC9.bp_grp_nm.as("cst_grp_nm9"))
					.view(DS0C_CST_GRP, v -> v.leftOuterJoin(S0_MMC9).on(S0_M5.bp_grp_cd9.eq(S0_MMC9.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP9.value()).eq(S0_MMC9.bp_grp_typ))))
					.predicate(DS0C_CST_GRP, p -> p.cutoff$and(S0_M5.bp_grp_cd9.like(bind("cst_grp_cd9"))).cutoff$and(S0_MMC9.bp_grp_nm.like(bind("cst_grp_nm9")))),
				when(boundOr("cst_grp_flg10"))
					.select(DS0C_CST_GRP, S0_M5.bp_grp_cd10.as("cst_grp_cd10"), S0_MMC10.bp_grp_nm.as("cst_grp_nm10"))
					.view(DS0C_CST_GRP, v -> v.leftOuterJoin(S0_MMC10).on(S0_M5.bp_grp_cd10.eq(S0_MMC10.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP10.value()).eq(S0_MMC10.bp_grp_typ))))
					.predicate(DS0C_CST_GRP, p -> p.cutoff$and(S0_M5.bp_grp_cd10.like(bind("cst_grp_cd10"))).cutoff$and(S0_MMC10.bp_grp_nm.like(bind("cst_grp_nm10"))))
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
						.add(MAM_BP_R.class, r -> toCondition(
							r.getStringNE("cst_cd")
						))
						.addSelect(m -> toArray(
							m.acst_cd,
							m.bp_nm,
							m.cst_iv_flg
						))
						.addMap((r, m) -> {
							r.setStringNE("cst_nm", m.bp_nm());
							r.setStringNE("acst_cd", m.acst_cd());
							r.setBooleanNE("cst_iv_flg", m.cst_iv_flg());
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
	
	static MCQueryPlan MSBBL1220_MST_SLO_S02() {
		MST_SLO_P_R S0_T1 = MST_SLO_P_R.create("T1");
		MST_WRK_R S0_T2 = MST_WRK_R.create("T2");
		MAM_TRD_R S0_M1 = MAM_TRD_R.create("M1");
		MAM_USR_R S0_M2 = MAM_USR_R.create("M2");
		MAM_DPT_R S0_M3 = MAM_DPT_R.create("M3");
		MAM_WG_R S0_M4 = MAM_WG_R.create("M4");
		MAM_BP_R S0_M5 = MAM_BP_R.create("M5");
		MAM_CUR_R S0_M6 = MAM_CUR_R.create("M6");
		MAM_CO_R S0_M7 = MAM_CO_R.create("M7");
		MAM_DPT_R S0_M11 = MAM_DPT_R.create("M11");
		MAM_USR_R S0_M19 = MAM_USR_R.create("M19");
		MST_SLO_RSN_R S0_M20 = MST_SLO_RSN_R.create("M20");
		MAVM_RD_DPT_R S0_DAC = MAVM_RD_DPT_R.create("DAC");
		MAM_BP_GRP_R S0_MMC1 = MAM_BP_GRP_R.create("MMC1");
		MAM_BP_GRP_R S0_MMC2 = MAM_BP_GRP_R.create("MMC2");
		MAM_BP_GRP_R S0_MMC3 = MAM_BP_GRP_R.create("MMC3");
		MAM_BP_GRP_R S0_MMC4 = MAM_BP_GRP_R.create("MMC4");
		MAM_BP_GRP_R S0_MMC5 = MAM_BP_GRP_R.create("MMC5");
		MAM_BP_GRP_R S0_MMC6 = MAM_BP_GRP_R.create("MMC6");
		MAM_BP_GRP_R S0_MMC7 = MAM_BP_GRP_R.create("MMC7");
		MAM_BP_GRP_R S0_MMC8 = MAM_BP_GRP_R.create("MMC8");
		MAM_BP_GRP_R S0_MMC9 = MAM_BP_GRP_R.create("MMC9");
		MAM_BP_GRP_R S0_MMC10 = MAM_BP_GRP_R.create("MMC10");
		
		MCDynamicSQLID DS0C_CST_GRP = createDynamicSQLID("DS0C_CST_GRP");

		MST_SLO_D_P_R S0_T3 = MST_SLO_D_P_R.create("S0_T3");
		MCTempView S0_T3_TempView = createTempView("S0_T3_View");
		MCSingleView S0_T3_View = subQuery().select(
				S0_T3.slo_no,
				S0_T3.slo_rev,
				S0_T3.can_flg,
				S0_T3.upd_srv_req_no,
				sum(S0_T3.trd_cur_amt).add(sum(S0_T3.trd_cur_tax_amt)).as("trd_cur_inc_tax_amt")
			)
			.from(
				S0_T3
			)
			.groupBy(
				S0_T3.slo_no,
				S0_T3.slo_rev,
				S0_T3.can_flg,
				S0_T3.upd_srv_req_no).view(S0_T3_TempView
			);
		
		return createQueryPlan()
			.setQuery(
				sql("MSBBL1220_MST_SLO_Query_S01")
					.mainQuery()
					.select(
						S0_T1.trd_cd,
						S0_T1.trd_ptn_typ,
						S0_T1.slo_no,
						S0_T1.slo_rev,
						S0_T1.slo_dt,
						S0_T1.edi_flg,
						S0_T1.sls_usr_cd,
						S0_T1.sls_dpt_cd,
						S0_M3.dpt_nm.as("sls_dpt_nm"),
						S0_T1.wg_cd,
						S0_T1.cst_cd,
						S0_T1.sls_basis_typ,
						S0_T1.trd_cur_cd,
						S0_T1.xrate_inpt_flg,
						S0_T1.xrate,
						S0_M7.base_cur_cd,
						S0_M7.ptax_cur_cd,
						S0_T1.ptax_xrate_inpt_flg,
						S0_T1.ptax_xrate,
						S0_T1.assort_typ,
						S0_T1.slo_typ,
						S0_T1.cst_po_no,
						S0_T1.cst_po_rev,
						S0_T1.ar_dpt_cd,
						S0_M11.dpt_nm.as("ar_dpt_nm"),
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
						S0_T1.qtn_no,
						S0_T1.qtn_rev,
						S0_T1.wrk_no,
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
						S0_T1.aprv_flg,
						S0_T1.aprv_no,
						S0_T1.aprv_sts_typ,
						S0_T1.can_flg,
						S0_T1.can_rsn_cd,
						S0_T1.can_rmrks,
						S0_T1.ins_usr_id,
						S0_T1.ins_usr_nm,
						S0_T1.ins_func_id,
						S0_T1.ins_ts,
						S0_T1.upd_usr_id,
						S0_T1.upd_usr_nm,
						S0_T1.upd_func_id,
						S0_T1.upd_ts,
						S0_T1.upd_srv_req_no,
						S0_T3_TempView.pr("trd_cur_inc_tax_amt"),
						addDynamicSelect(DS0C_CST_GRP)
					)
					.from(
						S0_T1
						.leftOuterJoin(S0_M3).on(
							bracket(
								S0_M3.dpt_cd.eq(S0_T1.sls_dpt_cd)
								.and(S0_T1.slo_dt.between(S0_M3.st_dt, S0_M3.end_dt))
							)
						)
						.leftOuterJoin(S0_M7).on(value(0).eq(value(0)))
						.leftOuterJoin(S0_M11).on(
							bracket(
								S0_M11.dpt_cd.eq(S0_T1.ar_dpt_cd)
								.and(S0_T1.slo_dt.between(S0_M11.st_dt, S0_M11.end_dt))
							)
						)
						.innerJoin(S0_DAC).on(S0_DAC.dpt_cd.eq(S0_T1.sls_dpt_cd))
						.leftOuterJoin(S0_T3_View)
						.on(
							value(0).eq(value(0))
							.and(S0_T3_TempView.pr(MST_SLO_D_P_R.$slo_no).eq(S0_T1.slo_no))
							.and(S0_T3_TempView.pr(MST_SLO_D_P_R.$slo_rev).eq(S0_T1.slo_rev))
							.and(S0_T3_TempView.pr(MST_SLO_D_P_R.$can_flg).eq(S0_T1.can_flg))
							.and(S0_T3_TempView.pr(MST_SLO_D_P_R.$upd_srv_req_no).eq(S0_T1.upd_srv_req_no))
						)
						.addDynamicView()
						.addDynamicView(DS0C_CST_GRP)
					)
					.where(
						value(0).eq(value(0))
						.and(
							bracket(
								bind("aprv_flg_str").eq(value(true))
								.and(S0_T1.aprv_flg.eq(value(false)))
							)
							.cutoff$or(
								bracket(
									S0_T1.aprv_flg.eq(value(true))
									.and(S0_T1.aprv_sts_typ.like(bind("aprv_sts_typ")))
								)
							)
						)
						.cutoff$and(S0_T1.edi_flg.eq(bind("edi_flg_str")))
						.addDynamicPredicate()
						.cutoff$and(S0_T1.slo_dt.gte(bind("slo_dt_fr")))
						.cutoff$and(S0_T1.slo_dt.lte(bind("slo_dt_to")))
						.cutoff$and(S0_T1.rcpt_dt.gte(bind("rcpt_dt_fr")))
						.cutoff$and(S0_T1.rcpt_dt.lte(bind("rcpt_dt_to")))
						.cutoff$and(S0_T1.sls_usr_cd.like(bind("sls_usr_cd")))
						.cutoff$and(S0_T1.sls_dpt_cd.like(bind("sls_dpt_cd")))
						.cutoff$and(S0_M3.dpt_nm.like(bind("sls_dpt_nm")))
						.cutoff$and(S0_T1.wg_cd.like(bind("wg_cd")))
						.cutoff$and(S0_T1.trd_cd.like(bind("trd_cd")))
						.cutoff$and(S0_T1.slo_no.like(bind("slo_no")))
						.cutoff$and(S0_T1.qtn_no.like(bind("qtn_no")))
						.cutoff$and(S0_T1.qtn_rev.eq(bind("qtn_rev")))
						.cutoff$and(S0_T1.slo_typ.like(bind("slo_typ")))
						.cutoff$and(S0_T1.cst_cd.like(bind("cst_cd")))
						.cutoff$and(S0_T1.trd_cur_cd.like(bind("trd_cur_cd")))
						.cutoff$and(S0_T1.wrk_no.like(bind("wrk_no")))
						.cutoff$and(S0_T1.rcpt_usr_cd.like(bind("rcpt_usr_cd")))
						.cutoff$and(S0_T1.cst_po_no.like(bind("cst_po_no")))
						.cutoff$and(S0_T1.sls_basis_typ.like(bind("sls_basis_typ")))
						.cutoff$and(S0_T1.aprv_no.like(bind("aprv_no")))
						.cutoff$and(S0_T1.can_rsn_cd.like(bind("can_rsn_cd")))
						.cutoff$and(S0_T1.cst_po_rmrks.like(bind("cst_po_rmrks")))
						.cutoff$and(S0_T1.trd_rmrks.like(bind("trd_rmrks")))
						.cutoff$and(S0_T1.intr_rmrks.like(bind("intr_rmrks")))
						.cutoff$and(S0_T1.sub_char1.like(bind("sub_char1")))
						.cutoff$and(S0_T1.sub_char2.like(bind("sub_char2")))
						.cutoff$and(S0_T1.sub_char3.like(bind("sub_char3")))
						.cutoff$and(S0_T1.can_flg.eq(bind("inc_can_flg_str")))
						.addDynamicPredicate(DS0C_CST_GRP)
					)
					.orderBy(
						S0_T1.slo_no.asc(),
						S0_T1.slo_rev.asc()
					)
			)
			.setDynamicSQLInfo(
				when(boundOr("wrk_nm"))
					.view(v -> v.leftOuterJoin(S0_T2).on(S0_T2.wrk_no.eq(S0_T1.wrk_no)))
					.predicate(p -> p.cutoff$and(S0_T2.wrk_nm.like(bind("wrk_nm")))),
				when(boundOr("trd_nm"))
					.view(v -> v.leftOuterJoin(S0_M1).on(S0_M1.trd_cd.eq(S0_T1.trd_cd)))
					.predicate(p -> p.cutoff$and(S0_M1.trd_nm.like(bind("trd_nm")))),
				when(boundOr("sls_usr_nm"))
					.view(v -> v.leftOuterJoin(S0_M2).on(S0_M2.usr_cd.eq(S0_T1.sls_usr_cd)))
					.predicate(p -> p.cutoff$and(S0_M2.usr_nm.like(bind("sls_usr_nm")))),
				when(boundOr("wg_nm"))
					.view(v -> v.leftOuterJoin(S0_M4).on(S0_M4.wg_cd.eq(S0_T1.wg_cd)))
					.predicate(p -> p.cutoff$and(S0_M4.wg_nm.like(bind("wg_nm")))),
				when(boundOr("cst_grp_flg1", "cst_grp_flg2", "cst_grp_flg3", "cst_grp_flg4", "cst_grp_flg5", "cst_grp_flg6", "cst_grp_flg7", "cst_grp_flg8", "cst_grp_flg9", "cst_grp_flg10", "iv_trd_flg_str", "cst_nm"))
					.view(v -> v.leftOuterJoin(S0_M5).on(S0_M5.bp_cd.eq(S0_T1.cst_cd)))
					.predicate(p -> p.cutoff$and(S0_M5.cst_iv_flg.eq(bind("iv_trd_flg_str"))).cutoff$and(S0_M5.bp_nm.like(bind("cst_nm")))),
				when(boundOr("trd_cur_nm"))
					.view(v -> v.leftOuterJoin(S0_M6).on(S0_M6.cur_cd.eq(S0_T1.trd_cur_cd)))
					.predicate(p -> p.cutoff$and(S0_M6.cur_nm.like(bind("trd_cur_nm")))),
				when(boundOr("rcpt_usr_nm"))
					.view(v -> v.leftOuterJoin(S0_M19).on(S0_M19.usr_cd.eq(S0_T1.rcpt_usr_cd)))
					.predicate(p -> p.cutoff$and(S0_M19.usr_nm.like(bind("rcpt_usr_nm")))),
				when(boundOr("can_rsn_nm"))
					.view(v -> v.leftOuterJoin(S0_M20).on(S0_M20.slo_rsn_cd.eq(S0_T1.can_rsn_cd)))
					.predicate(p -> p.cutoff$and(S0_M20.slo_rsn_nm.like(bind("can_rsn_nm")))),
				when(boundOr("cst_grp_flg1"))
					.select(DS0C_CST_GRP, S0_M5.bp_grp_cd1.as("cst_grp_cd1"), S0_MMC1.bp_grp_nm.as("cst_grp_nm1"))
					.view(DS0C_CST_GRP, v -> v.leftOuterJoin(S0_MMC1).on(S0_M5.bp_grp_cd1.eq(S0_MMC1.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP1.value()).eq(S0_MMC1.bp_grp_typ))))
					.predicate(DS0C_CST_GRP, p -> p.cutoff$and(S0_M5.bp_grp_cd1.like(bind("cst_grp_cd1"))).cutoff$and(S0_MMC1.bp_grp_nm.like(bind("cst_grp_nm1")))),
				when(boundOr("cst_grp_flg2"))
					.select(DS0C_CST_GRP, S0_M5.bp_grp_cd2.as("cst_grp_cd2"), S0_MMC2.bp_grp_nm.as("cst_grp_nm2"))
					.view(DS0C_CST_GRP, v -> v.leftOuterJoin(S0_MMC2).on(S0_M5.bp_grp_cd2.eq(S0_MMC2.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP2.value()).eq(S0_MMC2.bp_grp_typ))))
					.predicate(DS0C_CST_GRP, p -> p.cutoff$and(S0_M5.bp_grp_cd2.like(bind("cst_grp_cd2"))).cutoff$and(S0_MMC2.bp_grp_nm.like(bind("cst_grp_nm2")))),
				when(boundOr("cst_grp_flg3"))
					.select(DS0C_CST_GRP, S0_M5.bp_grp_cd3.as("cst_grp_cd3"), S0_MMC3.bp_grp_nm.as("cst_grp_nm3"))
					.view(DS0C_CST_GRP, v -> v.leftOuterJoin(S0_MMC3).on(S0_M5.bp_grp_cd3.eq(S0_MMC3.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP3.value()).eq(S0_MMC3.bp_grp_typ))))
					.predicate(DS0C_CST_GRP, p -> p.cutoff$and(S0_M5.bp_grp_cd3.like(bind("cst_grp_cd3"))).cutoff$and(S0_MMC3.bp_grp_nm.like(bind("cst_grp_nm3")))),
				when(boundOr("cst_grp_flg4"))
					.select(DS0C_CST_GRP, S0_M5.bp_grp_cd4.as("cst_grp_cd4"), S0_MMC4.bp_grp_nm.as("cst_grp_nm4"))
					.view(DS0C_CST_GRP, v -> v.leftOuterJoin(S0_MMC4).on(S0_M5.bp_grp_cd4.eq(S0_MMC4.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP4.value()).eq(S0_MMC4.bp_grp_typ))))
					.predicate(DS0C_CST_GRP, p -> p.cutoff$and(S0_M5.bp_grp_cd4.like(bind("cst_grp_cd4"))).cutoff$and(S0_MMC4.bp_grp_nm.like(bind("cst_grp_nm4")))),
				when(boundOr("cst_grp_flg5"))
					.select(DS0C_CST_GRP, S0_M5.bp_grp_cd5.as("cst_grp_cd5"), S0_MMC5.bp_grp_nm.as("cst_grp_nm5"))
					.view(DS0C_CST_GRP, v -> v.leftOuterJoin(S0_MMC5).on(S0_M5.bp_grp_cd5.eq(S0_MMC5.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP5.value()).eq(S0_MMC5.bp_grp_typ))))
					.predicate(DS0C_CST_GRP, p -> p.cutoff$and(S0_M5.bp_grp_cd5.like(bind("cst_grp_cd5"))).cutoff$and(S0_MMC5.bp_grp_nm.like(bind("cst_grp_nm5")))),
				when(boundOr("cst_grp_flg6"))
					.select(DS0C_CST_GRP, S0_M5.bp_grp_cd6.as("cst_grp_cd6"), S0_MMC6.bp_grp_nm.as("cst_grp_nm6"))
					.view(DS0C_CST_GRP, v -> v.leftOuterJoin(S0_MMC6).on(S0_M5.bp_grp_cd6.eq(S0_MMC6.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP6.value()).eq(S0_MMC6.bp_grp_typ))))
					.predicate(DS0C_CST_GRP, p -> p.cutoff$and(S0_M5.bp_grp_cd6.like(bind("cst_grp_cd6"))).cutoff$and(S0_MMC6.bp_grp_nm.like(bind("cst_grp_nm6")))),
				when(boundOr("cst_grp_flg7"))
					.select(DS0C_CST_GRP, S0_M5.bp_grp_cd7.as("cst_grp_cd7"), S0_MMC7.bp_grp_nm.as("cst_grp_nm7"))
					.view(DS0C_CST_GRP, v -> v.leftOuterJoin(S0_MMC7).on(S0_M5.bp_grp_cd7.eq(S0_MMC7.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP7.value()).eq(S0_MMC7.bp_grp_typ))))
					.predicate(DS0C_CST_GRP, p -> p.cutoff$and(S0_M5.bp_grp_cd7.like(bind("cst_grp_cd7"))).cutoff$and(S0_MMC7.bp_grp_nm.like(bind("cst_grp_nm7")))),
				when(boundOr("cst_grp_flg8"))
					.select(DS0C_CST_GRP, S0_M5.bp_grp_cd8.as("cst_grp_cd8"), S0_MMC8.bp_grp_nm.as("cst_grp_nm8"))
					.view(DS0C_CST_GRP, v -> v.leftOuterJoin(S0_MMC8).on(S0_M5.bp_grp_cd8.eq(S0_MMC8.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP8.value()).eq(S0_MMC8.bp_grp_typ))))
					.predicate(DS0C_CST_GRP, p -> p.cutoff$and(S0_M5.bp_grp_cd8.like(bind("cst_grp_cd8"))).cutoff$and(S0_MMC8.bp_grp_nm.like(bind("cst_grp_nm8")))),
				when(boundOr("cst_grp_flg9"))
					.select(DS0C_CST_GRP, S0_M5.bp_grp_cd9.as("cst_grp_cd9"), S0_MMC9.bp_grp_nm.as("cst_grp_nm9"))
					.view(DS0C_CST_GRP, v -> v.leftOuterJoin(S0_MMC9).on(S0_M5.bp_grp_cd9.eq(S0_MMC9.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP9.value()).eq(S0_MMC9.bp_grp_typ))))
					.predicate(DS0C_CST_GRP, p -> p.cutoff$and(S0_M5.bp_grp_cd9.like(bind("cst_grp_cd9"))).cutoff$and(S0_MMC9.bp_grp_nm.like(bind("cst_grp_nm9")))),
				when(boundOr("cst_grp_flg10"))
					.select(DS0C_CST_GRP, S0_M5.bp_grp_cd10.as("cst_grp_cd10"), S0_MMC10.bp_grp_nm.as("cst_grp_nm10"))
					.view(DS0C_CST_GRP, v -> v.leftOuterJoin(S0_MMC10).on(S0_M5.bp_grp_cd10.eq(S0_MMC10.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP10.value()).eq(S0_MMC10.bp_grp_typ))))
					.predicate(DS0C_CST_GRP, p -> p.cutoff$and(S0_M5.bp_grp_cd10.like(bind("cst_grp_cd10"))).cutoff$and(S0_MMC10.bp_grp_nm.like(bind("cst_grp_nm10"))))
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
						.add(MAM_BP_R.class, r -> toCondition(
							r.getStringNE("cst_cd")
						))
						.addSelect(m -> toArray(
							m.acst_cd,
							m.bp_nm,
							m.cst_iv_flg
						))
						.addMap((r, m) -> {
							r.setStringNE("cst_nm", m.bp_nm());
							r.setStringNE("acst_cd", m.acst_cd());
							r.setBooleanNE("cst_iv_flg", m.cst_iv_flg());
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
	
	/**
	 * -- MSBBL1220_MST_WG_RQST_PRMS_Query_S01
	 */
	static MCQueryPlan MSBBL1220_MST_WG_RQST_PRMS_S01() {
		MST_WG_RQST_PRMS_R S0_T1 = MST_WG_RQST_PRMS_R.create("T1");
		MST_WG_RQST_R S0_T2 = MST_WG_RQST_R.create("T2");
		MSW_SLO_D_KEY_R S0_W1 = MSW_SLO_D_KEY_R.create("W1");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBBL1220_MST_WG_RQST_PRMS_Query_S01")
					.mainQuery()
					.select(
						S0_T2.slo_d_no,
						S0_T1.gr_schd_tm.as("dt"),
						S0_T1.prms_base_unit_qty.as("prms_qty")
					)
					.from(
						S0_T1
						.innerJoin(S0_T2).on(S0_T2.wg_rqst_no.eq(S0_T1.wg_rqst_no))
						.innerJoin(S0_W1).on(S0_W1.slo_d_no.eq(S0_T2.slo_d_no))
					)
					.where(
						value(0).eq(value(0))
						.and(S0_T1.can_flg.eq(value(false)))
						.and(S0_T2.prms_ntc_flg.eq(value(true)))
						.and(S0_T2.can_flg.eq(value(false)))
						.and(
							S0_T2.wg_rqst_typ.in(
								value(MSC_WG_RQST_TYP.PURC.value()),
								value(MSC_WG_RQST_TYP.XFR.value())
							)
						)
					)
			);
	}
	/**
	 * -- MSBBL1220_MST_PURC_DLV_SLIP_D_Query_S01
	 */
	static MCQueryPlan MSBBL1220_MST_PURC_DLV_SLIP_D_S01() {
		MSW_SHIP_SCHD_KEY_R S0_W1 = MSW_SHIP_SCHD_KEY_R.create("W1");
		MST_SLS_SCHD_R S0_T1 = MST_SLS_SCHD_R.create("T1");
		MST_PURC_SCHD_R S0_T2 = MST_PURC_SCHD_R.create("T2");
		MST_ARR_SCHD_R S0_T3 = MST_ARR_SCHD_R.create("T3");
		MST_PURC_DLV_SLIP_D_R S0_T4 = MST_PURC_DLV_SLIP_D_R.create("T4");
		
		return createQueryPlan()
			.setQuery(
				sql("MSBBL1220_MST_PURC_DLV_SLIP_D_Query_S01")
					.mainQuery()
					.select(
						S0_W1.ship_schd_no,
						S0_T4.purc_ddlv_dlv_slip_no.as("dlv_slip_no"),
						S0_T4.purc_ddlv_dlv_slip_d_no.as("dlv_slip_d_no")
					)
					.from(
						S0_W1
						.innerJoin(S0_T1).on(S0_T1.ship_schd_no.eq(S0_W1.ship_schd_no))
						.innerJoin(S0_T2).on(S0_T2.purc_schd_no.eq(S0_T1.purc_schd_no))
						.innerJoin(S0_T3).on(S0_T3.arr_schd_no.eq(S0_T2.arr_schd_no))
						.leftOuterJoin(S0_T4).on(
							S0_T4.dlv_slip_mng_d_no.eq(S0_T3.dlv_slip_mng_d_no)
							.and(S0_T4.dlv_slip_mng_d_seq.eq(S0_T3.dlv_slip_mng_d_seq))
						)
					)
			);
	}
}