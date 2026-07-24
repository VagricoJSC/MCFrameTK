package mcframe.serverMSBE.MSBEL2420;

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
	 * -- MSBEL2420_MST_ACXFR_ACT_D_Query_S01
	 */
	static MCQueryPlan MSBEL2420_MST_ACXFR_ACT_D_S01() {
		MST_ACXFR_ACT_D_P_R S0_HST = MST_ACXFR_ACT_D_P_R.create("HST");
		MST_ACXFR_ACT_R S0_T01 = MST_ACXFR_ACT_R.create("T01");
		MST_ACXFR_INST_D_R S0_T02 = MST_ACXFR_INST_D_R.create("T02");
		MST_ACXFR_SCHD_R S0_T03 = MST_ACXFR_SCHD_R.create("T03");
		MSVT_LOT_LIST_R S0_T04 = MSVT_LOT_LIST_R.create("T04");
		MAM_ITM_R S0_M01 = MAM_ITM_R.create("M01");
		MAVM_ITM_UNIT_R S0_M16 = MAVM_ITM_UNIT_R.create("M16");
		MAM_UNIT_R S0_M04 = MAM_UNIT_R.create("M04");
		MAM_DPT_R S0_M06 = MAM_DPT_R.create("M06");
		MAM_SUNDRY_ITM_R S0_M18 = MAM_SUNDRY_ITM_R.create("M18");
		MAVM_RD_LOC_R S0_M19 = MAVM_RD_LOC_R.create("M19");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBEL2420_MST_ACXFR_ACT_D_Query_S01")
					.mainQuery()
					.select(
						nvl2(
							S0_HST.acxfr_inst_d_no,
							S0_T02.abort_flg,
							nvl2(
								S0_HST.acxfr_schd_no,
								S0_T03.abort_flg,
								value(false)
							)
						).as("abort_flg"),
						S0_HST.itm_cd,
						S0_HST.itm_sub1,
						S0_HST.itm_sub2,
						S0_HST.itm_sub3,
						decode(
							S0_M01.sundry_itm_flg,
							value(true),
							nvl(
								S0_M18.itm_nm,
								S0_M01.itm_nm
							),
							S0_M01.itm_nm
						).as("itm_nm"),
						S0_M01.sundry_itm_flg,
						S0_M01.not_new_lot_flg,
						S0_M01.ver_flg,
						S0_M01.lot_mng_typ,
						S0_M01.lot_no_typ,
						S0_M01.lot_no_ptn_cd,
						S0_M01.sublot_mng_typ,
						S0_M01.sublot_no_typ,
						S0_M01.sublot_no_ptn_cd,
						S0_M01.sno1_mng_typ,
						S0_M01.sno2_mng_typ,
						S0_M01.sno3_mng_typ,
						S0_M01.sno4_mng_typ,
						S0_HST.lot_no,
						S0_HST.sublot_no,
						nvl2(
							S0_HST.acxfr_inst_d_no,
							S0_T02.ver_no,
							S0_T04.ver_no
						).as("ver_no"),
						S0_HST.trd_unit_cd,
						S0_M16.dec_place.as("trd_unit_dec_place"),
						S0_M16.conv_base_qty.as("trd_unit_conv_base_qty"),
						S0_M16.conv_qty.as("trd_unit_conv_qty"),
						S0_HST.trd_unit_qty,
						S0_M01.unit_cd.as("base_unit_cd"),
						nullValue().as("base_unit_schd_qty"),
						S0_T02.base_unit_qty.as("base_unit_inst_qty"),
						S0_HST.base_unit_qty.as("base_unit_act_qty"),
						MAPA_STD_COST$F_GET_STD_UPRI(
							S0_HST.itm_cd,
							S0_HST.itm_sub1,
							S0_HST.itm_sub2,
							S0_HST.itm_sub3,
							S0_T01.ac_dt,
							S0_T01.wg_cd,
							value("1")
						).as("std_upri"),
						S0_M19.str_ln_tgt_flg,
						S0_HST.str_ln_cd,
						S0_HST.bd_dpt_cd,
						S0_M06.dpt_nm.as("bd_dpt_nm"),
						S0_HST.stk_arrv_bp_cd,
						S0_HST.quality_typ,
						S0_HST.stk_insp_typ,
						S0_HST.stk_id_typ,
						S0_HST.gd_cd,
						S0_HST.stk_bp_cd,
						S0_HST.sno1,
						S0_HST.sno2,
						S0_HST.sno3,
						S0_HST.sno4,
						S0_HST.fix_no_typ,
						S0_HST.fix_no,
						S0_HST.bd_loc_cd,
						S0_HST.bd_ctg_cd,
						S0_HST.bd_oper_cd,
						S0_HST.bd_bp_cd,
						S0_HST.bd_itm_cd,
						S0_HST.bd_itm_sub1,
						S0_HST.bd_itm_sub2,
						S0_HST.bd_itm_sub3,
						S0_HST.bd_lot_no,
						S0_HST.bd_sublot_no,
						S0_HST.bd_sno1,
						S0_HST.bd_sno2,
						S0_HST.bd_sno3,
						S0_HST.bd_sno4,
						S0_HST.rsn_cd,
						S0_HST.intr_d_rmrks,
						S0_HST.trd_d_rmrks,
						S0_T02.inst_d_rmrks,
						S0_HST.dspsl_no,
						S0_HST.sub_char1,
						S0_HST.sub_char2,
						S0_HST.sub_char3,
						S0_HST.acxfr_schd_no,
						S0_HST.acxfr_inst_d_no,
						S0_HST.acxfr_act_d_no,
						S0_HST.aprv_flg,
						S0_HST.aprv_no,
						S0_HST.disp_seq,
						S0_HST.acxfr_act_no,
						S0_HST.wms_flg,
						S0_HST.ext_sys_cd,
						S0_HST.ext_acxfr_act_no,
						S0_T02.trd_unit_qty.as("trd_inst_qty"),
						// this field is appended by sql coverter.
						S0_M01.itm_cd.as("join_itm_cd_"),
						// this field is appended by sql coverter.
						S0_M01.itm_sub1.as("join_itm_sub1_"),
						// this field is appended by sql coverter.
						S0_M01.itm_sub2.as("join_itm_sub2_"),
						// this field is appended by sql coverter.
						S0_M01.itm_sub3.as("join_itm_sub3_"),
						// this field is appended by sql coverter.
						S0_T01.loc_cd.as("join_loc_cd_")
					)
					.from(
						S0_HST
						.leftOuterJoin(S0_T01).on(
							bracket(
								S0_HST.acxfr_act_no.eq(S0_T01.acxfr_act_no)
							)
						)
						.leftOuterJoin(S0_T02).on(
							bracket(
								S0_HST.acxfr_inst_d_no.eq(S0_T02.acxfr_inst_d_no)
							)
						)
						.leftOuterJoin(S0_T03).on(
							bracket(
								S0_HST.acxfr_schd_no.eq(S0_T03.acxfr_schd_no)
							)
						)
						.leftOuterJoin(S0_T04).on(
							bracket(
								S0_HST.itm_cd.eq(S0_T04.itm_cd)
								.and(S0_HST.itm_sub1.eq(S0_T04.itm_sub1))
								.and(S0_HST.itm_sub2.eq(S0_T04.itm_sub2))
								.and(S0_HST.itm_sub3.eq(S0_T04.itm_sub3))
								.and(S0_HST.lot_no.eq(S0_T04.lot_no))
								.and(S0_HST.sublot_no.eq(S0_T04.sublot_no))
							)
						)
						.leftOuterJoin(S0_M01).on(
							bracket(
								S0_HST.itm_cd.eq(S0_M01.itm_cd)
								.and(S0_HST.itm_sub1.eq(S0_M01.itm_sub1))
								.and(S0_HST.itm_sub2.eq(S0_M01.itm_sub2))
								.and(S0_HST.itm_sub3.eq(S0_M01.itm_sub3))
							)
						)
						.leftOuterJoin(S0_M16).on(
							bracket(
								S0_HST.itm_cd.eq(S0_M16.itm_cd)
								.and(S0_HST.itm_sub1.eq(S0_M16.itm_sub1))
								.and(S0_HST.itm_sub2.eq(S0_M16.itm_sub2))
								.and(S0_HST.itm_sub3.eq(S0_M16.itm_sub3))
								.and(S0_HST.trd_unit_cd.eq(S0_M16.unit_cd))
							)
						)
						.leftOuterJoin(S0_M04).on(
							bracket(
								S0_M16.unit_cd.eq(S0_M04.unit_cd)
							)
						)
						.leftOuterJoin(S0_M06).on(
							bracket(
								S0_HST.bd_dpt_cd.eq(S0_M06.dpt_cd)
								.and(S0_T01.ac_dt.between(S0_M06.st_dt, S0_M06.end_dt))
							)
						)
						.leftOuterJoin(S0_M18).on(
							bracket(
								S0_HST.itm_cd.eq(S0_M18.itm_cd)
								.and(S0_HST.itm_sub1.eq(S0_M18.itm_sub1))
								.and(S0_HST.itm_sub2.eq(S0_M18.itm_sub2))
								.and(S0_HST.itm_sub3.eq(S0_M18.itm_sub3))
								.and(S0_HST.sno1.eq(S0_M18.sno1))
								.and(S0_HST.sno2.eq(S0_M18.sno2))
								.and(S0_HST.sno3.eq(S0_M18.sno3))
								.and(S0_HST.sno4.eq(S0_M18.sno4))
							)
						)
						.innerJoin(S0_M19).on(
							bracket(
								S0_T01.loc_cd.eq(S0_M19.loc_cd)
							)
						)
					)
					.where(
						value(0).eq(value(0))
						.and(S0_HST.acxfr_act_no.eq(bind("srch_tgt_no")))
						.and(S0_HST.acxfr_act_rev.eq(bind("acxfr_act_rev")))
						.and(S0_HST.can_flg.eq(value(false)))
					)
					.orderBy(S0_HST.disp_seq.asc())
			)
			.setJoinInfo(
				joinInfo(
					j -> j
						.add(MST_WRK_SNO_R.class, r -> toCondition(
							r.getStringNE("sno1")
						))
						.addSelect(m -> toArray(
							m.wrk_no
						))
						.addMap((r, m) -> {
							r.setStringNE("join_wrk_no_", m.wrk_no());
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
					}),
					j -> j
						.add(MAM_STR_LN_R.class, r -> toCondition(
							r.getStringNE("join_loc_cd_"),
							r.getStringNE("str_ln_cd")
						))
						.addSelect(m -> toArray(
							m.str_ln_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("str_ln_nm", m.str_ln_nm());
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
						.add(MAM_BP_R.class, r -> toCondition(
							r.getStringNE("bd_bp_cd")
						))
						.addSelect(m -> toArray(
							m.bp_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("bd_bp_nm", m.bp_nm());
					}),
					j -> j
						.add(MAM_ITM__R.class, r -> toCondition(
							r.getStringNE("bd_itm_cd"),
							r.getStringNE("bd_itm_sub1"),
							r.getStringNE("bd_itm_sub2"),
							r.getStringNE("bd_itm_sub3")
						))
						.addSelect(m -> toArray(
							m.itm_nm,
							m.lot_mng_typ,
							m.sno1_mng_typ,
							m.sno2_mng_typ,
							m.sno3_mng_typ,
							m.sno4_mng_typ,
							m.sublot_mng_typ
						))
						.addMap((r, m) -> {
							r.setStringNE("bd_itm_nm", m.itm_nm());
							r.setStringNE("bd_lot_mng_typ", m.lot_mng_typ());
							r.setStringNE("bd_sublot_mng_typ", m.sublot_mng_typ());
							r.setStringNE("bd_sno1_mng_typ", m.sno1_mng_typ());
							r.setStringNE("bd_sno2_mng_typ", m.sno2_mng_typ());
							r.setStringNE("bd_sno3_mng_typ", m.sno3_mng_typ());
							r.setStringNE("bd_sno4_mng_typ", m.sno4_mng_typ());
					}),
					j -> j
						.add(MAM_BIZ_RSN_R.class, r -> toCondition(
							r.getStringNE("rsn_cd")
						))
						.addSelect(m -> toArray(
							m.biz_rsn_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("rsn_nm", m.biz_rsn_nm());
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
	 * -- MSBEL2420_MST_ACXFR_ACT_Query_S01
	 */
	static MCQueryPlan MSBEL2420_MST_ACXFR_ACT_S01() {
		MST_ACXFR_ACT_R S0_T1 = MST_ACXFR_ACT_R.create("T1");
		MAVM_RD_LOC_R S0_M01 = MAVM_RD_LOC_R.create("M01");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBEL2420_MST_ACXFR_ACT_Query_S01")
					.mainQuery()
					.select(S0_T1.acxfr_act_rev)
					.from(
						S0_T1
						.innerJoin(S0_M01).on(
							bracket(
								S0_T1.loc_cd.eq(S0_M01.loc_cd)
							)
						)
					)
					.where(
						value(0).eq(value(0))
						.and(S0_T1.acxfr_act_no.eq(bind("srch_tgt_no")))
					)
			);
	}
	
	/**
	 * -- MSBEL2420_MST_ACXFR_ACT_Query_S02
	 */
	static MCQueryPlan MSBEL2420_MST_ACXFR_ACT_S02() {
		MST_ACXFR_ACT_P_R S0_HST = MST_ACXFR_ACT_P_R.create("HST");
		MST_ACXFR_ACT_R S0_T01 = MST_ACXFR_ACT_R.create("T01");
		MAVM_RD_LOC_R S0_M02 = MAVM_RD_LOC_R.create("M02");
		MAM_DPT_R S0_M05 = MAM_DPT_R.create("M05");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBEL2420_MST_ACXFR_ACT_Query_S02")
					.mainQuery()
					.select(
						S0_HST.acxfr_act_no,
						S0_HST.acxfr_act_rev,
						S0_HST.trd_cd,
						S0_HST.loc_cd,
						S0_M02.loc_nm,
						S0_M02.sppl_cd,
						S0_M02.str_ln_tgt_flg,
						S0_HST.wg_cd,
						S0_HST.acxfr_inst_no,
						trunc(
							S0_HST.acxfr_act_tm,
							MCDateFmt.DD
						).as("acxfr_act_dt"),
						S0_HST.acxfr_act_tm.as("acxfr_act_hm"),
						S0_HST.ac_dt.as("ac_dt"),
						S0_HST.act_usr_cd,
						S0_HST.act_dpt_cd,
						S0_M05.dpt_nm.as("act_dpt_nm"),
						S0_HST.intr_rmrks,
						S0_HST.trd_rmrks,
						S0_HST.sub_char1,
						S0_HST.sub_char2,
						S0_HST.sub_char3,
						S0_T01.upd_cntr.as("act_upd_cntr"),
						S0_HST.ins_usr_id,
						S0_HST.ins_usr_nm,
						S0_HST.ins_func_id,
						S0_HST.ins_ts,
						S0_HST.upd_usr_id,
						S0_HST.upd_usr_nm,
						S0_HST.upd_func_id,
						S0_HST.upd_ts,
						S0_HST.upd_srv_req_no
					)
					.from(
						S0_HST
						.innerJoin(S0_T01).on(
							bracket(
								S0_HST.acxfr_act_no.eq(S0_T01.acxfr_act_no)
							)
						)
						.innerJoin(S0_M02).on(
							bracket(
								S0_HST.loc_cd.eq(S0_M02.loc_cd)
							)
						)
						.leftOuterJoin(S0_M05).on(
							bracket(
								S0_HST.act_dpt_cd.eq(S0_M05.dpt_cd)
								.and(S0_HST.acxfr_act_tm.between(S0_M05.st_dt, S0_M05.end_dt))
							)
						)
					)
					.where(
						value(0).eq(value(0))
						.and(S0_HST.acxfr_act_no.eq(bind("srch_tgt_no")))
						.and(S0_HST.acxfr_act_rev.eq(bind("acxfr_act_rev")))
						.cutoff$and(S0_HST.can_flg.eq(bind("w_can_flg")))
					)
			)
			.setJoinInfo(
				joinInfo(
					j -> j
						.add(MST_ACXFR_INST_R.class, r -> toCondition(
							r.getStringNE("acxfr_inst_no")
						))
						.addSelect(m -> toArray(
							m.inst_rmrks,
							m.upd_cntr
						))
						.addMap((r, m) -> {
							r.setStringNE("inst_rmrks", m.inst_rmrks());
							r.setNumberNE("inst_upd_cntr", m.upd_cntr());
					}),
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
							r.getStringNE("wg_cd")
						))
						.addSelect(m -> toArray(
							m.wg_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("wg_nm", m.wg_nm());
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
	 * -- MSBEL2420_MST_ACXFR_INST_D_Query_S01
	 */
	static MCQueryPlan MSBEL2420_MST_ACXFR_INST_D_S01() {
		MST_ACXFR_INST_D_R S0_T01 = MST_ACXFR_INST_D_R.create("T01");
		MST_ACXFR_INST_R S0_T02 = MST_ACXFR_INST_R.create("T02");
		MAM_ITM_R S0_M01 = MAM_ITM_R.create("M01");
		MAM_SUNDRY_ITM_R S0_M02 = MAM_SUNDRY_ITM_R.create("M02");
		MAM_DPT_R S0_M08 = MAM_DPT_R.create("M08");
		MAVM_RD_LOC_R S0_M18 = MAVM_RD_LOC_R.create("M18");
		MST_ACXFR_ACT_D_R S1_W01 = MST_ACXFR_ACT_D_R.create("W01");
		MST_ACXFR_ACT_D_R S2_W01 = MST_ACXFR_ACT_D_R.create("W01");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBEL2420_MST_ACXFR_INST_D_Query_S01")
					.mainQuery()
					.select(
						S0_T01.pr_sts_typ,
						S0_T01.itm_cd,
						S0_T01.itm_sub1,
						S0_T01.itm_sub2,
						S0_T01.itm_sub3,
						decode(
							S0_M01.sundry_itm_flg,
							value(true),
							nvl(
								S0_M02.itm_nm,
								S0_M01.itm_nm
							),
							S0_M01.itm_nm
						).as("itm_nm"),
						S0_M01.sundry_itm_flg,
						S0_M01.not_new_lot_flg,
						S0_M01.ver_flg,
						S0_M01.lot_mng_typ,
						S0_M01.lot_no_typ,
						S0_M01.lot_no_ptn_cd,
						S0_M01.sublot_mng_typ,
						S0_M01.sublot_no_typ,
						S0_M01.sublot_no_ptn_cd,
						S0_M01.sno1_mng_typ,
						S0_M01.sno2_mng_typ,
						S0_M01.sno3_mng_typ,
						S0_M01.sno4_mng_typ,
						S0_T01.lot_no,
						S0_T01.sublot_no,
						S0_T01.ver_no,
						S0_T01.trd_unit_cd,
						S0_T01.trd_unit_qty,
						S0_M01.unit_cd.as("base_unit_cd"),
						cases()
							.when(
								S0_T01.acxfr_schd_no.eq(value(MAC_STR.NULL_VAL.value()))
								.or(S0_T01.acxfr_schd_no.isNull())
							)
								.then(value(0))
							.otherwise(S0_T01.base_unit_qty).as("base_unit_schd_qty"),
						S0_T01.base_unit_qty.as("base_unit_inst_qty"),
						cases()
							.when(
								notExists(
									subQuery()
									.select(value("X"))
									.from(S1_W01)
									.where(
										S0_T01.acxfr_inst_d_no.eq(S1_W01.acxfr_inst_d_no)
										.and(S1_W01.can_flg.eq(value(false)))
									)
								)
							)
								.then(value(0))
							.otherwise(
								subQuery()
								.select(sum(S2_W01.base_unit_qty))
								.from(S2_W01)
								.where(
									S0_T01.acxfr_inst_d_no.eq(S2_W01.acxfr_inst_d_no)
									.and(S2_W01.can_flg.eq(value(false)))
								)
							).as("base_unit_act_qty"),
						MAPA_STD_COST$F_GET_STD_UPRI(
							S0_T01.itm_cd,
							S0_T01.itm_sub1,
							S0_T01.itm_sub2,
							S0_T01.itm_sub3,
							S0_T02.acxfr_inst_dt,
							S0_T02.wg_cd,
							value("1")
						).as("std_upri"),
						S0_M18.str_ln_tgt_flg,
						S0_T01.str_ln_cd,
						S0_T01.bd_dpt_cd,
						S0_M08.dpt_nm.as("bd_dpt_nm"),
						S0_T01.stk_arrv_bp_cd,
						S0_T01.quality_typ,
						S0_T01.stk_insp_typ,
						S0_T01.stk_id_typ,
						S0_T01.gd_cd,
						S0_T01.stk_bp_cd,
						S0_T01.sno1,
						S0_T01.sno2,
						S0_T01.sno3,
						S0_T01.sno4,
						S0_T01.fix_no_typ,
						S0_T01.fix_no,
						S0_T01.bd_loc_cd,
						S0_T01.bd_ctg_cd,
						S0_T01.bd_oper_cd,
						S0_T01.bd_bp_cd,
						S0_T01.bd_itm_cd,
						S0_T01.bd_itm_sub1,
						S0_T01.bd_itm_sub2,
						S0_T01.bd_itm_sub3,
						S0_T01.bd_lot_no,
						S0_T01.bd_sublot_no,
						S0_T01.bd_sno1,
						S0_T01.bd_sno2,
						S0_T01.bd_sno3,
						S0_T01.bd_sno4,
						S0_T01.rsn_cd,
						S0_T01.intr_d_rmrks,
						S0_T01.trd_d_rmrks,
						S0_T01.inst_d_rmrks,
						S0_T01.dspsl_no,
						S0_T01.acxfr_schd_no,
						S0_T01.acxfr_inst_d_no,
						S0_T01.aprv_flg,
						S0_T01.aprv_no,
						S0_T01.disp_seq,
						// this field is appended by sql coverter.
						S0_M01.itm_cd.as("join_itm_cd_"),
						// this field is appended by sql coverter.
						S0_M01.itm_sub1.as("join_itm_sub1_"),
						// this field is appended by sql coverter.
						S0_M01.itm_sub2.as("join_itm_sub2_"),
						// this field is appended by sql coverter.
						S0_M01.itm_sub3.as("join_itm_sub3_"),
						// this field is appended by sql coverter.
						S0_T02.loc_cd.as("join_loc_cd_")
					)
					.from(
						S0_T01
						.innerJoin(S0_T02).on(
							bracket(
								S0_T01.acxfr_inst_no.eq(S0_T02.acxfr_inst_no)
							)
						)
						.leftOuterJoin(S0_M01).on(
							bracket(
								S0_T01.itm_cd.eq(S0_M01.itm_cd)
								.and(S0_T01.itm_sub1.eq(S0_M01.itm_sub1))
								.and(S0_T01.itm_sub2.eq(S0_M01.itm_sub2))
								.and(S0_T01.itm_sub3.eq(S0_M01.itm_sub3))
							)
						)
						.leftOuterJoin(S0_M02).on(
							bracket(
								S0_T01.itm_cd.eq(S0_M02.itm_cd)
								.and(S0_T01.itm_sub1.eq(S0_M02.itm_sub1))
								.and(S0_T01.itm_sub2.eq(S0_M02.itm_sub2))
								.and(S0_T01.itm_sub3.eq(S0_M02.itm_sub3))
								.and(S0_T01.sno1.eq(S0_M02.sno1))
								.and(S0_T01.sno2.eq(S0_M02.sno2))
								.and(S0_T01.sno3.eq(S0_M02.sno3))
								.and(S0_T01.sno4.eq(S0_M02.sno4))
							)
						)
						.leftOuterJoin(S0_M08).on(
							bracket(
								S0_T01.bd_dpt_cd.eq(S0_M08.dpt_cd)
								.and(S0_T02.acxfr_inst_dt.between(S0_M08.st_dt, S0_M08.end_dt))
							)
						)
						.innerJoin(S0_M18).on(
							bracket(
								S0_T02.loc_cd.eq(S0_M18.loc_cd)
							)
						)
					)
					.where(
						value(0).eq(value(0))
						.and(S0_T01.acxfr_inst_no.eq(bind("srch_tgt_no")))
						.and(MSC_PR_STS_TYP$IS_COMP(S0_T01.pr_sts_typ).eq(value(false)))
						.and(S0_T01.abort_flg.eq(value(false)))
					)
					.orderBy(S0_T01.disp_seq.asc())
			)
			.setJoinInfo(
				joinInfo(
					j -> j
						.add(MST_ACXFR_SCHD_R.class, r -> toCondition(
							r.getStringNE("acxfr_schd_no")
						))
						.addSelect(m -> toArray(
							m.upd_cntr
						))
						.addMap((r, m) -> {
							r.setNumberNE("schd_upd_cntr", m.upd_cntr());
					}),
					j -> j
						.add(MST_WRK_SNO_R.class, r -> toCondition(
							r.getStringNE("sno1")
						))
						.addSelect(m -> toArray(
							m.wrk_no
						))
						.addMap((r, m) -> {
							r.setStringNE("join_wrk_no_", m.wrk_no());
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
							r.setNumberNE("trd_unit_dec_place", m.dec_place());
							r.setStringNE("trd_unit_rnd_typ", m.rnd_typ());
							r.setNumberNE("trd_unit_conv_base_qty", m.conv_base_qty());
							r.setNumberNE("trd_unit_conv_qty", m.conv_qty());
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
					}),
					j -> j
						.add(MAM_STR_LN_R.class, r -> toCondition(
							r.getStringNE("join_loc_cd_"),
							r.getStringNE("str_ln_cd")
						))
						.addSelect(m -> toArray(
							m.str_ln_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("str_ln_nm", m.str_ln_nm());
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
						.add(MAM_BP_R.class, r -> toCondition(
							r.getStringNE("bd_bp_cd")
						))
						.addSelect(m -> toArray(
							m.bp_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("bd_bp_nm", m.bp_nm());
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
							m.sno1_mng_typ,
							m.sno2_mng_typ,
							m.sno3_mng_typ,
							m.sno4_mng_typ,
							m.sublot_mng_typ
						))
						.addMap((r, m) -> {
							r.setStringNE("bd_itm_nm", m.itm_nm());
							r.setStringNE("bd_lot_mng_typ", m.lot_mng_typ());
							r.setStringNE("bd_sublot_mng_typ", m.sublot_mng_typ());
							r.setStringNE("bd_sno1_mng_typ", m.sno1_mng_typ());
							r.setStringNE("bd_sno2_mng_typ", m.sno2_mng_typ());
							r.setStringNE("bd_sno3_mng_typ", m.sno3_mng_typ());
							r.setStringNE("bd_sno4_mng_typ", m.sno4_mng_typ());
					}),
					j -> j
						.add(MAM_BIZ_RSN_R.class, r -> toCondition(
							r.getStringNE("rsn_cd")
						))
						.addSelect(m -> toArray(
							m.biz_rsn_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("rsn_nm", m.biz_rsn_nm());
					})
				)
			);
	}
	
	/**
	 * -- MSBEL2420_MST_ACXFR_INST_Query_S01
	 */
	static MCQueryPlan MSBEL2420_MST_ACXFR_INST_S01() {
		MST_ACXFR_INST_R S0_T01 = MST_ACXFR_INST_R.create("T01");
		MAVM_RD_LOC_R S0_M02 = MAVM_RD_LOC_R.create("M02");
		MST_ACXFR_ACT_R S1_T12 = MST_ACXFR_ACT_R.create("T12");
		MST_ACXFR_ACT_R S2_T12 = MST_ACXFR_ACT_R.create("T12");
		MST_ACXFR_INST_D_R S2_T13 = MST_ACXFR_INST_D_R.create("T13");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBEL2420_MST_ACXFR_INST_Query_S01")
					.mainQuery()
					.select(
						S0_T01.trd_cd,
						S0_T01.loc_cd,
						S0_M02.loc_nm,
						S0_M02.lg_grp_cd,
						S0_M02.str_ln_tgt_flg,
						S0_M02.sppl_cd,
						S0_T01.wg_cd,
						S0_T01.acxfr_inst_no,
						S0_T01.intr_rmrks,
						S0_T01.trd_rmrks,
						S0_T01.inst_rmrks,
						S0_T01.ins_usr_id,
						S0_T01.ins_usr_nm,
						S0_T01.ins_func_id,
						S0_T01.ins_ts,
						S0_T01.upd_cntr.as("inst_upd_cntr"),
						S0_T01.upd_usr_id,
						S0_T01.upd_usr_nm,
						S0_T01.upd_func_id,
						S0_T01.upd_ts,
						S0_T01.upd_srv_req_no
					)
					.from(
						S0_T01
						.innerJoin(S0_M02).on(
							bracket(
								S0_T01.loc_cd.eq(S0_M02.loc_cd)
							)
						)
					)
					.where(
						value(0).eq(value(0))
						.and(S0_T01.acxfr_inst_no.eq(bind("srch_tgt_no")))
						.and(
							notExists(
								subQuery()
								.select(value("X"))
								.from(S1_T12)
								.where(
									S1_T12.acxfr_inst_no.eq(bind("srch_tgt_no"))
								)
							)
							.or(
								exists(
									subQuery()
									.select(value("X"))
									.from(
										S2_T12
										.innerJoin(S2_T13).on(
											bracket(
												S2_T12.acxfr_inst_no.eq(S2_T13.acxfr_inst_no)
												.and(S2_T12.acxfr_inst_no.eq(bind("srch_tgt_no")))
											)
										)
									)
									.where(
										value(0).eq(value(0))
										.and(S2_T13.abort_flg.eq(value(false)))
										.and(MSC_PR_STS_TYP$IS_COMP(S2_T13.pr_sts_typ).eq(value(false)))
									)
								)
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
							r.getStringNE("wg_cd")
						))
						.addSelect(m -> toArray(
							m.wg_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("wg_nm", m.wg_nm());
					})
				)
			);
	}
}