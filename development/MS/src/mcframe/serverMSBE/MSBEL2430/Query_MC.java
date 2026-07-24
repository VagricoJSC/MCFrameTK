package mcframe.serverMSBE.MSBEL2430;

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
	 * -- MSBEL2430_MST_ACXFR_ACT_Query_S01
	 */
	static MCQueryPlan MSBEL2430_MST_ACXFR_ACT_S01() {
		MST_ACXFR_ACT_R S0_T1 = MST_ACXFR_ACT_R.create("T1");
		MST_ACXFR_ACT_D_R S0_T2 = MST_ACXFR_ACT_D_R.create("T2");
		MAVM_RD_LOC_R S0_M0 = MAVM_RD_LOC_R.create("M0");
		MST_ACXFR_INST_D_R S0_T6 = MST_ACXFR_INST_D_R.create("T6");
		MAM_TRD_R S0_M1 = MAM_TRD_R.create("M1");
		MAM_WG_R S0_M2 = MAM_WG_R.create("M2");
		MAM_LOC_R S0_M3 = MAM_LOC_R.create("M3");
		MAM_STR_LN_R S0_M4 = MAM_STR_LN_R.create("M4");
		MAM_ITM_R S0_M6 = MAM_ITM_R.create("M6");
		MAM_CO_R S0_M13 = MAM_CO_R.create("M13");
		MAM_BIZ_RSN_R S0_M18 = MAM_BIZ_RSN_R.create("M18");
		MAM_DPT_R S0_M19 = MAM_DPT_R.create("M19");
		MAM_ITM_TYP_D_R S0_M25 = MAM_ITM_TYP_D_R.create("M25");
		MAM_LOC_GRP_R S0_M26 = MAM_LOC_GRP_R.create("M26");
		MAM_USR_R S0_M27 = MAM_USR_R.create("M27");
		MAM_DPT_R S0_M28 = MAM_DPT_R.create("M28");
		MSVT_LOT_LIST_R S0_M29 = MSVT_LOT_LIST_R.create("M29");
		MAM_SUNDRY_ITM_R S0_M32 = MAM_SUNDRY_ITM_R.create("M32");
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
		MST_DLV_SLIP_R S1_T9 = MST_DLV_SLIP_R.create("T9");
		
		MCDynamicSQLID DS0C_ITM_GRP = createDynamicSQLID("DS0C_ITM_GRP");
		
		return createQueryPlan()
			.setQuery(
				sql("MSBEL2430_MST_ACXFR_ACT_Query_S01")
					.mainQuery()
					.select(
						nullValue().as("abort_flg"),
						S0_T1.trd_cd,
						S0_T1.wg_cd,
						S0_T2.itm_cd,
						S0_T2.itm_sub1,
						S0_T2.itm_sub2,
						S0_T2.itm_sub3,
						decode(
							S0_M6.sundry_itm_flg,
							value(true),
							S0_M32.itm_nm,
							S0_M6.itm_nm
						).as("itm_nm"),
						S0_T2.lot_no,
						S0_T2.sublot_no,
						S0_T2.trd_unit_cd,
						S0_T2.trd_unit_qty.as("trd_act_unit_qty"),
						S0_T2.base_unit_cd,
						S0_T2.base_unit_qty,
						S0_T2.pack_unit_cd,
						S0_T2.pack_unit_qty,
						MAPA_STD_COST$F_GET_STD_AMT(
							S0_T2.itm_cd,
							S0_T2.itm_sub1,
							S0_T2.itm_sub2,
							S0_T2.itm_sub3,
							S0_T1.ac_dt,
							S0_T1.wg_cd,
							S0_T2.base_unit_qty,
							S0_M13.stk_std_upri_typ
						).as("stk_amt"),
						S0_M13.base_cur_cd,
						S0_M13.stk_amt_dec_place.as("base_cur_dec_place"),
						trunc(
							S0_T1.acxfr_act_tm,
							MCDateFmt.DD
						).as("acxfr_act_dt"),
						S0_T1.acxfr_act_tm.as("acxfr_act_hm"),
						S0_T1.ac_dt,
						S0_T1.loc_cd,
						S0_T2.str_ln_cd,
						S0_T2.stk_arrv_bp_cd,
						S0_T2.quality_typ,
						S0_T2.stk_insp_typ,
						S0_T2.stk_id_typ,
						S0_T2.gd_cd,
						S0_T2.stk_bp_cd,
						S0_T2.sno1,
						S0_T2.sno2,
						S0_T2.sno3,
						S0_T2.sno4,
						S0_T2.rsn_cd,
						S0_T2.bd_dpt_cd,
						S0_M19.dpt_nm.as("bd_dpt_nm"),
						S0_T2.bd_itm_cd,
						S0_T2.bd_itm_sub1,
						S0_T2.bd_itm_sub2,
						S0_T2.bd_itm_sub3,
						S0_T2.bd_lot_no,
						S0_T2.bd_sublot_no,
						S0_T2.bd_sno1,
						S0_T2.bd_sno2,
						S0_T2.bd_sno3,
						S0_T2.bd_sno4,
						S0_T2.bd_bp_cd,
						S0_T2.bd_loc_cd,
						S0_T2.bd_ctg_cd,
						S0_T2.bd_oper_cd,
						S0_T1.trd_ptn_typ,
						S0_T2.acxfr_schd_no,
						S0_T1.acxfr_inst_no,
						S0_T2.acxfr_inst_d_no,
						S0_T1.acxfr_act_no,
						S0_T2.acxfr_act_d_no,
						S0_T2.wms_flg,
						S0_T2.ext_sys_cd,
						S0_T2.ext_acxfr_act_no,
						S0_T2.dspsl_no,
						S0_T1.acxfr_act_rev,
						bracket(
							subQuery()
							.select(max(S1_T9.dlv_slip_no))
							.from(S1_T9)
							.where(
								S0_T1.acxfr_act_no.eq(S1_T9.dlv_slip_act_no)
								.and(S1_T9.slip_sts_typ.eq(value(MAC_SLIP_STS_TYP.CRT.value())))
								.and(S1_T9.trn_typ.eq(value(MSC_TRN_TYP.ACXFR.value())))
							)
						).as("dlv_slip_no"),
						S0_T2.aprv_flg,
						S0_T2.aprv_no,
						S0_T2.fix_no_typ,
						S0_T2.fix_no,
						S0_T1.intr_rmrks.as("act_intr_rmrks"),
						S0_T1.trd_rmrks.as("act_trd_rmrks"),
						S0_T1.sub_char1.as("act_sub_char1"),
						S0_T1.sub_char2.as("act_sub_char2"),
						S0_T1.sub_char3.as("act_sub_char3"),
						S0_T2.intr_d_rmrks.as("act_intr_d_rmrks"),
						S0_T2.trd_d_rmrks.as("act_trd_d_rmrks"),
						S0_T2.sub_char1.as("act_d_sub_char1"),
						S0_T2.sub_char2.as("act_d_sub_char2"),
						S0_T2.sub_char3.as("act_d_sub_char3"),
						S0_T1.act_usr_cd,
						S0_T1.act_dpt_cd,
						S0_M28.dpt_nm.as("act_dpt_nm"),
						S0_T1.ins_usr_id,
						S0_T1.ins_usr_nm,
						S0_T1.ins_func_id,
						S0_T1.ins_ts,
						S0_T1.upd_usr_id,
						S0_T1.upd_usr_nm,
						S0_T1.upd_func_id,
						S0_T1.upd_ts,
						S0_T1.upd_srv_req_no,
						S0_M6.itm_typ,
						S0_M6.itm_typ_d_cd,
						addDynamicSelect(DS0C_ITM_GRP)
					)
					.from(
						S0_T1
						.innerJoin(S0_T2).on(S0_T1.acxfr_act_no.eq(S0_T2.acxfr_act_no))
						.innerJoin(S0_M0).on(S0_M0.loc_cd.eq(S0_T1.loc_cd))
						.leftOuterJoin(S0_T6).on(S0_T6.acxfr_inst_d_no.eq(S0_T2.acxfr_inst_d_no))
						.leftOuterJoin(S0_M6).on(
							bracket(
								S0_T2.itm_cd.eq(S0_M6.itm_cd)
								.and(S0_T2.itm_sub1.eq(S0_M6.itm_sub1))
								.and(S0_T2.itm_sub2.eq(S0_M6.itm_sub2))
								.and(S0_T2.itm_sub3.eq(S0_M6.itm_sub3))
							)
						)
						.leftOuterJoin(S0_M13).on(value(0).eq(value(0)))
						.leftOuterJoin(S0_M19).on(
							bracket(
								S0_T2.bd_dpt_cd.eq(S0_M19.dpt_cd)
								.and(S0_T1.ac_dt.between(S0_M19.st_dt, S0_M19.end_dt))
							)
						)
						.leftOuterJoin(S0_M28).on(
							bracket(
								S0_T1.act_dpt_cd.eq(S0_M28.dpt_cd)
								.and(S0_T1.ac_dt.between(S0_M28.st_dt, S0_M28.end_dt))
							)
						)
						.leftOuterJoin(S0_M32).on(
							bracket(
								S0_T2.itm_cd.eq(S0_M32.itm_cd)
								.and(S0_T2.itm_sub1.eq(S0_M32.itm_sub1))
								.and(S0_T2.itm_sub2.eq(S0_M32.itm_sub2))
								.and(S0_T2.itm_sub3.eq(S0_M32.itm_sub3))
								.and(S0_T2.sno1.eq(S0_M32.sno1))
								.and(S0_T2.sno2.eq(S0_M32.sno2))
								.and(S0_T2.sno3.eq(S0_M32.sno3))
								.and(S0_T2.sno4.eq(S0_M32.sno4))
							)
						)
						.addDynamicView()
						.addDynamicView(DS0C_ITM_GRP)
					)
					.where(
						value(0).eq(value(0))
						.and(S0_T1.can_flg.eq(value(false)))
						.and(S0_T2.can_flg.eq(value(false)))
						.cutoff$and(S0_T1.trd_cd.like(bind("trd_cd")))
						.addDynamicPredicate()
						.cutoff$and(S0_T1.trd_ptn_typ.like(bind("trd_ptn_typ")))
						.cutoff$and(S0_T1.wg_cd.like(bind("wg_cd")))
						.cutoff$and(S0_T2.acxfr_schd_no.like(bind("acxfr_schd_no")))
						.cutoff$and(S0_T1.acxfr_inst_no.like(bind("acxfr_inst_no")))
						.cutoff$and(S0_T2.acxfr_inst_d_no.like(bind("acxfr_inst_d_no")))
						.cutoff$and(S0_T1.acxfr_act_no.like(bind("acxfr_act_no")))
						.cutoff$and(S0_T2.acxfr_act_d_no.like(bind("acxfr_act_d_no")))
						.cutoff$and(S0_T1.loc_cd.like(bind("loc_cd")))
						.cutoff$and(S0_T2.str_ln_cd.like(bind("str_ln_cd")))
						.cutoff$and(S0_M6.itm_typ.like(bind("itm_typ")))
						.cutoff$and(S0_M6.itm_typ_d_cd.like(bind("itm_typ_d_cd")))
						.cutoff$and(S0_T2.itm_cd.like(bind("itm_cd")))
						.cutoff$and(S0_T2.itm_sub1.like(bind("itm_sub1")))
						.cutoff$and(S0_T2.itm_sub2.like(bind("itm_sub2")))
						.cutoff$and(S0_T2.itm_sub3.like(bind("itm_sub3")))
						.cutoff$and(
							decode(
								S0_M6.sundry_itm_flg,
								value(true),
								S0_M32.itm_nm,
								S0_M6.itm_nm
							).like(bind("itm_nm"))
						)
						.cutoff$and(S0_T2.lot_no.like(bind("lot_no")))
						.cutoff$and(S0_T2.sublot_no.like(bind("sublot_no")))
						.cutoff$and(S0_T2.sno1.like(bind("sno1")))
						.cutoff$and(S0_T2.sno2.like(bind("sno2")))
						.cutoff$and(S0_T2.sno3.like(bind("sno3")))
						.cutoff$and(S0_T2.sno4.like(bind("sno4")))
						.cutoff$and(S0_T2.bd_dpt_cd.like(bind("bd_dpt_cd")))
						.cutoff$and(S0_M19.dpt_nm.like(bind("bd_dpt_nm")))
						.cutoff$and(S0_T1.acxfr_act_tm.gte(bind("acxfr_act_hm_fr")))
						.cutoff$and(S0_T1.acxfr_act_tm.lte(bind("acxfr_act_hm_to")))
						.cutoff$and(S0_T1.ac_dt.gte(bind("ac_dt_fr")))
						.cutoff$and(S0_T1.ac_dt.lte(bind("ac_dt_to")))
						.cutoff$and(S0_T2.rsn_cd.like(bind("rsn_cd")))
						.cutoff$and(S0_T2.dspsl_no.like(bind("dspsl_no")))
						.cutoff$and(S0_T1.act_usr_cd.like(bind("act_usr_cd")))
						.cutoff$and(S0_T1.act_dpt_cd.like(bind("act_dpt_cd")))
						.cutoff$and(S0_M28.dpt_nm.like(bind("act_dpt_nm")))
						.cutoff$and(S0_T1.intr_rmrks.like(bind("act_intr_rmrks")))
						.cutoff$and(S0_T1.trd_rmrks.like(bind("act_trd_rmrks")))
						.cutoff$and(S0_T1.sub_char1.like(bind("act_sub_char1")))
						.cutoff$and(S0_T1.sub_char2.like(bind("act_sub_char2")))
						.cutoff$and(S0_T1.sub_char3.like(bind("act_sub_char3")))
						.cutoff$and(S0_T2.intr_d_rmrks.like(bind("act_intr_d_rmrks")))
						.cutoff$and(S0_T2.trd_d_rmrks.like(bind("act_trd_d_rmrks")))
						.cutoff$and(S0_T2.sub_char1.like(bind("act_d_sub_char1")))
						.cutoff$and(S0_T2.sub_char2.like(bind("act_d_sub_char2")))
						.cutoff$and(S0_T2.sub_char3.like(bind("act_d_sub_char3")))
						.cutoff$and(
							nvl(
								S0_T6.abort_flg,
								value(false)
							).neq(bind("abort_false"))
						)
						.and(
							bracket(
								bind("wms_flg").eq(value(true))
								.and(bind("not_wms_flg").eq(value(true)))
							)
							.or(
								bind("not_wms_flg").eq(value(false))
								.and(S0_T2.wms_flg.eq(value(true)))
							)
							.or(
								bind("wms_flg").eq(value(false))
								.and(
									S0_T2.wms_flg.eq(value(false))
									.or(S0_T2.wms_flg.isNull())
								)
							)
						)
						.cutoff$and(S0_T2.ext_acxfr_act_no.like(bind("ext_acxfr_act_no")))
						.addDynamicPredicate(DS0C_ITM_GRP)
					)
					.orderBy(
						S0_T2.acxfr_act_no.asc(),
						S0_T2.disp_seq.asc()
					)
			)
			.setDynamicSQLInfo(
				when(boundOr("trd_nm"))
					.view(v -> v.leftOuterJoin(S0_M1).on(S0_T1.trd_cd.eq(S0_M1.trd_cd)))
					.predicate(p -> p.cutoff$and(S0_M1.trd_nm.like(bind("trd_nm")))),
				when(boundOr("wg_nm"))
					.view(v -> v.leftOuterJoin(S0_M2).on(S0_T1.wg_cd.eq(S0_M2.wg_cd)))
					.predicate(p -> p.cutoff$and(S0_M2.wg_nm.like(bind("wg_nm")))),
				when(boundOr("loc_grp_cd", "loc_grp_nm", "loc_nm"))
					.view(v -> v.leftOuterJoin(S0_M3).on(S0_T1.loc_cd.eq(S0_M3.loc_cd)))
					.predicate(p -> p.cutoff$and(S0_M3.loc_nm.like(bind("loc_nm")))),
				when(boundOr("str_ln_nm"))
					.view(v -> v.leftOuterJoin(S0_M4).on(bracket(S0_T1.loc_cd.eq(S0_M4.loc_cd).and(S0_T2.str_ln_cd.eq(S0_M4.str_ln_cd)))))
					.predicate(p -> p.cutoff$and(S0_M4.str_ln_nm.like(bind("str_ln_nm")))),
				when(boundOr("rsn_nm"))
					.view(v -> v.leftOuterJoin(S0_M18).on(S0_T2.rsn_cd.eq(S0_M18.biz_rsn_cd)))
					.predicate(p -> p.cutoff$and(S0_M18.biz_rsn_nm.like(bind("rsn_nm")))),
				when(boundOr("itm_typ_d_nm"))
					.view(v -> v.leftOuterJoin(S0_M25).on(bracket(S0_M6.itm_typ.eq(S0_M25.itm_typ).and(S0_M6.itm_typ_d_cd.eq(S0_M25.itm_typ_d_cd)))))
					.predicate(p -> p.cutoff$and(S0_M25.itm_typ_d_nm.like(bind("itm_typ_d_nm")))),
				when(boundOr("loc_grp_cd", "loc_grp_nm"))
					.view(v -> v.leftOuterJoin(S0_M26).on(bracket(S0_M26.loc_grp_cd.eq(S0_M3.loc_grp_cd))))
					.predicate(p -> p.cutoff$and(S0_M26.loc_grp_cd.like(bind("loc_grp_cd"))).cutoff$and(S0_M26.loc_grp_nm.like(bind("loc_grp_nm")))),
				when(boundOr("act_usr_nm"))
					.view(v -> v.leftOuterJoin(S0_M27).on(S0_T1.act_usr_cd.eq(S0_M27.usr_cd)))
					.predicate(p -> p.cutoff$and(S0_M27.usr_nm.like(bind("act_usr_nm")))),
				when(boundOr("ver_no"))
					.view(v -> v.leftOuterJoin(S0_M29).on(bracket(S0_T2.itm_cd.eq(S0_M29.itm_cd).and(S0_T2.itm_sub1.eq(S0_M29.itm_sub1)).and(S0_T2.itm_sub2.eq(S0_M29.itm_sub2)).and(S0_T2.itm_sub3.eq(S0_M29.itm_sub3)).and(S0_T2.lot_no.eq(S0_M29.lot_no)).and(S0_T2.sublot_no.eq(S0_M29.sublot_no)))))
					.predicate(p -> p.cutoff$and(S0_M29.ver_no.like(bind("ver_no")))),
				when(boundOr("itm_grp_flg1"))
					.select(DS0C_ITM_GRP, S0_M6.itm_grp_cd1.as("itm_grp_cd1"), S0_MM1.itm_grp_nm.as("itm_grp_nm1"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM1).on(S0_M6.itm_grp_cd1.eq(S0_MM1.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP1.value()).eq(S0_MM1.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M6.itm_grp_cd1.like(bind("itm_grp_cd1"))).cutoff$and(S0_MM1.itm_grp_nm.like(bind("itm_grp_nm1")))),
				when(boundOr("itm_grp_flg2"))
					.select(DS0C_ITM_GRP, S0_M6.itm_grp_cd2.as("itm_grp_cd2"), S0_MM2.itm_grp_nm.as("itm_grp_nm2"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM2).on(S0_M6.itm_grp_cd2.eq(S0_MM2.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP2.value()).eq(S0_MM2.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M6.itm_grp_cd2.like(bind("itm_grp_cd2"))).cutoff$and(S0_MM2.itm_grp_nm.like(bind("itm_grp_nm2")))),
				when(boundOr("itm_grp_flg3"))
					.select(DS0C_ITM_GRP, S0_M6.itm_grp_cd3.as("itm_grp_cd3"), S0_MM3.itm_grp_nm.as("itm_grp_nm3"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM3).on(S0_M6.itm_grp_cd3.eq(S0_MM3.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP3.value()).eq(S0_MM3.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M6.itm_grp_cd3.like(bind("itm_grp_cd3"))).cutoff$and(S0_MM3.itm_grp_nm.like(bind("itm_grp_nm3")))),
				when(boundOr("itm_grp_flg4"))
					.select(DS0C_ITM_GRP, S0_M6.itm_grp_cd4.as("itm_grp_cd4"), S0_MM4.itm_grp_nm.as("itm_grp_nm4"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM4).on(S0_M6.itm_grp_cd4.eq(S0_MM4.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP4.value()).eq(S0_MM4.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M6.itm_grp_cd4.like(bind("itm_grp_cd4"))).cutoff$and(S0_MM4.itm_grp_nm.like(bind("itm_grp_nm4")))),
				when(boundOr("itm_grp_flg5"))
					.select(DS0C_ITM_GRP, S0_M6.itm_grp_cd5.as("itm_grp_cd5"), S0_MM5.itm_grp_nm.as("itm_grp_nm5"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM5).on(S0_M6.itm_grp_cd5.eq(S0_MM5.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP5.value()).eq(S0_MM5.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M6.itm_grp_cd5.like(bind("itm_grp_cd5"))).cutoff$and(S0_MM5.itm_grp_nm.like(bind("itm_grp_nm5")))),
				when(boundOr("itm_grp_flg6"))
					.select(DS0C_ITM_GRP, S0_M6.itm_grp_cd6.as("itm_grp_cd6"), S0_MM6.itm_grp_nm.as("itm_grp_nm6"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM6).on(S0_M6.itm_grp_cd6.eq(S0_MM6.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP6.value()).eq(S0_MM6.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M6.itm_grp_cd6.like(bind("itm_grp_cd6"))).cutoff$and(S0_MM6.itm_grp_nm.like(bind("itm_grp_nm6")))),
				when(boundOr("itm_grp_flg7"))
					.select(DS0C_ITM_GRP, S0_M6.itm_grp_cd7.as("itm_grp_cd7"), S0_MM7.itm_grp_nm.as("itm_grp_nm7"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM7).on(S0_M6.itm_grp_cd7.eq(S0_MM7.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP7.value()).eq(S0_MM7.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M6.itm_grp_cd7.like(bind("itm_grp_cd7"))).cutoff$and(S0_MM7.itm_grp_nm.like(bind("itm_grp_nm7")))),
				when(boundOr("itm_grp_flg8"))
					.select(DS0C_ITM_GRP, S0_M6.itm_grp_cd8.as("itm_grp_cd8"), S0_MM8.itm_grp_nm.as("itm_grp_nm8"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM8).on(S0_M6.itm_grp_cd8.eq(S0_MM8.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP8.value()).eq(S0_MM8.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M6.itm_grp_cd8.like(bind("itm_grp_cd8"))).cutoff$and(S0_MM8.itm_grp_nm.like(bind("itm_grp_nm8")))),
				when(boundOr("itm_grp_flg9"))
					.select(DS0C_ITM_GRP, S0_M6.itm_grp_cd9.as("itm_grp_cd9"), S0_MM9.itm_grp_nm.as("itm_grp_nm9"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM9).on(S0_M6.itm_grp_cd9.eq(S0_MM9.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP9.value()).eq(S0_MM9.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M6.itm_grp_cd9.like(bind("itm_grp_cd9"))).cutoff$and(S0_MM9.itm_grp_nm.like(bind("itm_grp_nm9")))),
				when(boundOr("itm_grp_flg10"))
					.select(DS0C_ITM_GRP, S0_M6.itm_grp_cd10.as("itm_grp_cd10"), S0_MM10.itm_grp_nm.as("itm_grp_nm10"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM10).on(S0_M6.itm_grp_cd10.eq(S0_MM10.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP10.value()).eq(S0_MM10.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M6.itm_grp_cd10.like(bind("itm_grp_cd10"))).cutoff$and(S0_MM10.itm_grp_nm.like(bind("itm_grp_nm10"))))
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
						.add(MST_ACXFR_SCHD_R.class, r -> toCondition(
							r.getStringNE("acxfr_schd_no")
						))
						.addSelect(m -> toArray(
							m.inst_typ
						))
						.addMap((r, m) -> {
							r.setStringNE("inst_typ", m.inst_typ());
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
						.add(MAM_LOC_R.class, r -> toCondition(
							r.getStringNE("loc_cd")
						))
						.addSelect(m -> toArray(
							m.loc_grp_cd,
							m.loc_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("loc_nm", m.loc_nm());
							r.setStringNE("join_loc_grp_cd_", m.loc_grp_cd());
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
							r.setNumberNE("trd_unit_dec_place", m.dec_place());
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
							m.dec_place
						))
						.addMap((r, m) -> {
							r.setNumberNE("base_unit_dec_place", m.dec_place());
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
						.add(MAM_CUR_R.class, r -> toCondition(
							r.getStringNE("base_cur_cd")
						))
						.addSelect(m -> toArray(
							m.cur_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("base_cur_nm", m.cur_nm());
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
							m.itm_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("bd_itm_nm", m.itm_nm());
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
						.add(MSVT_LOT_LIST_R.class, r -> toCondition(
							r.getStringNE("itm_cd"),
							r.getStringNE("itm_sub1"),
							r.getStringNE("itm_sub2"),
							r.getStringNE("itm_sub3"),
							r.getStringNE("lot_no"),
							r.getStringNE("sublot_no")
						))
						.addSelect(m -> toArray(
							m.ver_no
						))
						.addMap((r, m) -> {
							r.setStringNE("ver_no", m.ver_no());
					}),
					j -> j
						.add(MAVM_ITM_UNIT_R.class, r -> toCondition(
							r.getStringNE("itm_cd"),
							r.getStringNE("itm_sub1"),
							r.getStringNE("itm_sub2"),
							r.getStringNE("itm_sub3"),
							r.getStringNE("pack_unit_cd")
						))
						.addSelect(m -> toArray(
							m.dec_place
						))
						.addMap((r, m) -> {
							r.setNumberNE("pack_unit_dec_place", m.dec_place());
					}),
					j -> j
						.add(MAM_UNIT_R.class, r -> toCondition(
							r.getStringNE("pack_unit_cd")
						))
						.addSelect(m -> toArray(
							m.unit_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("pack_unit_nm", m.unit_nm());
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
	 * -- MSBEL2430_MST_ACXFR_INST_Query_S01
	 */
	static MCQueryPlan MSBEL2430_MST_ACXFR_INST_S01() {
		MST_ACXFR_INST_R S0_T1 = MST_ACXFR_INST_R.create("T1");
		MST_ACXFR_INST_D_R S0_T2 = MST_ACXFR_INST_D_R.create("T2");
		MAVM_RD_LOC_R S0_M0 = MAVM_RD_LOC_R.create("M0");
		MAM_TRD_R S0_M1 = MAM_TRD_R.create("M1");
		MAM_WG_R S0_M2 = MAM_WG_R.create("M2");
		MAM_LOC_R S0_M3 = MAM_LOC_R.create("M3");
		MAM_STR_LN_R S0_M4 = MAM_STR_LN_R.create("M4");
		MAM_ITM_R S0_M6 = MAM_ITM_R.create("M6");
		MAM_CO_R S0_M13 = MAM_CO_R.create("M13");
		MAM_BIZ_RSN_R S0_M18 = MAM_BIZ_RSN_R.create("M18");
		MAM_DPT_R S0_M19 = MAM_DPT_R.create("M19");
		MAM_ITM_TYP_D_R S0_M25 = MAM_ITM_TYP_D_R.create("M25");
		MAM_LOC_GRP_R S0_M26 = MAM_LOC_GRP_R.create("M26");
		MAM_USR_R S0_M27 = MAM_USR_R.create("M27");
		MAM_DPT_R S0_M28 = MAM_DPT_R.create("M28");
		MAM_SUNDRY_ITM_R S0_M29 = MAM_SUNDRY_ITM_R.create("M29");
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
		
		MCDynamicSQLID DS0C_ITM_GRP = createDynamicSQLID("DS0C_ITM_GRP");
		
		return createQueryPlan()
			.setQuery(
				sql("MSBEL2430_MST_ACXFR_INST_Query_S01")
					.mainQuery()
					.select(
						S0_T2.abort_flg,
						S0_T1.trd_cd,
						S0_T1.wg_cd,
						S0_T2.pr_sts_typ,
						S0_T2.itm_cd,
						S0_T2.itm_sub1,
						S0_T2.itm_sub2,
						S0_T2.itm_sub3,
						decode(
							S0_M6.sundry_itm_flg,
							value(true),
							S0_M29.itm_nm,
							S0_M6.itm_nm
						).as("itm_nm"),
						S0_T2.ver_no,
						S0_T2.alloc_flg,
						S0_T2.lot_no,
						S0_T2.sublot_no,
						S0_T2.trd_unit_cd,
						S0_T2.trd_unit_qty.as("trd_inst_unit_qty"),
						S0_T2.base_unit_cd,
						S0_T2.base_unit_qty,
						MAPA_STD_COST$F_GET_STD_AMT(
							S0_T2.itm_cd,
							S0_T2.itm_sub1,
							S0_T2.itm_sub2,
							S0_T2.itm_sub3,
							S0_T1.acxfr_inst_dt,
							S0_T1.wg_cd,
							S0_T2.base_unit_qty,
							S0_M13.stk_std_upri_typ
						).as("stk_amt"),
						S0_M13.base_cur_cd,
						S0_M13.stk_amt_dec_place.as("base_cur_dec_place"),
						S0_T2.acxfr_schd_dt,
						S0_T1.acxfr_inst_dt,
						S0_T1.loc_cd,
						S0_T2.str_ln_cd,
						S0_T2.stk_arrv_bp_cd,
						S0_T2.quality_typ,
						S0_T2.stk_insp_typ,
						S0_T2.stk_id_typ,
						S0_T2.gd_cd,
						S0_T2.stk_bp_cd,
						S0_T2.sno1,
						S0_T2.sno2,
						S0_T2.sno3,
						S0_T2.sno4,
						S0_T2.rsn_cd,
						S0_T2.bd_dpt_cd,
						S0_M19.dpt_nm.as("bd_dpt_nm"),
						S0_T2.bd_itm_cd,
						S0_T2.bd_itm_sub1,
						S0_T2.bd_itm_sub2,
						S0_T2.bd_itm_sub3,
						S0_T2.bd_lot_no,
						S0_T2.bd_sublot_no,
						S0_T2.bd_sno1,
						S0_T2.bd_sno2,
						S0_T2.bd_sno3,
						S0_T2.bd_sno4,
						S0_T2.bd_bp_cd,
						S0_T2.bd_loc_cd,
						S0_T2.bd_ctg_cd,
						S0_T2.bd_oper_cd,
						S0_T1.trd_ptn_typ,
						S0_T2.acxfr_schd_no,
						S0_T1.acxfr_inst_no,
						S0_T2.acxfr_inst_d_no,
						S0_T2.dspsl_no,
						S0_T2.aprv_flg,
						S0_T2.aprv_no,
						S0_T2.fix_no_typ,
						S0_T2.fix_no,
						S0_T1.intr_rmrks.as("inst_intr_rmrks"),
						S0_T1.trd_rmrks.as("inst_trd_rmrks"),
						S0_T1.inst_rmrks.as("inst_rmrks"),
						S0_T1.sub_char1.as("inst_sub_char1"),
						S0_T1.sub_char2.as("inst_sub_char2"),
						S0_T1.sub_char3.as("inst_sub_char3"),
						S0_T2.intr_d_rmrks.as("inst_intr_d_rmrks"),
						S0_T2.trd_d_rmrks.as("inst_trd_d_rmrks"),
						S0_T2.inst_d_rmrks.as("inst_d_rmrks"),
						S0_T2.sub_char1.as("inst_d_sub_char1"),
						S0_T2.sub_char2.as("inst_d_sub_char2"),
						S0_T2.sub_char3.as("inst_d_sub_char3"),
						S0_T1.inst_usr_cd,
						S0_T1.inst_dpt_cd,
						S0_M28.dpt_nm.as("inst_dpt_nm"),
						S0_T1.ins_usr_id,
						S0_T1.ins_usr_nm,
						S0_T1.ins_func_id,
						S0_T1.ins_ts,
						S0_T1.upd_usr_id,
						S0_T1.upd_usr_nm,
						S0_T1.upd_func_id,
						S0_T1.upd_ts,
						S0_T1.upd_srv_req_no,
						S0_M6.itm_typ,
						S0_M6.itm_typ_d_cd,
						addDynamicSelect(DS0C_ITM_GRP)
					)
					.from(
						S0_T1
						.innerJoin(S0_T2).on(S0_T1.acxfr_inst_no.eq(S0_T2.acxfr_inst_no))
						.innerJoin(S0_M0).on(S0_M0.loc_cd.eq(S0_T1.loc_cd))
						.leftOuterJoin(S0_M6).on(
							bracket(
								S0_T2.itm_cd.eq(S0_M6.itm_cd)
								.and(S0_T2.itm_sub1.eq(S0_M6.itm_sub1))
								.and(S0_T2.itm_sub2.eq(S0_M6.itm_sub2))
								.and(S0_T2.itm_sub3.eq(S0_M6.itm_sub3))
							)
						)
						.leftOuterJoin(S0_M13).on(value(0).eq(value(0)))
						.leftOuterJoin(S0_M19).on(
							bracket(
								S0_T2.bd_dpt_cd.eq(S0_M19.dpt_cd)
								.and(S0_T1.acxfr_inst_dt.between(S0_M19.st_dt, S0_M19.end_dt))
							)
						)
						.leftOuterJoin(S0_M28).on(
							bracket(
								S0_T1.inst_dpt_cd.eq(S0_M28.dpt_cd)
								.and(S0_T1.acxfr_inst_dt.between(S0_M28.st_dt, S0_M28.end_dt))
							)
						)
						.leftOuterJoin(S0_M29).on(
							bracket(
								S0_T2.itm_cd.eq(S0_M29.itm_cd)
								.and(S0_T2.itm_sub1.eq(S0_M29.itm_sub1))
								.and(S0_T2.itm_sub2.eq(S0_M29.itm_sub2))
								.and(S0_T2.itm_sub3.eq(S0_M29.itm_sub3))
								.and(S0_T2.sno1.eq(S0_M29.sno1))
								.and(S0_T2.sno2.eq(S0_M29.sno2))
								.and(S0_T2.sno3.eq(S0_M29.sno3))
								.and(S0_T2.sno4.eq(S0_M29.sno4))
							)
						)
						.addDynamicView()
						.addDynamicView(DS0C_ITM_GRP)
					)
					.where(
						value(0).eq(value(0))
						.and(
							value(1).eq(value(0))
							.cutoff$or(S0_T2.pr_sts_typ.eq(bind("not_inst")))
							.cutoff$or(S0_T2.pr_sts_typ.eq(bind("inst")))
							.cutoff$or(S0_T2.pr_sts_typ.eq(bind("part_comp")))
							.cutoff$or(S0_T2.pr_sts_typ.eq(bind("comp")))
						)
						.cutoff$and(S0_T1.trd_cd.like(bind("trd_cd")))
						.addDynamicPredicate()
						.cutoff$and(S0_T1.trd_ptn_typ.like(bind("trd_ptn_typ")))
						.cutoff$and(S0_T1.wg_cd.like(bind("wg_cd")))
						.cutoff$and(S0_T2.acxfr_schd_no.like(bind("acxfr_schd_no")))
						.cutoff$and(S0_T1.acxfr_inst_no.like(bind("acxfr_inst_no")))
						.cutoff$and(S0_T2.acxfr_inst_d_no.like(bind("acxfr_inst_d_no")))
						.cutoff$and(S0_T1.loc_cd.like(bind("loc_cd")))
						.cutoff$and(S0_T2.str_ln_cd.like(bind("str_ln_cd")))
						.cutoff$and(S0_M6.itm_typ.like(bind("itm_typ")))
						.cutoff$and(S0_M6.itm_typ_d_cd.like(bind("itm_typ_d_cd")))
						.cutoff$and(S0_T2.itm_cd.like(bind("itm_cd")))
						.cutoff$and(S0_T2.itm_sub1.like(bind("itm_sub1")))
						.cutoff$and(S0_T2.itm_sub2.like(bind("itm_sub2")))
						.cutoff$and(S0_T2.itm_sub3.like(bind("itm_sub3")))
						.cutoff$and(
							decode(
								S0_M6.sundry_itm_flg,
								value(true),
								S0_M29.itm_nm,
								S0_M6.itm_nm
							).like(bind("itm_nm"))
						)
						.cutoff$and(S0_T2.ver_no.like(bind("ver_no")))
						.cutoff$and(S0_T2.lot_no.like(bind("lot_no")))
						.cutoff$and(S0_T2.sublot_no.like(bind("sublot_no")))
						.cutoff$and(S0_T2.sno1.like(bind("sno1")))
						.cutoff$and(S0_T2.sno2.like(bind("sno2")))
						.cutoff$and(S0_T2.sno3.like(bind("sno3")))
						.cutoff$and(S0_T2.sno4.like(bind("sno4")))
						.cutoff$and(S0_T2.bd_dpt_cd.like(bind("bd_dpt_cd")))
						.cutoff$and(S0_M19.dpt_nm.like(bind("bd_dpt_nm")))
						.cutoff$and(S0_T2.acxfr_schd_dt.gte(bind("acxfr_schd_dt_fr")))
						.cutoff$and(S0_T2.acxfr_schd_dt.lte(bind("acxfr_schd_dt_to")))
						.cutoff$and(S0_T1.acxfr_inst_dt.gte(bind("acxfr_inst_dt_fr")))
						.cutoff$and(S0_T1.acxfr_inst_dt.lte(bind("acxfr_inst_dt_to")))
						.cutoff$and(S0_T2.rsn_cd.like(bind("rsn_cd")))
						.cutoff$and(S0_T2.dspsl_no.like(bind("dspsl_no")))
						.cutoff$and(S0_T1.inst_usr_cd.like(bind("inst_usr_cd")))
						.cutoff$and(S0_T1.inst_dpt_cd.like(bind("inst_dpt_cd")))
						.cutoff$and(S0_M28.dpt_nm.like(bind("inst_dpt_nm")))
						.cutoff$and(S0_T1.intr_rmrks.like(bind("inst_intr_rmrks")))
						.cutoff$and(S0_T1.trd_rmrks.like(bind("inst_trd_rmrks")))
						.cutoff$and(S0_T1.inst_rmrks.like(bind("inst_rmrks")))
						.cutoff$and(S0_T1.sub_char1.like(bind("inst_sub_char1")))
						.cutoff$and(S0_T1.sub_char2.like(bind("inst_sub_char2")))
						.cutoff$and(S0_T1.sub_char3.like(bind("inst_sub_char3")))
						.cutoff$and(S0_T2.intr_d_rmrks.like(bind("inst_intr_d_rmrks")))
						.cutoff$and(S0_T2.trd_d_rmrks.like(bind("inst_trd_d_rmrks")))
						.cutoff$and(S0_T2.inst_d_rmrks.like(bind("inst_d_rmrks")))
						.cutoff$and(S0_T2.sub_char1.like(bind("inst_d_sub_char1")))
						.cutoff$and(S0_T2.sub_char2.like(bind("inst_d_sub_char2")))
						.cutoff$and(S0_T2.sub_char3.like(bind("inst_d_sub_char3")))
						.cutoff$and(S0_T2.abort_flg.neq(bind("abort_false")))
						.addDynamicPredicate(DS0C_ITM_GRP)
					)
					.orderBy(
						S0_T2.acxfr_inst_no.asc(),
						S0_T2.disp_seq.asc()
					)
			)
			.setDynamicSQLInfo(
				when(boundOr("trd_nm"))
					.view(v -> v.leftOuterJoin(S0_M1).on(S0_T1.trd_cd.eq(S0_M1.trd_cd)))
					.predicate(p -> p.cutoff$and(S0_M1.trd_nm.like(bind("trd_nm")))),
				when(boundOr("wg_nm"))
					.view(v -> v.leftOuterJoin(S0_M2).on(S0_T1.wg_cd.eq(S0_M2.wg_cd)))
					.predicate(p -> p.cutoff$and(S0_M2.wg_nm.like(bind("wg_nm")))),
				when(boundOr("loc_grp_cd", "loc_grp_nm", "loc_nm"))
					.view(v -> v.leftOuterJoin(S0_M3).on(S0_T1.loc_cd.eq(S0_M3.loc_cd)))
					.predicate(p -> p.cutoff$and(S0_M3.loc_nm.like(bind("loc_nm")))),
				when(boundOr("str_ln_nm"))
					.view(v -> v.leftOuterJoin(S0_M4).on(bracket(S0_T1.loc_cd.eq(S0_M4.loc_cd).and(S0_T2.str_ln_cd.eq(S0_M4.str_ln_cd)))))
					.predicate(p -> p.cutoff$and(S0_M4.str_ln_nm.like(bind("str_ln_nm")))),
				when(boundOr("rsn_nm"))
					.view(v -> v.leftOuterJoin(S0_M18).on(S0_T2.rsn_cd.eq(S0_M18.biz_rsn_cd)))
					.predicate(p -> p.cutoff$and(S0_M18.biz_rsn_nm.like(bind("rsn_nm")))),
				when(boundOr("itm_typ_d_nm"))
					.view(v -> v.leftOuterJoin(S0_M25).on(bracket(S0_M6.itm_typ.eq(S0_M25.itm_typ).and(S0_M6.itm_typ_d_cd.eq(S0_M25.itm_typ_d_cd)))))
					.predicate(p -> p.cutoff$and(S0_M25.itm_typ_d_nm.like(bind("itm_typ_d_nm")))),
				when(boundOr("loc_grp_cd", "loc_grp_nm"))
					.view(v -> v.leftOuterJoin(S0_M26).on(bracket(S0_M26.loc_grp_cd.eq(S0_M3.loc_grp_cd))))
					.predicate(p -> p.cutoff$and(S0_M26.loc_grp_cd.like(bind("loc_grp_cd"))).cutoff$and(S0_M26.loc_grp_nm.like(bind("loc_grp_nm")))),
				when(boundOr("inst_usr_nm"))
					.view(v -> v.leftOuterJoin(S0_M27).on(S0_T1.inst_usr_cd.eq(S0_M27.usr_cd)))
					.predicate(p -> p.cutoff$and(S0_M27.usr_nm.like(bind("inst_usr_nm")))),
				when(boundOr("itm_grp_flg1"))
					.select(DS0C_ITM_GRP, S0_M6.itm_grp_cd1.as("itm_grp_cd1"), S0_MM1.itm_grp_nm.as("itm_grp_nm1"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM1).on(S0_M6.itm_grp_cd1.eq(S0_MM1.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP1.value()).eq(S0_MM1.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M6.itm_grp_cd1.like(bind("itm_grp_cd1"))).cutoff$and(S0_MM1.itm_grp_nm.like(bind("itm_grp_nm1")))),
				when(boundOr("itm_grp_flg2"))
					.select(DS0C_ITM_GRP, S0_M6.itm_grp_cd2.as("itm_grp_cd2"), S0_MM2.itm_grp_nm.as("itm_grp_nm2"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM2).on(S0_M6.itm_grp_cd2.eq(S0_MM2.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP2.value()).eq(S0_MM2.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M6.itm_grp_cd2.like(bind("itm_grp_cd2"))).cutoff$and(S0_MM2.itm_grp_nm.like(bind("itm_grp_nm2")))),
				when(boundOr("itm_grp_flg3"))
					.select(DS0C_ITM_GRP, S0_M6.itm_grp_cd3.as("itm_grp_cd3"), S0_MM3.itm_grp_nm.as("itm_grp_nm3"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM3).on(S0_M6.itm_grp_cd3.eq(S0_MM3.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP3.value()).eq(S0_MM3.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M6.itm_grp_cd3.like(bind("itm_grp_cd3"))).cutoff$and(S0_MM3.itm_grp_nm.like(bind("itm_grp_nm3")))),
				when(boundOr("itm_grp_flg4"))
					.select(DS0C_ITM_GRP, S0_M6.itm_grp_cd4.as("itm_grp_cd4"), S0_MM4.itm_grp_nm.as("itm_grp_nm4"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM4).on(S0_M6.itm_grp_cd4.eq(S0_MM4.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP4.value()).eq(S0_MM4.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M6.itm_grp_cd4.like(bind("itm_grp_cd4"))).cutoff$and(S0_MM4.itm_grp_nm.like(bind("itm_grp_nm4")))),
				when(boundOr("itm_grp_flg5"))
					.select(DS0C_ITM_GRP, S0_M6.itm_grp_cd5.as("itm_grp_cd5"), S0_MM5.itm_grp_nm.as("itm_grp_nm5"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM5).on(S0_M6.itm_grp_cd5.eq(S0_MM5.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP5.value()).eq(S0_MM5.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M6.itm_grp_cd5.like(bind("itm_grp_cd5"))).cutoff$and(S0_MM5.itm_grp_nm.like(bind("itm_grp_nm5")))),
				when(boundOr("itm_grp_flg6"))
					.select(DS0C_ITM_GRP, S0_M6.itm_grp_cd6.as("itm_grp_cd6"), S0_MM6.itm_grp_nm.as("itm_grp_nm6"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM6).on(S0_M6.itm_grp_cd6.eq(S0_MM6.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP6.value()).eq(S0_MM6.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M6.itm_grp_cd6.like(bind("itm_grp_cd6"))).cutoff$and(S0_MM6.itm_grp_nm.like(bind("itm_grp_nm6")))),
				when(boundOr("itm_grp_flg7"))
					.select(DS0C_ITM_GRP, S0_M6.itm_grp_cd7.as("itm_grp_cd7"), S0_MM7.itm_grp_nm.as("itm_grp_nm7"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM7).on(S0_M6.itm_grp_cd7.eq(S0_MM7.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP7.value()).eq(S0_MM7.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M6.itm_grp_cd7.like(bind("itm_grp_cd7"))).cutoff$and(S0_MM7.itm_grp_nm.like(bind("itm_grp_nm7")))),
				when(boundOr("itm_grp_flg8"))
					.select(DS0C_ITM_GRP, S0_M6.itm_grp_cd8.as("itm_grp_cd8"), S0_MM8.itm_grp_nm.as("itm_grp_nm8"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM8).on(S0_M6.itm_grp_cd8.eq(S0_MM8.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP8.value()).eq(S0_MM8.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M6.itm_grp_cd8.like(bind("itm_grp_cd8"))).cutoff$and(S0_MM8.itm_grp_nm.like(bind("itm_grp_nm8")))),
				when(boundOr("itm_grp_flg9"))
					.select(DS0C_ITM_GRP, S0_M6.itm_grp_cd9.as("itm_grp_cd9"), S0_MM9.itm_grp_nm.as("itm_grp_nm9"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM9).on(S0_M6.itm_grp_cd9.eq(S0_MM9.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP9.value()).eq(S0_MM9.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M6.itm_grp_cd9.like(bind("itm_grp_cd9"))).cutoff$and(S0_MM9.itm_grp_nm.like(bind("itm_grp_nm9")))),
				when(boundOr("itm_grp_flg10"))
					.select(DS0C_ITM_GRP, S0_M6.itm_grp_cd10.as("itm_grp_cd10"), S0_MM10.itm_grp_nm.as("itm_grp_nm10"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM10).on(S0_M6.itm_grp_cd10.eq(S0_MM10.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP10.value()).eq(S0_MM10.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M6.itm_grp_cd10.like(bind("itm_grp_cd10"))).cutoff$and(S0_MM10.itm_grp_nm.like(bind("itm_grp_nm10"))))
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
						.add(MAM_LOC_R.class, r -> toCondition(
							r.getStringNE("loc_cd")
						))
						.addSelect(m -> toArray(
							m.loc_grp_cd,
							m.loc_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("loc_nm", m.loc_nm());
							r.setStringNE("join_loc_grp_cd_", m.loc_grp_cd());
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
							r.setNumberNE("trd_unit_dec_place", m.dec_place());
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
							m.dec_place
						))
						.addMap((r, m) -> {
							r.setNumberNE("base_unit_dec_place", m.dec_place());
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
						.add(MAM_CUR_R.class, r -> toCondition(
							r.getStringNE("base_cur_cd")
						))
						.addSelect(m -> toArray(
							m.cur_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("base_cur_nm", m.cur_nm());
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
							m.itm_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("bd_itm_nm", m.itm_nm());
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
	 * -- MSBEL2430_MST_ACXFR_SCHD_Query_S01
	 */
	static MCQueryPlan MSBEL2430_MST_ACXFR_SCHD_S01() {
		MST_ACXFR_SCHD_R S0_T1 = MST_ACXFR_SCHD_R.create("T1");
		MAVM_RD_LOC_R S0_M0 = MAVM_RD_LOC_R.create("M0");
		MAM_TRD_R S0_M1 = MAM_TRD_R.create("M1");
		MAM_WG_R S0_M2 = MAM_WG_R.create("M2");
		MAM_LOC_R S0_M3 = MAM_LOC_R.create("M3");
		MAM_STR_LN_R S0_M4 = MAM_STR_LN_R.create("M4");
		MAM_ITM_R S0_M6 = MAM_ITM_R.create("M6");
		MAM_CO_R S0_M13 = MAM_CO_R.create("M13");
		MAM_BIZ_RSN_R S0_M18 = MAM_BIZ_RSN_R.create("M18");
		MAM_DPT_R S0_M19 = MAM_DPT_R.create("M19");
		MAM_ITM_TYP_D_R S0_M25 = MAM_ITM_TYP_D_R.create("M25");
		MAM_LOC_GRP_R S0_M26 = MAM_LOC_GRP_R.create("M26");
		MAM_USR_R S0_M27 = MAM_USR_R.create("M27");
		MAM_DPT_R S0_M28 = MAM_DPT_R.create("M28");
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
		
		MCDynamicSQLID DS0C_ITM_GRP = createDynamicSQLID("DS0C_ITM_GRP");
		
		return createQueryPlan()
			.setQuery(
				sql("MSBEL2430_MST_ACXFR_SCHD_Query_S01")
					.mainQuery()
					.select(
						S0_T1.abort_flg,
						S0_T1.trd_cd,
						S0_T1.wg_cd,
						S0_T1.pr_sts_typ,
						S0_T1.itm_cd,
						S0_T1.itm_sub1,
						S0_T1.itm_sub2,
						S0_T1.itm_sub3,
						S0_T1.ver_no,
						S0_T1.alloc_flg,
						S0_T1.lot_no,
						S0_T1.sublot_no,
						S0_T1.trd_unit_cd,
						S0_T1.trd_unit_qty.as("trd_schd_unit_qty"),
						S0_T1.trd_inst_unit_qty,
						S0_T1.trd_act_unit_qty,
						S0_T1.base_unit_cd,
						S0_T1.base_unit_qty,
						MAPA_STD_COST$F_GET_STD_AMT(
							S0_T1.itm_cd,
							S0_T1.itm_sub1,
							S0_T1.itm_sub2,
							S0_T1.itm_sub3,
							S0_T1.acxfr_schd_dt,
							S0_T1.wg_cd,
							S0_T1.base_unit_qty,
							S0_M13.stk_std_upri_typ
						).as("stk_amt"),
						S0_M13.base_cur_cd,
						S0_M13.stk_amt_dec_place.as("base_cur_dec_place"),
						S0_T1.rqst_dt,
						S0_T1.acxfr_schd_dt,
						S0_T1.loc_cd,
						S0_T1.str_ln_cd,
						S0_T1.stk_arrv_bp_cd,
						S0_T1.quality_typ,
						S0_T1.stk_insp_typ,
						S0_T1.stk_id_typ,
						S0_T1.gd_cd,
						S0_T1.stk_bp_cd,
						S0_T1.sno1,
						S0_T1.sno2,
						S0_T1.sno3,
						S0_T1.sno4,
						S0_T1.rsn_cd,
						S0_T1.bd_dpt_cd,
						S0_M19.dpt_nm.as("bd_dpt_nm"),
						S0_T1.bd_itm_cd,
						S0_T1.bd_itm_sub1,
						S0_T1.bd_itm_sub2,
						S0_T1.bd_itm_sub3,
						S0_T1.bd_lot_no,
						S0_T1.bd_sublot_no,
						S0_T1.bd_sno1,
						S0_T1.bd_sno2,
						S0_T1.bd_sno3,
						S0_T1.bd_sno4,
						S0_T1.bd_bp_cd,
						S0_T1.bd_loc_cd,
						S0_T1.bd_ctg_cd,
						S0_T1.bd_oper_cd,
						S0_T1.inst_typ,
						S0_T1.trd_ptn_typ,
						S0_T1.acxfr_schd_no,
						S0_T1.dspsl_no,
						S0_T1.acxfr_schd_rev,
						S0_T1.aprv_flg,
						S0_T1.aprv_no,
						S0_T1.aprv_sts_typ,
						S0_T1.fix_no_typ,
						S0_T1.fix_no,
						S0_T1.trd_d_rmrks.as("schd_trd_d_rmrks"),
						S0_T1.dspsl_rmrks.as("schd_dspsl_rmrks"),
						S0_T1.sub_char1.as("schd_sub_char1"),
						S0_T1.sub_char2.as("schd_sub_char2"),
						S0_T1.sub_char3.as("schd_sub_char3"),
						S0_T1.rqst_usr_cd,
						S0_T1.rqst_dpt_cd,
						S0_M28.dpt_nm.as("rqst_dpt_nm"),
						S0_T1.ins_usr_id,
						S0_T1.ins_usr_nm,
						S0_T1.ins_func_id,
						S0_T1.ins_ts,
						S0_T1.upd_usr_id,
						S0_T1.upd_usr_nm,
						S0_T1.upd_func_id,
						S0_T1.upd_ts,
						S0_T1.upd_srv_req_no,
						addDynamicSelect(DS0C_ITM_GRP)
					)
					.from(
						S0_T1
						.innerJoin(S0_M0).on(S0_M0.loc_cd.eq(S0_T1.loc_cd))
						.leftOuterJoin(S0_M13).on(value(0).eq(value(0)))
						.leftOuterJoin(S0_M19).on(
							bracket(
								S0_T1.bd_dpt_cd.eq(S0_M19.dpt_cd)
								.and(S0_T1.acxfr_schd_dt.between(S0_M19.st_dt, S0_M19.end_dt))
							)
						)
						.leftOuterJoin(S0_M28).on(
							bracket(
								S0_T1.rqst_dpt_cd.eq(S0_M28.dpt_cd)
								.and(S0_T1.acxfr_schd_dt.between(S0_M28.st_dt, S0_M28.end_dt))
							)
						)
						.addDynamicView()
						.addDynamicView(DS0C_ITM_GRP)
					)
					.where(
						value(0).eq(value(0))
						.and(
							value(1).eq(value(0))
							.cutoff$or(S0_T1.pr_sts_typ.eq(bind("not_inst")))
							.cutoff$or(S0_T1.pr_sts_typ.eq(bind("inst")))
							.cutoff$or(S0_T1.pr_sts_typ.eq(bind("part_comp")))
							.cutoff$or(S0_T1.pr_sts_typ.eq(bind("comp")))
						)
						.cutoff$and(S0_T1.trd_cd.like(bind("trd_cd")))
						.addDynamicPredicate()
						.cutoff$and(S0_T1.trd_ptn_typ.like(bind("trd_ptn_typ")))
						.cutoff$and(S0_T1.wg_cd.like(bind("wg_cd")))
						.cutoff$and(S0_T1.acxfr_schd_no.like(bind("acxfr_schd_no")))
						.cutoff$and(S0_T1.loc_cd.like(bind("loc_cd")))
						.cutoff$and(S0_T1.str_ln_cd.like(bind("str_ln_cd")))
						.cutoff$and(S0_T1.itm_cd.like(bind("itm_cd")))
						.cutoff$and(S0_T1.itm_sub1.like(bind("itm_sub1")))
						.cutoff$and(S0_T1.itm_sub2.like(bind("itm_sub2")))
						.cutoff$and(S0_T1.itm_sub3.like(bind("itm_sub3")))
						.cutoff$and(S0_T1.ver_no.like(bind("ver_no")))
						.cutoff$and(S0_T1.lot_no.like(bind("lot_no")))
						.cutoff$and(S0_T1.sublot_no.like(bind("sublot_no")))
						.cutoff$and(S0_T1.sno1.like(bind("sno1")))
						.cutoff$and(S0_T1.sno2.like(bind("sno2")))
						.cutoff$and(S0_T1.sno3.like(bind("sno3")))
						.cutoff$and(S0_T1.sno4.like(bind("sno4")))
						.cutoff$and(S0_T1.bd_dpt_cd.like(bind("bd_dpt_cd")))
						.cutoff$and(S0_M19.dpt_nm.like(bind("bd_dpt_nm")))
						.cutoff$and(S0_T1.rqst_dt.gte(bind("rqst_dt_fr")))
						.cutoff$and(S0_T1.rqst_dt.lte(bind("rqst_dt_to")))
						.cutoff$and(S0_T1.acxfr_schd_dt.gte(bind("acxfr_schd_dt_fr")))
						.cutoff$and(S0_T1.acxfr_schd_dt.lte(bind("acxfr_schd_dt_to")))
						.cutoff$and(S0_T1.rsn_cd.like(bind("rsn_cd")))
						.cutoff$and(S0_T1.dspsl_no.like(bind("dspsl_no")))
						.cutoff$and(
							S0_T1.aprv_flg.eq(value(false))
							.or(
								S0_T1.aprv_flg.eq(value(true))
								.and(S0_T1.aprv_sts_typ.neq(bind("aprv_sts_opn")))
							)
						)
						.cutoff$and(S0_T1.rqst_usr_cd.like(bind("rqst_usr_cd")))
						.cutoff$and(S0_T1.rqst_dpt_cd.like(bind("rqst_dpt_cd")))
						.cutoff$and(S0_M28.dpt_nm.like(bind("rqst_dpt_nm")))
						.cutoff$and(S0_T1.trd_d_rmrks.like(bind("schd_trd_d_rmrks")))
						.cutoff$and(S0_T1.dspsl_rmrks.like(bind("schd_dspsl_rmrks")))
						.cutoff$and(S0_T1.sub_char1.like(bind("schd_sub_char1")))
						.cutoff$and(S0_T1.sub_char2.like(bind("schd_sub_char2")))
						.cutoff$and(S0_T1.sub_char3.like(bind("schd_sub_char3")))
						.addDynamicPredicate(DS0C_ITM_GRP)
					)
					.orderBy(
						S0_T1.acxfr_schd_dt.asc(),
						S0_T1.rqst_dt.asc(),
						S0_T1.acxfr_schd_no.asc()
					)
			)
			.setDynamicSQLInfo(
				when(boundOr("trd_nm"))
					.view(v -> v.leftOuterJoin(S0_M1).on(S0_T1.trd_cd.eq(S0_M1.trd_cd)))
					.predicate(p -> p.cutoff$and(S0_M1.trd_nm.like(bind("trd_nm")))),
				when(boundOr("wg_nm"))
					.view(v -> v.leftOuterJoin(S0_M2).on(S0_T1.wg_cd.eq(S0_M2.wg_cd)))
					.predicate(p -> p.cutoff$and(S0_M2.wg_nm.like(bind("wg_nm")))),
				when(boundOr("loc_grp_cd", "loc_grp_nm", "loc_nm"))
					.view(v -> v.leftOuterJoin(S0_M3).on(S0_T1.loc_cd.eq(S0_M3.loc_cd)))
					.predicate(p -> p.cutoff$and(S0_M3.loc_nm.like(bind("loc_nm")))),
				when(boundOr("str_ln_nm"))
					.view(v -> v.leftOuterJoin(S0_M4).on(bracket(S0_T1.loc_cd.eq(S0_M4.loc_cd).and(S0_T1.str_ln_cd.eq(S0_M4.str_ln_cd)))))
					.predicate(p -> p.cutoff$and(S0_M4.str_ln_nm.like(bind("str_ln_nm")))),
				when(boundOr("itm_typ_d_nm", "itm_grp_flg1", "itm_grp_flg2", "itm_grp_flg3", "itm_grp_flg4", "itm_grp_flg5", "itm_grp_flg6", "itm_grp_flg7", "itm_grp_flg8", "itm_grp_flg9", "itm_grp_flg10", "itm_typ", "itm_typ_d_cd", "itm_nm"))
					.view(v -> v.leftOuterJoin(S0_M6).on(bracket(S0_T1.itm_cd.eq(S0_M6.itm_cd).and(S0_T1.itm_sub1.eq(S0_M6.itm_sub1)).and(S0_T1.itm_sub2.eq(S0_M6.itm_sub2)).and(S0_T1.itm_sub3.eq(S0_M6.itm_sub3)))))
					.predicate(p -> p.cutoff$and(S0_M6.itm_typ.like(bind("itm_typ"))).cutoff$and(S0_M6.itm_typ_d_cd.like(bind("itm_typ_d_cd"))).cutoff$and(S0_M6.itm_nm.like(bind("itm_nm")))),
				when(boundOr("rsn_nm"))
					.view(v -> v.leftOuterJoin(S0_M18).on(S0_T1.rsn_cd.eq(S0_M18.biz_rsn_cd)))
					.predicate(p -> p.cutoff$and(S0_M18.biz_rsn_nm.like(bind("rsn_nm")))),
				when(boundOr("itm_typ_d_nm"))
					.view(v -> v.leftOuterJoin(S0_M25).on(bracket(S0_M6.itm_typ.eq(S0_M25.itm_typ).and(S0_M6.itm_typ_d_cd.eq(S0_M25.itm_typ_d_cd)))))
					.predicate(p -> p.cutoff$and(S0_M25.itm_typ_d_nm.like(bind("itm_typ_d_nm")))),
				when(boundOr("loc_grp_cd", "loc_grp_nm"))
					.view(v -> v.leftOuterJoin(S0_M26).on(bracket(S0_M26.loc_grp_cd.eq(S0_M3.loc_grp_cd))))
					.predicate(p -> p.cutoff$and(S0_M26.loc_grp_cd.like(bind("loc_grp_cd"))).cutoff$and(S0_M26.loc_grp_nm.like(bind("loc_grp_nm")))),
				when(boundOr("rqst_usr_nm"))
					.view(v -> v.leftOuterJoin(S0_M27).on(S0_T1.rqst_usr_cd.eq(S0_M27.usr_cd)))
					.predicate(p -> p.cutoff$and(S0_M27.usr_nm.like(bind("rqst_usr_nm")))),
				when(boundOr("itm_grp_flg1"))
					.select(DS0C_ITM_GRP, S0_M6.itm_grp_cd1.as("itm_grp_cd1"), S0_MM1.itm_grp_nm.as("itm_grp_nm1"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM1).on(S0_M6.itm_grp_cd1.eq(S0_MM1.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP1.value()).eq(S0_MM1.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M6.itm_grp_cd1.like(bind("itm_grp_cd1"))).cutoff$and(S0_MM1.itm_grp_nm.like(bind("itm_grp_nm1")))),
				when(boundOr("itm_grp_flg2"))
					.select(DS0C_ITM_GRP, S0_M6.itm_grp_cd2.as("itm_grp_cd2"), S0_MM2.itm_grp_nm.as("itm_grp_nm2"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM2).on(S0_M6.itm_grp_cd2.eq(S0_MM2.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP2.value()).eq(S0_MM2.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M6.itm_grp_cd2.like(bind("itm_grp_cd2"))).cutoff$and(S0_MM2.itm_grp_nm.like(bind("itm_grp_nm2")))),
				when(boundOr("itm_grp_flg3"))
					.select(DS0C_ITM_GRP, S0_M6.itm_grp_cd3.as("itm_grp_cd3"), S0_MM3.itm_grp_nm.as("itm_grp_nm3"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM3).on(S0_M6.itm_grp_cd3.eq(S0_MM3.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP3.value()).eq(S0_MM3.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M6.itm_grp_cd3.like(bind("itm_grp_cd3"))).cutoff$and(S0_MM3.itm_grp_nm.like(bind("itm_grp_nm3")))),
				when(boundOr("itm_grp_flg4"))
					.select(DS0C_ITM_GRP, S0_M6.itm_grp_cd4.as("itm_grp_cd4"), S0_MM4.itm_grp_nm.as("itm_grp_nm4"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM4).on(S0_M6.itm_grp_cd4.eq(S0_MM4.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP4.value()).eq(S0_MM4.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M6.itm_grp_cd4.like(bind("itm_grp_cd4"))).cutoff$and(S0_MM4.itm_grp_nm.like(bind("itm_grp_nm4")))),
				when(boundOr("itm_grp_flg5"))
					.select(DS0C_ITM_GRP, S0_M6.itm_grp_cd5.as("itm_grp_cd5"), S0_MM5.itm_grp_nm.as("itm_grp_nm5"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM5).on(S0_M6.itm_grp_cd5.eq(S0_MM5.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP5.value()).eq(S0_MM5.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M6.itm_grp_cd5.like(bind("itm_grp_cd5"))).cutoff$and(S0_MM5.itm_grp_nm.like(bind("itm_grp_nm5")))),
				when(boundOr("itm_grp_flg6"))
					.select(DS0C_ITM_GRP, S0_M6.itm_grp_cd6.as("itm_grp_cd6"), S0_MM6.itm_grp_nm.as("itm_grp_nm6"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM6).on(S0_M6.itm_grp_cd6.eq(S0_MM6.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP6.value()).eq(S0_MM6.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M6.itm_grp_cd6.like(bind("itm_grp_cd6"))).cutoff$and(S0_MM6.itm_grp_nm.like(bind("itm_grp_nm6")))),
				when(boundOr("itm_grp_flg7"))
					.select(DS0C_ITM_GRP, S0_M6.itm_grp_cd7.as("itm_grp_cd7"), S0_MM7.itm_grp_nm.as("itm_grp_nm7"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM7).on(S0_M6.itm_grp_cd7.eq(S0_MM7.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP7.value()).eq(S0_MM7.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M6.itm_grp_cd7.like(bind("itm_grp_cd7"))).cutoff$and(S0_MM7.itm_grp_nm.like(bind("itm_grp_nm7")))),
				when(boundOr("itm_grp_flg8"))
					.select(DS0C_ITM_GRP, S0_M6.itm_grp_cd8.as("itm_grp_cd8"), S0_MM8.itm_grp_nm.as("itm_grp_nm8"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM8).on(S0_M6.itm_grp_cd8.eq(S0_MM8.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP8.value()).eq(S0_MM8.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M6.itm_grp_cd8.like(bind("itm_grp_cd8"))).cutoff$and(S0_MM8.itm_grp_nm.like(bind("itm_grp_nm8")))),
				when(boundOr("itm_grp_flg9"))
					.select(DS0C_ITM_GRP, S0_M6.itm_grp_cd9.as("itm_grp_cd9"), S0_MM9.itm_grp_nm.as("itm_grp_nm9"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM9).on(S0_M6.itm_grp_cd9.eq(S0_MM9.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP9.value()).eq(S0_MM9.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M6.itm_grp_cd9.like(bind("itm_grp_cd9"))).cutoff$and(S0_MM9.itm_grp_nm.like(bind("itm_grp_nm9")))),
				when(boundOr("itm_grp_flg10"))
					.select(DS0C_ITM_GRP, S0_M6.itm_grp_cd10.as("itm_grp_cd10"), S0_MM10.itm_grp_nm.as("itm_grp_nm10"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM10).on(S0_M6.itm_grp_cd10.eq(S0_MM10.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP10.value()).eq(S0_MM10.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M6.itm_grp_cd10.like(bind("itm_grp_cd10"))).cutoff$and(S0_MM10.itm_grp_nm.like(bind("itm_grp_nm10"))))
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
						.add(MAM_LOC_R.class, r -> toCondition(
							r.getStringNE("loc_cd")
						))
						.addSelect(m -> toArray(
							m.loc_grp_cd,
							m.loc_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("loc_nm", m.loc_nm());
							r.setStringNE("join_loc_grp_cd_", m.loc_grp_cd());
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
						.add(MAM_ITM_R.class, r -> toCondition(
							r.getStringNE("itm_cd"),
							r.getStringNE("itm_sub1"),
							r.getStringNE("itm_sub2"),
							r.getStringNE("itm_sub3")
						))
						.addSelect(m -> toArray(
							m.itm_nm,
							m.itm_typ,
							m.itm_typ_d_cd
						))
						.addMap((r, m) -> {
							r.setStringNE("itm_nm", m.itm_nm());
							r.setStringNE("itm_typ", m.itm_typ());
							r.setStringNE("itm_typ_d_cd", m.itm_typ_d_cd());
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
							r.setNumberNE("trd_unit_dec_place", m.dec_place());
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
							m.dec_place
						))
						.addMap((r, m) -> {
							r.setNumberNE("base_unit_dec_place", m.dec_place());
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
						.add(MAM_CUR_R.class, r -> toCondition(
							r.getStringNE("base_cur_cd")
						))
						.addSelect(m -> toArray(
							m.cur_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("base_cur_nm", m.cur_nm());
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
							m.itm_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("bd_itm_nm", m.itm_nm());
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
						.add(MAM_USR_R.class, r -> toCondition(
							r.getStringNE("rqst_usr_cd")
						))
						.addSelect(m -> toArray(
							m.usr_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("rqst_usr_nm", m.usr_nm());
					})
				)
			);
	}
}