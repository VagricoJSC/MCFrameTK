package mcframe.serverMABS.MABSL0930;

import mcframe.commonCore.lang.MCNumber;
import mcframe.commonCore.lang.MCDate;
import mcframe.commonCore.lang.MCTimestamp;

import mcframe.serverCore.cache.MCJoinerList;

import static mcframe.commonCore.util.MCCollectionUtil.*;
import static mcframe.serverCore.cache.MCJoinerList.*;
import static mcframe.serverCore.queryapi.IFMCSQL.*;
import static mcframe.serverCore.queryapi.MCQueryExecution.*;

import mcframe.commonMA.constant.*;
import mcframe.serverCore.dbc.*;
import mcframe.serverMA.dbc.*;

import static mcframe.serverCore.dbc.CoreFunction.*;
import static mcframe.serverMA.dbc.MAFunction.*;
import static mcframe.serverMA.dbc.MABCFunction.*;
import static mcframe.serverMA.dbc.MABGFunction.*;
import static mcframe.serverMA.dbc.MABSFunction.*;
import static mcframe.serverMA.dbc.MAUAFunction.*;

public class Query_MC {
	
	/**
	 * -- MABSL0930_MAM_PROC_UPRI_Query_S01
	 */
	static MCQueryPlan MABSL0930_MAM_PROC_UPRI_S01() {
		MAVM_PROC_UPRI_R S0_T = MAVM_PROC_UPRI_R.create("T");
		MAW_UPRI_CNF_R S0_W = MAW_UPRI_CNF_R.create("W");
		MAM_BP_R S0_BP1 = MAM_BP_R.create("BP1");
		MAM_BP_R S0_BP2 = MAM_BP_R.create("BP2");
		MAM_BP_R S0_BP3 = MAM_BP_R.create("BP3");
		MAM_LOC_R S0_LOC1 = MAM_LOC_R.create("LOC1");
		MAM_UNIT_R S0_UNIT1 = MAM_UNIT_R.create("UNIT1");
		MAM_CUR_R S0_CUR1 = MAM_CUR_R.create("CUR1");
		MAM_WG_R S0_WG1 = MAM_WG_R.create("WG1");
		MAM_ITM__R S0_ITM1 = MAM_ITM__R.create("ITM1");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MABSL0930_MAM_PROC_UPRI_Query_S01")
					.mainQuery()
					.select(
						S0_T.prAll(),
						S0_W.peg_no,
						S0_BP1.bp_nm.as("sppl_nm"),
						S0_BP3.bp_nm.as("maker_nm"),
						S0_BP2.bp_nm.as("dlv_nm"),
						S0_LOC1.loc_nm,
						S0_UNIT1.unit_nm,
						S0_CUR1.cur_nm,
						S0_WG1.wg_nm,
						S0_ITM1.itm_nm
					)
					.from(
						S0_T
						.innerJoin(S0_W).on(
							bracket(
								S0_W.row_id.eq(S0_T.row_id)
							)
						)
						.leftOuterJoin(S0_BP1).on(
							bracket(
								S0_T.sppl_cd.eq(S0_BP1.bp_cd)
							)
						)
						.leftOuterJoin(S0_BP2).on(
							bracket(
								S0_T.dlv_cd.eq(S0_BP2.bp_cd)
							)
						)
						.leftOuterJoin(S0_BP3).on(
							bracket(
								S0_T.maker_cd.eq(S0_BP3.bp_cd)
							)
						)
						.leftOuterJoin(S0_LOC1).on(
							bracket(
								S0_T.loc_cd.eq(S0_LOC1.loc_cd)
							)
						)
						.leftOuterJoin(S0_UNIT1).on(
							bracket(
								S0_T.unit_cd.eq(S0_UNIT1.unit_cd)
							)
						)
						.leftOuterJoin(S0_CUR1).on(
							bracket(
								S0_T.cur_cd.eq(S0_CUR1.cur_cd)
							)
						)
						.leftOuterJoin(S0_WG1).on(
							bracket(
								S0_T.wg_cd.eq(S0_WG1.wg_cd)
							)
						)
						.leftOuterJoin(S0_ITM1).on(
							bracket(
								S0_T.itm_cd.eq(S0_ITM1.itm_cd)
								.and(S0_T.itm_sub1.eq(S0_ITM1.itm_sub1))
								.and(S0_T.itm_sub2.eq(S0_ITM1.itm_sub2))
								.and(S0_T.itm_sub3.eq(S0_ITM1.itm_sub3))
							)
						)
					)
					.where(
						S0_W.mst_nm.eq(value("MAM_PROC_UPRI"))
					)
			);
	}
	
	/**
	 * -- MABSL0930_MAM_PROV_UPRI_Query_S01
	 */
	static MCQueryPlan MABSL0930_MAM_PROV_UPRI_S01() {
		MCTempView S0_T1 = createTempView("T1");
		MAM_PROV_UPRI__R S0_M1 = MAM_PROV_UPRI__R.create("M1");
		MAW_BOM_EX_R S0_W1 = MAW_BOM_EX_R.create("W1");
		MAM_BP_R S0_BP1 = MAM_BP_R.create("BP1");
		MAM_CUR_R S0_CUR1 = MAM_CUR_R.create("CUR1");
		MAM_WG_R S0_WG1 = MAM_WG_R.create("WG1");
		MAM_ITM__R S0_ITM1 = MAM_ITM__R.create("ITM1");
		MCTempView S0_T2 = createTempView("T2");
		MAM_PROV_UPRI__R S0_M2 = MAM_PROV_UPRI__R.create("M2");
		
		
		return createQueryPlan()
				.setQuery(
					sql("MABSL0930_MAM_PROV_UPRI_Query_S01")
					.mainQuery()
					.select(
						S0_T1.pr(S0_M1.wg_cd),
						S0_W1.itm_cd,
						S0_W1.itm_sub1,
						S0_W1.itm_sub2,
						S0_W1.itm_sub3,
						S0_W1.chd_inpt_qty,
						S0_T1.pr(S0_M1.prsppl_cd),
						S0_T1.pr(S0_M1.prov_typ),
						S0_T1.pr(S0_M1.st_dt),
						S0_T1.pr(S0_M1.end_dt),
						S0_T1.pr(S0_M1.cur_cd),
						S0_T1.pr(S0_M1.upri),
						S0_T1.pr(S0_M1.upri_bf),
						S0_T1.pr(S0_M1.sub_upri1),
						S0_T1.pr(S0_M1.sub_upri2),
						S0_T1.pr(S0_M1.sub_upri3),
						S0_T1.pr(S0_M1.memo1),
						S0_T1.pr(S0_M1.memo2),
						S0_T1.pr(S0_M1.memo3),
						S0_T1.pr(S0_M1.ins_usr_id),
						S0_T1.pr(S0_M1.ins_usr_nm),
						S0_T1.pr(S0_M1.ins_ts),
						S0_T1.pr(S0_M1.ins_func_id),
						S0_T1.pr(S0_M1.upd_usr_id),
						S0_T1.pr(S0_M1.upd_usr_nm),
						S0_T1.pr(S0_M1.upd_ts),
						S0_T1.pr(S0_M1.upd_func_id),
						S0_T1.pr(S0_M1.upd_srv_req_no),
						S0_BP1.bp_nm.as("prsppl_nm"),
						S0_BP1.onr_prsppl_flg,
						S0_CUR1.cur_nm,
						S0_WG1.wg_nm,
						S0_ITM1.itm_nm,
						S0_W1.bom_ptn
					)
					.from(
						S0_W1
						.leftOuterJoin(
								subQuery()
									.select(
										S0_T2.pr(S0_M1.wg_cd),
										S0_T2.pr(S0_M1.itm_cd),
										S0_T2.pr(S0_M1.itm_sub1),
										S0_T2.pr(S0_M1.itm_sub2),
										S0_T2.pr(S0_M1.itm_sub3),
										S0_T2.pr(S0_M1.prsppl_cd),
										S0_T2.pr(S0_M1.prov_typ),
										S0_T2.pr(S0_M1.st_dt),
										S0_T2.pr(S0_M1.end_dt),
										S0_T2.pr(S0_M1.cur_cd),
										S0_T2.pr(S0_M1.upri),
										S0_T2.pr(S0_M1.upri_bf),
										S0_T2.pr(S0_M1.sub_upri1),
										S0_T2.pr(S0_M1.sub_upri2),
										S0_T2.pr(S0_M1.sub_upri3),
										S0_T2.pr(S0_M1.memo1),
										S0_T2.pr(S0_M1.memo2),
										S0_T2.pr(S0_M1.memo3),
										S0_T2.pr(S0_M1.ins_usr_id),
										S0_T2.pr(S0_M1.ins_usr_nm),
										S0_T2.pr(S0_M1.ins_ts),
										S0_T2.pr(S0_M1.ins_func_id),
										S0_T2.pr(S0_M1.upd_usr_id),
										S0_T2.pr(S0_M1.upd_usr_nm),
										S0_T2.pr(S0_M1.upd_ts),
										S0_T2.pr(S0_M1.upd_func_id),
										S0_T2.pr(S0_M1.upd_srv_req_no)
									)
									.from(
										subQuery()
											.select(
												S0_M1.prAll()
											)
											.from(
												S0_M1
											)
											.where(
												value(0).eq(value(0))
												.and(S0_M1.wg_cd.eq(bind("wg_cd")))
												.and(S0_M1.del_flg.eq(value(false)))
											)
											.unionAll(
												subQuery()
													.select(
														S0_M1.prAll()
													)
													.from(
														S0_M1
													)
													.where(
														value(0).eq(value(0))
														.and(notExists(subQuery()
															.select(value("X"))
															.from(
																S0_M2
															)
															.where(
																S0_M2.wg_cd.eq(bind("wg_cd"))
																.and(S0_M2.del_flg.eq(value(false)))
																.and(S0_M2.itm_cd.eq(S0_M1.itm_cd))
																.and(S0_M2.itm_sub1.eq(S0_M1.itm_sub1))
																.and(S0_M2.itm_sub2.eq(S0_M1.itm_sub2))
																.and(S0_M2.itm_sub3.eq(S0_M1.itm_sub3))
															))
														)
														.and(S0_M1.wg_cd.eq(value(MAC_STR.NULL_VAL.value())))
														.and(S0_M1.del_flg.eq(value(false)))
													)
											).view(S0_T2)
									)
									.where(
										value(0).eq(value(0))
										.and(S0_T2.pr(S0_M1.prsppl_cd).eq(bind("sppl_cd")))
										.and(S0_T2.pr(S0_M1.cur_cd).eq(bind("cur_cd")))
										.and(S0_T2.pr(S0_M1.st_dt).lte(bind("dt")))
										.and(S0_T2.pr(S0_M1.end_dt).gte(bind("dt")))
									).view(S0_T1)
								).on(
							bracket(
								S0_W1.itm_cd.eq(S0_T1.pr(S0_M1.itm_cd))
								.and(S0_W1.itm_sub1.eq(S0_T1.pr(S0_M1.itm_sub1)))
								.and(S0_W1.itm_sub2.eq(S0_T1.pr(S0_M1.itm_sub2)))
								.and(S0_W1.itm_sub3.eq(S0_T1.pr(S0_M1.itm_sub3)))
							)
						)
						.leftOuterJoin(S0_BP1).on(
							bracket(
								S0_T1.pr(S0_M1.prsppl_cd).eq(S0_BP1.bp_cd)
							)
						)
						.leftOuterJoin(S0_CUR1).on(
							bracket(
								S0_T1.pr(S0_M1.cur_cd).eq(S0_CUR1.cur_cd)
							)
						)
						.leftOuterJoin(S0_WG1).on(
							bracket(
								S0_T1.pr(S0_M1.wg_cd).eq(S0_WG1.wg_cd)
							)
						)
						.leftOuterJoin(S0_ITM1).on(
							bracket(
								S0_W1.itm_cd.eq(S0_ITM1.itm_cd)
								.and(S0_W1.itm_sub1.eq(S0_ITM1.itm_sub1))
								.and(S0_W1.itm_sub2.eq(S0_ITM1.itm_sub2))
								.and(S0_W1.itm_sub3.eq(S0_ITM1.itm_sub3))
							)
						)
					)
					.where(
						value(0).eq(value(0))
						.and(S0_W1.bom_lvl.neq(value(0)))
						.and(S0_W1.inpt_ctl_typ.neq(value(MAC_INPT_CTL_TYP.NO_MRP_INST.value())))
						.and(S0_W1.byprod_flg.eq(value(false)))
					)
					.orderBy(S0_W1.sort_no.asc())
			);
	}
}