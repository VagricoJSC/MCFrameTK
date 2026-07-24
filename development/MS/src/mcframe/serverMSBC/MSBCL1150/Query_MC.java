package mcframe.serverMSBC.MSBCL1150;

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
	 * -- MSBCL1150_MST_WK_ACT_REM_Query_S01
	 */
	static MCQueryPlan MSBCL1150_MST_WK_ACT_REM_S01() {
		MST_WK_ACT_REM_R S0_T12 = MST_WK_ACT_REM_R.create("T12");
		MST_WK_SCHD_R S0_T1 = MST_WK_SCHD_R.create("T1");
		MST_ITM_MFG_INST_R S0_T2 = MST_ITM_MFG_INST_R.create("T2");
		MST_MFG_INST_R S0_T3 = MST_MFG_INST_R.create("T3");
		MST_OPER_INST_R S0_T4 = MST_OPER_INST_R.create("T4");
		MSVT_WRK_SNO_R S0_T5 = MSVT_WRK_SNO_R.create("T5");
		MCTempView S0_T6 = createTempView("T6");
		MST_OPER_ACT_REM_R S0_T8 = MST_OPER_ACT_REM_R.create("T8");
		MAM_OPER_R S0_M1 = MAM_OPER_R.create("M1");
		MAM_WK_COST_R S0_M3 = MAM_WK_COST_R.create("M3");
		MAVM_RD_LOC_R S0_M4 = MAVM_RD_LOC_R.create("M4");
		MAM_DPT_R S0_M5 = MAM_DPT_R.create("M5");
		MAM_STR_LN_R S0_M6 = MAM_STR_LN_R.create("M6");
		MAM_ITM_R S0_M7 = MAM_ITM_R.create("M7");
		MAM_SUNDRY_ITM_R S0_M8 = MAM_SUNDRY_ITM_R.create("M8");
		MAM_WG_R S0_M9 = MAM_WG_R.create("M9");
		MAM_LOC_GRP_R S0_M10 = MAM_LOC_GRP_R.create("M10");
		MAM_SITE_R S0_M11 = MAM_SITE_R.create("M11");
		MAM_ITM_TYP_D_R S0_M12 = MAM_ITM_TYP_D_R.create("M12");
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
		MST_WK_ACT_R S1_W1 = MST_WK_ACT_R.create("W1");
		
		MCDynamicSQLID DS0C_ITM_GRP = createDynamicSQLID("DS0C_ITM_GRP");
		
		return createQueryPlan()
			.setQuery(
				sql("MSBCL1150_MST_WK_ACT_REM_Query_S01")
					.mainQuery()
					.select(
						value(true).as("inst_wk_act_flg"),
						S0_T1.mfg_inst_no,
						S0_T12.div_seq,
						S0_T1.disp_seq,
						S0_T2.oper_ptn,
						S0_T4.disp_seq.as("oper_disp_seq"),
						S0_T4.oper_cd,
						S0_T4.oper_seq,
						S0_T1.wk_cost_cd,
						S0_T12.wk_cost.as("schd_wk_cost"),
						S0_T12.fxd_wk_cost.as("schd_fxd_wk_cost"),
						S0_M5.dpt_cd,
						S0_M5.dpt_nm,
						S0_T2.mfg_loc_cd.as("loc_cd"),
						S0_M4.loc_nm,
						S0_M4.str_ln_tgt_flg,
						S0_T2.mfg_str_ln_cd.as("str_ln_cd"),
						S0_T1.wk_cost_calc_flg,
						S0_T1.intr_rmrks.as("schd_intr_rmrks"),
						S0_T1.sub_char1.as("schd_sub_char1"),
						S0_T1.sub_char2.as("schd_sub_char2"),
						S0_T1.sub_char3.as("schd_sub_char3"),
						S0_T2.itm_cd,
						S0_T2.itm_sub1,
						S0_T2.itm_sub2,
						S0_T2.itm_sub3,
						nvl(
							S0_M8.itm_nm,
							S0_M7.itm_nm
						).as("itm_nm"),
						S0_M7.lot_mng_typ,
						S0_M7.sublot_mng_typ,
						S0_M7.sno1_mng_typ,
						S0_M7.sno2_mng_typ,
						S0_M7.sno3_mng_typ,
						S0_M7.sno4_mng_typ,
						S0_T2.lot_no,
						S0_T2.sublot_no,
						S0_T2.sno1,
						S0_T2.sno2,
						S0_T2.sno3,
						S0_T2.sno4,
						trunc(
							S0_T4.st_schd_tm,
							MCDateFmt.DD
						).as("oper_st_schd_dt"),
						S0_T4.st_schd_tm.as("oper_st_schd_tm"),
						trunc(
							S0_T4.end_schd_tm,
							MCDateFmt.DD
						).as("oper_end_schd_dt"),
						S0_T4.end_schd_tm.as("oper_end_schd_tm"),
						S0_T12.mfg_sts_typ.as("wk_mfg_sts_typ"),
						S0_T8.mfg_sts_typ.as("oper_mfg_sts_typ"),
						S0_T3.aprv_flg,
						S0_T3.mfg_aprv_sts_typ,
						S0_T1.itm_mfg_inst_no,
						S0_T4.oper_inst_no,
						S0_T1.wk_schd_no,
						S0_T2.wg_cd.as("loc_wg_cd"),
						S0_M4.loc_grp_cd,
						S0_M4.site_cd,
						S0_M7.itm_typ,
						S0_M7.itm_typ_d_cd,
						S0_T1.ins_usr_id,
						S0_T1.ins_usr_nm,
						S0_T1.ins_func_id,
						S0_T1.ins_ts,
						S0_T3.upd_cntr.as("mfg_inst_upd_cntr"),
						S0_T1.upd_usr_id,
						S0_T1.upd_usr_nm,
						S0_T1.upd_func_id,
						S0_T1.upd_ts,
						S0_T1.upd_srv_req_no,
						addDynamicSelect(DS0C_ITM_GRP)
					)
					.from(
						S0_T12
						.innerJoin(S0_T1).on(
							bracket(
								S0_T12.wk_schd_no.eq(S0_T1.wk_schd_no)
							)
						)
						.innerJoin(S0_T2).on(
							bracket(
								S0_T12.itm_mfg_inst_no.eq(S0_T2.itm_mfg_inst_no)
							)
						)
						.innerJoin(S0_T3).on(
							bracket(
								S0_T12.mfg_inst_no.eq(S0_T3.mfg_inst_no)
							)
						)
						.innerJoin(S0_T4).on(
							bracket(
								S0_T12.oper_inst_no.eq(S0_T4.oper_inst_no)
							)
						)
						.leftOuterJoin(
							subQuery()
							.select(
								S1_W1.wk_schd_no,
								sum(S1_W1.wk_cost).as("act_wk_cost"),
								max(S1_W1.ac_dt).as("ac_dt")
							)
							.from(S1_W1)
							.groupBy(S1_W1.wk_schd_no).view(S0_T6)
						).on(
							bracket(
								S0_T1.wk_schd_no.eq(S0_T6.pr(S1_W1.wk_schd_no))
							)
						)
						.innerJoin(S0_T8).on(
							bracket(
								S0_T12.oper_inst_no.eq(S0_T8.oper_inst_no)
								.and(S0_T12.div_seq.eq(S0_T8.div_seq))
							)
						)
						.innerJoin(S0_M4).on(
							bracket(
								S0_T2.mfg_loc_cd.eq(S0_M4.loc_cd)
							)
						)
						.leftOuterJoin(S0_M5).on(
							bracket(
								MAPA_LOC$F_GET_ASST_DPT_CD_NE(
									S0_T2.mfg_loc_cd,
									S0_T3.inst_dt,
									value(false)
								).eq(S0_M5.dpt_cd)
								.and(S0_T3.inst_dt.between(S0_M5.st_dt, S0_M5.end_dt))
							)
						)
						.leftOuterJoin(S0_M7).on(
							bracket(
								S0_T2.itm_cd.eq(S0_M7.itm_cd)
								.and(S0_T2.itm_sub1.eq(S0_M7.itm_sub1))
								.and(S0_T2.itm_sub2.eq(S0_M7.itm_sub2))
								.and(S0_T2.itm_sub3.eq(S0_M7.itm_sub3))
							)
						)
						.leftOuterJoin(S0_M8).on(
							bracket(
								S0_T2.itm_cd.eq(S0_M8.itm_cd)
								.and(S0_T2.itm_sub1.eq(S0_M8.itm_sub1))
								.and(S0_T2.itm_sub2.eq(S0_M8.itm_sub2))
								.and(S0_T2.itm_sub3.eq(S0_M8.itm_sub3))
								.and(S0_T2.sno1.eq(S0_M8.sno1))
								.and(S0_T2.sno2.eq(S0_M8.sno2))
								.and(S0_T2.sno3.eq(S0_M8.sno3))
								.and(S0_T2.sno4.eq(S0_M8.sno4))
							)
						)
						.addDynamicView()
						.addDynamicView(DS0C_ITM_GRP)
					)
					.where(
						value(0).eq(value(0))
						.and(S0_T12.div_seq.gt(value(0)))
						.and(S0_T12.mfg_sts_typ.eq(value(MSC_MFG_STS_TYP.ORD.value())))
						.and(
							value(true).eq(value(false))
							.cutoff$or(S0_T8.mfg_sts_typ.eq(bind("tmp_oper_sts_ord")))
							.cutoff$or(S0_T8.mfg_sts_typ.eq(bind("tmp_oper_sts_stt")))
							.cutoff$or(S0_T8.mfg_sts_typ.eq(bind("tmp_oper_sts_cmpl")))
						)
						.cutoff$and(S0_T4.st_schd_tm.gte(bind("oper_st_schd_hm_fr")))
						.cutoff$and(S0_T4.st_schd_tm.lte(bind("oper_st_schd_hm_to")))
						.cutoff$and(S0_T4.end_schd_tm.gte(bind("oper_end_schd_hm_fr")))
						.cutoff$and(S0_T4.end_schd_tm.lte(bind("oper_end_schd_hm_to")))
						.cutoff$and(S0_T4.oper_cd.like(bind("oper_cd")))
						.addDynamicPredicate()
						.cutoff$and(S0_T1.wk_cost_cd.like(bind("wk_cost_cd")))
						.cutoff$and(S0_T2.wg_cd.like(bind("loc_wg_cd")))
						.cutoff$and(S0_M5.dpt_cd.like(bind("dpt_cd")))
						.cutoff$and(S0_M5.dpt_nm.like(bind("dpt_nm")))
						.cutoff$and(S0_M4.site_cd.like(bind("site_cd")))
						.cutoff$and(S0_M4.loc_grp_cd.like(bind("loc_grp_cd")))
						.cutoff$and(S0_T2.mfg_loc_cd.like(bind("loc_cd")))
						.cutoff$and(S0_M4.loc_nm.like(bind("loc_nm")))
						.cutoff$and(S0_T2.mfg_str_ln_cd.like(bind("str_ln_cd")))
						.cutoff$and(S0_M7.itm_typ.like(bind("itm_typ")))
						.cutoff$and(S0_M7.itm_typ_d_cd.like(bind("itm_typ_d_cd")))
						.cutoff$and(S0_T2.itm_cd.like(bind("itm_cd")))
						.cutoff$and(S0_T2.itm_sub1.like(bind("itm_sub1")))
						.cutoff$and(S0_T2.itm_sub2.like(bind("itm_sub2")))
						.cutoff$and(S0_T2.itm_sub3.like(bind("itm_sub3")))
						.cutoff$and(
							nvl(
								S0_M8.itm_nm,
								S0_M7.itm_nm
							).like(bind("itm_nm"))
						)
						.cutoff$and(S0_T2.lot_no.like(bind("lot_no")))
						.cutoff$and(S0_T2.sublot_no.like(bind("sublot_no")))
						.cutoff$and(S0_T2.sno1.like(bind("sno1")))
						.cutoff$and(S0_T2.sno2.like(bind("sno2")))
						.cutoff$and(S0_T2.sno3.like(bind("sno3")))
						.cutoff$and(S0_T2.sno4.like(bind("sno4")))
						.cutoff$and(S0_T12.mfg_inst_no.like(bind("mfg_inst_no")))
						.cutoff$and(S0_T1.itm_mfg_inst_no.like(bind("itm_mfg_inst_no")))
						.cutoff$and(S0_T1.intr_rmrks.like(bind("schd_intr_rmrks")))
						.cutoff$and(S0_T1.sub_char1.like(bind("schd_sub_char1")))
						.cutoff$and(S0_T1.sub_char2.like(bind("schd_sub_char2")))
						.cutoff$and(S0_T1.sub_char3.like(bind("schd_sub_char3")))
						.addDynamicPredicate(DS0C_ITM_GRP)
					)
					.orderBy(
						S0_T1.mfg_inst_no.asc(),
						S0_T12.div_seq.asc(),
						S0_T1.disp_seq.asc()
					)
			)
			.setDynamicSQLInfo(
				when(boundOr("wrk_no", "wrk_nm"))
					.view(v -> v.leftOuterJoin(S0_T5).on(bracket(S0_T2.sno1.eq(S0_T5.sno1))))
					.predicate(p -> p.cutoff$and(S0_T5.wrk_no.like(bind("wrk_no"))).cutoff$and(S0_T5.wrk_nm.like(bind("wrk_nm")))),
				when(boundOr("oper_nm"))
					.view(v -> v.leftOuterJoin(S0_M1).on(bracket(S0_T4.oper_cd.eq(S0_M1.oper_cd))))
					.predicate(p -> p.cutoff$and(S0_M1.oper_nm.like(bind("oper_nm")))),
				when(boundOr("wk_cost_nm"))
					.view(v -> v.leftOuterJoin(S0_M3).on(bracket(S0_T1.wk_cost_cd.eq(S0_M3.wk_cost_cd))))
					.predicate(p -> p.cutoff$and(S0_M3.wk_cost_nm.like(bind("wk_cost_nm")))),
				when(boundOr("str_ln_nm"))
					.view(v -> v.leftOuterJoin(S0_M6).on(bracket(S0_T2.mfg_loc_cd.eq(S0_M6.loc_cd).and(S0_T2.mfg_str_ln_cd.eq(S0_M6.str_ln_cd)))))
					.predicate(p -> p.cutoff$and(S0_M6.str_ln_nm.like(bind("str_ln_nm")))),
				when(boundOr("loc_wg_nm"))
					.view(v -> v.leftOuterJoin(S0_M9).on(bracket(S0_T2.wg_cd.eq(S0_M9.wg_cd))))
					.predicate(p -> p.cutoff$and(S0_M9.wg_nm.like(bind("loc_wg_nm")))),
				when(boundOr("loc_grp_nm"))
					.view(v -> v.leftOuterJoin(S0_M10).on(bracket(S0_M4.loc_grp_cd.eq(S0_M10.loc_grp_cd))))
					.predicate(p -> p.cutoff$and(S0_M10.loc_grp_nm.like(bind("loc_grp_nm")))),
				when(boundOr("site_nm"))
					.view(v -> v.leftOuterJoin(S0_M11).on(bracket(S0_M4.site_cd.eq(S0_M11.site_cd))))
					.predicate(p -> p.cutoff$and(S0_M11.site_nm.like(bind("site_nm")))),
				when(boundOr("itm_typ_d_nm"))
					.view(v -> v.leftOuterJoin(S0_M12).on(bracket(S0_M7.itm_typ.eq(S0_M12.itm_typ).and(S0_M7.itm_typ_d_cd.eq(S0_M12.itm_typ_d_cd)))))
					.predicate(p -> p.cutoff$and(S0_M12.itm_typ_d_nm.like(bind("itm_typ_d_nm")))),
				when(boundOr("itm_grp_flg1"))
					.select(DS0C_ITM_GRP, S0_M7.itm_grp_cd1.as("itm_grp_cd1"), S0_MM1.itm_grp_nm.as("itm_grp_nm1"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM1).on(S0_M7.itm_grp_cd1.eq(S0_MM1.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP1.value()).eq(S0_MM1.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M7.itm_grp_cd1.like(bind("itm_grp_cd1"))).cutoff$and(S0_MM1.itm_grp_nm.like(bind("itm_grp_nm1")))),
				when(boundOr("itm_grp_flg2"))
					.select(DS0C_ITM_GRP, S0_M7.itm_grp_cd2.as("itm_grp_cd2"), S0_MM2.itm_grp_nm.as("itm_grp_nm2"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM2).on(S0_M7.itm_grp_cd2.eq(S0_MM2.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP2.value()).eq(S0_MM2.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M7.itm_grp_cd2.like(bind("itm_grp_cd2"))).cutoff$and(S0_MM2.itm_grp_nm.like(bind("itm_grp_nm2")))),
				when(boundOr("itm_grp_flg3"))
					.select(DS0C_ITM_GRP, S0_M7.itm_grp_cd3.as("itm_grp_cd3"), S0_MM3.itm_grp_nm.as("itm_grp_nm3"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM3).on(S0_M7.itm_grp_cd3.eq(S0_MM3.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP3.value()).eq(S0_MM3.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M7.itm_grp_cd3.like(bind("itm_grp_cd3"))).cutoff$and(S0_MM3.itm_grp_nm.like(bind("itm_grp_nm3")))),
				when(boundOr("itm_grp_flg4"))
					.select(DS0C_ITM_GRP, S0_M7.itm_grp_cd4.as("itm_grp_cd4"), S0_MM4.itm_grp_nm.as("itm_grp_nm4"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM4).on(S0_M7.itm_grp_cd4.eq(S0_MM4.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP4.value()).eq(S0_MM4.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M7.itm_grp_cd4.like(bind("itm_grp_cd4"))).cutoff$and(S0_MM4.itm_grp_nm.like(bind("itm_grp_nm4")))),
				when(boundOr("itm_grp_flg5"))
					.select(DS0C_ITM_GRP, S0_M7.itm_grp_cd5.as("itm_grp_cd5"), S0_MM5.itm_grp_nm.as("itm_grp_nm5"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM5).on(S0_M7.itm_grp_cd5.eq(S0_MM5.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP5.value()).eq(S0_MM5.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M7.itm_grp_cd5.like(bind("itm_grp_cd5"))).cutoff$and(S0_MM5.itm_grp_nm.like(bind("itm_grp_nm5")))),
				when(boundOr("itm_grp_flg6"))
					.select(DS0C_ITM_GRP, S0_M7.itm_grp_cd6.as("itm_grp_cd6"), S0_MM6.itm_grp_nm.as("itm_grp_nm6"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM6).on(S0_M7.itm_grp_cd6.eq(S0_MM6.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP6.value()).eq(S0_MM6.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M7.itm_grp_cd6.like(bind("itm_grp_cd6"))).cutoff$and(S0_MM6.itm_grp_nm.like(bind("itm_grp_nm6")))),
				when(boundOr("itm_grp_flg7"))
					.select(DS0C_ITM_GRP, S0_M7.itm_grp_cd7.as("itm_grp_cd7"), S0_MM7.itm_grp_nm.as("itm_grp_nm7"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM7).on(S0_M7.itm_grp_cd7.eq(S0_MM7.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP7.value()).eq(S0_MM7.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M7.itm_grp_cd7.like(bind("itm_grp_cd7"))).cutoff$and(S0_MM7.itm_grp_nm.like(bind("itm_grp_nm7")))),
				when(boundOr("itm_grp_flg8"))
					.select(DS0C_ITM_GRP, S0_M7.itm_grp_cd8.as("itm_grp_cd8"), S0_MM8.itm_grp_nm.as("itm_grp_nm8"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM8).on(S0_M7.itm_grp_cd8.eq(S0_MM8.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP8.value()).eq(S0_MM8.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M7.itm_grp_cd8.like(bind("itm_grp_cd8"))).cutoff$and(S0_MM8.itm_grp_nm.like(bind("itm_grp_nm8")))),
				when(boundOr("itm_grp_flg9"))
					.select(DS0C_ITM_GRP, S0_M7.itm_grp_cd9.as("itm_grp_cd9"), S0_MM9.itm_grp_nm.as("itm_grp_nm9"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM9).on(S0_M7.itm_grp_cd9.eq(S0_MM9.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP9.value()).eq(S0_MM9.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M7.itm_grp_cd9.like(bind("itm_grp_cd9"))).cutoff$and(S0_MM9.itm_grp_nm.like(bind("itm_grp_nm9")))),
				when(boundOr("itm_grp_flg10"))
					.select(DS0C_ITM_GRP, S0_M7.itm_grp_cd10.as("itm_grp_cd10"), S0_MM10.itm_grp_nm.as("itm_grp_nm10"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM10).on(S0_M7.itm_grp_cd10.eq(S0_MM10.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP10.value()).eq(S0_MM10.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M7.itm_grp_cd10.like(bind("itm_grp_cd10"))).cutoff$and(S0_MM10.itm_grp_nm.like(bind("itm_grp_nm10"))))
			)
			.setJoinInfo(
				joinInfo(
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
						.add(MAM_WK_COST_R.class, r -> toCondition(
							r.getStringNE("wk_cost_cd")
						))
						.addSelect(m -> toArray(
							m.dec_place,
							m.rnd_typ,
							m.wk_cost_nm,
							m.wk_cost_unit_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("wk_cost_nm", m.wk_cost_nm());
							r.setStringNE("wk_cost_unit_nm", m.wk_cost_unit_nm());
							r.setNumberNE("wk_cost_dec_place", m.dec_place());
							r.setStringNE("wk_cost_rnd_typ", m.rnd_typ());
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
						.add(MAM_WG_R.class, r -> toCondition(
							r.getStringNE("loc_wg_cd")
						))
						.addSelect(m -> toArray(
							m.wg_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("loc_wg_nm", m.wg_nm());
					}),
					j -> j
						.add(MAM_LOC_GRP_R.class, r -> toCondition(
							r.getStringNE("loc_grp_cd")
						))
						.addSelect(m -> toArray(
							m.loc_grp_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("loc_grp_nm", m.loc_grp_nm());
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
						.add(MAM_ITM_TYP_D_R.class, r -> toCondition(
							r.getStringNE("itm_typ"),
							r.getStringNE("itm_typ_d_cd")
						))
						.addSelect(m -> toArray(
							m.itm_typ_d_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("itm_typ_d_nm", m.itm_typ_d_nm());
					})
				)
			);
	}
	
	/**
	 * -- MSBCL1150_MST_WK_ACT_Query_S01
	 */
	static MCQueryPlan MSBCL1150_MST_WK_ACT_S01() {
		MST_WK_ACT_R S0_T11 = MST_WK_ACT_R.create("T11");
		MST_WK_ACT_REM_R S0_T12 = MST_WK_ACT_REM_R.create("T12");
		MST_MFG_ACT_R S0_T13 = MST_MFG_ACT_R.create("T13");
		MST_OPER_ACT_R S0_T14 = MST_OPER_ACT_R.create("T14");
		MST_WK_SCHD_R S0_T1 = MST_WK_SCHD_R.create("T1");
		MST_OPER_INST_R S0_T4 = MST_OPER_INST_R.create("T4");
		MSVT_WRK_SNO_R S0_T5 = MSVT_WRK_SNO_R.create("T5");
		MST_OPER_ACT_REM_R S0_T8 = MST_OPER_ACT_REM_R.create("T8");
		MAM_OPER_R S0_M1 = MAM_OPER_R.create("M1");
		MAM_WK_COST_R S0_M3 = MAM_WK_COST_R.create("M3");
		MAM_LOC_R S0_M4 = MAM_LOC_R.create("M4");
		MAM_DPT_R S0_M5 = MAM_DPT_R.create("M5");
		MAM_STR_LN_R S0_M6 = MAM_STR_LN_R.create("M6");
		MAM_ITM_R S0_M7 = MAM_ITM_R.create("M7");
		MAM_SUNDRY_ITM_R S0_M8 = MAM_SUNDRY_ITM_R.create("M8");
		MAM_WG_R S0_M9 = MAM_WG_R.create("M9");
		MAM_LOC_GRP_R S0_M10 = MAM_LOC_GRP_R.create("M10");
		MAM_SITE_R S0_M11 = MAM_SITE_R.create("M11");
		MAM_ITM_TYP_D_R S0_M12 = MAM_ITM_TYP_D_R.create("M12");
		MAM_WK_DAY_R S0_M21 = MAM_WK_DAY_R.create("M21");
		MAM_WK_RSN_R S0_M22 = MAM_WK_RSN_R.create("M22");
		MAM_USR_R S0_M23 = MAM_USR_R.create("M23");
		MAM_DPT_R S0_M24 = MAM_DPT_R.create("M24");
		MAVM_RD_LOC_R S0_M25 = MAVM_RD_LOC_R.create("M25");
		MAVM_RD_DPT_R S0_M26 = MAVM_RD_DPT_R.create("M26");
		MAM_WG_R S0_M27 = MAM_WG_R.create("M27");
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
				sql("MSBCL1150_MST_WK_ACT_Query_S01")
					.mainQuery()
					.select(
						nvl2(
							S0_T11.mfg_act_no,
							value(true),
							value(false)
						).as("inst_wk_act_flg"),
						S0_T1.disp_seq,
						S0_T4.disp_seq.as("oper_disp_seq"),
						S0_T11.oper_cd,
						S0_T4.oper_seq,
						S0_T11.wk_cost_cd,
						S0_T11.ac_dt,
						S0_T11.st_tm,
						S0_T11.end_tm,
						S0_T11.brk_pd,
						S0_T12.wk_cost.as("schd_wk_cost"),
						S0_T12.fxd_wk_cost.as("schd_fxd_wk_cost"),
						S0_T11.wk_cost.as("act_wk_cost"),
						bracket(
							cases()
								.when(S0_T12.abort_wk_cost.gt(value(0)))
									.then(value(true))
								.otherwise(value(false))
						).as("abort_flg"),
						S0_T12.rem_wk_cost,
						S0_T11.wk_day_cd,
						S0_T11.wk_rsn_cd,
						S0_T11.dpt_cd,
						S0_M5.dpt_nm,
						S0_T11.loc_cd,
						S0_T11.str_ln_cd,
						S0_T11.wk_usr_cd,
						S0_T11.wk_usr_dpt_cd,
						S0_T11.fclty,
						S0_M24.dpt_nm.as("wk_usr_dpt_nm"),
						S0_T1.wk_cost_calc_flg,
						S0_T11.wk_cost_calc_ctl_flg,
						S0_T1.intr_rmrks.as("schd_intr_rmrks"),
						S0_T1.sub_char1.as("schd_sub_char1"),
						S0_T1.sub_char2.as("schd_sub_char2"),
						S0_T1.sub_char3.as("schd_sub_char3"),
						S0_T11.intr_rmrks.as("act_intr_rmrks"),
						S0_T11.sub_char1.as("act_sub_char1"),
						S0_T11.sub_char2.as("act_sub_char2"),
						S0_T11.sub_char3.as("act_sub_char3"),
						S0_T11.itm_cd,
						S0_T11.itm_sub1,
						S0_T11.itm_sub2,
						S0_T11.itm_sub3,
						nvl(
							S0_M8.itm_nm,
							S0_M7.itm_nm
						).as("itm_nm"),
						S0_M7.lot_mng_typ,
						S0_M7.sublot_mng_typ,
						S0_M7.sno1_mng_typ,
						S0_M7.sno2_mng_typ,
						S0_M7.sno3_mng_typ,
						S0_M7.sno4_mng_typ,
						S0_T11.lot_no,
						S0_T11.sublot_no,
						S0_T11.sno1,
						S0_T11.sno2,
						S0_T11.sno3,
						S0_T11.sno4,
						trunc(
							S0_T4.st_schd_tm,
							MCDateFmt.DD
						).as("oper_st_schd_dt"),
						S0_T4.st_schd_tm.as("oper_st_schd_hm"),
						trunc(
							S0_T4.end_schd_tm,
							MCDateFmt.DD
						).as("oper_end_schd_dt"),
						S0_T4.end_schd_tm.as("oper_end_schd_hm"),
						S0_T12.mfg_sts_typ.as("wk_mfg_sts_typ"),
						S0_T8.mfg_sts_typ.as("oper_mfg_sts_typ"),
						S0_T11.itm_mfg_inst_no,
						S0_T4.oper_inst_no,
						S0_T1.wk_schd_no,
						S0_T11.mfg_act_no,
						S0_T11.oper_act_no,
						S0_T11.wk_act_no,
						S0_T11.dpt_wg_cd,
						S0_T11.loc_wg_cd,
						S0_M7.itm_typ,
						S0_M7.itm_typ_d_cd,
						S0_T11.ins_usr_id,
						S0_T11.ins_usr_nm,
						S0_T11.ins_func_id,
						S0_T11.ins_ts,
						S0_T11.upd_cntr.as("wk_act_upd_cntr"),
						S0_T11.upd_usr_id,
						S0_T11.upd_usr_nm,
						S0_T11.upd_func_id,
						S0_T11.upd_ts,
						S0_T11.upd_srv_req_no,
						S0_T11.mes_flg,
						S0_T11.ext_sys_cd,
						S0_T11.ext_wk_act_no,
						addDynamicSelect(DS0C_ITM_GRP)
					)
					.from(
						S0_T11
						.leftOuterJoin(S0_T12).on(
							bracket(
								S0_T11.wk_schd_no.eq(S0_T12.wk_schd_no)
								.and(S0_T11.div_seq.eq(S0_T12.div_seq))
							)
						)
						.leftOuterJoin(S0_T14).on(
							bracket(
								S0_T11.oper_act_no.eq(S0_T14.oper_act_no)
							)
						)
						.leftOuterJoin(S0_T1).on(
							bracket(
								S0_T11.wk_schd_no.eq(S0_T1.wk_schd_no)
							)
						)
						.leftOuterJoin(S0_T4).on(
							bracket(
								S0_T14.oper_inst_no.eq(S0_T4.oper_inst_no)
							)
						)
						.leftOuterJoin(S0_T8).on(
							bracket(
								S0_T14.oper_inst_no.eq(S0_T8.oper_inst_no)
								.and(S0_T14.div_seq.eq(S0_T8.div_seq))
							)
						)
						.leftOuterJoin(S0_M5).on(
							bracket(
								S0_T11.dpt_cd.eq(S0_M5.dpt_cd)
								.and(S0_T11.ac_dt.between(S0_M5.st_dt, S0_M5.end_dt))
							)
						)
						.leftOuterJoin(S0_M7).on(
							bracket(
								S0_T11.itm_cd.eq(S0_M7.itm_cd)
								.and(S0_T11.itm_sub1.eq(S0_M7.itm_sub1))
								.and(S0_T11.itm_sub2.eq(S0_M7.itm_sub2))
								.and(S0_T11.itm_sub3.eq(S0_M7.itm_sub3))
							)
						)
						.leftOuterJoin(S0_M8).on(
							bracket(
								S0_T11.itm_cd.eq(S0_M8.itm_cd)
								.and(S0_T11.itm_sub1.eq(S0_M8.itm_sub1))
								.and(S0_T11.itm_sub2.eq(S0_M8.itm_sub2))
								.and(S0_T11.itm_sub3.eq(S0_M8.itm_sub3))
								.and(S0_T11.sno1.eq(S0_M8.sno1))
								.and(S0_T11.sno2.eq(S0_M8.sno2))
								.and(S0_T11.sno3.eq(S0_M8.sno3))
								.and(S0_T11.sno4.eq(S0_M8.sno4))
							)
						)
						.leftOuterJoin(S0_M24).on(
							bracket(
								S0_T11.wk_usr_dpt_cd.eq(S0_M24.dpt_cd)
								.and(S0_T11.ac_dt.between(S0_M24.st_dt, S0_M24.end_dt))
							)
						)
						.leftOuterJoin(S0_M25).on(
							bracket(
								S0_T11.loc_cd.eq(S0_M25.loc_cd)
							)
						)
						.leftOuterJoin(S0_M26).on(
							bracket(
								S0_T11.dpt_cd.eq(S0_M26.dpt_cd)
							)
						)
						.addDynamicView()
						.addDynamicView(DS0C_ITM_GRP)
					)
					.where(
						value(0).eq(value(0))
						.and(
							bracket(
								S0_T11.mfg_act_no.isNotNull()
								.and(S0_M25.loc_cd.isNotNull())
							)
							.or(
								S0_T11.mfg_act_no.isNull()
								.and(S0_M26.dpt_cd.isNotNull())
							)
						)
						.cutoff$and(
							value(true).eq(bind("tmp_no_mfg_inst_only"))
							.and(S0_T11.mfg_act_no.isNull())
							.and(S0_T11.itm_cd.isNull())
						)
						.and(
							value(true).eq(value(false))
							.cutoff$or(S0_T12.mfg_sts_typ.eq(bind("tmp_sts_ord")))
							.cutoff$or(S0_T12.mfg_sts_typ.eq(bind("tmp_sts_stt")))
							.cutoff$or(S0_T12.mfg_sts_typ.eq(bind("tmp_sts_cmpl")))
							.cutoff$or(
								bracket(
									value(true).eq(bind("tmp_no_schd"))
									.and(S0_T12.mfg_sts_typ.isNull())
								)
							)
						)
						.and(
							value(true).eq(value(false))
							.cutoff$or(S0_T8.mfg_sts_typ.eq(bind("tmp_oper_sts_ord")))
							.cutoff$or(S0_T8.mfg_sts_typ.eq(bind("tmp_oper_sts_stt")))
							.cutoff$or(S0_T8.mfg_sts_typ.eq(bind("tmp_oper_sts_cmpl")))
							.cutoff$or(
								bracket(
									value(true).eq(bind("tmp_oper_no_inst"))
									.and(S0_T8.mfg_sts_typ.isNull())
								)
							)
						)
						.cutoff$and(S0_T4.st_schd_tm.gte(bind("oper_st_schd_hm_fr")))
						.cutoff$and(S0_T4.st_schd_tm.lte(bind("oper_st_schd_hm_to")))
						.cutoff$and(S0_T4.end_schd_tm.gte(bind("oper_end_schd_hm_fr")))
						.cutoff$and(S0_T4.end_schd_tm.lte(bind("oper_end_schd_hm_to")))
						.cutoff$and(S0_T11.ac_dt.gte(bind("ac_dt_fr")))
						.cutoff$and(S0_T11.ac_dt.lte(bind("ac_dt_to")))
						.cutoff$and(S0_T11.oper_cd.like(bind("oper_cd")))
						.addDynamicPredicate()
						.cutoff$and(S0_T11.wk_cost_cd.like(bind("wk_cost_cd")))
						.cutoff$and(S0_T11.loc_wg_cd.like(bind("loc_wg_cd")))
						.cutoff$and(S0_T11.dpt_cd.like(bind("dpt_cd")))
						.cutoff$and(S0_M5.dpt_nm.like(bind("dpt_nm")))
						.cutoff$and(S0_M5.wg_cd.like(bind("dpt_wg_cd")))
						.cutoff$and(S0_T11.loc_cd.like(bind("loc_cd")))
						.cutoff$and(S0_T11.str_ln_cd.like(bind("str_ln_cd")))
						.cutoff$and(S0_M7.itm_typ.like(bind("itm_typ")))
						.cutoff$and(S0_M7.itm_typ_d_cd.like(bind("itm_typ_d_cd")))
						.cutoff$and(S0_T11.itm_cd.like(bind("itm_cd")))
						.cutoff$and(S0_T11.itm_sub1.like(bind("itm_sub1")))
						.cutoff$and(S0_T11.itm_sub2.like(bind("itm_sub2")))
						.cutoff$and(S0_T11.itm_sub3.like(bind("itm_sub3")))
						.cutoff$and(
							nvl(
								S0_M8.itm_nm,
								S0_M7.itm_nm
							).like(bind("itm_nm"))
						)
						.cutoff$and(S0_T11.lot_no.like(bind("lot_no")))
						.cutoff$and(S0_T11.sublot_no.like(bind("sublot_no")))
						.cutoff$and(S0_T11.sno1.like(bind("sno1")))
						.cutoff$and(S0_T11.sno2.like(bind("sno2")))
						.cutoff$and(S0_T11.sno3.like(bind("sno3")))
						.cutoff$and(S0_T11.sno4.like(bind("sno4")))
						.cutoff$and(S0_T11.itm_mfg_inst_no.like(bind("itm_mfg_inst_no")))
						.cutoff$and(S0_T1.intr_rmrks.like(bind("schd_intr_rmrks")))
						.cutoff$and(S0_T1.sub_char1.like(bind("schd_sub_char1")))
						.cutoff$and(S0_T1.sub_char2.like(bind("schd_sub_char2")))
						.cutoff$and(S0_T1.sub_char3.like(bind("schd_sub_char3")))
						.cutoff$and(S0_T11.wk_rsn_cd.like(bind("wk_rsn_cd")))
						.cutoff$and(S0_T11.wk_day_cd.like(bind("wk_day_cd")))
						.cutoff$and(S0_T11.wk_usr_cd.like(bind("wk_usr_cd")))
						.cutoff$and(S0_T11.wk_usr_dpt_cd.like(bind("wk_usr_dpt_cd")))
						.cutoff$and(S0_T11.fclty.like(bind("fclty")))
						.cutoff$and(S0_M24.dpt_nm.like(bind("wk_usr_dpt_nm")))
						.cutoff$and(S0_T11.wk_act_no.like(bind("wk_act_no")))
						.cutoff$and(S0_T11.mfg_act_no.like(bind("mfg_act_no")))
						.cutoff$and(S0_T11.intr_rmrks.like(bind("act_intr_rmrks")))
						.cutoff$and(S0_T11.sub_char1.like(bind("act_sub_char1")))
						.cutoff$and(S0_T11.sub_char2.like(bind("act_sub_char2")))
						.cutoff$and(S0_T11.sub_char3.like(bind("act_sub_char3")))
						.cutoff$and(S0_T11.ext_wk_act_no.like(bind("ext_wk_act_no")))
						.addDynamicPredicate(DS0C_ITM_GRP)
					)
					.orderBy(
						S0_T1.mfg_inst_no.asc(),
						S0_T12.div_seq.asc(),
						S0_T1.disp_seq.asc(),
						S0_T11.wk_act_no.asc()
					)
			)
			.setDynamicSQLInfo(
				when(boundOr("mfg_inst_no"))
					.view(v -> v.leftOuterJoin(S0_T13).on(bracket(S0_T11.mfg_act_no.eq(S0_T13.mfg_act_no))))
					.predicate(p -> p.cutoff$and(S0_T13.mfg_inst_no.like(bind("mfg_inst_no")))),
				when(boundOr("wrk_no", "wrk_nm"))
					.view(v -> v.leftOuterJoin(S0_T5).on(bracket(S0_T11.sno1.eq(S0_T5.sno1))))
					.predicate(p -> p.cutoff$and(S0_T5.wrk_no.like(bind("wrk_no"))).cutoff$and(S0_T5.wrk_nm.like(bind("wrk_nm")))),
				when(boundOr("oper_nm"))
					.view(v -> v.leftOuterJoin(S0_M1).on(bracket(S0_T11.oper_cd.eq(S0_M1.oper_cd))))
					.predicate(p -> p.cutoff$and(S0_M1.oper_nm.like(bind("oper_nm")))),
				when(boundOr("wk_cost_nm"))
					.view(v -> v.leftOuterJoin(S0_M3).on(bracket(S0_T11.wk_cost_cd.eq(S0_M3.wk_cost_cd))))
					.predicate(p -> p.cutoff$and(S0_M3.wk_cost_nm.like(bind("wk_cost_nm")))),
				when(boundOr("loc_grp_nm", "site_nm", "site_cd", "loc_grp_cd", "loc_nm"))
					.view(v -> v.leftOuterJoin(S0_M4).on(bracket(S0_T11.loc_cd.eq(S0_M4.loc_cd))))
					.predicate(p -> p.cutoff$and(S0_M4.site_cd.like(bind("site_cd"))).cutoff$and(S0_M4.loc_grp_cd.like(bind("loc_grp_cd"))).cutoff$and(S0_M4.loc_nm.like(bind("loc_nm")))),
				when(boundOr("str_ln_nm"))
					.view(v -> v.leftOuterJoin(S0_M6).on(bracket(S0_T11.loc_cd.eq(S0_M6.loc_cd).and(S0_T11.str_ln_cd.eq(S0_M6.str_ln_cd)))))
					.predicate(p -> p.cutoff$and(S0_M6.str_ln_nm.like(bind("str_ln_nm")))),
				when(boundOr("loc_wg_nm"))
					.view(v -> v.leftOuterJoin(S0_M9).on(bracket(S0_T11.loc_wg_cd.eq(S0_M9.wg_cd))))
					.predicate(p -> p.cutoff$and(S0_M9.wg_nm.like(bind("loc_wg_nm")))),
				when(boundOr("loc_grp_nm"))
					.view(v -> v.leftOuterJoin(S0_M10).on(bracket(S0_M4.loc_grp_cd.eq(S0_M10.loc_grp_cd))))
					.predicate(p -> p.cutoff$and(S0_M10.loc_grp_nm.like(bind("loc_grp_nm")))),
				when(boundOr("site_nm"))
					.view(v -> v.leftOuterJoin(S0_M11).on(bracket(S0_M4.site_cd.eq(S0_M11.site_cd))))
					.predicate(p -> p.cutoff$and(S0_M11.site_nm.like(bind("site_nm")))),
				when(boundOr("itm_typ_d_nm"))
					.view(v -> v.leftOuterJoin(S0_M12).on(bracket(S0_M7.itm_typ.eq(S0_M12.itm_typ).and(S0_M7.itm_typ_d_cd.eq(S0_M12.itm_typ_d_cd)))))
					.predicate(p -> p.cutoff$and(S0_M12.itm_typ_d_nm.like(bind("itm_typ_d_nm")))),
				when(boundOr("wk_day_nm"))
					.view(v -> v.leftOuterJoin(S0_M21).on(bracket(S0_T11.wk_day_cd.eq(S0_M21.wk_day_cd))))
					.predicate(p -> p.cutoff$and(S0_M21.wk_day_nm.like(bind("wk_day_nm")))),
				when(boundOr("wk_rsn_nm"))
					.view(v -> v.leftOuterJoin(S0_M22).on(bracket(S0_T11.wk_rsn_cd.eq(S0_M22.wk_rsn_cd))))
					.predicate(p -> p.cutoff$and(S0_M22.wk_rsn_nm.like(bind("wk_rsn_nm")))),
				when(boundOr("wk_usr_nm"))
					.view(v -> v.leftOuterJoin(S0_M23).on(bracket(S0_T11.wk_usr_cd.eq(S0_M23.usr_cd))))
					.predicate(p -> p.cutoff$and(S0_M23.usr_nm.like(bind("wk_usr_nm")))),
				when(boundOr("dpt_wg_nm"))
					.view(v -> v.leftOuterJoin(S0_M27).on(bracket(S0_T11.dpt_wg_cd.eq(S0_M27.wg_cd))))
					.predicate(p -> p.cutoff$and(S0_M27.wg_nm.like(bind("dpt_wg_nm")))),
				when(boundOr("itm_grp_flg1"))
					.select(DS0C_ITM_GRP, S0_M7.itm_grp_cd1.as("itm_grp_cd1"), S0_MM1.itm_grp_nm.as("itm_grp_nm1"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM1).on(S0_M7.itm_grp_cd1.eq(S0_MM1.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP1.value()).eq(S0_MM1.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M7.itm_grp_cd1.like(bind("itm_grp_cd1"))).cutoff$and(S0_MM1.itm_grp_nm.like(bind("itm_grp_nm1")))),
				when(boundOr("itm_grp_flg2"))
					.select(DS0C_ITM_GRP, S0_M7.itm_grp_cd2.as("itm_grp_cd2"), S0_MM2.itm_grp_nm.as("itm_grp_nm2"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM2).on(S0_M7.itm_grp_cd2.eq(S0_MM2.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP2.value()).eq(S0_MM2.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M7.itm_grp_cd2.like(bind("itm_grp_cd2"))).cutoff$and(S0_MM2.itm_grp_nm.like(bind("itm_grp_nm2")))),
				when(boundOr("itm_grp_flg3"))
					.select(DS0C_ITM_GRP, S0_M7.itm_grp_cd3.as("itm_grp_cd3"), S0_MM3.itm_grp_nm.as("itm_grp_nm3"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM3).on(S0_M7.itm_grp_cd3.eq(S0_MM3.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP3.value()).eq(S0_MM3.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M7.itm_grp_cd3.like(bind("itm_grp_cd3"))).cutoff$and(S0_MM3.itm_grp_nm.like(bind("itm_grp_nm3")))),
				when(boundOr("itm_grp_flg4"))
					.select(DS0C_ITM_GRP, S0_M7.itm_grp_cd4.as("itm_grp_cd4"), S0_MM4.itm_grp_nm.as("itm_grp_nm4"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM4).on(S0_M7.itm_grp_cd4.eq(S0_MM4.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP4.value()).eq(S0_MM4.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M7.itm_grp_cd4.like(bind("itm_grp_cd4"))).cutoff$and(S0_MM4.itm_grp_nm.like(bind("itm_grp_nm4")))),
				when(boundOr("itm_grp_flg5"))
					.select(DS0C_ITM_GRP, S0_M7.itm_grp_cd5.as("itm_grp_cd5"), S0_MM5.itm_grp_nm.as("itm_grp_nm5"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM5).on(S0_M7.itm_grp_cd5.eq(S0_MM5.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP5.value()).eq(S0_MM5.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M7.itm_grp_cd5.like(bind("itm_grp_cd5"))).cutoff$and(S0_MM5.itm_grp_nm.like(bind("itm_grp_nm5")))),
				when(boundOr("itm_grp_flg6"))
					.select(DS0C_ITM_GRP, S0_M7.itm_grp_cd6.as("itm_grp_cd6"), S0_MM6.itm_grp_nm.as("itm_grp_nm6"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM6).on(S0_M7.itm_grp_cd6.eq(S0_MM6.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP6.value()).eq(S0_MM6.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M7.itm_grp_cd6.like(bind("itm_grp_cd6"))).cutoff$and(S0_MM6.itm_grp_nm.like(bind("itm_grp_nm6")))),
				when(boundOr("itm_grp_flg7"))
					.select(DS0C_ITM_GRP, S0_M7.itm_grp_cd7.as("itm_grp_cd7"), S0_MM7.itm_grp_nm.as("itm_grp_nm7"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM7).on(S0_M7.itm_grp_cd7.eq(S0_MM7.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP7.value()).eq(S0_MM7.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M7.itm_grp_cd7.like(bind("itm_grp_cd7"))).cutoff$and(S0_MM7.itm_grp_nm.like(bind("itm_grp_nm7")))),
				when(boundOr("itm_grp_flg8"))
					.select(DS0C_ITM_GRP, S0_M7.itm_grp_cd8.as("itm_grp_cd8"), S0_MM8.itm_grp_nm.as("itm_grp_nm8"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM8).on(S0_M7.itm_grp_cd8.eq(S0_MM8.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP8.value()).eq(S0_MM8.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M7.itm_grp_cd8.like(bind("itm_grp_cd8"))).cutoff$and(S0_MM8.itm_grp_nm.like(bind("itm_grp_nm8")))),
				when(boundOr("itm_grp_flg9"))
					.select(DS0C_ITM_GRP, S0_M7.itm_grp_cd9.as("itm_grp_cd9"), S0_MM9.itm_grp_nm.as("itm_grp_nm9"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM9).on(S0_M7.itm_grp_cd9.eq(S0_MM9.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP9.value()).eq(S0_MM9.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M7.itm_grp_cd9.like(bind("itm_grp_cd9"))).cutoff$and(S0_MM9.itm_grp_nm.like(bind("itm_grp_nm9")))),
				when(boundOr("itm_grp_flg10"))
					.select(DS0C_ITM_GRP, S0_M7.itm_grp_cd10.as("itm_grp_cd10"), S0_MM10.itm_grp_nm.as("itm_grp_nm10"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM10).on(S0_M7.itm_grp_cd10.eq(S0_MM10.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP10.value()).eq(S0_MM10.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M7.itm_grp_cd10.like(bind("itm_grp_cd10"))).cutoff$and(S0_MM10.itm_grp_nm.like(bind("itm_grp_nm10"))))
			)
			.setJoinInfo(
				joinInfo(
					j -> j
						.add(MST_MFG_ACT_R.class, r -> toCondition(
							r.getStringNE("mfg_act_no")
						))
						.addSelect(m -> toArray(
							m.div_seq,
							m.mfg_inst_no
						))
						.addMap((r, m) -> {
							r.setStringNE("mfg_inst_no", m.mfg_inst_no());
							r.setNumberNE("div_seq", m.div_seq());
					}),
					j -> j
						.add(MST_ITM_MFG_INST_R.class, r -> toCondition(
							r.getStringNE("itm_mfg_inst_no")
						))
						.addSelect(m -> toArray(
							m.oper_ptn
						))
						.addMap((r, m) -> {
							r.setStringNE("oper_ptn", m.oper_ptn());
					}),
					j -> j
						.add(MST_MFG_INST_R.class, r -> toCondition(
							r.getStringNE("mfg_inst_no")
						))
						.addSelect(m -> toArray(
							m.aprv_flg,
							m.mfg_aprv_sts_typ,
							m.upd_cntr
						))
						.addMap((r, m) -> {
							r.setBooleanNE("aprv_flg", m.aprv_flg());
							r.setStringNE("mfg_aprv_sts_typ", m.mfg_aprv_sts_typ());
							r.setNumberNE("mfg_inst_upd_cntr", m.upd_cntr());
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
						.add(MAM_WK_COST_R.class, r -> toCondition(
							r.getStringNE("wk_cost_cd")
						))
						.addSelect(m -> toArray(
							m.dec_place,
							m.rnd_typ,
							m.wk_cost_nm,
							m.wk_cost_unit_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("wk_cost_nm", m.wk_cost_nm());
							r.setStringNE("wk_cost_unit_nm", m.wk_cost_unit_nm());
							r.setNumberNE("wk_cost_dec_place", m.dec_place());
							r.setStringNE("wk_cost_rnd_typ", m.rnd_typ());
					}),
					j -> j
						.add(MAM_LOC_R.class, r -> toCondition(
							r.getStringNE("loc_cd")
						))
						.addSelect(m -> toArray(
							m.loc_grp_cd,
							m.loc_nm,
							m.site_cd,
							m.str_ln_tgt_flg
						))
						.addMap((r, m) -> {
							r.setStringNE("loc_nm", m.loc_nm());
							r.setBooleanNE("str_ln_tgt_flg", m.str_ln_tgt_flg());
							r.setStringNE("loc_grp_cd", m.loc_grp_cd());
							r.setStringNE("site_cd", m.site_cd());
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
						.add(MAM_WG_R.class, r -> toCondition(
							r.getStringNE("loc_wg_cd")
						))
						.addSelect(m -> toArray(
							m.wg_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("loc_wg_nm", m.wg_nm());
					}),
					j -> j
						.add(MAM_LOC_GRP_R.class, r -> toCondition(
							r.getStringNE("loc_grp_cd")
						))
						.addSelect(m -> toArray(
							m.loc_grp_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("loc_grp_nm", m.loc_grp_nm());
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
						.add(MAM_WG_R.class, r -> toCondition(
							r.getStringNE("dpt_wg_cd")
						))
						.addSelect(m -> toArray(
							m.wg_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("dpt_wg_nm", m.wg_nm());
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
	 * -- MSBCL1150_MST_WK_SCHD_Query_S01
	 */
	static MCQueryPlan MSBCL1150_MST_WK_SCHD_S01() {
		MST_WK_SCHD_R S0_T1 = MST_WK_SCHD_R.create("T1");
		MST_ITM_MFG_INST_R S0_T2 = MST_ITM_MFG_INST_R.create("T2");
		MST_MFG_INST_R S0_T3 = MST_MFG_INST_R.create("T3");
		MST_OPER_INST_R S0_T4 = MST_OPER_INST_R.create("T4");
		MSVT_WRK_SNO_R S0_T5 = MSVT_WRK_SNO_R.create("T5");
		MCTempView S0_T6 = createTempView("T6");
		MSVT_OPER_INST_PR_R S0_T8 = MSVT_OPER_INST_PR_R.create("T8");
		MSVT_WK_SCHD_PR_R S0_T9 = MSVT_WK_SCHD_PR_R.create("T9");
		MAM_OPER_R S0_M1 = MAM_OPER_R.create("M1");
		MAM_WK_COST_R S0_M3 = MAM_WK_COST_R.create("M3");
		MAVM_RD_LOC_R S0_M4 = MAVM_RD_LOC_R.create("M4");
		MAM_DPT_R S0_M5 = MAM_DPT_R.create("M5");
		MAM_STR_LN_R S0_M6 = MAM_STR_LN_R.create("M6");
		MAM_ITM_R S0_M7 = MAM_ITM_R.create("M7");
		MAM_SUNDRY_ITM_R S0_M8 = MAM_SUNDRY_ITM_R.create("M8");
		MAM_WG_R S0_M9 = MAM_WG_R.create("M9");
		MAM_LOC_GRP_R S0_M10 = MAM_LOC_GRP_R.create("M10");
		MAM_SITE_R S0_M11 = MAM_SITE_R.create("M11");
		MAM_ITM_TYP_D_R S0_M12 = MAM_ITM_TYP_D_R.create("M12");
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
		MST_WK_ACT_R S1_TMP1 = MST_WK_ACT_R.create("TMP1");
		
		MCDynamicSQLID DS0C_ITM_GRP = createDynamicSQLID("DS0C_ITM_GRP");
		
		return createQueryPlan()
			.setQuery(
				sql("MSBCL1150_MST_WK_SCHD_Query_S01")
					.mainQuery()
					.select(
						value(true).as("inst_wk_act_flg"),
						S0_T1.mfg_inst_no,
						S0_T1.disp_seq,
						S0_T2.oper_ptn,
						S0_T4.disp_seq.as("oper_disp_seq"),
						S0_T4.oper_cd,
						S0_T4.oper_seq,
						S0_T1.wk_cost_cd,
						S0_T6.pr("ac_dt"),
						S0_T1.wk_cost.as("schd_wk_cost"),
						S0_T1.fxd_wk_cost.as("schd_fxd_wk_cost"),
						S0_T6.pr("act_wk_cost"),
						S0_T9.rem_wk_cost,
						MAPA_CALC$F_CALC_PER(
							S0_T1.wk_cost.add(S0_T1.fxd_wk_cost),
							S0_T6.pr("act_wk_cost")
						).as("pr_rate"),
						S0_M5.dpt_cd,
						S0_M5.dpt_nm,
						S0_T2.mfg_loc_cd.as("loc_cd"),
						S0_M4.loc_nm,
						S0_M4.str_ln_tgt_flg,
						S0_T2.mfg_str_ln_cd.as("str_ln_cd"),
						S0_T1.wk_cost_calc_flg,
						S0_T1.intr_rmrks.as("schd_intr_rmrks"),
						S0_T1.sub_char1.as("schd_sub_char1"),
						S0_T1.sub_char2.as("schd_sub_char2"),
						S0_T1.sub_char3.as("schd_sub_char3"),
						S0_T2.itm_cd,
						S0_T2.itm_sub1,
						S0_T2.itm_sub2,
						S0_T2.itm_sub3,
						nvl(
							S0_M8.itm_nm,
							S0_M7.itm_nm
						).as("itm_nm"),
						S0_M7.lot_mng_typ,
						S0_M7.sublot_mng_typ,
						S0_M7.sno1_mng_typ,
						S0_M7.sno2_mng_typ,
						S0_M7.sno3_mng_typ,
						S0_M7.sno4_mng_typ,
						S0_T2.lot_no,
						S0_T2.sublot_no,
						S0_T2.sno1,
						S0_T2.sno2,
						S0_T2.sno3,
						S0_T2.sno4,
						trunc(
							S0_T4.st_schd_tm,
							MCDateFmt.DD
						).as("oper_st_schd_dt"),
						S0_T4.st_schd_tm.as("oper_st_schd_tm"),
						trunc(
							S0_T4.end_schd_tm,
							MCDateFmt.DD
						).as("oper_end_schd_dt"),
						S0_T4.end_schd_tm.as("oper_end_schd_tm"),
						S0_T9.mfg_sts_typ.as("wk_mfg_sts_typ"),
						S0_T8.mfg_sts_typ.as("oper_mfg_sts_typ"),
						S0_T3.aprv_flg,
						S0_T3.mfg_aprv_sts_typ,
						S0_T1.itm_mfg_inst_no,
						S0_T4.oper_inst_no,
						S0_T1.wk_schd_no,
						S0_T2.wg_cd.as("loc_wg_cd"),
						S0_M4.loc_grp_cd,
						S0_M4.site_cd,
						S0_M7.itm_typ,
						S0_M7.itm_typ_d_cd,
						S0_T1.ins_usr_id,
						S0_T1.ins_usr_nm,
						S0_T1.ins_func_id,
						S0_T1.ins_ts,
						S0_T1.upd_usr_id,
						S0_T1.upd_usr_nm,
						S0_T1.upd_func_id,
						S0_T1.upd_ts,
						S0_T1.upd_srv_req_no,
						S0_T6.pr("mes_flg"),
						S0_T6.pr("ext_sys_cd"),
						S0_T6.pr("ext_wk_act_no"),
						addDynamicSelect(DS0C_ITM_GRP)
					)
					.from(
						S0_T1
						.innerJoin(S0_T2).on(
							bracket(
								S0_T1.itm_mfg_inst_no.eq(S0_T2.itm_mfg_inst_no)
							)
						)
						.innerJoin(S0_T3).on(
							bracket(
								S0_T1.mfg_inst_no.eq(S0_T3.mfg_inst_no)
							)
						)
						.innerJoin(S0_T4).on(
							bracket(
								S0_T1.oper_inst_no.eq(S0_T4.oper_inst_no)
							)
						)
						.leftOuterJoin(
							subQuery()
							.select(
								S1_TMP1.wk_schd_no,
								sum(S1_TMP1.wk_cost).as("act_wk_cost"),
								max(S1_TMP1.ac_dt).as("ac_dt"),
								max(S1_TMP1.mes_flg).as("mes_flg"),
								max(S1_TMP1.ext_sys_cd).as("ext_sys_cd"),
								max(S1_TMP1.ext_wk_act_no).as("ext_wk_act_no")
							)
							.from(S1_TMP1)
							.groupBy(S1_TMP1.wk_schd_no).view(S0_T6)
						).on(
							bracket(
								S0_T1.wk_schd_no.eq(S0_T6.pr(S1_TMP1.wk_schd_no))
							)
						)
						.innerJoin(S0_T8).on(
							bracket(
								S0_T1.oper_inst_no.eq(S0_T8.oper_inst_no)
							)
						)
						.innerJoin(S0_T9).on(
							bracket(
								S0_T1.wk_schd_no.eq(S0_T9.wk_schd_no)
							)
						)
						.innerJoin(S0_M4).on(
							bracket(
								S0_T2.mfg_loc_cd.eq(S0_M4.loc_cd)
							)
						)
						.leftOuterJoin(S0_M5).on(
							bracket(
								MAPA_LOC$F_GET_ASST_DPT_CD_NE(
									S0_T2.mfg_loc_cd,
									S0_T3.inst_dt,
									value(false)
								).eq(S0_M5.dpt_cd)
								.and(S0_T3.inst_dt.between(S0_M5.st_dt, S0_M5.end_dt))
							)
						)
						.leftOuterJoin(S0_M7).on(
							bracket(
								S0_T2.itm_cd.eq(S0_M7.itm_cd)
								.and(S0_T2.itm_sub1.eq(S0_M7.itm_sub1))
								.and(S0_T2.itm_sub2.eq(S0_M7.itm_sub2))
								.and(S0_T2.itm_sub3.eq(S0_M7.itm_sub3))
							)
						)
						.leftOuterJoin(S0_M8).on(
							bracket(
								S0_T2.itm_cd.eq(S0_M8.itm_cd)
								.and(S0_T2.itm_sub1.eq(S0_M8.itm_sub1))
								.and(S0_T2.itm_sub2.eq(S0_M8.itm_sub2))
								.and(S0_T2.itm_sub3.eq(S0_M8.itm_sub3))
								.and(S0_T2.sno1.eq(S0_M8.sno1))
								.and(S0_T2.sno2.eq(S0_M8.sno2))
								.and(S0_T2.sno3.eq(S0_M8.sno3))
								.and(S0_T2.sno4.eq(S0_M8.sno4))
							)
						)
						.addDynamicView()
						.addDynamicView(DS0C_ITM_GRP)
					)
					.where(
						value(0).eq(value(0))
						.and(S0_T1.can_flg.eq(value(false)))
						.and(
							value(true).eq(value(false))
							.cutoff$or(S0_T9.mfg_sts_typ.eq(bind("tmp_sts_ord")))
							.cutoff$or(S0_T9.mfg_sts_typ.eq(bind("tmp_sts_stt")))
							.cutoff$or(S0_T9.mfg_sts_typ.eq(bind("tmp_sts_cmpl")))
						)
						.and(
							value(true).eq(value(false))
							.cutoff$or(S0_T8.mfg_sts_typ.eq(bind("tmp_oper_sts_ord")))
							.cutoff$or(S0_T8.mfg_sts_typ.eq(bind("tmp_oper_sts_stt")))
							.cutoff$or(S0_T8.mfg_sts_typ.eq(bind("tmp_oper_sts_cmpl")))
						)
						.cutoff$and(S0_T4.st_schd_tm.gte(bind("oper_st_schd_hm_fr")))
						.cutoff$and(S0_T4.st_schd_tm.lte(bind("oper_st_schd_hm_to")))
						.cutoff$and(S0_T4.end_schd_tm.gte(bind("oper_end_schd_hm_fr")))
						.cutoff$and(S0_T4.end_schd_tm.lte(bind("oper_end_schd_hm_to")))
						.cutoff$and(S0_T6.pr("ac_dt").gte(bind("ac_dt_fr")))
						.cutoff$and(S0_T6.pr("ac_dt").lte(bind("ac_dt_to")))
						.cutoff$and(
							MAPA_CALC$F_CALC_PER(
								S0_T1.wk_cost.add(S0_T1.fxd_wk_cost),
								S0_T6.pr("act_wk_cost")
							).gte(bind("pr_rate_fr"))
						)
						.cutoff$and(
							MAPA_CALC$F_CALC_PER(
								S0_T1.wk_cost.add(S0_T1.fxd_wk_cost),
								S0_T6.pr("act_wk_cost")
							).lte(bind("pr_rate_to"))
						)
						.cutoff$and(S0_T4.oper_cd.like(bind("oper_cd")))
						.addDynamicPredicate()
						.cutoff$and(S0_T1.wk_cost_cd.like(bind("wk_cost_cd")))
						.cutoff$and(S0_T2.wg_cd.like(bind("loc_wg_cd")))
						.cutoff$and(S0_M5.dpt_cd.like(bind("dpt_cd")))
						.cutoff$and(S0_M5.dpt_nm.like(bind("dpt_nm")))
						.cutoff$and(S0_M4.site_cd.like(bind("site_cd")))
						.cutoff$and(S0_M4.loc_grp_cd.like(bind("loc_grp_cd")))
						.cutoff$and(S0_T2.mfg_loc_cd.like(bind("loc_cd")))
						.cutoff$and(S0_M4.loc_nm.like(bind("loc_nm")))
						.cutoff$and(S0_T2.mfg_str_ln_cd.like(bind("str_ln_cd")))
						.cutoff$and(S0_M7.itm_typ.like(bind("itm_typ")))
						.cutoff$and(S0_M7.itm_typ_d_cd.like(bind("itm_typ_d_cd")))
						.cutoff$and(S0_T2.itm_cd.like(bind("itm_cd")))
						.cutoff$and(S0_T2.itm_sub1.like(bind("itm_sub1")))
						.cutoff$and(S0_T2.itm_sub2.like(bind("itm_sub2")))
						.cutoff$and(S0_T2.itm_sub3.like(bind("itm_sub3")))
						.cutoff$and(
							nvl(
								S0_M8.itm_nm,
								S0_M7.itm_nm
							).like(bind("itm_nm"))
						)
						.cutoff$and(S0_T2.lot_no.like(bind("lot_no")))
						.cutoff$and(S0_T2.sublot_no.like(bind("sublot_no")))
						.cutoff$and(S0_T2.sno1.like(bind("sno1")))
						.cutoff$and(S0_T2.sno2.like(bind("sno2")))
						.cutoff$and(S0_T2.sno3.like(bind("sno3")))
						.cutoff$and(S0_T2.sno4.like(bind("sno4")))
						.cutoff$and(S0_T1.mfg_inst_no.like(bind("mfg_inst_no")))
						.cutoff$and(S0_T1.itm_mfg_inst_no.like(bind("itm_mfg_inst_no")))
						.cutoff$and(S0_T1.intr_rmrks.like(bind("schd_intr_rmrks")))
						.cutoff$and(S0_T1.sub_char1.like(bind("schd_sub_char1")))
						.cutoff$and(S0_T1.sub_char2.like(bind("schd_sub_char2")))
						.cutoff$and(S0_T1.sub_char3.like(bind("schd_sub_char3")))
						.addDynamicPredicate(DS0C_ITM_GRP)
					)
					.orderBy(
						S0_T1.mfg_inst_no.asc(),
						S0_T1.disp_seq.asc()
					)
			)
			.setDynamicSQLInfo(
				when(boundOr("wrk_no", "wrk_nm"))
					.view(v -> v.leftOuterJoin(S0_T5).on(bracket(S0_T2.sno1.eq(S0_T5.sno1))))
					.predicate(p -> p.cutoff$and(S0_T5.wrk_no.like(bind("wrk_no"))).cutoff$and(S0_T5.wrk_nm.like(bind("wrk_nm")))),
				when(boundOr("oper_nm"))
					.view(v -> v.leftOuterJoin(S0_M1).on(bracket(S0_T4.oper_cd.eq(S0_M1.oper_cd))))
					.predicate(p -> p.cutoff$and(S0_M1.oper_nm.like(bind("oper_nm")))),
				when(boundOr("wk_cost_nm"))
					.view(v -> v.leftOuterJoin(S0_M3).on(bracket(S0_T1.wk_cost_cd.eq(S0_M3.wk_cost_cd))))
					.predicate(p -> p.cutoff$and(S0_M3.wk_cost_nm.like(bind("wk_cost_nm")))),
				when(boundOr("str_ln_nm"))
					.view(v -> v.leftOuterJoin(S0_M6).on(bracket(S0_T2.mfg_loc_cd.eq(S0_M6.loc_cd).and(S0_T2.mfg_str_ln_cd.eq(S0_M6.str_ln_cd)))))
					.predicate(p -> p.cutoff$and(S0_M6.str_ln_nm.like(bind("str_ln_nm")))),
				when(boundOr("loc_wg_nm"))
					.view(v -> v.leftOuterJoin(S0_M9).on(bracket(S0_T2.wg_cd.eq(S0_M9.wg_cd))))
					.predicate(p -> p.cutoff$and(S0_M9.wg_nm.like(bind("loc_wg_nm")))),
				when(boundOr("loc_grp_nm"))
					.view(v -> v.leftOuterJoin(S0_M10).on(bracket(S0_M4.loc_grp_cd.eq(S0_M10.loc_grp_cd))))
					.predicate(p -> p.cutoff$and(S0_M10.loc_grp_nm.like(bind("loc_grp_nm")))),
				when(boundOr("site_nm"))
					.view(v -> v.leftOuterJoin(S0_M11).on(bracket(S0_M4.site_cd.eq(S0_M11.site_cd))))
					.predicate(p -> p.cutoff$and(S0_M11.site_nm.like(bind("site_nm")))),
				when(boundOr("itm_typ_d_nm"))
					.view(v -> v.leftOuterJoin(S0_M12).on(bracket(S0_M7.itm_typ.eq(S0_M12.itm_typ).and(S0_M7.itm_typ_d_cd.eq(S0_M12.itm_typ_d_cd)))))
					.predicate(p -> p.cutoff$and(S0_M12.itm_typ_d_nm.like(bind("itm_typ_d_nm")))),
				when(boundOr("itm_grp_flg1"))
					.select(DS0C_ITM_GRP, S0_M7.itm_grp_cd1.as("itm_grp_cd1"), S0_MM1.itm_grp_nm.as("itm_grp_nm1"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM1).on(S0_M7.itm_grp_cd1.eq(S0_MM1.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP1.value()).eq(S0_MM1.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M7.itm_grp_cd1.like(bind("itm_grp_cd1"))).cutoff$and(S0_MM1.itm_grp_nm.like(bind("itm_grp_nm1")))),
				when(boundOr("itm_grp_flg2"))
					.select(DS0C_ITM_GRP, S0_M7.itm_grp_cd2.as("itm_grp_cd2"), S0_MM2.itm_grp_nm.as("itm_grp_nm2"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM2).on(S0_M7.itm_grp_cd2.eq(S0_MM2.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP2.value()).eq(S0_MM2.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M7.itm_grp_cd2.like(bind("itm_grp_cd2"))).cutoff$and(S0_MM2.itm_grp_nm.like(bind("itm_grp_nm2")))),
				when(boundOr("itm_grp_flg3"))
					.select(DS0C_ITM_GRP, S0_M7.itm_grp_cd3.as("itm_grp_cd3"), S0_MM3.itm_grp_nm.as("itm_grp_nm3"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM3).on(S0_M7.itm_grp_cd3.eq(S0_MM3.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP3.value()).eq(S0_MM3.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M7.itm_grp_cd3.like(bind("itm_grp_cd3"))).cutoff$and(S0_MM3.itm_grp_nm.like(bind("itm_grp_nm3")))),
				when(boundOr("itm_grp_flg4"))
					.select(DS0C_ITM_GRP, S0_M7.itm_grp_cd4.as("itm_grp_cd4"), S0_MM4.itm_grp_nm.as("itm_grp_nm4"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM4).on(S0_M7.itm_grp_cd4.eq(S0_MM4.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP4.value()).eq(S0_MM4.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M7.itm_grp_cd4.like(bind("itm_grp_cd4"))).cutoff$and(S0_MM4.itm_grp_nm.like(bind("itm_grp_nm4")))),
				when(boundOr("itm_grp_flg5"))
					.select(DS0C_ITM_GRP, S0_M7.itm_grp_cd5.as("itm_grp_cd5"), S0_MM5.itm_grp_nm.as("itm_grp_nm5"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM5).on(S0_M7.itm_grp_cd5.eq(S0_MM5.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP5.value()).eq(S0_MM5.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M7.itm_grp_cd5.like(bind("itm_grp_cd5"))).cutoff$and(S0_MM5.itm_grp_nm.like(bind("itm_grp_nm5")))),
				when(boundOr("itm_grp_flg6"))
					.select(DS0C_ITM_GRP, S0_M7.itm_grp_cd6.as("itm_grp_cd6"), S0_MM6.itm_grp_nm.as("itm_grp_nm6"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM6).on(S0_M7.itm_grp_cd6.eq(S0_MM6.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP6.value()).eq(S0_MM6.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M7.itm_grp_cd6.like(bind("itm_grp_cd6"))).cutoff$and(S0_MM6.itm_grp_nm.like(bind("itm_grp_nm6")))),
				when(boundOr("itm_grp_flg7"))
					.select(DS0C_ITM_GRP, S0_M7.itm_grp_cd7.as("itm_grp_cd7"), S0_MM7.itm_grp_nm.as("itm_grp_nm7"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM7).on(S0_M7.itm_grp_cd7.eq(S0_MM7.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP7.value()).eq(S0_MM7.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M7.itm_grp_cd7.like(bind("itm_grp_cd7"))).cutoff$and(S0_MM7.itm_grp_nm.like(bind("itm_grp_nm7")))),
				when(boundOr("itm_grp_flg8"))
					.select(DS0C_ITM_GRP, S0_M7.itm_grp_cd8.as("itm_grp_cd8"), S0_MM8.itm_grp_nm.as("itm_grp_nm8"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM8).on(S0_M7.itm_grp_cd8.eq(S0_MM8.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP8.value()).eq(S0_MM8.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M7.itm_grp_cd8.like(bind("itm_grp_cd8"))).cutoff$and(S0_MM8.itm_grp_nm.like(bind("itm_grp_nm8")))),
				when(boundOr("itm_grp_flg9"))
					.select(DS0C_ITM_GRP, S0_M7.itm_grp_cd9.as("itm_grp_cd9"), S0_MM9.itm_grp_nm.as("itm_grp_nm9"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM9).on(S0_M7.itm_grp_cd9.eq(S0_MM9.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP9.value()).eq(S0_MM9.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M7.itm_grp_cd9.like(bind("itm_grp_cd9"))).cutoff$and(S0_MM9.itm_grp_nm.like(bind("itm_grp_nm9")))),
				when(boundOr("itm_grp_flg10"))
					.select(DS0C_ITM_GRP, S0_M7.itm_grp_cd10.as("itm_grp_cd10"), S0_MM10.itm_grp_nm.as("itm_grp_nm10"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM10).on(S0_M7.itm_grp_cd10.eq(S0_MM10.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP10.value()).eq(S0_MM10.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M7.itm_grp_cd10.like(bind("itm_grp_cd10"))).cutoff$and(S0_MM10.itm_grp_nm.like(bind("itm_grp_nm10"))))
			)
			.setJoinInfo(
				joinInfo(
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
						.add(MAM_WK_COST_R.class, r -> toCondition(
							r.getStringNE("wk_cost_cd")
						))
						.addSelect(m -> toArray(
							m.dec_place,
							m.rnd_typ,
							m.wk_cost_nm,
							m.wk_cost_unit_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("wk_cost_nm", m.wk_cost_nm());
							r.setStringNE("wk_cost_unit_nm", m.wk_cost_unit_nm());
							r.setNumberNE("wk_cost_dec_place", m.dec_place());
							r.setStringNE("wk_cost_rnd_typ", m.rnd_typ());
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
						.add(MAM_WG_R.class, r -> toCondition(
							r.getStringNE("loc_wg_cd")
						))
						.addSelect(m -> toArray(
							m.wg_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("loc_wg_nm", m.wg_nm());
					}),
					j -> j
						.add(MAM_LOC_GRP_R.class, r -> toCondition(
							r.getStringNE("loc_grp_cd")
						))
						.addSelect(m -> toArray(
							m.loc_grp_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("loc_grp_nm", m.loc_grp_nm());
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