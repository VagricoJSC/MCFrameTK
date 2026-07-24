package mcframe.serverMSBB.MSBBL1110;

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
	 * -- MSBBL1110_MST_QTN_D_Query_S01
	 */
	static MCQueryPlan MSBBL1110_MST_QTN_D_S01() {
		MST_QTN_D_R S0_T1 = MST_QTN_D_R.create("T1");
		MST_QTN_R S0_T2 = MST_QTN_R.create("T2");
		MAM_ITM_R S0_M1 = MAM_ITM_R.create("M1");
		MAM_CNTRY_R S0_M2 = MAM_CNTRY_R.create("M2");
		MAM_UNIT_R S0_M3 = MAM_UNIT_R.create("M3");
		MAVM_ITM_UNIT_R S0_M4 = MAVM_ITM_UNIT_R.create("M4");
		MAM_UNIT_R S0_M5 = MAM_UNIT_R.create("M5");
		MAVM_ITM_UNIT_R S0_M6 = MAVM_ITM_UNIT_R.create("M6");
		MAM_BIZ_RSN_R S0_M7 = MAM_BIZ_RSN_R.create("M7");
		MAM_TAX_R S0_M8 = MAM_TAX_R.create("M8");
		MAM_STK_GD_R S0_M9 = MAM_STK_GD_R.create("M9");
		MAM_BP_R S0_M10 = MAM_BP_R.create("M10");
		MAM_BP_R S0_M11 = MAM_BP_R.create("M11");
		MAM_BP_R S0_M12 = MAM_BP_R.create("M12");
		MST_SLO_RSN_R S0_M13 = MST_SLO_RSN_R.create("M13");
		MAM_BP_R S0_M14 = MAM_BP_R.create("M14");
		MAM_BP_R S0_M15 = MAM_BP_R.create("M15");
		MAM_ITM_LCL_R S0_M16 = MAM_ITM_LCL_R.create("M16");
		MAM_CNTRY_R S0_M17 = MAM_CNTRY_R.create("M17");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBBL1110_MST_QTN_D_Query_S01")
					.mainQuery()
					.select(
						S0_T1.qtn_d_no,
						S0_T1.itm_cd,
						S0_T1.itm_sub1,
						S0_T1.itm_sub2,
						S0_T1.itm_sub3,
						nvl(
							S0_T1.itm_nm,
							S0_M1.itm_nm
						).as("itm_nm"),
						S0_M1.dscnt_itm_flg,
						S0_M1.sno1_mng_typ,
						S0_M1.sno2_mng_typ,
						S0_M1.sno3_mng_typ,
						S0_M1.sno4_mng_typ,
						S0_M1.sno1_num_typ,
						S0_M1.sno2_num_typ,
						S0_M1.sno3_num_typ,
						S0_M1.sno4_num_typ,
						S0_M1.slo_sno1_flg,
						S0_M1.slo_sno2_flg,
						S0_M1.slo_sno3_flg,
						S0_M1.slo_sno4_flg,
						S0_M1.comp_spec_typ,
						S0_M1.stk_mng_typ,
						S0_M1.asset_mng_typ,
						S0_T1.sundry_itm_flg,
						decode(
							S0_M1.sundry_itm_flg,
							value(true),
							S0_T1.iv_itm_nm,
							nvl(
								S0_M16.itm_nm,
								S0_M1.itm_nm
							)
						).as("iv_itm_nm"),
						S0_T1.cntry_org_cd,
						S0_M2.cntry_nm.as("cntry_org_nm"),
						S0_T1.trd_unit_cd,
						S0_M3.unit_nm.as("trd_unit_nm"),
						S0_M4.dec_place.as("trd_unit_dec_place"),
						S0_M4.conv_base_qty.as("trd_unit_conv_base_qty"),
						S0_M4.conv_qty.as("trd_unit_conv_qty"),
						S0_T1.trd_unit_qty,
						S0_T1.base_unit_cd,
						S0_M5.unit_nm.as("base_unit_nm"),
						S0_M6.dec_place.as("base_unit_dec_place"),
						S0_M6.rnd_typ.as("base_unit_rnd_typ"),
						S0_T1.base_unit_qty,
						S0_T1.interim_flg,
						S0_T1.trd_cur_std_sls_upri,
						S0_T1.trd_cur_std_sls_amt,
						S0_T1.trd_cur_std_sls_amt.add(S0_T1.trd_cur_std_sls_tax_amt).as("trd_cur_std_sls_inc_tax_amt"),
						S0_T1.upri_rate,
						S0_T1.trd_cur_upri,
						S0_T1.upri_not_tgt_flg,
						S0_T1.trd_cur_amt,
						S0_T1.trd_cur_amt.add(S0_T1.trd_cur_tax_amt).as("trd_cur_inc_tax_amt"),
						S0_T1.trd_cur_dscnt_amt,
						S0_T1.dscnt_rsn_cd,
						S0_M7.biz_rsn_nm.as("dscnt_rsn_nm"),
						S0_T1.tax_fix_flg,
						S0_T1.tax_cd,
						S0_M8.tax_nm,
						S0_M8.inc_tax_flg,
						S0_M8.tax_rate,
						S0_T1.trd_cur_std_sls_tax_amt,
						S0_T1.trd_cur_tax_amt,
						S0_T1.cost_upri,
						S0_T1.cost_amt,
						S0_T1.gd_cd,
						S0_M9.gd_nm,
						S0_T1.sno1,
						S0_T1.sno2,
						S0_T1.sno3,
						S0_T1.sno4,
						S0_T1.set_itm_grp_no,
						S0_T1.cst_itm_cd,
						S0_T1.cst_itm_nm,
						S0_T1.dlv_cd,
						S0_T1.dlv_sundry_flg,
						nvl(
							S0_T1.dlv_nm,
							S0_M14.bp_nm
						).as("dlv_nm"),
						S0_T1.dlv_cntct_dpt,
						S0_T1.dlv_cntct_psn,
						S0_T1.dlv_zip_cd,
						S0_T1.dlv_addr1,
						S0_T1.dlv_addr2,
						S0_T1.dlv_addr3,
						S0_T1.dlv_addr4,
						S0_T1.dlv_tel,
						S0_T1.dlv_fax,
						S0_M14.cntry_cd,
						S0_M17.cntry_nm,
						S0_T1.dest_cd1,
						S0_M10.bp_nm.as("dest_nm1"),
						S0_T1.dest_cd2,
						S0_M11.bp_nm.as("dest_nm2"),
						S0_T1.dest_cd3,
						S0_M12.bp_nm.as("dest_nm3"),
						S0_T1.qtn_d_rmrks,
						S0_T1.intr_rmrks,
						S0_T1.no_itm_cd_flg,
						S0_T1.qtn_d_rslt_rsn_cd,
						S0_M13.slo_rsn_nm.as("qtn_d_rslt_rsn_nm"),
						S0_T1.qtn_d_rslt_rsn_rmrks,
						bracket(
							nvl(
								S0_T1.slo_trnst_qty,
								value(0)
							).add(
								nvl(
									S0_T1.sls_trnst_qty,
									value(0)
								)
							)
						).as("trnst_qty"),
						S0_T1.cst_qtn_rqst_d_no,
						S0_T1.sub_char1,
						S0_T1.sub_char2,
						S0_T1.sub_char3,
						S0_T1.disp_seq,
						S0_M14.prnt_lcl_cd
					)
					.from(
						S0_T1
						.innerJoin(S0_T2).on(
							bracket(
								S0_T2.qtn_no.eq(S0_T1.qtn_no)
								.and(S0_T2.qtn_rev.eq(S0_T1.qtn_rev))
							)
						)
						.leftOuterJoin(S0_M1).on(
							bracket(
								S0_M1.itm_cd.eq(S0_T1.itm_cd)
								.and(S0_M1.itm_sub1.eq(S0_T1.itm_sub1))
								.and(S0_M1.itm_sub2.eq(S0_T1.itm_sub2))
								.and(S0_M1.itm_sub3.eq(S0_T1.itm_sub3))
							)
						)
						.leftOuterJoin(S0_M2).on(S0_M2.cntry_cd.eq(S0_T1.cntry_org_cd))
						.leftOuterJoin(S0_M3).on(S0_M3.unit_cd.eq(S0_T1.trd_unit_cd))
						.leftOuterJoin(S0_M4).on(
							bracket(
								S0_M4.itm_cd.eq(S0_T1.itm_cd)
								.and(S0_M4.itm_sub1.eq(S0_T1.itm_sub1))
								.and(S0_M4.itm_sub2.eq(S0_T1.itm_sub2))
								.and(S0_M4.itm_sub3.eq(S0_T1.itm_sub3))
								.and(S0_M4.unit_cd.eq(S0_T1.trd_unit_cd))
							)
						)
						.leftOuterJoin(S0_M5).on(S0_M5.unit_cd.eq(S0_T1.base_unit_cd))
						.leftOuterJoin(S0_M6).on(
							bracket(
								S0_M6.itm_cd.eq(S0_T1.itm_cd)
								.and(S0_M6.itm_sub1.eq(S0_T1.itm_sub1))
								.and(S0_M6.itm_sub2.eq(S0_T1.itm_sub2))
								.and(S0_M6.itm_sub3.eq(S0_T1.itm_sub3))
								.and(S0_M6.unit_cd.eq(S0_T1.base_unit_cd))
							)
						)
						.leftOuterJoin(S0_M7).on(S0_M7.biz_rsn_cd.eq(S0_T1.dscnt_rsn_cd))
						.leftOuterJoin(S0_M8).on(S0_M8.tax_cd.eq(S0_T1.tax_cd))
						.leftOuterJoin(S0_M9).on(S0_M9.gd_cd.eq(S0_T1.gd_cd))
						.leftOuterJoin(S0_M10).on(S0_M10.bp_cd.eq(S0_T1.dest_cd1))
						.leftOuterJoin(S0_M11).on(S0_M11.bp_cd.eq(S0_T1.dest_cd2))
						.leftOuterJoin(S0_M12).on(S0_M12.bp_cd.eq(S0_T1.dest_cd3))
						.leftOuterJoin(S0_M13).on(S0_M13.slo_rsn_cd.eq(S0_T1.qtn_d_rslt_rsn_cd))
						.leftOuterJoin(S0_M14).on(S0_M14.bp_cd.eq(S0_T1.dlv_cd))
						.leftOuterJoin(S0_M15).on(S0_M15.bp_cd.eq(S0_T2.cst_cd))
						.leftOuterJoin(S0_M16).on(
							bracket(
								S0_M16.itm_cd.eq(S0_T1.itm_cd)
								.and(S0_M16.itm_sub1.eq(S0_T1.itm_sub1))
								.and(S0_M16.itm_sub2.eq(S0_T1.itm_sub2))
								.and(S0_M16.itm_sub3.eq(S0_T1.itm_sub3))
								.and(S0_M16.lcl_cd.eq(S0_M14.prnt_lcl_cd))
							)
						)
						.leftOuterJoin(S0_M17).on(S0_M17.cntry_cd.eq(S0_M14.cntry_cd))
					)
					.where(
						value(0).eq(value(0))
						.and(S0_T1.qtn_no.eq(bind("qtn_no")))
						.and(S0_T1.qtn_rev.eq(bind("qtn_rev")))
					)
					.orderBy(S0_T1.disp_seq.asc())
			);
	}
	
	/**
	 * -- MSBBL1110_MST_QTN_Query_S01
	 */
	static MCQueryPlan MSBBL1110_MST_QTN_S01() {
		MST_QTN_R S0_T1 = MST_QTN_R.create("T1");
		MBT_APRV_R S0_T2 = MBT_APRV_R.create("T2");
		MST_WRK_R S0_T3 = MST_WRK_R.create("T3");
		MAM_TRD_R S0_M1 = MAM_TRD_R.create("M1");
		MAM_USR_R S0_M2 = MAM_USR_R.create("M2");
		MAM_DPT_R S0_M3 = MAM_DPT_R.create("M3");
		MAM_WG_R S0_M4 = MAM_WG_R.create("M4");
		MST_SLO_RSN_R S0_M5 = MST_SLO_RSN_R.create("M5");
		MAM_CUR_R S0_M6 = MAM_CUR_R.create("M6");
		MAM_TRNSPT_R S0_M7 = MAM_TRNSPT_R.create("M7");
		MAM_TTERM_R S0_M8 = MAM_TTERM_R.create("M8");
		MAM_TTERM_R S0_M9 = MAM_TTERM_R.create("M9");
		MAM_TTERM_R S0_M10 = MAM_TTERM_R.create("M10");
		MAM_USR_R S0_M11 = MAM_USR_R.create("M11");
		MST_SLO_RSN_R S0_M12 = MST_SLO_RSN_R.create("M12");
		MAM_BP_R S0_M13 = MAM_BP_R.create("M13");
		MAM_CNTRY_R S0_M14 = MAM_CNTRY_R.create("M14");
		MAVM_RD_DPT_R S0_DAC = MAVM_RD_DPT_R.create("DAC");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBBL1110_MST_QTN_Query_S01")
					.mainQuery()
					.select(
						S0_T1.trd_cd,
						S0_M1.trd_nm,
						S0_T1.trd_ptn_typ,
						S0_T1.qtn_no,
						S0_T1.qtn_rev,
						S0_T1.qtn_typ,
						S0_T1.qtn_dt,
						S0_T1.valid_dt,
						S0_T1.failure_flg,
						S0_T1.aprv_flg,
						S0_T1.aprv_no,
						S0_T1.aprv_sts_typ,
						S0_T2.aprv_upd_flg,
						S0_T2.aprv_can_flg,
						S0_T1.cst_cd,
						S0_T1.cst_sundry_flg,
						nvl(
							S0_T1.cst_nm,
							S0_M13.bp_nm
						).as("cst_nm"),
						S0_T1.cst_cntct_dpt,
						S0_T1.cst_cntct_psn,
						S0_T1.cst_zip_cd,
						S0_T1.cst_addr1,
						S0_T1.cst_addr2,
						S0_T1.cst_addr3,
						S0_T1.cst_addr4,
						S0_T1.cst_tel,
						S0_T1.cst_fax,
						S0_M13.cntry_cd.as("cst_cntry_cd"),
						S0_M14.cntry_nm.as("cst_cntry_nm"),
						S0_M13.cst_iv_flg,
						S0_M13.sls_amt_rnd_typ,
						S0_M13.sls_tax_rnd_typ,
						S0_T1.sls_usr_cd,
						S0_M2.usr_nm.as("sls_usr_nm"),
						S0_T1.sls_dpt_cd,
						S0_M3.dpt_nm.as("sls_dpt_nm"),
						S0_T1.wg_cd,
						S0_M4.wg_nm,
						S0_T1.qtn_term_cd,
						S0_M5.slo_rsn_nm.as("qtn_term_nm"),
						S0_T1.trd_cur_cd,
						S0_M6.cur_nm.as("trd_cur_nm"),
						S0_M6.amt_dec_place.as("trd_cur_amt_dec_place"),
						S0_M6.upri_dec_place.as("trd_cur_upri_dec_place"),
						S0_T1.xrate_inpt_flg,
						cases()
							.when(S0_T1.xrate_inpt_flg.eq(value(true)))
								.then(S0_T1.xrate)
							.otherwise(
								nvl(
									S0_T1.xrate,
									MAPA_XCHNG$F_GET_SLS_XRATE_NE(
										S0_T1.trd_cur_cd,
										bind("today")
									)
								)
							).as("xrate"),
						S0_T1.wrk_no,
						S0_T3.wrk_nm,
						S0_T1.cst_qtn_rqst_no,
						S0_T1.trnspt_cd,
						S0_M7.trnspt_nm,
						S0_T1.tterm_cd1,
						S0_M8.tterm_nm.as("tterm_nm1"),
						S0_T1.tterm_rmrks1,
						S0_T1.tterm_cd2,
						S0_M9.tterm_nm.as("tterm_nm2"),
						S0_T1.tterm_rmrks2,
						S0_T1.tterm_cd3,
						S0_M10.tterm_nm.as("tterm_nm3"),
						S0_T1.tterm_rmrks3,
						S0_T1.rcpt_dt,
						S0_T1.rcpt_usr_cd,
						S0_M11.usr_nm.as("rcpt_usr_nm"),
						S0_T1.qtn_rmrks,
						S0_T1.intr_rmrks,
						S0_T1.qtn_rslt_rsn_cd,
						S0_M12.slo_rsn_nm.as("qtn_rslt_rsn_nm"),
						S0_T1.qtn_rslt_rsn_rmrks,
						S0_T1.sub_char1,
						S0_T1.sub_char2,
						S0_T1.sub_char3,
						S0_T1.qtn_prnt_flg,
						S0_T1.qtn_prnt_seq,
						S0_T1.qtn_prnt_dt,
						S0_T1.can_flg,
						S0_T1.ins_usr_id,
						S0_T1.ins_usr_nm,
						S0_T1.ins_ts,
						S0_T1.ins_func_id,
						S0_T1.upd_cntr.as("qtn_upd_cntr"),
						S0_T1.upd_usr_id,
						S0_T1.upd_usr_nm,
						S0_T1.upd_ts,
						S0_T1.upd_func_id,
						S0_T1.upd_srv_req_no,
						S0_T1.qtn_prnt_seq,
						S0_T1.can_flg
					)
					.from(
						S0_T1
						.leftOuterJoin(S0_T2).on(
							bracket(
								S0_T2.aprv_no.eq(S0_T1.aprv_no)
								.and(S0_T2.can_flg.eq(value(false)))
							)
						)
						.leftOuterJoin(S0_T3).on(S0_T3.wrk_no.eq(S0_T1.wrk_no))
						.leftOuterJoin(S0_M1).on(S0_M1.trd_cd.eq(S0_T1.trd_cd))
						.leftOuterJoin(S0_M2).on(S0_M2.usr_cd.eq(S0_T1.sls_usr_cd))
						.leftOuterJoin(S0_M3).on(
							bracket(
								S0_M3.dpt_cd.eq(S0_T1.sls_dpt_cd)
								.and(S0_T1.qtn_dt.between(S0_M3.st_dt, S0_M3.end_dt))
							)
						)
						.leftOuterJoin(S0_M4).on(S0_M4.wg_cd.eq(S0_T1.wg_cd))
						.leftOuterJoin(S0_M5).on(S0_M5.slo_rsn_cd.eq(S0_T1.qtn_term_cd))
						.leftOuterJoin(S0_M6).on(S0_M6.cur_cd.eq(S0_T1.trd_cur_cd))
						.leftOuterJoin(S0_M7).on(S0_M7.trnspt_cd.eq(S0_T1.trnspt_cd))
						.leftOuterJoin(S0_M8).on(S0_M8.tterm_cd.eq(S0_T1.tterm_cd1))
						.leftOuterJoin(S0_M9).on(S0_M9.tterm_cd.eq(S0_T1.tterm_cd2))
						.leftOuterJoin(S0_M10).on(S0_M10.tterm_cd.eq(S0_T1.tterm_cd3))
						.leftOuterJoin(S0_M11).on(S0_M11.usr_cd.eq(S0_T1.rcpt_usr_cd))
						.leftOuterJoin(S0_M12).on(S0_M12.slo_rsn_cd.eq(S0_T1.qtn_rslt_rsn_cd))
						.leftOuterJoin(S0_M13).on(S0_M13.bp_cd.eq(S0_T1.cst_cd))
						.leftOuterJoin(S0_M14).on(S0_M14.cntry_cd.eq(S0_M13.cntry_cd))
						.innerJoin(S0_DAC).on(
							bracket(
								S0_DAC.dpt_cd.eq(S0_T1.sls_dpt_cd)
							)
						)
					)
					.where(
						value(0).eq(value(0))
						.and(S0_T1.qtn_no.eq(bind("qtn_no")))
						.and(S0_T1.qtn_rev.eq(bind("qtn_rev")))
					)
			);
	}
}