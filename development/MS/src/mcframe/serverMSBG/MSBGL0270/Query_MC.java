package mcframe.serverMSBG.MSBGL0270;

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
	 * -- MSBGL0270_MST_CRED_Query_S01
	 */
	static MCQueryPlan MSBGL0270_MST_CRED_S01() {
		MAM_CRED_CTRL_R S0_M1 = MAM_CRED_CTRL_R.create("M1");
		MST_CRED_R S0_T1 = MST_CRED_R.create("T1");
		MAM_BP_R S0_M2 = MAM_BP_R.create("M2");
		MAM_CUR_R S0_M3 = MAM_CUR_R.create("M3");
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
		
		MCDynamicSQLID DS0C_CRED_GRP = createDynamicSQLID("DS0C_CRED_GRP");
		
		return createQueryPlan()
			.setQuery(
				sql("MSBGL0270_MST_CRED_Query_S01")
					.mainQuery()
					.select(
						S0_M2.bp_cd.as("cred_cd"),
						S0_M2.bp_nm.as("cred_nm"),
						S0_M1.cur_cd,
						S0_M3.cur_nm,
						S0_M3.amt_dec_place,
						S0_M1.cred_limit,
						nvl(
							S0_T1.cred_amt,
							value(0)
						).as("cred_amt"),
						nvl(
							S0_T1.ar_cred_amt,
							value(0)
						).as("ar_cred_amt"),
						nvl(
							S0_T1.ap_cred_amt,
							value(0)
						).as("ap_cred_amt"),
						bracket(
							S0_M1.cred_limit.subtract(
								nvl(
									S0_T1.cred_amt,
									value(0)
								)
							)
						).as("cred_bal"),
						bracket(
							decode(
								S0_M1.cred_limit,
								value(0),
								nullValue(),
								MAPA_CALC$F_RND(
									nvl(
										S0_T1.cred_amt,
										value(0)
									).divide(S0_M1.cred_limit).multiply(value(100)),
									value(2),
									value(MAC_RND_TYP.RNDUP.value())
								)
							)
						).as("cred_use"),
						S0_M1.alarm_point,
						bracket(
							S0_M1.cred_limit.multiply(S0_M1.alarm_point).divide(value(100))
						).as("alarm_amt"),
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
						addDynamicSelect(DS0C_CRED_GRP)
					)
					.from(
						S0_M1
						.leftOuterJoin(S0_T1).on(
							bracket(
								S0_M1.cred_cd.eq(S0_T1.cred_cd)
								.and(S0_M1.cur_cd.eq(S0_T1.trd_cur_cd))
								.cutoff$and(
									bracket(
										bind("cred_amt_fr").lte(S0_T1.cred_amt)
										.and(value(true).eq(bind("fr_lte_zero")))
									)
								)
								.cutoff$and(
									bracket(
										S0_T1.cred_amt.lte(bind("cred_amt_to"))
										.and(value(true).eq(bind("to_gte_zero")))
									)
								)
							)
						)
						.leftOuterJoin(S0_M2).on(
							bracket(
								S0_M1.cred_cd.eq(S0_M2.bp_cd)
							)
						)
						.leftOuterJoin(S0_M3).on(
							bracket(
								S0_M1.cur_cd.eq(S0_M3.cur_cd)
							)
						)
						.addDynamicView(DS0C_CRED_GRP)
					)
					.where(
						value(0).eq(value(0))
						.cutoff$and(
							bracket(
								bind("cred_amt_fr").lte(S0_T1.cred_amt)
								.and(value(true).eq(bind("fr_gt_zero")))
							)
						)
						.cutoff$and(
							bracket(
								S0_T1.cred_amt.lte(bind("cred_amt_to"))
								.and(value(true).eq(bind("to_lt_zero")))
							)
						)
						.cutoff$and(S0_M1.cred_cd.like(bind("cred_cd")))
						.cutoff$and(S0_M2.bp_nm.like(bind("cred_nm")))
						.cutoff$and(S0_M1.cur_cd.like(bind("cur_cd")))
						.cutoff$and(S0_M3.cur_nm.like(bind("cur_nm")))
						.cutoff$and(S0_T1.sub_char1.like(bind("sub_char1")))
						.cutoff$and(S0_T1.sub_char2.like(bind("sub_char2")))
						.cutoff$and(S0_T1.sub_char3.like(bind("sub_char3")))
						.cutoff$and(
							S0_M1.cred_limit.neq(value(0))
							.and(
								bind("cred_use_fr").lte(MAPA_CALC$F_RND(
										nvl(
											S0_T1.cred_amt,
											value(0)
										).divide(S0_M1.cred_limit).multiply(value(100)),
										value(2),
										value(MAC_RND_TYP.RNDUP.value())
									)
								)
							)
						)
						.cutoff$and(
							S0_M1.cred_limit.neq(value(0))
							.and(
								MAPA_CALC$F_RND(
									nvl(
										S0_T1.cred_amt,
										value(0)
									).divide(S0_M1.cred_limit).multiply(value(100)),
									value(2),
									value(MAC_RND_TYP.RNDUP.value())
								).lte(bind("cred_use_to"))
							)
						)
						.and(
							bind("alarm_flg").eq(value(false))
							.or(
								bind("alarm_flg").eq(value(true))
								.and(
									S0_M1.cred_limit.eq(value(0))
									.or(
										S0_M1.cred_limit.multiply(S0_M1.alarm_point).divide(value(100)).lt(nvl(
												S0_T1.cred_amt,
												value(0)
											)
										)
									)
								)
							)
						)
						.and(S0_M1.del_flg.eq(value(false)))
						.addDynamicPredicate(DS0C_CRED_GRP)
					)
					.orderBy(
						S0_M1.cred_cd.asc(),
						S0_M1.cur_cd.asc()
					)
			)
			.setDynamicSQLInfo(
				when(boundOr("cred_grp_flg1"))
					.select(DS0C_CRED_GRP, S0_M2.bp_grp_cd1.as("cred_grp_cd1"), S0_MM1.bp_grp_nm.as("cred_grp_nm1"))
					.view(DS0C_CRED_GRP, v -> v.leftOuterJoin(S0_MM1).on(S0_M2.bp_grp_cd1.eq(S0_MM1.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP1.value()).eq(S0_MM1.bp_grp_typ))))
					.predicate(DS0C_CRED_GRP, p -> p.cutoff$and(S0_M2.bp_grp_cd1.like(bind("cred_grp_cd1"))).cutoff$and(S0_MM1.bp_grp_nm.like(bind("cred_grp_nm1")))),
				when(boundOr("cred_grp_flg2"))
					.select(DS0C_CRED_GRP, S0_M2.bp_grp_cd2.as("cred_grp_cd2"), S0_MM2.bp_grp_nm.as("cred_grp_nm2"))
					.view(DS0C_CRED_GRP, v -> v.leftOuterJoin(S0_MM2).on(S0_M2.bp_grp_cd2.eq(S0_MM2.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP2.value()).eq(S0_MM2.bp_grp_typ))))
					.predicate(DS0C_CRED_GRP, p -> p.cutoff$and(S0_M2.bp_grp_cd2.like(bind("cred_grp_cd2"))).cutoff$and(S0_MM2.bp_grp_nm.like(bind("cred_grp_nm2")))),
				when(boundOr("cred_grp_flg3"))
					.select(DS0C_CRED_GRP, S0_M2.bp_grp_cd3.as("cred_grp_cd3"), S0_MM3.bp_grp_nm.as("cred_grp_nm3"))
					.view(DS0C_CRED_GRP, v -> v.leftOuterJoin(S0_MM3).on(S0_M2.bp_grp_cd3.eq(S0_MM3.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP3.value()).eq(S0_MM3.bp_grp_typ))))
					.predicate(DS0C_CRED_GRP, p -> p.cutoff$and(S0_M2.bp_grp_cd3.like(bind("cred_grp_cd3"))).cutoff$and(S0_MM3.bp_grp_nm.like(bind("cred_grp_nm3")))),
				when(boundOr("cred_grp_flg4"))
					.select(DS0C_CRED_GRP, S0_M2.bp_grp_cd4.as("cred_grp_cd4"), S0_MM4.bp_grp_nm.as("cred_grp_nm4"))
					.view(DS0C_CRED_GRP, v -> v.leftOuterJoin(S0_MM4).on(S0_M2.bp_grp_cd4.eq(S0_MM4.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP4.value()).eq(S0_MM4.bp_grp_typ))))
					.predicate(DS0C_CRED_GRP, p -> p.cutoff$and(S0_M2.bp_grp_cd4.like(bind("cred_grp_cd4"))).cutoff$and(S0_MM4.bp_grp_nm.like(bind("cred_grp_nm4")))),
				when(boundOr("cred_grp_flg5"))
					.select(DS0C_CRED_GRP, S0_M2.bp_grp_cd5.as("cred_grp_cd5"), S0_MM5.bp_grp_nm.as("cred_grp_nm5"))
					.view(DS0C_CRED_GRP, v -> v.leftOuterJoin(S0_MM5).on(S0_M2.bp_grp_cd5.eq(S0_MM5.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP5.value()).eq(S0_MM5.bp_grp_typ))))
					.predicate(DS0C_CRED_GRP, p -> p.cutoff$and(S0_M2.bp_grp_cd5.like(bind("cred_grp_cd5"))).cutoff$and(S0_MM5.bp_grp_nm.like(bind("cred_grp_nm5")))),
				when(boundOr("cred_grp_flg6"))
					.select(DS0C_CRED_GRP, S0_M2.bp_grp_cd6.as("cred_grp_cd6"), S0_MM6.bp_grp_nm.as("cred_grp_nm6"))
					.view(DS0C_CRED_GRP, v -> v.leftOuterJoin(S0_MM6).on(S0_M2.bp_grp_cd6.eq(S0_MM6.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP6.value()).eq(S0_MM6.bp_grp_typ))))
					.predicate(DS0C_CRED_GRP, p -> p.cutoff$and(S0_M2.bp_grp_cd6.like(bind("cred_grp_cd6"))).cutoff$and(S0_MM6.bp_grp_nm.like(bind("cred_grp_nm6")))),
				when(boundOr("cred_grp_flg7"))
					.select(DS0C_CRED_GRP, S0_M2.bp_grp_cd7.as("cred_grp_cd7"), S0_MM7.bp_grp_nm.as("cred_grp_nm7"))
					.view(DS0C_CRED_GRP, v -> v.leftOuterJoin(S0_MM7).on(S0_M2.bp_grp_cd7.eq(S0_MM7.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP7.value()).eq(S0_MM7.bp_grp_typ))))
					.predicate(DS0C_CRED_GRP, p -> p.cutoff$and(S0_M2.bp_grp_cd7.like(bind("cred_grp_cd7"))).cutoff$and(S0_MM7.bp_grp_nm.like(bind("cred_grp_nm7")))),
				when(boundOr("cred_grp_flg8"))
					.select(DS0C_CRED_GRP, S0_M2.bp_grp_cd8.as("cred_grp_cd8"), S0_MM8.bp_grp_nm.as("cred_grp_nm8"))
					.view(DS0C_CRED_GRP, v -> v.leftOuterJoin(S0_MM8).on(S0_M2.bp_grp_cd8.eq(S0_MM8.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP8.value()).eq(S0_MM8.bp_grp_typ))))
					.predicate(DS0C_CRED_GRP, p -> p.cutoff$and(S0_M2.bp_grp_cd8.like(bind("cred_grp_cd8"))).cutoff$and(S0_MM8.bp_grp_nm.like(bind("cred_grp_nm8")))),
				when(boundOr("cred_grp_flg9"))
					.select(DS0C_CRED_GRP, S0_M2.bp_grp_cd9.as("cred_grp_cd9"), S0_MM9.bp_grp_nm.as("cred_grp_nm9"))
					.view(DS0C_CRED_GRP, v -> v.leftOuterJoin(S0_MM9).on(S0_M2.bp_grp_cd9.eq(S0_MM9.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP9.value()).eq(S0_MM9.bp_grp_typ))))
					.predicate(DS0C_CRED_GRP, p -> p.cutoff$and(S0_M2.bp_grp_cd9.like(bind("cred_grp_cd9"))).cutoff$and(S0_MM9.bp_grp_nm.like(bind("cred_grp_nm9")))),
				when(boundOr("cred_grp_flg10"))
					.select(DS0C_CRED_GRP, S0_M2.bp_grp_cd10.as("cred_grp_cd10"), S0_MM10.bp_grp_nm.as("cred_grp_nm10"))
					.view(DS0C_CRED_GRP, v -> v.leftOuterJoin(S0_MM10).on(S0_M2.bp_grp_cd10.eq(S0_MM10.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP10.value()).eq(S0_MM10.bp_grp_typ))))
					.predicate(DS0C_CRED_GRP, p -> p.cutoff$and(S0_M2.bp_grp_cd10.like(bind("cred_grp_cd10"))).cutoff$and(S0_MM10.bp_grp_nm.like(bind("cred_grp_nm10"))))
			);
	}
	
	/**
	 * -- MSBGL0270_MST_CRED_Query_S02
	 */
	static MCQueryPlan MSBGL0270_MST_CRED_S02() {
		MST_CRED_R S0_T1 = MST_CRED_R.create("T1");
		MAM_BP_R S0_M1 = MAM_BP_R.create("M1");
		MAM_CUR_R S0_M2 = MAM_CUR_R.create("M2");
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
		MAM_CRED_CTRL_R S1_T2 = MAM_CRED_CTRL_R.create("T2");
		
		MCDynamicSQLID DS0C_CRED_GRP = createDynamicSQLID("DS0C_CRED_GRP");
		
		return createQueryPlan()
			.setQuery(
				sql("MSBGL0270_MST_CRED_Query_S02")
					.mainQuery()
					.select(
						S0_T1.cred_cd,
						S0_M1.bp_nm.as("cred_nm"),
						S0_T1.trd_cur_cd.as("cur_cd"),
						S0_M2.cur_nm,
						S0_M2.amt_dec_place,
						nvl(
							S0_T1.cred_amt,
							value(0)
						).as("cred_amt"),
						nvl(
							S0_T1.ar_cred_amt,
							value(0)
						).as("ar_cred_amt"),
						nvl(
							S0_T1.ap_cred_amt,
							value(0)
						).as("ap_cred_amt"),
						nullValue().as("cred_limit"),
						nullValue().as("alarm_point"),
						nullValue().as("cred_bal"),
						nullValue().as("cred_use"),
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
						addDynamicSelect(DS0C_CRED_GRP)
					)
					.from(
						S0_T1
						.leftOuterJoin(S0_M1).on(
							bracket(
								S0_T1.cred_cd.eq(S0_M1.bp_cd)
							)
						)
						.leftOuterJoin(S0_M2).on(
							bracket(
								S0_T1.trd_cur_cd.eq(S0_M2.cur_cd)
							)
						)
						.addDynamicView(DS0C_CRED_GRP)
					)
					.where(
						value(0).eq(value(0))
						.cutoff$and(S0_T1.cred_amt.gte(bind("cred_amt_fr")))
						.cutoff$and(S0_T1.cred_amt.lte(bind("cred_amt_to")))
						.cutoff$and(S0_T1.cred_cd.like(bind("cred_cd")))
						.cutoff$and(S0_M1.bp_nm.like(bind("cred_nm")))
						.cutoff$and(S0_T1.trd_cur_cd.like(bind("cur_cd")))
						.cutoff$and(S0_M2.cur_nm.like(bind("cur_nm")))
						.cutoff$and(S0_T1.sub_char1.like(bind("sub_char1")))
						.cutoff$and(S0_T1.sub_char2.like(bind("sub_char2")))
						.cutoff$and(S0_T1.sub_char3.like(bind("sub_char3")))
						.and(
							notExists(
								subQuery()
								.select(value("X"))
								.from(S1_T2)
								.where(
									value(0).eq(value(0))
									.and(S0_T1.cred_cd.eq(S1_T2.cred_cd))
									.and(S0_T1.trd_cur_cd.eq(S1_T2.cur_cd))
									.and(S1_T2.del_flg.eq(value(false)))
								)
							)
						)
						.addDynamicPredicate(DS0C_CRED_GRP)
					)
					.orderBy(
						S0_T1.cred_cd.asc(),
						S0_T1.trd_cur_cd.asc()
					)
			)
			.setDynamicSQLInfo(
				when(boundOr("cred_grp_flg1"))
					.select(DS0C_CRED_GRP, S0_M1.bp_grp_cd1.as("cred_grp_cd1"), S0_MM1.bp_grp_nm.as("cred_grp_nm1"))
					.view(DS0C_CRED_GRP, v -> v.leftOuterJoin(S0_MM1).on(S0_M1.bp_grp_cd1.eq(S0_MM1.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP1.value()).eq(S0_MM1.bp_grp_typ))))
					.predicate(DS0C_CRED_GRP, p -> p.cutoff$and(S0_M1.bp_grp_cd1.like(bind("cred_grp_cd1"))).cutoff$and(S0_MM1.bp_grp_nm.like(bind("cred_grp_nm1")))),
				when(boundOr("cred_grp_flg2"))
					.select(DS0C_CRED_GRP, S0_M1.bp_grp_cd2.as("cred_grp_cd2"), S0_MM2.bp_grp_nm.as("cred_grp_nm2"))
					.view(DS0C_CRED_GRP, v -> v.leftOuterJoin(S0_MM2).on(S0_M1.bp_grp_cd2.eq(S0_MM2.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP2.value()).eq(S0_MM2.bp_grp_typ))))
					.predicate(DS0C_CRED_GRP, p -> p.cutoff$and(S0_M1.bp_grp_cd2.like(bind("cred_grp_cd2"))).cutoff$and(S0_MM2.bp_grp_nm.like(bind("cred_grp_nm2")))),
				when(boundOr("cred_grp_flg3"))
					.select(DS0C_CRED_GRP, S0_M1.bp_grp_cd3.as("cred_grp_cd3"), S0_MM3.bp_grp_nm.as("cred_grp_nm3"))
					.view(DS0C_CRED_GRP, v -> v.leftOuterJoin(S0_MM3).on(S0_M1.bp_grp_cd3.eq(S0_MM3.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP3.value()).eq(S0_MM3.bp_grp_typ))))
					.predicate(DS0C_CRED_GRP, p -> p.cutoff$and(S0_M1.bp_grp_cd3.like(bind("cred_grp_cd3"))).cutoff$and(S0_MM3.bp_grp_nm.like(bind("cred_grp_nm3")))),
				when(boundOr("cred_grp_flg4"))
					.select(DS0C_CRED_GRP, S0_M1.bp_grp_cd4.as("cred_grp_cd4"), S0_MM4.bp_grp_nm.as("cred_grp_nm4"))
					.view(DS0C_CRED_GRP, v -> v.leftOuterJoin(S0_MM4).on(S0_M1.bp_grp_cd4.eq(S0_MM4.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP4.value()).eq(S0_MM4.bp_grp_typ))))
					.predicate(DS0C_CRED_GRP, p -> p.cutoff$and(S0_M1.bp_grp_cd4.like(bind("cred_grp_cd4"))).cutoff$and(S0_MM4.bp_grp_nm.like(bind("cred_grp_nm4")))),
				when(boundOr("cred_grp_flg5"))
					.select(DS0C_CRED_GRP, S0_M1.bp_grp_cd5.as("cred_grp_cd5"), S0_MM5.bp_grp_nm.as("cred_grp_nm5"))
					.view(DS0C_CRED_GRP, v -> v.leftOuterJoin(S0_MM5).on(S0_M1.bp_grp_cd5.eq(S0_MM5.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP5.value()).eq(S0_MM5.bp_grp_typ))))
					.predicate(DS0C_CRED_GRP, p -> p.cutoff$and(S0_M1.bp_grp_cd5.like(bind("cred_grp_cd5"))).cutoff$and(S0_MM5.bp_grp_nm.like(bind("cred_grp_nm5")))),
				when(boundOr("cred_grp_flg6"))
					.select(DS0C_CRED_GRP, S0_M1.bp_grp_cd6.as("cred_grp_cd6"), S0_MM6.bp_grp_nm.as("cred_grp_nm6"))
					.view(DS0C_CRED_GRP, v -> v.leftOuterJoin(S0_MM6).on(S0_M1.bp_grp_cd6.eq(S0_MM6.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP6.value()).eq(S0_MM6.bp_grp_typ))))
					.predicate(DS0C_CRED_GRP, p -> p.cutoff$and(S0_M1.bp_grp_cd6.like(bind("cred_grp_cd6"))).cutoff$and(S0_MM6.bp_grp_nm.like(bind("cred_grp_nm6")))),
				when(boundOr("cred_grp_flg7"))
					.select(DS0C_CRED_GRP, S0_M1.bp_grp_cd7.as("cred_grp_cd7"), S0_MM7.bp_grp_nm.as("cred_grp_nm7"))
					.view(DS0C_CRED_GRP, v -> v.leftOuterJoin(S0_MM7).on(S0_M1.bp_grp_cd7.eq(S0_MM7.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP7.value()).eq(S0_MM7.bp_grp_typ))))
					.predicate(DS0C_CRED_GRP, p -> p.cutoff$and(S0_M1.bp_grp_cd7.like(bind("cred_grp_cd7"))).cutoff$and(S0_MM7.bp_grp_nm.like(bind("cred_grp_nm7")))),
				when(boundOr("cred_grp_flg8"))
					.select(DS0C_CRED_GRP, S0_M1.bp_grp_cd8.as("cred_grp_cd8"), S0_MM8.bp_grp_nm.as("cred_grp_nm8"))
					.view(DS0C_CRED_GRP, v -> v.leftOuterJoin(S0_MM8).on(S0_M1.bp_grp_cd8.eq(S0_MM8.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP8.value()).eq(S0_MM8.bp_grp_typ))))
					.predicate(DS0C_CRED_GRP, p -> p.cutoff$and(S0_M1.bp_grp_cd8.like(bind("cred_grp_cd8"))).cutoff$and(S0_MM8.bp_grp_nm.like(bind("cred_grp_nm8")))),
				when(boundOr("cred_grp_flg9"))
					.select(DS0C_CRED_GRP, S0_M1.bp_grp_cd9.as("cred_grp_cd9"), S0_MM9.bp_grp_nm.as("cred_grp_nm9"))
					.view(DS0C_CRED_GRP, v -> v.leftOuterJoin(S0_MM9).on(S0_M1.bp_grp_cd9.eq(S0_MM9.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP9.value()).eq(S0_MM9.bp_grp_typ))))
					.predicate(DS0C_CRED_GRP, p -> p.cutoff$and(S0_M1.bp_grp_cd9.like(bind("cred_grp_cd9"))).cutoff$and(S0_MM9.bp_grp_nm.like(bind("cred_grp_nm9")))),
				when(boundOr("cred_grp_flg10"))
					.select(DS0C_CRED_GRP, S0_M1.bp_grp_cd10.as("cred_grp_cd10"), S0_MM10.bp_grp_nm.as("cred_grp_nm10"))
					.view(DS0C_CRED_GRP, v -> v.leftOuterJoin(S0_MM10).on(S0_M1.bp_grp_cd10.eq(S0_MM10.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP10.value()).eq(S0_MM10.bp_grp_typ))))
					.predicate(DS0C_CRED_GRP, p -> p.cutoff$and(S0_M1.bp_grp_cd10.like(bind("cred_grp_cd10"))).cutoff$and(S0_MM10.bp_grp_nm.like(bind("cred_grp_nm10"))))
			);
	}
}