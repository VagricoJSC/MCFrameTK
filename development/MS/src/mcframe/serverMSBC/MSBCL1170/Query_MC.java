package mcframe.serverMSBC.MSBCL1170;

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
	 * -- MSBCL1170_MST_MLY_WIP_Query_S01
	 */
	static MCQueryPlan MSBCL1170_MST_MLY_WIP_S01() {
		MST_MLY_WIP_R S0_T1 = MST_MLY_WIP_R.create("T1");
		MST_ITM_MFG_INST_R S0_T2 = MST_ITM_MFG_INST_R.create("T2");
		MAM_DPT_R S0_M1 = MAM_DPT_R.create("M1");
		MAM_LOC_R S0_M2 = MAM_LOC_R.create("M2");
		MAM_STR_LN_R S0_M3 = MAM_STR_LN_R.create("M3");
		MAM_WG_R S0_M6 = MAM_WG_R.create("M6");
		MAM_SITE_R S0_M7 = MAM_SITE_R.create("M7");
		MAM_LOC_GRP_R S0_M8 = MAM_LOC_GRP_R.create("M8");
		MAM_ITM_R S0_M9 = MAM_ITM_R.create("M9");
		MAM_SUNDRY_ITM_R S0_M10 = MAM_SUNDRY_ITM_R.create("M10");
		MAM_ITM_TYP_D_R S0_M11 = MAM_ITM_TYP_D_R.create("M11");
		MAVM_RD_WG_R S0_V1 = MAVM_RD_WG_R.create("V1");
		MSVT_WRK_SNO_R S0_V2 = MSVT_WRK_SNO_R.create("V2");
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
				sql("MSBCL1170_MST_MLY_WIP_Query_S01")
					.mainQuery()
					.select(
						S0_T1.ym,
						MAPA_LOC$F_GET_ASST_DPT_CD(
							S0_T1.loc_cd,
							bracket(
								addMonths(
									S0_T1.ym,
									value(1)
								).subtractDays(value(1))
							)
						).as("dpt_cd"),
						S0_M1.dpt_nm,
						S0_T1.itm_cd,
						S0_T1.itm_sub1,
						S0_T1.itm_sub2,
						S0_T1.itm_sub3,
						nvl(
							S0_M10.itm_nm,
							S0_M9.itm_nm
						).as("itm_nm"),
						S0_T1.loc_cd,
						S0_T1.str_ln_cd,
						S0_T1.in_xfr_typ,
						S0_T1.quality_typ,
						S0_T1.stk_insp_typ,
						S0_T1.stk_id_typ,
						S0_T1.asst_typ,
						S0_T1.gd_cd,
						S0_T1.lot_no,
						S0_T1.sublot_no,
						S0_T1.sno1,
						S0_T1.sno2,
						S0_T1.sno3,
						S0_T1.sno4,
						S0_T1.base_unit_schd_qty,
						S0_T1.base_unit_act_qty,
						S0_T1.base_unit_wip_qty,
						S0_M9.dec_place,
						S0_T1.wip_rate,
						S0_T1.base_unit_cd,
						S0_T1.st_ac_dt,
						S0_T1.end_ac_dt,
						S0_T1.cmpl_flg,
						S0_T1.closing_flg,
						S0_T2.wg_cd,
						S0_T1.sub_char1,
						S0_T1.sub_char2,
						S0_T1.sub_char3,
						S0_T1.itm_mfg_inst_no,
						S0_T1.mfg_act_no,
						S0_T1.itm_ord_no,
						S0_M9.itm_typ,
						S0_M9.itm_typ_d_cd,
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
						.leftOuterJoin(S0_T2).on(
							bracket(
								S0_T1.itm_mfg_inst_no.eq(S0_T2.itm_mfg_inst_no)
							)
						)
						.leftOuterJoin(S0_M1).on(
							bracket(
								MAPA_LOC$F_GET_ASST_DPT_CD(
									S0_T1.loc_cd,
									bracket(
										addMonths(
											S0_T1.ym,
											value(1)
										).subtractDays(value(1))
									)
								).eq(S0_M1.dpt_cd)
								.and(S0_T1.ym.between(S0_M1.st_dt, S0_M1.end_dt))
							)
						)
						.leftOuterJoin(S0_M9).on(
							bracket(
								S0_T1.itm_cd.eq(S0_M9.itm_cd)
								.and(S0_T1.itm_sub1.eq(S0_M9.itm_sub1))
								.and(S0_T1.itm_sub2.eq(S0_M9.itm_sub2))
								.and(S0_T1.itm_sub3.eq(S0_M9.itm_sub3))
							)
						)
						.leftOuterJoin(S0_M10).on(
							bracket(
								S0_T1.itm_cd.eq(S0_M10.itm_cd)
								.and(S0_T1.itm_sub1.eq(S0_M10.itm_sub1))
								.and(S0_T1.itm_sub2.eq(S0_M10.itm_sub2))
								.and(S0_T1.itm_sub3.eq(S0_M10.itm_sub3))
								.and(S0_T1.sno1.eq(S0_M10.sno1))
								.and(S0_T1.sno2.eq(S0_M10.sno2))
								.and(S0_T1.sno3.eq(S0_M10.sno3))
								.and(S0_T1.sno4.eq(S0_M10.sno4))
							)
						)
						.innerJoin(S0_V1).on(
							bracket(
								S0_V1.wg_cd.eq(S0_T2.wg_cd)
							)
						)
						.addDynamicView()
						.addDynamicView(DS0C_ITM_GRP)
					)
					.where(
						value(0).eq(value(0))
						.cutoff$and(S0_T1.ym.eq(bind("ym")))
						.cutoff$and(S0_T1.st_ac_dt.gte(bind("st_ac_dt_fr")))
						.cutoff$and(S0_T1.st_ac_dt.lte(bind("st_ac_dt_to")))
						.cutoff$and(S0_T1.end_ac_dt.gte(bind("end_ac_dt_fr")))
						.cutoff$and(S0_T1.end_ac_dt.lte(bind("end_ac_dt_to")))
						.cutoff$and(S0_T2.wg_cd.like(bind("wg_cd")))
						.addDynamicPredicate()
						.cutoff$and(
							MAPA_LOC$F_GET_ASST_DPT_CD(
								S0_T1.loc_cd,
								bracket(
									addMonths(
										S0_T1.ym,
										value(1)
									).subtractDays(value(1))
								)
							).like(bind("dpt_cd"))
						)
						.cutoff$and(S0_M1.dpt_nm.like(bind("dpt_nm")))
						.cutoff$and(S0_T1.loc_cd.like(bind("loc_cd")))
						.cutoff$and(S0_T1.str_ln_cd.like(bind("str_ln_cd")))
						.cutoff$and(S0_M9.itm_typ.like(bind("itm_typ")))
						.cutoff$and(S0_M9.itm_typ_d_cd.like(bind("itm_typ_d_cd")))
						.cutoff$and(S0_T1.itm_cd.like(bind("itm_cd")))
						.cutoff$and(S0_T1.itm_sub1.like(bind("itm_sub1")))
						.cutoff$and(S0_T1.itm_sub2.like(bind("itm_sub2")))
						.cutoff$and(S0_T1.itm_sub3.like(bind("itm_sub3")))
						.cutoff$and(
							nvl(
								S0_M10.itm_nm,
								S0_M9.itm_nm
							).like(bind("itm_nm"))
						)
						.cutoff$and(S0_T1.lot_no.like(bind("lot_no")))
						.cutoff$and(S0_T1.sublot_no.like(bind("sublot_no")))
						.cutoff$and(S0_T1.sno1.like(bind("sno1")))
						.cutoff$and(S0_T1.sno2.like(bind("sno2")))
						.cutoff$and(S0_T1.sno3.like(bind("sno3")))
						.cutoff$and(S0_T1.sno4.like(bind("sno4")))
						.cutoff$and(S0_T1.itm_mfg_inst_no.like(bind("itm_mfg_inst_no")))
						.cutoff$and(S0_T1.mfg_act_no.like(bind("mfg_act_no")))
						.cutoff$and(S0_T1.itm_ord_no.like(bind("itm_ord_no")))
						.cutoff$and(S0_T1.sub_char1.like(bind("sub_char1")))
						.cutoff$and(S0_T1.sub_char2.like(bind("sub_char2")))
						.cutoff$and(S0_T1.sub_char3.like(bind("sub_char3")))
						.cutoff$and(S0_T1.cmpl_flg.eq(bind("w_not_cmpl_flg")))
						.addDynamicPredicate(DS0C_ITM_GRP)
					)
					.orderBy(
						S0_T1.ym.asc(),
						S0_T2.wg_cd.asc(),
						MAPA_LOC$F_GET_ASST_DPT_CD(
							S0_T1.loc_cd,
							bracket(
								addMonths(
									S0_T1.ym,
									value(1)
								).subtractDays(value(1))
							)
						).asc(),
						S0_T1.itm_cd.asc(),
						S0_T1.itm_sub1.asc(),
						S0_T1.itm_sub2.asc(),
						S0_T1.itm_sub3.asc(),
						S0_T1.loc_cd.asc()
					)
			)
			.setDynamicSQLInfo(
				when(boundOr("site_nm", "loc_grp_nm", "site_cd", "loc_grp_cd", "loc_nm"))
					.view(v -> v.leftOuterJoin(S0_M2).on(bracket(S0_T1.loc_cd.eq(S0_M2.loc_cd))))
					.predicate(p -> p.cutoff$and(S0_M2.site_cd.like(bind("site_cd"))).cutoff$and(S0_M2.loc_grp_cd.like(bind("loc_grp_cd"))).cutoff$and(S0_M2.loc_nm.like(bind("loc_nm")))),
				when(boundOr("str_ln_nm"))
					.view(v -> v.leftOuterJoin(S0_M3).on(bracket(S0_T1.loc_cd.eq(S0_M3.loc_cd).and(S0_T1.str_ln_cd.eq(S0_M3.str_ln_cd)))))
					.predicate(p -> p.cutoff$and(S0_M3.str_ln_nm.like(bind("str_ln_nm")))),
				when(boundOr("wg_nm"))
					.view(v -> v.leftOuterJoin(S0_M6).on(bracket(S0_T2.wg_cd.eq(S0_M6.wg_cd))))
					.predicate(p -> p.cutoff$and(S0_M6.wg_nm.like(bind("wg_nm")))),
				when(boundOr("site_nm"))
					.view(v -> v.leftOuterJoin(S0_M7).on(bracket(S0_M2.site_cd.eq(S0_M7.site_cd))))
					.predicate(p -> p.cutoff$and(S0_M7.site_nm.like(bind("site_nm")))),
				when(boundOr("loc_grp_nm"))
					.view(v -> v.leftOuterJoin(S0_M8).on(bracket(S0_M2.loc_grp_cd.eq(S0_M8.loc_grp_cd))))
					.predicate(p -> p.cutoff$and(S0_M8.loc_grp_nm.like(bind("loc_grp_nm")))),
				when(boundOr("itm_typ_d_nm"))
					.view(v -> v.leftOuterJoin(S0_M11).on(bracket(S0_M9.itm_typ.eq(S0_M11.itm_typ).and(S0_M9.itm_typ_d_cd.eq(S0_M11.itm_typ_d_cd)))))
					.predicate(p -> p.cutoff$and(S0_M11.itm_typ_d_nm.like(bind("itm_typ_d_nm")))),
				when(boundOr("wrk_no", "wrk_nm"))
					.view(v -> v.leftOuterJoin(S0_V2).on(bracket(S0_T1.sno1.eq(S0_V2.sno1))))
					.predicate(p -> p.cutoff$and(S0_V2.wrk_no.like(bind("wrk_no"))).cutoff$and(S0_V2.wrk_nm.like(bind("wrk_nm")))),
				when(boundOr("itm_grp_flg1"))
					.select(DS0C_ITM_GRP, S0_M9.itm_grp_cd1.as("itm_grp_cd1"), S0_MM1.itm_grp_nm.as("itm_grp_nm1"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM1).on(S0_M9.itm_grp_cd1.eq(S0_MM1.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP1.value()).eq(S0_MM1.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M9.itm_grp_cd1.like(bind("itm_grp_cd1"))).cutoff$and(S0_MM1.itm_grp_nm.like(bind("itm_grp_nm1")))),
				when(boundOr("itm_grp_flg2"))
					.select(DS0C_ITM_GRP, S0_M9.itm_grp_cd2.as("itm_grp_cd2"), S0_MM2.itm_grp_nm.as("itm_grp_nm2"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM2).on(S0_M9.itm_grp_cd2.eq(S0_MM2.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP2.value()).eq(S0_MM2.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M9.itm_grp_cd2.like(bind("itm_grp_cd2"))).cutoff$and(S0_MM2.itm_grp_nm.like(bind("itm_grp_nm2")))),
				when(boundOr("itm_grp_flg3"))
					.select(DS0C_ITM_GRP, S0_M9.itm_grp_cd3.as("itm_grp_cd3"), S0_MM3.itm_grp_nm.as("itm_grp_nm3"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM3).on(S0_M9.itm_grp_cd3.eq(S0_MM3.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP3.value()).eq(S0_MM3.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M9.itm_grp_cd3.like(bind("itm_grp_cd3"))).cutoff$and(S0_MM3.itm_grp_nm.like(bind("itm_grp_nm3")))),
				when(boundOr("itm_grp_flg4"))
					.select(DS0C_ITM_GRP, S0_M9.itm_grp_cd4.as("itm_grp_cd4"), S0_MM4.itm_grp_nm.as("itm_grp_nm4"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM4).on(S0_M9.itm_grp_cd4.eq(S0_MM4.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP4.value()).eq(S0_MM4.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M9.itm_grp_cd4.like(bind("itm_grp_cd4"))).cutoff$and(S0_MM4.itm_grp_nm.like(bind("itm_grp_nm4")))),
				when(boundOr("itm_grp_flg5"))
					.select(DS0C_ITM_GRP, S0_M9.itm_grp_cd5.as("itm_grp_cd5"), S0_MM5.itm_grp_nm.as("itm_grp_nm5"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM5).on(S0_M9.itm_grp_cd5.eq(S0_MM5.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP5.value()).eq(S0_MM5.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M9.itm_grp_cd5.like(bind("itm_grp_cd5"))).cutoff$and(S0_MM5.itm_grp_nm.like(bind("itm_grp_nm5")))),
				when(boundOr("itm_grp_flg6"))
					.select(DS0C_ITM_GRP, S0_M9.itm_grp_cd6.as("itm_grp_cd6"), S0_MM6.itm_grp_nm.as("itm_grp_nm6"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM6).on(S0_M9.itm_grp_cd6.eq(S0_MM6.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP6.value()).eq(S0_MM6.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M9.itm_grp_cd6.like(bind("itm_grp_cd6"))).cutoff$and(S0_MM6.itm_grp_nm.like(bind("itm_grp_nm6")))),
				when(boundOr("itm_grp_flg7"))
					.select(DS0C_ITM_GRP, S0_M9.itm_grp_cd7.as("itm_grp_cd7"), S0_MM7.itm_grp_nm.as("itm_grp_nm7"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM7).on(S0_M9.itm_grp_cd7.eq(S0_MM7.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP7.value()).eq(S0_MM7.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M9.itm_grp_cd7.like(bind("itm_grp_cd7"))).cutoff$and(S0_MM7.itm_grp_nm.like(bind("itm_grp_nm7")))),
				when(boundOr("itm_grp_flg8"))
					.select(DS0C_ITM_GRP, S0_M9.itm_grp_cd8.as("itm_grp_cd8"), S0_MM8.itm_grp_nm.as("itm_grp_nm8"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM8).on(S0_M9.itm_grp_cd8.eq(S0_MM8.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP8.value()).eq(S0_MM8.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M9.itm_grp_cd8.like(bind("itm_grp_cd8"))).cutoff$and(S0_MM8.itm_grp_nm.like(bind("itm_grp_nm8")))),
				when(boundOr("itm_grp_flg9"))
					.select(DS0C_ITM_GRP, S0_M9.itm_grp_cd9.as("itm_grp_cd9"), S0_MM9.itm_grp_nm.as("itm_grp_nm9"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM9).on(S0_M9.itm_grp_cd9.eq(S0_MM9.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP9.value()).eq(S0_MM9.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M9.itm_grp_cd9.like(bind("itm_grp_cd9"))).cutoff$and(S0_MM9.itm_grp_nm.like(bind("itm_grp_nm9")))),
				when(boundOr("itm_grp_flg10"))
					.select(DS0C_ITM_GRP, S0_M9.itm_grp_cd10.as("itm_grp_cd10"), S0_MM10.itm_grp_nm.as("itm_grp_nm10"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM10).on(S0_M9.itm_grp_cd10.eq(S0_MM10.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP10.value()).eq(S0_MM10.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M9.itm_grp_cd10.like(bind("itm_grp_cd10"))).cutoff$and(S0_MM10.itm_grp_nm.like(bind("itm_grp_nm10"))))
			)
			.setJoinInfo(
				joinInfo(
					j -> j
						.add(MAM_LOC_R.class, r -> toCondition(
							r.getStringNE("loc_cd")
						))
						.addSelect(m -> toArray(
							m.loc_grp_cd,
							m.loc_nm,
							m.site_cd
						))
						.addMap((r, m) -> {
							r.setStringNE("loc_nm", m.loc_nm());
							r.setStringNE("site_cd", m.site_cd());
							r.setStringNE("loc_grp_cd", m.loc_grp_cd());
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
						.add(MAM_UNIT_R.class, r -> toCondition(
							r.getStringNE("base_unit_cd")
						))
						.addSelect(m -> toArray(
							m.unit_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("unit_nm", m.unit_nm());
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
					})
				)
			);
	}
}