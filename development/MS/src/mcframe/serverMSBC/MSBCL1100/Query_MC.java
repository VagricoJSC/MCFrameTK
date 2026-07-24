package mcframe.serverMSBC.MSBCL1100;

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
	 * -- MSBCL1100_MAM_LOSS_RSN_Query_S01
	 */
	static MCQueryPlan MSBCL1100_MAM_LOSS_RSN_S01() {
		MSW_INPT_ACT_REM_KEY_R S0_KEY = MSW_INPT_ACT_REM_KEY_R.create("KEY");
		MST_INPT_ACT_REM_R S0_T2 = MST_INPT_ACT_REM_R.create("T2");
		MST_INPT_SCHD_R S0_T1 = MST_INPT_SCHD_R.create("T1");
		MST_INPT_ACT_R S0_T4 = MST_INPT_ACT_R.create("T4");
		MAM_ITM_R S0_M1 = MAM_ITM_R.create("M1");
		MAM_LOSS_RSN_R S0_M2 = MAM_LOSS_RSN_R.create("M2");
		MST_LOSS_ACT_R S1_T3 = MST_LOSS_ACT_R.create("T3");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBCL1100_MAM_LOSS_RSN_Query_S01")
					.mainQuery()
					.select(
						S0_M2.itm_typ,
						S0_M2.itm_typ_d_cd,
						S0_M2.loss_rsn_cd,
						S0_M2.def_disp_flg,
						S0_M2.memo1,
						S0_M2.memo2,
						S0_M2.memo3,
						S0_T1.inpt_schd_no,
						S0_T4.inpt_act_no
					)
					.from(
						S0_KEY
						.innerJoin(S0_T2).on(
							bracket(
								S0_T2.inpt_schd_no.eq(S0_KEY.inpt_schd_no)
								.and(S0_T2.div_seq.eq(S0_KEY.div_seq))
							)
						)
						.innerJoin(S0_T1).on(
							bracket(
								S0_T1.inpt_schd_no.eq(S0_T2.inpt_schd_no)
							)
						)
						.leftOuterJoin(S0_T4).on(
							bracket(
								S0_T2.inpt_schd_no.eq(S0_T4.inpt_schd_no)
								.and(S0_T2.div_seq.eq(S0_T4.div_seq))
							)
						)
						.innerJoin(S0_M1).on(
							bracket(
								S0_T1.itm_cd.eq(S0_M1.itm_cd)
								.and(S0_T1.itm_sub1.eq(S0_M1.itm_sub1))
								.and(S0_T1.itm_sub2.eq(S0_M1.itm_sub2))
								.and(S0_T1.itm_sub3.eq(S0_M1.itm_sub3))
							)
						)
						.innerJoin(S0_M2).on(
							bracket(
								S0_M1.itm_typ.eq(S0_M2.itm_typ)
								.and(S0_M1.itm_typ_d_cd.eq(S0_M2.itm_typ_d_cd))
							)
						)
					)
					.where(
						value(0).eq(value(0))
						.and(S0_M2.del_flg.eq(value(false)))
						.and(
							notExists(
								subQuery()
								.select(value("X"))
								.from(S1_T3)
								.where(
									S0_T4.inpt_act_no.eq(S1_T3.inpt_act_no)
									.and(S0_M2.loss_rsn_cd.eq(S1_T3.loss_rsn_cd))
								)
							)
						)
					)
			)
			.setJoinInfo(
				joinInfo(
					j -> j
						.add(MAM_BIZ_RSN_R.class, r -> toCondition(
							r.getStringNE("loss_rsn_cd")
						))
						.addSelect(m -> toArray(
							m.biz_rsn_nm,
							m.fxd_loss_flg
						))
						.addMap((r, m) -> {
							r.setStringNE("loss_rsn_nm", m.biz_rsn_nm());
							r.setBooleanNE("fxd_loss_flg", m.fxd_loss_flg());
					})
				)
			);
	}
	
	/**
	 * -- MSBCL1100_MAM_LOSS_RSN_Query_S02
	 */
	static MCQueryPlan MSBCL1100_MAM_LOSS_RSN_S02() {
		MST_INPT_ACT_R S0_T1 = MST_INPT_ACT_R.create("T1");
		MAM_ITM_R S0_M1 = MAM_ITM_R.create("M1");
		MAM_LOSS_RSN_R S0_M2 = MAM_LOSS_RSN_R.create("M2");
		MST_LOSS_ACT_R S1_T3 = MST_LOSS_ACT_R.create("T3");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBCL1100_MAM_LOSS_RSN_Query_S02")
					.mainQuery()
					.select(
						S0_T1.inpt_act_no,
						S0_M2.itm_typ,
						S0_M2.itm_typ_d_cd,
						S0_M2.loss_rsn_cd,
						S0_M2.def_disp_flg,
						S0_M2.memo1,
						S0_M2.memo2,
						S0_M2.memo3
					)
					.from(
						S0_T1
						.innerJoin(S0_M1).on(
							bracket(
								S0_T1.itm_cd.eq(S0_M1.itm_cd)
								.and(S0_T1.itm_sub1.eq(S0_M1.itm_sub1))
								.and(S0_T1.itm_sub2.eq(S0_M1.itm_sub2))
								.and(S0_T1.itm_sub3.eq(S0_M1.itm_sub3))
							)
						)
						.innerJoin(S0_M2).on(
							bracket(
								S0_M1.itm_typ.eq(S0_M2.itm_typ)
								.and(S0_M1.itm_typ_d_cd.eq(S0_M2.itm_typ_d_cd))
							)
						)
					)
					.where(
						S0_T1.mfg_act_no.eq(bind("mfg_act_no"))
						.and(S0_T1.inpt_schd_no.isNull())
						.and(S0_M2.del_flg.eq(value(false)))
						.and(
							notExists(
								subQuery()
								.select(value("X"))
								.from(S1_T3)
								.where(
									S0_T1.inpt_act_no.eq(S1_T3.inpt_act_no)
									.and(S0_M2.loss_rsn_cd.eq(S1_T3.loss_rsn_cd))
								)
							)
						)
					)
			)
			.setJoinInfo(
				joinInfo(
					j -> j
						.add(MAM_BIZ_RSN_R.class, r -> toCondition(
							r.getStringNE("loss_rsn_cd")
						))
						.addSelect(m -> toArray(
							m.biz_rsn_nm,
							m.fxd_loss_flg
						))
						.addMap((r, m) -> {
							r.setStringNE("loss_rsn_nm", m.biz_rsn_nm());
							r.setBooleanNE("fxd_loss_flg", m.fxd_loss_flg());
					})
				)
			);
	}
	
	/**
	 * -- MSBCL1100_MST_ARR_ACT_Query_S01
	 */
	static MCQueryPlan MSBCL1100_MST_ARR_ACT_S01() {
		MST_ARR_SCHD_R S0_T1 = MST_ARR_SCHD_R.create("T1");
		MST_ARR_ACT_R S0_T2 = MST_ARR_ACT_R.create("T2");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBCL1100_MST_ARR_ACT_Query_S01")
					.mainQuery()
					.select(
						S0_T2.arr_act_no,
						S0_T2.lot_no,
						S0_T2.sublot_no,
						trunc(
							S0_T2.arr_tm,
							MCDateFmt.DD
						).as("arr_dt"),
						S0_T2.arr_tm.as("arr_hm"),
						S0_T2.trd_unit_qty.as("trd_unit_arr_qty"),
						S0_T2.trd_unit_cd,
						S0_T2.base_unit_cd,
						S0_T2.base_unit_qty.as("base_unit_arr_qty"),
						// this field is appended by sql coverter.
						S0_T1.trd_unit_cd.as("join_trd_unit_cd_"),
						// this field is appended by sql coverter.
						S0_T1.base_unit_cd.as("join_base_unit_cd_")
					)
					.from(
						S0_T1
						.innerJoin(S0_T2).on(
							bracket(
								S0_T1.arr_schd_no.eq(S0_T2.arr_schd_no)
							)
						)
					)
					.where(
						value(0).eq(value(0))
						.and(S0_T1.mfg_inst_no.eq(bind("srch_tgt_no")))
						.and(S0_T2.can_flg.eq(value(false)))
					)
			)
			.setJoinInfo(
				joinInfo(
					j -> j
						.add(MAM_UNIT_R.class, r -> toCondition(
							r.getStringNE("join_trd_unit_cd_")
						))
						.addSelect(m -> toArray(
							m.dec_place,
							m.unit_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("trd_unit_nm", m.unit_nm());
							r.setNumberNE("trd_unit_dec_place", m.dec_place());
					}),
					j -> j
						.add(MAM_UNIT_R.class, r -> toCondition(
							r.getStringNE("join_base_unit_cd_")
						))
						.addSelect(m -> toArray(
							m.dec_place,
							m.unit_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("base_unit_nm", m.unit_nm());
							r.setNumberNE("base_unit_dec_place", m.dec_place());
					})
				)
			);
	}
	
	/**
	 * -- MSBCL1100_MST_INPT_ACT_REM_Query_S01
	 */
	static MCQueryPlan MSBCL1100_MST_INPT_ACT_REM_S01() {
		MST_INPT_ACT_REM_R S0_T1 = MST_INPT_ACT_REM_R.create("T1");
		MST_INPT_SCHD_R S0_T2 = MST_INPT_SCHD_R.create("T2");
		MAM_ITM_R S0_M1 = MAM_ITM_R.create("M1");
		MAM_SUNDRY_ITM_R S0_M2 = MAM_SUNDRY_ITM_R.create("M2");
		MSW_INPT_ACT_REM_KEY_R S1_KEY = MSW_INPT_ACT_REM_KEY_R.create("KEY");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBCL1100_MST_INPT_ACT_REM_Query_S01")
					.mainQuery()
					.select(
						S0_T2.oper_inst_no,
						S0_T2.alt_grp_cd,
						S0_T2.alt_grp_seq,
						S0_T2.alt_itm_fix_flg,
						S0_T2.itm_cd,
						S0_T2.itm_sub1,
						S0_T2.itm_sub2,
						S0_T2.itm_sub3,
						nvl(
							S0_M2.itm_nm,
							S0_M1.itm_nm
						).as("itm_nm"),
						S0_T2.ver_no,
						S0_M1.ver_flg,
						nullValue().as("base_unit_inpt_qty"),
						nullValue().as("base_unit_loss_qty"),
						nullValue().as("base_unit_fxd_loss_qty"),
						value(false).as("abort_flg"),
						cases()
							.when(S0_T1.div_seq.eq(value(0)))
								.then(S0_T2.base_unit_inpt_qty.subtract(S0_T1.base_unit_inpt_qty))
							.otherwise(S0_T1.base_unit_inpt_qty).as("base_unit_schd_inpt_qty"),
						cases()
							.when(S0_T1.div_seq.eq(value(0)))
								.then(S0_T2.base_unit_fxd_rqmt_qty.subtract(S0_T1.base_unit_fxd_rqmt_qty))
							.otherwise(S0_T1.base_unit_fxd_rqmt_qty).as("base_unit_schd_fxd_rqmt_qty"),
						cases()
							.when(S0_T1.div_seq.eq(value(0)))
								.then(S0_T2.base_unit_inpt_qty.add(S0_T2.base_unit_fxd_rqmt_qty).subtract(S0_T1.base_unit_inpt_qty).subtract(S0_T1.base_unit_fxd_rqmt_qty))
							.otherwise(S0_T1.base_unit_inpt_rem_qty.add(S0_T1.base_unit_fxd_rqmt_rem_qty)).as("base_unit_inpt_rem_qty"),
						S0_T2.base_unit_cd,
						S0_M1.dec_place.as("base_unit_dec_place"),
						S0_M1.rnd_typ.as("base_unit_conv_rnd_typ"),
						S0_M1.cont_fctr_flg,
						S0_M1.cont_fctr_rnd_typ,
						S0_M1.cont_fctr_dec_place,
						S0_T2.act_cont_fctr,
						S0_T2.cont_fctr_unit_cd,
						nvl(
							S0_T2.std_cont_fctr,
							S0_M1.std_cont_fctr
						).as("std_cont_fctr"),
						nullValue().as("cont_inpt_qty"),
						nullValue().as("cont_loss_qty"),
						nullValue().as("cont_fxd_loss_qty"),
						cases()
							.when(S0_T1.div_seq.eq(value(0)))
								.then(S0_T2.cont_inpt_qty.subtract(S0_T1.cont_inpt_qty))
							.otherwise(S0_T1.cont_inpt_qty).as("cont_schd_inpt_qty"),
						cases()
							.when(S0_T1.div_seq.eq(value(0)))
								.then(S0_T2.cont_fxd_rqmt_qty.subtract(S0_T1.cont_fxd_rqmt_qty))
							.otherwise(S0_T1.cont_fxd_rqmt_qty).as("cont_schd_fxd_rqmt_qty"),
						S0_M1.lot_mng_typ,
						S0_M1.sublot_mng_typ,
						S0_T2.lot_no,
						S0_T2.sublot_no,
						S0_T2.lot_no.as("inst_lot_no"),
						S0_T2.sublot_no.as("inst_sublot_no"),
						nullValue().as("acxfr_act_qty"),
						nullValue().as("acxfr_act_rsn_cd"),
						nullValue().as("acxfr_act_rsn_nm"),
						nullValue().as("acxfr_act_bd_dpt_cd"),
						nullValue().as("acxfr_act_bd_dpt_nm"),
						nullValue().as("act_dt"),
						nullValue().as("act_hm"),
						nullValue().as("ac_dt"),
						trunc(
							S0_T2.schd_tm,
							MCDateFmt.DD
						).as("schd_dt"),
						S0_T2.schd_tm.as("schd_hm"),
						S0_M1.sno1_mng_typ,
						S0_M1.sno2_mng_typ,
						S0_M1.sno3_mng_typ,
						S0_M1.sno4_mng_typ,
						nvl(
							S0_T2.alloc_sno1,
							S0_T2.sno1
						).as("sno1"),
						S0_T2.sno1_null_flg,
						nvl(
							S0_T2.alloc_sno1,
							S0_T2.sno1
						).as("inst_sno1"),
						nullValue().as("act_sno1"),
						nvl(
							S0_T2.alloc_sno2,
							S0_T2.sno2
						).as("sno2"),
						S0_T2.sno2_null_flg,
						nvl(
							S0_T2.alloc_sno2,
							S0_T2.sno2
						).as("inst_sno2"),
						nullValue().as("act_sno2"),
						nvl(
							S0_T2.alloc_sno3,
							S0_T2.sno3
						).as("sno3"),
						S0_T2.sno3_null_flg,
						nvl(
							S0_T2.alloc_sno3,
							S0_T2.sno3
						).as("inst_sno3"),
						nullValue().as("act_sno3"),
						nvl(
							S0_T2.alloc_sno4,
							S0_T2.sno4
						).as("sno4"),
						S0_T2.sno4_null_flg,
						nvl(
							S0_T2.alloc_sno4,
							S0_T2.sno4
						).as("inst_sno4"),
						nullValue().as("act_sno4"),
						S0_T2.bkf_typ,
						S0_T2.gd_cd,
						S0_T2.inpt_rsn_cd,
						S0_T2.inpt_loc_cd,
						S0_T2.inpt_str_ln_cd,
						S0_T2.inst_rpt_rmrks,
						nullValue().as("inpt_act_intr_rmrks"),
						nullValue().as("inpt_act_rpt_rmrks"),
						nullValue().as("trd_rmrks"),
						nullValue().as("inpt_act_sub_char1"),
						nullValue().as("inpt_act_sub_char2"),
						nullValue().as("inpt_act_sub_char3"),
						S0_T2.main_itm_flg,
						decode(
							S0_T2.bkf_typ,
							value(MAC_BKF_TYP.NO_BKF.value()),
							value(false),
							value(true)
						).as("bkf_upd_flg"),
						S0_T2.lot_mix_flg,
						S0_T2.sublot_mix_flg,
						S0_T2.ver_no.as("inpt_schd_ver_no"),
						S0_M1.stk_mng_typ,
						S0_T2.prov_typ,
						S0_T2.alt_itm_typ,
						S0_T2.alt_alloc_prio,
						S0_T2.base_unit_alt_qty,
						S0_T2.alloc_ctl_typ,
						S0_T2.alloc_flg,
						S0_T2.inpt_schd_no,
						nullValue().as("inpt_act_no"),
						nullValue().as("mes_id"),
						nullValue().as("data_no"),
						cases()
							.when(S0_T1.div_seq.eq(value(0)))
								.then(value(MSC_MFG_STS_TYP.ORD.value()))
							.otherwise(S0_T1.mfg_sts_typ).as("mfg_sts_typ"),
						S0_T2.disp_seq,
						S0_T2.recalc_grp,
						S0_T2.recalc_grp_seq
					)
					.from(
						S0_T1
						.innerJoin(S0_T2).on(
							bracket(
								S0_T1.inpt_schd_no.eq(S0_T2.inpt_schd_no)
							)
						)
						.leftOuterJoin(S0_M1).on(
							bracket(
								S0_T2.itm_cd.eq(S0_M1.itm_cd)
								.and(S0_T2.itm_sub1.eq(S0_M1.itm_sub1))
								.and(S0_T2.itm_sub2.eq(S0_M1.itm_sub2))
								.and(S0_T2.itm_sub3.eq(S0_M1.itm_sub3))
							)
						)
						.leftOuterJoin(S0_M2).on(
							bracket(
								S0_T2.itm_cd.eq(S0_M2.itm_cd)
								.and(S0_T2.itm_sub1.eq(S0_M2.itm_sub1))
								.and(S0_T2.itm_sub2.eq(S0_M2.itm_sub2))
								.and(S0_T2.itm_sub3.eq(S0_M2.itm_sub3))
								.and(S0_T2.sno1.eq(S0_M2.sno1))
								.and(S0_T2.sno2.eq(S0_M2.sno2))
								.and(S0_T2.sno3.eq(S0_M2.sno3))
								.and(S0_T2.sno4.eq(S0_M2.sno4))
							)
						)
					)
					.where(
						value(0).eq(value(0))
						.and(S0_T1.mfg_inst_no.eq(bind("srch_tgt_no")))
						.and(S0_T2.inpt_ctl_typ.neq(value(MAC_INPT_CTL_TYP.NO_MRP_INST.value())))
						.and(S0_T1.div_seq.eq(bind("div_seq")))
						.and(S0_T2.can_flg.eq(value(false)))
						.and(
							notExists(
								subQuery()
								.select(S1_KEY.inpt_schd_no)
								.from(S1_KEY)
								.where(
									S0_T1.inpt_schd_no.eq(S1_KEY.inpt_schd_no)
								)
							)
						)
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
							m.first_gr_dt,
							m.lot_seq,
							m.vld_dt
						))
						.addMap((r, m) -> {
							r.setDateNE("vld_dt", m.vld_dt());
							r.setDateNE("first_gr_dt", m.first_gr_dt());
							r.setStringNE("lot_seq", m.lot_seq());
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
							m.sppl_cd,
							m.str_ln_tgt_flg,
							m.wg_cd
						))
						.addMap((r, m) -> {
							r.setStringNE("inpt_loc_nm", m.loc_nm());
							r.setBooleanNE("inpt_str_ln_tgt_flg", m.str_ln_tgt_flg());
							r.setStringNE("inpt_loc_sppl_cd", m.sppl_cd());
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
	 * -- MSBCL1100_MST_INPT_ACT_Query_S01
	 */
	static MCQueryPlan MSBCL1100_MST_INPT_ACT_S01() {
		MST_INPT_ACT_R S0_T4 = MST_INPT_ACT_R.create("T4");
		MST_INPT_ACT_REM_R S0_T5 = MST_INPT_ACT_REM_R.create("T5");
		MST_INPT_SCHD_R S0_T2 = MST_INPT_SCHD_R.create("T2");
		MAM_ITM_R S0_M1 = MAM_ITM_R.create("M1");
		MAM_SUNDRY_ITM_R S0_M2 = MAM_SUNDRY_ITM_R.create("M2");
		MAM_DPT_R S0_M12 = MAM_DPT_R.create("M12");
		MST_MFG_ACT_R S0_TA1 = MST_MFG_ACT_R.create("TA1");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBCL1100_MST_INPT_ACT_Query_S01")
					.mainQuery()
					.select(
						S0_T2.oper_inst_no,
						S0_T4.oper_act_no,
						S0_T2.alt_grp_cd,
						S0_T2.alt_grp_seq,
						S0_T2.alt_itm_fix_flg,
						S0_T4.itm_cd,
						S0_T4.itm_sub1,
						S0_T4.itm_sub2,
						S0_T4.itm_sub3,
						nvl(
							S0_M2.itm_nm,
							S0_M1.itm_nm
						).as("itm_nm"),
						S0_T4.ver_no,
						S0_M1.ver_flg,
						S0_T4.base_unit_inpt_qty,
						S0_T4.base_unit_loss_qty,
						S0_T4.base_unit_fxd_loss_qty,
						bracket(
							cases()
								.when(S0_T5.base_unit_inpt_abort_qty.gt(value(0)))
									.then(value(true))
								.otherwise(value(false))
						).as("abort_flg"),
						S0_T5.base_unit_inpt_qty.as("base_unit_schd_inpt_qty"),
						S0_T5.base_unit_fxd_rqmt_qty.as("base_unit_schd_fxd_rqmt_qty"),
						S0_T5.base_unit_inpt_rem_qty.add(S0_T5.base_unit_fxd_rqmt_rem_qty).as("base_unit_inpt_rem_qty"),
						S0_T4.base_unit_cd,
						S0_M1.dec_place.as("base_unit_dec_place"),
						S0_M1.rnd_typ.as("base_unit_conv_rnd_typ"),
						S0_M1.cont_fctr_flg,
						S0_M1.cont_fctr_rnd_typ,
						S0_M1.cont_fctr_dec_place,
						S0_T4.act_cont_fctr,
						S0_T4.cont_fctr_unit_cd,
						nvl(
							S0_T2.std_cont_fctr,
							S0_M1.std_cont_fctr
						).as("std_cont_fctr"),
						S0_T4.cont_qty.as("cont_inpt_qty"),
						S0_T4.cont_loss_qty,
						S0_T4.cont_fxd_loss_qty,
						S0_T5.cont_inpt_qty.as("cont_schd_inpt_qty"),
						S0_T5.cont_fxd_rqmt_qty.as("cont_schd_fxd_rqmt_qty"),
						nullValue().as("cont_acxfr_act_qty"),
						S0_M1.lot_mng_typ,
						S0_M1.sublot_mng_typ,
						S0_T4.lot_no,
						S0_T4.sublot_no,
						S0_T2.lot_no.as("inst_lot_no"),
						S0_T2.sublot_no.as("inst_sublot_no"),
						S0_T4.acxfr_qty.as("acxfr_act_qty"),
						S0_T4.acxfr_rsn_cd.as("acxfr_act_rsn_cd"),
						S0_T4.acxfr_bd_dpt_cd.as("acxfr_act_bd_dpt_cd"),
						S0_M12.dpt_nm.as("acxfr_act_bd_dpt_nm"),
						S0_T4.stk_id_typ,
						S0_T4.stk_bp_cd,
						S0_T4.stk_arrv_bp_cd,
						trunc(
							S0_T4.act_tm,
							MCDateFmt.DD
						).as("act_dt"),
						S0_T4.act_tm.as("act_hm"),
						S0_T4.ac_dt,
						trunc(
							S0_T2.schd_tm,
							MCDateFmt.DD
						).as("schd_dt"),
						S0_T2.schd_tm.as("schd_hm"),
						S0_M1.sno1_mng_typ,
						S0_M1.sno2_mng_typ,
						S0_M1.sno3_mng_typ,
						S0_M1.sno4_mng_typ,
						S0_T2.sno1_null_flg,
						S0_T2.alloc_sno1.as("inst_sno1"),
						S0_T4.sno1.as("sno1"),
						S0_T2.sno2_null_flg,
						S0_T2.alloc_sno2.as("inst_sno2"),
						S0_T4.sno2.as("sno2"),
						S0_T2.sno3_null_flg,
						S0_T2.alloc_sno3.as("inst_sno3"),
						S0_T4.sno3.as("sno3"),
						S0_T2.sno4_null_flg,
						S0_T2.alloc_sno4.as("inst_sno4"),
						S0_T4.sno4.as("sno4"),
						S0_T2.bkf_typ,
						S0_T4.gd_cd,
						S0_T4.inpt_rsn_cd,
						S0_T4.inpt_loc_cd,
						S0_T4.inpt_str_ln_cd,
						S0_T2.inst_rpt_rmrks,
						S0_T4.intr_rmrks.as("inpt_act_intr_rmrks"),
						S0_T4.act_rpt_rmrks.as("inpt_act_rpt_rmrks"),
						S0_T4.trd_rmrks,
						S0_T4.sub_char1.as("inpt_act_sub_char1"),
						S0_T4.sub_char2.as("inpt_act_sub_char2"),
						S0_T4.sub_char3.as("inpt_act_sub_char3"),
						S0_T2.main_itm_flg,
						S0_T4.bkf_ctl_flg.as("bkf_upd_flg"),
						S0_T2.lot_mix_flg,
						S0_T2.sublot_mix_flg,
						S0_T2.ver_no.as("inpt_schd_ver_no"),
						S0_M1.stk_mng_typ,
						S0_T2.prov_typ,
						S0_T2.alt_itm_typ,
						S0_T2.alt_alloc_prio,
						S0_T2.base_unit_alt_qty,
						S0_T2.alloc_ctl_typ,
						S0_T2.alloc_flg,
						S0_T4.add_flg,
						S0_T2.inpt_schd_no,
						S0_T4.inpt_act_no,
						S0_T4.mes_flg,
						S0_T4.ext_sys_cd,
						S0_T4.ext_inpt_act_no,
						S0_T4.if_auto_reg_flg,
						S0_T5.mfg_sts_typ,
						S0_T2.disp_seq,
						S0_T2.recalc_grp,
						S0_T2.recalc_grp_seq,
						S0_T4.base_unit_inpt_qty.as("base_unit_inpt_qty_bef"),
						S0_T4.base_unit_fxd_loss_qty.as("base_unit_fxd_loss_qty_bef")
					)
					.from(
						S0_TA1
						.innerJoin(S0_T4).on(
							bracket(
								S0_TA1.mfg_act_no.eq(S0_T4.mfg_act_no)
							)
						)
						.leftOuterJoin(S0_T5).on(
							bracket(
								S0_T4.inpt_schd_no.eq(S0_T5.inpt_schd_no)
								.and(S0_T4.div_seq.eq(S0_T5.div_seq))
							)
						)
						.leftOuterJoin(S0_T2).on(
							bracket(
								S0_T4.inpt_schd_no.eq(S0_T2.inpt_schd_no)
							)
						)
						.leftOuterJoin(S0_M1).on(
							bracket(
								S0_T4.itm_cd.eq(S0_M1.itm_cd)
								.and(S0_T4.itm_sub1.eq(S0_M1.itm_sub1))
								.and(S0_T4.itm_sub2.eq(S0_M1.itm_sub2))
								.and(S0_T4.itm_sub3.eq(S0_M1.itm_sub3))
							)
						)
						.leftOuterJoin(S0_M2).on(
							bracket(
								S0_T4.itm_cd.eq(S0_M2.itm_cd)
								.and(S0_T4.itm_sub1.eq(S0_M2.itm_sub1))
								.and(S0_T4.itm_sub2.eq(S0_M2.itm_sub2))
								.and(S0_T4.itm_sub3.eq(S0_M2.itm_sub3))
								.and(S0_T4.sno1.eq(S0_M2.sno1))
								.and(S0_T4.sno2.eq(S0_M2.sno2))
								.and(S0_T4.sno3.eq(S0_M2.sno3))
								.and(S0_T4.sno4.eq(S0_M2.sno4))
							)
						)
						.leftOuterJoin(S0_M12).on(
							bracket(
								S0_T4.acxfr_bd_dpt_cd.eq(S0_M12.dpt_cd)
								.and(S0_T4.ac_dt.between(S0_M12.st_dt, S0_M12.end_dt))
							)
						)
					)
					.where(
						value(0).eq(value(0))
						.and(S0_TA1.mfg_inst_no.eq(bind("srch_tgt_no")))
						.and(S0_TA1.div_seq.eq(bind("div_seq")))
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
							m.first_gr_dt,
							m.lot_seq,
							m.vld_dt
						))
						.addMap((r, m) -> {
							r.setDateNE("vld_dt", m.vld_dt());
							r.setDateNE("first_gr_dt", m.first_gr_dt());
							r.setStringNE("lot_seq", m.lot_seq());
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
							m.sppl_cd,
							m.str_ln_tgt_flg,
							m.wg_cd
						))
						.addMap((r, m) -> {
							r.setStringNE("inpt_loc_nm", m.loc_nm());
							r.setBooleanNE("inpt_str_ln_tgt_flg", m.str_ln_tgt_flg());
							r.setStringNE("inpt_loc_sppl_cd", m.sppl_cd());
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
	 * -- MSBCL1100_MST_LOSS_ACT_Query_S01
	 */
	static MCQueryPlan MSBCL1100_MST_LOSS_ACT_S01() {
		MST_LOSS_ACT_R S0_T1 = MST_LOSS_ACT_R.create("T1");
		MST_INPT_ACT_R S0_T2 = MST_INPT_ACT_R.create("T2");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBCL1100_MST_LOSS_ACT_Query_S01")
					.mainQuery()
					.select(
						S0_T1.loss_act_no,
						S0_T1.inpt_act_no,
						S0_T1.loss_rsn_cd,
						S0_T1.fxd_loss_flg,
						S0_T1.base_unit_qty.as("loss_qty"),
						S0_T1.cont_qty.as("cont_loss_qty"),
						S0_T1.intr_rmrks,
						S0_T1.trd_rmrks,
						S0_T1.sub_char1,
						S0_T1.sub_char2,
						S0_T1.sub_char3,
						S0_T2.inpt_schd_no,
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
						.innerJoin(S0_T2).on(
							bracket(
								S0_T1.inpt_act_no.eq(S0_T2.inpt_act_no)
							)
						)
					)
					.where(
						S0_T1.inpt_act_no.eq(bind("inpt_act_no"))
					)
			)
			.setJoinInfo(
				joinInfo(
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
						.add(MAM_ITM_R.class, r -> toCondition(
							r.getStringNE("join_itm_cd_"),
							r.getStringNE("join_itm_sub1_"),
							r.getStringNE("join_itm_sub2_"),
							r.getStringNE("join_itm_sub3_")
						))
						.addSelect(m -> toArray(
							m.itm_typ,
							m.itm_typ_d_cd
						))
						.addMap((r, m) -> {
							r.setStringNE("join_itm_typ_", m.itm_typ());
							r.setStringNE("join_itm_typ_d_cd_", m.itm_typ_d_cd());
					}),
					j -> j
						.add(MAM_LOSS_RSN_R.class, r -> toCondition(
							r.getStringNE("join_itm_typ_"),
							r.getStringNE("join_itm_typ_d_cd_"),
							r.getStringNE("loss_rsn_cd")
						))
						.addSelect(m -> toArray(
							m.def_disp_flg
						))
						.addMap((r, m) -> {
							r.setBooleanNE("def_disp_flg", m.def_disp_flg());
					})
				)
			);
	}
	
	/**
	 * -- MSBCL1100_MST_MFG_ACT_REM_Query_S01
	 */
	static MCQueryPlan MSBCL1100_MST_MFG_ACT_REM_S01() {
		MST_MFG_ACT_REM_R S0_T1 = MST_MFG_ACT_REM_R.create("T1");
		MST_MFG_INST_R S0_T2 = MST_MFG_INST_R.create("T2");
		MST_ITM_MFG_INST_R S0_T3 = MST_ITM_MFG_INST_R.create("T3");
		MAM_ITM_R S0_M1 = MAM_ITM_R.create("M1");
		MAM_SUNDRY_ITM_R S0_M2 = MAM_SUNDRY_ITM_R.create("M2");
		MAVM_RD_LOC_R S0_M5 = MAVM_RD_LOC_R.create("M5");
		MAM_DPT_R S0_M12 = MAM_DPT_R.create("M12");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBCL1100_MST_MFG_ACT_REM_Query_S01")
					.mainQuery()
					.select(
						value(MSC_MFG_STS_TYP.ORD.value()).as("mfg_sts_typ"),
						S0_T3.itm_cd,
						S0_T3.itm_sub1,
						S0_T3.itm_sub2,
						S0_T3.itm_sub3,
						nvl(
							S0_M2.itm_nm,
							S0_M1.itm_nm
						).as("itm_nm"),
						S0_T3.lot_no,
						S0_T3.sublot_no,
						S0_T3.sno1,
						S0_T3.sno2,
						S0_T3.sno3,
						S0_T3.sno4,
						nullValue().as("st_act_dt"),
						nullValue().as("st_act_hm"),
						nullValue().as("st_ac_dt"),
						nullValue().as("end_act_dt"),
						nullValue().as("end_act_hm"),
						nullValue().as("end_ac_dt"),
						bracket(
							S0_T2.base_unit_inst_qty.subtract(S0_T1.base_unit_mfg_qty)
						).as("base_unit_st_act_qty"),
						value(false).as("rem_abort_flg"),
						bracket(
							S0_T2.base_unit_inst_qty.subtract(S0_T1.base_unit_mfg_qty)
						).as("base_unit_mfg_rem_qty"),
						S0_T2.base_unit_inst_qty.as("base_unit_mfg_inst_qty"),
						S0_T2.base_unit_inst_qty,
						S0_T2.base_unit_yield_qty,
						value(0).as("base_unit_yield_qty"),
						value(0).as("base_unit_dfct_qty"),
						S0_T2.base_unit_cd,
						nullValue().as("act_usr_cd"),
						nullValue().as("act_usr_nm"),
						nullValue().as("act_dpt_cd"),
						nullValue().as("act_dpt_nm"),
						nullValue().as("act_rpt_rmrks"),
						nullValue().as("intr_rmrks"),
						nullValue().as("mfg_act_sub_char1"),
						nullValue().as("mfg_act_sub_char2"),
						nullValue().as("mfg_act_sub_char3"),
						value(false).as("act_prnt_flg"),
						nullValue().as("act_prnt_tm"),
						nullValue().as("itm_yield"),
						S0_T3.itm_lower_yield,
						S0_T3.itm_std_yield,
						S0_T3.itm_upper_yield,
						trunc(
							S0_T2.st_schd_tm,
							MCDateFmt.DD
						).as("st_schd_dt"),
						S0_T2.st_schd_tm.as("st_schd_hm"),
						trunc(
							S0_T2.end_schd_tm,
							MCDateFmt.DD
						).as("end_schd_dt"),
						S0_T2.end_schd_tm.as("end_schd_hm"),
						S0_T3.mfg_mtd_typ,
						S0_T3.sppl_cd,
						S0_T3.mfg_loc_cd,
						S0_M5.loc_nm.as("mfg_loc_nm"),
						S0_M5.str_ln_tgt_flg.as("mfg_str_ln_tgt_flg"),
						S0_T3.mfg_str_ln_cd,
						S0_T3.strg_loc_cd,
						S0_T3.strg_str_ln_cd,
						S0_T3.site_cd,
						S0_T3.wg_cd,
						S0_T3.bom_ptn,
						S0_T3.oper_ptn,
						S0_T3.itm_ord_no,
						S0_T2.itm_mfg_inst_no,
						S0_T2.mfg_inst_no,
						nullValue().as("div_seq"),
						nullValue().as("mfg_act_no"),
						S0_T2.po_d_no,
						S0_T2.inst_rpt_rmrks,
						S0_T2.inst_po_cnt_rmrks,
						S0_T2.inst_dt,
						S0_T2.inst_usr_cd,
						S0_T2.inst_dpt_cd,
						S0_M12.dpt_nm.as("inst_dpt_nm"),
						nullValue().as("aprv_dt"),
						nullValue().as("aprv_tm"),
						S0_T2.aprv_flg,
						nullValue().as("aprv_dpt_cd"),
						nullValue().as("aprv_dpt_nm"),
						nullValue().as("aprv_usr_cd"),
						nullValue().as("aprv_usr_nm"),
						nullValue().as("aprv_rsn"),
						S0_T2.ins_usr_id,
						S0_T2.ins_usr_nm,
						S0_T2.ins_func_id,
						S0_T2.ins_ts,
						S0_T2.upd_usr_id,
						S0_T2.upd_usr_nm,
						S0_T2.upd_func_id,
						S0_T2.upd_ts,
						S0_T2.upd_srv_req_no,
						S0_T2.upd_cntr.as("mfg_inst_upd_cntr"),
						S0_T1.upd_cntr.as("mfg_inst_pr_upd_cntr"),
						nullValue().as("mfg_act_upd_cntr"),
						S0_T2.mfg_aprv_sts_typ,
						value(false).as("arr_purc_auto_reg_flg")
					)
					.from(
						S0_T1
						.innerJoin(S0_T2).on(
							bracket(
								S0_T1.mfg_inst_no.eq(S0_T2.mfg_inst_no)
							)
						)
						.innerJoin(S0_T3).on(
							bracket(
								S0_T2.itm_mfg_inst_no.eq(S0_T3.itm_mfg_inst_no)
							)
						)
						.leftOuterJoin(S0_M1).on(
							bracket(
								S0_T3.itm_cd.eq(S0_M1.itm_cd)
								.and(S0_T3.itm_sub1.eq(S0_M1.itm_sub1))
								.and(S0_T3.itm_sub2.eq(S0_M1.itm_sub2))
								.and(S0_T3.itm_sub3.eq(S0_M1.itm_sub3))
							)
						)
						.leftOuterJoin(S0_M2).on(
							bracket(
								S0_T3.itm_cd.eq(S0_M2.itm_cd)
								.and(S0_T3.itm_sub1.eq(S0_M2.itm_sub1))
								.and(S0_T3.itm_sub2.eq(S0_M2.itm_sub2))
								.and(S0_T3.itm_sub3.eq(S0_M2.itm_sub3))
								.and(S0_T3.sno1.eq(S0_M2.sno1))
								.and(S0_T3.sno2.eq(S0_M2.sno2))
								.and(S0_T3.sno3.eq(S0_M2.sno3))
								.and(S0_T3.sno4.eq(S0_M2.sno4))
							)
						)
						.innerJoin(S0_M5).on(
							bracket(
								S0_T3.mfg_loc_cd.eq(S0_M5.loc_cd)
							)
						)
						.leftOuterJoin(S0_M12).on(
							bracket(
								S0_T2.inst_dpt_cd.eq(S0_M12.dpt_cd)
								.and(S0_T2.inst_dt.between(S0_M12.st_dt, S0_M12.end_dt))
							)
						)
					)
					.where(
						value(0).eq(value(0))
						.and(S0_T1.mfg_inst_no.eq(bind("srch_tgt_no")))
						.and(S0_T1.div_seq.eq(value(0)))
						.and(S0_T2.can_flg.eq(value(false)))
						.and(S0_T2.abort_flg.eq(value(false)))
						.and(S0_T1.mfg_sts_typ.neq(value(MSC_MFG_STS_TYP.SAV.value())))
						.and(
							S0_T2.mfg_aprv_sts_typ.isNull()
							.or(S0_T2.mfg_aprv_sts_typ.neq(value(MSC_MFG_APRV_STS_TYP.INST_OPN.value())))
						)
						.and(
							S0_T3.mfg_mtd_typ.eq(value(MSC_MFG_MTD_TYP.INTNL.value()))
							.or(
								S0_T3.mfg_mtd_typ.eq(value(MSC_MFG_MTD_TYP.EXTNL.value()))
								.and(S0_T2.po_d_no.isNotNull())
							)
						)
						.and(
							S0_T2.base_unit_inst_qty.subtract(
								bracket(
									S0_T1.base_unit_mfg_qty.add(S0_T1.base_unit_mfg_abort_qty)
								)
							).gt(value(0))
						)
					)
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
							m.dec_place,
							m.unit_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("base_unit_nm", m.unit_nm());
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
						.add(MAM_LOC_R.class, r -> toCondition(
							r.getStringNE("strg_loc_cd")
						))
						.addSelect(m -> toArray(
							m.loc_nm,
							m.str_ln_tgt_flg
						))
						.addMap((r, m) -> {
							r.setStringNE("strg_loc_nm", m.loc_nm());
							r.setBooleanNE("strg_str_ln_tgt_flg", m.str_ln_tgt_flg());
					}),
					j -> j
						.add(MAM_STR_LN_R.class, r -> toCondition(
							r.getStringNE("strg_loc_cd"),
							r.getStringNE("strg_str_ln_cd")
						))
						.addSelect(m -> toArray(
							m.str_ln_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("strg_str_ln_nm", m.str_ln_nm());
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
						.add(MAVM_ITM_WG_R.class, r -> toCondition(
							r.getStringNE("itm_cd"),
							r.getStringNE("itm_sub1"),
							r.getStringNE("itm_sub2"),
							r.getStringNE("itm_sub3"),
							r.getStringNE("wg_cd")
						))
						.addSelect(m -> toArray(
							m.inpt_itm_add_flg,
							m.inpt_itm_del_flg
						))
						.addMap((r, m) -> {
							r.setBooleanNE("inpt_itm_add_flg", m.inpt_itm_add_flg());
							r.setBooleanNE("inpt_itm_del_flg", m.inpt_itm_del_flg());
					})
				)
			);
	}
	
	/**
	 * -- MSBCL1100_MST_MFG_ACT_Query_S01
	 */
	static MCQueryPlan MSBCL1100_MST_MFG_ACT_S01() {
		MST_MFG_ACT_R S0_T6 = MST_MFG_ACT_R.create("T6");
		MST_MFG_ACT_REM_R S0_T7 = MST_MFG_ACT_REM_R.create("T7");
		MST_MFG_ACT_REM_R S0_T8 = MST_MFG_ACT_REM_R.create("T8");
		MST_MFG_INST_R S0_T2 = MST_MFG_INST_R.create("T2");
		MST_ITM_MFG_INST_R S0_T3 = MST_ITM_MFG_INST_R.create("T3");
		MAM_ITM_R S0_M1 = MAM_ITM_R.create("M1");
		MAM_SUNDRY_ITM_R S0_M2 = MAM_SUNDRY_ITM_R.create("M2");
		MAM_LOC_R S0_M5 = MAM_LOC_R.create("M5");
		MAM_DPT_R S0_M12 = MAM_DPT_R.create("M12");
		MAM_DPT_R S0_M15 = MAM_DPT_R.create("M15");
		MAM_DPT_R S0_M17 = MAM_DPT_R.create("M17");
		MAVM_RD_LOC_R S1_V1 = MAVM_RD_LOC_R.create("V1");
		MAVM_APRV_USR_R S2_V2 = MAVM_APRV_USR_R.create("V2");
		MAVM_RD_LOC_R S3_V1 = MAVM_RD_LOC_R.create("V1");
		MAVM_APRV_USR_R S4_V2 = MAVM_APRV_USR_R.create("V2");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBCL1100_MST_MFG_ACT_Query_S01")
					.mainQuery()
					.select(
						S0_T3.itm_cd,
						S0_T3.itm_sub1,
						S0_T3.itm_sub2,
						S0_T3.itm_sub3,
						nvl(
							S0_M2.itm_nm,
							S0_M1.itm_nm
						).as("itm_nm"),
						S0_T7.mfg_sts_typ,
						trunc(
							S0_T6.st_act_tm,
							MCDateFmt.DD
						).as("st_act_dt"),
						S0_T6.st_act_tm.as("st_act_hm"),
						S0_T6.st_ac_dt,
						trunc(
							S0_T6.end_act_tm,
							MCDateFmt.DD
						).as("end_act_dt"),
						S0_T6.end_act_tm.as("end_act_hm"),
						S0_T6.end_ac_dt,
						S0_T7.base_unit_mfg_qty.as("base_unit_st_act_qty"),
						bracket(
							cases()
								.when(S0_T8.base_unit_mfg_abort_qty.gt(value(0)))
									.then(value(true))
								.otherwise(value(false))
						).as("rem_abort_flg"),
						S0_T7.base_unit_mfg_rem_qty,
						S0_T2.base_unit_inst_qty.as("base_unit_mfg_inst_qty"),
						S0_T6.base_unit_yield_qty,
						S0_T6.base_unit_dfct_qty,
						S0_T6.base_unit_cd,
						S0_T3.lot_no,
						S0_T3.sublot_no,
						S0_T3.sno1,
						S0_T3.sno2,
						S0_T3.sno3,
						S0_T3.sno4,
						S0_T6.act_usr_cd,
						S0_T6.act_dpt_cd,
						S0_M15.dpt_nm.as("act_dpt_nm"),
						S0_T6.act_rpt_rmrks,
						S0_T6.intr_rmrks,
						S0_T6.sub_char1.as("mfg_act_sub_char1"),
						S0_T6.sub_char2.as("mfg_act_sub_char2"),
						S0_T6.sub_char3.as("mfg_act_sub_char3"),
						S0_T6.act_prnt_flg,
						S0_T6.act_prnt_tm,
						S0_T6.itm_yield,
						S0_T3.itm_lower_yield,
						S0_T3.itm_std_yield,
						S0_T3.itm_upper_yield,
						trunc(
							S0_T2.st_schd_tm,
							MCDateFmt.DD
						).as("st_schd_dt"),
						S0_T2.st_schd_tm.as("st_schd_hm"),
						trunc(
							S0_T2.end_schd_tm,
							MCDateFmt.DD
						).as("end_schd_dt"),
						S0_T2.end_schd_tm.as("end_schd_hm"),
						S0_T3.mfg_mtd_typ,
						S0_T3.sppl_cd,
						S0_T3.mfg_loc_cd,
						S0_M5.loc_nm.as("mfg_loc_nm"),
						S0_M5.str_ln_tgt_flg.as("mfg_str_ln_tgt_flg"),
						S0_T3.mfg_str_ln_cd,
						S0_T3.strg_loc_cd,
						S0_T3.strg_str_ln_cd,
						S0_T3.site_cd,
						S0_T3.wg_cd,
						S0_T3.bom_ptn,
						S0_T3.oper_ptn,
						S0_T3.itm_ord_no,
						S0_T2.itm_mfg_inst_no,
						S0_T3.unschd_act_flg,
						S0_T6.mfg_inst_no,
						S0_T7.div_seq,
						S0_T2.po_d_no,
						S0_T6.mfg_act_no,
						S0_T2.inst_dt,
						S0_T2.inst_usr_cd,
						S0_T2.inst_dpt_cd,
						S0_M12.dpt_nm.as("inst_dpt_nm"),
						S0_T2.inst_rpt_rmrks,
						S0_T2.inst_po_cnt_rmrks,
						S0_T6.mfg_aprv_sts_typ,
						S0_T2.aprv_flg,
						S0_T6.aprv_dt,
						S0_T6.aprv_tm,
						S0_T6.aprv_usr_cd,
						S0_T6.aprv_dpt_cd,
						S0_M17.dpt_nm.as("aprv_dpt_nm"),
						S0_T6.aprv_rsn,
						S0_T6.ins_usr_id,
						S0_T6.ins_usr_nm,
						S0_T6.ins_func_id,
						S0_T6.ins_ts,
						S0_T6.upd_usr_id,
						S0_T6.upd_usr_nm,
						S0_T6.upd_func_id,
						S0_T6.upd_ts,
						S0_T6.upd_srv_req_no,
						S0_T2.upd_cntr.as("mfg_inst_upd_cntr"),
						S0_T8.upd_cntr.as("mfg_inst_pr_upd_cntr"),
						S0_T6.upd_cntr.as("mfg_act_upd_cntr"),
						S0_T6.arr_purc_auto_reg_flg
					)
					.from(
						S0_T6
						.innerJoin(S0_T7).on(
							bracket(
								S0_T6.mfg_inst_no.eq(S0_T7.mfg_inst_no)
								.and(S0_T6.div_seq.eq(S0_T7.div_seq))
							)
						)
						.innerJoin(S0_T8).on(
							bracket(
								S0_T6.mfg_inst_no.eq(S0_T8.mfg_inst_no)
								.and(value(0).eq(S0_T8.div_seq))
							)
						)
						.innerJoin(S0_T2).on(
							bracket(
								S0_T6.mfg_inst_no.eq(S0_T2.mfg_inst_no)
							)
						)
						.innerJoin(S0_T3).on(
							bracket(
								S0_T2.itm_mfg_inst_no.eq(S0_T3.itm_mfg_inst_no)
							)
						)
						.leftOuterJoin(S0_M1).on(
							bracket(
								S0_T3.itm_cd.eq(S0_M1.itm_cd)
								.and(S0_T3.itm_sub1.eq(S0_M1.itm_sub1))
								.and(S0_T3.itm_sub2.eq(S0_M1.itm_sub2))
								.and(S0_T3.itm_sub3.eq(S0_M1.itm_sub3))
							)
						)
						.leftOuterJoin(S0_M2).on(
							bracket(
								S0_T3.itm_cd.eq(S0_M2.itm_cd)
								.and(S0_T3.itm_sub1.eq(S0_M2.itm_sub1))
								.and(S0_T3.itm_sub2.eq(S0_M2.itm_sub2))
								.and(S0_T3.itm_sub3.eq(S0_M2.itm_sub3))
								.and(S0_T3.sno1.eq(S0_M2.sno1))
								.and(S0_T3.sno2.eq(S0_M2.sno2))
								.and(S0_T3.sno3.eq(S0_M2.sno3))
								.and(S0_T3.sno4.eq(S0_M2.sno4))
							)
						)
						.leftOuterJoin(S0_M5).on(
							bracket(
								S0_T3.mfg_loc_cd.eq(S0_M5.loc_cd)
							)
						)
						.leftOuterJoin(S0_M12).on(
							bracket(
								S0_T2.inst_dpt_cd.eq(S0_M12.dpt_cd)
								.and(S0_T2.inst_dt.between(S0_M12.st_dt, S0_M12.end_dt))
							)
						)
						.leftOuterJoin(S0_M15).on(
							bracket(
								S0_T6.act_dpt_cd.eq(S0_M15.dpt_cd)
								.and(S0_T6.st_ac_dt.between(S0_M15.st_dt, S0_M15.end_dt))
							)
						)
						.leftOuterJoin(S0_M17).on(
							bracket(
								S0_T6.aprv_dpt_cd.eq(S0_M17.dpt_cd)
								.and(S0_T6.aprv_dt.between(S0_M17.st_dt, S0_M17.end_dt))
							)
						)
					)
					.where(
						value(0).eq(value(0))
						.and(S0_T6.mfg_inst_no.eq(bind("srch_tgt_no")))
						.and(S0_T6.div_seq.eq(bind("div_seq")))
						.and(S0_T2.can_flg.eq(value(false)))
						.and(
							bracket(
								bind("ope_val").eq(value(true))
								.and(
									exists(
										subQuery()
										.select(value("X"))
										.from(S1_V1)
										.where(
											S1_V1.loc_cd.eq(S0_T3.mfg_loc_cd)
										)
									)
								)
							)
							.or(
								bind("ope_val").eq(value("2"))
								.and(
									exists(
										subQuery()
										.select(value("X"))
										.from(S2_V2)
										.where(
											S2_V2.aprv_role_cd.eq(S0_T2.mfg_aprv_role_cd)
											.and(S2_V2.usr_cd.eq(bind("tmp_aprv_usr")))
											.and(S2_V2.st_dt.lte(bind("tmp_today")))
											.and(
												S2_V2.end_dt.isNull()
												.or(S2_V2.end_dt.gte(bind("tmp_today")))
											)
										)
									)
								)
							)
							.or(
								bind("ope_val").eq(value("3"))
								.and(
									bracket(
										bracket(
											S0_T2.mfg_aprv_sts_typ.isNull()
											.or(S0_T2.mfg_aprv_sts_typ.neq(value(MSC_MFG_APRV_STS_TYP.ACT_ACPT.value())))
										)
										.and(
											exists(
												subQuery()
												.select(value("X"))
												.from(S3_V1)
												.where(
													S3_V1.loc_cd.eq(S0_T3.mfg_loc_cd)
												)
											)
										)
									)
									.or(
										S0_T2.mfg_aprv_sts_typ.eq(value(MSC_MFG_APRV_STS_TYP.ACT_ACPT.value()))
										.and(
											exists(
												subQuery()
												.select(value("X"))
												.from(S4_V2)
												.where(
													S4_V2.aprv_role_cd.eq(S0_T2.mfg_aprv_role_cd)
													.and(S4_V2.usr_cd.eq(bind("tmp_aprv_usr")))
													.and(S4_V2.st_dt.lte(bind("tmp_today")))
													.and(
														S4_V2.end_dt.isNull()
														.or(S4_V2.end_dt.gte(bind("tmp_today")))
													)
												)
											)
										)
									)
								)
							)
						)
					)
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
							m.dec_place,
							m.unit_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("base_unit_nm", m.unit_nm());
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
						.add(MAM_LOC_R.class, r -> toCondition(
							r.getStringNE("strg_loc_cd")
						))
						.addSelect(m -> toArray(
							m.loc_nm,
							m.str_ln_tgt_flg
						))
						.addMap((r, m) -> {
							r.setStringNE("strg_loc_nm", m.loc_nm());
							r.setBooleanNE("strg_str_ln_tgt_flg", m.str_ln_tgt_flg());
					}),
					j -> j
						.add(MAM_STR_LN_R.class, r -> toCondition(
							r.getStringNE("strg_loc_cd"),
							r.getStringNE("strg_str_ln_cd")
						))
						.addSelect(m -> toArray(
							m.str_ln_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("strg_str_ln_nm", m.str_ln_nm());
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
						.add(MAVM_ITM_WG_R.class, r -> toCondition(
							r.getStringNE("itm_cd"),
							r.getStringNE("itm_sub1"),
							r.getStringNE("itm_sub2"),
							r.getStringNE("itm_sub3"),
							r.getStringNE("wg_cd")
						))
						.addSelect(m -> toArray(
							m.inpt_itm_add_flg,
							m.inpt_itm_del_flg
						))
						.addMap((r, m) -> {
							r.setBooleanNE("inpt_itm_add_flg", m.inpt_itm_add_flg());
							r.setBooleanNE("inpt_itm_del_flg", m.inpt_itm_del_flg());
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
						.add(MAM_USR_R.class, r -> toCondition(
							r.getStringNE("aprv_usr_cd")
						))
						.addSelect(m -> toArray(
							m.usr_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("aprv_usr_nm", m.usr_nm());
					})
				)
			);
	}
	
	/**
	 * -- MSBCL1100_MST_OPER_ACT_REM_Query_S01
	 */
	static MCQueryPlan MSBCL1100_MST_OPER_ACT_REM_S01() {
		MST_OPER_ACT_REM_R S0_T1 = MST_OPER_ACT_REM_R.create("T1");
		MST_OPER_INST_R S0_T2 = MST_OPER_INST_R.create("T2");
		MST_ITM_MFG_INST_R S0_T5 = MST_ITM_MFG_INST_R.create("T5");
		MSW_OPER_ACT_REM_KEY_R S1_KEY = MSW_OPER_ACT_REM_KEY_R.create("KEY");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBCL1100_MST_OPER_ACT_REM_Query_S01")
					.mainQuery()
					.select(
						S0_T2.oper_cd,
						S0_T2.oper_seq,
						nullValue().as("st_act_dt"),
						nullValue().as("st_act_hm"),
						nullValue().as("end_act_dt"),
						nullValue().as("end_act_hm"),
						nullValue().as("oper_unit_act_qty"),
						nullValue().as("oper_unit_schd_qty"),
						nullValue().as("oper_unit_rem_qty"),
						S0_T2.oper_std_qty,
						S0_T2.oper_conv_qty,
						S0_T2.oper_unit_conv_rnd_typ,
						S0_T2.oper_unit_dec_place,
						S0_T2.oper_unit_cd,
						S0_T2.oper_loc_cd,
						S0_T2.oper_str_ln_cd,
						nullValue().as("oper_yield"),
						S0_T2.oper_lower_yield,
						S0_T2.oper_std_yield,
						S0_T2.oper_upper_yield,
						S0_T2.disp_seq,
						nullValue().as("oper_act_intr_rmrks"),
						nullValue().as("oper_act_rpt_rmrks"),
						nullValue().as("oper_act_sub_char1"),
						nullValue().as("oper_act_sub_char2"),
						nullValue().as("oper_act_sub_char3"),
						S0_T2.bkf_flg,
						S0_T2.bkf_flg.as("bkf_upd_flg"),
						S0_T2.bkf_flg.as("bkf_not_ref_flg"),
						S0_T2.wk_cost_calc_flg,
						S0_T2.wk_cost_calc_flg.as("wk_cost_upd_calc_flg"),
						S0_T2.usr_cd,
						S0_T2.inst_rpt_rmrks,
						trunc(
							S0_T2.st_schd_tm,
							MCDateFmt.DD
						).as("st_schd_dt"),
						S0_T2.st_schd_tm.as("st_schd_hm"),
						trunc(
							S0_T2.end_schd_tm,
							MCDateFmt.DD
						).as("end_schd_dt"),
						S0_T2.end_schd_tm.as("end_schd_hm"),
						cases()
							.when(S0_T1.div_seq.eq(value(0)))
								.then(S0_T2.base_unit_qty.subtract(S0_T1.base_unit_qty))
							.otherwise(S0_T1.base_unit_qty).as("base_unit_schd_qty"),
						S0_T2.base_unit_cd,
						S0_T2.oper_inst_no,
						nullValue().as("oper_act_no"),
						S0_T2.wip_rate,
						nullValue().as("mes_id"),
						nullValue().as("data_no"),
						cases()
							.when(S0_T1.div_seq.eq(value(0)))
								.then(value(MSC_MFG_STS_TYP.ORD.value()))
							.otherwise(S0_T1.mfg_sts_typ).as("mfg_sts_typ"),
						// this field is appended by sql coverter.
						S0_T5.itm_cd.as("join_itm_cd_"),
						// this field is appended by sql coverter.
						S0_T5.itm_sub1.as("join_itm_sub1_"),
						// this field is appended by sql coverter.
						S0_T5.itm_sub2.as("join_itm_sub2_"),
						// this field is appended by sql coverter.
						S0_T5.itm_sub3.as("join_itm_sub3_")
					)
					.from(
						S0_T1
						.innerJoin(S0_T2).on(
							bracket(
								S0_T1.oper_inst_no.eq(S0_T2.oper_inst_no)
							)
						)
						.innerJoin(S0_T5).on(
							bracket(
								S0_T2.itm_mfg_inst_no.eq(S0_T5.itm_mfg_inst_no)
							)
						)
					)
					.where(
						value(0).eq(value(0))
						.and(S0_T1.mfg_inst_no.eq(bind("srch_tgt_no")))
						.and(S0_T1.div_seq.eq(bind("div_seq")))
						.and(S0_T2.can_flg.eq(value(false)))
						.and(
							notExists(
								subQuery()
								.select(S1_KEY.oper_inst_no)
								.from(S1_KEY)
								.where(
									S0_T1.oper_inst_no.eq(S1_KEY.oper_inst_no)
								)
							)
						)
					)
			)
			.setJoinInfo(
				joinInfo(
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
							m.loc_nm,
							m.str_ln_tgt_flg
						))
						.addMap((r, m) -> {
							r.setStringNE("oper_loc_nm", m.loc_nm());
							r.setBooleanNE("oper_str_ln_tgt_flg", m.str_ln_tgt_flg());
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
							r.getStringNE("usr_cd")
						))
						.addSelect(m -> toArray(
							m.usr_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("usr_nm", m.usr_nm());
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
						.add(MAM_ITM_R.class, r -> toCondition(
							r.getStringNE("join_itm_cd_"),
							r.getStringNE("join_itm_sub1_"),
							r.getStringNE("join_itm_sub2_"),
							r.getStringNE("join_itm_sub3_")
						))
						.addSelect(m -> toArray(
							m.dec_place,
							m.rnd_typ
						))
						.addMap((r, m) -> {
							r.setNumberNE("base_unit_dec_place", m.dec_place());
							r.setStringNE("base_unit_conv_rnd_typ", m.rnd_typ());
					})
				)
			);
	}
	
	/**
	 * -- MSBCL1100_MST_OPER_ACT_Query_S01
	 */
	static MCQueryPlan MSBCL1100_MST_OPER_ACT_S01() {
		MST_OPER_ACT_R S0_T3 = MST_OPER_ACT_R.create("T3");
		MST_OPER_ACT_REM_R S0_T4 = MST_OPER_ACT_REM_R.create("T4");
		MST_OPER_INST_R S0_T2 = MST_OPER_INST_R.create("T2");
		MST_ITM_MFG_INST_R S0_T5 = MST_ITM_MFG_INST_R.create("T5");
		MST_MFG_ACT_R S0_TA1 = MST_MFG_ACT_R.create("TA1");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBCL1100_MST_OPER_ACT_Query_S01")
					.mainQuery()
					.select(
						S0_T2.oper_cd,
						S0_T2.oper_seq,
						trunc(
							S0_T3.st_act_tm,
							MCDateFmt.DD
						).as("st_act_dt"),
						S0_T3.st_act_tm.as("st_act_hm"),
						trunc(
							S0_T3.end_act_tm,
							MCDateFmt.DD
						).as("end_act_dt"),
						S0_T3.end_act_tm.as("end_act_hm"),
						S0_T3.oper_unit_qty.as("oper_unit_act_qty"),
						nullValue().as("oper_unit_schd_qty"),
						nullValue().as("oper_unit_rem_qty"),
						S0_T2.oper_std_qty,
						S0_T2.oper_conv_qty,
						S0_T2.oper_unit_conv_rnd_typ,
						S0_T2.oper_unit_dec_place,
						S0_T3.oper_unit_cd,
						S0_T2.oper_loc_cd,
						S0_T2.oper_str_ln_cd,
						S0_T3.oper_yield,
						S0_T2.oper_lower_yield,
						S0_T2.oper_std_yield,
						S0_T2.oper_upper_yield,
						S0_T3.disp_seq,
						S0_T3.intr_rmrks.as("oper_act_intr_rmrks"),
						S0_T3.act_rpt_rmrks.as("oper_act_rpt_rmrks"),
						S0_T3.sub_char1.as("oper_act_sub_char1"),
						S0_T3.sub_char2.as("oper_act_sub_char2"),
						S0_T3.sub_char3.as("oper_act_sub_char3"),
						S0_T2.bkf_flg,
						S0_T3.bkf_ctl_flg.as("bkf_upd_flg"),
						S0_T3.bkf_not_ref_flg,
						S0_T2.wk_cost_calc_flg,
						S0_T3.wk_cost_calc_ctl_flg.as("wk_cost_upd_calc_flg"),
						S0_T2.usr_cd,
						S0_T2.inst_rpt_rmrks,
						trunc(
							S0_T2.st_schd_tm,
							MCDateFmt.DD
						).as("st_schd_dt"),
						S0_T2.st_schd_tm.as("st_schd_hm"),
						trunc(
							S0_T2.end_schd_tm,
							MCDateFmt.DD
						).as("end_schd_dt"),
						S0_T2.end_schd_tm.as("end_schd_hm"),
						S0_T4.base_unit_qty.as("base_unit_schd_qty"),
						S0_T4.base_unit_rem_qty,
						S0_T2.base_unit_cd,
						S0_T2.oper_inst_no,
						S0_T3.oper_act_no,
						S0_T2.wip_rate,
						S0_T3.mes_flg,
						S0_T3.ext_sys_cd,
						S0_T3.ext_oper_act_no,
						S0_T3.if_auto_reg_flg,
						cases()
							.when(
								S0_T4.mfg_sts_typ.eq(value(MSC_MFG_STS_TYP.STT.value()))
								.and(S0_T3.end_act_tm.isNotNull())
							)
								.then(value(true))
							.otherwise(value(false)).as("not_cmpl_flg"),
						S0_T4.mfg_sts_typ,
						// this field is appended by sql coverter.
						S0_T5.itm_cd.as("join_itm_cd_"),
						// this field is appended by sql coverter.
						S0_T5.itm_sub1.as("join_itm_sub1_"),
						// this field is appended by sql coverter.
						S0_T5.itm_sub2.as("join_itm_sub2_"),
						// this field is appended by sql coverter.
						S0_T5.itm_sub3.as("join_itm_sub3_")
					)
					.from(
						S0_T3
						.innerJoin(S0_T4).on(
							bracket(
								S0_T3.oper_inst_no.eq(S0_T4.oper_inst_no)
								.and(S0_T3.div_seq.eq(S0_T4.div_seq))
							)
						)
						.innerJoin(S0_T2).on(
							bracket(
								S0_T3.oper_inst_no.eq(S0_T2.oper_inst_no)
							)
						)
						.innerJoin(S0_T5).on(
							bracket(
								S0_T2.itm_mfg_inst_no.eq(S0_T5.itm_mfg_inst_no)
							)
						)
						.innerJoin(S0_TA1).on(
							bracket(
								S0_T3.mfg_act_no.eq(S0_TA1.mfg_act_no)
							)
						)
					)
					.where(
						value(0).eq(value(0))
						.and(S0_TA1.mfg_inst_no.eq(bind("srch_tgt_no")))
						.and(S0_TA1.div_seq.eq(bind("div_seq")))
					)
			)
			.setJoinInfo(
				joinInfo(
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
							m.loc_nm,
							m.str_ln_tgt_flg
						))
						.addMap((r, m) -> {
							r.setStringNE("oper_loc_nm", m.loc_nm());
							r.setBooleanNE("oper_str_ln_tgt_flg", m.str_ln_tgt_flg());
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
							r.getStringNE("usr_cd")
						))
						.addSelect(m -> toArray(
							m.usr_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("usr_nm", m.usr_nm());
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
						.add(MAM_ITM_R.class, r -> toCondition(
							r.getStringNE("join_itm_cd_"),
							r.getStringNE("join_itm_sub1_"),
							r.getStringNE("join_itm_sub2_"),
							r.getStringNE("join_itm_sub3_")
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
	 * -- MSBCL1100_MST_WK_ACT_REM_Query_S01
	 */
	static MCQueryPlan MSBCL1100_MST_WK_ACT_REM_S01() {
		MST_WK_ACT_REM_R S0_T1 = MST_WK_ACT_REM_R.create("T1");
		MST_WK_SCHD_R S0_T2 = MST_WK_SCHD_R.create("T2");
		MSW_WK_ACT_REM_KEY_R S1_KEY = MSW_WK_ACT_REM_KEY_R.create("KEY");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBCL1100_MST_WK_ACT_REM_Query_S01")
					.mainQuery()
					.select(
						S0_T2.oper_inst_no,
						S0_T2.wk_cost_cd,
						nullValue().as("act_wk_cost"),
						cases()
							.when(S0_T1.div_seq.eq(value(0)))
								.then(
									bracket(
										nvl(
											S0_T2.wk_cost,
											value(0)
										).add(
											nvl(
												S0_T2.fxd_wk_cost,
												value(0)
											)
										)
									).subtract(
										bracket(
											nvl(
												S0_T1.wk_cost,
												value(0)
											).add(
												nvl(
													S0_T1.fxd_wk_cost,
													value(0)
												)
											)
										)
									)
							)
							.otherwise(
								nvl(
									S0_T1.wk_cost,
									value(0)
								).add(
									nvl(
										S0_T1.fxd_wk_cost,
										value(0)
									)
								)
							).as("schd_wk_cost"),
						cases()
							.when(S0_T1.div_seq.eq(value(0)))
								.then(
									bracket(
										nvl(
											S0_T2.wk_cost,
											value(0)
										).add(
											nvl(
												S0_T2.fxd_wk_cost,
												value(0)
											)
										)
									).subtract(
										bracket(
											nvl(
												S0_T1.wk_cost,
												value(0)
											).add(
												nvl(
													S0_T1.fxd_wk_cost,
													value(0)
												)
											)
										)
									)
							)
							.otherwise(
								nvl(
									S0_T1.wk_cost,
									value(0)
								).add(
									nvl(
										S0_T1.fxd_wk_cost,
										value(0)
									)
								)
							).as("rem_wk_cost"),
						nullValue().as("ac_dt"),
						nullValue().as("st_tm"),
						nullValue().as("end_tm"),
						nullValue().as("brk_pd"),
						nullValue().as("wk_day_cd"),
						nullValue().as("wk_day_nm"),
						nullValue().as("wk_rsn_cd"),
						nullValue().as("wk_rsn_nm"),
						nullValue().as("wk_usr_cd"),
						nullValue().as("wk_usr_nm"),
						nullValue().as("wk_usr_dpt_cd"),
						nullValue().as("wk_usr_dpt_nm"),
						nullValue().as("fclty"),
						S0_T2.wk_cost_calc_flg,
						S0_T2.wk_cost_calc_flg.as("wk_cost_calc_upd_flg"),
						nullValue().as("wk_act_intr_rmrks"),
						nullValue().as("wk_act_sub_char1"),
						nullValue().as("wk_act_sub_char2"),
						nullValue().as("wk_act_sub_char3"),
						cases()
							.when(S0_T1.div_seq.eq(value(0)))
								.then(
									bracket(
											nvl(
												S0_T2.wk_cost,
												value(0)
											)
									.subtract(
										nvl(
												S0_T1.wk_cost,
												value(0)
											)
										)
									)
								)
							.otherwise(
								nvl(
									S0_T1.wk_cost,
									value(0)
								)
							).as("wk_cost"),
						cases()
							.when(S0_T1.div_seq.eq(value(0)))
								.then(
									bracket(
											nvl(
												S0_T2.fxd_wk_cost,
												value(0)
											)
									.subtract(
										nvl(
												S0_T1.fxd_wk_cost,
												value(0)
											)
										)
									)
								)
								.otherwise(
									nvl(
										S0_T1.fxd_wk_cost,
										value(0)
									)
								).as("fxd_wk_cost"),
						S0_T2.wk_schd_no,
						nullValue().as("wk_act_no"),
						cases()
							.when(S0_T1.div_seq.eq(value(0)))
								.then(value(MSC_MFG_STS_TYP.ORD.value()))
							.otherwise(S0_T1.mfg_sts_typ).as("mfg_sts_typ"),
						S0_T2.disp_seq
					)
					.from(
						S0_T1
						.innerJoin(S0_T2).on(
							bracket(
								S0_T1.wk_schd_no.eq(S0_T2.wk_schd_no)
							)
						)
					)
					.where(
						value(0).eq(value(0))
						.and(S0_T1.mfg_inst_no.eq(bind("srch_tgt_no")))
						.and(S0_T1.div_seq.eq(bind("div_seq")))
						.and(S0_T2.can_flg.eq(value(false)))
						.and(
							notExists(
								subQuery()
								.select(S1_KEY.wk_schd_no)
								.from(S1_KEY)
								.where(
									S0_T1.wk_schd_no.eq(S1_KEY.wk_schd_no)
								)
							)
						)
					)
			)
			.setJoinInfo(
				joinInfo(
					j -> j
						.add(MAM_WK_COST_R.class, r -> toCondition(
							r.getStringNE("wk_cost_cd")
						))
						.addSelect(m -> toArray(
							m.dec_place,
							m.wk_cost_nm,
							m.wk_cost_unit_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("wk_cost_nm", m.wk_cost_nm());
							r.setStringNE("wk_cost_unit_nm", m.wk_cost_unit_nm());
							r.setNumberNE("wk_cost_dec_place", m.dec_place());
					})
				)
			);
	}
	
	/**
	 * -- MSBCL1100_MST_WK_ACT_Query_S01
	 */
	static MCQueryPlan MSBCL1100_MST_WK_ACT_S01() {
		MST_WK_ACT_R S0_T3 = MST_WK_ACT_R.create("T3");
		MST_WK_ACT_REM_R S0_T4 = MST_WK_ACT_REM_R.create("T4");
		MST_OPER_ACT_R S0_T5 = MST_OPER_ACT_R.create("T5");
		MAM_DPT_R S0_M2 = MAM_DPT_R.create("M2");
		MAM_DPT_R S0_M6 = MAM_DPT_R.create("M6");
		MST_MFG_ACT_R S0_TA1 = MST_MFG_ACT_R.create("TA1");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBCL1100_MST_WK_ACT_Query_S01")
					.mainQuery()
					.select(
						S0_T5.oper_inst_no,
						S0_T3.oper_act_no,
						S0_T3.wk_cost_cd,
						S0_T3.wk_cost.as("act_wk_cost"),
						bracket(
							nvl(
								S0_T4.wk_cost,
								value(0)
							).add(
								nvl(
									S0_T4.fxd_wk_cost,
									value(0)
								)
							)
						).as("schd_wk_cost"),
						S0_T4.rem_wk_cost,
						bracket(
							cases()
								.when(S0_T4.abort_wk_cost.gt(value(0)))
									.then(value(true))
								.otherwise(value(false))
						).as("abort_flg"),
						S0_T3.ac_dt,
						S0_T3.st_tm,
						S0_T3.end_tm,
						S0_T3.brk_pd,
						S0_T3.wk_day_cd,
						S0_T3.wk_rsn_cd,
						S0_T3.wk_usr_cd,
						S0_T3.wk_usr_dpt_cd,
						S0_M6.dpt_nm.as("wk_usr_dpt_nm"),
						S0_T3.fclty,
						S0_T3.wk_cost_calc_ctl_flg.as("wk_cost_calc_upd_flg"),
						S0_T3.intr_rmrks.as("wk_act_intr_rmrks"),
						S0_T3.sub_char1.as("wk_act_sub_char1"),
						S0_T3.sub_char2.as("wk_act_sub_char2"),
						S0_T3.sub_char3.as("wk_act_sub_char3"),
						S0_T4.wk_cost,
						S0_T4.fxd_wk_cost,
						S0_T3.wk_act_no,
						S0_T3.mfg_act_no,
						S0_T3.mes_flg,
						S0_T3.ext_sys_cd,
						S0_T3.ext_wk_act_no,
						S0_T4.mfg_sts_typ,
						// this field is appended by sql coverter.
						S0_T3.wk_schd_no.as("join_wk_schd_no_")
					)
					.from(
						S0_T3
						.leftOuterJoin(S0_T4).on(
							bracket(
								S0_T3.wk_schd_no.eq(S0_T4.wk_schd_no)
								.and(S0_T3.div_seq.eq(S0_T4.div_seq))
							)
						)
						.leftOuterJoin(S0_T5).on(
								bracket(
									S0_T3.oper_act_no.eq(S0_T5.oper_act_no)
								)
							)
						.leftOuterJoin(S0_M2).on(
							bracket(
								S0_T3.dpt_cd.eq(S0_M2.dpt_cd)
								.and(S0_T3.ac_dt.between(S0_M2.st_dt, S0_M2.end_dt))
							)
						)
						.leftOuterJoin(S0_M6).on(
							bracket(
								S0_T3.wk_usr_dpt_cd.eq(S0_M6.dpt_cd)
								.and(S0_T3.ac_dt.between(S0_M6.st_dt, S0_M6.end_dt))
							)
						)
						.innerJoin(S0_TA1).on(
							bracket(
								S0_T3.mfg_act_no.eq(S0_TA1.mfg_act_no)
							)
						)
					)
					.where(
						value(0).eq(value(0))
						.and(S0_TA1.mfg_inst_no.eq(bind("srch_tgt_no")))
						.and(S0_TA1.div_seq.eq(bind("div_seq")))
						.and(S0_T3.oper_act_no.isNotNull())
					)
			)
			.setJoinInfo(
				joinInfo(
					j -> j
						.add(MST_WK_SCHD_R.class, r -> toCondition(
							r.getStringNE("join_wk_schd_no_")
						))
						.addSelect(m -> toArray(
							m.disp_seq,
							m.oper_inst_no,
							m.wk_cost_calc_flg,
							m.wk_schd_no
						))
						.addMap((r, m) -> {
							r.setBooleanNE("wk_cost_calc_flg", m.wk_cost_calc_flg());
							r.setStringNE("wk_schd_no", m.wk_schd_no());
							r.setNumberNE("disp_seq", m.disp_seq());
					}),
					j -> j
						.add(MAM_WK_COST_R.class, r -> toCondition(
							r.getStringNE("wk_cost_cd")
						))
						.addSelect(m -> toArray(
							m.dec_place,
							m.wk_cost_nm,
							m.wk_cost_unit_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("wk_cost_nm", m.wk_cost_nm());
							r.setStringNE("wk_cost_unit_nm", m.wk_cost_unit_nm());
							r.setNumberNE("wk_cost_dec_place", m.dec_place());
					}),
					j -> j
						.add(MAM_WK_DAY_R.class, r -> toCondition(
							r.getStringNE("wk_day_cd")
						))
						.addSelect(m -> toArray(
							m.wk_day_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("wk_day_nm", m.wk_day_nm());
					}),
					j -> j
						.add(MAM_WK_RSN_R.class, r -> toCondition(
							r.getStringNE("wk_rsn_cd")
						))
						.addSelect(m -> toArray(
							m.wk_rsn_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("wk_rsn_nm", m.wk_rsn_nm());
					}),
					j -> j
						.add(MAM_USR_R.class, r -> toCondition(
							r.getStringNE("wk_usr_cd")
						))
						.addSelect(m -> toArray(
							m.usr_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("wk_usr_nm", m.usr_nm());
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
	 * -- MSBCL1100_MST_YIELD_ACT_REM_Query_S01
	 */
	static MCQueryPlan MSBCL1100_MST_YIELD_ACT_REM_S01() {
		MST_YIELD_ACT_REM_R S0_T1 = MST_YIELD_ACT_REM_R.create("T1");
		MST_YIELD_SCHD_R S0_T2 = MST_YIELD_SCHD_R.create("T2");
		MSW_YIELD_ACT_REM_KEY_R S1_KEY = MSW_YIELD_ACT_REM_KEY_R.create("KEY");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBCL1100_MST_YIELD_ACT_REM_Query_S01")
					.mainQuery()
					.select(
						S0_T2.oper_inst_no,
						S0_T2.itm_cd,
						S0_T2.itm_sub1,
						S0_T2.itm_sub2,
						S0_T2.itm_sub3,
						S0_T2.yield_typ,
						nullValue().as("trd_unit_yield_act_qty"),
						S0_T2.trd_unit_cd,
						nullValue().as("base_unit_yield_act_qty"),
						cases()
							.when(S0_T1.div_seq.eq(value(0)))
								.then(S0_T2.base_unit_yield_qty.subtract(S0_T1.base_unit_yield_qty))
							.otherwise(S0_T1.base_unit_yield_qty).as("base_unit_yield_schd_qty"),
						cases()
							.when(S0_T1.div_seq.eq(value(0)))
								.then(S0_T2.base_unit_yield_qty.subtract(S0_T1.base_unit_yield_qty))
							.otherwise(S0_T1.base_unit_yield_qty).as("base_unit_yield_rem_qty"),
						S0_T2.base_unit_cd,
						nullValue().as("act_dt"),
						nullValue().as("act_hm"),
						nullValue().as("ac_dt"),
						S0_T2.lot_no,
						S0_T2.sublot_no,
						value(false).as("same_lot_flg"),
						nullValue().as("yield_rsn_cd"),
						nullValue().as("yield_rsn_nm"),
						nullValue().as("gd_cd"),
						nullValue().as("gd_nm"),
						S0_T2.strg_loc_cd,
						S0_T2.strg_str_ln_cd,
						nullValue().as("yield_rate"),
						S0_T2.inst_rpt_rmrks,
						S0_T2.insp_cnt_rmrks,
						nullValue().as("yield_act_intr_rmrks"),
						nullValue().as("yield_act_rpt_rmrks"),
						nullValue().as("trd_rmrks"),
						nullValue().as("yield_act_sub_char1"),
						nullValue().as("yield_act_sub_char2"),
						nullValue().as("yield_act_sub_char3"),
						S0_T2.yield_schd_no,
						nullValue().as("yield_act_no"),
						S0_T1.stk_lst_prnt_flg,
						nullValue().as("mes_id"),
						nullValue().as("data_no"),
						cases()
							.when(S0_T1.div_seq.eq(value(0)))
								.then(value(MSC_MFG_STS_TYP.ORD.value()))
							.otherwise(S0_T1.mfg_sts_typ).as("mfg_sts_typ"),
						S0_T2.disp_seq
					)
					.from(
						S0_T1
						.innerJoin(S0_T2).on(
							bracket(
								S0_T1.yield_schd_no.eq(S0_T2.yield_schd_no)
							)
						)
					)
					.where(
						value(0).eq(value(0))
						.and(S0_T1.mfg_inst_no.eq(bind("srch_tgt_no")))
						.and(S0_T1.div_seq.eq(bind("div_seq")))
						.and(
							S0_T2.yield_typ.in(
								value(MAC_YIELD_TYP.GOOD.value()),
								value(MAC_YIELD_TYP.DFCT.value())
							)
						)
						.and(S0_T2.can_flg.eq(value(false)))
						.and(
							notExists(
								subQuery()
								.select(S1_KEY.yield_schd_no)
								.from(S1_KEY)
								.where(
									S0_T1.yield_schd_no.eq(S1_KEY.yield_schd_no)
								)
							)
						)
					)
			)
			.setJoinInfo(
				joinInfo(
					j -> j
						.add(MAM_ITM_R.class, r -> toCondition(
							r.getStringNE("itm_cd"),
							r.getStringNE("itm_sub1"),
							r.getStringNE("itm_sub2"),
							r.getStringNE("itm_sub3")
						))
						.addSelect(m -> toArray(
							m.dec_place,
							m.lot_mng_typ,
							m.lot_no_ptn_cd,
							m.lot_no_typ,
							m.rnd_typ,
							m.sublot_mng_typ,
							m.sublot_no_ptn_cd,
							m.sublot_no_typ
						))
						.addMap((r, m) -> {
							r.setNumberNE("base_unit_dec_place", m.dec_place());
							r.setStringNE("base_unit_conv_rnd_typ", m.rnd_typ());
							r.setStringNE("lot_mng_typ", m.lot_mng_typ());
							r.setStringNE("lot_no_typ", m.lot_no_typ());
							r.setStringNE("lot_no_ptn_cd", m.lot_no_ptn_cd());
							r.setStringNE("sublot_mng_typ", m.sublot_mng_typ());
							r.setStringNE("sublot_no_typ", m.sublot_no_typ());
							r.setStringNE("sublot_no_ptn_cd", m.sublot_no_ptn_cd());
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
							r.setStringNE("trd_unit_conv_rnd_typ", m.rnd_typ());
							r.setNumberNE("conv_base_qty", m.conv_base_qty());
							r.setNumberNE("conv_qty", m.conv_qty());
					}),
					j -> j
						.add(MAM_LOC_R.class, r -> toCondition(
							r.getStringNE("strg_loc_cd")
						))
						.addSelect(m -> toArray(
							m.loc_nm,
							m.str_ln_tgt_flg
						))
						.addMap((r, m) -> {
							r.setStringNE("strg_loc_nm", m.loc_nm());
							r.setBooleanNE("strg_str_ln_tgt_flg", m.str_ln_tgt_flg());
					}),
					j -> j
						.add(MAM_STR_LN_R.class, r -> toCondition(
							r.getStringNE("strg_loc_cd"),
							r.getStringNE("strg_str_ln_cd")
						))
						.addSelect(m -> toArray(
							m.str_ln_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("strg_str_ln_nm", m.str_ln_nm());
					})
				)
			);
	}
	
	/**
	 * -- MSBCL1100_MST_YIELD_ACT_REM_Query_S02
	 */
	static MCQueryPlan MSBCL1100_MST_YIELD_ACT_REM_S02() {
		MST_YIELD_ACT_REM_R S0_T1 = MST_YIELD_ACT_REM_R.create("T1");
		MST_YIELD_SCHD_R S0_T2 = MST_YIELD_SCHD_R.create("T2");
		MSW_YIELD_ACT_REM_KEY_R S1_KEY = MSW_YIELD_ACT_REM_KEY_R.create("KEY");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBCL1100_MST_YIELD_ACT_REM_Query_S02")
					.mainQuery()
					.select(
						S0_T2.oper_inst_no,
						S0_T2.itm_cd,
						S0_T2.itm_sub1,
						S0_T2.itm_sub2,
						S0_T2.itm_sub3,
						nullValue().as("trd_unit_yield_act_qty"),
						S0_T2.trd_unit_cd,
						cases()
							.when(S0_T1.div_seq.eq(value(0)))
								.then(S0_T2.base_unit_yield_qty.subtract(S0_T1.base_unit_yield_qty))
							.otherwise(S0_T1.base_unit_yield_qty).as("base_unit_yield_schd_qty"),
						cases()
							.when(S0_T1.div_seq.eq(value(0)))
								.then(S0_T2.base_unit_yield_qty.subtract(S0_T1.base_unit_yield_qty))
							.otherwise(S0_T1.base_unit_yield_qty).as("base_unit_yield_rem_qty"),
						nullValue().as("base_unit_yield_act_qty"),
						S0_T2.base_unit_cd,
						nullValue().as("act_dt"),
						nullValue().as("act_hm"),
						nullValue().as("ac_dt"),
						S0_T2.lot_no,
						S0_T2.sublot_no,
						value(false).as("same_lot_flg"),
						S0_T2.sno1,
						S0_T2.sno2,
						S0_T2.sno3,
						S0_T2.sno4,
						nullValue().as("yield_rsn_cd"),
						nullValue().as("yield_rsn_nm"),
						value(MAC_QUALITY_TYP.GOOD.value()).as("quality_typ"),
						nullValue().as("gd_cd"),
						nullValue().as("gd_nm"),
						S0_T2.strg_loc_cd,
						S0_T2.strg_str_ln_cd,
						nullValue().as("yield_rate"),
						nullValue().as("yield_act_intr_rmrks"),
						nullValue().as("trd_rmrks"),
						nullValue().as("yield_act_sub_char1"),
						nullValue().as("yield_act_sub_char2"),
						nullValue().as("yield_act_sub_char3"),
						S0_T2.yield_schd_no,
						nullValue().as("yield_act_no"),
						S0_T1.stk_lst_prnt_flg,
						nullValue().as("mes_id"),
						nullValue().as("data_no"),
						cases()
							.when(S0_T1.div_seq.eq(value(0)))
								.then(value(MSC_MFG_STS_TYP.ORD.value()))
							.otherwise(S0_T1.mfg_sts_typ).as("mfg_sts_typ"),
						S0_T2.disp_seq
					)
					.from(
						S0_T1
						.innerJoin(S0_T2).on(
							bracket(
								S0_T1.yield_schd_no.eq(S0_T2.yield_schd_no)
							)
						)
					)
					.where(
						value(0).eq(value(0))
						.and(S0_T1.mfg_inst_no.eq(bind("srch_tgt_no")))
						.and(S0_T1.div_seq.eq(bind("div_seq")))
						.and(S0_T2.yield_typ.eq(value(MAC_YIELD_TYP.BYPROD.value())))
						.and(S0_T2.can_flg.eq(value(false)))
						.and(
							notExists(
								subQuery()
								.select(S1_KEY.yield_schd_no)
								.from(S1_KEY)
								.where(
									S0_T1.yield_schd_no.eq(S1_KEY.yield_schd_no)
								)
							)
						)
					)
			)
			.setJoinInfo(
				joinInfo(
					j -> j
						.add(MAM_ITM_R.class, r -> toCondition(
							r.getStringNE("itm_cd"),
							r.getStringNE("itm_sub1"),
							r.getStringNE("itm_sub2"),
							r.getStringNE("itm_sub3")
						))
						.addSelect(m -> toArray(
							m.dec_place,
							m.itm_nm,
							m.lot_mng_typ,
							m.lot_no_ptn_cd,
							m.lot_no_typ,
							m.rnd_typ,
							m.sno1_mng_typ,
							m.sno2_mng_typ,
							m.sno3_mng_typ,
							m.sno4_mng_typ,
							m.sublot_mng_typ,
							m.sublot_no_ptn_cd,
							m.sublot_no_typ
						))
						.addMap((r, m) -> {
							r.setStringNE("itm_nm", m.itm_nm());
							r.setStringNE("lot_mng_typ", m.lot_mng_typ());
							r.setStringNE("lot_no_typ", m.lot_no_typ());
							r.setStringNE("lot_no_ptn_cd", m.lot_no_ptn_cd());
							r.setStringNE("sublot_mng_typ", m.sublot_mng_typ());
							r.setStringNE("sublot_no_typ", m.sublot_no_typ());
							r.setStringNE("sublot_no_ptn_cd", m.sublot_no_ptn_cd());
							r.setStringNE("sno1_mng_typ", m.sno1_mng_typ());
							r.setStringNE("sno2_mng_typ", m.sno2_mng_typ());
							r.setStringNE("sno3_mng_typ", m.sno3_mng_typ());
							r.setStringNE("sno4_mng_typ", m.sno4_mng_typ());
							r.setNumberNE("base_unit_dec_place", m.dec_place());
							r.setStringNE("base_unit_conv_rnd_typ", m.rnd_typ());
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
							r.setStringNE("trd_unit_conv_rnd_typ", m.rnd_typ());
							r.setNumberNE("conv_base_qty", m.conv_base_qty());
							r.setNumberNE("conv_qty", m.conv_qty());
					}),
					j -> j
						.add(MAM_LOC_R.class, r -> toCondition(
							r.getStringNE("strg_loc_cd")
						))
						.addSelect(m -> toArray(
							m.loc_nm,
							m.str_ln_tgt_flg
						))
						.addMap((r, m) -> {
							r.setStringNE("strg_loc_nm", m.loc_nm());
							r.setBooleanNE("strg_str_ln_tgt_flg", m.str_ln_tgt_flg());
					}),
					j -> j
						.add(MAM_STR_LN_R.class, r -> toCondition(
							r.getStringNE("strg_loc_cd"),
							r.getStringNE("strg_str_ln_cd")
						))
						.addSelect(m -> toArray(
							m.str_ln_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("strg_str_ln_nm", m.str_ln_nm());
					})
				)
			);
	}
	
	/**
	 * -- MSBCL1100_MST_YIELD_ACT_Query_S01
	 */
	static MCQueryPlan MSBCL1100_MST_YIELD_ACT_S01() {
		MST_YIELD_ACT_R S0_T3 = MST_YIELD_ACT_R.create("T3");
		MST_YIELD_ACT_REM_R S0_T4 = MST_YIELD_ACT_REM_R.create("T4");
		MST_YIELD_SCHD_R S0_T2 = MST_YIELD_SCHD_R.create("T2");
		MST_MFG_ACT_R S0_TA1 = MST_MFG_ACT_R.create("TA1");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBCL1100_MST_YIELD_ACT_Query_S01")
					.mainQuery()
					.select(
						S0_T2.oper_inst_no,
						S0_T3.oper_act_no,
						S0_T3.itm_cd,
						S0_T3.itm_sub1,
						S0_T3.itm_sub2,
						S0_T3.itm_sub3,
						S0_T3.yield_typ,
						S0_T3.trd_unit_qty.as("trd_unit_yield_act_qty"),
						S0_T3.trd_unit_cd,
						S0_T3.base_unit_qty.as("base_unit_yield_act_qty"),
						S0_T4.base_unit_yield_qty.as("base_unit_yield_schd_qty"),
						S0_T4.base_unit_yield_rem_qty.as("base_unit_yield_rem_qty"),
						S0_T3.base_unit_cd,
						trunc(
							S0_T3.act_tm,
							MCDateFmt.DD
						).as("act_dt"),
						S0_T3.act_tm.as("act_hm"),
						S0_T3.ac_dt,
						S0_T3.lot_no,
						S0_T3.sublot_no,
						S0_T3.lot_ctl_flg.as("same_lot_flg"),
						S0_T3.yield_rsn_cd,
						S0_T3.gd_cd,
						S0_T3.strg_loc_cd,
						S0_T3.strg_str_ln_cd,
						S0_T3.yield_rate,
						S0_T2.inst_rpt_rmrks,
						S0_T3.insp_cnt_rmrks,
						S0_T3.intr_rmrks.as("yield_act_intr_rmrks"),
						S0_T3.act_rpt_rmrks.as("yield_act_rpt_rmrks"),
						S0_T3.trd_rmrks,
						S0_T3.sub_char1.as("yield_act_sub_char1"),
						S0_T3.sub_char2.as("yield_act_sub_char2"),
						S0_T3.sub_char3.as("yield_act_sub_char3"),
						S0_T2.yield_schd_no,
						S0_T3.yield_act_no,
						S0_T3.stk_lst_prnt_flg,
						S0_T3.mes_flg,
						S0_T3.ext_sys_cd,
						S0_T3.ext_yield_act_no,
						S0_T4.mfg_sts_typ,
						S0_T2.disp_seq,
						S0_T3.base_unit_qty.as("base_unit_yield_act_qty_bef")
					)
					.from(
						S0_T3
						.innerJoin(S0_T4).on(
							bracket(
								S0_T3.yield_schd_no.eq(S0_T4.yield_schd_no)
								.and(S0_T3.div_seq.eq(S0_T4.div_seq))
							)
						)
						.innerJoin(S0_T2).on(
							bracket(
								S0_T3.yield_schd_no.eq(S0_T2.yield_schd_no)
							)
						)
						.innerJoin(S0_TA1).on(
							bracket(
								S0_T3.mfg_act_no.eq(S0_TA1.mfg_act_no)
							)
						)
					)
					.where(
						value(0).eq(value(0))
						.and(S0_TA1.mfg_inst_no.eq(bind("srch_tgt_no")))
						.and(S0_TA1.div_seq.eq(bind("div_seq")))
						.and(
							S0_T3.yield_typ.in(
								value(MAC_YIELD_TYP.GOOD.value()),
								value(MAC_YIELD_TYP.DFCT.value())
							)
						)
					)
			)
			.setJoinInfo(
				joinInfo(
					j -> j
						.add(MAM_ITM_R.class, r -> toCondition(
							r.getStringNE("itm_cd"),
							r.getStringNE("itm_sub1"),
							r.getStringNE("itm_sub2"),
							r.getStringNE("itm_sub3")
						))
						.addSelect(m -> toArray(
							m.dec_place,
							m.lot_mng_typ,
							m.lot_no_ptn_cd,
							m.lot_no_typ,
							m.rnd_typ,
							m.sublot_mng_typ,
							m.sublot_no_ptn_cd,
							m.sublot_no_typ
						))
						.addMap((r, m) -> {
							r.setNumberNE("base_unit_dec_place", m.dec_place());
							r.setStringNE("base_unit_conv_rnd_typ", m.rnd_typ());
							r.setStringNE("lot_mng_typ", m.lot_mng_typ());
							r.setStringNE("lot_no_typ", m.lot_no_typ());
							r.setStringNE("lot_no_ptn_cd", m.lot_no_ptn_cd());
							r.setStringNE("sublot_mng_typ", m.sublot_mng_typ());
							r.setStringNE("sublot_no_typ", m.sublot_no_typ());
							r.setStringNE("sublot_no_ptn_cd", m.sublot_no_ptn_cd());
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
							r.setStringNE("trd_unit_conv_rnd_typ", m.rnd_typ());
							r.setNumberNE("conv_base_qty", m.conv_base_qty());
							r.setNumberNE("conv_qty", m.conv_qty());
					}),
					j -> j
						.add(MAM_LOC_R.class, r -> toCondition(
							r.getStringNE("strg_loc_cd")
						))
						.addSelect(m -> toArray(
							m.loc_nm,
							m.str_ln_tgt_flg
						))
						.addMap((r, m) -> {
							r.setStringNE("strg_loc_nm", m.loc_nm());
							r.setBooleanNE("strg_str_ln_tgt_flg", m.str_ln_tgt_flg());
					}),
					j -> j
						.add(MAM_STR_LN_R.class, r -> toCondition(
							r.getStringNE("strg_loc_cd"),
							r.getStringNE("strg_str_ln_cd")
						))
						.addSelect(m -> toArray(
							m.str_ln_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("strg_str_ln_nm", m.str_ln_nm());
					}),
					j -> j
						.add(MAM_BIZ_RSN_R.class, r -> toCondition(
							r.getStringNE("yield_rsn_cd")
						))
						.addSelect(m -> toArray(
							m.biz_rsn_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("yield_rsn_nm", m.biz_rsn_nm());
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
	 * -- MSBCL1100_MST_YIELD_ACT_Query_S02
	 */
	static MCQueryPlan MSBCL1100_MST_YIELD_ACT_S02() {
		MST_YIELD_ACT_R S0_T3 = MST_YIELD_ACT_R.create("T3");
		MAM_ITM_R S0_M1 = MAM_ITM_R.create("M1");
		MST_MFG_ACT_R S0_TA1 = MST_MFG_ACT_R.create("TA1");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBCL1100_MST_YIELD_ACT_Query_S02")
					.mainQuery()
					.select(
						S0_T3.oper_act_no,
						S0_T3.itm_cd,
						S0_T3.itm_sub1,
						S0_T3.itm_sub2,
						S0_T3.itm_sub3,
						S0_M1.itm_nm,
						S0_M1.lot_mng_typ,
						S0_M1.lot_no_typ,
						S0_M1.lot_no_ptn_cd,
						S0_M1.sublot_mng_typ,
						S0_M1.sublot_no_typ,
						S0_M1.sublot_no_ptn_cd,
						S0_M1.sno1_mng_typ,
						S0_M1.sno2_mng_typ,
						S0_M1.sno3_mng_typ,
						S0_M1.sno4_mng_typ,
						S0_T3.trd_unit_qty.as("trd_unit_yield_act_qty"),
						S0_T3.trd_unit_cd,
						S0_T3.base_unit_qty.as("base_unit_yield_act_qty"),
						S0_T3.base_unit_cd,
						S0_M1.dec_place.as("base_unit_dec_place"),
						S0_M1.rnd_typ.as("base_unit_conv_rnd_typ"),
						trunc(
							S0_T3.act_tm,
							MCDateFmt.DD
						).as("act_dt"),
						S0_T3.act_tm.as("act_hm"),
						S0_T3.ac_dt,
						S0_T3.lot_no,
						S0_T3.sublot_no,
						S0_T3.sno1,
						S0_T3.sno2,
						S0_T3.sno3,
						S0_T3.sno4,
						S0_T3.lot_ctl_flg.as("same_lot_flg"),
						S0_T3.yield_rsn_cd,
						S0_T3.gd_cd,
						S0_T3.quality_typ,
						S0_T3.strg_loc_cd,
						S0_T3.strg_str_ln_cd,
						S0_T3.yield_rate,
						S0_T3.intr_rmrks.as("yield_act_intr_rmrks"),
						S0_T3.trd_rmrks,
						S0_T3.sub_char1.as("yield_act_sub_char1"),
						S0_T3.sub_char2.as("yield_act_sub_char2"),
						S0_T3.sub_char3.as("yield_act_sub_char3"),
						S0_T3.yield_act_no,
						S0_T3.mes_flg,
						S0_T3.ext_sys_cd,
						S0_T3.ext_yield_act_no,
						S0_T3.stk_lst_prnt_flg,
						// this field is appended by sql coverter.
						S0_T3.yield_schd_no.as("join_yield_schd_no_"),
						// this field is appended by sql coverter.
						S0_T3.div_seq.as("join_div_seq_"),
						S0_T3.base_unit_qty.as("base_unit_yield_act_qty_bef")
					)
					.from(
						S0_T3
						.innerJoin(S0_M1).on(
							bracket(
								S0_T3.itm_cd.eq(S0_M1.itm_cd)
								.and(S0_T3.itm_sub1.eq(S0_M1.itm_sub1))
								.and(S0_T3.itm_sub2.eq(S0_M1.itm_sub2))
								.and(S0_T3.itm_sub3.eq(S0_M1.itm_sub3))
							)
						)
						.innerJoin(S0_TA1).on(
							bracket(
								S0_T3.mfg_act_no.eq(S0_TA1.mfg_act_no)
							)
						)
					)
					.where(
						value(0).eq(value(0))
						.and(S0_TA1.mfg_inst_no.eq(bind("srch_tgt_no")))
						.and(S0_TA1.div_seq.eq(bind("div_seq")))
						.and(S0_T3.yield_typ.eq(value(MAC_YIELD_TYP.BYPROD.value())))
					)
			)
			.setJoinInfo(
				joinInfo(
					j -> j
						.add(MST_YIELD_ACT_REM_R.class, r -> toCondition(
							r.getStringNE("join_yield_schd_no_"),
							r.getNumberNE("join_div_seq_")
						))
						.addSelect(m -> toArray(
							m.base_unit_yield_qty,
							m.base_unit_yield_rem_qty,
							m.mfg_sts_typ
						))
						.addMap((r, m) -> {
							r.setNumberNE("base_unit_yield_schd_qty", m.base_unit_yield_qty());
							r.setNumberNE("base_unit_yield_rem_qty", m.base_unit_yield_rem_qty());
							r.setStringNE("mfg_sts_typ", m.mfg_sts_typ());
					}),
					j -> j
						.add(MST_YIELD_SCHD_R.class, r -> toCondition(
							r.getStringNE("join_yield_schd_no_")
						))
						.addSelect(m -> toArray(
							m.disp_seq,
							m.oper_inst_no,
							m.yield_schd_no
						))
						.addMap((r, m) -> {
							r.setStringNE("oper_inst_no", m.oper_inst_no());
							r.setStringNE("yield_schd_no", m.yield_schd_no());
							r.setNumberNE("disp_seq", m.disp_seq());
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
							r.setStringNE("trd_unit_conv_rnd_typ", m.rnd_typ());
							r.setNumberNE("conv_base_qty", m.conv_base_qty());
							r.setNumberNE("conv_qty", m.conv_qty());
					}),
					j -> j
						.add(MAM_LOC_R.class, r -> toCondition(
							r.getStringNE("strg_loc_cd")
						))
						.addSelect(m -> toArray(
							m.loc_nm,
							m.str_ln_tgt_flg
						))
						.addMap((r, m) -> {
							r.setStringNE("strg_loc_nm", m.loc_nm());
							r.setBooleanNE("strg_str_ln_tgt_flg", m.str_ln_tgt_flg());
					}),
					j -> j
						.add(MAM_STR_LN_R.class, r -> toCondition(
							r.getStringNE("strg_loc_cd"),
							r.getStringNE("strg_str_ln_cd")
						))
						.addSelect(m -> toArray(
							m.str_ln_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("strg_str_ln_nm", m.str_ln_nm());
					}),
					j -> j
						.add(MAM_BIZ_RSN_R.class, r -> toCondition(
							r.getStringNE("yield_rsn_cd")
						))
						.addSelect(m -> toArray(
							m.biz_rsn_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("yield_rsn_nm", m.biz_rsn_nm());
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
}