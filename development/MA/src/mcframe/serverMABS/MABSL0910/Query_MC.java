package mcframe.serverMABS.MABSL0910;

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
	 * -- MABSL0910_MAM_CST_SLS_UPRI_Query_S01
	 */
	static MCQueryPlan MABSL0910_MAM_CST_SLS_UPRI_S01() {
		MAVM_CST_SLS_UPRI_R S0_T = MAVM_CST_SLS_UPRI_R.create("T");
		MAW_UPRI_CNF_R S0_W = MAW_UPRI_CNF_R.create("W");
		MAM_BP_R S0_BP1 = MAM_BP_R.create("BP1");
		MAM_BP_R S0_BP2 = MAM_BP_R.create("BP2");
		MAM_BP_R S0_BP3 = MAM_BP_R.create("BP3");
		MAM_BP_R S0_BP4 = MAM_BP_R.create("BP4");
		MAM_BP_R S0_BP5 = MAM_BP_R.create("BP5");
		MAM_SLS_UPRI_GRP_R S0_SLS_UPRI_GRP1 = MAM_SLS_UPRI_GRP_R.create("SLS_UPRI_GRP1");
		MAM_UNIT_R S0_UNIT1 = MAM_UNIT_R.create("UNIT1");
		MAM_CUR_R S0_CUR1 = MAM_CUR_R.create("CUR1");
		MAM_WG_R S0_WG1 = MAM_WG_R.create("WG1");
		MAM_ITM__R S0_ITM1 = MAM_ITM__R.create("ITM1");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MABSL0910_MAM_CST_SLS_UPRI_Query_S01")
					.mainQuery()
					.select(
						S0_T.prAll(),
						S0_W.peg_no,
						S0_BP1.bp_nm.as("cst_nm"),
						S0_BP2.bp_nm.as("dlv_nm"),
						S0_BP3.bp_nm.as("dest_nm1"),
						S0_BP4.bp_nm.as("dest_nm2"),
						S0_BP5.bp_nm.as("dest_nm3"),
						S0_SLS_UPRI_GRP1.sls_upri_grp_nm,
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
								S0_T.cst_cd.eq(S0_BP1.bp_cd)
							)
						)
						.leftOuterJoin(S0_BP2).on(
							bracket(
								S0_T.dlv_cd.eq(S0_BP2.bp_cd)
							)
						)
						.leftOuterJoin(S0_BP3).on(
							bracket(
								S0_T.dest_cd1.eq(S0_BP3.bp_cd)
							)
						)
						.leftOuterJoin(S0_BP4).on(
							bracket(
								S0_T.dest_cd2.eq(S0_BP4.bp_cd)
							)
						)
						.leftOuterJoin(S0_BP5).on(
							bracket(
								S0_T.dest_cd3.eq(S0_BP5.bp_cd)
							)
						)
						.leftOuterJoin(S0_SLS_UPRI_GRP1).on(
							bracket(
								S0_T.sls_upri_grp_cd.eq(S0_SLS_UPRI_GRP1.sls_upri_grp_cd)
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
						S0_W.mst_nm.eq(value("MAM_CST_SLS_UPRI"))
					)
			);
	}
	
	/**
	 * -- MABSL0910_MAM_ITM_SLS_UPRI_Query_S01
	 */
	static MCQueryPlan MABSL0910_MAM_ITM_SLS_UPRI_S01() {
		MAVM_ITM_SLS_UPRI_R S0_T = MAVM_ITM_SLS_UPRI_R.create("T");
		MAW_UPRI_CNF_R S0_W = MAW_UPRI_CNF_R.create("W");
		MAM_SLS_UPRI_GRP_R S0_SLS_UPRI_GRP1 = MAM_SLS_UPRI_GRP_R.create("SLS_UPRI_GRP1");
		MAM_SLS_UPRI_RANK_R S0_SLS_UPRI_RANK1 = MAM_SLS_UPRI_RANK_R.create("SLS_UPRI_RANK1");
		MAM_UNIT_R S0_UNIT1 = MAM_UNIT_R.create("UNIT1");
		MAM_CUR_R S0_CUR1 = MAM_CUR_R.create("CUR1");
		MAM_WG_R S0_WG1 = MAM_WG_R.create("WG1");
		MAM_ITM__R S0_ITM1 = MAM_ITM__R.create("ITM1");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MABSL0910_MAM_ITM_SLS_UPRI_Query_S01")
					.mainQuery()
					.select(
						S0_T.prAll(),
						S0_W.peg_no,
						S0_SLS_UPRI_GRP1.sls_upri_grp_nm,
						S0_SLS_UPRI_RANK1.sls_upri_rank_nm,
						S0_UNIT1.unit_nm,
						S0_CUR1.cur_nm,
						S0_WG1.wg_nm,
						S0_ITM1.itm_nm
					)
					.from(
						S0_T
						.innerJoin(S0_W).on(S0_W.row_id.eq(S0_T.row_id))
						.leftOuterJoin(S0_SLS_UPRI_GRP1).on(
							bracket(
								S0_T.sls_upri_grp_cd.eq(S0_SLS_UPRI_GRP1.sls_upri_grp_cd)
							)
						)
						.leftOuterJoin(S0_SLS_UPRI_RANK1).on(
							bracket(
								S0_T.sls_upri_rank_cd.eq(S0_SLS_UPRI_RANK1.sls_upri_rank_cd)
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
						S0_W.mst_nm.eq(value("MAM_ITM_SLS_UPRI"))
					)
			);
	}
	
	/**
	 * -- MABSL0910_MAM_STD_SLS_UPRI_Query_S01
	 */
	static MCQueryPlan MABSL0910_MAM_STD_SLS_UPRI_S01() {
		MAVM_STD_SLS_UPRI_R S0_T = MAVM_STD_SLS_UPRI_R.create("T");
		MAW_UPRI_CNF_R S0_W = MAW_UPRI_CNF_R.create("W");
		MAM_UNIT_R S0_UNIT1 = MAM_UNIT_R.create("UNIT1");
		MAM_CUR_R S0_CUR1 = MAM_CUR_R.create("CUR1");
		MAM_WG_R S0_WG1 = MAM_WG_R.create("WG1");
		MAM_ITM__R S0_ITM1 = MAM_ITM__R.create("ITM1");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MABSL0910_MAM_STD_SLS_UPRI_Query_S01")
					.mainQuery()
					.select(
						S0_T.prAll(),
						S0_W.peg_no,
						S0_UNIT1.unit_nm,
						S0_CUR1.cur_nm,
						S0_WG1.wg_nm,
						S0_ITM1.itm_nm
					)
					.from(
						S0_T
						.innerJoin(S0_W).on(S0_W.row_id.eq(S0_T.row_id))
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
						S0_W.mst_nm.eq(value("MAM_STD_SLS_UPRI"))
					)
			);
	}
}