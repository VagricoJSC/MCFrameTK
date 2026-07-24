package mcframe.serverMABC.MABCL1520;

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
	 * -- MABCL1520_FCT_BATCH_LOG_Query_S01
	 */
	static MCQueryPlan MABCL1520_FCT_BATCH_LOG_S01() {
		FCT_BATCH_LOG_H_R S0_H = FCT_BATCH_LOG_H_R.create("H");
		FCT_BATCH_LOG_MSG_R S0_MSG = FCT_BATCH_LOG_MSG_R.create("MSG");
		MAM_EXT_SYS_R S0_EXT_SYS = MAM_EXT_SYS_R.create("EXT_SYS");
		MAM_BP_R S0_BP = MAM_BP_R.create("BP");
		MAM_ITM_R S0_ITM = MAM_ITM_R.create("ITM");
		MAM_ITM_TYP_D_R S0_ITM_TYP_D = MAM_ITM_TYP_D_R.create("ITM_TYP_D");
		MAM_IF_X_R S1_IF_X = MAM_IF_X_R.create("IF_X");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MABCL1520_FCT_BATCH_LOG_Query_S01")
					.mainQuery()
					.selectDistinct(
						S0_MSG.prm03.as("ext_sys_cd"),
						S0_MSG.prm07.as("if_col_typ"),
						decode(
							bind("each_bp_flg"),
							value(true),
							S0_MSG.prm04,
							nullValue()
						).as("bp_cd"),
						decode(
							S0_MSG.prm07,
							value(MAC_IF_COL_TYP.ITM.value()),
							nullValue(),
							S0_MSG.prm08
						).as("if_col_cd"),
						decode(
							S0_MSG.prm07,
							value(MAC_IF_COL_TYP.ITM.value()),
							S0_MSG.prm13,
							nullValue()
						).as("if_itm_cd"),
						decode(
							S0_MSG.prm07,
							value(MAC_IF_COL_TYP.ITM.value()),
							S0_MSG.prm14,
							nullValue()
						).as("if_itm_sub1"),
						decode(
							S0_MSG.prm07,
							value(MAC_IF_COL_TYP.ITM.value()),
							S0_MSG.prm15,
							nullValue()
						).as("if_itm_sub2"),
						decode(
							S0_MSG.prm07,
							value(MAC_IF_COL_TYP.ITM.value()),
							S0_MSG.prm16,
							nullValue()
						).as("if_itm_sub3"),
						S0_MSG.prm09.as("conv_cd"),
						S0_MSG.prm10.as("conv_itm_sub1"),
						S0_MSG.prm11.as("conv_itm_sub2"),
						S0_MSG.prm12.as("conv_itm_sub3"),
						S0_EXT_SYS.ext_sys_nm.as("ext_sys_nm"),
						decode(
							bind("each_bp_flg"),
							value(true),
							S0_BP.bp_nm,
							nullValue()
						).as("bp_nm"),
						S0_ITM.itm_nm.as("if_itm_nm"),
						S0_ITM.itm_typ.as("itm_typ"),
						S0_ITM.itm_typ_d_cd,
						S0_ITM_TYP_D.itm_typ_d_nm,
						S0_ITM.itm_nm.as("if_itm_nm")
					)
					.from(
						S0_H
						.leftOuterJoin(S0_MSG).on(S0_H.batch_log_no.eq(S0_MSG.batch_log_no))
						.leftOuterJoin(S0_EXT_SYS).on(S0_MSG.prm03.eq(S0_EXT_SYS.ext_sys_cd))
						.leftOuterJoin(S0_BP).on(S0_MSG.prm04.eq(S0_BP.bp_cd))
						.leftOuterJoin(S0_ITM).on(
							S0_MSG.prm13.eq(S0_ITM.itm_cd)
							.and(S0_MSG.prm14.eq(S0_ITM.itm_sub1))
							.and(S0_MSG.prm15.eq(S0_ITM.itm_sub2))
							.and(S0_MSG.prm16.eq(S0_ITM.itm_sub3))
						)
						.leftOuterJoin(S0_ITM_TYP_D).on(
							S0_ITM.itm_typ.eq(S0_ITM_TYP_D.itm_typ)
							.and(S0_ITM.itm_typ_d_cd.eq(S0_ITM_TYP_D.itm_typ_d_cd))
						)
					)
					.where(
						value(0).eq(value(0))
						.and(
							S0_MSG.msg_id.eq(value("PFBZL0001"))
							.or(S0_MSG.msg_id.eq(value("PFBZL0501")))
						)
						.and(
							notExists(
								subQuery()
								.select(S1_IF_X.ext_sys_cd)
								.from(S1_IF_X)
								.where(
									S0_MSG.prm03.eq(S1_IF_X.ext_sys_cd)
									.and(S0_MSG.prm07.eq(S1_IF_X.if_col_typ))
									.and(
										bracket(
											S0_MSG.prm07.neq(value(MAC_IF_COL_TYP.ITM.value()))
											.and(S0_MSG.prm08.eq(S1_IF_X.if_col_cd))
										)
										.or(
											S0_MSG.prm07.eq(value(MAC_IF_COL_TYP.ITM.value()))
											.and(MAPA_COMM$F_TO_ITM_CD(S0_MSG.prm08).eq(S1_IF_X.if_itm_cd))
											.and(
												MAPA_COMM$F_TO_ITM_SUB1(S0_MSG.prm08).eq(S1_IF_X.if_itm_sub1)
												.and(
													MAPA_COMM$F_TO_ITM_SUB2(S0_MSG.prm08).eq(S1_IF_X.if_itm_sub2)
													.and(MAPA_COMM$F_TO_ITM_SUB3(S0_MSG.prm08).eq(S1_IF_X.if_itm_sub3))
												)
											)
										)
										.or(
											S0_MSG.prm09.eq(S1_IF_X.conv_cd)
											.and(
												S0_MSG.prm10.eq(S1_IF_X.conv_itm_sub1)
												.or(
													S0_MSG.prm10.isNull()
													.and(S1_IF_X.conv_itm_sub1.isNull())
												)
											)
											.and(
												S0_MSG.prm11.eq(S1_IF_X.conv_itm_sub2)
												.or(
													S0_MSG.prm11.isNull()
													.and(S1_IF_X.conv_itm_sub2.isNull())
												)
											)
											.and(
												S0_MSG.prm12.eq(S1_IF_X.conv_itm_sub3)
												.or(
													S0_MSG.prm12.isNull()
													.and(S1_IF_X.conv_itm_sub3.isNull())
												)
											)
										)
									)
								)
							)
						)
						.cutoff$and(S0_MSG.prm03.like(bind("ext_sys_cd2")))
						.cutoff$and(S0_MSG.prm07.like(bind("if_col_typ2")))
						.cutoff$and(S0_MSG.prm04.like(bind("bp_cd2")))
						.cutoff$and(S0_H.req_no.like(bind("srv_req_no")))
					)
					.orderBy(
						pr("ext_sys_cd").asc(),
						pr("if_col_typ").asc(),
						pr("bp_cd").asc(),
						pr("if_col_cd").asc(),
						pr("if_itm_cd").asc(),
						pr("if_itm_sub1").asc(),
						pr("if_itm_sub2").asc(),
						pr("if_itm_sub3").asc()
					)
			);
	}
	
	/**
	 * -- MABCL1520_MAM_BP_ITM_Query_S01
	 */
	static MCQueryPlan MABCL1520_MAM_BP_ITM_S01() {
		MAM_BP_ITM_R S0_T = MAM_BP_ITM_R.create("T");
		MAM_IF_X_R S0_IF_X = MAM_IF_X_R.create("IF_X");
		MAM_EXT_SYS_R S0_EXT_SYS = MAM_EXT_SYS_R.create("EXT_SYS");
		MAM_BP_R S0_BP = MAM_BP_R.create("BP");
		MAM_ITM_R S0_ITM = MAM_ITM_R.create("ITM");
		MAM_ITM_TYP_D_R S0_ITM_TYP_D = MAM_ITM_TYP_D_R.create("ITM_TYP_D");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MABCL1520_MAM_BP_ITM_Query_S01")
					.mainQuery()
					.select(
						bind("ext_sys_cd3").as("ext_sys_cd"),
						S0_EXT_SYS.ext_sys_nm.as("ext_sys_nm"),
						value(MAC_IF_COL_TYP.ITM.value()).as("if_col_typ"),
						S0_T.bp_cd,
						S0_T.itm_cd.as("if_itm_cd"),
						S0_T.itm_sub1.as("if_itm_sub1"),
						S0_T.itm_sub2.as("if_itm_sub2"),
						S0_T.itm_sub3.as("if_itm_sub3"),
						S0_T.itm_sub3.as("if_itm_nm"),
						S0_T.bp_itm_cd.as("conv_cd"),
						nullValue().as("conv_itm_sub1"),
						nullValue().as("conv_itm_sub2"),
						nullValue().as("conv_itm_sub3"),
						S0_T.def_flg,
						S0_T.del_flg,
						S0_IF_X.ins_usr_id,
						S0_IF_X.ins_usr_nm,
						S0_IF_X.ins_ts,
						S0_IF_X.ins_func_id,
						S0_IF_X.upd_cntr,
						S0_IF_X.upd_usr_id,
						S0_IF_X.upd_usr_nm,
						S0_IF_X.upd_ts,
						S0_IF_X.upd_func_id,
						S0_IF_X.upd_srv_req_no,
						S0_IF_X.del_usr_id,
						S0_IF_X.del_usr_nm,
						S0_IF_X.del_ts,
						S0_BP.bp_nm,
						S0_ITM.itm_typ.as("itm_typ"),
						S0_ITM.itm_typ_d_cd,
						S0_ITM_TYP_D.itm_typ_d_nm,
						S0_ITM.itm_nm.as("if_itm_nm")
					)
					.from(
						S0_T
						.leftOuterJoin(S0_IF_X).on(
							bind("ext_sys_cd3").eq(S0_IF_X.ext_sys_cd)
							.and(S0_T.bp_cd.eq(S0_IF_X.bp_cd))
							.and(S0_T.itm_cd.eq(S0_IF_X.if_itm_cd))
							.and(S0_T.itm_sub1.eq(S0_IF_X.if_itm_sub1))
							.and(S0_T.itm_sub2.eq(S0_IF_X.if_itm_sub2))
							.and(S0_T.itm_sub3.eq(S0_IF_X.if_itm_sub3))
						)
						.leftOuterJoin(S0_EXT_SYS).on(bind("ext_sys_cd3").eq(S0_EXT_SYS.ext_sys_cd))
						.leftOuterJoin(S0_BP).on(S0_T.bp_cd.eq(S0_BP.bp_cd))
						.leftOuterJoin(S0_ITM).on(
							S0_T.itm_cd.eq(S0_ITM.itm_cd)
							.and(S0_T.itm_sub1.eq(S0_ITM.itm_sub1))
							.and(S0_T.itm_sub2.eq(S0_ITM.itm_sub2))
							.and(S0_T.itm_sub3.eq(S0_ITM.itm_sub3))
						)
						.leftOuterJoin(S0_ITM_TYP_D).on(
							S0_ITM.itm_typ.eq(S0_ITM_TYP_D.itm_typ)
							.and(S0_ITM.itm_typ_d_cd.eq(S0_ITM_TYP_D.itm_typ_d_cd))
						)
					)
					.where(
						value(0).eq(value(0))
						.and(FCPA_DATE_UTIL$F_GET_TODAY1().between(S0_T.st_dt, S0_T.end_dt))
						.and(S0_T.bp_itm_cd.isNotNull())
						.cutoff$and(S0_T.bp_cd.like(bind("bp_cd3")))
					)
					.orderBy(
						S0_T.bp_cd.asc(),
						S0_T.itm_cd.asc(),
						S0_T.itm_sub1.asc(),
						S0_T.itm_sub2.asc(),
						S0_T.itm_sub3.asc()
					)
			);
	}
}