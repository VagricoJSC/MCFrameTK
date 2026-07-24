package mcframe.serverMSBE.MSBEL2520;

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
	 * -- MSBEL2520_MST_STK_XFR_ACT_D_Query_S01
	 */
	static MCQueryPlan MSBEL2520_MST_STK_XFR_ACT_D_S01() {
		MCTempView S0_T1 = createTempView("T1");
		MAM_ITM_R S0_M1 = MAM_ITM_R.create("M1");
		MAVM_RD_LOC_R S0_M12 = MAVM_RD_LOC_R.create("M12");
		MAM_SUNDRY_ITM_R S0_M13 = MAM_SUNDRY_ITM_R.create("M13");
		MST_STK_XFR_ACT_R S1_T01 = MST_STK_XFR_ACT_R.create("T01");
		MST_STK_XFR_ACT_D_R S1_T02 = MST_STK_XFR_ACT_D_R.create("T02");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBEL2520_MST_STK_XFR_ACT_D_Query_S01")
					.mainQuery()
					.select(
						S0_T1.pr("stk_xfr_act_d_no"),
						S0_T1.pr("stk_xfr_act_no"),
						S0_T1.pr("io_typ"),
						S0_T1.pr("itm_cd"),
						S0_T1.pr("itm_sub1"),
						S0_T1.pr("itm_sub2"),
						S0_T1.pr("itm_sub3"),
						nvl(
							S0_M13.itm_nm,
							S0_M1.itm_nm
						).as("itm_nm"),
						S0_M1.sundry_itm_flg,
						S0_M1.not_new_lot_flg,
						S0_M1.lot_mng_typ,
						S0_M1.lot_no_typ,
						S0_M1.sublot_mng_typ,
						S0_M1.sublot_no_typ,
						S0_M1.lot_no_ptn_cd,
						S0_M1.sublot_no_ptn_cd,
						S0_T1.pr("sno1_mng_typ"),
						S0_T1.pr("sno2_mng_typ"),
						S0_T1.pr("sno3_mng_typ"),
						S0_T1.pr("sno4_mng_typ"),
						S0_M1.cont_fctr_flg,
						S0_M1.stk_mng_typ,
						cases()
							.when(S0_M1.not_new_lot_flg.eq(value(true)))
								.then(value(false))
							.otherwise(value(true)).as("crt_lot_flg"),
						S0_T1.pr("lot_no"),
						S0_T1.pr("sublot_no"),
						S0_T1.pr("trd_unit_cd"),
						S0_T1.pr("trd_unit_qty"),
						S0_T1.pr("base_unit_cd"),
						S0_T1.pr("base_unit_qty"),
						S0_T1.pr("str_ln_cd"),
						S0_T1.pr("fix_no_typ"),
						S0_T1.pr("fix_no"),
						S0_T1.pr("stk_arrv_bp_cd"),
						S0_T1.pr("quality_typ"),
						S0_T1.pr("stk_insp_typ"),
						S0_T1.pr("stk_id_typ"),
						S0_T1.pr("gd_cd"),
						S0_T1.pr("stk_bp_cd"),
						S0_T1.pr("sno1"),
						S0_T1.pr("sno2"),
						S0_T1.pr("sno3"),
						S0_T1.pr("sno4"),
						S0_M1.std_cont_fctr,
						S0_M1.cont_fctr_unit_cd,
						S0_M1.cont_fctr_rnd_typ,
						S0_M1.cont_fctr_dec_place,
						S0_T1.pr("intr_d_rmrks"),
						S0_T1.pr("trd_d_rmrks"),
						S0_T1.pr("sub_char1"),
						S0_T1.pr("sub_char2"),
						S0_T1.pr("sub_char3"),
						S0_T1.pr("disp_seq"),
						// this field is appended by sql coverter.
						S0_T1.pr(S1_T01.loc_cd).as("join_loc_cd_")
					)
					.from(
						subQuery()
						.select(
							S1_T02.prAll(),
							S1_T01.loc_cd
						)
						.from(
							S1_T01
							.innerJoin(S1_T02).on(S1_T01.stk_xfr_act_no.eq(S1_T02.stk_xfr_act_no))
						).view(S0_T1)
						.leftOuterJoin(S0_M1).on(
							bracket(
								S0_T1.pr("itm_cd").eq(S0_M1.itm_cd)
								.and(S0_T1.pr("itm_sub1").eq(S0_M1.itm_sub1))
								.and(S0_T1.pr("itm_sub2").eq(S0_M1.itm_sub2))
								.and(S0_T1.pr("itm_sub3").eq(S0_M1.itm_sub3))
							)
						)
						.innerJoin(S0_M12).on(S0_T1.pr(S1_T01.loc_cd).eq(S0_M12.loc_cd))
						.leftOuterJoin(S0_M13).on(
							bracket(
								S0_T1.pr("itm_cd").eq(S0_M13.itm_cd)
								.and(S0_T1.pr("itm_sub1").eq(S0_M13.itm_sub1))
								.and(S0_T1.pr("itm_sub2").eq(S0_M13.itm_sub2))
								.and(S0_T1.pr("itm_sub3").eq(S0_M13.itm_sub3))
								.and(S0_T1.pr("sno1").eq(S0_M13.sno1))
								.and(S0_T1.pr("sno2").eq(S0_M13.sno2))
								.and(S0_T1.pr("sno3").eq(S0_M13.sno3))
								.and(S0_T1.pr("sno4").eq(S0_M13.sno4))
							)
						)
					)
					.where(
						value(0).eq(value(0))
						.and(S0_T1.pr("io_typ").eq(bind("io_typ")))
						.cutoff$and(S0_T1.pr("stk_xfr_act_no").eq(bind("stk_xfr_act_no")))
					)
					.orderBy(S0_T1.pr("disp_seq").asc())
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
							r.setStringNE("wrk_no", m.wrk_no());
					}),
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
							r.setStringNE("base_unit_conv_rnd_typ", m.rnd_typ());
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
						.add(MST_WRK_R.class, r -> toCondition(
							r.getStringNE("wrk_no")
						))
						.addSelect(m -> toArray(
							m.wrk_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("wrk_nm", m.wrk_nm());
					})
				)
			);
	}
	
	/**
	 * -- MSBEL2520_MST_STK_XFR_ACT_Query_S01
	 */
	static MCQueryPlan MSBEL2520_MST_STK_XFR_ACT_S01() {
		MST_STK_XFR_ACT_R S0_T1 = MST_STK_XFR_ACT_R.create("T1");
		MAM_DPT_R S0_M4 = MAM_DPT_R.create("M4");
		MAVM_RD_LOC_R S0_M7 = MAVM_RD_LOC_R.create("M7");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBEL2520_MST_STK_XFR_ACT_Query_S01")
					.mainQuery()
					.select(
						S0_T1.stk_xfr_act_no,
						S0_T1.trd_cd,
						S0_T1.trd_ptn_typ,
						S0_T1.loc_cd,
						S0_T1.stk_xfr_act_tm.as("stk_xfr_act_dt"),
						S0_T1.stk_xfr_act_tm,
						S0_T1.ac_dt,
						S0_T1.ac_dt.as("old_ac_dt"),
						S0_T1.act_dpt_cd,
						S0_M4.dpt_nm.as("act_dpt_nm"),
						S0_T1.act_usr_cd,
						S0_T1.stk_xfr_rsn_cd,
						S0_T1.intr_rmrks,
						S0_T1.trd_rmrks,
						S0_T1.sub_char1,
						S0_T1.sub_char2,
						S0_T1.sub_char3,
						S0_T1.upd_cntr,
						S0_T1.ins_usr_id,
						S0_T1.ins_usr_nm,
						S0_T1.ins_func_id,
						S0_T1.ins_ts,
						S0_T1.upd_usr_id,
						S0_T1.upd_usr_nm,
						S0_T1.upd_func_id,
						S0_T1.upd_ts,
						S0_T1.upd_srv_req_no
					)
					.from(
						S0_T1
						.leftOuterJoin(S0_M4).on(
							bracket(
								S0_T1.act_dpt_cd.eq(S0_M4.dpt_cd)
								.and(S0_T1.ac_dt.between(S0_M4.st_dt, S0_M4.end_dt))
							)
						)
						.innerJoin(S0_M7).on(S0_T1.loc_cd.eq(S0_M7.loc_cd))
					)
					.where(
						value(0).eq(value(0))
						.cutoff$and(S0_T1.stk_xfr_act_no.eq(bind("stk_xfr_act_no")))
					)
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
						.add(MAM_LOC_R.class, r -> toCondition(
							r.getStringNE("loc_cd")
						))
						.addSelect(m -> toArray(
							m.loc_nm,
							m.sppl_cd,
							m.str_ln_tgt_flg,
							m.wg_cd
						))
						.addMap((r, m) -> {
							r.setStringNE("loc_nm", m.loc_nm());
							r.setStringNE("sppl_cd", m.sppl_cd());
							r.setBooleanNE("str_ln_tgt_flg", m.str_ln_tgt_flg());
							r.setStringNE("wg_cd", m.wg_cd());
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
					}),
					j -> j
						.add(MAM_BIZ_RSN_R.class, r -> toCondition(
							r.getStringNE("stk_xfr_rsn_cd")
						))
						.addSelect(m -> toArray(
							m.biz_rsn_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("stk_xfr_rsn_nm", m.biz_rsn_nm());
					})
				)
			);
	}
}