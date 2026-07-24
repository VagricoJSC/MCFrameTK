package mcframe.serverMSBE.MSBEL1730;

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
	 * -- MSBEL1730_CHECK_IV_SHIP_Query_S04
	 */
	static MCQueryPlan MSBEL1730_CHECK_IV_SHIP_S04() {
		MST_SHIP_SCHD_R S0_T1 = MST_SHIP_SCHD_R.create("T1");
		MST_SHIP_PR_R S0_T2 = MST_SHIP_PR_R.create("T2");
		MST_SLO_D_R S0_T3 = MST_SLO_D_R.create("T3");
		MST_SLO_R S0_T4 = MST_SLO_R.create("T4");
		MST_SLS_SCHD_R S1_TX1 = MST_SLS_SCHD_R.create("TX1");
		MST_PURC_SCHD_R S1_TX2 = MST_PURC_SCHD_R.create("TX2");
		MST_ARR_PR_R S1_TX3 = MST_ARR_PR_R.create("TX3");
		MST_PO_D_R S1_TX4 = MST_PO_D_R.create("TX4");
		MST_PO_R S1_TX5 = MST_PO_R.create("TX5");
		MAM_BP_R S1_TX6 = MAM_BP_R.create("TX6");
		MSW_SHIP_SCHD_KEY_R S2_T1W = MSW_SHIP_SCHD_KEY_R.create("T1W");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBEL1730_CHECK_IV_SHIP_Query_S04")
					.mainQuery()
					.select(S0_T1.ship_schd_no)
					.from(
						S0_T1
						.innerJoin(S0_T2).on(
							bracket(
								S0_T1.ship_pr_no.eq(S0_T2.ship_pr_no)
							)
						)
						.innerJoin(S0_T3).on(
							bracket(
								S0_T3.slo_d_no.eq(S0_T2.slo_d_no)
							)
						)
						.innerJoin(S0_T4).on(
							bracket(
								S0_T4.slo_no.eq(S0_T3.slo_no)
							)
						)
					)
					.where(
						value(0).eq(value(0))
						.and(S0_T4.iv_no.eq(bind("iv_no")))
						.and(S0_T1.base_unit_qty.subtract(S0_T1.abort_qty).subtract(S0_T1.iv_schd_qty).subtract(S0_T1.ship_ret_qty).gt(value(0)))
						.and(
							S0_T2.purc_ddlv_flg.eq(value(false))
							.or(
								exists(
									subQuery()
									.select(value("X"))
									.from(
										S1_TX1
										.innerJoin(S1_TX2).on(
											bracket(
												S1_TX1.purc_schd_no.eq(S1_TX2.purc_schd_no)
											)
										)
										.innerJoin(S1_TX3).on(
											bracket(
												S1_TX2.arr_pr_no.eq(S1_TX3.arr_pr_no)
											)
										)
										.innerJoin(S1_TX4).on(
											bracket(
												S1_TX3.po_d_no.eq(S1_TX4.po_d_no)
											)
										)
										.innerJoin(S1_TX5).on(
											bracket(
												S1_TX4.po_no.eq(S1_TX5.po_no)
											)
										)
										.leftOuterJoin(S1_TX6).on(
											bracket(
												S1_TX5.sppl_cd.eq(S1_TX6.bp_cd)
											)
										)
									)
									.where(
										value(0).eq(value(0))
										.and(S0_T1.ship_schd_no.eq(S1_TX1.ship_schd_no))
										.and(S1_TX1.cmpl_flg.eq(value(false)))
										.and(S1_TX1.purc_schd_no.isNotNull())
										.and(S1_TX4.rqst_can_flg.eq(value(false)))
										.and(S1_TX6.sppl_iv_flg.eq(value(false)))
									)
								)
							)
						)
						.and(
							not(
								exists(
									subQuery()
									.select(value("X"))
									.from(S2_T1W)
									.where(
										S2_T1W.ship_schd_no.eq(S0_T1.ship_schd_no)
									)
								)
							)
						)
					)
			);
	}
	
	/**
	 * -- MSBEL1730_MST_IV_Query_S01
	 */
	static MCQueryPlan MSBEL1730_MST_IV_S01() {
		MST_IV_R S0_T1 = MST_IV_R.create("T1");
		MST_IV_D_R S0_T2 = MST_IV_D_R.create("T2");
		MST_SHIP_PR_R S0_T3 = MST_SHIP_PR_R.create("T3");
		MST_SLS_SCHD_R S0_T5 = MST_SLS_SCHD_R.create("T5");
		MST_SLO_R S0_T6 = MST_SLO_R.create("T6");
		MST_SLO_D_R S0_T7 = MST_SLO_D_R.create("T7");
		MST_IV_MAP_R S0_T8 = MST_IV_MAP_R.create("T8");
		MST_SHIP_SCHD_R S0_T9 = MST_SHIP_SCHD_R.create("T9");
		MST_SHIP_SCHD_R S0_T10 = MST_SHIP_SCHD_R.create("T10");
		MST_XFR_SCHD_R S0_T11 = MST_XFR_SCHD_R.create("T11");
		MST_IV_SHIP_INST_MAP_R S0_T12 = MST_IV_SHIP_INST_MAP_R.create("T12");
		MST_SHIP_INST_D_R S0_T13 = MST_SHIP_INST_D_R.create("T13");
		MST_SHIP_INST_R S0_T14 = MST_SHIP_INST_R.create("T14");
		MST_IV_SHIP_ACT_MAP_R S0_T15 = MST_IV_SHIP_ACT_MAP_R.create("T15");
		MST_SHIP_ACT_D_R S0_T16 = MST_SHIP_ACT_D_R.create("T16");
		MST_SHIP_ACT_R S0_T17 = MST_SHIP_ACT_R.create("T17");
		MAM_CO_R S0_CO = MAM_CO_R.create("CO");
		MAM_BP_R S0_M1 = MAM_BP_R.create("M1");
		MAM_BP_R S0_M3 = MAM_BP_R.create("M3");
		MAM_BP_R S0_M4 = MAM_BP_R.create("M4");
		MAM_CUR_R S0_M11 = MAM_CUR_R.create("M11");
		MAM_ITM_R S0_M13 = MAM_ITM_R.create("M13");
		MAM_DPT_R S0_M19 = MAM_DPT_R.create("M19");
		MAM_DPT_R S0_M21 = MAM_DPT_R.create("M21");
		MAM_DPT_R S0_M22 = MAM_DPT_R.create("M22");
		MAM_CUR_R S0_M24 = MAM_CUR_R.create("M24");
		MAM_LOC_R S0_M26 = MAM_LOC_R.create("M26");
		MAM_SUNDRY_ITM_R S0_M30 = MAM_SUNDRY_ITM_R.create("M30");
		MAM_LOC_R S0_M31 = MAM_LOC_R.create("M31");
		MAM_ITM_LCL_R S0_M32 = MAM_ITM_LCL_R.create("M32");
		MAM_ITM_LG_GRP_R S0_M91 = MAM_ITM_LG_GRP_R.create("M91");
		MAM_LOC_R S0_M92 = MAM_LOC_R.create("M92");
		MAM_BP_R S1 = MAM_BP_R.create();
		MAM_BP_R S2 = MAM_BP_R.create();
		MAM_BP_R S3 = MAM_BP_R.create();
		MCTempView S4_V1 = createTempView("V1");
		MST_IV_SHIP_ACT_MAP_R S4_ST1 = MST_IV_SHIP_ACT_MAP_R.create("ST1");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBEL1730_MST_IV_Query_S01")
					.mainQuery()
					.select(
						value(true).as("existed_flg"),
						nvl2(
							S0_T6.iv_no,
							value(true),
							value(false)
						).as("is_slo_iv_no"),
						S0_T1.iv_mng_no,
						S0_T1.rcpt_iv_mng_no,
						S0_T1.trd_ptn_typ,
						S0_T1.sls_basis_typ,
						S0_T1.prov_basis_typ,
						decode(
							S0_T1.iv_no,
							value(MAC_STR.NULL_VAL.value()),
							nullValue(),
							S0_T1.iv_no
						).as("iv_no"),
						S0_T1.rcpt_iv_no,
						cases()
							.when(S0_T1.rcpt_iv_mng_no.isNotNull().and(S0_T1.iv_rev.eq(value(0))))
								.then(nullValue())
							.otherwise(S0_T1.iv_rev).as("iv_rev"),
						cases()
							.when(S0_T1.rcpt_iv_mng_no.isNotNull().and(S0_T1.iv_rev.eq(value(0))))
								.then(value(false))
							.otherwise(value(true)).as("latest_flg"),
						S0_T1.iv_src_typ,
						S0_T13.ship_inst_d_no,
						S0_T14.ship_inst_no,
						S0_T16.ship_act_d_no,
						S0_T16.dlv_slip_d_no,
						S0_T17.ship_act_no,
						S0_T17.uplnd_flg,
						S0_T1.pl_skip_flg,
						S0_T1.pl_reg_flg,
						S0_T1.cmpl_schd_dt,
						cases()
							.when(S0_T1.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.SLS.value())))
								.then(S0_T1.trd_schd_dt)
							.otherwise(nullValue()).as("sls_schd_dt"),
						cases()
							.when(S0_T1.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.SLS.value())))
								.then(value((MCDate)null))
								.when(S0_T1.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.SHIP.value())))
								.then(value((MCDate)null))
							.otherwise(S0_T1.trd_schd_dt).as("arr_schd_dt"),
						S0_T1.cmpl_dt,
						S0_T1.ac_dt,
						coalesce(
							S0_T1.iv_dt,
							bind("today")
						).as("iv_dt"),
						S0_T1.non_cmpl_flg,
						S0_T1.cmpl_flg,
						S0_T1.iv_ship_flg.as("old_iv_ship_flg"),
						S0_T1.iv_ship_flg,
						S0_T1.iv_prnt_flg,
						S0_T1.dlv_id_typ,
						S0_T1.dlv_id_cd,
						cases()
							.when(S0_T1.dlv_sundry_flg.eq(value(false)))
								.then(
									cases()
										.when(S0_T1.dlv_id_typ.eq(value(MSC_DLV_ID_TYP.DLV.value())))
											.then(S0_M1.bp_nm)
										.otherwise(S0_M31.loc_nm)
							)
							.otherwise(S0_T1.dlv_id_nm).as("dlv_id_nm"),
						S0_T1.dlv_sundry_flg,
						S0_T1.dlv_cntry_cd,
						S0_T1.dlv_zip_cd,
						S0_T1.dlv_addr1,
						S0_T1.dlv_addr2,
						S0_T1.dlv_addr3,
						S0_T1.dlv_addr4,
						S0_T1.dlv_cntct_dpt,
						S0_T1.dlv_cntct_psn,
						S0_T1.dlv_tel,
						S0_T1.dlv_fax,
						S0_T1.ship_rqst_id_typ,
						S0_T1.ship_rqst_id_cd,
						cases()
							.when(S0_T1.ship_rqst_id_typ.eq(value(MSC_SHIP_RQST_ID_TYP.LOC.value())))
								.then(S0_M26.loc_nm)
							.otherwise(S0_M3.bp_nm).as("ship_rqst_id_nm"),
						cases()
							.when(S0_T1.ship_rqst_id_typ.eq(value(MSC_SHIP_RQST_ID_TYP.CST.value())))
								.then(S0_M3.sls_upri_cng_flg)
							.otherwise(value(false)).as("cst_sls_upri_cng_flg"),
						S0_T1.tdlv_cd,
						cases()
							.when(S0_T1.tdlv_sundry_flg.eq(value(false)))
								.then(S0_M4.bp_nm)
							.otherwise(S0_T1.tdlv_nm).as("tdlv_nm"),
						S0_T1.tdlv_sundry_flg,
						S0_T1.via_dlv_typ,
						S0_T1.tdlv_cntct_dpt,
						S0_T1.tdlv_cntct_psn,
						S0_T1.tdlv_zip_cd,
						S0_T1.tdlv_addr1,
						S0_T1.tdlv_addr2,
						S0_T1.tdlv_addr3,
						S0_T1.tdlv_addr4,
						S0_T1.tdlv_tel,
						S0_T1.tdlv_fax,
						S0_T1.tdlv_lg_grp_cd,
						S0_T1.trnspt_cd,
						S0_T1.vssl_flght,
						S0_T1.load_port_cd,
						S0_T1.etd_dt,
						S0_T1.dschrg_port_cd,
						S0_T1.eta_dt,
						S0_T1.via_port_cd,
						S0_T1.via_schd_dt,
						S0_T1.tterm_cd1,
						S0_T1.tterm_rmrks1,
						S0_T1.tterm_cd2,
						S0_T1.tterm_rmrks2,
						S0_T1.trd_cur_cd,
						S0_M11.cur_nm.as("trd_cur_nm"),
						S0_M11.upri_dec_place.as("trd_cur_upri_dec_place"),
						S0_M11.amt_dec_place.as("trd_cur_amt_dec_place"),
						nvl(
							decode(
								S0_T1.trd_ptn_typ,
								value(MAC_TRD_PTN_TYP.SLS.value()),
								S0_M3.sls_amt_rnd_typ,
								value(MAC_TRD_PTN_TYP.PROV.value()),
								S0_M3.prov_amt_rnd_typ,
								value(MAC_RND_TYP.RNDOFF.value())
							),
							value(MAC_RND_TYP.RNDOFF.value())
						).as("trd_amt_rnd_typ"),
						nvl(
							decode(
								S0_T1.trd_ptn_typ,
								value(MAC_TRD_PTN_TYP.SLS.value()),
								S0_M3.sls_tax_rnd_typ,
								value(MAC_TRD_PTN_TYP.PROV.value()),
								S0_M3.prov_tax_rnd_typ,
								value(MAC_RND_TYP.RNDOFF.value())
							),
							value(MAC_RND_TYP.RNDOFF.value())
						).as("trd_tax_rnd_typ"),
						S0_T1.ptax_cur_cd,
						S0_M24.amt_dec_place.as("ptax_cur_amt_dec_place"),
						S0_T1.xrate_inpt_flg,
						cases()
							.when(
								S0_T1.pre_rcpt_iv_flg.eq(value(true))
								.and(S0_T1.xrate_inpt_flg.eq(value(false)))
							)
								.then(
									MAPA_XCHNG$F_GET_SLS_XRATE(
										S0_T1.trd_cur_cd,
										bind("today")
									)
							)
							.otherwise(S0_T1.xrate).as("xrate"),
						S0_T1.ptax_xrate_inpt_flg,
						cases()
							.when(
								S0_T1.pre_rcpt_iv_flg.eq(value(true))
								.and(S0_T1.ptax_xrate_inpt_flg.eq(value(false)))
								.and(S0_CO.ptax_cur_cd.isNotNull())
							)
								.then(
									MAPA_XCHNG$F_GET_XRATE(
										S0_T1.trd_cur_cd,
										S0_CO.ptax_cur_cd,
										S0_CO.sls_xrate_cd,
										bind("today")
									)
							)
							.otherwise(S0_T1.ptax_xrate).as("ptax_xrate"),
						S0_T1.tterm_cd3,
						S0_T1.tterm_rmrks3,
						S0_T1.bill_basis_dt,
						S0_T1.rcv_schd_dt,
						S0_T1.lc_no,
						S0_T1.lc_dt,
						S0_T1.lc_rmrks,
						S0_T1.bl_no,
						S0_T1.bl_dt,
						S0_T1.bl_rmrks,
						S0_T1.iv_rmrks,
						S0_T1.case_mrk1,
						S0_T1.case_mrk2,
						S0_T1.case_mrk3,
						S0_T1.case_mrk4,
						S0_T1.case_mrk5,
						S0_T1.case_mrk6,
						S0_T1.pre_rcpt_iv_flg,
						S0_T1.intr_rmrks,
						S0_T1.sub_char1,
						S0_T1.sub_char2,
						S0_T1.sub_char3,
						S0_T1.upd_cntr.as("iv_upd_cntr"),
						bracket(
							subQuery()
							.select(S1.bill_cl_typ)
							.from(S1)
							.where(
								value(0).eq(value(0))
								.and(
									S1.bp_cd.eq(subQuery()
										.select(S2.bcst_cd)
										.from(S2)
										.where(
											value(0).eq(value(0))
											.and(
												S2.bp_cd.eq(subQuery()
													.select(S3.acst_cd)
													.from(S3)
													.where(
														value(0).eq(value(0))
														.and(S3.bp_cd.eq(S0_T1.ship_rqst_id_cd))
														.and(S3.cst_flg.eq(value(true)))
														.and(S3.acst_cd.isNotNull())
													)
												)
											)
											.and(S2.acst_flg.eq(value(true)))
											.and(S2.bcst_cd.isNotNull())
										)
									)
								)
							)
						).as("bill_cl_typ"),
						S0_T2.iv_d_no,
						S0_T2.trd_cd,
						S0_T2.bndl_flg,
						S0_T2.itm_cd,
						S0_T2.itm_sub1,
						S0_T2.itm_sub2,
						S0_T2.itm_sub3,
						cases()
							.when(S0_T2.sundry_itm_flg.eq(value(true)))
								.then(
									nvl(
										S0_T2.itm_nm,
										S0_M30.itm_nm
									)
							)
							.otherwise(S0_M13.itm_nm).as("itm_nm"),
						S0_M13.sls_upri_cng_flg,
						S0_M13.stk_mng_typ,
						S0_M13.asset_mng_typ,
						S0_T2.sundry_itm_flg,
						S0_M13.sno1_mng_typ,
						S0_M13.sno2_mng_typ,
						S0_M13.sno3_mng_typ,
						S0_M13.sno4_mng_typ,
						S0_M13.dscnt_itm_flg,
						S0_M13.exim_xpns_typ,
						cases()
							.when(S0_T2.sundry_itm_flg.eq(value(true)))
								.then(
									nvl(
										S0_T2.iv_itm_nm,
										S0_M30.itm_nm
									)
							)
							.otherwise(
								nvl(
									S0_M32.itm_nm,
									S0_M13.itm_nm
								)
							).as("iv_itm_nm"),
						S0_T2.cntry_org_cd,
						S0_T2.trd_unit_cd,
						S0_T2.trd_unit_qty,
						cases()
							.when(S0_T17.uplnd_flg.eq(value(true)))
								.then(S0_T16.base_unit_qty.subtract(S0_T16.ship_ret_qty).subtract(nvl(S4_V1.pr("iv_qty"), value(0))).add(S0_T2.base_unit_qty))
							.otherwise(
								bracket(
										nvl(
											decode(S0_T1.iv_src_typ, value(MSC_IV_SRC_TYP.SHIP_INST.value()), S0_T9.ship_inst_qty, value(MSC_IV_SRC_TYP.SHIP_ACT.value()), S0_T9.ship_act_qty, S0_T9.base_unit_qty),
											value(0)
										).subtract(nvl(
												decode(S0_T1.iv_src_typ, value(MSC_IV_SRC_TYP.SHIP_ACT.value()), value(0), S0_T9.abort_qty),
												value(0)
											)).subtract(nvl(
													decode(S0_T1.iv_src_typ, value(MSC_IV_SRC_TYP.SHIP_INST.value()), least(S0_T9.ship_inst_qty, S0_T9.iv_schd_qty), value(MSC_IV_SRC_TYP.SHIP_ACT.value()), least(S0_T9.ship_act_qty, S0_T9.iv_schd_qty), least(S0_T9.base_unit_qty, S0_T9.iv_schd_qty)),
													value(0)
												)).subtract(nvl(
														S0_T9.ship_ret_qty,
														value(0)
													)).add(S0_T2.base_unit_qty)
									)
							).as("max_base_unit_qty"),
						S0_T2.base_unit_cd,
						S0_M13.dec_place.as("base_unit_dec_place"),
						S0_M13.rnd_typ.as("base_unit_rnd_typ"),
						S0_T2.base_unit_qty,
						S0_T2.gd_cd,
						S0_T2.trd_cur_upri,
						decode(S0_T1.pre_rcpt_iv_flg, value(true), S0_T7.upri_not_tgt_flg, S0_T2.upri_not_tgt_flg).as("upri_not_tgt_flg"),
						decode(S0_T1.pre_rcpt_iv_flg, value(true), S0_T7.interim_flg, S0_T2.interim_flg).as("interim_flg"),
						decode(
							S0_T3.trd_ptn_typ,
							value(MAC_TRD_PTN_TYP.SLS.value()),
							S0_T7.trd_cur_upri,
							value(MAC_TRD_PTN_TYP.PROV.value()),
							S0_T11.trd_cur_upri,
							nullValue()
						).as("schd_trd_cur_upri"),
						decode(
							S0_T3.trd_ptn_typ,
							value(MAC_TRD_PTN_TYP.SLS.value()),
							S0_T7.trd_unit_cd,
							value(MAC_TRD_PTN_TYP.PROV.value()),
							S0_T11.trd_unit_cd,
							nullValue()
						).as("schd_trd_unit_cd"),
						decode(
							S0_T3.trd_ptn_typ,
							value(MAC_TRD_PTN_TYP.SLS.value()),
							S0_T7.trd_unit_qty,
							value(MAC_TRD_PTN_TYP.PROV.value()),
							S0_T11.trd_unit_qty,
							nullValue()
						).as("schd_trd_unit_qty"),
						decode(
							S0_T3.trd_ptn_typ,
							value(MAC_TRD_PTN_TYP.SLS.value()),
							S0_T7.iv_amt,
							value(MAC_TRD_PTN_TYP.PROV.value()),
							S0_T2.iv_amt,
							nullValue()
						).as("schd_iv_amt"),
						decode(
							S0_T3.trd_ptn_typ,
							value(MAC_TRD_PTN_TYP.SLS.value()),
							S0_T7.trd_cur_amt,
							value(MAC_TRD_PTN_TYP.PROV.value()),
							S0_T2.trd_cur_amt,
							nullValue()
						).as("schd_trd_cur_amt"),
						decode(
							S0_T3.trd_ptn_typ,
							value(MAC_TRD_PTN_TYP.SLS.value()),
							S0_T7.trd_cur_tax_amt,
							value(MAC_TRD_PTN_TYP.PROV.value()),
							S0_T11.trd_cur_tax_amt,
							nullValue()
						).as("schd_trd_cur_tax_amt"),
						coalesce(
							S0_M11.amt_dec_place,
							S0_M24.amt_dec_place
						).as("amt_dec_place"),
						coalesce(
							S0_M11.upri_dec_place,
							S0_M24.upri_dec_place
						).as("upri_dec_place"),
						nvl(
							S0_M3.sls_amt_rnd_typ,
							value(MAC_RND_TYP.RNDOFF.value())
						).as("amt_rnd_typ"),
						nvl(
							S0_M3.sls_tax_rnd_typ,
							value(MAC_RND_TYP.RNDOFF.value())
						).as("tax_rnd_typ"),
						S0_T2.trd_cur_amt,
						S0_T2.trd_cur_amt.add(S0_T2.trd_cur_tax_amt).as("trd_cur_inc_tax_amt"),
						S0_T2.trd_cur_dscnt_amt,
						decode(
							S0_T3.trd_ptn_typ,
							value(MAC_TRD_PTN_TYP.SLS.value()),
							S0_T7.base_unit_qty,
							value(MAC_TRD_PTN_TYP.PROV.value()),
							S0_T11.base_unit_qty,
							nullValue()
						).as("schd_base_unit_qty"),
						S0_T7.trd_cur_dscnt_amt.as("schd_trd_cur_dscnt_amt"),
						S0_T2.iv_upri,
						S0_T2.iv_amt,
						decode(S0_T1.pre_rcpt_iv_flg, value(true), S0_T7.tax_fix_flg, S0_T2.tax_fix_flg).as("tax_fix_flg"),
						S0_T2.tax_cd,
						S0_T2.trd_cur_tax_amt,
						S0_T7.sls_cststk_flg,
						S0_T9.sls_qty,
						S0_T7.dest_cd1,
						S0_T7.dest_cd2,
						S0_T7.dest_cd3,
						S0_T2.cst_po_no,
						S0_T2.cst_po_d_no,
						S0_T2.sno1,
						S0_T2.sno2,
						S0_T2.sno3,
						S0_T2.sno4,
						S0_T9.ship_fr_lg_grp_cd,
						S0_T2.cst_itm_cd,
						S0_T2.cst_itm_nm,
						S0_T2.rsn_cd,
						S0_T2.bd_dpt_cd,
						S0_M19.dpt_nm.as("bd_dpt_nm"),
						S0_T2.sls_usr_cd,
						S0_T2.sls_dpt_cd,
						S0_M21.dpt_nm.as("sls_dpt_nm"),
						S0_T2.dscnt_rsn_cd,
						S0_T2.ar_dpt_cd,
						S0_M22.dpt_nm.as("ar_dpt_nm"),
						S0_T2.iv_d_rmrks,
						S0_T2.trd_rmrks,
						S0_T2.trd_d_rmrks,
						S0_T2.intr_d_rmrks,
						S0_T2.sub_char1.as("dtl_sub_char1"),
						S0_T2.sub_char2.as("dtl_sub_char2"),
						S0_T2.sub_char3.as("dtl_sub_char3"),
						S0_T2.slo_no,
						S0_T2.slo_d_no,
						S0_T2.xfr_schd_no,
						trunc(
							S0_T2.dlv_rqst_tm,
							MCDateFmt.DD
						).as("dlv_rqst_dt"),
						S0_T2.dlv_rqst_tm.as("dlv_rqst_hm"),
						S0_T2.disp_seq,
						S0_T2.ptax_cur_amt,
						S0_T2.wtax_rate,
						S0_T2.wtax_amt,
						S0_T2.manual_add_flg,
						S0_T2.purc_schd_no,
						S0_T3.purc_ddlv_flg,
						S0_T3.ship_pr_no,
						nvl(
							S0_T3.upd_cntr,
							value(-1)
						).as("ship_pr_upd_cntr"),
						S0_T3.ship_inst_typ,
						nvl(
							S0_T9.ship_schd_no,
							S0_T10.ship_schd_no
						).as("ship_schd_no"),
						S0_T5.purc_act_d_no,
						nvl(
							S0_T9.pr_sts_typ,
							S0_T10.pr_sts_typ
						).as("pr_sts_typ"),
						nvl(
							S0_T9.ship_inst_qty,
							value(0)
						).as("ship_inst_qty"),
						nvl(
							S0_T9.ship_act_qty,
							value(0)
						).as("ship_act_qty"),
						S0_M3.ar_dpt_typ,
						MAPA_BP$F_GET_AR_DPT_CD_NE(
							S0_M3.bp_cd,
							coalesce(
								S0_T1.iv_dt,
								bind("today")
							),
							value(false)
						).as("lnk_ar_dpt_cd"),
						cases()
							.when(S0_T1.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.SLS.value())))
								.then(S0_M1.prnt_lcl_cd)
							.when(S0_T1.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.SHIP.value())))
								.then(S0_M1.prnt_lcl_cd)
							.otherwise(S0_M31.prnt_lcl_cd).as("prnt_lcl_cd"),
						S0_M21.wg_cd.as("sls_dpt_wg_cd"),
						coalesce(
							S0_T11.gi_loc_cd,
							S0_M91.lg_def_loc_cd,
							S0_M92.loc_cd
						).as("chk_gi_loc_cd"),
						S0_T1.ins_usr_id,
						S0_T1.ins_usr_nm,
						S0_T1.ins_func_id,
						nullValue().as("ins_func_nm"),
						S0_T1.ins_ts,
						S0_T1.upd_usr_id,
						S0_T1.upd_usr_nm,
						S0_T1.upd_func_id,
						nullValue().as("upd_func_nm"),
						S0_T1.upd_ts,
						S0_T1.upd_srv_req_no
					)
					.from(
						S0_T1
						.innerJoin(S0_T2).on(
							bracket(
								S0_T1.iv_mng_no.eq(S0_T2.iv_mng_no)
							)
						)
						.leftOuterJoin(S0_T3).on(
							bracket(
								bracket(
									S0_T2.slo_d_no.isNotNull()
									.and(S0_T2.slo_d_no.eq(S0_T3.slo_d_no))
								)
								.or(
									S0_T2.xfr_schd_no.isNotNull()
									.and(S0_T2.xfr_schd_no.eq(S0_T3.xfr_schd_no))
								)
							)
						)
						.leftOuterJoin(S0_T5).on(
							bracket(
								S0_T1.pre_rcpt_iv_flg.eq(value(true))
								.and(S0_T2.purc_schd_no.eq(S0_T5.purc_schd_no))
							)
						)
						.leftOuterJoin(S0_T6).on(
							bracket(
								S0_T2.slo_no.eq(S0_T6.slo_no)
							)
						)
						.leftOuterJoin(S0_T7).on(
							bracket(
								S0_T2.slo_d_no.eq(S0_T7.slo_d_no)
							)
						)
						.leftOuterJoin(S0_T8).on(
							bracket(
								S0_T2.iv_d_no.eq(S0_T8.iv_d_no)
							)
						)
						.leftOuterJoin(S0_T9).on(
							bracket(
								S0_T9.ship_schd_no.eq(S0_T8.ship_schd_no)
							)
						)
						.leftOuterJoin(S0_T10).on(
							bracket(
								S0_T1.pre_rcpt_iv_flg.eq(value(true))
								.and(S0_T10.ship_schd_no.eq(S0_T5.ship_schd_no))
							)
						)
						.leftOuterJoin(S0_T11).on(
							bracket(
								S0_T11.xfr_schd_no.eq(S0_T2.xfr_schd_no)
							)
						)
						.leftOuterJoin(S0_T12).on(
								bracket((S0_T1.iv_src_typ.eq(value(MSC_IV_SRC_TYP.SHIP_INST.value())).or(S0_T1.iv_src_typ.eq(value(MSC_IV_SRC_TYP.SHIP_ACT.value())))))
								.and(S0_T8.iv_d_no.eq(S0_T12.iv_d_no).and(S0_T8.ship_schd_no.eq(S0_T12.ship_schd_no))))
						.leftOuterJoin(S0_T13).on(S0_T12.ship_inst_d_no.eq(S0_T13.ship_inst_d_no))
						.leftOuterJoin(S0_T14).on(S0_T13.ship_inst_no.eq(S0_T14.ship_inst_no))
						.leftOuterJoin(S0_T15).on(S0_T1.iv_src_typ.eq(value(MSC_IV_SRC_TYP.SHIP_ACT.value()))
							.and(
								bracket(
									S0_T8.iv_d_no.eq(S0_T15.iv_d_no).and(S0_T8.ship_schd_no.eq(S0_T15.ship_schd_no))
									.or(
										bracket(
											S0_T2.iv_d_no.eq(S0_T15.iv_d_no).and(S0_T15.ship_schd_no.eq(value(MAC_STR.NULL_VAL.value())))
										)
									)
								)
							)
						)
						.leftOuterJoin(S0_T16).on(S0_T15.ship_act_d_no.eq(S0_T16.ship_act_d_no))
						.leftOuterJoin(S0_T17).on(S0_T16.ship_act_no.eq(S0_T17.ship_act_no))
						.leftOuterJoin(subQuery()
								.select(
									S4_ST1.ship_act_d_no,
									sum(S4_ST1.base_unit_qty).as("iv_qty")
								).from(S4_ST1)
								.groupBy(S4_ST1.ship_act_d_no)
								.view(S4_V1)).on(S0_T16.ship_act_d_no.eq(S4_V1.pr(S4_ST1.ship_act_d_no)))
						.crossJoin(S0_CO)
						.leftOuterJoin(S0_M1).on(
							bracket(
								S0_T1.dlv_id_cd.eq(S0_M1.bp_cd)
							)
						)
						.leftOuterJoin(S0_M3).on(
							bracket(
								S0_T1.ship_rqst_id_cd.eq(S0_M3.bp_cd)
							)
						)
						.leftOuterJoin(S0_M4).on(
							bracket(
								S0_T1.tdlv_cd.eq(S0_M4.bp_cd)
							)
						)
						.leftOuterJoin(S0_M11).on(
							bracket(
								S0_T1.trd_cur_cd.eq(S0_M11.cur_cd)
							)
						)
						.leftOuterJoin(S0_M13).on(
							bracket(
								S0_T2.itm_cd.eq(S0_M13.itm_cd)
								.and(S0_T2.itm_sub1.eq(S0_M13.itm_sub1))
								.and(S0_T2.itm_sub2.eq(S0_M13.itm_sub2))
								.and(S0_T2.itm_sub3.eq(S0_M13.itm_sub3))
							)
						)
						.leftOuterJoin(S0_M19).on(
							bracket(
								S0_T2.bd_dpt_cd.eq(S0_M19.dpt_cd)
								.and(
									coalesce(
										S0_T6.slo_dt,
										S0_T11.rcpt_dt,
										S0_T1.iv_dt
									).between(S0_M19.st_dt, S0_M19.end_dt)
								)
							)
						)
						.leftOuterJoin(S0_M21).on(
							bracket(
								S0_T2.sls_dpt_cd.eq(S0_M21.dpt_cd)
								.and(
									coalesce(
										S0_T6.slo_dt,
										S0_T1.iv_dt
									).between(S0_M21.st_dt, S0_M21.end_dt)
								)
							)
						)
						.leftOuterJoin(S0_M22).on(
							bracket(
								S0_T2.ar_dpt_cd.eq(S0_M22.dpt_cd)
								.and(
									coalesce(
										S0_T6.slo_dt,
										S0_T1.iv_dt
									).between(S0_M22.st_dt, S0_M22.end_dt)
								)
							)
						)
						.leftOuterJoin(S0_M24).on(
							bracket(
								S0_T1.ptax_cur_cd.eq(S0_M24.cur_cd)
							)
						)
						.leftOuterJoin(S0_M26).on(
							bracket(
								S0_T1.ship_rqst_id_cd.eq(S0_M26.loc_cd)
							)
						)
						.leftOuterJoin(S0_M30).on(
							bracket(
								S0_T2.itm_cd.eq(S0_M30.itm_cd)
								.and(S0_T2.itm_sub1.eq(S0_M30.itm_sub1))
								.and(S0_T2.itm_sub2.eq(S0_M30.itm_sub2))
								.and(S0_T2.itm_sub3.eq(S0_M30.itm_sub3))
								.and(S0_T2.sno1.eq(S0_M30.sno1))
								.and(S0_T2.sno2.eq(S0_M30.sno2))
								.and(S0_T2.sno3.eq(S0_M30.sno3))
								.and(S0_T2.sno4.eq(S0_M30.sno4))
							)
						)
						.leftOuterJoin(S0_M31).on(
							bracket(
								S0_T1.dlv_id_cd.eq(S0_M31.loc_cd)
							)
						)
						.leftOuterJoin(S0_M32).on(
							bracket(
								S0_T2.itm_cd.eq(S0_M32.itm_cd)
								.and(S0_T2.itm_sub1.eq(S0_M32.itm_sub1))
								.and(S0_T2.itm_sub2.eq(S0_M32.itm_sub2))
								.and(S0_T2.itm_sub3.eq(S0_M32.itm_sub3))
								.and(
									bracket(
										S0_T1.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.SLS.value()))
										.and(S0_M1.prnt_lcl_cd.eq(S0_M32.lcl_cd))
									)
									.or(
										S0_T1.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.SHIP.value()))
										.and(S0_M1.prnt_lcl_cd.eq(S0_M32.lcl_cd))
									)
									.or(
										S0_T1.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.PROV.value()))
										.and(S0_M31.prnt_lcl_cd.eq(S0_M32.lcl_cd))
									)
									.or(
										S0_T1.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.XFR.value()))
										.and(S0_M31.prnt_lcl_cd.eq(S0_M32.lcl_cd))
									)
									.or(
										S0_T1.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.XFR_RTN.value()))
										.and(S0_M31.prnt_lcl_cd.eq(S0_M32.lcl_cd))
									)
								)
							)
						)
						.leftOuterJoin(S0_M91).on(
							bracket(
								S0_T11.itm_cd.eq(S0_M91.itm_cd)
								.and(S0_T11.itm_sub1.eq(S0_M91.itm_sub1))
								.and(S0_T11.itm_sub2.eq(S0_M91.itm_sub2))
								.and(S0_T11.itm_sub3.eq(S0_M91.itm_sub3))
								.and(S0_T11.gi_lg_grp_cd.eq(S0_M91.lg_grp_cd))
							)
						)
						.leftOuterJoin(S0_M92).on(
							bracket(
								S0_T11.gi_lg_grp_cd.eq(S0_M92.lg_grp_cd)
								.and(S0_M92.lg_def_flg.eq(value(true)))
								.and(S0_M92.del_flg.eq(value(false)))
							)
						)
					)
					.where(
						value(0).eq(value(0))
						.cutoff$and(
							S0_T1.rcpt_iv_mng_no.eq(bind("rcpt_iv_mng_no"))
							.and(S0_T1.pre_rcpt_iv_flg.eq(value(true)))
						)
						.cutoff$and(
							S0_T1.rcpt_iv_no.eq(bind("rcpt_iv_no"))
							.and(S0_T1.pre_rcpt_iv_flg.eq(value(true)))
						)
						.cutoff$and(
							S0_T1.iv_no.eq(bind("iv_no"))
							.and(S0_T1.pre_rcpt_iv_flg.neq(value(true)))
						)
					)
			)
			.setJoinInfo(
				joinInfo(
					j -> j
						.add(MSVT_WRK_SNO_R.class, r -> toCondition(
							r.getStringNE("sno1")
						))
						.addSelect(m -> toArray(
							m.wrk_nm,
							m.wrk_no
						))
						.addMap((r, m) -> {
							r.setStringNE("wrk_no", m.wrk_no());
							r.setStringNE("wrk_nm", m.wrk_nm());
					}),
					j -> j
						.add(MAM_CNTRY_R.class, r -> toCondition(
							r.getStringNE("dlv_cntry_cd")
						))
						.addSelect(m -> toArray(
							m.cntry_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("dlv_cntry_nm", m.cntry_nm());
					}),
					j -> j
						.add(MAM_TRNSPT_R.class, r -> toCondition(
							r.getStringNE("trnspt_cd")
						))
						.addSelect(m -> toArray(
							m.trnspt_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("trnspt_nm", m.trnspt_nm());
					}),
					j -> j
						.add(MAM_EXIM_PORT_R.class, r -> toCondition(
							r.getStringNE("load_port_cd")
						))
						.addSelect(m -> toArray(
							m.port_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("load_port_nm", m.port_nm());
					}),
					j -> j
						.add(MAM_EXIM_PORT_R.class, r -> toCondition(
							r.getStringNE("dschrg_port_cd")
						))
						.addSelect(m -> toArray(
							m.port_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("dschrg_port_nm", m.port_nm());
					}),
					j -> j
						.add(MAM_EXIM_PORT_R.class, r -> toCondition(
							r.getStringNE("via_port_cd")
						))
						.addSelect(m -> toArray(
							m.port_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("via_port_nm", m.port_nm());
					}),
					j -> j
						.add(MAM_TTERM_R.class, r -> toCondition(
							r.getStringNE("tterm_cd1")
						))
						.addSelect(m -> toArray(
							m.tterm_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("tterm_nm1", m.tterm_nm());
					}),
					j -> j
						.add(MAM_TTERM_R.class, r -> toCondition(
							r.getStringNE("tterm_cd2")
						))
						.addSelect(m -> toArray(
							m.tterm_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("tterm_nm2", m.tterm_nm());
					}),
					j -> j
						.add(MAM_TTERM_R.class, r -> toCondition(
							r.getStringNE("tterm_cd3")
						))
						.addSelect(m -> toArray(
							m.tterm_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("tterm_nm3", m.tterm_nm());
					}),
					j -> j
						.add(MAM_CNTRY_R.class, r -> toCondition(
							r.getStringNE("cntry_org_cd")
						))
						.addSelect(m -> toArray(
							m.cntry_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("cntry_org_nm", m.cntry_nm());
					}),
					j -> j
						.add(MAM_UNIT_R.class, r -> toCondition(
							r.getStringNE("trd_unit_cd")
						))
						.addSelect(m -> toArray(
							m.unit_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("trd_unit_nm", m.unit_nm());
					}),
					j -> j
						.add(MAM_UNIT_R.class, r -> toCondition(
							r.getStringNE("base_unit_cd")
						))
						.addSelect(m -> toArray(
							m.unit_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("base_unit_nm", m.unit_nm());
					}),
					j -> j
						.add(MAM_STK_GD_R.class, r -> toCondition(
							r.getStringNE("gd_cd")
						))
						.addSelect(m -> toArray(
							m.gd_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("gd_nm", m.gd_nm());
					}),
					j -> j
						.add(MAM_TAX_R.class, r -> toCondition(
							r.getStringNE("tax_cd")
						))
						.addSelect(m -> toArray(
							m.inc_tax_flg,
							m.tax_nm,
							m.tax_rate
						))
						.addMap((r, m) -> {
							r.setStringNE("tax_nm", m.tax_nm());
							r.setNumberNE("tax_rate", m.tax_rate());
							r.setBooleanNE("inc_tax_flg", m.inc_tax_flg());
					}),
					j -> j
						.add(MAM_USR_R.class, r -> toCondition(
							r.getStringNE("sls_usr_cd")
						))
						.addSelect(m -> toArray(
							m.usr_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("sls_usr_nm", m.usr_nm());
					}),
					j -> j
						.add(MAM_BIZ_RSN_R.class, r -> toCondition(
							r.getStringNE("rsn_cd")
						))
						.addSelect(m -> toArray(
							m.biz_rsn_nm,
							m.sls_acxfr_flg
						))
						.addMap((r, m) -> {
							r.setStringNE("rsn_nm", m.biz_rsn_nm());
							r.setBooleanNE("sls_acxfr_flg", m.sls_acxfr_flg());
					}),
					j -> j
						.add(MAM_BIZ_RSN_R.class, r -> toCondition(
							r.getStringNE("dscnt_rsn_cd")
						))
						.addSelect(m -> toArray(
							m.biz_rsn_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("dscnt_rsn_nm", m.biz_rsn_nm());
					}),
					j -> j
						.add(MAM_TRD_R.class, r -> toCondition(
							r.getStringNE("trd_cd")
						))
						.addSelect(m -> toArray(
							m.trd_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("trd_nm", m.trd_nm());
					}),
					j -> j
						.add(MAVM_ITM_UNIT_R.class, r -> toCondition(
							r.getStringNE("itm_cd"),
							r.getStringNE("itm_sub1"),
							r.getStringNE("itm_sub2"),
							r.getStringNE("itm_sub3"),
							r.getStringNE("trd_unit_cd")
						))
						.addSelect(m -> toArray(
							m.conv_base_qty,
							m.conv_qty,
							m.dec_place,
							m.rnd_typ
						))
						.addMap((r, m) -> {
							r.setNumberNE("trd_unit_conv_base_qty", m.conv_base_qty());
							r.setNumberNE("trd_unit_conv_qty", m.conv_qty());
							r.setNumberNE("trd_unit_dec_place", m.dec_place());
							r.setStringNE("trd_unit_rnd_typ", m.rnd_typ());
							r.setNumberNE("schd_trd_unit_conv_base_qty", m.conv_base_qty());
							r.setNumberNE("schd_trd_unit_dec_place", m.dec_place());
							r.setNumberNE("schd_trd_unit_conv_qty", m.conv_qty());
							r.setStringNE("schd_trd_unit_rnd_typ", m.rnd_typ());
					}),
					j -> j
						.add(MAM_LG_GRP_R.class, r -> toCondition(
							r.getStringNE("ship_fr_lg_grp_cd")
						))
						.addSelect(m -> toArray(
							m.lg_grp_nm,
							m.wg_cd
						))
						.addMap((r, m) -> {
							r.setStringNE("ship_fr_lg_grp_nm", m.lg_grp_nm());
							r.setStringNE("lg_grp_wg_cd", m.wg_cd());
					})
				)
			);
	}
	/**
	 * -- MSBEL1730_MST_IV_Query_S02
	 */
	static MCQueryPlan MSBEL1730_MST_IV_S02() {
		MST_IV_P_R S0_IVP = MST_IV_P_R.create("IVP");
		MST_IV_R S0_IV = MST_IV_R.create("IV");
		MST_IV_D_P_R S0_IVDP = MST_IV_D_P_R.create("IVDP");
		MST_SHIP_PR_R S0_SHIPPR = MST_SHIP_PR_R.create("SHIPPR");
		MST_SLS_SCHD_R S0_SLSSCHD = MST_SLS_SCHD_R.create("SLSSCHD");
		MST_SLO_R S0_SLO = MST_SLO_R.create("SLO");
		MST_SLO_D_R S0_SLOD = MST_SLO_D_R.create("SLOD");
		MST_IV_MAP_R S0_IVMAP = MST_IV_MAP_R.create("IVMAP");
		MST_SHIP_SCHD_R S0_SHIPSCHD = MST_SHIP_SCHD_R.create("SHIPSCHD");
		MST_SHIP_SCHD_R S0_PRERCPTSHIPSCHD = MST_SHIP_SCHD_R.create("PRERCPTSHIPSCHD");
		MST_XFR_SCHD_R S0_XFRSCHD = MST_XFR_SCHD_R.create("XFRSCHD");
		MST_IV_SHIP_INST_MAP_R S0_IVSHIPINSTMAP = MST_IV_SHIP_INST_MAP_R.create("IVSHIPINSTMAP");
		MST_SHIP_INST_D_R S0_SHIPINSTD = MST_SHIP_INST_D_R.create("SHIPINSTD");
		MST_SHIP_INST_R S0_SHIPINST = MST_SHIP_INST_R.create("SHIPINST");
		MST_IV_SHIP_ACT_MAP_R S0_IVSHIPACTMAP = MST_IV_SHIP_ACT_MAP_R.create("IVSHIPACTMAP");
		MST_SHIP_ACT_D_R S0_SHIPACTD = MST_SHIP_ACT_D_R.create("SHIPACTD");
		MST_SHIP_ACT_R S0_SHIPACT = MST_SHIP_ACT_R.create("SHIPACT");
		MAM_CO_R S0_CO = MAM_CO_R.create("CO");
		MAM_BP_R S0_DLV = MAM_BP_R.create("DLV");
		MAM_BP_R S0_SHIPRQST = MAM_BP_R.create("SHIPRQST");
		MAM_BP_R S0_TDLV = MAM_BP_R.create("TDLV");
		MAM_CUR_R S0_TRDCUR = MAM_CUR_R.create("TRDCUR");
		MAM_ITM_R S0_ITM = MAM_ITM_R.create("ITM");
		MAM_DPT_R S0_BDDPT = MAM_DPT_R.create("BDDPT");
		MAM_DPT_R S0_SLSDPT = MAM_DPT_R.create("SLSDPT");
		MAM_DPT_R S0_ARDPT = MAM_DPT_R.create("ARDPT");
		MAM_CUR_R S0_PTAXCUR = MAM_CUR_R.create("PTAXCUR");
		MAM_LOC_R S0_SHIPRQSTLOC = MAM_LOC_R.create("SHIPRQSTLOC");
		MAM_SUNDRY_ITM_R S0_SUNDRYITM = MAM_SUNDRY_ITM_R.create("SUNDRYITM");
		MAM_LOC_R S0_DLVLOC = MAM_LOC_R.create("DLVLOC");
		MAM_ITM_LCL_R S0_ITMLCL = MAM_ITM_LCL_R.create("ITMLCL");
		MAM_ITM_LG_GRP_R S0_ITMLGGRP = MAM_ITM_LG_GRP_R.create("ITMLGGRP");
		MAM_LOC_R S0_GILOC = MAM_LOC_R.create("GILOC");
		MAM_BP_R BCST = MAM_BP_R.create();
		MAM_BP_R ACST = MAM_BP_R.create();
		MAM_BP_R CST = MAM_BP_R.create();
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBEL1730_MST_IV_Query_S02")
					.mainQuery()
					.select(
						value(true).as("existed_flg"),
						nvl2(
							S0_SLO.iv_no,
							value(true),
							value(false)
						).as("is_slo_iv_no"),
						S0_IVP.iv_mng_no,
						S0_IVP.rcpt_iv_mng_no,
						S0_IVP.trd_ptn_typ,
						S0_IVP.sls_basis_typ,
						S0_IVP.prov_basis_typ,
						decode(
							S0_IVP.iv_no,
							value(MAC_STR.NULL_VAL.value()),
							nullValue(),
							S0_IVP.iv_no
						).as("iv_no"),
						S0_IVP.rcpt_iv_no,
						S0_IVP.iv_rev,
						cases()
							.when(S0_IVP.iv_rev.eq(bind("latest_iv_rev")))
								.then(value(true))
							.otherwise(value(false)).as("latest_flg"),
						cases()
							.when(S0_IV.iv_mng_no.isNull())
								.then(value(true))
							.otherwise(value(false)).as("can_flg"),
						S0_IVP.iv_src_typ,
						S0_SHIPINSTD.ship_inst_d_no,
						S0_SHIPINST.ship_inst_no,
						S0_SHIPACTD.ship_act_d_no,
						S0_SHIPACTD.dlv_slip_d_no,
						S0_SHIPACT.ship_act_no,
						S0_SHIPACT.uplnd_flg,
						S0_IVP.pl_skip_flg,
						S0_IVP.pl_reg_flg,
						S0_IVP.cmpl_schd_dt,
						cases()
							.when(S0_IVP.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.SLS.value())))
								.then(S0_IVP.trd_schd_dt)
							.otherwise(nullValue()).as("sls_schd_dt"),
						cases()
							.when(S0_IVP.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.SLS.value())))
								.then(value((MCDate)null))
								.when(S0_IVP.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.SHIP.value())))
								.then(value((MCDate)null))
							.otherwise(S0_IVP.trd_schd_dt).as("arr_schd_dt"),
						S0_IVP.cmpl_dt,
						S0_IVP.ac_dt,
						coalesce(
							S0_IVP.iv_dt,
							bind("today")
						).as("iv_dt"),
						S0_IVP.non_cmpl_flg,
						S0_IVP.cmpl_flg,
						S0_IVP.iv_ship_flg.as("old_iv_ship_flg"),
						S0_IVP.iv_ship_flg,
						S0_IVP.iv_prnt_flg,
						S0_IVP.dlv_id_typ,
						S0_IVP.dlv_id_cd,
						cases()
							.when(S0_IVP.dlv_sundry_flg.eq(value(false)))
								.then(
									cases()
										.when(S0_IVP.dlv_id_typ.eq(value(MSC_DLV_ID_TYP.DLV.value())))
											.then(S0_DLV.bp_nm)
										.otherwise(S0_DLVLOC.loc_nm)
							)
							.otherwise(S0_IVP.dlv_id_nm).as("dlv_id_nm"),
						S0_IVP.dlv_sundry_flg,
						S0_IVP.dlv_cntry_cd,
						S0_IVP.dlv_zip_cd,
						S0_IVP.dlv_addr1,
						S0_IVP.dlv_addr2,
						S0_IVP.dlv_addr3,
						S0_IVP.dlv_addr4,
						S0_IVP.dlv_cntct_dpt,
						S0_IVP.dlv_cntct_psn,
						S0_IVP.dlv_tel,
						S0_IVP.dlv_fax,
						S0_IVP.ship_rqst_id_typ,
						S0_IVP.ship_rqst_id_cd,
						cases()
							.when(S0_IVP.ship_rqst_id_typ.eq(value(MSC_SHIP_RQST_ID_TYP.LOC.value())))
								.then(S0_SHIPRQSTLOC.loc_nm)
							.otherwise(S0_SHIPRQST.bp_nm).as("ship_rqst_id_nm"),
						cases()
							.when(S0_IVP.ship_rqst_id_typ.eq(value(MSC_SHIP_RQST_ID_TYP.CST.value())))
								.then(S0_SHIPRQST.sls_upri_cng_flg)
							.otherwise(value(false)).as("cst_sls_upri_cng_flg"),
						S0_IVP.tdlv_cd,
						cases()
							.when(S0_IVP.tdlv_sundry_flg.eq(value(false)))
								.then(S0_TDLV.bp_nm)
							.otherwise(S0_IVP.tdlv_nm).as("tdlv_nm"),
						S0_IVP.tdlv_sundry_flg,
						S0_IVP.via_dlv_typ,
						S0_IVP.tdlv_cntct_dpt,
						S0_IVP.tdlv_cntct_psn,
						S0_IVP.tdlv_zip_cd,
						S0_IVP.tdlv_addr1,
						S0_IVP.tdlv_addr2,
						S0_IVP.tdlv_addr3,
						S0_IVP.tdlv_addr4,
						S0_IVP.tdlv_tel,
						S0_IVP.tdlv_fax,
						S0_IVP.tdlv_lg_grp_cd,
						S0_IVP.trnspt_cd,
						S0_IVP.vssl_flght,
						S0_IVP.load_port_cd,
						S0_IVP.etd_dt,
						S0_IVP.dschrg_port_cd,
						S0_IVP.eta_dt,
						S0_IVP.via_port_cd,
						S0_IVP.via_schd_dt,
						S0_IVP.tterm_cd1,
						S0_IVP.tterm_rmrks1,
						S0_IVP.tterm_cd2,
						S0_IVP.tterm_rmrks2,
						S0_IVP.trd_cur_cd,
						S0_TRDCUR.cur_nm.as("trd_cur_nm"),
						S0_TRDCUR.upri_dec_place.as("trd_cur_upri_dec_place"),
						S0_TRDCUR.amt_dec_place.as("trd_cur_amt_dec_place"),
						nvl(
							decode(
								S0_IVP.trd_ptn_typ,
								value(MAC_TRD_PTN_TYP.SLS.value()),
								S0_SHIPRQST.sls_amt_rnd_typ,
								value(MAC_TRD_PTN_TYP.PROV.value()),
								S0_SHIPRQST.prov_amt_rnd_typ,
								value(MAC_RND_TYP.RNDOFF.value())
							),
							value(MAC_RND_TYP.RNDOFF.value())
						).as("trd_amt_rnd_typ"),
						nvl(
							decode(
								S0_IVP.trd_ptn_typ,
								value(MAC_TRD_PTN_TYP.SLS.value()),
								S0_SHIPRQST.sls_tax_rnd_typ,
								value(MAC_TRD_PTN_TYP.PROV.value()),
								S0_SHIPRQST.prov_tax_rnd_typ,
								value(MAC_RND_TYP.RNDOFF.value())
							),
							value(MAC_RND_TYP.RNDOFF.value())
						).as("trd_tax_rnd_typ"),
						S0_IVP.ptax_cur_cd,
						S0_PTAXCUR.amt_dec_place.as("ptax_cur_amt_dec_place"),
						S0_IVP.xrate_inpt_flg,
						cases()
							.when(
								S0_IVP.pre_rcpt_iv_flg.eq(value(true))
								.and(S0_IVP.xrate_inpt_flg.eq(value(false)))
							)
								.then(
									MAPA_XCHNG$F_GET_SLS_XRATE(
										S0_IVP.trd_cur_cd,
										bind("today")
									)
							)
							.otherwise(S0_IVP.xrate).as("xrate"),
						S0_IVP.ptax_xrate_inpt_flg,
						cases()
							.when(
								S0_IVP.pre_rcpt_iv_flg.eq(value(true))
								.and(S0_IVP.ptax_xrate_inpt_flg.eq(value(false)))
								.and(S0_CO.ptax_cur_cd.isNotNull())
							)
								.then(
									MAPA_XCHNG$F_GET_XRATE(
										S0_IVP.trd_cur_cd,
										S0_CO.ptax_cur_cd,
										S0_CO.sls_xrate_cd,
										bind("today")
									)
							)
							.otherwise(S0_IVP.ptax_xrate).as("ptax_xrate"),
						S0_IVP.tterm_cd3,
						S0_IVP.tterm_rmrks3,
						S0_IVP.bill_basis_dt,
						S0_IVP.rcv_schd_dt,
						S0_IVP.lc_no,
						S0_IVP.lc_dt,
						S0_IVP.lc_rmrks,
						S0_IVP.bl_no,
						S0_IVP.bl_dt,
						S0_IVP.bl_rmrks,
						S0_IVP.iv_rmrks,
						S0_IVP.case_mrk1,
						S0_IVP.case_mrk2,
						S0_IVP.case_mrk3,
						S0_IVP.case_mrk4,
						S0_IVP.case_mrk5,
						S0_IVP.case_mrk6,
						S0_IVP.pre_rcpt_iv_flg,
						S0_IVP.intr_rmrks,
						S0_IVP.sub_char1,
						S0_IVP.sub_char2,
						S0_IVP.sub_char3,
						S0_IVP.upd_cntr.as("iv_upd_cntr"),
						bracket(
							subQuery()
							.select(BCST.bill_cl_typ)
							.from(BCST)
							.where(
								value(0).eq(value(0))
								.and(
									BCST.bp_cd.eq(subQuery()
										.select(ACST.bcst_cd)
										.from(ACST)
										.where(
											value(0).eq(value(0))
											.and(
												ACST.bp_cd.eq(subQuery()
													.select(CST.acst_cd)
													.from(CST)
													.where(
														value(0).eq(value(0))
														.and(CST.bp_cd.eq(S0_IVP.ship_rqst_id_cd))
														.and(CST.cst_flg.eq(value(true)))
														.and(CST.acst_cd.isNotNull())
													)
												)
											)
											.and(ACST.acst_flg.eq(value(true)))
											.and(ACST.bcst_cd.isNotNull())
										)
									)
								)
							)
						).as("bill_cl_typ"),
						S0_IVDP.iv_d_no,
						S0_IVDP.trd_cd,
						S0_IVDP.bndl_flg,
						S0_IVDP.itm_cd,
						S0_IVDP.itm_sub1,
						S0_IVDP.itm_sub2,
						S0_IVDP.itm_sub3,
						cases()
							.when(S0_IVDP.sundry_itm_flg.eq(value(true)))
								.then(
									nvl(
										S0_IVDP.itm_nm,
										S0_SUNDRYITM.itm_nm
									)
							)
							.otherwise(S0_ITM.itm_nm).as("itm_nm"),
						S0_ITM.sls_upri_cng_flg,
						S0_ITM.stk_mng_typ,
						S0_ITM.asset_mng_typ,
						S0_IVDP.sundry_itm_flg,
						S0_ITM.sno1_mng_typ,
						S0_ITM.sno2_mng_typ,
						S0_ITM.sno3_mng_typ,
						S0_ITM.sno4_mng_typ,
						S0_ITM.dscnt_itm_flg,
						S0_ITM.exim_xpns_typ,
						cases()
							.when(S0_IVDP.sundry_itm_flg.eq(value(true)))
								.then(
									nvl(
										S0_IVDP.iv_itm_nm,
										S0_SUNDRYITM.itm_nm
									)
							)
							.otherwise(
								nvl(
									S0_ITMLCL.itm_nm,
									S0_ITM.itm_nm
								)
							).as("iv_itm_nm"),
						S0_IVDP.cntry_org_cd,
						S0_IVDP.trd_unit_cd,
						S0_IVDP.trd_unit_qty,
						S0_IVDP.base_unit_qty.as("max_base_unit_qty"),
						S0_IVDP.base_unit_cd,
						S0_ITM.dec_place.as("base_unit_dec_place"),
						S0_ITM.rnd_typ.as("base_unit_rnd_typ"),
						S0_IVDP.base_unit_qty,
						S0_IVDP.gd_cd,
						S0_IVDP.trd_cur_upri,
						S0_IVDP.upri_not_tgt_flg,
						S0_IVDP.interim_flg,
						decode(
							S0_SHIPPR.trd_ptn_typ,
							value(MAC_TRD_PTN_TYP.SLS.value()),
							S0_SLOD.trd_cur_upri,
							value(MAC_TRD_PTN_TYP.PROV.value()),
							S0_XFRSCHD.trd_cur_upri,
							nullValue()
						).as("schd_trd_cur_upri"),
						decode(
							S0_SHIPPR.trd_ptn_typ,
							value(MAC_TRD_PTN_TYP.SLS.value()),
							S0_SLOD.trd_unit_cd,
							value(MAC_TRD_PTN_TYP.PROV.value()),
							S0_XFRSCHD.trd_unit_cd,
							nullValue()
						).as("schd_trd_unit_cd"),
						decode(
							S0_SHIPPR.trd_ptn_typ,
							value(MAC_TRD_PTN_TYP.SLS.value()),
							S0_SLOD.trd_unit_qty,
							value(MAC_TRD_PTN_TYP.PROV.value()),
							S0_XFRSCHD.trd_unit_qty,
							nullValue()
						).as("schd_trd_unit_qty"),
						decode(
							S0_SHIPPR.trd_ptn_typ,
							value(MAC_TRD_PTN_TYP.SLS.value()),
							S0_SLOD.iv_amt,
							value(MAC_TRD_PTN_TYP.PROV.value()),
							S0_IVDP.iv_amt,
							nullValue()
						).as("schd_iv_amt"),
						decode(
							S0_SHIPPR.trd_ptn_typ,
							value(MAC_TRD_PTN_TYP.SLS.value()),
							S0_SLOD.trd_cur_amt,
							value(MAC_TRD_PTN_TYP.PROV.value()),
							S0_IVDP.trd_cur_amt,
							nullValue()
						).as("schd_trd_cur_amt"),
						decode(
							S0_SHIPPR.trd_ptn_typ,
							value(MAC_TRD_PTN_TYP.SLS.value()),
							S0_SLOD.trd_cur_tax_amt,
							value(MAC_TRD_PTN_TYP.PROV.value()),
							S0_XFRSCHD.trd_cur_tax_amt,
							nullValue()
						).as("schd_trd_cur_tax_amt"),
						coalesce(
							S0_TRDCUR.amt_dec_place,
							S0_PTAXCUR.amt_dec_place
						).as("amt_dec_place"),
						coalesce(
							S0_TRDCUR.upri_dec_place,
							S0_PTAXCUR.upri_dec_place
						).as("upri_dec_place"),
						nvl(
							S0_SHIPRQST.sls_amt_rnd_typ,
							value(MAC_RND_TYP.RNDOFF.value())
						).as("amt_rnd_typ"),
						nvl(
							S0_SHIPRQST.sls_tax_rnd_typ,
							value(MAC_RND_TYP.RNDOFF.value())
						).as("tax_rnd_typ"),
						S0_IVDP.trd_cur_amt,
						S0_IVDP.trd_cur_amt.add(S0_IVDP.trd_cur_tax_amt).as("trd_cur_inc_tax_amt"),
						S0_IVDP.trd_cur_dscnt_amt,
						decode(
							S0_SHIPPR.trd_ptn_typ,
							value(MAC_TRD_PTN_TYP.SLS.value()),
							S0_SLOD.base_unit_qty,
							value(MAC_TRD_PTN_TYP.PROV.value()),
							S0_XFRSCHD.base_unit_qty,
							nullValue()
						).as("schd_base_unit_qty"),
						S0_SLOD.trd_cur_dscnt_amt.as("schd_trd_cur_dscnt_amt"),
						S0_IVDP.iv_upri,
						S0_IVDP.iv_amt,
						S0_IVDP.tax_fix_flg,
						S0_IVDP.tax_cd,
						S0_IVDP.trd_cur_tax_amt,
						S0_SLOD.sls_cststk_flg,
						S0_SLOD.dest_cd1,
						S0_SLOD.dest_cd2,
						S0_SLOD.dest_cd3,
						S0_IVDP.cst_po_no,
						S0_IVDP.cst_po_d_no,
						S0_IVDP.sno1,
						S0_IVDP.sno2,
						S0_IVDP.sno3,
						S0_IVDP.sno4,
						S0_SHIPSCHD.ship_fr_lg_grp_cd,
						S0_IVDP.cst_itm_cd,
						S0_IVDP.cst_itm_nm,
						S0_IVDP.rsn_cd,
						S0_IVDP.bd_dpt_cd,
						S0_BDDPT.dpt_nm.as("bd_dpt_nm"),
						S0_IVDP.sls_usr_cd,
						S0_IVDP.sls_dpt_cd,
						S0_SLSDPT.dpt_nm.as("sls_dpt_nm"),
						S0_IVDP.dscnt_rsn_cd,
						S0_IVDP.ar_dpt_cd,
						S0_ARDPT.dpt_nm.as("ar_dpt_nm"),
						S0_IVDP.iv_d_rmrks,
						S0_IVDP.trd_rmrks,
						S0_IVDP.trd_d_rmrks,
						S0_IVDP.intr_d_rmrks,
						S0_IVDP.sub_char1.as("dtl_sub_char1"),
						S0_IVDP.sub_char2.as("dtl_sub_char2"),
						S0_IVDP.sub_char3.as("dtl_sub_char3"),
						S0_IVDP.slo_no,
						S0_IVDP.slo_d_no,
						S0_IVDP.xfr_schd_no,
						trunc(
							S0_IVDP.dlv_rqst_tm,
							MCDateFmt.DD
						).as("dlv_rqst_dt"),
						S0_IVDP.dlv_rqst_tm.as("dlv_rqst_hm"),
						S0_IVDP.disp_seq,
						S0_IVDP.ptax_cur_amt,
						S0_IVDP.wtax_rate,
						S0_IVDP.wtax_amt,
						S0_IVDP.manual_add_flg,
						S0_IVDP.purc_schd_no,
						S0_SHIPPR.purc_ddlv_flg,
						S0_SHIPPR.ship_pr_no,
						nvl(
							S0_SHIPPR.upd_cntr,
							value(-1)
						).as("ship_pr_upd_cntr"),
						S0_SHIPPR.ship_inst_typ,
						nvl(
							S0_SHIPSCHD.ship_schd_no,
							S0_PRERCPTSHIPSCHD.ship_schd_no
						).as("ship_schd_no"),
						S0_SLSSCHD.purc_act_d_no,
						nvl(
							S0_SHIPSCHD.pr_sts_typ,
							S0_PRERCPTSHIPSCHD.pr_sts_typ
						).as("pr_sts_typ"),
						nvl(
							S0_SHIPSCHD.ship_inst_qty,
							value(0)
						).as("ship_inst_qty"),
						nvl(
							S0_SHIPSCHD.ship_act_qty,
							value(0)
						).as("ship_act_qty"),
						S0_SHIPRQST.ar_dpt_typ,
						MAPA_BP$F_GET_AR_DPT_CD_NE(
							S0_SHIPRQST.bp_cd,
							coalesce(
								S0_IVP.iv_dt,
								bind("today")
							),
							value(false)
						).as("lnk_ar_dpt_cd"),
						cases()
							.when(S0_IVP.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.SLS.value())))
								.then(S0_DLV.prnt_lcl_cd)
							.when(S0_IVP.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.SHIP.value())))
								.then(S0_DLV.prnt_lcl_cd)
							.otherwise(S0_DLVLOC.prnt_lcl_cd).as("prnt_lcl_cd"),
						S0_SLSDPT.wg_cd.as("sls_dpt_wg_cd"),
						coalesce(
							S0_XFRSCHD.gi_loc_cd,
							S0_ITMLGGRP.lg_def_loc_cd,
							S0_GILOC.loc_cd
						).as("chk_gi_loc_cd"),
						S0_IVP.ins_usr_id,
						S0_IVP.ins_usr_nm,
						S0_IVP.ins_func_id,
						nullValue().as("ins_func_nm"),
						S0_IVP.ins_ts,
						S0_IVP.upd_usr_id,
						S0_IVP.upd_usr_nm,
						S0_IVP.upd_func_id,
						nullValue().as("upd_func_nm"),
						S0_IVP.upd_ts,
						S0_IVP.upd_srv_req_no
					)
					.from(
						S0_IVP
						.innerJoin(S0_IVDP).on(
							bracket(
								S0_IVP.iv_mng_no.eq(S0_IVDP.iv_mng_no)
								.and(S0_IVP.iv_rev.eq(S0_IVDP.iv_rev))
							)
						)
						.leftOuterJoin(S0_IV).on(S0_IVP.iv_mng_no.eq(S0_IV.iv_mng_no))
						.leftOuterJoin(S0_SHIPPR).on(
							bracket(
								bracket(
									S0_IVDP.slo_d_no.isNotNull()
									.and(S0_IVDP.slo_d_no.eq(S0_SHIPPR.slo_d_no))
								)
								.or(
									S0_IVDP.xfr_schd_no.isNotNull()
									.and(S0_IVDP.xfr_schd_no.eq(S0_SHIPPR.xfr_schd_no))
								)
							)
						)
						.leftOuterJoin(S0_SLSSCHD).on(
							bracket(
								S0_IVP.pre_rcpt_iv_flg.eq(value(true))
								.and(S0_IVDP.purc_schd_no.eq(S0_SLSSCHD.purc_schd_no))
							)
						)
						.leftOuterJoin(S0_SLO).on(
							bracket(
								S0_IVDP.slo_no.eq(S0_SLO.slo_no)
							)
						)
						.leftOuterJoin(S0_SLOD).on(
							bracket(
								S0_IVDP.slo_d_no.eq(S0_SLOD.slo_d_no)
							)
						)
						.leftOuterJoin(S0_IVMAP).on(
							bracket(
								S0_IVDP.iv_d_no.eq(S0_IVMAP.iv_d_no)
							)
						)
						.leftOuterJoin(S0_SHIPSCHD).on(
							bracket(
								S0_SHIPSCHD.ship_schd_no.eq(S0_IVMAP.ship_schd_no)
							)
						)
						.leftOuterJoin(S0_PRERCPTSHIPSCHD).on(
							bracket(
								S0_IVP.pre_rcpt_iv_flg.eq(value(true))
								.and(S0_PRERCPTSHIPSCHD.ship_schd_no.eq(S0_SLSSCHD.ship_schd_no))
							)
						)
						.leftOuterJoin(S0_XFRSCHD).on(
							bracket(
								S0_XFRSCHD.xfr_schd_no.eq(S0_IVDP.xfr_schd_no)
							)
						)
						.leftOuterJoin(S0_IVSHIPINSTMAP).on(
							bracket((S0_IVP.iv_src_typ.eq(value(MSC_IV_SRC_TYP.SHIP_INST.value())).or(S0_IVP.iv_src_typ.eq(value(MSC_IV_SRC_TYP.SHIP_ACT.value())))))
								.and(S0_IVMAP.iv_d_no.eq(S0_IVSHIPINSTMAP.iv_d_no).and(S0_IVMAP.ship_schd_no.eq(S0_IVSHIPINSTMAP.ship_schd_no))))
						.leftOuterJoin(S0_SHIPINSTD).on(S0_IVSHIPINSTMAP.ship_inst_d_no.eq(S0_SHIPINSTD.ship_inst_d_no))
						.leftOuterJoin(S0_SHIPINST).on(S0_SHIPINSTD.ship_inst_no.eq(S0_SHIPINST.ship_inst_no))
						.leftOuterJoin(S0_IVSHIPACTMAP).on(S0_IVP.iv_src_typ.eq(value(MSC_IV_SRC_TYP.SHIP_ACT.value()))
							.and(
								bracket(
									S0_IVMAP.iv_d_no.eq(S0_IVSHIPACTMAP.iv_d_no).and(S0_IVMAP.ship_schd_no.eq(S0_IVSHIPACTMAP.ship_schd_no))
									.or(
										bracket(
											S0_IVDP.iv_d_no.eq(S0_IVSHIPACTMAP.iv_d_no).and(S0_IVSHIPACTMAP.ship_schd_no.eq(value(MAC_STR.NULL_VAL.value())))
										)
									)
								)
							)
						)
						.leftOuterJoin(S0_SHIPACTD).on(S0_IVSHIPACTMAP.ship_act_d_no.eq(S0_SHIPACTD.ship_act_d_no))
						.leftOuterJoin(S0_SHIPACT).on(S0_SHIPACTD.ship_act_no.eq(S0_SHIPACT.ship_act_no))
						.crossJoin(S0_CO)
						.leftOuterJoin(S0_DLV).on(
							bracket(
								S0_IVP.dlv_id_cd.eq(S0_DLV.bp_cd)
							)
						)
						.leftOuterJoin(S0_SHIPRQST).on(
							bracket(
								S0_IVP.ship_rqst_id_cd.eq(S0_SHIPRQST.bp_cd)
							)
						)
						.leftOuterJoin(S0_TDLV).on(
							bracket(
								S0_IVP.tdlv_cd.eq(S0_TDLV.bp_cd)
							)
						)
						.leftOuterJoin(S0_TRDCUR).on(
							bracket(
								S0_IVP.trd_cur_cd.eq(S0_TRDCUR.cur_cd)
							)
						)
						.leftOuterJoin(S0_ITM).on(
							bracket(
								S0_IVDP.itm_cd.eq(S0_ITM.itm_cd)
								.and(S0_IVDP.itm_sub1.eq(S0_ITM.itm_sub1))
								.and(S0_IVDP.itm_sub2.eq(S0_ITM.itm_sub2))
								.and(S0_IVDP.itm_sub3.eq(S0_ITM.itm_sub3))
							)
						)
						.leftOuterJoin(S0_BDDPT).on(
							bracket(
								S0_IVDP.bd_dpt_cd.eq(S0_BDDPT.dpt_cd)
								.and(
									coalesce(
										S0_SLO.slo_dt,
										S0_XFRSCHD.rcpt_dt,
										S0_IVP.iv_dt
									).between(S0_BDDPT.st_dt, S0_BDDPT.end_dt)
								)
							)
						)
						.leftOuterJoin(S0_SLSDPT).on(
							bracket(
								S0_IVDP.sls_dpt_cd.eq(S0_SLSDPT.dpt_cd)
								.and(
									coalesce(
										S0_SLO.slo_dt,
										S0_IVP.iv_dt
									).between(S0_SLSDPT.st_dt, S0_SLSDPT.end_dt)
								)
							)
						)
						.leftOuterJoin(S0_ARDPT).on(
							bracket(
								S0_IVDP.ar_dpt_cd.eq(S0_ARDPT.dpt_cd)
								.and(
									coalesce(
										S0_SLO.slo_dt,
										S0_IVP.iv_dt
									).between(S0_ARDPT.st_dt, S0_ARDPT.end_dt)
								)
							)
						)
						.leftOuterJoin(S0_PTAXCUR).on(
							bracket(
								S0_IVP.ptax_cur_cd.eq(S0_PTAXCUR.cur_cd)
							)
						)
						.leftOuterJoin(S0_SHIPRQSTLOC).on(
							bracket(
								S0_IVP.ship_rqst_id_cd.eq(S0_SHIPRQSTLOC.loc_cd)
							)
						)
						.leftOuterJoin(S0_SUNDRYITM).on(
							bracket(
								S0_IVDP.itm_cd.eq(S0_SUNDRYITM.itm_cd)
								.and(S0_IVDP.itm_sub1.eq(S0_SUNDRYITM.itm_sub1))
								.and(S0_IVDP.itm_sub2.eq(S0_SUNDRYITM.itm_sub2))
								.and(S0_IVDP.itm_sub3.eq(S0_SUNDRYITM.itm_sub3))
								.and(S0_IVDP.sno1.eq(S0_SUNDRYITM.sno1))
								.and(S0_IVDP.sno2.eq(S0_SUNDRYITM.sno2))
								.and(S0_IVDP.sno3.eq(S0_SUNDRYITM.sno3))
								.and(S0_IVDP.sno4.eq(S0_SUNDRYITM.sno4))
							)
						)
						.leftOuterJoin(S0_DLVLOC).on(
							bracket(
								S0_IVP.dlv_id_cd.eq(S0_DLVLOC.loc_cd)
							)
						)
						.leftOuterJoin(S0_ITMLCL).on(
							bracket(
								S0_IVDP.itm_cd.eq(S0_ITMLCL.itm_cd)
								.and(S0_IVDP.itm_sub1.eq(S0_ITMLCL.itm_sub1))
								.and(S0_IVDP.itm_sub2.eq(S0_ITMLCL.itm_sub2))
								.and(S0_IVDP.itm_sub3.eq(S0_ITMLCL.itm_sub3))
								.and(
									bracket(
										S0_IVP.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.SLS.value()))
										.and(S0_DLV.prnt_lcl_cd.eq(S0_ITMLCL.lcl_cd))
									)
									.or(
										S0_IVP.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.SHIP.value()))
										.and(S0_DLV.prnt_lcl_cd.eq(S0_ITMLCL.lcl_cd))
									)
									.or(
										S0_IVP.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.PROV.value()))
										.and(S0_DLVLOC.prnt_lcl_cd.eq(S0_ITMLCL.lcl_cd))
									)
									.or(
										S0_IVP.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.XFR.value()))
										.and(S0_DLVLOC.prnt_lcl_cd.eq(S0_ITMLCL.lcl_cd))
									)
									.or(
										S0_IVP.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.XFR_RTN.value()))
										.and(S0_DLVLOC.prnt_lcl_cd.eq(S0_ITMLCL.lcl_cd))
									)
								)
							)
						)
						.leftOuterJoin(S0_ITMLGGRP).on(
							bracket(
								S0_XFRSCHD.itm_cd.eq(S0_ITMLGGRP.itm_cd)
								.and(S0_XFRSCHD.itm_sub1.eq(S0_ITMLGGRP.itm_sub1))
								.and(S0_XFRSCHD.itm_sub2.eq(S0_ITMLGGRP.itm_sub2))
								.and(S0_XFRSCHD.itm_sub3.eq(S0_ITMLGGRP.itm_sub3))
								.and(S0_XFRSCHD.gi_lg_grp_cd.eq(S0_ITMLGGRP.lg_grp_cd))
							)
						)
						.leftOuterJoin(S0_GILOC).on(
							bracket(
								S0_XFRSCHD.gi_lg_grp_cd.eq(S0_GILOC.lg_grp_cd)
								.and(S0_GILOC.lg_def_flg.eq(value(true)))
								.and(S0_GILOC.del_flg.eq(value(false)))
							)
						)
					)
					.where(
						value(0).eq(value(0))
						.and(S0_IVP.iv_mng_no.eq(bind("iv_mng_no")))
						.and(S0_IVP.iv_no.eq(bind("iv_no")))
						.and(S0_IVP.iv_rev.eq(bind("iv_rev")))
						.and(S0_IVP.pre_rcpt_iv_flg.neq(value(true)))
					)
			)
			.setJoinInfo(
				joinInfo(
					j -> j
						.add(MSVT_WRK_SNO_R.class, r -> toCondition(
							r.getStringNE("sno1")
						))
						.addSelect(m -> toArray(
							m.wrk_nm,
							m.wrk_no
						))
						.addMap((r, m) -> {
							r.setStringNE("wrk_no", m.wrk_no());
							r.setStringNE("wrk_nm", m.wrk_nm());
					}),
					j -> j
						.add(MAM_CNTRY_R.class, r -> toCondition(
							r.getStringNE("dlv_cntry_cd")
						))
						.addSelect(m -> toArray(
							m.cntry_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("dlv_cntry_nm", m.cntry_nm());
					}),
					j -> j
						.add(MAM_TRNSPT_R.class, r -> toCondition(
							r.getStringNE("trnspt_cd")
						))
						.addSelect(m -> toArray(
							m.trnspt_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("trnspt_nm", m.trnspt_nm());
					}),
					j -> j
						.add(MAM_EXIM_PORT_R.class, r -> toCondition(
							r.getStringNE("load_port_cd")
						))
						.addSelect(m -> toArray(
							m.port_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("load_port_nm", m.port_nm());
					}),
					j -> j
						.add(MAM_EXIM_PORT_R.class, r -> toCondition(
							r.getStringNE("dschrg_port_cd")
						))
						.addSelect(m -> toArray(
							m.port_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("dschrg_port_nm", m.port_nm());
					}),
					j -> j
						.add(MAM_EXIM_PORT_R.class, r -> toCondition(
							r.getStringNE("via_port_cd")
						))
						.addSelect(m -> toArray(
							m.port_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("via_port_nm", m.port_nm());
					}),
					j -> j
						.add(MAM_TTERM_R.class, r -> toCondition(
							r.getStringNE("tterm_cd1")
						))
						.addSelect(m -> toArray(
							m.tterm_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("tterm_nm1", m.tterm_nm());
					}),
					j -> j
						.add(MAM_TTERM_R.class, r -> toCondition(
							r.getStringNE("tterm_cd2")
						))
						.addSelect(m -> toArray(
							m.tterm_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("tterm_nm2", m.tterm_nm());
					}),
					j -> j
						.add(MAM_TTERM_R.class, r -> toCondition(
							r.getStringNE("tterm_cd3")
						))
						.addSelect(m -> toArray(
							m.tterm_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("tterm_nm3", m.tterm_nm());
					}),
					j -> j
						.add(MAM_CNTRY_R.class, r -> toCondition(
							r.getStringNE("cntry_org_cd")
						))
						.addSelect(m -> toArray(
							m.cntry_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("cntry_org_nm", m.cntry_nm());
					}),
					j -> j
						.add(MAM_UNIT_R.class, r -> toCondition(
							r.getStringNE("trd_unit_cd")
						))
						.addSelect(m -> toArray(
							m.unit_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("trd_unit_nm", m.unit_nm());
					}),
					j -> j
						.add(MAM_UNIT_R.class, r -> toCondition(
							r.getStringNE("base_unit_cd")
						))
						.addSelect(m -> toArray(
							m.unit_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("base_unit_nm", m.unit_nm());
					}),
					j -> j
						.add(MAM_STK_GD_R.class, r -> toCondition(
							r.getStringNE("gd_cd")
						))
						.addSelect(m -> toArray(
							m.gd_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("gd_nm", m.gd_nm());
					}),
					j -> j
						.add(MAM_TAX_R.class, r -> toCondition(
							r.getStringNE("tax_cd")
						))
						.addSelect(m -> toArray(
							m.inc_tax_flg,
							m.tax_nm,
							m.tax_rate
						))
						.addMap((r, m) -> {
							r.setStringNE("tax_nm", m.tax_nm());
							r.setNumberNE("tax_rate", m.tax_rate());
							r.setBooleanNE("inc_tax_flg", m.inc_tax_flg());
					}),
					j -> j
						.add(MAM_USR_R.class, r -> toCondition(
							r.getStringNE("sls_usr_cd")
						))
						.addSelect(m -> toArray(
							m.usr_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("sls_usr_nm", m.usr_nm());
					}),
					j -> j
						.add(MAM_BIZ_RSN_R.class, r -> toCondition(
							r.getStringNE("rsn_cd")
						))
						.addSelect(m -> toArray(
							m.biz_rsn_nm,
							m.sls_acxfr_flg
						))
						.addMap((r, m) -> {
							r.setStringNE("rsn_nm", m.biz_rsn_nm());
							r.setBooleanNE("sls_acxfr_flg", m.sls_acxfr_flg());
					}),
					j -> j
						.add(MAM_BIZ_RSN_R.class, r -> toCondition(
							r.getStringNE("dscnt_rsn_cd")
						))
						.addSelect(m -> toArray(
							m.biz_rsn_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("dscnt_rsn_nm", m.biz_rsn_nm());
					}),
					j -> j
						.add(MAM_TRD_R.class, r -> toCondition(
							r.getStringNE("trd_cd")
						))
						.addSelect(m -> toArray(
							m.trd_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("trd_nm", m.trd_nm());
					}),
					j -> j
						.add(MAVM_ITM_UNIT_R.class, r -> toCondition(
							r.getStringNE("itm_cd"),
							r.getStringNE("itm_sub1"),
							r.getStringNE("itm_sub2"),
							r.getStringNE("itm_sub3"),
							r.getStringNE("trd_unit_cd")
						))
						.addSelect(m -> toArray(
							m.conv_base_qty,
							m.conv_qty,
							m.dec_place,
							m.rnd_typ
						))
						.addMap((r, m) -> {
							r.setNumberNE("trd_unit_conv_base_qty", m.conv_base_qty());
							r.setNumberNE("trd_unit_conv_qty", m.conv_qty());
							r.setNumberNE("trd_unit_dec_place", m.dec_place());
							r.setStringNE("trd_unit_rnd_typ", m.rnd_typ());
							r.setNumberNE("schd_trd_unit_conv_base_qty", m.conv_base_qty());
							r.setNumberNE("schd_trd_unit_dec_place", m.dec_place());
							r.setNumberNE("schd_trd_unit_conv_qty", m.conv_qty());
							r.setStringNE("schd_trd_unit_rnd_typ", m.rnd_typ());
					}),
					j -> j
						.add(MAM_LG_GRP_R.class, r -> toCondition(
							r.getStringNE("ship_fr_lg_grp_cd")
						))
						.addSelect(m -> toArray(
							m.lg_grp_nm,
							m.wg_cd
						))
						.addMap((r, m) -> {
							r.setStringNE("ship_fr_lg_grp_nm", m.lg_grp_nm());
							r.setStringNE("lg_grp_wg_cd", m.wg_cd());
					})
				)
			);
	}
	
	/**
	 * -- MSBEL1730_MST_SHIP_SCHD_Query_S02
	 */
	static MCQueryPlan MSBEL1730_MST_SHIP_SCHD_S02() {
		MST_SHIP_SCHD_R S0_T1 = MST_SHIP_SCHD_R.create("T1");
		MSW_SHIP_SCHD_KEY_R S0_T1W = MSW_SHIP_SCHD_KEY_R.create("T1W");
		MST_SHIP_PR_R S0_T2 = MST_SHIP_PR_R.create("T2");
		MST_SLO_D_R S0_T4 = MST_SLO_D_R.create("T4");
		MST_SLO_R S0_T3 = MST_SLO_R.create("T3");
		MST_PROV_SCHD_R S0_T5 = MST_PROV_SCHD_R.create("T5");
		MST_XFR_SCHD_R S0_T6 = MST_XFR_SCHD_R.create("T6");
		MAM_ITM_R S0_M1 = MAM_ITM_R.create("M1");
		MST_SLS_SCHD_R S0_T8 = MST_SLS_SCHD_R.create("T8");
		MAM_CNTRY_R S0_M2 = MAM_CNTRY_R.create("M2");
		MAM_TAX_R S0_M6 = MAM_TAX_R.create("M6");
		MAM_DPT_R S0_M8 = MAM_DPT_R.create("M8");
		MAM_DPT_R S0_M10 = MAM_DPT_R.create("M10");
		MAM_DPT_R S0_M11 = MAM_DPT_R.create("M11");
		MAM_BP_R S0_M13 = MAM_BP_R.create("M13");
		MAM_CUR_R S0_M14 = MAM_CUR_R.create("M14");
		MAM_CUR_R S0_M15 = MAM_CUR_R.create("M15");
		MAM_CUR_R S0_M16 = MAM_CUR_R.create("M16");
		MAM_SUNDRY_ITM_R S0_M19 = MAM_SUNDRY_ITM_R.create("M19");
		MAM_LOC_R S0_M20 = MAM_LOC_R.create("M20");
		MAM_BP_R S0_M201 = MAM_BP_R.create("M201");
		MAM_ITM_LCL_R S0_M21 = MAM_ITM_LCL_R.create("M21");
		MAM_BP_R S0_M22 = MAM_BP_R.create("M22");
		MAVM_ITM_UNIT_R S0_M23 = MAVM_ITM_UNIT_R.create("M23");
		MAM_CUR_R S0_M24 = MAM_CUR_R.create("M24");
		MAM_CUR_R S0_M25 = MAM_CUR_R.create("M25");
		MAM_CUR_R S0_M26 = MAM_CUR_R.create("M26");
		MAM_ITM_LG_GRP_R S0_M93 = MAM_ITM_LG_GRP_R.create("M93");
		MAM_LOC_R S0_M94 = MAM_LOC_R.create("M94");
		MAVM_RD_WG_R S1_M91 = MAVM_RD_WG_R.create("M91");
		MAVM_RD_LOC_R S2_M95 = MAVM_RD_LOC_R.create("M95");
		MST_SLS_SCHD_R S3_TX1 = MST_SLS_SCHD_R.create("TX1");
		MST_PURC_SCHD_R S3_TX2 = MST_PURC_SCHD_R.create("TX2");
		MST_ARR_PR_R S3_TX3 = MST_ARR_PR_R.create("TX3");
		MST_PO_D_R S3_TX4 = MST_PO_D_R.create("TX4");
		MST_PO_R S3_TX5 = MST_PO_R.create("TX5");
		MAM_BP_R S3_TX6 = MAM_BP_R.create("TX6");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBEL1730_MST_SHIP_SCHD_Query_S02")
					.mainQuery()
					.select(
						value(true).as("existed_flg"),
						S0_T1.ship_schd_no,
						S0_T1.itm_cd,
						S0_T1.itm_sub1,
						S0_T1.itm_sub2,
						S0_T1.itm_sub3,
						cases()
							.when(S0_T1.sundry_itm_flg.eq(value(true)))
								.then(
									nvl(
										S0_T1.itm_nm,
										S0_M19.itm_nm
									)
							)
							.otherwise(S0_M1.itm_nm).as("itm_nm"),
						S0_T1.sundry_itm_flg,
						S0_M1.sls_upri_cng_flg,
						S0_M1.stk_mng_typ,
						S0_M1.asset_mng_typ,
						S0_M1.sno1_mng_typ,
						S0_M1.sno2_mng_typ,
						S0_M1.sno3_mng_typ,
						S0_M1.sno4_mng_typ,
						S0_M1.dscnt_itm_flg,
						S0_M1.exim_xpns_typ,
						cases()
							.when(S0_T1.sundry_itm_flg.eq(value(true)))
								.then(
									nvl(
										S0_T1.iv_itm_nm,
										S0_M19.itm_nm
									)
							)
							.otherwise(
								nvl(
									S0_M21.itm_nm,
									S0_M1.itm_nm
								)
							).as("iv_itm_nm"),
						coalesce(
							S0_T4.cntry_org_cd,
							S0_M1.cntry_org_cd
						).as("cntry_org_cd"),
						S0_M2.cntry_nm.as("cntry_org_nm"),
						coalesce(
							S0_M14.upri_dec_place,
							S0_M15.upri_dec_place,
							S0_M16.upri_dec_place
						).as("trd_cur_upri_dec_place"),
						coalesce(
							S0_M14.amt_dec_place,
							S0_M15.amt_dec_place,
							S0_M16.amt_dec_place
						).as("trd_cur_amt_dec_place"),
						nvl(
							decode(
								S0_T2.trd_ptn_typ,
								value(MAC_TRD_PTN_TYP.SLS.value()),
								S0_M13.sls_amt_rnd_typ,
								value(MAC_TRD_PTN_TYP.SHIP.value()),
								S0_M13.sls_amt_rnd_typ,
								value(MAC_TRD_PTN_TYP.PROV.value()),
								S0_M22.prov_amt_rnd_typ,
								value(MAC_RND_TYP.RNDOFF.value())
							),
							value(MAC_RND_TYP.RNDOFF.value())
						).as("trd_amt_rnd_typ"),
						nvl(
							decode(
								S0_T2.trd_ptn_typ,
								value(MAC_TRD_PTN_TYP.SLS.value()),
								S0_M13.sls_tax_rnd_typ,
								value(MAC_TRD_PTN_TYP.SHIP.value()),
								S0_M13.sls_tax_rnd_typ,
								value(MAC_TRD_PTN_TYP.PROV.value()),
								S0_M22.prov_tax_rnd_typ,
								value(MAC_RND_TYP.RNDOFF.value())
							),
							value(MAC_RND_TYP.RNDOFF.value())
						).as("trd_tax_rnd_typ"),
						decode(
							S0_T4.trd_unit_cd,
							nullValue(),
							S0_T1.trd_unit_cd,
							S0_T4.trd_unit_cd
						).as("trd_unit_cd"),
						nullValue().as("trd_unit_qty"),
						S0_T1.base_unit_cd,
						bracket(
							S0_T1.base_unit_qty.subtract(S0_T1.abort_qty).subtract(S0_T1.iv_schd_qty).subtract(S0_T1.ship_ret_qty)
						).as("base_unit_qty"),
						bracket(
							S0_T1.base_unit_qty.subtract(S0_T1.abort_qty).subtract(S0_T1.iv_schd_qty).subtract(S0_T1.ship_ret_qty)
						).as("max_base_unit_qty"),
						S0_M1.dec_place.as("base_unit_dec_place"),
						S0_M1.rnd_typ.as("base_unit_rnd_typ"),
						S0_T1.gd_cd,
						S0_T2.trd_cd,
						decode(
							S0_T2.trd_ptn_typ,
							value(MAC_TRD_PTN_TYP.SLS.value()),
							S0_T4.trd_unit_cd,
							value(MAC_TRD_PTN_TYP.SHIP.value()),
							S0_T4.trd_unit_cd,
							value(MAC_TRD_PTN_TYP.PROV.value()),
							S0_T6.trd_unit_cd,
							nullValue()
						).as("schd_trd_unit_cd"),
						decode(
							S0_T2.trd_ptn_typ,
							value(MAC_TRD_PTN_TYP.SLS.value()),
							S0_T4.trd_unit_qty,
							value(MAC_TRD_PTN_TYP.SHIP.value()),
							S0_T4.trd_unit_qty,
							value(MAC_TRD_PTN_TYP.PROV.value()),
							S0_T6.trd_unit_qty,
							nullValue()
						).as("schd_trd_unit_qty"),
						S0_M23.dec_place.as("schd_trd_unit_dec_place"),
						S0_M23.conv_base_qty.as("schd_trd_unit_conv_base_qty"),
						S0_M23.conv_qty.as("schd_trd_unit_conv_qty"),
						S0_M23.rnd_typ.as("schd_trd_unit_rnd_typ"),
						decode(
							S0_T2.trd_ptn_typ,
							value(MAC_TRD_PTN_TYP.SLS.value()),
							S0_T4.base_unit_qty,
							value(MAC_TRD_PTN_TYP.SHIP.value()),
							S0_T4.base_unit_qty,
							value(MAC_TRD_PTN_TYP.PROV.value()),
							S0_T6.base_unit_qty,
							nullValue()
						).as("schd_base_unit_qty"),
						S0_T4.trd_cur_dscnt_amt.as("schd_trd_cur_dscnt_amt"),
						S0_T4.iv_upri.as("iv_upri"),
						S0_T4.iv_amt.as("schd_iv_amt"),
						decode(
							S0_T2.trd_ptn_typ,
							value(MAC_TRD_PTN_TYP.SLS.value()),
							S0_T4.trd_cur_upri,
							value(MAC_TRD_PTN_TYP.PROV.value()),
							S0_T5.trd_cur_upri,
							nullValue()
						).as("schd_trd_cur_upri"),
						S0_T4.upri_not_tgt_flg,
						S0_T4.interim_flg,
						S0_T4.sls_cststk_flg,
						decode(
							S0_T2.trd_ptn_typ,
							value(MAC_TRD_PTN_TYP.SLS.value()),
							S0_T4.trd_cur_amt,
							value(MAC_TRD_PTN_TYP.PROV.value()),
							S0_T5.trd_cur_amt,
							nullValue()
						).as("schd_trd_cur_amt"),
						decode(
							S0_T2.trd_ptn_typ,
							value(MAC_TRD_PTN_TYP.SLS.value()),
							S0_T4.trd_cur_tax_amt,
							value(MAC_TRD_PTN_TYP.PROV.value()),
							S0_T5.trd_cur_tax_amt,
							nullValue()
						).as("schd_trd_cur_tax_amt"),
						decode(
							S0_T2.trd_ptn_typ,
							value(MAC_TRD_PTN_TYP.SLS.value()),
							S0_T4.wtax_rate,
							value(MAC_TRD_PTN_TYP.PROV.value()),
							S0_T5.wtax_rate,
							nullValue()
						).as("wtax_rate"),
						decode(
							S0_T2.trd_ptn_typ,
							value(MAC_TRD_PTN_TYP.SLS.value()),
							S0_T4.wtax_amt,
							value(MAC_TRD_PTN_TYP.PROV.value()),
							S0_T5.wtax_amt,
							nullValue()
						).as("schd_wtax_amt"),
						S0_T2.trd_ptn_typ,
						S0_T6.prov_basis_typ,
						coalesce(
							S0_T3.trd_cur_cd,
							S0_T5.trd_cur_cd,
							S0_T6.trd_cur_cd
						).as("trd_cur_cd"),
						coalesce(
							S0_M24.amt_dec_place,
							S0_M25.amt_dec_place,
							S0_M26.amt_dec_place
						).as("amt_dec_place"),
						coalesce(
							S0_M24.upri_dec_place,
							S0_M25.upri_dec_place,
							S0_M26.upri_dec_place
						).as("upri_dec_place"),
						nvl(
							decode(
								S0_T2.trd_ptn_typ,
								value(MAC_TRD_PTN_TYP.SLS.value()),
								S0_M13.sls_amt_rnd_typ,
								value(MAC_TRD_PTN_TYP.SHIP.value()),
								S0_M13.sls_amt_rnd_typ,
								value(MAC_TRD_PTN_TYP.PROV.value()),
								S0_M22.prov_amt_rnd_typ,
								value(MAC_RND_TYP.RNDOFF.value())
							),
							value(MAC_RND_TYP.RNDOFF.value())
						).as("amt_rnd_typ"),
						nvl(
							decode(
								S0_T2.trd_ptn_typ,
								value(MAC_TRD_PTN_TYP.SLS.value()),
								S0_M13.sls_tax_rnd_typ,
								value(MAC_TRD_PTN_TYP.SHIP.value()),
								S0_M13.sls_tax_rnd_typ,
								value(MAC_TRD_PTN_TYP.PROV.value()),
								S0_M22.prov_tax_rnd_typ,
								value(MAC_RND_TYP.RNDOFF.value())
							),
							value(MAC_RND_TYP.RNDOFF.value())
						).as("tax_rnd_typ"),
						decode(
							S0_T2.trd_ptn_typ,
							value(MAC_TRD_PTN_TYP.SLS.value()),
							S0_T4.tax_cd,
							value(MAC_TRD_PTN_TYP.PROV.value()),
							S0_T5.tax_cd,
							nullValue()
						).as("tax_cd"),
						decode(
							S0_T2.trd_ptn_typ,
							value(MAC_TRD_PTN_TYP.SLS.value()),
							S0_T4.tax_fix_flg,
							value(MAC_TRD_PTN_TYP.PROV.value()),
							S0_T5.tax_fix_flg,
							nullValue()
						).as("tax_fix_flg"),
						S0_M6.tax_nm,
						S0_M6.inc_tax_flg,
						S0_M6.tax_rate,
						S0_T4.dest_cd1,
						S0_T4.dest_cd2,
						S0_T4.dest_cd3,
						S0_T3.cst_po_no,
						S0_T4.cst_po_d_no,
						S0_T1.ship_fr_lg_grp_cd,
						S0_T4.cst_itm_cd,
						S0_T4.cst_itm_nm,
						S0_T2.rsn_cd,
						S0_T2.bd_dpt_cd,
						S0_M8.dpt_nm.as("bd_dpt_nm"),
						S0_T1.sno1,
						S0_T1.sno2,
						S0_T1.sno3,
						S0_T1.sno4,
						S0_T3.sls_usr_cd,
						S0_T3.sls_dpt_cd,
						S0_M11.dpt_nm.as("sls_dpt_nm"),
						S0_M11.wg_cd.as("sls_dpt_wg_cd"),
						S0_T3.ar_dpt_cd,
						S0_M10.dpt_nm.as("ar_dpt_nm"),
						S0_T4.dscnt_rsn_cd,
						decode(
							S0_T2.trd_ptn_typ,
							value(MAC_TRD_PTN_TYP.SLS.value()),
							S0_T3.trd_rmrks,
							value(MAC_TRD_PTN_TYP.SHIP.value()),
							S0_T3.trd_rmrks,
							nullValue()
						).as("trd_rmrks"),
						decode(
							S0_T2.purc_ddlv_flg,
							value(true),
							S0_T4.trd_d_rmrks,
							S0_T1.trd_d_rmrks
						).as("trd_d_rmrks"),
						S0_T3.slo_no,
						S0_T2.purc_ddlv_flg,
						S0_T2.slo_d_no,
						S0_T2.xfr_schd_no,
						trunc(
							S0_T2.dlv_rqst_tm,
							MCDateFmt.DD
						).as("dlv_rqst_dt"),
						S0_T2.dlv_rqst_tm.as("dlv_rqst_hm"),
						S0_T2.ship_pr_no,
						S0_T2.ship_inst_typ,
						S0_T1.pr_sts_typ,
						S0_T8.purc_schd_no,
						S0_T8.purc_act_d_no,
						S0_T2.upd_cntr.as("ship_pr_upd_cntr")
					)
					.from(
						S0_T1
						.innerJoin(S0_T1W).on(
							bracket(
								S0_T1.ship_schd_no.eq(S0_T1W.ship_schd_no)
							)
						)
						.innerJoin(S0_T2).on(
							bracket(
								S0_T1.ship_pr_no.eq(S0_T2.ship_pr_no)
							)
						)
						.leftOuterJoin(S0_T4).on(
							bracket(
								S0_T4.slo_d_no.eq(S0_T2.slo_d_no)
							)
						)
						.leftOuterJoin(S0_T3).on(
							bracket(
								S0_T3.slo_no.eq(S0_T4.slo_no)
							)
						)
						.leftOuterJoin(S0_T5).on(
							bracket(
								S0_T1.ship_schd_no.eq(S0_T5.prov_src_schd_no1)
								.and(MAC_TRD_PTN_TYP$IS_PROV(S0_T5.trd_ptn_typ).eq(value(true)))
							)
						)
						.leftOuterJoin(S0_T6).on(
							bracket(
								S0_T2.xfr_schd_no.eq(S0_T6.xfr_schd_no)
							)
						)
						.leftOuterJoin(S0_M1).on(
							bracket(
								S0_T1.itm_cd.eq(S0_M1.itm_cd)
								.and(S0_T1.itm_sub1.eq(S0_M1.itm_sub1))
								.and(S0_T1.itm_sub2.eq(S0_M1.itm_sub2))
								.and(S0_T1.itm_sub3.eq(S0_M1.itm_sub3))
							)
						)
						.leftOuterJoin(S0_T8).on(
							bracket(
								S0_T1.ship_schd_no.eq(S0_T8.ship_schd_no)
							)
						)
						.leftOuterJoin(S0_M2).on(
							bracket(
								coalesce(
									S0_T4.cntry_org_cd,
									S0_M1.cntry_org_cd
								).eq(S0_M2.cntry_cd)
							)
						)
						.leftOuterJoin(S0_M6).on(
							bracket(
								decode(
									S0_T2.trd_ptn_typ,
									value(MAC_TRD_PTN_TYP.SLS.value()),
									S0_T4.tax_cd,
									value(MAC_TRD_PTN_TYP.PROV.value()),
									S0_T5.tax_cd,
									nullValue()
								).eq(S0_M6.tax_cd)
							)
						)
						.leftOuterJoin(S0_M8).on(
							bracket(
								S0_T2.bd_dpt_cd.eq(S0_M8.dpt_cd)
								.and(
									coalesce(
										S0_T3.slo_dt,
										S0_T6.rcpt_dt
									).between(S0_M8.st_dt, S0_M8.end_dt)
								)
							)
						)
						.leftOuterJoin(S0_M10).on(
							bracket(
								S0_T3.ar_dpt_cd.eq(S0_M10.dpt_cd)
								.and(S0_T3.slo_dt.between(S0_M10.st_dt, S0_M10.end_dt))
							)
						)
						.leftOuterJoin(S0_M11).on(
							bracket(
								S0_T3.sls_dpt_cd.eq(S0_M11.dpt_cd)
								.and(S0_T3.slo_dt.between(S0_M11.st_dt, S0_M11.end_dt))
							)
						)
						.leftOuterJoin(S0_M13).on(
							bracket(
								S0_T2.cst_cd.eq(S0_M13.bp_cd)
							)
						)
						.leftOuterJoin(S0_M14).on(
							bracket(
								S0_T3.trd_cur_cd.eq(S0_M14.cur_cd)
							)
						)
						.leftOuterJoin(S0_M15).on(
							bracket(
								S0_T5.trd_cur_cd.eq(S0_M15.cur_cd)
							)
						)
						.leftOuterJoin(S0_M16).on(
							bracket(
								S0_T6.trd_cur_cd.eq(S0_M16.cur_cd)
							)
						)
						.leftOuterJoin(S0_M19).on(
							bracket(
								S0_T1.itm_cd.eq(S0_M19.itm_cd)
								.and(S0_T1.itm_sub1.eq(S0_M19.itm_sub1))
								.and(S0_T1.itm_sub2.eq(S0_M19.itm_sub2))
								.and(S0_T1.itm_sub3.eq(S0_M19.itm_sub3))
								.and(S0_T1.sno1.eq(S0_M19.sno1))
								.and(S0_T1.sno2.eq(S0_M19.sno2))
								.and(S0_T1.sno3.eq(S0_M19.sno3))
								.and(S0_T1.sno4.eq(S0_M19.sno4))
							)
						)
						.leftOuterJoin(S0_M20).on(
							bracket(
								S0_T2.dlv_id_cd.eq(S0_M20.loc_cd)
							)
						)
						.leftOuterJoin(S0_M201).on(
							bracket(
								nvl(
									S0_T1.dlv_cd,
									S0_T2.dlv_id_cd
								).eq(S0_M201.bp_cd)
							)
						)
						.leftOuterJoin(S0_M21).on(
							bracket(
								S0_T1.itm_cd.eq(S0_M21.itm_cd)
								.and(S0_T1.itm_sub1.eq(S0_M21.itm_sub1))
								.and(S0_T1.itm_sub2.eq(S0_M21.itm_sub2))
								.and(S0_T1.itm_sub3.eq(S0_M21.itm_sub3))
								.and(
									bracket(
										S0_T2.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.SLS.value()))
										.and(S0_M201.prnt_lcl_cd.eq(S0_M21.lcl_cd))
									)
									.or(
										S0_T2.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.SHIP.value()))
										.and(S0_M201.prnt_lcl_cd.eq(S0_M21.lcl_cd))
									)
									.or(
										S0_T2.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.PROV.value()))
										.and(S0_M20.prnt_lcl_cd.eq(S0_M21.lcl_cd))
									)
									.or(
										S0_T2.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.XFR.value()))
										.and(S0_M20.prnt_lcl_cd.eq(S0_M21.lcl_cd))
									)
									.or(
										S0_T2.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.XFR_RTN.value()))
										.and(S0_M20.prnt_lcl_cd.eq(S0_M21.lcl_cd))
									)
								)
							)
						)
						.leftOuterJoin(S0_M22).on(
							bracket(
								S0_M20.sppl_cd.eq(S0_M22.bp_cd)
							)
						)
						.leftOuterJoin(S0_M23).on(
							bracket(
								S0_T1.itm_cd.eq(S0_M23.itm_cd)
								.and(S0_T1.itm_sub1.eq(S0_M23.itm_sub1))
								.and(S0_T1.itm_sub2.eq(S0_M23.itm_sub2))
								.and(S0_T1.itm_sub3.eq(S0_M23.itm_sub3))
								.and(
									decode(
										S0_T2.trd_ptn_typ,
										value(MAC_TRD_PTN_TYP.SLS.value()),
										S0_T4.trd_unit_cd,
										value(MAC_TRD_PTN_TYP.SHIP.value()),
										S0_T4.trd_unit_cd,
										value(MAC_TRD_PTN_TYP.PROV.value()),
										S0_T6.trd_unit_cd,
										nullValue()
									).eq(S0_M23.unit_cd)
								)
							)
						)
						.leftOuterJoin(S0_M24).on(S0_T3.trd_cur_cd.eq(S0_M24.cur_cd))
						.leftOuterJoin(S0_M25).on(S0_T5.trd_cur_cd.eq(S0_M25.cur_cd))
						.leftOuterJoin(S0_M26).on(S0_T6.trd_cur_cd.eq(S0_M26.cur_cd))
						.leftOuterJoin(S0_M93).on(
							bracket(
								S0_T6.itm_cd.eq(S0_M93.itm_cd)
								.and(S0_T6.itm_sub1.eq(S0_M93.itm_sub1))
								.and(S0_T6.itm_sub2.eq(S0_M93.itm_sub2))
								.and(S0_T6.itm_sub3.eq(S0_M93.itm_sub3))
								.and(S0_T6.gi_lg_grp_cd.eq(S0_M93.lg_grp_cd))
							)
						)
						.leftOuterJoin(S0_M94).on(
							bracket(
								S0_T6.gi_lg_grp_cd.eq(S0_M94.lg_grp_cd)
								.and(S0_M94.lg_def_flg.eq(value(true)))
								.and(S0_M94.del_flg.eq(value(false)))
							)
						)
					)
					.where(
						value(0).eq(value(0))
						.and(
							exists(
								subQuery()
								.select(value("X"))
								.from(S1_M91)
								.where(
									S0_M11.wg_cd.eq(S1_M91.wg_cd)
								)
							)
							.or(
								exists(
									subQuery()
									.select(value("X"))
									.from(S2_M95)
									.where(
										coalesce(
											S0_T6.gi_loc_cd,
											S0_M93.lg_def_loc_cd,
											S0_M94.loc_cd
										).eq(S2_M95.loc_cd)
									)
								)
							)
						)
						.and(
							S0_T2.purc_ddlv_flg.eq(value(false))
							.or(
								exists(
									subQuery()
									.select(value("X"))
									.from(
										S3_TX1
										.innerJoin(S3_TX2).on(
											bracket(
												S3_TX1.purc_schd_no.eq(S3_TX2.purc_schd_no)
											)
										)
										.innerJoin(S3_TX3).on(
											bracket(
												S3_TX2.arr_pr_no.eq(S3_TX3.arr_pr_no)
											)
										)
										.innerJoin(S3_TX4).on(
											bracket(
												S3_TX3.po_d_no.eq(S3_TX4.po_d_no)
											)
										)
										.innerJoin(S3_TX5).on(
											bracket(
												S3_TX4.po_no.eq(S3_TX5.po_no)
											)
										)
										.leftOuterJoin(S3_TX6).on(
											bracket(
												S3_TX5.sppl_cd.eq(S3_TX6.bp_cd)
											)
										)
									)
									.where(
										value(0).eq(value(0))
										.and(S0_T1.ship_schd_no.eq(S3_TX1.ship_schd_no))
										.and(S3_TX1.cmpl_flg.eq(value(false)))
										.and(S3_TX1.purc_schd_no.isNotNull())
										.and(S3_TX4.rqst_can_flg.eq(value(false)))
										.and(S3_TX6.sppl_iv_flg.eq(value(false)))
									)
								)
							)
						)
						.and(S0_T1.base_unit_qty.subtract(S0_T1.abort_qty).subtract(S0_T1.iv_schd_qty).subtract(S0_T1.ship_ret_qty).gt(value(0)))
					)
			)
			.setJoinInfo(
				joinInfo(
					j -> j
						.add(MSVT_WRK_SNO_R.class, r -> toCondition(
							r.getStringNE("sno1")
						))
						.addSelect(m -> toArray(
							m.wrk_nm,
							m.wrk_no
						))
						.addMap((r, m) -> {
							r.setStringNE("wrk_no", m.wrk_no());
							r.setStringNE("wrk_nm", m.wrk_nm());
					}),
					j -> j
						.add(MAM_UNIT_R.class, r -> toCondition(
							r.getStringNE("trd_unit_cd")
						))
						.addSelect(m -> toArray(
							m.unit_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("trd_unit_nm", m.unit_nm());
					}),
					j -> j
						.add(MAM_UNIT_R.class, r -> toCondition(
							r.getStringNE("base_unit_cd")
						))
						.addSelect(m -> toArray(
							m.unit_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("base_unit_nm", m.unit_nm());
					}),
					j -> j
						.add(MAM_STK_GD_R.class, r -> toCondition(
							r.getStringNE("gd_cd")
						))
						.addSelect(m -> toArray(
							m.gd_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("gd_nm", m.gd_nm());
					}),
					j -> j
						.add(MAM_BIZ_RSN_R.class, r -> toCondition(
							r.getStringNE("rsn_cd")
						))
						.addSelect(m -> toArray(
							m.biz_rsn_nm,
							m.sls_acxfr_flg
						))
						.addMap((r, m) -> {
							r.setStringNE("rsn_nm", m.biz_rsn_nm());
							r.setBooleanNE("sls_acxfr_flg", m.sls_acxfr_flg());
					}),
					j -> j
						.add(MAM_USR_R.class, r -> toCondition(
							r.getStringNE("sls_usr_cd")
						))
						.addSelect(m -> toArray(
							m.usr_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("sls_usr_nm", m.usr_nm());
					}),
					j -> j
						.add(MAM_BIZ_RSN_R.class, r -> toCondition(
							r.getStringNE("dscnt_rsn_cd")
						))
						.addSelect(m -> toArray(
							m.biz_rsn_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("dscnt_rsn_nm", m.biz_rsn_nm());
					}),
					j -> j
						.add(MAM_TRD_R.class, r -> toCondition(
							r.getStringNE("trd_cd")
						))
						.addSelect(m -> toArray(
							m.trd_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("trd_nm", m.trd_nm());
					}),
					j -> j
						.add(MAVM_ITM_UNIT_R.class, r -> toCondition(
							r.getStringNE("itm_cd"),
							r.getStringNE("itm_sub1"),
							r.getStringNE("itm_sub2"),
							r.getStringNE("itm_sub3"),
							r.getStringNE("trd_unit_cd")
						))
						.addSelect(m -> toArray(
							m.conv_base_qty,
							m.conv_qty,
							m.dec_place,
							m.rnd_typ
						))
						.addMap((r, m) -> {
							r.setNumberNE("trd_unit_conv_base_qty", m.conv_base_qty());
							r.setNumberNE("trd_unit_conv_qty", m.conv_qty());
							r.setNumberNE("trd_unit_dec_place", m.dec_place());
							r.setStringNE("trd_unit_rnd_typ", m.rnd_typ());
					}),
					j -> j
						.add(MAM_LG_GRP_R.class, r -> toCondition(
							r.getStringNE("ship_fr_lg_grp_cd")
						))
						.addSelect(m -> toArray(
							m.lg_grp_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("ship_fr_lg_grp_nm", m.lg_grp_nm());
					})
				)
			);
	}
	
	/**
	 * -- MSBEL1730_MST_SHIP_SCHD_Query_S03
	 */
	static MCQueryPlan MSBEL1730_MST_SHIP_SCHD_S03() {
		MST_SHIP_SCHD_R S0_T1 = MST_SHIP_SCHD_R.create("T1");
		MST_SHIP_PR_R S0_T2 = MST_SHIP_PR_R.create("T2");
		MST_SHIP_INST_D_R S0_T9 = MST_SHIP_INST_D_R.create("T9");
		MST_SHIP_INST_R S0_T10 = MST_SHIP_INST_R.create("T10");
		MST_SLO_D_R S0_T4 = MST_SLO_D_R.create("T4");
		MST_SLO_R S0_T3 = MST_SLO_R.create("T3");
		MST_PROV_SCHD_R S0_T5 = MST_PROV_SCHD_R.create("T5");
		MST_XFR_SCHD_R S0_T6 = MST_XFR_SCHD_R.create("T6");
		MAM_ITM_R S0_M1 = MAM_ITM_R.create("M1");
		MST_SLS_SCHD_R S0_T8 = MST_SLS_SCHD_R.create("T8");
		MAM_CNTRY_R S0_M2 = MAM_CNTRY_R.create("M2");
		MAM_TAX_R S0_M6 = MAM_TAX_R.create("M6");
		MAM_DPT_R S0_M8 = MAM_DPT_R.create("M8");
		MAM_DPT_R S0_M10 = MAM_DPT_R.create("M10");
		MAM_DPT_R S0_M11 = MAM_DPT_R.create("M11");
		MAM_BP_R S0_M13 = MAM_BP_R.create("M13");
		MAM_CUR_R S0_M14 = MAM_CUR_R.create("M14");
		MAM_CUR_R S0_M15 = MAM_CUR_R.create("M15");
		MAM_CUR_R S0_M16 = MAM_CUR_R.create("M16");
		MAM_SUNDRY_ITM_R S0_M23 = MAM_SUNDRY_ITM_R.create("M23");
		MAM_LOC_R S0_M24 = MAM_LOC_R.create("M24");
		MAM_BP_R S0_M241 = MAM_BP_R.create("M241");
		MAM_ITM_LCL_R S0_M25 = MAM_ITM_LCL_R.create("M25");
		MAM_BP_R S0_M26 = MAM_BP_R.create("M26");
		MAVM_ITM_UNIT_R S0_M27 = MAVM_ITM_UNIT_R.create("M27");
		MAM_ITM_LG_GRP_R S0_M93 = MAM_ITM_LG_GRP_R.create("M93");
		MAM_LOC_R S0_M94 = MAM_LOC_R.create("M94");
		MAVM_RD_WG_R S1_M91 = MAVM_RD_WG_R.create("M91");
		MAVM_RD_LOC_R S2_M95 = MAVM_RD_LOC_R.create("M95");
		MST_SLS_SCHD_R S3_TX1 = MST_SLS_SCHD_R.create("TX1");
		MST_PURC_SCHD_R S3_TX2 = MST_PURC_SCHD_R.create("TX2");
		MST_ARR_PR_R S3_TX3 = MST_ARR_PR_R.create("TX3");
		MST_PO_D_R S3_TX4 = MST_PO_D_R.create("TX4");
		MST_PO_R S3_TX5 = MST_PO_R.create("TX5");
		MAM_BP_R S3_TX6 = MAM_BP_R.create("TX6");
		MSW_SHIP_SCHD_KEY_R S4_WK = MSW_SHIP_SCHD_KEY_R.create("WK");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBEL1730_MST_SHIP_SCHD_Query_S03")
					.mainQuery()
					.select(
						value(true).as("existed_flg"),
						S0_T1.ship_schd_no,
						S0_T1.re_ship_schd_flg,
						S0_T9.ship_inst_no,
						S0_T9.ship_inst_d_no,
						S0_T1.itm_cd,
						S0_T1.itm_sub1,
						S0_T1.itm_sub2,
						S0_T1.itm_sub3,
						cases()
							.when(S0_T1.sundry_itm_flg.eq(value(true)))
								.then(
									nvl(
										S0_T1.itm_nm,
										S0_M23.itm_nm
									)
							)
							.otherwise(S0_M1.itm_nm).as("itm_nm"),
						S0_T1.sundry_itm_flg,
						S0_M1.sls_upri_cng_flg,
						S0_M1.stk_mng_typ,
						S0_M1.asset_mng_typ,
						S0_M1.sno1_mng_typ,
						S0_M1.sno2_mng_typ,
						S0_M1.sno3_mng_typ,
						S0_M1.sno4_mng_typ,
						S0_M1.dscnt_itm_flg,
						S0_M1.exim_xpns_typ,
						cases()
							.when(S0_T1.sundry_itm_flg.eq(value(true)))
								.then(
									nvl(
										S0_T1.iv_itm_nm,
										S0_M23.itm_nm
									)
							)
							.otherwise(
								nvl(
									S0_M25.itm_nm,
									S0_M1.itm_nm
								)
							).as("iv_itm_nm"),
						coalesce(
							S0_T4.cntry_org_cd,
							S0_M1.cntry_org_cd
						).as("cntry_org_cd"),
						S0_M2.cntry_nm.as("cntry_org_nm"),
						decode(
							S0_T4.trd_unit_cd,
							nullValue(),
							S0_T1.trd_unit_cd,
							S0_T4.trd_unit_cd
						).as("trd_unit_cd"),
						nullValue().as("trd_unit_qty"),
						S0_T1.base_unit_cd,
						S0_M1.dec_place.as("base_unit_dec_place"),
						S0_M1.rnd_typ.as("base_unit_rnd_typ"),
						bracket(
							S0_T1.base_unit_qty.subtract(S0_T1.abort_qty).subtract(S0_T1.iv_schd_qty).subtract(S0_T1.ship_ret_qty)
						).as("base_unit_qty"),
						bracket(
							S0_T1.base_unit_qty.subtract(S0_T1.abort_qty).subtract(S0_T1.iv_schd_qty).subtract(S0_T1.ship_ret_qty)
						).as("max_base_unit_qty"),
						S0_T1.gd_cd,
						S0_T2.trd_cd,
						decode(
							S0_T2.trd_ptn_typ,
							value(MAC_TRD_PTN_TYP.SLS.value()),
							S0_T4.trd_cur_upri,
							value(MAC_TRD_PTN_TYP.PROV.value()),
							S0_T5.trd_cur_upri,
							value(0)
						).as("trd_cur_upri"),
						S0_T4.upri_not_tgt_flg,
						S0_T4.interim_flg,
						S0_T4.base_unit_qty.as("schd_base_unit_qty"),
						S0_T4.trd_cur_dscnt_amt.as("schd_trd_cur_dscnt_amt"),
						S0_T4.iv_upri,
						decode(
							S0_T2.trd_ptn_typ,
							value(MAC_TRD_PTN_TYP.SLS.value()),
							S0_T4.tax_cd,
							value(MAC_TRD_PTN_TYP.PROV.value()),
							S0_T5.tax_cd,
							nullValue()
						).as("tax_cd"),
						decode(
							S0_T2.trd_ptn_typ,
							value(MAC_TRD_PTN_TYP.SLS.value()),
							S0_T4.tax_fix_flg,
							value(MAC_TRD_PTN_TYP.PROV.value()),
							S0_T5.tax_fix_flg,
							nullValue()
						).as("tax_fix_flg"),
						S0_M6.tax_nm,
						S0_M6.inc_tax_flg,
						S0_M6.tax_rate,
						S0_T4.sls_cststk_flg,
						S0_T4.dest_cd1,
						S0_T4.dest_cd2,
						S0_T4.dest_cd3,
						S0_T3.cst_po_no,
						S0_T4.cst_po_d_no,
						S0_T1.ship_fr_lg_grp_cd,
						S0_T4.cst_itm_cd,
						S0_T4.cst_itm_nm,
						S0_T2.rsn_cd,
						S0_T1.sno1,
						S0_T1.sno2,
						S0_T1.sno3,
						S0_T1.sno4,
						S0_T2.bd_dpt_cd,
						S0_M8.dpt_nm.as("bd_dpt_nm"),
						S0_T3.sls_usr_cd,
						S0_T3.sls_dpt_cd,
						S0_M11.dpt_nm.as("sls_dpt_nm"),
						S0_M11.wg_cd.as("sls_dpt_wg_cd"),
						S0_T3.ar_dpt_cd,
						S0_M10.dpt_nm.as("ar_dpt_nm"),
						S0_T4.dscnt_rsn_cd,
						decode(
							S0_T2.trd_ptn_typ,
							value(MAC_TRD_PTN_TYP.SLS.value()),
							S0_T3.trd_rmrks,
							nullValue()
						).as("trd_rmrks"),
						decode(
							S0_T2.purc_ddlv_flg,
							value(true),
							S0_T4.trd_d_rmrks,
							S0_T1.trd_d_rmrks
						).as("trd_d_rmrks"),
						S0_T3.slo_no,
						cases()
							.when(S0_T2.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.SLS.value())))
								.then(S0_T2.slo_d_no)
							.when(S0_T2.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.SHIP.value())))
								.then(S0_T2.slo_d_no)
							.otherwise(S0_T2.xfr_schd_no).as("ship_rqst_no"),
						S0_T2.slo_d_no,
						S0_T2.xfr_schd_no,
						trunc(
							nvl(
									nvl(
										S0_T1.pd_inst_dlv_tm,
										S0_T2.dlv_rqst_tm
									),
									nvl(
										S0_T4.dlv_rqst_tm,
										S0_T6.gr_rqst_tm
									)
								),
							MCDateFmt.DD
						).as("dlv_rqst_dt"),
						nvl(
								nvl(
									S0_T1.pd_inst_dlv_tm,
									S0_T2.dlv_rqst_tm
								),
								nvl(
									S0_T4.dlv_rqst_tm,
									S0_T6.gr_rqst_tm
								)
							).as("dlv_rqst_hm"),
						trunc(
								S0_T10.ship_inst_tm,
								MCDateFmt.DD
							).as("ship_inst_dt"),
						S0_T10.ship_inst_tm.as("ship_inst_hm"),
						coalesce(
							S0_T3.trd_cur_cd,
							S0_T5.trd_cur_cd,
							S0_T6.trd_cur_cd
						).as("trd_cur_cd"),
						coalesce(
							S0_M14.cur_nm,
							S0_M15.cur_nm,
							S0_M16.cur_nm
						).as("trd_cur_nm"),
						coalesce(
							S0_M14.upri_dec_place,
							S0_M15.upri_dec_place,
							S0_M16.upri_dec_place
						).as("trd_cur_upri_dec_place"),
						coalesce(
							S0_M14.amt_dec_place,
							S0_M15.amt_dec_place,
							S0_M16.amt_dec_place
						).as("trd_cur_amt_dec_place"),
						decode(
							S0_T2.trd_ptn_typ,
							value(MAC_TRD_PTN_TYP.SLS.value()),
							S0_T4.trd_unit_cd,
							value(MAC_TRD_PTN_TYP.SHIP.value()),
							S0_T4.trd_unit_cd,
							value(MAC_TRD_PTN_TYP.PROV.value()),
							S0_T6.trd_unit_cd,
							nullValue()
						).as("schd_trd_unit_cd"),
						decode(
							S0_T2.trd_ptn_typ,
							value(MAC_TRD_PTN_TYP.SLS.value()),
							S0_T4.trd_unit_qty,
							value(MAC_TRD_PTN_TYP.SHIP.value()),
							S0_T4.trd_unit_qty,
							value(MAC_TRD_PTN_TYP.PROV.value()),
							S0_T6.trd_unit_qty,
							nullValue()
						).as("schd_trd_unit_qty"),
						S0_M27.dec_place.as("schd_trd_unit_dec_place"),
						S0_M27.conv_base_qty.as("schd_trd_unit_conv_base_qty"),
						S0_M27.conv_qty.as("schd_trd_unit_conv_qty"),
						S0_M27.rnd_typ.as("schd_trd_unit_rnd_typ"),
						decode(
							S0_T2.trd_ptn_typ,
							value(MAC_TRD_PTN_TYP.SLS.value()),
							S0_T4.base_unit_qty,
							value(MAC_TRD_PTN_TYP.SHIP.value()),
							S0_T4.base_unit_qty,
							value(MAC_TRD_PTN_TYP.PROV.value()),
							S0_T6.base_unit_qty,
							nullValue()
						).as("schd_base_unit_qty"),
						S0_T4.trd_cur_dscnt_amt.as("schd_trd_cur_dscnt_amt"),
						S0_T4.iv_amt.as("schd_iv_amt"),
						decode(
							S0_T2.trd_ptn_typ,
							value(MAC_TRD_PTN_TYP.SLS.value()),
							S0_T4.trd_cur_upri,
							value(MAC_TRD_PTN_TYP.PROV.value()),
							S0_T5.trd_cur_upri,
							nullValue()
						).as("schd_trd_cur_upri"),
						decode(
							S0_T2.trd_ptn_typ,
							value(MAC_TRD_PTN_TYP.SLS.value()),
							S0_T4.trd_cur_amt,
							value(MAC_TRD_PTN_TYP.PROV.value()),
							S0_T5.trd_cur_amt,
							nullValue()
						).as("schd_trd_cur_amt"),
						decode(
							S0_T2.trd_ptn_typ,
							value(MAC_TRD_PTN_TYP.SLS.value()),
							S0_T4.trd_cur_tax_amt,
							value(MAC_TRD_PTN_TYP.PROV.value()),
							S0_T5.trd_cur_tax_amt,
							nullValue()
						).as("schd_trd_cur_tax_amt"),
						S0_T4.wtax_rate,
						S0_T4.wtax_amt.as("schd_wtax_amt"),
						S0_T2.trd_ptn_typ,
						S0_T6.prov_basis_typ,
						nvl(
							decode(
								S0_T2.trd_ptn_typ,
								value(MAC_TRD_PTN_TYP.SLS.value()),
								S0_M13.sls_amt_rnd_typ,
								value(MAC_TRD_PTN_TYP.SHIP.value()),
								S0_M13.sls_amt_rnd_typ,
								value(MAC_TRD_PTN_TYP.PROV.value()),
								S0_M26.prov_amt_rnd_typ,
								value(MAC_RND_TYP.RNDOFF.value())
							),
							value(MAC_RND_TYP.RNDOFF.value())
						).as("trd_amt_rnd_typ"),
						nvl(
							decode(
								S0_T2.trd_ptn_typ,
								value(MAC_TRD_PTN_TYP.SLS.value()),
								S0_M13.sls_tax_rnd_typ,
								value(MAC_TRD_PTN_TYP.SHIP.value()),
								S0_M13.sls_tax_rnd_typ,
								value(MAC_TRD_PTN_TYP.PROV.value()),
								S0_M26.prov_tax_rnd_typ,
								value(MAC_RND_TYP.RNDOFF.value())
							),
							value(MAC_RND_TYP.RNDOFF.value())
						).as("trd_tax_rnd_typ"),
						S0_T2.purc_ddlv_flg,
						S0_T2.ship_pr_no,
						S0_T2.ship_inst_typ,
						S0_T2.upd_cntr.as("ship_pr_upd_cntr"),
						S0_T3.trnspt_cd,
						S0_T3.vssl_flght,
						S0_T3.load_port_cd,
						S0_T3.etd_dt,
						S0_T3.dschrg_port_cd,
						S0_T3.eta_dt,
						S0_T3.via_port_cd,
						S0_T3.via_schd_dt,
						S0_T3.tterm_cd1,
						S0_T3.tterm_rmrks1,
						S0_T3.tterm_cd2,
						S0_T3.tterm_rmrks2,
						S0_T3.tterm_cd3,
						S0_T3.tterm_rmrks3,
						decode(
							S0_T2.trd_ptn_typ,
							value(MAC_TRD_PTN_TYP.SLS.value()),
							S0_T3.xrate,
							value(MAC_TRD_PTN_TYP.PROV.value()),
							S0_T5.xrate,
							value(MAC_TRD_PTN_TYP.XFR.value()),
							S0_T6.xrate,
							value(MAC_TRD_PTN_TYP.XFR_RTN.value()),
							S0_T6.xrate,
							nullValue()
						).as("xrate"),
						decode(
							S0_T2.trd_ptn_typ,
							value(MAC_TRD_PTN_TYP.SLS.value()),
							S0_T3.ptax_xrate,
							value(MAC_TRD_PTN_TYP.PROV.value()),
							S0_T5.ptax_xrate,
							value(MAC_TRD_PTN_TYP.XFR.value()),
							S0_T6.ptax_xrate,
							value(MAC_TRD_PTN_TYP.XFR_RTN.value()),
							S0_T6.ptax_xrate,
							nullValue()
						).as("ptax_xrate"),
						S0_T8.purc_schd_no,
						S0_T8.purc_act_d_no,
						S0_T1.pr_sts_typ
					)
					.from(
						S0_T1
						.innerJoin(S0_T2).on(
							bracket(
								S0_T1.ship_pr_no.eq(S0_T2.ship_pr_no)
							)
						)
						.leftOuterJoin(S0_T4).on(
							bracket(
								S0_T4.slo_d_no.eq(S0_T2.slo_d_no)
							)
						)
						.leftOuterJoin(S0_T3).on(
							bracket(
								S0_T3.slo_no.eq(S0_T4.slo_no)
							)
						)
						.leftOuterJoin(S0_T9).on(
							bracket(
								S0_T1.ship_inst_d_no.eq(S0_T9.ship_inst_d_no)
							)
						)
						.leftOuterJoin(S0_T10).on(
								bracket(
									S0_T9.ship_inst_no.eq(S0_T10.ship_inst_no)
								)
							)
						.leftOuterJoin(S0_T5).on(
							bracket(
								S0_T1.ship_schd_no.eq(S0_T5.prov_src_schd_no1)
								.and(MAC_TRD_PTN_TYP$IS_PROV(S0_T5.trd_ptn_typ).eq(value(true)))
							)
						)
						.leftOuterJoin(S0_T6).on(
							bracket(
								S0_T2.xfr_schd_no.eq(S0_T6.xfr_schd_no)
							)
						)
						.leftOuterJoin(S0_M1).on(
							bracket(
								S0_T1.itm_cd.eq(S0_M1.itm_cd)
								.and(S0_T1.itm_sub1.eq(S0_M1.itm_sub1))
								.and(S0_T1.itm_sub2.eq(S0_M1.itm_sub2))
								.and(S0_T1.itm_sub3.eq(S0_M1.itm_sub3))
							)
						)
						.leftOuterJoin(S0_T8).on(
							bracket(
								S0_T1.ship_schd_no.eq(S0_T8.ship_schd_no)
							)
						)
						.leftOuterJoin(S0_M2).on(
							bracket(
								coalesce(
									S0_T4.cntry_org_cd,
									S0_M1.cntry_org_cd
								).eq(S0_M2.cntry_cd)
							)
						)
						.leftOuterJoin(S0_M6).on(
							bracket(
								decode(
									S0_T2.trd_ptn_typ,
									value(MAC_TRD_PTN_TYP.SLS.value()),
									S0_T4.tax_cd,
									value(MAC_TRD_PTN_TYP.PROV.value()),
									S0_T5.tax_cd,
									nullValue()
								).eq(S0_M6.tax_cd)
							)
						)
						.leftOuterJoin(S0_M8).on(
							bracket(
								S0_T2.bd_dpt_cd.eq(S0_M8.dpt_cd)
								.and(
									coalesce(
										S0_T3.slo_dt,
										S0_T6.rcpt_dt
									).between(S0_M8.st_dt, S0_M8.end_dt)
								)
							)
						)
						.leftOuterJoin(S0_M10).on(
							bracket(
								S0_T3.ar_dpt_cd.eq(S0_M10.dpt_cd)
								.and(S0_T3.slo_dt.between(S0_M10.st_dt, S0_M10.end_dt))
							)
						)
						.leftOuterJoin(S0_M11).on(
							bracket(
								S0_T3.sls_dpt_cd.eq(S0_M11.dpt_cd)
								.and(S0_T3.slo_dt.between(S0_M11.st_dt, S0_M11.end_dt))
							)
						)
						.leftOuterJoin(S0_M13).on(
							bracket(
								S0_T2.cst_cd.eq(S0_M13.bp_cd)
							)
						)
						.leftOuterJoin(S0_M14).on(
							bracket(
								S0_T3.trd_cur_cd.eq(S0_M14.cur_cd)
							)
						)
						.leftOuterJoin(S0_M15).on(
							bracket(
								S0_T5.trd_cur_cd.eq(S0_M15.cur_cd)
							)
						)
						.leftOuterJoin(S0_M16).on(
							bracket(
								S0_T6.trd_cur_cd.eq(S0_M16.cur_cd)
							)
						)
						.leftOuterJoin(S0_M23).on(
							bracket(
								S0_T1.itm_cd.eq(S0_M23.itm_cd)
								.and(S0_T1.itm_sub1.eq(S0_M23.itm_sub1))
								.and(S0_T1.itm_sub2.eq(S0_M23.itm_sub2))
								.and(S0_T1.itm_sub3.eq(S0_M23.itm_sub3))
								.and(S0_T1.sno1.eq(S0_M23.sno1))
								.and(S0_T1.sno2.eq(S0_M23.sno2))
								.and(S0_T1.sno3.eq(S0_M23.sno3))
								.and(S0_T1.sno4.eq(S0_M23.sno4))
							)
						)
						.leftOuterJoin(S0_M24).on(
							bracket(
								S0_T2.dlv_id_cd.eq(S0_M24.loc_cd)
							)
						)
						.leftOuterJoin(S0_M241).on(
							bracket(
								nvl(
									S0_T1.dlv_cd,
									S0_T2.dlv_id_cd
								).eq(S0_M241.bp_cd)
							)
						)
						.leftOuterJoin(S0_M25).on(
							bracket(
								S0_T1.itm_cd.eq(S0_M25.itm_cd)
								.and(S0_T1.itm_sub1.eq(S0_M25.itm_sub1))
								.and(S0_T1.itm_sub2.eq(S0_M25.itm_sub2))
								.and(S0_T1.itm_sub3.eq(S0_M25.itm_sub3))
								.and(
									bracket(
										S0_T2.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.SLS.value()))
										.and(S0_M241.prnt_lcl_cd.eq(S0_M25.lcl_cd))
									)
									.or(
										S0_T2.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.SHIP.value()))
										.and(S0_M241.prnt_lcl_cd.eq(S0_M25.lcl_cd))
										)
									.or(
										S0_T2.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.PROV.value()))
										.and(S0_M24.prnt_lcl_cd.eq(S0_M25.lcl_cd))
									)
									.or(
										S0_T2.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.XFR.value()))
										.and(S0_M24.prnt_lcl_cd.eq(S0_M25.lcl_cd))
									)
									.or(
										S0_T2.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.XFR_RTN.value()))
										.and(S0_M24.prnt_lcl_cd.eq(S0_M25.lcl_cd))
									)
								)
							)
						)
						.leftOuterJoin(S0_M26).on(
							bracket(
								S0_M24.sppl_cd.eq(S0_M26.bp_cd)
							)
						)
						.leftOuterJoin(S0_M27).on(
							bracket(
								S0_T1.itm_cd.eq(S0_M27.itm_cd)
								.and(S0_T1.itm_sub1.eq(S0_M27.itm_sub1))
								.and(S0_T1.itm_sub2.eq(S0_M27.itm_sub2))
								.and(S0_T1.itm_sub3.eq(S0_M27.itm_sub3))
								.and(
									decode(
										S0_T2.trd_ptn_typ,
										value(MAC_TRD_PTN_TYP.SLS.value()),
										S0_T4.trd_unit_cd,
										value(MAC_TRD_PTN_TYP.SHIP.value()),
										S0_T4.trd_unit_cd,
										value(MAC_TRD_PTN_TYP.PROV.value()),
										S0_T6.trd_unit_cd,
										nullValue()
									).eq(S0_M27.unit_cd)
								)
							)
						)
						.leftOuterJoin(S0_M93).on(
							bracket(
								S0_T6.itm_cd.eq(S0_M93.itm_cd)
								.and(S0_T6.itm_sub1.eq(S0_M93.itm_sub1))
								.and(S0_T6.itm_sub2.eq(S0_M93.itm_sub2))
								.and(S0_T6.itm_sub3.eq(S0_M93.itm_sub3))
								.and(S0_T6.gi_lg_grp_cd.eq(S0_M93.lg_grp_cd))
							)
						)
						.leftOuterJoin(S0_M94).on(
							bracket(
								S0_T6.gi_lg_grp_cd.eq(S0_M94.lg_grp_cd)
								.and(S0_M94.lg_def_flg.eq(value(true)))
								.and(S0_M94.del_flg.eq(value(false)))
							)
						)
					)
					.where(
						value(0).eq(value(0))
						.and(
							exists(
								subQuery()
								.select(value("X"))
								.from(S1_M91)
								.where(
									S0_M11.wg_cd.eq(S1_M91.wg_cd)
								)
							)
							.or(
								exists(
									subQuery()
									.select(value("X"))
									.from(S2_M95)
									.where(
										coalesce(
											S0_T6.gi_loc_cd,
											S0_M93.lg_def_loc_cd,
											S0_M94.loc_cd
										).eq(S2_M95.loc_cd)
									)
								)
							)
						)
						.and(
							bracket(
								S0_T2.purc_ddlv_flg.eq(value(false))
								.and(bind("purc_ddlv_flg_str").eq(value(false)))
							)
							.or(
								S0_T2.purc_ddlv_flg.eq(value(true))
								.and(bind("purc_ddlv_flg_str").eq(value(true)))
								.and(
									exists(
										subQuery()
										.select(value("X"))
										.from(
											S3_TX1
											.innerJoin(S3_TX2).on(
												bracket(
													S3_TX1.purc_schd_no.eq(S3_TX2.purc_schd_no)
												)
											)
											.innerJoin(S3_TX3).on(
												bracket(
													S3_TX2.arr_pr_no.eq(S3_TX3.arr_pr_no)
												)
											)
											.innerJoin(S3_TX4).on(
												bracket(
													S3_TX3.po_d_no.eq(S3_TX4.po_d_no)
												)
											)
											.innerJoin(S3_TX5).on(
												bracket(
													S3_TX4.po_no.eq(S3_TX5.po_no)
												)
											)
											.leftOuterJoin(S3_TX6).on(
												bracket(
													S3_TX5.sppl_cd.eq(S3_TX6.bp_cd)
												)
											)
										)
										.where(
											value(0).eq(value(0))
											.and(S0_T1.ship_schd_no.eq(S3_TX1.ship_schd_no))
											.and(S3_TX1.cmpl_flg.eq(value(false)))
											.and(S3_TX1.purc_schd_no.isNotNull())
											.and(S3_TX4.rqst_can_flg.eq(value(false)))
											.and(S3_TX6.sppl_iv_flg.eq(value(false)))
										)
									)
								)
							)
						)
						.and(S0_T1.base_unit_qty.subtract(S0_T1.abort_qty).subtract(S0_T1.iv_schd_qty).subtract(S0_T1.ship_ret_qty).gt(value(0)))
						.and(
							S0_T4.sls_cststk_flg.isNull()
							.or(S0_T4.sls_cststk_flg.eq(bind("sls_cststk_flg_str")))
						)
						.and(S0_T2.trd_ptn_typ.eq(bind("trd_ptn_typ")))
						.and(
							bracket(
								bind("is_slo_iv_no_str").eq(value(false))
								.and(S0_T3.iv_no.isNull())
							)
							.or(
								bind("is_slo_iv_no_str").eq(value(true))
								.and(S0_T3.iv_no.eq(bind("iv_no")))
							)
						)
						.and(S0_T2.dlv_id_typ.eq(bind("dlv_id_typ")))
						.and(
							bracket(
								S0_T2.cst_cd.eq(bind("ship_rqst_id_cd"))
								.and(S0_T2.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.SLS.value())))
							)
							.or(
								S0_T2.cst_cd.eq(bind("ship_rqst_id_cd"))
								.and(S0_T2.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.SHIP.value())))
							)
							.or(
								S0_T6.gr_loc_cd.eq(bind("ship_rqst_id_cd"))
								.and(
									S0_T2.trd_ptn_typ.in(
										value(MAC_TRD_PTN_TYP.XFR.value()),
										value(MAC_TRD_PTN_TYP.XFR_RTN.value())
									)
								)
							)
							.or(
								S0_M24.sppl_cd.eq(bind("ship_rqst_id_cd"))
								.and(S0_T2.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.PROV.value())))
							)
						)
						.and(
							nvl(
								S0_T1.dlv_cd,
								S0_T2.dlv_id_cd
							).eq(bind("dlv_id_cd"))
						)
						.and(
							bracket(
								nvl2(
									S0_T1.dlv_cd,
									S0_T1.dlv_zip_cd,
									S0_T2.dlv_zip_cd
								).eq(bind("dlv_zip_cd"))
							)
							.or(
								nvl2(
									S0_T1.dlv_cd,
									S0_T1.dlv_zip_cd,
									S0_T2.dlv_zip_cd
								).isNull()
								.and(bind("dlv_zip_cd").isNull())
							)
						)
						.and(
							bracket(
								nvl2(
									S0_T1.dlv_cd,
									S0_T1.dlv_addr1,
									S0_T2.dlv_addr1
								).eq(bind("dlv_addr1"))
							)
							.or(
								nvl2(
									S0_T1.dlv_cd,
									S0_T1.dlv_addr1,
									S0_T2.dlv_addr1
								).isNull()
								.and(bind("dlv_addr1").isNull())
							)
						)
						.and(
							bracket(
								nvl2(
									S0_T1.dlv_cd,
									S0_T1.dlv_addr2,
									S0_T2.dlv_addr2
								).eq(bind("dlv_addr2"))
							)
							.or(
								nvl2(
									S0_T1.dlv_cd,
									S0_T1.dlv_addr2,
									S0_T2.dlv_addr2
								).isNull()
								.and(bind("dlv_addr2").isNull())
							)
						)
						.and(
							bracket(
								nvl2(
									S0_T1.dlv_cd,
									S0_T1.dlv_addr3,
									S0_T2.dlv_addr3
								).eq(bind("dlv_addr3"))
							)
							.or(
								nvl2(
									S0_T1.dlv_cd,
									S0_T1.dlv_addr3,
									S0_T2.dlv_addr3
								).isNull()
								.and(bind("dlv_addr3").isNull())
							)
						)
						.and(
							bracket(
								nvl2(
									S0_T1.dlv_cd,
									S0_T1.dlv_addr4,
									S0_T2.dlv_addr4
								).eq(bind("dlv_addr4"))
							)
							.or(
								nvl2(
									S0_T1.dlv_cd,
									S0_T1.dlv_addr4,
									S0_T2.dlv_addr4
								).isNull()
								.and(bind("dlv_addr4").isNull())
							)
						)
						.and(
							bracket(
								nvl2(
									S0_T1.dlv_cd,
									S0_T1.dlv_cntct_dpt,
									S0_T2.dlv_cntct_dpt
								).eq(bind("dlv_cntct_dpt"))
							)
							.or(
								nvl2(
									S0_T1.dlv_cd,
									S0_T1.dlv_cntct_dpt,
									S0_T2.dlv_cntct_dpt
								).isNull()
								.and(bind("dlv_cntct_dpt").isNull())
							)
						)
						.and(
							bracket(
								nvl2(
									S0_T1.dlv_cd,
									S0_T1.dlv_cntct_psn,
									S0_T2.dlv_cntct_psn
								).eq(bind("dlv_cntct_psn"))
							)
							.or(
								nvl2(
									S0_T1.dlv_cd,
									S0_T1.dlv_cntct_psn,
									S0_T2.dlv_cntct_psn
								).isNull()
								.and(bind("dlv_cntct_psn").isNull())
							)
						)
						.and(
							bracket(
								nvl2(
									S0_T1.dlv_cd,
									S0_T1.dlv_tel,
									S0_T2.dlv_tel
								).eq(bind("dlv_tel"))
							)
							.or(
								nvl2(
									S0_T1.dlv_cd,
									S0_T1.dlv_tel,
									S0_T2.dlv_tel
								).isNull()
								.and(bind("dlv_tel").isNull())
							)
						)
						.and(
							bracket(
								nvl2(
									S0_T1.dlv_cd,
									S0_T1.dlv_fax,
									S0_T2.dlv_fax
								).eq(bind("dlv_fax"))
							)
							.or(
								nvl2(
									S0_T1.dlv_cd,
									S0_T1.dlv_fax,
									S0_T2.dlv_fax
								).isNull()
								.and(bind("dlv_fax").isNull())
							)
						)
						.and(
							nvl2(
								S0_T1.dlv_cd,
								S0_T1.dlv_sundry_flg,
								S0_T2.dlv_sundry_flg
							).eq(value(false))
							.or(
								nvl2(
									S0_T1.dlv_cd,
									S0_T1.dlv_sundry_flg,
									S0_T2.dlv_sundry_flg
								).eq(value(true))
								.and(
									bracket(
										nvl2(
											S0_T1.dlv_cd,
											S0_T1.dlv_nm,
											S0_T2.dlv_id_nm
										).eq(bind("dlv_id_nm"))
									)
									.or(
										nvl2(
											S0_T1.dlv_cd,
											S0_T1.dlv_nm,
											S0_T2.dlv_id_nm
										).isNull()
										.and(bind("dlv_id_nm").isNull())
									)
								)
							)
						)
						.and(
							nvl(
								S0_T1.via_dlv_typ,
								S0_T2.via_dlv_typ
							).eq(bind("via_dlv_typ"))
						)
						.and(
							bracket(
								MAC_VIA_DLV_TYP$IS_VIA(
									nvl(
										S0_T1.via_dlv_typ,
										S0_T2.via_dlv_typ
									)
								).eq(value(true))
								.and(
									nvl(
										S0_T1.tdlv_cd,
										S0_T2.ship_to_id_cd
									).eq(bind("tdlv_cd"))
								)
								.and(
									bracket(
										nvl2(
											S0_T1.tdlv_cd,
											S0_T1.tdlv_zip_cd,
											S0_T2.ship_to_zip_cd
										).eq(bind("tdlv_zip_cd"))
									)
									.or(
										nvl2(
											S0_T1.tdlv_cd,
											S0_T1.tdlv_zip_cd,
											S0_T2.ship_to_zip_cd
										).isNull()
										.and(bind("tdlv_zip_cd").isNull())
									)
								)
								.and(
									bracket(
										nvl2(
											S0_T1.tdlv_cd,
											S0_T1.tdlv_addr1,
											S0_T2.ship_to_addr1
										).eq(bind("tdlv_addr1"))
									)
									.or(
										nvl2(
											S0_T1.tdlv_cd,
											S0_T1.tdlv_addr1,
											S0_T2.ship_to_addr1
										).isNull()
										.and(bind("tdlv_addr1").isNull())
									)
								)
								.and(
									bracket(
										nvl2(
											S0_T1.tdlv_cd,
											S0_T1.tdlv_addr2,
											S0_T2.ship_to_addr2
										).eq(bind("tdlv_addr2"))
									)
									.or(
										nvl2(
											S0_T1.tdlv_cd,
											S0_T1.tdlv_addr2,
											S0_T2.ship_to_addr2
										).isNull()
										.and(bind("tdlv_addr2").isNull())
									)
								)
								.and(
									bracket(
										nvl2(
											S0_T1.tdlv_cd,
											S0_T1.tdlv_addr3,
											S0_T2.ship_to_addr3
										).eq(bind("tdlv_addr3"))
									)
									.or(
										nvl2(
											S0_T1.tdlv_cd,
											S0_T1.tdlv_addr3,
											S0_T2.ship_to_addr3
										).isNull()
										.and(bind("tdlv_addr3").isNull())
									)
								)
								.and(
									bracket(
										nvl2(
											S0_T1.tdlv_cd,
											S0_T1.tdlv_addr4,
											S0_T2.ship_to_addr4
										).eq(bind("tdlv_addr4"))
									)
									.or(
										nvl2(
											S0_T1.tdlv_cd,
											S0_T1.tdlv_addr4,
											S0_T2.ship_to_addr4
										).isNull()
										.and(bind("tdlv_addr4").isNull())
									)
								)
								.and(
									bracket(
										nvl2(
											S0_T1.tdlv_cd,
											S0_T1.tdlv_cntct_dpt,
											S0_T2.ship_to_cntct_dpt
										).eq(bind("tdlv_cntct_dpt"))
									)
									.or(
										nvl2(
											S0_T1.tdlv_cd,
											S0_T1.tdlv_cntct_dpt,
											S0_T2.ship_to_cntct_dpt
										).isNull()
										.and(bind("tdlv_cntct_dpt").isNull())
									)
								)
								.and(
									bracket(
										nvl2(
											S0_T1.tdlv_cd,
											S0_T1.tdlv_cntct_psn,
											S0_T2.ship_to_cntct_psn
										).eq(bind("tdlv_cntct_psn"))
									)
									.or(
										nvl2(
											S0_T1.tdlv_cd,
											S0_T1.tdlv_cntct_psn,
											S0_T2.ship_to_cntct_psn
										).isNull()
										.and(bind("tdlv_cntct_psn").isNull())
									)
								)
								.and(
									bracket(
										nvl2(
											S0_T1.tdlv_cd,
											S0_T1.tdlv_tel,
											S0_T2.ship_to_tel
										).eq(bind("tdlv_tel"))
									)
									.or(
										nvl2(
											S0_T1.tdlv_cd,
											S0_T1.tdlv_tel,
											S0_T2.ship_to_tel
										).isNull()
										.and(bind("tdlv_tel").isNull())
									)
								)
								.and(
									bracket(
										nvl2(
											S0_T1.tdlv_cd,
											S0_T1.tdlv_fax,
											S0_T2.ship_to_fax
										).eq(bind("tdlv_fax"))
									)
									.or(
										nvl2(
											S0_T1.tdlv_cd,
											S0_T1.tdlv_fax,
											S0_T2.ship_to_fax
										).isNull()
										.and(bind("tdlv_fax").isNull())
									)
								)
								.and(
									nvl2(
										S0_T1.tdlv_cd,
										S0_T1.tdlv_sundry_flg,
										S0_T2.ship_to_sundry_flg
									).eq(value(false))
									.or(
										nvl2(
											S0_T1.tdlv_cd,
											S0_T1.tdlv_sundry_flg,
											S0_T2.ship_to_sundry_flg
										).eq(value(true))
										.and(
											bracket(
												nvl2(
													S0_T1.tdlv_cd,
													S0_T1.tdlv_nm,
													S0_T2.ship_to_id_nm
												).eq(bind("tdlv_nm"))
											)
											.or(
												nvl2(
													S0_T1.tdlv_cd,
													S0_T1.tdlv_nm,
													S0_T2.ship_to_id_nm
												).isNull()
												.and(bind("tdlv_id_nm").isNull())
											)
										)
									)
								)
							)
							.or(
								MAC_VIA_DLV_TYP$IS_NOT_VIA(
									nvl(
										S0_T1.via_dlv_typ,
										S0_T2.via_dlv_typ
									)
								).eq(value(true))
							)
						)
						.and(
							bracket(
								S0_T3.sls_basis_typ.eq(bind("sls_basis_typ"))
							)
							.or(
								S0_T3.sls_basis_typ.isNull()
								.and(bind("sls_basis_typ").isNull())
							)
						)
						.and(
							bracket(
								S0_T6.prov_basis_typ.eq(bind("prov_basis_typ"))
							)
							.or(
								S0_T6.prov_basis_typ.isNull()
								.and(bind("prov_basis_typ").isNull())
							)
						)
						.and(
							bracket(
								S0_T2.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.SLS.value()))
								.and(
									S0_T3.trd_cur_cd.eq(bind("trd_cur_cd"))
									.or(
										S0_T3.trd_cur_cd.isNull()
										.and(bind("trd_cur_cd").isNull())
									)
								)
							)
							.or(
								S0_T2.trd_ptn_typ.in(
									value(MAC_TRD_PTN_TYP.SHIP.value()),
									value(MAC_TRD_PTN_TYP.XFR.value()),
									value(MAC_TRD_PTN_TYP.XFR_RTN.value())
								)
							)
							.or(
								S0_T2.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.PROV.value()))
								.and(
									bracket(
										bracket(
											S0_T6.trd_cur_cd.eq(bind("trd_cur_cd"))
											.or(S0_T6.trd_cur_cd.isNull())
										)
										.and(bind("trd_cur_cd").isNotNull())
									)
									.or(
										S0_T6.trd_cur_cd.isNull()
										.and(bind("trd_cur_cd").isNull())
									)
								)
							)
						)
						.and(
							not(
								exists(
									subQuery()
									.select(value("X"))
									.from(S4_WK)
									.where(
										S0_T1.ship_schd_no.eq(S4_WK.ship_schd_no)
									)
								)
							)
						)
					)
					.orderBy(
							S0_T1.ship_schd_no.asc()
					)
			)
			.setJoinInfo(
				joinInfo(
					j -> j
						.add(MSVT_WRK_SNO_R.class, r -> toCondition(
							r.getStringNE("sno1")
						))
						.addSelect(m -> toArray(
							m.wrk_nm,
							m.wrk_no
						))
						.addMap((r, m) -> {
							r.setStringNE("wrk_no", m.wrk_no());
							r.setStringNE("wrk_nm", m.wrk_nm());
					}),
					j -> j
						.add(MAM_UNIT_R.class, r -> toCondition(
							r.getStringNE("trd_unit_cd")
						))
						.addSelect(m -> toArray(
							m.unit_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("trd_unit_nm", m.unit_nm());
					}),
					j -> j
						.add(MAM_UNIT_R.class, r -> toCondition(
							r.getStringNE("base_unit_cd")
						))
						.addSelect(m -> toArray(
							m.unit_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("base_unit_nm", m.unit_nm());
					}),
					j -> j
						.add(MAM_STK_GD_R.class, r -> toCondition(
							r.getStringNE("gd_cd")
						))
						.addSelect(m -> toArray(
							m.gd_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("gd_nm", m.gd_nm());
					}),
					j -> j
						.add(MAM_BIZ_RSN_R.class, r -> toCondition(
							r.getStringNE("rsn_cd")
						))
						.addSelect(m -> toArray(
							m.biz_rsn_nm,
							m.sls_acxfr_flg
						))
						.addMap((r, m) -> {
							r.setStringNE("rsn_nm", m.biz_rsn_nm());
							r.setBooleanNE("sls_acxfr_flg", m.sls_acxfr_flg());
					}),
					j -> j
						.add(MAM_USR_R.class, r -> toCondition(
							r.getStringNE("sls_usr_cd")
						))
						.addSelect(m -> toArray(
							m.usr_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("sls_usr_nm", m.usr_nm());
					}),
					j -> j
						.add(MAM_BIZ_RSN_R.class, r -> toCondition(
							r.getStringNE("dscnt_rsn_cd")
						))
						.addSelect(m -> toArray(
							m.biz_rsn_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("dscnt_rsn_nm", m.biz_rsn_nm());
					}),
					j -> j
						.add(MAVM_ITM_UNIT_R.class, r -> toCondition(
							r.getStringNE("itm_cd"),
							r.getStringNE("itm_sub1"),
							r.getStringNE("itm_sub2"),
							r.getStringNE("itm_sub3"),
							r.getStringNE("trd_unit_cd")
						))
						.addSelect(m -> toArray(
							m.conv_base_qty,
							m.conv_qty,
							m.dec_place,
							m.rnd_typ
						))
						.addMap((r, m) -> {
							r.setNumberNE("trd_unit_conv_base_qty", m.conv_base_qty());
							r.setNumberNE("trd_unit_conv_qty", m.conv_qty());
							r.setNumberNE("trd_unit_dec_place", m.dec_place());
							r.setStringNE("trd_unit_rnd_typ", m.rnd_typ());
					}),
					j -> j
						.add(MAM_TRNSPT_R.class, r -> toCondition(
							r.getStringNE("trnspt_cd")
						))
						.addSelect(m -> toArray(
							m.trnspt_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("trnspt_nm", m.trnspt_nm());
					}),
					j -> j
						.add(MAM_EXIM_PORT_R.class, r -> toCondition(
							r.getStringNE("load_port_cd")
						))
						.addSelect(m -> toArray(
							m.port_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("load_port_nm", m.port_nm());
					}),
					j -> j
						.add(MAM_EXIM_PORT_R.class, r -> toCondition(
							r.getStringNE("dschrg_port_cd")
						))
						.addSelect(m -> toArray(
							m.port_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("dschrg_port_nm", m.port_nm());
					}),
					j -> j
						.add(MAM_EXIM_PORT_R.class, r -> toCondition(
							r.getStringNE("via_port_cd")
						))
						.addSelect(m -> toArray(
							m.port_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("via_port_nm", m.port_nm());
					}),
					j -> j
						.add(MAM_TRD_R.class, r -> toCondition(
							r.getStringNE("trd_cd")
						))
						.addSelect(m -> toArray(
							m.trd_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("trd_nm", m.trd_nm());
					}),
					j -> j
						.add(MAM_TTERM_R.class, r -> toCondition(
							r.getStringNE("tterm_cd1")
						))
						.addSelect(m -> toArray(
							m.tterm_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("tterm_nm1", m.tterm_nm());
					}),
					j -> j
						.add(MAM_TTERM_R.class, r -> toCondition(
							r.getStringNE("tterm_cd2")
						))
						.addSelect(m -> toArray(
							m.tterm_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("tterm_nm2", m.tterm_nm());
					}),
					j -> j
						.add(MAM_TTERM_R.class, r -> toCondition(
							r.getStringNE("tterm_cd3")
						))
						.addSelect(m -> toArray(
							m.tterm_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("tterm_nm3", m.tterm_nm());
					}),
					j -> j
						.add(MAM_LG_GRP_R.class, r -> toCondition(
							r.getStringNE("ship_fr_lg_grp_cd")
						))
						.addSelect(m -> toArray(
							m.lg_grp_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("ship_fr_lg_grp_nm", m.lg_grp_nm());
					})
				)
			);
	}
	/**
	 * -- MSBEL1730_MST_SHIP_INST_D_Query_S01
	 */
	static MCQueryPlan MSBEL1730_MST_SHIP_INST_D_S01() {
		MST_SHIP_INST_D_R S0_SHIPINSTD = MST_SHIP_INST_D_R.create("SHIPINSTD");
		MST_SHIP_INST_R S0_SHIPINST = MST_SHIP_INST_R.create("SHIPINST");
		MSW_SHIP_INST_D_KEY_R S0_SHIPINSTDWK = MSW_SHIP_INST_D_KEY_R.create("SHIPINSTDWK");
		MST_SHIP_PR_R S0_SHIPPR = MST_SHIP_PR_R.create("SHIPPR");
		MST_SLO_D_R S0_SLOD = MST_SLO_D_R.create("SLOD");
		MST_SLO_R S0_SLO = MST_SLO_R.create("SLO");
		MST_PROV_SCHD_R S0_PROVSCHD = MST_PROV_SCHD_R.create("PROVSCHD");
		MST_XFR_SCHD_R S0_XFRSCHD = MST_XFR_SCHD_R.create("XFRSCHD");
		MST_SLS_SCHD_R S0_SLSSCHD = MST_SLS_SCHD_R.create("SLSSCHD");
		MST_SHIP_SCHD_R S0_SHIPSCHD = MST_SHIP_SCHD_R.create("SHIPSCHD");
		MAM_ITM_R S0_ITM = MAM_ITM_R.create("ITM");
		MAM_CNTRY_R S0_CNTRY = MAM_CNTRY_R.create("CNTRY");
		MAM_TAX_R S0_TAX = MAM_TAX_R.create("TAX");
		MAM_DPT_R S0_BDDPT = MAM_DPT_R.create("BDDPT");
		MAM_DPT_R S0_ARDPT = MAM_DPT_R.create("ARDPT");
		MAM_DPT_R S0_SLSDPT = MAM_DPT_R.create("SLSDPT");
		MAM_BP_R S0_CST = MAM_BP_R.create("CST");
		MAM_SUNDRY_ITM_R S0_SUNDRYITM = MAM_SUNDRY_ITM_R.create("SUNDRYITM");
		MAM_LOC_R S0_LOC = MAM_LOC_R.create("LOC");
		MAM_BP_R S0_DLV = MAM_BP_R.create("DLV");
		MAM_ITM_LCL_R S0_ITMLCL = MAM_ITM_LCL_R.create("ITMLCL");
		MAM_BP_R S0_SPPL = MAM_BP_R.create("SPPL");
		MAVM_ITM_UNIT_R S0_ITMUNIT = MAVM_ITM_UNIT_R.create("ITMUNIT");
		MAM_CUR_R S0_TRDCUR = MAM_CUR_R.create("TRDCUR");
		MAM_ITM_LG_GRP_R S0_ITMLGGRP = MAM_ITM_LG_GRP_R.create("ITMLGGRP");
		MAM_LOC_R S0_GILOC = MAM_LOC_R.create("GILOC ");
		MCTempView S1_VIVSHIPINSTMAP = createTempView("VIVSHIPINSTMAP");
		MST_IV_SHIP_INST_MAP_R S1_IVSHIPINSTMAP = MST_IV_SHIP_INST_MAP_R.create("IVSHIPINSTMAP");
		MAVM_RD_WG_R S2_RDWG = MAVM_RD_WG_R.create("RDWG");
		MAVM_RD_LOC_R S3_RDLOC = MAVM_RD_LOC_R.create("RDLOC");
		MST_SLS_SCHD_R S4_SLSSCHD = MST_SLS_SCHD_R.create("SLSSCHD");
		MST_PURC_SCHD_R S4_PURCSCHD = MST_PURC_SCHD_R.create("PURCSCHD");
		MST_ARR_PR_R S4_ARRPR = MST_ARR_PR_R.create("ARRPR");
		MST_PO_D_R S4_POD = MST_PO_D_R.create("POD");
		MST_PO_R S4_PO = MST_PO_R.create("PO");
		MAM_BP_R S4_SPPL = MAM_BP_R.create("SPPL");
		
		return createQueryPlan()
			.setQuery(
				sql("MSBEL1730_MST_SHIP_INST_D_Query_S01")
					.mainQuery()
					.select(
						value(true).as("existed_flg"),
						S0_SHIPSCHD.ship_schd_no,
						S0_SHIPINSTD.ship_inst_d_no,
						S0_SHIPINSTD.ship_inst_no,
						S0_SHIPINSTD.itm_cd,
						S0_SHIPINSTD.itm_sub1,
						S0_SHIPINSTD.itm_sub2,
						S0_SHIPINSTD.itm_sub3,
						cases()
							.when(S0_SHIPINSTD.sundry_itm_flg.eq(value(true)))
								.then(
									nvl(
										S0_SHIPINSTD.itm_nm,
										S0_SUNDRYITM.itm_nm
									)
							)
							.otherwise(S0_ITM.itm_nm).as("itm_nm"),
						S0_SHIPINSTD.sundry_itm_flg,
						S0_ITM.sls_upri_cng_flg,
						S0_ITM.stk_mng_typ,
						S0_ITM.asset_mng_typ,
						S0_ITM.sno1_mng_typ,
						S0_ITM.sno2_mng_typ,
						S0_ITM.sno3_mng_typ,
						S0_ITM.sno4_mng_typ,
						S0_ITM.dscnt_itm_flg,
						S0_ITM.exim_xpns_typ,
						cases()
							.when(S0_SHIPINSTD.sundry_itm_flg.eq(value(true)))
								.then(
									nvl(
										S0_SHIPINSTD.iv_itm_nm,
										S0_SUNDRYITM.itm_nm
									)
							)
							.otherwise(
								nvl(
									S0_ITMLCL.itm_nm,
									S0_ITM.itm_nm
								)
							).as("iv_itm_nm"),
						coalesce(
							S0_SLOD.cntry_org_cd,
							S0_ITM.cntry_org_cd
						).as("cntry_org_cd"),
						S0_CNTRY.cntry_nm.as("cntry_org_nm"),
						nvl(
							decode(
								S0_SHIPPR.trd_ptn_typ,
								value(MAC_TRD_PTN_TYP.SLS.value()),
								S0_CST.sls_amt_rnd_typ,
								value(MAC_TRD_PTN_TYP.PROV.value()),
								S0_SPPL.prov_amt_rnd_typ,
								value(MAC_RND_TYP.RNDOFF.value())
							),
							value(MAC_RND_TYP.RNDOFF.value())
						).as("trd_amt_rnd_typ"),
						nvl(
							decode(
								S0_SHIPPR.trd_ptn_typ,
								value(MAC_TRD_PTN_TYP.SLS.value()),
								S0_CST.sls_tax_rnd_typ,
								value(MAC_TRD_PTN_TYP.PROV.value()),
								S0_SPPL.prov_tax_rnd_typ,
								value(MAC_RND_TYP.RNDOFF.value())
							),
							value(MAC_RND_TYP.RNDOFF.value())
						).as("trd_tax_rnd_typ"),
						decode(
							S0_SLOD.trd_unit_cd,
							nullValue(),
							S0_SHIPSCHD.trd_unit_cd,
							S0_SLOD.trd_unit_cd
						).as("trd_unit_cd"),
						nullValue().as("trd_unit_qty"),
						S0_SHIPINSTD.base_unit_cd,
						bracket(
							S0_SHIPINSTD.base_unit_qty.subtract(S0_SHIPINSTD.abort_qty).subtract(nvl(S1_VIVSHIPINSTMAP.pr("iv_qty"), value(0))).subtract(S0_SHIPSCHD.ship_ret_qty)
						).as("base_unit_qty"),
						bracket(
							S0_SHIPINSTD.base_unit_qty.subtract(S0_SHIPINSTD.abort_qty).subtract(nvl(S1_VIVSHIPINSTMAP.pr("iv_qty"), value(0))).subtract(S0_SHIPSCHD.ship_ret_qty)
						).as("max_base_unit_qty"),
						S0_ITM.dec_place.as("base_unit_dec_place"),
						S0_ITM.rnd_typ.as("base_unit_rnd_typ"),
						S0_SHIPINSTD.gd_cd,
						S0_SHIPPR.trd_cd,
						decode(
							S0_SHIPPR.trd_ptn_typ,
							value(MAC_TRD_PTN_TYP.SLS.value()),
							S0_SLOD.trd_unit_cd,
							value(MAC_TRD_PTN_TYP.SHIP.value()),
							S0_SLOD.trd_unit_cd,
							value(MAC_TRD_PTN_TYP.PROV.value()),
							S0_XFRSCHD.trd_unit_cd,
							nullValue()
						).as("schd_trd_unit_cd"),
						decode(
							S0_SHIPPR.trd_ptn_typ,
							value(MAC_TRD_PTN_TYP.SLS.value()),
							S0_SLOD.trd_unit_qty,
							value(MAC_TRD_PTN_TYP.SHIP.value()),
							S0_SLOD.trd_unit_qty,
							value(MAC_TRD_PTN_TYP.PROV.value()),
							S0_XFRSCHD.trd_unit_qty,
							nullValue()
						).as("schd_trd_unit_qty"),
						S0_ITMUNIT.dec_place.as("schd_trd_unit_dec_place"),
						S0_ITMUNIT.conv_base_qty.as("schd_trd_unit_conv_base_qty"),
						S0_ITMUNIT.conv_qty.as("schd_trd_unit_conv_qty"),
						S0_ITMUNIT.rnd_typ.as("schd_trd_unit_rnd_typ"),
						decode(
							S0_SHIPPR.trd_ptn_typ,
							value(MAC_TRD_PTN_TYP.SLS.value()),
							S0_SLOD.base_unit_qty,
							value(MAC_TRD_PTN_TYP.SHIP.value()),
							S0_SLOD.base_unit_qty,
							value(MAC_TRD_PTN_TYP.PROV.value()),
							S0_XFRSCHD.base_unit_qty,
							nullValue()
						).as("schd_base_unit_qty"),
						S0_SLOD.trd_cur_dscnt_amt.as("schd_trd_cur_dscnt_amt"),
						S0_SLOD.iv_upri.as("iv_upri"),
						S0_SLOD.iv_amt.as("schd_iv_amt"),
						decode(
							S0_SHIPPR.trd_ptn_typ,
							value(MAC_TRD_PTN_TYP.SLS.value()),
							S0_SLOD.trd_cur_upri,
							value(MAC_TRD_PTN_TYP.PROV.value()),
							S0_PROVSCHD.trd_cur_upri,
							nullValue()
						).as("schd_trd_cur_upri"),
						S0_SLOD.upri_not_tgt_flg,
						S0_SLOD.interim_flg,
						S0_SLOD.sls_cststk_flg,
						decode(
							S0_SHIPPR.trd_ptn_typ,
							value(MAC_TRD_PTN_TYP.SLS.value()),
							S0_SLOD.trd_cur_amt,
							value(MAC_TRD_PTN_TYP.PROV.value()),
							S0_PROVSCHD.trd_cur_amt,
							nullValue()
						).as("schd_trd_cur_amt"),
						decode(
							S0_SHIPPR.trd_ptn_typ,
							value(MAC_TRD_PTN_TYP.SLS.value()),
							S0_SLOD.trd_cur_tax_amt,
							value(MAC_TRD_PTN_TYP.PROV.value()),
							S0_PROVSCHD.trd_cur_tax_amt,
							nullValue()
						).as("schd_trd_cur_tax_amt"),
						decode(
							S0_SHIPPR.trd_ptn_typ,
							value(MAC_TRD_PTN_TYP.SLS.value()),
							S0_SLOD.wtax_rate,
							value(MAC_TRD_PTN_TYP.PROV.value()),
							S0_PROVSCHD.wtax_rate,
							nullValue()
						).as("wtax_rate"),
						decode(
							S0_SHIPPR.trd_ptn_typ,
							value(MAC_TRD_PTN_TYP.SLS.value()),
							S0_SLOD.wtax_amt,
							value(MAC_TRD_PTN_TYP.PROV.value()),
							S0_PROVSCHD.wtax_amt,
							nullValue()
						).as("schd_wtax_amt"),
						S0_SHIPPR.trd_ptn_typ,
						S0_XFRSCHD.prov_basis_typ,
						coalesce(
							S0_SLO.trd_cur_cd,
							S0_PROVSCHD.trd_cur_cd,
							S0_XFRSCHD.trd_cur_cd
						).as("trd_cur_cd"),
						S0_TRDCUR.amt_dec_place,
						S0_TRDCUR.upri_dec_place,
						nvl(
							decode(
								S0_SHIPPR.trd_ptn_typ,
								value(MAC_TRD_PTN_TYP.SLS.value()),
								S0_CST.sls_amt_rnd_typ,
								value(MAC_TRD_PTN_TYP.PROV.value()),
								S0_SPPL.prov_amt_rnd_typ,
								value(MAC_RND_TYP.RNDOFF.value())
							),
							value(MAC_RND_TYP.RNDOFF.value())
						).as("amt_rnd_typ"),
						nvl(
							decode(
								S0_SHIPPR.trd_ptn_typ,
								value(MAC_TRD_PTN_TYP.SLS.value()),
								S0_CST.sls_tax_rnd_typ,
								value(MAC_TRD_PTN_TYP.PROV.value()),
								S0_SPPL.prov_tax_rnd_typ,
								value(MAC_RND_TYP.RNDOFF.value())
							),
							value(MAC_RND_TYP.RNDOFF.value())
						).as("tax_rnd_typ"),
						decode(
							S0_SHIPPR.trd_ptn_typ,
							value(MAC_TRD_PTN_TYP.SLS.value()),
							S0_SLOD.tax_cd,
							value(MAC_TRD_PTN_TYP.PROV.value()),
							S0_PROVSCHD.tax_cd,
							nullValue()
						).as("tax_cd"),
						decode(
							S0_SHIPPR.trd_ptn_typ,
							value(MAC_TRD_PTN_TYP.SLS.value()),
							S0_SLOD.tax_fix_flg,
							value(MAC_TRD_PTN_TYP.PROV.value()),
							S0_PROVSCHD.tax_fix_flg,
							nullValue()
						).as("tax_fix_flg"),
						S0_TAX.tax_nm,
						S0_TAX.inc_tax_flg,
						S0_TAX.tax_rate,
						S0_SLOD.dest_cd1,
						S0_SLOD.dest_cd2,
						S0_SLOD.dest_cd3,
						S0_SLO.cst_po_no,
						S0_SLOD.cst_po_d_no,
						S0_SHIPINSTD.ship_lg_grp_cd.as("ship_fr_lg_grp_cd"),
						S0_SLOD.cst_itm_cd,
						S0_SLOD.cst_itm_nm,
						S0_SHIPPR.rsn_cd,
						S0_SHIPPR.bd_dpt_cd,
						S0_BDDPT.dpt_nm.as("bd_dpt_nm"),
						S0_SHIPINSTD.sno1,
						S0_SHIPINSTD.sno2,
						S0_SHIPINSTD.sno3,
						S0_SHIPINSTD.sno4,
						S0_SLO.sls_usr_cd,
						S0_SLO.sls_dpt_cd,
						S0_SLSDPT.dpt_nm.as("sls_dpt_nm"),
						S0_SLSDPT.wg_cd.as("sls_dpt_wg_cd"),
						S0_SLO.ar_dpt_cd,
						S0_ARDPT.dpt_nm.as("ar_dpt_nm"),
						S0_SLOD.dscnt_rsn_cd,
						decode(
							S0_SHIPPR.trd_ptn_typ,
							value(MAC_TRD_PTN_TYP.SLS.value()),
							S0_SLO.trd_rmrks,
							nullValue()
						).as("trd_rmrks"),
						decode(
							S0_SHIPPR.purc_ddlv_flg,
							value(true),
							S0_SLOD.trd_d_rmrks,
							S0_SHIPINSTD.trd_d_rmrks
						).as("trd_d_rmrks"),
						S0_SLO.slo_no,
						S0_SHIPPR.purc_ddlv_flg,
						S0_SHIPPR.slo_d_no,
						S0_SHIPPR.xfr_schd_no,
						trunc(
							S0_SHIPPR.dlv_rqst_tm,
							MCDateFmt.DD
						).as("dlv_rqst_dt"),
						S0_SHIPPR.dlv_rqst_tm.as("dlv_rqst_hm"),
						S0_SHIPPR.ship_pr_no,
						S0_SHIPPR.ship_inst_typ,
						S0_SHIPSCHD.pr_sts_typ,
						S0_SLSSCHD.purc_schd_no,
						S0_SLSSCHD.purc_act_d_no,
						S0_SHIPPR.upd_cntr.as("ship_pr_upd_cntr")
					)
					.from(
						S0_SHIPINSTD
						.innerJoin(S0_SHIPINSTDWK).on(
							bracket(
								S0_SHIPINSTD.ship_inst_d_no.eq(S0_SHIPINSTDWK.ship_inst_d_no)
							)
						)
						.innerJoin(S0_SHIPINST).on(S0_SHIPINSTD.ship_inst_no.eq(S0_SHIPINST.ship_inst_no))
						.innerJoin(S0_SHIPSCHD).on(S0_SHIPINSTD.ship_inst_d_no.eq(S0_SHIPSCHD.ship_inst_d_no))
						.innerJoin(S0_SHIPPR).on(
							bracket(
								S0_SHIPSCHD.ship_pr_no.eq(S0_SHIPPR.ship_pr_no)
							)
						)
						.leftOuterJoin(S0_SLOD).on(
							bracket(
								S0_SLOD.slo_d_no.eq(S0_SHIPPR.slo_d_no)
							)
						)
						.leftOuterJoin(S0_SLO).on(
							bracket(
								S0_SLO.slo_no.eq(S0_SLOD.slo_no)
							)
						)
						.leftOuterJoin(S0_PROVSCHD).on(
							bracket(
								S0_SHIPSCHD.ship_schd_no.eq(S0_PROVSCHD.prov_src_schd_no1)
								.and(MAC_TRD_PTN_TYP$IS_PROV(S0_PROVSCHD.trd_ptn_typ).eq(value(true)))
							)
						)
						.leftOuterJoin(S0_XFRSCHD).on(
							bracket(
								S0_SHIPPR.xfr_schd_no.eq(S0_XFRSCHD.xfr_schd_no)
							)
						)
						.leftOuterJoin(subQuery().select(
								S1_IVSHIPINSTMAP.ship_inst_d_no,
								sum(S1_IVSHIPINSTMAP.base_unit_qty).as("iv_qty")
								).from(S1_IVSHIPINSTMAP)
								.groupBy(S1_IVSHIPINSTMAP.ship_inst_d_no)
								.view(S1_VIVSHIPINSTMAP))
						.on(S0_SHIPINSTD.ship_inst_d_no.eq(S1_VIVSHIPINSTMAP.pr(S1_IVSHIPINSTMAP.ship_inst_d_no)))
						.leftOuterJoin(S0_ITM).on(
							bracket(
								S0_SHIPINSTD.itm_cd.eq(S0_ITM.itm_cd)
								.and(S0_SHIPINSTD.itm_sub1.eq(S0_ITM.itm_sub1))
								.and(S0_SHIPINSTD.itm_sub2.eq(S0_ITM.itm_sub2))
								.and(S0_SHIPINSTD.itm_sub3.eq(S0_ITM.itm_sub3))
							)
						)
						.leftOuterJoin(S0_SLSSCHD).on(
							bracket(
								S0_SHIPSCHD.ship_schd_no.eq(S0_SLSSCHD.ship_schd_no)
							)
						)
						.leftOuterJoin(S0_CNTRY).on(
							bracket(
								coalesce(
									S0_SLOD.cntry_org_cd,
									S0_ITM.cntry_org_cd
								).eq(S0_CNTRY.cntry_cd)
							)
						)
						.leftOuterJoin(S0_TAX).on(
							bracket(
								decode(
									S0_SHIPPR.trd_ptn_typ,
									value(MAC_TRD_PTN_TYP.SLS.value()),
									S0_SLOD.tax_cd,
									value(MAC_TRD_PTN_TYP.PROV.value()),
									S0_PROVSCHD.tax_cd,
									nullValue()
								).eq(S0_TAX.tax_cd)
							)
						)
						.leftOuterJoin(S0_BDDPT).on(
							bracket(
								S0_SHIPPR.bd_dpt_cd.eq(S0_BDDPT.dpt_cd)
								.and(
									coalesce(
										S0_SLO.slo_dt,
										S0_XFRSCHD.rcpt_dt
									).between(S0_BDDPT.st_dt, S0_BDDPT.end_dt)
								)
							)
						)
						.leftOuterJoin(S0_ARDPT).on(
							bracket(
								S0_SLO.ar_dpt_cd.eq(S0_ARDPT.dpt_cd)
								.and(S0_SLO.slo_dt.between(S0_ARDPT.st_dt, S0_ARDPT.end_dt))
							)
						)
						.leftOuterJoin(S0_SLSDPT).on(
							bracket(
								S0_SLO.sls_dpt_cd.eq(S0_SLSDPT.dpt_cd)
								.and(S0_SLO.slo_dt.between(S0_SLSDPT.st_dt, S0_SLSDPT.end_dt))
							)
						)
						.leftOuterJoin(S0_CST).on(
							bracket(
								S0_SHIPPR.cst_cd.eq(S0_CST.bp_cd)
							)
						)
						.leftOuterJoin(S0_SUNDRYITM).on(
							bracket(
								S0_SHIPINSTD.itm_cd.eq(S0_SUNDRYITM.itm_cd)
								.and(S0_SHIPINSTD.itm_sub1.eq(S0_SUNDRYITM.itm_sub1))
								.and(S0_SHIPINSTD.itm_sub2.eq(S0_SUNDRYITM.itm_sub2))
								.and(S0_SHIPINSTD.itm_sub3.eq(S0_SUNDRYITM.itm_sub3))
								.and(S0_SHIPINSTD.sno1.eq(S0_SUNDRYITM.sno1))
								.and(S0_SHIPINSTD.sno2.eq(S0_SUNDRYITM.sno2))
								.and(S0_SHIPINSTD.sno3.eq(S0_SUNDRYITM.sno3))
								.and(S0_SHIPINSTD.sno4.eq(S0_SUNDRYITM.sno4))
							)
						)
						.leftOuterJoin(S0_LOC).on(
							bracket(
								S0_SHIPPR.dlv_id_cd.eq(S0_LOC.loc_cd)
							)
						)
						.leftOuterJoin(S0_DLV).on(
							bracket(
								nvl(
									S0_SHIPSCHD.dlv_cd,
									S0_SHIPPR.dlv_id_cd
								).eq(S0_DLV.bp_cd)
							)
						)
						.leftOuterJoin(S0_ITMLCL).on(
							bracket(
								S0_SHIPINSTD.itm_cd.eq(S0_ITMLCL.itm_cd)
								.and(S0_SHIPINSTD.itm_sub1.eq(S0_ITMLCL.itm_sub1))
								.and(S0_SHIPINSTD.itm_sub2.eq(S0_ITMLCL.itm_sub2))
								.and(S0_SHIPINSTD.itm_sub3.eq(S0_ITMLCL.itm_sub3))
								.and(
									bracket(
										S0_SHIPPR.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.SLS.value()))
										.and(S0_DLV.prnt_lcl_cd.eq(S0_ITMLCL.lcl_cd))
									)
									.or(
											S0_SHIPPR.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.SHIP.value()))
											.and(S0_DLV.prnt_lcl_cd.eq(S0_ITMLCL.lcl_cd))
										)
									.or(
										S0_SHIPPR.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.PROV.value()))
										.and(S0_LOC.prnt_lcl_cd.eq(S0_ITMLCL.lcl_cd))
									)
									.or(
										S0_SHIPPR.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.XFR.value()))
										.and(S0_LOC.prnt_lcl_cd.eq(S0_ITMLCL.lcl_cd))
									)
									.or(
										S0_SHIPPR.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.XFR_RTN.value()))
										.and(S0_LOC.prnt_lcl_cd.eq(S0_ITMLCL.lcl_cd))
									)
								)
							)
						)
						.leftOuterJoin(S0_SPPL).on(
							bracket(
								S0_LOC.sppl_cd.eq(S0_SPPL.bp_cd)
							)
						)
						.leftOuterJoin(S0_ITMUNIT).on(
							bracket(
								S0_SHIPINSTD.itm_cd.eq(S0_ITMUNIT.itm_cd)
								.and(S0_SHIPINSTD.itm_sub1.eq(S0_ITMUNIT.itm_sub1))
								.and(S0_SHIPINSTD.itm_sub2.eq(S0_ITMUNIT.itm_sub2))
								.and(S0_SHIPINSTD.itm_sub3.eq(S0_ITMUNIT.itm_sub3))
								.and(
									decode(
										S0_SHIPPR.trd_ptn_typ,
										value(MAC_TRD_PTN_TYP.SLS.value()),
										S0_SLOD.trd_unit_cd,
										value(MAC_TRD_PTN_TYP.SHIP.value()),
										S0_SLOD.trd_unit_cd,
										value(MAC_TRD_PTN_TYP.PROV.value()),
										S0_XFRSCHD.trd_unit_cd,
										nullValue()
									).eq(S0_ITMUNIT.unit_cd)
								)
							)
						)
						.leftOuterJoin(S0_TRDCUR).on(coalesce(S0_SLO.trd_cur_cd, S0_PROVSCHD.trd_cur_cd, S0_XFRSCHD.trd_cur_cd).eq(S0_TRDCUR.cur_cd))
						.leftOuterJoin(S0_ITMLGGRP).on(
							bracket(
								S0_XFRSCHD.itm_cd.eq(S0_ITMLGGRP.itm_cd)
								.and(S0_XFRSCHD.itm_sub1.eq(S0_ITMLGGRP.itm_sub1))
								.and(S0_XFRSCHD.itm_sub2.eq(S0_ITMLGGRP.itm_sub2))
								.and(S0_XFRSCHD.itm_sub3.eq(S0_ITMLGGRP.itm_sub3))
								.and(S0_XFRSCHD.gi_lg_grp_cd.eq(S0_ITMLGGRP.lg_grp_cd))
							)
						)
						.leftOuterJoin(S0_GILOC).on(
							bracket(
								S0_XFRSCHD.gi_lg_grp_cd.eq(S0_GILOC.lg_grp_cd)
								.and(S0_GILOC.lg_def_flg.eq(value(true)))
								.and(S0_GILOC.del_flg.eq(value(false)))
							)
						)
					)
					.where(
						value(0).eq(value(0))
						.and(S0_SHIPINST.can_flg.eq(value(false)))
						.and(S0_SHIPINSTD.can_flg.eq(value(false)))
						.and(
							exists(
								subQuery()
								.select(value("X"))
								.from(S2_RDWG)
								.where(
									S0_SLSDPT.wg_cd.eq(S2_RDWG.wg_cd)
								)
							)
							.or(
								exists(
									subQuery()
									.select(value("X"))
									.from(S3_RDLOC)
									.where(
										coalesce(
											S0_XFRSCHD.gi_loc_cd,
											S0_ITMLGGRP.lg_def_loc_cd,
											S0_GILOC.loc_cd
										).eq(S3_RDLOC.loc_cd)
									)
								)
							)
						)
						.and(
							S0_SHIPPR.purc_ddlv_flg.eq(value(false))
							.or(
								exists(
									subQuery()
									.select(value("X"))
									.from(
										S4_SLSSCHD
										.innerJoin(S4_PURCSCHD).on(
											bracket(
												S4_SLSSCHD.purc_schd_no.eq(S4_PURCSCHD.purc_schd_no)
											)
										)
										.innerJoin(S4_ARRPR).on(
											bracket(
												S4_PURCSCHD.arr_pr_no.eq(S4_ARRPR.arr_pr_no)
											)
										)
										.innerJoin(S4_POD).on(
											bracket(
												S4_ARRPR.po_d_no.eq(S4_POD.po_d_no)
											)
										)
										.innerJoin(S4_PO).on(
											bracket(
												S4_POD.po_no.eq(S4_PO.po_no)
											)
										)
										.leftOuterJoin(S4_SPPL).on(
											bracket(
												S4_PO.sppl_cd.eq(S4_SPPL.bp_cd)
											)
										)
									)
									.where(
										value(0).eq(value(0))
										.and(S0_SHIPSCHD.ship_schd_no.eq(S4_SLSSCHD.ship_schd_no))
										.and(S4_SLSSCHD.cmpl_flg.eq(value(false)))
										.and(S4_SLSSCHD.purc_schd_no.isNotNull())
										.and(S4_POD.rqst_can_flg.eq(value(false)))
										.and(S4_SPPL.sppl_iv_flg.eq(value(false)))
									)
								)
							)
						)
						.and(S0_SHIPINSTD.base_unit_qty.subtract(S0_SHIPINSTD.abort_qty).subtract(nvl(S1_VIVSHIPINSTMAP.pr("iv_qty"), value(0))).subtract(S0_SHIPSCHD.ship_ret_qty).gt(value(0)))
					)
			)
			.setJoinInfo(
				joinInfo(
					j -> j
						.add(MSVT_WRK_SNO_R.class, r -> toCondition(
							r.getStringNE("sno1")
						))
						.addSelect(m -> toArray(
							m.wrk_nm,
							m.wrk_no
						))
						.addMap((r, m) -> {
							r.setStringNE("wrk_no", m.wrk_no());
							r.setStringNE("wrk_nm", m.wrk_nm());
					}),
					j -> j
						.add(MAM_UNIT_R.class, r -> toCondition(
							r.getStringNE("trd_unit_cd")
						))
						.addSelect(m -> toArray(
							m.unit_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("trd_unit_nm", m.unit_nm());
					}),
					j -> j
						.add(MAM_UNIT_R.class, r -> toCondition(
							r.getStringNE("base_unit_cd")
						))
						.addSelect(m -> toArray(
							m.unit_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("base_unit_nm", m.unit_nm());
					}),
					j -> j
						.add(MAM_STK_GD_R.class, r -> toCondition(
							r.getStringNE("gd_cd")
						))
						.addSelect(m -> toArray(
							m.gd_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("gd_nm", m.gd_nm());
					}),
					j -> j
						.add(MAM_BIZ_RSN_R.class, r -> toCondition(
							r.getStringNE("rsn_cd")
						))
						.addSelect(m -> toArray(
							m.biz_rsn_nm,
							m.sls_acxfr_flg
						))
						.addMap((r, m) -> {
							r.setStringNE("rsn_nm", m.biz_rsn_nm());
							r.setBooleanNE("sls_acxfr_flg", m.sls_acxfr_flg());
					}),
					j -> j
						.add(MAM_USR_R.class, r -> toCondition(
							r.getStringNE("sls_usr_cd")
						))
						.addSelect(m -> toArray(
							m.usr_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("sls_usr_nm", m.usr_nm());
					}),
					j -> j
						.add(MAM_BIZ_RSN_R.class, r -> toCondition(
							r.getStringNE("dscnt_rsn_cd")
						))
						.addSelect(m -> toArray(
							m.biz_rsn_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("dscnt_rsn_nm", m.biz_rsn_nm());
					}),
					j -> j
						.add(MAM_TRD_R.class, r -> toCondition(
							r.getStringNE("trd_cd")
						))
						.addSelect(m -> toArray(
							m.trd_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("trd_nm", m.trd_nm());
					}),
					j -> j
						.add(MAVM_ITM_UNIT_R.class, r -> toCondition(
							r.getStringNE("itm_cd"),
							r.getStringNE("itm_sub1"),
							r.getStringNE("itm_sub2"),
							r.getStringNE("itm_sub3"),
							r.getStringNE("trd_unit_cd")
						))
						.addSelect(m -> toArray(
							m.conv_base_qty,
							m.conv_qty,
							m.dec_place,
							m.rnd_typ
						))
						.addMap((r, m) -> {
							r.setNumberNE("trd_unit_conv_base_qty", m.conv_base_qty());
							r.setNumberNE("trd_unit_conv_qty", m.conv_qty());
							r.setNumberNE("trd_unit_dec_place", m.dec_place());
							r.setStringNE("trd_unit_rnd_typ", m.rnd_typ());
					}),
					j -> j
						.add(MAM_LG_GRP_R.class, r -> toCondition(
							r.getStringNE("ship_fr_lg_grp_cd")
						))
						.addSelect(m -> toArray(
							m.lg_grp_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("ship_fr_lg_grp_nm", m.lg_grp_nm());
					})
				)
			);
	}
	
	/**
	 * -- MSBEL1730_MST_SHIP_INST_D_Query_S02
	 */
	static MCQueryPlan MSBEL1730_MST_SHIP_INST_D_S02() {
		MST_SHIP_INST_D_R S0_SHIPINSTD = MST_SHIP_INST_D_R.create("SHIPINSTD");
		MST_SHIP_INST_R S0_SHIPINST = MST_SHIP_INST_R.create("SHIPINST");
		MST_SHIP_SCHD_R S0_SHIPSCHD = MST_SHIP_SCHD_R.create("SHIPSCHD");
		MST_SHIP_PR_R S0_SHIPPR = MST_SHIP_PR_R.create("SHIPPR");
		MST_SLO_D_R S0_SLOD = MST_SLO_D_R.create("SLOD");
		MST_SLO_R S0_SLO = MST_SLO_R.create("SLO");
		MST_PROV_SCHD_R S0_PROVSCHD = MST_PROV_SCHD_R.create("PROVSCHD");
		MST_XFR_SCHD_R S0_XFRSCHD = MST_XFR_SCHD_R.create("XFRSCHD");
		MST_SLS_SCHD_R S0_SLSSCHD = MST_SLS_SCHD_R.create("SLSSCHD");
		MAM_ITM_R S0_ITM = MAM_ITM_R.create("ITM");
		MAM_CNTRY_R S0_CNTRY = MAM_CNTRY_R.create("CNTRY");
		MAM_TAX_R S0_TAX = MAM_TAX_R.create("TAX");
		MAM_DPT_R S0_BDDPT = MAM_DPT_R.create("BDDPT");
		MAM_DPT_R S0_SLSDPT = MAM_DPT_R.create("SLSDPT");
		MAM_DPT_R S0_ARDPT = MAM_DPT_R.create("ARDPT");
		MAM_BP_R S0_CST = MAM_BP_R.create("CST");
		MAM_CUR_R S0_CUR = MAM_CUR_R.create("CUR");
		MAM_SUNDRY_ITM_R S0_SUNDRYITM = MAM_SUNDRY_ITM_R.create("SUNDRYITM");
		MAM_LOC_R S0_LOC = MAM_LOC_R.create("LOC");
		MAM_BP_R S0_DLV = MAM_BP_R.create("DLV");
		MAM_ITM_LCL_R S0_ITMLCL = MAM_ITM_LCL_R.create("ITMLCL");
		MAM_BP_R S0_SPPL = MAM_BP_R.create("SPPL");
		MAVM_ITM_UNIT_R S0_ITMUNIT = MAVM_ITM_UNIT_R.create("ITMUNIT");
		MAM_ITM_LG_GRP_R S0_ITMLGGRP = MAM_ITM_LG_GRP_R.create("ITMLGGRP");
		MAM_LOC_R S0_GILOC = MAM_LOC_R.create("GILOC");
		MCTempView S0_VIVSHIPINSTMAP = createTempView("VIVSHIPINSTMAP");
		MST_IV_SHIP_INST_MAP_R S1_IVSHIPINSTMAP = MST_IV_SHIP_INST_MAP_R.create("IVSHIPINSTMAP");
		MAVM_RD_WG_R S2_WGDAC = MAVM_RD_WG_R.create("WGDAC");
		MAVM_RD_LOC_R S3_LOCDAC = MAVM_RD_LOC_R.create("LOCDAC");
		MST_SLS_SCHD_R S4_XSLSSCHD = MST_SLS_SCHD_R.create("XSLSSCHD");
		MST_PURC_SCHD_R S4_PURCSCHD = MST_PURC_SCHD_R.create("PURCSCHD");
		MST_ARR_PR_R S4_ARRPR = MST_ARR_PR_R.create("ARRPR");
		MST_PO_D_R S4_POD = MST_PO_D_R.create("POD");
		MST_PO_R S4_PO = MST_PO_R.create("PO");
		MAM_BP_R S4_XSPPL = MAM_BP_R.create("XSPPL");
		MSW_SHIP_INST_D_KEY_R S5_SHIPINSTDWK = MSW_SHIP_INST_D_KEY_R.create("SHIPINSTDWK");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBEL1730_MST_SHIP_INST_D_Query_S02")
					.mainQuery()
					.select(
						value(true).as("existed_flg"),
						S0_SHIPINST.ship_inst_no,
						S0_SHIPINSTD.ship_inst_d_no,
						S0_SHIPSCHD.ship_schd_no,
						S0_SHIPSCHD.re_ship_schd_flg,
						S0_SHIPINSTD.itm_cd,
						S0_SHIPINSTD.itm_sub1,
						S0_SHIPINSTD.itm_sub2,
						S0_SHIPINSTD.itm_sub3,
						cases()
							.when(S0_SHIPINSTD.sundry_itm_flg.eq(value(true)))
								.then(
									nvl(
										S0_SHIPINSTD.itm_nm,
										S0_SUNDRYITM.itm_nm
									)
							)
							.otherwise(S0_ITM.itm_nm).as("itm_nm"),
						S0_SHIPINSTD.sundry_itm_flg,
						S0_ITM.sls_upri_cng_flg,
						S0_ITM.stk_mng_typ,
						S0_ITM.asset_mng_typ,
						S0_ITM.sno1_mng_typ,
						S0_ITM.sno2_mng_typ,
						S0_ITM.sno3_mng_typ,
						S0_ITM.sno4_mng_typ,
						S0_ITM.dscnt_itm_flg,
						S0_ITM.exim_xpns_typ,
						cases()
							.when(S0_SHIPINSTD.sundry_itm_flg.eq(value(true)))
								.then(
									nvl(
										S0_SHIPINSTD.iv_itm_nm,
										S0_SUNDRYITM.itm_nm
									)
							)
							.otherwise(
								nvl(
									S0_ITMLCL.itm_nm,
									S0_ITM.itm_nm
								)
							).as("iv_itm_nm"),
						coalesce(
							S0_SLOD.cntry_org_cd,
							S0_ITM.cntry_org_cd
						).as("cntry_org_cd"),
						S0_CNTRY.cntry_nm.as("cntry_org_nm"),
						decode(
							S0_SLOD.trd_unit_cd,
							nullValue(),
							S0_SHIPSCHD.trd_unit_cd,
							S0_SLOD.trd_unit_cd
						).as("trd_unit_cd"),
						nullValue().as("trd_unit_qty"),
						S0_SHIPINSTD.base_unit_cd,
						S0_ITM.dec_place.as("base_unit_dec_place"),
						S0_ITM.rnd_typ.as("base_unit_rnd_typ"),
						bracket(
							S0_SHIPINSTD.base_unit_qty.subtract(S0_SHIPINSTD.abort_qty).subtract(nvl(S0_VIVSHIPINSTMAP.pr("iv_qty"), value(0))).subtract(S0_SHIPSCHD.ship_ret_qty)
						).as("base_unit_qty"),
						bracket(
							S0_SHIPINSTD.base_unit_qty.subtract(S0_SHIPINSTD.abort_qty).subtract(nvl(S0_VIVSHIPINSTMAP.pr("iv_qty"), value(0))).subtract(S0_SHIPSCHD.ship_ret_qty)
						).as("max_base_unit_qty"),
						S0_SHIPINSTD.gd_cd,
						S0_SHIPPR.trd_cd,
						decode(
							S0_SHIPPR.trd_ptn_typ,
							value(MAC_TRD_PTN_TYP.SLS.value()),
							S0_SLOD.trd_cur_upri,
							value(MAC_TRD_PTN_TYP.PROV.value()),
							S0_PROVSCHD.trd_cur_upri,
							value(0)
						).as("trd_cur_upri"),
						S0_SLOD.upri_not_tgt_flg,
						S0_SLOD.interim_flg,
						S0_SLOD.sls_cststk_flg,
						S0_SLOD.base_unit_qty.as("schd_base_unit_qty"),
						S0_SLOD.trd_cur_dscnt_amt.as("schd_trd_cur_dscnt_amt"),
						S0_SLOD.iv_upri,
						decode(
							S0_SHIPPR.trd_ptn_typ,
							value(MAC_TRD_PTN_TYP.SLS.value()),
							S0_SLOD.tax_cd,
							value(MAC_TRD_PTN_TYP.PROV.value()),
							S0_PROVSCHD.tax_cd,
							nullValue()
						).as("tax_cd"),
						decode(
							S0_SHIPPR.trd_ptn_typ,
							value(MAC_TRD_PTN_TYP.SLS.value()),
							S0_SLOD.tax_fix_flg,
							value(MAC_TRD_PTN_TYP.PROV.value()),
							S0_PROVSCHD.tax_fix_flg,
							nullValue()
						).as("tax_fix_flg"),
						S0_TAX.tax_nm,
						S0_TAX.inc_tax_flg,
						S0_TAX.tax_rate,
						S0_SLOD.dest_cd1,
						S0_SLOD.dest_cd2,
						S0_SLOD.dest_cd3,
						S0_SLO.cst_po_no,
						S0_SLOD.cst_po_d_no,
						S0_SHIPINSTD.ship_lg_grp_cd.as("ship_fr_lg_grp_cd"),
						S0_SLOD.cst_itm_cd,
						S0_SLOD.cst_itm_nm,
						S0_SHIPPR.rsn_cd,
						S0_SHIPINSTD.sno1,
						S0_SHIPINSTD.sno2,
						S0_SHIPINSTD.sno3,
						S0_SHIPINSTD.sno4,
						S0_SHIPPR.bd_dpt_cd,
						S0_BDDPT.dpt_nm.as("bd_dpt_nm"),
						S0_SLO.sls_usr_cd,
						S0_SLO.sls_dpt_cd,
						S0_SLSDPT.dpt_nm.as("sls_dpt_nm"),
						S0_SLSDPT.wg_cd.as("sls_dpt_wg_cd"),
						S0_SLO.ar_dpt_cd,
						S0_ARDPT.dpt_nm.as("ar_dpt_nm"),
						S0_SLOD.dscnt_rsn_cd,
						decode(
							S0_SHIPPR.trd_ptn_typ,
							value(MAC_TRD_PTN_TYP.SLS.value()),
							S0_SLO.trd_rmrks,
							value(MAC_TRD_PTN_TYP.SHIP.value()),
							S0_SLO.trd_rmrks,
							nullValue()
						).as("trd_rmrks"),
						decode(
							S0_SHIPPR.purc_ddlv_flg,
							value(true),
							S0_SLOD.trd_d_rmrks,
							S0_SHIPINSTD.trd_d_rmrks
						).as("trd_d_rmrks"),
						S0_SLO.slo_no,
						cases()
							.when(S0_SHIPPR.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.SLS.value())))
								.then(S0_SHIPPR.slo_d_no)
							.when(S0_SHIPPR.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.SHIP.value())))
								.then(S0_SHIPPR.slo_d_no)
							.otherwise(S0_SHIPPR.xfr_schd_no).as("ship_rqst_no"),
						S0_SHIPPR.slo_d_no,
						S0_SHIPPR.xfr_schd_no,
						trunc(
							nvl(
									nvl(
										S0_SHIPSCHD.pd_inst_dlv_tm,
										S0_SHIPPR.dlv_rqst_tm
									),
									nvl(
										S0_SLOD.dlv_rqst_tm,
										S0_XFRSCHD.gr_rqst_tm
									)
								),
							MCDateFmt.DD
						).as("dlv_rqst_dt"),
						nvl(
								nvl(
									S0_SHIPSCHD.pd_inst_dlv_tm,
									S0_SHIPPR.dlv_rqst_tm
								),
								nvl(
									S0_SLOD.dlv_rqst_tm,
									S0_XFRSCHD.gr_rqst_tm
								)
							).as("dlv_rqst_hm"),
						trunc(
								S0_SHIPINST.ship_inst_tm,
								MCDateFmt.DD
							).as("ship_inst_dt"),
						S0_SHIPINST.ship_inst_tm.as("ship_inst_hm"),
						coalesce(
							S0_SLO.trd_cur_cd,
							S0_PROVSCHD.trd_cur_cd,
							S0_XFRSCHD.trd_cur_cd
						).as("trd_cur_cd"),
						S0_CUR.cur_nm.as("trd_cur_nm"),
						S0_CUR.upri_dec_place.as("trd_cur_upri_dec_place"),
						S0_CUR.amt_dec_place.as("trd_cur_amt_dec_place"),
						decode(
							S0_SHIPPR.trd_ptn_typ,
							value(MAC_TRD_PTN_TYP.SLS.value()),
							S0_SLOD.trd_unit_cd,
							value(MAC_TRD_PTN_TYP.SHIP.value()),
							S0_SLOD.trd_unit_cd,
							value(MAC_TRD_PTN_TYP.PROV.value()),
							S0_XFRSCHD.trd_unit_cd,
							nullValue()
						).as("schd_trd_unit_cd"),
						decode(
							S0_SHIPPR.trd_ptn_typ,
							value(MAC_TRD_PTN_TYP.SLS.value()),
							S0_SLOD.trd_unit_qty,
							value(MAC_TRD_PTN_TYP.SHIP.value()),
							S0_SLOD.trd_unit_qty,
							value(MAC_TRD_PTN_TYP.PROV.value()),
							S0_XFRSCHD.trd_unit_qty,
							nullValue()
						).as("schd_trd_unit_qty"),
						S0_ITMUNIT.dec_place.as("schd_trd_unit_dec_place"),
						S0_ITMUNIT.conv_base_qty.as("schd_trd_unit_conv_base_qty"),
						S0_ITMUNIT.conv_qty.as("schd_trd_unit_conv_qty"),
						S0_ITMUNIT.rnd_typ.as("schd_trd_unit_rnd_typ"),
						decode(
							S0_SHIPPR.trd_ptn_typ,
							value(MAC_TRD_PTN_TYP.SLS.value()),
							S0_SLOD.base_unit_qty,
							value(MAC_TRD_PTN_TYP.SHIP.value()),
							S0_SLOD.base_unit_qty,
							value(MAC_TRD_PTN_TYP.PROV.value()),
							S0_XFRSCHD.base_unit_qty,
							nullValue()
						).as("schd_base_unit_qty"),
						S0_SLOD.trd_cur_dscnt_amt.as("schd_trd_cur_dscnt_amt"),
						S0_SLOD.iv_amt.as("schd_iv_amt"),
						decode(
							S0_SHIPPR.trd_ptn_typ,
							value(MAC_TRD_PTN_TYP.SLS.value()),
							S0_SLOD.trd_cur_upri,
							value(MAC_TRD_PTN_TYP.PROV.value()),
							S0_PROVSCHD.trd_cur_upri,
							nullValue()
						).as("schd_trd_cur_upri"),
						decode(
							S0_SHIPPR.trd_ptn_typ,
							value(MAC_TRD_PTN_TYP.SLS.value()),
							S0_SLOD.trd_cur_amt,
							value(MAC_TRD_PTN_TYP.PROV.value()),
							S0_PROVSCHD.trd_cur_amt,
							nullValue()
						).as("schd_trd_cur_amt"),
						decode(
							S0_SHIPPR.trd_ptn_typ,
							value(MAC_TRD_PTN_TYP.SLS.value()),
							S0_SLOD.trd_cur_tax_amt,
							value(MAC_TRD_PTN_TYP.PROV.value()),
							S0_PROVSCHD.trd_cur_tax_amt,
							nullValue()
						).as("schd_trd_cur_tax_amt"),
						S0_SLOD.wtax_rate,
						S0_SLOD.wtax_amt.as("schd_wtax_amt"),
						S0_SHIPPR.trd_ptn_typ,
						S0_XFRSCHD.prov_basis_typ,
						nvl(
							decode(
								S0_SHIPPR.trd_ptn_typ,
								value(MAC_TRD_PTN_TYP.SLS.value()),
								S0_CST.sls_amt_rnd_typ,
								value(MAC_TRD_PTN_TYP.PROV.value()),
								S0_SPPL.prov_amt_rnd_typ,
								value(MAC_RND_TYP.RNDOFF.value())
							),
							value(MAC_RND_TYP.RNDOFF.value())
						).as("trd_amt_rnd_typ"),
						nvl(
							decode(
								S0_SHIPPR.trd_ptn_typ,
								value(MAC_TRD_PTN_TYP.SLS.value()),
								S0_CST.sls_tax_rnd_typ,
								value(MAC_TRD_PTN_TYP.PROV.value()),
								S0_SPPL.prov_tax_rnd_typ,
								value(MAC_RND_TYP.RNDOFF.value())
							),
							value(MAC_RND_TYP.RNDOFF.value())
						).as("trd_tax_rnd_typ"),
						S0_SHIPPR.purc_ddlv_flg,
						S0_SHIPPR.ship_pr_no,
						S0_SHIPPR.ship_inst_typ,
						S0_SHIPPR.upd_cntr.as("ship_pr_upd_cntr"),
						S0_SLO.trnspt_cd,
						S0_SLO.vssl_flght,
						S0_SLO.load_port_cd,
						S0_SLO.etd_dt,
						S0_SLO.dschrg_port_cd,
						S0_SLO.eta_dt,
						S0_SLO.via_port_cd,
						S0_SLO.via_schd_dt,
						S0_SLO.tterm_cd1,
						S0_SLO.tterm_rmrks1,
						S0_SLO.tterm_cd2,
						S0_SLO.tterm_rmrks2,
						S0_SLO.tterm_cd3,
						S0_SLO.tterm_rmrks3,
						decode(
							S0_SHIPPR.trd_ptn_typ,
							value(MAC_TRD_PTN_TYP.SLS.value()),
							S0_SLO.xrate,
							value(MAC_TRD_PTN_TYP.PROV.value()),
							S0_PROVSCHD.xrate,
							value(MAC_TRD_PTN_TYP.XFR.value()),
							S0_XFRSCHD.xrate,
							value(MAC_TRD_PTN_TYP.XFR_RTN.value()),
							S0_XFRSCHD.xrate,
							nullValue()
						).as("xrate"),
						decode(
							S0_SHIPPR.trd_ptn_typ,
							value(MAC_TRD_PTN_TYP.SLS.value()),
							S0_SLO.ptax_xrate,
							value(MAC_TRD_PTN_TYP.PROV.value()),
							S0_PROVSCHD.ptax_xrate,
							value(MAC_TRD_PTN_TYP.XFR.value()),
							S0_XFRSCHD.ptax_xrate,
							value(MAC_TRD_PTN_TYP.XFR_RTN.value()),
							S0_XFRSCHD.ptax_xrate,
							nullValue()
						).as("ptax_xrate"),
						S0_SLSSCHD.purc_schd_no,
						S0_SLSSCHD.purc_act_d_no,
						S0_SHIPSCHD.pr_sts_typ
					)
					.from(
						S0_SHIPINSTD
						.innerJoin(S0_SHIPINST).on(S0_SHIPINSTD.ship_inst_no.eq(S0_SHIPINST.ship_inst_no))
						.innerJoin(S0_SHIPSCHD).on(S0_SHIPINSTD.ship_inst_d_no.eq(S0_SHIPSCHD.ship_inst_d_no))
						.innerJoin(S0_SHIPPR).on(S0_SHIPSCHD.ship_pr_no.eq(S0_SHIPPR.ship_pr_no))
						.leftOuterJoin(S0_SLOD).on(
							bracket(
								S0_SLOD.slo_d_no.eq(S0_SHIPPR.slo_d_no)
							)
						)
						.leftOuterJoin(S0_SLO).on(
							bracket(
								S0_SLO.slo_no.eq(S0_SLOD.slo_no)
							)
						)
						.leftOuterJoin(S0_PROVSCHD).on(
							bracket(
								S0_SHIPSCHD.ship_schd_no.eq(S0_PROVSCHD.prov_src_schd_no1)
								.and(MAC_TRD_PTN_TYP$IS_PROV(S0_PROVSCHD.trd_ptn_typ).eq(value(true)))
							)
						)
						.leftOuterJoin(S0_XFRSCHD).on(
							bracket(
								S0_SHIPPR.xfr_schd_no.eq(S0_XFRSCHD.xfr_schd_no)
							)
						)
						.leftOuterJoin(subQuery().select(
								S1_IVSHIPINSTMAP.ship_inst_d_no,
								sum(S1_IVSHIPINSTMAP.base_unit_qty).as("iv_qty")
								).from(S1_IVSHIPINSTMAP)
								.groupBy(S1_IVSHIPINSTMAP.ship_inst_d_no)
								.view(S0_VIVSHIPINSTMAP))
						.on(S0_SHIPINSTD.ship_inst_d_no.eq(S0_VIVSHIPINSTMAP.pr(S1_IVSHIPINSTMAP.ship_inst_d_no)))
						.leftOuterJoin(S0_ITM).on(
							bracket(
								S0_SHIPINSTD.itm_cd.eq(S0_ITM.itm_cd)
								.and(S0_SHIPINSTD.itm_sub1.eq(S0_ITM.itm_sub1))
								.and(S0_SHIPINSTD.itm_sub2.eq(S0_ITM.itm_sub2))
								.and(S0_SHIPINSTD.itm_sub3.eq(S0_ITM.itm_sub3))
							)
						)
						.leftOuterJoin(S0_SLSSCHD).on(
							bracket(
								S0_SHIPSCHD.ship_schd_no.eq(S0_SLSSCHD.ship_schd_no)
							)
						)
						.leftOuterJoin(S0_CNTRY).on(
							bracket(
								coalesce(
									S0_SLOD.cntry_org_cd,
									S0_ITM.cntry_org_cd
								).eq(S0_CNTRY.cntry_cd)
							)
						)
						.leftOuterJoin(S0_TAX).on(
							bracket(
								decode(
									S0_SHIPPR.trd_ptn_typ,
									value(MAC_TRD_PTN_TYP.SLS.value()),
									S0_SLOD.tax_cd,
									value(MAC_TRD_PTN_TYP.PROV.value()),
									S0_PROVSCHD.tax_cd,
									nullValue()
								).eq(S0_TAX.tax_cd)
							)
						)
						.leftOuterJoin(S0_BDDPT).on(
							bracket(
								S0_SHIPPR.bd_dpt_cd.eq(S0_BDDPT.dpt_cd)
								.and(
									coalesce(
										S0_SLO.slo_dt,
										S0_XFRSCHD.rcpt_dt
									).between(S0_BDDPT.st_dt, S0_BDDPT.end_dt)
								)
							)
						)
						.leftOuterJoin(S0_SLSDPT).on(
							bracket(
								S0_SLO.sls_dpt_cd.eq(S0_SLSDPT.dpt_cd)
								.and(S0_SLO.slo_dt.between(S0_SLSDPT.st_dt, S0_SLSDPT.end_dt))
							)
						)
						.leftOuterJoin(S0_ARDPT).on(
							bracket(
								S0_SLO.ar_dpt_cd.eq(S0_ARDPT.dpt_cd)
								.and(S0_SLO.slo_dt.between(S0_ARDPT.st_dt, S0_ARDPT.end_dt))
							)
						)
						.leftOuterJoin(S0_CST).on(
							bracket(
								S0_SHIPPR.cst_cd.eq(S0_CST.bp_cd)
							)
						)
						.leftOuterJoin(S0_CUR).on(
							bracket(
								coalesce(
									S0_SLO.trd_cur_cd,
									S0_PROVSCHD.trd_cur_cd,
									S0_XFRSCHD.trd_cur_cd
								).eq(S0_CUR.cur_cd)
							)
						)
						.leftOuterJoin(S0_SUNDRYITM).on(
							bracket(
								S0_SHIPINSTD.itm_cd.eq(S0_SUNDRYITM.itm_cd)
								.and(S0_SHIPINSTD.itm_sub1.eq(S0_SUNDRYITM.itm_sub1))
								.and(S0_SHIPINSTD.itm_sub2.eq(S0_SUNDRYITM.itm_sub2))
								.and(S0_SHIPINSTD.itm_sub3.eq(S0_SUNDRYITM.itm_sub3))
								.and(S0_SHIPINSTD.sno1.eq(S0_SUNDRYITM.sno1))
								.and(S0_SHIPINSTD.sno2.eq(S0_SUNDRYITM.sno2))
								.and(S0_SHIPINSTD.sno3.eq(S0_SUNDRYITM.sno3))
								.and(S0_SHIPINSTD.sno4.eq(S0_SUNDRYITM.sno4))
							)
						)
						.leftOuterJoin(S0_LOC).on(
							bracket(
								S0_SHIPPR.dlv_id_cd.eq(S0_LOC.loc_cd)
							)
						)
						.leftOuterJoin(S0_DLV).on(
							bracket(
								nvl(
									S0_SHIPSCHD.dlv_cd,
									S0_SHIPPR.dlv_id_cd
								).eq(S0_DLV.bp_cd)
							)
						)
						.leftOuterJoin(S0_ITMLCL).on(
							bracket(
								S0_SHIPINSTD.itm_cd.eq(S0_ITMLCL.itm_cd)
								.and(S0_SHIPINSTD.itm_sub1.eq(S0_ITMLCL.itm_sub1))
								.and(S0_SHIPINSTD.itm_sub2.eq(S0_ITMLCL.itm_sub2))
								.and(S0_SHIPINSTD.itm_sub3.eq(S0_ITMLCL.itm_sub3))
								.and(
									bracket(
										S0_SHIPPR.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.SLS.value()))
										.and(S0_DLV.prnt_lcl_cd.eq(S0_ITMLCL.lcl_cd))
									)
									.or(
										S0_SHIPPR.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.SHIP.value()))
										.and(S0_DLV.prnt_lcl_cd.eq(S0_ITMLCL.lcl_cd))
										)
									.or(
										S0_SHIPPR.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.PROV.value()))
										.and(S0_LOC.prnt_lcl_cd.eq(S0_ITMLCL.lcl_cd))
									)
									.or(
										S0_SHIPPR.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.XFR.value()))
										.and(S0_LOC.prnt_lcl_cd.eq(S0_ITMLCL.lcl_cd))
									)
									.or(
										S0_SHIPPR.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.XFR_RTN.value()))
										.and(S0_LOC.prnt_lcl_cd.eq(S0_ITMLCL.lcl_cd))
									)
								)
							)
						)
						.leftOuterJoin(S0_SPPL).on(
							bracket(
								S0_LOC.sppl_cd.eq(S0_SPPL.bp_cd)
							)
						)
						.leftOuterJoin(S0_ITMUNIT).on(
							bracket(
								S0_SHIPINSTD.itm_cd.eq(S0_ITMUNIT.itm_cd)
								.and(S0_SHIPINSTD.itm_sub1.eq(S0_ITMUNIT.itm_sub1))
								.and(S0_SHIPINSTD.itm_sub2.eq(S0_ITMUNIT.itm_sub2))
								.and(S0_SHIPINSTD.itm_sub3.eq(S0_ITMUNIT.itm_sub3))
								.and(
									decode(
										S0_SHIPPR.trd_ptn_typ,
										value(MAC_TRD_PTN_TYP.SLS.value()),
										S0_SLOD.trd_unit_cd,
										value(MAC_TRD_PTN_TYP.SHIP.value()),
										S0_SLOD.trd_unit_cd,
										value(MAC_TRD_PTN_TYP.PROV.value()),
										S0_XFRSCHD.trd_unit_cd,
										nullValue()
									).eq(S0_ITMUNIT.unit_cd)
								)
							)
						)
						.leftOuterJoin(S0_ITMLGGRP).on(
							bracket(
								S0_XFRSCHD.itm_cd.eq(S0_ITMLGGRP.itm_cd)
								.and(S0_XFRSCHD.itm_sub1.eq(S0_ITMLGGRP.itm_sub1))
								.and(S0_XFRSCHD.itm_sub2.eq(S0_ITMLGGRP.itm_sub2))
								.and(S0_XFRSCHD.itm_sub3.eq(S0_ITMLGGRP.itm_sub3))
								.and(S0_XFRSCHD.gi_lg_grp_cd.eq(S0_ITMLGGRP.lg_grp_cd))
							)
						)
						.leftOuterJoin(S0_GILOC).on(
							bracket(
								S0_XFRSCHD.gi_lg_grp_cd.eq(S0_GILOC.lg_grp_cd)
								.and(S0_GILOC.lg_def_flg.eq(value(true)))
								.and(S0_GILOC.del_flg.eq(value(false)))
							)
						)
					)
					.where(
						value(0).eq(value(0))
						.and(S0_SHIPINST.can_flg.eq(value(false)))
						.and(S0_SHIPINSTD.can_flg.eq(value(false)))
						.and(
							exists(
								subQuery()
								.select(value("X"))
								.from(S2_WGDAC)
								.where(
									S0_SLSDPT.wg_cd.eq(S2_WGDAC.wg_cd)
								)
							)
							.or(
								exists(
									subQuery()
									.select(value("X"))
									.from(S3_LOCDAC)
									.where(
										coalesce(
											S0_XFRSCHD.gi_loc_cd,
											S0_ITMLGGRP.lg_def_loc_cd,
											S0_GILOC.loc_cd
										).eq(S3_LOCDAC.loc_cd)
									)
								)
							)
						)
						.and(
							bracket(
								S0_SHIPPR.purc_ddlv_flg.eq(value(false))
								.and(bind("purc_ddlv_flg_str").eq(value(false)))
							)
							.or(
								S0_SHIPPR.purc_ddlv_flg.eq(value(true))
								.and(bind("purc_ddlv_flg_str").eq(value(true)))
								.and(
									exists(
										subQuery()
										.select(value("X"))
										.from(
											S4_XSLSSCHD
											.innerJoin(S4_PURCSCHD).on(
												bracket(
													S4_XSLSSCHD.purc_schd_no.eq(S4_PURCSCHD.purc_schd_no)
												)
											)
											.innerJoin(S4_ARRPR).on(
												bracket(
													S4_PURCSCHD.arr_pr_no.eq(S4_ARRPR.arr_pr_no)
												)
											)
											.innerJoin(S4_POD).on(
												bracket(
													S4_ARRPR.po_d_no.eq(S4_POD.po_d_no)
												)
											)
											.innerJoin(S4_PO).on(
												bracket(
													S4_POD.po_no.eq(S4_PO.po_no)
												)
											)
											.leftOuterJoin(S4_XSPPL).on(
												bracket(
													S4_PO.sppl_cd.eq(S4_XSPPL.bp_cd)
												)
											)
										)
										.where(
											value(0).eq(value(0))
											.and(S0_SHIPSCHD.ship_schd_no.eq(S4_XSLSSCHD.ship_schd_no))
											.and(S4_XSLSSCHD.cmpl_flg.eq(value(false)))
											.and(S4_XSLSSCHD.purc_schd_no.isNotNull())
											.and(S4_POD.rqst_can_flg.eq(value(false)))
											.and(S4_XSPPL.sppl_iv_flg.eq(value(false)))
										)
									)
								)
							)
						)
						.and(S0_SHIPINSTD.base_unit_qty.subtract(S0_SHIPINSTD.abort_qty).subtract(nvl(S0_VIVSHIPINSTMAP.pr("iv_qty"), value(0))).subtract(S0_SHIPSCHD.ship_ret_qty).gt(value(0)))
						.and(S0_SHIPPR.trd_ptn_typ.eq(bind("trd_ptn_typ")))
						.and(
							bracket(
								bind("is_slo_iv_no_str").eq(value(false))
								.and(S0_SLO.iv_no.isNull())
							)
							.or(
								bind("is_slo_iv_no_str").eq(value(true))
								.and(S0_SLO.iv_no.eq(bind("iv_no")))
							)
						)
						.and(S0_SHIPPR.dlv_id_typ.eq(bind("dlv_id_typ")))
						.and(
							bracket(
								S0_SHIPPR.cst_cd.eq(bind("ship_rqst_id_cd"))
								.and(
									bracket(
										S0_SHIPPR.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.SLS.value())))
										.or(S0_SHIPPR.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.SHIP.value()))
									)
								)
							)
							.or(
								S0_XFRSCHD.gr_loc_cd.eq(bind("ship_rqst_id_cd"))
								.and(
									S0_SHIPPR.trd_ptn_typ.in(
										value(MAC_TRD_PTN_TYP.XFR.value()),
										value(MAC_TRD_PTN_TYP.XFR_RTN.value())
									)
								)
							)
							.or(
								S0_LOC.sppl_cd.eq(bind("ship_rqst_id_cd"))
								.and(S0_SHIPPR.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.PROV.value())))
							)
						)
						.and(
							nvl(
								S0_SHIPSCHD.dlv_cd,
								S0_SHIPPR.dlv_id_cd
							).eq(bind("dlv_id_cd"))
						)
						.and(
							bracket(
								nvl2(
									S0_SHIPSCHD.dlv_cd,
									S0_SHIPSCHD.dlv_zip_cd,
									S0_SHIPPR.dlv_zip_cd
								).eq(bind("dlv_zip_cd"))
							)
							.or(
								nvl2(
									S0_SHIPSCHD.dlv_cd,
									S0_SHIPSCHD.dlv_zip_cd,
									S0_SHIPPR.dlv_zip_cd
								).isNull()
								.and(bind("dlv_zip_cd").isNull())
							)
						)
						.and(
							bracket(
								nvl2(
									S0_SHIPSCHD.dlv_cd,
									S0_SHIPSCHD.dlv_addr1,
									S0_SHIPPR.dlv_addr1
								).eq(bind("dlv_addr1"))
							)
							.or(
								nvl2(
									S0_SHIPSCHD.dlv_cd,
									S0_SHIPSCHD.dlv_addr1,
									S0_SHIPPR.dlv_addr1
								).isNull()
								.and(bind("dlv_addr1").isNull())
							)
						)
						.and(
							bracket(
								nvl2(
									S0_SHIPSCHD.dlv_cd,
									S0_SHIPSCHD.dlv_addr2,
									S0_SHIPPR.dlv_addr2
								).eq(bind("dlv_addr2"))
							)
							.or(
								nvl2(
									S0_SHIPSCHD.dlv_cd,
									S0_SHIPSCHD.dlv_addr2,
									S0_SHIPPR.dlv_addr2
								).isNull()
								.and(bind("dlv_addr2").isNull())
							)
						)
						.and(
							bracket(
								nvl2(
									S0_SHIPSCHD.dlv_cd,
									S0_SHIPSCHD.dlv_addr3,
									S0_SHIPPR.dlv_addr3
								).eq(bind("dlv_addr3"))
							)
							.or(
								nvl2(
									S0_SHIPSCHD.dlv_cd,
									S0_SHIPSCHD.dlv_addr3,
									S0_SHIPPR.dlv_addr3
								).isNull()
								.and(bind("dlv_addr3").isNull())
							)
						)
						.and(
							bracket(
								nvl2(
									S0_SHIPSCHD.dlv_cd,
									S0_SHIPSCHD.dlv_addr4,
									S0_SHIPPR.dlv_addr4
								).eq(bind("dlv_addr4"))
							)
							.or(
								nvl2(
									S0_SHIPSCHD.dlv_cd,
									S0_SHIPSCHD.dlv_addr4,
									S0_SHIPPR.dlv_addr4
								).isNull()
								.and(bind("dlv_addr4").isNull())
							)
						)
						.and(
							bracket(
								nvl2(
									S0_SHIPSCHD.dlv_cd,
									S0_SHIPSCHD.dlv_cntct_dpt,
									S0_SHIPPR.dlv_cntct_dpt
								).eq(bind("dlv_cntct_dpt"))
							)
							.or(
								nvl2(
									S0_SHIPSCHD.dlv_cd,
									S0_SHIPSCHD.dlv_cntct_dpt,
									S0_SHIPPR.dlv_cntct_dpt
								).isNull()
								.and(bind("dlv_cntct_dpt").isNull())
							)
						)
						.and(
							bracket(
								nvl2(
									S0_SHIPSCHD.dlv_cd,
									S0_SHIPSCHD.dlv_cntct_psn,
									S0_SHIPPR.dlv_cntct_psn
								).eq(bind("dlv_cntct_psn"))
							)
							.or(
								nvl2(
									S0_SHIPSCHD.dlv_cd,
									S0_SHIPSCHD.dlv_cntct_psn,
									S0_SHIPPR.dlv_cntct_psn
								).isNull()
								.and(bind("dlv_cntct_psn").isNull())
							)
						)
						.and(
							bracket(
								nvl2(
									S0_SHIPSCHD.dlv_cd,
									S0_SHIPSCHD.dlv_tel,
									S0_SHIPPR.dlv_tel
								).eq(bind("dlv_tel"))
							)
							.or(
								nvl2(
									S0_SHIPSCHD.dlv_cd,
									S0_SHIPSCHD.dlv_tel,
									S0_SHIPPR.dlv_tel
								).isNull()
								.and(bind("dlv_tel").isNull())
							)
						)
						.and(
							bracket(
								nvl2(
									S0_SHIPSCHD.dlv_cd,
									S0_SHIPSCHD.dlv_fax,
									S0_SHIPPR.dlv_fax
								).eq(bind("dlv_fax"))
							)
							.or(
								nvl2(
									S0_SHIPSCHD.dlv_cd,
									S0_SHIPSCHD.dlv_fax,
									S0_SHIPPR.dlv_fax
								).isNull()
								.and(bind("dlv_fax").isNull())
							)
						)
						.and(
							nvl2(
								S0_SHIPSCHD.dlv_cd,
								S0_SHIPSCHD.dlv_sundry_flg,
								S0_SHIPPR.dlv_sundry_flg
							).eq(value(false))
							.or(
								nvl2(
									S0_SHIPSCHD.dlv_cd,
									S0_SHIPSCHD.dlv_sundry_flg,
									S0_SHIPPR.dlv_sundry_flg
								).eq(value(true))
								.and(
									bracket(
										nvl2(
											S0_SHIPSCHD.dlv_cd,
											S0_SHIPSCHD.dlv_nm,
											S0_SHIPPR.dlv_id_nm
										).eq(bind("dlv_id_nm"))
									)
									.or(
										nvl2(
											S0_SHIPSCHD.dlv_cd,
											S0_SHIPSCHD.dlv_nm,
											S0_SHIPPR.dlv_id_nm
										).isNull()
										.and(bind("dlv_id_nm").isNull())
									)
								)
							)
						)
						.and(
							nvl(
								S0_SHIPSCHD.via_dlv_typ,
								S0_SHIPPR.via_dlv_typ
							).eq(bind("via_dlv_typ"))
						)
						.and(
							bracket(
								MAC_VIA_DLV_TYP$IS_VIA(
									nvl(
										S0_SHIPSCHD.via_dlv_typ,
										S0_SHIPPR.via_dlv_typ
									)
								).eq(value(true))
								.and(
									nvl(
										S0_SHIPSCHD.tdlv_cd,
										S0_SHIPPR.ship_to_id_cd
									).eq(bind("tdlv_cd"))
								)
								.and(
									bracket(
										nvl2(
											S0_SHIPSCHD.tdlv_cd,
											S0_SHIPSCHD.tdlv_zip_cd,
											S0_SHIPPR.ship_to_zip_cd
										).eq(bind("tdlv_zip_cd"))
									)
									.or(
										nvl2(
											S0_SHIPSCHD.tdlv_cd,
											S0_SHIPSCHD.tdlv_zip_cd,
											S0_SHIPPR.ship_to_zip_cd
										).isNull()
										.and(bind("tdlv_zip_cd").isNull())
									)
								)
								.and(
									bracket(
										nvl2(
											S0_SHIPSCHD.tdlv_cd,
											S0_SHIPSCHD.tdlv_addr1,
											S0_SHIPPR.ship_to_addr1
										).eq(bind("tdlv_addr1"))
									)
									.or(
										nvl2(
											S0_SHIPSCHD.tdlv_cd,
											S0_SHIPSCHD.tdlv_addr1,
											S0_SHIPPR.ship_to_addr1
										).isNull()
										.and(bind("tdlv_addr1").isNull())
									)
								)
								.and(
									bracket(
										nvl2(
											S0_SHIPSCHD.tdlv_cd,
											S0_SHIPSCHD.tdlv_addr2,
											S0_SHIPPR.ship_to_addr2
										).eq(bind("tdlv_addr2"))
									)
									.or(
										nvl2(
											S0_SHIPSCHD.tdlv_cd,
											S0_SHIPSCHD.tdlv_addr2,
											S0_SHIPPR.ship_to_addr2
										).isNull()
										.and(bind("tdlv_addr2").isNull())
									)
								)
								.and(
									bracket(
										nvl2(
											S0_SHIPSCHD.tdlv_cd,
											S0_SHIPSCHD.tdlv_addr3,
											S0_SHIPPR.ship_to_addr3
										).eq(bind("tdlv_addr3"))
									)
									.or(
										nvl2(
											S0_SHIPSCHD.tdlv_cd,
											S0_SHIPSCHD.tdlv_addr3,
											S0_SHIPPR.ship_to_addr3
										).isNull()
										.and(bind("tdlv_addr3").isNull())
									)
								)
								.and(
									bracket(
										nvl2(
											S0_SHIPSCHD.tdlv_cd,
											S0_SHIPSCHD.tdlv_addr4,
											S0_SHIPPR.ship_to_addr4
										).eq(bind("tdlv_addr4"))
									)
									.or(
										nvl2(
											S0_SHIPSCHD.tdlv_cd,
											S0_SHIPSCHD.tdlv_addr4,
											S0_SHIPPR.ship_to_addr4
										).isNull()
										.and(bind("tdlv_addr4").isNull())
									)
								)
								.and(
									bracket(
										nvl2(
											S0_SHIPSCHD.tdlv_cd,
											S0_SHIPSCHD.tdlv_cntct_dpt,
											S0_SHIPPR.ship_to_cntct_dpt
										).eq(bind("tdlv_cntct_dpt"))
									)
									.or(
										nvl2(
											S0_SHIPSCHD.tdlv_cd,
											S0_SHIPSCHD.tdlv_cntct_dpt,
											S0_SHIPPR.ship_to_cntct_dpt
										).isNull()
										.and(bind("tdlv_cntct_dpt").isNull())
									)
								)
								.and(
									bracket(
										nvl2(
											S0_SHIPSCHD.tdlv_cd,
											S0_SHIPSCHD.tdlv_cntct_psn,
											S0_SHIPPR.ship_to_cntct_psn
										).eq(bind("tdlv_cntct_psn"))
									)
									.or(
										nvl2(
											S0_SHIPSCHD.tdlv_cd,
											S0_SHIPSCHD.tdlv_cntct_psn,
											S0_SHIPPR.ship_to_cntct_psn
										).isNull()
										.and(bind("tdlv_cntct_psn").isNull())
									)
								)
								.and(
									bracket(
										nvl2(
											S0_SHIPSCHD.tdlv_cd,
											S0_SHIPSCHD.tdlv_tel,
											S0_SHIPPR.ship_to_tel
										).eq(bind("tdlv_tel"))
									)
									.or(
										nvl2(
											S0_SHIPSCHD.tdlv_cd,
											S0_SHIPSCHD.tdlv_tel,
											S0_SHIPPR.ship_to_tel
										).isNull()
										.and(bind("tdlv_tel").isNull())
									)
								)
								.and(
									bracket(
										nvl2(
											S0_SHIPSCHD.tdlv_cd,
											S0_SHIPSCHD.tdlv_fax,
											S0_SHIPPR.ship_to_fax
										).eq(bind("tdlv_fax"))
									)
									.or(
										nvl2(
											S0_SHIPSCHD.tdlv_cd,
											S0_SHIPSCHD.tdlv_fax,
											S0_SHIPPR.ship_to_fax
										).isNull()
										.and(bind("tdlv_fax").isNull())
									)
								)
								.and(
									nvl2(
										S0_SHIPSCHD.tdlv_cd,
										S0_SHIPSCHD.tdlv_sundry_flg,
										S0_SHIPPR.ship_to_sundry_flg
									).eq(value(false))
									.or(
										nvl2(
											S0_SHIPSCHD.tdlv_cd,
											S0_SHIPSCHD.tdlv_sundry_flg,
											S0_SHIPPR.ship_to_sundry_flg
										).eq(value(true))
										.and(
											bracket(
												nvl2(
													S0_SHIPSCHD.tdlv_cd,
													S0_SHIPSCHD.tdlv_nm,
													S0_SHIPPR.ship_to_id_nm
												).eq(bind("tdlv_nm"))
											)
											.or(
												nvl2(
													S0_SHIPSCHD.tdlv_cd,
													S0_SHIPSCHD.tdlv_nm,
													S0_SHIPPR.ship_to_id_nm
												).isNull()
												.and(bind("tdlv_id_nm").isNull())
											)
										)
									)
								)
							)
							.or(
								MAC_VIA_DLV_TYP$IS_NOT_VIA(
									nvl(
										S0_SHIPSCHD.via_dlv_typ,
										S0_SHIPPR.via_dlv_typ
									)
								).eq(value(true))
							)
						)
						.and(
							bracket(
								S0_SLO.sls_basis_typ.eq(bind("sls_basis_typ"))
							)
							.or(
								S0_SLO.sls_basis_typ.isNull()
								.and(bind("sls_basis_typ").isNull())
							)
						)
						.and(
							bracket(
								S0_XFRSCHD.prov_basis_typ.eq(bind("prov_basis_typ"))
							)
							.or(
								S0_XFRSCHD.prov_basis_typ.isNull()
								.and(bind("prov_basis_typ").isNull())
							)
						)
						.and(
							bracket(
								S0_SHIPPR.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.SLS.value()))
								.and(
									S0_SLO.trd_cur_cd.eq(bind("trd_cur_cd"))
									.or(
										S0_SLO.trd_cur_cd.isNull()
										.and(bind("trd_cur_cd").isNull())
									)
								)
							)
							.or(
								S0_SHIPPR.trd_ptn_typ.in(
									value(MAC_TRD_PTN_TYP.XFR.value()),
									value(MAC_TRD_PTN_TYP.XFR_RTN.value()),
									value(MAC_TRD_PTN_TYP.SHIP.value())
								)
							)
							.or(
								S0_SHIPPR.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.PROV.value()))
								.and(
									bracket(
										bracket(
											S0_XFRSCHD.trd_cur_cd.eq(bind("trd_cur_cd"))
											.or(S0_XFRSCHD.trd_cur_cd.isNull())
										)
										.and(bind("trd_cur_cd").isNotNull())
									)
									.or(
										S0_XFRSCHD.trd_cur_cd.isNull()
										.and(bind("trd_cur_cd").isNull())
									)
								)
							)
						)
						.and(
							not(
								exists(
									subQuery()
									.select(value("X"))
									.from(S5_SHIPINSTDWK)
									.where(
										S0_SHIPINSTD.ship_inst_d_no.eq(S5_SHIPINSTDWK.ship_inst_d_no)
									)
								)
							)
						)
					)
					.orderBy(
						S0_SHIPSCHD.ship_schd_no.asc(),
						S0_SHIPINST.ship_inst_no.asc(),
						S0_SHIPINSTD.ship_inst_d_no.asc()
					)
			)
			.setJoinInfo(
				joinInfo(
					j -> j
						.add(MSVT_WRK_SNO_R.class, r -> toCondition(
							r.getStringNE("sno1")
						))
						.addSelect(m -> toArray(
							m.wrk_nm,
							m.wrk_no
						))
						.addMap((r, m) -> {
							r.setStringNE("wrk_no", m.wrk_no());
							r.setStringNE("wrk_nm", m.wrk_nm());
					}),
					j -> j
						.add(MAM_UNIT_R.class, r -> toCondition(
							r.getStringNE("trd_unit_cd")
						))
						.addSelect(m -> toArray(
							m.unit_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("trd_unit_nm", m.unit_nm());
					}),
					j -> j
						.add(MAM_UNIT_R.class, r -> toCondition(
							r.getStringNE("base_unit_cd")
						))
						.addSelect(m -> toArray(
							m.unit_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("base_unit_nm", m.unit_nm());
					}),
					j -> j
						.add(MAM_STK_GD_R.class, r -> toCondition(
							r.getStringNE("gd_cd")
						))
						.addSelect(m -> toArray(
							m.gd_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("gd_nm", m.gd_nm());
					}),
					j -> j
						.add(MAM_BIZ_RSN_R.class, r -> toCondition(
							r.getStringNE("rsn_cd")
						))
						.addSelect(m -> toArray(
							m.biz_rsn_nm,
							m.sls_acxfr_flg
						))
						.addMap((r, m) -> {
							r.setStringNE("rsn_nm", m.biz_rsn_nm());
							r.setBooleanNE("sls_acxfr_flg", m.sls_acxfr_flg());
					}),
					j -> j
						.add(MAM_USR_R.class, r -> toCondition(
							r.getStringNE("sls_usr_cd")
						))
						.addSelect(m -> toArray(
							m.usr_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("sls_usr_nm", m.usr_nm());
					}),
					j -> j
						.add(MAM_BIZ_RSN_R.class, r -> toCondition(
							r.getStringNE("dscnt_rsn_cd")
						))
						.addSelect(m -> toArray(
							m.biz_rsn_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("dscnt_rsn_nm", m.biz_rsn_nm());
					}),
					j -> j
						.add(MAVM_ITM_UNIT_R.class, r -> toCondition(
							r.getStringNE("itm_cd"),
							r.getStringNE("itm_sub1"),
							r.getStringNE("itm_sub2"),
							r.getStringNE("itm_sub3"),
							r.getStringNE("trd_unit_cd")
						))
						.addSelect(m -> toArray(
							m.conv_base_qty,
							m.conv_qty,
							m.dec_place,
							m.rnd_typ
						))
						.addMap((r, m) -> {
							r.setNumberNE("trd_unit_conv_base_qty", m.conv_base_qty());
							r.setNumberNE("trd_unit_conv_qty", m.conv_qty());
							r.setNumberNE("trd_unit_dec_place", m.dec_place());
							r.setStringNE("trd_unit_rnd_typ", m.rnd_typ());
					}),
					j -> j
						.add(MAM_TRNSPT_R.class, r -> toCondition(
							r.getStringNE("trnspt_cd")
						))
						.addSelect(m -> toArray(
							m.trnspt_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("trnspt_nm", m.trnspt_nm());
					}),
					j -> j
						.add(MAM_EXIM_PORT_R.class, r -> toCondition(
							r.getStringNE("load_port_cd")
						))
						.addSelect(m -> toArray(
							m.port_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("load_port_nm", m.port_nm());
					}),
					j -> j
						.add(MAM_EXIM_PORT_R.class, r -> toCondition(
							r.getStringNE("dschrg_port_cd")
						))
						.addSelect(m -> toArray(
							m.port_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("dschrg_port_nm", m.port_nm());
					}),
					j -> j
						.add(MAM_EXIM_PORT_R.class, r -> toCondition(
							r.getStringNE("via_port_cd")
						))
						.addSelect(m -> toArray(
							m.port_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("via_port_nm", m.port_nm());
					}),
					j -> j
						.add(MAM_TRD_R.class, r -> toCondition(
							r.getStringNE("trd_cd")
						))
						.addSelect(m -> toArray(
							m.trd_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("trd_nm", m.trd_nm());
					}),
					j -> j
						.add(MAM_TTERM_R.class, r -> toCondition(
							r.getStringNE("tterm_cd1")
						))
						.addSelect(m -> toArray(
							m.tterm_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("tterm_nm1", m.tterm_nm());
					}),
					j -> j
						.add(MAM_TTERM_R.class, r -> toCondition(
							r.getStringNE("tterm_cd2")
						))
						.addSelect(m -> toArray(
							m.tterm_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("tterm_nm2", m.tterm_nm());
					}),
					j -> j
						.add(MAM_TTERM_R.class, r -> toCondition(
							r.getStringNE("tterm_cd3")
						))
						.addSelect(m -> toArray(
							m.tterm_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("tterm_nm3", m.tterm_nm());
					}),
					j -> j
						.add(MAM_LG_GRP_R.class, r -> toCondition(
							r.getStringNE("ship_fr_lg_grp_cd")
						))
						.addSelect(m -> toArray(
							m.lg_grp_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("ship_fr_lg_grp_nm", m.lg_grp_nm());
					})
				)
			);
	}
	
	/**
	 * -- MSBEL1730_MST_SHIP_ACT_D_Query_S01
	 */
	static MCQueryPlan MSBEL1730_MST_SHIP_ACT_D_S01() {
		MST_SHIP_ACT_D_R S0_SHIPACTD = MST_SHIP_ACT_D_R.create("SHIPACTD");
		MSW_SHIP_ACT_D_KEY_R S0_SHIPACTDWK = MSW_SHIP_ACT_D_KEY_R.create("SHIPACTDWK");
		MST_SHIP_ACT_R S0_SHIPACT = MST_SHIP_ACT_R.create("SHIPACT");
		MST_SHIP_PR_R S0_SHIPPR = MST_SHIP_PR_R.create("SHIPPR");
		MST_SLO_D_R S0_SLOD = MST_SLO_D_R.create("SLOD");
		MST_SLO_R S0_SLO = MST_SLO_R.create("SLO");
		MST_PROV_SCHD_R S0_PROVSCHD = MST_PROV_SCHD_R.create("PROVSCHD");
		MST_XFR_SCHD_R S0_XFRSCHD = MST_XFR_SCHD_R.create("XFRSCHD");
		MST_SLS_SCHD_R S0_SLSSCHD = MST_SLS_SCHD_R.create("SLSSCHD");
		MST_SHIP_ALLOC_STS_R S0_SHIPALLOCSTS = MST_SHIP_ALLOC_STS_R.create("SHIPALLOCSTS");
		MST_SHIP_INST_D_R S0_SHIPINSTD = MST_SHIP_INST_D_R.create("SHIPINSTD");
		MST_SHIP_INST_R S0_SHIPINST = MST_SHIP_INST_R.create("SHIPINST");
		MST_SHIP_SCHD_R S0_SHIPSCHD = MST_SHIP_SCHD_R.create("SHIPSCHD");
		MAM_ITM_R S0_ITM = MAM_ITM_R.create("ITM");
		MAM_CNTRY_R S0_CNTRY = MAM_CNTRY_R.create("CNTRY");
		MAM_TAX_R S0_TAX = MAM_TAX_R.create("TAX");
		MAM_DPT_R S0_BDDPT = MAM_DPT_R.create("BDDPT");
		MAM_DPT_R S0_ARDPT = MAM_DPT_R.create("ARDPT");
		MAM_DPT_R S0_SLSDPT = MAM_DPT_R.create("SLSDPT");
		MAM_BP_R S0_CST = MAM_BP_R.create("CST");
		MAM_SUNDRY_ITM_R S0_SUNDRYITM = MAM_SUNDRY_ITM_R.create("SUNDRYITM");
		MAM_LOC_R S0_LOC = MAM_LOC_R.create("LOC");
		MAM_BP_R S0_DLV = MAM_BP_R.create("DLV");
		MAM_ITM_LCL_R S0_ITMLCL = MAM_ITM_LCL_R.create("ITMLCL");
		MAM_BP_R S0_SPPL = MAM_BP_R.create("SPPL");
		MAVM_ITM_UNIT_R S0_ITMUNIT = MAVM_ITM_UNIT_R.create("ITMUNIT");
		MAM_CUR_R S0_TRDCUR = MAM_CUR_R.create("TRDCUR");
		MAM_ITM_LG_GRP_R S0_ITMLGGRP = MAM_ITM_LG_GRP_R.create("ITMLGGRP");
		MAM_LOC_R S0_GILOC = MAM_LOC_R.create("GILOC ");
		MCTempView S1_VIVSHIPACTMAP = createTempView("VIVSHIPACTMAP");
		MST_IV_SHIP_ACT_MAP_R S1_IVSHIPACTMAP = MST_IV_SHIP_ACT_MAP_R.create("IVSHIPACTMAP");
		MAVM_RD_WG_R S2_RDWG = MAVM_RD_WG_R.create("RDWG");
		MAVM_RD_LOC_R S3_RDLOC = MAVM_RD_LOC_R.create("RDLOC");
		MST_SLS_SCHD_R S4_SLSSCHD = MST_SLS_SCHD_R.create("SLSSCHD");
		MST_PURC_SCHD_R S4_PURCSCHD = MST_PURC_SCHD_R.create("PURCSCHD");
		MST_ARR_PR_R S4_ARRPR = MST_ARR_PR_R.create("ARRPR");
		MST_PO_D_R S4_POD = MST_PO_D_R.create("POD");
		MST_PO_R S4_PO = MST_PO_R.create("PO");
		MAM_BP_R S4_SPPL = MAM_BP_R.create("SPPL");
		
		return createQueryPlan()
			.setQuery(
				sql("MSBEL1730_MST_SHIP_ACT_D_Query_S01")
					.mainQuery()
					.select(
						value(true).as("existed_flg"),
						S0_SHIPSCHD.ship_schd_no,
						S0_SHIPINSTD.ship_inst_d_no,
						S0_SHIPINST.ship_inst_no,
						S0_SHIPACTD.ship_act_d_no,
						S0_SHIPACTD.dlv_slip_d_no,
						S0_SHIPACT.ship_act_no,
						S0_SHIPACT.uplnd_flg,
						S0_SHIPACTD.itm_cd,
						S0_SHIPACTD.itm_sub1,
						S0_SHIPACTD.itm_sub2,
						S0_SHIPACTD.itm_sub3,
						cases()
							.when(S0_SHIPACTD.sundry_itm_flg.eq(value(true)))
								.then(
									nvl(
										S0_SHIPACTD.itm_nm,
										S0_SUNDRYITM.itm_nm
									)
							)
							.otherwise(S0_ITM.itm_nm).as("itm_nm"),
						S0_SHIPACTD.sundry_itm_flg,
						S0_ITM.sls_upri_cng_flg,
						S0_ITM.stk_mng_typ,
						S0_ITM.asset_mng_typ,
						S0_ITM.sno1_mng_typ,
						S0_ITM.sno2_mng_typ,
						S0_ITM.sno3_mng_typ,
						S0_ITM.sno4_mng_typ,
						S0_ITM.dscnt_itm_flg,
						S0_ITM.exim_xpns_typ,
						cases()
							.when(S0_SHIPACTD.sundry_itm_flg.eq(value(true)))
								.then(
									nvl(
										S0_SHIPACTD.iv_itm_nm,
										S0_SUNDRYITM.itm_nm
									)
							)
							.otherwise(
								nvl(
									S0_ITMLCL.itm_nm,
									S0_ITM.itm_nm
								)
							).as("iv_itm_nm"),
						coalesce(
							S0_SLOD.cntry_org_cd,
							S0_ITM.cntry_org_cd
						).as("cntry_org_cd"),
						S0_CNTRY.cntry_nm.as("cntry_org_nm"),
						nvl(
							decode(
								S0_SHIPACTD.trd_ptn_typ,
								value(MAC_TRD_PTN_TYP.SLS.value()),
								S0_CST.sls_amt_rnd_typ,
								value(MAC_TRD_PTN_TYP.PROV.value()),
								S0_SPPL.prov_amt_rnd_typ,
								value(MAC_RND_TYP.RNDOFF.value())
							),
							value(MAC_RND_TYP.RNDOFF.value())
						).as("trd_amt_rnd_typ"),
						nvl(
							decode(
								S0_SHIPACTD.trd_ptn_typ,
								value(MAC_TRD_PTN_TYP.SLS.value()),
								S0_CST.sls_tax_rnd_typ,
								value(MAC_TRD_PTN_TYP.PROV.value()),
								S0_SPPL.prov_tax_rnd_typ,
								value(MAC_RND_TYP.RNDOFF.value())
							),
							value(MAC_RND_TYP.RNDOFF.value())
						).as("trd_tax_rnd_typ"),
						decode(
							S0_SLOD.trd_unit_cd,
							nullValue(),
							S0_SHIPACTD.trd_unit_cd,
							S0_SLOD.trd_unit_cd
						).as("trd_unit_cd"),
						nullValue().as("trd_unit_qty"),
						S0_SHIPACTD.base_unit_cd,
						bracket(
							S0_SHIPACTD.base_unit_qty.subtract(nvl(S1_VIVSHIPACTMAP.pr("iv_qty"), value(0))).subtract(S0_SHIPACTD.ship_ret_qty)
						).as("base_unit_qty"),
						bracket(
							S0_SHIPACTD.base_unit_qty.subtract(nvl(S1_VIVSHIPACTMAP.pr("iv_qty"), value(0))).subtract(S0_SHIPACTD.ship_ret_qty)
						).as("max_base_unit_qty"),
						S0_ITM.dec_place.as("base_unit_dec_place"),
						S0_ITM.rnd_typ.as("base_unit_rnd_typ"),
						S0_SHIPACTD.gd_cd,
						S0_SHIPACTD.trd_cd,
						decode(
							S0_SHIPACTD.trd_ptn_typ,
							value(MAC_TRD_PTN_TYP.SLS.value()),
							S0_SLOD.trd_unit_cd,
							value(MAC_TRD_PTN_TYP.SHIP.value()),
							S0_SLOD.trd_unit_cd,
							value(MAC_TRD_PTN_TYP.PROV.value()),
							S0_XFRSCHD.trd_unit_cd,
							nullValue()
						).as("schd_trd_unit_cd"),
						decode(
							S0_SHIPACTD.trd_ptn_typ,
							value(MAC_TRD_PTN_TYP.SLS.value()),
							S0_SLOD.trd_unit_qty,
							value(MAC_TRD_PTN_TYP.SHIP.value()),
							S0_SLOD.trd_unit_qty,
							value(MAC_TRD_PTN_TYP.PROV.value()),
							S0_XFRSCHD.trd_unit_qty,
							nullValue()
						).as("schd_trd_unit_qty"),
						S0_ITMUNIT.dec_place.as("schd_trd_unit_dec_place"),
						S0_ITMUNIT.conv_base_qty.as("schd_trd_unit_conv_base_qty"),
						S0_ITMUNIT.conv_qty.as("schd_trd_unit_conv_qty"),
						S0_ITMUNIT.rnd_typ.as("schd_trd_unit_rnd_typ"),
						decode(
							S0_SHIPACTD.trd_ptn_typ,
							value(MAC_TRD_PTN_TYP.SLS.value()),
							S0_SLOD.base_unit_qty,
							value(MAC_TRD_PTN_TYP.SHIP.value()),
							S0_SLOD.base_unit_qty,
							value(MAC_TRD_PTN_TYP.PROV.value()),
							S0_XFRSCHD.base_unit_qty,
							nullValue()
						).as("schd_base_unit_qty"),
						S0_SLOD.trd_cur_dscnt_amt.as("schd_trd_cur_dscnt_amt"),
						S0_SLOD.iv_upri.as("iv_upri"),
						S0_SLOD.iv_amt.as("schd_iv_amt"),
						decode(
							S0_SHIPACTD.trd_ptn_typ,
							value(MAC_TRD_PTN_TYP.SLS.value()),
							S0_SLOD.trd_cur_upri,
							value(MAC_TRD_PTN_TYP.PROV.value()),
							S0_PROVSCHD.trd_cur_upri,
							nullValue()
						).as("schd_trd_cur_upri"),
						S0_SLOD.upri_not_tgt_flg,
						S0_SLOD.interim_flg,
						S0_SLOD.sls_cststk_flg,
						decode(
							S0_SHIPACTD.trd_ptn_typ,
							value(MAC_TRD_PTN_TYP.SLS.value()),
							S0_SLOD.trd_cur_amt,
							value(MAC_TRD_PTN_TYP.PROV.value()),
							S0_PROVSCHD.trd_cur_amt,
							nullValue()
						).as("schd_trd_cur_amt"),
						decode(
							S0_SHIPACTD.trd_ptn_typ,
							value(MAC_TRD_PTN_TYP.SLS.value()),
							S0_SLOD.trd_cur_tax_amt,
							value(MAC_TRD_PTN_TYP.PROV.value()),
							S0_PROVSCHD.trd_cur_tax_amt,
							nullValue()
						).as("schd_trd_cur_tax_amt"),
						decode(
							S0_SHIPACTD.trd_ptn_typ,
							value(MAC_TRD_PTN_TYP.SLS.value()),
							S0_SLOD.wtax_rate,
							value(MAC_TRD_PTN_TYP.PROV.value()),
							S0_PROVSCHD.wtax_rate,
							nullValue()
						).as("wtax_rate"),
						decode(
							S0_SHIPACTD.trd_ptn_typ,
							value(MAC_TRD_PTN_TYP.SLS.value()),
							S0_SLOD.wtax_amt,
							value(MAC_TRD_PTN_TYP.PROV.value()),
							S0_PROVSCHD.wtax_amt,
							nullValue()
						).as("schd_wtax_amt"),
						S0_SHIPACTD.trd_ptn_typ,
						S0_XFRSCHD.prov_basis_typ,
						coalesce(
							S0_SLO.trd_cur_cd,
							S0_PROVSCHD.trd_cur_cd,
							S0_XFRSCHD.trd_cur_cd
						).as("trd_cur_cd"),
						S0_TRDCUR.amt_dec_place,
						S0_TRDCUR.upri_dec_place,
						nvl(
							decode(
								S0_SHIPACTD.trd_ptn_typ,
								value(MAC_TRD_PTN_TYP.SLS.value()),
								S0_CST.sls_amt_rnd_typ,
								value(MAC_TRD_PTN_TYP.PROV.value()),
								S0_SPPL.prov_amt_rnd_typ,
								value(MAC_RND_TYP.RNDOFF.value())
							),
							value(MAC_RND_TYP.RNDOFF.value())
						).as("amt_rnd_typ"),
						nvl(
							decode(
								S0_SHIPACTD.trd_ptn_typ,
								value(MAC_TRD_PTN_TYP.SLS.value()),
								S0_CST.sls_tax_rnd_typ,
								value(MAC_TRD_PTN_TYP.PROV.value()),
								S0_SPPL.prov_tax_rnd_typ,
								value(MAC_RND_TYP.RNDOFF.value())
							),
							value(MAC_RND_TYP.RNDOFF.value())
						).as("tax_rnd_typ"),
						decode(
							S0_SHIPACTD.trd_ptn_typ,
							value(MAC_TRD_PTN_TYP.SLS.value()),
							S0_SLOD.tax_cd,
							value(MAC_TRD_PTN_TYP.PROV.value()),
							S0_PROVSCHD.tax_cd,
							nullValue()
						).as("tax_cd"),
						decode(
							S0_SHIPACTD.trd_ptn_typ,
							value(MAC_TRD_PTN_TYP.SLS.value()),
							S0_SLOD.tax_fix_flg,
							value(MAC_TRD_PTN_TYP.PROV.value()),
							S0_PROVSCHD.tax_fix_flg,
							nullValue()
						).as("tax_fix_flg"),
						S0_TAX.tax_nm,
						S0_TAX.inc_tax_flg,
						S0_TAX.tax_rate,
						S0_SLOD.dest_cd1,
						S0_SLOD.dest_cd2,
						S0_SLOD.dest_cd3,
						S0_SHIPACTD.cst_po_no, 
						S0_SHIPACTD.cst_po_d_no, 
						S0_SHIPACT.ship_fr_lg_grp_cd,
						S0_SHIPACTD.cst_itm_cd, 
						S0_SHIPACTD.cst_itm_nm, 
						decode(S0_SHIPACT.uplnd_flg, 
							value(true),
							S0_SHIPACTD.rsn_cd, 
							S0_SHIPPR.rsn_cd
						).as("rsn_cd"),
						decode(S0_SHIPACT.uplnd_flg, 
							value(true),
							S0_SHIPACTD.bd_dpt_cd, 
							S0_SHIPPR.bd_dpt_cd
						).as("bd_dpt_cd"),
						S0_BDDPT.dpt_nm.as("bd_dpt_nm"),
						S0_SHIPACTD.sno1,
						S0_SHIPACTD.sno2,
						S0_SHIPACTD.sno3,
						S0_SHIPACTD.sno4,
						nvl(S0_SLO.sls_usr_cd, 
							decode(
								S0_SHIPACTD.trd_ptn_typ,
								value(MAC_TRD_PTN_TYP.SLS.value()),
								S0_SHIPACT.rqst_usr_cd,
								value(MAC_TRD_PTN_TYP.SHIP.value()),
								S0_SHIPACT.rqst_usr_cd,
								nullValue())
						).as("sls_usr_cd"),
						nvl(S0_SLO.sls_dpt_cd, 
								decode(
									S0_SHIPACTD.trd_ptn_typ,
									value(MAC_TRD_PTN_TYP.SLS.value()),
									S0_SHIPACT.rqst_dpt_cd,
									value(MAC_TRD_PTN_TYP.SHIP.value()),
									S0_SHIPACT.rqst_dpt_cd,
									nullValue())
						).as("sls_dpt_cd"),
						S0_SLSDPT.dpt_nm.as("sls_dpt_nm"),
						S0_SLSDPT.wg_cd.as("sls_dpt_wg_cd"),
						S0_SLO.ar_dpt_cd,
						S0_ARDPT.dpt_nm.as("ar_dpt_nm"),
						S0_SLOD.dscnt_rsn_cd,
						S0_SHIPACTD.trd_rmrks,
						S0_SHIPACTD.trd_d_rmrks,
						S0_SLO.slo_no,
						S0_SHIPPR.purc_ddlv_flg,
						S0_SHIPPR.slo_d_no,
						S0_SHIPPR.xfr_schd_no,
						trunc(
							S0_SHIPPR.dlv_rqst_tm,
							MCDateFmt.DD
						).as("dlv_rqst_dt"),
						S0_SHIPPR.dlv_rqst_tm.as("dlv_rqst_hm"),
						S0_SHIPPR.ship_pr_no,
						S0_SHIPPR.ship_inst_typ,
						S0_SHIPSCHD.pr_sts_typ,
						S0_SLSSCHD.purc_schd_no,
						S0_SLSSCHD.purc_act_d_no,
						S0_SHIPALLOCSTS.ship_alloc_sts_no,
						S0_SHIPPR.upd_cntr.as("ship_pr_upd_cntr")
					)
					.from(
						S0_SHIPACTD
						.innerJoin(S0_SHIPACTDWK).on(
							bracket(
								S0_SHIPACTD.ship_act_d_no.eq(S0_SHIPACTDWK.ship_act_d_no)
							)
						)
						.innerJoin(S0_SHIPACT).on(S0_SHIPACT.ship_act_no.eq(S0_SHIPACTD.ship_act_no))
						.leftOuterJoin(S0_SHIPALLOCSTS).on(S0_SHIPALLOCSTS.ship_alloc_sts_no.eq(S0_SHIPACTD.ship_alloc_sts_no))
						.leftOuterJoin(S0_SHIPINSTD).on(S0_SHIPALLOCSTS.ship_inst_d_no.eq(S0_SHIPINSTD.ship_inst_d_no))
						.leftOuterJoin(S0_SHIPINST).on(S0_SHIPINSTD.ship_inst_no.eq(S0_SHIPINST.ship_inst_no))
						.leftOuterJoin(S0_SHIPSCHD).on(S0_SHIPALLOCSTS.ship_schd_no.eq(S0_SHIPSCHD.ship_schd_no))
						.leftOuterJoin(S0_SHIPPR).on(
							bracket(
								S0_SHIPSCHD.ship_pr_no.eq(S0_SHIPPR.ship_pr_no)
							)
						)
						.leftOuterJoin(S0_SLOD).on(
							bracket(
								S0_SLOD.slo_d_no.eq(S0_SHIPPR.slo_d_no)
							)
						)
						.leftOuterJoin(S0_SLO).on(
							bracket(
								S0_SLO.slo_no.eq(S0_SLOD.slo_no)
							)
						)
						.leftOuterJoin(S0_PROVSCHD).on(
							bracket(
								S0_SHIPSCHD.ship_schd_no.eq(S0_PROVSCHD.prov_src_schd_no1)
								.and(MAC_TRD_PTN_TYP$IS_PROV(S0_PROVSCHD.trd_ptn_typ).eq(value(true)))
							)
						)
						.leftOuterJoin(S0_XFRSCHD).on(
							bracket(
								S0_SHIPPR.xfr_schd_no.eq(S0_XFRSCHD.xfr_schd_no)
							)
						)
						.leftOuterJoin(subQuery().select(
								S1_IVSHIPACTMAP.ship_act_d_no,
								sum(S1_IVSHIPACTMAP.base_unit_qty).as("iv_qty")
								).from(S1_IVSHIPACTMAP)
								.groupBy(S1_IVSHIPACTMAP.ship_act_d_no)
								.view(S1_VIVSHIPACTMAP))
						.on(S0_SHIPACTD.ship_act_d_no.eq(S1_VIVSHIPACTMAP.pr(S1_IVSHIPACTMAP.ship_act_d_no)))
						.leftOuterJoin(S0_ITM).on(
							bracket(
								S0_SHIPACTD.itm_cd.eq(S0_ITM.itm_cd)
								.and(S0_SHIPACTD.itm_sub1.eq(S0_ITM.itm_sub1))
								.and(S0_SHIPACTD.itm_sub2.eq(S0_ITM.itm_sub2))
								.and(S0_SHIPACTD.itm_sub3.eq(S0_ITM.itm_sub3))
							)
						)
						.leftOuterJoin(S0_SLSSCHD).on(
							bracket(
								S0_SHIPSCHD.ship_schd_no.eq(S0_SLSSCHD.ship_schd_no)
							)
						)
						.leftOuterJoin(S0_CNTRY).on(
							bracket(
								coalesce(
									S0_SLOD.cntry_org_cd,
									S0_ITM.cntry_org_cd
								).eq(S0_CNTRY.cntry_cd)
							)
						)
						.leftOuterJoin(S0_TAX).on(
							bracket(
								decode(
									S0_SHIPACTD.trd_ptn_typ,
									value(MAC_TRD_PTN_TYP.SLS.value()),
									S0_SLOD.tax_cd,
									value(MAC_TRD_PTN_TYP.PROV.value()),
									S0_PROVSCHD.tax_cd,
									nullValue()
								).eq(S0_TAX.tax_cd)
							)
						)
						.leftOuterJoin(S0_BDDPT).on(
							bracket(
								decode(S0_SHIPACT.uplnd_flg, 
									value(true),
									S0_SHIPACTD.bd_dpt_cd, 
									S0_SHIPPR.bd_dpt_cd
								).eq(S0_BDDPT.dpt_cd)
								.and(
									decode(S0_SHIPACT.uplnd_flg, 
										value(true),
										S0_SHIPACT.ac_dt, 
										coalesce(
											S0_SLO.slo_dt,
											S0_XFRSCHD.rcpt_dt
										)
									).between(S0_BDDPT.st_dt, S0_BDDPT.end_dt)
								)
							)
						)
						.leftOuterJoin(S0_ARDPT).on(
							bracket(
								S0_SLO.ar_dpt_cd.eq(S0_ARDPT.dpt_cd)
								.and(S0_SLO.slo_dt.between(S0_ARDPT.st_dt, S0_ARDPT.end_dt))
							)
						)
						.leftOuterJoin(S0_SLSDPT).on(
							bracket(
								S0_SLO.sls_dpt_cd.eq(S0_SLSDPT.dpt_cd)
								.and(S0_SLO.slo_dt.between(S0_SLSDPT.st_dt, S0_SLSDPT.end_dt))
							)
							.or(
								bracket(
									bracket(
											S0_SHIPACTD.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.SLS.value()))
											.or(S0_SHIPACTD.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.SHIP.value())))
									)
									.and(S0_SHIPACT.rqst_dpt_cd.eq(S0_SLSDPT.dpt_cd))
									.and(S0_SHIPACT.ac_dt.between(S0_SLSDPT.st_dt, S0_SLSDPT.end_dt))
								)
							)
						)
						.leftOuterJoin(S0_CST).on(
							bracket(
								nvl(S0_SHIPPR.cst_cd, S0_SHIPACT.cst_cd).eq(S0_CST.bp_cd)
							)
						)
						.leftOuterJoin(S0_SUNDRYITM).on(
							bracket(
								S0_SHIPACTD.itm_cd.eq(S0_SUNDRYITM.itm_cd)
								.and(S0_SHIPACTD.itm_sub1.eq(S0_SUNDRYITM.itm_sub1))
								.and(S0_SHIPACTD.itm_sub2.eq(S0_SUNDRYITM.itm_sub2))
								.and(S0_SHIPACTD.itm_sub3.eq(S0_SUNDRYITM.itm_sub3))
								.and(S0_SHIPACTD.sno1.eq(S0_SUNDRYITM.sno1))
								.and(S0_SHIPACTD.sno2.eq(S0_SUNDRYITM.sno2))
								.and(S0_SHIPACTD.sno3.eq(S0_SUNDRYITM.sno3))
								.and(S0_SHIPACTD.sno4.eq(S0_SUNDRYITM.sno4))
							)
						)
						.leftOuterJoin(S0_LOC).on(S0_SHIPACTD.dlv_id_cd.eq(S0_LOC.loc_cd))
						.leftOuterJoin(S0_DLV).on(S0_SHIPACTD.dlv_id_cd.eq(S0_DLV.bp_cd))
						.leftOuterJoin(S0_ITMLCL).on(
							bracket(
								S0_SHIPACTD.itm_cd.eq(S0_ITMLCL.itm_cd)
								.and(S0_SHIPACTD.itm_sub1.eq(S0_ITMLCL.itm_sub1))
								.and(S0_SHIPACTD.itm_sub2.eq(S0_ITMLCL.itm_sub2))
								.and(S0_SHIPACTD.itm_sub3.eq(S0_ITMLCL.itm_sub3))
								.and(
									bracket(
										S0_SHIPACTD.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.SLS.value()))
										.and(S0_DLV.prnt_lcl_cd.eq(S0_ITMLCL.lcl_cd))
									)
									.or(
										S0_SHIPACTD.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.SHIP.value()))
										.and(S0_DLV.prnt_lcl_cd.eq(S0_ITMLCL.lcl_cd))
									)
									.or(
										S0_SHIPACTD.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.PROV.value()))
										.and(S0_LOC.prnt_lcl_cd.eq(S0_ITMLCL.lcl_cd))
									)
									.or(
										S0_SHIPACTD.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.XFR.value()))
										.and(S0_LOC.prnt_lcl_cd.eq(S0_ITMLCL.lcl_cd))
									)
									.or(
										S0_SHIPACTD.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.XFR_RTN.value()))
										.and(S0_LOC.prnt_lcl_cd.eq(S0_ITMLCL.lcl_cd))
									)
								)
							)
						)
						.leftOuterJoin(S0_SPPL).on(
							bracket(
								S0_LOC.sppl_cd.eq(S0_SPPL.bp_cd)
							)
						)
						.leftOuterJoin(S0_ITMUNIT).on(
							bracket(
								S0_SHIPACTD.itm_cd.eq(S0_ITMUNIT.itm_cd)
								.and(S0_SHIPACTD.itm_sub1.eq(S0_ITMUNIT.itm_sub1))
								.and(S0_SHIPACTD.itm_sub2.eq(S0_ITMUNIT.itm_sub2))
								.and(S0_SHIPACTD.itm_sub3.eq(S0_ITMUNIT.itm_sub3))
								.and(
									decode(
										S0_SHIPACTD.trd_ptn_typ,
										value(MAC_TRD_PTN_TYP.SLS.value()),
										S0_SLOD.trd_unit_cd,
										value(MAC_TRD_PTN_TYP.SHIP.value()),
										S0_SLOD.trd_unit_cd,
										value(MAC_TRD_PTN_TYP.PROV.value()),
										S0_XFRSCHD.trd_unit_cd,
										nullValue()
									).eq(S0_ITMUNIT.unit_cd)
								)
							)
						)
						.leftOuterJoin(S0_TRDCUR).on(coalesce(S0_SLO.trd_cur_cd, S0_PROVSCHD.trd_cur_cd, S0_XFRSCHD.trd_cur_cd).eq(S0_TRDCUR.cur_cd))
						.leftOuterJoin(S0_ITMLGGRP).on(
							bracket(
								S0_XFRSCHD.itm_cd.eq(S0_ITMLGGRP.itm_cd)
								.and(S0_XFRSCHD.itm_sub1.eq(S0_ITMLGGRP.itm_sub1))
								.and(S0_XFRSCHD.itm_sub2.eq(S0_ITMLGGRP.itm_sub2))
								.and(S0_XFRSCHD.itm_sub3.eq(S0_ITMLGGRP.itm_sub3))
								.and(S0_XFRSCHD.gi_lg_grp_cd.eq(S0_ITMLGGRP.lg_grp_cd))
							)
						)
						.leftOuterJoin(S0_GILOC).on(
							bracket(
								S0_XFRSCHD.gi_lg_grp_cd.eq(S0_GILOC.lg_grp_cd)
								.and(S0_GILOC.lg_def_flg.eq(value(true)))
								.and(S0_GILOC.del_flg.eq(value(false)))
							)
						)
					)
					.where(
						value(0).eq(value(0))
						.and(S0_SHIPACT.can_flg.eq(value(false)))
						.and(S0_SHIPACTD.can_flg.eq(value(false)))
						.and(
							exists(
								subQuery()
								.select(value("X"))
								.from(S2_RDWG)
								.where(
									S0_SLSDPT.wg_cd.eq(S2_RDWG.wg_cd)
								)
							)
							.or(
								exists(
									subQuery()
									.select(value("X"))
									.from(S3_RDLOC)
									.where(
										coalesce(
											S0_XFRSCHD.gi_loc_cd,
											S0_ITMLGGRP.lg_def_loc_cd,
											S0_GILOC.loc_cd
										).eq(S3_RDLOC.loc_cd)
									)
								)
							)
						)
						.and(
							bracket(
							S0_SHIPACT.uplnd_flg.eq(value(true))
							.or(
								S0_SHIPPR.purc_ddlv_flg.eq(value(false))
								.or(
									exists(
											subQuery()
											.select(value("X"))
											.from(
												S4_SLSSCHD
												.innerJoin(S4_PURCSCHD).on(
													bracket(
														S4_SLSSCHD.purc_schd_no.eq(S4_PURCSCHD.purc_schd_no)
													)
												)
												.innerJoin(S4_ARRPR).on(
													bracket(
														S4_PURCSCHD.arr_pr_no.eq(S4_ARRPR.arr_pr_no)
													)
												)
												.innerJoin(S4_POD).on(
													bracket(
														S4_ARRPR.po_d_no.eq(S4_POD.po_d_no)
													)
												)
												.innerJoin(S4_PO).on(
													bracket(
														S4_POD.po_no.eq(S4_PO.po_no)
													)
												)
												.leftOuterJoin(S4_SPPL).on(
													bracket(
														S4_PO.sppl_cd.eq(S4_SPPL.bp_cd)
													)
												)
											)
											.where(
												value(0).eq(value(0))
												.and(S0_SHIPSCHD.ship_schd_no.eq(S4_SLSSCHD.ship_schd_no))
												.and(S4_SLSSCHD.cmpl_flg.eq(value(false)))
												.and(S4_SLSSCHD.purc_schd_no.isNotNull())
												.and(S4_POD.rqst_can_flg.eq(value(false)))
												.and(S4_SPPL.sppl_iv_flg.eq(value(false)))
											)
										)
									)
								)
							)
						)
						.and(S0_SHIPACTD.base_unit_qty.subtract(nvl(S1_VIVSHIPACTMAP.pr("iv_qty"), value(0))).subtract(S0_SHIPACTD.ship_ret_qty).gt(value(0)))
					)
			)
			.setJoinInfo(
				joinInfo(
					j -> j
						.add(MSVT_WRK_SNO_R.class, r -> toCondition(
							r.getStringNE("sno1")
						))
						.addSelect(m -> toArray(
							m.wrk_nm,
							m.wrk_no
						))
						.addMap((r, m) -> {
							r.setStringNE("wrk_no", m.wrk_no());
							r.setStringNE("wrk_nm", m.wrk_nm());
					}),
					j -> j
						.add(MAM_UNIT_R.class, r -> toCondition(
							r.getStringNE("trd_unit_cd")
						))
						.addSelect(m -> toArray(
							m.unit_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("trd_unit_nm", m.unit_nm());
					}),
					j -> j
						.add(MAM_UNIT_R.class, r -> toCondition(
							r.getStringNE("base_unit_cd")
						))
						.addSelect(m -> toArray(
							m.unit_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("base_unit_nm", m.unit_nm());
					}),
					j -> j
						.add(MAM_STK_GD_R.class, r -> toCondition(
							r.getStringNE("gd_cd")
						))
						.addSelect(m -> toArray(
							m.gd_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("gd_nm", m.gd_nm());
					}),
					j -> j
						.add(MAM_BIZ_RSN_R.class, r -> toCondition(
							r.getStringNE("rsn_cd")
						))
						.addSelect(m -> toArray(
							m.biz_rsn_nm,
							m.sls_acxfr_flg
						))
						.addMap((r, m) -> {
							r.setStringNE("rsn_nm", m.biz_rsn_nm());
							r.setBooleanNE("sls_acxfr_flg", m.sls_acxfr_flg());
					}),
					j -> j
						.add(MAM_USR_R.class, r -> toCondition(
							r.getStringNE("sls_usr_cd")
						))
						.addSelect(m -> toArray(
							m.usr_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("sls_usr_nm", m.usr_nm());
					}),
					j -> j
						.add(MAM_BIZ_RSN_R.class, r -> toCondition(
							r.getStringNE("dscnt_rsn_cd")
						))
						.addSelect(m -> toArray(
							m.biz_rsn_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("dscnt_rsn_nm", m.biz_rsn_nm());
					}),
					j -> j
						.add(MAM_TRD_R.class, r -> toCondition(
							r.getStringNE("trd_cd")
						))
						.addSelect(m -> toArray(
							m.trd_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("trd_nm", m.trd_nm());
					}),
					j -> j
						.add(MAVM_ITM_UNIT_R.class, r -> toCondition(
							r.getStringNE("itm_cd"),
							r.getStringNE("itm_sub1"),
							r.getStringNE("itm_sub2"),
							r.getStringNE("itm_sub3"),
							r.getStringNE("trd_unit_cd")
						))
						.addSelect(m -> toArray(
							m.conv_base_qty,
							m.conv_qty,
							m.dec_place,
							m.rnd_typ
						))
						.addMap((r, m) -> {
							r.setNumberNE("trd_unit_conv_base_qty", m.conv_base_qty());
							r.setNumberNE("trd_unit_conv_qty", m.conv_qty());
							r.setNumberNE("trd_unit_dec_place", m.dec_place());
							r.setStringNE("trd_unit_rnd_typ", m.rnd_typ());
					}),
					j -> j
						.add(MAM_LG_GRP_R.class, r -> toCondition(
							r.getStringNE("ship_fr_lg_grp_cd")
						))
						.addSelect(m -> toArray(
							m.lg_grp_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("ship_fr_lg_grp_nm", m.lg_grp_nm());
					})
				)
			);
	}
	/**
	 * -- MSBEL1730_MST_SHIP_ACT_D_Query_S02
	 */
	static MCQueryPlan MSBEL1730_MST_SHIP_ACT_D_S02() {
		MST_SHIP_ACT_D_R S0_SHIPACTD = MST_SHIP_ACT_D_R.create("SHIPACTD");
		MST_SHIP_ACT_R S0_SHIPACT = MST_SHIP_ACT_R.create("SHIPACT");
		MST_SHIP_ALLOC_STS_R S0_SHIPALLOCSTS = MST_SHIP_ALLOC_STS_R.create("SHIPALLOCSTS");
		MST_SHIP_INST_D_R S0_SHIPINSTD = MST_SHIP_INST_D_R.create("SHIPINSTD");
		MST_SHIP_INST_R S0_SHIPINST = MST_SHIP_INST_R.create("SHIPINST");
		MST_SHIP_SCHD_R S0_SHIPSCHD = MST_SHIP_SCHD_R.create("SHIPSCHD");
		MST_SHIP_PR_R S0_SHIPPR = MST_SHIP_PR_R.create("SHIPPR");
		MST_SLO_D_R S0_SLOD = MST_SLO_D_R.create("SLOD");
		MST_SLO_R S0_SLO = MST_SLO_R.create("SLO");
		MST_PROV_SCHD_R S0_PROVSCHD = MST_PROV_SCHD_R.create("PROVSCHD");
		MST_XFR_SCHD_R S0_XFRSCHD = MST_XFR_SCHD_R.create("XFRSCHD");
		MST_SLS_SCHD_R S0_SLSSCHD = MST_SLS_SCHD_R.create("SLSSCHD");
		MAM_ITM_R S0_ITM = MAM_ITM_R.create("ITM");
		MAM_CNTRY_R S0_CNTRY = MAM_CNTRY_R.create("CNTRY");
		MAM_TAX_R S0_TAX = MAM_TAX_R.create("TAX");
		MAM_DPT_R S0_BDDPT = MAM_DPT_R.create("BDDPT");
		MAM_DPT_R S0_SLSDPT = MAM_DPT_R.create("SLSDPT");
		MAM_DPT_R S0_ARDPT = MAM_DPT_R.create("ARDPT");
		MAM_BP_R S0_CST = MAM_BP_R.create("CST");
		MAM_CUR_R S0_CUR = MAM_CUR_R.create("CUR");
		MAM_SUNDRY_ITM_R S0_SUNDRYITM = MAM_SUNDRY_ITM_R.create("SUNDRYITM");
		MAM_LOC_R S0_LOC = MAM_LOC_R.create("LOC");
		MAM_BP_R S0_DLV = MAM_BP_R.create("DLV");
		MAM_ITM_LCL_R S0_ITMLCL = MAM_ITM_LCL_R.create("ITMLCL");
		MAM_BP_R S0_SPPL = MAM_BP_R.create("SPPL");
		MAVM_ITM_UNIT_R S0_ITMUNIT = MAVM_ITM_UNIT_R.create("ITMUNIT");
		MAM_ITM_LG_GRP_R S0_ITMLGGRP = MAM_ITM_LG_GRP_R.create("ITMLGGRP");
		MAM_LOC_R S0_GILOC = MAM_LOC_R.create("GILOC");
		MCTempView S0_VIVSHIPINSTMAP = createTempView("VIVSHIPACTMAP");
		MST_IV_SHIP_ACT_MAP_R S1_IVSHIPACTMAP = MST_IV_SHIP_ACT_MAP_R.create("IVSHIPACTMAP");
		MAVM_RD_WG_R S2_WGDAC = MAVM_RD_WG_R.create("WGDAC");
		MAVM_RD_LOC_R S3_LOCDAC = MAVM_RD_LOC_R.create("LOCDAC");
		MST_SLS_SCHD_R S4_XSLSSCHD = MST_SLS_SCHD_R.create("XSLSSCHD");
		MST_PURC_SCHD_R S4_PURCSCHD = MST_PURC_SCHD_R.create("PURCSCHD");
		MST_ARR_PR_R S4_ARRPR = MST_ARR_PR_R.create("ARRPR");
		MST_PO_D_R S4_POD = MST_PO_D_R.create("POD");
		MST_PO_R S4_PO = MST_PO_R.create("PO");
		MAM_BP_R S4_XSPPL = MAM_BP_R.create("XSPPL");
		MSW_SHIP_ACT_D_KEY_R S5_SHIPACTDWK = MSW_SHIP_ACT_D_KEY_R.create("SHIPACTDWK");
		MST_DLV_SLIP_R S6_DLVSLIP = MST_DLV_SLIP_R.create("DLVSLIP");
		MCTempView S6_VDLVSLIP = createTempView("VDLVSLIP");
		
		return createQueryPlan()
			.setQuery(
				sql("MSBEL1730_MST_SHIP_ACT_D_Query_S02")
					.mainQuery()
					.select(
						value(true).as("existed_flg"),
						S0_SHIPACT.ship_act_no,
						S0_SHIPACT.uplnd_flg,
						S0_SHIPACTD.ship_act_d_no,
						S0_SHIPACTD.dlv_slip_d_no,
						S0_SHIPALLOCSTS.ship_alloc_sts_no,
						S0_SHIPINST.ship_inst_no,
						S0_SHIPINSTD.ship_inst_d_no,
						S0_SHIPSCHD.ship_schd_no,
						S0_SHIPSCHD.re_ship_schd_flg,
						S0_SHIPACTD.itm_cd,
						S0_SHIPACTD.itm_sub1,
						S0_SHIPACTD.itm_sub2,
						S0_SHIPACTD.itm_sub3,
						cases()
							.when(S0_SHIPACTD.sundry_itm_flg.eq(value(true)))
								.then(
									nvl(
										S0_SHIPACTD.itm_nm,
										S0_SUNDRYITM.itm_nm
									)
							)
							.otherwise(S0_ITM.itm_nm).as("itm_nm"),
						S0_SHIPACTD.sundry_itm_flg,
						S0_ITM.sls_upri_cng_flg,
						S0_ITM.stk_mng_typ,
						S0_ITM.asset_mng_typ,
						S0_ITM.sno1_mng_typ,
						S0_ITM.sno2_mng_typ,
						S0_ITM.sno3_mng_typ,
						S0_ITM.sno4_mng_typ,
						S0_ITM.dscnt_itm_flg,
						S0_ITM.exim_xpns_typ,
						cases()
							.when(S0_SHIPACTD.sundry_itm_flg.eq(value(true)))
								.then(
									nvl(
										S0_SHIPACTD.iv_itm_nm,
										S0_SUNDRYITM.itm_nm
									)
							)
							.otherwise(
								nvl(
									S0_ITMLCL.itm_nm,
									S0_ITM.itm_nm
								)
							).as("iv_itm_nm"),
						coalesce(
							S0_SLOD.cntry_org_cd,
							S0_ITM.cntry_org_cd
						).as("cntry_org_cd"),
						S0_CNTRY.cntry_nm.as("cntry_org_nm"),
						decode(
							S0_SLOD.trd_unit_cd,
							nullValue(),
							S0_SHIPACTD.trd_unit_cd,
							S0_SLOD.trd_unit_cd
						).as("trd_unit_cd"),
						nullValue().as("trd_unit_qty"),
						S0_SHIPACTD.base_unit_cd,
						S0_ITM.dec_place.as("base_unit_dec_place"),
						S0_ITM.rnd_typ.as("base_unit_rnd_typ"),
						bracket(
							S0_SHIPACTD.base_unit_qty.subtract(nvl(S0_VIVSHIPINSTMAP.pr("iv_qty"), value(0))).subtract(S0_SHIPACTD.ship_ret_qty)
						).as("base_unit_qty"),
						bracket(
							S0_SHIPACTD.base_unit_qty.subtract(nvl(S0_VIVSHIPINSTMAP.pr("iv_qty"), value(0))).subtract(S0_SHIPACTD.ship_ret_qty)
						).as("max_base_unit_qty"),
						S0_SHIPACTD.gd_cd,
						S0_SHIPACTD.trd_cd,
						decode(
							S0_SHIPACTD.trd_ptn_typ,
							value(MAC_TRD_PTN_TYP.SLS.value()),
							S0_SLOD.trd_cur_upri,
							value(MAC_TRD_PTN_TYP.PROV.value()),
							S0_PROVSCHD.trd_cur_upri,
							value(0)
						).as("trd_cur_upri"),
						S0_SLOD.upri_not_tgt_flg,
						S0_SLOD.interim_flg,
						S0_SLOD.sls_cststk_flg,
						S0_SLOD.base_unit_qty.as("schd_base_unit_qty"),
						S0_SLOD.trd_cur_dscnt_amt.as("schd_trd_cur_dscnt_amt"),
						S0_SLOD.iv_upri,
						decode(
							S0_SHIPACTD.trd_ptn_typ,
							value(MAC_TRD_PTN_TYP.SLS.value()),
							S0_SLOD.tax_cd,
							value(MAC_TRD_PTN_TYP.PROV.value()),
							S0_PROVSCHD.tax_cd,
							nullValue()
						).as("tax_cd"),
						decode(
							S0_SHIPACTD.trd_ptn_typ,
							value(MAC_TRD_PTN_TYP.SLS.value()),
							S0_SLOD.tax_fix_flg,
							value(MAC_TRD_PTN_TYP.PROV.value()),
							S0_PROVSCHD.tax_fix_flg,
							nullValue()
						).as("tax_fix_flg"),
						S0_TAX.tax_nm,
						S0_TAX.inc_tax_flg,
						S0_TAX.tax_rate,
						S0_SLOD.dest_cd1,
						S0_SLOD.dest_cd2,
						S0_SLOD.dest_cd3,
						S0_SHIPACTD.cst_po_no, 
						S0_SHIPACTD.cst_po_d_no, 
						S0_SHIPACT.ship_fr_lg_grp_cd,
						S0_SHIPACTD.cst_itm_cd, 
						S0_SHIPACTD.cst_itm_nm, 
						decode(S0_SHIPACT.uplnd_flg, 
							value(true),
							S0_SHIPACTD.rsn_cd, 
							S0_SHIPPR.rsn_cd
						).as("rsn_cd"),
						S0_SHIPACTD.sno1,
						S0_SHIPACTD.sno2,
						S0_SHIPACTD.sno3,
						S0_SHIPACTD.sno4,
						decode(S0_SHIPACT.uplnd_flg, 
							value(true),
							S0_SHIPACTD.bd_dpt_cd, 
							S0_SHIPPR.bd_dpt_cd
						).as("bd_dpt_cd"),
						S0_BDDPT.dpt_nm.as("bd_dpt_nm"),
						nvl(S0_SLO.sls_usr_cd, 
								decode(
									S0_SHIPACTD.trd_ptn_typ,
									value(MAC_TRD_PTN_TYP.SLS.value()),
									S0_SHIPACT.rqst_usr_cd,
									value(MAC_TRD_PTN_TYP.SHIP.value()),
									S0_SHIPACT.rqst_usr_cd,
									nullValue())
							).as("sls_usr_cd"),
							nvl(S0_SLO.sls_dpt_cd, 
									decode(
										S0_SHIPACTD.trd_ptn_typ,
										value(MAC_TRD_PTN_TYP.SLS.value()),
										S0_SHIPACT.rqst_dpt_cd,
										value(MAC_TRD_PTN_TYP.SHIP.value()),
										S0_SHIPACT.rqst_dpt_cd,
										nullValue())
							).as("sls_dpt_cd"),
						S0_SLSDPT.dpt_nm.as("sls_dpt_nm"),
						S0_SLSDPT.wg_cd.as("sls_dpt_wg_cd"),
						S0_SLO.ar_dpt_cd,
						S0_ARDPT.dpt_nm.as("ar_dpt_nm"),
						S0_SLOD.dscnt_rsn_cd,
						S0_SHIPACTD.trd_rmrks,
						S0_SHIPACTD.trd_d_rmrks,
						S0_SLO.slo_no,
						cases()
							.when(S0_SHIPACTD.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.SLS.value())))
								.then(S0_SHIPPR.slo_d_no)
							.when(S0_SHIPACTD.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.SHIP.value())))
								.then(S0_SHIPPR.slo_d_no)
							.otherwise(S0_SHIPPR.xfr_schd_no).as("ship_rqst_no"),
						S0_SHIPPR.slo_d_no,
						S0_SHIPPR.xfr_schd_no,
						trunc(
							nvl(
									nvl(
										S0_SHIPSCHD.pd_inst_dlv_tm,
										S0_SHIPPR.dlv_rqst_tm
									),
									nvl(
										S0_SLOD.dlv_rqst_tm,
										S0_XFRSCHD.gr_rqst_tm
									)
								),
							MCDateFmt.DD
						).as("dlv_rqst_dt"),
						nvl(
								nvl(
									S0_SHIPSCHD.pd_inst_dlv_tm,
									S0_SHIPPR.dlv_rqst_tm
								),
								nvl(
									S0_SLOD.dlv_rqst_tm,
									S0_XFRSCHD.gr_rqst_tm
								)
							).as("dlv_rqst_hm"),
						trunc(
								S0_SHIPINST.ship_inst_tm,
								MCDateFmt.DD
							).as("ship_inst_dt"),
						S0_SHIPINST.ship_inst_tm.as("ship_inst_hm"),
						trunc(
								S0_SHIPACT.ship_tm,
								MCDateFmt.DD
							).as("ship_dt"),
						S0_SHIPACT.ship_tm.as("ship_hm"),
						trunc(
								S0_SHIPACT.dlv_tm,
								MCDateFmt.DD
							).as("dlv_dt"),
						S0_SHIPACT.dlv_tm.as("dlv_hm"),
						coalesce(
							S0_SLO.trd_cur_cd,
							S0_PROVSCHD.trd_cur_cd,
							S0_XFRSCHD.trd_cur_cd
						).as("trd_cur_cd"),
						S0_CUR.cur_nm.as("trd_cur_nm"),
						S0_CUR.upri_dec_place.as("trd_cur_upri_dec_place"),
						S0_CUR.amt_dec_place.as("trd_cur_amt_dec_place"),
						decode(
							S0_SHIPACTD.trd_ptn_typ,
							value(MAC_TRD_PTN_TYP.SLS.value()),
							S0_SLOD.trd_unit_cd,
							value(MAC_TRD_PTN_TYP.SHIP.value()),
							S0_SLOD.trd_unit_cd,
							value(MAC_TRD_PTN_TYP.PROV.value()),
							S0_XFRSCHD.trd_unit_cd,
							nullValue()
						).as("schd_trd_unit_cd"),
						decode(
							S0_SHIPACTD.trd_ptn_typ,
							value(MAC_TRD_PTN_TYP.SLS.value()),
							S0_SLOD.trd_unit_qty,
							value(MAC_TRD_PTN_TYP.SHIP.value()),
							S0_SLOD.trd_unit_qty,
							value(MAC_TRD_PTN_TYP.PROV.value()),
							S0_XFRSCHD.trd_unit_qty,
							nullValue()
						).as("schd_trd_unit_qty"),
						S0_ITMUNIT.dec_place.as("schd_trd_unit_dec_place"),
						S0_ITMUNIT.conv_base_qty.as("schd_trd_unit_conv_base_qty"),
						S0_ITMUNIT.conv_qty.as("schd_trd_unit_conv_qty"),
						S0_ITMUNIT.rnd_typ.as("schd_trd_unit_rnd_typ"),
						decode(
							S0_SHIPACTD.trd_ptn_typ,
							value(MAC_TRD_PTN_TYP.SLS.value()),
							S0_SLOD.base_unit_qty,
							value(MAC_TRD_PTN_TYP.SHIP.value()),
							S0_SLOD.base_unit_qty,
							value(MAC_TRD_PTN_TYP.PROV.value()),
							S0_XFRSCHD.base_unit_qty,
							nullValue()
						).as("schd_base_unit_qty"),
						S0_SLOD.trd_cur_dscnt_amt.as("schd_trd_cur_dscnt_amt"),
						S0_SLOD.iv_amt.as("schd_iv_amt"),
						decode(
							S0_SHIPACTD.trd_ptn_typ,
							value(MAC_TRD_PTN_TYP.SLS.value()),
							S0_SLOD.trd_cur_upri,
							value(MAC_TRD_PTN_TYP.PROV.value()),
							S0_PROVSCHD.trd_cur_upri,
							nullValue()
						).as("schd_trd_cur_upri"),
						decode(
							S0_SHIPACTD.trd_ptn_typ,
							value(MAC_TRD_PTN_TYP.SLS.value()),
							S0_SLOD.trd_cur_amt,
							value(MAC_TRD_PTN_TYP.PROV.value()),
							S0_PROVSCHD.trd_cur_amt,
							nullValue()
						).as("schd_trd_cur_amt"),
						decode(
							S0_SHIPACTD.trd_ptn_typ,
							value(MAC_TRD_PTN_TYP.SLS.value()),
							S0_SLOD.trd_cur_tax_amt,
							value(MAC_TRD_PTN_TYP.PROV.value()),
							S0_PROVSCHD.trd_cur_tax_amt,
							nullValue()
						).as("schd_trd_cur_tax_amt"),
						S0_SLOD.wtax_rate,
						S0_SLOD.wtax_amt.as("schd_wtax_amt"),
						S0_SHIPPR.trd_ptn_typ,
						S0_XFRSCHD.prov_basis_typ,
						nvl(
							decode(
								S0_SHIPACTD.trd_ptn_typ,
								value(MAC_TRD_PTN_TYP.SLS.value()),
								S0_CST.sls_amt_rnd_typ,
								value(MAC_TRD_PTN_TYP.PROV.value()),
								S0_SPPL.prov_amt_rnd_typ,
								value(MAC_RND_TYP.RNDOFF.value())
							),
							value(MAC_RND_TYP.RNDOFF.value())
						).as("trd_amt_rnd_typ"),
						nvl(
							decode(
								S0_SHIPACTD.trd_ptn_typ,
								value(MAC_TRD_PTN_TYP.SLS.value()),
								S0_CST.sls_tax_rnd_typ,
								value(MAC_TRD_PTN_TYP.PROV.value()),
								S0_SPPL.prov_tax_rnd_typ,
								value(MAC_RND_TYP.RNDOFF.value())
							),
							value(MAC_RND_TYP.RNDOFF.value())
						).as("trd_tax_rnd_typ"),
						S0_SHIPPR.purc_ddlv_flg,
						S0_SHIPPR.ship_pr_no,
						S0_SHIPPR.ship_inst_typ,
						S0_SHIPPR.upd_cntr.as("ship_pr_upd_cntr"),
						S0_SLO.trnspt_cd,
						S0_SLO.vssl_flght,
						S0_SLO.load_port_cd,
						S0_SLO.etd_dt,
						S0_SLO.dschrg_port_cd,
						S0_SLO.eta_dt,
						S0_SLO.via_port_cd,
						S0_SLO.via_schd_dt,
						S0_SLO.tterm_cd1,
						S0_SLO.tterm_rmrks1,
						S0_SLO.tterm_cd2,
						S0_SLO.tterm_rmrks2,
						S0_SLO.tterm_cd3,
						S0_SLO.tterm_rmrks3,
						decode(
							S0_SHIPACTD.trd_ptn_typ,
							value(MAC_TRD_PTN_TYP.SLS.value()),
							S0_SLO.xrate,
							value(MAC_TRD_PTN_TYP.PROV.value()),
							S0_PROVSCHD.xrate,
							value(MAC_TRD_PTN_TYP.XFR.value()),
							S0_XFRSCHD.xrate,
							value(MAC_TRD_PTN_TYP.XFR_RTN.value()),
							S0_XFRSCHD.xrate,
							nullValue()
						).as("xrate"),
						decode(
							S0_SHIPACTD.trd_ptn_typ,
							value(MAC_TRD_PTN_TYP.SLS.value()),
							S0_SLO.ptax_xrate,
							value(MAC_TRD_PTN_TYP.PROV.value()),
							S0_PROVSCHD.ptax_xrate,
							value(MAC_TRD_PTN_TYP.XFR.value()),
							S0_XFRSCHD.ptax_xrate,
							value(MAC_TRD_PTN_TYP.XFR_RTN.value()),
							S0_XFRSCHD.ptax_xrate,
							nullValue()
						).as("ptax_xrate"),
						S0_SLSSCHD.purc_schd_no,
						S0_SLSSCHD.purc_act_d_no,
						decode(S0_SHIPACT.uplnd_flg, 
							value(true),
							value(MSC_PR_STS_TYP.SHIP.value()), 
							S0_SHIPSCHD.pr_sts_typ
						).as("pr_sts_typ")
					)
					.from(
						S0_SHIPACTD
						.innerJoin(S0_SHIPACT).on(S0_SHIPACTD.ship_act_no.eq(S0_SHIPACT.ship_act_no))
						.leftOuterJoin(S0_SHIPALLOCSTS).on(S0_SHIPACTD.ship_alloc_sts_no.eq(S0_SHIPALLOCSTS.ship_alloc_sts_no))
						.leftOuterJoin(S0_SHIPINSTD).on(S0_SHIPALLOCSTS.ship_inst_d_no.eq(S0_SHIPINSTD.ship_inst_d_no))
						.leftOuterJoin(S0_SHIPINST).on(S0_SHIPINSTD.ship_inst_no.eq(S0_SHIPINST.ship_inst_no))
						.leftOuterJoin(S0_SHIPSCHD).on(S0_SHIPALLOCSTS.ship_schd_no.eq(S0_SHIPSCHD.ship_schd_no))
						.leftOuterJoin(S0_SHIPPR).on(S0_SHIPSCHD.ship_pr_no.eq(S0_SHIPPR.ship_pr_no))
						.leftOuterJoin(S0_SLOD).on(
							bracket(
								S0_SLOD.slo_d_no.eq(S0_SHIPPR.slo_d_no)
							)
						)
						.leftOuterJoin(S0_SLO).on(
							bracket(
								S0_SLO.slo_no.eq(S0_SLOD.slo_no)
							)
						)
						.leftOuterJoin(S0_PROVSCHD).on(
							bracket(
								S0_SHIPSCHD.ship_schd_no.eq(S0_PROVSCHD.prov_src_schd_no1)
								.and(MAC_TRD_PTN_TYP$IS_PROV(S0_PROVSCHD.trd_ptn_typ).eq(value(true)))
							)
						)
						.leftOuterJoin(S0_XFRSCHD).on(
							bracket(
								S0_SHIPPR.xfr_schd_no.eq(S0_XFRSCHD.xfr_schd_no)
							)
						)
						.leftOuterJoin(subQuery().select(
								S1_IVSHIPACTMAP.ship_act_d_no,
								sum(S1_IVSHIPACTMAP.base_unit_qty).as("iv_qty")
								).from(S1_IVSHIPACTMAP)
								.groupBy(S1_IVSHIPACTMAP.ship_act_d_no)
								.view(S0_VIVSHIPINSTMAP))
						.on(S0_SHIPACTD.ship_act_d_no.eq(S0_VIVSHIPINSTMAP.pr(S1_IVSHIPACTMAP.ship_act_d_no)))
						.leftOuterJoin(subQuery()
								.selectDistinct(
									S6_DLVSLIP.dlv_slip_act_no,
									S6_DLVSLIP.sls_basis_typ
								).from(S6_DLVSLIP)
								.where(S6_DLVSLIP.slip_sts_typ.eq(value(MAC_SLIP_STS_TYP.CRT.value())))
								.view(S6_VDLVSLIP)).on(S0_SHIPACT.uplnd_flg.eq(value(true)).and(S0_SHIPACT.ship_act_no.eq(S6_VDLVSLIP.pr(S6_DLVSLIP.dlv_slip_act_no))))
						.leftOuterJoin(S0_ITM).on(
							bracket(
								S0_SHIPACTD.itm_cd.eq(S0_ITM.itm_cd)
								.and(S0_SHIPACTD.itm_sub1.eq(S0_ITM.itm_sub1))
								.and(S0_SHIPACTD.itm_sub2.eq(S0_ITM.itm_sub2))
								.and(S0_SHIPACTD.itm_sub3.eq(S0_ITM.itm_sub3))
							)
						)
						.leftOuterJoin(S0_SLSSCHD).on(
							bracket(
								S0_SHIPSCHD.ship_schd_no.eq(S0_SLSSCHD.ship_schd_no)
							)
						)
						.leftOuterJoin(S0_CNTRY).on(
							bracket(
								coalesce(
									S0_SLOD.cntry_org_cd,
									S0_ITM.cntry_org_cd
								).eq(S0_CNTRY.cntry_cd)
							)
						)
						.leftOuterJoin(S0_TAX).on(
							bracket(
								decode(
									S0_SHIPPR.trd_ptn_typ,
									value(MAC_TRD_PTN_TYP.SLS.value()),
									S0_SLOD.tax_cd,
									value(MAC_TRD_PTN_TYP.PROV.value()),
									S0_PROVSCHD.tax_cd,
									nullValue()
								).eq(S0_TAX.tax_cd)
							)
						)
						.leftOuterJoin(S0_BDDPT).on(
							bracket(
								decode(S0_SHIPACT.uplnd_flg, 
									value(true),
									S0_SHIPACTD.bd_dpt_cd, 
									S0_SHIPPR.bd_dpt_cd
								).eq(S0_BDDPT.dpt_cd)
								.and(
									decode(S0_SHIPACT.uplnd_flg, 
										value(true),
										S0_SHIPACT.ac_dt, 
										coalesce(
											S0_SLO.slo_dt,
											S0_XFRSCHD.rcpt_dt
										)
									).between(S0_BDDPT.st_dt, S0_BDDPT.end_dt)
								)
							)
						)
						.leftOuterJoin(S0_SLSDPT).on(
							bracket(
								S0_SLO.sls_dpt_cd.eq(S0_SLSDPT.dpt_cd)
								.and(S0_SLO.slo_dt.between(S0_SLSDPT.st_dt, S0_SLSDPT.end_dt))
							)
							.or(
								bracket(
									S0_SHIPACT.rqst_dpt_cd.eq(S0_SLSDPT.dpt_cd)
									.and(S0_SHIPACT.ac_dt.between(S0_SLSDPT.st_dt, S0_SLSDPT.end_dt))
								)
							)
						)
						.leftOuterJoin(S0_ARDPT).on(
							bracket(
								S0_SLO.ar_dpt_cd.eq(S0_ARDPT.dpt_cd)
								.and(S0_SLO.slo_dt.between(S0_ARDPT.st_dt, S0_ARDPT.end_dt))
							)
						)
						.leftOuterJoin(S0_CST).on(
							bracket(
								nvl(S0_SHIPPR.cst_cd, S0_SHIPACT.cst_cd).eq(S0_CST.bp_cd)
							)
						)
						.leftOuterJoin(S0_CUR).on(
							bracket(
								coalesce(
									S0_SLO.trd_cur_cd,
									S0_PROVSCHD.trd_cur_cd,
									S0_XFRSCHD.trd_cur_cd
								).eq(S0_CUR.cur_cd)
							)
						)
						.leftOuterJoin(S0_SUNDRYITM).on(
							bracket(
								S0_SHIPACTD.itm_cd.eq(S0_SUNDRYITM.itm_cd)
								.and(S0_SHIPACTD.itm_sub1.eq(S0_SUNDRYITM.itm_sub1))
								.and(S0_SHIPACTD.itm_sub2.eq(S0_SUNDRYITM.itm_sub2))
								.and(S0_SHIPACTD.itm_sub3.eq(S0_SUNDRYITM.itm_sub3))
								.and(S0_SHIPACTD.sno1.eq(S0_SUNDRYITM.sno1))
								.and(S0_SHIPACTD.sno2.eq(S0_SUNDRYITM.sno2))
								.and(S0_SHIPACTD.sno3.eq(S0_SUNDRYITM.sno3))
								.and(S0_SHIPACTD.sno4.eq(S0_SUNDRYITM.sno4))
							)
						)
						.leftOuterJoin(S0_LOC).on(
							bracket(
								S0_SHIPACTD.dlv_id_cd.eq(S0_LOC.loc_cd)
							)
						)
						.leftOuterJoin(S0_DLV).on(
							bracket(
								S0_SHIPACTD.dlv_id_cd.eq(S0_DLV.bp_cd)
							)
						)
						.leftOuterJoin(S0_ITMLCL).on(
							bracket(
								S0_SHIPACTD.itm_cd.eq(S0_ITMLCL.itm_cd)
								.and(S0_SHIPACTD.itm_sub1.eq(S0_ITMLCL.itm_sub1))
								.and(S0_SHIPACTD.itm_sub2.eq(S0_ITMLCL.itm_sub2))
								.and(S0_SHIPACTD.itm_sub3.eq(S0_ITMLCL.itm_sub3))
								.and(
									bracket(
										S0_SHIPACTD.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.SLS.value()))
										.and(S0_DLV.prnt_lcl_cd.eq(S0_ITMLCL.lcl_cd))
									)
									.or(
										S0_SHIPACTD.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.SHIP.value()))
										.and(S0_DLV.prnt_lcl_cd.eq(S0_ITMLCL.lcl_cd))
									)
									.or(
										S0_SHIPACTD.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.PROV.value()))
										.and(S0_LOC.prnt_lcl_cd.eq(S0_ITMLCL.lcl_cd))
									)
									.or(
										S0_SHIPACTD.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.XFR.value()))
										.and(S0_LOC.prnt_lcl_cd.eq(S0_ITMLCL.lcl_cd))
									)
									.or(
										S0_SHIPACTD.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.XFR_RTN.value()))
										.and(S0_LOC.prnt_lcl_cd.eq(S0_ITMLCL.lcl_cd))
									)
								)
							)
						)
						.leftOuterJoin(S0_SPPL).on(
							bracket(
								S0_LOC.sppl_cd.eq(S0_SPPL.bp_cd)
							)
						)
						.leftOuterJoin(S0_ITMUNIT).on(
							bracket(
								S0_SHIPACTD.itm_cd.eq(S0_ITMUNIT.itm_cd)
								.and(S0_SHIPACTD.itm_sub1.eq(S0_ITMUNIT.itm_sub1))
								.and(S0_SHIPACTD.itm_sub2.eq(S0_ITMUNIT.itm_sub2))
								.and(S0_SHIPACTD.itm_sub3.eq(S0_ITMUNIT.itm_sub3))
								.and(
									decode(
										S0_SHIPACTD.trd_ptn_typ,
										value(MAC_TRD_PTN_TYP.SLS.value()),
										S0_SLOD.trd_unit_cd,
										value(MAC_TRD_PTN_TYP.SHIP.value()),
										S0_SLOD.trd_unit_cd,
										value(MAC_TRD_PTN_TYP.PROV.value()),
										S0_XFRSCHD.trd_unit_cd,
										nullValue()
									).eq(S0_ITMUNIT.unit_cd)
								)
							)
						)
						.leftOuterJoin(S0_ITMLGGRP).on(
							bracket(
								S0_XFRSCHD.itm_cd.eq(S0_ITMLGGRP.itm_cd)
								.and(S0_XFRSCHD.itm_sub1.eq(S0_ITMLGGRP.itm_sub1))
								.and(S0_XFRSCHD.itm_sub2.eq(S0_ITMLGGRP.itm_sub2))
								.and(S0_XFRSCHD.itm_sub3.eq(S0_ITMLGGRP.itm_sub3))
								.and(S0_XFRSCHD.gi_lg_grp_cd.eq(S0_ITMLGGRP.lg_grp_cd))
							)
						)
						.leftOuterJoin(S0_GILOC).on(
							bracket(
								S0_XFRSCHD.gi_lg_grp_cd.eq(S0_GILOC.lg_grp_cd)
								.and(S0_GILOC.lg_def_flg.eq(value(true)))
								.and(S0_GILOC.del_flg.eq(value(false)))
							)
						)
					)
					.where(
						value(0).eq(value(0))
						.and(S0_SHIPACT.can_flg.eq(value(false)))
						.and(S0_SHIPACTD.can_flg.eq(value(false)))
						.and(
							exists(
								subQuery()
								.select(value("X"))
								.from(S2_WGDAC)
								.where(
									S0_SLSDPT.wg_cd.eq(S2_WGDAC.wg_cd)
								)
							)
							.or(
								exists(
									subQuery()
									.select(value("X"))
									.from(S3_LOCDAC)
									.where(
										coalesce(
											S0_XFRSCHD.gi_loc_cd,
											S0_ITMLGGRP.lg_def_loc_cd,
											S0_GILOC.loc_cd
										).eq(S3_LOCDAC.loc_cd)
									)
								)
							)
						)
						.and(
							bracket(
								bracket(
									S0_SHIPPR.purc_ddlv_flg.eq(value(false))
									.or(S0_SHIPACT.uplnd_flg.eq(value(true)))
								)
								.and(bind("purc_ddlv_flg_str").eq(value(false)))
							)
							.or(
								S0_SHIPPR.purc_ddlv_flg.eq(value(true))
								.and(bind("purc_ddlv_flg_str").eq(value(true)))
								.and(
									exists(
										subQuery()
										.select(value("X"))
										.from(
											S4_XSLSSCHD
											.innerJoin(S4_PURCSCHD).on(
												bracket(
													S4_XSLSSCHD.purc_schd_no.eq(S4_PURCSCHD.purc_schd_no)
												)
											)
											.innerJoin(S4_ARRPR).on(
												bracket(
													S4_PURCSCHD.arr_pr_no.eq(S4_ARRPR.arr_pr_no)
												)
											)
											.innerJoin(S4_POD).on(
												bracket(
													S4_ARRPR.po_d_no.eq(S4_POD.po_d_no)
												)
											)
											.innerJoin(S4_PO).on(
												bracket(
													S4_POD.po_no.eq(S4_PO.po_no)
												)
											)
											.leftOuterJoin(S4_XSPPL).on(
												bracket(
													S4_PO.sppl_cd.eq(S4_XSPPL.bp_cd)
												)
											)
										)
										.where(
											value(0).eq(value(0))
											.and(S0_SHIPSCHD.ship_schd_no.eq(S4_XSLSSCHD.ship_schd_no))
											.and(S4_XSLSSCHD.cmpl_flg.eq(value(false)))
											.and(S4_XSLSSCHD.purc_schd_no.isNotNull())
											.and(S4_POD.rqst_can_flg.eq(value(false)))
											.and(S4_XSPPL.sppl_iv_flg.eq(value(false)))
										)
									)
								)
							)
						)
						.and(S0_SHIPACTD.base_unit_qty.subtract(nvl(S0_VIVSHIPINSTMAP.pr("iv_qty"), value(0))).subtract(S0_SHIPACTD.ship_ret_qty).gt(value(0)))
						.and(S0_SHIPACTD.trd_ptn_typ.eq(bind("trd_ptn_typ")))
						.and(
							bracket(
								bind("is_slo_iv_no_str").eq(value(false))
								.and(S0_SLO.iv_no.isNull())
							)
							.or(
								bind("is_slo_iv_no_str").eq(value(true))
								.and(S0_SLO.iv_no.eq(bind("iv_no")))
							)
						)
						.and(S0_SHIPACTD.dlv_id_typ.eq(bind("dlv_id_typ")))
						.and(
							bracket(
								nvl(S0_SHIPPR.cst_cd, S0_SHIPACT.cst_cd).eq(bind("ship_rqst_id_cd"))
								.and(
									bracket(
										S0_SHIPACTD.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.SLS.value()))
										.or(S0_SHIPACTD.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.SHIP.value())))
									)
								)
							)
							.or(
								S0_XFRSCHD.gr_loc_cd.eq(bind("ship_rqst_id_cd"))
								.and(
									S0_SHIPPR.trd_ptn_typ.in(
										value(MAC_TRD_PTN_TYP.XFR.value()),
										value(MAC_TRD_PTN_TYP.XFR_RTN.value())
									)
								)
							)
							.or(
								S0_LOC.sppl_cd.eq(bind("ship_rqst_id_cd"))
								.and(S0_SHIPPR.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.PROV.value())))
							)
						)
						.and(S0_SHIPACTD.dlv_id_cd.eq(bind("dlv_id_cd")))
						.and(
							bracket(
								S0_SHIPACTD.dlv_zip_cd.eq(bind("dlv_zip_cd"))
							)
							.or(
								S0_SHIPACTD.dlv_zip_cd.isNull()
								.and(bind("dlv_zip_cd").isNull())
							)
						)
						.and(
							bracket(
								S0_SHIPACTD.dlv_addr1.eq(bind("dlv_addr1"))
							)
							.or(
								S0_SHIPACTD.dlv_addr1.isNull()
								.and(bind("dlv_addr1").isNull())
							)
						)
						.and(
							bracket(
								S0_SHIPACTD.dlv_addr2.eq(bind("dlv_addr2"))
							)
							.or(
								S0_SHIPACTD.dlv_addr2.isNull()
								.and(bind("dlv_addr2").isNull())
							)
						)
						.and(
							bracket(
								S0_SHIPACTD.dlv_addr3.eq(bind("dlv_addr3"))
							)
							.or(
								S0_SHIPACTD.dlv_addr3.isNull()
								.and(bind("dlv_addr3").isNull())
							)
						)
						.and(
							bracket(
								S0_SHIPACTD.dlv_addr4.eq(bind("dlv_addr4"))
							)
							.or(
								S0_SHIPACTD.dlv_addr4.isNull()
								.and(bind("dlv_addr4").isNull())
							)
						)
						.and(
							bracket(
								S0_SHIPACTD.dlv_cntct_dpt.eq(bind("dlv_cntct_dpt"))
							)
							.or(
								S0_SHIPACTD.dlv_cntct_dpt.isNull()
								.and(bind("dlv_cntct_dpt").isNull())
							)
						)
						.and(
							bracket(
								S0_SHIPACTD.dlv_cntct_psn.eq(bind("dlv_cntct_psn"))
							)
							.or(
								S0_SHIPACTD.dlv_cntct_psn.isNull()
								.and(bind("dlv_cntct_psn").isNull())
							)
						)
						.and(
							bracket(
								S0_SHIPACTD.dlv_tel.eq(bind("dlv_tel"))
							)
							.or(
								S0_SHIPACTD.dlv_tel.isNull()
								.and(bind("dlv_tel").isNull())
							)
						)
						.and(
							bracket(
								S0_SHIPACTD.dlv_fax.eq(bind("dlv_fax"))
							)
							.or(
								S0_SHIPACTD.dlv_fax.isNull()
								.and(bind("dlv_fax").isNull())
							)
						)
						.and(
							S0_SHIPACTD.dlv_sundry_flg.eq(value(false))
							.or(
								S0_SHIPACTD.dlv_sundry_flg.eq(value(true))
								.and(
									bracket(
										S0_SHIPACTD.dlv_id_nm.eq(bind("dlv_id_nm"))
									)
									.or(
										S0_SHIPACTD.dlv_id_nm.isNull()
										.and(bind("dlv_id_nm").isNull())
									)
								)
							)
						)
						.and(S0_SHIPACT.via_dlv_typ.eq(bind("via_dlv_typ")))
						.and(
							bracket(
								MAC_VIA_DLV_TYP$IS_VIA(S0_SHIPACT.via_dlv_typ).eq(value(true))
								.and(
									decode(
										S0_SHIPACT.ship_to_id_typ,
										value(MSC_SHIP_TO_ID_TYP.TDLV.value()),
										S0_SHIPACT.ship_to_id_cd,
										nullValue()
									).eq(bind("tdlv_cd"))
								)
								.and(
									bracket(
										decode(
											S0_SHIPACT.ship_to_id_typ,
											value(MSC_SHIP_TO_ID_TYP.TDLV.value()),
											S0_SHIPACT.ship_to_zip_cd,
											nullValue()
										).eq(bind("tdlv_zip_cd"))
									)
									.or(
										decode(
											S0_SHIPACT.ship_to_id_typ,
											value(MSC_SHIP_TO_ID_TYP.TDLV.value()),
											S0_SHIPACT.ship_to_zip_cd,
											nullValue()
										).isNull()
										.and(bind("tdlv_zip_cd").isNull())
									)
								)
								.and(
									bracket(
										decode(
											S0_SHIPACT.ship_to_id_typ,
											value(MSC_SHIP_TO_ID_TYP.TDLV.value()),
											S0_SHIPACT.ship_to_addr1,
											nullValue()
										).eq(bind("tdlv_addr1"))
									)
									.or(
										decode(
											S0_SHIPACT.ship_to_id_typ,
											value(MSC_SHIP_TO_ID_TYP.TDLV.value()),
											S0_SHIPACT.ship_to_addr1,
											nullValue()
										).isNull()
										.and(bind("tdlv_addr1").isNull())
									)
								)
								.and(
									bracket(
										decode(
											S0_SHIPACT.ship_to_id_typ,
											value(MSC_SHIP_TO_ID_TYP.TDLV.value()),
											S0_SHIPACT.ship_to_addr2,
											nullValue()
										).eq(bind("tdlv_addr2"))
									)
									.or(
										decode(
											S0_SHIPACT.ship_to_id_typ,
											value(MSC_SHIP_TO_ID_TYP.TDLV.value()),
											S0_SHIPACT.ship_to_addr2,
											nullValue()
										).isNull()
										.and(bind("tdlv_addr2").isNull())
									)
								)
								.and(
									bracket(
										decode(
											S0_SHIPACT.ship_to_id_typ,
											value(MSC_SHIP_TO_ID_TYP.TDLV.value()),
											S0_SHIPACT.ship_to_addr3,
											nullValue()
										).eq(bind("tdlv_addr3"))
									)
									.or(
										decode(
											S0_SHIPACT.ship_to_id_typ,
											value(MSC_SHIP_TO_ID_TYP.TDLV.value()),
											S0_SHIPACT.ship_to_addr3,
											nullValue()
										).isNull()
										.and(bind("tdlv_addr3").isNull())
									)
								)
								.and(
									bracket(
										decode(
											S0_SHIPACT.ship_to_id_typ,
											value(MSC_SHIP_TO_ID_TYP.TDLV.value()),
											S0_SHIPACT.ship_to_addr4,
											nullValue()
										).eq(bind("tdlv_addr4"))
									)
									.or(
										decode(
											S0_SHIPACT.ship_to_id_typ,
											value(MSC_SHIP_TO_ID_TYP.TDLV.value()),
											S0_SHIPACT.ship_to_addr4,
											nullValue()
										).isNull()
										.and(bind("tdlv_addr4").isNull())
									)
								)
								.and(
									bracket(
										decode(
											S0_SHIPACT.ship_to_id_typ,
											value(MSC_SHIP_TO_ID_TYP.TDLV.value()),
											S0_SHIPACT.ship_to_cntct_dpt,
											nullValue()
										).eq(bind("tdlv_cntct_dpt"))
									)
									.or(
										decode(
											S0_SHIPACT.ship_to_id_typ,
											value(MSC_SHIP_TO_ID_TYP.TDLV.value()),
											S0_SHIPACT.ship_to_cntct_dpt,
											nullValue()
										).isNull()
										.and(bind("tdlv_cntct_dpt").isNull())
									)
								)
								.and(
									bracket(
										decode(
											S0_SHIPACT.ship_to_id_typ,
											value(MSC_SHIP_TO_ID_TYP.TDLV.value()),
											S0_SHIPACT.ship_to_cntct_psn,
											nullValue()
										).eq(bind("tdlv_cntct_psn"))
									)
									.or(
										decode(
											S0_SHIPACT.ship_to_id_typ,
											value(MSC_SHIP_TO_ID_TYP.TDLV.value()),
											S0_SHIPACT.ship_to_cntct_psn,
											nullValue()
										).isNull()
										.and(bind("tdlv_cntct_psn").isNull())
									)
								)
								.and(
									bracket(
										decode(
											S0_SHIPACT.ship_to_id_typ,
											value(MSC_SHIP_TO_ID_TYP.TDLV.value()),
											S0_SHIPACT.ship_to_tel,
											nullValue()
										).eq(bind("tdlv_tel"))
									)
									.or(
										decode(
											S0_SHIPACT.ship_to_id_typ,
											value(MSC_SHIP_TO_ID_TYP.TDLV.value()),
											S0_SHIPACT.ship_to_tel,
											nullValue()
										).isNull()
										.and(bind("tdlv_tel").isNull())
									)
								)
								.and(
									bracket(
										decode(
											S0_SHIPACT.ship_to_id_typ,
											value(MSC_SHIP_TO_ID_TYP.TDLV.value()),
											S0_SHIPACT.ship_to_fax,
											nullValue()
										).eq(bind("tdlv_fax"))
									)
									.or(
										decode(
											S0_SHIPACT.ship_to_id_typ,
											value(MSC_SHIP_TO_ID_TYP.TDLV.value()),
											S0_SHIPACT.ship_to_fax,
											nullValue()
										).isNull()
										.and(bind("tdlv_fax").isNull())
									)
								)
								.and(
									decode(
										S0_SHIPACT.ship_to_id_typ,
										value(MSC_SHIP_TO_ID_TYP.TDLV.value()),
										S0_SHIPACT.ship_to_sundry_flg,
										value(false)
									).eq(value(false))
									.or(
										decode(
											S0_SHIPACT.ship_to_id_typ,
											value(MSC_SHIP_TO_ID_TYP.TDLV.value()),
											S0_SHIPACT.ship_to_sundry_flg,
											value(false)
										).eq(value(true))
										.and(
											bracket(
												decode(
													S0_SHIPACT.ship_to_id_typ,
													value(MSC_SHIP_TO_ID_TYP.TDLV.value()),
													S0_SHIPACT.ship_to_id_nm,
													nullValue()
												).eq(bind("tdlv_nm"))
											)
											.or(
												decode(
													S0_SHIPACT.ship_to_id_typ,
													value(MSC_SHIP_TO_ID_TYP.TDLV.value()),
													S0_SHIPACT.ship_to_id_nm,
													nullValue()
												).isNull()
												.and(bind("tdlv_id_nm").isNull())
											)
										)
									)
								)
							)
							.or(
								MAC_VIA_DLV_TYP$IS_NOT_VIA(S0_SHIPACT.via_dlv_typ).eq(value(true))
							)
						)
						.and(
							bracket(
								decode(S0_SHIPACT.uplnd_flg,
									value(false),
									S0_SLO.sls_basis_typ,
									S6_VDLVSLIP.pr(S6_DLVSLIP.sls_basis_typ)
								).eq(bind("sls_basis_typ"))
							)
							.or(
								decode(S0_SHIPACT.uplnd_flg,
									value(false),
									S0_SLO.sls_basis_typ,
									S6_VDLVSLIP.pr(S6_DLVSLIP.sls_basis_typ)
								).isNull()
								.and(bind("sls_basis_typ").isNull())
							)
						)
						.and(
							bracket(
								S0_XFRSCHD.prov_basis_typ.eq(bind("prov_basis_typ"))
							)
							.or(
								S0_XFRSCHD.prov_basis_typ.isNull()
								.and(bind("prov_basis_typ").isNull())
							)
						)
						.and(
							bracket(
								S0_SHIPACTD.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.SLS.value()))
								.and(
									S0_SLO.trd_cur_cd.eq(bind("trd_cur_cd"))
									.or(
										S0_SLO.trd_cur_cd.isNull()
										.and(bind("trd_cur_cd").isNull())
									)
									.or(S0_SHIPACT.uplnd_flg.eq(value(true)))
								)
							)
							.or(
								S0_SHIPACTD.trd_ptn_typ.in(
									value(MAC_TRD_PTN_TYP.XFR.value()),
									value(MAC_TRD_PTN_TYP.XFR_RTN.value()),
									value(MAC_TRD_PTN_TYP.SHIP.value())
								)
							)
							.or(
								S0_SHIPACTD.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.PROV.value()))
								.and(
									bracket(
										bracket(
											S0_XFRSCHD.trd_cur_cd.eq(bind("trd_cur_cd"))
											.or(S0_XFRSCHD.trd_cur_cd.isNull())
										)
										.and(bind("trd_cur_cd").isNotNull())
									)
									.or(
										S0_XFRSCHD.trd_cur_cd.isNull()
										.and(bind("trd_cur_cd").isNull())
									)
								)
							)
						)
						.and(
							not(
								exists(
									subQuery()
									.select(value("X"))
									.from(S5_SHIPACTDWK)
									.where(
										S0_SHIPACTD.ship_act_d_no.eq(S5_SHIPACTDWK.ship_act_d_no)
									)
								)
							)
						)
					)
					.orderBy(
						S0_SHIPSCHD.ship_schd_no.asc(),
						S0_SHIPACT.ship_act_no.asc(),
						S0_SHIPACTD.ship_act_d_no.asc()
					)
			)
			.setJoinInfo(
				joinInfo(
					j -> j
						.add(MSVT_WRK_SNO_R.class, r -> toCondition(
							r.getStringNE("sno1")
						))
						.addSelect(m -> toArray(
							m.wrk_nm,
							m.wrk_no
						))
						.addMap((r, m) -> {
							r.setStringNE("wrk_no", m.wrk_no());
							r.setStringNE("wrk_nm", m.wrk_nm());
					}),
					j -> j
						.add(MAM_UNIT_R.class, r -> toCondition(
							r.getStringNE("trd_unit_cd")
						))
						.addSelect(m -> toArray(
							m.unit_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("trd_unit_nm", m.unit_nm());
					}),
					j -> j
						.add(MAM_UNIT_R.class, r -> toCondition(
							r.getStringNE("base_unit_cd")
						))
						.addSelect(m -> toArray(
							m.unit_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("base_unit_nm", m.unit_nm());
					}),
					j -> j
						.add(MAM_STK_GD_R.class, r -> toCondition(
							r.getStringNE("gd_cd")
						))
						.addSelect(m -> toArray(
							m.gd_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("gd_nm", m.gd_nm());
					}),
					j -> j
						.add(MAM_BIZ_RSN_R.class, r -> toCondition(
							r.getStringNE("rsn_cd")
						))
						.addSelect(m -> toArray(
							m.biz_rsn_nm,
							m.sls_acxfr_flg
						))
						.addMap((r, m) -> {
							r.setStringNE("rsn_nm", m.biz_rsn_nm());
							r.setBooleanNE("sls_acxfr_flg", m.sls_acxfr_flg());
					}),
					j -> j
						.add(MAM_USR_R.class, r -> toCondition(
							r.getStringNE("sls_usr_cd")
						))
						.addSelect(m -> toArray(
							m.usr_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("sls_usr_nm", m.usr_nm());
					}),
					j -> j
						.add(MAM_BIZ_RSN_R.class, r -> toCondition(
							r.getStringNE("dscnt_rsn_cd")
						))
						.addSelect(m -> toArray(
							m.biz_rsn_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("dscnt_rsn_nm", m.biz_rsn_nm());
					}),
					j -> j
						.add(MAVM_ITM_UNIT_R.class, r -> toCondition(
							r.getStringNE("itm_cd"),
							r.getStringNE("itm_sub1"),
							r.getStringNE("itm_sub2"),
							r.getStringNE("itm_sub3"),
							r.getStringNE("trd_unit_cd")
						))
						.addSelect(m -> toArray(
							m.conv_base_qty,
							m.conv_qty,
							m.dec_place,
							m.rnd_typ
						))
						.addMap((r, m) -> {
							r.setNumberNE("trd_unit_conv_base_qty", m.conv_base_qty());
							r.setNumberNE("trd_unit_conv_qty", m.conv_qty());
							r.setNumberNE("trd_unit_dec_place", m.dec_place());
							r.setStringNE("trd_unit_rnd_typ", m.rnd_typ());
					}),
					j -> j
						.add(MAM_TRNSPT_R.class, r -> toCondition(
							r.getStringNE("trnspt_cd")
						))
						.addSelect(m -> toArray(
							m.trnspt_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("trnspt_nm", m.trnspt_nm());
					}),
					j -> j
						.add(MAM_EXIM_PORT_R.class, r -> toCondition(
							r.getStringNE("load_port_cd")
						))
						.addSelect(m -> toArray(
							m.port_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("load_port_nm", m.port_nm());
					}),
					j -> j
						.add(MAM_EXIM_PORT_R.class, r -> toCondition(
							r.getStringNE("dschrg_port_cd")
						))
						.addSelect(m -> toArray(
							m.port_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("dschrg_port_nm", m.port_nm());
					}),
					j -> j
						.add(MAM_EXIM_PORT_R.class, r -> toCondition(
							r.getStringNE("via_port_cd")
						))
						.addSelect(m -> toArray(
							m.port_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("via_port_nm", m.port_nm());
					}),
					j -> j
						.add(MAM_TRD_R.class, r -> toCondition(
							r.getStringNE("trd_cd")
						))
						.addSelect(m -> toArray(
							m.trd_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("trd_nm", m.trd_nm());
					}),
					j -> j
						.add(MAM_TTERM_R.class, r -> toCondition(
							r.getStringNE("tterm_cd1")
						))
						.addSelect(m -> toArray(
							m.tterm_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("tterm_nm1", m.tterm_nm());
					}),
					j -> j
						.add(MAM_TTERM_R.class, r -> toCondition(
							r.getStringNE("tterm_cd2")
						))
						.addSelect(m -> toArray(
							m.tterm_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("tterm_nm2", m.tterm_nm());
					}),
					j -> j
						.add(MAM_TTERM_R.class, r -> toCondition(
							r.getStringNE("tterm_cd3")
						))
						.addSelect(m -> toArray(
							m.tterm_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("tterm_nm3", m.tterm_nm());
					}),
					j -> j
						.add(MAM_LG_GRP_R.class, r -> toCondition(
							r.getStringNE("ship_fr_lg_grp_cd")
						))
						.addSelect(m -> toArray(
							m.lg_grp_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("ship_fr_lg_grp_nm", m.lg_grp_nm());
					})
				)
			);
	}
	/**
	 * -- MSBEL1730_MST_SHIP_ACT_D_Query_S03
	 */
	static MCQueryPlan MSBEL1730_MST_SHIP_ACT_D_S03() {
		MST_SHIP_ACT_D_R S0_SHIPACTD = MST_SHIP_ACT_D_R.create("SHIPACTD");
		MST_SHIP_ACT_R S0_SHIPACT = MST_SHIP_ACT_R.create("SHIPACT");
		MST_SHIP_ALLOC_STS_R S0_SHIPALLOCSTS = MST_SHIP_ALLOC_STS_R.create("SHIPALLOCSTS");
		MST_SHIP_SCHD_R S0_SHIPSCHD = MST_SHIP_SCHD_R.create("SHIPSCHD");
		MST_SHIP_PR_R S0_SHIPPR = MST_SHIP_PR_R.create("SHIPPR");
		MST_SLO_D_R S0_SLOD = MST_SLO_D_R.create("SLOD");
		MST_SLO_R S0_SLO = MST_SLO_R.create("SLO");
		MAM_LOC_R S0_LOC = MAM_LOC_R.create("LOC");
		MAM_LOC_R S0_DIVIDLOC = MAM_LOC_R.create("DIVIDLOC");
		MSW_SHIP_ACT_D_KEY_R S0_SHIPACTDWK = MSW_SHIP_ACT_D_KEY_R.create("SHIPACTDWK");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBEL1730_MST_SHIP_ACT_D_Query_S03")
					.mainQuery()
					.select(
						S0_SHIPACTD.ship_act_d_no,
						S0_SHIPACT.ship_act_no,
						S0_SHIPACTD.trd_cd,
						S0_SHIPACTD.trd_ptn_typ,
						S0_SHIPACTD.itm_cd,
						S0_SHIPACTD.itm_sub1,
						S0_SHIPACTD.itm_sub2,
						S0_SHIPACTD.itm_sub3,
						S0_SHIPACTD.itm_nm,
						S0_SHIPACTD.stk_mng_typ,
						S0_SHIPACTD.sno1_mng_typ,
						S0_SHIPACTD.sno2_mng_typ,
						S0_SHIPACTD.sno3_mng_typ,
						S0_SHIPACTD.sno4_mng_typ,
						S0_SHIPACTD.sundry_itm_flg,
						S0_SHIPACTD.ship_loc_cd,
						S0_SHIPACTD.ship_str_ln_cd,
						S0_SHIPACTD.stk_arrv_bp_cd,
						S0_SHIPACTD.lot_no,
						S0_SHIPACTD.sublot_no,
						S0_SHIPACTD.sno1,
						S0_SHIPACTD.sno2,
						S0_SHIPACTD.sno3,
						S0_SHIPACTD.sno4,
						S0_SHIPACTD.gd_cd,
						S0_SHIPACTD.quality_typ,
						S0_SHIPACTD.stk_id_typ,
						S0_SHIPACTD.stk_bp_cd,
						S0_SHIPACTD.trd_unit_qty,
						S0_SHIPACTD.trd_unit_cd,
						S0_SHIPACTD.pack_unit_qty,
						S0_SHIPACTD.pack_unit_cd,
						S0_SHIPACTD.base_unit_qty,
						S0_SHIPACTD.base_unit_cd,
						S0_SHIPACTD.cst_itm_cd,
						S0_SHIPACTD.cst_itm_nm,
						S0_SHIPACTD.trd_rmrks,
						S0_SHIPACTD.trd_d_rmrks,
						S0_SHIPACTD.rsn_cd,
						S0_LOC.wg_cd.as("ship_loc_cd_wg_cd"),
						S0_DIVIDLOC.wg_cd.as("dlv_id_cd_wg_cd"),
						S0_SHIPACTD.dlv_id_cd,
						S0_SHIPACTD.dlv_str_ln_cd,
						S0_SHIPACTD.trd_ptn_typ,
						S0_SHIPACTD.dlv_slip_no,
						S0_SLO.slo_no,
						S0_SLO.cst_cd
					)
					.from(
						S0_SHIPACTD
						.innerJoin(S0_SHIPACTDWK).on(S0_SHIPACTD.ship_act_d_no.eq(S0_SHIPACTDWK.ship_act_d_no))
						.innerJoin(S0_SHIPACT).on(S0_SHIPACT.ship_act_no.eq(S0_SHIPACTD.ship_act_no))
						.leftOuterJoin(S0_SHIPALLOCSTS).on(S0_SHIPACTD.ship_alloc_sts_no.eq(S0_SHIPALLOCSTS.ship_alloc_sts_no))
						.leftOuterJoin(S0_SHIPSCHD).on(S0_SHIPALLOCSTS.ship_schd_no.eq(S0_SHIPSCHD.ship_schd_no))
						.leftOuterJoin(S0_SHIPPR).on(S0_SHIPSCHD.ship_pr_no.eq(S0_SHIPPR.ship_pr_no))
						.leftOuterJoin(S0_SLOD).on(S0_SLOD.slo_d_no.eq(S0_SHIPPR.slo_d_no))
						.leftOuterJoin(S0_SLO).on(S0_SLO.slo_no.eq(S0_SLOD.slo_no))
						.leftOuterJoin(S0_LOC).on(S0_SHIPACTD.ship_loc_cd.eq(S0_LOC.loc_cd))
						.leftOuterJoin(S0_DIVIDLOC).on(S0_SHIPPR.dlv_id_cd.eq(S0_DIVIDLOC.loc_cd))
					)
					.where(
						value(0).eq(value(0))
						.and(S0_SHIPACT.can_flg.eq(value(false)))
						.and(S0_SHIPACTD.can_flg.eq(value(false)))
					)
			);
	}
	/**
	 * -- MSBEL1730_MST_SHIP_INST_Query_S01
	 */
	static MCQueryPlan MSBEL1730_MST_SHIP_INST_S01() {
		MCTempView S0_VSHIPINST = createTempView("VSHIPINST");
		MAM_BP_R S0_SHIPRQST = MAM_BP_R.create("SHIPRQST");
		MAM_BP_R S1_CST = MAM_BP_R.create("CST");
		MAM_BP_R S2_ACST = MAM_BP_R.create("ACST");
		MAM_BP_R S3_BCST = MAM_BP_R.create("BCST");
		MST_SHIP_INST_D_R S4_SHIPINSTD = MST_SHIP_INST_D_R.create("SHIPINSTD");
		MST_SHIP_INST_R S4_SHIPINST = MST_SHIP_INST_R.create("SHIPINST");
		MST_SHIP_SCHD_R S4_SHIPSCHD = MST_SHIP_SCHD_R.create("SHIPSCHD");
		MST_SHIP_PR_R S4_SHIPPR = MST_SHIP_PR_R.create("SHIPPR");
		MST_SLO_D_R S4_SLOD = MST_SLO_D_R.create("SLOD");
		MST_SLO_R S4_SLO = MST_SLO_R.create("SLO");
		MST_PROV_SCHD_R S4_PROVSCHD = MST_PROV_SCHD_R.create("PROVSCHD");
		MST_XFR_SCHD_R S4_XFRSCHD = MST_XFR_SCHD_R.create("XFRSCHD");
		MAM_TRD_R S4_TRD = MAM_TRD_R.create("TRD");
		MAM_TRNSPT_R S4_TRNSPT = MAM_TRNSPT_R.create("TRNSPT");
		MAM_EXIM_PORT_R S4_LOADPORT = MAM_EXIM_PORT_R.create("LOADPORT");
		MAM_EXIM_PORT_R S4_DSCHRGPORT = MAM_EXIM_PORT_R.create("DSCHRGPORT");
		MAM_EXIM_PORT_R S4_VIAPORT = MAM_EXIM_PORT_R.create("VIAPORT");
		MAM_TTERM_R S4_TTERM1 = MAM_TTERM_R.create("TTERM1");
		MAM_TTERM_R S4_TTERM2 = MAM_TTERM_R.create("TTERM2");
		MAM_TTERM_R S4_TTERM3 = MAM_TTERM_R.create("TTERM3");
		MAM_CUR_R S4_SLOTRDCUR = MAM_CUR_R.create("SLOTRDCUR");
		MAM_LG_GRP_R S4_SHIPLGGRP = MAM_LG_GRP_R.create("SHIPLGGRP");
		MAM_BP_R S4_DLV = MAM_BP_R.create("DLV");
		MAM_LOC_R S4_LOC = MAM_LOC_R.create("LOC");
		MAM_CNTRY_R S4_DLVCNTRY = MAM_CNTRY_R.create("DLVCNTRY");
		MAM_CNTRY_R S4_LOCCNTRY = MAM_CNTRY_R.create("LOCCNTRY");
		MAM_BP_R S4_CST = MAM_BP_R.create("CST");
		MAM_BP_R S4_SPPL = MAM_BP_R.create("SPPL");
		MAM_DPT_R S4_DPT = MAM_DPT_R.create("DPT");
		MAM_CUR_R S4_PROVTRDCUR = MAM_CUR_R.create("PROVTRDCUR");
		MAM_CUR_R S4_XFRTRDCUR = MAM_CUR_R.create("XFRTRDCUR");
		MAM_LOC_R S4_GRLOC = MAM_LOC_R.create("GRLOC");
		MSVM_SHIP_TO_ID_R S4_SHIPTOID = MSVM_SHIP_TO_ID_R.create("SHIPTOID");
		MAM_ITM_LG_GRP_R S4_ITMLGGRP = MAM_ITM_LG_GRP_R.create("ITMLGGRP");
		MAM_LOC_R S4_GILOC = MAM_LOC_R.create("GILOC");
		MAM_LG_GRP_R S4_TDLVLGGRP = MAM_LG_GRP_R.create("TDLVLGGRP");
		MCTempView S4_VIVSHIPINSTMAP = createTempView("VIVSHIPINSTMAP");
		MST_IV_SHIP_INST_MAP_R S5_IVSHIPINSTMAP = MST_IV_SHIP_INST_MAP_R.create("IVSHIPINSTMAP");
		MAVM_RD_WG_R S6_RDWG = MAVM_RD_WG_R.create("RDWG");
		MAVM_RD_LOC_R S7_RDLOC = MAVM_RD_LOC_R.create("RDLOC");
		MST_SLS_SCHD_R S8_SLSSCHD = MST_SLS_SCHD_R.create("SLSSCHD");
		MST_PURC_SCHD_R S8_PURCSCHD = MST_PURC_SCHD_R.create("PURCSCHD");
		MST_ARR_PR_R S8_ARRPR = MST_ARR_PR_R.create("ARRPR");
		MST_PO_D_R S8_POD = MST_PO_D_R.create("POD");
		MST_PO_R S8_PO = MST_PO_R.create("PO");
		MAM_BP_R S8_SPPL = MAM_BP_R.create("SPPL");
		MAM_LG_CTL_R S9_LGCTL = MAM_LG_CTL_R.create("LGCTL");
		
		return createQueryPlan()
			.setQuery(
				sql("MSBEL1730_MST_SHIP_INST_Query_S01")
					.mainQuery()
					.select(
						S0_VSHIPINST.prAll(),
						bracket(
							subQuery()
							.select(S1_CST.bill_cl_typ)
							.from(S1_CST)
							.where(
								value(0).eq(value(0))
								.and(
									S1_CST.bp_cd.eq(subQuery()
										.select(S2_ACST.bcst_cd)
										.from(S2_ACST)
										.where(
											value(0).eq(value(0))
											.and(
												S2_ACST.bp_cd.eq(subQuery()
													.select(S3_BCST.acst_cd)
													.from(S3_BCST)
													.where(
														value(0).eq(value(0))
														.and(S3_BCST.bp_cd.eq(S0_VSHIPINST.pr("ship_rqst_id_cd")))
														.and(S3_BCST.cst_flg.eq(value(true)))
														.and(S3_BCST.acst_cd.isNotNull())
													)
												)
											)
											.and(S2_ACST.acst_flg.eq(value(true)))
											.and(S2_ACST.bcst_cd.isNotNull())
										)
									)
								)
							)
						).as("bill_cl_typ")
					)
					.from(
						subQuery()
						.select(
							S4_TRD.trd_ptn_typ,
							S4_SLO.iv_no.as("slo_iv_no"),
							nvl2(
									S4_SLO.iv_no,
									value(true),
									value(false)
								).as("is_slo_iv_no"),
							S4_SHIPPR.dlv_id_typ,
							nvl(
								S4_SHIPSCHD.dlv_cd,
								S4_SHIPPR.dlv_id_cd
							).as("dlv_id_cd"),
							nvl2(
								S4_SHIPSCHD.dlv_cd,
								nvl(
									S4_SHIPSCHD.dlv_nm,
									S4_DLV.bp_nm
								),
								cases()
									.when(S4_SHIPPR.dlv_sundry_flg.eq(value(false)))
										.then(
											cases()
												.when(S4_SHIPPR.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.SLS.value())))
													.then(S4_DLV.bp_nm)
												.when(S4_SHIPPR.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.SHIP.value())))
													.then(S4_DLV.bp_nm)
												.otherwise(S4_LOC.loc_nm)
									)
									.otherwise(S4_SHIPPR.dlv_id_nm)
							).as("dlv_id_nm"),
							nvl2(
								S4_SHIPSCHD.dlv_cd,
								S4_SHIPSCHD.dlv_sundry_flg,
								S4_SHIPPR.dlv_sundry_flg
							).as("dlv_sundry_flg"),
							nvl2(
								S4_SHIPSCHD.dlv_cd,
								S4_SHIPSCHD.dlv_zip_cd,
								S4_SHIPPR.dlv_zip_cd
							).as("dlv_zip_cd"),
							nvl2(
								S4_SHIPSCHD.dlv_cd,
								S4_SHIPSCHD.dlv_addr1,
								S4_SHIPPR.dlv_addr1
							).as("dlv_addr1"),
							nvl2(
								S4_SHIPSCHD.dlv_cd,
								S4_SHIPSCHD.dlv_addr2,
								S4_SHIPPR.dlv_addr2
							).as("dlv_addr2"),
							nvl2(
								S4_SHIPSCHD.dlv_cd,
								S4_SHIPSCHD.dlv_addr3,
								S4_SHIPPR.dlv_addr3
							).as("dlv_addr3"),
							nvl2(
								S4_SHIPSCHD.dlv_cd,
								S4_SHIPSCHD.dlv_addr4,
								S4_SHIPPR.dlv_addr4
							).as("dlv_addr4"),
							nvl2(
								S4_SHIPSCHD.dlv_cd,
								S4_SHIPSCHD.dlv_cntct_dpt,
								S4_SHIPPR.dlv_cntct_dpt
							).as("dlv_cntct_dpt"),
							nvl2(
								S4_SHIPSCHD.dlv_cd,
								S4_SHIPSCHD.dlv_cntct_psn,
								S4_SHIPPR.dlv_cntct_psn
							).as("dlv_cntct_psn"),
							nvl2(
								S4_SHIPSCHD.dlv_cd,
								S4_SHIPSCHD.dlv_tel,
								S4_SHIPPR.dlv_tel
							).as("dlv_tel"),
							nvl2(
								S4_SHIPSCHD.dlv_cd,
								S4_SHIPSCHD.dlv_fax,
								S4_SHIPPR.dlv_fax
							).as("dlv_fax"),
							cases()
								.when(S4_SHIPPR.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.SLS.value())))
									.then(S4_DLV.cntry_cd)
								.when(S4_SHIPPR.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.SHIP.value())))
									.then(S4_DLV.cntry_cd)
								.when(S4_SHIPPR.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.PROV.value())))
									.then(S4_LOC.cntry_cd)
								.when(S4_SHIPPR.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.XFR.value())))
									.then(S4_LOC.cntry_cd)
								.when(S4_SHIPPR.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.XFR_RTN.value())))
									.then(S4_LOC.cntry_cd)
								.otherwise(nullValue()).as("dlv_cntry_cd"),
							cases()
								.when(S4_SHIPPR.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.SLS.value())))
									.then(S4_DLVCNTRY.cntry_nm)
								.when(S4_SHIPPR.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.SHIP.value())))
									.then(S4_DLVCNTRY.cntry_nm)
								.when(S4_SHIPPR.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.PROV.value())))
									.then(S4_LOCCNTRY.cntry_nm)
								.when(S4_SHIPPR.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.XFR.value())))
									.then(S4_LOCCNTRY.cntry_nm)
								.when(S4_SHIPPR.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.XFR_RTN.value())))
									.then(S4_LOCCNTRY.cntry_nm)
								.otherwise(nullValue()).as("dlv_cntry_nm"),
							cases()
								.when(S4_SHIPPR.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.SLS.value())))
									.then(value(MSC_SHIP_RQST_ID_TYP.CST.value()))
								.when(S4_SHIPPR.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.SHIP.value())))
									.then(value(MSC_SHIP_RQST_ID_TYP.CST.value()))
								.when(S4_SHIPPR.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.PROV.value())))
									.then(value(MSC_SHIP_RQST_ID_TYP.SPPL.value()))
								.when(S4_SHIPPR.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.XFR.value())))
									.then(value(MSC_SHIP_RQST_ID_TYP.LOC.value()))
								.when(S4_SHIPPR.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.XFR_RTN.value())))
									.then(value(MSC_SHIP_RQST_ID_TYP.LOC.value()))
								.otherwise(nullValue()).as("ship_rqst_id_typ"),
							cases()
								.when(S4_SHIPPR.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.SLS.value())))
									.then(S4_SHIPPR.cst_cd)
								.when(S4_SHIPPR.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.SHIP.value())))
									.then(S4_SHIPPR.cst_cd)
								.when(S4_SHIPPR.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.PROV.value())))
									.then(S4_LOC.sppl_cd)
								.when(S4_SHIPPR.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.XFR.value())))
									.then(S4_XFRSCHD.gr_loc_cd)
								.when(S4_SHIPPR.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.XFR_RTN.value())))
									.then(S4_XFRSCHD.gr_loc_cd)
								.otherwise(nullValue()).as("ship_rqst_id_cd"),
							S4_CST.sls_upri_cng_flg,
							cases()
								.when(S4_SHIPPR.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.SLS.value())))
									.then(S4_CST.bp_nm)
								.when(S4_SHIPPR.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.SHIP.value())))
									.then(S4_CST.bp_nm)
								.when(S4_SHIPPR.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.PROV.value())))
									.then(S4_SPPL.bp_nm)
								.when(S4_SHIPPR.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.XFR.value())))
									.then(S4_GRLOC.loc_nm)
								.when(S4_SHIPPR.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.XFR_RTN.value())))
									.then(S4_GRLOC.loc_nm)
								.otherwise(nullValue()).as("ship_rqst_id_nm"),
								S4_SHIPINST.via_dlv_typ,
								nvl(
									S4_SHIPSCHD.tdlv_cd,
									decode(
										S4_SHIPPR.ship_to_id_typ,
										value(MSC_SHIP_TO_ID_TYP.TDLV.value()),
										S4_SHIPPR.ship_to_id_cd,
										nullValue()
									)
								).as("tdlv_cd"),
								nvl2(
									S4_SHIPSCHD.tdlv_cd,
									nvl(
										S4_SHIPSCHD.tdlv_nm,
										S4_SHIPTOID.ship_to_id_nm
									),
									cases()
										.when(S4_SHIPPR.ship_to_sundry_flg.eq(value(false)))
											.then(S4_SHIPTOID.ship_to_id_nm)
										.otherwise(
											decode(
												S4_SHIPPR.ship_to_id_typ,
												value(MSC_SHIP_TO_ID_TYP.TDLV.value()),
												S4_SHIPPR.ship_to_id_nm,
												nullValue()
											)
										)
								).as("tdlv_nm"),
								nvl2(
									S4_SHIPSCHD.tdlv_cd,
									S4_SHIPSCHD.tdlv_lg_grp_cd,
									decode(
										S4_SHIPPR.ship_to_id_typ,
										value(MSC_SHIP_TO_ID_TYP.TDLV.value()),
										S4_SHIPPR.ship_to_lg_grp_cd,
										nullValue()
									)
								).as("tdlv_lg_grp_cd"),
								S4_TDLVLGGRP.lg_grp_nm.as("tdlv_lg_grp_nm"),
								nvl2(
									S4_SHIPSCHD.tdlv_cd,
									S4_SHIPSCHD.tdlv_sundry_flg,
									decode(
										S4_SHIPPR.ship_to_id_typ,
										value(MSC_SHIP_TO_ID_TYP.TDLV.value()),
										S4_SHIPPR.ship_to_sundry_flg,
										value(false)
									)
								).as("tdlv_sundry_flg"),
								nvl2(
									S4_SHIPSCHD.tdlv_cd,
									S4_SHIPSCHD.tdlv_zip_cd,
									decode(
										S4_SHIPPR.ship_to_id_typ,
										value(MSC_SHIP_TO_ID_TYP.TDLV.value()),
										S4_SHIPPR.ship_to_zip_cd,
										nullValue()
									)
								).as("tdlv_zip_cd"),
								nvl2(
									S4_SHIPSCHD.tdlv_cd,
									S4_SHIPSCHD.tdlv_addr1,
									decode(
										S4_SHIPPR.ship_to_id_typ,
										value(MSC_SHIP_TO_ID_TYP.TDLV.value()),
										S4_SHIPPR.ship_to_addr1,
										nullValue()
									)
								).as("tdlv_addr1"),
								nvl2(
									S4_SHIPSCHD.tdlv_cd,
									S4_SHIPSCHD.tdlv_addr2,
									decode(
										S4_SHIPPR.ship_to_id_typ,
										value(MSC_SHIP_TO_ID_TYP.TDLV.value()),
										S4_SHIPPR.ship_to_addr2,
										nullValue()
									)
								).as("tdlv_addr2"),
								nvl2(
									S4_SHIPSCHD.tdlv_cd,
									S4_SHIPSCHD.tdlv_addr3,
									decode(
										S4_SHIPPR.ship_to_id_typ,
										value(MSC_SHIP_TO_ID_TYP.TDLV.value()),
										S4_SHIPPR.ship_to_addr3,
										nullValue()
									)
								).as("tdlv_addr3"),
								nvl2(
									S4_SHIPSCHD.tdlv_cd,
									S4_SHIPSCHD.tdlv_addr4,
									decode(
										S4_SHIPPR.ship_to_id_typ,
										value(MSC_SHIP_TO_ID_TYP.TDLV.value()),
										S4_SHIPPR.ship_to_addr4,
										nullValue()
									)
								).as("tdlv_addr4"),
								nvl2(
									S4_SHIPSCHD.tdlv_cd,
									S4_SHIPSCHD.tdlv_tel,
									decode(
										S4_SHIPPR.ship_to_id_typ,
										value(MSC_SHIP_TO_ID_TYP.TDLV.value()),
										S4_SHIPPR.ship_to_tel,
										nullValue()
									)
								).as("tdlv_tel"),
								nvl2(
									S4_SHIPSCHD.tdlv_cd,
									S4_SHIPSCHD.tdlv_fax,
									decode(
										S4_SHIPPR.ship_to_id_typ,
										value(MSC_SHIP_TO_ID_TYP.TDLV.value()),
										S4_SHIPPR.ship_to_fax,
										nullValue()
									)
								).as("tdlv_fax"),
								nvl2(
									S4_SHIPSCHD.tdlv_cd,
									S4_SHIPSCHD.tdlv_cntct_dpt,
									decode(
										S4_SHIPPR.ship_to_id_typ,
										value(MSC_SHIP_TO_ID_TYP.TDLV.value()),
										S4_SHIPPR.ship_to_cntct_dpt,
										nullValue()
									)
								).as("tdlv_cntct_dpt"),
								nvl2(
									S4_SHIPSCHD.tdlv_cd,
									S4_SHIPSCHD.tdlv_cntct_psn,
									decode(
										S4_SHIPPR.ship_to_id_typ,
										value(MSC_SHIP_TO_ID_TYP.TDLV.value()),
										S4_SHIPPR.ship_to_cntct_psn,
										nullValue()
									)
								).as("tdlv_cntct_psn"),
								S4_SLO.trnspt_cd,
								S4_TRNSPT.trnspt_nm,
								S4_SLO.vssl_flght,
								S4_SLO.load_port_cd,
								S4_LOADPORT.port_nm.as("load_port_nm"),
								S4_SLO.etd_dt,
								S4_SLO.dschrg_port_cd,
								S4_DSCHRGPORT.port_nm.as("dschrg_port_nm"),
								S4_SLO.eta_dt,
								S4_SLO.via_port_cd,
								S4_VIAPORT.port_nm.as("via_port_nm"),
								S4_SLO.via_schd_dt,
								S4_SLO.sls_basis_typ,
								S4_XFRSCHD.prov_basis_typ,
								S4_SLO.tterm_cd1,
								S4_TTERM1.tterm_nm.as("tterm_nm1"),
								S4_SLO.tterm_rmrks1,
								S4_SLO.tterm_cd2,
								S4_TTERM2.tterm_nm.as("tterm_nm2"),
								S4_SLO.tterm_rmrks2,
								S4_SLO.tterm_cd3,
								S4_TTERM3.tterm_nm.as("tterm_nm3"),
								S4_SLO.tterm_rmrks3,
								cases()
								.when(S4_SHIPPR.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.SLS.value())))
									.then(S4_SLO.trd_cur_cd)
								.when(S4_SHIPPR.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.PROV.value())))
									.then(S4_PROVSCHD.trd_cur_cd)
								.when(S4_SHIPPR.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.XFR.value())))
									.then(S4_XFRSCHD.trd_cur_cd)
								.when(S4_SHIPPR.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.XFR_RTN.value())))
									.then(S4_XFRSCHD.trd_cur_cd)
								.otherwise(nullValue()).as("trd_cur_cd"),
							cases()
								.when(S4_SHIPPR.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.SLS.value())))
									.then(S4_SLOTRDCUR.cur_nm)
								.when(S4_SHIPPR.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.PROV.value())))
									.then(S4_PROVTRDCUR.cur_nm)
								.when(S4_SHIPPR.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.XFR.value())))
									.then(S4_XFRTRDCUR.cur_nm)
								.when(S4_SHIPPR.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.XFR_RTN.value())))
									.then(S4_XFRTRDCUR.cur_nm)
								.otherwise(nullValue()).as("trd_cur_nm"),
								cases()
								.when(S4_SHIPPR.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.SLS.value())))
									.then(S4_SLO.xrate_inpt_flg)
								.when(S4_SHIPPR.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.PROV.value())))
									.then(S4_PROVSCHD.xrate_inpt_flg)
								.when(S4_SHIPPR.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.XFR.value())))
									.then(S4_XFRSCHD.xrate_inpt_flg)
								.when(S4_SHIPPR.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.XFR_RTN.value())))
									.then(S4_XFRSCHD.xrate_inpt_flg)
								.otherwise(nullValue()).as("xrate_inpt_flg"),
							cases()
								.when(S4_SHIPPR.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.SLS.value())))
									.then(S4_SLO.xrate)
								.when(S4_SHIPPR.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.PROV.value())))
									.then(S4_PROVSCHD.xrate)
								.when(S4_SHIPPR.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.XFR.value())))
									.then(S4_XFRSCHD.xrate)
								.when(S4_SHIPPR.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.XFR_RTN.value())))
									.then(S4_XFRSCHD.xrate)
								.otherwise(nullValue()).as("xrate"),
							cases()
								.when(S4_SHIPPR.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.SLS.value())))
									.then(S4_SLO.ptax_xrate_inpt_flg)
								.when(S4_SHIPPR.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.PROV.value())))
									.then(S4_PROVSCHD.ptax_xrate_inpt_flg)
								.when(S4_SHIPPR.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.XFR.value())))
									.then(S4_XFRSCHD.ptax_xrate_inpt_flg)
								.when(S4_SHIPPR.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.XFR_RTN.value())))
									.then(S4_XFRSCHD.ptax_xrate_inpt_flg)
								.otherwise(nullValue()).as("ptax_xrate_inpt_flg"),
							cases()
								.when(S4_SHIPPR.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.SLS.value())))
									.then(S4_SLO.ptax_xrate)
								.when(S4_SHIPPR.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.PROV.value())))
									.then(S4_PROVSCHD.ptax_xrate)
								.when(S4_SHIPPR.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.XFR.value())))
									.then(S4_XFRSCHD.ptax_xrate)
								.when(S4_SHIPPR.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.XFR_RTN.value())))
									.then(S4_XFRSCHD.ptax_xrate)
								.otherwise(nullValue()).as("ptax_xrate"),
								coalesce(
										S4_SLOTRDCUR.amt_dec_place,
										S4_PROVTRDCUR.amt_dec_place,
										S4_XFRTRDCUR.amt_dec_place
									).as("trd_cur_amt_dec_place"),
									coalesce(
										S4_SLOTRDCUR.upri_dec_place,
										S4_PROVTRDCUR.upri_dec_place,
										S4_XFRTRDCUR.upri_dec_place
									).as("trd_cur_upri_dec_place"),
									nvl(
										decode(
											S4_SHIPPR.trd_ptn_typ,
											value(MAC_TRD_PTN_TYP.SLS.value()),
											S4_CST.sls_amt_rnd_typ,
											value(MAC_TRD_PTN_TYP.PROV.value()),
											S4_SPPL.prov_amt_rnd_typ,
											value(MAC_RND_TYP.RNDOFF.value())
										),
										value(MAC_RND_TYP.RNDOFF.value())
									).as("trd_amt_rnd_typ"),
									nvl(
										decode(
											S4_SHIPPR.trd_ptn_typ,
											value(MAC_TRD_PTN_TYP.SLS.value()),
											S4_CST.sls_tax_rnd_typ,
											value(MAC_TRD_PTN_TYP.PROV.value()),
											S4_SPPL.prov_tax_rnd_typ,
											value(MAC_RND_TYP.RNDOFF.value())
										),
										value(MAC_RND_TYP.RNDOFF.value())
									).as("trd_tax_rnd_typ"),
								S4_CST.ar_dpt_typ,
								MAPA_BP$F_GET_AR_DPT_CD_NE(
									S4_CST.bp_cd,
									bind("today"),
									value(false)
								).as("lnk_ar_dpt_cd"),
								cases()
								.when(S4_SHIPPR.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.SLS.value())))
									.then(S4_DLV.prnt_lcl_cd)
								.when(S4_SHIPPR.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.SHIP.value())))
									.then(S4_DLV.prnt_lcl_cd)
								.when(S4_SHIPPR.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.PROV.value())))
									.then(S4_LOC.prnt_lcl_cd)
								.when(S4_SHIPPR.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.XFR.value())))
									.then(S4_LOC.prnt_lcl_cd)
								.when(S4_SHIPPR.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.XFR_RTN.value())))
									.then(S4_LOC.prnt_lcl_cd)
								.otherwise(nullValue()).as("prnt_lcl_cd"),
							S4_SHIPINST.ship_inst_no,
							S4_SHIPINSTD.ship_inst_d_no,
							S4_SHIPINSTD.ship_lg_grp_cd.as("ship_fr_lg_grp_cd"),
							S4_LOC.lg_grp_cd.as("ship_to_lg_grp_cd")
						)
						.from(
							S4_SHIPINSTD
							.innerJoin(S4_SHIPINST).on(S4_SHIPINSTD.ship_inst_no.eq(S4_SHIPINST.ship_inst_no))
							.innerJoin(S4_SHIPSCHD).on(S4_SHIPINSTD.ship_inst_d_no.eq(S4_SHIPSCHD.ship_inst_d_no))
							.innerJoin(S4_SHIPPR).on(S4_SHIPSCHD.ship_pr_no.eq(S4_SHIPPR.ship_pr_no))
							.leftOuterJoin(S4_SLOD).on(S4_SHIPPR.slo_d_no.eq(S4_SLOD.slo_d_no))
							.leftOuterJoin(S4_SLO).on(S4_SLOD.slo_no.eq(S4_SLO.slo_no))
							.leftOuterJoin(S4_PROVSCHD).on(
								bracket(
									S4_SHIPSCHD.ship_schd_no.eq(S4_PROVSCHD.prov_src_schd_no1)
									.and(MAC_TRD_PTN_TYP$IS_PROV(S4_PROVSCHD.trd_ptn_typ).eq(value(true)))
								)
							)
							.leftOuterJoin(S4_XFRSCHD).on(
								bracket(
									S4_SHIPPR.xfr_schd_no.eq(S4_XFRSCHD.xfr_schd_no)
								)
							)
							.leftOuterJoin(subQuery().select(
									S5_IVSHIPINSTMAP.ship_inst_d_no,
									sum(S5_IVSHIPINSTMAP.base_unit_qty).as("iv_qty")
									).from(S5_IVSHIPINSTMAP)
									.groupBy(S5_IVSHIPINSTMAP.ship_inst_d_no)
									.view(S4_VIVSHIPINSTMAP))
							.on(S4_SHIPINSTD.ship_inst_d_no.eq(S4_VIVSHIPINSTMAP.pr(S5_IVSHIPINSTMAP.ship_inst_d_no)))
							.leftOuterJoin(S4_TRD).on(S4_SHIPPR.trd_cd.eq(S4_TRD.trd_cd))
							.leftOuterJoin(S4_TRNSPT).on(S4_SLO.trnspt_cd.eq(S4_TRNSPT.trnspt_cd))
							.leftOuterJoin(S4_LOADPORT).on(S4_SLO.load_port_cd.eq(S4_LOADPORT.port_cd))
							.leftOuterJoin(S4_DSCHRGPORT).on(S4_SLO.dschrg_port_cd.eq(S4_DSCHRGPORT.port_cd))
							.leftOuterJoin(S4_VIAPORT).on(S4_SLO.via_port_cd.eq(S4_VIAPORT.port_cd))
							.leftOuterJoin(S4_TTERM1).on(S4_SLO.tterm_cd1.eq(S4_TTERM1.tterm_cd))
							.leftOuterJoin(S4_TTERM2).on(S4_SLO.tterm_cd2.eq(S4_TTERM2.tterm_cd))
							.leftOuterJoin(S4_TTERM3).on(S4_SLO.tterm_cd3.eq(S4_TTERM3.tterm_cd))
							.leftOuterJoin(S4_SLOTRDCUR).on(S4_SLO.trd_cur_cd.eq(S4_SLOTRDCUR.cur_cd))
							.leftOuterJoin(S4_SHIPLGGRP).on(S4_SHIPINSTD.ship_lg_grp_cd.eq(S4_SHIPLGGRP.lg_grp_cd))
							.leftOuterJoin(S4_DLV).on(
								nvl(
									S4_SHIPSCHD.dlv_cd,
									S4_SHIPPR.dlv_id_cd
								).eq(S4_DLV.bp_cd)
							)
							.leftOuterJoin(S4_LOC).on(S4_SHIPPR.dlv_id_cd.eq(S4_LOC.loc_cd))
							.leftOuterJoin(S4_DLVCNTRY).on(S4_DLV.cntry_cd.eq(S4_DLVCNTRY.cntry_cd))
							.leftOuterJoin(S4_LOCCNTRY).on(S4_LOC.cntry_cd.eq(S4_LOCCNTRY.cntry_cd))
							.leftOuterJoin(S4_CST).on(S4_SHIPPR.cst_cd.eq(S4_CST.bp_cd))
							.leftOuterJoin(S4_SPPL).on(S4_LOC.sppl_cd.eq(S4_SPPL.bp_cd))
							.leftOuterJoin(S4_DPT).on(
								bracket(
									S4_SLO.sls_dpt_cd.eq(S4_DPT.dpt_cd)
									.and(S4_SLO.slo_dt.between(S4_DPT.st_dt, S4_DPT.end_dt))
								)
							)
							.leftOuterJoin(S4_PROVTRDCUR).on(S4_PROVSCHD.trd_cur_cd.eq(S4_PROVTRDCUR.cur_cd))
							.leftOuterJoin(S4_XFRTRDCUR).on(S4_XFRSCHD.trd_cur_cd.eq(S4_XFRTRDCUR.cur_cd))
							.leftOuterJoin(S4_GRLOC).on(S4_XFRSCHD.gr_loc_cd.eq(S4_GRLOC.loc_cd))
							.leftOuterJoin(S4_SHIPTOID).on(
								bracket(
									S4_SHIPPR.ship_to_id_typ.eq(S4_SHIPTOID.ship_to_id_typ)
									.and(
										nvl(
											S4_SHIPSCHD.tdlv_cd,
											S4_SHIPPR.ship_to_id_cd
										).eq(S4_SHIPTOID.ship_to_id_cd)
									)
									.and(S4_SHIPPR.ship_to_id_typ.eq(value(MSC_SHIP_TO_ID_TYP.TDLV.value())))
								)
							)
							.leftOuterJoin(S4_ITMLGGRP).on(
								bracket(
									S4_XFRSCHD.itm_cd.eq(S4_ITMLGGRP.itm_cd)
									.and(S4_XFRSCHD.itm_sub1.eq(S4_ITMLGGRP.itm_sub1))
									.and(S4_XFRSCHD.itm_sub2.eq(S4_ITMLGGRP.itm_sub2))
									.and(S4_XFRSCHD.itm_sub3.eq(S4_ITMLGGRP.itm_sub3))
									.and(S4_XFRSCHD.gi_lg_grp_cd.eq(S4_ITMLGGRP.lg_grp_cd))
								)
							)
							.leftOuterJoin(S4_GILOC).on(
								bracket(
									S4_XFRSCHD.gi_lg_grp_cd.eq(S4_GILOC.lg_grp_cd)
									.and(S4_GILOC.lg_def_flg.eq(value(true)))
									.and(S4_GILOC.del_flg.eq(value(false)))
								)
							)
							.leftOuterJoin(S4_TDLVLGGRP).on(
								nvl2(
									S4_SHIPSCHD.tdlv_cd,
									S4_SHIPSCHD.tdlv_lg_grp_cd,
									decode(
										S4_SHIPPR.ship_to_id_typ,
										value(MSC_SHIP_TO_ID_TYP.TDLV.value()),
										S4_SHIPPR.ship_to_lg_grp_cd,
										nullValue()
									)
								).eq(S4_TDLVLGGRP.lg_grp_cd)
							)
						)
						.where(
							value(0).eq(value(0))
							.and(S4_SHIPINST.can_flg.eq(value(false)))
							.and(S4_SHIPINSTD.can_flg.eq(value(false)))
							.and(
								exists(
									subQuery()
									.select(value("X"))
									.from(S6_RDWG)
									.where(
										S4_DPT.wg_cd.eq(S6_RDWG.wg_cd)
									)
								)
								.or(
									exists(
										subQuery()
										.select(value("X"))
										.from(S7_RDLOC)
										.where(
											coalesce(
												S4_XFRSCHD.gi_loc_cd,
												S4_ITMLGGRP.lg_def_loc_cd,
												S4_GILOC.loc_cd
											).eq(S7_RDLOC.loc_cd)
										)
									)
								)
							)
							.and(
								S4_SHIPPR.purc_ddlv_flg.eq(value(false))
								.or(
									exists(
										subQuery()
										.select(value("X"))
										.from(
											S8_SLSSCHD
											.innerJoin(S8_PURCSCHD).on(
												bracket(
													S8_SLSSCHD.purc_schd_no.eq(S8_PURCSCHD.purc_schd_no)
												)
											)
											.innerJoin(S8_ARRPR).on(
												bracket(
													S8_PURCSCHD.arr_pr_no.eq(S8_ARRPR.arr_pr_no)
												)
											)
											.innerJoin(S8_POD).on(
												bracket(
													S8_ARRPR.po_d_no.eq(S8_POD.po_d_no)
												)
											)
											.innerJoin(S8_PO).on(
												bracket(
													S8_POD.po_no.eq(S8_PO.po_no)
												)
											)
											.leftOuterJoin(S8_SPPL).on(
												bracket(
													S8_PO.sppl_cd.eq(S8_SPPL.bp_cd)
												)
											)
										)
										.where(
											value(0).eq(value(0))
											.and(S4_SHIPSCHD.ship_schd_no.eq(S8_SLSSCHD.ship_schd_no))
											.and(S8_SLSSCHD.cmpl_flg.eq(value(false)))
											.and(S8_SLSSCHD.purc_schd_no.isNotNull())
											.and(S8_POD.rqst_can_flg.eq(value(false)))
											.and(S8_SPPL.sppl_iv_flg.eq(value(false)))
										)
									)
								)
							)
							.and(S4_SHIPINSTD.base_unit_qty.subtract(S4_SHIPINSTD.abort_qty).subtract(nvl(S4_VIVSHIPINSTMAP.pr("iv_qty"), value(0))).subtract(S4_SHIPSCHD.ship_ret_qty).gt(value(0)))
							.and(S4_SHIPINST.ship_inst_no.like(bind("srch_tgt_no")))
						).view(S0_VSHIPINST)
						.leftOuterJoin(S0_SHIPRQST).on(
								bracket(
									S0_VSHIPINST.pr("ship_rqst_id_cd").eq(S0_SHIPRQST.bp_cd)
									.and(S0_VSHIPINST.pr("ship_rqst_id_typ").neq(value(MSC_SHIP_RQST_ID_TYP.LOC.value())))
								)
							)
					)
					.where(
						value(0).eq(value(0))
						.and(
							bracket(
								bracket(
									value(MAC_TRD_PTN_TYP.SLS.value()).eq(S0_VSHIPINST.pr(S4_TRD.trd_ptn_typ))
									.or(value(MAC_TRD_PTN_TYP.SHIP.value()).eq(S0_VSHIPINST.pr(S4_TRD.trd_ptn_typ)))
								)
								.and(S0_SHIPRQST.cst_iv_flg.eq(value(true)))
							)
							.or(
								value(MAC_TRD_PTN_TYP.SLS.value()).neq(S0_VSHIPINST.pr(S4_TRD.trd_ptn_typ))
								.and(value(MAC_TRD_PTN_TYP.SHIP.value()).neq(S0_VSHIPINST.pr(S4_TRD.trd_ptn_typ)))
								.and(value(MAC_TRD_PTN_TYP.PROV_RTN.value()).neq(S0_VSHIPINST.pr(S4_TRD.trd_ptn_typ)))
								.and(
									exists(
										subQuery()
										.select(value("X"))
										.from(S9_LGCTL)
										.where(
											value(0).eq(value(0))
											.and(S0_VSHIPINST.pr("ship_fr_lg_grp_cd").eq(S9_LGCTL.fr_lg_grp_cd))
											.and(S0_VSHIPINST.pr("ship_to_lg_grp_cd").eq(S9_LGCTL.to_lg_grp_cd))
											.and(S9_LGCTL.iv_trd_flg.eq(value(true)))
										)
									)
								)
							)
						)
					)
			);
	}
	/**
	 * -- MSBEL1730_MST_SHIP_ACT_Query_S01
	 */
	static MCQueryPlan MSBEL1730_MST_SHIP_ACT_S01() {
		MCTempView S0_VSHIPACT = createTempView("VSHIPACT");
		MAM_BP_R S0_SHIPRQST = MAM_BP_R.create("SHIPRQST");
		MAM_BP_R S1_CST = MAM_BP_R.create("CST");
		MAM_BP_R S2_ACST = MAM_BP_R.create("ACST");
		MAM_BP_R S3_BCST = MAM_BP_R.create("BCST");
		MST_SHIP_ACT_D_R S4_SHIPACTD = MST_SHIP_ACT_D_R.create("ship_act_d_no");
		MST_SHIP_ACT_R S4_SHIPACT = MST_SHIP_ACT_R.create("SHIPACT");
		MST_SHIP_ALLOC_STS_R S4_SHIPALLOCSTS= MST_SHIP_ALLOC_STS_R.create("SHIPALLOCSTS");
		MST_SHIP_SCHD_R S4_SHIPSCHD = MST_SHIP_SCHD_R.create("SHIPSCHD");
		MST_SHIP_INST_D_R S4_SHIPINSTD = MST_SHIP_INST_D_R.create("SHIPINSTD");
		MST_SHIP_INST_R S4_SHIPINST = MST_SHIP_INST_R.create("SHIPINST");
		MST_SHIP_PR_R S4_SHIPPR = MST_SHIP_PR_R.create("SHIPPR");
		MST_SLO_D_R S4_SLOD = MST_SLO_D_R.create("SLOD");
		MST_SLO_R S4_SLO = MST_SLO_R.create("SLO");
		MST_PROV_SCHD_R S4_PROVSCHD = MST_PROV_SCHD_R.create("PROVSCHD");
		MST_XFR_SCHD_R S4_XFRSCHD = MST_XFR_SCHD_R.create("XFRSCHD");
		MAM_TRD_R S4_TRD = MAM_TRD_R.create("TRD");
		MAM_TRNSPT_R S4_TRNSPT = MAM_TRNSPT_R.create("TRNSPT");
		MAM_EXIM_PORT_R S4_LOADPORT = MAM_EXIM_PORT_R.create("LOADPORT");
		MAM_EXIM_PORT_R S4_DSCHRGPORT = MAM_EXIM_PORT_R.create("DSCHRGPORT");
		MAM_EXIM_PORT_R S4_VIAPORT = MAM_EXIM_PORT_R.create("VIAPORT");
		MAM_TTERM_R S4_TTERM1 = MAM_TTERM_R.create("TTERM1");
		MAM_TTERM_R S4_TTERM2 = MAM_TTERM_R.create("TTERM2");
		MAM_TTERM_R S4_TTERM3 = MAM_TTERM_R.create("TTERM3");
		MAM_CUR_R S4_SLOTRDCUR = MAM_CUR_R.create("SLOTRDCUR");
		MAM_LG_GRP_R S4_SHIPLGGRP = MAM_LG_GRP_R.create("SHIPLGGRP");
		MAM_BP_R S4_DLV = MAM_BP_R.create("DLV");
		MAM_LOC_R S4_LOC = MAM_LOC_R.create("LOC");
		MAM_CNTRY_R S4_DLVCNTRY = MAM_CNTRY_R.create("DLVCNTRY");
		MAM_CNTRY_R S4_LOCCNTRY = MAM_CNTRY_R.create("LOCCNTRY");
		MAM_BP_R S4_CST = MAM_BP_R.create("CST");
		MAM_BP_R S4_SPPL = MAM_BP_R.create("SPPL");
		MAM_DPT_R S4_DPT = MAM_DPT_R.create("DPT");
		MAM_CUR_R S4_PROVTRDCUR = MAM_CUR_R.create("PROVTRDCUR");
		MAM_CUR_R S4_XFRTRDCUR = MAM_CUR_R.create("XFRTRDCUR");
		MAM_LOC_R S4_GRLOC = MAM_LOC_R.create("GRLOC");
		MSVM_SHIP_TO_ID_R S4_SHIPTOID = MSVM_SHIP_TO_ID_R.create("SHIPTOID");
		MAM_ITM_LG_GRP_R S4_ITMLGGRP = MAM_ITM_LG_GRP_R.create("ITMLGGRP");
		MAM_LOC_R S4_GILOC = MAM_LOC_R.create("GILOC");
		MAM_LG_GRP_R S4_TDLVLGGRP = MAM_LG_GRP_R.create("TDLVLGGRP");
		MCTempView S4_VIVSHIPACTMAP = createTempView("VIVSHIPACTMAP");
		MST_IV_SHIP_ACT_MAP_R S5_IVSHIPACTMAP = MST_IV_SHIP_ACT_MAP_R.create("IVSHIPACTMAP");
		MAVM_RD_WG_R S6_RDWG = MAVM_RD_WG_R.create("RDWG");
		MAVM_RD_LOC_R S7_RDLOC = MAVM_RD_LOC_R.create("RDLOC");
		MST_SLS_SCHD_R S8_SLSSCHD = MST_SLS_SCHD_R.create("SLSSCHD");
		MST_PURC_SCHD_R S8_PURCSCHD = MST_PURC_SCHD_R.create("PURCSCHD");
		MST_ARR_PR_R S8_ARRPR = MST_ARR_PR_R.create("ARRPR");
		MST_PO_D_R S8_POD = MST_PO_D_R.create("POD");
		MST_PO_R S8_PO = MST_PO_R.create("PO");
		MAM_BP_R S8_SPPL = MAM_BP_R.create("SPPL");
		MAM_LG_CTL_R S9_LGCTL = MAM_LG_CTL_R.create("LGCTL");
		MST_DLV_SLIP_R S10_DLVSLIP = MST_DLV_SLIP_R.create("DLVSLIP");
		MCTempView S10_VDLVSLIP = createTempView("VDLVSLIP");
		
		return createQueryPlan()
			.setQuery(
				sql("MSBEL1730_MST_SHIP_ACT_Query_S01")
					.mainQuery()
					.select(
						S0_VSHIPACT.prAll(),
						bracket(
							subQuery()
							.select(S1_CST.bill_cl_typ)
							.from(S1_CST)
							.where(
								value(0).eq(value(0))
								.and(
									S1_CST.bp_cd.eq(subQuery()
										.select(S2_ACST.bcst_cd)
										.from(S2_ACST)
										.where(
											value(0).eq(value(0))
											.and(
												S2_ACST.bp_cd.eq(subQuery()
													.select(S3_BCST.acst_cd)
													.from(S3_BCST)
													.where(
														value(0).eq(value(0))
														.and(S3_BCST.bp_cd.eq(S0_VSHIPACT.pr("ship_rqst_id_cd")))
														.and(S3_BCST.cst_flg.eq(value(true)))
														.and(S3_BCST.acst_cd.isNotNull())
													)
												)
											)
											.and(S2_ACST.acst_flg.eq(value(true)))
											.and(S2_ACST.bcst_cd.isNotNull())
										)
									)
								)
							)
						).as("bill_cl_typ")
					)
					.from(
						subQuery()
						.select(
							S4_TRD.trd_ptn_typ,
							S4_SLO.iv_no.as("slo_iv_no"),
							nvl2(
									S4_SLO.iv_no,
									value(true),
									value(false)
								).as("is_slo_iv_no"),
							S4_SHIPACTD.dlv_id_typ,
							S4_SHIPACTD.dlv_id_cd,
							cases()
								.when(S4_SHIPACTD.dlv_sundry_flg.eq(value(false)))
									.then(
										cases()
											.when(S4_SHIPACTD.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.SLS.value())))
												.then(S4_DLV.bp_nm)
											.when(S4_SHIPACTD.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.SHIP.value())))
												.then(S4_DLV.bp_nm)
											.otherwise(S4_LOC.loc_nm)
								)
								.otherwise(S4_SHIPACTD.dlv_id_nm)
							.as("dlv_id_nm"),
							S4_SHIPACTD.dlv_sundry_flg,
							S4_SHIPACTD.dlv_zip_cd,
							S4_SHIPACTD.dlv_addr1,
							S4_SHIPACTD.dlv_addr2,
							S4_SHIPACTD.dlv_addr3,
							S4_SHIPACTD.dlv_addr4,
							S4_SHIPACTD.dlv_cntct_dpt,
							S4_SHIPACTD.dlv_cntct_psn,
							S4_SHIPACTD.dlv_tel,
							S4_SHIPACTD.dlv_fax,
							cases()
								.when(S4_SHIPACTD.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.SLS.value())))
									.then(S4_DLV.cntry_cd)
								.when(S4_SHIPACTD.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.SHIP.value())))
									.then(S4_DLV.cntry_cd)
								.when(S4_SHIPACTD.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.PROV.value())))
									.then(S4_LOC.cntry_cd)
								.when(S4_SHIPACTD.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.XFR.value())))
									.then(S4_LOC.cntry_cd)
								.when(S4_SHIPACTD.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.XFR_RTN.value())))
									.then(S4_LOC.cntry_cd)
								.otherwise(nullValue()).as("dlv_cntry_cd"),
							S4_CST.sls_upri_cng_flg,
							cases()
								.when(S4_SHIPACTD.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.SLS.value())))
									.then(S4_DLVCNTRY.cntry_nm)
								.when(S4_SHIPACTD.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.SHIP.value())))
									.then(S4_DLVCNTRY.cntry_nm)
								.when(S4_SHIPACTD.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.PROV.value())))
									.then(S4_LOCCNTRY.cntry_nm)
								.when(S4_SHIPACTD.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.XFR.value())))
									.then(S4_LOCCNTRY.cntry_nm)
								.when(S4_SHIPACTD.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.XFR_RTN.value())))
									.then(S4_LOCCNTRY.cntry_nm)
								.otherwise(nullValue()).as("dlv_cntry_nm"),
							cases()
								.when(S4_SHIPACTD.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.SLS.value())))
									.then(value(MSC_SHIP_RQST_ID_TYP.CST.value()))
								.when(S4_SHIPACTD.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.SHIP.value())))
									.then(value(MSC_SHIP_RQST_ID_TYP.CST.value()))
								.when(S4_SHIPACTD.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.PROV.value())))
									.then(value(MSC_SHIP_RQST_ID_TYP.SPPL.value()))
								.when(S4_SHIPACTD.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.XFR.value())))
									.then(value(MSC_SHIP_RQST_ID_TYP.LOC.value()))
								.when(S4_SHIPACTD.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.XFR_RTN.value())))
									.then(value(MSC_SHIP_RQST_ID_TYP.LOC.value()))
								.otherwise(nullValue()).as("ship_rqst_id_typ"),
							cases()
								.when(S4_SHIPACTD.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.SLS.value())))
									.then(nvl(S4_SHIPPR.cst_cd, S4_SHIPACT.cst_cd))
								.when(S4_SHIPACTD.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.SHIP.value())))
									.then(nvl(S4_SHIPPR.cst_cd, S4_SHIPACT.cst_cd))
								.when(S4_SHIPACTD.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.PROV.value())))
									.then(S4_LOC.sppl_cd)
								.when(S4_SHIPACTD.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.XFR.value())))
									.then(S4_XFRSCHD.gr_loc_cd)
								.when(S4_SHIPACTD.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.XFR_RTN.value())))
									.then(S4_XFRSCHD.gr_loc_cd)
								.otherwise(nullValue()).as("ship_rqst_id_cd"),
							cases()
								.when(S4_SHIPACTD.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.SLS.value())))
									.then(S4_CST.bp_nm)
								.when(S4_SHIPACTD.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.SHIP.value())))
									.then(S4_CST.bp_nm)
								.when(S4_SHIPACTD.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.PROV.value())))
									.then(S4_SPPL.bp_nm)
								.when(S4_SHIPACTD.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.XFR.value())))
									.then(S4_GRLOC.loc_nm)
								.when(S4_SHIPACTD.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.XFR_RTN.value())))
									.then(S4_GRLOC.loc_nm)
								.otherwise(nullValue()).as("ship_rqst_id_nm"),
								S4_SHIPACT.via_dlv_typ,
								decode(
									S4_SHIPACT.ship_to_id_typ,
									value(MSC_SHIP_TO_ID_TYP.TDLV.value()),
									S4_SHIPACT.ship_to_id_cd,
									nullValue()
								).as("tdlv_cd"),
								cases()
									.when(S4_SHIPACT.ship_to_sundry_flg.eq(value(false)))
										.then(S4_SHIPTOID.ship_to_id_nm)
									.otherwise(
										decode(
											S4_SHIPACT.ship_to_id_typ,
											value(MSC_SHIP_TO_ID_TYP.TDLV.value()),
											S4_SHIPACT.ship_to_id_nm,
											nullValue()
										)
									).as("tdlv_nm"),
								decode(
									S4_SHIPACT.ship_to_id_typ,
									value(MSC_SHIP_TO_ID_TYP.TDLV.value()),
									S4_SHIPACT.ship_to_lg_grp_cd,
									nullValue()
								).as("tdlv_lg_grp_cd"),
								S4_TDLVLGGRP.lg_grp_nm.as("tdlv_lg_grp_nm"),
								decode(
									S4_SHIPACT.ship_to_id_typ,
									value(MSC_SHIP_TO_ID_TYP.TDLV.value()),
									S4_SHIPACT.ship_to_sundry_flg,
									value(false)
								).as("tdlv_sundry_flg"),
								decode(
									S4_SHIPACT.ship_to_id_typ,
									value(MSC_SHIP_TO_ID_TYP.TDLV.value()),
									S4_SHIPACT.ship_to_zip_cd,
									nullValue()
								).as("tdlv_zip_cd"),
								decode(
									S4_SHIPACT.ship_to_id_typ,
									value(MSC_SHIP_TO_ID_TYP.TDLV.value()),
									S4_SHIPACT.ship_to_addr1,
									nullValue()
								).as("tdlv_addr1"),
								decode(
									S4_SHIPACT.ship_to_id_typ,
									value(MSC_SHIP_TO_ID_TYP.TDLV.value()),
									S4_SHIPACT.ship_to_addr2,
									nullValue()
								).as("tdlv_addr2"),
								decode(
									S4_SHIPACT.ship_to_id_typ,
									value(MSC_SHIP_TO_ID_TYP.TDLV.value()),
									S4_SHIPACT.ship_to_addr3,
									nullValue()
								).as("tdlv_addr3"),
								decode(
									S4_SHIPACT.ship_to_id_typ,
									value(MSC_SHIP_TO_ID_TYP.TDLV.value()),
									S4_SHIPACT.ship_to_addr4,
									nullValue()
								).as("tdlv_addr4"),
								decode(
									S4_SHIPACT.ship_to_id_typ,
									value(MSC_SHIP_TO_ID_TYP.TDLV.value()),
									S4_SHIPACT.ship_to_tel,
									nullValue()
								).as("tdlv_tel"),
								decode(
									S4_SHIPACT.ship_to_id_typ,
									value(MSC_SHIP_TO_ID_TYP.TDLV.value()),
									S4_SHIPACT.ship_to_fax,
									nullValue()
								).as("tdlv_fax"),
								decode(
									S4_SHIPACT.ship_to_id_typ,
									value(MSC_SHIP_TO_ID_TYP.TDLV.value()),
									S4_SHIPACT.ship_to_cntct_dpt,
									nullValue()
								).as("tdlv_cntct_dpt"),
								decode(
									S4_SHIPACT.ship_to_id_typ,
									value(MSC_SHIP_TO_ID_TYP.TDLV.value()),
									S4_SHIPACT.ship_to_cntct_psn,
									nullValue()
								).as("tdlv_cntct_psn"),
								S4_SLO.trnspt_cd,
								S4_TRNSPT.trnspt_nm,
								S4_SLO.vssl_flght,
								S4_SLO.load_port_cd,
								S4_LOADPORT.port_nm.as("load_port_nm"),
								S4_SLO.etd_dt,
								S4_SLO.dschrg_port_cd,
								S4_DSCHRGPORT.port_nm.as("dschrg_port_nm"),
								S4_SLO.eta_dt,
								S4_SLO.via_port_cd,
								S4_VIAPORT.port_nm.as("via_port_nm"),
								S4_SLO.via_schd_dt,
								decode(S4_SHIPACT.uplnd_flg,
										value(false),
										S4_SLO.sls_basis_typ,
										S10_VDLVSLIP.pr(S10_DLVSLIP.sls_basis_typ)
								).as("sls_basis_typ"),
								S4_XFRSCHD.prov_basis_typ,
								S4_SLO.tterm_cd1,
								S4_TTERM1.tterm_nm.as("tterm_nm1"),
								S4_SLO.tterm_rmrks1,
								S4_SLO.tterm_cd2,
								S4_TTERM2.tterm_nm.as("tterm_nm2"),
								S4_SLO.tterm_rmrks2,
								S4_SLO.tterm_cd3,
								S4_TTERM3.tterm_nm.as("tterm_nm3"),
								S4_SLO.tterm_rmrks3,
								cases()
								.when(S4_SHIPACTD.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.SLS.value())))
									.then(S4_SLO.trd_cur_cd)
								.when(S4_SHIPACTD.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.PROV.value())))
									.then(S4_PROVSCHD.trd_cur_cd)
								.when(S4_SHIPACTD.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.XFR.value())))
									.then(S4_XFRSCHD.trd_cur_cd)
								.when(S4_SHIPACTD.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.XFR_RTN.value())))
									.then(S4_XFRSCHD.trd_cur_cd)
								.otherwise(nullValue()).as("trd_cur_cd"),
							cases()
								.when(S4_SHIPACTD.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.SLS.value())))
									.then(S4_SLOTRDCUR.cur_nm)
								.when(S4_SHIPACTD.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.PROV.value())))
									.then(S4_PROVTRDCUR.cur_nm)
								.when(S4_SHIPACTD.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.XFR.value())))
									.then(S4_XFRTRDCUR.cur_nm)
								.when(S4_SHIPACTD.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.XFR_RTN.value())))
									.then(S4_XFRTRDCUR.cur_nm)
								.otherwise(nullValue()).as("trd_cur_nm"),
								cases()
								.when(S4_SHIPACTD.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.SLS.value())))
									.then(S4_SLO.xrate_inpt_flg)
								.when(S4_SHIPACTD.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.PROV.value())))
									.then(S4_PROVSCHD.xrate_inpt_flg)
								.when(S4_SHIPACTD.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.XFR.value())))
									.then(S4_XFRSCHD.xrate_inpt_flg)
								.when(S4_SHIPACTD.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.XFR_RTN.value())))
									.then(S4_XFRSCHD.xrate_inpt_flg)
								.otherwise(nullValue()).as("xrate_inpt_flg"),
							cases()
								.when(S4_SHIPACTD.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.SLS.value())))
									.then(S4_SLO.xrate)
								.when(S4_SHIPACTD.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.PROV.value())))
									.then(S4_PROVSCHD.xrate)
								.when(S4_SHIPACTD.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.XFR.value())))
									.then(S4_XFRSCHD.xrate)
								.when(S4_SHIPACTD.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.XFR_RTN.value())))
									.then(S4_XFRSCHD.xrate)
								.otherwise(nullValue()).as("xrate"),
							cases()
								.when(S4_SHIPACTD.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.SLS.value())))
									.then(S4_SLO.ptax_xrate_inpt_flg)
								.when(S4_SHIPACTD.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.PROV.value())))
									.then(S4_PROVSCHD.ptax_xrate_inpt_flg)
								.when(S4_SHIPACTD.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.XFR.value())))
									.then(S4_XFRSCHD.ptax_xrate_inpt_flg)
								.when(S4_SHIPACTD.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.XFR_RTN.value())))
									.then(S4_XFRSCHD.ptax_xrate_inpt_flg)
								.otherwise(nullValue()).as("ptax_xrate_inpt_flg"),
							cases()
								.when(S4_SHIPACTD.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.SLS.value())))
									.then(S4_SLO.ptax_xrate)
								.when(S4_SHIPACTD.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.PROV.value())))
									.then(S4_PROVSCHD.ptax_xrate)
								.when(S4_SHIPACTD.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.XFR.value())))
									.then(S4_XFRSCHD.ptax_xrate)
								.when(S4_SHIPACTD.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.XFR_RTN.value())))
									.then(S4_XFRSCHD.ptax_xrate)
								.otherwise(nullValue()).as("ptax_xrate"),
								coalesce(
										S4_SLOTRDCUR.amt_dec_place,
										S4_PROVTRDCUR.amt_dec_place,
										S4_XFRTRDCUR.amt_dec_place
									).as("trd_cur_amt_dec_place"),
									coalesce(
										S4_SLOTRDCUR.upri_dec_place,
										S4_PROVTRDCUR.upri_dec_place,
										S4_XFRTRDCUR.upri_dec_place
									).as("trd_cur_upri_dec_place"),
									nvl(
										decode(
											S4_SHIPACTD.trd_ptn_typ,
											value(MAC_TRD_PTN_TYP.SLS.value()),
											S4_CST.sls_amt_rnd_typ,
											value(MAC_TRD_PTN_TYP.PROV.value()),
											S4_SPPL.prov_amt_rnd_typ,
											value(MAC_RND_TYP.RNDOFF.value())
										),
										value(MAC_RND_TYP.RNDOFF.value())
									).as("trd_amt_rnd_typ"),
									nvl(
										decode(
											S4_SHIPACTD.trd_ptn_typ,
											value(MAC_TRD_PTN_TYP.SLS.value()),
											S4_CST.sls_tax_rnd_typ,
											value(MAC_TRD_PTN_TYP.PROV.value()),
											S4_SPPL.prov_tax_rnd_typ,
											value(MAC_RND_TYP.RNDOFF.value())
										),
										value(MAC_RND_TYP.RNDOFF.value())
									).as("trd_tax_rnd_typ"),
								S4_CST.ar_dpt_typ,
								MAPA_BP$F_GET_AR_DPT_CD_NE(
									S4_CST.bp_cd,
									bind("today"),
									value(false)
								).as("lnk_ar_dpt_cd"),
								cases()
								.when(S4_SHIPACTD.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.SLS.value())))
									.then(S4_DLV.prnt_lcl_cd)
								.when(S4_SHIPACTD.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.SHIP.value())))
									.then(S4_DLV.prnt_lcl_cd)
								.when(S4_SHIPACTD.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.PROV.value())))
									.then(S4_LOC.prnt_lcl_cd)
								.when(S4_SHIPACTD.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.XFR.value())))
									.then(S4_LOC.prnt_lcl_cd)
								.when(S4_SHIPACTD.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.XFR_RTN.value())))
									.then(S4_LOC.prnt_lcl_cd)
								.otherwise(nullValue()).as("prnt_lcl_cd"),
							S4_SHIPACT.ship_inst_no,
							S4_SHIPACTD.ship_act_d_no,
							S4_SHIPACT.ship_fr_lg_grp_cd,
							S4_LOC.lg_grp_cd.as("ship_to_lg_grp_cd")
						)
						.from(
							S4_SHIPACTD
							.innerJoin(S4_SHIPACT).on(S4_SHIPACTD.ship_act_no.eq(S4_SHIPACT.ship_act_no))
							.leftOuterJoin(S4_SHIPALLOCSTS).on(S4_SHIPACTD.ship_alloc_sts_no.eq(S4_SHIPALLOCSTS.ship_alloc_sts_no))
							.leftOuterJoin(S4_SHIPSCHD).on(S4_SHIPALLOCSTS.ship_schd_no.eq(S4_SHIPSCHD.ship_schd_no))
							.leftOuterJoin(S4_SHIPPR).on(S4_SHIPSCHD.ship_pr_no.eq(S4_SHIPPR.ship_pr_no))
							.leftOuterJoin(S4_SHIPINSTD).on(S4_SHIPALLOCSTS.ship_inst_d_no.eq(S4_SHIPINSTD.ship_inst_d_no))
							.leftOuterJoin(S4_SHIPINST).on(S4_SHIPINSTD.ship_inst_no.eq(S4_SHIPINST.ship_inst_no))
							.leftOuterJoin(S4_SLOD).on(S4_SHIPPR.slo_d_no.eq(S4_SLOD.slo_d_no))
							.leftOuterJoin(S4_SLO).on(S4_SLOD.slo_no.eq(S4_SLO.slo_no))
							.leftOuterJoin(S4_PROVSCHD).on(
								bracket(
									S4_SHIPSCHD.ship_schd_no.eq(S4_PROVSCHD.prov_src_schd_no1)
									.and(MAC_TRD_PTN_TYP$IS_PROV(S4_PROVSCHD.trd_ptn_typ).eq(value(true)))
								)
							)
							.leftOuterJoin(S4_XFRSCHD).on(
								bracket(
									S4_SHIPPR.xfr_schd_no.eq(S4_XFRSCHD.xfr_schd_no)
								)
							)
							.leftOuterJoin(subQuery().select(
									S5_IVSHIPACTMAP.ship_act_d_no,
									sum(S5_IVSHIPACTMAP.base_unit_qty).as("iv_qty")
									).from(S5_IVSHIPACTMAP)
									.groupBy(S5_IVSHIPACTMAP.ship_act_d_no)
									.view(S4_VIVSHIPACTMAP))
							.on(S4_SHIPACTD.ship_act_d_no.eq(S4_VIVSHIPACTMAP.pr(S5_IVSHIPACTMAP.ship_act_d_no)))
							.leftOuterJoin(subQuery()
									.selectDistinct(
										S10_DLVSLIP.dlv_slip_act_no,
										S10_DLVSLIP.sls_basis_typ
									).from(S10_DLVSLIP)
									.where(S10_DLVSLIP.slip_sts_typ.eq(value(MAC_SLIP_STS_TYP.CRT.value())))
									.view(S10_VDLVSLIP)).on(S4_SHIPACT.uplnd_flg.eq(value(true)).and(S4_SHIPACT.ship_act_no.eq(S10_VDLVSLIP.pr(S10_DLVSLIP.dlv_slip_act_no))))
							.leftOuterJoin(S4_TRD).on(S4_SHIPACTD.trd_cd.eq(S4_TRD.trd_cd))
							.leftOuterJoin(S4_TRNSPT).on(S4_SLO.trnspt_cd.eq(S4_TRNSPT.trnspt_cd))
							.leftOuterJoin(S4_LOADPORT).on(S4_SLO.load_port_cd.eq(S4_LOADPORT.port_cd))
							.leftOuterJoin(S4_DSCHRGPORT).on(S4_SLO.dschrg_port_cd.eq(S4_DSCHRGPORT.port_cd))
							.leftOuterJoin(S4_VIAPORT).on(S4_SLO.via_port_cd.eq(S4_VIAPORT.port_cd))
							.leftOuterJoin(S4_TTERM1).on(S4_SLO.tterm_cd1.eq(S4_TTERM1.tterm_cd))
							.leftOuterJoin(S4_TTERM2).on(S4_SLO.tterm_cd2.eq(S4_TTERM2.tterm_cd))
							.leftOuterJoin(S4_TTERM3).on(S4_SLO.tterm_cd3.eq(S4_TTERM3.tterm_cd))
							.leftOuterJoin(S4_SLOTRDCUR).on(S4_SLO.trd_cur_cd.eq(S4_SLOTRDCUR.cur_cd))
							.leftOuterJoin(S4_SHIPLGGRP).on(S4_SHIPACT.ship_fr_lg_grp_cd.eq(S4_SHIPLGGRP.lg_grp_cd))
							.leftOuterJoin(S4_DLV).on(S4_SHIPACTD.dlv_id_cd.eq(S4_DLV.bp_cd))
							.leftOuterJoin(S4_LOC).on(S4_SHIPACTD.dlv_id_cd.eq(S4_LOC.loc_cd))
							.leftOuterJoin(S4_DLVCNTRY).on(S4_DLV.cntry_cd.eq(S4_DLVCNTRY.cntry_cd))
							.leftOuterJoin(S4_LOCCNTRY).on(S4_LOC.cntry_cd.eq(S4_LOCCNTRY.cntry_cd))
							.leftOuterJoin(S4_CST).on(nvl(S4_SHIPPR.cst_cd, S4_SHIPACT.cst_cd).eq(S4_CST.bp_cd))
							.leftOuterJoin(S4_SPPL).on(S4_LOC.sppl_cd.eq(S4_SPPL.bp_cd))
							.leftOuterJoin(S4_DPT).on(
								bracket(
									S4_SLO.sls_dpt_cd.eq(S4_DPT.dpt_cd)
									.and(S4_SLO.slo_dt.between(S4_DPT.st_dt, S4_DPT.end_dt))
								)
								.or(
									bracket(
											S4_SHIPACT.rqst_dpt_cd.eq(S4_DPT.dpt_cd)
											.and(S4_SHIPACT.ac_dt.between(S4_DPT.st_dt, S4_DPT.end_dt))
										)
								)
							)
							.leftOuterJoin(S4_PROVTRDCUR).on(S4_PROVSCHD.trd_cur_cd.eq(S4_PROVTRDCUR.cur_cd))
							.leftOuterJoin(S4_XFRTRDCUR).on(S4_XFRSCHD.trd_cur_cd.eq(S4_XFRTRDCUR.cur_cd))
							.leftOuterJoin(S4_GRLOC).on(S4_XFRSCHD.gr_loc_cd.eq(S4_GRLOC.loc_cd))
							.leftOuterJoin(S4_SHIPTOID).on(
								bracket(
									S4_SHIPACT.ship_to_id_typ.eq(S4_SHIPTOID.ship_to_id_typ)
									.and(S4_SHIPACT.ship_to_id_typ.eq(value(MSC_SHIP_TO_ID_TYP.TDLV.value())))
									.and(S4_SHIPACT.ship_to_id_cd.eq(S4_SHIPTOID.ship_to_id_cd))
								)
							)
							.leftOuterJoin(S4_ITMLGGRP).on(
								bracket(
									S4_XFRSCHD.itm_cd.eq(S4_ITMLGGRP.itm_cd)
									.and(S4_XFRSCHD.itm_sub1.eq(S4_ITMLGGRP.itm_sub1))
									.and(S4_XFRSCHD.itm_sub2.eq(S4_ITMLGGRP.itm_sub2))
									.and(S4_XFRSCHD.itm_sub3.eq(S4_ITMLGGRP.itm_sub3))
									.and(S4_XFRSCHD.gi_lg_grp_cd.eq(S4_ITMLGGRP.lg_grp_cd))
								)
							)
							.leftOuterJoin(S4_GILOC).on(
								bracket(
									S4_XFRSCHD.gi_lg_grp_cd.eq(S4_GILOC.lg_grp_cd)
									.and(S4_GILOC.lg_def_flg.eq(value(true)))
									.and(S4_GILOC.del_flg.eq(value(false)))
								)
							)
							.leftOuterJoin(S4_TDLVLGGRP).on(
								decode(
									S4_SHIPACT.ship_to_id_typ,
									value(MSC_SHIP_TO_ID_TYP.TDLV.value()),
									S4_SHIPACT.ship_to_lg_grp_cd,
									nullValue()
								).eq(S4_TDLVLGGRP.lg_grp_cd)
							)
						)
						.where(
							value(0).eq(value(0))
							.and(S4_SHIPACT.can_flg.eq(value(false)))
							.and(S4_SHIPACTD.can_flg.eq(value(false)))
							.and(
								exists(
									subQuery()
									.select(value("X"))
									.from(S6_RDWG)
									.where(
										S4_DPT.wg_cd.eq(S6_RDWG.wg_cd)
									)
								)
								.or(
									exists(
										subQuery()
										.select(value("X"))
										.from(S7_RDLOC)
										.where(
											coalesce(
												S4_XFRSCHD.gi_loc_cd,
												S4_ITMLGGRP.lg_def_loc_cd,
												S4_GILOC.loc_cd
											).eq(S7_RDLOC.loc_cd)
										)
									)
								)
							)
							.and(
								bracket(
									S4_SHIPACT.uplnd_flg.eq(value(true))
									.or(S4_SHIPPR.purc_ddlv_flg.eq(value(false))
										.or(
											exists(
												subQuery()
												.select(value("X"))
												.from(
													S8_SLSSCHD
													.innerJoin(S8_PURCSCHD).on(
														bracket(
															S8_SLSSCHD.purc_schd_no.eq(S8_PURCSCHD.purc_schd_no)
														)
													)
													.innerJoin(S8_ARRPR).on(
														bracket(
															S8_PURCSCHD.arr_pr_no.eq(S8_ARRPR.arr_pr_no)
														)
													)
													.innerJoin(S8_POD).on(
														bracket(
															S8_ARRPR.po_d_no.eq(S8_POD.po_d_no)
														)
													)
													.innerJoin(S8_PO).on(
														bracket(
															S8_POD.po_no.eq(S8_PO.po_no)
														)
													)
													.leftOuterJoin(S8_SPPL).on(
														bracket(
															S8_PO.sppl_cd.eq(S8_SPPL.bp_cd)
														)
													)
												)
												.where(
													value(0).eq(value(0))
													.and(S4_SHIPSCHD.ship_schd_no.eq(S8_SLSSCHD.ship_schd_no))
													.and(S8_SLSSCHD.cmpl_flg.eq(value(false)))
													.and(S8_SLSSCHD.purc_schd_no.isNotNull())
													.and(S8_POD.rqst_can_flg.eq(value(false)))
													.and(S8_SPPL.sppl_iv_flg.eq(value(false)))
												)
											)
										)
									)
								)
							)
							.and(S4_SHIPACTD.base_unit_qty.subtract(nvl(S4_VIVSHIPACTMAP.pr("iv_qty"), value(0))).subtract(S4_SHIPACTD.ship_ret_qty).gt(value(0)))
							.and(S4_SHIPACT.ship_act_no.like(bind("srch_tgt_no")))
						).view(S0_VSHIPACT)
						.leftOuterJoin(S0_SHIPRQST).on(
								bracket(
									S0_VSHIPACT.pr("ship_rqst_id_cd").eq(S0_SHIPRQST.bp_cd)
									.and(S0_VSHIPACT.pr("ship_rqst_id_typ").neq(value(MSC_SHIP_RQST_ID_TYP.LOC.value())))
								)
							)
					)
					.where(
						value(0).eq(value(0))
						.and(
							bracket(
								bracket(
										value(MAC_TRD_PTN_TYP.SLS.value()).eq(S0_VSHIPACT.pr(S4_TRD.trd_ptn_typ))
										.or(value(MAC_TRD_PTN_TYP.SHIP.value()).eq(S0_VSHIPACT.pr(S4_TRD.trd_ptn_typ)))
									)
								.and(S0_SHIPRQST.cst_iv_flg.eq(value(true)))
							)
							.or(
								value(MAC_TRD_PTN_TYP.SLS.value()).neq(S0_VSHIPACT.pr(S4_TRD.trd_ptn_typ))
								.and(value(MAC_TRD_PTN_TYP.SHIP.value()).neq(S0_VSHIPACT.pr(S4_TRD.trd_ptn_typ)))
								.and(value(MAC_TRD_PTN_TYP.PROV_RTN.value()).neq(S0_VSHIPACT.pr(S4_TRD.trd_ptn_typ)))
								.and(
									exists(
										subQuery()
										.select(value("X"))
										.from(S9_LGCTL)
										.where(
											value(0).eq(value(0))
											.and(S0_VSHIPACT.pr("ship_fr_lg_grp_cd").eq(S9_LGCTL.fr_lg_grp_cd))
											.and(S0_VSHIPACT.pr("ship_to_lg_grp_cd").eq(S9_LGCTL.to_lg_grp_cd))
											.and(S9_LGCTL.iv_trd_flg.eq(value(true)))
										)
									)
								)
							)
						)
					)
			);
	}
}