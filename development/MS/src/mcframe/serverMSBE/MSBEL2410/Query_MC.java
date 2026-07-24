package mcframe.serverMSBE.MSBEL2410;

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
	
	/*
	 * MSBEL2410_MST_ACXFR_INST_D_S01
	 */
	static MCQueryPlan MSBEL2410_MST_ACXFR_INST_D_S01() {
		MST_ACXFR_INST_D_R S0_T01 = MST_ACXFR_INST_D_R.create("T01");
		MST_ACXFR_INST_R S0_T02 = MST_ACXFR_INST_R.create("T02");
		MAM_ITM_R S0_M01 = MAM_ITM_R.create("M01");
		MAVM_ITM_UNIT_R S0_M16 = MAVM_ITM_UNIT_R.create("M16");
		MAM_UNIT_R S0_M04 = MAM_UNIT_R.create("M04");
		MAM_DPT_R S0_M06 = MAM_DPT_R.create("M06");
		MAM_SUNDRY_ITM_R S0_M18 = MAM_SUNDRY_ITM_R.create("M18");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBEL2410_MST_ACXFR_INST_D_Query_S01")
					.mainQuery()
					.select(
						S0_T01.abort_flg,
						S0_T01.pr_sts_typ,
						S0_T01.itm_cd,
						S0_T01.itm_sub1,
						S0_T01.itm_sub2,
						S0_T01.itm_sub3,
						nvl(
							S0_M18.itm_nm,
							S0_M01.itm_nm
						).as("itm_nm"),
						S0_M01.sundry_itm_flg,
						S0_M01.lot_mng_typ,
						S0_M01.sublot_mng_typ,
						S0_M01.sno1_mng_typ,
						S0_M01.sno2_mng_typ,
						S0_M01.sno3_mng_typ,
						S0_M01.sno4_mng_typ,
						S0_M01.ver_flg,
						S0_T01.no_lot_fix_flg,
						S0_T01.lot_no,
						S0_T01.sublot_no,
						S0_T01.ver_no,
						S0_T01.trd_unit_cd,
						S0_M16.dec_place.as("trd_unit_dec_place"),
						S0_M16.rnd_typ.as("trd_unit_rnd_typ"),
						S0_M16.conv_base_qty.as("trd_unit_conv_base_qty"),
						S0_M16.conv_qty.as("trd_unit_conv_qty"),
						S0_T01.trd_unit_qty,
						S0_M01.unit_cd.as("base_unit_cd"),
						MAPA_STD_COST$F_GET_STD_UPRI(
							S0_T01.itm_cd,
							S0_T01.itm_sub1,
							S0_T01.itm_sub2,
							S0_T01.itm_sub3,
							S0_T02.acxfr_inst_dt,
							S0_T02.wg_cd,
							value("1")
						).as("std_upri"),
						S0_T01.str_ln_cd,
						S0_T01.bd_dpt_cd,
						S0_M06.dpt_nm.as("bd_dpt_nm"),
						S0_T01.stk_arrv_bp_cd,
						S0_T01.quality_typ,
						S0_T01.stk_insp_typ,
						S0_T01.stk_id_typ,
						S0_T01.gd_cd,
						S0_T01.acxfr_schd_dt,
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
						S0_T01.sub_char1,
						S0_T01.sub_char2,
						S0_T01.sub_char3,
						S0_T01.alloc_flg,
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
						.leftOuterJoin(S0_M16).on(
							bracket(
								S0_T01.itm_cd.eq(S0_M16.itm_cd)
								.and(S0_T01.itm_sub1.eq(S0_M16.itm_sub1))
								.and(S0_T01.itm_sub2.eq(S0_M16.itm_sub2))
								.and(S0_T01.itm_sub3.eq(S0_M16.itm_sub3))
								.and(S0_T01.trd_unit_cd.eq(S0_M16.unit_cd))
							)
						)
						.leftOuterJoin(S0_M04).on(
							bracket(
								S0_M16.unit_cd.eq(S0_M04.unit_cd)
							)
						)
						.leftOuterJoin(S0_M06).on(
							bracket(
								S0_T01.bd_dpt_cd.eq(S0_M06.dpt_cd)
								.and(S0_T02.acxfr_inst_dt.between(S0_M06.st_dt, S0_M06.end_dt))
							)
						)
						.leftOuterJoin(S0_M18).on(
							bracket(
								S0_T01.itm_cd.eq(S0_M18.itm_cd)
								.and(S0_T01.itm_sub1.eq(S0_M18.itm_sub1))
								.and(S0_T01.itm_sub2.eq(S0_M18.itm_sub2))
								.and(S0_T01.itm_sub3.eq(S0_M18.itm_sub3))
								.and(S0_T01.sno1.eq(S0_M18.sno1))
								.and(S0_T01.sno2.eq(S0_M18.sno2))
								.and(S0_T01.sno3.eq(S0_M18.sno3))
								.and(S0_T01.sno4.eq(S0_M18.sno4))
							)
						)
					)
					.where(
						value(0).eq(value(0))
						.and(S0_T01.acxfr_inst_no.eq(bind("acxfr_inst_no")))
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
					}),
					j -> j
						.add(MAM_LOC_R.class, r -> toCondition(
							r.getStringNE("join_loc_cd_")
						))
						.addSelect(m -> toArray(
							m.str_ln_tgt_flg
						))
						.addMap((r, m) -> {
							r.setBooleanNE("str_ln_tgt_flg", m.str_ln_tgt_flg());
					})
				)
			);
	}
	
	/**
	 * -- MSBEL2410_MST_ACXFR_INST_Query_S01
	 */
	static MCQueryPlan MSBEL2410_MST_ACXFR_INST_S01() {
		MST_ACXFR_INST_R S0_T01 = MST_ACXFR_INST_R.create("T01");
		MAVM_RD_LOC_R S0_M01 = MAVM_RD_LOC_R.create("M01");
		MAM_DPT_R S0_M05 = MAM_DPT_R.create("M05");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBEL2410_MST_ACXFR_INST_Query_S01")
					.mainQuery()
					.select(
						S0_T01.acxfr_inst_no,
						S0_T01.trd_cd,
						S0_T01.loc_cd,
						S0_M01.loc_nm,
						S0_M01.sppl_cd,
						S0_M01.str_ln_tgt_flg,
						S0_T01.wg_cd,
						S0_T01.acxfr_inst_dt,
						S0_T01.inst_usr_cd,
						S0_T01.inst_dpt_cd,
						S0_M05.dpt_nm.as("inst_dpt_nm"),
						S0_T01.intr_rmrks,
						S0_T01.trd_rmrks,
						S0_T01.inst_rmrks,
						S0_T01.sub_char1,
						S0_T01.sub_char2,
						S0_T01.sub_char3,
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
						.innerJoin(S0_M01).on(
							bracket(
								S0_T01.loc_cd.eq(S0_M01.loc_cd)
							)
						)
						.leftOuterJoin(S0_M05).on(
							bracket(
								S0_T01.inst_dpt_cd.eq(S0_M05.dpt_cd)
								.and(S0_T01.acxfr_inst_dt.between(S0_M05.st_dt, S0_M05.end_dt))
							)
						)
					)
					.where(
						value(0).eq(value(0))
						.and(S0_T01.acxfr_inst_no.eq(bind("acxfr_inst_no")))
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
}