package mcframe.serverMSBF.MSBFL0100;

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
	 * -- MSBFL0100_MST_MRKT_JUDG_Query_S01
	 */
	static MCQueryPlan MSBFL0100_MST_MRKT_JUDG_S01() {
		MST_MRKT_JUDG_R S0_T1 = MST_MRKT_JUDG_R.create("T1");
		MCTempView S0_V1 = createTempView("V1");
		MAM_ITM_R S0_M1 = MAM_ITM_R.create("M1");
		MAM_ITM_SITE_R S0_M2 = MAM_ITM_SITE_R.create("M2");
		MAM_USR_R S0_M4 = MAM_USR_R.create("M4");
		MAM_DPT_R S0_M5 = MAM_DPT_R.create("M5");
		MAM_ITM_TYP_D_R S0_M6 = MAM_ITM_TYP_D_R.create("M6");
		MAM_DPT_R S0_M9 = MAM_DPT_R.create("M9");
		MAVM_APRV_USR_R S0_M10 = MAVM_APRV_USR_R.create("M10");
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
		MST_LOT_R S1_T2 = MST_LOT_R.create("T2");
		MAVM_APRV_USR_R S2_M11 = MAVM_APRV_USR_R.create("M11");
		
		MCDynamicSQLID DS0C_ITM_GRP = createDynamicSQLID("DS0C_ITM_GRP");
		
		return createQueryPlan()
			.setQuery(
				sql("MSBFL0100_MST_MRKT_JUDG_Query_S01")
					.mainQuery()
					.select(
						MSC_MRKT_JUDG_STS_TYP$IS_ACPT(S0_T1.mrkt_judg_sts_typ).as("acpt_flg"),
						MSC_MRKT_JUDG_STS_TYP$IS_NOT_ACPT(S0_T1.mrkt_judg_sts_typ).as("not_acpt_flg"),
						S0_T1.mrkt_judg_no,
						S0_T1.mrkt_judg_sts_typ,
						S0_T1.itm_cd,
						S0_T1.itm_sub1,
						S0_T1.itm_sub2,
						S0_T1.itm_sub3,
						S0_T1.lot_no,
						S0_T1.site_cd,
						S0_T1.upd_dt,
						S0_T1.upd_usr_cd.as("mrkt_upd_usr_cd"),
						S0_T1.upd_dpt_cd.as("mrkt_upd_dpt_cd"),
						S0_M9.dpt_nm.as("mrkt_upd_dpt_nm"),
						S0_T1.base_unit_cd,
						S0_T1.base_unit_qty,
						S0_V1.pr("vld_dt"),
						cases()
							.when(S0_T1.mrkt_judg_sts_typ.eq(value(MSC_MRKT_JUDG_STS_TYP.OPN.value())))
								.then(S0_M10.main_flg)
							.otherwise(S0_T1.main_flg).as("main_flg"),
						S0_T1.mrkt_judg_prnt_flg,
						S0_T1.mrkt_judg_prnt_tm,
						S0_T1.judg_dt,
						S0_T1.judg_usr_cd,
						S0_T1.judg_dpt_cd,
						S0_M5.dpt_nm.as("judg_dpt_nm"),
						S0_T1.judg_rsn,
						S0_T1.intr_rmrks,
						S0_T1.mfg_so_aprv_typ,
						S0_T1.quality_mng_typ,
						S0_T1.mfg_mng_typ,
						S0_T1.deviant_typ,
						S0_T1.deviant_msr_typ,
						S0_T1.prod_itm_info_typ,
						S0_T1.chd_itm_info_typ,
						S0_T1.no_del_flg,
						S0_T1.add_flg,
						S0_T1.sub_char1,
						S0_T1.sub_char2,
						S0_T1.sub_char3,
						S0_T1.ins_usr_id,
						S0_T1.ins_usr_nm,
						S0_T1.ins_func_id,
						S0_T1.ins_ts,
						S0_T1.upd_usr_id,
						S0_T1.upd_usr_nm,
						S0_T1.upd_func_id,
						S0_T1.upd_ts,
						S0_T1.upd_srv_req_no,
						S0_T1.upd_cntr,
						addDynamicSelect(DS0C_ITM_GRP)
					)
					.from(
						S0_T1
						.leftOuterJoin(
							subQuery()
							.select(
								S1_T2.itm_cd,
								S1_T2.itm_sub1,
								S1_T2.itm_sub2,
								S1_T2.itm_sub3,
								S1_T2.lot_no,
								min(S1_T2.vld_dt).as("vld_dt")
							)
							.from(S1_T2)
							.groupBy(
								S1_T2.itm_cd,
								S1_T2.itm_sub1,
								S1_T2.itm_sub2,
								S1_T2.itm_sub3,
								S1_T2.lot_no
							).view(S0_V1)
						).on(
							bracket(
								S0_T1.itm_cd.eq(S0_V1.pr(S1_T2.itm_cd))
								.and(S0_T1.itm_sub1.eq(S0_V1.pr(S1_T2.itm_sub1)))
								.and(S0_T1.itm_sub2.eq(S0_V1.pr(S1_T2.itm_sub2)))
								.and(S0_T1.itm_sub3.eq(S0_V1.pr(S1_T2.itm_sub3)))
								.and(S0_T1.lot_no.eq(S0_V1.pr(S1_T2.lot_no)))
							)
						)
						.leftOuterJoin(S0_M5).on(
							bracket(
								S0_T1.judg_dpt_cd.eq(S0_M5.dpt_cd)
								.and(S0_T1.judg_dt.gte(S0_M5.st_dt))
								.and(S0_T1.judg_dt.lte(S0_M5.end_dt))
							)
						)
						.leftOuterJoin(S0_M9).on(
							bracket(
								S0_T1.upd_dpt_cd.eq(S0_M9.dpt_cd)
								.and(S0_T1.upd_dt.gte(S0_M9.st_dt))
								.and(S0_T1.upd_dt.lte(S0_M9.end_dt))
							)
						)
						.leftOuterJoin(S0_M10).on(
							bracket(
								S0_T1.mrkt_judg_role_cd.eq(S0_M10.aprv_role_cd)
								.and(S0_M10.usr_cd.eq(bind("tmp_login_usr_id")))
								.and(S0_M10.st_dt.lte(bind("tmp_today")))
								.and(
									S0_M10.end_dt.gte(bind("tmp_today"))
									.or(S0_M10.end_dt.isNull())
								)
							)
						)
						.addDynamicView()
						.addDynamicView(DS0C_ITM_GRP)
					)
					.where(
						value(0).eq(value(0))
						.and(
							value(true).eq(value(false))
							.cutoff$or(S0_T1.mrkt_judg_sts_typ.eq(bind("tmp_mrkt_judg_sts_typ_opn")))
							.cutoff$or(S0_T1.mrkt_judg_sts_typ.eq(bind("tmp_mrkt_judg_sts_typ_acpt")))
							.cutoff$or(S0_T1.mrkt_judg_sts_typ.eq(bind("tmp_mrkt_judg_sts_typ_not_acpt")))
						)
						.cutoff$and(S0_T1.judg_dt.gte(bind("judg_dt_fr")))
						.cutoff$and(S0_T1.judg_dt.lte(bind("judg_dt_to")))
						.cutoff$and(S0_T1.upd_ts.gte(bind("upd_ts_fr")))
						.cutoff$and(S0_T1.upd_ts.lte(bind("upd_ts_to")))
						.cutoff$and(S0_T1.itm_cd.like(bind("itm_cd")))
						.cutoff$and(S0_T1.itm_sub1.like(bind("itm_sub1")))
						.cutoff$and(S0_T1.itm_sub2.like(bind("itm_sub2")))
						.cutoff$and(S0_T1.itm_sub3.like(bind("itm_sub3")))
						.addDynamicPredicate()
						.cutoff$and(S0_T1.lot_no.like(bind("lot_no")))
						.cutoff$and(S0_V1.pr("vld_dt").gte(bind("vld_dt_fr")))
						.cutoff$and(S0_V1.pr("vld_dt").lte(bind("vld_dt_to")))
						.cutoff$and(S0_T1.mrkt_judg_no.like(bind("mrkt_judg_no")))
						.cutoff$and(S0_T1.judg_usr_cd.like(bind("judg_usr_cd")))
						.cutoff$and(S0_T1.judg_dpt_cd.like(bind("judg_dpt_cd")))
						.cutoff$and(S0_M5.dpt_nm.like(bind("judg_dpt_nm")))
						.cutoff$and(S0_T1.mfg_so_aprv_typ.like(bind("mfg_so_aprv_typ")))
						.cutoff$and(S0_T1.quality_mng_typ.like(bind("quality_mng_typ")))
						.cutoff$and(S0_T1.mfg_mng_typ.like(bind("mfg_mng_typ")))
						.cutoff$and(S0_T1.deviant_typ.like(bind("deviant_typ")))
						.cutoff$and(S0_T1.deviant_msr_typ.like(bind("deviant_msr_typ")))
						.cutoff$and(S0_T1.prod_itm_info_typ.like(bind("prod_itm_info_typ")))
						.cutoff$and(S0_T1.chd_itm_info_typ.like(bind("chd_itm_info_typ")))
						.cutoff$and(
							bind("tmp_not_input_flg_cutoff").eq(value(true))
							.and(
								S0_T1.mfg_so_aprv_typ.isNull()
								.or(S0_T1.quality_mng_typ.isNull())
								.or(S0_T1.mfg_mng_typ.isNull())
								.or(S0_T1.deviant_typ.isNull())
								.or(S0_T1.prod_itm_info_typ.isNull()
									.or(S0_T1.prod_itm_info_typ.eq(value(MSC_PROD_ITM_INFO_TYP.EXIST.value()))
										.and(S0_T1.intr_rmrks.isNull())))
								.or(S0_T1.chd_itm_info_typ.isNull()
									.or(S0_T1.chd_itm_info_typ.eq(value(MSC_CHD_ITM_INFO_TYP.EXIST.value()))
										.and(S0_T1.intr_rmrks.isNull())))
							)
						)
						.cutoff$and(
							bind("tmp_input_flg_cutoff").eq(value(true))
							.and(S0_T1.mfg_so_aprv_typ.isNotNull())
							.and(S0_T1.quality_mng_typ.isNotNull())
							.and(S0_T1.mfg_mng_typ.isNotNull())
							.and(S0_T1.deviant_typ.isNotNull())
							.and(S0_T1.prod_itm_info_typ.eq(value(MSC_PROD_ITM_INFO_TYP.NO_EXIST.value()))	
								.or(S0_T1.prod_itm_info_typ.eq(value(MSC_PROD_ITM_INFO_TYP.EXIST.value()))
									.and(S0_T1.intr_rmrks.isNotNull())))
							.and(S0_T1.chd_itm_info_typ.eq(value(MSC_CHD_ITM_INFO_TYP.NO_EXIST.value()))
								.or(S0_T1.chd_itm_info_typ.eq(value(MSC_CHD_ITM_INFO_TYP.EXIST.value()))
									.and(S0_T1.intr_rmrks.isNotNull())))
						)
						.cutoff$and(S0_T1.mrkt_judg_prnt_flg.eq(bind("tmp_mrkt_judg_flg_cutoff")))
						.cutoff$and(S0_T1.intr_rmrks.like(bind("intr_rmrks")))
						.cutoff$and(S0_T1.sub_char1.like(bind("sub_char1")))
						.cutoff$and(S0_T1.sub_char2.like(bind("sub_char2")))
						.cutoff$and(S0_T1.sub_char3.like(bind("sub_char3")))
						.and(
							exists(
								subQuery()
								.select(value("X"))
								.from(S2_M11)
								.where(
									value(0).eq(value(0))
									.cutoff$and(
										bind("tmp_not_ope_judg_flg_cutoff").eq(value(true))
										.and(
											S0_T1.mrkt_judg_upd_role_cd.eq(S2_M11.aprv_role_cd)
											.or(S0_T1.mrkt_judg_role_cd.eq(S2_M11.aprv_role_cd))
										)
									)
									.cutoff$and(
										bind("tmp_ope_judg_flg_cutoff").eq(value(true))
										.and(S0_T1.mrkt_judg_role_cd.eq(S2_M11.aprv_role_cd))
									)
									.and(S2_M11.usr_cd.eq(bind("tmp_login_usr_id")))
									.and(S2_M11.st_dt.lte(bind("tmp_today")))
									.and(
										S2_M11.end_dt.gte(bind("tmp_today"))
										.or(S2_M11.end_dt.isNull())
									)
									.cutoff$and(S2_M11.main_flg.eq(bind("tmp_main_flg_cutoff")))
								)
							)
						)
						.addDynamicPredicate(DS0C_ITM_GRP)
					)
					.orderBy(S0_T1.mrkt_judg_no.asc())
			)
			.setDynamicSQLInfo(
				when(boundOr("itm_typ_d_nm", "itm_grp_flg1", "itm_grp_flg2", "itm_grp_flg3", "itm_grp_flg4", "itm_grp_flg5", "itm_grp_flg6", "itm_grp_flg7", "itm_grp_flg8", "itm_grp_flg9", "itm_grp_flg10", "itm_nm", "itm_typ", "itm_typ_d_cd"))
					.view(v -> v.leftOuterJoin(S0_M1).on(bracket(S0_T1.itm_cd.eq(S0_M1.itm_cd).and(S0_T1.itm_sub1.eq(S0_M1.itm_sub1)).and(S0_T1.itm_sub2.eq(S0_M1.itm_sub2)).and(S0_T1.itm_sub3.eq(S0_M1.itm_sub3)))))
					.predicate(p -> p.cutoff$and(S0_M1.itm_nm.like(bind("itm_nm"))).cutoff$and(S0_M1.itm_typ.like(bind("itm_typ"))).cutoff$and(S0_M1.itm_typ_d_cd.like(bind("itm_typ_d_cd")))),
				when(boundOr("ntfy_nm"))
					.view(v -> v.leftOuterJoin(S0_M2).on(bracket(S0_T1.itm_cd.eq(S0_M2.itm_cd).and(S0_T1.itm_sub1.eq(S0_M2.itm_sub1)).and(S0_T1.itm_sub2.eq(S0_M2.itm_sub2)).and(S0_T1.itm_sub3.eq(S0_M2.itm_sub3)).and(S0_T1.site_cd.eq(S0_M2.site_cd)))))
					.predicate(p -> p.cutoff$and(S0_M2.ntfy_nm.like(bind("ntfy_nm")))),
				when(boundOr("judg_usr_nm"))
					.view(v -> v.leftOuterJoin(S0_M4).on(bracket(S0_T1.judg_usr_cd.eq(S0_M4.usr_cd))))
					.predicate(p -> p.cutoff$and(S0_M4.usr_nm.like(bind("judg_usr_nm")))),
				when(boundOr("itm_typ_d_nm"))
					.view(v -> v.leftOuterJoin(S0_M6).on(bracket(S0_M1.itm_typ.eq(S0_M6.itm_typ).and(S0_M1.itm_typ_d_cd.eq(S0_M6.itm_typ_d_cd)))))
					.predicate(p -> p.cutoff$and(S0_M6.itm_typ_d_nm.like(bind("itm_typ_d_nm")))),
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
						.add(MAM_ITM_R.class, r -> toCondition(
							r.getStringNE("itm_cd"),
							r.getStringNE("itm_sub1"),
							r.getStringNE("itm_sub2"),
							r.getStringNE("itm_sub3")
						))
						.addSelect(m -> toArray(
							m.itm_nm,
							m.itm_typ,
							m.itm_typ_d_cd,
							m.lot_mng_typ,
							m.sublot_mng_typ,
							m.dec_place
						))
						.addMap((r, m) -> {
							r.setStringNE("itm_nm", m.itm_nm());
							r.setStringNE("lot_mng_typ", m.lot_mng_typ());
							r.setStringNE("sublot_mng_typ", m.sublot_mng_typ());
							r.setStringNE("itm_typ", m.itm_typ());
							r.setStringNE("itm_typ_d_cd", m.itm_typ_d_cd());
							r.setNumberNE("base_unit_dec_place", m.dec_place());
					}),
					j -> j
						.add(MAM_ITM_SITE_R.class, r -> toCondition(
							r.getStringNE("itm_cd"),
							r.getStringNE("itm_sub1"),
							r.getStringNE("itm_sub2"),
							r.getStringNE("itm_sub3"),
							r.getStringNE("site_cd")
						))
						.addSelect(m -> toArray(
							m.ntfy_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("ntfy_nm", m.ntfy_nm());
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
						.add(MAM_USR_R.class, r -> toCondition(
							r.getStringNE("judg_usr_cd")
						))
						.addSelect(m -> toArray(
							m.usr_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("judg_usr_nm", m.usr_nm());
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
						.add(MAM_USR_R.class, r -> toCondition(
							r.getStringNE("mrkt_upd_usr_cd")
						))
						.addSelect(m -> toArray(
							m.usr_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("mrkt_upd_usr_nm", m.usr_nm());
					})
				)
			);
	}
}