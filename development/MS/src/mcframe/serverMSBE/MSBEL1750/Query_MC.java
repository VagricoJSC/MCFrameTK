package mcframe.serverMSBE.MSBEL1750;

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
	 * -- MSBEL1750_MST_IV_D_Query_S01
	 */
	static MCQueryPlan MSBEL1750_MST_IV_D_S01() {
		MCTempView S0_V1 = createTempView("V1");
		MAM_ITM_LCL_R S0_M01 = MAM_ITM_LCL_R.create("M01");
		MST_IV_D_R S1_T1 = MST_IV_D_R.create("T1");
		MST_IV_R S1_T2 = MST_IV_R.create("T2");
		MST_SHIP_PR_R S1_T3 = MST_SHIP_PR_R.create("T3");
		MST_WRK_SNO_R S1_T4 = MST_WRK_SNO_R.create("T4");
		MST_WRK_R S1_T5 = MST_WRK_R.create("T5");
		MAM_CNTRY_R S1_M1 = MAM_CNTRY_R.create("M1");
		MAM_UNIT_R S1_M2 = MAM_UNIT_R.create("M2");
		MAVM_ITM_UNIT_R S1_M3 = MAVM_ITM_UNIT_R.create("M3");
		MAM_BP_R S1_M4 = MAM_BP_R.create("M4");
		MAM_LOC_R S1_M5 = MAM_LOC_R.create("M5");
		MAM_BP_R S1_M6 = MAM_BP_R.create("M6");
		MAM_SUNDRY_ITM_R S1_M7 = MAM_SUNDRY_ITM_R.create("M7");
		MAM_ITM_R S1_M8 = MAM_ITM_R.create("M8");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBEL1750_MST_IV_D_Query_S01")
					.mainQuery()
					.select(
						S0_V1.prAll(),
						cases()
							.when(S0_V1.pr(S1_T1.sundry_itm_flg).eq(value(true)))
								.then(S0_V1.pr("sundry_iv_itm_nm"))
							.otherwise(
								nvl(
									S0_M01.itm_nm,
									S0_V1.pr("itm_nm")
								)
							).as("iv_itm_nm")
					)
					.from(
						subQuery()
						.select(
							S1_T1.itm_cd,
							S1_T1.itm_sub1,
							S1_T1.itm_sub2,
							S1_T1.itm_sub3,
							cases()
								.when(S1_T1.sundry_itm_flg.eq(value(true)))
									.then(
										nvl(
											S1_T1.itm_nm,
											S1_M7.itm_nm
										)
								)
								.otherwise(S1_M8.itm_nm).as("itm_nm"),
							nvl(
								S1_T1.iv_itm_nm,
								S1_M7.itm_nm
							).as("sundry_iv_itm_nm"),
							S1_T1.cntry_org_cd,
							S1_M1.cntry_nm.as("cntry_org_nm"),
							S1_T1.trd_unit_cd,
							S1_M2.unit_nm.as("trd_unit_nm"),
							S1_T1.trd_unit_qty,
							S1_M8.stk_mng_typ,
							S1_M8.sno1_mng_typ,
							S1_M8.sno2_mng_typ,
							S1_M8.sno3_mng_typ,
							S1_M8.sno4_mng_typ,
							S1_T1.sno1,
							S1_T1.sno2,
							S1_T1.sno3,
							S1_T1.sno4,
							S1_T4.wrk_no,
							S1_T5.wrk_nm,
							nullValue().as("cntnr_cd"),
							nullValue().as("cntnr_nm"),
							nullValue().as("cntnr_no_fr"),
							nullValue().as("cntnr_no_to"),
							bracket(
								S1_M3.unit_wt.multiply(S1_T1.trd_unit_qty)
							).as("net_wt"),
							nullValue().as("grss_wt"),
							bracket(
								S1_M3.unit_dim.multiply(S1_T1.trd_unit_qty)
							).as("dim"),
							nullValue().as("pl_d_rmrks"),
							S1_T1.cst_po_no,
							S1_T1.cst_po_d_no,
							S1_T1.cst_itm_cd,
							S1_T1.cst_itm_nm,
							nullValue().as("intr_d_rmrks"),
							nullValue().as("sub_char1"),
							nullValue().as("sub_char2"),
							nullValue().as("sub_char3"),
							S1_T1.disp_seq,
							S1_M3.dec_place.as("trd_unit_dec_place"),
							S1_T1.sundry_itm_flg,
							cases()
								.when(S1_T2.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.SLS.value())))
									.then(S1_M4.prnt_lcl_cd)
								.when(S1_T2.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.PROV.value())))
									.then(S1_M5.prnt_lcl_cd)
								.when(S1_T2.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.XFR.value())))
									.then(S1_M5.prnt_lcl_cd)
								.when(S1_T2.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.XFR_RTN.value())))
									.then(S1_M5.prnt_lcl_cd)
								.otherwise(nullValue()).as("prnt_lcl_cd")
						)
						.from(
							S1_T1
							.innerJoin(S1_T2).on(
								bracket(
									S1_T1.iv_mng_no.eq(S1_T2.iv_mng_no)
								)
							)
							.leftOuterJoin(S1_T3).on(
								bracket(
									bracket(
										S1_T1.slo_d_no.isNotNull()
										.and(S1_T1.slo_d_no.eq(S1_T3.slo_d_no))
									)
									.or(
										S1_T1.xfr_schd_no.isNotNull()
										.and(S1_T1.xfr_schd_no.eq(S1_T3.xfr_schd_no))
									)
								)
							)
							.leftOuterJoin(S1_T4).on(
								bracket(
									S1_T1.sno1.eq(S1_T4.sno1)
								)
							)
							.leftOuterJoin(S1_T5).on(
								bracket(
									S1_T4.wrk_no.eq(S1_T5.wrk_no)
								)
							)
							.leftOuterJoin(S1_M1).on(
								bracket(
									S1_T1.cntry_org_cd.eq(S1_M1.cntry_cd)
								)
							)
							.leftOuterJoin(S1_M2).on(
								bracket(
									S1_T1.trd_unit_cd.eq(S1_M2.unit_cd)
								)
							)
							.leftOuterJoin(S1_M3).on(
								bracket(
									S1_T1.itm_cd.eq(S1_M3.itm_cd)
									.and(S1_T1.itm_sub1.eq(S1_M3.itm_sub1))
									.and(S1_T1.itm_sub2.eq(S1_M3.itm_sub2))
									.and(S1_T1.itm_sub3.eq(S1_M3.itm_sub3))
									.and(S1_T1.trd_unit_cd.eq(S1_M3.unit_cd))
								)
							)
							.leftOuterJoin(S1_M4).on(
								bracket(
									S1_T2.dlv_id_cd.eq(S1_M4.bp_cd)
								)
							)
							.leftOuterJoin(S1_M5).on(
								bracket(
									S1_T2.dlv_id_cd.eq(S1_M5.loc_cd)
								)
							)
							.leftOuterJoin(S1_M6).on(
								bracket(
									S1_M5.sppl_cd.eq(S1_M6.bp_cd)
								)
							)
							.leftOuterJoin(S1_M7).on(
								bracket(
									S1_T1.itm_cd.eq(S1_M7.itm_cd)
									.and(S1_T1.itm_sub1.eq(S1_M7.itm_sub1))
									.and(S1_T1.itm_sub2.eq(S1_M7.itm_sub2))
									.and(S1_T1.itm_sub3.eq(S1_M7.itm_sub3))
									.and(S1_T1.sno1.eq(S1_M7.sno1))
									.and(S1_T1.sno2.eq(S1_M7.sno2))
									.and(S1_T1.sno3.eq(S1_M7.sno3))
									.and(S1_T1.sno4.eq(S1_M7.sno4))
								)
							)
							.leftOuterJoin(S1_M8).on(
								bracket(
									S1_T1.itm_cd.eq(S1_M8.itm_cd)
									.and(S1_T1.itm_sub1.eq(S1_M8.itm_sub1))
									.and(S1_T1.itm_sub2.eq(S1_M8.itm_sub2))
									.and(S1_T1.itm_sub3.eq(S1_M8.itm_sub3))
								)
							)
						)
						.where(
							value(0).eq(value(0))
							.cutoff$and(S1_T2.iv_no.eq(bind("iv_no")))
							.and(S1_T1.manual_add_flg.eq(value(false)))
							.and(S1_T3.ship_pr_no.isNull().or(S1_T3.ship_inst_typ.neq(value(MAC_SHIP_INST_TYP.NO_PICK.value()))))
						).view(S0_V1)
						.leftOuterJoin(S0_M01).on(
							bracket(
								S0_V1.pr(S1_T1.itm_cd).eq(S0_M01.itm_cd)
								.and(S0_V1.pr(S1_T1.itm_sub1).eq(S0_M01.itm_sub1))
								.and(S0_V1.pr(S1_T1.itm_sub2).eq(S0_M01.itm_sub2))
								.and(S0_V1.pr(S1_T1.itm_sub3).eq(S0_M01.itm_sub3))
								.and(S0_V1.pr("prnt_lcl_cd").eq(S0_M01.lcl_cd))
							)
						)
					)
					.orderBy(S0_V1.pr(S1_T1.disp_seq).asc())
			);
	}
	
	/**
	 * -- MSBEL1750_MST_IV_Query_S01
	 */
	static MCQueryPlan MSBEL1750_MST_IV_S01() {
		MST_IV_R S0_T1 = MST_IV_R.create("T1");
		MAM_BP_R S0_M3 = MAM_BP_R.create("M3");
		MAM_LOC_R S0_M4 = MAM_LOC_R.create("M4");
		MAM_BP_R S0_M5 = MAM_BP_R.create("M5");
		MAM_LOC_R S0_M6 = MAM_LOC_R.create("M6");
		MAM_BP_R S0_M7 = MAM_BP_R.create("M7");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBEL1750_MST_IV_Query_S01")
					.mainQuery()
					.select(
						S0_T1.iv_no,
						S0_T1.iv_src_typ,
						S0_T1.pl_reg_flg,
						S0_T1.non_cmpl_flg,
						S0_T1.pl_skip_flg,
						S0_T1.cmpl_flg,
						S0_T1.pl_prnt_flg,
						S0_T1.dlv_id_typ,
						S0_T1.dlv_id_cd,
						cases()
							.when(S0_T1.dlv_sundry_flg.eq(value(true)))
								.then(S0_T1.dlv_id_nm)
							.when(MSC_DLV_ID_TYP$IS_DLV(S0_T1.dlv_id_typ).eq(value(true)))
								.then(S0_M3.bp_nm)
							.when(MSC_DLV_ID_TYP$IS_LOC(S0_T1.dlv_id_typ).eq(value(true)))
								.then(S0_M4.loc_nm)
							.otherwise(nullValue()).as("dlv_id_nm"),
						S0_T1.dlv_cntry_cd,
						S0_T1.ship_rqst_id_typ,
						S0_T1.ship_rqst_id_cd,
						cases()
							.when(MAC_TRD_PTN_TYP$IS_SLS(S0_T1.trd_ptn_typ).eq(value(true)))
								.then(S0_M5.bp_nm)
							.when(MAC_TRD_PTN_TYP$IS_PROV(S0_T1.trd_ptn_typ).eq(value(true)))
								.then(S0_M5.bp_nm)
							.when(MAC_TRD_PTN_TYP$IS_XFR(S0_T1.trd_ptn_typ).eq(value(true)))
								.then(S0_M6.loc_nm)
							.when(MAC_TRD_PTN_TYP$IS_XFR_RTN(S0_T1.trd_ptn_typ).eq(value(true)))
								.then(S0_M6.loc_nm)
							.otherwise(nullValue()).as("ship_rqst_id_nm"),
						S0_T1.tdlv_cd,
						nvl(
							S0_T1.tdlv_nm,
							S0_M7.bp_nm
						).as("tdlv_nm"),
						S0_T1.trnspt_cd,
						S0_T1.pl_rmrks,
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
						S0_T1.upd_cntr
					)
					.from(
						S0_T1
						.leftOuterJoin(S0_M3).on(
							bracket(
								S0_T1.dlv_id_cd.eq(S0_M3.bp_cd)
							)
						)
						.leftOuterJoin(S0_M4).on(
							bracket(
								S0_T1.dlv_id_cd.eq(S0_M4.loc_cd)
							)
						)
						.leftOuterJoin(S0_M5).on(
							bracket(
								S0_T1.ship_rqst_id_cd.eq(S0_M5.bp_cd)
							)
						)
						.leftOuterJoin(S0_M6).on(
							bracket(
								S0_T1.ship_rqst_id_cd.eq(S0_M6.loc_cd)
							)
						)
						.leftOuterJoin(S0_M7).on(
							bracket(
								S0_T1.tdlv_cd.eq(S0_M7.bp_cd)
							)
						)
					)
					.where(
						value(0).eq(value(0))
						.cutoff$and(S0_T1.iv_no.eq(bind("iv_no")))
					)
			)
			.setJoinInfo(
				joinInfo(
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
					})
				)
			);
	}
	
	/**
	 * -- MSBEL1750_MST_PL_D_Query_S01
	 */
	static MCQueryPlan MSBEL1750_MST_PL_D_S01() {
		MCTempView S0_V1 = createTempView("V1");
		MAM_ITM_LCL_R S0_M01 = MAM_ITM_LCL_R.create("M01");
		MST_PL_D_R S1_T1 = MST_PL_D_R.create("T1");
		MST_IV_R S1_T2 = MST_IV_R.create("T2");
		MST_WRK_SNO_R S1_T3 = MST_WRK_SNO_R.create("T3");
		MST_WRK_R S1_T4 = MST_WRK_R.create("T4");
		MAM_CNTRY_R S1_M1 = MAM_CNTRY_R.create("M1");
		MAM_UNIT_R S1_M2 = MAM_UNIT_R.create("M2");
		MAVM_ITM_UNIT_R S1_M3 = MAVM_ITM_UNIT_R.create("M3");
		MAM_BP_R S1_M4 = MAM_BP_R.create("M4");
		MAM_LOC_R S1_M5 = MAM_LOC_R.create("M5");
		MAM_BP_R S1_M6 = MAM_BP_R.create("M6");
		MAM_SUNDRY_ITM_R S1_M7 = MAM_SUNDRY_ITM_R.create("M7");
		MAM_ITM_R S1_M8 = MAM_ITM_R.create("M8");
		MAM_EX_CNTNR_R S1_M9 = MAM_EX_CNTNR_R.create("M9");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBEL1750_MST_PL_D_Query_S01")
					.mainQuery()
					.select(
						S0_V1.prAll(),
						cases()
							.when(S0_V1.pr(S1_T1.sundry_itm_flg).eq(value(true)))
								.then(S0_V1.pr("sundry_iv_itm_nm"))
							.otherwise(
								nvl(
									S0_M01.itm_nm,
									S0_V1.pr("itm_nm")
								)
							).as("iv_itm_nm")
					)
					.from(
						subQuery()
						.select(
							S1_T1.itm_cd,
							S1_T1.itm_sub1,
							S1_T1.itm_sub2,
							S1_T1.itm_sub3,
							cases()
								.when(S1_T1.sundry_itm_flg.eq(value(true)))
									.then(
										nvl(
											S1_T1.itm_nm,
											S1_M7.itm_nm
										)
								)
								.otherwise(S1_M8.itm_nm).as("itm_nm"),
							nvl(
								S1_T1.iv_itm_nm,
								S1_M7.itm_nm
							).as("sundry_iv_itm_nm"),
							S1_T1.cntry_org_cd,
							S1_M1.cntry_nm.as("cntry_org_nm"),
							S1_T1.trd_unit_cd,
							S1_M2.unit_nm.as("trd_unit_nm"),
							S1_T1.trd_unit_qty,
							S1_M8.stk_mng_typ,
							S1_M8.sno1_mng_typ,
							S1_M8.sno2_mng_typ,
							S1_M8.sno3_mng_typ,
							S1_M8.sno4_mng_typ,
							S1_T1.sno1,
							S1_T1.sno2,
							S1_T1.sno3,
							S1_T1.sno4,
							S1_T3.wrk_no,
							S1_T4.wrk_nm,
							S1_T1.cntnr_cd,
							S1_M9.cntnr_nm,
							S1_T1.cntnr_no_fr,
							S1_T1.cntnr_no_to,
							S1_T1.net_wt,
							S1_T1.grss_wt,
							S1_T1.dim,
							S1_T1.pl_d_rmrks,
							S1_T1.cst_po_no,
							S1_T1.cst_po_d_no,
							S1_T1.cst_itm_cd,
							S1_T1.cst_itm_nm,
							S1_T1.intr_d_rmrks,
							S1_T1.sub_char1,
							S1_T1.sub_char2,
							S1_T1.sub_char3,
							S1_T1.disp_seq,
							S1_M3.dec_place.as("trd_unit_dec_place"),
							S1_T1.sundry_itm_flg,
							cases()
								.when(S1_T2.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.SLS.value())))
									.then(S1_M4.prnt_lcl_cd)
								.when(S1_T2.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.PROV.value())))
									.then(S1_M5.prnt_lcl_cd)
								.when(S1_T2.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.XFR.value())))
									.then(S1_M5.prnt_lcl_cd)
								.when(S1_T2.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.XFR_RTN.value())))
									.then(S1_M5.prnt_lcl_cd)
								.otherwise(nullValue()).as("prnt_lcl_cd")
						)
						.from(
							S1_T1
							.innerJoin(S1_T2).on(
								bracket(
									S1_T1.iv_no.eq(S1_T2.iv_no)
								)
							)
							.leftOuterJoin(S1_T3).on(
								bracket(
									S1_T1.sno1.eq(S1_T3.sno1)
								)
							)
							.leftOuterJoin(S1_T4).on(
								bracket(
									S1_T3.wrk_no.eq(S1_T4.wrk_no)
								)
							)
							.leftOuterJoin(S1_M1).on(
								bracket(
									S1_T1.cntry_org_cd.eq(S1_M1.cntry_cd)
								)
							)
							.leftOuterJoin(S1_M2).on(
								bracket(
									S1_T1.trd_unit_cd.eq(S1_M2.unit_cd)
								)
							)
							.leftOuterJoin(S1_M3).on(
								bracket(
									S1_T1.itm_cd.eq(S1_M3.itm_cd)
									.and(S1_T1.itm_sub1.eq(S1_M3.itm_sub1))
									.and(S1_T1.itm_sub2.eq(S1_M3.itm_sub2))
									.and(S1_T1.itm_sub3.eq(S1_M3.itm_sub3))
									.and(S1_T1.trd_unit_cd.eq(S1_M3.unit_cd))
								)
							)
							.leftOuterJoin(S1_M4).on(
								bracket(
									S1_T2.dlv_id_cd.eq(S1_M4.bp_cd)
								)
							)
							.leftOuterJoin(S1_M5).on(
								bracket(
									S1_T2.dlv_id_cd.eq(S1_M5.loc_cd)
								)
							)
							.leftOuterJoin(S1_M6).on(
								bracket(
									S1_M5.sppl_cd.eq(S1_M6.bp_cd)
								)
							)
							.leftOuterJoin(S1_M7).on(
								bracket(
									S1_T1.itm_cd.eq(S1_M7.itm_cd)
									.and(S1_T1.itm_sub1.eq(S1_M7.itm_sub1))
									.and(S1_T1.itm_sub2.eq(S1_M7.itm_sub2))
									.and(S1_T1.itm_sub3.eq(S1_M7.itm_sub3))
									.and(S1_T1.sno1.eq(S1_M7.sno1))
									.and(S1_T1.sno2.eq(S1_M7.sno2))
									.and(S1_T1.sno3.eq(S1_M7.sno3))
									.and(S1_T1.sno4.eq(S1_M7.sno4))
								)
							)
							.leftOuterJoin(S1_M8).on(
								bracket(
									S1_T1.itm_cd.eq(S1_M8.itm_cd)
									.and(S1_T1.itm_sub1.eq(S1_M8.itm_sub1))
									.and(S1_T1.itm_sub2.eq(S1_M8.itm_sub2))
									.and(S1_T1.itm_sub3.eq(S1_M8.itm_sub3))
								)
							)
							.leftOuterJoin(S1_M9).on(
								bracket(
									S1_T1.cntnr_cd.eq(S1_M9.cntnr_cd)
								)
							)
						)
						.where(
							value(0).eq(value(0))
							.cutoff$and(S1_T1.iv_no.eq(bind("iv_no")))
						).view(S0_V1)
						.leftOuterJoin(S0_M01).on(
							bracket(
								S0_V1.pr(S1_T1.itm_cd).eq(S0_M01.itm_cd)
								.and(S0_V1.pr(S1_T1.itm_sub1).eq(S0_M01.itm_sub1))
								.and(S0_V1.pr(S1_T1.itm_sub2).eq(S0_M01.itm_sub2))
								.and(S0_V1.pr(S1_T1.itm_sub3).eq(S0_M01.itm_sub3))
								.and(S0_V1.pr("prnt_lcl_cd").eq(S0_M01.lcl_cd))
							)
						)
					)
					.orderBy(S0_V1.pr(S1_T1.disp_seq).asc())
			);
	}
}