package mcframe.serverMSBB.MSBBB0020;

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
	 * -- MSBBB0020_MST_SLS_SCHD_Query_S01
	 */
	static MCQueryPlan MSBBB0020_MST_SLS_SCHD_S01() {
		MST_SLS_SCHD_R S0_SLSSCHD = MST_SLS_SCHD_R.create("SLSSCHD");
		MST_SLO_D_R S0_SLOD = MST_SLO_D_R.create("SLOD");
		MST_SLO_R S0_SLO = MST_SLO_R.create("SLO");
		MST_IV_D_R S0_IVD = MST_IV_D_R.create("IVD");
		MST_IV_R S0_IV = MST_IV_R.create("IV");
		MST_DLV_SLIP_D_R S0_SLIPD = MST_DLV_SLIP_D_R.create("SLIPD");
		MST_DLV_SLIP_R S0_SLIP = MST_DLV_SLIP_R.create("SLIP");
		MST_SHIP_SCHD_R S0_SHIPSCHD = MST_SHIP_SCHD_R.create("SHIPSCHD");
		MST_DLV_SLIP_R S1_W = MST_DLV_SLIP_R.create("W1");
		
		return createQueryPlan()
			.setQuery(
				sql("MSBBB0020_MST_SLS_SCHD_Query_S01")
				.mainQuery()
				.select(
						S0_SLSSCHD.sls_schd_no,
						decode(
								S0_SLSSCHD.iv_no,
							nullValue(),
							decode(
									S0_SLSSCHD.slo_d_no,
									nullValue(),
									S0_SLIP.bp_cd,
									S0_SLO.cst_cd
									),
							S0_IV.ship_rqst_id_cd
							).as("cst_cd")
				)
				.from(
						S0_SLSSCHD
					.leftOuterJoin(S0_SLOD).on(S0_SLSSCHD.slo_d_no.eq(S0_SLOD.slo_d_no))
					.leftOuterJoin(S0_SLO).on(S0_SLOD.slo_no.eq(S0_SLO.slo_no))
					.leftOuterJoin(S0_IVD).on(S0_SLSSCHD.iv_d_no.eq(S0_IVD.iv_d_no))
					.leftOuterJoin(S0_IV).on(S0_SLSSCHD.iv_no.eq(S0_IV.iv_no))
					.leftOuterJoin(S0_SLIPD).on(S0_SLSSCHD.dlv_slip_d_no.eq(S0_SLIPD.dlv_slip_d_no))
					.leftOuterJoin(S0_SLIP).on(
						bracket(
							S0_SLIPD.dlv_slip_no.eq(S0_SLIP.dlv_slip_no)
							.and(S0_SLIPD.dlv_slip_seq.eq(S0_SLIP.dlv_slip_seq))
						)
					)
					.leftOuterJoin(S0_SHIPSCHD).on(S0_SLSSCHD.ship_schd_no.eq(S0_SHIPSCHD.ship_schd_no))
				)
				.where(
						S0_SLSSCHD.sls_ac_abl_flg.eq(value(true))
					.and(S0_SLSSCHD.cmpl_flg.eq(value(false)))
					.cutoff$and(S0_SLSSCHD.sls_schd_dt.gte(bind("sls_schd_dt_fr")))
					.and(S0_SLSSCHD.sls_schd_dt.lte(bind("sls_schd_dt_to")))
					.and(
							S0_SLSSCHD.base_unit_sls_qty.eq(value(0))
						.or(bind("inc_partial_sls_flg").eq(value(true)))
					)
					.and(
							S0_SLIP.dlv_slip_no.isNull()
							.or(S0_SLIP.dlv_slip_seq.eq(
									subQuery()
									.select(max(S1_W.dlv_slip_seq))
									.from(S1_W)
									.where(
										S1_W.dlv_slip_no.eq(S0_SLIP.dlv_slip_no)
										.and(S1_W.trn_typ.eq(value(MSC_TRN_TYP.SHIP.value())))
										.and(S1_W.slip_sts_typ.neq(value(MAC_SLIP_STS_TYP.CAN.value())))
									)
								)
									.and(S0_SLSSCHD.sls_schd_dt.gte(S0_SLIP.ac_dt).or(bind("sls_schd_dt_not_ac_flg").eq(value(true)))))
					)
					.and(decode(
							S0_SLSSCHD.iv_no,
							nullValue(),
							decode(
									S0_SLSSCHD.dlv_slip_d_no,
									nullValue(),
									S0_SLO.sls_basis_typ,
									S0_SLIP.sls_basis_typ
									),
							S0_IV.sls_basis_typ).eq(value(MAC_SLS_BASIS_TYP.ARRIVAL_BASIS.value()))
							.or(bind("inc_in_basis_flg").eq(value(true))
									.and(decode(
											S0_SLSSCHD.iv_no,
											nullValue(),
											decode(
													S0_SLSSCHD.dlv_slip_d_no,
													nullValue(),
													S0_SLO.sls_basis_typ,
													S0_SLIP.sls_basis_typ
													),
											S0_IV.sls_basis_typ).eq(value(MAC_SLS_BASIS_TYP.IN_BASIS.value()))))
							.or(S0_SLSSCHD.slo_d_no.isNotNull().and(S0_SLOD.proc_typ.eq(value(MAC_SLO_PROC_TYP.PURC_DDLV.value()))))
							)
					.and(bind("inc_purc_ddlv_flg").eq(value(true)).or(S0_SLSSCHD.slo_d_no.isNull()).or(S0_SLOD.proc_typ.isNull()).or(S0_SLOD.proc_typ.neq(value(MAC_SLO_PROC_TYP.PURC_DDLV.value()))))
					.and(S0_SLSSCHD.slo_d_no.isNull().or(S0_SLOD.sls_cststk_flg.eq(value(false))))
					.cutoff$and(decode(
							S0_SLSSCHD.iv_no,
							nullValue(),
							decode(
									S0_SLSSCHD.slo_d_no,
									nullValue(),
									S0_SLIP.bp_cd,
									S0_SLO.cst_cd
									),
							S0_IV.ship_rqst_id_cd).eq(bind("cst_cd")))
					.cutoff$and(decode(
							S0_SLSSCHD.iv_no,
							nullValue(),
							decode(
									S0_SLSSCHD.dlv_slip_d_no,
									nullValue(),
									nvl(S0_SHIPSCHD.dlv_cd, S0_SLOD.dlv_cd),
									S0_SLIP.dlv_id_cd
									),
							S0_IV.dlv_id_cd).eq(bind("dlv_cd")))
				)
		);
	}
	
	/**
	 * -- MSBBB0020_MST_SLS_SCHD_Query_S02
	 */
	static MCQueryPlan MSBBB0020_MST_SLS_SCHD_S02() {
		MST_SLS_SCHD_R S0_SLSSCHD = MST_SLS_SCHD_R.create("SLSSCHD");
		MST_SLO_D_R S0_SLOD = MST_SLO_D_R.create("SLOD");
		MST_SLO_R S0_SLO = MST_SLO_R.create("SLO");
		MST_IV_D_R S0_IVD = MST_IV_D_R.create("IVD");
		MST_IV_R S0_IV = MST_IV_R.create("IV");
		MST_DLV_SLIP_D_R S0_SLIPD = MST_DLV_SLIP_D_R.create("SLIPD");
		MST_DLV_SLIP_R S0_SLIP = MST_DLV_SLIP_R.create("SLIP");
		MST_SHIP_SCHD_R S0_SHIPSCHD = MST_SHIP_SCHD_R.create("SHIPSCHD");
		MST_PURC_SCHD_R S0_PURCSCHD = MST_PURC_SCHD_R.create("PURCSCHD");
		MST_PURC_ACT_D_R S0_PURCACTD = MST_PURC_ACT_D_R.create("PURCACTD");
		MST_PURC_ACT_R S0_PURCACT = MST_PURC_ACT_R.create("PURCACT");
		MST_ARR_SCHD_R S0_ARRSCHD = MST_ARR_SCHD_R.create("ARRSCHD");
		MST_PURC_DLV_SLIP_D_R S0_PURCDLVSLIP = MST_PURC_DLV_SLIP_D_R.create("PURCDLVSLIP");
		MAM_BP_R S0_CST = MAM_BP_R.create("CST");
		MST_IV_MAP_R S1_IVMAP = MST_IV_MAP_R.create("IVMAP");
		MST_SHIP_ALLOC_STS_R S1_SAS = MST_SHIP_ALLOC_STS_R.create("SAS");
		MST_SHIP_ACT_D_R S1_SHIPACTD = MST_SHIP_ACT_D_R.create("SHIPACTD ");
		MCTempView S1_IVSHIPACTD = createTempView("SHIPACTD");
		MST_DLV_SLIP_R S1_W = MST_DLV_SLIP_R.create("W");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBBB0020_MST_SLS_SCHD_Query_S02")
				.mainQuery()
				.select(
						S0_SLSSCHD.sls_schd_no,
						S0_SLSSCHD.purc_schd_no,
						S0_SLSSCHD.sls_schd_dt,
						S0_SLSSCHD.iv_no,
						S0_SLSSCHD.slo_d_no,
						S0_SLSSCHD.base_unit_qty.as("sls_schd_qty"),
						S0_SLSSCHD.base_unit_abort_qty.as("abort_qty"),
						S0_SLSSCHD.base_unit_sls_qty.as("sls_qty"),
						S0_SLIP.dlv_slip_no,
						S0_SLO.slo_no,
						S0_IV.via_dlv_typ,
						decode(
								bind("sls_schd_dt_not_ac_flg"),
								value(true),
								bind("today"),
								S0_SLSSCHD.sls_schd_dt).as("sls_dt"),
						S0_IV.rcv_schd_dt,
						decode(
								S0_SLSSCHD.iv_no,
								nullValue(),
								decode(
										S0_SLSSCHD.dlv_slip_d_no,
									nullValue(),
									S0_SLOD.itm_cd,
									S0_SLIPD.itm_cd
								),
								S0_IVD.itm_cd
							).as("itm_cd"),
							decode(
									S0_SLSSCHD.iv_no,
								nullValue(),
								decode(
										S0_SLSSCHD.dlv_slip_d_no,
									nullValue(),
									S0_SLOD.itm_sub1,
									S0_SLIPD.itm_sub1
								),
								S0_IVD.itm_sub1
							).as("itm_sub1"),
							decode(
									S0_SLSSCHD.iv_no,
								nullValue(),
								decode(
										S0_SLSSCHD.dlv_slip_d_no,
									nullValue(),
									S0_SLOD.itm_sub2,
									S0_SLIPD.itm_sub2
								),
								S0_IVD.itm_sub2
							).as("itm_sub2"),
							decode(
									S0_SLSSCHD.iv_no,
								nullValue(),
								decode(
										S0_SLSSCHD.dlv_slip_d_no,
									nullValue(),
									S0_SLOD.itm_sub3,
									S0_SLIPD.itm_sub3
								),
								S0_IVD.itm_sub3
							).as("itm_sub3"),
						decode(
							S0_SLSSCHD.iv_no,
							nullValue(),
							decode(
									S0_SLSSCHD.slo_d_no,
									nullValue(),
									S0_SLIP.bp_cd,
									S0_SLO.cst_cd
									),
							S0_IV.ship_rqst_id_cd).as("cst_cd"),
						decode(
								S0_SLSSCHD.iv_no,
								nullValue(),
								decode(
										S0_SLSSCHD.dlv_slip_d_no,
										nullValue(),
										nvl(S0_SHIPSCHD.dlv_cd, S0_SLOD.dlv_cd),
										S0_SLIP.dlv_id_cd
										),
								S0_IV.dlv_id_cd).as("dlv_cd"),
						cases()
						.when(
								S0_PURCSCHD.purc_schd_no.isNotNull()
								.and(S0_PURCACTD.purc_act_no.isNull())
								)
						.then(value(true))
						.otherwise(value(false)).as("sync_flg"),
						decode(
								S0_SLSSCHD.iv_no,
								nullValue(),
								decode(
										S0_SLSSCHD.dlv_slip_d_no,
										nullValue(),
										S0_SLO.sls_basis_typ,
										S0_SLIP.sls_basis_typ
										),
								S0_IV.sls_basis_typ).as("sls_basis_typ"),
						cases()
						.when(S0_SLOD.proc_typ.eq(value(MAC_SLO_PROC_TYP.PURC_DDLV.value())))
							.then(S0_SHIPSCHD.ship_schd_tm)
						.otherwise(S0_SLIP.ship_tm).as("ship_tm"),
						cases()
						.when(S0_SLOD.proc_typ.eq(value(MAC_SLO_PROC_TYP.PURC_DDLV.value())))
							.then(S0_SHIPSCHD.dlv_schd_tm)
						.otherwise(S0_SLIP.dlv_tm).as("dlv_tm"),
						decode(
								S0_SLSSCHD.iv_no,
								nullValue(),
								decode(
										S0_SLSSCHD.slo_d_no,
										nullValue(),
										S0_SLIP.usr_cd,
										S0_SLO.sls_usr_cd
								),
								S0_IVD.sls_usr_cd
							).as("sls_usr_cd"),
							decode(
									S0_SLSSCHD.iv_no,
								nullValue(),
								decode(
										S0_SLSSCHD.slo_d_no,
										nullValue(),
										S0_SLIP.dpt_cd,
										S0_SLO.sls_dpt_cd
								),
								S0_IVD.sls_dpt_cd
							).as("sls_dpt_cd"),
							decode(
									S0_SLSSCHD.iv_no,
									nullValue(),
									decode(
											S0_SLSSCHD.slo_d_no,
											nullValue(),
											cases()
												.when(S0_CST.ar_dpt_typ.eq(value(MAC_AR_DPT_TYP.SLS.value())))
												.then(decode(S0_SLSSCHD.iv_no,
														nullValue(),
														decode(
																S0_SLSSCHD.slo_d_no,
																nullValue(),
																S0_SLIP.dpt_cd,
																S0_SLO.sls_dpt_cd
														),
														S0_IVD.sls_dpt_cd))
												.when(S0_CST.ar_dpt_typ.eq(value(MAC_AR_DPT_TYP.AR.value())))
												.then(
														MAPA_BP$F_GET_AR_DPT_CD_NE(
																S0_CST.bp_cd,
																S0_SLSSCHD.sls_schd_dt,
																value(false)
																)
														)
												.otherwise(nullValue()),
											S0_SLO.ar_dpt_cd
									),
									S0_IVD.ar_dpt_cd
								).as("ar_dpt_cd"),
						cases()
						.when(S0_IV.xrate_inpt_flg.eq(value(true))).then(S0_IV.xrate)
						.when(S0_SLSSCHD.iv_no.isNull().and(S0_SLO.xrate_inpt_flg.eq(value(true)))).then(S0_SLO.xrate)
						.otherwise(
								MAPA_XCHNG$F_GET_SLS_XRATE_NE(
										decode(
												S0_SLSSCHD.iv_no,
												nullValue(),
											decode(
													S0_SLSSCHD.dlv_slip_d_no,
													nullValue(),
													S0_SLO.trd_cur_cd,
													S0_SLIP.trd_cur_cd
													),
											S0_IV.trd_cur_cd
											),
										decode(
												bind("sls_schd_dt_not_ac_flg"),
												value(true),
												bind("today"),
												S0_SLSSCHD.sls_schd_dt)
										)
								).as("xrate"),
						cases()
						.when(bind("ptax_cur_cd").isNotNull())
						.then(
								cases()
								.when(S0_IV.ptax_xrate_inpt_flg.eq(value(true))).then(S0_IV.ptax_xrate)
								.when(S0_SLSSCHD.iv_no.isNull().and(S0_SLO.ptax_xrate_inpt_flg.eq(value(true)))).then(S0_SLO.ptax_xrate)
								.otherwise(
										MAPA_XCHNG$F_GET_XRATE_NE(
												decode(
														S0_SLSSCHD.iv_no,
														nullValue(),
														decode(
																S0_SLSSCHD.dlv_slip_d_no,
																nullValue(),
																S0_SLO.trd_cur_cd,
																S0_SLIP.trd_cur_cd
															),
														S0_IV.trd_cur_cd
														),
														bind("ptax_cur_cd"),
														bind("sls_xrate_cd"),
														decode(
																bind("sls_schd_dt_not_ac_flg"),
																value(true),
																bind("today"),
																S0_SLSSCHD.sls_schd_dt)
														)
										)
								)
						.otherwise(nullValue()).as("ptax_xrate"),
					decode(
							S0_SLSSCHD.iv_no,
							nullValue(),
							S0_SLIP.dlv_slip_no,
							S1_IVSHIPACTD.pr("dlv_slip_no")
					).as("ship_dlv_slip_no"),
					decode(
							S0_SLSSCHD.iv_no,
							nullValue(),
							S0_SLIPD.dlv_slip_d_no,
							S1_IVSHIPACTD.pr("dlv_slip_d_no")
					).as("ship_dlv_slip_d_no"),
					S1_IVSHIPACTD.pr("dlv_slip_d_cnt"),
					S0_PURCDLVSLIP.purc_ddlv_dlv_slip_no,
					S0_PURCDLVSLIP.purc_ddlv_dlv_slip_d_no,
					decode(
							S0_SLSSCHD.purc_schd_no,
							nullValue(),
							S0_SLIPD.lot_no,
							nvl(S0_PURCACTD.lot_no, S0_ARRSCHD.lot_no)
						).as("lot_no"),
					decode(
							S0_SLSSCHD.purc_schd_no,
							nullValue(),
							S0_SLIPD.sublot_no,
							nvl(S0_PURCACTD.sublot_no, S0_ARRSCHD.sublot_no)
						).as("sublot_no"),
					decode(
							S0_SLSSCHD.purc_schd_no,
							nullValue(),
							nullValue(),
							nvl(S0_PURCACTD.ver_no, S0_ARRSCHD.ver_no)
							).as("ver_no"),
					decode(
							S0_SLSSCHD.iv_no,
							nullValue(),
							decode(
									S0_SLSSCHD.dlv_slip_d_no,
									nullValue(),
									S0_SLSSCHD.trd_unit_cd,
									S0_SLIPD.trd_unit_cd
							),
							S0_SLSSCHD.trd_unit_cd
						).as("trd_unit_cd"),
					decode(
							S0_SLSSCHD.iv_no,
							nullValue(),
							decode(
									S0_SLSSCHD.dlv_slip_d_no,
									nullValue(),
									S0_SLSSCHD.base_unit_cd,
									S0_SLIPD.base_unit_cd
							),
							S0_SLSSCHD.base_unit_cd
						).as("base_unit_cd"),
						decode(
								S0_SLSSCHD.iv_no,
								nullValue(),
								decode(
										S0_SLSSCHD.dlv_slip_d_no,
										nullValue(),
										S0_SLSSCHD.trd_unit_qty,
										S0_SLIPD.trd_unit_qty
								),
								S0_SLSSCHD.trd_unit_qty
						).as("trd_unit_qty"),
						decode(
								S0_SLSSCHD.iv_no,
								nullValue(),
								decode(
										S0_SLSSCHD.dlv_slip_d_no,
										nullValue(),
										S0_SLOD.trd_cur_dscnt_amt,
										S0_SLIPD.trd_cur_dscnt_amt
								),
								S0_IVD.trd_cur_dscnt_amt
							).as("trd_cur_dscnt_amt"),
							decode(
									S0_SLSSCHD.iv_no,
									nullValue(),
									S0_SLOD.dscnt_rsn_cd,
									S0_IVD.dscnt_rsn_cd
							).as("dscnt_rsn_cd"),
						decode(
								S0_SLSSCHD.iv_no,
								nullValue(),
								decode(
										S0_SLSSCHD.dlv_slip_d_no,
										nullValue(),
										S0_SLOD.tax_cd,
										S0_SLIPD.tax_cd
								),
								S0_IVD.tax_cd
							).as("tax_cd"),
						S0_SLOD.bill_crryovr_times,
						decode(
								S0_SLSSCHD.iv_no,
								nullValue(),
								decode(
										S0_SLSSCHD.dlv_slip_d_no,
										nullValue(),
										S0_SLOD.sls_rsn_cd,
										S0_SLIPD.rsn_cd
								),
								S0_IVD.rsn_cd
							).as("sls_rsn_cd"),
							decode(
									S0_SLSSCHD.iv_no,
								nullValue(),
								decode(
										S0_SLSSCHD.dlv_slip_d_no,
										nullValue(),
										S0_SLOD.bd_dpt_cd,
										S0_SLIPD.bd_dpt_cd
								),
								S0_IVD.bd_dpt_cd
							).as("bd_dpt_cd"),
							decode(
									S0_SLSSCHD.iv_no,
								nullValue(),
								decode(
										S0_SLSSCHD.dlv_slip_d_no,
										nullValue(),
										S0_SLOD.wtax_rate,
										S0_SLIPD.wtax_rate
								),
								S0_IVD.wtax_rate
							).as("wtax_rate"),
							S0_PURCACT.ptax_dt,
							decode(
									S0_SLSSCHD.slo_d_no,
									nullValue(),
									nullValue(),
									S0_SLOD.cost_upri
								).as("cost_upri")
				)
				.from(
					S0_SLSSCHD
					.leftOuterJoin(S0_SLOD).on(S0_SLSSCHD.slo_d_no.eq(S0_SLOD.slo_d_no))
					.leftOuterJoin(S0_SLO).on(S0_SLOD.slo_no.eq(S0_SLO.slo_no))
					.leftOuterJoin(S0_IVD).on(S0_SLSSCHD.iv_d_no.eq(S0_IVD.iv_d_no))
					.leftOuterJoin(S0_IV).on(S0_SLSSCHD.iv_no.eq(S0_IV.iv_no))
					.leftOuterJoin(S0_SLIPD).on(S0_SLSSCHD.dlv_slip_d_no.eq(S0_SLIPD.dlv_slip_d_no))
					.leftOuterJoin(S0_SLIP).on(
						bracket(
							S0_SLIPD.dlv_slip_no.eq(S0_SLIP.dlv_slip_no)
							.and(S0_SLIPD.dlv_slip_seq.eq(S0_SLIP.dlv_slip_seq))
						)
					)
					.leftOuterJoin(S0_SHIPSCHD).on(S0_SLSSCHD.ship_schd_no.eq(S0_SHIPSCHD.ship_schd_no))
					.leftOuterJoin(S0_PURCSCHD).on(S0_SLSSCHD.purc_schd_no.eq(S0_PURCSCHD.purc_schd_no))
					.leftOuterJoin(S0_PURCACTD).on(S0_SLSSCHD.purc_act_d_no.eq(S0_PURCACTD.purc_act_d_no))
					.leftOuterJoin(S0_PURCACT).on(
							bracket(
									S0_PURCACT.purc_act_no.eq(S0_PURCACTD.purc_act_no)
								.and(S0_PURCACT.purc_act_seq.eq(S0_PURCACTD.purc_act_seq))
							)
						)
					.leftOuterJoin(S0_ARRSCHD).on(S0_PURCSCHD.arr_schd_no.eq(S0_ARRSCHD.arr_schd_no))
					.leftOuterJoin(S0_PURCDLVSLIP).on(
						S0_ARRSCHD.dlv_slip_mng_d_no.eq(S0_PURCDLVSLIP.dlv_slip_mng_d_no)
						.and(S0_ARRSCHD.dlv_slip_mng_d_seq.eq(S0_PURCDLVSLIP.dlv_slip_mng_d_seq))
					)
					.leftOuterJoin(S0_CST).on(
							bracket(
									decode(
											S0_SLSSCHD.iv_no,
											nullValue(),
											decode(
													S0_SLSSCHD.slo_d_no,
													nullValue(),
													S0_SLIP.bp_cd,
													S0_SLO.cst_cd
													),
											S0_IV.ship_rqst_id_cd).eq(S0_CST.bp_cd)
									)
							)
					.leftOuterJoin(
							subQuery()
							.select(
								max(S1_SHIPACTD.dlv_slip_no).as("dlv_slip_no"),
								max(S1_SHIPACTD.dlv_slip_d_no).as("dlv_slip_d_no"),
								countDistinct(S1_SHIPACTD.dlv_slip_d_no).as("dlv_slip_d_cnt"),
								S1_IVMAP.iv_d_no
							)
							.from(
								S1_IVMAP
								.innerJoin(S1_SAS).on(S1_IVMAP.ship_schd_no.eq(S1_SAS.ship_schd_no))
								.innerJoin(S1_SHIPACTD).on(S1_SAS.ship_alloc_sts_no.eq(S1_SHIPACTD.ship_alloc_sts_no))
							)
							.where(
								value(0).eq(value(0))
								.and(S1_SAS.ship_act_qty.neq(value(0)))
								.and(S1_SHIPACTD.can_flg.eq(value(false)))
							)
							.groupBy(S1_IVMAP.iv_d_no).view(S1_IVSHIPACTD)
						).on(S0_SLSSCHD.iv_d_no.eq(S1_IVSHIPACTD.pr(S1_IVMAP.iv_d_no)))
				)
				.where(
					S0_SLSSCHD.sls_ac_abl_flg.eq(value(true))
					.and(S0_SLSSCHD.cmpl_flg.eq(value(false)))
					.cutoff$and(S0_SLSSCHD.sls_schd_dt.gte(bind("sls_schd_dt_fr")))
					.and(S0_SLSSCHD.sls_schd_dt.lte(bind("sls_schd_dt_to")))
					.and(
							S0_SLSSCHD.base_unit_sls_qty.eq(value(0))
						.or(bind("inc_partial_sls_flg").eq(value(true)))
					)
					.and(
							S0_SLIP.dlv_slip_no.isNull()
							.or(S0_SLIP.dlv_slip_seq.eq(
									subQuery()
									.select(max(S1_W.dlv_slip_seq))
									.from(S1_W)
									.where(
										S1_W.dlv_slip_no.eq(S0_SLIP.dlv_slip_no)
										.and(S1_W.trn_typ.eq(value(MSC_TRN_TYP.SHIP.value())))
										.and(S1_W.slip_sts_typ.neq(value(MAC_SLIP_STS_TYP.CAN.value())))
									)
								)
									.and(S0_SLSSCHD.sls_schd_dt.gte(S0_SLIP.ac_dt).or(bind("sls_schd_dt_not_ac_flg").eq(value(true)))))
					)
					.and(
							S0_PURCACT.slip_sts_typ.eq(value(MAC_SLIP_STS_TYP.CRT.value()))
							.or(S0_PURCACT.purc_act_no.isNull())
						)
					.and(decode(
							S0_SLSSCHD.iv_no,
							nullValue(),
							decode(
									S0_SLSSCHD.dlv_slip_d_no,
									nullValue(),
									S0_SLO.sls_basis_typ,
									S0_SLIP.sls_basis_typ
									),
							S0_IV.sls_basis_typ).eq(value(MAC_SLS_BASIS_TYP.ARRIVAL_BASIS.value()))
							.or(bind("inc_in_basis_flg").eq(value(true))
									.and(decode(
											S0_SLSSCHD.iv_no,
											nullValue(),
											decode(
													S0_SLSSCHD.dlv_slip_d_no,
													nullValue(),
													S0_SLO.sls_basis_typ,
													S0_SLIP.sls_basis_typ
													),
											S0_IV.sls_basis_typ).eq(value(MAC_SLS_BASIS_TYP.IN_BASIS.value()))))
							.or(S0_SLSSCHD.slo_d_no.isNotNull().and(S0_SLOD.proc_typ.eq(value(MAC_SLO_PROC_TYP.PURC_DDLV.value()))))
							)
					.and(bind("inc_purc_ddlv_flg").eq(value(true)).or(S0_SLSSCHD.slo_d_no.isNull()).or(S0_SLOD.proc_typ.isNull()).or(S0_SLOD.proc_typ.neq(value(MAC_SLO_PROC_TYP.PURC_DDLV.value()))))
					.and(S0_SLSSCHD.slo_d_no.isNull().or(S0_SLOD.sls_cststk_flg.eq(value(false))))
					.cutoff$and(decode(
							S0_SLSSCHD.iv_no,
							nullValue(),
							decode(
									S0_SLSSCHD.slo_d_no,
									nullValue(),
									S0_SLIP.bp_cd,
									S0_SLO.cst_cd
									),
							S0_IV.ship_rqst_id_cd).eq(bind("cst_cd")))
					.cutoff$and(decode(
							S0_SLSSCHD.iv_no,
							nullValue(),
							decode(
									S0_SLSSCHD.dlv_slip_d_no,
									nullValue(),
									nvl(S0_SHIPSCHD.dlv_cd, S0_SLOD.dlv_cd),
									S0_SLIP.dlv_id_cd
									),
							S0_IV.dlv_id_cd).eq(bind("dlv_cd")))
				)
				.orderBy(
						S0_SLSSCHD.sls_schd_dt.asc(),
						S0_SLO.slo_no.asc(),
						S0_SLOD.disp_seq.asc(),
						decode(
								S0_SLSSCHD.iv_no,
								nullValue(),
								S0_SLIP.dlv_slip_no,
								S1_IVSHIPACTD.pr("dlv_slip_no")
						).asc(),
						decode(
								S0_SLSSCHD.iv_no,
								nullValue(),
								S0_SLIPD.dlv_slip_d_no,
								S1_IVSHIPACTD.pr("dlv_slip_d_no")
						).asc(),
						S0_SLSSCHD.iv_no.asc(),
						S0_IVD.disp_seq.asc()
				)
				.forUpdate(S0_SLSSCHD.sls_schd_no)
		);
	}
	
	/**
	 * -- MSBBB0020_MST_SLS_SCHD_Query_S03
	 */
	static MCQueryPlan MSBBB0020_MST_SLS_SCHD_S03() {
		MST_SLS_SCHD_R S0_T1 = MST_SLS_SCHD_R.create("T1");
		MAM_CO_R S0_CO = MAM_CO_R.create("CO");
		MSW_SLS_ACT_R S0_SLSACTWK = MSW_SLS_ACT_R.create("SLSACTWK");
		MST_SLO_D_R S0_SLOD = MST_SLO_D_R.create("SLOD");
		MST_IV_R S0_IV = MST_IV_R.create("IV");
		MST_IV_D_R S0_IVD = MST_IV_D_R.create("IVD");
		MST_DLV_SLIP_D_R S0_SLIPD = MST_DLV_SLIP_D_R.create("SLIPD");
		MST_DLV_SLIP_R S0_SLIP = MST_DLV_SLIP_R.create("SLIP");
		MST_SLO_R S0_SLO = MST_SLO_R.create("SLO");
		MST_PO_SCHD_R S0_POSCHD = MST_PO_SCHD_R.create("POSCHD");
		MST_PURC_SCHD_R S0_PURCSCHD = MST_PURC_SCHD_R.create("PURCSCHD");
		MST_ARR_SCHD_R S0_ARRSCHD = MST_ARR_SCHD_R.create("ARRSCHD");
		MST_SHIP_SCHD_R S0_SHIPSCHD = MST_SHIP_SCHD_R.create("SHIPSCHD");
		MST_PO_D_R S0_POD = MST_PO_D_R.create("POD");
		MSVT_WRK_SNO_R S0_WRKSNO = MSVT_WRK_SNO_R.create("WRKSNO");
		MST_PURC_ACT_D_R S0_PURCACTD = MST_PURC_ACT_D_R.create("PURCACTD");
		MST_PURC_ACT_R S0_PURCACT = MST_PURC_ACT_R.create("PURCACT");
		MAM_BP_R S0_CST = MAM_BP_R.create("CST");
		MAM_BP_R S0_DLV = MAM_BP_R.create("DLV");
		MAM_CUR_R S0_TCUR = MAM_CUR_R.create("TCUR");
		MAM_ITM_R S0_ITM = MAM_ITM_R.create("ITM");
		MAVM_ITM_UNIT_R S0_TIU = MAVM_ITM_UNIT_R.create("TIU");
		MST_SHIP_ALLOC_STS_R S1_W = MST_SHIP_ALLOC_STS_R.create("W");
		MST_SHIP_ACT_D_R S2_W = MST_SHIP_ACT_D_R.create("W");
		MST_IV_SHIP_ACT_D_R S3_W = MST_IV_SHIP_ACT_D_R.create("W");
		MST_SLS_SCHD_R S4_W = MST_SLS_SCHD_R.create("W");
		MST_DLV_SLIP_D_R S5_W = MST_DLV_SLIP_D_R.create("W");
		MST_DLV_SLIP_R S5_W2 = MST_DLV_SLIP_R.create("W2");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBBB0020_MST_SLS_SCHD_Query_S03")
					.mainQuery()
					.select(
						S0_T1.sls_schd_no,
						decode(
							S0_T1.iv_no,
							nullValue(),
							decode(
								S0_T1.slo_d_no,
								nullValue(),
								S0_SLIP.trd_cd,
								S0_SLO.trd_cd
							),
							S0_IVD.trd_cd
						).as("trd_cd"),
						decode(
							S0_T1.iv_no,
							nullValue(),
							decode(
								S0_T1.slo_d_no,
								nullValue(),
								S0_SLIP.trd_ptn_typ,
								S0_SLO.trd_ptn_typ
							),
							S0_IV.trd_ptn_typ
						).as("trd_ptn_typ"),
						S0_T1.sls_schd_dt,
						decode(
							S0_T1.iv_no,
							nullValue(),
							value((MCDate) null),
							S0_IV.eta_dt
						).as("eta_dt"),
						decode(
							S0_T1.iv_no,
							nullValue(),
							decode(
								S0_T1.slo_d_no,
								nullValue(),
								S0_SLIP.bp_cd,
								S0_SLO.cst_cd
							),
							S0_IV.ship_rqst_id_cd
						).as("cst_cd"),
						decode(
							S0_T1.iv_no,
							nullValue(),
							decode(
								S0_T1.slo_d_no,
								nullValue(),
								S0_SLIP.trd_cur_cd,
								S0_SLO.trd_cur_cd
							),
							S0_IV.trd_cur_cd
						).as("trd_cur_cd"),
						S0_TCUR.amt_dec_place.as("trd_amt_dec_place"),
						S0_TCUR.upri_dec_place.as("trd_upri_dec_place"),
						S0_CO.base_cur_cd,
						S0_CO.ptax_cur_cd,
						decode(
							S0_T1.iv_no,
							nullValue(),
							decode(
								S0_T1.slo_d_no,
								nullValue(),
								S0_SLIP.cst_po_no,
								S0_SLO.cst_po_no
							),
							S0_IVD.cst_po_no
						).as("cst_po_no"),
						S0_SLIP.dlv_slip_no,
						S0_T1.dlv_slip_d_no,
						S0_T1.iv_no,
						S0_T1.iv_d_no,
						decode(
							S0_T1.iv_no,
							nullValue(),
							nullValue(),
							S0_IV.rcpt_iv_mng_no
						).as("rcpt_iv_mng_no"),
						decode(
							S0_T1.iv_no,
							nullValue(),
							nullValue(),
							S0_IV.rcpt_iv_no
						).as("rcpt_iv_no"),
						decode(
							S0_T1.iv_no,
							nullValue(),
							decode(
								S0_T1.slo_d_no,
								nullValue(),
								nullValue(),
								S0_SLO.tterm_cd1
							),
							S0_IV.tterm_cd1
						).as("tterm_cd1"),
						decode(
							S0_T1.iv_no,
							nullValue(),
							decode(
								S0_T1.slo_d_no,
								nullValue(),
								nullValue(),
								S0_SLO.tterm_rmrks1
							),
							S0_IV.tterm_rmrks1
						).as("tterm_rmrks1"),
						decode(
							S0_T1.iv_no,
							nullValue(),
							decode(
								S0_T1.slo_d_no,
								nullValue(),
								nullValue(),
								S0_SLO.tterm_cd2
							),
							S0_IV.tterm_cd2
						).as("tterm_cd2"),
						decode(
							S0_T1.iv_no,
							nullValue(),
							decode(
								S0_T1.slo_d_no,
								nullValue(),
								nullValue(),
								S0_SLO.tterm_rmrks2
							),
							S0_IV.tterm_rmrks2
						).as("tterm_rmrks2"),
						decode(
							S0_T1.iv_no,
							nullValue(),
							decode(
								S0_T1.slo_d_no,
								nullValue(),
								nullValue(),
								S0_SLO.tterm_cd3
							),
							S0_IV.tterm_cd3
						).as("tterm_cd3"),
						decode(
							S0_T1.iv_no,
							nullValue(),
							decode(
								S0_T1.slo_d_no,
								nullValue(),
								nullValue(),
								S0_SLO.tterm_rmrks3
							),
							S0_IV.tterm_rmrks3
						).as("tterm_rmrks3"),
						decode(
							S0_T1.iv_no,
							nullValue(),
							nullValue(),
							S0_IV.lc_no
						).as("lc_no"),
						decode(
							S0_T1.iv_no,
							nullValue(),
							value((MCDate) null),
							S0_IV.lc_dt
						).as("lc_dt"),
						decode(
							S0_T1.iv_no,
							nullValue(),
							nullValue(),
							S0_IV.lc_rmrks
						).as("lc_rmrks"),
						S0_SLIP.dlv_slip_act_no.as("ship_act_no"),
						S0_SLOD.slo_no,
						S0_T1.slo_d_no,
						S0_SLOD.qtn_no,
						S0_SLOD.qtn_rev,
						S0_SLOD.qtn_d_no,
						S0_POSCHD.po_no.as("purc_ddlv_po_no"),
						S0_CST.acst_cd,
						decode(
							S0_T1.iv_no,
							nullValue(),
							decode(
								S0_T1.dlv_slip_d_no,
								nullValue(),
								S0_SLO.trd_rmrks,
								S0_SLIP.trd_rmrks
							),
							S0_IVD.trd_rmrks
						).as("trd_rmrks"),
						decode(
							S0_T1.iv_no,
							nullValue(),
							decode(
								S0_T1.dlv_slip_d_no,
								nullValue(),
								nvl(
									S0_SHIPSCHD.dlv_cd,
									S0_SLOD.dlv_cd
								),
								S0_SLIP.dlv_id_cd
							),
							S0_IV.dlv_id_cd
						).as("dlv_cd"),
						decode(
							S0_T1.iv_no,
							nullValue(),
							decode(
								S0_T1.dlv_slip_d_no,
								nullValue(),
								nvl2(
									S0_SHIPSCHD.dlv_cd,
									S0_SHIPSCHD.dlv_sundry_flg,
									S0_SLOD.dlv_sundry_flg
								),
								S0_SLIP.dlv_sundry_flg
							),
							S0_IV.dlv_sundry_flg
						).as("dlv_sundry_flg"),
						nvl(
							decode(
								S0_T1.iv_no,
								nullValue(),
								decode(
									S0_T1.dlv_slip_d_no,
									nullValue(),
									nvl2(
										S0_SHIPSCHD.dlv_cd,
										S0_SHIPSCHD.dlv_nm,
										S0_SLOD.dlv_nm
									),
									S0_SLIP.dlv_id_nm
								),
								S0_IV.dlv_id_nm
							),
							S0_DLV.bp_nm
						).as("dlv_nm"),
						decode(
							S0_T1.iv_no,
							nullValue(),
							decode(
								S0_T1.dlv_slip_d_no,
								nullValue(),
								nvl2(
									S0_SHIPSCHD.dlv_cd,
									S0_SHIPSCHD.dlv_zip_cd,
									S0_SLOD.dlv_zip_cd
								),
								S0_SLIP.dlv_zip_cd
							),
							S0_IV.dlv_zip_cd
						).as("dlv_zip_cd"),
						decode(
							S0_T1.iv_no,
							nullValue(),
							decode(
								S0_T1.dlv_slip_d_no,
								nullValue(),
								nvl2(
									S0_SHIPSCHD.dlv_cd,
									S0_SHIPSCHD.dlv_addr1,
									S0_SLOD.dlv_addr1
								),
								S0_SLIP.dlv_addr1
							),
							S0_IV.dlv_addr1
						).as("dlv_addr1"),
						decode(
							S0_T1.iv_no,
							nullValue(),
							decode(
								S0_T1.dlv_slip_d_no,
								nullValue(),
								nvl2(
									S0_SHIPSCHD.dlv_cd,
									S0_SHIPSCHD.dlv_addr2,
									S0_SLOD.dlv_addr2
								),
								S0_SLIP.dlv_addr2
							),
							S0_IV.dlv_addr2
						).as("dlv_addr2"),
						decode(
							S0_T1.iv_no,
							nullValue(),
							decode(
								S0_T1.dlv_slip_d_no,
								nullValue(),
								nvl2(
									S0_SHIPSCHD.dlv_cd,
									S0_SHIPSCHD.dlv_addr3,
									S0_SLOD.dlv_addr3
								),
								S0_SLIP.dlv_addr3
							),
							S0_IV.dlv_addr3
						).as("dlv_addr3"),
						decode(
							S0_T1.iv_no,
							nullValue(),
							decode(
								S0_T1.dlv_slip_d_no,
								nullValue(),
								nvl2(
									S0_SHIPSCHD.dlv_cd,
									S0_SHIPSCHD.dlv_addr4,
									S0_SLOD.dlv_addr4
								),
								S0_SLIP.dlv_addr4
							),
							S0_IV.dlv_addr4
						).as("dlv_addr4"),
						decode(
							S0_T1.iv_no,
							nullValue(),
							decode(
								S0_T1.dlv_slip_d_no,
								nullValue(),
								nvl2(
									S0_SHIPSCHD.dlv_cd,
									S0_SHIPSCHD.dlv_cntct_dpt,
									S0_SLOD.dlv_cntct_dpt
								),
								S0_SLIP.dlv_cntct_dpt
							),
							S0_IV.dlv_cntct_dpt
						).as("dlv_cntct_dpt"),
						decode(
							S0_T1.iv_no,
							nullValue(),
							decode(
								S0_T1.dlv_slip_d_no,
								nullValue(),
								nvl2(
									S0_SHIPSCHD.dlv_cd,
									S0_SHIPSCHD.dlv_cntct_psn,
									S0_SLOD.dlv_cntct_psn
								),
								S0_SLIP.dlv_cntct_psn
							),
							S0_IV.dlv_cntct_psn
						).as("dlv_cntct_psn"),
						decode(
							S0_T1.iv_no,
							nullValue(),
							decode(
								S0_T1.dlv_slip_d_no,
								nullValue(),
								nvl2(
									S0_SHIPSCHD.dlv_cd,
									S0_SHIPSCHD.dlv_tel,
									S0_SLOD.dlv_tel
								),
								S0_SLIP.dlv_tel
							),
							S0_IV.dlv_tel
						).as("dlv_tel"),
						decode(
							S0_T1.iv_no,
							nullValue(),
							decode(
								S0_T1.dlv_slip_d_no,
								nullValue(),
								nvl2(
									S0_SHIPSCHD.dlv_cd,
									S0_SHIPSCHD.dlv_fax,
									S0_SLOD.dlv_fax
								),
								S0_SLIP.dlv_fax
							),
							S0_IV.dlv_fax
						).as("dlv_fax"),
						S0_DLV.cntry_cd,
						decode(
							S0_T1.dlv_slip_d_no,
							nullValue(),
							nvl2(
								S0_SHIPSCHD.dlv_cd,
								S0_SHIPSCHD.pri_prnt_flg,
								S0_SLOD.pri_prnt_flg
							),
							S0_SLIP.pri_prnt_flg
						).as("pri_prnt_flg"),
						S0_SLOD.dest_cd1,
						S0_SLOD.dest_cd2,
						S0_SLOD.dest_cd3,
						decode(
							S0_T1.iv_no,
							nullValue(),
							nullValue(),
							S0_IV.tdlv_cd
						).as("tdlv_cd"),
						decode(
							S0_T1.iv_no,
							nullValue(),
							nullValue(),
							S0_IV.tdlv_nm
						).as("tdlv_nm"),
						decode(
							S0_T1.iv_no,
							nullValue(),
							nullValue(),
							S0_IV.tdlv_sundry_flg
						).as("tdlv_sundry_flg"),
						decode(
							S0_T1.iv_no,
							nullValue(),
							nullValue(),
							S0_IV.tdlv_zip_cd
						).as("tdlv_zip_cd"),
						decode(
							S0_T1.iv_no,
							nullValue(),
							nullValue(),
							S0_IV.tdlv_addr1
						).as("tdlv_addr1"),
						decode(
							S0_T1.iv_no,
							nullValue(),
							nullValue(),
							S0_IV.tdlv_addr2
						).as("tdlv_addr2"),
						decode(
							S0_T1.iv_no,
							nullValue(),
							nullValue(),
							S0_IV.tdlv_addr3
						).as("tdlv_addr3"),
						decode(
							S0_T1.iv_no,
							nullValue(),
							nullValue(),
							S0_IV.tdlv_addr4
						).as("tdlv_addr4"),
						decode(
							S0_T1.iv_no,
							nullValue(),
							nullValue(),
							S0_IV.tdlv_tel
						).as("tdlv_tel"),
						decode(
							S0_T1.iv_no,
							nullValue(),
							nullValue(),
							S0_IV.tdlv_fax
						).as("tdlv_fax"),
						decode(
							S0_T1.iv_no,
							nullValue(),
							nullValue(),
							S0_IV.tdlv_cntct_dpt
						).as("tdlv_cntct_dpt"),
						decode(
							S0_T1.iv_no,
							nullValue(),
							nullValue(),
							S0_IV.tdlv_cntct_psn
						).as("tdlv_cntct_psn"),
						decode(
							S0_T1.iv_no,
							nullValue(),
							decode(
								S0_T1.dlv_slip_d_no,
								nullValue(),
								S0_SLOD.itm_cd,
								S0_SLIPD.itm_cd
							),
							S0_IVD.itm_cd
						).as("itm_cd"),
						decode(
							S0_T1.iv_no,
							nullValue(),
							decode(
								S0_T1.dlv_slip_d_no,
								nullValue(),
								S0_SLOD.itm_sub1,
								S0_SLIPD.itm_sub1
							),
							S0_IVD.itm_sub1
						).as("itm_sub1"),
						decode(
							S0_T1.iv_no,
							nullValue(),
							decode(
								S0_T1.dlv_slip_d_no,
								nullValue(),
								S0_SLOD.itm_sub2,
								S0_SLIPD.itm_sub2
							),
							S0_IVD.itm_sub2
						).as("itm_sub2"),
						decode(
							S0_T1.iv_no,
							nullValue(),
							decode(
								S0_T1.dlv_slip_d_no,
								nullValue(),
								S0_SLOD.itm_sub3,
								S0_SLIPD.itm_sub3
							),
							S0_IVD.itm_sub3
						).as("itm_sub3"),
						nvl(
							decode(
								S0_T1.iv_no,
								nullValue(),
								decode(
									S0_T1.dlv_slip_d_no,
									nullValue(),
									S0_SLOD.itm_nm,
									S0_SLIPD.itm_nm
								),
								S0_IVD.itm_nm
							),
							S0_ITM.itm_nm
						).as("itm_nm"),
						decode(
							S0_CST.cst_iv_flg,
							value(true),
							nvl(
								decode(
									S0_T1.iv_no,
									nullValue(),
									S0_SLOD.iv_itm_nm,
									S0_IVD.iv_itm_nm
								),
								S0_ITM.itm_nm
							),
							nullValue()
						).as("iv_itm_nm"),
						S0_ITM.lot_mng_typ,
						S0_ITM.lot_no_typ,
						S0_ITM.lot_no_ptn_cd,
						S0_ITM.sublot_mng_typ,
						S0_ITM.sublot_no_typ,
						S0_ITM.sublot_no_ptn_cd,
						decode(
							S0_T1.iv_no,
							nullValue(),
							decode(
								S0_T1.slo_d_no,
								nullValue(),
								nullValue(),
								S0_SLOD.cntry_org_cd
							),
							S0_IVD.cntry_org_cd
						).as("cntry_org_cd"),
						decode(
							S0_T1.iv_no,
							nullValue(),
							decode(
								S0_T1.dlv_slip_d_no,
								nullValue(),
								S0_SLOD.sno1,
								S0_SLIPD.sno1
							),
							S0_IVD.sno1
						).as("sno1"),
						decode(
							S0_T1.iv_no,
							nullValue(),
							decode(
								S0_T1.dlv_slip_d_no,
								nullValue(),
								S0_SLOD.sno2,
								S0_SLIPD.sno2
							),
							S0_IVD.sno2
						).as("sno2"),
						decode(
							S0_T1.iv_no,
							nullValue(),
							decode(
								S0_T1.dlv_slip_d_no,
								nullValue(),
								S0_SLOD.sno3,
								S0_SLIPD.sno3
							),
							S0_IVD.sno3
						).as("sno3"),
						decode(
							S0_T1.iv_no,
							nullValue(),
							decode(
								S0_T1.dlv_slip_d_no,
								nullValue(),
								S0_SLOD.sno4,
								S0_SLIPD.sno4
							),
							S0_IVD.sno4
						).as("sno4"),
						S0_WRKSNO.wrk_no,
						S0_ITM.asset_mng_typ,
						decode(
							S0_T1.iv_no,
							nullValue(),
							decode(
								S0_T1.dlv_slip_d_no,
								nullValue(),
								S0_SLOD.sundry_itm_flg,
								S0_SLIPD.sundry_itm_flg
							),
							S0_IVD.sundry_itm_flg
						).as("sundry_itm_flg"),
						S0_ITM.itm_typ,
						S0_ITM.itm_typ_d_cd,
						bracket(
							subQuery()
							.select(count(S1_W.ship_alloc_sts_no))
							.from(S1_W)
							.where(
								S1_W.ship_schd_no.eq(S0_T1.ship_schd_no)
							)
						).as("ship_alloc_sts_cnt"),
						bracket(
							subQuery()
							.select(count(S2_W.ship_act_d_no))
							.from(S2_W)
							.where(
								S2_W.dlv_slip_d_no.eq(S0_T1.dlv_slip_d_no)
								.and(S2_W.can_flg.eq(value(false)))
							)
						).as("ship_act_d_cnt"),
						bracket(
							subQuery()
							.select(count(S3_W.iv_ship_act_d_no))
							.from(S3_W)
							.where(
								S3_W.iv_d_no.eq(S0_T1.iv_d_no)
							)
						).as("iv_ship_act_d_cnt"),
						S0_TIU.dec_place.as("trd_unit_dec_place"),
						S0_TIU.conv_base_qty.as("trd_unit_conv_base_qty"),
						S0_TIU.conv_qty.as("trd_unit_conv_qty"),
						S0_TIU.rnd_typ.as("trd_unit_rnd_typ"),
						S0_T1.base_unit_cd,
						S0_T1.base_unit_qty.as("sls_schd_qty"),
						S0_T1.base_unit_abort_qty.as("abort_qty"),
						S0_T1.base_unit_sls_qty.as("sls_qty"),
						nvl(
							S0_IVD.interim_flg,
							decode(
								S0_T1.dlv_slip_d_no,
								nullValue(),
								S0_SLOD.interim_flg,
								S0_SLIPD.interim_flg
							)
						).as("interim_flg"),
						decode(
							S0_T1.iv_no,
							nullValue(),
							decode(
								S0_T1.dlv_slip_d_no,
								nullValue(),
								S0_SLOD.trd_cur_upri,
								S0_SLIPD.trd_cur_upri
							),
							S0_IVD.trd_cur_upri
						).as("trd_cur_upri"),
						S0_SLOD.tax_fix_flg,
						decode(
							S0_T1.slo_d_no,
							nullValue(),
							nullValue(),
							S0_SLOD.cost_upri
						).as("cost_upri"),
						S0_ITM.stk_mng_typ,
						S0_ITM.sno1_mng_typ,
						S0_ITM.sno2_mng_typ,
						S0_ITM.sno3_mng_typ,
						S0_ITM.sno4_mng_typ,
						S0_ITM.itm_jnl_cd,
						S0_T1.ship_schd_no,
						S0_POD.po_d_no.as("purc_ddlv_po_d_no"),
						decode(
							S0_T1.iv_no,
							nullValue(),
							decode(
								S0_T1.dlv_slip_d_no,
								nullValue(),
								S0_SLOD.gd_cd,
								S0_SLIPD.gd_cd
							),
							S0_IVD.gd_cd
						).as("gd_cd"),
						decode(
							S0_T1.iv_no,
							nullValue(),
							decode(
								S0_T1.dlv_slip_d_no,
								nullValue(),
								S0_SLOD.cst_po_d_no,
								S0_SLIPD.cst_po_d_no
							),
							S0_IVD.cst_po_d_no
						).as("cst_po_d_no"),
						decode(
							S0_T1.iv_no,
							nullValue(),
							decode(
								S0_T1.dlv_slip_d_no,
								nullValue(),
								S0_SLOD.cst_itm_cd,
								S0_SLIPD.cst_itm_cd
							),
							S0_IVD.cst_itm_cd
						).as("cst_itm_cd"),
						decode(
							S0_T1.iv_no,
							nullValue(),
							decode(
								S0_T1.dlv_slip_d_no,
								nullValue(),
								S0_SLOD.cst_itm_nm,
								S0_SLIPD.cst_itm_nm
							),
							S0_IVD.cst_itm_nm
						).as("cst_itm_nm"),
						decode(
							S0_T1.iv_no,
							nullValue(),
							decode(
								S0_T1.dlv_slip_d_no,
								nullValue(),
								S0_SLOD.trd_d_rmrks,
								S0_SLIPD.trd_d_rmrks
							),
							S0_IVD.trd_d_rmrks
						).as("trd_d_rmrks"),
						S0_T1.upd_cntr.as("tgt_upd_cntr"),
						S0_CST.cst_iv_flg,
						S0_CST.sls_amt_rnd_typ,
						S0_CST.sls_tax_rnd_typ,
						S0_CO.xrate_rnd_typ,
						S0_CO.wtax_rnd_typ,
						decode(
							S0_T1.iv_no,
							nullValue(),
							decode(
								S0_T1.dlv_slip_d_no,
								nullValue(),
								S0_SLO.sls_basis_typ,
								decode(
									S0_SLIP.sync_flg,
									value(false),
									S0_SLIP.sls_basis_typ,
									value(MAC_SLS_BASIS_TYP.SHIP_BASIS.value())
								)
							),
							S0_IV.sls_basis_typ
						).as("sls_basis_typ"),
						S0_SLOD.sls_cststk_flg,
						nvl(
							S0_SLOD.ship_inst_typ,
							value(MAC_SHIP_INST_TYP.NON.value())
						).as("ship_inst_typ"),
						S0_T1.purc_schd_no,
						nvl(
							S0_SLOD.trd_cur_amt.add(S0_SLOD.trd_cur_tax_amt),
							value(0)
						).as("slo_trd_cur_inc_tax_amt"),
						decode(
							bracket(
								subQuery()
								.select(sign(count(S4_W.sls_schd_no)))
								.from(S4_W)
								.where(
									S0_T1.iv_no.eq(S4_W.iv_no)
									.and(S4_W.po_schd_no.isNotNull())
								)
							),
							value(0),
							value(false),
							value(true)
						).as("ddlv_iv_grp_flg"),
						decode(
							S0_T1.iv_no,
							nullValue(),
							decode(
								S0_T1.dlv_slip_d_no,
								nullValue(),
								S0_SLOD.wtax_rate,
								S0_SLIPD.wtax_rate
							),
							S0_IVD.wtax_rate
						).as("wtax_rate"),
						S0_ITM.dscnt_itm_flg,
						S0_T1.purc_act_d_no,
						S0_PURCACT.purc_act_no,
						S0_SLO.aprv_no,
						S0_POD.po_no.as("join_po_no_"),
						S0_SLSACTWK.tax_cd.as("join_tax_cd_")
					)
					.from(
						S0_T1
						.crossJoin(S0_CO)
						.innerJoin(S0_SLSACTWK).on(
							bracket(
								S0_T1.sls_schd_no.eq(S0_SLSACTWK.sls_schd_no)
							)
						)
						.leftOuterJoin(S0_SLOD).on(
							bracket(
								S0_T1.slo_d_no.eq(S0_SLOD.slo_d_no)
							)
						)
						.leftOuterJoin(S0_IV).on(
							bracket(
								S0_T1.iv_no.eq(S0_IV.iv_no)
							)
						)
						.leftOuterJoin(S0_IVD).on(
							bracket(
								S0_T1.iv_d_no.eq(S0_IVD.iv_d_no)
							)
						)
						.leftOuterJoin(S0_SLIPD).on(
							bracket(
								S0_T1.dlv_slip_d_no.eq(S0_SLIPD.dlv_slip_d_no)
								.and(
									S0_SLIPD.dlv_slip_d_seq.eq(subQuery()
										.select(max(S5_W.dlv_slip_d_seq))
										.from(S5_W
											.innerJoin(S5_W2).on(
												S5_W2.dlv_slip_no.eq(S5_W.dlv_slip_no)
												.and(S5_W2.dlv_slip_seq.eq(S5_W.dlv_slip_seq))
											)
										)
										.where(
											S5_W.dlv_slip_d_no.eq(S0_T1.dlv_slip_d_no)
											.and(S5_W2.trn_typ.eq(value(MSC_TRN_TYP.SHIP.value())))
											.and(S5_W2.slip_sts_typ.neq(value(MAC_SLIP_STS_TYP.CAN.value())))
										)
									)
								)
							)
						)
						.leftOuterJoin(S0_SLIP).on(
							bracket(
								S0_SLIPD.dlv_slip_no.eq(S0_SLIP.dlv_slip_no)
								.and(S0_SLIPD.dlv_slip_seq.eq(S0_SLIP.dlv_slip_seq))
							)
						)
						.leftOuterJoin(S0_SLO).on(
							bracket(
								S0_SLOD.slo_no.eq(S0_SLO.slo_no)
							)
						)
						.leftOuterJoin(S0_POSCHD).on(
							bracket(
								S0_T1.po_schd_no.eq(S0_POSCHD.po_schd_no)
							)
						)
						.leftOuterJoin(S0_PURCSCHD).on(
							bracket(
								S0_T1.purc_schd_no.eq(S0_PURCSCHD.purc_schd_no)
							)
						)
						.leftOuterJoin(S0_ARRSCHD).on(
							bracket(
								S0_ARRSCHD.arr_schd_no.eq(S0_PURCSCHD.arr_schd_no)
							)
						)
						.leftOuterJoin(S0_SHIPSCHD).on(
							bracket(
								S0_T1.ship_schd_no.eq(S0_SHIPSCHD.ship_schd_no)
							)
						)
						.leftOuterJoin(S0_POD).on(
							bracket(
								S0_T1.slo_d_no.eq(S0_POD.slo_d_no)
								.and(S0_T1.po_schd_no.eq(S0_POD.po_schd_no))
								.and(S0_POD.po_no.eq(S0_POSCHD.po_no))
							)
						)
						.leftOuterJoin(S0_WRKSNO).on(
							bracket(
								decode(
									S0_T1.iv_no,
									nullValue(),
									decode(
										S0_T1.dlv_slip_d_no,
										nullValue(),
										S0_SLOD.sno1,
										S0_SLIPD.sno1
									),
									S0_IVD.sno1
								).eq(S0_WRKSNO.sno1)
								.and(S0_T1.sls_schd_dt.between(S0_WRKSNO.st_dt, S0_WRKSNO.end_dt))
							)
						)
						.leftOuterJoin(S0_PURCACTD).on(
							bracket(
								S0_T1.purc_act_d_no.eq(S0_PURCACTD.purc_act_d_no)
							)
						)
						.leftOuterJoin(S0_PURCACT).on(
							bracket(
								S0_PURCACT.purc_act_no.eq(S0_PURCACTD.purc_act_no)
								.and(S0_PURCACT.purc_act_seq.eq(S0_PURCACTD.purc_act_seq))
							)
						)
						.leftOuterJoin(S0_CST).on(
							bracket(
								decode(
									S0_T1.iv_no,
									nullValue(),
									decode(
										S0_T1.slo_d_no,
										nullValue(),
										S0_SLIP.bp_cd,
										S0_SLO.cst_cd
									),
									S0_IV.ship_rqst_id_cd
								).eq(S0_CST.bp_cd)
							)
						)
						.leftOuterJoin(S0_DLV).on(
							bracket(
								decode(
									S0_T1.iv_no,
									nullValue(),
									decode(
										S0_T1.dlv_slip_d_no,
										nullValue(),
										nvl(
											S0_SHIPSCHD.dlv_cd,
											S0_SLOD.dlv_cd
										),
										S0_SLIP.dlv_id_cd
									),
									S0_IV.dlv_id_cd
								).eq(S0_DLV.bp_cd)
							)
						)
						.leftOuterJoin(S0_TCUR).on(
							bracket(
								decode(
									S0_T1.iv_no,
									nullValue(),
									decode(
										S0_T1.slo_d_no,
										nullValue(),
										S0_SLIP.trd_cur_cd,
										S0_SLO.trd_cur_cd
									),
									S0_IV.trd_cur_cd
								).eq(S0_TCUR.cur_cd)
							)
						)
						.leftOuterJoin(S0_ITM).on(
							bracket(
								decode(
									S0_T1.iv_no,
									nullValue(),
									decode(
										S0_T1.dlv_slip_d_no,
										nullValue(),
										S0_SLOD.itm_cd,
										S0_SLIPD.itm_cd
									),
									S0_IVD.itm_cd
								).eq(S0_ITM.itm_cd)
								.and(
									decode(
										S0_T1.iv_no,
										nullValue(),
										decode(
											S0_T1.dlv_slip_d_no,
											nullValue(),
											S0_SLOD.itm_sub1,
											S0_SLIPD.itm_sub1
										),
										S0_IVD.itm_sub1
									).eq(S0_ITM.itm_sub1)
								)
								.and(
									decode(
										S0_T1.iv_no,
										nullValue(),
										decode(
											S0_T1.dlv_slip_d_no,
											nullValue(),
											S0_SLOD.itm_sub2,
											S0_SLIPD.itm_sub2
										),
										S0_IVD.itm_sub2
									).eq(S0_ITM.itm_sub2)
								)
								.and(
									decode(
										S0_T1.iv_no,
										nullValue(),
										decode(
											S0_T1.dlv_slip_d_no,
											nullValue(),
											S0_SLOD.itm_sub3,
											S0_SLIPD.itm_sub3
										),
										S0_IVD.itm_sub3
									).eq(S0_ITM.itm_sub3)
								)
							)
						)
						.leftOuterJoin(S0_TIU).on(
							bracket(
								decode(
									S0_T1.iv_no,
									nullValue(),
									decode(
										S0_T1.dlv_slip_d_no,
										nullValue(),
										S0_SLOD.itm_cd,
										S0_SLIPD.itm_cd
									),
									S0_IVD.itm_cd
								).eq(S0_TIU.itm_cd)
								.and(
									decode(
										S0_T1.iv_no,
										nullValue(),
										decode(
											S0_T1.dlv_slip_d_no,
											nullValue(),
											S0_SLOD.itm_sub1,
											S0_SLIPD.itm_sub1
										),
										S0_IVD.itm_sub1
									).eq(S0_TIU.itm_sub1)
								)
								.and(
									decode(
										S0_T1.iv_no,
										nullValue(),
										decode(
											S0_T1.dlv_slip_d_no,
											nullValue(),
											S0_SLOD.itm_sub2,
											S0_SLIPD.itm_sub2
										),
										S0_IVD.itm_sub2
									).eq(S0_TIU.itm_sub2)
								)
								.and(
									decode(
										S0_T1.iv_no,
										nullValue(),
										decode(
											S0_T1.dlv_slip_d_no,
											nullValue(),
											S0_SLOD.itm_sub3,
											S0_SLIPD.itm_sub3
										),
										S0_IVD.itm_sub3
									).eq(S0_TIU.itm_sub3)
								)
								.and(S0_SLSACTWK.unit_cd.eq(S0_TIU.unit_cd))
							)
						)
					)
					.where(
						value(0).eq(value(0))
						.and(
							S0_PURCACT.slip_sts_typ.eq(value(MAC_SLIP_STS_TYP.CRT.value()))
							.or(S0_PURCACTD.purc_act_seq.isNull())
						)
					)
			)
			.setJoinInfo(
				joinInfo(
					j -> j
						.add(MST_PO_R.class, r -> toCondition(
							r.getStringNE("join_po_no_")
						))
						.addSelect(m -> toArray(
							m.sppl_cd
						))
						.addMap((r, m) -> {
							r.setStringNE("sppl_cd", m.sppl_cd());
					}),
					j -> j
						.add(MAM_BP_R.class, r -> toCondition(
							r.getStringNE("acst_cd")
						))
						.addSelect(m -> toArray(
							m.bcst_cd
						))
						.addMap((r, m) -> {
							r.setStringNE("bcst_cd", m.bcst_cd());
					}),
					j -> j
						.add(MAM_BP_R.class, r -> toCondition(
							r.getStringNE("bcst_cd")
						))
						.addSelect(m -> toArray(
							m.ar_cred_cd
						))
						.addMap((r, m) -> {
							r.setStringNE("cred_cd", m.ar_cred_cd());
					}),
					j -> j
						.add(MAM_CUR_R.class, r -> toCondition(
							r.getStringNE("base_cur_cd")
						))
						.addSelect(m -> toArray(
							m.amt_dec_place,
							m.upri_dec_place
						))
						.addMap((r, m) -> {
							r.setNumberNE("base_amt_dec_place", m.amt_dec_place());
							r.setNumberNE("base_upri_dec_place", m.upri_dec_place());
					}),
					j -> j
						.add(MAM_CUR_R.class, r -> toCondition(
							r.getStringNE("ptax_cur_cd")
						))
						.addSelect(m -> toArray(
							m.amt_dec_place,
							m.upri_dec_place
						))
						.addMap((r, m) -> {
							r.setNumberNE("ptax_amt_dec_place", m.amt_dec_place());
							r.setNumberNE("ptax_upri_dec_place", m.upri_dec_place());
					}),
					j -> j
						.add(MAM_UNIT_R.class, r -> toCondition(
							r.getStringNE("base_unit_cd")
						))
						.addSelect(m -> toArray(
							m.dec_place,
							m.rnd_typ
						))
						.addMap((r, m) -> {
							r.setNumberNE("base_unit_dec_place", m.dec_place());
							r.setStringNE("base_unit_rnd_typ", m.rnd_typ());
					}),
					j -> j
						.add(MAM_TAX_R.class, r -> toCondition(
							r.getStringNE("join_tax_cd_")
						))
						.addSelect(m -> toArray(
							m.inc_tax_flg,
							m.tax_rate,
							m.tax_typ
						))
						.addMap((r, m) -> {
							r.setNumberNE("tax_rate", m.tax_rate());
							r.setStringNE("tax_typ", m.tax_typ());
							r.setBooleanNE("inc_tax_flg", m.inc_tax_flg());
					})
				)
			);
	}
	
	/**
	 * -- MSBBB0020_MST_SLS_SCHD_Query_S04
	 */
	static MCQueryPlan MSBBB0020_MST_SLS_SCHD_S04() {
		MST_SLS_SCHD_R S0_SLSSCHD = MST_SLS_SCHD_R.create("SLSSCHD");
		MST_IV_R S0_IV = MST_IV_R.create("IV");
		MST_IV_D_R S0_IVD = MST_IV_D_R.create("IVD");
		MST_IV_SHIP_ACT_D_R S0_IVSHIPACTD = MST_IV_SHIP_ACT_D_R.create("IVSHIPACTD");
		MST_IV_MAP_R S0_IVMAP = MST_IV_MAP_R.create("IVMAP");
		MST_SHIP_ALLOC_STS_R S0_ALLOCSTS = MST_SHIP_ALLOC_STS_R.create("ALLOCSTS");
		MST_SHIP_ACT_D_R S0_SHIPACTD = MST_SHIP_ACT_D_R.create("SHIPACTD");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBBB0020_MST_SLS_SCHD_Query_S04")
					.mainQuery()
					.select(
						decode(
							S0_IV.via_dlv_typ,
							value(MAC_VIA_DLV_TYP.VIA.value()),
							nullValue(),
							S0_SHIPACTD.ship_act_d_no
						).as("ship_act_d_no"),
						decode(
							S0_IV.via_dlv_typ,
							value(MAC_VIA_DLV_TYP.VIA.value()),
							S0_IVSHIPACTD.iv_ship_act_d_no,
							nullValue()
						).as("iv_ship_act_d_no"),
						decode(
							S0_IV.via_dlv_typ,
							value(MAC_VIA_DLV_TYP.VIA.value()),
							S0_IVSHIPACTD.sno1,
							nvl(
								S0_SHIPACTD.sno1,
								S0_IVD.sno1
							)
						).as("sno1"),
						decode(
							S0_IV.via_dlv_typ,
							value(MAC_VIA_DLV_TYP.VIA.value()),
							S0_IVSHIPACTD.sno2,
							nvl(
								S0_SHIPACTD.sno2,
								S0_IVD.sno2
							)
						).as("sno2"),
						decode(
							S0_IV.via_dlv_typ,
							value(MAC_VIA_DLV_TYP.VIA.value()),
							S0_IVSHIPACTD.sno3,
							nvl(
								S0_SHIPACTD.sno3,
								S0_IVD.sno3
							)
						).as("sno3"),
						decode(
							S0_IV.via_dlv_typ,
							value(MAC_VIA_DLV_TYP.VIA.value()),
							S0_IVSHIPACTD.sno4,
							nvl(
								S0_SHIPACTD.sno4,
								S0_IVD.sno4
							)
						).as("sno4"),
						decode(
							S0_IV.via_dlv_typ,
							value(MAC_VIA_DLV_TYP.VIA.value()),
							S0_IVSHIPACTD.gd_cd,
							nvl(
								S0_SHIPACTD.gd_cd,
								S0_IVD.gd_cd
							)
						).as("gd_cd"),
						decode(
							S0_IV.via_dlv_typ,
							value(MAC_VIA_DLV_TYP.VIA.value()),
							S0_IVSHIPACTD.ship_loc_cd,
							S0_SHIPACTD.ship_loc_cd
						).as("loc_cd"),
						decode(
							S0_IV.via_dlv_typ,
							value(MAC_VIA_DLV_TYP.VIA.value()),
							S0_IVSHIPACTD.ship_str_ln_cd,
							S0_SHIPACTD.ship_str_ln_cd
						).as("str_ln_cd"),
						decode(
							S0_IV.via_dlv_typ,
							value(MAC_VIA_DLV_TYP.VIA.value()),
							S0_IVSHIPACTD.lot_no,
							S0_SHIPACTD.lot_no
						).as("lot_no"),
						decode(
							S0_IV.via_dlv_typ,
							value(MAC_VIA_DLV_TYP.VIA.value()),
							S0_IVSHIPACTD.sublot_no,
							S0_SHIPACTD.sublot_no
						).as("sublot_no"),
						decode(
							S0_IV.via_dlv_typ,
							value(MAC_VIA_DLV_TYP.VIA.value()),
							S0_IVSHIPACTD.trd_unit_cd,
							S0_SHIPACTD.trd_unit_cd
						).as("trd_unit_cd"),
						decode(
							S0_IV.via_dlv_typ,
							value(MAC_VIA_DLV_TYP.VIA.value()),
							S0_IVSHIPACTD.trd_unit_qty,
							S0_SHIPACTD.trd_unit_qty
						).as("trd_unit_qty"),
						decode(
							S0_IV.via_dlv_typ,
							value(MAC_VIA_DLV_TYP.VIA.value()),
							S0_IVSHIPACTD.pack_unit_cd,
							S0_SHIPACTD.pack_unit_cd
						).as("pack_unit_cd"),
						decode(
							S0_IV.via_dlv_typ,
							value(MAC_VIA_DLV_TYP.VIA.value()),
							S0_IVSHIPACTD.pack_unit_qty,
							S0_SHIPACTD.pack_unit_qty
						).as("pack_unit_qty"),
						decode(
							S0_IV.via_dlv_typ,
							value(MAC_VIA_DLV_TYP.VIA.value()),
							S0_IVSHIPACTD.base_unit_cd,
							S0_SHIPACTD.base_unit_cd
						).as("base_unit_cd"),
						decode(
							S0_IV.via_dlv_typ,
							value(MAC_VIA_DLV_TYP.VIA.value()),
							S0_IVSHIPACTD.base_unit_qty,
							S0_SHIPACTD.base_unit_qty
						).as("base_unit_qty"),
						S0_SHIPACTD.ship_alloc_sts_no
					)
					.from(
						S0_SLSSCHD
						.leftOuterJoin(S0_IV).on(
							bracket(
								S0_SLSSCHD.iv_no.eq(S0_IV.iv_no)
							)
						)
						.leftOuterJoin(S0_IVD).on(
							bracket(
								S0_SLSSCHD.iv_d_no.eq(S0_IVD.iv_d_no)
							)
						)
						.leftOuterJoin(S0_IVSHIPACTD).on(
							bracket(
								S0_SLSSCHD.iv_no.eq(S0_IVSHIPACTD.iv_no)
								.and(S0_SLSSCHD.iv_d_no.eq(S0_IVSHIPACTD.iv_d_no))
							)
						)
						.leftOuterJoin(S0_IVMAP).on(
							bracket(
								S0_IV.via_dlv_typ.eq(value(MAC_VIA_DLV_TYP.NOT_VIA.value()))
								.and(S0_SLSSCHD.iv_d_no.eq(S0_IVMAP.iv_d_no))
							)
						)
						.leftOuterJoin(S0_ALLOCSTS).on(
							bracket(
								S0_IV.via_dlv_typ.eq(value(MAC_VIA_DLV_TYP.NOT_VIA.value()))
								.and(S0_IVMAP.ship_schd_no.eq(S0_ALLOCSTS.ship_schd_no))
								.and(S0_ALLOCSTS.ship_act_qty.gt(value(0)))
							)
						)
						.leftOuterJoin(S0_SHIPACTD).on(
							bracket(
								S0_SHIPACTD.can_flg.eq(value(false))
								.and(
									bracket(
										S0_IV.via_dlv_typ.eq(value(MAC_VIA_DLV_TYP.NOT_VIA.value()))
										.and(S0_ALLOCSTS.ship_alloc_sts_no.eq(S0_SHIPACTD.ship_alloc_sts_no))
									)
									.or(
										S0_IV.via_dlv_typ.eq(value(MAC_VIA_DLV_TYP.VIA.value()))
										.and(S0_IVSHIPACTD.ship_act_d_no.eq(S0_SHIPACTD.ship_act_d_no))
									)
								)
							)
						)
					)
					.where(
						value(0).eq(value(0))
						.and(S0_SLSSCHD.sls_schd_no.eq(bind("sls_schd_no")))
					)
			);
	}
	
	/**
	 * -- MSBBB0020_MST_SLS_SCHD_Query_S05
	 */
	static MCQueryPlan MSBBB0020_MST_SLS_SCHD_S05() {
		MST_SLS_SCHD_R S0_SLSSCHD = MST_SLS_SCHD_R.create("SLSSCHD");
		MSW_SLS_SCHD_KEY_R S0_SLSSCHDKEY = MSW_SLS_SCHD_KEY_R.create("SLSSCHDKEY");
		MST_PO_SCHD_R S0_POSCHD = MST_PO_SCHD_R.create("POSCHD");
		MST_PO_R S0_PO = MST_PO_R.create("PO");
		MAM_BP_R S0_SPPL = MAM_BP_R.create("SPPL");
		MAM_BP_R S0_ASPPL = MAM_BP_R.create("ASPPL");
		MAM_BP_R S0_BSPPL = MAM_BP_R.create("BSPPL");
		MAM_CO_R S0_CO = MAM_CO_R.create("CO");
		MST_PURC_SCHD_R S0_PURCSCHD = MST_PURC_SCHD_R.create("PURCSCHD");
		MST_ARR_SCHD_R S0_ARRSCHD = MST_ARR_SCHD_R.create("ARRSCHD");
		MST_RCPT_IV_R S0_RCPTIV = MST_RCPT_IV_R.create("RCPTIV");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBBB0020_MST_SLS_SCHD_Query_S05")
					.mainQuery()
					.select(
						S0_SLSSCHD.sls_schd_no,
						S0_PO.trd_cd,
						S0_PO.trd_ptn_typ,
						S0_PO.po_no,
						S0_PO.purc_dpt_cd,
						S0_PO.purc_usr_cd,
						S0_PO.wg_cd,
						S0_PO.sppl_cd,
						S0_SPPL.subcon_flg,
						S0_PO.trd_cur_cd,
						S0_PO.trd_rmrks,
						S0_PO.tterm_cd1,
						S0_PO.tterm_rmrks1,
						S0_PO.tterm_cd2,
						S0_PO.tterm_rmrks2,
						S0_PO.tterm_cd3,
						S0_PO.tterm_rmrks3,
						S0_ARRSCHD.rcpt_iv_no,
						S0_ARRSCHD.rcpt_iv_mng_no,
						cases()
							.when(
								S0_SPPL.sppl_iv_flg.eq(value(true))
								.and(S0_BSPPL.pay_spot_flg.eq(value(true)))
							)
								.then(S0_RCPTIV.pay_schd_dt)
							.otherwise(nullValue()).as("pay_schd_dt"),
						cases()
							.when(
								S0_SPPL.sppl_iv_flg.eq(value(true))
								.and(S0_BSPPL.pay_spot_flg.eq(value(false)))
							)
								.then(S0_RCPTIV.pay_basis_dt)
							.otherwise(nullValue()).as("pay_basis_dt"),
						cases()
							.when(S0_RCPTIV.xrate_inpt_flg.eq(value(true)))
								.then(S0_RCPTIV.xrate)
							.when(
								S0_ARRSCHD.rcpt_iv_no.isNull()
								.and(S0_PO.xrate_inpt_flg.eq(value(true)))
							)
								.then(S0_PO.xrate)
							.otherwise(
								MAPA_XCHNG$F_GET_PURC_XRATE(
									S0_PO.trd_cur_cd,
									bind("today")
								)
							).as("xrate"),
						cases()
							.when(S0_RCPTIV.ptax_xrate_inpt_flg.eq(value(true)))
								.then(S0_RCPTIV.ptax_xrate)
							.when(
								S0_ARRSCHD.rcpt_iv_no.isNull()
								.and(S0_PO.ptax_xrate_inpt_flg.eq(value(true)))
							)
								.then(S0_PO.ptax_xrate)
							.when(S0_CO.ptax_cur_cd.isNull())
								.then(nullValue())
							.otherwise(
								MAPA_XCHNG$F_GET_XRATE(
									S0_PO.trd_cur_cd,
									S0_CO.ptax_cur_cd,
									S0_CO.purc_xrate_cd,
									bind("today")
								)
							).as("ptax_xrate")
					)
					.from(
						S0_SLSSCHD
						.innerJoin(S0_SLSSCHDKEY).on(S0_SLSSCHD.sls_schd_no.eq(S0_SLSSCHDKEY.sls_schd_no))
						.innerJoin(S0_POSCHD).on(S0_SLSSCHD.po_schd_no.eq(S0_POSCHD.po_schd_no))
						.innerJoin(S0_PO).on(S0_POSCHD.po_no.eq(S0_PO.po_no))
						.leftOuterJoin(S0_SPPL).on(
							bracket(
								S0_PO.sppl_cd.eq(S0_SPPL.bp_cd)
							)
						)
						.leftOuterJoin(S0_ASPPL).on(
							bracket(
								S0_SPPL.asppl_cd.eq(S0_ASPPL.bp_cd)
							)
						)
						.leftOuterJoin(S0_BSPPL).on(
							bracket(
								S0_ASPPL.bsppl_cd.eq(S0_BSPPL.bp_cd)
							)
						)
						.crossJoin(S0_CO)
						.innerJoin(S0_PURCSCHD).on(S0_SLSSCHD.purc_schd_no.eq(S0_PURCSCHD.purc_schd_no))
						.innerJoin(S0_ARRSCHD).on(S0_PURCSCHD.arr_schd_no.eq(S0_ARRSCHD.arr_schd_no))
						.leftOuterJoin(S0_RCPTIV).on(
							bracket(
								S0_ARRSCHD.rcpt_iv_mng_no.eq(S0_RCPTIV.rcpt_iv_mng_no)
							)
						)
					)
			);
	}
	
	/**
	 * -- MSBBB0020_MST_SLS_SCHD_Query_S06
	 */
	static MCQueryPlan MSBBB0020_MST_SLS_SCHD_S06() {
		MST_SLS_SCHD_R S0_SLSSCHD = MST_SLS_SCHD_R.create("SLSSCHD");
		MST_DLV_SLIP_D_R S0_SLIPD = MST_DLV_SLIP_D_R.create("SLIPD");
		MST_SHIP_ACT_D_R S0_SHIPACTD = MST_SHIP_ACT_D_R.create("SHIPACTD");
		MST_DLV_SLIP_D_R S1_DLVSLIPD = MST_DLV_SLIP_D_R.create("DLVSLIPD");
		MST_DLV_SLIP_R S1_DLVSLIP = MST_DLV_SLIP_R.create("DLVSLIP");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBBB0020_MST_SLS_SCHD_Query_S06")
					.mainQuery()
					.select(
						S0_SHIPACTD.ship_act_d_no.as("ship_act_d_no"),
						S0_SHIPACTD.sno1.as("sno1"),
						S0_SHIPACTD.sno2.as("sno2"),
						S0_SHIPACTD.sno3.as("sno3"),
						S0_SHIPACTD.sno4.as("sno4"),
						S0_SHIPACTD.gd_cd.as("gd_cd"),
						S0_SHIPACTD.ship_loc_cd.as("loc_cd"),
						S0_SHIPACTD.ship_str_ln_cd.as("str_ln_cd"),
						S0_SHIPACTD.lot_no.as("lot_no"),
						S0_SHIPACTD.sublot_no.as("sublot_no"),
						S0_SHIPACTD.trd_unit_cd.as("trd_unit_cd"),
						S0_SHIPACTD.trd_unit_qty.as("trd_unit_qty"),
						S0_SHIPACTD.pack_unit_cd.as("pack_unit_cd"),
						S0_SHIPACTD.pack_unit_qty.as("pack_unit_qty"),
						S0_SHIPACTD.base_unit_cd.as("base_unit_cd"),
						S0_SHIPACTD.base_unit_qty.as("base_unit_qty"),
						S0_SHIPACTD.ship_alloc_sts_no
					)
					.from(
						S0_SLSSCHD
						.leftOuterJoin(S0_SLIPD).on(
							bracket(
								S0_SLSSCHD.dlv_slip_d_no.eq(S0_SLIPD.dlv_slip_d_no)
								.and(
									S0_SLIPD.dlv_slip_d_seq.eq(subQuery()
										.select(max(S1_DLVSLIPD.dlv_slip_d_seq))
										.from(S1_DLVSLIPD
											.innerJoin(S1_DLVSLIP).on(
												S1_DLVSLIP.dlv_slip_no.eq(S1_DLVSLIPD.dlv_slip_no)
												.and(S1_DLVSLIP.dlv_slip_seq.eq(S1_DLVSLIPD.dlv_slip_seq))
											)
										)
										.where(
											S1_DLVSLIPD.dlv_slip_d_no.eq(S0_SLSSCHD.dlv_slip_d_no)
											.and(S1_DLVSLIP.trn_typ.eq(value(MSC_TRN_TYP.SHIP.value())))
											.and(S1_DLVSLIP.slip_sts_typ.neq(value(MAC_SLIP_STS_TYP.CAN.value())))
										)
									)
								)
							)
						)
						.leftOuterJoin(S0_SHIPACTD).on(
							bracket(
								S0_SLSSCHD.dlv_slip_d_no.eq(S0_SHIPACTD.dlv_slip_d_no)
								.and(S0_SHIPACTD.can_flg.eq(value(false)))
							)
						)
					)
					.where(
						value(0).eq(value(0))
						.and(S0_SLSSCHD.sls_schd_no.eq(bind("sls_schd_no")))
					)
			);
	}
	
	/**
	 * -- MSBBB0020_MST_SLS_SCHD_Query_S07
	 */
	static MCQueryPlan MSBBB0020_MST_SLS_SCHD_S07() {
		MST_SLS_SCHD_R S0_SLSSCHD = MST_SLS_SCHD_R.create("SLSSCHD");
		MSW_SLS_SCHD_KEY_R S0_SLSSCHDKEY = MSW_SLS_SCHD_KEY_R.create("SLSSCHDKEY");
		MST_IV_D_R S0_IVD = MST_IV_D_R.create("IVD");
		MST_DLV_SLIP_D_R S0_DLVSLIPD = MST_DLV_SLIP_D_R.create("DLVSLIPD");
		MST_SLO_D_R S0_SLOD = MST_SLO_D_R.create("SLOD");
		MST_IV_R S0_IV = MST_IV_R.create("IV");
		MST_DLV_SLIP_R S0_DLVSLIP = MST_DLV_SLIP_R.create("DLVSLIP");
		MST_SLO_R S0_SLO = MST_SLO_R.create("SLO");
		MAVM_ITM_UNIT_R S0_ITMUNIT = MAVM_ITM_UNIT_R.create("ITMUNIT");
		MAM_TAX_R S0_TAX = MAM_TAX_R.create("TAX");
		MAM_CUR_R S0_CUR = MAM_CUR_R.create("CUR");
		MAM_BP_R S0_CST = MAM_BP_R.create("CST");
		MST_DLV_SLIP_D_R S1_SDLVSLIPD = MST_DLV_SLIP_D_R.create("SDLVSLIPD");
		MST_DLV_SLIP_R S1_SDLVSLIP = MST_DLV_SLIP_R.create("SDLVSLIP");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBBB0020_MST_SLS_SCHD_Query_S07")
					.mainQuery()
					.select(
						nvl(
							S0_IVD.trd_unit_cd,
							nvl(
								S0_DLVSLIPD.trd_unit_cd,
								S0_SLOD.trd_unit_cd
							)
						).as("trd_unit_cd"),
						nvl(
							S0_IVD.trd_unit_qty,
							nvl(
								S0_DLVSLIPD.trd_unit_qty,
								S0_SLOD.trd_unit_qty
							)
						).as("trd_unit_qty"),
						nvl(
							S0_IVD.trd_cur_upri,
							nvl(
								S0_DLVSLIPD.trd_cur_upri,
								S0_SLOD.trd_cur_upri
							)
						).as("trd_cur_upri"),
						nvl(
							S0_IVD.trd_cur_dscnt_amt,
							nvl(
								S0_DLVSLIPD.trd_cur_dscnt_amt,
								S0_SLOD.trd_cur_dscnt_amt
							)
						).as("trd_cur_dscnt_amt"),
						nvl(
							S0_IVD.trd_cur_amt,
							nvl(
								S0_DLVSLIPD.trd_cur_amt,
								S0_SLOD.trd_cur_amt
							)
						).as("trd_cur_amt"),
						nvl(
							S0_IVD.trd_cur_tax_amt,
							nvl(
								S0_DLVSLIPD.trd_cur_tax_amt,
								S0_SLOD.trd_cur_tax_amt
							)
						).as("trd_cur_tax_amt"),
						S0_SLSSCHD.base_unit_cd,
						S0_ITMUNIT.conv_base_qty.as("trd_unit_conv_base_qty"),
						S0_ITMUNIT.conv_qty.as("trd_unit_conv_qty"),
						S0_TAX.tax_rate,
						S0_TAX.inc_tax_flg,
						S0_CUR.amt_dec_place,
						S0_CUR.upri_dec_place,
						S0_CST.sls_amt_rnd_typ.as("amt_rnd_typ"),
						S0_CST.sls_tax_rnd_typ.as("tax_rnd_typ"),
						S0_SLSSCHD.base_unit_qty.as("sls_schd_qty"),
						S0_SLSSCHD.base_unit_sls_qty.add(S0_SLSSCHD.base_unit_abort_qty).as("base_unit_cmpl_qty"),
						S0_SLSSCHD.sls_schd_no
					)
					.from(
						S0_SLSSCHD
						.innerJoin(S0_SLSSCHDKEY).on(
							bracket(
								S0_SLSSCHD.sls_schd_no.eq(S0_SLSSCHDKEY.sls_schd_no)
							)
						)
						.leftOuterJoin(S0_IVD).on(S0_IVD.iv_d_no.eq(S0_SLSSCHD.iv_d_no))
						.leftOuterJoin(S0_DLVSLIPD).on(
							bracket(
								S0_SLSSCHD.dlv_slip_d_no.eq(S0_DLVSLIPD.dlv_slip_d_no)
								.and(
									S0_DLVSLIPD.dlv_slip_d_seq.eq(subQuery()
										.select(max(S1_SDLVSLIPD.dlv_slip_d_seq))
										.from(
											S1_SDLVSLIPD
											.innerJoin(S1_SDLVSLIP).on(
												S1_SDLVSLIPD.dlv_slip_no.eq(S1_SDLVSLIP.dlv_slip_no)
												.and(S1_SDLVSLIPD.dlv_slip_seq.eq(S1_SDLVSLIP.dlv_slip_seq))
											)
										)
										.where(
											S1_SDLVSLIPD.dlv_slip_d_no.eq(S0_SLSSCHD.dlv_slip_d_no)
											.and(S1_SDLVSLIP.trn_typ.eq(value(MSC_TRN_TYP.SHIP.value())))
											.and(S1_SDLVSLIP.slip_sts_typ.neq(value(MAC_SLIP_STS_TYP.CAN.value())))
											.and(S1_SDLVSLIP.sync_flg.eq(value(false)))
										)
									)
								)
							)
						)
						.leftOuterJoin(S0_SLOD).on(S0_SLOD.slo_d_no.eq(S0_SLSSCHD.slo_d_no))
						.leftOuterJoin(S0_IV).on(S0_IV.iv_mng_no.eq(S0_IVD.iv_mng_no))
						.leftOuterJoin(S0_DLVSLIP).on(
							bracket(
								S0_DLVSLIP.dlv_slip_no.eq(S0_DLVSLIPD.dlv_slip_no)
								.and(S0_DLVSLIP.dlv_slip_seq.eq(S0_DLVSLIPD.dlv_slip_seq))
							)
						)
						.leftOuterJoin(S0_SLO).on(S0_SLO.slo_no.eq(S0_SLOD.slo_no))
						.leftOuterJoin(S0_ITMUNIT).on(
							bracket(
								nvl(
									S0_IVD.itm_cd,
									nvl(
										S0_DLVSLIPD.itm_cd,
										S0_SLOD.itm_cd
									)
								).eq(S0_ITMUNIT.itm_cd)
								.and(
									nvl(
										S0_IVD.itm_sub1,
										nvl(
											S0_DLVSLIPD.itm_sub1,
											S0_SLOD.itm_sub1
										)
									).eq(S0_ITMUNIT.itm_sub1)
								)
								.and(
									nvl(
										S0_IVD.itm_sub2,
										nvl(
											S0_DLVSLIPD.itm_sub2,
											S0_SLOD.itm_sub2
										)
									).eq(S0_ITMUNIT.itm_sub2)
								)
								.and(
									nvl(
										S0_IVD.itm_sub3,
										nvl(
											S0_DLVSLIPD.itm_sub3,
											S0_SLOD.itm_sub3
										)
									).eq(S0_ITMUNIT.itm_sub3)
								)
								.and(
									nvl(
										S0_IVD.trd_unit_cd,
										nvl(
											S0_DLVSLIPD.trd_unit_cd,
											S0_SLOD.trd_unit_cd
										)
									).eq(S0_ITMUNIT.unit_cd)
								)
							)
						)
						.leftOuterJoin(S0_TAX).on(
							bracket(
								nvl(
									S0_IVD.tax_cd,
									nvl(
										S0_DLVSLIPD.tax_cd,
										S0_SLOD.tax_cd
									)
								).eq(S0_TAX.tax_cd)
							)
						)
						.leftOuterJoin(S0_CUR).on(
							bracket(
								nvl(
									S0_IV.trd_cur_cd,
									nvl(
										S0_DLVSLIP.trd_cur_cd,
										S0_SLO.trd_cur_cd
									)
								).eq(S0_CUR.cur_cd)
							)
						)
						.leftOuterJoin(S0_CST).on(
							bracket(
								nvl(
									S0_IV.ship_rqst_id_cd,
									nvl(
										S0_DLVSLIP.bp_cd,
										S0_SLO.cst_cd
									)
								).eq(S0_CST.bp_cd)
							)
						)
					)
					.where(
						value(0).eq(value(0))
					)
			)
			.setJoinInfo(
				joinInfo(
					j -> j
						.add(MAM_UNIT_R.class, r -> toCondition(
							r.getStringNE("base_unit_cd")
						))
						.addSelect(m -> toArray(
							m.dec_place,
							m.rnd_typ
						))
						.addMap((r, m) -> {
							r.setNumberNE("base_unit_dec_place", m.dec_place());
							r.setStringNE("base_unit_rnd_typ", m.rnd_typ());
					})
				)
			);
	}
	
	/**
	 * -- MSBBB0020_MST_SLS_SCHD_Query_S08
	 */
	static MCQueryPlan MSBBB0020_MST_SLS_SCHD_S08() {
		MST_SHIP_ACT_D_R S0_SHIPACTD = MST_SHIP_ACT_D_R.create("SHIPACTD");
		MST_SLS_SCHD_R S0_SLSSCHD = MST_SLS_SCHD_R.create("SLSSCHD");
		MSW_SLS_SCHD_KEY_R S0_SLSSCHDKEY = MSW_SLS_SCHD_KEY_R.create("SLSSCHDKEY");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBBB0020_MST_SLS_SCHD_Query_S08")
					.mainQuery()
					.select(
						S0_SLSSCHD.sls_schd_no,
						sum(S0_SHIPACTD.ship_ret_qty).as("ship_ret_qty")
					)
					.from(
						S0_SLSSCHDKEY
						.innerJoin(S0_SLSSCHD).on(
							bracket(
								S0_SLSSCHD.sls_schd_no.eq(S0_SLSSCHDKEY.sls_schd_no)
							)
						)
						.innerJoin(S0_SHIPACTD).on(
							bracket(
								S0_SLSSCHD.dlv_slip_d_no.eq(S0_SHIPACTD.dlv_slip_d_no)
								.and(S0_SHIPACTD.can_flg.eq(value(false)))
							)
						)
					)
					.groupBy(S0_SLSSCHD.sls_schd_no)
			);
	}
	
	/**
	 * -- MSBBB0020_MST_PO_D_Query_S01
	 */
	static MCQueryPlan MSBBB0020_MST_PO_D_S01() {
		MST_SLS_SCHD_R S0_SLSSCHD = MST_SLS_SCHD_R.create("SLSSCHD");
		MST_PURC_ACT_D_R S0_PURCD = MST_PURC_ACT_D_R.create("PURCD");
		MST_PO_D_R S0_POD = MST_PO_D_R.create("POD");
		MST_PO_R S0_PO = MST_PO_R.create("PO");
		MAM_BP_R S0_SPPL = MAM_BP_R.create("SPPL");
		MAM_ITM_R S0_ITM = MAM_ITM_R.create("ITM");
		MAM_ITM_LCL_R S0_ITMLCL = MAM_ITM_LCL_R.create("ITMLCL");
		MAM_TAX_R S0_TAX = MAM_TAX_R.create("TAX");
		MST_PURC_SCHD_R S0_PURCSCHD = MST_PURC_SCHD_R.create("PURCSCHD");
		MST_SLO_D_R S0_SLOD = MST_SLO_D_R.create("SLOD");
		MST_ARR_SCHD_R S0_ARRSCHD = MST_ARR_SCHD_R.create("ARRSCHD");
		MST_SHIP_PR_R S0_SHIPPR = MST_SHIP_PR_R.create("SHIPPR");
		MST_ARR_PR_R S0_ARRPR = MST_ARR_PR_R.create("ARRPR");
		MST_RCPT_IV_D_R S0_RCPTIVD = MST_RCPT_IV_D_R.create("RCPTIVD");
		MSW_SLS_SCHD_KEY_R S0_SLSSCHDKEY = MSW_SLS_SCHD_KEY_R.create("SLSSCHDKEY");
		MST_PURC_ACT_D_R S1_PURCACTD = MST_PURC_ACT_D_R.create("PURCACTD");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBBB0020_MST_PO_D_Query_S01")
					.mainQuery()
					.select(
						S0_SLSSCHD.sls_schd_no,
						S0_POD.po_d_no,
						S0_SLSSCHD.purc_schd_no,
						S0_PURCSCHD.arr_schd_no,
						S0_ARRSCHD.mfg_inst_no,
						S0_POD.itm_cd,
						S0_POD.itm_sub1,
						S0_POD.itm_sub2,
						S0_POD.itm_sub3,
						nvl(
							S0_POD.itm_nm,
							S0_ITM.itm_nm
						).as("itm_nm"),
						nvl(
							S0_POD.iv_itm_nm,
							S0_ITMLCL.itm_nm
						).as("iv_itm_nm"),
						S0_POD.sppl_itm_cd,
						S0_POD.sppl_itm_nm,
						S0_POD.sundry_itm_flg,
						S0_POD.base_unit_cd,
						S0_RCPTIVD.upri_not_tgt_flg,
						S0_POD.interim_flg,
						nvl(
							S0_RCPTIVD.interim_flg,
							S0_POD.interim_flg
						).as("interim_flg"),
						coalesce(
							S0_RCPTIVD.trd_cur_upri,
							S0_PURCD.trd_cur_upri,
							S0_POD.trd_cur_upri
						).as("trd_cur_upri"),
						coalesce(
							S0_RCPTIVD.trd_cur_amt,
							S0_PURCD.trd_cur_amt,
							S0_POD.trd_cur_amt
						).as("trd_cur_amt"),
						coalesce(
							S0_RCPTIVD.trd_cur_tax_amt,
							S0_PURCD.trd_cur_tax_amt,
							S0_POD.trd_cur_tax_amt
						).as("trd_cur_tax_amt"),
						S0_PURCD.trd_cur_dscnt_amt
						.as("purc_trd_cur_dscnt_amt"),
						nvl(
							S0_RCPTIVD.trd_cur_proc_upri,
							S0_PURCD.trd_cur_proc_upri
						).as("trd_cur_proc_upri"),
						nvl(
							S0_RCPTIVD.trd_cur_onr_prov_upri,
							S0_PURCD.trd_cur_onr_prov_upri
						).as("trd_cur_onr_prov_upri"),
						decode(
							S0_PURCD.purc_dtl_upd_flg,
							value(true),
							S0_PURCD.ptax_cur_tax_amt
						).as("ptax_cur_tax_amt"),
						decode(
							S0_PURCD.sync_flg,
							value(true),
							S0_PURCD.dscnt_rsn_cd,
							nvl(
								S0_RCPTIVD.dscnt_rsn_cd,
								S0_POD.dscnt_rsn_cd
							)
						).as("dscnt_rsn_cd"),
						cases()
							.when(S0_PURCD.tax_cd.isNotNull())
								.then(S0_PURCD.tax_cd)
							.when(S0_RCPTIVD.tax_cd.isNotNull())
								.then(
									decode(
										S0_RCPTIVD.tax_fix_flg,
										value(true),
										S0_RCPTIVD.tax_cd,
										MAPA_TAX$F_GET_PURC_TAX_CD(
											S0_RCPTIVD.itm_cd,
											S0_RCPTIVD.itm_sub1,
											S0_RCPTIVD.itm_sub2,
											S0_RCPTIVD.itm_sub3,
											S0_PO.sppl_cd,
											bind("today")
										)
									)
								)
							.otherwise(
								decode(
									S0_POD.tax_fix_flg,
									value(true),
									S0_POD.tax_cd,
									MAPA_TAX$F_GET_PURC_TAX_CD(
										S0_POD.itm_cd,
										S0_POD.itm_sub1,
										S0_POD.itm_sub2,
										S0_POD.itm_sub3,
										S0_PO.sppl_cd,
										bind("today")
									)
								)
						).as("tax_cd"),
						nvl(
							S0_RCPTIVD.wtax_rate,
							S0_POD.wtax_rate
						).as("wtax_rate"),
						S0_POD.maker_cd,
						S0_POD.ap_dpt_cd,
						S0_POD.pay_crryovr_times,
						S0_POD.bd_itm_cd,
						S0_POD.bd_itm_sub1,
						S0_POD.bd_itm_sub2,
						S0_POD.bd_itm_sub3,
						S0_POD.bd_sno1,
						S0_POD.bd_sno2,
						S0_POD.bd_sno3,
						S0_POD.bd_sno4,
						S0_POD.bd_lot_no,
						S0_POD.bd_sublot_no,
						S0_POD.bd_ctg_cd,
						S0_POD.bd_oper_cd,
						S0_POD.bd_iv_no,
						S0_POD.bd_loc_cd,
						S0_POD.bd_po_no,
						S0_POD.bd_slo_no,
						S0_ITM.stk_mng_typ,
						S0_ITM.asset_mng_typ,
						decode(
							S0_PURCD.sync_flg,
							value(true),
							S0_PURCD.rsn_cd,
							nvl(
								S0_RCPTIVD.purc_rsn_cd,
								S0_POD.purc_rsn_cd
							)
						).as("rsn_cd"),
						S0_POD.bd_dpt_cd,
						S0_POD.trd_d_rmrks,
						S0_SLOD.gd_cd,
						S0_POD.sno1,
						S0_POD.sno2,
						S0_POD.sno3,
						S0_POD.sno4,
						S0_ARRSCHD.arr_loc_cd.as("dlv_loc_cd"),
						S0_ARRSCHD.str_ln_cd,
						S0_ARRSCHD.quality_typ,
						S0_ARRSCHD.stk_insp_typ,
						S0_ARRSCHD.stk_id_typ,
						S0_ARRSCHD.stk_bp_cd,
						S0_POD.bp_lot_no,
						nvl(
							S0_RCPTIVD.trd_cur_dscnt_amt,
							S0_POD.trd_cur_dscnt_amt
						).as("trd_cur_dscnt_amt"),
						S0_POD.base_unit_qty.as("po_base_unit_qty"),
						S0_SPPL.purc_amt_rnd_typ,
						S0_TAX.inc_tax_flg,
						S0_TAX.tax_rate,
						S0_SPPL.purc_tax_rnd_typ,
						S0_SHIPPR.loc_cd.as("ship_pr_loc_cd"),
						S0_SHIPPR.str_ln_cd.as("ship_pr_str_ln_cd"),
						S0_RCPTIVD.rcpt_iv_d_no
					)
					.from(
						S0_SLSSCHD
						.leftOuterJoin(S0_PURCD).on(
							bracket(
								S0_PURCD.purc_act_d_no.eq(S0_SLSSCHD.purc_act_d_no)
								.and(
									S0_PURCD.purc_act_d_seq.eq(subQuery()
										.select(max(S1_PURCACTD.purc_act_d_seq))
										.from(S1_PURCACTD)
										.where(
											S1_PURCACTD.purc_act_d_no.eq(S0_SLSSCHD.purc_act_d_no)
										)
									)
								)
							)
						)
						.innerJoin(S0_POD).on(
							S0_POD.slo_d_no.eq(S0_SLSSCHD.slo_d_no)
							.and(S0_POD.po_schd_no.eq(S0_SLSSCHD.po_schd_no))
						)
						.leftOuterJoin(S0_PO).on(
							bracket(
								S0_POD.po_no.eq(S0_PO.po_no)
							)
						)
						.leftOuterJoin(S0_SPPL).on(
							bracket(
								S0_PO.sppl_cd.eq(S0_SPPL.bp_cd)
							)
						)
						.leftOuterJoin(S0_ITM).on(
							bracket(
								S0_POD.itm_cd.eq(S0_ITM.itm_cd)
								.and(S0_POD.itm_sub1.eq(S0_ITM.itm_sub1))
								.and(S0_POD.itm_sub2.eq(S0_ITM.itm_sub2))
								.and(S0_POD.itm_sub3.eq(S0_ITM.itm_sub3))
							)
						)
						.leftOuterJoin(S0_ITMLCL).on(
							bracket(
								S0_POD.itm_cd.eq(S0_ITMLCL.itm_cd)
								.and(S0_POD.itm_sub1.eq(S0_ITMLCL.itm_sub1))
								.and(S0_POD.itm_sub2.eq(S0_ITMLCL.itm_sub2))
								.and(S0_POD.itm_sub3.eq(S0_ITMLCL.itm_sub3))
								.and(S0_SPPL.prnt_lcl_cd.eq(S0_ITMLCL.lcl_cd))
							)
						)
						.leftOuterJoin(S0_TAX).on(
							bracket(
								decode(
									S0_POD.tax_fix_flg,
									value(true),
									S0_POD.tax_cd,
									MAPA_TAX$F_GET_PURC_TAX_CD(
										S0_POD.itm_cd,
										S0_POD.itm_sub1,
										S0_POD.itm_sub2,
										S0_POD.itm_sub3,
										S0_PO.sppl_cd,
										bind("today")
									)
								).eq(S0_TAX.tax_cd)
							)
						)
						.innerJoin(S0_PURCSCHD).on(S0_PURCSCHD.purc_schd_no.eq(S0_SLSSCHD.purc_schd_no))
						.innerJoin(S0_SLOD).on(S0_SLSSCHD.slo_d_no.eq(S0_SLOD.slo_d_no))
						.innerJoin(S0_ARRSCHD).on(S0_PURCSCHD.arr_schd_no.eq(S0_ARRSCHD.arr_schd_no))
						.innerJoin(S0_SHIPPR).on(S0_SHIPPR.slo_d_no.eq(S0_SLSSCHD.slo_d_no))
						.innerJoin(S0_ARRPR).on(
							S0_POD.po_d_no.eq(S0_ARRPR.po_d_no)
							.and(S0_ARRSCHD.arr_pr_no.eq(S0_ARRPR.arr_pr_no))
						)
						.leftOuterJoin(S0_RCPTIVD).on(
							S0_SLSSCHD.purc_schd_no.eq(S0_RCPTIVD.purc_schd_no)
						)
						.innerJoin(S0_SLSSCHDKEY).on(S0_SLSSCHD.sls_schd_no.eq(S0_SLSSCHDKEY.sls_schd_no))
					)
			)
			.setJoinInfo(
				joinInfo(
					j -> j
						.add(MAM_BIZ_RSN_R.class, r -> toCondition(
							r.getStringNE("rsn_cd")
						))
						.addSelect(m -> toArray(
							m.xpns_purc_flg
						))
						.addMap((r, m) -> {
							r.setBooleanNE("xpns_purc_flg", m.xpns_purc_flg());
					}),
					j -> j
						.add(MAM_LOC_R.class, r -> toCondition(
							r.getStringNE("dlv_loc_cd")
						))
						.addSelect(m -> toArray(
							m.wg_cd
						))
						.addMap((r, m) -> {
							r.setStringNE("dlv_loc_wg_cd", m.wg_cd());
					}),
					j -> j
						.add(MAM_LOC_R.class, r -> toCondition(
							r.getStringNE("ship_pr_loc_cd")
						))
						.addSelect(m -> toArray(
							m.wg_cd
						))
						.addMap((r, m) -> {
							r.setStringNE("pr_loc_wg_cd", m.wg_cd());
					})
				)
			);
	}
	
	/**
	 * -- MSBBB0020_MST_ARR_ACT_Query_S01
	 */
	static MCQueryPlan MSBBB0020_MST_ARR_ACT_S01() {
		MST_ARR_ACT_R S0_ARRA = MST_ARR_ACT_R.create("ARRA");
		MST_PURC_ACT_IO_R S0_PURCAI = MST_PURC_ACT_IO_R.create("PURCAI");
		MST_PURC_ACT_D_R S0_PURCAD = MST_PURC_ACT_D_R.create("PURCAD");
		MST_PURC_ACT_R S0_PURCA = MST_PURC_ACT_R.create("PURCA");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBBB0020_MST_ARR_ACT_Query_S01")
					.mainQuery()
					.select(
						S0_ARRA.arr_loc_cd.as("loc_cd"),
						S0_ARRA.str_ln_cd,
						S0_ARRA.lot_no,
						S0_ARRA.sublot_no,
						S0_ARRA.sno1,
						S0_ARRA.sno2,
						S0_ARRA.sno3,
						S0_ARRA.sno4,
						S0_ARRA.gd_cd,
						S0_ARRA.trd_unit_qty,
						S0_ARRA.trd_unit_cd,
						S0_ARRA.base_unit_qty,
						S0_ARRA.base_unit_cd,
						S0_ARRA.arr_act_no,
						S0_PURCAI.purc_act_io_no
					)
					.from(
						S0_ARRA
						.innerJoin(S0_PURCAI).on(S0_PURCAI.arr_act_no.eq(S0_ARRA.arr_act_no))
						.innerJoin(S0_PURCAD).on(
							bracket(
								S0_PURCAD.purc_act_d_no.eq(S0_PURCAI.purc_act_d_no)
								.and(S0_PURCAD.purc_act_d_seq.eq(S0_PURCAI.purc_act_d_seq))
							)
						)
						.innerJoin(S0_PURCA).on(
							bracket(
								S0_PURCA.purc_act_no.eq(S0_PURCAD.purc_act_no)
								.and(S0_PURCA.purc_act_seq.eq(S0_PURCAD.purc_act_seq))
							)
						)
					)
					.where(
						value(0).eq(value(0))
						.and(S0_PURCAD.purc_act_d_no.eq(bind("purc_act_d_no")))
						.and(S0_ARRA.can_flg.eq(value(false)))
						.and(S0_PURCA.slip_sts_typ.eq(value(MAC_SLIP_STS_TYP.CRT.value())))
					)
			);
	}
	
	/**
	 * -- MSBBB0020_MSW_SHIP_SCHD_KEY_Query_S01
	 */
	static MCQueryPlan MSBBB0020_MSW_SHIP_SCHD_KEY_S01() {
		MCTempView S0_SAS = createTempView("SAS");
		MCTempView S1_WSAS = createTempView("WSAS");
		MSW_SHIP_SCHD_KEY_R S2_WSHIPSCHD = MSW_SHIP_SCHD_KEY_R.create("WSHIPSCHD");
		MST_SHIP_ALLOC_STS_R S2_SHIPALLOCSTS = MST_SHIP_ALLOC_STS_R.create("SHIPALLOCSTS");
		MST_SLS_SCHD_R S2_SLSSCHD = MST_SLS_SCHD_R.create("SLSSCHD");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBBB0020_MSW_SHIP_SCHD_KEY_Query_S01")
					.mainQuery()
					.select(
						S0_SAS.pr(S2_SHIPALLOCSTS.ship_schd_no),
						S0_SAS.pr("loc_cd"),
						S0_SAS.pr("str_ln_cd"),
						nvl(
							S0_SAS.pr("lot_no"),
							value(MAC_STR.NULL_VAL.value())
						).as("sls_lot_no"),
						nvl(
							S0_SAS.pr("sublot_no"),
							value(MAC_STR.NULL_VAL.value())
						).as("sls_sublot_no"),
						S0_SAS.pr("ship_alloc_sts_no")
					)
					.from(
						subQuery()
						.select(
							S1_WSAS.pr(S2_SHIPALLOCSTS.ship_schd_no),
							decode(
								S1_WSAS.pr("lot_not_cnt"),
								value(1),
								S1_WSAS.pr(S2_SHIPALLOCSTS.lot_no),
								nullValue()
							).as("lot_no"),
							decode(
								S1_WSAS.pr("lot_not_cnt"),
								value(1),
								S1_WSAS.pr(S2_SHIPALLOCSTS.sublot_no),
								nullValue()
							).as("sublot_no"),
							decode(
								S1_WSAS.pr("lot_not_cnt"),
								value(1),
								S1_WSAS.pr(S2_SHIPALLOCSTS.ship_alloc_sts_no),
								nullValue()
							).as("ship_alloc_sts_no"),
							decode(
								S1_WSAS.pr("lot_not_cnt"),
								value(1),
								S1_WSAS.pr(S2_SHIPALLOCSTS.ship_loc_cd),
								nullValue()
							).as("loc_cd"),
							decode(
								S1_WSAS.pr("lot_not_cnt"),
								value(1),
								S1_WSAS.pr(S2_SHIPALLOCSTS.ship_str_ln_cd),
								nullValue()
							).as("str_ln_cd")
						)
						.from(
							subQuery()
							.select(
								S2_SHIPALLOCSTS.ship_schd_no,
								S2_SHIPALLOCSTS.lot_no,
								S2_SHIPALLOCSTS.sublot_no,
								S2_SHIPALLOCSTS.ship_alloc_sts_no,
								S2_SHIPALLOCSTS.ship_loc_cd,
								S2_SHIPALLOCSTS.ship_str_ln_cd,
								count(value("X"))
									.over()
									.partitionBy(S2_SHIPALLOCSTS.ship_schd_no).as("lot_not_cnt")
							)
							.from(
								S2_WSHIPSCHD
								.innerJoin(S2_SHIPALLOCSTS).on(
									bracket(
										S2_SHIPALLOCSTS.ship_schd_no.eq(S2_WSHIPSCHD.ship_schd_no)
									)
								)
								.innerJoin(S2_SLSSCHD).on(S2_SHIPALLOCSTS.ship_schd_no.eq(S2_SLSSCHD.ship_schd_no))
							)
							.where(
								value(0).eq(value(0))
								.and(S2_SLSSCHD.sls_ac_abl_flg.eq(value(true)))
								.and(S2_SLSSCHD.cmpl_flg.eq(value(false)))
								.and(
									S2_SLSSCHD.base_unit_qty.subtract(bracket(
											S2_SLSSCHD.base_unit_sls_qty.add(S2_SLSSCHD.base_unit_abort_qty)
										)).gt(value(0))
								)
							)
							.groupBy(
								S2_SHIPALLOCSTS.ship_schd_no,
								S2_SHIPALLOCSTS.lot_no,
								S2_SHIPALLOCSTS.sublot_no,
								S2_SHIPALLOCSTS.ship_alloc_sts_no,
								S2_SHIPALLOCSTS.ship_loc_cd,
								S2_SHIPALLOCSTS.ship_str_ln_cd
							).view(S1_WSAS)
						)
						.groupBy(
							S1_WSAS.pr(S2_SHIPALLOCSTS.ship_schd_no),
							decode(
								S1_WSAS.pr("lot_not_cnt"),
								value(1),
								S1_WSAS.pr(S2_SHIPALLOCSTS.lot_no),
								nullValue()
							),
							decode(
								S1_WSAS.pr("lot_not_cnt"),
								value(1),
								S1_WSAS.pr(S2_SHIPALLOCSTS.sublot_no),
								nullValue()
							),
							decode(
								S1_WSAS.pr("lot_not_cnt"),
								value(1),
								S1_WSAS.pr(S2_SHIPALLOCSTS.ship_alloc_sts_no),
								nullValue()
							),
							decode(
								S1_WSAS.pr("lot_not_cnt"),
								value(1),
								S1_WSAS.pr(S2_SHIPALLOCSTS.ship_loc_cd),
								nullValue()
							),
							decode(
								S1_WSAS.pr("lot_not_cnt"),
								value(1),
								S1_WSAS.pr(S2_SHIPALLOCSTS.ship_str_ln_cd),
								nullValue()
							)
						).view(S0_SAS)
					)
			);
	}
	
	/**
	 * -- MSBBB0020_MST_SHIP_PR_Query_S01
	 */
	static MCQueryPlan MSBBB0020_MST_SHIP_PR_S01() {
		MST_SHIP_PR_R S0_SHIPPR = MST_SHIP_PR_R.create("SHIPPR");
		MSW_SLO_D_KEY_R S0_WSLOD = MSW_SLO_D_KEY_R.create("WSLOD");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBBB0020_MST_SHIP_PR_Query_S01")
					.mainQuery()
					.select(
							S0_SHIPPR.ship_pr_no,
							S0_SHIPPR.slo_d_no
					)
					.from(
							S0_SHIPPR
						.innerJoin(S0_WSLOD).on(S0_SHIPPR.slo_d_no.eq(S0_WSLOD.slo_d_no))
					)
					.orderBy(S0_SHIPPR.ship_pr_no.asc())
					.forUpdate(S0_SHIPPR.ship_pr_no)
			);
	}
}