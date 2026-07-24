package mcframe.serverMSBA.MSBAL0040;

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
	 * -- MSBAL0040_MST_DMND_REC_MAP_Query_S01
	 */
	static MCQueryPlan MSBAL0040_MST_DMND_REC_MAP_S01() {
		MST_DMND_R S0_T1 = MST_DMND_R.create("T1");
		MSW_DMND_KEY_R S0_T2 = MSW_DMND_KEY_R.create("T2");
		MST_DMND_REC_MAP_R S0_T3 = MST_DMND_REC_MAP_R.create("T3");
		MST_DMND_R S0_T4 = MST_DMND_R.create("T4");
		MAM_ITM_R S0_M1 = MAM_ITM_R.create("M1");
		MAM_DPT_R S0_M5 = MAM_DPT_R.create("M5");
		MAM_BP_R S0_M8 = MAM_BP_R.create("M8");
		MAM_BP_R S0_M9 = MAM_BP_R.create("M9");
		MAM_CO_R S0_M16 = MAM_CO_R.create("M16");
		MSVT_WRK_SNO_R S0_T5 = MSVT_WRK_SNO_R.create("T5");
		MST_WRK_R S0_T6 = MST_WRK_R.create("T6");
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
		MAM_BP_GRP_R S0_MM_FR_DLV1 = MAM_BP_GRP_R.create("MM_FR_DLV1");
		MAM_BP_GRP_R S0_MM_FR_DLV2 = MAM_BP_GRP_R.create("MM_FR_DLV2");
		MAM_BP_GRP_R S0_MM_FR_DLV3 = MAM_BP_GRP_R.create("MM_FR_DLV3");
		MAM_BP_GRP_R S0_MM_FR_DLV4 = MAM_BP_GRP_R.create("MM_FR_DLV4");
		MAM_BP_GRP_R S0_MM_FR_DLV5 = MAM_BP_GRP_R.create("MM_FR_DLV5");
		MAM_BP_GRP_R S0_MM_FR_DLV6 = MAM_BP_GRP_R.create("MM_FR_DLV6");
		MAM_BP_GRP_R S0_MM_FR_DLV7 = MAM_BP_GRP_R.create("MM_FR_DLV7");
		MAM_BP_GRP_R S0_MM_FR_DLV8 = MAM_BP_GRP_R.create("MM_FR_DLV8");
		MAM_BP_GRP_R S0_MM_FR_DLV9 = MAM_BP_GRP_R.create("MM_FR_DLV9");
		MAM_BP_GRP_R S0_MM_FR_DLV10 = MAM_BP_GRP_R.create("MM_FR_DLV10");
		MAM_BP_GRP_R S0_MM_FR_CST1 = MAM_BP_GRP_R.create("MM_FR_CST1");
		MAM_BP_GRP_R S0_MM_FR_CST2 = MAM_BP_GRP_R.create("MM_FR_CST2");
		MAM_BP_GRP_R S0_MM_FR_CST3 = MAM_BP_GRP_R.create("MM_FR_CST3");
		MAM_BP_GRP_R S0_MM_FR_CST4 = MAM_BP_GRP_R.create("MM_FR_CST4");
		MAM_BP_GRP_R S0_MM_FR_CST5 = MAM_BP_GRP_R.create("MM_FR_CST5");
		MAM_BP_GRP_R S0_MM_FR_CST6 = MAM_BP_GRP_R.create("MM_FR_CST6");
		MAM_BP_GRP_R S0_MM_FR_CST7 = MAM_BP_GRP_R.create("MM_FR_CST7");
		MAM_BP_GRP_R S0_MM_FR_CST8 = MAM_BP_GRP_R.create("MM_FR_CST8");
		MAM_BP_GRP_R S0_MM_FR_CST9 = MAM_BP_GRP_R.create("MM_FR_CST9");
		MAM_BP_GRP_R S0_MM_FR_CST10 = MAM_BP_GRP_R.create("MM_FR_CST10");
		
		MCDynamicSQLID DS0C_FR_CST_GRP = createDynamicSQLID("DS0C_FR_CST_GRP");
		MCDynamicSQLID DS0C_FR_DLV_GRP = createDynamicSQLID("DS0C_FR_DLV_GRP");
		MCDynamicSQLID DS0C_ITM_GRP = createDynamicSQLID("DS0C_ITM_GRP");
		
		return createQueryPlan()
			.setQuery(
				sql("MSBAL0040_MST_DMND_REC_MAP_Query_S01")
					.mainQuery()
					.select(
						S0_T1.dmnd_no.as("to_dmnd_no"),
						S0_T4.dmnd_no.as("fr_dmnd_no"),
						S0_T4.dmnd_dt.as("fr_dmnd_dt"),
						S0_T4.dmnd_st_dt.as("fr_dmnd_st_dt"),
						S0_T4.dmnd_end_dt.as("fr_dmnd_end_dt"),
						S0_T4.dlv_schd_st_dt.as("fr_dlv_schd_st_dt"),
						S0_T4.dlv_schd_end_dt.as("fr_dlv_schd_end_dt"),
						S0_T4.dmnd_period_typ.as("fr_dmnd_period_typ"),
						S0_T4.itm_cd,
						S0_T4.itm_sub1,
						S0_T4.itm_sub2,
						S0_T4.itm_sub3,
						S0_T4.spln_itm_cd.as("fr_spln_itm_cd"),
						S0_T4.dmnd_typ.as("fr_dmnd_typ"),
						S0_T4.dmnd_qty.as("fr_dmnd_qty"),
						S0_T4.input_qty.as("fr_input_qty"),
						S0_T3.rec_qty.as("fr_rec_qty"),
						S0_T4.dmnd_dpt_cd.as("fr_dmnd_dpt_cd"),
						S0_M5.dpt_nm.as("fr_dmnd_dpt_nm"),
						S0_T4.dmnd_usr_cd.as("fr_dmnd_usr_cd"),
						S0_T4.cst_cd.as("fr_cst_cd"),
						S0_T4.dlv_cd.as("fr_dlv_cd"),
						S0_T4.slo_d_no.as("fr_slo_d_no"),
						S0_T4.slo_no.as("fr_slo_no"),
						S0_T4.cst_frcst_d_no.as("fr_cst_frcst_d_no"),
						S0_T4.cst_frcst_no.as("fr_cst_frcst_no"),
						S0_T4.ym.as("fr_ym"),
						S0_T4.spln_vers.as("fr_spln_vers"),
						S0_T4.cur_cd.as("fr_cur_cd"),
						S0_T4.sno1.as("fr_sno1"),
						S0_T4.sno2.as("fr_sno2"),
						S0_T4.sno3.as("fr_sno3"),
						S0_T4.sno4.as("fr_sno4"),
						nvl(
							S0_T5.wrk_no,
							S0_T4.wrk_no
						).as("fr_wrk_no"),
						nvl(
							S0_T5.wrk_nm,
							S0_T6.wrk_nm
						).as("fr_wrk_nm"),
						S0_T4.dmnd_loc_cd.as("fr_dmnd_loc_cd"),
						S0_T4.intr_rmrks.as("fr_intr_rmrks"),
						S0_T4.sub_char1.as("fr_sub_char1"),
						S0_T4.sub_char2.as("fr_sub_char2"),
						S0_T4.sub_char3.as("fr_sub_char3"),
						S0_T4.ins_usr_id.as("fr_ins_usr_id"),
						S0_T4.ins_usr_nm.as("fr_ins_usr_nm"),
						S0_T4.ins_ts.as("fr_ins_ts"),
						S0_T4.ins_func_id.as("fr_ins_func_id"),
						S0_T4.upd_usr_id.as("fr_upd_usr_id"),
						S0_T4.upd_usr_nm.as("fr_upd_usr_nm"),
						S0_T4.upd_ts.as("fr_upd_ts"),
						S0_T4.upd_func_id.as("fr_upd_func_id"),
						S0_T4.upd_srv_req_no.as("fr_upd_srv_req_no"),
						addDynamicSelect(DS0C_ITM_GRP),
						addDynamicSelect(DS0C_FR_DLV_GRP),
						addDynamicSelect(DS0C_FR_CST_GRP),
						// this field is appended by sql coverter.
						S0_T1.dmnd_usr_cd.as("join_dmnd_usr_cd_")
					)
					.from(
						S0_T1
						.innerJoin(S0_T2).on(
							bracket(
								S0_T2.dmnd_no.eq(S0_T1.dmnd_no)
							)
						)
						.innerJoin(S0_T3).on(
							bracket(
								S0_T3.to_dmnd_no.eq(S0_T2.dmnd_no)
							)
						)
						.innerJoin(S0_T4).on(
							bracket(
								S0_T4.dmnd_no.eq(S0_T3.fr_dmnd_no)
							)
						)
						.leftOuterJoin(S0_M5).on(
							bracket(
								S0_M5.dpt_cd.eq(S0_T4.dmnd_dpt_cd)
								.and(S0_T4.dmnd_dt.between(S0_M5.st_dt, S0_M5.end_dt))
							)
						)
						.innerJoin(S0_M16).on(
							bracket(
								value(0).eq(value(0))
							)
						)
						.leftOuterJoin(S0_T5).on(
							bracket(
								S0_T5.sno1.eq(S0_T4.sno1)
							)
						)
						.leftOuterJoin(S0_T6).on(
							bracket(
								S0_T6.wrk_no.eq(S0_T4.wrk_no)
							)
						)
						.addDynamicView()
						.addDynamicView(DS0C_ITM_GRP)
						.addDynamicView(DS0C_FR_DLV_GRP)
						.addDynamicView(DS0C_FR_CST_GRP)
					)
					.where(
						value(0).eq(value(0))
						.addDynamicPredicate()
						.addDynamicPredicate(DS0C_ITM_GRP)
						.addDynamicPredicate(DS0C_FR_DLV_GRP)
						.addDynamicPredicate(DS0C_FR_CST_GRP)
					)
					.orderBy(
						S0_T1.itm_cd.asc(),
						S0_T1.itm_sub1.asc(),
						S0_T1.itm_sub2.asc(),
						S0_T1.itm_sub3.asc(),
						MAPA_DT$F_GET_PERIOD_ST_DT_NE(
							S0_T1.dmnd_st_dt,
							value(MAC_PERIOD_TYP.MONTHLY.value()),
							S0_M16.ac_cl_day
						).asc(),
						S0_T1.dmnd_typ.desc(),
						S0_T1.dmnd_period_typ.desc(),
						S0_T4.dmnd_typ.desc(),
						S0_T4.dmnd_period_typ.desc(),
						S0_T1.dmnd_no.asc(),
						S0_T4.dmnd_no.asc()
					)
			)
			.setDynamicSQLInfo(
				when(boundOr("itm_grp_flg1", "itm_grp_flg2", "itm_grp_flg3", "itm_grp_flg4", "itm_grp_flg5", "itm_grp_flg6", "itm_grp_flg7", "itm_grp_flg8", "itm_grp_flg9", "itm_grp_flg10", "itm_nm"))
					.view(v -> v.leftOuterJoin(S0_M1).on(bracket(S0_M1.itm_cd.eq(S0_T4.itm_cd).and(S0_M1.itm_sub1.eq(S0_T4.itm_sub1)).and(S0_M1.itm_sub2.eq(S0_T4.itm_sub2)).and(S0_M1.itm_sub3.eq(S0_T4.itm_sub3)))))
					.predicate(p -> p.cutoff$and(S0_M1.itm_nm.like(bind("itm_nm")))),
				when(boundOr("fr_dlv_grp_flg1", "fr_dlv_grp_flg2", "fr_dlv_grp_flg3", "fr_dlv_grp_flg4", "fr_dlv_grp_flg5", "fr_dlv_grp_flg6", "fr_dlv_grp_flg7", "fr_dlv_grp_flg8", "fr_dlv_grp_flg9", "fr_dlv_grp_flg10"))
					.view(v -> v.leftOuterJoin(S0_M8).on(bracket(S0_M8.bp_cd.eq(S0_T4.dlv_cd)))),
				when(boundOr("fr_cst_grp_flg1", "fr_cst_grp_flg2", "fr_cst_grp_flg3", "fr_cst_grp_flg4", "fr_cst_grp_flg5", "fr_cst_grp_flg6", "fr_cst_grp_flg7", "fr_cst_grp_flg8", "fr_cst_grp_flg9", "fr_cst_grp_flg10"))
					.view(v -> v.leftOuterJoin(S0_M9).on(bracket(S0_M9.bp_cd.eq(S0_T4.cst_cd)))),
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
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M1.itm_grp_cd10.like(bind("itm_grp_cd10"))).cutoff$and(S0_MM10.itm_grp_nm.like(bind("itm_grp_nm10")))),
				when(boundOr("fr_dlv_grp_flg1"))
					.select(DS0C_FR_DLV_GRP, S0_M8.bp_grp_cd1.as("fr_dlv_grp_cd1"), S0_MM_FR_DLV1.bp_grp_nm.as("fr_dlv_grp_nm1"))
					.view(DS0C_FR_DLV_GRP, v -> v.leftOuterJoin(S0_MM_FR_DLV1).on(S0_M8.bp_grp_cd1.eq(S0_MM_FR_DLV1.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP1.value()).eq(S0_MM_FR_DLV1.bp_grp_typ))))
					.predicate(DS0C_FR_DLV_GRP, p -> p.cutoff$and(S0_M8.bp_grp_cd1.like(bind("fr_dlv_grp_cd1"))).cutoff$and(S0_MM_FR_DLV1.bp_grp_nm.like(bind("fr_dlv_grp_nm1")))),
				when(boundOr("fr_dlv_grp_flg2"))
					.select(DS0C_FR_DLV_GRP, S0_M8.bp_grp_cd2.as("fr_dlv_grp_cd2"), S0_MM_FR_DLV2.bp_grp_nm.as("fr_dlv_grp_nm2"))
					.view(DS0C_FR_DLV_GRP, v -> v.leftOuterJoin(S0_MM_FR_DLV2).on(S0_M8.bp_grp_cd2.eq(S0_MM_FR_DLV2.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP2.value()).eq(S0_MM_FR_DLV2.bp_grp_typ))))
					.predicate(DS0C_FR_DLV_GRP, p -> p.cutoff$and(S0_M8.bp_grp_cd2.like(bind("fr_dlv_grp_cd2"))).cutoff$and(S0_MM_FR_DLV2.bp_grp_nm.like(bind("fr_dlv_grp_nm2")))),
				when(boundOr("fr_dlv_grp_flg3"))
					.select(DS0C_FR_DLV_GRP, S0_M8.bp_grp_cd3.as("fr_dlv_grp_cd3"), S0_MM_FR_DLV3.bp_grp_nm.as("fr_dlv_grp_nm3"))
					.view(DS0C_FR_DLV_GRP, v -> v.leftOuterJoin(S0_MM_FR_DLV3).on(S0_M8.bp_grp_cd3.eq(S0_MM_FR_DLV3.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP3.value()).eq(S0_MM_FR_DLV3.bp_grp_typ))))
					.predicate(DS0C_FR_DLV_GRP, p -> p.cutoff$and(S0_M8.bp_grp_cd3.like(bind("fr_dlv_grp_cd3"))).cutoff$and(S0_MM_FR_DLV3.bp_grp_nm.like(bind("fr_dlv_grp_nm3")))),
				when(boundOr("fr_dlv_grp_flg4"))
					.select(DS0C_FR_DLV_GRP, S0_M8.bp_grp_cd4.as("fr_dlv_grp_cd4"), S0_MM_FR_DLV4.bp_grp_nm.as("fr_dlv_grp_nm4"))
					.view(DS0C_FR_DLV_GRP, v -> v.leftOuterJoin(S0_MM_FR_DLV4).on(S0_M8.bp_grp_cd4.eq(S0_MM_FR_DLV4.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP4.value()).eq(S0_MM_FR_DLV4.bp_grp_typ))))
					.predicate(DS0C_FR_DLV_GRP, p -> p.cutoff$and(S0_M8.bp_grp_cd4.like(bind("fr_dlv_grp_cd4"))).cutoff$and(S0_MM_FR_DLV4.bp_grp_nm.like(bind("fr_dlv_grp_nm4")))),
				when(boundOr("fr_dlv_grp_flg5"))
					.select(DS0C_FR_DLV_GRP, S0_M8.bp_grp_cd5.as("fr_dlv_grp_cd5"), S0_MM_FR_DLV5.bp_grp_nm.as("fr_dlv_grp_nm5"))
					.view(DS0C_FR_DLV_GRP, v -> v.leftOuterJoin(S0_MM_FR_DLV5).on(S0_M8.bp_grp_cd5.eq(S0_MM_FR_DLV5.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP5.value()).eq(S0_MM_FR_DLV5.bp_grp_typ))))
					.predicate(DS0C_FR_DLV_GRP, p -> p.cutoff$and(S0_M8.bp_grp_cd5.like(bind("fr_dlv_grp_cd5"))).cutoff$and(S0_MM_FR_DLV5.bp_grp_nm.like(bind("fr_dlv_grp_nm5")))),
				when(boundOr("fr_dlv_grp_flg6"))
					.select(DS0C_FR_DLV_GRP, S0_M8.bp_grp_cd6.as("fr_dlv_grp_cd6"), S0_MM_FR_DLV6.bp_grp_nm.as("fr_dlv_grp_nm6"))
					.view(DS0C_FR_DLV_GRP, v -> v.leftOuterJoin(S0_MM_FR_DLV6).on(S0_M8.bp_grp_cd6.eq(S0_MM_FR_DLV6.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP6.value()).eq(S0_MM_FR_DLV6.bp_grp_typ))))
					.predicate(DS0C_FR_DLV_GRP, p -> p.cutoff$and(S0_M8.bp_grp_cd6.like(bind("fr_dlv_grp_cd6"))).cutoff$and(S0_MM_FR_DLV6.bp_grp_nm.like(bind("fr_dlv_grp_nm6")))),
				when(boundOr("fr_dlv_grp_flg7"))
					.select(DS0C_FR_DLV_GRP, S0_M8.bp_grp_cd7.as("fr_dlv_grp_cd7"), S0_MM_FR_DLV7.bp_grp_nm.as("fr_dlv_grp_nm7"))
					.view(DS0C_FR_DLV_GRP, v -> v.leftOuterJoin(S0_MM_FR_DLV7).on(S0_M8.bp_grp_cd7.eq(S0_MM_FR_DLV7.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP7.value()).eq(S0_MM_FR_DLV7.bp_grp_typ))))
					.predicate(DS0C_FR_DLV_GRP, p -> p.cutoff$and(S0_M8.bp_grp_cd7.like(bind("fr_dlv_grp_cd7"))).cutoff$and(S0_MM_FR_DLV7.bp_grp_nm.like(bind("fr_dlv_grp_nm7")))),
				when(boundOr("fr_dlv_grp_flg8"))
					.select(DS0C_FR_DLV_GRP, S0_M8.bp_grp_cd8.as("fr_dlv_grp_cd8"), S0_MM_FR_DLV8.bp_grp_nm.as("fr_dlv_grp_nm8"))
					.view(DS0C_FR_DLV_GRP, v -> v.leftOuterJoin(S0_MM_FR_DLV8).on(S0_M8.bp_grp_cd8.eq(S0_MM_FR_DLV8.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP8.value()).eq(S0_MM_FR_DLV8.bp_grp_typ))))
					.predicate(DS0C_FR_DLV_GRP, p -> p.cutoff$and(S0_M8.bp_grp_cd8.like(bind("fr_dlv_grp_cd8"))).cutoff$and(S0_MM_FR_DLV8.bp_grp_nm.like(bind("fr_dlv_grp_nm8")))),
				when(boundOr("fr_dlv_grp_flg9"))
					.select(DS0C_FR_DLV_GRP, S0_M8.bp_grp_cd9.as("fr_dlv_grp_cd9"), S0_MM_FR_DLV9.bp_grp_nm.as("fr_dlv_grp_nm9"))
					.view(DS0C_FR_DLV_GRP, v -> v.leftOuterJoin(S0_MM_FR_DLV9).on(S0_M8.bp_grp_cd9.eq(S0_MM_FR_DLV9.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP9.value()).eq(S0_MM_FR_DLV9.bp_grp_typ))))
					.predicate(DS0C_FR_DLV_GRP, p -> p.cutoff$and(S0_M8.bp_grp_cd9.like(bind("fr_dlv_grp_cd9"))).cutoff$and(S0_MM_FR_DLV9.bp_grp_nm.like(bind("fr_dlv_grp_nm9")))),
				when(boundOr("fr_dlv_grp_flg10"))
					.select(DS0C_FR_DLV_GRP, S0_M8.bp_grp_cd10.as("fr_dlv_grp_cd10"), S0_MM_FR_DLV10.bp_grp_nm.as("fr_dlv_grp_nm10"))
					.view(DS0C_FR_DLV_GRP, v -> v.leftOuterJoin(S0_MM_FR_DLV10).on(S0_M8.bp_grp_cd10.eq(S0_MM_FR_DLV10.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP10.value()).eq(S0_MM_FR_DLV10.bp_grp_typ))))
					.predicate(DS0C_FR_DLV_GRP, p -> p.cutoff$and(S0_M8.bp_grp_cd10.like(bind("fr_dlv_grp_cd10"))).cutoff$and(S0_MM_FR_DLV10.bp_grp_nm.like(bind("fr_dlv_grp_nm10")))),
				when(boundOr("fr_cst_grp_flg1"))
					.select(DS0C_FR_CST_GRP, S0_M9.bp_grp_cd1.as("fr_cst_grp_cd1"), S0_MM_FR_CST1.bp_grp_nm.as("fr_cst_grp_nm1"))
					.view(DS0C_FR_CST_GRP, v -> v.leftOuterJoin(S0_MM_FR_CST1).on(S0_M9.bp_grp_cd1.eq(S0_MM_FR_CST1.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP1.value()).eq(S0_MM_FR_CST1.bp_grp_typ))))
					.predicate(DS0C_FR_CST_GRP, p -> p.cutoff$and(S0_M9.bp_grp_cd1.like(bind("fr_cst_grp_cd1"))).cutoff$and(S0_MM_FR_CST1.bp_grp_nm.like(bind("fr_cst_grp_nm1")))),
				when(boundOr("fr_cst_grp_flg2"))
					.select(DS0C_FR_CST_GRP, S0_M9.bp_grp_cd2.as("fr_cst_grp_cd2"), S0_MM_FR_CST2.bp_grp_nm.as("fr_cst_grp_nm2"))
					.view(DS0C_FR_CST_GRP, v -> v.leftOuterJoin(S0_MM_FR_CST2).on(S0_M9.bp_grp_cd2.eq(S0_MM_FR_CST2.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP2.value()).eq(S0_MM_FR_CST2.bp_grp_typ))))
					.predicate(DS0C_FR_CST_GRP, p -> p.cutoff$and(S0_M9.bp_grp_cd2.like(bind("fr_cst_grp_cd2"))).cutoff$and(S0_MM_FR_CST2.bp_grp_nm.like(bind("fr_cst_grp_nm2")))),
				when(boundOr("fr_cst_grp_flg3"))
					.select(DS0C_FR_CST_GRP, S0_M9.bp_grp_cd3.as("fr_cst_grp_cd3"), S0_MM_FR_CST3.bp_grp_nm.as("fr_cst_grp_nm3"))
					.view(DS0C_FR_CST_GRP, v -> v.leftOuterJoin(S0_MM_FR_CST3).on(S0_M9.bp_grp_cd3.eq(S0_MM_FR_CST3.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP3.value()).eq(S0_MM_FR_CST3.bp_grp_typ))))
					.predicate(DS0C_FR_CST_GRP, p -> p.cutoff$and(S0_M9.bp_grp_cd3.like(bind("fr_cst_grp_cd3"))).cutoff$and(S0_MM_FR_CST3.bp_grp_nm.like(bind("fr_cst_grp_nm3")))),
				when(boundOr("fr_cst_grp_flg4"))
					.select(DS0C_FR_CST_GRP, S0_M9.bp_grp_cd4.as("fr_cst_grp_cd4"), S0_MM_FR_CST4.bp_grp_nm.as("fr_cst_grp_nm4"))
					.view(DS0C_FR_CST_GRP, v -> v.leftOuterJoin(S0_MM_FR_CST4).on(S0_M9.bp_grp_cd4.eq(S0_MM_FR_CST4.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP4.value()).eq(S0_MM_FR_CST4.bp_grp_typ))))
					.predicate(DS0C_FR_CST_GRP, p -> p.cutoff$and(S0_M9.bp_grp_cd4.like(bind("fr_cst_grp_cd4"))).cutoff$and(S0_MM_FR_CST4.bp_grp_nm.like(bind("fr_cst_grp_nm4")))),
				when(boundOr("fr_cst_grp_flg5"))
					.select(DS0C_FR_CST_GRP, S0_M9.bp_grp_cd5.as("fr_cst_grp_cd5"), S0_MM_FR_CST5.bp_grp_nm.as("fr_cst_grp_nm5"))
					.view(DS0C_FR_CST_GRP, v -> v.leftOuterJoin(S0_MM_FR_CST5).on(S0_M9.bp_grp_cd5.eq(S0_MM_FR_CST5.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP5.value()).eq(S0_MM_FR_CST5.bp_grp_typ))))
					.predicate(DS0C_FR_CST_GRP, p -> p.cutoff$and(S0_M9.bp_grp_cd5.like(bind("fr_cst_grp_cd5"))).cutoff$and(S0_MM_FR_CST5.bp_grp_nm.like(bind("fr_cst_grp_nm5")))),
				when(boundOr("fr_cst_grp_flg6"))
					.select(DS0C_FR_CST_GRP, S0_M9.bp_grp_cd6.as("fr_cst_grp_cd6"), S0_MM_FR_CST6.bp_grp_nm.as("fr_cst_grp_nm6"))
					.view(DS0C_FR_CST_GRP, v -> v.leftOuterJoin(S0_MM_FR_CST6).on(S0_M9.bp_grp_cd6.eq(S0_MM_FR_CST6.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP6.value()).eq(S0_MM_FR_CST6.bp_grp_typ))))
					.predicate(DS0C_FR_CST_GRP, p -> p.cutoff$and(S0_M9.bp_grp_cd6.like(bind("fr_cst_grp_cd6"))).cutoff$and(S0_MM_FR_CST6.bp_grp_nm.like(bind("fr_cst_grp_nm6")))),
				when(boundOr("fr_cst_grp_flg7"))
					.select(DS0C_FR_CST_GRP, S0_M9.bp_grp_cd7.as("fr_cst_grp_cd7"), S0_MM_FR_CST7.bp_grp_nm.as("fr_cst_grp_nm7"))
					.view(DS0C_FR_CST_GRP, v -> v.leftOuterJoin(S0_MM_FR_CST7).on(S0_M9.bp_grp_cd7.eq(S0_MM_FR_CST7.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP7.value()).eq(S0_MM_FR_CST7.bp_grp_typ))))
					.predicate(DS0C_FR_CST_GRP, p -> p.cutoff$and(S0_M9.bp_grp_cd7.like(bind("fr_cst_grp_cd7"))).cutoff$and(S0_MM_FR_CST7.bp_grp_nm.like(bind("fr_cst_grp_nm7")))),
				when(boundOr("fr_cst_grp_flg8"))
					.select(DS0C_FR_CST_GRP, S0_M9.bp_grp_cd8.as("fr_cst_grp_cd8"), S0_MM_FR_CST8.bp_grp_nm.as("fr_cst_grp_nm8"))
					.view(DS0C_FR_CST_GRP, v -> v.leftOuterJoin(S0_MM_FR_CST8).on(S0_M9.bp_grp_cd8.eq(S0_MM_FR_CST8.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP8.value()).eq(S0_MM_FR_CST8.bp_grp_typ))))
					.predicate(DS0C_FR_CST_GRP, p -> p.cutoff$and(S0_M9.bp_grp_cd8.like(bind("fr_cst_grp_cd8"))).cutoff$and(S0_MM_FR_CST8.bp_grp_nm.like(bind("fr_cst_grp_nm8")))),
				when(boundOr("fr_cst_grp_flg9"))
					.select(DS0C_FR_CST_GRP, S0_M9.bp_grp_cd9.as("fr_cst_grp_cd9"), S0_MM_FR_CST9.bp_grp_nm.as("fr_cst_grp_nm9"))
					.view(DS0C_FR_CST_GRP, v -> v.leftOuterJoin(S0_MM_FR_CST9).on(S0_M9.bp_grp_cd9.eq(S0_MM_FR_CST9.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP9.value()).eq(S0_MM_FR_CST9.bp_grp_typ))))
					.predicate(DS0C_FR_CST_GRP, p -> p.cutoff$and(S0_M9.bp_grp_cd9.like(bind("fr_cst_grp_cd9"))).cutoff$and(S0_MM_FR_CST9.bp_grp_nm.like(bind("fr_cst_grp_nm9")))),
				when(boundOr("fr_cst_grp_flg10"))
					.select(DS0C_FR_CST_GRP, S0_M9.bp_grp_cd10.as("fr_cst_grp_cd10"), S0_MM_FR_CST10.bp_grp_nm.as("fr_cst_grp_nm10"))
					.view(DS0C_FR_CST_GRP, v -> v.leftOuterJoin(S0_MM_FR_CST10).on(S0_M9.bp_grp_cd10.eq(S0_MM_FR_CST10.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP10.value()).eq(S0_MM_FR_CST10.bp_grp_typ))))
					.predicate(DS0C_FR_CST_GRP, p -> p.cutoff$and(S0_M9.bp_grp_cd10.like(bind("fr_cst_grp_cd10"))).cutoff$and(S0_MM_FR_CST10.bp_grp_nm.like(bind("fr_cst_grp_nm10"))))
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
							m.itm_typ,
							m.itm_typ_d_cd,
							m.sno1_mng_typ,
							m.sno2_mng_typ,
							m.sno3_mng_typ,
							m.sno4_mng_typ,
							m.unit_cd
						))
						.addMap((r, m) -> {
							r.setStringNE("itm_nm", m.itm_nm());
							r.setStringNE("sno1_mng_typ", m.sno1_mng_typ());
							r.setStringNE("sno2_mng_typ", m.sno2_mng_typ());
							r.setStringNE("sno3_mng_typ", m.sno3_mng_typ());
							r.setStringNE("sno4_mng_typ", m.sno4_mng_typ());
							r.setStringNE("base_unit_cd", m.unit_cd());
							r.setNumberNE("base_unit_dec_place", m.dec_place());
							r.setStringNE("itm_typ", m.itm_typ());
							r.setStringNE("itm_typ_d_cd", m.itm_typ_d_cd());
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
						.add(MAM_LOC_R.class, r -> toCondition(
							r.getStringNE("fr_dmnd_loc_cd")
						))
						.addSelect(m -> toArray(
							m.lg_grp_cd,
							m.loc_grp_cd,
							m.loc_nm,
							m.site_cd,
							m.wg_cd
						))
						.addMap((r, m) -> {
							r.setStringNE("fr_dmnd_loc_nm", m.loc_nm());
							r.setStringNE("fr_dmnd_loc_grp_cd", m.loc_grp_cd());
							r.setStringNE("fr_dmnd_lg_grp_cd", m.lg_grp_cd());
							r.setStringNE("fr_dmnd_wg_cd", m.wg_cd());
							r.setStringNE("fr_dmnd_site_cd", m.site_cd());
					}),
					j -> j
						.add(MAM_WG_R.class, r -> toCondition(
							r.getStringNE("fr_dmnd_wg_cd")
						))
						.addSelect(m -> toArray(
							m.wg_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("fr_dmnd_wg_nm", m.wg_nm());
					}),
					j -> j
						.add(MAM_CUR_R.class, r -> toCondition(
							r.getStringNE("fr_cur_cd")
						))
						.addSelect(m -> toArray(
							m.cur_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("fr_cur_nm", m.cur_nm());
					}),
					j -> j
						.add(MAM_SPLN_ITM_R.class, r -> toCondition(
							r.getStringNE("fr_spln_itm_cd")
						))
						.addSelect(m -> toArray(
							m.spln_itm_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("fr_spln_itm_nm", m.spln_itm_nm());
					}),
					j -> j
						.add(MAM_BP_R.class, r -> toCondition(
							r.getStringNE("fr_dlv_cd")
						))
						.addSelect(m -> toArray(
							m.bp_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("fr_dlv_nm", m.bp_nm());
					}),
					j -> j
						.add(MAM_BP_R.class, r -> toCondition(
							r.getStringNE("fr_cst_cd")
						))
						.addSelect(m -> toArray(
							m.bp_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("fr_cst_nm", m.bp_nm());
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
						.add(MAM_LOC_GRP_R.class, r -> toCondition(
							r.getStringNE("fr_dmnd_loc_grp_cd")
						))
						.addSelect(m -> toArray(
							m.loc_grp_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("fr_dmnd_loc_grp_nm", m.loc_grp_nm());
					}),
					j -> j
						.add(MAM_LG_GRP_R.class, r -> toCondition(
							r.getStringNE("fr_dmnd_lg_grp_cd")
						))
						.addSelect(m -> toArray(
							m.lg_grp_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("fr_dmnd_lg_grp_nm", m.lg_grp_nm());
					}),
					j -> j
						.add(MAM_SITE_R.class, r -> toCondition(
							r.getStringNE("fr_dmnd_site_cd")
						))
						.addSelect(m -> toArray(
							m.site_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("fr_dmnd_site_nm", m.site_nm());
					}),
					j -> j
						.add(MAM_USR_R.class, r -> toCondition(
							r.getStringNE("join_dmnd_usr_cd_")
						))
						.addSelect(m -> toArray(
							m.usr_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("fr_dmnd_usr_nm", m.usr_nm());
					})
				)
			);
	}
	
	/**
	 * -- MSBAL0040_MST_DMND_Query_S01
	 */
	static MCQueryPlan MSBAL0040_MST_DMND_S01() {
		MST_DMND_R S0_T1 = MST_DMND_R.create("T1");
		MAM_ITM_R S0_M1 = MAM_ITM_R.create("M1");
		MAM_LOC_R S0_M3 = MAM_LOC_R.create("M3");
		MAM_WG_R S0_M4 = MAM_WG_R.create("M4");
		MAM_DPT_R S0_M5 = MAM_DPT_R.create("M5");
		MAM_SPLN_ITM_R S0_M7 = MAM_SPLN_ITM_R.create("M7");
		MAM_BP_R S0_M8 = MAM_BP_R.create("M8");
		MAM_BP_R S0_M9 = MAM_BP_R.create("M9");
		MAM_ITM_TYP_D_R S0_M10 = MAM_ITM_TYP_D_R.create("M10");
		MAM_LOC_GRP_R S0_M11 = MAM_LOC_GRP_R.create("M11");
		MAM_LG_GRP_R S0_M12 = MAM_LG_GRP_R.create("M12");
		MAM_SITE_R S0_M13 = MAM_SITE_R.create("M13");
		MAM_USR_R S0_M14 = MAM_USR_R.create("M14");
		MAVM_RD_LOC_R S0_M15 = MAVM_RD_LOC_R.create("M15");
		MAM_CO_R S0_M16 = MAM_CO_R.create("M16");
		MSVT_WRK_SNO_R S0_T2 = MSVT_WRK_SNO_R.create("T2");
		MST_WRK_R S0_T3 = MST_WRK_R.create("T3");
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
		MAM_BP_GRP_R S0_MM_DLV1 = MAM_BP_GRP_R.create("MM_DLV1");
		MAM_BP_GRP_R S0_MM_DLV2 = MAM_BP_GRP_R.create("MM_DLV2");
		MAM_BP_GRP_R S0_MM_DLV3 = MAM_BP_GRP_R.create("MM_DLV3");
		MAM_BP_GRP_R S0_MM_DLV4 = MAM_BP_GRP_R.create("MM_DLV4");
		MAM_BP_GRP_R S0_MM_DLV5 = MAM_BP_GRP_R.create("MM_DLV5");
		MAM_BP_GRP_R S0_MM_DLV6 = MAM_BP_GRP_R.create("MM_DLV6");
		MAM_BP_GRP_R S0_MM_DLV7 = MAM_BP_GRP_R.create("MM_DLV7");
		MAM_BP_GRP_R S0_MM_DLV8 = MAM_BP_GRP_R.create("MM_DLV8");
		MAM_BP_GRP_R S0_MM_DLV9 = MAM_BP_GRP_R.create("MM_DLV9");
		MAM_BP_GRP_R S0_MM_DLV10 = MAM_BP_GRP_R.create("MM_DLV10");
		MAM_BP_GRP_R S0_MM_CST1 = MAM_BP_GRP_R.create("MM_CST1");
		MAM_BP_GRP_R S0_MM_CST2 = MAM_BP_GRP_R.create("MM_CST2");
		MAM_BP_GRP_R S0_MM_CST3 = MAM_BP_GRP_R.create("MM_CST3");
		MAM_BP_GRP_R S0_MM_CST4 = MAM_BP_GRP_R.create("MM_CST4");
		MAM_BP_GRP_R S0_MM_CST5 = MAM_BP_GRP_R.create("MM_CST5");
		MAM_BP_GRP_R S0_MM_CST6 = MAM_BP_GRP_R.create("MM_CST6");
		MAM_BP_GRP_R S0_MM_CST7 = MAM_BP_GRP_R.create("MM_CST7");
		MAM_BP_GRP_R S0_MM_CST8 = MAM_BP_GRP_R.create("MM_CST8");
		MAM_BP_GRP_R S0_MM_CST9 = MAM_BP_GRP_R.create("MM_CST9");
		MAM_BP_GRP_R S0_MM_CST10 = MAM_BP_GRP_R.create("MM_CST10");
		
		MCDynamicSQLID DS0C_CST_GRP = createDynamicSQLID("DS0C_CST_GRP");
		MCDynamicSQLID DS0C_DLV_GRP = createDynamicSQLID("DS0C_DLV_GRP");
		MCDynamicSQLID DS0C_ITM_GRP = createDynamicSQLID("DS0C_ITM_GRP");
		
		return createQueryPlan()
			.setQuery(
				sql("MSBAL0040_MST_DMND_Query_S01")
					.mainQuery()
					.select(
						S0_T1.dmnd_no,
						S0_T1.dmnd_dt,
						S0_T1.dmnd_st_dt,
						S0_T1.dmnd_end_dt,
						S0_T1.dlv_schd_st_dt,
						S0_T1.dlv_schd_end_dt,
						S0_T1.dmnd_period_typ,
						S0_T1.itm_cd,
						S0_T1.itm_sub1,
						S0_T1.itm_sub2,
						S0_T1.itm_sub3,
						S0_T1.spln_itm_cd,
						S0_T1.dmnd_typ,
						S0_T1.dmnd_qty,
						S0_T1.input_qty,
						S0_T1.rec_qty,
						S0_T1.dmnd_dpt_cd,
						S0_M5.dpt_nm.as("dmnd_dpt_nm"),
						S0_T1.dmnd_usr_cd,
						S0_T1.cst_cd,
						S0_T1.dlv_cd,
						S0_T1.slo_d_no,
						S0_T1.slo_no,
						S0_T1.cst_frcst_d_no,
						S0_T1.cst_frcst_no,
						S0_T1.ym,
						S0_T1.spln_vers,
						S0_T1.cur_cd,
						S0_T1.sno1,
						S0_T1.sno2,
						S0_T1.sno3,
						S0_T1.sno4,
						nvl(
							S0_T2.wrk_no,
							S0_T1.wrk_no
						).as("wrk_no"),
						nvl(
							S0_T2.wrk_nm,
							S0_T3.wrk_nm
						).as("wrk_nm"),
						S0_T1.dmnd_loc_cd,
						S0_T1.intr_rmrks,
						S0_T1.sub_char1,
						S0_T1.sub_char2,
						S0_T1.sub_char3,
						S0_T1.ins_usr_id,
						S0_T1.ins_usr_nm,
						S0_T1.ins_ts,
						S0_T1.ins_func_id,
						S0_T1.upd_cntr.as("dmnd_upd_cntr"),
						S0_T1.upd_usr_id,
						S0_T1.upd_usr_nm,
						S0_T1.upd_ts,
						S0_T1.upd_func_id,
						S0_T1.upd_srv_req_no,
						addDynamicSelect(DS0C_ITM_GRP),
						addDynamicSelect(DS0C_DLV_GRP),
						addDynamicSelect(DS0C_CST_GRP)
					)
					.from(
						S0_T1
						.leftOuterJoin(S0_M5).on(
							bracket(
								S0_M5.dpt_cd.eq(S0_T1.dmnd_dpt_cd)
								.and(S0_T1.dmnd_dt.between(S0_M5.st_dt, S0_M5.end_dt))
							)
						)
						.innerJoin(S0_M15).on(
							bracket(
								S0_T1.dmnd_loc_cd.eq(S0_M15.loc_cd)
							)
						)
						.innerJoin(S0_M16).on(
							bracket(
								value(0).eq(value(0))
							)
						)
						.leftOuterJoin(S0_T2).on(
							bracket(
								S0_T2.sno1.eq(S0_T1.sno1)
							)
						)
						.leftOuterJoin(S0_T3).on(
							bracket(
								S0_T3.wrk_no.eq(S0_T1.wrk_no)
							)
						)
						.addDynamicView()
						.addDynamicView(DS0C_ITM_GRP)
						.addDynamicView(DS0C_DLV_GRP)
						.addDynamicView(DS0C_CST_GRP)
					)
					.where(
						value(0).eq(value(0))
						.cutoff$and(S0_T1.dmnd_st_dt.lte(bind("dmnd_dt_to")))
						.cutoff$and(S0_T1.dmnd_end_dt.gte(bind("dmnd_dt_fr")))
						.cutoff$and(S0_T1.dmnd_period_typ.like(bind("dmnd_period_typ")))
						.cutoff$and(S0_T1.dmnd_typ.like(bind("dmnd_typ")))
						.cutoff$and(S0_T1.dmnd_no.like(bind("dmnd_no")))
						.cutoff$and(S0_T1.dlv_cd.like(bind("dlv_cd")))
						.addDynamicPredicate()
						.cutoff$and(S0_T1.cst_cd.like(bind("cst_cd")))
						.cutoff$and(S0_T1.dmnd_loc_cd.like(bind("dmnd_loc_cd")))
						.cutoff$and(S0_T1.itm_cd.like(bind("itm_cd")))
						.cutoff$and(S0_T1.itm_sub1.like(bind("itm_sub1")))
						.cutoff$and(S0_T1.itm_sub2.like(bind("itm_sub2")))
						.cutoff$and(S0_T1.itm_sub3.like(bind("itm_sub3")))
						.cutoff$and(S0_T1.sno1.like(bind("sno1")))
						.cutoff$and(S0_T1.sno2.like(bind("sno2")))
						.cutoff$and(S0_T1.sno3.like(bind("sno3")))
						.cutoff$and(S0_T1.sno4.like(bind("sno4")))
						.cutoff$and(
							nvl(
								S0_T2.wrk_no,
								S0_T1.wrk_no
							).like(bind("wrk_no"))
						)
						.cutoff$and(
							nvl(
								S0_T2.wrk_nm,
								S0_T3.wrk_nm
							).like(bind("wrk_nm"))
						)
						.cutoff$and(S0_T1.dmnd_dpt_cd.like(bind("dpt_cd")))
						.cutoff$and(S0_M5.dpt_nm.like(bind("dpt_nm")))
						.cutoff$and(S0_T1.dmnd_usr_cd.like(bind("usr_cd")))
						.cutoff$and(S0_T1.ym.eq(bind("ym")))
						.cutoff$and(S0_T1.spln_vers.like(bind("spln_vers")))
						.cutoff$and(S0_T1.spln_itm_cd.like(bind("spln_itm_cd")))
						.cutoff$and(S0_T1.cst_frcst_no.like(bind("cst_frcst_no")))
						.cutoff$and(S0_T1.cst_frcst_d_no.like(bind("cst_frcst_d_no")))
						.cutoff$and(S0_T1.slo_no.like(bind("slo_no")))
						.cutoff$and(S0_T1.slo_d_no.like(bind("slo_d_no")))
						.cutoff$and(S0_T1.intr_rmrks.like(bind("intr_rmrks")))
						.cutoff$and(S0_T1.sub_char1.like(bind("sub_char1")))
						.cutoff$and(S0_T1.sub_char2.like(bind("sub_char2")))
						.cutoff$and(S0_T1.sub_char3.like(bind("sub_char3")))
						.addDynamicPredicate(DS0C_ITM_GRP)
						.addDynamicPredicate(DS0C_DLV_GRP)
						.addDynamicPredicate(DS0C_CST_GRP)
					)
					.orderBy(
						S0_T1.itm_cd.asc(),
						S0_T1.itm_sub1.asc(),
						S0_T1.itm_sub2.asc(),
						S0_T1.itm_sub3.asc(),
						MAPA_DT$F_GET_PERIOD_ST_DT_NE(
							S0_T1.dmnd_st_dt,
							value(MAC_PERIOD_TYP.MONTHLY.value()),
							S0_M16.ac_cl_day
						).asc(),
						S0_T1.dmnd_typ.desc(),
						S0_T1.dmnd_period_typ.desc(),
						S0_T1.dmnd_no.asc()
					)
			)
			.setDynamicSQLInfo(
				when(boundOr("itm_typ_d_nm", "itm_grp_flg1", "itm_grp_flg2", "itm_grp_flg3", "itm_grp_flg4", "itm_grp_flg5", "itm_grp_flg6", "itm_grp_flg7", "itm_grp_flg8", "itm_grp_flg9", "itm_grp_flg10", "itm_typ", "itm_typ_d_cd", "itm_nm"))
					.view(v -> v.leftOuterJoin(S0_M1).on(bracket(S0_M1.itm_cd.eq(S0_T1.itm_cd).and(S0_M1.itm_sub1.eq(S0_T1.itm_sub1)).and(S0_M1.itm_sub2.eq(S0_T1.itm_sub2)).and(S0_M1.itm_sub3.eq(S0_T1.itm_sub3)))))
					.predicate(p -> p.cutoff$and(S0_M1.itm_typ.like(bind("itm_typ"))).cutoff$and(S0_M1.itm_typ_d_cd.like(bind("itm_typ_d_cd"))).cutoff$and(S0_M1.itm_nm.like(bind("itm_nm")))),
				when(boundOr("wg_nm", "loc_grp_nm", "lg_grp_nm", "site_nm", "dmnd_loc_nm", "site_cd", "wg_cd", "lg_grp_cd", "loc_grp_cd"))
					.view(v -> v.leftOuterJoin(S0_M3).on(bracket(S0_M3.loc_cd.eq(S0_T1.dmnd_loc_cd))))
					.predicate(p -> p.cutoff$and(S0_M3.loc_nm.like(bind("dmnd_loc_nm"))).cutoff$and(S0_M3.site_cd.like(bind("site_cd"))).cutoff$and(S0_M3.wg_cd.like(bind("wg_cd"))).cutoff$and(S0_M3.lg_grp_cd.like(bind("lg_grp_cd"))).cutoff$and(S0_M3.loc_grp_cd.like(bind("loc_grp_cd")))),
				when(boundOr("wg_nm"))
					.view(v -> v.leftOuterJoin(S0_M4).on(bracket(S0_M4.wg_cd.eq(S0_M3.wg_cd))))
					.predicate(p -> p.cutoff$and(S0_M4.wg_nm.like(bind("wg_nm")))),
				when(boundOr("spln_itm_nm"))
					.view(v -> v.leftOuterJoin(S0_M7).on(bracket(S0_M7.spln_itm_cd.eq(S0_T1.spln_itm_cd))))
					.predicate(p -> p.cutoff$and(S0_M7.spln_itm_nm.like(bind("spln_itm_nm")))),
				when(boundOr("dlv_grp_flg1", "dlv_grp_flg2", "dlv_grp_flg3", "dlv_grp_flg4", "dlv_grp_flg5", "dlv_grp_flg6", "dlv_grp_flg7", "dlv_grp_flg8", "dlv_grp_flg9", "dlv_grp_flg10", "dlv_nm"))
					.view(v -> v.leftOuterJoin(S0_M8).on(bracket(S0_M8.bp_cd.eq(S0_T1.dlv_cd))))
					.predicate(p -> p.cutoff$and(S0_M8.bp_nm.like(bind("dlv_nm")))),
				when(boundOr("cst_grp_flg1", "cst_grp_flg2", "cst_grp_flg3", "cst_grp_flg4", "cst_grp_flg5", "cst_grp_flg6", "cst_grp_flg7", "cst_grp_flg8", "cst_grp_flg9", "cst_grp_flg10", "cst_nm"))
					.view(v -> v.leftOuterJoin(S0_M9).on(bracket(S0_M9.bp_cd.eq(S0_T1.cst_cd))))
					.predicate(p -> p.cutoff$and(S0_M9.bp_nm.like(bind("cst_nm")))),
				when(boundOr("itm_typ_d_nm"))
					.view(v -> v.leftOuterJoin(S0_M10).on(bracket(S0_M10.itm_typ.eq(S0_M1.itm_typ).and(S0_M10.itm_typ_d_cd.eq(S0_M1.itm_typ_d_cd)))))
					.predicate(p -> p.cutoff$and(S0_M10.itm_typ_d_nm.like(bind("itm_typ_d_nm")))),
				when(boundOr("loc_grp_nm"))
					.view(v -> v.leftOuterJoin(S0_M11).on(bracket(S0_M11.loc_grp_cd.eq(S0_M3.loc_grp_cd))))
					.predicate(p -> p.cutoff$and(S0_M11.loc_grp_nm.like(bind("loc_grp_nm")))),
				when(boundOr("lg_grp_nm"))
					.view(v -> v.leftOuterJoin(S0_M12).on(bracket(S0_M12.lg_grp_cd.eq(S0_M3.lg_grp_cd))))
					.predicate(p -> p.cutoff$and(S0_M12.lg_grp_nm.like(bind("lg_grp_nm")))),
				when(boundOr("site_nm"))
					.view(v -> v.leftOuterJoin(S0_M13).on(bracket(S0_M13.site_cd.eq(S0_M3.site_cd))))
					.predicate(p -> p.cutoff$and(S0_M13.site_nm.like(bind("site_nm")))),
				when(boundOr("usr_nm"))
					.view(v -> v.leftOuterJoin(S0_M14).on(bracket(S0_M14.usr_cd.eq(S0_T1.dmnd_usr_cd))))
					.predicate(p -> p.cutoff$and(S0_M14.usr_nm.like(bind("usr_nm")))),
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
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M1.itm_grp_cd10.like(bind("itm_grp_cd10"))).cutoff$and(S0_MM10.itm_grp_nm.like(bind("itm_grp_nm10")))),
				when(boundOr("dlv_grp_flg1"))
					.select(DS0C_DLV_GRP, S0_M8.bp_grp_cd1.as("dlv_grp_cd1"), S0_MM_DLV1.bp_grp_nm.as("dlv_grp_nm1"))
					.view(DS0C_DLV_GRP, v -> v.leftOuterJoin(S0_MM_DLV1).on(S0_M8.bp_grp_cd1.eq(S0_MM_DLV1.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP1.value()).eq(S0_MM_DLV1.bp_grp_typ))))
					.predicate(DS0C_DLV_GRP, p -> p.cutoff$and(S0_M8.bp_grp_cd1.like(bind("dlv_grp_cd1"))).cutoff$and(S0_MM_DLV1.bp_grp_nm.like(bind("dlv_grp_nm1")))),
				when(boundOr("dlv_grp_flg2"))
					.select(DS0C_DLV_GRP, S0_M8.bp_grp_cd2.as("dlv_grp_cd2"), S0_MM_DLV2.bp_grp_nm.as("dlv_grp_nm2"))
					.view(DS0C_DLV_GRP, v -> v.leftOuterJoin(S0_MM_DLV2).on(S0_M8.bp_grp_cd2.eq(S0_MM_DLV2.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP2.value()).eq(S0_MM_DLV2.bp_grp_typ))))
					.predicate(DS0C_DLV_GRP, p -> p.cutoff$and(S0_M8.bp_grp_cd2.like(bind("dlv_grp_cd2"))).cutoff$and(S0_MM_DLV2.bp_grp_nm.like(bind("dlv_grp_nm2")))),
				when(boundOr("dlv_grp_flg3"))
					.select(DS0C_DLV_GRP, S0_M8.bp_grp_cd3.as("dlv_grp_cd3"), S0_MM_DLV3.bp_grp_nm.as("dlv_grp_nm3"))
					.view(DS0C_DLV_GRP, v -> v.leftOuterJoin(S0_MM_DLV3).on(S0_M8.bp_grp_cd3.eq(S0_MM_DLV3.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP3.value()).eq(S0_MM_DLV3.bp_grp_typ))))
					.predicate(DS0C_DLV_GRP, p -> p.cutoff$and(S0_M8.bp_grp_cd3.like(bind("dlv_grp_cd3"))).cutoff$and(S0_MM_DLV3.bp_grp_nm.like(bind("dlv_grp_nm3")))),
				when(boundOr("dlv_grp_flg4"))
					.select(DS0C_DLV_GRP, S0_M8.bp_grp_cd4.as("dlv_grp_cd4"), S0_MM_DLV4.bp_grp_nm.as("dlv_grp_nm4"))
					.view(DS0C_DLV_GRP, v -> v.leftOuterJoin(S0_MM_DLV4).on(S0_M8.bp_grp_cd4.eq(S0_MM_DLV4.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP4.value()).eq(S0_MM_DLV4.bp_grp_typ))))
					.predicate(DS0C_DLV_GRP, p -> p.cutoff$and(S0_M8.bp_grp_cd4.like(bind("dlv_grp_cd4"))).cutoff$and(S0_MM_DLV4.bp_grp_nm.like(bind("dlv_grp_nm4")))),
				when(boundOr("dlv_grp_flg5"))
					.select(DS0C_DLV_GRP, S0_M8.bp_grp_cd5.as("dlv_grp_cd5"), S0_MM_DLV5.bp_grp_nm.as("dlv_grp_nm5"))
					.view(DS0C_DLV_GRP, v -> v.leftOuterJoin(S0_MM_DLV5).on(S0_M8.bp_grp_cd5.eq(S0_MM_DLV5.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP5.value()).eq(S0_MM_DLV5.bp_grp_typ))))
					.predicate(DS0C_DLV_GRP, p -> p.cutoff$and(S0_M8.bp_grp_cd5.like(bind("dlv_grp_cd5"))).cutoff$and(S0_MM_DLV5.bp_grp_nm.like(bind("dlv_grp_nm5")))),
				when(boundOr("dlv_grp_flg6"))
					.select(DS0C_DLV_GRP, S0_M8.bp_grp_cd6.as("dlv_grp_cd6"), S0_MM_DLV6.bp_grp_nm.as("dlv_grp_nm6"))
					.view(DS0C_DLV_GRP, v -> v.leftOuterJoin(S0_MM_DLV6).on(S0_M8.bp_grp_cd6.eq(S0_MM_DLV6.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP6.value()).eq(S0_MM_DLV6.bp_grp_typ))))
					.predicate(DS0C_DLV_GRP, p -> p.cutoff$and(S0_M8.bp_grp_cd6.like(bind("dlv_grp_cd6"))).cutoff$and(S0_MM_DLV6.bp_grp_nm.like(bind("dlv_grp_nm6")))),
				when(boundOr("dlv_grp_flg7"))
					.select(DS0C_DLV_GRP, S0_M8.bp_grp_cd7.as("dlv_grp_cd7"), S0_MM_DLV7.bp_grp_nm.as("dlv_grp_nm7"))
					.view(DS0C_DLV_GRP, v -> v.leftOuterJoin(S0_MM_DLV7).on(S0_M8.bp_grp_cd7.eq(S0_MM_DLV7.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP7.value()).eq(S0_MM_DLV7.bp_grp_typ))))
					.predicate(DS0C_DLV_GRP, p -> p.cutoff$and(S0_M8.bp_grp_cd7.like(bind("dlv_grp_cd7"))).cutoff$and(S0_MM_DLV7.bp_grp_nm.like(bind("dlv_grp_nm7")))),
				when(boundOr("dlv_grp_flg8"))
					.select(DS0C_DLV_GRP, S0_M8.bp_grp_cd8.as("dlv_grp_cd8"), S0_MM_DLV8.bp_grp_nm.as("dlv_grp_nm8"))
					.view(DS0C_DLV_GRP, v -> v.leftOuterJoin(S0_MM_DLV8).on(S0_M8.bp_grp_cd8.eq(S0_MM_DLV8.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP8.value()).eq(S0_MM_DLV8.bp_grp_typ))))
					.predicate(DS0C_DLV_GRP, p -> p.cutoff$and(S0_M8.bp_grp_cd8.like(bind("dlv_grp_cd8"))).cutoff$and(S0_MM_DLV8.bp_grp_nm.like(bind("dlv_grp_nm8")))),
				when(boundOr("dlv_grp_flg9"))
					.select(DS0C_DLV_GRP, S0_M8.bp_grp_cd9.as("dlv_grp_cd9"), S0_MM_DLV9.bp_grp_nm.as("dlv_grp_nm9"))
					.view(DS0C_DLV_GRP, v -> v.leftOuterJoin(S0_MM_DLV9).on(S0_M8.bp_grp_cd9.eq(S0_MM_DLV9.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP9.value()).eq(S0_MM_DLV9.bp_grp_typ))))
					.predicate(DS0C_DLV_GRP, p -> p.cutoff$and(S0_M8.bp_grp_cd9.like(bind("dlv_grp_cd9"))).cutoff$and(S0_MM_DLV9.bp_grp_nm.like(bind("dlv_grp_nm9")))),
				when(boundOr("dlv_grp_flg10"))
					.select(DS0C_DLV_GRP, S0_M8.bp_grp_cd10.as("dlv_grp_cd10"), S0_MM_DLV10.bp_grp_nm.as("dlv_grp_nm10"))
					.view(DS0C_DLV_GRP, v -> v.leftOuterJoin(S0_MM_DLV10).on(S0_M8.bp_grp_cd10.eq(S0_MM_DLV10.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP10.value()).eq(S0_MM_DLV10.bp_grp_typ))))
					.predicate(DS0C_DLV_GRP, p -> p.cutoff$and(S0_M8.bp_grp_cd10.like(bind("dlv_grp_cd10"))).cutoff$and(S0_MM_DLV10.bp_grp_nm.like(bind("dlv_grp_nm10")))),
				when(boundOr("cst_grp_flg1"))
					.select(DS0C_CST_GRP, S0_M9.bp_grp_cd1.as("cst_grp_cd1"), S0_MM_CST1.bp_grp_nm.as("cst_grp_nm1"))
					.view(DS0C_CST_GRP, v -> v.leftOuterJoin(S0_MM_CST1).on(S0_M9.bp_grp_cd1.eq(S0_MM_CST1.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP1.value()).eq(S0_MM_CST1.bp_grp_typ))))
					.predicate(DS0C_CST_GRP, p -> p.cutoff$and(S0_M9.bp_grp_cd1.like(bind("cst_grp_cd1"))).cutoff$and(S0_MM_CST1.bp_grp_nm.like(bind("cst_grp_nm1")))),
				when(boundOr("cst_grp_flg2"))
					.select(DS0C_CST_GRP, S0_M9.bp_grp_cd2.as("cst_grp_cd2"), S0_MM_CST2.bp_grp_nm.as("cst_grp_nm2"))
					.view(DS0C_CST_GRP, v -> v.leftOuterJoin(S0_MM_CST2).on(S0_M9.bp_grp_cd2.eq(S0_MM_CST2.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP2.value()).eq(S0_MM_CST2.bp_grp_typ))))
					.predicate(DS0C_CST_GRP, p -> p.cutoff$and(S0_M9.bp_grp_cd2.like(bind("cst_grp_cd2"))).cutoff$and(S0_MM_CST2.bp_grp_nm.like(bind("cst_grp_nm2")))),
				when(boundOr("cst_grp_flg3"))
					.select(DS0C_CST_GRP, S0_M9.bp_grp_cd3.as("cst_grp_cd3"), S0_MM_CST3.bp_grp_nm.as("cst_grp_nm3"))
					.view(DS0C_CST_GRP, v -> v.leftOuterJoin(S0_MM_CST3).on(S0_M9.bp_grp_cd3.eq(S0_MM_CST3.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP3.value()).eq(S0_MM_CST3.bp_grp_typ))))
					.predicate(DS0C_CST_GRP, p -> p.cutoff$and(S0_M9.bp_grp_cd3.like(bind("cst_grp_cd3"))).cutoff$and(S0_MM_CST3.bp_grp_nm.like(bind("cst_grp_nm3")))),
				when(boundOr("cst_grp_flg4"))
					.select(DS0C_CST_GRP, S0_M9.bp_grp_cd4.as("cst_grp_cd4"), S0_MM_CST4.bp_grp_nm.as("cst_grp_nm4"))
					.view(DS0C_CST_GRP, v -> v.leftOuterJoin(S0_MM_CST4).on(S0_M9.bp_grp_cd4.eq(S0_MM_CST4.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP4.value()).eq(S0_MM_CST4.bp_grp_typ))))
					.predicate(DS0C_CST_GRP, p -> p.cutoff$and(S0_M9.bp_grp_cd4.like(bind("cst_grp_cd4"))).cutoff$and(S0_MM_CST4.bp_grp_nm.like(bind("cst_grp_nm4")))),
				when(boundOr("cst_grp_flg5"))
					.select(DS0C_CST_GRP, S0_M9.bp_grp_cd5.as("cst_grp_cd5"), S0_MM_CST5.bp_grp_nm.as("cst_grp_nm5"))
					.view(DS0C_CST_GRP, v -> v.leftOuterJoin(S0_MM_CST5).on(S0_M9.bp_grp_cd5.eq(S0_MM_CST5.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP5.value()).eq(S0_MM_CST5.bp_grp_typ))))
					.predicate(DS0C_CST_GRP, p -> p.cutoff$and(S0_M9.bp_grp_cd5.like(bind("cst_grp_cd5"))).cutoff$and(S0_MM_CST5.bp_grp_nm.like(bind("cst_grp_nm5")))),
				when(boundOr("cst_grp_flg6"))
					.select(DS0C_CST_GRP, S0_M9.bp_grp_cd6.as("cst_grp_cd6"), S0_MM_CST6.bp_grp_nm.as("cst_grp_nm6"))
					.view(DS0C_CST_GRP, v -> v.leftOuterJoin(S0_MM_CST6).on(S0_M9.bp_grp_cd6.eq(S0_MM_CST6.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP6.value()).eq(S0_MM_CST6.bp_grp_typ))))
					.predicate(DS0C_CST_GRP, p -> p.cutoff$and(S0_M9.bp_grp_cd6.like(bind("cst_grp_cd6"))).cutoff$and(S0_MM_CST6.bp_grp_nm.like(bind("cst_grp_nm6")))),
				when(boundOr("cst_grp_flg7"))
					.select(DS0C_CST_GRP, S0_M9.bp_grp_cd7.as("cst_grp_cd7"), S0_MM_CST7.bp_grp_nm.as("cst_grp_nm7"))
					.view(DS0C_CST_GRP, v -> v.leftOuterJoin(S0_MM_CST7).on(S0_M9.bp_grp_cd7.eq(S0_MM_CST7.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP7.value()).eq(S0_MM_CST7.bp_grp_typ))))
					.predicate(DS0C_CST_GRP, p -> p.cutoff$and(S0_M9.bp_grp_cd7.like(bind("cst_grp_cd7"))).cutoff$and(S0_MM_CST7.bp_grp_nm.like(bind("cst_grp_nm7")))),
				when(boundOr("cst_grp_flg8"))
					.select(DS0C_CST_GRP, S0_M9.bp_grp_cd8.as("cst_grp_cd8"), S0_MM_CST8.bp_grp_nm.as("cst_grp_nm8"))
					.view(DS0C_CST_GRP, v -> v.leftOuterJoin(S0_MM_CST8).on(S0_M9.bp_grp_cd8.eq(S0_MM_CST8.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP8.value()).eq(S0_MM_CST8.bp_grp_typ))))
					.predicate(DS0C_CST_GRP, p -> p.cutoff$and(S0_M9.bp_grp_cd8.like(bind("cst_grp_cd8"))).cutoff$and(S0_MM_CST8.bp_grp_nm.like(bind("cst_grp_nm8")))),
				when(boundOr("cst_grp_flg9"))
					.select(DS0C_CST_GRP, S0_M9.bp_grp_cd9.as("cst_grp_cd9"), S0_MM_CST9.bp_grp_nm.as("cst_grp_nm9"))
					.view(DS0C_CST_GRP, v -> v.leftOuterJoin(S0_MM_CST9).on(S0_M9.bp_grp_cd9.eq(S0_MM_CST9.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP9.value()).eq(S0_MM_CST9.bp_grp_typ))))
					.predicate(DS0C_CST_GRP, p -> p.cutoff$and(S0_M9.bp_grp_cd9.like(bind("cst_grp_cd9"))).cutoff$and(S0_MM_CST9.bp_grp_nm.like(bind("cst_grp_nm9")))),
				when(boundOr("cst_grp_flg10"))
					.select(DS0C_CST_GRP, S0_M9.bp_grp_cd10.as("cst_grp_cd10"), S0_MM_CST10.bp_grp_nm.as("cst_grp_nm10"))
					.view(DS0C_CST_GRP, v -> v.leftOuterJoin(S0_MM_CST10).on(S0_M9.bp_grp_cd10.eq(S0_MM_CST10.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP10.value()).eq(S0_MM_CST10.bp_grp_typ))))
					.predicate(DS0C_CST_GRP, p -> p.cutoff$and(S0_M9.bp_grp_cd10.like(bind("cst_grp_cd10"))).cutoff$and(S0_MM_CST10.bp_grp_nm.like(bind("cst_grp_nm10"))))
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
							m.itm_typ,
							m.itm_typ_d_cd,
							m.sno1_mng_typ,
							m.sno2_mng_typ,
							m.sno3_mng_typ,
							m.sno4_mng_typ,
							m.unit_cd
						))
						.addMap((r, m) -> {
							r.setStringNE("itm_nm", m.itm_nm());
							r.setStringNE("sno1_mng_typ", m.sno1_mng_typ());
							r.setStringNE("sno2_mng_typ", m.sno2_mng_typ());
							r.setStringNE("sno3_mng_typ", m.sno3_mng_typ());
							r.setStringNE("sno4_mng_typ", m.sno4_mng_typ());
							r.setStringNE("base_unit_cd", m.unit_cd());
							r.setNumberNE("base_unit_dec_place", m.dec_place());
							r.setStringNE("itm_typ", m.itm_typ());
							r.setStringNE("itm_typ_d_cd", m.itm_typ_d_cd());
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
						.add(MAM_LOC_R.class, r -> toCondition(
							r.getStringNE("dmnd_loc_cd")
						))
						.addSelect(m -> toArray(
							m.lg_grp_cd,
							m.loc_grp_cd,
							m.loc_nm,
							m.site_cd,
							m.wg_cd
						))
						.addMap((r, m) -> {
							r.setStringNE("dmnd_loc_nm", m.loc_nm());
							r.setStringNE("dmnd_loc_grp_cd", m.loc_grp_cd());
							r.setStringNE("dmnd_lg_grp_cd", m.lg_grp_cd());
							r.setStringNE("dmnd_wg_cd", m.wg_cd());
							r.setStringNE("dmnd_site_cd", m.site_cd());
					}),
					j -> j
						.add(MAM_WG_R.class, r -> toCondition(
							r.getStringNE("dmnd_wg_cd")
						))
						.addSelect(m -> toArray(
							m.wg_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("dmnd_wg_nm", m.wg_nm());
					}),
					j -> j
						.add(MAM_CUR_R.class, r -> toCondition(
							r.getStringNE("cur_cd")
						))
						.addSelect(m -> toArray(
							m.cur_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("cur_nm", m.cur_nm());
					}),
					j -> j
						.add(MAM_SPLN_ITM_R.class, r -> toCondition(
							r.getStringNE("spln_itm_cd")
						))
						.addSelect(m -> toArray(
							m.spln_itm_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("spln_itm_nm", m.spln_itm_nm());
					}),
					j -> j
						.add(MAM_BP_R.class, r -> toCondition(
							r.getStringNE("dlv_cd")
						))
						.addSelect(m -> toArray(
							m.bp_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("dlv_nm", m.bp_nm());
					}),
					j -> j
						.add(MAM_BP_R.class, r -> toCondition(
							r.getStringNE("cst_cd")
						))
						.addSelect(m -> toArray(
							m.bp_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("cst_nm", m.bp_nm());
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
						.add(MAM_LOC_GRP_R.class, r -> toCondition(
							r.getStringNE("dmnd_loc_grp_cd")
						))
						.addSelect(m -> toArray(
							m.loc_grp_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("dmnd_loc_grp_nm", m.loc_grp_nm());
					}),
					j -> j
						.add(MAM_LG_GRP_R.class, r -> toCondition(
							r.getStringNE("dmnd_lg_grp_cd")
						))
						.addSelect(m -> toArray(
							m.lg_grp_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("dmnd_lg_grp_nm", m.lg_grp_nm());
					}),
					j -> j
						.add(MAM_SITE_R.class, r -> toCondition(
							r.getStringNE("dmnd_site_cd")
						))
						.addSelect(m -> toArray(
							m.site_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("dmnd_site_nm", m.site_nm());
					}),
					j -> j
						.add(MAM_USR_R.class, r -> toCondition(
							r.getStringNE("dmnd_usr_cd")
						))
						.addSelect(m -> toArray(
							m.usr_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("dmnd_usr_nm", m.usr_nm());
					})
				)
			);
	}
	
	/**
	 * -- MSBAL0040_MST_DMND_Query_S02
	 */
	static MCQueryPlan MSBAL0040_MST_DMND_S02() {
		MST_DMND_R S0_T1 = MST_DMND_R.create("T1");
		MST_DMND_REC_MAP_R S0_T3 = MST_DMND_REC_MAP_R.create("T3");
		MST_DMND_R S0_T4 = MST_DMND_R.create("T4");
		MAM_ITM_R S0_M1 = MAM_ITM_R.create("M1");
		MAM_LOC_R S0_M3 = MAM_LOC_R.create("M3");
		MAM_WG_R S0_M4 = MAM_WG_R.create("M4");
		MAM_DPT_R S0_M5 = MAM_DPT_R.create("M5");
		MAM_SPLN_ITM_R S0_M7 = MAM_SPLN_ITM_R.create("M7");
		MAM_BP_R S0_M8 = MAM_BP_R.create("M8");
		MAM_BP_R S0_M9 = MAM_BP_R.create("M9");
		MAM_ITM_TYP_D_R S0_M10 = MAM_ITM_TYP_D_R.create("M10");
		MAM_LOC_GRP_R S0_M11 = MAM_LOC_GRP_R.create("M11");
		MAM_LG_GRP_R S0_M12 = MAM_LG_GRP_R.create("M12");
		MAM_SITE_R S0_M13 = MAM_SITE_R.create("M13");
		MAM_USR_R S0_M14 = MAM_USR_R.create("M14");
		MAVM_RD_LOC_R S0_M15 = MAVM_RD_LOC_R.create("M15");
		MAM_DPT_R S0_M16 = MAM_DPT_R.create("M16");
		MAM_BP_R S0_M19 = MAM_BP_R.create("M19");
		MAM_BP_R S0_M20 = MAM_BP_R.create("M20");
		MAM_CO_R S0_M22 = MAM_CO_R.create("M22");
		MSVT_WRK_SNO_R S0_T2 = MSVT_WRK_SNO_R.create("T2");
		MSVT_WRK_SNO_R S0_T5 = MSVT_WRK_SNO_R.create("T5");
		MST_WRK_R S0_T6 = MST_WRK_R.create("T6");
		MST_WRK_R S0_T7 = MST_WRK_R.create("T7");
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
		MAM_BP_GRP_R S0_MM_TO_DLV1 = MAM_BP_GRP_R.create("MM_TO_DLV1");
		MAM_BP_GRP_R S0_MM_TO_DLV2 = MAM_BP_GRP_R.create("MM_TO_DLV2");
		MAM_BP_GRP_R S0_MM_TO_DLV3 = MAM_BP_GRP_R.create("MM_TO_DLV3");
		MAM_BP_GRP_R S0_MM_TO_DLV4 = MAM_BP_GRP_R.create("MM_TO_DLV4");
		MAM_BP_GRP_R S0_MM_TO_DLV5 = MAM_BP_GRP_R.create("MM_TO_DLV5");
		MAM_BP_GRP_R S0_MM_TO_DLV6 = MAM_BP_GRP_R.create("MM_TO_DLV6");
		MAM_BP_GRP_R S0_MM_TO_DLV7 = MAM_BP_GRP_R.create("MM_TO_DLV7");
		MAM_BP_GRP_R S0_MM_TO_DLV8 = MAM_BP_GRP_R.create("MM_TO_DLV8");
		MAM_BP_GRP_R S0_MM_TO_DLV9 = MAM_BP_GRP_R.create("MM_TO_DLV9");
		MAM_BP_GRP_R S0_MM_TO_DLV10 = MAM_BP_GRP_R.create("MM_TO_DLV10");
		MAM_BP_GRP_R S0_MM_TO_CST1 = MAM_BP_GRP_R.create("MM_TO_CST1");
		MAM_BP_GRP_R S0_MM_TO_CST2 = MAM_BP_GRP_R.create("MM_TO_CST2");
		MAM_BP_GRP_R S0_MM_TO_CST3 = MAM_BP_GRP_R.create("MM_TO_CST3");
		MAM_BP_GRP_R S0_MM_TO_CST4 = MAM_BP_GRP_R.create("MM_TO_CST4");
		MAM_BP_GRP_R S0_MM_TO_CST5 = MAM_BP_GRP_R.create("MM_TO_CST5");
		MAM_BP_GRP_R S0_MM_TO_CST6 = MAM_BP_GRP_R.create("MM_TO_CST6");
		MAM_BP_GRP_R S0_MM_TO_CST7 = MAM_BP_GRP_R.create("MM_TO_CST7");
		MAM_BP_GRP_R S0_MM_TO_CST8 = MAM_BP_GRP_R.create("MM_TO_CST8");
		MAM_BP_GRP_R S0_MM_TO_CST9 = MAM_BP_GRP_R.create("MM_TO_CST9");
		MAM_BP_GRP_R S0_MM_TO_CST10 = MAM_BP_GRP_R.create("MM_TO_CST10");
		MAM_BP_GRP_R S0_MM_FR_DLV1 = MAM_BP_GRP_R.create("MM_FR_DLV1");
		MAM_BP_GRP_R S0_MM_FR_DLV2 = MAM_BP_GRP_R.create("MM_FR_DLV2");
		MAM_BP_GRP_R S0_MM_FR_DLV3 = MAM_BP_GRP_R.create("MM_FR_DLV3");
		MAM_BP_GRP_R S0_MM_FR_DLV4 = MAM_BP_GRP_R.create("MM_FR_DLV4");
		MAM_BP_GRP_R S0_MM_FR_DLV5 = MAM_BP_GRP_R.create("MM_FR_DLV5");
		MAM_BP_GRP_R S0_MM_FR_DLV6 = MAM_BP_GRP_R.create("MM_FR_DLV6");
		MAM_BP_GRP_R S0_MM_FR_DLV7 = MAM_BP_GRP_R.create("MM_FR_DLV7");
		MAM_BP_GRP_R S0_MM_FR_DLV8 = MAM_BP_GRP_R.create("MM_FR_DLV8");
		MAM_BP_GRP_R S0_MM_FR_DLV9 = MAM_BP_GRP_R.create("MM_FR_DLV9");
		MAM_BP_GRP_R S0_MM_FR_DLV10 = MAM_BP_GRP_R.create("MM_FR_DLV10");
		MAM_BP_GRP_R S0_MM_FR_CST1 = MAM_BP_GRP_R.create("MM_FR_CST1");
		MAM_BP_GRP_R S0_MM_FR_CST2 = MAM_BP_GRP_R.create("MM_FR_CST2");
		MAM_BP_GRP_R S0_MM_FR_CST3 = MAM_BP_GRP_R.create("MM_FR_CST3");
		MAM_BP_GRP_R S0_MM_FR_CST4 = MAM_BP_GRP_R.create("MM_FR_CST4");
		MAM_BP_GRP_R S0_MM_FR_CST5 = MAM_BP_GRP_R.create("MM_FR_CST5");
		MAM_BP_GRP_R S0_MM_FR_CST6 = MAM_BP_GRP_R.create("MM_FR_CST6");
		MAM_BP_GRP_R S0_MM_FR_CST7 = MAM_BP_GRP_R.create("MM_FR_CST7");
		MAM_BP_GRP_R S0_MM_FR_CST8 = MAM_BP_GRP_R.create("MM_FR_CST8");
		MAM_BP_GRP_R S0_MM_FR_CST9 = MAM_BP_GRP_R.create("MM_FR_CST9");
		MAM_BP_GRP_R S0_MM_FR_CST10 = MAM_BP_GRP_R.create("MM_FR_CST10");
		
		MCDynamicSQLID DS0C_FR_CST_GRP = createDynamicSQLID("DS0C_FR_CST_GRP");
		MCDynamicSQLID DS0C_FR_DLV_GRP = createDynamicSQLID("DS0C_FR_DLV_GRP");
		MCDynamicSQLID DS0C_ITM_GRP = createDynamicSQLID("DS0C_ITM_GRP");
		MCDynamicSQLID DS0C_TO_CST_GRP = createDynamicSQLID("DS0C_TO_CST_GRP");
		MCDynamicSQLID DS0C_TO_DLV_GRP = createDynamicSQLID("DS0C_TO_DLV_GRP");
		
		return createQueryPlan()
			.setQuery(
				sql("MSBAL0040_MST_DMND_Query_S02")
					.mainQuery()
					.select(
						S0_T1.dmnd_no.as("to_dmnd_no"),
						S0_T1.dmnd_dt.as("to_dmnd_dt"),
						S0_T1.dmnd_st_dt.as("to_dmnd_st_dt"),
						S0_T1.dmnd_end_dt.as("to_dmnd_end_dt"),
						S0_T1.dlv_schd_st_dt.as("to_dlv_schd_st_dt"),
						S0_T1.dlv_schd_end_dt.as("to_dlv_schd_end_dt"),
						S0_T1.dmnd_period_typ.as("to_dmnd_period_typ"),
						S0_T1.dly_div_flg.as("to_dly_div_flg"),
						S0_T4.dmnd_no.as("fr_dmnd_no"),
						S0_T4.dmnd_dt.as("fr_dmnd_dt"),
						S0_T4.dmnd_st_dt.as("fr_dmnd_st_dt"),
						S0_T4.dlv_schd_st_dt.as("fr_dlv_schd_st_dt"),
						S0_T4.dlv_schd_end_dt.as("fr_dlv_schd_end_dt"),
						S0_T4.dmnd_end_dt.as("fr_dmnd_end_dt"),
						S0_T4.dmnd_period_typ.as("fr_dmnd_period_typ"),
						S0_T1.itm_cd,
						S0_T1.itm_sub1,
						S0_T1.itm_sub2,
						S0_T1.itm_sub3,
						S0_T1.spln_itm_cd.as("to_spln_itm_cd"),
						S0_T4.spln_itm_cd.as("fr_spln_itm_cd"),
						S0_T1.dmnd_typ.as("to_dmnd_typ"),
						S0_T4.dmnd_typ.as("fr_dmnd_typ"),
						S0_T1.dmnd_qty.as("to_dmnd_qty"),
						S0_T1.input_qty.as("to_input_qty"),
						S0_T1.rec_qty.as("to_rec_qty"),
						S0_T4.dmnd_qty.as("fr_dmnd_qty"),
						S0_T4.input_qty.as("fr_input_qty"),
						S0_T3.rec_qty.as("fr_rec_qty"),
						S0_T1.dmnd_dpt_cd.as("to_dmnd_dpt_cd"),
						S0_M5.dpt_nm.as("to_dmnd_dpt_nm"),
						S0_T1.dmnd_usr_cd.as("to_dmnd_usr_cd"),
						S0_T4.dmnd_dpt_cd.as("fr_dmnd_dpt_cd"),
						S0_M16.dpt_nm.as("fr_dmnd_dpt_nm"),
						S0_T4.dmnd_usr_cd.as("fr_dmnd_usr_cd"),
						S0_T1.cst_cd.as("to_cst_cd"),
						S0_T1.dlv_cd.as("to_dlv_cd"),
						S0_T4.cst_cd.as("fr_cst_cd"),
						S0_T4.dlv_cd.as("fr_dlv_cd"),
						S0_T1.slo_d_no.as("to_slo_d_no"),
						S0_T1.slo_no.as("to_slo_no"),
						S0_T1.cst_frcst_d_no.as("to_cst_frcst_d_no"),
						S0_T1.cst_frcst_no.as("to_cst_frcst_no"),
						S0_T1.ym.as("to_ym"),
						S0_T1.spln_vers.as("to_spln_vers"),
						S0_T1.cur_cd.as("to_cur_cd"),
						S0_T1.sno1.as("to_sno1"),
						S0_T1.sno2.as("to_sno2"),
						S0_T1.sno3.as("to_sno3"),
						S0_T1.sno4.as("to_sno4"),
						nvl(
							S0_T2.wrk_no,
							S0_T1.wrk_no
						).as("to_wrk_no"),
						nvl(
							S0_T2.wrk_nm,
							S0_T6.wrk_nm
						).as("to_wrk_nm"),
						S0_T4.slo_d_no.as("fr_slo_d_no"),
						S0_T4.slo_no.as("fr_slo_no"),
						S0_T4.cst_frcst_d_no.as("fr_cst_frcst_d_no"),
						S0_T4.cst_frcst_no.as("fr_cst_frcst_no"),
						S0_T4.ym.as("fr_ym"),
						S0_T4.spln_vers.as("fr_spln_vers"),
						S0_T4.cur_cd.as("fr_cur_cd"),
						S0_T4.sno1.as("fr_sno1"),
						S0_T4.sno2.as("fr_sno2"),
						S0_T4.sno3.as("fr_sno3"),
						S0_T4.sno4.as("fr_sno4"),
						nvl(
							S0_T5.wrk_no,
							S0_T4.wrk_no
						).as("fr_wrk_no"),
						nvl(
							S0_T5.wrk_nm,
							S0_T7.wrk_nm
						).as("fr_wrk_nm"),
						S0_T1.dmnd_loc_cd,
						S0_T1.intr_rmrks.as("to_intr_rmrks"),
						S0_T1.sub_char1.as("to_sub_char1"),
						S0_T1.sub_char2.as("to_sub_char2"),
						S0_T1.sub_char3.as("to_sub_char3"),
						S0_T4.intr_rmrks.as("fr_intr_rmrks"),
						S0_T4.sub_char1.as("fr_sub_char1"),
						S0_T4.sub_char2.as("fr_sub_char2"),
						S0_T4.sub_char3.as("fr_sub_char3"),
						S0_T1.ins_usr_id.as("to_ins_usr_id"),
						S0_T1.ins_usr_nm.as("to_ins_usr_nm"),
						S0_T1.ins_ts.as("to_ins_ts"),
						S0_T1.ins_func_id.as("to_ins_func_id"),
						S0_T1.upd_usr_id.as("to_upd_usr_id"),
						S0_T1.upd_usr_nm.as("to_upd_usr_nm"),
						S0_T1.upd_ts.as("to_upd_ts"),
						S0_T1.upd_func_id.as("to_upd_func_id"),
						S0_T1.upd_srv_req_no.as("to_upd_srv_req_no"),
						S0_T4.ins_usr_id.as("fr_ins_usr_id"),
						S0_T4.ins_usr_nm.as("fr_ins_usr_nm"),
						S0_T4.ins_ts.as("fr_ins_ts"),
						S0_T4.ins_func_id.as("fr_ins_func_id"),
						S0_T4.upd_usr_id.as("fr_upd_usr_id"),
						S0_T4.upd_usr_nm.as("fr_upd_usr_nm"),
						S0_T4.upd_ts.as("fr_upd_ts"),
						S0_T4.upd_func_id.as("fr_upd_func_id"),
						S0_T4.upd_srv_req_no.as("fr_upd_srv_req_no"),
						addDynamicSelect(DS0C_ITM_GRP),
						addDynamicSelect(DS0C_TO_DLV_GRP),
						addDynamicSelect(DS0C_TO_CST_GRP),
						addDynamicSelect(DS0C_FR_DLV_GRP),
						addDynamicSelect(DS0C_FR_CST_GRP)
					)
					.from(
						S0_T1
						.leftOuterJoin(S0_T3).on(
							bracket(
								S0_T3.to_dmnd_no.eq(S0_T1.dmnd_no)
							)
						)
						.leftOuterJoin(S0_T4).on(
							bracket(
								S0_T4.dmnd_no.eq(S0_T3.fr_dmnd_no)
							)
						)
						.leftOuterJoin(S0_M5).on(
							bracket(
								S0_M5.dpt_cd.eq(S0_T1.dmnd_dpt_cd)
								.and(S0_T1.dmnd_dt.between(S0_M5.st_dt, S0_M5.end_dt))
							)
						)
						.innerJoin(S0_M15).on(
							bracket(
								S0_T1.dmnd_loc_cd.eq(S0_M15.loc_cd)
							)
						)
						.leftOuterJoin(S0_M16).on(
							bracket(
								S0_M16.dpt_cd.eq(S0_T4.dmnd_dpt_cd)
								.and(S0_T4.dmnd_dt.between(S0_M16.st_dt, S0_M16.end_dt))
							)
						)
						.innerJoin(S0_M22).on(
							bracket(
								value(0).eq(value(0))
							)
						)
						.leftOuterJoin(S0_T2).on(
							bracket(
								S0_T2.sno1.eq(S0_T1.sno1)
							)
						)
						.leftOuterJoin(S0_T5).on(
							bracket(
								S0_T5.sno1.eq(S0_T4.sno1)
							)
						)
						.leftOuterJoin(S0_T6).on(
							bracket(
								S0_T6.wrk_no.eq(S0_T1.wrk_no)
							)
						)
						.leftOuterJoin(S0_T7).on(
							bracket(
								S0_T7.wrk_no.eq(S0_T4.wrk_no)
							)
						)
						.addDynamicView()
						.addDynamicView(DS0C_ITM_GRP)
						.addDynamicView(DS0C_TO_DLV_GRP)
						.addDynamicView(DS0C_TO_CST_GRP)
						.addDynamicView(DS0C_FR_DLV_GRP)
						.addDynamicView(DS0C_FR_CST_GRP)
					)
					.where(
						value(0).eq(value(0))
						.cutoff$and(S0_T1.dmnd_st_dt.lte(bind("dmnd_dt_to")))
						.cutoff$and(S0_T1.dmnd_end_dt.gte(bind("dmnd_dt_fr")))
						.cutoff$and(S0_T1.dmnd_period_typ.like(bind("dmnd_period_typ")))
						.cutoff$and(S0_T1.dmnd_typ.like(bind("dmnd_typ")))
						.cutoff$and(S0_T1.dmnd_no.like(bind("dmnd_no")))
						.cutoff$and(S0_T1.dlv_cd.like(bind("dlv_cd")))
						.addDynamicPredicate()
						.cutoff$and(S0_T1.cst_cd.like(bind("cst_cd")))
						.cutoff$and(S0_T1.dmnd_loc_cd.like(bind("dmnd_loc_cd")))
						.cutoff$and(S0_T1.itm_cd.like(bind("itm_cd")))
						.cutoff$and(S0_T1.itm_sub1.like(bind("itm_sub1")))
						.cutoff$and(S0_T1.itm_sub2.like(bind("itm_sub2")))
						.cutoff$and(S0_T1.itm_sub3.like(bind("itm_sub3")))
						.cutoff$and(S0_T1.sno1.like(bind("sno1")))
						.cutoff$and(S0_T1.sno2.like(bind("sno2")))
						.cutoff$and(S0_T1.sno3.like(bind("sno3")))
						.cutoff$and(S0_T1.sno4.like(bind("sno4")))
						.cutoff$and(
							nvl(
								S0_T2.wrk_no,
								S0_T1.wrk_no
							).like(bind("wrk_no"))
						)
						.cutoff$and(
							nvl(
								S0_T2.wrk_nm,
								S0_T6.wrk_nm
							).like(bind("wrk_nm"))
						)
						.cutoff$and(S0_T1.dmnd_dpt_cd.like(bind("dpt_cd")))
						.cutoff$and(S0_M5.dpt_nm.like(bind("dpt_nm")))
						.cutoff$and(S0_T1.dmnd_usr_cd.like(bind("usr_cd")))
						.cutoff$and(S0_T1.ym.eq(bind("ym")))
						.cutoff$and(S0_T1.spln_vers.like(bind("spln_vers")))
						.cutoff$and(S0_T1.spln_itm_cd.like(bind("spln_itm_cd")))
						.cutoff$and(S0_T1.cst_frcst_no.like(bind("cst_frcst_no")))
						.cutoff$and(S0_T1.cst_frcst_d_no.like(bind("cst_frcst_d_no")))
						.cutoff$and(S0_T1.slo_no.like(bind("slo_no")))
						.cutoff$and(S0_T1.slo_d_no.like(bind("slo_d_no")))
						.cutoff$and(S0_T1.intr_rmrks.like(bind("intr_rmrks")))
						.cutoff$and(S0_T1.sub_char1.like(bind("sub_char1")))
						.cutoff$and(S0_T1.sub_char2.like(bind("sub_char2")))
						.cutoff$and(S0_T1.sub_char3.like(bind("sub_char3")))
						.addDynamicPredicate(DS0C_ITM_GRP)
						.addDynamicPredicate(DS0C_TO_DLV_GRP)
						.addDynamicPredicate(DS0C_TO_CST_GRP)
					)
					.orderBy(
						S0_T1.itm_cd.asc(),
						S0_T1.itm_sub1.asc(),
						S0_T1.itm_sub2.asc(),
						S0_T1.itm_sub3.asc(),
						MAPA_DT$F_GET_PERIOD_ST_DT_NE(
							S0_T1.dmnd_st_dt,
							value(MAC_PERIOD_TYP.MONTHLY.value()),
							S0_M22.ac_cl_day
						).asc(),
						S0_T1.dmnd_typ.desc(),
						S0_T1.dmnd_period_typ.desc(),
						S0_T4.dmnd_typ.desc(),
						S0_T4.dmnd_period_typ.desc(),
						S0_T1.dmnd_no.asc(),
						S0_T4.dmnd_no.asc()
					)
			)
			.setDynamicSQLInfo(
				when(boundOr("itm_typ_d_nm", "itm_grp_flg1", "itm_grp_flg2", "itm_grp_flg3", "itm_grp_flg4", "itm_grp_flg5", "itm_grp_flg6", "itm_grp_flg7", "itm_grp_flg8", "itm_grp_flg9", "itm_grp_flg10", "itm_typ", "itm_typ_d_cd", "itm_nm"))
					.view(v -> v.leftOuterJoin(S0_M1).on(bracket(S0_M1.itm_cd.eq(S0_T1.itm_cd).and(S0_M1.itm_sub1.eq(S0_T1.itm_sub1)).and(S0_M1.itm_sub2.eq(S0_T1.itm_sub2)).and(S0_M1.itm_sub3.eq(S0_T1.itm_sub3)))))
					.predicate(p -> p.cutoff$and(S0_M1.itm_typ.like(bind("itm_typ"))).cutoff$and(S0_M1.itm_typ_d_cd.like(bind("itm_typ_d_cd"))).cutoff$and(S0_M1.itm_nm.like(bind("itm_nm")))),
				when(boundOr("wg_nm", "loc_grp_nm", "lg_grp_nm", "site_nm", "dmnd_loc_nm", "site_cd", "wg_cd", "lg_grp_cd", "loc_grp_cd"))
					.view(v -> v.leftOuterJoin(S0_M3).on(bracket(S0_M3.loc_cd.eq(S0_T1.dmnd_loc_cd))))
					.predicate(p -> p.cutoff$and(S0_M3.loc_nm.like(bind("dmnd_loc_nm"))).cutoff$and(S0_M3.site_cd.like(bind("site_cd"))).cutoff$and(S0_M3.wg_cd.like(bind("wg_cd"))).cutoff$and(S0_M3.lg_grp_cd.like(bind("lg_grp_cd"))).cutoff$and(S0_M3.loc_grp_cd.like(bind("loc_grp_cd")))),
				when(boundOr("wg_nm"))
					.view(v -> v.leftOuterJoin(S0_M4).on(bracket(S0_M4.wg_cd.eq(S0_M3.wg_cd))))
					.predicate(p -> p.cutoff$and(S0_M4.wg_nm.like(bind("wg_nm")))),
				when(boundOr("spln_itm_nm"))
					.view(v -> v.leftOuterJoin(S0_M7).on(bracket(S0_M7.spln_itm_cd.eq(S0_T1.spln_itm_cd))))
					.predicate(p -> p.cutoff$and(S0_M7.spln_itm_nm.like(bind("spln_itm_nm")))),
				when(boundOr("to_dlv_grp_flg1", "to_dlv_grp_flg2", "to_dlv_grp_flg3", "to_dlv_grp_flg4", "to_dlv_grp_flg5", "to_dlv_grp_flg6", "to_dlv_grp_flg7", "to_dlv_grp_flg8", "to_dlv_grp_flg9", "to_dlv_grp_flg10", "dlv_nm"))
					.view(v -> v.leftOuterJoin(S0_M8).on(bracket(S0_M8.bp_cd.eq(S0_T1.dlv_cd))))
					.predicate(p -> p.cutoff$and(S0_M8.bp_nm.like(bind("dlv_nm")))),
				when(boundOr("to_cst_grp_flg1", "to_cst_grp_flg2", "to_cst_grp_flg3", "to_cst_grp_flg4", "to_cst_grp_flg5", "to_cst_grp_flg6", "to_cst_grp_flg7", "to_cst_grp_flg8", "to_cst_grp_flg9", "to_cst_grp_flg10", "cst_nm"))
					.view(v -> v.leftOuterJoin(S0_M9).on(bracket(S0_M9.bp_cd.eq(S0_T1.cst_cd))))
					.predicate(p -> p.cutoff$and(S0_M9.bp_nm.like(bind("cst_nm")))),
				when(boundOr("itm_typ_d_nm"))
					.view(v -> v.leftOuterJoin(S0_M10).on(bracket(S0_M10.itm_typ.eq(S0_M1.itm_typ).and(S0_M10.itm_typ_d_cd.eq(S0_M1.itm_typ_d_cd)))))
					.predicate(p -> p.cutoff$and(S0_M10.itm_typ_d_nm.like(bind("itm_typ_d_nm")))),
				when(boundOr("loc_grp_nm"))
					.view(v -> v.leftOuterJoin(S0_M11).on(bracket(S0_M11.loc_grp_cd.eq(S0_M3.loc_grp_cd))))
					.predicate(p -> p.cutoff$and(S0_M11.loc_grp_nm.like(bind("loc_grp_nm")))),
				when(boundOr("lg_grp_nm"))
					.view(v -> v.leftOuterJoin(S0_M12).on(bracket(S0_M12.lg_grp_cd.eq(S0_M3.lg_grp_cd))))
					.predicate(p -> p.cutoff$and(S0_M12.lg_grp_nm.like(bind("lg_grp_nm")))),
				when(boundOr("site_nm"))
					.view(v -> v.leftOuterJoin(S0_M13).on(bracket(S0_M13.site_cd.eq(S0_M3.site_cd))))
					.predicate(p -> p.cutoff$and(S0_M13.site_nm.like(bind("site_nm")))),
				when(boundOr("usr_nm"))
					.view(v -> v.leftOuterJoin(S0_M14).on(bracket(S0_M14.usr_cd.eq(S0_T1.dmnd_usr_cd))))
					.predicate(p -> p.cutoff$and(S0_M14.usr_nm.like(bind("usr_nm")))),
				when(boundOr("fr_dlv_grp_flg1", "fr_dlv_grp_flg2", "fr_dlv_grp_flg3", "fr_dlv_grp_flg4", "fr_dlv_grp_flg5", "fr_dlv_grp_flg6", "fr_dlv_grp_flg7", "fr_dlv_grp_flg8", "fr_dlv_grp_flg9", "fr_dlv_grp_flg10"))
					.view(v -> v.leftOuterJoin(S0_M19).on(bracket(S0_M19.bp_cd.eq(S0_T4.dlv_cd)))),
				when(boundOr("fr_cst_grp_flg1", "fr_cst_grp_flg2", "fr_cst_grp_flg3", "fr_cst_grp_flg4", "fr_cst_grp_flg5", "fr_cst_grp_flg6", "fr_cst_grp_flg7", "fr_cst_grp_flg8", "fr_cst_grp_flg9", "fr_cst_grp_flg10"))
					.view(v -> v.leftOuterJoin(S0_M20).on(bracket(S0_M20.bp_cd.eq(S0_T4.cst_cd)))),
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
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M1.itm_grp_cd10.like(bind("itm_grp_cd10"))).cutoff$and(S0_MM10.itm_grp_nm.like(bind("itm_grp_nm10")))),
				when(boundOr("to_dlv_grp_flg1"))
					.select(DS0C_TO_DLV_GRP, S0_M8.bp_grp_cd1.as("to_dlv_grp_cd1"), S0_MM_TO_DLV1.bp_grp_nm.as("to_dlv_grp_nm1"))
					.view(DS0C_TO_DLV_GRP, v -> v.leftOuterJoin(S0_MM_TO_DLV1).on(S0_M8.bp_grp_cd1.eq(S0_MM_TO_DLV1.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP1.value()).eq(S0_MM_TO_DLV1.bp_grp_typ))))
					.predicate(DS0C_TO_DLV_GRP, p -> p.cutoff$and(S0_M8.bp_grp_cd1.like(bind("to_dlv_grp_cd1"))).cutoff$and(S0_MM_TO_DLV1.bp_grp_nm.like(bind("to_dlv_grp_nm1")))),
				when(boundOr("to_dlv_grp_flg2"))
					.select(DS0C_TO_DLV_GRP, S0_M8.bp_grp_cd2.as("to_dlv_grp_cd2"), S0_MM_TO_DLV2.bp_grp_nm.as("to_dlv_grp_nm2"))
					.view(DS0C_TO_DLV_GRP, v -> v.leftOuterJoin(S0_MM_TO_DLV2).on(S0_M8.bp_grp_cd2.eq(S0_MM_TO_DLV2.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP2.value()).eq(S0_MM_TO_DLV2.bp_grp_typ))))
					.predicate(DS0C_TO_DLV_GRP, p -> p.cutoff$and(S0_M8.bp_grp_cd2.like(bind("to_dlv_grp_cd2"))).cutoff$and(S0_MM_TO_DLV2.bp_grp_nm.like(bind("to_dlv_grp_nm2")))),
				when(boundOr("to_dlv_grp_flg3"))
					.select(DS0C_TO_DLV_GRP, S0_M8.bp_grp_cd3.as("to_dlv_grp_cd3"), S0_MM_TO_DLV3.bp_grp_nm.as("to_dlv_grp_nm3"))
					.view(DS0C_TO_DLV_GRP, v -> v.leftOuterJoin(S0_MM_TO_DLV3).on(S0_M8.bp_grp_cd3.eq(S0_MM_TO_DLV3.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP3.value()).eq(S0_MM_TO_DLV3.bp_grp_typ))))
					.predicate(DS0C_TO_DLV_GRP, p -> p.cutoff$and(S0_M8.bp_grp_cd3.like(bind("to_dlv_grp_cd3"))).cutoff$and(S0_MM_TO_DLV3.bp_grp_nm.like(bind("to_dlv_grp_nm3")))),
				when(boundOr("to_dlv_grp_flg4"))
					.select(DS0C_TO_DLV_GRP, S0_M8.bp_grp_cd4.as("to_dlv_grp_cd4"), S0_MM_TO_DLV4.bp_grp_nm.as("to_dlv_grp_nm4"))
					.view(DS0C_TO_DLV_GRP, v -> v.leftOuterJoin(S0_MM_TO_DLV4).on(S0_M8.bp_grp_cd4.eq(S0_MM_TO_DLV4.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP4.value()).eq(S0_MM_TO_DLV4.bp_grp_typ))))
					.predicate(DS0C_TO_DLV_GRP, p -> p.cutoff$and(S0_M8.bp_grp_cd4.like(bind("to_dlv_grp_cd4"))).cutoff$and(S0_MM_TO_DLV4.bp_grp_nm.like(bind("to_dlv_grp_nm4")))),
				when(boundOr("to_dlv_grp_flg5"))
					.select(DS0C_TO_DLV_GRP, S0_M8.bp_grp_cd5.as("to_dlv_grp_cd5"), S0_MM_TO_DLV5.bp_grp_nm.as("to_dlv_grp_nm5"))
					.view(DS0C_TO_DLV_GRP, v -> v.leftOuterJoin(S0_MM_TO_DLV5).on(S0_M8.bp_grp_cd5.eq(S0_MM_TO_DLV5.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP5.value()).eq(S0_MM_TO_DLV5.bp_grp_typ))))
					.predicate(DS0C_TO_DLV_GRP, p -> p.cutoff$and(S0_M8.bp_grp_cd5.like(bind("to_dlv_grp_cd5"))).cutoff$and(S0_MM_TO_DLV5.bp_grp_nm.like(bind("to_dlv_grp_nm5")))),
				when(boundOr("to_dlv_grp_flg6"))
					.select(DS0C_TO_DLV_GRP, S0_M8.bp_grp_cd6.as("to_dlv_grp_cd6"), S0_MM_TO_DLV6.bp_grp_nm.as("to_dlv_grp_nm6"))
					.view(DS0C_TO_DLV_GRP, v -> v.leftOuterJoin(S0_MM_TO_DLV6).on(S0_M8.bp_grp_cd6.eq(S0_MM_TO_DLV6.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP6.value()).eq(S0_MM_TO_DLV6.bp_grp_typ))))
					.predicate(DS0C_TO_DLV_GRP, p -> p.cutoff$and(S0_M8.bp_grp_cd6.like(bind("to_dlv_grp_cd6"))).cutoff$and(S0_MM_TO_DLV6.bp_grp_nm.like(bind("to_dlv_grp_nm6")))),
				when(boundOr("to_dlv_grp_flg7"))
					.select(DS0C_TO_DLV_GRP, S0_M8.bp_grp_cd7.as("to_dlv_grp_cd7"), S0_MM_TO_DLV7.bp_grp_nm.as("to_dlv_grp_nm7"))
					.view(DS0C_TO_DLV_GRP, v -> v.leftOuterJoin(S0_MM_TO_DLV7).on(S0_M8.bp_grp_cd7.eq(S0_MM_TO_DLV7.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP7.value()).eq(S0_MM_TO_DLV7.bp_grp_typ))))
					.predicate(DS0C_TO_DLV_GRP, p -> p.cutoff$and(S0_M8.bp_grp_cd7.like(bind("to_dlv_grp_cd7"))).cutoff$and(S0_MM_TO_DLV7.bp_grp_nm.like(bind("to_dlv_grp_nm7")))),
				when(boundOr("to_dlv_grp_flg8"))
					.select(DS0C_TO_DLV_GRP, S0_M8.bp_grp_cd8.as("to_dlv_grp_cd8"), S0_MM_TO_DLV8.bp_grp_nm.as("to_dlv_grp_nm8"))
					.view(DS0C_TO_DLV_GRP, v -> v.leftOuterJoin(S0_MM_TO_DLV8).on(S0_M8.bp_grp_cd8.eq(S0_MM_TO_DLV8.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP8.value()).eq(S0_MM_TO_DLV8.bp_grp_typ))))
					.predicate(DS0C_TO_DLV_GRP, p -> p.cutoff$and(S0_M8.bp_grp_cd8.like(bind("to_dlv_grp_cd8"))).cutoff$and(S0_MM_TO_DLV8.bp_grp_nm.like(bind("to_dlv_grp_nm8")))),
				when(boundOr("to_dlv_grp_flg9"))
					.select(DS0C_TO_DLV_GRP, S0_M8.bp_grp_cd9.as("to_dlv_grp_cd9"), S0_MM_TO_DLV9.bp_grp_nm.as("to_dlv_grp_nm9"))
					.view(DS0C_TO_DLV_GRP, v -> v.leftOuterJoin(S0_MM_TO_DLV9).on(S0_M8.bp_grp_cd9.eq(S0_MM_TO_DLV9.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP9.value()).eq(S0_MM_TO_DLV9.bp_grp_typ))))
					.predicate(DS0C_TO_DLV_GRP, p -> p.cutoff$and(S0_M8.bp_grp_cd9.like(bind("to_dlv_grp_cd9"))).cutoff$and(S0_MM_TO_DLV9.bp_grp_nm.like(bind("to_dlv_grp_nm9")))),
				when(boundOr("to_dlv_grp_flg10"))
					.select(DS0C_TO_DLV_GRP, S0_M8.bp_grp_cd10.as("to_dlv_grp_cd10"), S0_MM_TO_DLV10.bp_grp_nm.as("to_dlv_grp_nm10"))
					.view(DS0C_TO_DLV_GRP, v -> v.leftOuterJoin(S0_MM_TO_DLV10).on(S0_M8.bp_grp_cd10.eq(S0_MM_TO_DLV10.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP10.value()).eq(S0_MM_TO_DLV10.bp_grp_typ))))
					.predicate(DS0C_TO_DLV_GRP, p -> p.cutoff$and(S0_M8.bp_grp_cd10.like(bind("to_dlv_grp_cd10"))).cutoff$and(S0_MM_TO_DLV10.bp_grp_nm.like(bind("to_dlv_grp_nm10")))),
				when(boundOr("to_cst_grp_flg1"))
					.select(DS0C_TO_CST_GRP, S0_M9.bp_grp_cd1.as("to_cst_grp_cd1"), S0_MM_TO_CST1.bp_grp_nm.as("to_cst_grp_nm1"))
					.view(DS0C_TO_CST_GRP, v -> v.leftOuterJoin(S0_MM_TO_CST1).on(S0_M9.bp_grp_cd1.eq(S0_MM_TO_CST1.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP1.value()).eq(S0_MM_TO_CST1.bp_grp_typ))))
					.predicate(DS0C_TO_CST_GRP, p -> p.cutoff$and(S0_M9.bp_grp_cd1.like(bind("to_cst_grp_cd1"))).cutoff$and(S0_MM_TO_CST1.bp_grp_nm.like(bind("to_cst_grp_nm1")))),
				when(boundOr("to_cst_grp_flg2"))
					.select(DS0C_TO_CST_GRP, S0_M9.bp_grp_cd2.as("to_cst_grp_cd2"), S0_MM_TO_CST2.bp_grp_nm.as("to_cst_grp_nm2"))
					.view(DS0C_TO_CST_GRP, v -> v.leftOuterJoin(S0_MM_TO_CST2).on(S0_M9.bp_grp_cd2.eq(S0_MM_TO_CST2.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP2.value()).eq(S0_MM_TO_CST2.bp_grp_typ))))
					.predicate(DS0C_TO_CST_GRP, p -> p.cutoff$and(S0_M9.bp_grp_cd2.like(bind("to_cst_grp_cd2"))).cutoff$and(S0_MM_TO_CST2.bp_grp_nm.like(bind("to_cst_grp_nm2")))),
				when(boundOr("to_cst_grp_flg3"))
					.select(DS0C_TO_CST_GRP, S0_M9.bp_grp_cd3.as("to_cst_grp_cd3"), S0_MM_TO_CST3.bp_grp_nm.as("to_cst_grp_nm3"))
					.view(DS0C_TO_CST_GRP, v -> v.leftOuterJoin(S0_MM_TO_CST3).on(S0_M9.bp_grp_cd3.eq(S0_MM_TO_CST3.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP3.value()).eq(S0_MM_TO_CST3.bp_grp_typ))))
					.predicate(DS0C_TO_CST_GRP, p -> p.cutoff$and(S0_M9.bp_grp_cd3.like(bind("to_cst_grp_cd3"))).cutoff$and(S0_MM_TO_CST3.bp_grp_nm.like(bind("to_cst_grp_nm3")))),
				when(boundOr("to_cst_grp_flg4"))
					.select(DS0C_TO_CST_GRP, S0_M9.bp_grp_cd4.as("to_cst_grp_cd4"), S0_MM_TO_CST4.bp_grp_nm.as("to_cst_grp_nm4"))
					.view(DS0C_TO_CST_GRP, v -> v.leftOuterJoin(S0_MM_TO_CST4).on(S0_M9.bp_grp_cd4.eq(S0_MM_TO_CST4.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP4.value()).eq(S0_MM_TO_CST4.bp_grp_typ))))
					.predicate(DS0C_TO_CST_GRP, p -> p.cutoff$and(S0_M9.bp_grp_cd4.like(bind("to_cst_grp_cd4"))).cutoff$and(S0_MM_TO_CST4.bp_grp_nm.like(bind("to_cst_grp_nm4")))),
				when(boundOr("to_cst_grp_flg5"))
					.select(DS0C_TO_CST_GRP, S0_M9.bp_grp_cd5.as("to_cst_grp_cd5"), S0_MM_TO_CST5.bp_grp_nm.as("to_cst_grp_nm5"))
					.view(DS0C_TO_CST_GRP, v -> v.leftOuterJoin(S0_MM_TO_CST5).on(S0_M9.bp_grp_cd5.eq(S0_MM_TO_CST5.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP5.value()).eq(S0_MM_TO_CST5.bp_grp_typ))))
					.predicate(DS0C_TO_CST_GRP, p -> p.cutoff$and(S0_M9.bp_grp_cd5.like(bind("to_cst_grp_cd5"))).cutoff$and(S0_MM_TO_CST5.bp_grp_nm.like(bind("to_cst_grp_nm5")))),
				when(boundOr("to_cst_grp_flg6"))
					.select(DS0C_TO_CST_GRP, S0_M9.bp_grp_cd6.as("to_cst_grp_cd6"), S0_MM_TO_CST6.bp_grp_nm.as("to_cst_grp_nm6"))
					.view(DS0C_TO_CST_GRP, v -> v.leftOuterJoin(S0_MM_TO_CST6).on(S0_M9.bp_grp_cd6.eq(S0_MM_TO_CST6.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP6.value()).eq(S0_MM_TO_CST6.bp_grp_typ))))
					.predicate(DS0C_TO_CST_GRP, p -> p.cutoff$and(S0_M9.bp_grp_cd6.like(bind("to_cst_grp_cd6"))).cutoff$and(S0_MM_TO_CST6.bp_grp_nm.like(bind("to_cst_grp_nm6")))),
				when(boundOr("to_cst_grp_flg7"))
					.select(DS0C_TO_CST_GRP, S0_M9.bp_grp_cd7.as("to_cst_grp_cd7"), S0_MM_TO_CST7.bp_grp_nm.as("to_cst_grp_nm7"))
					.view(DS0C_TO_CST_GRP, v -> v.leftOuterJoin(S0_MM_TO_CST7).on(S0_M9.bp_grp_cd7.eq(S0_MM_TO_CST7.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP7.value()).eq(S0_MM_TO_CST7.bp_grp_typ))))
					.predicate(DS0C_TO_CST_GRP, p -> p.cutoff$and(S0_M9.bp_grp_cd7.like(bind("to_cst_grp_cd7"))).cutoff$and(S0_MM_TO_CST7.bp_grp_nm.like(bind("to_cst_grp_nm7")))),
				when(boundOr("to_cst_grp_flg8"))
					.select(DS0C_TO_CST_GRP, S0_M9.bp_grp_cd8.as("to_cst_grp_cd8"), S0_MM_TO_CST8.bp_grp_nm.as("to_cst_grp_nm8"))
					.view(DS0C_TO_CST_GRP, v -> v.leftOuterJoin(S0_MM_TO_CST8).on(S0_M9.bp_grp_cd8.eq(S0_MM_TO_CST8.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP8.value()).eq(S0_MM_TO_CST8.bp_grp_typ))))
					.predicate(DS0C_TO_CST_GRP, p -> p.cutoff$and(S0_M9.bp_grp_cd8.like(bind("to_cst_grp_cd8"))).cutoff$and(S0_MM_TO_CST8.bp_grp_nm.like(bind("to_cst_grp_nm8")))),
				when(boundOr("to_cst_grp_flg9"))
					.select(DS0C_TO_CST_GRP, S0_M9.bp_grp_cd9.as("to_cst_grp_cd9"), S0_MM_TO_CST9.bp_grp_nm.as("to_cst_grp_nm9"))
					.view(DS0C_TO_CST_GRP, v -> v.leftOuterJoin(S0_MM_TO_CST9).on(S0_M9.bp_grp_cd9.eq(S0_MM_TO_CST9.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP9.value()).eq(S0_MM_TO_CST9.bp_grp_typ))))
					.predicate(DS0C_TO_CST_GRP, p -> p.cutoff$and(S0_M9.bp_grp_cd9.like(bind("to_cst_grp_cd9"))).cutoff$and(S0_MM_TO_CST9.bp_grp_nm.like(bind("to_cst_grp_nm9")))),
				when(boundOr("to_cst_grp_flg10"))
					.select(DS0C_TO_CST_GRP, S0_M9.bp_grp_cd10.as("to_cst_grp_cd10"), S0_MM_TO_CST10.bp_grp_nm.as("to_cst_grp_nm10"))
					.view(DS0C_TO_CST_GRP, v -> v.leftOuterJoin(S0_MM_TO_CST10).on(S0_M9.bp_grp_cd10.eq(S0_MM_TO_CST10.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP10.value()).eq(S0_MM_TO_CST10.bp_grp_typ))))
					.predicate(DS0C_TO_CST_GRP, p -> p.cutoff$and(S0_M9.bp_grp_cd10.like(bind("to_cst_grp_cd10"))).cutoff$and(S0_MM_TO_CST10.bp_grp_nm.like(bind("to_cst_grp_nm10")))),
				when(boundOr("fr_dlv_grp_flg1"))
					.select(DS0C_FR_DLV_GRP, S0_M19.bp_grp_cd1.as("fr_dlv_grp_cd1"), S0_MM_FR_DLV1.bp_grp_nm.as("fr_dlv_grp_nm1"))
					.view(DS0C_FR_DLV_GRP, v -> v.leftOuterJoin(S0_MM_FR_DLV1).on(S0_M19.bp_grp_cd1.eq(S0_MM_FR_DLV1.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP1.value()).eq(S0_MM_FR_DLV1.bp_grp_typ)))),
				when(boundOr("fr_dlv_grp_flg2"))
					.select(DS0C_FR_DLV_GRP, S0_M19.bp_grp_cd2.as("fr_dlv_grp_cd2"), S0_MM_FR_DLV2.bp_grp_nm.as("fr_dlv_grp_nm2"))
					.view(DS0C_FR_DLV_GRP, v -> v.leftOuterJoin(S0_MM_FR_DLV2).on(S0_M19.bp_grp_cd2.eq(S0_MM_FR_DLV2.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP2.value()).eq(S0_MM_FR_DLV2.bp_grp_typ)))),
				when(boundOr("fr_dlv_grp_flg3"))
					.select(DS0C_FR_DLV_GRP, S0_M19.bp_grp_cd3.as("fr_dlv_grp_cd3"), S0_MM_FR_DLV3.bp_grp_nm.as("fr_dlv_grp_nm3"))
					.view(DS0C_FR_DLV_GRP, v -> v.leftOuterJoin(S0_MM_FR_DLV3).on(S0_M19.bp_grp_cd3.eq(S0_MM_FR_DLV3.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP3.value()).eq(S0_MM_FR_DLV3.bp_grp_typ)))),
				when(boundOr("fr_dlv_grp_flg4"))
					.select(DS0C_FR_DLV_GRP, S0_M19.bp_grp_cd4.as("fr_dlv_grp_cd4"), S0_MM_FR_DLV4.bp_grp_nm.as("fr_dlv_grp_nm4"))
					.view(DS0C_FR_DLV_GRP, v -> v.leftOuterJoin(S0_MM_FR_DLV4).on(S0_M19.bp_grp_cd4.eq(S0_MM_FR_DLV4.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP4.value()).eq(S0_MM_FR_DLV4.bp_grp_typ)))),
				when(boundOr("fr_dlv_grp_flg5"))
					.select(DS0C_FR_DLV_GRP, S0_M19.bp_grp_cd5.as("fr_dlv_grp_cd5"), S0_MM_FR_DLV5.bp_grp_nm.as("fr_dlv_grp_nm5"))
					.view(DS0C_FR_DLV_GRP, v -> v.leftOuterJoin(S0_MM_FR_DLV5).on(S0_M19.bp_grp_cd5.eq(S0_MM_FR_DLV5.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP5.value()).eq(S0_MM_FR_DLV5.bp_grp_typ)))),
				when(boundOr("fr_dlv_grp_flg6"))
					.select(DS0C_FR_DLV_GRP, S0_M19.bp_grp_cd6.as("fr_dlv_grp_cd6"), S0_MM_FR_DLV6.bp_grp_nm.as("fr_dlv_grp_nm6"))
					.view(DS0C_FR_DLV_GRP, v -> v.leftOuterJoin(S0_MM_FR_DLV6).on(S0_M19.bp_grp_cd6.eq(S0_MM_FR_DLV6.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP6.value()).eq(S0_MM_FR_DLV6.bp_grp_typ)))),
				when(boundOr("fr_dlv_grp_flg7"))
					.select(DS0C_FR_DLV_GRP, S0_M19.bp_grp_cd7.as("fr_dlv_grp_cd7"), S0_MM_FR_DLV7.bp_grp_nm.as("fr_dlv_grp_nm7"))
					.view(DS0C_FR_DLV_GRP, v -> v.leftOuterJoin(S0_MM_FR_DLV7).on(S0_M19.bp_grp_cd7.eq(S0_MM_FR_DLV7.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP7.value()).eq(S0_MM_FR_DLV7.bp_grp_typ)))),
				when(boundOr("fr_dlv_grp_flg8"))
					.select(DS0C_FR_DLV_GRP, S0_M19.bp_grp_cd8.as("fr_dlv_grp_cd8"), S0_MM_FR_DLV8.bp_grp_nm.as("fr_dlv_grp_nm8"))
					.view(DS0C_FR_DLV_GRP, v -> v.leftOuterJoin(S0_MM_FR_DLV8).on(S0_M19.bp_grp_cd8.eq(S0_MM_FR_DLV8.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP8.value()).eq(S0_MM_FR_DLV8.bp_grp_typ)))),
				when(boundOr("fr_dlv_grp_flg9"))
					.select(DS0C_FR_DLV_GRP, S0_M19.bp_grp_cd9.as("fr_dlv_grp_cd9"), S0_MM_FR_DLV9.bp_grp_nm.as("fr_dlv_grp_nm9"))
					.view(DS0C_FR_DLV_GRP, v -> v.leftOuterJoin(S0_MM_FR_DLV9).on(S0_M19.bp_grp_cd9.eq(S0_MM_FR_DLV9.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP9.value()).eq(S0_MM_FR_DLV9.bp_grp_typ)))),
				when(boundOr("fr_dlv_grp_flg10"))
					.select(DS0C_FR_DLV_GRP, S0_M19.bp_grp_cd10.as("fr_dlv_grp_cd10"), S0_MM_FR_DLV10.bp_grp_nm.as("fr_dlv_grp_nm10"))
					.view(DS0C_FR_DLV_GRP, v -> v.leftOuterJoin(S0_MM_FR_DLV10).on(S0_M19.bp_grp_cd10.eq(S0_MM_FR_DLV10.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP10.value()).eq(S0_MM_FR_DLV10.bp_grp_typ)))),
				when(boundOr("fr_cst_grp_flg1"))
					.select(DS0C_FR_CST_GRP, S0_M20.bp_grp_cd1.as("fr_cst_grp_cd1"), S0_MM_FR_CST1.bp_grp_nm.as("fr_cst_grp_nm1"))
					.view(DS0C_FR_CST_GRP, v -> v.leftOuterJoin(S0_MM_FR_CST1).on(S0_M20.bp_grp_cd1.eq(S0_MM_FR_CST1.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP1.value()).eq(S0_MM_FR_CST1.bp_grp_typ)))),
				when(boundOr("fr_cst_grp_flg2"))
					.select(DS0C_FR_CST_GRP, S0_M20.bp_grp_cd2.as("fr_cst_grp_cd2"), S0_MM_FR_CST2.bp_grp_nm.as("fr_cst_grp_nm2"))
					.view(DS0C_FR_CST_GRP, v -> v.leftOuterJoin(S0_MM_FR_CST2).on(S0_M20.bp_grp_cd2.eq(S0_MM_FR_CST2.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP2.value()).eq(S0_MM_FR_CST2.bp_grp_typ)))),
				when(boundOr("fr_cst_grp_flg3"))
					.select(DS0C_FR_CST_GRP, S0_M20.bp_grp_cd3.as("fr_cst_grp_cd3"), S0_MM_FR_CST3.bp_grp_nm.as("fr_cst_grp_nm3"))
					.view(DS0C_FR_CST_GRP, v -> v.leftOuterJoin(S0_MM_FR_CST3).on(S0_M20.bp_grp_cd3.eq(S0_MM_FR_CST3.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP3.value()).eq(S0_MM_FR_CST3.bp_grp_typ)))),
				when(boundOr("fr_cst_grp_flg4"))
					.select(DS0C_FR_CST_GRP, S0_M20.bp_grp_cd4.as("fr_cst_grp_cd4"), S0_MM_FR_CST4.bp_grp_nm.as("fr_cst_grp_nm4"))
					.view(DS0C_FR_CST_GRP, v -> v.leftOuterJoin(S0_MM_FR_CST4).on(S0_M20.bp_grp_cd4.eq(S0_MM_FR_CST4.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP4.value()).eq(S0_MM_FR_CST4.bp_grp_typ)))),
				when(boundOr("fr_cst_grp_flg5"))
					.select(DS0C_FR_CST_GRP, S0_M20.bp_grp_cd5.as("fr_cst_grp_cd5"), S0_MM_FR_CST5.bp_grp_nm.as("fr_cst_grp_nm5"))
					.view(DS0C_FR_CST_GRP, v -> v.leftOuterJoin(S0_MM_FR_CST5).on(S0_M20.bp_grp_cd5.eq(S0_MM_FR_CST5.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP5.value()).eq(S0_MM_FR_CST5.bp_grp_typ)))),
				when(boundOr("fr_cst_grp_flg6"))
					.select(DS0C_FR_CST_GRP, S0_M20.bp_grp_cd6.as("fr_cst_grp_cd6"), S0_MM_FR_CST6.bp_grp_nm.as("fr_cst_grp_nm6"))
					.view(DS0C_FR_CST_GRP, v -> v.leftOuterJoin(S0_MM_FR_CST6).on(S0_M20.bp_grp_cd6.eq(S0_MM_FR_CST6.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP6.value()).eq(S0_MM_FR_CST6.bp_grp_typ)))),
				when(boundOr("fr_cst_grp_flg7"))
					.select(DS0C_FR_CST_GRP, S0_M20.bp_grp_cd7.as("fr_cst_grp_cd7"), S0_MM_FR_CST7.bp_grp_nm.as("fr_cst_grp_nm7"))
					.view(DS0C_FR_CST_GRP, v -> v.leftOuterJoin(S0_MM_FR_CST7).on(S0_M20.bp_grp_cd7.eq(S0_MM_FR_CST7.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP7.value()).eq(S0_MM_FR_CST7.bp_grp_typ)))),
				when(boundOr("fr_cst_grp_flg8"))
					.select(DS0C_FR_CST_GRP, S0_M20.bp_grp_cd8.as("fr_cst_grp_cd8"), S0_MM_FR_CST8.bp_grp_nm.as("fr_cst_grp_nm8"))
					.view(DS0C_FR_CST_GRP, v -> v.leftOuterJoin(S0_MM_FR_CST8).on(S0_M20.bp_grp_cd8.eq(S0_MM_FR_CST8.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP8.value()).eq(S0_MM_FR_CST8.bp_grp_typ)))),
				when(boundOr("fr_cst_grp_flg9"))
					.select(DS0C_FR_CST_GRP, S0_M20.bp_grp_cd9.as("fr_cst_grp_cd9"), S0_MM_FR_CST9.bp_grp_nm.as("fr_cst_grp_nm9"))
					.view(DS0C_FR_CST_GRP, v -> v.leftOuterJoin(S0_MM_FR_CST9).on(S0_M20.bp_grp_cd9.eq(S0_MM_FR_CST9.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP9.value()).eq(S0_MM_FR_CST9.bp_grp_typ)))),
				when(boundOr("fr_cst_grp_flg10"))
					.select(DS0C_FR_CST_GRP, S0_M20.bp_grp_cd10.as("fr_cst_grp_cd10"), S0_MM_FR_CST10.bp_grp_nm.as("fr_cst_grp_nm10"))
					.view(DS0C_FR_CST_GRP, v -> v.leftOuterJoin(S0_MM_FR_CST10).on(S0_M20.bp_grp_cd10.eq(S0_MM_FR_CST10.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP10.value()).eq(S0_MM_FR_CST10.bp_grp_typ))))
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
							m.itm_typ,
							m.itm_typ_d_cd,
							m.sno1_mng_typ,
							m.sno2_mng_typ,
							m.sno3_mng_typ,
							m.sno4_mng_typ,
							m.unit_cd
						))
						.addMap((r, m) -> {
							r.setStringNE("itm_nm", m.itm_nm());
							r.setStringNE("sno1_mng_typ", m.sno1_mng_typ());
							r.setStringNE("sno2_mng_typ", m.sno2_mng_typ());
							r.setStringNE("sno3_mng_typ", m.sno3_mng_typ());
							r.setStringNE("sno4_mng_typ", m.sno4_mng_typ());
							r.setStringNE("base_unit_cd", m.unit_cd());
							r.setNumberNE("base_unit_dec_place", m.dec_place());
							r.setStringNE("itm_typ", m.itm_typ());
							r.setStringNE("itm_typ_d_cd", m.itm_typ_d_cd());
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
						.add(MAM_LOC_R.class, r -> toCondition(
							r.getStringNE("dmnd_loc_cd")
						))
						.addSelect(m -> toArray(
							m.lg_grp_cd,
							m.loc_grp_cd,
							m.loc_nm,
							m.site_cd,
							m.wg_cd
						))
						.addMap((r, m) -> {
							r.setStringNE("dmnd_loc_nm", m.loc_nm());
							r.setStringNE("dmnd_loc_grp_cd", m.loc_grp_cd());
							r.setStringNE("dmnd_lg_grp_cd", m.lg_grp_cd());
							r.setStringNE("dmnd_wg_cd", m.wg_cd());
							r.setStringNE("dmnd_site_cd", m.site_cd());
					}),
					j -> j
						.add(MAM_WG_R.class, r -> toCondition(
							r.getStringNE("dmnd_wg_cd")
						))
						.addSelect(m -> toArray(
							m.wg_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("dmnd_wg_nm", m.wg_nm());
					}),
					j -> j
						.add(MAM_CUR_R.class, r -> toCondition(
							r.getStringNE("to_cur_cd")
						))
						.addSelect(m -> toArray(
							m.cur_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("to_cur_nm", m.cur_nm());
					}),
					j -> j
						.add(MAM_SPLN_ITM_R.class, r -> toCondition(
							r.getStringNE("to_spln_itm_cd")
						))
						.addSelect(m -> toArray(
							m.spln_itm_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("to_spln_itm_nm", m.spln_itm_nm());
					}),
					j -> j
						.add(MAM_BP_R.class, r -> toCondition(
							r.getStringNE("to_dlv_cd")
						))
						.addSelect(m -> toArray(
							m.bp_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("to_dlv_nm", m.bp_nm());
					}),
					j -> j
						.add(MAM_BP_R.class, r -> toCondition(
							r.getStringNE("to_cst_cd")
						))
						.addSelect(m -> toArray(
							m.bp_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("to_cst_nm", m.bp_nm());
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
						.add(MAM_LOC_GRP_R.class, r -> toCondition(
							r.getStringNE("dmnd_loc_grp_cd")
						))
						.addSelect(m -> toArray(
							m.loc_grp_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("dmnd_loc_grp_nm", m.loc_grp_nm());
					}),
					j -> j
						.add(MAM_LG_GRP_R.class, r -> toCondition(
							r.getStringNE("dmnd_lg_grp_cd")
						))
						.addSelect(m -> toArray(
							m.lg_grp_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("dmnd_lg_grp_nm", m.lg_grp_nm());
					}),
					j -> j
						.add(MAM_SITE_R.class, r -> toCondition(
							r.getStringNE("dmnd_site_cd")
						))
						.addSelect(m -> toArray(
							m.site_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("dmnd_site_nm", m.site_nm());
					}),
					j -> j
						.add(MAM_USR_R.class, r -> toCondition(
							r.getStringNE("to_dmnd_usr_cd")
						))
						.addSelect(m -> toArray(
							m.usr_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("to_dmnd_usr_nm", m.usr_nm());
					}),
					j -> j
						.add(MAM_CUR_R.class, r -> toCondition(
							r.getStringNE("fr_cur_cd")
						))
						.addSelect(m -> toArray(
							m.cur_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("fr_cur_nm", m.cur_nm());
					}),
					j -> j
						.add(MAM_SPLN_ITM_R.class, r -> toCondition(
							r.getStringNE("fr_spln_itm_cd")
						))
						.addSelect(m -> toArray(
							m.spln_itm_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("fr_spln_itm_nm", m.spln_itm_nm());
					}),
					j -> j
						.add(MAM_BP_R.class, r -> toCondition(
							r.getStringNE("fr_dlv_cd")
						))
						.addSelect(m -> toArray(
							m.bp_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("fr_dlv_nm", m.bp_nm());
					}),
					j -> j
						.add(MAM_BP_R.class, r -> toCondition(
							r.getStringNE("fr_cst_cd")
						))
						.addSelect(m -> toArray(
							m.bp_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("fr_cst_nm", m.bp_nm());
					}),
					j -> j
						.add(MAM_USR_R.class, r -> toCondition(
							r.getStringNE("fr_dmnd_usr_cd")
						))
						.addSelect(m -> toArray(
							m.usr_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("fr_dmnd_usr_nm", m.usr_nm());
					})
				)
			);
	}
}