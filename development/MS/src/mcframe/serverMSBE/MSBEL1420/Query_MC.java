package mcframe.serverMSBE.MSBEL1420;

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
	 * -- MSBEL1420_MST_SHIP_SCHD_Query_S01
	 */
	static MCQueryPlan MSBEL1420_MST_SHIP_SCHD_S01() {
		MST_SHIP_SCHD_R S0_T1 = MST_SHIP_SCHD_R.create("T1");
		MST_SHIP_PR_R S0_T2 = MST_SHIP_PR_R.create("T2");
		MST_SLO_D_R S0_T3 = MST_SLO_D_R.create("T3");
		MST_SHIP_INST_D_R S0_T10 = MST_SHIP_INST_D_R.create("T10");
		MSVT_WRK_SNO_R S0_T11 = MSVT_WRK_SNO_R.create("T11");
		MST_SHIP_INST_R S0_T12 = MST_SHIP_INST_R.create("T12");
		MAM_SHIP_TERM_R S0_M1 = MAM_SHIP_TERM_R.create("M1");
		MAM_SHIP_WK_R S0_M2 = MAM_SHIP_WK_R.create("M2");
		MAM_DPT_R S0_M3 = MAM_DPT_R.create("M3");
		MAM_USR_R S0_M4 = MAM_USR_R.create("M4");
		MAM_TRD_R S0_M5 = MAM_TRD_R.create("M5");
		MAM_ITM_R S0_M6 = MAM_ITM_R.create("M6");
		MAM_ALLOC_GRP_R S0_M15 = MAM_ALLOC_GRP_R.create("M15");
		MAM_WG_R S0_M16 = MAM_WG_R.create("M16");
		MAM_BP_R S0_M17 = MAM_BP_R.create("M17");
		MAM_ITM_TYP_D_R S0_M18 = MAM_ITM_TYP_D_R.create("M18");
		MAM_BP_R S0_M21 = MAM_BP_R.create("M21");
		MSVM_DLV_ID_R S0_M31 = MSVM_DLV_ID_R.create("M31");
		MAM_LG_CTL_R S0_M22 = MAM_LG_CTL_R.create("M22");
		MAM_LG_CTL_R S0_M22_1 = MAM_LG_CTL_R.create("M22_1");
		MAM_SHIP_WK_GRP_R S0_M23 = MAM_SHIP_WK_GRP_R.create("M23");
		MAM_LG_CTL_R S0_M221 = MAM_LG_CTL_R.create("M221");
		MAM_LG_CTL_R S0_M221_1 = MAM_LG_CTL_R.create("M221_1");
		MAM_SHIP_WK_GRP_R S0_M231 = MAM_SHIP_WK_GRP_R.create("M231");
		MAM_LG_GRP_R S0_M25 = MAM_LG_GRP_R.create("M25");
		MAVM_ITM_UNIT_R S0_M26 = MAVM_ITM_UNIT_R.create("M26");
		MSVM_SHIP_TO_ID_R S0_M33 = MSVM_SHIP_TO_ID_R.create("M33");
		MAM_SUNDRY_ITM_R S0_M35 = MAM_SUNDRY_ITM_R.create("M35");
		MAM_BP_GRP_R S0_MM21 = MAM_BP_GRP_R.create("MM21");
		MAM_BP_GRP_R S0_MM22 = MAM_BP_GRP_R.create("MM22");
		MAM_BP_GRP_R S0_MM23 = MAM_BP_GRP_R.create("MM23");
		MAM_BP_GRP_R S0_MM24 = MAM_BP_GRP_R.create("MM24");
		MAM_BP_GRP_R S0_MM25 = MAM_BP_GRP_R.create("MM25");
		MAM_BP_GRP_R S0_MM26 = MAM_BP_GRP_R.create("MM26");
		MAM_BP_GRP_R S0_MM27 = MAM_BP_GRP_R.create("MM27");
		MAM_BP_GRP_R S0_MM28 = MAM_BP_GRP_R.create("MM28");
		MAM_BP_GRP_R S0_MM29 = MAM_BP_GRP_R.create("MM29");
		MAM_BP_GRP_R S0_MM210 = MAM_BP_GRP_R.create("MM210");
		MAM_BP_GRP_R S0_MM31 = MAM_BP_GRP_R.create("MM31");
		MAM_BP_GRP_R S0_MM32 = MAM_BP_GRP_R.create("MM32");
		MAM_BP_GRP_R S0_MM33 = MAM_BP_GRP_R.create("MM33");
		MAM_BP_GRP_R S0_MM34 = MAM_BP_GRP_R.create("MM34");
		MAM_BP_GRP_R S0_MM35 = MAM_BP_GRP_R.create("MM35");
		MAM_BP_GRP_R S0_MM36 = MAM_BP_GRP_R.create("MM36");
		MAM_BP_GRP_R S0_MM37 = MAM_BP_GRP_R.create("MM37");
		MAM_BP_GRP_R S0_MM38 = MAM_BP_GRP_R.create("MM38");
		MAM_BP_GRP_R S0_MM39 = MAM_BP_GRP_R.create("MM39");
		MAM_BP_GRP_R S0_MM310 = MAM_BP_GRP_R.create("MM310");
		MAM_ITM_GRP_R S0_MM41 = MAM_ITM_GRP_R.create("MM41");
		MAM_ITM_GRP_R S0_MM42 = MAM_ITM_GRP_R.create("MM42");
		MAM_ITM_GRP_R S0_MM43 = MAM_ITM_GRP_R.create("MM43");
		MAM_ITM_GRP_R S0_MM44 = MAM_ITM_GRP_R.create("MM44");
		MAM_ITM_GRP_R S0_MM45 = MAM_ITM_GRP_R.create("MM45");
		MAM_ITM_GRP_R S0_MM46 = MAM_ITM_GRP_R.create("MM46");
		MAM_ITM_GRP_R S0_MM47 = MAM_ITM_GRP_R.create("MM47");
		MAM_ITM_GRP_R S0_MM48 = MAM_ITM_GRP_R.create("MM48");
		MAM_ITM_GRP_R S0_MM49 = MAM_ITM_GRP_R.create("MM49");
		MAM_ITM_GRP_R S0_MM410 = MAM_ITM_GRP_R.create("MM410");
		MAVM_RD_LG_GRP_R S1_RD1 = MAVM_RD_LG_GRP_R.create("RD1");
		MAVM_RD_LOC_R S2_RD2 = MAVM_RD_LOC_R.create("RD2");
		
		MCDynamicSQLID DS0C_CST_GRP = createDynamicSQLID("DS0C_CST_GRP");
		MCDynamicSQLID DS0C_DLV_GRP = createDynamicSQLID("DS0C_DLV_GRP");
		MCDynamicSQLID DS0C_ITM_GRP = createDynamicSQLID("DS0C_ITM_GRP");
		
		return createQueryPlan()
			.setQuery(
				sql("MSBEL1420_MST_SHIP_SCHD_Query_S01")
					.mainQuery()
					.select(
						S0_T1.pr_sts_typ,
						S0_T1.ship_abl_flg,
						S0_T1.fix_flg,
						trunc(
							S0_T2.dlv_rqst_tm,
							MCDateFmt.DD
						).as("dlv_rqst_dt"),
						S0_T2.dlv_rqst_tm.as("dlv_rqst_hm"),
						trunc(
							S0_T1.pd_inst_dlv_tm,
							MCDateFmt.DD
						).as("pd_inst_dlv_dt"),
						S0_T1.pd_inst_dlv_tm.as("pd_inst_dlv_hm"),
						nvl(
							S0_T1.dlv_day_week_typ,
							S0_T3.dlv_day_week_typ
						).as("dlv_day_week_typ"),
						trunc(
							S0_T1.ship_rqst_tm,
							MCDateFmt.DD
						).as("ship_rqst_dt"),
						S0_T1.ship_rqst_tm.as("ship_rqst_hm"),
						trunc(
							S0_T1.ship_schd_tm,
							MCDateFmt.DD
						).as("src_ship_schd_dt"),
						S0_T1.ship_schd_tm.as("src_ship_schd_hm"),
						trunc(
							S0_T1.ship_schd_tm,
							MCDateFmt.DD
						).as("ship_schd_dt"),
						S0_T1.ship_schd_tm.as("ship_schd_hm"),
						trunc(
							S0_T1.dlv_schd_tm,
							MCDateFmt.DD
						).as("dlv_schd_dt"),
						S0_T1.dlv_schd_tm.as("dlv_schd_hm"),
						S0_T1.ship_block_flg,
						S0_T1.ship_term_cd,
						decode(
							S0_M22_1.ship_term_cd,
							nullValue(),
							S0_M221_1.ship_wk_grp_cd,
							S0_M22_1.ship_wk_grp_cd
						).as("ship_wk_grp_cd"),
						decode(
							S0_M22_1.ship_term_cd,
							nullValue(),
							S0_M231.ship_wk_grp_nm,
							S0_M23.ship_wk_grp_nm
						).as("ship_wk_grp_nm"),
						S0_T1.ship_wk_cd,
						nvl2(
							S0_T1.tdlv_cd,
							value(MSC_SHIP_TO_ID_TYP.TDLV.value()),
							S0_T2.ship_to_id_typ
						).as("ship_to_id_typ"),
						nvl(
							nvl(
								S0_T1.tdlv_cd,
								decode(
									S0_T2.ship_to_id_typ,
									value(MSC_SHIP_TO_ID_TYP.DLV.value()),
									S0_T1.dlv_cd,
									nullValue()
								)
							),
							S0_T2.ship_to_id_cd
						).as("ship_to_id_cd"),
						nvl2(
							S0_T1.tdlv_cd,
							nvl(
								S0_T1.tdlv_nm,
								S0_M33.ship_to_id_nm
							),
							decode(
								S0_T2.ship_to_id_typ,
								value(MSC_SHIP_TO_ID_TYP.DLV.value()),
								nvl2(
									S0_T1.dlv_cd,
									nvl(
										S0_T1.dlv_nm,
										S0_M33.ship_to_id_nm
									),
									nvl(
										S0_T2.ship_to_id_nm,
										S0_M33.ship_to_id_nm
									)
								),
								nvl(
									S0_T2.ship_to_id_nm,
									S0_M33.ship_to_id_nm
								)
							)
						).as("ship_to_id_nm"),
						nvl2(
							S0_T1.tdlv_cd,
							S0_T1.tdlv_zip_cd,
							decode(
								S0_T2.ship_to_id_typ,
								value(MSC_SHIP_TO_ID_TYP.DLV.value()),
								nvl2(
									S0_T1.dlv_cd,
									S0_T1.dlv_zip_cd,
									S0_T2.ship_to_zip_cd
								),
								S0_T2.ship_to_zip_cd
							)
						).as("ship_to_zip_cd"),
						nvl2(
							S0_T1.tdlv_cd,
							S0_T1.tdlv_addr1,
							decode(
								S0_T2.ship_to_id_typ,
								value(MSC_SHIP_TO_ID_TYP.DLV.value()),
								nvl2(
									S0_T1.dlv_cd,
									S0_T1.dlv_addr1,
									S0_T2.ship_to_addr1
								),
								S0_T2.ship_to_addr1
							)
						).as("ship_to_addr1"),
						nvl2(
							S0_T1.tdlv_cd,
							S0_T1.tdlv_addr2,
							decode(
								S0_T2.ship_to_id_typ,
								value(MSC_SHIP_TO_ID_TYP.DLV.value()),
								nvl2(
									S0_T1.dlv_cd,
									S0_T1.dlv_addr2,
									S0_T2.ship_to_addr2
								),
								S0_T2.ship_to_addr2
							)
						).as("ship_to_addr2"),
						nvl2(
							S0_T1.tdlv_cd,
							S0_T1.tdlv_addr3,
							decode(
								S0_T2.ship_to_id_typ,
								value(MSC_SHIP_TO_ID_TYP.DLV.value()),
								nvl2(
									S0_T1.dlv_cd,
									S0_T1.dlv_addr3,
									S0_T2.ship_to_addr3
								),
								S0_T2.ship_to_addr3
							)
						).as("ship_to_addr3"),
						nvl2(
							S0_T1.tdlv_cd,
							S0_T1.tdlv_addr4,
							decode(
								S0_T2.ship_to_id_typ,
								value(MSC_SHIP_TO_ID_TYP.DLV.value()),
								nvl2(
									S0_T1.dlv_cd,
									S0_T1.dlv_addr4,
									S0_T2.ship_to_addr4
								),
								S0_T2.ship_to_addr4
							)
						).as("ship_to_addr4"),
						S0_T2.dlv_id_typ,
						nvl(
							S0_T1.dlv_cd,
							S0_T2.dlv_id_cd
						).as("dlv_id_cd"),
						nvl2(
							S0_T1.dlv_cd,
							nvl(
								S0_T1.dlv_nm,
								S0_M31.dlv_id_nm
							),
							nvl(
								S0_T2.dlv_id_nm,
								S0_M31.dlv_id_nm
							)
						).as("dlv_id_nm"),
						S0_T2.rqst_dpt_cd,
						S0_M3.dpt_nm.as("rqst_dpt_nm"),
						S0_T2.rqst_usr_cd,
						S0_T2.trd_cd,
						S0_T1.itm_cd,
						S0_T1.itm_sub1,
						S0_T1.itm_sub2,
						S0_T1.itm_sub3,
						decode(
							S0_M6.sundry_itm_flg,
							value(true),
							nvl(
								S0_T1.itm_nm,
								S0_M35.itm_nm
							),
							S0_M6.itm_nm
						).as("itm_nm"),
						S0_T3.cst_itm_cd,
						S0_T3.cst_itm_nm,
						S0_M6.stk_mng_typ,
						S0_M6.dscnt_itm_flg,
						S0_M6.lot_mng_typ,
						S0_M6.lot_no_typ,
						S0_M6.sublot_mng_typ,
						S0_M6.sublot_no_typ,
						S0_T1.sno1,
						S0_T1.sno2,
						S0_T1.sno3,
						S0_T1.sno4,
						S0_T1.trd_unit_cd,
						S0_T1.abort_flg,
						S0_T1.trd_unit_qty,
						S0_T1.base_unit_cd,
						S0_T1.base_unit_qty,
						S0_T1.alloc_qty,
						S0_T1.wait_qty,
						S0_T1.ship_inst_qty,
						S0_T1.ship_act_qty,
						S0_T1.iv_schd_qty,
						S0_T1.iv_act_qty,
						S0_M6.std_cont_fctr,
						S0_M6.cont_fctr_unit_cd,
						S0_M6.cont_fctr_flg,
						S0_M6.cont_fctr_rnd_typ,
						S0_M6.cont_fctr_dec_place,
						nvl(
							S0_M26.unit_wt,
							value(0)
						).multiply(S0_T1.trd_unit_qty).as("wt"),
						nvl(
							S0_M26.unit_dim,
							value(0)
						).multiply(S0_T1.trd_unit_qty).as("dim"),
						S0_T2.loc_cd,
						S0_T2.str_ln_cd,
						S0_T1.lot_no,
						S0_T1.sublot_no,
						S0_T1.ver_no,
						S0_M6.ver_flg,
						S0_T1.not_lot_mix_flg,
						S0_T1.not_sublot_mix_flg,
						S0_T1.gd_cd,
						S0_T1.quality_typ,
						S0_T1.stk_insp_typ,
						S0_T1.stk_id_typ,
						S0_T1.stk_bp_cd,
						S0_T2.alloc_grp_cd,
						S0_T3.set_itm_grp_no,
						S0_T1.base_dlv_slip_no,
						S0_T1.base_prov_act_no,
						S0_T1.base_ac_dt,
						S0_T1.ship_cnt_rmrks,
						S0_T1.trd_rmrks,
						S0_T1.trd_d_rmrks,
						S0_T3.slo_no,
						S0_T2.slo_d_no,
						S0_T2.xfr_schd_no,
						cases()
							.when(S0_T2.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.PROV_RTN.value())))
								.then(value(false))
							.otherwise(
								nvl(
									S0_M17.cst_iv_flg,
									nvl(
										S0_M22.iv_trd_flg,
										S0_M221.iv_trd_flg
									)
								)
							).as("iv_trd_flg"),
						S0_T1.ship_schd_no,
						S0_T2.ship_inst_typ,
						S0_T1.ship_fr_lg_grp_cd,
						nvl2(
							S0_T1.tdlv_cd,
							S0_T1.tdlv_lg_grp_cd,
							decode(
								S0_T2.ship_to_id_typ,
								value(MSC_SHIP_TO_ID_TYP.DLV.value()),
								nvl2(
									S0_T1.dlv_cd,
									S0_T1.dlv_lg_grp_cd,
									S0_T2.ship_to_lg_grp_cd
								),
								S0_T2.ship_to_lg_grp_cd
							)
						).as("ship_to_lg_grp_cd"),
						S0_M25.lg_grp_nm.as("ship_to_lg_grp_nm"),
						nvl2(
							S0_T1.tdlv_cd,
							S0_T1.tdlv_cntct_dpt,
							decode(
								S0_T2.ship_to_id_typ,
								value(MSC_SHIP_TO_ID_TYP.DLV.value()),
								nvl2(
									S0_T1.dlv_cd,
									S0_T1.dlv_cntct_dpt,
									S0_T2.ship_to_cntct_dpt
								),
								S0_T2.ship_to_cntct_dpt
							)
						).as("ship_to_cntct_dpt"),
						nvl2(
							S0_T1.tdlv_cd,
							S0_T1.tdlv_cntct_psn,
							decode(
								S0_T2.ship_to_id_typ,
								value(MSC_SHIP_TO_ID_TYP.DLV.value()),
								nvl2(
									S0_T1.dlv_cd,
									S0_T1.dlv_cntct_psn,
									S0_T2.ship_to_cntct_psn
								),
								S0_T2.ship_to_cntct_psn
							)
						).as("ship_to_cntct_psn"),
						nvl2(
							S0_T1.tdlv_cd,
							S0_T1.tdlv_tel,
							decode(
								S0_T2.ship_to_id_typ,
								value(MSC_SHIP_TO_ID_TYP.DLV.value()),
								nvl2(
									S0_T1.dlv_cd,
									S0_T1.dlv_tel,
									S0_T2.ship_to_tel
								),
								S0_T2.ship_to_tel
							)
						).as("ship_to_tel"),
						nvl2(
							S0_T1.tdlv_cd,
							S0_T1.tdlv_fax,
							decode(
								S0_T2.ship_to_id_typ,
								value(MSC_SHIP_TO_ID_TYP.DLV.value()),
								nvl2(
									S0_T1.dlv_cd,
									S0_T1.dlv_fax,
									S0_T2.ship_to_fax
								),
								S0_T2.ship_to_fax
							)
						).as("ship_to_fax"),
						nvl2(
							S0_T1.tdlv_cd,
							S0_T1.tdlv_sundry_flg,
							decode(
								S0_T2.ship_to_id_typ,
								value(MSC_SHIP_TO_ID_TYP.DLV.value()),
								nvl2(
									S0_T1.dlv_cd,
									S0_T1.dlv_sundry_flg,
									S0_T2.ship_to_sundry_flg
								),
								S0_T2.ship_to_sundry_flg
							)
						).as("ship_to_sundry_flg"),
						nvl(S0_T1.via_dlv_typ, S0_T2.via_dlv_typ).as("via_dlv_typ"),
						S0_M33.cntry_cd.as("ship_to_cntry_cd"),
						S0_M33.cntry_nm.as("ship_to_cntry_nm"),
						S0_M6.sno1_mng_typ,
						S0_M6.sno2_mng_typ,
						S0_M6.sno3_mng_typ,
						S0_M6.sno4_mng_typ,
						S0_M26.dec_place.as("trd_unit_dec_place"),
						S0_M26.conv_base_qty.as("trd_unit_conv_base_qty"),
						S0_M26.conv_qty.as("trd_unit_conv_qty"),
						S0_T2.cst_cd,
						S0_M17.bp_nm.as("cst_nm"),
						S0_T1.ship_pr_no,
						S0_T1.ship_inst_d_no,
						S0_T2.alloc_typ,
						S0_T2.alloc_scope_typ,
						S0_T1.iv_itm_nm,
						S0_T1.sno1_null_flg,
						S0_T1.sno2_null_flg,
						S0_T1.sno3_null_flg,
						S0_T1.sno4_null_flg,
						S0_T1.stk_arrv_bp_cd,
						S0_T2.trd_ptn_typ,
						S0_M6.itm_typ,
						nullValue().as("itm_typ_nm"),
						S0_M6.itm_typ_d_cd,
						S0_T1.ins_usr_id,
						S0_T1.ins_usr_nm,
						S0_T1.ins_func_id,
						S0_T1.ins_ts,
						S0_T1.upd_usr_id,
						S0_T1.upd_usr_nm,
						S0_T1.upd_func_id,
						S0_T1.upd_ts,
						S0_T1.upd_srv_req_no,
						S0_T1.upd_cntr,
						S0_T2.upd_cntr.as("ship_pr_upd_cntr"),
						S0_T10.ship_inst_no,
						addDynamicSelect(DS0C_DLV_GRP),
						addDynamicSelect(DS0C_CST_GRP),
						addDynamicSelect(DS0C_ITM_GRP)
					)
					.from(
						S0_T1
						.innerJoin(S0_T2).on(S0_T2.ship_pr_no.eq(S0_T1.ship_pr_no))
						.leftOuterJoin(S0_T3).on(S0_T3.slo_d_no.eq(S0_T2.slo_d_no))
						.leftOuterJoin(S0_T10).on(S0_T10.ship_inst_d_no.eq(S0_T1.ship_inst_d_no))
						.leftOuterJoin(S0_T12).on(S0_T12.ship_inst_no.eq(S0_T10.ship_inst_no))
						.leftOuterJoin(S0_M3).on(
							S0_M3.dpt_cd.eq(S0_T2.rqst_dpt_cd)
							.and(S0_M3.st_dt.lte(nvl(
									S0_T2.ship_schd_tm,
									S0_T12.ship_schd_tm
								)))
							.and(S0_M3.end_dt.gte(nvl(
									S0_T2.ship_schd_tm,
									S0_T12.ship_schd_tm
								)))
						)
						.leftOuterJoin(S0_M6).on(
							S0_M6.itm_cd.eq(S0_T1.itm_cd)
							.and(S0_M6.itm_sub1.eq(S0_T1.itm_sub1))
							.and(S0_M6.itm_sub2.eq(S0_T1.itm_sub2))
							.and(S0_M6.itm_sub3.eq(S0_T1.itm_sub3))
						)
						.leftOuterJoin(S0_M17).on(S0_M17.bp_cd.eq(S0_T2.cst_cd))
						.leftOuterJoin(S0_M21).on(
							S0_M21.bp_cd.eq(nvl(
									S0_T1.dlv_cd,
									S0_T2.dlv_id_cd
								)
							)
						)
						.leftOuterJoin(S0_M31).on(
							S0_M31.dlv_id_typ.eq(S0_T2.dlv_id_typ)
							.and(
								S0_M31.dlv_id_cd.eq(nvl(
										S0_T1.dlv_cd,
										S0_T2.dlv_id_cd
									)
								)
							)
						)
						.leftOuterJoin(S0_M33).on(
							S0_M33.ship_to_id_typ.eq(nvl2(
									S0_T1.tdlv_cd,
									value(MSC_SHIP_TO_ID_TYP.TDLV.value()),
									S0_T2.ship_to_id_typ
								)
							)
							.and(
								S0_M33.ship_to_id_cd.eq(nvl(
										nvl(
											S0_T1.tdlv_cd,
											decode(
												S0_T2.ship_to_id_typ,
												value(MSC_SHIP_TO_ID_TYP.DLV.value()),
												S0_T1.dlv_cd,
												nullValue()
											)
										),
										S0_T2.ship_to_id_cd
									)
								)
							)
						)
						.leftOuterJoin(S0_M22).on(
							S0_M22.fr_lg_grp_cd.eq(S0_T1.ship_fr_lg_grp_cd)
							.and(S0_M22.to_lg_grp_cd.eq(S0_M31.lg_grp_cd))
							.and(S0_M22.ship_term_cd.eq(S0_T1.ship_term_cd))
						)
						.leftOuterJoin(S0_M25).on(
							S0_M25.lg_grp_cd.eq(nvl2(
									S0_T1.tdlv_cd,
									S0_T1.tdlv_lg_grp_cd,
									decode(
										S0_T2.ship_to_id_typ,
										value(MSC_SHIP_TO_ID_TYP.DLV.value()),
										nvl2(
											S0_T1.dlv_cd,
											S0_T1.dlv_lg_grp_cd,
											S0_T2.ship_to_lg_grp_cd
										),
										S0_T2.ship_to_lg_grp_cd
									)
								)
							)
						)
						.leftOuterJoin(S0_M22_1).on(
							S0_M22_1.fr_lg_grp_cd.eq(S0_T1.ship_fr_lg_grp_cd)
							.and(S0_M22_1.to_lg_grp_cd.eq(S0_M25.lg_grp_cd))
							.and(S0_M22_1.ship_term_cd.eq(S0_T1.ship_term_cd))
						)
						.leftOuterJoin(S0_M23).on(S0_M23.ship_wk_grp_cd.eq(S0_M22_1.ship_wk_grp_cd))
						.leftOuterJoin(S0_M221).on(
							S0_M221.fr_lg_grp_cd.eq(S0_T1.ship_fr_lg_grp_cd)
							.and(S0_M221.to_lg_grp_cd.eq(S0_M31.lg_grp_cd))
							.and(S0_M221.ship_term_cd.eq(value(MAC_STR.NULL_VAL.value())))
						)
						.leftOuterJoin(S0_M221_1).on(
							S0_M221_1.fr_lg_grp_cd.eq(S0_T1.ship_fr_lg_grp_cd)
							.and(S0_M221_1.to_lg_grp_cd.eq(S0_M25.lg_grp_cd))
							.and(S0_M221_1.ship_term_cd.eq(value(MAC_STR.NULL_VAL.value())))
						)
						.leftOuterJoin(S0_M231).on(S0_M231.ship_wk_grp_cd.eq(S0_M221_1.ship_wk_grp_cd))
						.leftOuterJoin(S0_M26).on(
							S0_M26.itm_cd.eq(S0_T1.itm_cd)
							.and(S0_M26.itm_sub1.eq(S0_T1.itm_sub1))
							.and(S0_M26.itm_sub2.eq(S0_T1.itm_sub2))
							.and(S0_M26.itm_sub3.eq(S0_T1.itm_sub3))
							.and(S0_M26.unit_cd.eq(S0_T1.trd_unit_cd))
						)
						.leftOuterJoin(S0_M35).on(
							S0_T1.itm_cd.eq(S0_M35.itm_cd)
							.and(S0_T1.itm_sub1.eq(S0_M35.itm_sub1))
							.and(S0_T1.itm_sub2.eq(S0_M35.itm_sub2))
							.and(S0_T1.itm_sub3.eq(S0_M35.itm_sub3))
							.and(S0_T1.sno1.eq(S0_M35.sno1))
							.and(S0_T1.sno2.eq(S0_M35.sno2))
							.and(S0_T1.sno3.eq(S0_M35.sno3))
							.and(S0_T1.sno4.eq(S0_M35.sno4))
						)
						.addDynamicView()
						.addDynamicView(DS0C_DLV_GRP)
						.addDynamicView(DS0C_CST_GRP)
						.addDynamicView(DS0C_ITM_GRP)
					)
					.where(
						value(0).eq(value(0))
						.cutoff$and(S0_T1.ship_fr_lg_grp_cd.like(bind("lg_grp_cd")))
						.and(S0_T2.abort_flg.eq(value(false))
						.or(bracket(S0_T2.abort_flg.eq(value(true)).and(S0_T2.ship_schd_abort_qty.lt(S0_T2.base_unit_qty)))))
						.and(S0_T1.ship_skip_flg.eq(value(false)))
						.and(
							exists(
								subQuery()
								.select(value("X"))
								.from(S1_RD1)
								.where(
									S1_RD1.lg_grp_cd.eq(S0_T1.ship_fr_lg_grp_cd)
								)
							)
							.or(
								exists(
									subQuery()
									.select(value("X"))
									.from(S2_RD2)
									.where(
										S2_RD2.loc_cd.eq(S0_T2.ship_to_id_cd)
										.and(S0_T2.ship_to_id_typ.eq(value(MSC_SHIP_TO_ID_TYP.LOC.value())))
									)
								)
							)
						)
						.and(
							value(true).eq(value(false))
							.cutoff$or(S0_T1.pr_sts_typ.eq(bind("tmp_sts_not_inst")))
							.cutoff$or(S0_T1.pr_sts_typ.eq(bind("tmp_sts_inst")))
							.cutoff$or(S0_T1.pr_sts_typ.eq(bind("tmp_sts_not_ship")))
							.cutoff$or(S0_T1.pr_sts_typ.eq(bind("tmp_sts_part_ship")))
							.cutoff$or(S0_T1.pr_sts_typ.eq(bind("tmp_sts_ship")))
						)
						.cutoff$and(
							bracket(
								bracket(
									bind("not_alloc_flg_str").eq(value(true))
									.and(
										S0_T2.alloc_typ.in(
											value(MAC_ALLOC_TYP.IMMED.value()),
											value(MAC_ALLOC_TYP.LATER.value())
										)
										.or(S0_T2.alloc_typ.eq(value(MAC_ALLOC_TYP.NON.value())))
										.and(S0_T2.xfr_schd_no.isNotNull())
									)
									.and(S0_T1.alloc_qty.eq(value(0)))
								)
								.or(
									bind("part_alloc_flg_str").eq(value(true))
									.and(S0_T1.base_unit_qty.gt(S0_T1.alloc_qty))
									.and(S0_T1.alloc_qty.gt(value(0)))
								)
								.or(
									bind("all_alloc_flg_str").eq(value(true))
									.and(S0_T1.alloc_qty.gte(S0_T1.base_unit_qty))
								)
								.or(
									bind("alloc_invalid_flg_str").eq(value(true))
									.and(
										S0_T2.alloc_typ.eq(value(MAC_ALLOC_TYP.NON.value()))
										.and(S0_T2.xfr_schd_no.isNull())
										.or(S0_T2.alloc_typ.isNull())
									)
									.and(S0_T1.alloc_qty.eq(value(0)))
								)
							)
						)
						.cutoff$and(S0_T1.ship_block_flg.eq(bind("tmp_ship_block")))
						.cutoff$and(
							bind("tmp_dlv_rqst").eq(value(0))
							.and(
								MAPA_DT$F_IS_BEFORE_AFTER(
									S0_T1.dlv_schd_tm,
									S0_T2.dlv_rqst_tm
								).eq(value(false))
							)
						)
						.cutoff$and(
							bind("tmp_ship_rqst").eq(value(0))
							.and(
								MAPA_DT$F_IS_BEFORE_AFTER(
									S0_T1.ship_schd_tm,
									S0_T1.ship_rqst_tm
								).eq(value(false))
							)
						)
						.cutoff$and(
							bind("tmp_pd_inst_dlv").eq(value(0))
							.and(
								MAPA_DT$F_IS_BEFORE_AFTER(
									S0_T1.dlv_schd_tm,
									S0_T1.pd_inst_dlv_tm
								).eq(value(false))
							)
						)
						.cutoff$and(S0_T1.abort_flg.eq(bind("tmp_abort_flg")))
						.cutoff$and(S0_T1.wg_cd.like(bind("wg_cd")))
						.addDynamicPredicate()
						.cutoff$and(S0_T1.ship_schd_tm.gte(bind("ship_schd_hm_fr")))
						.cutoff$and(S0_T1.ship_schd_tm.lte(bind("ship_schd_hm_to")))
						.cutoff$and(S0_T1.dlv_schd_tm.gte(bind("dlv_schd_hm_fr")))
						.cutoff$and(S0_T1.dlv_schd_tm.lte(bind("dlv_schd_hm_to")))
						.cutoff$and(S0_T2.alloc_grp_cd.like(bind("alloc_grp_cd")))
						.cutoff$and(
							nvl2(
								S0_T1.tdlv_cd,
								value(MSC_SHIP_TO_ID_TYP.TDLV.value()),
								S0_T2.ship_to_id_typ
							).like(bind("ship_to_id_typ"))
						)
						.cutoff$and(
							nvl(
								nvl(
									S0_T1.tdlv_cd,
									decode(
										S0_T2.ship_to_id_typ,
										value(MSC_SHIP_TO_ID_TYP.DLV.value()),
										S0_T1.dlv_cd,
										nullValue()
									)
								),
								S0_T2.ship_to_id_cd
							).like(bind("ship_to_id_cd"))
						)
						.cutoff$and(
							nvl2(
								S0_T1.tdlv_cd,
								nvl(
									S0_T1.tdlv_nm,
									S0_M33.ship_to_id_nm
								),
								decode(
									S0_T2.ship_to_id_typ,
									value(MSC_SHIP_TO_ID_TYP.DLV.value()),
									nvl2(
										S0_T1.dlv_cd,
										nvl(
											S0_T1.dlv_nm,
											S0_M33.ship_to_id_nm
										),
										nvl(
											S0_T2.ship_to_id_nm,
											S0_M33.ship_to_id_nm
										)
									),
									nvl(
										S0_T2.ship_to_id_nm,
										S0_M33.ship_to_id_nm
									)
								)
							).like(bind("ship_to_id_nm"))
						)
						.cutoff$and(S0_T2.dlv_id_typ.like(bind("dlv_id_typ")))
						.cutoff$and(
							nvl(
								S0_T1.dlv_cd,
								S0_T2.dlv_id_cd
							).like(bind("dlv_id_cd"))
						)
						.cutoff$and(
							nvl2(
								S0_T1.dlv_cd,
								nvl(
									S0_T1.dlv_nm,
									S0_M31.dlv_id_nm
								),
								nvl(
									S0_T2.dlv_id_nm,
									S0_M31.dlv_id_nm
								)
							).like(bind("dlv_id_nm"))
						)
						.cutoff$and(
							nvl(
								S0_T1.via_dlv_typ,
								S0_T2.via_dlv_typ
							).like(bind("via_dlv_typ"))
						)
						.cutoff$and(S0_T2.cst_cd.like(bind("cst_cd")))
						.cutoff$and(S0_M17.bp_nm.like(bind("cst_nm")))
						.cutoff$and(S0_T1.ship_term_cd.like(bind("ship_term_cd")))
						.cutoff$and(S0_T1.ship_wk_cd.like(bind("ship_wk_cd")))
						.cutoff$and(S0_T2.trd_cd.like(bind("trd_cd")))
						.cutoff$and(S0_M6.itm_typ.like(bind("itm_typ")))
						.cutoff$and(S0_M6.itm_typ_d_cd.like(bind("itm_typ_d_cd")))
						.cutoff$and(S0_T1.itm_cd.like(bind("itm_cd")))
						.cutoff$and(S0_T1.itm_sub1.like(bind("itm_sub1")))
						.cutoff$and(S0_T1.itm_sub2.like(bind("itm_sub2")))
						.cutoff$and(S0_T1.itm_sub3.like(bind("itm_sub3")))
						.cutoff$and(
							decode(
								S0_M6.sundry_itm_flg,
								value(true),
								nvl(
									S0_T1.itm_nm,
									S0_M35.itm_nm
								),
								S0_M6.itm_nm
							).like(bind("itm_nm"))
						)
						.cutoff$and(S0_T3.cst_itm_cd.like(bind("cst_itm_cd")))
						.cutoff$and(S0_T3.cst_itm_nm.like(bind("cst_itm_nm")))
						.cutoff$and(S0_T2.rqst_dpt_cd.like(bind("rqst_dpt_cd")))
						.cutoff$and(S0_M3.dpt_nm.like(bind("rqst_dpt_nm")))
						.cutoff$and(S0_T2.rqst_usr_cd.like(bind("rqst_usr_cd")))
						.cutoff$and(S0_T2.ship_inst_typ.like(bind("ship_inst_typ")))
						.cutoff$and(S0_T1.ship_schd_no.like(bind("ship_schd_no")))
						.cutoff$and(S0_T3.slo_no.like(bind("slo_no")))
						.cutoff$and(S0_T2.slo_d_no.like(bind("slo_d_no")))
						.cutoff$and(S0_T2.xfr_schd_no.like(bind("xfr_schd_no")))
						.cutoff$and(S0_T1.ship_inst_d_no.like(bind("ship_inst_d_no")))
						.cutoff$and(S0_T1.ship_cnt_rmrks.like(bind("ship_cnt_rmrks")))
						.cutoff$and(S0_T1.trd_rmrks.like(bind("trd_rmrks")))
						.cutoff$and(S0_T1.trd_d_rmrks.like(bind("trd_d_rmrks")))
						.cutoff$and(S0_T1.ver_no.like(bind("ver_no")))
						.cutoff$and(S0_T1.lot_no.like(bind("lot_no")))
						.cutoff$and(S0_T1.sublot_no.like(bind("sublot_no")))
						.cutoff$and(S0_T1.sno1.like(bind("sno1")))
						.cutoff$and(S0_T1.sno2.like(bind("sno2")))
						.cutoff$and(S0_T1.sno3.like(bind("sno3")))
						.cutoff$and(S0_T1.sno4.like(bind("sno4")))
						.cutoff$and(S0_T10.ship_inst_no.like(bind("ship_inst_no")))
						.addDynamicPredicate(DS0C_DLV_GRP)
						.addDynamicPredicate(DS0C_CST_GRP)
						.addDynamicPredicate(DS0C_ITM_GRP)
					)
					.orderBy(S0_T1.ship_schd_no.asc())
			)
			.setDynamicSQLInfo(
				when(boundOr("wrk_no", "wrk_nm"))
					.view(v -> v.leftOuterJoin(S0_T11).on(S0_T11.sno1.eq(S0_T1.sno1)))
					.predicate(p -> p.cutoff$and(S0_T11.wrk_no.like(bind("wrk_no"))).cutoff$and(S0_T11.wrk_nm.like(bind("wrk_nm")))),
				when(boundOr("ship_term_nm"))
					.view(v -> v.leftOuterJoin(S0_M1).on(S0_M1.ship_term_cd.eq(S0_T1.ship_term_cd)))
					.predicate(p -> p.cutoff$and(S0_M1.ship_term_nm.like(bind("ship_term_nm")))),
				when(boundOr("ship_wk_nm"))
					.view(v -> v.leftOuterJoin(S0_M2).on(S0_M2.ship_wk_cd.eq(S0_T1.ship_wk_cd)))
					.predicate(p -> p.cutoff$and(S0_M2.ship_wk_nm.like(bind("ship_wk_nm")))),
				when(boundOr("rqst_usr_nm"))
					.view(v -> v.leftOuterJoin(S0_M4).on(S0_M4.usr_cd.eq(S0_T2.rqst_usr_cd)))
					.predicate(p -> p.cutoff$and(S0_M4.usr_nm.like(bind("rqst_usr_nm")))),
				when(boundOr("trd_nm"))
					.view(v -> v.leftOuterJoin(S0_M5).on(S0_M5.trd_cd.eq(S0_T2.trd_cd)))
					.predicate(p -> p.cutoff$and(S0_M5.trd_nm.like(bind("trd_nm")))),
				when(boundOr("alloc_grp_nm"))
					.view(v -> v.leftOuterJoin(S0_M15).on(S0_M15.alloc_grp_cd.eq(S0_T2.alloc_grp_cd)))
					.predicate(p -> p.cutoff$and(S0_M15.alloc_grp_nm.like(bind("alloc_grp_nm")))),
				when(boundOr("wg_nm"))
					.view(v -> v.leftOuterJoin(S0_M16).on(S0_M16.wg_cd.eq(S0_T1.wg_cd)))
					.predicate(p -> p.cutoff$and(S0_M16.wg_nm.like(bind("wg_nm")))),
				when(boundOr("itm_typ_d_nm"))
					.view(v -> v.leftOuterJoin(S0_M18).on(S0_M18.itm_typ.eq(S0_M6.itm_typ).and(S0_M18.itm_typ_d_cd.eq(S0_M6.itm_typ_d_cd))))
					.predicate(p -> p.cutoff$and(S0_M18.itm_typ_d_nm.like(bind("itm_typ_d_nm")))),
				when(boundOr("dlv_grp_flg1"))
					.select(DS0C_DLV_GRP, S0_M21.bp_grp_cd1.as("dlv_grp_cd1"), S0_MM21.bp_grp_nm.as("dlv_grp_nm1"))
					.view(DS0C_DLV_GRP, v -> v.leftOuterJoin(S0_MM21).on(S0_M21.bp_grp_cd1.eq(S0_MM21.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP1.value()).eq(S0_MM21.bp_grp_typ))))
					.predicate(DS0C_DLV_GRP, p -> p.cutoff$and(S0_M21.bp_grp_cd1.like(bind("dlv_grp_cd1"))).cutoff$and(S0_MM21.bp_grp_nm.like(bind("dlv_grp_nm1")))),
				when(boundOr("dlv_grp_flg2"))
					.select(DS0C_DLV_GRP, S0_M21.bp_grp_cd2.as("dlv_grp_cd2"), S0_MM22.bp_grp_nm.as("dlv_grp_nm2"))
					.view(DS0C_DLV_GRP, v -> v.leftOuterJoin(S0_MM22).on(S0_M21.bp_grp_cd2.eq(S0_MM22.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP2.value()).eq(S0_MM22.bp_grp_typ))))
					.predicate(DS0C_DLV_GRP, p -> p.cutoff$and(S0_M21.bp_grp_cd2.like(bind("dlv_grp_cd2"))).cutoff$and(S0_MM22.bp_grp_nm.like(bind("dlv_grp_nm2")))),
				when(boundOr("dlv_grp_flg3"))
					.select(DS0C_DLV_GRP, S0_M21.bp_grp_cd3.as("dlv_grp_cd3"), S0_MM23.bp_grp_nm.as("dlv_grp_nm3"))
					.view(DS0C_DLV_GRP, v -> v.leftOuterJoin(S0_MM23).on(S0_M21.bp_grp_cd3.eq(S0_MM23.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP3.value()).eq(S0_MM23.bp_grp_typ))))
					.predicate(DS0C_DLV_GRP, p -> p.cutoff$and(S0_M21.bp_grp_cd3.like(bind("dlv_grp_cd3"))).cutoff$and(S0_MM23.bp_grp_nm.like(bind("dlv_grp_nm3")))),
				when(boundOr("dlv_grp_flg4"))
					.select(DS0C_DLV_GRP, S0_M21.bp_grp_cd4.as("dlv_grp_cd4"), S0_MM24.bp_grp_nm.as("dlv_grp_nm4"))
					.view(DS0C_DLV_GRP, v -> v.leftOuterJoin(S0_MM24).on(S0_M21.bp_grp_cd4.eq(S0_MM24.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP4.value()).eq(S0_MM24.bp_grp_typ))))
					.predicate(DS0C_DLV_GRP, p -> p.cutoff$and(S0_M21.bp_grp_cd4.like(bind("dlv_grp_cd4"))).cutoff$and(S0_MM24.bp_grp_nm.like(bind("dlv_grp_nm4")))),
				when(boundOr("dlv_grp_flg5"))
					.select(DS0C_DLV_GRP, S0_M21.bp_grp_cd5.as("dlv_grp_cd5"), S0_MM25.bp_grp_nm.as("dlv_grp_nm5"))
					.view(DS0C_DLV_GRP, v -> v.leftOuterJoin(S0_MM25).on(S0_M21.bp_grp_cd5.eq(S0_MM25.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP5.value()).eq(S0_MM25.bp_grp_typ))))
					.predicate(DS0C_DLV_GRP, p -> p.cutoff$and(S0_M21.bp_grp_cd5.like(bind("dlv_grp_cd5"))).cutoff$and(S0_MM25.bp_grp_nm.like(bind("dlv_grp_nm5")))),
				when(boundOr("dlv_grp_flg6"))
					.select(DS0C_DLV_GRP, S0_M21.bp_grp_cd6.as("dlv_grp_cd6"), S0_MM26.bp_grp_nm.as("dlv_grp_nm6"))
					.view(DS0C_DLV_GRP, v -> v.leftOuterJoin(S0_MM26).on(S0_M21.bp_grp_cd6.eq(S0_MM26.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP6.value()).eq(S0_MM26.bp_grp_typ))))
					.predicate(DS0C_DLV_GRP, p -> p.cutoff$and(S0_M21.bp_grp_cd6.like(bind("dlv_grp_cd6"))).cutoff$and(S0_MM26.bp_grp_nm.like(bind("dlv_grp_nm6")))),
				when(boundOr("dlv_grp_flg7"))
					.select(DS0C_DLV_GRP, S0_M21.bp_grp_cd7.as("dlv_grp_cd7"), S0_MM27.bp_grp_nm.as("dlv_grp_nm7"))
					.view(DS0C_DLV_GRP, v -> v.leftOuterJoin(S0_MM27).on(S0_M21.bp_grp_cd7.eq(S0_MM27.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP7.value()).eq(S0_MM27.bp_grp_typ))))
					.predicate(DS0C_DLV_GRP, p -> p.cutoff$and(S0_M21.bp_grp_cd7.like(bind("dlv_grp_cd7"))).cutoff$and(S0_MM27.bp_grp_nm.like(bind("dlv_grp_nm7")))),
				when(boundOr("dlv_grp_flg8"))
					.select(DS0C_DLV_GRP, S0_M21.bp_grp_cd8.as("dlv_grp_cd8"), S0_MM28.bp_grp_nm.as("dlv_grp_nm8"))
					.view(DS0C_DLV_GRP, v -> v.leftOuterJoin(S0_MM28).on(S0_M21.bp_grp_cd8.eq(S0_MM28.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP8.value()).eq(S0_MM28.bp_grp_typ))))
					.predicate(DS0C_DLV_GRP, p -> p.cutoff$and(S0_M21.bp_grp_cd8.like(bind("dlv_grp_cd8"))).cutoff$and(S0_MM28.bp_grp_nm.like(bind("dlv_grp_nm8")))),
				when(boundOr("dlv_grp_flg9"))
					.select(DS0C_DLV_GRP, S0_M21.bp_grp_cd9.as("dlv_grp_cd9"), S0_MM29.bp_grp_nm.as("dlv_grp_nm9"))
					.view(DS0C_DLV_GRP, v -> v.leftOuterJoin(S0_MM29).on(S0_M21.bp_grp_cd9.eq(S0_MM29.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP9.value()).eq(S0_MM29.bp_grp_typ))))
					.predicate(DS0C_DLV_GRP, p -> p.cutoff$and(S0_M21.bp_grp_cd9.like(bind("dlv_grp_cd9"))).cutoff$and(S0_MM29.bp_grp_nm.like(bind("dlv_grp_nm9")))),
				when(boundOr("dlv_grp_flg10"))
					.select(DS0C_DLV_GRP, S0_M21.bp_grp_cd10.as("dlv_grp_cd10"), S0_MM210.bp_grp_nm.as("dlv_grp_nm10"))
					.view(DS0C_DLV_GRP, v -> v.leftOuterJoin(S0_MM210).on(S0_M21.bp_grp_cd10.eq(S0_MM210.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP10.value()).eq(S0_MM210.bp_grp_typ))))
					.predicate(DS0C_DLV_GRP, p -> p.cutoff$and(S0_M21.bp_grp_cd10.like(bind("dlv_grp_cd10"))).cutoff$and(S0_MM210.bp_grp_nm.like(bind("dlv_grp_nm10")))),
				when(boundOr("cst_grp_flg1"))
					.select(DS0C_CST_GRP, S0_M17.bp_grp_cd1.as("cst_grp_cd1"), S0_MM31.bp_grp_nm.as("cst_grp_nm1"))
					.view(DS0C_CST_GRP, v -> v.leftOuterJoin(S0_MM31).on(S0_M17.bp_grp_cd1.eq(S0_MM31.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP1.value()).eq(S0_MM31.bp_grp_typ))))
					.predicate(DS0C_CST_GRP, p -> p.cutoff$and(S0_M17.bp_grp_cd1.like(bind("cst_grp_cd1"))).cutoff$and(S0_MM31.bp_grp_nm.like(bind("cst_grp_nm1")))),
				when(boundOr("cst_grp_flg2"))
					.select(DS0C_CST_GRP, S0_M17.bp_grp_cd2.as("cst_grp_cd2"), S0_MM32.bp_grp_nm.as("cst_grp_nm2"))
					.view(DS0C_CST_GRP, v -> v.leftOuterJoin(S0_MM32).on(S0_M17.bp_grp_cd2.eq(S0_MM32.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP2.value()).eq(S0_MM32.bp_grp_typ))))
					.predicate(DS0C_CST_GRP, p -> p.cutoff$and(S0_M17.bp_grp_cd2.like(bind("cst_grp_cd2"))).cutoff$and(S0_MM32.bp_grp_nm.like(bind("cst_grp_nm2")))),
				when(boundOr("cst_grp_flg3"))
					.select(DS0C_CST_GRP, S0_M17.bp_grp_cd3.as("cst_grp_cd3"), S0_MM33.bp_grp_nm.as("cst_grp_nm3"))
					.view(DS0C_CST_GRP, v -> v.leftOuterJoin(S0_MM33).on(S0_M17.bp_grp_cd3.eq(S0_MM33.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP3.value()).eq(S0_MM33.bp_grp_typ))))
					.predicate(DS0C_CST_GRP, p -> p.cutoff$and(S0_M17.bp_grp_cd3.like(bind("cst_grp_cd3"))).cutoff$and(S0_MM33.bp_grp_nm.like(bind("cst_grp_nm3")))),
				when(boundOr("cst_grp_flg4"))
					.select(DS0C_CST_GRP, S0_M17.bp_grp_cd4.as("cst_grp_cd4"), S0_MM34.bp_grp_nm.as("cst_grp_nm4"))
					.view(DS0C_CST_GRP, v -> v.leftOuterJoin(S0_MM34).on(S0_M17.bp_grp_cd4.eq(S0_MM34.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP4.value()).eq(S0_MM34.bp_grp_typ))))
					.predicate(DS0C_CST_GRP, p -> p.cutoff$and(S0_M17.bp_grp_cd4.like(bind("cst_grp_cd4"))).cutoff$and(S0_MM34.bp_grp_nm.like(bind("cst_grp_nm4")))),
				when(boundOr("cst_grp_flg5"))
					.select(DS0C_CST_GRP, S0_M17.bp_grp_cd5.as("cst_grp_cd5"), S0_MM35.bp_grp_nm.as("cst_grp_nm5"))
					.view(DS0C_CST_GRP, v -> v.leftOuterJoin(S0_MM35).on(S0_M17.bp_grp_cd5.eq(S0_MM35.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP5.value()).eq(S0_MM35.bp_grp_typ))))
					.predicate(DS0C_CST_GRP, p -> p.cutoff$and(S0_M17.bp_grp_cd5.like(bind("cst_grp_cd5"))).cutoff$and(S0_MM35.bp_grp_nm.like(bind("cst_grp_nm5")))),
				when(boundOr("cst_grp_flg6"))
					.select(DS0C_CST_GRP, S0_M17.bp_grp_cd6.as("cst_grp_cd6"), S0_MM36.bp_grp_nm.as("cst_grp_nm6"))
					.view(DS0C_CST_GRP, v -> v.leftOuterJoin(S0_MM36).on(S0_M17.bp_grp_cd6.eq(S0_MM36.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP6.value()).eq(S0_MM36.bp_grp_typ))))
					.predicate(DS0C_CST_GRP, p -> p.cutoff$and(S0_M17.bp_grp_cd6.like(bind("cst_grp_cd6"))).cutoff$and(S0_MM36.bp_grp_nm.like(bind("cst_grp_nm6")))),
				when(boundOr("cst_grp_flg7"))
					.select(DS0C_CST_GRP, S0_M17.bp_grp_cd7.as("cst_grp_cd7"), S0_MM37.bp_grp_nm.as("cst_grp_nm7"))
					.view(DS0C_CST_GRP, v -> v.leftOuterJoin(S0_MM37).on(S0_M17.bp_grp_cd7.eq(S0_MM37.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP7.value()).eq(S0_MM37.bp_grp_typ))))
					.predicate(DS0C_CST_GRP, p -> p.cutoff$and(S0_M17.bp_grp_cd7.like(bind("cst_grp_cd7"))).cutoff$and(S0_MM37.bp_grp_nm.like(bind("cst_grp_nm7")))),
				when(boundOr("cst_grp_flg8"))
					.select(DS0C_CST_GRP, S0_M17.bp_grp_cd8.as("cst_grp_cd8"), S0_MM38.bp_grp_nm.as("cst_grp_nm8"))
					.view(DS0C_CST_GRP, v -> v.leftOuterJoin(S0_MM38).on(S0_M17.bp_grp_cd8.eq(S0_MM38.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP8.value()).eq(S0_MM38.bp_grp_typ))))
					.predicate(DS0C_CST_GRP, p -> p.cutoff$and(S0_M17.bp_grp_cd8.like(bind("cst_grp_cd8"))).cutoff$and(S0_MM38.bp_grp_nm.like(bind("cst_grp_nm8")))),
				when(boundOr("cst_grp_flg9"))
					.select(DS0C_CST_GRP, S0_M17.bp_grp_cd9.as("cst_grp_cd9"), S0_MM39.bp_grp_nm.as("cst_grp_nm9"))
					.view(DS0C_CST_GRP, v -> v.leftOuterJoin(S0_MM39).on(S0_M17.bp_grp_cd9.eq(S0_MM39.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP9.value()).eq(S0_MM39.bp_grp_typ))))
					.predicate(DS0C_CST_GRP, p -> p.cutoff$and(S0_M17.bp_grp_cd9.like(bind("cst_grp_cd9"))).cutoff$and(S0_MM39.bp_grp_nm.like(bind("cst_grp_nm9")))),
				when(boundOr("cst_grp_flg10"))
					.select(DS0C_CST_GRP, S0_M17.bp_grp_cd10.as("cst_grp_cd10"), S0_MM310.bp_grp_nm.as("cst_grp_nm10"))
					.view(DS0C_CST_GRP, v -> v.leftOuterJoin(S0_MM310).on(S0_M17.bp_grp_cd10.eq(S0_MM310.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP10.value()).eq(S0_MM310.bp_grp_typ))))
					.predicate(DS0C_CST_GRP, p -> p.cutoff$and(S0_M17.bp_grp_cd10.like(bind("cst_grp_cd10"))).cutoff$and(S0_MM310.bp_grp_nm.like(bind("cst_grp_nm10")))),
				when(boundOr("itm_grp_flg1"))
					.select(DS0C_ITM_GRP, S0_M6.itm_grp_cd1.as("itm_grp_cd1"), S0_MM41.itm_grp_nm.as("itm_grp_nm1"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM41).on(S0_M6.itm_grp_cd1.eq(S0_MM41.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP1.value()).eq(S0_MM41.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M6.itm_grp_cd1.like(bind("itm_grp_cd1"))).cutoff$and(S0_MM41.itm_grp_nm.like(bind("itm_grp_nm1")))),
				when(boundOr("itm_grp_flg2"))
					.select(DS0C_ITM_GRP, S0_M6.itm_grp_cd2.as("itm_grp_cd2"), S0_MM42.itm_grp_nm.as("itm_grp_nm2"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM42).on(S0_M6.itm_grp_cd2.eq(S0_MM42.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP2.value()).eq(S0_MM42.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M6.itm_grp_cd2.like(bind("itm_grp_cd2"))).cutoff$and(S0_MM42.itm_grp_nm.like(bind("itm_grp_nm2")))),
				when(boundOr("itm_grp_flg3"))
					.select(DS0C_ITM_GRP, S0_M6.itm_grp_cd3.as("itm_grp_cd3"), S0_MM43.itm_grp_nm.as("itm_grp_nm3"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM43).on(S0_M6.itm_grp_cd3.eq(S0_MM43.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP3.value()).eq(S0_MM43.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M6.itm_grp_cd3.like(bind("itm_grp_cd3"))).cutoff$and(S0_MM43.itm_grp_nm.like(bind("itm_grp_nm3")))),
				when(boundOr("itm_grp_flg4"))
					.select(DS0C_ITM_GRP, S0_M6.itm_grp_cd4.as("itm_grp_cd4"), S0_MM44.itm_grp_nm.as("itm_grp_nm4"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM44).on(S0_M6.itm_grp_cd4.eq(S0_MM44.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP4.value()).eq(S0_MM44.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M6.itm_grp_cd4.like(bind("itm_grp_cd4"))).cutoff$and(S0_MM44.itm_grp_nm.like(bind("itm_grp_nm4")))),
				when(boundOr("itm_grp_flg5"))
					.select(DS0C_ITM_GRP, S0_M6.itm_grp_cd5.as("itm_grp_cd5"), S0_MM45.itm_grp_nm.as("itm_grp_nm5"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM45).on(S0_M6.itm_grp_cd5.eq(S0_MM45.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP5.value()).eq(S0_MM45.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M6.itm_grp_cd5.like(bind("itm_grp_cd5"))).cutoff$and(S0_MM45.itm_grp_nm.like(bind("itm_grp_nm5")))),
				when(boundOr("itm_grp_flg6"))
					.select(DS0C_ITM_GRP, S0_M6.itm_grp_cd6.as("itm_grp_cd6"), S0_MM46.itm_grp_nm.as("itm_grp_nm6"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM46).on(S0_M6.itm_grp_cd6.eq(S0_MM46.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP6.value()).eq(S0_MM46.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M6.itm_grp_cd6.like(bind("itm_grp_cd6"))).cutoff$and(S0_MM46.itm_grp_nm.like(bind("itm_grp_nm6")))),
				when(boundOr("itm_grp_flg7"))
					.select(DS0C_ITM_GRP, S0_M6.itm_grp_cd7.as("itm_grp_cd7"), S0_MM47.itm_grp_nm.as("itm_grp_nm7"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM47).on(S0_M6.itm_grp_cd7.eq(S0_MM47.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP7.value()).eq(S0_MM47.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M6.itm_grp_cd7.like(bind("itm_grp_cd7"))).cutoff$and(S0_MM47.itm_grp_nm.like(bind("itm_grp_nm7")))),
				when(boundOr("itm_grp_flg8"))
					.select(DS0C_ITM_GRP, S0_M6.itm_grp_cd8.as("itm_grp_cd8"), S0_MM48.itm_grp_nm.as("itm_grp_nm8"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM48).on(S0_M6.itm_grp_cd8.eq(S0_MM48.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP8.value()).eq(S0_MM48.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M6.itm_grp_cd8.like(bind("itm_grp_cd8"))).cutoff$and(S0_MM48.itm_grp_nm.like(bind("itm_grp_nm8")))),
				when(boundOr("itm_grp_flg9"))
					.select(DS0C_ITM_GRP, S0_M6.itm_grp_cd9.as("itm_grp_cd9"), S0_MM49.itm_grp_nm.as("itm_grp_nm9"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM49).on(S0_M6.itm_grp_cd9.eq(S0_MM49.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP9.value()).eq(S0_MM49.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M6.itm_grp_cd9.like(bind("itm_grp_cd9"))).cutoff$and(S0_MM49.itm_grp_nm.like(bind("itm_grp_nm9")))),
				when(boundOr("itm_grp_flg10"))
					.select(DS0C_ITM_GRP, S0_M6.itm_grp_cd10.as("itm_grp_cd10"), S0_MM410.itm_grp_nm.as("itm_grp_nm10"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM410).on(S0_M6.itm_grp_cd10.eq(S0_MM410.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP10.value()).eq(S0_MM410.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M6.itm_grp_cd10.like(bind("itm_grp_cd10"))).cutoff$and(S0_MM410.itm_grp_nm.like(bind("itm_grp_nm10"))))
			)
			.setJoinInfo(
				joinInfo(
					j -> j
						.add(MSVT_LOT_LIST_R.class, r -> toCondition(
							r.getStringNE("itm_cd"),
							r.getStringNE("itm_sub1"),
							r.getStringNE("itm_sub2"),
							r.getStringNE("itm_sub3"),
							r.getStringNE("lot_no"),
							r.getStringNE("sublot_no")
						))
						.addSelect(m -> toArray(
							m.act_cont_fctr
						))
						.addMap((r, m) -> {
							r.setNumberNE("act_cont_fctr", m.act_cont_fctr());
					}),
					j -> j
						.add(MST_SLO_R.class, r -> toCondition(
							r.getStringNE("slo_no")
						))
						.addSelect(m -> toArray(
							m.assort_typ
						))
						.addMap((r, m) -> {
							r.setStringNE("assort_typ", m.assort_typ());
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
							r.setStringNE("wrk_no", m.wrk_no());
							r.setStringNE("wrk_nm", m.wrk_nm());
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
						.add(MAM_SHIP_WK_R.class, r -> toCondition(
							r.getStringNE("ship_wk_cd")
						))
						.addSelect(m -> toArray(
							m.ship_wk_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("ship_wk_nm", m.ship_wk_nm());
					}),
					j -> j
						.add(MAM_USR_R.class, r -> toCondition(
							r.getStringNE("rqst_usr_cd")
						))
						.addSelect(m -> toArray(
							m.usr_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("rqst_usr_nm", m.usr_nm());
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
							r.getStringNE("base_unit_cd")
						))
						.addSelect(m -> toArray(
							m.conv_base_qty,
							m.conv_qty,
							m.rnd_typ,
							m.dec_place
						))
						.addMap((r, m) -> {
							r.setNumberNE("base_unit_conv_base_qty", m.conv_base_qty());
							r.setNumberNE("base_unit_conv_qty", m.conv_qty());
							r.setStringNE("base_unit_rnd_typ", m.rnd_typ());
							r.setNumberNE("base_unit_dec_place", m.dec_place());
					}),
					j -> j
						.add(MAM_LOC_R.class, r -> toCondition(
							r.getStringNE("loc_cd")
						))
						.addSelect(m -> toArray(
							m.loc_nm,
							m.str_ln_tgt_flg
						))
						.addMap((r, m) -> {
							r.setStringNE("loc_nm", m.loc_nm());
							r.setBooleanNE("str_ln_tgt_flg", m.str_ln_tgt_flg());
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
						.add(MAVM_BP_NM_R.class, r -> toCondition(
							r.getStringNE("stk_bp_cd")
						))
						.addSelect(m -> toArray(
							m.bp_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("stk_bp_nm", m.bp_nm());
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
						.add(MAM_ITM_TYP_D_R.class, r -> toCondition(
							r.getStringNE("itm_typ"),
							r.getStringNE("itm_typ_d_cd")
						))
						.addSelect(m -> toArray(
							m.itm_typ_d_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("itm_typ_d_nm", m.itm_typ_d_nm());
					}),
					j -> j
						.add(MAM_LG_GRP_R.class, r -> toCondition(
							r.getStringNE("ship_fr_lg_grp_cd")
						))
						.addSelect(m -> toArray(
							m.lg_grp_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("ship_fr_lg_grp_nm", m.lg_grp_nm());
					})
				)
			);
	}
	
	/**
	 * -- MSBEL1420_MST_SHIP_SCHD_Query_S02
	 */
	static MCQueryPlan MSBEL1420_MST_SHIP_SCHD_S02() {
		MST_SHIP_SCHD_R S0_T1 = MST_SHIP_SCHD_R.create("T1");
		MST_SHIP_PR_R S0_T2 = MST_SHIP_PR_R.create("T2");
		MST_SLO_D_R S0_T3 = MST_SLO_D_R.create("T3");
		MST_SHIP_ALLOC_STS_R S0_T4 = MST_SHIP_ALLOC_STS_R.create("T4");
		MSVT_LOT_LIST_R S0_T5 = MSVT_LOT_LIST_R.create("T5");
		MST_SLO_R S0_T6 = MST_SLO_R.create("T6");
		MST_SHIP_INST_D_R S0_T10 = MST_SHIP_INST_D_R.create("T10");
		MSVT_WRK_SNO_R S0_T11 = MSVT_WRK_SNO_R.create("T11");
		MAM_SHIP_TERM_R S0_M1 = MAM_SHIP_TERM_R.create("M1");
		MAM_SHIP_WK_R S0_M2 = MAM_SHIP_WK_R.create("M2");
		MAM_DPT_R S0_M3 = MAM_DPT_R.create("M3");
		MAM_USR_R S0_M4 = MAM_USR_R.create("M4");
		MAM_TRD_R S0_M5 = MAM_TRD_R.create("M5");
		MAM_ITM_R S0_M6 = MAM_ITM_R.create("M6");
		MAM_UNIT_R S0_M7 = MAM_UNIT_R.create("M7");
		MAM_UNIT_R S0_M77 = MAM_UNIT_R.create("M77");
		MAVM_ITM_UNIT_R S0_M78 = MAVM_ITM_UNIT_R.create("M78");
		MAM_UNIT_R S0_M8 = MAM_UNIT_R.create("M8");
		MAM_UNIT_R S0_M9 = MAM_UNIT_R.create("M9");
		MAVM_ITM_UNIT_R S0_M10 = MAVM_ITM_UNIT_R.create("M10");
		MAM_LOC_R S0_M11 = MAM_LOC_R.create("M11");
		MAM_STR_LN_R S0_M12 = MAM_STR_LN_R.create("M12");
		MAM_STK_GD_R S0_M13 = MAM_STK_GD_R.create("M13");
		MAVM_BP_NM_R S0_M14 = MAVM_BP_NM_R.create("M14");
		MAM_ALLOC_GRP_R S0_M15 = MAM_ALLOC_GRP_R.create("M15");
		MAM_WG_R S0_M16 = MAM_WG_R.create("M16");
		MAM_BP_R S0_M17 = MAM_BP_R.create("M17");
		MAM_ITM_TYP_D_R S0_M18 = MAM_ITM_TYP_D_R.create("M18");
		MAM_SITE_R S0_M19 = MAM_SITE_R.create("M19");
		MAM_BP_R S0_M21 = MAM_BP_R.create("M21");
		MSVM_DLV_ID_R S0_M31 = MSVM_DLV_ID_R.create("M31");
		MAM_LG_CTL_R S0_M22 = MAM_LG_CTL_R.create("M22");
		MAM_LG_CTL_R S0_M22_1 = MAM_LG_CTL_R.create("M22_1");
		MAM_SHIP_WK_GRP_R S0_M23 = MAM_SHIP_WK_GRP_R.create("M23");
		MAM_LG_CTL_R S0_M221 = MAM_LG_CTL_R.create("M221");
		MAM_LG_CTL_R S0_M221_1 = MAM_LG_CTL_R.create("M221_1");
		MAM_SHIP_WK_GRP_R S0_M231 = MAM_SHIP_WK_GRP_R.create("M231");
		MAM_LG_GRP_R S0_M24 = MAM_LG_GRP_R.create("M24");
		MAM_LG_GRP_R S0_M25 = MAM_LG_GRP_R.create("M25");
		MAVM_ITM_UNIT_R S0_M26 = MAVM_ITM_UNIT_R.create("M26");
		MSVM_SHIP_TO_ID_R S0_M33 = MSVM_SHIP_TO_ID_R.create("M33");
		MAM_SUNDRY_ITM_R S0_M35 = MAM_SUNDRY_ITM_R.create("M35");
		MAM_LOC_R S0_M36 = MAM_LOC_R.create("M36");
		MAM_BP_GRP_R S0_MM21 = MAM_BP_GRP_R.create("MM21");
		MAM_BP_GRP_R S0_MM22 = MAM_BP_GRP_R.create("MM22");
		MAM_BP_GRP_R S0_MM23 = MAM_BP_GRP_R.create("MM23");
		MAM_BP_GRP_R S0_MM24 = MAM_BP_GRP_R.create("MM24");
		MAM_BP_GRP_R S0_MM25 = MAM_BP_GRP_R.create("MM25");
		MAM_BP_GRP_R S0_MM26 = MAM_BP_GRP_R.create("MM26");
		MAM_BP_GRP_R S0_MM27 = MAM_BP_GRP_R.create("MM27");
		MAM_BP_GRP_R S0_MM28 = MAM_BP_GRP_R.create("MM28");
		MAM_BP_GRP_R S0_MM29 = MAM_BP_GRP_R.create("MM29");
		MAM_BP_GRP_R S0_MM210 = MAM_BP_GRP_R.create("MM210");
		MAM_BP_GRP_R S0_MM31 = MAM_BP_GRP_R.create("MM31");
		MAM_BP_GRP_R S0_MM32 = MAM_BP_GRP_R.create("MM32");
		MAM_BP_GRP_R S0_MM33 = MAM_BP_GRP_R.create("MM33");
		MAM_BP_GRP_R S0_MM34 = MAM_BP_GRP_R.create("MM34");
		MAM_BP_GRP_R S0_MM35 = MAM_BP_GRP_R.create("MM35");
		MAM_BP_GRP_R S0_MM36 = MAM_BP_GRP_R.create("MM36");
		MAM_BP_GRP_R S0_MM37 = MAM_BP_GRP_R.create("MM37");
		MAM_BP_GRP_R S0_MM38 = MAM_BP_GRP_R.create("MM38");
		MAM_BP_GRP_R S0_MM39 = MAM_BP_GRP_R.create("MM39");
		MAM_BP_GRP_R S0_MM310 = MAM_BP_GRP_R.create("MM310");
		MAM_ITM_GRP_R S0_MM41 = MAM_ITM_GRP_R.create("MM41");
		MAM_ITM_GRP_R S0_MM42 = MAM_ITM_GRP_R.create("MM42");
		MAM_ITM_GRP_R S0_MM43 = MAM_ITM_GRP_R.create("MM43");
		MAM_ITM_GRP_R S0_MM44 = MAM_ITM_GRP_R.create("MM44");
		MAM_ITM_GRP_R S0_MM45 = MAM_ITM_GRP_R.create("MM45");
		MAM_ITM_GRP_R S0_MM46 = MAM_ITM_GRP_R.create("MM46");
		MAM_ITM_GRP_R S0_MM47 = MAM_ITM_GRP_R.create("MM47");
		MAM_ITM_GRP_R S0_MM48 = MAM_ITM_GRP_R.create("MM48");
		MAM_ITM_GRP_R S0_MM49 = MAM_ITM_GRP_R.create("MM49");
		MAM_ITM_GRP_R S0_MM410 = MAM_ITM_GRP_R.create("MM410");
		MAVM_RD_LG_GRP_R S1_RD1 = MAVM_RD_LG_GRP_R.create("RD1");
		MAVM_RD_LOC_R S2_RD2 = MAVM_RD_LOC_R.create("RD2");
		MST_SHIP_SCHD_R S3_T1 = MST_SHIP_SCHD_R.create("T1");
		MAVM_RD_LG_GRP_R S3_RD1 = MAVM_RD_LG_GRP_R.create("RD1");
		MST_SHIP_PR_R S3_T2 = MST_SHIP_PR_R.create("T2");
		MST_SLO_D_R S3_T3 = MST_SLO_D_R.create("T3");
		MST_SHIP_ALLOC_STS_R S3_T4 = MST_SHIP_ALLOC_STS_R.create("T4");
		MSVT_LOT_LIST_R S3_T5 = MSVT_LOT_LIST_R.create("T5");
		MST_SLO_R S3_T6 = MST_SLO_R.create("T6");
		MST_SHIP_INST_D_R S3_T10 = MST_SHIP_INST_D_R.create("T10");
		MSVT_WRK_SNO_R S3_T11 = MSVT_WRK_SNO_R.create("T11");
		MST_SHIP_INST_R S3_T12 = MST_SHIP_INST_R.create("T12");
		MAM_SHIP_TERM_R S3_M1 = MAM_SHIP_TERM_R.create("M1");
		MAM_SHIP_WK_R S3_M2 = MAM_SHIP_WK_R.create("M2");
		MAM_DPT_R S3_M3 = MAM_DPT_R.create("M3");
		MAM_USR_R S3_M4 = MAM_USR_R.create("M4");
		MAM_TRD_R S3_M5 = MAM_TRD_R.create("M5");
		MAM_ITM_R S3_M6 = MAM_ITM_R.create("M6");
		MAM_UNIT_R S3_M7 = MAM_UNIT_R.create("M7");
		MAM_UNIT_R S3_M77 = MAM_UNIT_R.create("M77");
		MAVM_ITM_UNIT_R S3_M78 = MAVM_ITM_UNIT_R.create("M78");
		MAM_UNIT_R S3_M8 = MAM_UNIT_R.create("M8");
		MAM_UNIT_R S3_M9 = MAM_UNIT_R.create("M9");
		MAVM_ITM_UNIT_R S3_M10 = MAVM_ITM_UNIT_R.create("M10");
		MAM_LOC_R S3_M11 = MAM_LOC_R.create("M11");
		MAM_STR_LN_R S3_M12 = MAM_STR_LN_R.create("M12");
		MAM_STK_GD_R S3_M13 = MAM_STK_GD_R.create("M13");
		MAVM_BP_NM_R S3_M14 = MAVM_BP_NM_R.create("M14");
		MAM_ALLOC_GRP_R S3_M15 = MAM_ALLOC_GRP_R.create("M15");
		MAM_WG_R S3_M16 = MAM_WG_R.create("M16");
		MAM_BP_R S3_M17 = MAM_BP_R.create("M17");
		MAM_ITM_TYP_D_R S3_M18 = MAM_ITM_TYP_D_R.create("M18");
		MAM_SITE_R S3_M19 = MAM_SITE_R.create("M19");
		MAM_BP_R S3_M21 = MAM_BP_R.create("M21");
		MSVM_DLV_ID_R S3_M31 = MSVM_DLV_ID_R.create("M31");
		MAM_LG_CTL_R S3_M22 = MAM_LG_CTL_R.create("M22");
		MAM_LG_CTL_R S3_M22_1 = MAM_LG_CTL_R.create("M22_1");
		MAM_SHIP_WK_GRP_R S3_M23 = MAM_SHIP_WK_GRP_R.create("M23");
		MAM_LG_CTL_R S3_M221 = MAM_LG_CTL_R.create("M221");
		MAM_LG_CTL_R S3_M221_1 = MAM_LG_CTL_R.create("M221_1");
		MAM_SHIP_WK_GRP_R S3_M231 = MAM_SHIP_WK_GRP_R.create("M231");
		MAM_LG_GRP_R S3_M24 = MAM_LG_GRP_R.create("M24");
		MAM_LG_GRP_R S3_M25 = MAM_LG_GRP_R.create("M25");
		MAVM_ITM_UNIT_R S3_M26 = MAVM_ITM_UNIT_R.create("M26");
		MSVM_SHIP_TO_ID_R S3_M33 = MSVM_SHIP_TO_ID_R.create("M33");
		MAM_SUNDRY_ITM_R S3_M35 = MAM_SUNDRY_ITM_R.create("M35");
		MAM_LOC_R S3_M36 = MAM_LOC_R.create("M36");
		MAM_BP_GRP_R S3_MM21 = MAM_BP_GRP_R.create("MM21");
		MAM_BP_GRP_R S3_MM22 = MAM_BP_GRP_R.create("MM22");
		MAM_BP_GRP_R S3_MM23 = MAM_BP_GRP_R.create("MM23");
		MAM_BP_GRP_R S3_MM24 = MAM_BP_GRP_R.create("MM24");
		MAM_BP_GRP_R S3_MM25 = MAM_BP_GRP_R.create("MM25");
		MAM_BP_GRP_R S3_MM26 = MAM_BP_GRP_R.create("MM26");
		MAM_BP_GRP_R S3_MM27 = MAM_BP_GRP_R.create("MM27");
		MAM_BP_GRP_R S3_MM28 = MAM_BP_GRP_R.create("MM28");
		MAM_BP_GRP_R S3_MM29 = MAM_BP_GRP_R.create("MM29");
		MAM_BP_GRP_R S3_MM210 = MAM_BP_GRP_R.create("MM210");
		MAM_BP_GRP_R S3_MM31 = MAM_BP_GRP_R.create("MM31");
		MAM_BP_GRP_R S3_MM32 = MAM_BP_GRP_R.create("MM32");
		MAM_BP_GRP_R S3_MM33 = MAM_BP_GRP_R.create("MM33");
		MAM_BP_GRP_R S3_MM34 = MAM_BP_GRP_R.create("MM34");
		MAM_BP_GRP_R S3_MM35 = MAM_BP_GRP_R.create("MM35");
		MAM_BP_GRP_R S3_MM36 = MAM_BP_GRP_R.create("MM36");
		MAM_BP_GRP_R S3_MM37 = MAM_BP_GRP_R.create("MM37");
		MAM_BP_GRP_R S3_MM38 = MAM_BP_GRP_R.create("MM38");
		MAM_BP_GRP_R S3_MM39 = MAM_BP_GRP_R.create("MM39");
		MAM_BP_GRP_R S3_MM310 = MAM_BP_GRP_R.create("MM310");
		MAM_ITM_GRP_R S3_MM41 = MAM_ITM_GRP_R.create("MM41");
		MAM_ITM_GRP_R S3_MM42 = MAM_ITM_GRP_R.create("MM42");
		MAM_ITM_GRP_R S3_MM43 = MAM_ITM_GRP_R.create("MM43");
		MAM_ITM_GRP_R S3_MM44 = MAM_ITM_GRP_R.create("MM44");
		MAM_ITM_GRP_R S3_MM45 = MAM_ITM_GRP_R.create("MM45");
		MAM_ITM_GRP_R S3_MM46 = MAM_ITM_GRP_R.create("MM46");
		MAM_ITM_GRP_R S3_MM47 = MAM_ITM_GRP_R.create("MM47");
		MAM_ITM_GRP_R S3_MM48 = MAM_ITM_GRP_R.create("MM48");
		MAM_ITM_GRP_R S3_MM49 = MAM_ITM_GRP_R.create("MM49");
		MAM_ITM_GRP_R S3_MM410 = MAM_ITM_GRP_R.create("MM410");
		
		MCDynamicSQLID DS0C_CST_GRP = createDynamicSQLID("DS0C_CST_GRP");
		MCDynamicSQLID DS0C_DLV_GRP = createDynamicSQLID("DS0C_DLV_GRP");
		MCDynamicSQLID DS0C_ITM_GRP = createDynamicSQLID("DS0C_ITM_GRP");
		MCDynamicSQLID DS3C_CST_GRP = createDynamicSQLID("DS3C_CST_GRP");
		MCDynamicSQLID DS3C_DLV_GRP = createDynamicSQLID("DS3C_DLV_GRP");
		MCDynamicSQLID DS3C_ITM_GRP = createDynamicSQLID("DS3C_ITM_GRP");
		
		return createQueryPlan()
			.setQuery(
				sql("MSBEL1420_MST_SHIP_SCHD_Query_S02")
					.mainQuery()
					.select(
						S0_T1.pr_sts_typ,
						S0_T1.ship_abl_flg,
						S0_T1.fix_flg,
						trunc(
							S0_T2.dlv_rqst_tm,
							MCDateFmt.DD
						).as("dlv_rqst_dt"),
						S0_T2.dlv_rqst_tm.as("dlv_rqst_hm"),
						trunc(
							S0_T1.pd_inst_dlv_tm,
							MCDateFmt.DD
						).as("pd_inst_dlv_dt"),
						S0_T1.pd_inst_dlv_tm.as("pd_inst_dlv_hm"),
						nvl(
							S0_T1.dlv_day_week_typ,
							S0_T3.dlv_day_week_typ
						).as("dlv_day_week_typ"),
						trunc(
							S0_T1.ship_rqst_tm,
							MCDateFmt.DD
						).as("ship_rqst_dt"),
						S0_T1.ship_rqst_tm.as("ship_rqst_hm"),
						trunc(
							S0_T1.ship_schd_tm,
							MCDateFmt.DD
						).as("src_ship_schd_dt"),
						S0_T1.ship_schd_tm.as("src_ship_schd_hm"),
						trunc(
							S0_T1.ship_schd_tm,
							MCDateFmt.DD
						).as("ship_schd_dt"),
						S0_T1.ship_schd_tm.as("ship_schd_hm"),
						trunc(
							S0_T1.dlv_schd_tm,
							MCDateFmt.DD
						).as("dlv_schd_dt"),
						S0_T1.dlv_schd_tm.as("dlv_schd_hm"),
						S0_T1.ship_block_flg,
						S0_T1.ship_term_cd,
						S0_M1.ship_term_nm,
						decode(
							S0_M22_1.ship_term_cd,
							nullValue(),
							S0_M221_1.ship_wk_grp_cd,
							S0_M22_1.ship_wk_grp_cd
						).as("ship_wk_grp_cd"),
						decode(
							S0_M22_1.ship_term_cd,
							nullValue(),
							S0_M231.ship_wk_grp_nm,
							S0_M23.ship_wk_grp_nm
						).as("ship_wk_grp_nm"),
						S0_T1.ship_wk_cd,
						S0_M2.ship_wk_nm,
						nvl2(
							S0_T1.tdlv_cd,
							value(MSC_SHIP_TO_ID_TYP.TDLV.value()),
							S0_T2.ship_to_id_typ
						).as("ship_to_id_typ"),
						nvl(
							nvl(
								S0_T1.tdlv_cd,
								decode(
									S0_T2.ship_to_id_typ,
									value(MSC_SHIP_TO_ID_TYP.DLV.value()),
									S0_T1.dlv_cd,
									nullValue()
								)
							),
							S0_T2.ship_to_id_cd
						).as("ship_to_id_cd"),
						nvl2(
							S0_T1.tdlv_cd,
							nvl(
								S0_T1.tdlv_nm,
								S0_M33.ship_to_id_nm
							),
							decode(
								S0_T2.ship_to_id_typ,
								value(MSC_SHIP_TO_ID_TYP.DLV.value()),
								nvl2(
									S0_T1.dlv_cd,
									nvl(
										S0_T1.dlv_nm,
										S0_M33.ship_to_id_nm
									),
									nvl(
										S0_T2.ship_to_id_nm,
										S0_M33.ship_to_id_nm
									)
								),
								nvl(
									S0_T2.ship_to_id_nm,
									S0_M33.ship_to_id_nm
								)
							)
						).as("ship_to_id_nm"),
						nvl2(
							S0_T1.tdlv_cd,
							S0_T1.tdlv_zip_cd,
							decode(
								S0_T2.ship_to_id_typ,
								value(MSC_SHIP_TO_ID_TYP.DLV.value()),
								nvl2(
									S0_T1.dlv_cd,
									S0_T1.dlv_zip_cd,
									S0_T2.ship_to_zip_cd
								),
								S0_T2.ship_to_zip_cd
							)
						).as("ship_to_zip_cd"),
						nvl2(
							S0_T1.tdlv_cd,
							S0_T1.tdlv_addr1,
							decode(
								S0_T2.ship_to_id_typ,
								value(MSC_SHIP_TO_ID_TYP.DLV.value()),
								nvl2(
									S0_T1.dlv_cd,
									S0_T1.dlv_addr1,
									S0_T2.ship_to_addr1
								),
								S0_T2.ship_to_addr1
							)
						).as("ship_to_addr1"),
						nvl2(
							S0_T1.tdlv_cd,
							S0_T1.tdlv_addr2,
							decode(
								S0_T2.ship_to_id_typ,
								value(MSC_SHIP_TO_ID_TYP.DLV.value()),
								nvl2(
									S0_T1.dlv_cd,
									S0_T1.dlv_addr2,
									S0_T2.ship_to_addr2
								),
								S0_T2.ship_to_addr2
							)
						).as("ship_to_addr2"),
						nvl2(
							S0_T1.tdlv_cd,
							S0_T1.tdlv_addr3,
							decode(
								S0_T2.ship_to_id_typ,
								value(MSC_SHIP_TO_ID_TYP.DLV.value()),
								nvl2(
									S0_T1.dlv_cd,
									S0_T1.dlv_addr3,
									S0_T2.ship_to_addr3
								),
								S0_T2.ship_to_addr3
							)
						).as("ship_to_addr3"),
						nvl2(
							S0_T1.tdlv_cd,
							S0_T1.tdlv_addr4,
							decode(
								S0_T2.ship_to_id_typ,
								value(MSC_SHIP_TO_ID_TYP.DLV.value()),
								nvl2(
									S0_T1.dlv_cd,
									S0_T1.dlv_addr4,
									S0_T2.ship_to_addr4
								),
								S0_T2.ship_to_addr4
							)
						).as("ship_to_addr4"),
						S0_T2.dlv_id_typ,
						nvl(
							S0_T1.dlv_cd,
							S0_T2.dlv_id_cd
						).as("dlv_id_cd"),
						nvl2(
							S0_T1.dlv_cd,
							nvl(
								S0_T1.dlv_nm,
								S0_M31.dlv_id_nm
							),
							nvl(
								S0_T2.dlv_id_nm,
								S0_M31.dlv_id_nm
							)
						).as("dlv_id_nm"),
						S0_T2.rqst_dpt_cd,
						S0_M3.dpt_nm.as("rqst_dpt_nm"),
						S0_T2.rqst_usr_cd,
						S0_M4.usr_nm.as("rqst_usr_nm"),
						S0_T2.trd_cd,
						S0_M5.trd_nm,
						S0_T1.itm_cd,
						S0_T1.itm_sub1,
						S0_T1.itm_sub2,
						S0_T1.itm_sub3,
						decode(
							S0_M6.sundry_itm_flg,
							value(true),
							nvl(
								S0_T1.itm_nm,
								S0_M35.itm_nm
							),
							S0_M6.itm_nm
						).as("itm_nm"),
						S0_T3.cst_itm_cd,
						S0_T3.cst_itm_nm,
						S0_M6.stk_mng_typ,
						S0_M6.dscnt_itm_flg,
						S0_M6.lot_mng_typ,
						S0_M6.lot_no_typ,
						S0_M6.sublot_mng_typ,
						S0_M6.sublot_no_typ,
						S0_T1.sno1,
						S0_T1.sno2,
						S0_T1.sno3,
						S0_T1.sno4,
						S0_T11.wrk_no,
						S0_T11.wrk_nm,
						S0_T4.sno1.as("alloc_sno1"),
						S0_T4.sno2.as("alloc_sno2"),
						S0_T4.sno3.as("alloc_sno3"),
						S0_T4.sno4.as("alloc_sno4"),
						S0_T1.trd_unit_cd,
						S0_M7.unit_nm.as("trd_unit_nm"),
						S0_M26.dec_place.as("trd_unit_dec_place"),
						S0_M26.conv_base_qty.as("trd_unit_conv_base_qty"),
						S0_M26.conv_qty.as("trd_unit_conv_qty"),
						S0_T1.abort_flg,
						S0_T1.trd_unit_qty,
						S0_T4.ent_unit_cd.as("alloc_ent_unit_cd"),
						S0_M77.unit_nm.as("alloc_ent_unit_nm"),
						S0_M78.dec_place.as("alloc_ent_unit_dec_place"),
						S0_M78.conv_base_qty.as("alloc_ent_unit_conv_base_qty"),
						S0_M78.conv_qty.as("alloc_ent_unit_conv_qty"),
						S0_M78.rnd_typ.as("alloc_ent_unit_rnd_typ"),
						S0_T4.ent_unit_qty.as("alloc_ent_unit_qty"),
						S0_T1.base_unit_cd,
						S0_M8.unit_nm.as("base_unit_nm"),
						S0_M10.dec_place.as("base_unit_dec_place"),
						S0_T1.base_unit_qty,
						S0_T4.base_unit_qty.as("alloc_base_unit_qty"),
						S0_T1.alloc_qty,
						S0_T1.wait_qty,
						S0_T1.ship_inst_qty,
						S0_T1.ship_act_qty,
						S0_T1.iv_schd_qty,
						S0_T1.iv_act_qty,
						S0_T5.act_cont_fctr,
						S0_M6.std_cont_fctr,
						S0_M6.cont_fctr_unit_cd,
						S0_M9.unit_nm.as("cont_fctr_unit_nm"),
						S0_M6.cont_fctr_flg,
						S0_M6.cont_fctr_rnd_typ,
						S0_M6.cont_fctr_dec_place,
						nvl(
							S0_M78.unit_wt,
							value(0)
						).multiply(S0_T4.ent_unit_qty).as("wt"),
						nvl(
							S0_M78.unit_dim,
							value(0)
						).multiply(S0_T4.ent_unit_qty).as("dim"),
						S0_T4.alloc_flg,
						S0_T4.ship_loc_cd.as("loc_cd"),
						S0_M11.loc_nm.as("loc_nm"),
						S0_M11.str_ln_tgt_flg,
						S0_T4.ship_str_ln_cd.as("str_ln_cd"),
						S0_M12.str_ln_nm,
						S0_T4.lot_no,
						S0_T4.sublot_no,
						S0_T4.ver_no,
						S0_M6.ver_flg,
						S0_T1.not_lot_mix_flg,
						S0_T1.not_sublot_mix_flg,
						S0_T4.gd_cd,
						S0_M13.gd_nm,
						S0_T4.quality_typ,
						S0_T4.stk_insp_typ,
						S0_T4.stk_id_typ,
						S0_T4.stk_bp_cd,
						S0_M14.bp_nm.as("stk_bp_nm"),
						S0_T2.alloc_grp_cd,
						S0_M15.alloc_grp_nm,
						decode(
							S0_T1.ship_fr_lg_grp_cd,
							S0_M36.lg_grp_cd,
							S0_T2.def_loc_cd,
							nullValue()
						).as("def_loc_cd"),
						decode(
							S0_T1.ship_fr_lg_grp_cd,
							S0_M36.lg_grp_cd,
							S0_M36.loc_nm,
							nullValue()
						).as("def_loc_nm"),
						decode(
							S0_T1.ship_fr_lg_grp_cd,
							S0_M36.lg_grp_cd,
							S0_M24.ship_loc_prio_flg,
							value(false)
						).as("ship_loc_prio_flg"),
						S0_T6.assort_typ,
						S0_T3.set_itm_grp_no,
						S0_T1.base_dlv_slip_no,
						S0_T1.base_prov_act_no,
						S0_T1.base_ac_dt,
						S0_T1.ship_cnt_rmrks,
						S0_T1.trd_rmrks,
						S0_T1.trd_d_rmrks,
						S0_T3.slo_no,
						S0_T2.slo_d_no,
						S0_T2.xfr_schd_no,
						cases()
							.when(S0_T2.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.PROV_RTN.value())))
								.then(value(false))
							.otherwise(
								nvl(
									S0_M17.cst_iv_flg,
									nvl(
										S0_M22.iv_trd_flg,
										S0_M221.iv_trd_flg
									)
								)
							).as("iv_trd_flg"),
						S0_T1.ship_schd_no,
						S0_T4.ship_alloc_sts_no,
						S0_T2.ship_inst_typ,
						S0_T1.ship_fr_lg_grp_cd,
						S0_M24.lg_grp_nm.as("ship_fr_lg_grp_nm"),
						nvl2(
							S0_T1.tdlv_cd,
							S0_T1.tdlv_lg_grp_cd,
							decode(
								S0_T2.ship_to_id_typ,
								value(MSC_SHIP_TO_ID_TYP.DLV.value()),
								nvl2(
									S0_T1.dlv_cd,
									S0_T1.dlv_lg_grp_cd,
									S0_T2.ship_to_lg_grp_cd
								),
								S0_T2.ship_to_lg_grp_cd
							)
						).as("ship_to_lg_grp_cd"),
						S0_M25.lg_grp_nm.as("ship_to_lg_grp_nm"),
						nvl2(
							S0_T1.tdlv_cd,
							S0_T1.tdlv_cntct_dpt,
							decode(
								S0_T2.ship_to_id_typ,
								value(MSC_SHIP_TO_ID_TYP.DLV.value()),
								nvl2(
									S0_T1.dlv_cd,
									S0_T1.dlv_cntct_dpt,
									S0_T2.ship_to_cntct_dpt
								),
								S0_T2.ship_to_cntct_dpt
							)
						).as("ship_to_cntct_dpt"),
						nvl2(
							S0_T1.tdlv_cd,
							S0_T1.tdlv_cntct_psn,
							decode(
								S0_T2.ship_to_id_typ,
								value(MSC_SHIP_TO_ID_TYP.DLV.value()),
								nvl2(
									S0_T1.dlv_cd,
									S0_T1.dlv_cntct_psn,
									S0_T2.ship_to_cntct_psn
								),
								S0_T2.ship_to_cntct_psn
							)
						).as("ship_to_cntct_psn"),
						nvl2(
							S0_T1.tdlv_cd,
							S0_T1.tdlv_tel,
							decode(
								S0_T2.ship_to_id_typ,
								value(MSC_SHIP_TO_ID_TYP.DLV.value()),
								nvl2(
									S0_T1.dlv_cd,
									S0_T1.dlv_tel,
									S0_T2.ship_to_tel
								),
								S0_T2.ship_to_tel
							)
						).as("ship_to_tel"),
						nvl2(
							S0_T1.tdlv_cd,
							S0_T1.tdlv_fax,
							decode(
								S0_T2.ship_to_id_typ,
								value(MSC_SHIP_TO_ID_TYP.DLV.value()),
								nvl2(
									S0_T1.dlv_cd,
									S0_T1.dlv_fax,
									S0_T2.ship_to_fax
								),
								S0_T2.ship_to_fax
							)
						).as("ship_to_fax"),
						nvl2(
							S0_T1.tdlv_cd,
							S0_T1.tdlv_sundry_flg,
							decode(
								S0_T2.ship_to_id_typ,
								value(MSC_SHIP_TO_ID_TYP.DLV.value()),
								nvl2(
									S0_T1.dlv_cd,
									S0_T1.dlv_sundry_flg,
									S0_T2.ship_to_sundry_flg
								),
								S0_T2.ship_to_sundry_flg
							)
						).as("ship_to_sundry_flg"),
						nvl(S0_T1.via_dlv_typ, S0_T2.via_dlv_typ).as("via_dlv_typ"),
						S0_M33.cntry_cd.as("ship_to_cntry_cd"),
						S0_M33.cntry_nm.as("ship_to_cntry_nm"),
						S0_M6.sno1_mng_typ,
						S0_M6.sno2_mng_typ,
						S0_M6.sno3_mng_typ,
						S0_M6.sno4_mng_typ,
						S0_M10.conv_base_qty.as("base_unit_conv_base_qty"),
						S0_M10.conv_qty.as("base_unit_conv_qty"),
						S0_M10.rnd_typ.as("base_unit_rnd_typ"),
						S0_T2.cst_cd,
						S0_M17.bp_nm.as("cst_nm"),
						S0_T1.ship_pr_no,
						S0_T4.ship_inst_d_no,
						S0_T10.ship_inst_no,
						S0_T2.alloc_typ,
						S0_T4.alloc_scope_typ,
						S0_T1.iv_itm_nm,
						S0_T1.sno1_null_flg,
						S0_T1.sno2_null_flg,
						S0_T1.sno3_null_flg,
						S0_T1.sno4_null_flg,
						S0_T4.stk_arrv_bp_cd,
						S0_T2.trd_ptn_typ,
						S0_M6.itm_typ,
						nullValue().as("itm_typ_nm"),
						S0_M6.itm_typ_d_cd,
						S0_M18.itm_typ_d_nm,
						S0_T1.ins_usr_id,
						S0_T1.ins_usr_nm,
						S0_T1.ins_func_id,
						S0_T1.ins_ts,
						S0_T1.upd_usr_id,
						S0_T1.upd_usr_nm,
						S0_T1.upd_func_id,
						S0_T1.upd_ts,
						S0_T1.upd_srv_req_no,
						S0_T1.upd_cntr,
						S0_T2.upd_cntr.as("ship_pr_upd_cntr"),
						addDynamicSelect(DS0C_DLV_GRP),
						addDynamicSelect(DS0C_CST_GRP),
						addDynamicSelect(DS0C_ITM_GRP)
					)
					.from(
						S0_T1
						.innerJoin(S0_T2).on(S0_T2.ship_pr_no.eq(S0_T1.ship_pr_no))
						.leftOuterJoin(S0_T3).on(S0_T3.slo_d_no.eq(S0_T2.slo_d_no))
						.innerJoin(S0_T4).on(S0_T4.ship_schd_no.eq(S0_T1.ship_schd_no))
						.leftOuterJoin(S0_T5).on(
							S0_T5.itm_cd.eq(S0_T1.itm_cd)
							.and(S0_T5.itm_sub1.eq(S0_T1.itm_sub1))
							.and(S0_T5.itm_sub2.eq(S0_T1.itm_sub2))
							.and(S0_T5.itm_sub3.eq(S0_T1.itm_sub3))
							.and(S0_T5.lot_no.eq(S0_T4.lot_no))
							.and(S0_T5.sublot_no.eq(S0_T4.sublot_no))
						)
						.leftOuterJoin(S0_T6).on(S0_T6.slo_no.eq(S0_T3.slo_no))
						.leftOuterJoin(S0_T10).on(S0_T10.ship_inst_d_no.eq(S0_T1.ship_inst_d_no))
						.leftOuterJoin(S0_T11).on(S0_T11.sno1.eq(S0_T1.sno1))
						.leftOuterJoin(S0_M1).on(S0_M1.ship_term_cd.eq(S0_T1.ship_term_cd))
						.leftOuterJoin(S0_M2).on(S0_M2.ship_wk_cd.eq(S0_T1.ship_wk_cd))
						.leftOuterJoin(S0_M3).on(
							S0_M3.dpt_cd.eq(S0_T2.rqst_dpt_cd)
							.and(S0_M3.st_dt.lte(S0_T2.ship_schd_tm))
							.and(S0_M3.end_dt.gte(S0_T2.ship_schd_tm))
						)
						.leftOuterJoin(S0_M4).on(S0_M4.usr_cd.eq(S0_T2.rqst_usr_cd))
						.leftOuterJoin(S0_M5).on(S0_M5.trd_cd.eq(S0_T2.trd_cd))
						.leftOuterJoin(S0_M6).on(
							S0_M6.itm_cd.eq(S0_T1.itm_cd)
							.and(S0_M6.itm_sub1.eq(S0_T1.itm_sub1))
							.and(S0_M6.itm_sub2.eq(S0_T1.itm_sub2))
							.and(S0_M6.itm_sub3.eq(S0_T1.itm_sub3))
						)
						.leftOuterJoin(S0_M7).on(S0_M7.unit_cd.eq(S0_T1.trd_unit_cd))
						.leftOuterJoin(S0_M77).on(S0_M77.unit_cd.eq(S0_T4.ent_unit_cd))
						.leftOuterJoin(S0_M78).on(
							S0_M78.itm_cd.eq(S0_T1.itm_cd)
							.and(S0_M78.itm_sub1.eq(S0_T1.itm_sub1))
							.and(S0_M78.itm_sub2.eq(S0_T1.itm_sub2))
							.and(S0_M78.itm_sub3.eq(S0_T1.itm_sub3))
							.and(S0_M78.unit_cd.eq(S0_T4.ent_unit_cd))
						)
						.leftOuterJoin(S0_M8).on(S0_M8.unit_cd.eq(S0_T1.base_unit_cd))
						.leftOuterJoin(S0_M9).on(S0_M9.unit_cd.eq(S0_M6.cont_fctr_unit_cd))
						.leftOuterJoin(S0_M10).on(
							S0_M10.itm_cd.eq(S0_T1.itm_cd)
							.and(S0_M10.itm_sub1.eq(S0_T1.itm_sub1))
							.and(S0_M10.itm_sub2.eq(S0_T1.itm_sub2))
							.and(S0_M10.itm_sub3.eq(S0_T1.itm_sub3))
							.and(S0_M10.unit_cd.eq(S0_T1.base_unit_cd))
						)
						.leftOuterJoin(S0_M11).on(S0_M11.loc_cd.eq(S0_T4.ship_loc_cd))
						.leftOuterJoin(S0_M12).on(
							S0_M12.loc_cd.eq(S0_T4.ship_loc_cd)
							.and(S0_M12.str_ln_cd.eq(S0_T4.ship_str_ln_cd))
						)
						.leftOuterJoin(S0_M13).on(S0_M13.gd_cd.eq(S0_T4.gd_cd))
						.leftOuterJoin(S0_M14).on(S0_M14.bp_cd.eq(S0_T4.stk_bp_cd))
						.leftOuterJoin(S0_M15).on(S0_M15.alloc_grp_cd.eq(S0_T2.alloc_grp_cd))
						.leftOuterJoin(S0_M16).on(S0_M16.wg_cd.eq(S0_T1.wg_cd))
						.leftOuterJoin(S0_M17).on(S0_M17.bp_cd.eq(S0_T2.cst_cd))
						.leftOuterJoin(S0_M18).on(
							S0_M18.itm_typ.eq(S0_M6.itm_typ)
							.and(S0_M18.itm_typ_d_cd.eq(S0_M6.itm_typ_d_cd))
						)
						.leftOuterJoin(S0_M19).on(S0_M19.site_cd.eq(S0_M11.site_cd))
						.leftOuterJoin(S0_M21).on(
							S0_M21.bp_cd.eq(nvl(
									S0_T1.dlv_cd,
									S0_T2.dlv_id_cd
								)
							)
						)
						.leftOuterJoin(S0_M31).on(
							S0_M31.dlv_id_typ.eq(S0_T2.dlv_id_typ)
							.and(
								S0_M31.dlv_id_cd.eq(nvl(
										S0_T1.dlv_cd,
										S0_T2.dlv_id_cd
									)
								)
							)
						)
						.leftOuterJoin(S0_M33).on(
							S0_M33.ship_to_id_typ.eq(nvl2(
									S0_T1.tdlv_cd,
									value(MSC_SHIP_TO_ID_TYP.TDLV.value()),
									S0_T2.ship_to_id_typ
								)
							)
							.and(
								S0_M33.ship_to_id_cd.eq(nvl(
										nvl(
											S0_T1.tdlv_cd,
											decode(
												S0_T2.ship_to_id_typ,
												value(MSC_SHIP_TO_ID_TYP.DLV.value()),
												S0_T1.dlv_cd,
												nullValue()
											)
										),
										S0_T2.ship_to_id_cd
									)
								)
							)
						)
						.leftOuterJoin(S0_M22).on(
							S0_M22.fr_lg_grp_cd.eq(S0_T1.ship_fr_lg_grp_cd)
							.and(S0_M22.to_lg_grp_cd.eq(S0_M31.lg_grp_cd))
							.and(S0_M22.ship_term_cd.eq(S0_T1.ship_term_cd))
						)
						.leftOuterJoin(S0_M25).on(
							S0_M25.lg_grp_cd.eq(nvl2(
									S0_T1.tdlv_cd,
									S0_T1.tdlv_lg_grp_cd,
									decode(
										S0_T2.ship_to_id_typ,
										value(MSC_SHIP_TO_ID_TYP.DLV.value()),
										nvl2(
											S0_T1.dlv_cd,
											S0_T1.dlv_lg_grp_cd,
											S0_T2.ship_to_lg_grp_cd
										),
										S0_T2.ship_to_lg_grp_cd
									)
								)
							)
						)
						.leftOuterJoin(S0_M22_1).on(
							S0_M22_1.fr_lg_grp_cd.eq(S0_T1.ship_fr_lg_grp_cd)
							.and(S0_M22_1.to_lg_grp_cd.eq(S0_M25.lg_grp_cd))
							.and(S0_M22_1.ship_term_cd.eq(S0_T1.ship_term_cd))
						)
						.leftOuterJoin(S0_M23).on(S0_M23.ship_wk_grp_cd.eq(S0_M22_1.ship_wk_grp_cd))
						.leftOuterJoin(S0_M221).on(
							S0_M221.fr_lg_grp_cd.eq(S0_T1.ship_fr_lg_grp_cd)
							.and(S0_M221.to_lg_grp_cd.eq(S0_M31.lg_grp_cd))
							.and(S0_M221.ship_term_cd.eq(value(MAC_STR.NULL_VAL.value())))
						)
						.leftOuterJoin(S0_M221_1).on(
							S0_M221_1.fr_lg_grp_cd.eq(S0_T1.ship_fr_lg_grp_cd)
							.and(S0_M221_1.to_lg_grp_cd.eq(S0_M25.lg_grp_cd))
							.and(S0_M221_1.ship_term_cd.eq(value(MAC_STR.NULL_VAL.value())))
						)
						.leftOuterJoin(S0_M231).on(S0_M231.ship_wk_grp_cd.eq(S0_M221_1.ship_wk_grp_cd))
						.leftOuterJoin(S0_M24).on(S0_M24.lg_grp_cd.eq(S0_T1.ship_fr_lg_grp_cd))
						.leftOuterJoin(S0_M26).on(
							S0_M26.itm_cd.eq(S0_T1.itm_cd)
							.and(S0_M26.itm_sub1.eq(S0_T1.itm_sub1))
							.and(S0_M26.itm_sub2.eq(S0_T1.itm_sub2))
							.and(S0_M26.itm_sub3.eq(S0_T1.itm_sub3))
							.and(S0_M26.unit_cd.eq(S0_T1.trd_unit_cd))
						)
						.leftOuterJoin(S0_M35).on(
							S0_T1.itm_cd.eq(S0_M35.itm_cd)
							.and(S0_T1.itm_sub1.eq(S0_M35.itm_sub1))
							.and(S0_T1.itm_sub2.eq(S0_M35.itm_sub2))
							.and(S0_T1.itm_sub3.eq(S0_M35.itm_sub3))
							.and(S0_T4.sno1.eq(S0_M35.sno1))
							.and(S0_T4.sno2.eq(S0_M35.sno2))
							.and(S0_T4.sno3.eq(S0_M35.sno3))
							.and(S0_T4.sno4.eq(S0_M35.sno4))
						)
						.leftOuterJoin(S0_M36).on(S0_M36.loc_cd.eq(S0_T2.def_loc_cd))
						.addDynamicView(DS0C_DLV_GRP)
						.addDynamicView(DS0C_CST_GRP)
						.addDynamicView(DS0C_ITM_GRP)
					)
					.where(
						value(0).eq(value(0))
						.cutoff$and(S0_T1.ship_fr_lg_grp_cd.like(bind("lg_grp_cd")))
						.and(S0_T2.abort_flg.eq(value(false))
						.or(bracket(S0_T2.abort_flg.eq(value(true)).and(S0_T2.ship_schd_abort_qty.lt(S0_T2.base_unit_qty)))))
						.and(S0_T1.ship_skip_flg.eq(value(false)))
						.and(S0_T1.ship_inst_d_no.isNull())
						.and(
							exists(
								subQuery()
								.select(value("X"))
								.from(S1_RD1)
								.where(
									S1_RD1.lg_grp_cd.eq(S0_T1.ship_fr_lg_grp_cd)
								)
							)
							.or(
								exists(
									subQuery()
									.select(value("X"))
									.from(S2_RD2)
									.where(
										S2_RD2.loc_cd.eq(S0_T2.ship_to_id_cd)
										.and(S0_T2.ship_to_id_typ.eq(value(MSC_SHIP_TO_ID_TYP.LOC.value())))
									)
								)
							)
						)
						.and(
							value(true).eq(value(false))
							.cutoff$or(S0_T1.pr_sts_typ.eq(bind("tmp_sts_not_inst")))
							.cutoff$or(S0_T1.pr_sts_typ.eq(bind("tmp_sts_inst")))
							.cutoff$or(S0_T1.pr_sts_typ.eq(bind("tmp_sts_not_ship")))
							.cutoff$or(S0_T1.pr_sts_typ.eq(bind("tmp_sts_part_ship")))
							.cutoff$or(S0_T1.pr_sts_typ.eq(bind("tmp_sts_ship")))
						)
						.cutoff$and(
							bracket(
								bracket(
									bind("not_alloc_flg_str").eq(value(true))
									.and(
										S0_T2.alloc_typ.in(
											value(MAC_ALLOC_TYP.IMMED.value()),
											value(MAC_ALLOC_TYP.LATER.value())
										)
										.or(S0_T2.alloc_typ.eq(value(MAC_ALLOC_TYP.NON.value())))
										.and(S0_T2.xfr_schd_no.isNotNull())
									)
									.and(S0_T4.alloc_flg.eq(value(false)))
								)
								.or(
									bind("all_alloc_flg_str").eq(value(true))
									.and(S0_T4.alloc_flg.eq(value(true)))
								)
								.or(
									bind("alloc_invalid_flg_str").eq(value(true))
									.and(
										S0_T2.alloc_typ.eq(value(MAC_ALLOC_TYP.NON.value()))
										.and(S0_T2.xfr_schd_no.isNull())
										.or(S0_T2.alloc_typ.isNull())
									)
									.and(S0_T4.alloc_flg.eq(value(false)))
								)
							)
						)
						.cutoff$and(S0_T1.ship_block_flg.eq(bind("tmp_ship_block")))
						.cutoff$and(
							bind("tmp_dlv_rqst").eq(value(0))
							.and(
								MAPA_DT$F_IS_BEFORE_AFTER(
									S0_T1.dlv_schd_tm,
									S0_T2.dlv_rqst_tm
								).eq(value(false))
							)
						)
						.cutoff$and(
							bind("tmp_ship_rqst").eq(value(0))
							.and(
								MAPA_DT$F_IS_BEFORE_AFTER(
									S0_T1.ship_schd_tm,
									S0_T1.ship_rqst_tm
								).eq(value(false))
							)
						)
						.cutoff$and(
							bind("tmp_pd_inst_dlv").eq(value(0))
							.and(
								MAPA_DT$F_IS_BEFORE_AFTER(
									S0_T1.dlv_schd_tm,
									S0_T1.pd_inst_dlv_tm
								).eq(value(false))
							)
						)
						.cutoff$and(S0_T1.abort_flg.eq(bind("tmp_abort_flg")))
						.cutoff$and(S0_T1.wg_cd.like(bind("wg_cd")))
						.cutoff$and(S0_M16.wg_nm.like(bind("wg_nm")))
						.cutoff$and(S0_T1.ship_schd_tm.gte(bind("ship_schd_hm_fr")))
						.cutoff$and(S0_T1.ship_schd_tm.lte(bind("ship_schd_hm_to")))
						.cutoff$and(S0_T1.dlv_schd_tm.gte(bind("dlv_schd_hm_fr")))
						.cutoff$and(S0_T1.dlv_schd_tm.lte(bind("dlv_schd_hm_to")))
						.cutoff$and(S0_T4.ship_loc_cd.like(bind("loc_cd")))
						.cutoff$and(S0_M11.loc_nm.like(bind("loc_nm")))
						.cutoff$and(S0_T4.ship_str_ln_cd.like(bind("str_ln_cd")))
						.cutoff$and(S0_M12.str_ln_nm.like(bind("str_ln_nm")))
						.cutoff$and(S0_T2.alloc_grp_cd.like(bind("alloc_grp_cd")))
						.cutoff$and(S0_M15.alloc_grp_nm.like(bind("alloc_grp_nm")))
						.cutoff$and(
							nvl2(
								S0_T1.tdlv_cd,
								value(MSC_SHIP_TO_ID_TYP.TDLV.value()),
								S0_T2.ship_to_id_typ
							).like(bind("ship_to_id_typ"))
						)
						.cutoff$and(
							nvl(
								nvl(
									S0_T1.tdlv_cd,
									decode(
										S0_T2.ship_to_id_typ,
										value(MSC_SHIP_TO_ID_TYP.DLV.value()),
										S0_T1.dlv_cd,
										nullValue()
									)
								),
								S0_T2.ship_to_id_cd
							).like(bind("ship_to_id_cd"))
						)
						.cutoff$and(
							nvl2(
								S0_T1.tdlv_cd,
								nvl(
									S0_T1.tdlv_nm,
									S0_M33.ship_to_id_nm
								),
								decode(
									S0_T2.ship_to_id_typ,
									value(MSC_SHIP_TO_ID_TYP.DLV.value()),
									nvl2(
										S0_T1.dlv_cd,
										nvl(
											S0_T1.dlv_nm,
											S0_M33.ship_to_id_nm
										),
										nvl(
											S0_T2.ship_to_id_nm,
											S0_M33.ship_to_id_nm
										)
									),
									nvl(
										S0_T2.ship_to_id_nm,
										S0_M33.ship_to_id_nm
									)
								)
							).like(bind("ship_to_id_nm"))
						)
						.cutoff$and(S0_T2.dlv_id_typ.like(bind("dlv_id_typ")))
						.cutoff$and(
							nvl(
								S0_T1.dlv_cd,
								S0_T2.dlv_id_cd
							).like(bind("dlv_id_cd"))
						)
						.cutoff$and(
							nvl2(
								S0_T1.dlv_cd,
								nvl(
									S0_T1.dlv_nm,
									S0_M31.dlv_id_nm
								),
								nvl(
									S0_T2.dlv_id_nm,
									S0_M31.dlv_id_nm
								)
							).like(bind("dlv_id_nm"))
						)
						.cutoff$and(
							nvl(
								S0_T1.via_dlv_typ,
								S0_T2.via_dlv_typ
							).like(bind("via_dlv_typ"))
						)
						.cutoff$and(S0_T2.cst_cd.like(bind("cst_cd")))
						.cutoff$and(S0_M17.bp_nm.like(bind("cst_nm")))
						.cutoff$and(S0_T1.ship_term_cd.like(bind("ship_term_cd")))
						.cutoff$and(S0_M1.ship_term_nm.like(bind("ship_term_nm")))
						.cutoff$and(S0_T1.ship_wk_cd.like(bind("ship_wk_cd")))
						.cutoff$and(S0_M2.ship_wk_nm.like(bind("ship_wk_nm")))
						.cutoff$and(S0_T2.trd_cd.like(bind("trd_cd")))
						.cutoff$and(S0_M5.trd_nm.like(bind("trd_nm")))
						.cutoff$and(S0_M6.itm_typ.like(bind("itm_typ")))
						.cutoff$and(S0_M6.itm_typ_d_cd.like(bind("itm_typ_d_cd")))
						.cutoff$and(S0_M18.itm_typ_d_nm.like(bind("itm_typ_d_nm")))
						.cutoff$and(S0_T1.itm_cd.like(bind("itm_cd")))
						.cutoff$and(S0_T1.itm_sub1.like(bind("itm_sub1")))
						.cutoff$and(S0_T1.itm_sub2.like(bind("itm_sub2")))
						.cutoff$and(S0_T1.itm_sub3.like(bind("itm_sub3")))
						.cutoff$and(
							decode(
								S0_M6.sundry_itm_flg,
								value(true),
								nvl(
									S0_T1.itm_nm,
									S0_M35.itm_nm
								),
								S0_M6.itm_nm
							).like(bind("itm_nm"))
						)
						.cutoff$and(S0_T3.cst_itm_cd.like(bind("cst_itm_cd")))
						.cutoff$and(S0_T3.cst_itm_nm.like(bind("cst_itm_nm")))
						.cutoff$and(S0_T2.rqst_dpt_cd.like(bind("rqst_dpt_cd")))
						.cutoff$and(S0_M3.dpt_nm.like(bind("rqst_dpt_nm")))
						.cutoff$and(S0_T2.rqst_usr_cd.like(bind("rqst_usr_cd")))
						.cutoff$and(S0_M4.usr_nm.like(bind("rqst_usr_nm")))
						.cutoff$and(S0_T2.ship_inst_typ.like(bind("ship_inst_typ")))
						.cutoff$and(S0_T1.ship_schd_no.like(bind("ship_schd_no")))
						.cutoff$and(S0_T3.slo_no.like(bind("slo_no")))
						.cutoff$and(S0_T2.slo_d_no.like(bind("slo_d_no")))
						.cutoff$and(S0_T2.xfr_schd_no.like(bind("xfr_schd_no")))
						.cutoff$and(S0_T10.ship_inst_no.like(bind("ship_inst_no")))
						.cutoff$and(S0_T1.ship_inst_d_no.like(bind("ship_inst_d_no")))
						.cutoff$and(S0_T1.ship_cnt_rmrks.like(bind("ship_cnt_rmrks")))
						.cutoff$and(S0_T1.trd_rmrks.like(bind("trd_rmrks")))
						.cutoff$and(S0_T1.trd_d_rmrks.like(bind("trd_d_rmrks")))
						.cutoff$and(S0_M11.site_cd.like(bind("site_cd")))
						.cutoff$and(S0_M19.site_nm.like(bind("site_nm")))
						.cutoff$and(S0_T4.ver_no.like(bind("ver_no")))
						.cutoff$and(S0_T4.lot_no.like(bind("lot_no")))
						.cutoff$and(S0_T4.sublot_no.like(bind("sublot_no")))
						.cutoff$and(S0_T1.sno1.like(bind("sno1")))
						.cutoff$and(S0_T1.sno2.like(bind("sno2")))
						.cutoff$and(S0_T1.sno3.like(bind("sno3")))
						.cutoff$and(S0_T1.sno4.like(bind("sno4")))
						.cutoff$and(S0_T11.wrk_no.like(bind("wrk_no")))
						.cutoff$and(S0_T11.wrk_nm.like(bind("wrk_nm")))
						.addDynamicPredicate(DS0C_DLV_GRP)
						.addDynamicPredicate(DS0C_CST_GRP)
						.addDynamicPredicate(DS0C_ITM_GRP)
					)
					.unionAll(
						subQuery()
						.select(
							S3_T1.pr_sts_typ,
							S3_T1.ship_abl_flg,
							S3_T1.fix_flg,
							trunc(
								S3_T2.dlv_rqst_tm,
								MCDateFmt.DD
							).as("dlv_rqst_dt"),
							S3_T2.dlv_rqst_tm.as("dlv_rqst_hm"),
							trunc(
								S3_T1.pd_inst_dlv_tm,
								MCDateFmt.DD
							).as("pd_inst_dlv_dt"),
							S3_T1.pd_inst_dlv_tm.as("pd_inst_dlv_hm"),
							nvl(
								S3_T1.dlv_day_week_typ,
								S3_T3.dlv_day_week_typ
							).as("dlv_day_week_typ"),
							trunc(
								S3_T1.ship_rqst_tm,
								MCDateFmt.DD
							).as("ship_rqst_dt"),
							S3_T1.ship_rqst_tm.as("ship_rqst_hm"),
							trunc(
								S3_T1.ship_schd_tm,
								MCDateFmt.DD
							).as("src_ship_schd_dt"),
							S3_T1.ship_schd_tm.as("src_ship_schd_hm"),
							trunc(
								S3_T1.ship_schd_tm,
								MCDateFmt.DD
							).as("ship_schd_dt"),
							S3_T1.ship_schd_tm.as("ship_schd_hm"),
							trunc(
								S3_T1.dlv_schd_tm,
								MCDateFmt.DD
							).as("dlv_schd_dt"),
							S3_T1.dlv_schd_tm.as("dlv_schd_hm"),
							S3_T1.ship_block_flg,
							S3_T1.ship_term_cd,
							S3_M1.ship_term_nm,
							decode(
								S3_M22_1.ship_term_cd,
								nullValue(),
								S3_M221_1.ship_wk_grp_cd,
								S3_M22_1.ship_wk_grp_cd
							).as("ship_wk_grp_cd"),
							decode(
								S3_M22_1.ship_term_cd,
								nullValue(),
								S3_M231.ship_wk_grp_nm,
								S3_M23.ship_wk_grp_nm
							).as("ship_wk_grp_nm"),
							S3_T1.ship_wk_cd,
							S3_M2.ship_wk_nm,
							nvl2(
								S3_T1.tdlv_cd,
								value(MSC_SHIP_TO_ID_TYP.TDLV.value()),
								S3_T2.ship_to_id_typ
							).as("ship_to_id_typ"),
							nvl(
								nvl(
									S3_T1.tdlv_cd,
									decode(
										S3_T2.ship_to_id_typ,
										value(MSC_SHIP_TO_ID_TYP.DLV.value()),
										S3_T1.dlv_cd,
										nullValue()
									)
								),
								S3_T2.ship_to_id_cd
							).as("ship_to_id_cd"),
							nvl2(
								S3_T1.tdlv_cd,
								nvl(
									S3_T1.tdlv_nm,
									S3_M33.ship_to_id_nm
								),
								decode(
									S3_T2.ship_to_id_typ,
									value(MSC_SHIP_TO_ID_TYP.DLV.value()),
									nvl2(
										S3_T1.dlv_cd,
										nvl(
											S3_T1.dlv_nm,
											S3_M33.ship_to_id_nm
										),
										nvl(
											S3_T2.ship_to_id_nm,
											S3_M33.ship_to_id_nm
										)
									),
									nvl(
										S3_T2.ship_to_id_nm,
										S3_M33.ship_to_id_nm
									)
								)
							).as("ship_to_id_nm"),
							nvl2(
								S3_T1.tdlv_cd,
								S3_T1.tdlv_zip_cd,
								decode(
									S3_T2.ship_to_id_typ,
									value(MSC_SHIP_TO_ID_TYP.DLV.value()),
									nvl2(
										S3_T1.dlv_cd,
										S3_T1.dlv_zip_cd,
										S3_T2.ship_to_zip_cd
									),
									S3_T2.ship_to_zip_cd
								)
							).as("ship_to_zip_cd"),
							nvl2(
								S3_T1.tdlv_cd,
								S3_T1.tdlv_addr1,
								decode(
									S3_T2.ship_to_id_typ,
									value(MSC_SHIP_TO_ID_TYP.DLV.value()),
									nvl2(
										S3_T1.dlv_cd,
										S3_T1.dlv_addr1,
										S3_T2.ship_to_addr1
									),
									S3_T2.ship_to_addr1
								)
							).as("ship_to_addr1"),
							nvl2(
								S3_T1.tdlv_cd,
								S3_T1.tdlv_addr2,
								decode(
									S3_T2.ship_to_id_typ,
									value(MSC_SHIP_TO_ID_TYP.DLV.value()),
									nvl2(
										S3_T1.dlv_cd,
										S3_T1.dlv_addr2,
										S3_T2.ship_to_addr2
									),
									S3_T2.ship_to_addr2
								)
							).as("ship_to_addr2"),
							nvl2(
								S3_T1.tdlv_cd,
								S3_T1.tdlv_addr3,
								decode(
									S3_T2.ship_to_id_typ,
									value(MSC_SHIP_TO_ID_TYP.DLV.value()),
									nvl2(
										S3_T1.dlv_cd,
										S3_T1.dlv_addr3,
										S3_T2.ship_to_addr3
									),
									S3_T2.ship_to_addr3
								)
							).as("ship_to_addr3"),
							nvl2(
								S3_T1.tdlv_cd,
								S3_T1.tdlv_addr4,
								decode(
									S3_T2.ship_to_id_typ,
									value(MSC_SHIP_TO_ID_TYP.DLV.value()),
									nvl2(
										S3_T1.dlv_cd,
										S3_T1.dlv_addr4,
										S3_T2.ship_to_addr4
									),
									S3_T2.ship_to_addr4
								)
							).as("ship_to_addr4"),
							S3_T2.dlv_id_typ,
							nvl(
								S3_T1.dlv_cd,
								S3_T2.dlv_id_cd
							).as("dlv_id_cd"),
							nvl2(
								S3_T1.dlv_cd,
								nvl(
									S3_T1.dlv_nm,
									S3_M31.dlv_id_nm
								),
								nvl(
									S3_T2.dlv_id_nm,
									S3_M31.dlv_id_nm
								)
							).as("dlv_id_nm"),
							S3_T2.rqst_dpt_cd,
							S3_M3.dpt_nm.as("rqst_dpt_nm"),
							S3_T2.rqst_usr_cd,
							S3_M4.usr_nm.as("rqst_usr_nm"),
							S3_T2.trd_cd,
							S3_M5.trd_nm,
							S3_T1.itm_cd,
							S3_T1.itm_sub1,
							S3_T1.itm_sub2,
							S3_T1.itm_sub3,
							decode(
								S3_M6.sundry_itm_flg,
								value(true),
								nvl(
									S3_T1.itm_nm,
									S3_M35.itm_nm
								),
								S3_M6.itm_nm
							).as("itm_nm"),
							S3_T3.cst_itm_cd,
							S3_T3.cst_itm_nm,
							S3_M6.stk_mng_typ,
							S3_M6.dscnt_itm_flg,
							S3_M6.lot_mng_typ,
							S3_M6.lot_no_typ,
							S3_M6.sublot_mng_typ,
							S3_M6.sublot_no_typ,
							S3_T1.sno1,
							S3_T1.sno2,
							S3_T1.sno3,
							S3_T1.sno4,
							S3_T11.wrk_no,
							S3_T11.wrk_nm,
							S3_T4.sno1.as("alloc_sno1"),
							S3_T4.sno2.as("alloc_sno2"),
							S3_T4.sno3.as("alloc_sno3"),
							S3_T4.sno4.as("alloc_sno4"),
							S3_T1.trd_unit_cd,
							S3_M7.unit_nm.as("trd_unit_nm"),
							S3_M26.dec_place.as("trd_unit_dec_place"),
							S3_M26.conv_base_qty.as("trd_unit_conv_base_qty"),
							S3_M26.conv_qty.as("trd_unit_conv_qty"),
							S3_T1.abort_flg,
							S3_T1.trd_unit_qty,
							S3_T4.ent_unit_cd.as("alloc_ent_unit_cd"),
							S3_M77.unit_nm.as("alloc_ent_unit_nm"),
							S3_M78.dec_place.as("alloc_ent_unit_dec_place"),
							S3_M78.conv_base_qty.as("alloc_ent_unit_conv_base_qty"),
							S3_M78.conv_qty.as("alloc_ent_unit_conv_qty"),
							S3_M78.rnd_typ.as("alloc_ent_unit_rnd_typ"),
							S3_T4.ent_unit_qty.as("alloc_ent_unit_qty"),
							S3_T1.base_unit_cd,
							S3_M8.unit_nm.as("base_unit_nm"),
							S3_M10.dec_place.as("base_unit_dec_place"),
							S3_T1.base_unit_qty,
							S3_T4.base_unit_qty.as("alloc_base_unit_qty"),
							S3_T1.alloc_qty,
							S3_T1.wait_qty,
							S3_T1.ship_inst_qty,
							S3_T1.ship_act_qty,
							S3_T1.iv_schd_qty,
							S3_T1.iv_act_qty,
							S3_T5.act_cont_fctr,
							S3_M6.std_cont_fctr,
							S3_M6.cont_fctr_unit_cd,
							S3_M9.unit_nm.as("cont_fctr_unit_nm"),
							S3_M6.cont_fctr_flg,
							S3_M6.cont_fctr_rnd_typ,
							S3_M6.cont_fctr_dec_place,
							nvl(
								S3_M78.unit_wt,
								value(0)
							).multiply(S3_T4.ent_unit_qty).as("wt"),
							nvl(
								S3_M78.unit_dim,
								value(0)
							).multiply(S3_T4.ent_unit_qty).as("dim"),
							S3_T4.alloc_flg,
							S3_T4.ship_loc_cd.as("loc_cd"),
							S3_M11.loc_nm.as("loc_nm"),
							S3_M11.str_ln_tgt_flg,
							S3_T4.ship_str_ln_cd.as("str_ln_cd"),
							S3_M12.str_ln_nm,
							S3_T4.lot_no,
							S3_T4.sublot_no,
							S3_T4.ver_no,
							S3_M6.ver_flg,
							S3_T1.not_lot_mix_flg,
							S3_T1.not_sublot_mix_flg,
							S3_T4.gd_cd,
							S3_M13.gd_nm,
							S3_T4.quality_typ,
							S3_T4.stk_insp_typ,
							S3_T4.stk_id_typ,
							S3_T4.stk_bp_cd,
							S3_M14.bp_nm.as("stk_bp_nm"),
							S3_T2.alloc_grp_cd,
							S3_M15.alloc_grp_nm,
							decode(
								S3_T1.ship_fr_lg_grp_cd,
								S3_M36.lg_grp_cd,
								S3_T2.def_loc_cd,
								nullValue()
							).as("def_loc_cd"),
							decode(
								S3_T1.ship_fr_lg_grp_cd,
								S3_M36.lg_grp_cd,
								S3_M36.loc_nm,
								nullValue()
							).as("def_loc_nm"),
							decode(
								S3_T1.ship_fr_lg_grp_cd,
								S3_M36.lg_grp_cd,
								S3_M24.ship_loc_prio_flg,
								value(false)
							).as("ship_loc_prio_flg"),
							S3_T6.assort_typ,
							S3_T3.set_itm_grp_no,
							S3_T1.base_dlv_slip_no,
							S3_T1.base_prov_act_no,
							S3_T1.base_ac_dt,
							S3_T1.ship_cnt_rmrks,
							S3_T1.trd_rmrks,
							S3_T1.trd_d_rmrks,
							S3_T3.slo_no,
							S3_T2.slo_d_no,
							S3_T2.xfr_schd_no,
							cases()
								.when(S3_T2.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.PROV_RTN.value())))
									.then(value(false))
								.otherwise(
									nvl(
										S3_M17.cst_iv_flg,
										nvl(
											S3_M22.iv_trd_flg,
											S3_M221.iv_trd_flg
										)
									)
								).as("iv_trd_flg"),
							S3_T1.ship_schd_no,
							S3_T4.ship_alloc_sts_no,
							S3_T2.ship_inst_typ,
							S3_T1.ship_fr_lg_grp_cd,
							S3_M24.lg_grp_nm.as("ship_fr_lg_grp_nm"),
							nvl2(
								S3_T1.tdlv_cd,
								S3_T1.tdlv_lg_grp_cd,
								decode(
									S3_T2.ship_to_id_typ,
									value(MSC_SHIP_TO_ID_TYP.DLV.value()),
									nvl2(
										S3_T1.dlv_cd,
										S3_T1.dlv_lg_grp_cd,
										S3_T2.ship_to_lg_grp_cd
									),
									S3_T2.ship_to_lg_grp_cd
								)
							).as("ship_to_lg_grp_cd"),
							S3_M25.lg_grp_nm.as("ship_to_lg_grp_nm"),
							nvl2(
								S3_T1.tdlv_cd,
								S3_T1.tdlv_cntct_dpt,
								decode(
									S3_T2.ship_to_id_typ,
									value(MSC_SHIP_TO_ID_TYP.DLV.value()),
									nvl2(
										S3_T1.dlv_cd,
										S3_T1.dlv_cntct_dpt,
										S3_T2.ship_to_cntct_dpt
									),
									S3_T2.ship_to_cntct_dpt
								)
							).as("ship_to_cntct_dpt"),
							nvl2(
								S3_T1.tdlv_cd,
								S3_T1.tdlv_cntct_psn,
								decode(
									S3_T2.ship_to_id_typ,
									value(MSC_SHIP_TO_ID_TYP.DLV.value()),
									nvl2(
										S3_T1.dlv_cd,
										S3_T1.dlv_cntct_psn,
										S3_T2.ship_to_cntct_psn
									),
									S3_T2.ship_to_cntct_psn
								)
							).as("ship_to_cntct_psn"),
							nvl2(
								S3_T1.tdlv_cd,
								S3_T1.tdlv_tel,
								decode(
									S3_T2.ship_to_id_typ,
									value(MSC_SHIP_TO_ID_TYP.DLV.value()),
									nvl2(
										S3_T1.dlv_cd,
										S3_T1.dlv_tel,
										S3_T2.ship_to_tel
									),
									S3_T2.ship_to_tel
								)
							).as("ship_to_tel"),
							nvl2(
								S3_T1.tdlv_cd,
								S3_T1.tdlv_fax,
								decode(
									S3_T2.ship_to_id_typ,
									value(MSC_SHIP_TO_ID_TYP.DLV.value()),
									nvl2(
										S3_T1.dlv_cd,
										S3_T1.dlv_fax,
										S3_T2.ship_to_fax
									),
									S3_T2.ship_to_fax
								)
							).as("ship_to_fax"),
							nvl2(
								S3_T1.tdlv_cd,
								S3_T1.tdlv_sundry_flg,
								decode(
									S3_T2.ship_to_id_typ,
									value(MSC_SHIP_TO_ID_TYP.DLV.value()),
									nvl2(
										S3_T1.dlv_cd,
										S3_T1.dlv_sundry_flg,
										S3_T2.ship_to_sundry_flg
									),
									S3_T2.ship_to_sundry_flg
								)
							).as("ship_to_sundry_flg"),
							nvl(S3_T1.via_dlv_typ, S3_T2.via_dlv_typ).as("via_dlv_typ"),
							S3_M33.cntry_cd.as("ship_to_cntry_cd"),
							S3_M33.cntry_nm.as("ship_to_cntry_nm"),
							S3_M6.sno1_mng_typ,
							S3_M6.sno2_mng_typ,
							S3_M6.sno3_mng_typ,
							S3_M6.sno4_mng_typ,
							S3_M10.conv_base_qty.as("base_unit_conv_base_qty"),
							S3_M10.conv_qty.as("base_unit_conv_qty"),
							S3_M10.rnd_typ.as("base_unit_rnd_typ"),
							S3_T2.cst_cd,
							S3_M17.bp_nm.as("cst_nm"),
							S3_T1.ship_pr_no,
							S3_T4.ship_inst_d_no,
							S3_T10.ship_inst_no,
							S3_T2.alloc_typ,
							S3_T4.alloc_scope_typ,
							S3_T1.iv_itm_nm,
							S3_T1.sno1_null_flg,
							S3_T1.sno2_null_flg,
							S3_T1.sno3_null_flg,
							S3_T1.sno4_null_flg,
							S3_T4.stk_arrv_bp_cd,
							S3_T2.trd_ptn_typ,
							S3_M6.itm_typ,
							nullValue().as("itm_typ_nm"),
							S3_M6.itm_typ_d_cd,
							S3_M18.itm_typ_d_nm,
							S3_T1.ins_usr_id,
							S3_T1.ins_usr_nm,
							S3_T1.ins_func_id,
							S3_T1.ins_ts,
							S3_T1.upd_usr_id,
							S3_T1.upd_usr_nm,
							S3_T1.upd_func_id,
							S3_T1.upd_ts,
							S3_T1.upd_srv_req_no,
							S3_T1.upd_cntr,
							S3_T2.upd_cntr.as("ship_pr_upd_cntr"),
							addDynamicSelect(DS3C_DLV_GRP),
							addDynamicSelect(DS3C_CST_GRP),
							addDynamicSelect(DS3C_ITM_GRP)
						)
						.from(
							S3_T1
							.innerJoin(S3_RD1).on(S3_RD1.lg_grp_cd.eq(S3_T1.ship_fr_lg_grp_cd))
							.innerJoin(S3_T2).on(S3_T2.ship_pr_no.eq(S3_T1.ship_pr_no))
							.leftOuterJoin(S3_T3).on(S3_T3.slo_d_no.eq(S3_T2.slo_d_no))
							.innerJoin(S3_T4).on(S3_T4.ship_inst_d_no.eq(S3_T1.ship_inst_d_no))
							.leftOuterJoin(S3_T5).on(
								S3_T5.itm_cd.eq(S3_T1.itm_cd)
								.and(S3_T5.itm_sub1.eq(S3_T1.itm_sub1))
								.and(S3_T5.itm_sub2.eq(S3_T1.itm_sub2))
								.and(S3_T5.itm_sub3.eq(S3_T1.itm_sub3))
								.and(S3_T5.lot_no.eq(S3_T4.lot_no))
								.and(S3_T5.sublot_no.eq(S3_T4.sublot_no))
							)
							.leftOuterJoin(S3_T6).on(S3_T6.slo_no.eq(S3_T3.slo_no))
							.innerJoin(S3_T10).on(S3_T10.ship_inst_d_no.eq(S3_T1.ship_inst_d_no))
							.leftOuterJoin(S3_T11).on(S3_T11.sno1.eq(S3_T1.sno1))
							.innerJoin(S3_T12).on(S3_T12.ship_inst_no.eq(S3_T10.ship_inst_no))
							.leftOuterJoin(S3_M1).on(S3_M1.ship_term_cd.eq(S3_T1.ship_term_cd))
							.leftOuterJoin(S3_M2).on(S3_M2.ship_wk_cd.eq(S3_T1.ship_wk_cd))
							.leftOuterJoin(S3_M3).on(
								S3_M3.dpt_cd.eq(S3_T2.rqst_dpt_cd)
								.and(S3_M3.st_dt.lte(nvl(
										S3_T2.ship_schd_tm,
										S3_T12.ship_schd_tm
									)))
								.and(S3_M3.end_dt.gte(nvl(
										S3_T2.ship_schd_tm,
										S3_T12.ship_schd_tm
									)))
							)
							.leftOuterJoin(S3_M4).on(S3_M4.usr_cd.eq(S3_T2.rqst_usr_cd))
							.leftOuterJoin(S3_M5).on(S3_M5.trd_cd.eq(S3_T2.trd_cd))
							.leftOuterJoin(S3_M6).on(
								S3_M6.itm_cd.eq(S3_T1.itm_cd)
								.and(S3_M6.itm_sub1.eq(S3_T1.itm_sub1))
								.and(S3_M6.itm_sub2.eq(S3_T1.itm_sub2))
								.and(S3_M6.itm_sub3.eq(S3_T1.itm_sub3))
							)
							.leftOuterJoin(S3_M7).on(S3_M7.unit_cd.eq(S3_T1.trd_unit_cd))
							.leftOuterJoin(S3_M77).on(S3_M77.unit_cd.eq(S3_T4.ent_unit_cd))
							.leftOuterJoin(S3_M78).on(
								S3_M78.itm_cd.eq(S3_T1.itm_cd)
								.and(S3_M78.itm_sub1.eq(S3_T1.itm_sub1))
								.and(S3_M78.itm_sub2.eq(S3_T1.itm_sub2))
								.and(S3_M78.itm_sub3.eq(S3_T1.itm_sub3))
								.and(S3_M78.unit_cd.eq(S3_T4.ent_unit_cd))
							)
							.leftOuterJoin(S3_M8).on(S3_M8.unit_cd.eq(S3_T1.base_unit_cd))
							.leftOuterJoin(S3_M9).on(S3_M9.unit_cd.eq(S3_M6.cont_fctr_unit_cd))
							.leftOuterJoin(S3_M10).on(
								S3_M10.itm_cd.eq(S3_T1.itm_cd)
								.and(S3_M10.itm_sub1.eq(S3_T1.itm_sub1))
								.and(S3_M10.itm_sub2.eq(S3_T1.itm_sub2))
								.and(S3_M10.itm_sub3.eq(S3_T1.itm_sub3))
								.and(S3_M10.unit_cd.eq(S3_T1.base_unit_cd))
							)
							.leftOuterJoin(S3_M11).on(S3_M11.loc_cd.eq(S3_T4.ship_loc_cd))
							.leftOuterJoin(S3_M12).on(
								S3_M12.loc_cd.eq(S3_T4.ship_loc_cd)
								.and(S3_M12.str_ln_cd.eq(S3_T4.ship_str_ln_cd))
							)
							.leftOuterJoin(S3_M13).on(S3_M13.gd_cd.eq(S3_T4.gd_cd))
							.leftOuterJoin(S3_M14).on(S3_M14.bp_cd.eq(S3_T4.stk_bp_cd))
							.leftOuterJoin(S3_M15).on(S3_M15.alloc_grp_cd.eq(S3_T2.alloc_grp_cd))
							.leftOuterJoin(S3_M16).on(S3_M16.wg_cd.eq(S3_T1.wg_cd))
							.leftOuterJoin(S3_M17).on(S3_M17.bp_cd.eq(S3_T2.cst_cd))
							.leftOuterJoin(S3_M18).on(
								S3_M18.itm_typ.eq(S3_M6.itm_typ)
								.and(S3_M18.itm_typ_d_cd.eq(S3_M6.itm_typ_d_cd))
							)
							.leftOuterJoin(S3_M19).on(S3_M19.site_cd.eq(S3_M11.site_cd))
							.leftOuterJoin(S3_M21).on(
								S3_M21.bp_cd.eq(nvl(
										S3_T1.dlv_cd,
										S3_T2.dlv_id_cd
									)
								)
							)
							.leftOuterJoin(S3_M31).on(
								S3_M31.dlv_id_typ.eq(S3_T2.dlv_id_typ)
								.and(
									S3_M31.dlv_id_cd.eq(nvl(
											S3_T1.dlv_cd,
											S3_T2.dlv_id_cd
										)
									)
								)
							)
							.leftOuterJoin(S3_M33).on(
								S3_M33.ship_to_id_typ.eq(nvl2(
										S3_T1.tdlv_cd,
										value(MSC_SHIP_TO_ID_TYP.TDLV.value()),
										S3_T2.ship_to_id_typ
									)
								)
								.and(
									S3_M33.ship_to_id_cd.eq(nvl(
											nvl(
												S3_T1.tdlv_cd,
												decode(
													S3_T2.ship_to_id_typ,
													value(MSC_SHIP_TO_ID_TYP.DLV.value()),
													S3_T1.dlv_cd,
													nullValue()
												)
											),
											S3_T2.ship_to_id_cd
										)
									)
								)
							)
							.leftOuterJoin(S3_M22).on(
								S3_M22.fr_lg_grp_cd.eq(S3_T1.ship_fr_lg_grp_cd)
								.and(S3_M22.to_lg_grp_cd.eq(S3_M31.lg_grp_cd))
								.and(S3_M22.ship_term_cd.eq(S3_T1.ship_term_cd))
							)
							.leftOuterJoin(S3_M25).on(
								S3_M25.lg_grp_cd.eq(nvl2(
										S3_T1.tdlv_cd,
										S3_T1.tdlv_lg_grp_cd,
										decode(
											S3_T2.ship_to_id_typ,
											value(MSC_SHIP_TO_ID_TYP.DLV.value()),
											nvl2(
												S3_T1.dlv_cd,
												S3_T1.dlv_lg_grp_cd,
												S3_T2.ship_to_lg_grp_cd
											),
											S3_T2.ship_to_lg_grp_cd
										)
									)
								)
							)
							.leftOuterJoin(S3_M22_1).on(
								S3_M22_1.fr_lg_grp_cd.eq(S3_T1.ship_fr_lg_grp_cd)
								.and(S3_M22_1.to_lg_grp_cd.eq(S3_M25.lg_grp_cd))
								.and(S3_M22_1.ship_term_cd.eq(S3_T1.ship_term_cd))
							)
							.leftOuterJoin(S3_M23).on(S3_M23.ship_wk_grp_cd.eq(S3_M22_1.ship_wk_grp_cd))
							.leftOuterJoin(S3_M221).on(
								S3_M221.fr_lg_grp_cd.eq(S3_T1.ship_fr_lg_grp_cd)
								.and(S3_M221.to_lg_grp_cd.eq(S3_M31.lg_grp_cd))
								.and(S3_M221.ship_term_cd.eq(value(MAC_STR.NULL_VAL.value())))
							)
							.leftOuterJoin(S3_M221_1).on(
								S3_M221_1.fr_lg_grp_cd.eq(S3_T1.ship_fr_lg_grp_cd)
								.and(S3_M221_1.to_lg_grp_cd.eq(S3_M25.lg_grp_cd))
								.and(S3_M221_1.ship_term_cd.eq(value(MAC_STR.NULL_VAL.value())))
							)
							.leftOuterJoin(S3_M231).on(S3_M231.ship_wk_grp_cd.eq(S3_M221_1.ship_wk_grp_cd))
							.leftOuterJoin(S3_M24).on(S3_M24.lg_grp_cd.eq(S3_T1.ship_fr_lg_grp_cd))
							.leftOuterJoin(S3_M26).on(
								S3_M26.itm_cd.eq(S3_T1.itm_cd)
								.and(S3_M26.itm_sub1.eq(S3_T1.itm_sub1))
								.and(S3_M26.itm_sub2.eq(S3_T1.itm_sub2))
								.and(S3_M26.itm_sub3.eq(S3_T1.itm_sub3))
								.and(S3_M26.unit_cd.eq(S3_T1.trd_unit_cd))
							)
							.leftOuterJoin(S3_M35).on(
								S3_T1.itm_cd.eq(S3_M35.itm_cd)
								.and(S3_T1.itm_sub1.eq(S3_M35.itm_sub1))
								.and(S3_T1.itm_sub2.eq(S3_M35.itm_sub2))
								.and(S3_T1.itm_sub3.eq(S3_M35.itm_sub3))
								.and(S3_T4.sno1.eq(S3_M35.sno1))
								.and(S3_T4.sno2.eq(S3_M35.sno2))
								.and(S3_T4.sno3.eq(S3_M35.sno3))
								.and(S3_T4.sno4.eq(S3_M35.sno4))
								.cutoff$and(S3_M35.itm_nm.like(bind("itm_nm")))
							)
							.leftOuterJoin(S3_M36).on(S3_M36.loc_cd.eq(S3_T2.def_loc_cd))
							.addDynamicView(DS3C_DLV_GRP)
							.addDynamicView(DS3C_CST_GRP)
							.addDynamicView(DS3C_ITM_GRP)
						)
						.where(
							value(0).eq(value(0))
							.cutoff$and(S3_T1.ship_fr_lg_grp_cd.like(bind("lg_grp_cd")))
							.and(S3_T2.abort_flg.eq(value(false))
							.or(bracket(S3_T2.abort_flg.eq(value(true)).and(S3_T2.ship_schd_abort_qty.lt(S3_T2.base_unit_qty)))))
							.and(S3_T1.ship_skip_flg.eq(value(false)))
							.and(
								value(true).eq(value(false))
								.cutoff$or(S3_T1.pr_sts_typ.eq(bind("tmp_sts_not_inst")))
								.cutoff$or(S3_T1.pr_sts_typ.eq(bind("tmp_sts_inst")))
								.cutoff$or(S3_T1.pr_sts_typ.eq(bind("tmp_sts_not_ship")))
								.cutoff$or(S3_T1.pr_sts_typ.eq(bind("tmp_sts_part_ship")))
								.cutoff$or(S3_T1.pr_sts_typ.eq(bind("tmp_sts_ship")))
							)
							.cutoff$and(
								bracket(
									bracket(
										bind("not_alloc_flg_str").eq(value(true))
										.and(
											S3_T2.alloc_typ.in(
												value(MAC_ALLOC_TYP.IMMED.value()),
												value(MAC_ALLOC_TYP.LATER.value())
											)
										)
										.and(S3_T4.alloc_flg.eq(value(false)))
									)
									.or(
										bind("all_alloc_flg_str").eq(value(true))
										.and(S3_T4.alloc_flg.eq(value(true)))
									)
									.or(
										bind("alloc_invalid_flg_str").eq(value(true))
										.and(
											S3_T2.alloc_typ.eq(value(MAC_ALLOC_TYP.NON.value()))
											.or(S3_T2.alloc_typ.isNull())
										)
										.and(S3_T4.alloc_flg.eq(value(false)))
									)
								)
							)
							.cutoff$and(S3_T1.ship_block_flg.eq(bind("tmp_ship_block")))
							.cutoff$and(
								bind("tmp_dlv_rqst").eq(value(0))
								.and(
									MAPA_DT$F_IS_BEFORE_AFTER(
										S3_T1.dlv_schd_tm,
										S3_T2.dlv_rqst_tm
									).eq(value(false))
								)
							)
							.cutoff$and(
								bind("tmp_ship_rqst").eq(value(0))
								.and(
									MAPA_DT$F_IS_BEFORE_AFTER(
										S3_T1.ship_schd_tm,
										S3_T1.ship_rqst_tm
									).eq(value(false))
								)
							)
							.cutoff$and(
								bind("tmp_pd_inst_dlv").eq(value(0))
								.and(
									MAPA_DT$F_IS_BEFORE_AFTER(
										S3_T1.dlv_schd_tm,
										S3_T1.pd_inst_dlv_tm
									).eq(value(false))
								)
							)
							.cutoff$and(S3_T1.abort_flg.eq(bind("tmp_abort_flg")))
							.cutoff$and(S3_T1.wg_cd.like(bind("wg_cd")))
							.cutoff$and(S3_M16.wg_nm.like(bind("wg_nm")))
							.cutoff$and(S3_T1.ship_schd_tm.gte(bind("ship_schd_hm_fr")))
							.cutoff$and(S3_T1.ship_schd_tm.lte(bind("ship_schd_hm_to")))
							.cutoff$and(S3_T1.dlv_schd_tm.gte(bind("dlv_schd_hm_fr")))
							.cutoff$and(S3_T1.dlv_schd_tm.lte(bind("dlv_schd_hm_to")))
							.cutoff$and(S3_T4.ship_loc_cd.like(bind("loc_cd")))
							.cutoff$and(S3_M11.loc_nm.like(bind("loc_nm")))
							.cutoff$and(S3_T4.ship_str_ln_cd.like(bind("str_ln_cd")))
							.cutoff$and(S3_M12.str_ln_nm.like(bind("str_ln_nm")))
							.cutoff$and(S3_T2.alloc_grp_cd.like(bind("alloc_grp_cd")))
							.cutoff$and(S3_M15.alloc_grp_nm.like(bind("alloc_grp_nm")))
							.cutoff$and(
								nvl2(
									S3_T1.tdlv_cd,
									value(MSC_SHIP_TO_ID_TYP.TDLV.value()),
									S3_T2.ship_to_id_typ
								).like(bind("ship_to_id_typ"))
							)
							.cutoff$and(
								nvl(
									nvl(
										S3_T1.tdlv_cd,
										decode(
											S3_T2.ship_to_id_typ,
											value(MSC_SHIP_TO_ID_TYP.DLV.value()),
											S3_T1.dlv_cd,
											nullValue()
										)
									),
									S3_T2.ship_to_id_cd
								).like(bind("ship_to_id_cd"))
							)
							.cutoff$and(
								nvl2(
									S3_T1.tdlv_cd,
									nvl(
										S3_T1.tdlv_nm,
										S3_M33.ship_to_id_nm
									),
									decode(
										S3_T2.ship_to_id_typ,
										value(MSC_SHIP_TO_ID_TYP.DLV.value()),
										nvl2(
											S3_T1.dlv_cd,
											nvl(
												S3_T1.dlv_nm,
												S3_M33.ship_to_id_nm
											),
											nvl(
												S3_T2.ship_to_id_nm,
												S3_M33.ship_to_id_nm
											)
										),
										nvl(
											S3_T2.ship_to_id_nm,
											S3_M33.ship_to_id_nm
										)
									)
								).like(bind("ship_to_id_nm"))
							)
							.cutoff$and(S3_T2.dlv_id_typ.like(bind("dlv_id_typ")))
							.cutoff$and(
								nvl(
									S3_T1.dlv_cd,
									S3_T2.dlv_id_cd
								).like(bind("dlv_id_cd"))
							)
							.cutoff$and(
								nvl2(
									S3_T1.dlv_cd,
									nvl(
										S3_T1.dlv_nm,
										S3_M31.dlv_id_nm
									),
									nvl(
										S3_T2.dlv_id_nm,
										S3_M31.dlv_id_nm
									)
								).like(bind("dlv_id_nm"))
							)
							.cutoff$and(
								nvl(
									S0_T1.via_dlv_typ,
									S0_T2.via_dlv_typ
								).like(bind("via_dlv_typ"))
							)
							.cutoff$and(S3_T2.cst_cd.like(bind("cst_cd")))
							.cutoff$and(S3_M17.bp_nm.like(bind("cst_nm")))
							.cutoff$and(S3_T1.ship_term_cd.like(bind("ship_term_cd")))
							.cutoff$and(S3_M1.ship_term_nm.like(bind("ship_term_nm")))
							.cutoff$and(S3_T1.ship_wk_cd.like(bind("ship_wk_cd")))
							.cutoff$and(S3_M2.ship_wk_nm.like(bind("ship_wk_nm")))
							.cutoff$and(S3_T2.trd_cd.like(bind("trd_cd")))
							.cutoff$and(S3_M5.trd_nm.like(bind("trd_nm")))
							.cutoff$and(S3_M6.itm_typ.like(bind("itm_typ")))
							.cutoff$and(S3_M6.itm_typ_d_cd.like(bind("itm_typ_d_cd")))
							.cutoff$and(S3_M18.itm_typ_d_nm.like(bind("itm_typ_d_nm")))
							.cutoff$and(S3_T1.itm_cd.like(bind("itm_cd")))
							.cutoff$and(S3_T1.itm_sub1.like(bind("itm_sub1")))
							.cutoff$and(S3_T1.itm_sub2.like(bind("itm_sub2")))
							.cutoff$and(S3_T1.itm_sub3.like(bind("itm_sub3")))
							.cutoff$and(
								decode(
									S3_M6.sundry_itm_flg,
									value(true),
									nvl(
										S3_T1.itm_nm,
										S3_M35.itm_nm
									),
									S3_M6.itm_nm
								).like(bind("itm_nm"))
							)
							.cutoff$and(S3_T3.cst_itm_cd.like(bind("cst_itm_cd")))
							.cutoff$and(S3_T3.cst_itm_nm.like(bind("cst_itm_nm")))
							.cutoff$and(S3_T2.rqst_dpt_cd.like(bind("rqst_dpt_cd")))
							.cutoff$and(S3_M3.dpt_nm.like(bind("rqst_dpt_nm")))
							.cutoff$and(S3_T2.rqst_usr_cd.like(bind("rqst_usr_cd")))
							.cutoff$and(S3_M4.usr_nm.like(bind("rqst_usr_nm")))
							.cutoff$and(S3_T2.ship_inst_typ.like(bind("ship_inst_typ")))
							.cutoff$and(S3_T1.ship_schd_no.like(bind("ship_schd_no")))
							.cutoff$and(S3_T3.slo_no.like(bind("slo_no")))
							.cutoff$and(S3_T2.slo_d_no.like(bind("slo_d_no")))
							.cutoff$and(S3_T2.xfr_schd_no.like(bind("xfr_schd_no")))
							.cutoff$and(S3_T10.ship_inst_no.like(bind("ship_inst_no")))
							.cutoff$and(S3_T1.ship_inst_d_no.like(bind("ship_inst_d_no")))
							.cutoff$and(S3_T1.ship_cnt_rmrks.like(bind("ship_cnt_rmrks")))
							.cutoff$and(S3_T1.trd_rmrks.like(bind("trd_rmrks")))
							.cutoff$and(S3_T1.trd_d_rmrks.like(bind("trd_d_rmrks")))
							.cutoff$and(S3_M11.site_cd.like(bind("site_cd")))
							.cutoff$and(S3_M19.site_nm.like(bind("site_nm")))
							.cutoff$and(S3_T4.ver_no.like(bind("ver_no")))
							.cutoff$and(S3_T4.lot_no.like(bind("lot_no")))
							.cutoff$and(S3_T4.sublot_no.like(bind("sublot_no")))
							.cutoff$and(S3_T1.sno1.like(bind("sno1")))
							.cutoff$and(S3_T1.sno2.like(bind("sno2")))
							.cutoff$and(S3_T1.sno3.like(bind("sno3")))
							.cutoff$and(S3_T1.sno4.like(bind("sno4")))
							.cutoff$and(S3_T11.wrk_no.like(bind("wrk_no")))
							.cutoff$and(S3_T11.wrk_nm.like(bind("wrk_nm")))
							.addDynamicPredicate(DS3C_DLV_GRP)
							.addDynamicPredicate(DS3C_CST_GRP)
							.addDynamicPredicate(DS3C_ITM_GRP)
						)
					)
					.orderBy(
						pr("ship_schd_no").asc(),
						pr("ship_alloc_sts_no").asc()
					)
			)
			.setDynamicSQLInfo(
				when(boundOr("dlv_grp_flg1"))
					.select(DS0C_DLV_GRP, S0_M21.bp_grp_cd1.as("dlv_grp_cd1"), S0_MM21.bp_grp_nm.as("dlv_grp_nm1"))
					.view(DS0C_DLV_GRP, v -> v.leftOuterJoin(S0_MM21).on(S0_M21.bp_grp_cd1.eq(S0_MM21.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP1.value()).eq(S0_MM21.bp_grp_typ))))
					.predicate(DS0C_DLV_GRP, p -> p.cutoff$and(S0_M21.bp_grp_cd1.like(bind("dlv_grp_cd1"))).cutoff$and(S0_MM21.bp_grp_nm.like(bind("dlv_grp_nm1")))),
				when(boundOr("dlv_grp_flg2"))
					.select(DS0C_DLV_GRP, S0_M21.bp_grp_cd2.as("dlv_grp_cd2"), S0_MM22.bp_grp_nm.as("dlv_grp_nm2"))
					.view(DS0C_DLV_GRP, v -> v.leftOuterJoin(S0_MM22).on(S0_M21.bp_grp_cd2.eq(S0_MM22.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP2.value()).eq(S0_MM22.bp_grp_typ))))
					.predicate(DS0C_DLV_GRP, p -> p.cutoff$and(S0_M21.bp_grp_cd2.like(bind("dlv_grp_cd2"))).cutoff$and(S0_MM22.bp_grp_nm.like(bind("dlv_grp_nm2")))),
				when(boundOr("dlv_grp_flg3"))
					.select(DS0C_DLV_GRP, S0_M21.bp_grp_cd3.as("dlv_grp_cd3"), S0_MM23.bp_grp_nm.as("dlv_grp_nm3"))
					.view(DS0C_DLV_GRP, v -> v.leftOuterJoin(S0_MM23).on(S0_M21.bp_grp_cd3.eq(S0_MM23.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP3.value()).eq(S0_MM23.bp_grp_typ))))
					.predicate(DS0C_DLV_GRP, p -> p.cutoff$and(S0_M21.bp_grp_cd3.like(bind("dlv_grp_cd3"))).cutoff$and(S0_MM23.bp_grp_nm.like(bind("dlv_grp_nm3")))),
				when(boundOr("dlv_grp_flg4"))
					.select(DS0C_DLV_GRP, S0_M21.bp_grp_cd4.as("dlv_grp_cd4"), S0_MM24.bp_grp_nm.as("dlv_grp_nm4"))
					.view(DS0C_DLV_GRP, v -> v.leftOuterJoin(S0_MM24).on(S0_M21.bp_grp_cd4.eq(S0_MM24.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP4.value()).eq(S0_MM24.bp_grp_typ))))
					.predicate(DS0C_DLV_GRP, p -> p.cutoff$and(S0_M21.bp_grp_cd4.like(bind("dlv_grp_cd4"))).cutoff$and(S0_MM24.bp_grp_nm.like(bind("dlv_grp_nm4")))),
				when(boundOr("dlv_grp_flg5"))
					.select(DS0C_DLV_GRP, S0_M21.bp_grp_cd5.as("dlv_grp_cd5"), S0_MM25.bp_grp_nm.as("dlv_grp_nm5"))
					.view(DS0C_DLV_GRP, v -> v.leftOuterJoin(S0_MM25).on(S0_M21.bp_grp_cd5.eq(S0_MM25.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP5.value()).eq(S0_MM25.bp_grp_typ))))
					.predicate(DS0C_DLV_GRP, p -> p.cutoff$and(S0_M21.bp_grp_cd5.like(bind("dlv_grp_cd5"))).cutoff$and(S0_MM25.bp_grp_nm.like(bind("dlv_grp_nm5")))),
				when(boundOr("dlv_grp_flg6"))
					.select(DS0C_DLV_GRP, S0_M21.bp_grp_cd6.as("dlv_grp_cd6"), S0_MM26.bp_grp_nm.as("dlv_grp_nm6"))
					.view(DS0C_DLV_GRP, v -> v.leftOuterJoin(S0_MM26).on(S0_M21.bp_grp_cd6.eq(S0_MM26.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP6.value()).eq(S0_MM26.bp_grp_typ))))
					.predicate(DS0C_DLV_GRP, p -> p.cutoff$and(S0_M21.bp_grp_cd6.like(bind("dlv_grp_cd6"))).cutoff$and(S0_MM26.bp_grp_nm.like(bind("dlv_grp_nm6")))),
				when(boundOr("dlv_grp_flg7"))
					.select(DS0C_DLV_GRP, S0_M21.bp_grp_cd7.as("dlv_grp_cd7"), S0_MM27.bp_grp_nm.as("dlv_grp_nm7"))
					.view(DS0C_DLV_GRP, v -> v.leftOuterJoin(S0_MM27).on(S0_M21.bp_grp_cd7.eq(S0_MM27.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP7.value()).eq(S0_MM27.bp_grp_typ))))
					.predicate(DS0C_DLV_GRP, p -> p.cutoff$and(S0_M21.bp_grp_cd7.like(bind("dlv_grp_cd7"))).cutoff$and(S0_MM27.bp_grp_nm.like(bind("dlv_grp_nm7")))),
				when(boundOr("dlv_grp_flg8"))
					.select(DS0C_DLV_GRP, S0_M21.bp_grp_cd8.as("dlv_grp_cd8"), S0_MM28.bp_grp_nm.as("dlv_grp_nm8"))
					.view(DS0C_DLV_GRP, v -> v.leftOuterJoin(S0_MM28).on(S0_M21.bp_grp_cd8.eq(S0_MM28.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP8.value()).eq(S0_MM28.bp_grp_typ))))
					.predicate(DS0C_DLV_GRP, p -> p.cutoff$and(S0_M21.bp_grp_cd8.like(bind("dlv_grp_cd8"))).cutoff$and(S0_MM28.bp_grp_nm.like(bind("dlv_grp_nm8")))),
				when(boundOr("dlv_grp_flg9"))
					.select(DS0C_DLV_GRP, S0_M21.bp_grp_cd9.as("dlv_grp_cd9"), S0_MM29.bp_grp_nm.as("dlv_grp_nm9"))
					.view(DS0C_DLV_GRP, v -> v.leftOuterJoin(S0_MM29).on(S0_M21.bp_grp_cd9.eq(S0_MM29.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP9.value()).eq(S0_MM29.bp_grp_typ))))
					.predicate(DS0C_DLV_GRP, p -> p.cutoff$and(S0_M21.bp_grp_cd9.like(bind("dlv_grp_cd9"))).cutoff$and(S0_MM29.bp_grp_nm.like(bind("dlv_grp_nm9")))),
				when(boundOr("dlv_grp_flg10"))
					.select(DS0C_DLV_GRP, S0_M21.bp_grp_cd10.as("dlv_grp_cd10"), S0_MM210.bp_grp_nm.as("dlv_grp_nm10"))
					.view(DS0C_DLV_GRP, v -> v.leftOuterJoin(S0_MM210).on(S0_M21.bp_grp_cd10.eq(S0_MM210.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP10.value()).eq(S0_MM210.bp_grp_typ))))
					.predicate(DS0C_DLV_GRP, p -> p.cutoff$and(S0_M21.bp_grp_cd10.like(bind("dlv_grp_cd10"))).cutoff$and(S0_MM210.bp_grp_nm.like(bind("dlv_grp_nm10")))),
				when(boundOr("cst_grp_flg1"))
					.select(DS0C_CST_GRP, S0_M17.bp_grp_cd1.as("cst_grp_cd1"), S0_MM31.bp_grp_nm.as("cst_grp_nm1"))
					.view(DS0C_CST_GRP, v -> v.leftOuterJoin(S0_MM31).on(S0_M17.bp_grp_cd1.eq(S0_MM31.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP1.value()).eq(S0_MM31.bp_grp_typ))))
					.predicate(DS0C_CST_GRP, p -> p.cutoff$and(S0_M17.bp_grp_cd1.like(bind("cst_grp_cd1"))).cutoff$and(S0_MM31.bp_grp_nm.like(bind("cst_grp_nm1")))),
				when(boundOr("cst_grp_flg2"))
					.select(DS0C_CST_GRP, S0_M17.bp_grp_cd2.as("cst_grp_cd2"), S0_MM32.bp_grp_nm.as("cst_grp_nm2"))
					.view(DS0C_CST_GRP, v -> v.leftOuterJoin(S0_MM32).on(S0_M17.bp_grp_cd2.eq(S0_MM32.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP2.value()).eq(S0_MM32.bp_grp_typ))))
					.predicate(DS0C_CST_GRP, p -> p.cutoff$and(S0_M17.bp_grp_cd2.like(bind("cst_grp_cd2"))).cutoff$and(S0_MM32.bp_grp_nm.like(bind("cst_grp_nm2")))),
				when(boundOr("cst_grp_flg3"))
					.select(DS0C_CST_GRP, S0_M17.bp_grp_cd3.as("cst_grp_cd3"), S0_MM33.bp_grp_nm.as("cst_grp_nm3"))
					.view(DS0C_CST_GRP, v -> v.leftOuterJoin(S0_MM33).on(S0_M17.bp_grp_cd3.eq(S0_MM33.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP3.value()).eq(S0_MM33.bp_grp_typ))))
					.predicate(DS0C_CST_GRP, p -> p.cutoff$and(S0_M17.bp_grp_cd3.like(bind("cst_grp_cd3"))).cutoff$and(S0_MM33.bp_grp_nm.like(bind("cst_grp_nm3")))),
				when(boundOr("cst_grp_flg4"))
					.select(DS0C_CST_GRP, S0_M17.bp_grp_cd4.as("cst_grp_cd4"), S0_MM34.bp_grp_nm.as("cst_grp_nm4"))
					.view(DS0C_CST_GRP, v -> v.leftOuterJoin(S0_MM34).on(S0_M17.bp_grp_cd4.eq(S0_MM34.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP4.value()).eq(S0_MM34.bp_grp_typ))))
					.predicate(DS0C_CST_GRP, p -> p.cutoff$and(S0_M17.bp_grp_cd4.like(bind("cst_grp_cd4"))).cutoff$and(S0_MM34.bp_grp_nm.like(bind("cst_grp_nm4")))),
				when(boundOr("cst_grp_flg5"))
					.select(DS0C_CST_GRP, S0_M17.bp_grp_cd5.as("cst_grp_cd5"), S0_MM35.bp_grp_nm.as("cst_grp_nm5"))
					.view(DS0C_CST_GRP, v -> v.leftOuterJoin(S0_MM35).on(S0_M17.bp_grp_cd5.eq(S0_MM35.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP5.value()).eq(S0_MM35.bp_grp_typ))))
					.predicate(DS0C_CST_GRP, p -> p.cutoff$and(S0_M17.bp_grp_cd5.like(bind("cst_grp_cd5"))).cutoff$and(S0_MM35.bp_grp_nm.like(bind("cst_grp_nm5")))),
				when(boundOr("cst_grp_flg6"))
					.select(DS0C_CST_GRP, S0_M17.bp_grp_cd6.as("cst_grp_cd6"), S0_MM36.bp_grp_nm.as("cst_grp_nm6"))
					.view(DS0C_CST_GRP, v -> v.leftOuterJoin(S0_MM36).on(S0_M17.bp_grp_cd6.eq(S0_MM36.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP6.value()).eq(S0_MM36.bp_grp_typ))))
					.predicate(DS0C_CST_GRP, p -> p.cutoff$and(S0_M17.bp_grp_cd6.like(bind("cst_grp_cd6"))).cutoff$and(S0_MM36.bp_grp_nm.like(bind("cst_grp_nm6")))),
				when(boundOr("cst_grp_flg7"))
					.select(DS0C_CST_GRP, S0_M17.bp_grp_cd7.as("cst_grp_cd7"), S0_MM37.bp_grp_nm.as("cst_grp_nm7"))
					.view(DS0C_CST_GRP, v -> v.leftOuterJoin(S0_MM37).on(S0_M17.bp_grp_cd7.eq(S0_MM37.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP7.value()).eq(S0_MM37.bp_grp_typ))))
					.predicate(DS0C_CST_GRP, p -> p.cutoff$and(S0_M17.bp_grp_cd7.like(bind("cst_grp_cd7"))).cutoff$and(S0_MM37.bp_grp_nm.like(bind("cst_grp_nm7")))),
				when(boundOr("cst_grp_flg8"))
					.select(DS0C_CST_GRP, S0_M17.bp_grp_cd8.as("cst_grp_cd8"), S0_MM38.bp_grp_nm.as("cst_grp_nm8"))
					.view(DS0C_CST_GRP, v -> v.leftOuterJoin(S0_MM38).on(S0_M17.bp_grp_cd8.eq(S0_MM38.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP8.value()).eq(S0_MM38.bp_grp_typ))))
					.predicate(DS0C_CST_GRP, p -> p.cutoff$and(S0_M17.bp_grp_cd8.like(bind("cst_grp_cd8"))).cutoff$and(S0_MM38.bp_grp_nm.like(bind("cst_grp_nm8")))),
				when(boundOr("cst_grp_flg9"))
					.select(DS0C_CST_GRP, S0_M17.bp_grp_cd9.as("cst_grp_cd9"), S0_MM39.bp_grp_nm.as("cst_grp_nm9"))
					.view(DS0C_CST_GRP, v -> v.leftOuterJoin(S0_MM39).on(S0_M17.bp_grp_cd9.eq(S0_MM39.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP9.value()).eq(S0_MM39.bp_grp_typ))))
					.predicate(DS0C_CST_GRP, p -> p.cutoff$and(S0_M17.bp_grp_cd9.like(bind("cst_grp_cd9"))).cutoff$and(S0_MM39.bp_grp_nm.like(bind("cst_grp_nm9")))),
				when(boundOr("cst_grp_flg10"))
					.select(DS0C_CST_GRP, S0_M17.bp_grp_cd10.as("cst_grp_cd10"), S0_MM310.bp_grp_nm.as("cst_grp_nm10"))
					.view(DS0C_CST_GRP, v -> v.leftOuterJoin(S0_MM310).on(S0_M17.bp_grp_cd10.eq(S0_MM310.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP10.value()).eq(S0_MM310.bp_grp_typ))))
					.predicate(DS0C_CST_GRP, p -> p.cutoff$and(S0_M17.bp_grp_cd10.like(bind("cst_grp_cd10"))).cutoff$and(S0_MM310.bp_grp_nm.like(bind("cst_grp_nm10")))),
				when(boundOr("itm_grp_flg1"))
					.select(DS0C_ITM_GRP, S0_M6.itm_grp_cd1.as("itm_grp_cd1"), S0_MM41.itm_grp_nm.as("itm_grp_nm1"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM41).on(S0_M6.itm_grp_cd1.eq(S0_MM41.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP1.value()).eq(S0_MM41.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M6.itm_grp_cd1.like(bind("itm_grp_cd1"))).cutoff$and(S0_MM41.itm_grp_nm.like(bind("itm_grp_nm1")))),
				when(boundOr("itm_grp_flg2"))
					.select(DS0C_ITM_GRP, S0_M6.itm_grp_cd2.as("itm_grp_cd2"), S0_MM42.itm_grp_nm.as("itm_grp_nm2"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM42).on(S0_M6.itm_grp_cd2.eq(S0_MM42.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP2.value()).eq(S0_MM42.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M6.itm_grp_cd2.like(bind("itm_grp_cd2"))).cutoff$and(S0_MM42.itm_grp_nm.like(bind("itm_grp_nm2")))),
				when(boundOr("itm_grp_flg3"))
					.select(DS0C_ITM_GRP, S0_M6.itm_grp_cd3.as("itm_grp_cd3"), S0_MM43.itm_grp_nm.as("itm_grp_nm3"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM43).on(S0_M6.itm_grp_cd3.eq(S0_MM43.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP3.value()).eq(S0_MM43.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M6.itm_grp_cd3.like(bind("itm_grp_cd3"))).cutoff$and(S0_MM43.itm_grp_nm.like(bind("itm_grp_nm3")))),
				when(boundOr("itm_grp_flg4"))
					.select(DS0C_ITM_GRP, S0_M6.itm_grp_cd4.as("itm_grp_cd4"), S0_MM44.itm_grp_nm.as("itm_grp_nm4"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM44).on(S0_M6.itm_grp_cd4.eq(S0_MM44.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP4.value()).eq(S0_MM44.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M6.itm_grp_cd4.like(bind("itm_grp_cd4"))).cutoff$and(S0_MM44.itm_grp_nm.like(bind("itm_grp_nm4")))),
				when(boundOr("itm_grp_flg5"))
					.select(DS0C_ITM_GRP, S0_M6.itm_grp_cd5.as("itm_grp_cd5"), S0_MM45.itm_grp_nm.as("itm_grp_nm5"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM45).on(S0_M6.itm_grp_cd5.eq(S0_MM45.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP5.value()).eq(S0_MM45.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M6.itm_grp_cd5.like(bind("itm_grp_cd5"))).cutoff$and(S0_MM45.itm_grp_nm.like(bind("itm_grp_nm5")))),
				when(boundOr("itm_grp_flg6"))
					.select(DS0C_ITM_GRP, S0_M6.itm_grp_cd6.as("itm_grp_cd6"), S0_MM46.itm_grp_nm.as("itm_grp_nm6"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM46).on(S0_M6.itm_grp_cd6.eq(S0_MM46.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP6.value()).eq(S0_MM46.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M6.itm_grp_cd6.like(bind("itm_grp_cd6"))).cutoff$and(S0_MM46.itm_grp_nm.like(bind("itm_grp_nm6")))),
				when(boundOr("itm_grp_flg7"))
					.select(DS0C_ITM_GRP, S0_M6.itm_grp_cd7.as("itm_grp_cd7"), S0_MM47.itm_grp_nm.as("itm_grp_nm7"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM47).on(S0_M6.itm_grp_cd7.eq(S0_MM47.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP7.value()).eq(S0_MM47.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M6.itm_grp_cd7.like(bind("itm_grp_cd7"))).cutoff$and(S0_MM47.itm_grp_nm.like(bind("itm_grp_nm7")))),
				when(boundOr("itm_grp_flg8"))
					.select(DS0C_ITM_GRP, S0_M6.itm_grp_cd8.as("itm_grp_cd8"), S0_MM48.itm_grp_nm.as("itm_grp_nm8"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM48).on(S0_M6.itm_grp_cd8.eq(S0_MM48.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP8.value()).eq(S0_MM48.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M6.itm_grp_cd8.like(bind("itm_grp_cd8"))).cutoff$and(S0_MM48.itm_grp_nm.like(bind("itm_grp_nm8")))),
				when(boundOr("itm_grp_flg9"))
					.select(DS0C_ITM_GRP, S0_M6.itm_grp_cd9.as("itm_grp_cd9"), S0_MM49.itm_grp_nm.as("itm_grp_nm9"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM49).on(S0_M6.itm_grp_cd9.eq(S0_MM49.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP9.value()).eq(S0_MM49.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M6.itm_grp_cd9.like(bind("itm_grp_cd9"))).cutoff$and(S0_MM49.itm_grp_nm.like(bind("itm_grp_nm9")))),
				when(boundOr("itm_grp_flg10"))
					.select(DS0C_ITM_GRP, S0_M6.itm_grp_cd10.as("itm_grp_cd10"), S0_MM410.itm_grp_nm.as("itm_grp_nm10"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM410).on(S0_M6.itm_grp_cd10.eq(S0_MM410.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP10.value()).eq(S0_MM410.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M6.itm_grp_cd10.like(bind("itm_grp_cd10"))).cutoff$and(S0_MM410.itm_grp_nm.like(bind("itm_grp_nm10")))),
				when(boundOr("dlv_grp_flg1"))
					.select(DS3C_DLV_GRP, S3_M21.bp_grp_cd1.as("dlv_grp_cd1"), S3_MM21.bp_grp_nm.as("dlv_grp_nm1"))
					.view(DS3C_DLV_GRP, v -> v.leftOuterJoin(S3_MM21).on(S3_M21.bp_grp_cd1.eq(S3_MM21.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP1.value()).eq(S3_MM21.bp_grp_typ))))
					.predicate(DS3C_DLV_GRP, p -> p.cutoff$and(S3_M21.bp_grp_cd1.like(bind("dlv_grp_cd1"))).cutoff$and(S3_MM21.bp_grp_nm.like(bind("dlv_grp_nm1")))),
				when(boundOr("dlv_grp_flg2"))
					.select(DS3C_DLV_GRP, S3_M21.bp_grp_cd2.as("dlv_grp_cd2"), S3_MM22.bp_grp_nm.as("dlv_grp_nm2"))
					.view(DS3C_DLV_GRP, v -> v.leftOuterJoin(S3_MM22).on(S3_M21.bp_grp_cd2.eq(S3_MM22.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP2.value()).eq(S3_MM22.bp_grp_typ))))
					.predicate(DS3C_DLV_GRP, p -> p.cutoff$and(S3_M21.bp_grp_cd2.like(bind("dlv_grp_cd2"))).cutoff$and(S3_MM22.bp_grp_nm.like(bind("dlv_grp_nm2")))),
				when(boundOr("dlv_grp_flg3"))
					.select(DS3C_DLV_GRP, S3_M21.bp_grp_cd3.as("dlv_grp_cd3"), S3_MM23.bp_grp_nm.as("dlv_grp_nm3"))
					.view(DS3C_DLV_GRP, v -> v.leftOuterJoin(S3_MM23).on(S3_M21.bp_grp_cd3.eq(S3_MM23.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP3.value()).eq(S3_MM23.bp_grp_typ))))
					.predicate(DS3C_DLV_GRP, p -> p.cutoff$and(S3_M21.bp_grp_cd3.like(bind("dlv_grp_cd3"))).cutoff$and(S3_MM23.bp_grp_nm.like(bind("dlv_grp_nm3")))),
				when(boundOr("dlv_grp_flg4"))
					.select(DS3C_DLV_GRP, S3_M21.bp_grp_cd4.as("dlv_grp_cd4"), S3_MM24.bp_grp_nm.as("dlv_grp_nm4"))
					.view(DS3C_DLV_GRP, v -> v.leftOuterJoin(S3_MM24).on(S3_M21.bp_grp_cd4.eq(S3_MM24.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP4.value()).eq(S3_MM24.bp_grp_typ))))
					.predicate(DS3C_DLV_GRP, p -> p.cutoff$and(S3_M21.bp_grp_cd4.like(bind("dlv_grp_cd4"))).cutoff$and(S3_MM24.bp_grp_nm.like(bind("dlv_grp_nm4")))),
				when(boundOr("dlv_grp_flg5"))
					.select(DS3C_DLV_GRP, S3_M21.bp_grp_cd5.as("dlv_grp_cd5"), S3_MM25.bp_grp_nm.as("dlv_grp_nm5"))
					.view(DS3C_DLV_GRP, v -> v.leftOuterJoin(S3_MM25).on(S3_M21.bp_grp_cd5.eq(S3_MM25.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP5.value()).eq(S3_MM25.bp_grp_typ))))
					.predicate(DS3C_DLV_GRP, p -> p.cutoff$and(S3_M21.bp_grp_cd5.like(bind("dlv_grp_cd5"))).cutoff$and(S3_MM25.bp_grp_nm.like(bind("dlv_grp_nm5")))),
				when(boundOr("dlv_grp_flg6"))
					.select(DS3C_DLV_GRP, S3_M21.bp_grp_cd6.as("dlv_grp_cd6"), S3_MM26.bp_grp_nm.as("dlv_grp_nm6"))
					.view(DS3C_DLV_GRP, v -> v.leftOuterJoin(S3_MM26).on(S3_M21.bp_grp_cd6.eq(S3_MM26.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP6.value()).eq(S3_MM26.bp_grp_typ))))
					.predicate(DS3C_DLV_GRP, p -> p.cutoff$and(S3_M21.bp_grp_cd6.like(bind("dlv_grp_cd6"))).cutoff$and(S3_MM26.bp_grp_nm.like(bind("dlv_grp_nm6")))),
				when(boundOr("dlv_grp_flg7"))
					.select(DS3C_DLV_GRP, S3_M21.bp_grp_cd7.as("dlv_grp_cd7"), S3_MM27.bp_grp_nm.as("dlv_grp_nm7"))
					.view(DS3C_DLV_GRP, v -> v.leftOuterJoin(S3_MM27).on(S3_M21.bp_grp_cd7.eq(S3_MM27.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP7.value()).eq(S3_MM27.bp_grp_typ))))
					.predicate(DS3C_DLV_GRP, p -> p.cutoff$and(S3_M21.bp_grp_cd7.like(bind("dlv_grp_cd7"))).cutoff$and(S3_MM27.bp_grp_nm.like(bind("dlv_grp_nm7")))),
				when(boundOr("dlv_grp_flg8"))
					.select(DS3C_DLV_GRP, S3_M21.bp_grp_cd8.as("dlv_grp_cd8"), S3_MM28.bp_grp_nm.as("dlv_grp_nm8"))
					.view(DS3C_DLV_GRP, v -> v.leftOuterJoin(S3_MM28).on(S3_M21.bp_grp_cd8.eq(S3_MM28.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP8.value()).eq(S3_MM28.bp_grp_typ))))
					.predicate(DS3C_DLV_GRP, p -> p.cutoff$and(S3_M21.bp_grp_cd8.like(bind("dlv_grp_cd8"))).cutoff$and(S3_MM28.bp_grp_nm.like(bind("dlv_grp_nm8")))),
				when(boundOr("dlv_grp_flg9"))
					.select(DS3C_DLV_GRP, S3_M21.bp_grp_cd9.as("dlv_grp_cd9"), S3_MM29.bp_grp_nm.as("dlv_grp_nm9"))
					.view(DS3C_DLV_GRP, v -> v.leftOuterJoin(S3_MM29).on(S3_M21.bp_grp_cd9.eq(S3_MM29.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP9.value()).eq(S3_MM29.bp_grp_typ))))
					.predicate(DS3C_DLV_GRP, p -> p.cutoff$and(S3_M21.bp_grp_cd9.like(bind("dlv_grp_cd9"))).cutoff$and(S3_MM29.bp_grp_nm.like(bind("dlv_grp_nm9")))),
				when(boundOr("dlv_grp_flg10"))
					.select(DS3C_DLV_GRP, S3_M21.bp_grp_cd10.as("dlv_grp_cd10"), S3_MM210.bp_grp_nm.as("dlv_grp_nm10"))
					.view(DS3C_DLV_GRP, v -> v.leftOuterJoin(S3_MM210).on(S3_M21.bp_grp_cd10.eq(S3_MM210.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP10.value()).eq(S3_MM210.bp_grp_typ))))
					.predicate(DS3C_DLV_GRP, p -> p.cutoff$and(S3_M21.bp_grp_cd10.like(bind("dlv_grp_cd10"))).cutoff$and(S3_MM210.bp_grp_nm.like(bind("dlv_grp_nm10")))),
				when(boundOr("cst_grp_flg1"))
					.select(DS3C_CST_GRP, S3_M17.bp_grp_cd1.as("cst_grp_cd1"), S3_MM31.bp_grp_nm.as("cst_grp_nm1"))
					.view(DS3C_CST_GRP, v -> v.leftOuterJoin(S3_MM31).on(S3_M17.bp_grp_cd1.eq(S3_MM31.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP1.value()).eq(S3_MM31.bp_grp_typ))))
					.predicate(DS3C_CST_GRP, p -> p.cutoff$and(S3_M17.bp_grp_cd1.like(bind("cst_grp_cd1"))).cutoff$and(S3_MM31.bp_grp_nm.like(bind("cst_grp_nm1")))),
				when(boundOr("cst_grp_flg2"))
					.select(DS3C_CST_GRP, S3_M17.bp_grp_cd2.as("cst_grp_cd2"), S3_MM32.bp_grp_nm.as("cst_grp_nm2"))
					.view(DS3C_CST_GRP, v -> v.leftOuterJoin(S3_MM32).on(S3_M17.bp_grp_cd2.eq(S3_MM32.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP2.value()).eq(S3_MM32.bp_grp_typ))))
					.predicate(DS3C_CST_GRP, p -> p.cutoff$and(S3_M17.bp_grp_cd2.like(bind("cst_grp_cd2"))).cutoff$and(S3_MM32.bp_grp_nm.like(bind("cst_grp_nm2")))),
				when(boundOr("cst_grp_flg3"))
					.select(DS3C_CST_GRP, S3_M17.bp_grp_cd3.as("cst_grp_cd3"), S3_MM33.bp_grp_nm.as("cst_grp_nm3"))
					.view(DS3C_CST_GRP, v -> v.leftOuterJoin(S3_MM33).on(S3_M17.bp_grp_cd3.eq(S3_MM33.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP3.value()).eq(S3_MM33.bp_grp_typ))))
					.predicate(DS3C_CST_GRP, p -> p.cutoff$and(S3_M17.bp_grp_cd3.like(bind("cst_grp_cd3"))).cutoff$and(S3_MM33.bp_grp_nm.like(bind("cst_grp_nm3")))),
				when(boundOr("cst_grp_flg4"))
					.select(DS3C_CST_GRP, S3_M17.bp_grp_cd4.as("cst_grp_cd4"), S3_MM34.bp_grp_nm.as("cst_grp_nm4"))
					.view(DS3C_CST_GRP, v -> v.leftOuterJoin(S3_MM34).on(S3_M17.bp_grp_cd4.eq(S3_MM34.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP4.value()).eq(S3_MM34.bp_grp_typ))))
					.predicate(DS3C_CST_GRP, p -> p.cutoff$and(S3_M17.bp_grp_cd4.like(bind("cst_grp_cd4"))).cutoff$and(S3_MM34.bp_grp_nm.like(bind("cst_grp_nm4")))),
				when(boundOr("cst_grp_flg5"))
					.select(DS3C_CST_GRP, S3_M17.bp_grp_cd5.as("cst_grp_cd5"), S3_MM35.bp_grp_nm.as("cst_grp_nm5"))
					.view(DS3C_CST_GRP, v -> v.leftOuterJoin(S3_MM35).on(S3_M17.bp_grp_cd5.eq(S3_MM35.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP5.value()).eq(S3_MM35.bp_grp_typ))))
					.predicate(DS3C_CST_GRP, p -> p.cutoff$and(S3_M17.bp_grp_cd5.like(bind("cst_grp_cd5"))).cutoff$and(S3_MM35.bp_grp_nm.like(bind("cst_grp_nm5")))),
				when(boundOr("cst_grp_flg6"))
					.select(DS3C_CST_GRP, S3_M17.bp_grp_cd6.as("cst_grp_cd6"), S3_MM36.bp_grp_nm.as("cst_grp_nm6"))
					.view(DS3C_CST_GRP, v -> v.leftOuterJoin(S3_MM36).on(S3_M17.bp_grp_cd6.eq(S3_MM36.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP6.value()).eq(S3_MM36.bp_grp_typ))))
					.predicate(DS3C_CST_GRP, p -> p.cutoff$and(S3_M17.bp_grp_cd6.like(bind("cst_grp_cd6"))).cutoff$and(S3_MM36.bp_grp_nm.like(bind("cst_grp_nm6")))),
				when(boundOr("cst_grp_flg7"))
					.select(DS3C_CST_GRP, S3_M17.bp_grp_cd7.as("cst_grp_cd7"), S3_MM37.bp_grp_nm.as("cst_grp_nm7"))
					.view(DS3C_CST_GRP, v -> v.leftOuterJoin(S3_MM37).on(S3_M17.bp_grp_cd7.eq(S3_MM37.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP7.value()).eq(S3_MM37.bp_grp_typ))))
					.predicate(DS3C_CST_GRP, p -> p.cutoff$and(S3_M17.bp_grp_cd7.like(bind("cst_grp_cd7"))).cutoff$and(S3_MM37.bp_grp_nm.like(bind("cst_grp_nm7")))),
				when(boundOr("cst_grp_flg8"))
					.select(DS3C_CST_GRP, S3_M17.bp_grp_cd8.as("cst_grp_cd8"), S3_MM38.bp_grp_nm.as("cst_grp_nm8"))
					.view(DS3C_CST_GRP, v -> v.leftOuterJoin(S3_MM38).on(S3_M17.bp_grp_cd8.eq(S3_MM38.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP8.value()).eq(S3_MM38.bp_grp_typ))))
					.predicate(DS3C_CST_GRP, p -> p.cutoff$and(S3_M17.bp_grp_cd8.like(bind("cst_grp_cd8"))).cutoff$and(S3_MM38.bp_grp_nm.like(bind("cst_grp_nm8")))),
				when(boundOr("cst_grp_flg9"))
					.select(DS3C_CST_GRP, S3_M17.bp_grp_cd9.as("cst_grp_cd9"), S3_MM39.bp_grp_nm.as("cst_grp_nm9"))
					.view(DS3C_CST_GRP, v -> v.leftOuterJoin(S3_MM39).on(S3_M17.bp_grp_cd9.eq(S3_MM39.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP9.value()).eq(S3_MM39.bp_grp_typ))))
					.predicate(DS3C_CST_GRP, p -> p.cutoff$and(S3_M17.bp_grp_cd9.like(bind("cst_grp_cd9"))).cutoff$and(S3_MM39.bp_grp_nm.like(bind("cst_grp_nm9")))),
				when(boundOr("cst_grp_flg10"))
					.select(DS3C_CST_GRP, S3_M17.bp_grp_cd10.as("cst_grp_cd10"), S3_MM310.bp_grp_nm.as("cst_grp_nm10"))
					.view(DS3C_CST_GRP, v -> v.leftOuterJoin(S3_MM310).on(S3_M17.bp_grp_cd10.eq(S3_MM310.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP10.value()).eq(S3_MM310.bp_grp_typ))))
					.predicate(DS3C_CST_GRP, p -> p.cutoff$and(S3_M17.bp_grp_cd10.like(bind("cst_grp_cd10"))).cutoff$and(S3_MM310.bp_grp_nm.like(bind("cst_grp_nm10")))),
				when(boundOr("itm_grp_flg1"))
					.select(DS3C_ITM_GRP, S3_M6.itm_grp_cd1.as("itm_grp_cd1"), S3_MM41.itm_grp_nm.as("itm_grp_nm1"))
					.view(DS3C_ITM_GRP, v -> v.leftOuterJoin(S3_MM41).on(S3_M6.itm_grp_cd1.eq(S3_MM41.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP1.value()).eq(S3_MM41.itm_grp_typ))))
					.predicate(DS3C_ITM_GRP, p -> p.cutoff$and(S3_M6.itm_grp_cd1.like(bind("itm_grp_cd1"))).cutoff$and(S3_MM41.itm_grp_nm.like(bind("itm_grp_nm1")))),
				when(boundOr("itm_grp_flg2"))
					.select(DS3C_ITM_GRP, S3_M6.itm_grp_cd2.as("itm_grp_cd2"), S3_MM42.itm_grp_nm.as("itm_grp_nm2"))
					.view(DS3C_ITM_GRP, v -> v.leftOuterJoin(S3_MM42).on(S3_M6.itm_grp_cd2.eq(S3_MM42.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP2.value()).eq(S3_MM42.itm_grp_typ))))
					.predicate(DS3C_ITM_GRP, p -> p.cutoff$and(S3_M6.itm_grp_cd2.like(bind("itm_grp_cd2"))).cutoff$and(S3_MM42.itm_grp_nm.like(bind("itm_grp_nm2")))),
				when(boundOr("itm_grp_flg3"))
					.select(DS3C_ITM_GRP, S3_M6.itm_grp_cd3.as("itm_grp_cd3"), S3_MM43.itm_grp_nm.as("itm_grp_nm3"))
					.view(DS3C_ITM_GRP, v -> v.leftOuterJoin(S3_MM43).on(S3_M6.itm_grp_cd3.eq(S3_MM43.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP3.value()).eq(S3_MM43.itm_grp_typ))))
					.predicate(DS3C_ITM_GRP, p -> p.cutoff$and(S3_M6.itm_grp_cd3.like(bind("itm_grp_cd3"))).cutoff$and(S3_MM43.itm_grp_nm.like(bind("itm_grp_nm3")))),
				when(boundOr("itm_grp_flg4"))
					.select(DS3C_ITM_GRP, S3_M6.itm_grp_cd4.as("itm_grp_cd4"), S3_MM44.itm_grp_nm.as("itm_grp_nm4"))
					.view(DS3C_ITM_GRP, v -> v.leftOuterJoin(S3_MM44).on(S3_M6.itm_grp_cd4.eq(S3_MM44.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP4.value()).eq(S3_MM44.itm_grp_typ))))
					.predicate(DS3C_ITM_GRP, p -> p.cutoff$and(S3_M6.itm_grp_cd4.like(bind("itm_grp_cd4"))).cutoff$and(S3_MM44.itm_grp_nm.like(bind("itm_grp_nm4")))),
				when(boundOr("itm_grp_flg5"))
					.select(DS3C_ITM_GRP, S3_M6.itm_grp_cd5.as("itm_grp_cd5"), S3_MM45.itm_grp_nm.as("itm_grp_nm5"))
					.view(DS3C_ITM_GRP, v -> v.leftOuterJoin(S3_MM45).on(S3_M6.itm_grp_cd5.eq(S3_MM45.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP5.value()).eq(S3_MM45.itm_grp_typ))))
					.predicate(DS3C_ITM_GRP, p -> p.cutoff$and(S3_M6.itm_grp_cd5.like(bind("itm_grp_cd5"))).cutoff$and(S3_MM45.itm_grp_nm.like(bind("itm_grp_nm5")))),
				when(boundOr("itm_grp_flg6"))
					.select(DS3C_ITM_GRP, S3_M6.itm_grp_cd6.as("itm_grp_cd6"), S3_MM46.itm_grp_nm.as("itm_grp_nm6"))
					.view(DS3C_ITM_GRP, v -> v.leftOuterJoin(S3_MM46).on(S3_M6.itm_grp_cd6.eq(S3_MM46.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP6.value()).eq(S3_MM46.itm_grp_typ))))
					.predicate(DS3C_ITM_GRP, p -> p.cutoff$and(S3_M6.itm_grp_cd6.like(bind("itm_grp_cd6"))).cutoff$and(S3_MM46.itm_grp_nm.like(bind("itm_grp_nm6")))),
				when(boundOr("itm_grp_flg7"))
					.select(DS3C_ITM_GRP, S3_M6.itm_grp_cd7.as("itm_grp_cd7"), S3_MM47.itm_grp_nm.as("itm_grp_nm7"))
					.view(DS3C_ITM_GRP, v -> v.leftOuterJoin(S3_MM47).on(S3_M6.itm_grp_cd7.eq(S3_MM47.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP7.value()).eq(S3_MM47.itm_grp_typ))))
					.predicate(DS3C_ITM_GRP, p -> p.cutoff$and(S3_M6.itm_grp_cd7.like(bind("itm_grp_cd7"))).cutoff$and(S3_MM47.itm_grp_nm.like(bind("itm_grp_nm7")))),
				when(boundOr("itm_grp_flg8"))
					.select(DS3C_ITM_GRP, S3_M6.itm_grp_cd8.as("itm_grp_cd8"), S3_MM48.itm_grp_nm.as("itm_grp_nm8"))
					.view(DS3C_ITM_GRP, v -> v.leftOuterJoin(S3_MM48).on(S3_M6.itm_grp_cd8.eq(S3_MM48.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP8.value()).eq(S3_MM48.itm_grp_typ))))
					.predicate(DS3C_ITM_GRP, p -> p.cutoff$and(S3_M6.itm_grp_cd8.like(bind("itm_grp_cd8"))).cutoff$and(S3_MM48.itm_grp_nm.like(bind("itm_grp_nm8")))),
				when(boundOr("itm_grp_flg9"))
					.select(DS3C_ITM_GRP, S3_M6.itm_grp_cd9.as("itm_grp_cd9"), S3_MM49.itm_grp_nm.as("itm_grp_nm9"))
					.view(DS3C_ITM_GRP, v -> v.leftOuterJoin(S3_MM49).on(S3_M6.itm_grp_cd9.eq(S3_MM49.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP9.value()).eq(S3_MM49.itm_grp_typ))))
					.predicate(DS3C_ITM_GRP, p -> p.cutoff$and(S3_M6.itm_grp_cd9.like(bind("itm_grp_cd9"))).cutoff$and(S3_MM49.itm_grp_nm.like(bind("itm_grp_nm9")))),
				when(boundOr("itm_grp_flg10"))
					.select(DS3C_ITM_GRP, S3_M6.itm_grp_cd10.as("itm_grp_cd10"), S3_MM410.itm_grp_nm.as("itm_grp_nm10"))
					.view(DS3C_ITM_GRP, v -> v.leftOuterJoin(S3_MM410).on(S3_M6.itm_grp_cd10.eq(S3_MM410.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP10.value()).eq(S3_MM410.itm_grp_typ))))
					.predicate(DS3C_ITM_GRP, p -> p.cutoff$and(S3_M6.itm_grp_cd10.like(bind("itm_grp_cd10"))).cutoff$and(S3_MM410.itm_grp_nm.like(bind("itm_grp_nm10"))))
			);
	}
	
}