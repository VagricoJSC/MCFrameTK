package mcframe.serverMBBB.MBBBL5060;

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
	 * -- MBBBL5060_MBT_BP_SND_IF_Query_I01
	 */
	static MCQueryPlan MBBBL5060_MBT_BP_SND_IF_I01() {
		MBT_BP_SND_IF_R S0 = MBT_BP_SND_IF_R.create();
		MCTempView S1_TT = createTempView("TT");
		MAM_BP_R S2_T = MAM_BP_R.create("T");
		MCTempView S2_T2 = createTempView("T2");
		MAM_BP_SUB_R S2_T3 = MAM_BP_SUB_R.create("T3");
		MBT_BP_SND_IF_R S3_W1 = MBT_BP_SND_IF_R.create("W1");
		MBT_BP_SND_IF_R S4_W2 = MBT_BP_SND_IF_R.create("W2");
		MBT_BP_SND_IF_R S5_W = MBT_BP_SND_IF_R.create("W");
		MCDateTimeFmt[] fmtArr = {MCDateTimeFmt.YYYY, MCDateTimeFmt.MM, MCDateTimeFmt.DD, MCDateTimeFmt.HH24, MCDateTimeFmt.MI, MCDateTimeFmt.SS};
		
		
		return createQueryPlan()
			.setQuery(
				sql("MBBBL5060_MBT_BP_SND_IF_Query_I01")
					.insert(S0)
					.columns(
						S0.data_lno,
						S0.data_no,
						S0.exe_sts_typ,
						S0.data_crud_typ,
						S0.ext_sys_cd,
						S0.master_typ,
						S0.bp_cd
					)
					.query(
						subQuery()
						.select(
							MAPA_NUM$F_GET_SEQ(value(MAC_NUM_SYS_TYP.BP_SND_IF_DATA_LNO.value())),
							bind("data_no"),
							bind("exe_sts_typ"),
							S1_TT.pr("data_crud_typ"),
							bind("ext_sys_cd"),
							bind("master_typ"),
							S1_TT.pr(S2_T.bp_cd)
						)
						.from(
							subQuery()
							.select(
								S2_T.bp_cd,
								decode(
									S2_T2.pr(S3_W1.bp_cd),
									nullValue(),
									value(MAC_DATA_CRUD_TYP.CRT.value()),
									value(MAC_DATA_CRUD_TYP.UPD.value())
								).as("data_crud_typ")
							)
							.from(
								S2_T
								.leftOuterJoin(
									subQuery()
									.select(S3_W1.bp_cd)
									.from(S3_W1)
									.where(
										S3_W1.ext_sys_cd.eq(bind("ext_sys_cd"))
										.and(S3_W1.master_typ.eq(bind("master_typ")))
										.and(S3_W1.data_crud_typ.neq(value(MAC_DATA_CRUD_TYP.DEL.value())))
										.and(
											S3_W1.data_no.eq(subQuery()
												.select(max(S4_W2.data_no))
												.from(S4_W2)
												.where(
													S4_W2.ext_sys_cd.eq(bind("ext_sys_cd"))
													.and(S4_W2.master_typ.eq(bind("master_typ")))
													.and(S4_W2.bp_cd.eq(S3_W1.bp_cd))
												)
											)
										)
									).view(S2_T2)
								).on(S2_T2.pr(S3_W1.bp_cd).eq(S2_T.bp_cd))
								.leftOuterJoin(S2_T3).on(
									S2_T3.bp_cd.eq(S2_T.bp_cd)
									.and(S2_T3.st_dt.lte(FCPA_DATE_UTIL$F_GET_TODAY1()))
									.and(S2_T3.end_dt.gte(FCPA_DATE_UTIL$F_GET_TODAY1()))
								)
							)
							.where(
								notExists(
									subQuery()
									.select(value("X"))
									.from(S5_W)
									.where(
										S5_W.ext_sys_cd.eq(bind("ext_sys_cd"))
										.and(S5_W.master_typ.eq(bind("master_typ")))
										.and(S5_W.bp_cd.eq(S2_T.bp_cd))
										.and(
											bracket(
												S5_W.exe_sts_typ.neq(value(MAC_EXE_STS_TYP.OK.value()))	
												.and(
													bind("send_skip_bp_flg_str").eq(value(false))
													.or(S5_W.exe_sts_typ.neq(value(MAC_EXE_STS_TYP.SKP.value())))
												)
											)
											.or(S2_T.upd_ts.lte(S5_W.upd_ts)
												.and(S2_T3.upd_ts.isNull().or(greatest(S2_T3.upd_ts,toTimestamp(toChar(S2_T3.st_dt, fmtArr), fmtArr)).lte(S5_W.upd_ts))))
										)
									)
								)
								.cutoff$and(S2_T.cst_flg.eq(bind("cst_flg_str")))
								.cutoff$and(S2_T.sppl_flg.eq(bind("sppl_flg_str")))
							)
							.orderBy(S2_T.bp_cd.asc()).view(S1_TT)
						)
					)
			);
	}
	
	/**
	 * -- MBBBL5060_MBT_BP_SND_IF_Query_I02
	 */
	static MCQueryPlan MBBBL5060_MBT_BP_SND_IF_I02() {
		MBT_BP_SND_IF_R S0 = MBT_BP_SND_IF_R.create();
		MCTempView S1_TT = createTempView("TT");
		MBT_BP_SND_IF_R S2_T = MBT_BP_SND_IF_R.create("T");
		MBT_BP_SND_IF_R S3_W = MBT_BP_SND_IF_R.create("W");
		MBT_BP_SND_IF_R S4_W = MBT_BP_SND_IF_R.create("W");
		MAM_BP_R S5_W = MAM_BP_R.create("W");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MBBBL5060_MBT_BP_SND_IF_Query_I02")
					.insert(S0)
					.columns(
						S0.data_lno,
						S0.data_no,
						S0.exe_sts_typ,
						S0.data_crud_typ,
						S0.ext_sys_cd,
						S0.master_typ,
						S0.bp_cd
					)
					.query(
						subQuery()
						.select(
							MAPA_NUM$F_GET_SEQ(value(MAC_NUM_SYS_TYP.BP_SND_IF_DATA_LNO.value())),
							bind("data_no"),
							bind("exe_sts_typ"),
							value(MAC_DATA_CRUD_TYP.DEL.value()),
							bind("ext_sys_cd"),
							bind("master_typ"),
							S1_TT.pr(S2_T.bp_cd)
						)
						.from(
							subQuery()
							.select(S2_T.bp_cd)
							.from(S2_T)
							.where(
								S2_T.ext_sys_cd.eq(bind("ext_sys_cd"))
								.and(S2_T.master_typ.eq(bind("master_typ")))
								.and(S2_T.exe_sts_typ.eq(value(MAC_EXE_STS_TYP.OK.value())))
								.and(S2_T.data_crud_typ.neq(value(MAC_DATA_CRUD_TYP.DEL.value())))
								.and(
									S2_T.data_no.eq(subQuery()
										.select(max(S3_W.data_no))
										.from(S3_W)
										.where(
											S3_W.ext_sys_cd.eq(bind("ext_sys_cd"))
											.and(S3_W.master_typ.eq(bind("master_typ")))
											.and(S3_W.bp_cd.eq(S2_T.bp_cd))
										)
									)
								)
								.and(
									notExists(
										subQuery()
										.select(value("X"))
										.from(S4_W)
										.where(
											S4_W.ext_sys_cd.eq(bind("ext_sys_cd"))
											.and(S4_W.master_typ.eq(bind("master_typ")))
											.and(S4_W.bp_cd.eq(S2_T.bp_cd))
											.and(
												bracket(
													S4_W.exe_sts_typ.neq(value(MAC_EXE_STS_TYP.OK.value()))
													.and(
														bind("send_skip_bp_flg_str").eq(value(false))
														.or(S4_W.exe_sts_typ.neq(value(MAC_EXE_STS_TYP.SKP.value())))
													)
												)
											)
										)
									)
								)
								.and(
									notExists(
										subQuery()
										.select(value("X"))
										.from(S5_W)
										.where(
											S5_W.bp_cd.eq(S2_T.bp_cd)
											.cutoff$and(S5_W.cst_flg.eq(bind("cst_flg_str")))
											.cutoff$and(S5_W.sppl_flg.eq(bind("sppl_flg_str")))
										)
									)
								)
							)
							.orderBy(S2_T.bp_cd.asc()).view(S1_TT)
						)
					)
			);
	}
}