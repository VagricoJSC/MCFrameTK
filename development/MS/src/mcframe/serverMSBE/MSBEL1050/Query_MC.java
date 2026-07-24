package mcframe.serverMSBE.MSBEL1050;

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
	 * -- MSBEL1050_MST_XFR_ACT_D_Query_S01
	 */
	static MCQueryPlan MSBEL1050_MST_XFR_ACT_D_S01() {
		MST_XFR_ACT_D_R S0_T1 = MST_XFR_ACT_D_R.create("T1");
		MST_XFR_ACT_R S0_T8 = MST_XFR_ACT_R.create("T8");
		MST_XFR_INST_R S0_T7 = MST_XFR_INST_R.create("T7");
		MST_XFR_ALLOC_STS_R S0_T9 = MST_XFR_ALLOC_STS_R.create("T9");
		MST_XFR_SCHD_R S0_T2 = MST_XFR_SCHD_R.create("T2");
		MST_PROV_SCHD_R S0_T10 = MST_PROV_SCHD_R.create("T10");
		MST_PROV_SCHD_R S0_T11 = MST_PROV_SCHD_R.create("T11");
		MSVT_LOT_LIST_R S0_T3 = MSVT_LOT_LIST_R.create("T3");
		MSVT_WRK_SNO_R S0_T4 = MSVT_WRK_SNO_R.create("T4");
		MST_DLV_SLIP_R S0_T12 = MST_DLV_SLIP_R.create("T12");
		MAM_ITM_R S0_M1 = MAM_ITM_R.create("M1");
		MAM_ITM_TYP_D_R S0_M2 = MAM_ITM_TYP_D_R.create("M2");
		MAM_TRD_R S0_M3 = MAM_TRD_R.create("M3");
		MAM_SUNDRY_ITM_R S0_M4 = MAM_SUNDRY_ITM_R.create("M4");
		MAM_UNIT_R S0_M5 = MAM_UNIT_R.create("M5");
		MAM_UNIT_R S0_M7 = MAM_UNIT_R.create("M7");
		MAM_UNIT_R S0_M9 = MAM_UNIT_R.create("M9");
		MAM_WG_R S0_M11 = MAM_WG_R.create("M11");
		MAM_LG_GRP_R S0_M12 = MAM_LG_GRP_R.create("M12");
		MAM_LOC_R S0_M13 = MAM_LOC_R.create("M13");
		MAM_STR_LN_R S0_M14 = MAM_STR_LN_R.create("M14");
		MAM_BP_R S0_M15 = MAM_BP_R.create("M15");
		MAM_SITE_R S0_M16 = MAM_SITE_R.create("M16");
		MAM_LOC_R S0_M17 = MAM_LOC_R.create("M17");
		MAM_STR_LN_R S0_M18 = MAM_STR_LN_R.create("M18");
		MAM_BP_R S0_M19 = MAM_BP_R.create("M19");
		MAM_SITE_R S0_M20 = MAM_SITE_R.create("M20");
		MAM_STK_GD_R S0_M21 = MAM_STK_GD_R.create("M21");
		MAM_BP_R S0_M22 = MAM_BP_R.create("M22");
		MAM_USR_R S0_M23 = MAM_USR_R.create("M23");
		MAM_DPT_R S0_M24 = MAM_DPT_R.create("M24");
		MAM_BIZ_RSN_R S0_M25 = MAM_BIZ_RSN_R.create("M25");
		MAM_DPT_R S0_M26 = MAM_DPT_R.create("M26");
		MAM_USR_R S0_M27 = MAM_USR_R.create("M27");
		MAM_DPT_R S0_M28 = MAM_DPT_R.create("M28");
		MAM_USR_R S0_M29 = MAM_USR_R.create("M29");
		MAM_DPT_R S0_M30 = MAM_DPT_R.create("M30");
		MAM_ITM_GRP_R S0_MM1 = MAM_ITM_GRP_R.create("MM1");
		MAM_ITM_GRP_R S0_MM2 = MAM_ITM_GRP_R.create("MM2");
		MAM_ITM_GRP_R S0_MM3 = MAM_ITM_GRP_R.create("MM3");
		MAM_ITM_GRP_R S0_MM4 = MAM_ITM_GRP_R.create("MM4");
		MAM_ITM_GRP_R S0_MM5 = MAM_ITM_GRP_R.create("MM5");
		MAM_ITM_GRP_R S0_MM6 = MAM_ITM_GRP_R.create("MM6");
		MAM_ITM_GRP_R S0_MM7 = MAM_ITM_GRP_R.create("MM7");
		MAM_ITM_GRP_R S0_MM8 = MAM_ITM_GRP_R.create("MM8");
		MAM_ITM_GRP_R S0_MM9 = MAM_ITM_GRP_R.create("MM9");
		MAM_ITM_GRP_R S0_MM10 = MAM_ITM_GRP_R.create("MM10");
		MAVM_RD_LOC_R S1_V1 = MAVM_RD_LOC_R.create("V1");
		MAVM_RD_LG_GRP_R S2_V2 = MAVM_RD_LG_GRP_R.create("V2");
		MST_XFR_ALLOC_STS_SV_R S3_T9A = MST_XFR_ALLOC_STS_SV_R.create("T9A");
		MST_XFR_SCHD_R S3_T2A = MST_XFR_SCHD_R.create("T2A");
		MST_XFR_INST_D_R S3_T6A = MST_XFR_INST_D_R.create("T6A");
		MST_XFR_ALLOC_STS_SV_R S4_T9A = MST_XFR_ALLOC_STS_SV_R.create("T9A");
		MST_XFR_SCHD_R S4_T2A = MST_XFR_SCHD_R.create("T2A");
		MST_XFR_INST_D_R S4_T6A = MST_XFR_INST_D_R.create("T6A");
		MAM_USR_R S4_M23A = MAM_USR_R.create("M23A");
		MST_XFR_ALLOC_STS_SV_R S5_T9A = MST_XFR_ALLOC_STS_SV_R.create("T9A");
		MST_XFR_SCHD_R S5_T2A = MST_XFR_SCHD_R.create("T2A");
		MST_XFR_INST_D_R S5_T6A = MST_XFR_INST_D_R.create("T6A");
		MST_XFR_ALLOC_STS_SV_R S6_T9A = MST_XFR_ALLOC_STS_SV_R.create("T9A");
		MST_XFR_SCHD_R S6_T2A = MST_XFR_SCHD_R.create("T2A");
		MST_XFR_INST_D_R S6_T6A = MST_XFR_INST_D_R.create("T6A");
		MAM_DPT_R S6_M24A = MAM_DPT_R.create("M24A");
		MST_XFR_ALLOC_STS_SV_R S7_T9A = MST_XFR_ALLOC_STS_SV_R.create("T9A");
		MST_XFR_SCHD_R S7_T2A = MST_XFR_SCHD_R.create("T2A");
		MST_XFR_INST_D_R S7_T6A = MST_XFR_INST_D_R.create("T6A");
		MST_XFR_ALLOC_STS_SV_R S8_T9A = MST_XFR_ALLOC_STS_SV_R.create("T9A");
		MST_XFR_SCHD_R S8_T2A = MST_XFR_SCHD_R.create("T2A");
		MST_XFR_INST_D_R S8_T6A = MST_XFR_INST_D_R.create("T6A");
		MST_XFR_ALLOC_STS_SV_R S9_T9A = MST_XFR_ALLOC_STS_SV_R.create("T9A");
		MST_XFR_SCHD_R S9_T2A = MST_XFR_SCHD_R.create("T2A");
		MST_XFR_INST_D_R S9_T6A = MST_XFR_INST_D_R.create("T6A");
		MST_XFR_ALLOC_STS_SV_R S10_T9A = MST_XFR_ALLOC_STS_SV_R.create("T9A");
		MST_XFR_SCHD_R S10_T2A = MST_XFR_SCHD_R.create("T2A");
		MST_XFR_INST_D_R S10_T6A = MST_XFR_INST_D_R.create("T6A");
		MST_XFR_ALLOC_STS_SV_R S11_T9A = MST_XFR_ALLOC_STS_SV_R.create("T9A");
		MST_XFR_SCHD_R S11_T2A = MST_XFR_SCHD_R.create("T2A");
		MST_XFR_INST_D_R S11_T6A = MST_XFR_INST_D_R.create("T6A");
		MST_XFR_ALLOC_STS_SV_R S12_T9A = MST_XFR_ALLOC_STS_SV_R.create("T9A");
		MST_XFR_SCHD_R S12_T2A = MST_XFR_SCHD_R.create("T2A");
		MST_XFR_INST_D_R S12_T6A = MST_XFR_INST_D_R.create("T6A");
		MST_XFR_ALLOC_STS_SV_R S13_T9A = MST_XFR_ALLOC_STS_SV_R.create("T9A");
		MST_XFR_INST_D_R S13_T6A = MST_XFR_INST_D_R.create("T6A");
		MST_XFR_ALLOC_STS_SV_R S14_T9A = MST_XFR_ALLOC_STS_SV_R.create("T9A");
		MST_XFR_SCHD_R S14_T2A = MST_XFR_SCHD_R.create("T2A");
		MST_XFR_INST_D_R S14_T6A = MST_XFR_INST_D_R.create("T6A");
		MST_XFR_ALLOC_STS_SV_R S15_T9A = MST_XFR_ALLOC_STS_SV_R.create("T9A");
		MST_XFR_SCHD_R S15_T2A = MST_XFR_SCHD_R.create("T2A");
		MST_XFR_INST_D_R S15_T6A = MST_XFR_INST_D_R.create("T6A");
		MST_XFR_ALLOC_STS_SV_R S16_T9A = MST_XFR_ALLOC_STS_SV_R.create("T9A");
		MST_XFR_SCHD_R S16_T2A = MST_XFR_SCHD_R.create("T2A");
		MST_XFR_INST_D_R S16_T6A = MST_XFR_INST_D_R.create("T6A");
		
		MCDynamicSQLID DS0C_ITM_GRP = createDynamicSQLID("DS0C_ITM_GRP");
		
		return createQueryPlan()
			.setQuery(
				sql("MSBEL1050_MST_XFR_ACT_D_Query_S01")
					.mainQuery()
					.select(
						S0_T8.trd_cd,
						S0_T9.pr_sts_typ,
						S0_T1.itm_cd,
						S0_T1.itm_sub1,
						S0_T1.itm_sub2,
						S0_T1.itm_sub3,
						coalesce(
							S0_M4.itm_nm,
							S0_M1.itm_nm
						).as("itm_nm"),
						S0_M1.sundry_itm_flg,
						S0_M1.lot_mng_typ,
						S0_M1.sublot_mng_typ,
						S0_M1.sno1_mng_typ,
						S0_M1.sno2_mng_typ,
						S0_M1.sno3_mng_typ,
						S0_M1.sno4_mng_typ,
						S0_T9.not_lot_mix_flg,
						S0_T9.not_sublot_mix_flg,
						S0_T1.lot_no,
						S0_T1.sublot_no,
						S0_T9.sno1,
						S0_T9.sno1_null_flg,
						S0_T9.sno2,
						S0_T9.sno2_null_flg,
						S0_T9.sno3,
						S0_T9.sno3_null_flg,
						S0_T9.sno4,
						S0_T9.sno4_null_flg,
						S0_T1.sno1.as("alloc_sno1"),
						S0_T1.sno2.as("alloc_sno2"),
						S0_T1.sno3.as("alloc_sno3"),
						S0_T1.sno4.as("alloc_sno4"),
						S0_M1.ver_flg.as("def_ver_flg"),
						S0_T9.abort_flg,
						S0_T9.fix_flg,
						S0_T9.cmpl_flg,
						S0_T1.trd_unit_cd,
						S0_T1.trd_unit_qty,
						S0_T1.base_unit_cd,
						S0_T1.base_unit_qty.as("base_unit_qty"),
						cases()
							.when(
								S0_T9.xfr_schd_no.eq(value(MAC_STR.NULL_VAL.value()))
								.or(S0_T9.xfr_schd_no.isNull())
							)
								.then(value(0))
							.otherwise(S0_T9.base_unit_qty).as("base_unit_schd_qty"),
						cases()
							.when(
								S0_T9.xfr_inst_d_no.eq(value(MAC_STR.NULL_VAL.value()))
								.or(S0_T9.xfr_inst_d_no.isNull())
							)
								.then(value(0))
							.otherwise(S0_T9.base_unit_qty).as("base_unit_inst_qty"),
						S0_T1.base_unit_qty.as("base_unit_act_qty"),
						S0_M1.pckg_unit_cd,
						value((MCNumber) null).as("pckg_unit_qty"),
						S0_T2.trd_unit_cd.as("schd_unit_cd"),
						S0_T2.trd_unit_qty.as("schd_qty"),
						S0_M1.cont_fctr_flg,
						S0_M1.std_cont_fctr,
						S0_M1.cont_fctr_unit_cd,
						S0_M1.cont_fctr_rnd_typ,
						S0_M1.cont_fctr_dec_place,
						coalesce(
							S0_T2.gi_rqst_tm,
							S0_T2.gr_rqst_tm
						).as("xfr_rqst_dt"),
						coalesce(
							S0_T7.xfr_schd_dt,
							S0_T9.xfr_schd_dt
						).as("xfr_schd_dt"),
						S0_T7.xfr_inst_dt,
						S0_T8.xfr_dt.as("xfr_act_dt"),
						S0_T8.ac_dt.as("xfr_ac_dt"),
						S0_T8.ac_dt.as("can_ac_dt"),
						S0_T8.wg_cd,
						S0_T8.lg_grp_cd,
						S0_T1.gi_loc_cd,
						S0_T1.gi_str_ln_cd,
						S0_T1.gi_stk_arrv_bp_cd,
						S0_T8.gr_loc_cd,
						S0_T1.gr_str_ln_cd,
						S0_T8.gr_stk_arrv_bp_cd,
						S0_T1.gd_cd,
						S0_T1.quality_typ,
						S0_T1.stk_insp_typ,
						S0_T1.stk_id_typ,
						S0_T1.stk_bp_cd,
						S0_T2.rqst_usr_cd,
						S0_T2.rqst_dpt_cd,
						S0_M24.dpt_nm.as("rqst_dpt_nm"),
						S0_T7.inst_usr_cd,
						S0_T7.inst_dpt_cd,
						S0_M28.dpt_nm.as("inst_dpt_nm"),
						S0_T8.act_usr_cd,
						S0_T8.act_dpt_cd,
						S0_M30.dpt_nm.as("act_dpt_nm"),
						S0_T9.ship_inst_typ,
						S0_T1.rsn_cd,
						S0_T1.bd_dpt_cd,
						S0_M26.dpt_nm.as("bd_dpt_nm"),
						S0_T7.pick_prnt_flg,
						S0_T7.inst_prnt_flg,
						S0_T12.slip_prnt_flg.as("dlv_prnt_flg"),
						S0_T9.alloc_flg,
						S0_T1.skip_chk_ship_flg.as("skip_chk_ship_flg"),
						S0_T8.intr_rmrks.as("intr_rmrks"),
						S0_T8.trd_rmrks.as("trd_rmrks"),
						S0_T7.inst_rmrks.as("inst_rmrks"),
						S0_T8.sub_char1.as("h_sub_char1"),
						S0_T8.sub_char2.as("h_sub_char2"),
						S0_T8.sub_char3.as("h_sub_char3"),
						S0_T1.intr_d_rmrks.as("intr_d_rmrks"),
						S0_T1.trd_d_rmrks.as("trd_d_rmrks"),
						S0_T9.inst_d_rmrks.as("inst_d_rmrks"),
						S0_T1.sub_char1.as("d_sub_char1"),
						S0_T1.sub_char2.as("d_sub_char2"),
						S0_T1.sub_char3.as("d_sub_char3"),
						S0_T2.rqst_cnt_rmrks,
						S0_T2.ship_cnt_rmrks,
						S0_T2.intr_rmrks.as("schd_intr_rmrks"),
						S0_T2.xfr_src_typ,
						S0_T2.xfr_src_no,
						S0_T9.xfr_schd_no,
						S0_T1.xfr_alloc_sts_no,
						S0_T1.dlv_slip_no,
						S0_T1.dlv_slip_d_no,
						S0_T8.xfr_inst_no,
						S0_T1.xfr_inst_d_no,
						S0_T8.xfr_act_no,
						S0_T1.xfr_act_d_no,
						S0_T2.slo_no,
						S0_T2.mfg_inst_no,
						S0_T2.oper_inst_no,
						S0_T1.io_schd_pr_no,
						S0_T9.prov_typ,
						S0_T9.prov_basis_typ,
						S0_T9.ret_prov_typ,
						S0_T9.ret_prov_basis_typ,
						S0_T10.prov_schd_no.as("prov_schd_no"),
						S0_T11.prov_schd_no.as("ret_prov_schd_no"),
						S0_M1.itm_typ,
						S0_M1.itm_typ_d_cd,
						S0_T1.ins_usr_id,
						S0_T1.ins_usr_nm,
						S0_T1.ins_func_id,
						S0_T1.ins_ts,
						S0_T9.upd_cntr.as("alloc_sts_upd_cntr"),
						S0_T7.upd_cntr.as("inst_upd_cntr"),
						S0_T8.upd_cntr.as("act_upd_cntr"),
						S0_T1.upd_usr_id,
						S0_T1.upd_usr_nm,
						S0_T1.upd_func_id,
						S0_T1.upd_ts,
						S0_T1.upd_srv_req_no,
						S0_T9.disp_seq.as("inst_disp_seq"),
						S0_T1.disp_seq.as("act_disp_seq"),
						S0_T1.wms_flg,
						S0_T1.ext_sys_cd,
						S0_T1.ext_xfr_act_no,
						S0_T1.base_dlv_slip_no,
						S0_T1.base_prov_act_no,
						S0_T1.base_ac_dt,
						addDynamicSelect(DS0C_ITM_GRP),
						// this field is appended by sql coverter.
						S0_T2.itm_cd.as("join_itm_cd_"),
						// this field is appended by sql coverter.
						S0_T2.itm_sub1.as("join_itm_sub1_"),
						// this field is appended by sql coverter.
						S0_T2.itm_sub2.as("join_itm_sub2_"),
						// this field is appended by sql coverter.
						S0_T2.itm_sub3.as("join_itm_sub3_")
					)
					.from(
						S0_T1
						.innerJoin(S0_T8).on(S0_T1.xfr_act_no.eq(S0_T8.xfr_act_no))
						.leftOuterJoin(S0_T7).on(S0_T8.xfr_inst_no.eq(S0_T7.xfr_inst_no))
						.leftOuterJoin(S0_T9).on(S0_T1.xfr_alloc_sts_no.eq(S0_T9.xfr_alloc_sts_no))
						.leftOuterJoin(S0_T2).on(S0_T9.xfr_schd_no.eq(S0_T2.xfr_schd_no))
						.leftOuterJoin(S0_T10).on(
							S0_T9.xfr_alloc_sts_no.eq(S0_T10.prov_src_schd_no1)
							.and(S0_T10.prov_src_schd_typ.eq(value(MSC_PROV_SRC_SCHD_TYP.XFR.value())))
							.and(S0_T10.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.PROV.value())))
						)
						.leftOuterJoin(S0_T11).on(
							S0_T9.xfr_alloc_sts_no.eq(S0_T11.prov_src_schd_no1)
							.and(S0_T11.prov_src_schd_typ.eq(value(MSC_PROV_SRC_SCHD_TYP.XFR.value())))
							.and(S0_T11.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.PROV_RTN.value())))
						)
						.leftOuterJoin(S0_T12).on(
							S0_T1.dlv_slip_no.eq(S0_T12.dlv_slip_no)
							.and(S0_T1.dlv_slip_seq.eq(S0_T12.dlv_slip_seq))
						)
						.leftOuterJoin(S0_M1).on(
							S0_T1.itm_cd.eq(S0_M1.itm_cd)
							.and(S0_T1.itm_sub1.eq(S0_M1.itm_sub1))
							.and(S0_T1.itm_sub2.eq(S0_M1.itm_sub2))
							.and(S0_T1.itm_sub3.eq(S0_M1.itm_sub3))
						)
						.leftOuterJoin(S0_M4).on(
							S0_T1.itm_cd.eq(S0_M4.itm_cd)
							.and(S0_T1.itm_sub1.eq(S0_M4.itm_sub1))
							.and(S0_T1.itm_sub2.eq(S0_M4.itm_sub2))
							.and(S0_T1.itm_sub3.eq(S0_M4.itm_sub3))
							.and(S0_T1.sno1.eq(S0_M4.sno1))
							.and(S0_T1.sno2.eq(S0_M4.sno2))
							.and(S0_T1.sno3.eq(S0_M4.sno3))
							.and(S0_T1.sno4.eq(S0_M4.sno4))
						)
						.leftOuterJoin(S0_M24).on(
							S0_T2.rqst_dpt_cd.eq(S0_M24.dpt_cd)
							.and(S0_T2.rcpt_dt.between(S0_M24.st_dt, S0_M24.end_dt))
						)
						.leftOuterJoin(S0_M26).on(
							S0_T1.bd_dpt_cd.eq(S0_M26.dpt_cd)
							.and(S0_T8.ac_dt.between(S0_M26.st_dt, S0_M26.end_dt))
						)
						.leftOuterJoin(S0_M28).on(
							S0_T7.inst_dpt_cd.eq(S0_M28.dpt_cd)
							.and(S0_T7.xfr_inst_dt.between(S0_M28.st_dt, S0_M28.end_dt))
						)
						.leftOuterJoin(S0_M30).on(
							S0_T8.act_dpt_cd.eq(S0_M30.dpt_cd)
							.and(S0_T8.ac_dt.between(S0_M30.st_dt, S0_M30.end_dt))
						)
						.addDynamicView()
						.addDynamicView(DS0C_ITM_GRP)
					)
					.where(
						value(0).eq(value(0))
						.and(
							exists(
								subQuery()
								.select(value("X"))
								.from(S1_V1)
								.where(
									S0_T8.gr_loc_cd.eq(S1_V1.loc_cd)
								)
							)
							.or(
								exists(
									subQuery()
									.select(value("X"))
									.from(S2_V2)
									.where(
										S0_T8.lg_grp_cd.eq(S2_V2.lg_grp_cd)
									)
								)
							)
						)
						.cutoff$and(S0_T9.cmpl_flg.eq(bind("schd_cmpl_true")))
						.cutoff$and(S0_T9.cmpl_flg.neq(bind("schd_not_cmpl_true")))
						.cutoff$and(
							coalesce(
								S0_T7.pick_prnt_flg, 
								value(false)
							).eq(bind("pick_prnt_true"))
						)
						.cutoff$and(
							coalesce(
								S0_T7.pick_prnt_flg, 
								value(false)
							).neq(bind("pick_not_prnt_true"))
						)
						.cutoff$and(
							coalesce(
								S0_T7.inst_prnt_flg, 
								value(false)
							).eq(bind("inst_prnt_true"))
						)
						.cutoff$and(
							coalesce(
								S0_T7.inst_prnt_flg, 
								value(false)
							).neq(bind("inst_not_prnt_true"))
						)
						.cutoff$and(S0_T12.slip_prnt_flg.eq(bind("dlv_prnt_true")))
						.cutoff$and(S0_T12.slip_prnt_flg.neq(bind("dlv_not_prnt_true")))
						.cutoff$and(
							coalesce(
								S0_T7.xfr_schd_dt,
								S0_T9.xfr_schd_dt
							).gte(bind("xfr_schd_dt_fr"))
						)
						.cutoff$and(
							coalesce(
								S0_T7.xfr_schd_dt,
								S0_T9.xfr_schd_dt
							).lte(bind("xfr_schd_dt_to"))
						)
						.cutoff$and(S0_T7.xfr_inst_dt.gte(bind("xfr_inst_dt_fr")))
						.cutoff$and(S0_T7.xfr_inst_dt.lte(bind("xfr_inst_dt_to")))
						.cutoff$and(S0_T8.xfr_dt.gte(bind("xfr_act_dt_fr")))
						.cutoff$and(S0_T8.xfr_dt.lte(bind("xfr_act_dt_to")))
						.cutoff$and(S0_T8.ac_dt.gte(bind("xfr_ac_dt_fr")))
						.cutoff$and(S0_T8.ac_dt.lte(bind("xfr_ac_dt_to")))
						.cutoff$and(S0_T8.wg_cd.like(bind("wg_cd")))
						.addDynamicPredicate()
						.cutoff$and(S0_T8.lg_grp_cd.like(bind("lg_grp_cd")))
						.cutoff$and(S0_T1.gi_loc_cd.like(bind("gi_loc_cd")))
						.cutoff$and(S0_T1.gi_str_ln_cd.like(bind("gi_str_ln_cd")))
						.cutoff$and(S0_T1.gi_stk_arrv_bp_cd.like(bind("gi_stk_arrv_bp_cd")))
						.cutoff$and(S0_T8.gr_loc_cd.like(bind("gr_loc_cd")))
						.cutoff$and(S0_T1.gr_str_ln_cd.like(bind("gr_str_ln_cd")))
						.cutoff$and(S0_T8.gr_stk_arrv_bp_cd.like(bind("gr_stk_arrv_bp_cd")))
						.cutoff$and(S0_M1.itm_typ.like(bind("itm_typ")))
						.cutoff$and(S0_M1.itm_typ_d_cd.like(bind("itm_typ_d_cd")))
						.cutoff$and(S0_T1.itm_cd.like(bind("itm_cd")))
						.cutoff$and(S0_T1.itm_sub1.like(bind("itm_sub1")))
						.cutoff$and(S0_T1.itm_sub2.like(bind("itm_sub2")))
						.cutoff$and(S0_T1.itm_sub3.like(bind("itm_sub3")))
						.cutoff$and(
							coalesce(
								S0_M4.itm_nm,
								S0_M1.itm_nm
							).like(bind("itm_nm"))
						)
						.cutoff$and(S0_T1.lot_no.like(bind("lot_no")))
						.cutoff$and(S0_T1.sublot_no.like(bind("sublot_no")))
						.cutoff$and(S0_T1.sno1.like(bind("sno1")))
						.cutoff$and(S0_T1.sno2.like(bind("sno2")))
						.cutoff$and(S0_T1.sno3.like(bind("sno3")))
						.cutoff$and(S0_T1.sno4.like(bind("sno4")))
						.cutoff$and(
							bracket(
								S0_T9.abort_flg.isNull()
								.or(S0_T9.abort_flg.neq(bind("abort_false")))
							)
						)
						.cutoff$and(S0_T1.trd_unit_cd.like(bind("trd_unit_cd")))
						.cutoff$and(S0_T1.base_unit_cd.like(bind("base_unit_cd")))
						.cutoff$and(S0_M1.pckg_unit_cd.like(bind("pckg_unit_cd")))
						.cutoff$and(S0_T1.gd_cd.like(bind("gd_cd")))
						.cutoff$and(S0_T1.quality_typ.like(bind("quality_typ")))
						.cutoff$and(S0_T1.stk_insp_typ.like(bind("stk_insp_typ")))
						.cutoff$and(S0_T1.stk_id_typ.like(bind("stk_id_typ")))
						.cutoff$and(S0_T1.stk_bp_cd.like(bind("stk_bp_cd")))
						.cutoff$and(
							bracket(
								S0_T2.rqst_usr_cd.like(bind("rqst_usr_cd"))
								.or(
									exists(
										subQuery()
										.select(value("X"))
										.from(
											S3_T9A
											.innerJoin(S3_T2A).on(S3_T9A.xfr_schd_no.eq(S3_T2A.xfr_schd_no))
											.innerJoin(S3_T6A).on(S3_T9A.xfr_inst_d_no.eq(S3_T6A.xfr_inst_d_no))
										)
										.where(
											value(0).eq(value(0))
											.and(S3_T9A.xfr_inst_d_no.eq(S0_T9.xfr_inst_d_no))
											.and(S3_T2A.rqst_usr_cd.like(bind("rqst_usr_cd")))
										)
									)
								)
							)
						)
						.cutoff$and(
							bracket(
								S0_T2.rqst_dpt_cd.like(bind("rqst_dpt_cd"))
								.or(
									exists(
										subQuery()
										.select(value("X"))
										.from(
											S5_T9A
											.innerJoin(S5_T2A).on(S5_T9A.xfr_schd_no.eq(S5_T2A.xfr_schd_no))
											.innerJoin(S5_T6A).on(S5_T9A.xfr_inst_d_no.eq(S5_T6A.xfr_inst_d_no))
										)
										.where(
											value(0).eq(value(0))
											.and(S5_T9A.xfr_inst_d_no.eq(S0_T9.xfr_inst_d_no))
											.and(S5_T2A.rqst_dpt_cd.like(bind("rqst_dpt_cd")))
										)
									)
								)
							)
						)
						.cutoff$and(
							bracket(
								S0_M24.dpt_nm.like(bind("rqst_dpt_nm"))
								.or(
									exists(
										subQuery()
										.select(value("X"))
										.from(
											S6_T9A
											.innerJoin(S6_T2A).on(S6_T9A.xfr_schd_no.eq(S6_T2A.xfr_schd_no))
											.innerJoin(S6_T6A).on(S6_T9A.xfr_inst_d_no.eq(S6_T6A.xfr_inst_d_no))
											.innerJoin(S6_M24A).on(
												S6_T2A.rqst_dpt_cd.eq(S6_M24A.dpt_cd)
												.and(S6_T2A.rcpt_dt.between(S6_M24A.st_dt, S6_M24A.end_dt))
											)
										)
										.where(
											value(0).eq(value(0))
											.and(S6_T9A.xfr_inst_d_no.eq(S0_T9.xfr_inst_d_no))
											.and(S6_M24A.dpt_nm.like(bind("rqst_dpt_nm")))
										)
									)
								)
							)
						)
						.cutoff$and(S0_T7.inst_usr_cd.like(bind("inst_usr_cd")))
						.cutoff$and(S0_T7.inst_dpt_cd.like(bind("inst_dpt_cd")))
						.cutoff$and(S0_M28.dpt_nm.like(bind("inst_dpt_nm")))
						.cutoff$and(S0_T8.act_usr_cd.like(bind("act_usr_cd")))
						.cutoff$and(S0_T8.act_dpt_cd.like(bind("act_dpt_cd")))
						.cutoff$and(S0_M30.dpt_nm.like(bind("act_dpt_nm")))
						.cutoff$and(S0_T1.rsn_cd.like(bind("rsn_cd")))
						.cutoff$and(S0_T1.bd_dpt_cd.like(bind("bd_dpt_cd")))
						.cutoff$and(S0_M26.dpt_nm.like(bind("bd_dpt_nm")))
						.cutoff$and(S0_T8.trd_cd.like(bind("trd_cd")))
						.cutoff$and(
							bracket(
								S0_T2.rqst_mod_flg.eq(bind("rqst_mod_true"))
								.or(
									exists(
										subQuery()
										.select(value("X"))
										.from(
											S7_T9A
											.innerJoin(S7_T2A).on(S7_T9A.xfr_schd_no.eq(S7_T2A.xfr_schd_no))
											.innerJoin(S7_T6A).on(S7_T9A.xfr_inst_d_no.eq(S7_T6A.xfr_inst_d_no))
										)
										.where(
											value(0).eq(value(0))
											.and(S7_T9A.xfr_inst_d_no.eq(S0_T9.xfr_inst_d_no))
											.and(S7_T2A.rqst_mod_flg.eq(bind("rqst_mod_true")))
										)
									)
								)
							)
						)
						.cutoff$and(S0_T8.intr_rmrks.like(bind("intr_rmrks")))
						.cutoff$and(S0_T8.trd_rmrks.like(bind("trd_rmrks")))
						.cutoff$and(S0_T7.inst_rmrks.like(bind("inst_rmrks")))
						.cutoff$and(S0_T8.sub_char1.like(bind("h_sub_char1")))
						.cutoff$and(S0_T8.sub_char2.like(bind("h_sub_char2")))
						.cutoff$and(S0_T8.sub_char3.like(bind("h_sub_char3")))
						.cutoff$and(S0_T1.intr_d_rmrks.like(bind("intr_d_rmrks")))
						.cutoff$and(S0_T1.trd_d_rmrks.like(bind("trd_d_rmrks")))
						.cutoff$and(S0_T9.inst_d_rmrks.like(bind("inst_d_rmrks")))
						.cutoff$and(S0_T1.sub_char1.like(bind("d_sub_char1")))
						.cutoff$and(S0_T1.sub_char2.like(bind("d_sub_char2")))
						.cutoff$and(S0_T1.sub_char3.like(bind("d_sub_char3")))
						.cutoff$and(
							bracket(
								S0_T2.rqst_cnt_rmrks.like(bind("rqst_cnt_rmrks"))
								.or(
									exists(
										subQuery()
										.select(value("X"))
										.from(
											S8_T9A
											.innerJoin(S8_T2A).on(S8_T9A.xfr_schd_no.eq(S8_T2A.xfr_schd_no))
											.innerJoin(S8_T6A).on(S8_T9A.xfr_inst_d_no.eq(S8_T6A.xfr_inst_d_no))
										)
										.where(
											value(0).eq(value(0))
											.and(S8_T9A.xfr_inst_d_no.eq(S0_T9.xfr_inst_d_no))
											.and(S8_T2A.rqst_cnt_rmrks.like(bind("rqst_cnt_rmrks")))
										)
									)
								)
							)
						)
						.cutoff$and(
							bracket(
								S0_T2.ship_cnt_rmrks.like(bind("ship_cnt_rmrks"))
								.or(
									exists(
										subQuery()
										.select(value("X"))
										.from(
											S9_T9A
											.innerJoin(S9_T2A).on(S9_T9A.xfr_schd_no.eq(S9_T2A.xfr_schd_no))
											.innerJoin(S9_T6A).on(S9_T9A.xfr_inst_d_no.eq(S9_T6A.xfr_inst_d_no))
										)
										.where(
											value(0).eq(value(0))
											.and(S9_T9A.xfr_inst_d_no.eq(S0_T9.xfr_inst_d_no))
											.and(S9_T2A.ship_cnt_rmrks.like(bind("ship_cnt_rmrks")))
										)
									)
								)
							)
						)
						.cutoff$and(
							bracket(
								S0_T2.intr_rmrks.like(bind("schd_intr_rmrks"))
								.or(
									exists(
										subQuery()
										.select(value("X"))
										.from(
											S10_T9A
											.innerJoin(S10_T2A).on(S10_T9A.xfr_schd_no.eq(S10_T2A.xfr_schd_no))
											.innerJoin(S10_T6A).on(S10_T9A.xfr_inst_d_no.eq(S10_T6A.xfr_inst_d_no))
										)
										.where(
											value(0).eq(value(0))
											.and(S10_T9A.xfr_inst_d_no.eq(S0_T9.xfr_inst_d_no))
											.and(S10_T2A.intr_rmrks.like(bind("schd_intr_rmrks")))
										)
									)
								)
							)
						)
						.cutoff$and(
							bracket(
								S0_T2.xfr_src_typ.like(bind("xfr_src_typ"))
								.or(
									exists(
										subQuery()
										.select(value("X"))
										.from(
											S11_T9A
											.innerJoin(S11_T2A).on(S11_T9A.xfr_schd_no.eq(S11_T2A.xfr_schd_no))
											.innerJoin(S11_T6A).on(S11_T9A.xfr_inst_d_no.eq(S11_T6A.xfr_inst_d_no))
										)
										.where(
											value(0).eq(value(0))
											.and(S11_T9A.xfr_inst_d_no.eq(S0_T9.xfr_inst_d_no))
											.and(S11_T2A.xfr_src_typ.like(bind("xfr_src_typ")))
										)
									)
								)
							)
						)
						.cutoff$and(
							bracket(
								S0_T2.xfr_src_no.like(bind("xfr_src_no"))
								.or(
									exists(
										subQuery()
										.select(value("X"))
										.from(
											S12_T9A
											.innerJoin(S12_T2A).on(S12_T9A.xfr_schd_no.eq(S12_T2A.xfr_schd_no))
											.innerJoin(S12_T6A).on(S12_T9A.xfr_inst_d_no.eq(S12_T6A.xfr_inst_d_no))
										)
										.where(
											value(0).eq(value(0))
											.and(S12_T9A.xfr_inst_d_no.eq(S0_T9.xfr_inst_d_no))
											.and(S12_T2A.xfr_src_no.like(bind("xfr_src_no")))
										)
									)
								)
							)
						)
						.cutoff$and(
							bracket(
								S0_T9.xfr_schd_no.like(bind("xfr_schd_no"))
								.or(
									exists(
										subQuery()
										.select(value("X"))
										.from(
											S13_T9A
											.innerJoin(S13_T6A).on(S13_T9A.xfr_inst_d_no.eq(S13_T6A.xfr_inst_d_no))
										)
										.where(
											value(0).eq(value(0))
											.and(S13_T9A.xfr_inst_d_no.eq(S0_T9.xfr_inst_d_no))
											.and(S13_T9A.xfr_schd_no.like(bind("xfr_schd_no")))
										)
									)
								)
							)
						)
						.cutoff$and(S0_T1.xfr_alloc_sts_no.like(bind("xfr_alloc_sts_no")))
						.cutoff$and(S0_T1.dlv_slip_no.like(bind("dlv_slip_no")))
						.cutoff$and(S0_T1.dlv_slip_d_no.like(bind("dlv_slip_d_no")))
						.cutoff$and(S0_T8.xfr_inst_no.like(bind("xfr_inst_no")))
						.cutoff$and(S0_T1.xfr_inst_d_no.like(bind("xfr_inst_d_no")))
						.cutoff$and(S0_T8.xfr_act_no.like(bind("xfr_act_no")))
						.cutoff$and(S0_T1.xfr_act_d_no.like(bind("xfr_act_d_no")))
						.cutoff$and(
							bracket(
								S0_T2.slo_no.like(bind("slo_no"))
								.or(
									exists(
										subQuery()
										.select(value("X"))
										.from(
											S14_T9A
											.innerJoin(S14_T2A).on(S14_T9A.xfr_schd_no.eq(S14_T2A.xfr_schd_no))
											.innerJoin(S14_T6A).on(S14_T9A.xfr_inst_d_no.eq(S14_T6A.xfr_inst_d_no))
										)
										.where(
											value(0).eq(value(0))
											.and(S14_T9A.xfr_inst_d_no.eq(S0_T9.xfr_inst_d_no))
											.and(S14_T2A.slo_no.like(bind("slo_no")))
										)
									)
								)
							)
						)
						.cutoff$and(
							bracket(
								S0_T2.mfg_inst_no.like(bind("mfg_inst_no"))
								.or(
									exists(
										subQuery()
										.select(value("X"))
										.from(
											S15_T9A
											.innerJoin(S15_T2A).on(S15_T9A.xfr_schd_no.eq(S15_T2A.xfr_schd_no))
											.innerJoin(S15_T6A).on(S15_T9A.xfr_inst_d_no.eq(S15_T6A.xfr_inst_d_no))
										)
										.where(
											value(0).eq(value(0))
											.and(S15_T9A.xfr_inst_d_no.eq(S0_T9.xfr_inst_d_no))
											.and(S15_T2A.mfg_inst_no.like(bind("mfg_inst_no")))
										)
									)
								)
							)
						)
						.cutoff$and(
							bracket(
								S0_T2.oper_inst_no.like(bind("oper_inst_no"))
								.or(
									exists(
										subQuery()
										.select(value("X"))
										.from(
											S16_T9A
											.innerJoin(S16_T2A).on(S16_T9A.xfr_schd_no.eq(S16_T2A.xfr_schd_no))
											.innerJoin(S16_T6A).on(S16_T9A.xfr_inst_d_no.eq(S16_T6A.xfr_inst_d_no))
										)
										.where(
											value(0).eq(value(0))
											.and(S16_T9A.xfr_inst_d_no.eq(S0_T9.xfr_inst_d_no))
											.and(S16_T2A.oper_inst_no.like(bind("oper_inst_no")))
										)
									)
								)
							)
						)
						.cutoff$and(S0_T1.io_schd_pr_no.like(bind("io_schd_pr_no")))
						.and(
							bracket(
								bind("wms_flg").eq(value(true))
								.and(bind("not_wms_flg").eq(value(true)))
							)
							.or(
								bind("not_wms_flg").eq(value(false))
								.and(S0_T1.wms_flg.eq(value(true)))
							)
							.or(
								bind("wms_flg").eq(value(false))
								.and(
									S0_T1.wms_flg.eq(value(false))
									.or(S0_T1.wms_flg.isNull())
								)
							)
						)
						.cutoff$and(S0_T1.ext_xfr_act_no.like(bind("ext_xfr_act_no")))
						.addDynamicPredicate(DS0C_ITM_GRP)
					)
					.orderBy(
						S0_T8.xfr_act_no.asc(),
						S0_T1.disp_seq.asc(),
						S0_T1.xfr_act_d_no.asc()
					)
			)
			.setDynamicSQLInfo(
				when(boundOr("ver_no"))
					.view(v -> v.leftOuterJoin(S0_T3).on(S0_T1.itm_cd.eq(S0_T3.itm_cd).and(S0_T1.itm_sub1.eq(S0_T3.itm_sub1)).and(S0_T1.itm_sub2.eq(S0_T3.itm_sub2)).and(S0_T1.itm_sub3.eq(S0_T3.itm_sub3)).and(S0_T1.lot_no.eq(S0_T3.lot_no)).and(S0_T1.sublot_no.eq(S0_T3.sublot_no))))
					.predicate(p -> p.cutoff$and(S0_T3.ver_no.like(bind("ver_no")))),
				when(boundOr("wrk_no", "wrk_nm"))
					.view(v -> v.leftOuterJoin(S0_T4).on(S0_T1.sno1.eq(S0_T4.sno1)))
					.predicate(p -> p.cutoff$and(S0_T4.wrk_no.like(bind("wrk_no"))).cutoff$and(S0_T4.wrk_nm.like(bind("wrk_nm")))),
				when(boundOr("itm_typ_d_nm"))
					.view(v -> v.leftOuterJoin(S0_M2).on(S0_M1.itm_typ.eq(S0_M2.itm_typ).and(S0_M1.itm_typ_d_cd.eq(S0_M2.itm_typ_d_cd))))
					.predicate(p -> p.cutoff$and(S0_M2.itm_typ_d_nm.like(bind("itm_typ_d_nm")))),
				when(boundOr("trd_nm"))
					.view(v -> v.leftOuterJoin(S0_M3).on(S0_T8.trd_cd.eq(S0_M3.trd_cd)))
					.predicate(p -> p.cutoff$and(S0_M3.trd_nm.like(bind("trd_nm")))),
				when(boundOr("trd_unit_nm"))
					.view(v -> v.leftOuterJoin(S0_M5).on(S0_T1.trd_unit_cd.eq(S0_M5.unit_cd)))
					.predicate(p -> p.cutoff$and(S0_M5.unit_nm.like(bind("trd_unit_nm")))),
				when(boundOr("base_unit_nm"))
					.view(v -> v.leftOuterJoin(S0_M7).on(S0_T1.base_unit_cd.eq(S0_M7.unit_cd)))
					.predicate(p -> p.cutoff$and(S0_M7.unit_nm.like(bind("base_unit_nm")))),
				when(boundOr("pckg_unit_nm"))
					.view(v -> v.leftOuterJoin(S0_M9).on(S0_M1.pckg_unit_cd.eq(S0_M9.unit_cd)))
					.predicate(p -> p.cutoff$and(S0_M9.unit_nm.like(bind("pckg_unit_nm")))),
				when(boundOr("wg_nm"))
					.view(v -> v.leftOuterJoin(S0_M11).on(S0_T8.wg_cd.eq(S0_M11.wg_cd)))
					.predicate(p -> p.cutoff$and(S0_M11.wg_nm.like(bind("wg_nm")))),
				when(boundOr("lg_grp_nm"))
					.view(v -> v.leftOuterJoin(S0_M12).on(S0_T8.lg_grp_cd.eq(S0_M12.lg_grp_cd)))
					.predicate(p -> p.cutoff$and(S0_M12.lg_grp_nm.like(bind("lg_grp_nm")))),
				when(boundOr("gi_site_nm", "gi_loc_nm", "gi_site_cd"))
					.view(v -> v.leftOuterJoin(S0_M13).on(S0_T1.gi_loc_cd.eq(S0_M13.loc_cd)))
					.predicate(p -> p.cutoff$and(S0_M13.loc_nm.like(bind("gi_loc_nm"))).cutoff$and(S0_M13.site_cd.like(bind("gi_site_cd")))),
				when(boundOr("gi_str_ln_nm"))
					.view(v -> v.leftOuterJoin(S0_M14).on(S0_T1.gi_loc_cd.eq(S0_M14.loc_cd).and(S0_T1.gi_str_ln_cd.eq(S0_M14.str_ln_cd))))
					.predicate(p -> p.cutoff$and(S0_M14.str_ln_nm.like(bind("gi_str_ln_nm")))),
				when(boundOr("gi_stk_arrv_bp_nm"))
					.view(v -> v.leftOuterJoin(S0_M15).on(S0_T1.gi_stk_arrv_bp_cd.eq(S0_M15.bp_cd)))
					.predicate(p -> p.cutoff$and(S0_M15.bp_nm.like(bind("gi_stk_arrv_bp_nm")))),
				when(boundOr("gi_site_nm"))
					.view(v -> v.leftOuterJoin(S0_M16).on(S0_M13.site_cd.eq(S0_M16.site_cd)))
					.predicate(p -> p.cutoff$and(S0_M16.site_nm.like(bind("gi_site_nm")))),
				when(boundOr("gr_site_nm", "gr_loc_nm", "gr_site_cd"))
					.view(v -> v.leftOuterJoin(S0_M17).on(S0_T8.gr_loc_cd.eq(S0_M17.loc_cd)))
					.predicate(p -> p.cutoff$and(S0_M17.loc_nm.like(bind("gr_loc_nm"))).cutoff$and(S0_M17.site_cd.like(bind("gr_site_cd")))),
				when(boundOr("gr_str_ln_nm"))
					.view(v -> v.leftOuterJoin(S0_M18).on(S0_T8.gr_loc_cd.eq(S0_M18.loc_cd).and(S0_T1.gr_str_ln_cd.eq(S0_M18.str_ln_cd))))
					.predicate(p -> p.cutoff$and(S0_M18.str_ln_nm.like(bind("gr_str_ln_nm")))),
				when(boundOr("gr_stk_arrv_bp_nm"))
					.view(v -> v.leftOuterJoin(S0_M19).on(S0_T8.gr_stk_arrv_bp_cd.eq(S0_M19.bp_cd)))
					.predicate(p -> p.cutoff$and(S0_M19.bp_nm.like(bind("gr_stk_arrv_bp_nm")))),
				when(boundOr("gr_site_nm"))
					.view(v -> v.leftOuterJoin(S0_M20).on(S0_M17.site_cd.eq(S0_M20.site_cd)))
					.predicate(p -> p.cutoff$and(S0_M20.site_nm.like(bind("gr_site_nm")))),
				when(boundOr("gd_nm"))
					.view(v -> v.leftOuterJoin(S0_M21).on(S0_T1.gd_cd.eq(S0_M21.gd_cd)))
					.predicate(p -> p.cutoff$and(S0_M21.gd_nm.like(bind("gd_nm")))),
				when(boundOr("stk_bp_nm"))
					.view(v -> v.leftOuterJoin(S0_M22).on(S0_T1.stk_bp_cd.eq(S0_M22.bp_cd)))
					.predicate(p -> p.cutoff$and(S0_M22.bp_nm.like(bind("stk_bp_nm")))),
				when(boundOr("rqst_usr_nm"))
					.view(v -> v.leftOuterJoin(S0_M23).on(S0_T2.rqst_usr_cd.eq(S0_M23.usr_cd)))
					.predicate(p -> p.cutoff$and(bracket(S0_M23.usr_nm.like(bind("rqst_usr_nm")).or(exists(subQuery().select(value("X")).from(S4_T9A.innerJoin(S4_T2A).on(S4_T9A.xfr_schd_no.eq(S4_T2A.xfr_schd_no)).innerJoin(S4_T6A).on(S4_T9A.xfr_inst_d_no.eq(S4_T6A.xfr_inst_d_no)).innerJoin(S4_M23A).on(S4_T2A.rqst_usr_cd.eq(S4_M23A.usr_cd))).where(value(0).eq(value(0)).and(S4_T9A.xfr_inst_d_no.eq(S0_T9.xfr_inst_d_no)).and(S4_M23A.usr_nm.like(bind("rqst_usr_nm"))))))))),
				when(boundOr("rsn_nm"))
					.view(v -> v.leftOuterJoin(S0_M25).on(S0_T1.rsn_cd.eq(S0_M25.biz_rsn_cd)))
					.predicate(p -> p.cutoff$and(S0_M25.biz_rsn_nm.like(bind("rsn_nm")))),
				when(boundOr("inst_usr_nm"))
					.view(v -> v.leftOuterJoin(S0_M27).on(S0_T7.inst_usr_cd.eq(S0_M27.usr_cd)))
					.predicate(p -> p.cutoff$and(S0_M27.usr_nm.like(bind("inst_usr_nm")))),
				when(boundOr("act_usr_nm"))
					.view(v -> v.leftOuterJoin(S0_M29).on(S0_T8.act_usr_cd.eq(S0_M29.usr_cd)))
					.predicate(p -> p.cutoff$and(S0_M29.usr_nm.like(bind("act_usr_nm")))),
				when(boundOr("itm_grp_flg1"))
					.select(DS0C_ITM_GRP, S0_M1.itm_grp_cd1.as("itm_grp_cd1"), S0_MM1.itm_grp_nm.as("itm_grp_nm1"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM1).on(S0_M1.itm_grp_cd1.eq(S0_MM1.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP1.value()).eq(S0_MM1.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M1.itm_grp_cd1.like(bind("itm_grp_cd1"))).cutoff$and(S0_MM1.itm_grp_nm.like(bind("itm_grp_nm1")))),
				when(boundOr("itm_grp_flg2"))
					.select(DS0C_ITM_GRP, S0_M1.itm_grp_cd2.as("itm_grp_cd2"), S0_MM2.itm_grp_nm.as("itm_grp_nm2"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM2).on(S0_M1.itm_grp_cd2.eq(S0_MM2.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP2.value()).eq(S0_MM2.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M1.itm_grp_cd2.like(bind("itm_grp_cd2"))).cutoff$and(S0_MM2.itm_grp_nm.like(bind("itm_grp_nm2")))),
				when(boundOr("itm_grp_flg3"))
					.select(DS0C_ITM_GRP, S0_M1.itm_grp_cd3.as("itm_grp_cd3"), S0_MM3.itm_grp_nm.as("itm_grp_nm3"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM3).on(S0_M1.itm_grp_cd3.eq(S0_MM3.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP3.value()).eq(S0_MM3.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M1.itm_grp_cd3.like(bind("itm_grp_cd3"))).cutoff$and(S0_MM3.itm_grp_nm.like(bind("itm_grp_nm3")))),
				when(boundOr("itm_grp_flg4"))
					.select(DS0C_ITM_GRP, S0_M1.itm_grp_cd4.as("itm_grp_cd4"), S0_MM4.itm_grp_nm.as("itm_grp_nm4"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM4).on(S0_M1.itm_grp_cd4.eq(S0_MM4.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP4.value()).eq(S0_MM4.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M1.itm_grp_cd4.like(bind("itm_grp_cd4"))).cutoff$and(S0_MM4.itm_grp_nm.like(bind("itm_grp_nm4")))),
				when(boundOr("itm_grp_flg5"))
					.select(DS0C_ITM_GRP, S0_M1.itm_grp_cd5.as("itm_grp_cd5"), S0_MM5.itm_grp_nm.as("itm_grp_nm5"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM5).on(S0_M1.itm_grp_cd5.eq(S0_MM5.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP5.value()).eq(S0_MM5.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M1.itm_grp_cd5.like(bind("itm_grp_cd5"))).cutoff$and(S0_MM5.itm_grp_nm.like(bind("itm_grp_nm5")))),
				when(boundOr("itm_grp_flg6"))
					.select(DS0C_ITM_GRP, S0_M1.itm_grp_cd6.as("itm_grp_cd6"), S0_MM6.itm_grp_nm.as("itm_grp_nm6"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM6).on(S0_M1.itm_grp_cd6.eq(S0_MM6.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP6.value()).eq(S0_MM6.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M1.itm_grp_cd6.like(bind("itm_grp_cd6"))).cutoff$and(S0_MM6.itm_grp_nm.like(bind("itm_grp_nm6")))),
				when(boundOr("itm_grp_flg7"))
					.select(DS0C_ITM_GRP, S0_M1.itm_grp_cd7.as("itm_grp_cd7"), S0_MM7.itm_grp_nm.as("itm_grp_nm7"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM7).on(S0_M1.itm_grp_cd7.eq(S0_MM7.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP7.value()).eq(S0_MM7.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M1.itm_grp_cd7.like(bind("itm_grp_cd7"))).cutoff$and(S0_MM7.itm_grp_nm.like(bind("itm_grp_nm7")))),
				when(boundOr("itm_grp_flg8"))
					.select(DS0C_ITM_GRP, S0_M1.itm_grp_cd8.as("itm_grp_cd8"), S0_MM8.itm_grp_nm.as("itm_grp_nm8"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM8).on(S0_M1.itm_grp_cd8.eq(S0_MM8.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP8.value()).eq(S0_MM8.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M1.itm_grp_cd8.like(bind("itm_grp_cd8"))).cutoff$and(S0_MM8.itm_grp_nm.like(bind("itm_grp_nm8")))),
				when(boundOr("itm_grp_flg9"))
					.select(DS0C_ITM_GRP, S0_M1.itm_grp_cd9.as("itm_grp_cd9"), S0_MM9.itm_grp_nm.as("itm_grp_nm9"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM9).on(S0_M1.itm_grp_cd9.eq(S0_MM9.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP9.value()).eq(S0_MM9.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M1.itm_grp_cd9.like(bind("itm_grp_cd9"))).cutoff$and(S0_MM9.itm_grp_nm.like(bind("itm_grp_nm9")))),
				when(boundOr("itm_grp_flg10"))
					.select(DS0C_ITM_GRP, S0_M1.itm_grp_cd10.as("itm_grp_cd10"), S0_MM10.itm_grp_nm.as("itm_grp_nm10"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM10).on(S0_M1.itm_grp_cd10.eq(S0_MM10.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP10.value()).eq(S0_MM10.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M1.itm_grp_cd10.like(bind("itm_grp_cd10"))).cutoff$and(S0_MM10.itm_grp_nm.like(bind("itm_grp_nm10"))))
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
							m.act_cont_fctr,
							m.ver_no
						))
						.addMap((r, m) -> {
							r.setStringNE("ver_no", m.ver_no());
							r.setNumberNE("act_cont_fctr", m.act_cont_fctr());
					}),
					j -> j
						.add(MSVT_WRK_SNO_R.class, r -> toCondition(
							r.getStringNE("alloc_sno1")
						))
						.addSelect(m -> toArray(
							m.wrk_nm,
							m.wrk_no
						))
						.addMap((r, m) -> {
							r.setStringNE("wrk_no", m.wrk_no());
							r.setStringNE("wkk_nm", m.wrk_nm());
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
							r.setNumberNE("trd_unit_conv_base_qty", m.conv_base_qty());
							r.setNumberNE("trd_unit_conv_qty", m.conv_qty());
							r.setNumberNE("trd_unit_dec_place", m.dec_place());
							r.setStringNE("trd_unit_rnd_typ", m.rnd_typ());
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
						.add(MAM_UNIT_R.class, r -> toCondition(
							r.getStringNE("pckg_unit_cd")
						))
						.addSelect(m -> toArray(
							m.unit_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("pckg_unit_nm", m.unit_nm());
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
						.add(MAM_LG_GRP_R.class, r -> toCondition(
							r.getStringNE("lg_grp_cd")
						))
						.addSelect(m -> toArray(
							m.lg_grp_nm,
							m.pick_list_flg,
							m.ship_inst_flg,
							m.ship_slip_flg
						))
						.addMap((r, m) -> {
							r.setStringNE("lg_grp_nm", m.lg_grp_nm());
							r.setBooleanNE("immd_dlv_prnt_flg", m.ship_slip_flg());
							r.setBooleanNE("immd_pick_prnt_flg", m.pick_list_flg());
							r.setBooleanNE("immd_inst_prnt_flg", m.ship_inst_flg());
					}),
					j -> j
						.add(MAM_LOC_R.class, r -> toCondition(
							r.getStringNE("gi_loc_cd")
						))
						.addSelect(m -> toArray(
							m.loc_nm,
							m.site_cd,
							m.sppl_cd,
							m.str_ln_tgt_flg
						))
						.addMap((r, m) -> {
							r.setStringNE("gi_loc_nm", m.loc_nm());
							r.setBooleanNE("gi_str_ln_tgt_flg", m.str_ln_tgt_flg());
							r.setStringNE("gi_sppl_cd", m.sppl_cd());
							r.setStringNE("gi_site_cd", m.site_cd());
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
							r.setStringNE("gi_str_ln_nm", m.str_ln_nm());
					}),
					j -> j
						.add(MAM_BP_R.class, r -> toCondition(
							r.getStringNE("gi_stk_arrv_bp_cd")
						))
						.addSelect(m -> toArray(
							m.bp_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("gi_stk_arrv_bp_nm", m.bp_nm());
					}),
					j -> j
						.add(MAM_SITE_R.class, r -> toCondition(
							r.getStringNE("gi_site_cd")
						))
						.addSelect(m -> toArray(
							m.site_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("gi_site_nm", m.site_nm());
					}),
					j -> j
						.add(MAM_LOC_R.class, r -> toCondition(
							r.getStringNE("gr_loc_cd")
						))
						.addSelect(m -> toArray(
							m.loc_nm,
							m.site_cd,
							m.sppl_cd,
							m.str_ln_tgt_flg
						))
						.addMap((r, m) -> {
							r.setStringNE("gr_loc_nm", m.loc_nm());
							r.setBooleanNE("gr_str_ln_tgt_flg", m.str_ln_tgt_flg());
							r.setStringNE("gr_sppl_cd", m.sppl_cd());
							r.setStringNE("gr_site_cd", m.site_cd());
					}),
					j -> j
						.add(MAM_STR_LN_R.class, r -> toCondition(
							r.getStringNE("gr_loc_cd"),
							r.getStringNE("gr_str_ln_cd")
						))
						.addSelect(m -> toArray(
							m.str_ln_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("gr_str_ln_nm", m.str_ln_nm());
					}),
					j -> j
						.add(MAM_BP_R.class, r -> toCondition(
							r.getStringNE("gr_stk_arrv_bp_cd")
						))
						.addSelect(m -> toArray(
							m.bp_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("gr_stk_arrv_bp_nm", m.bp_nm());
					}),
					j -> j
						.add(MAM_SITE_R.class, r -> toCondition(
							r.getStringNE("gr_site_cd")
						))
						.addSelect(m -> toArray(
							m.site_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("gr_site_nm", m.site_nm());
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
							r.getStringNE("stk_bp_cd")
						))
						.addSelect(m -> toArray(
							m.bp_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("stk_bp_nm", m.bp_nm());
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
						.add(MAM_BIZ_RSN_R.class, r -> toCondition(
							r.getStringNE("rsn_cd")
						))
						.addSelect(m -> toArray(
							m.acxfr_gi_flg,
							m.biz_rsn_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("rsn_nm", m.biz_rsn_nm());
							r.setBooleanNE("acxfr_gi_flg", m.acxfr_gi_flg());
					}),
					j -> j
						.add(MAM_USR_R.class, r -> toCondition(
							r.getStringNE("inst_usr_cd")
						))
						.addSelect(m -> toArray(
							m.usr_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("inst_usr_nm", m.usr_nm());
					}),
					j -> j
						.add(MAM_USR_R.class, r -> toCondition(
							r.getStringNE("act_usr_cd")
						))
						.addSelect(m -> toArray(
							m.usr_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("act_usr_nm", m.usr_nm());
					}),
					j -> j
						.add(MAM_BP_R.class, r -> toCondition(
							r.getStringNE("gi_sppl_cd")
						))
						.addSelect(m -> toArray(
							m.bp_nm,
							m.onr_prsppl_flg,
							m.prov_basis_typ
						))
						.addMap((r, m) -> {
							r.setStringNE("gi_sppl_nm", m.bp_nm());
							r.setBooleanNE("gi_onr_prsppl_flg", m.onr_prsppl_flg());
							r.setStringNE("gi_prov_basis_typ", m.prov_basis_typ());
					}),
					j -> j
						.add(MAM_BP_R.class, r -> toCondition(
							r.getStringNE("gr_sppl_cd")
						))
						.addSelect(m -> toArray(
							m.bp_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("gr_sppl_nm", m.bp_nm());
					}),
					j -> j
						.add(MAVM_ITM_UNIT_R.class, r -> toCondition(
							r.getStringNE("itm_cd"),
							r.getStringNE("itm_sub1"),
							r.getStringNE("itm_sub2"),
							r.getStringNE("itm_sub3"),
							r.getStringNE("pckg_unit_cd")
						))
						.addSelect(m -> toArray(
							m.conv_base_qty,
							m.conv_qty,
							m.dec_place
						))
						.addMap((r, m) -> {
							r.setNumberNE("pckg_unit_conv_base_qty", m.conv_base_qty());
							r.setNumberNE("pckg_unit_conv_qty", m.conv_qty());
							r.setNumberNE("pckg_unit_dec_place", m.dec_place());
					}),
					j -> j
						.add(MAM_UNIT_R.class, r -> toCondition(
							r.getStringNE("schd_unit_cd")
						))
						.addSelect(m -> toArray(
							m.unit_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("schd_unit_nm", m.unit_nm());
					}),
					j -> j
						.add(MAVM_ITM_UNIT_R.class, r -> toCondition(
							r.getStringNE("join_itm_cd_"),
							r.getStringNE("join_itm_sub1_"),
							r.getStringNE("join_itm_sub2_"),
							r.getStringNE("join_itm_sub3_"),
							r.getStringNE("schd_unit_cd")
						))
						.addSelect(m -> toArray(
							m.dec_place
						))
						.addMap((r, m) -> {
							r.setNumberNE("schd_unit_dec_place", m.dec_place());
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
	 * -- MSBEL1050_MST_XFR_ACT_Query_S01
	 */
	static MCQueryPlan MSBEL1050_MST_XFR_ACT_S01() {
		MST_XFR_ACT_R S0_T1 = MST_XFR_ACT_R.create("T1");
		MST_XFR_INST_R S0_T3 = MST_XFR_INST_R.create("T3");
		MST_XFR_ACT_D_R S0_W1 = MST_XFR_ACT_D_R.create("W1");
		MST_DLV_SLIP_R S0_W2 = MST_DLV_SLIP_R.create("W2");
		MAM_TRD_R S0_M3 = MAM_TRD_R.create("M3");
		MAM_WG_R S0_M11 = MAM_WG_R.create("M11");
		MAM_LG_GRP_R S0_M12 = MAM_LG_GRP_R.create("M12");
		MAM_LOC_R S0_M17 = MAM_LOC_R.create("M17");
		MAM_BP_R S0_M19 = MAM_BP_R.create("M19");
		MAM_SITE_R S0_M20 = MAM_SITE_R.create("M20");
		MAM_USR_R S0_M27 = MAM_USR_R.create("M27");
		MAM_DPT_R S0_M28 = MAM_DPT_R.create("M28");
		MAM_USR_R S0_M29 = MAM_USR_R.create("M29");
		MAM_DPT_R S0_M30 = MAM_DPT_R.create("M30");
		MST_XFR_ACT_D_R S1_TT2 = MST_XFR_ACT_D_R.create("TT2");
		MST_XFR_ACT_D_R S2_TT3 = MST_XFR_ACT_D_R.create("TT3");
		MST_XFR_ACT_D_R S1_TT4 = MST_XFR_ACT_D_R.create("TT4");
		MST_DLV_SLIP_R S1_TT5 = MST_DLV_SLIP_R.create("TT5");
		MST_XFR_ACT_D_R S1_TT6 = MST_XFR_ACT_D_R.create("TT6");
		MST_DLV_SLIP_R S1_TT7 = MST_DLV_SLIP_R.create("TT7");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBEL1050_MST_XFR_ACT_Query_S01")
					.mainQuery()
					.select(
						S0_T1.trd_cd,
						S0_T3.xfr_schd_dt,
						S0_T3.xfr_inst_dt,
						S0_T1.xfr_dt.as("xfr_act_dt"),
						S0_T1.ac_dt.as("xfr_ac_dt"),
						S0_T1.ac_dt.as("can_ac_dt"),
						S0_T1.wg_cd,
						S0_T1.lg_grp_cd,
						S0_T1.gr_loc_cd,
						S0_T1.gr_stk_arrv_bp_cd,
						S0_T3.inst_usr_cd,
						S0_T3.inst_dpt_cd,
						S0_M28.dpt_nm.as("inst_dpt_nm"),
						S0_T1.act_usr_cd,
						S0_T1.act_dpt_cd,
						S0_M30.dpt_nm.as("act_dpt_nm"),
						S0_T3.pick_prnt_flg,
						S0_T3.inst_prnt_flg,
						bracket(subQuery()
							.select(max(S0_W2.slip_prnt_flg))
							.from(S0_W1
								.innerJoin(S0_W2).on(
									S0_W2.dlv_slip_no.eq(S0_W1.dlv_slip_no)
									.and(S0_W2.dlv_slip_seq.eq(S0_W1.dlv_slip_seq))
								))
							.where(S0_W1.xfr_act_no.eq(S0_T1.xfr_act_no))
						).as("dlv_prnt_flg"),
						S0_T1.intr_rmrks.as("intr_rmrks"),
						S0_T1.trd_rmrks.as("trd_rmrks"),
						S0_T3.inst_rmrks.as("inst_rmrks"),
						S0_T1.sub_char1.as("h_sub_char1"),
						S0_T1.sub_char2.as("h_sub_char2"),
						S0_T1.sub_char3.as("h_sub_char3"),
						S0_T1.xfr_inst_no.as("xfr_inst_no"),
						S0_T1.xfr_act_no.as("xfr_act_no"),
						S0_T1.ins_usr_id,
						S0_T1.ins_usr_nm,
						S0_T1.ins_func_id,
						S0_T1.ins_ts,
						S0_T3.upd_cntr.as("inst_upd_cntr"),
						S0_T1.upd_cntr.as("act_upd_cntr"),
						S0_T1.upd_usr_id,
						S0_T1.upd_usr_nm,
						S0_T1.upd_func_id,
						S0_T1.upd_ts,
						S0_T1.upd_srv_req_no
					)
					.from(
						S0_T1
						.leftOuterJoin(S0_T3).on(
							bracket(
								S0_T1.xfr_inst_no.eq(S0_T3.xfr_inst_no)
							)
						)
						.leftOuterJoin(S0_M28).on(
							bracket(
								S0_T3.inst_dpt_cd.eq(S0_M28.dpt_cd)
								.and(S0_T3.xfr_inst_dt.between(S0_M28.st_dt, S0_M28.end_dt))
							)
						)
						.leftOuterJoin(S0_M30).on(
							bracket(
								S0_T1.act_dpt_cd.eq(S0_M30.dpt_cd)
								.and(S0_T1.ac_dt.between(S0_M30.st_dt, S0_M30.end_dt))
							)
						)
						.addDynamicView()
					)
					.where(
						value(0).eq(value(0))
						.cutoff$and(
							coalesce(
								S0_T3.pick_prnt_flg, 
								value(false)
							).eq(bind("pick_prnt_true"))
						)
						.cutoff$and(
							coalesce(
								S0_T3.pick_prnt_flg, 
								value(false)
							).neq(bind("pick_not_prnt_true"))
						)
						.cutoff$and(
							coalesce(
								S0_T3.inst_prnt_flg, 
								value(false)
							).eq(bind("inst_prnt_true"))
						)
						.cutoff$and(
							coalesce(
								S0_T3.inst_prnt_flg, 
								value(false)
							).neq(bind("inst_not_prnt_true"))
						)
						.cutoff$and(
							bind("dlv_prnt_true").eq(value(true))
							.and(
								exists(
									subQuery()
									.select(value("X"))
									.from(S1_TT4
										.innerJoin(S1_TT5).on(
											S1_TT5.dlv_slip_no.eq(S1_TT4.dlv_slip_no)
											.and(S1_TT5.dlv_slip_seq.eq(S1_TT4.dlv_slip_seq))
										)
									)
									.where(
										S1_TT4.xfr_act_no.eq(S0_T1.xfr_act_no)
										.and(S1_TT5.slip_prnt_flg.eq(value(true)))
									)
								)
							)
						)
						.cutoff$and(
							bind("dlv_not_prnt_true").eq(value(true))
							.and(
								notExists(
									subQuery()
									.select(value("X"))
									.from(S1_TT6
										.innerJoin(S1_TT7).on(
											S1_TT7.dlv_slip_no.eq(S1_TT6.dlv_slip_no)
											.and(S1_TT7.dlv_slip_seq.eq(S1_TT6.dlv_slip_seq))
										)
									)
									.where(
										S1_TT6.xfr_act_no.eq(S0_T1.xfr_act_no)
										.and(S1_TT7.slip_prnt_flg.eq(value(true)))
									)
								)
							)
						)
						.and(
							bracket(
								bind("wms_flg").eq(value(true))
								.and(bind("not_wms_flg").eq(value(true)))
							)
							.or(
								bind("not_wms_flg").eq(value(false))
								.and(
									exists(
										subQuery()
										.select(value("X"))
										.from(S1_TT2)
										.where(
											S0_T1.xfr_act_no.eq(S1_TT2.xfr_act_no)
											.and(S1_TT2.wms_flg.eq(value(true)))
										)
									)
								)
							)
							.or(
								bind("wms_flg").eq(value(false))
								.and(
									notExists(
										subQuery()
										.select(value("X"))
										.from(S2_TT3)
										.where(
											S0_T1.xfr_act_no.eq(S2_TT3.xfr_act_no)
											.and(S2_TT3.wms_flg.eq(value(true)))
										)
									)
								)
							)
						)
						.cutoff$and(S0_T3.xfr_schd_dt.gte(bind("xfr_schd_dt_fr")))
						.cutoff$and(S0_T3.xfr_schd_dt.lte(bind("xfr_schd_dt_to")))
						.cutoff$and(S0_T3.xfr_inst_dt.gte(bind("xfr_inst_dt_fr")))
						.cutoff$and(S0_T3.xfr_inst_dt.lte(bind("xfr_inst_dt_to")))
						.cutoff$and(S0_T1.xfr_dt.gte(bind("xfr_act_dt_fr")))
						.cutoff$and(S0_T1.xfr_dt.lte(bind("xfr_act_dt_to")))
						.cutoff$and(S0_T1.ac_dt.gte(bind("xfr_ac_dt_fr")))
						.cutoff$and(S0_T1.ac_dt.lte(bind("xfr_ac_dt_to")))
						.cutoff$and(S0_T1.wg_cd.like(bind("wg_cd")))
						.addDynamicPredicate()
						.cutoff$and(S0_T1.lg_grp_cd.like(bind("lg_grp_cd")))
						.cutoff$and(S0_T1.gr_loc_cd.like(bind("gr_loc_cd")))
						.cutoff$and(S0_T1.gr_stk_arrv_bp_cd.like(bind("gr_stk_arrv_bp_cd")))
						.cutoff$and(S0_T3.inst_usr_cd.like(bind("inst_usr_cd")))
						.cutoff$and(S0_T3.inst_dpt_cd.like(bind("inst_dpt_cd")))
						.cutoff$and(S0_M28.dpt_nm.like(bind("inst_dpt_nm")))
						.cutoff$and(S0_T1.act_usr_cd.like(bind("act_usr_cd")))
						.cutoff$and(S0_T1.act_dpt_cd.like(bind("act_dpt_cd")))
						.cutoff$and(S0_M30.dpt_nm.like(bind("act_dpt_nm")))
						.cutoff$and(S0_T1.trd_cd.like(bind("trd_cd")))
						.cutoff$and(S0_T1.intr_rmrks.like(bind("intr_rmrks")))
						.cutoff$and(S0_T1.trd_rmrks.like(bind("trd_rmrks")))
						.cutoff$and(S0_T3.inst_rmrks.like(bind("inst_rmrks")))
						.cutoff$and(S0_T1.sub_char1.like(bind("h_sub_char1")))
						.cutoff$and(S0_T1.sub_char2.like(bind("h_sub_char2")))
						.cutoff$and(S0_T1.sub_char3.like(bind("h_sub_char3")))
						.cutoff$and(S0_T1.xfr_inst_no.like(bind("xfr_inst_no")))
						.cutoff$and(S0_T1.xfr_act_no.like(bind("xfr_act_no")))
					)
					.orderBy(S0_T1.xfr_act_no.asc())
			)
			.setDynamicSQLInfo(
				when(boundOr("trd_nm"))
					.view(v -> v.leftOuterJoin(S0_M3).on(bracket(S0_T1.trd_cd.eq(S0_M3.trd_cd))))
					.predicate(p -> p.cutoff$and(S0_M3.trd_nm.like(bind("trd_nm")))),
				when(boundOr("wg_nm"))
					.view(v -> v.leftOuterJoin(S0_M11).on(bracket(S0_T1.wg_cd.eq(S0_M11.wg_cd))))
					.predicate(p -> p.cutoff$and(S0_M11.wg_nm.like(bind("wg_nm")))),
				when(boundOr("lg_grp_nm"))
					.view(v -> v.leftOuterJoin(S0_M12).on(bracket(S0_T1.lg_grp_cd.eq(S0_M12.lg_grp_cd))))
					.predicate(p -> p.cutoff$and(S0_M12.lg_grp_nm.like(bind("lg_grp_nm")))),
				when(boundOr("gr_site_nm", "gr_loc_nm", "gr_site_cd"))
					.view(v -> v.leftOuterJoin(S0_M17).on(bracket(S0_T1.gr_loc_cd.eq(S0_M17.loc_cd))))
					.predicate(p -> p.cutoff$and(S0_M17.loc_nm.like(bind("gr_loc_nm"))).cutoff$and(S0_M17.site_cd.like(bind("gr_site_cd")))),
				when(boundOr("gr_stk_arrv_bp_nm"))
					.view(v -> v.leftOuterJoin(S0_M19).on(bracket(S0_T1.gr_stk_arrv_bp_cd.eq(S0_M19.bp_cd))))
					.predicate(p -> p.cutoff$and(S0_M19.bp_nm.like(bind("gr_stk_arrv_bp_nm")))),
				when(boundOr("gr_site_nm"))
					.view(v -> v.leftOuterJoin(S0_M20).on(bracket(S0_M17.site_cd.eq(S0_M20.site_cd))))
					.predicate(p -> p.cutoff$and(S0_M20.site_nm.like(bind("gr_site_nm")))),
				when(boundOr("inst_usr_nm"))
					.view(v -> v.leftOuterJoin(S0_M27).on(bracket(S0_T3.inst_usr_cd.eq(S0_M27.usr_cd))))
					.predicate(p -> p.cutoff$and(S0_M27.usr_nm.like(bind("inst_usr_nm")))),
				when(boundOr("act_usr_nm"))
					.view(v -> v.leftOuterJoin(S0_M29).on(bracket(S0_T1.act_usr_cd.eq(S0_M29.usr_cd))))
					.predicate(p -> p.cutoff$and(S0_M29.usr_nm.like(bind("act_usr_nm"))))
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
							r.getStringNE("wg_cd")
						))
						.addSelect(m -> toArray(
							m.wg_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("wg_nm", m.wg_nm());
					}),
					j -> j
						.add(MAM_LG_GRP_R.class, r -> toCondition(
							r.getStringNE("lg_grp_cd")
						))
						.addSelect(m -> toArray(
							m.lg_grp_nm,
							m.pick_list_flg,
							m.ship_inst_flg,
							m.ship_slip_flg
						))
						.addMap((r, m) -> {
							r.setStringNE("lg_grp_nm", m.lg_grp_nm());
							r.setBooleanNE("immd_dlv_prnt_flg", m.ship_slip_flg());
							r.setBooleanNE("immd_pick_prnt_flg", m.pick_list_flg());
							r.setBooleanNE("immd_inst_prnt_flg", m.ship_inst_flg());
					}),
					j -> j
						.add(MAM_LOC_R.class, r -> toCondition(
							r.getStringNE("gr_loc_cd")
						))
						.addSelect(m -> toArray(
							m.loc_nm,
							m.site_cd,
							m.str_ln_tgt_flg
						))
						.addMap((r, m) -> {
							r.setStringNE("gr_loc_nm", m.loc_nm());
							r.setBooleanNE("gr_str_ln_tgt_flg", m.str_ln_tgt_flg());
							r.setStringNE("gr_site_cd", m.site_cd());
					}),
					j -> j
						.add(MAM_BP_R.class, r -> toCondition(
							r.getStringNE("gr_stk_arrv_bp_cd")
						))
						.addSelect(m -> toArray(
							m.bp_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("gr_stk_arrv_bp_nm", m.bp_nm());
					}),
					j -> j
						.add(MAM_SITE_R.class, r -> toCondition(
							r.getStringNE("gr_site_cd")
						))
						.addSelect(m -> toArray(
							m.site_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("gr_site_nm", m.site_nm());
					}),
					j -> j
						.add(MAM_USR_R.class, r -> toCondition(
							r.getStringNE("inst_usr_cd")
						))
						.addSelect(m -> toArray(
							m.usr_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("inst_usr_nm", m.usr_nm());
					}),
					j -> j
						.add(MAM_USR_R.class, r -> toCondition(
							r.getStringNE("act_usr_cd")
						))
						.addSelect(m -> toArray(
							m.usr_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("act_usr_nm", m.usr_nm());
					})
				)
			);
	}
	
	/**
	 * -- MSBEL1050_MST_XFR_ACT_Query_S02
	 */
	static MCQueryPlan MSBEL1050_MST_XFR_ACT_S02() {
		MST_XFR_ACT_R S0_T1 = MST_XFR_ACT_R.create("T1");
		MST_XFR_ACT_D_R S0_T2 = MST_XFR_ACT_D_R.create("T2");
		MST_XFR_INST_R S0_T3 = MST_XFR_INST_R.create("T3");
		MST_DLV_SLIP_R S0_T4 = MST_DLV_SLIP_R.create("T4");
		MAM_TRD_R S0_M3 = MAM_TRD_R.create("M3");
		MAM_WG_R S0_M11 = MAM_WG_R.create("M11");
		MAM_LG_GRP_R S0_M12 = MAM_LG_GRP_R.create("M12");
		MAM_LOC_R S0_M17 = MAM_LOC_R.create("M17");
		MAM_BP_R S0_M19 = MAM_BP_R.create("M19");
		MAM_SITE_R S0_M20 = MAM_SITE_R.create("M20");
		MAM_USR_R S0_M27 = MAM_USR_R.create("M27");
		MAM_DPT_R S0_M28 = MAM_DPT_R.create("M28");
		MAM_USR_R S0_M29 = MAM_USR_R.create("M29");
		MAM_DPT_R S0_M30 = MAM_DPT_R.create("M30");
		MST_XFR_ACT_D_R S1_TT2 = MST_XFR_ACT_D_R.create("TT2");
		MST_XFR_ACT_D_R S2_TT3 = MST_XFR_ACT_D_R.create("TT3");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBEL1050_MST_XFR_ACT_Query_S02")
					.mainQuery()
					.select(
						S0_T1.trd_cd,
						S0_T3.xfr_schd_dt,
						S0_T3.xfr_inst_dt,
						S0_T1.xfr_dt.as("xfr_act_dt"),
						S0_T1.ac_dt.as("xfr_ac_dt"),
						S0_T1.ac_dt.as("can_ac_dt"),
						S0_T1.wg_cd,
						S0_T1.lg_grp_cd,
						S0_T1.gr_loc_cd,
						S0_T1.gr_stk_arrv_bp_cd,
						S0_T3.inst_usr_cd,
						S0_T3.inst_dpt_cd,
						S0_M28.dpt_nm.as("inst_dpt_nm"),
						S0_T1.act_usr_cd,
						S0_T1.act_dpt_cd,
						S0_M30.dpt_nm.as("act_dpt_nm"),
						S0_T3.pick_prnt_flg,
						S0_T3.inst_prnt_flg,
						S0_T4.slip_prnt_flg.as("dlv_prnt_flg"),
						S0_T1.intr_rmrks.as("intr_rmrks"),
						S0_T1.trd_rmrks.as("trd_rmrks"),
						S0_T3.inst_rmrks.as("inst_rmrks"),
						S0_T1.sub_char1.as("h_sub_char1"),
						S0_T1.sub_char2.as("h_sub_char2"),
						S0_T1.sub_char3.as("h_sub_char3"),
						S0_T1.xfr_inst_no.as("xfr_inst_no"),
						S0_T1.xfr_act_no.as("xfr_act_no"),
						S0_T2.dlv_slip_no,
						S0_T4.ins_usr_id,
						S0_T4.ins_usr_nm,
						S0_T4.ins_func_id,
						S0_T4.ins_ts,
						S0_T3.upd_cntr.as("inst_upd_cntr"),
						S0_T1.upd_cntr.as("act_upd_cntr"),
						S0_T4.upd_usr_id,
						S0_T4.upd_usr_nm,
						S0_T4.upd_func_id,
						S0_T4.upd_ts,
						S0_T4.upd_srv_req_no
					)
					.from(
						S0_T1
						.innerJoin(S0_T2).on(
							bracket(
								S0_T1.xfr_act_no.eq(S0_T2.xfr_act_no)
							)
						)
						.leftOuterJoin(S0_T3).on(
							bracket(
								S0_T1.xfr_inst_no.eq(S0_T3.xfr_inst_no)
							)
						)
						.innerJoin(S0_T4).on(
							bracket(
								S0_T2.dlv_slip_no.eq(S0_T4.dlv_slip_no)
								.and(S0_T2.dlv_slip_seq.eq(S0_T4.dlv_slip_seq))
							)
						)
						.leftOuterJoin(S0_M28).on(
							bracket(
								S0_T3.inst_dpt_cd.eq(S0_M28.dpt_cd)
								.and(S0_T3.xfr_inst_dt.between(S0_M28.st_dt, S0_M28.end_dt))
							)
						)
						.leftOuterJoin(S0_M30).on(
							bracket(
								S0_T1.act_dpt_cd.eq(S0_M30.dpt_cd)
								.and(S0_T1.ac_dt.between(S0_M30.st_dt, S0_M30.end_dt))
							)
						)
						.addDynamicView()
					)
					.where(
						value(0).eq(value(0))
						.cutoff$and(S0_T3.pick_prnt_flg.eq(bind("pick_prnt_true")))
						.cutoff$and(S0_T3.pick_prnt_flg.neq(bind("pick_not_prnt_true")))
						.cutoff$and(S0_T3.inst_prnt_flg.eq(bind("inst_prnt_true")))
						.cutoff$and(S0_T3.inst_prnt_flg.neq(bind("inst_not_prnt_true")))
						.cutoff$and(S0_T4.slip_prnt_flg.eq(bind("dlv_prnt_true")))
						.cutoff$and(S0_T4.slip_prnt_flg.neq(bind("dlv_not_prnt_true")))
						.and(
							bracket(
								bind("wms_flg").eq(value(true))
								.and(bind("not_wms_flg").eq(value(true)))
							)
							.or(
								bind("not_wms_flg").eq(value(false))
								.and(
									exists(
										subQuery()
										.select(value("X"))
										.from(S1_TT2)
										.where(
											S0_T1.xfr_act_no.eq(S1_TT2.xfr_act_no)
											.and(S1_TT2.wms_flg.eq(value(true)))
										)
									)
								)
							)
							.or(
								bind("wms_flg").eq(value(false))
								.and(
									notExists(
										subQuery()
										.select(value("X"))
										.from(S2_TT3)
										.where(
											S0_T1.xfr_act_no.eq(S2_TT3.xfr_act_no)
											.and(S2_TT3.wms_flg.eq(value(true)))
										)
									)
								)
							)
						)
						.cutoff$and(S0_T3.xfr_schd_dt.gte(bind("xfr_schd_dt_fr")))
						.cutoff$and(S0_T3.xfr_schd_dt.lte(bind("xfr_schd_dt_to")))
						.cutoff$and(S0_T3.xfr_inst_dt.gte(bind("xfr_inst_dt_fr")))
						.cutoff$and(S0_T3.xfr_inst_dt.lte(bind("xfr_inst_dt_to")))
						.cutoff$and(S0_T1.xfr_dt.gte(bind("xfr_act_dt_fr")))
						.cutoff$and(S0_T1.xfr_dt.lte(bind("xfr_act_dt_to")))
						.cutoff$and(S0_T1.ac_dt.gte(bind("xfr_ac_dt_fr")))
						.cutoff$and(S0_T1.ac_dt.lte(bind("xfr_ac_dt_to")))
						.cutoff$and(S0_T1.wg_cd.like(bind("wg_cd")))
						.addDynamicPredicate()
						.cutoff$and(S0_T1.lg_grp_cd.like(bind("lg_grp_cd")))
						.cutoff$and(S0_T1.gr_loc_cd.like(bind("gr_loc_cd")))
						.cutoff$and(S0_T1.gr_stk_arrv_bp_cd.like(bind("gr_stk_arrv_bp_cd")))
						.cutoff$and(S0_T3.inst_usr_cd.like(bind("inst_usr_cd")))
						.cutoff$and(S0_T3.inst_dpt_cd.like(bind("inst_dpt_cd")))
						.cutoff$and(S0_M28.dpt_nm.like(bind("inst_dpt_nm")))
						.cutoff$and(S0_T1.act_usr_cd.like(bind("act_usr_cd")))
						.cutoff$and(S0_T1.act_dpt_cd.like(bind("act_dpt_cd")))
						.cutoff$and(S0_M30.dpt_nm.like(bind("act_dpt_nm")))
						.cutoff$and(S0_T1.trd_cd.like(bind("trd_cd")))
						.cutoff$and(S0_T1.intr_rmrks.like(bind("intr_rmrks")))
						.cutoff$and(S0_T1.trd_rmrks.like(bind("trd_rmrks")))
						.cutoff$and(S0_T3.inst_rmrks.like(bind("inst_rmrks")))
						.cutoff$and(S0_T1.sub_char1.like(bind("h_sub_char1")))
						.cutoff$and(S0_T1.sub_char2.like(bind("h_sub_char2")))
						.cutoff$and(S0_T1.sub_char3.like(bind("h_sub_char3")))
						.cutoff$and(S0_T1.xfr_inst_no.like(bind("xfr_inst_no")))
						.cutoff$and(S0_T1.xfr_act_no.like(bind("xfr_act_no")))
						.cutoff$and(S0_T2.dlv_slip_no.like(bind("dlv_slip_no")))
					)
					.groupBy(
						S0_T1.trd_cd,
						S0_T3.xfr_schd_dt,
						S0_T3.xfr_inst_dt,
						S0_T1.xfr_dt,
						S0_T1.ac_dt,
						S0_T1.ac_dt,
						S0_T1.wg_cd,
						S0_T1.lg_grp_cd,
						S0_T1.gr_loc_cd,
						S0_T1.gr_stk_arrv_bp_cd,
						S0_T3.inst_usr_cd,
						S0_T3.inst_dpt_cd,
						S0_M28.dpt_nm,
						S0_T1.act_usr_cd,
						S0_T1.act_dpt_cd,
						S0_M30.dpt_nm,
						S0_T3.pick_prnt_flg,
						S0_T3.inst_prnt_flg,
						S0_T4.slip_prnt_flg,
						S0_T1.intr_rmrks,
						S0_T1.trd_rmrks,
						S0_T3.inst_rmrks,
						S0_T1.sub_char1,
						S0_T1.sub_char2,
						S0_T1.sub_char3,
						S0_T1.xfr_inst_no,
						S0_T1.xfr_act_no,
						S0_T2.dlv_slip_no,
						S0_T4.ins_usr_id,
						S0_T4.ins_usr_nm,
						S0_T4.ins_func_id,
						S0_T4.ins_ts,
						S0_T3.upd_cntr,
						S0_T1.upd_cntr,
						S0_T4.upd_usr_id,
						S0_T4.upd_usr_nm,
						S0_T4.upd_func_id,
						S0_T4.upd_ts,
						S0_T4.upd_srv_req_no
					)
					.orderBy(S0_T2.dlv_slip_no.asc())
			)
			.setDynamicSQLInfo(
				when(boundOr("trd_nm"))
					.view(v -> v.leftOuterJoin(S0_M3).on(bracket(S0_T1.trd_cd.eq(S0_M3.trd_cd))))
					.predicate(p -> p.cutoff$and(S0_M3.trd_nm.like(bind("trd_nm")))),
				when(boundOr("wg_nm"))
					.view(v -> v.leftOuterJoin(S0_M11).on(bracket(S0_T1.wg_cd.eq(S0_M11.wg_cd))))
					.predicate(p -> p.cutoff$and(S0_M11.wg_nm.like(bind("wg_nm")))),
				when(boundOr("lg_grp_nm"))
					.view(v -> v.leftOuterJoin(S0_M12).on(bracket(S0_T1.lg_grp_cd.eq(S0_M12.lg_grp_cd))))
					.predicate(p -> p.cutoff$and(S0_M12.lg_grp_nm.like(bind("lg_grp_nm")))),
				when(boundOr("gr_site_nm", "gr_loc_nm", "gr_site_cd"))
					.view(v -> v.leftOuterJoin(S0_M17).on(bracket(S0_T1.gr_loc_cd.eq(S0_M17.loc_cd))))
					.predicate(p -> p.cutoff$and(S0_M17.loc_nm.like(bind("gr_loc_nm"))).cutoff$and(S0_M17.site_cd.like(bind("gr_site_cd")))),
				when(boundOr("gr_stk_arrv_bp_nm"))
					.view(v -> v.leftOuterJoin(S0_M19).on(bracket(S0_T1.gr_stk_arrv_bp_cd.eq(S0_M19.bp_cd))))
					.predicate(p -> p.cutoff$and(S0_M19.bp_nm.like(bind("gr_stk_arrv_bp_nm")))),
				when(boundOr("gr_site_nm"))
					.view(v -> v.leftOuterJoin(S0_M20).on(bracket(S0_M17.site_cd.eq(S0_M20.site_cd))))
					.predicate(p -> p.cutoff$and(S0_M20.site_nm.like(bind("gr_site_nm")))),
				when(boundOr("inst_usr_nm"))
					.view(v -> v.leftOuterJoin(S0_M27).on(bracket(S0_T3.inst_usr_cd.eq(S0_M27.usr_cd))))
					.predicate(p -> p.cutoff$and(S0_M27.usr_nm.like(bind("inst_usr_nm")))),
				when(boundOr("act_usr_nm"))
					.view(v -> v.leftOuterJoin(S0_M29).on(bracket(S0_T1.act_usr_cd.eq(S0_M29.usr_cd))))
					.predicate(p -> p.cutoff$and(S0_M29.usr_nm.like(bind("act_usr_nm"))))
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
							r.getStringNE("wg_cd")
						))
						.addSelect(m -> toArray(
							m.wg_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("wg_nm", m.wg_nm());
					}),
					j -> j
						.add(MAM_LG_GRP_R.class, r -> toCondition(
							r.getStringNE("lg_grp_cd")
						))
						.addSelect(m -> toArray(
							m.lg_grp_nm,
							m.pick_list_flg,
							m.ship_inst_flg,
							m.ship_slip_flg
						))
						.addMap((r, m) -> {
							r.setStringNE("lg_grp_nm", m.lg_grp_nm());
							r.setBooleanNE("immd_dlv_prnt_flg", m.ship_slip_flg());
							r.setBooleanNE("immd_pick_prnt_flg", m.pick_list_flg());
							r.setBooleanNE("immd_inst_prnt_flg", m.ship_inst_flg());
					}),
					j -> j
						.add(MAM_LOC_R.class, r -> toCondition(
							r.getStringNE("gr_loc_cd")
						))
						.addSelect(m -> toArray(
							m.loc_nm,
							m.site_cd,
							m.sppl_cd,
							m.str_ln_tgt_flg
						))
						.addMap((r, m) -> {
							r.setStringNE("gr_loc_nm", m.loc_nm());
							r.setBooleanNE("gr_str_ln_tgt_flg", m.str_ln_tgt_flg());
							r.setStringNE("gr_site_cd", m.site_cd());
							r.setStringNE("gr_sppl_cd", m.sppl_cd());
					}),
					j -> j
						.add(MAM_BP_R.class, r -> toCondition(
							r.getStringNE("gr_sppl_cd")
						))
						.addSelect(m -> toArray(
							m.bp_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("gr_sppl_nm", m.bp_nm());
					}),
					j -> j
						.add(MAM_BP_R.class, r -> toCondition(
							r.getStringNE("gr_stk_arrv_bp_cd")
						))
						.addSelect(m -> toArray(
							m.bp_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("gr_stk_arrv_bp_nm", m.bp_nm());
					}),
					j -> j
						.add(MAM_SITE_R.class, r -> toCondition(
							r.getStringNE("gr_site_cd")
						))
						.addSelect(m -> toArray(
							m.site_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("gr_site_nm", m.site_nm());
					}),
					j -> j
						.add(MAM_USR_R.class, r -> toCondition(
							r.getStringNE("inst_usr_cd")
						))
						.addSelect(m -> toArray(
							m.usr_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("inst_usr_nm", m.usr_nm());
					}),
					j -> j
						.add(MAM_USR_R.class, r -> toCondition(
							r.getStringNE("act_usr_cd")
						))
						.addSelect(m -> toArray(
							m.usr_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("act_usr_nm", m.usr_nm());
					})
				)
			);
	}
	
	/**
	 * -- MSBEL1050_MST_XFR_ALLOC_STS_Query_S01
	 */
	static MCQueryPlan MSBEL1050_MST_XFR_ALLOC_STS_S01() {
		MCTempView S0_V1 = createTempView("V1");
		MAM_ITM_R S0_M1 = MAM_ITM_R.create("M1");
		MAM_ITM_TYP_D_R S0_M2 = MAM_ITM_TYP_D_R.create("M2");
		MAM_TRD_R S0_M3 = MAM_TRD_R.create("M3");
		MAM_SUNDRY_ITM_R S0_M4 = MAM_SUNDRY_ITM_R.create("M4");
		MAM_UNIT_R S0_M5 = MAM_UNIT_R.create("M5");
		MAM_UNIT_R S0_M7 = MAM_UNIT_R.create("M7");
		MAM_UNIT_R S0_M9 = MAM_UNIT_R.create("M9");
		MAM_WG_R S0_M11 = MAM_WG_R.create("M11");
		MAM_LG_GRP_R S0_M12 = MAM_LG_GRP_R.create("M12");
		MAM_LOC_R S0_M13 = MAM_LOC_R.create("M13");
		MAM_STR_LN_R S0_M14 = MAM_STR_LN_R.create("M14");
		MAM_BP_R S0_M15 = MAM_BP_R.create("M15");
		MAM_SITE_R S0_M16 = MAM_SITE_R.create("M16");
		MAM_LOC_R S0_M17 = MAM_LOC_R.create("M17");
		MAM_STR_LN_R S0_M18 = MAM_STR_LN_R.create("M18");
		MAM_BP_R S0_M19 = MAM_BP_R.create("M19");
		MAM_SITE_R S0_M20 = MAM_SITE_R.create("M20");
		MAM_STK_GD_R S0_M21 = MAM_STK_GD_R.create("M21");
		MAM_BP_R S0_M22 = MAM_BP_R.create("M22");
		MAM_USR_R S0_M23 = MAM_USR_R.create("M23");
		MAM_DPT_R S0_M24 = MAM_DPT_R.create("M24");
		MAM_BIZ_RSN_R S0_M25 = MAM_BIZ_RSN_R.create("M25");
		MAM_DPT_R S0_M26 = MAM_DPT_R.create("M26");
		MAM_ITM_GRP_R S0_MM1 = MAM_ITM_GRP_R.create("MM1");
		MAM_ITM_GRP_R S0_MM2 = MAM_ITM_GRP_R.create("MM2");
		MAM_ITM_GRP_R S0_MM3 = MAM_ITM_GRP_R.create("MM3");
		MAM_ITM_GRP_R S0_MM4 = MAM_ITM_GRP_R.create("MM4");
		MAM_ITM_GRP_R S0_MM5 = MAM_ITM_GRP_R.create("MM5");
		MAM_ITM_GRP_R S0_MM6 = MAM_ITM_GRP_R.create("MM6");
		MAM_ITM_GRP_R S0_MM7 = MAM_ITM_GRP_R.create("MM7");
		MAM_ITM_GRP_R S0_MM8 = MAM_ITM_GRP_R.create("MM8");
		MAM_ITM_GRP_R S0_MM9 = MAM_ITM_GRP_R.create("MM9");
		MAM_ITM_GRP_R S0_MM10 = MAM_ITM_GRP_R.create("MM10");
		MST_XFR_ALLOC_STS_R S1_W1 = MST_XFR_ALLOC_STS_R.create("W1");
		MST_XFR_SCHD_R S1_W2 = MST_XFR_SCHD_R.create("W2");
		MSVT_WRK_SNO_R S1_W3 = MSVT_WRK_SNO_R.create("W3");
		MST_XFR_INST_D_R S1_W4 = MST_XFR_INST_D_R.create("W4");
		MST_PROV_SCHD_R S1_W5 = MST_PROV_SCHD_R.create("W5");
		MST_PROV_SCHD_R S1_W6 = MST_PROV_SCHD_R.create("W6");
		MAM_ITM_LG_GRP_R S1_W7 = MAM_ITM_LG_GRP_R.create("W7");
		MAM_LOC_R S1_W8 = MAM_LOC_R.create("W8");
		MAVM_RD_LOC_R S2_V1 = MAVM_RD_LOC_R.create("V1");
		MAVM_RD_LG_GRP_R S3_V2 = MAVM_RD_LG_GRP_R.create("V2");
		MAVM_RD_LOC_R S4_V3 = MAVM_RD_LOC_R.create("V3");
		
		MCDynamicSQLID DS0C_ITM_GRP = createDynamicSQLID("DS0C_ITM_GRP");
		
		return createQueryPlan()
			.setQuery(
				sql("MSBEL1050_MST_XFR_ALLOC_STS_Query_S01")
					.mainQuery()
					.select(
						S0_V1.pr(S1_W1.trd_cd),
						S0_V1.pr(S1_W1.trd_ptn_typ),
						S0_V1.pr(S1_W1.pr_sts_typ),
						S0_V1.pr("itm_cd"),
						S0_V1.pr("itm_sub1"),
						S0_V1.pr("itm_sub2"),
						S0_V1.pr("itm_sub3"),
						coalesce(
							S0_M4.itm_nm,
							S0_M1.itm_nm
						).as("itm_nm"),
						S0_M1.sundry_itm_flg,
						S0_M1.lot_mng_typ,
						S0_M1.sublot_mng_typ,
						S0_M1.sno1_mng_typ,
						S0_M1.sno2_mng_typ,
						S0_M1.sno3_mng_typ,
						S0_M1.sno4_mng_typ,
						S0_V1.pr(S1_W1.not_lot_mix_flg),
						S0_V1.pr(S1_W1.not_sublot_mix_flg),
						S0_V1.pr(S1_W1.lot_no),
						S0_V1.pr(S1_W1.sublot_no),
						S0_V1.pr(S1_W1.sno1),
						S0_V1.pr(S1_W1.sno1_null_flg),
						S0_V1.pr(S1_W1.sno2),
						S0_V1.pr(S1_W1.sno2_null_flg),
						S0_V1.pr(S1_W1.sno3),
						S0_V1.pr(S1_W1.sno3_null_flg),
						S0_V1.pr(S1_W1.sno4),
						S0_V1.pr(S1_W1.sno4_null_flg),
						S0_V1.pr(S1_W3.wrk_no),
						S0_V1.pr(S1_W3.wrk_nm).as("wkk_nm"),
						S0_V1.pr(S1_W1.alloc_sno1),
						S0_V1.pr(S1_W1.alloc_sno2),
						S0_V1.pr(S1_W1.alloc_sno3),
						S0_V1.pr(S1_W1.alloc_sno4),
						S0_M1.ver_flg.as("def_ver_flg"),
						S0_V1.pr(S1_W1.ver_no),
						S0_V1.pr(S1_W1.abort_flg),
						S0_V1.pr(S1_W1.fix_flg),
						S0_V1.pr(S1_W1.cmpl_flg),
						S0_V1.pr(S1_W1.trd_unit_cd),
						S0_V1.pr(S1_W1.trd_unit_qty),
						S0_V1.pr(S1_W1.base_unit_cd),
						S0_V1.pr("base_unit_qty").as("base_unit_qty"),
						S0_V1.pr("base_unit_schd_qty"),
						S0_V1.pr("base_unit_inst_qty"),
						S0_V1.pr("base_unit_act_qty"),
						S0_M1.pckg_unit_cd,
						S0_V1.pr("pckg_unit_qty"),
						S0_V1.pr("schd_unit_cd"),
						S0_V1.pr("schd_qty"),
						S0_M1.cont_fctr_flg,
						S0_M1.std_cont_fctr,
						S0_M1.cont_fctr_unit_cd,
						S0_M1.cont_fctr_rnd_typ,
						S0_M1.cont_fctr_dec_place,
						S0_V1.pr("xfr_rqst_dt"),
						S0_V1.pr(S1_W1.xfr_schd_dt),
						S0_V1.pr("xfr_inst_dt"),
						S0_V1.pr("xfr_act_dt"),
						S0_V1.pr("xfr_ac_dt"),
						S0_V1.pr("can_ac_dt"),
						S0_V1.pr(S1_W1.wg_cd),
						S0_V1.pr(S1_W1.lg_grp_cd),
						S0_V1.pr(S1_W1.gi_loc_cd),
						S0_V1.pr(S1_W1.gi_str_ln_cd),
						S0_V1.pr(S1_W1.gi_stk_arrv_bp_cd),
						S0_V1.pr(S1_W1.gr_loc_cd),
						S0_V1.pr(S1_W1.gr_str_ln_cd),
						S0_V1.pr(S1_W1.gr_stk_arrv_bp_cd),
						S0_V1.pr(S1_W1.gd_cd),
						S0_V1.pr(S1_W1.quality_typ),
						S0_V1.pr(S1_W1.stk_insp_typ),
						S0_V1.pr(S1_W1.stk_id_typ),
						S0_V1.pr(S1_W1.stk_bp_cd),
						S0_V1.pr(S1_W2.rqst_usr_cd),
						S0_V1.pr(S1_W2.rqst_dpt_cd),
						S0_M24.dpt_nm.as("rqst_dpt_nm"),
						S0_V1.pr("inst_usr_cd"),
						S0_V1.pr("inst_usr_nm"),
						S0_V1.pr("inst_dpt_cd"),
						S0_V1.pr("inst_dpt_nm"),
						S0_V1.pr("act_usr_cd"),
						S0_V1.pr("act_usr_nm"),
						S0_V1.pr("act_dpt_cd"),
						S0_V1.pr("act_dpt_nm"),
						S0_V1.pr(S1_W1.ship_inst_typ),
						S0_V1.pr(S1_W1.rsn_cd),
						S0_V1.pr(S1_W1.bd_dpt_cd),
						S0_M26.dpt_nm.as("bd_dpt_nm"),
						S0_V1.pr("inst_prnt_flg"),
						S0_V1.pr("dlv_prnt_flg"),
						S0_V1.pr(S1_W1.alloc_flg),
						S0_M1.skip_chk_ship_flg.as("skip_chk_ship_flg"),
						S0_V1.pr("intr_rmrks"),
						S0_V1.pr("trd_rmrks"),
						S0_V1.pr("inst_rmrks"),
						S0_V1.pr("h_sub_char1"),
						S0_V1.pr("h_sub_char2"),
						S0_V1.pr("h_sub_char3"),
						S0_V1.pr("intr_d_rmrks"),
						S0_V1.pr("inst_d_rmrks"),
						S0_V1.pr("d_sub_char1"),
						S0_V1.pr("d_sub_char2"),
						S0_V1.pr("d_sub_char3"),
						S0_V1.pr(S1_W2.rqst_cnt_rmrks),
						S0_V1.pr(S1_W2.ship_cnt_rmrks),
						S0_V1.pr(S1_W1.trd_d_rmrks),
						S0_V1.pr("schd_intr_rmrks"),
						S0_V1.pr(S1_W2.xfr_src_typ),
						S0_V1.pr(S1_W2.xfr_src_no),
						S0_V1.pr(S1_W1.xfr_schd_no),
						S0_V1.pr(S1_W1.xfr_alloc_sts_no),
						S0_V1.pr(S1_W1.dlv_slip_no),
						S0_V1.pr(S1_W1.dlv_slip_d_no),
						S0_V1.pr(S1_W4.xfr_inst_no),
						S0_V1.pr(S1_W1.xfr_inst_d_no),
						S0_V1.pr("xfr_act_no"),
						S0_V1.pr("xfr_act_d_no"),
						S0_V1.pr(S1_W2.slo_no),
						S0_V1.pr(S1_W2.mfg_inst_no),
						S0_V1.pr(S1_W2.oper_inst_no),
						S0_V1.pr(S1_W1.io_schd_pr_no),
						S0_V1.pr(S1_W1.prov_typ),
						S0_V1.pr(S1_W1.prov_basis_typ),
						S0_V1.pr(S1_W1.ret_prov_typ),
						S0_V1.pr(S1_W1.ret_prov_basis_typ),
						S0_V1.pr("prov_schd_no"),
						S0_V1.pr("ret_prov_schd_no"),
						S0_V1.pr(S1_W2.base_dlv_slip_no),
						S0_V1.pr(S1_W2.base_prov_act_no),
						S0_V1.pr(S1_W2.base_ac_dt),
						S0_M1.itm_typ,
						S0_M1.itm_typ_d_cd,
						S0_V1.pr(S1_W1.ins_usr_id),
						S0_V1.pr(S1_W1.ins_usr_nm),
						S0_V1.pr(S1_W1.ins_func_id),
						S0_V1.pr(S1_W1.ins_ts),
						S0_V1.pr("alloc_sts_upd_cntr"),
						S0_V1.pr("inst_upd_cntr"),
						S0_V1.pr(S1_W1.upd_usr_id),
						S0_V1.pr(S1_W1.upd_usr_nm),
						S0_V1.pr(S1_W1.upd_func_id),
						S0_V1.pr(S1_W1.upd_ts),
						S0_V1.pr(S1_W1.upd_srv_req_no),
						S0_V1.pr("inst_disp_seq"),
						S0_V1.pr("act_disp_seq"),
						addDynamicSelect(DS0C_ITM_GRP)
					)
					.from(
						subQuery()
						.select(
							S1_W1.trd_cd,
							S1_W1.trd_ptn_typ,
							S1_W1.pr_sts_typ,
							coalesce(
								S1_W2.itm_cd,
								S1_W4.itm_cd
							).as("itm_cd"),
							coalesce(
								S1_W2.itm_sub1,
								S1_W4.itm_sub1
							).as("itm_sub1"),
							coalesce(
								S1_W2.itm_sub2,
								S1_W4.itm_sub2
							).as("itm_sub2"),
							coalesce(
								S1_W2.itm_sub3,
								S1_W4.itm_sub3
							).as("itm_sub3"),
							S1_W1.not_lot_mix_flg,
							S1_W1.not_sublot_mix_flg,
							S1_W1.lot_no,
							S1_W1.sublot_no,
							S1_W1.ver_no,
							S1_W1.sno1,
							S1_W1.sno1_null_flg,
							S1_W1.sno2,
							S1_W1.sno2_null_flg,
							S1_W1.sno3,
							S1_W1.sno3_null_flg,
							S1_W1.sno4,
							S1_W1.sno4_null_flg,
							S1_W3.wrk_no,
							S1_W3.wrk_nm,
							S1_W1.alloc_sno1,
							S1_W1.alloc_sno2,
							S1_W1.alloc_sno3,
							S1_W1.alloc_sno4,
							S1_W1.abort_flg,
							S1_W1.fix_flg,
							S1_W1.cmpl_flg,
							S1_W1.trd_unit_cd,
							S1_W1.trd_unit_qty,
							S1_W1.base_unit_cd,
							S1_W1.base_unit_qty.as("base_unit_qty"),
							cases()
								.when(
									S1_W1.xfr_schd_no.eq(value(MAC_STR.NULL_VAL.value()))
									.or(S1_W1.xfr_schd_no.isNull())
								)
									.then(value(0))
								.otherwise(S1_W2.base_unit_qty).as("base_unit_schd_qty"),
							value(0).as("base_unit_inst_qty"),
							S1_W1.act_qty.as("base_unit_act_qty"),
							value((MCNumber) null).as("pckg_unit_qty"),
							S1_W2.trd_unit_cd.as("schd_unit_cd"),
							S1_W2.trd_unit_qty.as("schd_qty"),
							coalesce(
								S1_W2.gi_rqst_tm,
								S1_W2.gr_rqst_tm
							).as("xfr_rqst_dt"),
							S1_W1.xfr_schd_dt,
							value((MCDate) null).as("xfr_inst_dt"),
							value((MCDate) null).as("xfr_act_dt"),
							value((MCDate) null).as("xfr_ac_dt"),
							value((MCDate) null).as("can_ac_dt"),
							S1_W1.wg_cd,
							S1_W1.lg_grp_cd,
							S1_W1.gi_loc_cd,
							S1_W1.gi_str_ln_cd,
							S1_W1.gi_stk_arrv_bp_cd,
							S1_W1.gr_loc_cd,
							S1_W1.gr_str_ln_cd,
							S1_W1.gr_stk_arrv_bp_cd,
							S1_W1.gd_cd,
							S1_W1.quality_typ,
							S1_W1.stk_insp_typ,
							S1_W1.stk_id_typ,
							S1_W1.stk_bp_cd,
							S1_W2.rcpt_dt,
							S1_W2.rqst_usr_cd,
							S1_W2.rqst_dpt_cd,
							nullValue().as("inst_usr_cd"),
							nullValue().as("inst_usr_nm"),
							nullValue().as("inst_dpt_cd"),
							nullValue().as("inst_dpt_nm"),
							nullValue().as("act_usr_cd"),
							nullValue().as("act_usr_nm"),
							nullValue().as("act_dpt_cd"),
							nullValue().as("act_dpt_nm"),
							S1_W1.ship_inst_typ,
							S1_W1.rsn_cd,
							S1_W1.bd_dpt_cd,
							value(false).as("inst_prnt_flg"),
							value(false).as("dlv_prnt_flg"),
							S1_W1.alloc_flg,
							nullValue().as("intr_rmrks"),
							nullValue().as("trd_rmrks"),
							nullValue().as("inst_rmrks"),
							nullValue().as("h_sub_char1"),
							nullValue().as("h_sub_char2"),
							nullValue().as("h_sub_char3"),
							nullValue().as("intr_d_rmrks"),
							nullValue().as("inst_d_rmrks"),
							nullValue().as("d_sub_char1"),
							nullValue().as("d_sub_char2"),
							nullValue().as("d_sub_char3"),
							S1_W2.rqst_cnt_rmrks,
							S1_W2.ship_cnt_rmrks,
							S1_W1.trd_d_rmrks,
							S1_W2.intr_rmrks.as("schd_intr_rmrks"),
							S1_W2.xfr_src_typ,
							S1_W2.xfr_src_no,
							S1_W1.xfr_schd_no,
							S1_W1.xfr_alloc_sts_no,
							S1_W1.dlv_slip_no,
							S1_W1.dlv_slip_d_no,
							S1_W4.xfr_inst_no,
							S1_W1.xfr_inst_d_no,
							nullValue().as("xfr_act_no"),
							nullValue().as("xfr_act_d_no"),
							S1_W2.slo_no,
							S1_W2.mfg_inst_no,
							S1_W2.oper_inst_no,
							S1_W1.io_schd_pr_no,
							S1_W1.prov_typ,
							S1_W1.prov_basis_typ,
							S1_W1.ret_prov_typ,
							S1_W1.ret_prov_basis_typ,
							S1_W5.prov_schd_no.as("prov_schd_no"),
							S1_W6.prov_schd_no.as("ret_prov_schd_no"),
							S1_W2.base_dlv_slip_no,
							S1_W2.base_prov_act_no,
							S1_W2.base_ac_dt,
							S1_W1.ins_usr_id,
							S1_W1.ins_usr_nm,
							S1_W1.ins_func_id,
							S1_W1.ins_ts,
							S1_W1.upd_cntr.as("alloc_sts_upd_cntr"),
							value((MCNumber) null).as("inst_upd_cntr"),
							S1_W1.upd_usr_id,
							S1_W1.upd_usr_nm,
							S1_W1.upd_func_id,
							S1_W1.upd_ts,
							S1_W1.upd_srv_req_no,
							S1_W1.disp_seq.as("inst_disp_seq"),
							value((MCNumber) null).as("act_disp_seq")
						)
						.from(
							S1_W1
							.leftOuterJoin(S1_W2).on(S1_W1.xfr_schd_no.eq(S1_W2.xfr_schd_no))
							.leftOuterJoin(S1_W3).on(S1_W1.sno1.eq(S1_W3.sno1))
							.leftOuterJoin(S1_W4).on(S1_W1.xfr_inst_d_no.eq(S1_W4.xfr_inst_d_no))
							.leftOuterJoin(S1_W5).on(
								S1_W1.xfr_alloc_sts_no.eq(S1_W5.prov_src_schd_no1)
								.and(S1_W5.prov_src_schd_typ.eq(value(MSC_PROV_SRC_SCHD_TYP.XFR.value())))
								.and(S1_W5.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.PROV.value())))
							)
							.leftOuterJoin(S1_W6).on(
								S1_W1.xfr_alloc_sts_no.eq(S1_W6.prov_src_schd_no1)
								.and(S1_W6.prov_src_schd_typ.eq(value(MSC_PROV_SRC_SCHD_TYP.XFR.value())))
								.and(S1_W6.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.PROV_RTN.value())))
							)
							.leftOuterJoin(S1_W7).on(
								nvl(
									S1_W2.itm_cd,
									S1_W4.itm_cd
								).eq(S1_W7.itm_cd)
								.and(
									nvl(
										S1_W2.itm_sub1,
										S1_W4.itm_sub1
									).eq(S1_W7.itm_sub1)
								)
								.and(
									nvl(
										S1_W2.itm_sub2,
										S1_W4.itm_sub2
									).eq(S1_W7.itm_sub2)
								)
								.and(
									nvl(
										S1_W2.itm_sub3,
										S1_W4.itm_sub3
									).eq(S1_W7.itm_sub3)
								)
								.and(S1_W1.lg_grp_cd.eq(S1_W7.lg_grp_cd))
							)
							.leftOuterJoin(S1_W8).on(
								S1_W1.lg_grp_cd.eq(S1_W8.lg_grp_cd)
								.and(S1_W8.del_flg.eq(value(false)))
								.and(S1_W8.lg_def_flg.eq(value(true)))
							)
						)
						.where(
							value(0).eq(value(0))
							.and(
								exists(
									subQuery()
									.select(value("X"))
									.from(S2_V1)
									.where(
										S1_W1.gr_loc_cd.eq(S2_V1.loc_cd)
									)
								)
								.or(
									exists(
										subQuery()
										.select(value("X"))
										.from(S3_V2)
										.where(
											S1_W1.lg_grp_cd.eq(S3_V2.lg_grp_cd)
										)
									)
								)
								.or(
									exists(
										subQuery()
										.select(value("X"))
										.from(S4_V3)
										.where(
											value(0).eq(value(0))
											.and(
												S4_V3.loc_cd.eq(coalesce(
														S1_W1.gi_loc_cd,
														S1_W7.lg_def_loc_cd,
														S1_W8.loc_cd
													)
												)
											)
										)
									)
								)
							)
							.and(
								value(true).eq(value(false))
								.cutoff$or(S1_W1.pr_sts_typ.eq(bind("pr_sts_not_inst")))
								.cutoff$or(S1_W1.pr_sts_typ.eq(bind("pr_sts_inst")))
								.cutoff$or(S1_W1.pr_sts_typ.eq(bind("pr_sts_part_xfr")))
								.cutoff$or(S1_W1.pr_sts_typ.eq(bind("pr_sts_cmpl")))
							)
							.and(
								value(true).eq(value(false))
								.cutoff$or(S1_W1.ship_inst_typ.eq(bind("ship_inst_pick")))
								.cutoff$or(S1_W1.ship_inst_typ.eq(bind("ship_inst_no_pick")))
								.cutoff$or(S1_W1.ship_inst_typ.eq(bind("ship_inst_non")))
							)
							.cutoff$and(S1_W1.ship_inst_typ.eq(bind("ship_inst_typ")))
							.cutoff$and(S1_W1.alloc_flg.eq(bind("alloc_true")))
							.cutoff$and(S1_W1.alloc_flg.neq(bind("not_alloc_true")))
							.cutoff$and(S1_W1.xfr_schd_dt.gte(bind("xfr_schd_dt_fr")))
							.cutoff$and(S1_W1.xfr_schd_dt.lte(bind("xfr_schd_dt_to")))
							.cutoff$and(S1_W1.wg_cd.like(bind("wg_cd")))
							.cutoff$and(S1_W1.lg_grp_cd.like(bind("lg_grp_cd")))
							.cutoff$and(S1_W1.gi_loc_cd.like(bind("gi_loc_cd")))
							.cutoff$and(S1_W1.gi_str_ln_cd.like(bind("gi_str_ln_cd")))
							.cutoff$and(S1_W1.gi_stk_arrv_bp_cd.like(bind("gi_stk_arrv_bp_cd")))
							.cutoff$and(S1_W1.gr_loc_cd.like(bind("gr_loc_cd")))
							.cutoff$and(S1_W1.gr_str_ln_cd.like(bind("gr_str_ln_cd")))
							.cutoff$and(S1_W1.gr_stk_arrv_bp_cd.like(bind("gr_stk_arrv_bp_cd")))
							.cutoff$and(
								coalesce(
									S1_W2.itm_cd,
									S1_W4.itm_cd
								).like(bind("itm_cd"))
							)
							.cutoff$and(
								coalesce(
									S1_W2.itm_sub1,
									S1_W4.itm_sub1
								).like(bind("itm_sub1"))
							)
							.cutoff$and(
								coalesce(
									S1_W2.itm_sub2,
									S1_W4.itm_sub2
								).like(bind("itm_sub2"))
							)
							.cutoff$and(
								coalesce(
									S1_W2.itm_sub3,
									S1_W4.itm_sub3
								).like(bind("itm_sub3"))
							)
							.cutoff$and(S1_W1.lot_no.like(bind("lot_no")))
							.cutoff$and(S1_W1.sublot_no.like(bind("sublot_no")))
							.cutoff$and(S1_W1.sno1.like(bind("sno1")))
							.cutoff$and(S1_W1.sno2.like(bind("sno2")))
							.cutoff$and(S1_W1.sno3.like(bind("sno3")))
							.cutoff$and(S1_W1.sno4.like(bind("sno4")))
							.cutoff$and(S1_W3.wrk_no.like(bind("wrk_no")))
							.cutoff$and(S1_W3.wrk_nm.like(bind("wrk_nm")))
							.cutoff$and(S1_W1.abort_flg.neq(bind("abort_false")))
							.cutoff$and(S1_W1.trd_unit_cd.like(bind("trd_unit_cd")))
							.cutoff$and(S1_W1.base_unit_cd.like(bind("base_unit_cd")))
							.cutoff$and(S1_W1.gd_cd.like(bind("gd_cd")))
							.cutoff$and(S1_W1.quality_typ.like(bind("quality_typ")))
							.cutoff$and(S1_W1.stk_insp_typ.like(bind("stk_insp_typ")))
							.cutoff$and(S1_W1.stk_id_typ.like(bind("stk_id_typ")))
							.cutoff$and(S1_W1.stk_bp_cd.like(bind("stk_bp_cd")))
							.cutoff$and(S1_W2.rqst_usr_cd.like(bind("rqst_usr_cd")))
							.cutoff$and(S1_W2.rqst_dpt_cd.like(bind("rqst_dpt_cd")))
							.cutoff$and(S1_W1.rsn_cd.like(bind("rsn_cd")))
							.cutoff$and(S1_W1.bd_dpt_cd.like(bind("bd_dpt_cd")))
							.cutoff$and(S1_W1.trd_cd.like(bind("trd_cd")))
							.cutoff$and(S1_W2.rqst_mod_flg.eq(bind("rqst_mod_true")))
							.cutoff$and(S1_W2.rqst_cnt_rmrks.like(bind("rqst_cnt_rmrks")))
							.cutoff$and(S1_W2.ship_cnt_rmrks.like(bind("ship_cnt_rmrks")))
							.cutoff$and(S1_W2.intr_rmrks.like(bind("schd_intr_rmrks")))
							.cutoff$and(S1_W2.xfr_src_typ.like(bind("xfr_src_typ")))
							.cutoff$and(S1_W2.xfr_src_no.like(bind("xfr_src_no")))
							.cutoff$and(S1_W1.xfr_schd_no.like(bind("xfr_schd_no")))
							.cutoff$and(S1_W1.xfr_alloc_sts_no.like(bind("xfr_alloc_sts_no")))
							.cutoff$and(S1_W1.dlv_slip_no.like(bind("dlv_slip_no")))
							.cutoff$and(S1_W1.dlv_slip_d_no.like(bind("dlv_slip_d_no")))
							.cutoff$and(S1_W4.xfr_inst_no.like(bind("xfr_inst_no")))
							.cutoff$and(S1_W1.xfr_inst_d_no.like(bind("xfr_inst_d_no")))
							.cutoff$and(S1_W2.slo_no.like(bind("slo_no")))
							.cutoff$and(S1_W2.mfg_inst_no.like(bind("mfg_inst_no")))
							.cutoff$and(S1_W2.oper_inst_no.like(bind("oper_inst_no")))
							.cutoff$and(S1_W1.io_schd_pr_no.like(bind("io_schd_pr_no")))
						).view(S0_V1)
						.leftOuterJoin(S0_M1).on(
							S0_V1.pr("itm_cd").eq(S0_M1.itm_cd)
							.and(S0_V1.pr("itm_sub1").eq(S0_M1.itm_sub1))
							.and(S0_V1.pr("itm_sub2").eq(S0_M1.itm_sub2))
							.and(S0_V1.pr("itm_sub3").eq(S0_M1.itm_sub3))
						)
						.leftOuterJoin(S0_M4).on(
							S0_V1.pr("itm_cd").eq(S0_M4.itm_cd)
							.and(S0_V1.pr("itm_sub1").eq(S0_M4.itm_sub1))
							.and(S0_V1.pr("itm_sub2").eq(S0_M4.itm_sub2))
							.and(S0_V1.pr("itm_sub3").eq(S0_M4.itm_sub3))
							.and(S0_V1.pr(S1_W1.sno1).eq(S0_M4.sno1))
							.and(S0_V1.pr(S1_W1.sno2).eq(S0_M4.sno2))
							.and(S0_V1.pr(S1_W1.sno3).eq(S0_M4.sno3))
							.and(S0_V1.pr(S1_W1.sno4).eq(S0_M4.sno4))
						)
						.leftOuterJoin(S0_M24).on(
							S0_V1.pr(S1_W2.rqst_dpt_cd).eq(S0_M24.dpt_cd)
							.and(S0_V1.pr(S1_W2.rcpt_dt).between(S0_M24.st_dt, S0_M24.end_dt))
						)
						.leftOuterJoin(S0_M26).on(
							S0_V1.pr(S1_W1.bd_dpt_cd).eq(S0_M26.dpt_cd)
							.and(S0_V1.pr(S1_W2.rcpt_dt).between(S0_M26.st_dt, S0_M26.end_dt))
						)
						.addDynamicView()
						.addDynamicView(DS0C_ITM_GRP)
					)
					.where(
						value(0).eq(value(0))
						.addDynamicPredicate()
						.cutoff$and(S0_M1.itm_typ.like(bind("itm_typ")))
						.cutoff$and(S0_M1.itm_typ_d_cd.like(bind("itm_typ_d_cd")))
						.cutoff$and(
							coalesce(
								S0_M4.itm_nm,
								S0_M1.itm_nm
							).like(bind("itm_nm"))
						)
						.cutoff$and(S0_V1.pr(S1_W1.ver_no).like(bind("ver_no")))
						.cutoff$and(S0_M1.pckg_unit_cd.like(bind("pckg_unit_cd")))
						.cutoff$and(S0_M24.dpt_nm.like(bind("rqst_dpt_nm")))
						.cutoff$and(S0_M26.dpt_nm.like(bind("bd_dpt_nm")))
						.addDynamicPredicate(DS0C_ITM_GRP)
					)
					.orderBy(
						S0_V1.pr(S1_W1.trd_cd).asc(),
						S0_V1.pr(S1_W1.pr_sts_typ).asc(),
						S0_V1.pr("itm_cd").asc(),
						S0_V1.pr("itm_sub1").asc(),
						S0_V1.pr("itm_sub2").asc(),
						S0_V1.pr("itm_sub3").asc(),
						S0_V1.pr(S1_W1.lot_no).asc(),
						S0_V1.pr(S1_W1.sublot_no).asc(),
						S0_V1.pr(S1_W1.sno1).asc(),
						S0_V1.pr(S1_W1.sno2).asc(),
						S0_V1.pr(S1_W1.sno3).asc(),
						S0_V1.pr(S1_W1.sno4).asc(),
						S0_V1.pr(S1_W1.trd_unit_cd).asc(),
						S0_V1.pr(S1_W1.xfr_schd_dt).asc(),
						S0_V1.pr(S1_W1.gi_loc_cd).asc(),
						S0_V1.pr(S1_W1.gi_str_ln_cd).asc(),
						S0_V1.pr(S1_W1.gi_stk_arrv_bp_cd).asc(),
						S0_V1.pr(S1_W1.gr_loc_cd).asc(),
						S0_V1.pr(S1_W1.gr_str_ln_cd).asc(),
						S0_V1.pr(S1_W1.gr_stk_arrv_bp_cd).asc()
					)
			)
			.setDynamicSQLInfo(
				when(boundOr("itm_typ_d_nm"))
					.view(v -> v.leftOuterJoin(S0_M2).on(S0_M1.itm_typ.eq(S0_M2.itm_typ).and(S0_M1.itm_typ_d_cd.eq(S0_M2.itm_typ_d_cd))))
					.predicate(p -> p.cutoff$and(S0_M2.itm_typ_d_nm.like(bind("itm_typ_d_nm")))),
				when(boundOr("trd_nm"))
					.view(v -> v.leftOuterJoin(S0_M3).on(S0_V1.pr(S1_W1.trd_cd).eq(S0_M3.trd_cd)))
					.predicate(p -> p.cutoff$and(S0_M3.trd_nm.like(bind("trd_nm")))),
				when(boundOr("trd_unit_nm"))
					.view(v -> v.leftOuterJoin(S0_M5).on(S0_V1.pr(S1_W1.trd_unit_cd).eq(S0_M5.unit_cd)))
					.predicate(p -> p.cutoff$and(S0_M5.unit_nm.like(bind("trd_unit_nm")))),
				when(boundOr("base_unit_nm"))
					.view(v -> v.leftOuterJoin(S0_M7).on(S0_V1.pr(S1_W1.base_unit_cd).eq(S0_M7.unit_cd)))
					.predicate(p -> p.cutoff$and(S0_M7.unit_nm.like(bind("base_unit_nm")))),
				when(boundOr("pckg_unit_nm"))
					.view(v -> v.leftOuterJoin(S0_M9).on(S0_M1.pckg_unit_cd.eq(S0_M9.unit_cd)))
					.predicate(p -> p.cutoff$and(S0_M9.unit_nm.like(bind("pckg_unit_nm")))),
				when(boundOr("wg_nm"))
					.view(v -> v.leftOuterJoin(S0_M11).on(S0_V1.pr(S1_W1.wg_cd).eq(S0_M11.wg_cd)))
					.predicate(p -> p.cutoff$and(S0_M11.wg_nm.like(bind("wg_nm")))),
				when(boundOr("lg_grp_nm"))
					.view(v -> v.leftOuterJoin(S0_M12).on(S0_V1.pr(S1_W1.lg_grp_cd).eq(S0_M12.lg_grp_cd)))
					.predicate(p -> p.cutoff$and(S0_M12.lg_grp_nm.like(bind("lg_grp_nm")))),
				when(boundOr("gi_site_nm", "gi_loc_nm", "gi_site_cd"))
					.view(v -> v.leftOuterJoin(S0_M13).on(S0_V1.pr(S1_W1.gi_loc_cd).eq(S0_M13.loc_cd)))
					.predicate(p -> p.cutoff$and(S0_M13.loc_nm.like(bind("gi_loc_nm"))).cutoff$and(S0_M13.site_cd.like(bind("gi_site_cd")))),
				when(boundOr("gi_str_ln_nm"))
					.view(v -> v.leftOuterJoin(S0_M14).on(S0_V1.pr(S1_W1.gi_loc_cd).eq(S0_M14.loc_cd).and(S0_V1.pr(S1_W1.gi_str_ln_cd).eq(S0_M14.str_ln_cd))))
					.predicate(p -> p.cutoff$and(S0_M14.str_ln_nm.like(bind("gi_str_ln_nm")))),
				when(boundOr("gi_stk_arrv_bp_nm"))
					.view(v -> v.leftOuterJoin(S0_M15).on(S0_V1.pr(S1_W1.gi_stk_arrv_bp_cd).eq(S0_M15.bp_cd)))
					.predicate(p -> p.cutoff$and(S0_M15.bp_nm.like(bind("gi_stk_arrv_bp_nm")))),
				when(boundOr("gi_site_nm"))
					.view(v -> v.leftOuterJoin(S0_M16).on(S0_M13.site_cd.eq(S0_M16.site_cd)))
					.predicate(p -> p.cutoff$and(S0_M16.site_nm.like(bind("gi_site_nm")))),
				when(boundOr("gr_site_nm", "gr_loc_nm", "gr_site_cd"))
					.view(v -> v.leftOuterJoin(S0_M17).on(S0_V1.pr(S1_W1.gr_loc_cd).eq(S0_M17.loc_cd)))
					.predicate(p -> p.cutoff$and(S0_M17.loc_nm.like(bind("gr_loc_nm"))).cutoff$and(S0_M17.site_cd.like(bind("gr_site_cd")))),
				when(boundOr("gr_str_ln_nm"))
					.view(v -> v.leftOuterJoin(S0_M18).on(S0_V1.pr(S1_W1.gr_loc_cd).eq(S0_M18.loc_cd).and(S0_V1.pr(S1_W1.gr_str_ln_cd).eq(S0_M18.str_ln_cd))))
					.predicate(p -> p.cutoff$and(S0_M18.str_ln_nm.like(bind("gr_str_ln_nm")))),
				when(boundOr("gr_stk_arrv_bp_nm"))
					.view(v -> v.leftOuterJoin(S0_M19).on(S0_V1.pr(S1_W1.gr_stk_arrv_bp_cd).eq(S0_M19.bp_cd)))
					.predicate(p -> p.cutoff$and(S0_M19.bp_nm.like(bind("gr_stk_arrv_bp_nm")))),
				when(boundOr("gr_site_nm"))
					.view(v -> v.leftOuterJoin(S0_M20).on(S0_M17.site_cd.eq(S0_M20.site_cd)))
					.predicate(p -> p.cutoff$and(S0_M20.site_nm.like(bind("gr_site_nm")))),
				when(boundOr("gd_nm"))
					.view(v -> v.leftOuterJoin(S0_M21).on(S0_V1.pr(S1_W1.gd_cd).eq(S0_M21.gd_cd)))
					.predicate(p -> p.cutoff$and(S0_M21.gd_nm.like(bind("gd_nm")))),
				when(boundOr("stk_bp_nm"))
					.view(v -> v.leftOuterJoin(S0_M22).on(S0_V1.pr(S1_W1.stk_bp_cd).eq(S0_M22.bp_cd)))
					.predicate(p -> p.cutoff$and(S0_M22.bp_nm.like(bind("stk_bp_nm")))),
				when(boundOr("rqst_usr_nm"))
					.view(v -> v.leftOuterJoin(S0_M23).on(S0_V1.pr(S1_W2.rqst_usr_cd).eq(S0_M23.usr_cd)))
					.predicate(p -> p.cutoff$and(S0_M23.usr_nm.like(bind("rqst_usr_nm")))),
				when(boundOr("rsn_nm"))
					.view(v -> v.leftOuterJoin(S0_M25).on(S0_V1.pr(S1_W1.rsn_cd).eq(S0_M25.biz_rsn_cd)))
					.predicate(p -> p.cutoff$and(S0_M25.biz_rsn_nm.like(bind("rsn_nm")))),
				when(boundOr("itm_grp_flg1"))
					.select(DS0C_ITM_GRP, S0_M1.itm_grp_cd1.as("itm_grp_cd1"), S0_MM1.itm_grp_nm.as("itm_grp_nm1"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM1).on(S0_M1.itm_grp_cd1.eq(S0_MM1.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP1.value()).eq(S0_MM1.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M1.itm_grp_cd1.like(bind("itm_grp_cd1"))).cutoff$and(S0_MM1.itm_grp_nm.like(bind("itm_grp_nm1")))),
				when(boundOr("itm_grp_flg2"))
					.select(DS0C_ITM_GRP, S0_M1.itm_grp_cd2.as("itm_grp_cd2"), S0_MM2.itm_grp_nm.as("itm_grp_nm2"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM2).on(S0_M1.itm_grp_cd2.eq(S0_MM2.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP2.value()).eq(S0_MM2.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M1.itm_grp_cd2.like(bind("itm_grp_cd2"))).cutoff$and(S0_MM2.itm_grp_nm.like(bind("itm_grp_nm2")))),
				when(boundOr("itm_grp_flg3"))
					.select(DS0C_ITM_GRP, S0_M1.itm_grp_cd3.as("itm_grp_cd3"), S0_MM3.itm_grp_nm.as("itm_grp_nm3"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM3).on(S0_M1.itm_grp_cd3.eq(S0_MM3.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP3.value()).eq(S0_MM3.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M1.itm_grp_cd3.like(bind("itm_grp_cd3"))).cutoff$and(S0_MM3.itm_grp_nm.like(bind("itm_grp_nm3")))),
				when(boundOr("itm_grp_flg4"))
					.select(DS0C_ITM_GRP, S0_M1.itm_grp_cd4.as("itm_grp_cd4"), S0_MM4.itm_grp_nm.as("itm_grp_nm4"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM4).on(S0_M1.itm_grp_cd4.eq(S0_MM4.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP4.value()).eq(S0_MM4.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M1.itm_grp_cd4.like(bind("itm_grp_cd4"))).cutoff$and(S0_MM4.itm_grp_nm.like(bind("itm_grp_nm4")))),
				when(boundOr("itm_grp_flg5"))
					.select(DS0C_ITM_GRP, S0_M1.itm_grp_cd5.as("itm_grp_cd5"), S0_MM5.itm_grp_nm.as("itm_grp_nm5"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM5).on(S0_M1.itm_grp_cd5.eq(S0_MM5.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP5.value()).eq(S0_MM5.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M1.itm_grp_cd5.like(bind("itm_grp_cd5"))).cutoff$and(S0_MM5.itm_grp_nm.like(bind("itm_grp_nm5")))),
				when(boundOr("itm_grp_flg6"))
					.select(DS0C_ITM_GRP, S0_M1.itm_grp_cd6.as("itm_grp_cd6"), S0_MM6.itm_grp_nm.as("itm_grp_nm6"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM6).on(S0_M1.itm_grp_cd6.eq(S0_MM6.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP6.value()).eq(S0_MM6.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M1.itm_grp_cd6.like(bind("itm_grp_cd6"))).cutoff$and(S0_MM6.itm_grp_nm.like(bind("itm_grp_nm6")))),
				when(boundOr("itm_grp_flg7"))
					.select(DS0C_ITM_GRP, S0_M1.itm_grp_cd7.as("itm_grp_cd7"), S0_MM7.itm_grp_nm.as("itm_grp_nm7"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM7).on(S0_M1.itm_grp_cd7.eq(S0_MM7.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP7.value()).eq(S0_MM7.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M1.itm_grp_cd7.like(bind("itm_grp_cd7"))).cutoff$and(S0_MM7.itm_grp_nm.like(bind("itm_grp_nm7")))),
				when(boundOr("itm_grp_flg8"))
					.select(DS0C_ITM_GRP, S0_M1.itm_grp_cd8.as("itm_grp_cd8"), S0_MM8.itm_grp_nm.as("itm_grp_nm8"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM8).on(S0_M1.itm_grp_cd8.eq(S0_MM8.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP8.value()).eq(S0_MM8.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M1.itm_grp_cd8.like(bind("itm_grp_cd8"))).cutoff$and(S0_MM8.itm_grp_nm.like(bind("itm_grp_nm8")))),
				when(boundOr("itm_grp_flg9"))
					.select(DS0C_ITM_GRP, S0_M1.itm_grp_cd9.as("itm_grp_cd9"), S0_MM9.itm_grp_nm.as("itm_grp_nm9"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM9).on(S0_M1.itm_grp_cd9.eq(S0_MM9.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP9.value()).eq(S0_MM9.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M1.itm_grp_cd9.like(bind("itm_grp_cd9"))).cutoff$and(S0_MM9.itm_grp_nm.like(bind("itm_grp_nm9")))),
				when(boundOr("itm_grp_flg10"))
					.select(DS0C_ITM_GRP, S0_M1.itm_grp_cd10.as("itm_grp_cd10"), S0_MM10.itm_grp_nm.as("itm_grp_nm10"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM10).on(S0_M1.itm_grp_cd10.eq(S0_MM10.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP10.value()).eq(S0_MM10.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M1.itm_grp_cd10.like(bind("itm_grp_cd10"))).cutoff$and(S0_MM10.itm_grp_nm.like(bind("itm_grp_nm10"))))
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
							r.setNumberNE("trd_unit_conv_base_qty", m.conv_base_qty());
							r.setNumberNE("trd_unit_conv_qty", m.conv_qty());
							r.setNumberNE("trd_unit_dec_place", m.dec_place());
							r.setStringNE("trd_unit_rnd_typ", m.rnd_typ());
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
						.add(MAM_UNIT_R.class, r -> toCondition(
							r.getStringNE("pckg_unit_cd")
						))
						.addSelect(m -> toArray(
							m.unit_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("pckg_unit_nm", m.unit_nm());
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
						.add(MAM_LG_GRP_R.class, r -> toCondition(
							r.getStringNE("lg_grp_cd")
						))
						.addSelect(m -> toArray(
							m.lg_grp_nm,
							m.pick_list_flg,
							m.ship_inst_flg,
							m.ship_slip_flg
						))
						.addMap((r, m) -> {
							r.setStringNE("lg_grp_nm", m.lg_grp_nm());
							r.setBooleanNE("immd_dlv_prnt_flg", m.ship_slip_flg());
							r.setBooleanNE("immd_pick_prnt_flg", m.pick_list_flg());
							r.setBooleanNE("immd_inst_prnt_flg", m.ship_inst_flg());
					}),
					j -> j
						.add(MAM_LOC_R.class, r -> toCondition(
							r.getStringNE("gi_loc_cd")
						))
						.addSelect(m -> toArray(
							m.loc_nm,
							m.site_cd,
							m.sppl_cd,
							m.str_ln_tgt_flg
						))
						.addMap((r, m) -> {
							r.setStringNE("gi_loc_nm", m.loc_nm());
							r.setBooleanNE("gi_str_ln_tgt_flg", m.str_ln_tgt_flg());
							r.setStringNE("gi_sppl_cd", m.sppl_cd());
							r.setStringNE("gi_site_cd", m.site_cd());
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
							r.setStringNE("gi_str_ln_nm", m.str_ln_nm());
					}),
					j -> j
						.add(MAM_BP_R.class, r -> toCondition(
							r.getStringNE("gi_stk_arrv_bp_cd")
						))
						.addSelect(m -> toArray(
							m.bp_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("gi_stk_arrv_bp_nm", m.bp_nm());
					}),
					j -> j
						.add(MAM_SITE_R.class, r -> toCondition(
							r.getStringNE("gi_site_cd")
						))
						.addSelect(m -> toArray(
							m.site_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("gi_site_nm", m.site_nm());
					}),
					j -> j
						.add(MAM_LOC_R.class, r -> toCondition(
							r.getStringNE("gr_loc_cd")
						))
						.addSelect(m -> toArray(
							m.loc_nm,
							m.site_cd,
							m.sppl_cd,
							m.str_ln_tgt_flg
						))
						.addMap((r, m) -> {
							r.setStringNE("gr_loc_nm", m.loc_nm());
							r.setBooleanNE("gr_str_ln_tgt_flg", m.str_ln_tgt_flg());
							r.setStringNE("gr_sppl_cd", m.sppl_cd());
							r.setStringNE("gr_site_cd", m.site_cd());
					}),
					j -> j
						.add(MAM_STR_LN_R.class, r -> toCondition(
							r.getStringNE("gr_loc_cd"),
							r.getStringNE("gr_str_ln_cd")
						))
						.addSelect(m -> toArray(
							m.str_ln_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("gr_str_ln_nm", m.str_ln_nm());
					}),
					j -> j
						.add(MAM_BP_R.class, r -> toCondition(
							r.getStringNE("gr_stk_arrv_bp_cd")
						))
						.addSelect(m -> toArray(
							m.bp_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("gr_stk_arrv_bp_nm", m.bp_nm());
					}),
					j -> j
						.add(MAM_SITE_R.class, r -> toCondition(
							r.getStringNE("gr_site_cd")
						))
						.addSelect(m -> toArray(
							m.site_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("gr_site_nm", m.site_nm());
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
							r.getStringNE("stk_bp_cd")
						))
						.addSelect(m -> toArray(
							m.bp_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("stk_bp_nm", m.bp_nm());
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
						.add(MAM_BIZ_RSN_R.class, r -> toCondition(
							r.getStringNE("rsn_cd")
						))
						.addSelect(m -> toArray(
							m.acxfr_gi_flg,
							m.biz_rsn_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("rsn_nm", m.biz_rsn_nm());
							r.setBooleanNE("acxfr_gi_flg", m.acxfr_gi_flg());
					}),
					j -> j
						.add(MAM_BP_R.class, r -> toCondition(
							r.getStringNE("gi_sppl_cd")
						))
						.addSelect(m -> toArray(
							m.bp_nm,
							m.onr_prsppl_flg,
							m.prov_basis_typ
						))
						.addMap((r, m) -> {
							r.setStringNE("gi_sppl_nm", m.bp_nm());
							r.setBooleanNE("gi_onr_prsppl_flg", m.onr_prsppl_flg());
							r.setStringNE("gi_prov_basis_typ", m.prov_basis_typ());
					}),
					j -> j
						.add(MAM_BP_R.class, r -> toCondition(
							r.getStringNE("gr_sppl_cd")
						))
						.addSelect(m -> toArray(
							m.bp_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("gr_sppl_nm", m.bp_nm());
					}),
					j -> j
						.add(MAVM_ITM_UNIT_R.class, r -> toCondition(
							r.getStringNE("itm_cd"),
							r.getStringNE("itm_sub1"),
							r.getStringNE("itm_sub2"),
							r.getStringNE("itm_sub3"),
							r.getStringNE("pckg_unit_cd")
						))
						.addSelect(m -> toArray(
							m.conv_base_qty,
							m.conv_qty,
							m.dec_place
						))
						.addMap((r, m) -> {
							r.setNumberNE("pckg_unit_conv_base_qty", m.conv_base_qty());
							r.setNumberNE("pckg_unit_conv_qty", m.conv_qty());
							r.setNumberNE("pckg_unit_dec_place", m.dec_place());
					}),
					j -> j
						.add(MAM_UNIT_R.class, r -> toCondition(
							r.getStringNE("trd_unit_cd")
						))
						.addSelect(m -> toArray(
							m.unit_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("schd_unit_nm", m.unit_nm());
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
							m.dec_place
						))
						.addMap((r, m) -> {
							r.setNumberNE("schd_unit_dec_place", m.dec_place());
					})
				)
			);
	}
	
	/**
	 * -- MSBEL1050_MST_XFR_ALLOC_STS_Query_S02
	 */
	static MCQueryPlan MSBEL1050_MST_XFR_ALLOC_STS_S02() {
		MCTempView S0_T1 = createTempView("T1");
		MST_XFR_INST_R S0_T7 = MST_XFR_INST_R.create("T7");
		MST_PROV_SCHD_R S0_T8 = MST_PROV_SCHD_R.create("T8");
		MST_PROV_SCHD_R S0_T9 = MST_PROV_SCHD_R.create("T9");
		MST_DLV_SLIP_R S0_T10 = MST_DLV_SLIP_R.create("T10");
		MSVT_WRK_SNO_R S0_T4 = MSVT_WRK_SNO_R.create("T4");
		MAM_ITM_R S0_M1 = MAM_ITM_R.create("M1");
		MAM_ITM_TYP_D_R S0_M2 = MAM_ITM_TYP_D_R.create("M2");
		MAM_TRD_R S0_M3 = MAM_TRD_R.create("M3");
		MAM_SUNDRY_ITM_R S0_M4 = MAM_SUNDRY_ITM_R.create("M4");
		MAM_UNIT_R S0_M5 = MAM_UNIT_R.create("M5");
		MAM_UNIT_R S0_M7 = MAM_UNIT_R.create("M7");
		MAM_UNIT_R S0_M9 = MAM_UNIT_R.create("M9");
		MAM_WG_R S0_M11 = MAM_WG_R.create("M11");
		MAM_LG_GRP_R S0_M12 = MAM_LG_GRP_R.create("M12");
		MAM_LOC_R S0_M13 = MAM_LOC_R.create("M13");
		MAM_STR_LN_R S0_M14 = MAM_STR_LN_R.create("M14");
		MAM_BP_R S0_M15 = MAM_BP_R.create("M15");
		MAM_SITE_R S0_M16 = MAM_SITE_R.create("M16");
		MAM_LOC_R S0_M17 = MAM_LOC_R.create("M17");
		MAM_STR_LN_R S0_M18 = MAM_STR_LN_R.create("M18");
		MAM_BP_R S0_M19 = MAM_BP_R.create("M19");
		MAM_SITE_R S0_M20 = MAM_SITE_R.create("M20");
		MAM_STK_GD_R S0_M21 = MAM_STK_GD_R.create("M21");
		MAM_BP_R S0_M22 = MAM_BP_R.create("M22");
		MAM_BIZ_RSN_R S0_M25 = MAM_BIZ_RSN_R.create("M25");
		MAM_DPT_R S0_M26 = MAM_DPT_R.create("M26");
		MAM_USR_R S0_M27 = MAM_USR_R.create("M27");
		MAM_DPT_R S0_M28 = MAM_DPT_R.create("M28");
		MAM_ITM_LG_GRP_R S0_M36 = MAM_ITM_LG_GRP_R.create("M36");
		MAM_LOC_R S0_M37 = MAM_LOC_R.create("M37");
		MAM_ITM_GRP_R S0_MM1 = MAM_ITM_GRP_R.create("MM1");
		MAM_ITM_GRP_R S0_MM2 = MAM_ITM_GRP_R.create("MM2");
		MAM_ITM_GRP_R S0_MM3 = MAM_ITM_GRP_R.create("MM3");
		MAM_ITM_GRP_R S0_MM4 = MAM_ITM_GRP_R.create("MM4");
		MAM_ITM_GRP_R S0_MM5 = MAM_ITM_GRP_R.create("MM5");
		MAM_ITM_GRP_R S0_MM6 = MAM_ITM_GRP_R.create("MM6");
		MAM_ITM_GRP_R S0_MM7 = MAM_ITM_GRP_R.create("MM7");
		MAM_ITM_GRP_R S0_MM8 = MAM_ITM_GRP_R.create("MM8");
		MAM_ITM_GRP_R S0_MM9 = MAM_ITM_GRP_R.create("MM9");
		MAM_ITM_GRP_R S0_MM10 = MAM_ITM_GRP_R.create("MM10");
		MST_XFR_ALLOC_STS_R S1_V1 = MST_XFR_ALLOC_STS_R.create("V1");
		MST_XFR_INST_D_R S1_V6 = MST_XFR_INST_D_R.create("V6");
		MST_XFR_SCHD_R S1_V2 = MST_XFR_SCHD_R.create("V2");
		MAM_USR_R S1_M23 = MAM_USR_R.create("M23A");
		MAM_DPT_R S1_M24 = MAM_DPT_R.create("M24A");
		MAVM_RD_LOC_R S2_V1 = MAVM_RD_LOC_R.create("V1");
		MAVM_RD_LG_GRP_R S3_V2 = MAVM_RD_LG_GRP_R.create("V2");
		MAVM_RD_LOC_R S4_V3 = MAVM_RD_LOC_R.create("V3");
		MST_XFR_ALLOC_STS_SV_R S5_T1A = MST_XFR_ALLOC_STS_SV_R.create("T1A");
		MST_XFR_SCHD_R S5_T2A = MST_XFR_SCHD_R.create("T2A");
		MAM_USR_R S6_M23A = MAM_USR_R.create("M23A");
		MAM_DPT_R S8_M24A = MAM_DPT_R.create("M24A");
		MSW_XFR_ALLOC_STS_KEY_R xfrAllocStsKeyW = MSW_XFR_ALLOC_STS_KEY_R.create("xfrAllocStsKeyW");
		
		MCDynamicSQLID DS0C_ITM_GRP = createDynamicSQLID("DS0C_ITM_GRP");
		MCDynamicSQLID DS0C_XFR_ALLOC_STS_KEY = createDynamicSQLID("DS0C_XFR_ALLOC_STS_KEY");
		
		return createQueryPlan()
			.setQuery(
				sql("MSBEL1050_MST_XFR_ALLOC_STS_Query_S02")
					.mainQuery()
					.select(
						S0_T1.pr(S1_V1.trd_cd),
						S0_T1.pr(S1_V1.pr_sts_typ),
						S0_T1.pr("itm_cd"),
						S0_T1.pr("itm_sub1"),
						S0_T1.pr("itm_sub2"),
						S0_T1.pr("itm_sub3"),
						coalesce(
							S0_M4.itm_nm,
							S0_M1.itm_nm
						).as("itm_nm"),
						S0_M1.sundry_itm_flg,
						S0_M1.lot_mng_typ,
						S0_M1.sublot_mng_typ,
						S0_M1.sno1_mng_typ,
						S0_M1.sno2_mng_typ,
						S0_M1.sno3_mng_typ,
						S0_M1.sno4_mng_typ,
						S0_T1.pr(S1_V1.not_lot_mix_flg),
						S0_T1.pr(S1_V1.not_sublot_mix_flg),
						S0_T1.pr(S1_V1.lot_no),
						S0_T1.pr(S1_V1.sublot_no),
						S0_T1.pr(S1_V1.sno1),
						S0_T1.pr(S1_V1.sno1_null_flg),
						S0_T1.pr(S1_V1.sno2),
						S0_T1.pr(S1_V1.sno2_null_flg),
						S0_T1.pr(S1_V1.sno3),
						S0_T1.pr(S1_V1.sno3_null_flg),
						S0_T1.pr(S1_V1.sno4),
						S0_T1.pr(S1_V1.sno4_null_flg),
						S0_T1.pr(S1_V1.alloc_sno1),
						S0_T1.pr(S1_V1.alloc_sno2),
						S0_T1.pr(S1_V1.alloc_sno3),
						S0_T1.pr(S1_V1.alloc_sno4),
						S0_M1.ver_flg.as("def_ver_flg"),
						S0_T1.pr(S1_V1.ver_no),
						S0_T1.pr(S1_V1.abort_flg),
						S0_T1.pr(S1_V1.fix_flg),
						S0_T1.pr(S1_V1.cmpl_flg),
						S0_T1.pr(S1_V1.trd_unit_cd),
						S0_T1.pr(S1_V1.trd_unit_qty),
						S0_T1.pr(S1_V1.base_unit_cd),
						S0_T1.pr(S1_V1.base_unit_qty).as("base_unit_qty"),
						S0_T1.pr("base_unit_schd_qty").as("base_unit_schd_qty"),
						S0_T1.pr("base_unit_inst_qty").as("base_unit_inst_qty"),
						S0_T1.pr("base_unit_act_qty").as("base_unit_act_qty"),
						MAPA_CALC$F_CALC_PER(
							S0_T1.pr(S1_V1.base_unit_qty),
							S0_T1.pr("base_unit_act_qty")
						).as("pr_rate"),
						S0_M1.pckg_unit_cd,
						value((MCNumber) null).as("pckg_unit_qty"),
						S0_T1.pr("schd_unit_cd").as("schd_unit_cd"),
						S0_T1.pr("schd_qty").as("schd_qty"),
						S0_M1.cont_fctr_flg,
						S0_M1.std_cont_fctr,
						S0_M1.cont_fctr_unit_cd,
						S0_M1.cont_fctr_rnd_typ,
						S0_M1.cont_fctr_dec_place,
						S0_T1.pr("xfr_rqst_dt"),
						coalesce(
							S0_T7.xfr_schd_dt,
							S0_T1.pr("xfr_schd_dt")
						).as("xfr_schd_dt"),
						S0_T7.xfr_inst_dt,
						value((MCDate) null).as("xfr_act_dt"),
						value((MCDate) null).as("xfr_ac_dt"),
						value((MCDate) null).as("can_ac_dt"),
						S0_T1.pr(S1_V1.wg_cd),
						S0_T1.pr(S1_V1.lg_grp_cd),
						S0_T1.pr(S1_V1.gi_loc_cd),
						S0_T1.pr(S1_V1.gi_str_ln_cd),
						S0_T1.pr(S1_V1.gi_stk_arrv_bp_cd),
						S0_T1.pr(S1_V1.gr_loc_cd),
						S0_T1.pr(S1_V1.gr_str_ln_cd),
						S0_T1.pr(S1_V1.gr_stk_arrv_bp_cd),
						S0_T1.pr(S1_V1.gd_cd),
						S0_T1.pr(S1_V1.quality_typ),
						S0_T1.pr(S1_V1.stk_insp_typ),
						S0_T1.pr(S1_V1.stk_id_typ),
						S0_T1.pr(S1_V1.stk_bp_cd),
						S0_T1.pr(S1_V2.rqst_usr_cd),
						S0_T1.pr(S1_V2.rqst_dpt_cd),
						S0_T1.pr("rqst_usr_nm"),
						S0_T1.pr("rqst_dpt_nm"),
						S0_T7.inst_usr_cd,
						S0_T7.inst_dpt_cd,
						S0_M28.dpt_nm.as("inst_dpt_nm"),
						nullValue().as("act_usr_cd"),
						nullValue().as("act_usr_nm"),
						nullValue().as("act_dpt_cd"),
						nullValue().as("act_dpt_nm"),
						S0_T1.pr(S1_V1.ship_inst_typ),
						S0_T1.pr(S1_V1.rsn_cd),
						S0_T1.pr(S1_V1.bd_dpt_cd),
						S0_M26.dpt_nm.as("bd_dpt_nm"),
						S0_T7.pick_prnt_flg,
						S0_T7.inst_prnt_flg,
						S0_T10.slip_prnt_flg.as("dlv_prnt_flg"),
						S0_T1.pr(S1_V1.alloc_flg),
						S0_M1.skip_chk_ship_flg.as("skip_chk_ship_flg"),
						nullValue().as("intr_rmrks"),
						S0_T7.trd_rmrks.as("trd_rmrks"),
						S0_T7.inst_rmrks.as("inst_rmrks"),
						S0_T7.sub_char1.as("h_sub_char1"),
						S0_T7.sub_char2.as("h_sub_char2"),
						S0_T7.sub_char3.as("h_sub_char3"),
						S0_T1.pr("intr_d_rmrks").as("intr_d_rmrks"),
						S0_T1.pr("trd_d_rmrks").as("trd_d_rmrks"),
						S0_T1.pr("inst_d_rmrks").as("inst_d_rmrks"),
						S0_T1.pr("d_sub_char1").as("d_sub_char1"),
						S0_T1.pr("d_sub_char2").as("d_sub_char2"),
						S0_T1.pr("d_sub_char3").as("d_sub_char3"),
						S0_T1.pr(S1_V2.rqst_cnt_rmrks),
						S0_T1.pr(S1_V2.ship_cnt_rmrks),
						S0_T1.pr("schd_intr_rmrks").as("schd_intr_rmrks"),
						S0_T1.pr(S1_V2.xfr_src_typ),
						S0_T1.pr(S1_V2.xfr_src_no),
						S0_T1.pr(S1_V1.xfr_schd_no),
						S0_T1.pr(S1_V1.xfr_alloc_sts_no),
						S0_T1.pr(S1_V1.dlv_slip_no),
						S0_T1.pr(S1_V1.dlv_slip_d_no),
						S0_T1.pr(S1_V6.xfr_inst_no),
						S0_T1.pr(S1_V1.xfr_inst_d_no),
						nullValue().as("xfr_act_no"),
						nullValue().as("xfr_act_d_no"),
						S0_T1.pr(S1_V2.slo_no),
						S0_T1.pr(S1_V2.mfg_inst_no),
						S0_T1.pr(S1_V2.oper_inst_no),
						S0_T1.pr(S1_V1.io_schd_pr_no),
						S0_T1.pr(S1_V1.prov_typ),
						S0_T1.pr(S1_V1.prov_basis_typ),
						S0_T1.pr(S1_V1.ret_prov_typ),
						S0_T1.pr(S1_V1.ret_prov_basis_typ),
						S0_T8.prov_schd_no.as("prov_schd_no"),
						S0_T9.prov_schd_no.as("ret_prov_schd_no"),
						S0_M1.itm_typ,
						S0_M1.itm_typ_d_cd,
						S0_T1.pr(S1_V1.ins_usr_id),
						S0_T1.pr(S1_V1.ins_usr_nm),
						S0_T1.pr(S1_V1.ins_func_id),
						S0_T1.pr(S1_V1.ins_ts),
						S0_T1.pr("alloc_sts_upd_cntr").as("alloc_sts_upd_cntr"),
						S0_T7.upd_cntr.as("inst_upd_cntr"),
						S0_T1.pr(S1_V1.upd_usr_id),
						S0_T1.pr(S1_V1.upd_usr_nm),
						S0_T1.pr(S1_V1.upd_func_id),
						S0_T1.pr(S1_V1.upd_ts),
						S0_T1.pr(S1_V1.upd_srv_req_no),
						S0_T1.pr("inst_disp_seq").as("inst_disp_seq"),
						value((MCNumber) null).as("act_disp_seq"),
						S0_T1.pr(S1_V1.wms_flg),
						S0_T1.pr("base_dlv_slip_no"),
						S0_T1.pr("base_prov_act_no"),
						S0_T1.pr("base_ac_dt"),
						addDynamicSelect(DS0C_ITM_GRP)
					)
					.from(
						subQuery()
						.select(
							S1_V1.trd_cd,
							S1_V1.pr_sts_typ,
							coalesce(
								S1_V6.itm_cd,
								S1_V2.itm_cd
							).as("itm_cd"),
							coalesce(
								S1_V6.itm_sub1,
								S1_V2.itm_sub1
							).as("itm_sub1"),
							coalesce(
								S1_V6.itm_sub2,
								S1_V2.itm_sub2
							).as("itm_sub2"),
							coalesce(
								S1_V6.itm_sub3,
								S1_V2.itm_sub3
							).as("itm_sub3"),
							S1_V1.not_lot_mix_flg,
							S1_V1.not_sublot_mix_flg,
							S1_V1.lot_no,
							S1_V1.sublot_no,
							S1_V1.ver_no,
							S1_V1.sno1,
							S1_V1.sno1_null_flg,
							S1_V1.sno2,
							S1_V1.sno2_null_flg,
							S1_V1.sno3,
							S1_V1.sno3_null_flg,
							S1_V1.sno4,
							S1_V1.sno4_null_flg,
							S1_V1.alloc_sno1,
							S1_V1.alloc_sno2,
							S1_V1.alloc_sno3,
							S1_V1.alloc_sno4,
							S1_V1.abort_flg,
							S1_V1.fix_flg,
							S1_V1.cmpl_flg,
							S1_V1.trd_unit_cd,
							S1_V1.trd_unit_qty,
							S1_V1.base_unit_cd,
							S1_V1.base_unit_qty,
							cases()
								.when(
									S1_V1.xfr_schd_no.eq(value(MAC_STR.NULL_VAL.value()))
									.or(S1_V1.xfr_schd_no.isNull())
								)
									.then(value(0))
								.otherwise(S1_V2.base_unit_qty).as("base_unit_schd_qty"),
							cases()
								.when(
									S1_V1.xfr_inst_d_no.eq(value(MAC_STR.NULL_VAL.value()))
									.or(S1_V1.xfr_inst_d_no.isNull())
								)
									.then(value(0))
								.otherwise(S1_V1.base_unit_qty).as("base_unit_inst_qty"),
							S1_V1.act_qty.as("base_unit_act_qty"),
							S1_V2.trd_unit_cd.as("schd_unit_cd"),
							S1_V2.trd_unit_qty.as("schd_qty"),
							coalesce(
								S1_V2.gi_rqst_tm,
								S1_V2.gr_rqst_tm
							).as("xfr_rqst_dt"),
							S1_V1.xfr_schd_dt.as("xfr_schd_dt"),
							S1_V1.wg_cd,
							S1_V1.lg_grp_cd,
							S1_V1.gi_loc_cd,
							S1_V1.gi_str_ln_cd,
							S1_V1.gi_stk_arrv_bp_cd,
							S1_V1.gr_loc_cd,
							S1_V1.gr_str_ln_cd,
							S1_V1.gr_stk_arrv_bp_cd,
							S1_V1.gd_cd,
							S1_V1.quality_typ,
							S1_V1.stk_insp_typ,
							S1_V1.stk_id_typ,
							S1_V1.stk_bp_cd,
							S1_V2.rqst_usr_cd,
							S1_V2.rqst_dpt_cd,
							S1_V2.rcpt_dt,
							S1_V1.ship_inst_typ,
							S1_V1.rsn_cd,
							S1_V1.bd_dpt_cd,
							S1_V1.alloc_flg,
							S1_V1.prov_typ,
							S1_V1.prov_basis_typ,
							S1_V1.ret_prov_typ,
							S1_V1.ret_prov_basis_typ,
							S1_V1.intr_d_rmrks.as("intr_d_rmrks"),
							S1_V1.trd_d_rmrks.as("trd_d_rmrks"),
							S1_V1.inst_d_rmrks.as("inst_d_rmrks"),
							S1_V1.sub_char1.as("d_sub_char1"),
							S1_V1.sub_char2.as("d_sub_char2"),
							S1_V1.sub_char3.as("d_sub_char3"),
							S1_V2.rqst_cnt_rmrks,
							S1_V2.ship_cnt_rmrks,
							S1_V2.intr_rmrks.as("schd_intr_rmrks"),
							S1_V2.xfr_src_typ,
							S1_V2.xfr_src_no,
							S1_V1.xfr_schd_no,
							S1_V1.xfr_alloc_sts_no,
							S1_V1.dlv_slip_no,
							S1_V1.dlv_slip_seq,
							S1_V1.dlv_slip_d_no,
							S1_V1.xfr_inst_d_no,
							S1_V6.xfr_inst_no,
							S1_V2.slo_no,
							S1_V2.mfg_inst_no,
							S1_V2.oper_inst_no,
							S1_V1.io_schd_pr_no,
							S1_V2.rqst_mod_flg,
							S1_V1.ins_usr_id,
							S1_V1.ins_usr_nm,
							S1_V1.ins_func_id,
							S1_V1.ins_ts,
							S1_V1.upd_cntr.as("alloc_sts_upd_cntr"),
							S1_V1.upd_usr_id,
							S1_V1.upd_usr_nm,
							S1_V1.upd_func_id,
							S1_V1.upd_ts,
							S1_V1.upd_srv_req_no,
							S1_V1.disp_seq.as("inst_disp_seq"),
							S1_V1.wms_flg,
							coalesce(
									S1_V6.base_dlv_slip_no,
									S1_V2.base_dlv_slip_no
								).as("base_dlv_slip_no"),
							coalesce(
									S1_V6.base_prov_act_no,
									S1_V2.base_prov_act_no
								).as("base_prov_act_no"),
							coalesce(
									S1_V6.base_ac_dt,
									S1_V2.base_ac_dt
								).as("base_ac_dt"),
							S1_M23.usr_nm.as("rqst_usr_nm"),
							S1_M24.dpt_nm.as("rqst_dpt_nm")
						)
						.from(
							S1_V1
							.leftOuterJoin(S1_V6).on(S1_V1.xfr_inst_d_no.eq(S1_V6.xfr_inst_d_no))
							.leftOuterJoin(S1_V2).on(S1_V1.xfr_schd_no.eq(S1_V2.xfr_schd_no))
							.leftOuterJoin(S1_M23).on(S1_V2.rqst_usr_cd.eq(S1_M23.usr_cd))
							.leftOuterJoin(S1_M24).on(
									S1_V2.rqst_dpt_cd.eq(S1_M24.dpt_cd)
									.and(S1_V2.rcpt_dt.between(S1_M24.st_dt, S1_M24.end_dt)
								)
							)
							.addDynamicView(DS0C_XFR_ALLOC_STS_KEY)
						)
						.where(
							value(0).eq(value(0))
							.and(
								value(true).eq(value(false))
								.cutoff$or(S1_V1.pr_sts_typ.eq(bind("pr_sts_not_inst")))
								.cutoff$or(S1_V1.pr_sts_typ.eq(bind("pr_sts_inst")))
								.cutoff$or(S1_V1.pr_sts_typ.eq(bind("pr_sts_part_xfr")))
								.cutoff$or(S1_V1.pr_sts_typ.eq(bind("pr_sts_cmpl")))
							)
							.cutoff$and(S1_V1.ship_inst_typ.like(bind("ship_inst_typ")))
							.cutoff$and(S1_V1.alloc_flg.eq(bind("alloc_true")))
							.cutoff$and(S1_V1.alloc_flg.neq(bind("not_alloc_true")))
							.cutoff$and(
								MAPA_CALC$F_CALC_PER(
									S1_V1.base_unit_qty,
									S1_V1.act_qty
								).gte(bind("pr_rate_fr"))
							)
							.cutoff$and(
								MAPA_CALC$F_CALC_PER(
									S1_V1.base_unit_qty,
									S1_V1.act_qty
								).lte(bind("pr_rate_to"))
							)
							.cutoff$and(S1_V1.wg_cd.like(bind("wg_cd")))
							.cutoff$and(S1_V1.lg_grp_cd.like(bind("lg_grp_cd")))
							.cutoff$and(S1_V1.gi_loc_cd.like(bind("gi_loc_cd")))
							.cutoff$and(S1_V1.gi_str_ln_cd.like(bind("gi_str_ln_cd")))
							.cutoff$and(S1_V1.gi_stk_arrv_bp_cd.like(bind("gi_stk_arrv_bp_cd")))
							.cutoff$and(S1_V1.gr_loc_cd.like(bind("gr_loc_cd")))
							.cutoff$and(S1_V1.gr_str_ln_cd.like(bind("gr_str_ln_cd")))
							.cutoff$and(S1_V1.gr_stk_arrv_bp_cd.like(bind("gr_stk_arrv_bp_cd")))
							.cutoff$and(S1_V1.ver_no.like(bind("ver_no")))
							.cutoff$and(S1_V1.lot_no.like(bind("lot_no")))
							.cutoff$and(S1_V1.sublot_no.like(bind("sublot_no")))
							.cutoff$and(S1_V1.sno1.like(bind("sno1")))
							.cutoff$and(S1_V1.sno2.like(bind("sno2")))
							.cutoff$and(S1_V1.sno3.like(bind("sno3")))
							.cutoff$and(S1_V1.sno4.like(bind("sno4")))
							.cutoff$and(S1_V1.abort_flg.neq(bind("abort_false")))
							.cutoff$and(S1_V1.trd_unit_cd.like(bind("trd_unit_cd")))
							.cutoff$and(S1_V1.base_unit_cd.like(bind("base_unit_cd")))
							.cutoff$and(S1_V1.gd_cd.like(bind("gd_cd")))
							.cutoff$and(S1_V1.quality_typ.like(bind("quality_typ")))
							.cutoff$and(S1_V1.stk_insp_typ.like(bind("stk_insp_typ")))
							.cutoff$and(S1_V1.stk_id_typ.like(bind("stk_id_typ")))
							.cutoff$and(S1_V1.stk_bp_cd.like(bind("stk_bp_cd")))
							.cutoff$and(S1_V1.rsn_cd.like(bind("rsn_cd")))
							.cutoff$and(S1_V1.bd_dpt_cd.like(bind("bd_dpt_cd")))
							.cutoff$and(S1_V1.trd_cd.like(bind("trd_cd")))
							.cutoff$and(S1_V1.intr_d_rmrks.like(bind("intr_d_rmrks")))
							.cutoff$and(S1_V1.trd_d_rmrks.like(bind("trd_d_rmrks")))
							.cutoff$and(S1_V1.inst_d_rmrks.like(bind("inst_d_rmrks")))
							.cutoff$and(S1_V1.sub_char1.like(bind("d_sub_char1")))
							.cutoff$and(S1_V1.sub_char2.like(bind("d_sub_char2")))
							.cutoff$and(S1_V1.sub_char3.like(bind("d_sub_char3")))
							.cutoff$and(S1_V1.xfr_alloc_sts_no.like(bind("xfr_alloc_sts_no")))
							.cutoff$and(S1_V1.dlv_slip_no.like(bind("dlv_slip_no")))
							.cutoff$and(S1_V1.dlv_slip_d_no.like(bind("dlv_slip_d_no")))
							.cutoff$and(S1_V6.xfr_inst_no.like(bind("xfr_inst_no")))
							.cutoff$and(S1_V1.xfr_inst_d_no.like(bind("xfr_inst_d_no")))
							.cutoff$and(S1_V1.io_schd_pr_no.like(bind("io_schd_pr_no")))
							.cutoff$and(S1_V2.rqst_usr_cd.like(bind("rqst_usr_cd")))
							.cutoff$and(S1_M23.usr_nm.like(bind("rqst_usr_nm")))
							.cutoff$and(S1_V2.rqst_dpt_cd.like(bind("rqst_dpt_cd")))
							.cutoff$and(S1_M24.dpt_nm.like(bind("rqst_dpt_nm")))
							.cutoff$and(S1_V2.rqst_mod_flg.eq(bind("rqst_mod_true")))
							.cutoff$and(S1_V2.rqst_cnt_rmrks.like(bind("rqst_cnt_rmrks")))
							.cutoff$and(S1_V2.ship_cnt_rmrks.like(bind("ship_cnt_rmrks")))
							.cutoff$and(S1_V2.intr_rmrks.like(bind("schd_intr_rmrks")))
							.cutoff$and(S1_V2.xfr_src_typ.like(bind("xfr_src_typ")))
							.cutoff$and(S1_V2.xfr_src_no.like(bind("xfr_src_no")))
							.cutoff$and(S1_V1.xfr_schd_no.like(bind("xfr_schd_no")))
							.cutoff$and(S1_V2.slo_no.like(bind("slo_no")))
							.cutoff$and(S1_V2.mfg_inst_no.like(bind("mfg_inst_no")))
							.cutoff$and(S1_V2.oper_inst_no.like(bind("oper_inst_no")))
						)
						.union(
							subQuery()
							.select(
								S1_V1.trd_cd,
								S1_V1.pr_sts_typ,
								coalesce(
									S1_V6.itm_cd,
									S1_V2.itm_cd
								).as("itm_cd"),
								coalesce(
									S1_V6.itm_sub1,
									S1_V2.itm_sub1
								).as("itm_sub1"),
								coalesce(
									S1_V6.itm_sub2,
									S1_V2.itm_sub2
								).as("itm_sub2"),
								coalesce(
									S1_V6.itm_sub3,
									S1_V2.itm_sub3
								).as("itm_sub3"),
								S1_V1.not_lot_mix_flg,
								S1_V1.not_sublot_mix_flg,
								S1_V1.lot_no,
								S1_V1.sublot_no,
								S1_V1.ver_no,
								S1_V1.sno1,
								S1_V1.sno1_null_flg,
								S1_V1.sno2,
								S1_V1.sno2_null_flg,
								S1_V1.sno3,
								S1_V1.sno3_null_flg,
								S1_V1.sno4,
								S1_V1.sno4_null_flg,
								S1_V1.alloc_sno1,
								S1_V1.alloc_sno2,
								S1_V1.alloc_sno3,
								S1_V1.alloc_sno4,
								S1_V1.abort_flg,
								S1_V1.fix_flg,
								S1_V1.cmpl_flg,
								S1_V1.trd_unit_cd,
								S1_V1.trd_unit_qty,
								S1_V1.base_unit_cd,
								S1_V1.base_unit_qty,
								cases()
									.when(
										S1_V1.xfr_schd_no.eq(value(MAC_STR.NULL_VAL.value()))
										.or(S1_V1.xfr_schd_no.isNull())
									)
										.then(value(0))
									.otherwise(S1_V2.base_unit_qty).as("base_unit_schd_qty"),
								cases()
									.when(
										S1_V1.xfr_inst_d_no.eq(value(MAC_STR.NULL_VAL.value()))
										.or(S1_V1.xfr_inst_d_no.isNull())
									)
										.then(value(0))
									.otherwise(S1_V1.base_unit_qty).as("base_unit_inst_qty"),
								S1_V1.act_qty.as("base_unit_act_qty"),
								S1_V2.trd_unit_cd.as("schd_unit_cd"),
								S1_V2.trd_unit_qty.as("schd_qty"),
								coalesce(
									S1_V2.gi_rqst_tm,
									S1_V2.gr_rqst_tm
								).as("xfr_rqst_dt"),
								S1_V1.xfr_schd_dt.as("xfr_schd_dt"),
								S1_V1.wg_cd,
								S1_V1.lg_grp_cd,
								S1_V1.gi_loc_cd,
								S1_V1.gi_str_ln_cd,
								S1_V1.gi_stk_arrv_bp_cd,
								S1_V1.gr_loc_cd,
								S1_V1.gr_str_ln_cd,
								S1_V1.gr_stk_arrv_bp_cd,
								S1_V1.gd_cd,
								S1_V1.quality_typ,
								S1_V1.stk_insp_typ,
								S1_V1.stk_id_typ,
								S1_V1.stk_bp_cd,
								S1_V2.rqst_usr_cd,
								S1_V2.rqst_dpt_cd,
								S1_V2.rcpt_dt,
								S1_V1.ship_inst_typ,
								S1_V1.rsn_cd,
								S1_V1.bd_dpt_cd,
								S1_V1.alloc_flg,
								S1_V1.prov_typ,
								S1_V1.prov_basis_typ,
								S1_V1.ret_prov_typ,
								S1_V1.ret_prov_basis_typ,
								S1_V1.intr_d_rmrks.as("intr_d_rmrks"),
								S1_V1.trd_d_rmrks.as("trd_d_rmrks"),
								S1_V1.inst_d_rmrks.as("inst_d_rmrks"),
								S1_V1.sub_char1.as("d_sub_char1"),
								S1_V1.sub_char2.as("d_sub_char2"),
								S1_V1.sub_char3.as("d_sub_char3"),
								S1_V2.rqst_cnt_rmrks,
								S1_V2.ship_cnt_rmrks,
								S1_V2.intr_rmrks.as("schd_intr_rmrks"),
								S1_V2.xfr_src_typ,
								S1_V2.xfr_src_no,
								S1_V1.xfr_schd_no,
								S1_V1.xfr_alloc_sts_no,
								S1_V1.dlv_slip_no,
								S1_V1.dlv_slip_seq,
								S1_V1.dlv_slip_d_no,
								S1_V1.xfr_inst_d_no,
								S1_V6.xfr_inst_no,
								S1_V2.slo_no,
								S1_V2.mfg_inst_no,
								S1_V2.oper_inst_no,
								S1_V1.io_schd_pr_no,
								S1_V2.rqst_mod_flg,
								S1_V1.ins_usr_id,
								S1_V1.ins_usr_nm,
								S1_V1.ins_func_id,
								S1_V1.ins_ts,
								S1_V1.upd_cntr.as("alloc_sts_upd_cntr"),
								S1_V1.upd_usr_id,
								S1_V1.upd_usr_nm,
								S1_V1.upd_func_id,
								S1_V1.upd_ts,
								S1_V1.upd_srv_req_no,
								S1_V1.disp_seq.as("inst_disp_seq"),
								S1_V1.wms_flg,
								coalesce(
										S1_V6.base_dlv_slip_no,
										S1_V2.base_dlv_slip_no
									).as("base_dlv_slip_no"),
								coalesce(
										S1_V6.base_prov_act_no,
										S1_V2.base_prov_act_no
									).as("base_prov_act_no"),
								coalesce(
										S1_V6.base_ac_dt,
										S1_V2.base_ac_dt
									).as("base_ac_dt"),
								S1_M23.usr_nm.as("rqst_usr_nm"),
								S1_M24.dpt_nm.as("rqst_dpt_nm")
							)
							.from(
								S1_V1
								.leftOuterJoin(S1_V6).on(S1_V1.xfr_inst_d_no.eq(S1_V6.xfr_inst_d_no))
								.leftOuterJoin(S1_V2).on(S1_V1.xfr_schd_no.eq(S1_V2.xfr_schd_no))
								.leftOuterJoin(S1_M23).on(S1_V2.rqst_usr_cd.eq(S1_M23.usr_cd))
								.leftOuterJoin(S1_M24).on(
										S1_V2.rqst_dpt_cd.eq(S1_M24.dpt_cd)
										.and(S1_V2.rcpt_dt.between(S1_M24.st_dt, S1_M24.end_dt)
									)
								)
								.addDynamicView(DS0C_XFR_ALLOC_STS_KEY)
							)
							.where(
								value(0).eq(value(0))
								.and(
									value(true).eq(value(false))
									.cutoff$or(S1_V1.pr_sts_typ.eq(bind("pr_sts_not_inst")))
									.cutoff$or(S1_V1.pr_sts_typ.eq(bind("pr_sts_inst")))
									.cutoff$or(S1_V1.pr_sts_typ.eq(bind("pr_sts_part_xfr")))
									.cutoff$or(S1_V1.pr_sts_typ.eq(bind("pr_sts_cmpl")))
								)
								.cutoff$and(S1_V1.ship_inst_typ.like(bind("ship_inst_typ")))
								.cutoff$and(S1_V1.alloc_flg.eq(bind("alloc_true")))
								.cutoff$and(S1_V1.alloc_flg.neq(bind("not_alloc_true")))
								.cutoff$and(
									MAPA_CALC$F_CALC_PER(
										S1_V1.base_unit_qty,
										S1_V1.act_qty
									).gte(bind("pr_rate_fr"))
								)
								.cutoff$and(
									MAPA_CALC$F_CALC_PER(
										S1_V1.base_unit_qty,
										S1_V1.act_qty
									).lte(bind("pr_rate_to"))
								)
								.cutoff$and(S1_V1.wg_cd.like(bind("wg_cd")))
								.cutoff$and(S1_V1.lg_grp_cd.like(bind("lg_grp_cd")))
								.cutoff$and(S1_V1.gi_loc_cd.like(bind("gi_loc_cd")))
								.cutoff$and(S1_V1.gi_str_ln_cd.like(bind("gi_str_ln_cd")))
								.cutoff$and(S1_V1.gi_stk_arrv_bp_cd.like(bind("gi_stk_arrv_bp_cd")))
								.cutoff$and(S1_V1.gr_loc_cd.like(bind("gr_loc_cd")))
								.cutoff$and(S1_V1.gr_str_ln_cd.like(bind("gr_str_ln_cd")))
								.cutoff$and(S1_V1.gr_stk_arrv_bp_cd.like(bind("gr_stk_arrv_bp_cd")))
								.cutoff$and(S1_V1.ver_no.like(bind("ver_no")))
								.cutoff$and(S1_V1.lot_no.like(bind("lot_no")))
								.cutoff$and(S1_V1.sublot_no.like(bind("sublot_no")))
								.cutoff$and(S1_V1.sno1.like(bind("sno1")))
								.cutoff$and(S1_V1.sno2.like(bind("sno2")))
								.cutoff$and(S1_V1.sno3.like(bind("sno3")))
								.cutoff$and(S1_V1.sno4.like(bind("sno4")))
								.cutoff$and(S1_V1.abort_flg.neq(bind("abort_false")))
								.cutoff$and(S1_V1.trd_unit_cd.like(bind("trd_unit_cd")))
								.cutoff$and(S1_V1.base_unit_cd.like(bind("base_unit_cd")))
								.cutoff$and(S1_V1.gd_cd.like(bind("gd_cd")))
								.cutoff$and(S1_V1.quality_typ.like(bind("quality_typ")))
								.cutoff$and(S1_V1.stk_insp_typ.like(bind("stk_insp_typ")))
								.cutoff$and(S1_V1.stk_id_typ.like(bind("stk_id_typ")))
								.cutoff$and(S1_V1.stk_bp_cd.like(bind("stk_bp_cd")))
								.cutoff$and(S1_V1.rsn_cd.like(bind("rsn_cd")))
								.cutoff$and(S1_V1.bd_dpt_cd.like(bind("bd_dpt_cd")))
								.cutoff$and(S1_V1.trd_cd.like(bind("trd_cd")))
								.cutoff$and(S1_V1.intr_d_rmrks.like(bind("intr_d_rmrks")))
								.cutoff$and(S1_V1.trd_d_rmrks.like(bind("trd_d_rmrks")))
								.cutoff$and(S1_V1.inst_d_rmrks.like(bind("inst_d_rmrks")))
								.cutoff$and(S1_V1.sub_char1.like(bind("d_sub_char1")))
								.cutoff$and(S1_V1.sub_char2.like(bind("d_sub_char2")))
								.cutoff$and(S1_V1.sub_char3.like(bind("d_sub_char3")))
								.cutoff$and(S1_V1.xfr_alloc_sts_no.like(bind("xfr_alloc_sts_no")))
								.cutoff$and(S1_V1.dlv_slip_no.like(bind("dlv_slip_no")))
								.cutoff$and(S1_V1.dlv_slip_d_no.like(bind("dlv_slip_d_no")))
								.cutoff$and(S1_V6.xfr_inst_no.like(bind("xfr_inst_no")))
								.cutoff$and(S1_V1.xfr_inst_d_no.like(bind("xfr_inst_d_no")))
								.cutoff$and(S1_V1.io_schd_pr_no.like(bind("io_schd_pr_no")))
									
								.and(
									exists(
										subQuery()
										.select(value("X"))
										.from(
											S5_T1A
											.innerJoin(S5_T2A).on(
												bracket(
													S5_T1A.xfr_schd_no.eq(S5_T2A.xfr_schd_no)
												)
											)
											.leftOuterJoin(S6_M23A).on(
												bracket(
													S5_T2A.rqst_usr_cd.eq(S6_M23A.usr_cd)
												)
											)
											.leftOuterJoin(S8_M24A).on(
												bracket(
													S5_T2A.rqst_dpt_cd.eq(S8_M24A.dpt_cd)
													.and(S5_T2A.rcpt_dt.between(S8_M24A.st_dt, S8_M24A.end_dt))
												)
											)
										)
										.where(
											value(0).eq(value(0))
											.and(S5_T1A.xfr_inst_d_no.eq(S1_V1.xfr_inst_d_no))
											.cutoff$and(S5_T2A.rqst_usr_cd.like(bind("rqst_usr_cd")))
											.cutoff$and(S6_M23A.usr_nm.like(bind("rqst_usr_nm")))
											.cutoff$and(S5_T2A.rqst_dpt_cd.like(bind("rqst_dpt_cd")))
											.cutoff$and(S8_M24A.dpt_nm.like(bind("rqst_dpt_nm")))
											.cutoff$and(S5_T2A.rqst_mod_flg.eq(bind("rqst_mod_true")))
											.cutoff$and(S5_T2A.rqst_cnt_rmrks.like(bind("rqst_cnt_rmrks")))
											.cutoff$and(S5_T2A.ship_cnt_rmrks.like(bind("ship_cnt_rmrks")))
											.cutoff$and(S5_T2A.intr_rmrks.like(bind("schd_intr_rmrks")))
											.cutoff$and(S5_T2A.xfr_src_typ.like(bind("xfr_src_typ")))
											.cutoff$and(S5_T2A.xfr_src_no.like(bind("xfr_src_no")))
											.cutoff$and(S5_T1A.xfr_schd_no.like(bind("xfr_schd_no")))
											.cutoff$and(S5_T2A.slo_no.like(bind("slo_no")))
											.cutoff$and(S5_T2A.mfg_inst_no.like(bind("mfg_inst_no")))
											.cutoff$and(S5_T2A.oper_inst_no.like(bind("oper_inst_no")))
										)
									)
								)
							)
						).view(S0_T1)
						.leftOuterJoin(S0_T7).on(S0_T1.pr(S1_V6.xfr_inst_no).eq(S0_T7.xfr_inst_no))
						.leftOuterJoin(S0_T8).on(
							S0_T1.pr(S1_V1.xfr_alloc_sts_no).eq(S0_T8.prov_src_schd_no1)
							.and(S0_T8.prov_src_schd_typ.eq(value(MSC_PROV_SRC_SCHD_TYP.XFR.value())))
							.and(S0_T8.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.PROV.value())))
						)
						.leftOuterJoin(S0_T9).on(
							S0_T1.pr(S1_V1.xfr_alloc_sts_no).eq(S0_T9.prov_src_schd_no1)
							.and(S0_T9.prov_src_schd_typ.eq(value(MSC_PROV_SRC_SCHD_TYP.XFR.value())))
							.and(S0_T9.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.PROV_RTN.value())))
						)
						.leftOuterJoin(S0_T10).on(
							S0_T1.pr(S1_V1.dlv_slip_no).eq(S0_T10.dlv_slip_no)
							.and(S0_T1.pr(S1_V1.dlv_slip_seq).eq(S0_T10.dlv_slip_seq))
						)
						.leftOuterJoin(S0_M1).on(
							S0_T1.pr("itm_cd").eq(S0_M1.itm_cd)
							.and(S0_T1.pr("itm_sub1").eq(S0_M1.itm_sub1))
							.and(S0_T1.pr("itm_sub2").eq(S0_M1.itm_sub2))
							.and(S0_T1.pr("itm_sub3").eq(S0_M1.itm_sub3))
						)
						.leftOuterJoin(S0_M4).on(
							S0_T1.pr("itm_cd").eq(S0_M4.itm_cd)
							.and(S0_T1.pr("itm_sub1").eq(S0_M4.itm_sub1))
							.and(S0_T1.pr("itm_sub2").eq(S0_M4.itm_sub2))
							.and(S0_T1.pr("itm_sub3").eq(S0_M4.itm_sub3))
							.and(S0_T1.pr(S1_V1.sno1).eq(S0_M4.sno1))
							.and(S0_T1.pr(S1_V1.sno2).eq(S0_M4.sno2))
							.and(S0_T1.pr(S1_V1.sno3).eq(S0_M4.sno3))
							.and(S0_T1.pr(S1_V1.sno4).eq(S0_M4.sno4))
						)
						.leftOuterJoin(S0_M26).on(
							S0_T1.pr(S1_V1.bd_dpt_cd).eq(S0_M26.dpt_cd)
							.and(
								nvl(
									S0_T7.xfr_inst_dt,
									S0_T1.pr(S1_V2.rcpt_dt)
								).between(S0_M26.st_dt, S0_M26.end_dt)
							)
						)
						.leftOuterJoin(S0_M28).on(
							S0_T7.inst_dpt_cd.eq(S0_M28.dpt_cd)
							.and(S0_T7.xfr_inst_dt.between(S0_M28.st_dt, S0_M28.end_dt))
						)
						.leftOuterJoin(S0_M36).on(
							S0_T1.pr("itm_cd").eq(S0_M36.itm_cd)
							.and(S0_T1.pr("itm_sub1").eq(S0_M36.itm_sub1))
							.and(S0_T1.pr("itm_sub2").eq(S0_M36.itm_sub2))
							.and(S0_T1.pr("itm_sub3").eq(S0_M36.itm_sub3))
							.and(S0_T1.pr(S1_V1.lg_grp_cd).eq(S0_M36.lg_grp_cd))
						)
						.leftOuterJoin(S0_M37).on(
							S0_T1.pr(S1_V1.lg_grp_cd).eq(S0_M37.lg_grp_cd)
							.and(S0_M37.del_flg.eq(value(false)))
							.and(S0_M37.lg_def_flg.eq(value(true)))
						)
						.addDynamicView()
						.addDynamicView(DS0C_ITM_GRP)
					)
					.where(
						value(0).eq(value(0))
						.and(
							exists(
								subQuery()
								.select(value("X"))
								.from(S2_V1)
								.where(
									S0_T1.pr(S1_V1.gr_loc_cd).eq(S2_V1.loc_cd)
								)
							)
							.or(
								exists(
									subQuery()
									.select(value("X"))
									.from(S3_V2)
									.where(
										S0_T1.pr(S1_V1.lg_grp_cd).eq(S3_V2.lg_grp_cd)
									)
								)
							)
							.or(
								exists(
									subQuery()
									.select(value("X"))
									.from(S4_V3)
									.where(
										value(0).eq(value(0))
										.and(
											S4_V3.loc_cd.eq(coalesce(
													S0_T1.pr(S1_V1.gi_loc_cd),
													S0_M36.lg_def_loc_cd,
													S0_M37.loc_cd
												)
											)
										)
									)
								)
							)
						)
						.cutoff$and(S0_T7.pick_prnt_flg.eq(bind("pick_prnt_true")))
						.cutoff$and(S0_T7.pick_prnt_flg.neq(bind("pick_not_prnt_true")))
						.cutoff$and(S0_T7.inst_prnt_flg.eq(bind("inst_prnt_true")))
						.cutoff$and(S0_T7.inst_prnt_flg.neq(bind("inst_not_prnt_true")))
						.cutoff$and(S0_T10.slip_prnt_flg.eq(bind("dlv_prnt_true")))
						.cutoff$and(S0_T10.slip_prnt_flg.neq(bind("dlv_not_prnt_true")))
						.cutoff$and(
							coalesce(
								S0_T7.xfr_schd_dt,
								S0_T1.pr("xfr_schd_dt")
							).gte(bind("xfr_schd_dt_fr"))
						)
						.cutoff$and(
							coalesce(
								S0_T7.xfr_schd_dt,
								S0_T1.pr("xfr_schd_dt")
							).lte(bind("xfr_schd_dt_to"))
						)
						.cutoff$and(S0_T7.xfr_inst_dt.gte(bind("xfr_inst_dt_fr")))
						.cutoff$and(S0_T7.xfr_inst_dt.lte(bind("xfr_inst_dt_to")))
						.addDynamicPredicate()
						.cutoff$and(S0_T7.inst_usr_cd.like(bind("inst_usr_cd")))
						.cutoff$and(S0_T7.inst_dpt_cd.like(bind("inst_dpt_cd")))
						.cutoff$and(S0_M28.dpt_nm.like(bind("inst_dpt_nm")))
						.cutoff$and(S0_M26.dpt_nm.like(bind("bd_dpt_nm")))
						.cutoff$and(S0_T7.trd_rmrks.like(bind("trd_rmrks")))
						.cutoff$and(S0_T7.inst_rmrks.like(bind("inst_rmrks")))
						.cutoff$and(S0_T7.sub_char1.like(bind("h_sub_char1")))
						.cutoff$and(S0_T7.sub_char2.like(bind("h_sub_char2")))
						.cutoff$and(S0_T7.sub_char3.like(bind("h_sub_char3")))
						.addDynamicPredicate(DS0C_ITM_GRP)
					)
					.orderBy(
						S0_T1.pr(S1_V1.trd_cd).asc(),
						S0_T1.pr(S1_V1.pr_sts_typ).asc(),
						S0_T1.pr(S1_V6.xfr_inst_no).asc(),
						S0_T1.pr("inst_disp_seq").asc(),
						S0_T1.pr(S1_V1.xfr_inst_d_no).asc(),
						S0_T1.pr(S1_V1.xfr_alloc_sts_no).asc()
					)
			)
			.setDynamicSQLInfo(
				when(boundOr("wrk_no", "wrk_nm"))
					.view(v -> v.leftOuterJoin(S0_T4).on(S0_T1.pr(S1_V1.sno1).eq(S0_T4.sno1)))
					.predicate(p -> p.cutoff$and(S0_T4.wrk_no.like(bind("wrk_no"))).cutoff$and(S0_T4.wrk_nm.like(bind("wrk_nm")))),
				when(boundOr("itm_typ_d_nm"))
					.view(v -> v.leftOuterJoin(S0_M2).on(S0_M1.itm_typ.eq(S0_M2.itm_typ).and(S0_M1.itm_typ_d_cd.eq(S0_M2.itm_typ_d_cd))))
					.predicate(p -> p.cutoff$and(S0_M2.itm_typ_d_nm.like(bind("itm_typ_d_nm")))),
				when(boundOr("trd_nm"))
					.view(v -> v.leftOuterJoin(S0_M3).on(S0_T1.pr(S1_V1.trd_cd).eq(S0_M3.trd_cd)))
					.predicate(p -> p.cutoff$and(S0_M3.trd_nm.like(bind("trd_nm")))),
				when(boundOr("trd_unit_nm"))
					.view(v -> v.leftOuterJoin(S0_M5).on(S0_T1.pr(S1_V1.trd_unit_cd).eq(S0_M5.unit_cd)))
					.predicate(p -> p.cutoff$and(S0_M5.unit_nm.like(bind("trd_unit_nm")))),
				when(boundOr("base_unit_nm"))
					.view(v -> v.leftOuterJoin(S0_M7).on(S0_T1.pr(S1_V1.base_unit_cd).eq(S0_M7.unit_cd)))
					.predicate(p -> p.cutoff$and(S0_M7.unit_nm.like(bind("base_unit_nm")))),
				when(boundOr("pckg_unit_nm"))
					.view(v -> v.leftOuterJoin(S0_M9).on(S0_M1.pckg_unit_cd.eq(S0_M9.unit_cd)))
					.predicate(p -> p.cutoff$and(S0_M9.unit_nm.like(bind("pckg_unit_nm")))),
				when(boundOr("wg_nm"))
					.view(v -> v.leftOuterJoin(S0_M11).on(S0_T1.pr(S1_V1.wg_cd).eq(S0_M11.wg_cd)))
					.predicate(p -> p.cutoff$and(S0_M11.wg_nm.like(bind("wg_nm")))),
				when(boundOr("lg_grp_nm"))
					.view(v -> v.leftOuterJoin(S0_M12).on(S0_T1.pr(S1_V1.lg_grp_cd).eq(S0_M12.lg_grp_cd)))
					.predicate(p -> p.cutoff$and(S0_M12.lg_grp_nm.like(bind("lg_grp_nm")))),
				when(boundOr("gi_site_nm", "gi_loc_nm", "gi_site_cd"))
					.view(v -> v.leftOuterJoin(S0_M13).on(S0_T1.pr(S1_V1.gi_loc_cd).eq(S0_M13.loc_cd)))
					.predicate(p -> p.cutoff$and(S0_M13.loc_nm.like(bind("gi_loc_nm"))).cutoff$and(S0_M13.site_cd.like(bind("gi_site_cd")))),
				when(boundOr("gi_str_ln_nm"))
					.view(v -> v.leftOuterJoin(S0_M14).on(S0_T1.pr(S1_V1.gi_loc_cd).eq(S0_M14.loc_cd).and(S0_T1.pr(S1_V1.gi_str_ln_cd).eq(S0_M14.str_ln_cd))))
					.predicate(p -> p.cutoff$and(S0_M14.str_ln_nm.like(bind("gi_str_ln_nm")))),
				when(boundOr("gi_stk_arrv_bp_nm"))
					.view(v -> v.leftOuterJoin(S0_M15).on(S0_T1.pr(S1_V1.gi_stk_arrv_bp_cd).eq(S0_M15.bp_cd)))
					.predicate(p -> p.cutoff$and(S0_M15.bp_nm.like(bind("gi_stk_arrv_bp_nm")))),
				when(boundOr("gi_site_nm"))
					.view(v -> v.leftOuterJoin(S0_M16).on(S0_M13.site_cd.eq(S0_M16.site_cd)))
					.predicate(p -> p.cutoff$and(S0_M16.site_nm.like(bind("gi_site_nm")))),
				when(boundOr("gr_site_nm", "gr_loc_nm", "gr_site_cd"))
					.view(v -> v.leftOuterJoin(S0_M17).on(S0_T1.pr(S1_V1.gr_loc_cd).eq(S0_M17.loc_cd)))
					.predicate(p -> p.cutoff$and(S0_M17.loc_nm.like(bind("gr_loc_nm"))).cutoff$and(S0_M17.site_cd.like(bind("gr_site_cd")))),
				when(boundOr("gr_str_ln_nm"))
					.view(v -> v.leftOuterJoin(S0_M18).on(S0_T1.pr(S1_V1.gr_loc_cd).eq(S0_M18.loc_cd).and(S0_T1.pr(S1_V1.gr_str_ln_cd).eq(S0_M18.str_ln_cd))))
					.predicate(p -> p.cutoff$and(S0_M18.str_ln_nm.like(bind("gr_str_ln_nm")))),
				when(boundOr("gr_stk_arrv_bp_nm"))
					.view(v -> v.leftOuterJoin(S0_M19).on(S0_T1.pr(S1_V1.gr_stk_arrv_bp_cd).eq(S0_M19.bp_cd)))
					.predicate(p -> p.cutoff$and(S0_M19.bp_nm.like(bind("gr_stk_arrv_bp_nm")))),
				when(boundOr("gr_site_nm"))
					.view(v -> v.leftOuterJoin(S0_M20).on(S0_M17.site_cd.eq(S0_M20.site_cd)))
					.predicate(p -> p.cutoff$and(S0_M20.site_nm.like(bind("gr_site_nm")))),
				when(boundOr("gd_nm"))
					.view(v -> v.leftOuterJoin(S0_M21).on(S0_T1.pr(S1_V1.gd_cd).eq(S0_M21.gd_cd)))
					.predicate(p -> p.cutoff$and(S0_M21.gd_nm.like(bind("gd_nm")))),
				when(boundOr("stk_bp_nm"))
					.view(v -> v.leftOuterJoin(S0_M22).on(S0_T1.pr(S1_V1.stk_bp_cd).eq(S0_M22.bp_cd)))
					.predicate(p -> p.cutoff$and(S0_M22.bp_nm.like(bind("stk_bp_nm")))),
				when(boundOr("rsn_nm"))
					.view(v -> v.leftOuterJoin(S0_M25).on(S0_T1.pr(S1_V1.rsn_cd).eq(S0_M25.biz_rsn_cd)))
					.predicate(p -> p.cutoff$and(S0_M25.biz_rsn_nm.like(bind("rsn_nm")))),
				when(boundOr("inst_usr_nm"))
					.view(v -> v.leftOuterJoin(S0_M27).on(S0_T7.inst_usr_cd.eq(S0_M27.usr_cd)))
					.predicate(p -> p.cutoff$and(S0_M27.usr_nm.like(bind("inst_usr_nm")))),
				when(boundOr("itm_grp_flg1"))
					.select(DS0C_ITM_GRP, S0_M1.itm_grp_cd1.as("itm_grp_cd1"), S0_MM1.itm_grp_nm.as("itm_grp_nm1"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM1).on(S0_M1.itm_grp_cd1.eq(S0_MM1.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP1.value()).eq(S0_MM1.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M1.itm_grp_cd1.like(bind("itm_grp_cd1"))).cutoff$and(S0_MM1.itm_grp_nm.like(bind("itm_grp_nm1")))),
				when(boundOr("itm_grp_flg2"))
					.select(DS0C_ITM_GRP, S0_M1.itm_grp_cd2.as("itm_grp_cd2"), S0_MM2.itm_grp_nm.as("itm_grp_nm2"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM2).on(S0_M1.itm_grp_cd2.eq(S0_MM2.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP2.value()).eq(S0_MM2.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M1.itm_grp_cd2.like(bind("itm_grp_cd2"))).cutoff$and(S0_MM2.itm_grp_nm.like(bind("itm_grp_nm2")))),
				when(boundOr("itm_grp_flg3"))
					.select(DS0C_ITM_GRP, S0_M1.itm_grp_cd3.as("itm_grp_cd3"), S0_MM3.itm_grp_nm.as("itm_grp_nm3"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM3).on(S0_M1.itm_grp_cd3.eq(S0_MM3.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP3.value()).eq(S0_MM3.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M1.itm_grp_cd3.like(bind("itm_grp_cd3"))).cutoff$and(S0_MM3.itm_grp_nm.like(bind("itm_grp_nm3")))),
				when(boundOr("itm_grp_flg4"))
					.select(DS0C_ITM_GRP, S0_M1.itm_grp_cd4.as("itm_grp_cd4"), S0_MM4.itm_grp_nm.as("itm_grp_nm4"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM4).on(S0_M1.itm_grp_cd4.eq(S0_MM4.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP4.value()).eq(S0_MM4.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M1.itm_grp_cd4.like(bind("itm_grp_cd4"))).cutoff$and(S0_MM4.itm_grp_nm.like(bind("itm_grp_nm4")))),
				when(boundOr("itm_grp_flg5"))
					.select(DS0C_ITM_GRP, S0_M1.itm_grp_cd5.as("itm_grp_cd5"), S0_MM5.itm_grp_nm.as("itm_grp_nm5"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM5).on(S0_M1.itm_grp_cd5.eq(S0_MM5.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP5.value()).eq(S0_MM5.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M1.itm_grp_cd5.like(bind("itm_grp_cd5"))).cutoff$and(S0_MM5.itm_grp_nm.like(bind("itm_grp_nm5")))),
				when(boundOr("itm_grp_flg6"))
					.select(DS0C_ITM_GRP, S0_M1.itm_grp_cd6.as("itm_grp_cd6"), S0_MM6.itm_grp_nm.as("itm_grp_nm6"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM6).on(S0_M1.itm_grp_cd6.eq(S0_MM6.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP6.value()).eq(S0_MM6.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M1.itm_grp_cd6.like(bind("itm_grp_cd6"))).cutoff$and(S0_MM6.itm_grp_nm.like(bind("itm_grp_nm6")))),
				when(boundOr("itm_grp_flg7"))
					.select(DS0C_ITM_GRP, S0_M1.itm_grp_cd7.as("itm_grp_cd7"), S0_MM7.itm_grp_nm.as("itm_grp_nm7"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM7).on(S0_M1.itm_grp_cd7.eq(S0_MM7.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP7.value()).eq(S0_MM7.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M1.itm_grp_cd7.like(bind("itm_grp_cd7"))).cutoff$and(S0_MM7.itm_grp_nm.like(bind("itm_grp_nm7")))),
				when(boundOr("itm_grp_flg8"))
					.select(DS0C_ITM_GRP, S0_M1.itm_grp_cd8.as("itm_grp_cd8"), S0_MM8.itm_grp_nm.as("itm_grp_nm8"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM8).on(S0_M1.itm_grp_cd8.eq(S0_MM8.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP8.value()).eq(S0_MM8.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M1.itm_grp_cd8.like(bind("itm_grp_cd8"))).cutoff$and(S0_MM8.itm_grp_nm.like(bind("itm_grp_nm8")))),
				when(boundOr("itm_grp_flg9"))
					.select(DS0C_ITM_GRP, S0_M1.itm_grp_cd9.as("itm_grp_cd9"), S0_MM9.itm_grp_nm.as("itm_grp_nm9"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM9).on(S0_M1.itm_grp_cd9.eq(S0_MM9.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP9.value()).eq(S0_MM9.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M1.itm_grp_cd9.like(bind("itm_grp_cd9"))).cutoff$and(S0_MM9.itm_grp_nm.like(bind("itm_grp_nm9")))),
				when(boundOr("itm_grp_flg10"))
					.select(DS0C_ITM_GRP, S0_M1.itm_grp_cd10.as("itm_grp_cd10"), S0_MM10.itm_grp_nm.as("itm_grp_nm10"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM10).on(S0_M1.itm_grp_cd10.eq(S0_MM10.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP10.value()).eq(S0_MM10.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M1.itm_grp_cd10.like(bind("itm_grp_cd10"))).cutoff$and(S0_MM10.itm_grp_nm.like(bind("itm_grp_nm10"))))
			)
			.addDynamicSQLInfo(
				when(boundOr("itm_cd", "itm_sub1", "itm_sub2", "itm_sub3", "itm_nm", "itm_typ", "itm_typ_d_cd", "pckg_unit_cd"))
					.view(DS0C_XFR_ALLOC_STS_KEY, v -> v.innerJoin(xfrAllocStsKeyW).on(S1_V1.xfr_alloc_sts_no.eq(xfrAllocStsKeyW.xfr_alloc_sts_no))
				)
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
						.add(MSVT_WRK_SNO_R.class, r -> toCondition(
							r.getStringNE("sno1")
						))
						.addSelect(m -> toArray(
							m.wrk_nm,
							m.wrk_no
						))
						.addMap((r, m) -> {
							r.setStringNE("wrk_no", m.wrk_no());
							r.setStringNE("wkk_nm", m.wrk_nm());
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
							r.setNumberNE("trd_unit_conv_base_qty", m.conv_base_qty());
							r.setNumberNE("trd_unit_conv_qty", m.conv_qty());
							r.setNumberNE("trd_unit_dec_place", m.dec_place());
							r.setStringNE("trd_unit_rnd_typ", m.rnd_typ());
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
						.add(MAM_UNIT_R.class, r -> toCondition(
							r.getStringNE("pckg_unit_cd")
						))
						.addSelect(m -> toArray(
							m.unit_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("pckg_unit_nm", m.unit_nm());
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
						.add(MAM_LG_GRP_R.class, r -> toCondition(
							r.getStringNE("lg_grp_cd")
						))
						.addSelect(m -> toArray(
							m.lg_grp_nm,
							m.pick_list_flg,
							m.ship_inst_flg,
							m.ship_slip_flg
						))
						.addMap((r, m) -> {
							r.setStringNE("lg_grp_nm", m.lg_grp_nm());
							r.setBooleanNE("immd_dlv_prnt_flg", m.ship_slip_flg());
							r.setBooleanNE("immd_pick_prnt_flg", m.pick_list_flg());
							r.setBooleanNE("immd_inst_prnt_flg", m.ship_inst_flg());
					}),
					j -> j
						.add(MAM_LOC_R.class, r -> toCondition(
							r.getStringNE("gi_loc_cd")
						))
						.addSelect(m -> toArray(
							m.loc_nm,
							m.site_cd,
							m.sppl_cd,
							m.str_ln_tgt_flg
						))
						.addMap((r, m) -> {
							r.setStringNE("gi_loc_nm", m.loc_nm());
							r.setBooleanNE("gi_str_ln_tgt_flg", m.str_ln_tgt_flg());
							r.setStringNE("gi_sppl_cd", m.sppl_cd());
							r.setStringNE("gi_site_cd", m.site_cd());
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
							r.setStringNE("gi_str_ln_nm", m.str_ln_nm());
					}),
					j -> j
						.add(MAM_BP_R.class, r -> toCondition(
							r.getStringNE("gi_stk_arrv_bp_cd")
						))
						.addSelect(m -> toArray(
							m.bp_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("gi_stk_arrv_bp_nm", m.bp_nm());
					}),
					j -> j
						.add(MAM_SITE_R.class, r -> toCondition(
							r.getStringNE("gi_site_cd")
						))
						.addSelect(m -> toArray(
							m.site_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("gi_site_nm", m.site_nm());
					}),
					j -> j
						.add(MAM_LOC_R.class, r -> toCondition(
							r.getStringNE("gr_loc_cd")
						))
						.addSelect(m -> toArray(
							m.loc_nm,
							m.site_cd,
							m.sppl_cd,
							m.str_ln_tgt_flg
						))
						.addMap((r, m) -> {
							r.setStringNE("gr_loc_nm", m.loc_nm());
							r.setBooleanNE("gr_str_ln_tgt_flg", m.str_ln_tgt_flg());
							r.setStringNE("gr_sppl_cd", m.sppl_cd());
							r.setStringNE("gr_site_cd", m.site_cd());
					}),
					j -> j
						.add(MAM_STR_LN_R.class, r -> toCondition(
							r.getStringNE("gr_loc_cd"),
							r.getStringNE("gr_str_ln_cd")
						))
						.addSelect(m -> toArray(
							m.str_ln_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("gr_str_ln_nm", m.str_ln_nm());
					}),
					j -> j
						.add(MAM_BP_R.class, r -> toCondition(
							r.getStringNE("gr_stk_arrv_bp_cd")
						))
						.addSelect(m -> toArray(
							m.bp_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("gr_stk_arrv_bp_nm", m.bp_nm());
					}),
					j -> j
						.add(MAM_SITE_R.class, r -> toCondition(
							r.getStringNE("gr_site_cd")
						))
						.addSelect(m -> toArray(
							m.site_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("gr_site_nm", m.site_nm());
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
							r.getStringNE("stk_bp_cd")
						))
						.addSelect(m -> toArray(
							m.bp_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("stk_bp_nm", m.bp_nm());
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
						.add(MAM_BIZ_RSN_R.class, r -> toCondition(
							r.getStringNE("rsn_cd")
						))
						.addSelect(m -> toArray(
							m.acxfr_gi_flg,
							m.biz_rsn_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("rsn_nm", m.biz_rsn_nm());
							r.setBooleanNE("acxfr_gi_flg", m.acxfr_gi_flg());
					}),
					j -> j
						.add(MAM_USR_R.class, r -> toCondition(
							r.getStringNE("inst_usr_cd")
						))
						.addSelect(m -> toArray(
							m.usr_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("inst_usr_nm", m.usr_nm());
					}),
					j -> j
						.add(MAM_BP_R.class, r -> toCondition(
							r.getStringNE("gi_sppl_cd")
						))
						.addSelect(m -> toArray(
							m.bp_nm,
							m.onr_prsppl_flg,
							m.prov_basis_typ
						))
						.addMap((r, m) -> {
							r.setStringNE("gi_sppl_nm", m.bp_nm());
							r.setBooleanNE("gi_onr_prsppl_flg", m.onr_prsppl_flg());
							r.setStringNE("gi_prov_basis_typ", m.prov_basis_typ());
					}),
					j -> j
						.add(MAM_BP_R.class, r -> toCondition(
							r.getStringNE("gr_sppl_cd")
						))
						.addSelect(m -> toArray(
							m.bp_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("gr_sppl_nm", m.bp_nm());
					}),
					j -> j
						.add(MAVM_ITM_UNIT_R.class, r -> toCondition(
							r.getStringNE("itm_cd"),
							r.getStringNE("itm_sub1"),
							r.getStringNE("itm_sub2"),
							r.getStringNE("itm_sub3"),
							r.getStringNE("pckg_unit_cd")
						))
						.addSelect(m -> toArray(
							m.conv_base_qty,
							m.conv_qty,
							m.dec_place
						))
						.addMap((r, m) -> {
							r.setNumberNE("pckg_unit_conv_base_qty", m.conv_base_qty());
							r.setNumberNE("pckg_unit_conv_qty", m.conv_qty());
							r.setNumberNE("pckg_unit_dec_place", m.dec_place());
					}),
					j -> j
						.add(MAM_UNIT_R.class, r -> toCondition(
							r.getStringNE("schd_unit_cd")
						))
						.addSelect(m -> toArray(
							m.unit_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("schd_unit_nm", m.unit_nm());
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
							m.dec_place
						))
						.addMap((r, m) -> {
							r.setNumberNE("schd_unit_dec_place", m.dec_place());
					})
				)
			);
	}
	
	/**
	 * -- MSBEL1050_MST_XFR_INST_D_Query_S01
	 */
	static MCQueryPlan MSBEL1050_MST_XFR_INST_D_S01() {
		MST_XFR_ALLOC_STS_R S0_T1 = MST_XFR_ALLOC_STS_R.create("T1");
		MST_XFR_INST_D_R S0_T6 = MST_XFR_INST_D_R.create("T6");
		MST_XFR_INST_R S0_T7 = MST_XFR_INST_R.create("T7");
		MST_XFR_SCHD_R S0_T2 = MST_XFR_SCHD_R.create("T2");
		MST_PROV_SCHD_R S0_T8 = MST_PROV_SCHD_R.create("T8");
		MST_PROV_SCHD_R S0_T9 = MST_PROV_SCHD_R.create("T9");
		MST_DLV_SLIP_R S0_T10 = MST_DLV_SLIP_R.create("T10");
		MSVT_WRK_SNO_R S0_T4 = MSVT_WRK_SNO_R.create("T4");
		MAM_ITM_R S0_M1 = MAM_ITM_R.create("M1");
		MAM_ITM_TYP_D_R S0_M2 = MAM_ITM_TYP_D_R.create("M2");
		MAM_TRD_R S0_M3 = MAM_TRD_R.create("M3");
		MAM_SUNDRY_ITM_R S0_M4 = MAM_SUNDRY_ITM_R.create("M4");
		MAM_UNIT_R S0_M5 = MAM_UNIT_R.create("M5");
		MAM_UNIT_R S0_M7 = MAM_UNIT_R.create("M7");
		MAM_UNIT_R S0_M9 = MAM_UNIT_R.create("M9");
		MAM_WG_R S0_M11 = MAM_WG_R.create("M11");
		MAM_LG_GRP_R S0_M12 = MAM_LG_GRP_R.create("M12");
		MAM_LOC_R S0_M13 = MAM_LOC_R.create("M13");
		MAM_STR_LN_R S0_M14 = MAM_STR_LN_R.create("M14");
		MAM_BP_R S0_M15 = MAM_BP_R.create("M15");
		MAM_SITE_R S0_M16 = MAM_SITE_R.create("M16");
		MAM_LOC_R S0_M17 = MAM_LOC_R.create("M17");
		MAM_STR_LN_R S0_M18 = MAM_STR_LN_R.create("M18");
		MAM_BP_R S0_M19 = MAM_BP_R.create("M19");
		MAM_SITE_R S0_M20 = MAM_SITE_R.create("M20");
		MAM_STK_GD_R S0_M21 = MAM_STK_GD_R.create("M21");
		MAM_BP_R S0_M22 = MAM_BP_R.create("M22");
		MAM_DPT_R S0_M24 = MAM_DPT_R.create("M24");
		MAM_BIZ_RSN_R S0_M25 = MAM_BIZ_RSN_R.create("M25");
		MAM_DPT_R S0_M26 = MAM_DPT_R.create("M26");
		MAM_USR_R S0_M27 = MAM_USR_R.create("M27");
		MAM_DPT_R S0_M28 = MAM_DPT_R.create("M28");
		MAM_ITM_LG_GRP_R S0_M36 = MAM_ITM_LG_GRP_R.create("M36");
		MAM_LOC_R S0_M37 = MAM_LOC_R.create("M37");
		MAM_ITM_GRP_R S0_MM1 = MAM_ITM_GRP_R.create("MM1");
		MAM_ITM_GRP_R S0_MM2 = MAM_ITM_GRP_R.create("MM2");
		MAM_ITM_GRP_R S0_MM3 = MAM_ITM_GRP_R.create("MM3");
		MAM_ITM_GRP_R S0_MM4 = MAM_ITM_GRP_R.create("MM4");
		MAM_ITM_GRP_R S0_MM5 = MAM_ITM_GRP_R.create("MM5");
		MAM_ITM_GRP_R S0_MM6 = MAM_ITM_GRP_R.create("MM6");
		MAM_ITM_GRP_R S0_MM7 = MAM_ITM_GRP_R.create("MM7");
		MAM_ITM_GRP_R S0_MM8 = MAM_ITM_GRP_R.create("MM8");
		MAM_ITM_GRP_R S0_MM9 = MAM_ITM_GRP_R.create("MM9");
		MAM_ITM_GRP_R S0_MM10 = MAM_ITM_GRP_R.create("MM10");
		MAVM_RD_LOC_R S1_V1 = MAVM_RD_LOC_R.create("V1");
		MAVM_RD_LG_GRP_R S2_V2 = MAVM_RD_LG_GRP_R.create("V2");
		MAVM_RD_LOC_R S3_V3 = MAVM_RD_LOC_R.create("V3");
		MST_XFR_ALLOC_STS_SV_R S4_T1A = MST_XFR_ALLOC_STS_SV_R.create("T1A");
		MST_XFR_SCHD_R S4_T2A = MST_XFR_SCHD_R.create("T2A");
		MST_XFR_ALLOC_STS_SV_R S5_T1A = MST_XFR_ALLOC_STS_SV_R.create("T1A");
		MST_XFR_SCHD_R S5_T2A = MST_XFR_SCHD_R.create("T2A");
		MAM_USR_R S5_M23A = MAM_USR_R.create("M23A");
		MST_XFR_ALLOC_STS_SV_R S6_T1A = MST_XFR_ALLOC_STS_SV_R.create("T1A");
		MST_XFR_SCHD_R S6_T2A = MST_XFR_SCHD_R.create("T2A");
		MST_XFR_ALLOC_STS_SV_R S7_T1A = MST_XFR_ALLOC_STS_SV_R.create("T1A");
		MST_XFR_SCHD_R S7_T2A = MST_XFR_SCHD_R.create("T2A");
		MAM_DPT_R S7_M24A = MAM_DPT_R.create("M24A");
		MST_XFR_ALLOC_STS_SV_R S8_T1A = MST_XFR_ALLOC_STS_SV_R.create("T1A");
		MST_XFR_SCHD_R S8_T2A = MST_XFR_SCHD_R.create("T2A");
		MST_XFR_ALLOC_STS_SV_R S9_T1A = MST_XFR_ALLOC_STS_SV_R.create("T1A");
		MST_XFR_SCHD_R S9_T2A = MST_XFR_SCHD_R.create("T2A");
		MST_XFR_ALLOC_STS_SV_R S10_T1A = MST_XFR_ALLOC_STS_SV_R.create("T1A");
		MST_XFR_SCHD_R S10_T2A = MST_XFR_SCHD_R.create("T2A");
		MST_XFR_ALLOC_STS_SV_R S11_T1A = MST_XFR_ALLOC_STS_SV_R.create("T1A");
		MST_XFR_SCHD_R S11_T2A = MST_XFR_SCHD_R.create("T2A");
		MST_XFR_ALLOC_STS_SV_R S12_T1A = MST_XFR_ALLOC_STS_SV_R.create("T1A");
		MST_XFR_SCHD_R S12_T2A = MST_XFR_SCHD_R.create("T2A");
		MST_XFR_ALLOC_STS_SV_R S13_T1A = MST_XFR_ALLOC_STS_SV_R.create("T1A");
		MST_XFR_SCHD_R S13_T2A = MST_XFR_SCHD_R.create("T2A");
		MST_XFR_ALLOC_STS_SV_R S14_T1A = MST_XFR_ALLOC_STS_SV_R.create("T1A");
		MST_XFR_ALLOC_STS_SV_R S15_T1A = MST_XFR_ALLOC_STS_SV_R.create("T1A");
		MST_XFR_SCHD_R S15_T2A = MST_XFR_SCHD_R.create("T2A");
		MST_XFR_ALLOC_STS_SV_R S16_T1A = MST_XFR_ALLOC_STS_SV_R.create("T1A");
		MST_XFR_SCHD_R S16_T2A = MST_XFR_SCHD_R.create("T2A");
		MST_XFR_ALLOC_STS_SV_R S17_T1A = MST_XFR_ALLOC_STS_SV_R.create("T1A");
		MST_XFR_SCHD_R S17_T2A = MST_XFR_SCHD_R.create("T2A");
		
		MCDynamicSQLID DS0C_ITM_GRP = createDynamicSQLID("DS0C_ITM_GRP");
		
		return createQueryPlan()
			.setQuery(
				sql("MSBEL1050_MST_XFR_INST_D_Query_S01")
					.mainQuery()
					.select(
						S0_T1.trd_cd,
						S0_T1.pr_sts_typ,
						S0_T6.itm_cd,
						S0_T6.itm_sub1,
						S0_T6.itm_sub2,
						S0_T6.itm_sub3,
						coalesce(
							S0_M4.itm_nm,
							S0_M1.itm_nm
						).as("itm_nm"),
						S0_M1.sundry_itm_flg,
						S0_M1.lot_mng_typ,
						S0_M1.sublot_mng_typ,
						S0_M1.sno1_mng_typ,
						S0_M1.sno2_mng_typ,
						S0_M1.sno3_mng_typ,
						S0_M1.sno4_mng_typ,
						S0_T1.not_lot_mix_flg,
						S0_T1.not_sublot_mix_flg,
						S0_T1.lot_no,
						S0_T1.sublot_no,
						S0_T1.sno1,
						S0_T1.sno1_null_flg,
						S0_T1.sno2,
						S0_T1.sno2_null_flg,
						S0_T1.sno3,
						S0_T1.sno3_null_flg,
						S0_T1.sno4,
						S0_T1.sno4_null_flg,
						S0_T1.alloc_sno1,
						S0_T1.alloc_sno2,
						S0_T1.alloc_sno3,
						S0_T1.alloc_sno4,
						S0_M1.ver_flg.as("def_ver_flg"),
						S0_T1.ver_no,
						S0_T1.abort_flg,
						S0_T1.fix_flg,
						S0_T1.cmpl_flg,
						S0_T1.trd_unit_cd,
						S0_T1.trd_unit_qty,
						S0_T1.base_unit_cd,
						S0_T1.base_unit_qty.as("base_unit_qty"),
						cases()
							.when(
								S0_T1.xfr_schd_no.eq(value(MAC_STR.NULL_VAL.value()))
								.or(S0_T1.xfr_schd_no.isNull())
							)
								.then(value(0))
							.otherwise(S0_T2.base_unit_qty).as("base_unit_schd_qty"),
						cases()
							.when(
								S0_T1.xfr_inst_d_no.eq(value(MAC_STR.NULL_VAL.value()))
								.or(S0_T1.xfr_inst_d_no.isNull())
							)
								.then(value(0))
							.otherwise(S0_T1.base_unit_qty).as("base_unit_inst_qty"),
						S0_T1.act_qty.as("base_unit_act_qty"),
						S0_M1.pckg_unit_cd,
						value((MCNumber) null).as("pckg_unit_qty"),
						S0_T2.trd_unit_cd.as("schd_unit_cd"),
						S0_T2.trd_unit_qty.as("schd_qty"),
						S0_M1.cont_fctr_flg,
						S0_M1.std_cont_fctr,
						S0_M1.cont_fctr_unit_cd,
						S0_M1.cont_fctr_rnd_typ,
						S0_M1.cont_fctr_dec_place,
						coalesce(
							S0_T2.gi_rqst_tm,
							S0_T2.gr_rqst_tm
						).as("xfr_rqst_dt"),
						coalesce(
							S0_T7.xfr_schd_dt,
							S0_T1.xfr_schd_dt
						).as("xfr_schd_dt"),
						S0_T7.xfr_inst_dt,
						value((MCDate) null).as("xfr_act_dt"),
						value((MCDate) null).as("xfr_ac_dt"),
						value((MCDate) null).as("can_ac_dt"),
						S0_T1.wg_cd,
						S0_T1.lg_grp_cd,
						S0_T1.gi_loc_cd,
						S0_T1.gi_str_ln_cd,
						S0_T1.gi_stk_arrv_bp_cd,
						S0_T1.gr_loc_cd,
						S0_T1.gr_str_ln_cd,
						S0_T1.gr_stk_arrv_bp_cd,
						S0_T1.gd_cd,
						S0_T1.quality_typ,
						S0_T1.stk_insp_typ,
						S0_T1.stk_id_typ,
						S0_T1.stk_bp_cd,
						S0_T2.rqst_usr_cd,
						S0_T2.rqst_dpt_cd,
						S0_M24.dpt_nm.as("rqst_dpt_nm"),
						S0_T7.inst_usr_cd,
						S0_T7.inst_dpt_cd,
						S0_M28.dpt_nm.as("inst_dpt_nm"),
						nullValue().as("act_usr_cd"),
						nullValue().as("act_usr_nm"),
						nullValue().as("act_dpt_cd"),
						nullValue().as("act_dpt_nm"),
						S0_T1.ship_inst_typ,
						S0_T1.rsn_cd,
						S0_T1.bd_dpt_cd,
						S0_M26.dpt_nm.as("bd_dpt_nm"),
						S0_T7.pick_prnt_flg,
						S0_T7.inst_prnt_flg,
						S0_T10.slip_prnt_flg.as("dlv_prnt_flg"),
						S0_T1.alloc_flg,
						S0_M1.skip_chk_ship_flg.as("skip_chk_ship_flg"),
						nullValue().as("intr_rmrks"),
						S0_T7.trd_rmrks.as("trd_rmrks"),
						S0_T7.inst_rmrks.as("inst_rmrks"),
						S0_T7.sub_char1.as("h_sub_char1"),
						S0_T7.sub_char2.as("h_sub_char2"),
						S0_T7.sub_char3.as("h_sub_char3"),
						S0_T1.intr_d_rmrks.as("intr_d_rmrks"),
						S0_T1.trd_d_rmrks.as("trd_d_rmrks"),
						S0_T1.inst_d_rmrks.as("inst_d_rmrks"),
						S0_T1.sub_char1.as("d_sub_char1"),
						S0_T1.sub_char2.as("d_sub_char2"),
						S0_T1.sub_char3.as("d_sub_char3"),
						S0_T2.rqst_cnt_rmrks,
						S0_T2.ship_cnt_rmrks,
						S0_T2.intr_rmrks.as("schd_intr_rmrks"),
						S0_T2.xfr_src_typ,
						S0_T2.xfr_src_no,
						S0_T1.xfr_schd_no,
						S0_T1.xfr_alloc_sts_no,
						S0_T1.dlv_slip_no,
						S0_T1.dlv_slip_d_no,
						S0_T7.xfr_inst_no,
						S0_T6.xfr_inst_d_no,
						nullValue().as("xfr_act_no"),
						nullValue().as("xfr_act_d_no"),
						S0_T2.slo_no,
						S0_T2.mfg_inst_no,
						S0_T2.oper_inst_no,
						S0_T1.io_schd_pr_no,
						S0_T1.prov_typ,
						S0_T1.prov_basis_typ,
						S0_T1.ret_prov_typ,
						S0_T1.ret_prov_basis_typ,
						S0_T8.prov_schd_no.as("prov_schd_no"),
						S0_T9.prov_schd_no.as("ret_prov_schd_no"),
						S0_T6.base_dlv_slip_no,
						S0_T6.base_prov_act_no,
						S0_T6.base_ac_dt,
						S0_M1.itm_typ,
						S0_M1.itm_typ_d_cd,
						S0_T6.ins_usr_id,
						S0_T6.ins_usr_nm,
						S0_T6.ins_func_id,
						S0_T6.ins_ts,
						S0_T1.upd_cntr.as("alloc_sts_upd_cntr"),
						S0_T7.upd_cntr.as("inst_upd_cntr"),
						S0_T6.upd_usr_id,
						S0_T6.upd_usr_nm,
						S0_T6.upd_func_id,
						S0_T6.upd_ts,
						S0_T6.upd_srv_req_no,
						S0_T1.disp_seq.as("inst_disp_seq"),
						value((MCNumber) null).as("act_disp_seq"),
						addDynamicSelect(DS0C_ITM_GRP),
						// this field is appended by sql coverter.
						S0_T2.itm_cd.as("join_itm_cd_"),
						// this field is appended by sql coverter.
						S0_T2.itm_sub1.as("join_itm_sub1_"),
						// this field is appended by sql coverter.
						S0_T2.itm_sub2.as("join_itm_sub2_"),
						// this field is appended by sql coverter.
						S0_T2.itm_sub3.as("join_itm_sub3_")
					)
					.from(
						S0_T1
						.innerJoin(S0_T6).on(S0_T1.xfr_inst_d_no.eq(S0_T6.xfr_inst_d_no))
						.innerJoin(S0_T7).on(S0_T6.xfr_inst_no.eq(S0_T7.xfr_inst_no))
						.leftOuterJoin(S0_T2).on(S0_T1.xfr_schd_no.eq(S0_T2.xfr_schd_no))
						.leftOuterJoin(S0_T8).on(
							S0_T1.xfr_alloc_sts_no.eq(S0_T8.prov_src_schd_no1)
							.and(S0_T8.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.PROV.value())))
							.and(S0_T8.prov_src_schd_typ.eq(value(MSC_PROV_SRC_SCHD_TYP.XFR.value())))
						)
						.leftOuterJoin(S0_T9).on(
							S0_T9.prov_src_schd_typ.eq(value(MSC_PROV_SRC_SCHD_TYP.XFR.value()))
							.and(S0_T1.xfr_alloc_sts_no.eq(S0_T9.prov_src_schd_no1))
							.and(S0_T9.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.PROV_RTN.value())))
						)
						.leftOuterJoin(S0_T10).on(
							S0_T1.dlv_slip_no.eq(S0_T10.dlv_slip_no)
							.and(S0_T1.dlv_slip_seq.eq(S0_T10.dlv_slip_seq))
						)
						.leftOuterJoin(S0_M1).on(
							S0_T6.itm_cd.eq(S0_M1.itm_cd)
							.and(S0_T6.itm_sub1.eq(S0_M1.itm_sub1))
							.and(S0_T6.itm_sub2.eq(S0_M1.itm_sub2))
							.and(S0_T6.itm_sub3.eq(S0_M1.itm_sub3))
						)
						.leftOuterJoin(S0_M4).on(
							S0_T6.itm_cd.eq(S0_M4.itm_cd)
							.and(S0_T6.itm_sub1.eq(S0_M4.itm_sub1))
							.and(S0_T6.itm_sub2.eq(S0_M4.itm_sub2))
							.and(S0_T6.itm_sub3.eq(S0_M4.itm_sub3))
							.and(S0_T1.sno1.eq(S0_M4.sno1))
							.and(S0_T1.sno2.eq(S0_M4.sno2))
							.and(S0_T1.sno3.eq(S0_M4.sno3))
							.and(S0_T1.sno4.eq(S0_M4.sno4))
						)
						.leftOuterJoin(S0_M24).on(
							S0_T2.rqst_dpt_cd.eq(S0_M24.dpt_cd)
							.and(S0_T2.rcpt_dt.between(S0_M24.st_dt, S0_M24.end_dt))
						)
						.leftOuterJoin(S0_M26).on(
							S0_T1.bd_dpt_cd.eq(S0_M26.dpt_cd)
							.and(S0_T7.xfr_inst_dt.between(S0_M26.st_dt, S0_M26.end_dt))
						)
						.leftOuterJoin(S0_M28).on(
							S0_T7.inst_dpt_cd.eq(S0_M28.dpt_cd)
							.and(S0_T7.xfr_inst_dt.between(S0_M28.st_dt, S0_M28.end_dt))
						)
						.leftOuterJoin(S0_M36).on(
							nvl(
								S0_T6.itm_cd,
								S0_T2.itm_cd
							).eq(S0_M36.itm_cd)
							.and(
								nvl(
									S0_T6.itm_sub1,
									S0_T2.itm_sub1
								).eq(S0_M36.itm_sub1)
							)
							.and(
								nvl(
									S0_T6.itm_sub2,
									S0_T2.itm_sub2
								).eq(S0_M36.itm_sub2)
							)
							.and(
								nvl(
									S0_T6.itm_sub3,
									S0_T2.itm_sub3
								).eq(S0_M36.itm_sub3)
							)
							.and(S0_T1.lg_grp_cd.eq(S0_M36.lg_grp_cd))
						)
						.leftOuterJoin(S0_M37).on(
							S0_T1.lg_grp_cd.eq(S0_M37.lg_grp_cd)
							.and(S0_M37.del_flg.eq(value(false)))
							.and(S0_M37.lg_def_flg.eq(value(true)))
						)
						.addDynamicView()
						.addDynamicView(DS0C_ITM_GRP)
					)
					.where(
						value(0).eq(value(0))
						.and(
							exists(
								subQuery()
								.select(value("X"))
								.from(S1_V1)
								.where(
									S0_T1.gr_loc_cd.eq(S1_V1.loc_cd)
								)
							)
							.or(
								exists(
									subQuery()
									.select(value("X"))
									.from(S2_V2)
									.where(
										S0_T1.lg_grp_cd.eq(S2_V2.lg_grp_cd)
									)
								)
							)
							.or(
								exists(
									subQuery()
									.select(value("X"))
									.from(S3_V3)
									.where(
										value(0).eq(value(0))
										.and(
											S3_V3.loc_cd.eq(coalesce(
													S0_T1.gi_loc_cd,
													S0_M36.lg_def_loc_cd,
													S0_M37.loc_cd
												)
											)
										)
									)
								)
							)
						)
						.and(
							value(true).eq(value(false))
							.cutoff$or(S0_T1.pr_sts_typ.eq(bind("pr_sts_not_inst")))
							.cutoff$or(S0_T1.pr_sts_typ.eq(bind("pr_sts_inst")))
							.cutoff$or(S0_T1.pr_sts_typ.eq(bind("pr_sts_part_xfr")))
							.cutoff$or(S0_T1.pr_sts_typ.eq(bind("pr_sts_cmpl")))
						)
						.cutoff$and(S0_T1.ship_inst_typ.like(bind("ship_inst_typ")))
						.cutoff$and(S0_T1.alloc_flg.eq(bind("alloc_true")))
						.cutoff$and(S0_T1.alloc_flg.neq(bind("not_alloc_true")))
						.cutoff$and(S0_T7.pick_prnt_flg.eq(bind("pick_prnt_true")))
						.cutoff$and(S0_T7.pick_prnt_flg.neq(bind("pick_not_prnt_true")))
						.cutoff$and(S0_T7.inst_prnt_flg.eq(bind("inst_prnt_true")))
						.cutoff$and(S0_T7.inst_prnt_flg.neq(bind("inst_not_prnt_true")))
						.cutoff$and(S0_T10.slip_prnt_flg.eq(bind("dlv_prnt_true")))
						.cutoff$and(S0_T10.slip_prnt_flg.neq(bind("dlv_not_prnt_true")))
						.cutoff$and(
							coalesce(
								S0_T7.xfr_schd_dt,
								S0_T1.xfr_schd_dt
							).gte(bind("xfr_schd_dt_fr"))
						)
						.cutoff$and(
							coalesce(
								S0_T7.xfr_schd_dt,
								S0_T1.xfr_schd_dt
							).lte(bind("xfr_schd_dt_to"))
						)
						.cutoff$and(S0_T7.xfr_inst_dt.gte(bind("xfr_inst_dt_fr")))
						.cutoff$and(S0_T7.xfr_inst_dt.lte(bind("xfr_inst_dt_to")))
						.cutoff$and(S0_T1.wg_cd.like(bind("wg_cd")))
						.addDynamicPredicate()
						.cutoff$and(S0_T1.lg_grp_cd.like(bind("lg_grp_cd")))
						.cutoff$and(S0_T1.gi_loc_cd.like(bind("gi_loc_cd")))
						.cutoff$and(S0_T1.gi_str_ln_cd.like(bind("gi_str_ln_cd")))
						.cutoff$and(S0_T1.gi_stk_arrv_bp_cd.like(bind("gi_stk_arrv_bp_cd")))
						.cutoff$and(S0_T1.gr_loc_cd.like(bind("gr_loc_cd")))
						.cutoff$and(S0_T1.gr_str_ln_cd.like(bind("gr_str_ln_cd")))
						.cutoff$and(S0_T1.gr_stk_arrv_bp_cd.like(bind("gr_stk_arrv_bp_cd")))
						.cutoff$and(S0_M1.itm_typ.like(bind("itm_typ")))
						.cutoff$and(S0_M1.itm_typ_d_cd.like(bind("itm_typ_d_cd")))
						.cutoff$and(S0_T6.itm_cd.like(bind("itm_cd")))
						.cutoff$and(S0_T6.itm_sub1.like(bind("itm_sub1")))
						.cutoff$and(S0_T6.itm_sub2.like(bind("itm_sub2")))
						.cutoff$and(S0_T6.itm_sub3.like(bind("itm_sub3")))
						.cutoff$and(
							coalesce(
								S0_M4.itm_nm,
								S0_M1.itm_nm
							).like(bind("itm_nm"))
						)
						.cutoff$and(S0_T1.ver_no.like(bind("ver_no")))
						.cutoff$and(S0_T1.lot_no.like(bind("lot_no")))
						.cutoff$and(S0_T1.sublot_no.like(bind("sublot_no")))
						.cutoff$and(S0_T1.sno1.like(bind("sno1")))
						.cutoff$and(S0_T1.sno2.like(bind("sno2")))
						.cutoff$and(S0_T1.sno3.like(bind("sno3")))
						.cutoff$and(S0_T1.sno4.like(bind("sno4")))
						.cutoff$and(S0_T1.abort_flg.neq(bind("abort_false")))
						.cutoff$and(S0_T1.trd_unit_cd.like(bind("trd_unit_cd")))
						.cutoff$and(S0_T1.base_unit_cd.like(bind("base_unit_cd")))
						.cutoff$and(S0_M1.pckg_unit_cd.like(bind("pckg_unit_cd")))
						.cutoff$and(S0_T1.gd_cd.like(bind("gd_cd")))
						.cutoff$and(S0_T1.quality_typ.like(bind("quality_typ")))
						.cutoff$and(S0_T1.stk_insp_typ.like(bind("stk_insp_typ")))
						.cutoff$and(S0_T1.stk_id_typ.like(bind("stk_id_typ")))
						.cutoff$and(S0_T1.stk_bp_cd.like(bind("stk_bp_cd")))
						.cutoff$and(
							exists(
								subQuery()
								.select(value("X"))
								.from(
									S4_T1A
									.innerJoin(S4_T2A).on(S4_T1A.xfr_schd_no.eq(S4_T2A.xfr_schd_no))
								)
								.where(
									value(0).eq(value(0))
									.and(S4_T1A.xfr_inst_d_no.eq(S0_T1.xfr_inst_d_no))
									.and(S4_T2A.rqst_usr_cd.like(bind("rqst_usr_cd")))
								)
							)
						)
						.cutoff$and(
							exists(
								subQuery()
								.select(value("X"))
								.from(
									S5_T1A
									.innerJoin(S5_T2A).on(S5_T1A.xfr_schd_no.eq(S5_T2A.xfr_schd_no))
									.innerJoin(S5_M23A).on(S5_T2A.rqst_usr_cd.eq(S5_M23A.usr_cd))
								)
								.where(
									value(0).eq(value(0))
									.and(S5_T1A.xfr_inst_d_no.eq(S0_T1.xfr_inst_d_no))
									.and(S5_M23A.usr_nm.like(bind("rqst_usr_nm")))
								)
							)
						)
						.cutoff$and(
							exists(
								subQuery()
								.select(value("X"))
								.from(
									S6_T1A
									.innerJoin(S6_T2A).on(S6_T1A.xfr_schd_no.eq(S6_T2A.xfr_schd_no))
								)
								.where(
									value(0).eq(value(0))
									.and(S6_T1A.xfr_inst_d_no.eq(S0_T1.xfr_inst_d_no))
									.and(S6_T2A.rqst_dpt_cd.like(bind("rqst_dpt_cd")))
								)
							)
						)
						.cutoff$and(
							exists(
								subQuery()
								.select(value("X"))
								.from(
									S7_T1A
									.innerJoin(S7_T2A).on(S7_T1A.xfr_schd_no.eq(S7_T2A.xfr_schd_no))
									.innerJoin(S7_M24A).on(
										S7_T2A.rqst_dpt_cd.eq(S7_M24A.dpt_cd)
										.and(S7_T2A.rcpt_dt.between(S7_M24A.st_dt, S7_M24A.end_dt))
									)
								)
								.where(
									value(0).eq(value(0))
									.and(S7_T1A.xfr_inst_d_no.eq(S0_T1.xfr_inst_d_no))
									.and(S7_M24A.dpt_nm.like(bind("rqst_dpt_nm")))
								)
							)
						)
						.cutoff$and(S0_T7.inst_usr_cd.like(bind("inst_usr_cd")))
						.cutoff$and(S0_T7.inst_dpt_cd.like(bind("inst_dpt_cd")))
						.cutoff$and(S0_M28.dpt_nm.like(bind("inst_dpt_nm")))
						.cutoff$and(S0_T1.rsn_cd.like(bind("rsn_cd")))
						.cutoff$and(S0_T1.bd_dpt_cd.like(bind("bd_dpt_cd")))
						.cutoff$and(S0_M26.dpt_nm.like(bind("bd_dpt_nm")))
						.cutoff$and(S0_T1.trd_cd.like(bind("trd_cd")))
						.cutoff$and(
							exists(
								subQuery()
								.select(value("X"))
								.from(
									S8_T1A
									.innerJoin(S8_T2A).on(S8_T1A.xfr_schd_no.eq(S8_T2A.xfr_schd_no))
								)
								.where(
									value(0).eq(value(0))
									.and(S8_T1A.xfr_inst_d_no.eq(S0_T1.xfr_inst_d_no))
									.and(S8_T2A.rqst_mod_flg.eq(bind("rqst_mod_true")))
								)
							)
						)
						.cutoff$and(S0_T7.trd_rmrks.like(bind("trd_rmrks")))
						.cutoff$and(S0_T7.inst_rmrks.like(bind("inst_rmrks")))
						.cutoff$and(S0_T7.sub_char1.like(bind("h_sub_char1")))
						.cutoff$and(S0_T7.sub_char2.like(bind("h_sub_char2")))
						.cutoff$and(S0_T7.sub_char3.like(bind("h_sub_char3")))
						.cutoff$and(S0_T1.intr_d_rmrks.like(bind("intr_d_rmrks")))
						.cutoff$and(S0_T1.trd_d_rmrks.like(bind("trd_d_rmrks")))
						.cutoff$and(S0_T1.inst_d_rmrks.like(bind("inst_d_rmrks")))
						.cutoff$and(S0_T1.sub_char1.like(bind("d_sub_char1")))
						.cutoff$and(S0_T1.sub_char2.like(bind("d_sub_char2")))
						.cutoff$and(S0_T1.sub_char3.like(bind("d_sub_char3")))
						.cutoff$and(
							exists(
								subQuery()
								.select(value("X"))
								.from(
									S9_T1A
									.innerJoin(S9_T2A).on(S9_T1A.xfr_schd_no.eq(S9_T2A.xfr_schd_no))
								)
								.where(
									value(0).eq(value(0))
									.and(S9_T1A.xfr_inst_d_no.eq(S0_T1.xfr_inst_d_no))
									.and(S9_T2A.rqst_cnt_rmrks.like(bind("rqst_cnt_rmrks")))
								)
							)
						)
						.cutoff$and(
							exists(
								subQuery()
								.select(value("X"))
								.from(
									S10_T1A
									.innerJoin(S10_T2A).on(S10_T1A.xfr_schd_no.eq(S10_T2A.xfr_schd_no))
								)
								.where(
									value(0).eq(value(0))
									.and(S10_T1A.xfr_inst_d_no.eq(S0_T1.xfr_inst_d_no))
									.and(S10_T2A.ship_cnt_rmrks.like(bind("ship_cnt_rmrks")))
								)
							)
						)
						.cutoff$and(
							exists(
								subQuery()
								.select(value("X"))
								.from(
									S11_T1A
									.innerJoin(S11_T2A).on(S11_T1A.xfr_schd_no.eq(S11_T2A.xfr_schd_no))
								)
								.where(
									value(0).eq(value(0))
									.and(S11_T1A.xfr_inst_d_no.eq(S0_T1.xfr_inst_d_no))
									.and(S11_T2A.intr_rmrks.like(bind("schd_intr_rmrks")))
								)
							)
						)
						.cutoff$and(
							exists(
								subQuery()
								.select(value("X"))
								.from(
									S12_T1A
									.innerJoin(S12_T2A).on(S12_T1A.xfr_schd_no.eq(S12_T2A.xfr_schd_no))
								)
								.where(
									value(0).eq(value(0))
									.and(S12_T1A.xfr_inst_d_no.eq(S0_T1.xfr_inst_d_no))
									.and(S12_T2A.xfr_src_typ.like(bind("xfr_src_typ")))
								)
							)
						)
						.cutoff$and(
							exists(
								subQuery()
								.select(value("X"))
								.from(
									S13_T1A
									.innerJoin(S13_T2A).on(S13_T1A.xfr_schd_no.eq(S13_T2A.xfr_schd_no))
								)
								.where(
									value(0).eq(value(0))
									.and(S13_T1A.xfr_inst_d_no.eq(S0_T1.xfr_inst_d_no))
									.and(S13_T2A.xfr_src_no.like(bind("xfr_src_no")))
								)
							)
						)
						.cutoff$and(
							exists(
								subQuery()
								.select(value("X"))
								.from(S14_T1A)
								.where(
									value(0).eq(value(0))
									.and(S14_T1A.xfr_inst_d_no.eq(S0_T1.xfr_inst_d_no))
									.and(S14_T1A.xfr_schd_no.like(bind("xfr_schd_no")))
								)
							)
						)
						.cutoff$and(S0_T1.xfr_alloc_sts_no.like(bind("xfr_alloc_sts_no")))
						.cutoff$and(S0_T1.dlv_slip_no.like(bind("dlv_slip_no")))
						.cutoff$and(S0_T1.dlv_slip_d_no.like(bind("dlv_slip_d_no")))
						.cutoff$and(S0_T7.xfr_inst_no.like(bind("xfr_inst_no")))
						.cutoff$and(S0_T6.xfr_inst_d_no.like(bind("xfr_inst_d_no")))
						.cutoff$and(
							exists(
								subQuery()
								.select(value("X"))
								.from(
									S15_T1A
									.innerJoin(S15_T2A).on(S15_T1A.xfr_schd_no.eq(S15_T2A.xfr_schd_no))
								)
								.where(
									value(0).eq(value(0))
									.and(S15_T1A.xfr_inst_d_no.eq(S0_T1.xfr_inst_d_no))
									.and(S15_T2A.slo_no.like(bind("slo_no")))
								)
							)
						)
						.cutoff$and(
							exists(
								subQuery()
								.select(value("X"))
								.from(
									S16_T1A
									.innerJoin(S16_T2A).on(S16_T1A.xfr_schd_no.eq(S16_T2A.xfr_schd_no))
								)
								.where(
									value(0).eq(value(0))
									.and(S16_T1A.xfr_inst_d_no.eq(S0_T1.xfr_inst_d_no))
									.and(S16_T2A.mfg_inst_no.like(bind("mfg_inst_no")))
								)
							)
						)
						.cutoff$and(
							exists(
								subQuery()
								.select(value("X"))
								.from(
									S17_T1A
									.innerJoin(S17_T2A).on(S17_T1A.xfr_schd_no.eq(S17_T2A.xfr_schd_no))
								)
								.where(
									value(0).eq(value(0))
									.and(S17_T1A.xfr_inst_d_no.eq(S0_T1.xfr_inst_d_no))
									.and(S17_T2A.oper_inst_no.like(bind("oper_inst_no")))
								)
							)
						)
						.cutoff$and(S0_T1.io_schd_pr_no.like(bind("io_schd_pr_no")))
						.addDynamicPredicate(DS0C_ITM_GRP)
					)
					.orderBy(
						S0_T7.xfr_inst_no.asc(),
						S0_T1.disp_seq.asc(),
						S0_T6.xfr_inst_d_no.asc()
					)
			)
			.setDynamicSQLInfo(
				when(boundOr("wrk_no", "wrk_nm"))
					.view(v -> v.leftOuterJoin(S0_T4).on(S0_T1.sno1.eq(S0_T4.sno1)))
					.predicate(p -> p.cutoff$and(S0_T4.wrk_no.like(bind("wrk_no"))).cutoff$and(S0_T4.wrk_nm.like(bind("wrk_nm")))),
				when(boundOr("itm_typ_d_nm"))
					.view(v -> v.leftOuterJoin(S0_M2).on(S0_M1.itm_typ.eq(S0_M2.itm_typ).and(S0_M1.itm_typ_d_cd.eq(S0_M2.itm_typ_d_cd))))
					.predicate(p -> p.cutoff$and(S0_M2.itm_typ_d_nm.like(bind("itm_typ_d_nm")))),
				when(boundOr("trd_nm"))
					.view(v -> v.leftOuterJoin(S0_M3).on(S0_T1.trd_cd.eq(S0_M3.trd_cd)))
					.predicate(p -> p.cutoff$and(S0_M3.trd_nm.like(bind("trd_nm")))),
				when(boundOr("trd_unit_nm"))
					.view(v -> v.leftOuterJoin(S0_M5).on(S0_T1.trd_unit_cd.eq(S0_M5.unit_cd)))
					.predicate(p -> p.cutoff$and(S0_M5.unit_nm.like(bind("trd_unit_nm")))),
				when(boundOr("base_unit_nm"))
					.view(v -> v.leftOuterJoin(S0_M7).on(S0_T1.base_unit_cd.eq(S0_M7.unit_cd)))
					.predicate(p -> p.cutoff$and(S0_M7.unit_nm.like(bind("base_unit_nm")))),
				when(boundOr("pckg_unit_nm"))
					.view(v -> v.leftOuterJoin(S0_M9).on(S0_M1.pckg_unit_cd.eq(S0_M9.unit_cd)))
					.predicate(p -> p.cutoff$and(S0_M9.unit_nm.like(bind("pckg_unit_nm")))),
				when(boundOr("wg_nm"))
					.view(v -> v.leftOuterJoin(S0_M11).on(S0_T1.wg_cd.eq(S0_M11.wg_cd)))
					.predicate(p -> p.cutoff$and(S0_M11.wg_nm.like(bind("wg_nm")))),
				when(boundOr("lg_grp_nm"))
					.view(v -> v.leftOuterJoin(S0_M12).on(S0_T1.lg_grp_cd.eq(S0_M12.lg_grp_cd)))
					.predicate(p -> p.cutoff$and(S0_M12.lg_grp_nm.like(bind("lg_grp_nm")))),
				when(boundOr("gi_site_nm", "gi_loc_nm", "gi_site_cd"))
					.view(v -> v.leftOuterJoin(S0_M13).on(S0_T1.gi_loc_cd.eq(S0_M13.loc_cd)))
					.predicate(p -> p.cutoff$and(S0_M13.loc_nm.like(bind("gi_loc_nm"))).cutoff$and(S0_M13.site_cd.like(bind("gi_site_cd")))),
				when(boundOr("gi_str_ln_nm"))
					.view(v -> v.leftOuterJoin(S0_M14).on(S0_T1.gi_loc_cd.eq(S0_M14.loc_cd).and(S0_T1.gi_str_ln_cd.eq(S0_M14.str_ln_cd))))
					.predicate(p -> p.cutoff$and(S0_M14.str_ln_nm.like(bind("gi_str_ln_nm")))),
				when(boundOr("gi_stk_arrv_bp_nm"))
					.view(v -> v.leftOuterJoin(S0_M15).on(S0_T1.gi_stk_arrv_bp_cd.eq(S0_M15.bp_cd)))
					.predicate(p -> p.cutoff$and(S0_M15.bp_nm.like(bind("gi_stk_arrv_bp_nm")))),
				when(boundOr("gi_site_nm"))
					.view(v -> v.leftOuterJoin(S0_M16).on(S0_M13.site_cd.eq(S0_M16.site_cd)))
					.predicate(p -> p.cutoff$and(S0_M16.site_nm.like(bind("gi_site_nm")))),
				when(boundOr("gr_site_nm", "gr_loc_nm", "gr_site_cd"))
					.view(v -> v.leftOuterJoin(S0_M17).on(S0_T1.gr_loc_cd.eq(S0_M17.loc_cd)))
					.predicate(p -> p.cutoff$and(S0_M17.loc_nm.like(bind("gr_loc_nm"))).cutoff$and(S0_M17.site_cd.like(bind("gr_site_cd")))),
				when(boundOr("gr_str_ln_nm"))
					.view(v -> v.leftOuterJoin(S0_M18).on(S0_T1.gr_loc_cd.eq(S0_M18.loc_cd).and(S0_T1.gr_str_ln_cd.eq(S0_M18.str_ln_cd))))
					.predicate(p -> p.cutoff$and(S0_M18.str_ln_nm.like(bind("gr_str_ln_nm")))),
				when(boundOr("gr_stk_arrv_bp_nm"))
					.view(v -> v.leftOuterJoin(S0_M19).on(S0_T1.gr_stk_arrv_bp_cd.eq(S0_M19.bp_cd)))
					.predicate(p -> p.cutoff$and(S0_M19.bp_nm.like(bind("gr_stk_arrv_bp_nm")))),
				when(boundOr("gr_site_nm"))
					.view(v -> v.leftOuterJoin(S0_M20).on(S0_M17.site_cd.eq(S0_M20.site_cd)))
					.predicate(p -> p.cutoff$and(S0_M20.site_nm.like(bind("gr_site_nm")))),
				when(boundOr("gd_nm"))
					.view(v -> v.leftOuterJoin(S0_M21).on(S0_T1.gd_cd.eq(S0_M21.gd_cd)))
					.predicate(p -> p.cutoff$and(S0_M21.gd_nm.like(bind("gd_nm")))),
				when(boundOr("stk_bp_nm"))
					.view(v -> v.leftOuterJoin(S0_M22).on(S0_T1.stk_bp_cd.eq(S0_M22.bp_cd)))
					.predicate(p -> p.cutoff$and(S0_M22.bp_nm.like(bind("stk_bp_nm")))),
				when(boundOr("rsn_nm"))
					.view(v -> v.leftOuterJoin(S0_M25).on(S0_T1.rsn_cd.eq(S0_M25.biz_rsn_cd)))
					.predicate(p -> p.cutoff$and(S0_M25.biz_rsn_nm.like(bind("rsn_nm")))),
				when(boundOr("inst_usr_nm"))
					.view(v -> v.leftOuterJoin(S0_M27).on(S0_T7.inst_usr_cd.eq(S0_M27.usr_cd)))
					.predicate(p -> p.cutoff$and(S0_M27.usr_nm.like(bind("inst_usr_nm")))),
				when(boundOr("itm_grp_flg1"))
					.select(DS0C_ITM_GRP, S0_M1.itm_grp_cd1.as("itm_grp_cd1"), S0_MM1.itm_grp_nm.as("itm_grp_nm1"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM1).on(S0_M1.itm_grp_cd1.eq(S0_MM1.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP1.value()).eq(S0_MM1.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M1.itm_grp_cd1.like(bind("itm_grp_cd1"))).cutoff$and(S0_MM1.itm_grp_nm.like(bind("itm_grp_nm1")))),
				when(boundOr("itm_grp_flg2"))
					.select(DS0C_ITM_GRP, S0_M1.itm_grp_cd2.as("itm_grp_cd2"), S0_MM2.itm_grp_nm.as("itm_grp_nm2"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM2).on(S0_M1.itm_grp_cd2.eq(S0_MM2.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP2.value()).eq(S0_MM2.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M1.itm_grp_cd2.like(bind("itm_grp_cd2"))).cutoff$and(S0_MM2.itm_grp_nm.like(bind("itm_grp_nm2")))),
				when(boundOr("itm_grp_flg3"))
					.select(DS0C_ITM_GRP, S0_M1.itm_grp_cd3.as("itm_grp_cd3"), S0_MM3.itm_grp_nm.as("itm_grp_nm3"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM3).on(S0_M1.itm_grp_cd3.eq(S0_MM3.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP3.value()).eq(S0_MM3.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M1.itm_grp_cd3.like(bind("itm_grp_cd3"))).cutoff$and(S0_MM3.itm_grp_nm.like(bind("itm_grp_nm3")))),
				when(boundOr("itm_grp_flg4"))
					.select(DS0C_ITM_GRP, S0_M1.itm_grp_cd4.as("itm_grp_cd4"), S0_MM4.itm_grp_nm.as("itm_grp_nm4"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM4).on(S0_M1.itm_grp_cd4.eq(S0_MM4.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP4.value()).eq(S0_MM4.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M1.itm_grp_cd4.like(bind("itm_grp_cd4"))).cutoff$and(S0_MM4.itm_grp_nm.like(bind("itm_grp_nm4")))),
				when(boundOr("itm_grp_flg5"))
					.select(DS0C_ITM_GRP, S0_M1.itm_grp_cd5.as("itm_grp_cd5"), S0_MM5.itm_grp_nm.as("itm_grp_nm5"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM5).on(S0_M1.itm_grp_cd5.eq(S0_MM5.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP5.value()).eq(S0_MM5.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M1.itm_grp_cd5.like(bind("itm_grp_cd5"))).cutoff$and(S0_MM5.itm_grp_nm.like(bind("itm_grp_nm5")))),
				when(boundOr("itm_grp_flg6"))
					.select(DS0C_ITM_GRP, S0_M1.itm_grp_cd6.as("itm_grp_cd6"), S0_MM6.itm_grp_nm.as("itm_grp_nm6"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM6).on(S0_M1.itm_grp_cd6.eq(S0_MM6.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP6.value()).eq(S0_MM6.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M1.itm_grp_cd6.like(bind("itm_grp_cd6"))).cutoff$and(S0_MM6.itm_grp_nm.like(bind("itm_grp_nm6")))),
				when(boundOr("itm_grp_flg7"))
					.select(DS0C_ITM_GRP, S0_M1.itm_grp_cd7.as("itm_grp_cd7"), S0_MM7.itm_grp_nm.as("itm_grp_nm7"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM7).on(S0_M1.itm_grp_cd7.eq(S0_MM7.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP7.value()).eq(S0_MM7.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M1.itm_grp_cd7.like(bind("itm_grp_cd7"))).cutoff$and(S0_MM7.itm_grp_nm.like(bind("itm_grp_nm7")))),
				when(boundOr("itm_grp_flg8"))
					.select(DS0C_ITM_GRP, S0_M1.itm_grp_cd8.as("itm_grp_cd8"), S0_MM8.itm_grp_nm.as("itm_grp_nm8"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM8).on(S0_M1.itm_grp_cd8.eq(S0_MM8.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP8.value()).eq(S0_MM8.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M1.itm_grp_cd8.like(bind("itm_grp_cd8"))).cutoff$and(S0_MM8.itm_grp_nm.like(bind("itm_grp_nm8")))),
				when(boundOr("itm_grp_flg9"))
					.select(DS0C_ITM_GRP, S0_M1.itm_grp_cd9.as("itm_grp_cd9"), S0_MM9.itm_grp_nm.as("itm_grp_nm9"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM9).on(S0_M1.itm_grp_cd9.eq(S0_MM9.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP9.value()).eq(S0_MM9.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M1.itm_grp_cd9.like(bind("itm_grp_cd9"))).cutoff$and(S0_MM9.itm_grp_nm.like(bind("itm_grp_nm9")))),
				when(boundOr("itm_grp_flg10"))
					.select(DS0C_ITM_GRP, S0_M1.itm_grp_cd10.as("itm_grp_cd10"), S0_MM10.itm_grp_nm.as("itm_grp_nm10"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM10).on(S0_M1.itm_grp_cd10.eq(S0_MM10.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP10.value()).eq(S0_MM10.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M1.itm_grp_cd10.like(bind("itm_grp_cd10"))).cutoff$and(S0_MM10.itm_grp_nm.like(bind("itm_grp_nm10"))))
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
						.add(MSVT_WRK_SNO_R.class, r -> toCondition(
							r.getStringNE("sno1")
						))
						.addSelect(m -> toArray(
							m.wrk_nm,
							m.wrk_no
						))
						.addMap((r, m) -> {
							r.setStringNE("wrk_no", m.wrk_no());
							r.setStringNE("wkk_nm", m.wrk_nm());
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
							r.setNumberNE("trd_unit_conv_base_qty", m.conv_base_qty());
							r.setNumberNE("trd_unit_conv_qty", m.conv_qty());
							r.setNumberNE("trd_unit_dec_place", m.dec_place());
							r.setStringNE("trd_unit_rnd_typ", m.rnd_typ());
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
						.add(MAM_UNIT_R.class, r -> toCondition(
							r.getStringNE("pckg_unit_cd")
						))
						.addSelect(m -> toArray(
							m.unit_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("pckg_unit_nm", m.unit_nm());
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
						.add(MAM_LG_GRP_R.class, r -> toCondition(
							r.getStringNE("lg_grp_cd")
						))
						.addSelect(m -> toArray(
							m.lg_grp_nm,
							m.pick_list_flg,
							m.ship_inst_flg,
							m.ship_slip_flg
						))
						.addMap((r, m) -> {
							r.setStringNE("lg_grp_nm", m.lg_grp_nm());
							r.setBooleanNE("immd_dlv_prnt_flg", m.ship_slip_flg());
							r.setBooleanNE("immd_pick_prnt_flg", m.pick_list_flg());
							r.setBooleanNE("immd_inst_prnt_flg", m.ship_inst_flg());
					}),
					j -> j
						.add(MAM_LOC_R.class, r -> toCondition(
							r.getStringNE("gi_loc_cd")
						))
						.addSelect(m -> toArray(
							m.loc_nm,
							m.site_cd,
							m.sppl_cd,
							m.str_ln_tgt_flg
						))
						.addMap((r, m) -> {
							r.setStringNE("gi_loc_nm", m.loc_nm());
							r.setBooleanNE("gi_str_ln_tgt_flg", m.str_ln_tgt_flg());
							r.setStringNE("gi_sppl_cd", m.sppl_cd());
							r.setStringNE("gi_site_cd", m.site_cd());
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
							r.setStringNE("gi_str_ln_nm", m.str_ln_nm());
					}),
					j -> j
						.add(MAM_BP_R.class, r -> toCondition(
							r.getStringNE("gi_stk_arrv_bp_cd")
						))
						.addSelect(m -> toArray(
							m.bp_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("gi_stk_arrv_bp_nm", m.bp_nm());
					}),
					j -> j
						.add(MAM_SITE_R.class, r -> toCondition(
							r.getStringNE("gi_site_cd")
						))
						.addSelect(m -> toArray(
							m.site_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("gi_site_nm", m.site_nm());
					}),
					j -> j
						.add(MAM_LOC_R.class, r -> toCondition(
							r.getStringNE("gr_loc_cd")
						))
						.addSelect(m -> toArray(
							m.loc_nm,
							m.site_cd,
							m.sppl_cd,
							m.str_ln_tgt_flg
						))
						.addMap((r, m) -> {
							r.setStringNE("gr_loc_nm", m.loc_nm());
							r.setBooleanNE("gr_str_ln_tgt_flg", m.str_ln_tgt_flg());
							r.setStringNE("gr_sppl_cd", m.sppl_cd());
							r.setStringNE("gr_site_cd", m.site_cd());
					}),
					j -> j
						.add(MAM_STR_LN_R.class, r -> toCondition(
							r.getStringNE("gr_loc_cd"),
							r.getStringNE("gr_str_ln_cd")
						))
						.addSelect(m -> toArray(
							m.str_ln_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("gr_str_ln_nm", m.str_ln_nm());
					}),
					j -> j
						.add(MAM_BP_R.class, r -> toCondition(
							r.getStringNE("gr_stk_arrv_bp_cd")
						))
						.addSelect(m -> toArray(
							m.bp_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("gr_stk_arrv_bp_nm", m.bp_nm());
					}),
					j -> j
						.add(MAM_SITE_R.class, r -> toCondition(
							r.getStringNE("gr_site_cd")
						))
						.addSelect(m -> toArray(
							m.site_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("gr_site_nm", m.site_nm());
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
							r.getStringNE("stk_bp_cd")
						))
						.addSelect(m -> toArray(
							m.bp_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("stk_bp_nm", m.bp_nm());
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
						.add(MAM_BIZ_RSN_R.class, r -> toCondition(
							r.getStringNE("rsn_cd")
						))
						.addSelect(m -> toArray(
							m.acxfr_gi_flg,
							m.biz_rsn_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("rsn_nm", m.biz_rsn_nm());
							r.setBooleanNE("acxfr_gi_flg", m.acxfr_gi_flg());
					}),
					j -> j
						.add(MAM_USR_R.class, r -> toCondition(
							r.getStringNE("inst_usr_cd")
						))
						.addSelect(m -> toArray(
							m.usr_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("inst_usr_nm", m.usr_nm());
					}),
					j -> j
						.add(MAM_BP_R.class, r -> toCondition(
							r.getStringNE("gi_sppl_cd")
						))
						.addSelect(m -> toArray(
							m.bp_nm,
							m.onr_prsppl_flg,
							m.prov_basis_typ
						))
						.addMap((r, m) -> {
							r.setStringNE("gi_sppl_nm", m.bp_nm());
							r.setBooleanNE("gi_onr_prsppl_flg", m.onr_prsppl_flg());
							r.setStringNE("gi_prov_basis_typ", m.prov_basis_typ());
					}),
					j -> j
						.add(MAM_BP_R.class, r -> toCondition(
							r.getStringNE("gr_sppl_cd")
						))
						.addSelect(m -> toArray(
							m.bp_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("gr_sppl_nm", m.bp_nm());
					}),
					j -> j
						.add(MAVM_ITM_UNIT_R.class, r -> toCondition(
							r.getStringNE("itm_cd"),
							r.getStringNE("itm_sub1"),
							r.getStringNE("itm_sub2"),
							r.getStringNE("itm_sub3"),
							r.getStringNE("pckg_unit_cd")
						))
						.addSelect(m -> toArray(
							m.conv_base_qty,
							m.conv_qty,
							m.dec_place
						))
						.addMap((r, m) -> {
							r.setNumberNE("pckg_unit_conv_base_qty", m.conv_base_qty());
							r.setNumberNE("pckg_unit_conv_qty", m.conv_qty());
							r.setNumberNE("pckg_unit_dec_place", m.dec_place());
					}),
					j -> j
						.add(MAM_UNIT_R.class, r -> toCondition(
							r.getStringNE("schd_unit_cd")
						))
						.addSelect(m -> toArray(
							m.unit_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("schd_unit_nm", m.unit_nm());
					}),
					j -> j
						.add(MAVM_ITM_UNIT_R.class, r -> toCondition(
							r.getStringNE("join_itm_cd_"),
							r.getStringNE("join_itm_sub1_"),
							r.getStringNE("join_itm_sub2_"),
							r.getStringNE("join_itm_sub3_"),
							r.getStringNE("schd_unit_cd")
						))
						.addSelect(m -> toArray(
							m.dec_place
						))
						.addMap((r, m) -> {
							r.setNumberNE("schd_unit_dec_place", m.dec_place());
					})
				)
			);
	}
	
	/**
	 * -- MSBEL1050_MST_XFR_INST_Query_S01
	 */
	static MCQueryPlan MSBEL1050_MST_XFR_INST_S01() {
		MST_XFR_INST_R S0_T1 = MST_XFR_INST_R.create("T1");
		MAM_TRD_R S0_M3 = MAM_TRD_R.create("M3");
		MAM_WG_R S0_M11 = MAM_WG_R.create("M11");
		MAM_LG_GRP_R S0_M12 = MAM_LG_GRP_R.create("M12");
		MAM_LOC_R S0_M17 = MAM_LOC_R.create("M17");
		MAM_BP_R S0_M19 = MAM_BP_R.create("M19");
		MAM_SITE_R S0_M20 = MAM_SITE_R.create("M20");
		MAM_USR_R S0_M27 = MAM_USR_R.create("M27");
		MAM_DPT_R S0_M28 = MAM_DPT_R.create("M28");
		MST_XFR_INST_D_R S1_W1 = MST_XFR_INST_D_R.create("W1");
		MST_XFR_ALLOC_STS_R S1_W2 = MST_XFR_ALLOC_STS_R.create("W2");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBEL1050_MST_XFR_INST_Query_S01")
					.mainQuery()
					.select(
						S0_T1.trd_cd,
						S0_T1.xfr_schd_dt,
						S0_T1.xfr_inst_dt,
						value((MCDate) null).as("xfr_act_dt"),
						value((MCDate) null).as("xfr_ac_dt"),
						value((MCDate) null).as("can_ac_dt"),
						S0_T1.wg_cd,
						S0_T1.lg_grp_cd,
						S0_T1.gr_loc_cd,
						S0_T1.gr_stk_arrv_bp_cd,
						S0_T1.inst_usr_cd,
						S0_T1.inst_dpt_cd,
						S0_M28.dpt_nm.as("inst_dpt_nm"),
						nullValue().as("act_usr_cd"),
						nullValue().as("act_usr_nm"),
						nullValue().as("act_dpt_cd"),
						nullValue().as("act_dpt_nm"),
						S0_T1.pick_prnt_flg,
						S0_T1.inst_prnt_flg,
						S0_T1.dlv_prnt_flg,
						nullValue().as("intr_rmrks"),
						S0_T1.trd_rmrks.as("trd_rmrks"),
						S0_T1.inst_rmrks.as("inst_rmrks"),
						S0_T1.sub_char1.as("h_sub_char1"),
						S0_T1.sub_char2.as("h_sub_char2"),
						S0_T1.sub_char3.as("h_sub_char3"),
						S0_T1.xfr_inst_no.as("xfr_inst_no"),
						nullValue().as("xfr_act_no"),
						S0_T1.ins_usr_id,
						S0_T1.ins_usr_nm,
						S0_T1.ins_func_id,
						S0_T1.ins_ts,
						S0_T1.upd_cntr.as("inst_upd_cntr"),
						value((MCNumber) null).as("act_upd_cntr"),
						S0_T1.upd_usr_id,
						S0_T1.upd_usr_nm,
						S0_T1.upd_func_id,
						S0_T1.upd_ts,
						S0_T1.upd_srv_req_no
					)
					.from(
						S0_T1
						.leftOuterJoin(S0_M28).on(
							bracket(
								S0_T1.inst_dpt_cd.eq(S0_M28.dpt_cd)
								.and(S0_T1.xfr_inst_dt.between(S0_M28.st_dt, S0_M28.end_dt))
							)
						)
						.addDynamicView()
					)
					.where(
						value(0).eq(value(0))
						.cutoff$and(S0_T1.pick_prnt_flg.eq(bind("pick_prnt_true")))
						.cutoff$and(S0_T1.pick_prnt_flg.neq(bind("pick_not_prnt_true")))
						.cutoff$and(S0_T1.inst_prnt_flg.eq(bind("inst_prnt_true")))
						.cutoff$and(S0_T1.inst_prnt_flg.neq(bind("inst_not_prnt_true")))
						.cutoff$and(S0_T1.dlv_prnt_flg.eq(bind("dlv_prnt_true")))
						.cutoff$and(S0_T1.dlv_prnt_flg.neq(bind("dlv_not_prnt_true")))
						.cutoff$and(S0_T1.xfr_schd_dt.gte(bind("xfr_schd_dt_fr")))
						.cutoff$and(S0_T1.xfr_schd_dt.lte(bind("xfr_schd_dt_to")))
						.cutoff$and(S0_T1.xfr_inst_dt.gte(bind("xfr_inst_dt_fr")))
						.cutoff$and(S0_T1.xfr_inst_dt.lte(bind("xfr_inst_dt_to")))
						.cutoff$and(S0_T1.wg_cd.like(bind("wg_cd")))
						.addDynamicPredicate()
						.cutoff$and(S0_T1.lg_grp_cd.like(bind("lg_grp_cd")))
						.cutoff$and(S0_T1.gr_loc_cd.like(bind("gr_loc_cd")))
						.cutoff$and(S0_T1.gr_stk_arrv_bp_cd.like(bind("gr_stk_arrv_bp_cd")))
						.cutoff$and(S0_T1.inst_usr_cd.like(bind("inst_usr_cd")))
						.cutoff$and(S0_T1.inst_dpt_cd.like(bind("inst_dpt_cd")))
						.cutoff$and(S0_M28.dpt_nm.like(bind("inst_dpt_nm")))
						.cutoff$and(S0_T1.trd_cd.like(bind("trd_cd")))
						.cutoff$and(S0_T1.trd_rmrks.like(bind("trd_rmrks")))
						.cutoff$and(S0_T1.inst_rmrks.like(bind("inst_rmrks")))
						.cutoff$and(S0_T1.sub_char1.like(bind("h_sub_char1")))
						.cutoff$and(S0_T1.sub_char2.like(bind("h_sub_char2")))
						.cutoff$and(S0_T1.sub_char3.like(bind("h_sub_char3")))
						.cutoff$and(S0_T1.xfr_inst_no.like(bind("xfr_inst_no")))
						.cutoff$and(
							exists(
								subQuery()
								.select(value("X"))
								.from(
									S1_W1
									.innerJoin(S1_W2).on(S1_W2.xfr_inst_d_no.eq(S1_W1.xfr_inst_d_no))
								)
								.where(
									value(0).eq(value(0))
									.and(S1_W1.xfr_inst_no.eq(S0_T1.xfr_inst_no))
									.and(S1_W2.abort_flg.eq(bind("no_abort")))
								)
							)
						)
					)
					.orderBy(S0_T1.xfr_inst_no.asc())
			)
			.setDynamicSQLInfo(
				when(boundOr("trd_nm"))
					.view(v -> v.leftOuterJoin(S0_M3).on(bracket(S0_T1.trd_cd.eq(S0_M3.trd_cd))))
					.predicate(p -> p.cutoff$and(S0_M3.trd_nm.like(bind("trd_nm")))),
				when(boundOr("wg_nm"))
					.view(v -> v.leftOuterJoin(S0_M11).on(bracket(S0_T1.wg_cd.eq(S0_M11.wg_cd))))
					.predicate(p -> p.cutoff$and(S0_M11.wg_nm.like(bind("wg_nm")))),
				when(boundOr("lg_grp_nm"))
					.view(v -> v.leftOuterJoin(S0_M12).on(bracket(S0_T1.lg_grp_cd.eq(S0_M12.lg_grp_cd))))
					.predicate(p -> p.cutoff$and(S0_M12.lg_grp_nm.like(bind("lg_grp_nm")))),
				when(boundOr("gr_site_nm", "gr_loc_nm", "gr_site_cd"))
					.view(v -> v.leftOuterJoin(S0_M17).on(bracket(S0_T1.gr_loc_cd.eq(S0_M17.loc_cd))))
					.predicate(p -> p.cutoff$and(S0_M17.loc_nm.like(bind("gr_loc_nm"))).cutoff$and(S0_M17.site_cd.like(bind("gr_site_cd")))),
				when(boundOr("gr_stk_arrv_bp_nm"))
					.view(v -> v.leftOuterJoin(S0_M19).on(bracket(S0_T1.gr_stk_arrv_bp_cd.eq(S0_M19.bp_cd))))
					.predicate(p -> p.cutoff$and(S0_M19.bp_nm.like(bind("gr_stk_arrv_bp_nm")))),
				when(boundOr("gr_site_nm"))
					.view(v -> v.leftOuterJoin(S0_M20).on(bracket(S0_M17.site_cd.eq(S0_M20.site_cd))))
					.predicate(p -> p.cutoff$and(S0_M20.site_nm.like(bind("gr_site_nm")))),
				when(boundOr("inst_usr_nm"))
					.view(v -> v.leftOuterJoin(S0_M27).on(bracket(S0_T1.inst_usr_cd.eq(S0_M27.usr_cd))))
					.predicate(p -> p.cutoff$and(S0_M27.usr_nm.like(bind("inst_usr_nm"))))
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
							r.getStringNE("wg_cd")
						))
						.addSelect(m -> toArray(
							m.wg_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("wg_nm", m.wg_nm());
					}),
					j -> j
						.add(MAM_LG_GRP_R.class, r -> toCondition(
							r.getStringNE("lg_grp_cd")
						))
						.addSelect(m -> toArray(
							m.lg_grp_nm,
							m.pick_list_flg,
							m.ship_inst_flg,
							m.ship_slip_flg
						))
						.addMap((r, m) -> {
							r.setStringNE("lg_grp_nm", m.lg_grp_nm());
							r.setBooleanNE("immd_dlv_prnt_flg", m.ship_slip_flg());
							r.setBooleanNE("immd_pick_prnt_flg", m.pick_list_flg());
							r.setBooleanNE("immd_inst_prnt_flg", m.ship_inst_flg());
					}),
					j -> j
						.add(MAM_LOC_R.class, r -> toCondition(
							r.getStringNE("gr_loc_cd")
						))
						.addSelect(m -> toArray(
							m.loc_nm,
							m.site_cd,
							m.str_ln_tgt_flg
						))
						.addMap((r, m) -> {
							r.setStringNE("gr_loc_nm", m.loc_nm());
							r.setBooleanNE("gr_str_ln_tgt_flg", m.str_ln_tgt_flg());
							r.setStringNE("gr_site_cd", m.site_cd());
					}),
					j -> j
						.add(MAM_BP_R.class, r -> toCondition(
							r.getStringNE("gr_stk_arrv_bp_cd")
						))
						.addSelect(m -> toArray(
							m.bp_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("gr_stk_arrv_bp_nm", m.bp_nm());
					}),
					j -> j
						.add(MAM_SITE_R.class, r -> toCondition(
							r.getStringNE("gr_site_cd")
						))
						.addSelect(m -> toArray(
							m.site_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("gr_site_nm", m.site_nm());
					}),
					j -> j
						.add(MAM_USR_R.class, r -> toCondition(
							r.getStringNE("inst_usr_cd")
						))
						.addSelect(m -> toArray(
							m.usr_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("inst_usr_nm", m.usr_nm());
					})
				)
			);
	}
	/**
	 * -- MSBEL1050_MST_XFR_INST_Query_S02
	 */
	static MCQueryPlan MSBEL1050_MST_XFR_INST_S02() {
		MST_XFR_INST_R S0_T1 = MST_XFR_INST_R.create("T1");
		MST_XFR_INST_D_R S0_T2 = MST_XFR_INST_D_R.create("T2");
		MST_XFR_ALLOC_STS_R S0_T3 = MST_XFR_ALLOC_STS_R.create("T3");
		MST_DLV_SLIP_R S0_T4 = MST_DLV_SLIP_R.create("T4");
		MAM_TRD_R S0_M3 = MAM_TRD_R.create("M3");
		MAM_WG_R S0_M11 = MAM_WG_R.create("M11");
		MAM_LG_GRP_R S0_M12 = MAM_LG_GRP_R.create("M12");
		MAM_LOC_R S0_M17 = MAM_LOC_R.create("M17");
		MAM_BP_R S0_M19 = MAM_BP_R.create("M19");
		MAM_SITE_R S0_M20 = MAM_SITE_R.create("M20");
		MAM_USR_R S0_M27 = MAM_USR_R.create("M27");
		MAM_DPT_R S0_M28 = MAM_DPT_R.create("M28");
		MST_XFR_INST_D_R S1_W1 = MST_XFR_INST_D_R.create("W1");
		MST_XFR_ALLOC_STS_R S1_W2 = MST_XFR_ALLOC_STS_R.create("W2");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBEL1050_MST_XFR_INST_Query_S02")
					.mainQuery()
					.select(
						S0_T1.trd_cd,
						S0_T1.xfr_schd_dt,
						S0_T1.xfr_inst_dt,
						value((MCDate) null).as("xfr_act_dt"),
						value((MCDate) null).as("xfr_ac_dt"),
						value((MCDate) null).as("can_ac_dt"),
						S0_T1.wg_cd,
						S0_T1.lg_grp_cd,
						S0_T1.gr_loc_cd,
						S0_T1.gr_stk_arrv_bp_cd,
						S0_T1.inst_usr_cd,
						S0_T1.inst_dpt_cd,
						S0_M28.dpt_nm.as("inst_dpt_nm"),
						nullValue().as("act_usr_cd"),
						nullValue().as("act_usr_nm"),
						nullValue().as("act_dpt_cd"),
						nullValue().as("act_dpt_nm"),
						S0_T1.pick_prnt_flg,
						S0_T1.inst_prnt_flg,
						S0_T4.slip_prnt_flg.as("dlv_prnt_flg"),
						nullValue().as("intr_rmrks"),
						S0_T1.trd_rmrks.as("trd_rmrks"),
						S0_T1.inst_rmrks.as("inst_rmrks"),
						S0_T1.sub_char1.as("h_sub_char1"),
						S0_T1.sub_char2.as("h_sub_char2"),
						S0_T1.sub_char3.as("h_sub_char3"),
						S0_T1.xfr_inst_no.as("xfr_inst_no"),
						nullValue().as("xfr_act_no"),
						S0_T3.dlv_slip_no,
						S0_T4.ins_usr_id,
						S0_T4.ins_usr_nm,
						S0_T4.ins_func_id,
						S0_T4.ins_ts,
						S0_T1.upd_cntr.as("inst_upd_cntr"),
						value((MCNumber) null).as("act_upd_cntr"),
						S0_T4.upd_usr_id,
						S0_T4.upd_usr_nm,
						S0_T4.upd_func_id,
						S0_T4.upd_ts,
						S0_T4.upd_srv_req_no
					)
					.from(
						S0_T1
						.innerJoin(S0_T2).on(
							bracket(
								S0_T1.xfr_inst_no.eq(S0_T2.xfr_inst_no)
							)
						)
						.innerJoin(S0_T3).on(
							bracket(
								S0_T2.xfr_inst_d_no.eq(S0_T3.xfr_inst_d_no)
							)
						)
						.innerJoin(S0_T4).on(
							bracket(
								S0_T3.dlv_slip_no.eq(S0_T4.dlv_slip_no)
								.and(S0_T3.dlv_slip_seq.eq(S0_T4.dlv_slip_seq))
							)
						)
						.leftOuterJoin(S0_M28).on(
							bracket(
								S0_T1.inst_dpt_cd.eq(S0_M28.dpt_cd)
								.and(S0_T1.xfr_inst_dt.between(S0_M28.st_dt, S0_M28.end_dt))
							)
						)
						.addDynamicView()
					)
					.where(
						value(0).eq(value(0))
						.cutoff$and(S0_T1.pick_prnt_flg.eq(bind("pick_prnt_true")))
						.cutoff$and(S0_T1.pick_prnt_flg.neq(bind("pick_not_prnt_true")))
						.cutoff$and(S0_T1.inst_prnt_flg.eq(bind("inst_prnt_true")))
						.cutoff$and(S0_T1.inst_prnt_flg.neq(bind("inst_not_prnt_true")))
						.cutoff$and(S0_T4.slip_prnt_flg.eq(bind("dlv_prnt_true")))
						.cutoff$and(S0_T4.slip_prnt_flg.neq(bind("dlv_not_prnt_true")))
						.cutoff$and(S0_T1.xfr_schd_dt.gte(bind("xfr_schd_dt_fr")))
						.cutoff$and(S0_T1.xfr_schd_dt.lte(bind("xfr_schd_dt_to")))
						.cutoff$and(S0_T1.xfr_inst_dt.gte(bind("xfr_inst_dt_fr")))
						.cutoff$and(S0_T1.xfr_inst_dt.lte(bind("xfr_inst_dt_to")))
						.cutoff$and(S0_T1.wg_cd.like(bind("wg_cd")))
						.addDynamicPredicate()
						.cutoff$and(S0_T1.lg_grp_cd.like(bind("lg_grp_cd")))
						.cutoff$and(S0_T1.gr_loc_cd.like(bind("gr_loc_cd")))
						.cutoff$and(S0_T1.gr_stk_arrv_bp_cd.like(bind("gr_stk_arrv_bp_cd")))
						.cutoff$and(S0_T1.inst_usr_cd.like(bind("inst_usr_cd")))
						.cutoff$and(S0_T1.inst_dpt_cd.like(bind("inst_dpt_cd")))
						.cutoff$and(S0_M28.dpt_nm.like(bind("inst_dpt_nm")))
						.cutoff$and(S0_T1.trd_cd.like(bind("trd_cd")))
						.cutoff$and(S0_T1.trd_rmrks.like(bind("trd_rmrks")))
						.cutoff$and(S0_T1.inst_rmrks.like(bind("inst_rmrks")))
						.cutoff$and(S0_T1.sub_char1.like(bind("h_sub_char1")))
						.cutoff$and(S0_T1.sub_char2.like(bind("h_sub_char2")))
						.cutoff$and(S0_T1.sub_char3.like(bind("h_sub_char3")))
						.cutoff$and(S0_T1.xfr_inst_no.like(bind("xfr_inst_no")))
						.cutoff$and(S0_T3.dlv_slip_no.like(bind("dlv_slip_no")))
						.cutoff$and(
							exists(
								subQuery()
								.select(value("X"))
								.from(
									S1_W1
									.innerJoin(S1_W2).on(S1_W2.xfr_inst_d_no.eq(S1_W1.xfr_inst_d_no))
								)
								.where(
									value(0).eq(value(0))
									.and(S1_W1.xfr_inst_no.eq(S0_T1.xfr_inst_no))
									.and(S1_W2.abort_flg.eq(bind("no_abort")))
								)
							)
						)
					)
					.groupBy(
						S0_T1.trd_cd,
						S0_T1.xfr_schd_dt,
						S0_T1.xfr_inst_dt,
						S0_T1.wg_cd,
						S0_T1.lg_grp_cd,
						S0_T1.gr_loc_cd,
						S0_T1.gr_stk_arrv_bp_cd,
						S0_T1.inst_usr_cd,
						S0_T1.inst_dpt_cd,
						S0_M28.dpt_nm,
						S0_T1.pick_prnt_flg,
						S0_T1.inst_prnt_flg,
						S0_T4.slip_prnt_flg,
						S0_T1.trd_rmrks,
						S0_T1.inst_rmrks,
						S0_T1.sub_char1,
						S0_T1.sub_char2,
						S0_T1.sub_char3,
						S0_T1.xfr_inst_no,
						S0_T3.dlv_slip_no,
						S0_T4.ins_usr_id,
						S0_T4.ins_usr_nm,
						S0_T4.ins_func_id,
						S0_T4.ins_ts,
						S0_T1.upd_cntr,
						S0_T4.upd_usr_id,
						S0_T4.upd_usr_nm,
						S0_T4.upd_func_id,
						S0_T4.upd_ts,
						S0_T4.upd_srv_req_no
					)
					.orderBy(S0_T3.dlv_slip_no.asc())
			)
			.setDynamicSQLInfo(
				when(boundOr("trd_nm"))
					.view(v -> v.leftOuterJoin(S0_M3).on(bracket(S0_T1.trd_cd.eq(S0_M3.trd_cd))))
					.predicate(p -> p.cutoff$and(S0_M3.trd_nm.like(bind("trd_nm")))),
				when(boundOr("wg_nm"))
					.view(v -> v.leftOuterJoin(S0_M11).on(bracket(S0_T1.wg_cd.eq(S0_M11.wg_cd))))
					.predicate(p -> p.cutoff$and(S0_M11.wg_nm.like(bind("wg_nm")))),
				when(boundOr("lg_grp_nm"))
					.view(v -> v.leftOuterJoin(S0_M12).on(bracket(S0_T1.lg_grp_cd.eq(S0_M12.lg_grp_cd))))
					.predicate(p -> p.cutoff$and(S0_M12.lg_grp_nm.like(bind("lg_grp_nm")))),
				when(boundOr("gr_site_nm", "gr_loc_nm", "gr_site_cd"))
					.view(v -> v.leftOuterJoin(S0_M17).on(bracket(S0_T1.gr_loc_cd.eq(S0_M17.loc_cd))))
					.predicate(p -> p.cutoff$and(S0_M17.loc_nm.like(bind("gr_loc_nm"))).cutoff$and(S0_M17.site_cd.like(bind("gr_site_cd")))),
				when(boundOr("gr_stk_arrv_bp_nm"))
					.view(v -> v.leftOuterJoin(S0_M19).on(bracket(S0_T1.gr_stk_arrv_bp_cd.eq(S0_M19.bp_cd))))
					.predicate(p -> p.cutoff$and(S0_M19.bp_nm.like(bind("gr_stk_arrv_bp_nm")))),
				when(boundOr("gr_site_nm"))
					.view(v -> v.leftOuterJoin(S0_M20).on(bracket(S0_M17.site_cd.eq(S0_M20.site_cd))))
					.predicate(p -> p.cutoff$and(S0_M20.site_nm.like(bind("gr_site_nm")))),
				when(boundOr("inst_usr_nm"))
					.view(v -> v.leftOuterJoin(S0_M27).on(bracket(S0_T1.inst_usr_cd.eq(S0_M27.usr_cd))))
					.predicate(p -> p.cutoff$and(S0_M27.usr_nm.like(bind("inst_usr_nm"))))
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
							r.getStringNE("wg_cd")
						))
						.addSelect(m -> toArray(
							m.wg_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("wg_nm", m.wg_nm());
					}),
					j -> j
						.add(MAM_LG_GRP_R.class, r -> toCondition(
							r.getStringNE("lg_grp_cd")
						))
						.addSelect(m -> toArray(
							m.lg_grp_nm,
							m.pick_list_flg,
							m.ship_inst_flg,
							m.ship_slip_flg
						))
						.addMap((r, m) -> {
							r.setStringNE("lg_grp_nm", m.lg_grp_nm());
							r.setBooleanNE("immd_dlv_prnt_flg", m.ship_slip_flg());
							r.setBooleanNE("immd_pick_prnt_flg", m.pick_list_flg());
							r.setBooleanNE("immd_inst_prnt_flg", m.ship_inst_flg());
					}),
					j -> j
						.add(MAM_LOC_R.class, r -> toCondition(
							r.getStringNE("gr_loc_cd")
						))
						.addSelect(m -> toArray(
							m.loc_nm,
							m.site_cd,
							m.sppl_cd,
							m.str_ln_tgt_flg
						))
						.addMap((r, m) -> {
							r.setStringNE("gr_loc_nm", m.loc_nm());
							r.setBooleanNE("gr_str_ln_tgt_flg", m.str_ln_tgt_flg());
							r.setStringNE("gr_site_cd", m.site_cd());
							r.setStringNE("gr_sppl_cd", m.sppl_cd());
					}),
					j -> j
						.add(MAM_BP_R.class, r -> toCondition(
							r.getStringNE("gr_stk_arrv_bp_cd")
						))
						.addSelect(m -> toArray(
							m.bp_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("gr_stk_arrv_bp_nm", m.bp_nm());
					}),
					j -> j
						.add(MAM_BP_R.class, r -> toCondition(
							r.getStringNE("gr_sppl_cd")
						))
						.addSelect(m -> toArray(
							m.bp_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("gr_sppl_nm", m.bp_nm());
					}),
					j -> j
						.add(MAM_SITE_R.class, r -> toCondition(
							r.getStringNE("gr_site_cd")
						))
						.addSelect(m -> toArray(
							m.site_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("gr_site_nm", m.site_nm());
					}),
					j -> j
						.add(MAM_USR_R.class, r -> toCondition(
							r.getStringNE("inst_usr_cd")
						))
						.addSelect(m -> toArray(
							m.usr_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("inst_usr_nm", m.usr_nm());
					})
				)
			);
	}

	/**
	 * -- MSBEL1050_MSW_XFR_ALLOC_STS_KEY_Query_I01()
	 */
	static MCQueryPlan MSBEL1050_MSW_XFR_ALLOC_STS_KEY_I01() {
		MSW_XFR_ALLOC_STS_KEY_R xfrAllocStsKeyW =  MSW_XFR_ALLOC_STS_KEY_R.create("xfrAllocStsKeyW");
		MST_XFR_ALLOC_STS_R xfrAllocStsT = MST_XFR_ALLOC_STS_R.create("xfrAllocStsT");
		MST_XFR_SCHD_R xfrSchdT = MST_XFR_SCHD_R.create("xfrSchdT");
		MST_XFR_INST_D_R xfrInstDT = MST_XFR_INST_D_R.create("xfrInstDT");
		MAM_ITM_R itmM = MAM_ITM_R.create("itmM");
		MAM_SUNDRY_ITM_R sundryItmM = MAM_SUNDRY_ITM_R.create("sundryItmM");
		return createQueryPlan()
			.setQuery(
				sql("MSBEL1050_MSW_XFR_ALLOC_STS_KEY_Query_I01")
					.insert(xfrAllocStsKeyW)
					.columns(xfrAllocStsKeyW.xfr_alloc_sts_no)
					.query(
						subQuery()
						.select(xfrAllocStsT.xfr_alloc_sts_no)
						.from(
							xfrAllocStsT
							.innerJoin(xfrInstDT).on(xfrAllocStsT.xfr_inst_d_no.eq(xfrInstDT.xfr_inst_d_no))
							.leftOuterJoin(itmM).on(
								xfrInstDT.itm_cd.eq(itmM.itm_cd)
								.and(xfrInstDT.itm_sub1.eq(itmM.itm_sub1))
								.and(xfrInstDT.itm_sub2.eq(itmM.itm_sub2))
								.and(xfrInstDT.itm_sub3.eq(itmM.itm_sub3))
							)
							.leftOuterJoin(sundryItmM).on(
								xfrInstDT.itm_cd.eq(sundryItmM.itm_cd)
								.and(xfrInstDT.itm_sub1.eq(sundryItmM.itm_sub1))
								.and(xfrInstDT.itm_sub2.eq(sundryItmM.itm_sub2))
								.and(xfrInstDT.itm_sub3.eq(sundryItmM.itm_sub3))
								.and(xfrAllocStsT.sno1.eq(sundryItmM.sno1))
								.and(xfrAllocStsT.sno2.eq(sundryItmM.sno2))
								.and(xfrAllocStsT.sno3.eq(sundryItmM.sno3))
								.and(xfrAllocStsT.sno4.eq(sundryItmM.sno4))
							)
						)
						.where(
							value(0).eq(value(0))
							.cutoff$and(xfrInstDT.itm_cd.like(bind("itm_cd")))
							.cutoff$and(xfrInstDT.itm_sub1.like(bind("itm_sub1")))
							.cutoff$and(xfrInstDT.itm_sub2.like(bind("itm_sub2")))
							.cutoff$and(xfrInstDT.itm_sub3.like(bind("itm_sub3")))
							.cutoff$and(
								coalesce(
									sundryItmM.itm_nm,
									itmM.itm_nm
								).like(bind("itm_nm"))
							)
							.cutoff$and(itmM.itm_typ.like(bind("itm_typ")))
							.cutoff$and(itmM.itm_typ_d_cd.like(bind("itm_typ_d_cd")))
							.cutoff$and(itmM.pckg_unit_cd.like(bind("pckg_unit_cd")))
						)
						.unionAll(
							subQuery()
							.select(xfrAllocStsT.xfr_alloc_sts_no)
							.from(
								xfrAllocStsT
								.innerJoin(xfrSchdT).on(xfrAllocStsT.xfr_schd_no.eq(xfrSchdT.xfr_schd_no))
								.leftOuterJoin(itmM).on(
									xfrSchdT.itm_cd.eq(itmM.itm_cd)
									.and(xfrSchdT.itm_sub1.eq(itmM.itm_sub1))
									.and(xfrSchdT.itm_sub2.eq(itmM.itm_sub2))
									.and(xfrSchdT.itm_sub3.eq(itmM.itm_sub3))
								)
								.leftOuterJoin(sundryItmM).on(
									xfrSchdT.itm_cd.eq(sundryItmM.itm_cd)
									.and(xfrSchdT.itm_sub1.eq(sundryItmM.itm_sub1))
									.and(xfrSchdT.itm_sub2.eq(sundryItmM.itm_sub2))
									.and(xfrSchdT.itm_sub3.eq(sundryItmM.itm_sub3))
									.and(xfrAllocStsT.sno1.eq(sundryItmM.sno1))
									.and(xfrAllocStsT.sno2.eq(sundryItmM.sno2))
									.and(xfrAllocStsT.sno3.eq(sundryItmM.sno3))
									.and(xfrAllocStsT.sno4.eq(sundryItmM.sno4))
								)
							)
							.where(
								value(0).eq(value(0))
								.and(xfrAllocStsT.xfr_inst_d_no.eq(value(MAC_STR.NULL_VAL.value())))
								.cutoff$and(xfrSchdT.itm_cd.like(bind("itm_cd")))
								.cutoff$and(xfrSchdT.itm_sub1.like(bind("itm_sub1")))
								.cutoff$and(xfrSchdT.itm_sub2.like(bind("itm_sub2")))
								.cutoff$and(xfrSchdT.itm_sub3.like(bind("itm_sub3")))
								.cutoff$and(
									coalesce(
										sundryItmM.itm_nm,
										itmM.itm_nm
									).like(bind("itm_nm"))
								)
								.cutoff$and(itmM.itm_typ.like(bind("itm_typ")))
								.cutoff$and(itmM.itm_typ_d_cd.like(bind("itm_typ_d_cd")))
								.cutoff$and(itmM.pckg_unit_cd.like(bind("pckg_unit_cd")))
							)
						)
					)
			);
	}
}