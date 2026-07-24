package mcframe.serverMSLA.MSLAL6040;

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
	 * -- MSLAL6040_MST_ARR_SCHD_Query_S01
	 */
	static MCQueryPlan MSLAL6040_MST_ARR_SCHD_S01() {
		MCTempView S0_V1 = createTempView("V1");
		MST_ARR_SCHD_R S0_T1 = MST_ARR_SCHD_R.create("T1");
		MST_ARR_PR_R S0_T2 = MST_ARR_PR_R.create("T2");
		MST_PO_D_R S0_T3 = MST_PO_D_R.create("T3");
		MST_PRMS_RCPT_D_R S0_T5 = MST_PRMS_RCPT_D_R.create("T5");
		MST_DLV_INST_D_R S0_T6 = MST_DLV_INST_D_R.create("T6");
		MST_PURC_SCHD_R S0_T8 = MST_PURC_SCHD_R.create("T8");
		MST_RCPT_IV_D_R S0_T9 = MST_RCPT_IV_D_R.create("T9");
		MSW_ARR_SCHD_KEY_R S1_W1 = MSW_ARR_SCHD_KEY_R.create("W1");
		MSW_PRMS_RCPT_D_KEY_R S2_W1 = MSW_PRMS_RCPT_D_KEY_R.create("W1");
		MST_ARR_SCHD_R S2_W2 = MST_ARR_SCHD_R.create("W2");
		MSW_DLV_INST_D_KEY_R S3_W1 = MSW_DLV_INST_D_KEY_R.create("W1");
		MST_ARR_SCHD_R S3_W2 = MST_ARR_SCHD_R.create("W2");
		MSW_RCPT_IV_D_KEY_R S4_W1 = MSW_RCPT_IV_D_KEY_R.create("W1");
		MST_RCPT_IV_D_R S4_W2 = MST_RCPT_IV_D_R.create("W2");
		MST_PURC_SCHD_R S4_W3 = MST_PURC_SCHD_R.create("W3");
		MSW_PO_D_KEY_R S5_W1 = MSW_PO_D_KEY_R.create("W1");
		MST_ARR_PR_R S5_W2 = MST_ARR_PR_R.create("W2");
		MST_ARR_SCHD_R S5_W3 = MST_ARR_SCHD_R.create("W3");
		MSW_SLS_RET_SCHD_D_KEY_R S6_W1 = MSW_SLS_RET_SCHD_D_KEY_R.create("W1");
		MST_ARR_PR_R S6_W2 = MST_ARR_PR_R.create("W2");
		MST_ARR_SCHD_R S6_W3 = MST_ARR_SCHD_R.create("W3");
		MSW_IV_D_KEY_R S7_W1 = MSW_IV_D_KEY_R.create("W1");
		MST_ARR_PR_R S7_W2 = MST_ARR_PR_R.create("W2");
		MST_ARR_SCHD_R S7_W3 = MST_ARR_SCHD_R.create("W3");
		MSW_DLV_SLIP_D_KEY_R S8_W1 = MSW_DLV_SLIP_D_KEY_R.create("W1");
		MST_ARR_PR_R S8_W2 = MST_ARR_PR_R.create("W2");
		MST_ARR_SCHD_R S8_W3 = MST_ARR_SCHD_R.create("W3");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSLAL6040_MST_ARR_SCHD_Query_S01")
					.mainQuery()
					.select(
						S0_V1.pr(S1_W1.arr_schd_no),
						S0_T1.prms_rcpt_d_no,
						nvl(
							S0_T1.dlv_inst_d_no,
							S0_T6.dlv_inst_d_no
						).as("dlv_inst_d_no"),
						S0_T2.po_d_no,
						S0_T2.sls_ret_schd_d_no,
						S0_T2.iv_d_no,
						S0_T2.dlv_slip_d_no,
						S0_T1.arr_pr_no,
						S0_T1.rcpt_iv_no,
						S0_T1.rcpt_iv_mng_no,
						S0_T9.rcpt_iv_d_no,
						S0_T1.iv_no,
						nvl2(
							S0_T1.iv_no,
							nullValue(),
							S0_T1.dlv_slip_no
						).as("dlv_slip_no"),
						nvl2(
							S0_T1.rcpt_iv_mng_no,
							nullValue(),
							S0_T3.po_no
						).as("po_no"),
						S0_T1.arr_schd_tm,
						S0_T1.itm_cd,
						S0_T1.itm_sub1,
						S0_T1.itm_sub2,
						S0_T1.itm_sub3,
						S0_T1.lot_no,
						S0_T1.sublot_no,
						S0_T1.gd_cd,
						S0_T1.base_unit_qty,
						S0_T1.arr_qty,
						S0_T1.abort_flg,
						S0_T1.cmpl_flg,
						// this field is appended by sql coverter.
						S0_T3.po_no.as("join_po_no_")
					)
					.from(
						subQuery()
						.select(S1_W1.arr_schd_no)
						.from(S1_W1)
						.union(
							subQuery()
							.select(S2_W2.arr_schd_no)
							.from(
								S2_W1
								.innerJoin(S2_W2).on(
									bracket(
										S2_W2.prms_rcpt_d_no.eq(S2_W1.prms_rcpt_d_no)
									)
								)
							)
							.union(
								subQuery()
								.select(S3_W2.arr_schd_no)
								.from(
									S3_W1
									.innerJoin(S3_W2).on(
										bracket(
											S3_W2.dlv_inst_d_no.eq(S3_W1.dlv_inst_d_no)
										)
									)
								)
								.union(
									subQuery()
									.select(S4_W3.arr_schd_no)
									.from(
										S4_W1
										.innerJoin(S4_W2).on(
											bracket(
												S4_W2.rcpt_iv_d_no.eq(S4_W1.rcpt_iv_d_no)
											)
										)
										.innerJoin(S4_W3).on(
											bracket(
												S4_W3.purc_schd_no.eq(S4_W2.purc_schd_no)
											)
										)
									)
									.union(
										subQuery()
										.select(S5_W3.arr_schd_no)
										.from(
											S5_W1
											.innerJoin(S5_W2).on(
												bracket(
													S5_W2.po_d_no.eq(S5_W1.po_d_no)
												)
											)
											.innerJoin(S5_W3).on(
												bracket(
													S5_W3.arr_pr_no.eq(S5_W2.arr_pr_no)
												)
											)
										)
										.union(
											subQuery()
											.select(S6_W3.arr_schd_no)
											.from(
												S6_W1
												.innerJoin(S6_W2).on(
													bracket(
														S6_W2.sls_ret_schd_d_no.eq(S6_W1.sls_ret_schd_d_no)
													)
												)
												.innerJoin(S6_W3).on(
													bracket(
														S6_W3.arr_pr_no.eq(S6_W2.arr_pr_no)
													)
												)
											)
											.union(
												subQuery()
												.select(S7_W3.arr_schd_no)
												.from(
													S7_W1
													.innerJoin(S7_W2).on(
														bracket(
															S7_W2.iv_d_no.eq(S7_W1.iv_d_no)
														)
													)
													.innerJoin(S7_W3).on(
														bracket(
															S7_W3.arr_pr_no.eq(S7_W2.arr_pr_no)
														)
													)
												)
												.union(
													subQuery()
													.select(S8_W3.arr_schd_no)
													.from(
														S8_W1
														.innerJoin(S8_W2).on(
															bracket(
																S8_W2.dlv_slip_d_no.eq(S8_W1.dlv_slip_d_no)
															)
														)
														.innerJoin(S8_W3).on(
															bracket(
																S8_W3.arr_pr_no.eq(S8_W2.arr_pr_no)
															)
														)
													)
												)
											)
										)
									)
								)
							)
						).view(S0_V1)
						.innerJoin(S0_T1).on(
							bracket(
								S0_T1.arr_schd_no.eq(S0_V1.pr(S1_W1.arr_schd_no))
							)
						)
						.innerJoin(S0_T2).on(
							bracket(
								S0_T2.arr_pr_no.eq(S0_T1.arr_pr_no)
							)
						)
						.leftOuterJoin(S0_T3).on(
							bracket(
								S0_T3.po_d_no.eq(S0_T2.po_d_no)
							)
						)
						.leftOuterJoin(S0_T5).on(
							bracket(
								S0_T1.prms_rcpt_d_no.eq(S0_T5.prms_rcpt_d_no)
							)
						)
						.leftOuterJoin(S0_T6).on(
							bracket(
								S0_T5.dlv_inst_d_no.eq(S0_T6.dlv_inst_d_no)
								.and(S0_T6.can_flg.eq(value(false)))
							)
						)
						.leftOuterJoin(S0_T8).on(
							bracket(
								S0_T8.arr_schd_no.eq(S0_T1.arr_schd_no)
							)
						)
						.leftOuterJoin(S0_T9).on(
							bracket(
								S0_T9.purc_schd_no.eq(S0_T8.purc_schd_no)
							)
						)
					)
			)
			.setJoinInfo(
				joinInfo(
					j -> j
						.add(MST_SLS_RET_SCHD_D_R.class, r -> toCondition(
							r.getStringNE("sls_ret_schd_d_no")
						))
						.addSelect(m -> toArray(
							m.sls_ret_schd_no
						))
						.addMap((r, m) -> {
							r.setStringNE("sls_ret_schd_no", m.sls_ret_schd_no());
					}),
					j -> j
						.add(MST_PO_R.class, r -> toCondition(
							r.getStringNE("join_po_no_")
						))
						.addSelect(m -> toArray(
							m.sppl_cd
						))
						.addMap((r, m) -> {
							r.setStringNE("join_sppl_cd_", m.sppl_cd());
					}),
					j -> j
						.add(MAM_BP_R.class, r -> toCondition(
							r.getStringNE("join_sppl_cd_")
						))
						.addSelect(m -> toArray(
							m.sppl_iv_flg
						))
						.addMap((r, m) -> {
							r.setBooleanNE("sppl_iv_flg", m.sppl_iv_flg());
					})
				)
			);
	}
}