package mcframe.serverMSBB.MSBBL1390;

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
	 * -- MSBBL1390_MST_SLS_BDG_Query_S01
	 */
	static MCQueryPlan MSBBL1390_MST_SLS_BDG_S01() {
		MST_SLS_BDG_R S0_T = MST_SLS_BDG_R.create("T");
		MAM_DPT_R S0_M1 = MAM_DPT_R.create("M1");
		MAM_WG_R S0_M2 = MAM_WG_R.create("M2");
		MAM_SLS_ITM_GRP_R S0_M3 = MAM_SLS_ITM_GRP_R.create("M3");
		MAM_BP_R S0_M4 = MAM_BP_R.create("M4");
		MAM_USR_R S0_M5 = MAM_USR_R.create("M5");
		MAM_CUR_R S0_M6 = MAM_CUR_R.create("M6");
		MST_WRK_R S0_M7 = MST_WRK_R.create("M7");
		MAVM_RD_WG_R S0_M8 = MAVM_RD_WG_R.create("M8");
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
		
		MCDynamicSQLID DS0C_BP_GRP = createDynamicSQLID("DS0C_BP_GRP");
		
		return createQueryPlan()
			.setQuery(
				sql("MSBBL1390_MST_SLS_BDG_Query_S01")
					.mainQuery()
					.select(
						S0_T.ym,
						S0_T.sls_dpt_cd,
						S0_M1.dpt_nm.as("sls_dpt_nm"),
						S0_T.wg_cd,
						S0_M2.wg_nm,
						S0_T.sls_itm_grp_cd,
						S0_M3.sls_itm_grp_nm,
						S0_T.cst_cd,
						S0_M4.bp_nm.as("cst_nm"),
						S0_T.sls_usr_cd,
						S0_M5.usr_nm.as("sls_usr_nm"),
						S0_T.trd_cur_cd,
						S0_M6.cur_nm.as("trd_cur_nm"),
						S0_M6.amt_dec_place,
						S0_T.wrk_no,
						S0_M7.wrk_nm,
						S0_T.sls_bdg_grp,
						S0_T.bdg_sls_amt,
						S0_T.bdg_sls_prof_rate,
						S0_T.bdg_sls_prof_amt,
						S0_T.not_sum_flg,
						S0_T.sls_itm_grp_not_sum_flg,
						S0_T.sub_char1,
						S0_T.sub_char2,
						S0_T.sub_char3,
						S0_T.ins_usr_id,
						S0_T.ins_usr_nm,
						S0_T.ins_func_id,
						S0_T.ins_ts,
						S0_T.upd_cntr,
						S0_T.upd_usr_id,
						S0_T.upd_usr_nm,
						S0_T.upd_func_id,
						S0_T.upd_ts,
						S0_T.upd_srv_req_no,
						addDynamicSelect(DS0C_BP_GRP)
					)
					.from(
						S0_T
						.leftOuterJoin(S0_M1).on(
							bracket(
								S0_T.sls_dpt_cd.eq(S0_M1.dpt_cd)
								.and(S0_T.ym.between(S0_M1.st_dt, S0_M1.end_dt))
							)
						)
						.leftOuterJoin(S0_M2).on(
							bracket(
								S0_T.wg_cd.eq(S0_M2.wg_cd)
							)
						)
						.leftOuterJoin(S0_M3).on(
							bracket(
								S0_T.sls_itm_grp_cd.eq(S0_M3.sls_itm_grp_cd)
							)
						)
						.leftOuterJoin(S0_M4).on(
							bracket(
								S0_T.cst_cd.eq(S0_M4.bp_cd)
							)
						)
						.leftOuterJoin(S0_M5).on(
							bracket(
								S0_T.sls_usr_cd.eq(S0_M5.usr_cd)
							)
						)
						.leftOuterJoin(S0_M6).on(
							bracket(
								S0_T.trd_cur_cd.eq(S0_M6.cur_cd)
							)
						)
						.leftOuterJoin(S0_M7).on(
							bracket(
								S0_T.wrk_no.eq(S0_M7.wrk_no)
							)
						)
						.innerJoin(S0_M8).on(
							bracket(
								S0_T.wg_cd.eq(S0_M8.wg_cd)
							)
						)
						.addDynamicView(DS0C_BP_GRP)
					)
					.where(
						value(0).eq(value(0))
						.cutoff$and(S0_T.ym.gte(bind("ym_fr")))
						.cutoff$and(S0_T.ym.lte(bind("ym_to")))
						.cutoff$and(S0_T.sls_usr_cd.like(bind("sls_usr_cd")))
						.cutoff$and(S0_M5.usr_nm.like(bind("sls_usr_nm")))
						.cutoff$and(S0_T.sls_dpt_cd.like(bind("sls_dpt_cd")))
						.cutoff$and(S0_M1.dpt_nm.like(bind("sls_dpt_nm")))
						.cutoff$and(S0_T.wg_cd.like(bind("wg_cd")))
						.cutoff$and(S0_M2.wg_nm.like(bind("wg_nm")))
						.cutoff$and(S0_T.sls_itm_grp_cd.like(bind("sls_itm_grp_cd")))
						.cutoff$and(S0_M3.sls_itm_grp_nm.like(bind("sls_itm_grp_nm")))
						.cutoff$and(S0_T.cst_cd.like(bind("cst_cd")))
						.cutoff$and(S0_M4.bp_nm.like(bind("cst_nm")))
						.cutoff$and(S0_T.wrk_no.like(bind("wrk_no")))
						.cutoff$and(S0_M7.wrk_nm.like(bind("wrk_nm")))
						.cutoff$and(S0_T.trd_cur_cd.like(bind("trd_cur_cd")))
						.cutoff$and(S0_M6.cur_nm.like(bind("trd_cur_nm")))
						.cutoff$and(S0_T.sls_bdg_grp.like(bind("sls_bdg_grp")))
						.cutoff$and(S0_T.not_sum_flg.eq(bind("wk_not_sum_flg_str")))
						.cutoff$and(S0_T.sls_itm_grp_not_sum_flg.eq(bind("wk_sls_itm_grp_not_sum_flg_str")))
						.cutoff$and(S0_T.sub_char1.like(bind("sub_char1")))
						.cutoff$and(S0_T.sub_char2.like(bind("sub_char2")))
						.cutoff$and(S0_T.sub_char3.like(bind("sub_char3")))
						.addDynamicPredicate(DS0C_BP_GRP)
					)
					.orderBy(
						S0_T.sls_dpt_cd.asc(),
						S0_T.wg_cd.asc(),
						S0_T.sls_itm_grp_cd.asc(),
						S0_T.cst_cd.asc(),
						S0_T.sls_usr_cd.asc(),
						S0_T.trd_cur_cd.asc(),
						S0_T.wrk_no.asc(),
						S0_T.sls_bdg_grp.asc(),
						S0_T.ym.asc()
					)
			)
			.setDynamicSQLInfo(
				when(boundOr("bp_grp_flg1"))
					.select(DS0C_BP_GRP, S0_M4.bp_grp_cd1.as("bp_grp_cd1"), S0_MM1.bp_grp_nm.as("bp_grp_nm1"))
					.view(DS0C_BP_GRP, v -> v.leftOuterJoin(S0_MM1).on(S0_M4.bp_grp_cd1.eq(S0_MM1.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP1.value()).eq(S0_MM1.bp_grp_typ))))
					.predicate(DS0C_BP_GRP, p -> p.cutoff$and(S0_M4.bp_grp_cd1.like(bind("bp_grp_cd1"))).cutoff$and(S0_MM1.bp_grp_nm.like(bind("bp_grp_nm1")))),
				when(boundOr("bp_grp_flg2"))
					.select(DS0C_BP_GRP, S0_M4.bp_grp_cd2.as("bp_grp_cd2"), S0_MM2.bp_grp_nm.as("bp_grp_nm2"))
					.view(DS0C_BP_GRP, v -> v.leftOuterJoin(S0_MM2).on(S0_M4.bp_grp_cd2.eq(S0_MM2.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP2.value()).eq(S0_MM2.bp_grp_typ))))
					.predicate(DS0C_BP_GRP, p -> p.cutoff$and(S0_M4.bp_grp_cd2.like(bind("bp_grp_cd2"))).cutoff$and(S0_MM2.bp_grp_nm.like(bind("bp_grp_nm2")))),
				when(boundOr("bp_grp_flg3"))
					.select(DS0C_BP_GRP, S0_M4.bp_grp_cd3.as("bp_grp_cd3"), S0_MM3.bp_grp_nm.as("bp_grp_nm3"))
					.view(DS0C_BP_GRP, v -> v.leftOuterJoin(S0_MM3).on(S0_M4.bp_grp_cd3.eq(S0_MM3.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP3.value()).eq(S0_MM3.bp_grp_typ))))
					.predicate(DS0C_BP_GRP, p -> p.cutoff$and(S0_M4.bp_grp_cd3.like(bind("bp_grp_cd3"))).cutoff$and(S0_MM3.bp_grp_nm.like(bind("bp_grp_nm3")))),
				when(boundOr("bp_grp_flg4"))
					.select(DS0C_BP_GRP, S0_M4.bp_grp_cd4.as("bp_grp_cd4"), S0_MM4.bp_grp_nm.as("bp_grp_nm4"))
					.view(DS0C_BP_GRP, v -> v.leftOuterJoin(S0_MM4).on(S0_M4.bp_grp_cd4.eq(S0_MM4.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP4.value()).eq(S0_MM4.bp_grp_typ))))
					.predicate(DS0C_BP_GRP, p -> p.cutoff$and(S0_M4.bp_grp_cd4.like(bind("bp_grp_cd4"))).cutoff$and(S0_MM4.bp_grp_nm.like(bind("bp_grp_nm4")))),
				when(boundOr("bp_grp_flg5"))
					.select(DS0C_BP_GRP, S0_M4.bp_grp_cd5.as("bp_grp_cd5"), S0_MM5.bp_grp_nm.as("bp_grp_nm5"))
					.view(DS0C_BP_GRP, v -> v.leftOuterJoin(S0_MM5).on(S0_M4.bp_grp_cd5.eq(S0_MM5.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP5.value()).eq(S0_MM5.bp_grp_typ))))
					.predicate(DS0C_BP_GRP, p -> p.cutoff$and(S0_M4.bp_grp_cd5.like(bind("bp_grp_cd5"))).cutoff$and(S0_MM5.bp_grp_nm.like(bind("bp_grp_nm5")))),
				when(boundOr("bp_grp_flg6"))
					.select(DS0C_BP_GRP, S0_M4.bp_grp_cd6.as("bp_grp_cd6"), S0_MM6.bp_grp_nm.as("bp_grp_nm6"))
					.view(DS0C_BP_GRP, v -> v.leftOuterJoin(S0_MM6).on(S0_M4.bp_grp_cd6.eq(S0_MM6.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP6.value()).eq(S0_MM6.bp_grp_typ))))
					.predicate(DS0C_BP_GRP, p -> p.cutoff$and(S0_M4.bp_grp_cd6.like(bind("bp_grp_cd6"))).cutoff$and(S0_MM6.bp_grp_nm.like(bind("bp_grp_nm6")))),
				when(boundOr("bp_grp_flg7"))
					.select(DS0C_BP_GRP, S0_M4.bp_grp_cd7.as("bp_grp_cd7"), S0_MM7.bp_grp_nm.as("bp_grp_nm7"))
					.view(DS0C_BP_GRP, v -> v.leftOuterJoin(S0_MM7).on(S0_M4.bp_grp_cd7.eq(S0_MM7.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP7.value()).eq(S0_MM7.bp_grp_typ))))
					.predicate(DS0C_BP_GRP, p -> p.cutoff$and(S0_M4.bp_grp_cd7.like(bind("bp_grp_cd7"))).cutoff$and(S0_MM7.bp_grp_nm.like(bind("bp_grp_nm7")))),
				when(boundOr("bp_grp_flg8"))
					.select(DS0C_BP_GRP, S0_M4.bp_grp_cd8.as("bp_grp_cd8"), S0_MM8.bp_grp_nm.as("bp_grp_nm8"))
					.view(DS0C_BP_GRP, v -> v.leftOuterJoin(S0_MM8).on(S0_M4.bp_grp_cd8.eq(S0_MM8.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP8.value()).eq(S0_MM8.bp_grp_typ))))
					.predicate(DS0C_BP_GRP, p -> p.cutoff$and(S0_M4.bp_grp_cd8.like(bind("bp_grp_cd8"))).cutoff$and(S0_MM8.bp_grp_nm.like(bind("bp_grp_nm8")))),
				when(boundOr("bp_grp_flg9"))
					.select(DS0C_BP_GRP, S0_M4.bp_grp_cd9.as("bp_grp_cd9"), S0_MM9.bp_grp_nm.as("bp_grp_nm9"))
					.view(DS0C_BP_GRP, v -> v.leftOuterJoin(S0_MM9).on(S0_M4.bp_grp_cd9.eq(S0_MM9.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP9.value()).eq(S0_MM9.bp_grp_typ))))
					.predicate(DS0C_BP_GRP, p -> p.cutoff$and(S0_M4.bp_grp_cd9.like(bind("bp_grp_cd9"))).cutoff$and(S0_MM9.bp_grp_nm.like(bind("bp_grp_nm9")))),
				when(boundOr("bp_grp_flg10"))
					.select(DS0C_BP_GRP, S0_M4.bp_grp_cd10.as("bp_grp_cd10"), S0_MM10.bp_grp_nm.as("bp_grp_nm10"))
					.view(DS0C_BP_GRP, v -> v.leftOuterJoin(S0_MM10).on(S0_M4.bp_grp_cd10.eq(S0_MM10.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP10.value()).eq(S0_MM10.bp_grp_typ))))
					.predicate(DS0C_BP_GRP, p -> p.cutoff$and(S0_M4.bp_grp_cd10.like(bind("bp_grp_cd10"))).cutoff$and(S0_MM10.bp_grp_nm.like(bind("bp_grp_nm10"))))
			);
	}
}