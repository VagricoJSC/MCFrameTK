package mcframe.serverMSBE.MSBEL5930;

import mcframe.commonCore.lang.MCNumber;
import mcframe.commonCore.lang.MCDate;
import mcframe.commonCore.lang.MCTimestamp;

import mcframe.serverCore.cache.MCJoinerList;

import static mcframe.commonCore.util.MCCollectionUtil.*;
import static mcframe.serverCore.cache.MCJoinerList.*;
import static mcframe.serverCore.queryapi.IFMCSQL.*;
import static mcframe.serverCore.queryapi.MCQueryExecution.*;
import static mcframe.serverMAUC.MAUCL0010.MAUCL_MCDataUtil.*;

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
	 * -- MSBEL5930_MST_ARR_ACT_Query_S02
	 */
	static MCQueryPlan MSBEL5930_MST_ARR_ACT_S02() {
		MCTempView S0_V1 = createTempView("V1");
		MAM_LOC_R S0_ARR_LOC = MAM_LOC_R.create("ARR_LOC");
		MAM_TRD_R S0_TRD = MAM_TRD_R.create("TRD");
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
		MAM_SUNDRY_ITM_R S0_SUNDRY_ITM = MAM_SUNDRY_ITM_R.create("SUNDRY_ITM");
		MAM_ITM_LCL_R S0_RCPT_ITM = MAM_ITM_LCL_R.create("RCPT_ITM");
		MAM_ITM_TYP_D_R S0_ITM_TYP_D = MAM_ITM_TYP_D_R.create("ITM_TYP_D");
		MAM_DPT_R S0_DPT = MAM_DPT_R.create("DPT");
		MAM_USR_R S0_RQST_USR = MAM_USR_R.create("RQST_USR");
		MAM_BP_R S0_CST = MAM_BP_R.create("CST");
		MAM_BP_GRP_R S0_CST_GRP1 = MAM_BP_GRP_R.create("CST_GRP1");
		MAM_BP_GRP_R S0_CST_GRP2 = MAM_BP_GRP_R.create("CST_GRP2");
		MAM_BP_GRP_R S0_CST_GRP3 = MAM_BP_GRP_R.create("CST_GRP3");
		MAM_BP_GRP_R S0_CST_GRP4 = MAM_BP_GRP_R.create("CST_GRP4");
		MAM_BP_GRP_R S0_CST_GRP5 = MAM_BP_GRP_R.create("CST_GRP5");
		MAM_BP_GRP_R S0_CST_GRP6 = MAM_BP_GRP_R.create("CST_GRP6");
		MAM_BP_GRP_R S0_CST_GRP7 = MAM_BP_GRP_R.create("CST_GRP7");
		MAM_BP_GRP_R S0_CST_GRP8 = MAM_BP_GRP_R.create("CST_GRP8");
		MAM_BP_GRP_R S0_CST_GRP9 = MAM_BP_GRP_R.create("CST_GRP9");
		MAM_BP_GRP_R S0_CST_GRP10 = MAM_BP_GRP_R.create("CST_GRP10");
		MST_SLS_RET_SCHD_D_R S0_SRET_SCHD_D = MST_SLS_RET_SCHD_D_R.create("SRET_SCHD_D");
		MAM_BP_R S0_SRET_FR = MAM_BP_R.create("SRET_FR");
		MAM_BP_GRP_R S0_SRET_FR_GRP1 = MAM_BP_GRP_R.create("SRET_FR_GRP1");
		MAM_BP_GRP_R S0_SRET_FR_GRP2 = MAM_BP_GRP_R.create("SRET_FR_GRP2");
		MAM_BP_GRP_R S0_SRET_FR_GRP3 = MAM_BP_GRP_R.create("SRET_FR_GRP3");
		MAM_BP_GRP_R S0_SRET_FR_GRP4 = MAM_BP_GRP_R.create("SRET_FR_GRP4");
		MAM_BP_GRP_R S0_SRET_FR_GRP5 = MAM_BP_GRP_R.create("SRET_FR_GRP5");
		MAM_BP_GRP_R S0_SRET_FR_GRP6 = MAM_BP_GRP_R.create("SRET_FR_GRP6");
		MAM_BP_GRP_R S0_SRET_FR_GRP7 = MAM_BP_GRP_R.create("SRET_FR_GRP7");
		MAM_BP_GRP_R S0_SRET_FR_GRP8 = MAM_BP_GRP_R.create("SRET_FR_GRP8");
		MAM_BP_GRP_R S0_SRET_FR_GRP9 = MAM_BP_GRP_R.create("SRET_FR_GRP9");
		MAM_BP_GRP_R S0_SRET_FR_GRP10 = MAM_BP_GRP_R.create("SRET_FR_GRP10");
		MAM_BP_R S0_SPPL = MAM_BP_R.create("SPPL");
		MAM_BP_GRP_R S0_PO_GRP1 = MAM_BP_GRP_R.create("PO_GRP1");
		MAM_BP_GRP_R S0_PO_GRP2 = MAM_BP_GRP_R.create("PO_GRP2");
		MAM_BP_GRP_R S0_PO_GRP3 = MAM_BP_GRP_R.create("PO_GRP3");
		MAM_BP_GRP_R S0_PO_GRP4 = MAM_BP_GRP_R.create("PO_GRP4");
		MAM_BP_GRP_R S0_PO_GRP5 = MAM_BP_GRP_R.create("PO_GRP5");
		MAM_BP_GRP_R S0_PO_GRP6 = MAM_BP_GRP_R.create("PO_GRP6");
		MAM_BP_GRP_R S0_PO_GRP7 = MAM_BP_GRP_R.create("PO_GRP7");
		MAM_BP_GRP_R S0_PO_GRP8 = MAM_BP_GRP_R.create("PO_GRP8");
		MAM_BP_GRP_R S0_PO_GRP9 = MAM_BP_GRP_R.create("PO_GRP9");
		MAM_BP_GRP_R S0_PO_GRP10 = MAM_BP_GRP_R.create("PO_GRP10");
		MAM_WG_R S0_ARR_WG = MAM_WG_R.create("ARR_WG");
		MAM_LG_GRP_R S0_ARR_LG_GRP = MAM_LG_GRP_R.create("ARR_LG_GRP");
		MAM_SITE_R S0_ARR_SITE = MAM_SITE_R.create("ARR_SITE");
		MAM_ALLOC_GRP_R S0_ARR_ALLRC_GRP = MAM_ALLOC_GRP_R.create("ARR_ALLRC_GRP");
		MAM_STR_LN_R S0_ARR_STR_LN = MAM_STR_LN_R.create("ARR_STR_LN");
		MSVT_WRK_SNO_R S0_WRK_SNO = MSVT_WRK_SNO_R.create("WRK_SNO");
		MAVM_BP_NM_R S0_MAKER = MAVM_BP_NM_R.create("MAKER");
		MAM_DPT_R S0_ARR_DPT = MAM_DPT_R.create("ARR_DPT");
		MAM_USR_R S0_ARR_USR = MAM_USR_R.create("ARR_USR");
		MST_PO_D_R S0_PO_D = MST_PO_D_R.create("PO_D");
		MST_PO_SCHD_R S0_PO_SCHD = MST_PO_SCHD_R.create("PO_SCHD");
		MAM_WG_R S0_PURC_RQST_WG = MAM_WG_R.create("PURC_RQST_WG");
		MST_DLV_INST_D_R S0_DLV_INST_D = MST_DLV_INST_D_R.create("DLV_INST_D");
		MST_PRMS_RCPT_D_R S0_PRMS_RCPT_D = MST_PRMS_RCPT_D_R.create("PRMS_RCPT_D");
		MST_DLV_SLIP_R S0_DLV_SLIP = MST_DLV_SLIP_R.create("DLV_SLIP");
		MAM_LG_GRP_R S0_SHIP_LG_GRP = MAM_LG_GRP_R.create("SHIP_LG_GRP");
		MAM_WG_R S0_SHIP_WG = MAM_WG_R.create("SHIP_WG");
		MST_SLS_RET_SCHD_R S0_SRET_SCHD = MST_SLS_RET_SCHD_R.create("SRET_SCHD");
		MAM_BP_R S0_PRSPPL = MAM_BP_R.create("PRSPPL");
		MAM_BP_GRP_R S0_PRSPPL_GRP1 = MAM_BP_GRP_R.create("PRSPPL_GRP1");
		MAM_BP_GRP_R S0_PRSPPL_GRP2 = MAM_BP_GRP_R.create("PRSPPL_GRP2");
		MAM_BP_GRP_R S0_PRSPPL_GRP3 = MAM_BP_GRP_R.create("PRSPPL_GRP3");
		MAM_BP_GRP_R S0_PRSPPL_GRP4 = MAM_BP_GRP_R.create("PRSPPL_GRP4");
		MAM_BP_GRP_R S0_PRSPPL_GRP5 = MAM_BP_GRP_R.create("PRSPPL_GRP5");
		MAM_BP_GRP_R S0_PRSPPL_GRP6 = MAM_BP_GRP_R.create("PRSPPL_GRP6");
		MAM_BP_GRP_R S0_PRSPPL_GRP7 = MAM_BP_GRP_R.create("PRSPPL_GRP7");
		MAM_BP_GRP_R S0_PRSPPL_GRP8 = MAM_BP_GRP_R.create("PRSPPL_GRP8");
		MAM_BP_GRP_R S0_PRSPPL_GRP9 = MAM_BP_GRP_R.create("PRSPPL_GRP9");
		MAM_BP_GRP_R S0_PRSPPL_GRP10 = MAM_BP_GRP_R.create("PRSPPL_GRP10");
		MST_ARR_ACT_R S1_T1 = MST_ARR_ACT_R.create("T1");
		MST_ARR_SCHD_R S1_T2 = MST_ARR_SCHD_R.create("T2");
		MST_ARR_PR_R S1_T3 = MST_ARR_PR_R.create("T3");
		MST_PURC_SCHD_R S1_T4 = MST_PURC_SCHD_R.create("T4");
		MST_PURC_DLV_SLIP_D_R S1_T5 = MST_PURC_DLV_SLIP_D_R.create("T5");
		MST_PURC_DLV_SLIP_R S1_T6 = MST_PURC_DLV_SLIP_R.create("T6");
		MAM_ITM_R S2_W1 = MAM_ITM_R.create("W1");
		MST_PURC_ACT_IO_R S3_W1 = MST_PURC_ACT_IO_R.create("W1");
		MST_PURC_ACT_D_R S3_W2 = MST_PURC_ACT_D_R.create("W2");
		MST_PURC_ACT_R S3_W3 = MST_PURC_ACT_R.create("W3");
		MST_SLS_ACT_IO_R S4_W1 = MST_SLS_ACT_IO_R.create("W1");
		MST_SLS_ACT_D_R S4_W2 = MST_SLS_ACT_D_R.create("W2");
		MST_SLS_ACT_R S4_W3 = MST_SLS_ACT_R.create("W3");
		MAVM_RD_LOC_R S5_W1 = MAVM_RD_LOC_R.create("W1");
		MAVM_RD_LG_GRP_R S6_W2 = MAVM_RD_LG_GRP_R.create("W2");
		MST_RCPT_IV_MAP_R S10_W1 = MST_RCPT_IV_MAP_R.create("W1");
		MST_RCPT_IV_D_R S10_W2 = MST_RCPT_IV_D_R.create("W2");
		MST_RCPT_IV_R S10_W3 = MST_RCPT_IV_R.create("W3");
		MST_PURC_ACT_IO_R S11_W1 = MST_PURC_ACT_IO_R.create("W1");
		MST_PURC_ACT_D_R S11_W2 = MST_PURC_ACT_D_R.create("W2");
		MST_PURC_ACT_R S11_W3 = MST_PURC_ACT_R.create("W3");
		MST_PURC_ACT_IO_R S12_W1 = MST_PURC_ACT_IO_R.create("W1");
		MST_PURC_ACT_D_R S12_W2 = MST_PURC_ACT_D_R.create("W2");
		MST_PURC_ACT_R S12_W3 = MST_PURC_ACT_R.create("W3");
		
		MCDynamicSQLID DS0D = createDynamicSQLID("DS0D");
		
		return createQueryPlan()
			.setQuery(
				sql("MSBEL5930_MST_ARR_ACT_Query_S02")
					.mainQuery()
					.select(
						S0_V1.prAll(),
						S0_ARR_LOC.loc_nm.as("arr_schd_loc_nm"),
						S0_ARR_LOC.loc_nm.as("arr_loc_nm"),
						S0_ARR_LOC.site_cd.as("arr_site_cd"),
						S0_ARR_LOC.alloc_grp_cd.as("arr_alloc_grp_cd"),
						S0_ARR_LOC.sppl_cd.as("loc_sppl_cd"),
						S0_ARR_LOC.sppl_cd.as("prsppl_cd"),
						S0_ARR_LOC.str_ln_tgt_flg.as("arr_str_ln_tgt_flg"),
						addDynamicSelect(DS0D)
					)
					.from(
						subQuery()
						.select(
							S1_T2.pr_sts_typ,
							nullValue().as("pr_sts_typ_nm"),
							S1_T1.trd_cd,
							S1_T1.trd_ptn_typ,
							nullValue().as("trd_ptn_typ_nm"),
							S1_T1.itm_cd,
							S1_T1.itm_sub1,
							S1_T1.itm_sub2,
							S1_T1.itm_sub3,
							S1_T1.itm_nm,
							S1_T1.rcpt_iv_itm_nm,
							S1_T1.sundry_itm_flg,
							nvl(
								S1_T1.rqst_dpt_cd,
								S1_T3.rqst_dpt_cd
							).as("rqst_dpt_cd"),
							nvl(
								S1_T1.rqst_usr_cd,
								S1_T3.rqst_usr_cd
							).as("rqst_usr_cd"),
							S1_T1.cst_cd,
							S1_T1.sret_fr_cd,
							S1_T1.sppl_cd,
							S1_T3.ret_dlv_slip_d_no,
							nvl(
								S1_T3.ret_stk_arrv_bp_cd,
								S1_T1.sret_fr_cd
							).as("ret_stk_arrv_bp_cd"),
							S1_T1.ret_loc_cd,
							S1_T1.ret_str_ln_cd,
							S1_T1.ret_gd_cd,
							S1_T1.arr_loc_cd,
							S1_T2.arr_loc_cd.as("arr_schd_loc_cd"),
							S1_T2.lg_grp_cd.as("arr_schd_lg_grp_cd"),
							S1_T1.wg_cd.as("arr_wg_cd"),
							S1_T1.lg_grp_cd.as("arr_lg_grp_cd"),
							S1_T1.str_ln_cd.as("arr_str_ln_cd"),
							nullValue().as("arr_str_ln_cd_none_flg"),
							trunc(
								S1_T3.dlv_rqst_tm,
								MCDateFmt.DD
							).as("dlv_rqst_dt"),
							S1_T3.dlv_rqst_tm.as("dlv_rqst_hm"),
							trunc(
								S1_T2.arr_schd_tm,
								MCDateFmt.DD
							).as("arr_schd_dt"),
							S1_T2.arr_schd_tm.as("arr_schd_hm"),
							trunc(
								S1_T1.arr_tm,
								MCDateFmt.DD
							).as("arr_dt"),
							S1_T1.arr_tm.as("arr_hm"),
							S1_T1.ac_dt,
							S1_T1.ver_no,
							S1_T1.lot_no,
							S1_T1.sublot_no,
							S1_T1.bp_lot_no,
							S1_T1.bp_dlv_slip_no,
							S1_T1.bp_dlv_slip_d_no,
							S1_T1.ship_fr_valid_dt,
							S1_T1.sno1_mng_typ,
							S1_T1.sno2_mng_typ,
							S1_T1.sno3_mng_typ,
							S1_T1.sno4_mng_typ,
							S1_T1.sno1,
							S1_T1.sno2,
							S1_T1.sno3,
							S1_T1.sno4,
							S1_T1.maker_cd,
							S1_T1.sppl_itm_cd,
							S1_T1.sppl_itm_nm,
							S1_T1.purc_id_typ,
							nullValue().as("purc_id_typ_nm"),
							nullValue().as("cststk_flg"),
							S1_T1.trd_unit_cd,
							S1_T1.trd_unit_qty,
							S1_T2.abort_flg,
							S1_T1.base_unit_cd,
							S1_T1.base_unit_qty,
							S1_T2.trd_unit_cd.as("schd_unit_cd"),
							S1_T2.base_unit_qty.as("arr_schd_qty"),
							nvl(
								S1_T2.arr_qty,
								S1_T1.base_unit_qty
							).as("arr_qty"),
							MAPA_CALC$F_CALC_PER(
								S1_T2.base_unit_qty,
								S1_T1.base_unit_qty
							).as("pr_rate"),
							S1_T1.purc_cont_qty,
							nullValue().as("purc_cont_fctr"),
							nullValue().as("std_cont_qty"),
							S1_T1.sync_flg,
							nullValue().as("split_flg"),
							S1_T2.arr_ptn_typ,
							nullValue().as("arr_ptn_typ_nm"),
							S1_T1.gd_cd,
							S1_T1.quality_typ,
							nullValue().as("quality_typ_nm"),
							S1_T1.stk_insp_typ,
							nullValue().as("stk_insp_typ_nm"),
							S1_T1.stk_id_typ.as("stk_id_typ"),
							nullValue().as("stk_id_typ_nm"),
							S1_T1.stk_bp_cd.as("stk_bp_cd"),
							S1_T1.arr_dpt_cd,
							S1_T1.arr_usr_cd,
							S1_T1.rsn_cd,
							S1_T1.bd_dpt_cd,
							S1_T1.bd_wg_cd,
							S1_T1.insp_cnt_rmrks,
							S1_T1.intr_rmrks,
							S1_T1.trd_rmrks,
							S1_T1.trd_d_rmrks,
							S1_T1.sub_char1,
							S1_T1.sub_char2,
							S1_T1.sub_char3,
							S1_T2.arr_cnt_rmrks,
							S1_T1.arr_act_no,
							S1_T2.dlv_slip_no,
							S1_T2.dlv_slip_mng_no,
							S1_T6.dlv_slip_seq,
							S1_T6.dlv_slip_rev,
							cases()
								.when(S1_T2.dlv_slip_mng_d_no.isNull())
								.then(S1_T3.dlv_slip_d_no)
								.otherwise(S1_T5.dlv_slip_d_no).as("dlv_slip_d_no"),
							S1_T5.dlv_slip_d_seq,
							S1_T2.arr_schd_no,
							S1_T2.arr_pr_no,
							S1_T3.po_d_no,
							S1_T4.purc_schd_no,
							S1_T4.purc_schd_dt,
							S1_T2.dlv_inst_d_no,
							S1_T2.prms_rcpt_d_no,
							nullValue().as("purc_act_no"),
							nullValue().as("purc_act_d_no"),
							S1_T1.purc_act_io_no,
							nullValue().as("purc_qty"),
							S1_T3.sls_ret_schd_d_no,
							S1_T2.iv_no,
							S1_T3.iv_d_no,
							S1_T2.outsrc_flg,
							S1_T2.mfg_inst_no,
							S1_T2.pre_outsrc_act_flg,
							S1_T2.pre_mfg_act_no.as("mfg_act_no"),
							S1_T1.stk_lst_prnt_flg,
							S1_T1.edi_flg,
							S1_T1.edi_bp_dlv_slip_no,
							S1_T1.edi_bp_dlv_slip_d_no,
							S1_T1.wms_flg,
							S1_T1.ext_sys_cd,
							S1_T1.ext_arr_act_no,
							nullValue().as("prov_typ"),
							nullValue().as("prov_basis_typ"),
							nullValue().as("prov_src_schd_typ"),
							nullValue().as("prov_src_schd_no1"),
							nullValue().as("prov_src_schd_no2"),
							nullValue().as("prov_schd_no"),
							nullValue().as("prov_src_act_typ"),
							nullValue().as("prov_src_act_no"),
							nullValue().as("prov_act_no"),
							nullValue().as("prov_slip_prnt_flg"),
							nullValue().as("pa_io_loc_cd"),
							nullValue().as("pa_io_str_ln_cd"),
							nullValue().as("pa_io_trd_unit_cd"),
							nullValue().as("pa_io_trd_unit_nm"),
							nullValue().as("pa_io_trd_unit_conv_base_qty"),
							nullValue().as("pa_io_trd_unit_conv_qty"),
							nullValue().as("pa_io_trd_unit_dec_place"),
							nullValue().as("pa_io_trd_unit_rnd_typ"),
							nullValue().as("pa_io_base_unit_qty"),
							nullValue().as("aa_base_unit_qty"),
							S1_T1.ins_usr_id,
							S1_T1.ins_usr_nm,
							S1_T1.ins_func_id,
							nullValue().as("ins_func_nm"),
							S1_T1.ins_ts,
							S1_T1.upd_usr_id,
							S1_T1.upd_usr_nm,
							S1_T1.upd_func_id,
							nullValue().as("upd_func_nm"),
							S1_T1.upd_ts,
							S1_T1.upd_srv_req_no,
							S1_T3.upd_cntr.as("arr_pr_upd_cntr"),
							S1_T1.upd_cntr.as("arr_act_upd_cntr"),
							S1_T1.ac_dt.as("master_dt"),
							S1_T1.base_unit_qty.as("base_unit_qty_bef")
						)
						.from(
							S1_T1
							.leftOuterJoin(S1_T2).on(S1_T2.arr_schd_no.eq(S1_T1.arr_schd_no))
							.leftOuterJoin(S1_T3).on(S1_T3.arr_pr_no.eq(S1_T2.arr_pr_no))
							.leftOuterJoin(S1_T4).on(S1_T4.arr_schd_no.eq(S1_T2.arr_schd_no))
							.leftOuterJoin(S1_T5).on(
								S1_T5.dlv_slip_mng_d_no.eq(S1_T2.dlv_slip_mng_d_no)
								.and(S1_T5.dlv_slip_mng_d_seq.eq(S1_T2.dlv_slip_mng_d_seq))
							)
							.leftOuterJoin(S1_T6).on(
								S1_T6.dlv_slip_mng_no.eq(S1_T2.dlv_slip_mng_no)
								.and(S1_T6.dlv_slip_mng_seq.eq(S1_T2.dlv_slip_mng_seq))
							)
						)
						.where(
							value(0).eq(value(0))
							.and(S1_T1.can_flg.eq(value(false)))
							.and(
								S1_T2.arr_skip_flg.eq(value(false))
								.or(S1_T1.arr_schd_no.isNull())
								.cutoff$and(
									S1_T1.trd_ptn_typ.in(
										value(MAC_TRD_PTN_TYP.ARR.value()),
										value(MAC_TRD_PTN_TYP.SHIP_RTN.value())
									)
									.and(bind("tmp_upd_uplnd").eq(value(true)))
								)
							)
							.and(
								value(1).eq(value(0))
								.cutoff$or(
									bracket(
										bracket(
											S1_T2.cmpl_flg.eq(value(false))
											.and(S1_T2.arr_qty.gt(value(0)))
											.or(S1_T2.cmpl_flg.eq(value(true)))
										)
										.and(S1_T2.abort_flg.eq(value(false)))
										.or(S1_T1.arr_schd_no.isNull())
									)
									.and(bind("tmp_arr").eq(value(true)))
								)
								.cutoff$or(
									S1_T2.abort_flg.eq(value(true))
									.and(bind("tmp_abort").eq(value(true)))
								)
							)
							.and(
								value(1).eq(value(0))
								.cutoff$or(
									S1_T1.stk_lst_prnt_flg.eq(value(false))
									.and(bind("tmp_prnt_yet").eq(value(true)))
								)
								.cutoff$or(
									S1_T1.stk_lst_prnt_flg.eq(value(true))
									.and(bind("tmp_prnt_done").eq(value(true)))
								)
							)
							.and(
								value(1).eq(value(0))
								.cutoff$or(
									S1_T1.wms_flg.eq(value(false))
									.and(bind("tmp_wms_f").eq(value(true)))
								)
								.cutoff$or(
									S1_T1.wms_flg.eq(value(true))
									.and(bind("tmp_wms_t").eq(value(true)))
								)
							)
							.cutoff$and(S1_T2.arr_schd_tm.gte(bind("arr_schd_hm_fr")))
							.cutoff$and(S1_T2.arr_schd_tm.lte(bind("arr_schd_hm_to")))
							.cutoff$and(S1_T1.arr_tm.gte(bind("arr_hm_fr")))
							.cutoff$and(S1_T1.arr_tm.lte(bind("arr_hm_to")))
							.cutoff$and(S1_T1.ac_dt.gte(bind("ac_dt_fr")))
							.cutoff$and(S1_T1.ac_dt.lte(bind("ac_dt_to")))
							.cutoff$and(
								MAPA_CALC$F_CALC_PER(
									S1_T2.base_unit_qty,
									S1_T1.base_unit_qty
								).gte(bind("pr_rate_fr"))
							)
							.cutoff$and(
								MAPA_CALC$F_CALC_PER(
									S1_T2.base_unit_qty,
									S1_T1.base_unit_qty
								).lte(bind("pr_rate_to"))
							)
							.cutoff$and(S1_T1.arr_dpt_cd.like(bind("arr_dpt_cd")))
							.cutoff$and(S1_T1.arr_usr_cd.like(bind("arr_usr_cd")))
							.cutoff$and(S1_T1.arr_loc_cd.like(bind("arr_loc_cd")))
							.cutoff$and(S1_T1.str_ln_cd.like(bind("arr_str_ln_cd")))
							.cutoff$and(S1_T1.lg_grp_cd.like(bind("arr_lg_grp_cd")))
							.cutoff$and(S1_T1.wg_cd.like(bind("arr_wg_cd")))
							.cutoff$and(S1_T1.itm_cd.like(bind("itm_cd")))
							.cutoff$and(S1_T1.itm_sub1.like(bind("itm_sub1")))
							.cutoff$and(S1_T1.itm_sub2.like(bind("itm_sub2")))
							.cutoff$and(S1_T1.itm_sub3.like(bind("itm_sub3")))
							.cutoff$and(S1_T1.ver_no.like(bind("ver_no")))
							.cutoff$and(S1_T1.lot_no.like(bind("lot_no")))
							.cutoff$and(S1_T1.sublot_no.like(bind("sublot_no")))
							.cutoff$and(S1_T1.sno1.like(bind("sno1")))
							.cutoff$and(S1_T1.sno2.like(bind("sno2")))
							.cutoff$and(S1_T1.sno3.like(bind("sno3")))
							.cutoff$and(S1_T1.sno4.like(bind("sno4")))
							.cutoff$and(S1_T1.trd_cd.like(bind("trd_cd")))
							.cutoff$and(S1_T2.dlv_slip_no.like(bind("dlv_slip_no")))
							.cutoff$and(S1_T6.dlv_slip_seq.eq(bind("dlv_slip_seq")))
							.cutoff$and(
								cases()
								.when(S1_T2.dlv_slip_mng_d_no.isNull())
								.then(S1_T3.dlv_slip_d_no)
								.otherwise(S1_T5.dlv_slip_d_no).like(bind("dlv_slip_d_no"))
							)
							.cutoff$and(S1_T2.arr_schd_no.like(bind("arr_schd_no")))
							.cutoff$and(S1_T1.arr_act_no.like(bind("arr_act_no")))
							.cutoff$and(S1_T1.ext_arr_act_no.like(bind("ext_arr_act_no")))
							.cutoff$and(S1_T1.trd_rmrks.like(bind("trd_rmrks")))
							.cutoff$and(S1_T1.trd_d_rmrks.like(bind("trd_d_rmrks")))
							.cutoff$and(S1_T2.arr_cnt_rmrks.like(bind("arr_cnt_rmrks")))
							.cutoff$and(S1_T1.sppl_cd.like(bind("sppl_cd")))
							.cutoff$and(S1_T1.maker_cd.like(bind("maker_cd")))
							.cutoff$and(S1_T1.bp_lot_no.like(bind("bp_lot_no")))
							.cutoff$and(S1_T3.po_d_no.like(bind("po_d_no")))
							.cutoff$and(S1_T2.mfg_inst_no.like(bind("mfg_inst_no")))
							.cutoff$and(S1_T1.sppl_itm_cd.like(bind("sppl_itm_cd")))
							.cutoff$and(S1_T1.sppl_itm_nm.like(bind("sppl_itm_nm")))
							.cutoff$and(S1_T1.purc_id_typ.like(bind("purc_id_typ")))
							.cutoff$and(S1_T1.sret_fr_cd.like(bind("sret_fr_cd")))
							.cutoff$and(S1_T1.cst_cd.like(bind("cst_cd")))
							.cutoff$and(S1_T2.iv_no.like(bind("iv_no")))
							.cutoff$and(S1_T3.iv_d_no.like(bind("iv_d_no")))
							.and(
								value(1).eq(value(0))
								.cutoff$or(
									bracket(
										bracket(
											S1_T1.edi_flg.eq(value(false))
											.or(S1_T1.edi_flg.isNull())
										)
										.and(bind("tmp_edi_f").eq(value(true)))
									)
								)
								.cutoff$or(
									bracket(
										S1_T1.edi_flg.eq(value(true))
										.and(bind("tmp_edi_t").eq(value(true)))
									)
								)
							)
							.cutoff$and(
								exists(
									subQuery()
									.select(value("X"))
									.from(S2_W1)
									.where(
										S2_W1.itm_cd.eq(S1_T1.itm_cd)
										.and(S2_W1.itm_sub1.eq(S1_T1.itm_sub1))
										.and(S2_W1.itm_sub2.eq(S1_T1.itm_sub2))
										.and(S2_W1.itm_sub3.eq(S1_T1.itm_sub3))
										.and(S2_W1.stk_lst_flg.eq(bind("tmp_stk_lst_flg_t")))
									)
								)
							)
							.cutoff$and(
								exists(
									subQuery()
									.select(value("X"))
									.from(
										S3_W1
										.innerJoin(S3_W2).on(
											S3_W2.purc_act_d_no.eq(S3_W1.purc_act_d_no)
											.and(S3_W2.purc_act_d_seq.eq(S3_W1.purc_act_d_seq))
										)
										.innerJoin(S3_W3).on(
											S3_W3.purc_act_no.eq(S3_W2.purc_act_no)
											.and(S3_W3.purc_act_seq.eq(S3_W2.purc_act_seq))
										)
									)
									.where(
										bracket(
											S3_W1.arr_act_no.eq(S1_T1.arr_act_no)
											.or(S3_W1.purc_act_io_no.eq(S1_T1.purc_act_io_no))
										)
										.and(S3_W3.slip_sts_typ.eq(value(MAC_SLIP_STS_TYP.CRT.value())))
										.and(S3_W3.purc_act_no.like(bind("purc_act_no")))
									)
								)
							)
							.cutoff$and(
								exists(
									subQuery()
									.select(value("X"))
									.from(
										S4_W1
										.innerJoin(S4_W2).on(
											S4_W2.sls_act_d_no.eq(S4_W1.sls_act_d_no)
											.and(S4_W2.sls_act_d_seq.eq(S4_W1.sls_act_d_seq))
										)
										.innerJoin(S4_W3).on(
											S4_W3.sls_act_no.eq(S4_W2.sls_act_no)
											.and(S4_W3.sls_act_seq.eq(S4_W2.sls_act_seq))
										)
									)
									.where(
										S4_W1.arr_act_no.eq(S1_T1.arr_act_no)
										.and(S4_W3.slip_sts_typ.eq(value(MAC_SLIP_STS_TYP.CRT.value())))
										.and(S4_W3.sls_act_no.like(bind("sls_act_no")))
									)
								)
							)
							.cutoff$and(
								exists(
									subQuery()
									.select(value("X"))
									.from(
										S10_W1
										.leftOuterJoin(S10_W2).on(S10_W2.rcpt_iv_d_no.eq(S10_W1.rcpt_iv_d_no))
										.leftOuterJoin(S10_W3).on(S10_W3.rcpt_iv_mng_no.eq(S10_W2.rcpt_iv_mng_no))
									)
									.where(
										bracket(
											S10_W1.arr_act_no.eq(S1_T1.arr_act_no)
												.or(S10_W1.arr_schd_no.eq(S1_T1.arr_schd_no))
										)
										.and(S10_W1.rcpt_iv_no.like(bind("rcpt_iv_no"))
												.or(S10_W3.rcpt_iv_no.like(bind("rcpt_iv_no"))))
									)
									.union(
										subQuery()
										.select(value("X"))
										.from(
											S11_W1
											.innerJoin(S11_W2).on(
												S11_W2.purc_act_d_no.eq(S11_W1.purc_act_d_no)
												.and(S11_W2.purc_act_d_seq.eq(S11_W1.purc_act_d_seq))
											)
											.innerJoin(S11_W3).on(
												S11_W3.purc_act_no.eq(S11_W2.purc_act_no)
												.and(S11_W3.purc_act_seq.eq(S11_W2.purc_act_seq))
											)
										)
										.where(
											S11_W1.arr_act_no.eq(S1_T1.arr_act_no)
											.and(S11_W3.slip_sts_typ.eq(value(MAC_SLIP_STS_TYP.CRT.value())))
											.and(S11_W3.rcpt_iv_no.like(bind("rcpt_iv_no")))
										)
									)
								)
							)
							.cutoff$and(
								exists(
									subQuery()
									.select(value("X"))
									.from(S10_W1)
									.where(
										bracket(
											S10_W1.arr_act_no.eq(S1_T1.arr_act_no)
												.or(S10_W1.arr_schd_no.eq(S1_T1.arr_schd_no))
										)
										.and(S10_W1.rcpt_iv_d_no.like(bind("rcpt_iv_d_no")))
									)
									.union(
										subQuery()
										.select(value("X"))
										.from(
											S12_W1
											.innerJoin(S12_W2).on(
												S12_W2.purc_act_d_no.eq(S11_W1.purc_act_d_no)
												.and(S12_W2.purc_act_d_seq.eq(S11_W1.purc_act_d_seq))
											)
											.innerJoin(S12_W3).on(
												S12_W3.purc_act_no.eq(S12_W2.purc_act_no)
												.and(S12_W3.purc_act_seq.eq(S12_W2.purc_act_seq))
											)
										)
										.where(
											S12_W1.arr_act_no.eq(S1_T1.arr_act_no)
											.and(S12_W3.slip_sts_typ.eq(value(MAC_SLIP_STS_TYP.CRT.value())))
											.and(S12_W2.rcpt_iv_d_no.like(bind("rcpt_iv_d_no")))
										)
									)
								)
							)
						).view(S0_V1)
						.leftOuterJoin(S0_ARR_LOC).on(S0_ARR_LOC.loc_cd.eq(S0_V1.pr(S1_T1.arr_loc_cd)))
						.addDynamicView(DS0D)
					)
					.where(
						value(0).eq(value(0))
						.addDynamicPredicate(DS0D)
						.and(
							exists(
								subQuery()
								.select(value("X"))
								.from(S5_W1)
								.where(
									S5_W1.loc_cd.eq(S0_V1.pr(S1_T1.arr_loc_cd))
								)
							)
							.or(
								exists(
									subQuery()
									.select(value("X"))
									.from(S6_W2)
									.where(
										S6_W2.lg_grp_cd.eq(S0_V1.pr("arr_lg_grp_cd"))
									)
								)
							)
						)
						.and(S0_ARR_LOC.sppl_cd.isNull())
						.cutoff$and(S0_ARR_LOC.loc_nm.like(bind("arr_loc_nm")))
						.cutoff$and(S0_ARR_LOC.site_cd.like(bind("arr_site_cd")))
						.cutoff$and(S0_ARR_LOC.alloc_grp_cd.like(bind("arr_alloc_grp_cd")))
						.cutoff$and(S0_ARR_LOC.sppl_cd.like(bind("prsppl_cd")))
						.cutoff$and(S0_V1.pr("rqst_dpt_cd").like(bind("rqst_dpt_cd")))
						.cutoff$and(S0_V1.pr("rqst_usr_cd").like(bind("rqst_usr_cd")))
						.cutoff$and(S0_V1.pr("prov_typ").like(bind("prov_typ")))
						.cutoff$and(S0_V1.pr("prov_basis_typ").like(bind("prov_basis_typ")))
						.cutoff$and(S0_V1.pr("prov_src_schd_typ").like(bind("prov_src_schd_typ")))
						.cutoff$and(S0_V1.pr("prov_src_schd_no1").like(bind("prov_src_schd_no1")))
						.cutoff$and(S0_V1.pr("prov_src_schd_no2").like(bind("prov_src_schd_no2")))
					)
					.orderBy(S0_V1.pr(S1_T1.arr_act_no).asc())
			)
			.setDynamicSQLInfo(
				when(boundOr("sppl_nm", "rcpt_iv_itm_nm", "po_grp_flg1", "po_grp_flg2", "po_grp_flg3", "po_grp_flg4", "po_grp_flg5", "po_grp_flg6", "po_grp_flg7", "po_grp_flg8", "po_grp_flg9", "po_grp_flg10"))
					.view(DS0D, v -> v.leftOuterJoin(S0_SPPL).on(S0_SPPL.bp_cd.eq(S0_V1.pr(S1_T1.sppl_cd))))
					.predicate(DS0D, p -> p.cutoff$and(S0_SPPL.bp_nm.like(bind("sppl_nm")))),
				when(boundOr("po_grp_flg1"))
					.select(DS0D, S0_SPPL.bp_grp_cd1.as("po_grp_cd1"))
					.groupBy(DS0D, S0_SPPL.bp_grp_cd1),
				when(boundOr("po_grp_flg1", "po_grp_cd1"))
					.predicate(DS0D, p -> p.cutoff$and(S0_SPPL.bp_grp_cd1.like(bind("po_grp_cd1")))),
				when(boundOr("po_grp_flg1"))
					.select(DS0D, S0_PO_GRP1.bp_grp_nm.as("po_grp_nm1"))
					.groupBy(DS0D, S0_PO_GRP1.bp_grp_nm),
				when(boundOr("po_grp_flg1", "po_grp_nm1"))
					.view(DS0D, v -> v.leftOuterJoin(S0_PO_GRP1).on(S0_SPPL.bp_grp_cd1.eq(S0_PO_GRP1.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP1.value()).eq(S0_PO_GRP1.bp_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_PO_GRP1.bp_grp_nm.like(bind("po_grp_nm1")))),
				when(boundOr("po_grp_flg2"))
					.select(DS0D, S0_SPPL.bp_grp_cd2.as("po_grp_cd2"))
					.groupBy(DS0D, S0_SPPL.bp_grp_cd2),
				when(boundOr("po_grp_flg2", "po_grp_cd2"))
					.predicate(DS0D, p -> p.cutoff$and(S0_SPPL.bp_grp_cd2.like(bind("po_grp_cd2")))),
				when(boundOr("po_grp_flg2"))
					.select(DS0D, S0_PO_GRP2.bp_grp_nm.as("po_grp_nm2"))
					.groupBy(DS0D, S0_PO_GRP2.bp_grp_nm),
				when(boundOr("po_grp_flg2", "po_grp_nm2"))
					.view(DS0D, v -> v.leftOuterJoin(S0_PO_GRP2).on(S0_SPPL.bp_grp_cd2.eq(S0_PO_GRP2.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP2.value()).eq(S0_PO_GRP2.bp_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_PO_GRP2.bp_grp_nm.like(bind("po_grp_nm2")))),
				when(boundOr("po_grp_flg3"))
					.select(DS0D, S0_SPPL.bp_grp_cd3.as("po_grp_cd3"))
					.groupBy(DS0D, S0_SPPL.bp_grp_cd3),
				when(boundOr("po_grp_flg3", "po_grp_cd3"))
					.predicate(DS0D, p -> p.cutoff$and(S0_SPPL.bp_grp_cd3.like(bind("po_grp_cd3")))),
				when(boundOr("po_grp_flg3"))
					.select(DS0D, S0_PO_GRP3.bp_grp_nm.as("po_grp_nm3"))
					.groupBy(DS0D, S0_PO_GRP3.bp_grp_nm),
				when(boundOr("po_grp_flg3", "po_grp_nm3"))
					.view(DS0D, v -> v.leftOuterJoin(S0_PO_GRP3).on(S0_SPPL.bp_grp_cd3.eq(S0_PO_GRP3.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP3.value()).eq(S0_PO_GRP3.bp_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_PO_GRP3.bp_grp_nm.like(bind("po_grp_nm3")))),
				when(boundOr("po_grp_flg4"))
					.select(DS0D, S0_SPPL.bp_grp_cd4.as("po_grp_cd4"))
					.groupBy(DS0D, S0_SPPL.bp_grp_cd4),
				when(boundOr("po_grp_flg4", "po_grp_cd4"))
					.predicate(DS0D, p -> p.cutoff$and(S0_SPPL.bp_grp_cd4.like(bind("po_grp_cd4")))),
				when(boundOr("po_grp_flg4"))
					.select(DS0D, S0_PO_GRP4.bp_grp_nm.as("po_grp_nm4"))
					.groupBy(DS0D, S0_PO_GRP4.bp_grp_nm),
				when(boundOr("po_grp_flg4", "po_grp_nm4"))
					.view(DS0D, v -> v.leftOuterJoin(S0_PO_GRP4).on(S0_SPPL.bp_grp_cd4.eq(S0_PO_GRP4.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP4.value()).eq(S0_PO_GRP4.bp_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_PO_GRP4.bp_grp_nm.like(bind("po_grp_nm4")))),
				when(boundOr("po_grp_flg5"))
					.select(DS0D, S0_SPPL.bp_grp_cd5.as("po_grp_cd5"))
					.groupBy(DS0D, S0_SPPL.bp_grp_cd5),
				when(boundOr("po_grp_flg5", "po_grp_cd5"))
					.predicate(DS0D, p -> p.cutoff$and(S0_SPPL.bp_grp_cd5.like(bind("po_grp_cd5")))),
				when(boundOr("po_grp_flg5"))
					.select(DS0D, S0_PO_GRP5.bp_grp_nm.as("po_grp_nm5"))
					.groupBy(DS0D, S0_PO_GRP5.bp_grp_nm),
				when(boundOr("po_grp_flg5", "po_grp_nm5"))
					.view(DS0D, v -> v.leftOuterJoin(S0_PO_GRP5).on(S0_SPPL.bp_grp_cd5.eq(S0_PO_GRP5.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP5.value()).eq(S0_PO_GRP5.bp_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_PO_GRP5.bp_grp_nm.like(bind("po_grp_nm5")))),
				when(boundOr("po_grp_flg6"))
					.select(DS0D, S0_SPPL.bp_grp_cd6.as("po_grp_cd6"))
					.groupBy(DS0D, S0_SPPL.bp_grp_cd6),
				when(boundOr("po_grp_flg6", "po_grp_cd6"))
					.predicate(DS0D, p -> p.cutoff$and(S0_SPPL.bp_grp_cd6.like(bind("po_grp_cd6")))),
				when(boundOr("po_grp_flg6"))
					.select(DS0D, S0_PO_GRP6.bp_grp_nm.as("po_grp_nm6"))
					.groupBy(DS0D, S0_PO_GRP6.bp_grp_nm),
				when(boundOr("po_grp_flg6", "po_grp_nm6"))
					.view(DS0D, v -> v.leftOuterJoin(S0_PO_GRP6).on(S0_SPPL.bp_grp_cd6.eq(S0_PO_GRP6.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP6.value()).eq(S0_PO_GRP6.bp_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_PO_GRP6.bp_grp_nm.like(bind("po_grp_nm6")))),
				when(boundOr("po_grp_flg7"))
					.select(DS0D, S0_SPPL.bp_grp_cd7.as("po_grp_cd7"))
					.groupBy(DS0D, S0_SPPL.bp_grp_cd7),
				when(boundOr("po_grp_flg7", "po_grp_cd7"))
					.predicate(DS0D, p -> p.cutoff$and(S0_SPPL.bp_grp_cd7.like(bind("po_grp_cd7")))),
				when(boundOr("po_grp_flg7"))
					.select(DS0D, S0_PO_GRP7.bp_grp_nm.as("po_grp_nm7"))
					.groupBy(DS0D, S0_PO_GRP7.bp_grp_nm),
				when(boundOr("po_grp_flg7", "po_grp_nm7"))
					.view(DS0D, v -> v.leftOuterJoin(S0_PO_GRP7).on(S0_SPPL.bp_grp_cd7.eq(S0_PO_GRP7.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP7.value()).eq(S0_PO_GRP7.bp_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_PO_GRP7.bp_grp_nm.like(bind("po_grp_nm7")))),
				when(boundOr("po_grp_flg8"))
					.select(DS0D, S0_SPPL.bp_grp_cd8.as("po_grp_cd8"))
					.groupBy(DS0D, S0_SPPL.bp_grp_cd8),
				when(boundOr("po_grp_flg8", "po_grp_cd8"))
					.predicate(DS0D, p -> p.cutoff$and(S0_SPPL.bp_grp_cd8.like(bind("po_grp_cd8")))),
				when(boundOr("po_grp_flg8"))
					.select(DS0D, S0_PO_GRP8.bp_grp_nm.as("po_grp_nm8"))
					.groupBy(DS0D, S0_PO_GRP8.bp_grp_nm),
				when(boundOr("po_grp_flg8", "po_grp_nm8"))
					.view(DS0D, v -> v.leftOuterJoin(S0_PO_GRP8).on(S0_SPPL.bp_grp_cd8.eq(S0_PO_GRP8.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP8.value()).eq(S0_PO_GRP8.bp_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_PO_GRP8.bp_grp_nm.like(bind("po_grp_nm8")))),
				when(boundOr("po_grp_flg9"))
					.select(DS0D, S0_SPPL.bp_grp_cd9.as("po_grp_cd9"))
					.groupBy(DS0D, S0_SPPL.bp_grp_cd9),
				when(boundOr("po_grp_flg9", "po_grp_cd9"))
					.predicate(DS0D, p -> p.cutoff$and(S0_SPPL.bp_grp_cd9.like(bind("po_grp_cd9")))),
				when(boundOr("po_grp_flg9"))
					.select(DS0D, S0_PO_GRP9.bp_grp_nm.as("po_grp_nm9"))
					.groupBy(DS0D, S0_PO_GRP9.bp_grp_nm),
				when(boundOr("po_grp_flg9", "po_grp_nm9"))
					.view(DS0D, v -> v.leftOuterJoin(S0_PO_GRP9).on(S0_SPPL.bp_grp_cd9.eq(S0_PO_GRP9.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP9.value()).eq(S0_PO_GRP9.bp_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_PO_GRP9.bp_grp_nm.like(bind("po_grp_nm9")))),
				when(boundOr("po_grp_flg10"))
					.select(DS0D, S0_SPPL.bp_grp_cd10.as("po_grp_cd10"))
					.groupBy(DS0D, S0_SPPL.bp_grp_cd10),
				when(boundOr("po_grp_flg10", "po_grp_cd10"))
					.predicate(DS0D, p -> p.cutoff$and(S0_SPPL.bp_grp_cd10.like(bind("po_grp_cd10")))),
				when(boundOr("po_grp_flg10"))
					.select(DS0D, S0_PO_GRP10.bp_grp_nm.as("po_grp_nm10"))
					.groupBy(DS0D, S0_PO_GRP10.bp_grp_nm),
				when(boundOr("po_grp_flg10", "po_grp_nm10"))
					.view(DS0D, v -> v.leftOuterJoin(S0_PO_GRP10).on(S0_SPPL.bp_grp_cd10.eq(S0_PO_GRP10.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP10.value()).eq(S0_PO_GRP10.bp_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_PO_GRP10.bp_grp_nm.like(bind("po_grp_nm10")))),
				when(boundOr("sret_fr_cd", "sret_fr_nm", "sret_fr_grp_flg1", "sret_fr_grp_flg2", "sret_fr_grp_flg3", "sret_fr_grp_flg4", "sret_fr_grp_flg5", "sret_fr_grp_flg6", "sret_fr_grp_flg7", "sret_fr_grp_flg8", "sret_fr_grp_flg9", "sret_fr_grp_flg10", "sls_ret_schd_no", "cst_po_no", "cst_itm_cd", "cst_itm_nm"))
					.view(DS0D, v -> v.leftOuterJoin(S0_SRET_SCHD_D).on(S0_SRET_SCHD_D.sls_ret_schd_d_no.eq(S0_V1.pr(S1_T3.sls_ret_schd_d_no))).leftOuterJoin(S0_SRET_FR).on(S0_SRET_FR.bp_cd.eq(S0_V1.pr(S1_T1.sret_fr_cd))))
					.predicate(DS0D, p -> p.cutoff$and(nvl(S0_SRET_SCHD_D.sret_fr_nm,S0_SRET_FR.bp_nm).like(bind("sret_fr_nm")))),
				when(boundOr("sret_fr_grp_flg1"))
					.select(DS0D, S0_SRET_FR.bp_grp_cd1.as("sret_fr_grp_cd1"))
					.groupBy(DS0D, S0_SRET_FR.bp_grp_cd1),
				when(boundOr("sret_fr_grp_flg1", "sret_fr_grp_cd1"))
					.predicate(DS0D, p -> p.cutoff$and(S0_SRET_FR.bp_grp_cd1.like(bind("sret_fr_grp_cd1")))),
				when(boundOr("sret_fr_grp_flg1"))
					.select(DS0D, S0_SRET_FR_GRP1.bp_grp_nm.as("sret_fr_grp_nm1"))
					.groupBy(DS0D, S0_SRET_FR_GRP1.bp_grp_nm),
				when(boundOr("sret_fr_grp_flg1", "sret_fr_grp_nm1"))
					.view(DS0D, v -> v.leftOuterJoin(S0_SRET_FR_GRP1).on(S0_SRET_FR.bp_grp_cd1.eq(S0_SRET_FR_GRP1.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP1.value()).eq(S0_SRET_FR_GRP1.bp_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_SRET_FR_GRP1.bp_grp_nm.like(bind("sret_fr_grp_nm1")))),
				when(boundOr("sret_fr_grp_flg2"))
					.select(DS0D, S0_SRET_FR.bp_grp_cd2.as("sret_fr_grp_cd2"))
					.groupBy(DS0D, S0_SRET_FR.bp_grp_cd2),
				when(boundOr("sret_fr_grp_flg2", "sret_fr_grp_cd2"))
					.predicate(DS0D, p -> p.cutoff$and(S0_SRET_FR.bp_grp_cd2.like(bind("sret_fr_grp_cd2")))),
				when(boundOr("sret_fr_grp_flg2"))
					.select(DS0D, S0_SRET_FR_GRP2.bp_grp_nm.as("sret_fr_grp_nm2"))
					.groupBy(DS0D, S0_SRET_FR_GRP2.bp_grp_nm),
				when(boundOr("sret_fr_grp_flg2", "sret_fr_grp_nm2"))
					.view(DS0D, v -> v.leftOuterJoin(S0_SRET_FR_GRP2).on(S0_SRET_FR.bp_grp_cd2.eq(S0_SRET_FR_GRP2.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP2.value()).eq(S0_SRET_FR_GRP2.bp_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_SRET_FR_GRP2.bp_grp_nm.like(bind("sret_fr_grp_nm2")))),
				when(boundOr("sret_fr_grp_flg3"))
					.select(DS0D, S0_SRET_FR.bp_grp_cd3.as("sret_fr_grp_cd3"))
					.groupBy(DS0D, S0_SRET_FR.bp_grp_cd3),
				when(boundOr("sret_fr_grp_flg3", "sret_fr_grp_cd3"))
					.predicate(DS0D, p -> p.cutoff$and(S0_SRET_FR.bp_grp_cd3.like(bind("sret_fr_grp_cd3")))),
				when(boundOr("sret_fr_grp_flg3"))
					.select(DS0D, S0_SRET_FR_GRP3.bp_grp_nm.as("sret_fr_grp_nm3"))
					.groupBy(DS0D, S0_SRET_FR_GRP3.bp_grp_nm),
				when(boundOr("sret_fr_grp_flg3", "sret_fr_grp_nm3"))
					.view(DS0D, v -> v.leftOuterJoin(S0_SRET_FR_GRP3).on(S0_SRET_FR.bp_grp_cd3.eq(S0_SRET_FR_GRP3.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP3.value()).eq(S0_SRET_FR_GRP3.bp_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_SRET_FR_GRP3.bp_grp_nm.like(bind("sret_fr_grp_nm3")))),
				when(boundOr("sret_fr_grp_flg4"))
					.select(DS0D, S0_SRET_FR.bp_grp_cd4.as("sret_fr_grp_cd4"))
					.groupBy(DS0D, S0_SRET_FR.bp_grp_cd4),
				when(boundOr("sret_fr_grp_flg4", "sret_fr_grp_cd4"))
					.predicate(DS0D, p -> p.cutoff$and(S0_SRET_FR.bp_grp_cd4.like(bind("sret_fr_grp_cd4")))),
				when(boundOr("sret_fr_grp_flg4"))
					.select(DS0D, S0_SRET_FR_GRP4.bp_grp_nm.as("sret_fr_grp_nm4"))
					.groupBy(DS0D, S0_SRET_FR_GRP4.bp_grp_nm),
				when(boundOr("sret_fr_grp_flg4", "sret_fr_grp_nm4"))
					.view(DS0D, v -> v.leftOuterJoin(S0_SRET_FR_GRP4).on(S0_SRET_FR.bp_grp_cd4.eq(S0_SRET_FR_GRP4.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP4.value()).eq(S0_SRET_FR_GRP4.bp_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_SRET_FR_GRP4.bp_grp_nm.like(bind("sret_fr_grp_nm4")))),
				when(boundOr("sret_fr_grp_flg5"))
					.select(DS0D, S0_SRET_FR.bp_grp_cd5.as("sret_fr_grp_cd5"))
					.groupBy(DS0D, S0_SRET_FR.bp_grp_cd5),
				when(boundOr("sret_fr_grp_flg5", "sret_fr_grp_cd5"))
					.predicate(DS0D, p -> p.cutoff$and(S0_SRET_FR.bp_grp_cd5.like(bind("sret_fr_grp_cd5")))),
				when(boundOr("sret_fr_grp_flg5"))
					.select(DS0D, S0_SRET_FR_GRP5.bp_grp_nm.as("sret_fr_grp_nm5"))
					.groupBy(DS0D, S0_SRET_FR_GRP5.bp_grp_nm),
				when(boundOr("sret_fr_grp_flg5", "sret_fr_grp_nm5"))
					.view(DS0D, v -> v.leftOuterJoin(S0_SRET_FR_GRP5).on(S0_SRET_FR.bp_grp_cd5.eq(S0_SRET_FR_GRP5.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP5.value()).eq(S0_SRET_FR_GRP5.bp_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_SRET_FR_GRP5.bp_grp_nm.like(bind("sret_fr_grp_nm5")))),
				when(boundOr("sret_fr_grp_flg6"))
					.select(DS0D, S0_SRET_FR.bp_grp_cd6.as("sret_fr_grp_cd6"))
					.groupBy(DS0D, S0_SRET_FR.bp_grp_cd6),
				when(boundOr("sret_fr_grp_flg6", "sret_fr_grp_cd6"))
					.predicate(DS0D, p -> p.cutoff$and(S0_SRET_FR.bp_grp_cd6.like(bind("sret_fr_grp_cd6")))),
				when(boundOr("sret_fr_grp_flg6"))
					.select(DS0D, S0_SRET_FR_GRP6.bp_grp_nm.as("sret_fr_grp_nm6"))
					.groupBy(DS0D, S0_SRET_FR_GRP6.bp_grp_nm),
				when(boundOr("sret_fr_grp_flg6", "sret_fr_grp_nm6"))
					.view(DS0D, v -> v.leftOuterJoin(S0_SRET_FR_GRP6).on(S0_SRET_FR.bp_grp_cd6.eq(S0_SRET_FR_GRP6.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP6.value()).eq(S0_SRET_FR_GRP6.bp_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_SRET_FR_GRP6.bp_grp_nm.like(bind("sret_fr_grp_nm6")))),
				when(boundOr("sret_fr_grp_flg7"))
					.select(DS0D, S0_SRET_FR.bp_grp_cd7.as("sret_fr_grp_cd7"))
					.groupBy(DS0D, S0_SRET_FR.bp_grp_cd7),
				when(boundOr("sret_fr_grp_flg7", "sret_fr_grp_cd7"))
					.predicate(DS0D, p -> p.cutoff$and(S0_SRET_FR.bp_grp_cd7.like(bind("sret_fr_grp_cd7")))),
				when(boundOr("sret_fr_grp_flg7"))
					.select(DS0D, S0_SRET_FR_GRP7.bp_grp_nm.as("sret_fr_grp_nm7"))
					.groupBy(DS0D, S0_SRET_FR_GRP7.bp_grp_nm),
				when(boundOr("sret_fr_grp_flg7", "sret_fr_grp_nm7"))
					.view(DS0D, v -> v.leftOuterJoin(S0_SRET_FR_GRP7).on(S0_SRET_FR.bp_grp_cd7.eq(S0_SRET_FR_GRP7.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP7.value()).eq(S0_SRET_FR_GRP7.bp_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_SRET_FR_GRP7.bp_grp_nm.like(bind("sret_fr_grp_nm7")))),
				when(boundOr("sret_fr_grp_flg8"))
					.select(DS0D, S0_SRET_FR.bp_grp_cd8.as("sret_fr_grp_cd8"))
					.groupBy(DS0D, S0_SRET_FR.bp_grp_cd8),
				when(boundOr("sret_fr_grp_flg8", "sret_fr_grp_cd8"))
					.predicate(DS0D, p -> p.cutoff$and(S0_SRET_FR.bp_grp_cd8.like(bind("sret_fr_grp_cd8")))),
				when(boundOr("sret_fr_grp_flg8"))
					.select(DS0D, S0_SRET_FR_GRP8.bp_grp_nm.as("sret_fr_grp_nm8"))
					.groupBy(DS0D, S0_SRET_FR_GRP8.bp_grp_nm),
				when(boundOr("sret_fr_grp_flg8", "sret_fr_grp_nm8"))
					.view(DS0D, v -> v.leftOuterJoin(S0_SRET_FR_GRP8).on(S0_SRET_FR.bp_grp_cd8.eq(S0_SRET_FR_GRP8.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP8.value()).eq(S0_SRET_FR_GRP8.bp_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_SRET_FR_GRP8.bp_grp_nm.like(bind("sret_fr_grp_nm8")))),
				when(boundOr("sret_fr_grp_flg9"))
					.select(DS0D, S0_SRET_FR.bp_grp_cd9.as("sret_fr_grp_cd9"))
					.groupBy(DS0D, S0_SRET_FR.bp_grp_cd9),
				when(boundOr("sret_fr_grp_flg9", "sret_fr_grp_cd9"))
					.predicate(DS0D, p -> p.cutoff$and(S0_SRET_FR.bp_grp_cd9.like(bind("sret_fr_grp_cd9")))),
				when(boundOr("sret_fr_grp_flg9"))
					.select(DS0D, S0_SRET_FR_GRP9.bp_grp_nm.as("sret_fr_grp_nm9"))
					.groupBy(DS0D, S0_SRET_FR_GRP9.bp_grp_nm),
				when(boundOr("sret_fr_grp_flg9", "sret_fr_grp_nm9"))
					.view(DS0D, v -> v.leftOuterJoin(S0_SRET_FR_GRP9).on(S0_SRET_FR.bp_grp_cd9.eq(S0_SRET_FR_GRP9.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP9.value()).eq(S0_SRET_FR_GRP9.bp_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_SRET_FR_GRP9.bp_grp_nm.like(bind("sret_fr_grp_nm9")))),
				when(boundOr("sret_fr_grp_flg10"))
					.select(DS0D, S0_SRET_FR.bp_grp_cd10.as("sret_fr_grp_cd10"))
					.groupBy(DS0D, S0_SRET_FR.bp_grp_cd10),
				when(boundOr("sret_fr_grp_flg10", "sret_fr_grp_cd10"))
					.predicate(DS0D, p -> p.cutoff$and(S0_SRET_FR.bp_grp_cd10.like(bind("sret_fr_grp_cd10")))),
				when(boundOr("sret_fr_grp_flg10"))
					.select(DS0D, S0_SRET_FR_GRP10.bp_grp_nm.as("sret_fr_grp_nm10"))
					.groupBy(DS0D, S0_SRET_FR_GRP10.bp_grp_nm),
				when(boundOr("sret_fr_grp_flg10", "sret_fr_grp_nm10"))
					.view(DS0D, v -> v.leftOuterJoin(S0_SRET_FR_GRP10).on(S0_SRET_FR.bp_grp_cd10.eq(S0_SRET_FR_GRP10.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP10.value()).eq(S0_SRET_FR_GRP10.bp_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_SRET_FR_GRP10.bp_grp_nm.like(bind("sret_fr_grp_nm10")))),
				when(boundOr("cst_nm", "cst_grp_flg1", "cst_grp_flg2", "cst_grp_flg3", "cst_grp_flg4", "cst_grp_flg5", "cst_grp_flg6", "cst_grp_flg7", "cst_grp_flg8", "cst_grp_flg9", "cst_grp_flg10"))
					.view(DS0D, v -> v.leftOuterJoin(S0_CST).on(S0_CST.bp_cd.eq(S0_V1.pr(S1_T1.cst_cd))))
					.predicate(DS0D, p -> p.cutoff$and(S0_CST.bp_nm.like(bind("cst_nm")))),
				when(boundOr("cst_grp_flg1"))
					.select(DS0D, S0_CST.bp_grp_cd1.as("cst_grp_cd1"))
					.groupBy(DS0D, S0_CST.bp_grp_cd1),
				when(boundOr("cst_grp_flg1", "cst_grp_cd1"))
					.predicate(DS0D, p -> p.cutoff$and(S0_CST.bp_grp_cd1.like(bind("cst_grp_cd1")))),
				when(boundOr("cst_grp_flg1"))
					.select(DS0D, S0_CST_GRP1.bp_grp_nm.as("cst_grp_nm1"))
					.groupBy(DS0D, S0_CST_GRP1.bp_grp_nm),
				when(boundOr("cst_grp_flg1", "cst_grp_nm1"))
					.view(DS0D, v -> v.leftOuterJoin(S0_CST_GRP1).on(S0_CST.bp_grp_cd1.eq(S0_CST_GRP1.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP1.value()).eq(S0_CST_GRP1.bp_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_CST_GRP1.bp_grp_nm.like(bind("cst_grp_nm1")))),
				when(boundOr("cst_grp_flg2"))
					.select(DS0D, S0_CST.bp_grp_cd2.as("cst_grp_cd2"))
					.groupBy(DS0D, S0_CST.bp_grp_cd2),
				when(boundOr("cst_grp_flg2", "cst_grp_cd2"))
					.predicate(DS0D, p -> p.cutoff$and(S0_CST.bp_grp_cd2.like(bind("cst_grp_cd2")))),
				when(boundOr("cst_grp_flg2"))
					.select(DS0D, S0_CST_GRP2.bp_grp_nm.as("cst_grp_nm2"))
					.groupBy(DS0D, S0_CST_GRP2.bp_grp_nm),
				when(boundOr("cst_grp_flg2", "cst_grp_nm2"))
					.view(DS0D, v -> v.leftOuterJoin(S0_CST_GRP2).on(S0_CST.bp_grp_cd2.eq(S0_CST_GRP2.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP2.value()).eq(S0_CST_GRP2.bp_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_CST_GRP2.bp_grp_nm.like(bind("cst_grp_nm2")))),
				when(boundOr("cst_grp_flg3"))
					.select(DS0D, S0_CST.bp_grp_cd3.as("cst_grp_cd3"))
					.groupBy(DS0D, S0_CST.bp_grp_cd3),
				when(boundOr("cst_grp_flg3", "cst_grp_cd3"))
					.predicate(DS0D, p -> p.cutoff$and(S0_CST.bp_grp_cd3.like(bind("cst_grp_cd3")))),
				when(boundOr("cst_grp_flg3"))
					.select(DS0D, S0_CST_GRP3.bp_grp_nm.as("cst_grp_nm3"))
					.groupBy(DS0D, S0_CST_GRP3.bp_grp_nm),
				when(boundOr("cst_grp_flg3", "cst_grp_nm3"))
					.view(DS0D, v -> v.leftOuterJoin(S0_CST_GRP3).on(S0_CST.bp_grp_cd3.eq(S0_CST_GRP3.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP3.value()).eq(S0_CST_GRP3.bp_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_CST_GRP3.bp_grp_nm.like(bind("cst_grp_nm3")))),
				when(boundOr("cst_grp_flg4"))
					.select(DS0D, S0_CST.bp_grp_cd4.as("cst_grp_cd4"))
					.groupBy(DS0D, S0_CST.bp_grp_cd4),
				when(boundOr("cst_grp_flg4", "cst_grp_cd4"))
					.predicate(DS0D, p -> p.cutoff$and(S0_CST.bp_grp_cd4.like(bind("cst_grp_cd4")))),
				when(boundOr("cst_grp_flg4"))
					.select(DS0D, S0_CST_GRP4.bp_grp_nm.as("cst_grp_nm4"))
					.groupBy(DS0D, S0_CST_GRP4.bp_grp_nm),
				when(boundOr("cst_grp_flg4", "cst_grp_nm4"))
					.view(DS0D, v -> v.leftOuterJoin(S0_CST_GRP4).on(S0_CST.bp_grp_cd4.eq(S0_CST_GRP4.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP4.value()).eq(S0_CST_GRP4.bp_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_CST_GRP4.bp_grp_nm.like(bind("cst_grp_nm4")))),
				when(boundOr("cst_grp_flg5"))
					.select(DS0D, S0_CST.bp_grp_cd5.as("cst_grp_cd5"))
					.groupBy(DS0D, S0_CST.bp_grp_cd5),
				when(boundOr("cst_grp_flg5", "cst_grp_cd5"))
					.predicate(DS0D, p -> p.cutoff$and(S0_CST.bp_grp_cd5.like(bind("cst_grp_cd5")))),
				when(boundOr("cst_grp_flg5"))
					.select(DS0D, S0_CST_GRP5.bp_grp_nm.as("cst_grp_nm5"))
					.groupBy(DS0D, S0_CST_GRP5.bp_grp_nm),
				when(boundOr("cst_grp_flg5", "cst_grp_nm5"))
					.view(DS0D, v -> v.leftOuterJoin(S0_CST_GRP5).on(S0_CST.bp_grp_cd5.eq(S0_CST_GRP5.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP5.value()).eq(S0_CST_GRP5.bp_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_CST_GRP5.bp_grp_nm.like(bind("cst_grp_nm5")))),
				when(boundOr("cst_grp_flg6"))
					.select(DS0D, S0_CST.bp_grp_cd6.as("cst_grp_cd6"))
					.groupBy(DS0D, S0_CST.bp_grp_cd6),
				when(boundOr("cst_grp_flg6", "cst_grp_cd6"))
					.predicate(DS0D, p -> p.cutoff$and(S0_CST.bp_grp_cd6.like(bind("cst_grp_cd6")))),
				when(boundOr("cst_grp_flg6"))
					.select(DS0D, S0_CST_GRP6.bp_grp_nm.as("cst_grp_nm6"))
					.groupBy(DS0D, S0_CST_GRP6.bp_grp_nm),
				when(boundOr("cst_grp_flg6", "cst_grp_nm6"))
					.view(DS0D, v -> v.leftOuterJoin(S0_CST_GRP6).on(S0_CST.bp_grp_cd6.eq(S0_CST_GRP6.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP6.value()).eq(S0_CST_GRP6.bp_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_CST_GRP6.bp_grp_nm.like(bind("cst_grp_nm6")))),
				when(boundOr("cst_grp_flg7"))
					.select(DS0D, S0_CST.bp_grp_cd7.as("cst_grp_cd7"))
					.groupBy(DS0D, S0_CST.bp_grp_cd7),
				when(boundOr("cst_grp_flg7", "cst_grp_cd7"))
					.predicate(DS0D, p -> p.cutoff$and(S0_CST.bp_grp_cd7.like(bind("cst_grp_cd7")))),
				when(boundOr("cst_grp_flg7"))
					.select(DS0D, S0_CST_GRP7.bp_grp_nm.as("cst_grp_nm7"))
					.groupBy(DS0D, S0_CST_GRP7.bp_grp_nm),
				when(boundOr("cst_grp_flg7", "cst_grp_nm7"))
					.view(DS0D, v -> v.leftOuterJoin(S0_CST_GRP7).on(S0_CST.bp_grp_cd7.eq(S0_CST_GRP7.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP7.value()).eq(S0_CST_GRP7.bp_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_CST_GRP7.bp_grp_nm.like(bind("cst_grp_nm7")))),
				when(boundOr("cst_grp_flg8"))
					.select(DS0D, S0_CST.bp_grp_cd8.as("cst_grp_cd8"))
					.groupBy(DS0D, S0_CST.bp_grp_cd8),
				when(boundOr("cst_grp_flg8", "cst_grp_cd8"))
					.predicate(DS0D, p -> p.cutoff$and(S0_CST.bp_grp_cd8.like(bind("cst_grp_cd8")))),
				when(boundOr("cst_grp_flg8"))
					.select(DS0D, S0_CST_GRP8.bp_grp_nm.as("cst_grp_nm8"))
					.groupBy(DS0D, S0_CST_GRP8.bp_grp_nm),
				when(boundOr("cst_grp_flg8", "cst_grp_nm8"))
					.view(DS0D, v -> v.leftOuterJoin(S0_CST_GRP8).on(S0_CST.bp_grp_cd8.eq(S0_CST_GRP8.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP8.value()).eq(S0_CST_GRP8.bp_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_CST_GRP8.bp_grp_nm.like(bind("cst_grp_nm8")))),
				when(boundOr("cst_grp_flg9"))
					.select(DS0D, S0_CST.bp_grp_cd9.as("cst_grp_cd9"))
					.groupBy(DS0D, S0_CST.bp_grp_cd9),
				when(boundOr("cst_grp_flg9", "cst_grp_cd9"))
					.predicate(DS0D, p -> p.cutoff$and(S0_CST.bp_grp_cd9.like(bind("cst_grp_cd9")))),
				when(boundOr("cst_grp_flg9"))
					.select(DS0D, S0_CST_GRP9.bp_grp_nm.as("cst_grp_nm9"))
					.groupBy(DS0D, S0_CST_GRP9.bp_grp_nm),
				when(boundOr("cst_grp_flg9", "cst_grp_nm9"))
					.view(DS0D, v -> v.leftOuterJoin(S0_CST_GRP9).on(S0_CST.bp_grp_cd9.eq(S0_CST_GRP9.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP9.value()).eq(S0_CST_GRP9.bp_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_CST_GRP9.bp_grp_nm.like(bind("cst_grp_nm9")))),
				when(boundOr("cst_grp_flg10"))
					.select(DS0D, S0_CST.bp_grp_cd10.as("cst_grp_cd10"))
					.groupBy(DS0D, S0_CST.bp_grp_cd10),
				when(boundOr("cst_grp_flg10", "cst_grp_cd10"))
					.predicate(DS0D, p -> p.cutoff$and(S0_CST.bp_grp_cd10.like(bind("cst_grp_cd10")))),
				when(boundOr("cst_grp_flg10"))
					.select(DS0D, S0_CST_GRP10.bp_grp_nm.as("cst_grp_nm10"))
					.groupBy(DS0D, S0_CST_GRP10.bp_grp_nm),
				when(boundOr("cst_grp_flg10", "cst_grp_nm10"))
					.view(DS0D, v -> v.leftOuterJoin(S0_CST_GRP10).on(S0_CST.bp_grp_cd10.eq(S0_CST_GRP10.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP10.value()).eq(S0_CST_GRP10.bp_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_CST_GRP10.bp_grp_nm.like(bind("cst_grp_nm10")))),
				when(boundOr("prsppl_nm", "prsppl_grp_flg1", "prsppl_grp_flg2", "prsppl_grp_flg3", "prsppl_grp_flg4", "prsppl_grp_flg5", "prsppl_grp_flg6", "prsppl_grp_flg7", "prsppl_grp_flg8", "prsppl_grp_flg9", "prsppl_grp_flg10"))
					.view(DS0D, v -> v.leftOuterJoin(S0_PRSPPL).on(S0_PRSPPL.bp_cd.eq(S0_ARR_LOC.sppl_cd)))
					.predicate(DS0D, p -> p.cutoff$and(S0_PRSPPL.bp_nm.like(bind("prsppl_nm")))),
				when(boundOr("prsppl_grp_flg1"))
					.select(DS0D, S0_PRSPPL.bp_grp_cd1.as("prsppl_grp_cd1"))
					.groupBy(DS0D, S0_PRSPPL.bp_grp_cd1),
				when(boundOr("prsppl_grp_flg1", "prsppl_grp_cd1"))
					.predicate(DS0D, p -> p.cutoff$and(S0_PRSPPL.bp_grp_cd1.like(bind("prsppl_grp_cd1")))),
				when(boundOr("prsppl_grp_flg1"))
					.select(DS0D, S0_PRSPPL_GRP1.bp_grp_nm.as("prsppl_grp_nm1"))
					.groupBy(DS0D, S0_PRSPPL_GRP1.bp_grp_nm),
				when(boundOr("prsppl_grp_flg1", "prsppl_grp_nm1"))
					.view(DS0D, v -> v.leftOuterJoin(S0_PRSPPL_GRP1).on(S0_PRSPPL.bp_grp_cd1.eq(S0_PRSPPL_GRP1.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP1.value()).eq(S0_PRSPPL_GRP1.bp_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_PRSPPL_GRP1.bp_grp_nm.like(bind("prsppl_grp_nm1")))),
				when(boundOr("prsppl_grp_flg2"))
					.select(DS0D, S0_PRSPPL.bp_grp_cd2.as("prsppl_grp_cd2"))
					.groupBy(DS0D, S0_PRSPPL.bp_grp_cd2),
				when(boundOr("prsppl_grp_flg2", "prsppl_grp_cd2"))
					.predicate(DS0D, p -> p.cutoff$and(S0_PRSPPL.bp_grp_cd2.like(bind("prsppl_grp_cd2")))),
				when(boundOr("prsppl_grp_flg2"))
					.select(DS0D, S0_PRSPPL_GRP2.bp_grp_nm.as("prsppl_grp_nm2"))
					.groupBy(DS0D, S0_PRSPPL_GRP2.bp_grp_nm),
				when(boundOr("prsppl_grp_flg2", "prsppl_grp_nm2"))
					.view(DS0D, v -> v.leftOuterJoin(S0_PRSPPL_GRP2).on(S0_PRSPPL.bp_grp_cd2.eq(S0_PRSPPL_GRP2.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP2.value()).eq(S0_PRSPPL_GRP2.bp_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_PRSPPL_GRP2.bp_grp_nm.like(bind("prsppl_grp_nm2")))),
				when(boundOr("prsppl_grp_flg3"))
					.select(DS0D, S0_PRSPPL.bp_grp_cd3.as("prsppl_grp_cd3"))
					.groupBy(DS0D, S0_PRSPPL.bp_grp_cd3),
				when(boundOr("prsppl_grp_flg3", "prsppl_grp_cd3"))
					.predicate(DS0D, p -> p.cutoff$and(S0_PRSPPL.bp_grp_cd3.like(bind("prsppl_grp_cd3")))),
				when(boundOr("prsppl_grp_flg3"))
					.select(DS0D, S0_PRSPPL_GRP3.bp_grp_nm.as("prsppl_grp_nm3"))
					.groupBy(DS0D, S0_PRSPPL_GRP3.bp_grp_nm),
				when(boundOr("prsppl_grp_flg3", "prsppl_grp_nm3"))
					.view(DS0D, v -> v.leftOuterJoin(S0_PRSPPL_GRP3).on(S0_PRSPPL.bp_grp_cd3.eq(S0_PRSPPL_GRP3.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP3.value()).eq(S0_PRSPPL_GRP3.bp_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_PRSPPL_GRP3.bp_grp_nm.like(bind("prsppl_grp_nm3")))),
				when(boundOr("prsppl_grp_flg4"))
					.select(DS0D, S0_PRSPPL.bp_grp_cd4.as("prsppl_grp_cd4"))
					.groupBy(DS0D, S0_PRSPPL.bp_grp_cd4),
				when(boundOr("prsppl_grp_flg4", "prsppl_grp_cd4"))
					.predicate(DS0D, p -> p.cutoff$and(S0_PRSPPL.bp_grp_cd4.like(bind("prsppl_grp_cd4")))),
				when(boundOr("prsppl_grp_flg4"))
					.select(DS0D, S0_PRSPPL_GRP4.bp_grp_nm.as("prsppl_grp_nm4"))
					.groupBy(DS0D, S0_PRSPPL_GRP4.bp_grp_nm),
				when(boundOr("prsppl_grp_flg4", "prsppl_grp_nm4"))
					.view(DS0D, v -> v.leftOuterJoin(S0_PRSPPL_GRP4).on(S0_PRSPPL.bp_grp_cd4.eq(S0_PRSPPL_GRP4.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP4.value()).eq(S0_PRSPPL_GRP4.bp_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_PRSPPL_GRP4.bp_grp_nm.like(bind("prsppl_grp_nm4")))),
				when(boundOr("prsppl_grp_flg5"))
					.select(DS0D, S0_PRSPPL.bp_grp_cd5.as("prsppl_grp_cd5"))
					.groupBy(DS0D, S0_PRSPPL.bp_grp_cd5),
				when(boundOr("prsppl_grp_flg5", "prsppl_grp_cd5"))
					.predicate(DS0D, p -> p.cutoff$and(S0_PRSPPL.bp_grp_cd5.like(bind("prsppl_grp_cd5")))),
				when(boundOr("prsppl_grp_flg5"))
					.select(DS0D, S0_PRSPPL_GRP5.bp_grp_nm.as("prsppl_grp_nm5"))
					.groupBy(DS0D, S0_PRSPPL_GRP5.bp_grp_nm),
				when(boundOr("prsppl_grp_flg5", "prsppl_grp_nm5"))
					.view(DS0D, v -> v.leftOuterJoin(S0_PRSPPL_GRP5).on(S0_PRSPPL.bp_grp_cd5.eq(S0_PRSPPL_GRP5.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP5.value()).eq(S0_PRSPPL_GRP5.bp_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_PRSPPL_GRP5.bp_grp_nm.like(bind("prsppl_grp_nm5")))),
				when(boundOr("prsppl_grp_flg6"))
					.select(DS0D, S0_PRSPPL.bp_grp_cd6.as("prsppl_grp_cd6"))
					.groupBy(DS0D, S0_PRSPPL.bp_grp_cd6),
				when(boundOr("prsppl_grp_flg6", "prsppl_grp_cd6"))
					.predicate(DS0D, p -> p.cutoff$and(S0_PRSPPL.bp_grp_cd6.like(bind("prsppl_grp_cd6")))),
				when(boundOr("prsppl_grp_flg6"))
					.select(DS0D, S0_PRSPPL_GRP6.bp_grp_nm.as("prsppl_grp_nm6"))
					.groupBy(DS0D, S0_PRSPPL_GRP6.bp_grp_nm),
				when(boundOr("prsppl_grp_flg6", "prsppl_grp_nm6"))
					.view(DS0D, v -> v.leftOuterJoin(S0_PRSPPL_GRP6).on(S0_PRSPPL.bp_grp_cd6.eq(S0_PRSPPL_GRP6.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP6.value()).eq(S0_PRSPPL_GRP6.bp_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_PRSPPL_GRP6.bp_grp_nm.like(bind("prsppl_grp_nm6")))),
				when(boundOr("prsppl_grp_flg7"))
					.select(DS0D, S0_PRSPPL.bp_grp_cd7.as("prsppl_grp_cd7"))
					.groupBy(DS0D, S0_PRSPPL.bp_grp_cd7),
				when(boundOr("prsppl_grp_flg7", "prsppl_grp_cd7"))
					.predicate(DS0D, p -> p.cutoff$and(S0_PRSPPL.bp_grp_cd7.like(bind("prsppl_grp_cd7")))),
				when(boundOr("prsppl_grp_flg7"))
					.select(DS0D, S0_PRSPPL_GRP7.bp_grp_nm.as("prsppl_grp_nm7"))
					.groupBy(DS0D, S0_PRSPPL_GRP7.bp_grp_nm),
				when(boundOr("prsppl_grp_flg7", "prsppl_grp_nm7"))
					.view(DS0D, v -> v.leftOuterJoin(S0_PRSPPL_GRP7).on(S0_PRSPPL.bp_grp_cd7.eq(S0_PRSPPL_GRP7.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP7.value()).eq(S0_PRSPPL_GRP7.bp_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_PRSPPL_GRP7.bp_grp_nm.like(bind("prsppl_grp_nm7")))),
				when(boundOr("prsppl_grp_flg8"))
					.select(DS0D, S0_PRSPPL.bp_grp_cd8.as("prsppl_grp_cd8"))
					.groupBy(DS0D, S0_PRSPPL.bp_grp_cd8),
				when(boundOr("prsppl_grp_flg8", "prsppl_grp_cd8"))
					.predicate(DS0D, p -> p.cutoff$and(S0_PRSPPL.bp_grp_cd8.like(bind("prsppl_grp_cd8")))),
				when(boundOr("prsppl_grp_flg8"))
					.select(DS0D, S0_PRSPPL_GRP8.bp_grp_nm.as("prsppl_grp_nm8"))
					.groupBy(DS0D, S0_PRSPPL_GRP8.bp_grp_nm),
				when(boundOr("prsppl_grp_flg8", "prsppl_grp_nm8"))
					.view(DS0D, v -> v.leftOuterJoin(S0_PRSPPL_GRP8).on(S0_PRSPPL.bp_grp_cd8.eq(S0_PRSPPL_GRP8.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP8.value()).eq(S0_PRSPPL_GRP8.bp_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_PRSPPL_GRP8.bp_grp_nm.like(bind("prsppl_grp_nm8")))),
				when(boundOr("prsppl_grp_flg9"))
					.select(DS0D, S0_PRSPPL.bp_grp_cd9.as("prsppl_grp_cd9"))
					.groupBy(DS0D, S0_PRSPPL.bp_grp_cd9),
				when(boundOr("prsppl_grp_flg9", "prsppl_grp_cd9"))
					.predicate(DS0D, p -> p.cutoff$and(S0_PRSPPL.bp_grp_cd9.like(bind("prsppl_grp_cd9")))),
				when(boundOr("prsppl_grp_flg9"))
					.select(DS0D, S0_PRSPPL_GRP9.bp_grp_nm.as("prsppl_grp_nm9"))
					.groupBy(DS0D, S0_PRSPPL_GRP9.bp_grp_nm),
				when(boundOr("prsppl_grp_flg9", "prsppl_grp_nm9"))
					.view(DS0D, v -> v.leftOuterJoin(S0_PRSPPL_GRP9).on(S0_PRSPPL.bp_grp_cd9.eq(S0_PRSPPL_GRP9.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP9.value()).eq(S0_PRSPPL_GRP9.bp_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_PRSPPL_GRP9.bp_grp_nm.like(bind("prsppl_grp_nm9")))),
				when(boundOr("prsppl_grp_flg10"))
					.select(DS0D, S0_PRSPPL.bp_grp_cd10.as("prsppl_grp_cd10"))
					.groupBy(DS0D, S0_PRSPPL.bp_grp_cd10),
				when(boundOr("prsppl_grp_flg10", "prsppl_grp_cd10"))
					.predicate(DS0D, p -> p.cutoff$and(S0_PRSPPL.bp_grp_cd10.like(bind("prsppl_grp_cd10")))),
				when(boundOr("prsppl_grp_flg10"))
					.select(DS0D, S0_PRSPPL_GRP10.bp_grp_nm.as("prsppl_grp_nm10"))
					.groupBy(DS0D, S0_PRSPPL_GRP10.bp_grp_nm),
				when(boundOr("prsppl_grp_flg10", "prsppl_grp_nm10"))
					.view(DS0D, v -> v.leftOuterJoin(S0_PRSPPL_GRP10).on(S0_PRSPPL.bp_grp_cd10.eq(S0_PRSPPL_GRP10.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP10.value()).eq(S0_PRSPPL_GRP10.bp_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_PRSPPL_GRP10.bp_grp_nm.like(bind("prsppl_grp_nm10")))),
				when(boundOr("itm_nm", "itm_typ", "itm_typ_d_cd", "itm_typ_d_nm", "itm_grp_flg1", "itm_grp_flg2", "itm_grp_flg3", "itm_grp_flg4", "itm_grp_flg5", "itm_grp_flg6", "itm_grp_flg7", "itm_grp_flg8", "itm_grp_flg9", "itm_grp_flg10"))
					.view(DS0D, v -> v.leftOuterJoin(S0_ITM).on(S0_ITM.itm_cd.eq(S0_V1.pr(S1_T1.itm_cd)).and(S0_ITM.itm_sub1.eq(S0_V1.pr(S1_T1.itm_sub1))).and(S0_ITM.itm_sub2.eq(S0_V1.pr(S1_T1.itm_sub2))).and(S0_ITM.itm_sub3.eq(S0_V1.pr(S1_T1.itm_sub3)))).leftOuterJoin(S0_SUNDRY_ITM).on(S0_SUNDRY_ITM.itm_cd.eq(S0_V1.pr(S1_T1.itm_cd)).and(S0_SUNDRY_ITM.itm_sub1.eq(S0_V1.pr(S1_T1.itm_sub1))).and(S0_SUNDRY_ITM.itm_sub2.eq(S0_V1.pr(S1_T1.itm_sub2))).and(S0_SUNDRY_ITM.itm_sub3.eq(S0_V1.pr(S1_T1.itm_sub3))).and(S0_SUNDRY_ITM.sno1.eq(S0_V1.pr(S1_T1.sno1))).and(S0_SUNDRY_ITM.sno2.eq(S0_V1.pr(S1_T1.sno2))).and(S0_SUNDRY_ITM.sno3.eq(S0_V1.pr(S1_T1.sno3))).and(S0_SUNDRY_ITM.sno4.eq(S0_V1.pr(S1_T1.sno4)))))
					.predicate(DS0D, p -> p.cutoff$and(decode(S0_V1.pr(S1_T1.sundry_itm_flg),value(true),nvl(S0_V1.pr(S1_T1.itm_nm),S0_SUNDRY_ITM.itm_nm),S0_ITM.itm_nm).like(bind("itm_nm")))),
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
				when(boundOr("trd_nm"))
					.view(DS0D, v -> v.leftOuterJoin(S0_TRD).on(S0_TRD.trd_cd.eq(S0_V1.pr(S1_T1.trd_cd))))
					.predicate(DS0D, p -> p.cutoff$and(S0_TRD.trd_nm.like(bind("trd_nm")))),
				when(boundOr("rcpt_iv_itm_nm"))
					.view(DS0D, v -> v.leftOuterJoin(S0_RCPT_ITM).on(S0_RCPT_ITM.itm_cd.eq(S0_V1.pr(S1_T1.itm_cd)).and(S0_RCPT_ITM.itm_sub1.eq(S0_V1.pr(S1_T1.itm_sub1))).and(S0_RCPT_ITM.itm_sub2.eq(S0_V1.pr(S1_T1.itm_sub2))).and(S0_RCPT_ITM.itm_sub3.eq(S0_V1.pr(S1_T1.itm_sub3))).and(S0_RCPT_ITM.lcl_cd.eq(S0_SPPL.prnt_lcl_cd)).cutoff$and(S0_RCPT_ITM.itm_nm.like(bind("rcpt_iv_itm_nm")))))
					.predicate(DS0D, p -> p.cutoff$and(decode(S0_V1.pr(S1_T1.sundry_itm_flg),value(true),S0_V1.pr(S1_T1.rcpt_iv_itm_nm),S0_RCPT_ITM.itm_nm).like(bind("rcpt_iv_itm_nm")))),
				when(boundOr("itm_typ"))
					.predicate(DS0D, p -> p.cutoff$and(S0_ITM.itm_typ.like(bind("itm_typ")))),
				when(boundOr("itm_typ_d_cd"))
					.predicate(DS0D, p -> p.cutoff$and(S0_ITM.itm_typ_d_cd.like(bind("itm_typ_d_cd")))),
				when(boundOr("itm_typ_d_nm"))
					.view(DS0D, v -> v.leftOuterJoin(S0_ITM_TYP_D).on(S0_ITM_TYP_D.itm_typ.eq(S0_ITM.itm_typ).and(S0_ITM_TYP_D.itm_typ_d_cd.eq(S0_ITM.itm_typ_d_cd))))
					.predicate(DS0D, p -> p.cutoff$and(S0_ITM_TYP_D.itm_typ_d_nm.like(bind("itm_typ_d_nm")))),
				when(boundOr("rqst_dpt_nm"))
					.view(DS0D, v -> v.leftOuterJoin(S0_DPT).on(S0_DPT.dpt_cd.eq(S0_V1.pr("rqst_dpt_cd")).and(bind("today").between(S0_DPT.st_dt, S0_DPT.end_dt))))
					.predicate(DS0D, p -> p.cutoff$and(S0_DPT.dpt_nm.like(bind("rqst_dpt_nm")))),
				when(boundOr("rqst_usr_nm"))
					.view(DS0D, v -> v.leftOuterJoin(S0_RQST_USR).on(S0_RQST_USR.usr_cd.eq(S0_V1.pr("rqst_usr_cd"))))
					.predicate(DS0D, p -> p.cutoff$and(S0_RQST_USR.usr_nm.like(bind("rqst_usr_nm")))),
				when(boundOr("arr_wg_nm"))
					.view(DS0D, v -> v.leftOuterJoin(S0_ARR_WG).on(S0_ARR_WG.wg_cd.eq(S0_ARR_LOC.wg_cd)))
					.predicate(DS0D, p -> p.cutoff$and(S0_ARR_WG.wg_nm.like(bind("arr_wg_nm")))),
				when(boundOr("arr_lg_grp_nm"))
					.view(DS0D, v -> v.leftOuterJoin(S0_ARR_LG_GRP).on(S0_ARR_LG_GRP.lg_grp_cd.eq(S0_ARR_LOC.lg_grp_cd)))
					.predicate(DS0D, p -> p.cutoff$and(S0_ARR_LG_GRP.lg_grp_nm.like(bind("arr_lg_grp_nm")))),
				when(boundOr("arr_site_nm"))
					.view(DS0D, v -> v.leftOuterJoin(S0_ARR_SITE).on(S0_ARR_SITE.site_cd.eq(S0_ARR_LOC.site_cd)))
					.predicate(DS0D, p -> p.cutoff$and(S0_ARR_SITE.site_nm.like(bind("arr_site_nm")))),
				when(boundOr("arr_alloc_grp_nm"))
					.view(DS0D, v -> v.leftOuterJoin(S0_ARR_ALLRC_GRP).on(S0_ARR_ALLRC_GRP.alloc_grp_cd.eq(S0_ARR_LOC.alloc_grp_cd)))
					.predicate(DS0D, p -> p.cutoff$and(S0_ARR_ALLRC_GRP.alloc_grp_nm.like(bind("arr_alloc_grp_nm")))),
				when(boundOr("arr_str_ln_nm"))
					.view(DS0D, v -> v.leftOuterJoin(S0_ARR_STR_LN).on(S0_ARR_STR_LN.loc_cd.eq(S0_V1.pr(S1_T1.arr_loc_cd)).and(S0_ARR_STR_LN.str_ln_cd.eq(S0_V1.pr("arr_str_ln_cd")))))
					.predicate(DS0D, p -> p.cutoff$and(S0_ARR_STR_LN.str_ln_nm.like(bind("arr_str_ln_nm")))),
				when(boundOr("wrk_no", "wrk_nm"))
					.view(DS0D, v -> v.leftOuterJoin(S0_WRK_SNO).on(S0_WRK_SNO.sno1.eq(S0_V1.pr(S1_T1.sno1))))
					.predicate(DS0D, p -> p.cutoff$and(S0_WRK_SNO.wrk_no.like(bind("wrk_no"))).cutoff$and(S0_WRK_SNO.wrk_nm.like(bind("wrk_nm")))),
				when(boundOr("maker_nm"))
					.view(DS0D, v -> v.leftOuterJoin(S0_MAKER).on(S0_MAKER.bp_cd.eq(S0_V1.pr(S1_T1.maker_cd))))
					.predicate(DS0D, p -> p.cutoff$and(S0_MAKER.bp_nm.like(bind("maker_nm")))),
				when(boundOr("arr_dpt_nm"))
					.view(DS0D, v -> v.leftOuterJoin(S0_ARR_DPT).on(S0_ARR_DPT.dpt_cd.eq(S0_V1.pr(S1_T1.arr_dpt_cd)).and(bind("today").between(S0_ARR_DPT.st_dt, S0_ARR_DPT.end_dt))))
					.predicate(DS0D, p -> p.cutoff$and(S0_ARR_DPT.dpt_nm.like(bind("arr_dpt_nm")))),
				when(boundOr("arr_usr_nm"))
					.view(DS0D, v -> v.leftOuterJoin(S0_ARR_USR).on(S0_ARR_USR.usr_cd.eq(S0_V1.pr(S1_T1.arr_usr_cd))))
					.predicate(DS0D, p -> p.cutoff$and(S0_ARR_USR.usr_nm.like(bind("arr_usr_nm")))),
				when(boundOr("po_no", "purc_rqst_wg_cd", "purc_rqst_wg_nm", "po_schd_src_typ", "po_schd_src_no"))
					.view(DS0D, v -> v.leftOuterJoin(S0_PO_D).on(S0_PO_D.po_d_no.eq(S0_V1.pr(S1_T3.po_d_no))))
					.predicate(DS0D, p -> p.cutoff$and(S0_PO_D.po_no.like(bind("po_no")))),
				when(boundOr("purc_rqst_wg_cd", "purc_rqst_wg_nm", "po_schd_src_typ", "po_schd_src_no"))
					.view(DS0D, v -> v.leftOuterJoin(S0_PO_SCHD).on(S0_PO_SCHD.po_schd_no.eq(S0_PO_D.po_schd_no)))
					.predicate(DS0D, p -> p.cutoff$and(S0_PO_SCHD.rqst_wg_cd.eq(bind("purc_rqst_wg_cd"))).cutoff$and(S0_PO_SCHD.po_schd_src_typ.like(bind("po_schd_src_typ"))).cutoff$and(S0_PO_SCHD.po_schd_src_no.like(bind("po_schd_src_no"))).cutoff$and(S0_PO_SCHD.po_schd_no.like(bind("po_schd_no")))),
				when(boundOr("purc_rqst_wg_nm"))
					.view(DS0D, v -> v.leftOuterJoin(S0_PURC_RQST_WG).on(S0_PURC_RQST_WG.wg_cd.eq(S0_PO_SCHD.rqst_wg_cd)))
					.predicate(DS0D, p -> p.cutoff$and(S0_PURC_RQST_WG.wg_nm.like(bind("purc_rqst_wg_nm")))),
				when(boundOr("dlv_inst_no", "dlv_inst_print_d_rmrks"))
					.view(DS0D, v -> v.leftOuterJoin(S0_DLV_INST_D).on(S0_DLV_INST_D.dlv_inst_d_no.eq(S0_V1.pr(S1_T2.dlv_inst_d_no))))
					.predicate(DS0D, p -> p.cutoff$and(S0_DLV_INST_D.dlv_inst_no.like(bind("dlv_inst_no"))).cutoff$and(S0_DLV_INST_D.dlv_inst_print_d_rmrks.like(bind("dlv_inst_print_d_rmrks")))),
				when(boundOr("prms_rcpt_no", "prms_rmrks"))
					.view(DS0D, v -> v.leftOuterJoin(S0_PRMS_RCPT_D).on(S0_PRMS_RCPT_D.prms_rcpt_d_no.eq(S0_V1.pr(S1_T2.prms_rcpt_d_no))))
					.predicate(DS0D, p -> p.cutoff$and(S0_PRMS_RCPT_D.prms_rcpt_no.like(bind("prms_rcpt_no"))).cutoff$and(S0_PRMS_RCPT_D.prms_rmrks.like(bind("prms_rmrks")))),
				when(boundOr("ship_act_no", "ship_lg_grp_cd", "ship_lg_grp_nm", "ship_wg_cd", "ship_wg_nm"))
					.view(DS0D, v -> v.leftOuterJoin(S0_DLV_SLIP).on(S0_DLV_SLIP.dlv_slip_no.eq(S0_V1.pr(S1_T2.dlv_slip_no)).and(S0_DLV_SLIP.slip_sts_typ.eq(value(MAC_SLIP_STS_TYP.CRT.value()))).and(S0_V1.pr(S1_T2.dlv_slip_mng_no).isNull())))
					.predicate(DS0D, p -> p.cutoff$and(S0_DLV_SLIP.dlv_slip_act_no.like(bind("ship_act_no")))),
				when(boundOr("ship_lg_grp_cd"))
					.predicate(DS0D, p -> p.cutoff$and(S0_DLV_SLIP.ship_fr_lg_grp_cd.like(bind("ship_lg_grp_cd")))),
				when(boundOr("ship_lg_grp_nm"))
					.view(DS0D, v -> v.leftOuterJoin(S0_SHIP_LG_GRP).on(S0_SHIP_LG_GRP.lg_grp_cd.eq(S0_DLV_SLIP.ship_fr_lg_grp_cd)))
					.predicate(DS0D, p -> p.cutoff$and(S0_SHIP_LG_GRP.lg_grp_nm.like(bind("ship_lg_grp_nm")))),
				when(boundOr("ship_wg_cd"))
					.predicate(DS0D, p -> p.cutoff$and(S0_DLV_SLIP.wg_cd.like(bind("ship_wg_cd")))),
				when(boundOr("ship_wg_nm"))
					.view(DS0D, v -> v.leftOuterJoin(S0_SHIP_WG).on(S0_SHIP_WG.wg_cd.eq(S0_DLV_SLIP.wg_cd)))
					.predicate(DS0D, p -> p.cutoff$and(S0_SHIP_WG.wg_nm.like(bind("ship_wg_nm")))),
				when(boundOr("sls_ret_schd_no"))
					.predicate(DS0D, p -> p.cutoff$and(S0_SRET_SCHD_D.sls_ret_schd_no.like(bind("sls_ret_schd_no")))),
				when(boundOr("cst_po_no"))
					.view(DS0D, v -> v.leftOuterJoin(S0_SRET_SCHD).on(S0_SRET_SCHD.sls_ret_schd_no.eq(S0_SRET_SCHD_D.sls_ret_schd_no)))
					.predicate(DS0D, p -> p.cutoff$and(S0_SRET_SCHD.cst_po_no.like(bind("cst_po_no")))),
				when(boundOr("cst_itm_cd"))
					.predicate(DS0D, p -> p.cutoff$and(S0_SRET_SCHD_D.cst_itm_cd.like(bind("cst_itm_cd")))),
				when(boundOr("cst_itm_nm"))
					.predicate(DS0D, p -> p.cutoff$and(S0_SRET_SCHD_D.cst_itm_nm.like(bind("cst_itm_nm"))))
			);
	}
	
	/**
	 * -- MSBEL5930_MST_ARR_ACT_Query_S03
	 */
	static MCQueryPlan MSBEL5930_MST_ARR_ACT_S03() {
		MCTempView S0_V1 = createTempView("V1");
		MAM_LOC_R S0_ARR_LOC = MAM_LOC_R.create("ARR_LOC");
		MAM_TRD_R S0_TRD = MAM_TRD_R.create("TRD");
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
		MAM_SUNDRY_ITM_R S0_SUNDRY_ITM = MAM_SUNDRY_ITM_R.create("SUNDRY_ITM");
		MAM_ITM_LCL_R S0_RCPT_ITM = MAM_ITM_LCL_R.create("RCPT_ITM");
		MAM_ITM_TYP_D_R S0_ITM_TYP_D = MAM_ITM_TYP_D_R.create("ITM_TYP_D");
		MAM_DPT_R S0_DPT = MAM_DPT_R.create("DPT");
		MAM_USR_R S0_RQST_USR = MAM_USR_R.create("RQST_USR");
		MAM_BP_R S0_CST = MAM_BP_R.create("CST");
		MAM_BP_GRP_R S0_CST_GRP1 = MAM_BP_GRP_R.create("CST_GRP1");
		MAM_BP_GRP_R S0_CST_GRP2 = MAM_BP_GRP_R.create("CST_GRP2");
		MAM_BP_GRP_R S0_CST_GRP3 = MAM_BP_GRP_R.create("CST_GRP3");
		MAM_BP_GRP_R S0_CST_GRP4 = MAM_BP_GRP_R.create("CST_GRP4");
		MAM_BP_GRP_R S0_CST_GRP5 = MAM_BP_GRP_R.create("CST_GRP5");
		MAM_BP_GRP_R S0_CST_GRP6 = MAM_BP_GRP_R.create("CST_GRP6");
		MAM_BP_GRP_R S0_CST_GRP7 = MAM_BP_GRP_R.create("CST_GRP7");
		MAM_BP_GRP_R S0_CST_GRP8 = MAM_BP_GRP_R.create("CST_GRP8");
		MAM_BP_GRP_R S0_CST_GRP9 = MAM_BP_GRP_R.create("CST_GRP9");
		MAM_BP_GRP_R S0_CST_GRP10 = MAM_BP_GRP_R.create("CST_GRP10");
		MST_SLS_RET_SCHD_D_R S0_SRET_SCHD_D = MST_SLS_RET_SCHD_D_R.create("SRET_SCHD_D");
		MAM_BP_R S0_SRET_FR = MAM_BP_R.create("SRET_FR");
		MAM_BP_GRP_R S0_SRET_FR_GRP1 = MAM_BP_GRP_R.create("SRET_FR_GRP1");
		MAM_BP_GRP_R S0_SRET_FR_GRP2 = MAM_BP_GRP_R.create("SRET_FR_GRP2");
		MAM_BP_GRP_R S0_SRET_FR_GRP3 = MAM_BP_GRP_R.create("SRET_FR_GRP3");
		MAM_BP_GRP_R S0_SRET_FR_GRP4 = MAM_BP_GRP_R.create("SRET_FR_GRP4");
		MAM_BP_GRP_R S0_SRET_FR_GRP5 = MAM_BP_GRP_R.create("SRET_FR_GRP5");
		MAM_BP_GRP_R S0_SRET_FR_GRP6 = MAM_BP_GRP_R.create("SRET_FR_GRP6");
		MAM_BP_GRP_R S0_SRET_FR_GRP7 = MAM_BP_GRP_R.create("SRET_FR_GRP7");
		MAM_BP_GRP_R S0_SRET_FR_GRP8 = MAM_BP_GRP_R.create("SRET_FR_GRP8");
		MAM_BP_GRP_R S0_SRET_FR_GRP9 = MAM_BP_GRP_R.create("SRET_FR_GRP9");
		MAM_BP_GRP_R S0_SRET_FR_GRP10 = MAM_BP_GRP_R.create("SRET_FR_GRP10");
		MAM_BP_R S0_SPPL = MAM_BP_R.create("SPPL");
		MAM_BP_GRP_R S0_PO_GRP1 = MAM_BP_GRP_R.create("PO_GRP1");
		MAM_BP_GRP_R S0_PO_GRP2 = MAM_BP_GRP_R.create("PO_GRP2");
		MAM_BP_GRP_R S0_PO_GRP3 = MAM_BP_GRP_R.create("PO_GRP3");
		MAM_BP_GRP_R S0_PO_GRP4 = MAM_BP_GRP_R.create("PO_GRP4");
		MAM_BP_GRP_R S0_PO_GRP5 = MAM_BP_GRP_R.create("PO_GRP5");
		MAM_BP_GRP_R S0_PO_GRP6 = MAM_BP_GRP_R.create("PO_GRP6");
		MAM_BP_GRP_R S0_PO_GRP7 = MAM_BP_GRP_R.create("PO_GRP7");
		MAM_BP_GRP_R S0_PO_GRP8 = MAM_BP_GRP_R.create("PO_GRP8");
		MAM_BP_GRP_R S0_PO_GRP9 = MAM_BP_GRP_R.create("PO_GRP9");
		MAM_BP_GRP_R S0_PO_GRP10 = MAM_BP_GRP_R.create("PO_GRP10");
		MAM_WG_R S0_ARR_WG = MAM_WG_R.create("ARR_WG");
		MAM_LG_GRP_R S0_ARR_LG_GRP = MAM_LG_GRP_R.create("ARR_LG_GRP");
		MAM_SITE_R S0_ARR_SITE = MAM_SITE_R.create("ARR_SITE");
		MAM_ALLOC_GRP_R S0_ARR_ALLRC_GRP = MAM_ALLOC_GRP_R.create("ARR_ALLRC_GRP");
		MAM_STR_LN_R S0_ARR_STR_LN = MAM_STR_LN_R.create("ARR_STR_LN");
		MSVT_WRK_SNO_R S0_WRK_SNO = MSVT_WRK_SNO_R.create("WRK_SNO");
		MAVM_BP_NM_R S0_MAKER = MAVM_BP_NM_R.create("MAKER");
		MAM_DPT_R S0_ARR_DPT = MAM_DPT_R.create("ARR_DPT");
		MAM_USR_R S0_ARR_USR = MAM_USR_R.create("ARR_USR");
		MST_PO_D_R S0_PO_D = MST_PO_D_R.create("PO_D");
		MST_PO_SCHD_R S0_PO_SCHD = MST_PO_SCHD_R.create("PO_SCHD");
		MAM_WG_R S0_PURC_RQST_WG = MAM_WG_R.create("PURC_RQST_WG");
		MST_DLV_INST_D_R S0_DLV_INST_D = MST_DLV_INST_D_R.create("DLV_INST_D");
		MST_PRMS_RCPT_D_R S0_PRMS_RCPT_D = MST_PRMS_RCPT_D_R.create("PRMS_RCPT_D");
		MST_DLV_SLIP_R S0_DLV_SLIP = MST_DLV_SLIP_R.create("DLV_SLIP");
		MAM_LG_GRP_R S0_SHIP_LG_GRP = MAM_LG_GRP_R.create("SHIP_LG_GRP");
		MAM_WG_R S0_SHIP_WG = MAM_WG_R.create("SHIP_WG");
		MST_SLS_RET_SCHD_R S0_SRET_SCHD = MST_SLS_RET_SCHD_R.create("SRET_SCHD");
		MAM_BP_R S0_PRSPPL = MAM_BP_R.create("PRSPPL");
		MAM_BP_GRP_R S0_PRSPPL_GRP1 = MAM_BP_GRP_R.create("PRSPPL_GRP1");
		MAM_BP_GRP_R S0_PRSPPL_GRP2 = MAM_BP_GRP_R.create("PRSPPL_GRP2");
		MAM_BP_GRP_R S0_PRSPPL_GRP3 = MAM_BP_GRP_R.create("PRSPPL_GRP3");
		MAM_BP_GRP_R S0_PRSPPL_GRP4 = MAM_BP_GRP_R.create("PRSPPL_GRP4");
		MAM_BP_GRP_R S0_PRSPPL_GRP5 = MAM_BP_GRP_R.create("PRSPPL_GRP5");
		MAM_BP_GRP_R S0_PRSPPL_GRP6 = MAM_BP_GRP_R.create("PRSPPL_GRP6");
		MAM_BP_GRP_R S0_PRSPPL_GRP7 = MAM_BP_GRP_R.create("PRSPPL_GRP7");
		MAM_BP_GRP_R S0_PRSPPL_GRP8 = MAM_BP_GRP_R.create("PRSPPL_GRP8");
		MAM_BP_GRP_R S0_PRSPPL_GRP9 = MAM_BP_GRP_R.create("PRSPPL_GRP9");
		MAM_BP_GRP_R S0_PRSPPL_GRP10 = MAM_BP_GRP_R.create("PRSPPL_GRP10");
		MST_ARR_ACT_R S1_T1 = MST_ARR_ACT_R.create("T1");
		MST_ARR_SCHD_R S1_T2 = MST_ARR_SCHD_R.create("T2");
		MST_ARR_PR_R S1_T3 = MST_ARR_PR_R.create("T3");
		MST_PURC_SCHD_R S1_T4 = MST_PURC_SCHD_R.create("T4");
		MST_PURC_ACT_IO_R S1_T51 = MST_PURC_ACT_IO_R.create("T51");
		MST_PURC_ACT_D_R S1_T52 = MST_PURC_ACT_D_R.create("T52");
		MST_PURC_ACT_R S1_T53 = MST_PURC_ACT_R.create("T53");
		MST_PURC_ACT_IO_R S1_T61 = MST_PURC_ACT_IO_R.create("T61");
		MST_PURC_ACT_D_R S1_T62 = MST_PURC_ACT_D_R.create("T62");
		MST_PURC_ACT_R S1_T63 = MST_PURC_ACT_R.create("T63");
		MST_DLV_SLIP_R S1_T7 = MST_DLV_SLIP_R.create("T7");
		MST_PROV_SCHD_R S1_T8 = MST_PROV_SCHD_R.create("T8");
		MST_PROV_ACT_R S1_T91 = MST_PROV_ACT_R.create("T91");
		MST_PROV_ACT_R S1_T92 = MST_PROV_ACT_R.create("T92");
		MST_PURC_DLV_SLIP_D_R S1_T101 = MST_PURC_DLV_SLIP_D_R.create("T101");
		MST_PURC_DLV_SLIP_R S1_T102 = MST_PURC_DLV_SLIP_R.create("T102");
		MAM_ITM_R S2_W1 = MAM_ITM_R.create("W1");
		MST_PURC_ACT_IO_R S3_W1 = MST_PURC_ACT_IO_R.create("W1");
		MST_PURC_ACT_D_R S3_W2 = MST_PURC_ACT_D_R.create("W2");
		MST_PURC_ACT_R S3_W3 = MST_PURC_ACT_R.create("W3");
		MST_SLS_ACT_IO_R S4_W1 = MST_SLS_ACT_IO_R.create("W1");
		MST_SLS_ACT_D_R S4_W2 = MST_SLS_ACT_D_R.create("W2");
		MST_SLS_ACT_R S4_W3 = MST_SLS_ACT_R.create("W3");
		MST_PROV_ACT_R S5_W1 = MST_PROV_ACT_R.create("W1");
		MST_PROV_ACT_R S6_W1 = MST_PROV_ACT_R.create("W1");
		MST_PROV_ACT_R S7_W1 = MST_PROV_ACT_R.create("W1");
		MAVM_RD_LOC_R S8_W1 = MAVM_RD_LOC_R.create("W1");
		MAVM_RD_LG_GRP_R S9_W2 = MAVM_RD_LG_GRP_R.create("W2");
		MST_RCPT_IV_MAP_R S10_W1 = MST_RCPT_IV_MAP_R.create("W1");
		MST_RCPT_IV_D_R S10_W2 = MST_RCPT_IV_D_R.create("W2");
		MST_RCPT_IV_R S10_W3 = MST_RCPT_IV_R.create("W3");
		MST_PURC_ACT_IO_R S11_W1 = MST_PURC_ACT_IO_R.create("W1");
		MST_PURC_ACT_D_R S11_W2 = MST_PURC_ACT_D_R.create("W2");
		MST_PURC_ACT_R S11_W3 = MST_PURC_ACT_R.create("W3");
		MST_PURC_ACT_IO_R S12_W1 = MST_PURC_ACT_IO_R.create("W1");
		MST_PURC_ACT_D_R S12_W2 = MST_PURC_ACT_D_R.create("W2");
		MST_PURC_ACT_R S12_W3 = MST_PURC_ACT_R.create("W3");
		
		MCDynamicSQLID DS0D = createDynamicSQLID("DS0D");
		
		return createQueryPlan()
			.setQuery(
				sql("MSBEL5930_MST_ARR_ACT_Query_S03")
					.mainQuery()
					.select(
						S0_V1.prAll(),
						S0_ARR_LOC.loc_nm.as("arr_schd_loc_nm"),
						S0_ARR_LOC.loc_nm.as("arr_loc_nm"),
						S0_ARR_LOC.site_cd.as("arr_site_cd"),
						S0_ARR_LOC.alloc_grp_cd.as("arr_alloc_grp_cd"),
						S0_ARR_LOC.sppl_cd.as("loc_sppl_cd"),
						S0_ARR_LOC.sppl_cd.as("prsppl_cd"),
						S0_ARR_LOC.str_ln_tgt_flg.as("arr_str_ln_tgt_flg"),
						addDynamicSelect(DS0D)
					)
					.from(
						subQuery()
						.select(
							S1_T2.pr_sts_typ,
							nullValue().as("pr_sts_typ_nm"),
							S1_T1.trd_cd,
							S1_T1.trd_ptn_typ,
							nullValue().as("trd_ptn_typ_nm"),
							S1_T1.itm_cd,
							S1_T1.itm_sub1,
							S1_T1.itm_sub2,
							S1_T1.itm_sub3,
							S1_T1.itm_nm,
							S1_T1.rcpt_iv_itm_nm,
							S1_T1.sundry_itm_flg,
							nvl(
								S1_T1.rqst_dpt_cd,
								S1_T3.rqst_dpt_cd
							).as("rqst_dpt_cd"),
							nvl(
								S1_T1.rqst_usr_cd,
								S1_T3.rqst_usr_cd
							).as("rqst_usr_cd"),
							S1_T1.cst_cd,
							S1_T1.sret_fr_cd,
							S1_T1.sppl_cd,
							S1_T3.ret_dlv_slip_d_no,
							nvl(
								S1_T3.ret_stk_arrv_bp_cd,
								S1_T1.sret_fr_cd
							).as("ret_stk_arrv_bp_cd"),
							S1_T1.ret_loc_cd,
							S1_T1.ret_str_ln_cd,
							S1_T1.ret_gd_cd,
							S1_T1.arr_loc_cd,
							S1_T2.arr_loc_cd.as("arr_schd_loc_cd"),
							S1_T2.lg_grp_cd.as("arr_schd_lg_grp_cd"),
							S1_T1.wg_cd.as("arr_wg_cd"),
							S1_T1.lg_grp_cd.as("arr_lg_grp_cd"),
							S1_T1.str_ln_cd.as("arr_str_ln_cd"),
							nullValue().as("arr_str_ln_cd_none_flg"),
							trunc(
								S1_T3.dlv_rqst_tm,
								MCDateFmt.DD
							).as("dlv_rqst_dt"),
							S1_T3.dlv_rqst_tm.as("dlv_rqst_hm"),
							trunc(
								S1_T2.arr_schd_tm,
								MCDateFmt.DD
							).as("arr_schd_dt"),
							S1_T2.arr_schd_tm.as("arr_schd_hm"),
							trunc(
								S1_T1.arr_tm,
								MCDateFmt.DD
							).as("arr_dt"),
							S1_T1.arr_tm.as("arr_hm"),
							S1_T1.ac_dt,
							S1_T1.ver_no,
							S1_T1.lot_no,
							S1_T1.sublot_no,
							S1_T1.bp_lot_no,
							S1_T1.bp_dlv_slip_no,
							S1_T1.bp_dlv_slip_d_no,
							S1_T1.ship_fr_valid_dt,
							S1_T1.sno1_mng_typ,
							S1_T1.sno2_mng_typ,
							S1_T1.sno3_mng_typ,
							S1_T1.sno4_mng_typ,
							S1_T1.sno1,
							S1_T1.sno2,
							S1_T1.sno3,
							S1_T1.sno4,
							S1_T1.maker_cd,
							S1_T1.sppl_itm_cd,
							S1_T1.sppl_itm_nm,
							S1_T1.purc_id_typ,
							nullValue().as("purc_id_typ_nm"),
							nullValue().as("cststk_flg"),
							S1_T1.trd_unit_cd,
							S1_T1.trd_unit_qty,
							S1_T2.abort_flg,
							S1_T1.base_unit_cd,
							S1_T1.base_unit_qty,
							S1_T2.trd_unit_cd.as("schd_unit_cd"),
							S1_T2.base_unit_qty.as("arr_schd_qty"),
							nvl(
								S1_T2.arr_qty,
								S1_T1.base_unit_qty
							).as("arr_qty"),
							MAPA_CALC$F_CALC_PER(
								S1_T2.base_unit_qty,
								S1_T1.base_unit_qty
							).as("pr_rate"),
							S1_T1.purc_cont_qty,
							nullValue().as("purc_cont_fctr"),
							nullValue().as("std_cont_qty"),
							S1_T1.sync_flg,
							nullValue().as("split_flg"),
							S1_T2.arr_ptn_typ,
							nullValue().as("arr_ptn_typ_nm"),
							S1_T1.gd_cd,
							S1_T1.quality_typ,
							nullValue().as("quality_typ_nm"),
							S1_T1.stk_insp_typ,
							nullValue().as("stk_insp_typ_nm"),
							S1_T1.stk_id_typ.as("stk_id_typ"),
							nullValue().as("stk_id_typ_nm"),
							S1_T1.stk_bp_cd.as("stk_bp_cd"),
							S1_T1.arr_dpt_cd,
							S1_T1.arr_usr_cd,
							S1_T1.rsn_cd,
							S1_T1.bd_dpt_cd,
							S1_T1.bd_wg_cd,
							S1_T1.insp_cnt_rmrks,
							S1_T1.intr_rmrks,
							S1_T1.trd_rmrks,
							S1_T1.trd_d_rmrks,
							S1_T1.sub_char1,
							S1_T1.sub_char2,
							S1_T1.sub_char3,
							S1_T2.arr_cnt_rmrks,
							S1_T1.arr_act_no,
							S1_T2.dlv_slip_no,
							S1_T2.dlv_slip_mng_no,
							S1_T102.dlv_slip_seq,
							S1_T102.dlv_slip_rev,
							cases()
								.when(S1_T2.dlv_slip_mng_d_no.isNull())
								.then(S1_T3.dlv_slip_d_no)
								.otherwise(S1_T101.dlv_slip_d_no).as("dlv_slip_d_no"),
							S1_T101.dlv_slip_d_seq,
							S1_T2.arr_schd_no,
							S1_T2.arr_pr_no,
							S1_T3.po_d_no,
							S1_T4.purc_schd_no,
							S1_T4.purc_schd_dt,
							S1_T2.dlv_inst_d_no,
							S1_T2.prms_rcpt_d_no,
							decode(
								S1_T1.purc_act_io_no,
								nullValue(),
								S1_T63.purc_act_no,
								S1_T53.purc_act_no
							).as("purc_act_no"),
							decode(
								S1_T1.purc_act_io_no,
								nullValue(),
								S1_T62.purc_act_d_no,
								S1_T52.purc_act_d_no
							).as("purc_act_d_no"),
							decode(
								S1_T1.purc_act_io_no,
								nullValue(),
								S1_T61.purc_act_io_no,
								S1_T51.purc_act_io_no
							).as("purc_act_io_no"),
							decode(
								S1_T1.purc_act_io_no,
								nullValue(),
								S1_T61.base_unit_qty,
								S1_T51.base_unit_qty
							).as("purc_qty"),
							S1_T3.sls_ret_schd_d_no,
							S1_T2.iv_no,
							S1_T3.iv_d_no,
							S1_T2.outsrc_flg,
							S1_T2.mfg_inst_no,
							S1_T2.pre_outsrc_act_flg,
							S1_T2.pre_mfg_act_no.as("mfg_act_no"),
							S1_T1.stk_lst_prnt_flg,
							S1_T1.edi_flg,
							S1_T1.edi_bp_dlv_slip_no,
							S1_T1.edi_bp_dlv_slip_d_no,
							S1_T1.wms_flg,
							S1_T1.ext_sys_cd,
							S1_T1.ext_arr_act_no,
							decode(
								decode(
									S1_T61.purc_act_io_no,
									nullValue(),
									S1_T91.prov_act_no,
									S1_T92.prov_act_no
								),
								nullValue(),
								decode(
									S1_T8.prov_schd_no,
									nullValue(),
									value(MAC_PROV_TYP.ONR_PROV.value()),
									S1_T8.prov_typ
								),
								decode(
									S1_T61.purc_act_io_no,
									nullValue(),
									S1_T91.prov_typ,
									S1_T92.prov_typ
								)
							).as("prov_typ"),
							decode(
								decode(
									S1_T61.purc_act_io_no,
									nullValue(),
									S1_T91.prov_act_no,
									S1_T92.prov_act_no
								),
								nullValue(),
								decode(
									S1_T8.prov_schd_no,
									nullValue(),
									value(MAC_PROV_BASIS_TYP.INPT.value()),
									S1_T8.prov_basis_typ
								),
								decode(
									S1_T61.purc_act_io_no,
									nullValue(),
									S1_T91.prov_basis_typ,
									S1_T92.prov_basis_typ
								)
							).as("prov_basis_typ"),
							decode(
								S1_T1.arr_schd_no,
								nullValue(),
								nullValue(),
								decode(
									S1_T8.prov_schd_no,
									nullValue(),
									decode(
										S1_T1.trd_ptn_typ,
										value(MAC_TRD_PTN_TYP.PROV.value()),
										value(MSC_PROV_SRC_SCHD_TYP.SHIP.value()),
										value(MSC_PROV_SRC_SCHD_TYP.DDLV.value())
									),
									S1_T8.prov_src_schd_typ
								)
							).as("prov_src_schd_typ"),
							decode(
								S1_T1.arr_schd_no,
								nullValue(),
								nullValue(),
								decode(
									S1_T8.prov_schd_no,
									nullValue(),
									nullValue(),
									S1_T8.prov_src_schd_no1
								)
							).as("prov_src_schd_no1"),
							decode(
								S1_T1.arr_schd_no,
								nullValue(),
								nullValue(),
								decode(
									S1_T8.prov_schd_no,
									nullValue(),
									nullValue(),
									S1_T8.prov_src_schd_no2
								)
							).as("prov_src_schd_no2"),
							S1_T8.prov_schd_no,
							decode(
								S1_T61.purc_act_io_no,
								nullValue(),
								S1_T91.prov_src_act_typ,
								S1_T92.prov_src_act_typ
							).as("prov_src_act_typ"),
							decode(
								S1_T61.purc_act_io_no,
								nullValue(),
								S1_T91.prov_src_act_no,
								S1_T92.prov_src_act_no
							).as("prov_src_act_no"),
							decode(
								S1_T61.purc_act_io_no,
								nullValue(),
								S1_T91.prov_act_no,
								S1_T92.prov_act_no
							).as("prov_act_no"),
							S1_T7.slip_prnt_flg.as("prov_slip_prnt_flg"),
							nullValue().as("pa_io_loc_cd"),
							nullValue().as("pa_io_str_ln_cd"),
							nullValue().as("pa_io_trd_unit_cd"),
							nullValue().as("pa_io_trd_unit_nm"),
							nullValue().as("pa_io_trd_unit_conv_base_qty"),
							nullValue().as("pa_io_trd_unit_conv_qty"),
							nullValue().as("pa_io_trd_unit_dec_place"),
							nullValue().as("pa_io_trd_unit_rnd_typ"),
							nullValue().as("pa_io_base_unit_qty"),
							nullValue().as("aa_base_unit_qty"),
							S1_T1.ins_usr_id,
							S1_T1.ins_usr_nm,
							S1_T1.ins_func_id,
							nullValue().as("ins_func_nm"),
							S1_T1.ins_ts,
							S1_T1.upd_usr_id,
							S1_T1.upd_usr_nm,
							S1_T1.upd_func_id,
							nullValue().as("upd_func_nm"),
							S1_T1.upd_ts,
							S1_T1.upd_srv_req_no,
							S1_T3.upd_cntr.as("arr_pr_upd_cntr"),
							S1_T1.upd_cntr.as("arr_act_upd_cntr"),
							S1_T1.ac_dt.as("master_dt"),
							S1_T1.base_unit_qty.as("base_unit_qty_bef")
						)
						.from(
							S1_T1
							.leftOuterJoin(S1_T2).on(S1_T2.arr_schd_no.eq(S1_T1.arr_schd_no))
							.leftOuterJoin(S1_T3).on(S1_T3.arr_pr_no.eq(S1_T2.arr_pr_no))
							.leftOuterJoin(S1_T4).on(S1_T4.arr_schd_no.eq(S1_T2.arr_schd_no))
							.leftOuterJoin(S1_T51).on(S1_T51.purc_act_io_no.eq(S1_T1.purc_act_io_no))
							.leftOuterJoin(S1_T52).on(
								S1_T52.purc_act_d_no.eq(S1_T51.purc_act_d_no)
								.and(S1_T52.purc_act_d_seq.eq(S1_T51.purc_act_d_seq))
							)
							.leftOuterJoin(S1_T53).on(
								S1_T53.purc_act_no.eq(S1_T52.purc_act_no)
								.and(S1_T53.purc_act_seq.eq(S1_T52.purc_act_seq))
								.and(S1_T53.slip_sts_typ.eq(value(MAC_SLIP_STS_TYP.CRT.value())))
							)
							.leftOuterJoin(S1_T61).on(S1_T61.arr_act_no.eq(S1_T1.arr_act_no))
							.leftOuterJoin(S1_T62).on(
								S1_T62.purc_act_d_no.eq(S1_T61.purc_act_d_no)
								.and(S1_T62.purc_act_d_seq.eq(S1_T61.purc_act_d_seq))
							)
							.leftOuterJoin(S1_T63).on(
								S1_T63.purc_act_no.eq(S1_T62.purc_act_no)
								.and(S1_T63.purc_act_seq.eq(S1_T62.purc_act_seq))
								.and(S1_T63.slip_sts_typ.eq(value(MAC_SLIP_STS_TYP.CRT.value())))
							)
							.leftOuterJoin(S1_T7).on(
								S1_T7.trn_typ.eq(value(MSC_TRN_TYP.PROV.value()))
								.and(S1_T7.dlv_slip_act_no.eq(S1_T53.purc_act_no))
								.and(S1_T7.slip_sts_typ.eq(value(MAC_SLIP_STS_TYP.CRT.value())))
							)
							.leftOuterJoin(S1_T8).on(
								S1_T8.prov_src_schd_typ.in(
									value(MSC_PROV_SRC_SCHD_TYP.SHIP.value()),
									value(MSC_PROV_SRC_SCHD_TYP.DDLV.value())
								)
								.and(S1_T8.prov_src_schd_no2.eq(S1_T2.arr_schd_no))
							)
							.leftOuterJoin(S1_T91).on(
								S1_T91.prov_src_act_typ.in(
									value(MSC_PROV_SRC_ACT_TYP.SHIP.value()),
									value(MSC_PROV_SRC_ACT_TYP.NON_ARR_DDLV.value()),
									value(MSC_PROV_SRC_ACT_TYP.NCV_RCV_DDLV.value())
								)
								.and(S1_T91.prov_src_act_no.eq(S1_T1.arr_act_no))
								.and(S1_T91.slip_sts_typ.eq(value(MAC_SLIP_STS_TYP.CRT.value())))
							)
							.leftOuterJoin(S1_T92).on(
								S1_T92.prov_src_act_typ.eq(value(MSC_PROV_SRC_ACT_TYP.DDLV.value()))
								.and(S1_T92.prov_src_act_no.eq(S1_T61.purc_act_io_no))
								.and(S1_T92.slip_sts_typ.eq(value(MAC_SLIP_STS_TYP.CRT.value())))
							)
							.leftOuterJoin(S1_T101).on(
								S1_T101.dlv_slip_mng_d_no.eq(S1_T2.dlv_slip_mng_d_no)
								.and(S1_T101.dlv_slip_mng_d_seq.eq(S1_T2.dlv_slip_mng_d_seq))
							)
							.leftOuterJoin(S1_T102).on(
								S1_T102.dlv_slip_mng_no.eq(S1_T2.dlv_slip_mng_no)
								.and(S1_T102.dlv_slip_mng_seq.eq(S1_T2.dlv_slip_mng_seq))
							)
						)
						.where(
							value(0).eq(value(0))
							.and(S1_T1.can_flg.eq(value(false)))
							.and(
								S1_T2.arr_skip_flg.eq(value(false))
								.or(S1_T1.arr_schd_no.isNull())
								.cutoff$and(
									S1_T1.trd_ptn_typ.in(
										value(MAC_TRD_PTN_TYP.ARR.value()),
										value(MAC_TRD_PTN_TYP.SHIP_RTN.value())
									)
									.and(bind("tmp_upd_uplnd").eq(value(true)))
								)
							)
							.and(
								value(1).eq(value(0))
								.cutoff$or(
									bracket(
										bracket(
											S1_T2.cmpl_flg.eq(value(false))
											.and(S1_T2.arr_qty.gt(value(0)))
											.or(S1_T2.cmpl_flg.eq(value(true)))
										)
										.and(S1_T2.abort_flg.eq(value(false)))
										.or(S1_T1.arr_schd_no.isNull())
									)
									.and(bind("tmp_arr").eq(value(true)))
								)
								.cutoff$or(
									S1_T2.abort_flg.eq(value(true))
									.and(bind("tmp_abort").eq(value(true)))
								)
							)
							.and(
								value(1).eq(value(0))
								.cutoff$or(
									S1_T1.stk_lst_prnt_flg.eq(value(false))
									.and(bind("tmp_prnt_yet").eq(value(true)))
								)
								.cutoff$or(
									S1_T1.stk_lst_prnt_flg.eq(value(true))
									.and(bind("tmp_prnt_done").eq(value(true)))
								)
							)
							.and(
								value(1).eq(value(0))
								.cutoff$or(
									S1_T1.wms_flg.eq(value(false))
									.and(bind("tmp_wms_f").eq(value(true)))
								)
								.cutoff$or(
									S1_T1.wms_flg.eq(value(true))
									.and(bind("tmp_wms_t").eq(value(true)))
								)
							)
							.cutoff$and(S1_T2.arr_schd_tm.gte(bind("arr_schd_hm_fr")))
							.cutoff$and(S1_T2.arr_schd_tm.lte(bind("arr_schd_hm_to")))
							.cutoff$and(S1_T1.arr_tm.gte(bind("arr_hm_fr")))
							.cutoff$and(S1_T1.arr_tm.lte(bind("arr_hm_to")))
							.cutoff$and(S1_T1.ac_dt.gte(bind("ac_dt_fr")))
							.cutoff$and(S1_T1.ac_dt.lte(bind("ac_dt_to")))
							.cutoff$and(
								MAPA_CALC$F_CALC_PER(
									S1_T2.base_unit_qty,
									S1_T1.base_unit_qty
								).gte(bind("pr_rate_fr"))
							)
							.cutoff$and(
								MAPA_CALC$F_CALC_PER(
									S1_T2.base_unit_qty,
									S1_T1.base_unit_qty
								).lte(bind("pr_rate_to"))
							)
							.cutoff$and(S1_T1.arr_dpt_cd.like(bind("arr_dpt_cd")))
							.cutoff$and(S1_T1.arr_usr_cd.like(bind("arr_usr_cd")))
							.cutoff$and(S1_T1.arr_loc_cd.like(bind("arr_loc_cd")))
							.cutoff$and(S1_T1.str_ln_cd.like(bind("arr_str_ln_cd")))
							.cutoff$and(S1_T1.lg_grp_cd.like(bind("arr_lg_grp_cd")))
							.cutoff$and(S1_T1.wg_cd.like(bind("arr_wg_cd")))
							.cutoff$and(S1_T1.itm_cd.like(bind("itm_cd")))
							.cutoff$and(S1_T1.itm_sub1.like(bind("itm_sub1")))
							.cutoff$and(S1_T1.itm_sub2.like(bind("itm_sub2")))
							.cutoff$and(S1_T1.itm_sub3.like(bind("itm_sub3")))
							.cutoff$and(S1_T1.ver_no.like(bind("ver_no")))
							.cutoff$and(S1_T1.lot_no.like(bind("lot_no")))
							.cutoff$and(S1_T1.sublot_no.like(bind("sublot_no")))
							.cutoff$and(S1_T1.sno1.like(bind("sno1")))
							.cutoff$and(S1_T1.sno2.like(bind("sno2")))
							.cutoff$and(S1_T1.sno3.like(bind("sno3")))
							.cutoff$and(S1_T1.sno4.like(bind("sno4")))
							.cutoff$and(S1_T1.trd_cd.like(bind("trd_cd")))
							.cutoff$and(S1_T2.dlv_slip_no.like(bind("dlv_slip_no")))
							.cutoff$and(S1_T102.dlv_slip_seq.eq(bind("dlv_slip_seq")))
							.cutoff$and(
								cases()
								.when(S1_T2.dlv_slip_mng_d_no.isNull())
								.then(S1_T3.dlv_slip_d_no)
								.otherwise(S1_T101.dlv_slip_d_no).like(bind("dlv_slip_d_no"))
							)
							.cutoff$and(S1_T2.arr_schd_no.like(bind("arr_schd_no")))
							.cutoff$and(S1_T1.arr_act_no.like(bind("arr_act_no")))
							.cutoff$and(S1_T1.ext_arr_act_no.like(bind("ext_arr_act_no")))
							.cutoff$and(S1_T1.trd_rmrks.like(bind("trd_rmrks")))
							.cutoff$and(S1_T1.trd_d_rmrks.like(bind("trd_d_rmrks")))
							.cutoff$and(S1_T2.arr_cnt_rmrks.like(bind("arr_cnt_rmrks")))
							.cutoff$and(S1_T1.sppl_cd.like(bind("sppl_cd")))
							.cutoff$and(S1_T1.maker_cd.like(bind("maker_cd")))
							.cutoff$and(S1_T1.bp_lot_no.like(bind("bp_lot_no")))
							.cutoff$and(S1_T3.po_d_no.like(bind("po_d_no")))
							.cutoff$and(S1_T2.mfg_inst_no.like(bind("mfg_inst_no")))
							.cutoff$and(S1_T1.sppl_itm_cd.like(bind("sppl_itm_cd")))
							.cutoff$and(S1_T1.sppl_itm_nm.like(bind("sppl_itm_nm")))
							.cutoff$and(S1_T1.purc_id_typ.like(bind("purc_id_typ")))
							.cutoff$and(S1_T1.sret_fr_cd.like(bind("sret_fr_cd")))
							.cutoff$and(S1_T1.cst_cd.like(bind("cst_cd")))
							.cutoff$and(S1_T2.iv_no.like(bind("iv_no")))
							.cutoff$and(S1_T3.iv_d_no.like(bind("iv_d_no")))
							.cutoff$and(S1_T8.prov_schd_no.like(bind("prov_schd_no")))
							.and(
								value(1).eq(value(0))
								.cutoff$or(
									bracket(
										S1_T7.slip_prnt_flg.eq(value(false))
										.or(S1_T7.dlv_slip_act_no.isNull())
									)
									.and(bind("tmp_prov_slip_prnt_yet").eq(value(true)))
								)
								.cutoff$or(
									S1_T7.slip_prnt_flg.eq(value(true))
									.and(bind("tmp_prov_slip_prnt_done").eq(value(true)))
								)
								.cutoff$or(
									value(0).eq(value(0))
									.and(bind("tmp_outsrc_f").eq(value(true)))
								)
							)
							.and(
								value(1).eq(value(0))
								.cutoff$or(
									bracket(
										bracket(
											S1_T1.edi_flg.eq(value(false))
											.or(S1_T1.edi_flg.isNull())
										)
										.and(bind("tmp_edi_f").eq(value(true)))
									)
								)
								.cutoff$or(
									bracket(
										S1_T1.edi_flg.eq(value(true))
										.and(bind("tmp_edi_t").eq(value(true)))
									)
								)
							)
							.cutoff$and(
								exists(
									subQuery()
									.select(value("X"))
									.from(S2_W1)
									.where(
										S2_W1.itm_cd.eq(S1_T1.itm_cd)
										.and(S2_W1.itm_sub1.eq(S1_T1.itm_sub1))
										.and(S2_W1.itm_sub2.eq(S1_T1.itm_sub2))
										.and(S2_W1.itm_sub3.eq(S1_T1.itm_sub3))
										.and(S2_W1.stk_lst_flg.eq(bind("tmp_stk_lst_flg_t")))
									)
								)
							)
							.cutoff$and(
								bracket(
									exists(
										subQuery()
										.select(value("X"))
										.from(
											S3_W1
											.innerJoin(S3_W2).on(
												S3_W2.purc_act_d_no.eq(S3_W1.purc_act_d_no)
												.and(S3_W2.purc_act_d_seq.eq(S3_W1.purc_act_d_seq))
											)
											.innerJoin(S3_W3).on(
												S3_W3.purc_act_no.eq(S3_W2.purc_act_no)
												.and(S3_W3.purc_act_seq.eq(S3_W2.purc_act_seq))
											)
										)
										.where(
											S3_W1.arr_act_no.eq(S1_T1.arr_act_no)
											.and(S3_W3.slip_sts_typ.eq(value(MAC_SLIP_STS_TYP.CRT.value())))
											.and(S3_W3.purc_act_no.like(bind("purc_act_no")))
										)
									)
									.or(S1_T53.purc_act_no.like(bind("purc_act_no")))
								)
							)
							.cutoff$and(
								exists(
									subQuery()
									.select(value("X"))
									.from(
										S4_W1
										.innerJoin(S4_W2).on(
											S4_W2.sls_act_d_no.eq(S4_W1.sls_act_d_no)
											.and(S4_W2.sls_act_d_seq.eq(S4_W1.sls_act_d_seq))
										)
										.innerJoin(S4_W3).on(
											S4_W3.sls_act_no.eq(S4_W2.sls_act_no)
											.and(S4_W3.sls_act_seq.eq(S4_W2.sls_act_seq))
										)
									)
									.where(
										S4_W1.arr_act_no.eq(S1_T1.arr_act_no)
										.and(S4_W3.slip_sts_typ.eq(value(MAC_SLIP_STS_TYP.CRT.value())))
										.and(S4_W3.sls_act_no.like(bind("sls_act_no")))
									)
								)
							)
							.cutoff$and(
								bracket(
									exists(
										subQuery()
										.select(value("X"))
										.from(S5_W1)
										.where(
											S5_W1.prov_src_act_no.eq(S1_T61.purc_act_io_no)
											.and(S5_W1.prov_src_act_typ.eq(value(MSC_PROV_SRC_ACT_TYP.DDLV.value())))
											.and(S5_W1.slip_sts_typ.eq(value(MAC_SLIP_STS_TYP.CRT.value())))
											.and(S5_W1.prov_act_no.like(bind("prov_act_no")))
										)
									)
									.or(S1_T91.prov_act_no.like(bind("prov_act_no")))
								)
							)
							.cutoff$and(
								bracket(
									exists(
										subQuery()
										.select(value("X"))
										.from(S6_W1)
										.where(
											S6_W1.prov_src_act_no.eq(S1_T61.purc_act_io_no)
											.and(S6_W1.prov_src_act_typ.eq(value(MSC_PROV_SRC_ACT_TYP.DDLV.value())))
											.and(S6_W1.slip_sts_typ.eq(value(MAC_SLIP_STS_TYP.CRT.value())))
											.and(S6_W1.prov_src_act_typ.like(bind("prov_src_act_typ")))
										)
									)
									.or(S1_T91.prov_src_act_typ.like(bind("prov_src_act_typ")))
								)
							)
							.cutoff$and(
								bracket(
									exists(
										subQuery()
										.select(value("X"))
										.from(S7_W1)
										.where(
											S7_W1.prov_src_act_no.eq(S1_T61.purc_act_io_no)
											.and(S7_W1.prov_src_act_typ.eq(value(MSC_PROV_SRC_ACT_TYP.DDLV.value())))
											.and(S7_W1.slip_sts_typ.eq(value(MAC_SLIP_STS_TYP.CRT.value())))
											.and(S7_W1.prov_src_act_no.like(bind("prov_src_act_no")))
										)
									)
									.or(S1_T91.prov_src_act_no.like(bind("prov_src_act_no")))
								)
							)
							.cutoff$and(
								exists(
									subQuery()
									.select(value("X"))
									.from(
										S10_W1
										.leftOuterJoin(S10_W2).on(S10_W2.rcpt_iv_d_no.eq(S10_W1.rcpt_iv_d_no))
										.leftOuterJoin(S10_W3).on(S10_W3.rcpt_iv_mng_no.eq(S10_W2.rcpt_iv_mng_no))
									)
									.where(
										bracket(
											S10_W1.arr_act_no.eq(S1_T1.arr_act_no)
												.or(S10_W1.arr_schd_no.eq(S1_T1.arr_schd_no))
										)
										.and(S10_W1.rcpt_iv_no.like(bind("rcpt_iv_no"))
												.or(S10_W3.rcpt_iv_no.like(bind("rcpt_iv_no"))))
									)
									.union(
										subQuery()
										.select(value("X"))
										.from(
											S11_W1
											.innerJoin(S11_W2).on(
												S11_W2.purc_act_d_no.eq(S11_W1.purc_act_d_no)
												.and(S11_W2.purc_act_d_seq.eq(S11_W1.purc_act_d_seq))
											)
											.innerJoin(S11_W3).on(
												S11_W3.purc_act_no.eq(S11_W2.purc_act_no)
												.and(S11_W3.purc_act_seq.eq(S11_W2.purc_act_seq))
											)
										)
										.where(
											S11_W1.arr_act_no.eq(S1_T1.arr_act_no)
											.and(S11_W3.slip_sts_typ.eq(value(MAC_SLIP_STS_TYP.CRT.value())))
											.and(S11_W3.rcpt_iv_no.like(bind("rcpt_iv_no")))
										)
									)
								)
							)
							.cutoff$and(
								exists(
									subQuery()
									.select(value("X"))
									.from(S10_W1)
									.where(
										bracket(
											S10_W1.arr_act_no.eq(S1_T1.arr_act_no)
												.or(S10_W1.arr_schd_no.eq(S1_T1.arr_schd_no))
										)
										.and(S10_W1.rcpt_iv_d_no.like(bind("rcpt_iv_d_no")))
									)
									.union(
										subQuery()
										.select(value("X"))
										.from(
											S12_W1
											.innerJoin(S12_W2).on(
												S12_W2.purc_act_d_no.eq(S11_W1.purc_act_d_no)
												.and(S12_W2.purc_act_d_seq.eq(S11_W1.purc_act_d_seq))
											)
											.innerJoin(S12_W3).on(
												S12_W3.purc_act_no.eq(S12_W2.purc_act_no)
												.and(S12_W3.purc_act_seq.eq(S12_W2.purc_act_seq))
											)
										)
										.where(
											S12_W1.arr_act_no.eq(S1_T1.arr_act_no)
											.and(S12_W3.slip_sts_typ.eq(value(MAC_SLIP_STS_TYP.CRT.value())))
											.and(S12_W2.rcpt_iv_d_no.like(bind("rcpt_iv_d_no")))
										)
									)
								)
							)
						).view(S0_V1)
						.innerJoin(S0_ARR_LOC).on(S0_ARR_LOC.loc_cd.eq(S0_V1.pr(S1_T1.arr_loc_cd)))
						.addDynamicView(DS0D)
					)
					.where(
						value(0).eq(value(0))
						.addDynamicPredicate(DS0D)
						.and(
							exists(
								subQuery()
								.select(value("X"))
								.from(S8_W1)
								.where(
									S8_W1.loc_cd.eq(S0_V1.pr(S1_T1.arr_loc_cd))
								)
							)
							.or(
								exists(
									subQuery()
									.select(value("X"))
									.from(S9_W2)
									.where(
										S9_W2.lg_grp_cd.eq(S0_V1.pr("arr_lg_grp_cd"))
									)
								)
							)
						)
						.and(S0_ARR_LOC.sppl_cd.isNotNull())
						.cutoff$and(S0_ARR_LOC.loc_nm.like(bind("arr_loc_nm")))
						.cutoff$and(S0_ARR_LOC.site_cd.like(bind("arr_site_cd")))
						.cutoff$and(S0_ARR_LOC.alloc_grp_cd.like(bind("arr_alloc_grp_cd")))
						.cutoff$and(S0_ARR_LOC.sppl_cd.like(bind("prsppl_cd")))
						.cutoff$and(S0_V1.pr("rqst_dpt_cd").like(bind("rqst_dpt_cd")))
						.cutoff$and(S0_V1.pr("rqst_usr_cd").like(bind("rqst_usr_cd")))
						.cutoff$and(S0_V1.pr("prov_typ").like(bind("prov_typ")))
						.cutoff$and(S0_V1.pr("prov_basis_typ").like(bind("prov_basis_typ")))
						.cutoff$and(S0_V1.pr("prov_src_schd_typ").like(bind("prov_src_schd_typ")))
						.cutoff$and(S0_V1.pr("prov_src_schd_no1").like(bind("prov_src_schd_no1")))
						.cutoff$and(S0_V1.pr("prov_src_schd_no2").like(bind("prov_src_schd_no2")))
					)
					.orderBy(S0_V1.pr(S1_T1.arr_act_no).asc())
			)
			.setDynamicSQLInfo(
				when(boundOr("sppl_nm", "rcpt_iv_itm_nm", "po_grp_flg1", "po_grp_flg2", "po_grp_flg3", "po_grp_flg4", "po_grp_flg5", "po_grp_flg6", "po_grp_flg7", "po_grp_flg8", "po_grp_flg9", "po_grp_flg10"))
					.view(DS0D, v -> v.leftOuterJoin(S0_SPPL).on(S0_SPPL.bp_cd.eq(S0_V1.pr(S1_T1.sppl_cd))))
					.predicate(DS0D, p -> p.cutoff$and(S0_SPPL.bp_nm.like(bind("sppl_nm")))),
				when(boundOr("po_grp_flg1"))
					.select(DS0D, S0_SPPL.bp_grp_cd1.as("po_grp_cd1"))
					.groupBy(DS0D, S0_SPPL.bp_grp_cd1),
				when(boundOr("po_grp_flg1", "po_grp_cd1"))
					.predicate(DS0D, p -> p.cutoff$and(S0_SPPL.bp_grp_cd1.like(bind("po_grp_cd1")))),
				when(boundOr("po_grp_flg1"))
					.select(DS0D, S0_PO_GRP1.bp_grp_nm.as("po_grp_nm1"))
					.groupBy(DS0D, S0_PO_GRP1.bp_grp_nm),
				when(boundOr("po_grp_flg1", "po_grp_nm1"))
					.view(DS0D, v -> v.leftOuterJoin(S0_PO_GRP1).on(S0_SPPL.bp_grp_cd1.eq(S0_PO_GRP1.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP1.value()).eq(S0_PO_GRP1.bp_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_PO_GRP1.bp_grp_nm.like(bind("po_grp_nm1")))),
				when(boundOr("po_grp_flg2"))
					.select(DS0D, S0_SPPL.bp_grp_cd2.as("po_grp_cd2"))
					.groupBy(DS0D, S0_SPPL.bp_grp_cd2),
				when(boundOr("po_grp_flg2", "po_grp_cd2"))
					.predicate(DS0D, p -> p.cutoff$and(S0_SPPL.bp_grp_cd2.like(bind("po_grp_cd2")))),
				when(boundOr("po_grp_flg2"))
					.select(DS0D, S0_PO_GRP2.bp_grp_nm.as("po_grp_nm2"))
					.groupBy(DS0D, S0_PO_GRP2.bp_grp_nm),
				when(boundOr("po_grp_flg2", "po_grp_nm2"))
					.view(DS0D, v -> v.leftOuterJoin(S0_PO_GRP2).on(S0_SPPL.bp_grp_cd2.eq(S0_PO_GRP2.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP2.value()).eq(S0_PO_GRP2.bp_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_PO_GRP2.bp_grp_nm.like(bind("po_grp_nm2")))),
				when(boundOr("po_grp_flg3"))
					.select(DS0D, S0_SPPL.bp_grp_cd3.as("po_grp_cd3"))
					.groupBy(DS0D, S0_SPPL.bp_grp_cd3),
				when(boundOr("po_grp_flg3", "po_grp_cd3"))
					.predicate(DS0D, p -> p.cutoff$and(S0_SPPL.bp_grp_cd3.like(bind("po_grp_cd3")))),
				when(boundOr("po_grp_flg3"))
					.select(DS0D, S0_PO_GRP3.bp_grp_nm.as("po_grp_nm3"))
					.groupBy(DS0D, S0_PO_GRP3.bp_grp_nm),
				when(boundOr("po_grp_flg3", "po_grp_nm3"))
					.view(DS0D, v -> v.leftOuterJoin(S0_PO_GRP3).on(S0_SPPL.bp_grp_cd3.eq(S0_PO_GRP3.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP3.value()).eq(S0_PO_GRP3.bp_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_PO_GRP3.bp_grp_nm.like(bind("po_grp_nm3")))),
				when(boundOr("po_grp_flg4"))
					.select(DS0D, S0_SPPL.bp_grp_cd4.as("po_grp_cd4"))
					.groupBy(DS0D, S0_SPPL.bp_grp_cd4),
				when(boundOr("po_grp_flg4", "po_grp_cd4"))
					.predicate(DS0D, p -> p.cutoff$and(S0_SPPL.bp_grp_cd4.like(bind("po_grp_cd4")))),
				when(boundOr("po_grp_flg4"))
					.select(DS0D, S0_PO_GRP4.bp_grp_nm.as("po_grp_nm4"))
					.groupBy(DS0D, S0_PO_GRP4.bp_grp_nm),
				when(boundOr("po_grp_flg4", "po_grp_nm4"))
					.view(DS0D, v -> v.leftOuterJoin(S0_PO_GRP4).on(S0_SPPL.bp_grp_cd4.eq(S0_PO_GRP4.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP4.value()).eq(S0_PO_GRP4.bp_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_PO_GRP4.bp_grp_nm.like(bind("po_grp_nm4")))),
				when(boundOr("po_grp_flg5"))
					.select(DS0D, S0_SPPL.bp_grp_cd5.as("po_grp_cd5"))
					.groupBy(DS0D, S0_SPPL.bp_grp_cd5),
				when(boundOr("po_grp_flg5", "po_grp_cd5"))
					.predicate(DS0D, p -> p.cutoff$and(S0_SPPL.bp_grp_cd5.like(bind("po_grp_cd5")))),
				when(boundOr("po_grp_flg5"))
					.select(DS0D, S0_PO_GRP5.bp_grp_nm.as("po_grp_nm5"))
					.groupBy(DS0D, S0_PO_GRP5.bp_grp_nm),
				when(boundOr("po_grp_flg5", "po_grp_nm5"))
					.view(DS0D, v -> v.leftOuterJoin(S0_PO_GRP5).on(S0_SPPL.bp_grp_cd5.eq(S0_PO_GRP5.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP5.value()).eq(S0_PO_GRP5.bp_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_PO_GRP5.bp_grp_nm.like(bind("po_grp_nm5")))),
				when(boundOr("po_grp_flg6"))
					.select(DS0D, S0_SPPL.bp_grp_cd6.as("po_grp_cd6"))
					.groupBy(DS0D, S0_SPPL.bp_grp_cd6),
				when(boundOr("po_grp_flg6", "po_grp_cd6"))
					.predicate(DS0D, p -> p.cutoff$and(S0_SPPL.bp_grp_cd6.like(bind("po_grp_cd6")))),
				when(boundOr("po_grp_flg6"))
					.select(DS0D, S0_PO_GRP6.bp_grp_nm.as("po_grp_nm6"))
					.groupBy(DS0D, S0_PO_GRP6.bp_grp_nm),
				when(boundOr("po_grp_flg6", "po_grp_nm6"))
					.view(DS0D, v -> v.leftOuterJoin(S0_PO_GRP6).on(S0_SPPL.bp_grp_cd6.eq(S0_PO_GRP6.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP6.value()).eq(S0_PO_GRP6.bp_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_PO_GRP6.bp_grp_nm.like(bind("po_grp_nm6")))),
				when(boundOr("po_grp_flg7"))
					.select(DS0D, S0_SPPL.bp_grp_cd7.as("po_grp_cd7"))
					.groupBy(DS0D, S0_SPPL.bp_grp_cd7),
				when(boundOr("po_grp_flg7", "po_grp_cd7"))
					.predicate(DS0D, p -> p.cutoff$and(S0_SPPL.bp_grp_cd7.like(bind("po_grp_cd7")))),
				when(boundOr("po_grp_flg7"))
					.select(DS0D, S0_PO_GRP7.bp_grp_nm.as("po_grp_nm7"))
					.groupBy(DS0D, S0_PO_GRP7.bp_grp_nm),
				when(boundOr("po_grp_flg7", "po_grp_nm7"))
					.view(DS0D, v -> v.leftOuterJoin(S0_PO_GRP7).on(S0_SPPL.bp_grp_cd7.eq(S0_PO_GRP7.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP7.value()).eq(S0_PO_GRP7.bp_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_PO_GRP7.bp_grp_nm.like(bind("po_grp_nm7")))),
				when(boundOr("po_grp_flg8"))
					.select(DS0D, S0_SPPL.bp_grp_cd8.as("po_grp_cd8"))
					.groupBy(DS0D, S0_SPPL.bp_grp_cd8),
				when(boundOr("po_grp_flg8", "po_grp_cd8"))
					.predicate(DS0D, p -> p.cutoff$and(S0_SPPL.bp_grp_cd8.like(bind("po_grp_cd8")))),
				when(boundOr("po_grp_flg8"))
					.select(DS0D, S0_PO_GRP8.bp_grp_nm.as("po_grp_nm8"))
					.groupBy(DS0D, S0_PO_GRP8.bp_grp_nm),
				when(boundOr("po_grp_flg8", "po_grp_nm8"))
					.view(DS0D, v -> v.leftOuterJoin(S0_PO_GRP8).on(S0_SPPL.bp_grp_cd8.eq(S0_PO_GRP8.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP8.value()).eq(S0_PO_GRP8.bp_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_PO_GRP8.bp_grp_nm.like(bind("po_grp_nm8")))),
				when(boundOr("po_grp_flg9"))
					.select(DS0D, S0_SPPL.bp_grp_cd9.as("po_grp_cd9"))
					.groupBy(DS0D, S0_SPPL.bp_grp_cd9),
				when(boundOr("po_grp_flg9", "po_grp_cd9"))
					.predicate(DS0D, p -> p.cutoff$and(S0_SPPL.bp_grp_cd9.like(bind("po_grp_cd9")))),
				when(boundOr("po_grp_flg9"))
					.select(DS0D, S0_PO_GRP9.bp_grp_nm.as("po_grp_nm9"))
					.groupBy(DS0D, S0_PO_GRP9.bp_grp_nm),
				when(boundOr("po_grp_flg9", "po_grp_nm9"))
					.view(DS0D, v -> v.leftOuterJoin(S0_PO_GRP9).on(S0_SPPL.bp_grp_cd9.eq(S0_PO_GRP9.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP9.value()).eq(S0_PO_GRP9.bp_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_PO_GRP9.bp_grp_nm.like(bind("po_grp_nm9")))),
				when(boundOr("po_grp_flg10"))
					.select(DS0D, S0_SPPL.bp_grp_cd10.as("po_grp_cd10"))
					.groupBy(DS0D, S0_SPPL.bp_grp_cd10),
				when(boundOr("po_grp_flg10", "po_grp_cd10"))
					.predicate(DS0D, p -> p.cutoff$and(S0_SPPL.bp_grp_cd10.like(bind("po_grp_cd10")))),
				when(boundOr("po_grp_flg10"))
					.select(DS0D, S0_PO_GRP10.bp_grp_nm.as("po_grp_nm10"))
					.groupBy(DS0D, S0_PO_GRP10.bp_grp_nm),
				when(boundOr("po_grp_flg10", "po_grp_nm10"))
					.view(DS0D, v -> v.leftOuterJoin(S0_PO_GRP10).on(S0_SPPL.bp_grp_cd10.eq(S0_PO_GRP10.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP10.value()).eq(S0_PO_GRP10.bp_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_PO_GRP10.bp_grp_nm.like(bind("po_grp_nm10")))),
				when(boundOr("sret_fr_cd", "sret_fr_nm", "sret_fr_grp_flg1", "sret_fr_grp_flg2", "sret_fr_grp_flg3", "sret_fr_grp_flg4", "sret_fr_grp_flg5", "sret_fr_grp_flg6", "sret_fr_grp_flg7", "sret_fr_grp_flg8", "sret_fr_grp_flg9", "sret_fr_grp_flg10", "sls_ret_schd_no", "cst_po_no", "cst_itm_cd", "cst_itm_nm"))
					.view(DS0D, v -> v.leftOuterJoin(S0_SRET_SCHD_D).on(S0_SRET_SCHD_D.sls_ret_schd_d_no.eq(S0_V1.pr(S1_T3.sls_ret_schd_d_no))).leftOuterJoin(S0_SRET_FR).on(S0_SRET_FR.bp_cd.eq(S0_V1.pr(S1_T1.sret_fr_cd))))
					.predicate(DS0D, p -> p.cutoff$and(nvl(S0_SRET_SCHD_D.sret_fr_nm,S0_SRET_FR.bp_nm).like(bind("sret_fr_nm")))),
				when(boundOr("sret_fr_grp_flg1"))
					.select(DS0D, S0_SRET_FR.bp_grp_cd1.as("sret_fr_grp_cd1"))
					.groupBy(DS0D, S0_SRET_FR.bp_grp_cd1),
				when(boundOr("sret_fr_grp_flg1", "sret_fr_grp_cd1"))
					.predicate(DS0D, p -> p.cutoff$and(S0_SRET_FR.bp_grp_cd1.like(bind("sret_fr_grp_cd1")))),
				when(boundOr("sret_fr_grp_flg1"))
					.select(DS0D, S0_SRET_FR_GRP1.bp_grp_nm.as("sret_fr_grp_nm1"))
					.groupBy(DS0D, S0_SRET_FR_GRP1.bp_grp_nm),
				when(boundOr("sret_fr_grp_flg1", "sret_fr_grp_nm1"))
					.view(DS0D, v -> v.leftOuterJoin(S0_SRET_FR_GRP1).on(S0_SRET_FR.bp_grp_cd1.eq(S0_SRET_FR_GRP1.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP1.value()).eq(S0_SRET_FR_GRP1.bp_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_SRET_FR_GRP1.bp_grp_nm.like(bind("sret_fr_grp_nm1")))),
				when(boundOr("sret_fr_grp_flg2"))
					.select(DS0D, S0_SRET_FR.bp_grp_cd2.as("sret_fr_grp_cd2"))
					.groupBy(DS0D, S0_SRET_FR.bp_grp_cd2),
				when(boundOr("sret_fr_grp_flg2", "sret_fr_grp_cd2"))
					.predicate(DS0D, p -> p.cutoff$and(S0_SRET_FR.bp_grp_cd2.like(bind("sret_fr_grp_cd2")))),
				when(boundOr("sret_fr_grp_flg2"))
					.select(DS0D, S0_SRET_FR_GRP2.bp_grp_nm.as("sret_fr_grp_nm2"))
					.groupBy(DS0D, S0_SRET_FR_GRP2.bp_grp_nm),
				when(boundOr("sret_fr_grp_flg2", "sret_fr_grp_nm2"))
					.view(DS0D, v -> v.leftOuterJoin(S0_SRET_FR_GRP2).on(S0_SRET_FR.bp_grp_cd2.eq(S0_SRET_FR_GRP2.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP2.value()).eq(S0_SRET_FR_GRP2.bp_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_SRET_FR_GRP2.bp_grp_nm.like(bind("sret_fr_grp_nm2")))),
				when(boundOr("sret_fr_grp_flg3"))
					.select(DS0D, S0_SRET_FR.bp_grp_cd3.as("sret_fr_grp_cd3"))
					.groupBy(DS0D, S0_SRET_FR.bp_grp_cd3),
				when(boundOr("sret_fr_grp_flg3", "sret_fr_grp_cd3"))
					.predicate(DS0D, p -> p.cutoff$and(S0_SRET_FR.bp_grp_cd3.like(bind("sret_fr_grp_cd3")))),
				when(boundOr("sret_fr_grp_flg3"))
					.select(DS0D, S0_SRET_FR_GRP3.bp_grp_nm.as("sret_fr_grp_nm3"))
					.groupBy(DS0D, S0_SRET_FR_GRP3.bp_grp_nm),
				when(boundOr("sret_fr_grp_flg3", "sret_fr_grp_nm3"))
					.view(DS0D, v -> v.leftOuterJoin(S0_SRET_FR_GRP3).on(S0_SRET_FR.bp_grp_cd3.eq(S0_SRET_FR_GRP3.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP3.value()).eq(S0_SRET_FR_GRP3.bp_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_SRET_FR_GRP3.bp_grp_nm.like(bind("sret_fr_grp_nm3")))),
				when(boundOr("sret_fr_grp_flg4"))
					.select(DS0D, S0_SRET_FR.bp_grp_cd4.as("sret_fr_grp_cd4"))
					.groupBy(DS0D, S0_SRET_FR.bp_grp_cd4),
				when(boundOr("sret_fr_grp_flg4", "sret_fr_grp_cd4"))
					.predicate(DS0D, p -> p.cutoff$and(S0_SRET_FR.bp_grp_cd4.like(bind("sret_fr_grp_cd4")))),
				when(boundOr("sret_fr_grp_flg4"))
					.select(DS0D, S0_SRET_FR_GRP4.bp_grp_nm.as("sret_fr_grp_nm4"))
					.groupBy(DS0D, S0_SRET_FR_GRP4.bp_grp_nm),
				when(boundOr("sret_fr_grp_flg4", "sret_fr_grp_nm4"))
					.view(DS0D, v -> v.leftOuterJoin(S0_SRET_FR_GRP4).on(S0_SRET_FR.bp_grp_cd4.eq(S0_SRET_FR_GRP4.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP4.value()).eq(S0_SRET_FR_GRP4.bp_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_SRET_FR_GRP4.bp_grp_nm.like(bind("sret_fr_grp_nm4")))),
				when(boundOr("sret_fr_grp_flg5"))
					.select(DS0D, S0_SRET_FR.bp_grp_cd5.as("sret_fr_grp_cd5"))
					.groupBy(DS0D, S0_SRET_FR.bp_grp_cd5),
				when(boundOr("sret_fr_grp_flg5", "sret_fr_grp_cd5"))
					.predicate(DS0D, p -> p.cutoff$and(S0_SRET_FR.bp_grp_cd5.like(bind("sret_fr_grp_cd5")))),
				when(boundOr("sret_fr_grp_flg5"))
					.select(DS0D, S0_SRET_FR_GRP5.bp_grp_nm.as("sret_fr_grp_nm5"))
					.groupBy(DS0D, S0_SRET_FR_GRP5.bp_grp_nm),
				when(boundOr("sret_fr_grp_flg5", "sret_fr_grp_nm5"))
					.view(DS0D, v -> v.leftOuterJoin(S0_SRET_FR_GRP5).on(S0_SRET_FR.bp_grp_cd5.eq(S0_SRET_FR_GRP5.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP5.value()).eq(S0_SRET_FR_GRP5.bp_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_SRET_FR_GRP5.bp_grp_nm.like(bind("sret_fr_grp_nm5")))),
				when(boundOr("sret_fr_grp_flg6"))
					.select(DS0D, S0_SRET_FR.bp_grp_cd6.as("sret_fr_grp_cd6"))
					.groupBy(DS0D, S0_SRET_FR.bp_grp_cd6),
				when(boundOr("sret_fr_grp_flg6", "sret_fr_grp_cd6"))
					.predicate(DS0D, p -> p.cutoff$and(S0_SRET_FR.bp_grp_cd6.like(bind("sret_fr_grp_cd6")))),
				when(boundOr("sret_fr_grp_flg6"))
					.select(DS0D, S0_SRET_FR_GRP6.bp_grp_nm.as("sret_fr_grp_nm6"))
					.groupBy(DS0D, S0_SRET_FR_GRP6.bp_grp_nm),
				when(boundOr("sret_fr_grp_flg6", "sret_fr_grp_nm6"))
					.view(DS0D, v -> v.leftOuterJoin(S0_SRET_FR_GRP6).on(S0_SRET_FR.bp_grp_cd6.eq(S0_SRET_FR_GRP6.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP6.value()).eq(S0_SRET_FR_GRP6.bp_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_SRET_FR_GRP6.bp_grp_nm.like(bind("sret_fr_grp_nm6")))),
				when(boundOr("sret_fr_grp_flg7"))
					.select(DS0D, S0_SRET_FR.bp_grp_cd7.as("sret_fr_grp_cd7"))
					.groupBy(DS0D, S0_SRET_FR.bp_grp_cd7),
				when(boundOr("sret_fr_grp_flg7", "sret_fr_grp_cd7"))
					.predicate(DS0D, p -> p.cutoff$and(S0_SRET_FR.bp_grp_cd7.like(bind("sret_fr_grp_cd7")))),
				when(boundOr("sret_fr_grp_flg7"))
					.select(DS0D, S0_SRET_FR_GRP7.bp_grp_nm.as("sret_fr_grp_nm7"))
					.groupBy(DS0D, S0_SRET_FR_GRP7.bp_grp_nm),
				when(boundOr("sret_fr_grp_flg7", "sret_fr_grp_nm7"))
					.view(DS0D, v -> v.leftOuterJoin(S0_SRET_FR_GRP7).on(S0_SRET_FR.bp_grp_cd7.eq(S0_SRET_FR_GRP7.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP7.value()).eq(S0_SRET_FR_GRP7.bp_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_SRET_FR_GRP7.bp_grp_nm.like(bind("sret_fr_grp_nm7")))),
				when(boundOr("sret_fr_grp_flg8"))
					.select(DS0D, S0_SRET_FR.bp_grp_cd8.as("sret_fr_grp_cd8"))
					.groupBy(DS0D, S0_SRET_FR.bp_grp_cd8),
				when(boundOr("sret_fr_grp_flg8", "sret_fr_grp_cd8"))
					.predicate(DS0D, p -> p.cutoff$and(S0_SRET_FR.bp_grp_cd8.like(bind("sret_fr_grp_cd8")))),
				when(boundOr("sret_fr_grp_flg8"))
					.select(DS0D, S0_SRET_FR_GRP8.bp_grp_nm.as("sret_fr_grp_nm8"))
					.groupBy(DS0D, S0_SRET_FR_GRP8.bp_grp_nm),
				when(boundOr("sret_fr_grp_flg8", "sret_fr_grp_nm8"))
					.view(DS0D, v -> v.leftOuterJoin(S0_SRET_FR_GRP8).on(S0_SRET_FR.bp_grp_cd8.eq(S0_SRET_FR_GRP8.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP8.value()).eq(S0_SRET_FR_GRP8.bp_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_SRET_FR_GRP8.bp_grp_nm.like(bind("sret_fr_grp_nm8")))),
				when(boundOr("sret_fr_grp_flg9"))
					.select(DS0D, S0_SRET_FR.bp_grp_cd9.as("sret_fr_grp_cd9"))
					.groupBy(DS0D, S0_SRET_FR.bp_grp_cd9),
				when(boundOr("sret_fr_grp_flg9", "sret_fr_grp_cd9"))
					.predicate(DS0D, p -> p.cutoff$and(S0_SRET_FR.bp_grp_cd9.like(bind("sret_fr_grp_cd9")))),
				when(boundOr("sret_fr_grp_flg9"))
					.select(DS0D, S0_SRET_FR_GRP9.bp_grp_nm.as("sret_fr_grp_nm9"))
					.groupBy(DS0D, S0_SRET_FR_GRP9.bp_grp_nm),
				when(boundOr("sret_fr_grp_flg9", "sret_fr_grp_nm9"))
					.view(DS0D, v -> v.leftOuterJoin(S0_SRET_FR_GRP9).on(S0_SRET_FR.bp_grp_cd9.eq(S0_SRET_FR_GRP9.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP9.value()).eq(S0_SRET_FR_GRP9.bp_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_SRET_FR_GRP9.bp_grp_nm.like(bind("sret_fr_grp_nm9")))),
				when(boundOr("sret_fr_grp_flg10"))
					.select(DS0D, S0_SRET_FR.bp_grp_cd10.as("sret_fr_grp_cd10"))
					.groupBy(DS0D, S0_SRET_FR.bp_grp_cd10),
				when(boundOr("sret_fr_grp_flg10", "sret_fr_grp_cd10"))
					.predicate(DS0D, p -> p.cutoff$and(S0_SRET_FR.bp_grp_cd10.like(bind("sret_fr_grp_cd10")))),
				when(boundOr("sret_fr_grp_flg10"))
					.select(DS0D, S0_SRET_FR_GRP10.bp_grp_nm.as("sret_fr_grp_nm10"))
					.groupBy(DS0D, S0_SRET_FR_GRP10.bp_grp_nm),
				when(boundOr("sret_fr_grp_flg10", "sret_fr_grp_nm10"))
					.view(DS0D, v -> v.leftOuterJoin(S0_SRET_FR_GRP10).on(S0_SRET_FR.bp_grp_cd10.eq(S0_SRET_FR_GRP10.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP10.value()).eq(S0_SRET_FR_GRP10.bp_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_SRET_FR_GRP10.bp_grp_nm.like(bind("sret_fr_grp_nm10")))),
				when(boundOr("cst_nm", "cst_grp_flg1", "cst_grp_flg2", "cst_grp_flg3", "cst_grp_flg4", "cst_grp_flg5", "cst_grp_flg6", "cst_grp_flg7", "cst_grp_flg8", "cst_grp_flg9", "cst_grp_flg10"))
					.view(DS0D, v -> v.leftOuterJoin(S0_CST).on(S0_CST.bp_cd.eq(S0_V1.pr(S1_T1.cst_cd))))
					.predicate(DS0D, p -> p.cutoff$and(S0_CST.bp_nm.like(bind("cst_nm")))),
				when(boundOr("cst_grp_flg1"))
					.select(DS0D, S0_CST.bp_grp_cd1.as("cst_grp_cd1"))
					.groupBy(DS0D, S0_CST.bp_grp_cd1),
				when(boundOr("cst_grp_flg1", "cst_grp_cd1"))
					.predicate(DS0D, p -> p.cutoff$and(S0_CST.bp_grp_cd1.like(bind("cst_grp_cd1")))),
				when(boundOr("cst_grp_flg1"))
					.select(DS0D, S0_CST_GRP1.bp_grp_nm.as("cst_grp_nm1"))
					.groupBy(DS0D, S0_CST_GRP1.bp_grp_nm),
				when(boundOr("cst_grp_flg1", "cst_grp_nm1"))
					.view(DS0D, v -> v.leftOuterJoin(S0_CST_GRP1).on(S0_CST.bp_grp_cd1.eq(S0_CST_GRP1.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP1.value()).eq(S0_CST_GRP1.bp_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_CST_GRP1.bp_grp_nm.like(bind("cst_grp_nm1")))),
				when(boundOr("cst_grp_flg2"))
					.select(DS0D, S0_CST.bp_grp_cd2.as("cst_grp_cd2"))
					.groupBy(DS0D, S0_CST.bp_grp_cd2),
				when(boundOr("cst_grp_flg2", "cst_grp_cd2"))
					.predicate(DS0D, p -> p.cutoff$and(S0_CST.bp_grp_cd2.like(bind("cst_grp_cd2")))),
				when(boundOr("cst_grp_flg2"))
					.select(DS0D, S0_CST_GRP2.bp_grp_nm.as("cst_grp_nm2"))
					.groupBy(DS0D, S0_CST_GRP2.bp_grp_nm),
				when(boundOr("cst_grp_flg2", "cst_grp_nm2"))
					.view(DS0D, v -> v.leftOuterJoin(S0_CST_GRP2).on(S0_CST.bp_grp_cd2.eq(S0_CST_GRP2.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP2.value()).eq(S0_CST_GRP2.bp_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_CST_GRP2.bp_grp_nm.like(bind("cst_grp_nm2")))),
				when(boundOr("cst_grp_flg3"))
					.select(DS0D, S0_CST.bp_grp_cd3.as("cst_grp_cd3"))
					.groupBy(DS0D, S0_CST.bp_grp_cd3),
				when(boundOr("cst_grp_flg3", "cst_grp_cd3"))
					.predicate(DS0D, p -> p.cutoff$and(S0_CST.bp_grp_cd3.like(bind("cst_grp_cd3")))),
				when(boundOr("cst_grp_flg3"))
					.select(DS0D, S0_CST_GRP3.bp_grp_nm.as("cst_grp_nm3"))
					.groupBy(DS0D, S0_CST_GRP3.bp_grp_nm),
				when(boundOr("cst_grp_flg3", "cst_grp_nm3"))
					.view(DS0D, v -> v.leftOuterJoin(S0_CST_GRP3).on(S0_CST.bp_grp_cd3.eq(S0_CST_GRP3.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP3.value()).eq(S0_CST_GRP3.bp_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_CST_GRP3.bp_grp_nm.like(bind("cst_grp_nm3")))),
				when(boundOr("cst_grp_flg4"))
					.select(DS0D, S0_CST.bp_grp_cd4.as("cst_grp_cd4"))
					.groupBy(DS0D, S0_CST.bp_grp_cd4),
				when(boundOr("cst_grp_flg4", "cst_grp_cd4"))
					.predicate(DS0D, p -> p.cutoff$and(S0_CST.bp_grp_cd4.like(bind("cst_grp_cd4")))),
				when(boundOr("cst_grp_flg4"))
					.select(DS0D, S0_CST_GRP4.bp_grp_nm.as("cst_grp_nm4"))
					.groupBy(DS0D, S0_CST_GRP4.bp_grp_nm),
				when(boundOr("cst_grp_flg4", "cst_grp_nm4"))
					.view(DS0D, v -> v.leftOuterJoin(S0_CST_GRP4).on(S0_CST.bp_grp_cd4.eq(S0_CST_GRP4.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP4.value()).eq(S0_CST_GRP4.bp_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_CST_GRP4.bp_grp_nm.like(bind("cst_grp_nm4")))),
				when(boundOr("cst_grp_flg5"))
					.select(DS0D, S0_CST.bp_grp_cd5.as("cst_grp_cd5"))
					.groupBy(DS0D, S0_CST.bp_grp_cd5),
				when(boundOr("cst_grp_flg5", "cst_grp_cd5"))
					.predicate(DS0D, p -> p.cutoff$and(S0_CST.bp_grp_cd5.like(bind("cst_grp_cd5")))),
				when(boundOr("cst_grp_flg5"))
					.select(DS0D, S0_CST_GRP5.bp_grp_nm.as("cst_grp_nm5"))
					.groupBy(DS0D, S0_CST_GRP5.bp_grp_nm),
				when(boundOr("cst_grp_flg5", "cst_grp_nm5"))
					.view(DS0D, v -> v.leftOuterJoin(S0_CST_GRP5).on(S0_CST.bp_grp_cd5.eq(S0_CST_GRP5.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP5.value()).eq(S0_CST_GRP5.bp_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_CST_GRP5.bp_grp_nm.like(bind("cst_grp_nm5")))),
				when(boundOr("cst_grp_flg6"))
					.select(DS0D, S0_CST.bp_grp_cd6.as("cst_grp_cd6"))
					.groupBy(DS0D, S0_CST.bp_grp_cd6),
				when(boundOr("cst_grp_flg6", "cst_grp_cd6"))
					.predicate(DS0D, p -> p.cutoff$and(S0_CST.bp_grp_cd6.like(bind("cst_grp_cd6")))),
				when(boundOr("cst_grp_flg6"))
					.select(DS0D, S0_CST_GRP6.bp_grp_nm.as("cst_grp_nm6"))
					.groupBy(DS0D, S0_CST_GRP6.bp_grp_nm),
				when(boundOr("cst_grp_flg6", "cst_grp_nm6"))
					.view(DS0D, v -> v.leftOuterJoin(S0_CST_GRP6).on(S0_CST.bp_grp_cd6.eq(S0_CST_GRP6.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP6.value()).eq(S0_CST_GRP6.bp_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_CST_GRP6.bp_grp_nm.like(bind("cst_grp_nm6")))),
				when(boundOr("cst_grp_flg7"))
					.select(DS0D, S0_CST.bp_grp_cd7.as("cst_grp_cd7"))
					.groupBy(DS0D, S0_CST.bp_grp_cd7),
				when(boundOr("cst_grp_flg7", "cst_grp_cd7"))
					.predicate(DS0D, p -> p.cutoff$and(S0_CST.bp_grp_cd7.like(bind("cst_grp_cd7")))),
				when(boundOr("cst_grp_flg7"))
					.select(DS0D, S0_CST_GRP7.bp_grp_nm.as("cst_grp_nm7"))
					.groupBy(DS0D, S0_CST_GRP7.bp_grp_nm),
				when(boundOr("cst_grp_flg7", "cst_grp_nm7"))
					.view(DS0D, v -> v.leftOuterJoin(S0_CST_GRP7).on(S0_CST.bp_grp_cd7.eq(S0_CST_GRP7.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP7.value()).eq(S0_CST_GRP7.bp_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_CST_GRP7.bp_grp_nm.like(bind("cst_grp_nm7")))),
				when(boundOr("cst_grp_flg8"))
					.select(DS0D, S0_CST.bp_grp_cd8.as("cst_grp_cd8"))
					.groupBy(DS0D, S0_CST.bp_grp_cd8),
				when(boundOr("cst_grp_flg8", "cst_grp_cd8"))
					.predicate(DS0D, p -> p.cutoff$and(S0_CST.bp_grp_cd8.like(bind("cst_grp_cd8")))),
				when(boundOr("cst_grp_flg8"))
					.select(DS0D, S0_CST_GRP8.bp_grp_nm.as("cst_grp_nm8"))
					.groupBy(DS0D, S0_CST_GRP8.bp_grp_nm),
				when(boundOr("cst_grp_flg8", "cst_grp_nm8"))
					.view(DS0D, v -> v.leftOuterJoin(S0_CST_GRP8).on(S0_CST.bp_grp_cd8.eq(S0_CST_GRP8.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP8.value()).eq(S0_CST_GRP8.bp_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_CST_GRP8.bp_grp_nm.like(bind("cst_grp_nm8")))),
				when(boundOr("cst_grp_flg9"))
					.select(DS0D, S0_CST.bp_grp_cd9.as("cst_grp_cd9"))
					.groupBy(DS0D, S0_CST.bp_grp_cd9),
				when(boundOr("cst_grp_flg9", "cst_grp_cd9"))
					.predicate(DS0D, p -> p.cutoff$and(S0_CST.bp_grp_cd9.like(bind("cst_grp_cd9")))),
				when(boundOr("cst_grp_flg9"))
					.select(DS0D, S0_CST_GRP9.bp_grp_nm.as("cst_grp_nm9"))
					.groupBy(DS0D, S0_CST_GRP9.bp_grp_nm),
				when(boundOr("cst_grp_flg9", "cst_grp_nm9"))
					.view(DS0D, v -> v.leftOuterJoin(S0_CST_GRP9).on(S0_CST.bp_grp_cd9.eq(S0_CST_GRP9.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP9.value()).eq(S0_CST_GRP9.bp_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_CST_GRP9.bp_grp_nm.like(bind("cst_grp_nm9")))),
				when(boundOr("cst_grp_flg10"))
					.select(DS0D, S0_CST.bp_grp_cd10.as("cst_grp_cd10"))
					.groupBy(DS0D, S0_CST.bp_grp_cd10),
				when(boundOr("cst_grp_flg10", "cst_grp_cd10"))
					.predicate(DS0D, p -> p.cutoff$and(S0_CST.bp_grp_cd10.like(bind("cst_grp_cd10")))),
				when(boundOr("cst_grp_flg10"))
					.select(DS0D, S0_CST_GRP10.bp_grp_nm.as("cst_grp_nm10"))
					.groupBy(DS0D, S0_CST_GRP10.bp_grp_nm),
				when(boundOr("cst_grp_flg10", "cst_grp_nm10"))
					.view(DS0D, v -> v.leftOuterJoin(S0_CST_GRP10).on(S0_CST.bp_grp_cd10.eq(S0_CST_GRP10.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP10.value()).eq(S0_CST_GRP10.bp_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_CST_GRP10.bp_grp_nm.like(bind("cst_grp_nm10")))),
				when(boundOr("prsppl_nm", "prsppl_grp_flg1", "prsppl_grp_flg2", "prsppl_grp_flg3", "prsppl_grp_flg4", "prsppl_grp_flg5", "prsppl_grp_flg6", "prsppl_grp_flg7", "prsppl_grp_flg8", "prsppl_grp_flg9", "prsppl_grp_flg10"))
					.view(DS0D, v -> v.leftOuterJoin(S0_PRSPPL).on(S0_PRSPPL.bp_cd.eq(S0_ARR_LOC.sppl_cd)))
					.predicate(DS0D, p -> p.cutoff$and(S0_PRSPPL.bp_nm.like(bind("prsppl_nm")))),
				when(boundOr("prsppl_grp_flg1"))
					.select(DS0D, S0_PRSPPL.bp_grp_cd1.as("prsppl_grp_cd1"))
					.groupBy(DS0D, S0_PRSPPL.bp_grp_cd1),
				when(boundOr("prsppl_grp_flg1", "prsppl_grp_cd1"))
					.predicate(DS0D, p -> p.cutoff$and(S0_PRSPPL.bp_grp_cd1.like(bind("prsppl_grp_cd1")))),
				when(boundOr("prsppl_grp_flg1"))
					.select(DS0D, S0_PRSPPL_GRP1.bp_grp_nm.as("prsppl_grp_nm1"))
					.groupBy(DS0D, S0_PRSPPL_GRP1.bp_grp_nm),
				when(boundOr("prsppl_grp_flg1", "prsppl_grp_nm1"))
					.view(DS0D, v -> v.leftOuterJoin(S0_PRSPPL_GRP1).on(S0_PRSPPL.bp_grp_cd1.eq(S0_PRSPPL_GRP1.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP1.value()).eq(S0_PRSPPL_GRP1.bp_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_PRSPPL_GRP1.bp_grp_nm.like(bind("prsppl_grp_nm1")))),
				when(boundOr("prsppl_grp_flg2"))
					.select(DS0D, S0_PRSPPL.bp_grp_cd2.as("prsppl_grp_cd2"))
					.groupBy(DS0D, S0_PRSPPL.bp_grp_cd2),
				when(boundOr("prsppl_grp_flg2", "prsppl_grp_cd2"))
					.predicate(DS0D, p -> p.cutoff$and(S0_PRSPPL.bp_grp_cd2.like(bind("prsppl_grp_cd2")))),
				when(boundOr("prsppl_grp_flg2"))
					.select(DS0D, S0_PRSPPL_GRP2.bp_grp_nm.as("prsppl_grp_nm2"))
					.groupBy(DS0D, S0_PRSPPL_GRP2.bp_grp_nm),
				when(boundOr("prsppl_grp_flg2", "prsppl_grp_nm2"))
					.view(DS0D, v -> v.leftOuterJoin(S0_PRSPPL_GRP2).on(S0_PRSPPL.bp_grp_cd2.eq(S0_PRSPPL_GRP2.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP2.value()).eq(S0_PRSPPL_GRP2.bp_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_PRSPPL_GRP2.bp_grp_nm.like(bind("prsppl_grp_nm2")))),
				when(boundOr("prsppl_grp_flg3"))
					.select(DS0D, S0_PRSPPL.bp_grp_cd3.as("prsppl_grp_cd3"))
					.groupBy(DS0D, S0_PRSPPL.bp_grp_cd3),
				when(boundOr("prsppl_grp_flg3", "prsppl_grp_cd3"))
					.predicate(DS0D, p -> p.cutoff$and(S0_PRSPPL.bp_grp_cd3.like(bind("prsppl_grp_cd3")))),
				when(boundOr("prsppl_grp_flg3"))
					.select(DS0D, S0_PRSPPL_GRP3.bp_grp_nm.as("prsppl_grp_nm3"))
					.groupBy(DS0D, S0_PRSPPL_GRP3.bp_grp_nm),
				when(boundOr("prsppl_grp_flg3", "prsppl_grp_nm3"))
					.view(DS0D, v -> v.leftOuterJoin(S0_PRSPPL_GRP3).on(S0_PRSPPL.bp_grp_cd3.eq(S0_PRSPPL_GRP3.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP3.value()).eq(S0_PRSPPL_GRP3.bp_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_PRSPPL_GRP3.bp_grp_nm.like(bind("prsppl_grp_nm3")))),
				when(boundOr("prsppl_grp_flg4"))
					.select(DS0D, S0_PRSPPL.bp_grp_cd4.as("prsppl_grp_cd4"))
					.groupBy(DS0D, S0_PRSPPL.bp_grp_cd4),
				when(boundOr("prsppl_grp_flg4", "prsppl_grp_cd4"))
					.predicate(DS0D, p -> p.cutoff$and(S0_PRSPPL.bp_grp_cd4.like(bind("prsppl_grp_cd4")))),
				when(boundOr("prsppl_grp_flg4"))
					.select(DS0D, S0_PRSPPL_GRP4.bp_grp_nm.as("prsppl_grp_nm4"))
					.groupBy(DS0D, S0_PRSPPL_GRP4.bp_grp_nm),
				when(boundOr("prsppl_grp_flg4", "prsppl_grp_nm4"))
					.view(DS0D, v -> v.leftOuterJoin(S0_PRSPPL_GRP4).on(S0_PRSPPL.bp_grp_cd4.eq(S0_PRSPPL_GRP4.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP4.value()).eq(S0_PRSPPL_GRP4.bp_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_PRSPPL_GRP4.bp_grp_nm.like(bind("prsppl_grp_nm4")))),
				when(boundOr("prsppl_grp_flg5"))
					.select(DS0D, S0_PRSPPL.bp_grp_cd5.as("prsppl_grp_cd5"))
					.groupBy(DS0D, S0_PRSPPL.bp_grp_cd5),
				when(boundOr("prsppl_grp_flg5", "prsppl_grp_cd5"))
					.predicate(DS0D, p -> p.cutoff$and(S0_PRSPPL.bp_grp_cd5.like(bind("prsppl_grp_cd5")))),
				when(boundOr("prsppl_grp_flg5"))
					.select(DS0D, S0_PRSPPL_GRP5.bp_grp_nm.as("prsppl_grp_nm5"))
					.groupBy(DS0D, S0_PRSPPL_GRP5.bp_grp_nm),
				when(boundOr("prsppl_grp_flg5", "prsppl_grp_nm5"))
					.view(DS0D, v -> v.leftOuterJoin(S0_PRSPPL_GRP5).on(S0_PRSPPL.bp_grp_cd5.eq(S0_PRSPPL_GRP5.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP5.value()).eq(S0_PRSPPL_GRP5.bp_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_PRSPPL_GRP5.bp_grp_nm.like(bind("prsppl_grp_nm5")))),
				when(boundOr("prsppl_grp_flg6"))
					.select(DS0D, S0_PRSPPL.bp_grp_cd6.as("prsppl_grp_cd6"))
					.groupBy(DS0D, S0_PRSPPL.bp_grp_cd6),
				when(boundOr("prsppl_grp_flg6", "prsppl_grp_cd6"))
					.predicate(DS0D, p -> p.cutoff$and(S0_PRSPPL.bp_grp_cd6.like(bind("prsppl_grp_cd6")))),
				when(boundOr("prsppl_grp_flg6"))
					.select(DS0D, S0_PRSPPL_GRP6.bp_grp_nm.as("prsppl_grp_nm6"))
					.groupBy(DS0D, S0_PRSPPL_GRP6.bp_grp_nm),
				when(boundOr("prsppl_grp_flg6", "prsppl_grp_nm6"))
					.view(DS0D, v -> v.leftOuterJoin(S0_PRSPPL_GRP6).on(S0_PRSPPL.bp_grp_cd6.eq(S0_PRSPPL_GRP6.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP6.value()).eq(S0_PRSPPL_GRP6.bp_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_PRSPPL_GRP6.bp_grp_nm.like(bind("prsppl_grp_nm6")))),
				when(boundOr("prsppl_grp_flg7"))
					.select(DS0D, S0_PRSPPL.bp_grp_cd7.as("prsppl_grp_cd7"))
					.groupBy(DS0D, S0_PRSPPL.bp_grp_cd7),
				when(boundOr("prsppl_grp_flg7", "prsppl_grp_cd7"))
					.predicate(DS0D, p -> p.cutoff$and(S0_PRSPPL.bp_grp_cd7.like(bind("prsppl_grp_cd7")))),
				when(boundOr("prsppl_grp_flg7"))
					.select(DS0D, S0_PRSPPL_GRP7.bp_grp_nm.as("prsppl_grp_nm7"))
					.groupBy(DS0D, S0_PRSPPL_GRP7.bp_grp_nm),
				when(boundOr("prsppl_grp_flg7", "prsppl_grp_nm7"))
					.view(DS0D, v -> v.leftOuterJoin(S0_PRSPPL_GRP7).on(S0_PRSPPL.bp_grp_cd7.eq(S0_PRSPPL_GRP7.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP7.value()).eq(S0_PRSPPL_GRP7.bp_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_PRSPPL_GRP7.bp_grp_nm.like(bind("prsppl_grp_nm7")))),
				when(boundOr("prsppl_grp_flg8"))
					.select(DS0D, S0_PRSPPL.bp_grp_cd8.as("prsppl_grp_cd8"))
					.groupBy(DS0D, S0_PRSPPL.bp_grp_cd8),
				when(boundOr("prsppl_grp_flg8", "prsppl_grp_cd8"))
					.predicate(DS0D, p -> p.cutoff$and(S0_PRSPPL.bp_grp_cd8.like(bind("prsppl_grp_cd8")))),
				when(boundOr("prsppl_grp_flg8"))
					.select(DS0D, S0_PRSPPL_GRP8.bp_grp_nm.as("prsppl_grp_nm8"))
					.groupBy(DS0D, S0_PRSPPL_GRP8.bp_grp_nm),
				when(boundOr("prsppl_grp_flg8", "prsppl_grp_nm8"))
					.view(DS0D, v -> v.leftOuterJoin(S0_PRSPPL_GRP8).on(S0_PRSPPL.bp_grp_cd8.eq(S0_PRSPPL_GRP8.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP8.value()).eq(S0_PRSPPL_GRP8.bp_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_PRSPPL_GRP8.bp_grp_nm.like(bind("prsppl_grp_nm8")))),
				when(boundOr("prsppl_grp_flg9"))
					.select(DS0D, S0_PRSPPL.bp_grp_cd9.as("prsppl_grp_cd9"))
					.groupBy(DS0D, S0_PRSPPL.bp_grp_cd9),
				when(boundOr("prsppl_grp_flg9", "prsppl_grp_cd9"))
					.predicate(DS0D, p -> p.cutoff$and(S0_PRSPPL.bp_grp_cd9.like(bind("prsppl_grp_cd9")))),
				when(boundOr("prsppl_grp_flg9"))
					.select(DS0D, S0_PRSPPL_GRP9.bp_grp_nm.as("prsppl_grp_nm9"))
					.groupBy(DS0D, S0_PRSPPL_GRP9.bp_grp_nm),
				when(boundOr("prsppl_grp_flg9", "prsppl_grp_nm9"))
					.view(DS0D, v -> v.leftOuterJoin(S0_PRSPPL_GRP9).on(S0_PRSPPL.bp_grp_cd9.eq(S0_PRSPPL_GRP9.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP9.value()).eq(S0_PRSPPL_GRP9.bp_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_PRSPPL_GRP9.bp_grp_nm.like(bind("prsppl_grp_nm9")))),
				when(boundOr("prsppl_grp_flg10"))
					.select(DS0D, S0_PRSPPL.bp_grp_cd10.as("prsppl_grp_cd10"))
					.groupBy(DS0D, S0_PRSPPL.bp_grp_cd10),
				when(boundOr("prsppl_grp_flg10", "prsppl_grp_cd10"))
					.predicate(DS0D, p -> p.cutoff$and(S0_PRSPPL.bp_grp_cd10.like(bind("prsppl_grp_cd10")))),
				when(boundOr("prsppl_grp_flg10"))
					.select(DS0D, S0_PRSPPL_GRP10.bp_grp_nm.as("prsppl_grp_nm10"))
					.groupBy(DS0D, S0_PRSPPL_GRP10.bp_grp_nm),
				when(boundOr("prsppl_grp_flg10", "prsppl_grp_nm10"))
					.view(DS0D, v -> v.leftOuterJoin(S0_PRSPPL_GRP10).on(S0_PRSPPL.bp_grp_cd10.eq(S0_PRSPPL_GRP10.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP10.value()).eq(S0_PRSPPL_GRP10.bp_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_PRSPPL_GRP10.bp_grp_nm.like(bind("prsppl_grp_nm10")))),
				when(boundOr("itm_nm", "itm_typ", "itm_typ_d_cd", "itm_typ_d_nm", "itm_grp_flg1", "itm_grp_flg2", "itm_grp_flg3", "itm_grp_flg4", "itm_grp_flg5", "itm_grp_flg6", "itm_grp_flg7", "itm_grp_flg8", "itm_grp_flg9", "itm_grp_flg10"))
					.view(DS0D, v -> v.leftOuterJoin(S0_ITM).on(S0_ITM.itm_cd.eq(S0_V1.pr(S1_T1.itm_cd)).and(S0_ITM.itm_sub1.eq(S0_V1.pr(S1_T1.itm_sub1))).and(S0_ITM.itm_sub2.eq(S0_V1.pr(S1_T1.itm_sub2))).and(S0_ITM.itm_sub3.eq(S0_V1.pr(S1_T1.itm_sub3)))).leftOuterJoin(S0_SUNDRY_ITM).on(S0_SUNDRY_ITM.itm_cd.eq(S0_V1.pr(S1_T1.itm_cd)).and(S0_SUNDRY_ITM.itm_sub1.eq(S0_V1.pr(S1_T1.itm_sub1))).and(S0_SUNDRY_ITM.itm_sub2.eq(S0_V1.pr(S1_T1.itm_sub2))).and(S0_SUNDRY_ITM.itm_sub3.eq(S0_V1.pr(S1_T1.itm_sub3))).and(S0_SUNDRY_ITM.sno1.eq(S0_V1.pr(S1_T1.sno1))).and(S0_SUNDRY_ITM.sno2.eq(S0_V1.pr(S1_T1.sno2))).and(S0_SUNDRY_ITM.sno3.eq(S0_V1.pr(S1_T1.sno3))).and(S0_SUNDRY_ITM.sno4.eq(S0_V1.pr(S1_T1.sno4)))))
					.predicate(DS0D, p -> p.cutoff$and(decode(S0_V1.pr(S1_T1.sundry_itm_flg),value(true),nvl(S0_V1.pr(S1_T1.itm_nm),S0_SUNDRY_ITM.itm_nm),S0_ITM.itm_nm).like(bind("itm_nm")))),
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
				when(boundOr("trd_nm"))
					.view(DS0D, v -> v.leftOuterJoin(S0_TRD).on(S0_TRD.trd_cd.eq(S0_V1.pr(S1_T1.trd_cd))))
					.predicate(DS0D, p -> p.cutoff$and(S0_TRD.trd_nm.like(bind("trd_nm")))),
				when(boundOr("rcpt_iv_itm_nm"))
					.view(DS0D, v -> v.leftOuterJoin(S0_RCPT_ITM).on(S0_RCPT_ITM.itm_cd.eq(S0_V1.pr(S1_T1.itm_cd)).and(S0_RCPT_ITM.itm_sub1.eq(S0_V1.pr(S1_T1.itm_sub1))).and(S0_RCPT_ITM.itm_sub2.eq(S0_V1.pr(S1_T1.itm_sub2))).and(S0_RCPT_ITM.itm_sub3.eq(S0_V1.pr(S1_T1.itm_sub3))).and(S0_RCPT_ITM.lcl_cd.eq(S0_SPPL.prnt_lcl_cd)).cutoff$and(S0_RCPT_ITM.itm_nm.like(bind("rcpt_iv_itm_nm")))))
					.predicate(DS0D, p -> p.cutoff$and(decode(S0_V1.pr(S1_T1.sundry_itm_flg),value(true),S0_V1.pr(S1_T1.rcpt_iv_itm_nm),S0_RCPT_ITM.itm_nm).like(bind("rcpt_iv_itm_nm")))),
				when(boundOr("itm_typ"))
					.predicate(DS0D, p -> p.cutoff$and(S0_ITM.itm_typ.like(bind("itm_typ")))),
				when(boundOr("itm_typ_d_cd"))
					.predicate(DS0D, p -> p.cutoff$and(S0_ITM.itm_typ_d_cd.like(bind("itm_typ_d_cd")))),
				when(boundOr("itm_typ_d_nm"))
					.view(DS0D, v -> v.leftOuterJoin(S0_ITM_TYP_D).on(S0_ITM_TYP_D.itm_typ.eq(S0_ITM.itm_typ).and(S0_ITM_TYP_D.itm_typ_d_cd.eq(S0_ITM.itm_typ_d_cd))))
					.predicate(DS0D, p -> p.cutoff$and(S0_ITM_TYP_D.itm_typ_d_nm.like(bind("itm_typ_d_nm")))),
				when(boundOr("rqst_dpt_nm"))
					.view(DS0D, v -> v.leftOuterJoin(S0_DPT).on(S0_DPT.dpt_cd.eq(S0_V1.pr("rqst_dpt_cd")).and(bind("today").between(S0_DPT.st_dt, S0_DPT.end_dt))))
					.predicate(DS0D, p -> p.cutoff$and(S0_DPT.dpt_nm.like(bind("rqst_dpt_nm")))),
				when(boundOr("rqst_usr_nm"))
					.view(DS0D, v -> v.leftOuterJoin(S0_RQST_USR).on(S0_RQST_USR.usr_cd.eq(S0_V1.pr("rqst_usr_cd"))))
					.predicate(DS0D, p -> p.cutoff$and(S0_RQST_USR.usr_nm.like(bind("rqst_usr_nm")))),
				when(boundOr("arr_wg_nm"))
					.view(DS0D, v -> v.leftOuterJoin(S0_ARR_WG).on(S0_ARR_WG.wg_cd.eq(S0_ARR_LOC.wg_cd)))
					.predicate(DS0D, p -> p.cutoff$and(S0_ARR_WG.wg_nm.like(bind("arr_wg_nm")))),
				when(boundOr("arr_lg_grp_nm"))
					.view(DS0D, v -> v.leftOuterJoin(S0_ARR_LG_GRP).on(S0_ARR_LG_GRP.lg_grp_cd.eq(S0_ARR_LOC.lg_grp_cd)))
					.predicate(DS0D, p -> p.cutoff$and(S0_ARR_LG_GRP.lg_grp_nm.like(bind("arr_lg_grp_nm")))),
				when(boundOr("arr_site_nm"))
					.view(DS0D, v -> v.leftOuterJoin(S0_ARR_SITE).on(S0_ARR_SITE.site_cd.eq(S0_ARR_LOC.site_cd)))
					.predicate(DS0D, p -> p.cutoff$and(S0_ARR_SITE.site_nm.like(bind("arr_site_nm")))),
				when(boundOr("arr_alloc_grp_nm"))
					.view(DS0D, v -> v.leftOuterJoin(S0_ARR_ALLRC_GRP).on(S0_ARR_ALLRC_GRP.alloc_grp_cd.eq(S0_ARR_LOC.alloc_grp_cd)))
					.predicate(DS0D, p -> p.cutoff$and(S0_ARR_ALLRC_GRP.alloc_grp_nm.like(bind("arr_alloc_grp_nm")))),
				when(boundOr("arr_str_ln_nm"))
					.view(DS0D, v -> v.leftOuterJoin(S0_ARR_STR_LN).on(S0_ARR_STR_LN.loc_cd.eq(S0_V1.pr(S1_T1.arr_loc_cd)).and(S0_ARR_STR_LN.str_ln_cd.eq(S0_V1.pr("arr_str_ln_cd")))))
					.predicate(DS0D, p -> p.cutoff$and(S0_ARR_STR_LN.str_ln_nm.like(bind("arr_str_ln_nm")))),
				when(boundOr("wrk_no", "wrk_nm"))
					.view(DS0D, v -> v.leftOuterJoin(S0_WRK_SNO).on(S0_WRK_SNO.sno1.eq(S0_V1.pr(S1_T1.sno1))))
					.predicate(DS0D, p -> p.cutoff$and(S0_WRK_SNO.wrk_no.like(bind("wrk_no"))).cutoff$and(S0_WRK_SNO.wrk_nm.like(bind("wrk_nm")))),
				when(boundOr("maker_nm"))
					.view(DS0D, v -> v.leftOuterJoin(S0_MAKER).on(S0_MAKER.bp_cd.eq(S0_V1.pr(S1_T1.maker_cd))))
					.predicate(DS0D, p -> p.cutoff$and(S0_MAKER.bp_nm.like(bind("maker_nm")))),
				when(boundOr("arr_dpt_nm"))
					.view(DS0D, v -> v.leftOuterJoin(S0_ARR_DPT).on(S0_ARR_DPT.dpt_cd.eq(S0_V1.pr(S1_T1.arr_dpt_cd)).and(bind("today").between(S0_ARR_DPT.st_dt, S0_ARR_DPT.end_dt))))
					.predicate(DS0D, p -> p.cutoff$and(S0_ARR_DPT.dpt_nm.like(bind("arr_dpt_nm")))),
				when(boundOr("arr_usr_nm"))
					.view(DS0D, v -> v.leftOuterJoin(S0_ARR_USR).on(S0_ARR_USR.usr_cd.eq(S0_V1.pr(S1_T1.arr_usr_cd))))
					.predicate(DS0D, p -> p.cutoff$and(S0_ARR_USR.usr_nm.like(bind("arr_usr_nm")))),
				when(boundOr("po_no", "purc_rqst_wg_cd", "purc_rqst_wg_nm", "po_schd_src_typ", "po_schd_src_no"))
					.view(DS0D, v -> v.leftOuterJoin(S0_PO_D).on(S0_PO_D.po_d_no.eq(S0_V1.pr(S1_T3.po_d_no))))
					.predicate(DS0D, p -> p.cutoff$and(S0_PO_D.po_no.like(bind("po_no")))),
				when(boundOr("purc_rqst_wg_cd", "purc_rqst_wg_nm", "po_schd_src_typ", "po_schd_src_no"))
					.view(DS0D, v -> v.leftOuterJoin(S0_PO_SCHD).on(S0_PO_SCHD.po_schd_no.eq(S0_PO_D.po_schd_no)))
					.predicate(DS0D, p -> p.cutoff$and(S0_PO_SCHD.rqst_wg_cd.eq(bind("purc_rqst_wg_cd"))).cutoff$and(S0_PO_SCHD.po_schd_src_typ.like(bind("po_schd_src_typ"))).cutoff$and(S0_PO_SCHD.po_schd_src_no.like(bind("po_schd_src_no"))).cutoff$and(S0_PO_SCHD.po_schd_no.like(bind("po_schd_no")))),
				when(boundOr("purc_rqst_wg_nm"))
					.view(DS0D, v -> v.leftOuterJoin(S0_PURC_RQST_WG).on(S0_PURC_RQST_WG.wg_cd.eq(S0_PO_SCHD.rqst_wg_cd)))
					.predicate(DS0D, p -> p.cutoff$and(S0_PURC_RQST_WG.wg_nm.like(bind("purc_rqst_wg_nm")))),
				when(boundOr("dlv_inst_no", "dlv_inst_print_d_rmrks"))
					.view(DS0D, v -> v.leftOuterJoin(S0_DLV_INST_D).on(S0_DLV_INST_D.dlv_inst_d_no.eq(S0_V1.pr(S1_T2.dlv_inst_d_no))))
					.predicate(DS0D, p -> p.cutoff$and(S0_DLV_INST_D.dlv_inst_no.like(bind("dlv_inst_no"))).cutoff$and(S0_DLV_INST_D.dlv_inst_print_d_rmrks.like(bind("dlv_inst_print_d_rmrks")))),
				when(boundOr("prms_rcpt_no", "prms_rmrks"))
					.view(DS0D, v -> v.leftOuterJoin(S0_PRMS_RCPT_D).on(S0_PRMS_RCPT_D.prms_rcpt_d_no.eq(S0_V1.pr(S1_T2.prms_rcpt_d_no))))
					.predicate(DS0D, p -> p.cutoff$and(S0_PRMS_RCPT_D.prms_rcpt_no.like(bind("prms_rcpt_no"))).cutoff$and(S0_PRMS_RCPT_D.prms_rmrks.like(bind("prms_rmrks")))),
				when(boundOr("ship_act_no", "ship_lg_grp_cd", "ship_lg_grp_nm", "ship_wg_cd", "ship_wg_nm"))
					.view(DS0D, v -> v.leftOuterJoin(S0_DLV_SLIP).on(S0_DLV_SLIP.dlv_slip_no.eq(S0_V1.pr(S1_T2.dlv_slip_no)).and(S0_DLV_SLIP.slip_sts_typ.eq(value(MAC_SLIP_STS_TYP.CRT.value()))).and(S0_V1.pr(S1_T2.dlv_slip_mng_no).isNull())))
					.predicate(DS0D, p -> p.cutoff$and(S0_DLV_SLIP.dlv_slip_act_no.like(bind("ship_act_no")))),
				when(boundOr("ship_lg_grp_cd"))
					.predicate(DS0D, p -> p.cutoff$and(S0_DLV_SLIP.ship_fr_lg_grp_cd.like(bind("ship_lg_grp_cd")))),
				when(boundOr("ship_lg_grp_nm"))
					.view(DS0D, v -> v.leftOuterJoin(S0_SHIP_LG_GRP).on(S0_SHIP_LG_GRP.lg_grp_cd.eq(S0_DLV_SLIP.ship_fr_lg_grp_cd)))
					.predicate(DS0D, p -> p.cutoff$and(S0_SHIP_LG_GRP.lg_grp_nm.like(bind("ship_lg_grp_nm")))),
				when(boundOr("ship_wg_cd"))
					.predicate(DS0D, p -> p.cutoff$and(S0_DLV_SLIP.wg_cd.like(bind("ship_wg_cd")))),
				when(boundOr("ship_wg_nm"))
					.view(DS0D, v -> v.leftOuterJoin(S0_SHIP_WG).on(S0_SHIP_WG.wg_cd.eq(S0_DLV_SLIP.wg_cd)))
					.predicate(DS0D, p -> p.cutoff$and(S0_SHIP_WG.wg_nm.like(bind("ship_wg_nm")))),
				when(boundOr("sls_ret_schd_no"))
					.predicate(DS0D, p -> p.cutoff$and(S0_SRET_SCHD_D.sls_ret_schd_no.like(bind("sls_ret_schd_no")))),
				when(boundOr("cst_po_no"))
					.view(DS0D, v -> v.leftOuterJoin(S0_SRET_SCHD).on(S0_SRET_SCHD.sls_ret_schd_no.eq(S0_SRET_SCHD_D.sls_ret_schd_no)))
					.predicate(DS0D, p -> p.cutoff$and(S0_SRET_SCHD.cst_po_no.like(bind("cst_po_no")))),
				when(boundOr("cst_itm_cd"))
					.predicate(DS0D, p -> p.cutoff$and(S0_SRET_SCHD_D.cst_itm_cd.like(bind("cst_itm_cd")))),
				when(boundOr("cst_itm_nm"))
					.predicate(DS0D, p -> p.cutoff$and(S0_SRET_SCHD_D.cst_itm_nm.like(bind("cst_itm_nm"))))
			);
	}
	
	/**
	 * -- MSBEL5930_MST_ARR_SCHD_Query_S02
	 */
	static MCQueryPlan MSBEL5930_MST_ARR_SCHD_S02() {
		MCTempView S0_V1 = createTempView("V1");
		MAM_LOC_R S0_ARR_LOC = MAM_LOC_R.create("ARR_LOC");
		MAM_TRD_R S0_TRD = MAM_TRD_R.create("TRD");
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
		MAM_SUNDRY_ITM_R S0_SUNDRY_ITM = MAM_SUNDRY_ITM_R.create("SUNDRY_ITM");
		MAM_ITM_LCL_R S0_RCPT_ITM = MAM_ITM_LCL_R.create("RCPT_ITM");
		MAM_ITM_TYP_D_R S0_ITM_TYP_D = MAM_ITM_TYP_D_R.create("ITM_TYP_D");
		MAM_DPT_R S0_DPT = MAM_DPT_R.create("DPT");
		MAM_USR_R S0_RQST_USR = MAM_USR_R.create("RQST_USR");
		MAM_BP_R S0_CST = MAM_BP_R.create("CST");
		MAM_BP_GRP_R S0_CST_GRP1 = MAM_BP_GRP_R.create("CST_GRP1");
		MAM_BP_GRP_R S0_CST_GRP2 = MAM_BP_GRP_R.create("CST_GRP2");
		MAM_BP_GRP_R S0_CST_GRP3 = MAM_BP_GRP_R.create("CST_GRP3");
		MAM_BP_GRP_R S0_CST_GRP4 = MAM_BP_GRP_R.create("CST_GRP4");
		MAM_BP_GRP_R S0_CST_GRP5 = MAM_BP_GRP_R.create("CST_GRP5");
		MAM_BP_GRP_R S0_CST_GRP6 = MAM_BP_GRP_R.create("CST_GRP6");
		MAM_BP_GRP_R S0_CST_GRP7 = MAM_BP_GRP_R.create("CST_GRP7");
		MAM_BP_GRP_R S0_CST_GRP8 = MAM_BP_GRP_R.create("CST_GRP8");
		MAM_BP_GRP_R S0_CST_GRP9 = MAM_BP_GRP_R.create("CST_GRP9");
		MAM_BP_GRP_R S0_CST_GRP10 = MAM_BP_GRP_R.create("CST_GRP10");
		MST_SLS_RET_SCHD_D_R S0_SRET_SCHD_D = MST_SLS_RET_SCHD_D_R.create("SRET_SCHD_D");
		MAM_BP_R S0_SRET_FR = MAM_BP_R.create("SRET_FR");
		MAM_BP_GRP_R S0_SRET_FR_GRP1 = MAM_BP_GRP_R.create("SRET_FR_GRP1");
		MAM_BP_GRP_R S0_SRET_FR_GRP2 = MAM_BP_GRP_R.create("SRET_FR_GRP2");
		MAM_BP_GRP_R S0_SRET_FR_GRP3 = MAM_BP_GRP_R.create("SRET_FR_GRP3");
		MAM_BP_GRP_R S0_SRET_FR_GRP4 = MAM_BP_GRP_R.create("SRET_FR_GRP4");
		MAM_BP_GRP_R S0_SRET_FR_GRP5 = MAM_BP_GRP_R.create("SRET_FR_GRP5");
		MAM_BP_GRP_R S0_SRET_FR_GRP6 = MAM_BP_GRP_R.create("SRET_FR_GRP6");
		MAM_BP_GRP_R S0_SRET_FR_GRP7 = MAM_BP_GRP_R.create("SRET_FR_GRP7");
		MAM_BP_GRP_R S0_SRET_FR_GRP8 = MAM_BP_GRP_R.create("SRET_FR_GRP8");
		MAM_BP_GRP_R S0_SRET_FR_GRP9 = MAM_BP_GRP_R.create("SRET_FR_GRP9");
		MAM_BP_GRP_R S0_SRET_FR_GRP10 = MAM_BP_GRP_R.create("SRET_FR_GRP10");
		MAM_BP_R S0_SPPL = MAM_BP_R.create("SPPL");
		MAM_BP_GRP_R S0_PO_GRP1 = MAM_BP_GRP_R.create("PO_GRP1");
		MAM_BP_GRP_R S0_PO_GRP2 = MAM_BP_GRP_R.create("PO_GRP2");
		MAM_BP_GRP_R S0_PO_GRP3 = MAM_BP_GRP_R.create("PO_GRP3");
		MAM_BP_GRP_R S0_PO_GRP4 = MAM_BP_GRP_R.create("PO_GRP4");
		MAM_BP_GRP_R S0_PO_GRP5 = MAM_BP_GRP_R.create("PO_GRP5");
		MAM_BP_GRP_R S0_PO_GRP6 = MAM_BP_GRP_R.create("PO_GRP6");
		MAM_BP_GRP_R S0_PO_GRP7 = MAM_BP_GRP_R.create("PO_GRP7");
		MAM_BP_GRP_R S0_PO_GRP8 = MAM_BP_GRP_R.create("PO_GRP8");
		MAM_BP_GRP_R S0_PO_GRP9 = MAM_BP_GRP_R.create("PO_GRP9");
		MAM_BP_GRP_R S0_PO_GRP10 = MAM_BP_GRP_R.create("PO_GRP10");
		MAM_WG_R S0_ARR_WG = MAM_WG_R.create("ARR_WG");
		MAM_LG_GRP_R S0_ARR_LG_GRP = MAM_LG_GRP_R.create("ARR_LG_GRP");
		MAM_SITE_R S0_ARR_SITE = MAM_SITE_R.create("ARR_SITE");
		MAM_ALLOC_GRP_R S0_ARR_ALLRC_GRP = MAM_ALLOC_GRP_R.create("ARR_ALLRC_GRP");
		MAM_STR_LN_R S0_ARR_STR_LN = MAM_STR_LN_R.create("ARR_STR_LN");
		MSVT_WRK_SNO_R S0_WRK_SNO = MSVT_WRK_SNO_R.create("WRK_SNO");
		MAVM_BP_NM_R S0_MAKER = MAVM_BP_NM_R.create("MAKER");
		MAM_DPT_R S0_ARR_DPT = MAM_DPT_R.create("ARR_DPT");
		MAM_USR_R S0_ARR_USR = MAM_USR_R.create("ARR_USR");
		MST_PO_SCHD_R S0_PO_SCHD = MST_PO_SCHD_R.create("PO_SCHD");
		MAM_WG_R S0_PURC_RQST_WG = MAM_WG_R.create("PURC_RQST_WG");
		MST_DLV_INST_D_R S0_DLV_INST_D = MST_DLV_INST_D_R.create("DLV_INST_D");
		MST_PRMS_RCPT_D_R S0_PRMS_RCPT_D = MST_PRMS_RCPT_D_R.create("PRMS_RCPT_D");
		MST_DLV_SLIP_R S0_DLV_SLIP = MST_DLV_SLIP_R.create("DLV_SLIP");
		MAM_LG_GRP_R S0_SHIP_LG_GRP = MAM_LG_GRP_R.create("SHIP_LG_GRP");
		MAM_WG_R S0_SHIP_WG = MAM_WG_R.create("SHIP_WG");
		MST_SLS_RET_SCHD_R S0_SRET_SCHD = MST_SLS_RET_SCHD_R.create("SRET_SCHD");
		MAM_BP_R S0_PRSPPL = MAM_BP_R.create("PRSPPL");
		MAM_BP_GRP_R S0_PRSPPL_GRP1 = MAM_BP_GRP_R.create("PRSPPL_GRP1");
		MAM_BP_GRP_R S0_PRSPPL_GRP2 = MAM_BP_GRP_R.create("PRSPPL_GRP2");
		MAM_BP_GRP_R S0_PRSPPL_GRP3 = MAM_BP_GRP_R.create("PRSPPL_GRP3");
		MAM_BP_GRP_R S0_PRSPPL_GRP4 = MAM_BP_GRP_R.create("PRSPPL_GRP4");
		MAM_BP_GRP_R S0_PRSPPL_GRP5 = MAM_BP_GRP_R.create("PRSPPL_GRP5");
		MAM_BP_GRP_R S0_PRSPPL_GRP6 = MAM_BP_GRP_R.create("PRSPPL_GRP6");
		MAM_BP_GRP_R S0_PRSPPL_GRP7 = MAM_BP_GRP_R.create("PRSPPL_GRP7");
		MAM_BP_GRP_R S0_PRSPPL_GRP8 = MAM_BP_GRP_R.create("PRSPPL_GRP8");
		MAM_BP_GRP_R S0_PRSPPL_GRP9 = MAM_BP_GRP_R.create("PRSPPL_GRP9");
		MAM_BP_GRP_R S0_PRSPPL_GRP10 = MAM_BP_GRP_R.create("PRSPPL_GRP10");
		MST_ARR_SCHD_R S1_T1 = MST_ARR_SCHD_R.create("T1");
		MST_ARR_PR_R S1_T2 = MST_ARR_PR_R.create("T2");
		MST_PURC_SCHD_R S1_T3 = MST_PURC_SCHD_R.create("T3");
		MCTempView S1_T4 = createTempView("T4");
		MST_PURC_ACT_IO_R S1_T5 = MST_PURC_ACT_IO_R.create("T5");
		MST_ARR_ACT_R S1_T6 = MST_ARR_ACT_R.create("T6");
		MST_PROV_SCHD_R S1_T7 = MST_PROV_SCHD_R.create("T7");
		MST_PO_D_R S1_T8 = MST_PO_D_R.create("T8");
		MST_PURC_DLV_SLIP_D_R S1_T9 = MST_PURC_DLV_SLIP_D_R.create("T9");
		MST_PURC_DLV_SLIP_R S1_T10 = MST_PURC_DLV_SLIP_R.create("T10");
		MAM_EDI_IF_CTL_R S2_MA = MAM_EDI_IF_CTL_R.create("MA");
		MAM_SCM_IF_CTL_R S3_CTL1 = MAM_SCM_IF_CTL_R.create("CTL1");
		MST_PURC_ACT_R S4_W = MST_PURC_ACT_R.create("W");
		MST_PURC_ACT_D_R S4_W2 = MST_PURC_ACT_D_R.create("W2");
		MST_PURC_SCHD_R S4_W3 = MST_PURC_SCHD_R.create("W3");
		MST_ARR_SCHD_R S4_W4 = MST_ARR_SCHD_R.create("W4");
		MAM_EDI_IF_CTL_R S5 = MAM_EDI_IF_CTL_R.create();
		MAM_EDI_IF_CTL_R S6 = MAM_EDI_IF_CTL_R.create();
		MAM_SCM_IF_CTL_R S7 = MAM_SCM_IF_CTL_R.create();
		MAM_SCM_IF_CTL_R S8 = MAM_SCM_IF_CTL_R.create();
		MAVM_RD_LOC_R S9_W1 = MAVM_RD_LOC_R.create("W1");
		MAVM_RD_LG_GRP_R S10_W2 = MAVM_RD_LG_GRP_R.create("W2");
		MST_RCPT_IV_MAP_R S11_W1 = MST_RCPT_IV_MAP_R.create("W1");
		
		MCDynamicSQLID DS0D = createDynamicSQLID("DS0D");
		
		return createQueryPlan()
			.setQuery(
				sql("MSBEL5930_MST_ARR_SCHD_Query_S02")
					.mainQuery()
					.select(
						S0_V1.prAll(),
						S0_ARR_LOC.loc_nm.as("arr_loc_nm"),
						S0_ARR_LOC.site_cd.as("arr_site_cd"),
						S0_ARR_LOC.alloc_grp_cd.as("arr_alloc_grp_cd"),
						S0_ARR_LOC.sppl_cd.as("loc_sppl_cd"),
						S0_ARR_LOC.str_ln_tgt_flg.as("arr_str_ln_tgt_flg"),
						S0_ARR_LOC.sppl_cd.as("prsppl_cd"),
						addDynamicSelect(DS0D)
					)
					.from(
						subQuery()
						.select(
							S1_T1.pr_sts_typ,
							nullValue().as("pr_sts_typ_nm"),
							S1_T2.trd_cd,
							S1_T2.trd_ptn_typ,
							nullValue().as("trd_ptn_typ_nm"),
							S1_T1.itm_cd,
							S1_T1.itm_sub1,
							S1_T1.itm_sub2,
							S1_T1.itm_sub3,
							S1_T1.itm_nm,
							S1_T1.rcpt_iv_itm_nm,
							S1_T1.sundry_itm_flg,
							S1_T2.rqst_dpt_cd,
							S1_T2.rqst_wg_cd,
							S1_T2.rqst_usr_cd,
							S1_T2.cst_cd,
							S1_T2.sret_fr_cd,
							S1_T2.sppl_cd,
							S1_T2.ret_dlv_slip_d_no,
							S1_T2.ret_stk_arrv_bp_cd,
							S1_T1.ret_loc_cd,
							S1_T1.ret_str_ln_cd,
							S1_T1.ret_gd_cd,
							decode(
								S1_T5.purc_act_io_no,
								nullValue(),
								S1_T1.arr_loc_cd,
								S1_T5.in_to_loc_cd
							).as("arr_loc_cd"),
							S1_T1.arr_loc_cd.as("arr_schd_loc_cd"),
							decode(
								S1_T5.purc_act_io_no,
								nullValue(),
								S1_T1.wg_cd,
								S1_T5.in_to_loc_wg_cd
							).as("arr_wg_cd"),
							S1_T1.lg_grp_cd.as("arr_lg_grp_cd"),
							decode(
								S1_T5.purc_act_io_no,
								nullValue(),
								S1_T1.str_ln_cd,
								S1_T5.str_ln_cd
							).as("arr_str_ln_cd"),
							nullValue().as("arr_str_ln_cd_none_flg"),
							trunc(
								S1_T2.dlv_rqst_tm,
								MCDateFmt.DD
							).as("dlv_rqst_dt"),
							S1_T2.dlv_rqst_tm.as("dlv_rqst_hm"),
							trunc(
								S1_T1.arr_schd_tm,
								MCDateFmt.DD
							).as("arr_schd_dt"),
							S1_T1.arr_schd_tm.as("arr_schd_hm"),
							nullValue().as("arr_dt"),
							nullValue().as("arr_hm"),
							nullValue().as("ac_dt"),
							S1_T1.ver_no,
							S1_T1.lot_no,
							S1_T1.sublot_no,
							decode(
								S1_T5.purc_act_io_no,
								nullValue(),
								S1_T1.bp_lot_no,
								S1_T5.bp_lot_no
							).as("bp_lot_no"),
							decode(
								S1_T5.purc_act_io_no,
								nullValue(),
								nullValue(),
								S1_T5.bp_dlv_slip_no
							).as("bp_dlv_slip_no"),
							decode(
								S1_T5.purc_act_io_no,
								nullValue(),
								nullValue(),
								S1_T5.bp_dlv_slip_d_no
							).as("bp_dlv_slip_d_no"),
							nullValue().as("ship_fr_valid_dt"),
							S1_T4.pr(S4_W2.sno1_mng_typ),
							S1_T4.pr(S4_W2.sno2_mng_typ),
							S1_T4.pr(S4_W2.sno3_mng_typ),
							S1_T4.pr(S4_W2.sno4_mng_typ),
							S1_T1.sno1,
							S1_T1.sno2,
							S1_T1.sno3,
							S1_T1.sno4,
							S1_T1.maker_cd,
							S1_T1.sppl_itm_cd,
							S1_T1.sppl_itm_nm,
							S1_T1.purc_id_typ,
							nullValue().as("purc_id_typ_nm"),
							nullValue().as("cststk_flg"),
							S1_T1.trd_unit_cd,
							S1_T1.trd_unit_qty,
							S1_T1.abort_flg,
							S1_T1.base_unit_cd,
							S1_T1.base_unit_qty,
							S1_T1.trd_unit_cd.as("schd_unit_cd"),
							S1_T1.base_unit_qty.as("arr_schd_qty"),
							S1_T1.arr_qty,
							MAPA_CALC$F_CALC_PER(
								S1_T1.base_unit_qty,
								S1_T1.arr_qty
							).as("pr_rate"),
							nullValue().as("purc_cont_qty"),
							nullValue().as("purc_cont_fctr"),
							nullValue().as("std_cont_qty"),
							S1_T1.sync_flg,
							nullValue().as("split_flg"),
							S1_T1.arr_ptn_typ,
							nullValue().as("arr_ptn_typ_nm"),
							S1_T1.gd_cd,
							nvl(
								S1_T5.quality_typ,
								S1_T1.quality_typ
							).as("quality_typ"),
							nullValue().as("quality_typ_nm"),
							nvl(
								S1_T5.stk_insp_typ,
								S1_T1.stk_insp_typ
							).as("stk_insp_typ"),
							nullValue().as("stk_insp_typ_nm"),
							nvl(
								S1_T5.stk_id_typ,
								S1_T1.stk_id_typ
							).as("stk_id_typ"),
							nullValue().as("stk_id_typ_nm"),
							S1_T1.stk_bp_cd,
							nullValue().as("arr_dpt_cd"),
							nullValue().as("arr_dpt_nm"),
							nullValue().as("arr_usr_cd"),
							nullValue().as("arr_usr_nm"),
							decode(
								S1_T4.pr(S4_W2.purc_act_d_no),
								nullValue(),
								S1_T2.rsn_cd,
								S1_T4.pr(S4_W2.rsn_cd)
							).as("rsn_cd"),
							decode(
								S1_T4.pr(S4_W2.purc_act_d_no),
								nullValue(),
								S1_T2.bd_dpt_cd,
								S1_T4.pr(S4_W2.bd_dpt_cd)
							).as("bd_dpt_cd"),
							decode(
								S1_T4.pr(S4_W2.purc_act_d_no),
								nullValue(),
								S1_T2.bd_wg_cd,
								S1_T4.pr(S4_W2.bd_wg_cd)
							).as("bd_wg_cd"),
							S1_T1.intr_rmrks,
							S1_T1.trd_rmrks,
							S1_T1.trd_d_rmrks,
							S1_T1.arr_cnt_rmrks,
							nullValue().as("arr_act_no"),
							S1_T1.dlv_slip_no,
							S1_T1.dlv_slip_mng_no,
							S1_T10.dlv_slip_seq,
							S1_T10.dlv_slip_rev,
							cases()
								.when(S1_T1.dlv_slip_mng_d_no.isNull())
								.then(S1_T2.dlv_slip_d_no)
								.otherwise(S1_T9.dlv_slip_d_no).as("dlv_slip_d_no"),
							S1_T9.dlv_slip_d_seq,
							S1_T1.arr_schd_no,
							S1_T1.arr_pr_no,
							S1_T2.po_d_no,
							S1_T3.purc_schd_no,
							S1_T3.purc_schd_dt,
							S1_T1.rcpt_iv_no,
							S1_T1.rcpt_iv_mng_no,
							S1_T1.dlv_inst_d_no,
							S1_T1.prms_rcpt_d_no,
							S1_T2.sls_ret_schd_d_no,
							S1_T4.pr(S4_W2.purc_act_no),
							S1_T4.pr(S4_W2.purc_act_d_no),
							S1_T1.iv_no,
							S1_T2.iv_d_no,
							decode(
								S1_T5.purc_act_io_no,
								nullValue(),
								S1_T1.purc_qty,
								S1_T5.base_unit_qty
							).as("purc_qty"),
							S1_T1.sls_ret_qty,
							S1_T1.outsrc_flg,
							S1_T1.mfg_inst_no,
							S1_T1.pre_outsrc_act_flg,
							S1_T1.pre_mfg_act_no.as("mfg_act_no"),
							nullValue().as("stk_lst_prnt_flg"),
							decode(
								bracket(
									subQuery()
									.select(S2_MA.bp_cd)
									.from(S2_MA)
									.where(
										S2_MA.if_proc_typ.eq(value(MAC_IF_PROC_TYP.SHIP_ACT_RECV.value()))
										.and(S2_MA.bp_cd.eq(S1_T2.sppl_cd))
										.and(bind("today").between(S2_MA.st_dt, S2_MA.end_dt))
										.and(S2_MA.del_flg.eq(value(false)))
									)
								),
								nullValue(),
								value(false),
								value(true)
							).as("edi_flg"),
							cases()
								.when(
									bracket(
										subQuery()
										.select(count(value(1)))
										.from(S3_CTL1)
										.where(
											S3_CTL1.if_proc_typ.eq(value(MAC_IF_PROC_TYP.WMS_ARR_ACT_RECV.value()))
											.and(
												S3_CTL1.loc_cd.eq(S1_T1.arr_loc_cd)
												.or(S3_CTL1.lg_grp_cd.eq(S1_T1.lg_grp_cd))
											)
											.and(bind("today").between(S3_CTL1.st_dt, S3_CTL1.end_dt))
											.and(S3_CTL1.del_flg.eq(value(false)))
										)
									).gt(value(0))
								)
									.then(value(1))
								.otherwise(value(0)).as("wms_flg"),
							nullValue().as("edi_bp_dlv_slip_no"),
							nullValue().as("edi_bp_dlv_slip_d_no"),
							decode(
								S1_T7.prov_schd_no,
								nullValue(),
								value(MAC_PROV_TYP.ONR_PROV.value()),
								S1_T7.prov_typ
							).as("prov_typ"),
							decode(
								S1_T7.prov_schd_no,
								nullValue(),
								value(MAC_PROV_BASIS_TYP.INPT.value()),
								S1_T7.prov_basis_typ
							).as("prov_basis_typ"),
							decode(
								S1_T7.prov_schd_no,
								nullValue(),
								decode(
									S1_T2.trd_ptn_typ,
									value(MAC_TRD_PTN_TYP.PROV.value()),
									value(MSC_PROV_SRC_SCHD_TYP.SHIP.value()),
									value(MSC_PROV_SRC_SCHD_TYP.DDLV.value())
								),
								S1_T7.prov_src_schd_typ
							).as("prov_src_schd_typ"),
							decode(
								S1_T7.prov_schd_no,
								nullValue(),
								value(MAC_STR.NULL_VAL.value()),
								S1_T7.prov_src_schd_no1
							).as("prov_src_schd_no1"),
							decode(
								S1_T7.prov_schd_no,
								nullValue(),
								S1_T1.arr_schd_no,
								S1_T7.prov_src_schd_no2
							).as("prov_src_schd_no2"),
							S1_T7.prov_schd_no,
							nullValue().as("prov_src_act_typ"),
							nullValue().as("prov_src_act_no"),
							nullValue().as("prov_act_no"),
							nullValue().as("prov_slip_prnt_flg"),
							S1_T5.purc_act_io_no,
							S1_T5.purc_act_io_seq,
							S1_T5.trd_unit_cd.as("pa_io_trd_unit_cd"),
							S1_T5.base_unit_qty.as("pa_io_base_unit_qty"),
							S1_T6.base_unit_qty.as("aa_base_unit_qty"),
							nullValue().as("purc_cnt"),
							nullValue().as("sls_cnt"),
							S1_T1.ins_usr_id,
							S1_T1.ins_usr_nm,
							S1_T1.ins_func_id,
							nullValue().as("ins_func_nm"),
							S1_T1.ins_ts,
							S1_T1.upd_usr_id,
							S1_T1.upd_usr_nm,
							S1_T1.upd_func_id,
							nullValue().as("upd_func_nm"),
							S1_T1.upd_ts,
							S1_T1.upd_srv_req_no,
							S1_T2.upd_cntr.as("arr_pr_upd_cntr"),
							S1_T8.po_schd_no,
							nullValue().as("arr_act_upd_cntr"),
							bind("today").as("master_dt"),
							value(0).as("base_unit_qty_bef")
						)
						.from(
							S1_T1
							.leftOuterJoin(S1_T2).on(S1_T2.arr_pr_no.eq(S1_T1.arr_pr_no))
							.leftOuterJoin(S1_T3).on(S1_T3.arr_schd_no.eq(S1_T1.arr_schd_no))
							.leftOuterJoin(
								subQuery()
								.select(
									S4_W2.purc_act_d_no,
									S4_W2.purc_act_d_seq,
									S4_W2.purc_act_no,
									S4_W2.purc_act_seq,
									S4_W2.sno1_mng_typ,
									S4_W2.sno2_mng_typ,
									S4_W2.sno3_mng_typ,
									S4_W2.sno4_mng_typ,
									S4_W2.rsn_cd,
									S4_W2.bd_dpt_cd,
									S4_W2.bd_wg_cd,
									S4_W3.purc_schd_no
								)
								.from(
									S4_W
									.innerJoin(S4_W2).on(
										S4_W.purc_act_no.eq(S4_W2.purc_act_no)
										.and(S4_W.purc_act_seq.eq(S4_W2.purc_act_seq))
									)
									.innerJoin(S4_W3).on(S4_W2.purc_schd_no.eq(S4_W3.purc_schd_no))
									.innerJoin(S4_W4).on(S4_W3.arr_schd_no.eq(S4_W4.arr_schd_no))
								)
								.where(
									value(0).eq(value(0))
									.and(S4_W.slip_sts_typ.eq(value(MAC_SLIP_STS_TYP.CRT.value())))
									.and(S4_W4.arr_ptn_typ.eq(value(MSC_ARR_PTN_TYP.N_YET_ARR.value())))
								).view(S1_T4)
							).on(S1_T4.pr(S4_W3.purc_schd_no).eq(S1_T3.purc_schd_no))
							.leftOuterJoin(S1_T5).on(
								S1_T5.purc_act_d_no.eq(S1_T4.pr(S4_W2.purc_act_d_no))
								.and(S1_T5.purc_act_d_seq.eq(S1_T4.pr(S4_W2.purc_act_d_seq)))
							)
							.leftOuterJoin(S1_T6).on(
								S1_T6.purc_act_io_no.eq(S1_T5.purc_act_io_no)
								.and(S1_T6.can_flg.eq(value(false)))
							)
							.leftOuterJoin(S1_T7).on(
								S1_T7.prov_src_schd_typ.in(
									value(MSC_PROV_SRC_SCHD_TYP.SHIP.value()),
									value(MSC_PROV_SRC_SCHD_TYP.DDLV.value())
								)
								.and(S1_T7.prov_src_schd_no2.eq(S1_T1.arr_schd_no))
							)
							.leftOuterJoin(S1_T8).on(S1_T8.po_d_no.eq(S1_T2.po_d_no))
							.leftOuterJoin(S1_T9).on(
								S1_T9.dlv_slip_mng_d_no.eq(S1_T1.dlv_slip_mng_d_no)
								.and(S1_T9.dlv_slip_mng_d_seq.eq(S1_T1.dlv_slip_mng_d_seq))
							)
							.leftOuterJoin(S1_T10).on(
								S1_T10.dlv_slip_mng_no.eq(S1_T1.dlv_slip_mng_no)
								.and(S1_T10.dlv_slip_mng_seq.eq(S1_T1.dlv_slip_mng_seq))
							)
						)
						.where(
							value(0).eq(value(0))
							.cutoff$and(S1_T7.prov_schd_no.like(bind("prov_schd_no")))
							.and(
								value(1).eq(value(0))
								.cutoff$or(
									S1_T1.cmpl_flg.eq(value(false))
									.and(bind("tmp_arr_yet").eq(value(true)))
								)
							)
							.and(S1_T1.arr_skip_flg.eq(value(false)))
							.cutoff$and(S1_T1.arr_schd_tm.gte(bind("arr_schd_hm_fr")))
							.cutoff$and(S1_T1.arr_schd_tm.lte(bind("arr_schd_hm_to")))
							.cutoff$and(
								MAPA_CALC$F_CALC_PER(
									S1_T1.base_unit_qty,
									S1_T1.arr_qty
								).gte(bind("pr_rate_fr"))
							)
							.cutoff$and(
								MAPA_CALC$F_CALC_PER(
									S1_T1.base_unit_qty,
									S1_T1.arr_qty
								).lte(bind("pr_rate_to"))
							)
							.cutoff$and(S1_T2.rqst_dpt_cd.like(bind("rqst_dpt_cd")))
							.cutoff$and(S1_T2.rqst_usr_cd.like(bind("rqst_usr_cd")))
							.cutoff$and(S1_T1.lg_grp_cd.like(bind("arr_lg_grp_cd")))
							.cutoff$and(S1_T1.itm_cd.like(bind("itm_cd")))
							.cutoff$and(S1_T1.itm_sub1.like(bind("itm_sub1")))
							.cutoff$and(S1_T1.itm_sub2.like(bind("itm_sub2")))
							.cutoff$and(S1_T1.itm_sub3.like(bind("itm_sub3")))
							.cutoff$and(S1_T1.ver_no.like(bind("ver_no")))
							.cutoff$and(S1_T1.lot_no.like(bind("lot_no")))
							.cutoff$and(S1_T1.sublot_no.like(bind("sublot_no")))
							.cutoff$and(S1_T1.sno1.like(bind("sno1")))
							.cutoff$and(S1_T1.sno2.like(bind("sno2")))
							.cutoff$and(S1_T1.sno3.like(bind("sno3")))
							.cutoff$and(S1_T1.sno4.like(bind("sno4")))
							.cutoff$and(S1_T2.trd_cd.like(bind("trd_cd")))
							.cutoff$and(S1_T1.dlv_slip_no.like(bind("dlv_slip_no")))
							.cutoff$and(S1_T10.dlv_slip_seq.eq(bind("dlv_slip_seq")))
							.cutoff$and(
								cases()
								.when(S1_T1.dlv_slip_mng_d_no.isNull())
								.then(S1_T2.dlv_slip_d_no)
								.otherwise(S1_T9.dlv_slip_d_no).like(bind("dlv_slip_d_no"))
							)
							.cutoff$and(S1_T1.arr_schd_no.like(bind("arr_schd_no")))
							.cutoff$and(S1_T1.trd_rmrks.like(bind("trd_rmrks")))
							.cutoff$and(S1_T1.trd_d_rmrks.like(bind("trd_d_rmrks")))
							.cutoff$and(S1_T1.arr_cnt_rmrks.like(bind("arr_cnt_rmrks")))
							.cutoff$and(S1_T1.maker_cd.like(bind("maker_cd")))
							.cutoff$and(S1_T1.bp_lot_no.like(bind("bp_lot_no")))
							.cutoff$and(S1_T2.sppl_cd.like(bind("sppl_cd")))
							.cutoff$and(S1_T2.po_d_no.like(bind("po_d_no")))
							.cutoff$and(S1_T1.rcpt_iv_no.like(bind("rcpt_iv_no")))
							.cutoff$and(S1_T4.pr(S4_W2.purc_act_no).like(bind("purc_act_no")))
							.cutoff$and(S1_T1.mfg_inst_no.like(bind("mfg_inst_no")))
							.cutoff$and(S1_T1.sppl_itm_cd.like(bind("sppl_itm_cd")))
							.cutoff$and(S1_T1.sppl_itm_nm.like(bind("sppl_itm_nm")))
							.cutoff$and(S1_T1.purc_id_typ.like(bind("purc_id_typ")))
							.cutoff$and(S1_T2.cst_cd.like(bind("cst_cd")))
							.cutoff$and(S1_T2.sret_fr_cd.like(bind("sret_fr_cd")))
							.cutoff$and(S1_T1.iv_no.like(bind("iv_no")))
							.cutoff$and(S1_T2.iv_d_no.like(bind("iv_d_no")))
							.cutoff$and(S1_T8.po_no.like(bind("po_no")))
							.and(
								bracket(
									bind("tmp_edi_t").eq(value(true))
									.and(bind("tmp_edi_f").eq(value(true)))
								)
								.or(
									bind("tmp_edi_t").eq(value(true))
									.and(
										exists(
											subQuery()
											.select(value("X"))
											.from(S5)
											.where(
												S5.if_proc_typ.eq(value(MAC_IF_PROC_TYP.SHIP_ACT_RECV.value()))
												.and(S5.bp_cd.eq(S1_T2.sppl_cd))
												.and(bind("today").between(S5.st_dt, S5.end_dt))
												.and(S5.del_flg.eq(value(false)))
											)
										)
									)
								)
								.or(
									bind("tmp_edi_f").eq(value(true))
									.and(
										notExists(
											subQuery()
											.select(value("X"))
											.from(S6)
											.where(
												S6.if_proc_typ.eq(value(MAC_IF_PROC_TYP.SHIP_ACT_RECV.value()))
												.and(S6.bp_cd.eq(S1_T2.sppl_cd))
												.and(bind("today").between(S6.st_dt, S6.end_dt))
												.and(S6.del_flg.eq(value(false)))
											)
										)
									)
								)
							)
							.and(
								bracket(
									bind("tmp_wms_t").eq(value(true))
									.and(bind("tmp_wms_f").eq(value(true)))
								)
								.or(
									bind("tmp_wms_t").eq(value(true))
									.and(
										exists(
											subQuery()
											.select(value("X"))
											.from(S7)
											.where(
												S7.if_proc_typ.eq(value(MAC_IF_PROC_TYP.WMS_ARR_ACT_RECV.value()))
												.and(
													S7.loc_cd.eq(S1_T1.arr_loc_cd)
													.or(S7.lg_grp_cd.eq(S1_T1.lg_grp_cd))
												)
												.and(bind("today").between(S7.st_dt, S7.end_dt))
												.and(S7.del_flg.eq(value(false)))
											)
										)
									)
								)
								.or(
									bind("tmp_wms_f").eq(value(true))
									.and(
										notExists(
											subQuery()
											.select(value("X"))
											.from(S8)
											.where(
												S8.if_proc_typ.eq(value(MAC_IF_PROC_TYP.WMS_ARR_ACT_RECV.value()))
												.and(
													S8.loc_cd.eq(S1_T1.arr_loc_cd)
													.or(S8.lg_grp_cd.eq(S1_T1.lg_grp_cd))
												)
												.and(bind("today").between(S8.st_dt, S8.end_dt))
												.and(S8.del_flg.eq(value(false)))
											)
										)
									)
								)
							)
							.cutoff$and(
								bracket(
									S1_T1.arr_ptn_typ.neq(value(MSC_ARR_PTN_TYP.N_YET_ARR.value()))
									.or(S1_T1.arr_ptn_typ.eq(value(MSC_ARR_PTN_TYP.N_YET_ARR.value())))
									.and(S1_T3.base_unit_purc_qty.gt(value(0)))
									.and(bind("tmp_purc_act_yet").eq(value(true)))
								)
							)
							.cutoff$and(
								exists(
									subQuery()
									.select(value("X"))
									.from(S11_W1)
									.where(
										S11_W1.arr_schd_no.eq(S1_T1.arr_schd_no)
										.and(S11_W1.rcpt_iv_d_no.like(bind("rcpt_iv_d_no")))
									)
								)
							)
						).view(S0_V1)
						.leftOuterJoin(S0_ARR_LOC).on(S0_ARR_LOC.loc_cd.eq(S0_V1.pr("arr_loc_cd")))
						.addDynamicView(DS0D)
					)
					.where(
						value(0).eq(value(0))
						.addDynamicPredicate(DS0D)
						.and(
							exists(
								subQuery()
								.select(value("X"))
								.from(S9_W1)
								.where(
									S9_W1.loc_cd.eq(S0_V1.pr("arr_loc_cd"))
								)
							)
							.or(
								exists(
									subQuery()
									.select(value("X"))
									.from(S10_W2)
									.where(
										S10_W2.lg_grp_cd.eq(S0_V1.pr("arr_lg_grp_cd"))
									)
								)
							)
						)
						.and(
							value(1).eq(value(0))
							.cutoff$or(
								S0_ARR_LOC.sppl_cd.isNull()
								.and(bind("tmp_outsrc_f").eq(value(true)))
							)
							.cutoff$or(
								S0_ARR_LOC.sppl_cd.isNotNull()
								.and(bind("tmp_outsrc_t").eq(value(true)))
							)
						)
						.cutoff$and(S0_ARR_LOC.loc_nm.like(bind("arr_loc_nm")))
						.cutoff$and(S0_ARR_LOC.lg_grp_cd.like(bind("arr_lg_grp_cd")))
						.cutoff$and(S0_ARR_LOC.site_cd.like(bind("arr_site_cd")))
						.cutoff$and(S0_ARR_LOC.alloc_grp_cd.like(bind("arr_alloc_grp_cd")))
						.cutoff$and(S0_ARR_LOC.sppl_cd.like(bind("prsppl_cd")))
						.cutoff$and(S0_V1.pr("arr_loc_cd").like(bind("arr_loc_cd")))
						.cutoff$and(S0_V1.pr("arr_str_ln_cd").like(bind("arr_str_ln_cd")))
						.cutoff$and(S0_V1.pr("arr_wg_cd").like(bind("arr_wg_cd")))
						.cutoff$and(S0_V1.pr("prov_typ").like(bind("prov_typ")))
						.cutoff$and(S0_V1.pr("prov_basis_typ").like(bind("prov_basis_typ")))
						.cutoff$and(S0_V1.pr("prov_src_schd_typ").like(bind("prov_src_schd_typ")))
						.cutoff$and(S0_V1.pr("prov_src_schd_no1").like(bind("prov_src_schd_no1")))
						.cutoff$and(S0_V1.pr("prov_src_schd_no2").like(bind("prov_src_schd_no2")))
					)
					.orderBy(
						S0_V1.pr("arr_schd_dt").asc(),
						S0_V1.pr("arr_schd_hm").asc(),
						S0_V1.pr(S1_T1.arr_schd_no).asc(),
						S0_V1.pr(S1_T5.purc_act_io_no).asc()
					)
			)
			.setDynamicSQLInfo(
				when(boundOr("sppl_nm", "rcpt_iv_itm_nm", "po_grp_flg1", "po_grp_flg2", "po_grp_flg3", "po_grp_flg4", "po_grp_flg5", "po_grp_flg6", "po_grp_flg7", "po_grp_flg8", "po_grp_flg9", "po_grp_flg10"))
					.view(DS0D, v -> v.leftOuterJoin(S0_SPPL).on(S0_SPPL.bp_cd.eq(S0_V1.pr(S1_T2.sppl_cd))))
					.predicate(DS0D, p -> p.cutoff$and(S0_SPPL.bp_nm.like(bind("sppl_nm")))),
				when(boundOr("po_grp_flg1"))
					.select(DS0D, S0_SPPL.bp_grp_cd1.as("po_grp_cd1"))
					.groupBy(DS0D, S0_SPPL.bp_grp_cd1),
				when(boundOr("po_grp_flg1", "po_grp_cd1"))
					.predicate(DS0D, p -> p.cutoff$and(S0_SPPL.bp_grp_cd1.like(bind("po_grp_cd1")))),
				when(boundOr("po_grp_flg1"))
					.select(DS0D, S0_PO_GRP1.bp_grp_nm.as("po_grp_nm1"))
					.groupBy(DS0D, S0_PO_GRP1.bp_grp_nm),
				when(boundOr("po_grp_flg1", "po_grp_nm1"))
					.view(DS0D, v -> v.leftOuterJoin(S0_PO_GRP1).on(S0_SPPL.bp_grp_cd1.eq(S0_PO_GRP1.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP1.value()).eq(S0_PO_GRP1.bp_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_PO_GRP1.bp_grp_nm.like(bind("po_grp_nm1")))),
				when(boundOr("po_grp_flg2"))
					.select(DS0D, S0_SPPL.bp_grp_cd2.as("po_grp_cd2"))
					.groupBy(DS0D, S0_SPPL.bp_grp_cd2),
				when(boundOr("po_grp_flg2", "po_grp_cd2"))
					.predicate(DS0D, p -> p.cutoff$and(S0_SPPL.bp_grp_cd2.like(bind("po_grp_cd2")))),
				when(boundOr("po_grp_flg2"))
					.select(DS0D, S0_PO_GRP2.bp_grp_nm.as("po_grp_nm2"))
					.groupBy(DS0D, S0_PO_GRP2.bp_grp_nm),
				when(boundOr("po_grp_flg2", "po_grp_nm2"))
					.view(DS0D, v -> v.leftOuterJoin(S0_PO_GRP2).on(S0_SPPL.bp_grp_cd2.eq(S0_PO_GRP2.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP2.value()).eq(S0_PO_GRP2.bp_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_PO_GRP2.bp_grp_nm.like(bind("po_grp_nm2")))),
				when(boundOr("po_grp_flg3"))
					.select(DS0D, S0_SPPL.bp_grp_cd3.as("po_grp_cd3"))
					.groupBy(DS0D, S0_SPPL.bp_grp_cd3),
				when(boundOr("po_grp_flg3", "po_grp_cd3"))
					.predicate(DS0D, p -> p.cutoff$and(S0_SPPL.bp_grp_cd3.like(bind("po_grp_cd3")))),
				when(boundOr("po_grp_flg3"))
					.select(DS0D, S0_PO_GRP3.bp_grp_nm.as("po_grp_nm3"))
					.groupBy(DS0D, S0_PO_GRP3.bp_grp_nm),
				when(boundOr("po_grp_flg3", "po_grp_nm3"))
					.view(DS0D, v -> v.leftOuterJoin(S0_PO_GRP3).on(S0_SPPL.bp_grp_cd3.eq(S0_PO_GRP3.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP3.value()).eq(S0_PO_GRP3.bp_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_PO_GRP3.bp_grp_nm.like(bind("po_grp_nm3")))),
				when(boundOr("po_grp_flg4"))
					.select(DS0D, S0_SPPL.bp_grp_cd4.as("po_grp_cd4"))
					.groupBy(DS0D, S0_SPPL.bp_grp_cd4),
				when(boundOr("po_grp_flg4", "po_grp_cd4"))
					.predicate(DS0D, p -> p.cutoff$and(S0_SPPL.bp_grp_cd4.like(bind("po_grp_cd4")))),
				when(boundOr("po_grp_flg4"))
					.select(DS0D, S0_PO_GRP4.bp_grp_nm.as("po_grp_nm4"))
					.groupBy(DS0D, S0_PO_GRP4.bp_grp_nm),
				when(boundOr("po_grp_flg4", "po_grp_nm4"))
					.view(DS0D, v -> v.leftOuterJoin(S0_PO_GRP4).on(S0_SPPL.bp_grp_cd4.eq(S0_PO_GRP4.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP4.value()).eq(S0_PO_GRP4.bp_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_PO_GRP4.bp_grp_nm.like(bind("po_grp_nm4")))),
				when(boundOr("po_grp_flg5"))
					.select(DS0D, S0_SPPL.bp_grp_cd5.as("po_grp_cd5"))
					.groupBy(DS0D, S0_SPPL.bp_grp_cd5),
				when(boundOr("po_grp_flg5", "po_grp_cd5"))
					.predicate(DS0D, p -> p.cutoff$and(S0_SPPL.bp_grp_cd5.like(bind("po_grp_cd5")))),
				when(boundOr("po_grp_flg5"))
					.select(DS0D, S0_PO_GRP5.bp_grp_nm.as("po_grp_nm5"))
					.groupBy(DS0D, S0_PO_GRP5.bp_grp_nm),
				when(boundOr("po_grp_flg5", "po_grp_nm5"))
					.view(DS0D, v -> v.leftOuterJoin(S0_PO_GRP5).on(S0_SPPL.bp_grp_cd5.eq(S0_PO_GRP5.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP5.value()).eq(S0_PO_GRP5.bp_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_PO_GRP5.bp_grp_nm.like(bind("po_grp_nm5")))),
				when(boundOr("po_grp_flg6"))
					.select(DS0D, S0_SPPL.bp_grp_cd6.as("po_grp_cd6"))
					.groupBy(DS0D, S0_SPPL.bp_grp_cd6),
				when(boundOr("po_grp_flg6", "po_grp_cd6"))
					.predicate(DS0D, p -> p.cutoff$and(S0_SPPL.bp_grp_cd6.like(bind("po_grp_cd6")))),
				when(boundOr("po_grp_flg6"))
					.select(DS0D, S0_PO_GRP6.bp_grp_nm.as("po_grp_nm6"))
					.groupBy(DS0D, S0_PO_GRP6.bp_grp_nm),
				when(boundOr("po_grp_flg6", "po_grp_nm6"))
					.view(DS0D, v -> v.leftOuterJoin(S0_PO_GRP6).on(S0_SPPL.bp_grp_cd6.eq(S0_PO_GRP6.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP6.value()).eq(S0_PO_GRP6.bp_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_PO_GRP6.bp_grp_nm.like(bind("po_grp_nm6")))),
				when(boundOr("po_grp_flg7"))
					.select(DS0D, S0_SPPL.bp_grp_cd7.as("po_grp_cd7"))
					.groupBy(DS0D, S0_SPPL.bp_grp_cd7),
				when(boundOr("po_grp_flg7", "po_grp_cd7"))
					.predicate(DS0D, p -> p.cutoff$and(S0_SPPL.bp_grp_cd7.like(bind("po_grp_cd7")))),
				when(boundOr("po_grp_flg7"))
					.select(DS0D, S0_PO_GRP7.bp_grp_nm.as("po_grp_nm7"))
					.groupBy(DS0D, S0_PO_GRP7.bp_grp_nm),
				when(boundOr("po_grp_flg7", "po_grp_nm7"))
					.view(DS0D, v -> v.leftOuterJoin(S0_PO_GRP7).on(S0_SPPL.bp_grp_cd7.eq(S0_PO_GRP7.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP7.value()).eq(S0_PO_GRP7.bp_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_PO_GRP7.bp_grp_nm.like(bind("po_grp_nm7")))),
				when(boundOr("po_grp_flg8"))
					.select(DS0D, S0_SPPL.bp_grp_cd8.as("po_grp_cd8"))
					.groupBy(DS0D, S0_SPPL.bp_grp_cd8),
				when(boundOr("po_grp_flg8", "po_grp_cd8"))
					.predicate(DS0D, p -> p.cutoff$and(S0_SPPL.bp_grp_cd8.like(bind("po_grp_cd8")))),
				when(boundOr("po_grp_flg8"))
					.select(DS0D, S0_PO_GRP8.bp_grp_nm.as("po_grp_nm8"))
					.groupBy(DS0D, S0_PO_GRP8.bp_grp_nm),
				when(boundOr("po_grp_flg8", "po_grp_nm8"))
					.view(DS0D, v -> v.leftOuterJoin(S0_PO_GRP8).on(S0_SPPL.bp_grp_cd8.eq(S0_PO_GRP8.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP8.value()).eq(S0_PO_GRP8.bp_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_PO_GRP8.bp_grp_nm.like(bind("po_grp_nm8")))),
				when(boundOr("po_grp_flg9"))
					.select(DS0D, S0_SPPL.bp_grp_cd9.as("po_grp_cd9"))
					.groupBy(DS0D, S0_SPPL.bp_grp_cd9),
				when(boundOr("po_grp_flg9", "po_grp_cd9"))
					.predicate(DS0D, p -> p.cutoff$and(S0_SPPL.bp_grp_cd9.like(bind("po_grp_cd9")))),
				when(boundOr("po_grp_flg9"))
					.select(DS0D, S0_PO_GRP9.bp_grp_nm.as("po_grp_nm9"))
					.groupBy(DS0D, S0_PO_GRP9.bp_grp_nm),
				when(boundOr("po_grp_flg9", "po_grp_nm9"))
					.view(DS0D, v -> v.leftOuterJoin(S0_PO_GRP9).on(S0_SPPL.bp_grp_cd9.eq(S0_PO_GRP9.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP9.value()).eq(S0_PO_GRP9.bp_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_PO_GRP9.bp_grp_nm.like(bind("po_grp_nm9")))),
				when(boundOr("po_grp_flg10"))
					.select(DS0D, S0_SPPL.bp_grp_cd10.as("po_grp_cd10"))
					.groupBy(DS0D, S0_SPPL.bp_grp_cd10),
				when(boundOr("po_grp_flg10", "po_grp_cd10"))
					.predicate(DS0D, p -> p.cutoff$and(S0_SPPL.bp_grp_cd10.like(bind("po_grp_cd10")))),
				when(boundOr("po_grp_flg10"))
					.select(DS0D, S0_PO_GRP10.bp_grp_nm.as("po_grp_nm10"))
					.groupBy(DS0D, S0_PO_GRP10.bp_grp_nm),
				when(boundOr("po_grp_flg10", "po_grp_nm10"))
					.view(DS0D, v -> v.leftOuterJoin(S0_PO_GRP10).on(S0_SPPL.bp_grp_cd10.eq(S0_PO_GRP10.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP10.value()).eq(S0_PO_GRP10.bp_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_PO_GRP10.bp_grp_nm.like(bind("po_grp_nm10")))),
				when(boundOr("sret_fr_cd", "sret_fr_nm", "sret_fr_grp_flg1", "sret_fr_grp_flg2", "sret_fr_grp_flg3", "sret_fr_grp_flg4", "sret_fr_grp_flg5", "sret_fr_grp_flg6", "sret_fr_grp_flg7", "sret_fr_grp_flg8", "sret_fr_grp_flg9", "sret_fr_grp_flg10", "sls_ret_schd_no", "cst_po_no", "cst_itm_cd", "cst_itm_nm"))
					.view(DS0D, v -> v.leftOuterJoin(S0_SRET_SCHD_D).on(S0_SRET_SCHD_D.sls_ret_schd_d_no.eq(S0_V1.pr(S1_T2.sls_ret_schd_d_no))).leftOuterJoin(S0_SRET_FR).on(S0_SRET_FR.bp_cd.eq(S0_V1.pr(S1_T2.sret_fr_cd))))
					.predicate(DS0D, p -> p.cutoff$and(nvl(S0_SRET_SCHD_D.sret_fr_nm,S0_SRET_FR.bp_nm).like(bind("sret_fr_nm")))),
				when(boundOr("sret_fr_grp_flg1"))
					.select(DS0D, S0_SRET_FR.bp_grp_cd1.as("sret_fr_grp_cd1"))
					.groupBy(DS0D, S0_SRET_FR.bp_grp_cd1),
				when(boundOr("sret_fr_grp_flg1", "sret_fr_grp_cd1"))
					.predicate(DS0D, p -> p.cutoff$and(S0_SRET_FR.bp_grp_cd1.like(bind("sret_fr_grp_cd1")))),
				when(boundOr("sret_fr_grp_flg1"))
					.select(DS0D, S0_SRET_FR_GRP1.bp_grp_nm.as("sret_fr_grp_nm1"))
					.groupBy(DS0D, S0_SRET_FR_GRP1.bp_grp_nm),
				when(boundOr("sret_fr_grp_flg1", "sret_fr_grp_nm1"))
					.view(DS0D, v -> v.leftOuterJoin(S0_SRET_FR_GRP1).on(S0_SRET_FR.bp_grp_cd1.eq(S0_SRET_FR_GRP1.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP1.value()).eq(S0_SRET_FR_GRP1.bp_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_SRET_FR_GRP1.bp_grp_nm.like(bind("sret_fr_grp_nm1")))),
				when(boundOr("sret_fr_grp_flg2"))
					.select(DS0D, S0_SRET_FR.bp_grp_cd2.as("sret_fr_grp_cd2"))
					.groupBy(DS0D, S0_SRET_FR.bp_grp_cd2),
				when(boundOr("sret_fr_grp_flg2", "sret_fr_grp_cd2"))
					.predicate(DS0D, p -> p.cutoff$and(S0_SRET_FR.bp_grp_cd2.like(bind("sret_fr_grp_cd2")))),
				when(boundOr("sret_fr_grp_flg2"))
					.select(DS0D, S0_SRET_FR_GRP2.bp_grp_nm.as("sret_fr_grp_nm2"))
					.groupBy(DS0D, S0_SRET_FR_GRP2.bp_grp_nm),
				when(boundOr("sret_fr_grp_flg2", "sret_fr_grp_nm2"))
					.view(DS0D, v -> v.leftOuterJoin(S0_SRET_FR_GRP2).on(S0_SRET_FR.bp_grp_cd2.eq(S0_SRET_FR_GRP2.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP2.value()).eq(S0_SRET_FR_GRP2.bp_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_SRET_FR_GRP2.bp_grp_nm.like(bind("sret_fr_grp_nm2")))),
				when(boundOr("sret_fr_grp_flg3"))
					.select(DS0D, S0_SRET_FR.bp_grp_cd3.as("sret_fr_grp_cd3"))
					.groupBy(DS0D, S0_SRET_FR.bp_grp_cd3),
				when(boundOr("sret_fr_grp_flg3", "sret_fr_grp_cd3"))
					.predicate(DS0D, p -> p.cutoff$and(S0_SRET_FR.bp_grp_cd3.like(bind("sret_fr_grp_cd3")))),
				when(boundOr("sret_fr_grp_flg3"))
					.select(DS0D, S0_SRET_FR_GRP3.bp_grp_nm.as("sret_fr_grp_nm3"))
					.groupBy(DS0D, S0_SRET_FR_GRP3.bp_grp_nm),
				when(boundOr("sret_fr_grp_flg3", "sret_fr_grp_nm3"))
					.view(DS0D, v -> v.leftOuterJoin(S0_SRET_FR_GRP3).on(S0_SRET_FR.bp_grp_cd3.eq(S0_SRET_FR_GRP3.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP3.value()).eq(S0_SRET_FR_GRP3.bp_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_SRET_FR_GRP3.bp_grp_nm.like(bind("sret_fr_grp_nm3")))),
				when(boundOr("sret_fr_grp_flg4"))
					.select(DS0D, S0_SRET_FR.bp_grp_cd4.as("sret_fr_grp_cd4"))
					.groupBy(DS0D, S0_SRET_FR.bp_grp_cd4),
				when(boundOr("sret_fr_grp_flg4", "sret_fr_grp_cd4"))
					.predicate(DS0D, p -> p.cutoff$and(S0_SRET_FR.bp_grp_cd4.like(bind("sret_fr_grp_cd4")))),
				when(boundOr("sret_fr_grp_flg4"))
					.select(DS0D, S0_SRET_FR_GRP4.bp_grp_nm.as("sret_fr_grp_nm4"))
					.groupBy(DS0D, S0_SRET_FR_GRP4.bp_grp_nm),
				when(boundOr("sret_fr_grp_flg4", "sret_fr_grp_nm4"))
					.view(DS0D, v -> v.leftOuterJoin(S0_SRET_FR_GRP4).on(S0_SRET_FR.bp_grp_cd4.eq(S0_SRET_FR_GRP4.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP4.value()).eq(S0_SRET_FR_GRP4.bp_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_SRET_FR_GRP4.bp_grp_nm.like(bind("sret_fr_grp_nm4")))),
				when(boundOr("sret_fr_grp_flg5"))
					.select(DS0D, S0_SRET_FR.bp_grp_cd5.as("sret_fr_grp_cd5"))
					.groupBy(DS0D, S0_SRET_FR.bp_grp_cd5),
				when(boundOr("sret_fr_grp_flg5", "sret_fr_grp_cd5"))
					.predicate(DS0D, p -> p.cutoff$and(S0_SRET_FR.bp_grp_cd5.like(bind("sret_fr_grp_cd5")))),
				when(boundOr("sret_fr_grp_flg5"))
					.select(DS0D, S0_SRET_FR_GRP5.bp_grp_nm.as("sret_fr_grp_nm5"))
					.groupBy(DS0D, S0_SRET_FR_GRP5.bp_grp_nm),
				when(boundOr("sret_fr_grp_flg5", "sret_fr_grp_nm5"))
					.view(DS0D, v -> v.leftOuterJoin(S0_SRET_FR_GRP5).on(S0_SRET_FR.bp_grp_cd5.eq(S0_SRET_FR_GRP5.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP5.value()).eq(S0_SRET_FR_GRP5.bp_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_SRET_FR_GRP5.bp_grp_nm.like(bind("sret_fr_grp_nm5")))),
				when(boundOr("sret_fr_grp_flg6"))
					.select(DS0D, S0_SRET_FR.bp_grp_cd6.as("sret_fr_grp_cd6"))
					.groupBy(DS0D, S0_SRET_FR.bp_grp_cd6),
				when(boundOr("sret_fr_grp_flg6", "sret_fr_grp_cd6"))
					.predicate(DS0D, p -> p.cutoff$and(S0_SRET_FR.bp_grp_cd6.like(bind("sret_fr_grp_cd6")))),
				when(boundOr("sret_fr_grp_flg6"))
					.select(DS0D, S0_SRET_FR_GRP6.bp_grp_nm.as("sret_fr_grp_nm6"))
					.groupBy(DS0D, S0_SRET_FR_GRP6.bp_grp_nm),
				when(boundOr("sret_fr_grp_flg6", "sret_fr_grp_nm6"))
					.view(DS0D, v -> v.leftOuterJoin(S0_SRET_FR_GRP6).on(S0_SRET_FR.bp_grp_cd6.eq(S0_SRET_FR_GRP6.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP6.value()).eq(S0_SRET_FR_GRP6.bp_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_SRET_FR_GRP6.bp_grp_nm.like(bind("sret_fr_grp_nm6")))),
				when(boundOr("sret_fr_grp_flg7"))
					.select(DS0D, S0_SRET_FR.bp_grp_cd7.as("sret_fr_grp_cd7"))
					.groupBy(DS0D, S0_SRET_FR.bp_grp_cd7),
				when(boundOr("sret_fr_grp_flg7", "sret_fr_grp_cd7"))
					.predicate(DS0D, p -> p.cutoff$and(S0_SRET_FR.bp_grp_cd7.like(bind("sret_fr_grp_cd7")))),
				when(boundOr("sret_fr_grp_flg7"))
					.select(DS0D, S0_SRET_FR_GRP7.bp_grp_nm.as("sret_fr_grp_nm7"))
					.groupBy(DS0D, S0_SRET_FR_GRP7.bp_grp_nm),
				when(boundOr("sret_fr_grp_flg7", "sret_fr_grp_nm7"))
					.view(DS0D, v -> v.leftOuterJoin(S0_SRET_FR_GRP7).on(S0_SRET_FR.bp_grp_cd7.eq(S0_SRET_FR_GRP7.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP7.value()).eq(S0_SRET_FR_GRP7.bp_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_SRET_FR_GRP7.bp_grp_nm.like(bind("sret_fr_grp_nm7")))),
				when(boundOr("sret_fr_grp_flg8"))
					.select(DS0D, S0_SRET_FR.bp_grp_cd8.as("sret_fr_grp_cd8"))
					.groupBy(DS0D, S0_SRET_FR.bp_grp_cd8),
				when(boundOr("sret_fr_grp_flg8", "sret_fr_grp_cd8"))
					.predicate(DS0D, p -> p.cutoff$and(S0_SRET_FR.bp_grp_cd8.like(bind("sret_fr_grp_cd8")))),
				when(boundOr("sret_fr_grp_flg8"))
					.select(DS0D, S0_SRET_FR_GRP8.bp_grp_nm.as("sret_fr_grp_nm8"))
					.groupBy(DS0D, S0_SRET_FR_GRP8.bp_grp_nm),
				when(boundOr("sret_fr_grp_flg8", "sret_fr_grp_nm8"))
					.view(DS0D, v -> v.leftOuterJoin(S0_SRET_FR_GRP8).on(S0_SRET_FR.bp_grp_cd8.eq(S0_SRET_FR_GRP8.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP8.value()).eq(S0_SRET_FR_GRP8.bp_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_SRET_FR_GRP8.bp_grp_nm.like(bind("sret_fr_grp_nm8")))),
				when(boundOr("sret_fr_grp_flg9"))
					.select(DS0D, S0_SRET_FR.bp_grp_cd9.as("sret_fr_grp_cd9"))
					.groupBy(DS0D, S0_SRET_FR.bp_grp_cd9),
				when(boundOr("sret_fr_grp_flg9", "sret_fr_grp_cd9"))
					.predicate(DS0D, p -> p.cutoff$and(S0_SRET_FR.bp_grp_cd9.like(bind("sret_fr_grp_cd9")))),
				when(boundOr("sret_fr_grp_flg9"))
					.select(DS0D, S0_SRET_FR_GRP9.bp_grp_nm.as("sret_fr_grp_nm9"))
					.groupBy(DS0D, S0_SRET_FR_GRP9.bp_grp_nm),
				when(boundOr("sret_fr_grp_flg9", "sret_fr_grp_nm9"))
					.view(DS0D, v -> v.leftOuterJoin(S0_SRET_FR_GRP9).on(S0_SRET_FR.bp_grp_cd9.eq(S0_SRET_FR_GRP9.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP9.value()).eq(S0_SRET_FR_GRP9.bp_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_SRET_FR_GRP9.bp_grp_nm.like(bind("sret_fr_grp_nm9")))),
				when(boundOr("sret_fr_grp_flg10"))
					.select(DS0D, S0_SRET_FR.bp_grp_cd10.as("sret_fr_grp_cd10"))
					.groupBy(DS0D, S0_SRET_FR.bp_grp_cd10),
				when(boundOr("sret_fr_grp_flg10", "sret_fr_grp_cd10"))
					.predicate(DS0D, p -> p.cutoff$and(S0_SRET_FR.bp_grp_cd10.like(bind("sret_fr_grp_cd10")))),
				when(boundOr("sret_fr_grp_flg10"))
					.select(DS0D, S0_SRET_FR_GRP10.bp_grp_nm.as("sret_fr_grp_nm10"))
					.groupBy(DS0D, S0_SRET_FR_GRP10.bp_grp_nm),
				when(boundOr("sret_fr_grp_flg10", "sret_fr_grp_nm10"))
					.view(DS0D, v -> v.leftOuterJoin(S0_SRET_FR_GRP10).on(S0_SRET_FR.bp_grp_cd10.eq(S0_SRET_FR_GRP10.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP10.value()).eq(S0_SRET_FR_GRP10.bp_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_SRET_FR_GRP10.bp_grp_nm.like(bind("sret_fr_grp_nm10")))),
				when(boundOr("cst_nm", "cst_grp_flg1", "cst_grp_flg2", "cst_grp_flg3", "cst_grp_flg4", "cst_grp_flg5", "cst_grp_flg6", "cst_grp_flg7", "cst_grp_flg8", "cst_grp_flg9", "cst_grp_flg10"))
					.view(DS0D, v -> v.leftOuterJoin(S0_CST).on(S0_CST.bp_cd.eq(S0_V1.pr(S1_T2.cst_cd))))
					.predicate(DS0D, p -> p.cutoff$and(S0_CST.bp_nm.like(bind("cst_nm")))),
				when(boundOr("cst_grp_flg1"))
					.select(DS0D, S0_CST.bp_grp_cd1.as("cst_grp_cd1"))
					.groupBy(DS0D, S0_CST.bp_grp_cd1),
				when(boundOr("cst_grp_flg1", "cst_grp_cd1"))
					.predicate(DS0D, p -> p.cutoff$and(S0_CST.bp_grp_cd1.like(bind("cst_grp_cd1")))),
				when(boundOr("cst_grp_flg1"))
					.select(DS0D, S0_CST_GRP1.bp_grp_nm.as("cst_grp_nm1"))
					.groupBy(DS0D, S0_CST_GRP1.bp_grp_nm),
				when(boundOr("cst_grp_flg1", "cst_grp_nm1"))
					.view(DS0D, v -> v.leftOuterJoin(S0_CST_GRP1).on(S0_CST.bp_grp_cd1.eq(S0_CST_GRP1.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP1.value()).eq(S0_CST_GRP1.bp_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_CST_GRP1.bp_grp_nm.like(bind("cst_grp_nm1")))),
				when(boundOr("cst_grp_flg2"))
					.select(DS0D, S0_CST.bp_grp_cd2.as("cst_grp_cd2"))
					.groupBy(DS0D, S0_CST.bp_grp_cd2),
				when(boundOr("cst_grp_flg2", "cst_grp_cd2"))
					.predicate(DS0D, p -> p.cutoff$and(S0_CST.bp_grp_cd2.like(bind("cst_grp_cd2")))),
				when(boundOr("cst_grp_flg2"))
					.select(DS0D, S0_CST_GRP2.bp_grp_nm.as("cst_grp_nm2"))
					.groupBy(DS0D, S0_CST_GRP2.bp_grp_nm),
				when(boundOr("cst_grp_flg2", "cst_grp_nm2"))
					.view(DS0D, v -> v.leftOuterJoin(S0_CST_GRP2).on(S0_CST.bp_grp_cd2.eq(S0_CST_GRP2.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP2.value()).eq(S0_CST_GRP2.bp_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_CST_GRP2.bp_grp_nm.like(bind("cst_grp_nm2")))),
				when(boundOr("cst_grp_flg3"))
					.select(DS0D, S0_CST.bp_grp_cd3.as("cst_grp_cd3"))
					.groupBy(DS0D, S0_CST.bp_grp_cd3),
				when(boundOr("cst_grp_flg3", "cst_grp_cd3"))
					.predicate(DS0D, p -> p.cutoff$and(S0_CST.bp_grp_cd3.like(bind("cst_grp_cd3")))),
				when(boundOr("cst_grp_flg3"))
					.select(DS0D, S0_CST_GRP3.bp_grp_nm.as("cst_grp_nm3"))
					.groupBy(DS0D, S0_CST_GRP3.bp_grp_nm),
				when(boundOr("cst_grp_flg3", "cst_grp_nm3"))
					.view(DS0D, v -> v.leftOuterJoin(S0_CST_GRP3).on(S0_CST.bp_grp_cd3.eq(S0_CST_GRP3.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP3.value()).eq(S0_CST_GRP3.bp_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_CST_GRP3.bp_grp_nm.like(bind("cst_grp_nm3")))),
				when(boundOr("cst_grp_flg4"))
					.select(DS0D, S0_CST.bp_grp_cd4.as("cst_grp_cd4"))
					.groupBy(DS0D, S0_CST.bp_grp_cd4),
				when(boundOr("cst_grp_flg4", "cst_grp_cd4"))
					.predicate(DS0D, p -> p.cutoff$and(S0_CST.bp_grp_cd4.like(bind("cst_grp_cd4")))),
				when(boundOr("cst_grp_flg4"))
					.select(DS0D, S0_CST_GRP4.bp_grp_nm.as("cst_grp_nm4"))
					.groupBy(DS0D, S0_CST_GRP4.bp_grp_nm),
				when(boundOr("cst_grp_flg4", "cst_grp_nm4"))
					.view(DS0D, v -> v.leftOuterJoin(S0_CST_GRP4).on(S0_CST.bp_grp_cd4.eq(S0_CST_GRP4.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP4.value()).eq(S0_CST_GRP4.bp_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_CST_GRP4.bp_grp_nm.like(bind("cst_grp_nm4")))),
				when(boundOr("cst_grp_flg5"))
					.select(DS0D, S0_CST.bp_grp_cd5.as("cst_grp_cd5"))
					.groupBy(DS0D, S0_CST.bp_grp_cd5),
				when(boundOr("cst_grp_flg5", "cst_grp_cd5"))
					.predicate(DS0D, p -> p.cutoff$and(S0_CST.bp_grp_cd5.like(bind("cst_grp_cd5")))),
				when(boundOr("cst_grp_flg5"))
					.select(DS0D, S0_CST_GRP5.bp_grp_nm.as("cst_grp_nm5"))
					.groupBy(DS0D, S0_CST_GRP5.bp_grp_nm),
				when(boundOr("cst_grp_flg5", "cst_grp_nm5"))
					.view(DS0D, v -> v.leftOuterJoin(S0_CST_GRP5).on(S0_CST.bp_grp_cd5.eq(S0_CST_GRP5.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP5.value()).eq(S0_CST_GRP5.bp_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_CST_GRP5.bp_grp_nm.like(bind("cst_grp_nm5")))),
				when(boundOr("cst_grp_flg6"))
					.select(DS0D, S0_CST.bp_grp_cd6.as("cst_grp_cd6"))
					.groupBy(DS0D, S0_CST.bp_grp_cd6),
				when(boundOr("cst_grp_flg6", "cst_grp_cd6"))
					.predicate(DS0D, p -> p.cutoff$and(S0_CST.bp_grp_cd6.like(bind("cst_grp_cd6")))),
				when(boundOr("cst_grp_flg6"))
					.select(DS0D, S0_CST_GRP6.bp_grp_nm.as("cst_grp_nm6"))
					.groupBy(DS0D, S0_CST_GRP6.bp_grp_nm),
				when(boundOr("cst_grp_flg6", "cst_grp_nm6"))
					.view(DS0D, v -> v.leftOuterJoin(S0_CST_GRP6).on(S0_CST.bp_grp_cd6.eq(S0_CST_GRP6.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP6.value()).eq(S0_CST_GRP6.bp_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_CST_GRP6.bp_grp_nm.like(bind("cst_grp_nm6")))),
				when(boundOr("cst_grp_flg7"))
					.select(DS0D, S0_CST.bp_grp_cd7.as("cst_grp_cd7"))
					.groupBy(DS0D, S0_CST.bp_grp_cd7),
				when(boundOr("cst_grp_flg7", "cst_grp_cd7"))
					.predicate(DS0D, p -> p.cutoff$and(S0_CST.bp_grp_cd7.like(bind("cst_grp_cd7")))),
				when(boundOr("cst_grp_flg7"))
					.select(DS0D, S0_CST_GRP7.bp_grp_nm.as("cst_grp_nm7"))
					.groupBy(DS0D, S0_CST_GRP7.bp_grp_nm),
				when(boundOr("cst_grp_flg7", "cst_grp_nm7"))
					.view(DS0D, v -> v.leftOuterJoin(S0_CST_GRP7).on(S0_CST.bp_grp_cd7.eq(S0_CST_GRP7.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP7.value()).eq(S0_CST_GRP7.bp_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_CST_GRP7.bp_grp_nm.like(bind("cst_grp_nm7")))),
				when(boundOr("cst_grp_flg8"))
					.select(DS0D, S0_CST.bp_grp_cd8.as("cst_grp_cd8"))
					.groupBy(DS0D, S0_CST.bp_grp_cd8),
				when(boundOr("cst_grp_flg8", "cst_grp_cd8"))
					.predicate(DS0D, p -> p.cutoff$and(S0_CST.bp_grp_cd8.like(bind("cst_grp_cd8")))),
				when(boundOr("cst_grp_flg8"))
					.select(DS0D, S0_CST_GRP8.bp_grp_nm.as("cst_grp_nm8"))
					.groupBy(DS0D, S0_CST_GRP8.bp_grp_nm),
				when(boundOr("cst_grp_flg8", "cst_grp_nm8"))
					.view(DS0D, v -> v.leftOuterJoin(S0_CST_GRP8).on(S0_CST.bp_grp_cd8.eq(S0_CST_GRP8.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP8.value()).eq(S0_CST_GRP8.bp_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_CST_GRP8.bp_grp_nm.like(bind("cst_grp_nm8")))),
				when(boundOr("cst_grp_flg9"))
					.select(DS0D, S0_CST.bp_grp_cd9.as("cst_grp_cd9"))
					.groupBy(DS0D, S0_CST.bp_grp_cd9),
				when(boundOr("cst_grp_flg9", "cst_grp_cd9"))
					.predicate(DS0D, p -> p.cutoff$and(S0_CST.bp_grp_cd9.like(bind("cst_grp_cd9")))),
				when(boundOr("cst_grp_flg9"))
					.select(DS0D, S0_CST_GRP9.bp_grp_nm.as("cst_grp_nm9"))
					.groupBy(DS0D, S0_CST_GRP9.bp_grp_nm),
				when(boundOr("cst_grp_flg9", "cst_grp_nm9"))
					.view(DS0D, v -> v.leftOuterJoin(S0_CST_GRP9).on(S0_CST.bp_grp_cd9.eq(S0_CST_GRP9.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP9.value()).eq(S0_CST_GRP9.bp_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_CST_GRP9.bp_grp_nm.like(bind("cst_grp_nm9")))),
				when(boundOr("cst_grp_flg10"))
					.select(DS0D, S0_CST.bp_grp_cd10.as("cst_grp_cd10"))
					.groupBy(DS0D, S0_CST.bp_grp_cd10),
				when(boundOr("cst_grp_flg10", "cst_grp_cd10"))
					.predicate(DS0D, p -> p.cutoff$and(S0_CST.bp_grp_cd10.like(bind("cst_grp_cd10")))),
				when(boundOr("cst_grp_flg10"))
					.select(DS0D, S0_CST_GRP10.bp_grp_nm.as("cst_grp_nm10"))
					.groupBy(DS0D, S0_CST_GRP10.bp_grp_nm),
				when(boundOr("cst_grp_flg10", "cst_grp_nm10"))
					.view(DS0D, v -> v.leftOuterJoin(S0_CST_GRP10).on(S0_CST.bp_grp_cd10.eq(S0_CST_GRP10.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP10.value()).eq(S0_CST_GRP10.bp_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_CST_GRP10.bp_grp_nm.like(bind("cst_grp_nm10")))),
				when(boundOr("prsppl_nm", "prsppl_grp_flg1", "prsppl_grp_flg2", "prsppl_grp_flg3", "prsppl_grp_flg4", "prsppl_grp_flg5", "prsppl_grp_flg6", "prsppl_grp_flg7", "prsppl_grp_flg8", "prsppl_grp_flg9", "prsppl_grp_flg10"))
					.view(DS0D, v -> v.leftOuterJoin(S0_PRSPPL).on(S0_PRSPPL.bp_cd.eq(S0_ARR_LOC.sppl_cd)))
					.predicate(DS0D, p -> p.cutoff$and(S0_PRSPPL.bp_nm.like(bind("prsppl_nm")))),
				when(boundOr("prsppl_grp_flg1"))
					.select(DS0D, S0_PRSPPL.bp_grp_cd1.as("prsppl_grp_cd1"))
					.groupBy(DS0D, S0_PRSPPL.bp_grp_cd1),
				when(boundOr("prsppl_grp_flg1", "prsppl_grp_cd1"))
					.predicate(DS0D, p -> p.cutoff$and(S0_PRSPPL.bp_grp_cd1.like(bind("prsppl_grp_cd1")))),
				when(boundOr("prsppl_grp_flg1"))
					.select(DS0D, S0_PRSPPL_GRP1.bp_grp_nm.as("prsppl_grp_nm1"))
					.groupBy(DS0D, S0_PRSPPL_GRP1.bp_grp_nm),
				when(boundOr("prsppl_grp_flg1", "prsppl_grp_nm1"))
					.view(DS0D, v -> v.leftOuterJoin(S0_PRSPPL_GRP1).on(S0_PRSPPL.bp_grp_cd1.eq(S0_PRSPPL_GRP1.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP1.value()).eq(S0_PRSPPL_GRP1.bp_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_PRSPPL_GRP1.bp_grp_nm.like(bind("prsppl_grp_nm1")))),
				when(boundOr("prsppl_grp_flg2"))
					.select(DS0D, S0_PRSPPL.bp_grp_cd2.as("prsppl_grp_cd2"))
					.groupBy(DS0D, S0_PRSPPL.bp_grp_cd2),
				when(boundOr("prsppl_grp_flg2", "prsppl_grp_cd2"))
					.predicate(DS0D, p -> p.cutoff$and(S0_PRSPPL.bp_grp_cd2.like(bind("prsppl_grp_cd2")))),
				when(boundOr("prsppl_grp_flg2"))
					.select(DS0D, S0_PRSPPL_GRP2.bp_grp_nm.as("prsppl_grp_nm2"))
					.groupBy(DS0D, S0_PRSPPL_GRP2.bp_grp_nm),
				when(boundOr("prsppl_grp_flg2", "prsppl_grp_nm2"))
					.view(DS0D, v -> v.leftOuterJoin(S0_PRSPPL_GRP2).on(S0_PRSPPL.bp_grp_cd2.eq(S0_PRSPPL_GRP2.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP2.value()).eq(S0_PRSPPL_GRP2.bp_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_PRSPPL_GRP2.bp_grp_nm.like(bind("prsppl_grp_nm2")))),
				when(boundOr("prsppl_grp_flg3"))
					.select(DS0D, S0_PRSPPL.bp_grp_cd3.as("prsppl_grp_cd3"))
					.groupBy(DS0D, S0_PRSPPL.bp_grp_cd3),
				when(boundOr("prsppl_grp_flg3", "prsppl_grp_cd3"))
					.predicate(DS0D, p -> p.cutoff$and(S0_PRSPPL.bp_grp_cd3.like(bind("prsppl_grp_cd3")))),
				when(boundOr("prsppl_grp_flg3"))
					.select(DS0D, S0_PRSPPL_GRP3.bp_grp_nm.as("prsppl_grp_nm3"))
					.groupBy(DS0D, S0_PRSPPL_GRP3.bp_grp_nm),
				when(boundOr("prsppl_grp_flg3", "prsppl_grp_nm3"))
					.view(DS0D, v -> v.leftOuterJoin(S0_PRSPPL_GRP3).on(S0_PRSPPL.bp_grp_cd3.eq(S0_PRSPPL_GRP3.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP3.value()).eq(S0_PRSPPL_GRP3.bp_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_PRSPPL_GRP3.bp_grp_nm.like(bind("prsppl_grp_nm3")))),
				when(boundOr("prsppl_grp_flg4"))
					.select(DS0D, S0_PRSPPL.bp_grp_cd4.as("prsppl_grp_cd4"))
					.groupBy(DS0D, S0_PRSPPL.bp_grp_cd4),
				when(boundOr("prsppl_grp_flg4", "prsppl_grp_cd4"))
					.predicate(DS0D, p -> p.cutoff$and(S0_PRSPPL.bp_grp_cd4.like(bind("prsppl_grp_cd4")))),
				when(boundOr("prsppl_grp_flg4"))
					.select(DS0D, S0_PRSPPL_GRP4.bp_grp_nm.as("prsppl_grp_nm4"))
					.groupBy(DS0D, S0_PRSPPL_GRP4.bp_grp_nm),
				when(boundOr("prsppl_grp_flg4", "prsppl_grp_nm4"))
					.view(DS0D, v -> v.leftOuterJoin(S0_PRSPPL_GRP4).on(S0_PRSPPL.bp_grp_cd4.eq(S0_PRSPPL_GRP4.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP4.value()).eq(S0_PRSPPL_GRP4.bp_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_PRSPPL_GRP4.bp_grp_nm.like(bind("prsppl_grp_nm4")))),
				when(boundOr("prsppl_grp_flg5"))
					.select(DS0D, S0_PRSPPL.bp_grp_cd5.as("prsppl_grp_cd5"))
					.groupBy(DS0D, S0_PRSPPL.bp_grp_cd5),
				when(boundOr("prsppl_grp_flg5", "prsppl_grp_cd5"))
					.predicate(DS0D, p -> p.cutoff$and(S0_PRSPPL.bp_grp_cd5.like(bind("prsppl_grp_cd5")))),
				when(boundOr("prsppl_grp_flg5"))
					.select(DS0D, S0_PRSPPL_GRP5.bp_grp_nm.as("prsppl_grp_nm5"))
					.groupBy(DS0D, S0_PRSPPL_GRP5.bp_grp_nm),
				when(boundOr("prsppl_grp_flg5", "prsppl_grp_nm5"))
					.view(DS0D, v -> v.leftOuterJoin(S0_PRSPPL_GRP5).on(S0_PRSPPL.bp_grp_cd5.eq(S0_PRSPPL_GRP5.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP5.value()).eq(S0_PRSPPL_GRP5.bp_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_PRSPPL_GRP5.bp_grp_nm.like(bind("prsppl_grp_nm5")))),
				when(boundOr("prsppl_grp_flg6"))
					.select(DS0D, S0_PRSPPL.bp_grp_cd6.as("prsppl_grp_cd6"))
					.groupBy(DS0D, S0_PRSPPL.bp_grp_cd6),
				when(boundOr("prsppl_grp_flg6", "prsppl_grp_cd6"))
					.predicate(DS0D, p -> p.cutoff$and(S0_PRSPPL.bp_grp_cd6.like(bind("prsppl_grp_cd6")))),
				when(boundOr("prsppl_grp_flg6"))
					.select(DS0D, S0_PRSPPL_GRP6.bp_grp_nm.as("prsppl_grp_nm6"))
					.groupBy(DS0D, S0_PRSPPL_GRP6.bp_grp_nm),
				when(boundOr("prsppl_grp_flg6", "prsppl_grp_nm6"))
					.view(DS0D, v -> v.leftOuterJoin(S0_PRSPPL_GRP6).on(S0_PRSPPL.bp_grp_cd6.eq(S0_PRSPPL_GRP6.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP6.value()).eq(S0_PRSPPL_GRP6.bp_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_PRSPPL_GRP6.bp_grp_nm.like(bind("prsppl_grp_nm6")))),
				when(boundOr("prsppl_grp_flg7"))
					.select(DS0D, S0_PRSPPL.bp_grp_cd7.as("prsppl_grp_cd7"))
					.groupBy(DS0D, S0_PRSPPL.bp_grp_cd7),
				when(boundOr("prsppl_grp_flg7", "prsppl_grp_cd7"))
					.predicate(DS0D, p -> p.cutoff$and(S0_PRSPPL.bp_grp_cd7.like(bind("prsppl_grp_cd7")))),
				when(boundOr("prsppl_grp_flg7"))
					.select(DS0D, S0_PRSPPL_GRP7.bp_grp_nm.as("prsppl_grp_nm7"))
					.groupBy(DS0D, S0_PRSPPL_GRP7.bp_grp_nm),
				when(boundOr("prsppl_grp_flg7", "prsppl_grp_nm7"))
					.view(DS0D, v -> v.leftOuterJoin(S0_PRSPPL_GRP7).on(S0_PRSPPL.bp_grp_cd7.eq(S0_PRSPPL_GRP7.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP7.value()).eq(S0_PRSPPL_GRP7.bp_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_PRSPPL_GRP7.bp_grp_nm.like(bind("prsppl_grp_nm7")))),
				when(boundOr("prsppl_grp_flg8"))
					.select(DS0D, S0_PRSPPL.bp_grp_cd8.as("prsppl_grp_cd8"))
					.groupBy(DS0D, S0_PRSPPL.bp_grp_cd8),
				when(boundOr("prsppl_grp_flg8", "prsppl_grp_cd8"))
					.predicate(DS0D, p -> p.cutoff$and(S0_PRSPPL.bp_grp_cd8.like(bind("prsppl_grp_cd8")))),
				when(boundOr("prsppl_grp_flg8"))
					.select(DS0D, S0_PRSPPL_GRP8.bp_grp_nm.as("prsppl_grp_nm8"))
					.groupBy(DS0D, S0_PRSPPL_GRP8.bp_grp_nm),
				when(boundOr("prsppl_grp_flg8", "prsppl_grp_nm8"))
					.view(DS0D, v -> v.leftOuterJoin(S0_PRSPPL_GRP8).on(S0_PRSPPL.bp_grp_cd8.eq(S0_PRSPPL_GRP8.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP8.value()).eq(S0_PRSPPL_GRP8.bp_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_PRSPPL_GRP8.bp_grp_nm.like(bind("prsppl_grp_nm8")))),
				when(boundOr("prsppl_grp_flg9"))
					.select(DS0D, S0_PRSPPL.bp_grp_cd9.as("prsppl_grp_cd9"))
					.groupBy(DS0D, S0_PRSPPL.bp_grp_cd9),
				when(boundOr("prsppl_grp_flg9", "prsppl_grp_cd9"))
					.predicate(DS0D, p -> p.cutoff$and(S0_PRSPPL.bp_grp_cd9.like(bind("prsppl_grp_cd9")))),
				when(boundOr("prsppl_grp_flg9"))
					.select(DS0D, S0_PRSPPL_GRP9.bp_grp_nm.as("prsppl_grp_nm9"))
					.groupBy(DS0D, S0_PRSPPL_GRP9.bp_grp_nm),
				when(boundOr("prsppl_grp_flg9", "prsppl_grp_nm9"))
					.view(DS0D, v -> v.leftOuterJoin(S0_PRSPPL_GRP9).on(S0_PRSPPL.bp_grp_cd9.eq(S0_PRSPPL_GRP9.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP9.value()).eq(S0_PRSPPL_GRP9.bp_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_PRSPPL_GRP9.bp_grp_nm.like(bind("prsppl_grp_nm9")))),
				when(boundOr("prsppl_grp_flg10"))
					.select(DS0D, S0_PRSPPL.bp_grp_cd10.as("prsppl_grp_cd10"))
					.groupBy(DS0D, S0_PRSPPL.bp_grp_cd10),
				when(boundOr("prsppl_grp_flg10", "prsppl_grp_cd10"))
					.predicate(DS0D, p -> p.cutoff$and(S0_PRSPPL.bp_grp_cd10.like(bind("prsppl_grp_cd10")))),
				when(boundOr("prsppl_grp_flg10"))
					.select(DS0D, S0_PRSPPL_GRP10.bp_grp_nm.as("prsppl_grp_nm10"))
					.groupBy(DS0D, S0_PRSPPL_GRP10.bp_grp_nm),
				when(boundOr("prsppl_grp_flg10", "prsppl_grp_nm10"))
					.view(DS0D, v -> v.leftOuterJoin(S0_PRSPPL_GRP10).on(S0_PRSPPL.bp_grp_cd10.eq(S0_PRSPPL_GRP10.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP10.value()).eq(S0_PRSPPL_GRP10.bp_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_PRSPPL_GRP10.bp_grp_nm.like(bind("prsppl_grp_nm10")))),
				when(boundOr("itm_nm", "itm_typ", "itm_typ_d_cd", "itm_typ_d_nm", "itm_grp_flg1", "itm_grp_flg2", "itm_grp_flg3", "itm_grp_flg4", "itm_grp_flg5", "itm_grp_flg6", "itm_grp_flg7", "itm_grp_flg8", "itm_grp_flg9", "itm_grp_flg10"))
					.view(DS0D, v -> v.leftOuterJoin(S0_ITM).on(S0_ITM.itm_cd.eq(S0_V1.pr(S1_T1.itm_cd)).and(S0_ITM.itm_sub1.eq(S0_V1.pr(S1_T1.itm_sub1))).and(S0_ITM.itm_sub2.eq(S0_V1.pr(S1_T1.itm_sub2))).and(S0_ITM.itm_sub3.eq(S0_V1.pr(S1_T1.itm_sub3)))).leftOuterJoin(S0_SUNDRY_ITM).on(S0_SUNDRY_ITM.itm_cd.eq(S0_V1.pr(S1_T1.itm_cd)).and(S0_SUNDRY_ITM.itm_sub1.eq(S0_V1.pr(S1_T1.itm_sub1))).and(S0_SUNDRY_ITM.itm_sub2.eq(S0_V1.pr(S1_T1.itm_sub2))).and(S0_SUNDRY_ITM.itm_sub3.eq(S0_V1.pr(S1_T1.itm_sub3))).and(S0_SUNDRY_ITM.sno1.eq(S0_V1.pr(S1_T1.sno1))).and(S0_SUNDRY_ITM.sno2.eq(S0_V1.pr(S1_T1.sno2))).and(S0_SUNDRY_ITM.sno3.eq(S0_V1.pr(S1_T1.sno3))).and(S0_SUNDRY_ITM.sno4.eq(S0_V1.pr(S1_T1.sno4)))))
					.predicate(DS0D, p -> p.cutoff$and(decode(S0_V1.pr(S1_T1.sundry_itm_flg),value(true),nvl(S0_V1.pr(S1_T1.itm_nm),S0_SUNDRY_ITM.itm_nm),S0_ITM.itm_nm).like(bind("itm_nm")))),
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
				when(boundOr("trd_nm"))
					.view(DS0D, v -> v.leftOuterJoin(S0_TRD).on(S0_TRD.trd_cd.eq(S0_V1.pr(S1_T2.trd_cd))))
					.predicate(DS0D, p -> p.cutoff$and(S0_TRD.trd_nm.like(bind("trd_nm")))),
				when(boundOr("rcpt_iv_itm_nm"))
					.view(DS0D, v -> v.leftOuterJoin(S0_RCPT_ITM).on(S0_RCPT_ITM.itm_cd.eq(S0_V1.pr(S1_T1.itm_cd)).and(S0_RCPT_ITM.itm_sub1.eq(S0_V1.pr(S1_T1.itm_sub1))).and(S0_RCPT_ITM.itm_sub2.eq(S0_V1.pr(S1_T1.itm_sub2))).and(S0_RCPT_ITM.itm_sub3.eq(S0_V1.pr(S1_T1.itm_sub3))).and(S0_RCPT_ITM.lcl_cd.eq(S0_SPPL.prnt_lcl_cd)).cutoff$and(S0_RCPT_ITM.itm_nm.like(bind("rcpt_iv_itm_nm")))))
					.predicate(DS0D, p -> p.cutoff$and(decode(S0_V1.pr(S1_T1.sundry_itm_flg),value(true),S0_V1.pr(S1_T1.rcpt_iv_itm_nm),S0_RCPT_ITM.itm_nm).like(bind("rcpt_iv_itm_nm")))),
				when(boundOr("itm_typ"))
					.predicate(DS0D, p -> p.cutoff$and(S0_ITM.itm_typ.like(bind("itm_typ")))),
				when(boundOr("itm_typ_d_cd"))
					.predicate(DS0D, p -> p.cutoff$and(S0_ITM.itm_typ_d_cd.like(bind("itm_typ_d_cd")))),
				when(boundOr("itm_typ_d_nm"))
					.view(DS0D, v -> v.leftOuterJoin(S0_ITM_TYP_D).on(S0_ITM_TYP_D.itm_typ.eq(S0_ITM.itm_typ).and(S0_ITM_TYP_D.itm_typ_d_cd.eq(S0_ITM.itm_typ_d_cd))))
					.predicate(DS0D, p -> p.cutoff$and(S0_ITM_TYP_D.itm_typ_d_nm.like(bind("itm_typ_d_nm")))),
				when(boundOr("rqst_dpt_nm"))
					.view(DS0D, v -> v.leftOuterJoin(S0_DPT).on(S0_DPT.dpt_cd.eq(S0_V1.pr(S1_T2.rqst_dpt_cd)).and(bind("today").between(S0_DPT.st_dt, S0_DPT.end_dt))))
					.predicate(DS0D, p -> p.cutoff$and(S0_DPT.dpt_nm.like(bind("rqst_dpt_nm")))),
				when(boundOr("rqst_usr_nm"))
					.view(DS0D, v -> v.leftOuterJoin(S0_RQST_USR).on(S0_RQST_USR.usr_cd.eq(S0_V1.pr(S1_T2.rqst_usr_cd))))
					.predicate(DS0D, p -> p.cutoff$and(S0_RQST_USR.usr_nm.like(bind("rqst_usr_nm")))),
				when(boundOr("arr_wg_nm"))
					.view(DS0D, v -> v.leftOuterJoin(S0_ARR_WG).on(S0_ARR_WG.wg_cd.eq(S0_ARR_LOC.wg_cd)))
					.predicate(DS0D, p -> p.cutoff$and(S0_ARR_WG.wg_nm.like(bind("arr_wg_nm")))),
				when(boundOr("arr_lg_grp_nm"))
					.view(DS0D, v -> v.leftOuterJoin(S0_ARR_LG_GRP).on(S0_ARR_LG_GRP.lg_grp_cd.eq(S0_ARR_LOC.lg_grp_cd)))
					.predicate(DS0D, p -> p.cutoff$and(S0_ARR_LG_GRP.lg_grp_nm.like(bind("arr_lg_grp_nm")))),
				when(boundOr("arr_site_nm"))
					.view(DS0D, v -> v.leftOuterJoin(S0_ARR_SITE).on(S0_ARR_SITE.site_cd.eq(S0_ARR_LOC.site_cd)))
					.predicate(DS0D, p -> p.cutoff$and(S0_ARR_SITE.site_nm.like(bind("arr_site_nm")))),
				when(boundOr("arr_alloc_grp_nm"))
					.view(DS0D, v -> v.leftOuterJoin(S0_ARR_ALLRC_GRP).on(S0_ARR_ALLRC_GRP.alloc_grp_cd.eq(S0_ARR_LOC.alloc_grp_cd)))
					.predicate(DS0D, p -> p.cutoff$and(S0_ARR_ALLRC_GRP.alloc_grp_nm.like(bind("arr_alloc_grp_nm")))),
				when(boundOr("arr_str_ln_nm"))
					.view(DS0D, v -> v.leftOuterJoin(S0_ARR_STR_LN).on(S0_ARR_STR_LN.loc_cd.eq(S0_V1.pr("arr_loc_cd")).and(S0_ARR_STR_LN.str_ln_cd.eq(S0_V1.pr("arr_str_ln_cd")))))
					.predicate(DS0D, p -> p.cutoff$and(S0_ARR_STR_LN.str_ln_nm.like(bind("arr_str_ln_nm")))),
				when(boundOr("wrk_no", "wrk_nm"))
					.view(DS0D, v -> v.leftOuterJoin(S0_WRK_SNO).on(S0_WRK_SNO.sno1.eq(S0_V1.pr(S1_T1.sno1))))
					.predicate(DS0D, p -> p.cutoff$and(S0_WRK_SNO.wrk_no.like(bind("wrk_no"))).cutoff$and(S0_WRK_SNO.wrk_nm.like(bind("wrk_nm")))),
				when(boundOr("maker_nm"))
					.view(DS0D, v -> v.leftOuterJoin(S0_MAKER).on(S0_MAKER.bp_cd.eq(S0_V1.pr(S1_T1.maker_cd))))
					.predicate(DS0D, p -> p.cutoff$and(S0_MAKER.bp_nm.like(bind("maker_nm")))),
				when(boundOr("arr_dpt_nm"))
					.view(DS0D, v -> v.leftOuterJoin(S0_ARR_DPT).on(S0_ARR_DPT.dpt_cd.eq(S0_V1.pr("arr_dpt_cd")).and(bind("today").between(S0_ARR_DPT.st_dt, S0_ARR_DPT.end_dt))))
					.predicate(DS0D, p -> p.cutoff$and(S0_ARR_DPT.dpt_nm.like(bind("arr_dpt_nm")))),
				when(boundOr("arr_usr_nm"))
					.view(DS0D, v -> v.leftOuterJoin(S0_ARR_USR).on(S0_ARR_USR.usr_cd.eq(S0_V1.pr("arr_usr_cd"))))
					.predicate(DS0D, p -> p.cutoff$and(S0_ARR_USR.usr_nm.like(bind("arr_usr_nm")))),
				when(boundOr("purc_rqst_wg_cd", "purc_rqst_wg_nm", "po_schd_src_typ", "po_schd_src_no"))
					.view(DS0D, v -> v.leftOuterJoin(S0_PO_SCHD).on(S0_PO_SCHD.po_schd_no.eq(S0_V1.pr("po_schd_no"))))
					.predicate(DS0D, p -> p.cutoff$and(S0_PO_SCHD.rqst_wg_cd.eq(bind("purc_rqst_wg_cd"))).cutoff$and(S0_PO_SCHD.po_schd_src_typ.like(bind("po_schd_src_typ"))).cutoff$and(S0_PO_SCHD.po_schd_src_no.like(bind("po_schd_src_no"))).cutoff$and(S0_PO_SCHD.po_schd_no.like(bind("po_schd_no")))),
				when(boundOr("purc_rqst_wg_nm"))
					.view(DS0D, v -> v.leftOuterJoin(S0_PURC_RQST_WG).on(S0_PURC_RQST_WG.wg_cd.eq(S0_PO_SCHD.rqst_wg_cd)))
					.predicate(DS0D, p -> p.cutoff$and(S0_PURC_RQST_WG.wg_nm.like(bind("purc_rqst_wg_nm")))),
				when(boundOr("dlv_inst_no", "dlv_inst_print_d_rmrks"))
					.view(DS0D, v -> v.leftOuterJoin(S0_DLV_INST_D).on(S0_DLV_INST_D.dlv_inst_d_no.eq(S0_V1.pr(S1_T1.dlv_inst_d_no))))
					.predicate(DS0D, p -> p.cutoff$and(S0_DLV_INST_D.dlv_inst_no.like(bind("dlv_inst_no"))).cutoff$and(S0_DLV_INST_D.dlv_inst_print_d_rmrks.like(bind("dlv_inst_print_d_rmrks")))),
				when(boundOr("prms_rcpt_no", "prms_rmrks"))
					.view(DS0D, v -> v.leftOuterJoin(S0_PRMS_RCPT_D).on(S0_PRMS_RCPT_D.prms_rcpt_d_no.eq(S0_V1.pr(S1_T1.prms_rcpt_d_no))))
					.predicate(DS0D, p -> p.cutoff$and(S0_PRMS_RCPT_D.prms_rcpt_no.like(bind("prms_rcpt_no"))).cutoff$and(S0_PRMS_RCPT_D.prms_rmrks.like(bind("prms_rmrks")))),
				when(boundOr("ship_act_no", "ship_lg_grp_cd", "ship_lg_grp_nm", "ship_wg_cd", "ship_wg_nm"))
					.view(DS0D, v -> v.leftOuterJoin(S0_DLV_SLIP).on(S0_DLV_SLIP.dlv_slip_no.eq(S0_V1.pr(S1_T1.dlv_slip_no)).and(S0_DLV_SLIP.slip_sts_typ.eq(value(MAC_SLIP_STS_TYP.CRT.value()))).and(S0_V1.pr(S1_T1.dlv_slip_mng_no).isNull())))
					.predicate(DS0D, p -> p.cutoff$and(S0_DLV_SLIP.dlv_slip_act_no.like(bind("ship_act_no")))),
				when(boundOr("ship_lg_grp_cd"))
					.predicate(DS0D, p -> p.cutoff$and(S0_DLV_SLIP.ship_fr_lg_grp_cd.like(bind("ship_lg_grp_cd")))),
				when(boundOr("ship_lg_grp_nm"))
					.view(DS0D, v -> v.leftOuterJoin(S0_SHIP_LG_GRP).on(S0_SHIP_LG_GRP.lg_grp_cd.eq(S0_DLV_SLIP.ship_fr_lg_grp_cd)))
					.predicate(DS0D, p -> p.cutoff$and(S0_SHIP_LG_GRP.lg_grp_nm.like(bind("ship_lg_grp_nm")))),
				when(boundOr("ship_wg_cd"))
					.predicate(DS0D, p -> p.cutoff$and(S0_DLV_SLIP.wg_cd.like(bind("ship_wg_cd")))),
				when(boundOr("ship_wg_nm"))
					.view(DS0D, v -> v.leftOuterJoin(S0_SHIP_WG).on(S0_SHIP_WG.wg_cd.eq(S0_DLV_SLIP.wg_cd)))
					.predicate(DS0D, p -> p.cutoff$and(S0_SHIP_WG.wg_nm.like(bind("ship_wg_nm")))),
				when(boundOr("sls_ret_schd_no"))
					.predicate(DS0D, p -> p.cutoff$and(S0_SRET_SCHD_D.sls_ret_schd_no.like(bind("sls_ret_schd_no")))),
				when(boundOr("cst_po_no"))
					.view(DS0D, v -> v.leftOuterJoin(S0_SRET_SCHD).on(S0_SRET_SCHD.sls_ret_schd_no.eq(S0_SRET_SCHD_D.sls_ret_schd_no)))
					.predicate(DS0D, p -> p.cutoff$and(S0_SRET_SCHD.cst_po_no.like(bind("cst_po_no")))),
				when(boundOr("cst_itm_cd"))
					.predicate(DS0D, p -> p.cutoff$and(S0_SRET_SCHD_D.cst_itm_cd.like(bind("cst_itm_cd")))),
				when(boundOr("cst_itm_nm"))
					.predicate(DS0D, p -> p.cutoff$and(S0_SRET_SCHD_D.cst_itm_nm.like(bind("cst_itm_nm"))))
			);
	}
	
	static MCJoinerList<ArrAct_RsltR> MSBEL5930_ArrAct_RsltR_J01() {
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
					m.std_cont_fctr,
					m.stk_mng_typ,
					m.sublot_mng_typ,
					m.sublot_no_typ,
					m.sundry_itm_flg,
					m.ver_flg
				))
				.addMap((r, m) -> {
					r.itm_nm_itm(m.itm_nm());
					r.itm_typ(m.itm_typ());
					r.itm_typ_d_cd(m.itm_typ_d_cd());
					r.stk_mng_typ(m.stk_mng_typ());
					r.asset_mng_typ(m.asset_mng_typ());
					r.sundry_itm_flg(m.sundry_itm_flg());
					r.dscnt_itm_flg(m.dscnt_itm_flg());
					r.ver_flg(m.ver_flg());
					r.lot_mng_typ(m.lot_mng_typ());
					r.lot_no_typ(m.lot_no_typ());
					r.sublot_mng_typ(m.sublot_mng_typ());
					r.sublot_no_typ(m.sublot_no_typ());
					r.bp_lot_flg(m.bp_lot_flg());
					r.cont_fctr_flg(m.cont_fctr_flg());
					r.std_cont_fctr(m.std_cont_fctr());
					r.cont_fctr_unit_cd(m.cont_fctr_unit_cd());
					r.cont_fctr_dec_place(m.cont_fctr_dec_place());
					r.cont_fctr_rnd_typ(m.cont_fctr_rnd_typ());
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
				.add(MAM_SUNDRY_ITM_R.class, r -> toCondition(
					r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3(), r.sno1(), r.sno2(), r.sno3(), r.sno4()
				))
				.addSelect(m -> toArray(
					m.itm_nm
				))
				.addMap((r, m) -> {
					r.itm_nm_sundry(m.itm_nm());
				}),
			j -> j
				.add(MAM_DPT_R.class, r -> toCondition(
					r.rqst_dpt_cd(), r.master_dt()
				))
				.addSelect(m -> toArray(
					m.dpt_nm,
					m.wg_cd
				))
				.addMap((r, m) -> {
					r.rqst_dpt_nm(m.dpt_nm());
					r.rqst_wg_cd(m.wg_cd());
					r.setStringNE("join_wg_cd_", m.wg_cd());
				}),
			j -> j
				.add(MAM_WG_R.class, r -> toCondition(
					r.getStringNE("join_wg_cd_")
				))
				.addSelect(m -> toArray(
					m.wg_nm
				))
				.addMap((r, m) -> {
					r.rqst_wg_nm(m.wg_nm());
				}),
			j -> j
				.add(MAM_USR_R.class, r -> toCondition(
					r.rqst_usr_cd()
				))
				.addSelect(m -> toArray(
					m.usr_nm
				))
				.addMap((r, m) -> {
					r.rqst_usr_nm(m.usr_nm());
				}),
			j -> j
				.add(MAM_BP_R.class, r -> toCondition(
					r.cst_cd()
				))
				.addSelect(m -> toArray(
					m.bp_nm,
					m.cst_iv_flg
				))
				.addMap((r, m) -> {
					r.cst_nm(m.bp_nm());
					r.cst_iv_flg(m.cst_iv_flg());
				}),
			j -> j
				.add(MST_SLS_RET_SCHD_D_R.class, r -> toCondition(
					r.sls_ret_schd_d_no()
				))
				.addSelect(m -> toArray(
					m.cst_itm_cd,
					m.cst_itm_nm,
					m.sls_ret_schd_no,
					m.sret_fr_cd
				))
				.addMap((r, m) -> {
					if (!isNull(r.sret_fr_cd()) && isNull(m.sret_fr_cd())) {
						// SQLで取得しており、JoinUtilityで取得できない場合は何もしない
					}
					else {
						r.sret_fr_cd(m.sret_fr_cd());
					}
					r.sls_ret_schd_no(m.sls_ret_schd_no());
					r.cst_itm_cd(m.cst_itm_cd());
					r.cst_itm_nm(m.cst_itm_nm());
					r.setStringNE("join_sls_ret_schd_no_", m.sls_ret_schd_no());
				}),
			j -> j
				.add(MST_SLS_RET_SCHD_R.class, r -> toCondition(
					r.getStringNE("join_sls_ret_schd_no_")
				))
				.addSelect(m -> toArray(
					m.cst_po_no
				))
				.addMap((r, m) -> {
					r.cst_po_no(m.cst_po_no());
				}),
			j -> j
				.add(MAM_BP_R.class, r -> toCondition(
					r.sret_fr_cd()
				))
				.addSelect(m -> toArray(
					m.bp_nm
				))
				.addMap((r, m) -> {
					r.sret_fr_nm(m.bp_nm());
				}),
			j -> j
				.add(MAM_BP_R.class, r -> toCondition(
					r.sppl_cd()
				))
				.addSelect(m -> toArray(
					m.bp_nm,
					m.sppl_iv_flg,
					m.subcon_flg
				))
				.addMap((r, m) -> {
					r.sppl_nm(m.bp_nm());
					r.subcon_flg(m.subcon_flg());
					r.sppl_iv_flg(m.sppl_iv_flg());
				}),
			j -> j
				.add(MAVM_BP_NM_R.class, r -> toCondition(
					r.ret_stk_arrv_bp_cd()
				))
				.addSelect(m -> toArray(
					m.bp_nm
				))
				.addMap((r, m) -> {
					r.ret_stk_arrv_bp_nm(m.bp_nm());
				}),
			j -> j
				.add(MAM_LOC_R.class, r -> toCondition(
					r.ret_loc_cd()
				))
				.addSelect(m -> toArray(
					m.loc_nm,
					m.str_ln_tgt_flg
				))
				.addMap((r, m) -> {
					r.ret_loc_nm(m.loc_nm());
					r.ret_str_ln_tgt_flg(m.str_ln_tgt_flg());
				}),
			j -> j
				.add(MAM_STR_LN_R.class, r -> toCondition(
					r.ret_loc_cd(), r.ret_str_ln_cd()
				))
				.addSelect(m -> toArray(
					m.str_ln_nm
				))
				.addMap((r, m) -> {
					r.ret_str_ln_nm(m.str_ln_nm());
				}),
			j -> j
				.add(MAM_STK_GD_R.class, r -> toCondition(
					r.ret_gd_cd()
				))
				.addSelect(m -> toArray(
					m.gd_nm
				))
				.addMap((r, m) -> {
					r.ret_gd_nm(m.gd_nm());
				}),
			j -> j
				.add(MAM_LOC_R.class, r -> toCondition(
					r.arr_schd_loc_cd()
				))
				.addSelect(m -> toArray(
					m.lg_grp_cd,
					m.loc_nm
				))
				.addMap((r, m) -> {
					if (!isNull(r.arr_schd_lg_grp_cd()) && isNull(m.lg_grp_cd())) {
						// SQLで取得しており、JoinUtilityで取得できない場合は何もしない
					}
					else {
						r.arr_schd_lg_grp_cd(m.lg_grp_cd());
					}
					if (!isNull(r.arr_schd_loc_nm()) && isNull(m.loc_nm())) {
						// SQLで取得しており、JoinUtilityで取得できない場合は何もしない
					}
					else {
						r.arr_schd_loc_nm(m.loc_nm());
					}
					
				}),
			j -> j
				.add(MAM_WG_R.class, r -> toCondition(
					r.arr_wg_cd()
				))
				.addSelect(m -> toArray(
					m.wg_nm
				))
				.addMap((r, m) -> {
					r.arr_wg_nm(m.wg_nm());
				}),
			j -> j
				.add(MAM_LG_GRP_R.class, r -> toCondition(
					r.arr_lg_grp_cd()
				))
				.addSelect(m -> toArray(
					m.lg_grp_nm
				))
				.addMap((r, m) -> {
					r.arr_lg_grp_nm(m.lg_grp_nm());
				}),
			j -> j
				.add(MAM_SITE_R.class, r -> toCondition(
					r.arr_site_cd()
				))
				.addSelect(m -> toArray(
					m.site_nm
				))
				.addMap((r, m) -> {
					r.arr_site_nm(m.site_nm());
				}),
			j -> j
				.add(MAM_LG_GRP_R.class, r -> toCondition(
					r.arr_alloc_grp_cd()
				))
				.addSelect(m -> toArray(
					m.lg_grp_nm
				))
				.addMap((r, m) -> {
					r.arr_alloc_grp_nm(m.lg_grp_nm());
				}),
			j -> j
				.add(MAM_STR_LN_R.class, r -> toCondition(
					r.arr_loc_cd(), r.arr_str_ln_cd()
				))
				.addSelect(m -> toArray(
					m.str_ln_nm
				))
				.addMap((r, m) -> {
					r.arr_str_ln_nm(m.str_ln_nm());
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
					r.trd_unit_conv_base_qty(m.conv_base_qty());
					r.trd_unit_conv_qty(m.conv_qty());
					r.trd_unit_dec_place(m.dec_place());
					r.trd_unit_rnd_typ(m.rnd_typ());
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
				.add(MAM_UNIT_R.class, r -> toCondition(
					r.schd_unit_cd()
				))
				.addSelect(m -> toArray(
					m.unit_nm
				))
				.addMap((r, m) -> {
					r.schd_unit_nm(m.unit_nm());
				}),
			j -> j
				.add(MAVM_ITM_UNIT_R.class, r -> toCondition(
					r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3(), r.schd_unit_cd()
				))
				.addSelect(m -> toArray(
					m.conv_base_qty,
					m.conv_qty,
					m.dec_place,
					m.rnd_typ
				))
				.addMap((r, m) -> {
					r.schd_unit_conv_base_qty(m.conv_base_qty());
					r.schd_unit_conv_qty(m.conv_qty());
					r.schd_unit_dec_place(m.dec_place());
					r.schd_unit_rnd_typ(m.rnd_typ());
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
				.add(MAVM_BP_NM_R.class, r -> toCondition(
					r.stk_arrv_bp_cd()
				))
				.addSelect(m -> toArray(
					m.bp_nm
				))
				.addMap((r, m) -> {
					r.stk_arrv_bp_nm(m.bp_nm());
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
				.add(MAVM_BP_NM_R.class, r -> toCondition(
					r.stk_bp_cd()
				))
				.addSelect(m -> toArray(
					m.bp_nm
				))
				.addMap((r, m) -> {
					r.stk_bp_nm(m.bp_nm());
				}),
			j -> j
				.add(MAM_DPT_R.class, r -> toCondition(
					r.arr_dpt_cd(), r.master_dt()
				))
				.addSelect(m -> toArray(
					m.dpt_nm
				))
				.addMap((r, m) -> {
					r.arr_dpt_nm(m.dpt_nm());
				}),
			j -> j
				.add(MAM_USR_R.class, r -> toCondition(
					r.arr_usr_cd()
				))
				.addSelect(m -> toArray(
					m.usr_nm
				))
				.addMap((r, m) -> {
					r.arr_usr_nm(m.usr_nm());
				}),
			j -> j
				.add(MAM_BIZ_RSN_R.class, r -> toCondition(
					r.rsn_cd()
				))
				.addSelect(m -> toArray(
					m.acxfr_gi_flg,
					m.biz_rsn_nm,
					m.xpns_purc_flg
				))
				.addMap((r, m) -> {
					r.rsn_nm(m.biz_rsn_nm());
					r.acxfr_gi_flg(m.acxfr_gi_flg());
					r.xpns_purc_flg(m.xpns_purc_flg());
				}),
			j -> j
				.add(MAM_DPT_R.class, r -> toCondition(
					r.bd_dpt_cd(), r.master_dt()
				))
				.addSelect(m -> toArray(
					m.dpt_nm
				))
				.addMap((r, m) -> {
					r.bd_dpt_nm(m.dpt_nm());
				}),
			j -> j
				.add(MAM_WG_R.class, r -> toCondition(
					r.bd_wg_cd()
				))
				.addSelect(m -> toArray(
					m.wg_nm
				))
				.addMap((r, m) -> {
					r.bd_wg_nm(m.wg_nm());
				}),
			j -> j
				.add(MAM_ITM_R.class, r -> toCondition(
					r.bd_itm_cd(), r.bd_itm_sub1(), r.bd_itm_sub2(), r.bd_itm_sub3()
				))
				.addSelect(m -> toArray(
					m.itm_nm
				))
				.addMap((r, m) -> {
					r.bd_itm_nm(m.itm_nm());
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
				.add(MAM_LOC_R.class, r -> toCondition(
					r.pa_io_loc_cd()
				))
				.addSelect(m -> toArray(
					m.loc_nm
				))
				.addMap((r, m) -> {
					r.pa_io_loc_nm(m.loc_nm());
				}),
			j -> j
				.add(MAM_STR_LN_R.class, r -> toCondition(
					r.pa_io_loc_cd(), r.pa_io_str_ln_cd()
				))
				.addSelect(m -> toArray(
					m.str_ln_nm
				))
				.addMap((r, m) -> {
					r.pa_io_str_ln_nm(m.str_ln_nm());
				}),
			j -> j
				.add(MAM_UNIT_R.class, r -> toCondition(
					r.pa_io_trd_unit_cd()
				))
				.addSelect(m -> toArray(
					m.unit_nm
				))
				.addMap((r, m) -> {
					r.pa_io_trd_unit_nm(m.unit_nm());
				}),
			j -> j
				.add(MAVM_ITM_UNIT_R.class, r -> toCondition(
					r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3(), r.pa_io_trd_unit_cd()
				))
				.addSelect(m -> toArray(
					m.conv_base_qty,
					m.conv_qty,
					m.dec_place,
					m.rnd_typ
				))
				.addMap((r, m) -> {
					r.pa_io_trd_unit_conv_base_qty(m.conv_base_qty());
					r.pa_io_trd_unit_conv_qty(m.conv_qty());
					r.pa_io_trd_unit_dec_place(m.dec_place());
					r.pa_io_trd_unit_rnd_typ(m.rnd_typ());
				}),
			j -> j
				.add(MAM_LG_GRP_R.class, r -> toCondition(
					r.ship_lg_grp_cd()
				))
				.addSelect(m -> toArray(
					m.lg_grp_nm
				))
				.addMap((r, m) -> {
					r.ship_lg_grp_nm(m.lg_grp_nm());
				}),
			j -> j
				.add(MAM_WG_R.class, r -> toCondition(
					r.ship_wg_cd()
				))
				.addSelect(m -> toArray(
					m.wg_nm
				))
				.addMap((r, m) -> {
					r.ship_wg_nm(m.wg_nm());
				}),
			j -> j
				.add(MAM_EXT_SYS_R.class, r -> toCondition(
					r.ext_sys_cd()
				))
				.addSelect(m -> toArray(
					m.ext_sys_nm
				))
				.addMap((r, m) -> {
					r.ext_sys_nm(m.ext_sys_nm());
				}),
			j -> j
				.add(MAVM_BP_NM_R.class, r -> toCondition(
					r.prsppl_cd()
				))
				.addSelect(m -> toArray(
					m.bp_nm
				))
				.addMap((r, m) -> {
					r.prsppl_nm(m.bp_nm());
				}),
			j -> j
				.add(MST_RCPT_IV_R.class, r -> toCondition(
					r.rcpt_iv_mng_no()
				))
				.addSelect(m -> toArray(
					m.upd_cntr
				))
				.addMap((r, m) -> {
					r.rcpt_iv_upd_cntr(m.upd_cntr());
				})
		);
	}
}