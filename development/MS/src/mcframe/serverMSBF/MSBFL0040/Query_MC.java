package mcframe.serverMSBF.MSBFL0040;

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
	 * -- MSBFL0040_MST_INSP_INST_Query_S01
	 */
	static MCQueryPlan MSBFL0040_MST_INSP_INST_S01() {
		MST_INSP_INST_R S0_T1 = MST_INSP_INST_R.create("T1");
		MAM_ITM_R S0_M1 = MAM_ITM_R.create("M1");
		MST_LOT_R S0_T2 = MST_LOT_R.create("T2");
		MAM_DPT_R S0_M8 = MAM_DPT_R.create("M8");
		MAM_DPT_R S0_M9 = MAM_DPT_R.create("M9");
		MAM_LOC_R S0_M10 = MAM_LOC_R.create("M10");
		MCTempView S0_V3 = createTempView("V3");
		MST_INSP_SCHD_R S1_T4 = MST_INSP_SCHD_R.create("T4");
		MAVM_RD_LOC_R S1_V1 = MAVM_RD_LOC_R.create("V1");
		MST_INSP_SCHD_R S1_T3 = MST_INSP_SCHD_R.create("T3");
		MAVM_APRV_USR_R S2_V2 = MAVM_APRV_USR_R.create("V2");
		MAVM_RD_LOC_R S3_V1 = MAVM_RD_LOC_R.create("V1");
		MST_INSP_SCHD_R S3_T3 = MST_INSP_SCHD_R.create("T3");
		MAVM_APRV_USR_R S4_V2 = MAVM_APRV_USR_R.create("V2");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBFL0040_MST_INSP_INST_Query_S01")
					.mainQuery()
					.select(
						S0_T1.insp_no,
						S0_T1.insp_freq,
						S0_T1.insp_sts_typ,
						S0_T1.insp_typ,
						S0_T1.lmt_up_flg,
						S0_V3.pr("in_prmt_insp_flg"),
						S0_T1.itm_cd,
						S0_T1.itm_sub1,
						S0_T1.itm_sub2,
						S0_T1.itm_sub3,
						nvl(
							S0_T1.itm_nm,
							S0_M1.itm_nm
						).as("itm_nm"),
						S0_T2.ver_no,
						S0_T1.lot_no,
						S0_T1.sublot_no,
						S0_T1.bp_lot_no,
						nullValue().as("loc_cd"),
						nullValue().as("loc_nm"),
						S0_T1.to_site_cd,
						S0_T1.mfg_loc_cd,
						S0_M10.loc_nm.as("mfg_loc_nm"),
						S0_T1.sppl_cd,
						S0_T1.maker_cd,
						S0_T1.master_dt,
						S0_T1.inst_dt,
						trunc(
							S0_T1.st_tm,
							MCDateFmt.DD
						).as("st_dt"),
						S0_T1.st_tm.as("st_hm"),
						trunc(
							S0_T1.end_tm,
							MCDateFmt.DD
						).as("end_dt"),
						S0_T1.end_tm.as("end_hm"),
						S0_T1.insp_ptn_cd,
						S0_T1.insp_mtd_typ,
						S0_T1.insp_std_no,
						S0_T1.std_req_flg,
						S0_T1.std_cnf_req_flg,
						S0_T1.plnt_aprv_flg,
						S0_T1.base_unit_qty,
						S0_T1.base_unit_cd,
						S0_T1.inst_usr_cd,
						S0_T1.inst_dpt_cd,
						S0_M8.dpt_nm.as("inst_dpt_nm"),
						S0_T1.insp_aprv_flg,
						S0_T1.insp_aprv_sts_typ,
						S0_T1.aprv_dt,
						S0_T1.aprv_tm,
						S0_T1.aprv_usr_cd,
						S0_T1.aprv_dpt_cd,
						S0_M9.dpt_nm.as("aprv_dpt_nm"),
						S0_T1.aprv_rsn,
						S0_T1.intr_rmrks,
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
						S0_M1.dec_place.as("base_dec_place"),
						S0_T1.lims_flg.as("tmp_last_lims_flg")
					)
					.from(
						S0_T1
						.leftOuterJoin(S0_M1).on(
							bracket(
								S0_T1.itm_cd.eq(S0_M1.itm_cd)
								.and(S0_T1.itm_sub1.eq(S0_M1.itm_sub1))
								.and(S0_T1.itm_sub2.eq(S0_M1.itm_sub2))
								.and(S0_T1.itm_sub3.eq(S0_M1.itm_sub3))
							)
						)
						.leftOuterJoin(S0_T2).on(
							bracket(
								S0_T1.itm_cd.eq(S0_T2.itm_cd)
								.and(S0_T1.itm_sub1.eq(S0_T2.itm_sub1))
								.and(S0_T1.itm_sub2.eq(S0_T2.itm_sub2))
								.and(S0_T1.itm_sub3.eq(S0_T2.itm_sub3))
								.and(S0_T1.lot_no.eq(S0_T2.lot_no))
								.and(
									bracket(
										MAC_STR$IS_NULL_VAL(S0_T1.sublot_no).eq(value(true))
										.and(
											S0_M1.sublot_mng_typ.in(
												value(MAC_SUBLOT_MNG_TYP.NOT_MNG.value()),
												value(MAC_SUBLOT_MNG_TYP.STK.value())
											)
										)
									)
									.or(S0_T2.sublot_no.eq(S0_T1.sublot_no))
								)
							)
						)
						.leftOuterJoin(S0_M8).on(
							bracket(
								S0_T1.inst_dpt_cd.eq(S0_M8.dpt_cd)
								.and(S0_T1.inst_dt.gte(S0_M8.st_dt))
								.and(S0_T1.inst_dt.lte(S0_M8.end_dt))
							)
						)
						.leftOuterJoin(S0_M9).on(
							bracket(
								S0_T1.aprv_dpt_cd.eq(S0_M9.dpt_cd)
								.and(S0_T1.aprv_dt.gte(S0_M9.st_dt))
								.and(S0_T1.aprv_dt.lte(S0_M9.end_dt))
							)
						)
						.leftOuterJoin(S0_M10).on(
								bracket(
									S0_T1.mfg_loc_cd.eq(S0_M10.loc_cd)
								)
							)
						.leftOuterJoin(
							subQuery()
							.select(
								S1_T4.insp_no,
								max(S1_T4.in_prmt_insp_flg).as("in_prmt_insp_flg")
							)
							.from(S1_T4)
							.groupBy(S1_T4.insp_no).view(S0_V3)
						).on(
							bracket(
								S0_T1.insp_no.eq(S0_V3.pr(S1_T4.insp_no))
							)
						)
					)
					.where(
						value(0).eq(value(0))
						.and(S0_T1.insp_no.eq(bind("insp_no")))
						.and(
							bracket(
								bind("ope_val").eq(value(true))
								.and(
									exists(
										subQuery()
										.select(value("X"))
										.from(
											S1_V1
											.leftOuterJoin(S1_T3).on(
												bracket(
													S0_T1.insp_no.eq(S1_T3.insp_no)
												)
											)
										)
										.where(
											S1_V1.loc_cd.eq(cases()
													.when(S1_T3.insp_typ.eq(value(MSC_INSP_TYP.PRDCT.value())))
														.then(S1_T3.mfg_loc_cd)
													.otherwise(S1_T3.loc_cd)
											)
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
											S2_V2.aprv_role_cd.eq(S0_T1.insp_aprv_role_cd)
											.and(S2_V2.usr_cd.eq(bind("login_usr_cd")))
											.and(S2_V2.st_dt.lte(bind("dt")))
											.and(
												S2_V2.end_dt.isNull()
												.or(S2_V2.end_dt.gte(bind("dt")))
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
											S0_T1.insp_aprv_sts_typ.isNull()
											.or(S0_T1.insp_aprv_sts_typ.neq(value(MSC_INSP_APRV_STS_TYP.INST_ACPT.value())))
										)
										.and(
											exists(
												subQuery()
												.select(value("X"))
												.from(
													S3_V1
													.leftOuterJoin(S3_T3).on(
														bracket(
															S0_T1.insp_no.eq(S3_T3.insp_no)
														)
													)
												)
												.where(
													S3_V1.loc_cd.eq(cases()
															.when(S3_T3.insp_typ.eq(value(MSC_INSP_TYP.PRDCT.value())))
																.then(S3_T3.mfg_loc_cd)
															.otherwise(S3_T3.loc_cd)
													)
												)
											)
										)
									)
									.or(
										S0_T1.insp_aprv_sts_typ.eq(value(MSC_INSP_APRV_STS_TYP.INST_ACPT.value()))
										.and(
											exists(
												subQuery()
												.select(value("X"))
												.from(S4_V2)
												.where(
													S4_V2.aprv_role_cd.eq(S0_T1.insp_aprv_role_cd)
													.and(S4_V2.usr_cd.eq(bind("login_usr_cd")))
													.and(S4_V2.st_dt.lte(bind("dt")))
													.and(
														S4_V2.end_dt.isNull()
														.or(S4_V2.end_dt.gte(bind("dt")))
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
						.add(MAM_BP_R.class, r -> toCondition(
							r.getStringNE("maker_cd")
						))
						.addSelect(m -> toArray(
							m.bp_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("maker_nm", m.bp_nm());
					}),
					j -> j
						.add(MAM_INSP_PTN_R.class, r -> toCondition(
							r.getStringNE("insp_ptn_cd")
						))
						.addSelect(m -> toArray(
							m.insp_ptn_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("insp_ptn_nm", m.insp_ptn_nm());
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
							r.getStringNE("inst_usr_cd")
						))
						.addSelect(m -> toArray(
							m.usr_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("inst_usr_nm", m.usr_nm());
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
	 * -- MSBFL0040_MST_INSP_SCHD_Query_S01
	 */
	static MCQueryPlan MSBFL0040_MST_INSP_SCHD_S01() {
		MST_INSP_SCHD_R S0_T1 = MST_INSP_SCHD_R.create("T1");
		MAM_ITM_R S0_M1 = MAM_ITM_R.create("M1");
		MST_LOT_R S0_T2 = MST_LOT_R.create("T2");
		MAVM_RD_LOC_R S0_M5 = MAVM_RD_LOC_R.create("M5");
		MAM_SUNDRY_ITM_R S0_M6 = MAM_SUNDRY_ITM_R.create("M6");
		MAVM_RD_LOC_R S1_V1 = MAVM_RD_LOC_R.create("V1");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBFL0040_MST_INSP_SCHD_Query_S01")
					.mainQuery()
					.select(
						S0_T1.insp_schd_no,
						S0_T1.insp_freq,
						S0_T1.insp_schd_sts_typ.as("insp_sts_typ"),
						S0_T1.insp_typ,
						S0_T1.lmt_up_flg,
						S0_T1.in_prmt_insp_flg,
						S0_T1.itm_cd,
						S0_T1.itm_sub1,
						S0_T1.itm_sub2,
						S0_T1.itm_sub3,
						nvl(
							S0_M6.itm_nm,
							S0_M1.itm_nm
						).as("itm_nm"),
						S0_T2.ver_no,
						S0_T1.lot_no,
						S0_T1.sublot_no,
						S0_T1.bp_lot_no,
						S0_T1.loc_cd,
						S0_T1.mfg_loc_cd,
						S0_T1.sppl_cd,
						S0_T1.maker_cd,
						S0_T1.master_dt,
						trunc(
							S0_T1.st_tm,
							MCDateFmt.DD
						).as("st_dt"),
						S0_T1.st_tm.as("st_hm"),
						trunc(
							S0_T1.end_tm,
							MCDateFmt.DD
						).as("end_dt"),
						S0_T1.end_tm.as("end_hm"),
						S0_T1.insp_mtd_typ,
						S0_T1.base_unit_qty,
						S0_T1.base_unit_cd,
						S0_M1.dec_place.as("base_dec_place")
					)
					.from(
						S0_T1
						.leftOuterJoin(S0_M1).on(
							bracket(
								S0_T1.itm_cd.eq(S0_M1.itm_cd)
								.and(S0_T1.itm_sub1.eq(S0_M1.itm_sub1))
								.and(S0_T1.itm_sub2.eq(S0_M1.itm_sub2))
								.and(S0_T1.itm_sub3.eq(S0_M1.itm_sub3))
							)
						)
						.leftOuterJoin(S0_T2).on(
							bracket(
								S0_T1.itm_cd.eq(S0_T2.itm_cd)
								.and(S0_T1.itm_sub1.eq(S0_T2.itm_sub1))
								.and(S0_T1.itm_sub2.eq(S0_T2.itm_sub2))
								.and(S0_T1.itm_sub3.eq(S0_T2.itm_sub3))
								.and(S0_T1.lot_no.eq(S0_T2.lot_no))
								.and(
									bracket(
										MAC_STR$IS_NULL_VAL(S0_T1.sublot_no).eq(value(true))
										.and(
											S0_M1.sublot_mng_typ.in(
												value(MAC_SUBLOT_MNG_TYP.NOT_MNG.value()),
												value(MAC_SUBLOT_MNG_TYP.STK.value())
											)
										)
									)
									.or(S0_T2.sublot_no.eq(S0_T1.sublot_no))
								)
							)
						)
						.innerJoin(S0_M5).on(
							bracket(
								S0_T1.loc_cd.eq(S0_M5.loc_cd)
							)
						)
						.leftOuterJoin(S0_M6).on(
							bracket(
								S0_T1.itm_cd.eq(S0_M6.itm_cd)
								.and(S0_T1.itm_sub1.eq(S0_M6.itm_sub1))
								.and(S0_T1.itm_sub2.eq(S0_M6.itm_sub2))
								.and(S0_T1.itm_sub3.eq(S0_M6.itm_sub3))
								.and(S0_T1.sno1.eq(S0_M6.sno1))
								.and(S0_T1.sno2.eq(S0_M6.sno2))
								.and(S0_T1.sno3.eq(S0_M6.sno3))
								.and(S0_T1.sno4.eq(S0_M6.sno4))
							)
						)
					)
					.where(
						value(0).eq(value(0))
						.and(S0_T1.insp_schd_no.like(bind("insp_schd_no")))
						.and(
							exists(
								subQuery()
								.select(value("X"))
								.from(S1_V1)
								.where(
									S1_V1.loc_cd.eq(cases()
											.when(S0_T1.insp_typ.eq(value(MSC_INSP_TYP.PRDCT.value())))
												.then(S0_T1.mfg_loc_cd)
											.otherwise(S0_T1.loc_cd)
									)
								)
							)
						)
					)
			)
			.setJoinInfo(
				joinInfo(
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
						.add(MAM_BP_R.class, r -> toCondition(
							r.getStringNE("maker_cd")
						))
						.addSelect(m -> toArray(
							m.bp_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("maker_nm", m.bp_nm());
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
							r.getStringNE("loc_cd")
						))
						.addSelect(m -> toArray(
							m.loc_nm,
							m.site_cd
						))
						.addMap((r, m) -> {
							r.setStringNE("loc_nm", m.loc_nm());
							r.setStringNE("to_site_cd", m.site_cd());
					}),
					j -> j
						.add(MAM_LOC_R.class, r -> toCondition(
							r.getStringNE("mfg_loc_cd")
						))
						.addSelect(m -> toArray(
							m.loc_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("mfg_loc_nm", m.loc_nm());
					})
				)
			);
	}
	
	/**
	 * -- MSBFL0040_MST_INSP_SCHD_Query_S02
	 */
	static MCQueryPlan MSBFL0040_MST_INSP_SCHD_S02() {
		MST_INSP_SCHD_R S0_T1 = MST_INSP_SCHD_R.create("T1");
		MAM_LOC_R S0_M3 = MAM_LOC_R.create("M3");
		MAM_ITM_R S0_M6 = MAM_ITM_R.create("M6");
		
		return createQueryPlan()
			.setQuery(
				sql("MSBFL0040_MST_INSP_SCHD_Query_S02")
					.mainQuery()
					.select(
						S0_T1.insp_schd_no,
						S0_T1.pack_unit_qty,
						S0_T1.pack_unit_cd,
						S0_T1.base_unit_qty,
						S0_T1.smpl_schd_qty,
						S0_T1.smpl_inst_qty,
						S0_T1.base_unit_cd,
						S0_T1.loc_cd,
						S0_M3.loc_nm,
						S0_T1.str_ln_cd,
						S0_T1.gd_cd,
						trunc(
							S0_T1.st_tm,
							MCDateFmt.DD
						).as("st_dt"),
						S0_T1.st_tm.as("st_hm"),
						trunc(
							S0_T1.end_tm,
							MCDateFmt.DD
						).as("end_dt"),
						S0_T1.end_tm.as("end_hm"),
						S0_T1.master_dt,
						S0_T1.insp_cnt_rmrks,
						S0_T1.src_no1,
						S0_T1.src_no2,
						S0_T1.src_no3,
						S0_T1.src_no4,
						S0_T1.in_prmt_insp_flg,
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
						S0_T1.itm_cd,
						S0_T1.itm_sub1,
						S0_T1.itm_sub2,
						S0_T1.itm_sub3,
						S0_M6.dec_place.as("base_dec_place")
					)
					.from(
							S0_T1
							.leftOuterJoin(S0_M3).on(
									bracket(
											S0_T1.loc_cd.eq(S0_M3.loc_cd)
									)
							)
							.leftOuterJoin(S0_M6).on(
								bracket(
									S0_T1.itm_cd.eq(S0_M6.itm_cd)
									.and(S0_T1.itm_sub1.eq(S0_M6.itm_sub1))
									.and(S0_T1.itm_sub2.eq(S0_M6.itm_sub2))
									.and(S0_T1.itm_sub3.eq(S0_M6.itm_sub3))
								)
							)
					)
					.where(
						value(0).eq(value(0))
						.cutoff$and(S0_T1.insp_no.eq(bind("insp_no")))
						.cutoff$and(S0_T1.insp_schd_no.eq(bind("insp_schd_no")))
					)
					.orderBy(S0_T1.insp_schd_no.asc())
			)
			.setJoinInfo(
				joinInfo(
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
							r.setNumberNE("pack_dec_place", m.dec_place());
					})
				)
			);
	}
	
	/**
	 * -- MSBFL0040_MST_STD_INSP_INST_Query_S01
	 */
	static MCQueryPlan MSBFL0040_MST_STD_INSP_INST_S01() {
		MST_STD_INSP_INST_R S0_T1 = MST_STD_INSP_INST_R.create("T1");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBFL0040_MST_STD_INSP_INST_Query_S01")
					.mainQuery()
					.select(
						S0_T1.std_insp_inst_no,
						S0_T1.insp_seq,
						S0_T1.insp_point_cd,
						S0_T1.insp_qlqn_typ,
						S0_T1.ql_std_val,
						S0_T1.trd_unit_cd,
						S0_T1.qn_int_digit,
						S0_T1.qn_int_frac,
						S0_T1.qn_out_min,
						S0_T1.sign_out_min_typ,
						S0_T1.qn_in_min,
						S0_T1.sign_in_min_typ,
						S0_T1.sign_in_max_typ,
						S0_T1.qn_in_max,
						S0_T1.sign_out_max_typ,
						S0_T1.qn_out_max,
						S0_T1.intr_rmrks,
						S0_T1.sub_char1,
						S0_T1.sub_char2,
						S0_T1.sub_char3,
						S0_T1.add_point_flg
					)
					.from(S0_T1)
					.where(
						value(0).eq(value(0))
						.and(S0_T1.insp_no.eq(bind("insp_no")))
					)
					.orderBy(S0_T1.insp_seq.asc())
			)
			.setJoinInfo(
				joinInfo(
					j -> j
						.add(MAM_INSP_POINT_R.class, r -> toCondition(
							r.getStringNE("insp_point_cd")
						))
						.addSelect(m -> toArray(
							m.insp_point_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("insp_point_nm", m.insp_point_nm());
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
					})
				)
			);
	}
}