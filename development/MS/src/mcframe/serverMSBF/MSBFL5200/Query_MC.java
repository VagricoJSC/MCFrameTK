package mcframe.serverMSBF.MSBFL5200;

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
	 * -- MSBFL5200_MST_LOT_TRACE_GI_Query_S01
	 */
	static MCQueryPlan MSBFL5200_MST_LOT_TRACE_GI_S01() {
		MST_LOT_TRACE_GI_R S0_T1 = MST_LOT_TRACE_GI_R.create("T1");
		MST_LOT_TRACE_GR_R S0_T2 = MST_LOT_TRACE_GR_R.create("T2");
		MAM_ITM_R S0_M1 = MAM_ITM_R.create("M1");
		MST_LOT_R S0_T3 = MST_LOT_R.create("T3");
		MST_IO_SCHD_R S0_T4 = MST_IO_SCHD_R.create("T4");
		MST_SLO_D_R S0_T5 = MST_SLO_D_R.create("T5");
		MST_IO_ACT_R S0_T6 = MST_IO_ACT_R.create("T6");
		MST_SHIP_ACT_R S0_T7 = MST_SHIP_ACT_R.create("T7");
		MST_SHIP_ACT_D_R S0_T8 = MST_SHIP_ACT_D_R.create("T8");
		MST_SHIP_SCHD_R S0_T9 = MST_SHIP_SCHD_R.create("T9");
		MAM_ITM_R S0_M2 = MAM_ITM_R.create("M2");
		MAM_UNIT_R S0_M3 = MAM_UNIT_R.create("M3");
		MAM_LOC_R S0_M4 = MAM_LOC_R.create("M4");
		MAM_BP_R S0_M5 = MAM_BP_R.create("M5");
		MAM_BP_R S0_M6 = MAM_BP_R.create("M6");
		MAM_SUNDRY_ITM_R S0_M7 = MAM_SUNDRY_ITM_R.create("M7");
		MST_LOT_TRACE_GR_R S1_TMP = MST_LOT_TRACE_GR_R.create("TMP");
		MST_IO_SCHD_R S2_IO_SCHD = MST_IO_SCHD_R.create("IO_SCHD");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBFL5200_MST_LOT_TRACE_GI_Query_S01")
					.mainQuery()
					.selectDistinct(
						S0_T1.itm_mfg_inst_no,
						S0_T1.stk_xfr_act_no,
						S0_T1.mfg_act_no,
						S0_T1.trd_ptn_typ,
						S0_T1.io_act_typ,
						S0_T1.slip_no,
						S0_T4.io_schd_typ,
						S0_T4.io_schd_sts_typ,
						S0_T1.slip_schd_no,
						S0_T1.itm_cd,
						nvl(
							S0_M7.itm_nm,
							S0_M1.itm_nm
						).as("itm_nm"),
						S0_T1.itm_sub1,
						S0_T1.itm_sub2,
						S0_T1.itm_sub3,
						S0_T1.lot_no,
						S0_T1.sublot_no,
						S0_T3.ver_no,
						S0_T1.sno1,
						S0_T1.sno2,
						S0_T1.sno3,
						S0_T1.sno4,
						S0_T1.base_unit_qty.as("base_gi_qty"),
						S0_T1.base_unit_cd,
						S0_M3.unit_nm.as("base_unit_nm"),
						S0_M1.dec_place.as("base_dec_place"),
						S0_T1.schd_dt,
						S0_T1.act_dt,
						S0_T1.loc_cd,
						S0_M4.loc_nm,
						coalesce(
							S0_T1.dlv_cd,
							S0_T9.dlv_cd,
							S0_T5.dlv_cd
						).as("dlv_cd"),
						cases()
							.when(S0_T8.dlv_sundry_flg.eq(value(true)))
								.then(S0_T8.dlv_id_nm)
							.when(S0_T9.dlv_sundry_flg.eq(value(true)))
								.then(S0_T9.dlv_nm)
							.when(
								S0_T9.dlv_cd.isNull()
								.and(S0_T5.dlv_sundry_flg.eq(value(true)))
							)
								.then(S0_T5.dlv_nm)
							.otherwise(S0_M5.bp_nm).as("dlv_nm"),
						cases()
							.when(S0_T1.tdlv_cd.isNotNull())
								.then(S0_T1.tdlv_cd)
							.when(S0_T7.ship_to_id_typ.eq(value(MSC_SHIP_TO_ID_TYP.TDLV.value())))
								.then(S0_T7.ship_to_id_cd)
							.when(S0_T9.tdlv_cd.isNotNull())
								.then(S0_T9.tdlv_cd)
							.otherwise(S0_T5.tdlv_cd).as("tdlv_cd"),
						cases()
							.when(
								S0_T7.ship_to_id_typ.eq(value(MSC_SHIP_TO_ID_TYP.TDLV.value()))
								.and(S0_T7.ship_to_sundry_flg.eq(value(true)))
							)
								.then(S0_T7.ship_to_id_nm)
							.when(S0_T9.tdlv_sundry_flg.eq(value(true)))
								.then(S0_T9.tdlv_nm)
							.when(
								S0_T9.tdlv_cd.isNull()
								.and(S0_T5.tdlv_sundry_flg.eq(value(true)))
							)
								.then(S0_T5.tdlv_nm)
							.otherwise(S0_M6.bp_nm).as("tdlv_nm"),
						S0_T2.itm_cd.as("par_itm_cd"),
						S0_M2.itm_nm.as("par_itm_nm"),
						S0_T2.itm_sub1.as("par_itm_sub1"),
						S0_T2.itm_sub2.as("par_itm_sub2"),
						S0_T2.itm_sub3.as("par_itm_sub3"),
						S0_T2.lot_no.as("par_lot_no"),
						S0_T2.sublot_no.as("par_sublot_no"),
						S0_T2.sno1.as("par_sno1"),
						S0_T2.sno2.as("par_sno2"),
						S0_T2.sno3.as("par_sno3"),
						S0_T2.sno4.as("par_sno4"),
						S0_T1.schd_act_typ,
						S0_T1.mfg_inst_unit_typ,
						S0_T3.lot_rmrks,
						S0_T1.sub_char1,
						S0_T1.sub_char2,
						S0_T1.sub_char3,
						S0_T1.ins_usr_id,
						S0_T1.ins_usr_nm,
						S0_T1.ins_ts,
						S0_T1.ins_func_id,
						S0_T1.upd_usr_id,
						S0_T1.upd_usr_nm,
						S0_T1.upd_ts,
						S0_T1.upd_func_id,
						S0_T1.upd_srv_req_no
					)
					.from(
						S0_T1
						.leftOuterJoin(S0_T2).on(
							bracket(
								MAC_MFG_INST_UNIT_TYP$IS_ITM(S0_T2.mfg_inst_unit_typ).eq(value(true))
								.and(
									S0_T2.mfg_act_no.eq(S0_T1.mfg_act_no)
									.or(
										S0_T2.itm_mfg_inst_no.eq(S0_T1.itm_mfg_inst_no)
										.and(MSC_SCHD_ACT_TYP$IS_SCHD(S0_T2.schd_act_typ).eq(value(true)))
									)
								)
							)
							.or(
								MAC_MFG_INST_UNIT_TYP$IS_OPER(S0_T2.mfg_inst_unit_typ).eq(value(true))
								.and(S0_T2.itm_mfg_inst_no.eq(S0_T1.itm_mfg_inst_no))
							)
							.or(S0_T2.stk_xfr_act_no.eq(S0_T1.stk_xfr_act_no))
						)
						.leftOuterJoin(S0_M1).on(
							S0_T1.itm_cd.eq(S0_M1.itm_cd)
							.and(S0_T1.itm_sub1.eq(S0_M1.itm_sub1))
							.and(S0_T1.itm_sub2.eq(S0_M1.itm_sub2))
							.and(S0_T1.itm_sub3.eq(S0_M1.itm_sub3))
						)
						.leftOuterJoin(S0_T3).on(
							S0_T1.itm_cd.eq(S0_T3.itm_cd)
							.and(S0_T1.itm_sub1.eq(S0_T3.itm_sub1))
							.and(S0_T1.itm_sub2.eq(S0_T3.itm_sub2))
							.and(S0_T1.itm_sub3.eq(S0_T3.itm_sub3))
							.and(S0_T1.lot_no.eq(S0_T3.lot_no))
							.and(
								bracket(
									MAC_STR$IS_NULL_VAL(S0_T3.sublot_no).eq(value(true))
									.and(
										S0_M1.sublot_mng_typ.in(
											value(MAC_SUBLOT_MNG_TYP.NOT_MNG.value()),
											value(MAC_SUBLOT_MNG_TYP.STK.value())
										)
									)
								)
								.or(S0_T1.sublot_no.eq(S0_T3.sublot_no))
							)
						)
						.leftOuterJoin(S0_T4).on(
							bracket(
								S0_T1.slip_schd_no.eq(S0_T4.slip_schd_no)
							)
						)
						.leftOuterJoin(S0_T5).on(
							bracket(
								S0_T4.io_schd_sub_no2.eq(S0_T5.slo_d_no)
								.and(
									S0_T4.io_schd_typ.in(
										value(MSC_IO_SCHD_TYP.SLS.value()),
										value(MSC_IO_SCHD_TYP.SLS_ACXFR.value()),
										value(MSC_IO_SCHD_TYP.SHIP_OUT.value())
									)
								)
							)
						)
						.leftOuterJoin(S0_T6).on(
							bracket(
								S0_T1.slip_no.eq(S0_T6.slip_no)
								.and(S0_T6.slip_sts_typ.eq(value(MAC_SLIP_STS_TYP.CRT.value())))
								.and(
									S0_T6.trd_ptn_typ.in(
										value(MAC_TRD_PTN_TYP.SLS.value()),
										value(MAC_TRD_PTN_TYP.SHIP.value())
									)
								)
								.and(S0_T6.io_act_typ.eq(value(MSC_IO_ACT_TYP.SHIP_OUT.value())))
							)
						)
						.leftOuterJoin(S0_T7).on(
							bracket(
								S0_T6.act_no.eq(S0_T7.ship_act_no)
							)
						)
						.leftOuterJoin(S0_T8).on(
							bracket(
								S0_T6.act_d_no.eq(S0_T8.ship_act_d_no)
							)
						)
						.leftOuterJoin(S0_T9).on(
							bracket(
								S0_T4.io_schd_sub_no3.eq(S0_T9.ship_schd_no)
								.and(
									S0_T4.io_schd_typ.in(
										value(MSC_IO_SCHD_TYP.SLS.value()),
										value(MSC_IO_SCHD_TYP.SLS_ACXFR.value()),
										value(MSC_IO_SCHD_TYP.SHIP_OUT.value())
									)
								)
							)
						)
						.leftOuterJoin(S0_M2).on(
							S0_T2.itm_cd.eq(S0_M2.itm_cd)
							.and(S0_T2.itm_sub1.eq(S0_M2.itm_sub1))
							.and(S0_T2.itm_sub2.eq(S0_M2.itm_sub2))
							.and(S0_T2.itm_sub3.eq(S0_M2.itm_sub3))
						)
						.leftOuterJoin(S0_M3).on(S0_T1.base_unit_cd.eq(S0_M3.unit_cd))
						.leftOuterJoin(S0_M4).on(S0_T1.loc_cd.eq(S0_M4.loc_cd))
						.leftOuterJoin(S0_M5).on(
							coalesce(
								S0_T1.dlv_cd,
								S0_T9.dlv_cd,
								S0_T5.dlv_cd
							).eq(S0_M5.bp_cd)
						)
						.leftOuterJoin(S0_M6).on(
							bracket(
								cases()
									.when(S0_T1.tdlv_cd.isNotNull())
										.then(S0_T1.tdlv_cd)
									.when(S0_T7.ship_to_id_typ.eq(value(MSC_SHIP_TO_ID_TYP.TDLV.value())))
										.then(S0_T7.ship_to_id_cd)
									.when(S0_T9.tdlv_cd.isNotNull())
										.then(S0_T9.tdlv_cd)
									.otherwise(S0_T5.tdlv_cd)
							).eq(S0_M6.bp_cd)
						)
						.leftOuterJoin(S0_M7).on(
							S0_T1.itm_cd.eq(S0_M7.itm_cd)
							.and(S0_T1.itm_sub1.eq(S0_M7.itm_sub1))
							.and(S0_T1.itm_sub2.eq(S0_M7.itm_sub2))
							.and(S0_T1.itm_sub3.eq(S0_M7.itm_sub3))
							.and(S0_T1.sno1.eq(S0_M7.sno1))
							.and(S0_T1.sno2.eq(S0_M7.sno2))
							.and(S0_T1.sno3.eq(S0_M7.sno3))
							.and(S0_T1.sno4.eq(S0_M7.sno4))
						)
					)
					.where(
						value(0).eq(value(0))
						.and(
							notExists(
								subQuery()
								.select(value(true))
								.from(S1_TMP)
								.where(
									value(0).eq(value(0))
									.and(
										bracket(
											S1_TMP.schd_act_typ.eq(value(MSC_SCHD_ACT_TYP.ACT.value()))
											.and(S1_TMP.io_act_typ.eq(value(MSC_IO_ACT_TYP.BYMFG.value())))
										)
										.or(
											S1_TMP.schd_act_typ.eq(value(MSC_SCHD_ACT_TYP.SCHD.value()))
											.and(
												exists(
													subQuery()
													.select(value(true))
													.from(S2_IO_SCHD)
													.where(
														S1_TMP.slip_schd_no.eq(S2_IO_SCHD.slip_schd_no)
														.and(S2_IO_SCHD.io_schd_typ.eq(value(MSC_IO_SCHD_TYP.BYMFG.value())))
													)
												)
											)
										)
									)
									.and(
										MAC_MFG_INST_UNIT_TYP$IS_ITM(S1_TMP.mfg_inst_unit_typ).eq(value(true))
										.and(
											S1_TMP.mfg_act_no.eq(S0_T1.mfg_act_no)
											.or(
												S1_TMP.itm_mfg_inst_no.eq(S0_T1.itm_mfg_inst_no)
												.and(MSC_SCHD_ACT_TYP$IS_SCHD(S1_TMP.schd_act_typ).eq(value(true)))
											)
										)
									)
									.and(S0_T1.itm_cd.eq(S1_TMP.itm_cd))
									.and(S0_T1.itm_sub1.eq(S1_TMP.itm_sub1))
									.and(S0_T1.itm_sub2.eq(S1_TMP.itm_sub2))
									.and(S0_T1.itm_sub3.eq(S1_TMP.itm_sub3))
									.and(S0_T1.sno1.eq(S1_TMP.sno1))
									.and(S0_T1.sno2.eq(S1_TMP.sno2))
									.and(S0_T1.sno3.eq(S1_TMP.sno3))
									.and(S0_T1.sno4.eq(S1_TMP.sno4))
								)
							)
						)
						.and(S0_T1.itm_cd.eq(bind("itm_cd")))
						.and(S0_T1.itm_sub1.eq(bind("itm_sub1")))
						.and(S0_T1.itm_sub2.eq(bind("itm_sub2")))
						.and(S0_T1.itm_sub3.eq(bind("itm_sub3")))
						.and(S0_T1.lot_no.eq(bind("lot_no")))
						.and(S0_T1.sublot_no.eq(bind("sublot_no")))
						.and(S0_T1.sno1.eq(bind("sno1")))
						.and(S0_T1.sno2.eq(bind("sno2")))
						.and(S0_T1.sno3.eq(bind("sno3")))
						.and(S0_T1.sno4.eq(bind("sno4")))
						.and(
							bind("out_use_par_lot_flg").eq(value(false))
							.or(
								value(0).eq(value(0))
								.and(S0_T2.itm_cd.eq(bind("par_itm_cd")))
								.and(S0_T2.itm_sub1.eq(bind("par_itm_sub1")))
								.and(S0_T2.itm_sub2.eq(bind("par_itm_sub2")))
								.and(S0_T2.itm_sub3.eq(bind("par_itm_sub3")))
								.and(S0_T2.lot_no.eq(bind("par_lot_no")))
								.and(S0_T2.sublot_no.eq(bind("par_sublot_no")))
								.and(S0_T2.sno1.eq(bind("par_sno1")))
								.and(S0_T2.sno2.eq(bind("par_sno2")))
								.and(S0_T2.sno3.eq(bind("par_sno3")))
								.and(S0_T2.sno4.eq(bind("par_sno4")))
							)
						)
					)
			);
	}
	
	/**
	 * -- MSBFL5200_MST_LOT_TRACE_GR_Query_S01
	 */
	static MCQueryPlan MSBFL5200_MST_LOT_TRACE_GR_S01() {
		MST_LOT_TRACE_GR_R S0_T1 = MST_LOT_TRACE_GR_R.create("T1");
		MAM_ITM_R S0_M1 = MAM_ITM_R.create("M1");
		MST_LOT_R S0_T2 = MST_LOT_R.create("T2");
		MAM_UNIT_R S0_M2 = MAM_UNIT_R.create("M2");
		MAM_LOC_R S0_M3 = MAM_LOC_R.create("M3");
		MAM_LOC_R S0_M4 = MAM_LOC_R.create("M4");
		MAM_SUNDRY_ITM_R S0_M5 = MAM_SUNDRY_ITM_R.create("M5");
		MAM_BP_R S0_M6 = MAM_BP_R.create("M6");
		MST_IO_SCHD_R S0_T3 = MST_IO_SCHD_R.create("T3");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBFL5200_MST_LOT_TRACE_GR_Query_S01")
					.mainQuery()
					.select(
						S0_T1.itm_mfg_inst_no,
						S0_T1.stk_xfr_act_no,
						S0_T1.mfg_act_no,
						S0_T1.trd_ptn_typ,
						S0_T1.io_act_typ,
						S0_T1.slip_no,
						S0_T3.io_schd_typ,
						S0_T3.io_schd_sts_typ,
						S0_T1.slip_schd_no,
						S0_T1.itm_cd,
						nvl(
							S0_M5.itm_nm,
							S0_M1.itm_nm
						).as("itm_nm"),
						S0_T1.itm_sub1,
						S0_T1.itm_sub2,
						S0_T1.itm_sub3,
						S0_T1.lot_no,
						S0_T1.sublot_no,
						S0_T2.ver_no,
						S0_T1.sno1,
						S0_T1.sno2,
						S0_T1.sno3,
						S0_T1.sno4,
						S0_T1.base_unit_qty.as("base_gr_qty"),
						S0_T1.base_unit_cd,
						S0_M2.unit_nm.as("base_unit_nm"),
						S0_M1.dec_place.as("base_dec_place"),
						S0_T1.schd_dt,
						S0_T1.act_dt,
						S0_T1.mfg_loc_cd,
						S0_M3.loc_nm.as("mfg_loc_nm"),
						S0_T1.strg_loc_cd,
						S0_M4.loc_nm.as("strg_loc_nm"),
						S0_T1.sppl_cd,
						S0_M6.bp_nm.as("sppl_nm"),
						S0_T1.schd_act_typ,
						S0_T1.mfg_inst_unit_typ,
						S0_T2.lot_rmrks,
						S0_T1.sub_char1,
						S0_T1.sub_char2,
						S0_T1.sub_char3,
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
						.leftOuterJoin(S0_M1).on(
							S0_T1.itm_cd.eq(S0_M1.itm_cd)
							.and(S0_T1.itm_sub1.eq(S0_M1.itm_sub1))
							.and(S0_T1.itm_sub2.eq(S0_M1.itm_sub2))
							.and(S0_T1.itm_sub3.eq(S0_M1.itm_sub3))
						)
						.leftOuterJoin(S0_T2).on(
							S0_T1.itm_cd.eq(S0_T2.itm_cd)
							.and(S0_T1.itm_sub1.eq(S0_T2.itm_sub1))
							.and(S0_T1.itm_sub2.eq(S0_T2.itm_sub2))
							.and(S0_T1.itm_sub3.eq(S0_T2.itm_sub3))
							.and(S0_T1.lot_no.eq(S0_T2.lot_no))
							.and(
								bracket(
									MAC_STR$IS_NULL_VAL(S0_T2.sublot_no).eq(value(true))
									.and(
										S0_M1.sublot_mng_typ.in(
											value(MAC_SUBLOT_MNG_TYP.NOT_MNG.value()),
											value(MAC_SUBLOT_MNG_TYP.STK.value())
										)
									)
								)
								.or(S0_T1.sublot_no.eq(S0_T2.sublot_no))
							)
						)
						.leftOuterJoin(S0_M2).on(S0_T1.base_unit_cd.eq(S0_M2.unit_cd))
						.leftOuterJoin(S0_M3).on(S0_T1.mfg_loc_cd.eq(S0_M3.loc_cd))
						.leftOuterJoin(S0_M4).on(S0_T1.strg_loc_cd.eq(S0_M4.loc_cd))
						.leftOuterJoin(S0_M5).on(
							S0_T1.itm_cd.eq(S0_M5.itm_cd)
							.and(S0_T1.itm_sub1.eq(S0_M5.itm_sub1))
							.and(S0_T1.itm_sub2.eq(S0_M5.itm_sub2))
							.and(S0_T1.itm_sub3.eq(S0_M5.itm_sub3))
							.and(S0_T1.sno1.eq(S0_M5.sno1))
							.and(S0_T1.sno2.eq(S0_M5.sno2))
							.and(S0_T1.sno3.eq(S0_M5.sno3))
							.and(S0_T1.sno4.eq(S0_M5.sno4))
						)
						.leftOuterJoin(S0_M6).on(
							bracket(
								S0_T1.sppl_cd.eq(S0_M6.bp_cd)
							)
						)
						.leftOuterJoin(S0_T3).on(
							bracket(
								S0_T1.slip_schd_no.eq(S0_T3.slip_schd_no)
							)
						)
					)
					.where(
						value(0).eq(value(0))
						.and(S0_T1.itm_cd.eq(bind("itm_cd")))
						.and(S0_T1.itm_sub1.eq(bind("itm_sub1")))
						.and(S0_T1.itm_sub2.eq(bind("itm_sub2")))
						.and(S0_T1.itm_sub3.eq(bind("itm_sub3")))
						.and(S0_T1.lot_no.eq(bind("lot_no")))
						.and(S0_T1.sublot_no.eq(bind("sublot_no")))
						.and(S0_T1.sno1.eq(bind("sno1")))
						.and(S0_T1.sno2.eq(bind("sno2")))
						.and(S0_T1.sno3.eq(bind("sno3")))
						.and(S0_T1.sno4.eq(bind("sno4")))
					)
			);
	}
	
	/**
	 * -- MSBFL5200_MSW_LOT_TRACE_F_HRRCHY_Query_S01
	 */
	static MCQueryPlan MSBFL5200_MSW_LOT_TRACE_F_HRRCHY_S01() {
		MSW_LOT_TRACE_F_HRRCHY_R S0_W = MSW_LOT_TRACE_F_HRRCHY_R.create("W");
		MAM_ITM_R S0_M1 = MAM_ITM_R.create("M1");
		MST_LOT_R S0_T1 = MST_LOT_R.create("T1");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBFL5200_MSW_LOT_TRACE_F_HRRCHY_Query_S01")
					.mainQuery()
					.selectDistinct(
						S0_W.peg_no,
						S0_W.hrrchy,
						S0_W.loop_flg,
						S0_W.itm_cd,
						S0_W.itm_nm,
						S0_W.itm_sub1,
						S0_W.itm_sub2,
						S0_W.itm_sub3,
						S0_W.lot_no,
						S0_W.sublot_no,
						S0_W.sno1,
						S0_W.sno2,
						S0_W.sno3,
						S0_W.sno4,
						S0_T1.ver_no,
						S0_T1.bp_lot_no,
						S0_T1.stk_insp_typ,
						S0_T1.quality_typ,
						S0_T1.mfg_aprv_sts_typ,
						decode(
							S0_T1.stk_insp_typ,
							nullValue(),
							value(false),
							value(MSC_STK_INSP_TYP.FIN.value()),
							value(false),
							value(true)
						).as("stk_insp_flg"),
						decode(
							S0_T1.quality_typ,
							nullValue(),
							value(false),
							value(MAC_QUALITY_TYP.GOOD.value()),
							value(false),
							value(true)
						).as("not_quality_good_flg"),
						decode(
							S0_T1.mfg_aprv_sts_typ,
							nullValue(),
							value(false),
							value(MSC_MFG_APRV_STS_TYP.ACT_ACPT.value()),
							value(false),
							value(true)
						).as("not_mfg_aprv_acpt_flg"),
						S0_W.lot_mng_typ,
						S0_W.sublot_mng_typ,
						S0_W.par_itm_cd,
						S0_W.par_itm_sub1,
						S0_W.par_itm_sub2,
						S0_W.par_itm_sub3,
						S0_W.par_lot_no,
						S0_W.par_sublot_no,
						S0_W.par_sno1,
						S0_W.par_sno2,
						S0_W.par_sno3,
						S0_W.par_sno4,
						S0_T1.lot_rmrks,
						S0_T1.lot_sub_char1,
						S0_T1.lot_sub_char2,
						S0_T1.lot_sub_char3,
						S0_T1.lot_sub_char4,
						S0_T1.lot_sub_char5,
						S0_T1.lot_sub_num1,
						S0_T1.lot_sub_num2,
						S0_T1.lot_sub_num3,
						S0_T1.lot_sub_num4,
						S0_T1.lot_sub_num5,
						S0_T1.lot_sub_dt1,
						S0_T1.lot_sub_dt2,
						S0_T1.lot_sub_dt3,
						S0_T1.lot_sub_dt4,
						S0_T1.lot_sub_dt5,
						S0_T1.lot_sub_flg1,
						S0_T1.lot_sub_flg2,
						S0_T1.lot_sub_flg3,
						S0_T1.lot_sub_flg4,
						S0_T1.lot_sub_flg5,
						S0_M1.th_image,
						S0_W.sort_no
					)
					.from(
						S0_W
						.leftOuterJoin(S0_M1).on(
							S0_W.itm_cd.eq(S0_M1.itm_cd)
							.and(S0_W.itm_sub1.eq(S0_M1.itm_sub1))
							.and(S0_W.itm_sub2.eq(S0_M1.itm_sub2))
							.and(S0_W.itm_sub3.eq(S0_M1.itm_sub3))
						)
						.leftOuterJoin(S0_T1).on(
							S0_W.itm_cd.eq(S0_T1.itm_cd)
							.and(S0_W.itm_sub1.eq(S0_T1.itm_sub1))
							.and(S0_W.itm_sub2.eq(S0_T1.itm_sub2))
							.and(S0_W.itm_sub3.eq(S0_T1.itm_sub3))
							.and(S0_W.lot_no.eq(S0_T1.lot_no))
							.and(
								bracket(
									S0_T1.sublot_no.eq(value(MAC_STR.NULL_VAL.value()))
									.and(
										S0_M1.sublot_mng_typ.in(
											value(MAC_SUBLOT_MNG_TYP.NOT_MNG.value()),
											value(MAC_SUBLOT_MNG_TYP.STK.value())
										)
									)
								)
								.or(S0_W.sublot_no.eq(S0_T1.sublot_no))
							)
						)
					)
					.where(
						value(0).eq(value(0))
					)
					.orderBy(S0_W.sort_no.asc())
			);
	}
	
	/**
	 * -- MSBFL5200_MSW_LOT_TRACE_F_HRRCHY_Query_S02
	 */
	static MCQueryPlan MSBFL5200_MSW_LOT_TRACE_F_HRRCHY_S02() {
		MSW_LOT_TRACE_F_HRRCHY_R S0_W = MSW_LOT_TRACE_F_HRRCHY_R.create("W");
		MAM_ITM_R S0_M1 = MAM_ITM_R.create("M1");
		MST_LOT_R S0_T1 = MST_LOT_R.create("T1");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBFL5200_MSW_LOT_TRACE_F_HRRCHY_Query_S02")
					.mainQuery()
					.select(
						S0_W.hrrchy,
						S0_W.loop_flg,
						S0_W.par_itm_cd.as("itm_cd"),
						S0_W.itm_nm,
						S0_W.par_itm_sub1.as("itm_sub1"),
						S0_W.par_itm_sub2.as("itm_sub2"),
						S0_W.par_itm_sub3.as("itm_sub3"),
						S0_W.par_lot_no.as("lot_no"),
						S0_W.par_sublot_no.as("sublot_no"),
						S0_W.par_sno1.as("sno1"),
						S0_W.par_sno2.as("sno2"),
						S0_W.par_sno3.as("sno3"),
						S0_W.par_sno4.as("sno4"),
						S0_T1.ver_no,
						S0_T1.bp_lot_no,
						S0_T1.stk_insp_typ,
						S0_T1.quality_typ,
						S0_T1.mfg_aprv_sts_typ,
						S0_W.lot_mng_typ,
						S0_W.sublot_mng_typ,
						S0_W.itm_cd.as("par_itm_cd"),
						S0_W.itm_sub1.as("par_itm_sub1"),
						S0_W.itm_sub2.as("par_itm_sub2"),
						S0_W.itm_sub3.as("par_itm_sub3"),
						S0_W.lot_no.as("par_lot_no"),
						S0_W.sublot_no.as("par_sublot_no"),
						S0_W.sno1.as("par_sno1"),
						S0_W.sno2.as("par_sno2"),
						S0_W.sno3.as("par_sno3"),
						S0_W.sno4.as("par_sno4"),
						S0_T1.lot_rmrks,
						S0_T1.lot_sub_char1,
						S0_T1.lot_sub_char2,
						S0_T1.lot_sub_char3,
						S0_T1.lot_sub_char4,
						S0_T1.lot_sub_char5,
						S0_T1.lot_sub_num1,
						S0_T1.lot_sub_num2,
						S0_T1.lot_sub_num3,
						S0_T1.lot_sub_num4,
						S0_T1.lot_sub_num5,
						S0_T1.lot_sub_dt1,
						S0_T1.lot_sub_dt2,
						S0_T1.lot_sub_dt3,
						S0_T1.lot_sub_dt4,
						S0_T1.lot_sub_dt5,
						S0_T1.lot_sub_flg1,
						S0_T1.lot_sub_flg2,
						S0_T1.lot_sub_flg3,
						S0_T1.lot_sub_flg4,
						S0_T1.lot_sub_flg5,
						S0_M1.th_image,
						S0_W.sort_no,
						S0_M1.stk_mng_typ
					)
					.from(
						S0_W
						.leftOuterJoin(S0_M1).on(
							S0_W.par_itm_cd.eq(S0_M1.itm_cd)
							.and(S0_W.par_itm_sub1.eq(S0_M1.itm_sub1))
							.and(S0_W.par_itm_sub2.eq(S0_M1.itm_sub2))
							.and(S0_W.par_itm_sub3.eq(S0_M1.itm_sub3))
						)
						.leftOuterJoin(S0_T1).on(
							S0_W.par_itm_cd.eq(S0_T1.itm_cd)
							.and(S0_W.par_itm_sub1.eq(S0_T1.itm_sub1))
							.and(S0_W.par_itm_sub2.eq(S0_T1.itm_sub2))
							.and(S0_W.par_itm_sub3.eq(S0_T1.itm_sub3))
							.and(S0_W.par_lot_no.eq(S0_T1.lot_no))
							.and(
								bracket(
									S0_T1.sublot_no.eq(value(MAC_STR.NULL_VAL.value()))
									.and(
										S0_M1.sublot_mng_typ.in(
											value(MAC_SUBLOT_MNG_TYP.NOT_MNG.value()),
											value(MAC_SUBLOT_MNG_TYP.STK.value())
										)
									)
								)
								.or(S0_W.par_sublot_no.eq(S0_T1.sublot_no))
							)
						)
					)
					.where(
						value(0).eq(value(0))
					)
					.orderBy(S0_W.sort_no.asc())
			);
	}
}