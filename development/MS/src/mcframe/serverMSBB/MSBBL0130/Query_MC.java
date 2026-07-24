package mcframe.serverMSBB.MSBBL0130;

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
	 * -- MSBBL0130_MAM_SPLN_ITM_CONF_Query_S01
	 */
	static MCQueryPlan MSBBL0130_MAM_SPLN_ITM_CONF_S01() {
		MAM_SPLN_ITM_CONF_R S0_T1 = MAM_SPLN_ITM_CONF_R.create("T1");
		MAW_SPLN_ITM_CONF_KEY_R S0_WK = MAW_SPLN_ITM_CONF_KEY_R.create("WK");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBBL0130_MAM_SPLN_ITM_CONF_Query_S01")
					.mainQuery()
					.selectDistinct(
						S0_T1.spln_itm_cd,
						S0_T1.st_ym,
						S0_T1.end_ym
					)
					.from(
						S0_T1
						.innerJoin(S0_WK).on(
							bracket(
								S0_WK.spln_itm_cd.eq(S0_T1.spln_itm_cd)
							)
						)
					)
			);
	}
	
	/**
	 * -- MSBBL0130_MAM_SPLN_ITM_CONF_Query_S02
	 */
	static MCQueryPlan MSBBL0130_MAM_SPLN_ITM_CONF_S02() {
		MAM_SPLN_ITM_CONF_R S0_T1 = MAM_SPLN_ITM_CONF_R.create("T1");
		MAW_SPLN_ITM_CONF_KEY_R S0_WK = MAW_SPLN_ITM_CONF_KEY_R.create("WK");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBBL0130_MAM_SPLN_ITM_CONF_Query_S02")
					.mainQuery()
					.select(
						S0_T1.itm_cd,
						S0_T1.itm_sub1,
						S0_T1.itm_sub2,
						S0_T1.itm_sub3,
						S0_T1.st_ym,
						S0_T1.end_ym
					)
					.from(
						S0_T1
						.innerJoin(S0_WK).on(
							bracket(
								S0_WK.itm_cd.eq(S0_T1.itm_cd)
								.and(S0_WK.itm_sub1.eq(S0_T1.itm_sub1))
								.and(S0_WK.itm_sub2.eq(S0_T1.itm_sub2))
								.and(S0_WK.itm_sub3.eq(S0_T1.itm_sub3))
								.and(value(MAC_STR.NULL_VAL.value()).eq(S0_T1.spln_itm_cd))
							)
						)
					)
			);
	}
	
	/**
	 * -- MSBBL0130_MST_SPLN_FMT_Query_S01
	 */
	static MCQueryPlan MSBBL0130_MST_SPLN_FMT_S01() {
		MST_SPLN_FMT_R S0_T1 = MST_SPLN_FMT_R.create("T1");
		MAVM_RD_DPT_R S0_DAC = MAVM_RD_DPT_R.create("DAC");
		MST_WRK_R S0_T2 = MST_WRK_R.create("T2");
		MAM_DPT_R S0_M1 = MAM_DPT_R.create("M1");
		MAM_WG_R S0_M2 = MAM_WG_R.create("M2");
		MAM_BP_R S0_M3 = MAM_BP_R.create("M3");
		MAM_SPLN_ITM_R S0_M4 = MAM_SPLN_ITM_R.create("M4");
		MAM_ITM_R S0_M5 = MAM_ITM_R.create("M5");
		MAM_CUR_R S0_M6 = MAM_CUR_R.create("M6");
		MAM_ITM_TYP_D_R S0_M7 = MAM_ITM_TYP_D_R.create("M7");
		
		MAM_ITM_GRP_R S0_MMA1 = MAM_ITM_GRP_R.create("MMA1");
		MAM_ITM_GRP_R S0_MMA2 = MAM_ITM_GRP_R.create("MMA2");
		MAM_ITM_GRP_R S0_MMA3 = MAM_ITM_GRP_R.create("MMA3");
		MAM_ITM_GRP_R S0_MMA4 = MAM_ITM_GRP_R.create("MMA4");
		MAM_ITM_GRP_R S0_MMA5 = MAM_ITM_GRP_R.create("MMA5");
		MAM_ITM_GRP_R S0_MMA6 = MAM_ITM_GRP_R.create("MMA6");
		MAM_ITM_GRP_R S0_MMA7 = MAM_ITM_GRP_R.create("MMA7");
		MAM_ITM_GRP_R S0_MMA8 = MAM_ITM_GRP_R.create("MMA8");
		MAM_ITM_GRP_R S0_MMA9 = MAM_ITM_GRP_R.create("MMA9");
		MAM_ITM_GRP_R S0_MMA10 = MAM_ITM_GRP_R.create("MMA10");
		
		MAM_BP_GRP_R S0_MMB1 = MAM_BP_GRP_R.create("MMB1");
		MAM_BP_GRP_R S0_MMB2 = MAM_BP_GRP_R.create("MMB2");
		MAM_BP_GRP_R S0_MMB3 = MAM_BP_GRP_R.create("MMB3");
		MAM_BP_GRP_R S0_MMB4 = MAM_BP_GRP_R.create("MMB4");
		MAM_BP_GRP_R S0_MMB5 = MAM_BP_GRP_R.create("MMB5");
		MAM_BP_GRP_R S0_MMB6 = MAM_BP_GRP_R.create("MMB6");
		MAM_BP_GRP_R S0_MMB7 = MAM_BP_GRP_R.create("MMB7");
		MAM_BP_GRP_R S0_MMB8 = MAM_BP_GRP_R.create("MMB8");
		MAM_BP_GRP_R S0_MMB9 = MAM_BP_GRP_R.create("MMB9");
		MAM_BP_GRP_R S0_MMB10 = MAM_BP_GRP_R.create("MMB10");
		
		MCDynamicSQLID DS0C_ITM_GRP = createDynamicSQLID("DS0C_ITM_GRP");
		MCDynamicSQLID DS0C_BP_GRP = createDynamicSQLID("DS0C_BP_GRP");

		return createQueryPlan()
		.setQuery(
			sql("MSBBL0130_MST_SPLN_FMT_Query_S01")
				.mainQuery()
				.select(
					S0_T1.spln_fmt_no,
					S0_T1.st_ym,
					S0_T1.end_ym,
					S0_T1.dpt_cd,
					S0_M1.dpt_nm,
					S0_T1.cst_cd,
					S0_M3.bp_nm.as("cst_nm"),
					S0_T1.wrk_no,
					S0_T2.wrk_nm,
					S0_T1.spln_itm_cd,
					S0_M4.spln_itm_nm,
					S0_T1.itm_cd,
					S0_T1.itm_sub1,
					S0_T1.itm_sub2,
					S0_T1.itm_sub3,
					S0_M5.itm_nm,
					S0_T1.cur_cd,
					S0_M6.cur_nm,
					bracket(
						cases()
							.when(S0_T1.spln_itm_cd.eq(value(MAC_STR.NULL_VAL.value())))
								.then(S0_T1.spln_set_typ)
							.otherwise(S0_M4.spln_set_typ)
					).as("spln_set_typ"),
					S0_T1.cst_cd_unit_flg,
					S0_T1.wrk_no_unit_flg,
					S0_T1.disp_seq,
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
							S0_DAC.dpt_cd.eq(S0_T1.dpt_cd)
						)
					)
					.leftOuterJoin(S0_T2).on(
						bracket(
							S0_T2.wrk_no.eq(S0_T1.wrk_no)
						)
					)
					.leftOuterJoin(S0_M1).on(
						bracket(
							S0_M1.dpt_cd.eq(S0_T1.dpt_cd)
							.and(S0_M1.sls_dpt_flg.eq(value(true)))
							.and(
								MAPA_DT$F_GET_YM_ST_DT_NE2(
									S0_T1.st_ym,
									bind("ac_cl_day"),
									bind("ac_cl_mon_base")
								).between(S0_M1.st_dt, S0_M1.end_dt)
							)
						)
					)
					.leftOuterJoin(S0_M2).on(
						bracket(
							S0_M2.wg_cd.eq(S0_M1.wg_cd)
						)
					)
					.leftOuterJoin(S0_M3).on(
						bracket(
							S0_M3.bp_cd.eq(S0_T1.cst_cd)
							.and(S0_M3.cst_flg.eq(value(true)))
						)
					)
					.leftOuterJoin(S0_M4).on(
						bracket(
							S0_M4.spln_itm_cd.eq(S0_T1.spln_itm_cd)
						)
					)
					.leftOuterJoin(S0_M5).on(
						bracket(
							S0_M5.itm_cd.eq(S0_T1.itm_cd)
							.and(S0_M5.itm_sub1.eq(S0_T1.itm_sub1))
							.and(S0_M5.itm_sub2.eq(S0_T1.itm_sub2))
							.and(S0_M5.itm_sub3.eq(S0_T1.itm_sub3))
						)
					)
					.leftOuterJoin(S0_M6).on(
						bracket(
							S0_M6.cur_cd.eq(S0_T1.cur_cd)
						)
					)
					.leftOuterJoin(S0_M7).on(
						bracket(
							S0_M7.itm_typ.eq(S0_M5.itm_typ)
							.and(S0_M7.itm_typ_d_cd.eq(S0_M5.itm_typ_d_cd))
						)
					)
					.addDynamicView(DS0C_ITM_GRP)
					.addDynamicView(DS0C_BP_GRP)
				)
				.where(
					value(0).eq(value(0))
					.cutoff$and(S0_T1.st_ym.gte(bind("spln_st_ym_fr")))
					.cutoff$and(S0_T1.st_ym.lte(bind("spln_st_ym_to")))
					.cutoff$and(S0_T1.end_ym.gte(bind("spln_end_ym_fr")))
					.cutoff$and(S0_T1.end_ym.lte(bind("spln_end_ym_to")))
					.cutoff$and(S0_T1.dpt_cd.like(bind("dpt_cd")))
					.cutoff$and(S0_M1.dpt_nm.like(bind("dpt_nm")))
					.cutoff$and(S0_M1.wg_cd.like(bind("wg_cd")))
					.cutoff$and(S0_M2.wg_nm.like(bind("wg_nm")))
					.cutoff$and(S0_T1.cst_cd.like(bind("cst_cd")))
					.cutoff$and(S0_M3.bp_nm.like(bind("cst_nm")))
					.cutoff$and(S0_T1.wrk_no.like(bind("wrk_no")))
					.cutoff$and(S0_T2.wrk_nm.like(bind("wrk_nm")))
					.cutoff$and(S0_T1.spln_itm_cd.like(bind("spln_itm_cd")))
					.cutoff$and(S0_M4.spln_itm_nm.like(bind("spln_itm_nm")))
					.cutoff$and(S0_T1.itm_cd.like(bind("itm_cd")))
					.cutoff$and(S0_T1.itm_sub1.like(bind("itm_sub1")))
					.cutoff$and(S0_T1.itm_sub2.like(bind("itm_sub2")))
					.cutoff$and(S0_T1.itm_sub3.like(bind("itm_sub3")))
					.cutoff$and(S0_M5.itm_nm.like(bind("itm_nm")))
					.cutoff$and(S0_M5.itm_typ.like(bind("itm_typ")))
					.cutoff$and(S0_M5.itm_typ_d_cd.like(bind("itm_typ_d_cd")))
					.cutoff$and(S0_M7.itm_typ_d_nm.like(bind("itm_typ_d_nm")))
					.cutoff$and(S0_T1.intr_rmrks.like(bind("intr_rmrks")))
					.cutoff$and(S0_T1.sub_char1.like(bind("sub_char1")))
					.cutoff$and(S0_T1.sub_char2.like(bind("sub_char2")))
					.cutoff$and(S0_T1.sub_char3.like(bind("sub_char3")))
					.addDynamicPredicate(DS0C_ITM_GRP)
					.addDynamicPredicate(DS0C_BP_GRP)
				)
				.orderBy(
					S0_T1.dpt_cd.asc(),
					S0_T1.cst_cd.asc(),
					S0_T1.wrk_no.asc(),
					S0_T1.spln_itm_cd.asc(),
					S0_T1.itm_cd.asc(),
					S0_T1.itm_sub1.asc(),
					S0_T1.itm_sub2.asc(),
					S0_T1.itm_sub3.asc(),
					S0_T1.st_ym.asc()
				)
			)
			.setDynamicSQLInfo(
				when(boundOr("itm_grp_flg1"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MMA1).on(nvl(S0_M4.itm_grp_cd1, S0_M5.itm_grp_cd1).eq(S0_MMA1.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP1.value()).eq(S0_MMA1.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(nvl(S0_M4.itm_grp_cd1, S0_M5.itm_grp_cd1).like(bind("itm_grp_cd1"))).cutoff$and(S0_MMA1.itm_grp_nm.like(bind("itm_grp_nm1")))),
				when(boundOr("itm_grp_flg2"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MMA2).on(nvl(S0_M4.itm_grp_cd2, S0_M5.itm_grp_cd2).eq(S0_MMA2.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP2.value()).eq(S0_MMA2.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(nvl(S0_M4.itm_grp_cd2, S0_M5.itm_grp_cd2).like(bind("itm_grp_cd2"))).cutoff$and(S0_MMA2.itm_grp_nm.like(bind("itm_grp_nm2")))),
				when(boundOr("itm_grp_flg3"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MMA3).on(nvl(S0_M4.itm_grp_cd3, S0_M5.itm_grp_cd3).eq(S0_MMA3.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP3.value()).eq(S0_MMA3.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(nvl(S0_M4.itm_grp_cd3, S0_M5.itm_grp_cd3).like(bind("itm_grp_cd3"))).cutoff$and(S0_MMA3.itm_grp_nm.like(bind("itm_grp_nm3")))),
				when(boundOr("itm_grp_flg4"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MMA4).on(nvl(S0_M4.itm_grp_cd4, S0_M5.itm_grp_cd4).eq(S0_MMA4.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP4.value()).eq(S0_MMA4.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(nvl(S0_M4.itm_grp_cd4, S0_M5.itm_grp_cd4).like(bind("itm_grp_cd4"))).cutoff$and(S0_MMA4.itm_grp_nm.like(bind("itm_grp_nm4")))),
				when(boundOr("itm_grp_flg5"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MMA5).on(nvl(S0_M4.itm_grp_cd5, S0_M5.itm_grp_cd5).eq(S0_MMA5.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP5.value()).eq(S0_MMA5.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(nvl(S0_M4.itm_grp_cd5, S0_M5.itm_grp_cd5).like(bind("itm_grp_cd5"))).cutoff$and(S0_MMA5.itm_grp_nm.like(bind("itm_grp_nm5")))),
				when(boundOr("itm_grp_flg6"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MMA6).on(nvl(S0_M4.itm_grp_cd6, S0_M5.itm_grp_cd6).eq(S0_MMA6.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP6.value()).eq(S0_MMA6.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(nvl(S0_M4.itm_grp_cd6, S0_M5.itm_grp_cd6).like(bind("itm_grp_cd6"))).cutoff$and(S0_MMA6.itm_grp_nm.like(bind("itm_grp_nm6")))),
				when(boundOr("itm_grp_flg7"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MMA7).on(nvl(S0_M4.itm_grp_cd7, S0_M5.itm_grp_cd7).eq(S0_MMA7.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP7.value()).eq(S0_MMA7.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(nvl(S0_M4.itm_grp_cd7, S0_M5.itm_grp_cd7).like(bind("itm_grp_cd7"))).cutoff$and(S0_MMA7.itm_grp_nm.like(bind("itm_grp_nm7")))),
				when(boundOr("itm_grp_flg8"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MMA8).on(nvl(S0_M4.itm_grp_cd8, S0_M5.itm_grp_cd8).eq(S0_MMA8.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP8.value()).eq(S0_MMA8.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(nvl(S0_M4.itm_grp_cd8, S0_M5.itm_grp_cd8).like(bind("itm_grp_cd8"))).cutoff$and(S0_MMA8.itm_grp_nm.like(bind("itm_grp_nm8")))),
				when(boundOr("itm_grp_flg9"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MMA9).on(nvl(S0_M4.itm_grp_cd9, S0_M5.itm_grp_cd9).eq(S0_MMA9.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP9.value()).eq(S0_MMA9.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(nvl(S0_M4.itm_grp_cd9, S0_M5.itm_grp_cd9).like(bind("itm_grp_cd9"))).cutoff$and(S0_MMA9.itm_grp_nm.like(bind("itm_grp_nm9")))),
				when(boundOr("itm_grp_flg10"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MMA10).on(nvl(S0_M4.itm_grp_cd10, S0_M5.itm_grp_cd10).eq(S0_MMA10.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP10.value()).eq(S0_MMA10.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(nvl(S0_M4.itm_grp_cd10, S0_M5.itm_grp_cd10).like(bind("itm_grp_cd10"))).cutoff$and(S0_MMA10.itm_grp_nm.like(bind("itm_grp_nm10")))),
				when(boundOr("bp_grp_flg1"))
					.view(DS0C_BP_GRP, v -> v.leftOuterJoin(S0_MMB1).on(S0_M3.bp_grp_cd1.eq(S0_MMB1.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP1.value()).eq(S0_MMB1.bp_grp_typ))))
					.predicate(DS0C_BP_GRP, p -> p.cutoff$and(S0_M3.bp_grp_cd1.like(bind("bp_grp_cd1"))).cutoff$and(S0_MMB1.bp_grp_nm.like(bind("bp_grp_nm1")))),
				when(boundOr("bp_grp_flg2"))
					.view(DS0C_BP_GRP, v -> v.leftOuterJoin(S0_MMB2).on(S0_M3.bp_grp_cd2.eq(S0_MMB2.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP2.value()).eq(S0_MMB2.bp_grp_typ))))
					.predicate(DS0C_BP_GRP, p -> p.cutoff$and(S0_M3.bp_grp_cd2.like(bind("bp_grp_cd2"))).cutoff$and(S0_MMB2.bp_grp_nm.like(bind("bp_grp_nm2")))),
				when(boundOr("bp_grp_flg3"))
					.view(DS0C_BP_GRP, v -> v.leftOuterJoin(S0_MMB3).on(S0_M3.bp_grp_cd3.eq(S0_MMB3.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP3.value()).eq(S0_MMB3.bp_grp_typ))))
					.predicate(DS0C_BP_GRP, p -> p.cutoff$and(S0_M3.bp_grp_cd3.like(bind("bp_grp_cd3"))).cutoff$and(S0_MMB3.bp_grp_nm.like(bind("bp_grp_nm3")))),
				when(boundOr("bp_grp_flg4"))
					.view(DS0C_BP_GRP, v -> v.leftOuterJoin(S0_MMB4).on(S0_M3.bp_grp_cd4.eq(S0_MMB4.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP4.value()).eq(S0_MMB4.bp_grp_typ))))
					.predicate(DS0C_BP_GRP, p -> p.cutoff$and(S0_M3.bp_grp_cd4.like(bind("bp_grp_cd4"))).cutoff$and(S0_MMB4.bp_grp_nm.like(bind("bp_grp_nm4")))),
				when(boundOr("bp_grp_flg5"))
					.view(DS0C_BP_GRP, v -> v.leftOuterJoin(S0_MMB5).on(S0_M3.bp_grp_cd5.eq(S0_MMB5.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP5.value()).eq(S0_MMB5.bp_grp_typ))))
					.predicate(DS0C_BP_GRP, p -> p.cutoff$and(S0_M3.bp_grp_cd5.like(bind("bp_grp_cd5"))).cutoff$and(S0_MMB5.bp_grp_nm.like(bind("bp_grp_nm5")))),
				when(boundOr("bp_grp_flg6"))
					.view(DS0C_BP_GRP, v -> v.leftOuterJoin(S0_MMB6).on(S0_M3.bp_grp_cd6.eq(S0_MMB6.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP6.value()).eq(S0_MMB6.bp_grp_typ))))
					.predicate(DS0C_BP_GRP, p -> p.cutoff$and(S0_M3.bp_grp_cd6.like(bind("bp_grp_cd6"))).cutoff$and(S0_MMB6.bp_grp_nm.like(bind("bp_grp_nm6")))),
				when(boundOr("bp_grp_flg7"))
					.view(DS0C_BP_GRP, v -> v.leftOuterJoin(S0_MMB7).on(S0_M3.bp_grp_cd7.eq(S0_MMB7.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP7.value()).eq(S0_MMB7.bp_grp_typ))))
					.predicate(DS0C_BP_GRP, p -> p.cutoff$and(S0_M3.bp_grp_cd7.like(bind("bp_grp_cd7"))).cutoff$and(S0_MMB7.bp_grp_nm.like(bind("bp_grp_nm7")))),
				when(boundOr("bp_grp_flg8"))
					.view(DS0C_BP_GRP, v -> v.leftOuterJoin(S0_MMB8).on(S0_M3.bp_grp_cd8.eq(S0_MMB8.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP8.value()).eq(S0_MMB8.bp_grp_typ))))
					.predicate(DS0C_BP_GRP, p -> p.cutoff$and(S0_M3.bp_grp_cd8.like(bind("bp_grp_cd8"))).cutoff$and(S0_MMB8.bp_grp_nm.like(bind("bp_grp_nm8")))),
				when(boundOr("bp_grp_flg9"))
					.view(DS0C_BP_GRP, v -> v.leftOuterJoin(S0_MMB9).on(S0_M3.bp_grp_cd9.eq(S0_MMB9.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP9.value()).eq(S0_MMB9.bp_grp_typ))))
					.predicate(DS0C_BP_GRP, p -> p.cutoff$and(S0_M3.bp_grp_cd9.like(bind("bp_grp_cd9"))).cutoff$and(S0_MMB9.bp_grp_nm.like(bind("bp_grp_nm9")))),
				when(boundOr("bp_grp_flg10"))
					.view(DS0C_BP_GRP, v -> v.leftOuterJoin(S0_MMB10).on(S0_M3.bp_grp_cd10.eq(S0_MMB10.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP10.value()).eq(S0_MMB10.bp_grp_typ))))
					.predicate(DS0C_BP_GRP, p -> p.cutoff$and(S0_M3.bp_grp_cd10.like(bind("bp_grp_cd10"))).cutoff$and(S0_MMB10.bp_grp_nm.like(bind("bp_grp_nm10"))))
			);
	}
	
	/**
	 * -- MSBBL0130_MST_SPLN_FMT_Query_S02
	 */
	static MCQueryPlan MSBBL0130_MST_SPLN_FMT_S02() {
		MST_SPLN_FMT_R S0_T1 = MST_SPLN_FMT_R.create("T1");
		MSW_SPLN_FMT_R S0_WK = MSW_SPLN_FMT_R.create("WK");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBBL0130_MST_SPLN_FMT_Query_S02")
					.mainQuery()
					.select(
						S0_T1.spln_fmt_no,
						S0_T1.dpt_cd,
						S0_T1.cst_cd,
						S0_T1.wrk_no,
						S0_T1.spln_itm_cd,
						S0_T1.itm_cd,
						S0_T1.itm_sub1,
						S0_T1.itm_sub2,
						S0_T1.itm_sub3,
						S0_T1.st_ym,
						S0_T1.end_ym,
						S0_T1.cur_cd,
						S0_T1.cst_cd_unit_flg,
						S0_T1.wrk_no_unit_flg,
						S0_T1.spln_set_typ,
						S0_T1.upd_cntr
					)
					.from(
						S0_T1
						.innerJoin(S0_WK).on(
							bracket(
								S0_WK.dpt_cd.eq(S0_T1.dpt_cd)
								.and(S0_WK.spln_itm_cd.eq(S0_T1.spln_itm_cd))
								.and(S0_WK.itm_cd.eq(S0_T1.itm_cd))
								.and(S0_WK.itm_sub1.eq(S0_T1.itm_sub1))
								.and(S0_WK.itm_sub2.eq(S0_T1.itm_sub2))
								.and(S0_WK.itm_sub3.eq(S0_T1.itm_sub3))
							)
						)
					)
			);
	}
	
	/**
	 * -- MSBBL0130_MST_SPLN_FMT_Query_S04
	 */
	static MCQueryPlan MSBBL0130_MST_SPLN_FMT_S04() {
		MST_SPLN_FMT_R S0_T1 = MST_SPLN_FMT_R.create("T1");
		MSW_SPLN_FMT_R S0_WK = MSW_SPLN_FMT_R.create("WK");
		MAM_DPT_R S0_M1 = MAM_DPT_R.create("M1");
		MAM_BP_R S0_M2 = MAM_BP_R.create("M2");
		MAM_SPLN_ITM_R S0_M3 = MAM_SPLN_ITM_R.create("M3");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBBL0130_MST_SPLN_FMT_Query_S04")
					.mainQuery()
					.selectDistinct(
						S0_T1.spln_fmt_no,
						S0_T1.st_ym,
						S0_T1.end_ym,
						S0_T1.dpt_cd,
						S0_M1.dpt_nm,
						S0_T1.cst_cd,
						S0_M2.bp_nm.as("cst_nm"),
						S0_T1.wrk_no,
						S0_T1.spln_itm_cd,
						S0_M3.spln_itm_nm,
						S0_T1.itm_cd,
						S0_T1.itm_sub1,
						S0_T1.itm_sub2,
						S0_T1.itm_sub3,
						S0_T1.cur_cd,
						bracket(
							cases()
								.when(S0_T1.spln_itm_cd.eq(value(MAC_STR.NULL_VAL.value())))
									.then(S0_T1.spln_set_typ)
								.otherwise(S0_M3.spln_set_typ)
						).as("spln_set_typ"),
						S0_T1.cst_cd_unit_flg,
						S0_T1.wrk_no_unit_flg,
						S0_T1.disp_seq,
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
						.innerJoin(S0_WK).on(
							bracket(
								S0_WK.dpt_cd.eq(S0_T1.dpt_cd)
								.and(S0_WK.cst_cd.eq(S0_T1.cst_cd))
								.and(S0_WK.wrk_no.eq(S0_T1.wrk_no))
								.and(S0_WK.spln_itm_cd.eq(S0_T1.spln_itm_cd))
								.and(S0_WK.itm_cd.eq(S0_T1.itm_cd))
								.and(S0_WK.itm_sub1.eq(S0_T1.itm_sub1))
								.and(S0_WK.itm_sub2.eq(S0_T1.itm_sub2))
								.and(S0_WK.itm_sub3.eq(S0_T1.itm_sub3))
							)
						)
						.leftOuterJoin(S0_M1).on(
							bracket(
								S0_M1.dpt_cd.eq(S0_T1.dpt_cd)
								.and(S0_M1.sls_dpt_flg.eq(value(true)))
								.and(
									MAPA_DT$F_GET_YM_ST_DT_NE2(
										S0_T1.st_ym,
										bind("ac_cl_day"),
										bind("ac_cl_mon_base")
									).between(S0_M1.st_dt, S0_M1.end_dt)
								)
							)
						)
						.leftOuterJoin(S0_M2).on(
							bracket(
								S0_M2.bp_cd.eq(S0_T1.cst_cd)
								.and(S0_M2.cst_flg.eq(value(true)))
							)
						)
						.leftOuterJoin(S0_M3).on(
							bracket(
								S0_M3.spln_itm_cd.eq(S0_T1.spln_itm_cd)
							)
						)
					)
			)
			.setJoinInfo(
				joinInfo(
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
						.add(MAM_ITM_R.class, r -> toCondition(
							r.getStringNE("itm_cd"),
							r.getStringNE("itm_sub1"),
							r.getStringNE("itm_sub2"),
							r.getStringNE("itm_sub3")
						))
						.addSelect(m -> toArray(
							m.itm_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("itm_nm", m.itm_nm());
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
					})
				)
			);
	}
	
	/**
	 * -- MSBBL0130_MST_SPLN_SUM_DTL_Query_S01
	 */
	static MCQueryPlan MSBBL0130_MST_SPLN_SUM_DTL_S01() {
		MST_SPLN_SUM_DTL_R S0_T1 = MST_SPLN_SUM_DTL_R.create("T1");
		MSW_SPLN_FMT_R S0_W1 = MSW_SPLN_FMT_R.create("W1");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBBL0130_MST_SPLN_SUM_DTL_Query_S01")
					.mainQuery()
					.selectDistinct(
						S0_T1.dpt_cd,
						S0_T1.cst_cd,
						S0_T1.wrk_no,
						S0_T1.spln_itm_cd,
						S0_T1.itm_cd,
						S0_T1.itm_sub1,
						S0_T1.itm_sub2,
						S0_T1.itm_sub3,
						S0_T1.cur_cd,
						S0_T1.spln_ym.as("st_ym")
					)
					.from(
						S0_T1
						.innerJoin(S0_W1).on(
							bracket(
								S0_W1.dpt_cd.eq(S0_T1.dpt_cd)
								.and(S0_W1.cst_cd.eq(S0_T1.cst_cd))
								.and(S0_W1.wrk_no.eq(S0_T1.wrk_no))
								.and(S0_W1.spln_itm_cd.eq(S0_T1.spln_itm_cd))
								.and(S0_W1.itm_cd.eq(S0_T1.itm_cd))
								.and(S0_W1.itm_sub1.eq(S0_T1.itm_sub1))
								.and(S0_W1.itm_sub2.eq(S0_T1.itm_sub2))
								.and(S0_W1.itm_sub3.eq(S0_T1.itm_sub3))
								.and(S0_W1.cur_cd.eq(S0_T1.cur_cd))
								.and(S0_W1.st_ym.lte(S0_T1.spln_ym))
								.and(S0_W1.end_ym.gte(S0_T1.spln_ym))
							)
						)
					)
			);
	}
	
	/**
	 * -- MSBBL0130_MST_SPLN_USR_DTL_Query_S01
	 */
	static MCQueryPlan MSBBL0130_MST_SPLN_USR_DTL_S01() {
		MST_SPLN_USR_DTL_R S0_T1 = MST_SPLN_USR_DTL_R.create("T1");
		MSW_SPLN_FMT_R S0_W1 = MSW_SPLN_FMT_R.create("W1");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBBL0130_MST_SPLN_USR_DTL_Query_S01")
					.mainQuery()
					.selectDistinct(
						S0_T1.dpt_cd,
						S0_T1.cst_cd,
						S0_T1.wrk_no,
						S0_T1.spln_itm_cd,
						S0_T1.itm_cd,
						S0_T1.itm_sub1,
						S0_T1.itm_sub2,
						S0_T1.itm_sub3,
						S0_T1.cur_cd,
						S0_T1.spln_ym.as("st_ym")
					)
					.from(
						S0_T1
						.innerJoin(S0_W1).on(
							bracket(
								S0_W1.dpt_cd.eq(S0_T1.dpt_cd)
								.and(S0_W1.cst_cd.eq(S0_T1.cst_cd))
								.and(S0_W1.wrk_no.eq(S0_T1.wrk_no))
								.and(S0_W1.spln_itm_cd.eq(S0_T1.spln_itm_cd))
								.and(S0_W1.itm_cd.eq(S0_T1.itm_cd))
								.and(S0_W1.itm_sub1.eq(S0_T1.itm_sub1))
								.and(S0_W1.itm_sub2.eq(S0_T1.itm_sub2))
								.and(S0_W1.itm_sub3.eq(S0_T1.itm_sub3))
								.and(S0_W1.cur_cd.eq(S0_T1.cur_cd))
								.and(S0_W1.st_ym.lte(S0_T1.spln_ym))
								.and(S0_W1.end_ym.gte(S0_T1.spln_ym))
							)
						)
					)
			);
	}
	
	/**
	 * -- MSBBL0130_MSW_SPLN_FMT_Query_S01
	 */
	static MCQueryPlan MSBBL0130_MSW_SPLN_FMT_S01() {
		MSW_SPLN_FMT_R S0_T1 = MSW_SPLN_FMT_R.create("T1");
		MAM_DPT_R S0_M1 = MAM_DPT_R.create("M1");
		MAM_BP_R S0_M2 = MAM_BP_R.create("M2");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBBL0130_MSW_SPLN_FMT_Query_S01")
					.mainQuery()
					.select(
						S0_T1.st_ym,
						S0_T1.end_ym,
						S0_T1.dpt_cd,
						S0_M1.dpt_nm,
						S0_T1.cst_cd,
						S0_M2.bp_nm.as("cst_nm"),
						S0_T1.wrk_no,
						S0_T1.spln_itm_cd,
						S0_T1.itm_cd,
						S0_T1.itm_sub1,
						S0_T1.itm_sub2,
						S0_T1.itm_sub3,
						S0_T1.cur_cd
					)
					.from(
						S0_T1
						.leftOuterJoin(S0_M1).on(
							bracket(
								S0_M1.dpt_cd.eq(S0_T1.dpt_cd)
								.and(S0_M1.sls_dpt_flg.eq(value(true)))
								.and(
									MAPA_DT$F_GET_YM_ST_DT_NE2(
										S0_T1.st_ym,
										bind("ac_cl_day"),
										bind("ac_cl_mon_base")
									).between(S0_M1.st_dt, S0_M1.end_dt)
								)
							)
						)
						.leftOuterJoin(S0_M2).on(
							bracket(
								S0_M2.bp_cd.eq(S0_T1.cst_cd)
								.and(S0_M2.cst_flg.eq(value(true)))
							)
						)
					)
			)
			.setJoinInfo(
				joinInfo(
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
						.add(MAM_ITM_R.class, r -> toCondition(
							r.getStringNE("itm_cd"),
							r.getStringNE("itm_sub1"),
							r.getStringNE("itm_sub2"),
							r.getStringNE("itm_sub3")
						))
						.addSelect(m -> toArray(
							m.itm_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("itm_nm", m.itm_nm());
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
					})
				)
			);
	}
}