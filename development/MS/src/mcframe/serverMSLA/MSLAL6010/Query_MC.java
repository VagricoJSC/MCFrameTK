package mcframe.serverMSLA.MSLAL6010;

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
	 * -- MSLAL6010_MST_SHIP_INST_Query_S01
	 */
	static MCQueryPlan MSLAL6010_MST_SHIP_INST_S01() {
		MCTempView S0_V1 = createTempView("V1");
		MST_SHIP_INST_R S0_T1 = MST_SHIP_INST_R.create("T1");
		MCTempView S1_T1 = createTempView("T1");
		MCTempView S1_T2 = createTempView("T2");
		MCTempView S1_T3 = createTempView("T3");
		MST_SHIP_SCHD_R S1_T4 = MST_SHIP_SCHD_R.create("T4");
		MST_SHIP_SCHD_R S1_T5 = MST_SHIP_SCHD_R.create("T5");
		MST_SHIP_PR_R S1_T6 = MST_SHIP_PR_R.create("T6");
		MST_SLO_D_R S1_T7 = MST_SLO_D_R.create("T7");
		MST_SLO_R S1_T8 = MST_SLO_R.create("T8");
		MST_XFR_SCHD_R S1_T9 = MST_XFR_SCHD_R.create("T9");
		MSVT_LOT_LIST_R S1_T10 = MSVT_LOT_LIST_R.create("T10");
		MST_IV_R S1_T11 = MST_IV_R.create("T11");
		MST_IV_D_R S1_T12 = MST_IV_D_R.create("T12");
		MST_IV_MAP_R S1_T13 = MST_IV_MAP_R.create("T13");
		MAM_LG_GRP_R S1_M1 = MAM_LG_GRP_R.create("M1");
		MAM_LG_GRP_R S1_M2 = MAM_LG_GRP_R.create("M2");
		MAM_SHIP_WK_R S1_M3 = MAM_SHIP_WK_R.create("M3");
		MAM_SHIP_TERM_R S1_M4 = MAM_SHIP_TERM_R.create("M4");
		MSVM_SHIP_TO_ID_R S1_M5 = MSVM_SHIP_TO_ID_R.create("M5");
		MSVM_DLV_ID_R S1_M6 = MSVM_DLV_ID_R.create("M6");
		MAM_BP_R S1_M7 = MAM_BP_R.create("M7");
		MAM_BP_R S1_M8 = MAM_BP_R.create("M8");
		MAM_BP_R S1_M9 = MAM_BP_R.create("M9");
		MAM_BP_R S1_M10 = MAM_BP_R.create("M10");
		MAM_BP_R S1_M11 = MAM_BP_R.create("M11");
		MAM_TRD_R S1_M12 = MAM_TRD_R.create("M12");
		MAM_LOC_R S1_M13 = MAM_LOC_R.create("M13");
		MAM_STR_LN_R S1_M14 = MAM_STR_LN_R.create("M14");
		MAM_STK_GD_R S1_M15 = MAM_STK_GD_R.create("M15");
		MAM_UNIT_R S1_M16 = MAM_UNIT_R.create("M16");
		MAM_UNIT_R S1_M17 = MAM_UNIT_R.create("M17");
		MAM_UNIT_R S1_M18 = MAM_UNIT_R.create("M18");
		MAM_UNIT_R S1_M19 = MAM_UNIT_R.create("M19");
		MAM_UNIT_R S1_M20 = MAM_UNIT_R.create("M20");
		MAM_UNIT_R S1_M21 = MAM_UNIT_R.create("M21");
		MAM_BIZ_RSN_R S1_M22 = MAM_BIZ_RSN_R.create("M22");
		MAVM_ITM_UNIT_R S1_M23 = MAVM_ITM_UNIT_R.create("M23");
		MAM_ITM_R S1_M24 = MAM_ITM_R.create("M24");
		MAM_SUNDRY_ITM_R S1_M25 = MAM_SUNDRY_ITM_R.create("M25");
		MAM_SITE_CO_R S1_M26 = MAM_SITE_CO_R.create("M26");
		MAM_DPT_R S1_M27 = MAM_DPT_R.create("M27");
		MAM_USR_R S1_M28 = MAM_USR_R.create("M28");
		MSW_SHIP_INST_KEY_R S2_W1 = MSW_SHIP_INST_KEY_R.create("W1");
		MST_SHIP_INST_R S2_T1 = MST_SHIP_INST_R.create("T1");
		MSW_SHIP_INST_KEY_R S3_W1 = MSW_SHIP_INST_KEY_R.create("W1");
		MST_SHIP_INST_R S3_W2 = MST_SHIP_INST_R.create("W2");
		MST_SHIP_INST_P_R S3_T1 = MST_SHIP_INST_P_R.create("T1");
		MSW_SHIP_INST_KEY_R S4_W1 = MSW_SHIP_INST_KEY_R.create("W1");
		MST_SHIP_INST_R S4_W2 = MST_SHIP_INST_R.create("W2");
		MST_SHIP_INST_D_R S4_T1 = MST_SHIP_INST_D_R.create("T1");
		MSW_SHIP_INST_KEY_R S5_W1 = MSW_SHIP_INST_KEY_R.create("W1");
		MST_SHIP_INST_R S5_W2 = MST_SHIP_INST_R.create("W2");
		MST_SHIP_INST_D_P_R S5_T1 = MST_SHIP_INST_D_P_R.create("T1");
		MSW_SHIP_INST_KEY_R S6_W1 = MSW_SHIP_INST_KEY_R.create("W1");
		MST_SHIP_INST_R S6_W2 = MST_SHIP_INST_R.create("W2");
		MST_SHIP_ALLOC_STS_R S6_T1 = MST_SHIP_ALLOC_STS_R.create("T1");
		MSW_SHIP_INST_KEY_R S7_W1 = MSW_SHIP_INST_KEY_R.create("W1");
		MST_SHIP_INST_R S7_W2 = MST_SHIP_INST_R.create("W2");
		MST_SHIP_ALLOC_STS_P_R S7_T1 = MST_SHIP_ALLOC_STS_P_R.create("T1");
		MSW_SHIP_ALLOC_STS_KEY_R S8 = MSW_SHIP_ALLOC_STS_KEY_R.create();
		MCTempView S9_V1 = createTempView("V1");
		MCTempView S10_T1 = createTempView("T1");
		MCTempView S10_T2 = createTempView("T2");
		MCTempView S10_T3 = createTempView("T3");
		MST_SHIP_SCHD_R S10_T4 = MST_SHIP_SCHD_R.create("T4");
		MST_SHIP_SCHD_R S10_T5 = MST_SHIP_SCHD_R.create("T5");
		MST_SHIP_PR_R S10_T6 = MST_SHIP_PR_R.create("T6");
		MST_SLO_D_R S10_T7 = MST_SLO_D_R.create("T7");
		MST_SLO_R S10_T8 = MST_SLO_R.create("T8");
		MST_XFR_SCHD_R S10_T9 = MST_XFR_SCHD_R.create("T9");
		MSVT_LOT_LIST_R S10_T10 = MSVT_LOT_LIST_R.create("T10");
		MST_IV_R S10_T11 = MST_IV_R.create("T11");
		MST_IV_D_R S10_T12 = MST_IV_D_R.create("T12");
		MST_IV_MAP_R S10_T13 = MST_IV_MAP_R.create("T13");
		MAM_LG_GRP_R S10_M1 = MAM_LG_GRP_R.create("M1");
		MAM_LG_GRP_R S10_M2 = MAM_LG_GRP_R.create("M2");
		MAM_SHIP_WK_R S10_M3 = MAM_SHIP_WK_R.create("M3");
		MAM_SHIP_TERM_R S10_M4 = MAM_SHIP_TERM_R.create("M4");
		MSVM_SHIP_TO_ID_R S10_M5 = MSVM_SHIP_TO_ID_R.create("M5");
		MSVM_DLV_ID_R S10_M6 = MSVM_DLV_ID_R.create("M6");
		MAM_BP_R S10_M7 = MAM_BP_R.create("M7");
		MAM_BP_R S10_M8 = MAM_BP_R.create("M8");
		MAM_BP_R S10_M9 = MAM_BP_R.create("M9");
		MAM_BP_R S10_M10 = MAM_BP_R.create("M10");
		MAM_BP_R S10_M11 = MAM_BP_R.create("M11");
		MAM_TRD_R S10_M12 = MAM_TRD_R.create("M12");
		MAM_LOC_R S10_M13 = MAM_LOC_R.create("M13");
		MAM_STR_LN_R S10_M14 = MAM_STR_LN_R.create("M14");
		MAM_STK_GD_R S10_M15 = MAM_STK_GD_R.create("M15");
		MAM_UNIT_R S10_M16 = MAM_UNIT_R.create("M16");
		MAM_UNIT_R S10_M17 = MAM_UNIT_R.create("M17");
		MAM_UNIT_R S10_M18 = MAM_UNIT_R.create("M18");
		MAM_UNIT_R S10_M19 = MAM_UNIT_R.create("M19");
		MAM_UNIT_R S10_M20 = MAM_UNIT_R.create("M20");
		MAM_UNIT_R S10_M21 = MAM_UNIT_R.create("M21");
		MAM_BIZ_RSN_R S10_M22 = MAM_BIZ_RSN_R.create("M22");
		MAVM_ITM_UNIT_R S10_M23 = MAVM_ITM_UNIT_R.create("M23");
		MAM_ITM_R S10_M24 = MAM_ITM_R.create("M24");
		MAM_SUNDRY_ITM_R S10_M25 = MAM_SUNDRY_ITM_R.create("M25");
		MAM_SITE_CO_R S10_M26 = MAM_SITE_CO_R.create("M26");
		MAM_DPT_R S10_M27 = MAM_DPT_R.create("M27");
		MAM_USR_R S10_M28 = MAM_USR_R.create("M28");
		MSW_SHIP_INST_KEY_R S11_W1 = MSW_SHIP_INST_KEY_R.create("W1");
		MST_SHIP_INST_R S11_T1 = MST_SHIP_INST_R.create("T1");
		MSW_SHIP_INST_KEY_R S12_W1 = MSW_SHIP_INST_KEY_R.create("W1");
		MST_SHIP_INST_R S12_W2 = MST_SHIP_INST_R.create("W2");
		MST_SHIP_INST_P_R S12_T1 = MST_SHIP_INST_P_R.create("T1");
		MSW_SHIP_INST_KEY_R S13_W1 = MSW_SHIP_INST_KEY_R.create("W1");
		MST_SHIP_INST_R S13_W2 = MST_SHIP_INST_R.create("W2");
		MST_SHIP_INST_D_R S13_T1 = MST_SHIP_INST_D_R.create("T1");
		MSW_SHIP_INST_KEY_R S14_W1 = MSW_SHIP_INST_KEY_R.create("W1");
		MST_SHIP_INST_R S14_W2 = MST_SHIP_INST_R.create("W2");
		MST_SHIP_INST_D_P_R S14_T1 = MST_SHIP_INST_D_P_R.create("T1");
		MSW_SHIP_INST_KEY_R S15_W1 = MSW_SHIP_INST_KEY_R.create("W1");
		MST_SHIP_INST_R S15_W2 = MST_SHIP_INST_R.create("W2");
		MST_SHIP_ALLOC_STS_R S15_T1 = MST_SHIP_ALLOC_STS_R.create("T1");
		MSW_SHIP_INST_KEY_R S16_W1 = MSW_SHIP_INST_KEY_R.create("W1");
		MST_SHIP_INST_R S16_W2 = MST_SHIP_INST_R.create("W2");
		MST_SHIP_ALLOC_STS_P_R S16_T1 = MST_SHIP_ALLOC_STS_P_R.create("T1");
		MSW_SHIP_ALLOC_STS_KEY_R S17 = MSW_SHIP_ALLOC_STS_KEY_R.create();
		MST_SHIP_ALLOC_STS_R S18 = MST_SHIP_ALLOC_STS_R.create();
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSLAL6010_MST_SHIP_INST_Query_S01")
					.mainQuery()
					.select(
						S0_V1.prAll(),
						S0_T1.ship_inst_rev.as("latest_rev"),
						value(false).as("can_flg")
					)
					.from(
						subQuery()
						.select(
							S1_T1.pr(S2_T1.ship_inst_no),
							S1_T1.pr(S2_T1.ship_inst_rev),
							S1_T1.pr(S2_T1.ship_fr_lg_grp_cd),
							S1_M1.lg_grp_nm.as("ship_fr_lg_grp_nm"),
							S1_M1.site_co_cd.as("site_co_cd"),
							S1_M26.site_co_nm.as("site_co_nm"),
							S1_T1.pr(S2_T1.ship_inst_tm),
							S1_T1.pr(S2_T1.ship_schd_tm),
							S1_T1.pr(S2_T1.dlv_schd_tm),
							S1_T1.pr(S2_T1.ship_wk_cd),
							S1_M3.ship_wk_nm,
							S1_T1.pr(S2_T1.ship_term_cd),
							S1_M4.ship_term_nm,
							S1_T1.pr(S2_T1.inst_dpt_cd),
							S1_M27.dpt_nm.as("inst_dpt_nm"),
							S1_T1.pr(S2_T1.inst_usr_cd),
							S1_M28.usr_nm.as("inst_usr_nm"),
							S1_T1.pr(S2_T1.ship_to_lg_grp_cd),
							S1_M2.lg_grp_nm.as("ship_to_lg_grp_nm"),
							S1_T1.pr(S2_T1.ship_to_id_typ),
							S1_T1.pr(S2_T1.ship_to_id_cd),
							nvl(
								S1_T1.pr(S2_T1.ship_to_id_nm),
								S1_M5.ship_to_id_nm
							).as("ship_to_id_nm"),
							S1_T1.pr(S2_T1.ship_to_zip_cd),
							S1_T1.pr(S2_T1.ship_to_addr1),
							S1_T1.pr(S2_T1.ship_to_addr2),
							S1_T1.pr(S2_T1.ship_to_addr3),
							S1_T1.pr(S2_T1.ship_to_addr4),
							S1_T1.pr(S2_T1.ship_to_cntct_dpt),
							S1_T1.pr(S2_T1.ship_to_cntct_psn),
							S1_T1.pr(S2_T1.ship_to_tel),
							S1_T1.pr(S2_T1.ship_to_fax),
							S1_T1.pr(S2_T1.ship_to_sundry_flg),
							S1_T6.dlv_id_typ,
							decode(
								S1_T7.slo_d_no,
								nullValue(),
								S1_T6.dlv_id_cd,
								nvl(
									nvl(
										S1_T4.dlv_cd,
										S1_T5.dlv_cd
									),
									S1_T6.dlv_id_cd
								)
							).as("dlv_id_cd"),
							decode(
								S1_T7.slo_d_no,
								nullValue(),
								nvl(
									S1_T6.dlv_id_nm,
									S1_M6.dlv_id_nm
								),
								nvl2(
									nvl(
										S1_T4.dlv_cd,
										S1_T5.dlv_cd
									),
									nvl(
										nvl(
											S1_T4.dlv_nm,
											S1_T5.dlv_nm
										),
										S1_M6.dlv_id_nm
									),
									nvl(
										S1_T6.dlv_id_nm,
										S1_M6.dlv_id_nm
									)
								)
							).as("dlv_id_nm"),
							S1_T6.cst_cd,
							S1_M7.bp_nm.as("cst_nm"),
							S1_T7.dest_cd1,
							S1_M8.bp_nm.as("dest_nm1"),
							S1_T7.dest_cd2,
							S1_M9.bp_nm.as("dest_nm2"),
							S1_T7.dest_cd3,
							S1_M10.bp_nm.as("dest_nm3"),
							S1_T2.pr(S4_T1.ship_inst_d_no),
							S1_T3.pr(S6_T1.ship_alloc_sts_no),
							decode(
								S1_T11.iv_ship_flg,
								value(true),
								S1_T11.iv_no,
								nullValue()
							).as("iv_no"),
							decode(
								S1_T11.iv_ship_flg,
								value(true),
								S1_T13.iv_d_no,
								nullValue()
							).as("iv_d_no"),
							S1_T3.pr(S6_T1.dlv_slip_no),
							S1_T3.pr(S6_T1.dlv_slip_d_no),
							S1_T2.pr(S4_T1.trd_cd),
							S1_M12.trd_nm,
							S1_T2.pr(S4_T1.trd_ptn_typ),
							S1_T3.pr(S6_T1.ship_loc_cd),
							S1_M13.loc_nm.as("ship_loc_nm"),
							S1_T3.pr(S6_T1.ship_str_ln_cd),
							S1_M14.str_ln_nm.as("ship_str_ln_nm"),
							MAPA_LOC$F_GET_LOC_ADDR(
								S1_T3.pr(S6_T1.ship_loc_cd),
								S1_T1.pr(S2_T1.ship_inst_tm),
								value(MAC_LOC_ADDR_TYP.TEL.value()),
								nullValue()
							).as("ship_loc_tel"),
							MAPA_LOC$F_GET_LOC_ADDR(
								S1_T3.pr(S6_T1.ship_loc_cd),
								S1_T1.pr(S2_T1.ship_inst_tm),
								value(MAC_LOC_ADDR_TYP.FAX.value()),
								nullValue()
							).as("ship_loc_fax"),
							S1_T6.dlv_rqst_tm,
							nvl(
								S1_T4.pd_inst_dlv_tm,
								S1_T5.pd_inst_dlv_tm
							).as("pd_inst_dlv_tm"),
							nvl(
								S1_T4.ship_rqst_tm,
								S1_T5.ship_rqst_tm
							).as("ship_rqst_tm"),
							cases()
								.when(S1_T8.assort_typ.eq(value(MSC_SHIP_ASSORT_TYP.AST.value())))
									.then(value(true))
								.otherwise(value(false)).as("assort_flg"),
							S1_T7.set_itm_grp_no,
							S1_T2.pr(S4_T1.itm_cd),
							S1_T2.pr(S4_T1.itm_sub1),
							S1_T2.pr(S4_T1.itm_sub2),
							S1_T2.pr(S4_T1.itm_sub3),
							decode(
								S1_T2.pr(S4_T1.sundry_itm_flg),
								value(true),
								nvl(
									S1_T2.pr(S4_T1.itm_nm),
									S1_M25.itm_nm
								),
								S1_M24.itm_nm
							).as("itm_nm"),
							S1_T3.pr(S6_T1.lot_no),
							S1_T3.pr(S6_T1.sublot_no),
							S1_T3.pr(S6_T1.ver_no),
							S1_T3.pr(S6_T1.sno1),
							S1_T3.pr(S6_T1.sno1_null_flg),
							S1_T3.pr(S6_T1.sno2),
							S1_T3.pr(S6_T1.sno2_null_flg),
							S1_T3.pr(S6_T1.sno3),
							S1_T3.pr(S6_T1.sno3_null_flg),
							S1_T3.pr(S6_T1.sno4),
							S1_T3.pr(S6_T1.sno4_null_flg),
							S1_T3.pr(S6_T1.gd_cd),
							S1_M15.gd_nm,
							S1_T3.pr(S6_T1.quality_typ),
							S1_T3.pr(S6_T1.stk_insp_typ),
							S1_T3.pr(S6_T1.stk_id_typ),
							S1_T3.pr(S6_T1.stk_bp_cd),
							S1_M11.bp_nm.as("stk_bp_nm"),
							S1_T3.pr(S6_T1.ent_unit_qty),
							S1_T3.pr(S6_T1.ent_unit_cd),
							S1_M16.unit_nm.as("ent_unit_nm"),
							MAPA_CALC$F_RND_NE(
								bracket(
									S1_M23.conv_qty.divide(S1_M23.conv_base_qty)
								),
								S1_M23.dec_place,
								S1_M23.rnd_typ
							).as("ent_unit_bnum"),
							S1_T3.pr(S6_T1.ent_unit_qty).multiply(S1_M23.unit_wt).as("ent_unit_wt"),
							S1_T3.pr(S6_T1.ent_unit_qty).multiply(S1_M23.unit_dim).as("ent_unit_dim"),
							nvl2(
								S1_M23.unit_wt,
								S1_M17.unit_cd,
								nullValue()
							).as("wt_unit_cd"),
							nvl2(
								S1_M23.unit_wt,
								S1_M17.unit_nm,
								nullValue()
							).as("wt_unit_nm"),
							nvl2(
								S1_M23.unit_dim,
								S1_M18.unit_cd,
								nullValue()
							).as("dim_unit_cd"),
							nvl2(
								S1_M23.unit_dim,
								S1_M18.unit_nm,
								nullValue()
							).as("dim_unit_nm"),
							S1_T3.pr(S6_T1.trd_unit_qty),
							S1_T3.pr(S6_T1.trd_unit_cd),
							S1_M19.unit_nm.as("trd_unit_nm"),
							S1_T3.pr(S6_T1.base_unit_qty),
							S1_T3.pr(S6_T1.base_unit_cd),
							S1_M20.unit_nm.as("base_unit_nm"),
							S1_T3.pr(S6_T1.pack_unit_qty),
							S1_T3.pr(S6_T1.pack_unit_cd),
							S1_M21.unit_nm.as("pack_unit_nm"),
							S1_T3.pr(S6_T1.alloc_flg),
							S1_T2.pr(S4_T1.abort_flg),
							S1_M22.sls_acxfr_flg,
							S1_T7.sls_cststk_flg,
							S1_T7.vmi_flg,
							S1_T10.vld_dt.as("vld_dt"),
							S1_T10.lmt_dt,
							S1_T10.first_gr_dt,
							S1_T7.cst_itm_cd,
							S1_T7.cst_itm_nm,
							S1_T9.prov_typ,
							S1_T9.prov_basis_typ,
							S1_T9.ret_prov_typ,
							S1_T9.ret_prov_basis_typ,
							S1_T6.rsn_cd,
							S1_M22.biz_rsn_nm.as("rsn_nm"),
							S1_T1.pr(S2_T1.inst_rmrks),
							S1_T2.pr(S4_T1.inst_d_rmrks),
							S1_T2.pr(S4_T1.ship_cnt_rmrks),
							nvl(
								S1_T4.pr_sts_typ,
								S1_T5.pr_sts_typ
							).as("pr_sts_typ"),
							S1_T3.pr(S6_T1.disp_seq),
							S1_T3.pr(S6_T1.wms_flg)
						)
						.from(
							subQuery()
							.select(
								S2_T1.ship_inst_no,
								S2_T1.ship_inst_rev,
								S2_T1.ship_fr_lg_grp_cd,
								S2_T1.ship_inst_tm,
								S2_T1.ship_schd_tm,
								S2_T1.dlv_schd_tm,
								S2_T1.ship_wk_cd,
								S2_T1.ship_term_cd,
								S2_T1.inst_dpt_cd,
								S2_T1.inst_usr_cd,
								S2_T1.ship_to_lg_grp_cd,
								S2_T1.ship_to_id_typ,
								S2_T1.ship_to_id_cd,
								S2_T1.ship_to_id_nm,
								S2_T1.ship_to_zip_cd,
								S2_T1.ship_to_addr1,
								S2_T1.ship_to_addr2,
								S2_T1.ship_to_addr3,
								S2_T1.ship_to_addr4,
								S2_T1.ship_to_cntct_dpt,
								S2_T1.ship_to_cntct_psn,
								S2_T1.ship_to_tel,
								S2_T1.ship_to_fax,
								S2_T1.ship_to_sundry_flg,
								S2_T1.iv_no,
								S2_T1.inst_rmrks
							)
							.from(
								S2_W1
								.innerJoin(S2_T1).on(
									bracket(
										S2_T1.ship_inst_no.eq(S2_W1.ship_inst_no)
									)
								)
							)
							.unionAll(
								subQuery()
								.select(
									S3_T1.ship_inst_no,
									S3_T1.ship_inst_rev,
									S3_T1.ship_fr_lg_grp_cd,
									S3_T1.ship_inst_tm,
									S3_T1.ship_schd_tm,
									S3_T1.dlv_schd_tm,
									S3_T1.ship_wk_cd,
									S3_T1.ship_term_cd,
									S3_T1.inst_dpt_cd,
									S3_T1.inst_usr_cd,
									S3_T1.ship_to_lg_grp_cd,
									S3_T1.ship_to_id_typ,
									S3_T1.ship_to_id_cd,
									S3_T1.ship_to_id_nm,
									S3_T1.ship_to_zip_cd,
									S3_T1.ship_to_addr1,
									S3_T1.ship_to_addr2,
									S3_T1.ship_to_addr3,
									S3_T1.ship_to_addr4,
									S3_T1.ship_to_cntct_dpt,
									S3_T1.ship_to_cntct_psn,
									S3_T1.ship_to_tel,
									S3_T1.ship_to_fax,
									S3_T1.ship_to_sundry_flg,
									S3_T1.iv_no,
									S3_T1.inst_rmrks
								)
								.from(
									S3_W1
									.innerJoin(S3_W2).on(
										bracket(
											S3_W2.ship_inst_no.eq(S3_W1.ship_inst_no)
										)
									)
									.innerJoin(S3_T1).on(
										bracket(
											S3_T1.ship_inst_no.eq(S3_W2.ship_inst_no)
											.and(S3_T1.ship_inst_rev.eq(S3_W2.ship_inst_rev.subtract(value(1))))
										)
									)
								)
							).view(S1_T1)
							.innerJoin(
								subQuery()
								.select(
									S4_T1.ship_inst_no,
									S4_W2.ship_inst_rev,
									S4_T1.ship_inst_d_no,
									S4_T1.trd_cd,
									S4_T1.trd_ptn_typ,
									S4_T1.itm_cd,
									S4_T1.itm_sub1,
									S4_T1.itm_sub2,
									S4_T1.itm_sub3,
									S4_T1.sundry_itm_flg,
									S4_T1.itm_nm,
									S4_T1.abort_flg,
									S4_T1.inst_d_rmrks,
									S4_T1.ship_cnt_rmrks
								)
								.from(
									S4_W1
									.innerJoin(S4_W2).on(
										bracket(
											S4_W2.ship_inst_no.eq(S4_W1.ship_inst_no)
										)
									)
									.innerJoin(S4_T1).on(
										bracket(
											S4_T1.ship_inst_no.eq(S4_W1.ship_inst_no)
										)
									)
								)
								.unionAll(
									subQuery()
									.select(
										S5_T1.ship_inst_no,
										S5_T1.ship_inst_rev,
										S5_T1.ship_inst_d_no,
										S5_T1.trd_cd,
										S5_T1.trd_ptn_typ,
										S5_T1.itm_cd,
										S5_T1.itm_sub1,
										S5_T1.itm_sub2,
										S5_T1.itm_sub3,
										S5_T1.sundry_itm_flg,
										S5_T1.itm_nm,
										S5_T1.abort_flg,
										S5_T1.inst_d_rmrks,
										S5_T1.ship_cnt_rmrks
									)
									.from(
										S5_W1
										.innerJoin(S5_W2).on(
											bracket(
												S5_W2.ship_inst_no.eq(S5_W1.ship_inst_no)
											)
										)
										.innerJoin(S5_T1).on(
											bracket(
												S5_T1.ship_inst_no.eq(S5_W2.ship_inst_no)
												.and(S5_T1.ship_inst_rev.eq(S5_W2.ship_inst_rev.subtract(value(1))))
											)
										)
									)
								).view(S1_T2)
							).on(
								bracket(
									S1_T2.pr(S4_T1.ship_inst_no).eq(S1_T1.pr(S2_T1.ship_inst_no))
									.and(S1_T2.pr(S4_W2.ship_inst_rev).eq(S1_T1.pr(S2_T1.ship_inst_rev)))
								)
							)
							.innerJoin(
								subQuery()
								.select(
									S6_T1.ship_inst_no,
									S6_W2.ship_inst_rev,
									S6_T1.ship_inst_d_no,
									S6_T1.ship_alloc_sts_no,
									S6_T1.ship_schd_no,
									S6_T1.dlv_slip_no,
									S6_T1.dlv_slip_d_no,
									S6_T1.ship_loc_cd,
									S6_T1.ship_str_ln_cd,
									S6_T1.lot_no,
									S6_T1.sublot_no,
									S6_T1.ver_no,
									S6_T1.sno1,
									S6_T1.sno1_null_flg,
									S6_T1.sno2,
									S6_T1.sno2_null_flg,
									S6_T1.sno3,
									S6_T1.sno3_null_flg,
									S6_T1.sno4,
									S6_T1.sno4_null_flg,
									S6_T1.gd_cd,
									S6_T1.quality_typ,
									S6_T1.stk_insp_typ,
									S6_T1.stk_id_typ,
									S6_T1.stk_bp_cd,
									S6_T1.ent_unit_qty,
									S6_T1.ent_unit_cd,
									S6_T1.trd_unit_qty,
									S6_T1.trd_unit_cd,
									S6_T1.base_unit_qty,
									S6_T1.base_unit_cd,
									S6_T1.pack_unit_qty,
									S6_T1.pack_unit_cd,
									S6_T1.alloc_flg,
									S6_T1.disp_seq,
									S6_T1.wms_flg
								)
								.from(
									S6_W1
									.innerJoin(S6_W2).on(
										bracket(
											S6_W2.ship_inst_no.eq(S6_W1.ship_inst_no)
										)
									)
									.innerJoin(S6_T1).on(
										bracket(
											S6_T1.ship_inst_no.eq(S6_W1.ship_inst_no)
										)
									)
								)
								.unionAll(
									subQuery()
									.select(
										S7_T1.ship_inst_no,
										S7_T1.ship_inst_rev,
										S7_T1.ship_inst_d_no,
										S7_T1.ship_alloc_sts_no,
										S7_T1.ship_schd_no,
										S7_T1.dlv_slip_no,
										S7_T1.dlv_slip_d_no,
										S7_T1.ship_loc_cd,
										S7_T1.ship_str_ln_cd,
										S7_T1.lot_no,
										S7_T1.sublot_no,
										S7_T1.ver_no,
										S7_T1.sno1,
										S7_T1.sno1_null_flg,
										S7_T1.sno2,
										S7_T1.sno2_null_flg,
										S7_T1.sno3,
										S7_T1.sno3_null_flg,
										S7_T1.sno4,
										S7_T1.sno4_null_flg,
										S7_T1.gd_cd,
										S7_T1.quality_typ,
										S7_T1.stk_insp_typ,
										S7_T1.stk_id_typ,
										S7_T1.stk_bp_cd,
										S7_T1.ent_unit_qty,
										S7_T1.ent_unit_cd,
										S7_T1.trd_unit_qty,
										S7_T1.trd_unit_cd,
										S7_T1.base_unit_qty,
										S7_T1.base_unit_cd,
										S7_T1.pack_unit_qty,
										S7_T1.pack_unit_cd,
										S7_T1.alloc_flg,
										S7_T1.disp_seq,
										S7_T1.wms_flg
									)
									.from(
										S7_W1
										.innerJoin(S7_W2).on(
											bracket(
												S7_W2.ship_inst_no.eq(S7_W1.ship_inst_no)
											)
										)
										.innerJoin(S7_T1).on(
											bracket(
												S7_T1.ship_inst_no.eq(S7_W2.ship_inst_no)
												.and(S7_T1.ship_inst_rev.eq(S7_W2.ship_inst_rev.subtract(value(1))))
											)
										)
									)
								).view(S1_T3)
							).on(
								bracket(
									S1_T3.pr(S6_T1.ship_inst_d_no).eq(S1_T2.pr(S4_T1.ship_inst_d_no))
									.and(S1_T3.pr(S6_W2.ship_inst_rev).eq(S1_T2.pr(S4_W2.ship_inst_rev)))
								)
							)
							.leftOuterJoin(S1_T4).on(
								bracket(
									S1_T4.ship_inst_d_no.eq(S1_T3.pr(S6_T1.ship_inst_d_no))
								)
							)
							.leftOuterJoin(S1_T5).on(
								bracket(
									S1_T5.ship_schd_no.eq(S1_T3.pr(S6_T1.ship_schd_no))
								)
							)
							.innerJoin(S1_T6).on(
								bracket(
									S1_T6.ship_pr_no.eq(nvl(
											S1_T4.ship_pr_no,
											S1_T5.ship_pr_no
										)
									)
								)
							)
							.leftOuterJoin(S1_T7).on(
								bracket(
									S1_T7.slo_d_no.eq(S1_T6.slo_d_no)
								)
							)
							.leftOuterJoin(S1_T8).on(
								bracket(
									S1_T8.slo_no.eq(S1_T7.slo_no)
								)
							)
							.leftOuterJoin(S1_T9).on(
								bracket(
									S1_T9.xfr_schd_no.eq(S1_T6.xfr_schd_no)
								)
							)
							.leftOuterJoin(S1_T10).on(
								bracket(
									S1_T10.itm_cd.eq(S1_T2.pr(S4_T1.itm_cd))
									.and(S1_T10.itm_sub1.eq(S1_T2.pr(S4_T1.itm_sub1)))
									.and(S1_T10.itm_sub2.eq(S1_T2.pr(S4_T1.itm_sub2)))
									.and(S1_T10.itm_sub3.eq(S1_T2.pr(S4_T1.itm_sub3)))
									.and(S1_T10.lot_no.eq(S1_T3.pr(S6_T1.lot_no)))
									.and(S1_T10.sublot_no.eq(S1_T3.pr(S6_T1.sublot_no)))
								)
							)
							.leftOuterJoin(S1_T13).on(
								bracket(
									S1_T13.ship_schd_no.eq(nvl(
											S1_T4.ship_schd_no,
											S1_T5.ship_schd_no
										)
									)
								)
							)
							.leftOuterJoin(S1_T12).on(
								bracket(
									S1_T12.iv_d_no.eq(S1_T13.iv_d_no)
								)
							)
							.leftOuterJoin(S1_T11).on(
								bracket(
									S1_T11.iv_mng_no.eq(S1_T12.iv_mng_no)
								)
							)
							.leftOuterJoin(S1_M1).on(
								bracket(
									S1_M1.lg_grp_cd.eq(S1_T1.pr(S2_T1.ship_fr_lg_grp_cd))
								)
							)
							.leftOuterJoin(S1_M2).on(
								bracket(
									S1_M2.lg_grp_cd.eq(S1_T1.pr(S2_T1.ship_to_lg_grp_cd))
								)
							)
							.leftOuterJoin(S1_M3).on(
								bracket(
									S1_M3.ship_wk_cd.eq(S1_T1.pr(S2_T1.ship_wk_cd))
								)
							)
							.leftOuterJoin(S1_M4).on(
								bracket(
									S1_M4.ship_term_cd.eq(S1_T1.pr(S2_T1.ship_term_cd))
								)
							)
							.leftOuterJoin(S1_M5).on(
								bracket(
									S1_M5.ship_to_id_typ.eq(S1_T1.pr(S2_T1.ship_to_id_typ))
									.and(S1_M5.ship_to_id_cd.eq(S1_T1.pr(S2_T1.ship_to_id_cd)))
								)
							)
							.leftOuterJoin(S1_M6).on(
								bracket(
									S1_M6.dlv_id_typ.eq(S1_T6.dlv_id_typ)
									.and(
										S1_M6.dlv_id_cd.eq(decode(
												S1_T7.slo_d_no,
												nullValue(),
												S1_T6.dlv_id_cd,
												nvl(
													nvl(
														S1_T4.dlv_cd,
														S1_T5.dlv_cd
													),
													S1_T6.dlv_id_cd
												)
											)
										)
									)
								)
							)
							.leftOuterJoin(S1_M7).on(
								bracket(
									S1_M7.bp_cd.eq(S1_T6.cst_cd)
								)
							)
							.leftOuterJoin(S1_M8).on(
								bracket(
									S1_M8.bp_cd.eq(S1_T7.dest_cd1)
								)
							)
							.leftOuterJoin(S1_M9).on(
								bracket(
									S1_M9.bp_cd.eq(S1_T7.dest_cd2)
								)
							)
							.leftOuterJoin(S1_M10).on(
								bracket(
									S1_M10.bp_cd.eq(S1_T7.dest_cd3)
								)
							)
							.leftOuterJoin(S1_M11).on(
								bracket(
									S1_M11.bp_cd.eq(S1_T3.pr(S6_T1.stk_bp_cd))
								)
							)
							.leftOuterJoin(S1_M12).on(
								bracket(
									S1_M12.trd_cd.eq(S1_T2.pr(S4_T1.trd_cd))
								)
							)
							.leftOuterJoin(S1_M13).on(
								bracket(
									S1_M13.loc_cd.eq(S1_T3.pr(S6_T1.ship_loc_cd))
								)
							)
							.leftOuterJoin(S1_M14).on(
								bracket(
									S1_M14.loc_cd.eq(S1_T3.pr(S6_T1.ship_loc_cd))
									.and(S1_M14.str_ln_cd.eq(S1_T3.pr(S6_T1.ship_str_ln_cd)))
								)
							)
							.leftOuterJoin(S1_M15).on(
								bracket(
									S1_M15.gd_cd.eq(S1_T3.pr(S6_T1.gd_cd))
								)
							)
							.leftOuterJoin(S1_M16).on(
								bracket(
									S1_M16.unit_cd.eq(S1_T3.pr(S6_T1.ent_unit_cd))
								)
							)
							.leftOuterJoin(S1_M17).on(
								bracket(
									S1_M17.unit_cd.eq(value(MSC_IF_UNIT_CD_TYP.WT_UNIT_CD.value()))
								)
							)
							.leftOuterJoin(S1_M18).on(
								bracket(
									S1_M18.unit_cd.eq(value(MSC_IF_UNIT_CD_TYP.DIM_UNIT_CD.value()))
								)
							)
							.leftOuterJoin(S1_M19).on(
								bracket(
									S1_M19.unit_cd.eq(S1_T3.pr(S6_T1.trd_unit_cd))
								)
							)
							.leftOuterJoin(S1_M20).on(
								bracket(
									S1_M20.unit_cd.eq(S1_T3.pr(S6_T1.base_unit_cd))
								)
							)
							.leftOuterJoin(S1_M21).on(
								bracket(
									S1_M21.unit_cd.eq(S1_T3.pr(S6_T1.pack_unit_cd))
								)
							)
							.leftOuterJoin(S1_M22).on(
								bracket(
									S1_M22.biz_rsn_cd.eq(S1_T6.rsn_cd)
								)
							)
							.leftOuterJoin(S1_M23).on(
								bracket(
									S1_M23.itm_cd.eq(S1_T2.pr(S4_T1.itm_cd))
									.and(S1_M23.itm_sub1.eq(S1_T2.pr(S4_T1.itm_sub1)))
									.and(S1_M23.itm_sub2.eq(S1_T2.pr(S4_T1.itm_sub2)))
									.and(S1_M23.itm_sub3.eq(S1_T2.pr(S4_T1.itm_sub3)))
									.and(S1_M23.unit_cd.eq(S1_T3.pr(S6_T1.ent_unit_cd)))
								)
							)
							.leftOuterJoin(S1_M24).on(
								bracket(
									S1_M24.itm_cd.eq(S1_T2.pr(S4_T1.itm_cd))
									.and(S1_M24.itm_sub1.eq(S1_T2.pr(S4_T1.itm_sub1)))
									.and(S1_M24.itm_sub2.eq(S1_T2.pr(S4_T1.itm_sub2)))
									.and(S1_M24.itm_sub3.eq(S1_T2.pr(S4_T1.itm_sub3)))
								)
							)
							.leftOuterJoin(S1_M25).on(
								bracket(
									S1_M25.itm_cd.eq(S1_T2.pr(S4_T1.itm_cd))
									.and(S1_M25.itm_sub1.eq(S1_T2.pr(S4_T1.itm_sub1)))
									.and(S1_M25.itm_sub2.eq(S1_T2.pr(S4_T1.itm_sub2)))
									.and(S1_M25.itm_sub3.eq(S1_T2.pr(S4_T1.itm_sub3)))
									.and(S1_M25.sno1.eq(S1_T3.pr(S6_T1.sno1)))
									.and(S1_M25.sno2.eq(S1_T3.pr(S6_T1.sno2)))
									.and(S1_M25.sno3.eq(S1_T3.pr(S6_T1.sno3)))
									.and(S1_M25.sno4.eq(S1_T3.pr(S6_T1.sno4)))
								)
							)
							.leftOuterJoin(S1_M26).on(
								bracket(
									S1_M26.site_co_cd.eq(S1_M1.site_co_cd)
								)
							)
							.leftOuterJoin(S1_M27).on(
								bracket(
									S1_M27.dpt_cd.eq(S1_T1.pr(S2_T1.inst_dpt_cd))
									.and(S1_T1.pr(S2_T1.ship_inst_tm).between(S1_M27.st_dt, S1_M27.end_dt))
								)
							)
							.leftOuterJoin(S1_M28).on(
								bracket(
									S1_M28.usr_cd.eq(S1_T1.pr(S2_T1.inst_usr_cd))
								)
							)
						)
						.where(
							exists(
								subQuery()
								.select(value("X"))
								.from(S8)
								.where(
									S8.ship_alloc_sts_no.eq(S1_T3.pr(S6_T1.ship_alloc_sts_no))
								)
							)
						).view(S0_V1)
						.leftOuterJoin(S0_T1).on(
							bracket(
								S0_T1.ship_inst_no.eq(S0_V1.pr(S2_T1.ship_inst_no))
								.and(S0_T1.ship_inst_rev.eq(S0_V1.pr(S2_T1.ship_inst_rev)))
							)
						)
					)
					.unionAll(
						subQuery()
						.select(
							S9_V1.prAll(),
							S9_V1.pr(S11_T1.ship_inst_rev).as("latest_rev"),
							value(true).as("can_flg")
						)
						.from(
							subQuery()
							.select(
								S10_T1.pr(S11_T1.ship_inst_no),
								S10_T1.pr(S11_T1.ship_inst_rev),
								S10_T1.pr(S11_T1.ship_fr_lg_grp_cd),
								S10_M1.lg_grp_nm.as("ship_fr_lg_grp_nm"),
								S10_M1.site_co_cd.as("site_co_cd"),
								S10_M26.site_co_nm.as("site_co_nm"),
								S10_T1.pr(S11_T1.ship_inst_tm),
								S10_T1.pr(S11_T1.ship_schd_tm),
								S10_T1.pr(S11_T1.dlv_schd_tm),
								S10_T1.pr(S11_T1.ship_wk_cd),
								S10_M3.ship_wk_nm,
								S10_T1.pr(S11_T1.ship_term_cd),
								S10_M4.ship_term_nm,
								S10_T1.pr(S11_T1.inst_dpt_cd),
								S10_M27.dpt_nm.as("inst_dpt_nm"),
								S10_T1.pr(S11_T1.inst_usr_cd),
								S10_M28.usr_nm.as("inst_usr_nm"),
								S10_T1.pr(S11_T1.ship_to_lg_grp_cd),
								S10_M2.lg_grp_nm.as("ship_to_lg_grp_nm"),
								S10_T1.pr(S11_T1.ship_to_id_typ),
								S10_T1.pr(S11_T1.ship_to_id_cd),
								nvl(
									S10_T1.pr(S11_T1.ship_to_id_nm),
									S10_M5.ship_to_id_nm
								).as("ship_to_id_nm"),
								S10_T1.pr(S11_T1.ship_to_zip_cd),
								S10_T1.pr(S11_T1.ship_to_addr1),
								S10_T1.pr(S11_T1.ship_to_addr2),
								S10_T1.pr(S11_T1.ship_to_addr3),
								S10_T1.pr(S11_T1.ship_to_addr4),
								S10_T1.pr(S11_T1.ship_to_cntct_dpt),
								S10_T1.pr(S11_T1.ship_to_cntct_psn),
								S10_T1.pr(S11_T1.ship_to_tel),
								S10_T1.pr(S11_T1.ship_to_fax),
								S10_T1.pr(S11_T1.ship_to_sundry_flg),
								S10_T6.dlv_id_typ,
								decode(
									S10_T7.slo_d_no,
									nullValue(),
									S10_T6.dlv_id_cd,
									nvl(
										nvl(
											S10_T4.dlv_cd,
											S10_T5.dlv_cd
										),
										S10_T6.dlv_id_cd
									)
								).as("dlv_id_cd"),
								decode(
									S10_T7.slo_d_no,
									nullValue(),
									nvl(
										S10_T6.dlv_id_nm,
										S10_M6.dlv_id_nm
									),
									nvl2(
										nvl(
											S10_T4.dlv_cd,
											S10_T5.dlv_cd
										),
										nvl(
											nvl(
												S10_T4.dlv_nm,
												S10_T5.dlv_nm
											),
											S10_M6.dlv_id_nm
										),
										nvl(
											S10_T6.dlv_id_nm,
											S10_M6.dlv_id_nm
										)
									)
								).as("dlv_id_nm"),
								S10_T6.cst_cd,
								S10_M7.bp_nm.as("cst_nm"),
								S10_T7.dest_cd1,
								S10_M8.bp_nm.as("dest_nm1"),
								S10_T7.dest_cd2,
								S10_M9.bp_nm.as("dest_nm2"),
								S10_T7.dest_cd3,
								S10_M10.bp_nm.as("dest_nm3"),
								S10_T2.pr(S13_T1.ship_inst_d_no),
								S10_T3.pr(S15_T1.ship_alloc_sts_no),
								S10_T1.pr(S11_T1.iv_no),
								S10_T13.iv_d_no,
								S10_T3.pr(S15_T1.dlv_slip_no),
								S10_T3.pr(S15_T1.dlv_slip_d_no),
								S10_T2.pr(S13_T1.trd_cd),
								S10_M12.trd_nm,
								S10_T2.pr(S13_T1.trd_ptn_typ),
								S10_T3.pr(S15_T1.ship_loc_cd),
								S10_M13.loc_nm.as("ship_loc_nm"),
								S10_T3.pr(S15_T1.ship_str_ln_cd),
								S10_M14.str_ln_nm.as("ship_str_ln_nm"),
								MAPA_LOC$F_GET_LOC_ADDR(
									S10_T3.pr(S15_T1.ship_loc_cd),
									S10_T1.pr(S11_T1.ship_inst_tm),
									value(MAC_LOC_ADDR_TYP.TEL.value()),
									nullValue()
								).as("ship_loc_tel"),
								MAPA_LOC$F_GET_LOC_ADDR(
									S10_T3.pr(S15_T1.ship_loc_cd),
									S10_T1.pr(S11_T1.ship_inst_tm),
									value(MAC_LOC_ADDR_TYP.FAX.value()),
									nullValue()
								).as("ship_loc_fax"),
								S10_T6.dlv_rqst_tm,
								nvl(
									S10_T4.pd_inst_dlv_tm,
									S10_T5.pd_inst_dlv_tm
								).as("pd_inst_dlv_tm"),
								nvl(
									S10_T4.ship_rqst_tm,
									S10_T5.ship_rqst_tm
								).as("ship_rqst_tm"),
								cases()
									.when(S10_T8.assort_typ.eq(value(MSC_SHIP_ASSORT_TYP.AST.value())))
										.then(value(true))
									.otherwise(value(false)).as("assort_flg"),
								S10_T7.set_itm_grp_no,
								S10_T2.pr(S13_T1.itm_cd),
								S10_T2.pr(S13_T1.itm_sub1),
								S10_T2.pr(S13_T1.itm_sub2),
								S10_T2.pr(S13_T1.itm_sub3),
								decode(
									S10_T2.pr(S13_T1.sundry_itm_flg),
									value(true),
									nvl(
										S10_T2.pr(S13_T1.itm_nm),
										S10_M25.itm_nm
									),
									S10_M24.itm_nm
								).as("itm_nm"),
								S10_T3.pr(S15_T1.lot_no),
								S10_T3.pr(S15_T1.sublot_no),
								S10_T3.pr(S15_T1.ver_no),
								S10_T3.pr(S15_T1.sno1),
								S10_T3.pr(S15_T1.sno1_null_flg),
								S10_T3.pr(S15_T1.sno2),
								S10_T3.pr(S15_T1.sno2_null_flg),
								S10_T3.pr(S15_T1.sno3),
								S10_T3.pr(S15_T1.sno3_null_flg),
								S10_T3.pr(S15_T1.sno4),
								S10_T3.pr(S15_T1.sno4_null_flg),
								S10_T3.pr(S15_T1.gd_cd),
								S10_M15.gd_nm,
								S10_T3.pr(S15_T1.quality_typ),
								S10_T3.pr(S15_T1.stk_insp_typ),
								S10_T3.pr(S15_T1.stk_id_typ),
								S10_T3.pr(S15_T1.stk_bp_cd),
								S10_M11.bp_nm.as("stk_bp_nm"),
								S10_T3.pr(S15_T1.ent_unit_qty),
								S10_T3.pr(S15_T1.ent_unit_cd),
								S10_M16.unit_nm.as("ent_unit_nm"),
								MAPA_CALC$F_RND_NE(
									bracket(
										S10_M23.conv_qty.divide(S10_M23.conv_base_qty)
									),
									S10_M23.dec_place,
									S10_M23.rnd_typ
								).as("ent_unit_bnum"),
								S10_T3.pr(S15_T1.ent_unit_qty).multiply(S10_M23.unit_wt).as("ent_unit_wt"),
								S10_T3.pr(S15_T1.ent_unit_qty).multiply(S10_M23.unit_dim).as("ent_unit_dim"),
								nvl2(
									S10_M23.unit_wt,
									S10_M17.unit_cd,
									nullValue()
								).as("wt_unit_cd"),
								nvl2(
									S10_M23.unit_wt,
									S10_M17.unit_nm,
									nullValue()
								).as("wt_unit_nm"),
								nvl2(
									S10_M23.unit_dim,
									S10_M18.unit_cd,
									nullValue()
								).as("dim_unit_cd"),
								nvl2(
									S10_M23.unit_dim,
									S10_M18.unit_nm,
									nullValue()
								).as("dim_unit_nm"),
								S10_T3.pr(S15_T1.trd_unit_qty),
								S10_T3.pr(S15_T1.trd_unit_cd),
								S10_M19.unit_nm.as("trd_unit_nm"),
								S10_T3.pr(S15_T1.base_unit_qty),
								S10_T3.pr(S15_T1.base_unit_cd),
								S10_M20.unit_nm.as("base_unit_nm"),
								S10_T3.pr(S15_T1.pack_unit_qty),
								S10_T3.pr(S15_T1.pack_unit_cd),
								S10_M21.unit_nm.as("pack_unit_nm"),
								S10_T3.pr(S15_T1.alloc_flg),
								S10_T2.pr(S13_T1.abort_flg),
								S10_M22.sls_acxfr_flg,
								S10_T7.sls_cststk_flg,
								S10_T7.vmi_flg,
								S10_T10.vld_dt.as("vld_dt"),
								S10_T10.lmt_dt,
								S10_T10.first_gr_dt,
								S10_T7.cst_itm_cd,
								S10_T7.cst_itm_nm,
								S10_T9.prov_typ,
								S10_T9.prov_basis_typ,
								S10_T9.ret_prov_typ,
								S10_T9.ret_prov_basis_typ,
								S10_T6.rsn_cd,
								S10_M22.biz_rsn_nm.as("rsn_nm"),
								S10_T1.pr(S11_T1.inst_rmrks),
								S10_T2.pr(S13_T1.inst_d_rmrks),
								S10_T2.pr(S13_T1.ship_cnt_rmrks),
								nvl(
									S10_T4.pr_sts_typ,
									S10_T5.pr_sts_typ
								).as("pr_sts_typ"),
								S10_T3.pr(S15_T1.disp_seq),
								S10_T3.pr(S15_T1.wms_flg)
							)
							.from(
								subQuery()
								.select(
									S11_T1.ship_inst_no,
									S11_T1.ship_inst_rev,
									S11_T1.ship_fr_lg_grp_cd,
									S11_T1.ship_inst_tm,
									S11_T1.ship_schd_tm,
									S11_T1.dlv_schd_tm,
									S11_T1.ship_wk_cd,
									S11_T1.ship_term_cd,
									S11_T1.inst_dpt_cd,
									S11_T1.inst_usr_cd,
									S11_T1.ship_to_lg_grp_cd,
									S11_T1.ship_to_id_typ,
									S11_T1.ship_to_id_cd,
									S11_T1.ship_to_id_nm,
									S11_T1.ship_to_zip_cd,
									S11_T1.ship_to_addr1,
									S11_T1.ship_to_addr2,
									S11_T1.ship_to_addr3,
									S11_T1.ship_to_addr4,
									S11_T1.ship_to_cntct_dpt,
									S11_T1.ship_to_cntct_psn,
									S11_T1.ship_to_tel,
									S11_T1.ship_to_fax,
									S11_T1.ship_to_sundry_flg,
									S11_T1.iv_no,
									S11_T1.inst_rmrks
								)
								.from(
									S11_W1
									.innerJoin(S11_T1).on(
										bracket(
											S11_T1.ship_inst_no.eq(S11_W1.ship_inst_no)
										)
									)
								)
								.unionAll(
									subQuery()
									.select(
										S12_T1.ship_inst_no,
										S12_T1.ship_inst_rev,
										S12_T1.ship_fr_lg_grp_cd,
										S12_T1.ship_inst_tm,
										S12_T1.ship_schd_tm,
										S12_T1.dlv_schd_tm,
										S12_T1.ship_wk_cd,
										S12_T1.ship_term_cd,
										S12_T1.inst_dpt_cd,
										S12_T1.inst_usr_cd,
										S12_T1.ship_to_lg_grp_cd,
										S12_T1.ship_to_id_typ,
										S12_T1.ship_to_id_cd,
										S12_T1.ship_to_id_nm,
										S12_T1.ship_to_zip_cd,
										S12_T1.ship_to_addr1,
										S12_T1.ship_to_addr2,
										S12_T1.ship_to_addr3,
										S12_T1.ship_to_addr4,
										S12_T1.ship_to_cntct_dpt,
										S12_T1.ship_to_cntct_psn,
										S12_T1.ship_to_tel,
										S12_T1.ship_to_fax,
										S12_T1.ship_to_sundry_flg,
										S12_T1.iv_no,
										S12_T1.inst_rmrks
									)
									.from(
										S12_W1
										.innerJoin(S12_W2).on(
											bracket(
												S12_W2.ship_inst_no.eq(S12_W1.ship_inst_no)
											)
										)
										.innerJoin(S12_T1).on(
											bracket(
												S12_T1.ship_inst_no.eq(S12_W2.ship_inst_no)
												.and(S12_T1.ship_inst_rev.eq(S12_W2.ship_inst_rev.subtract(value(1))))
											)
										)
									)
								).view(S10_T1)
								.innerJoin(
									subQuery()
									.select(
										S13_T1.ship_inst_no,
										S13_W2.ship_inst_rev,
										S13_T1.ship_inst_d_no,
										S13_T1.trd_cd,
										S13_T1.trd_ptn_typ,
										S13_T1.itm_cd,
										S13_T1.itm_sub1,
										S13_T1.itm_sub2,
										S13_T1.itm_sub3,
										S13_T1.sundry_itm_flg,
										S13_T1.itm_nm,
										S13_T1.abort_flg,
										S13_T1.inst_d_rmrks,
										S13_T1.ship_cnt_rmrks
									)
									.from(
										S13_W1
										.innerJoin(S13_W2).on(
											bracket(
												S13_W2.ship_inst_no.eq(S13_W1.ship_inst_no)
											)
										)
										.innerJoin(S13_T1).on(
											bracket(
												S13_T1.ship_inst_no.eq(S13_W1.ship_inst_no)
											)
										)
									)
									.unionAll(
										subQuery()
										.select(
											S14_T1.ship_inst_no,
											S14_T1.ship_inst_rev,
											S14_T1.ship_inst_d_no,
											S14_T1.trd_cd,
											S14_T1.trd_ptn_typ,
											S14_T1.itm_cd,
											S14_T1.itm_sub1,
											S14_T1.itm_sub2,
											S14_T1.itm_sub3,
											S14_T1.sundry_itm_flg,
											S14_T1.itm_nm,
											S14_T1.abort_flg,
											S14_T1.inst_d_rmrks,
											S14_T1.ship_cnt_rmrks
										)
										.from(
											S14_W1
											.innerJoin(S14_W2).on(
												bracket(
													S14_W2.ship_inst_no.eq(S14_W1.ship_inst_no)
												)
											)
											.innerJoin(S14_T1).on(
												bracket(
													S14_T1.ship_inst_no.eq(S14_W2.ship_inst_no)
													.and(S14_T1.ship_inst_rev.eq(S14_W2.ship_inst_rev.subtract(value(1))))
												)
											)
										)
									).view(S10_T2)
								).on(
									bracket(
										S10_T2.pr(S13_T1.ship_inst_no).eq(S10_T1.pr(S11_T1.ship_inst_no))
										.and(S10_T2.pr(S13_W2.ship_inst_rev).eq(S10_T1.pr(S11_T1.ship_inst_rev)))
									)
								)
								.innerJoin(
									subQuery()
									.select(
										S15_T1.ship_inst_no,
										S15_W2.ship_inst_rev,
										S15_T1.ship_inst_d_no,
										S15_T1.ship_alloc_sts_no,
										S15_T1.ship_schd_no,
										S15_T1.dlv_slip_no,
										S15_T1.dlv_slip_d_no,
										S15_T1.ship_loc_cd,
										S15_T1.ship_str_ln_cd,
										S15_T1.lot_no,
										S15_T1.sublot_no,
										S15_T1.ver_no,
										S15_T1.sno1,
										S15_T1.sno1_null_flg,
										S15_T1.sno2,
										S15_T1.sno2_null_flg,
										S15_T1.sno3,
										S15_T1.sno3_null_flg,
										S15_T1.sno4,
										S15_T1.sno4_null_flg,
										S15_T1.gd_cd,
										S15_T1.quality_typ,
										S15_T1.stk_insp_typ,
										S15_T1.stk_id_typ,
										S15_T1.stk_bp_cd,
										S15_T1.ent_unit_qty,
										S15_T1.ent_unit_cd,
										S15_T1.trd_unit_qty,
										S15_T1.trd_unit_cd,
										S15_T1.base_unit_qty,
										S15_T1.base_unit_cd,
										S15_T1.pack_unit_qty,
										S15_T1.pack_unit_cd,
										S15_T1.alloc_flg,
										S15_T1.disp_seq,
										S15_T1.wms_flg
									)
									.from(
										S15_W1
										.innerJoin(S15_W2).on(
											bracket(
												S15_W2.ship_inst_no.eq(S15_W1.ship_inst_no)
											)
										)
										.innerJoin(S15_T1).on(
											bracket(
												S15_T1.ship_inst_no.eq(S15_W1.ship_inst_no)
											)
										)
									)
									.unionAll(
										subQuery()
										.select(
											S16_T1.ship_inst_no,
											S16_T1.ship_inst_rev,
											S16_T1.ship_inst_d_no,
											S16_T1.ship_alloc_sts_no,
											S16_T1.ship_schd_no,
											S16_T1.dlv_slip_no,
											S16_T1.dlv_slip_d_no,
											S16_T1.ship_loc_cd,
											S16_T1.ship_str_ln_cd,
											S16_T1.lot_no,
											S16_T1.sublot_no,
											S16_T1.ver_no,
											S16_T1.sno1,
											S16_T1.sno1_null_flg,
											S16_T1.sno2,
											S16_T1.sno2_null_flg,
											S16_T1.sno3,
											S16_T1.sno3_null_flg,
											S16_T1.sno4,
											S16_T1.sno4_null_flg,
											S16_T1.gd_cd,
											S16_T1.quality_typ,
											S16_T1.stk_insp_typ,
											S16_T1.stk_id_typ,
											S16_T1.stk_bp_cd,
											S16_T1.ent_unit_qty,
											S16_T1.ent_unit_cd,
											S16_T1.trd_unit_qty,
											S16_T1.trd_unit_cd,
											S16_T1.base_unit_qty,
											S16_T1.base_unit_cd,
											S16_T1.pack_unit_qty,
											S16_T1.pack_unit_cd,
											S16_T1.alloc_flg,
											S16_T1.disp_seq,
											S16_T1.wms_flg
										)
										.from(
											S16_W1
											.innerJoin(S16_W2).on(
												bracket(
													S16_W2.ship_inst_no.eq(S16_W1.ship_inst_no)
												)
											)
											.innerJoin(S16_T1).on(
												bracket(
													S16_T1.ship_inst_no.eq(S16_W2.ship_inst_no)
													.and(S16_T1.ship_inst_rev.eq(S16_W2.ship_inst_rev.subtract(value(1))))
												)
											)
										)
									).view(S10_T3)
								).on(
									bracket(
										S10_T3.pr(S15_T1.ship_inst_d_no).eq(S10_T2.pr(S13_T1.ship_inst_d_no))
										.and(S10_T3.pr(S15_W2.ship_inst_rev).eq(S10_T2.pr(S13_W2.ship_inst_rev)))
									)
								)
								.leftOuterJoin(S10_T4).on(
									bracket(
										S10_T4.ship_inst_d_no.eq(S10_T3.pr(S15_T1.ship_inst_d_no))
									)
								)
								.leftOuterJoin(S10_T5).on(
									bracket(
										S10_T5.ship_schd_no.eq(S10_T3.pr(S15_T1.ship_schd_no))
									)
								)
								.innerJoin(S10_T6).on(
									bracket(
										S10_T6.ship_pr_no.eq(nvl(
												S10_T4.ship_pr_no,
												S10_T5.ship_pr_no
											)
										)
									)
								)
								.leftOuterJoin(S10_T7).on(
									bracket(
										S10_T7.slo_d_no.eq(S10_T6.slo_d_no)
									)
								)
								.leftOuterJoin(S10_T8).on(
									bracket(
										S10_T8.slo_no.eq(S10_T7.slo_no)
									)
								)
								.leftOuterJoin(S10_T9).on(
									bracket(
										S10_T9.xfr_schd_no.eq(S10_T6.xfr_schd_no)
									)
								)
								.leftOuterJoin(S10_T10).on(
									bracket(
										S10_T10.itm_cd.eq(S10_T2.pr(S13_T1.itm_cd))
										.and(S10_T10.itm_sub1.eq(S10_T2.pr(S13_T1.itm_sub1)))
										.and(S10_T10.itm_sub2.eq(S10_T2.pr(S13_T1.itm_sub2)))
										.and(S10_T10.itm_sub3.eq(S10_T2.pr(S13_T1.itm_sub3)))
										.and(S10_T10.lot_no.eq(S10_T3.pr(S15_T1.lot_no)))
										.and(S10_T10.sublot_no.eq(S10_T3.pr(S15_T1.sublot_no)))
									)
								)
								.leftOuterJoin(S10_T11).on(
									bracket(
										S10_T11.iv_no.eq(S10_T1.pr(S11_T1.iv_no))
										.and(S10_T11.iv_ship_flg.eq(value(true)))
									)
								)
								.leftOuterJoin(S10_T12).on(
									bracket(
										S10_T12.iv_mng_no.eq(S10_T11.iv_mng_no)
									)
								)
								.leftOuterJoin(S10_T13).on(
									bracket(
										S10_T13.ship_schd_no.eq(nvl(
												S10_T4.ship_schd_no,
												S10_T5.ship_schd_no
											)
										)
									)
								)
								.leftOuterJoin(S10_M1).on(
									bracket(
										S10_M1.lg_grp_cd.eq(S10_T1.pr(S11_T1.ship_fr_lg_grp_cd))
									)
								)
								.leftOuterJoin(S10_M2).on(
									bracket(
										S10_M2.lg_grp_cd.eq(S10_T1.pr(S11_T1.ship_to_lg_grp_cd))
									)
								)
								.leftOuterJoin(S10_M3).on(
									bracket(
										S10_M3.ship_wk_cd.eq(S10_T1.pr(S11_T1.ship_wk_cd))
									)
								)
								.leftOuterJoin(S10_M4).on(
									bracket(
										S10_M4.ship_term_cd.eq(S10_T1.pr(S11_T1.ship_term_cd))
									)
								)
								.leftOuterJoin(S10_M5).on(
									bracket(
										S10_M5.ship_to_id_typ.eq(S10_T1.pr(S11_T1.ship_to_id_typ))
										.and(S10_M5.ship_to_id_cd.eq(S10_T1.pr(S11_T1.ship_to_id_cd)))
									)
								)
								.leftOuterJoin(S10_M6).on(
									bracket(
										S10_M6.dlv_id_typ.eq(S10_T6.dlv_id_typ)
										.and(
											S10_M6.dlv_id_cd.eq(decode(
													S10_T7.slo_d_no,
													nullValue(),
													S10_T6.dlv_id_cd,
													nvl(
														nvl(
															S10_T4.dlv_cd,
															S10_T5.dlv_cd
														),
														S10_T6.dlv_id_cd
													)
												)
											)
										)
									)
								)
								.leftOuterJoin(S10_M7).on(
									bracket(
										S10_M7.bp_cd.eq(S10_T6.cst_cd)
									)
								)
								.leftOuterJoin(S10_M8).on(
									bracket(
										S10_M8.bp_cd.eq(S10_T7.dest_cd1)
									)
								)
								.leftOuterJoin(S10_M9).on(
									bracket(
										S10_M9.bp_cd.eq(S10_T7.dest_cd2)
									)
								)
								.leftOuterJoin(S10_M10).on(
									bracket(
										S10_M10.bp_cd.eq(S10_T7.dest_cd3)
									)
								)
								.leftOuterJoin(S10_M11).on(
									bracket(
										S10_M11.bp_cd.eq(S10_T3.pr(S15_T1.stk_bp_cd))
									)
								)
								.leftOuterJoin(S10_M12).on(
									bracket(
										S10_M12.trd_cd.eq(S10_T2.pr(S13_T1.trd_cd))
									)
								)
								.leftOuterJoin(S10_M13).on(
									bracket(
										S10_M13.loc_cd.eq(S10_T3.pr(S15_T1.ship_loc_cd))
									)
								)
								.leftOuterJoin(S10_M14).on(
									bracket(
										S10_M14.loc_cd.eq(S10_T3.pr(S15_T1.ship_loc_cd))
										.and(S10_M14.str_ln_cd.eq(S10_T3.pr(S15_T1.ship_str_ln_cd)))
									)
								)
								.leftOuterJoin(S10_M15).on(
									bracket(
										S10_M15.gd_cd.eq(S10_T3.pr(S15_T1.gd_cd))
									)
								)
								.leftOuterJoin(S10_M16).on(
									bracket(
										S10_M16.unit_cd.eq(S10_T3.pr(S15_T1.ent_unit_cd))
									)
								)
								.leftOuterJoin(S10_M17).on(
									bracket(
										S10_M17.unit_cd.eq(value(MSC_IF_UNIT_CD_TYP.WT_UNIT_CD.value()))
									)
								)
								.leftOuterJoin(S10_M18).on(
									bracket(
										S10_M18.unit_cd.eq(value(MSC_IF_UNIT_CD_TYP.DIM_UNIT_CD.value()))
									)
								)
								.leftOuterJoin(S10_M19).on(
									bracket(
										S10_M19.unit_cd.eq(S10_T3.pr(S15_T1.trd_unit_cd))
									)
								)
								.leftOuterJoin(S10_M20).on(
									bracket(
										S10_M20.unit_cd.eq(S10_T3.pr(S15_T1.base_unit_cd))
									)
								)
								.leftOuterJoin(S10_M21).on(
									bracket(
										S10_M21.unit_cd.eq(S10_T3.pr(S15_T1.pack_unit_cd))
									)
								)
								.leftOuterJoin(S10_M22).on(
									bracket(
										S10_M22.biz_rsn_cd.eq(S10_T6.rsn_cd)
									)
								)
								.leftOuterJoin(S10_M23).on(
									bracket(
										S10_M23.itm_cd.eq(S10_T2.pr(S13_T1.itm_cd))
										.and(S10_M23.itm_sub1.eq(S10_T2.pr(S13_T1.itm_sub1)))
										.and(S10_M23.itm_sub2.eq(S10_T2.pr(S13_T1.itm_sub2)))
										.and(S10_M23.itm_sub3.eq(S10_T2.pr(S13_T1.itm_sub3)))
										.and(S10_M23.unit_cd.eq(S10_T3.pr(S15_T1.ent_unit_cd)))
									)
								)
								.leftOuterJoin(S10_M24).on(
									bracket(
										S10_M24.itm_cd.eq(S10_T2.pr(S13_T1.itm_cd))
										.and(S10_M24.itm_sub1.eq(S10_T2.pr(S13_T1.itm_sub1)))
										.and(S10_M24.itm_sub2.eq(S10_T2.pr(S13_T1.itm_sub2)))
										.and(S10_M24.itm_sub3.eq(S10_T2.pr(S13_T1.itm_sub3)))
									)
								)
								.leftOuterJoin(S10_M25).on(
									bracket(
										S10_M25.itm_cd.eq(S10_T2.pr(S13_T1.itm_cd))
										.and(S10_M25.itm_sub1.eq(S10_T2.pr(S13_T1.itm_sub1)))
										.and(S10_M25.itm_sub2.eq(S10_T2.pr(S13_T1.itm_sub2)))
										.and(S10_M25.itm_sub3.eq(S10_T2.pr(S13_T1.itm_sub3)))
										.and(S10_M25.sno1.eq(S10_T3.pr(S15_T1.sno1)))
										.and(S10_M25.sno2.eq(S10_T3.pr(S15_T1.sno2)))
										.and(S10_M25.sno3.eq(S10_T3.pr(S15_T1.sno3)))
										.and(S10_M25.sno4.eq(S10_T3.pr(S15_T1.sno4)))
									)
								)
								.leftOuterJoin(S10_M26).on(
									bracket(
										S10_M26.site_co_cd.eq(S10_M1.site_co_cd)
									)
								)
								.leftOuterJoin(S10_M27).on(
									bracket(
										S10_M27.dpt_cd.eq(S10_T1.pr(S11_T1.inst_dpt_cd))
										.and(S10_T1.pr(S11_T1.ship_inst_tm).between(S10_M27.st_dt, S10_M27.end_dt))
									)
								)
								.leftOuterJoin(S10_M28).on(
									bracket(
										S10_M28.usr_cd.eq(S10_T1.pr(S11_T1.inst_usr_cd))
									)
								)
							)
							.where(
								exists(
									subQuery()
									.select(value("X"))
									.from(S17)
									.where(
										S17.ship_alloc_sts_no.eq(S10_T3.pr(S15_T1.ship_alloc_sts_no))
									)
								)
							).view(S9_V1)
						)
						.where(
							notExists(
								subQuery()
								.select(value("X"))
								.from(S18)
								.where(
									S18.ship_alloc_sts_no.eq(S9_V1.pr(S15_T1.ship_alloc_sts_no))
									.and(S18.ship_inst_d_no.eq(S9_V1.pr(S13_T1.ship_inst_d_no)))
								)
							)
						)
					)
			);
	}
	
	/**
	 * -- MSLAL6010_MST_SHIP_INST_Query_S02
	 */
	static MCQueryPlan MSLAL6010_MST_SHIP_INST_S02() {
		MCTempView S0_W1 = createTempView("W1");
		MCTempView S0_W2 = createTempView("W2");
		MSW_SHIP_INST_KEY_R S1_W = MSW_SHIP_INST_KEY_R.create("W");
		MST_SHIP_INST_R S1_T1 = MST_SHIP_INST_R.create("T1");
		MST_SHIP_INST_D_P_R S1_T2 = MST_SHIP_INST_D_P_R.create("T2");
		MSW_SHIP_INST_KEY_R S2_W = MSW_SHIP_INST_KEY_R.create("W");
		MST_SHIP_INST_R S2_T1 = MST_SHIP_INST_R.create("T1");
		MST_SHIP_ALLOC_STS_P_R S2_T2 = MST_SHIP_ALLOC_STS_P_R.create("T2");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSLAL6010_MST_SHIP_INST_Query_S02")
					.mainQuery()
					.select(
						S0_W1.pr(S1_T2.ship_inst_no),
						S0_W1.pr(S1_T2.ship_inst_rev),
						S0_W1.pr(S1_T2.ship_inst_d_no),
						S0_W1.pr(S1_T2.abort_flg),
						S0_W2.pr(S2_T2.ship_alloc_sts_no),
						S0_W2.pr(S2_T2.dlv_slip_no),
						S0_W2.pr(S2_T2.dlv_slip_d_no),
						S0_W2.pr(S2_T2.ship_loc_cd)
					)
					.from(
						subQuery()
						.select(
							S1_T2.ship_inst_no,
							S1_T2.ship_inst_rev,
							S1_T2.ship_inst_d_no,
							S1_T2.abort_flg
						)
						.from(
							S1_W
							.innerJoin(S1_T1).on(
								bracket(
									S1_T1.ship_inst_no.eq(S1_W.ship_inst_no)
								)
							)
							.innerJoin(S1_T2).on(
								bracket(
									S1_T2.ship_inst_no.eq(S1_T1.ship_inst_no)
									.and(S1_T2.ship_inst_rev.eq(S1_T1.ship_inst_rev.subtract(value(1))))
								)
							)
						).view(S0_W1)
						.innerJoin(
							subQuery()
							.select(
								S2_T2.ship_alloc_sts_no,
								S2_T2.ship_inst_d_no,
								S2_T2.dlv_slip_no,
								S2_T2.dlv_slip_d_no,
								S2_T2.ship_loc_cd
							)
							.from(
								S2_W
								.innerJoin(S2_T1).on(
									bracket(
										S2_T1.ship_inst_no.eq(S2_W.ship_inst_no)
									)
								)
								.innerJoin(S2_T2).on(
									bracket(
										S2_T2.ship_inst_no.eq(S2_T1.ship_inst_no)
										.and(S2_T2.ship_inst_rev.eq(S2_T1.ship_inst_rev.subtract(value(1))))
									)
								)
							).view(S0_W2)
						).on(
							bracket(
								S0_W2.pr(S2_T2.ship_inst_d_no).eq(S0_W1.pr(S1_T2.ship_inst_d_no))
							)
						)
					)
			);
	}
}