package mcframe.serverMBBA.MBBAL5010;

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
import mcframe.serverCore.dbc.*;
import mcframe.serverMA.dbc.*;
import mcframe.serverMB.dbc.*;

import static mcframe.serverCore.dbc.CoreFunction.*;
import static mcframe.serverMA.dbc.MAFunction.*;
import static mcframe.serverMA.dbc.MABCFunction.*;
import static mcframe.serverMA.dbc.MABGFunction.*;
import static mcframe.serverMA.dbc.MABSFunction.*;
import static mcframe.serverMA.dbc.MAUAFunction.*;
import static mcframe.serverMB.dbc.MBBAFunction.*;
import static mcframe.serverMB.dbc.MBBBFunction.*;
import static mcframe.serverMB.dbc.MBBEFunction.*;

public class Query_MC {
	
	/**
	 * -- MBBAL5010_MBW_APRV_Query_S01
	 */
	static MCQueryPlan MBBAL5010_MBW_APRV_S01() {
		MBW_APRV_R S0_W01 = MBW_APRV_R.create("W01");
		MAM_APRV_R S0_M01 = MAM_APRV_R.create("M01");
		MAM_APRV_RT_R S0_M02 = MAM_APRV_RT_R.create("M02");
		MAVM_APRV_USR_R S0_M03 = MAVM_APRV_USR_R.create("M03");
		MAM_ITM_R S0_M04 = MAM_ITM_R.create("M04");
		MAM_BP_R S0_M05 = MAM_BP_R.create("M05");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MBBAL5010_MBW_APRV_Query_S01")
					.mainQuery()
					.select(
						S0_W01.peg_no,
						S0_M01.aprv_row_num,
						S0_M01.prio,
						S0_M01.aprv_rt_ptn,
						S0_M01.aprv_upd_flg,
						S0_M01.aprv_del_flg.as("aprv_can_flg"),
						S0_M01.itm_grp_typ,
						S0_M01.itm_grp_cd,
						S0_M01.bp_grp_typ,
						S0_M01.bp_grp_cd,
						S0_M01.val_min1,
						S0_M01.val_max1,
						S0_M01.bind_cond1,
						S0_M01.val_min2,
						S0_M01.val_max2,
						S0_M01.bind_cond2,
						S0_M01.val_min3,
						S0_M01.val_max3,
						S0_M02.aprv_role_cd,
						S0_M02.aprv_seq,
						S0_M03.usr_cd.as("aprv_usr_cd"),
						S0_M04.itm_grp_cd1,
						S0_M04.itm_grp_cd2,
						S0_M04.itm_grp_cd3,
						S0_M04.itm_grp_cd4,
						S0_M04.itm_grp_cd5,
						S0_M04.itm_grp_cd6,
						S0_M04.itm_grp_cd7,
						S0_M04.itm_grp_cd8,
						S0_M04.itm_grp_cd9,
						S0_M04.itm_grp_cd10,
						S0_M05.bp_grp_cd1,
						S0_M05.bp_grp_cd2,
						S0_M05.bp_grp_cd3,
						S0_M05.bp_grp_cd4,
						S0_M05.bp_grp_cd5,
						S0_M05.bp_grp_cd6,
						S0_M05.bp_grp_cd7,
						S0_M05.bp_grp_cd8,
						S0_M05.bp_grp_cd9,
						S0_M05.bp_grp_cd10
					)
					.from(
						S0_W01
						.innerJoin(S0_M01).on(
							bracket(
								S0_W01.aprv_func_typ.eq(S0_M01.aprv_func_typ)
								.and(S0_W01.master_dt.between(S0_M01.st_dt, S0_M01.end_dt))
								.and(
									S0_M01.itm_cd.isNull()
									.or(S0_W01.src_itm_cd.eq(S0_M01.itm_cd))
								)
								.and(
									S0_M01.itm_sub1.isNull()
									.or(S0_W01.src_itm_sub1.eq(S0_M01.itm_sub1))
								)
								.and(
									S0_M01.itm_sub2.isNull()
									.or(S0_W01.src_itm_sub2.eq(S0_M01.itm_sub2))
								)
								.and(
									S0_M01.itm_sub3.isNull()
									.or(S0_W01.src_itm_sub3.eq(S0_M01.itm_sub3))
								)
								.and(
									S0_M01.dpt_cd.isNull()
									.or(S0_W01.src_dpt_cd.eq(S0_M01.dpt_cd))
								)
								.and(
									S0_M01.bp_cd.isNull()
									.or(S0_W01.src_bp_cd.eq(S0_M01.bp_cd))
								)
								.and(
									S0_M01.cur_cd1.isNull()
									.or(S0_W01.src_cur_cd1.eq(S0_M01.cur_cd1))
								)
								.and(
									S0_M01.cur_cd2.isNull()
									.or(S0_W01.src_cur_cd2.eq(S0_M01.cur_cd2))
								)
								.and(
									S0_M01.cur_cd3.isNull()
									.or(S0_W01.src_cur_cd3.eq(S0_M01.cur_cd3))
								)
								.and(
									S0_M01.ext_key1.isNull()
									.or(S0_W01.src_ext_key1.eq(S0_M01.ext_key1))
								)
								.and(
									S0_M01.ext_key2.isNull()
									.or(S0_W01.src_ext_key2.eq(S0_M01.ext_key2))
								)
								.and(
									S0_M01.ext_key3.isNull()
									.or(S0_W01.src_ext_key3.eq(S0_M01.ext_key3))
								)
							)
						)
						.innerJoin(S0_M02).on(
							bracket(
								S0_W01.aprv_func_typ.eq(S0_M02.aprv_func_typ)
								.and(S0_W01.master_dt.between(S0_M02.st_dt, S0_M02.end_dt))
								.and(S0_M01.aprv_rt_ptn.eq(S0_M02.aprv_rt_ptn))
							)
						)
						.innerJoin(S0_M03).on(
							bracket(
								S0_W01.master_dt.between(S0_M03.st_dt, S0_M03.end_dt)
								.and(S0_M02.aprv_role_cd.eq(S0_M03.aprv_role_cd))
								.and(S0_M03.main_flg.eq(value(true)))
							)
						)
						.leftOuterJoin(S0_M04).on(
							bracket(
								S0_W01.src_itm_cd.eq(S0_M04.itm_cd)
								.and(S0_W01.src_itm_sub1.eq(S0_M04.itm_sub1))
								.and(S0_W01.src_itm_sub2.eq(S0_M04.itm_sub2))
								.and(S0_W01.src_itm_sub3.eq(S0_M04.itm_sub3))
							)
						)
						.leftOuterJoin(S0_M05).on(
							bracket(
								S0_W01.src_bp_cd.eq(S0_M05.bp_cd)
							)
						)
					)
			);
	}
}