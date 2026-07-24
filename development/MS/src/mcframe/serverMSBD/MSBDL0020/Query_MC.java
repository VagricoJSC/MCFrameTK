package mcframe.serverMSBD.MSBDL0020;

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
	 * -- MSBDL0020_MST_PURC_FRCST_BAL_Query_S01
	 */
	static MCQueryPlan MSBDL0020_MST_PURC_FRCST_BAL_S01() {
		MST_PURC_FRCST_BAL_R S0_T1 = MST_PURC_FRCST_BAL_R.create("T1");
		MAVM_RD_WG_R S0_DAC = MAVM_RD_WG_R.create("DAC");
		MAM_BP_R S0_M1 = MAM_BP_R.create("M1");
		MAM_WG_R S0_M2 = MAM_WG_R.create("M2");
		MAM_ITM_R S0_M4 = MAM_ITM_R.create("M4");
		MAM_ITM_TYP_D_R S0_M5 = MAM_ITM_TYP_D_R.create("M5");
		MAM_UNIT_R S0_M6 = MAM_UNIT_R.create("M6");
		MAM_ITM_GRP_R S0_IM1 = MAM_ITM_GRP_R.create("IM1");
		MAM_ITM_GRP_R S0_IM2 = MAM_ITM_GRP_R.create("IM2");
		MAM_ITM_GRP_R S0_IM3 = MAM_ITM_GRP_R.create("IM3");
		MAM_ITM_GRP_R S0_IM4 = MAM_ITM_GRP_R.create("IM4");
		MAM_ITM_GRP_R S0_IM5 = MAM_ITM_GRP_R.create("IM5");
		MAM_ITM_GRP_R S0_IM6 = MAM_ITM_GRP_R.create("IM6");
		MAM_ITM_GRP_R S0_IM7 = MAM_ITM_GRP_R.create("IM7");
		MAM_ITM_GRP_R S0_IM8 = MAM_ITM_GRP_R.create("IM8");
		MAM_ITM_GRP_R S0_IM9 = MAM_ITM_GRP_R.create("IM9");
		MAM_ITM_GRP_R S0_IM10 = MAM_ITM_GRP_R.create("IM10");
		MAM_BP_GRP_R S0_BM1 = MAM_BP_GRP_R.create("BM1");
		MAM_BP_GRP_R S0_BM2 = MAM_BP_GRP_R.create("BM2");
		MAM_BP_GRP_R S0_BM3 = MAM_BP_GRP_R.create("BM3");
		MAM_BP_GRP_R S0_BM4 = MAM_BP_GRP_R.create("BM4");
		MAM_BP_GRP_R S0_BM5 = MAM_BP_GRP_R.create("BM5");
		MAM_BP_GRP_R S0_BM6 = MAM_BP_GRP_R.create("BM6");
		MAM_BP_GRP_R S0_BM7 = MAM_BP_GRP_R.create("BM7");
		MAM_BP_GRP_R S0_BM8 = MAM_BP_GRP_R.create("BM8");
		MAM_BP_GRP_R S0_BM9 = MAM_BP_GRP_R.create("BM9");
		MAM_BP_GRP_R S0_BM10 = MAM_BP_GRP_R.create("BM10");
		
		MCDynamicSQLID DS0C_ITM_GRP = createDynamicSQLID("DS0C_ITM_GRP");
		MCDynamicSQLID DS0C_SPPL_GRP = createDynamicSQLID("DS0C_SPPL_GRP");
		
		return createQueryPlan()
			.setQuery(
				sql("MSBDL0020_MST_PURC_FRCST_BAL_Query_S01")
					.mainQuery()
					.select(
						S0_T1.ym,
						S0_T1.sppl_cd,
						S0_T1.wg_cd,
						S0_T1.itm_cd,
						S0_T1.itm_sub1,
						S0_T1.itm_sub2,
						S0_T1.itm_sub3,
						S0_T1.trd_unit_cd,
						S0_M6.unit_nm.as("trd_unit_nm"),
						S0_T1.trd_unit_qty.as("trd_unit_bf_qty"),
						S0_T1.base_unit_cd,
						S0_T1.base_unit_qty.as("base_unit_bf_qty"),
						S0_T1.cmpl_flg,
						S0_T1.intr_rmrks,
						S0_T1.sub_char1,
						S0_T1.sub_char2,
						S0_T1.sub_char3,
						S0_T1.ins_usr_id,
						S0_T1.ins_usr_nm,
						S0_T1.ins_func_id,
						S0_T1.ins_ts,
						S0_T1.upd_cntr,
						S0_T1.upd_usr_id,
						S0_T1.upd_usr_nm,
						S0_T1.upd_func_id,
						S0_T1.upd_ts,
						S0_T1.upd_srv_req_no
					)
					.from(
						S0_T1
						.innerJoin(S0_DAC).on(
							bracket(
								S0_DAC.wg_cd.eq(S0_T1.wg_cd)
							)
						)
						.leftOuterJoin(S0_M1).on(
							bracket(
								S0_M1.bp_cd.eq(S0_T1.sppl_cd)
								.and(S0_M1.sppl_flg.eq(value(true)))
							)
						)
						.leftOuterJoin(S0_M2).on(
							bracket(
								S0_M2.wg_cd.eq(S0_T1.wg_cd)
							)
						)
						.leftOuterJoin(S0_M4).on(
							bracket(
								S0_M4.itm_cd.eq(S0_T1.itm_cd)
								.and(S0_M4.itm_sub1.eq(S0_T1.itm_sub1))
								.and(S0_M4.itm_sub2.eq(S0_T1.itm_sub2))
								.and(S0_M4.itm_sub3.eq(S0_T1.itm_sub3))
							)
						)
						.leftOuterJoin(S0_M5).on(
							bracket(
								S0_M5.itm_typ.eq(S0_M4.itm_typ)
								.and(S0_M5.itm_typ_d_cd.eq(S0_M4.itm_typ_d_cd))
							)
						)
						.leftOuterJoin(S0_M6).on(
							bracket(
								S0_M6.unit_cd.eq(S0_T1.trd_unit_cd)
							)
						)
						.addDynamicView(DS0C_ITM_GRP)
						.addDynamicView(DS0C_SPPL_GRP)
					)
					.where(
						value(0).eq(value(0))
						.and(S0_T1.ym.gte(bind("ym_fr")))
						.and(S0_T1.ym.lte(bind("ym_to")))
						.cutoff$and(S0_T1.wg_cd.like(bind("wg_cd")))
						.cutoff$and(S0_T1.sppl_cd.like(bind("sppl_cd")))
						.cutoff$and(S0_T1.itm_cd.like(bind("itm_cd")))
						.cutoff$and(S0_T1.itm_sub1.like(bind("itm_sub1")))
						.cutoff$and(S0_T1.itm_sub2.like(bind("itm_sub2")))
						.cutoff$and(S0_T1.itm_sub3.like(bind("itm_sub3")))
						.cutoff$and(S0_T1.intr_rmrks.like(bind("intr_rmrks")))
						.cutoff$and(S0_T1.sub_char1.like(bind("sub_char1")))
						.cutoff$and(S0_T1.sub_char2.like(bind("sub_char2")))
						.cutoff$and(S0_T1.sub_char3.like(bind("sub_char3")))
						.cutoff$and(S0_M1.bp_nm.like(bind("sppl_nm")))
						.cutoff$and(S0_M1.subcon_flg.eq(bind("subcon_flg_str")))
						.cutoff$and(S0_M2.wg_nm.like(bind("wg_nm")))
						.cutoff$and(S0_M4.itm_nm.like(bind("itm_nm")))
						.cutoff$and(S0_M4.itm_typ.like(bind("itm_typ")))
						.cutoff$and(S0_M4.itm_typ_d_cd.like(bind("itm_typ_d_cd")))
						.cutoff$and(S0_M5.itm_typ_d_nm.like(bind("itm_typ_d_nm")))
						.addDynamicPredicate(DS0C_ITM_GRP)
						.addDynamicPredicate(DS0C_SPPL_GRP)
					)
			)
			.setDynamicSQLInfo(
				when(boundOr("itm_grp_flg1"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_IM1).on(S0_M4.itm_grp_cd1.eq(S0_IM1.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP1.value()).eq(S0_IM1.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M4.itm_grp_cd1.like(bind("itm_grp_cd1"))).cutoff$and(S0_IM1.itm_grp_nm.like(bind("itm_grp_nm1")))),
				when(boundOr("itm_grp_flg2"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_IM2).on(S0_M4.itm_grp_cd2.eq(S0_IM2.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP2.value()).eq(S0_IM2.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M4.itm_grp_cd2.like(bind("itm_grp_cd2"))).cutoff$and(S0_IM2.itm_grp_nm.like(bind("itm_grp_nm2")))),
				when(boundOr("itm_grp_flg3"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_IM3).on(S0_M4.itm_grp_cd3.eq(S0_IM3.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP3.value()).eq(S0_IM3.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M4.itm_grp_cd3.like(bind("itm_grp_cd3"))).cutoff$and(S0_IM3.itm_grp_nm.like(bind("itm_grp_nm3")))),
				when(boundOr("itm_grp_flg4"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_IM4).on(S0_M4.itm_grp_cd4.eq(S0_IM4.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP4.value()).eq(S0_IM4.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M4.itm_grp_cd4.like(bind("itm_grp_cd4"))).cutoff$and(S0_IM4.itm_grp_nm.like(bind("itm_grp_nm4")))),
				when(boundOr("itm_grp_flg5"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_IM5).on(S0_M4.itm_grp_cd5.eq(S0_IM5.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP5.value()).eq(S0_IM5.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M4.itm_grp_cd5.like(bind("itm_grp_cd5"))).cutoff$and(S0_IM5.itm_grp_nm.like(bind("itm_grp_nm5")))),
				when(boundOr("itm_grp_flg6"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_IM6).on(S0_M4.itm_grp_cd6.eq(S0_IM6.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP6.value()).eq(S0_IM6.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M4.itm_grp_cd6.like(bind("itm_grp_cd6"))).cutoff$and(S0_IM6.itm_grp_nm.like(bind("itm_grp_nm6")))),
				when(boundOr("itm_grp_flg7"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_IM7).on(S0_M4.itm_grp_cd7.eq(S0_IM7.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP7.value()).eq(S0_IM7.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M4.itm_grp_cd7.like(bind("itm_grp_cd7"))).cutoff$and(S0_IM7.itm_grp_nm.like(bind("itm_grp_nm7")))),
				when(boundOr("itm_grp_flg8"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_IM8).on(S0_M4.itm_grp_cd8.eq(S0_IM8.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP8.value()).eq(S0_IM8.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M4.itm_grp_cd8.like(bind("itm_grp_cd8"))).cutoff$and(S0_IM8.itm_grp_nm.like(bind("itm_grp_nm8")))),
				when(boundOr("itm_grp_flg9"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_IM9).on(S0_M4.itm_grp_cd9.eq(S0_IM9.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP9.value()).eq(S0_IM9.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M4.itm_grp_cd9.like(bind("itm_grp_cd9"))).cutoff$and(S0_IM9.itm_grp_nm.like(bind("itm_grp_nm9")))),
				when(boundOr("itm_grp_flg10"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_IM10).on(S0_M4.itm_grp_cd10.eq(S0_IM10.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP10.value()).eq(S0_IM10.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M4.itm_grp_cd10.like(bind("itm_grp_cd10"))).cutoff$and(S0_IM10.itm_grp_nm.like(bind("itm_grp_nm10")))),
				when(boundOr("sppl_grp_flg1"))
					.view(DS0C_SPPL_GRP, v -> v.leftOuterJoin(S0_BM1).on(S0_M1.bp_grp_cd1.eq(S0_BM1.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP1.value()).eq(S0_BM1.bp_grp_typ))))
					.predicate(DS0C_SPPL_GRP, p -> p.cutoff$and(S0_M1.bp_grp_cd1.like(bind("sppl_grp_cd1"))).cutoff$and(S0_BM1.bp_grp_nm.like(bind("sppl_grp_nm1")))),
				when(boundOr("sppl_grp_flg2"))
					.view(DS0C_SPPL_GRP, v -> v.leftOuterJoin(S0_BM2).on(S0_M1.bp_grp_cd2.eq(S0_BM2.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP2.value()).eq(S0_BM2.bp_grp_typ))))
					.predicate(DS0C_SPPL_GRP, p -> p.cutoff$and(S0_M1.bp_grp_cd2.like(bind("sppl_grp_cd2"))).cutoff$and(S0_BM2.bp_grp_nm.like(bind("sppl_grp_nm2")))),
				when(boundOr("sppl_grp_flg3"))
					.view(DS0C_SPPL_GRP, v -> v.leftOuterJoin(S0_BM3).on(S0_M1.bp_grp_cd3.eq(S0_BM3.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP3.value()).eq(S0_BM3.bp_grp_typ))))
					.predicate(DS0C_SPPL_GRP, p -> p.cutoff$and(S0_M1.bp_grp_cd3.like(bind("sppl_grp_cd3"))).cutoff$and(S0_BM3.bp_grp_nm.like(bind("sppl_grp_nm3")))),
				when(boundOr("sppl_grp_flg4"))
					.view(DS0C_SPPL_GRP, v -> v.leftOuterJoin(S0_BM4).on(S0_M1.bp_grp_cd4.eq(S0_BM4.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP4.value()).eq(S0_BM4.bp_grp_typ))))
					.predicate(DS0C_SPPL_GRP, p -> p.cutoff$and(S0_M1.bp_grp_cd4.like(bind("sppl_grp_cd4"))).cutoff$and(S0_BM4.bp_grp_nm.like(bind("sppl_grp_nm4")))),
				when(boundOr("sppl_grp_flg5"))
					.view(DS0C_SPPL_GRP, v -> v.leftOuterJoin(S0_BM5).on(S0_M1.bp_grp_cd5.eq(S0_BM5.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP5.value()).eq(S0_BM5.bp_grp_typ))))
					.predicate(DS0C_SPPL_GRP, p -> p.cutoff$and(S0_M1.bp_grp_cd5.like(bind("sppl_grp_cd5"))).cutoff$and(S0_BM5.bp_grp_nm.like(bind("sppl_grp_nm5")))),
				when(boundOr("sppl_grp_flg6"))
					.view(DS0C_SPPL_GRP, v -> v.leftOuterJoin(S0_BM6).on(S0_M1.bp_grp_cd6.eq(S0_BM6.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP6.value()).eq(S0_BM6.bp_grp_typ))))
					.predicate(DS0C_SPPL_GRP, p -> p.cutoff$and(S0_M1.bp_grp_cd6.like(bind("sppl_grp_cd6"))).cutoff$and(S0_BM6.bp_grp_nm.like(bind("sppl_grp_nm6")))),
				when(boundOr("sppl_grp_flg7"))
					.view(DS0C_SPPL_GRP, v -> v.leftOuterJoin(S0_BM7).on(S0_M1.bp_grp_cd7.eq(S0_BM7.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP7.value()).eq(S0_BM7.bp_grp_typ))))
					.predicate(DS0C_SPPL_GRP, p -> p.cutoff$and(S0_M1.bp_grp_cd7.like(bind("sppl_grp_cd7"))).cutoff$and(S0_BM7.bp_grp_nm.like(bind("sppl_grp_nm7")))),
				when(boundOr("sppl_grp_flg8"))
					.view(DS0C_SPPL_GRP, v -> v.leftOuterJoin(S0_BM8).on(S0_M1.bp_grp_cd8.eq(S0_BM8.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP8.value()).eq(S0_BM8.bp_grp_typ))))
					.predicate(DS0C_SPPL_GRP, p -> p.cutoff$and(S0_M1.bp_grp_cd8.like(bind("sppl_grp_cd8"))).cutoff$and(S0_BM8.bp_grp_nm.like(bind("sppl_grp_nm8")))),
				when(boundOr("sppl_grp_flg9"))
					.view(DS0C_SPPL_GRP, v -> v.leftOuterJoin(S0_BM9).on(S0_M1.bp_grp_cd9.eq(S0_BM9.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP9.value()).eq(S0_BM9.bp_grp_typ))))
					.predicate(DS0C_SPPL_GRP, p -> p.cutoff$and(S0_M1.bp_grp_cd9.like(bind("sppl_grp_cd9"))).cutoff$and(S0_BM9.bp_grp_nm.like(bind("sppl_grp_nm9")))),
				when(boundOr("sppl_grp_flg10"))
					.view(DS0C_SPPL_GRP, v -> v.leftOuterJoin(S0_BM10).on(S0_M1.bp_grp_cd10.eq(S0_BM10.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP10.value()).eq(S0_BM10.bp_grp_typ))))
					.predicate(DS0C_SPPL_GRP, p -> p.cutoff$and(S0_M1.bp_grp_cd10.like(bind("sppl_grp_cd10"))).cutoff$and(S0_BM10.bp_grp_nm.like(bind("sppl_grp_nm10"))))
			);
	}
}