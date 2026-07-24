package mcframe.serverMSBD.MSBDL0030;

import mcframe.commonCore.lang.MCNumber;
import mcframe.commonCore.lang.MCDate;
import mcframe.commonCore.lang.MCTimestamp;

import mcframe.serverCore.cache.MCJoinerList;

import static mcframe.commonCore.util.MCCollectionUtil.*;
import static mcframe.serverCore.cache.MCJoinerList.*;
import static mcframe.serverCore.queryapi.IFMCSQL.*;
import static mcframe.serverCore.queryapi.MCQueryExecution.*;
import static mcframe.serverMAUC.MAUCL0020.MAUCL_AppSys.*;

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
	 * -- MSBDL0030_MST_PO_SCHD_Query_S01
	 */
	static MCQueryPlan MSBDL0030_MST_PO_SCHD_S01() {
		MST_PO_SCHD_R S0_T1 = MST_PO_SCHD_R.create("T1");
		MAVM_RD_WG_R S0_M0 = MAVM_RD_WG_R.create("M0");
		MST_PO_D_R S0_T6 = MST_PO_D_R.create("T6");
		MST_ARR_PR_R S0_T7 = MST_ARR_PR_R.create("T7");
		MAM_ITM_R S0_M2 = MAM_ITM_R.create("M2");
		MAM_SUNDRY_ITM_R S0_SUNDRYITM = MAM_SUNDRY_ITM_R.create("SUNDRYITM");
		MAM_ITM_TYP_D_R S0_M23 = MAM_ITM_TYP_D_R.create("M23");
		MAVM_ITM_UNIT_R S0_M4 = MAVM_ITM_UNIT_R.create("M4");
		MAM_WG_R S0_M5 = MAM_WG_R.create("M5");
		MAM_LOC_R S0_M6 = MAM_LOC_R.create("M6");
		MAM_WG_R S0_M7 = MAM_WG_R.create("M7");
		MAM_SITE_R S0_M19 = MAM_SITE_R.create("M19");
		MAM_STR_LN_R S0_M8 = MAM_STR_LN_R.create("M8");
		MAM_USR_R S0_M10 = MAM_USR_R.create("M10");
		MAM_DPT_R S0_M11 = MAM_DPT_R.create("M11");
		MAM_WG_R S0_M12 = MAM_WG_R.create("M12");
		MSVT_WRK_SNO_R S0_T2 = MSVT_WRK_SNO_R.create("T2");
		MAM_DPT_R S0_M36 = MAM_DPT_R.create("M36");
		MST_WG_RQST_PRMS_R S0_T4 = MST_WG_RQST_PRMS_R.create("T4");
		MST_WG_RQST_R S0_T5 = MST_WG_RQST_R.create("T5");
		MAM_BP_R S0_M18 = MAM_BP_R.create("M18");
		MAM_BP_R S0_M20 = MAM_BP_R.create("M20");
		MAM_BP_R S0_M21 = MAM_BP_R.create("M21");
		MAM_USR_R S0_M32 = MAM_USR_R.create("M32");
		MAM_DPT_R S0_M33 = MAM_DPT_R.create("M33");
		MAM_BP_R S0_M22 = MAM_BP_R.create("M22");
		MAM_CUR_R S0_M25 = MAM_CUR_R.create("M25");
		MAM_CUR_R S0_M30 = MAM_CUR_R.create("M30");
		MAM_ITM_LCL_R S0_M31 = MAM_ITM_LCL_R.create("M31");
		MAM_ITM_GRP_R S0_IM1 = MAM_ITM_GRP_R.create("IM1");
		MAM_ITM_GRP_R S0_IM2 = MAM_ITM_GRP_R.create("IM2");
		MAM_ITM_GRP_R S0_IM3 = MAM_ITM_GRP_R.create("IM3");
		MAM_ITM_GRP_R S0_IM4 = MAM_ITM_GRP_R.create("IM4");
		MAM_ITM_GRP_R S0_IM5 = MAM_ITM_GRP_R.create("IM5");
		MAM_ITM_GRP_R S0_IM6 = MAM_ITM_GRP_R.create("IM6");
		MAM_ITM_GRP_R S0_IM7 = MAM_ITM_GRP_R.create("IM7");
		MAM_ITM_GRP_R S0_IM8 = MAM_ITM_GRP_R.create("IM8");
		MAM_ITM_GRP_R S0_IM9 = MAM_ITM_GRP_R.create("IM9");
		MAM_ITM_GRP_R S0_IM10 = MAM_ITM_GRP_R.create("IM10");
		MAM_BP_GRP_R S0_BM1 = MAM_BP_GRP_R.create("BM1");
		MAM_BP_GRP_R S0_BM2 = MAM_BP_GRP_R.create("BM2");
		MAM_BP_GRP_R S0_BM3 = MAM_BP_GRP_R.create("BM3");
		MAM_BP_GRP_R S0_BM4 = MAM_BP_GRP_R.create("BM4");
		MAM_BP_GRP_R S0_BM5 = MAM_BP_GRP_R.create("BM5");
		MAM_BP_GRP_R S0_BM6 = MAM_BP_GRP_R.create("BM6");
		MAM_BP_GRP_R S0_BM7 = MAM_BP_GRP_R.create("BM7");
		MAM_BP_GRP_R S0_BM8 = MAM_BP_GRP_R.create("BM8");
		MAM_BP_GRP_R S0_BM9 = MAM_BP_GRP_R.create("BM9");
		MAM_BP_GRP_R S0_BM10 = MAM_BP_GRP_R.create("BM10");
		MST_SLO_D_R S0_T10 = MST_SLO_D_R.create("T10");
		
		MCDynamicSQLID DS0C_ITM_GRP = createDynamicSQLID("DS0C_ITM_GRP");
		MCDynamicSQLID DS0C_SPPL_GRP = createDynamicSQLID("DS0C_SPPL_GRP");
		MCDynamicSQLID REP1 = createDynamicSQLID("REP1");
		
		return createQueryPlan()
			.setQuery(
				sql("MSBDL0030_MST_PO_SCHD_Query_S01")
					.mainQuery()
					.select(
						S0_T1.upd_cntr.as("po_schd_upd_cntr"),
						S0_T1.ins_usr_id,
						S0_T1.ins_usr_nm,
						S0_T1.ins_ts,
						S0_T1.ins_func_id,
						S0_T1.upd_usr_id,
						S0_T1.upd_usr_nm,
						S0_T1.upd_ts,
						S0_T1.upd_func_id,
						S0_T1.upd_srv_req_no,
						S0_T1.po_schd_no,
						S0_T1.po_schd_src_typ,
						S0_T1.po_schd_src_no,
						S0_T1.io_schd_pr_no,
						S0_T1.trd_cd,
						S0_T1.trd_ptn_typ,
						S0_T1.itm_cd,
						S0_T1.itm_sub1,
						S0_T1.itm_sub2,
						S0_T1.itm_sub3,
						coalesce(
							S0_SUNDRYITM.itm_nm,
							S0_T1.itm_nm,
							S0_M2.itm_nm
						).as("itm_nm"),
						S0_T1.sundry_itm_flg,
						bracket(
								cases()
									.when(S0_T1.dlv_cd.isNotNull())
										.then(S0_T10.cst_itm_cd)
									.otherwise(nullValue())
							).as("cst_itm_cd"),
						bracket(
								cases()
									.when(S0_T1.dlv_cd.isNotNull())
										.then(S0_T10.cst_itm_nm)
									.otherwise(nullValue())
							).as("cst_itm_nm"),
						S0_M2.ver_flg,
						S0_M2.asset_mng_typ,
						S0_M2.purc_upri_cng_flg.as("itm_purc_upri_cng_flg"),
						S0_M2.sno1_mng_typ,
						S0_M2.sno2_mng_typ,
						S0_M2.sno3_mng_typ,
						S0_M2.sno4_mng_typ,
						S0_M2.dscnt_itm_flg,
						S0_T1.base_unit_qty,
						S0_T1.base_unit_cd,
						S0_M2.cont_fctr_flg,
						S0_M2.cont_fctr_dec_place,
						S0_M2.cont_fctr_rnd_typ,
						S0_M2.cont_fctr_unit_cd,
						S0_M2.std_cont_fctr,
						S0_M2.dec_place.as("base_unit_dec_place"),
						S0_M2.rnd_typ.as("base_unit_rnd_typ"),
						S0_T1.ver_no,
						decode(
							S0_M18.sppl_iv_flg,
							value(true),
							decode(
								S0_T1.sundry_itm_flg,
								value(true),
								S0_T1.iv_itm_nm,
								S0_M31.itm_nm
							),
							nullValue()
						).as("iv_itm_nm"),
						S0_T1.sppl_itm_cd,
						S0_T1.sppl_itm_nm,
						S0_T1.sno1,
						S0_T1.sno2,
						S0_T1.sno3,
						S0_T1.sno4,
						S0_T1.purc_rsn_cd,
						S0_T1.in_to_loc_cd,
						S0_T1.str_ln_cd,
						S0_T1.dlv_cd,
						S0_T1.dlv_sundry_flg,
						bracket(
							cases()
								.when(S0_T1.dlv_nm.isNull())
									.then(S0_M20.bp_nm)
								.otherwise(S0_T1.dlv_nm)
						).as("dlv_nm"),
						S0_T1.dlv_cntct_dpt,
						S0_T1.dlv_cntct_psn,
						S0_T1.dlv_zip_cd,
						S0_T1.dlv_addr1,
						S0_T1.dlv_addr2,
						S0_T1.dlv_addr3,
						S0_T1.dlv_addr4,
						S0_M20.cntry_cd.as("dlv_cntry_cd"),
						S0_T1.dlv_tel,
						S0_T1.dlv_fax,
						S0_M20.lg_grp_cd.as("dlv_lg_grp_cd"),
						S0_T1.tdlv_cd,
						S0_T1.tdlv_sundry_flg,
						bracket(
							cases()
								.when(S0_T1.tdlv_nm.isNull())
									.then(S0_M21.bp_nm)
								.otherwise(S0_T1.tdlv_nm)
						).as("tdlv_nm"),
						S0_T1.tdlv_cntct_dpt,
						S0_T1.tdlv_cntct_psn,
						S0_T1.tdlv_zip_cd,
						S0_T1.tdlv_addr1,
						S0_T1.tdlv_addr2,
						S0_T1.tdlv_addr3,
						S0_T1.tdlv_addr4,
						S0_M21.cntry_cd.as("tdlv_cntry_cd"),
						S0_T1.tdlv_tel,
						S0_T1.tdlv_fax,
						S0_M21.lg_grp_cd.as("tdlv_lg_grp_cd"),
						S0_T1.reg_dt,
						S0_T1.rqst_wg_cd,
						S0_T1.rqst_fr_usr_cd,
						S0_T1.rqst_fr_dpt_cd,
						S0_M33.dpt_nm.as("rqst_fr_dpt_nm"),
						S0_T1.purc_usr_cd,
						S0_T1.purc_dpt_cd,
						S0_M11.dpt_nm.as("purc_dpt_nm"),
						S0_T1.wg_cd.as("purc_dpt_wg_cd"),
						S0_T1.sppl_cd,
						S0_M18.bp_nm.as("sppl_nm"),
						S0_M18.sppl_cal_cd,
						S0_M18.sppl_iv_flg,
						S0_M18.prnt_lcl_cd,
						S0_M18.purc_upri_cng_flg.as("sppl_purc_upri_cng_flg"),
						S0_M18.purc_amt_rnd_typ,
						S0_M18.purc_tax_rnd_typ,
						S0_T1.maker_cd,
						S0_T1.outsrc_flg,
						S0_T1.outsrc_itm_ord_no,
						S0_T1.mfg_loc_cd,
						S0_T1.bom_ptn,
						S0_T1.trd_unit_qty,
						S0_T1.trd_unit_cd,
						S0_T1.purc_upri_req_typ,
						S0_T1.trd_cur_cd,
						bind("base_cur_cd").as("base_cur_cd"),
						S0_M25.cur_nm.as("base_cur_nm"),
						S0_M25.amt_dec_place.as("base_cur_amt_dec_place"),
						S0_M25.upri_dec_place.as("base_cur_upri_dec_place"),
						bind("ptax_cur_cd").as("ptax_cur_cd"),
						S0_M30.cur_nm.as("ptax_cur_nm"),
						S0_M30.amt_dec_place.as("ptax_cur_amt_dec_place"),
						S0_M30.upri_dec_place.as("ptax_cur_upri_dec_place"),
						S0_T1.tax_cd,
						S0_T1.xrate_inpt_flg,
						S0_T1.xrate,
						S0_T1.ptax_xrate,
						S0_T1.ptax_xrate_inpt_flg,
						S0_T1.upri_not_tgt_flg,
						S0_T1.interim_flg,
						S0_T1.trd_cur_upri,
						S0_T1.trd_cur_amt,
						S0_T1.trd_cur_tax_amt,
						S0_T1.trd_cur_amt.add(S0_T1.trd_cur_tax_amt).as("trd_cur_inc_tax_amt"),
						decode(
								S0_T1.outsrc_flg,
								value(true),
								S0_M18.repurc_obli_flg,
								value(false)
								).as("repurc_obli_flg"),
						decode(
								S0_T1.outsrc_flg,
								value(true),
								nvl(S0_M18.outsrc_upri_typ, value(getCo().outsrc_upri_typ()))
								).as("outsrc_upri_typ"),
						S0_T1.trd_cur_proc_upri,
						S0_T1.trd_cur_proc_amt,
						S0_T1.trd_cur_onr_prov_upri,
						S0_T1.trd_cur_onr_prov_amt,
						S0_T1.po_schd_dt,
						trunc(
							S0_T1.dlv_rqst_tm,
							MCDateFmt.DD
						).as("dlv_rqst_dt"),
						S0_T1.dlv_rqst_tm.as("dlv_rqst_hm"),
						trunc(
							S0_T1.rqst_dlv_rqst_tm,
							MCDateFmt.DD
						).as("rqst_dlv_rqst_dt"),
						S0_T1.rqst_dlv_rqst_tm.as("rqst_dlv_rqst_hm"),
						S0_T1.purc_schd_dt,
						S0_T1.rqst_avl_rqst_dt,
						S0_T1.drct_dlv_typ,
						S0_T1.po_schd_chg_typ,
						S0_T1.rqst_upd_stop_flg,
						S0_T1.rqst_crrct_flg,
						S0_T1.split_src_schd_no,
						S0_T1.bd_itm_cd,
						S0_T1.bd_itm_sub1,
						S0_T1.bd_itm_sub2,
						S0_T1.bd_itm_sub3,
						S0_T1.bd_sno1,
						S0_T1.bd_sno2,
						S0_T1.bd_sno3,
						S0_T1.bd_sno4,
						S0_T1.bd_lot_no,
						S0_T1.bd_sublot_no,
						S0_T1.bd_loc_cd,
						S0_T1.bd_dpt_cd,
						S0_M36.dpt_nm.as("bd_dpt_nm"),
						S0_T1.bd_wg_cd,
						S0_T1.bd_ctg_cd,
						S0_T1.bd_oper_cd,
						S0_T1.bd_slo_no,
						S0_T1.bd_iv_no,
						S0_T1.bd_po_no,
						S0_T1.bd_bp_cd,
						S0_T1.org_flg,
						S0_T1.abort_flg,
						S0_T1.abort_flg.as("bef_abort_flg"),
						S0_T1.add_flg,
						S0_T1.base_unit_po_qty,
						S0_T1.po_flg,
						S0_T1.intr_rmrks,
						S0_T1.trd_d_rmrks,
						S0_T1.po_cnt_rmrks,
						S0_T1.slo_no,
						S0_T1.slo_d_no,
						S0_T1.po_no,
						S0_T1.po_d_no,
						S0_T1.sub_char1,
						S0_T1.sub_char2,
						S0_T1.sub_char3,
						S0_T1.rqst_can_flg,
						S0_T7.purc_sts_typ,
						addDynamicSelect(DS0C_ITM_GRP),
						addDynamicSelect(DS0C_SPPL_GRP),
						// this field is appended by sql coverter.
						S0_M2.unit_cd.as("join_unit_cd_"),
						// this field is appended by sql coverter.
						S0_T4.wg_rqst_no.as("join_wg_rqst_no_")
					)
					.from(
						S0_T1
						.innerJoin(S0_M0).on(S0_T1.wg_cd.eq(S0_M0.wg_cd))
						.leftOuterJoin(S0_T6).on(S0_T1.po_d_no.eq(S0_T6.po_d_no))
						.leftOuterJoin(S0_T7).on(S0_T6.po_d_no.eq(S0_T7.po_d_no))
						.leftOuterJoin(S0_M2).on(
							S0_T1.itm_cd.eq(S0_M2.itm_cd)
							.and(S0_T1.itm_sub1.eq(S0_M2.itm_sub1))
							.and(S0_T1.itm_sub2.eq(S0_M2.itm_sub2))
							.and(S0_T1.itm_sub3.eq(S0_M2.itm_sub3))
						)
						.leftOuterJoin(S0_SUNDRYITM).on(
							S0_T1.itm_cd.eq(S0_SUNDRYITM.itm_cd)
							.and(S0_T1.itm_sub1.eq(S0_SUNDRYITM.itm_sub1))
							.and(S0_T1.itm_sub2.eq(S0_SUNDRYITM.itm_sub2))
							.and(S0_T1.itm_sub3.eq(S0_SUNDRYITM.itm_sub3))
							.and(S0_T1.sno1.eq(S0_SUNDRYITM.sno1))
							.and(S0_T1.sno2.eq(S0_SUNDRYITM.sno2))
							.and(S0_T1.sno3.eq(S0_SUNDRYITM.sno3))
							.and(S0_T1.sno4.eq(S0_SUNDRYITM.sno4))
						)
						.leftOuterJoin(S0_M4).on(
							S0_T1.base_unit_cd.eq(S0_M4.unit_cd)
							.and(S0_T1.itm_cd.eq(S0_M4.itm_cd))
							.and(S0_T1.itm_sub1.eq(S0_M4.itm_sub1))
							.and(S0_T1.itm_sub2.eq(S0_M4.itm_sub2))
							.and(S0_T1.itm_sub3.eq(S0_M4.itm_sub3))
						)
						.leftOuterJoin(S0_M11).on(
							S0_T1.purc_dpt_cd.eq(S0_M11.dpt_cd)
							.and(S0_T1.reg_dt.between(S0_M11.st_dt, S0_M11.end_dt))
						)
						.leftOuterJoin(S0_M36).on(
							S0_T1.bd_dpt_cd.eq(S0_M36.dpt_cd)
							.and(S0_T1.reg_dt.between(S0_M36.st_dt, S0_M36.end_dt))
						)
						.leftOuterJoin(S0_T4).on(
							S0_T1.po_schd_src_typ.eq(value(MSC_PO_SCHD_SRC_TYP.RQST.value()))
							.and(S0_T1.po_schd_src_no.eq(S0_T4.wg_rqst_prms_no))
						)
						.leftOuterJoin(S0_M18).on(S0_T1.sppl_cd.eq(S0_M18.bp_cd))
						.leftOuterJoin(S0_M20).on(S0_T1.dlv_cd.eq(S0_M20.bp_cd))
						.leftOuterJoin(S0_M21).on(S0_T1.tdlv_cd.eq(S0_M21.bp_cd))
						.leftOuterJoin(S0_M25).on(bind("base_cur_cd").eq(S0_M25.cur_cd))
						.leftOuterJoin(S0_M30).on(bind("ptax_cur_cd").eq(S0_M30.cur_cd))
						.leftOuterJoin(S0_M31).on(
							bracket(
								S0_T1.itm_cd.eq(S0_M31.itm_cd)
								.and(S0_T1.itm_sub1.eq(S0_M31.itm_sub1))
								.and(S0_T1.itm_sub2.eq(S0_M31.itm_sub2))
								.and(S0_T1.itm_sub3.eq(S0_M31.itm_sub3))
								.and(S0_M31.lcl_cd.eq(S0_M18.prnt_lcl_cd))
							)
						)
						.leftOuterJoin(S0_M33).on(
							bracket(
									S0_M33.dpt_cd.eq(S0_T1.rqst_fr_dpt_cd)
									.and(S0_T1.reg_dt.between(S0_M33.st_dt, S0_M33.end_dt))
								)
						)
						.leftOuterJoin(S0_T10).on
							(bracket(
									S0_T10.slo_d_no.eq(S0_T1.slo_d_no)
								)
						)
						.addDynamicView()
						.addDynamicView(DS0C_ITM_GRP)
						.addDynamicView(DS0C_SPPL_GRP)
						.addDynamicView(REP1)
					)
					.where(
						value(0).eq(value(0))
						.cutoff$and(S0_M18.sppl_iv_flg.eq(bind("iv_trgt_flg_str")))
						.cutoff$and(S0_T1.abort_flg.eq(bind("abort_flg_str")))
						.cutoff$and(S0_T1.interim_flg.eq(bind("interim_flg_str")))
						.cutoff$and(S0_T1.po_flg.eq(bind("po_flg_str")))
						.cutoff$and(S0_T1.po_schd_dt.gte(bind("po_schd_dt_fr")))
						.cutoff$and(S0_T1.po_schd_dt.lte(bind("po_schd_dt_to")))
						.cutoff$and(S0_T1.dlv_rqst_tm.gte(bind("dlv_rqst_hm_fr")))
						.cutoff$and(S0_T1.dlv_rqst_tm.lte(bind("dlv_rqst_hm_to")))
						.cutoff$and(S0_T1.purc_schd_dt.gte(bind("purc_schd_dt_fr")))
						.cutoff$and(S0_T1.purc_schd_dt.lte(bind("purc_schd_dt_to")))
						.cutoff$and(S0_T1.reg_dt.gte(bind("reg_dt_fr")))
						.cutoff$and(S0_T1.reg_dt.lte(bind("reg_dt_to")))
						.cutoff$and(S0_T1.rqst_dlv_rqst_tm.gte(bind("rqst_dlv_rqst_hm_fr")))
						.cutoff$and(S0_T1.rqst_dlv_rqst_tm.lte(bind("rqst_dlv_rqst_hm_to")))
						.addDynamicPredicate()
						.cutoff$and(S0_T1.po_schd_chg_typ.like(bind("po_schd_chg_typ")))
						.cutoff$and(S0_T7.purc_sts_typ.like(bind("purc_sts_typ")))
						.cutoff$and(S0_T1.sppl_cd.like(bind("sppl_cd")))
						.cutoff$and(S0_M18.bp_nm.like(bind("sppl_nm")))
						.cutoff$and(S0_T1.maker_cd.like(bind("maker_cd")))
						.cutoff$and(S0_T1.in_to_loc_cd.like(bind("in_to_loc_cd")))
						.cutoff$and(S0_T1.str_ln_cd.like(bind("str_ln_cd")))
						.cutoff$and(S0_T1.dlv_cd.like(bind("dlv_cd")))
						.cutoff$and(
							nvl(
								S0_T1.dlv_nm,
								S0_M20.bp_nm
							).like(bind("dlv_nm"))
						)
						.cutoff$and(S0_T1.tdlv_cd.like(bind("tdlv_cd")))
						.cutoff$and(
							nvl(
								S0_T1.tdlv_nm,
								S0_M20.bp_nm
							).like(bind("tdlv_nm"))
						)
						.cutoff$and(S0_M2.itm_typ.like(bind("itm_typ")))
						.cutoff$and(S0_M2.itm_typ_d_cd.like(bind("itm_typ_d_cd")))
						.cutoff$and(S0_T1.itm_cd.like(bind("itm_cd")))
						.cutoff$and(S0_T1.itm_sub1.like(bind("itm_sub1")))
						.cutoff$and(S0_T1.itm_sub2.like(bind("itm_sub2")))
						.cutoff$and(S0_T1.itm_sub3.like(bind("itm_sub3")))
						.cutoff$and(
							coalesce(
								S0_SUNDRYITM.itm_nm,
								S0_T1.itm_nm,
								S0_M2.itm_nm
							).like(bind("itm_nm"))
						)
						.cutoff$and(S0_T10.cst_itm_cd.like(bind("cst_itm_cd"))
								.and(S0_T1.dlv_cd.isNotNull()))
						.cutoff$and(S0_T10.cst_itm_nm.like(bind("cst_itm_nm"))
								.and(S0_T1.dlv_cd.isNotNull()))
						.cutoff$and(S0_T1.ver_no.like(bind("ver_no")))
						.cutoff$and(S0_T1.sno1.like(bind("sno1")))
						.cutoff$and(S0_T1.sno2.like(bind("sno2")))
						.cutoff$and(S0_T1.sno3.like(bind("sno3")))
						.cutoff$and(S0_T1.sno4.like(bind("sno4")))
						.cutoff$and(S0_T1.purc_usr_cd.like(bind("purc_usr_cd")))
						.cutoff$and(S0_T1.purc_dpt_cd.like(bind("purc_dpt_cd")))
						.cutoff$and(S0_M11.dpt_nm.like(bind("purc_dpt_nm")))
						.cutoff$and(S0_T1.wg_cd.like(bind("purc_dpt_wg_cd")))
						.cutoff$and(S0_T1.rqst_wg_cd.like(bind("rqst_wg_cd")))
						.cutoff$and(S0_T1.rqst_fr_usr_cd.like(bind("rqst_fr_usr_cd")))
						.cutoff$and(S0_T1.rqst_fr_dpt_cd.like(bind("rqst_fr_dpt_cd")))
						.cutoff$and(S0_M33.dpt_nm.like(bind("rqst_fr_dpt_nm")))
						.cutoff$and(S0_T1.po_schd_src_typ.like(bind("po_schd_src_typ")))
						.cutoff$and(S0_T1.po_schd_src_no.like(bind("po_schd_src_no")))
						.cutoff$and(S0_T1.po_schd_no.like(bind("po_schd_no")))
						.cutoff$and(S0_T1.slo_no.like(bind("slo_no")))
						.cutoff$and(S0_T1.slo_d_no.like(bind("slo_d_no")))
						.cutoff$and(S0_T1.po_no.like(bind("po_no")))
						.cutoff$and(S0_T1.intr_rmrks.like(bind("intr_rmrks")))
						.cutoff$and(S0_T1.trd_d_rmrks.like(bind("trd_d_rmrks")))
						.cutoff$and(S0_T1.po_cnt_rmrks.like(bind("po_cnt_rmrks")))
						.cutoff$and(S0_T1.sub_char1.like(bind("sub_char1")))
						.cutoff$and(S0_T1.sub_char2.like(bind("sub_char2")))
						.cutoff$and(S0_T1.sub_char3.like(bind("sub_char3")))
						.and(
							not(
								S0_T1.po_schd_src_typ.eq(value(MSC_PO_SCHD_SRC_TYP.PPLN.value()))
								.and(S0_T1.pln_itm_ord_no.isNull())
							)
						)
						.addDynamicPredicate(DS0C_ITM_GRP)
						.addDynamicPredicate(DS0C_SPPL_GRP)
						.addDynamicPredicate(REP1)
					)
					.orderBy(addDynamicOrderBy(REP1))
			)
			.setDynamicSQLInfo(
				when(boundOr("itm_typ_d_nm"))
					.view(v -> v.leftOuterJoin(S0_M23).on(S0_M2.itm_typ.eq(S0_M23.itm_typ).and(S0_M2.itm_typ_d_cd.eq(S0_M23.itm_typ_d_cd))))
					.predicate(p -> p.cutoff$and(S0_M23.itm_typ_d_nm.like(bind("itm_typ_d_nm")))),
				when(boundOr("rqst_wg_nm"))
					.view(v -> v.leftOuterJoin(S0_M5).on(S0_T1.rqst_wg_cd.eq(S0_M5.wg_cd)))
					.predicate(p -> p.cutoff$and(S0_M5.wg_nm.like(bind("rqst_wg_nm")))),
				when(boundOr("in_to_loc_wg_nm", "site_nm", "site_cd", "in_to_loc_wg_cd", "in_to_loc_nm"))
					.view(v -> v.leftOuterJoin(S0_M6).on(S0_T1.in_to_loc_cd.eq(S0_M6.loc_cd)))
					.predicate(p -> p.cutoff$and(S0_M6.site_cd.like(bind("site_cd"))).cutoff$and(S0_M6.wg_cd.like(bind("in_to_loc_wg_cd"))).cutoff$and(S0_M6.loc_nm.like(bind("in_to_loc_nm")))),
				when(boundOr("in_to_loc_wg_nm"))
					.view(v -> v.leftOuterJoin(S0_M7).on(S0_M6.wg_cd.eq(S0_M7.wg_cd)))
					.predicate(p -> p.cutoff$and(S0_M7.wg_nm.like(bind("in_to_loc_wg_nm")))),
				when(boundOr("site_nm"))
					.view(v -> v.leftOuterJoin(S0_M19).on(S0_M6.site_cd.eq(S0_M19.site_cd)))
					.predicate(p -> p.cutoff$and(S0_M19.site_nm.like(bind("site_nm")))),
				when(boundOr("str_ln_nm"))
					.view(v -> v.leftOuterJoin(S0_M8).on(S0_T1.str_ln_cd.eq(S0_M8.str_ln_cd).and(S0_T1.in_to_loc_cd.eq(S0_M8.loc_cd))))
					.predicate(p -> p.cutoff$and(S0_M8.str_ln_nm.like(bind("str_ln_nm")))),
				when(boundOr("purc_usr_nm"))
					.view(v -> v.leftOuterJoin(S0_M10).on(S0_T1.purc_usr_cd.eq(S0_M10.usr_cd)))
					.predicate(p -> p.cutoff$and(S0_M10.usr_nm.like(bind("purc_usr_nm")))),
				when(boundOr("purc_dpt_wg_nm"))
					.view(v -> v.leftOuterJoin(S0_M12).on(S0_T1.wg_cd.eq(S0_M12.wg_cd)))
					.predicate(p -> p.cutoff$and(S0_M12.wg_nm.like(bind("purc_dpt_wg_nm")))),
				when(boundOr("rqst_fr_usr_nm"))
					.view(v -> v.leftOuterJoin(S0_M32).on(S0_T1.rqst_fr_usr_cd.eq(S0_M32.usr_cd)))
					.predicate(p -> p.cutoff$and(S0_M32.usr_nm.like(bind("rqst_fr_usr_nm")))),
				when(boundOr("wrk_no", "wrk_nm"))
					.view(v -> v.leftOuterJoin(S0_T2).on(S0_T1.sno1.eq(S0_T2.sno1)))
					.predicate(p -> p.cutoff$and(S0_T2.wrk_no.like(bind("wrk_no"))).cutoff$and(S0_T2.wrk_nm.like(bind("wrk_nm")))),
				when(boundOr("wg_rqst_src_typ", "wg_rqst_src_no", "wg_rqst_no"))
					.view(v -> v.leftOuterJoin(S0_T5).on(S0_T4.wg_rqst_no.eq(S0_T5.wg_rqst_no)))
					.predicate(p -> p.cutoff$and(S0_T5.wg_rqst_src_typ.like(bind("wg_rqst_src_typ"))).cutoff$and(S0_T5.wg_rqst_src_no.like(bind("wg_rqst_src_no"))).cutoff$and(S0_T5.wg_rqst_no.like(bind("wg_rqst_no")))),
				when(boundOr("maker_nm"))
					.view(v -> v.leftOuterJoin(S0_M22).on(S0_T1.maker_cd.eq(S0_M22.bp_cd)))
					.predicate(p -> p.cutoff$and(S0_M22.bp_nm.like(bind("maker_nm")))),
				when(boundOr("itm_grp_flg1"))
					.select(DS0C_ITM_GRP, S0_M2.itm_grp_cd1.as("itm_grp_cd1"), S0_IM1.itm_grp_nm.as("itm_grp_nm1"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_IM1).on(S0_M2.itm_grp_cd1.eq(S0_IM1.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP1.value()).eq(S0_IM1.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M2.itm_grp_cd1.like(bind("itm_grp_cd1"))).cutoff$and(S0_IM1.itm_grp_nm.like(bind("itm_grp_nm1")))),
				when(boundOr("itm_grp_flg2"))
					.select(DS0C_ITM_GRP, S0_M2.itm_grp_cd2.as("itm_grp_cd2"), S0_IM2.itm_grp_nm.as("itm_grp_nm2"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_IM2).on(S0_M2.itm_grp_cd2.eq(S0_IM2.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP2.value()).eq(S0_IM2.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M2.itm_grp_cd2.like(bind("itm_grp_cd2"))).cutoff$and(S0_IM2.itm_grp_nm.like(bind("itm_grp_nm2")))),
				when(boundOr("itm_grp_flg3"))
					.select(DS0C_ITM_GRP, S0_M2.itm_grp_cd3.as("itm_grp_cd3"), S0_IM3.itm_grp_nm.as("itm_grp_nm3"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_IM3).on(S0_M2.itm_grp_cd3.eq(S0_IM3.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP3.value()).eq(S0_IM3.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M2.itm_grp_cd3.like(bind("itm_grp_cd3"))).cutoff$and(S0_IM3.itm_grp_nm.like(bind("itm_grp_nm3")))),
				when(boundOr("itm_grp_flg4"))
					.select(DS0C_ITM_GRP, S0_M2.itm_grp_cd4.as("itm_grp_cd4"), S0_IM4.itm_grp_nm.as("itm_grp_nm4"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_IM4).on(S0_M2.itm_grp_cd4.eq(S0_IM4.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP4.value()).eq(S0_IM4.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M2.itm_grp_cd4.like(bind("itm_grp_cd4"))).cutoff$and(S0_IM4.itm_grp_nm.like(bind("itm_grp_nm4")))),
				when(boundOr("itm_grp_flg5"))
					.select(DS0C_ITM_GRP, S0_M2.itm_grp_cd5.as("itm_grp_cd5"), S0_IM5.itm_grp_nm.as("itm_grp_nm5"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_IM5).on(S0_M2.itm_grp_cd5.eq(S0_IM5.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP5.value()).eq(S0_IM5.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M2.itm_grp_cd5.like(bind("itm_grp_cd5"))).cutoff$and(S0_IM5.itm_grp_nm.like(bind("itm_grp_nm5")))),
				when(boundOr("itm_grp_flg6"))
					.select(DS0C_ITM_GRP, S0_M2.itm_grp_cd6.as("itm_grp_cd6"), S0_IM6.itm_grp_nm.as("itm_grp_nm6"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_IM6).on(S0_M2.itm_grp_cd6.eq(S0_IM6.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP6.value()).eq(S0_IM6.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M2.itm_grp_cd6.like(bind("itm_grp_cd6"))).cutoff$and(S0_IM6.itm_grp_nm.like(bind("itm_grp_nm6")))),
				when(boundOr("itm_grp_flg7"))
					.select(DS0C_ITM_GRP, S0_M2.itm_grp_cd7.as("itm_grp_cd7"), S0_IM7.itm_grp_nm.as("itm_grp_nm7"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_IM7).on(S0_M2.itm_grp_cd7.eq(S0_IM7.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP7.value()).eq(S0_IM7.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M2.itm_grp_cd7.like(bind("itm_grp_cd7"))).cutoff$and(S0_IM7.itm_grp_nm.like(bind("itm_grp_nm7")))),
				when(boundOr("itm_grp_flg8"))
					.select(DS0C_ITM_GRP, S0_M2.itm_grp_cd8.as("itm_grp_cd8"), S0_IM8.itm_grp_nm.as("itm_grp_nm8"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_IM8).on(S0_M2.itm_grp_cd8.eq(S0_IM8.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP8.value()).eq(S0_IM8.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M2.itm_grp_cd8.like(bind("itm_grp_cd8"))).cutoff$and(S0_IM8.itm_grp_nm.like(bind("itm_grp_nm8")))),
				when(boundOr("itm_grp_flg9"))
					.select(DS0C_ITM_GRP, S0_M2.itm_grp_cd9.as("itm_grp_cd9"), S0_IM9.itm_grp_nm.as("itm_grp_nm9"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_IM9).on(S0_M2.itm_grp_cd9.eq(S0_IM9.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP9.value()).eq(S0_IM9.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M2.itm_grp_cd9.like(bind("itm_grp_cd9"))).cutoff$and(S0_IM9.itm_grp_nm.like(bind("itm_grp_nm9")))),
				when(boundOr("itm_grp_flg10"))
					.select(DS0C_ITM_GRP, S0_M2.itm_grp_cd10.as("itm_grp_cd10"), S0_IM10.itm_grp_nm.as("itm_grp_nm10"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_IM10).on(S0_M2.itm_grp_cd10.eq(S0_IM10.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP10.value()).eq(S0_IM10.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M2.itm_grp_cd10.like(bind("itm_grp_cd10"))).cutoff$and(S0_IM10.itm_grp_nm.like(bind("itm_grp_nm10")))),
				when(boundOr("sppl_grp_flg1"))
					.select(DS0C_SPPL_GRP, S0_M18.bp_grp_cd1.as("sppl_grp_cd1"), S0_BM1.bp_grp_nm.as("sppl_grp_nm1"))
					.view(DS0C_SPPL_GRP, v -> v.leftOuterJoin(S0_BM1).on(S0_M18.bp_grp_cd1.eq(S0_BM1.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP1.value()).eq(S0_BM1.bp_grp_typ))))
					.predicate(DS0C_SPPL_GRP, p -> p.cutoff$and(S0_M18.bp_grp_cd1.like(bind("sppl_grp_cd1"))).cutoff$and(S0_BM1.bp_grp_nm.like(bind("sppl_grp_nm1")))),
				when(boundOr("sppl_grp_flg2"))
					.select(DS0C_SPPL_GRP, S0_M18.bp_grp_cd2.as("sppl_grp_cd2"), S0_BM2.bp_grp_nm.as("sppl_grp_nm2"))
					.view(DS0C_SPPL_GRP, v -> v.leftOuterJoin(S0_BM2).on(S0_M18.bp_grp_cd2.eq(S0_BM2.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP2.value()).eq(S0_BM2.bp_grp_typ))))
					.predicate(DS0C_SPPL_GRP, p -> p.cutoff$and(S0_M18.bp_grp_cd2.like(bind("sppl_grp_cd2"))).cutoff$and(S0_BM2.bp_grp_nm.like(bind("sppl_grp_nm2")))),
				when(boundOr("sppl_grp_flg3"))
					.select(DS0C_SPPL_GRP, S0_M18.bp_grp_cd3.as("sppl_grp_cd3"), S0_BM3.bp_grp_nm.as("sppl_grp_nm3"))
					.view(DS0C_SPPL_GRP, v -> v.leftOuterJoin(S0_BM3).on(S0_M18.bp_grp_cd3.eq(S0_BM3.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP3.value()).eq(S0_BM3.bp_grp_typ))))
					.predicate(DS0C_SPPL_GRP, p -> p.cutoff$and(S0_M18.bp_grp_cd3.like(bind("sppl_grp_cd3"))).cutoff$and(S0_BM3.bp_grp_nm.like(bind("sppl_grp_nm3")))),
				when(boundOr("sppl_grp_flg4"))
					.select(DS0C_SPPL_GRP, S0_M18.bp_grp_cd4.as("sppl_grp_cd4"), S0_BM4.bp_grp_nm.as("sppl_grp_nm4"))
					.view(DS0C_SPPL_GRP, v -> v.leftOuterJoin(S0_BM4).on(S0_M18.bp_grp_cd4.eq(S0_BM4.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP4.value()).eq(S0_BM4.bp_grp_typ))))
					.predicate(DS0C_SPPL_GRP, p -> p.cutoff$and(S0_M18.bp_grp_cd4.like(bind("sppl_grp_cd4"))).cutoff$and(S0_BM4.bp_grp_nm.like(bind("sppl_grp_nm4")))),
				when(boundOr("sppl_grp_flg5"))
					.select(DS0C_SPPL_GRP, S0_M18.bp_grp_cd5.as("sppl_grp_cd5"), S0_BM5.bp_grp_nm.as("sppl_grp_nm5"))
					.view(DS0C_SPPL_GRP, v -> v.leftOuterJoin(S0_BM5).on(S0_M18.bp_grp_cd5.eq(S0_BM5.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP5.value()).eq(S0_BM5.bp_grp_typ))))
					.predicate(DS0C_SPPL_GRP, p -> p.cutoff$and(S0_M18.bp_grp_cd5.like(bind("sppl_grp_cd5"))).cutoff$and(S0_BM5.bp_grp_nm.like(bind("sppl_grp_nm5")))),
				when(boundOr("sppl_grp_flg6"))
					.select(DS0C_SPPL_GRP, S0_M18.bp_grp_cd6.as("sppl_grp_cd6"), S0_BM6.bp_grp_nm.as("sppl_grp_nm6"))
					.view(DS0C_SPPL_GRP, v -> v.leftOuterJoin(S0_BM6).on(S0_M18.bp_grp_cd6.eq(S0_BM6.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP6.value()).eq(S0_BM6.bp_grp_typ))))
					.predicate(DS0C_SPPL_GRP, p -> p.cutoff$and(S0_M18.bp_grp_cd6.like(bind("sppl_grp_cd6"))).cutoff$and(S0_BM6.bp_grp_nm.like(bind("sppl_grp_nm6")))),
				when(boundOr("sppl_grp_flg7"))
					.select(DS0C_SPPL_GRP, S0_M18.bp_grp_cd7.as("sppl_grp_cd7"), S0_BM7.bp_grp_nm.as("sppl_grp_nm7"))
					.view(DS0C_SPPL_GRP, v -> v.leftOuterJoin(S0_BM7).on(S0_M18.bp_grp_cd7.eq(S0_BM7.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP7.value()).eq(S0_BM7.bp_grp_typ))))
					.predicate(DS0C_SPPL_GRP, p -> p.cutoff$and(S0_M18.bp_grp_cd7.like(bind("sppl_grp_cd7"))).cutoff$and(S0_BM7.bp_grp_nm.like(bind("sppl_grp_nm7")))),
				when(boundOr("sppl_grp_flg8"))
					.select(DS0C_SPPL_GRP, S0_M18.bp_grp_cd8.as("sppl_grp_cd8"), S0_BM8.bp_grp_nm.as("sppl_grp_nm8"))
					.view(DS0C_SPPL_GRP, v -> v.leftOuterJoin(S0_BM8).on(S0_M18.bp_grp_cd8.eq(S0_BM8.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP8.value()).eq(S0_BM8.bp_grp_typ))))
					.predicate(DS0C_SPPL_GRP, p -> p.cutoff$and(S0_M18.bp_grp_cd8.like(bind("sppl_grp_cd8"))).cutoff$and(S0_BM8.bp_grp_nm.like(bind("sppl_grp_nm8")))),
				when(boundOr("sppl_grp_flg9"))
					.select(DS0C_SPPL_GRP, S0_M18.bp_grp_cd9.as("sppl_grp_cd9"), S0_BM9.bp_grp_nm.as("sppl_grp_nm9"))
					.view(DS0C_SPPL_GRP, v -> v.leftOuterJoin(S0_BM9).on(S0_M18.bp_grp_cd9.eq(S0_BM9.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP9.value()).eq(S0_BM9.bp_grp_typ))))
					.predicate(DS0C_SPPL_GRP, p -> p.cutoff$and(S0_M18.bp_grp_cd9.like(bind("sppl_grp_cd9"))).cutoff$and(S0_BM9.bp_grp_nm.like(bind("sppl_grp_nm9")))),
				when(boundOr("sppl_grp_flg10"))
					.select(DS0C_SPPL_GRP, S0_M18.bp_grp_cd10.as("sppl_grp_cd10"), S0_BM10.bp_grp_nm.as("sppl_grp_nm10"))
					.view(DS0C_SPPL_GRP, v -> v.leftOuterJoin(S0_BM10).on(S0_M18.bp_grp_cd10.eq(S0_BM10.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP10.value()).eq(S0_BM10.bp_grp_typ))))
					.predicate(DS0C_SPPL_GRP, p -> p.cutoff$and(S0_M18.bp_grp_cd10.like(bind("sppl_grp_cd10"))).cutoff$and(S0_BM10.bp_grp_nm.like(bind("sppl_grp_nm10"))))
			)
			.setJoinInfo(
				joinInfo(
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
						.add(MAM_UNIT_R.class, r -> toCondition(
							r.getStringNE("cont_fctr_unit_cd")
						))
						.addSelect(m -> toArray(
							m.unit_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("cont_fctr_unit_nm", m.unit_nm());
					}),
					j -> j
						.add(MAM_UNIT_R.class, r -> toCondition(
							r.getStringNE("join_unit_cd_")
						))
						.addSelect(m -> toArray(
							m.unit_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("base_unit_nm", m.unit_nm());
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
							m.rnd_typ,
							m.unit_cd
						))
						.addMap((r, m) -> {
							r.setNumberNE("trd_unit_dec_place", m.dec_place());
							r.setStringNE("trd_unit_rnd_typ", m.rnd_typ());
							r.setNumberNE("trd_unit_conv_base_qty", m.conv_base_qty());
							r.setNumberNE("trd_unit_conv_qty", m.conv_qty());
							r.setStringNE("join_unit_cd_", m.unit_cd());
					}),
					j -> j
						.add(MAM_UNIT_R.class, r -> toCondition(
							r.getStringNE("join_unit_cd_")
						))
						.addSelect(m -> toArray(
							m.unit_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("trd_unit_nm", m.unit_nm());
					}),
					j -> j
						.add(MAM_WG_R.class, r -> toCondition(
							r.getStringNE("rqst_wg_cd")
						))
						.addSelect(m -> toArray(
							m.wg_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("rqst_wg_nm", m.wg_nm());
					}),
					j -> j
						.add(MAM_LOC_R.class, r -> toCondition(
							r.getStringNE("in_to_loc_cd")
						))
						.addSelect(m -> toArray(
							m.cal_cd,
							m.lg_grp_cd,
							m.loc_grp_cd,
							m.loc_nm,
							m.site_cd,
							m.sppl_cd,
							m.str_ln_tgt_flg,
							m.wg_cd
						))
						.addMap((r, m) -> {
							r.setStringNE("in_to_loc_nm", m.loc_nm());
							r.setStringNE("site_cd", m.site_cd());
							r.setStringNE("lg_grp_cd", m.lg_grp_cd());
							r.setStringNE("loc_grp_cd", m.loc_grp_cd());
							r.setStringNE("in_to_loc_cal_cd", m.cal_cd());
							r.setStringNE("in_to_loc_wg_cd", m.wg_cd());
							r.setStringNE("outsrc_sppl_cd", m.sppl_cd());
							r.setBooleanNE("str_ln_tgt_flg", m.str_ln_tgt_flg());
							r.setStringNE("bef_in_to_loc_wg_cd", m.wg_cd());
							r.setStringNE("bef_lg_grp_cd", m.lg_grp_cd());
							r.setStringNE("bef_loc_grp_cd", m.loc_grp_cd());
					}),
					j -> j
						.add(MAM_WG_R.class, r -> toCondition(
							r.getStringNE("in_to_loc_wg_cd")
						))
						.addSelect(m -> toArray(
							m.wg_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("in_to_loc_wg_nm", m.wg_nm());
					}),
					j -> j
						.add(MAM_STR_LN_R.class, r -> toCondition(
							r.getStringNE("in_to_loc_cd"),
							r.getStringNE("str_ln_cd")
						))
						.addSelect(m -> toArray(
							m.str_ln_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("str_ln_nm", m.str_ln_nm());
					}),
					j -> j
						.add(MAM_LOC_R.class, r -> toCondition(
							r.getStringNE("mfg_loc_cd")
						))
						.addSelect(m -> toArray(
							m.loc_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("mfg_loc_nm", m.loc_nm());
					}),
					j -> j
						.add(MAM_USR_R.class, r -> toCondition(
							r.getStringNE("purc_usr_cd")
						))
						.addSelect(m -> toArray(
							m.usr_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("purc_usr_nm", m.usr_nm());
					}),
					j -> j
						.add(MAM_USR_R.class, r -> toCondition(
							r.getStringNE("rqst_fr_usr_cd")
						))
						.addSelect(m -> toArray(
							m.usr_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("rqst_fr_usr_nm", m.usr_nm());
					}),
					j -> j
						.add(MAM_WG_R.class, r -> toCondition(
							r.getStringNE("purc_dpt_wg_cd")
						))
						.addSelect(m -> toArray(
							m.wg_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("purc_dpt_wg_nm", m.wg_nm());
					}),
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
						.add(MAM_BIZ_RSN_R.class, r -> toCondition(
							r.getStringNE("purc_rsn_cd")
						))
						.addSelect(m -> toArray(
							m.biz_rsn_nm,
							m.xpns_purc_flg
						))
						.addMap((r, m) -> {
							r.setStringNE("purc_rsn_nm", m.biz_rsn_nm());
							r.setBooleanNE("xpns_purc_flg", m.xpns_purc_flg());
					}),
					j -> j
						.add(MAM_ITM_R.class, r -> toCondition(
							r.getStringNE("bd_itm_cd"),
							r.getStringNE("bd_itm_sub1"),
							r.getStringNE("bd_itm_sub2"),
							r.getStringNE("bd_itm_sub3")
						))
						.addSelect(m -> toArray(
							m.itm_nm,
							m.lot_mng_typ,
							m.lot_no_typ,
							m.sno1_mng_typ,
							m.sno2_mng_typ,
							m.sno3_mng_typ,
							m.sno4_mng_typ,
							m.sublot_mng_typ,
							m.sublot_no_typ
						))
						.addMap((r, m) -> {
							r.setStringNE("bd_itm_nm", m.itm_nm());
							r.setStringNE("bd_lot_mng_typ", m.lot_mng_typ());
							r.setStringNE("bd_lot_no_typ", m.lot_no_typ());
							r.setStringNE("bd_sublot_mng_typ", m.sublot_mng_typ());
							r.setStringNE("bd_sublot_no_typ", m.sublot_no_typ());
							r.setStringNE("bd_sno1_mng_typ", m.sno1_mng_typ());
							r.setStringNE("bd_sno2_mng_typ", m.sno2_mng_typ());
							r.setStringNE("bd_sno3_mng_typ", m.sno3_mng_typ());
							r.setStringNE("bd_sno4_mng_typ", m.sno4_mng_typ());
					}),
					j -> j
						.add(MAM_LOC_R.class, r -> toCondition(
							r.getStringNE("bd_loc_cd")
						))
						.addSelect(m -> toArray(
							m.loc_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("bd_loc_nm", m.loc_nm());
					}),
					j -> j
						.add(MAM_COST_CTG_R.class, r -> toCondition(
							r.getStringNE("bd_ctg_cd")
						))
						.addSelect(m -> toArray(
							m.ctg_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("bd_ctg_nm", m.ctg_nm());
					}),
					j -> j
						.add(MAM_OPER_R.class, r -> toCondition(
							r.getStringNE("bd_oper_cd")
						))
						.addSelect(m -> toArray(
							m.oper_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("bd_oper_nm", m.oper_nm());
					}),
					j -> j
						.add(MST_WG_RQST_R.class, r -> toCondition(
							r.getStringNE("join_wg_rqst_no_")
						))
						.addSelect(m -> toArray(
							m.wg_rqst_src_no,
							m.wg_rqst_src_typ,
							m.wg_rqst_no
						))
						.addMap((r, m) -> {
							r.setStringNE("wg_rqst_src_typ", m.wg_rqst_src_typ());
							r.setStringNE("wg_rqst_src_no", m.wg_rqst_src_no());
							r.setStringNE("wg_rqst_no", m.wg_rqst_no());
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
						.add(MAM_CNTRY_R.class, r -> toCondition(
							r.getStringNE("tdlv_cntry_cd")
						))
						.addSelect(m -> toArray(
							m.cntry_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("tdlv_cntry_nm", m.cntry_nm());
					}),
					j -> j
						.add(MAM_BP_R.class, r -> toCondition(
							r.getStringNE("maker_cd")
						))
						.addSelect(m -> toArray(
							m.bp_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("maker_nm", m.bp_nm());
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
							r.setNumberNE("trd_cur_amt_dec_place", m.amt_dec_place());
							r.setNumberNE("trd_cur_upri_dec_place", m.upri_dec_place());
					})
				)
			);
	}

	/*
	 * MSBDL0030_MST_PO_SCHD_S01_WHERE01
	 */
	static MCDynamicSQLInfo MSBDL0030_MST_PO_SCHD_S01_WHERE01() {
		MST_PO_SCHD_R S0T1 = MST_PO_SCHD_R.create("T1");
		MCDynamicSQLID REP1 = createDynamicSQLID("REP1");

		return when(null)
				.predicate(REP1, p -> p.and(S0T1.po_schd_chg_typ.in(value(MSC_PO_SCHD_CHG_TYP.NOT_CHG.value()), value(MSC_PO_SCHD_CHG_TYP.DIV_ADD.value())).and(S0T1.po_flg.eq(value(false)))))
				.orderBy(REP1, S0T1.po_schd_no.asc());
	}

	/*
	 * MSBDL0030_MST_PO_SCHD_S01_WHERE02
	 */
	static MCDynamicSQLInfo MSBDL0030_MST_PO_SCHD_S01_WHERE02() {
		MST_PO_SCHD_R S0T1 = MST_PO_SCHD_R.create("T1");
		MCDynamicSQLID REP1 = createDynamicSQLID("REP1");

		return when(null)
				.predicate(REP1, p -> p.and(S0T1.po_schd_src_typ.eq(value(MSC_PO_SCHD_SRC_TYP.UPLND.value()))
						.or(S0T1.po_schd_src_typ.eq(value(MSC_PO_SCHD_SRC_TYP.OP.value())))
						.or(S0T1.po_schd_src_typ.eq(value(MSC_PO_SCHD_SRC_TYP.SLO.value())).and(S0T1.rqst_can_flg.eq(value(true)))
						.or(S0T1.po_schd_src_typ.eq(value(MSC_PO_SCHD_SRC_TYP.RQST.value())).and(S0T1.rqst_can_flg.eq(value(true))))))
						.and(S0T1.po_schd_chg_typ.in(value(MSC_PO_SCHD_CHG_TYP.NOT_CHG.value())))
						.and(S0T1.po_flg.eq(value(false)))
						.and(S0T1.abort_flg.eq(value(false))))
				.orderBy(REP1, S0T1.po_schd_no.asc());
	}

	/*
	 * MSBDL0030_MST_PO_SCHD_S01_WHERE03
	 */
	static MCDynamicSQLInfo MSBDL0030_MST_PO_SCHD_S01_WHERE03() {
		MST_PO_SCHD_R S0T1 = MST_PO_SCHD_R.create("T1");
		MCDynamicSQLID REP1 = createDynamicSQLID("REP1");

		return when(null)
				.orderBy(REP1, S0T1.po_schd_no.asc());
	}

	/*
	 * MSBDL0030_MST_PO_SCHD_S01_WHERE04
	 */
	static MCDynamicSQLInfo MSBDL0030_MST_PO_SCHD_S01_WHERE04() {
		MST_PO_SCHD_R S0T1 = MST_PO_SCHD_R.create("T1");
		MCDynamicSQLID REP1 = createDynamicSQLID("REP1");

		return when(null)
				.predicate(REP1, p -> p.and(S0T1.po_schd_chg_typ.in(value(MSC_PO_SCHD_CHG_TYP.NOT_CHG.value()), value(MSC_PO_SCHD_CHG_TYP.DIV_ADD.value()))
						.and(S0T1.rqst_crrct_flg.eq(value(true)))))
				.orderBy(REP1, S0T1.po_schd_no.asc());
	}

	/*
	 * MSBDL0030_MST_PO_SCHD_S01_WHERE05
	 */
	static MCDynamicSQLInfo MSBDL0030_MST_PO_SCHD_S01_WHERE05() {
		MST_PO_SCHD_R S0T1 = MST_PO_SCHD_R.create("T1");
		MAM_ITM_R S0M2 = MAM_ITM_R.create("M2");
		MST_ITM_MFG_INST_R ST1 = MST_ITM_MFG_INST_R.create("ST1");
		MCDynamicSQLID REP1 = createDynamicSQLID("REP1");

		return when(null)
				.predicate(REP1, p -> p.and(S0T1.po_schd_src_typ.eq(value(MSC_PO_SCHD_SRC_TYP.UPLND.value()))
						.or(S0T1.po_schd_src_typ.eq(value(MSC_PO_SCHD_SRC_TYP.OP.value())))
						.or(S0T1.po_schd_src_typ.eq(value(MSC_PO_SCHD_SRC_TYP.PPLN.value()))
						.or(S0T1.po_schd_src_typ.eq(value(MSC_PO_SCHD_SRC_TYP.SLO.value())))))
						.and(S0T1.po_schd_chg_typ.in(value(MSC_PO_SCHD_CHG_TYP.NOT_CHG.value()), value(MSC_PO_SCHD_CHG_TYP.DIV_ADD.value())))
						.and(S0T1.po_flg.eq(value(false)))
						.and(S0T1.dlv_cd.isNull())
						.and(S0T1.abort_flg.eq(value(false)))
						.and(S0M2.dscnt_itm_flg.eq(value(false)))
						.and(notExists(subQuery()
								.select(value("X"))
								.from(ST1)
								.where(S0T1.outsrc_itm_ord_no.eq(ST1.itm_ord_no).and(ST1.can_flg.eq(value(false)))))))
				.orderBy(REP1, S0T1.po_schd_no.asc());
	}
}