package mcframe.serverMSBD.MSBDL0130;

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
	 * -- MSBDL0130_MST_PURC_ACT_D_Query_S01
	 */
	static MCQueryPlan MSBDL0130_MST_PURC_ACT_D_S01() {
		MCTempView S0_V1 = createTempView("V1");
		MAM_TRD_R S0_TRD = MAM_TRD_R.create("TRD");
		MST_PO_SCHD_R S0_PO_SCHD = MST_PO_SCHD_R.create("PO_SCHD");
		MAM_ITM_R S0_ITM = MAM_ITM_R.create("ITM");
		MAM_ITM_GRP_R S0_ITM_GRP1 = MAM_ITM_GRP_R.create("ITM_GRP1");
		MAM_ITM_GRP_R S0_ITM_GRP2 = MAM_ITM_GRP_R.create("ITM_GRP2");
		MAM_ITM_GRP_R S0_ITM_GRP3 = MAM_ITM_GRP_R.create("ITM_GRP3");
		MAM_ITM_GRP_R S0_ITM_GRP4 = MAM_ITM_GRP_R.create("ITM_GRP4");
		MAM_ITM_GRP_R S0_ITM_GRP5 = MAM_ITM_GRP_R.create("ITM_GRP5");
		MAM_ITM_GRP_R S0_ITM_GRP6 = MAM_ITM_GRP_R.create("ITM_GRP6");
		MAM_ITM_GRP_R S0_ITM_GRP7 = MAM_ITM_GRP_R.create("ITM_GRP7");
		MAM_ITM_GRP_R S0_ITM_GRP8 = MAM_ITM_GRP_R.create("ITM_GRP8");
		MAM_ITM_GRP_R S0_ITM_GRP9 = MAM_ITM_GRP_R.create("ITM_GRP9");
		MAM_ITM_GRP_R S0_ITM_GRP10 = MAM_ITM_GRP_R.create("ITM_GRP10");
		MAM_ITM_TYP_D_R S0_ITM_TYP_D = MAM_ITM_TYP_D_R.create("ITM_TYP_D");
		MAM_BP_R S0_SPPL = MAM_BP_R.create("SPPL");
		MAM_BP_GRP_R S0_SPPL_GRP1 = MAM_BP_GRP_R.create("SPPL_GRP1");
		MAM_BP_GRP_R S0_SPPL_GRP2 = MAM_BP_GRP_R.create("SPPL_GRP2");
		MAM_BP_GRP_R S0_SPPL_GRP3 = MAM_BP_GRP_R.create("SPPL_GRP3");
		MAM_BP_GRP_R S0_SPPL_GRP4 = MAM_BP_GRP_R.create("SPPL_GRP4");
		MAM_BP_GRP_R S0_SPPL_GRP5 = MAM_BP_GRP_R.create("SPPL_GRP5");
		MAM_BP_GRP_R S0_SPPL_GRP6 = MAM_BP_GRP_R.create("SPPL_GRP6");
		MAM_BP_GRP_R S0_SPPL_GRP7 = MAM_BP_GRP_R.create("SPPL_GRP7");
		MAM_BP_GRP_R S0_SPPL_GRP8 = MAM_BP_GRP_R.create("SPPL_GRP8");
		MAM_BP_GRP_R S0_SPPL_GRP9 = MAM_BP_GRP_R.create("SPPL_GRP9");
		MAM_BP_GRP_R S0_SPPL_GRP10 = MAM_BP_GRP_R.create("SPPL_GRP10");
		MAVM_BP_NM_R S0_MAKER = MAVM_BP_NM_R.create("MAKER");
		MAM_LOC_R S0_IN_TO_LOC = MAM_LOC_R.create("IN_TO_LOC");
		MAM_SITE_R S0_IN_TO_LOC_SITE = MAM_SITE_R.create("IN_TO_LOC_SITE");
		MAM_WG_R S0_IN_TO_LOC_WG = MAM_WG_R.create("IN_TO_LOC_WG");
		MAM_STR_LN_R S0_STR_LN = MAM_STR_LN_R.create("STR_LN");
		MAM_DPT_R S0_AP_DPT = MAM_DPT_R.create("AP_DPT");
		MAM_USR_R S0_USR = MAM_USR_R.create("USR");
		MAM_DPT_R S0_DPT = MAM_DPT_R.create("DPT");
		MAM_WG_R S0_WG = MAM_WG_R.create("WG");
		MST_PURC_ACT_R S1_T1 = MST_PURC_ACT_R.create("T1");
		MST_PURC_ACT_D_R S1_T2 = MST_PURC_ACT_D_R.create("T2");
		MST_PURC_ACT_IO_R S1_T3 = MST_PURC_ACT_IO_R.create("T3");
		MST_PURC_SCHD_R S1_T4 = MST_PURC_SCHD_R.create("T4");
		MST_ARR_SCHD_R S1_T5 = MST_ARR_SCHD_R.create("T5");
		MST_ARR_PR_R S1_T6 = MST_ARR_PR_R.create("T6");
		MST_ARR_ACT_R S1_T10 = MST_ARR_ACT_R.create("T10");
		MST_PO_D_R S1_T7 = MST_PO_D_R.create("T7");
		MST_PO_R S1_T9 = MST_PO_R.create("T9");
		MST_RCPT_IV_D_R S1_T20 = MST_RCPT_IV_D_R.create("T20");
		MST_RCPT_IV_R S1_T21 = MST_RCPT_IV_R.create("T21");
		MST_PRMS_RCPT_D_R S1_T11 = MST_PRMS_RCPT_D_R.create("T11");
		MST_DLV_INST_D_R S1_T12 = MST_DLV_INST_D_R.create("T12");
		MAVM_RD_DPT_R S1_M0 = MAVM_RD_DPT_R.create("M0");
		MST_SLO_D_R S1_T25 = MST_SLO_D_R.create("T25");
		MAM_DPT_R S0_M2 = MAM_DPT_R.create("M2");
		MST_SLS_ACT_IO_R S1_SLS_ACT_IO = MST_SLS_ACT_IO_R.create("SLS_ACT_IO");
		MST_SLS_ACT_D_R S1_SLS_ACT_D = MST_SLS_ACT_D_R.create("SLS_ACT_D");
		MST_SLS_ACT_R S1_SLS_ACT = MST_SLS_ACT_R.create("SLS_ACT");
		
		MCDynamicSQLID DS0D = createDynamicSQLID("DS0D");
		
		return createQueryPlan()
			.setQuery(
				sql("MSBDL0130_MST_PURC_ACT_D_Query_S01")
					.mainQuery()
					.select(
						S0_V1.prAll(),
						addDynamicSelect(DS0D)
					)
					.from(
						subQuery()
						.select(
							S1_T1.purc_act_no,
							S1_T1.purc_act_seq,
							S1_T1.purc_act_rev,
							S1_T1.trd_cd,
							S1_T1.trd_ptn_typ,
							S1_T1.slip_sts_typ,
							S1_T9.aprv_no,
							S1_T9.aprv_sts_typ,
							S1_T7.po_no,
							S1_T1.purc_dpt_cd,
							S1_T1.wg_cd.as("purc_dpt_wg_cd"),
							S1_T1.purc_usr_cd,
							S1_T1.sppl_cd,
							MAPA_BP$F_GET_BP_ADDR(
								S1_T1.sppl_cd,
								S1_T1.ac_dt,
								value(MAC_BP_ADDR_TYP.SPPL_CNTCT_DPT.value())
							).as("sppl_cntct_dpt"),
							MAPA_BP$F_GET_BP_ADDR(
								S1_T1.sppl_cd,
								S1_T1.ac_dt,
								value(MAC_BP_ADDR_TYP.SPPL_CNTCT_PSN.value())
							).as("sppl_cntct_psn"),
							MAPA_BP$F_GET_BP_ADDR(
								S1_T1.sppl_cd,
								S1_T1.ac_dt,
								value(MAC_BP_ADDR_TYP.TEL.value())
							).as("sppl_tel"),
							MAPA_BP$F_GET_BP_ADDR(
								S1_T1.sppl_cd,
								S1_T1.ac_dt,
								value(MAC_BP_ADDR_TYP.FAX.value())
							).as("sppl_fax"),
							S1_T1.asppl_cd,
							S1_T1.bsppl_cd,
							S1_T1.trd_cur_cd,
							S1_T1.ptax_cur_cd,
							S1_T1.base_cur_cd,
							nvl2(
								S1_T21.rcpt_iv_no,
								S1_T21.xrate_inpt_flg,
								S1_T9.xrate_inpt_flg
							).as("xrate_inpt_flg"),
							S1_T1.xrate_cd,
							S1_T1.xrate,
							nvl2(
								S1_T21.rcpt_iv_no,
								S1_T21.ptax_xrate_inpt_flg,
								S1_T9.ptax_xrate_inpt_flg
							).as("ptax_xrate_inpt_flg"),
							S1_T1.ptax_xrate,
							S1_T4.purc_schd_dt,
							S1_T1.purc_dt,
							S1_T1.ac_dt,
							S1_T1.pay_basis_dt,
							S1_T1.pay_schd_dt,
							S1_T1.ptax_dt,
							S1_T1.rcpt_iv_no,
							S1_T1.rcpt_iv_mng_no,
							S1_T1.ref_rcpt_iv_no,
							S1_T1.purc_ret_act_no,
							S1_T1.purc_ret_act_rev,
							S1_T1.tterm_cd1,
							S1_T1.tterm_rmrks1,
							S1_T1.tterm_cd2,
							S1_T1.tterm_rmrks2,
							S1_T1.tterm_cd3,
							S1_T1.tterm_rmrks3,
							S1_T1.trd_rmrks,
							S1_T1.intr_rmrks,
							S1_T9.po_print_rmrks,
							S1_T1.adjst_dt,
							S1_T1.purc_adjst_typ,
							S1_T1.adjst_mtd_typ,
							S1_T1.purc_adjst_flg,
							S1_T1.sub_char1,
							S1_T1.sub_char2,
							S1_T1.sub_char3,
							S1_T1.ins_usr_id,
							S1_T1.ins_usr_nm,
							S1_T1.ins_ts,
							S1_T1.ins_func_id,
							S1_T1.upd_cntr.as("purc_act_upd_cntr"),
							S1_T1.upd_usr_id,
							S1_T1.upd_usr_nm,
							S1_T1.upd_ts,
							S1_T1.upd_func_id,
							S1_T1.upd_srv_req_no,
							S1_T2.purc_act_d_no,
							S1_T2.purc_act_d_seq,
							S1_T2.disp_seq,
							S1_T2.purc_schd_no,
							S1_T2.purc_src_typ,
							S1_T2.purc_src_no,
							S1_T2.rcpt_iv_d_no,
							S1_T2.po_d_no,
							S1_T2.purc_ret_act_d_no,
							S1_T2.sync_flg,
							S1_T7.purc_basis_typ,
							S1_T2.itm_cd,
							S1_T2.itm_sub1,
							S1_T2.itm_sub2,
							S1_T2.itm_sub3,
							S1_T2.ver_no,
							S1_T2.lot_no,
							S1_T2.sublot_no,
							S1_T2.bp_lot_no,
							S1_T2.bp_dlv_slip_no,
							S1_T2.bp_dlv_slip_d_no,
							S1_T10.ship_fr_valid_dt.as("slip_fr_valid_dt"),
							S1_T2.sno1,
							S1_T2.sno2,
							S1_T2.sno3,
							S1_T2.sno4,
							S1_T10.purc_cont_qty,
							S1_T2.itm_nm,
							S1_T2.iv_itm_nm,
							S1_T2.accpt_dfct_flg,
							S1_T2.ap_typ,
							S1_T2.purc_typ,
							S1_T2.mfg_inst_no,
							S1_T2.rsn_cd.as("purc_rsn_cd"),
							S1_T2.sundry_itm_flg,
							S1_T2.sppl_itm_cd,
							S1_T2.sppl_itm_nm,
							bracket(
									cases()
										.when(S1_T7.dlv_cd.isNotNull())
											.then(S1_T25.cst_itm_cd)
										.otherwise(nullValue())
								).as("cst_itm_cd"),
							bracket(
									cases()
										.when(S1_T7.dlv_cd.isNotNull())
											.then(S1_T25.cst_itm_nm)
										.otherwise(nullValue())
								).as("cst_itm_nm"),
							S1_T2.upri_not_tgt_flg,
							S1_T2.purc_dtl_upd_flg,
							S1_T2.interim_flg,
							S1_T2.tax_cd,
							nvl2(
								S1_T21.rcpt_iv_no,
								S1_T20.tax_fix_flg,
								S1_T7.tax_fix_flg
							).as("tax_fix_flg"),
							S1_T2.trd_cur_upri,
							S1_T2.trd_cur_proc_upri,
							S1_T2.trd_cur_onr_prov_upri,
							S1_T2.trd_cur_amt,
							S1_T2.trd_cur_proc_amt,
							S1_T2.trd_cur_onr_prov_amt,
							S1_T2.trd_cur_tax_amt,
							S1_T2.trd_cur_amt.add(S1_T2.trd_cur_tax_amt).as("trd_cur_inc_tax_amt"),
							S1_T2.trd_cur_dscnt_amt,
							S1_T2.base_cur_upri,
							S1_T2.base_cur_proc_upri,
							S1_T2.base_cur_onr_prov_upri,
							S1_T2.base_cur_dscnt_amt,
							S1_T2.base_cur_amt,
							S1_T2.base_cur_proc_amt,
							S1_T2.base_cur_onr_prov_amt,
							S1_T2.base_cur_tax_amt,
							S1_T2.base_cur_amt.add(S1_T2.base_cur_tax_amt).as("base_cur_inc_tax_amt"),
							S1_T2.ptax_cur_upri,
							S1_T2.ptax_cur_proc_upri,
							S1_T2.ptax_cur_onr_prov_upri,
							S1_T2.ptax_cur_dscnt_amt,
							S1_T2.ptax_cur_proc_amt,
							S1_T2.ptax_cur_onr_prov_amt,
							S1_T2.ptax_cur_amt,
							S1_T2.ptax_cur_tax_amt,
							S1_T2.ptax_cur_amt.add(S1_T2.ptax_cur_tax_amt).as("ptax_cur_inc_tax_amt"),
							S1_T2.dscnt_rsn_cd,
							S1_T2.wtax_rate,
							S1_T2.wtax_amt,
							S1_T2.maker_cd,
							S1_T2.ap_dpt_cd,
							S0_M2.ap_dpt_flg,
							MAPA_BP$F_GET_AP_DPT_CD_NE(
								S1_T1.asppl_cd,
								S1_T1.ac_dt,
								value(false)
							).as("mst_ap_dpt_cd"),
							S1_T2.pay_crryovr_times,
							S1_T4.abort_flg,
							S1_T2.ncv_flg,
							S1_T2.edi_flg,
							S1_T2.re_arr_flg,
							S1_T2.re_arr_sync_flg,
							S1_T2.re_arr_loc_cd,
							S1_T2.re_arr_loc_wg_cd,
							S1_T2.re_arr_str_ln_cd,
							trunc(
								S1_T2.re_arr_rqst_tm,
								MCDateFmt.DD
							).as("re_arr_rqst_dt"),
							S1_T2.re_arr_rqst_tm.as("re_arr_rqst_hm"),
							S1_T2.re_arr_purc_schd_dt,
							S1_T2.trd_unit_re_arr_qty,
							S1_T2.base_unit_re_arr_qty,
							S1_T2.bd_itm_cd,
							S1_T2.bd_itm_sub1,
							S1_T2.bd_itm_sub2,
							S1_T2.bd_itm_sub3,
							S1_T2.bd_sno1,
							S1_T2.bd_sno2,
							S1_T2.bd_sno3,
							S1_T2.bd_sno4,
							S1_T2.bd_loc_cd,
							S1_T2.bd_lot_no,
							S1_T2.bd_sublot_no,
							S1_T2.bd_dpt_cd,
							S1_T2.bd_wg_cd,
							S1_T2.bd_ctg_cd,
							S1_T2.bd_oper_cd,
							S1_T2.bd_slo_no,
							S1_T2.bd_iv_no,
							S1_T2.bd_po_no,
							S1_T2.bd_bp_cd,
							S1_T2.ref_purc_act_no,
							S1_T2.ref_purc_act_seq,
							S1_T2.ref_purc_act_d_no,
							S1_T2.ref_purc_act_d_seq,
							S1_T2.intr_rmrks.as("intr_d_rmrks"),
							S1_T2.trd_d_rmrks,
							S1_T2.sub_char1.as("dtl_sub_char1"),
							S1_T2.sub_char2.as("dtl_sub_char2"),
							S1_T2.sub_char3.as("dtl_sub_char3"),
							S1_T7.po_print_d_rmrks,
							S1_T2.in_to_loc_cd,
							S1_T2.in_to_loc_wg_cd,
							S1_T2.str_ln_cd,
							S1_T2.gd_cd,
							S1_T2.purc_id_typ,
							S1_T2.quality_typ,
							S1_T2.stk_insp_typ,
							S1_T2.stk_id_typ,
							S1_T2.trd_unit_cd,
							S1_T2.trd_unit_qty,
							S1_T2.base_unit_cd,
							S1_T7.drct_dlv_typ,
							nvl(
								S1_T12.dlv_cd,
								S1_T7.dlv_cd
							).as("dlv_cd"),
							nvl2(
								S1_T12.dlv_cd,
								S1_T12.dlv_sundry_flg,
								S1_T7.dlv_sundry_flg
							).as("dlv_sundry_flg"),
							nvl2(
								S1_T12.dlv_cd,
								S1_T12.dlv_nm,
								S1_T7.dlv_nm
							).as("dlv_nm"),
							nvl2(
								S1_T12.dlv_cd,
								S1_T12.dlv_cntct_dpt,
								S1_T7.dlv_cntct_dpt
							).as("dlv_cntct_dpt"),
							nvl2(
								S1_T12.dlv_cd,
								S1_T12.dlv_cntct_psn,
								S1_T7.dlv_cntct_psn
							).as("dlv_cntct_psn"),
							nvl2(
								S1_T12.dlv_cd,
								S1_T12.dlv_zip_cd,
								S1_T7.dlv_zip_cd
							).as("dlv_zip_cd"),
							nvl2(
								S1_T12.dlv_cd,
								S1_T12.dlv_addr1,
								S1_T7.dlv_addr1
							).as("dlv_addr1"),
							nvl2(
								S1_T12.dlv_cd,
								S1_T12.dlv_addr2,
								S1_T7.dlv_addr2
							).as("dlv_addr2"),
							nvl2(
								S1_T12.dlv_cd,
								S1_T12.dlv_addr3,
								S1_T7.dlv_addr3
							).as("dlv_addr3"),
							nvl2(
								S1_T12.dlv_cd,
								S1_T12.dlv_addr4,
								S1_T7.dlv_addr4
							).as("dlv_addr4"),
							nvl2(
								S1_T12.dlv_cd,
								S1_T12.dlv_tel,
								S1_T7.dlv_tel
							).as("dlv_tel"),
							nvl2(
								S1_T12.dlv_cd,
								S1_T12.dlv_fax,
								S1_T7.dlv_fax
							).as("dlv_fax"),
							nvl(
								S1_T12.tdlv_cd,
								S1_T7.tdlv_cd
							).as("tdlv_cd"),
							nvl2(
								S1_T12.tdlv_cd,
								S1_T12.tdlv_sundry_flg,
								S1_T7.tdlv_sundry_flg
							).as("tdlv_sundry_flg"),
							nvl2(
								S1_T12.tdlv_cd,
								S1_T12.tdlv_nm,
								S1_T7.tdlv_nm
							).as("tdlv_nm"),
							nvl2(
								S1_T12.tdlv_cd,
								S1_T12.tdlv_cntct_dpt,
								S1_T7.tdlv_cntct_dpt
							).as("tdlv_cntct_dpt"),
							nvl2(
								S1_T12.tdlv_cd,
								S1_T12.tdlv_cntct_psn,
								S1_T7.tdlv_cntct_psn
							).as("tdlv_cntct_psn"),
							nvl2(
								S1_T12.tdlv_cd,
								S1_T12.tdlv_zip_cd,
								S1_T7.tdlv_zip_cd
							).as("tdlv_zip_cd"),
							nvl2(
								S1_T12.tdlv_cd,
								S1_T12.tdlv_addr1,
								S1_T7.tdlv_addr1
							).as("tdlv_addr1"),
							nvl2(
								S1_T12.tdlv_cd,
								S1_T12.tdlv_addr2,
								S1_T7.tdlv_addr2
							).as("tdlv_addr2"),
							nvl2(
								S1_T12.tdlv_cd,
								S1_T12.tdlv_addr3,
								S1_T7.tdlv_addr3
							).as("tdlv_addr3"),
							nvl2(
								S1_T12.tdlv_cd,
								S1_T12.tdlv_addr4,
								S1_T7.tdlv_addr4
							).as("tdlv_addr4"),
							nvl2(
								S1_T12.tdlv_cd,
								S1_T12.tdlv_tel,
								S1_T7.tdlv_tel
							).as("tdlv_tel"),
							nvl2(
								S1_T12.tdlv_cd,
								S1_T12.tdlv_fax,
								S1_T7.tdlv_fax
							).as("tdlv_fax"),
							S1_T2.base_unit_qty,
							S1_T7.outsrc_flg,
							S1_T7.mfg_loc_cd,
							S1_T7.bom_ptn,
							S1_T7.purc_upri_req_typ,
							nvl2(
								S1_T21.rcpt_iv_no,
								S1_T20.trd_unit_qty,
								S1_T7.trd_unit_qty
							).as("src_trd_unit_qty"),
							nvl2(
								S1_T21.rcpt_iv_no,
								S1_T20.trd_unit_cd,
								S1_T7.trd_unit_cd
							).as("src_trd_unit_cd"),
							nvl2(
								S1_T21.rcpt_iv_no,
								S1_T20.trd_cur_upri,
								S1_T7.trd_cur_upri
							).as("src_trd_cur_upri"),
							nvl2(
								S1_T21.rcpt_iv_no,
								S1_T20.trd_cur_proc_upri,
								S1_T7.trd_cur_proc_upri
							).as("src_trd_cur_proc_upri"),
							nvl2(
								S1_T21.rcpt_iv_no,
								S1_T20.trd_cur_onr_prov_upri,
								S1_T7.trd_cur_onr_prov_upri
							).as("src_trd_cur_onr_prov_upri"),
							nvl2(
								S1_T21.rcpt_iv_no,
								S1_T20.trd_cur_amt,
								S1_T7.trd_cur_amt
							).as("src_trd_cur_amt"),
							nvl2(
								S1_T21.rcpt_iv_no,
								S1_T20.trd_cur_proc_amt,
								S1_T7.trd_cur_proc_amt
							).as("src_trd_cur_proc_amt"),
							nvl2(
								S1_T21.rcpt_iv_no,
								S1_T20.trd_cur_onr_prov_amt,
								S1_T7.trd_cur_onr_prov_amt
							).as("src_trd_cur_onr_prov_amt"),
							nvl2(
								S1_T21.rcpt_iv_no,
								S1_T20.trd_cur_tax_amt,
								S1_T7.trd_cur_tax_amt
							).as("src_trd_cur_tax_amt"),
							nvl2(
								S1_T21.rcpt_iv_no,
								S1_T20.trd_cur_dscnt_amt,
								S1_T7.trd_cur_dscnt_amt
							).as("src_trd_cur_dscnt_amt"),
							nvl2(
								S1_T21.rcpt_iv_no,
								S1_T20.wtax_rate,
								S1_T7.wtax_rate
							).as("src_wtax_rate"),
							nvl2(
								S1_T21.rcpt_iv_no,
								S1_T20.tax_cd,
								S1_T7.tax_cd
							).as("src_tax_cd"),
							S1_T7.base_unit_qty.as("src_base_unit_qty"),
							MAPA_CALC$F_CALC_PER(
								S1_T5.base_unit_qty,
								S1_T5.purc_qty
							).as("purc_prgrs"),
							S1_T4.base_unit_schd_qty,
							S1_T4.base_unit_purc_qty,
							S1_T4.base_unit_purc_qty.add(S1_T4.base_unit_accpt_dfct_qty).as("base_unit_purc_act_qty"),
							S1_T5.arr_qty.as("base_unit_arr_qty"),
							nvl(
								S1_T5.arr_ptn_typ,
								value(MSC_ARR_PTN_TYP.NRML.value())
							).as("arr_ptn_typ"),
							S1_T5.arr_schd_no,
							S1_T5.purc_act_d_no.as("par_purc_act_d_no"),
							S1_T5.arr_split_flg,
							S1_T5.arr_skip_flg,
							S1_T6.purc_ddlv_flg,
							S1_T6.arr_pr_no,
							S1_T6.upd_cntr.as("arr_pr_upd_cntr"),
							S1_T3.arr_act_no,
							S1_T21.upd_cntr.as("rcpt_iv_upd_cntr"),
							S1_T10.edi_bp_dlv_slip_no,
							S1_T10.edi_bp_dlv_slip_d_no,
							S1_T7.po_schd_no,
							S1_T7.slo_d_no,
							S1_T7.slo_no,
							S1_T1.ac_dt.as("master_dt"),
							nvl(S1_T2.temp_ap_flg,value(false)).as("temp_ap_flg"),
							bracket(
								cases()
									.when(exists(
										subQuery()
										.select(value("X"))
										.from(S1_SLS_ACT_IO
											.innerJoin(S1_SLS_ACT_D).on(
												S1_SLS_ACT_D.sls_act_d_no.eq(S1_SLS_ACT_IO.sls_act_d_no)
												.and(S1_SLS_ACT_D.sls_act_d_seq.eq(S1_SLS_ACT_IO.sls_act_d_seq))
											)
											.innerJoin(S1_SLS_ACT).on(
												S1_SLS_ACT.sls_act_no.eq(S1_SLS_ACT_D.sls_act_no)
												.and(S1_SLS_ACT.sls_act_seq.eq(S1_SLS_ACT_D.sls_act_seq))
											)
										)
										.where(
											value(0).eq(value(0))
											.and(S1_SLS_ACT_IO.sync_flg.eq(value(true)))
											.and(S1_SLS_ACT_IO.purc_act_io_no.eq(S1_T3.purc_act_io_no))
											.and(S1_SLS_ACT.slip_sts_typ.eq(value(MAC_SLIP_STS_TYP.CRT.value())))
										)
									)
								)
								.then(value(true))
								.otherwise(value(false))
							).as("sls_sync_flg")
						)
						.from(
							S1_T1
							.leftOuterJoin(S1_T2).on(
								S1_T1.purc_act_no.eq(S1_T2.purc_act_no)
								.and(S1_T1.purc_act_seq.eq(S1_T2.purc_act_seq))
							)
							.leftOuterJoin(S1_T3).on(
								S1_T2.purc_act_d_no.eq(S1_T3.purc_act_d_no)
								.and(S1_T2.purc_act_d_seq.eq(S1_T3.purc_act_d_seq))
							)
							.leftOuterJoin(S1_T4).on(
								S1_T2.purc_schd_no.eq(S1_T4.purc_schd_no)
								.and(S1_T4.non_purc_flg.eq(value(false)))
							)
							.leftOuterJoin(S1_T5).on(S1_T4.arr_schd_no.eq(S1_T5.arr_schd_no))
							.leftOuterJoin(S1_T6).on(S1_T5.arr_pr_no.eq(S1_T6.arr_pr_no))
							.leftOuterJoin(S1_T10).on(
								S1_T3.arr_act_no.eq(S1_T10.arr_act_no)
								.and(S1_T10.can_flg.eq(value(false)))
							)
							.leftOuterJoin(S1_T7).on(S1_T2.po_d_no.eq(S1_T7.po_d_no))
							.leftOuterJoin(S1_T9).on(S1_T7.po_no.eq(S1_T9.po_no))
							.leftOuterJoin(S1_T20).on(S1_T2.rcpt_iv_d_no.eq(S1_T20.rcpt_iv_d_no))
							.leftOuterJoin(S1_T21).on(S1_T1.rcpt_iv_mng_no.eq(S1_T21.rcpt_iv_mng_no))
							.leftOuterJoin(S1_T11).on(
								S1_T11.prms_rcpt_d_no.eq(nvl(
										S1_T5.prms_rcpt_d_no,
										S1_T20.ref_prms_rcpt_d_no
									)
								)
							)
							.leftOuterJoin(S1_T12).on(
								S1_T12.dlv_inst_d_no.eq(coalesce(
										S1_T5.dlv_inst_d_no,
										S1_T11.dlv_inst_d_no,
										S1_T20.ref_dlv_inst_d_no
									)
								)
							)
							.innerJoin(S1_M0).on(S1_T1.purc_dpt_cd.eq(S1_M0.dpt_cd))
							.leftOuterJoin(S1_T25).on
								(bracket(
										S1_T25.slo_d_no.eq(S1_T7.slo_d_no)
									)
							)
							.leftOuterJoin(S0_M2).on(
								bracket(
									S1_T1.purc_dpt_cd.eq(S0_M2.dpt_cd)
									.and(S1_T1.ac_dt.between(S0_M2.st_dt, S0_M2.end_dt))
								)
							)
						)
						.where(
							S1_T1.slip_sts_typ.eq(value(MAC_SLIP_STS_TYP.CRT.value()))
							.and(
								S1_T1.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.PURC.value()))
								.or(S1_T1.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.PURC_XPNS.value())))
							)
							.cutoff$and(
								bracket(
									value(true).eq(bind("_expt_unplan_flg"))
									.and(S1_T2.purc_schd_no.isNotNull())
								)
							)
							.cutoff$and(
								MAPA_CALC$F_CALC_PER(
									S1_T5.base_unit_qty,
									S1_T5.purc_qty
								).gte(bind("purc_prgrs_fr"))
							)
							.cutoff$and(
								MAPA_CALC$F_CALC_PER(
									S1_T5.base_unit_qty,
									S1_T5.purc_qty
								).lte(bind("purc_prgrs_to"))
							)
							.cutoff$and(S1_T5.arr_ptn_typ.eq(bind("_arr_ptn_typ")))
							.cutoff$and(S1_T5.cmpl_flg.eq(bind("_arr_cmpl_flg")))
							.cutoff$and(S1_T4.cmpl_flg.eq(bind("_purc_cmpl_flg")))
							.cutoff$and(
								bracket(
									value(true).eq(bind("_not_abort_flg"))
									.and(
										S1_T4.purc_schd_no.isNull()
										.or(S1_T4.abort_flg.neq(value(true)))
									)
								)
							)
							.and(
								bracket(
									S1_T2.temp_ap_flg.isNull()
									.or(S1_T2.temp_ap_flg.eq(value(false)))
									.cutoff$or(
										value(true).eq(bind("_temp_ap_flg"))
										.and(S1_T2.temp_ap_flg.eq(value(true)))
									)
								)
							)
							.cutoff$and(S1_T2.edi_flg.eq(bind("_edi_flg")))
							.cutoff$and(S1_T4.purc_schd_dt.gte(bind("purc_schd_dt_fr")))
							.cutoff$and(S1_T4.purc_schd_dt.lte(bind("purc_schd_dt_to")))
							.cutoff$and(S1_T1.purc_dt.gte(bind("purc_dt_fr")))
							.cutoff$and(S1_T1.purc_dt.lte(bind("purc_dt_to")))
							.cutoff$and(S1_T1.ac_dt.gte(bind("ac_dt_fr")))
							.cutoff$and(S1_T1.ac_dt.lte(bind("ac_dt_to")))
							.cutoff$and(S1_T1.sppl_cd.like(bind("sppl_cd")))
							.cutoff$and(S1_T2.itm_cd.like(bind("itm_cd")))
							.cutoff$and(S1_T2.itm_sub1.like(bind("itm_sub1")))
							.cutoff$and(S1_T2.itm_sub2.like(bind("itm_sub2")))
							.cutoff$and(S1_T2.itm_sub3.like(bind("itm_sub3")))
							.cutoff$and(S1_T2.sppl_itm_cd.like(bind("sppl_itm_cd")))
							.cutoff$and(S1_T2.sppl_itm_nm.like(bind("sppl_itm_nm")))
							.cutoff$and(S1_T2.lot_no.like(bind("lot_no")))
							.cutoff$and(S1_T2.sublot_no.like(bind("sublot_no")))
							.cutoff$and(S1_T10.bp_lot_no.like(bind("bp_lot_no")))
							.cutoff$and(S1_T2.sno1.like(bind("sno1")))
							.cutoff$and(S1_T2.sno2.like(bind("sno2")))
							.cutoff$and(S1_T2.sno3.like(bind("sno3")))
							.cutoff$and(S1_T2.sno4.like(bind("sno4")))
							.cutoff$and(S1_T2.ver_no.like(bind("ver_no")))
							.cutoff$and(S1_T2.maker_cd.like(bind("maker_cd")))
							.cutoff$and(S1_T1.purc_usr_cd.like(bind("purc_usr_cd")))
							.cutoff$and(S1_T1.purc_dpt_cd.like(bind("purc_dpt_cd")))
							.cutoff$and(S1_T1.wg_cd.like(bind("purc_dpt_wg_cd")))
							.cutoff$and(S1_T2.ap_dpt_cd.like(bind("ap_dpt_cd")))
							.cutoff$and(S1_T7.po_schd_no.like(bind("po_schd_no")))
							.cutoff$and(S1_T7.po_no.like(bind("po_no")))
							.cutoff$and(S1_T7.po_d_no.like(bind("po_d_no")))
							.cutoff$and(S1_T1.rcpt_iv_no.like(bind("rcpt_iv_no")))
							.cutoff$and(S1_T1.rcpt_iv_mng_no.like(bind("rcpt_iv_mng_no")))
							.cutoff$and(S1_T2.rcpt_iv_d_no.like(bind("rcpt_iv_d_no")))
							.cutoff$and(S1_T4.purc_schd_no.like(bind("purc_schd_no")))
							.cutoff$and(S1_T1.purc_act_no.like(bind("purc_act_no")))
							.cutoff$and(S1_T2.purc_act_d_no.like(bind("purc_act_d_no")))
							.cutoff$and(S1_T2.mfg_inst_no.like(bind("mfg_inst_no")))
							.cutoff$and(S1_T1.trd_cd.like(bind("trd_cd")))
							.cutoff$and(S1_T1.trd_cur_cd.like(bind("trd_cur_cd")))
							.cutoff$and(S1_T2.purc_id_typ.like(bind("purc_id_typ")))
							.cutoff$and(S1_T7.drct_dlv_typ.like(bind("drct_dlv_typ")))
							.cutoff$and(S1_T2.in_to_loc_wg_cd.like(bind("in_to_loc_wg_cd")))
							.cutoff$and(S1_T2.in_to_loc_cd.like(bind("in_to_loc_cd")))
							.cutoff$and(S1_T2.str_ln_cd.like(bind("str_ln_cd")))
							.cutoff$and(S1_T1.trd_rmrks.like(bind("trd_rmrks")))
							.cutoff$and(S1_T1.intr_rmrks.like(bind("intr_rmrks")))
							.cutoff$and(S1_T1.sub_char1.like(bind("sub_char1")))
							.cutoff$and(S1_T1.sub_char2.like(bind("sub_char2")))
							.cutoff$and(S1_T1.sub_char3.like(bind("sub_char3")))
							.cutoff$and(S1_T2.trd_d_rmrks.like(bind("trd_d_rmrks")))
							.cutoff$and(S1_T2.intr_rmrks.like(bind("intr_d_rmrks")))
							.cutoff$and(S1_T2.sub_char1.like(bind("dtl_sub_char1")))
							.cutoff$and(S1_T2.sub_char2.like(bind("dtl_sub_char2")))
							.cutoff$and(S1_T2.sub_char3.like(bind("dtl_sub_char3")))
						).view(S0_V1)
						.addDynamicView(DS0D)
					)
					.where(
						value(0).eq(value(0))
						.addDynamicPredicate(DS0D)
					)
					.orderBy(
						S0_V1.pr(S1_T1.rcpt_iv_no).asc(),
						S0_V1.pr(S1_T1.rcpt_iv_mng_no).asc(),
						S0_V1.pr(S1_T1.purc_act_no).asc(),
						S0_V1.pr(S1_T2.disp_seq).asc()
					)
			)
			.setDynamicSQLInfo(
				when(boundOr("itm_nm", "itm_typ", "itm_typ_d_cd", "itm_typ_d_nm", "itm_grp_flg1", "itm_grp_flg2", "itm_grp_flg3", "itm_grp_flg4", "itm_grp_flg5", "itm_grp_flg6", "itm_grp_flg7", "itm_grp_flg8", "itm_grp_flg9", "itm_grp_flg10"))
					.view(DS0D, v -> v.leftOuterJoin(S0_ITM).on(S0_ITM.itm_cd.eq(S0_V1.pr(S1_T2.itm_cd)).and(S0_ITM.itm_sub1.eq(S0_V1.pr(S1_T2.itm_sub1))).and(S0_ITM.itm_sub2.eq(S0_V1.pr(S1_T2.itm_sub2))).and(S0_ITM.itm_sub3.eq(S0_V1.pr(S1_T2.itm_sub3)))))
					.predicate(DS0D, p -> p.cutoff$and(nvl(S0_V1.pr(S1_T2.itm_nm),S0_ITM.itm_nm).like(bind("itm_nm")))),
				when(boundOr("itm_grp_flg1"))
					.select(DS0D, S0_ITM.itm_grp_cd1.as("itm_grp_cd1"))
					.groupBy(DS0D, S0_ITM.itm_grp_cd1),
				when(boundOr("itm_grp_flg1", "itm_grp_cd1"))
					.predicate(DS0D, p -> p.cutoff$and(S0_ITM.itm_grp_cd1.like(bind("itm_grp_cd1")))),
				when(boundOr("itm_grp_flg1"))
					.select(DS0D, S0_ITM_GRP1.itm_grp_nm.as("itm_grp_nm1"))
					.groupBy(DS0D, S0_ITM_GRP1.itm_grp_nm),
				when(boundOr("itm_grp_flg1", "itm_grp_nm1"))
					.view(DS0D, v -> v.leftOuterJoin(S0_ITM_GRP1).on(S0_ITM.itm_grp_cd1.eq(S0_ITM_GRP1.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP1.value()).eq(S0_ITM_GRP1.itm_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_ITM_GRP1.itm_grp_nm.like(bind("itm_grp_nm1")))),
				when(boundOr("itm_grp_flg2"))
					.select(DS0D, S0_ITM.itm_grp_cd2.as("itm_grp_cd2"))
					.groupBy(DS0D, S0_ITM.itm_grp_cd2),
				when(boundOr("itm_grp_flg2", "itm_grp_cd2"))
					.predicate(DS0D, p -> p.cutoff$and(S0_ITM.itm_grp_cd2.like(bind("itm_grp_cd2")))),
				when(boundOr("itm_grp_flg2"))
					.select(DS0D, S0_ITM_GRP2.itm_grp_nm.as("itm_grp_nm2"))
					.groupBy(DS0D, S0_ITM_GRP2.itm_grp_nm),
				when(boundOr("itm_grp_flg2", "itm_grp_nm2"))
					.view(DS0D, v -> v.leftOuterJoin(S0_ITM_GRP2).on(S0_ITM.itm_grp_cd2.eq(S0_ITM_GRP2.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP2.value()).eq(S0_ITM_GRP2.itm_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_ITM_GRP2.itm_grp_nm.like(bind("itm_grp_nm2")))),
				when(boundOr("itm_grp_flg3"))
					.select(DS0D, S0_ITM.itm_grp_cd3.as("itm_grp_cd3"))
					.groupBy(DS0D, S0_ITM.itm_grp_cd3),
				when(boundOr("itm_grp_flg3", "itm_grp_cd3"))
					.predicate(DS0D, p -> p.cutoff$and(S0_ITM.itm_grp_cd3.like(bind("itm_grp_cd3")))),
				when(boundOr("itm_grp_flg3"))
					.select(DS0D, S0_ITM_GRP3.itm_grp_nm.as("itm_grp_nm3"))
					.groupBy(DS0D, S0_ITM_GRP3.itm_grp_nm),
				when(boundOr("itm_grp_flg3", "itm_grp_nm3"))
					.view(DS0D, v -> v.leftOuterJoin(S0_ITM_GRP3).on(S0_ITM.itm_grp_cd3.eq(S0_ITM_GRP3.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP3.value()).eq(S0_ITM_GRP3.itm_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_ITM_GRP3.itm_grp_nm.like(bind("itm_grp_nm3")))),
				when(boundOr("itm_grp_flg4"))
					.select(DS0D, S0_ITM.itm_grp_cd4.as("itm_grp_cd4"))
					.groupBy(DS0D, S0_ITM.itm_grp_cd4),
				when(boundOr("itm_grp_flg4", "itm_grp_cd4"))
					.predicate(DS0D, p -> p.cutoff$and(S0_ITM.itm_grp_cd4.like(bind("itm_grp_cd4")))),
				when(boundOr("itm_grp_flg4"))
					.select(DS0D, S0_ITM_GRP4.itm_grp_nm.as("itm_grp_nm4"))
					.groupBy(DS0D, S0_ITM_GRP4.itm_grp_nm),
				when(boundOr("itm_grp_flg4", "itm_grp_nm4"))
					.view(DS0D, v -> v.leftOuterJoin(S0_ITM_GRP4).on(S0_ITM.itm_grp_cd4.eq(S0_ITM_GRP4.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP4.value()).eq(S0_ITM_GRP4.itm_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_ITM_GRP4.itm_grp_nm.like(bind("itm_grp_nm4")))),
				when(boundOr("itm_grp_flg5"))
					.select(DS0D, S0_ITM.itm_grp_cd5.as("itm_grp_cd5"))
					.groupBy(DS0D, S0_ITM.itm_grp_cd5),
				when(boundOr("itm_grp_flg5", "itm_grp_cd5"))
					.predicate(DS0D, p -> p.cutoff$and(S0_ITM.itm_grp_cd5.like(bind("itm_grp_cd5")))),
				when(boundOr("itm_grp_flg5"))
					.select(DS0D, S0_ITM_GRP5.itm_grp_nm.as("itm_grp_nm5"))
					.groupBy(DS0D, S0_ITM_GRP5.itm_grp_nm),
				when(boundOr("itm_grp_flg5", "itm_grp_nm5"))
					.view(DS0D, v -> v.leftOuterJoin(S0_ITM_GRP5).on(S0_ITM.itm_grp_cd5.eq(S0_ITM_GRP5.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP5.value()).eq(S0_ITM_GRP5.itm_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_ITM_GRP5.itm_grp_nm.like(bind("itm_grp_nm5")))),
				when(boundOr("itm_grp_flg6"))
					.select(DS0D, S0_ITM.itm_grp_cd6.as("itm_grp_cd6"))
					.groupBy(DS0D, S0_ITM.itm_grp_cd6),
				when(boundOr("itm_grp_flg6", "itm_grp_cd6"))
					.predicate(DS0D, p -> p.cutoff$and(S0_ITM.itm_grp_cd6.like(bind("itm_grp_cd6")))),
				when(boundOr("itm_grp_flg6"))
					.select(DS0D, S0_ITM_GRP6.itm_grp_nm.as("itm_grp_nm6"))
					.groupBy(DS0D, S0_ITM_GRP6.itm_grp_nm),
				when(boundOr("itm_grp_flg6", "itm_grp_nm6"))
					.view(DS0D, v -> v.leftOuterJoin(S0_ITM_GRP6).on(S0_ITM.itm_grp_cd6.eq(S0_ITM_GRP6.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP6.value()).eq(S0_ITM_GRP6.itm_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_ITM_GRP6.itm_grp_nm.like(bind("itm_grp_nm6")))),
				when(boundOr("itm_grp_flg7"))
					.select(DS0D, S0_ITM.itm_grp_cd7.as("itm_grp_cd7"))
					.groupBy(DS0D, S0_ITM.itm_grp_cd7),
				when(boundOr("itm_grp_flg7", "itm_grp_cd7"))
					.predicate(DS0D, p -> p.cutoff$and(S0_ITM.itm_grp_cd7.like(bind("itm_grp_cd7")))),
				when(boundOr("itm_grp_flg7"))
					.select(DS0D, S0_ITM_GRP7.itm_grp_nm.as("itm_grp_nm7"))
					.groupBy(DS0D, S0_ITM_GRP7.itm_grp_nm),
				when(boundOr("itm_grp_flg7", "itm_grp_nm7"))
					.view(DS0D, v -> v.leftOuterJoin(S0_ITM_GRP7).on(S0_ITM.itm_grp_cd7.eq(S0_ITM_GRP7.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP7.value()).eq(S0_ITM_GRP7.itm_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_ITM_GRP7.itm_grp_nm.like(bind("itm_grp_nm7")))),
				when(boundOr("itm_grp_flg8"))
					.select(DS0D, S0_ITM.itm_grp_cd8.as("itm_grp_cd8"))
					.groupBy(DS0D, S0_ITM.itm_grp_cd8),
				when(boundOr("itm_grp_flg8", "itm_grp_cd8"))
					.predicate(DS0D, p -> p.cutoff$and(S0_ITM.itm_grp_cd8.like(bind("itm_grp_cd8")))),
				when(boundOr("itm_grp_flg8"))
					.select(DS0D, S0_ITM_GRP8.itm_grp_nm.as("itm_grp_nm8"))
					.groupBy(DS0D, S0_ITM_GRP8.itm_grp_nm),
				when(boundOr("itm_grp_flg8", "itm_grp_nm8"))
					.view(DS0D, v -> v.leftOuterJoin(S0_ITM_GRP8).on(S0_ITM.itm_grp_cd8.eq(S0_ITM_GRP8.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP8.value()).eq(S0_ITM_GRP8.itm_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_ITM_GRP8.itm_grp_nm.like(bind("itm_grp_nm8")))),
				when(boundOr("itm_grp_flg9"))
					.select(DS0D, S0_ITM.itm_grp_cd9.as("itm_grp_cd9"))
					.groupBy(DS0D, S0_ITM.itm_grp_cd9),
				when(boundOr("itm_grp_flg9", "itm_grp_cd9"))
					.predicate(DS0D, p -> p.cutoff$and(S0_ITM.itm_grp_cd9.like(bind("itm_grp_cd9")))),
				when(boundOr("itm_grp_flg9"))
					.select(DS0D, S0_ITM_GRP9.itm_grp_nm.as("itm_grp_nm9"))
					.groupBy(DS0D, S0_ITM_GRP9.itm_grp_nm),
				when(boundOr("itm_grp_flg9", "itm_grp_nm9"))
					.view(DS0D, v -> v.leftOuterJoin(S0_ITM_GRP9).on(S0_ITM.itm_grp_cd9.eq(S0_ITM_GRP9.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP9.value()).eq(S0_ITM_GRP9.itm_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_ITM_GRP9.itm_grp_nm.like(bind("itm_grp_nm9")))),
				when(boundOr("itm_grp_flg10"))
					.select(DS0D, S0_ITM.itm_grp_cd10.as("itm_grp_cd10"))
					.groupBy(DS0D, S0_ITM.itm_grp_cd10),
				when(boundOr("itm_grp_flg10", "itm_grp_cd10"))
					.predicate(DS0D, p -> p.cutoff$and(S0_ITM.itm_grp_cd10.like(bind("itm_grp_cd10")))),
				when(boundOr("itm_grp_flg10"))
					.select(DS0D, S0_ITM_GRP10.itm_grp_nm.as("itm_grp_nm10"))
					.groupBy(DS0D, S0_ITM_GRP10.itm_grp_nm),
				when(boundOr("itm_grp_flg10", "itm_grp_nm10"))
					.view(DS0D, v -> v.leftOuterJoin(S0_ITM_GRP10).on(S0_ITM.itm_grp_cd10.eq(S0_ITM_GRP10.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP10.value()).eq(S0_ITM_GRP10.itm_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_ITM_GRP10.itm_grp_nm.like(bind("itm_grp_nm10")))),
				when(boundOr("sppl_nm", "_iv_flg", "sppl_grp_flg1", "sppl_grp_flg2", "sppl_grp_flg3", "sppl_grp_flg4", "sppl_grp_flg5", "sppl_grp_flg6", "sppl_grp_flg7", "sppl_grp_flg8", "sppl_grp_flg9", "sppl_grp_flg10"))
					.view(DS0D, v -> v.leftOuterJoin(S0_SPPL).on(S0_SPPL.bp_cd.eq(S0_V1.pr(S1_T1.sppl_cd))))
					.predicate(DS0D, p -> p.cutoff$and(S0_SPPL.sppl_iv_flg.eq(bind("_iv_flg"))).cutoff$and(S0_SPPL.bp_nm.like(bind("sppl_nm")))),
				when(boundOr("sppl_grp_flg1"))
					.select(DS0D, S0_SPPL.bp_grp_cd1.as("sppl_grp_cd1"))
					.groupBy(DS0D, S0_SPPL.bp_grp_cd1),
				when(boundOr("sppl_grp_flg1", "sppl_grp_cd1"))
					.predicate(DS0D, p -> p.cutoff$and(S0_SPPL.bp_grp_cd1.like(bind("sppl_grp_cd1")))),
				when(boundOr("sppl_grp_flg1"))
					.select(DS0D, S0_SPPL_GRP1.bp_grp_nm.as("sppl_grp_nm1"))
					.groupBy(DS0D, S0_SPPL_GRP1.bp_grp_nm),
				when(boundOr("sppl_grp_flg1", "sppl_grp_nm1"))
					.view(DS0D, v -> v.leftOuterJoin(S0_SPPL_GRP1).on(S0_SPPL.bp_grp_cd1.eq(S0_SPPL_GRP1.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP1.value()).eq(S0_SPPL_GRP1.bp_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_SPPL_GRP1.bp_grp_nm.like(bind("sppl_grp_nm1")))),
				when(boundOr("sppl_grp_flg2"))
					.select(DS0D, S0_SPPL.bp_grp_cd2.as("sppl_grp_cd2"))
					.groupBy(DS0D, S0_SPPL.bp_grp_cd2),
				when(boundOr("sppl_grp_flg2", "sppl_grp_cd2"))
					.predicate(DS0D, p -> p.cutoff$and(S0_SPPL.bp_grp_cd2.like(bind("sppl_grp_cd2")))),
				when(boundOr("sppl_grp_flg2"))
					.select(DS0D, S0_SPPL_GRP2.bp_grp_nm.as("sppl_grp_nm2"))
					.groupBy(DS0D, S0_SPPL_GRP2.bp_grp_nm),
				when(boundOr("sppl_grp_flg2", "sppl_grp_nm2"))
					.view(DS0D, v -> v.leftOuterJoin(S0_SPPL_GRP2).on(S0_SPPL.bp_grp_cd2.eq(S0_SPPL_GRP2.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP2.value()).eq(S0_SPPL_GRP2.bp_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_SPPL_GRP2.bp_grp_nm.like(bind("sppl_grp_nm2")))),
				when(boundOr("sppl_grp_flg3"))
					.select(DS0D, S0_SPPL.bp_grp_cd3.as("sppl_grp_cd3"))
					.groupBy(DS0D, S0_SPPL.bp_grp_cd3),
				when(boundOr("sppl_grp_flg3", "sppl_grp_cd3"))
					.predicate(DS0D, p -> p.cutoff$and(S0_SPPL.bp_grp_cd3.like(bind("sppl_grp_cd3")))),
				when(boundOr("sppl_grp_flg3"))
					.select(DS0D, S0_SPPL_GRP3.bp_grp_nm.as("sppl_grp_nm3"))
					.groupBy(DS0D, S0_SPPL_GRP3.bp_grp_nm),
				when(boundOr("sppl_grp_flg3", "sppl_grp_nm3"))
					.view(DS0D, v -> v.leftOuterJoin(S0_SPPL_GRP3).on(S0_SPPL.bp_grp_cd3.eq(S0_SPPL_GRP3.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP3.value()).eq(S0_SPPL_GRP3.bp_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_SPPL_GRP3.bp_grp_nm.like(bind("sppl_grp_nm3")))),
				when(boundOr("sppl_grp_flg4"))
					.select(DS0D, S0_SPPL.bp_grp_cd4.as("sppl_grp_cd4"))
					.groupBy(DS0D, S0_SPPL.bp_grp_cd4),
				when(boundOr("sppl_grp_flg4", "sppl_grp_cd4"))
					.predicate(DS0D, p -> p.cutoff$and(S0_SPPL.bp_grp_cd4.like(bind("sppl_grp_cd4")))),
				when(boundOr("sppl_grp_flg4"))
					.select(DS0D, S0_SPPL_GRP4.bp_grp_nm.as("sppl_grp_nm4"))
					.groupBy(DS0D, S0_SPPL_GRP4.bp_grp_nm),
				when(boundOr("sppl_grp_flg4", "sppl_grp_nm4"))
					.view(DS0D, v -> v.leftOuterJoin(S0_SPPL_GRP4).on(S0_SPPL.bp_grp_cd4.eq(S0_SPPL_GRP4.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP4.value()).eq(S0_SPPL_GRP4.bp_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_SPPL_GRP4.bp_grp_nm.like(bind("sppl_grp_nm4")))),
				when(boundOr("sppl_grp_flg5"))
					.select(DS0D, S0_SPPL.bp_grp_cd5.as("sppl_grp_cd5"))
					.groupBy(DS0D, S0_SPPL.bp_grp_cd5),
				when(boundOr("sppl_grp_flg5", "sppl_grp_cd5"))
					.predicate(DS0D, p -> p.cutoff$and(S0_SPPL.bp_grp_cd5.like(bind("sppl_grp_cd5")))),
				when(boundOr("sppl_grp_flg5"))
					.select(DS0D, S0_SPPL_GRP5.bp_grp_nm.as("sppl_grp_nm5"))
					.groupBy(DS0D, S0_SPPL_GRP5.bp_grp_nm),
				when(boundOr("sppl_grp_flg5", "sppl_grp_nm5"))
					.view(DS0D, v -> v.leftOuterJoin(S0_SPPL_GRP5).on(S0_SPPL.bp_grp_cd5.eq(S0_SPPL_GRP5.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP5.value()).eq(S0_SPPL_GRP5.bp_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_SPPL_GRP5.bp_grp_nm.like(bind("sppl_grp_nm5")))),
				when(boundOr("sppl_grp_flg6"))
					.select(DS0D, S0_SPPL.bp_grp_cd6.as("sppl_grp_cd6"))
					.groupBy(DS0D, S0_SPPL.bp_grp_cd6),
				when(boundOr("sppl_grp_flg6", "sppl_grp_cd6"))
					.predicate(DS0D, p -> p.cutoff$and(S0_SPPL.bp_grp_cd6.like(bind("sppl_grp_cd6")))),
				when(boundOr("sppl_grp_flg6"))
					.select(DS0D, S0_SPPL_GRP6.bp_grp_nm.as("sppl_grp_nm6"))
					.groupBy(DS0D, S0_SPPL_GRP6.bp_grp_nm),
				when(boundOr("sppl_grp_flg6", "sppl_grp_nm6"))
					.view(DS0D, v -> v.leftOuterJoin(S0_SPPL_GRP6).on(S0_SPPL.bp_grp_cd6.eq(S0_SPPL_GRP6.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP6.value()).eq(S0_SPPL_GRP6.bp_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_SPPL_GRP6.bp_grp_nm.like(bind("sppl_grp_nm6")))),
				when(boundOr("sppl_grp_flg7"))
					.select(DS0D, S0_SPPL.bp_grp_cd7.as("sppl_grp_cd7"))
					.groupBy(DS0D, S0_SPPL.bp_grp_cd7),
				when(boundOr("sppl_grp_flg7", "sppl_grp_cd7"))
					.predicate(DS0D, p -> p.cutoff$and(S0_SPPL.bp_grp_cd7.like(bind("sppl_grp_cd7")))),
				when(boundOr("sppl_grp_flg7"))
					.select(DS0D, S0_SPPL_GRP7.bp_grp_nm.as("sppl_grp_nm7"))
					.groupBy(DS0D, S0_SPPL_GRP7.bp_grp_nm),
				when(boundOr("sppl_grp_flg7", "sppl_grp_nm7"))
					.view(DS0D, v -> v.leftOuterJoin(S0_SPPL_GRP7).on(S0_SPPL.bp_grp_cd7.eq(S0_SPPL_GRP7.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP7.value()).eq(S0_SPPL_GRP7.bp_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_SPPL_GRP7.bp_grp_nm.like(bind("sppl_grp_nm7")))),
				when(boundOr("sppl_grp_flg8"))
					.select(DS0D, S0_SPPL.bp_grp_cd8.as("sppl_grp_cd8"))
					.groupBy(DS0D, S0_SPPL.bp_grp_cd8),
				when(boundOr("sppl_grp_flg8", "sppl_grp_cd8"))
					.predicate(DS0D, p -> p.cutoff$and(S0_SPPL.bp_grp_cd8.like(bind("sppl_grp_cd8")))),
				when(boundOr("sppl_grp_flg8"))
					.select(DS0D, S0_SPPL_GRP8.bp_grp_nm.as("sppl_grp_nm8"))
					.groupBy(DS0D, S0_SPPL_GRP8.bp_grp_nm),
				when(boundOr("sppl_grp_flg8", "sppl_grp_nm8"))
					.view(DS0D, v -> v.leftOuterJoin(S0_SPPL_GRP8).on(S0_SPPL.bp_grp_cd8.eq(S0_SPPL_GRP8.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP8.value()).eq(S0_SPPL_GRP8.bp_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_SPPL_GRP8.bp_grp_nm.like(bind("sppl_grp_nm8")))),
				when(boundOr("sppl_grp_flg9"))
					.select(DS0D, S0_SPPL.bp_grp_cd9.as("sppl_grp_cd9"))
					.groupBy(DS0D, S0_SPPL.bp_grp_cd9),
				when(boundOr("sppl_grp_flg9", "sppl_grp_cd9"))
					.predicate(DS0D, p -> p.cutoff$and(S0_SPPL.bp_grp_cd9.like(bind("sppl_grp_cd9")))),
				when(boundOr("sppl_grp_flg9"))
					.select(DS0D, S0_SPPL_GRP9.bp_grp_nm.as("sppl_grp_nm9"))
					.groupBy(DS0D, S0_SPPL_GRP9.bp_grp_nm),
				when(boundOr("sppl_grp_flg9", "sppl_grp_nm9"))
					.view(DS0D, v -> v.leftOuterJoin(S0_SPPL_GRP9).on(S0_SPPL.bp_grp_cd9.eq(S0_SPPL_GRP9.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP9.value()).eq(S0_SPPL_GRP9.bp_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_SPPL_GRP9.bp_grp_nm.like(bind("sppl_grp_nm9")))),
				when(boundOr("sppl_grp_flg10"))
					.select(DS0D, S0_SPPL.bp_grp_cd10.as("sppl_grp_cd10"))
					.groupBy(DS0D, S0_SPPL.bp_grp_cd10),
				when(boundOr("sppl_grp_flg10", "sppl_grp_cd10"))
					.predicate(DS0D, p -> p.cutoff$and(S0_SPPL.bp_grp_cd10.like(bind("sppl_grp_cd10")))),
				when(boundOr("sppl_grp_flg10"))
					.select(DS0D, S0_SPPL_GRP10.bp_grp_nm.as("sppl_grp_nm10"))
					.groupBy(DS0D, S0_SPPL_GRP10.bp_grp_nm),
				when(boundOr("sppl_grp_flg10", "sppl_grp_nm10"))
					.view(DS0D, v -> v.leftOuterJoin(S0_SPPL_GRP10).on(S0_SPPL.bp_grp_cd10.eq(S0_SPPL_GRP10.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP10.value()).eq(S0_SPPL_GRP10.bp_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_SPPL_GRP10.bp_grp_nm.like(bind("sppl_grp_nm10")))),
				when(boundOr("trd_nm"))
					.view(DS0D, v -> v.leftOuterJoin(S0_TRD).on(S0_TRD.trd_cd.eq(S0_V1.pr(S1_T1.trd_cd))))
					.predicate(DS0D, p -> p.cutoff$and(S0_TRD.trd_nm.like(bind("trd_nm")))),
				when(boundOr("po_schd_src_typ", "po_schd_src_no"))
					.view(DS0D, v -> v.leftOuterJoin(S0_PO_SCHD).on(S0_PO_SCHD.po_schd_no.eq(S0_V1.pr(S1_T7.po_schd_no))))
					.predicate(DS0D, p -> p.cutoff$and(S0_PO_SCHD.po_schd_src_typ.like(bind("po_schd_src_typ"))).cutoff$and(S0_PO_SCHD.po_schd_src_no.like(bind("po_schd_src_no")))),
				when(boundOr("itm_typ"))
					.predicate(DS0D, p -> p.cutoff$and(S0_ITM.itm_typ.like(bind("itm_typ")))),
				when(boundOr("itm_typ_d_cd"))
					.predicate(DS0D, p -> p.cutoff$and(S0_ITM.itm_typ_d_cd.like(bind("itm_typ_d_cd")))),
				when(boundOr("itm_typ_d_nm"))
					.view(DS0D, v -> v.leftOuterJoin(S0_ITM_TYP_D).on(S0_ITM_TYP_D.itm_typ.eq(S0_ITM.itm_typ).and(S0_ITM_TYP_D.itm_typ_d_cd.eq(S0_ITM.itm_typ_d_cd))))
					.predicate(DS0D, p -> p.cutoff$and(S0_ITM_TYP_D.itm_typ_d_nm.like(bind("itm_typ_d_nm")))),
				when(boundOr("maker_nm"))
					.view(DS0D, v -> v.leftOuterJoin(S0_MAKER).on(S0_MAKER.bp_cd.eq(S0_V1.pr(S1_T2.maker_cd))))
					.predicate(DS0D, p -> p.cutoff$and(S0_MAKER.bp_nm.like(bind("maker_nm")))),
				when(boundOr("site_cd", "site_nm", "in_to_loc_nm"))
					.view(DS0D, v -> v.leftOuterJoin(S0_IN_TO_LOC).on(S0_IN_TO_LOC.loc_cd.eq(S0_V1.pr(S1_T2.in_to_loc_cd))).leftOuterJoin(S0_IN_TO_LOC_SITE).on(S0_IN_TO_LOC_SITE.site_cd.eq(S0_IN_TO_LOC.site_cd)))
					.predicate(DS0D, p -> p.cutoff$and(S0_IN_TO_LOC.site_cd.like(bind("site_cd"))).cutoff$and(S0_IN_TO_LOC.loc_nm.like(bind("in_to_loc_nm"))).cutoff$and(S0_IN_TO_LOC_SITE.site_nm.like(bind("site_nm")))),
				when(boundOr("in_to_loc_wg_nm"))
					.view(DS0D, v -> v.leftOuterJoin(S0_IN_TO_LOC_WG).on(S0_IN_TO_LOC_WG.wg_cd.eq(S0_V1.pr(S1_T2.in_to_loc_wg_cd))))
					.predicate(DS0D, p -> p.cutoff$and(S0_IN_TO_LOC_WG.wg_nm.like(bind("in_to_loc_wg_nm")))),
				when(boundOr("str_ln_nm"))
					.view(DS0D, v -> v.leftOuterJoin(S0_STR_LN).on(S0_STR_LN.loc_cd.eq(S0_V1.pr(S1_T2.in_to_loc_cd)).and(S0_STR_LN.str_ln_cd.eq(S0_V1.pr(S1_T2.str_ln_cd)))))
					.predicate(DS0D, p -> p.cutoff$and(S0_STR_LN.str_ln_nm.like(bind("str_ln_nm")))),
				when(boundOr("ap_dpt_nm"))
					.view(DS0D, v -> v.leftOuterJoin(S0_AP_DPT).on(S0_AP_DPT.dpt_cd.eq(S0_V1.pr(S1_T2.ap_dpt_cd)).and(S0_V1.pr("master_dt").between(S0_AP_DPT.st_dt, S0_AP_DPT.end_dt))))
					.predicate(DS0D, p -> p.cutoff$and(S0_AP_DPT.dpt_nm.like(bind("ap_dpt_nm")))),
				when(boundOr("purc_usr_nm"))
					.view(DS0D, v -> v.leftOuterJoin(S0_USR).on(S0_USR.usr_cd.eq(S0_V1.pr(S1_T1.purc_usr_cd))))
					.predicate(DS0D, p -> p.cutoff$and(S0_USR.usr_nm.like(bind("purc_usr_nm")))),
				when(boundOr("purc_dpt_nm"))
					.view(DS0D, v -> v.leftOuterJoin(S0_DPT).on(S0_DPT.dpt_cd.eq(S0_V1.pr(S1_T1.purc_dpt_cd)).and(S0_V1.pr("master_dt").between(S0_DPT.st_dt, S0_DPT.end_dt))))
					.predicate(DS0D, p -> p.cutoff$and(S0_DPT.dpt_nm.like(bind("purc_dpt_nm")))),
				when(boundOr("purc_dpt_wg_nm"))
					.view(DS0D, v -> v.leftOuterJoin(S0_WG).on(S0_WG.wg_cd.eq(S0_V1.pr("purc_dpt_wg_cd"))))
					.predicate(DS0D, p -> p.cutoff$and(S0_WG.wg_nm.like(bind("purc_dpt_wg_nm"))))
			);
	}

	/**
	 * -- MSBDL0130_MST_PURC_ACT_Query_S01
	 */
	static MCQueryPlan MSBDL0130_MST_PURC_ACT_S01() {
		MCTempView S0_V1 = createTempView("V1");
		MAM_TRD_R S0_TRD = MAM_TRD_R.create("TRD");
		MST_PO_SCHD_R S0_PO_SCHD = MST_PO_SCHD_R.create("PO_SCHD");
		MAM_BP_R S0_SPPL = MAM_BP_R.create("SPPL");
		MAM_BP_GRP_R S0_SPPL_GRP1 = MAM_BP_GRP_R.create("SPPL_GRP1");
		MAM_BP_GRP_R S0_SPPL_GRP2 = MAM_BP_GRP_R.create("SPPL_GRP2");
		MAM_BP_GRP_R S0_SPPL_GRP3 = MAM_BP_GRP_R.create("SPPL_GRP3");
		MAM_BP_GRP_R S0_SPPL_GRP4 = MAM_BP_GRP_R.create("SPPL_GRP4");
		MAM_BP_GRP_R S0_SPPL_GRP5 = MAM_BP_GRP_R.create("SPPL_GRP5");
		MAM_BP_GRP_R S0_SPPL_GRP6 = MAM_BP_GRP_R.create("SPPL_GRP6");
		MAM_BP_GRP_R S0_SPPL_GRP7 = MAM_BP_GRP_R.create("SPPL_GRP7");
		MAM_BP_GRP_R S0_SPPL_GRP8 = MAM_BP_GRP_R.create("SPPL_GRP8");
		MAM_BP_GRP_R S0_SPPL_GRP9 = MAM_BP_GRP_R.create("SPPL_GRP9");
		MAM_BP_GRP_R S0_SPPL_GRP10 = MAM_BP_GRP_R.create("SPPL_GRP10");
		MAM_USR_R S0_USR = MAM_USR_R.create("USR");
		MAM_DPT_R S0_DPT = MAM_DPT_R.create("DPT");
		MAM_WG_R S0_WG = MAM_WG_R.create("WG");
		MST_PURC_ACT_R S1_T1 = MST_PURC_ACT_R.create("T1");
		MST_PURC_ACT_D_R S1_T2 = MST_PURC_ACT_D_R.create("T2");
		MST_PURC_SCHD_R S1_T4 = MST_PURC_SCHD_R.create("T4");
		MST_ARR_SCHD_R S1_T5 = MST_ARR_SCHD_R.create("T5");
		MST_ARR_PR_R S1_T6 = MST_ARR_PR_R.create("T6");
		MST_PO_D_R S1_T7 = MST_PO_D_R.create("T7");
		MST_PO_R S1_T9 = MST_PO_R.create("T9");
		MST_RCPT_IV_D_R S1_T20 = MST_RCPT_IV_D_R.create("T20");
		MST_RCPT_IV_R S1_T21 = MST_RCPT_IV_R.create("T21");
		MAVM_RD_DPT_R S1_M0 = MAVM_RD_DPT_R.create("M0");
		
		MCDynamicSQLID DS0D = createDynamicSQLID("DS0D");
		
		return createQueryPlan()
			.setQuery(
				sql("MSBDL0130_MST_PURC_ACT_Query_S01")
					.mainQuery()
					.select(
						S0_V1.prAll(),
						addDynamicSelect(DS0D)
					)
					.from(
						subQuery()
						.select(
							S1_T1.purc_act_no,
							S1_T1.purc_act_seq,
							S1_T1.purc_act_rev,
							S1_T1.trd_cd,
							S1_T1.trd_ptn_typ,
							S1_T1.slip_sts_typ,
							S1_T1.po_no,
							S1_T1.purc_dpt_cd,
							S1_T1.wg_cd.as("purc_dpt_wg_cd"),
							S1_T1.purc_usr_cd,
							S1_T1.sppl_cd,
							MAPA_BP$F_GET_BP_ADDR(
								S1_T1.sppl_cd,
								S1_T1.ac_dt,
								value(MAC_BP_ADDR_TYP.SPPL_CNTCT_DPT.value())
							).as("sppl_cntct_dpt"),
							MAPA_BP$F_GET_BP_ADDR(
								S1_T1.sppl_cd,
								S1_T1.ac_dt,
								value(MAC_BP_ADDR_TYP.SPPL_CNTCT_PSN.value())
							).as("sppl_cntct_psn"),
							MAPA_BP$F_GET_BP_ADDR(
								S1_T1.sppl_cd,
								S1_T1.ac_dt,
								value(MAC_BP_ADDR_TYP.TEL.value())
							).as("sppl_tel"),
							MAPA_BP$F_GET_BP_ADDR(
								S1_T1.sppl_cd,
								S1_T1.ac_dt,
								value(MAC_BP_ADDR_TYP.FAX.value())
							).as("sppl_fax"),
							S1_T1.asppl_cd,
							S1_T1.trd_cur_cd,
							S1_T1.ptax_cur_cd,
							S1_T1.base_cur_cd,
							S1_T1.xrate_cd,
							nvl2(
								S1_T21.rcpt_iv_no,
								S1_T21.xrate_inpt_flg,
								S1_T9.xrate_inpt_flg
							).as("xrate_inpt_flg"),
							S1_T1.xrate,
							nvl2(
								S1_T21.rcpt_iv_no,
								S1_T21.ptax_xrate_inpt_flg,
								S1_T9.ptax_xrate_inpt_flg
							).as("ptax_xrate_inpt_flg"),
							S1_T1.ptax_xrate,
							S1_T1.purc_dt,
							S1_T1.ac_dt,
							S1_T1.pay_basis_dt,
							S1_T1.pay_schd_dt,
							S1_T1.ptax_dt,
							S1_T1.rcpt_iv_no,
							S1_T1.rcpt_iv_mng_no,
							S1_T1.ref_rcpt_iv_no,
							S1_T1.purc_ret_act_no,
							S1_T1.purc_ret_act_rev,
							S1_T1.tterm_cd1,
							S1_T1.tterm_rmrks1,
							S1_T1.tterm_cd2,
							S1_T1.tterm_rmrks2,
							S1_T1.tterm_cd3,
							S1_T1.tterm_rmrks3,
							S1_T1.trd_rmrks,
							S1_T1.intr_rmrks,
							S1_T9.po_print_rmrks,
							S1_T1.adjst_dt,
							S1_T1.purc_adjst_typ,
							S1_T1.adjst_mtd_typ,
							S1_T1.purc_adjst_flg,
							S1_T1.sub_char1,
							S1_T1.sub_char2,
							S1_T1.sub_char3,
							S1_T1.ins_usr_id,
							S1_T1.ins_usr_nm,
							S1_T1.ins_ts,
							S1_T1.ins_func_id,
							S1_T1.upd_cntr.as("purc_act_upd_cntr"),
							S1_T1.upd_usr_id,
							S1_T1.upd_usr_nm,
							S1_T1.upd_ts,
							S1_T1.upd_func_id,
							S1_T1.upd_srv_req_no,
							S1_T21.upd_cntr.as("rcpt_iv_upd_cntr"),
							S1_T7.po_schd_no,
							S1_T1.ac_dt.as("master_dt"),
							S1_T2.purc_act_d_no,
							nvl(S1_T2.temp_ap_flg,value(false)).as("temp_ap_flg")
						)
						.from(
							S1_T1
							.leftOuterJoin(S1_T2).on(
								S1_T1.purc_act_no.eq(S1_T2.purc_act_no)
								.and(S1_T1.purc_act_seq.eq(S1_T2.purc_act_seq))
							)
							.leftOuterJoin(S1_T4).on(
								S1_T2.purc_schd_no.eq(S1_T4.purc_schd_no)
								.and(S1_T4.non_purc_flg.eq(value(false)))
							)
							.leftOuterJoin(S1_T5).on(S1_T4.arr_schd_no.eq(S1_T5.arr_schd_no))
							.leftOuterJoin(S1_T6).on(S1_T5.arr_pr_no.eq(S1_T6.arr_pr_no))
							.leftOuterJoin(S1_T7).on(S1_T2.po_d_no.eq(S1_T7.po_d_no))
							.leftOuterJoin(S1_T9).on(S1_T7.po_no.eq(S1_T9.po_no))
							.leftOuterJoin(S1_T20).on(S1_T2.rcpt_iv_d_no.eq(S1_T20.rcpt_iv_d_no))
							.leftOuterJoin(S1_T21).on(S1_T20.rcpt_iv_mng_no.eq(S1_T21.rcpt_iv_mng_no))
							.innerJoin(S1_M0).on(S1_T1.purc_dpt_cd.eq(S1_M0.dpt_cd))
						)
						.where(
							value(0).eq(value(0))
							.and(S1_T1.slip_sts_typ.eq(value(MAC_SLIP_STS_TYP.CRT.value())))
							.and(
								S1_T1.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.PURC.value()))
								.or(S1_T1.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.PURC_XPNS.value())))
							)
							.cutoff$and(
								bracket(
									value(true).eq(bind("_expt_unplan_flg"))
									.and(S1_T1.po_no.isNotNull())
								)
							)
							.and(
								bracket(
									S1_T2.temp_ap_flg.isNull()
									.or(S1_T2.temp_ap_flg.eq(value(false)))
									.cutoff$or(
										value(true).eq(bind("_temp_ap_flg"))
										.and(S1_T2.temp_ap_flg.eq(value(true)))
									)
								)
							)
							.cutoff$and(S1_T5.arr_ptn_typ.eq(bind("_arr_ptn_typ")))
							.cutoff$and(S1_T5.cmpl_flg.eq(bind("_arr_cmpl_flg")))
							.cutoff$and(S1_T4.cmpl_flg.eq(bind("_purc_cmpl_flg")))
							.cutoff$and(S1_T2.edi_flg.eq(bind("_edi_flg")))
							.cutoff$and(S1_T4.purc_schd_dt.gte(bind("purc_schd_dt_fr")))
							.cutoff$and(S1_T4.purc_schd_dt.lte(bind("purc_schd_dt_to")))
							.cutoff$and(S1_T1.purc_dt.gte(bind("purc_dt_fr")))
							.cutoff$and(S1_T1.purc_dt.lte(bind("purc_dt_to")))
							.cutoff$and(S1_T1.ac_dt.gte(bind("ac_dt_fr")))
							.cutoff$and(S1_T1.ac_dt.lte(bind("ac_dt_to")))
							.cutoff$and(S1_T1.sppl_cd.like(bind("sppl_cd")))
							.cutoff$and(S1_T1.purc_usr_cd.like(bind("purc_usr_cd")))
							.cutoff$and(S1_T1.purc_dpt_cd.like(bind("purc_dpt_cd")))
							.cutoff$and(S1_T1.wg_cd.like(bind("purc_dpt_wg_cd")))
							.cutoff$and(S1_T7.po_schd_no.like(bind("po_schd_no")))
							.cutoff$and(S1_T7.po_d_no.like(bind("po_d_no")))
							.cutoff$and(S1_T1.rcpt_iv_no.like(bind("rcpt_iv_no")))
							.cutoff$and(S1_T1.rcpt_iv_mng_no.like(bind("rcpt_iv_mng_no")))
							.cutoff$and(S1_T4.purc_schd_no.like(bind("purc_schd_no")))
							.cutoff$and(S1_T1.purc_act_no.like(bind("purc_act_no")))
							.cutoff$and(S1_T1.po_no.like(bind("po_no")))
							.cutoff$and(S1_T1.trd_cd.like(bind("trd_cd")))
							.cutoff$and(S1_T1.trd_cur_cd.like(bind("trd_cur_cd")))
							.cutoff$and(S1_T1.trd_rmrks.like(bind("trd_rmrks")))
							.cutoff$and(S1_T1.intr_rmrks.like(bind("intr_rmrks")))
							.cutoff$and(S1_T1.sub_char1.like(bind("sub_char1")))
							.cutoff$and(S1_T1.sub_char2.like(bind("sub_char2")))
							.cutoff$and(S1_T1.sub_char3.like(bind("sub_char3")))
						).view(S0_V1)
						.addDynamicView(DS0D)
					)
					.where(
						value(0).eq(value(0))
						.addDynamicPredicate(DS0D)
					)
					.orderBy(S0_V1.pr(S1_T1.purc_act_no).asc(), S0_V1.pr(S1_T2.purc_act_d_no).asc())
			)
			.setDynamicSQLInfo(
				when(boundOr("sppl_nm", "_iv_flg", "sppl_grp_flg1", "sppl_grp_flg2", "sppl_grp_flg3", "sppl_grp_flg4", "sppl_grp_flg5", "sppl_grp_flg6", "sppl_grp_flg7", "sppl_grp_flg8", "sppl_grp_flg9", "sppl_grp_flg10"))
					.view(DS0D, v -> v.leftOuterJoin(S0_SPPL).on(S0_SPPL.bp_cd.eq(S0_V1.pr(S1_T1.sppl_cd))))
					.predicate(DS0D, p -> p.cutoff$and(S0_SPPL.sppl_iv_flg.eq(bind("_iv_flg"))).cutoff$and(S0_SPPL.bp_nm.like(bind("sppl_nm")))),
				when(boundOr("sppl_grp_flg1"))
					.select(DS0D, S0_SPPL.bp_grp_cd1.as("sppl_grp_cd1"))
					.groupBy(DS0D, S0_SPPL.bp_grp_cd1),
				when(boundOr("sppl_grp_flg1", "sppl_grp_cd1"))
					.predicate(DS0D, p -> p.cutoff$and(S0_SPPL.bp_grp_cd1.like(bind("sppl_grp_cd1")))),
				when(boundOr("sppl_grp_flg1"))
					.select(DS0D, S0_SPPL_GRP1.bp_grp_nm.as("sppl_grp_nm1"))
					.groupBy(DS0D, S0_SPPL_GRP1.bp_grp_nm),
				when(boundOr("sppl_grp_flg1", "sppl_grp_nm1"))
					.view(DS0D, v -> v.leftOuterJoin(S0_SPPL_GRP1).on(S0_SPPL.bp_grp_cd1.eq(S0_SPPL_GRP1.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP1.value()).eq(S0_SPPL_GRP1.bp_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_SPPL_GRP1.bp_grp_nm.like(bind("sppl_grp_nm1")))),
				when(boundOr("sppl_grp_flg2"))
					.select(DS0D, S0_SPPL.bp_grp_cd2.as("sppl_grp_cd2"))
					.groupBy(DS0D, S0_SPPL.bp_grp_cd2),
				when(boundOr("sppl_grp_flg2", "sppl_grp_cd2"))
					.predicate(DS0D, p -> p.cutoff$and(S0_SPPL.bp_grp_cd2.like(bind("sppl_grp_cd2")))),
				when(boundOr("sppl_grp_flg2"))
					.select(DS0D, S0_SPPL_GRP2.bp_grp_nm.as("sppl_grp_nm2"))
					.groupBy(DS0D, S0_SPPL_GRP2.bp_grp_nm),
				when(boundOr("sppl_grp_flg2", "sppl_grp_nm2"))
					.view(DS0D, v -> v.leftOuterJoin(S0_SPPL_GRP2).on(S0_SPPL.bp_grp_cd2.eq(S0_SPPL_GRP2.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP2.value()).eq(S0_SPPL_GRP2.bp_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_SPPL_GRP2.bp_grp_nm.like(bind("sppl_grp_nm2")))),
				when(boundOr("sppl_grp_flg3"))
					.select(DS0D, S0_SPPL.bp_grp_cd3.as("sppl_grp_cd3"))
					.groupBy(DS0D, S0_SPPL.bp_grp_cd3),
				when(boundOr("sppl_grp_flg3", "sppl_grp_cd3"))
					.predicate(DS0D, p -> p.cutoff$and(S0_SPPL.bp_grp_cd3.like(bind("sppl_grp_cd3")))),
				when(boundOr("sppl_grp_flg3"))
					.select(DS0D, S0_SPPL_GRP3.bp_grp_nm.as("sppl_grp_nm3"))
					.groupBy(DS0D, S0_SPPL_GRP3.bp_grp_nm),
				when(boundOr("sppl_grp_flg3", "sppl_grp_nm3"))
					.view(DS0D, v -> v.leftOuterJoin(S0_SPPL_GRP3).on(S0_SPPL.bp_grp_cd3.eq(S0_SPPL_GRP3.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP3.value()).eq(S0_SPPL_GRP3.bp_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_SPPL_GRP3.bp_grp_nm.like(bind("sppl_grp_nm3")))),
				when(boundOr("sppl_grp_flg4"))
					.select(DS0D, S0_SPPL.bp_grp_cd4.as("sppl_grp_cd4"))
					.groupBy(DS0D, S0_SPPL.bp_grp_cd4),
				when(boundOr("sppl_grp_flg4", "sppl_grp_cd4"))
					.predicate(DS0D, p -> p.cutoff$and(S0_SPPL.bp_grp_cd4.like(bind("sppl_grp_cd4")))),
				when(boundOr("sppl_grp_flg4"))
					.select(DS0D, S0_SPPL_GRP4.bp_grp_nm.as("sppl_grp_nm4"))
					.groupBy(DS0D, S0_SPPL_GRP4.bp_grp_nm),
				when(boundOr("sppl_grp_flg4", "sppl_grp_nm4"))
					.view(DS0D, v -> v.leftOuterJoin(S0_SPPL_GRP4).on(S0_SPPL.bp_grp_cd4.eq(S0_SPPL_GRP4.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP4.value()).eq(S0_SPPL_GRP4.bp_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_SPPL_GRP4.bp_grp_nm.like(bind("sppl_grp_nm4")))),
				when(boundOr("sppl_grp_flg5"))
					.select(DS0D, S0_SPPL.bp_grp_cd5.as("sppl_grp_cd5"))
					.groupBy(DS0D, S0_SPPL.bp_grp_cd5),
				when(boundOr("sppl_grp_flg5", "sppl_grp_cd5"))
					.predicate(DS0D, p -> p.cutoff$and(S0_SPPL.bp_grp_cd5.like(bind("sppl_grp_cd5")))),
				when(boundOr("sppl_grp_flg5"))
					.select(DS0D, S0_SPPL_GRP5.bp_grp_nm.as("sppl_grp_nm5"))
					.groupBy(DS0D, S0_SPPL_GRP5.bp_grp_nm),
				when(boundOr("sppl_grp_flg5", "sppl_grp_nm5"))
					.view(DS0D, v -> v.leftOuterJoin(S0_SPPL_GRP5).on(S0_SPPL.bp_grp_cd5.eq(S0_SPPL_GRP5.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP5.value()).eq(S0_SPPL_GRP5.bp_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_SPPL_GRP5.bp_grp_nm.like(bind("sppl_grp_nm5")))),
				when(boundOr("sppl_grp_flg6"))
					.select(DS0D, S0_SPPL.bp_grp_cd6.as("sppl_grp_cd6"))
					.groupBy(DS0D, S0_SPPL.bp_grp_cd6),
				when(boundOr("sppl_grp_flg6", "sppl_grp_cd6"))
					.predicate(DS0D, p -> p.cutoff$and(S0_SPPL.bp_grp_cd6.like(bind("sppl_grp_cd6")))),
				when(boundOr("sppl_grp_flg6"))
					.select(DS0D, S0_SPPL_GRP6.bp_grp_nm.as("sppl_grp_nm6"))
					.groupBy(DS0D, S0_SPPL_GRP6.bp_grp_nm),
				when(boundOr("sppl_grp_flg6", "sppl_grp_nm6"))
					.view(DS0D, v -> v.leftOuterJoin(S0_SPPL_GRP6).on(S0_SPPL.bp_grp_cd6.eq(S0_SPPL_GRP6.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP6.value()).eq(S0_SPPL_GRP6.bp_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_SPPL_GRP6.bp_grp_nm.like(bind("sppl_grp_nm6")))),
				when(boundOr("sppl_grp_flg7"))
					.select(DS0D, S0_SPPL.bp_grp_cd7.as("sppl_grp_cd7"))
					.groupBy(DS0D, S0_SPPL.bp_grp_cd7),
				when(boundOr("sppl_grp_flg7", "sppl_grp_cd7"))
					.predicate(DS0D, p -> p.cutoff$and(S0_SPPL.bp_grp_cd7.like(bind("sppl_grp_cd7")))),
				when(boundOr("sppl_grp_flg7"))
					.select(DS0D, S0_SPPL_GRP7.bp_grp_nm.as("sppl_grp_nm7"))
					.groupBy(DS0D, S0_SPPL_GRP7.bp_grp_nm),
				when(boundOr("sppl_grp_flg7", "sppl_grp_nm7"))
					.view(DS0D, v -> v.leftOuterJoin(S0_SPPL_GRP7).on(S0_SPPL.bp_grp_cd7.eq(S0_SPPL_GRP7.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP7.value()).eq(S0_SPPL_GRP7.bp_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_SPPL_GRP7.bp_grp_nm.like(bind("sppl_grp_nm7")))),
				when(boundOr("sppl_grp_flg8"))
					.select(DS0D, S0_SPPL.bp_grp_cd8.as("sppl_grp_cd8"))
					.groupBy(DS0D, S0_SPPL.bp_grp_cd8),
				when(boundOr("sppl_grp_flg8", "sppl_grp_cd8"))
					.predicate(DS0D, p -> p.cutoff$and(S0_SPPL.bp_grp_cd8.like(bind("sppl_grp_cd8")))),
				when(boundOr("sppl_grp_flg8"))
					.select(DS0D, S0_SPPL_GRP8.bp_grp_nm.as("sppl_grp_nm8"))
					.groupBy(DS0D, S0_SPPL_GRP8.bp_grp_nm),
				when(boundOr("sppl_grp_flg8", "sppl_grp_nm8"))
					.view(DS0D, v -> v.leftOuterJoin(S0_SPPL_GRP8).on(S0_SPPL.bp_grp_cd8.eq(S0_SPPL_GRP8.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP8.value()).eq(S0_SPPL_GRP8.bp_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_SPPL_GRP8.bp_grp_nm.like(bind("sppl_grp_nm8")))),
				when(boundOr("sppl_grp_flg9"))
					.select(DS0D, S0_SPPL.bp_grp_cd9.as("sppl_grp_cd9"))
					.groupBy(DS0D, S0_SPPL.bp_grp_cd9),
				when(boundOr("sppl_grp_flg9", "sppl_grp_cd9"))
					.predicate(DS0D, p -> p.cutoff$and(S0_SPPL.bp_grp_cd9.like(bind("sppl_grp_cd9")))),
				when(boundOr("sppl_grp_flg9"))
					.select(DS0D, S0_SPPL_GRP9.bp_grp_nm.as("sppl_grp_nm9"))
					.groupBy(DS0D, S0_SPPL_GRP9.bp_grp_nm),
				when(boundOr("sppl_grp_flg9", "sppl_grp_nm9"))
					.view(DS0D, v -> v.leftOuterJoin(S0_SPPL_GRP9).on(S0_SPPL.bp_grp_cd9.eq(S0_SPPL_GRP9.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP9.value()).eq(S0_SPPL_GRP9.bp_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_SPPL_GRP9.bp_grp_nm.like(bind("sppl_grp_nm9")))),
				when(boundOr("sppl_grp_flg10"))
					.select(DS0D, S0_SPPL.bp_grp_cd10.as("sppl_grp_cd10"))
					.groupBy(DS0D, S0_SPPL.bp_grp_cd10),
				when(boundOr("sppl_grp_flg10", "sppl_grp_cd10"))
					.predicate(DS0D, p -> p.cutoff$and(S0_SPPL.bp_grp_cd10.like(bind("sppl_grp_cd10")))),
				when(boundOr("sppl_grp_flg10"))
					.select(DS0D, S0_SPPL_GRP10.bp_grp_nm.as("sppl_grp_nm10"))
					.groupBy(DS0D, S0_SPPL_GRP10.bp_grp_nm),
				when(boundOr("sppl_grp_flg10", "sppl_grp_nm10"))
					.view(DS0D, v -> v.leftOuterJoin(S0_SPPL_GRP10).on(S0_SPPL.bp_grp_cd10.eq(S0_SPPL_GRP10.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP10.value()).eq(S0_SPPL_GRP10.bp_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_SPPL_GRP10.bp_grp_nm.like(bind("sppl_grp_nm10")))),
				when(boundOr("trd_nm"))
					.view(DS0D, v -> v.leftOuterJoin(S0_TRD).on(S0_TRD.trd_cd.eq(S0_V1.pr(S1_T1.trd_cd))))
					.predicate(DS0D, p -> p.cutoff$and(S0_TRD.trd_nm.like(bind("trd_nm")))),
				when(boundOr("po_schd_src_typ", "po_schd_src_no"))
					.view(DS0D, v -> v.leftOuterJoin(S0_PO_SCHD).on(S0_PO_SCHD.po_schd_no.eq(S0_V1.pr(S1_T7.po_schd_no))))
					.predicate(DS0D, p -> p.cutoff$and(S0_PO_SCHD.po_schd_src_typ.like(bind("po_schd_src_typ"))).cutoff$and(S0_PO_SCHD.po_schd_src_no.like(bind("po_schd_src_no")))),
				when(boundOr("purc_usr_nm"))
					.view(DS0D, v -> v.leftOuterJoin(S0_USR).on(S0_USR.usr_cd.eq(S0_V1.pr(S1_T1.purc_usr_cd))))
					.predicate(DS0D, p -> p.cutoff$and(S0_USR.usr_nm.like(bind("purc_usr_nm")))),
				when(boundOr("purc_dpt_nm"))
					.view(DS0D, v -> v.leftOuterJoin(S0_DPT).on(S0_DPT.dpt_cd.eq(S0_V1.pr(S1_T1.purc_dpt_cd)).and(S0_V1.pr("master_dt").between(S0_DPT.st_dt, S0_DPT.end_dt))))
					.predicate(DS0D, p -> p.cutoff$and(S0_DPT.dpt_nm.like(bind("purc_dpt_nm")))),
				when(boundOr("purc_dpt_wg_nm"))
					.view(DS0D, v -> v.leftOuterJoin(S0_WG).on(S0_WG.wg_cd.eq(S0_V1.pr("purc_dpt_wg_cd"))))
					.predicate(DS0D, p -> p.cutoff$and(S0_WG.wg_nm.like(bind("purc_dpt_wg_nm"))))
			);
	}
	
	/**
	 * -- MSBDL0130_MST_PURC_SCHD_Query_S04
	 */
	static MCQueryPlan MSBDL0130_MST_PURC_SCHD_S04() {
		MCTempView S0_V1 = createTempView("V1");
		MAM_LOC_R S0_M1 = MAM_LOC_R.create("M1");
		MAM_TRD_R S0_TRD = MAM_TRD_R.create("TRD");
		MST_PO_SCHD_R S0_PO_SCHD = MST_PO_SCHD_R.create("PO_SCHD");
		MAM_ITM_R S0_ITM = MAM_ITM_R.create("ITM");
		MAM_ITM_GRP_R S0_ITM_GRP1 = MAM_ITM_GRP_R.create("ITM_GRP1");
		MAM_ITM_GRP_R S0_ITM_GRP2 = MAM_ITM_GRP_R.create("ITM_GRP2");
		MAM_ITM_GRP_R S0_ITM_GRP3 = MAM_ITM_GRP_R.create("ITM_GRP3");
		MAM_ITM_GRP_R S0_ITM_GRP4 = MAM_ITM_GRP_R.create("ITM_GRP4");
		MAM_ITM_GRP_R S0_ITM_GRP5 = MAM_ITM_GRP_R.create("ITM_GRP5");
		MAM_ITM_GRP_R S0_ITM_GRP6 = MAM_ITM_GRP_R.create("ITM_GRP6");
		MAM_ITM_GRP_R S0_ITM_GRP7 = MAM_ITM_GRP_R.create("ITM_GRP7");
		MAM_ITM_GRP_R S0_ITM_GRP8 = MAM_ITM_GRP_R.create("ITM_GRP8");
		MAM_ITM_GRP_R S0_ITM_GRP9 = MAM_ITM_GRP_R.create("ITM_GRP9");
		MAM_ITM_GRP_R S0_ITM_GRP10 = MAM_ITM_GRP_R.create("ITM_GRP10");
		MAM_ITM_TYP_D_R S0_ITM_TYP_D = MAM_ITM_TYP_D_R.create("ITM_TYP_D");
		MAM_BP_R S0_SPPL = MAM_BP_R.create("SPPL");
		MAM_BP_GRP_R S0_SPPL_GRP1 = MAM_BP_GRP_R.create("SPPL_GRP1");
		MAM_BP_GRP_R S0_SPPL_GRP2 = MAM_BP_GRP_R.create("SPPL_GRP2");
		MAM_BP_GRP_R S0_SPPL_GRP3 = MAM_BP_GRP_R.create("SPPL_GRP3");
		MAM_BP_GRP_R S0_SPPL_GRP4 = MAM_BP_GRP_R.create("SPPL_GRP4");
		MAM_BP_GRP_R S0_SPPL_GRP5 = MAM_BP_GRP_R.create("SPPL_GRP5");
		MAM_BP_GRP_R S0_SPPL_GRP6 = MAM_BP_GRP_R.create("SPPL_GRP6");
		MAM_BP_GRP_R S0_SPPL_GRP7 = MAM_BP_GRP_R.create("SPPL_GRP7");
		MAM_BP_GRP_R S0_SPPL_GRP8 = MAM_BP_GRP_R.create("SPPL_GRP8");
		MAM_BP_GRP_R S0_SPPL_GRP9 = MAM_BP_GRP_R.create("SPPL_GRP9");
		MAM_BP_GRP_R S0_SPPL_GRP10 = MAM_BP_GRP_R.create("SPPL_GRP10");
		MAVM_BP_NM_R S0_MAKER = MAVM_BP_NM_R.create("MAKER");
		MAM_LOC_R S0_IN_TO_LOC = MAM_LOC_R.create("IN_TO_LOC");
		MAM_SITE_R S0_IN_TO_LOC_SITE = MAM_SITE_R.create("IN_TO_LOC_SITE");
		MAM_WG_R S0_IN_TO_LOC_WG = MAM_WG_R.create("IN_TO_LOC_WG");
		MAM_STR_LN_R S0_STR_LN = MAM_STR_LN_R.create("STR_LN");
		MAM_DPT_R S0_AP_DPT = MAM_DPT_R.create("AP_DPT");
		MAM_USR_R S0_USR = MAM_USR_R.create("USR");
		MAM_DPT_R S0_DPT = MAM_DPT_R.create("DPT");
		MAM_WG_R S0_WG = MAM_WG_R.create("WG");
		MCTempView S1_T4_VIEW = createTempView("T4_VIEW");
		MST_ARR_ACT_R S1_T10 = MST_ARR_ACT_R.create("T10");
		MST_STK_R S1_T11 = MST_STK_R.create("T11");
		MCTempView S1_T12 = createTempView("T12");
		MAM_ITM_R S1_M16 = MAM_ITM_R.create("M16");
		MAM_LOC_R S1_M18 = MAM_LOC_R.create("M18");
		MAM_LOC_R S1_M181 = MAM_LOC_R.create("M181");
		MST_PURC_SCHD_R S2_T4 = MST_PURC_SCHD_R.create("T4");
		MST_ARR_SCHD_R S2_T5 = MST_ARR_SCHD_R.create("T5");
		MST_ARR_PR_R S2_T6 = MST_ARR_PR_R.create("T6");
		MST_PO_D_R S2_T7 = MST_PO_D_R.create("T7");
		MST_PO_R S2_T9 = MST_PO_R.create("T9");
		MAVM_RD_DPT_R S2_M0 = MAVM_RD_DPT_R.create("M0");
		MAM_BP_R S2_M5 = MAM_BP_R.create("M5");
		MST_PRMS_RCPT_D_R S2_T10 = MST_PRMS_RCPT_D_R.create("T10");
		MST_DLV_INST_D_R S2_T11 = MST_DLV_INST_D_R.create("T11");
		MST_SLO_D_R S2_T15 = MST_SLO_D_R.create("T15");
		MST_ARR_ACT_R S4_T4 = MST_ARR_ACT_R.create("T4");
		MCTempView S4_V1 = createTempView("V1");
		MCTempView S4_T4_VIEW = createTempView("T4_VIEW");
		MST_PURC_ACT_IO_R S5_T1 = MST_PURC_ACT_IO_R.create("T1");
		MST_PURC_ACT_D_R S5_T2 = MST_PURC_ACT_D_R.create("T2");
		MST_PURC_ACT_R S5_T3 = MST_PURC_ACT_R.create("T3");
		MST_PURC_SCHD_R S6_T4 = MST_PURC_SCHD_R.create("T4");
		MST_ARR_SCHD_R S6_T5 = MST_ARR_SCHD_R.create("T5");
		MST_ARR_PR_R S6_T6 = MST_ARR_PR_R.create("T6");
		MST_PO_D_R S6_T7 = MST_PO_D_R.create("T7");
		MST_PO_R S6_T9 = MST_PO_R.create("T9");
		MAVM_RD_DPT_R S6_M0 = MAVM_RD_DPT_R.create("M0");
		MAM_BP_R S6_M5 = MAM_BP_R.create("M5");
		MST_PRMS_RCPT_D_R S6_T10 = MST_PRMS_RCPT_D_R.create("T10");
		MST_DLV_INST_D_R S6_T11 = MST_DLV_INST_D_R.create("T11");
		MST_SLO_D_R S6_T15 = MST_SLO_D_R.create("T15");
		MCTempView S8_T4_VIEW = createTempView("T4_VIEW");
		MAM_LOC_R S8_M18 = MAM_LOC_R.create("M18");
		MST_PURC_SCHD_R S9_T4 = MST_PURC_SCHD_R.create("T4");
		MST_ARR_SCHD_R S9_T5 = MST_ARR_SCHD_R.create("T5");
		MST_ARR_PR_R S9_T6 = MST_ARR_PR_R.create("T6");
		MST_PO_D_R S9_T7 = MST_PO_D_R.create("T7");
		MST_PO_R S9_T9 = MST_PO_R.create("T9");
		MAVM_RD_DPT_R S9_M0 = MAVM_RD_DPT_R.create("M0");
		MAM_BP_R S9_M5 = MAM_BP_R.create("M5");
		MST_PRMS_RCPT_D_R S9_T10 = MST_PRMS_RCPT_D_R.create("T10");
		MST_DLV_INST_D_R S9_T11 = MST_DLV_INST_D_R.create("T11");
		MST_SLO_D_R S9_T15 = MST_SLO_D_R.create("T15");
		
		MCDynamicSQLID DS0D = createDynamicSQLID("DS0D");
		// マスタデータの副問い合わせ
		// MAM_ITM_R(S1_M16)
		MCSubQuery S1_M16_stk_mng_typ = subQuery().select(S1_M16.stk_mng_typ).from(S1_M16).where(
				bracket(
						S1_T4_VIEW.pr(S2_T7.itm_cd).eq(S1_M16.itm_cd)
						.and(S1_T4_VIEW.pr(S2_T7.itm_sub1).eq(S1_M16.itm_sub1))
						.and(S1_T4_VIEW.pr(S2_T7.itm_sub2).eq(S1_M16.itm_sub2))
						.and(S1_T4_VIEW.pr(S2_T7.itm_sub3).eq(S1_M16.itm_sub3))
						)
				);
		// MAM_LOC_R(S1_M18)
		MCSubQuery S1_M18_wg_cd = subQuery().select(S1_M18.wg_cd).from(S1_M18).where(
				bracket(
						S1_T11.loc_cd.eq(S1_M18.loc_cd)
						)
				);
		// MAM_LOC_R(S1_M181)
		MCSubQuery S1_M181_wg_cd = subQuery().select(S1_M181.wg_cd).from(S1_M181).where(
				bracket(
						S1_T10.arr_loc_cd.eq(S1_M181.loc_cd)
						)
				);
		// MAM_LOC_R(S8_M18)
		MCSubQuery S8_M18_wg_cd = subQuery().select(S8_M18.wg_cd).from(S8_M18).where(
				bracket(
						S8_T4_VIEW.pr(S9_T5.arr_loc_cd).eq(S8_M18.loc_cd)
						)
				);
		
		return createQueryPlan()
			.setQuery(
				sql("MSBDL0130_MST_PURC_SCHD_Query_S04")
					.mainQuery()
					.select(
						S0_V1.prAll(),
						addDynamicSelect(DS0D)
					)
					.from(
						subQuery()
						.select(
							S1_T4_VIEW.pr(S2_T4.purc_schd_no),
							S1_T4_VIEW.pr(S2_T7.po_d_no),
							S1_T4_VIEW.pr(S2_T9.po_no),
							S1_T4_VIEW.pr(S2_T9.aprv_no),
							S1_T4_VIEW.pr(S2_T9.aprv_sts_typ),
							S1_T4_VIEW.pr(S2_T5.arr_schd_no),
							S1_T10.arr_act_no,
							S1_T4_VIEW.pr(S2_T9.trd_cd),
							S1_T4_VIEW.pr(S2_T9.trd_ptn_typ),
							S1_T4_VIEW.pr(S2_T9.edi_flg),
							S1_T4_VIEW.pr(S2_T4.purc_schd_dt),
							S1_T4_VIEW.pr("pay_basis_dt"),
							S1_T4_VIEW.pr("pay_schd_dt"),
							S1_T10.edi_bp_dlv_slip_d_no,
							S1_T10.edi_bp_dlv_slip_no,
							S1_T4_VIEW.pr(S2_T9.purc_dpt_cd),
							S1_T4_VIEW.pr("purc_dpt_wg_cd"),
							S1_T4_VIEW.pr(S2_T9.purc_usr_cd),
							S1_T4_VIEW.pr(S2_T9.sppl_cd),
							MAPA_BP$F_GET_BP_ADDR(
								S1_T4_VIEW.pr(S2_T9.sppl_cd),
								S1_T4_VIEW.pr(S2_T4.purc_schd_dt),
								value(MAC_BP_ADDR_TYP.SPPL_CNTCT_DPT.value())
							).as("sppl_cntct_dpt"),
							MAPA_BP$F_GET_BP_ADDR(
								S1_T4_VIEW.pr(S2_T9.sppl_cd),
								S1_T4_VIEW.pr(S2_T4.purc_schd_dt),
								value(MAC_BP_ADDR_TYP.SPPL_CNTCT_PSN.value())
							).as("sppl_cntct_psn"),
							MAPA_BP$F_GET_BP_ADDR(
								S1_T4_VIEW.pr(S2_T9.sppl_cd),
								S1_T4_VIEW.pr(S2_T4.purc_schd_dt),
								value(MAC_BP_ADDR_TYP.TEL.value())
							).as("sppl_tel"),
							MAPA_BP$F_GET_BP_ADDR(
								S1_T4_VIEW.pr(S2_T9.sppl_cd),
								S1_T4_VIEW.pr(S2_T4.purc_schd_dt),
								value(MAC_BP_ADDR_TYP.FAX.value())
							).as("sppl_fax"),
							S1_T4_VIEW.pr(S2_T9.tterm_cd1),
							S1_T4_VIEW.pr(S2_T9.tterm_cd2),
							S1_T4_VIEW.pr(S2_T9.tterm_cd3),
							S1_T4_VIEW.pr(S2_T9.tterm_rmrks1),
							S1_T4_VIEW.pr(S2_T9.tterm_rmrks2),
							S1_T4_VIEW.pr(S2_T9.tterm_rmrks3),
							S1_T4_VIEW.pr(S2_T9.po_print_rmrks),
							S1_T4_VIEW.pr(S2_T7.po_print_d_rmrks),
							S1_T4_VIEW.pr(S2_T9.trd_rmrks),
							S1_T4_VIEW.pr(S2_T7.trd_d_rmrks),
							S1_T4_VIEW.pr(S2_T9.trd_cur_cd),
							bind("base_cur_cd").as("base_cur_cd"),
							S1_T4_VIEW.pr(S2_T9.xrate_inpt_flg),
							S1_T4_VIEW.pr(S2_T9.xrate),
							S1_T4_VIEW.pr(S2_T9.ptax_xrate_inpt_flg),
							S1_T4_VIEW.pr(S2_T9.ptax_xrate),
							S1_T4_VIEW.pr("s_sub_char1"),
							S1_T4_VIEW.pr("s_sub_char2"),
							S1_T4_VIEW.pr("s_sub_char3"),
							S1_T4_VIEW.pr(S2_T4.ins_usr_id),
							S1_T4_VIEW.pr(S2_T4.ins_usr_nm),
							S1_T4_VIEW.pr(S2_T4.ins_ts),
							S1_T4_VIEW.pr(S2_T4.ins_func_id),
							S1_T4_VIEW.pr("purc_schd_upd_cntr"),
							S1_T4_VIEW.pr(S2_T4.upd_usr_id),
							S1_T4_VIEW.pr(S2_T4.upd_usr_nm),
							S1_T4_VIEW.pr(S2_T4.upd_ts),
							S1_T4_VIEW.pr(S2_T4.upd_func_id),
							S1_T4_VIEW.pr(S2_T4.upd_srv_req_no),
							S1_T4_VIEW.pr("rcpt_iv_mng_no"),
							S1_T4_VIEW.pr("rcpt_iv_no"),
							S1_T4_VIEW.pr("rcpt_iv_upd_cntr"),
							S1_T4_VIEW.pr("rcpt_iv_d_no"),
							S1_T4_VIEW.pr(S2_T7.disp_seq),
							S1_T4_VIEW.pr(S2_T7.itm_cd),
							S1_T4_VIEW.pr(S2_T7.itm_sub1),
							S1_T4_VIEW.pr(S2_T7.itm_sub2),
							S1_T4_VIEW.pr(S2_T7.itm_sub3),
							S1_T4_VIEW.pr(S2_T7.itm_nm),
							S1_T4_VIEW.pr(S2_T7.iv_itm_nm),
							S1_T4_VIEW.pr(S2_T7.purc_rsn_cd),
							S1_T4_VIEW.pr(S2_T7.sundry_itm_flg),
							S1_T4_VIEW.pr(S2_T7.sppl_itm_cd),
							S1_T4_VIEW.pr(S2_T7.sppl_itm_nm),
							S1_T4_VIEW.pr("cst_itm_cd"),
							S1_T4_VIEW.pr("cst_itm_nm"),
							S1_T4_VIEW.pr(S2_T7.upri_not_tgt_flg),
							S1_T4_VIEW.pr(S2_T7.interim_flg),
							S1_T4_VIEW.pr("src_tax_cd"),
							S1_T4_VIEW.pr(S2_T7.tax_fix_flg),
							cases()
								.when(S1_T4_VIEW.pr(S2_T7.tax_fix_flg).eq(value(false)))
									.then(
										MAPA_TAX$F_GET_PURC_TAX_CD(
											S1_T4_VIEW.pr(S2_T7.itm_cd),
											S1_T4_VIEW.pr(S2_T7.itm_sub1),
											S1_T4_VIEW.pr(S2_T7.itm_sub2),
											S1_T4_VIEW.pr(S2_T7.itm_sub3),
											S1_T4_VIEW.pr(S2_T9.sppl_cd),
											bind("mc_today")
										)
								)
								.otherwise(nullValue()).as("tax_cd"),
							S1_T4_VIEW.pr("src_trd_unit_qty"),
							nvl(
								S1_T11.pack_unit_cd,
								S1_T4_VIEW.pr(S2_T4.trd_unit_cd)
							).as("trd_unit_cd"),
							S1_T4_VIEW.pr("src_trd_unit_cd"),
							S1_T4_VIEW.pr("src_base_unit_qty"),
							S1_T4_VIEW.pr("src_trd_cur_upri"),
							S1_T4_VIEW.pr("src_trd_cur_proc_upri"),
							S1_T4_VIEW.pr("src_trd_cur_onr_prov_upri"),
							S1_T4_VIEW.pr("src_trd_cur_amt"),
							S1_T4_VIEW.pr("src_trd_cur_proc_amt"),
							S1_T4_VIEW.pr("src_trd_cur_onr_prov_amt"),
							S1_T4_VIEW.pr("src_trd_cur_tax_amt"),
							S1_T4_VIEW.pr("src_trd_cur_dscnt_amt"),
							S1_T4_VIEW.pr("src_wtax_rate"),
							S1_T4_VIEW.pr("dlv_rqst_dt"),
							S1_T4_VIEW.pr("arr_schd_dt"),
							S1_T4_VIEW.pr(S2_T7.sno1),
							S1_T4_VIEW.pr(S2_T7.sno2),
							S1_T4_VIEW.pr(S2_T7.sno3),
							S1_T4_VIEW.pr(S2_T7.sno4),
							nvl(
								S1_T10.ver_no,
								S1_T4_VIEW.pr(S2_T5.ver_no)
							).as("ver_no"),
							nvl(
								S1_T11.lot_no,
								S1_T4_VIEW.pr(S2_T5.lot_no)
							).as("lot_no"),
							nvl(
								S1_T11.sublot_no,
								S1_T4_VIEW.pr(S2_T5.sublot_no)
							).as("sublot_no"),
							decode(
								S1_M16_stk_mng_typ,
								value(MAC_STK_MNG_TYP.NOT_MNG.value()),
								S1_T10.quality_typ,
								nvl(
									S1_T11.quality_typ,
									S1_T4_VIEW.pr(S2_T5.quality_typ)
								)
							).as("quality_typ"),
							decode(
								S1_M16_stk_mng_typ,
								value(MAC_STK_MNG_TYP.NOT_MNG.value()),
								S1_T10.stk_insp_typ,
								nvl(
									S1_T11.stk_insp_typ,
									S1_T4_VIEW.pr(S2_T5.stk_insp_typ)
								)
							).as("stk_insp_typ"),
							decode(
								S1_M16_stk_mng_typ,
								value(MAC_STK_MNG_TYP.NOT_MNG.value()),
								S1_T10.stk_id_typ,
								nvl(
									S1_T11.stk_id_typ,
									S1_T4_VIEW.pr(S2_T5.stk_id_typ)
								)
							).as("stk_id_typ"),
							nvl(
								S1_T11.stk_bp_cd,
								S1_T4_VIEW.pr(S2_T5.stk_bp_cd)
							).as("stk_bp_cd"),
							S1_T4_VIEW.pr(S2_T4.base_unit_cd),
							MAPA_CALC$F_CALC_PER(
								S1_T4_VIEW.pr(S2_T4.base_unit_schd_qty),
								S1_T4_VIEW.pr(S2_T4.base_unit_purc_qty)
							).as("purc_prgrs"),
							S1_T4_VIEW.pr(S2_T4.base_unit_schd_qty),
							nvl(
								S1_T11.base_unit_qty,
								S1_T10.base_unit_qty.subtract(
									nvl(
										S1_T12.pr("base_unit_qty"),
										value(0)
									)
								)
							).as("base_unit_qty"),
							S1_T4_VIEW.pr(S2_T4.base_unit_purc_qty),
							S1_T4_VIEW.pr(S2_T5.arr_qty).as("base_unit_arr_qty"),
							S1_T4_VIEW.pr("base_unit_purc_act_qty"),
							S1_T4_VIEW.pr(S2_T5.mfg_inst_no),
							coalesce(
								S1_T4_VIEW.pr("src_wtax_rate"),
								MAPA_TAX$F_GET_WTAX_RATE(
									S1_T4_VIEW.pr(S2_T7.itm_cd),
									S1_T4_VIEW.pr(S2_T7.itm_sub1),
									S1_T4_VIEW.pr(S2_T7.itm_sub2),
									S1_T4_VIEW.pr(S2_T7.itm_sub3),
									bind("mc_today")
								)
							).as("wtax_rate"),
							S1_T4_VIEW.pr(S2_T7.wtax_amt),
							S1_T4_VIEW.pr(S2_T7.purc_id_typ),
							S1_T4_VIEW.pr(S2_T7.ap_dpt_cd),
							S1_T4_VIEW.pr("mst_ap_dpt_cd"),
							nvl(
								S1_T10.maker_cd,
								S1_T4_VIEW.pr(S2_T5.maker_cd)
							).as("maker_cd"),
							nvl(
								S1_T10.bp_lot_no,
								S1_T4_VIEW.pr(S2_T5.bp_lot_no)
							).as("bp_lot_no"),
							nvl(
								S1_T11.loc_cd,
								S1_T10.arr_loc_cd
							).as("gi_loc_cd"),
							nvl(
								S1_T11.str_ln_cd,
								S1_T10.str_ln_cd
							).as("gi_str_ln_cd"),
							nvl(
								S1_T11.pack_unit_cd,
								S1_T10.pack_unit_cd
							).as("gi_unit_cd"),
							S1_T11.gd_cd.as("from_gd_cd"),
							nvl(
								S1_T11.loc_cd,
								S1_T10.arr_loc_cd
							).as("in_to_loc_cd"),
							nvl2(
								S1_T11.loc_cd,
								S1_M18_wg_cd,
								S1_M181_wg_cd
							).as("in_to_loc_wg_cd"),
							nvl(
								S1_T11.str_ln_cd,
								S1_T10.str_ln_cd
							).as("str_ln_cd"),
							decode(
								S1_M16_stk_mng_typ,
								value(MAC_STK_MNG_TYP.NOT_MNG.value()),
								S1_T10.gd_cd,
								nvl(
									S1_T11.gd_cd,
									nvl(
										S1_T10.gd_cd,
										S1_T4_VIEW.pr(S2_T5.gd_cd)
									)
								)
							).as("gd_cd"),
							S1_T4_VIEW.pr(S2_T7.bd_itm_cd),
							S1_T4_VIEW.pr(S2_T7.bd_itm_sub1),
							S1_T4_VIEW.pr(S2_T7.bd_itm_sub2),
							S1_T4_VIEW.pr(S2_T7.bd_itm_sub3),
							S1_T4_VIEW.pr(S2_T7.bd_sno1),
							S1_T4_VIEW.pr(S2_T7.bd_sno2),
							S1_T4_VIEW.pr(S2_T7.bd_sno3),
							S1_T4_VIEW.pr(S2_T7.bd_sno4),
							S1_T4_VIEW.pr(S2_T7.bd_loc_cd),
							S1_T4_VIEW.pr(S2_T7.bd_lot_no),
							S1_T4_VIEW.pr(S2_T7.bd_sublot_no),
							S1_T4_VIEW.pr(S2_T7.bd_dpt_cd),
							S1_T4_VIEW.pr(S2_T7.bd_wg_cd),
							S1_T4_VIEW.pr(S2_T7.bd_ctg_cd),
							S1_T4_VIEW.pr(S2_T7.bd_oper_cd),
							S1_T4_VIEW.pr(S2_T7.bd_slo_no),
							S1_T4_VIEW.pr(S2_T7.bd_iv_no),
							S1_T4_VIEW.pr(S2_T7.bd_po_no),
							S1_T4_VIEW.pr(S2_T7.bd_bp_cd),
							S1_T4_VIEW.pr(S2_T7.drct_dlv_typ),
							S1_T4_VIEW.pr(S2_T7.slo_d_no),
							S1_T4_VIEW.pr(S2_T7.slo_no),
							S1_T4_VIEW.pr("dlv_cd"),
							S1_T4_VIEW.pr("dlv_sundry_flg"),
							S1_T4_VIEW.pr("dlv_nm"),
							S1_T4_VIEW.pr("dlv_cntct_dpt"),
							S1_T4_VIEW.pr("dlv_cntct_psn"),
							S1_T4_VIEW.pr("dlv_zip_cd"),
							S1_T4_VIEW.pr("dlv_addr1"),
							S1_T4_VIEW.pr("dlv_addr2"),
							S1_T4_VIEW.pr("dlv_addr3"),
							S1_T4_VIEW.pr("dlv_addr4"),
							S1_T4_VIEW.pr("dlv_tel"),
							S1_T4_VIEW.pr("dlv_fax"),
							S1_T4_VIEW.pr("tdlv_cd"),
							S1_T4_VIEW.pr("tdlv_sundry_flg"),
							S1_T4_VIEW.pr("tdlv_nm"),
							S1_T4_VIEW.pr("tdlv_cntct_dpt"),
							S1_T4_VIEW.pr("tdlv_cntct_psn"),
							S1_T4_VIEW.pr("tdlv_zip_cd"),
							S1_T4_VIEW.pr("tdlv_addr1"),
							S1_T4_VIEW.pr("tdlv_addr2"),
							S1_T4_VIEW.pr("tdlv_addr3"),
							S1_T4_VIEW.pr("tdlv_addr4"),
							S1_T4_VIEW.pr("tdlv_tel"),
							S1_T4_VIEW.pr("tdlv_fax"),
							S1_T4_VIEW.pr(S2_T7.dscnt_rsn_cd),
							S1_T4_VIEW.pr(S2_T7.pay_crryovr_times),
							S1_T4_VIEW.pr(S2_T7.outsrc_flg),
							S1_T4_VIEW.pr(S2_T7.mfg_loc_cd),
							S1_T4_VIEW.pr(S2_T7.bom_ptn),
							S1_T4_VIEW.pr("arr_ptn_typ"),
							S1_T4_VIEW.pr("par_purc_act_d_no"),
							S1_T4_VIEW.pr(S2_T5.arr_split_flg),
							S1_T4_VIEW.pr(S2_T4.base_unit_accpt_dfct_qty),
							S1_T4_VIEW.pr(S2_T6.arr_pr_no),
							S1_T4_VIEW.pr("arr_pr_upd_cntr"),
							nvl2(
								S1_T10.arr_act_no,
								value(false),
								S1_T4_VIEW.pr(S2_T5.sync_flg)
							).as("sync_flg"),
							S1_T4_VIEW.pr(S2_T7.purc_basis_typ),
							S1_T10.bp_dlv_slip_no,
							S1_T10.bp_dlv_slip_d_no,
							S1_T10.ship_fr_valid_dt,
							S1_T10.purc_cont_qty,
							nullValue().as("arr_skip_flg"),
							nullValue().as("purc_ddlv_flg"),
							value(false).as("abort_flg"),
							S1_T4_VIEW.pr(S2_T7.po_schd_no),
							bind("mc_today").as("master_dt"),
							S1_T4_VIEW.pr("tmp_po_no")
						)
						.from(
							subQuery()
							.select(
								S2_T4.purc_schd_no,
								S2_T7.po_d_no,
								S2_T9.po_no,
								S2_T9.aprv_flg,
								S2_T9.aprv_no,
								S2_T9.aprv_sts_typ,
								S2_T5.arr_schd_no,
								S2_T9.trd_cd,
								S2_T9.trd_ptn_typ,
								S2_T9.edi_flg,
								S2_T4.purc_schd_dt,
								nullValue().as("pay_basis_dt"),
								nullValue().as("pay_schd_dt"),
								S2_T9.purc_dpt_cd,
								S2_T9.wg_cd.as("purc_dpt_wg_cd"),
								S2_T9.purc_usr_cd,
								S2_T9.sppl_cd,
								S2_T9.tterm_cd1,
								S2_T9.tterm_rmrks1,
								S2_T9.tterm_cd2,
								S2_T9.tterm_rmrks2,
								S2_T9.tterm_cd3,
								S2_T9.tterm_rmrks3,
								S2_T9.po_print_rmrks,
								S2_T7.po_print_d_rmrks,
								S2_T9.trd_rmrks,
								S2_T7.trd_d_rmrks,
								S2_T9.trd_cur_cd,
								S2_T9.xrate_inpt_flg,
								S2_T9.xrate,
								S2_T9.ptax_xrate_inpt_flg,
								S2_T9.ptax_xrate,
								S2_T4.sub_char1.as("s_sub_char1"),
								S2_T4.sub_char2.as("s_sub_char2"),
								S2_T4.sub_char3.as("s_sub_char3"),
								S2_T4.ins_usr_id,
								S2_T4.ins_usr_nm,
								S2_T4.ins_ts,
								S2_T4.ins_func_id,
								S2_T4.upd_cntr.as("purc_schd_upd_cntr"),
								S2_T4.upd_usr_id,
								S2_T4.upd_usr_nm,
								S2_T4.upd_ts,
								S2_T4.upd_func_id,
								S2_T4.upd_srv_req_no,
								nullValue().as("rcpt_iv_mng_no"),
								nullValue().as("rcpt_iv_no"),
								nullValue().as("rcpt_iv_d_no"),
								S2_T7.disp_seq,
								S2_T7.itm_cd,
								S2_T7.itm_nm,
								S2_T7.iv_itm_nm,
								S2_T7.itm_sub1,
								S2_T7.itm_sub2,
								S2_T7.itm_sub3,
								S2_T7.purc_rsn_cd,
								S2_T7.sundry_itm_flg,
								S2_T7.sppl_itm_cd,
								S2_T7.sppl_itm_nm,
								bracket(
										cases()
											.when(S2_T7.dlv_cd.isNotNull())
												.then(S2_T15.cst_itm_cd)
											.otherwise(nullValue())
									).as("cst_itm_cd"),
								bracket(
										cases()
											.when(S2_T7.dlv_cd.isNotNull())
												.then(S2_T15.cst_itm_nm)
											.otherwise(nullValue())
									).as("cst_itm_nm"),
								S2_T7.upri_not_tgt_flg,
								S2_T7.interim_flg,
								S2_T7.tax_cd.as("src_tax_cd"),
								S2_T7.tax_fix_flg,
								S2_T7.trd_unit_qty.as("src_trd_unit_qty"),
								S2_T4.trd_unit_cd,
								S2_T7.trd_unit_cd.as("src_trd_unit_cd"),
								S2_T7.base_unit_qty.as("src_base_unit_qty"),
								S2_T4.base_unit_cd,
								S2_T7.base_unit_cd.as("src_base_unit_cd"),
								S2_T7.trd_cur_upri.as("src_trd_cur_upri"),
								S2_T7.trd_cur_proc_upri.as("src_trd_cur_proc_upri"),
								S2_T7.trd_cur_onr_prov_upri.as("src_trd_cur_onr_prov_upri"),
								S2_T7.trd_cur_amt.as("src_trd_cur_amt"),
								S2_T7.trd_cur_proc_amt.as("src_trd_cur_proc_amt"),
								S2_T7.trd_cur_onr_prov_amt.as("src_trd_cur_onr_prov_amt"),
								S2_T7.trd_cur_tax_amt.as("src_trd_cur_tax_amt"),
								S2_T7.trd_cur_dscnt_amt.as("src_trd_cur_dscnt_amt"),
								S2_T7.wtax_rate.as("src_wtax_rate"),
								trunc(
									S2_T7.dlv_rqst_tm,
									MCDateFmt.DD
								).as("dlv_rqst_dt"),
								trunc(
									S2_T5.arr_schd_tm,
									MCDateFmt.DD
								).as("arr_schd_dt"),
								S2_T7.sno1,
								S2_T7.sno2,
								S2_T7.sno3,
								S2_T7.sno4,
								S2_T5.ver_no,
								S2_T5.lot_no,
								S2_T5.sublot_no,
								S2_T5.quality_typ,
								S2_T5.stk_insp_typ,
								S2_T5.stk_id_typ,
								S2_T5.stk_bp_cd,
								S2_T5.arr_qty,
								S2_T5.abort_qty,
								S2_T4.base_unit_purc_qty,
								S2_T4.base_unit_accpt_dfct_qty,
								S2_T4.base_unit_schd_qty,
								S2_T4.base_unit_purc_qty.add(S2_T4.base_unit_accpt_dfct_qty).as("base_unit_purc_act_qty"),
								S2_T5.mfg_inst_no,
								S2_T7.wtax_amt,
								S2_T7.purc_id_typ,
								S2_T7.ap_dpt_cd,
								MAPA_BP$F_GET_AP_DPT_CD_NE(
										S2_M5.asppl_cd,
										bind("mc_today"),
										value(false)
									).as("mst_ap_dpt_cd"),
								S2_T5.maker_cd,
								S2_T5.bp_lot_no,
								S2_T5.arr_loc_cd,
								S2_T5.str_ln_cd,
								S2_T5.gd_cd,
								nvl(
									S2_T5.arr_ptn_typ,
									value(MSC_ARR_PTN_TYP.NRML.value())
								).as("arr_ptn_typ"),
								S2_T5.purc_act_d_no.as("par_purc_act_d_no"),
								S2_T5.arr_split_flg,
								S2_T5.sync_flg,
								S2_T7.purc_basis_typ,
								S2_T5.arr_skip_flg,
								S2_T5.abort_flg,
								S2_T7.bd_itm_cd,
								S2_T7.bd_itm_sub1,
								S2_T7.bd_itm_sub2,
								S2_T7.bd_itm_sub3,
								S2_T7.bd_sno1,
								S2_T7.bd_sno2,
								S2_T7.bd_sno3,
								S2_T7.bd_sno4,
								S2_T7.bd_loc_cd,
								S2_T7.bd_lot_no,
								S2_T7.bd_sublot_no,
								S2_T7.bd_dpt_cd,
								S2_T7.bd_wg_cd,
								S2_T7.bd_ctg_cd,
								S2_T7.bd_oper_cd,
								S2_T7.bd_slo_no,
								S2_T7.bd_iv_no,
								S2_T7.bd_po_no,
								S2_T7.bd_bp_cd,
								S2_T7.drct_dlv_typ,
								nvl(
									S2_T11.dlv_cd,
									S2_T7.dlv_cd
								).as("dlv_cd"),
								nvl2(
									S2_T11.dlv_cd,
									S2_T11.dlv_nm,
									S2_T7.dlv_nm
								).as("dlv_nm"),
								nvl2(
									S2_T11.dlv_cd,
									S2_T11.dlv_cntct_dpt,
									S2_T7.dlv_cntct_dpt
								).as("dlv_cntct_dpt"),
								nvl2(
									S2_T11.dlv_cd,
									S2_T11.dlv_cntct_psn,
									S2_T7.dlv_cntct_psn
								).as("dlv_cntct_psn"),
								nvl2(
									S2_T11.dlv_cd,
									S2_T11.dlv_sundry_flg,
									S2_T7.dlv_sundry_flg
								).as("dlv_sundry_flg"),
								nvl2(
									S2_T11.dlv_cd,
									S2_T11.dlv_zip_cd,
									S2_T7.dlv_zip_cd
								).as("dlv_zip_cd"),
								nvl2(
									S2_T11.dlv_cd,
									S2_T11.dlv_addr1,
									S2_T7.dlv_addr1
								).as("dlv_addr1"),
								nvl2(
									S2_T11.dlv_cd,
									S2_T11.dlv_addr2,
									S2_T7.dlv_addr2
								).as("dlv_addr2"),
								nvl2(
									S2_T11.dlv_cd,
									S2_T11.dlv_addr3,
									S2_T7.dlv_addr3
								).as("dlv_addr3"),
								nvl2(
									S2_T11.dlv_cd,
									S2_T11.dlv_addr4,
									S2_T7.dlv_addr4
								).as("dlv_addr4"),
								nvl2(
									S2_T11.dlv_cd,
									S2_T11.dlv_tel,
									S2_T7.dlv_tel
								).as("dlv_tel"),
								nvl2(
									S2_T11.dlv_cd,
									S2_T11.dlv_fax,
									S2_T7.dlv_fax
								).as("dlv_fax"),
								nvl(
									S2_T11.tdlv_cd,
									S2_T7.tdlv_cd
								).as("tdlv_cd"),
								nvl2(
									S2_T11.tdlv_cd,
									S2_T11.tdlv_nm,
									S2_T7.tdlv_nm
								).as("tdlv_nm"),
								nvl2(
									S2_T11.tdlv_cd,
									S2_T11.tdlv_cntct_dpt,
									S2_T7.tdlv_cntct_dpt
								).as("tdlv_cntct_dpt"),
								nvl2(
									S2_T11.tdlv_cd,
									S2_T11.tdlv_cntct_psn,
									S2_T7.tdlv_cntct_psn
								).as("tdlv_cntct_psn"),
								nvl2(
									S2_T11.tdlv_cd,
									S2_T11.tdlv_sundry_flg,
									S2_T7.tdlv_sundry_flg
								).as("tdlv_sundry_flg"),
								nvl2(
									S2_T11.tdlv_cd,
									S2_T11.tdlv_zip_cd,
									S2_T7.tdlv_zip_cd
								).as("tdlv_zip_cd"),
								nvl2(
									S2_T11.tdlv_cd,
									S2_T11.tdlv_addr1,
									S2_T7.tdlv_addr1
								).as("tdlv_addr1"),
								nvl2(
									S2_T11.tdlv_cd,
									S2_T11.tdlv_addr2,
									S2_T7.tdlv_addr2
								).as("tdlv_addr2"),
								nvl2(
									S2_T11.tdlv_cd,
									S2_T11.tdlv_addr3,
									S2_T7.tdlv_addr3
								).as("tdlv_addr3"),
								nvl2(
									S2_T11.tdlv_cd,
									S2_T11.tdlv_addr4,
									S2_T7.tdlv_addr4
								).as("tdlv_addr4"),
								nvl2(
									S2_T11.tdlv_cd,
									S2_T11.tdlv_tel,
									S2_T7.tdlv_tel
								).as("tdlv_tel"),
								nvl2(
									S2_T11.tdlv_cd,
									S2_T11.tdlv_fax,
									S2_T7.tdlv_fax
								).as("tdlv_fax"),
								S2_T7.dscnt_rsn_cd,
								S2_T7.pay_crryovr_times,
								S2_T7.outsrc_flg,
								S2_T7.mfg_loc_cd,
								S2_T7.bom_ptn,
								S2_T6.purc_ddlv_flg,
								S2_T7.po_schd_no,
								S2_T7.slo_d_no,
								S2_T7.slo_no,
								S2_T6.arr_pr_no,
								S2_T6.upd_cntr.as("arr_pr_upd_cntr"),
								nullValue().as("rcpt_iv_upd_cntr"),
								S2_T9.po_no.as("tmp_po_no")
							)
							.from(
								S2_T4
								.innerJoin(S2_T5).on(S2_T4.arr_schd_no.eq(S2_T5.arr_schd_no))
								.innerJoin(S2_T6).on(S2_T4.arr_pr_no.eq(S2_T6.arr_pr_no))
								.innerJoin(S2_T7).on(S2_T6.po_d_no.eq(S2_T7.po_d_no))
								.innerJoin(S2_T9).on(S2_T7.po_no.eq(S2_T9.po_no))
								.innerJoin(S2_M0).on(S2_T9.purc_dpt_cd.eq(S2_M0.dpt_cd))
								.innerJoin(S2_M5).on(S2_T9.sppl_cd.eq(S2_M5.bp_cd))
								.leftOuterJoin(S2_T10).on(S2_T10.prms_rcpt_d_no.eq(S2_T5.prms_rcpt_d_no))
								.leftOuterJoin(S2_T11).on(
									S2_T11.dlv_inst_d_no.eq(nvl(
											S2_T5.dlv_inst_d_no,
											S2_T10.dlv_inst_d_no
										)
									)
								)
								.leftOuterJoin(S2_T15).on
									(bracket(
											S2_T15.slo_d_no.eq(S2_T7.slo_d_no)
										)
								)
							)
							.where(
								value(0).eq(value(0))
								.and(
									bracket(
										S2_T9.aprv_flg.eq(value(false))
									)
									.or(
										S2_T9.aprv_flg.eq(value(true))
										.and(bind("incl_not_aprv_flg").eq(value(false)))
										.and(S2_T9.aprv_sts_typ.eq(value(MAC_APRV_STS_TYP.ACPT.value())))
									)
									.or(
										S2_T9.aprv_flg.eq(value(true))
										.and(bind("incl_not_aprv_flg").eq(value(true)))
									)
								)
								.and(S2_T4.cmpl_flg.eq(value(false)))
								.and(S2_T7.purc_id_typ.neq(value(MAC_PURC_ID_TYP.VMI.value())))
								.and(S2_M5.sppl_iv_flg.eq(value(false)))
								.cutoff$and(
									MAPA_CALC$F_CALC_PER(
										S2_T5.base_unit_qty,
										S2_T5.purc_qty
									).gte(bind("purc_prgrs_fr"))
								)
								.cutoff$and(
									MAPA_CALC$F_CALC_PER(
										S2_T5.base_unit_qty,
										S2_T5.purc_qty
									).lte(bind("purc_prgrs_to"))
								)
								.cutoff$and(S2_T4.purc_schd_no.like(bind("purc_schd_no")))
								.cutoff$and(S2_T5.arr_ptn_typ.eq(bind("_arr_ptn_typ")))
								.cutoff$and(S2_T5.cmpl_flg.eq(bind("_arr_cmpl_flg")))
								.cutoff$and(S2_T9.edi_flg.eq(bind("_edi_flg")))
								.cutoff$and(nullValue().like(bind("rcpt_iv_mng_no")))
								.cutoff$and(nullValue().like(bind("rcpt_iv_no")))
								.cutoff$and(nullValue().like(bind("rcpt_iv_d_no")))
								.cutoff$and(S2_T4.purc_schd_dt.gte(bind("purc_schd_dt_fr")))
								.cutoff$and(S2_T4.purc_schd_dt.lte(bind("purc_schd_dt_to")))
								.cutoff$and(S2_T9.sppl_cd.like(bind("sppl_cd")))
								.cutoff$and(S2_T7.itm_cd.like(bind("itm_cd")))
								.cutoff$and(S2_T7.itm_sub1.like(bind("itm_sub1")))
								.cutoff$and(S2_T7.itm_sub2.like(bind("itm_sub2")))
								.cutoff$and(S2_T7.itm_sub3.like(bind("itm_sub3")))
								.cutoff$and(S2_T7.sppl_itm_cd.like(bind("sppl_itm_cd")))
								.cutoff$and(S2_T7.sppl_itm_nm.like(bind("sppl_itm_nm")))
								.cutoff$and(S2_T7.sno1.like(bind("sno1")))
								.cutoff$and(S2_T7.sno2.like(bind("sno2")))
								.cutoff$and(S2_T7.sno3.like(bind("sno3")))
								.cutoff$and(S2_T7.sno4.like(bind("sno4")))
								.cutoff$and(S2_T9.purc_usr_cd.like(bind("purc_usr_cd")))
								.cutoff$and(S2_T9.purc_dpt_cd.like(bind("purc_dpt_cd")))
								.cutoff$and(S2_T9.wg_cd.like(bind("purc_dpt_wg_cd")))
								.cutoff$and(S2_T7.ap_dpt_cd.like(bind("ap_dpt_cd")))
								.cutoff$and(S2_T7.po_schd_no.like(bind("po_schd_no")))
								.cutoff$and(S2_T7.po_no.like(bind("po_no")))
								.cutoff$and(S2_T7.po_d_no.like(bind("po_d_no")))
								.cutoff$and(S2_T4.purc_schd_no.like(bind("purc_schd_no")))
								.cutoff$and(S2_T9.trd_cd.like(bind("trd_cd")))
								.cutoff$and(S2_T7.purc_id_typ.like(bind("purc_id_typ")))
								.cutoff$and(S2_T7.drct_dlv_typ.like(bind("drct_dlv_typ")))
								.cutoff$and(S2_T4.sub_char1.like(bind("s_sub_char1")))
								.cutoff$and(S2_T4.sub_char2.like(bind("s_sub_char2")))
								.cutoff$and(S2_T4.sub_char3.like(bind("s_sub_char3")))
							)
							.view(S1_T4_VIEW)
							.innerJoin(S1_T10).on(S1_T4_VIEW.pr(S2_T5.arr_schd_no).eq(S1_T10.arr_schd_no))
							.leftOuterJoin(S1_T11).on(
								S1_T10.arr_act_no.eq(S1_T11.fix_no)
								.and(S1_T11.in_xfr_typ.eq(value(MSC_IN_XFR_TYP.IN_LOC.value())))
								.and(S1_T11.asst_typ.eq(value(MAC_ASST_TYP.OTH.value())))
								.and(S1_T11.stk_id_typ.neq(value(MSC_STK_ID_TYP.ACCPT_DFCT.value())))
								.and(S1_T11.fix_no_typ.eq(value(MSC_FIX_NO_TYP.ARR_ACT_NO.value())))
							)
							.innerJoin(
								subQuery()
								.select(
									S4_T4.arr_act_no,
									sum(
										nvl(
											S4_V1.pr("base_unit_qty"),
											value(0)
										)
									).as("base_unit_qty")
								)
								.from(
									S4_T4
									.leftOuterJoin(
										subQuery()
										.select(
											S5_T1.arr_act_no,
											S5_T1.base_unit_qty.as("base_unit_qty")
										)
										.from(
											S5_T1
											.innerJoin(S5_T2).on(
												S5_T1.purc_act_d_no.eq(S5_T2.purc_act_d_no)
												.and(S5_T1.purc_act_d_seq.eq(S5_T2.purc_act_d_seq))
											)
											.innerJoin(S5_T3).on(
												S5_T2.purc_act_no.eq(S5_T3.purc_act_no)
												.and(S5_T2.purc_act_seq.eq(S5_T3.purc_act_seq))
											)
										)
										.where(
											S5_T3.slip_sts_typ.eq(value(MAC_SLIP_STS_TYP.CRT.value()))
										).view(S4_V1)
									).on(S4_T4.arr_act_no.eq(S4_V1.pr(S5_T1.arr_act_no)))
									.innerJoin(
										subQuery()
										.select(
											S6_T4.purc_schd_no,
											S6_T7.po_d_no,
											S6_T9.po_no,
											S6_T9.aprv_flg,
											S6_T9.aprv_no,
											S6_T9.aprv_sts_typ,
											S6_T5.arr_schd_no,
											S6_T9.trd_cd,
											S6_T9.trd_ptn_typ,
											S6_T9.edi_flg,
											S6_T4.purc_schd_dt,
											nullValue().as("pay_basis_dt"),
											nullValue().as("pay_schd_dt"),
											S6_T9.purc_dpt_cd,
											S6_T9.wg_cd.as("purc_dpt_wg_cd"),
											S6_T9.purc_usr_cd,
											S6_T9.sppl_cd,
											S6_T9.tterm_cd1,
											S6_T9.tterm_rmrks1,
											S6_T9.tterm_cd2,
											S6_T9.tterm_rmrks2,
											S6_T9.tterm_cd3,
											S6_T9.tterm_rmrks3,
											S6_T9.po_print_rmrks,
											S6_T7.po_print_d_rmrks,
											S6_T9.trd_rmrks,
											S6_T7.trd_d_rmrks,
											S6_T9.trd_cur_cd,
											S6_T9.xrate_inpt_flg,
											S6_T9.xrate,
											S6_T9.ptax_xrate_inpt_flg,
											S6_T9.ptax_xrate,
											S6_T4.sub_char1.as("s_sub_char1"),
											S6_T4.sub_char2.as("s_sub_char2"),
											S6_T4.sub_char3.as("s_sub_char3"),
											S6_T4.ins_usr_id,
											S6_T4.ins_usr_nm,
											S6_T4.ins_ts,
											S6_T4.ins_func_id,
											S6_T4.upd_cntr.as("purc_schd_upd_cntr"),
											S6_T4.upd_usr_id,
											S6_T4.upd_usr_nm,
											S6_T4.upd_ts,
											S6_T4.upd_func_id,
											S6_T4.upd_srv_req_no,
											nullValue().as("rcpt_iv_mng_no"),
											nullValue().as("rcpt_iv_no"),
											nullValue().as("rcpt_iv_d_no"),
											S6_T7.disp_seq,
											S6_T7.itm_cd,
											S6_T7.itm_nm,
											S6_T7.iv_itm_nm,
											S6_T7.itm_sub1,
											S6_T7.itm_sub2,
											S6_T7.itm_sub3,
											S6_T7.purc_rsn_cd,
											S6_T7.sundry_itm_flg,
											S6_T7.sppl_itm_cd,
											S6_T7.sppl_itm_nm,
					
											bracket(
													cases()
														.when(S6_T7.dlv_cd.isNotNull())
															.then(S6_T15.cst_itm_cd)
														.otherwise(nullValue())
												).as("cst_itm_cd"),
											bracket(
													cases()
														.when(S6_T7.dlv_cd.isNotNull())
															.then(S6_T15.cst_itm_nm)
														.otherwise(nullValue())
												).as("cst_itm_nm"),
											S6_T7.upri_not_tgt_flg,
											S6_T7.interim_flg,
											S6_T7.tax_cd.as("src_tax_cd"),
											S6_T7.tax_fix_flg,
											S6_T7.trd_unit_qty.as("src_trd_unit_qty"),
											S6_T4.trd_unit_cd,
											S6_T7.trd_unit_cd.as("src_trd_unit_cd"),
											S6_T7.base_unit_qty.as("src_base_unit_qty"),
											S6_T4.base_unit_cd,
											S6_T7.base_unit_cd.as("src_base_unit_cd"),
											S6_T7.trd_cur_upri.as("src_trd_cur_upri"),
											S6_T7.trd_cur_proc_upri.as("src_trd_cur_proc_upri"),
											S6_T7.trd_cur_onr_prov_upri.as("src_trd_cur_onr_prov_upri"),
											S6_T7.trd_cur_amt.as("src_trd_cur_amt"),
											S6_T7.trd_cur_proc_amt.as("src_trd_cur_proc_amt"),
											S6_T7.trd_cur_onr_prov_amt.as("src_trd_cur_onr_prov_amt"),
											S6_T7.trd_cur_tax_amt.as("src_trd_cur_tax_amt"),
											S6_T7.trd_cur_dscnt_amt.as("src_trd_cur_dscnt_amt"),
											S6_T7.wtax_rate.as("src_wtax_rate"),
											trunc(
												S6_T7.dlv_rqst_tm,
												MCDateFmt.DD
											).as("dlv_rqst_dt"),
											trunc(
												S6_T5.arr_schd_tm,
												MCDateFmt.DD
											).as("arr_schd_dt"),
											S6_T7.sno1,
											S6_T7.sno2,
											S6_T7.sno3,
											S6_T7.sno4,
											S6_T5.ver_no,
											S6_T5.lot_no,
											S6_T5.sublot_no,
											S6_T5.quality_typ,
											S6_T5.stk_insp_typ,
											S6_T5.stk_id_typ,
											S6_T5.stk_bp_cd,
											S6_T5.arr_qty,
											S6_T5.abort_qty,
											S6_T4.base_unit_purc_qty,
											S6_T4.base_unit_accpt_dfct_qty,
											S6_T4.base_unit_schd_qty,
											S6_T4.base_unit_purc_qty.add(S6_T4.base_unit_accpt_dfct_qty).as("base_unit_purc_act_qty"),
											S6_T5.mfg_inst_no,
											S6_T7.wtax_amt,
											S6_T7.purc_id_typ,
											S6_T7.ap_dpt_cd,
											MAPA_BP$F_GET_AP_DPT_CD_NE(
													S6_M5.asppl_cd,
													bind("mc_today"),
													value(false)
												).as("mst_ap_dpt_cd"),
											S6_T5.maker_cd,
											S6_T5.bp_lot_no,
											S6_T5.arr_loc_cd,
											S6_T5.str_ln_cd,
											S6_T5.gd_cd,
											nvl(
												S6_T5.arr_ptn_typ,
												value(MSC_ARR_PTN_TYP.NRML.value())
											).as("arr_ptn_typ"),
											S6_T5.purc_act_d_no.as("par_purc_act_d_no"),
											S6_T5.arr_split_flg,
											S6_T5.sync_flg,
											S6_T7.purc_basis_typ,
											S6_T5.arr_skip_flg,
											S6_T5.abort_flg,
											S6_T7.bd_itm_cd,
											S6_T7.bd_itm_sub1,
											S6_T7.bd_itm_sub2,
											S6_T7.bd_itm_sub3,
											S6_T7.bd_sno1,
											S6_T7.bd_sno2,
											S6_T7.bd_sno3,
											S6_T7.bd_sno4,
											S6_T7.bd_loc_cd,
											S6_T7.bd_lot_no,
											S6_T7.bd_sublot_no,
											S6_T7.bd_dpt_cd,
											S6_T7.bd_wg_cd,
											S6_T7.bd_ctg_cd,
											S6_T7.bd_oper_cd,
											S6_T7.bd_slo_no,
											S6_T7.bd_iv_no,
											S6_T7.bd_po_no,
											S6_T7.bd_bp_cd,
											S6_T7.drct_dlv_typ,
											nvl(
												S6_T11.dlv_cd,
												S6_T7.dlv_cd
											).as("dlv_cd"),
											nvl2(
												S6_T11.dlv_cd,
												S6_T11.dlv_nm,
												S6_T7.dlv_nm
											).as("dlv_nm"),
											nvl2(
												S6_T11.dlv_cd,
												S6_T11.dlv_cntct_dpt,
												S6_T7.dlv_cntct_dpt
											).as("dlv_cntct_dpt"),
											nvl2(
												S6_T11.dlv_cd,
												S6_T11.dlv_cntct_psn,
												S6_T7.dlv_cntct_psn
											).as("dlv_cntct_psn"),
											nvl2(
												S6_T11.dlv_cd,
												S6_T11.dlv_sundry_flg,
												S6_T7.dlv_sundry_flg
											).as("dlv_sundry_flg"),
											nvl2(
												S6_T11.dlv_cd,
												S6_T11.dlv_zip_cd,
												S6_T7.dlv_zip_cd
											).as("dlv_zip_cd"),
											nvl2(
												S6_T11.dlv_cd,
												S6_T11.dlv_addr1,
												S6_T7.dlv_addr1
											).as("dlv_addr1"),
											nvl2(
												S6_T11.dlv_cd,
												S6_T11.dlv_addr2,
												S6_T7.dlv_addr2
											).as("dlv_addr2"),
											nvl2(
												S6_T11.dlv_cd,
												S6_T11.dlv_addr3,
												S6_T7.dlv_addr3
											).as("dlv_addr3"),
											nvl2(
												S6_T11.dlv_cd,
												S6_T11.dlv_addr4,
												S6_T7.dlv_addr4
											).as("dlv_addr4"),
											nvl2(
												S6_T11.dlv_cd,
												S6_T11.dlv_tel,
												S6_T7.dlv_tel
											).as("dlv_tel"),
											nvl2(
												S6_T11.dlv_cd,
												S6_T11.dlv_fax,
												S6_T7.dlv_fax
											).as("dlv_fax"),
											nvl(
												S6_T11.tdlv_cd,
												S6_T7.tdlv_cd
											).as("tdlv_cd"),
											nvl2(
												S6_T11.tdlv_cd,
												S6_T11.tdlv_nm,
												S6_T7.tdlv_nm
											).as("tdlv_nm"),
											nvl2(
												S6_T11.tdlv_cd,
												S6_T11.tdlv_cntct_dpt,
												S6_T7.tdlv_cntct_dpt
											).as("tdlv_cntct_dpt"),
											nvl2(
												S6_T11.tdlv_cd,
												S6_T11.tdlv_cntct_psn,
												S6_T7.tdlv_cntct_psn
											).as("tdlv_cntct_psn"),
											nvl2(
												S6_T11.tdlv_cd,
												S6_T11.tdlv_sundry_flg,
												S6_T7.tdlv_sundry_flg
											).as("tdlv_sundry_flg"),
											nvl2(
												S6_T11.tdlv_cd,
												S6_T11.tdlv_zip_cd,
												S6_T7.tdlv_zip_cd
											).as("tdlv_zip_cd"),
											nvl2(
												S6_T11.tdlv_cd,
												S6_T11.tdlv_addr1,
												S6_T7.tdlv_addr1
											).as("tdlv_addr1"),
											nvl2(
												S6_T11.tdlv_cd,
												S6_T11.tdlv_addr2,
												S6_T7.tdlv_addr2
											).as("tdlv_addr2"),
											nvl2(
												S6_T11.tdlv_cd,
												S6_T11.tdlv_addr3,
												S6_T7.tdlv_addr3
											).as("tdlv_addr3"),
											nvl2(
												S6_T11.tdlv_cd,
												S6_T11.tdlv_addr4,
												S6_T7.tdlv_addr4
											).as("tdlv_addr4"),
											nvl2(
												S6_T11.tdlv_cd,
												S6_T11.tdlv_tel,
												S6_T7.tdlv_tel
											).as("tdlv_tel"),
											nvl2(
												S6_T11.tdlv_cd,
												S6_T11.tdlv_fax,
												S6_T7.tdlv_fax
											).as("tdlv_fax"),
											S6_T7.dscnt_rsn_cd,
											S6_T7.pay_crryovr_times,
											S6_T7.outsrc_flg,
											S6_T7.mfg_loc_cd,
											S6_T7.bom_ptn,
											S6_T6.purc_ddlv_flg,
											S6_T7.po_schd_no,
											S6_T7.slo_d_no,
											S6_T7.slo_no,
											S6_T6.arr_pr_no,
											S6_T6.upd_cntr.as("arr_pr_upd_cntr"),
											nullValue().as("rcpt_iv_upd_cntr"),
											S6_T9.po_no.as("tmp_po_no")
										)
										.from(
											S6_T4
											.innerJoin(S6_T5).on(S6_T4.arr_schd_no.eq(S6_T5.arr_schd_no))
											.innerJoin(S6_T6).on(S6_T4.arr_pr_no.eq(S6_T6.arr_pr_no))
											.innerJoin(S6_T7).on(S6_T6.po_d_no.eq(S6_T7.po_d_no))
											.innerJoin(S6_T9).on(S6_T7.po_no.eq(S6_T9.po_no))
											.innerJoin(S6_M0).on(S6_T9.purc_dpt_cd.eq(S6_M0.dpt_cd))
											.innerJoin(S6_M5).on(S6_T9.sppl_cd.eq(S6_M5.bp_cd))
											.leftOuterJoin(S6_T10).on(S6_T10.prms_rcpt_d_no.eq(S6_T5.prms_rcpt_d_no))
											.leftOuterJoin(S6_T11).on(
												S6_T11.dlv_inst_d_no.eq(nvl(
														S6_T5.dlv_inst_d_no,
														S6_T10.dlv_inst_d_no
													)
												)
											)
											.leftOuterJoin(S6_T15).on
											(bracket(
													S6_T15.slo_d_no.eq(S6_T7.slo_d_no)
												)
											)
										)
										.where(
											value(0).eq(value(0))
											.and(
												bracket(
													S6_T9.aprv_flg.eq(value(false))
												)
												.or(
													S6_T9.aprv_flg.eq(value(true))
													.and(bind("incl_not_aprv_flg").eq(value(false)))
													.and(S6_T9.aprv_sts_typ.eq(value(MAC_APRV_STS_TYP.ACPT.value())))
												)
												.or(
													S6_T9.aprv_flg.eq(value(true))
													.and(bind("incl_not_aprv_flg").eq(value(true)))
												)
											)
											.and(S6_T4.cmpl_flg.eq(value(false)))
											.and(S6_T7.purc_id_typ.neq(value(MAC_PURC_ID_TYP.VMI.value())))
											.and(S6_M5.sppl_iv_flg.eq(value(false)))
											.cutoff$and(
												MAPA_CALC$F_CALC_PER(
													S6_T5.base_unit_qty,
													S6_T5.purc_qty
												).gte(bind("purc_prgrs_fr"))
											)
											.cutoff$and(
												MAPA_CALC$F_CALC_PER(
													S6_T5.base_unit_qty,
													S6_T5.purc_qty
												).lte(bind("purc_prgrs_to"))
											)
											.cutoff$and(S6_T4.purc_schd_no.like(bind("purc_schd_no")))
											.cutoff$and(S6_T5.arr_ptn_typ.eq(bind("_arr_ptn_typ")))
											.cutoff$and(S6_T5.cmpl_flg.eq(bind("_arr_cmpl_flg")))
											.cutoff$and(S6_T9.edi_flg.eq(bind("_edi_flg")))
											.cutoff$and(nullValue().like(bind("rcpt_iv_mng_no")))
											.cutoff$and(nullValue().like(bind("rcpt_iv_no")))
											.cutoff$and(nullValue().like(bind("rcpt_iv_d_no")))
											.cutoff$and(S6_T4.purc_schd_dt.gte(bind("purc_schd_dt_fr")))
											.cutoff$and(S6_T4.purc_schd_dt.lte(bind("purc_schd_dt_to")))
											.cutoff$and(S6_T9.sppl_cd.like(bind("sppl_cd")))
											.cutoff$and(S6_T7.itm_cd.like(bind("itm_cd")))
											.cutoff$and(S6_T7.itm_sub1.like(bind("itm_sub1")))
											.cutoff$and(S6_T7.itm_sub2.like(bind("itm_sub2")))
											.cutoff$and(S6_T7.itm_sub3.like(bind("itm_sub3")))
											.cutoff$and(S6_T7.sppl_itm_cd.like(bind("sppl_itm_cd")))
											.cutoff$and(S6_T7.sppl_itm_nm.like(bind("sppl_itm_nm")))
											.cutoff$and(S6_T7.sno1.like(bind("sno1")))
											.cutoff$and(S6_T7.sno2.like(bind("sno2")))
											.cutoff$and(S6_T7.sno3.like(bind("sno3")))
											.cutoff$and(S6_T7.sno4.like(bind("sno4")))
											.cutoff$and(S6_T9.purc_usr_cd.like(bind("purc_usr_cd")))
											.cutoff$and(S6_T9.purc_dpt_cd.like(bind("purc_dpt_cd")))
											.cutoff$and(S6_T9.wg_cd.like(bind("purc_dpt_wg_cd")))
											.cutoff$and(S6_T7.ap_dpt_cd.like(bind("ap_dpt_cd")))
											.cutoff$and(S6_T7.po_schd_no.like(bind("po_schd_no")))
											.cutoff$and(S6_T7.po_no.like(bind("po_no")))
											.cutoff$and(S6_T7.po_d_no.like(bind("po_d_no")))
											.cutoff$and(S6_T4.purc_schd_no.like(bind("purc_schd_no")))
											.cutoff$and(S6_T9.trd_cd.like(bind("trd_cd")))
											.cutoff$and(S6_T7.purc_id_typ.like(bind("purc_id_typ")))
											.cutoff$and(S6_T7.drct_dlv_typ.like(bind("drct_dlv_typ")))
											.cutoff$and(S6_T4.sub_char1.like(bind("s_sub_char1")))
											.cutoff$and(S6_T4.sub_char2.like(bind("s_sub_char2")))
											.cutoff$and(S6_T4.sub_char3.like(bind("s_sub_char3")))
										)
										.view(S4_T4_VIEW)
									).on(S4_T4.arr_schd_no.eq(S4_T4_VIEW.pr(S6_T5.arr_schd_no)))
								)
								.where(
									bracket(
										S4_T4.can_flg.eq(value(false))
									)
								)
								.groupBy(S4_T4.arr_act_no).view(S1_T12)
							).on(S1_T10.arr_act_no.eq(S1_T12.pr(S4_T4.arr_act_no)))
						)
						.where(
							value(0).eq(value(0))
							.and(S1_T10.can_flg.eq(value(false)))
							.and(S1_T10.sync_flg.eq(value(false)))
							.and(
								nvl(
									S1_T11.base_unit_qty,
									S1_T4_VIEW.pr(S2_T5.arr_qty).subtract(S1_T4_VIEW.pr(S2_T4.base_unit_purc_qty)).subtract(S1_T4_VIEW.pr(S2_T4.base_unit_accpt_dfct_qty))
								).gt(value(0))
							)
							.and(
								S1_T10.base_unit_qty.subtract(nvl(
										S1_T12.pr("base_unit_qty"),
										value(0)
									)).gt(value(0))
							)
							.cutoff$and(
								nvl(
									S1_T11.lot_no,
									S1_T4_VIEW.pr(S2_T5.lot_no)
								).like(bind("lot_no"))
							)
							.cutoff$and(
								nvl(
									S1_T11.sublot_no,
									S1_T4_VIEW.pr(S2_T5.sublot_no)
								).like(bind("sublot_no"))
							)
							.cutoff$and(
								nvl(
									S1_T10.bp_lot_no,
									S1_T4_VIEW.pr(S2_T5.bp_lot_no)
								).like(bind("bp_lot_no"))
							)
							.cutoff$and(
								nvl(
									S1_T10.ver_no,
									S1_T4_VIEW.pr(S2_T5.ver_no)
								).like(bind("ver_no"))
							)
							.cutoff$and(
								nvl(
									S1_T10.maker_cd,
									S1_T4_VIEW.pr(S2_T5.maker_cd)
								).like(bind("maker_cd"))
							)
							.cutoff$and(
								nvl(
									S1_T11.loc_cd,
									S1_T4_VIEW.pr(S2_T5.arr_loc_cd)
								).like(bind("in_to_loc_cd"))
							)
							.cutoff$and(
								nvl(
									S1_T11.str_ln_cd,
									S1_T4_VIEW.pr(S2_T5.str_ln_cd)
								).like(bind("str_ln_cd"))
							)
							.cutoff$and(
								value(true).eq(bind("_arr_done_not_insp_fin_flg"))
								.and(
									S1_T11.stk_insp_typ.eq(value(MSC_STK_INSP_TYP.FIN.value()))
									.or(S1_T11.stk_insp_typ.isNull())
								)
							)
							.cutoff$and(
								value(true).eq(bind("_dfct_insp_flg"))
								.and(S1_T11.quality_typ.eq(value(MAC_QUALITY_TYP.DFCT_INSP.value())))
							)
						)
						.unionAll(
							subQuery()
							.select(
								S8_T4_VIEW.pr(S9_T4.purc_schd_no),
								S8_T4_VIEW.pr(S9_T7.po_d_no),
								S8_T4_VIEW.pr(S9_T9.po_no),
								S8_T4_VIEW.pr(S9_T9.aprv_no),
								S8_T4_VIEW.pr(S9_T9.aprv_sts_typ),
								S8_T4_VIEW.pr(S9_T5.arr_schd_no),
								nullValue().as("arr_act_no"),
								S8_T4_VIEW.pr(S9_T9.trd_cd),
								S8_T4_VIEW.pr(S9_T9.trd_ptn_typ),
								S8_T4_VIEW.pr(S9_T9.edi_flg),
								S8_T4_VIEW.pr(S9_T4.purc_schd_dt),
								S8_T4_VIEW.pr("pay_basis_dt"),
								S8_T4_VIEW.pr("pay_schd_dt"),
								nullValue().as("edi_bp_dlv_slip_d_no"),
								nullValue().as("edi_bp_dlv_slip_no"),
								S8_T4_VIEW.pr(S9_T9.purc_dpt_cd),
								S8_T4_VIEW.pr("purc_dpt_wg_cd"),
								S8_T4_VIEW.pr(S9_T9.purc_usr_cd),
								S8_T4_VIEW.pr(S9_T9.sppl_cd),
								MAPA_BP$F_GET_BP_ADDR(
									S8_T4_VIEW.pr(S9_T9.sppl_cd),
									S8_T4_VIEW.pr(S9_T4.purc_schd_dt),
									value(MAC_BP_ADDR_TYP.SPPL_CNTCT_DPT.value())
								).as("sppl_cntct_dpt"),
								MAPA_BP$F_GET_BP_ADDR(
									S8_T4_VIEW.pr(S9_T9.sppl_cd),
									S8_T4_VIEW.pr(S9_T4.purc_schd_dt),
									value(MAC_BP_ADDR_TYP.SPPL_CNTCT_PSN.value())
								).as("sppl_cntct_psn"),
								MAPA_BP$F_GET_BP_ADDR(
									S8_T4_VIEW.pr(S9_T9.sppl_cd),
									S8_T4_VIEW.pr(S9_T4.purc_schd_dt),
									value(MAC_BP_ADDR_TYP.TEL.value())
								).as("sppl_tel"),
								MAPA_BP$F_GET_BP_ADDR(
									S8_T4_VIEW.pr(S9_T9.sppl_cd),
									S8_T4_VIEW.pr(S9_T4.purc_schd_dt),
									value(MAC_BP_ADDR_TYP.FAX.value())
								).as("sppl_fax"),
								S8_T4_VIEW.pr(S9_T9.tterm_cd1),
								S8_T4_VIEW.pr(S9_T9.tterm_cd2),
								S8_T4_VIEW.pr(S9_T9.tterm_cd3),
								S8_T4_VIEW.pr(S9_T9.tterm_rmrks1),
								S8_T4_VIEW.pr(S9_T9.tterm_rmrks2),
								S8_T4_VIEW.pr(S9_T9.tterm_rmrks3),
								S8_T4_VIEW.pr(S9_T9.po_print_rmrks),
								S8_T4_VIEW.pr(S9_T7.po_print_d_rmrks),
								S8_T4_VIEW.pr(S9_T9.trd_rmrks),
								S8_T4_VIEW.pr(S9_T7.trd_d_rmrks),
								S8_T4_VIEW.pr(S9_T9.trd_cur_cd),
								bind("base_cur_cd").as("base_cur_cd"),
								S8_T4_VIEW.pr(S9_T9.xrate_inpt_flg),
								S8_T4_VIEW.pr(S9_T9.xrate),
								S8_T4_VIEW.pr(S9_T9.ptax_xrate_inpt_flg),
								S8_T4_VIEW.pr(S9_T9.ptax_xrate),
								S8_T4_VIEW.pr("s_sub_char1"),
								S8_T4_VIEW.pr("s_sub_char2"),
								S8_T4_VIEW.pr("s_sub_char3"),
								S8_T4_VIEW.pr(S9_T4.ins_usr_id),
								S8_T4_VIEW.pr(S9_T4.ins_usr_nm),
								S8_T4_VIEW.pr(S9_T4.ins_ts),
								S8_T4_VIEW.pr(S9_T4.ins_func_id),
								S8_T4_VIEW.pr("purc_schd_upd_cntr"),
								S8_T4_VIEW.pr(S9_T4.upd_usr_id),
								S8_T4_VIEW.pr(S9_T4.upd_usr_nm),
								S8_T4_VIEW.pr(S9_T4.upd_ts),
								S8_T4_VIEW.pr(S9_T4.upd_func_id),
								S8_T4_VIEW.pr(S9_T4.upd_srv_req_no),
								S8_T4_VIEW.pr("rcpt_iv_mng_no"),
								S8_T4_VIEW.pr("rcpt_iv_no"),
								S8_T4_VIEW.pr("rcpt_iv_upd_cntr"),
								S8_T4_VIEW.pr("rcpt_iv_d_no"),
								S8_T4_VIEW.pr(S9_T7.disp_seq),
								S8_T4_VIEW.pr(S9_T7.itm_cd),
								S8_T4_VIEW.pr(S9_T7.itm_sub1),
								S8_T4_VIEW.pr(S9_T7.itm_sub2),
								S8_T4_VIEW.pr(S9_T7.itm_sub3),
								S8_T4_VIEW.pr(S9_T7.itm_nm),
								S8_T4_VIEW.pr(S9_T7.iv_itm_nm),
								S8_T4_VIEW.pr(S9_T7.purc_rsn_cd),
								S8_T4_VIEW.pr(S9_T7.sundry_itm_flg),
								S8_T4_VIEW.pr(S9_T7.sppl_itm_cd),
								S8_T4_VIEW.pr(S9_T7.sppl_itm_nm),
								S8_T4_VIEW.pr("cst_itm_cd"),
								S8_T4_VIEW.pr("cst_itm_nm"),
								S8_T4_VIEW.pr(S9_T7.upri_not_tgt_flg),
								S8_T4_VIEW.pr(S9_T7.interim_flg),
								S8_T4_VIEW.pr("src_tax_cd"),
								S8_T4_VIEW.pr(S9_T7.tax_fix_flg),
								cases()
									.when(S8_T4_VIEW.pr(S9_T7.tax_fix_flg).eq(value(false)))
										.then(
											MAPA_TAX$F_GET_PURC_TAX_CD(
												S8_T4_VIEW.pr(S9_T7.itm_cd),
												S8_T4_VIEW.pr(S9_T7.itm_sub1),
												S8_T4_VIEW.pr(S9_T7.itm_sub2),
												S8_T4_VIEW.pr(S9_T7.itm_sub3),
												S8_T4_VIEW.pr(S9_T9.sppl_cd),
												bind("mc_today")
											)
									)
									.otherwise(nullValue()).as("tax_cd"),
								S8_T4_VIEW.pr("src_trd_unit_qty"),
								S8_T4_VIEW.pr(S9_T4.trd_unit_cd),
								S8_T4_VIEW.pr("src_trd_unit_cd"),
								S8_T4_VIEW.pr("src_base_unit_qty"),
								S8_T4_VIEW.pr("src_trd_cur_upri"),
								S8_T4_VIEW.pr("src_trd_cur_proc_upri"),
								S8_T4_VIEW.pr("src_trd_cur_onr_prov_upri"),
								S8_T4_VIEW.pr("src_trd_cur_amt"),
								S8_T4_VIEW.pr("src_trd_cur_proc_amt"),
								S8_T4_VIEW.pr("src_trd_cur_onr_prov_amt"),
								S8_T4_VIEW.pr("src_trd_cur_tax_amt"),
								S8_T4_VIEW.pr("src_trd_cur_dscnt_amt"),
								S8_T4_VIEW.pr("src_wtax_rate"),
								S8_T4_VIEW.pr("dlv_rqst_dt"),
								S8_T4_VIEW.pr("arr_schd_dt"),
								S8_T4_VIEW.pr(S9_T7.sno1),
								S8_T4_VIEW.pr(S9_T7.sno2),
								S8_T4_VIEW.pr(S9_T7.sno3),
								S8_T4_VIEW.pr(S9_T7.sno4),
								S8_T4_VIEW.pr(S9_T5.ver_no),
								S8_T4_VIEW.pr(S9_T5.lot_no),
								S8_T4_VIEW.pr(S9_T5.sublot_no),
								S8_T4_VIEW.pr(S9_T5.quality_typ),
								S8_T4_VIEW.pr(S9_T5.stk_insp_typ),
								S8_T4_VIEW.pr(S9_T5.stk_id_typ),
								S8_T4_VIEW.pr(S9_T5.stk_bp_cd),
								S8_T4_VIEW.pr(S9_T4.base_unit_cd),
								MAPA_CALC$F_CALC_PER(
									S8_T4_VIEW.pr(S9_T4.base_unit_schd_qty),
									S8_T4_VIEW.pr(S9_T4.base_unit_purc_qty)
								).as("purc_prgrs"),
								S8_T4_VIEW.pr(S9_T4.base_unit_schd_qty),
								S8_T4_VIEW.pr(S9_T4.base_unit_schd_qty).subtract(
									decode(
										S8_T4_VIEW.pr(S9_T5.arr_skip_flg),
										value(true),
										S8_T4_VIEW.pr(S9_T4.base_unit_purc_qty),
										nvl(
											S8_T4_VIEW.pr(S9_T5.arr_qty),
											value(0)
										)
									)
								).as("base_unit_qty"),
								S8_T4_VIEW.pr(S9_T4.base_unit_purc_qty),
								S8_T4_VIEW.pr(S9_T5.arr_qty).as("base_unit_arr_qty"),
								S8_T4_VIEW.pr("base_unit_purc_act_qty"),
								S8_T4_VIEW.pr(S9_T5.mfg_inst_no),
								coalesce(
									S8_T4_VIEW.pr("src_wtax_rate"),
									MAPA_TAX$F_GET_WTAX_RATE(
										S8_T4_VIEW.pr(S9_T7.itm_cd),
										S8_T4_VIEW.pr(S9_T7.itm_sub1),
										S8_T4_VIEW.pr(S9_T7.itm_sub2),
										S8_T4_VIEW.pr(S9_T7.itm_sub3),
										bind("mc_today")
									)
								).as("wtax_rate"),
								S8_T4_VIEW.pr(S9_T7.wtax_amt),
								S8_T4_VIEW.pr(S9_T7.purc_id_typ),
								S8_T4_VIEW.pr(S9_T7.ap_dpt_cd),
								S8_T4_VIEW.pr("mst_ap_dpt_cd"),
								S8_T4_VIEW.pr(S9_T5.maker_cd),
								S8_T4_VIEW.pr(S9_T5.bp_lot_no),
								nullValue().as("gi_loc_cd"),
								nullValue().as("gi_str_ln_cd"),
								nullValue().as("gi_unit_cd"),
								nullValue().as("from_gd_cd"),
								S8_T4_VIEW.pr(S9_T5.arr_loc_cd).as("in_to_loc_cd"),
								S8_M18_wg_cd.as("in_to_loc_wg_cd"),
								S8_T4_VIEW.pr(S9_T5.str_ln_cd),
								S8_T4_VIEW.pr(S9_T5.gd_cd),
								S8_T4_VIEW.pr(S9_T7.bd_itm_cd),
								S8_T4_VIEW.pr(S9_T7.bd_itm_sub1),
								S8_T4_VIEW.pr(S9_T7.bd_itm_sub2),
								S8_T4_VIEW.pr(S9_T7.bd_itm_sub3),
								S8_T4_VIEW.pr(S9_T7.bd_sno1),
								S8_T4_VIEW.pr(S9_T7.bd_sno2),
								S8_T4_VIEW.pr(S9_T7.bd_sno3),
								S8_T4_VIEW.pr(S9_T7.bd_sno4),
								S8_T4_VIEW.pr(S9_T7.bd_loc_cd),
								S8_T4_VIEW.pr(S9_T7.bd_lot_no),
								S8_T4_VIEW.pr(S9_T7.bd_sublot_no),
								S8_T4_VIEW.pr(S9_T7.bd_dpt_cd),
								S8_T4_VIEW.pr(S9_T7.bd_wg_cd),
								S8_T4_VIEW.pr(S9_T7.bd_ctg_cd),
								S8_T4_VIEW.pr(S9_T7.bd_oper_cd),
								S8_T4_VIEW.pr(S9_T7.bd_slo_no),
								S8_T4_VIEW.pr(S9_T7.bd_iv_no),
								S8_T4_VIEW.pr(S9_T7.bd_po_no),
								S8_T4_VIEW.pr(S9_T7.bd_bp_cd),
								S8_T4_VIEW.pr(S9_T7.drct_dlv_typ),
								S8_T4_VIEW.pr(S9_T7.slo_d_no),
								S8_T4_VIEW.pr(S9_T7.slo_no),
								S8_T4_VIEW.pr("dlv_cd"),
								S8_T4_VIEW.pr("dlv_sundry_flg"),
								S8_T4_VIEW.pr("dlv_nm"),
								S8_T4_VIEW.pr("dlv_cntct_dpt"),
								S8_T4_VIEW.pr("dlv_cntct_psn"),
								S8_T4_VIEW.pr("dlv_zip_cd"),
								S8_T4_VIEW.pr("dlv_addr1"),
								S8_T4_VIEW.pr("dlv_addr2"),
								S8_T4_VIEW.pr("dlv_addr3"),
								S8_T4_VIEW.pr("dlv_addr4"),
								S8_T4_VIEW.pr("dlv_tel"),
								S8_T4_VIEW.pr("dlv_fax"),
								S8_T4_VIEW.pr("tdlv_cd"),
								S8_T4_VIEW.pr("tdlv_sundry_flg"),
								S8_T4_VIEW.pr("tdlv_nm"),
								S8_T4_VIEW.pr("tdlv_cntct_dpt"),
								S8_T4_VIEW.pr("tdlv_cntct_psn"),
								S8_T4_VIEW.pr("tdlv_zip_cd"),
								S8_T4_VIEW.pr("tdlv_addr1"),
								S8_T4_VIEW.pr("tdlv_addr2"),
								S8_T4_VIEW.pr("tdlv_addr3"),
								S8_T4_VIEW.pr("tdlv_addr4"),
								S8_T4_VIEW.pr("tdlv_tel"),
								S8_T4_VIEW.pr("tdlv_fax"),
								S8_T4_VIEW.pr(S9_T7.dscnt_rsn_cd),
								S8_T4_VIEW.pr(S9_T7.pay_crryovr_times),
								S8_T4_VIEW.pr(S9_T7.outsrc_flg),
								S8_T4_VIEW.pr(S9_T7.mfg_loc_cd),
								S8_T4_VIEW.pr(S9_T7.bom_ptn),
								S8_T4_VIEW.pr("arr_ptn_typ"),
								S8_T4_VIEW.pr("par_purc_act_d_no"),
								S8_T4_VIEW.pr(S9_T5.arr_split_flg),
								S8_T4_VIEW.pr(S9_T4.base_unit_accpt_dfct_qty),
								S8_T4_VIEW.pr(S9_T6.arr_pr_no),
								S8_T4_VIEW.pr("arr_pr_upd_cntr"),
								cases()
									.when(
										nvl(
											S8_T4_VIEW.pr(S9_T5.arr_qty),
											value(0)
										).gt(value(0))
									)
										.then(value(true))
									.otherwise(S8_T4_VIEW.pr(S9_T5.sync_flg)).as("sync_flg"),
								S8_T4_VIEW.pr(S9_T7.purc_basis_typ),
								nullValue().as("bp_dlv_slip_no"),
								nullValue().as("bp_dlv_slip_d_no"),
								nullValue().as("ship_fr_valid_dt"),
								nullValue().as("purc_cont_qty"),
								S8_T4_VIEW.pr(S9_T5.arr_skip_flg),
								S8_T4_VIEW.pr(S9_T6.purc_ddlv_flg),
								S8_T4_VIEW.pr(S9_T5.abort_flg),
								S8_T4_VIEW.pr(S9_T7.po_schd_no),
								bind("mc_today").as("master_dt"),
								S8_T4_VIEW.pr("tmp_po_no")
							)
							.from(
								subQuery()
								.select(
									S9_T4.purc_schd_no,
									S9_T7.po_d_no,
									S9_T9.po_no,
									S9_T9.aprv_flg,
									S9_T9.aprv_no,
									S9_T9.aprv_sts_typ,
									S9_T5.arr_schd_no,
									S9_T9.trd_cd,
									S9_T9.trd_ptn_typ,
									S9_T9.edi_flg,
									S9_T4.purc_schd_dt,
									nullValue().as("pay_basis_dt"),
									nullValue().as("pay_schd_dt"),
									S9_T9.purc_dpt_cd,
									S9_T9.wg_cd.as("purc_dpt_wg_cd"),
									S9_T9.purc_usr_cd,
									S9_T9.sppl_cd,
									S9_T9.tterm_cd1,
									S9_T9.tterm_rmrks1,
									S9_T9.tterm_cd2,
									S9_T9.tterm_rmrks2,
									S9_T9.tterm_cd3,
									S9_T9.tterm_rmrks3,
									S9_T9.po_print_rmrks,
									S9_T7.po_print_d_rmrks,
									S9_T9.trd_rmrks,
									S9_T7.trd_d_rmrks,
									S9_T9.trd_cur_cd,
									S9_T9.xrate_inpt_flg,
									S9_T9.xrate,
									S9_T9.ptax_xrate_inpt_flg,
									S9_T9.ptax_xrate,
									S9_T4.sub_char1.as("s_sub_char1"),
									S9_T4.sub_char2.as("s_sub_char2"),
									S9_T4.sub_char3.as("s_sub_char3"),
									S9_T4.ins_usr_id,
									S9_T4.ins_usr_nm,
									S9_T4.ins_ts,
									S9_T4.ins_func_id,
									S9_T4.upd_cntr.as("purc_schd_upd_cntr"),
									S9_T4.upd_usr_id,
									S9_T4.upd_usr_nm,
									S9_T4.upd_ts,
									S9_T4.upd_func_id,
									S9_T4.upd_srv_req_no,
									nullValue().as("rcpt_iv_mng_no"),
									nullValue().as("rcpt_iv_no"),
									nullValue().as("rcpt_iv_d_no"),
									S9_T7.disp_seq,
									S9_T7.itm_cd,
									S9_T7.itm_nm,
									S9_T7.iv_itm_nm,
									S9_T7.itm_sub1,
									S9_T7.itm_sub2,
									S9_T7.itm_sub3,
									S9_T7.purc_rsn_cd,
									S9_T7.sundry_itm_flg,
									S9_T7.sppl_itm_cd,
									S9_T7.sppl_itm_nm,
									bracket(
											cases()
												.when(S9_T7.dlv_cd.isNotNull())
													.then(S9_T15.cst_itm_cd)
												.otherwise(nullValue())
										).as("cst_itm_cd"),
									bracket(
											cases()
												.when(S6_T7.dlv_cd.isNotNull())
													.then(S9_T15.cst_itm_nm)
												.otherwise(nullValue())
										).as("cst_itm_nm"),
									S9_T7.upri_not_tgt_flg,
									S9_T7.interim_flg,
									S9_T7.tax_cd.as("src_tax_cd"),
									S9_T7.tax_fix_flg,
									S9_T7.trd_unit_qty.as("src_trd_unit_qty"),
									S9_T4.trd_unit_cd,
									S9_T7.trd_unit_cd.as("src_trd_unit_cd"),
									S9_T7.base_unit_qty.as("src_base_unit_qty"),
									S9_T4.base_unit_cd,
									S9_T7.base_unit_cd.as("src_base_unit_cd"),
									S9_T7.trd_cur_upri.as("src_trd_cur_upri"),
									S9_T7.trd_cur_proc_upri.as("src_trd_cur_proc_upri"),
									S9_T7.trd_cur_onr_prov_upri.as("src_trd_cur_onr_prov_upri"),
									S9_T7.trd_cur_amt.as("src_trd_cur_amt"),
									S9_T7.trd_cur_proc_amt.as("src_trd_cur_proc_amt"),
									S9_T7.trd_cur_onr_prov_amt.as("src_trd_cur_onr_prov_amt"),
									S9_T7.trd_cur_tax_amt.as("src_trd_cur_tax_amt"),
									S9_T7.trd_cur_dscnt_amt.as("src_trd_cur_dscnt_amt"),
									S9_T7.wtax_rate.as("src_wtax_rate"),
									trunc(
										S9_T7.dlv_rqst_tm,
										MCDateFmt.DD
									).as("dlv_rqst_dt"),
									trunc(
										S9_T5.arr_schd_tm,
										MCDateFmt.DD
									).as("arr_schd_dt"),
									S9_T7.sno1,
									S9_T7.sno2,
									S9_T7.sno3,
									S9_T7.sno4,
									S9_T5.ver_no,
									S9_T5.lot_no,
									S9_T5.sublot_no,
									S9_T5.quality_typ,
									S9_T5.stk_insp_typ,
									S9_T5.stk_id_typ,
									S9_T5.stk_bp_cd,
									S9_T5.arr_qty,
									S9_T5.abort_qty,
									S9_T4.base_unit_purc_qty,
									S9_T4.base_unit_accpt_dfct_qty,
									S9_T4.base_unit_schd_qty,
									S9_T4.base_unit_purc_qty.add(S9_T4.base_unit_accpt_dfct_qty).as("base_unit_purc_act_qty"),
									S9_T5.mfg_inst_no,
									S9_T7.wtax_amt,
									S9_T7.purc_id_typ,
									S9_T7.ap_dpt_cd,
									MAPA_BP$F_GET_AP_DPT_CD_NE(
											S9_M5.asppl_cd,
											bind("mc_today"),
											value(false)
										).as("mst_ap_dpt_cd"),
									S9_T5.maker_cd,
									S9_T5.bp_lot_no,
									S9_T5.arr_loc_cd,
									S9_T5.str_ln_cd,
									S9_T5.gd_cd,
									nvl(
										S9_T5.arr_ptn_typ,
										value(MSC_ARR_PTN_TYP.NRML.value())
									).as("arr_ptn_typ"),
									S9_T5.purc_act_d_no.as("par_purc_act_d_no"),
									S9_T5.arr_split_flg,
									S9_T5.sync_flg,
									S9_T7.purc_basis_typ,
									S9_T5.arr_skip_flg,
									S9_T5.abort_flg,
									S9_T7.bd_itm_cd,
									S9_T7.bd_itm_sub1,
									S9_T7.bd_itm_sub2,
									S9_T7.bd_itm_sub3,
									S9_T7.bd_sno1,
									S9_T7.bd_sno2,
									S9_T7.bd_sno3,
									S9_T7.bd_sno4,
									S9_T7.bd_loc_cd,
									S9_T7.bd_lot_no,
									S9_T7.bd_sublot_no,
									S9_T7.bd_dpt_cd,
									S9_T7.bd_wg_cd,
									S9_T7.bd_ctg_cd,
									S9_T7.bd_oper_cd,
									S9_T7.bd_slo_no,
									S9_T7.bd_iv_no,
									S9_T7.bd_po_no,
									S9_T7.bd_bp_cd,
									S9_T7.drct_dlv_typ,
									nvl(
										S9_T11.dlv_cd,
										S9_T7.dlv_cd
									).as("dlv_cd"),
									nvl2(
										S9_T11.dlv_cd,
										S9_T11.dlv_nm,
										S9_T7.dlv_nm
									).as("dlv_nm"),
									nvl2(
										S9_T11.dlv_cd,
										S9_T11.dlv_cntct_dpt,
										S9_T7.dlv_cntct_dpt
									).as("dlv_cntct_dpt"),
									nvl2(
										S9_T11.dlv_cd,
										S9_T11.dlv_cntct_psn,
										S9_T7.dlv_cntct_psn
									).as("dlv_cntct_psn"),
									nvl2(
										S9_T11.dlv_cd,
										S9_T11.dlv_sundry_flg,
										S9_T7.dlv_sundry_flg
									).as("dlv_sundry_flg"),
									nvl2(
										S9_T11.dlv_cd,
										S9_T11.dlv_zip_cd,
										S9_T7.dlv_zip_cd
									).as("dlv_zip_cd"),
									nvl2(
										S9_T11.dlv_cd,
										S9_T11.dlv_addr1,
										S9_T7.dlv_addr1
									).as("dlv_addr1"),
									nvl2(
										S9_T11.dlv_cd,
										S9_T11.dlv_addr2,
										S9_T7.dlv_addr2
									).as("dlv_addr2"),
									nvl2(
										S9_T11.dlv_cd,
										S9_T11.dlv_addr3,
										S9_T7.dlv_addr3
									).as("dlv_addr3"),
									nvl2(
										S9_T11.dlv_cd,
										S9_T11.dlv_addr4,
										S9_T7.dlv_addr4
									).as("dlv_addr4"),
									nvl2(
										S9_T11.dlv_cd,
										S9_T11.dlv_tel,
										S9_T7.dlv_tel
									).as("dlv_tel"),
									nvl2(
										S9_T11.dlv_cd,
										S9_T11.dlv_fax,
										S9_T7.dlv_fax
									).as("dlv_fax"),
									nvl(
										S9_T11.tdlv_cd,
										S9_T7.tdlv_cd
									).as("tdlv_cd"),
									nvl2(
										S9_T11.tdlv_cd,
										S9_T11.tdlv_nm,
										S9_T7.tdlv_nm
									).as("tdlv_nm"),
									nvl2(
										S9_T11.tdlv_cd,
										S9_T11.tdlv_cntct_dpt,
										S9_T7.tdlv_cntct_dpt
									).as("tdlv_cntct_dpt"),
									nvl2(
										S9_T11.tdlv_cd,
										S9_T11.tdlv_cntct_psn,
										S9_T7.tdlv_cntct_psn
									).as("tdlv_cntct_psn"),
									nvl2(
										S9_T11.tdlv_cd,
										S9_T11.tdlv_sundry_flg,
										S9_T7.tdlv_sundry_flg
									).as("tdlv_sundry_flg"),
									nvl2(
										S9_T11.tdlv_cd,
										S9_T11.tdlv_zip_cd,
										S9_T7.tdlv_zip_cd
									).as("tdlv_zip_cd"),
									nvl2(
										S9_T11.tdlv_cd,
										S9_T11.tdlv_addr1,
										S9_T7.tdlv_addr1
									).as("tdlv_addr1"),
									nvl2(
										S9_T11.tdlv_cd,
										S9_T11.tdlv_addr2,
										S9_T7.tdlv_addr2
									).as("tdlv_addr2"),
									nvl2(
										S9_T11.tdlv_cd,
										S9_T11.tdlv_addr3,
										S9_T7.tdlv_addr3
									).as("tdlv_addr3"),
									nvl2(
										S9_T11.tdlv_cd,
										S9_T11.tdlv_addr4,
										S9_T7.tdlv_addr4
									).as("tdlv_addr4"),
									nvl2(
										S9_T11.tdlv_cd,
										S9_T11.tdlv_tel,
										S9_T7.tdlv_tel
									).as("tdlv_tel"),
									nvl2(
										S9_T11.tdlv_cd,
										S9_T11.tdlv_fax,
										S9_T7.tdlv_fax
									).as("tdlv_fax"),
									S9_T7.dscnt_rsn_cd,
									S9_T7.pay_crryovr_times,
									S9_T7.outsrc_flg,
									S9_T7.mfg_loc_cd,
									S9_T7.bom_ptn,
									S9_T6.purc_ddlv_flg,
									S9_T7.po_schd_no,
									S9_T7.slo_d_no,
									S9_T7.slo_no,
									S9_T6.arr_pr_no,
									S9_T6.upd_cntr.as("arr_pr_upd_cntr"),
									nullValue().as("rcpt_iv_upd_cntr"),
									S9_T9.po_no.as("tmp_po_no")
								)
								.from(
									S9_T4
									.innerJoin(S9_T5).on(S9_T4.arr_schd_no.eq(S9_T5.arr_schd_no))
									.innerJoin(S9_T6).on(S9_T4.arr_pr_no.eq(S9_T6.arr_pr_no))
									.innerJoin(S9_T7).on(S9_T6.po_d_no.eq(S9_T7.po_d_no))
									.innerJoin(S9_T9).on(S9_T7.po_no.eq(S9_T9.po_no))
									.innerJoin(S9_M0).on(S9_T9.purc_dpt_cd.eq(S9_M0.dpt_cd))
									.innerJoin(S9_M5).on(S9_T9.sppl_cd.eq(S9_M5.bp_cd))
									.leftOuterJoin(S9_T10).on(S9_T10.prms_rcpt_d_no.eq(S9_T5.prms_rcpt_d_no))
									.leftOuterJoin(S9_T11).on(
										S9_T11.dlv_inst_d_no.eq(nvl(
												S9_T5.dlv_inst_d_no,
												S9_T10.dlv_inst_d_no
											)
										)
									)
									.leftOuterJoin(S9_T15).on
										(bracket(
												S9_T15.slo_d_no.eq(S9_T7.slo_d_no)
											)
									)
								)
								.where(
									value(0).eq(value(0))
									.and(
										bracket(
											S9_T9.aprv_flg.eq(value(false))
										)
										.or(
											S9_T9.aprv_flg.eq(value(true))
											.and(bind("incl_not_aprv_flg").eq(value(false)))
											.and(S9_T9.aprv_sts_typ.eq(value(MAC_APRV_STS_TYP.ACPT.value())))
										)
										.or(
											S9_T9.aprv_flg.eq(value(true))
											.and(bind("incl_not_aprv_flg").eq(value(true)))
										)
									)
									.and(S9_T4.cmpl_flg.eq(value(false)))
									.and(S9_T7.purc_id_typ.neq(value(MAC_PURC_ID_TYP.VMI.value())))
									.and(S9_M5.sppl_iv_flg.eq(value(false)))
									.cutoff$and(
										MAPA_CALC$F_CALC_PER(
											S9_T5.base_unit_qty,
											S9_T5.purc_qty
										).gte(bind("purc_prgrs_fr"))
									)
									.cutoff$and(
										MAPA_CALC$F_CALC_PER(
											S9_T5.base_unit_qty,
											S9_T5.purc_qty
										).lte(bind("purc_prgrs_to"))
									)
									.cutoff$and(S9_T4.purc_schd_no.like(bind("purc_schd_no")))
									.cutoff$and(S9_T5.arr_ptn_typ.eq(bind("_arr_ptn_typ")))
									.cutoff$and(S9_T5.cmpl_flg.eq(bind("_arr_cmpl_flg")))
									.cutoff$and(S9_T9.edi_flg.eq(bind("_edi_flg")))
									.cutoff$and(nullValue().like(bind("rcpt_iv_mng_no")))
									.cutoff$and(nullValue().like(bind("rcpt_iv_no")))
									.cutoff$and(nullValue().like(bind("rcpt_iv_d_no")))
									.cutoff$and(S9_T4.purc_schd_dt.gte(bind("purc_schd_dt_fr")))
									.cutoff$and(S9_T4.purc_schd_dt.lte(bind("purc_schd_dt_to")))
									.cutoff$and(S9_T9.sppl_cd.like(bind("sppl_cd")))
									.cutoff$and(S9_T7.itm_cd.like(bind("itm_cd")))
									.cutoff$and(S9_T7.itm_sub1.like(bind("itm_sub1")))
									.cutoff$and(S9_T7.itm_sub2.like(bind("itm_sub2")))
									.cutoff$and(S9_T7.itm_sub3.like(bind("itm_sub3")))
									.cutoff$and(S9_T7.sppl_itm_cd.like(bind("sppl_itm_cd")))
									.cutoff$and(S9_T7.sppl_itm_nm.like(bind("sppl_itm_nm")))
									.cutoff$and(S9_T7.sno1.like(bind("sno1")))
									.cutoff$and(S9_T7.sno2.like(bind("sno2")))
									.cutoff$and(S9_T7.sno3.like(bind("sno3")))
									.cutoff$and(S9_T7.sno4.like(bind("sno4")))
									.cutoff$and(S9_T9.purc_usr_cd.like(bind("purc_usr_cd")))
									.cutoff$and(S9_T9.purc_dpt_cd.like(bind("purc_dpt_cd")))
									.cutoff$and(S9_T9.wg_cd.like(bind("purc_dpt_wg_cd")))
									.cutoff$and(S9_T7.ap_dpt_cd.like(bind("ap_dpt_cd")))
									.cutoff$and(S9_T7.po_schd_no.like(bind("po_schd_no")))
									.cutoff$and(S9_T7.po_no.like(bind("po_no")))
									.cutoff$and(S9_T7.po_d_no.like(bind("po_d_no")))
									.cutoff$and(S9_T4.purc_schd_no.like(bind("purc_schd_no")))
									.cutoff$and(S9_T9.trd_cd.like(bind("trd_cd")))
									.cutoff$and(S9_T7.purc_id_typ.like(bind("purc_id_typ")))
									.cutoff$and(S9_T7.drct_dlv_typ.like(bind("drct_dlv_typ")))
									.cutoff$and(S9_T4.sub_char1.like(bind("s_sub_char1")))
									.cutoff$and(S9_T4.sub_char2.like(bind("s_sub_char2")))
									.cutoff$and(S9_T4.sub_char3.like(bind("s_sub_char3")))
								)
								.view(S8_T4_VIEW)
							)
							.where(
								value(0).eq(value(0))
								.and(
									S8_T4_VIEW.pr(S9_T4.base_unit_schd_qty).subtract(nvl(
											S8_T4_VIEW.pr(S9_T5.arr_qty),
											value(0)
										)).subtract(nvl(
												S8_T4_VIEW.pr(S9_T5.abort_qty),
												value(0)
											)).gt(value(0))
								)
								.and(
									S8_T4_VIEW.pr(S9_T7.purc_basis_typ).eq(value(MAC_PURC_BASIS_TYP.IN_BASIS.value()))
									.and(
										nvl(
											S8_T4_VIEW.pr(S9_T5.arr_qty),
											value(0)
										).eq(value(0))
									)
									.or(S8_T4_VIEW.pr(S9_T7.purc_basis_typ).neq(value(MAC_PURC_BASIS_TYP.IN_BASIS.value())))
									.or(S8_T4_VIEW.pr(S9_T7.purc_basis_typ).isNull())
								)
								.cutoff$and(S8_T4_VIEW.pr(S9_T5.lot_no).like(bind("lot_no")))
								.cutoff$and(S8_T4_VIEW.pr(S9_T5.sublot_no).like(bind("sublot_no")))
								.cutoff$and(S8_T4_VIEW.pr(S9_T5.bp_lot_no).like(bind("bp_lot_no")))
								.cutoff$and(S8_T4_VIEW.pr(S9_T5.ver_no).like(bind("ver_no")))
								.cutoff$and(S8_T4_VIEW.pr(S9_T5.maker_cd).like(bind("maker_cd")))
								.cutoff$and(S8_T4_VIEW.pr(S9_T5.arr_loc_cd).like(bind("in_to_loc_cd")))
								.cutoff$and(S8_T4_VIEW.pr(S9_T5.str_ln_cd).like(bind("str_ln_cd")))
								.cutoff$and(
									bracket(
										value(false).eq(bind("_dfct_insp_flg"))
									)
								)
							)
						).view(S0_V1)
						.addDynamicView()
						.addDynamicView(DS0D)
					)
					.where(
						value(0).eq(value(0))
						.addDynamicPredicate()
						.addDynamicPredicate(DS0D)
					)
					.orderBy(
						S0_V1.pr("rcpt_iv_mng_no").asc(),
						S0_V1.pr(S2_T7.po_d_no).asc(),
						S0_V1.pr(S2_T4.purc_schd_no).asc()
					)
			)
			.setDynamicSQLInfo(
				when(boundOr("in_to_loc_wg_cd"))
					.view(v -> v.leftOuterJoin(S0_M1).on(S0_M1.loc_cd.eq(S0_V1.pr("in_to_loc_cd"))))
					.predicate(p -> p.cutoff$and(S0_M1.wg_cd.eq(bind("in_to_loc_wg_cd")))),
				when(boundOr("itm_nm", "itm_typ", "itm_typ_d_cd", "itm_typ_d_nm", "itm_grp_flg1", "itm_grp_flg2", "itm_grp_flg3", "itm_grp_flg4", "itm_grp_flg5", "itm_grp_flg6", "itm_grp_flg7", "itm_grp_flg8", "itm_grp_flg9", "itm_grp_flg10"))
					.view(DS0D, v -> v.leftOuterJoin(S0_ITM).on(S0_ITM.itm_cd.eq(S0_V1.pr(S2_T7.itm_cd)).and(S0_ITM.itm_sub1.eq(S0_V1.pr(S2_T7.itm_sub1))).and(S0_ITM.itm_sub2.eq(S0_V1.pr(S2_T7.itm_sub2))).and(S0_ITM.itm_sub3.eq(S0_V1.pr(S2_T7.itm_sub3)))))
					.predicate(DS0D, p -> p.cutoff$and(nvl(S0_V1.pr(S2_T7.itm_nm),S0_ITM.itm_nm).like(bind("itm_nm")))),
				when(boundOr("itm_grp_flg1"))
					.select(DS0D, S0_ITM.itm_grp_cd1.as("itm_grp_cd1"))
					.groupBy(DS0D, S0_ITM.itm_grp_cd1),
				when(boundOr("itm_grp_flg1", "itm_grp_cd1"))
					.predicate(DS0D, p -> p.cutoff$and(S0_ITM.itm_grp_cd1.like(bind("itm_grp_cd1")))),
				when(boundOr("itm_grp_flg1"))
					.select(DS0D, S0_ITM_GRP1.itm_grp_nm.as("itm_grp_nm1"))
					.groupBy(DS0D, S0_ITM_GRP1.itm_grp_nm),
				when(boundOr("itm_grp_flg1", "itm_grp_nm1"))
					.view(DS0D, v -> v.leftOuterJoin(S0_ITM_GRP1).on(S0_ITM.itm_grp_cd1.eq(S0_ITM_GRP1.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP1.value()).eq(S0_ITM_GRP1.itm_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_ITM_GRP1.itm_grp_nm.like(bind("itm_grp_nm1")))),
				when(boundOr("itm_grp_flg2"))
					.select(DS0D, S0_ITM.itm_grp_cd2.as("itm_grp_cd2"))
					.groupBy(DS0D, S0_ITM.itm_grp_cd2),
				when(boundOr("itm_grp_flg2", "itm_grp_cd2"))
					.predicate(DS0D, p -> p.cutoff$and(S0_ITM.itm_grp_cd2.like(bind("itm_grp_cd2")))),
				when(boundOr("itm_grp_flg2"))
					.select(DS0D, S0_ITM_GRP2.itm_grp_nm.as("itm_grp_nm2"))
					.groupBy(DS0D, S0_ITM_GRP2.itm_grp_nm),
				when(boundOr("itm_grp_flg2", "itm_grp_nm2"))
					.view(DS0D, v -> v.leftOuterJoin(S0_ITM_GRP2).on(S0_ITM.itm_grp_cd2.eq(S0_ITM_GRP2.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP2.value()).eq(S0_ITM_GRP2.itm_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_ITM_GRP2.itm_grp_nm.like(bind("itm_grp_nm2")))),
				when(boundOr("itm_grp_flg3"))
					.select(DS0D, S0_ITM.itm_grp_cd3.as("itm_grp_cd3"))
					.groupBy(DS0D, S0_ITM.itm_grp_cd3),
				when(boundOr("itm_grp_flg3", "itm_grp_cd3"))
					.predicate(DS0D, p -> p.cutoff$and(S0_ITM.itm_grp_cd3.like(bind("itm_grp_cd3")))),
				when(boundOr("itm_grp_flg3"))
					.select(DS0D, S0_ITM_GRP3.itm_grp_nm.as("itm_grp_nm3"))
					.groupBy(DS0D, S0_ITM_GRP3.itm_grp_nm),
				when(boundOr("itm_grp_flg3", "itm_grp_nm3"))
					.view(DS0D, v -> v.leftOuterJoin(S0_ITM_GRP3).on(S0_ITM.itm_grp_cd3.eq(S0_ITM_GRP3.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP3.value()).eq(S0_ITM_GRP3.itm_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_ITM_GRP3.itm_grp_nm.like(bind("itm_grp_nm3")))),
				when(boundOr("itm_grp_flg4"))
					.select(DS0D, S0_ITM.itm_grp_cd4.as("itm_grp_cd4"))
					.groupBy(DS0D, S0_ITM.itm_grp_cd4),
				when(boundOr("itm_grp_flg4", "itm_grp_cd4"))
					.predicate(DS0D, p -> p.cutoff$and(S0_ITM.itm_grp_cd4.like(bind("itm_grp_cd4")))),
				when(boundOr("itm_grp_flg4"))
					.select(DS0D, S0_ITM_GRP4.itm_grp_nm.as("itm_grp_nm4"))
					.groupBy(DS0D, S0_ITM_GRP4.itm_grp_nm),
				when(boundOr("itm_grp_flg4", "itm_grp_nm4"))
					.view(DS0D, v -> v.leftOuterJoin(S0_ITM_GRP4).on(S0_ITM.itm_grp_cd4.eq(S0_ITM_GRP4.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP4.value()).eq(S0_ITM_GRP4.itm_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_ITM_GRP4.itm_grp_nm.like(bind("itm_grp_nm4")))),
				when(boundOr("itm_grp_flg5"))
					.select(DS0D, S0_ITM.itm_grp_cd5.as("itm_grp_cd5"))
					.groupBy(DS0D, S0_ITM.itm_grp_cd5),
				when(boundOr("itm_grp_flg5", "itm_grp_cd5"))
					.predicate(DS0D, p -> p.cutoff$and(S0_ITM.itm_grp_cd5.like(bind("itm_grp_cd5")))),
				when(boundOr("itm_grp_flg5"))
					.select(DS0D, S0_ITM_GRP5.itm_grp_nm.as("itm_grp_nm5"))
					.groupBy(DS0D, S0_ITM_GRP5.itm_grp_nm),
				when(boundOr("itm_grp_flg5", "itm_grp_nm5"))
					.view(DS0D, v -> v.leftOuterJoin(S0_ITM_GRP5).on(S0_ITM.itm_grp_cd5.eq(S0_ITM_GRP5.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP5.value()).eq(S0_ITM_GRP5.itm_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_ITM_GRP5.itm_grp_nm.like(bind("itm_grp_nm5")))),
				when(boundOr("itm_grp_flg6"))
					.select(DS0D, S0_ITM.itm_grp_cd6.as("itm_grp_cd6"))
					.groupBy(DS0D, S0_ITM.itm_grp_cd6),
				when(boundOr("itm_grp_flg6", "itm_grp_cd6"))
					.predicate(DS0D, p -> p.cutoff$and(S0_ITM.itm_grp_cd6.like(bind("itm_grp_cd6")))),
				when(boundOr("itm_grp_flg6"))
					.select(DS0D, S0_ITM_GRP6.itm_grp_nm.as("itm_grp_nm6"))
					.groupBy(DS0D, S0_ITM_GRP6.itm_grp_nm),
				when(boundOr("itm_grp_flg6", "itm_grp_nm6"))
					.view(DS0D, v -> v.leftOuterJoin(S0_ITM_GRP6).on(S0_ITM.itm_grp_cd6.eq(S0_ITM_GRP6.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP6.value()).eq(S0_ITM_GRP6.itm_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_ITM_GRP6.itm_grp_nm.like(bind("itm_grp_nm6")))),
				when(boundOr("itm_grp_flg7"))
					.select(DS0D, S0_ITM.itm_grp_cd7.as("itm_grp_cd7"))
					.groupBy(DS0D, S0_ITM.itm_grp_cd7),
				when(boundOr("itm_grp_flg7", "itm_grp_cd7"))
					.predicate(DS0D, p -> p.cutoff$and(S0_ITM.itm_grp_cd7.like(bind("itm_grp_cd7")))),
				when(boundOr("itm_grp_flg7"))
					.select(DS0D, S0_ITM_GRP7.itm_grp_nm.as("itm_grp_nm7"))
					.groupBy(DS0D, S0_ITM_GRP7.itm_grp_nm),
				when(boundOr("itm_grp_flg7", "itm_grp_nm7"))
					.view(DS0D, v -> v.leftOuterJoin(S0_ITM_GRP7).on(S0_ITM.itm_grp_cd7.eq(S0_ITM_GRP7.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP7.value()).eq(S0_ITM_GRP7.itm_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_ITM_GRP7.itm_grp_nm.like(bind("itm_grp_nm7")))),
				when(boundOr("itm_grp_flg8"))
					.select(DS0D, S0_ITM.itm_grp_cd8.as("itm_grp_cd8"))
					.groupBy(DS0D, S0_ITM.itm_grp_cd8),
				when(boundOr("itm_grp_flg8", "itm_grp_cd8"))
					.predicate(DS0D, p -> p.cutoff$and(S0_ITM.itm_grp_cd8.like(bind("itm_grp_cd8")))),
				when(boundOr("itm_grp_flg8"))
					.select(DS0D, S0_ITM_GRP8.itm_grp_nm.as("itm_grp_nm8"))
					.groupBy(DS0D, S0_ITM_GRP8.itm_grp_nm),
				when(boundOr("itm_grp_flg8", "itm_grp_nm8"))
					.view(DS0D, v -> v.leftOuterJoin(S0_ITM_GRP8).on(S0_ITM.itm_grp_cd8.eq(S0_ITM_GRP8.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP8.value()).eq(S0_ITM_GRP8.itm_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_ITM_GRP8.itm_grp_nm.like(bind("itm_grp_nm8")))),
				when(boundOr("itm_grp_flg9"))
					.select(DS0D, S0_ITM.itm_grp_cd9.as("itm_grp_cd9"))
					.groupBy(DS0D, S0_ITM.itm_grp_cd9),
				when(boundOr("itm_grp_flg9", "itm_grp_cd9"))
					.predicate(DS0D, p -> p.cutoff$and(S0_ITM.itm_grp_cd9.like(bind("itm_grp_cd9")))),
				when(boundOr("itm_grp_flg9"))
					.select(DS0D, S0_ITM_GRP9.itm_grp_nm.as("itm_grp_nm9"))
					.groupBy(DS0D, S0_ITM_GRP9.itm_grp_nm),
				when(boundOr("itm_grp_flg9", "itm_grp_nm9"))
					.view(DS0D, v -> v.leftOuterJoin(S0_ITM_GRP9).on(S0_ITM.itm_grp_cd9.eq(S0_ITM_GRP9.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP9.value()).eq(S0_ITM_GRP9.itm_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_ITM_GRP9.itm_grp_nm.like(bind("itm_grp_nm9")))),
				when(boundOr("itm_grp_flg10"))
					.select(DS0D, S0_ITM.itm_grp_cd10.as("itm_grp_cd10"))
					.groupBy(DS0D, S0_ITM.itm_grp_cd10),
				when(boundOr("itm_grp_flg10", "itm_grp_cd10"))
					.predicate(DS0D, p -> p.cutoff$and(S0_ITM.itm_grp_cd10.like(bind("itm_grp_cd10")))),
				when(boundOr("itm_grp_flg10"))
					.select(DS0D, S0_ITM_GRP10.itm_grp_nm.as("itm_grp_nm10"))
					.groupBy(DS0D, S0_ITM_GRP10.itm_grp_nm),
				when(boundOr("itm_grp_flg10", "itm_grp_nm10"))
					.view(DS0D, v -> v.leftOuterJoin(S0_ITM_GRP10).on(S0_ITM.itm_grp_cd10.eq(S0_ITM_GRP10.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP10.value()).eq(S0_ITM_GRP10.itm_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_ITM_GRP10.itm_grp_nm.like(bind("itm_grp_nm10")))),
				when(boundOr("sppl_nm", "_iv_flg", "sppl_grp_flg1", "sppl_grp_flg2", "sppl_grp_flg3", "sppl_grp_flg4", "sppl_grp_flg5", "sppl_grp_flg6", "sppl_grp_flg7", "sppl_grp_flg8", "sppl_grp_flg9", "sppl_grp_flg10"))
					.view(DS0D, v -> v.leftOuterJoin(S0_SPPL).on(S0_SPPL.bp_cd.eq(S0_V1.pr(S2_T9.sppl_cd))))
					.predicate(DS0D, p -> p.cutoff$and(S0_SPPL.sppl_iv_flg.eq(bind("_iv_flg"))).cutoff$and(S0_SPPL.bp_nm.like(bind("sppl_nm")))),
				when(boundOr("sppl_grp_flg1"))
					.select(DS0D, S0_SPPL.bp_grp_cd1.as("sppl_grp_cd1"))
					.groupBy(DS0D, S0_SPPL.bp_grp_cd1),
				when(boundOr("sppl_grp_flg1", "sppl_grp_cd1"))
					.predicate(DS0D, p -> p.cutoff$and(S0_SPPL.bp_grp_cd1.like(bind("sppl_grp_cd1")))),
				when(boundOr("sppl_grp_flg1"))
					.select(DS0D, S0_SPPL_GRP1.bp_grp_nm.as("sppl_grp_nm1"))
					.groupBy(DS0D, S0_SPPL_GRP1.bp_grp_nm),
				when(boundOr("sppl_grp_flg1", "sppl_grp_nm1"))
					.view(DS0D, v -> v.leftOuterJoin(S0_SPPL_GRP1).on(S0_SPPL.bp_grp_cd1.eq(S0_SPPL_GRP1.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP1.value()).eq(S0_SPPL_GRP1.bp_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_SPPL_GRP1.bp_grp_nm.like(bind("sppl_grp_nm1")))),
				when(boundOr("sppl_grp_flg2"))
					.select(DS0D, S0_SPPL.bp_grp_cd2.as("sppl_grp_cd2"))
					.groupBy(DS0D, S0_SPPL.bp_grp_cd2),
				when(boundOr("sppl_grp_flg2", "sppl_grp_cd2"))
					.predicate(DS0D, p -> p.cutoff$and(S0_SPPL.bp_grp_cd2.like(bind("sppl_grp_cd2")))),
				when(boundOr("sppl_grp_flg2"))
					.select(DS0D, S0_SPPL_GRP2.bp_grp_nm.as("sppl_grp_nm2"))
					.groupBy(DS0D, S0_SPPL_GRP2.bp_grp_nm),
				when(boundOr("sppl_grp_flg2", "sppl_grp_nm2"))
					.view(DS0D, v -> v.leftOuterJoin(S0_SPPL_GRP2).on(S0_SPPL.bp_grp_cd2.eq(S0_SPPL_GRP2.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP2.value()).eq(S0_SPPL_GRP2.bp_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_SPPL_GRP2.bp_grp_nm.like(bind("sppl_grp_nm2")))),
				when(boundOr("sppl_grp_flg3"))
					.select(DS0D, S0_SPPL.bp_grp_cd3.as("sppl_grp_cd3"))
					.groupBy(DS0D, S0_SPPL.bp_grp_cd3),
				when(boundOr("sppl_grp_flg3", "sppl_grp_cd3"))
					.predicate(DS0D, p -> p.cutoff$and(S0_SPPL.bp_grp_cd3.like(bind("sppl_grp_cd3")))),
				when(boundOr("sppl_grp_flg3"))
					.select(DS0D, S0_SPPL_GRP3.bp_grp_nm.as("sppl_grp_nm3"))
					.groupBy(DS0D, S0_SPPL_GRP3.bp_grp_nm),
				when(boundOr("sppl_grp_flg3", "sppl_grp_nm3"))
					.view(DS0D, v -> v.leftOuterJoin(S0_SPPL_GRP3).on(S0_SPPL.bp_grp_cd3.eq(S0_SPPL_GRP3.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP3.value()).eq(S0_SPPL_GRP3.bp_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_SPPL_GRP3.bp_grp_nm.like(bind("sppl_grp_nm3")))),
				when(boundOr("sppl_grp_flg4"))
					.select(DS0D, S0_SPPL.bp_grp_cd4.as("sppl_grp_cd4"))
					.groupBy(DS0D, S0_SPPL.bp_grp_cd4),
				when(boundOr("sppl_grp_flg4", "sppl_grp_cd4"))
					.predicate(DS0D, p -> p.cutoff$and(S0_SPPL.bp_grp_cd4.like(bind("sppl_grp_cd4")))),
				when(boundOr("sppl_grp_flg4"))
					.select(DS0D, S0_SPPL_GRP4.bp_grp_nm.as("sppl_grp_nm4"))
					.groupBy(DS0D, S0_SPPL_GRP4.bp_grp_nm),
				when(boundOr("sppl_grp_flg4", "sppl_grp_nm4"))
					.view(DS0D, v -> v.leftOuterJoin(S0_SPPL_GRP4).on(S0_SPPL.bp_grp_cd4.eq(S0_SPPL_GRP4.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP4.value()).eq(S0_SPPL_GRP4.bp_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_SPPL_GRP4.bp_grp_nm.like(bind("sppl_grp_nm4")))),
				when(boundOr("sppl_grp_flg5"))
					.select(DS0D, S0_SPPL.bp_grp_cd5.as("sppl_grp_cd5"))
					.groupBy(DS0D, S0_SPPL.bp_grp_cd5),
				when(boundOr("sppl_grp_flg5", "sppl_grp_cd5"))
					.predicate(DS0D, p -> p.cutoff$and(S0_SPPL.bp_grp_cd5.like(bind("sppl_grp_cd5")))),
				when(boundOr("sppl_grp_flg5"))
					.select(DS0D, S0_SPPL_GRP5.bp_grp_nm.as("sppl_grp_nm5"))
					.groupBy(DS0D, S0_SPPL_GRP5.bp_grp_nm),
				when(boundOr("sppl_grp_flg5", "sppl_grp_nm5"))
					.view(DS0D, v -> v.leftOuterJoin(S0_SPPL_GRP5).on(S0_SPPL.bp_grp_cd5.eq(S0_SPPL_GRP5.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP5.value()).eq(S0_SPPL_GRP5.bp_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_SPPL_GRP5.bp_grp_nm.like(bind("sppl_grp_nm5")))),
				when(boundOr("sppl_grp_flg6"))
					.select(DS0D, S0_SPPL.bp_grp_cd6.as("sppl_grp_cd6"))
					.groupBy(DS0D, S0_SPPL.bp_grp_cd6),
				when(boundOr("sppl_grp_flg6", "sppl_grp_cd6"))
					.predicate(DS0D, p -> p.cutoff$and(S0_SPPL.bp_grp_cd6.like(bind("sppl_grp_cd6")))),
				when(boundOr("sppl_grp_flg6"))
					.select(DS0D, S0_SPPL_GRP6.bp_grp_nm.as("sppl_grp_nm6"))
					.groupBy(DS0D, S0_SPPL_GRP6.bp_grp_nm),
				when(boundOr("sppl_grp_flg6", "sppl_grp_nm6"))
					.view(DS0D, v -> v.leftOuterJoin(S0_SPPL_GRP6).on(S0_SPPL.bp_grp_cd6.eq(S0_SPPL_GRP6.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP6.value()).eq(S0_SPPL_GRP6.bp_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_SPPL_GRP6.bp_grp_nm.like(bind("sppl_grp_nm6")))),
				when(boundOr("sppl_grp_flg7"))
					.select(DS0D, S0_SPPL.bp_grp_cd7.as("sppl_grp_cd7"))
					.groupBy(DS0D, S0_SPPL.bp_grp_cd7),
				when(boundOr("sppl_grp_flg7", "sppl_grp_cd7"))
					.predicate(DS0D, p -> p.cutoff$and(S0_SPPL.bp_grp_cd7.like(bind("sppl_grp_cd7")))),
				when(boundOr("sppl_grp_flg7"))
					.select(DS0D, S0_SPPL_GRP7.bp_grp_nm.as("sppl_grp_nm7"))
					.groupBy(DS0D, S0_SPPL_GRP7.bp_grp_nm),
				when(boundOr("sppl_grp_flg7", "sppl_grp_nm7"))
					.view(DS0D, v -> v.leftOuterJoin(S0_SPPL_GRP7).on(S0_SPPL.bp_grp_cd7.eq(S0_SPPL_GRP7.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP7.value()).eq(S0_SPPL_GRP7.bp_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_SPPL_GRP7.bp_grp_nm.like(bind("sppl_grp_nm7")))),
				when(boundOr("sppl_grp_flg8"))
					.select(DS0D, S0_SPPL.bp_grp_cd8.as("sppl_grp_cd8"))
					.groupBy(DS0D, S0_SPPL.bp_grp_cd8),
				when(boundOr("sppl_grp_flg8", "sppl_grp_cd8"))
					.predicate(DS0D, p -> p.cutoff$and(S0_SPPL.bp_grp_cd8.like(bind("sppl_grp_cd8")))),
				when(boundOr("sppl_grp_flg8"))
					.select(DS0D, S0_SPPL_GRP8.bp_grp_nm.as("sppl_grp_nm8"))
					.groupBy(DS0D, S0_SPPL_GRP8.bp_grp_nm),
				when(boundOr("sppl_grp_flg8", "sppl_grp_nm8"))
					.view(DS0D, v -> v.leftOuterJoin(S0_SPPL_GRP8).on(S0_SPPL.bp_grp_cd8.eq(S0_SPPL_GRP8.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP8.value()).eq(S0_SPPL_GRP8.bp_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_SPPL_GRP8.bp_grp_nm.like(bind("sppl_grp_nm8")))),
				when(boundOr("sppl_grp_flg9"))
					.select(DS0D, S0_SPPL.bp_grp_cd9.as("sppl_grp_cd9"))
					.groupBy(DS0D, S0_SPPL.bp_grp_cd9),
				when(boundOr("sppl_grp_flg9", "sppl_grp_cd9"))
					.predicate(DS0D, p -> p.cutoff$and(S0_SPPL.bp_grp_cd9.like(bind("sppl_grp_cd9")))),
				when(boundOr("sppl_grp_flg9"))
					.select(DS0D, S0_SPPL_GRP9.bp_grp_nm.as("sppl_grp_nm9"))
					.groupBy(DS0D, S0_SPPL_GRP9.bp_grp_nm),
				when(boundOr("sppl_grp_flg9", "sppl_grp_nm9"))
					.view(DS0D, v -> v.leftOuterJoin(S0_SPPL_GRP9).on(S0_SPPL.bp_grp_cd9.eq(S0_SPPL_GRP9.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP9.value()).eq(S0_SPPL_GRP9.bp_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_SPPL_GRP9.bp_grp_nm.like(bind("sppl_grp_nm9")))),
				when(boundOr("sppl_grp_flg10"))
					.select(DS0D, S0_SPPL.bp_grp_cd10.as("sppl_grp_cd10"))
					.groupBy(DS0D, S0_SPPL.bp_grp_cd10),
				when(boundOr("sppl_grp_flg10", "sppl_grp_cd10"))
					.predicate(DS0D, p -> p.cutoff$and(S0_SPPL.bp_grp_cd10.like(bind("sppl_grp_cd10")))),
				when(boundOr("sppl_grp_flg10"))
					.select(DS0D, S0_SPPL_GRP10.bp_grp_nm.as("sppl_grp_nm10"))
					.groupBy(DS0D, S0_SPPL_GRP10.bp_grp_nm),
				when(boundOr("sppl_grp_flg10", "sppl_grp_nm10"))
					.view(DS0D, v -> v.leftOuterJoin(S0_SPPL_GRP10).on(S0_SPPL.bp_grp_cd10.eq(S0_SPPL_GRP10.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP10.value()).eq(S0_SPPL_GRP10.bp_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_SPPL_GRP10.bp_grp_nm.like(bind("sppl_grp_nm10")))),
				when(boundOr("trd_nm"))
					.view(DS0D, v -> v.leftOuterJoin(S0_TRD).on(S0_TRD.trd_cd.eq(S0_V1.pr(S2_T9.trd_cd))))
					.predicate(DS0D, p -> p.cutoff$and(S0_TRD.trd_nm.like(bind("trd_nm")))),
				when(boundOr("po_schd_src_typ", "po_schd_src_no"))
					.view(DS0D, v -> v.leftOuterJoin(S0_PO_SCHD).on(S0_PO_SCHD.po_schd_no.eq(S0_V1.pr(S2_T7.po_schd_no))))
					.predicate(DS0D, p -> p.cutoff$and(S0_PO_SCHD.po_schd_src_typ.like(bind("po_schd_src_typ"))).cutoff$and(S0_PO_SCHD.po_schd_src_no.like(bind("po_schd_src_no")))),
				when(boundOr("itm_typ"))
					.predicate(DS0D, p -> p.cutoff$and(S0_ITM.itm_typ.like(bind("itm_typ")))),
				when(boundOr("itm_typ_d_cd"))
					.predicate(DS0D, p -> p.cutoff$and(S0_ITM.itm_typ_d_cd.like(bind("itm_typ_d_cd")))),
				when(boundOr("itm_typ_d_nm"))
					.view(DS0D, v -> v.leftOuterJoin(S0_ITM_TYP_D).on(S0_ITM_TYP_D.itm_typ.eq(S0_ITM.itm_typ).and(S0_ITM_TYP_D.itm_typ_d_cd.eq(S0_ITM.itm_typ_d_cd))))
					.predicate(DS0D, p -> p.cutoff$and(S0_ITM_TYP_D.itm_typ_d_nm.like(bind("itm_typ_d_nm")))),
				when(boundOr("maker_nm"))
					.view(DS0D, v -> v.leftOuterJoin(S0_MAKER).on(S0_MAKER.bp_cd.eq(S0_V1.pr("maker_cd"))))
					.predicate(DS0D, p -> p.cutoff$and(S0_MAKER.bp_nm.like(bind("maker_nm")))),
				when(boundOr("site_cd", "site_nm", "in_to_loc_nm"))
					.view(DS0D, v -> v.leftOuterJoin(S0_IN_TO_LOC).on(S0_IN_TO_LOC.loc_cd.eq(S0_V1.pr("in_to_loc_cd"))).leftOuterJoin(S0_IN_TO_LOC_SITE).on(S0_IN_TO_LOC_SITE.site_cd.eq(S0_IN_TO_LOC.site_cd)))
					.predicate(DS0D, p -> p.cutoff$and(S0_IN_TO_LOC.site_cd.like(bind("site_cd"))).cutoff$and(S0_IN_TO_LOC.loc_nm.like(bind("in_to_loc_nm"))).cutoff$and(S0_IN_TO_LOC_SITE.site_nm.like(bind("site_nm")))),
				when(boundOr("in_to_loc_wg_nm"))
					.view(DS0D, v -> v.leftOuterJoin(S0_IN_TO_LOC_WG).on(S0_IN_TO_LOC_WG.wg_cd.eq(S0_V1.pr("in_to_loc_wg_cd"))))
					.predicate(DS0D, p -> p.cutoff$and(S0_IN_TO_LOC_WG.wg_nm.like(bind("in_to_loc_wg_nm")))),
				when(boundOr("str_ln_nm"))
					.view(DS0D, v -> v.leftOuterJoin(S0_STR_LN).on(S0_STR_LN.loc_cd.eq(S0_V1.pr("in_to_loc_cd")).and(S0_STR_LN.str_ln_cd.eq(S0_V1.pr("str_ln_cd")))))
					.predicate(DS0D, p -> p.cutoff$and(S0_STR_LN.str_ln_nm.like(bind("str_ln_nm")))),
				when(boundOr("ap_dpt_nm"))
					.view(DS0D, v -> v.leftOuterJoin(S0_AP_DPT).on(S0_AP_DPT.dpt_cd.eq(S0_V1.pr(S2_T7.ap_dpt_cd)).and(S0_V1.pr("master_dt").between(S0_AP_DPT.st_dt, S0_AP_DPT.end_dt))))
					.predicate(DS0D, p -> p.cutoff$and(S0_AP_DPT.dpt_nm.like(bind("ap_dpt_nm")))),
				when(boundOr("purc_usr_nm"))
					.view(DS0D, v -> v.leftOuterJoin(S0_USR).on(S0_USR.usr_cd.eq(S0_V1.pr(S2_T9.purc_usr_cd))))
					.predicate(DS0D, p -> p.cutoff$and(S0_USR.usr_nm.like(bind("purc_usr_nm")))),
				when(boundOr("purc_dpt_nm"))
					.view(DS0D, v -> v.leftOuterJoin(S0_DPT).on(S0_DPT.dpt_cd.eq(S0_V1.pr(S2_T9.purc_dpt_cd)).and(S0_V1.pr("master_dt").between(S0_DPT.st_dt, S0_DPT.end_dt))))
					.predicate(DS0D, p -> p.cutoff$and(S0_DPT.dpt_nm.like(bind("purc_dpt_nm")))),
				when(boundOr("purc_dpt_wg_nm"))
					.view(DS0D, v -> v.leftOuterJoin(S0_WG).on(S0_WG.wg_cd.eq(S0_V1.pr("purc_dpt_wg_cd"))))
					.predicate(DS0D, p -> p.cutoff$and(S0_WG.wg_nm.like(bind("purc_dpt_wg_nm"))))
			)
			.setJoinInfo(
				joinInfo(
					j -> j
						.add(MAM_BP_R.class, r -> toCondition(
							r.getStringNE("sppl_cd")
						))
						.addSelect(m -> toArray(
							m.asppl_cd
						))
						.addMap((r, m) -> {
							r.setStringNE("asppl_cd",m.asppl_cd());
							r.setStringNE("join_asppl_cd_", m.asppl_cd());
						}),
					j -> j
						.add(MAM_BP_R.class, r -> toCondition(
							r.getStringNE("join_asppl_cd_")
						))
						.addSelect(m -> toArray(
							m.bsppl_cd
						))
						.addMap((r, m) -> {
							r.setStringNE("bsppl_cd",m.bsppl_cd());
						})
					)
				);
	}

	/**
	 * -- MSBDL0130_MST_PURC_SCHD_Query_S01
	 */
	static MCQueryPlan MSBDL0130_MST_PURC_SCHD_S01() {
		MCTempView S0_V1 = createTempView("V1");
		MAM_TRD_R S0_TRD = MAM_TRD_R.create("TRD");
		MST_PO_SCHD_R S0_PO_SCHD = MST_PO_SCHD_R.create("PO_SCHD");
		MAM_ITM_R S0_ITM = MAM_ITM_R.create("ITM");
		MAM_ITM_GRP_R S0_ITM_GRP1 = MAM_ITM_GRP_R.create("ITM_GRP1");
		MAM_ITM_GRP_R S0_ITM_GRP2 = MAM_ITM_GRP_R.create("ITM_GRP2");
		MAM_ITM_GRP_R S0_ITM_GRP3 = MAM_ITM_GRP_R.create("ITM_GRP3");
		MAM_ITM_GRP_R S0_ITM_GRP4 = MAM_ITM_GRP_R.create("ITM_GRP4");
		MAM_ITM_GRP_R S0_ITM_GRP5 = MAM_ITM_GRP_R.create("ITM_GRP5");
		MAM_ITM_GRP_R S0_ITM_GRP6 = MAM_ITM_GRP_R.create("ITM_GRP6");
		MAM_ITM_GRP_R S0_ITM_GRP7 = MAM_ITM_GRP_R.create("ITM_GRP7");
		MAM_ITM_GRP_R S0_ITM_GRP8 = MAM_ITM_GRP_R.create("ITM_GRP8");
		MAM_ITM_GRP_R S0_ITM_GRP9 = MAM_ITM_GRP_R.create("ITM_GRP9");
		MAM_ITM_GRP_R S0_ITM_GRP10 = MAM_ITM_GRP_R.create("ITM_GRP10");
		MAM_ITM_TYP_D_R S0_ITM_TYP_D = MAM_ITM_TYP_D_R.create("ITM_TYP_D");
		MAM_BP_R S0_SPPL = MAM_BP_R.create("SPPL");
		MAM_BP_GRP_R S0_SPPL_GRP1 = MAM_BP_GRP_R.create("SPPL_GRP1");
		MAM_BP_GRP_R S0_SPPL_GRP2 = MAM_BP_GRP_R.create("SPPL_GRP2");
		MAM_BP_GRP_R S0_SPPL_GRP3 = MAM_BP_GRP_R.create("SPPL_GRP3");
		MAM_BP_GRP_R S0_SPPL_GRP4 = MAM_BP_GRP_R.create("SPPL_GRP4");
		MAM_BP_GRP_R S0_SPPL_GRP5 = MAM_BP_GRP_R.create("SPPL_GRP5");
		MAM_BP_GRP_R S0_SPPL_GRP6 = MAM_BP_GRP_R.create("SPPL_GRP6");
		MAM_BP_GRP_R S0_SPPL_GRP7 = MAM_BP_GRP_R.create("SPPL_GRP7");
		MAM_BP_GRP_R S0_SPPL_GRP8 = MAM_BP_GRP_R.create("SPPL_GRP8");
		MAM_BP_GRP_R S0_SPPL_GRP9 = MAM_BP_GRP_R.create("SPPL_GRP9");
		MAM_BP_GRP_R S0_SPPL_GRP10 = MAM_BP_GRP_R.create("SPPL_GRP10");
		MAVM_BP_NM_R S0_MAKER = MAVM_BP_NM_R.create("MAKER");
		MAM_LOC_R S0_IN_TO_LOC = MAM_LOC_R.create("IN_TO_LOC");
		MAM_SITE_R S0_IN_TO_LOC_SITE = MAM_SITE_R.create("IN_TO_LOC_SITE");
		MAM_WG_R S0_IN_TO_LOC_WG = MAM_WG_R.create("IN_TO_LOC_WG");
		MAM_STR_LN_R S0_STR_LN = MAM_STR_LN_R.create("STR_LN");
		MAM_DPT_R S0_AP_DPT = MAM_DPT_R.create("AP_DPT");
		MAM_USR_R S0_USR = MAM_USR_R.create("USR");
		MAM_DPT_R S0_DPT = MAM_DPT_R.create("DPT");
		MAM_WG_R S0_WG = MAM_WG_R.create("WG");
		MCTempView S1_T4_VIEW = createTempView("T4_VIEW");
		MAVM_RD_DPT_R S1_M0 = MAVM_RD_DPT_R.create("M0");
		MAM_LOC_R S1_M18 = MAM_LOC_R.create("M18");
		MST_PURC_SCHD_R S2_T4 = MST_PURC_SCHD_R.create("T4");
		MST_ARR_SCHD_R S2_T5 = MST_ARR_SCHD_R.create("T5");
		MST_ARR_PR_R S2_T6 = MST_ARR_PR_R.create("T6");
		MST_PO_D_R S2_T7 = MST_PO_D_R.create("T7");
		MST_PO_R S2_T9 = MST_PO_R.create("T9");
		MST_PRMS_RCPT_D_R S2_T10 = MST_PRMS_RCPT_D_R.create("T10");
		MST_DLV_INST_D_R S2_T11 = MST_DLV_INST_D_R.create("T11");
		MST_RCPT_IV_D_R S3 = MST_RCPT_IV_D_R.create();
		MST_PURC_SCHD_R S4_T4 = MST_PURC_SCHD_R.create("T4");
		MST_RCPT_IV_D_R S4_T20 = MST_RCPT_IV_D_R.create("T20");
		MST_RCPT_IV_R S4_T21 = MST_RCPT_IV_R.create("T21");
		MST_ARR_SCHD_R S4_T5 = MST_ARR_SCHD_R.create("T5");
		MST_ARR_PR_R S4_T6 = MST_ARR_PR_R.create("T6");
		MST_PO_D_R S4_T7 = MST_PO_D_R.create("T7");
		MST_PO_R S4_T9 = MST_PO_R.create("T9");
		MST_PRMS_RCPT_D_R S4_T10 = MST_PRMS_RCPT_D_R.create("T10");
		MST_DLV_INST_D_R S4_T11 = MST_DLV_INST_D_R.create("T11");
		MST_SLO_D_R S2_T15 = MST_SLO_D_R.create("T15");
		MST_SLO_D_R S4_T25 = MST_SLO_D_R.create("T25");
		
		
		MCDynamicSQLID DS0D = createDynamicSQLID("DS0D");
		
		return createQueryPlan()
			.setQuery(
				sql("MSBDL0130_MST_PURC_SCHD_Query_S01")
					.mainQuery()
					.select(
						S0_V1.prAll(),
						addDynamicSelect(DS0D)
					)
					.from(
						subQuery()
						.select(
							S1_T4_VIEW.prAll(),
							S1_M18.wg_cd.as("in_to_loc_wg_cd")
						)
						.from(
							subQuery()
							.select(
								S2_T4.purc_schd_no,
								S2_T5.arr_schd_no,
								S2_T4.purc_schd_dt,
								S2_T9.trd_cd,
								S2_T9.trd_ptn_typ,
								S2_T9.edi_flg,
								S2_T9.aprv_no,
								S2_T9.aprv_sts_typ,
								S2_T9.po_no,
								S2_T9.purc_dpt_cd,
								S2_T9.wg_cd.as("purc_dpt_wg_cd"),
								S2_T9.purc_usr_cd,
								S2_T9.sppl_cd,
								MAPA_BP$F_GET_BP_ADDR(
									S2_T9.sppl_cd,
									S2_T4.purc_schd_dt,
									value(MAC_BP_ADDR_TYP.SPPL_CNTCT_DPT.value())
								).as("sppl_cntct_dpt"),
								MAPA_BP$F_GET_BP_ADDR(
									S2_T9.sppl_cd,
									S2_T4.purc_schd_dt,
									value(MAC_BP_ADDR_TYP.SPPL_CNTCT_PSN.value())
								).as("sppl_cntct_psn"),
								MAPA_BP$F_GET_BP_ADDR(
									S2_T9.sppl_cd,
									S2_T4.purc_schd_dt,
									value(MAC_BP_ADDR_TYP.TEL.value())
								).as("sppl_tel"),
								MAPA_BP$F_GET_BP_ADDR(
									S2_T9.sppl_cd,
									S2_T4.purc_schd_dt,
									value(MAC_BP_ADDR_TYP.FAX.value())
								).as("sppl_fax"),
								S2_T9.trd_cur_cd,
								bind("base_cur_cd").as("base_cur_cd"),
								S2_T9.xrate_inpt_flg,
								S2_T9.xrate,
								S2_T9.ptax_xrate_inpt_flg,
								S2_T9.ptax_xrate,
								S2_T4.sub_char1.as("s_sub_char1"),
								S2_T4.sub_char2.as("s_sub_char2"),
								S2_T4.sub_char3.as("s_sub_char3"),
								S2_T4.ins_usr_id,
								S2_T4.ins_usr_nm,
								S2_T4.ins_ts,
								S2_T4.ins_func_id,
								S2_T4.upd_cntr.as("purc_schd_upd_cntr"),
								S2_T4.upd_usr_id,
								S2_T4.upd_usr_nm,
								S2_T4.upd_ts,
								S2_T4.upd_func_id,
								S2_T4.upd_srv_req_no,
								nullValue().as("rcpt_iv_mng_no"),
								nullValue().as("rcpt_iv_no"),
								nullValue().as("rcpt_iv_d_no"),
								S2_T7.po_d_no,
								S2_T7.disp_seq,
								S2_T7.itm_cd,
								S2_T7.itm_sub1,
								S2_T7.itm_sub2,
								S2_T7.itm_sub3,
								S2_T5.lot_no,
								S2_T5.sublot_no,
								S2_T7.sno1,
								S2_T7.sno2,
								S2_T7.sno3,
								S2_T7.sno4,
								S2_T5.quality_typ,
								S2_T5.stk_id_typ,
								S2_T5.stk_insp_typ,
								S2_T5.stk_bp_cd,
								S2_T4.abort_flg,
								S2_T5.gd_cd,
								S2_T5.ver_no,
								S2_T7.itm_nm,
								S2_T7.iv_itm_nm,
								S2_T7.purc_rsn_cd,
								S2_T7.sundry_itm_flg,
								S2_T7.sppl_itm_cd,
								S2_T7.sppl_itm_nm,
								bracket(
										cases()
											.when(S2_T7.dlv_cd.isNotNull())
												.then(S2_T15.cst_itm_cd)
											.otherwise(nullValue())
									).as("cst_itm_cd"),
								bracket(
										cases()
											.when(S2_T7.dlv_cd.isNotNull())
												.then(S2_T15.cst_itm_nm)
											.otherwise(nullValue())
									).as("cst_itm_nm"),
								S2_T7.upri_not_tgt_flg,
								S2_T7.interim_flg,
								S2_T7.tax_cd,
								S2_T7.tax_fix_flg,
								S2_T4.trd_unit_cd,
								S2_T4.trd_unit_schd_qty.as("trd_unit_qty"),
								S2_T4.base_unit_cd,
								S2_T4.base_unit_schd_qty.as("base_unit_qty"),
								trunc(
									S2_T7.dlv_rqst_tm,
									MCDateFmt.DD
								).as("dlv_rqst_dt"),
								trunc(
									S2_T5.arr_schd_tm,
									MCDateFmt.DD
								).as("arr_schd_dt"),
								S2_T7.purc_id_typ,
								S2_T7.ap_dpt_cd,
								S2_T7.maker_cd,
								S2_T5.bp_lot_no,
								S2_T5.arr_loc_cd.as("in_to_loc_cd"),
								S2_T5.str_ln_cd,
								S2_T7.bd_itm_cd,
								S2_T7.bd_itm_sub1,
								S2_T7.bd_itm_sub2,
								S2_T7.bd_itm_sub3,
								S2_T7.bd_sno1,
								S2_T7.bd_sno2,
								S2_T7.bd_sno3,
								S2_T7.bd_sno4,
								S2_T7.bd_loc_cd,
								S2_T7.bd_lot_no,
								S2_T7.bd_sublot_no,
								S2_T7.bd_dpt_cd,
								S2_T7.bd_wg_cd,
								S2_T7.bd_ctg_cd,
								S2_T7.bd_oper_cd,
								S2_T7.bd_slo_no,
								S2_T7.bd_iv_no,
								S2_T7.bd_po_no,
								S2_T7.bd_bp_cd,
								S2_T9.po_print_rmrks,
								S2_T7.po_print_d_rmrks,
								S2_T7.drct_dlv_typ,
								nvl(
									S2_T11.dlv_cd,
									S2_T7.dlv_cd
								).as("dlv_cd"),
								nvl2(
									S2_T11.dlv_cd,
									S2_T11.dlv_sundry_flg,
									S2_T7.dlv_sundry_flg
								).as("dlv_sundry_flg"),
								nvl2(
									S2_T11.dlv_cd,
									S2_T11.dlv_nm,
									S2_T7.dlv_nm
								).as("dlv_nm"),
								nvl2(
									S2_T11.dlv_cd,
									S2_T11.dlv_cntct_dpt,
									S2_T7.dlv_cntct_dpt
								).as("dlv_cntct_dpt"),
								nvl2(
									S2_T11.dlv_cd,
									S2_T11.dlv_cntct_psn,
									S2_T7.dlv_cntct_psn
								).as("dlv_cntct_psn"),
								nvl2(
									S2_T11.dlv_cd,
									S2_T11.dlv_zip_cd,
									S2_T7.dlv_zip_cd
								).as("dlv_zip_cd"),
								nvl2(
									S2_T11.dlv_cd,
									S2_T11.dlv_addr1,
									S2_T7.dlv_addr1
								).as("dlv_addr1"),
								nvl2(
									S2_T11.dlv_cd,
									S2_T11.dlv_addr2,
									S2_T7.dlv_addr2
								).as("dlv_addr2"),
								nvl2(
									S2_T11.dlv_cd,
									S2_T11.dlv_addr3,
									S2_T7.dlv_addr3
								).as("dlv_addr3"),
								nvl2(
									S2_T11.dlv_cd,
									S2_T11.dlv_addr4,
									S2_T7.dlv_addr4
								).as("dlv_addr4"),
								nvl2(
									S2_T11.dlv_cd,
									S2_T11.dlv_tel,
									S2_T7.dlv_tel
								).as("dlv_tel"),
								nvl2(
									S2_T11.dlv_cd,
									S2_T11.dlv_fax,
									S2_T7.dlv_fax
								).as("dlv_fax"),
								nvl(
									S2_T11.tdlv_cd,
									S2_T7.tdlv_cd
								).as("tdlv_cd"),
								nvl2(
									S2_T11.tdlv_cd,
									S2_T11.tdlv_sundry_flg,
									S2_T7.tdlv_sundry_flg
								).as("tdlv_sundry_flg"),
								nvl2(
									S2_T11.tdlv_cd,
									S2_T11.tdlv_nm,
									S2_T7.tdlv_nm
								).as("tdlv_nm"),
								nvl2(
									S2_T11.tdlv_cd,
									S2_T11.tdlv_cntct_dpt,
									S2_T7.tdlv_cntct_dpt
								).as("tdlv_cntct_dpt"),
								nvl2(
									S2_T11.tdlv_cd,
									S2_T11.tdlv_cntct_psn,
									S2_T7.tdlv_cntct_psn
								).as("tdlv_cntct_psn"),
								nvl2(
									S2_T11.tdlv_cd,
									S2_T11.tdlv_zip_cd,
									S2_T7.tdlv_zip_cd
								).as("tdlv_zip_cd"),
								nvl2(
									S2_T11.tdlv_cd,
									S2_T11.tdlv_addr1,
									S2_T7.tdlv_addr1
								).as("tdlv_addr1"),
								nvl2(
									S2_T11.tdlv_cd,
									S2_T11.tdlv_addr2,
									S2_T7.tdlv_addr2
								).as("tdlv_addr2"),
								nvl2(
									S2_T11.tdlv_cd,
									S2_T11.tdlv_addr3,
									S2_T7.tdlv_addr3
								).as("tdlv_addr3"),
								nvl2(
									S2_T11.tdlv_cd,
									S2_T11.tdlv_addr4,
									S2_T7.tdlv_addr4
								).as("tdlv_addr4"),
								nvl2(
									S2_T11.tdlv_cd,
									S2_T11.tdlv_tel,
									S2_T7.tdlv_tel
								).as("tdlv_tel"),
								nvl2(
									S2_T11.tdlv_cd,
									S2_T11.tdlv_fax,
									S2_T7.tdlv_fax
								).as("tdlv_fax"),
								S2_T7.dscnt_rsn_cd,
								S2_T7.pay_crryovr_times,
								S2_T7.outsrc_flg,
								S2_T7.base_unit_qty.as("src_base_unit_qty"),
								MAPA_CALC$F_CALC_PER(
									S2_T4.base_unit_schd_qty,
									S2_T4.base_unit_purc_qty
								).as("purc_prgrs"),
								S2_T4.base_unit_schd_qty,
								S2_T4.base_unit_purc_qty,
								S2_T4.base_unit_abort_qty,
								S2_T4.base_unit_accpt_dfct_qty,
								S2_T5.arr_qty.as("base_unit_arr_qty"),
								nvl(
									S2_T5.arr_ptn_typ,
									value(MSC_ARR_PTN_TYP.NRML.value())
								).as("arr_ptn_typ"),
								S2_T5.purc_act_d_no.as("par_purc_act_d_no"),
								S2_T5.arr_split_flg,
								S2_T6.arr_pr_no,
								S2_T6.upd_cntr.as("arr_pr_upd_cntr"),
								S2_T5.sync_flg,
								S2_T7.purc_basis_typ,
								S2_T7.po_schd_no,
								S2_T7.slo_d_no,
								S2_T7.slo_no,
								S2_T9.po_dt.as("master_dt")
							)
							.from(
								S2_T4
								.innerJoin(S2_T5).on(S2_T4.arr_schd_no.eq(S2_T5.arr_schd_no))
								.innerJoin(S2_T6).on(S2_T4.arr_pr_no.eq(S2_T6.arr_pr_no))
								.innerJoin(S2_T7).on(S2_T6.po_d_no.eq(S2_T7.po_d_no))
								.innerJoin(S2_T9).on(S2_T7.po_no.eq(S2_T9.po_no))
								.leftOuterJoin(S2_T10).on(S2_T10.prms_rcpt_d_no.eq(S2_T5.prms_rcpt_d_no))
								.leftOuterJoin(S2_T11).on(
									S2_T11.dlv_inst_d_no.eq(nvl(
											S2_T5.dlv_inst_d_no,
											S2_T10.dlv_inst_d_no
										)
									)
								)
								.leftOuterJoin(S2_T15).on
									(bracket(
											S2_T15.slo_d_no.eq(S2_T7.slo_d_no)
										)
								)
							)
							.where(
								value(0).eq(value(0))
								.and(S2_T4.non_purc_flg.eq(value(false)))
								.and(S2_T5.rcpt_iv_mng_no.isNull())
								.and(
									bracket(
										S2_T9.aprv_flg.eq(value(false))
									)
									.or(
										S2_T9.aprv_flg.eq(value(true))
										.and(bind("incl_not_aprv_flg").eq(value(false)))
										.and(S2_T9.aprv_sts_typ.eq(value(MAC_APRV_STS_TYP.ACPT.value())))
									)
									.or(
										S2_T9.aprv_flg.eq(value(true))
										.and(bind("incl_not_aprv_flg").eq(value(true)))
									)
								)
								.cutoff$and(
									MAPA_CALC$F_CALC_PER(
										S2_T4.base_unit_schd_qty,
										S2_T4.base_unit_purc_qty
									).gte(bind("purc_prgrs_fr"))
								)
								.cutoff$and(
									MAPA_CALC$F_CALC_PER(
										S2_T4.base_unit_schd_qty,
										S2_T4.base_unit_purc_qty
									).lte(bind("purc_prgrs_to"))
								)
								.cutoff$and(S2_T4.purc_schd_no.like(bind("purc_schd_no")))
								.cutoff$and(S2_T5.arr_ptn_typ.eq(bind("_arr_ptn_typ")))
								.cutoff$and(S2_T5.cmpl_flg.eq(bind("_arr_cmpl_flg")))
								.cutoff$and(S2_T4.cmpl_flg.eq(bind("_purc_cmpl_flg")))
								.cutoff$and(
									bracket(
										value(true).eq(bind("_not_abort_flg"))
										.and(
											S2_T4.purc_schd_no.isNull()
											.or(S2_T4.abort_flg.neq(value(true)))
										)
									)
								)
								
								.cutoff$and(S2_T9.edi_flg.eq(bind("_edi_flg")))
								.cutoff$and(S2_T4.purc_schd_dt.gte(bind("purc_schd_dt_fr")))
								.cutoff$and(S2_T4.purc_schd_dt.lte(bind("purc_schd_dt_to")))
								.cutoff$and(nullValue().like(bind("rcpt_iv_mng_no")))
								.cutoff$and(nullValue().like(bind("rcpt_iv_no")))
								.cutoff$and(nullValue().like(bind("rcpt_iv_d_no")))
								.cutoff$and(S2_T9.sppl_cd.like(bind("sppl_cd")))
								.cutoff$and(S2_T7.itm_cd.like(bind("itm_cd")))
								.cutoff$and(S2_T7.itm_sub1.like(bind("itm_sub1")))
								.cutoff$and(S2_T7.itm_sub2.like(bind("itm_sub2")))
								.cutoff$and(S2_T7.itm_sub3.like(bind("itm_sub3")))
								.cutoff$and(S2_T5.sppl_itm_cd.like(bind("sppl_itm_cd")))
								.cutoff$and(S2_T5.sppl_itm_nm.like(bind("sppl_itm_nm")))
								.cutoff$and(S2_T5.lot_no.like(bind("lot_no")))
								.cutoff$and(S2_T5.sublot_no.like(bind("sublot_no")))
								.cutoff$and(S2_T5.bp_lot_no.like(bind("bp_lot_no")))
								.cutoff$and(S2_T5.sno1.like(bind("sno1")))
								.cutoff$and(S2_T5.sno2.like(bind("sno2")))
								.cutoff$and(S2_T5.sno3.like(bind("sno3")))
								.cutoff$and(S2_T5.sno4.like(bind("sno4")))
								.cutoff$and(S2_T5.ver_no.like(bind("ver_no")))
								.cutoff$and(S2_T7.maker_cd.like(bind("maker_cd")))
								.cutoff$and(S2_T9.purc_usr_cd.like(bind("purc_usr_cd")))
								.cutoff$and(S2_T9.purc_dpt_cd.like(bind("purc_dpt_cd")))
								.cutoff$and(S2_T9.wg_cd.like(bind("purc_dpt_wg_cd")))
								.cutoff$and(S2_T7.ap_dpt_cd.like(bind("ap_dpt_cd")))
								.cutoff$and(S2_T7.po_schd_no.like(bind("po_schd_no")))
								.cutoff$and(S2_T7.po_no.like(bind("po_no")))
								.cutoff$and(S2_T7.po_d_no.like(bind("po_d_no")))
								.cutoff$and(S2_T4.purc_schd_no.like(bind("purc_schd_no")))
								.cutoff$and(S2_T9.trd_cd.like(bind("trd_cd")))
								.and(S2_T7.purc_id_typ.neq(value(MAC_PURC_ID_TYP.VMI.value())))
								.cutoff$and(S2_T7.purc_id_typ.like(bind("purc_id_typ")))
								.cutoff$and(S2_T7.drct_dlv_typ.like(bind("drct_dlv_typ")))
								.cutoff$and(S2_T5.arr_loc_cd.like(bind("in_to_loc_cd")))
								.cutoff$and(S2_T5.str_ln_cd.like(bind("str_ln_cd")))
								.cutoff$and(S2_T4.sub_char1.like(bind("s_sub_char1")))
								.cutoff$and(S2_T4.sub_char2.like(bind("s_sub_char2")))
								.cutoff$and(S2_T4.sub_char3.like(bind("s_sub_char3")))
								.and(
									notExists(
										subQuery()
										.select(value("X"))
										.from(S3)
										.where(
											S3.purc_schd_no.eq(S2_T4.purc_schd_no)
										)
									)
								)
							)
							.unionAll(
								subQuery()
								.select(
									S4_T4.purc_schd_no,
									S4_T5.arr_schd_no,
									S4_T4.purc_schd_dt,
									S4_T20.trd_cd,
									S4_T20.trd_ptn_typ,
									S4_T9.edi_flg,
									S4_T9.aprv_no,
									S4_T9.aprv_sts_typ,
									S4_T20.po_no,
									S4_T20.purc_dpt_cd,
									S4_T20.wg_cd.as("purc_dpt_wg_cd"),
									S4_T20.purc_usr_cd,
									S4_T21.sppl_cd,
									MAPA_BP$F_GET_BP_ADDR(
										S4_T21.sppl_cd,
										S4_T4.purc_schd_dt,
										value(MAC_BP_ADDR_TYP.SPPL_CNTCT_DPT.value())
									).as("sppl_cntct_dpt"),
									MAPA_BP$F_GET_BP_ADDR(
										S4_T21.sppl_cd,
										S4_T4.purc_schd_dt,
										value(MAC_BP_ADDR_TYP.SPPL_CNTCT_PSN.value())
									).as("sppl_cntct_psn"),
									MAPA_BP$F_GET_BP_ADDR(
										S4_T21.sppl_cd,
										S4_T4.purc_schd_dt,
										value(MAC_BP_ADDR_TYP.TEL.value())
									).as("sppl_tel"),
									MAPA_BP$F_GET_BP_ADDR(
										S4_T21.sppl_cd,
										S4_T4.purc_schd_dt,
										value(MAC_BP_ADDR_TYP.FAX.value())
									).as("sppl_fax"),
									S4_T21.trd_cur_cd,
									bind("base_cur_cd").as("base_cur_cd"),
									S4_T21.xrate_inpt_flg,
									S4_T21.xrate,
									S4_T21.ptax_xrate_inpt_flg,
									S4_T21.ptax_xrate,
									S4_T4.sub_char1.as("s_sub_char1"),
									S4_T4.sub_char2.as("s_sub_char2"),
									S4_T4.sub_char3.as("s_sub_char3"),
									S4_T4.ins_usr_id,
									S4_T4.ins_usr_nm,
									S4_T4.ins_ts,
									S4_T4.ins_func_id,
									S4_T4.upd_cntr.as("purc_schd_upd_cntr"),
									S4_T4.upd_usr_id,
									S4_T4.upd_usr_nm,
									S4_T4.upd_ts,
									S4_T4.upd_func_id,
									S4_T4.upd_srv_req_no,
									S4_T21.rcpt_iv_mng_no,
									S4_T21.rcpt_iv_no,
									S4_T20.rcpt_iv_d_no,
									S4_T20.po_d_no,
									S4_T7.disp_seq,
									S4_T20.itm_cd,
									S4_T20.itm_sub1,
									S4_T20.itm_sub2,
									S4_T20.itm_sub3,
									S4_T5.lot_no,
									S4_T5.sublot_no,
									S4_T20.sno1,
									S4_T20.sno2,
									S4_T20.sno3,
									S4_T20.sno4,
									S4_T5.quality_typ,
									S4_T5.stk_id_typ,
									S4_T5.stk_insp_typ,
									S4_T5.stk_bp_cd,
									S4_T4.abort_flg,
									S4_T5.gd_cd,
									S4_T5.ver_no,
									S4_T20.itm_nm,
									S4_T20.iv_itm_nm,
									S4_T20.purc_rsn_cd,
									S4_T20.sundry_itm_flg,
									S4_T20.sppl_itm_cd,
									S4_T20.sppl_itm_nm,
									bracket(
											cases()
												.when(S4_T7.dlv_cd.isNotNull())
													.then(S4_T25.cst_itm_cd)
												.otherwise(nullValue())
										).as("cst_itm_cd"),
									bracket(
											cases()
												.when(S4_T7.dlv_cd.isNotNull())
													.then(S4_T25.cst_itm_nm)
												.otherwise(nullValue())
										).as("cst_itm_nm"),
									S4_T7.upri_not_tgt_flg,
									S4_T7.interim_flg,
									S4_T20.tax_cd,
									S4_T20.tax_fix_flg,
									S4_T4.trd_unit_cd,
									S4_T4.trd_unit_schd_qty.as("trd_unit_qty"),
									S4_T4.base_unit_cd,
									S4_T4.base_unit_schd_qty.as("base_unit_qty"),
									trunc(
										S4_T7.dlv_rqst_tm,
										MCDateFmt.DD
									).as("dlv_rqst_dt"),
									trunc(
										S4_T5.arr_schd_tm,
										MCDateFmt.DD
									).as("arr_schd_dt"),
									S4_T20.purc_id_typ,
									S4_T20.ap_dpt_cd,
									S4_T20.maker_cd,
									S4_T5.bp_lot_no,
									S4_T5.arr_loc_cd.as("in_to_loc_cd"),
									S4_T5.str_ln_cd,
									S4_T20.bd_itm_cd,
									S4_T20.bd_itm_sub1,
									S4_T20.bd_itm_sub2,
									S4_T20.bd_itm_sub3,
									S4_T20.bd_sno1,
									S4_T20.bd_sno2,
									S4_T20.bd_sno3,
									S4_T20.bd_sno4,
									S4_T20.bd_loc_cd,
									S4_T20.bd_lot_no,
									S4_T20.bd_sublot_no,
									S4_T20.bd_dpt_cd,
									S4_T20.bd_wg_cd,
									S4_T20.bd_ctg_cd,
									S4_T20.bd_oper_cd,
									S4_T20.bd_slo_no,
									S4_T20.bd_iv_no,
									S4_T20.bd_po_no,
									S4_T20.bd_bp_cd,
									S4_T9.po_print_rmrks,
									S4_T7.po_print_d_rmrks,
									S4_T7.drct_dlv_typ,
									nvl(
										S4_T11.dlv_cd,
										S4_T7.dlv_cd
									).as("dlv_cd"),
									nvl2(
										S4_T11.dlv_cd,
										S4_T11.dlv_sundry_flg,
										S4_T7.dlv_sundry_flg
									).as("dlv_sundry_flg"),
									nvl2(
										S4_T11.dlv_cd,
										S4_T11.dlv_nm,
										S4_T7.dlv_nm
									).as("dlv_nm"),
									nvl2(
										S4_T11.dlv_cd,
										S4_T11.dlv_cntct_dpt,
										S4_T7.dlv_cntct_dpt
									).as("dlv_cntct_dpt"),
									nvl2(
										S4_T11.dlv_cd,
										S4_T11.dlv_cntct_psn,
										S4_T7.dlv_cntct_psn
									).as("dlv_cntct_psn"),
									nvl2(
										S4_T11.dlv_cd,
										S4_T11.dlv_zip_cd,
										S4_T7.dlv_zip_cd
									).as("dlv_zip_cd"),
									nvl2(
										S4_T11.dlv_cd,
										S4_T11.dlv_addr1,
										S4_T7.dlv_addr1
									).as("dlv_addr1"),
									nvl2(
										S4_T11.dlv_cd,
										S4_T11.dlv_addr2,
										S4_T7.dlv_addr2
									).as("dlv_addr2"),
									nvl2(
										S4_T11.dlv_cd,
										S4_T11.dlv_addr3,
										S4_T7.dlv_addr3
									).as("dlv_addr3"),
									nvl2(
										S4_T11.dlv_cd,
										S4_T11.dlv_addr4,
										S4_T7.dlv_addr4
									).as("dlv_addr4"),
									nvl2(
										S4_T11.dlv_cd,
										S4_T11.dlv_tel,
										S4_T7.dlv_tel
									).as("dlv_tel"),
									nvl2(
										S4_T11.dlv_cd,
										S4_T11.dlv_fax,
										S4_T7.dlv_fax
									).as("dlv_fax"),
									nvl(
										S4_T11.tdlv_cd,
										S4_T7.tdlv_cd
									).as("tdlv_cd"),
									nvl2(
										S4_T11.tdlv_cd,
										S4_T11.tdlv_sundry_flg,
										S4_T7.tdlv_sundry_flg
									).as("tdlv_sundry_flg"),
									nvl2(
										S4_T11.tdlv_cd,
										S4_T11.tdlv_nm,
										S4_T7.tdlv_nm
									).as("tdlv_nm"),
									nvl2(
										S4_T11.tdlv_cd,
										S4_T11.tdlv_cntct_dpt,
										S4_T7.tdlv_cntct_dpt
									).as("tdlv_cntct_dpt"),
									nvl2(
										S4_T11.tdlv_cd,
										S4_T11.tdlv_cntct_psn,
										S4_T7.tdlv_cntct_psn
									).as("tdlv_cntct_psn"),
									nvl2(
										S4_T11.tdlv_cd,
										S4_T11.tdlv_zip_cd,
										S4_T7.tdlv_zip_cd
									).as("tdlv_zip_cd"),
									nvl2(
										S4_T11.tdlv_cd,
										S4_T11.tdlv_addr1,
										S4_T7.tdlv_addr1
									).as("tdlv_addr1"),
									nvl2(
										S4_T11.tdlv_cd,
										S4_T11.tdlv_addr2,
										S4_T7.tdlv_addr2
									).as("tdlv_addr2"),
									nvl2(
										S4_T11.tdlv_cd,
										S4_T11.tdlv_addr3,
										S4_T7.tdlv_addr3
									).as("tdlv_addr3"),
									nvl2(
										S4_T11.tdlv_cd,
										S4_T11.tdlv_addr4,
										S4_T7.tdlv_addr4
									).as("tdlv_addr4"),
									nvl2(
										S4_T11.tdlv_cd,
										S4_T11.tdlv_tel,
										S4_T7.tdlv_tel
									).as("tdlv_tel"),
									nvl2(
										S4_T11.tdlv_cd,
										S4_T11.tdlv_fax,
										S4_T7.tdlv_fax
									).as("tdlv_fax"),
									S4_T7.dscnt_rsn_cd,
									S4_T7.pay_crryovr_times,
									S4_T7.outsrc_flg,
									S4_T7.base_unit_qty.as("src_base_unit_qty"),
									MAPA_CALC$F_CALC_PER(
										S4_T4.base_unit_schd_qty,
										S4_T4.base_unit_purc_qty
									).as("purc_prgrs"),
									S4_T4.base_unit_schd_qty,
									S4_T4.base_unit_purc_qty,
									S4_T4.base_unit_abort_qty,
									S4_T4.base_unit_accpt_dfct_qty,
									S4_T5.arr_qty.as("base_unit_arr_qty"),
									nvl(
										S4_T5.arr_ptn_typ,
										value(MSC_ARR_PTN_TYP.NRML.value())
									).as("arr_ptn_typ"),
									S4_T5.purc_act_d_no.as("par_purc_act_d_no"),
									S4_T5.arr_split_flg,
									S4_T6.arr_pr_no,
									S4_T6.upd_cntr.as("arr_pr_upd_cntr"),
									S4_T5.sync_flg,
									S4_T7.purc_basis_typ,
									S4_T7.po_schd_no,
									S4_T20.slo_d_no,
									S4_T20.slo_no,
									S4_T21.iv_dt.as("master_dt")
								)
								.from(
									S4_T4
									.innerJoin(S4_T20).on(S4_T4.purc_schd_no.eq(S4_T20.purc_schd_no))
									.innerJoin(S4_T21).on(S4_T20.rcpt_iv_mng_no.eq(S4_T21.rcpt_iv_mng_no))
									.leftOuterJoin(S4_T5).on(S4_T4.arr_schd_no.eq(S4_T5.arr_schd_no))
									.leftOuterJoin(S4_T6).on(S4_T4.arr_pr_no.eq(S4_T6.arr_pr_no))
									.leftOuterJoin(S4_T7).on(S4_T20.po_d_no.eq(S4_T7.po_d_no))
									.leftOuterJoin(S4_T9).on(S4_T20.po_no.eq(S4_T9.po_no))
									.leftOuterJoin(S4_T10).on(
										S4_T10.prms_rcpt_d_no.eq(nvl(
												S4_T5.prms_rcpt_d_no,
												S4_T20.ref_prms_rcpt_d_no
											)
										)
									)
									.leftOuterJoin(S4_T11).on(
										S4_T11.dlv_inst_d_no.eq(coalesce(
												S4_T5.dlv_inst_d_no,
												S4_T10.dlv_inst_d_no,
												S4_T20.ref_dlv_inst_d_no
											)
										)
									)
									.leftOuterJoin(S4_T25).on
										(bracket(
												S4_T25.slo_d_no.eq(S4_T7.slo_d_no)
											)
									)
								)
								.where(
									value(0).eq(value(0))
									.and(S4_T4.non_purc_flg.eq(value(false)))
									.and(
										bracket(
											S4_T9.aprv_flg.eq(value(false))
											.or(S4_T9.aprv_flg.isNull())
										)
										.or(
											S4_T9.aprv_flg.eq(value(true))
											.and(bind("incl_not_aprv_flg").eq(value(false)))
											.and(S4_T9.aprv_sts_typ.eq(value(MAC_APRV_STS_TYP.ACPT.value())))
										)
										.or(
											S4_T9.aprv_flg.eq(value(true))
											.and(bind("incl_not_aprv_flg").eq(value(true)))
										)
									)
									.cutoff$and(
										MAPA_CALC$F_CALC_PER(
											S4_T4.base_unit_schd_qty,
											S4_T4.base_unit_purc_qty
										).gte(bind("purc_prgrs_fr"))
									)
									.cutoff$and(
										MAPA_CALC$F_CALC_PER(
											S4_T4.base_unit_schd_qty,
											S4_T4.base_unit_purc_qty
										).lte(bind("purc_prgrs_to"))
									)
									.cutoff$and(S4_T4.purc_schd_no.like(bind("purc_schd_no")))
									.cutoff$and(S4_T5.arr_ptn_typ.eq(bind("_arr_ptn_typ")))
									.cutoff$and(S4_T5.cmpl_flg.eq(bind("_arr_cmpl_flg")))
									.cutoff$and(S4_T4.cmpl_flg.eq(bind("_purc_cmpl_flg")))
									.cutoff$and(
										bracket(
											value(true).eq(bind("_not_abort_flg"))
											.and(
												S4_T4.purc_schd_no.isNull()
												.or(S4_T4.abort_flg.neq(value(true)))
											)
										)
									)
									.cutoff$and(S4_T9.edi_flg.eq(bind("_edi_flg")))
									.cutoff$and(S4_T4.purc_schd_dt.gte(bind("purc_schd_dt_fr")))
									.cutoff$and(S4_T4.purc_schd_dt.lte(bind("purc_schd_dt_to")))
									.cutoff$and(S4_T21.rcpt_iv_mng_no.like(bind("rcpt_iv_mng_no")))
									.cutoff$and(S4_T21.rcpt_iv_no.like(bind("rcpt_iv_no")))
									.cutoff$and(S4_T20.rcpt_iv_d_no.like(bind("rcpt_iv_d_no")))
									.cutoff$and(S4_T21.sppl_cd.like(bind("sppl_cd")))
									.cutoff$and(S4_T20.itm_cd.like(bind("itm_cd")))
									.cutoff$and(S4_T20.itm_sub1.like(bind("itm_sub1")))
									.cutoff$and(S4_T20.itm_sub2.like(bind("itm_sub2")))
									.cutoff$and(S4_T20.itm_sub3.like(bind("itm_sub3")))
									.cutoff$and(S4_T20.sppl_itm_cd.like(bind("sppl_itm_cd")))
									.cutoff$and(S4_T20.sppl_itm_nm.like(bind("sppl_itm_nm")))
									.cutoff$and(S4_T5.lot_no.like(bind("lot_no")))
									.cutoff$and(S4_T5.sublot_no.like(bind("sublot_no")))
									.cutoff$and(S4_T5.bp_lot_no.like(bind("bp_lot_no")))
									.cutoff$and(S4_T20.sno1.like(bind("sno1")))
									.cutoff$and(S4_T20.sno2.like(bind("sno2")))
									.cutoff$and(S4_T20.sno3.like(bind("sno3")))
									.cutoff$and(S4_T20.sno4.like(bind("sno4")))
									.cutoff$and(S4_T5.ver_no.like(bind("ver_no")))
									.cutoff$and(S4_T20.maker_cd.like(bind("maker_cd")))
									.cutoff$and(S4_T20.purc_usr_cd.like(bind("purc_usr_cd")))
									.cutoff$and(S4_T20.purc_dpt_cd.like(bind("purc_dpt_cd")))
									.cutoff$and(S4_T20.wg_cd.like(bind("purc_dpt_wg_cd")))
									.cutoff$and(S4_T20.ap_dpt_cd.like(bind("ap_dpt_cd")))
									.cutoff$and(S4_T7.po_schd_no.like(bind("po_schd_no")))
									.cutoff$and(S4_T20.po_no.like(bind("po_no")))
									.cutoff$and(S4_T20.po_d_no.like(bind("po_d_no")))
									.cutoff$and(S4_T4.purc_schd_no.like(bind("purc_schd_no")))
									.cutoff$and(S4_T20.trd_cd.like(bind("trd_cd")))
									.and(S4_T20.purc_id_typ.neq(value(MAC_PURC_ID_TYP.VMI.value())))
									.cutoff$and(S4_T20.purc_id_typ.like(bind("purc_id_typ")))
									.cutoff$and(S4_T7.drct_dlv_typ.like(bind("drct_dlv_typ")))
									.cutoff$and(S4_T5.arr_loc_cd.like(bind("in_to_loc_cd")))
									.cutoff$and(S4_T5.str_ln_cd.like(bind("str_ln_cd")))
									.cutoff$and(S4_T4.sub_char1.like(bind("s_sub_char1")))
									.cutoff$and(S4_T4.sub_char2.like(bind("s_sub_char2")))
									.cutoff$and(S4_T4.sub_char3.like(bind("s_sub_char3")))
								)
							).view(S1_T4_VIEW)
							.innerJoin(S1_M0).on(S1_T4_VIEW.pr(S2_T9.purc_dpt_cd).eq(S1_M0.dpt_cd))
							.leftOuterJoin(S1_M18).on(S1_T4_VIEW.pr("in_to_loc_cd").eq(S1_M18.loc_cd))
						)
						.where(
							value(0).eq(value(0))
							.cutoff$and(S1_M18.wg_cd.like(bind("in_to_loc_wg_cd")))
						).view(S0_V1)
						.addDynamicView(DS0D)
					)
					.where(
						value(0).eq(value(0))
						.addDynamicPredicate(DS0D)
					)
					.orderBy(
						S0_V1.pr("purc_schd_no").asc(),
						S0_V1.pr("disp_seq").asc()
					)
			)
			.setDynamicSQLInfo(
				when(boundOr("itm_nm", "itm_typ", "itm_typ_d_cd", "itm_typ_d_nm", "itm_grp_flg1", "itm_grp_flg2", "itm_grp_flg3", "itm_grp_flg4", "itm_grp_flg5", "itm_grp_flg6", "itm_grp_flg7", "itm_grp_flg8", "itm_grp_flg9", "itm_grp_flg10"))
					.view(DS0D, v -> v.leftOuterJoin(S0_ITM).on(S0_ITM.itm_cd.eq(S0_V1.pr("itm_cd")).and(S0_ITM.itm_sub1.eq(S0_V1.pr("itm_sub1"))).and(S0_ITM.itm_sub2.eq(S0_V1.pr("itm_sub2"))).and(S0_ITM.itm_sub3.eq(S0_V1.pr("itm_sub3")))))
					.predicate(DS0D, p -> p.cutoff$and(nvl(S0_V1.pr("itm_nm"),S0_ITM.itm_nm).like(bind("itm_nm")))),
				when(boundOr("itm_grp_flg1"))
					.select(DS0D, S0_ITM.itm_grp_cd1.as("itm_grp_cd1"))
					.groupBy(DS0D, S0_ITM.itm_grp_cd1),
				when(boundOr("itm_grp_flg1", "itm_grp_cd1"))
					.predicate(DS0D, p -> p.cutoff$and(S0_ITM.itm_grp_cd1.like(bind("itm_grp_cd1")))),
				when(boundOr("itm_grp_flg1"))
					.select(DS0D, S0_ITM_GRP1.itm_grp_nm.as("itm_grp_nm1"))
					.groupBy(DS0D, S0_ITM_GRP1.itm_grp_nm),
				when(boundOr("itm_grp_flg1", "itm_grp_nm1"))
					.view(DS0D, v -> v.leftOuterJoin(S0_ITM_GRP1).on(S0_ITM.itm_grp_cd1.eq(S0_ITM_GRP1.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP1.value()).eq(S0_ITM_GRP1.itm_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_ITM_GRP1.itm_grp_nm.like(bind("itm_grp_nm1")))),
				when(boundOr("itm_grp_flg2"))
					.select(DS0D, S0_ITM.itm_grp_cd2.as("itm_grp_cd2"))
					.groupBy(DS0D, S0_ITM.itm_grp_cd2),
				when(boundOr("itm_grp_flg2", "itm_grp_cd2"))
					.predicate(DS0D, p -> p.cutoff$and(S0_ITM.itm_grp_cd2.like(bind("itm_grp_cd2")))),
				when(boundOr("itm_grp_flg2"))
					.select(DS0D, S0_ITM_GRP2.itm_grp_nm.as("itm_grp_nm2"))
					.groupBy(DS0D, S0_ITM_GRP2.itm_grp_nm),
				when(boundOr("itm_grp_flg2", "itm_grp_nm2"))
					.view(DS0D, v -> v.leftOuterJoin(S0_ITM_GRP2).on(S0_ITM.itm_grp_cd2.eq(S0_ITM_GRP2.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP2.value()).eq(S0_ITM_GRP2.itm_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_ITM_GRP2.itm_grp_nm.like(bind("itm_grp_nm2")))),
				when(boundOr("itm_grp_flg3"))
					.select(DS0D, S0_ITM.itm_grp_cd3.as("itm_grp_cd3"))
					.groupBy(DS0D, S0_ITM.itm_grp_cd3),
				when(boundOr("itm_grp_flg3", "itm_grp_cd3"))
					.predicate(DS0D, p -> p.cutoff$and(S0_ITM.itm_grp_cd3.like(bind("itm_grp_cd3")))),
				when(boundOr("itm_grp_flg3"))
					.select(DS0D, S0_ITM_GRP3.itm_grp_nm.as("itm_grp_nm3"))
					.groupBy(DS0D, S0_ITM_GRP3.itm_grp_nm),
				when(boundOr("itm_grp_flg3", "itm_grp_nm3"))
					.view(DS0D, v -> v.leftOuterJoin(S0_ITM_GRP3).on(S0_ITM.itm_grp_cd3.eq(S0_ITM_GRP3.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP3.value()).eq(S0_ITM_GRP3.itm_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_ITM_GRP3.itm_grp_nm.like(bind("itm_grp_nm3")))),
				when(boundOr("itm_grp_flg4"))
					.select(DS0D, S0_ITM.itm_grp_cd4.as("itm_grp_cd4"))
					.groupBy(DS0D, S0_ITM.itm_grp_cd4),
				when(boundOr("itm_grp_flg4", "itm_grp_cd4"))
					.predicate(DS0D, p -> p.cutoff$and(S0_ITM.itm_grp_cd4.like(bind("itm_grp_cd4")))),
				when(boundOr("itm_grp_flg4"))
					.select(DS0D, S0_ITM_GRP4.itm_grp_nm.as("itm_grp_nm4"))
					.groupBy(DS0D, S0_ITM_GRP4.itm_grp_nm),
				when(boundOr("itm_grp_flg4", "itm_grp_nm4"))
					.view(DS0D, v -> v.leftOuterJoin(S0_ITM_GRP4).on(S0_ITM.itm_grp_cd4.eq(S0_ITM_GRP4.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP4.value()).eq(S0_ITM_GRP4.itm_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_ITM_GRP4.itm_grp_nm.like(bind("itm_grp_nm4")))),
				when(boundOr("itm_grp_flg5"))
					.select(DS0D, S0_ITM.itm_grp_cd5.as("itm_grp_cd5"))
					.groupBy(DS0D, S0_ITM.itm_grp_cd5),
				when(boundOr("itm_grp_flg5", "itm_grp_cd5"))
					.predicate(DS0D, p -> p.cutoff$and(S0_ITM.itm_grp_cd5.like(bind("itm_grp_cd5")))),
				when(boundOr("itm_grp_flg5"))
					.select(DS0D, S0_ITM_GRP5.itm_grp_nm.as("itm_grp_nm5"))
					.groupBy(DS0D, S0_ITM_GRP5.itm_grp_nm),
				when(boundOr("itm_grp_flg5", "itm_grp_nm5"))
					.view(DS0D, v -> v.leftOuterJoin(S0_ITM_GRP5).on(S0_ITM.itm_grp_cd5.eq(S0_ITM_GRP5.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP5.value()).eq(S0_ITM_GRP5.itm_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_ITM_GRP5.itm_grp_nm.like(bind("itm_grp_nm5")))),
				when(boundOr("itm_grp_flg6"))
					.select(DS0D, S0_ITM.itm_grp_cd6.as("itm_grp_cd6"))
					.groupBy(DS0D, S0_ITM.itm_grp_cd6),
				when(boundOr("itm_grp_flg6", "itm_grp_cd6"))
					.predicate(DS0D, p -> p.cutoff$and(S0_ITM.itm_grp_cd6.like(bind("itm_grp_cd6")))),
				when(boundOr("itm_grp_flg6"))
					.select(DS0D, S0_ITM_GRP6.itm_grp_nm.as("itm_grp_nm6"))
					.groupBy(DS0D, S0_ITM_GRP6.itm_grp_nm),
				when(boundOr("itm_grp_flg6", "itm_grp_nm6"))
					.view(DS0D, v -> v.leftOuterJoin(S0_ITM_GRP6).on(S0_ITM.itm_grp_cd6.eq(S0_ITM_GRP6.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP6.value()).eq(S0_ITM_GRP6.itm_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_ITM_GRP6.itm_grp_nm.like(bind("itm_grp_nm6")))),
				when(boundOr("itm_grp_flg7"))
					.select(DS0D, S0_ITM.itm_grp_cd7.as("itm_grp_cd7"))
					.groupBy(DS0D, S0_ITM.itm_grp_cd7),
				when(boundOr("itm_grp_flg7", "itm_grp_cd7"))
					.predicate(DS0D, p -> p.cutoff$and(S0_ITM.itm_grp_cd7.like(bind("itm_grp_cd7")))),
				when(boundOr("itm_grp_flg7"))
					.select(DS0D, S0_ITM_GRP7.itm_grp_nm.as("itm_grp_nm7"))
					.groupBy(DS0D, S0_ITM_GRP7.itm_grp_nm),
				when(boundOr("itm_grp_flg7", "itm_grp_nm7"))
					.view(DS0D, v -> v.leftOuterJoin(S0_ITM_GRP7).on(S0_ITM.itm_grp_cd7.eq(S0_ITM_GRP7.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP7.value()).eq(S0_ITM_GRP7.itm_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_ITM_GRP7.itm_grp_nm.like(bind("itm_grp_nm7")))),
				when(boundOr("itm_grp_flg8"))
					.select(DS0D, S0_ITM.itm_grp_cd8.as("itm_grp_cd8"))
					.groupBy(DS0D, S0_ITM.itm_grp_cd8),
				when(boundOr("itm_grp_flg8", "itm_grp_cd8"))
					.predicate(DS0D, p -> p.cutoff$and(S0_ITM.itm_grp_cd8.like(bind("itm_grp_cd8")))),
				when(boundOr("itm_grp_flg8"))
					.select(DS0D, S0_ITM_GRP8.itm_grp_nm.as("itm_grp_nm8"))
					.groupBy(DS0D, S0_ITM_GRP8.itm_grp_nm),
				when(boundOr("itm_grp_flg8", "itm_grp_nm8"))
					.view(DS0D, v -> v.leftOuterJoin(S0_ITM_GRP8).on(S0_ITM.itm_grp_cd8.eq(S0_ITM_GRP8.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP8.value()).eq(S0_ITM_GRP8.itm_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_ITM_GRP8.itm_grp_nm.like(bind("itm_grp_nm8")))),
				when(boundOr("itm_grp_flg9"))
					.select(DS0D, S0_ITM.itm_grp_cd9.as("itm_grp_cd9"))
					.groupBy(DS0D, S0_ITM.itm_grp_cd9),
				when(boundOr("itm_grp_flg9", "itm_grp_cd9"))
					.predicate(DS0D, p -> p.cutoff$and(S0_ITM.itm_grp_cd9.like(bind("itm_grp_cd9")))),
				when(boundOr("itm_grp_flg9"))
					.select(DS0D, S0_ITM_GRP9.itm_grp_nm.as("itm_grp_nm9"))
					.groupBy(DS0D, S0_ITM_GRP9.itm_grp_nm),
				when(boundOr("itm_grp_flg9", "itm_grp_nm9"))
					.view(DS0D, v -> v.leftOuterJoin(S0_ITM_GRP9).on(S0_ITM.itm_grp_cd9.eq(S0_ITM_GRP9.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP9.value()).eq(S0_ITM_GRP9.itm_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_ITM_GRP9.itm_grp_nm.like(bind("itm_grp_nm9")))),
				when(boundOr("itm_grp_flg10"))
					.select(DS0D, S0_ITM.itm_grp_cd10.as("itm_grp_cd10"))
					.groupBy(DS0D, S0_ITM.itm_grp_cd10),
				when(boundOr("itm_grp_flg10", "itm_grp_cd10"))
					.predicate(DS0D, p -> p.cutoff$and(S0_ITM.itm_grp_cd10.like(bind("itm_grp_cd10")))),
				when(boundOr("itm_grp_flg10"))
					.select(DS0D, S0_ITM_GRP10.itm_grp_nm.as("itm_grp_nm10"))
					.groupBy(DS0D, S0_ITM_GRP10.itm_grp_nm),
				when(boundOr("itm_grp_flg10", "itm_grp_nm10"))
					.view(DS0D, v -> v.leftOuterJoin(S0_ITM_GRP10).on(S0_ITM.itm_grp_cd10.eq(S0_ITM_GRP10.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP10.value()).eq(S0_ITM_GRP10.itm_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_ITM_GRP10.itm_grp_nm.like(bind("itm_grp_nm10")))),
				when(boundOr("sppl_nm", "_iv_flg", "sppl_grp_flg1", "sppl_grp_flg2", "sppl_grp_flg3", "sppl_grp_flg4", "sppl_grp_flg5", "sppl_grp_flg6", "sppl_grp_flg7", "sppl_grp_flg8", "sppl_grp_flg9", "sppl_grp_flg10"))
					.view(DS0D, v -> v.leftOuterJoin(S0_SPPL).on(S0_SPPL.bp_cd.eq(S0_V1.pr("sppl_cd"))))
					.predicate(DS0D, p -> p.cutoff$and(S0_SPPL.sppl_iv_flg.eq(bind("_iv_flg"))).cutoff$and(S0_SPPL.bp_nm.like(bind("sppl_nm")))),
				when(boundOr("sppl_grp_flg1"))
					.select(DS0D, S0_SPPL.bp_grp_cd1.as("sppl_grp_cd1"))
					.groupBy(DS0D, S0_SPPL.bp_grp_cd1),
				when(boundOr("sppl_grp_flg1", "sppl_grp_cd1"))
					.predicate(DS0D, p -> p.cutoff$and(S0_SPPL.bp_grp_cd1.like(bind("sppl_grp_cd1")))),
				when(boundOr("sppl_grp_flg1"))
					.select(DS0D, S0_SPPL_GRP1.bp_grp_nm.as("sppl_grp_nm1"))
					.groupBy(DS0D, S0_SPPL_GRP1.bp_grp_nm),
				when(boundOr("sppl_grp_flg1", "sppl_grp_nm1"))
					.view(DS0D, v -> v.leftOuterJoin(S0_SPPL_GRP1).on(S0_SPPL.bp_grp_cd1.eq(S0_SPPL_GRP1.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP1.value()).eq(S0_SPPL_GRP1.bp_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_SPPL_GRP1.bp_grp_nm.like(bind("sppl_grp_nm1")))),
				when(boundOr("sppl_grp_flg2"))
					.select(DS0D, S0_SPPL.bp_grp_cd2.as("sppl_grp_cd2"))
					.groupBy(DS0D, S0_SPPL.bp_grp_cd2),
				when(boundOr("sppl_grp_flg2", "sppl_grp_cd2"))
					.predicate(DS0D, p -> p.cutoff$and(S0_SPPL.bp_grp_cd2.like(bind("sppl_grp_cd2")))),
				when(boundOr("sppl_grp_flg2"))
					.select(DS0D, S0_SPPL_GRP2.bp_grp_nm.as("sppl_grp_nm2"))
					.groupBy(DS0D, S0_SPPL_GRP2.bp_grp_nm),
				when(boundOr("sppl_grp_flg2", "sppl_grp_nm2"))
					.view(DS0D, v -> v.leftOuterJoin(S0_SPPL_GRP2).on(S0_SPPL.bp_grp_cd2.eq(S0_SPPL_GRP2.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP2.value()).eq(S0_SPPL_GRP2.bp_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_SPPL_GRP2.bp_grp_nm.like(bind("sppl_grp_nm2")))),
				when(boundOr("sppl_grp_flg3"))
					.select(DS0D, S0_SPPL.bp_grp_cd3.as("sppl_grp_cd3"))
					.groupBy(DS0D, S0_SPPL.bp_grp_cd3),
				when(boundOr("sppl_grp_flg3", "sppl_grp_cd3"))
					.predicate(DS0D, p -> p.cutoff$and(S0_SPPL.bp_grp_cd3.like(bind("sppl_grp_cd3")))),
				when(boundOr("sppl_grp_flg3"))
					.select(DS0D, S0_SPPL_GRP3.bp_grp_nm.as("sppl_grp_nm3"))
					.groupBy(DS0D, S0_SPPL_GRP3.bp_grp_nm),
				when(boundOr("sppl_grp_flg3", "sppl_grp_nm3"))
					.view(DS0D, v -> v.leftOuterJoin(S0_SPPL_GRP3).on(S0_SPPL.bp_grp_cd3.eq(S0_SPPL_GRP3.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP3.value()).eq(S0_SPPL_GRP3.bp_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_SPPL_GRP3.bp_grp_nm.like(bind("sppl_grp_nm3")))),
				when(boundOr("sppl_grp_flg4"))
					.select(DS0D, S0_SPPL.bp_grp_cd4.as("sppl_grp_cd4"))
					.groupBy(DS0D, S0_SPPL.bp_grp_cd4),
				when(boundOr("sppl_grp_flg4", "sppl_grp_cd4"))
					.predicate(DS0D, p -> p.cutoff$and(S0_SPPL.bp_grp_cd4.like(bind("sppl_grp_cd4")))),
				when(boundOr("sppl_grp_flg4"))
					.select(DS0D, S0_SPPL_GRP4.bp_grp_nm.as("sppl_grp_nm4"))
					.groupBy(DS0D, S0_SPPL_GRP4.bp_grp_nm),
				when(boundOr("sppl_grp_flg4", "sppl_grp_nm4"))
					.view(DS0D, v -> v.leftOuterJoin(S0_SPPL_GRP4).on(S0_SPPL.bp_grp_cd4.eq(S0_SPPL_GRP4.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP4.value()).eq(S0_SPPL_GRP4.bp_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_SPPL_GRP4.bp_grp_nm.like(bind("sppl_grp_nm4")))),
				when(boundOr("sppl_grp_flg5"))
					.select(DS0D, S0_SPPL.bp_grp_cd5.as("sppl_grp_cd5"))
					.groupBy(DS0D, S0_SPPL.bp_grp_cd5),
				when(boundOr("sppl_grp_flg5", "sppl_grp_cd5"))
					.predicate(DS0D, p -> p.cutoff$and(S0_SPPL.bp_grp_cd5.like(bind("sppl_grp_cd5")))),
				when(boundOr("sppl_grp_flg5"))
					.select(DS0D, S0_SPPL_GRP5.bp_grp_nm.as("sppl_grp_nm5"))
					.groupBy(DS0D, S0_SPPL_GRP5.bp_grp_nm),
				when(boundOr("sppl_grp_flg5", "sppl_grp_nm5"))
					.view(DS0D, v -> v.leftOuterJoin(S0_SPPL_GRP5).on(S0_SPPL.bp_grp_cd5.eq(S0_SPPL_GRP5.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP5.value()).eq(S0_SPPL_GRP5.bp_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_SPPL_GRP5.bp_grp_nm.like(bind("sppl_grp_nm5")))),
				when(boundOr("sppl_grp_flg6"))
					.select(DS0D, S0_SPPL.bp_grp_cd6.as("sppl_grp_cd6"))
					.groupBy(DS0D, S0_SPPL.bp_grp_cd6),
				when(boundOr("sppl_grp_flg6", "sppl_grp_cd6"))
					.predicate(DS0D, p -> p.cutoff$and(S0_SPPL.bp_grp_cd6.like(bind("sppl_grp_cd6")))),
				when(boundOr("sppl_grp_flg6"))
					.select(DS0D, S0_SPPL_GRP6.bp_grp_nm.as("sppl_grp_nm6"))
					.groupBy(DS0D, S0_SPPL_GRP6.bp_grp_nm),
				when(boundOr("sppl_grp_flg6", "sppl_grp_nm6"))
					.view(DS0D, v -> v.leftOuterJoin(S0_SPPL_GRP6).on(S0_SPPL.bp_grp_cd6.eq(S0_SPPL_GRP6.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP6.value()).eq(S0_SPPL_GRP6.bp_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_SPPL_GRP6.bp_grp_nm.like(bind("sppl_grp_nm6")))),
				when(boundOr("sppl_grp_flg7"))
					.select(DS0D, S0_SPPL.bp_grp_cd7.as("sppl_grp_cd7"))
					.groupBy(DS0D, S0_SPPL.bp_grp_cd7),
				when(boundOr("sppl_grp_flg7", "sppl_grp_cd7"))
					.predicate(DS0D, p -> p.cutoff$and(S0_SPPL.bp_grp_cd7.like(bind("sppl_grp_cd7")))),
				when(boundOr("sppl_grp_flg7"))
					.select(DS0D, S0_SPPL_GRP7.bp_grp_nm.as("sppl_grp_nm7"))
					.groupBy(DS0D, S0_SPPL_GRP7.bp_grp_nm),
				when(boundOr("sppl_grp_flg7", "sppl_grp_nm7"))
					.view(DS0D, v -> v.leftOuterJoin(S0_SPPL_GRP7).on(S0_SPPL.bp_grp_cd7.eq(S0_SPPL_GRP7.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP7.value()).eq(S0_SPPL_GRP7.bp_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_SPPL_GRP7.bp_grp_nm.like(bind("sppl_grp_nm7")))),
				when(boundOr("sppl_grp_flg8"))
					.select(DS0D, S0_SPPL.bp_grp_cd8.as("sppl_grp_cd8"))
					.groupBy(DS0D, S0_SPPL.bp_grp_cd8),
				when(boundOr("sppl_grp_flg8", "sppl_grp_cd8"))
					.predicate(DS0D, p -> p.cutoff$and(S0_SPPL.bp_grp_cd8.like(bind("sppl_grp_cd8")))),
				when(boundOr("sppl_grp_flg8"))
					.select(DS0D, S0_SPPL_GRP8.bp_grp_nm.as("sppl_grp_nm8"))
					.groupBy(DS0D, S0_SPPL_GRP8.bp_grp_nm),
				when(boundOr("sppl_grp_flg8", "sppl_grp_nm8"))
					.view(DS0D, v -> v.leftOuterJoin(S0_SPPL_GRP8).on(S0_SPPL.bp_grp_cd8.eq(S0_SPPL_GRP8.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP8.value()).eq(S0_SPPL_GRP8.bp_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_SPPL_GRP8.bp_grp_nm.like(bind("sppl_grp_nm8")))),
				when(boundOr("sppl_grp_flg9"))
					.select(DS0D, S0_SPPL.bp_grp_cd9.as("sppl_grp_cd9"))
					.groupBy(DS0D, S0_SPPL.bp_grp_cd9),
				when(boundOr("sppl_grp_flg9", "sppl_grp_cd9"))
					.predicate(DS0D, p -> p.cutoff$and(S0_SPPL.bp_grp_cd9.like(bind("sppl_grp_cd9")))),
				when(boundOr("sppl_grp_flg9"))
					.select(DS0D, S0_SPPL_GRP9.bp_grp_nm.as("sppl_grp_nm9"))
					.groupBy(DS0D, S0_SPPL_GRP9.bp_grp_nm),
				when(boundOr("sppl_grp_flg9", "sppl_grp_nm9"))
					.view(DS0D, v -> v.leftOuterJoin(S0_SPPL_GRP9).on(S0_SPPL.bp_grp_cd9.eq(S0_SPPL_GRP9.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP9.value()).eq(S0_SPPL_GRP9.bp_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_SPPL_GRP9.bp_grp_nm.like(bind("sppl_grp_nm9")))),
				when(boundOr("sppl_grp_flg10"))
					.select(DS0D, S0_SPPL.bp_grp_cd10.as("sppl_grp_cd10"))
					.groupBy(DS0D, S0_SPPL.bp_grp_cd10),
				when(boundOr("sppl_grp_flg10", "sppl_grp_cd10"))
					.predicate(DS0D, p -> p.cutoff$and(S0_SPPL.bp_grp_cd10.like(bind("sppl_grp_cd10")))),
				when(boundOr("sppl_grp_flg10"))
					.select(DS0D, S0_SPPL_GRP10.bp_grp_nm.as("sppl_grp_nm10"))
					.groupBy(DS0D, S0_SPPL_GRP10.bp_grp_nm),
				when(boundOr("sppl_grp_flg10", "sppl_grp_nm10"))
					.view(DS0D, v -> v.leftOuterJoin(S0_SPPL_GRP10).on(S0_SPPL.bp_grp_cd10.eq(S0_SPPL_GRP10.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP10.value()).eq(S0_SPPL_GRP10.bp_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_SPPL_GRP10.bp_grp_nm.like(bind("sppl_grp_nm10")))),
				when(boundOr("trd_nm"))
					.view(DS0D, v -> v.leftOuterJoin(S0_TRD).on(S0_TRD.trd_cd.eq(S0_V1.pr("trd_cd"))))
					.predicate(DS0D, p -> p.cutoff$and(S0_TRD.trd_nm.like(bind("trd_nm")))),
				when(boundOr("po_schd_src_typ", "po_schd_src_no"))
					.view(DS0D, v -> v.leftOuterJoin(S0_PO_SCHD).on(S0_PO_SCHD.po_schd_no.eq(S0_V1.pr("po_schd_no"))))
					.predicate(DS0D, p -> p.cutoff$and(S0_PO_SCHD.po_schd_src_typ.like(bind("po_schd_src_typ"))).cutoff$and(S0_PO_SCHD.po_schd_src_no.like(bind("po_schd_src_no")))),
				when(boundOr("itm_typ"))
					.predicate(DS0D, p -> p.cutoff$and(S0_ITM.itm_typ.like(bind("itm_typ")))),
				when(boundOr("itm_typ_d_cd"))
					.predicate(DS0D, p -> p.cutoff$and(S0_ITM.itm_typ_d_cd.like(bind("itm_typ_d_cd")))),
				when(boundOr("itm_typ_d_nm"))
					.view(DS0D, v -> v.leftOuterJoin(S0_ITM_TYP_D).on(S0_ITM_TYP_D.itm_typ.eq(S0_ITM.itm_typ).and(S0_ITM_TYP_D.itm_typ_d_cd.eq(S0_ITM.itm_typ_d_cd))))
					.predicate(DS0D, p -> p.cutoff$and(S0_ITM_TYP_D.itm_typ_d_nm.like(bind("itm_typ_d_nm")))),
				when(boundOr("maker_nm"))
					.view(DS0D, v -> v.leftOuterJoin(S0_MAKER).on(S0_MAKER.bp_cd.eq(S0_V1.pr("maker_cd"))))
					.predicate(DS0D, p -> p.cutoff$and(S0_MAKER.bp_nm.like(bind("maker_nm")))),
				when(boundOr("site_cd", "site_nm", "in_to_loc_nm"))
					.view(DS0D, v -> v.leftOuterJoin(S0_IN_TO_LOC).on(S0_IN_TO_LOC.loc_cd.eq(S0_V1.pr("in_to_loc_cd"))).leftOuterJoin(S0_IN_TO_LOC_SITE).on(S0_IN_TO_LOC_SITE.site_cd.eq(S0_IN_TO_LOC.site_cd)))
					.predicate(DS0D, p -> p.cutoff$and(S0_IN_TO_LOC.site_cd.like(bind("site_cd"))).cutoff$and(S0_IN_TO_LOC.loc_nm.like(bind("in_to_loc_nm"))).cutoff$and(S0_IN_TO_LOC_SITE.site_nm.like(bind("site_nm")))),
				when(boundOr("in_to_loc_wg_nm"))
					.view(DS0D, v -> v.leftOuterJoin(S0_IN_TO_LOC_WG).on(S0_IN_TO_LOC_WG.wg_cd.eq(S0_V1.pr("in_to_loc_wg_cd"))))
					.predicate(DS0D, p -> p.cutoff$and(S0_IN_TO_LOC_WG.wg_nm.like(bind("in_to_loc_wg_nm")))),
				when(boundOr("str_ln_nm"))
					.view(DS0D, v -> v.leftOuterJoin(S0_STR_LN).on(S0_STR_LN.loc_cd.eq(S0_V1.pr("in_to_loc_cd")).and(S0_STR_LN.str_ln_cd.eq(S0_V1.pr("str_ln_cd")))))
					.predicate(DS0D, p -> p.cutoff$and(S0_STR_LN.str_ln_nm.like(bind("str_ln_nm")))),
				when(boundOr("ap_dpt_nm"))
					.view(DS0D, v -> v.leftOuterJoin(S0_AP_DPT).on(S0_AP_DPT.dpt_cd.eq(S0_V1.pr("ap_dpt_cd")).and(S0_V1.pr("master_dt").between(S0_AP_DPT.st_dt, S0_AP_DPT.end_dt))))
					.predicate(DS0D, p -> p.cutoff$and(S0_AP_DPT.dpt_nm.like(bind("ap_dpt_nm")))),
				when(boundOr("purc_usr_nm"))
					.view(DS0D, v -> v.leftOuterJoin(S0_USR).on(S0_USR.usr_cd.eq(S0_V1.pr("purc_usr_cd"))))
					.predicate(DS0D, p -> p.cutoff$and(S0_USR.usr_nm.like(bind("purc_usr_nm")))),
				when(boundOr("purc_dpt_nm"))
					.view(DS0D, v -> v.leftOuterJoin(S0_DPT).on(S0_DPT.dpt_cd.eq(S0_V1.pr("purc_dpt_cd")).and(S0_V1.pr("master_dt").between(S0_DPT.st_dt, S0_DPT.end_dt))))
					.predicate(DS0D, p -> p.cutoff$and(S0_DPT.dpt_nm.like(bind("purc_dpt_nm")))),
				when(boundOr("purc_dpt_wg_nm"))
					.view(DS0D, v -> v.leftOuterJoin(S0_WG).on(S0_WG.wg_cd.eq(S0_V1.pr("purc_dpt_wg_cd"))))
					.predicate(DS0D, p -> p.cutoff$and(S0_WG.wg_nm.like(bind("purc_dpt_wg_nm"))))
			)
			.setJoinInfo(
				joinInfo(
					j -> j
						.add(MAM_BP_R.class, r -> toCondition(
							r.getStringNE("sppl_cd")
						))
						.addSelect(m -> toArray(
							m.asppl_cd
						))
						.addMap((r, m) -> {
							r.setStringNE("asppl_cd",m.asppl_cd());
							r.setStringNE("join_asppl_cd_", m.asppl_cd());
						}),
					j -> j
						.add(MAM_BP_R.class, r -> toCondition(
							r.getStringNE("join_asppl_cd_")
						))
						.addSelect(m -> toArray(
							m.bsppl_cd
						))
						.addMap((r, m) -> {
							r.setStringNE("bsppl_cd",m.bsppl_cd());
						})
					)
				);
	}
	static MCJoinerList<RsltR> MSBDL0130_RsltR_J01() {
		return joinInfo(
			j -> j
				.add(MAM_TRD_R.class, r -> toCondition(
					r.trd_cd()
				))
				.addSelect(m -> toArray(
					m.trd_nm
				))
				.addMap((r, m) -> {
					r.trd_nm(m.trd_nm());
				}),
			j -> j
				.add(MST_PO_SCHD_R.class, r -> toCondition(
					r.po_schd_no()
				))
				.addSelect(m -> toArray(
					m.po_schd_src_no,
					m.po_schd_src_typ
				))
				.addMap((r, m) -> {
					r.po_schd_src_typ(m.po_schd_src_typ());
					r.po_schd_src_no(m.po_schd_src_no());
				}),
			j -> j
				.add(MAM_LOC_R.class, r -> toCondition(
					r.gi_loc_cd()
				))
				.addSelect(m -> toArray(
					m.wg_cd
				))
				.addMap((r, m) -> {
					r.gi_wg_cd(m.wg_cd());
				}),
			j -> j
				.add(MAM_ITM_R.class, r -> toCondition(
					r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3()
				))
				.addSelect(m -> toArray(
					m.asset_mng_typ,
					m.bp_lot_flg,
					m.cont_fctr_dec_place,
					m.cont_fctr_flg,
					m.cont_fctr_rnd_typ,
					m.cont_fctr_unit_cd,
					m.dscnt_itm_flg,
					m.itm_nm,
					m.itm_typ,
					m.itm_typ_d_cd,
					m.lot_mng_typ,
					m.lot_no_typ,
					m.pay_crryovr_times,
					m.purc_upri_cng_flg,
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
					r.itm_nm_itm(m.itm_nm());
					r.ver_flg(m.ver_flg());
					r.lot_mng_typ(m.lot_mng_typ());
					r.sublot_mng_typ(m.sublot_mng_typ());
					r.lot_no_typ(m.lot_no_typ());
					r.sublot_no_typ(m.sublot_no_typ());
					r.sno1_mng_typ(m.sno1_mng_typ());
					r.sno2_mng_typ(m.sno2_mng_typ());
					r.sno3_mng_typ(m.sno3_mng_typ());
					r.sno4_mng_typ(m.sno4_mng_typ());
					r.bp_lot_flg(m.bp_lot_flg());
					r.dscnt_itm_flg(m.dscnt_itm_flg());
					r.asset_mng_typ(m.asset_mng_typ());
					r.itm_typ(m.itm_typ());
					r.itm_typ_d_cd(m.itm_typ_d_cd());
					r.itm_pay_crryovr_times(m.pay_crryovr_times());
					r.itm_purc_upri_cng_flg(m.purc_upri_cng_flg());
					r.cont_fctr_flg(m.cont_fctr_flg());
					r.std_cont_fctr(m.std_cont_fctr());
					r.cont_fctr_unit_cd(m.cont_fctr_unit_cd());
					r.cont_fctr_rnd_typ(m.cont_fctr_rnd_typ());
					r.cont_fctr_dec_place(m.cont_fctr_dec_place());
					r.stk_mng_typ(m.stk_mng_typ());
					r.setStringNE("join_itm_typ_", m.itm_typ());
					r.setStringNE("join_itm_typ_d_cd_", m.itm_typ_d_cd());
				}),
			j -> j
				.add(MAM_ITM_TYP_D_R.class, r -> toCondition(
					r.getStringNE("join_itm_typ_"), r.getStringNE("join_itm_typ_d_cd_")
				))
				.addSelect(m -> toArray(
					m.itm_typ_d_nm
				))
				.addMap((r, m) -> {
					r.itm_typ_d_nm(m.itm_typ_d_nm());
				}),
			j -> j
				.add(MAM_BP_R.class, r -> toCondition(
					r.sppl_cd()
				))
				.addSelect(m -> toArray(
					m.bp_nm,
					m.cntry_cd,
					m.prnt_lcl_cd,
					m.purc_amt_rnd_typ,
					m.purc_slip_each_lot_typ,
					m.purc_tax_calc_typ,
					m.purc_tax_rnd_typ,
					m.purc_upri_cng_flg,
					m.sppl_iv_flg,
					m.subcon_flg,
					m.repurc_obli_flg,
					m.outsrc_upri_typ
				))
				.addMap((r, m) -> {
					r.sppl_nm(m.bp_nm());
					r.purc_upri_cng_flg(m.purc_upri_cng_flg());
					r.sppl_iv_flg(m.sppl_iv_flg());
					r.prnt_lcl_cd(m.prnt_lcl_cd());
					r.purc_amt_rnd_typ(m.purc_amt_rnd_typ());
					r.purc_tax_rnd_typ(m.purc_tax_rnd_typ());
					r.purc_tax_calc_typ(m.purc_tax_calc_typ());
					r.sppl_cntry_cd(m.cntry_cd());
					r.subcon_flg(m.subcon_flg());
					if(r.outsrc_flg()) {
						r.repurc_obli_flg(m.repurc_obli_flg());
						r.outsrc_upri_typ(m.outsrc_upri_typ() == null ? getCo().outsrc_upri_typ() : m.outsrc_upri_typ());
					}
					else {
						r.repurc_obli_flg(false);
						r.outsrc_upri_typ(null);
					}
					r.purc_slip_each_lot_typ(m.purc_slip_each_lot_typ());
					r.setStringNE("join_cntry_cd_", m.cntry_cd());
				}),
			j -> j
				.add(MAM_CNTRY_R.class, r -> toCondition(
					r.getStringNE("join_cntry_cd_")
				))
				.addSelect(m -> toArray(
					m.cntry_nm
				))
				.addMap((r, m) -> {
					r.sppl_cntry_nm(m.cntry_nm());
				}),
			j -> j
				.add(MAM_ITM_LCL_R.class, r -> toCondition(
					r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3(), r.prnt_lcl_cd()
				))
				.addSelect(m -> toArray(
					m.itm_nm
				))
				.addMap((r, m) -> {
					r.itm_nm_lcl(m.itm_nm());
				}),
			j -> j
				.add(MAVM_BP_NM_R.class, r -> toCondition(
					r.asppl_cd()
				))
				.addSelect(m -> toArray(
					m.bp_nm
				))
				.addMap((r, m) -> {
					r.asppl_nm(m.bp_nm());
				}),
			j -> j
				.add(MAM_BP_R.class, r -> toCondition(
					r.bsppl_cd()
				))
				.addSelect(m -> toArray(
					m.ap_cred_cd,
					m.pay_spot_flg
				))
				.addMap((r, m) -> {
					r.pay_spot_flg(m.pay_spot_flg());
					r.ap_cred_cd(m.ap_cred_cd());
				}),
			j -> j
				.add(MAVM_ITM_UNIT_R.class, r -> toCondition(
					r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3(), r.src_trd_unit_cd()
				))
				.addSelect(m -> toArray(
					m.conv_base_qty,
					m.conv_qty,
					m.dec_place,
					m.rnd_typ
				))
				.addMap((r, m) -> {
					r.src_trd_unit_conv_qty(m.conv_qty());
					r.src_trd_unit_conv_base_qty(m.conv_base_qty());
					r.src_trd_unit_dec_place(m.dec_place());
					r.src_trd_unit_rnd_typ(m.rnd_typ());
				}),
			j -> j
				.add(MAM_TAX_R.class, r -> toCondition(
					r.src_tax_cd()
				))
				.addSelect(m -> toArray(
					m.inc_tax_flg,
					m.tax_nm,
					m.tax_rate,
					m.tax_typ
				))
				.addMap((r, m) -> {
					r.src_tax_nm(m.tax_nm());
					r.src_tax_rate(m.tax_rate());
					r.src_tax_typ(m.tax_typ());
					r.src_inc_tax_flg(m.inc_tax_flg());
				}),
			j -> j
				.add(MAVM_BP_NM_R.class, r -> toCondition(
					r.maker_cd()
				))
				.addSelect(m -> toArray(
					m.bp_nm
				))
				.addMap((r, m) -> {
					r.maker_nm(m.bp_nm());
				}),
			j -> j
				.add(MAM_UNIT_R.class, r -> toCondition(
					r.trd_unit_cd()
				))
				.addSelect(m -> toArray(
					m.unit_nm
				))
				.addMap((r, m) -> {
					r.trd_unit_nm(m.unit_nm());
				}),
			j -> j
				.add(MAVM_ITM_UNIT_R.class, r -> toCondition(
					r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3(), r.trd_unit_cd()
				))
				.addSelect(m -> toArray(
					m.conv_base_qty,
					m.conv_qty,
					m.dec_place,
					m.rnd_typ
				))
				.addMap((r, m) -> {
					r.trd_unit_dec_place(m.dec_place());
					r.trd_unit_rnd_typ(m.rnd_typ());
					r.trd_unit_conv_base_qty(m.conv_base_qty());
					r.trd_unit_conv_qty(m.conv_qty());
				}),
			j -> j
				.add(MAM_UNIT_R.class, r -> toCondition(
					r.base_unit_cd()
				))
				.addSelect(m -> toArray(
					m.unit_nm
				))
				.addMap((r, m) -> {
					r.base_unit_nm(m.unit_nm());
				}),
			j -> j
				.add(MAVM_ITM_UNIT_R.class, r -> toCondition(
					r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3(), r.base_unit_cd()
				))
				.addSelect(m -> toArray(
					m.dec_place,
					m.rnd_typ
				))
				.addMap((r, m) -> {
					r.base_unit_dec_place(m.dec_place());
					r.base_unit_rnd_typ(m.rnd_typ());
				}),
			j -> j
				.add(MAM_WG_R.class, r -> toCondition(
					r.re_arr_loc_wg_cd()
				))
				.addSelect(m -> toArray(
					m.wg_nm
				))
				.addMap((r, m) -> {
					r.re_arr_loc_wg_nm(m.wg_nm());
				}),
			j -> j
				.add(MAM_STR_LN_R.class, r -> toCondition(
					r.re_arr_loc_cd(), r.re_arr_str_ln_cd()
				))
				.addSelect(m -> toArray(
					m.str_ln_nm
				))
				.addMap((r, m) -> {
					r.re_arr_str_ln_nm(m.str_ln_nm());
				}),
			j -> j
				.add(MAM_STK_GD_R.class, r -> toCondition(
					r.gd_cd()
				))
				.addSelect(m -> toArray(
					m.gd_nm
				))
				.addMap((r, m) -> {
					r.gd_nm(m.gd_nm());
				}),
			j -> j
				.add(MSVT_WRK_SNO_R.class, r -> toCondition(
					r.sno1()
				))
				.addSelect(m -> toArray(
					m.wrk_nm,
					m.wrk_no
				))
				.addMap((r, m) -> {
					r.wrk_no(m.wrk_no());
					r.wrk_nm(m.wrk_nm());
				}),
			j -> j
				.add(MAM_LOC_R.class, r -> toCondition(
					r.in_to_loc_cd()
				))
				.addSelect(m -> toArray(
					m.loc_nm,
					m.site_cd,
					m.sppl_cd,
					m.str_ln_tgt_flg
				))
				.addMap((r, m) -> {
					r.site_cd(m.site_cd());
					r.in_to_loc_nm(m.loc_nm());
					r.outsrc_sppl_cd(m.sppl_cd());
					r.str_ln_tgt_flg(m.str_ln_tgt_flg());
					r.setStringNE("join_site_cd_", m.site_cd());
				}),
			j -> j
				.add(MAM_SITE_R.class, r -> toCondition(
					r.getStringNE("join_site_cd_")
				))
				.addSelect(m -> toArray(
					m.site_nm
				))
				.addMap((r, m) -> {
					r.site_nm(m.site_nm());
				}),
			j -> j
				.add(MAM_WG_R.class, r -> toCondition(
					r.in_to_loc_wg_cd()
				))
				.addSelect(m -> toArray(
					m.wg_nm
				))
				.addMap((r, m) -> {
					r.in_to_loc_wg_nm(m.wg_nm());
				}),
			j -> j
				.add(MAM_STR_LN_R.class, r -> toCondition(
					r.in_to_loc_cd(), r.str_ln_cd()
				))
				.addSelect(m -> toArray(
					m.str_ln_nm
				))
				.addMap((r, m) -> {
					r.str_ln_nm(m.str_ln_nm());
				}),
			j -> j
				.add(MST_SLO_R.class, r -> toCondition(
					r.slo_no()
				))
				.addSelect(m -> toArray(
					m.cst_cd
				))
				.addMap((r, m) -> {
					r.setStringNE("join_cst_cd_", m.cst_cd());
				}),
			j -> j
				.add(MAM_BP_R.class, r -> toCondition(
					r.getStringNE("join_cst_cd_")
				))
				.addSelect(m -> toArray(
					m.cst_iv_flg
				))
				.addMap((r, m) -> {
					r.cst_iv_flg(m.cst_iv_flg());
				}),
			j -> j
				.add(MAM_BP_R.class, r -> toCondition(
					r.dlv_cd()
				))
				.addSelect(m -> toArray(
					m.bp_nm,
					m.cntry_cd,
					m.dlv_cal_cd
				))
				.addMap((r, m) -> {
					r.scst_cal_cd(m.dlv_cal_cd());
					r.dlv_nm_bp(m.bp_nm());
					r.dlv_cntry_cd(m.cntry_cd());
					r.setStringNE("join_cntry_cd_", m.cntry_cd());
				}),
			j -> j
				.add(MAM_CNTRY_R.class, r -> toCondition(
					r.getStringNE("join_cntry_cd_")
				))
				.addSelect(m -> toArray(
					m.cntry_nm
				))
				.addMap((r, m) -> {
					r.dlv_cntry_nm(m.cntry_nm());
				}),
			j -> j
				.add(MAM_BP_R.class, r -> toCondition(
					r.tdlv_cd()
				))
				.addSelect(m -> toArray(
					m.bp_nm,
					m.cntry_cd
				))
				.addMap((r, m) -> {
					r.tdlv_nm_bp(m.bp_nm());
					r.tdlv_cntry_cd(m.cntry_cd());
					r.setStringNE("join_cntry_cd_", m.cntry_cd());
				}),
			j -> j
				.add(MAM_CNTRY_R.class, r -> toCondition(
					r.getStringNE("join_cntry_cd_")
				))
				.addSelect(m -> toArray(
					m.cntry_nm
				))
				.addMap((r, m) -> {
					r.tdlv_cntry_nm(m.cntry_nm());
				}),
			j -> j
				.add(MAM_UNIT_R.class, r -> toCondition(
					r.cont_fctr_unit_cd()
				))
				.addSelect(m -> toArray(
					m.unit_nm
				))
				.addMap((r, m) -> {
					r.cont_fctr_unit_nm(m.unit_nm());
				}),
			j -> j
				.add(MAM_TAX_R.class, r -> toCondition(
					r.tax_cd()
				))
				.addSelect(m -> toArray(
					m.inc_tax_flg,
					m.tax_nm,
					m.tax_rate,
					m.tax_typ
				))
				.addMap((r, m) -> {
					r.inc_tax_flg(m.inc_tax_flg());
					r.tax_nm(m.tax_nm());
					r.tax_rate(m.tax_rate());
					r.tax_typ(m.tax_typ());
				}),
			j -> j
				.add(MAM_CUR_R.class, r -> toCondition(
					r.trd_cur_cd()
				))
				.addSelect(m -> toArray(
					m.amt_dec_place,
					m.cur_nm,
					m.upri_dec_place
				))
				.addMap((r, m) -> {
					r.trd_cur_nm(m.cur_nm());
					r.trd_cur_upri_dec_place(m.upri_dec_place());
					r.trd_cur_amt_dec_place(m.amt_dec_place());
				}),
			j -> j
				.add(MAM_BIZ_RSN_R.class, r -> toCondition(
					r.dscnt_rsn_cd()
				))
				.addSelect(m -> toArray(
					m.biz_rsn_nm
				))
				.addMap((r, m) -> {
					r.dscnt_rsn_nm(m.biz_rsn_nm());
				}),
			j -> j
				.add(MAM_CUR_R.class, r -> toCondition(
					r.base_cur_cd()
				))
				.addSelect(m -> toArray(
					m.amt_dec_place,
					m.cur_nm,
					m.upri_dec_place
				))
				.addMap((r, m) -> {
					r.base_cur_nm(m.cur_nm());
					r.base_cur_upri_dec_place(m.upri_dec_place());
					r.base_cur_amt_dec_place(m.amt_dec_place());
				}),
			j -> j
				.add(MAM_CUR_R.class, r -> toCondition(
					r.ptax_cur_cd()
				))
				.addSelect(m -> toArray(
					m.amt_dec_place,
					m.cur_nm,
					m.upri_dec_place
				))
				.addMap((r, m) -> {
					r.ptax_cur_nm(m.cur_nm());
					r.ptax_cur_upri_dec_place(m.upri_dec_place());
					r.ptax_cur_amt_dec_place(m.amt_dec_place());
				}),
			j -> j
				.add(MAM_BIZ_RSN_R.class, r -> toCondition(
					r.purc_rsn_cd()
				))
				.addSelect(m -> toArray(
					m.biz_rsn_nm,
					m.xpns_purc_flg
				))
				.addMap((r, m) -> {
					r.purc_rsn_nm(m.biz_rsn_nm());
					r.xpns_purc_flg(m.xpns_purc_flg());
				}),
			j -> j
				.add(MAM_DPT_R.class, r -> toCondition(
					r.ap_dpt_cd(), r.master_dt()
				))
				.addSelect(m -> toArray(
					m.dpt_nm
				))
				.addMap((r, m) -> {
					r.ap_dpt_nm(m.dpt_nm());
				}),
			j -> j
				.add(MAM_USR_R.class, r -> toCondition(
					r.purc_usr_cd()
				))
				.addSelect(m -> toArray(
					m.usr_nm
				))
				.addMap((r, m) -> {
					r.purc_usr_nm(m.usr_nm());
				}),
			j -> j
				.add(MAM_DPT_R.class, r -> toCondition(
					r.purc_dpt_cd(), r.master_dt()
				))
				.addSelect(m -> toArray(
					m.dpt_nm
				))
				.addMap((r, m) -> {
					r.purc_dpt_nm(m.dpt_nm());
				}),
			j -> j
				.add(MAM_WG_R.class, r -> toCondition(
					r.purc_dpt_wg_cd()
				))
				.addSelect(m -> toArray(
					m.wg_nm
				))
				.addMap((r, m) -> {
					r.purc_dpt_wg_nm(m.wg_nm());
				}),
			j -> j
				.add(MAM_DPT_R.class, r -> toCondition(
					r.bd_dpt_cd(), r.master_dt()
				))
				.addSelect(m -> toArray(
					m.dpt_nm,
					m.wg_cd
				))
				.addMap((r, m) -> {
					r.bd_dpt_nm(m.dpt_nm());
					r.bd_wg_cd(m.wg_cd());
				}),
			j -> j
				.add(MAM_ITM_R.class, r -> toCondition(
					r.bd_itm_cd(), r.bd_itm_sub1(), r.bd_itm_sub2(), r.bd_itm_sub3()
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
					r.bd_itm_nm(m.itm_nm());
					r.bd_lot_mng_typ(m.lot_mng_typ());
					r.bd_sublot_mng_typ(m.sublot_mng_typ());
					r.bd_lot_no_typ(m.lot_no_typ());
					r.bd_sublot_no_typ(m.sublot_no_typ());
					r.bd_sno1_mng_typ(m.sno1_mng_typ());
					r.bd_sno2_mng_typ(m.sno2_mng_typ());
					r.bd_sno3_mng_typ(m.sno3_mng_typ());
					r.bd_sno4_mng_typ(m.sno4_mng_typ());
				}),
			j -> j
				.add(MAVM_BP_NM_R.class, r -> toCondition(
					r.bd_bp_cd()
				))
				.addSelect(m -> toArray(
					m.bp_nm
				))
				.addMap((r, m) -> {
					r.bd_bp_nm(m.bp_nm());
				}),
			j -> j
				.add(MAM_LOC_R.class, r -> toCondition(
					r.bd_loc_cd()
				))
				.addSelect(m -> toArray(
					m.loc_nm
				))
				.addMap((r, m) -> {
					r.bd_loc_nm(m.loc_nm());
				}),
			j -> j
				.add(MAM_COST_CTG_R.class, r -> toCondition(
					r.bd_ctg_cd()
				))
				.addSelect(m -> toArray(
					m.ctg_nm
				))
				.addMap((r, m) -> {
					r.bd_ctg_nm(m.ctg_nm());
				}),
			j -> j
				.add(MAM_OPER_R.class, r -> toCondition(
					r.bd_oper_cd()
				))
				.addSelect(m -> toArray(
					m.oper_nm
				))
				.addMap((r, m) -> {
					r.bd_oper_nm(m.oper_nm());
				}),
			j -> j
				.add(MAM_TTERM_R.class, r -> toCondition(
					r.tterm_cd1()
				))
				.addSelect(m -> toArray(
					m.tterm_nm
				))
				.addMap((r, m) -> {
					r.tterm_nm1(m.tterm_nm());
				}),
			j -> j
				.add(MAM_TTERM_R.class, r -> toCondition(
					r.tterm_cd2()
				))
				.addSelect(m -> toArray(
					m.tterm_nm
				))
				.addMap((r, m) -> {
					r.tterm_nm2(m.tterm_nm());
				}),
			j -> j
				.add(MAM_TTERM_R.class, r -> toCondition(
					r.tterm_cd3()
				))
				.addSelect(m -> toArray(
					m.tterm_nm
				))
				.addMap((r, m) -> {
					r.tterm_nm3(m.tterm_nm());
				})
		);
	}
}