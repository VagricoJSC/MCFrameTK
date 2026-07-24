package mcframe.serverMSBC.MSBCL1090;

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
	 * -- MSBCL1090_MST_INPT_ACT_Query_S01
	 */
	static MCQueryPlan MSBCL1090_MST_INPT_ACT_S01() {
		MST_INPT_ACT_R S0_T1 = MST_INPT_ACT_R.create("T1");
		MST_INPT_ACT_REM_R S0_T2 = MST_INPT_ACT_REM_R.create("T2");
		MST_INPT_SCHD_R S0_T3 = MST_INPT_SCHD_R.create("T3");
		MST_MFG_ACT_R S0_T11 = MST_MFG_ACT_R.create("T11");
		MST_ITM_MFG_INST_R S0_T12 = MST_ITM_MFG_INST_R.create("T12");
		MST_MFG_INST_R S0_T13 = MST_MFG_INST_R.create("T13");
		MST_MFG_ACT_REM_R S0_T14 = MST_MFG_ACT_REM_R.create("T14");
		MST_WRK_SNO_R S0_T15 = MST_WRK_SNO_R.create("T15");
		MST_WRK_R S0_T16 = MST_WRK_R.create("T16");
		MST_OPER_ACT_R S0_T21 = MST_OPER_ACT_R.create("T21");
		MST_OPER_ACT_REM_R S0_T22 = MST_OPER_ACT_REM_R.create("T22");
		MST_OPER_INST_R S0_T23 = MST_OPER_INST_R.create("T23");
		MAM_ITM_R S0_M1 = MAM_ITM_R.create("M1");
		MAM_SUNDRY_ITM_R S0_M2 = MAM_SUNDRY_ITM_R.create("M2");
		MAM_LOC_R S0_M5 = MAM_LOC_R.create("M5");
		MAM_STR_LN_R S0_M10 = MAM_STR_LN_R.create("M10");
		MAM_DPT_R S0_M12 = MAM_DPT_R.create("M12");
		MAM_ITM_TYP_D_R S0_M15 = MAM_ITM_TYP_D_R.create("M15");
		MAM_ITM_R S0_M21 = MAM_ITM_R.create("M21");
		MAM_SUNDRY_ITM_R S0_M22 = MAM_SUNDRY_ITM_R.create("M22");
		MAM_BP_R S0_M24 = MAM_BP_R.create("M24");
		MAVM_RD_LOC_R S0_M25 = MAVM_RD_LOC_R.create("M25");
		MAM_STR_LN_R S0_M26 = MAM_STR_LN_R.create("M26");
		MAM_SITE_R S0_M29 = MAM_SITE_R.create("M29");
		MAM_WG_R S0_M30 = MAM_WG_R.create("M30");
		MAM_OPER_R S0_M38 = MAM_OPER_R.create("M38");
		MAM_LOC_R S0_M40 = MAM_LOC_R.create("M40");
		MAM_STR_LN_R S0_M41 = MAM_STR_LN_R.create("M41");
		MAM_USR_R S0_M42 = MAM_USR_R.create("M42");
		MAM_ITM_TYP_D_R S0_M44 = MAM_ITM_TYP_D_R.create("M44");
		MAM_LOC_GRP_R S0_M45 = MAM_LOC_GRP_R.create("M45");
		MAM_BIZ_RSN_R S0_M91 = MAM_BIZ_RSN_R.create("M91");
		MAM_ITM_GRP_R S0_CHD_ITM_GRP1 = MAM_ITM_GRP_R.create("CHD_ITM_GRP1");
		MAM_ITM_GRP_R S0_CHD_ITM_GRP2 = MAM_ITM_GRP_R.create("CHD_ITM_GRP2");
		MAM_ITM_GRP_R S0_CHD_ITM_GRP3 = MAM_ITM_GRP_R.create("CHD_ITM_GRP3");
		MAM_ITM_GRP_R S0_CHD_ITM_GRP4 = MAM_ITM_GRP_R.create("CHD_ITM_GRP4");
		MAM_ITM_GRP_R S0_CHD_ITM_GRP5 = MAM_ITM_GRP_R.create("CHD_ITM_GRP5");
		MAM_ITM_GRP_R S0_CHD_ITM_GRP6 = MAM_ITM_GRP_R.create("CHD_ITM_GRP6");
		MAM_ITM_GRP_R S0_CHD_ITM_GRP7 = MAM_ITM_GRP_R.create("CHD_ITM_GRP7");
		MAM_ITM_GRP_R S0_CHD_ITM_GRP8 = MAM_ITM_GRP_R.create("CHD_ITM_GRP8");
		MAM_ITM_GRP_R S0_CHD_ITM_GRP9 = MAM_ITM_GRP_R.create("CHD_ITM_GRP9");
		MAM_ITM_GRP_R S0_CHD_ITM_GRP10 = MAM_ITM_GRP_R.create("CHD_ITM_GRP10");
		MAM_ITM_GRP_R S0_PAR_ITM_GRP1 = MAM_ITM_GRP_R.create("PAR_ITM_GRP1");
		MAM_ITM_GRP_R S0_PAR_ITM_GRP2 = MAM_ITM_GRP_R.create("PAR_ITM_GRP2");
		MAM_ITM_GRP_R S0_PAR_ITM_GRP3 = MAM_ITM_GRP_R.create("PAR_ITM_GRP3");
		MAM_ITM_GRP_R S0_PAR_ITM_GRP4 = MAM_ITM_GRP_R.create("PAR_ITM_GRP4");
		MAM_ITM_GRP_R S0_PAR_ITM_GRP5 = MAM_ITM_GRP_R.create("PAR_ITM_GRP5");
		MAM_ITM_GRP_R S0_PAR_ITM_GRP6 = MAM_ITM_GRP_R.create("PAR_ITM_GRP6");
		MAM_ITM_GRP_R S0_PAR_ITM_GRP7 = MAM_ITM_GRP_R.create("PAR_ITM_GRP7");
		MAM_ITM_GRP_R S0_PAR_ITM_GRP8 = MAM_ITM_GRP_R.create("PAR_ITM_GRP8");
		MAM_ITM_GRP_R S0_PAR_ITM_GRP9 = MAM_ITM_GRP_R.create("PAR_ITM_GRP9");
		MAM_ITM_GRP_R S0_PAR_ITM_GRP10 = MAM_ITM_GRP_R.create("PAR_ITM_GRP10");
		
		MCDynamicSQLID DS0C_CHD_ITM_GRP = createDynamicSQLID("DS0C_CHD_ITM_GRP");
		MCDynamicSQLID DS0C_PAR_ITM_GRP = createDynamicSQLID("DS0C_PAR_ITM_GRP");
		
		return createQueryPlan()
			.setQuery(
				sql("MSBCL1090_MST_INPT_ACT_Query_S01")
					.mainQuery()
					.select(
						S0_T2.mfg_sts_typ.as("inpt_mfg_sts_typ"),
						S0_T1.itm_cd.as("chd_itm_cd"),
						S0_T1.itm_sub1.as("chd_itm_sub1"),
						S0_T1.itm_sub2.as("chd_itm_sub2"),
						S0_T1.itm_sub3.as("chd_itm_sub3"),
						nvl(
							S0_M2.itm_nm,
							S0_M1.itm_nm
						).as("chd_itm_nm"),
						S0_M1.itm_typ.as("chd_itm_typ"),
						S0_M1.itm_typ_d_cd.as("chd_itm_typ_d_cd"),
						S0_T1.ver_no,
						S0_T1.base_unit_inpt_qty,
						S0_T1.base_unit_loss_qty,
						S0_T1.base_unit_fxd_loss_qty,
						bracket(
							cases()
								.when(S0_T2.base_unit_inpt_abort_qty.gt(value(0)))
									.then(value(true))
								.otherwise(value(false))
						).as("abort_flg"),
						S0_T2.base_unit_inpt_qty.as("base_unit_schd_inpt_qty"),
						S0_T2.base_unit_rqmt_qty.as("base_unit_schd_rqmt_qty"),
						S0_T2.base_unit_fxd_rqmt_qty.as("base_unit_schd_fxd_rqmt_qty"),
						S0_T2.base_unit_inpt_rem_qty.add(S0_T2.base_unit_fxd_rqmt_rem_qty).as("base_unit_inpt_rem_qty"),
						S0_T1.base_unit_cd,
						S0_M1.dec_place.as("base_unit_dec_place"),
						S0_M1.cont_fctr_flg,
						S0_M1.cont_fctr_rnd_typ,
						S0_M1.cont_fctr_dec_place,
						S0_T1.act_cont_fctr,
						S0_T1.cont_fctr_unit_cd,
						S0_T3.std_cont_fctr,
						S0_T1.cont_qty.as("cont_inpt_qty"),
						S0_T1.cont_loss_qty,
						S0_T1.cont_fxd_loss_qty,
						S0_T2.cont_inpt_qty.as("cont_schd_inpt_qty"),
						S0_T2.cont_rqmt_qty.as("cont_schd_rqmt_qty"),
						S0_T2.cont_fxd_rqmt_qty.as("cont_schd_fxd_rqmt_qty"),
						nullValue().as("cont_acxfr_act_qty"),
						S0_T1.lot_no.as("act_lot_no"),
						S0_T1.sublot_no.as("act_sublot_no"),
						S0_T3.lot_no.as("inst_lot_no"),
						S0_T3.sublot_no.as("inst_sublot_no"),
						S0_T1.acxfr_qty.as("acxfr_act_qty"),
						S0_T1.acxfr_rsn_cd.as("acxfr_act_rsn_cd"),
						S0_T1.acxfr_bd_dpt_cd.as("acxfr_act_bd_dpt_cd"),
						S0_M12.dpt_nm.as("acxfr_act_bd_dpt_nm"),
						S0_T1.stk_id_typ,
						S0_T1.stk_bp_cd,
						S0_T1.stk_arrv_bp_cd,
						trunc(
							S0_T1.act_tm,
							MCDateFmt.DD
						).as("act_dt"),
						S0_T1.act_tm.as("act_hm"),
						S0_T1.ac_dt,
						trunc(
							S0_T3.schd_tm,
							MCDateFmt.DD
						).as("schd_dt"),
						S0_T3.schd_tm.as("schd_hm"),
						S0_T1.sno1,
						S0_T1.sno2,
						S0_T1.sno3,
						S0_T1.sno4,
						S0_T3.bkf_typ,
						S0_T3.alloc_flg,
						S0_T3.alloc_ctl_typ,
						S0_T3.inpt_ctl_typ,
						S0_T1.gd_cd,
						S0_T1.inpt_rsn_cd,
						S0_T1.inpt_loc_cd,
						S0_T1.inpt_str_ln_cd,
						S0_T3.intr_rmrks.as("inpt_schd_intr_rmrks"),
						S0_T3.inst_rpt_rmrks.as("inpt_schd_inst_rpt_rmrks"),
						S0_T3.sub_char1.as("inpt_schd_sub_char1"),
						S0_T3.sub_char2.as("inpt_schd_sub_char2"),
						S0_T3.sub_char3.as("inpt_schd_sub_char3"),
						S0_T1.intr_rmrks.as("inpt_act_intr_rmrks"),
						S0_T1.act_rpt_rmrks.as("inpt_act_rpt_rmrks"),
						S0_T1.trd_rmrks.as("inpt_act_trd_rmrks"),
						S0_T1.sub_char1.as("inpt_act_sub_char1"),
						S0_T1.sub_char2.as("inpt_act_sub_char2"),
						S0_T1.sub_char3.as("inpt_act_sub_char3"),
						S0_T3.main_itm_flg,
						S0_T3.yield_calc_flg,
						S0_T1.bkf_ctl_flg.as("bkf_upd_flg"),
						S0_T3.lot_mix_flg,
						S0_T3.sublot_mix_flg,
						S0_T3.ver_no.as("inpt_schd_ver_no"),
						S0_M1.stk_mng_typ,
						S0_T3.prov_typ,
						S0_T3.alt_grp_cd,
						S0_T3.alt_grp_seq,
						S0_T3.alt_itm_fix_flg,
						S0_T3.alt_itm_typ,
						S0_T3.alt_alloc_prio,
						S0_T1.add_flg,
						S0_T3.inpt_schd_no,
						S0_T1.inpt_act_no,
						S0_T1.ext_sys_cd,
						S0_T1.ext_inpt_act_no,
						S0_T12.itm_cd.as("par_itm_cd"),
						S0_T12.itm_sub1.as("par_itm_sub1"),
						S0_T12.itm_sub2.as("par_itm_sub2"),
						S0_T12.itm_sub3.as("par_itm_sub3"),
						nvl(
							S0_M22.itm_nm,
							S0_M21.itm_nm
						).as("par_itm_nm"),
						S0_M21.itm_typ.as("par_itm_typ"),
						S0_M21.itm_typ_d_cd.as("par_itm_typ_d_cd"),
						S0_T22.mfg_sts_typ.as("oper_mfg_sts_typ"),
						S0_T23.oper_cd,
						S0_T21.disp_seq.as("oper_disp_seq"),
						S0_T23.oper_seq,
						trunc(
							S0_T11.st_act_tm,
							MCDateFmt.DD
						).as("st_act_dt"),
						S0_T11.st_act_tm.as("st_act_hm"),
						S0_T11.st_ac_dt,
						trunc(
							S0_T11.end_act_tm,
							MCDateFmt.DD
						).as("end_act_dt"),
						S0_T11.end_act_tm.as("end_act_hm"),
						S0_T11.end_ac_dt,
						S0_T21.oper_unit_qty.as("oper_unit_act_qty"),
						S0_T22.base_unit_qty.as("base_unit_oper_schd_qty"),
						S0_T23.oper_std_qty,
						S0_T23.oper_conv_qty,
						S0_T23.oper_unit_conv_rnd_typ,
						nullValue().as("oper_unit_schd_qty"),
						S0_T23.oper_unit_dec_place,
						S0_T21.oper_unit_cd,
						S0_T13.base_unit_inst_qty.as("par_base_unit_mfg_inst_qty"),
						S0_T13.base_unit_yield_qty.as("par_base_unit_yield_schd_qty"),
						S0_T14.base_unit_mfg_qty.as("par_base_unit_st_act_qty"),
						S0_T11.base_unit_yield_qty.as("par_base_unit_yield_qty"),
						S0_T11.base_unit_dfct_qty.as("par_base_unit_dfct_qty"),
						S0_T11.base_unit_cd.as("par_base_unit_cd"),
						S0_T12.lot_no.as("par_inst_lot_no"),
						S0_T12.sublot_no.as("par_inst_sublot_no"),
						S0_T12.sno1.as("par_sno1"),
						S0_T12.sno2.as("par_sno2"),
						S0_T12.sno3.as("par_sno3"),
						S0_T12.sno4.as("par_sno4"),
						S0_T11.act_rpt_rmrks.as("mfg_act_rpt_rmrks"),
						S0_T11.intr_rmrks.as("mfg_act_intr_rmrks"),
						S0_T11.sub_char1.as("mfg_act_sub_char1"),
						S0_T11.sub_char2.as("mfg_act_sub_char2"),
						S0_T11.sub_char3.as("mfg_act_sub_char3"),
						S0_T21.intr_rmrks.as("oper_act_intr_rmrks"),
						S0_T21.act_rpt_rmrks.as("oper_act_rpt_rmrks"),
						S0_T21.sub_char1.as("oper_act_sub_char1"),
						S0_T21.sub_char2.as("oper_act_sub_char2"),
						S0_T21.sub_char3.as("oper_act_sub_char3"),
						S0_T11.itm_yield,
						S0_T12.itm_lower_yield,
						S0_T12.itm_std_yield,
						S0_T12.itm_upper_yield,
						S0_T21.oper_yield,
						S0_T23.oper_lower_yield,
						S0_T23.oper_std_yield,
						S0_T23.oper_upper_yield,
						S0_T12.mfg_mtd_typ,
						S0_T12.sppl_cd,
						S0_T12.mfg_loc_cd,
						S0_M25.loc_nm.as("mfg_loc_nm"),
						S0_M25.loc_grp_cd.as("mfg_loc_grp_cd"),
						S0_T12.mfg_str_ln_cd,
						S0_T23.oper_loc_cd,
						S0_T23.oper_str_ln_cd,
						S0_T12.site_cd,
						S0_T12.wg_cd,
						S0_T12.bom_ptn,
						S0_T12.oper_ptn,
						S0_T12.itm_ord_no,
						S0_T23.usr_cd.as("oper_usr_cd"),
						S0_T3.disp_seq,
						S0_T3.oper_inst_no,
						S0_T1.oper_act_no,
						S0_T1.mfg_act_no,
						S0_T11.mfg_inst_no,
						S0_T11.div_seq,
						S0_T13.po_d_no,
						S0_T1.ins_usr_id,
						S0_T1.ins_usr_nm,
						S0_T1.ins_func_id,
						S0_T1.ins_ts,
						S0_T1.upd_usr_id,
						S0_T1.upd_usr_nm,
						S0_T1.upd_func_id,
						S0_T1.upd_ts,
						S0_T1.upd_srv_req_no,
						addDynamicSelect(DS0C_CHD_ITM_GRP),
						addDynamicSelect(DS0C_PAR_ITM_GRP)
					)
					.from(
						S0_T1
						.leftOuterJoin(S0_T2).on(
							bracket(
								S0_T1.inpt_schd_no.eq(S0_T2.inpt_schd_no)
								.and(S0_T1.div_seq.eq(S0_T2.div_seq))
							)
						)
						.leftOuterJoin(S0_T3).on(
							bracket(
								S0_T1.inpt_schd_no.eq(S0_T3.inpt_schd_no)
							)
						)
						.innerJoin(S0_T11).on(
							bracket(
								S0_T1.mfg_act_no.eq(S0_T11.mfg_act_no)
							)
						)
						.innerJoin(S0_T12).on(
							bracket(
								S0_T1.itm_mfg_inst_no.eq(S0_T12.itm_mfg_inst_no)
							)
						)
						.innerJoin(S0_T13).on(
							bracket(
								S0_T11.mfg_inst_no.eq(S0_T13.mfg_inst_no)
							)
						)
						.innerJoin(S0_T14).on(
							bracket(
								S0_T11.mfg_inst_no.eq(S0_T14.mfg_inst_no)
								.and(S0_T11.div_seq.eq(S0_T14.div_seq))
							)
						)
						.innerJoin(S0_T21).on(
							bracket(
								S0_T1.oper_act_no.eq(S0_T21.oper_act_no)
							)
						)
						.innerJoin(S0_T22).on(
							bracket(
								S0_T21.oper_inst_no.eq(S0_T22.oper_inst_no)
								.and(S0_T21.div_seq.eq(S0_T22.div_seq))
							)
						)
						.innerJoin(S0_T23).on(
							bracket(
								S0_T22.oper_inst_no.eq(S0_T23.oper_inst_no)
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
						.leftOuterJoin(S0_M2).on(
							bracket(
								S0_T1.itm_cd.eq(S0_M2.itm_cd)
								.and(S0_T1.itm_sub1.eq(S0_M2.itm_sub1))
								.and(S0_T1.itm_sub2.eq(S0_M2.itm_sub2))
								.and(S0_T1.itm_sub3.eq(S0_M2.itm_sub3))
								.and(S0_T1.sno1.eq(S0_M2.sno1))
								.and(S0_T1.sno2.eq(S0_M2.sno2))
								.and(S0_T1.sno3.eq(S0_M2.sno3))
								.and(S0_T1.sno4.eq(S0_M2.sno4))
							)
						)
						.leftOuterJoin(S0_M12).on(
							bracket(
								S0_T1.acxfr_bd_dpt_cd.eq(S0_M12.dpt_cd)
								.and(S0_T1.ac_dt.between(S0_M12.st_dt, S0_M12.end_dt))
							)
						)
						.leftOuterJoin(S0_M21).on(
							bracket(
								S0_T12.itm_cd.eq(S0_M21.itm_cd)
								.and(S0_T12.itm_sub1.eq(S0_M21.itm_sub1))
								.and(S0_T12.itm_sub2.eq(S0_M21.itm_sub2))
								.and(S0_T12.itm_sub3.eq(S0_M21.itm_sub3))
							)
						)
						.leftOuterJoin(S0_M22).on(
							bracket(
								S0_T12.itm_cd.eq(S0_M22.itm_cd)
								.and(S0_T12.itm_sub1.eq(S0_M22.itm_sub1))
								.and(S0_T12.itm_sub2.eq(S0_M22.itm_sub2))
								.and(S0_T12.itm_sub3.eq(S0_M22.itm_sub3))
								.and(S0_T12.sno1.eq(S0_M22.sno1))
								.and(S0_T12.sno2.eq(S0_M22.sno2))
								.and(S0_T12.sno3.eq(S0_M22.sno3))
								.and(S0_T12.sno4.eq(S0_M22.sno4))
							)
						)
						.innerJoin(S0_M25).on(
							bracket(
								S0_T12.mfg_loc_cd.eq(S0_M25.loc_cd)
							)
						)
						.addDynamicView()
						.addDynamicView(DS0C_CHD_ITM_GRP)
						.addDynamicView(DS0C_PAR_ITM_GRP)
					)
					.where(
						value(0).eq(value(0))
						.and(
							value(true).eq(value(false))
							.cutoff$or(S0_T22.mfg_sts_typ.eq(bind("tmp_oper_sts_cmpl_str")))
							.cutoff$or(S0_T22.mfg_sts_typ.eq(bind("tmp_oper_sts_stt_str")))
							.cutoff$or(S0_T22.mfg_sts_typ.eq(bind("tmp_oper_sts_ord_str")))
						)
						.and(
							value(true).eq(value(false))
							.cutoff$or(S0_T2.mfg_sts_typ.eq(bind("tmp_inpt_sts_cmpl_str")))
							.cutoff$or(S0_T2.mfg_sts_typ.eq(bind("tmp_inpt_sts_stt_str")))
							.cutoff$or(S0_T2.mfg_sts_typ.eq(bind("tmp_inpt_sts_ord_str")))
							.cutoff$or(
								bracket(
									value(true).eq(bind("tmp_inpt_no_schd_str"))
									.and(S0_T2.mfg_sts_typ.isNull())
								)
							)
						)
						.cutoff$and(
							bind("tmp_not_alloc_srch_str").eq(value(true))
							.and(S0_T3.base_unit_rqmt_qty.add(S0_T3.base_unit_fxd_rqmt_qty).gt(value(0)))
							.and(
								S0_T3.alloc_ctl_typ.in(
									value(MAC_ALLOC_CTL_TYP.ALLOC_INST_NG.value()),
									value(MAC_ALLOC_CTL_TYP.ALLOC_INST_OK.value())
								)
							)
							.and(S0_T3.alloc_flg.eq(value(false)))
						)
						.cutoff$and(S0_T3.bkf_typ.like(bind("bkf_typ")))
						.cutoff$and(S0_T3.yield_calc_flg.eq(bind("tmp_yield_calc_str")))
						.cutoff$and(S0_T3.schd_tm.gte(bind("inpt_schd_hm_fr")))
						.cutoff$and(S0_T3.schd_tm.lte(bind("inpt_schd_hm_to")))
						.cutoff$and(S0_T1.act_tm.gte(bind("inpt_act_hm_fr")))
						.cutoff$and(S0_T1.act_tm.lte(bind("inpt_act_hm_to")))
						.cutoff$and(S0_T1.ac_dt.gte(bind("inpt_ac_dt_fr")))
						.cutoff$and(S0_T1.ac_dt.lte(bind("inpt_ac_dt_to")))
						.cutoff$and(S0_T12.site_cd.like(bind("mfg_loc_site_cd")))
						.addDynamicPredicate()
						.cutoff$and(S0_T12.wg_cd.like(bind("mfg_loc_wg_cd")))
						.cutoff$and(S0_M25.loc_grp_cd.like(bind("mfg_loc_grp_cd")))
						.cutoff$and(S0_T12.mfg_loc_cd.like(bind("mfg_loc_cd")))
						.cutoff$and(S0_M25.loc_nm.like(bind("mfg_loc_nm")))
						.cutoff$and(S0_T12.mfg_str_ln_cd.like(bind("mfg_str_ln_cd")))
						.cutoff$and(S0_T1.inpt_loc_cd.like(bind("inpt_loc_cd")))
						.cutoff$and(S0_T1.inpt_str_ln_cd.like(bind("inpt_str_ln_cd")))
						.cutoff$and(S0_T12.sppl_cd.like(bind("sppl_cd")))
						.cutoff$and(S0_T23.oper_cd.like(bind("oper_cd")))
						.cutoff$and(S0_T23.oper_loc_cd.like(bind("oper_loc_cd")))
						.cutoff$and(S0_T23.oper_str_ln_cd.like(bind("oper_str_ln_cd")))
						.cutoff$and(S0_T12.mfg_mtd_typ.like(bind("mfg_mtd_typ")))
						.cutoff$and(S0_M1.itm_typ.like(bind("chd_itm_typ")))
						.cutoff$and(S0_M1.itm_typ_d_cd.like(bind("chd_itm_typ_d_cd")))
						.cutoff$and(S0_T3.inpt_ctl_typ.like(bind("inpt_ctl_typ")))
						.cutoff$and(S0_T1.itm_cd.like(bind("chd_itm_cd")))
						.cutoff$and(S0_T1.itm_sub1.like(bind("chd_itm_sub1")))
						.cutoff$and(S0_T1.itm_sub2.like(bind("chd_itm_sub2")))
						.cutoff$and(S0_T1.itm_sub3.like(bind("chd_itm_sub3")))
						.cutoff$and(
							nvl(
								S0_M2.itm_nm,
								S0_M1.itm_nm
							).like(bind("chd_itm_nm"))
						)
						.cutoff$and(S0_T1.lot_no.like(bind("chd_lot_no")))
						.cutoff$and(S0_T1.sublot_no.like(bind("chd_sublot_no")))
						.cutoff$and(S0_M21.itm_typ.like(bind("par_itm_typ")))
						.cutoff$and(S0_M21.itm_typ_d_cd.like(bind("par_itm_typ_d_cd")))
						.cutoff$and(S0_T13.mfg_inst_no.like(bind("mfg_inst_no")))
						.cutoff$and(S0_T12.itm_cd.like(bind("par_itm_cd")))
						.cutoff$and(S0_T12.itm_sub1.like(bind("par_itm_sub1")))
						.cutoff$and(S0_T12.itm_sub2.like(bind("par_itm_sub2")))
						.cutoff$and(S0_T12.itm_sub3.like(bind("par_itm_sub3")))
						.cutoff$and(
							nvl(
								S0_M22.itm_nm,
								S0_M21.itm_nm
							).like(bind("par_itm_nm"))
						)
						.cutoff$and(S0_T12.sno1.like(bind("par_sno1")))
						.cutoff$and(S0_T12.sno2.like(bind("par_sno2")))
						.cutoff$and(S0_T12.sno3.like(bind("par_sno3")))
						.cutoff$and(S0_T12.sno4.like(bind("par_sno4")))
						.cutoff$and(S0_T23.usr_cd.like(bind("oper_usr_cd")))
						.cutoff$and(S0_T12.itm_ord_no.like(bind("itm_ord_no")))
						.cutoff$and(S0_T13.po_d_no.like(bind("po_d_no")))
						.cutoff$and(S0_T23.oper_inst_no.like(bind("oper_inst_no")))
						.cutoff$and(S0_T11.mfg_act_no.like(bind("mfg_act_no")))
						.cutoff$and(S0_T21.oper_act_no.like(bind("oper_act_no")))
						.cutoff$and(S0_T3.inpt_schd_no.like(bind("inpt_schd_no")))
						.cutoff$and(S0_T1.inpt_act_no.like(bind("inpt_act_no")))
						.cutoff$and(S0_T1.inpt_rsn_cd.like(bind("inpt_rsn_cd")))
						.cutoff$and(S0_T1.ext_inpt_act_no.like(bind("ext_inpt_act_no")))
						.cutoff$and(S0_T3.inst_rpt_rmrks.like(bind("inpt_schd_inst_rpt_rmrks")))
						.cutoff$and(S0_T3.intr_rmrks.like(bind("inpt_schd_intr_rmrks")))
						.cutoff$and(S0_T3.sub_char1.like(bind("inpt_schd_sub_char1")))
						.cutoff$and(S0_T3.sub_char2.like(bind("inpt_schd_sub_char2")))
						.cutoff$and(S0_T3.sub_char3.like(bind("inpt_schd_sub_char3")))
						.cutoff$and(S0_T1.act_rpt_rmrks.like(bind("inpt_act_rpt_rmrks")))
						.cutoff$and(S0_T1.intr_rmrks.like(bind("inpt_act_intr_rmrks")))
						.cutoff$and(S0_T1.trd_rmrks.like(bind("inpt_act_trd_rmrks")))
						.cutoff$and(S0_T1.sub_char1.like(bind("inpt_act_sub_char1")))
						.cutoff$and(S0_T1.sub_char2.like(bind("inpt_act_sub_char2")))
						.cutoff$and(S0_T1.sub_char3.like(bind("inpt_act_sub_char3")))
						.cutoff$and(S0_T11.act_rpt_rmrks.like(bind("mfg_act_rpt_rmrks")))
						.cutoff$and(S0_T11.intr_rmrks.like(bind("mfg_act_intr_rmrks")))
						.cutoff$and(S0_T11.sub_char1.like(bind("mfg_act_sub_char1")))
						.cutoff$and(S0_T11.sub_char2.like(bind("mfg_act_sub_char2")))
						.cutoff$and(S0_T11.sub_char3.like(bind("mfg_act_sub_char3")))
						.cutoff$and(S0_T21.intr_rmrks.like(bind("oper_act_intr_rmrks")))
						.cutoff$and(S0_T21.act_rpt_rmrks.like(bind("oper_act_rpt_rmrks")))
						.cutoff$and(S0_T21.sub_char1.like(bind("oper_act_sub_char1")))
						.cutoff$and(S0_T21.sub_char2.like(bind("oper_act_sub_char2")))
						.cutoff$and(S0_T21.sub_char3.like(bind("oper_act_sub_char3")))
						.addDynamicPredicate(DS0C_CHD_ITM_GRP)
						.addDynamicPredicate(DS0C_PAR_ITM_GRP)
					)
					.orderBy(
						S0_T1.mfg_act_no.asc(),
						S0_T3.disp_seq.asc(),
						S0_T1.inpt_act_no.asc()
					)
			)
			.setDynamicSQLInfo(
				when(boundOr("wrk_nm", "wrk_no"))
					.view(v -> v.leftOuterJoin(S0_T15).on(bracket(S0_T12.sno1.eq(S0_T15.sno1))))
					.predicate(p -> p.cutoff$and(S0_T15.wrk_no.like(bind("wrk_no")))),
				when(boundOr("wrk_nm"))
					.view(v -> v.leftOuterJoin(S0_T16).on(bracket(S0_T16.wrk_no.eq(S0_T15.wrk_no))))
					.predicate(p -> p.cutoff$and(S0_T16.wrk_nm.like(bind("wrk_nm")))),
				when(boundOr("inpt_loc_nm"))
					.view(v -> v.leftOuterJoin(S0_M5).on(bracket(S0_T1.inpt_loc_cd.eq(S0_M5.loc_cd))))
					.predicate(p -> p.cutoff$and(S0_M5.loc_nm.like(bind("inpt_loc_nm")))),
				when(boundOr("inpt_str_ln_nm"))
					.view(v -> v.leftOuterJoin(S0_M10).on(bracket(S0_T1.inpt_loc_cd.eq(S0_M10.loc_cd).and(S0_T1.inpt_str_ln_cd.eq(S0_M10.str_ln_cd)))))
					.predicate(p -> p.cutoff$and(S0_M10.str_ln_nm.like(bind("inpt_str_ln_nm")))),
				when(boundOr("chd_itm_typ_d_nm"))
					.view(v -> v.leftOuterJoin(S0_M15).on(bracket(S0_M1.itm_typ.eq(S0_M15.itm_typ).and(S0_M1.itm_typ_d_cd.eq(S0_M15.itm_typ_d_cd)))))
					.predicate(p -> p.cutoff$and(S0_M15.itm_typ_d_nm.like(bind("chd_itm_typ_d_nm")))),
				when(boundOr("sppl_nm"))
					.view(v -> v.leftOuterJoin(S0_M24).on(bracket(S0_T12.sppl_cd.eq(S0_M24.bp_cd))))
					.predicate(p -> p.cutoff$and(S0_M24.bp_nm.like(bind("sppl_nm")))),
				when(boundOr("mfg_str_ln_nm"))
					.view(v -> v.leftOuterJoin(S0_M26).on(bracket(S0_T12.mfg_loc_cd.eq(S0_M26.loc_cd).and(S0_T12.mfg_str_ln_cd.eq(S0_M26.str_ln_cd)))))
					.predicate(p -> p.cutoff$and(S0_M26.str_ln_nm.like(bind("mfg_str_ln_nm")))),
				when(boundOr("mfg_loc_site_nm"))
					.view(v -> v.leftOuterJoin(S0_M29).on(bracket(S0_T12.site_cd.eq(S0_M29.site_cd))))
					.predicate(p -> p.cutoff$and(S0_M29.site_nm.like(bind("mfg_loc_site_nm")))),
				when(boundOr("mfg_loc_wg_nm"))
					.view(v -> v.leftOuterJoin(S0_M30).on(bracket(S0_T12.wg_cd.eq(S0_M30.wg_cd))))
					.predicate(p -> p.cutoff$and(S0_M30.wg_nm.like(bind("mfg_loc_wg_nm")))),
				when(boundOr("oper_nm"))
					.view(v -> v.leftOuterJoin(S0_M38).on(bracket(S0_T23.oper_cd.eq(S0_M38.oper_cd))))
					.predicate(p -> p.cutoff$and(S0_M38.oper_nm.like(bind("oper_nm")))),
				when(boundOr("oper_loc_nm"))
					.view(v -> v.leftOuterJoin(S0_M40).on(bracket(S0_T23.oper_loc_cd.eq(S0_M40.loc_cd))))
					.predicate(p -> p.cutoff$and(S0_M40.loc_nm.like(bind("oper_loc_nm")))),
				when(boundOr("oper_str_ln_nm"))
					.view(v -> v.leftOuterJoin(S0_M41).on(bracket(S0_T23.oper_loc_cd.eq(S0_M41.loc_cd).and(S0_T23.oper_str_ln_cd.eq(S0_M41.str_ln_cd)))))
					.predicate(p -> p.cutoff$and(S0_M41.str_ln_nm.like(bind("oper_str_ln_nm")))),
				when(boundOr("oper_usr_nm"))
					.view(v -> v.leftOuterJoin(S0_M42).on(bracket(S0_T23.usr_cd.eq(S0_M42.usr_cd))))
					.predicate(p -> p.cutoff$and(S0_M42.usr_nm.like(bind("oper_usr_nm")))),
				when(boundOr("par_itm_typ_d_nm"))
					.view(v -> v.leftOuterJoin(S0_M44).on(bracket(S0_M21.itm_typ.eq(S0_M44.itm_typ).and(S0_M21.itm_typ_d_cd.eq(S0_M44.itm_typ_d_cd)))))
					.predicate(p -> p.cutoff$and(S0_M44.itm_typ_d_nm.like(bind("par_itm_typ_d_nm")))),
				when(boundOr("mfg_loc_grp_nm"))
					.view(v -> v.leftOuterJoin(S0_M45).on(bracket(S0_M25.loc_grp_cd.eq(S0_M45.loc_grp_cd))))
					.predicate(p -> p.cutoff$and(S0_M45.loc_grp_nm.like(bind("mfg_loc_grp_nm")))),
				when(boundOr("inpt_rsn_nm"))
					.view(v -> v.leftOuterJoin(S0_M91).on(bracket(S0_T1.inpt_rsn_cd.eq(S0_M91.biz_rsn_cd))))
					.predicate(p -> p.cutoff$and(S0_M91.biz_rsn_nm.like(bind("inpt_rsn_nm")))),
				when(boundOr("chd_itm_grp_flg1"))
					.select(DS0C_CHD_ITM_GRP, S0_M1.itm_grp_cd1.as("chd_itm_grp_cd1"), S0_CHD_ITM_GRP1.itm_grp_nm.as("chd_itm_grp_nm1"))
					.view(DS0C_CHD_ITM_GRP, v -> v.leftOuterJoin(S0_CHD_ITM_GRP1).on(S0_M1.itm_grp_cd1.eq(S0_CHD_ITM_GRP1.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP1.value()).eq(S0_CHD_ITM_GRP1.itm_grp_typ))))
					.predicate(DS0C_CHD_ITM_GRP, p -> p.cutoff$and(S0_M1.itm_grp_cd1.like(bind("chd_itm_grp_cd1"))).cutoff$and(S0_CHD_ITM_GRP1.itm_grp_nm.like(bind("chd_itm_grp_nm1")))),
				when(boundOr("chd_itm_grp_flg2"))
					.select(DS0C_CHD_ITM_GRP, S0_M1.itm_grp_cd2.as("chd_itm_grp_cd2"), S0_CHD_ITM_GRP2.itm_grp_nm.as("chd_itm_grp_nm2"))
					.view(DS0C_CHD_ITM_GRP, v -> v.leftOuterJoin(S0_CHD_ITM_GRP2).on(S0_M1.itm_grp_cd2.eq(S0_CHD_ITM_GRP2.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP2.value()).eq(S0_CHD_ITM_GRP2.itm_grp_typ))))
					.predicate(DS0C_CHD_ITM_GRP, p -> p.cutoff$and(S0_M1.itm_grp_cd2.like(bind("chd_itm_grp_cd2"))).cutoff$and(S0_CHD_ITM_GRP2.itm_grp_nm.like(bind("chd_itm_grp_nm2")))),
				when(boundOr("chd_itm_grp_flg3"))
					.select(DS0C_CHD_ITM_GRP, S0_M1.itm_grp_cd3.as("chd_itm_grp_cd3"), S0_CHD_ITM_GRP3.itm_grp_nm.as("chd_itm_grp_nm3"))
					.view(DS0C_CHD_ITM_GRP, v -> v.leftOuterJoin(S0_CHD_ITM_GRP3).on(S0_M1.itm_grp_cd3.eq(S0_CHD_ITM_GRP3.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP3.value()).eq(S0_CHD_ITM_GRP3.itm_grp_typ))))
					.predicate(DS0C_CHD_ITM_GRP, p -> p.cutoff$and(S0_M1.itm_grp_cd3.like(bind("chd_itm_grp_cd3"))).cutoff$and(S0_CHD_ITM_GRP3.itm_grp_nm.like(bind("chd_itm_grp_nm3")))),
				when(boundOr("chd_itm_grp_flg4"))
					.select(DS0C_CHD_ITM_GRP, S0_M1.itm_grp_cd4.as("chd_itm_grp_cd4"), S0_CHD_ITM_GRP4.itm_grp_nm.as("chd_itm_grp_nm4"))
					.view(DS0C_CHD_ITM_GRP, v -> v.leftOuterJoin(S0_CHD_ITM_GRP4).on(S0_M1.itm_grp_cd4.eq(S0_CHD_ITM_GRP4.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP4.value()).eq(S0_CHD_ITM_GRP4.itm_grp_typ))))
					.predicate(DS0C_CHD_ITM_GRP, p -> p.cutoff$and(S0_M1.itm_grp_cd4.like(bind("chd_itm_grp_cd4"))).cutoff$and(S0_CHD_ITM_GRP4.itm_grp_nm.like(bind("chd_itm_grp_nm4")))),
				when(boundOr("chd_itm_grp_flg5"))
					.select(DS0C_CHD_ITM_GRP, S0_M1.itm_grp_cd5.as("chd_itm_grp_cd5"), S0_CHD_ITM_GRP5.itm_grp_nm.as("chd_itm_grp_nm5"))
					.view(DS0C_CHD_ITM_GRP, v -> v.leftOuterJoin(S0_CHD_ITM_GRP5).on(S0_M1.itm_grp_cd5.eq(S0_CHD_ITM_GRP5.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP5.value()).eq(S0_CHD_ITM_GRP5.itm_grp_typ))))
					.predicate(DS0C_CHD_ITM_GRP, p -> p.cutoff$and(S0_M1.itm_grp_cd5.like(bind("chd_itm_grp_cd5"))).cutoff$and(S0_CHD_ITM_GRP5.itm_grp_nm.like(bind("chd_itm_grp_nm5")))),
				when(boundOr("chd_itm_grp_flg6"))
					.select(DS0C_CHD_ITM_GRP, S0_M1.itm_grp_cd6.as("chd_itm_grp_cd6"), S0_CHD_ITM_GRP6.itm_grp_nm.as("chd_itm_grp_nm6"))
					.view(DS0C_CHD_ITM_GRP, v -> v.leftOuterJoin(S0_CHD_ITM_GRP6).on(S0_M1.itm_grp_cd6.eq(S0_CHD_ITM_GRP6.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP6.value()).eq(S0_CHD_ITM_GRP6.itm_grp_typ))))
					.predicate(DS0C_CHD_ITM_GRP, p -> p.cutoff$and(S0_M1.itm_grp_cd6.like(bind("chd_itm_grp_cd6"))).cutoff$and(S0_CHD_ITM_GRP6.itm_grp_nm.like(bind("chd_itm_grp_nm6")))),
				when(boundOr("chd_itm_grp_flg7"))
					.select(DS0C_CHD_ITM_GRP, S0_M1.itm_grp_cd7.as("chd_itm_grp_cd7"), S0_CHD_ITM_GRP7.itm_grp_nm.as("chd_itm_grp_nm7"))
					.view(DS0C_CHD_ITM_GRP, v -> v.leftOuterJoin(S0_CHD_ITM_GRP7).on(S0_M1.itm_grp_cd7.eq(S0_CHD_ITM_GRP7.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP7.value()).eq(S0_CHD_ITM_GRP7.itm_grp_typ))))
					.predicate(DS0C_CHD_ITM_GRP, p -> p.cutoff$and(S0_M1.itm_grp_cd7.like(bind("chd_itm_grp_cd7"))).cutoff$and(S0_CHD_ITM_GRP7.itm_grp_nm.like(bind("chd_itm_grp_nm7")))),
				when(boundOr("chd_itm_grp_flg8"))
					.select(DS0C_CHD_ITM_GRP, S0_M1.itm_grp_cd8.as("chd_itm_grp_cd8"), S0_CHD_ITM_GRP8.itm_grp_nm.as("chd_itm_grp_nm8"))
					.view(DS0C_CHD_ITM_GRP, v -> v.leftOuterJoin(S0_CHD_ITM_GRP8).on(S0_M1.itm_grp_cd8.eq(S0_CHD_ITM_GRP8.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP8.value()).eq(S0_CHD_ITM_GRP8.itm_grp_typ))))
					.predicate(DS0C_CHD_ITM_GRP, p -> p.cutoff$and(S0_M1.itm_grp_cd8.like(bind("chd_itm_grp_cd8"))).cutoff$and(S0_CHD_ITM_GRP8.itm_grp_nm.like(bind("chd_itm_grp_nm8")))),
				when(boundOr("chd_itm_grp_flg9"))
					.select(DS0C_CHD_ITM_GRP, S0_M1.itm_grp_cd9.as("chd_itm_grp_cd9"), S0_CHD_ITM_GRP9.itm_grp_nm.as("chd_itm_grp_nm9"))
					.view(DS0C_CHD_ITM_GRP, v -> v.leftOuterJoin(S0_CHD_ITM_GRP9).on(S0_M1.itm_grp_cd9.eq(S0_CHD_ITM_GRP9.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP9.value()).eq(S0_CHD_ITM_GRP9.itm_grp_typ))))
					.predicate(DS0C_CHD_ITM_GRP, p -> p.cutoff$and(S0_M1.itm_grp_cd9.like(bind("chd_itm_grp_cd9"))).cutoff$and(S0_CHD_ITM_GRP9.itm_grp_nm.like(bind("chd_itm_grp_nm9")))),
				when(boundOr("chd_itm_grp_flg10"))
					.select(DS0C_CHD_ITM_GRP, S0_M1.itm_grp_cd10.as("chd_itm_grp_cd10"), S0_CHD_ITM_GRP10.itm_grp_nm.as("chd_itm_grp_nm10"))
					.view(DS0C_CHD_ITM_GRP, v -> v.leftOuterJoin(S0_CHD_ITM_GRP10).on(S0_M1.itm_grp_cd10.eq(S0_CHD_ITM_GRP10.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP10.value()).eq(S0_CHD_ITM_GRP10.itm_grp_typ))))
					.predicate(DS0C_CHD_ITM_GRP, p -> p.cutoff$and(S0_M1.itm_grp_cd10.like(bind("chd_itm_grp_cd10"))).cutoff$and(S0_CHD_ITM_GRP10.itm_grp_nm.like(bind("chd_itm_grp_nm10")))),
				when(boundOr("par_itm_grp_flg1"))
					.select(DS0C_PAR_ITM_GRP, S0_M21.itm_grp_cd1.as("par_itm_grp_cd1"), S0_PAR_ITM_GRP1.itm_grp_nm.as("par_itm_grp_nm1"))
					.view(DS0C_PAR_ITM_GRP, v -> v.leftOuterJoin(S0_PAR_ITM_GRP1).on(S0_M21.itm_grp_cd1.eq(S0_PAR_ITM_GRP1.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP1.value()).eq(S0_PAR_ITM_GRP1.itm_grp_typ))))
					.predicate(DS0C_PAR_ITM_GRP, p -> p.cutoff$and(S0_M21.itm_grp_cd1.like(bind("par_itm_grp_cd1"))).cutoff$and(S0_PAR_ITM_GRP1.itm_grp_nm.like(bind("par_itm_grp_nm1")))),
				when(boundOr("par_itm_grp_flg2"))
					.select(DS0C_PAR_ITM_GRP, S0_M21.itm_grp_cd2.as("par_itm_grp_cd2"), S0_PAR_ITM_GRP2.itm_grp_nm.as("par_itm_grp_nm2"))
					.view(DS0C_PAR_ITM_GRP, v -> v.leftOuterJoin(S0_PAR_ITM_GRP2).on(S0_M21.itm_grp_cd2.eq(S0_PAR_ITM_GRP2.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP2.value()).eq(S0_PAR_ITM_GRP2.itm_grp_typ))))
					.predicate(DS0C_PAR_ITM_GRP, p -> p.cutoff$and(S0_M21.itm_grp_cd2.like(bind("par_itm_grp_cd2"))).cutoff$and(S0_PAR_ITM_GRP2.itm_grp_nm.like(bind("par_itm_grp_nm2")))),
				when(boundOr("par_itm_grp_flg3"))
					.select(DS0C_PAR_ITM_GRP, S0_M21.itm_grp_cd3.as("par_itm_grp_cd3"), S0_PAR_ITM_GRP3.itm_grp_nm.as("par_itm_grp_nm3"))
					.view(DS0C_PAR_ITM_GRP, v -> v.leftOuterJoin(S0_PAR_ITM_GRP3).on(S0_M21.itm_grp_cd3.eq(S0_PAR_ITM_GRP3.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP3.value()).eq(S0_PAR_ITM_GRP3.itm_grp_typ))))
					.predicate(DS0C_PAR_ITM_GRP, p -> p.cutoff$and(S0_M21.itm_grp_cd3.like(bind("par_itm_grp_cd3"))).cutoff$and(S0_PAR_ITM_GRP3.itm_grp_nm.like(bind("par_itm_grp_nm3")))),
				when(boundOr("par_itm_grp_flg4"))
					.select(DS0C_PAR_ITM_GRP, S0_M21.itm_grp_cd4.as("par_itm_grp_cd4"), S0_PAR_ITM_GRP4.itm_grp_nm.as("par_itm_grp_nm4"))
					.view(DS0C_PAR_ITM_GRP, v -> v.leftOuterJoin(S0_PAR_ITM_GRP4).on(S0_M21.itm_grp_cd4.eq(S0_PAR_ITM_GRP4.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP4.value()).eq(S0_PAR_ITM_GRP4.itm_grp_typ))))
					.predicate(DS0C_PAR_ITM_GRP, p -> p.cutoff$and(S0_M21.itm_grp_cd4.like(bind("par_itm_grp_cd4"))).cutoff$and(S0_PAR_ITM_GRP4.itm_grp_nm.like(bind("par_itm_grp_nm4")))),
				when(boundOr("par_itm_grp_flg5"))
					.select(DS0C_PAR_ITM_GRP, S0_M21.itm_grp_cd5.as("par_itm_grp_cd5"), S0_PAR_ITM_GRP5.itm_grp_nm.as("par_itm_grp_nm5"))
					.view(DS0C_PAR_ITM_GRP, v -> v.leftOuterJoin(S0_PAR_ITM_GRP5).on(S0_M21.itm_grp_cd5.eq(S0_PAR_ITM_GRP5.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP5.value()).eq(S0_PAR_ITM_GRP5.itm_grp_typ))))
					.predicate(DS0C_PAR_ITM_GRP, p -> p.cutoff$and(S0_M21.itm_grp_cd5.like(bind("par_itm_grp_cd5"))).cutoff$and(S0_PAR_ITM_GRP5.itm_grp_nm.like(bind("par_itm_grp_nm5")))),
				when(boundOr("par_itm_grp_flg6"))
					.select(DS0C_PAR_ITM_GRP, S0_M21.itm_grp_cd6.as("par_itm_grp_cd6"), S0_PAR_ITM_GRP6.itm_grp_nm.as("par_itm_grp_nm6"))
					.view(DS0C_PAR_ITM_GRP, v -> v.leftOuterJoin(S0_PAR_ITM_GRP6).on(S0_M21.itm_grp_cd6.eq(S0_PAR_ITM_GRP6.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP6.value()).eq(S0_PAR_ITM_GRP6.itm_grp_typ))))
					.predicate(DS0C_PAR_ITM_GRP, p -> p.cutoff$and(S0_M21.itm_grp_cd6.like(bind("par_itm_grp_cd6"))).cutoff$and(S0_PAR_ITM_GRP6.itm_grp_nm.like(bind("par_itm_grp_nm6")))),
				when(boundOr("par_itm_grp_flg7"))
					.select(DS0C_PAR_ITM_GRP, S0_M21.itm_grp_cd7.as("par_itm_grp_cd7"), S0_PAR_ITM_GRP7.itm_grp_nm.as("par_itm_grp_nm7"))
					.view(DS0C_PAR_ITM_GRP, v -> v.leftOuterJoin(S0_PAR_ITM_GRP7).on(S0_M21.itm_grp_cd7.eq(S0_PAR_ITM_GRP7.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP7.value()).eq(S0_PAR_ITM_GRP7.itm_grp_typ))))
					.predicate(DS0C_PAR_ITM_GRP, p -> p.cutoff$and(S0_M21.itm_grp_cd7.like(bind("par_itm_grp_cd7"))).cutoff$and(S0_PAR_ITM_GRP7.itm_grp_nm.like(bind("par_itm_grp_nm7")))),
				when(boundOr("par_itm_grp_flg8"))
					.select(DS0C_PAR_ITM_GRP, S0_M21.itm_grp_cd8.as("par_itm_grp_cd8"), S0_PAR_ITM_GRP8.itm_grp_nm.as("par_itm_grp_nm8"))
					.view(DS0C_PAR_ITM_GRP, v -> v.leftOuterJoin(S0_PAR_ITM_GRP8).on(S0_M21.itm_grp_cd8.eq(S0_PAR_ITM_GRP8.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP8.value()).eq(S0_PAR_ITM_GRP8.itm_grp_typ))))
					.predicate(DS0C_PAR_ITM_GRP, p -> p.cutoff$and(S0_M21.itm_grp_cd8.like(bind("par_itm_grp_cd8"))).cutoff$and(S0_PAR_ITM_GRP8.itm_grp_nm.like(bind("par_itm_grp_nm8")))),
				when(boundOr("par_itm_grp_flg9"))
					.select(DS0C_PAR_ITM_GRP, S0_M21.itm_grp_cd9.as("par_itm_grp_cd9"), S0_PAR_ITM_GRP9.itm_grp_nm.as("par_itm_grp_nm9"))
					.view(DS0C_PAR_ITM_GRP, v -> v.leftOuterJoin(S0_PAR_ITM_GRP9).on(S0_M21.itm_grp_cd9.eq(S0_PAR_ITM_GRP9.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP9.value()).eq(S0_PAR_ITM_GRP9.itm_grp_typ))))
					.predicate(DS0C_PAR_ITM_GRP, p -> p.cutoff$and(S0_M21.itm_grp_cd9.like(bind("par_itm_grp_cd9"))).cutoff$and(S0_PAR_ITM_GRP9.itm_grp_nm.like(bind("par_itm_grp_nm9")))),
				when(boundOr("par_itm_grp_flg10"))
					.select(DS0C_PAR_ITM_GRP, S0_M21.itm_grp_cd10.as("par_itm_grp_cd10"), S0_PAR_ITM_GRP10.itm_grp_nm.as("par_itm_grp_nm10"))
					.view(DS0C_PAR_ITM_GRP, v -> v.leftOuterJoin(S0_PAR_ITM_GRP10).on(S0_M21.itm_grp_cd10.eq(S0_PAR_ITM_GRP10.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP10.value()).eq(S0_PAR_ITM_GRP10.itm_grp_typ))))
					.predicate(DS0C_PAR_ITM_GRP, p -> p.cutoff$and(S0_M21.itm_grp_cd10.like(bind("par_itm_grp_cd10"))).cutoff$and(S0_PAR_ITM_GRP10.itm_grp_nm.like(bind("par_itm_grp_nm10"))))
			)
			.setJoinInfo(
				joinInfo(
					j -> j
						.add(MST_WRK_SNO_R.class, r -> toCondition(
							r.getStringNE("par_sno1")
						))
						.addSelect(m -> toArray(
							m.wrk_no
						))
						.addMap((r, m) -> {
							r.setStringNE("wrk_no", m.wrk_no());
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
						.add(MAM_LOC_R.class, r -> toCondition(
							r.getStringNE("inpt_loc_cd")
						))
						.addSelect(m -> toArray(
							m.loc_nm,
							m.wg_cd
						))
						.addMap((r, m) -> {
							r.setStringNE("inpt_loc_nm", m.loc_nm());
							r.setStringNE("join_wg_cd_", m.wg_cd());
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
						.add(MAM_ALT_GRP_R.class, r -> toCondition(
							r.getStringNE("alt_grp_cd"),
							r.getStringNE("join_wg_cd_")
						))
						.addSelect(m -> toArray(
							m.alt_grp_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("alt_grp_nm", m.alt_grp_nm());
					}),
					j -> j
						.add(MAM_STR_LN_R.class, r -> toCondition(
							r.getStringNE("inpt_loc_cd"),
							r.getStringNE("inpt_str_ln_cd")
						))
						.addSelect(m -> toArray(
							m.str_ln_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("inpt_str_ln_nm", m.str_ln_nm());
					}),
					j -> j
						.add(MAM_BIZ_RSN_R.class, r -> toCondition(
							r.getStringNE("acxfr_act_rsn_cd")
						))
						.addSelect(m -> toArray(
							m.biz_rsn_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("acxfr_act_rsn_nm", m.biz_rsn_nm());
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
						.add(MAM_BP_R.class, r -> toCondition(
							r.getStringNE("stk_arrv_bp_cd")
						))
						.addSelect(m -> toArray(
							m.bp_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("stk_arrv_bp_nm", m.bp_nm());
					}),
					j -> j
						.add(MAM_ITM_TYP_D_R.class, r -> toCondition(
							r.getStringNE("chd_itm_typ"),
							r.getStringNE("chd_itm_typ_d_cd")
						))
						.addSelect(m -> toArray(
							m.itm_typ_d_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("chd_itm_typ_d_nm", m.itm_typ_d_nm());
					}),
					j -> j
						.add(MAM_UNIT_R.class, r -> toCondition(
							r.getStringNE("par_base_unit_cd")
						))
						.addSelect(m -> toArray(
							m.dec_place,
							m.unit_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("par_base_unit_nm", m.unit_nm());
							r.setNumberNE("par_base_unit_dec_place", m.dec_place());
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
						.add(MAM_STR_LN_R.class, r -> toCondition(
							r.getStringNE("mfg_loc_cd"),
							r.getStringNE("mfg_str_ln_cd")
						))
						.addSelect(m -> toArray(
							m.str_ln_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("mfg_str_ln_nm", m.str_ln_nm());
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
							r.getStringNE("wg_cd")
						))
						.addSelect(m -> toArray(
							m.wg_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("wg_nm", m.wg_nm());
					}),
					j -> j
						.add(MAM_OPER_R.class, r -> toCondition(
							r.getStringNE("oper_cd")
						))
						.addSelect(m -> toArray(
							m.oper_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("oper_nm", m.oper_nm());
					}),
					j -> j
						.add(MAM_UNIT_R.class, r -> toCondition(
							r.getStringNE("oper_unit_cd")
						))
						.addSelect(m -> toArray(
							m.unit_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("oper_unit_nm", m.unit_nm());
					}),
					j -> j
						.add(MAM_LOC_R.class, r -> toCondition(
							r.getStringNE("oper_loc_cd")
						))
						.addSelect(m -> toArray(
							m.loc_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("oper_loc_nm", m.loc_nm());
					}),
					j -> j
						.add(MAM_STR_LN_R.class, r -> toCondition(
							r.getStringNE("oper_loc_cd"),
							r.getStringNE("oper_str_ln_cd")
						))
						.addSelect(m -> toArray(
							m.str_ln_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("oper_str_ln_nm", m.str_ln_nm());
					}),
					j -> j
						.add(MAM_USR_R.class, r -> toCondition(
							r.getStringNE("oper_usr_cd")
						))
						.addSelect(m -> toArray(
							m.usr_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("oper_usr_nm", m.usr_nm());
					}),
					j -> j
						.add(MAM_ITM_TYP_D_R.class, r -> toCondition(
							r.getStringNE("par_itm_typ"),
							r.getStringNE("par_itm_typ_d_cd")
						))
						.addSelect(m -> toArray(
							m.itm_typ_d_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("par_itm_typ_d_nm", m.itm_typ_d_nm());
					}),
					j -> j
						.add(MAM_LOC_GRP_R.class, r -> toCondition(
							r.getStringNE("mfg_loc_grp_cd")
						))
						.addSelect(m -> toArray(
							m.loc_grp_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("mfg_loc_grp_nm", m.loc_grp_nm());
					}),
					j -> j
						.add(MAM_BIZ_RSN_R.class, r -> toCondition(
							r.getStringNE("inpt_rsn_cd")
						))
						.addSelect(m -> toArray(
							m.biz_rsn_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("inpt_rsn_nm", m.biz_rsn_nm());
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
	 * -- MSBCL1090_MST_INPT_SCHD_Query_S01
	 */
	static MCQueryPlan MSBCL1090_MST_INPT_SCHD_S01() {
		MST_INPT_SCHD_R S0_T1 = MST_INPT_SCHD_R.create("T1");
		MSVT_INPT_SCHD_PR_R S0_T2 = MSVT_INPT_SCHD_PR_R.create("T2");
		MST_ITM_MFG_INST_R S0_T12 = MST_ITM_MFG_INST_R.create("T12");
		MST_MFG_INST_R S0_T13 = MST_MFG_INST_R.create("T13");
		MSVT_MFG_INST_PR_R S0_T14 = MSVT_MFG_INST_PR_R.create("T14");
		MST_WRK_SNO_R S0_T15 = MST_WRK_SNO_R.create("T15");
		MST_WRK_R S0_T16 = MST_WRK_R.create("T16");
		MSVT_OPER_INST_PR_R S0_T22 = MSVT_OPER_INST_PR_R.create("T22");
		MST_OPER_INST_R S0_T23 = MST_OPER_INST_R.create("T23");
		MCTempView S0_TA1 = createTempView("TA1");
		MCTempView S0_TA2 = createTempView("TA2");
		MCTempView S0_TA3 = createTempView("TA3");
		MAM_ITM_R S0_M1 = MAM_ITM_R.create("M1");
		MAM_SUNDRY_ITM_R S0_M2 = MAM_SUNDRY_ITM_R.create("M2");
		MAM_LOC_R S0_M5 = MAM_LOC_R.create("M5");
		MAM_STR_LN_R S0_M10 = MAM_STR_LN_R.create("M10");
		MAM_ITM_TYP_D_R S0_M15 = MAM_ITM_TYP_D_R.create("M15");
		MAM_ITM_R S0_M21 = MAM_ITM_R.create("M21");
		MAM_SUNDRY_ITM_R S0_M22 = MAM_SUNDRY_ITM_R.create("M22");
		MAM_BP_R S0_M24 = MAM_BP_R.create("M24");
		MAVM_RD_LOC_R S0_M25 = MAVM_RD_LOC_R.create("M25");
		MAM_STR_LN_R S0_M26 = MAM_STR_LN_R.create("M26");
		MAM_SITE_R S0_M29 = MAM_SITE_R.create("M29");
		MAM_WG_R S0_M30 = MAM_WG_R.create("M30");
		MAM_OPER_R S0_M38 = MAM_OPER_R.create("M38");
		MAM_LOC_R S0_M40 = MAM_LOC_R.create("M40");
		MAM_STR_LN_R S0_M41 = MAM_STR_LN_R.create("M41");
		MAM_USR_R S0_M42 = MAM_USR_R.create("M42");
		MAM_ITM_TYP_D_R S0_M44 = MAM_ITM_TYP_D_R.create("M44");
		MAM_LOC_GRP_R S0_M45 = MAM_LOC_GRP_R.create("M45");
		MAM_BIZ_RSN_R S0_M91 = MAM_BIZ_RSN_R.create("M91");
		MAM_ITM_GRP_R S0_CHD_ITM_GRP1 = MAM_ITM_GRP_R.create("CHD_ITM_GRP1");
		MAM_ITM_GRP_R S0_CHD_ITM_GRP2 = MAM_ITM_GRP_R.create("CHD_ITM_GRP2");
		MAM_ITM_GRP_R S0_CHD_ITM_GRP3 = MAM_ITM_GRP_R.create("CHD_ITM_GRP3");
		MAM_ITM_GRP_R S0_CHD_ITM_GRP4 = MAM_ITM_GRP_R.create("CHD_ITM_GRP4");
		MAM_ITM_GRP_R S0_CHD_ITM_GRP5 = MAM_ITM_GRP_R.create("CHD_ITM_GRP5");
		MAM_ITM_GRP_R S0_CHD_ITM_GRP6 = MAM_ITM_GRP_R.create("CHD_ITM_GRP6");
		MAM_ITM_GRP_R S0_CHD_ITM_GRP7 = MAM_ITM_GRP_R.create("CHD_ITM_GRP7");
		MAM_ITM_GRP_R S0_CHD_ITM_GRP8 = MAM_ITM_GRP_R.create("CHD_ITM_GRP8");
		MAM_ITM_GRP_R S0_CHD_ITM_GRP9 = MAM_ITM_GRP_R.create("CHD_ITM_GRP9");
		MAM_ITM_GRP_R S0_CHD_ITM_GRP10 = MAM_ITM_GRP_R.create("CHD_ITM_GRP10");
		MAM_ITM_GRP_R S0_PAR_ITM_GRP1 = MAM_ITM_GRP_R.create("PAR_ITM_GRP1");
		MAM_ITM_GRP_R S0_PAR_ITM_GRP2 = MAM_ITM_GRP_R.create("PAR_ITM_GRP2");
		MAM_ITM_GRP_R S0_PAR_ITM_GRP3 = MAM_ITM_GRP_R.create("PAR_ITM_GRP3");
		MAM_ITM_GRP_R S0_PAR_ITM_GRP4 = MAM_ITM_GRP_R.create("PAR_ITM_GRP4");
		MAM_ITM_GRP_R S0_PAR_ITM_GRP5 = MAM_ITM_GRP_R.create("PAR_ITM_GRP5");
		MAM_ITM_GRP_R S0_PAR_ITM_GRP6 = MAM_ITM_GRP_R.create("PAR_ITM_GRP6");
		MAM_ITM_GRP_R S0_PAR_ITM_GRP7 = MAM_ITM_GRP_R.create("PAR_ITM_GRP7");
		MAM_ITM_GRP_R S0_PAR_ITM_GRP8 = MAM_ITM_GRP_R.create("PAR_ITM_GRP8");
		MAM_ITM_GRP_R S0_PAR_ITM_GRP9 = MAM_ITM_GRP_R.create("PAR_ITM_GRP9");
		MAM_ITM_GRP_R S0_PAR_ITM_GRP10 = MAM_ITM_GRP_R.create("PAR_ITM_GRP10");
		MST_INPT_ACT_R S1 = MST_INPT_ACT_R.create();
		MST_MFG_ACT_R S2 = MST_MFG_ACT_R.create();
		MST_OPER_ACT_R S3 = MST_OPER_ACT_R.create();
		
		MCDynamicSQLID DS0C_CHD_ITM_GRP = createDynamicSQLID("DS0C_CHD_ITM_GRP");
		MCDynamicSQLID DS0C_PAR_ITM_GRP = createDynamicSQLID("DS0C_PAR_ITM_GRP");
		
		return createQueryPlan()
			.setQuery(
				sql("MSBCL1090_MST_INPT_SCHD_Query_S01")
					.mainQuery()
					.select(
						S0_T2.mfg_sts_typ.as("inpt_mfg_sts_typ"),
						S0_T1.itm_cd.as("chd_itm_cd"),
						S0_T1.itm_sub1.as("chd_itm_sub1"),
						S0_T1.itm_sub2.as("chd_itm_sub2"),
						S0_T1.itm_sub3.as("chd_itm_sub3"),
						nvl(
							S0_M2.itm_nm,
							S0_M1.itm_nm
						).as("chd_itm_nm"),
						S0_M1.itm_typ.as("chd_itm_typ"),
						S0_M1.itm_typ_d_cd.as("chd_itm_typ_d_cd"),
						S0_T1.ver_no,
						S0_TA1.pr("base_unit_inpt_qty"),
						S0_TA1.pr("base_unit_loss_qty"),
						S0_TA1.pr("base_unit_fxd_loss_qty"),
						bracket(
							cases()
								.when(S0_T2.base_unit_inpt_abort_qty.gt(value(0)))
									.then(value(true))
								.otherwise(value(false))
						).as("schd_abort_flg"),
						S0_T1.base_unit_inpt_qty.as("base_unit_schd_inpt_qty"),
						S0_T1.base_unit_rqmt_qty.as("base_unit_schd_rqmt_qty"),
						S0_T1.base_unit_fxd_rqmt_qty.as("base_unit_schd_fxd_rqmt_qty"),
						S0_T2.base_unit_inpt_rem_qty.add(S0_T2.base_unit_fxd_rqmt_rem_qty).as("base_unit_inpt_rem_qty"),
						S0_T1.base_unit_cd,
						MAPA_CALC$F_CALC_PER(
							S0_T2.base_unit_inpt_qty,
							S0_TA1.pr("pr_rate_numerator")
						).as("pr_rate"),
						S0_M1.dec_place.as("base_unit_dec_place"),
						S0_M1.cont_fctr_flg,
						S0_M1.cont_fctr_rnd_typ,
						S0_M1.cont_fctr_dec_place,
						S0_T1.act_cont_fctr,
						S0_T1.cont_fctr_unit_cd,
						S0_T1.std_cont_fctr,
						S0_TA1.pr("cont_qty").as("cont_inpt_qty"),
						S0_TA1.pr("cont_loss_qty"),
						S0_TA1.pr("cont_fxd_loss_qty"),
						S0_T1.cont_inpt_qty.as("cont_schd_inpt_qty"),
						S0_T1.cont_rqmt_qty.as("cont_schd_rqmt_qty"),
						S0_T1.cont_fxd_rqmt_qty.as("cont_schd_fxd_rqmt_qty"),
						S0_T1.lot_no.as("inst_lot_no"),
						S0_T1.sublot_no.as("inst_sublot_no"),
						trunc(
							S0_TA1.pr("act_tm"),
							MCDateFmt.DD
						).as("act_dt"),
						S0_TA1.pr("act_tm").as("act_hm"),
						S0_TA1.pr("ac_dt"),
						trunc(
							S0_T1.schd_tm,
							MCDateFmt.DD
						).as("schd_dt"),
						S0_T1.schd_tm.as("schd_hm"),
						S0_T1.sno1,
						S0_T1.sno2,
						S0_T1.sno3,
						S0_T1.sno4,
						S0_T1.bkf_typ,
						S0_T1.alloc_flg,
						S0_T1.alloc_ctl_typ,
						S0_T1.inpt_ctl_typ,
						S0_T1.gd_cd,
						S0_T1.inpt_rsn_cd,
						S0_T1.inpt_loc_cd,
						S0_T1.inpt_str_ln_cd,
						S0_T1.intr_rmrks.as("inpt_schd_intr_rmrks"),
						S0_T1.inst_rpt_rmrks.as("inpt_schd_inst_rpt_rmrks"),
						S0_T1.sub_char1.as("inpt_schd_sub_char1"),
						S0_T1.sub_char2.as("inpt_schd_sub_char2"),
						S0_T1.sub_char3.as("inpt_schd_sub_char3"),
						S0_T1.main_itm_flg,
						S0_T1.yield_calc_flg,
						S0_T1.lot_mix_flg,
						S0_T1.sublot_mix_flg,
						S0_T1.ver_no.as("inpt_schd_ver_no"),
						S0_M1.stk_mng_typ,
						S0_T1.prov_typ,
						S0_T1.alt_grp_cd,
						S0_T1.alt_grp_seq,
						S0_T1.alt_itm_fix_flg,
						S0_T1.alt_itm_typ,
						S0_T1.alt_alloc_prio,
						S0_T1.inpt_schd_no,
						S0_T12.itm_cd.as("par_itm_cd"),
						S0_T12.itm_sub1.as("par_itm_sub1"),
						S0_T12.itm_sub2.as("par_itm_sub2"),
						S0_T12.itm_sub3.as("par_itm_sub3"),
						nvl(
							S0_M22.itm_nm,
							S0_M21.itm_nm
						).as("par_itm_nm"),
						S0_M21.itm_typ.as("par_itm_typ"),
						S0_M21.itm_typ_d_cd.as("par_itm_typ_d_cd"),
						S0_T22.mfg_sts_typ.as("oper_mfg_sts_typ"),
						S0_T23.oper_cd,
						S0_T23.disp_seq.as("oper_disp_seq"),
						S0_T23.oper_seq,
						trunc(
							S0_TA2.pr("st_act_tm"),
							MCDateFmt.DD
						).as("st_act_dt"),
						S0_TA2.pr("st_act_tm").as("st_act_hm"),
						S0_TA2.pr("st_ac_dt"),
						trunc(
							S0_TA2.pr("end_act_tm"),
							MCDateFmt.DD
						).as("end_act_dt"),
						S0_TA2.pr("end_act_tm").as("end_act_hm"),
						S0_TA2.pr("end_ac_dt"),
						S0_TA3.pr("oper_unit_qty").as("oper_unit_act_qty"),
						S0_T23.base_unit_qty.as("base_unit_oper_schd_qty"),
						S0_T23.oper_std_qty,
						S0_T23.oper_conv_qty,
						S0_T23.oper_unit_conv_rnd_typ,
						nullValue().as("oper_unit_schd_qty"),
						S0_T23.oper_unit_dec_place,
						S0_T23.oper_unit_cd,
						S0_T13.base_unit_inst_qty.as("par_base_unit_mfg_inst_qty"),
						S0_T13.base_unit_yield_qty.as("par_base_unit_yield_schd_qty"),
						S0_T14.base_unit_mfg_qty.as("par_base_unit_st_act_qty"),
						S0_TA2.pr("base_unit_yield_qty").as("par_base_unit_yield_qty"),
						S0_TA2.pr("base_unit_dfct_qty").as("par_base_unit_dfct_qty"),
						S0_T13.base_unit_cd.as("par_base_unit_cd"),
						S0_T12.lot_no.as("par_inst_lot_no"),
						S0_T12.sublot_no.as("par_inst_sublot_no"),
						S0_T12.sno1.as("par_sno1"),
						S0_T12.sno2.as("par_sno2"),
						S0_T12.sno3.as("par_sno3"),
						S0_T12.sno4.as("par_sno4"),
						S0_T12.itm_lower_yield,
						S0_T12.itm_std_yield,
						S0_T12.itm_upper_yield,
						S0_T23.oper_lower_yield,
						S0_T23.oper_std_yield,
						S0_T23.oper_upper_yield,
						S0_T12.mfg_mtd_typ,
						S0_T12.sppl_cd,
						S0_T12.mfg_loc_cd,
						S0_M25.loc_nm.as("mfg_loc_nm"),
						S0_M25.loc_grp_cd.as("mfg_loc_grp_cd"),
						S0_T12.mfg_str_ln_cd,
						S0_T23.oper_loc_cd,
						S0_T23.oper_str_ln_cd,
						S0_T12.site_cd,
						S0_T12.wg_cd,
						S0_T12.bom_ptn,
						S0_T12.oper_ptn,
						S0_T12.itm_ord_no,
						S0_T23.usr_cd.as("oper_usr_cd"),
						S0_T1.disp_seq,
						S0_T1.oper_inst_no,
						S0_T1.mfg_inst_no,
						S0_T13.po_d_no,
						S0_T1.ins_usr_id,
						S0_T1.ins_usr_nm,
						S0_T1.ins_func_id,
						S0_T1.ins_ts,
						S0_T1.upd_usr_id,
						S0_T1.upd_usr_nm,
						S0_T1.upd_func_id,
						S0_T1.upd_ts,
						S0_T1.upd_srv_req_no,
						addDynamicSelect(DS0C_CHD_ITM_GRP),
						addDynamicSelect(DS0C_PAR_ITM_GRP)
					)
					.from(
						S0_T1
						.leftOuterJoin(S0_T2).on(
							bracket(
								S0_T1.inpt_schd_no.eq(S0_T2.inpt_schd_no)
							)
						)
						.innerJoin(S0_T12).on(
							bracket(
								S0_T1.itm_mfg_inst_no.eq(S0_T12.itm_mfg_inst_no)
							)
						)
						.innerJoin(S0_T13).on(
							bracket(
								S0_T1.mfg_inst_no.eq(S0_T13.mfg_inst_no)
							)
						)
						.innerJoin(S0_T14).on(
							bracket(
								S0_T1.mfg_inst_no.eq(S0_T14.mfg_inst_no)
							)
						)
						.innerJoin(S0_T22).on(
							bracket(
								S0_T1.oper_inst_no.eq(S0_T22.oper_inst_no)
							)
						)
						.innerJoin(S0_T23).on(
							bracket(
								S0_T1.oper_inst_no.eq(S0_T23.oper_inst_no)
							)
						)
						.leftOuterJoin(
							subQuery()
							.select(
								sum(S1.base_unit_inpt_qty).as("base_unit_inpt_qty"),
								sum(S1.base_unit_loss_qty).as("base_unit_loss_qty"),
								sum(S1.base_unit_fxd_loss_qty).as("base_unit_fxd_loss_qty"),
								bracket(
									cases()
										.when(bind("tmp_pr_rate_inc_loss_str").eq(value(true)))
											.then(sum(S1.base_unit_inpt_qty).add(sum(S1.base_unit_loss_qty)))
										.otherwise(sum(S1.base_unit_inpt_qty))
								).as("pr_rate_numerator"),
								sum(S1.cont_qty).as("cont_qty"),
								sum(S1.cont_loss_qty).as("cont_loss_qty"),
								sum(S1.cont_fxd_loss_qty).as("cont_fxd_loss_qty"),
								max(S1.act_tm).as("act_tm"),
								max(S1.ac_dt).as("ac_dt"),
								S1.inpt_schd_no
							)
							.from(S1)
							.groupBy(S1.inpt_schd_no).view(S0_TA1)
						).on(
							bracket(
								S0_T1.inpt_schd_no.eq(S0_TA1.pr(S1.inpt_schd_no))
							)
						)
						.leftOuterJoin(
							subQuery()
							.select(
								sum(S2.base_unit_yield_qty).as("base_unit_yield_qty"),
								sum(S2.base_unit_dfct_qty).as("base_unit_dfct_qty"),
								min(S2.st_act_tm).as("st_act_tm"),
								max(S2.end_act_tm).as("end_act_tm"),
								min(S2.st_ac_dt).as("st_ac_dt"),
								max(S2.end_ac_dt).as("end_ac_dt"),
								S2.mfg_inst_no
							)
							.from(S2)
							.groupBy(S2.mfg_inst_no).view(S0_TA2)
						).on(
							bracket(
								S0_T1.mfg_inst_no.eq(S0_TA2.pr(S2.mfg_inst_no))
							)
						)
						.leftOuterJoin(
							subQuery()
							.select(
								sum(S3.oper_unit_qty).as("oper_unit_qty"),
								S3.oper_inst_no
							)
							.from(S3)
							.groupBy(S3.oper_inst_no).view(S0_TA3)
						).on(
							bracket(
								S0_T1.oper_inst_no.eq(S0_TA3.pr(S3.oper_inst_no))
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
						.leftOuterJoin(S0_M2).on(
							bracket(
								S0_T1.itm_cd.eq(S0_M2.itm_cd)
								.and(S0_T1.itm_sub1.eq(S0_M2.itm_sub1))
								.and(S0_T1.itm_sub2.eq(S0_M2.itm_sub2))
								.and(S0_T1.itm_sub3.eq(S0_M2.itm_sub3))
								.and(S0_T1.sno1.eq(S0_M2.sno1))
								.and(S0_T1.sno2.eq(S0_M2.sno2))
								.and(S0_T1.sno3.eq(S0_M2.sno3))
								.and(S0_T1.sno4.eq(S0_M2.sno4))
							)
						)
						.leftOuterJoin(S0_M21).on(
							bracket(
								S0_T12.itm_cd.eq(S0_M21.itm_cd)
								.and(S0_T12.itm_sub1.eq(S0_M21.itm_sub1))
								.and(S0_T12.itm_sub2.eq(S0_M21.itm_sub2))
								.and(S0_T12.itm_sub3.eq(S0_M21.itm_sub3))
							)
						)
						.leftOuterJoin(S0_M22).on(
							bracket(
								S0_T12.itm_cd.eq(S0_M22.itm_cd)
								.and(S0_T12.itm_sub1.eq(S0_M22.itm_sub1))
								.and(S0_T12.itm_sub2.eq(S0_M22.itm_sub2))
								.and(S0_T12.itm_sub3.eq(S0_M22.itm_sub3))
								.and(S0_T12.sno1.eq(S0_M22.sno1))
								.and(S0_T12.sno2.eq(S0_M22.sno2))
								.and(S0_T12.sno3.eq(S0_M22.sno3))
								.and(S0_T12.sno4.eq(S0_M22.sno4))
							)
						)
						.innerJoin(S0_M25).on(
							bracket(
								S0_T12.mfg_loc_cd.eq(S0_M25.loc_cd)
							)
						)
						.addDynamicView()
						.addDynamicView(DS0C_CHD_ITM_GRP)
						.addDynamicView(DS0C_PAR_ITM_GRP)
					)
					.where(
						value(0).eq(value(0))
						.and(S0_T1.can_flg.eq(value(false)))
						.and(
							value(true).eq(value(false))
							.cutoff$or(S0_T22.mfg_sts_typ.eq(bind("tmp_oper_sts_cmpl_str")))
							.cutoff$or(S0_T22.mfg_sts_typ.eq(bind("tmp_oper_sts_stt_str")))
							.cutoff$or(S0_T22.mfg_sts_typ.eq(bind("tmp_oper_sts_ord_str")))
							.cutoff$or(S0_T22.mfg_sts_typ.eq(bind("tmp_oper_sts_sav_str")))
						)
						.and(
							value(true).eq(value(false))
							.cutoff$or(S0_T2.mfg_sts_typ.eq(bind("tmp_inpt_sts_cmpl_str")))
							.cutoff$or(S0_T2.mfg_sts_typ.eq(bind("tmp_inpt_sts_stt_str")))
							.cutoff$or(S0_T2.mfg_sts_typ.eq(bind("tmp_inpt_sts_ord_str")))
							.cutoff$or(S0_T2.mfg_sts_typ.eq(bind("tmp_inpt_sts_sav_str")))
						)
						.cutoff$and(
							bind("tmp_not_alloc_srch_str").eq(value(true))
							.and(S0_T1.base_unit_rqmt_qty.add(S0_T1.base_unit_fxd_rqmt_qty).gt(value(0)))
							.and(
								S0_T1.alloc_ctl_typ.in(
									value(MAC_ALLOC_CTL_TYP.ALLOC_INST_NG.value()),
									value(MAC_ALLOC_CTL_TYP.ALLOC_INST_OK.value())
								)
							)
							.and(S0_T1.alloc_flg.eq(value(false)))
						)
						.cutoff$and(S0_T1.schd_tm.gte(bind("inpt_schd_hm_fr")))
						.cutoff$and(S0_T1.schd_tm.lte(bind("inpt_schd_hm_to")))
						.cutoff$and(
							MAPA_CALC$F_CALC_PER(
								S0_T2.base_unit_inpt_qty,
								S0_TA1.pr("pr_rate_numerator")
							).gte(bind("pr_rate_fr"))
						)
						.cutoff$and(
							MAPA_CALC$F_CALC_PER(
								S0_T2.base_unit_inpt_qty,
								S0_TA1.pr("pr_rate_numerator")
							).lte(bind("pr_rate_to"))
						)
						.cutoff$and(S0_T1.bkf_typ.like(bind("bkf_typ")))
						.cutoff$and(S0_T1.yield_calc_flg.eq(bind("tmp_yield_calc_str")))
						.cutoff$and(S0_T12.site_cd.like(bind("mfg_loc_site_cd")))
						.addDynamicPredicate()
						.cutoff$and(S0_T12.wg_cd.like(bind("mfg_loc_wg_cd")))
						.cutoff$and(S0_M25.loc_grp_cd.like(bind("mfg_loc_grp_cd")))
						.cutoff$and(S0_T12.mfg_loc_cd.like(bind("mfg_loc_cd")))
						.cutoff$and(S0_M25.loc_nm.like(bind("mfg_loc_nm")))
						.cutoff$and(S0_T12.mfg_str_ln_cd.like(bind("mfg_str_ln_cd")))
						.cutoff$and(S0_T1.inpt_loc_cd.like(bind("inpt_loc_cd")))
						.cutoff$and(S0_T1.inpt_str_ln_cd.like(bind("inpt_str_ln_cd")))
						.cutoff$and(S0_T12.sppl_cd.like(bind("sppl_cd")))
						.cutoff$and(S0_T23.oper_cd.like(bind("oper_cd")))
						.cutoff$and(S0_T23.oper_loc_cd.like(bind("oper_loc_cd")))
						.cutoff$and(S0_T23.oper_str_ln_cd.like(bind("oper_str_ln_cd")))
						.cutoff$and(S0_T12.mfg_mtd_typ.like(bind("mfg_mtd_typ")))
						.cutoff$and(S0_M1.itm_typ.like(bind("chd_itm_typ")))
						.cutoff$and(S0_M1.itm_typ_d_cd.like(bind("chd_itm_typ_d_cd")))
						.cutoff$and(S0_T1.inpt_ctl_typ.like(bind("inpt_ctl_typ")))
						.cutoff$and(S0_T1.itm_cd.like(bind("chd_itm_cd")))
						.cutoff$and(S0_T1.itm_sub1.like(bind("chd_itm_sub1")))
						.cutoff$and(S0_T1.itm_sub2.like(bind("chd_itm_sub2")))
						.cutoff$and(S0_T1.itm_sub3.like(bind("chd_itm_sub3")))
						.cutoff$and(
							nvl(
								S0_M2.itm_nm,
								S0_M1.itm_nm
							).like(bind("chd_itm_nm"))
						)
						.cutoff$and(S0_T1.lot_no.like(bind("chd_lot_no")))
						.cutoff$and(S0_T1.sublot_no.like(bind("chd_sublot_no")))
						.cutoff$and(S0_M21.itm_typ.like(bind("par_itm_typ")))
						.cutoff$and(S0_M21.itm_typ_d_cd.like(bind("par_itm_typ_d_cd")))
						.cutoff$and(S0_T13.mfg_inst_no.like(bind("mfg_inst_no")))
						.cutoff$and(S0_T12.itm_cd.like(bind("par_itm_cd")))
						.cutoff$and(S0_T12.itm_sub1.like(bind("par_itm_sub1")))
						.cutoff$and(S0_T12.itm_sub2.like(bind("par_itm_sub2")))
						.cutoff$and(S0_T12.itm_sub3.like(bind("par_itm_sub3")))
						.cutoff$and(
							nvl(
								S0_M22.itm_nm,
								S0_M21.itm_nm
							).like(bind("par_itm_nm"))
						)
						.cutoff$and(S0_T12.sno1.like(bind("par_sno1")))
						.cutoff$and(S0_T12.sno2.like(bind("par_sno2")))
						.cutoff$and(S0_T12.sno3.like(bind("par_sno3")))
						.cutoff$and(S0_T12.sno4.like(bind("par_sno4")))
						.cutoff$and(S0_T23.usr_cd.like(bind("oper_usr_cd")))
						.cutoff$and(S0_T12.itm_ord_no.like(bind("itm_ord_no")))
						.cutoff$and(S0_T13.po_d_no.like(bind("po_d_no")))
						.cutoff$and(S0_T23.oper_inst_no.like(bind("oper_inst_no")))
						.cutoff$and(S0_T1.inpt_schd_no.like(bind("inpt_schd_no")))
						.cutoff$and(S0_T1.inpt_rsn_cd.like(bind("inpt_rsn_cd")))
						.cutoff$and(S0_T1.inst_rpt_rmrks.like(bind("inpt_schd_inst_rpt_rmrks")))
						.cutoff$and(S0_T1.intr_rmrks.like(bind("inpt_schd_intr_rmrks")))
						.cutoff$and(S0_T1.sub_char1.like(bind("inpt_schd_sub_char1")))
						.cutoff$and(S0_T1.sub_char2.like(bind("inpt_schd_sub_char2")))
						.cutoff$and(S0_T1.sub_char3.like(bind("inpt_schd_sub_char3")))
						.addDynamicPredicate(DS0C_CHD_ITM_GRP)
						.addDynamicPredicate(DS0C_PAR_ITM_GRP)
					)
					.orderBy(
						S0_T1.mfg_inst_no.asc(),
						S0_T1.disp_seq.asc(),
						S0_T1.inpt_schd_no.asc()
					)
			)
			.setDynamicSQLInfo(
				when(boundOr("wrk_nm", "wrk_no"))
					.view(v -> v.leftOuterJoin(S0_T15).on(bracket(S0_T12.sno1.eq(S0_T15.sno1))))
					.predicate(p -> p.cutoff$and(S0_T15.wrk_no.like(bind("wrk_no")))),
				when(boundOr("wrk_nm"))
					.view(v -> v.leftOuterJoin(S0_T16).on(bracket(S0_T16.wrk_no.eq(S0_T15.wrk_no))))
					.predicate(p -> p.cutoff$and(S0_T16.wrk_nm.like(bind("wrk_nm")))),
				when(boundOr("inpt_loc_nm"))
					.view(v -> v.leftOuterJoin(S0_M5).on(bracket(S0_T1.inpt_loc_cd.eq(S0_M5.loc_cd))))
					.predicate(p -> p.cutoff$and(S0_M5.loc_nm.like(bind("inpt_loc_nm")))),
				when(boundOr("inpt_str_ln_nm"))
					.view(v -> v.leftOuterJoin(S0_M10).on(bracket(S0_T1.inpt_loc_cd.eq(S0_M10.loc_cd).and(S0_T1.inpt_str_ln_cd.eq(S0_M10.str_ln_cd)))))
					.predicate(p -> p.cutoff$and(S0_M10.str_ln_nm.like(bind("inpt_str_ln_nm")))),
				when(boundOr("chd_itm_typ_d_nm"))
					.view(v -> v.leftOuterJoin(S0_M15).on(bracket(S0_M1.itm_typ.eq(S0_M15.itm_typ).and(S0_M1.itm_typ_d_cd.eq(S0_M15.itm_typ_d_cd)))))
					.predicate(p -> p.cutoff$and(S0_M15.itm_typ_d_nm.like(bind("chd_itm_typ_d_nm")))),
				when(boundOr("sppl_nm"))
					.view(v -> v.leftOuterJoin(S0_M24).on(bracket(S0_T12.sppl_cd.eq(S0_M24.bp_cd))))
					.predicate(p -> p.cutoff$and(S0_M24.bp_nm.like(bind("sppl_nm")))),
				when(boundOr("mfg_str_ln_nm"))
					.view(v -> v.leftOuterJoin(S0_M26).on(bracket(S0_T12.mfg_loc_cd.eq(S0_M26.loc_cd).and(S0_T12.mfg_str_ln_cd.eq(S0_M26.str_ln_cd)))))
					.predicate(p -> p.cutoff$and(S0_M26.str_ln_nm.like(bind("mfg_str_ln_nm")))),
				when(boundOr("mfg_loc_site_nm"))
					.view(v -> v.leftOuterJoin(S0_M29).on(bracket(S0_T12.site_cd.eq(S0_M29.site_cd))))
					.predicate(p -> p.cutoff$and(S0_M29.site_nm.like(bind("mfg_loc_site_nm")))),
				when(boundOr("mfg_loc_wg_nm"))
					.view(v -> v.leftOuterJoin(S0_M30).on(bracket(S0_T12.wg_cd.eq(S0_M30.wg_cd))))
					.predicate(p -> p.cutoff$and(S0_M30.wg_nm.like(bind("mfg_loc_wg_nm")))),
				when(boundOr("oper_nm"))
					.view(v -> v.leftOuterJoin(S0_M38).on(bracket(S0_T23.oper_cd.eq(S0_M38.oper_cd))))
					.predicate(p -> p.cutoff$and(S0_M38.oper_nm.like(bind("oper_nm")))),
				when(boundOr("oper_loc_nm"))
					.view(v -> v.leftOuterJoin(S0_M40).on(bracket(S0_T23.oper_loc_cd.eq(S0_M40.loc_cd))))
					.predicate(p -> p.cutoff$and(S0_M40.loc_nm.like(bind("oper_loc_nm")))),
				when(boundOr("oper_str_ln_nm"))
					.view(v -> v.leftOuterJoin(S0_M41).on(bracket(S0_T23.oper_loc_cd.eq(S0_M41.loc_cd).and(S0_T23.oper_str_ln_cd.eq(S0_M41.str_ln_cd)))))
					.predicate(p -> p.cutoff$and(S0_M41.str_ln_nm.like(bind("oper_str_ln_nm")))),
				when(boundOr("oper_usr_nm"))
					.view(v -> v.leftOuterJoin(S0_M42).on(bracket(S0_T23.usr_cd.eq(S0_M42.usr_cd))))
					.predicate(p -> p.cutoff$and(S0_M42.usr_nm.like(bind("oper_usr_nm")))),
				when(boundOr("par_itm_typ_d_nm"))
					.view(v -> v.leftOuterJoin(S0_M44).on(bracket(S0_M21.itm_typ.eq(S0_M44.itm_typ).and(S0_M21.itm_typ_d_cd.eq(S0_M44.itm_typ_d_cd)))))
					.predicate(p -> p.cutoff$and(S0_M44.itm_typ_d_nm.like(bind("par_itm_typ_d_nm")))),
				when(boundOr("mfg_loc_grp_nm"))
					.view(v -> v.leftOuterJoin(S0_M45).on(bracket(S0_M25.loc_grp_cd.eq(S0_M45.loc_grp_cd))))
					.predicate(p -> p.cutoff$and(S0_M45.loc_grp_nm.like(bind("mfg_loc_grp_nm")))),
				when(boundOr("inpt_rsn_nm"))
					.view(v -> v.leftOuterJoin(S0_M91).on(bracket(S0_T1.inpt_rsn_cd.eq(S0_M91.biz_rsn_cd))))
					.predicate(p -> p.cutoff$and(S0_M91.biz_rsn_nm.like(bind("inpt_rsn_nm")))),
				when(boundOr("chd_itm_grp_flg1"))
					.select(DS0C_CHD_ITM_GRP, S0_M1.itm_grp_cd1.as("chd_itm_grp_cd1"), S0_CHD_ITM_GRP1.itm_grp_nm.as("chd_itm_grp_nm1"))
					.view(DS0C_CHD_ITM_GRP, v -> v.leftOuterJoin(S0_CHD_ITM_GRP1).on(S0_M1.itm_grp_cd1.eq(S0_CHD_ITM_GRP1.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP1.value()).eq(S0_CHD_ITM_GRP1.itm_grp_typ))))
					.predicate(DS0C_CHD_ITM_GRP, p -> p.cutoff$and(S0_M1.itm_grp_cd1.like(bind("chd_itm_grp_cd1"))).cutoff$and(S0_CHD_ITM_GRP1.itm_grp_nm.like(bind("chd_itm_grp_nm1")))),
				when(boundOr("chd_itm_grp_flg2"))
					.select(DS0C_CHD_ITM_GRP, S0_M1.itm_grp_cd2.as("chd_itm_grp_cd2"), S0_CHD_ITM_GRP2.itm_grp_nm.as("chd_itm_grp_nm2"))
					.view(DS0C_CHD_ITM_GRP, v -> v.leftOuterJoin(S0_CHD_ITM_GRP2).on(S0_M1.itm_grp_cd2.eq(S0_CHD_ITM_GRP2.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP2.value()).eq(S0_CHD_ITM_GRP2.itm_grp_typ))))
					.predicate(DS0C_CHD_ITM_GRP, p -> p.cutoff$and(S0_M1.itm_grp_cd2.like(bind("chd_itm_grp_cd2"))).cutoff$and(S0_CHD_ITM_GRP2.itm_grp_nm.like(bind("chd_itm_grp_nm2")))),
				when(boundOr("chd_itm_grp_flg3"))
					.select(DS0C_CHD_ITM_GRP, S0_M1.itm_grp_cd3.as("chd_itm_grp_cd3"), S0_CHD_ITM_GRP3.itm_grp_nm.as("chd_itm_grp_nm3"))
					.view(DS0C_CHD_ITM_GRP, v -> v.leftOuterJoin(S0_CHD_ITM_GRP3).on(S0_M1.itm_grp_cd3.eq(S0_CHD_ITM_GRP3.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP3.value()).eq(S0_CHD_ITM_GRP3.itm_grp_typ))))
					.predicate(DS0C_CHD_ITM_GRP, p -> p.cutoff$and(S0_M1.itm_grp_cd3.like(bind("chd_itm_grp_cd3"))).cutoff$and(S0_CHD_ITM_GRP3.itm_grp_nm.like(bind("chd_itm_grp_nm3")))),
				when(boundOr("chd_itm_grp_flg4"))
					.select(DS0C_CHD_ITM_GRP, S0_M1.itm_grp_cd4.as("chd_itm_grp_cd4"), S0_CHD_ITM_GRP4.itm_grp_nm.as("chd_itm_grp_nm4"))
					.view(DS0C_CHD_ITM_GRP, v -> v.leftOuterJoin(S0_CHD_ITM_GRP4).on(S0_M1.itm_grp_cd4.eq(S0_CHD_ITM_GRP4.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP4.value()).eq(S0_CHD_ITM_GRP4.itm_grp_typ))))
					.predicate(DS0C_CHD_ITM_GRP, p -> p.cutoff$and(S0_M1.itm_grp_cd4.like(bind("chd_itm_grp_cd4"))).cutoff$and(S0_CHD_ITM_GRP4.itm_grp_nm.like(bind("chd_itm_grp_nm4")))),
				when(boundOr("chd_itm_grp_flg5"))
					.select(DS0C_CHD_ITM_GRP, S0_M1.itm_grp_cd5.as("chd_itm_grp_cd5"), S0_CHD_ITM_GRP5.itm_grp_nm.as("chd_itm_grp_nm5"))
					.view(DS0C_CHD_ITM_GRP, v -> v.leftOuterJoin(S0_CHD_ITM_GRP5).on(S0_M1.itm_grp_cd5.eq(S0_CHD_ITM_GRP5.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP5.value()).eq(S0_CHD_ITM_GRP5.itm_grp_typ))))
					.predicate(DS0C_CHD_ITM_GRP, p -> p.cutoff$and(S0_M1.itm_grp_cd5.like(bind("chd_itm_grp_cd5"))).cutoff$and(S0_CHD_ITM_GRP5.itm_grp_nm.like(bind("chd_itm_grp_nm5")))),
				when(boundOr("chd_itm_grp_flg6"))
					.select(DS0C_CHD_ITM_GRP, S0_M1.itm_grp_cd6.as("chd_itm_grp_cd6"), S0_CHD_ITM_GRP6.itm_grp_nm.as("chd_itm_grp_nm6"))
					.view(DS0C_CHD_ITM_GRP, v -> v.leftOuterJoin(S0_CHD_ITM_GRP6).on(S0_M1.itm_grp_cd6.eq(S0_CHD_ITM_GRP6.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP6.value()).eq(S0_CHD_ITM_GRP6.itm_grp_typ))))
					.predicate(DS0C_CHD_ITM_GRP, p -> p.cutoff$and(S0_M1.itm_grp_cd6.like(bind("chd_itm_grp_cd6"))).cutoff$and(S0_CHD_ITM_GRP6.itm_grp_nm.like(bind("chd_itm_grp_nm6")))),
				when(boundOr("chd_itm_grp_flg7"))
					.select(DS0C_CHD_ITM_GRP, S0_M1.itm_grp_cd7.as("chd_itm_grp_cd7"), S0_CHD_ITM_GRP7.itm_grp_nm.as("chd_itm_grp_nm7"))
					.view(DS0C_CHD_ITM_GRP, v -> v.leftOuterJoin(S0_CHD_ITM_GRP7).on(S0_M1.itm_grp_cd7.eq(S0_CHD_ITM_GRP7.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP7.value()).eq(S0_CHD_ITM_GRP7.itm_grp_typ))))
					.predicate(DS0C_CHD_ITM_GRP, p -> p.cutoff$and(S0_M1.itm_grp_cd7.like(bind("chd_itm_grp_cd7"))).cutoff$and(S0_CHD_ITM_GRP7.itm_grp_nm.like(bind("chd_itm_grp_nm7")))),
				when(boundOr("chd_itm_grp_flg8"))
					.select(DS0C_CHD_ITM_GRP, S0_M1.itm_grp_cd8.as("chd_itm_grp_cd8"), S0_CHD_ITM_GRP8.itm_grp_nm.as("chd_itm_grp_nm8"))
					.view(DS0C_CHD_ITM_GRP, v -> v.leftOuterJoin(S0_CHD_ITM_GRP8).on(S0_M1.itm_grp_cd8.eq(S0_CHD_ITM_GRP8.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP8.value()).eq(S0_CHD_ITM_GRP8.itm_grp_typ))))
					.predicate(DS0C_CHD_ITM_GRP, p -> p.cutoff$and(S0_M1.itm_grp_cd8.like(bind("chd_itm_grp_cd8"))).cutoff$and(S0_CHD_ITM_GRP8.itm_grp_nm.like(bind("chd_itm_grp_nm8")))),
				when(boundOr("chd_itm_grp_flg9"))
					.select(DS0C_CHD_ITM_GRP, S0_M1.itm_grp_cd9.as("chd_itm_grp_cd9"), S0_CHD_ITM_GRP9.itm_grp_nm.as("chd_itm_grp_nm9"))
					.view(DS0C_CHD_ITM_GRP, v -> v.leftOuterJoin(S0_CHD_ITM_GRP9).on(S0_M1.itm_grp_cd9.eq(S0_CHD_ITM_GRP9.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP9.value()).eq(S0_CHD_ITM_GRP9.itm_grp_typ))))
					.predicate(DS0C_CHD_ITM_GRP, p -> p.cutoff$and(S0_M1.itm_grp_cd9.like(bind("chd_itm_grp_cd9"))).cutoff$and(S0_CHD_ITM_GRP9.itm_grp_nm.like(bind("chd_itm_grp_nm9")))),
				when(boundOr("chd_itm_grp_flg10"))
					.select(DS0C_CHD_ITM_GRP, S0_M1.itm_grp_cd10.as("chd_itm_grp_cd10"), S0_CHD_ITM_GRP10.itm_grp_nm.as("chd_itm_grp_nm10"))
					.view(DS0C_CHD_ITM_GRP, v -> v.leftOuterJoin(S0_CHD_ITM_GRP10).on(S0_M1.itm_grp_cd10.eq(S0_CHD_ITM_GRP10.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP10.value()).eq(S0_CHD_ITM_GRP10.itm_grp_typ))))
					.predicate(DS0C_CHD_ITM_GRP, p -> p.cutoff$and(S0_M1.itm_grp_cd10.like(bind("chd_itm_grp_cd10"))).cutoff$and(S0_CHD_ITM_GRP10.itm_grp_nm.like(bind("chd_itm_grp_nm10")))),
				when(boundOr("par_itm_grp_flg1"))
					.select(DS0C_PAR_ITM_GRP, S0_M21.itm_grp_cd1.as("par_itm_grp_cd1"), S0_PAR_ITM_GRP1.itm_grp_nm.as("par_itm_grp_nm1"))
					.view(DS0C_PAR_ITM_GRP, v -> v.leftOuterJoin(S0_PAR_ITM_GRP1).on(S0_M21.itm_grp_cd1.eq(S0_PAR_ITM_GRP1.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP1.value()).eq(S0_PAR_ITM_GRP1.itm_grp_typ))))
					.predicate(DS0C_PAR_ITM_GRP, p -> p.cutoff$and(S0_M21.itm_grp_cd1.like(bind("par_itm_grp_cd1"))).cutoff$and(S0_PAR_ITM_GRP1.itm_grp_nm.like(bind("par_itm_grp_nm1")))),
				when(boundOr("par_itm_grp_flg2"))
					.select(DS0C_PAR_ITM_GRP, S0_M21.itm_grp_cd2.as("par_itm_grp_cd2"), S0_PAR_ITM_GRP2.itm_grp_nm.as("par_itm_grp_nm2"))
					.view(DS0C_PAR_ITM_GRP, v -> v.leftOuterJoin(S0_PAR_ITM_GRP2).on(S0_M21.itm_grp_cd2.eq(S0_PAR_ITM_GRP2.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP2.value()).eq(S0_PAR_ITM_GRP2.itm_grp_typ))))
					.predicate(DS0C_PAR_ITM_GRP, p -> p.cutoff$and(S0_M21.itm_grp_cd2.like(bind("par_itm_grp_cd2"))).cutoff$and(S0_PAR_ITM_GRP2.itm_grp_nm.like(bind("par_itm_grp_nm2")))),
				when(boundOr("par_itm_grp_flg3"))
					.select(DS0C_PAR_ITM_GRP, S0_M21.itm_grp_cd3.as("par_itm_grp_cd3"), S0_PAR_ITM_GRP3.itm_grp_nm.as("par_itm_grp_nm3"))
					.view(DS0C_PAR_ITM_GRP, v -> v.leftOuterJoin(S0_PAR_ITM_GRP3).on(S0_M21.itm_grp_cd3.eq(S0_PAR_ITM_GRP3.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP3.value()).eq(S0_PAR_ITM_GRP3.itm_grp_typ))))
					.predicate(DS0C_PAR_ITM_GRP, p -> p.cutoff$and(S0_M21.itm_grp_cd3.like(bind("par_itm_grp_cd3"))).cutoff$and(S0_PAR_ITM_GRP3.itm_grp_nm.like(bind("par_itm_grp_nm3")))),
				when(boundOr("par_itm_grp_flg4"))
					.select(DS0C_PAR_ITM_GRP, S0_M21.itm_grp_cd4.as("par_itm_grp_cd4"), S0_PAR_ITM_GRP4.itm_grp_nm.as("par_itm_grp_nm4"))
					.view(DS0C_PAR_ITM_GRP, v -> v.leftOuterJoin(S0_PAR_ITM_GRP4).on(S0_M21.itm_grp_cd4.eq(S0_PAR_ITM_GRP4.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP4.value()).eq(S0_PAR_ITM_GRP4.itm_grp_typ))))
					.predicate(DS0C_PAR_ITM_GRP, p -> p.cutoff$and(S0_M21.itm_grp_cd4.like(bind("par_itm_grp_cd4"))).cutoff$and(S0_PAR_ITM_GRP4.itm_grp_nm.like(bind("par_itm_grp_nm4")))),
				when(boundOr("par_itm_grp_flg5"))
					.select(DS0C_PAR_ITM_GRP, S0_M21.itm_grp_cd5.as("par_itm_grp_cd5"), S0_PAR_ITM_GRP5.itm_grp_nm.as("par_itm_grp_nm5"))
					.view(DS0C_PAR_ITM_GRP, v -> v.leftOuterJoin(S0_PAR_ITM_GRP5).on(S0_M21.itm_grp_cd5.eq(S0_PAR_ITM_GRP5.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP5.value()).eq(S0_PAR_ITM_GRP5.itm_grp_typ))))
					.predicate(DS0C_PAR_ITM_GRP, p -> p.cutoff$and(S0_M21.itm_grp_cd5.like(bind("par_itm_grp_cd5"))).cutoff$and(S0_PAR_ITM_GRP5.itm_grp_nm.like(bind("par_itm_grp_nm5")))),
				when(boundOr("par_itm_grp_flg6"))
					.select(DS0C_PAR_ITM_GRP, S0_M21.itm_grp_cd6.as("par_itm_grp_cd6"), S0_PAR_ITM_GRP6.itm_grp_nm.as("par_itm_grp_nm6"))
					.view(DS0C_PAR_ITM_GRP, v -> v.leftOuterJoin(S0_PAR_ITM_GRP6).on(S0_M21.itm_grp_cd6.eq(S0_PAR_ITM_GRP6.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP6.value()).eq(S0_PAR_ITM_GRP6.itm_grp_typ))))
					.predicate(DS0C_PAR_ITM_GRP, p -> p.cutoff$and(S0_M21.itm_grp_cd6.like(bind("par_itm_grp_cd6"))).cutoff$and(S0_PAR_ITM_GRP6.itm_grp_nm.like(bind("par_itm_grp_nm6")))),
				when(boundOr("par_itm_grp_flg7"))
					.select(DS0C_PAR_ITM_GRP, S0_M21.itm_grp_cd7.as("par_itm_grp_cd7"), S0_PAR_ITM_GRP7.itm_grp_nm.as("par_itm_grp_nm7"))
					.view(DS0C_PAR_ITM_GRP, v -> v.leftOuterJoin(S0_PAR_ITM_GRP7).on(S0_M21.itm_grp_cd7.eq(S0_PAR_ITM_GRP7.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP7.value()).eq(S0_PAR_ITM_GRP7.itm_grp_typ))))
					.predicate(DS0C_PAR_ITM_GRP, p -> p.cutoff$and(S0_M21.itm_grp_cd7.like(bind("par_itm_grp_cd7"))).cutoff$and(S0_PAR_ITM_GRP7.itm_grp_nm.like(bind("par_itm_grp_nm7")))),
				when(boundOr("par_itm_grp_flg8"))
					.select(DS0C_PAR_ITM_GRP, S0_M21.itm_grp_cd8.as("par_itm_grp_cd8"), S0_PAR_ITM_GRP8.itm_grp_nm.as("par_itm_grp_nm8"))
					.view(DS0C_PAR_ITM_GRP, v -> v.leftOuterJoin(S0_PAR_ITM_GRP8).on(S0_M21.itm_grp_cd8.eq(S0_PAR_ITM_GRP8.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP8.value()).eq(S0_PAR_ITM_GRP8.itm_grp_typ))))
					.predicate(DS0C_PAR_ITM_GRP, p -> p.cutoff$and(S0_M21.itm_grp_cd8.like(bind("par_itm_grp_cd8"))).cutoff$and(S0_PAR_ITM_GRP8.itm_grp_nm.like(bind("par_itm_grp_nm8")))),
				when(boundOr("par_itm_grp_flg9"))
					.select(DS0C_PAR_ITM_GRP, S0_M21.itm_grp_cd9.as("par_itm_grp_cd9"), S0_PAR_ITM_GRP9.itm_grp_nm.as("par_itm_grp_nm9"))
					.view(DS0C_PAR_ITM_GRP, v -> v.leftOuterJoin(S0_PAR_ITM_GRP9).on(S0_M21.itm_grp_cd9.eq(S0_PAR_ITM_GRP9.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP9.value()).eq(S0_PAR_ITM_GRP9.itm_grp_typ))))
					.predicate(DS0C_PAR_ITM_GRP, p -> p.cutoff$and(S0_M21.itm_grp_cd9.like(bind("par_itm_grp_cd9"))).cutoff$and(S0_PAR_ITM_GRP9.itm_grp_nm.like(bind("par_itm_grp_nm9")))),
				when(boundOr("par_itm_grp_flg10"))
					.select(DS0C_PAR_ITM_GRP, S0_M21.itm_grp_cd10.as("par_itm_grp_cd10"), S0_PAR_ITM_GRP10.itm_grp_nm.as("par_itm_grp_nm10"))
					.view(DS0C_PAR_ITM_GRP, v -> v.leftOuterJoin(S0_PAR_ITM_GRP10).on(S0_M21.itm_grp_cd10.eq(S0_PAR_ITM_GRP10.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP10.value()).eq(S0_PAR_ITM_GRP10.itm_grp_typ))))
					.predicate(DS0C_PAR_ITM_GRP, p -> p.cutoff$and(S0_M21.itm_grp_cd10.like(bind("par_itm_grp_cd10"))).cutoff$and(S0_PAR_ITM_GRP10.itm_grp_nm.like(bind("par_itm_grp_nm10"))))
			)
			.setJoinInfo(
				joinInfo(
					j -> j
						.add(MST_WRK_SNO_R.class, r -> toCondition(
							r.getStringNE("par_sno1")
						))
						.addSelect(m -> toArray(
							m.wrk_no
						))
						.addMap((r, m) -> {
							r.setStringNE("wrk_no", m.wrk_no());
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
						.add(MAM_LOC_R.class, r -> toCondition(
							r.getStringNE("inpt_loc_cd")
						))
						.addSelect(m -> toArray(
							m.loc_nm,
							m.wg_cd
						))
						.addMap((r, m) -> {
							r.setStringNE("inpt_loc_nm", m.loc_nm());
							r.setStringNE("join_wg_cd_", m.wg_cd());
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
						.add(MAM_ALT_GRP_R.class, r -> toCondition(
							r.getStringNE("alt_grp_cd"),
							r.getStringNE("join_wg_cd_")
						))
						.addSelect(m -> toArray(
							m.alt_grp_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("alt_grp_nm", m.alt_grp_nm());
					}),
					j -> j
						.add(MAM_STR_LN_R.class, r -> toCondition(
							r.getStringNE("inpt_loc_cd"),
							r.getStringNE("inpt_str_ln_cd")
						))
						.addSelect(m -> toArray(
							m.str_ln_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("inpt_str_ln_nm", m.str_ln_nm());
					}),
					j -> j
						.add(MAM_ITM_TYP_D_R.class, r -> toCondition(
							r.getStringNE("chd_itm_typ"),
							r.getStringNE("chd_itm_typ_d_cd")
						))
						.addSelect(m -> toArray(
							m.itm_typ_d_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("chd_itm_typ_d_nm", m.itm_typ_d_nm());
					}),
					j -> j
						.add(MAM_UNIT_R.class, r -> toCondition(
							r.getStringNE("par_base_unit_cd")
						))
						.addSelect(m -> toArray(
							m.dec_place,
							m.unit_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("par_base_unit_nm", m.unit_nm());
							r.setNumberNE("base_unit_dec_place", m.dec_place());
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
						.add(MAM_STR_LN_R.class, r -> toCondition(
							r.getStringNE("mfg_loc_cd"),
							r.getStringNE("mfg_str_ln_cd")
						))
						.addSelect(m -> toArray(
							m.str_ln_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("mfg_str_ln_nm", m.str_ln_nm());
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
							r.getStringNE("wg_cd")
						))
						.addSelect(m -> toArray(
							m.wg_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("wg_nm", m.wg_nm());
					}),
					j -> j
						.add(MAM_OPER_R.class, r -> toCondition(
							r.getStringNE("oper_cd")
						))
						.addSelect(m -> toArray(
							m.oper_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("oper_nm", m.oper_nm());
					}),
					j -> j
						.add(MAM_UNIT_R.class, r -> toCondition(
							r.getStringNE("oper_unit_cd")
						))
						.addSelect(m -> toArray(
							m.unit_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("oper_unit_nm", m.unit_nm());
					}),
					j -> j
						.add(MAM_LOC_R.class, r -> toCondition(
							r.getStringNE("oper_loc_cd")
						))
						.addSelect(m -> toArray(
							m.loc_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("oper_loc_nm", m.loc_nm());
					}),
					j -> j
						.add(MAM_STR_LN_R.class, r -> toCondition(
							r.getStringNE("oper_loc_cd"),
							r.getStringNE("oper_str_ln_cd")
						))
						.addSelect(m -> toArray(
							m.str_ln_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("oper_str_ln_nm", m.str_ln_nm());
					}),
					j -> j
						.add(MAM_USR_R.class, r -> toCondition(
							r.getStringNE("oper_usr_cd")
						))
						.addSelect(m -> toArray(
							m.usr_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("oper_usr_nm", m.usr_nm());
					}),
					j -> j
						.add(MAM_ITM_TYP_D_R.class, r -> toCondition(
							r.getStringNE("par_itm_typ"),
							r.getStringNE("par_itm_typ_d_cd")
						))
						.addSelect(m -> toArray(
							m.itm_typ_d_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("par_itm_typ_d_nm", m.itm_typ_d_nm());
					}),
					j -> j
						.add(MAM_LOC_GRP_R.class, r -> toCondition(
							r.getStringNE("mfg_loc_grp_cd")
						))
						.addSelect(m -> toArray(
							m.loc_grp_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("mfg_loc_grp_nm", m.loc_grp_nm());
					}),
					j -> j
						.add(MAM_BIZ_RSN_R.class, r -> toCondition(
							r.getStringNE("inpt_rsn_cd")
						))
						.addSelect(m -> toArray(
							m.biz_rsn_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("inpt_rsn_nm", m.biz_rsn_nm());
					})
				)
			);
	}
	
	/**
	 * -- MSBCL1090_MST_LOSS_ACT_Query_S01
	 */
	static MCQueryPlan MSBCL1090_MST_LOSS_ACT_S01() {
		MST_INPT_ACT_R S0_T1 = MST_INPT_ACT_R.create("T1");
		MST_INPT_ACT_REM_R S0_T2 = MST_INPT_ACT_REM_R.create("T2");
		MST_INPT_SCHD_R S0_T3 = MST_INPT_SCHD_R.create("T3");
		MST_MFG_ACT_R S0_T11 = MST_MFG_ACT_R.create("T11");
		MST_ITM_MFG_INST_R S0_T12 = MST_ITM_MFG_INST_R.create("T12");
		MST_MFG_INST_R S0_T13 = MST_MFG_INST_R.create("T13");
		MST_MFG_ACT_REM_R S0_T14 = MST_MFG_ACT_REM_R.create("T14");
		MST_WRK_SNO_R S0_T15 = MST_WRK_SNO_R.create("T15");
		MST_WRK_R S0_T16 = MST_WRK_R.create("T16");
		MST_OPER_ACT_R S0_T21 = MST_OPER_ACT_R.create("T21");
		MST_OPER_ACT_REM_R S0_T22 = MST_OPER_ACT_REM_R.create("T22");
		MST_OPER_INST_R S0_T23 = MST_OPER_INST_R.create("T23");
		MAM_ITM_R S0_M1 = MAM_ITM_R.create("M1");
		MAM_SUNDRY_ITM_R S0_M2 = MAM_SUNDRY_ITM_R.create("M2");
		MAM_LOC_R S0_M5 = MAM_LOC_R.create("M5");
		MAM_STR_LN_R S0_M10 = MAM_STR_LN_R.create("M10");
		MAM_DPT_R S0_M12 = MAM_DPT_R.create("M12");
		MAM_ITM_TYP_D_R S0_M15 = MAM_ITM_TYP_D_R.create("M15");
		MAM_ITM_R S0_M21 = MAM_ITM_R.create("M21");
		MAM_SUNDRY_ITM_R S0_M22 = MAM_SUNDRY_ITM_R.create("M22");
		MAM_BP_R S0_M24 = MAM_BP_R.create("M24");
		MAVM_RD_LOC_R S0_M25 = MAVM_RD_LOC_R.create("M25");
		MAM_STR_LN_R S0_M26 = MAM_STR_LN_R.create("M26");
		MAM_SITE_R S0_M29 = MAM_SITE_R.create("M29");
		MAM_WG_R S0_M30 = MAM_WG_R.create("M30");
		MAM_OPER_R S0_M38 = MAM_OPER_R.create("M38");
		MAM_LOC_R S0_M40 = MAM_LOC_R.create("M40");
		MAM_STR_LN_R S0_M41 = MAM_STR_LN_R.create("M41");
		MAM_USR_R S0_M42 = MAM_USR_R.create("M42");
		MAM_ITM_TYP_D_R S0_M44 = MAM_ITM_TYP_D_R.create("M44");
		MAM_LOC_GRP_R S0_M45 = MAM_LOC_GRP_R.create("M45");
		MST_LOSS_ACT_R S0_T90 = MST_LOSS_ACT_R.create("T90");
		MAM_BIZ_RSN_R S0_M90 = MAM_BIZ_RSN_R.create("M90");
		MAM_BIZ_RSN_R S0_M91 = MAM_BIZ_RSN_R.create("M91");
		MAM_ITM_GRP_R S0_CHD_ITM_GRP1 = MAM_ITM_GRP_R.create("CHD_ITM_GRP1");
		MAM_ITM_GRP_R S0_CHD_ITM_GRP2 = MAM_ITM_GRP_R.create("CHD_ITM_GRP2");
		MAM_ITM_GRP_R S0_CHD_ITM_GRP3 = MAM_ITM_GRP_R.create("CHD_ITM_GRP3");
		MAM_ITM_GRP_R S0_CHD_ITM_GRP4 = MAM_ITM_GRP_R.create("CHD_ITM_GRP4");
		MAM_ITM_GRP_R S0_CHD_ITM_GRP5 = MAM_ITM_GRP_R.create("CHD_ITM_GRP5");
		MAM_ITM_GRP_R S0_CHD_ITM_GRP6 = MAM_ITM_GRP_R.create("CHD_ITM_GRP6");
		MAM_ITM_GRP_R S0_CHD_ITM_GRP7 = MAM_ITM_GRP_R.create("CHD_ITM_GRP7");
		MAM_ITM_GRP_R S0_CHD_ITM_GRP8 = MAM_ITM_GRP_R.create("CHD_ITM_GRP8");
		MAM_ITM_GRP_R S0_CHD_ITM_GRP9 = MAM_ITM_GRP_R.create("CHD_ITM_GRP9");
		MAM_ITM_GRP_R S0_CHD_ITM_GRP10 = MAM_ITM_GRP_R.create("CHD_ITM_GRP10");
		MAM_ITM_GRP_R S0_PAR_ITM_GRP1 = MAM_ITM_GRP_R.create("PAR_ITM_GRP1");
		MAM_ITM_GRP_R S0_PAR_ITM_GRP2 = MAM_ITM_GRP_R.create("PAR_ITM_GRP2");
		MAM_ITM_GRP_R S0_PAR_ITM_GRP3 = MAM_ITM_GRP_R.create("PAR_ITM_GRP3");
		MAM_ITM_GRP_R S0_PAR_ITM_GRP4 = MAM_ITM_GRP_R.create("PAR_ITM_GRP4");
		MAM_ITM_GRP_R S0_PAR_ITM_GRP5 = MAM_ITM_GRP_R.create("PAR_ITM_GRP5");
		MAM_ITM_GRP_R S0_PAR_ITM_GRP6 = MAM_ITM_GRP_R.create("PAR_ITM_GRP6");
		MAM_ITM_GRP_R S0_PAR_ITM_GRP7 = MAM_ITM_GRP_R.create("PAR_ITM_GRP7");
		MAM_ITM_GRP_R S0_PAR_ITM_GRP8 = MAM_ITM_GRP_R.create("PAR_ITM_GRP8");
		MAM_ITM_GRP_R S0_PAR_ITM_GRP9 = MAM_ITM_GRP_R.create("PAR_ITM_GRP9");
		MAM_ITM_GRP_R S0_PAR_ITM_GRP10 = MAM_ITM_GRP_R.create("PAR_ITM_GRP10");
		
		MCDynamicSQLID DS0C_CHD_ITM_GRP = createDynamicSQLID("DS0C_CHD_ITM_GRP");
		MCDynamicSQLID DS0C_PAR_ITM_GRP = createDynamicSQLID("DS0C_PAR_ITM_GRP");
		
		return createQueryPlan()
			.setQuery(
				sql("MSBCL1090_MST_LOSS_ACT_Query_S01")
					.mainQuery()
					.select(
						S0_T2.mfg_sts_typ.as("inpt_mfg_sts_typ"),
						S0_T1.itm_cd.as("chd_itm_cd"),
						S0_T1.itm_sub1.as("chd_itm_sub1"),
						S0_T1.itm_sub2.as("chd_itm_sub2"),
						S0_T1.itm_sub3.as("chd_itm_sub3"),
						nvl(
							S0_M2.itm_nm,
							S0_M1.itm_nm
						).as("chd_itm_nm"),
						S0_M1.itm_typ.as("chd_itm_typ"),
						S0_M1.itm_typ_d_cd.as("chd_itm_typ_d_cd"),
						S0_T1.ver_no,
						S0_T1.base_unit_inpt_qty,
						S0_T1.base_unit_loss_qty,
						S0_T1.base_unit_fxd_loss_qty,
						bracket(
							cases()
								.when(S0_T2.base_unit_inpt_abort_qty.gt(value(0)))
									.then(value(true))
								.otherwise(value(false))
						).as("abort_flg"),
						S0_T2.base_unit_inpt_qty.as("base_unit_schd_inpt_qty"),
						S0_T2.base_unit_rqmt_qty.as("base_unit_schd_rqmt_qty"),
						S0_T2.base_unit_fxd_rqmt_qty.as("base_unit_schd_fxd_rqmt_qty"),
						S0_T2.base_unit_inpt_rem_qty.add(S0_T2.base_unit_fxd_rqmt_rem_qty).as("base_unit_inpt_rem_qty"),
						S0_T1.base_unit_cd,
						S0_M1.dec_place.as("base_unit_dec_place"),
						S0_M1.cont_fctr_flg,
						S0_M1.cont_fctr_rnd_typ,
						S0_M1.cont_fctr_dec_place,
						S0_T1.act_cont_fctr,
						S0_T1.cont_fctr_unit_cd,
						S0_T3.std_cont_fctr,
						S0_T1.cont_qty.as("cont_inpt_qty"),
						S0_T1.cont_loss_qty,
						S0_T1.cont_fxd_loss_qty,
						S0_T2.cont_inpt_qty.as("cont_schd_inpt_qty"),
						S0_T2.cont_rqmt_qty.as("cont_schd_rqmt_qty"),
						S0_T2.cont_fxd_rqmt_qty.as("cont_schd_fxd_rqmt_qty"),
						nullValue().as("cont_acxfr_act_qty"),
						S0_T1.lot_no.as("act_lot_no"),
						S0_T1.sublot_no.as("act_sublot_no"),
						S0_T3.lot_no.as("inst_lot_no"),
						S0_T3.sublot_no.as("inst_sublot_no"),
						S0_T1.acxfr_qty.as("acxfr_act_qty"),
						S0_T1.acxfr_rsn_cd.as("acxfr_act_rsn_cd"),
						S0_T1.acxfr_bd_dpt_cd.as("acxfr_act_bd_dpt_cd"),
						S0_M12.dpt_nm.as("acxfr_act_bd_dpt_nm"),
						S0_T1.stk_id_typ,
						S0_T1.stk_bp_cd,
						S0_T1.stk_arrv_bp_cd,
						trunc(
							S0_T1.act_tm,
							MCDateFmt.DD
						).as("act_dt"),
						S0_T1.act_tm.as("act_hm"),
						S0_T1.ac_dt,
						trunc(
							S0_T3.schd_tm,
							MCDateFmt.DD
						).as("schd_dt"),
						S0_T3.schd_tm.as("schd_hm"),
						S0_T1.sno1,
						S0_T1.sno2,
						S0_T1.sno3,
						S0_T1.sno4,
						S0_T3.bkf_typ,
						S0_T3.alloc_flg,
						S0_T3.alloc_ctl_typ,
						S0_T3.inpt_ctl_typ,
						S0_T1.gd_cd,
						S0_T1.inpt_rsn_cd,
						S0_T1.inpt_loc_cd,
						S0_T1.inpt_str_ln_cd,
						S0_T3.intr_rmrks.as("inpt_schd_intr_rmrks"),
						S0_T3.inst_rpt_rmrks.as("inpt_schd_inst_rpt_rmrks"),
						S0_T3.sub_char1.as("inpt_schd_sub_char1"),
						S0_T3.sub_char2.as("inpt_schd_sub_char2"),
						S0_T3.sub_char3.as("inpt_schd_sub_char3"),
						S0_T1.intr_rmrks.as("inpt_act_intr_rmrks"),
						S0_T1.act_rpt_rmrks.as("inpt_act_rpt_rmrks"),
						S0_T1.trd_rmrks.as("inpt_act_trd_rmrks"),
						S0_T1.sub_char1.as("inpt_act_sub_char1"),
						S0_T1.sub_char2.as("inpt_act_sub_char2"),
						S0_T1.sub_char3.as("inpt_act_sub_char3"),
						S0_T3.main_itm_flg,
						S0_T3.yield_calc_flg,
						S0_T1.bkf_ctl_flg.as("bkf_upd_flg"),
						S0_T3.lot_mix_flg,
						S0_T3.sublot_mix_flg,
						S0_T3.ver_no.as("inpt_schd_ver_no"),
						S0_M1.stk_mng_typ,
						S0_T3.prov_typ,
						S0_T3.alt_grp_cd,
						S0_T3.alt_grp_seq,
						S0_T3.alt_itm_fix_flg,
						S0_T3.alt_itm_typ,
						S0_T3.alt_alloc_prio,
						S0_T1.add_flg,
						S0_T3.inpt_schd_no,
						S0_T1.inpt_act_no,
						S0_T1.ext_sys_cd,
						S0_T1.ext_inpt_act_no,
						S0_T12.itm_cd.as("par_itm_cd"),
						S0_T12.itm_sub1.as("par_itm_sub1"),
						S0_T12.itm_sub2.as("par_itm_sub2"),
						S0_T12.itm_sub3.as("par_itm_sub3"),
						nvl(
							S0_M22.itm_nm,
							S0_M21.itm_nm
						).as("par_itm_nm"),
						S0_M21.itm_typ.as("par_itm_typ"),
						S0_M21.itm_typ_d_cd.as("par_itm_typ_d_cd"),
						S0_T22.mfg_sts_typ.as("oper_mfg_sts_typ"),
						S0_T23.oper_cd,
						S0_T21.disp_seq.as("oper_disp_seq"),
						S0_T23.oper_seq,
						trunc(
							S0_T11.st_act_tm,
							MCDateFmt.DD
						).as("st_act_dt"),
						S0_T11.st_act_tm.as("st_act_hm"),
						S0_T11.st_ac_dt,
						trunc(
							S0_T11.end_act_tm,
							MCDateFmt.DD
						).as("end_act_dt"),
						S0_T11.end_act_tm.as("end_act_hm"),
						S0_T11.end_ac_dt,
						S0_T21.oper_unit_qty.as("oper_unit_act_qty"),
						S0_T22.base_unit_qty.as("base_unit_oper_schd_qty"),
						S0_T23.oper_std_qty,
						S0_T23.oper_conv_qty,
						S0_T23.oper_unit_conv_rnd_typ,
						nullValue().as("oper_unit_schd_qty"),
						S0_T23.oper_unit_dec_place,
						S0_T21.oper_unit_cd,
						S0_T13.base_unit_inst_qty.as("par_base_unit_mfg_inst_qty"),
						S0_T13.base_unit_yield_qty.as("par_base_unit_yield_schd_qty"),
						S0_T14.base_unit_mfg_qty.as("par_base_unit_st_act_qty"),
						S0_T11.base_unit_yield_qty.as("par_base_unit_yield_qty"),
						S0_T11.base_unit_dfct_qty.as("par_base_unit_dfct_qty"),
						S0_T11.base_unit_cd.as("par_base_unit_cd"),
						S0_T12.lot_no.as("par_inst_lot_no"),
						S0_T12.sublot_no.as("par_inst_sublot_no"),
						S0_T12.sno1.as("par_sno1"),
						S0_T12.sno2.as("par_sno2"),
						S0_T12.sno3.as("par_sno3"),
						S0_T12.sno4.as("par_sno4"),
						S0_T11.act_rpt_rmrks.as("mfg_act_rpt_rmrks"),
						S0_T11.intr_rmrks.as("mfg_act_intr_rmrks"),
						S0_T11.sub_char1.as("mfg_act_sub_char1"),
						S0_T11.sub_char2.as("mfg_act_sub_char2"),
						S0_T11.sub_char3.as("mfg_act_sub_char3"),
						S0_T21.intr_rmrks.as("oper_act_intr_rmrks"),
						S0_T21.act_rpt_rmrks.as("oper_act_rpt_rmrks"),
						S0_T21.sub_char1.as("oper_act_sub_char1"),
						S0_T21.sub_char2.as("oper_act_sub_char2"),
						S0_T21.sub_char3.as("oper_act_sub_char3"),
						S0_T11.itm_yield,
						S0_T12.itm_lower_yield,
						S0_T12.itm_std_yield,
						S0_T12.itm_upper_yield,
						S0_T21.oper_yield,
						S0_T23.oper_lower_yield,
						S0_T23.oper_std_yield,
						S0_T23.oper_upper_yield,
						S0_T12.mfg_mtd_typ,
						S0_T12.sppl_cd,
						S0_T12.mfg_loc_cd,
						S0_M25.loc_nm.as("mfg_loc_nm"),
						S0_M25.loc_grp_cd.as("mfg_loc_grp_cd"),
						S0_T12.mfg_str_ln_cd,
						S0_T23.oper_loc_cd,
						S0_T23.oper_str_ln_cd,
						S0_T12.site_cd,
						S0_T12.wg_cd,
						S0_T12.bom_ptn,
						S0_T12.oper_ptn,
						S0_T12.itm_ord_no,
						S0_T23.usr_cd.as("oper_usr_cd"),
						S0_T3.disp_seq,
						S0_T3.oper_inst_no,
						S0_T1.oper_act_no,
						S0_T1.mfg_act_no,
						S0_T11.mfg_inst_no,
						S0_T11.div_seq,
						S0_T13.po_d_no,
						S0_T1.ins_usr_id,
						S0_T1.ins_usr_nm,
						S0_T1.ins_func_id,
						S0_T1.ins_ts,
						S0_T1.upd_usr_id,
						S0_T1.upd_usr_nm,
						S0_T1.upd_func_id,
						S0_T1.upd_ts,
						S0_T1.upd_srv_req_no,
						S0_T90.loss_act_no,
						S0_T90.loss_rsn_cd,
						S0_T90.base_unit_qty.as("loss_qty"),
						S0_T90.intr_rmrks.as("loss_act_intr_rmrks"),
						S0_T90.trd_rmrks.as("loss_act_trd_rmrks"),
						S0_T90.sub_char1.as("loss_act_sub_char1"),
						S0_T90.sub_char2.as("loss_act_sub_char2"),
						S0_T90.sub_char3.as("loss_act_sub_char3"),
						addDynamicSelect(DS0C_CHD_ITM_GRP),
						addDynamicSelect(DS0C_PAR_ITM_GRP)
					)
					.from(
						S0_T1
						.leftOuterJoin(S0_T2).on(
							bracket(
								S0_T1.inpt_schd_no.eq(S0_T2.inpt_schd_no)
								.and(S0_T1.div_seq.eq(S0_T2.div_seq))
							)
						)
						.leftOuterJoin(S0_T3).on(
							bracket(
								S0_T1.inpt_schd_no.eq(S0_T3.inpt_schd_no)
							)
						)
						.innerJoin(S0_T11).on(
							bracket(
								S0_T1.mfg_act_no.eq(S0_T11.mfg_act_no)
							)
						)
						.innerJoin(S0_T12).on(
							bracket(
								S0_T1.itm_mfg_inst_no.eq(S0_T12.itm_mfg_inst_no)
							)
						)
						.innerJoin(S0_T13).on(
							bracket(
								S0_T11.mfg_inst_no.eq(S0_T13.mfg_inst_no)
							)
						)
						.innerJoin(S0_T14).on(
							bracket(
								S0_T11.mfg_inst_no.eq(S0_T14.mfg_inst_no)
								.and(S0_T11.div_seq.eq(S0_T14.div_seq))
							)
						)
						.innerJoin(S0_T21).on(
							bracket(
								S0_T1.oper_act_no.eq(S0_T21.oper_act_no)
							)
						)
						.innerJoin(S0_T22).on(
							bracket(
								S0_T21.oper_inst_no.eq(S0_T22.oper_inst_no)
								.and(S0_T21.div_seq.eq(S0_T22.div_seq))
							)
						)
						.innerJoin(S0_T23).on(
							bracket(
								S0_T22.oper_inst_no.eq(S0_T23.oper_inst_no)
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
						.leftOuterJoin(S0_M2).on(
							bracket(
								S0_T1.itm_cd.eq(S0_M2.itm_cd)
								.and(S0_T1.itm_sub1.eq(S0_M2.itm_sub1))
								.and(S0_T1.itm_sub2.eq(S0_M2.itm_sub2))
								.and(S0_T1.itm_sub3.eq(S0_M2.itm_sub3))
								.and(S0_T1.sno1.eq(S0_M2.sno1))
								.and(S0_T1.sno2.eq(S0_M2.sno2))
								.and(S0_T1.sno3.eq(S0_M2.sno3))
								.and(S0_T1.sno4.eq(S0_M2.sno4))
							)
						)
						.leftOuterJoin(S0_M12).on(
							bracket(
								S0_T1.acxfr_bd_dpt_cd.eq(S0_M12.dpt_cd)
								.and(S0_T1.ac_dt.between(S0_M12.st_dt, S0_M12.end_dt))
							)
						)
						.leftOuterJoin(S0_M21).on(
							bracket(
								S0_T12.itm_cd.eq(S0_M21.itm_cd)
								.and(S0_T12.itm_sub1.eq(S0_M21.itm_sub1))
								.and(S0_T12.itm_sub2.eq(S0_M21.itm_sub2))
								.and(S0_T12.itm_sub3.eq(S0_M21.itm_sub3))
							)
						)
						.leftOuterJoin(S0_M22).on(
							bracket(
								S0_T12.itm_cd.eq(S0_M22.itm_cd)
								.and(S0_T12.itm_sub1.eq(S0_M22.itm_sub1))
								.and(S0_T12.itm_sub2.eq(S0_M22.itm_sub2))
								.and(S0_T12.itm_sub3.eq(S0_M22.itm_sub3))
								.and(S0_T12.sno1.eq(S0_M22.sno1))
								.and(S0_T12.sno2.eq(S0_M22.sno2))
								.and(S0_T12.sno3.eq(S0_M22.sno3))
								.and(S0_T12.sno4.eq(S0_M22.sno4))
							)
						)
						.innerJoin(S0_M25).on(
							bracket(
								S0_T12.mfg_loc_cd.eq(S0_M25.loc_cd)
							)
						)
						.innerJoin(S0_T90).on(
							bracket(
								S0_T1.inpt_act_no.eq(S0_T90.inpt_act_no)
							)
						)
						.addDynamicView()
						.addDynamicView(DS0C_CHD_ITM_GRP)
						.addDynamicView(DS0C_PAR_ITM_GRP)
					)
					.where(
						value(0).eq(value(0))
						.and(
							value(true).eq(value(false))
							.cutoff$or(S0_T22.mfg_sts_typ.eq(bind("tmp_oper_sts_cmpl_str")))
							.cutoff$or(S0_T22.mfg_sts_typ.eq(bind("tmp_oper_sts_stt_str")))
							.cutoff$or(S0_T22.mfg_sts_typ.eq(bind("tmp_oper_sts_ord_str")))
						)
						.and(
							value(true).eq(value(false))
							.cutoff$or(S0_T2.mfg_sts_typ.eq(bind("tmp_inpt_sts_cmpl_str")))
							.cutoff$or(S0_T2.mfg_sts_typ.eq(bind("tmp_inpt_sts_stt_str")))
							.cutoff$or(S0_T2.mfg_sts_typ.eq(bind("tmp_inpt_sts_ord_str")))
							.cutoff$or(
								bracket(
									value(true).eq(bind("tmp_inpt_no_schd_str"))
									.and(S0_T2.mfg_sts_typ.isNull())
								)
							)
						)
						.cutoff$and(
							bind("tmp_not_alloc_srch_str").eq(value(true))
							.and(S0_T3.base_unit_rqmt_qty.add(S0_T3.base_unit_fxd_rqmt_qty).gt(value(0)))
							.and(
								S0_T3.alloc_ctl_typ.in(
									value(MAC_ALLOC_CTL_TYP.ALLOC_INST_NG.value()),
									value(MAC_ALLOC_CTL_TYP.ALLOC_INST_OK.value())
								)
							)
							.and(S0_T3.alloc_flg.eq(value(false)))
						)
						.cutoff$and(S0_T3.bkf_typ.like(bind("bkf_typ")))
						.cutoff$and(S0_T3.yield_calc_flg.eq(bind("tmp_yield_calc_str")))
						.cutoff$and(S0_T3.schd_tm.gte(bind("inpt_schd_hm_fr")))
						.cutoff$and(S0_T3.schd_tm.lte(bind("inpt_schd_hm_to")))
						.cutoff$and(S0_T1.act_tm.gte(bind("inpt_act_hm_fr")))
						.cutoff$and(S0_T1.act_tm.lte(bind("inpt_act_hm_to")))
						.cutoff$and(S0_T1.ac_dt.gte(bind("inpt_ac_dt_fr")))
						.cutoff$and(S0_T1.ac_dt.lte(bind("inpt_ac_dt_to")))
						.cutoff$and(S0_T12.site_cd.like(bind("mfg_loc_site_cd")))
						.addDynamicPredicate()
						.cutoff$and(S0_T12.wg_cd.like(bind("mfg_loc_wg_cd")))
						.cutoff$and(S0_M25.loc_grp_cd.like(bind("mfg_loc_grp_cd")))
						.cutoff$and(S0_T12.mfg_loc_cd.like(bind("mfg_loc_cd")))
						.cutoff$and(S0_M25.loc_nm.like(bind("mfg_loc_nm")))
						.cutoff$and(S0_T12.mfg_str_ln_cd.like(bind("mfg_str_ln_cd")))
						.cutoff$and(S0_T1.inpt_loc_cd.like(bind("inpt_loc_cd")))
						.cutoff$and(S0_T1.inpt_str_ln_cd.like(bind("inpt_str_ln_cd")))
						.cutoff$and(S0_T12.sppl_cd.like(bind("sppl_cd")))
						.cutoff$and(S0_T23.oper_cd.like(bind("oper_cd")))
						.cutoff$and(S0_T23.oper_loc_cd.like(bind("oper_loc_cd")))
						.cutoff$and(S0_T23.oper_str_ln_cd.like(bind("oper_str_ln_cd")))
						.cutoff$and(S0_T12.mfg_mtd_typ.like(bind("mfg_mtd_typ")))
						.cutoff$and(S0_M1.itm_typ.like(bind("chd_itm_typ")))
						.cutoff$and(S0_M1.itm_typ_d_cd.like(bind("chd_itm_typ_d_cd")))
						.cutoff$and(S0_T3.inpt_ctl_typ.like(bind("inpt_ctl_typ")))
						.cutoff$and(S0_T1.itm_cd.like(bind("chd_itm_cd")))
						.cutoff$and(S0_T1.itm_sub1.like(bind("chd_itm_sub1")))
						.cutoff$and(S0_T1.itm_sub2.like(bind("chd_itm_sub2")))
						.cutoff$and(S0_T1.itm_sub3.like(bind("chd_itm_sub3")))
						.cutoff$and(
							nvl(
								S0_M2.itm_nm,
								S0_M1.itm_nm
							).like(bind("chd_itm_nm"))
						)
						.cutoff$and(S0_T1.lot_no.like(bind("chd_lot_no")))
						.cutoff$and(S0_T1.sublot_no.like(bind("chd_sublot_no")))
						.cutoff$and(S0_T90.loss_rsn_cd.like(bind("loss_rsn_cd")))
						.cutoff$and(S0_M21.itm_typ.like(bind("par_itm_typ")))
						.cutoff$and(S0_M21.itm_typ_d_cd.like(bind("par_itm_typ_d_cd")))
						.cutoff$and(S0_T13.mfg_inst_no.like(bind("mfg_inst_no")))
						.cutoff$and(S0_T12.itm_cd.like(bind("par_itm_cd")))
						.cutoff$and(S0_T12.itm_sub1.like(bind("par_itm_sub1")))
						.cutoff$and(S0_T12.itm_sub2.like(bind("par_itm_sub2")))
						.cutoff$and(S0_T12.itm_sub3.like(bind("par_itm_sub3")))
						.cutoff$and(
							nvl(
								S0_M22.itm_nm,
								S0_M21.itm_nm
							).like(bind("par_itm_nm"))
						)
						.cutoff$and(S0_T12.sno1.like(bind("par_sno1")))
						.cutoff$and(S0_T12.sno2.like(bind("par_sno2")))
						.cutoff$and(S0_T12.sno3.like(bind("par_sno3")))
						.cutoff$and(S0_T12.sno4.like(bind("par_sno4")))
						.cutoff$and(S0_T23.usr_cd.like(bind("oper_usr_cd")))
						.cutoff$and(S0_T12.itm_ord_no.like(bind("itm_ord_no")))
						.cutoff$and(S0_T13.po_d_no.like(bind("po_d_no")))
						.cutoff$and(S0_T23.oper_inst_no.like(bind("oper_inst_no")))
						.cutoff$and(S0_T11.mfg_act_no.like(bind("mfg_act_no")))
						.cutoff$and(S0_T21.oper_act_no.like(bind("oper_act_no")))
						.cutoff$and(S0_T3.inpt_schd_no.like(bind("inpt_schd_no")))
						.cutoff$and(S0_T1.inpt_act_no.like(bind("inpt_act_no")))
						.cutoff$and(S0_T90.loss_act_no.like(bind("loss_act_no")))
						.cutoff$and(S0_T1.inpt_rsn_cd.like(bind("inpt_rsn_cd")))
						.cutoff$and(S0_T1.ext_inpt_act_no.like(bind("ext_inpt_act_no")))
						.cutoff$and(S0_T3.inst_rpt_rmrks.like(bind("inpt_schd_inst_rpt_rmrks")))
						.cutoff$and(S0_T3.intr_rmrks.like(bind("inpt_schd_intr_rmrks")))
						.cutoff$and(S0_T3.sub_char1.like(bind("inpt_schd_sub_char1")))
						.cutoff$and(S0_T3.sub_char2.like(bind("inpt_schd_sub_char2")))
						.cutoff$and(S0_T3.sub_char3.like(bind("inpt_schd_sub_char3")))
						.cutoff$and(S0_T1.act_rpt_rmrks.like(bind("inpt_act_rpt_rmrks")))
						.cutoff$and(S0_T1.intr_rmrks.like(bind("inpt_act_intr_rmrks")))
						.cutoff$and(S0_T1.trd_rmrks.like(bind("inpt_act_trd_rmrks")))
						.cutoff$and(S0_T1.sub_char1.like(bind("inpt_act_sub_char1")))
						.cutoff$and(S0_T1.sub_char2.like(bind("inpt_act_sub_char2")))
						.cutoff$and(S0_T1.sub_char3.like(bind("inpt_act_sub_char3")))
						.cutoff$and(S0_T11.act_rpt_rmrks.like(bind("mfg_act_rpt_rmrks")))
						.cutoff$and(S0_T11.intr_rmrks.like(bind("mfg_act_intr_rmrks")))
						.cutoff$and(S0_T11.sub_char1.like(bind("mfg_act_sub_char1")))
						.cutoff$and(S0_T11.sub_char2.like(bind("mfg_act_sub_char2")))
						.cutoff$and(S0_T11.sub_char3.like(bind("mfg_act_sub_char3")))
						.cutoff$and(S0_T21.intr_rmrks.like(bind("oper_act_intr_rmrks")))
						.cutoff$and(S0_T21.act_rpt_rmrks.like(bind("oper_act_rpt_rmrks")))
						.cutoff$and(S0_T21.sub_char1.like(bind("oper_act_sub_char1")))
						.cutoff$and(S0_T21.sub_char2.like(bind("oper_act_sub_char2")))
						.cutoff$and(S0_T21.sub_char3.like(bind("oper_act_sub_char3")))
						.addDynamicPredicate(DS0C_CHD_ITM_GRP)
						.addDynamicPredicate(DS0C_PAR_ITM_GRP)
					)
					.orderBy(
						S0_T1.mfg_act_no.asc(),
						S0_T3.disp_seq.asc(),
						S0_T1.inpt_act_no.asc()
					)
			)
			.setDynamicSQLInfo(
				when(boundOr("wrk_nm", "wrk_no"))
					.view(v -> v.leftOuterJoin(S0_T15).on(bracket(S0_T12.sno1.eq(S0_T15.sno1))))
					.predicate(p -> p.cutoff$and(S0_T15.wrk_no.like(bind("wrk_no")))),
				when(boundOr("wrk_nm"))
					.view(v -> v.leftOuterJoin(S0_T16).on(bracket(S0_T16.wrk_no.eq(S0_T15.wrk_no))))
					.predicate(p -> p.cutoff$and(S0_T16.wrk_nm.like(bind("wrk_nm")))),
				when(boundOr("inpt_loc_nm"))
					.view(v -> v.leftOuterJoin(S0_M5).on(bracket(S0_T1.inpt_loc_cd.eq(S0_M5.loc_cd))))
					.predicate(p -> p.cutoff$and(S0_M5.loc_nm.like(bind("inpt_loc_nm")))),
				when(boundOr("inpt_str_ln_nm"))
					.view(v -> v.leftOuterJoin(S0_M10).on(bracket(S0_T1.inpt_loc_cd.eq(S0_M10.loc_cd).and(S0_T1.inpt_str_ln_cd.eq(S0_M10.str_ln_cd)))))
					.predicate(p -> p.cutoff$and(S0_M10.str_ln_nm.like(bind("inpt_str_ln_nm")))),
				when(boundOr("chd_itm_typ_d_nm"))
					.view(v -> v.leftOuterJoin(S0_M15).on(bracket(S0_M1.itm_typ.eq(S0_M15.itm_typ).and(S0_M1.itm_typ_d_cd.eq(S0_M15.itm_typ_d_cd)))))
					.predicate(p -> p.cutoff$and(S0_M15.itm_typ_d_nm.like(bind("chd_itm_typ_d_nm")))),
				when(boundOr("sppl_nm"))
					.view(v -> v.leftOuterJoin(S0_M24).on(bracket(S0_T12.sppl_cd.eq(S0_M24.bp_cd))))
					.predicate(p -> p.cutoff$and(S0_M24.bp_nm.like(bind("sppl_nm")))),
				when(boundOr("mfg_str_ln_nm"))
					.view(v -> v.leftOuterJoin(S0_M26).on(bracket(S0_T12.mfg_loc_cd.eq(S0_M26.loc_cd).and(S0_T12.mfg_str_ln_cd.eq(S0_M26.str_ln_cd)))))
					.predicate(p -> p.cutoff$and(S0_M26.str_ln_nm.like(bind("mfg_str_ln_nm")))),
				when(boundOr("mfg_loc_site_nm"))
					.view(v -> v.leftOuterJoin(S0_M29).on(bracket(S0_T12.site_cd.eq(S0_M29.site_cd))))
					.predicate(p -> p.cutoff$and(S0_M29.site_nm.like(bind("mfg_loc_site_nm")))),
				when(boundOr("mfg_loc_wg_nm"))
					.view(v -> v.leftOuterJoin(S0_M30).on(bracket(S0_T12.wg_cd.eq(S0_M30.wg_cd))))
					.predicate(p -> p.cutoff$and(S0_M30.wg_nm.like(bind("mfg_loc_wg_nm")))),
				when(boundOr("oper_nm"))
					.view(v -> v.leftOuterJoin(S0_M38).on(bracket(S0_T23.oper_cd.eq(S0_M38.oper_cd))))
					.predicate(p -> p.cutoff$and(S0_M38.oper_nm.like(bind("oper_nm")))),
				when(boundOr("oper_loc_nm"))
					.view(v -> v.leftOuterJoin(S0_M40).on(bracket(S0_T23.oper_loc_cd.eq(S0_M40.loc_cd))))
					.predicate(p -> p.cutoff$and(S0_M40.loc_nm.like(bind("oper_loc_nm")))),
				when(boundOr("oper_str_ln_nm"))
					.view(v -> v.leftOuterJoin(S0_M41).on(bracket(S0_T23.oper_loc_cd.eq(S0_M41.loc_cd).and(S0_T23.oper_str_ln_cd.eq(S0_M41.str_ln_cd)))))
					.predicate(p -> p.cutoff$and(S0_M41.str_ln_nm.like(bind("oper_str_ln_nm")))),
				when(boundOr("oper_usr_nm"))
					.view(v -> v.leftOuterJoin(S0_M42).on(bracket(S0_T23.usr_cd.eq(S0_M42.usr_cd))))
					.predicate(p -> p.cutoff$and(S0_M42.usr_nm.like(bind("oper_usr_nm")))),
				when(boundOr("par_itm_typ_d_nm"))
					.view(v -> v.leftOuterJoin(S0_M44).on(bracket(S0_M21.itm_typ.eq(S0_M44.itm_typ).and(S0_M21.itm_typ_d_cd.eq(S0_M44.itm_typ_d_cd)))))
					.predicate(p -> p.cutoff$and(S0_M44.itm_typ_d_nm.like(bind("par_itm_typ_d_nm")))),
				when(boundOr("mfg_loc_grp_nm"))
					.view(v -> v.leftOuterJoin(S0_M45).on(bracket(S0_M25.loc_grp_cd.eq(S0_M45.loc_grp_cd))))
					.predicate(p -> p.cutoff$and(S0_M45.loc_grp_nm.like(bind("mfg_loc_grp_nm")))),
				when(boundOr("loss_rsn_nm"))
					.view(v -> v.leftOuterJoin(S0_M90).on(bracket(S0_T90.loss_rsn_cd.eq(S0_M90.biz_rsn_cd))))
					.predicate(p -> p.cutoff$and(S0_M90.biz_rsn_nm.like(bind("loss_rsn_nm")))),
				when(boundOr("inpt_rsn_nm"))
					.view(v -> v.leftOuterJoin(S0_M91).on(bracket(S0_T1.inpt_rsn_cd.eq(S0_M91.biz_rsn_cd))))
					.predicate(p -> p.cutoff$and(S0_M91.biz_rsn_nm.like(bind("inpt_rsn_nm")))),
				when(boundOr("chd_itm_grp_flg1"))
					.select(DS0C_CHD_ITM_GRP, S0_M1.itm_grp_cd1.as("chd_itm_grp_cd1"), S0_CHD_ITM_GRP1.itm_grp_nm.as("chd_itm_grp_nm1"))
					.view(DS0C_CHD_ITM_GRP, v -> v.leftOuterJoin(S0_CHD_ITM_GRP1).on(S0_M1.itm_grp_cd1.eq(S0_CHD_ITM_GRP1.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP1.value()).eq(S0_CHD_ITM_GRP1.itm_grp_typ))))
					.predicate(DS0C_CHD_ITM_GRP, p -> p.cutoff$and(S0_M1.itm_grp_cd1.like(bind("chd_itm_grp_cd1"))).cutoff$and(S0_CHD_ITM_GRP1.itm_grp_nm.like(bind("chd_itm_grp_nm1")))),
				when(boundOr("chd_itm_grp_flg2"))
					.select(DS0C_CHD_ITM_GRP, S0_M1.itm_grp_cd2.as("chd_itm_grp_cd2"), S0_CHD_ITM_GRP2.itm_grp_nm.as("chd_itm_grp_nm2"))
					.view(DS0C_CHD_ITM_GRP, v -> v.leftOuterJoin(S0_CHD_ITM_GRP2).on(S0_M1.itm_grp_cd2.eq(S0_CHD_ITM_GRP2.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP2.value()).eq(S0_CHD_ITM_GRP2.itm_grp_typ))))
					.predicate(DS0C_CHD_ITM_GRP, p -> p.cutoff$and(S0_M1.itm_grp_cd2.like(bind("chd_itm_grp_cd2"))).cutoff$and(S0_CHD_ITM_GRP2.itm_grp_nm.like(bind("chd_itm_grp_nm2")))),
				when(boundOr("chd_itm_grp_flg3"))
					.select(DS0C_CHD_ITM_GRP, S0_M1.itm_grp_cd3.as("chd_itm_grp_cd3"), S0_CHD_ITM_GRP3.itm_grp_nm.as("chd_itm_grp_nm3"))
					.view(DS0C_CHD_ITM_GRP, v -> v.leftOuterJoin(S0_CHD_ITM_GRP3).on(S0_M1.itm_grp_cd3.eq(S0_CHD_ITM_GRP3.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP3.value()).eq(S0_CHD_ITM_GRP3.itm_grp_typ))))
					.predicate(DS0C_CHD_ITM_GRP, p -> p.cutoff$and(S0_M1.itm_grp_cd3.like(bind("chd_itm_grp_cd3"))).cutoff$and(S0_CHD_ITM_GRP3.itm_grp_nm.like(bind("chd_itm_grp_nm3")))),
				when(boundOr("chd_itm_grp_flg4"))
					.select(DS0C_CHD_ITM_GRP, S0_M1.itm_grp_cd4.as("chd_itm_grp_cd4"), S0_CHD_ITM_GRP4.itm_grp_nm.as("chd_itm_grp_nm4"))
					.view(DS0C_CHD_ITM_GRP, v -> v.leftOuterJoin(S0_CHD_ITM_GRP4).on(S0_M1.itm_grp_cd4.eq(S0_CHD_ITM_GRP4.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP4.value()).eq(S0_CHD_ITM_GRP4.itm_grp_typ))))
					.predicate(DS0C_CHD_ITM_GRP, p -> p.cutoff$and(S0_M1.itm_grp_cd4.like(bind("chd_itm_grp_cd4"))).cutoff$and(S0_CHD_ITM_GRP4.itm_grp_nm.like(bind("chd_itm_grp_nm4")))),
				when(boundOr("chd_itm_grp_flg5"))
					.select(DS0C_CHD_ITM_GRP, S0_M1.itm_grp_cd5.as("chd_itm_grp_cd5"), S0_CHD_ITM_GRP5.itm_grp_nm.as("chd_itm_grp_nm5"))
					.view(DS0C_CHD_ITM_GRP, v -> v.leftOuterJoin(S0_CHD_ITM_GRP5).on(S0_M1.itm_grp_cd5.eq(S0_CHD_ITM_GRP5.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP5.value()).eq(S0_CHD_ITM_GRP5.itm_grp_typ))))
					.predicate(DS0C_CHD_ITM_GRP, p -> p.cutoff$and(S0_M1.itm_grp_cd5.like(bind("chd_itm_grp_cd5"))).cutoff$and(S0_CHD_ITM_GRP5.itm_grp_nm.like(bind("chd_itm_grp_nm5")))),
				when(boundOr("chd_itm_grp_flg6"))
					.select(DS0C_CHD_ITM_GRP, S0_M1.itm_grp_cd6.as("chd_itm_grp_cd6"), S0_CHD_ITM_GRP6.itm_grp_nm.as("chd_itm_grp_nm6"))
					.view(DS0C_CHD_ITM_GRP, v -> v.leftOuterJoin(S0_CHD_ITM_GRP6).on(S0_M1.itm_grp_cd6.eq(S0_CHD_ITM_GRP6.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP6.value()).eq(S0_CHD_ITM_GRP6.itm_grp_typ))))
					.predicate(DS0C_CHD_ITM_GRP, p -> p.cutoff$and(S0_M1.itm_grp_cd6.like(bind("chd_itm_grp_cd6"))).cutoff$and(S0_CHD_ITM_GRP6.itm_grp_nm.like(bind("chd_itm_grp_nm6")))),
				when(boundOr("chd_itm_grp_flg7"))
					.select(DS0C_CHD_ITM_GRP, S0_M1.itm_grp_cd7.as("chd_itm_grp_cd7"), S0_CHD_ITM_GRP7.itm_grp_nm.as("chd_itm_grp_nm7"))
					.view(DS0C_CHD_ITM_GRP, v -> v.leftOuterJoin(S0_CHD_ITM_GRP7).on(S0_M1.itm_grp_cd7.eq(S0_CHD_ITM_GRP7.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP7.value()).eq(S0_CHD_ITM_GRP7.itm_grp_typ))))
					.predicate(DS0C_CHD_ITM_GRP, p -> p.cutoff$and(S0_M1.itm_grp_cd7.like(bind("chd_itm_grp_cd7"))).cutoff$and(S0_CHD_ITM_GRP7.itm_grp_nm.like(bind("chd_itm_grp_nm7")))),
				when(boundOr("chd_itm_grp_flg8"))
					.select(DS0C_CHD_ITM_GRP, S0_M1.itm_grp_cd8.as("chd_itm_grp_cd8"), S0_CHD_ITM_GRP8.itm_grp_nm.as("chd_itm_grp_nm8"))
					.view(DS0C_CHD_ITM_GRP, v -> v.leftOuterJoin(S0_CHD_ITM_GRP8).on(S0_M1.itm_grp_cd8.eq(S0_CHD_ITM_GRP8.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP8.value()).eq(S0_CHD_ITM_GRP8.itm_grp_typ))))
					.predicate(DS0C_CHD_ITM_GRP, p -> p.cutoff$and(S0_M1.itm_grp_cd8.like(bind("chd_itm_grp_cd8"))).cutoff$and(S0_CHD_ITM_GRP8.itm_grp_nm.like(bind("chd_itm_grp_nm8")))),
				when(boundOr("chd_itm_grp_flg9"))
					.select(DS0C_CHD_ITM_GRP, S0_M1.itm_grp_cd9.as("chd_itm_grp_cd9"), S0_CHD_ITM_GRP9.itm_grp_nm.as("chd_itm_grp_nm9"))
					.view(DS0C_CHD_ITM_GRP, v -> v.leftOuterJoin(S0_CHD_ITM_GRP9).on(S0_M1.itm_grp_cd9.eq(S0_CHD_ITM_GRP9.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP9.value()).eq(S0_CHD_ITM_GRP9.itm_grp_typ))))
					.predicate(DS0C_CHD_ITM_GRP, p -> p.cutoff$and(S0_M1.itm_grp_cd9.like(bind("chd_itm_grp_cd9"))).cutoff$and(S0_CHD_ITM_GRP9.itm_grp_nm.like(bind("chd_itm_grp_nm9")))),
				when(boundOr("chd_itm_grp_flg10"))
					.select(DS0C_CHD_ITM_GRP, S0_M1.itm_grp_cd10.as("chd_itm_grp_cd10"), S0_CHD_ITM_GRP10.itm_grp_nm.as("chd_itm_grp_nm10"))
					.view(DS0C_CHD_ITM_GRP, v -> v.leftOuterJoin(S0_CHD_ITM_GRP10).on(S0_M1.itm_grp_cd10.eq(S0_CHD_ITM_GRP10.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP10.value()).eq(S0_CHD_ITM_GRP10.itm_grp_typ))))
					.predicate(DS0C_CHD_ITM_GRP, p -> p.cutoff$and(S0_M1.itm_grp_cd10.like(bind("chd_itm_grp_cd10"))).cutoff$and(S0_CHD_ITM_GRP10.itm_grp_nm.like(bind("chd_itm_grp_nm10")))),
				when(boundOr("par_itm_grp_flg1"))
					.select(DS0C_PAR_ITM_GRP, S0_M21.itm_grp_cd1.as("par_itm_grp_cd1"), S0_PAR_ITM_GRP1.itm_grp_nm.as("par_itm_grp_nm1"))
					.view(DS0C_PAR_ITM_GRP, v -> v.leftOuterJoin(S0_PAR_ITM_GRP1).on(S0_M21.itm_grp_cd1.eq(S0_PAR_ITM_GRP1.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP1.value()).eq(S0_PAR_ITM_GRP1.itm_grp_typ))))
					.predicate(DS0C_PAR_ITM_GRP, p -> p.cutoff$and(S0_M21.itm_grp_cd1.like(bind("par_itm_grp_cd1"))).cutoff$and(S0_PAR_ITM_GRP1.itm_grp_nm.like(bind("par_itm_grp_nm1")))),
				when(boundOr("par_itm_grp_flg2"))
					.select(DS0C_PAR_ITM_GRP, S0_M21.itm_grp_cd2.as("par_itm_grp_cd2"), S0_PAR_ITM_GRP2.itm_grp_nm.as("par_itm_grp_nm2"))
					.view(DS0C_PAR_ITM_GRP, v -> v.leftOuterJoin(S0_PAR_ITM_GRP2).on(S0_M21.itm_grp_cd2.eq(S0_PAR_ITM_GRP2.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP2.value()).eq(S0_PAR_ITM_GRP2.itm_grp_typ))))
					.predicate(DS0C_PAR_ITM_GRP, p -> p.cutoff$and(S0_M21.itm_grp_cd2.like(bind("par_itm_grp_cd2"))).cutoff$and(S0_PAR_ITM_GRP2.itm_grp_nm.like(bind("par_itm_grp_nm2")))),
				when(boundOr("par_itm_grp_flg3"))
					.select(DS0C_PAR_ITM_GRP, S0_M21.itm_grp_cd3.as("par_itm_grp_cd3"), S0_PAR_ITM_GRP3.itm_grp_nm.as("par_itm_grp_nm3"))
					.view(DS0C_PAR_ITM_GRP, v -> v.leftOuterJoin(S0_PAR_ITM_GRP3).on(S0_M21.itm_grp_cd3.eq(S0_PAR_ITM_GRP3.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP3.value()).eq(S0_PAR_ITM_GRP3.itm_grp_typ))))
					.predicate(DS0C_PAR_ITM_GRP, p -> p.cutoff$and(S0_M21.itm_grp_cd3.like(bind("par_itm_grp_cd3"))).cutoff$and(S0_PAR_ITM_GRP3.itm_grp_nm.like(bind("par_itm_grp_nm3")))),
				when(boundOr("par_itm_grp_flg4"))
					.select(DS0C_PAR_ITM_GRP, S0_M21.itm_grp_cd4.as("par_itm_grp_cd4"), S0_PAR_ITM_GRP4.itm_grp_nm.as("par_itm_grp_nm4"))
					.view(DS0C_PAR_ITM_GRP, v -> v.leftOuterJoin(S0_PAR_ITM_GRP4).on(S0_M21.itm_grp_cd4.eq(S0_PAR_ITM_GRP4.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP4.value()).eq(S0_PAR_ITM_GRP4.itm_grp_typ))))
					.predicate(DS0C_PAR_ITM_GRP, p -> p.cutoff$and(S0_M21.itm_grp_cd4.like(bind("par_itm_grp_cd4"))).cutoff$and(S0_PAR_ITM_GRP4.itm_grp_nm.like(bind("par_itm_grp_nm4")))),
				when(boundOr("par_itm_grp_flg5"))
					.select(DS0C_PAR_ITM_GRP, S0_M21.itm_grp_cd5.as("par_itm_grp_cd5"), S0_PAR_ITM_GRP5.itm_grp_nm.as("par_itm_grp_nm5"))
					.view(DS0C_PAR_ITM_GRP, v -> v.leftOuterJoin(S0_PAR_ITM_GRP5).on(S0_M21.itm_grp_cd5.eq(S0_PAR_ITM_GRP5.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP5.value()).eq(S0_PAR_ITM_GRP5.itm_grp_typ))))
					.predicate(DS0C_PAR_ITM_GRP, p -> p.cutoff$and(S0_M21.itm_grp_cd5.like(bind("par_itm_grp_cd5"))).cutoff$and(S0_PAR_ITM_GRP5.itm_grp_nm.like(bind("par_itm_grp_nm5")))),
				when(boundOr("par_itm_grp_flg6"))
					.select(DS0C_PAR_ITM_GRP, S0_M21.itm_grp_cd6.as("par_itm_grp_cd6"), S0_PAR_ITM_GRP6.itm_grp_nm.as("par_itm_grp_nm6"))
					.view(DS0C_PAR_ITM_GRP, v -> v.leftOuterJoin(S0_PAR_ITM_GRP6).on(S0_M21.itm_grp_cd6.eq(S0_PAR_ITM_GRP6.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP6.value()).eq(S0_PAR_ITM_GRP6.itm_grp_typ))))
					.predicate(DS0C_PAR_ITM_GRP, p -> p.cutoff$and(S0_M21.itm_grp_cd6.like(bind("par_itm_grp_cd6"))).cutoff$and(S0_PAR_ITM_GRP6.itm_grp_nm.like(bind("par_itm_grp_nm6")))),
				when(boundOr("par_itm_grp_flg7"))
					.select(DS0C_PAR_ITM_GRP, S0_M21.itm_grp_cd7.as("par_itm_grp_cd7"), S0_PAR_ITM_GRP7.itm_grp_nm.as("par_itm_grp_nm7"))
					.view(DS0C_PAR_ITM_GRP, v -> v.leftOuterJoin(S0_PAR_ITM_GRP7).on(S0_M21.itm_grp_cd7.eq(S0_PAR_ITM_GRP7.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP7.value()).eq(S0_PAR_ITM_GRP7.itm_grp_typ))))
					.predicate(DS0C_PAR_ITM_GRP, p -> p.cutoff$and(S0_M21.itm_grp_cd7.like(bind("par_itm_grp_cd7"))).cutoff$and(S0_PAR_ITM_GRP7.itm_grp_nm.like(bind("par_itm_grp_nm7")))),
				when(boundOr("par_itm_grp_flg8"))
					.select(DS0C_PAR_ITM_GRP, S0_M21.itm_grp_cd8.as("par_itm_grp_cd8"), S0_PAR_ITM_GRP8.itm_grp_nm.as("par_itm_grp_nm8"))
					.view(DS0C_PAR_ITM_GRP, v -> v.leftOuterJoin(S0_PAR_ITM_GRP8).on(S0_M21.itm_grp_cd8.eq(S0_PAR_ITM_GRP8.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP8.value()).eq(S0_PAR_ITM_GRP8.itm_grp_typ))))
					.predicate(DS0C_PAR_ITM_GRP, p -> p.cutoff$and(S0_M21.itm_grp_cd8.like(bind("par_itm_grp_cd8"))).cutoff$and(S0_PAR_ITM_GRP8.itm_grp_nm.like(bind("par_itm_grp_nm8")))),
				when(boundOr("par_itm_grp_flg9"))
					.select(DS0C_PAR_ITM_GRP, S0_M21.itm_grp_cd9.as("par_itm_grp_cd9"), S0_PAR_ITM_GRP9.itm_grp_nm.as("par_itm_grp_nm9"))
					.view(DS0C_PAR_ITM_GRP, v -> v.leftOuterJoin(S0_PAR_ITM_GRP9).on(S0_M21.itm_grp_cd9.eq(S0_PAR_ITM_GRP9.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP9.value()).eq(S0_PAR_ITM_GRP9.itm_grp_typ))))
					.predicate(DS0C_PAR_ITM_GRP, p -> p.cutoff$and(S0_M21.itm_grp_cd9.like(bind("par_itm_grp_cd9"))).cutoff$and(S0_PAR_ITM_GRP9.itm_grp_nm.like(bind("par_itm_grp_nm9")))),
				when(boundOr("par_itm_grp_flg10"))
					.select(DS0C_PAR_ITM_GRP, S0_M21.itm_grp_cd10.as("par_itm_grp_cd10"), S0_PAR_ITM_GRP10.itm_grp_nm.as("par_itm_grp_nm10"))
					.view(DS0C_PAR_ITM_GRP, v -> v.leftOuterJoin(S0_PAR_ITM_GRP10).on(S0_M21.itm_grp_cd10.eq(S0_PAR_ITM_GRP10.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP10.value()).eq(S0_PAR_ITM_GRP10.itm_grp_typ))))
					.predicate(DS0C_PAR_ITM_GRP, p -> p.cutoff$and(S0_M21.itm_grp_cd10.like(bind("par_itm_grp_cd10"))).cutoff$and(S0_PAR_ITM_GRP10.itm_grp_nm.like(bind("par_itm_grp_nm10"))))
			)
			.setJoinInfo(
				joinInfo(
					j -> j
						.add(MST_WRK_SNO_R.class, r -> toCondition(
							r.getStringNE("par_sno1")
						))
						.addSelect(m -> toArray(
							m.wrk_no
						))
						.addMap((r, m) -> {
							r.setStringNE("wrk_no", m.wrk_no());
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
						.add(MAM_LOC_R.class, r -> toCondition(
							r.getStringNE("inpt_loc_cd")
						))
						.addSelect(m -> toArray(
							m.loc_nm,
							m.wg_cd
						))
						.addMap((r, m) -> {
							r.setStringNE("inpt_loc_nm", m.loc_nm());
							r.setStringNE("join_wg_cd_", m.wg_cd());
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
						.add(MAM_ALT_GRP_R.class, r -> toCondition(
							r.getStringNE("alt_grp_cd"),
							r.getStringNE("join_wg_cd_")
						))
						.addSelect(m -> toArray(
							m.alt_grp_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("alt_grp_nm", m.alt_grp_nm());
					}),
					j -> j
						.add(MAM_STR_LN_R.class, r -> toCondition(
							r.getStringNE("inpt_loc_cd"),
							r.getStringNE("inpt_str_ln_cd")
						))
						.addSelect(m -> toArray(
							m.str_ln_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("inpt_str_ln_nm", m.str_ln_nm());
					}),
					j -> j
						.add(MAM_BIZ_RSN_R.class, r -> toCondition(
							r.getStringNE("acxfr_act_rsn_cd")
						))
						.addSelect(m -> toArray(
							m.biz_rsn_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("acxfr_act_rsn_nm", m.biz_rsn_nm());
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
						.add(MAM_BP_R.class, r -> toCondition(
							r.getStringNE("stk_arrv_bp_cd")
						))
						.addSelect(m -> toArray(
							m.bp_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("stk_arrv_bp_nm", m.bp_nm());
					}),
					j -> j
						.add(MAM_ITM_TYP_D_R.class, r -> toCondition(
							r.getStringNE("chd_itm_typ"),
							r.getStringNE("chd_itm_typ_d_cd")
						))
						.addSelect(m -> toArray(
							m.itm_typ_d_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("chd_itm_typ_d_nm", m.itm_typ_d_nm());
					}),
					j -> j
						.add(MAM_UNIT_R.class, r -> toCondition(
							r.getStringNE("par_base_unit_cd")
						))
						.addSelect(m -> toArray(
							m.dec_place,
							m.unit_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("par_base_unit_nm", m.unit_nm());
							r.setNumberNE("par_base_unit_dec_place", m.dec_place());
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
						.add(MAM_STR_LN_R.class, r -> toCondition(
							r.getStringNE("mfg_loc_cd"),
							r.getStringNE("mfg_str_ln_cd")
						))
						.addSelect(m -> toArray(
							m.str_ln_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("mfg_str_ln_nm", m.str_ln_nm());
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
							r.getStringNE("wg_cd")
						))
						.addSelect(m -> toArray(
							m.wg_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("wg_nm", m.wg_nm());
					}),
					j -> j
						.add(MAM_OPER_R.class, r -> toCondition(
							r.getStringNE("oper_cd")
						))
						.addSelect(m -> toArray(
							m.oper_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("oper_nm", m.oper_nm());
					}),
					j -> j
						.add(MAM_UNIT_R.class, r -> toCondition(
							r.getStringNE("oper_unit_cd")
						))
						.addSelect(m -> toArray(
							m.unit_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("oper_unit_nm", m.unit_nm());
					}),
					j -> j
						.add(MAM_LOC_R.class, r -> toCondition(
							r.getStringNE("oper_loc_cd")
						))
						.addSelect(m -> toArray(
							m.loc_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("oper_loc_nm", m.loc_nm());
					}),
					j -> j
						.add(MAM_STR_LN_R.class, r -> toCondition(
							r.getStringNE("oper_loc_cd"),
							r.getStringNE("oper_str_ln_cd")
						))
						.addSelect(m -> toArray(
							m.str_ln_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("oper_str_ln_nm", m.str_ln_nm());
					}),
					j -> j
						.add(MAM_USR_R.class, r -> toCondition(
							r.getStringNE("oper_usr_cd")
						))
						.addSelect(m -> toArray(
							m.usr_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("oper_usr_nm", m.usr_nm());
					}),
					j -> j
						.add(MAM_ITM_TYP_D_R.class, r -> toCondition(
							r.getStringNE("par_itm_typ"),
							r.getStringNE("par_itm_typ_d_cd")
						))
						.addSelect(m -> toArray(
							m.itm_typ_d_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("par_itm_typ_d_nm", m.itm_typ_d_nm());
					}),
					j -> j
						.add(MAM_LOC_GRP_R.class, r -> toCondition(
							r.getStringNE("mfg_loc_grp_cd")
						))
						.addSelect(m -> toArray(
							m.loc_grp_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("mfg_loc_grp_nm", m.loc_grp_nm());
					}),
					j -> j
						.add(MAM_BIZ_RSN_R.class, r -> toCondition(
							r.getStringNE("loss_rsn_cd")
						))
						.addSelect(m -> toArray(
							m.biz_rsn_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("loss_rsn_nm", m.biz_rsn_nm());
					}),
					j -> j
						.add(MAM_BIZ_RSN_R.class, r -> toCondition(
							r.getStringNE("inpt_rsn_cd")
						))
						.addSelect(m -> toArray(
							m.biz_rsn_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("inpt_rsn_nm", m.biz_rsn_nm());
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
	 * -- MSBCL1090_MST_YIELD_ACT_Query_S01
	 */
	static MCQueryPlan MSBCL1090_MST_YIELD_ACT_S01() {
		MSW_MFG_ACT_KEY_R S0_W1 = MSW_MFG_ACT_KEY_R.create("W1");
		MST_YIELD_ACT_R S0_T1 = MST_YIELD_ACT_R.create("T1");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBCL1090_MST_YIELD_ACT_Query_S01")
					.mainQuery()
					.select(
						S0_T1.mfg_act_no,
						S0_T1.lot_no,
						S0_T1.sublot_no
					)
					.from(
						S0_W1
						.innerJoin(S0_T1).on(
							bracket(
								S0_W1.mfg_act_no.eq(S0_T1.mfg_act_no)
							)
						)
					)
					.where(
						value(0).eq(value(0))
						.and(S0_T1.yield_typ.neq(value(MAC_YIELD_TYP.BYPROD.value())))
					)
			);
	}
}