package mcframe.serverMSBB.MSBBL1040;

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
	 * -- MSBBL1040_MST_WRK_Query_S01
	 */
	static MCQueryPlan MSBBL1040_MST_WRK_S01() {
		MST_WRK_R S0_T1 = MST_WRK_R.create("T1");
		MST_WRK_MNG_R S0_T2 = MST_WRK_MNG_R.create("T2");
		MST_WRK_MNG_R S0_T3 = MST_WRK_MNG_R.create("T3");
		MST_CST_WRK_R S0_T4 = MST_CST_WRK_R.create("T4");
		MAM_CUR_R S0_M1 = MAM_CUR_R.create("M1");
		MAM_BP_R S0_M2 = MAM_BP_R.create("M2");
		MAM_BP_GRP_R S0_MM1 = MAM_BP_GRP_R.create("MM1");
		MAM_BP_GRP_R S0_MM2 = MAM_BP_GRP_R.create("MM2");
		MAM_BP_GRP_R S0_MM3 = MAM_BP_GRP_R.create("MM3");
		MAM_BP_GRP_R S0_MM4 = MAM_BP_GRP_R.create("MM4");
		MAM_BP_GRP_R S0_MM5 = MAM_BP_GRP_R.create("MM5");
		MAM_BP_GRP_R S0_MM6 = MAM_BP_GRP_R.create("MM6");
		MAM_BP_GRP_R S0_MM7 = MAM_BP_GRP_R.create("MM7");
		MAM_BP_GRP_R S0_MM8 = MAM_BP_GRP_R.create("MM8");
		MAM_BP_GRP_R S0_MM9 = MAM_BP_GRP_R.create("MM9");
		MAM_BP_GRP_R S0_MM10 = MAM_BP_GRP_R.create("MM10");
		
		MCDynamicSQLID DS0C_CST_GRP = createDynamicSQLID("DS0C_CST_GRP");
		
		return createQueryPlan()
			.setQuery(
				sql("MSBBL1040_MST_WRK_Query_S01")
					.mainQuery()
					.selectDistinct(
						S0_T1.wrk_no,
						S0_T1.wrk_nm,
						S0_T1.st_dt,
						S0_T1.end_dt,
						S0_T1.wrk_sts_cd,
						S0_T2.wrk_mng_nm.as("wrk_sts_nm"),
						S0_T1.slo_acc_cd,
						S0_T3.wrk_mng_nm.as("slo_acc_nm"),
						S0_T1.cur_cd,
						S0_M1.cur_nm,
						S0_M1.amt_dec_place,
						S0_T1.term_cond,
						S0_T1.budget,
						S0_T1.slo_rsn,
						S0_T1.fail_rsn,
						S0_T1.wrk_rmrks,
						S0_T1.sub_char1,
						S0_T1.sub_char2,
						S0_T1.sub_char3,
						S0_T1.wrk_ar_flg,
						S0_T1.can_flg,
						S0_T1.ins_usr_id,
						S0_T1.ins_usr_nm,
						S0_T1.ins_ts,
						S0_T1.ins_func_id,
						S0_T1.upd_cntr,
						S0_T1.upd_usr_id,
						S0_T1.upd_usr_nm,
						S0_T1.upd_ts,
						S0_T1.upd_func_id,
						S0_T1.upd_srv_req_no
					)
					.from(
						S0_T1
						.leftOuterJoin(S0_T2).on(
							bracket(
								S0_T1.wrk_sts_cd.eq(S0_T2.wrk_mng_cd)
								.and(S0_T2.wrk_mng_typ.eq(value(MSC_WRK_MNG_TYP.WRK_STS.value())))
							)
						)
						.leftOuterJoin(S0_T3).on(
							bracket(
								S0_T1.slo_acc_cd.eq(S0_T3.wrk_mng_cd)
								.and(S0_T3.wrk_mng_typ.eq(value(MSC_WRK_MNG_TYP.SLO_ACC.value())))
							)
						)
						.leftOuterJoin(S0_T4).on(
							bracket(
								S0_T1.wrk_no.eq(S0_T4.wrk_no)
							)
						)
						.leftOuterJoin(S0_M1).on(
							bracket(
								S0_T1.cur_cd.eq(S0_M1.cur_cd)
							)
						)
						.leftOuterJoin(S0_M2).on(
							bracket(
								S0_T4.cst_cd.eq(S0_M2.bp_cd)
							)
						)
						.addDynamicView(DS0C_CST_GRP)
					)
					.where(
						value(0).eq(value(0))
						.cutoff$and(S0_T1.st_dt.gte(bind("st_dt_fr")))
						.cutoff$and(S0_T1.st_dt.lte(bind("st_dt_to")))
						.cutoff$and(S0_T1.end_dt.gte(bind("end_dt_fr")))
						.cutoff$and(S0_T1.end_dt.lte(bind("end_dt_to")))
						.cutoff$and(S0_T4.cst_cd.like(bind("cst_cd")))
						.cutoff$and(
							nvl(
								S0_T4.cst_nm,
								S0_M2.bp_nm
							).like(bind("cst_nm"))
						)
						.cutoff$and(S0_T1.wrk_rmrks.like(bind("wrk_rmrks")))
						.cutoff$and(S0_T1.wrk_no.like(bind("wrk_no")))
						.cutoff$and(S0_T1.wrk_nm.like(bind("wrk_nm")))
						.cutoff$and(S0_T1.wrk_sts_cd.like(bind("wrk_sts_cd")))
						.cutoff$and(S0_T2.wrk_mng_nm.like(bind("wrk_sts_nm")))
						.cutoff$and(S0_T1.slo_acc_cd.like(bind("slo_acc_cd")))
						.cutoff$and(S0_T3.wrk_mng_nm.like(bind("slo_acc_nm")))
						.cutoff$and(S0_T1.cur_cd.like(bind("cur_cd")))
						.cutoff$and(S0_M1.cur_nm.like(bind("cur_nm")))
						.cutoff$and(S0_T1.budget.gte(bind("budget_fr")))
						.cutoff$and(S0_T1.budget.lte(bind("budget_to")))
						.cutoff$and(S0_T1.slo_rsn.like(bind("slo_rsn")))
						.cutoff$and(S0_T1.fail_rsn.like(bind("fail_rsn")))
						.cutoff$and(S0_T1.sub_char1.like(bind("sub_char1")))
						.cutoff$and(S0_T1.sub_char2.like(bind("sub_char2")))
						.cutoff$and(S0_T1.sub_char3.like(bind("sub_char3")))
						.and(
							bind("inc_can_flg").eq(value(false))
							.and(S0_T1.can_flg.eq(value(false)))
							.or(bind("inc_can_flg").eq(value(true)))
						)
						.addDynamicPredicate(DS0C_CST_GRP)
					)
					.orderBy(S0_T1.wrk_no.asc())
			)
			.setDynamicSQLInfo(
				when(boundOr("cst_grp_flg1"))
					.view(DS0C_CST_GRP, v -> v.leftOuterJoin(S0_MM1).on(S0_M2.bp_grp_cd1.eq(S0_MM1.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP1.value()).eq(S0_MM1.bp_grp_typ))))
					.predicate(DS0C_CST_GRP, p -> p.cutoff$and(S0_M2.bp_grp_cd1.like(bind("cst_grp_cd1"))).cutoff$and(S0_MM1.bp_grp_nm.like(bind("cst_grp_nm1")))),
				when(boundOr("cst_grp_flg2"))
					.view(DS0C_CST_GRP, v -> v.leftOuterJoin(S0_MM2).on(S0_M2.bp_grp_cd2.eq(S0_MM2.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP2.value()).eq(S0_MM2.bp_grp_typ))))
					.predicate(DS0C_CST_GRP, p -> p.cutoff$and(S0_M2.bp_grp_cd2.like(bind("cst_grp_cd2"))).cutoff$and(S0_MM2.bp_grp_nm.like(bind("cst_grp_nm2")))),
				when(boundOr("cst_grp_flg3"))
					.view(DS0C_CST_GRP, v -> v.leftOuterJoin(S0_MM3).on(S0_M2.bp_grp_cd3.eq(S0_MM3.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP3.value()).eq(S0_MM3.bp_grp_typ))))
					.predicate(DS0C_CST_GRP, p -> p.cutoff$and(S0_M2.bp_grp_cd3.like(bind("cst_grp_cd3"))).cutoff$and(S0_MM3.bp_grp_nm.like(bind("cst_grp_nm3")))),
				when(boundOr("cst_grp_flg4"))
					.view(DS0C_CST_GRP, v -> v.leftOuterJoin(S0_MM4).on(S0_M2.bp_grp_cd4.eq(S0_MM4.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP4.value()).eq(S0_MM4.bp_grp_typ))))
					.predicate(DS0C_CST_GRP, p -> p.cutoff$and(S0_M2.bp_grp_cd4.like(bind("cst_grp_cd4"))).cutoff$and(S0_MM4.bp_grp_nm.like(bind("cst_grp_nm4")))),
				when(boundOr("cst_grp_flg5"))
					.view(DS0C_CST_GRP, v -> v.leftOuterJoin(S0_MM5).on(S0_M2.bp_grp_cd5.eq(S0_MM5.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP5.value()).eq(S0_MM5.bp_grp_typ))))
					.predicate(DS0C_CST_GRP, p -> p.cutoff$and(S0_M2.bp_grp_cd5.like(bind("cst_grp_cd5"))).cutoff$and(S0_MM5.bp_grp_nm.like(bind("cst_grp_nm5")))),
				when(boundOr("cst_grp_flg6"))
					.view(DS0C_CST_GRP, v -> v.leftOuterJoin(S0_MM6).on(S0_M2.bp_grp_cd6.eq(S0_MM6.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP6.value()).eq(S0_MM6.bp_grp_typ))))
					.predicate(DS0C_CST_GRP, p -> p.cutoff$and(S0_M2.bp_grp_cd6.like(bind("cst_grp_cd6"))).cutoff$and(S0_MM6.bp_grp_nm.like(bind("cst_grp_nm6")))),
				when(boundOr("cst_grp_flg7"))
					.view(DS0C_CST_GRP, v -> v.leftOuterJoin(S0_MM7).on(S0_M2.bp_grp_cd7.eq(S0_MM7.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP7.value()).eq(S0_MM7.bp_grp_typ))))
					.predicate(DS0C_CST_GRP, p -> p.cutoff$and(S0_M2.bp_grp_cd7.like(bind("cst_grp_cd7"))).cutoff$and(S0_MM7.bp_grp_nm.like(bind("cst_grp_nm7")))),
				when(boundOr("cst_grp_flg8"))
					.view(DS0C_CST_GRP, v -> v.leftOuterJoin(S0_MM8).on(S0_M2.bp_grp_cd8.eq(S0_MM8.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP8.value()).eq(S0_MM8.bp_grp_typ))))
					.predicate(DS0C_CST_GRP, p -> p.cutoff$and(S0_M2.bp_grp_cd8.like(bind("cst_grp_cd8"))).cutoff$and(S0_MM8.bp_grp_nm.like(bind("cst_grp_nm8")))),
				when(boundOr("cst_grp_flg9"))
					.view(DS0C_CST_GRP, v -> v.leftOuterJoin(S0_MM9).on(S0_M2.bp_grp_cd9.eq(S0_MM9.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP9.value()).eq(S0_MM9.bp_grp_typ))))
					.predicate(DS0C_CST_GRP, p -> p.cutoff$and(S0_M2.bp_grp_cd9.like(bind("cst_grp_cd9"))).cutoff$and(S0_MM9.bp_grp_nm.like(bind("cst_grp_nm9")))),
				when(boundOr("cst_grp_flg10"))
					.view(DS0C_CST_GRP, v -> v.leftOuterJoin(S0_MM10).on(S0_M2.bp_grp_cd10.eq(S0_MM10.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP10.value()).eq(S0_MM10.bp_grp_typ))))
					.predicate(DS0C_CST_GRP, p -> p.cutoff$and(S0_M2.bp_grp_cd10.like(bind("cst_grp_cd10"))).cutoff$and(S0_MM10.bp_grp_nm.like(bind("cst_grp_nm10"))))
			);
	}
}