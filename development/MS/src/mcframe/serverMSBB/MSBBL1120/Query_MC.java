package mcframe.serverMSBB.MSBBL1120;

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
	 * -- MSBBL1120_MST_QTN_D_Query_S01
	 */
	static MCQueryPlan MSBBL1120_MST_QTN_D_S01() {
		MST_QTN_R S0_T1 = MST_QTN_R.create("T1");
		MST_SLO_RSN_R S0_T2 = MST_SLO_RSN_R.create("T2");
		MST_WRK_R S0_T3 = MST_WRK_R.create("T3");
		MST_SLO_RSN_R S0_T4 = MST_SLO_RSN_R.create("T4");
		MST_QTN_D_R S0_T5 = MST_QTN_D_R.create("T5");
		MST_SLO_RSN_R S0_T6 = MST_SLO_RSN_R.create("T6");
		MAM_TRD_R S0_M1 = MAM_TRD_R.create("M1");
		MAM_BP_R S0_M2 = MAM_BP_R.create("M2");
		MAM_USR_R S0_M3 = MAM_USR_R.create("M3");
		MAM_DPT_R S0_M4 = MAM_DPT_R.create("M4");
		MAM_WG_R S0_M5 = MAM_WG_R.create("M5");
		MAM_CUR_R S0_M6 = MAM_CUR_R.create("M6");
		MAM_USR_R S0_M11 = MAM_USR_R.create("M11");
		MAM_ITM_R S0_M12 = MAM_ITM_R.create("M12");
		MAM_STK_GD_R S0_M16 = MAM_STK_GD_R.create("M16");
		MAM_BP_R S0_M19 = MAM_BP_R.create("M19");
		MAM_BP_R S0_M21 = MAM_BP_R.create("M21");
		MAM_BP_R S0_M22 = MAM_BP_R.create("M22");
		MAM_BP_R S0_M23 = MAM_BP_R.create("M23");
		MAM_ITM_TYP_D_R S0_M24 = MAM_ITM_TYP_D_R.create("M24");
		MAM_ITM_LCL_R S0_M25 = MAM_ITM_LCL_R.create("M25");
		MAVM_RD_DPT_R S0_V1 = MAVM_RD_DPT_R.create("V1");
		MAM_BP_GRP_R S0_CST_GRP1 = MAM_BP_GRP_R.create("CST_GRP1");
		MAM_BP_GRP_R S0_CST_GRP2 = MAM_BP_GRP_R.create("CST_GRP2");
		MAM_BP_GRP_R S0_CST_GRP3 = MAM_BP_GRP_R.create("CST_GRP3");
		MAM_BP_GRP_R S0_CST_GRP4 = MAM_BP_GRP_R.create("CST_GRP4");
		MAM_BP_GRP_R S0_CST_GRP5 = MAM_BP_GRP_R.create("CST_GRP5");
		MAM_BP_GRP_R S0_CST_GRP6 = MAM_BP_GRP_R.create("CST_GRP6");
		MAM_BP_GRP_R S0_CST_GRP7 = MAM_BP_GRP_R.create("CST_GRP7");
		MAM_BP_GRP_R S0_CST_GRP8 = MAM_BP_GRP_R.create("CST_GRP8");
		MAM_BP_GRP_R S0_CST_GRP9 = MAM_BP_GRP_R.create("CST_GRP9");
		MAM_BP_GRP_R S0_CST_GRP10 = MAM_BP_GRP_R.create("CST_GRP10");
		MAM_BP_GRP_R S0_DLV_GRP1 = MAM_BP_GRP_R.create("DLV_GRP1");
		MAM_BP_GRP_R S0_DLV_GRP2 = MAM_BP_GRP_R.create("DLV_GRP2");
		MAM_BP_GRP_R S0_DLV_GRP3 = MAM_BP_GRP_R.create("DLV_GRP3");
		MAM_BP_GRP_R S0_DLV_GRP4 = MAM_BP_GRP_R.create("DLV_GRP4");
		MAM_BP_GRP_R S0_DLV_GRP5 = MAM_BP_GRP_R.create("DLV_GRP5");
		MAM_BP_GRP_R S0_DLV_GRP6 = MAM_BP_GRP_R.create("DLV_GRP6");
		MAM_BP_GRP_R S0_DLV_GRP7 = MAM_BP_GRP_R.create("DLV_GRP7");
		MAM_BP_GRP_R S0_DLV_GRP8 = MAM_BP_GRP_R.create("DLV_GRP8");
		MAM_BP_GRP_R S0_DLV_GRP9 = MAM_BP_GRP_R.create("DLV_GRP9");
		MAM_BP_GRP_R S0_DLV_GRP10 = MAM_BP_GRP_R.create("DLV_GRP10");
		MAM_ITM_GRP_R S0_ITM_GRP1 = MAM_ITM_GRP_R.create("ITM_GRP1");
		MAM_ITM_GRP_R S0_ITM_GRP2 = MAM_ITM_GRP_R.create("ITM_GRP2");
		MAM_ITM_GRP_R S0_ITM_GRP3 = MAM_ITM_GRP_R.create("ITM_GRP3");
		MAM_ITM_GRP_R S0_ITM_GRP4 = MAM_ITM_GRP_R.create("ITM_GRP4");
		MAM_ITM_GRP_R S0_ITM_GRP5 = MAM_ITM_GRP_R.create("ITM_GRP5");
		MAM_ITM_GRP_R S0_ITM_GRP6 = MAM_ITM_GRP_R.create("ITM_GRP6");
		MAM_ITM_GRP_R S0_ITM_GRP7 = MAM_ITM_GRP_R.create("ITM_GRP7");
		MAM_ITM_GRP_R S0_ITM_GRP8 = MAM_ITM_GRP_R.create("ITM_GRP8");
		MAM_ITM_GRP_R S0_ITM_GRP9 = MAM_ITM_GRP_R.create("ITM_GRP9");
		MAM_ITM_GRP_R S0_ITM_GRP10 = MAM_ITM_GRP_R.create("ITM_GRP10");
		
		MCDynamicSQLID DS0C_CST_GRP = createDynamicSQLID("DS0C_CST_GRP");
		MCDynamicSQLID DS0C_DLV_GRP = createDynamicSQLID("DS0C_DLV_GRP");
		MCDynamicSQLID DS0C_ITM_GRP = createDynamicSQLID("DS0C_ITM_GRP");
		
		return createQueryPlan()
			.setQuery(
				sql("MSBBL1120_MST_QTN_D_Query_S01")
					.mainQuery()
					.select(
						cases()
							.when(S0_T5.slo_trnst_qty.add(S0_T5.sls_trnst_qty).eq(value(0)))
								.then(value(MSC_QTN_STS_TYP.NON.value()))
							.when(
								bracket(
									S0_T5.slo_trnst_qty.add(S0_T5.sls_trnst_qty)
								).neq(value(0))
								.and(S0_T5.slo_trnst_qty.add(S0_T5.sls_trnst_qty).lt(S0_T5.trd_unit_qty))
							)
								.then(value(MSC_QTN_STS_TYP.PART.value()))
							.when(S0_T5.slo_trnst_qty.add(S0_T5.sls_trnst_qty).eq(S0_T5.trd_unit_qty))
								.then(value(MSC_QTN_STS_TYP.COMPL.value()))
							.otherwise(nullValue()).as("qtn_sts_typ"),
						S0_T1.trd_cd,
						S0_T1.trd_ptn_typ,
						S0_T1.qtn_no,
						S0_T1.qtn_rev,
						S0_T1.qtn_prnt_seq,
						S0_T5.qtn_d_no,
						S0_T1.qtn_dt,
						S0_T1.valid_dt,
						S0_T1.qtn_typ,
						S0_T1.failure_flg,
						S0_T1.can_flg,
						S0_T1.qtn_prnt_flg,
						S0_T1.qtn_prnt_dt,
						S0_T1.aprv_no,
						S0_T1.aprv_sts_typ,
						S0_T1.aprv_flg,
						S0_T1.cst_cd,
						nvl(
							S0_T1.cst_nm,
							S0_M2.bp_nm
						).as("cst_nm"),
						S0_T1.sls_usr_cd,
						S0_T1.sls_dpt_cd,
						S0_M4.dpt_nm.as("sls_dpt_nm"),
						S0_T1.wg_cd,
						S0_T1.trd_cur_cd,
						S0_T1.xrate_inpt_flg,
						S0_T1.xrate,
						S0_T1.qtn_term_cd,
						S0_T1.trnspt_cd,
						S0_T1.tterm_cd1,
						S0_T1.tterm_rmrks1,
						S0_T1.tterm_cd2,
						S0_T1.tterm_rmrks2,
						S0_T1.tterm_cd3,
						S0_T1.tterm_rmrks3,
						S0_T1.wrk_no,
						S0_T1.cst_qtn_rqst_no,
						S0_T1.rcpt_dt,
						S0_T1.rcpt_usr_cd,
						S0_T1.qtn_rmrks,
						S0_T1.intr_rmrks,
						S0_T1.qtn_rslt_rsn_cd,
						S0_T1.qtn_rslt_rsn_rmrks,
						S0_T1.sub_char1.as("qtn_sub_char1"),
						S0_T1.sub_char2.as("qtn_sub_char2"),
						S0_T1.sub_char3.as("qtn_sub_char3"),
						S0_T5.itm_cd,
						S0_T5.itm_sub1,
						S0_T5.itm_sub2,
						S0_T5.itm_sub3,
						nvl(
							S0_T5.itm_nm,
							S0_M12.itm_nm
						).as("itm_nm"),
						S0_M12.asset_mng_typ,
						S0_T5.sundry_itm_flg,
						decode(
							S0_M12.sundry_itm_flg,
							value(true),
							S0_T5.iv_itm_nm,
							nvl(
								S0_M25.itm_nm,
								S0_M12.itm_nm
							)
						).as("iv_itm_nm"),
						S0_T5.cntry_org_cd,
						S0_T5.trd_unit_qty,
						S0_T5.trd_unit_cd,
						S0_T5.base_unit_cd,
						S0_T5.base_unit_qty,
						S0_T5.gd_cd,
						S0_T5.sno1,
						S0_T5.sno2,
						S0_T5.sno3,
						S0_T5.sno4,
						S0_T5.interim_flg,
						S0_T5.trd_cur_std_sls_upri,
						S0_T5.trd_cur_std_sls_amt,
						bracket(
							S0_T5.trd_cur_std_sls_amt.add(S0_T5.trd_cur_std_sls_tax_amt)
						).as("trd_cur_std_sls_inc_tax_amt"),
						S0_T5.upri_rate,
						S0_T5.trd_cur_upri,
						S0_T5.trd_cur_amt,
						bracket(
							S0_T5.trd_cur_amt.add(S0_T5.trd_cur_tax_amt)
						).as("trd_cur_inc_tax_amt"),
						S0_T5.trd_cur_dscnt_amt,
						S0_T5.dscnt_rsn_cd,
						S0_T5.tax_fix_flg,
						S0_T5.tax_cd,
						S0_T5.trd_cur_std_sls_tax_amt,
						S0_T5.trd_cur_tax_amt,
						S0_T5.set_itm_grp_no,
						S0_T5.cst_itm_cd,
						S0_T5.cst_itm_nm,
						S0_T5.dlv_cd,
						nvl(
							S0_T5.dlv_nm,
							S0_M19.bp_nm
						).as("dlv_nm"),
						S0_T5.dlv_sundry_flg,
						S0_T5.dlv_zip_cd,
						S0_T5.dlv_addr1,
						S0_T5.dlv_addr2,
						S0_T5.dlv_addr3,
						S0_T5.dlv_addr4,
						S0_T5.dlv_cntct_dpt,
						S0_T5.dlv_cntct_psn,
						S0_T5.dlv_tel,
						S0_T5.dlv_fax,
						S0_M19.cntry_cd.as("dlv_cntry_cd"),
						S0_T5.dest_cd1,
						S0_T5.dest_cd2,
						S0_T5.dest_cd3,
						S0_T5.qtn_d_rmrks,
						S0_T5.intr_rmrks.as("intr_d_rmrks"),
						S0_T5.qtn_d_rslt_rsn_cd,
						S0_T5.qtn_d_rslt_rsn_rmrks,
						S0_T5.slo_trnst_qty,
						S0_T5.sls_trnst_qty,
						S0_T5.sub_char1.as("qtn_d_sub_char1"),
						S0_T5.sub_char2.as("qtn_d_sub_char2"),
						S0_T5.sub_char3.as("qtn_d_sub_char3"),
						S0_T5.disp_seq,
						S0_T1.ins_usr_id,
						S0_T1.ins_usr_nm,
						S0_T1.ins_ts,
						S0_T1.ins_func_id,
						S0_T5.upd_cntr,
						S0_T5.upd_usr_id,
						S0_T5.upd_usr_nm,
						S0_T5.upd_ts,
						S0_T5.upd_func_id,
						S0_T5.upd_srv_req_no,
						S0_T1.qtn_prnt_seq,
						addDynamicSelect(DS0C_CST_GRP),
						addDynamicSelect(DS0C_DLV_GRP),
						addDynamicSelect(DS0C_ITM_GRP)
					)
					.from(
						S0_T1
						.innerJoin(S0_T5).on(
							bracket(
								S0_T5.qtn_no.eq(S0_T1.qtn_no)
								.and(S0_T5.qtn_rev.eq(S0_T1.qtn_rev))
							)
						)
						.leftOuterJoin(S0_M2).on(
							bracket(
								S0_T1.cst_cd.eq(S0_M2.bp_cd)
							)
						)
						.leftOuterJoin(S0_M4).on(
							bracket(
								S0_T1.sls_dpt_cd.eq(S0_M4.dpt_cd)
								.and(S0_T1.qtn_dt.between(S0_M4.st_dt, S0_M4.end_dt))
							)
						)
						.leftOuterJoin(S0_M12).on(
							bracket(
								S0_T5.itm_cd.eq(S0_M12.itm_cd)
								.and(S0_T5.itm_sub1.eq(S0_M12.itm_sub1))
								.and(S0_T5.itm_sub2.eq(S0_M12.itm_sub2))
								.and(S0_T5.itm_sub3.eq(S0_M12.itm_sub3))
							)
						)
						.leftOuterJoin(S0_M19).on(
							bracket(
								S0_T5.dlv_cd.eq(S0_M19.bp_cd)
							)
						)
						.leftOuterJoin(S0_M25).on(
							bracket(
								S0_M25.itm_cd.eq(S0_T5.itm_cd)
								.and(S0_M25.itm_sub1.eq(S0_T5.itm_sub1))
								.and(S0_M25.itm_sub2.eq(S0_T5.itm_sub2))
								.and(S0_M25.itm_sub3.eq(S0_T5.itm_sub3))
								.and(S0_M25.lcl_cd.eq(S0_M19.prnt_lcl_cd))
							)
						)
						.innerJoin(S0_V1).on(
							bracket(
								S0_T1.sls_dpt_cd.eq(S0_V1.dpt_cd)
							)
						)
						.addDynamicView()
						.addDynamicView(DS0C_CST_GRP)
						.addDynamicView(DS0C_DLV_GRP)
						.addDynamicView(DS0C_ITM_GRP)
					)
					.where(
						value(0).eq(value(0))
						.and(
							bracket(
								bind("creating").eq(value(true))
								.and(
									S0_T1.qtn_typ.in(
										value(MSC_QTN_TYP.CREATING.value())
									)
								)
							)
							.or(
								bind("pre_qtn").eq(value(true))
								.and(
									S0_T1.qtn_typ.in(
										value(MSC_QTN_TYP.PRE_QTN.value())
									)
								)
							)
							.or(
								bind("qtn").eq(value(true))
								.and(
									S0_T1.qtn_typ.in(
										value(MSC_QTN_TYP.QTN.value())
									)
								)
							)
						)
						.and(
							bracket(
								bind("non").eq(value(true))
								.and(S0_T5.slo_trnst_qty.add(S0_T5.sls_trnst_qty).eq(value(0)))
							)
							.or(
								bind("part").eq(value(true))
								.and(S0_T5.slo_trnst_qty.add(S0_T5.sls_trnst_qty).neq(value(0)))
								.and(S0_T5.slo_trnst_qty.add(S0_T5.sls_trnst_qty).lt(S0_T5.trd_unit_qty))
							)
							.or(
								bind("compl").eq(value(true))
								.and(S0_T5.slo_trnst_qty.add(S0_T5.sls_trnst_qty).eq(S0_T5.trd_unit_qty))
							)
						)
						.and(
							bracket(
								bind("opn").eq(value(true))
								.and(
									S0_T1.aprv_sts_typ.in(
										value(MAC_APRV_STS_TYP.OPN.value())
									)
								)
							)
							.or(
								bind("fix").eq(value(true))
								.and(
									S0_T1.aprv_sts_typ.in(
										value(MAC_APRV_STS_TYP.FIX.value())
									)
								)
							)
							.or(
								bind("acpt").eq(value(true))
								.and(
									S0_T1.aprv_sts_typ.in(
										value(MAC_APRV_STS_TYP.ACPT.value())
									)
								)
							)
							.or(
								bind("rjct").eq(value(true))
								.and(
									S0_T1.aprv_sts_typ.in(
										value(MAC_APRV_STS_TYP.RJCT.value())
									)
								)
							)
							.or(
								bind("last_rjct").eq(value(true))
								.and(
									S0_T1.aprv_sts_typ.in(
										value(MAC_APRV_STS_TYP.LAST_RJCT.value())
									)
								)
							)
							.or(
								bind("excld").eq(value(true))
								.and(S0_T1.aprv_sts_typ.isNull())
							)
						)
						.and(
							bracket(
								bind("yet").eq(value(true))
								.and(S0_T1.qtn_prnt_flg.eq(value(false)))
							)
							.or(
								bind("prnt").eq(value(true))
								.and(S0_T1.qtn_prnt_flg.eq(value(true)))
							)
						)
						.and(
							bracket(
								bind("iv_trgt_flg").eq(value(true))
								.and(S0_M2.cst_iv_flg.eq(value(true)))
							)
							.or(
								bind("iv_not_trgt_flg").eq(value(true))
								.and(S0_M2.cst_iv_flg.eq(value(false)))
							)
						)
						.cutoff$and(S0_T1.qtn_dt.gte(bind("qtn_dt_fr")))
						.cutoff$and(S0_T1.qtn_dt.lte(bind("qtn_dt_to")))
						.cutoff$and(S0_T1.valid_dt.gte(bind("valid_dt_fr")))
						.cutoff$and(S0_T1.valid_dt.lte(bind("valid_dt_to")))
						.cutoff$and(S0_T1.rcpt_dt.gte(bind("rcpt_dt_fr")))
						.cutoff$and(S0_T1.rcpt_dt.lte(bind("rcpt_dt_to")))
						.cutoff$and(S0_T5.dlv_cd.like(bind("dlv_cd")))
						.cutoff$and(
							nvl(
								S0_T5.dlv_nm,
								S0_M19.bp_nm
							).like(bind("dlv_nm"))
						)
						.cutoff$and(S0_T5.dest_cd1.like(bind("dest_cd1")))
						.addDynamicPredicate()
						.cutoff$and(S0_T5.dest_cd2.like(bind("dest_cd2")))
						.cutoff$and(S0_T5.dest_cd3.like(bind("dest_cd3")))
						.cutoff$and(S0_T1.cst_cd.like(bind("cst_cd")))
						.cutoff$and(
							nvl(
								S0_T1.cst_nm,
								S0_M2.bp_nm
							).like(bind("cst_nm"))
						)
						.cutoff$and(S0_M12.itm_typ.like(bind("itm_typ")))
						.cutoff$and(S0_M12.itm_typ_d_cd.like(bind("itm_typ_d_cd")))
						.cutoff$and(S0_T5.itm_cd.like(bind("itm_cd")))
						.cutoff$and(S0_T5.itm_sub1.like(bind("itm_sub1")))
						.cutoff$and(S0_T5.itm_sub2.like(bind("itm_sub2")))
						.cutoff$and(S0_T5.itm_sub3.like(bind("itm_sub3")))
						.cutoff$and(
							nvl(
								S0_T5.itm_nm,
								S0_M12.itm_nm
							).like(bind("itm_nm"))
						)
						.cutoff$and(S0_T5.sno1.like(bind("sno1")))
						.cutoff$and(S0_T5.sno2.like(bind("sno2")))
						.cutoff$and(S0_T5.sno3.like(bind("sno3")))
						.cutoff$and(S0_T5.sno4.like(bind("sno4")))
						.cutoff$and(S0_T1.wrk_no.like(bind("wrk_no")))
						.cutoff$and(S0_T1.sls_usr_cd.like(bind("sls_usr_cd")))
						.cutoff$and(S0_T1.sls_dpt_cd.like(bind("sls_dpt_cd")))
						.cutoff$and(S0_M4.dpt_nm.like(bind("sls_dpt_nm")))
						.cutoff$and(S0_T1.wg_cd.like(bind("wg_cd")))
						.cutoff$and(S0_T1.qtn_rmrks.like(bind("qtn_rmrks")))
						.cutoff$and(S0_T5.qtn_d_rmrks.like(bind("qtn_d_rmrks")))
						.cutoff$and(S0_T1.intr_rmrks.like(bind("intr_rmrks")))
						.cutoff$and(S0_T5.intr_rmrks.like(bind("intr_d_rmrks")))
						.cutoff$and(S0_T1.trd_cd.like(bind("trd_cd")))
						.cutoff$and(S0_T1.qtn_no.like(bind("qtn_no")))
						.cutoff$and(S0_T1.qtn_rev.eq(bind("qtn_rev")))
						.cutoff$and(S0_T1.trd_cur_cd.like(bind("trd_cur_cd")))
						.cutoff$and(S0_T1.cst_qtn_rqst_no.like(bind("cst_qtn_rqst_no")))
						.cutoff$and(S0_T5.cst_qtn_rqst_d_no.like(bind("cst_qtn_rqst_d_no")))
						.cutoff$and(S0_T5.cst_itm_cd.like(bind("cst_itm_cd")))
						.cutoff$and(S0_T5.cst_itm_nm.like(bind("cst_itm_nm")))
						.cutoff$and(S0_T5.gd_cd.like(bind("gd_cd")))
						.cutoff$and(S0_T1.qtn_rslt_rsn_cd.like(bind("qtn_rslt_rsn_cd")))
						.cutoff$and(S0_T5.qtn_d_rslt_rsn_cd.like(bind("qtn_d_rslt_rsn_cd")))
						.cutoff$and(S0_T1.qtn_term_cd.like(bind("qtn_term_cd")))
						.cutoff$and(S0_T1.rcpt_usr_cd.like(bind("rcpt_usr_cd")))
						.cutoff$and(S0_T1.sub_char1.like(bind("qtn_sub_char1")))
						.cutoff$and(S0_T1.sub_char2.like(bind("qtn_sub_char2")))
						.cutoff$and(S0_T1.sub_char3.like(bind("qtn_sub_char3")))
						.cutoff$and(S0_T5.sub_char1.like(bind("qtn_d_sub_char1")))
						.cutoff$and(S0_T5.sub_char2.like(bind("qtn_d_sub_char2")))
						.cutoff$and(S0_T5.sub_char3.like(bind("qtn_d_sub_char3")))
						.and(
							bracket(
								bind("inc_failure_flg").eq(value(false))
								.and(S0_T1.failure_flg.eq(value(false)))
							)
							.or(bind("inc_failure_flg").eq(value(true)))
						)
						.and(
							bracket(
								bind("inc_can_flg").eq(value(false))
								.and(S0_T1.can_flg.eq(value(false)))
							)
							.or(bind("inc_can_flg").eq(value(true)))
						)
						.addDynamicPredicate(DS0C_CST_GRP)
						.addDynamicPredicate(DS0C_DLV_GRP)
						.addDynamicPredicate(DS0C_ITM_GRP)
					)
					.orderBy(
						S0_T1.qtn_no.asc(),
						S0_T1.qtn_rev.asc(),
						S0_T5.disp_seq.asc()
					)
			)
			.setDynamicSQLInfo(
				when(boundOr("qtn_term_nm"))
					.view(v -> v.leftOuterJoin(S0_T2).on(bracket(S0_T1.qtn_term_cd.eq(S0_T2.slo_rsn_cd))))
					.predicate(p -> p.cutoff$and(S0_T2.slo_rsn_nm.like(bind("qtn_term_nm")))),
				when(boundOr("wrk_nm"))
					.view(v -> v.leftOuterJoin(S0_T3).on(bracket(S0_T1.wrk_no.eq(S0_T3.wrk_no))))
					.predicate(p -> p.cutoff$and(S0_T3.wrk_nm.like(bind("wrk_nm")))),
				when(boundOr("qtn_rslt_rsn_nm"))
					.view(v -> v.leftOuterJoin(S0_T4).on(bracket(S0_T1.qtn_rslt_rsn_cd.eq(S0_T4.slo_rsn_cd))))
					.predicate(p -> p.cutoff$and(S0_T4.slo_rsn_nm.like(bind("qtn_rslt_rsn_nm")))),
				when(boundOr("qtn_d_rslt_rsn_nm"))
					.view(v -> v.leftOuterJoin(S0_T6).on(bracket(S0_T5.qtn_d_rslt_rsn_cd.eq(S0_T6.slo_rsn_cd))))
					.predicate(p -> p.cutoff$and(S0_T6.slo_rsn_nm.like(bind("qtn_d_rslt_rsn_nm")))),
				when(boundOr("trd_nm"))
					.view(v -> v.leftOuterJoin(S0_M1).on(bracket(S0_T1.trd_cd.eq(S0_M1.trd_cd))))
					.predicate(p -> p.cutoff$and(S0_M1.trd_nm.like(bind("trd_nm")))),
				when(boundOr("sls_usr_nm"))
					.view(v -> v.leftOuterJoin(S0_M3).on(bracket(S0_T1.sls_usr_cd.eq(S0_M3.usr_cd))))
					.predicate(p -> p.cutoff$and(S0_M3.usr_nm.like(bind("sls_usr_nm")))),
				when(boundOr("wg_nm"))
					.view(v -> v.leftOuterJoin(S0_M5).on(bracket(S0_T1.wg_cd.eq(S0_M5.wg_cd))))
					.predicate(p -> p.cutoff$and(S0_M5.wg_nm.like(bind("wg_nm")))),
				when(boundOr("trd_cur_nm"))
					.view(v -> v.leftOuterJoin(S0_M6).on(bracket(S0_T1.trd_cur_cd.eq(S0_M6.cur_cd))))
					.predicate(p -> p.cutoff$and(S0_M6.cur_nm.like(bind("trd_cur_nm")))),
				when(boundOr("rcpt_usr_nm"))
					.view(v -> v.leftOuterJoin(S0_M11).on(bracket(S0_T1.rcpt_usr_cd.eq(S0_M11.usr_cd))))
					.predicate(p -> p.cutoff$and(S0_M11.usr_nm.like(bind("rcpt_usr_nm")))),
				when(boundOr("gd_nm"))
					.view(v -> v.leftOuterJoin(S0_M16).on(bracket(S0_T5.gd_cd.eq(S0_M16.gd_cd))))
					.predicate(p -> p.cutoff$and(S0_M16.gd_nm.like(bind("gd_nm")))),
				when(boundOr("dest_nm1"))
					.view(v -> v.leftOuterJoin(S0_M21).on(bracket(S0_T5.dest_cd1.eq(S0_M21.bp_cd))))
					.predicate(p -> p.cutoff$and(S0_M21.bp_nm.like(bind("dest_nm1")))),
				when(boundOr("dest_nm2"))
					.view(v -> v.leftOuterJoin(S0_M22).on(bracket(S0_T5.dest_cd2.eq(S0_M22.bp_cd))))
					.predicate(p -> p.cutoff$and(S0_M22.bp_nm.like(bind("dest_nm2")))),
				when(boundOr("dest_nm3"))
					.view(v -> v.leftOuterJoin(S0_M23).on(bracket(S0_T5.dest_cd3.eq(S0_M23.bp_cd))))
					.predicate(p -> p.cutoff$and(S0_M23.bp_nm.like(bind("dest_nm3")))),
				when(boundOr("itm_typ_d_nm"))
					.view(v -> v.leftOuterJoin(S0_M24).on(bracket(S0_M12.itm_typ.eq(S0_M24.itm_typ).and(S0_M12.itm_typ_d_cd.eq(S0_M24.itm_typ_d_cd)))))
					.predicate(p -> p.cutoff$and(S0_M24.itm_typ_d_nm.like(bind("itm_typ_d_nm")))),
				when(boundOr("cst_grp_flg1"))
					.select(DS0C_CST_GRP, S0_M2.bp_grp_cd1.as("cst_grp_cd1"), S0_CST_GRP1.bp_grp_nm.as("cst_grp_nm1"))
					.view(DS0C_CST_GRP, v -> v.leftOuterJoin(S0_CST_GRP1).on(S0_M2.bp_grp_cd1.eq(S0_CST_GRP1.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP1.value()).eq(S0_CST_GRP1.bp_grp_typ))))
					.predicate(DS0C_CST_GRP, p -> p.cutoff$and(S0_M2.bp_grp_cd1.like(bind("cst_grp_cd1"))).cutoff$and(S0_CST_GRP1.bp_grp_nm.like(bind("cst_grp_nm1")))),
				when(boundOr("cst_grp_flg2"))
					.select(DS0C_CST_GRP, S0_M2.bp_grp_cd2.as("cst_grp_cd2"), S0_CST_GRP2.bp_grp_nm.as("cst_grp_nm2"))
					.view(DS0C_CST_GRP, v -> v.leftOuterJoin(S0_CST_GRP2).on(S0_M2.bp_grp_cd2.eq(S0_CST_GRP2.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP2.value()).eq(S0_CST_GRP2.bp_grp_typ))))
					.predicate(DS0C_CST_GRP, p -> p.cutoff$and(S0_M2.bp_grp_cd2.like(bind("cst_grp_cd2"))).cutoff$and(S0_CST_GRP2.bp_grp_nm.like(bind("cst_grp_nm2")))),
				when(boundOr("cst_grp_flg3"))
					.select(DS0C_CST_GRP, S0_M2.bp_grp_cd3.as("cst_grp_cd3"), S0_CST_GRP3.bp_grp_nm.as("cst_grp_nm3"))
					.view(DS0C_CST_GRP, v -> v.leftOuterJoin(S0_CST_GRP3).on(S0_M2.bp_grp_cd3.eq(S0_CST_GRP3.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP3.value()).eq(S0_CST_GRP3.bp_grp_typ))))
					.predicate(DS0C_CST_GRP, p -> p.cutoff$and(S0_M2.bp_grp_cd3.like(bind("cst_grp_cd3"))).cutoff$and(S0_CST_GRP3.bp_grp_nm.like(bind("cst_grp_nm3")))),
				when(boundOr("cst_grp_flg4"))
					.select(DS0C_CST_GRP, S0_M2.bp_grp_cd4.as("cst_grp_cd4"), S0_CST_GRP4.bp_grp_nm.as("cst_grp_nm4"))
					.view(DS0C_CST_GRP, v -> v.leftOuterJoin(S0_CST_GRP4).on(S0_M2.bp_grp_cd4.eq(S0_CST_GRP4.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP4.value()).eq(S0_CST_GRP4.bp_grp_typ))))
					.predicate(DS0C_CST_GRP, p -> p.cutoff$and(S0_M2.bp_grp_cd4.like(bind("cst_grp_cd4"))).cutoff$and(S0_CST_GRP4.bp_grp_nm.like(bind("cst_grp_nm4")))),
				when(boundOr("cst_grp_flg5"))
					.select(DS0C_CST_GRP, S0_M2.bp_grp_cd5.as("cst_grp_cd5"), S0_CST_GRP5.bp_grp_nm.as("cst_grp_nm5"))
					.view(DS0C_CST_GRP, v -> v.leftOuterJoin(S0_CST_GRP5).on(S0_M2.bp_grp_cd5.eq(S0_CST_GRP5.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP5.value()).eq(S0_CST_GRP5.bp_grp_typ))))
					.predicate(DS0C_CST_GRP, p -> p.cutoff$and(S0_M2.bp_grp_cd5.like(bind("cst_grp_cd5"))).cutoff$and(S0_CST_GRP5.bp_grp_nm.like(bind("cst_grp_nm5")))),
				when(boundOr("cst_grp_flg6"))
					.select(DS0C_CST_GRP, S0_M2.bp_grp_cd6.as("cst_grp_cd6"), S0_CST_GRP6.bp_grp_nm.as("cst_grp_nm6"))
					.view(DS0C_CST_GRP, v -> v.leftOuterJoin(S0_CST_GRP6).on(S0_M2.bp_grp_cd6.eq(S0_CST_GRP6.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP6.value()).eq(S0_CST_GRP6.bp_grp_typ))))
					.predicate(DS0C_CST_GRP, p -> p.cutoff$and(S0_M2.bp_grp_cd6.like(bind("cst_grp_cd6"))).cutoff$and(S0_CST_GRP6.bp_grp_nm.like(bind("cst_grp_nm6")))),
				when(boundOr("cst_grp_flg7"))
					.select(DS0C_CST_GRP, S0_M2.bp_grp_cd7.as("cst_grp_cd7"), S0_CST_GRP7.bp_grp_nm.as("cst_grp_nm7"))
					.view(DS0C_CST_GRP, v -> v.leftOuterJoin(S0_CST_GRP7).on(S0_M2.bp_grp_cd7.eq(S0_CST_GRP7.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP7.value()).eq(S0_CST_GRP7.bp_grp_typ))))
					.predicate(DS0C_CST_GRP, p -> p.cutoff$and(S0_M2.bp_grp_cd7.like(bind("cst_grp_cd7"))).cutoff$and(S0_CST_GRP7.bp_grp_nm.like(bind("cst_grp_nm7")))),
				when(boundOr("cst_grp_flg8"))
					.select(DS0C_CST_GRP, S0_M2.bp_grp_cd8.as("cst_grp_cd8"), S0_CST_GRP8.bp_grp_nm.as("cst_grp_nm8"))
					.view(DS0C_CST_GRP, v -> v.leftOuterJoin(S0_CST_GRP8).on(S0_M2.bp_grp_cd8.eq(S0_CST_GRP8.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP8.value()).eq(S0_CST_GRP8.bp_grp_typ))))
					.predicate(DS0C_CST_GRP, p -> p.cutoff$and(S0_M2.bp_grp_cd8.like(bind("cst_grp_cd8"))).cutoff$and(S0_CST_GRP8.bp_grp_nm.like(bind("cst_grp_nm8")))),
				when(boundOr("cst_grp_flg9"))
					.select(DS0C_CST_GRP, S0_M2.bp_grp_cd9.as("cst_grp_cd9"), S0_CST_GRP9.bp_grp_nm.as("cst_grp_nm9"))
					.view(DS0C_CST_GRP, v -> v.leftOuterJoin(S0_CST_GRP9).on(S0_M2.bp_grp_cd9.eq(S0_CST_GRP9.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP9.value()).eq(S0_CST_GRP9.bp_grp_typ))))
					.predicate(DS0C_CST_GRP, p -> p.cutoff$and(S0_M2.bp_grp_cd9.like(bind("cst_grp_cd9"))).cutoff$and(S0_CST_GRP9.bp_grp_nm.like(bind("cst_grp_nm9")))),
				when(boundOr("cst_grp_flg10"))
					.select(DS0C_CST_GRP, S0_M2.bp_grp_cd10.as("cst_grp_cd10"), S0_CST_GRP10.bp_grp_nm.as("cst_grp_nm10"))
					.view(DS0C_CST_GRP, v -> v.leftOuterJoin(S0_CST_GRP10).on(S0_M2.bp_grp_cd10.eq(S0_CST_GRP10.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP10.value()).eq(S0_CST_GRP10.bp_grp_typ))))
					.predicate(DS0C_CST_GRP, p -> p.cutoff$and(S0_M2.bp_grp_cd10.like(bind("cst_grp_cd10"))).cutoff$and(S0_CST_GRP10.bp_grp_nm.like(bind("cst_grp_nm10")))),
				when(boundOr("dlv_grp_flg1"))
					.select(DS0C_DLV_GRP, S0_M19.bp_grp_cd1.as("dlv_grp_cd1"), S0_DLV_GRP1.bp_grp_nm.as("dlv_grp_nm1"))
					.view(DS0C_DLV_GRP, v -> v.leftOuterJoin(S0_DLV_GRP1).on(S0_M19.bp_grp_cd1.eq(S0_DLV_GRP1.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP1.value()).eq(S0_DLV_GRP1.bp_grp_typ))))
					.predicate(DS0C_DLV_GRP, p -> p.cutoff$and(S0_M19.bp_grp_cd1.like(bind("dlv_grp_cd1"))).cutoff$and(S0_DLV_GRP1.bp_grp_nm.like(bind("dlv_grp_nm1")))),
				when(boundOr("dlv_grp_flg2"))
					.select(DS0C_DLV_GRP, S0_M19.bp_grp_cd2.as("dlv_grp_cd2"), S0_DLV_GRP2.bp_grp_nm.as("dlv_grp_nm2"))
					.view(DS0C_DLV_GRP, v -> v.leftOuterJoin(S0_DLV_GRP2).on(S0_M19.bp_grp_cd2.eq(S0_DLV_GRP2.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP2.value()).eq(S0_DLV_GRP2.bp_grp_typ))))
					.predicate(DS0C_DLV_GRP, p -> p.cutoff$and(S0_M19.bp_grp_cd2.like(bind("dlv_grp_cd2"))).cutoff$and(S0_DLV_GRP2.bp_grp_nm.like(bind("dlv_grp_nm2")))),
				when(boundOr("dlv_grp_flg3"))
					.select(DS0C_DLV_GRP, S0_M19.bp_grp_cd3.as("dlv_grp_cd3"), S0_DLV_GRP3.bp_grp_nm.as("dlv_grp_nm3"))
					.view(DS0C_DLV_GRP, v -> v.leftOuterJoin(S0_DLV_GRP3).on(S0_M19.bp_grp_cd3.eq(S0_DLV_GRP3.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP3.value()).eq(S0_DLV_GRP3.bp_grp_typ))))
					.predicate(DS0C_DLV_GRP, p -> p.cutoff$and(S0_M19.bp_grp_cd3.like(bind("dlv_grp_cd3"))).cutoff$and(S0_DLV_GRP3.bp_grp_nm.like(bind("dlv_grp_nm3")))),
				when(boundOr("dlv_grp_flg4"))
					.select(DS0C_DLV_GRP, S0_M19.bp_grp_cd4.as("dlv_grp_cd4"), S0_DLV_GRP4.bp_grp_nm.as("dlv_grp_nm4"))
					.view(DS0C_DLV_GRP, v -> v.leftOuterJoin(S0_DLV_GRP4).on(S0_M19.bp_grp_cd4.eq(S0_DLV_GRP4.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP4.value()).eq(S0_DLV_GRP4.bp_grp_typ))))
					.predicate(DS0C_DLV_GRP, p -> p.cutoff$and(S0_M19.bp_grp_cd4.like(bind("dlv_grp_cd4"))).cutoff$and(S0_DLV_GRP4.bp_grp_nm.like(bind("dlv_grp_nm4")))),
				when(boundOr("dlv_grp_flg5"))
					.select(DS0C_DLV_GRP, S0_M19.bp_grp_cd5.as("dlv_grp_cd5"), S0_DLV_GRP5.bp_grp_nm.as("dlv_grp_nm5"))
					.view(DS0C_DLV_GRP, v -> v.leftOuterJoin(S0_DLV_GRP5).on(S0_M19.bp_grp_cd5.eq(S0_DLV_GRP5.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP5.value()).eq(S0_DLV_GRP5.bp_grp_typ))))
					.predicate(DS0C_DLV_GRP, p -> p.cutoff$and(S0_M19.bp_grp_cd5.like(bind("dlv_grp_cd5"))).cutoff$and(S0_DLV_GRP5.bp_grp_nm.like(bind("dlv_grp_nm5")))),
				when(boundOr("dlv_grp_flg6"))
					.select(DS0C_DLV_GRP, S0_M19.bp_grp_cd6.as("dlv_grp_cd6"), S0_DLV_GRP6.bp_grp_nm.as("dlv_grp_nm6"))
					.view(DS0C_DLV_GRP, v -> v.leftOuterJoin(S0_DLV_GRP6).on(S0_M19.bp_grp_cd6.eq(S0_DLV_GRP6.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP6.value()).eq(S0_DLV_GRP6.bp_grp_typ))))
					.predicate(DS0C_DLV_GRP, p -> p.cutoff$and(S0_M19.bp_grp_cd6.like(bind("dlv_grp_cd6"))).cutoff$and(S0_DLV_GRP6.bp_grp_nm.like(bind("dlv_grp_nm6")))),
				when(boundOr("dlv_grp_flg7"))
					.select(DS0C_DLV_GRP, S0_M19.bp_grp_cd7.as("dlv_grp_cd7"), S0_DLV_GRP7.bp_grp_nm.as("dlv_grp_nm7"))
					.view(DS0C_DLV_GRP, v -> v.leftOuterJoin(S0_DLV_GRP7).on(S0_M19.bp_grp_cd7.eq(S0_DLV_GRP7.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP7.value()).eq(S0_DLV_GRP7.bp_grp_typ))))
					.predicate(DS0C_DLV_GRP, p -> p.cutoff$and(S0_M19.bp_grp_cd7.like(bind("dlv_grp_cd7"))).cutoff$and(S0_DLV_GRP7.bp_grp_nm.like(bind("dlv_grp_nm7")))),
				when(boundOr("dlv_grp_flg8"))
					.select(DS0C_DLV_GRP, S0_M19.bp_grp_cd8.as("dlv_grp_cd8"), S0_DLV_GRP8.bp_grp_nm.as("dlv_grp_nm8"))
					.view(DS0C_DLV_GRP, v -> v.leftOuterJoin(S0_DLV_GRP8).on(S0_M19.bp_grp_cd8.eq(S0_DLV_GRP8.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP8.value()).eq(S0_DLV_GRP8.bp_grp_typ))))
					.predicate(DS0C_DLV_GRP, p -> p.cutoff$and(S0_M19.bp_grp_cd8.like(bind("dlv_grp_cd8"))).cutoff$and(S0_DLV_GRP8.bp_grp_nm.like(bind("dlv_grp_nm8")))),
				when(boundOr("dlv_grp_flg9"))
					.select(DS0C_DLV_GRP, S0_M19.bp_grp_cd9.as("dlv_grp_cd9"), S0_DLV_GRP9.bp_grp_nm.as("dlv_grp_nm9"))
					.view(DS0C_DLV_GRP, v -> v.leftOuterJoin(S0_DLV_GRP9).on(S0_M19.bp_grp_cd9.eq(S0_DLV_GRP9.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP9.value()).eq(S0_DLV_GRP9.bp_grp_typ))))
					.predicate(DS0C_DLV_GRP, p -> p.cutoff$and(S0_M19.bp_grp_cd9.like(bind("dlv_grp_cd9"))).cutoff$and(S0_DLV_GRP9.bp_grp_nm.like(bind("dlv_grp_nm9")))),
				when(boundOr("dlv_grp_flg10"))
					.select(DS0C_DLV_GRP, S0_M19.bp_grp_cd10.as("dlv_grp_cd10"), S0_DLV_GRP10.bp_grp_nm.as("dlv_grp_nm10"))
					.view(DS0C_DLV_GRP, v -> v.leftOuterJoin(S0_DLV_GRP10).on(S0_M19.bp_grp_cd10.eq(S0_DLV_GRP10.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP10.value()).eq(S0_DLV_GRP10.bp_grp_typ))))
					.predicate(DS0C_DLV_GRP, p -> p.cutoff$and(S0_M19.bp_grp_cd10.like(bind("dlv_grp_cd10"))).cutoff$and(S0_DLV_GRP10.bp_grp_nm.like(bind("dlv_grp_nm10")))),
				when(boundOr("itm_grp_flg1"))
					.select(DS0C_ITM_GRP, S0_M12.itm_grp_cd1.as("itm_grp_cd1"), S0_ITM_GRP1.itm_grp_nm.as("itm_grp_nm1"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_ITM_GRP1).on(S0_M12.itm_grp_cd1.eq(S0_ITM_GRP1.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP1.value()).eq(S0_ITM_GRP1.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M12.itm_grp_cd1.like(bind("itm_grp_cd1"))).cutoff$and(S0_ITM_GRP1.itm_grp_nm.like(bind("itm_grp_nm1")))),
				when(boundOr("itm_grp_flg2"))
					.select(DS0C_ITM_GRP, S0_M12.itm_grp_cd2.as("itm_grp_cd2"), S0_ITM_GRP2.itm_grp_nm.as("itm_grp_nm2"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_ITM_GRP2).on(S0_M12.itm_grp_cd2.eq(S0_ITM_GRP2.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP2.value()).eq(S0_ITM_GRP2.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M12.itm_grp_cd2.like(bind("itm_grp_cd2"))).cutoff$and(S0_ITM_GRP2.itm_grp_nm.like(bind("itm_grp_nm2")))),
				when(boundOr("itm_grp_flg3"))
					.select(DS0C_ITM_GRP, S0_M12.itm_grp_cd3.as("itm_grp_cd3"), S0_ITM_GRP3.itm_grp_nm.as("itm_grp_nm3"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_ITM_GRP3).on(S0_M12.itm_grp_cd3.eq(S0_ITM_GRP3.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP3.value()).eq(S0_ITM_GRP3.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M12.itm_grp_cd3.like(bind("itm_grp_cd3"))).cutoff$and(S0_ITM_GRP3.itm_grp_nm.like(bind("itm_grp_nm3")))),
				when(boundOr("itm_grp_flg4"))
					.select(DS0C_ITM_GRP, S0_M12.itm_grp_cd4.as("itm_grp_cd4"), S0_ITM_GRP4.itm_grp_nm.as("itm_grp_nm4"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_ITM_GRP4).on(S0_M12.itm_grp_cd4.eq(S0_ITM_GRP4.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP4.value()).eq(S0_ITM_GRP4.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M12.itm_grp_cd4.like(bind("itm_grp_cd4"))).cutoff$and(S0_ITM_GRP4.itm_grp_nm.like(bind("itm_grp_nm4")))),
				when(boundOr("itm_grp_flg5"))
					.select(DS0C_ITM_GRP, S0_M12.itm_grp_cd5.as("itm_grp_cd5"), S0_ITM_GRP5.itm_grp_nm.as("itm_grp_nm5"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_ITM_GRP5).on(S0_M12.itm_grp_cd5.eq(S0_ITM_GRP5.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP5.value()).eq(S0_ITM_GRP5.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M12.itm_grp_cd5.like(bind("itm_grp_cd5"))).cutoff$and(S0_ITM_GRP5.itm_grp_nm.like(bind("itm_grp_nm5")))),
				when(boundOr("itm_grp_flg6"))
					.select(DS0C_ITM_GRP, S0_M12.itm_grp_cd6.as("itm_grp_cd6"), S0_ITM_GRP6.itm_grp_nm.as("itm_grp_nm6"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_ITM_GRP6).on(S0_M12.itm_grp_cd6.eq(S0_ITM_GRP6.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP6.value()).eq(S0_ITM_GRP6.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M12.itm_grp_cd6.like(bind("itm_grp_cd6"))).cutoff$and(S0_ITM_GRP6.itm_grp_nm.like(bind("itm_grp_nm6")))),
				when(boundOr("itm_grp_flg7"))
					.select(DS0C_ITM_GRP, S0_M12.itm_grp_cd7.as("itm_grp_cd7"), S0_ITM_GRP7.itm_grp_nm.as("itm_grp_nm7"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_ITM_GRP7).on(S0_M12.itm_grp_cd7.eq(S0_ITM_GRP7.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP7.value()).eq(S0_ITM_GRP7.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M12.itm_grp_cd7.like(bind("itm_grp_cd7"))).cutoff$and(S0_ITM_GRP7.itm_grp_nm.like(bind("itm_grp_nm7")))),
				when(boundOr("itm_grp_flg8"))
					.select(DS0C_ITM_GRP, S0_M12.itm_grp_cd8.as("itm_grp_cd8"), S0_ITM_GRP8.itm_grp_nm.as("itm_grp_nm8"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_ITM_GRP8).on(S0_M12.itm_grp_cd8.eq(S0_ITM_GRP8.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP8.value()).eq(S0_ITM_GRP8.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M12.itm_grp_cd8.like(bind("itm_grp_cd8"))).cutoff$and(S0_ITM_GRP8.itm_grp_nm.like(bind("itm_grp_nm8")))),
				when(boundOr("itm_grp_flg9"))
					.select(DS0C_ITM_GRP, S0_M12.itm_grp_cd9.as("itm_grp_cd9"), S0_ITM_GRP9.itm_grp_nm.as("itm_grp_nm9"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_ITM_GRP9).on(S0_M12.itm_grp_cd9.eq(S0_ITM_GRP9.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP9.value()).eq(S0_ITM_GRP9.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M12.itm_grp_cd9.like(bind("itm_grp_cd9"))).cutoff$and(S0_ITM_GRP9.itm_grp_nm.like(bind("itm_grp_nm9")))),
				when(boundOr("itm_grp_flg10"))
					.select(DS0C_ITM_GRP, S0_M12.itm_grp_cd10.as("itm_grp_cd10"), S0_ITM_GRP10.itm_grp_nm.as("itm_grp_nm10"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_ITM_GRP10).on(S0_M12.itm_grp_cd10.eq(S0_ITM_GRP10.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP10.value()).eq(S0_ITM_GRP10.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M12.itm_grp_cd10.like(bind("itm_grp_cd10"))).cutoff$and(S0_ITM_GRP10.itm_grp_nm.like(bind("itm_grp_nm10"))))
			)
			.setJoinInfo(
				joinInfo(
					j -> j
						.add(MST_SLO_RSN_R.class, r -> toCondition(
							r.getStringNE("qtn_term_cd")
						))
						.addSelect(m -> toArray(
							m.slo_rsn_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("qtn_term_nm", m.slo_rsn_nm());
					}),
					j -> j
						.add(MST_WRK_R.class, r -> toCondition(
							r.getStringNE("wrk_no")
						))
						.addSelect(m -> toArray(
							m.wrk_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("wrk_nm", m.wrk_nm());
					}),
					j -> j
						.add(MST_SLO_RSN_R.class, r -> toCondition(
							r.getStringNE("qtn_rslt_rsn_cd")
						))
						.addSelect(m -> toArray(
							m.slo_rsn_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("qtn_rslt_rsn_nm", m.slo_rsn_nm());
					}),
					j -> j
						.add(MST_SLO_RSN_R.class, r -> toCondition(
							r.getStringNE("qtn_d_rslt_rsn_cd")
						))
						.addSelect(m -> toArray(
							m.slo_rsn_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("qtn_d_rslt_rsn_nm", m.slo_rsn_nm());
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
						.add(MAM_WG_R.class, r -> toCondition(
							r.getStringNE("wg_cd")
						))
						.addSelect(m -> toArray(
							m.wg_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("wg_nm", m.wg_nm());
					}),
					j -> j
						.add(MAM_CUR_R.class, r -> toCondition(
							r.getStringNE("trd_cur_cd")
						))
						.addSelect(m -> toArray(
							m.amt_dec_place,
							m.cur_nm,
							m.upri_dec_place
						))
						.addMap((r, m) -> {
							r.setStringNE("trd_cur_nm", m.cur_nm());
							r.setNumberNE("trd_cur_upri_dec_place", m.upri_dec_place());
							r.setNumberNE("trd_cur_amt_dec_place", m.amt_dec_place());
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
						.add(MAM_USR_R.class, r -> toCondition(
							r.getStringNE("rcpt_usr_cd")
						))
						.addSelect(m -> toArray(
							m.usr_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("rcpt_usr_nm", m.usr_nm());
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
							m.dec_place,
							m.unit_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("trd_unit_nm", m.unit_nm());
							r.setNumberNE("trd_qty_dec_place", m.dec_place());
					}),
					j -> j
						.add(MAM_UNIT_R.class, r -> toCondition(
							r.getStringNE("base_unit_cd")
						))
						.addSelect(m -> toArray(
							m.dec_place,
							m.unit_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("base_unit_nm", m.unit_nm());
							r.setNumberNE("base_qty_dec_place", m.dec_place());
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
							r.getStringNE("dscnt_rsn_cd")
						))
						.addSelect(m -> toArray(
							m.biz_rsn_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("dscnt_rsn_nm", m.biz_rsn_nm());
					}),
					j -> j
						.add(MAM_TAX_R.class, r -> toCondition(
							r.getStringNE("tax_cd")
						))
						.addSelect(m -> toArray(
							m.tax_nm,
							m.tax_rate
						))
						.addMap((r, m) -> {
							r.setStringNE("tax_nm", m.tax_nm());
							r.setNumberNE("tax_rate", m.tax_rate());
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
						.add(MAM_BP_R.class, r -> toCondition(
							r.getStringNE("dest_cd1")
						))
						.addSelect(m -> toArray(
							m.bp_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("dest_nm1", m.bp_nm());
					}),
					j -> j
						.add(MAM_BP_R.class, r -> toCondition(
							r.getStringNE("dest_cd2")
						))
						.addSelect(m -> toArray(
							m.bp_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("dest_nm2", m.bp_nm());
					}),
					j -> j
						.add(MAM_BP_R.class, r -> toCondition(
							r.getStringNE("dest_cd3")
						))
						.addSelect(m -> toArray(
							m.bp_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("dest_nm3", m.bp_nm());
					})
				)
			);
	}
	
	/**
	 * -- MSBBL1120_MST_QTN_Query_S01
	 */
	static MCQueryPlan MSBBL1120_MST_QTN_S01() {
		MST_QTN_R S0_T1 = MST_QTN_R.create("T1");
		MST_SLO_RSN_R S0_T2 = MST_SLO_RSN_R.create("T2");
		MST_WRK_R S0_T3 = MST_WRK_R.create("T3");
		MST_SLO_RSN_R S0_T4 = MST_SLO_RSN_R.create("T4");
		MAM_TRD_R S0_M1 = MAM_TRD_R.create("M1");
		MAM_BP_R S0_M2 = MAM_BP_R.create("M2");
		MAM_USR_R S0_M3 = MAM_USR_R.create("M3");
		MAM_DPT_R S0_M4 = MAM_DPT_R.create("M4");
		MAM_WG_R S0_M5 = MAM_WG_R.create("M5");
		MAM_CUR_R S0_M6 = MAM_CUR_R.create("M6");
		MAM_USR_R S0_M11 = MAM_USR_R.create("M11");
		MAVM_RD_DPT_R S0_V1 = MAVM_RD_DPT_R.create("V1");
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
		MST_QTN_D_R S0_T5 = MST_QTN_D_R.create("S0_T5");
		MAM_ITM_R itmR = MAM_ITM_R.create("ITM");
		MCTempView S0_T5_TempView = createTempView("S0_T5_View");
		MCSingleView S0_T5_View = subQuery().select(
				S0_T5.qtn_no,
				S0_T5.qtn_rev,
				sum(
					decode(
						itmR.dscnt_itm_flg,
						value(true),
						S0_T5.trd_cur_amt.multiply(value(-1)).add(
							bracket(
								S0_T5.trd_cur_tax_amt.multiply(value(-1))
							)
						),
						S0_T5.trd_cur_amt.add(S0_T5.trd_cur_tax_amt))
				).as("trd_cur_inc_tax_amt")
				)
				.from(
						S0_T5
						.leftOuterJoin(itmR).on(
							bracket(
								S0_T5.itm_cd.eq(itmR.itm_cd)
								.and(S0_T5.itm_sub1.eq(itmR.itm_sub1))
								.and(S0_T5.itm_sub2.eq(itmR.itm_sub2))
								.and(S0_T5.itm_sub3.eq(itmR.itm_sub3))
							)
						)
				)
				.groupBy(
				S0_T5.qtn_no,
				S0_T5.qtn_rev
				).view(S0_T5_TempView);
		
		MCDynamicSQLID DS0C_CST_GRP = createDynamicSQLID("DS0C_CST_GRP");
		
		return createQueryPlan()
			.setQuery(
				sql("MSBBL1120_MST_QTN_Query_S01")
					.mainQuery()
					.select(
						S0_T1.trd_cd,
						S0_T1.trd_ptn_typ,
						S0_T1.qtn_no,
						S0_T1.qtn_rev,
						S0_T1.qtn_prnt_seq,
						S0_T1.qtn_dt,
						S0_T1.valid_dt,
						S0_T1.qtn_typ,
						S0_T1.failure_flg,
						S0_T1.can_flg,
						S0_T1.qtn_prnt_flg,
						S0_T1.qtn_prnt_dt,
						S0_T1.aprv_no,
						S0_T1.aprv_sts_typ,
						S0_T1.aprv_flg,
						S0_T1.cst_cd,
						nvl(
							S0_T1.cst_nm,
							S0_M2.bp_nm
						).as("cst_nm"),
						S0_T1.sls_usr_cd,
						S0_T1.sls_dpt_cd,
						S0_M4.dpt_nm.as("sls_dpt_nm"),
						S0_T1.wg_cd,
						S0_T1.trd_cur_cd,
						S0_T1.xrate_inpt_flg,
						S0_T1.xrate,
						S0_T1.qtn_term_cd,
						S0_T1.trnspt_cd,
						S0_T1.tterm_cd1,
						S0_T1.tterm_rmrks1,
						S0_T1.tterm_cd2,
						S0_T1.tterm_rmrks2,
						S0_T1.tterm_cd3,
						S0_T1.tterm_rmrks3,
						S0_T1.wrk_no,
						S0_T1.cst_qtn_rqst_no,
						S0_T1.rcpt_dt,
						S0_T1.rcpt_usr_cd,
						S0_T1.qtn_rmrks,
						S0_T1.intr_rmrks,
						S0_T1.qtn_rslt_rsn_cd,
						S0_T1.qtn_rslt_rsn_rmrks,
						S0_T1.sub_char1.as("qtn_sub_char1"),
						S0_T1.sub_char2.as("qtn_sub_char2"),
						S0_T1.sub_char3.as("qtn_sub_char3"),
						S0_T1.ins_usr_id,
						S0_T1.ins_usr_nm,
						S0_T1.ins_ts,
						S0_T1.ins_func_id,
						S0_T1.upd_cntr,
						S0_T1.upd_usr_id,
						S0_T1.upd_usr_nm,
						S0_T1.upd_ts,
						S0_T1.upd_func_id,
						S0_T1.upd_srv_req_no,
						S0_T1.qtn_prnt_seq,
						S0_T5_TempView.pr("trd_cur_inc_tax_amt"),
						addDynamicSelect(DS0C_CST_GRP)
					)
					.from(
						S0_T1
						.leftOuterJoin(S0_M2).on(
							bracket(
								S0_T1.cst_cd.eq(S0_M2.bp_cd)
							)
						)
						.leftOuterJoin(S0_M4).on(
							bracket(
								S0_T1.sls_dpt_cd.eq(S0_M4.dpt_cd)
								.and(S0_T1.qtn_dt.between(S0_M4.st_dt, S0_M4.end_dt))
							)
						)
						.innerJoin(S0_V1).on(
							bracket(
								S0_T1.sls_dpt_cd.eq(S0_V1.dpt_cd)
							)
						)
						.leftOuterJoin(S0_T5_View)
						.on(
							value(0).eq(value(0))
							.and(S0_T5_TempView.pr(MST_QTN_D_R.$qtn_no).eq(S0_T1.qtn_no))
							.and(S0_T5_TempView.pr(MST_QTN_D_R.$qtn_rev).eq(S0_T1.qtn_rev))
						)
						.addDynamicView()
						.addDynamicView(DS0C_CST_GRP)
					)
					.where(
						value(0).eq(value(0))
						.and(
							bracket(
								bind("creating").eq(value(true))
								.and(
									S0_T1.qtn_typ.in(
										value(MSC_QTN_TYP.CREATING.value())
									)
								)
							)
							.or(
								bind("pre_qtn").eq(value(true))
								.and(
									S0_T1.qtn_typ.in(
										value(MSC_QTN_TYP.PRE_QTN.value())
									)
								)
							)
							.or(
								bind("qtn").eq(value(true))
								.and(
									S0_T1.qtn_typ.in(
										value(MSC_QTN_TYP.QTN.value())
									)
								)
							)
						)
						.and(
							bracket(
								bind("opn").eq(value(true))
								.and(
									S0_T1.aprv_sts_typ.in(
										value(MAC_APRV_STS_TYP.OPN.value())
									)
								)
							)
							.or(
								bind("fix").eq(value(true))
								.and(
									S0_T1.aprv_sts_typ.in(
										value(MAC_APRV_STS_TYP.FIX.value())
									)
								)
							)
							.or(
								bind("acpt").eq(value(true))
								.and(
									S0_T1.aprv_sts_typ.in(
										value(MAC_APRV_STS_TYP.ACPT.value())
									)
								)
							)
							.or(
								bind("rjct").eq(value(true))
								.and(
									S0_T1.aprv_sts_typ.in(
										value(MAC_APRV_STS_TYP.RJCT.value())
									)
								)
							)
							.or(
								bind("last_rjct").eq(value(true))
								.and(
									S0_T1.aprv_sts_typ.in(
										value(MAC_APRV_STS_TYP.LAST_RJCT.value())
									)
								)
							)
							.or(
								bind("excld").eq(value(true))
								.and(S0_T1.aprv_sts_typ.isNull())
							)
						)
						.and(
							bracket(
								bind("yet").eq(value(true))
								.and(S0_T1.qtn_prnt_flg.eq(value(false)))
							)
							.or(
								bind("prnt").eq(value(true))
								.and(S0_T1.qtn_prnt_flg.eq(value(true)))
							)
						)
						.and(
							bracket(
								bind("iv_trgt_flg").eq(value(true))
								.and(S0_M2.cst_iv_flg.eq(value(true)))
							)
							.or(
								bind("iv_not_trgt_flg").eq(value(true))
								.and(S0_M2.cst_iv_flg.eq(value(false)))
							)
						)
						.cutoff$and(S0_T1.qtn_dt.gte(bind("qtn_dt_fr")))
						.cutoff$and(S0_T1.qtn_dt.lte(bind("qtn_dt_to")))
						.cutoff$and(S0_T1.valid_dt.gte(bind("valid_dt_fr")))
						.cutoff$and(S0_T1.valid_dt.lte(bind("valid_dt_to")))
						.cutoff$and(S0_T1.rcpt_dt.gte(bind("rcpt_dt_fr")))
						.cutoff$and(S0_T1.rcpt_dt.lte(bind("rcpt_dt_to")))
						.cutoff$and(S0_T1.cst_cd.like(bind("cst_cd")))
						.cutoff$and(
							nvl(
								S0_T1.cst_nm,
								S0_M2.bp_nm
							).like(bind("cst_nm"))
						)
						.cutoff$and(S0_T1.wrk_no.like(bind("wrk_no")))
						.addDynamicPredicate()
						.cutoff$and(S0_T1.sls_usr_cd.like(bind("sls_usr_cd")))
						.cutoff$and(S0_T1.sls_dpt_cd.like(bind("sls_dpt_cd")))
						.cutoff$and(S0_M4.dpt_nm.like(bind("sls_dpt_nm")))
						.cutoff$and(S0_T1.wg_cd.like(bind("wg_cd")))
						.cutoff$and(S0_T1.qtn_rmrks.like(bind("qtn_rmrks")))
						.cutoff$and(S0_T1.intr_rmrks.like(bind("intr_rmrks")))
						.cutoff$and(S0_T1.trd_cd.like(bind("trd_cd")))
						.cutoff$and(S0_T1.qtn_no.like(bind("qtn_no")))
						.cutoff$and(S0_T1.qtn_rev.eq(bind("qtn_rev")))
						.cutoff$and(S0_T1.trd_cur_cd.like(bind("trd_cur_cd")))
						.cutoff$and(S0_T1.cst_qtn_rqst_no.like(bind("cst_qtn_rqst_no")))
						.cutoff$and(S0_T1.qtn_rslt_rsn_cd.like(bind("qtn_rslt_rsn_cd")))
						.cutoff$and(S0_T1.qtn_term_cd.like(bind("qtn_term_cd")))
						.cutoff$and(S0_T1.rcpt_usr_cd.like(bind("rcpt_usr_cd")))
						.cutoff$and(S0_T1.sub_char1.like(bind("qtn_sub_char1")))
						.cutoff$and(S0_T1.sub_char2.like(bind("qtn_sub_char2")))
						.cutoff$and(S0_T1.sub_char3.like(bind("qtn_sub_char3")))
						.and(
							bracket(
								bind("inc_failure_flg").eq(value(false))
								.and(S0_T1.failure_flg.eq(value(false)))
							)
							.or(bind("inc_failure_flg").eq(value(true)))
						)
						.and(
							bracket(
								bind("inc_can_flg").eq(value(false))
								.and(S0_T1.can_flg.eq(value(false)))
							)
							.or(bind("inc_can_flg").eq(value(true)))
						)
						.addDynamicPredicate(DS0C_CST_GRP)
					)
					.orderBy(
						S0_T1.qtn_no.asc(),
						S0_T1.qtn_rev.asc()
					)
			)
			.setDynamicSQLInfo(
				when(boundOr("qtn_term_nm"))
					.view(v -> v.leftOuterJoin(S0_T2).on(bracket(S0_T1.qtn_term_cd.eq(S0_T2.slo_rsn_cd))))
					.predicate(p -> p.cutoff$and(S0_T2.slo_rsn_nm.like(bind("qtn_term_nm")))),
				when(boundOr("wrk_nm"))
					.view(v -> v.leftOuterJoin(S0_T3).on(bracket(S0_T1.wrk_no.eq(S0_T3.wrk_no))))
					.predicate(p -> p.cutoff$and(S0_T3.wrk_nm.like(bind("wrk_nm")))),
				when(boundOr("qtn_rslt_rsn_nm"))
					.view(v -> v.leftOuterJoin(S0_T4).on(bracket(S0_T1.qtn_rslt_rsn_cd.eq(S0_T4.slo_rsn_cd))))
					.predicate(p -> p.cutoff$and(S0_T4.slo_rsn_nm.like(bind("qtn_rslt_rsn_nm")))),
				when(boundOr("trd_nm"))
					.view(v -> v.leftOuterJoin(S0_M1).on(bracket(S0_T1.trd_cd.eq(S0_M1.trd_cd))))
					.predicate(p -> p.cutoff$and(S0_M1.trd_nm.like(bind("trd_nm")))),
				when(boundOr("sls_usr_nm"))
					.view(v -> v.leftOuterJoin(S0_M3).on(bracket(S0_T1.sls_usr_cd.eq(S0_M3.usr_cd))))
					.predicate(p -> p.cutoff$and(S0_M3.usr_nm.like(bind("sls_usr_nm")))),
				when(boundOr("wg_nm"))
					.view(v -> v.leftOuterJoin(S0_M5).on(bracket(S0_T1.wg_cd.eq(S0_M5.wg_cd))))
					.predicate(p -> p.cutoff$and(S0_M5.wg_nm.like(bind("wg_nm")))),
				when(boundOr("trd_cur_nm"))
					.view(v -> v.leftOuterJoin(S0_M6).on(bracket(S0_T1.trd_cur_cd.eq(S0_M6.cur_cd))))
					.predicate(p -> p.cutoff$and(S0_M6.cur_nm.like(bind("trd_cur_nm")))),
				when(boundOr("rcpt_usr_nm"))
					.view(v -> v.leftOuterJoin(S0_M11).on(bracket(S0_T1.rcpt_usr_cd.eq(S0_M11.usr_cd))))
					.predicate(p -> p.cutoff$and(S0_M11.usr_nm.like(bind("rcpt_usr_nm")))),
				when(boundOr("cst_grp_flg1"))
					.select(DS0C_CST_GRP, S0_M2.bp_grp_cd1.as("cst_grp_cd1"), S0_MM1.bp_grp_nm.as("cst_grp_nm1"))
					.view(DS0C_CST_GRP, v -> v.leftOuterJoin(S0_MM1).on(S0_M2.bp_grp_cd1.eq(S0_MM1.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP1.value()).eq(S0_MM1.bp_grp_typ))))
					.predicate(DS0C_CST_GRP, p -> p.cutoff$and(S0_M2.bp_grp_cd1.like(bind("cst_grp_cd1"))).cutoff$and(S0_MM1.bp_grp_nm.like(bind("cst_grp_nm1")))),
				when(boundOr("cst_grp_flg2"))
					.select(DS0C_CST_GRP, S0_M2.bp_grp_cd2.as("cst_grp_cd2"), S0_MM2.bp_grp_nm.as("cst_grp_nm2"))
					.view(DS0C_CST_GRP, v -> v.leftOuterJoin(S0_MM2).on(S0_M2.bp_grp_cd2.eq(S0_MM2.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP2.value()).eq(S0_MM2.bp_grp_typ))))
					.predicate(DS0C_CST_GRP, p -> p.cutoff$and(S0_M2.bp_grp_cd2.like(bind("cst_grp_cd2"))).cutoff$and(S0_MM2.bp_grp_nm.like(bind("cst_grp_nm2")))),
				when(boundOr("cst_grp_flg3"))
					.select(DS0C_CST_GRP, S0_M2.bp_grp_cd3.as("cst_grp_cd3"), S0_MM3.bp_grp_nm.as("cst_grp_nm3"))
					.view(DS0C_CST_GRP, v -> v.leftOuterJoin(S0_MM3).on(S0_M2.bp_grp_cd3.eq(S0_MM3.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP3.value()).eq(S0_MM3.bp_grp_typ))))
					.predicate(DS0C_CST_GRP, p -> p.cutoff$and(S0_M2.bp_grp_cd3.like(bind("cst_grp_cd3"))).cutoff$and(S0_MM3.bp_grp_nm.like(bind("cst_grp_nm3")))),
				when(boundOr("cst_grp_flg4"))
					.select(DS0C_CST_GRP, S0_M2.bp_grp_cd4.as("cst_grp_cd4"), S0_MM4.bp_grp_nm.as("cst_grp_nm4"))
					.view(DS0C_CST_GRP, v -> v.leftOuterJoin(S0_MM4).on(S0_M2.bp_grp_cd4.eq(S0_MM4.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP4.value()).eq(S0_MM4.bp_grp_typ))))
					.predicate(DS0C_CST_GRP, p -> p.cutoff$and(S0_M2.bp_grp_cd4.like(bind("cst_grp_cd4"))).cutoff$and(S0_MM4.bp_grp_nm.like(bind("cst_grp_nm4")))),
				when(boundOr("cst_grp_flg5"))
					.select(DS0C_CST_GRP, S0_M2.bp_grp_cd5.as("cst_grp_cd5"), S0_MM5.bp_grp_nm.as("cst_grp_nm5"))
					.view(DS0C_CST_GRP, v -> v.leftOuterJoin(S0_MM5).on(S0_M2.bp_grp_cd5.eq(S0_MM5.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP5.value()).eq(S0_MM5.bp_grp_typ))))
					.predicate(DS0C_CST_GRP, p -> p.cutoff$and(S0_M2.bp_grp_cd5.like(bind("cst_grp_cd5"))).cutoff$and(S0_MM5.bp_grp_nm.like(bind("cst_grp_nm5")))),
				when(boundOr("cst_grp_flg6"))
					.select(DS0C_CST_GRP, S0_M2.bp_grp_cd6.as("cst_grp_cd6"), S0_MM6.bp_grp_nm.as("cst_grp_nm6"))
					.view(DS0C_CST_GRP, v -> v.leftOuterJoin(S0_MM6).on(S0_M2.bp_grp_cd6.eq(S0_MM6.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP6.value()).eq(S0_MM6.bp_grp_typ))))
					.predicate(DS0C_CST_GRP, p -> p.cutoff$and(S0_M2.bp_grp_cd6.like(bind("cst_grp_cd6"))).cutoff$and(S0_MM6.bp_grp_nm.like(bind("cst_grp_nm6")))),
				when(boundOr("cst_grp_flg7"))
					.select(DS0C_CST_GRP, S0_M2.bp_grp_cd7.as("cst_grp_cd7"), S0_MM7.bp_grp_nm.as("cst_grp_nm7"))
					.view(DS0C_CST_GRP, v -> v.leftOuterJoin(S0_MM7).on(S0_M2.bp_grp_cd7.eq(S0_MM7.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP7.value()).eq(S0_MM7.bp_grp_typ))))
					.predicate(DS0C_CST_GRP, p -> p.cutoff$and(S0_M2.bp_grp_cd7.like(bind("cst_grp_cd7"))).cutoff$and(S0_MM7.bp_grp_nm.like(bind("cst_grp_nm7")))),
				when(boundOr("cst_grp_flg8"))
					.select(DS0C_CST_GRP, S0_M2.bp_grp_cd8.as("cst_grp_cd8"), S0_MM8.bp_grp_nm.as("cst_grp_nm8"))
					.view(DS0C_CST_GRP, v -> v.leftOuterJoin(S0_MM8).on(S0_M2.bp_grp_cd8.eq(S0_MM8.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP8.value()).eq(S0_MM8.bp_grp_typ))))
					.predicate(DS0C_CST_GRP, p -> p.cutoff$and(S0_M2.bp_grp_cd8.like(bind("cst_grp_cd8"))).cutoff$and(S0_MM8.bp_grp_nm.like(bind("cst_grp_nm8")))),
				when(boundOr("cst_grp_flg9"))
					.select(DS0C_CST_GRP, S0_M2.bp_grp_cd9.as("cst_grp_cd9"), S0_MM9.bp_grp_nm.as("cst_grp_nm9"))
					.view(DS0C_CST_GRP, v -> v.leftOuterJoin(S0_MM9).on(S0_M2.bp_grp_cd9.eq(S0_MM9.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP9.value()).eq(S0_MM9.bp_grp_typ))))
					.predicate(DS0C_CST_GRP, p -> p.cutoff$and(S0_M2.bp_grp_cd9.like(bind("cst_grp_cd9"))).cutoff$and(S0_MM9.bp_grp_nm.like(bind("cst_grp_nm9")))),
				when(boundOr("cst_grp_flg10"))
					.select(DS0C_CST_GRP, S0_M2.bp_grp_cd10.as("cst_grp_cd10"), S0_MM10.bp_grp_nm.as("cst_grp_nm10"))
					.view(DS0C_CST_GRP, v -> v.leftOuterJoin(S0_MM10).on(S0_M2.bp_grp_cd10.eq(S0_MM10.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP10.value()).eq(S0_MM10.bp_grp_typ))))
					.predicate(DS0C_CST_GRP, p -> p.cutoff$and(S0_M2.bp_grp_cd10.like(bind("cst_grp_cd10"))).cutoff$and(S0_MM10.bp_grp_nm.like(bind("cst_grp_nm10"))))
			)
			.setJoinInfo(
				joinInfo(
					j -> j
						.add(MST_SLO_RSN_R.class, r -> toCondition(
							r.getStringNE("qtn_term_cd")
						))
						.addSelect(m -> toArray(
							m.slo_rsn_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("qtn_term_nm", m.slo_rsn_nm());
					}),
					j -> j
						.add(MST_WRK_R.class, r -> toCondition(
							r.getStringNE("wrk_no")
						))
						.addSelect(m -> toArray(
							m.wrk_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("wrk_nm", m.wrk_nm());
					}),
					j -> j
						.add(MST_SLO_RSN_R.class, r -> toCondition(
							r.getStringNE("qtn_rslt_rsn_cd")
						))
						.addSelect(m -> toArray(
							m.slo_rsn_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("qtn_rslt_rsn_nm", m.slo_rsn_nm());
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
						.add(MAM_WG_R.class, r -> toCondition(
							r.getStringNE("wg_cd")
						))
						.addSelect(m -> toArray(
							m.wg_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("wg_nm", m.wg_nm());
					}),
					j -> j
						.add(MAM_CUR_R.class, r -> toCondition(
							r.getStringNE("trd_cur_cd")
						))
						.addSelect(m -> toArray(
							m.amt_dec_place,
							m.cur_nm,
							m.upri_dec_place
						))
						.addMap((r, m) -> {
							r.setStringNE("trd_cur_nm", m.cur_nm());
							r.setNumberNE("trd_cur_upri_dec_place", m.upri_dec_place());
							r.setNumberNE("trd_cur_amt_dec_place", m.amt_dec_place());
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
						.add(MAM_USR_R.class, r -> toCondition(
							r.getStringNE("rcpt_usr_cd")
						))
						.addSelect(m -> toArray(
							m.usr_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("rcpt_usr_nm", m.usr_nm());
					})
				)
			);
	}
}