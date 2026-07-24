package mcframe.serverMSBC.MSBCL0360;

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
	 * -- MSBCL0360_MAM_ALLOC_CTL_Query_S01
	 */
	static MCQueryPlan MSBCL0360_MAM_ALLOC_CTL_S01() {
		MAM_ALLOC_CTL_R S0_M1 = MAM_ALLOC_CTL_R.create("M1");
		MAW_ALLOC_CTL_KEY_R S1_WK = MAW_ALLOC_CTL_KEY_R.create("WK");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBCL0360_MAM_ALLOC_CTL_Query_S01")
					.mainQuery()
					.select(
						S0_M1.to_loc_cd,
						S0_M1.fr_loc_cd,
						S0_M1.itm_cd,
						S0_M1.itm_sub1,
						S0_M1.itm_sub2,
						S0_M1.itm_sub3,
						S0_M1.prio
					)
					.from(S0_M1)
					.where(
						value(0).eq(value(0))
						.and(S0_M1.del_flg.eq(value(false)))
						.and(
							exists(
								subQuery()
								.select(value(1))
								.from(S1_WK)
								.where(
									S1_WK.to_loc_cd.eq(S0_M1.to_loc_cd)
									.and(
										S1_WK.itm_cd.eq(S0_M1.itm_cd)
										.and(S1_WK.itm_sub1.eq(S0_M1.itm_sub1))
										.and(S1_WK.itm_sub2.eq(S0_M1.itm_sub2))
										.and(S1_WK.itm_sub3.eq(S0_M1.itm_sub3))
										.or(S0_M1.itm_cd.isNull())
									)
								)
							)
						)
					)
			);
	}
	
	/**
	 * -- MSBCL0360_MST_ITM_ORDER_Query_S01
	 */
	static MCQueryPlan MSBCL0360_MST_ITM_ORDER_S01() {
		MST_ITM_ORDER_R S0_T1 = MST_ITM_ORDER_R.create("T1");
		MAVM_RD_WG_R S0_DAC = MAVM_RD_WG_R.create("DAC");
		MST_OPER_ORDER_R S0_T2 = MST_OPER_ORDER_R.create("T2");
		MAM_ITM_R S0_M1 = MAM_ITM_R.create("M1");
		MAM_LOC_R S0_M2 = MAM_LOC_R.create("M2");
		MAM_LOC_R S0_M3 = MAM_LOC_R.create("M3");
		MAM_OPER_R S0_M4 = MAM_OPER_R.create("M4");
		MAM_UNIT_R S0_M5 = MAM_UNIT_R.create("M5");
		MAM_WG_R S0_M6 = MAM_WG_R.create("M6");
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
		MAM_LOC_R S1 = MAM_LOC_R.create();
		
		MCDynamicSQLID DS0C_ITM_GRP = createDynamicSQLID("DS0C_ITM_GRP");
		
		return createQueryPlan()
			.setQuery(
				sql("MSBCL0360_MST_ITM_ORDER_Query_S01")
					.mainQuery()
					.select(
						rowNumber()
							.over()
							.orderBy(
								cases()
									.when(bind("order").eq(value("BEGIN")))
										.then(S0_T1.mfg_st_schd_dt)
									.when(bind("order").eq(value("END")))
										.then(S0_T1.mfg_end_schd_dt)
									.otherwise(S0_T1.mfg_end_schd_dt).asc(),
								S0_T1.itm_cd.asc(),
								S0_T1.itm_sub1.asc(),
								S0_T1.itm_sub2.asc(),
								S0_T1.itm_sub3.asc(),
								S0_T1.itm_ord_sts_typ.desc(),
								S0_T1.itm_ord_no.asc()
							).as("peg_no"),
						value(0).as("hrrchy"),
						S0_T1.mfg_st_schd_dt,
						S0_T1.mfg_end_schd_dt,
						S0_T1.itm_cd,
						S0_T1.itm_sub1,
						S0_T1.itm_sub2,
						S0_T1.itm_sub3,
						S0_M1.itm_nm,
						S0_T1.sno1,
						S0_T1.sno2,
						S0_T1.sno3,
						S0_T1.sno4,
						S0_T1.not_inst_qty.as("ord_qty"),
						S0_T1.itm_ord_typ,
						S0_T1.itm_ord_sts_typ,
						S0_T1.itm_ord_no,
						S0_T1.mfg_loc_cd,
						S0_M2.loc_nm.as("mfg_loc_nm"),
						S0_T1.strg_loc_cd,
						S0_M3.loc_nm.as("strg_loc_nm"),
						S0_T1.wg_cd,
						S0_M6.wg_nm,
						S0_T1.bom_ptn,
						S0_T2.oper_ord_no,
						S0_T2.oper_cd,
						S0_M4.oper_nm,
						S0_T2.oper_seq,
						S0_T2.st_schd_tm,
						S0_T2.end_schd_tm,
						S0_T2.not_oper_schd_qty,
						S0_M1.unit_cd,
						S0_M5.unit_nm,
						S0_M1.dec_place,
						S0_M1.rnd_typ,
						addDynamicSelect(DS0C_ITM_GRP)
					)
					.from(
						S0_T1
						.innerJoin(S0_DAC).on(
							bracket(
								S0_T1.wg_cd.eq(S0_DAC.wg_cd)
							)
						)
						.innerJoin(S0_T2).on(
							bracket(
								S0_T2.itm_ord_no.eq(S0_T1.itm_ord_no)
							)
						)
						.leftOuterJoin(S0_M1).on(
							bracket(
								S0_M1.itm_cd.eq(S0_T1.itm_cd)
								.and(S0_M1.itm_sub1.eq(S0_T1.itm_sub1))
								.and(S0_M1.itm_sub2.eq(S0_T1.itm_sub2))
								.and(S0_M1.itm_sub3.eq(S0_T1.itm_sub3))
							)
						)
						.leftOuterJoin(S0_M2).on(
							bracket(
								S0_M2.loc_cd.eq(S0_T1.mfg_loc_cd)
							)
						)
						.leftOuterJoin(S0_M3).on(
							bracket(
								S0_M3.loc_cd.eq(S0_T1.strg_loc_cd)
							)
						)
						.leftOuterJoin(S0_M4).on(
							bracket(
								S0_M4.oper_cd.eq(S0_T2.oper_cd)
							)
						)
						.leftOuterJoin(S0_M5).on(
							bracket(
								S0_M5.unit_cd.eq(S0_M1.unit_cd)
							)
						)
						.leftOuterJoin(S0_M6).on(
								bracket(
									S0_M6.wg_cd.eq(S0_T1.wg_cd)
								)
							)
						.addDynamicView(DS0C_ITM_GRP)
					)
					.where(
						value(0).eq(value(0))
						.cutoff$and(
							bind("wk_mfg").eq(value("MFG"))
							.and(S0_T1.itm_ord_typ.eq(value(MSC_ITM_ORD_TYP.MFG.value())))
						)
						.cutoff$and(
							bind("wk_outsrc").eq(value("OUTSRC"))
							.and(S0_T1.itm_ord_typ.eq(value(MSC_ITM_ORD_TYP.OUTSRC.value())))
						)
						.cutoff$and(
							bind("wk_mfgoutsrc").eq(value("MFGOUTSRC"))
							.and(
								S0_T1.itm_ord_typ.in(
									value(MSC_ITM_ORD_TYP.MFG.value()),
									value(MSC_ITM_ORD_TYP.OUTSRC.value())
								)
							)
						)
						.and(
							S0_T1.itm_ord_sts_typ.in(
								value(MSC_ITM_ORD_STS_TYP.OPN.value()),
								value(MSC_ITM_ORD_STS_TYP.SAV.value()),
								value(MSC_ITM_ORD_STS_TYP.FIX.value()),
								value(MSC_ITM_ORD_STS_TYP.PART_INST.value())
							)
						)
						.and(S0_T1.wg_cd.eq(bind("wg_cd")))
						.and(
							S0_T1.mfg_loc_cd.in(
								subQuery()
								.select(S1.loc_cd)
								.from(S1)
								.where(
									S1.loc_grp_cd.eq(bind("mfg_loc_grp_cd"))
								)
							)
						)
						.and(MSC_ORD_GNRT_TYP$IS_UPLND(S0_T1.ord_gnrt_typ).eq(value(false)))
						.cutoff$and(S0_T1.itm_cd.like(bind("itm_cd")))
						.cutoff$and(S0_T1.itm_sub1.like(bind("itm_sub1")))
						.cutoff$and(S0_T1.itm_sub2.like(bind("itm_sub2")))
						.cutoff$and(S0_T1.itm_sub3.like(bind("itm_sub3")))
						.and(S0_T1.mfg_end_schd_dt.between(bind("dt_fr"), bind("dt_to")))
						.addDynamicPredicate(DS0C_ITM_GRP)
					)
					.orderBy(
						cases()
							.when(bind("order").eq(value("BEGIN")))
								.then(S0_T1.mfg_st_schd_dt)
							.when(bind("order").eq(value("END")))
								.then(S0_T1.mfg_end_schd_dt)
							.otherwise(S0_T1.mfg_end_schd_dt).asc(),
						S0_T1.itm_cd.asc(),
						S0_T1.itm_sub1.asc(),
						S0_T1.itm_sub2.asc(),
						S0_T1.itm_sub3.asc(),
						S0_T1.itm_ord_sts_typ.desc(),
						S0_T1.itm_ord_no.asc()
					)
			)
			.setDynamicSQLInfo(
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
			);
	}
	
	/**
	 * -- MSBCL0360_MST_LOT_Query_S01
	 */
	static MCQueryPlan MSBCL0360_MST_LOT_S01() {
		MSW_LOT_KEY_R S0_KEY = MSW_LOT_KEY_R.create("KEY");
		MST_LOT_R S0_T1 = MST_LOT_R.create("T1");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBCL0360_MST_LOT_Query_S01")
					.mainQuery()
					.select(
						S0_T1.itm_cd,
						S0_T1.itm_sub1,
						S0_T1.itm_sub2,
						S0_T1.itm_sub3,
						min(S0_T1.first_gr_dt).as("first_gr_dt")
					)
					.from(
						S0_KEY
						.innerJoin(S0_T1).on(
							bracket(
								S0_T1.itm_cd.eq(S0_KEY.itm_cd)
								.and(S0_T1.itm_sub1.eq(S0_KEY.itm_sub1))
								.and(S0_T1.itm_sub2.eq(S0_KEY.itm_sub2))
								.and(S0_T1.itm_sub3.eq(S0_KEY.itm_sub3))
							)
						)
					)
					.where(
						value(0).eq(value(0))
					)
					.groupBy(
						S0_T1.itm_cd,
						S0_T1.itm_sub1,
						S0_T1.itm_sub2,
						S0_T1.itm_sub3
					)
					.orderBy(
						S0_T1.itm_cd.asc(),
						S0_T1.itm_sub1.asc(),
						S0_T1.itm_sub2.asc(),
						S0_T1.itm_sub3.asc()
					)
			);
	}
	
	/**
	 * -- MSBCL0360_MSW_BOM_EXP_RSLT_Query_S01
	 */
	static MCQueryPlan MSBCL0360_MSW_BOM_EXP_RSLT_S01() {
		MCTempView S0_T1 = createTempView("T1");
		MAM_PROV_UPRI_R S0_M1 = MAM_PROV_UPRI_R.create("M1");
		MCTempView S1_T1 = createTempView("T1");
		MAM_ITM_R S1_M1 = MAM_ITM_R.create("M1");
		MAM_UNIT_R S1_M2 = MAM_UNIT_R.create("M2");
		MAM_BP_R S1_M4 = MAM_BP_R.create("M4");
		MAM_ALT_GRP_R S1_M5 = MAM_ALT_GRP_R.create("M5");
		MAM_UNIT_R S1_M6 = MAM_UNIT_R.create("M6");
		MSW_BOM_EXP_RSLT_R S2_T1 = MSW_BOM_EXP_RSLT_R.create("T1");
		MSW_BOM_EXP_R S2_T2 = MSW_BOM_EXP_R.create("T2");
		MAM_LOC_R S2_M3 = MAM_LOC_R.create("M3");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBCL0360_MSW_BOM_EXP_RSLT_Query_S01")
					.mainQuery()
					.select(
						S0_T1.pr(S2_T1.peg_no),
						S0_T1.pr("bom_id"),
						S0_T1.pr("itm_seq"),
						S0_T1.pr(S2_T1.itm_ord_no),
						S0_T1.pr(S2_T2.oper_ord_no),
						S0_T1.pr(S2_T1.itm_cd),
						S0_T1.pr(S2_T1.itm_sub1),
						S0_T1.pr(S2_T1.itm_sub2),
						S0_T1.pr(S2_T1.itm_sub3),
						S0_T1.pr(S1_M1.itm_nm),
						S0_T1.pr(S2_T1.ver_no),
						S0_T1.pr(S2_T1.rqmt_qty),
						S0_T1.pr(S2_T1.loss_rqmt_qty),
						S0_T1.pr(S2_T1.inpt_qty),
						S0_T1.pr(S2_T1.fxd_rqmt_qty),
						decode(
							S0_T1.pr(S2_T1.alt_grp_cd),
							nullValue(),
							value((MCNumber) null),
							S0_T1.pr(S2_T1.rqmt_qty)
						).as("alt_qty"),
						S0_T1.pr(S1_M1.unit_cd),
						S0_T1.pr(S1_M2.unit_nm),
						S0_T1.pr(S1_M1.dec_place),
						S0_T1.pr(S1_M1.rnd_typ).as("unit_conv_rnd_typ"),
						S0_T1.pr(S2_M3.loc_cd),
						S0_T1.pr(S2_M3.loc_nm),
						S0_T1.pr(S2_M3.str_ln_tgt_flg),
						S0_T1.pr(S2_M3.sppl_cd),
						S0_T1.pr("sppl_nm"),
						S0_T1.pr(S2_T1.alt_grp_cd),
						S0_T1.pr(S1_M5.alt_grp_nm),
						S0_T1.pr(S2_T1.alt_itm_flg),
						S0_T1.pr(S2_T1.alt_grp_seq),
						S0_T1.pr(S2_T1.alt_itm_typ),
						S0_T1.pr(S2_T1.alt_itm_ratio),
						S0_T1.pr(S2_T1.alt_alloc_prio),
						S0_T1.pr(S2_T2.mst_wg_cd),
						S0_T1.pr(S2_T2.oper_cd),
						S0_T1.pr(S2_T2.oper_seq),
						S0_T1.pr(S2_T1.sno1),
						S0_T1.pr(S2_T1.sno_typ1),
						S0_T1.pr(S2_T1.sno2),
						S0_T1.pr(S2_T1.sno_typ2),
						S0_T1.pr(S2_T1.sno3),
						S0_T1.pr(S2_T1.sno_typ3),
						S0_T1.pr(S2_T1.sno4),
						S0_T1.pr(S2_T1.sno_typ4),
						S0_T1.pr(S2_T1.par_inst_qty),
						S0_T1.pr(S2_T1.chd_inpt_qty),
						S0_T1.pr(S2_T1.chd_rqmt_qty),
						S0_T1.pr(S2_T1.fxd_chd_rqmt_qty),
						S0_T1.pr(S2_T1.chd_rqmt_ratio),
						S0_T1.pr(S2_T1.chd_inpt_ratio),
						S0_T1.pr("schd_in_dt"),
						S0_T1.pr(S2_T1.byprod_flg),
						S0_T1.pr(S2_T1.in_offst_typ),
						S0_T1.pr(S2_T1.in_offst),
						S0_T1.pr(S2_T1.inpt_ctl_typ),
						S0_T1.pr(S2_T1.bkf_typ),
						S0_T1.pr(S2_T1.inst_lot_fix_flg),
						S0_T1.pr(S2_T1.lot_mix_flg),
						S0_T1.pr(S2_T1.sublot_mix_flg),
						S0_T1.pr(S2_T1.alloc_ctl_typ),
						S0_T1.pr(S2_T1.main_itm_flg),
						S0_T1.pr(S2_T1.memo1),
						S0_T1.pr(S2_T1.memo2),
						S0_T1.pr(S2_T1.memo3),
						S0_T1.pr(S2_T1.disp_seq),
						S0_T1.pr(S1_M1.cont_fctr_flg),
						S0_T1.pr(S1_M1.cont_fctr_unit_cd),
						S0_T1.pr("cont_fctr_unit_nm"),
						S0_T1.pr(S1_M1.std_cont_fctr),
						S0_T1.pr(S1_M1.cont_fctr_dec_place),
						S0_T1.pr(S1_M1.cont_fctr_rnd_typ),
						S0_T1.pr(S1_M1.sundry_itm_flg),
						S0_T1.pr(S1_M1.sno1_mng_typ),
						S0_T1.pr(S1_M1.sno2_mng_typ),
						S0_T1.pr(S1_M1.sno3_mng_typ),
						S0_T1.pr(S1_M1.sno4_mng_typ),
						S0_T1.pr(S1_M1.lot_mng_typ),
						S0_T1.pr(S1_M1.lot_no_typ),
						S0_T1.pr(S1_M1.lot_no_ptn_cd),
						S0_T1.pr(S1_M1.sublot_mng_typ),
						S0_T1.pr(S1_M1.sublot_no_typ),
						S0_T1.pr(S1_M1.sublot_no_ptn_cd),
						S0_T1.pr(S1_M1.ver_flg),
						S0_M1.prov_typ,
						S0_M1.upri.as("prov_upri"),
						S0_M1.cur_cd.as("prov_cur_cd"),
						S0_T1.pr(S1_M1.stk_mng_typ),
						S0_T1.pr(S2_T1.yield_calc_flg),
						S0_T1.pr(S1_M1.th_image)
					)
					.from(
						subQuery()
						.select(
							S1_T1.pr(S2_T1.peg_no),
							nullValue().as("bom_id"),
							nullValue().as("itm_seq"),
							S1_T1.pr(S2_T1.itm_ord_no),
							S1_T1.pr(S2_T2.oper_ord_no),
							S1_T1.pr(S2_T1.itm_cd),
							S1_T1.pr(S2_T1.itm_sub1),
							S1_T1.pr(S2_T1.itm_sub2),
							S1_T1.pr(S2_T1.itm_sub3),
							S1_M1.itm_nm,
							S1_T1.pr(S2_T1.ver_no),
							S1_T1.pr(S2_T1.rqmt_qty),
							S1_T1.pr(S2_T1.loss_rqmt_qty),
							S1_T1.pr(S2_T1.inpt_qty),
							S1_T1.pr(S2_T1.fxd_rqmt_qty),
							S1_M1.unit_cd,
							S1_M2.unit_nm,
							S1_M1.dec_place,
							S1_M1.rnd_typ,
							S1_T1.pr(S2_M3.loc_cd),
							S1_T1.pr(S2_M3.loc_nm),
							S1_T1.pr(S2_M3.str_ln_tgt_flg),
							S1_T1.pr(S2_M3.wg_cd),
							S1_T1.pr(S2_M3.sppl_cd),
							S1_M4.bp_nm.as("sppl_nm"),
							S1_T1.pr(S2_T1.alt_grp_cd),
							S1_M5.alt_grp_nm,
							S1_T1.pr(S2_T1.alt_itm_flg),
							S1_T1.pr(S2_T1.alt_grp_seq),
							S1_T1.pr(S2_T1.alt_itm_typ),
							S1_T1.pr(S2_T1.alt_itm_ratio),
							S1_T1.pr(S2_T1.alt_alloc_prio),
							S1_T1.pr(S2_T2.mst_wg_cd),
							S1_T1.pr(S2_T2.oper_cd),
							S1_T1.pr(S2_T2.oper_seq),
							S1_T1.pr(S2_T1.sno1),
							S1_T1.pr(S2_T1.sno_typ1),
							S1_T1.pr(S2_T1.sno2),
							S1_T1.pr(S2_T1.sno_typ2),
							S1_T1.pr(S2_T1.sno3),
							S1_T1.pr(S2_T1.sno_typ3),
							S1_T1.pr(S2_T1.sno4),
							S1_T1.pr(S2_T1.sno_typ4),
							S1_T1.pr(S2_T1.par_inst_qty),
							S1_T1.pr(S2_T1.chd_inpt_qty),
							S1_T1.pr(S2_T1.chd_rqmt_qty),
							S1_T1.pr(S2_T1.fxd_chd_rqmt_qty),
							S1_T1.pr(S2_T1.chd_rqmt_ratio),
							S1_T1.pr(S2_T1.chd_inpt_ratio),
							S1_T1.pr("schd_in_dt"),
							S1_T1.pr(S2_T1.byprod_flg),
							S1_T1.pr(S2_T1.in_offst_typ),
							S1_T1.pr(S2_T1.in_offst),
							S1_T1.pr(S2_T1.inpt_ctl_typ),
							S1_T1.pr(S2_T1.bkf_typ),
							S1_T1.pr(S2_T1.inst_lot_fix_flg),
							S1_T1.pr(S2_T1.lot_mix_flg),
							S1_T1.pr(S2_T1.sublot_mix_flg),
							S1_T1.pr(S2_T1.alloc_ctl_typ),
							S1_T1.pr(S2_T1.main_itm_flg),
							S1_T1.pr(S2_T1.yield_calc_flg),
							S1_T1.pr(S2_T1.memo1),
							S1_T1.pr(S2_T1.memo2),
							S1_T1.pr(S2_T1.memo3),
							S1_T1.pr(S2_T1.disp_seq),
							S1_M1.cont_fctr_unit_cd,
							S1_M6.unit_nm.as("cont_fctr_unit_nm"),
							S1_M1.std_cont_fctr,
							S1_M1.cont_fctr_flg,
							S1_M1.cont_fctr_rnd_typ,
							S1_M1.cont_fctr_dec_place,
							S1_M1.sundry_itm_flg,
							S1_M1.sno1_mng_typ,
							S1_M1.sno2_mng_typ,
							S1_M1.sno3_mng_typ,
							S1_M1.sno4_mng_typ,
							S1_M1.lot_mng_typ,
							S1_M1.lot_no_typ,
							S1_M1.lot_no_ptn_cd,
							S1_M1.sublot_mng_typ,
							S1_M1.sublot_no_typ,
							S1_M1.sublot_no_ptn_cd,
							S1_M1.ver_flg,
							S1_M1.stk_mng_typ,
							S1_M1.th_image,
							nvl(
								S1_T1.pr(S2_T2.cur_cd),
								S1_M4.cur_cd
							).as("cur_cd")
						)
						.from(
							subQuery()
							.select(
								S2_T1.peg_no,
								S2_T1.itm_ord_no,
								S2_T2.oper_ord_no,
								S2_T2.mst_wg_cd,
								S2_T2.oper_cd,
								S2_T2.oper_seq,
								S2_T1.itm_cd,
								S2_T1.itm_sub1,
								S2_T1.itm_sub2,
								S2_T1.itm_sub3,
								S2_T1.ver_no,
								S2_T1.rqmt_qty,
								S2_T1.loss_rqmt_qty,
								S2_T1.inpt_qty,
								S2_T1.fxd_rqmt_qty,
								S2_M3.loc_cd,
								S2_M3.loc_nm,
								S2_M3.str_ln_tgt_flg,
								S2_M3.wg_cd,
								S2_M3.sppl_cd,
								S2_T1.alt_itm_flg,
								S2_T1.alt_grp_cd,
								S2_T1.alt_grp_seq,
								S2_T1.alt_itm_typ,
								S2_T1.alt_itm_ratio,
								S2_T1.alt_alloc_prio,
								S2_T1.sno1,
								S2_T1.sno_typ1,
								S2_T1.sno2,
								S2_T1.sno_typ2,
								S2_T1.sno3,
								S2_T1.sno_typ3,
								S2_T1.sno4,
								S2_T1.sno_typ4,
								S2_T1.par_inst_qty,
								S2_T1.chd_inpt_qty,
								S2_T1.chd_rqmt_qty,
								S2_T1.fxd_chd_rqmt_qty,
								S2_T1.chd_rqmt_ratio,
								S2_T1.chd_inpt_ratio,
								decode(
									S2_T1.in_offst_typ,
									value(MAC_OFFST_TYP.BY_ST.value()),
									MAPA_DT$F_CAL_DATE_LOC(
										S2_T2.st_schd_dt,
										value(0).subtract(S2_T1.in_offst),
										value(false),
										S2_M3.loc_cd,
										value(false)
									),
									MAPA_DT$F_CAL_DATE_LOC(
										S2_T2.end_schd_dt,
										value(0).subtract(S2_T1.in_offst),
										value(false),
										S2_M3.loc_cd,
										value(false)
									)
								).as("schd_in_dt"),
								S2_T1.in_offst_typ,
								S2_T1.in_offst,
								S2_T1.byprod_flg,
								S2_T1.bkf_typ,
								S2_T1.inst_lot_fix_flg,
								S2_T1.lot_mix_flg,
								S2_T1.sublot_mix_flg,
								S2_T1.alloc_ctl_typ,
								S2_T1.main_itm_flg,
								S2_T1.yield_calc_flg,
								S2_T1.inpt_ctl_typ,
								S2_T1.disp_seq,
								S2_T1.memo1,
								S2_T1.memo2,
								S2_T1.memo3,
								S2_T2.cur_cd
							)
							.from(
								S2_T1
								.innerJoin(S2_T2).on(
									bracket(
										S2_T1.peg_no.eq(S2_T2.peg_no)
									)
								)
								.innerJoin(S2_M3).on(
									bracket(
										MAPA_LOC$F_GET_IN_LOC(
											S2_T1.itm_cd,
											S2_T1.itm_sub1,
											S2_T1.itm_sub2,
											S2_T1.itm_sub3,
											S2_T2.oper_loc_cd
										).eq(S2_M3.loc_cd)
									)
								)
							)
							.where(
								value(0).eq(value(0))
							).view(S1_T1)
							.leftOuterJoin(S1_M1).on(
								bracket(
									value(0).eq(value(0))
									.and(S1_T1.pr(S2_T1.itm_cd).eq(S1_M1.itm_cd))
									.and(S1_T1.pr(S2_T1.itm_sub1).eq(S1_M1.itm_sub1))
									.and(S1_T1.pr(S2_T1.itm_sub2).eq(S1_M1.itm_sub2))
									.and(S1_T1.pr(S2_T1.itm_sub3).eq(S1_M1.itm_sub3))
								)
							)
							.leftOuterJoin(S1_M2).on(
								bracket(
									S1_M1.unit_cd.eq(S1_M2.unit_cd)
								)
							)
							.leftOuterJoin(S1_M4).on(
								bracket(
									S1_T1.pr(S2_M3.sppl_cd).eq(S1_M4.bp_cd)
								)
							)
							.leftOuterJoin(S1_M5).on(
								bracket(
									S1_T1.pr(S2_T1.alt_grp_cd).eq(S1_M5.alt_grp_cd)
									.and(S1_T1.pr(S2_M3.wg_cd).eq(S1_M5.wg_cd))
								)
							)
							.leftOuterJoin(S1_M6).on(
								bracket(
									S1_M1.cont_fctr_unit_cd.eq(S1_M6.unit_cd)
								)
							)
						)
						.where(
							value(0).eq(value(0))
						).view(S0_T1)
						.leftOuterJoin(S0_M1).on(
							bracket(
								value(0).eq(value(0))
								.and(S0_T1.pr(S2_T1.itm_cd).eq(S0_M1.itm_cd))
								.and(S0_T1.pr(S2_T1.itm_sub1).eq(S0_M1.itm_sub1))
								.and(S0_T1.pr(S2_T1.itm_sub2).eq(S0_M1.itm_sub2))
								.and(S0_T1.pr(S2_T1.itm_sub3).eq(S0_M1.itm_sub3))
								.and(S0_T1.pr(S2_M3.sppl_cd).eq(S0_M1.prsppl_cd))
								.and(S0_T1.pr("cur_cd").eq(S0_M1.cur_cd))
								.and(S0_T1.pr(S2_M3.wg_cd).eq(S0_M1.wg_cd))
								.and(S0_T1.pr("schd_in_dt").gte(S0_M1.st_dt))
								.and(S0_T1.pr("schd_in_dt").lte(S0_M1.end_dt))
							)
						)
					)
					.where(
						value(0).eq(value(0))
					)
			);
	}
	
	/**
	 * -- MSBCL0360_MSW_BOM_EXP_Query_U01
	 */
	static MCQueryPlan MSBCL0360_MSW_BOM_EXP_U01() {
		MSW_BOM_EXP_R S0_T1 = MSW_BOM_EXP_R.create("T1");
		MAM_LOC_R S1_M1 = MAM_LOC_R.create("M1");
		MAM_LOC_R S2_M1 = MAM_LOC_R.create("M1");
		MAM_BOM_R S2_M2 = MAM_BOM_R.create("M2");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBCL0360_MSW_BOM_EXP_Query_U01")
					.update(S0_T1)
					.set(S0_T1.mst_wg_cd).eq(subQuery()
						.select(S1_M1.wg_cd)
						.from(S1_M1)
						.where(
							value(0).eq(value(0))
							.and(S0_T1.oper_loc_cd.eq(S1_M1.loc_cd))
						)
					)
					.where(
						value(0).eq(value(0))
						.and(
							exists(
								subQuery()
								.select(value("X"))
								.from(
									S2_M1
									.innerJoin(S2_M2).on(
										S2_M2.wg_cd.eq(S2_M1.wg_cd)
										.and(S0_T1.itm_cd.eq(S2_M2.par_itm_cd))
										.and(S0_T1.itm_sub1.eq(S2_M2.par_itm_sub1))
										.and(S0_T1.itm_sub2.eq(S2_M2.par_itm_sub2))
										.and(S0_T1.itm_sub3.eq(S2_M2.par_itm_sub3))
										.and(S0_T1.bom_ptn.eq(S2_M2.bom_ptn))
										.and(S2_M2.del_flg.eq(value(false)))
									)
								)
								.where(
									value(0).eq(value(0))
									.and(S0_T1.oper_loc_cd.eq(S2_M1.loc_cd))
								)
							)
						)
					)
			);
	}
}