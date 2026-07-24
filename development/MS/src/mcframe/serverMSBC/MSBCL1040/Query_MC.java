package mcframe.serverMSBC.MSBCL1040;

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
	 * -- MSBCL1040_MST_ITM_ORDER_Query_S01
	 */
	static MCQueryPlan MSBCL1040_MST_ITM_ORDER_S01() {
		MST_ITM_ORDER_R S0_T1 = MST_ITM_ORDER_R.create("T1");
		MSVT_WRK_SNO_R S0_T2 = MSVT_WRK_SNO_R.create("T2");
		MCTempView S0_T3 = createTempView("T3");
		MCTempView S0_T5 = createTempView("T5");
		MST_PO_R S0_T6 = MST_PO_R.create("T6");
		MAM_ITM_R S0_M1 = MAM_ITM_R.create("M1");
		MAM_SUNDRY_ITM_R S0_M2 = MAM_SUNDRY_ITM_R.create("M2");
		MAVM_ITM_WG_R S0_M3 = MAVM_ITM_WG_R.create("M3");
		MAVM_RD_LOC_R S0_M4 = MAVM_RD_LOC_R.create("M4");
		MAM_LOC_R S0_M5 = MAM_LOC_R.create("M5");
		MAVM_ITM_DTL_MFG_R S0_M6 = MAVM_ITM_DTL_MFG_R.create("M6");
		MAM_WG_R S0_M8 = MAM_WG_R.create("M8");
		MAM_SITE_R S0_M9 = MAM_SITE_R.create("M9");
		MAM_BP_R S0_M10 = MAM_BP_R.create("M10");
		MAM_LOC_GRP_R S0_M11 = MAM_LOC_GRP_R.create("M11");
		MAM_LOC_GRP_R S0_M12 = MAM_LOC_GRP_R.create("M12");
		MAM_ITM_TYP_D_R S0_M13 = MAM_ITM_TYP_D_R.create("M13");
		MAM_ITM_NOT_FIX_R S0_M14 = MAM_ITM_NOT_FIX_R.create("M14");
		MAM_STR_LN_R S0_M15 = MAM_STR_LN_R.create("M15");
		MAM_ITM_GRP_R S0_MM_ITM1 = MAM_ITM_GRP_R.create("MM_ITM1");
		MAM_ITM_GRP_R S0_MM_ITM2 = MAM_ITM_GRP_R.create("MM_ITM2");
		MAM_ITM_GRP_R S0_MM_ITM3 = MAM_ITM_GRP_R.create("MM_ITM3");
		MAM_ITM_GRP_R S0_MM_ITM4 = MAM_ITM_GRP_R.create("MM_ITM4");
		MAM_ITM_GRP_R S0_MM_ITM5 = MAM_ITM_GRP_R.create("MM_ITM5");
		MAM_ITM_GRP_R S0_MM_ITM6 = MAM_ITM_GRP_R.create("MM_ITM6");
		MAM_ITM_GRP_R S0_MM_ITM7 = MAM_ITM_GRP_R.create("MM_ITM7");
		MAM_ITM_GRP_R S0_MM_ITM8 = MAM_ITM_GRP_R.create("MM_ITM8");
		MAM_ITM_GRP_R S0_MM_ITM9 = MAM_ITM_GRP_R.create("MM_ITM9");
		MAM_ITM_GRP_R S0_MM_ITM10 = MAM_ITM_GRP_R.create("MM_ITM10");
		MAM_BP_GRP_R S0_MM_SPPL1 = MAM_BP_GRP_R.create("MM_SPPL1");
		MAM_BP_GRP_R S0_MM_SPPL2 = MAM_BP_GRP_R.create("MM_SPPL2");
		MAM_BP_GRP_R S0_MM_SPPL3 = MAM_BP_GRP_R.create("MM_SPPL3");
		MAM_BP_GRP_R S0_MM_SPPL4 = MAM_BP_GRP_R.create("MM_SPPL4");
		MAM_BP_GRP_R S0_MM_SPPL5 = MAM_BP_GRP_R.create("MM_SPPL5");
		MAM_BP_GRP_R S0_MM_SPPL6 = MAM_BP_GRP_R.create("MM_SPPL6");
		MAM_BP_GRP_R S0_MM_SPPL7 = MAM_BP_GRP_R.create("MM_SPPL7");
		MAM_BP_GRP_R S0_MM_SPPL8 = MAM_BP_GRP_R.create("MM_SPPL8");
		MAM_BP_GRP_R S0_MM_SPPL9 = MAM_BP_GRP_R.create("MM_SPPL9");
		MAM_BP_GRP_R S0_MM_SPPL10 = MAM_BP_GRP_R.create("MM_SPPL10");
		MST_ITM_MFG_INST_R S1_W = MST_ITM_MFG_INST_R.create("W");
		MST_PO_SCHD_R S2_A = MST_PO_SCHD_R.create("A");
		MST_PO_D_R S3_A = MST_PO_D_R.create("A");
		MST_ITM_ORDER_R S1_T1 = MST_ITM_ORDER_R.create("ST1");
		
		MCDynamicSQLID DS0C_ITM_GRP = createDynamicSQLID("DS0C_ITM_GRP");
		MCDynamicSQLID DS0C_SPPL_GRP = createDynamicSQLID("DS0C_SPPL_GRP");
		
		return createQueryPlan()
			.setQuery(
				sql("MSBCL1040_MST_ITM_ORDER_Query_S01")
					.mainQuery()
					.select(
						cases()
							.when(S0_T1.itm_ord_typ.eq(value(MSC_ITM_ORD_TYP.MFG.value())))
								.then(value(MSC_MFG_MTD_TYP.INTNL.value()))
							.otherwise(value(MSC_MFG_MTD_TYP.EXTNL.value())).as("mfg_mtd_typ"),
						value(MSC_MFG_STS_TYP.YET.value()).as("mfg_sts_typ"),
						S0_T1.master_dt.as("master_dt"),
						S0_T1.itm_cd,
						S0_T1.itm_sub1,
						S0_T1.itm_sub2,
						S0_T1.itm_sub3,
						nvl(
							S0_M2.itm_nm,
							S0_M1.itm_nm
						).as("itm_nm"),
						S0_M1.lot_mng_typ,
						S0_M1.lot_no_typ,
						S0_M1.lot_no_ptn_cd,
						S0_M1.sublot_mng_typ,
						S0_M1.sublot_no_typ,
						S0_M1.sublot_no_ptn_cd,
						S0_M1.sno1_mng_typ,
						S0_M1.sno2_mng_typ,
						S0_M1.sno3_mng_typ,
						S0_M1.sno4_mng_typ,
						S0_T1.mfg_loc_cd,
						S0_M4.loc_nm.as("mfg_loc_nm"),
						S0_M4.str_ln_tgt_flg.as("mfg_str_ln_tgt_flg"),
						S0_T1.bom_ptn,
						S0_M4.sppl_cd,
						S0_M6.yield_schd_qty.as("mst_yield_schd_qty"),
						S0_M6.mfg_inst_qty.as("mst_mfg_inst_qty"),
						S0_M6.fxd_rqmt_qty.as("mst_fxd_rqmt_qty"),
						S0_M6.lot_issue_typ,
						S0_M6.ln_stk_flg,
						S0_T1.strg_loc_cd,
						S0_T1.not_inst_qty.as("base_unit_inst_qty"),
						S0_T1.yield_schd_qty.as("base_unit_yield_qty"),
						bracket(
							subQuery()
							.select(sum(S1_W.base_unit_yield_qty))
							.from(S1_W)
							.where(
								S0_T1.itm_ord_no.eq(S1_W.itm_ord_no)
								.and(S1_W.can_flg.eq(value(false)))
							)
						).as("sum_base_unit_yield_qty"),
						S0_M1.unit_cd.as("base_unit_cd"),
						S0_M1.dec_place.as("base_unit_dec_place"),
						cases()
							.when(S0_T1.itm_ord_typ.eq(value(MSC_ITM_ORD_TYP.MFG.value())))
								.then(value((MCDate)null))
							.otherwise(S0_T1.strg_schd_dt).as("rqst_dlv_rqst_dt"),
						nullValue().as("rqst_dlv_rqst_hm"),
						S0_T1.mfg_st_schd_dt.as("st_schd_dt"),
						nullValue().as("st_schd_hm"),
						S0_T1.mfg_end_schd_dt.as("end_schd_dt"),
						nullValue().as("end_schd_hm"),
						S0_T1.oper_ptn,
						nullValue().as("lot_no"),
						nullValue().as("sublot_no"),
						S0_T1.sno1,
						S0_T1.sno2,
						S0_T1.sno3,
						S0_T1.sno4,
						nullValue().as("inst_dt"),
						nullValue().as("inst_usr_cd"),
						nullValue().as("inst_usr_nm"),
						nullValue().as("inst_dpt_cd"),
						nullValue().as("inst_dpt_nm"),
						value(MAC_STR.NULL_VAL.value()).as("mfg_str_ln_cd"),
						nullValue().as("mfg_str_ln_nm"),
						value(MAC_STR.NULL_VAL.value()).as("strg_str_ln_cd"),
						nullValue().as("strg_str_ln_nm"),
						value(false).as("po_locked_flg"),
						value(false).as("inst_abort_flg"),
						nullValue().as("inst_rpt_rmrks"),
						nullValue().as("intr_rmrks"),
						nullValue().as("oper_inst_rpt_rmrks"),
						nullValue().as("oper_intr_rmrks"),
						cases()
							.when(
								S0_T1.itm_ord_typ.eq(value(MSC_ITM_ORD_TYP.OUTSRC.value()))
								.and(S0_T1.ord_gnrt_typ.eq(value(MSC_ORD_GNRT_TYP.UPLND.value())))
							)
								.then(
									subQuery()
									.select(S1_T1.inst_po_cnt_rmrks)
									.from(S1_T1)
									.where(
										S1_T1.io_schd_pr_no.eq(S0_T1.io_schd_pr_no)
										.and(S1_T1.ord_gnrt_typ.eq(value(MSC_ORD_GNRT_TYP.MNL.value())))
									)
								)
							.otherwise(S0_T1.inst_po_cnt_rmrks).as("inst_po_cnt_rmrks"),
					nullValue().as("disp_pd"),
						nullValue().as("disp_pd"),
						S0_M6.itm_lower_yield,
						S0_M6.itm_std_yield,
						S0_M6.itm_upper_yield,
						nullValue().as("mfg_inst_no"),
						nullValue().as("mfg_inst_rev"),
						nullValue().as("inst_prnt_tm"),
						value(false).as("inst_prnt_flg"),
						value(false).as("can_flg"),
						nullValue().as("itm_mfg_inst_no"),
						S0_T1.itm_ord_no,
						value(false).as("schd_chg_flg"),
						S0_T1.inst_qty.as("base_unit_ord_qty"),
						S0_T1.not_inst_qty.as("base_unit_not_inst_qty"),
						value(false).as("ord_abort_flg"),
						S0_T1.wg_cd.as("mfg_loc_wg_cd"),
						S0_M4.site_cd.as("mfg_loc_site_cd"),
						S0_M4.loc_grp_cd.as("mfg_loc_grp_cd"),
						cases()
							.when(S0_T6.can_flg.eq(value(false)))
								.then(S0_T5.pr("po_d_no"))
							.otherwise(nullValue()).as("po_d_no"),
						nullValue().as("po_aprv_sts_typ"),
						value(false).as("po_auto_reg_flg"),
						nullValue().as("itm_mfg_inst_sub_char1"),
						nullValue().as("itm_mfg_inst_sub_char2"),
						nullValue().as("itm_mfg_inst_sub_char3"),
						nullValue().as("mfg_inst_sub_char1"),
						nullValue().as("mfg_inst_sub_char2"),
						nullValue().as("mfg_inst_sub_char3"),
						S0_M1.th_image.as("tm_th_image"),
						nullValue().as("mfg_aprv_sts_typ"),
						nullValue().as("aprv_dt"),
						nullValue().as("aprv_tm"),
						nullValue().as("aprv_dpt_cd"),
						nullValue().as("aprv_dpt_nm"),
						nullValue().as("aprv_usr_cd"),
						nullValue().as("aprv_usr_nm"),
						nullValue().as("aprv_rsn"),
						value(false).as("aprv_tgt_flg"),
						S0_M1.itm_typ,
						S0_M1.itm_typ_d_cd,
						S0_T1.ins_usr_id.as("ins_usr_id"),
						S0_T1.ins_usr_nm.as("ins_usr_nm"),
						S0_T1.ins_func_id.as("ins_func_id"),
						S0_T1.ins_ts.as("ins_ts"),
						S0_T1.upd_cntr.as("itm_ord_upd_cntr"),
						nullValue().as("itm_mfg_inst_upd_cntr"),
						nullValue().as("mfg_inst_upd_cntr"),
						S0_T1.upd_usr_id.as("upd_usr_id"),
						S0_T1.upd_usr_nm.as("upd_usr_nm"),
						S0_T1.upd_func_id.as("upd_func_id"),
						S0_T1.upd_ts.as("upd_ts"),
						S0_T1.upd_srv_req_no.as("upd_srv_req_no"),
						S0_T1.for_scheduler_frozen_flg,
						S0_T1.mfg_st_schd_dt,
						S0_T1.itm_ord_typ,
						addDynamicSelect(DS0C_ITM_GRP),
						addDynamicSelect(DS0C_SPPL_GRP)
					)
					.from(
						S0_T1
						.leftOuterJoin(
							subQuery()
							.select(S2_A.prAll())
							.from(S2_A)
							.where(
								S2_A.can_flg.eq(value(false))
								.and(S2_A.po_flg.eq(value(false)))
							).view(S0_T3)
						).on(
							bracket(
								S0_T1.itm_ord_no.eq(S0_T3.pr("outsrc_itm_ord_no"))
							)
						)
						.leftOuterJoin(
							subQuery()
							.select(S3_A.prAll())
							.from(S3_A)
							.where(
								S3_A.can_flg.eq(value(false))
							).view(S0_T5)
						).on(
							bracket(
								S0_T1.itm_ord_no.eq(S0_T5.pr("outsrc_itm_ord_no"))
							)
						)
						.leftOuterJoin(S0_T6).on(
							bracket(
								S0_T5.pr("po_no").eq(S0_T6.po_no)
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
						.leftOuterJoin(S0_M2).on(
							bracket(
								S0_T1.itm_cd.eq(S0_M2.itm_cd)
								.and(S0_T1.itm_sub1.eq(S0_M2.itm_sub1))
								.and(S0_T1.itm_sub2.eq(S0_M2.itm_sub2))
								.and(S0_T1.itm_sub3.eq(S0_M2.itm_sub3))
								.and(S0_T1.sno1.eq(S0_M2.sno1))
								.and(S0_T1.sno2.eq(S0_M2.sno2))
								.and(S0_T1.sno3.eq(S0_M2.sno3))
								.and(S0_T1.sno4.eq(S0_M2.sno4))
							)
						)
						.innerJoin(S0_M4).on(
							bracket(
								S0_T1.mfg_loc_cd.eq(S0_M4.loc_cd)
							)
						)
						.leftOuterJoin(S0_M6).on(
							bracket(
								S0_T1.itm_cd.eq(S0_M6.itm_cd)
								.and(S0_T1.itm_sub1.eq(S0_M6.itm_sub1))
								.and(S0_T1.itm_sub2.eq(S0_M6.itm_sub2))
								.and(S0_T1.itm_sub3.eq(S0_M6.itm_sub3))
								.and(S0_T1.mfg_loc_cd.eq(S0_M6.mfg_loc_cd))
								.and(S0_M6.sppl_cd.eq(value(MAC_STR.NULL_VAL.value())))
								.and(S0_M6.maker_cd.eq(value(MAC_STR.NULL_VAL.value())))
								.and(S0_M6.rqst_loc_cd.eq(value(MAC_STR.NULL_VAL.value())))
								.and(S0_T1.wg_cd.eq(S0_M6.wg_cd))
								.and(S0_T1.bom_ptn.eq(S0_M6.bom_ptn))
								.and(S0_T1.master_dt.between(S0_M6.st_dt, S0_M6.end_dt))
							)
						)
						.leftOuterJoin(S0_M14).on(
							bracket(
								S0_T1.itm_cd.eq(S0_M14.itm_cd)
								.and(S0_T1.itm_sub1.eq(S0_M14.itm_sub1))
								.and(S0_T1.itm_sub2.eq(S0_M14.itm_sub2))
								.and(S0_T1.itm_sub3.eq(S0_M14.itm_sub3))
								.and(S0_T1.sno1.eq(S0_M14.sno1))
								.and(S0_T1.sno2.eq(S0_M14.sno2))
								.and(S0_T1.sno3.eq(S0_M14.sno3))
								.and(S0_T1.sno4.eq(S0_M14.sno4))
								.and(S0_T1.wg_cd.eq(S0_M14.wg_cd))
							)
						)
						.leftOuterJoin(S0_M15).on(
							bracket(
								S0_T3.pr("in_to_loc_cd").eq(S0_M15.loc_cd)
								.and(S0_T3.pr("str_ln_cd").eq(S0_M15.str_ln_cd))
							)
						)
						.addDynamicView()
						.addDynamicView(DS0C_ITM_GRP)
						.addDynamicView(DS0C_SPPL_GRP)
					)
					.where(
						value(0).eq(value(0))
						.cutoff$and(value(true).neq(bind("tmp_frcd_invld_flg_str")))
						.and(
							S0_T1.itm_ord_sts_typ.in(
								value(MSC_ITM_ORD_STS_TYP.FIX.value()),
								value(MSC_ITM_ORD_STS_TYP.PART_INST.value()),
								value(MSC_ITM_ORD_STS_TYP.INST.value())
							)
							.cutoff$or(
								bracket(
									value(false).eq(bind("tmp_not_srch_opn_flg_str"))
									.and(S0_T1.itm_ord_sts_typ.eq(value(MSC_ITM_ORD_STS_TYP.OPN.value())))
									.and(
										decode(
											S0_M14.itm_cd,
											nullValue(),
											S0_T1.not_fix_flg,
											value(true)
										).eq(value(false))
									)
								)
							)
							.cutoff$or(
								bracket(
									value(false).eq(bind("tmp_not_srch_sav_flg_str"))
									.and(S0_T1.itm_ord_sts_typ.eq(value(MSC_ITM_ORD_STS_TYP.SAV.value())))
									.and(
										decode(
											S0_M14.itm_cd,
											nullValue(),
											S0_T1.not_fix_flg,
											value(true)
										).eq(value(false))
									)
								)
							)
						)
						.and(S0_T1.not_inst_qty.gt(value(0)))
						.and(
							value(true).eq(cases()
									.when(S0_T1.itm_ord_typ.eq(value(MSC_ITM_ORD_TYP.MFG.value())))
										.then(value(true))
									.when(S0_T3.pr("po_schd_no").isNotNull())
										.then(value(true))
									.when(S0_T5.pr("po_d_no").isNotNull())
										.then(value(true))
									.otherwise(value(false))
							)
						)
						.cutoff$and(
							bracket(
								cases()
									.when(S0_T1.itm_ord_typ.eq(value(MSC_ITM_ORD_TYP.MFG.value())))
										.then(value(MSC_MFG_MTD_TYP.INTNL.value()))
									.otherwise(value(MSC_MFG_MTD_TYP.EXTNL.value()))
							).like(bind("mfg_mtd_typ"))
						)
						.cutoff$and(S0_T1.mfg_st_schd_dt.gte(bind("st_schd_dt_fr")))
						.cutoff$and(S0_T1.mfg_st_schd_dt.lte(bind("st_schd_dt_to")))
						.cutoff$and(S0_T1.mfg_end_schd_dt.gte(bind("end_schd_dt_fr")))
						.cutoff$and(S0_T1.mfg_end_schd_dt.lte(bind("end_schd_dt_to")))
						.cutoff$and(
							S0_T1.avl_schd_dt.gte(bind("rqst_dlv_rqst_dt_fr"))
							.and(S0_T1.itm_ord_typ.eq(value(MSC_ITM_ORD_TYP.OUTSRC.value())))
						)
						.cutoff$and(
							S0_T1.avl_schd_dt.lte(bind("rqst_dlv_rqst_dt_to"))
							.and(S0_T1.itm_ord_typ.eq(value(MSC_ITM_ORD_TYP.OUTSRC.value())))
						)
						.cutoff$and(S0_M4.site_cd.like(bind("mfg_loc_site_cd")))
						.addDynamicPredicate()
						.cutoff$and(S0_T1.wg_cd.like(bind("mfg_loc_wg_cd")))
						.cutoff$and(S0_M4.loc_grp_cd.like(bind("mfg_loc_grp_cd")))
						.cutoff$and(S0_T1.mfg_loc_cd.like(bind("mfg_loc_cd")))
						.cutoff$and(S0_M4.loc_nm.like(bind("mfg_loc_nm")))
						.cutoff$and(S0_T1.strg_loc_cd.like(bind("strg_loc_cd")))
						.cutoff$and(S0_M4.sppl_cd.like(bind("sppl_cd")))
						.cutoff$and(S0_M1.itm_typ.like(bind("itm_typ")))
						.cutoff$and(S0_M1.itm_typ_d_cd.like(bind("itm_typ_d_cd")))
						.cutoff$and(S0_T1.itm_cd.like(bind("itm_cd")))
						.cutoff$and(S0_T1.itm_sub1.like(bind("itm_sub1")))
						.cutoff$and(S0_T1.itm_sub2.like(bind("itm_sub2")))
						.cutoff$and(S0_T1.itm_sub3.like(bind("itm_sub3")))
						.cutoff$and(
							nvl(
								S0_M2.itm_nm,
								S0_M1.itm_nm
							).like(bind("itm_nm"))
						)
						.cutoff$and(S0_T1.sno1.like(bind("sno1")))
						.cutoff$and(S0_T1.sno2.like(bind("sno2")))
						.cutoff$and(S0_T1.sno3.like(bind("sno3")))
						.cutoff$and(S0_T1.sno4.like(bind("sno4")))
						.cutoff$and(S0_T1.itm_ord_no.like(bind("itm_ord_no")))
						.cutoff$and(
							S0_T5.pr("po_d_no").like(bind("po_d_no"))
							.and(S0_T6.can_flg.eq(value(false)))
						)
						.cutoff$and(S0_T1.inst_po_cnt_rmrks.like(bind("inst_po_cnt_rmrks")))
						.addDynamicPredicate(DS0C_ITM_GRP)
						.addDynamicPredicate(DS0C_SPPL_GRP)
					)
					.orderBy(
						S0_T1.mfg_st_schd_dt.asc(),
						S0_T1.itm_ord_typ.asc(),
						S0_T1.itm_ord_no.asc()
					)
			)
			.setDynamicSQLInfo(
				when(boundOr("wrk_no", "wrk_nm"))
					.view(v -> v.leftOuterJoin(S0_T2).on(bracket(S0_T1.sno1.eq(S0_T2.sno1))))
					.predicate(p -> p.cutoff$and(S0_T2.wrk_no.like(bind("wrk_no"))).cutoff$and(S0_T2.wrk_nm.like(bind("wrk_nm")))),
				when(boundOr("mfg_inst_unit_typ"))
					.view(v -> v.leftOuterJoin(S0_M3).on(bracket(S0_T1.itm_cd.eq(S0_M3.itm_cd).and(S0_T1.itm_sub1.eq(S0_M3.itm_sub1)).and(S0_T1.itm_sub2.eq(S0_M3.itm_sub2)).and(S0_T1.itm_sub3.eq(S0_M3.itm_sub3)).and(S0_T1.wg_cd.eq(S0_M3.wg_cd)))))
					.predicate(p -> p.cutoff$and(S0_M3.mfg_inst_unit_typ.like(bind("mfg_inst_unit_typ")))),
				when(boundOr("strg_loc_grp_nm", "strg_loc_grp_cd", "strg_loc_nm"))
					.view(v -> v.leftOuterJoin(S0_M5).on(bracket(S0_T1.strg_loc_cd.eq(S0_M5.loc_cd))))
					.predicate(p -> p.cutoff$and(S0_M5.loc_grp_cd.like(bind("strg_loc_grp_cd"))).cutoff$and(S0_M5.loc_nm.like(bind("strg_loc_nm")))),
				when(boundOr("mfg_loc_wg_nm"))
					.view(v -> v.leftOuterJoin(S0_M8).on(bracket(S0_T1.wg_cd.eq(S0_M8.wg_cd))))
					.predicate(p -> p.cutoff$and(S0_M8.wg_nm.like(bind("mfg_loc_wg_nm")))),
				when(boundOr("mfg_loc_site_nm"))
					.view(v -> v.leftOuterJoin(S0_M9).on(bracket(S0_M4.site_cd.eq(S0_M9.site_cd))))
					.predicate(p -> p.cutoff$and(S0_M9.site_nm.like(bind("mfg_loc_site_nm")))),
				when(boundOr("sppl_grp_flg1", "sppl_grp_flg2", "sppl_grp_flg3", "sppl_grp_flg4", "sppl_grp_flg5", "sppl_grp_flg6", "sppl_grp_flg7", "sppl_grp_flg8", "sppl_grp_flg9", "sppl_grp_flg10", "sppl_nm"))
					.view(v -> v.leftOuterJoin(S0_M10).on(bracket(S0_M4.sppl_cd.eq(S0_M10.bp_cd))))
					.predicate(p -> p.cutoff$and(S0_M10.bp_nm.like(bind("sppl_nm")))),
				when(boundOr("mfg_loc_grp_nm"))
					.view(v -> v.leftOuterJoin(S0_M11).on(bracket(S0_M4.loc_grp_cd.eq(S0_M11.loc_grp_cd))))
					.predicate(p -> p.cutoff$and(S0_M11.loc_grp_nm.like(bind("mfg_loc_grp_nm")))),
				when(boundOr("strg_loc_grp_nm"))
					.view(v -> v.leftOuterJoin(S0_M12).on(bracket(S0_M5.loc_grp_cd.eq(S0_M12.loc_grp_cd))))
					.predicate(p -> p.cutoff$and(S0_M12.loc_grp_nm.like(bind("strg_loc_grp_nm")))),
				when(boundOr("itm_typ_d_nm"))
					.view(v -> v.leftOuterJoin(S0_M13).on(bracket(S0_M1.itm_typ.eq(S0_M13.itm_typ).and(S0_M1.itm_typ_d_cd.eq(S0_M13.itm_typ_d_cd)))))
					.predicate(p -> p.cutoff$and(S0_M13.itm_typ_d_nm.like(bind("itm_typ_d_nm")))),
				when(boundOr("itm_grp_flg1"))
					.select(DS0C_ITM_GRP, S0_M1.itm_grp_cd1.as("itm_grp_cd1"), S0_MM_ITM1.itm_grp_nm.as("itm_grp_nm1"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM_ITM1).on(S0_M1.itm_grp_cd1.eq(S0_MM_ITM1.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP1.value()).eq(S0_MM_ITM1.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M1.itm_grp_cd1.like(bind("itm_grp_cd1"))).cutoff$and(S0_MM_ITM1.itm_grp_nm.like(bind("itm_grp_nm1")))),
				when(boundOr("itm_grp_flg2"))
					.select(DS0C_ITM_GRP, S0_M1.itm_grp_cd2.as("itm_grp_cd2"), S0_MM_ITM2.itm_grp_nm.as("itm_grp_nm2"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM_ITM2).on(S0_M1.itm_grp_cd2.eq(S0_MM_ITM2.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP2.value()).eq(S0_MM_ITM2.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M1.itm_grp_cd2.like(bind("itm_grp_cd2"))).cutoff$and(S0_MM_ITM2.itm_grp_nm.like(bind("itm_grp_nm2")))),
				when(boundOr("itm_grp_flg3"))
					.select(DS0C_ITM_GRP, S0_M1.itm_grp_cd3.as("itm_grp_cd3"), S0_MM_ITM3.itm_grp_nm.as("itm_grp_nm3"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM_ITM3).on(S0_M1.itm_grp_cd3.eq(S0_MM_ITM3.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP3.value()).eq(S0_MM_ITM3.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M1.itm_grp_cd3.like(bind("itm_grp_cd3"))).cutoff$and(S0_MM_ITM3.itm_grp_nm.like(bind("itm_grp_nm3")))),
				when(boundOr("itm_grp_flg4"))
					.select(DS0C_ITM_GRP, S0_M1.itm_grp_cd4.as("itm_grp_cd4"), S0_MM_ITM4.itm_grp_nm.as("itm_grp_nm4"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM_ITM4).on(S0_M1.itm_grp_cd4.eq(S0_MM_ITM4.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP4.value()).eq(S0_MM_ITM4.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M1.itm_grp_cd4.like(bind("itm_grp_cd4"))).cutoff$and(S0_MM_ITM4.itm_grp_nm.like(bind("itm_grp_nm4")))),
				when(boundOr("itm_grp_flg5"))
					.select(DS0C_ITM_GRP, S0_M1.itm_grp_cd5.as("itm_grp_cd5"), S0_MM_ITM5.itm_grp_nm.as("itm_grp_nm5"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM_ITM5).on(S0_M1.itm_grp_cd5.eq(S0_MM_ITM5.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP5.value()).eq(S0_MM_ITM5.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M1.itm_grp_cd5.like(bind("itm_grp_cd5"))).cutoff$and(S0_MM_ITM5.itm_grp_nm.like(bind("itm_grp_nm5")))),
				when(boundOr("itm_grp_flg6"))
					.select(DS0C_ITM_GRP, S0_M1.itm_grp_cd6.as("itm_grp_cd6"), S0_MM_ITM6.itm_grp_nm.as("itm_grp_nm6"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM_ITM6).on(S0_M1.itm_grp_cd6.eq(S0_MM_ITM6.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP6.value()).eq(S0_MM_ITM6.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M1.itm_grp_cd6.like(bind("itm_grp_cd6"))).cutoff$and(S0_MM_ITM6.itm_grp_nm.like(bind("itm_grp_nm6")))),
				when(boundOr("itm_grp_flg7"))
					.select(DS0C_ITM_GRP, S0_M1.itm_grp_cd7.as("itm_grp_cd7"), S0_MM_ITM7.itm_grp_nm.as("itm_grp_nm7"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM_ITM7).on(S0_M1.itm_grp_cd7.eq(S0_MM_ITM7.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP7.value()).eq(S0_MM_ITM7.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M1.itm_grp_cd7.like(bind("itm_grp_cd7"))).cutoff$and(S0_MM_ITM7.itm_grp_nm.like(bind("itm_grp_nm7")))),
				when(boundOr("itm_grp_flg8"))
					.select(DS0C_ITM_GRP, S0_M1.itm_grp_cd8.as("itm_grp_cd8"), S0_MM_ITM8.itm_grp_nm.as("itm_grp_nm8"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM_ITM8).on(S0_M1.itm_grp_cd8.eq(S0_MM_ITM8.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP8.value()).eq(S0_MM_ITM8.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M1.itm_grp_cd8.like(bind("itm_grp_cd8"))).cutoff$and(S0_MM_ITM8.itm_grp_nm.like(bind("itm_grp_nm8")))),
				when(boundOr("itm_grp_flg9"))
					.select(DS0C_ITM_GRP, S0_M1.itm_grp_cd9.as("itm_grp_cd9"), S0_MM_ITM9.itm_grp_nm.as("itm_grp_nm9"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM_ITM9).on(S0_M1.itm_grp_cd9.eq(S0_MM_ITM9.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP9.value()).eq(S0_MM_ITM9.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M1.itm_grp_cd9.like(bind("itm_grp_cd9"))).cutoff$and(S0_MM_ITM9.itm_grp_nm.like(bind("itm_grp_nm9")))),
				when(boundOr("itm_grp_flg10"))
					.select(DS0C_ITM_GRP, S0_M1.itm_grp_cd10.as("itm_grp_cd10"), S0_MM_ITM10.itm_grp_nm.as("itm_grp_nm10"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM_ITM10).on(S0_M1.itm_grp_cd10.eq(S0_MM_ITM10.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP10.value()).eq(S0_MM_ITM10.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M1.itm_grp_cd10.like(bind("itm_grp_cd10"))).cutoff$and(S0_MM_ITM10.itm_grp_nm.like(bind("itm_grp_nm10")))),
				when(boundOr("sppl_grp_flg1"))
					.select(DS0C_SPPL_GRP, S0_M10.bp_grp_cd1.as("sppl_grp_cd1"), S0_MM_SPPL1.bp_grp_nm.as("sppl_grp_nm1"))
					.view(DS0C_SPPL_GRP, v -> v.leftOuterJoin(S0_MM_SPPL1).on(S0_M10.bp_grp_cd1.eq(S0_MM_SPPL1.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP1.value()).eq(S0_MM_SPPL1.bp_grp_typ))))
					.predicate(DS0C_SPPL_GRP, p -> p.cutoff$and(S0_M10.bp_grp_cd1.like(bind("sppl_grp_cd1"))).cutoff$and(S0_MM_SPPL1.bp_grp_nm.like(bind("sppl_grp_nm1")))),
				when(boundOr("sppl_grp_flg2"))
					.select(DS0C_SPPL_GRP, S0_M10.bp_grp_cd2.as("sppl_grp_cd2"), S0_MM_SPPL2.bp_grp_nm.as("sppl_grp_nm2"))
					.view(DS0C_SPPL_GRP, v -> v.leftOuterJoin(S0_MM_SPPL2).on(S0_M10.bp_grp_cd2.eq(S0_MM_SPPL2.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP2.value()).eq(S0_MM_SPPL2.bp_grp_typ))))
					.predicate(DS0C_SPPL_GRP, p -> p.cutoff$and(S0_M10.bp_grp_cd2.like(bind("sppl_grp_cd2"))).cutoff$and(S0_MM_SPPL2.bp_grp_nm.like(bind("sppl_grp_nm2")))),
				when(boundOr("sppl_grp_flg3"))
					.select(DS0C_SPPL_GRP, S0_M10.bp_grp_cd3.as("sppl_grp_cd3"), S0_MM_SPPL3.bp_grp_nm.as("sppl_grp_nm3"))
					.view(DS0C_SPPL_GRP, v -> v.leftOuterJoin(S0_MM_SPPL3).on(S0_M10.bp_grp_cd3.eq(S0_MM_SPPL3.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP3.value()).eq(S0_MM_SPPL3.bp_grp_typ))))
					.predicate(DS0C_SPPL_GRP, p -> p.cutoff$and(S0_M10.bp_grp_cd3.like(bind("sppl_grp_cd3"))).cutoff$and(S0_MM_SPPL3.bp_grp_nm.like(bind("sppl_grp_nm3")))),
				when(boundOr("sppl_grp_flg4"))
					.select(DS0C_SPPL_GRP, S0_M10.bp_grp_cd4.as("sppl_grp_cd4"), S0_MM_SPPL4.bp_grp_nm.as("sppl_grp_nm4"))
					.view(DS0C_SPPL_GRP, v -> v.leftOuterJoin(S0_MM_SPPL4).on(S0_M10.bp_grp_cd4.eq(S0_MM_SPPL4.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP4.value()).eq(S0_MM_SPPL4.bp_grp_typ))))
					.predicate(DS0C_SPPL_GRP, p -> p.cutoff$and(S0_M10.bp_grp_cd4.like(bind("sppl_grp_cd4"))).cutoff$and(S0_MM_SPPL4.bp_grp_nm.like(bind("sppl_grp_nm4")))),
				when(boundOr("sppl_grp_flg5"))
					.select(DS0C_SPPL_GRP, S0_M10.bp_grp_cd5.as("sppl_grp_cd5"), S0_MM_SPPL5.bp_grp_nm.as("sppl_grp_nm5"))
					.view(DS0C_SPPL_GRP, v -> v.leftOuterJoin(S0_MM_SPPL5).on(S0_M10.bp_grp_cd5.eq(S0_MM_SPPL5.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP5.value()).eq(S0_MM_SPPL5.bp_grp_typ))))
					.predicate(DS0C_SPPL_GRP, p -> p.cutoff$and(S0_M10.bp_grp_cd5.like(bind("sppl_grp_cd5"))).cutoff$and(S0_MM_SPPL5.bp_grp_nm.like(bind("sppl_grp_nm5")))),
				when(boundOr("sppl_grp_flg6"))
					.select(DS0C_SPPL_GRP, S0_M10.bp_grp_cd6.as("sppl_grp_cd6"), S0_MM_SPPL6.bp_grp_nm.as("sppl_grp_nm6"))
					.view(DS0C_SPPL_GRP, v -> v.leftOuterJoin(S0_MM_SPPL6).on(S0_M10.bp_grp_cd6.eq(S0_MM_SPPL6.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP6.value()).eq(S0_MM_SPPL6.bp_grp_typ))))
					.predicate(DS0C_SPPL_GRP, p -> p.cutoff$and(S0_M10.bp_grp_cd6.like(bind("sppl_grp_cd6"))).cutoff$and(S0_MM_SPPL6.bp_grp_nm.like(bind("sppl_grp_nm6")))),
				when(boundOr("sppl_grp_flg7"))
					.select(DS0C_SPPL_GRP, S0_M10.bp_grp_cd7.as("sppl_grp_cd7"), S0_MM_SPPL7.bp_grp_nm.as("sppl_grp_nm7"))
					.view(DS0C_SPPL_GRP, v -> v.leftOuterJoin(S0_MM_SPPL7).on(S0_M10.bp_grp_cd7.eq(S0_MM_SPPL7.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP7.value()).eq(S0_MM_SPPL7.bp_grp_typ))))
					.predicate(DS0C_SPPL_GRP, p -> p.cutoff$and(S0_M10.bp_grp_cd7.like(bind("sppl_grp_cd7"))).cutoff$and(S0_MM_SPPL7.bp_grp_nm.like(bind("sppl_grp_nm7")))),
				when(boundOr("sppl_grp_flg8"))
					.select(DS0C_SPPL_GRP, S0_M10.bp_grp_cd8.as("sppl_grp_cd8"), S0_MM_SPPL8.bp_grp_nm.as("sppl_grp_nm8"))
					.view(DS0C_SPPL_GRP, v -> v.leftOuterJoin(S0_MM_SPPL8).on(S0_M10.bp_grp_cd8.eq(S0_MM_SPPL8.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP8.value()).eq(S0_MM_SPPL8.bp_grp_typ))))
					.predicate(DS0C_SPPL_GRP, p -> p.cutoff$and(S0_M10.bp_grp_cd8.like(bind("sppl_grp_cd8"))).cutoff$and(S0_MM_SPPL8.bp_grp_nm.like(bind("sppl_grp_nm8")))),
				when(boundOr("sppl_grp_flg9"))
					.select(DS0C_SPPL_GRP, S0_M10.bp_grp_cd9.as("sppl_grp_cd9"), S0_MM_SPPL9.bp_grp_nm.as("sppl_grp_nm9"))
					.view(DS0C_SPPL_GRP, v -> v.leftOuterJoin(S0_MM_SPPL9).on(S0_M10.bp_grp_cd9.eq(S0_MM_SPPL9.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP9.value()).eq(S0_MM_SPPL9.bp_grp_typ))))
					.predicate(DS0C_SPPL_GRP, p -> p.cutoff$and(S0_M10.bp_grp_cd9.like(bind("sppl_grp_cd9"))).cutoff$and(S0_MM_SPPL9.bp_grp_nm.like(bind("sppl_grp_nm9")))),
				when(boundOr("sppl_grp_flg10"))
					.select(DS0C_SPPL_GRP, S0_M10.bp_grp_cd10.as("sppl_grp_cd10"), S0_MM_SPPL10.bp_grp_nm.as("sppl_grp_nm10"))
					.view(DS0C_SPPL_GRP, v -> v.leftOuterJoin(S0_MM_SPPL10).on(S0_M10.bp_grp_cd10.eq(S0_MM_SPPL10.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP10.value()).eq(S0_MM_SPPL10.bp_grp_typ))))
					.predicate(DS0C_SPPL_GRP, p -> p.cutoff$and(S0_M10.bp_grp_cd10.like(bind("sppl_grp_cd10"))).cutoff$and(S0_MM_SPPL10.bp_grp_nm.like(bind("sppl_grp_nm10"))))
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
						.add(MAVM_ITM_WG_R.class, r -> toCondition(
							r.getStringNE("itm_cd"),
							r.getStringNE("itm_sub1"),
							r.getStringNE("itm_sub2"),
							r.getStringNE("itm_sub3"),
							r.getStringNE("mfg_loc_wg_cd")
						))
						.addSelect(m -> toArray(
							m.mfg_inst_unit_typ
						))
						.addMap((r, m) -> {
							r.setStringNE("mfg_inst_unit_typ", m.mfg_inst_unit_typ());
					}),
					j -> j
						.add(MAM_LOC_R.class, r -> toCondition(
							r.getStringNE("strg_loc_cd")
						))
						.addSelect(m -> toArray(
							m.loc_grp_cd,
							m.loc_nm,
							m.str_ln_tgt_flg
						))
						.addMap((r, m) -> {
							r.setStringNE("strg_loc_nm", m.loc_nm());
							r.setBooleanNE("strg_str_ln_tgt_flg", m.str_ln_tgt_flg());
							r.setStringNE("join_loc_grp_cd_", m.loc_grp_cd());
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
						.add(MAM_WG_R.class, r -> toCondition(
							r.getStringNE("mfg_loc_wg_cd")
						))
						.addSelect(m -> toArray(
							m.wg_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("mfg_loc_wg_nm", m.wg_nm());
					}),
					j -> j
						.add(MAM_SITE_R.class, r -> toCondition(
							r.getStringNE("mfg_loc_site_cd")
						))
						.addSelect(m -> toArray(
							m.site_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("mfg_loc_site_nm", m.site_nm());
					}),
					j -> j
						.add(MAM_BP_R.class, r -> toCondition(
							r.getStringNE("sppl_cd")
						))
						.addSelect(m -> toArray(
							m.bp_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("sppl_nm", m.bp_nm());
					}),
					j -> j
						.add(MAM_LOC_GRP_R.class, r -> toCondition(
							r.getStringNE("mfg_loc_grp_cd")
						))
						.addSelect(m -> toArray(
							m.loc_grp_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("mfg_loc_grp_nm", m.loc_grp_nm());
					}),
					j -> j
						.add(MAM_ITM_TYP_D_R.class, r -> toCondition(
							r.getStringNE("itm_typ"),
							r.getStringNE("itm_typ_d_cd")
						))
						.addSelect(m -> toArray(
							m.itm_typ_d_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("itm_typ_d_nm", m.itm_typ_d_nm());
					})
				)
			);
	}
	
	/**
	 * -- MSBCL1040_MST_MFG_INST_Query_S01
	 */
	static MCQueryPlan MSBCL1040_MST_MFG_INST_S01() {
		MST_MFG_INST_R S0_T11 = MST_MFG_INST_R.create("T11");
		MST_ITM_MFG_INST_R S0_T12 = MST_ITM_MFG_INST_R.create("T12");
		MSVT_MFG_INST_PR_R S0_T13 = MSVT_MFG_INST_PR_R.create("T13");
		MST_PO_D_R S0_T14 = MST_PO_D_R.create("T14");
		MST_PO_R S0_T15 = MST_PO_R.create("T15");
		MST_ITM_ORDER_R S0_T1 = MST_ITM_ORDER_R.create("T1");
		MSVT_WRK_SNO_R S0_T2 = MSVT_WRK_SNO_R.create("T2");
		MAM_ITM_R S0_M1 = MAM_ITM_R.create("M1");
		MAM_SUNDRY_ITM_R S0_M2 = MAM_SUNDRY_ITM_R.create("M2");
		MAVM_ITM_WG_R S0_M3 = MAVM_ITM_WG_R.create("M3");
		MAM_LOC_R S0_M4 = MAM_LOC_R.create("M4");
		MAM_LOC_R S0_M5 = MAM_LOC_R.create("M5");
		MAVM_ITM_DTL_MFG_R S0_M6 = MAVM_ITM_DTL_MFG_R.create("M6");
		MAM_WG_R S0_M8 = MAM_WG_R.create("M8");
		MAM_SITE_R S0_M9 = MAM_SITE_R.create("M9");
		MAM_BP_R S0_M10 = MAM_BP_R.create("M10");
		MAM_LOC_GRP_R S0_M11 = MAM_LOC_GRP_R.create("M11");
		MAM_LOC_GRP_R S0_M12 = MAM_LOC_GRP_R.create("M12");
		MAM_ITM_TYP_D_R S0_M13 = MAM_ITM_TYP_D_R.create("M13");
		MAM_USR_R S0_M21 = MAM_USR_R.create("M21");
		MAM_DPT_R S0_M22 = MAM_DPT_R.create("M22");
		MAM_USR_R S0_M23 = MAM_USR_R.create("M23");
		MAM_DPT_R S0_M24 = MAM_DPT_R.create("M24");
		MAM_STR_LN_R S0_M25 = MAM_STR_LN_R.create("M25");
		MAM_STR_LN_R S0_M26 = MAM_STR_LN_R.create("M26");
		MAVM_APRV_USR_R S0_M99 = MAVM_APRV_USR_R.create("M99");
		MAM_ITM_GRP_R S0_MM_ITM1 = MAM_ITM_GRP_R.create("MM_ITM1");
		MAM_ITM_GRP_R S0_MM_ITM2 = MAM_ITM_GRP_R.create("MM_ITM2");
		MAM_ITM_GRP_R S0_MM_ITM3 = MAM_ITM_GRP_R.create("MM_ITM3");
		MAM_ITM_GRP_R S0_MM_ITM4 = MAM_ITM_GRP_R.create("MM_ITM4");
		MAM_ITM_GRP_R S0_MM_ITM5 = MAM_ITM_GRP_R.create("MM_ITM5");
		MAM_ITM_GRP_R S0_MM_ITM6 = MAM_ITM_GRP_R.create("MM_ITM6");
		MAM_ITM_GRP_R S0_MM_ITM7 = MAM_ITM_GRP_R.create("MM_ITM7");
		MAM_ITM_GRP_R S0_MM_ITM8 = MAM_ITM_GRP_R.create("MM_ITM8");
		MAM_ITM_GRP_R S0_MM_ITM9 = MAM_ITM_GRP_R.create("MM_ITM9");
		MAM_ITM_GRP_R S0_MM_ITM10 = MAM_ITM_GRP_R.create("MM_ITM10");
		MAM_BP_GRP_R S0_MM_SPPL1 = MAM_BP_GRP_R.create("MM_SPPL1");
		MAM_BP_GRP_R S0_MM_SPPL2 = MAM_BP_GRP_R.create("MM_SPPL2");
		MAM_BP_GRP_R S0_MM_SPPL3 = MAM_BP_GRP_R.create("MM_SPPL3");
		MAM_BP_GRP_R S0_MM_SPPL4 = MAM_BP_GRP_R.create("MM_SPPL4");
		MAM_BP_GRP_R S0_MM_SPPL5 = MAM_BP_GRP_R.create("MM_SPPL5");
		MAM_BP_GRP_R S0_MM_SPPL6 = MAM_BP_GRP_R.create("MM_SPPL6");
		MAM_BP_GRP_R S0_MM_SPPL7 = MAM_BP_GRP_R.create("MM_SPPL7");
		MAM_BP_GRP_R S0_MM_SPPL8 = MAM_BP_GRP_R.create("MM_SPPL8");
		MAM_BP_GRP_R S0_MM_SPPL9 = MAM_BP_GRP_R.create("MM_SPPL9");
		MAM_BP_GRP_R S0_MM_SPPL10 = MAM_BP_GRP_R.create("MM_SPPL10");
		MST_ITM_MFG_INST_R S1_TMP = MST_ITM_MFG_INST_R.create("TMP");
		MAVM_RD_LOC_R S2_V1 = MAVM_RD_LOC_R.create("V1");
		MAVM_APRV_USR_R S3_V2 = MAVM_APRV_USR_R.create("V2");
		MST_INPT_SCHD_R S4_IS1 = MST_INPT_SCHD_R.create("IS1");
		MST_INPT_SCHD_R S5_IS2 = MST_INPT_SCHD_R.create("IS2");
		MST_YIELD_SCHD_R S6_YS1 = MST_YIELD_SCHD_R.create("YS1");
		MSVT_YIELD_SCHD_PR_R S6_YP1 = MSVT_YIELD_SCHD_PR_R.create("YP1");
		MAM_ITM_R S6_M1 = MAM_ITM_R.create("M1");
		MSVT_INPT_SCHD_PR_R S7_IS3 = MSVT_INPT_SCHD_PR_R.create("IS3");
		MST_INPT_SCHD_R S7_IS4 = MST_INPT_SCHD_R.create("IS4");
		
		MCDynamicSQLID DS0C_ITM_GRP = createDynamicSQLID("DS0C_ITM_GRP");
		MCDynamicSQLID DS0C_SPPL_GRP = createDynamicSQLID("DS0C_SPPL_GRP");
		
		return createQueryPlan()
			.setQuery(
				sql("MSBCL1040_MST_MFG_INST_Query_S01")
					.mainQuery()
					.select(
						S0_T12.mfg_mtd_typ,
						S0_T13.mfg_sts_typ,
						S0_T12.master_dt.as("master_dt"),
						S0_T12.itm_cd,
						S0_T12.itm_sub1,
						S0_T12.itm_sub2,
						S0_T12.itm_sub3,
						nvl(
							S0_M2.itm_nm,
							S0_M1.itm_nm
						).as("itm_nm"),
						S0_M1.lot_mng_typ,
						S0_M1.lot_no_typ,
						S0_M1.lot_no_ptn_cd,
						S0_M1.sublot_mng_typ,
						S0_M1.sublot_no_typ,
						S0_M1.sublot_no_ptn_cd,
						S0_M1.sno1_mng_typ,
						S0_M1.sno2_mng_typ,
						S0_M1.sno3_mng_typ,
						S0_M1.sno4_mng_typ,
						S0_T12.mfg_loc_cd,
						S0_T12.bom_ptn,
						S0_T12.sppl_cd,
						S0_M6.yield_schd_qty.as("mst_yield_schd_qty"),
						S0_M6.mfg_inst_qty.as("mst_mfg_inst_qty"),
						S0_M6.fxd_rqmt_qty.as("mst_fxd_rqmt_qty"),
						S0_M6.lot_issue_typ,
						S0_M6.ln_stk_flg,
						S0_T12.strg_loc_cd,
						S0_T11.base_unit_inst_qty,
						S0_T11.base_unit_yield_qty,
						S0_M1.unit_cd.as("base_unit_cd"),
						S0_M1.dec_place.as("base_unit_dec_place"),
						trunc(
							S0_T11.rqst_dlv_rqst_tm,
							MCDateFmt.DD
						).as("rqst_dlv_rqst_dt"),
						S0_T11.rqst_dlv_rqst_tm.as("rqst_dlv_rqst_hm"),
						trunc(
							S0_T11.st_schd_tm,
							MCDateFmt.DD
						).as("st_schd_dt"),
						S0_T11.st_schd_tm.as("st_schd_hm"),
						trunc(
							S0_T11.end_schd_tm,
							MCDateFmt.DD
						).as("end_schd_dt"),
						S0_T11.end_schd_tm.as("end_schd_hm"),
						S0_T12.oper_ptn,
						S0_T12.lot_no,
						S0_T12.sublot_no,
						S0_T12.sno1,
						S0_T12.sno2,
						S0_T12.sno3,
						S0_T12.sno4,
						S0_T11.inst_dt,
						S0_T11.inst_usr_cd,
						S0_T11.inst_dpt_cd,
						S0_M22.dpt_nm.as("inst_dpt_nm"),
						S0_T12.mfg_str_ln_cd.as("mfg_str_ln_cd"),
						S0_T12.strg_str_ln_cd.as("strg_str_ln_cd"),
						S0_T11.po_locked_flg,
						S0_T11.abort_flg.as("inst_abort_flg"),
						S0_T11.inst_rpt_rmrks,
						S0_T11.intr_rmrks,
						S0_T11.inst_po_cnt_rmrks,
						S0_T11.disp_pd,
						S0_T12.itm_lower_yield,
						S0_T12.itm_std_yield,
						S0_T12.itm_upper_yield,
						S0_T11.mfg_inst_no,
						S0_T11.mfg_inst_rev,
						S0_T11.inst_prnt_tm,
						S0_T11.inst_prnt_flg,
						S0_T11.itm_mfg_inst_no,
						S0_T1.itm_ord_no,
						S0_T11.mfg_inst_unit_typ,
						cases()
							.when(
								MAC_MFG_INST_UNIT_TYP$IS_OPER(S0_T11.mfg_inst_unit_typ).eq(value(true))
								.and(S0_T12.frst_mfg_inst_no.eq(S0_T11.mfg_inst_no))
							)
								.then(value(true))
							.otherwise(value(false)).as("frst_mfg_inst_flg"),
						S0_T12.unschd_inst_flg,
						S0_T12.unschd_act_flg,
						S0_T11.schd_chg_flg,
						S0_T1.inst_qty.as("base_unit_ord_qty"),
						S0_T1.not_inst_qty.as("base_unit_not_inst_qty"),
						cases()
							.when(S0_T1.not_inst_qty.gt(value(0)))
								.then(value(false))
							.when(
								S0_T1.inst_qty.gt(subQuery()
									.select(sum(S1_TMP.base_unit_inst_qty))
									.from(S1_TMP)
									.where(
										S1_TMP.itm_ord_no.eq(S0_T1.itm_ord_no)
										.and(S1_TMP.can_flg.eq(value(false)))
									)
								)
							)
								.then(value(true))
							.otherwise(value(false)).as("ord_abort_flg"),
						S0_T12.wg_cd.as("mfg_loc_wg_cd"),
						S0_T12.site_cd.as("mfg_loc_site_cd"),
						S0_T11.po_d_no.as("po_d_no"),
						S0_T11.po_auto_reg_flg,
						S0_T12.sub_char1.as("itm_mfg_inst_sub_char1"),
						S0_T12.sub_char2.as("itm_mfg_inst_sub_char2"),
						S0_T12.sub_char3.as("itm_mfg_inst_sub_char3"),
						S0_T11.sub_char1.as("mfg_inst_sub_char1"),
						S0_T11.sub_char2.as("mfg_inst_sub_char2"),
						S0_T11.sub_char3.as("mfg_inst_sub_char3"),
						S0_M1.th_image.as("tm_th_image"),
						S0_T11.mfg_aprv_sts_typ,
						S0_T11.aprv_dt,
						S0_T11.aprv_tm,
						S0_T11.aprv_dpt_cd,
						S0_M24.dpt_nm.as("aprv_dpt_nm"),
						S0_T11.aprv_usr_cd,
						S0_T11.aprv_rsn,
						S0_T11.aprv_flg.as("aprv_tgt_flg"),
						S0_M1.itm_typ,
						S0_M1.itm_typ_d_cd,
						S0_T11.ins_usr_id.as("ins_usr_id"),
						S0_T11.ins_usr_nm.as("ins_usr_nm"),
						S0_T11.ins_func_id.as("ins_func_id"),
						S0_T11.ins_ts.as("ins_ts"),
						S0_T1.upd_cntr.as("itm_ord_upd_cntr"),
						S0_T1.for_scheduler_frozen_flg,
						S0_T12.upd_cntr.as("itm_mfg_inst_upd_cntr"),
						S0_T11.upd_cntr.as("mfg_inst_upd_cntr"),
						S0_T11.upd_usr_id.as("upd_usr_id"),
						S0_T11.upd_usr_nm.as("upd_usr_nm"),
						S0_T11.upd_func_id.as("upd_func_id"),
						S0_T11.upd_ts.as("upd_ts"),
						S0_T11.upd_srv_req_no.as("upd_srv_req_no"),
						addDynamicSelect(DS0C_ITM_GRP),
						addDynamicSelect(DS0C_SPPL_GRP)
					)
					.from(
						S0_T11
						.innerJoin(S0_T12).on(
							bracket(
								S0_T11.itm_mfg_inst_no.eq(S0_T12.itm_mfg_inst_no)
							)
						)
						.innerJoin(S0_T13).on(
							bracket(
								S0_T11.mfg_inst_no.eq(S0_T13.mfg_inst_no)
							)
						)
						.innerJoin(S0_T1).on(
							bracket(
								S0_T12.itm_ord_no.eq(S0_T1.itm_ord_no)
							)
						)
						.leftOuterJoin(S0_M1).on(
							bracket(
								S0_T12.itm_cd.eq(S0_M1.itm_cd)
								.and(S0_T12.itm_sub1.eq(S0_M1.itm_sub1))
								.and(S0_T12.itm_sub2.eq(S0_M1.itm_sub2))
								.and(S0_T12.itm_sub3.eq(S0_M1.itm_sub3))
							)
						)
						.leftOuterJoin(S0_M2).on(
							bracket(
								S0_T12.itm_cd.eq(S0_M2.itm_cd)
								.and(S0_T12.itm_sub1.eq(S0_M2.itm_sub1))
								.and(S0_T12.itm_sub2.eq(S0_M2.itm_sub2))
								.and(S0_T12.itm_sub3.eq(S0_M2.itm_sub3))
								.and(S0_T12.sno1.eq(S0_M2.sno1))
								.and(S0_T12.sno2.eq(S0_M2.sno2))
								.and(S0_T12.sno3.eq(S0_M2.sno3))
								.and(S0_T12.sno4.eq(S0_M2.sno4))
							)
						)
						.leftOuterJoin(S0_M3).on(
							bracket(
								S0_T12.itm_cd.eq(S0_M3.itm_cd)
								.and(S0_T12.itm_sub1.eq(S0_M3.itm_sub1))
								.and(S0_T12.itm_sub2.eq(S0_M3.itm_sub2))
								.and(S0_T12.itm_sub3.eq(S0_M3.itm_sub3))
								.and(S0_T12.wg_cd.eq(S0_M3.wg_cd))
							)
						)
						.leftOuterJoin(S0_M6).on(
							bracket(
								S0_T12.itm_cd.eq(S0_M6.itm_cd)
								.and(S0_T12.itm_sub1.eq(S0_M6.itm_sub1))
								.and(S0_T12.itm_sub2.eq(S0_M6.itm_sub2))
								.and(S0_T12.itm_sub3.eq(S0_M6.itm_sub3))
								.and(S0_T12.mfg_loc_cd.eq(S0_M6.mfg_loc_cd))
								.and(S0_M6.sppl_cd.eq(value(MAC_STR.NULL_VAL.value())))
								.and(S0_M6.maker_cd.eq(value(MAC_STR.NULL_VAL.value())))
								.and(S0_M6.rqst_loc_cd.eq(value(MAC_STR.NULL_VAL.value())))
								.and(S0_T12.wg_cd.eq(S0_M6.wg_cd))
								.and(S0_T12.bom_ptn.eq(S0_M6.bom_ptn))
								.and(S0_T12.master_dt.between(S0_M6.st_dt, S0_M6.end_dt))
							)
						)
						.leftOuterJoin(S0_M22).on(
							bracket(
								S0_T11.inst_dpt_cd.eq(S0_M22.dpt_cd)
								.and(S0_T11.inst_dt.between(S0_M22.st_dt, S0_M22.end_dt))
							)
						)
						.leftOuterJoin(S0_M24).on(
							bracket(
								S0_T11.aprv_dpt_cd.eq(S0_M24.dpt_cd)
								.and(S0_T11.aprv_dt.between(S0_M24.st_dt, S0_M24.end_dt))
							)
						)
						.addDynamicView()
						.addDynamicView(DS0C_ITM_GRP)
						.addDynamicView(DS0C_SPPL_GRP)
					)
					.where(
						value(0).eq(value(0))
						.and(S0_T11.can_flg.eq(value(false)))
						.and(
							value(true).eq(value(false))
							.cutoff$or(S0_T13.mfg_sts_typ.eq(bind("tmp_sts_sav_str")))
							.cutoff$or(S0_T13.mfg_sts_typ.eq(bind("tmp_sts_ord_str")))
							.cutoff$or(S0_T13.mfg_sts_typ.eq(bind("tmp_sts_stt_str")))
							.cutoff$or(S0_T13.mfg_sts_typ.eq(bind("tmp_sts_cmpl_str")))
						)
						.and(
							bracket(
								bind("ope_val").eq(value(false))
								.and(
									exists(
										subQuery()
										.select(value("X"))
										.from(S2_V1)
										.where(
											S0_T12.mfg_loc_cd.eq(S2_V1.loc_cd)
										)
									)
								)
							)
							.or(
								bind("ope_val").eq(value(true))
								.and(
									exists(
										subQuery()
										.select(value("X"))
										.from(S3_V2)
										.where(
											S3_V2.aprv_role_cd.eq(S0_T11.mfg_aprv_role_cd)
											.and(S3_V2.usr_cd.eq(bind("tmp_aprv_usr")))
											.and(S3_V2.st_dt.lte(bind("tmp_today")))
											.and(
												S3_V2.end_dt.isNull()
												.or(S3_V2.end_dt.gte(bind("tmp_today")))
											)
										)
									)
								)
							)
						)
						.cutoff$and(S0_T11.inst_prnt_flg.eq(bind("tmp_inst_prnt_flg_str")))
						.cutoff$and(
							bind("tmp_alloc_tgt_flg_str").eq(value(true))
							.and(
								exists(
									subQuery()
									.select(value("X"))
									.from(S4_IS1)
									.where(
										S0_T11.mfg_inst_no.eq(S4_IS1.mfg_inst_no)
										.and(S4_IS1.can_flg.eq(value(false)))
										.and(S4_IS1.base_unit_rqmt_qty.add(S4_IS1.base_unit_fxd_rqmt_qty).gt(value(0)))
										.and(
											bracket(
												bind("not_alloc_srch_flg").eq(value(true))
												.and(S4_IS1.alloc_flg.eq(value(false)))
											)
											.or(bind("not_alloc_srch_flg").eq(value(false)))
										)
										.and(
											S4_IS1.alloc_ctl_typ.in(
												value(MAC_ALLOC_CTL_TYP.ALLOC_INST_NG.value()),
												value(MAC_ALLOC_CTL_TYP.ALLOC_INST_OK.value())
											)
										)
									)
								)
							)
						)
						.cutoff$and(
							bind("tmp_alloc_flg_false_str").eq(value(false))
							.and(
								notExists(
									subQuery()
									.select(value("X"))
									.from(S5_IS2)
									.where(
										S0_T11.mfg_inst_no.eq(S5_IS2.mfg_inst_no)
										.and(S5_IS2.can_flg.eq(value(false)))
										.and(S5_IS2.base_unit_rqmt_qty.add(S5_IS2.base_unit_fxd_rqmt_qty).gt(value(0)))
										.and(S5_IS2.alloc_flg.eq(value(false)))
										.and(
											S5_IS2.alloc_ctl_typ.in(
												value(MAC_ALLOC_CTL_TYP.ALLOC_INST_NG.value()),
												value(MAC_ALLOC_CTL_TYP.ALLOC_INST_OK.value())
											)
										)
									)
								)
							)
						)
						.cutoff$and(
							bind("tmp_alloc_mode_flg_str").eq(value(true))
							.and(
								exists(
									subQuery()
									.select(value("X"))
									.from(
										S7_IS3
										.leftOuterJoin(S7_IS4).on(
											bracket(
												S7_IS3.inpt_schd_no.eq(S7_IS4.inpt_schd_no)
											)
										)
									)
									.where(
										S0_T11.mfg_inst_no.eq(S7_IS3.mfg_inst_no)
										.and(
											S7_IS3.mfg_sts_typ.in(
												value(MSC_MFG_STS_TYP.SAV.value()),
												value(MSC_MFG_STS_TYP.ORD.value())
											)
										)
										.and(S7_IS4.can_flg.eq(value(false)))
										.and(S7_IS4.base_unit_rqmt_qty.add(S7_IS4.base_unit_fxd_rqmt_qty).gt(value(0)))
										.and(
											S7_IS4.alloc_ctl_typ.in(
												value(MAC_ALLOC_CTL_TYP.ALLOC_INST_NG.value()),
												value(MAC_ALLOC_CTL_TYP.ALLOC_INST_OK.value())
											)
										)
									)
								)
							)
						)
						.cutoff$and(
							bind("tmp_stk_lst_flg_str").eq(value(true))
							.and(
								exists(
									subQuery()
									.select(value("X"))
									.from(
										S6_YS1
										.innerJoin(S6_YP1).on(
											bracket(
												S6_YS1.yield_schd_no.eq(S6_YP1.yield_schd_no)
											)
										)
										.innerJoin(S6_M1).on(
											bracket(
												S6_YS1.itm_cd.eq(S6_M1.itm_cd)
												.and(S6_YS1.itm_sub1.eq(S6_M1.itm_sub1))
												.and(S6_YS1.itm_sub2.eq(S6_M1.itm_sub2))
												.and(S6_YS1.itm_sub3.eq(S6_M1.itm_sub3))
											)
										)
									)
									.where(
										S0_T11.mfg_inst_no.eq(S6_YS1.mfg_inst_no)
										.and(S6_YS1.can_flg.eq(value(false)))
										.and(S6_YP1.stk_lst_prnt_flg.eq(bind("tmp_stk_lst_issue_flg_str")))
										.and(S6_M1.stk_lst_flg.eq(bind("tmp_stk_lst_flg_str")))
									)
								)
							)
						)
						.cutoff$and(
							bind("tmp_stk_lst_flg_str").eq(value(true))
							.and(
								exists(
									subQuery()
									.select(value("X"))
									.from(
										S6_YS1
										.innerJoin(S6_YP1).on(
											bracket(
												S6_YS1.yield_schd_no.eq(S6_YP1.yield_schd_no)
											)
										)
										.innerJoin(S6_M1).on(
											bracket(
												S6_YS1.itm_cd.eq(S6_M1.itm_cd)
												.and(S6_YS1.itm_sub1.eq(S6_M1.itm_sub1))
												.and(S6_YS1.itm_sub2.eq(S6_M1.itm_sub2))
												.and(S6_YS1.itm_sub3.eq(S6_M1.itm_sub3))
											)
										)
									)
									.where(
										S0_T11.mfg_inst_no.eq(S6_YS1.mfg_inst_no)
										.and(S6_YS1.can_flg.eq(value(false)))
										.and(S6_M1.stk_lst_flg.eq(bind("tmp_stk_lst_flg_str")))
									)
								)
							)
						)
						.cutoff$and(S0_T11.st_schd_tm.gte(bind("st_schd_hm_fr")))
						.cutoff$and(S0_T11.st_schd_tm.lte(bind("st_schd_hm_to")))
						.cutoff$and(S0_T11.end_schd_tm.gte(bind("end_schd_hm_fr")))
						.cutoff$and(S0_T11.end_schd_tm.lte(bind("end_schd_hm_to")))
						.cutoff$and(S0_T11.rqst_dlv_rqst_tm.gte(bind("rqst_dlv_rqst_hm_fr")))
						.cutoff$and(S0_T11.rqst_dlv_rqst_tm.lte(bind("rqst_dlv_rqst_hm_to")))
						.cutoff$and(S0_T11.inst_dt.gte(bind("inst_dt_fr")))
						.cutoff$and(S0_T11.inst_dt.lte(bind("inst_dt_to")))
						.cutoff$and(S0_T11.aprv_dt.gte(bind("aprv_dt_fr")))
						.cutoff$and(S0_T11.aprv_dt.lte(bind("aprv_dt_to")))
						.cutoff$and(S0_T12.mfg_mtd_typ.like(bind("mfg_mtd_typ")))
						.cutoff$and(S0_T12.site_cd.like(bind("mfg_loc_site_cd")))
						.addDynamicPredicate()
						.cutoff$and(S0_T12.wg_cd.like(bind("mfg_loc_wg_cd")))
						.cutoff$and(S0_T12.mfg_loc_cd.like(bind("mfg_loc_cd")))
						.cutoff$and(S0_T12.mfg_str_ln_cd.like(bind("mfg_str_ln_cd")))
						.cutoff$and(S0_T12.strg_loc_cd.like(bind("strg_loc_cd")))
						.cutoff$and(S0_T12.strg_str_ln_cd.like(bind("strg_str_ln_cd")))
						.cutoff$and(S0_T12.sppl_cd.like(bind("sppl_cd")))
						.cutoff$and(S0_T11.mfg_aprv_sts_typ.like(bind("mfg_aprv_sts_typ")))
						.cutoff$and(S0_M1.itm_typ.like(bind("itm_typ")))
						.cutoff$and(S0_M1.itm_typ_d_cd.like(bind("itm_typ_d_cd")))
						.cutoff$and(S0_T12.itm_cd.like(bind("itm_cd")))
						.cutoff$and(S0_T12.itm_sub1.like(bind("itm_sub1")))
						.cutoff$and(S0_T12.itm_sub2.like(bind("itm_sub2")))
						.cutoff$and(S0_T12.itm_sub3.like(bind("itm_sub3")))
						.cutoff$and(
							nvl(
								S0_M2.itm_nm,
								S0_M1.itm_nm
							).like(bind("itm_nm"))
						)
						.cutoff$and(S0_T12.lot_no.like(bind("lot_no")))
						.cutoff$and(S0_T12.sublot_no.like(bind("sublot_no")))
						.cutoff$and(S0_T12.sno1.like(bind("sno1")))
						.cutoff$and(S0_T12.sno2.like(bind("sno2")))
						.cutoff$and(S0_T12.sno3.like(bind("sno3")))
						.cutoff$and(S0_T12.sno4.like(bind("sno4")))
						.cutoff$and(S0_T11.mfg_inst_unit_typ.like(bind("mfg_inst_unit_typ")))
						.cutoff$and(S0_T11.inst_usr_cd.like(bind("inst_usr_cd")))
						.cutoff$and(S0_T11.inst_dpt_cd.like(bind("inst_dpt_cd")))
						.cutoff$and(S0_M22.dpt_nm.like(bind("inst_dpt_nm")))
						.cutoff$and(S0_T11.aprv_dpt_cd.like(bind("aprv_dpt_cd")))
						.cutoff$and(S0_M24.dpt_nm.like(bind("aprv_dpt_nm")))
						.cutoff$and(S0_T11.aprv_usr_cd.like(bind("aprv_usr_cd")))
						.cutoff$and(S0_T1.itm_ord_no.like(bind("itm_ord_no")))
						.cutoff$and(S0_T11.po_d_no.like(bind("po_d_no")))
						.cutoff$and(S0_T11.itm_mfg_inst_no.like(bind("itm_mfg_inst_no")))
						.cutoff$and(S0_T11.mfg_inst_no.like(bind("mfg_inst_no")))
						.cutoff$and(S0_T11.abort_flg.eq(bind("tmp_abort_flg_str")))
						.cutoff$and(S0_T11.inst_rpt_rmrks.like(bind("inst_rpt_rmrks")))
						.cutoff$and(S0_T11.intr_rmrks.like(bind("intr_rmrks")))
						.cutoff$and(S0_T11.inst_po_cnt_rmrks.like(bind("inst_po_cnt_rmrks")))
						.cutoff$and(S0_T11.disp_pd.like(bind("disp_pd")))
						.cutoff$and(S0_T12.sub_char1.like(bind("itm_mfg_inst_sub_char1")))
						.cutoff$and(S0_T12.sub_char2.like(bind("itm_mfg_inst_sub_char2")))
						.cutoff$and(S0_T12.sub_char3.like(bind("itm_mfg_inst_sub_char3")))
						.cutoff$and(S0_T11.sub_char1.like(bind("mfg_inst_sub_char1")))
						.cutoff$and(S0_T11.sub_char2.like(bind("mfg_inst_sub_char2")))
						.cutoff$and(S0_T11.sub_char3.like(bind("mfg_inst_sub_char3")))
						.cutoff$and(S0_T12.unschd_act_flg.eq(bind("tmp_unschd_act_flg_str")))
						.addDynamicPredicate(DS0C_ITM_GRP)
						.addDynamicPredicate(DS0C_SPPL_GRP)
					)
					.orderBy(
						S0_T13.mfg_sts_typ.asc(),
						S0_T12.mfg_mtd_typ.asc(),
						S0_T11.st_schd_tm.asc(),
						S0_T1.itm_ord_no.asc(),
						S0_T11.mfg_inst_no.asc()
					)
			)
			.setDynamicSQLInfo(
				when(boundOr("po_aprv_sts_typ"))
					.view(v -> v.leftOuterJoin(S0_T14).on(bracket(S0_T11.po_d_no.eq(S0_T14.po_d_no)))),
				when(boundOr("po_aprv_sts_typ"))
					.view(v -> v.leftOuterJoin(S0_T15).on(bracket(S0_T14.po_no.eq(S0_T15.po_no))))
					.predicate(p -> p.cutoff$and(S0_T15.aprv_sts_typ.like(bind("po_aprv_sts_typ")))),
				when(boundOr("wrk_no", "wrk_nm"))
					.view(v -> v.leftOuterJoin(S0_T2).on(bracket(S0_T12.sno1.eq(S0_T2.sno1))))
					.predicate(p -> p.cutoff$and(S0_T2.wrk_no.like(bind("wrk_no"))).cutoff$and(S0_T2.wrk_nm.like(bind("wrk_nm")))),
				when(boundOr("mfg_loc_grp_nm", "mfg_loc_grp_cd", "mfg_loc_nm"))
					.view(v -> v.leftOuterJoin(S0_M4).on(bracket(S0_T12.mfg_loc_cd.eq(S0_M4.loc_cd))))
					.predicate(p -> p.cutoff$and(S0_M4.loc_grp_cd.like(bind("mfg_loc_grp_cd"))).cutoff$and(S0_M4.loc_nm.like(bind("mfg_loc_nm")))),
				when(boundOr("strg_loc_grp_nm", "strg_loc_grp_cd", "strg_loc_nm"))
					.view(v -> v.leftOuterJoin(S0_M5).on(bracket(S0_T12.strg_loc_cd.eq(S0_M5.loc_cd))))
					.predicate(p -> p.cutoff$and(S0_M5.loc_grp_cd.like(bind("strg_loc_grp_cd"))).cutoff$and(S0_M5.loc_nm.like(bind("strg_loc_nm")))),
				when(boundOr("mfg_loc_wg_nm"))
					.view(v -> v.leftOuterJoin(S0_M8).on(bracket(S0_T12.wg_cd.eq(S0_M8.wg_cd))))
					.predicate(p -> p.cutoff$and(S0_M8.wg_nm.like(bind("mfg_loc_wg_nm")))),
				when(boundOr("mfg_loc_site_nm"))
					.view(v -> v.leftOuterJoin(S0_M9).on(bracket(S0_T12.site_cd.eq(S0_M9.site_cd))))
					.predicate(p -> p.cutoff$and(S0_M9.site_nm.like(bind("mfg_loc_site_nm")))),
				when(boundOr("sppl_grp_flg1", "sppl_grp_flg2", "sppl_grp_flg3", "sppl_grp_flg4", "sppl_grp_flg5", "sppl_grp_flg6", "sppl_grp_flg7", "sppl_grp_flg8", "sppl_grp_flg9", "sppl_grp_flg10", "sppl_nm"))
					.view(v -> v.leftOuterJoin(S0_M10).on(bracket(S0_T12.sppl_cd.eq(S0_M10.bp_cd))))
					.predicate(p -> p.cutoff$and(S0_M10.bp_nm.like(bind("sppl_nm")))),
				when(boundOr("mfg_loc_grp_nm"))
					.view(v -> v.leftOuterJoin(S0_M11).on(bracket(S0_M4.loc_grp_cd.eq(S0_M11.loc_grp_cd))))
					.predicate(p -> p.cutoff$and(S0_M11.loc_grp_nm.like(bind("mfg_loc_grp_nm")))),
				when(boundOr("strg_loc_grp_nm"))
					.view(v -> v.leftOuterJoin(S0_M12).on(bracket(S0_M5.loc_grp_cd.eq(S0_M12.loc_grp_cd))))
					.predicate(p -> p.cutoff$and(S0_M12.loc_grp_nm.like(bind("strg_loc_grp_nm")))),
				when(boundOr("itm_typ_d_nm"))
					.view(v -> v.leftOuterJoin(S0_M13).on(bracket(S0_M1.itm_typ.eq(S0_M13.itm_typ).and(S0_M1.itm_typ_d_cd.eq(S0_M13.itm_typ_d_cd)))))
					.predicate(p -> p.cutoff$and(S0_M13.itm_typ_d_nm.like(bind("itm_typ_d_nm")))),
				when(boundOr("inst_usr_nm"))
					.view(v -> v.leftOuterJoin(S0_M21).on(bracket(S0_T11.inst_usr_cd.eq(S0_M21.usr_cd))))
					.predicate(p -> p.cutoff$and(S0_M21.usr_nm.like(bind("inst_usr_nm")))),
				when(boundOr("aprv_usr_nm"))
					.view(v -> v.leftOuterJoin(S0_M23).on(bracket(S0_T11.aprv_usr_cd.eq(S0_M23.usr_cd))))
					.predicate(p -> p.cutoff$and(S0_M23.usr_nm.like(bind("aprv_usr_nm")))),
				when(boundOr("mfg_str_ln_nm"))
					.view(v -> v.leftOuterJoin(S0_M25).on(bracket(S0_T12.mfg_loc_cd.eq(S0_M25.loc_cd).and(S0_T12.mfg_str_ln_cd.eq(S0_M25.str_ln_cd)))))
					.predicate(p -> p.cutoff$and(S0_M25.str_ln_nm.like(bind("mfg_str_ln_nm")))),
				when(boundOr("strg_str_ln_nm"))
					.view(v -> v.leftOuterJoin(S0_M26).on(bracket(S0_T12.strg_loc_cd.eq(S0_M26.loc_cd).and(S0_T12.strg_str_ln_cd.eq(S0_M26.str_ln_cd)))))
					.predicate(p -> p.cutoff$and(S0_M26.str_ln_nm.like(bind("strg_str_ln_nm")))),
				when(boundOr("tmp_today", "tmp_aprv_usr"))
					.view(v -> v.innerJoin(S0_M99).on(bracket(S0_T11.mfg_aprv_role_cd.eq(S0_M99.aprv_role_cd).and(bind("tmp_today").between(S0_M99.st_dt, S0_M99.end_dt)).and(bind("tmp_aprv_usr").eq(S0_M99.usr_cd))))),
				when(boundOr("itm_grp_flg1"))
					.select(DS0C_ITM_GRP, S0_M1.itm_grp_cd1.as("itm_grp_cd1"), S0_MM_ITM1.itm_grp_nm.as("itm_grp_nm1"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM_ITM1).on(S0_M1.itm_grp_cd1.eq(S0_MM_ITM1.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP1.value()).eq(S0_MM_ITM1.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M1.itm_grp_cd1.like(bind("itm_grp_cd1"))).cutoff$and(S0_MM_ITM1.itm_grp_nm.like(bind("itm_grp_nm1")))),
				when(boundOr("itm_grp_flg2"))
					.select(DS0C_ITM_GRP, S0_M1.itm_grp_cd2.as("itm_grp_cd2"), S0_MM_ITM2.itm_grp_nm.as("itm_grp_nm2"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM_ITM2).on(S0_M1.itm_grp_cd2.eq(S0_MM_ITM2.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP2.value()).eq(S0_MM_ITM2.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M1.itm_grp_cd2.like(bind("itm_grp_cd2"))).cutoff$and(S0_MM_ITM2.itm_grp_nm.like(bind("itm_grp_nm2")))),
				when(boundOr("itm_grp_flg3"))
					.select(DS0C_ITM_GRP, S0_M1.itm_grp_cd3.as("itm_grp_cd3"), S0_MM_ITM3.itm_grp_nm.as("itm_grp_nm3"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM_ITM3).on(S0_M1.itm_grp_cd3.eq(S0_MM_ITM3.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP3.value()).eq(S0_MM_ITM3.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M1.itm_grp_cd3.like(bind("itm_grp_cd3"))).cutoff$and(S0_MM_ITM3.itm_grp_nm.like(bind("itm_grp_nm3")))),
				when(boundOr("itm_grp_flg4"))
					.select(DS0C_ITM_GRP, S0_M1.itm_grp_cd4.as("itm_grp_cd4"), S0_MM_ITM4.itm_grp_nm.as("itm_grp_nm4"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM_ITM4).on(S0_M1.itm_grp_cd4.eq(S0_MM_ITM4.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP4.value()).eq(S0_MM_ITM4.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M1.itm_grp_cd4.like(bind("itm_grp_cd4"))).cutoff$and(S0_MM_ITM4.itm_grp_nm.like(bind("itm_grp_nm4")))),
				when(boundOr("itm_grp_flg5"))
					.select(DS0C_ITM_GRP, S0_M1.itm_grp_cd5.as("itm_grp_cd5"), S0_MM_ITM5.itm_grp_nm.as("itm_grp_nm5"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM_ITM5).on(S0_M1.itm_grp_cd5.eq(S0_MM_ITM5.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP5.value()).eq(S0_MM_ITM5.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M1.itm_grp_cd5.like(bind("itm_grp_cd5"))).cutoff$and(S0_MM_ITM5.itm_grp_nm.like(bind("itm_grp_nm5")))),
				when(boundOr("itm_grp_flg6"))
					.select(DS0C_ITM_GRP, S0_M1.itm_grp_cd6.as("itm_grp_cd6"), S0_MM_ITM6.itm_grp_nm.as("itm_grp_nm6"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM_ITM6).on(S0_M1.itm_grp_cd6.eq(S0_MM_ITM6.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP6.value()).eq(S0_MM_ITM6.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M1.itm_grp_cd6.like(bind("itm_grp_cd6"))).cutoff$and(S0_MM_ITM6.itm_grp_nm.like(bind("itm_grp_nm6")))),
				when(boundOr("itm_grp_flg7"))
					.select(DS0C_ITM_GRP, S0_M1.itm_grp_cd7.as("itm_grp_cd7"), S0_MM_ITM7.itm_grp_nm.as("itm_grp_nm7"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM_ITM7).on(S0_M1.itm_grp_cd7.eq(S0_MM_ITM7.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP7.value()).eq(S0_MM_ITM7.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M1.itm_grp_cd7.like(bind("itm_grp_cd7"))).cutoff$and(S0_MM_ITM7.itm_grp_nm.like(bind("itm_grp_nm7")))),
				when(boundOr("itm_grp_flg8"))
					.select(DS0C_ITM_GRP, S0_M1.itm_grp_cd8.as("itm_grp_cd8"), S0_MM_ITM8.itm_grp_nm.as("itm_grp_nm8"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM_ITM8).on(S0_M1.itm_grp_cd8.eq(S0_MM_ITM8.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP8.value()).eq(S0_MM_ITM8.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M1.itm_grp_cd8.like(bind("itm_grp_cd8"))).cutoff$and(S0_MM_ITM8.itm_grp_nm.like(bind("itm_grp_nm8")))),
				when(boundOr("itm_grp_flg9"))
					.select(DS0C_ITM_GRP, S0_M1.itm_grp_cd9.as("itm_grp_cd9"), S0_MM_ITM9.itm_grp_nm.as("itm_grp_nm9"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM_ITM9).on(S0_M1.itm_grp_cd9.eq(S0_MM_ITM9.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP9.value()).eq(S0_MM_ITM9.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M1.itm_grp_cd9.like(bind("itm_grp_cd9"))).cutoff$and(S0_MM_ITM9.itm_grp_nm.like(bind("itm_grp_nm9")))),
				when(boundOr("itm_grp_flg10"))
					.select(DS0C_ITM_GRP, S0_M1.itm_grp_cd10.as("itm_grp_cd10"), S0_MM_ITM10.itm_grp_nm.as("itm_grp_nm10"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM_ITM10).on(S0_M1.itm_grp_cd10.eq(S0_MM_ITM10.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP10.value()).eq(S0_MM_ITM10.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M1.itm_grp_cd10.like(bind("itm_grp_cd10"))).cutoff$and(S0_MM_ITM10.itm_grp_nm.like(bind("itm_grp_nm10")))),
				when(boundOr("sppl_grp_flg1"))
					.select(DS0C_SPPL_GRP, S0_M10.bp_grp_cd1.as("sppl_grp_cd1"), S0_MM_SPPL1.bp_grp_nm.as("sppl_grp_nm1"))
					.view(DS0C_SPPL_GRP, v -> v.leftOuterJoin(S0_MM_SPPL1).on(S0_M10.bp_grp_cd1.eq(S0_MM_SPPL1.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP1.value()).eq(S0_MM_SPPL1.bp_grp_typ))))
					.predicate(DS0C_SPPL_GRP, p -> p.cutoff$and(S0_M10.bp_grp_cd1.like(bind("sppl_grp_cd1"))).cutoff$and(S0_MM_SPPL1.bp_grp_nm.like(bind("sppl_grp_nm1")))),
				when(boundOr("sppl_grp_flg2"))
					.select(DS0C_SPPL_GRP, S0_M10.bp_grp_cd2.as("sppl_grp_cd2"), S0_MM_SPPL2.bp_grp_nm.as("sppl_grp_nm2"))
					.view(DS0C_SPPL_GRP, v -> v.leftOuterJoin(S0_MM_SPPL2).on(S0_M10.bp_grp_cd2.eq(S0_MM_SPPL2.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP2.value()).eq(S0_MM_SPPL2.bp_grp_typ))))
					.predicate(DS0C_SPPL_GRP, p -> p.cutoff$and(S0_M10.bp_grp_cd2.like(bind("sppl_grp_cd2"))).cutoff$and(S0_MM_SPPL2.bp_grp_nm.like(bind("sppl_grp_nm2")))),
				when(boundOr("sppl_grp_flg3"))
					.select(DS0C_SPPL_GRP, S0_M10.bp_grp_cd3.as("sppl_grp_cd3"), S0_MM_SPPL3.bp_grp_nm.as("sppl_grp_nm3"))
					.view(DS0C_SPPL_GRP, v -> v.leftOuterJoin(S0_MM_SPPL3).on(S0_M10.bp_grp_cd3.eq(S0_MM_SPPL3.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP3.value()).eq(S0_MM_SPPL3.bp_grp_typ))))
					.predicate(DS0C_SPPL_GRP, p -> p.cutoff$and(S0_M10.bp_grp_cd3.like(bind("sppl_grp_cd3"))).cutoff$and(S0_MM_SPPL3.bp_grp_nm.like(bind("sppl_grp_nm3")))),
				when(boundOr("sppl_grp_flg4"))
					.select(DS0C_SPPL_GRP, S0_M10.bp_grp_cd4.as("sppl_grp_cd4"), S0_MM_SPPL4.bp_grp_nm.as("sppl_grp_nm4"))
					.view(DS0C_SPPL_GRP, v -> v.leftOuterJoin(S0_MM_SPPL4).on(S0_M10.bp_grp_cd4.eq(S0_MM_SPPL4.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP4.value()).eq(S0_MM_SPPL4.bp_grp_typ))))
					.predicate(DS0C_SPPL_GRP, p -> p.cutoff$and(S0_M10.bp_grp_cd4.like(bind("sppl_grp_cd4"))).cutoff$and(S0_MM_SPPL4.bp_grp_nm.like(bind("sppl_grp_nm4")))),
				when(boundOr("sppl_grp_flg5"))
					.select(DS0C_SPPL_GRP, S0_M10.bp_grp_cd5.as("sppl_grp_cd5"), S0_MM_SPPL5.bp_grp_nm.as("sppl_grp_nm5"))
					.view(DS0C_SPPL_GRP, v -> v.leftOuterJoin(S0_MM_SPPL5).on(S0_M10.bp_grp_cd5.eq(S0_MM_SPPL5.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP5.value()).eq(S0_MM_SPPL5.bp_grp_typ))))
					.predicate(DS0C_SPPL_GRP, p -> p.cutoff$and(S0_M10.bp_grp_cd5.like(bind("sppl_grp_cd5"))).cutoff$and(S0_MM_SPPL5.bp_grp_nm.like(bind("sppl_grp_nm5")))),
				when(boundOr("sppl_grp_flg6"))
					.select(DS0C_SPPL_GRP, S0_M10.bp_grp_cd6.as("sppl_grp_cd6"), S0_MM_SPPL6.bp_grp_nm.as("sppl_grp_nm6"))
					.view(DS0C_SPPL_GRP, v -> v.leftOuterJoin(S0_MM_SPPL6).on(S0_M10.bp_grp_cd6.eq(S0_MM_SPPL6.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP6.value()).eq(S0_MM_SPPL6.bp_grp_typ))))
					.predicate(DS0C_SPPL_GRP, p -> p.cutoff$and(S0_M10.bp_grp_cd6.like(bind("sppl_grp_cd6"))).cutoff$and(S0_MM_SPPL6.bp_grp_nm.like(bind("sppl_grp_nm6")))),
				when(boundOr("sppl_grp_flg7"))
					.select(DS0C_SPPL_GRP, S0_M10.bp_grp_cd7.as("sppl_grp_cd7"), S0_MM_SPPL7.bp_grp_nm.as("sppl_grp_nm7"))
					.view(DS0C_SPPL_GRP, v -> v.leftOuterJoin(S0_MM_SPPL7).on(S0_M10.bp_grp_cd7.eq(S0_MM_SPPL7.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP7.value()).eq(S0_MM_SPPL7.bp_grp_typ))))
					.predicate(DS0C_SPPL_GRP, p -> p.cutoff$and(S0_M10.bp_grp_cd7.like(bind("sppl_grp_cd7"))).cutoff$and(S0_MM_SPPL7.bp_grp_nm.like(bind("sppl_grp_nm7")))),
				when(boundOr("sppl_grp_flg8"))
					.select(DS0C_SPPL_GRP, S0_M10.bp_grp_cd8.as("sppl_grp_cd8"), S0_MM_SPPL8.bp_grp_nm.as("sppl_grp_nm8"))
					.view(DS0C_SPPL_GRP, v -> v.leftOuterJoin(S0_MM_SPPL8).on(S0_M10.bp_grp_cd8.eq(S0_MM_SPPL8.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP8.value()).eq(S0_MM_SPPL8.bp_grp_typ))))
					.predicate(DS0C_SPPL_GRP, p -> p.cutoff$and(S0_M10.bp_grp_cd8.like(bind("sppl_grp_cd8"))).cutoff$and(S0_MM_SPPL8.bp_grp_nm.like(bind("sppl_grp_nm8")))),
				when(boundOr("sppl_grp_flg9"))
					.select(DS0C_SPPL_GRP, S0_M10.bp_grp_cd9.as("sppl_grp_cd9"), S0_MM_SPPL9.bp_grp_nm.as("sppl_grp_nm9"))
					.view(DS0C_SPPL_GRP, v -> v.leftOuterJoin(S0_MM_SPPL9).on(S0_M10.bp_grp_cd9.eq(S0_MM_SPPL9.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP9.value()).eq(S0_MM_SPPL9.bp_grp_typ))))
					.predicate(DS0C_SPPL_GRP, p -> p.cutoff$and(S0_M10.bp_grp_cd9.like(bind("sppl_grp_cd9"))).cutoff$and(S0_MM_SPPL9.bp_grp_nm.like(bind("sppl_grp_nm9")))),
				when(boundOr("sppl_grp_flg10"))
					.select(DS0C_SPPL_GRP, S0_M10.bp_grp_cd10.as("sppl_grp_cd10"), S0_MM_SPPL10.bp_grp_nm.as("sppl_grp_nm10"))
					.view(DS0C_SPPL_GRP, v -> v.leftOuterJoin(S0_MM_SPPL10).on(S0_M10.bp_grp_cd10.eq(S0_MM_SPPL10.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP10.value()).eq(S0_MM_SPPL10.bp_grp_typ))))
					.predicate(DS0C_SPPL_GRP, p -> p.cutoff$and(S0_M10.bp_grp_cd10.like(bind("sppl_grp_cd10"))).cutoff$and(S0_MM_SPPL10.bp_grp_nm.like(bind("sppl_grp_nm10"))))
			)
			.setJoinInfo(
				joinInfo(
					j -> j
						.add(MST_PO_D_R.class, r -> toCondition(
							r.getStringNE("po_d_no")
						))
						.addSelect(m -> toArray(
							m.po_no
						))
						.addMap((r, m) -> {
							r.setStringNE("join_po_no_", m.po_no());
					}),
					j -> j
						.add(MST_PO_R.class, r -> toCondition(
							r.getStringNE("join_po_no_")
						))
						.addSelect(m -> toArray(
							m.aprv_sts_typ
						))
						.addMap((r, m) -> {
							r.setStringNE("po_aprv_sts_typ", m.aprv_sts_typ());
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
						.add(MAM_LOC_R.class, r -> toCondition(
							r.getStringNE("mfg_loc_cd")
						))
						.addSelect(m -> toArray(
							m.loc_grp_cd,
							m.loc_nm,
							m.str_ln_tgt_flg
						))
						.addMap((r, m) -> {
							r.setStringNE("mfg_loc_nm", m.loc_nm());
							r.setBooleanNE("mfg_str_ln_tgt_flg", m.str_ln_tgt_flg());
							r.setStringNE("mfg_loc_grp_cd", m.loc_grp_cd());
					}),
					j -> j
						.add(MAM_LOC_R.class, r -> toCondition(
							r.getStringNE("strg_loc_cd")
						))
						.addSelect(m -> toArray(
							m.loc_grp_cd,
							m.loc_nm,
							m.str_ln_tgt_flg
						))
						.addMap((r, m) -> {
							r.setStringNE("strg_loc_nm", m.loc_nm());
							r.setBooleanNE("strg_str_ln_tgt_flg", m.str_ln_tgt_flg());
							r.setStringNE("join_loc_grp_cd_", m.loc_grp_cd());
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
						.add(MAM_WG_R.class, r -> toCondition(
							r.getStringNE("mfg_loc_wg_cd")
						))
						.addSelect(m -> toArray(
							m.wg_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("mfg_loc_wg_nm", m.wg_nm());
					}),
					j -> j
						.add(MAM_SITE_R.class, r -> toCondition(
							r.getStringNE("mfg_loc_site_cd")
						))
						.addSelect(m -> toArray(
							m.site_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("mfg_loc_site_nm", m.site_nm());
					}),
					j -> j
						.add(MAM_BP_R.class, r -> toCondition(
							r.getStringNE("sppl_cd")
						))
						.addSelect(m -> toArray(
							m.bp_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("sppl_nm", m.bp_nm());
					}),
					j -> j
						.add(MAM_LOC_GRP_R.class, r -> toCondition(
							r.getStringNE("mfg_loc_grp_cd")
						))
						.addSelect(m -> toArray(
							m.loc_grp_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("mfg_loc_grp_nm", m.loc_grp_nm());
					}),
					j -> j
						.add(MAM_ITM_TYP_D_R.class, r -> toCondition(
							r.getStringNE("itm_typ"),
							r.getStringNE("itm_typ_d_cd")
						))
						.addSelect(m -> toArray(
							m.itm_typ_d_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("itm_typ_d_nm", m.itm_typ_d_nm());
					}),
					j -> j
						.add(MAM_USR_R.class, r -> toCondition(
							r.getStringNE("inst_usr_cd")
						))
						.addSelect(m -> toArray(
							m.usr_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("inst_usr_nm", m.usr_nm());
					}),
					j -> j
						.add(MAM_USR_R.class, r -> toCondition(
							r.getStringNE("aprv_usr_cd")
						))
						.addSelect(m -> toArray(
							m.usr_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("aprv_usr_nm", m.usr_nm());
					}),
					j -> j
						.add(MAM_STR_LN_R.class, r -> toCondition(
							r.getStringNE("mfg_loc_cd"),
							r.getStringNE("mfg_str_ln_cd")
						))
						.addSelect(m -> toArray(
							m.str_ln_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("mfg_str_ln_nm", m.str_ln_nm());
					}),
					j -> j
						.add(MAM_STR_LN_R.class, r -> toCondition(
							r.getStringNE("strg_loc_cd"),
							r.getStringNE("strg_str_ln_cd")
						))
						.addSelect(m -> toArray(
							m.str_ln_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("strg_str_ln_nm", m.str_ln_nm());
					})
				)
			);
	}
	
	/**
	 * -- MSBCL1040_MST_OPER_INST_Query_S01
	 */
	static MCQueryPlan MSBCL1040_MST_OPER_INST_S01() {
		MST_OPER_INST_R S0_T21 = MST_OPER_INST_R.create("T21");
		MSVT_OPER_INST_PR_R S0_T22 = MSVT_OPER_INST_PR_R.create("T22");
		MST_MFG_INST_R S0_T11 = MST_MFG_INST_R.create("T11");
		MST_ITM_MFG_INST_R S0_T12 = MST_ITM_MFG_INST_R.create("T12");
		MSVT_MFG_INST_PR_R S0_T13 = MSVT_MFG_INST_PR_R.create("T13");
		MST_PO_D_R S0_T14 = MST_PO_D_R.create("T14");
		MST_PO_R S0_T15 = MST_PO_R.create("T15");
		MST_ITM_ORDER_R S0_T1 = MST_ITM_ORDER_R.create("T1");
		MSVT_WRK_SNO_R S0_T2 = MSVT_WRK_SNO_R.create("T2");
		MAM_ITM_R S0_M1 = MAM_ITM_R.create("M1");
		MAM_SUNDRY_ITM_R S0_M2 = MAM_SUNDRY_ITM_R.create("M2");
		MAVM_ITM_WG_R S0_M3 = MAVM_ITM_WG_R.create("M3");
		MAVM_RD_LOC_R S0_M4 = MAVM_RD_LOC_R.create("M4");
		MAM_LOC_R S0_M5 = MAM_LOC_R.create("M5");
		MAVM_ITM_DTL_MFG_R S0_M6 = MAVM_ITM_DTL_MFG_R.create("M6");
		MAM_WG_R S0_M8 = MAM_WG_R.create("M8");
		MAM_SITE_R S0_M9 = MAM_SITE_R.create("M9");
		MAM_BP_R S0_M10 = MAM_BP_R.create("M10");
		MAM_LOC_GRP_R S0_M11 = MAM_LOC_GRP_R.create("M11");
		MAM_LOC_GRP_R S0_M12 = MAM_LOC_GRP_R.create("M12");
		MAM_ITM_TYP_D_R S0_M13 = MAM_ITM_TYP_D_R.create("M13");
		MAM_USR_R S0_M21 = MAM_USR_R.create("M21");
		MAM_DPT_R S0_M22 = MAM_DPT_R.create("M22");
		MAM_USR_R S0_M23 = MAM_USR_R.create("M23");
		MAM_DPT_R S0_M24 = MAM_DPT_R.create("M24");
		MAM_STR_LN_R S0_M25 = MAM_STR_LN_R.create("M25");
		MAM_STR_LN_R S0_M26 = MAM_STR_LN_R.create("M26");
		MAM_OPER_R S0_M31 = MAM_OPER_R.create("M31");
		MAM_LOC_R S0_M33 = MAM_LOC_R.create("M33");
		MAM_STR_LN_R S0_M34 = MAM_STR_LN_R.create("M34");
		MAM_USR_R S0_M35 = MAM_USR_R.create("M35");
		MAM_ITM_GRP_R S0_MM_ITM1 = MAM_ITM_GRP_R.create("MM_ITM1");
		MAM_ITM_GRP_R S0_MM_ITM2 = MAM_ITM_GRP_R.create("MM_ITM2");
		MAM_ITM_GRP_R S0_MM_ITM3 = MAM_ITM_GRP_R.create("MM_ITM3");
		MAM_ITM_GRP_R S0_MM_ITM4 = MAM_ITM_GRP_R.create("MM_ITM4");
		MAM_ITM_GRP_R S0_MM_ITM5 = MAM_ITM_GRP_R.create("MM_ITM5");
		MAM_ITM_GRP_R S0_MM_ITM6 = MAM_ITM_GRP_R.create("MM_ITM6");
		MAM_ITM_GRP_R S0_MM_ITM7 = MAM_ITM_GRP_R.create("MM_ITM7");
		MAM_ITM_GRP_R S0_MM_ITM8 = MAM_ITM_GRP_R.create("MM_ITM8");
		MAM_ITM_GRP_R S0_MM_ITM9 = MAM_ITM_GRP_R.create("MM_ITM9");
		MAM_ITM_GRP_R S0_MM_ITM10 = MAM_ITM_GRP_R.create("MM_ITM10");
		MAM_BP_GRP_R S0_MM_SPPL1 = MAM_BP_GRP_R.create("MM_SPPL1");
		MAM_BP_GRP_R S0_MM_SPPL2 = MAM_BP_GRP_R.create("MM_SPPL2");
		MAM_BP_GRP_R S0_MM_SPPL3 = MAM_BP_GRP_R.create("MM_SPPL3");
		MAM_BP_GRP_R S0_MM_SPPL4 = MAM_BP_GRP_R.create("MM_SPPL4");
		MAM_BP_GRP_R S0_MM_SPPL5 = MAM_BP_GRP_R.create("MM_SPPL5");
		MAM_BP_GRP_R S0_MM_SPPL6 = MAM_BP_GRP_R.create("MM_SPPL6");
		MAM_BP_GRP_R S0_MM_SPPL7 = MAM_BP_GRP_R.create("MM_SPPL7");
		MAM_BP_GRP_R S0_MM_SPPL8 = MAM_BP_GRP_R.create("MM_SPPL8");
		MAM_BP_GRP_R S0_MM_SPPL9 = MAM_BP_GRP_R.create("MM_SPPL9");
		MAM_BP_GRP_R S0_MM_SPPL10 = MAM_BP_GRP_R.create("MM_SPPL10");
		MST_ITM_MFG_INST_R S1_TMP = MST_ITM_MFG_INST_R.create("TMP");
		MST_INPT_SCHD_R S2_IS1 = MST_INPT_SCHD_R.create("IS1");
		MST_INPT_SCHD_R S3_IS2 = MST_INPT_SCHD_R.create("IS2");
		MST_YIELD_SCHD_R S4_YS1 = MST_YIELD_SCHD_R.create("YS1");
		MSVT_YIELD_SCHD_PR_R S4_YP1 = MSVT_YIELD_SCHD_PR_R.create("YP1");
		MAM_ITM_R S4_M1 = MAM_ITM_R.create("M1");
		MST_OPER_ORDER_R operorder = MST_OPER_ORDER_R.create("OPERODR");
		
		MCDynamicSQLID DS0C_ITM_GRP = createDynamicSQLID("DS0C_ITM_GRP");
		MCDynamicSQLID DS0C_SPPL_GRP = createDynamicSQLID("DS0C_SPPL_GRP");
		
		return createQueryPlan()
			.setQuery(
				sql("MSBCL1040_MST_OPER_INST_Query_S01")
					.mainQuery()
					.select(
						S0_T12.mfg_mtd_typ,
						S0_T22.mfg_sts_typ,
						S0_T12.master_dt.as("master_dt"),
						S0_T12.itm_cd,
						S0_T12.itm_sub1,
						S0_T12.itm_sub2,
						S0_T12.itm_sub3,
						nvl(
							S0_M2.itm_nm,
							S0_M1.itm_nm
						).as("itm_nm"),
						S0_M1.lot_mng_typ,
						S0_M1.lot_no_typ,
						S0_M1.lot_no_ptn_cd,
						S0_M1.sublot_mng_typ,
						S0_M1.sublot_no_typ,
						S0_M1.sublot_no_ptn_cd,
						S0_M1.sno1_mng_typ,
						S0_M1.sno2_mng_typ,
						S0_M1.sno3_mng_typ,
						S0_M1.sno4_mng_typ,
						S0_T12.mfg_loc_cd,
						S0_M4.loc_nm.as("mfg_loc_nm"),
						S0_M4.str_ln_tgt_flg.as("mfg_str_ln_tgt_flg"),
						S0_T12.bom_ptn,
						S0_T12.sppl_cd,
						S0_M6.yield_schd_qty.as("mst_yield_schd_qty"),
						S0_M6.mfg_inst_qty.as("mst_mfg_inst_qty"),
						S0_M6.fxd_rqmt_qty.as("mst_fxd_rqmt_qty"),
						S0_M6.lot_issue_typ,
						S0_M6.ln_stk_flg,
						S0_T12.strg_loc_cd,
						nvl(
							S0_T11.base_unit_inst_qty,
							S0_T12.base_unit_inst_qty
						).as("base_unit_inst_qty"),
						nvl(
							S0_T11.base_unit_yield_qty,
							S0_T12.base_unit_yield_qty
						).as("base_unit_yield_qty"),
						S0_M1.unit_cd.as("base_unit_cd"),
						S0_M1.dec_place.as("base_unit_dec_place"),
						S0_M1.rnd_typ.as("base_unit_conv_rnd_typ"),
						cases()
							.when(
								MAC_MFG_INST_UNIT_TYP$IS_OPER(S0_T11.mfg_inst_unit_typ).eq(value(true))
								.and(S0_T12.frst_mfg_inst_no.eq(S0_T11.mfg_inst_no))
							)
								.then(value(true))
							.otherwise(value(false)).as("frst_mfg_inst_flg"),
						trunc(
							S0_T11.rqst_dlv_rqst_tm,
							MCDateFmt.DD
						).as("rqst_dlv_rqst_dt"),
						S0_T11.rqst_dlv_rqst_tm.as("rqst_dlv_rqst_hm"),
						trunc(
							S0_T21.st_schd_tm,
							MCDateFmt.DD
						).as("st_schd_dt"),
						S0_T21.st_schd_tm.as("st_schd_hm"),
						trunc(
							S0_T21.end_schd_tm,
							MCDateFmt.DD
						).as("end_schd_dt"),
						S0_T21.end_schd_tm.as("end_schd_hm"),
						S0_T12.oper_ptn,
						S0_T12.lot_no,
						S0_T12.sublot_no,
						S0_T12.sno1,
						S0_T12.sno2,
						S0_T12.sno3,
						S0_T12.sno4,
						S0_T11.inst_dt,
						S0_T11.inst_usr_cd,
						S0_T11.inst_dpt_cd,
						S0_M22.dpt_nm.as("inst_dpt_nm"),
						S0_T12.mfg_str_ln_cd.as("mfg_str_ln_cd"),
						S0_T12.strg_str_ln_cd.as("strg_str_ln_cd"),
						S0_T11.po_locked_flg,
						S0_T21.oper_abort_flg.as("inst_abort_flg"),
						S0_T11.inst_rpt_rmrks,
						S0_T11.intr_rmrks,
						S0_T21.inst_rpt_rmrks.as("oper_inst_rpt_rmrks"),
						S0_T21.intr_rmrks.as("oper_intr_rmrks"),
						cases()
							.when(S0_T11.mfg_inst_no.isNotNull())
								.then(S0_T11.inst_po_cnt_rmrks)
							.otherwise(S0_T1.inst_po_cnt_rmrks).as("inst_po_cnt_rmrks"),
						S0_T11.disp_pd,
						S0_T12.itm_lower_yield,
						S0_T12.itm_std_yield,
						S0_T12.itm_upper_yield,
						S0_T11.mfg_inst_no,
						S0_T11.mfg_inst_rev,
						S0_T11.inst_prnt_tm,
						S0_T11.inst_prnt_flg,
						S0_T11.can_flg,
						S0_T21.itm_mfg_inst_no,
						S0_T1.itm_ord_no,
						nvl(S0_T1.mfg_inst_unit_typ, S0_T11.mfg_inst_unit_typ).as("mfg_inst_unit_typ"),
						S0_T12.unschd_inst_flg,
						S0_T12.unschd_act_flg,
						S0_T11.schd_chg_flg,
						S0_T1.inst_qty.as("base_unit_ord_qty"),
						S0_T1.not_inst_qty.as("base_unit_not_inst_qty"),
						cases()
							.when(S0_T1.not_inst_qty.gt(value(0)))
								.then(value(false))
							.when(
								S0_T1.inst_qty.gt(subQuery()
									.select(sum(S1_TMP.base_unit_inst_qty))
									.from(S1_TMP)
									.where(
										S1_TMP.itm_ord_no.eq(S0_T1.itm_ord_no)
										.and(S1_TMP.can_flg.eq(value(false)))
									)
								)
							)
								.then(value(true))
							.otherwise(value(false)).as("ord_abort_flg"),
						S0_T12.wg_cd.as("mfg_loc_wg_cd"),
						S0_T12.site_cd.as("mfg_loc_site_cd"),
						S0_M4.loc_grp_cd.as("mfg_loc_grp_cd"),
						S0_T11.po_d_no.as("po_d_no"),
						S0_T11.po_auto_reg_flg,
						S0_T12.sub_char1.as("itm_mfg_inst_sub_char1"),
						S0_T12.sub_char2.as("itm_mfg_inst_sub_char2"),
						S0_T12.sub_char3.as("itm_mfg_inst_sub_char3"),
						S0_T11.sub_char1.as("mfg_inst_sub_char1"),
						S0_T11.sub_char2.as("mfg_inst_sub_char2"),
						S0_T11.sub_char3.as("mfg_inst_sub_char3"),
						S0_M1.th_image.as("tm_th_image"),
						S0_T11.mfg_aprv_sts_typ,
						S0_T11.aprv_dt,
						S0_T11.aprv_tm,
						S0_T11.aprv_dpt_cd,
						S0_M24.dpt_nm.as("aprv_dpt_nm"),
						S0_T11.aprv_usr_cd,
						S0_T11.aprv_rsn,
						S0_T11.aprv_flg.as("aprv_tgt_flg"),
						S0_T21.oper_cd,
						S0_T21.oper_seq,
						S0_T21.base_unit_qty.as("oper_base_unit_qty"),
						S0_T21.oper_std_qty,
						S0_T21.oper_conv_qty,
						S0_T21.oper_unit_dec_place,
						S0_T21.oper_unit_cd,
						S0_T21.oper_unit_conv_rnd_typ,
						S0_T21.oper_loc_cd,
						S0_T21.oper_str_ln_cd,
						S0_T21.oper_lower_yield,
						S0_T21.oper_std_yield,
						S0_T21.oper_upper_yield,
						S0_T21.usr_cd.as("oper_usr_cd"),
						S0_T21.disp_seq,
						S0_T21.oper_rsrc,
						S0_T21.sub_char1.as("oper_inst_sub_char1"),
						S0_T21.sub_char2.as("oper_inst_sub_char2"),
						S0_T21.sub_char3.as("oper_inst_sub_char3"),
						S0_T21.bkf_flg,
						S0_T21.mes_flg.as("last_mes_flg"),
						S0_T21.wk_cost_calc_flg,
						S0_T21.oper_inst_grp,
						S0_T21.oper_ord_no,
						S0_T21.oper_inst_no,
						S0_T21.yield_oper_flg,
						S0_T21.yield_oper_ratio,
						S0_M1.itm_typ,
						S0_M1.itm_typ_d_cd,
						operorder.scheduler_frozen_flg.as("scheduler_frozen_oper_flg"),
						S0_T21.ins_usr_id.as("ins_usr_id"),
						S0_T21.ins_usr_nm.as("ins_usr_nm"),
						S0_T21.ins_func_id.as("ins_func_id"),
						S0_T21.ins_ts.as("ins_ts"),
						S0_T1.upd_cntr.as("itm_ord_upd_cntr"),
						S0_T1.for_scheduler_frozen_flg,
						S0_T12.upd_cntr.as("itm_mfg_inst_upd_cntr"),
						S0_T11.upd_cntr.as("mfg_inst_upd_cntr"),
						S0_T21.upd_usr_id.as("upd_usr_id"),
						S0_T21.upd_usr_nm.as("upd_usr_nm"),
						S0_T21.upd_func_id.as("upd_func_id"),
						S0_T21.upd_ts.as("upd_ts"),
						S0_T21.upd_srv_req_no.as("upd_srv_req_no"),
						addDynamicSelect(DS0C_ITM_GRP),
						addDynamicSelect(DS0C_SPPL_GRP)
					)
					.from(
						S0_T21
						.innerJoin(S0_T22).on(
							bracket(
								S0_T21.oper_inst_no.eq(S0_T22.oper_inst_no)
							)
						)
						.leftOuterJoin(S0_T11).on(
							bracket(
								S0_T21.mfg_inst_no.eq(S0_T11.mfg_inst_no)
							)
						)
						.innerJoin(S0_T12).on(
							bracket(
								S0_T21.itm_mfg_inst_no.eq(S0_T12.itm_mfg_inst_no)
							)
						)
						.leftOuterJoin(S0_T13).on(
							bracket(
								S0_T11.mfg_inst_no.eq(S0_T13.mfg_inst_no)
							)
						)
						.innerJoin(S0_T1).on(
							bracket(
								S0_T12.itm_ord_no.eq(S0_T1.itm_ord_no)
							)
						)
						.leftOuterJoin(S0_M1).on(
							bracket(
								S0_T12.itm_cd.eq(S0_M1.itm_cd)
								.and(S0_T12.itm_sub1.eq(S0_M1.itm_sub1))
								.and(S0_T12.itm_sub2.eq(S0_M1.itm_sub2))
								.and(S0_T12.itm_sub3.eq(S0_M1.itm_sub3))
							)
						)
						.leftOuterJoin(S0_M2).on(
							bracket(
								S0_T12.itm_cd.eq(S0_M2.itm_cd)
								.and(S0_T12.itm_sub1.eq(S0_M2.itm_sub1))
								.and(S0_T12.itm_sub2.eq(S0_M2.itm_sub2))
								.and(S0_T12.itm_sub3.eq(S0_M2.itm_sub3))
								.and(S0_T12.sno1.eq(S0_M2.sno1))
								.and(S0_T12.sno2.eq(S0_M2.sno2))
								.and(S0_T12.sno3.eq(S0_M2.sno3))
								.and(S0_T12.sno4.eq(S0_M2.sno4))
							)
						)
						.leftOuterJoin(S0_M3).on(
							bracket(
								S0_T12.itm_cd.eq(S0_M3.itm_cd)
								.and(S0_T12.itm_sub1.eq(S0_M3.itm_sub1))
								.and(S0_T12.itm_sub2.eq(S0_M3.itm_sub2))
								.and(S0_T12.itm_sub3.eq(S0_M3.itm_sub3))
								.and(S0_T12.wg_cd.eq(S0_M3.wg_cd))
							)
						)
						.innerJoin(S0_M4).on(
							bracket(
								S0_T12.mfg_loc_cd.eq(S0_M4.loc_cd)
							)
						)
						.leftOuterJoin(S0_M6).on(
							bracket(
								S0_T12.itm_cd.eq(S0_M6.itm_cd)
								.and(S0_T12.itm_sub1.eq(S0_M6.itm_sub1))
								.and(S0_T12.itm_sub2.eq(S0_M6.itm_sub2))
								.and(S0_T12.itm_sub3.eq(S0_M6.itm_sub3))
								.and(S0_T12.mfg_loc_cd.eq(S0_M6.mfg_loc_cd))
								.and(S0_M6.sppl_cd.eq(value(MAC_STR.NULL_VAL.value())))
								.and(S0_M6.maker_cd.eq(value(MAC_STR.NULL_VAL.value())))
								.and(S0_M6.rqst_loc_cd.eq(value(MAC_STR.NULL_VAL.value())))
								.and(S0_T12.wg_cd.eq(S0_M6.wg_cd))
								.and(S0_T12.bom_ptn.eq(S0_M6.bom_ptn))
								.and(S0_T12.master_dt.between(S0_M6.st_dt, S0_M6.end_dt))
							)
						)
						.leftOuterJoin(S0_M22).on(
							bracket(
								S0_T11.inst_dpt_cd.eq(S0_M22.dpt_cd)
								.and(S0_T11.inst_dt.between(S0_M22.st_dt, S0_M22.end_dt))
							)
						)
						.leftOuterJoin(S0_M24).on(
							bracket(
								S0_T11.aprv_dpt_cd.eq(S0_M24.dpt_cd)
								.and(S0_T11.aprv_dt.between(S0_M24.st_dt, S0_M24.end_dt))
							)
						)
						.leftOuterJoin(operorder).on(
							bracket(
								S0_T21.oper_ord_no.eq(operorder.oper_ord_no)
							)
						)
						.addDynamicView()
						.addDynamicView(DS0C_ITM_GRP)
						.addDynamicView(DS0C_SPPL_GRP)
					)
					.where(
						value(0).eq(value(0))
						.and(S0_T21.can_flg.eq(value(false)))
						.and(
							value(true).eq(value(false))
							.cutoff$or(S0_T22.mfg_sts_typ.eq(bind("tmp_sts_yet_str")))
							.cutoff$or(S0_T22.mfg_sts_typ.eq(bind("tmp_sts_sav_str")))
							.cutoff$or(S0_T22.mfg_sts_typ.eq(bind("tmp_sts_ord_str")))
							.cutoff$or(S0_T22.mfg_sts_typ.eq(bind("tmp_sts_stt_str")))
							.cutoff$or(S0_T22.mfg_sts_typ.eq(bind("tmp_sts_cmpl_str")))
						)
						.cutoff$and(S0_T11.inst_prnt_flg.eq(bind("tmp_inst_prnt_flg_str")))
						.cutoff$and(
							bind("tmp_alloc_tgt_flg_str").eq(value(true))
							.and(
								exists(
									subQuery()
									.select(value("X"))
									.from(S2_IS1)
									.where(
										S0_T21.oper_inst_no.eq(S2_IS1.oper_inst_no)
										.and(S2_IS1.can_flg.eq(value(false)))
										.and(S2_IS1.base_unit_rqmt_qty.add(S2_IS1.base_unit_fxd_rqmt_qty).gt(value(0)))
										.and(
											bracket(
												bind("not_alloc_srch_flg").eq(value(true))
												.and(S2_IS1.alloc_flg.eq(value(false)))
											)
											.or(bind("not_alloc_srch_flg").eq(value(false)))
										)
										.and(
											S2_IS1.alloc_ctl_typ.in(
												value(MAC_ALLOC_CTL_TYP.ALLOC_INST_NG.value()),
												value(MAC_ALLOC_CTL_TYP.ALLOC_INST_OK.value())
											)
										)
									)
								)
							)
						)
						.cutoff$and(
							bind("tmp_alloc_flg_false_str").eq(value(false))
							.and(
								notExists(
									subQuery()
									.select(value("X"))
									.from(S3_IS2)
									.where(
										S0_T21.oper_inst_no.eq(S3_IS2.oper_inst_no)
										.and(S3_IS2.can_flg.eq(value(false)))
										.and(S3_IS2.base_unit_rqmt_qty.add(S3_IS2.base_unit_fxd_rqmt_qty).gt(value(0)))
										.and(S3_IS2.alloc_flg.eq(value(false)))
										.and(
											S3_IS2.alloc_ctl_typ.in(
												value(MAC_ALLOC_CTL_TYP.ALLOC_INST_NG.value()),
												value(MAC_ALLOC_CTL_TYP.ALLOC_INST_OK.value())
											)
										)
									)
								)
							)
						)
						.cutoff$and(
							bind("tmp_stk_lst_flg_str").eq(value(true))
							.and(
								exists(
									subQuery()
									.select(value("X"))
									.from(
										S4_YS1
										.innerJoin(S4_YP1).on(
											bracket(
												S4_YS1.yield_schd_no.eq(S4_YP1.yield_schd_no)
											)
										)
										.innerJoin(S4_M1).on(
											bracket(
												S4_YS1.itm_cd.eq(S4_M1.itm_cd)
												.and(S4_YS1.itm_sub1.eq(S4_M1.itm_sub1))
												.and(S4_YS1.itm_sub2.eq(S4_M1.itm_sub2))
												.and(S4_YS1.itm_sub3.eq(S4_M1.itm_sub3))
											)
										)
									)
									.where(
										S0_T11.mfg_inst_no.eq(S4_YS1.mfg_inst_no)
										.and(S4_YS1.can_flg.eq(value(false)))
										.and(S4_YP1.stk_lst_prnt_flg.eq(bind("tmp_stk_lst_issue_flg_str")))
										.and(S4_M1.stk_lst_flg.eq(bind("tmp_stk_lst_flg_str")))
									)
								)
							)
						)
						.cutoff$and(S0_T21.st_schd_tm.gte(bind("st_schd_hm_fr")))
						.cutoff$and(S0_T21.st_schd_tm.lte(bind("st_schd_hm_to")))
						.cutoff$and(S0_T21.end_schd_tm.gte(bind("end_schd_hm_fr")))
						.cutoff$and(S0_T21.end_schd_tm.lte(bind("end_schd_hm_to")))
						.cutoff$and(S0_T11.rqst_dlv_rqst_tm.gte(bind("rqst_dlv_rqst_hm_fr")))
						.cutoff$and(S0_T11.rqst_dlv_rqst_tm.lte(bind("rqst_dlv_rqst_hm_to")))
						.cutoff$and(S0_T11.inst_dt.gte(bind("inst_dt_fr")))
						.cutoff$and(S0_T11.inst_dt.lte(bind("inst_dt_to")))
						.cutoff$and(S0_T11.aprv_dt.gte(bind("aprv_dt_fr")))
						.cutoff$and(S0_T11.aprv_dt.lte(bind("aprv_dt_to")))
						.cutoff$and(S0_T12.mfg_mtd_typ.like(bind("mfg_mtd_typ")))
						.cutoff$and(S0_T12.site_cd.like(bind("mfg_loc_site_cd")))
						.addDynamicPredicate()
						.cutoff$and(S0_T12.wg_cd.like(bind("mfg_loc_wg_cd")))
						.cutoff$and(S0_M4.loc_grp_cd.like(bind("mfg_loc_grp_cd")))
						.cutoff$and(S0_T12.mfg_loc_cd.like(bind("mfg_loc_cd")))
						.cutoff$and(S0_M4.loc_nm.like(bind("mfg_loc_nm")))
						.cutoff$and(S0_T12.mfg_str_ln_cd.like(bind("mfg_str_ln_cd")))
						.cutoff$and(S0_T12.strg_loc_cd.like(bind("strg_loc_cd")))
						.cutoff$and(S0_T12.strg_str_ln_cd.like(bind("strg_str_ln_cd")))
						.cutoff$and(S0_T21.oper_loc_cd.like(bind("oper_loc_cd")))
						.cutoff$and(S0_T21.oper_str_ln_cd.like(bind("oper_str_ln_cd")))
						.cutoff$and(S0_T21.oper_cd.like(bind("oper_cd")))
						.cutoff$and(S0_T12.sppl_cd.like(bind("sppl_cd")))
						.cutoff$and(S0_T11.mfg_aprv_sts_typ.like(bind("mfg_aprv_sts_typ")))
						.cutoff$and(S0_M1.itm_typ.like(bind("itm_typ")))
						.cutoff$and(S0_M1.itm_typ_d_cd.like(bind("itm_typ_d_cd")))
						.cutoff$and(S0_T12.itm_cd.like(bind("itm_cd")))
						.cutoff$and(S0_T12.itm_sub1.like(bind("itm_sub1")))
						.cutoff$and(S0_T12.itm_sub2.like(bind("itm_sub2")))
						.cutoff$and(S0_T12.itm_sub3.like(bind("itm_sub3")))
						.cutoff$and(
							nvl(
								S0_M2.itm_nm,
								S0_M1.itm_nm
							).like(bind("itm_nm"))
						)
						.cutoff$and(S0_T12.lot_no.like(bind("lot_no")))
						.cutoff$and(S0_T12.sublot_no.like(bind("sublot_no")))
						.cutoff$and(S0_T12.sno1.like(bind("sno1")))
						.cutoff$and(S0_T12.sno2.like(bind("sno2")))
						.cutoff$and(S0_T12.sno3.like(bind("sno3")))
						.cutoff$and(S0_T12.sno4.like(bind("sno4")))
						.cutoff$and(S0_T1.mfg_inst_unit_typ.like(bind("mfg_inst_unit_typ")))
						.cutoff$and(S0_T11.inst_usr_cd.like(bind("inst_usr_cd")))
						.cutoff$and(S0_T11.inst_dpt_cd.like(bind("inst_dpt_cd")))
						.cutoff$and(S0_M22.dpt_nm.like(bind("inst_dpt_nm")))
						.cutoff$and(S0_T11.aprv_dpt_cd.like(bind("aprv_dpt_cd")))
						.cutoff$and(S0_M24.dpt_nm.like(bind("aprv_dpt_nm")))
						.cutoff$and(S0_T11.aprv_usr_cd.like(bind("aprv_usr_cd")))
						.cutoff$and(S0_T21.usr_cd.like(bind("oper_usr_cd")))
						.cutoff$and(S0_T1.itm_ord_no.like(bind("itm_ord_no")))
						.cutoff$and(S0_T21.oper_ord_no.like(bind("oper_ord_no")))
						.cutoff$and(S0_T11.po_d_no.like(bind("po_d_no")))
						.cutoff$and(S0_T21.itm_mfg_inst_no.like(bind("itm_mfg_inst_no")))
						.cutoff$and(S0_T11.mfg_inst_no.like(bind("mfg_inst_no")))
						.cutoff$and(S0_T21.oper_inst_no.like(bind("oper_inst_no")))
						.cutoff$and(S0_T21.oper_abort_flg.eq(bind("tmp_abort_flg_str")))
						.cutoff$and(S0_T11.can_flg.eq(bind("tmp_can_flg_str")))
						.cutoff$and(S0_T11.inst_rpt_rmrks.like(bind("inst_rpt_rmrks")))
						.cutoff$and(S0_T11.intr_rmrks.like(bind("intr_rmrks")))
						.cutoff$and(S0_T11.inst_po_cnt_rmrks.like(bind("inst_po_cnt_rmrks")))
						.cutoff$and(S0_T11.disp_pd.like(bind("disp_pd")))
						.cutoff$and(S0_T21.inst_rpt_rmrks.like(bind("oper_inst_rpt_rmrks")))
						.cutoff$and(S0_T21.intr_rmrks.like(bind("oper_intr_rmrks")))
						.cutoff$and(S0_T21.sub_char1.like(bind("oper_inst_sub_char1")))
						.cutoff$and(S0_T21.sub_char2.like(bind("oper_inst_sub_char2")))
						.cutoff$and(S0_T21.sub_char3.like(bind("oper_inst_sub_char3")))
						.cutoff$and(S0_T12.sub_char1.like(bind("itm_mfg_inst_sub_char1")))
						.cutoff$and(S0_T12.sub_char2.like(bind("itm_mfg_inst_sub_char2")))
						.cutoff$and(S0_T12.sub_char3.like(bind("itm_mfg_inst_sub_char3")))
						.cutoff$and(S0_T11.sub_char1.like(bind("mfg_inst_sub_char1")))
						.cutoff$and(S0_T11.sub_char2.like(bind("mfg_inst_sub_char2")))
						.cutoff$and(S0_T11.sub_char3.like(bind("mfg_inst_sub_char3")))
						.cutoff$and(
							bracket(
								S0_T22.mfg_sts_typ.in(
									value(MSC_MFG_STS_TYP.YET.value()),
									value(MSC_MFG_STS_TYP.SAV.value())
								)
								.or(
									S0_T22.mfg_sts_typ.in(
										value(MSC_MFG_STS_TYP.ORD.value()),
										value(MSC_MFG_STS_TYP.STT.value()),
										value(MSC_MFG_STS_TYP.CMPL.value())
									)
									.and(S0_T21.mes_flg.eq(bind("tmp_mes_tgt_flg_str")))
								)
							)
						)
						.cutoff$and(S0_T12.unschd_act_flg.eq(bind("tmp_unschd_act_flg_str")))
						.cutoff$and(S0_T21.oper_rsrc.like(bind("oper_rsrc")))
						.addDynamicPredicate(DS0C_ITM_GRP)
						.addDynamicPredicate(DS0C_SPPL_GRP)
					)
					.orderBy(
						S0_T22.mfg_sts_typ.asc(),
						S0_T12.mfg_mtd_typ.asc(),
						S0_T21.st_schd_tm.asc(),
						S0_T1.itm_ord_no.asc(),
						S0_T11.mfg_inst_no.asc(),
						S0_T21.disp_seq.asc()
					)
			)
			.setDynamicSQLInfo(
				when(boundOr("po_aprv_sts_typ"))
					.view(v -> v.leftOuterJoin(S0_T14).on(bracket(S0_T11.po_d_no.eq(S0_T14.po_d_no)))),
				when(boundOr("po_aprv_sts_typ"))
					.view(v -> v.leftOuterJoin(S0_T15).on(bracket(S0_T14.po_no.eq(S0_T15.po_no))))
					.predicate(p -> p.cutoff$and(S0_T15.aprv_sts_typ.like(bind("po_aprv_sts_typ")))),
				when(boundOr("wrk_no", "wrk_nm"))
					.view(v -> v.leftOuterJoin(S0_T2).on(bracket(S0_T12.sno1.eq(S0_T2.sno1))))
					.predicate(p -> p.cutoff$and(S0_T2.wrk_no.like(bind("wrk_no"))).cutoff$and(S0_T2.wrk_nm.like(bind("wrk_nm")))),
				when(boundOr("strg_loc_grp_nm", "strg_loc_grp_cd", "strg_loc_nm"))
					.view(v -> v.leftOuterJoin(S0_M5).on(bracket(S0_T12.strg_loc_cd.eq(S0_M5.loc_cd))))
					.predicate(p -> p.cutoff$and(S0_M5.loc_grp_cd.like(bind("strg_loc_grp_cd"))).cutoff$and(S0_M5.loc_nm.like(bind("strg_loc_nm")))),
				when(boundOr("mfg_loc_wg_nm"))
					.view(v -> v.leftOuterJoin(S0_M8).on(bracket(S0_T12.wg_cd.eq(S0_M8.wg_cd))))
					.predicate(p -> p.cutoff$and(S0_M8.wg_nm.like(bind("mfg_loc_wg_nm")))),
				when(boundOr("mfg_loc_site_nm"))
					.view(v -> v.leftOuterJoin(S0_M9).on(bracket(S0_T12.site_cd.eq(S0_M9.site_cd))))
					.predicate(p -> p.cutoff$and(S0_M9.site_nm.like(bind("mfg_loc_site_nm")))),
				when(boundOr("sppl_grp_flg1", "sppl_grp_flg2", "sppl_grp_flg3", "sppl_grp_flg4", "sppl_grp_flg5", "sppl_grp_flg6", "sppl_grp_flg7", "sppl_grp_flg8", "sppl_grp_flg9", "sppl_grp_flg10", "sppl_nm"))
					.view(v -> v.leftOuterJoin(S0_M10).on(bracket(S0_T12.sppl_cd.eq(S0_M10.bp_cd))))
					.predicate(p -> p.cutoff$and(S0_M10.bp_nm.like(bind("sppl_nm")))),
				when(boundOr("mfg_loc_grp_nm"))
					.view(v -> v.leftOuterJoin(S0_M11).on(bracket(S0_M4.loc_grp_cd.eq(S0_M11.loc_grp_cd))))
					.predicate(p -> p.cutoff$and(S0_M11.loc_grp_nm.like(bind("mfg_loc_grp_nm")))),
				when(boundOr("strg_loc_grp_nm"))
					.view(v -> v.leftOuterJoin(S0_M12).on(bracket(S0_M5.loc_grp_cd.eq(S0_M12.loc_grp_cd))))
					.predicate(p -> p.cutoff$and(S0_M12.loc_grp_nm.like(bind("strg_loc_grp_nm")))),
				when(boundOr("itm_typ_d_nm"))
					.view(v -> v.leftOuterJoin(S0_M13).on(bracket(S0_M1.itm_typ.eq(S0_M13.itm_typ).and(S0_M1.itm_typ_d_cd.eq(S0_M13.itm_typ_d_cd)))))
					.predicate(p -> p.cutoff$and(S0_M13.itm_typ_d_nm.like(bind("itm_typ_d_nm")))),
				when(boundOr("inst_usr_nm"))
					.view(v -> v.leftOuterJoin(S0_M21).on(bracket(S0_T11.inst_usr_cd.eq(S0_M21.usr_cd))))
					.predicate(p -> p.cutoff$and(S0_M21.usr_nm.like(bind("inst_usr_nm")))),
				when(boundOr("aprv_usr_nm"))
					.view(v -> v.leftOuterJoin(S0_M23).on(bracket(S0_T11.aprv_usr_cd.eq(S0_M23.usr_cd))))
					.predicate(p -> p.cutoff$and(S0_M23.usr_nm.like(bind("aprv_usr_nm")))),
				when(boundOr("mfg_str_ln_nm"))
					.view(v -> v.leftOuterJoin(S0_M25).on(bracket(S0_T12.mfg_loc_cd.eq(S0_M25.loc_cd).and(S0_T12.mfg_str_ln_cd.eq(S0_M25.str_ln_cd)))))
					.predicate(p -> p.cutoff$and(S0_M25.str_ln_nm.like(bind("mfg_str_ln_nm")))),
				when(boundOr("strg_str_ln_nm"))
					.view(v -> v.leftOuterJoin(S0_M26).on(bracket(S0_T12.strg_loc_cd.eq(S0_M26.loc_cd).and(S0_T12.strg_str_ln_cd.eq(S0_M26.str_ln_cd)))))
					.predicate(p -> p.cutoff$and(S0_M26.str_ln_nm.like(bind("strg_str_ln_nm")))),
				when(boundOr("oper_nm"))
					.view(v -> v.leftOuterJoin(S0_M31).on(bracket(S0_T21.oper_cd.eq(S0_M31.oper_cd))))
					.predicate(p -> p.cutoff$and(S0_M31.oper_nm.like(bind("oper_nm")))),
				when(boundOr("oper_loc_nm"))
					.view(v -> v.leftOuterJoin(S0_M33).on(bracket(S0_T21.oper_loc_cd.eq(S0_M33.loc_cd))))
					.predicate(p -> p.cutoff$and(S0_M33.loc_nm.like(bind("oper_loc_nm")))),
				when(boundOr("oper_str_ln_nm"))
					.view(v -> v.leftOuterJoin(S0_M34).on(bracket(S0_T21.oper_loc_cd.eq(S0_M34.loc_cd).and(S0_T21.oper_str_ln_cd.eq(S0_M34.str_ln_cd)))))
					.predicate(p -> p.cutoff$and(S0_M34.str_ln_nm.like(bind("oper_str_ln_nm")))),
				when(boundOr("oper_usr_nm"))
					.view(v -> v.leftOuterJoin(S0_M35).on(bracket(S0_T21.usr_cd.eq(S0_M35.usr_cd))))
					.predicate(p -> p.cutoff$and(S0_M35.usr_nm.like(bind("oper_usr_nm")))),
				when(boundOr("itm_grp_flg1"))
					.select(DS0C_ITM_GRP, S0_M1.itm_grp_cd1.as("itm_grp_cd1"), S0_MM_ITM1.itm_grp_nm.as("itm_grp_nm1"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM_ITM1).on(S0_M1.itm_grp_cd1.eq(S0_MM_ITM1.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP1.value()).eq(S0_MM_ITM1.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M1.itm_grp_cd1.like(bind("itm_grp_cd1"))).cutoff$and(S0_MM_ITM1.itm_grp_nm.like(bind("itm_grp_nm1")))),
				when(boundOr("itm_grp_flg2"))
					.select(DS0C_ITM_GRP, S0_M1.itm_grp_cd2.as("itm_grp_cd2"), S0_MM_ITM2.itm_grp_nm.as("itm_grp_nm2"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM_ITM2).on(S0_M1.itm_grp_cd2.eq(S0_MM_ITM2.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP2.value()).eq(S0_MM_ITM2.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M1.itm_grp_cd2.like(bind("itm_grp_cd2"))).cutoff$and(S0_MM_ITM2.itm_grp_nm.like(bind("itm_grp_nm2")))),
				when(boundOr("itm_grp_flg3"))
					.select(DS0C_ITM_GRP, S0_M1.itm_grp_cd3.as("itm_grp_cd3"), S0_MM_ITM3.itm_grp_nm.as("itm_grp_nm3"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM_ITM3).on(S0_M1.itm_grp_cd3.eq(S0_MM_ITM3.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP3.value()).eq(S0_MM_ITM3.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M1.itm_grp_cd3.like(bind("itm_grp_cd3"))).cutoff$and(S0_MM_ITM3.itm_grp_nm.like(bind("itm_grp_nm3")))),
				when(boundOr("itm_grp_flg4"))
					.select(DS0C_ITM_GRP, S0_M1.itm_grp_cd4.as("itm_grp_cd4"), S0_MM_ITM4.itm_grp_nm.as("itm_grp_nm4"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM_ITM4).on(S0_M1.itm_grp_cd4.eq(S0_MM_ITM4.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP4.value()).eq(S0_MM_ITM4.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M1.itm_grp_cd4.like(bind("itm_grp_cd4"))).cutoff$and(S0_MM_ITM4.itm_grp_nm.like(bind("itm_grp_nm4")))),
				when(boundOr("itm_grp_flg5"))
					.select(DS0C_ITM_GRP, S0_M1.itm_grp_cd5.as("itm_grp_cd5"), S0_MM_ITM5.itm_grp_nm.as("itm_grp_nm5"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM_ITM5).on(S0_M1.itm_grp_cd5.eq(S0_MM_ITM5.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP5.value()).eq(S0_MM_ITM5.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M1.itm_grp_cd5.like(bind("itm_grp_cd5"))).cutoff$and(S0_MM_ITM5.itm_grp_nm.like(bind("itm_grp_nm5")))),
				when(boundOr("itm_grp_flg6"))
					.select(DS0C_ITM_GRP, S0_M1.itm_grp_cd6.as("itm_grp_cd6"), S0_MM_ITM6.itm_grp_nm.as("itm_grp_nm6"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM_ITM6).on(S0_M1.itm_grp_cd6.eq(S0_MM_ITM6.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP6.value()).eq(S0_MM_ITM6.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M1.itm_grp_cd6.like(bind("itm_grp_cd6"))).cutoff$and(S0_MM_ITM6.itm_grp_nm.like(bind("itm_grp_nm6")))),
				when(boundOr("itm_grp_flg7"))
					.select(DS0C_ITM_GRP, S0_M1.itm_grp_cd7.as("itm_grp_cd7"), S0_MM_ITM7.itm_grp_nm.as("itm_grp_nm7"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM_ITM7).on(S0_M1.itm_grp_cd7.eq(S0_MM_ITM7.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP7.value()).eq(S0_MM_ITM7.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M1.itm_grp_cd7.like(bind("itm_grp_cd7"))).cutoff$and(S0_MM_ITM7.itm_grp_nm.like(bind("itm_grp_nm7")))),
				when(boundOr("itm_grp_flg8"))
					.select(DS0C_ITM_GRP, S0_M1.itm_grp_cd8.as("itm_grp_cd8"), S0_MM_ITM8.itm_grp_nm.as("itm_grp_nm8"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM_ITM8).on(S0_M1.itm_grp_cd8.eq(S0_MM_ITM8.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP8.value()).eq(S0_MM_ITM8.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M1.itm_grp_cd8.like(bind("itm_grp_cd8"))).cutoff$and(S0_MM_ITM8.itm_grp_nm.like(bind("itm_grp_nm8")))),
				when(boundOr("itm_grp_flg9"))
					.select(DS0C_ITM_GRP, S0_M1.itm_grp_cd9.as("itm_grp_cd9"), S0_MM_ITM9.itm_grp_nm.as("itm_grp_nm9"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM_ITM9).on(S0_M1.itm_grp_cd9.eq(S0_MM_ITM9.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP9.value()).eq(S0_MM_ITM9.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M1.itm_grp_cd9.like(bind("itm_grp_cd9"))).cutoff$and(S0_MM_ITM9.itm_grp_nm.like(bind("itm_grp_nm9")))),
				when(boundOr("itm_grp_flg10"))
					.select(DS0C_ITM_GRP, S0_M1.itm_grp_cd10.as("itm_grp_cd10"), S0_MM_ITM10.itm_grp_nm.as("itm_grp_nm10"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM_ITM10).on(S0_M1.itm_grp_cd10.eq(S0_MM_ITM10.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP10.value()).eq(S0_MM_ITM10.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M1.itm_grp_cd10.like(bind("itm_grp_cd10"))).cutoff$and(S0_MM_ITM10.itm_grp_nm.like(bind("itm_grp_nm10")))),
				when(boundOr("sppl_grp_flg1"))
					.select(DS0C_SPPL_GRP, S0_M10.bp_grp_cd1.as("sppl_grp_cd1"), S0_MM_SPPL1.bp_grp_nm.as("sppl_grp_nm1"))
					.view(DS0C_SPPL_GRP, v -> v.leftOuterJoin(S0_MM_SPPL1).on(S0_M10.bp_grp_cd1.eq(S0_MM_SPPL1.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP1.value()).eq(S0_MM_SPPL1.bp_grp_typ))))
					.predicate(DS0C_SPPL_GRP, p -> p.cutoff$and(S0_M10.bp_grp_cd1.like(bind("sppl_grp_cd1"))).cutoff$and(S0_MM_SPPL1.bp_grp_nm.like(bind("sppl_grp_nm1")))),
				when(boundOr("sppl_grp_flg2"))
					.select(DS0C_SPPL_GRP, S0_M10.bp_grp_cd2.as("sppl_grp_cd2"), S0_MM_SPPL2.bp_grp_nm.as("sppl_grp_nm2"))
					.view(DS0C_SPPL_GRP, v -> v.leftOuterJoin(S0_MM_SPPL2).on(S0_M10.bp_grp_cd2.eq(S0_MM_SPPL2.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP2.value()).eq(S0_MM_SPPL2.bp_grp_typ))))
					.predicate(DS0C_SPPL_GRP, p -> p.cutoff$and(S0_M10.bp_grp_cd2.like(bind("sppl_grp_cd2"))).cutoff$and(S0_MM_SPPL2.bp_grp_nm.like(bind("sppl_grp_nm2")))),
				when(boundOr("sppl_grp_flg3"))
					.select(DS0C_SPPL_GRP, S0_M10.bp_grp_cd3.as("sppl_grp_cd3"), S0_MM_SPPL3.bp_grp_nm.as("sppl_grp_nm3"))
					.view(DS0C_SPPL_GRP, v -> v.leftOuterJoin(S0_MM_SPPL3).on(S0_M10.bp_grp_cd3.eq(S0_MM_SPPL3.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP3.value()).eq(S0_MM_SPPL3.bp_grp_typ))))
					.predicate(DS0C_SPPL_GRP, p -> p.cutoff$and(S0_M10.bp_grp_cd3.like(bind("sppl_grp_cd3"))).cutoff$and(S0_MM_SPPL3.bp_grp_nm.like(bind("sppl_grp_nm3")))),
				when(boundOr("sppl_grp_flg4"))
					.select(DS0C_SPPL_GRP, S0_M10.bp_grp_cd4.as("sppl_grp_cd4"), S0_MM_SPPL4.bp_grp_nm.as("sppl_grp_nm4"))
					.view(DS0C_SPPL_GRP, v -> v.leftOuterJoin(S0_MM_SPPL4).on(S0_M10.bp_grp_cd4.eq(S0_MM_SPPL4.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP4.value()).eq(S0_MM_SPPL4.bp_grp_typ))))
					.predicate(DS0C_SPPL_GRP, p -> p.cutoff$and(S0_M10.bp_grp_cd4.like(bind("sppl_grp_cd4"))).cutoff$and(S0_MM_SPPL4.bp_grp_nm.like(bind("sppl_grp_nm4")))),
				when(boundOr("sppl_grp_flg5"))
					.select(DS0C_SPPL_GRP, S0_M10.bp_grp_cd5.as("sppl_grp_cd5"), S0_MM_SPPL5.bp_grp_nm.as("sppl_grp_nm5"))
					.view(DS0C_SPPL_GRP, v -> v.leftOuterJoin(S0_MM_SPPL5).on(S0_M10.bp_grp_cd5.eq(S0_MM_SPPL5.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP5.value()).eq(S0_MM_SPPL5.bp_grp_typ))))
					.predicate(DS0C_SPPL_GRP, p -> p.cutoff$and(S0_M10.bp_grp_cd5.like(bind("sppl_grp_cd5"))).cutoff$and(S0_MM_SPPL5.bp_grp_nm.like(bind("sppl_grp_nm5")))),
				when(boundOr("sppl_grp_flg6"))
					.select(DS0C_SPPL_GRP, S0_M10.bp_grp_cd6.as("sppl_grp_cd6"), S0_MM_SPPL6.bp_grp_nm.as("sppl_grp_nm6"))
					.view(DS0C_SPPL_GRP, v -> v.leftOuterJoin(S0_MM_SPPL6).on(S0_M10.bp_grp_cd6.eq(S0_MM_SPPL6.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP6.value()).eq(S0_MM_SPPL6.bp_grp_typ))))
					.predicate(DS0C_SPPL_GRP, p -> p.cutoff$and(S0_M10.bp_grp_cd6.like(bind("sppl_grp_cd6"))).cutoff$and(S0_MM_SPPL6.bp_grp_nm.like(bind("sppl_grp_nm6")))),
				when(boundOr("sppl_grp_flg7"))
					.select(DS0C_SPPL_GRP, S0_M10.bp_grp_cd7.as("sppl_grp_cd7"), S0_MM_SPPL7.bp_grp_nm.as("sppl_grp_nm7"))
					.view(DS0C_SPPL_GRP, v -> v.leftOuterJoin(S0_MM_SPPL7).on(S0_M10.bp_grp_cd7.eq(S0_MM_SPPL7.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP7.value()).eq(S0_MM_SPPL7.bp_grp_typ))))
					.predicate(DS0C_SPPL_GRP, p -> p.cutoff$and(S0_M10.bp_grp_cd7.like(bind("sppl_grp_cd7"))).cutoff$and(S0_MM_SPPL7.bp_grp_nm.like(bind("sppl_grp_nm7")))),
				when(boundOr("sppl_grp_flg8"))
					.select(DS0C_SPPL_GRP, S0_M10.bp_grp_cd8.as("sppl_grp_cd8"), S0_MM_SPPL8.bp_grp_nm.as("sppl_grp_nm8"))
					.view(DS0C_SPPL_GRP, v -> v.leftOuterJoin(S0_MM_SPPL8).on(S0_M10.bp_grp_cd8.eq(S0_MM_SPPL8.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP8.value()).eq(S0_MM_SPPL8.bp_grp_typ))))
					.predicate(DS0C_SPPL_GRP, p -> p.cutoff$and(S0_M10.bp_grp_cd8.like(bind("sppl_grp_cd8"))).cutoff$and(S0_MM_SPPL8.bp_grp_nm.like(bind("sppl_grp_nm8")))),
				when(boundOr("sppl_grp_flg9"))
					.select(DS0C_SPPL_GRP, S0_M10.bp_grp_cd9.as("sppl_grp_cd9"), S0_MM_SPPL9.bp_grp_nm.as("sppl_grp_nm9"))
					.view(DS0C_SPPL_GRP, v -> v.leftOuterJoin(S0_MM_SPPL9).on(S0_M10.bp_grp_cd9.eq(S0_MM_SPPL9.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP9.value()).eq(S0_MM_SPPL9.bp_grp_typ))))
					.predicate(DS0C_SPPL_GRP, p -> p.cutoff$and(S0_M10.bp_grp_cd9.like(bind("sppl_grp_cd9"))).cutoff$and(S0_MM_SPPL9.bp_grp_nm.like(bind("sppl_grp_nm9")))),
				when(boundOr("sppl_grp_flg10"))
					.select(DS0C_SPPL_GRP, S0_M10.bp_grp_cd10.as("sppl_grp_cd10"), S0_MM_SPPL10.bp_grp_nm.as("sppl_grp_nm10"))
					.view(DS0C_SPPL_GRP, v -> v.leftOuterJoin(S0_MM_SPPL10).on(S0_M10.bp_grp_cd10.eq(S0_MM_SPPL10.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP10.value()).eq(S0_MM_SPPL10.bp_grp_typ))))
					.predicate(DS0C_SPPL_GRP, p -> p.cutoff$and(S0_M10.bp_grp_cd10.like(bind("sppl_grp_cd10"))).cutoff$and(S0_MM_SPPL10.bp_grp_nm.like(bind("sppl_grp_nm10"))))
			)
			.setJoinInfo(
				joinInfo(
					j -> j
						.add(MST_PO_D_R.class, r -> toCondition(
							r.getStringNE("po_d_no")
						))
						.addSelect(m -> toArray(
							m.po_no
						))
						.addMap((r, m) -> {
							r.setStringNE("join_po_no_", m.po_no());
					}),
					j -> j
						.add(MST_PO_R.class, r -> toCondition(
							r.getStringNE("join_po_no_")
						))
						.addSelect(m -> toArray(
							m.aprv_sts_typ
						))
						.addMap((r, m) -> {
							r.setStringNE("po_aprv_sts_typ", m.aprv_sts_typ());
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
						.add(MAM_LOC_R.class, r -> toCondition(
							r.getStringNE("strg_loc_cd")
						))
						.addSelect(m -> toArray(
							m.loc_grp_cd,
							m.loc_nm,
							m.str_ln_tgt_flg
						))
						.addMap((r, m) -> {
							r.setStringNE("strg_loc_nm", m.loc_nm());
							r.setBooleanNE("strg_str_ln_tgt_flg", m.str_ln_tgt_flg());
							r.setStringNE("join_loc_grp_cd_", m.loc_grp_cd());
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
						.add(MAM_WG_R.class, r -> toCondition(
							r.getStringNE("mfg_loc_wg_cd")
						))
						.addSelect(m -> toArray(
							m.wg_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("mfg_loc_wg_nm", m.wg_nm());
					}),
					j -> j
						.add(MAM_SITE_R.class, r -> toCondition(
							r.getStringNE("mfg_loc_site_cd")
						))
						.addSelect(m -> toArray(
							m.site_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("mfg_loc_site_nm", m.site_nm());
					}),
					j -> j
						.add(MAM_BP_R.class, r -> toCondition(
							r.getStringNE("sppl_cd")
						))
						.addSelect(m -> toArray(
							m.bp_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("sppl_nm", m.bp_nm());
					}),
					j -> j
						.add(MAM_LOC_GRP_R.class, r -> toCondition(
							r.getStringNE("mfg_loc_grp_cd")
						))
						.addSelect(m -> toArray(
							m.loc_grp_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("mfg_loc_grp_nm", m.loc_grp_nm());
					}),
					j -> j
						.add(MAM_ITM_TYP_D_R.class, r -> toCondition(
							r.getStringNE("itm_typ"),
							r.getStringNE("itm_typ_d_cd")
						))
						.addSelect(m -> toArray(
							m.itm_typ_d_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("itm_typ_d_nm", m.itm_typ_d_nm());
					}),
					j -> j
						.add(MAM_USR_R.class, r -> toCondition(
							r.getStringNE("inst_usr_cd")
						))
						.addSelect(m -> toArray(
							m.usr_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("inst_usr_nm", m.usr_nm());
					}),
					j -> j
						.add(MAM_USR_R.class, r -> toCondition(
							r.getStringNE("aprv_usr_cd")
						))
						.addSelect(m -> toArray(
							m.usr_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("aprv_usr_nm", m.usr_nm());
					}),
					j -> j
						.add(MAM_STR_LN_R.class, r -> toCondition(
							r.getStringNE("mfg_loc_cd"),
							r.getStringNE("mfg_str_ln_cd")
						))
						.addSelect(m -> toArray(
							m.str_ln_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("mfg_str_ln_nm", m.str_ln_nm());
					}),
					j -> j
						.add(MAM_STR_LN_R.class, r -> toCondition(
							r.getStringNE("strg_loc_cd"),
							r.getStringNE("strg_str_ln_cd")
						))
						.addSelect(m -> toArray(
							m.str_ln_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("strg_str_ln_nm", m.str_ln_nm());
					}),
					j -> j
						.add(MAM_OPER_R.class, r -> toCondition(
							r.getStringNE("oper_cd")
						))
						.addSelect(m -> toArray(
							m.oper_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("oper_nm", m.oper_nm());
					}),
					j -> j
						.add(MAM_UNIT_R.class, r -> toCondition(
							r.getStringNE("oper_unit_cd")
						))
						.addSelect(m -> toArray(
							m.unit_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("oper_unit_nm", m.unit_nm());
					}),
					j -> j
						.add(MAM_LOC_R.class, r -> toCondition(
							r.getStringNE("oper_loc_cd")
						))
						.addSelect(m -> toArray(
							m.loc_nm,
							m.str_ln_tgt_flg
						))
						.addMap((r, m) -> {
							r.setStringNE("oper_loc_nm", m.loc_nm());
							r.setBooleanNE("oper_str_ln_tgt_flg", m.str_ln_tgt_flg());
					}),
					j -> j
						.add(MAM_STR_LN_R.class, r -> toCondition(
							r.getStringNE("oper_loc_cd"),
							r.getStringNE("oper_str_ln_cd")
						))
						.addSelect(m -> toArray(
							m.str_ln_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("oper_str_ln_nm", m.str_ln_nm());
					}),
					j -> j
						.add(MAM_USR_R.class, r -> toCondition(
							r.getStringNE("oper_usr_cd")
						))
						.addSelect(m -> toArray(
							m.usr_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("oper_usr_nm", m.usr_nm());
					})
				)
			);
	}
	
	/**
	 * -- MSBCL1040_MST_OPER_ORDER_Query_S01
	 */
	static MCQueryPlan MSBCL1040_MST_OPER_ORDER_S01() {
		MST_ITM_ORDER_R S0_T1 = MST_ITM_ORDER_R.create("T1");
		MSVT_WRK_SNO_R S0_T2 = MSVT_WRK_SNO_R.create("T2");
		MCTempView S0_T3 = createTempView("T3");
		MST_OPER_ORDER_R S0_T4 = MST_OPER_ORDER_R.create("T4");
		MCTempView S0_T5 = createTempView("T5");
		MST_PO_R S0_T6 = MST_PO_R.create("T6");
		MAM_ITM_R S0_M1 = MAM_ITM_R.create("M1");
		MAM_SUNDRY_ITM_R S0_M2 = MAM_SUNDRY_ITM_R.create("M2");
		MAVM_ITM_WG_R S0_M3 = MAVM_ITM_WG_R.create("M3");
		MAVM_RD_LOC_R S0_M4 = MAVM_RD_LOC_R.create("M4");
		MAM_LOC_R S0_M5 = MAM_LOC_R.create("M5");
		MAVM_ITM_DTL_MFG_R S0_M6 = MAVM_ITM_DTL_MFG_R.create("M6");
		MAM_WG_R S0_M8 = MAM_WG_R.create("M8");
		MAM_SITE_R S0_M9 = MAM_SITE_R.create("M9");
		MAM_BP_R S0_M10 = MAM_BP_R.create("M10");
		MAM_LOC_GRP_R S0_M11 = MAM_LOC_GRP_R.create("M11");
		MAM_LOC_GRP_R S0_M12 = MAM_LOC_GRP_R.create("M12");
		MAM_ITM_TYP_D_R S0_M13 = MAM_ITM_TYP_D_R.create("M13");
		MAM_OPER_R S0_M14 = MAM_OPER_R.create("M14");
		MAM_ITM_OPER_R S0_M15 = MAM_ITM_OPER_R.create("M15");
		MAM_LOC_R S0_M17 = MAM_LOC_R.create("M17");
		MAM_ITM_NOT_FIX_R S0_M18 = MAM_ITM_NOT_FIX_R.create("M18");
		MAM_STR_LN_R S0_M19 = MAM_STR_LN_R.create("M19");
		MAM_ITM_GRP_R S0_MM_ITM1 = MAM_ITM_GRP_R.create("MM_ITM1");
		MAM_ITM_GRP_R S0_MM_ITM2 = MAM_ITM_GRP_R.create("MM_ITM2");
		MAM_ITM_GRP_R S0_MM_ITM3 = MAM_ITM_GRP_R.create("MM_ITM3");
		MAM_ITM_GRP_R S0_MM_ITM4 = MAM_ITM_GRP_R.create("MM_ITM4");
		MAM_ITM_GRP_R S0_MM_ITM5 = MAM_ITM_GRP_R.create("MM_ITM5");
		MAM_ITM_GRP_R S0_MM_ITM6 = MAM_ITM_GRP_R.create("MM_ITM6");
		MAM_ITM_GRP_R S0_MM_ITM7 = MAM_ITM_GRP_R.create("MM_ITM7");
		MAM_ITM_GRP_R S0_MM_ITM8 = MAM_ITM_GRP_R.create("MM_ITM8");
		MAM_ITM_GRP_R S0_MM_ITM9 = MAM_ITM_GRP_R.create("MM_ITM9");
		MAM_ITM_GRP_R S0_MM_ITM10 = MAM_ITM_GRP_R.create("MM_ITM10");
		MAM_BP_GRP_R S0_MM_SPPL1 = MAM_BP_GRP_R.create("MM_SPPL1");
		MAM_BP_GRP_R S0_MM_SPPL2 = MAM_BP_GRP_R.create("MM_SPPL2");
		MAM_BP_GRP_R S0_MM_SPPL3 = MAM_BP_GRP_R.create("MM_SPPL3");
		MAM_BP_GRP_R S0_MM_SPPL4 = MAM_BP_GRP_R.create("MM_SPPL4");
		MAM_BP_GRP_R S0_MM_SPPL5 = MAM_BP_GRP_R.create("MM_SPPL5");
		MAM_BP_GRP_R S0_MM_SPPL6 = MAM_BP_GRP_R.create("MM_SPPL6");
		MAM_BP_GRP_R S0_MM_SPPL7 = MAM_BP_GRP_R.create("MM_SPPL7");
		MAM_BP_GRP_R S0_MM_SPPL8 = MAM_BP_GRP_R.create("MM_SPPL8");
		MAM_BP_GRP_R S0_MM_SPPL9 = MAM_BP_GRP_R.create("MM_SPPL9");
		MAM_BP_GRP_R S0_MM_SPPL10 = MAM_BP_GRP_R.create("MM_SPPL10");
		MST_ITM_MFG_INST_R S1_W = MST_ITM_MFG_INST_R.create("W");
		MST_PO_SCHD_R S2_A = MST_PO_SCHD_R.create("A");
		MST_PO_D_R S3_A = MST_PO_D_R.create("A");
		MST_ITM_ORDER_R S1_T1 = MST_ITM_ORDER_R.create("ST1");
		
		MCDynamicSQLID DS0C_ITM_GRP = createDynamicSQLID("DS0C_ITM_GRP");
		MCDynamicSQLID DS0C_SPPL_GRP = createDynamicSQLID("DS0C_SPPL_GRP");
		
		return createQueryPlan()
			.setQuery(
				sql("MSBCL1040_MST_OPER_ORDER_Query_S01")
					.mainQuery()
					.select(
						cases()
							.when(S0_T1.itm_ord_typ.eq(value(MSC_ITM_ORD_TYP.MFG.value())))
								.then(value(MSC_MFG_MTD_TYP.INTNL.value()))
							.otherwise(value(MSC_MFG_MTD_TYP.EXTNL.value())).as("mfg_mtd_typ"),
						value(MSC_MFG_STS_TYP.YET.value()).as("mfg_sts_typ"),
						S0_T1.master_dt.as("master_dt"),
						S0_T1.itm_cd,
						S0_T1.itm_sub1,
						S0_T1.itm_sub2,
						S0_T1.itm_sub3,
						nvl(
							S0_M2.itm_nm,
							S0_M1.itm_nm
						).as("itm_nm"),
						S0_M1.lot_mng_typ,
						S0_M1.lot_no_typ,
						S0_M1.lot_no_ptn_cd,
						S0_M1.sublot_mng_typ,
						S0_M1.sublot_no_typ,
						S0_M1.sublot_no_ptn_cd,
						S0_M1.sno1_mng_typ,
						S0_M1.sno2_mng_typ,
						S0_M1.sno3_mng_typ,
						S0_M1.sno4_mng_typ,
						S0_T1.mfg_loc_cd,
						S0_M4.loc_nm.as("mfg_loc_nm"),
						S0_M4.str_ln_tgt_flg.as("mfg_str_ln_tgt_flg"),
						S0_T1.bom_ptn,
						S0_M4.sppl_cd,
						S0_M6.yield_schd_qty.as("mst_yield_schd_qty"),
						S0_M6.mfg_inst_qty.as("mst_mfg_inst_qty"),
						S0_M6.fxd_rqmt_qty.as("mst_fxd_rqmt_qty"),
						S0_M6.lot_issue_typ,
						S0_M6.ln_stk_flg,
						S0_T1.strg_loc_cd,
						S0_T1.not_inst_qty.as("base_unit_inst_qty"),
						S0_T1.yield_schd_qty.as("base_unit_yield_qty"),
						bracket(
							subQuery()
							.select(sum(S1_W.base_unit_yield_qty))
							.from(S1_W)
							.where(
								S0_T1.itm_ord_no.eq(S1_W.itm_ord_no)
								.and(S1_W.can_flg.eq(value(false)))
							)
						).as("sum_base_unit_yield_qty"),
						S0_M1.unit_cd.as("base_unit_cd"),
						S0_M1.dec_place.as("base_unit_dec_place"),
						S0_M1.rnd_typ.as("base_unit_conv_rnd_typ"),
						cases()
							.when(S0_T1.itm_ord_typ.eq(value(MSC_ITM_ORD_TYP.MFG.value())))
								.then(value((MCDate)null))
							.otherwise(S0_T1.avl_schd_dt).as("rqst_dlv_rqst_dt"),
						nullValue().as("rqst_dlv_rqst_hm"),
						trunc(
							S0_T4.st_schd_tm,
							MCDateFmt.DD
						).as("st_schd_dt"),
						S0_T4.st_schd_tm.as("st_schd_hm"),
						trunc(
							S0_T4.end_schd_tm,
							MCDateFmt.DD
						).as("end_schd_dt"),
						S0_T4.end_schd_tm.as("end_schd_hm"),
						S0_T1.oper_ptn,
						nullValue().as("lot_no"),
						nullValue().as("sublot_no"),
						S0_T1.sno1,
						S0_T1.sno2,
						S0_T1.sno3,
						S0_T1.sno4,
						nullValue().as("inst_dt"),
						nullValue().as("inst_usr_cd"),
						nullValue().as("inst_usr_nm"),
						nullValue().as("inst_dpt_cd"),
						nullValue().as("inst_dpt_nm"),
						value(MAC_STR.NULL_VAL.value()).as("mfg_str_ln_cd"),
						nullValue().as("mfg_str_ln_nm"),
						value(MAC_STR.NULL_VAL.value()).as("strg_str_ln_cd"),
						nullValue().as("strg_str_ln_nm"),
						value(false).as("po_locked_flg"),
						value(false).as("inst_abort_flg"),
						nullValue().as("inst_rpt_rmrks"),
						nullValue().as("intr_rmrks"),
						nullValue().as("oper_inst_rpt_rmrks"),
						nullValue().as("oper_intr_rmrks"),
						cases()
							.when(
								S0_T1.itm_ord_typ.eq(value(MSC_ITM_ORD_TYP.OUTSRC.value()))
								.and(S0_T1.ord_gnrt_typ.eq(value(MSC_ORD_GNRT_TYP.UPLND.value())))
							)
								.then(
									subQuery()
									.select(S1_T1.inst_po_cnt_rmrks)
									.from(S1_T1)
									.where(
										S1_T1.io_schd_pr_no.eq(S0_T1.io_schd_pr_no)
										.and(S1_T1.ord_gnrt_typ.eq(value(MSC_ORD_GNRT_TYP.MNL.value())))
									)
								)
							.otherwise(S0_T1.inst_po_cnt_rmrks).as("inst_po_cnt_rmrks"),
						nullValue().as("disp_pd"),
						S0_M6.itm_lower_yield,
						S0_M6.itm_std_yield,
						S0_M6.itm_upper_yield,
						nullValue().as("mfg_inst_no"),
						nullValue().as("mfg_inst_rev"),
						nullValue().as("inst_prnt_tm"),
						value(false).as("inst_prnt_flg"),
						value(false).as("can_flg"),
						nullValue().as("itm_mfg_inst_no"),
						S0_T1.itm_ord_no,
						value(false).as("schd_chg_flg"),
						S0_T1.inst_qty.as("base_unit_ord_qty"),
						S0_T1.not_inst_qty.as("base_unit_not_inst_qty"),
						value(false).as("ord_abort_flg"),
						S0_T1.wg_cd.as("mfg_loc_wg_cd"),
						S0_M4.site_cd.as("mfg_loc_site_cd"),
						S0_M4.loc_grp_cd.as("mfg_loc_grp_cd"),
						nullValue().as("po_d_no"),
						nullValue().as("po_aprv_sts_typ"),
						value(false).as("po_auto_reg_flg"),
						nullValue().as("itm_mfg_inst_sub_char1"),
						nullValue().as("itm_mfg_inst_sub_char2"),
						nullValue().as("itm_mfg_inst_sub_char3"),
						nullValue().as("mfg_inst_sub_char1"),
						nullValue().as("mfg_inst_sub_char2"),
						nullValue().as("mfg_inst_sub_char3"),
						S0_M1.th_image.as("tm_th_image"),
						nullValue().as("mfg_aprv_sts_typ"),
						nullValue().as("aprv_dt"),
						nullValue().as("aprv_tm"),
						nullValue().as("aprv_dpt_cd"),
						nullValue().as("aprv_dpt_nm"),
						nullValue().as("aprv_usr_cd"),
						nullValue().as("aprv_usr_nm"),
						nullValue().as("aprv_rsn"),
						value(false).as("aprv_tgt_flg"),
						S0_T4.oper_cd,
						S0_T4.oper_seq,
						S0_T4.not_oper_schd_qty.as("oper_base_unit_qty"),
						S0_M15.oper_std_qty,
						S0_M15.oper_conv_qty,
						S0_M15.dec_place.as("oper_unit_dec_place"),
						S0_M15.oper_unit_cd,
						S0_M15.unit_conv_rnd_typ.as("oper_unit_conv_rnd_typ"),
						S0_T4.loc_cd.as("oper_loc_cd"),
						value(MAC_STR.NULL_VAL.value()).as("oper_str_ln_cd"),
						nullValue().as("oper_str_ln_nm"),
						S0_M15.oper_lower_yield,
						S0_M15.oper_std_yield,
						S0_M15.oper_upper_yield,
						nullValue().as("usr_cd"),
						nullValue().as("usr_nm"),
						S0_T4.disp_seq,
						S0_T4.oper_rsrc,
						nullValue().as("oper_inst_sub_char1"),
						nullValue().as("oper_inst_sub_char2"),
						nullValue().as("oper_inst_sub_char3"),
						S0_M6.bkf_flg.as("bkf_flg"),
						cases()
							.when(S0_T1.itm_ord_typ.eq(value(MSC_ITM_ORD_TYP.MFG.value())))
								.then(value(true))
							.otherwise(value(false)).as("wk_cost_calc_flg"),
						S0_M15.oper_inst_grp,
						S0_T4.oper_ord_no,
						nullValue().as("mfg_inst_no"),
						nullValue().as("oper_inst_no"),
						cases()
							.when(S0_T4.oper_ptn.eq(value(MAC_STR.NULL_VAL.value())))
								.then(value(true))
							.otherwise(S0_M15.yield_oper_flg).as("yield_oper_flg"),
						cases()
							.when(S0_T4.oper_ptn.eq(value(MAC_STR.NULL_VAL.value())))
								.then(value(1))
							.otherwise(S0_M15.yield_oper_ratio).as("yield_oper_ratio"),
						S0_M1.itm_typ,
						S0_M1.itm_typ_d_cd,
						S0_T1.ins_usr_id.as("ins_usr_id"),
						S0_T1.ins_usr_nm.as("ins_usr_nm"),
						S0_T1.ins_func_id.as("ins_func_id"),
						S0_T1.ins_ts.as("ins_ts"),
						S0_T1.upd_cntr.as("itm_ord_upd_cntr"),
						nullValue().as("itm_mfg_inst_upd_cntr"),
						nullValue().as("mfg_inst_upd_cntr"),
						S0_T1.upd_usr_id.as("upd_usr_id"),
						S0_T1.upd_usr_nm.as("upd_usr_nm"),
						S0_T1.upd_func_id.as("upd_func_id"),
						S0_T1.upd_ts.as("upd_ts"),
						S0_T1.upd_srv_req_no.as("upd_srv_req_no"),
						S0_T1.for_scheduler_frozen_flg,
						S0_T4.scheduler_frozen_flg.as("scheduler_frozen_oper_flg"),
						S0_T4.st_schd_tm,
						S0_T1.itm_ord_typ,
						addDynamicSelect(DS0C_ITM_GRP),
						addDynamicSelect(DS0C_SPPL_GRP)
					)
					.from(
						S0_T1
						.leftOuterJoin(
							subQuery()
							.select(S2_A.prAll())
							.from(S2_A)
							.where(
								S2_A.can_flg.eq(value(false))
								.and(S2_A.po_flg.eq(value(false)))
							).view(S0_T3)
						).on(
							bracket(
								S0_T1.itm_ord_no.eq(S0_T3.pr("outsrc_itm_ord_no"))
							)
						)
						.innerJoin(S0_T4).on(
							bracket(
								S0_T1.itm_ord_no.eq(S0_T4.itm_ord_no)
							)
						)
						.leftOuterJoin(
							subQuery()
							.select(S3_A.prAll())
							.from(S3_A)
							.where(
								S3_A.can_flg.eq(value(false))
							).view(S0_T5)
						).on(
							bracket(
								S0_T1.itm_ord_no.eq(S0_T5.pr("outsrc_itm_ord_no"))
							)
						)
						.leftOuterJoin(S0_T6).on(
							bracket(
								S0_T5.pr("po_no").eq(S0_T6.po_no)
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
						.leftOuterJoin(S0_M2).on(
							bracket(
								S0_T1.itm_cd.eq(S0_M2.itm_cd)
								.and(S0_T1.itm_sub1.eq(S0_M2.itm_sub1))
								.and(S0_T1.itm_sub2.eq(S0_M2.itm_sub2))
								.and(S0_T1.itm_sub3.eq(S0_M2.itm_sub3))
								.and(S0_T1.sno1.eq(S0_M2.sno1))
								.and(S0_T1.sno2.eq(S0_M2.sno2))
								.and(S0_T1.sno3.eq(S0_M2.sno3))
								.and(S0_T1.sno4.eq(S0_M2.sno4))
							)
						)
						.innerJoin(S0_M4).on(
							bracket(
								S0_T1.mfg_loc_cd.eq(S0_M4.loc_cd)
							)
						)
						.leftOuterJoin(S0_M6).on(
							bracket(
								S0_T1.itm_cd.eq(S0_M6.itm_cd)
								.and(S0_T1.itm_sub1.eq(S0_M6.itm_sub1))
								.and(S0_T1.itm_sub2.eq(S0_M6.itm_sub2))
								.and(S0_T1.itm_sub3.eq(S0_M6.itm_sub3))
								.and(S0_T1.mfg_loc_cd.eq(S0_M6.mfg_loc_cd))
								.and(S0_M6.sppl_cd.eq(value(MAC_STR.NULL_VAL.value())))
								.and(S0_M6.maker_cd.eq(value(MAC_STR.NULL_VAL.value())))
								.and(S0_M6.rqst_loc_cd.eq(value(MAC_STR.NULL_VAL.value())))
								.and(S0_T1.wg_cd.eq(S0_M6.wg_cd))
								.and(S0_T1.bom_ptn.eq(S0_M6.bom_ptn))
								.and(S0_T1.master_dt.between(S0_M6.st_dt, S0_M6.end_dt))
							)
						)
						.leftOuterJoin(S0_M15).on(
							bracket(
								S0_T1.itm_cd.eq(S0_M15.itm_cd)
								.and(S0_T1.itm_sub1.eq(S0_M15.itm_sub1))
								.and(S0_T1.itm_sub2.eq(S0_M15.itm_sub2))
								.and(S0_T1.itm_sub3.eq(S0_M15.itm_sub3))
								.and(S0_T1.mst_mfg_loc_cd.eq(S0_M15.loc_cd))
								.and(S0_T4.oper_ptn.eq(S0_M15.oper_ptn))
								.and(S0_T4.oper_cd.eq(S0_M15.oper_cd))
								.and(S0_T4.oper_seq.eq(S0_M15.oper_seq))
								.and(S0_T1.mfg_st_schd_dt.between(S0_M15.st_dt, S0_M15.end_dt))
							)
						)
						.leftOuterJoin(S0_M18).on(
							bracket(
								S0_T1.itm_cd.eq(S0_M18.itm_cd)
								.and(S0_T1.itm_sub1.eq(S0_M18.itm_sub1))
								.and(S0_T1.itm_sub2.eq(S0_M18.itm_sub2))
								.and(S0_T1.itm_sub3.eq(S0_M18.itm_sub3))
								.and(S0_T1.sno1.eq(S0_M18.sno1))
								.and(S0_T1.sno2.eq(S0_M18.sno2))
								.and(S0_T1.sno3.eq(S0_M18.sno3))
								.and(S0_T1.sno4.eq(S0_M18.sno4))
								.and(S0_T1.wg_cd.eq(S0_M18.wg_cd))
							)
						)
						.leftOuterJoin(S0_M19).on(
							bracket(
								S0_T3.pr("in_to_loc_cd").eq(S0_M19.loc_cd)
								.and(S0_T3.pr("str_ln_cd").eq(S0_M19.str_ln_cd))
							)
						)
						.addDynamicView()
						.addDynamicView(DS0C_ITM_GRP)
						.addDynamicView(DS0C_SPPL_GRP)
					)
					.where(
						value(0).eq(value(0))
						.cutoff$and(value(true).neq(bind("tmp_frcd_invld_flg_str")))
						.and(
							S0_T1.itm_ord_sts_typ.in(
								value(MSC_ITM_ORD_STS_TYP.FIX.value()),
								value(MSC_ITM_ORD_STS_TYP.PART_INST.value()),
								value(MSC_ITM_ORD_STS_TYP.INST.value())
							)
							.cutoff$or(
								bracket(
									value(false).eq(bind("tmp_not_srch_opn_flg_str"))
									.and(S0_T4.oper_ord_sts_typ.eq(value(MSC_OPER_ORD_STS_TYP.OPN.value())))
									.and(
										decode(
											S0_M18.itm_cd,
											nullValue(),
											S0_T1.not_fix_flg,
											value(true)
										).eq(value(false))
									)
								)
							)
							.cutoff$or(
								bracket(
									value(false).eq(bind("tmp_not_srch_sav_flg_str"))
									.and(S0_T4.oper_ord_sts_typ.eq(value(MSC_OPER_ORD_STS_TYP.SAV.value())))
									.and(
										decode(
											S0_M18.itm_cd,
											nullValue(),
											S0_T1.not_fix_flg,
											value(true)
										).eq(value(false))
									)
								)
							)
						)
						.and(S0_T1.not_inst_qty.gt(value(0)))
						.and(
							value(true).eq(cases()
									.when(S0_T1.itm_ord_typ.eq(value(MSC_ITM_ORD_TYP.MFG.value())))
										.then(value(true))
									.when(S0_T3.pr("po_schd_no").isNotNull())
										.then(value(true))
									.when(S0_T5.pr("po_d_no").isNotNull())
										.then(value(true))
									.otherwise(value(false))
							)
						)
						.cutoff$and(
							bracket(
								cases()
									.when(S0_T1.itm_ord_typ.eq(value(MSC_ITM_ORD_TYP.MFG.value())))
										.then(value(MSC_MFG_MTD_TYP.INTNL.value()))
									.otherwise(value(MSC_MFG_MTD_TYP.EXTNL.value()))
							).like(bind("mfg_mtd_typ"))
						)
						.cutoff$and(S0_T4.st_schd_tm.gte(bind("st_schd_hm_fr")))
						.cutoff$and(S0_T4.st_schd_tm.lte(bind("st_schd_hm_to")))
						.cutoff$and(S0_T4.end_schd_tm.gte(bind("end_schd_hm_fr")))
						.cutoff$and(S0_T4.end_schd_tm.lte(bind("end_schd_hm_to")))
						.cutoff$and(
							S0_T1.avl_schd_dt.gte(bind("rqst_dlv_rqst_dt_fr"))
							.and(S0_T1.itm_ord_typ.eq(value(MSC_ITM_ORD_TYP.OUTSRC.value())))
						)
						.cutoff$and(
							S0_T1.avl_schd_dt.lte(bind("rqst_dlv_rqst_dt_to"))
							.and(S0_T1.itm_ord_typ.eq(value(MSC_ITM_ORD_TYP.OUTSRC.value())))
						)
						.cutoff$and(S0_M4.site_cd.like(bind("mfg_loc_site_cd")))
						.addDynamicPredicate()
						.cutoff$and(S0_T1.wg_cd.like(bind("mfg_loc_wg_cd")))
						.cutoff$and(S0_M4.loc_grp_cd.like(bind("mfg_loc_grp_cd")))
						.cutoff$and(S0_T1.mfg_loc_cd.like(bind("mfg_loc_cd")))
						.cutoff$and(S0_M4.loc_nm.like(bind("mfg_loc_nm")))
						.cutoff$and(S0_T1.strg_loc_cd.like(bind("strg_loc_cd")))
						.cutoff$and(S0_T4.loc_cd.like(bind("oper_loc_cd")))
						.cutoff$and(S0_T4.oper_cd.like(bind("oper_cd")))
						.cutoff$and(S0_M4.sppl_cd.like(bind("sppl_cd")))
						.cutoff$and(S0_M1.itm_typ.like(bind("itm_typ")))
						.cutoff$and(S0_M1.itm_typ_d_cd.like(bind("itm_typ_d_cd")))
						.cutoff$and(S0_T1.itm_cd.like(bind("itm_cd")))
						.cutoff$and(S0_T1.itm_sub1.like(bind("itm_sub1")))
						.cutoff$and(S0_T1.itm_sub2.like(bind("itm_sub2")))
						.cutoff$and(S0_T1.itm_sub3.like(bind("itm_sub3")))
						.cutoff$and(
							nvl(
								S0_M2.itm_nm,
								S0_M1.itm_nm
							).like(bind("itm_nm"))
						)
						.cutoff$and(S0_T1.sno1.like(bind("sno1")))
						.cutoff$and(S0_T1.sno2.like(bind("sno2")))
						.cutoff$and(S0_T1.sno3.like(bind("sno3")))
						.cutoff$and(S0_T1.sno4.like(bind("sno4")))
						.cutoff$and(S0_T1.itm_ord_no.like(bind("itm_ord_no")))
						.cutoff$and(S0_T4.oper_ord_no.like(bind("oper_ord_no")))
						.cutoff$and(
							S0_T5.pr("po_d_no").like(bind("po_d_no"))
							.and(S0_T6.can_flg.eq(value(false)))
						)
						.cutoff$and(S0_T1.inst_po_cnt_rmrks.like(bind("inst_po_cnt_rmrks")))
						.cutoff$and(S0_T4.oper_rsrc.like(bind("oper_rsrc")))
						.addDynamicPredicate(DS0C_ITM_GRP)
						.addDynamicPredicate(DS0C_SPPL_GRP)
					)
					.orderBy(
						S0_T4.st_schd_tm.asc(),
						S0_T1.itm_ord_typ.asc(),
						S0_T1.itm_ord_no.asc(),
						S0_T4.disp_seq.asc()
					)
			)
			.setDynamicSQLInfo(
				when(boundOr("wrk_no", "wrk_nm"))
					.view(v -> v.leftOuterJoin(S0_T2).on(bracket(S0_T1.sno1.eq(S0_T2.sno1))))
					.predicate(p -> p.cutoff$and(S0_T2.wrk_no.like(bind("wrk_no"))).cutoff$and(S0_T2.wrk_nm.like(bind("wrk_nm")))),
				when(boundOr("mfg_inst_unit_typ"))
					.view(v -> v.leftOuterJoin(S0_M3).on(bracket(S0_T1.itm_cd.eq(S0_M3.itm_cd).and(S0_T1.itm_sub1.eq(S0_M3.itm_sub1)).and(S0_T1.itm_sub2.eq(S0_M3.itm_sub2)).and(S0_T1.itm_sub3.eq(S0_M3.itm_sub3)).and(S0_T1.wg_cd.eq(S0_M3.wg_cd)))))
					.predicate(p -> p.cutoff$and(S0_M3.mfg_inst_unit_typ.like(bind("mfg_inst_unit_typ")))),
				when(boundOr("strg_loc_grp_nm", "strg_loc_grp_cd", "strg_loc_nm"))
					.view(v -> v.leftOuterJoin(S0_M5).on(bracket(S0_T1.strg_loc_cd.eq(S0_M5.loc_cd))))
					.predicate(p -> p.cutoff$and(S0_M5.loc_grp_cd.like(bind("strg_loc_grp_cd"))).cutoff$and(S0_M5.loc_nm.like(bind("strg_loc_nm")))),
				when(boundOr("mfg_loc_wg_nm"))
					.view(v -> v.leftOuterJoin(S0_M8).on(bracket(S0_T1.wg_cd.eq(S0_M8.wg_cd))))
					.predicate(p -> p.cutoff$and(S0_M8.wg_nm.like(bind("mfg_loc_wg_nm")))),
				when(boundOr("mfg_loc_site_nm"))
					.view(v -> v.leftOuterJoin(S0_M9).on(bracket(S0_M4.site_cd.eq(S0_M9.site_cd))))
					.predicate(p -> p.cutoff$and(S0_M9.site_nm.like(bind("mfg_loc_site_nm")))),
				when(boundOr("sppl_grp_flg1", "sppl_grp_flg2", "sppl_grp_flg3", "sppl_grp_flg4", "sppl_grp_flg5", "sppl_grp_flg6", "sppl_grp_flg7", "sppl_grp_flg8", "sppl_grp_flg9", "sppl_grp_flg10", "sppl_nm"))
					.view(v -> v.leftOuterJoin(S0_M10).on(bracket(S0_M4.sppl_cd.eq(S0_M10.bp_cd))))
					.predicate(p -> p.cutoff$and(S0_M10.bp_nm.like(bind("sppl_nm")))),
				when(boundOr("mfg_loc_grp_nm"))
					.view(v -> v.leftOuterJoin(S0_M11).on(bracket(S0_M4.loc_grp_cd.eq(S0_M11.loc_grp_cd))))
					.predicate(p -> p.cutoff$and(S0_M11.loc_grp_nm.like(bind("mfg_loc_grp_nm")))),
				when(boundOr("strg_loc_grp_nm"))
					.view(v -> v.leftOuterJoin(S0_M12).on(bracket(S0_M5.loc_grp_cd.eq(S0_M12.loc_grp_cd))))
					.predicate(p -> p.cutoff$and(S0_M12.loc_grp_nm.like(bind("strg_loc_grp_nm")))),
				when(boundOr("itm_typ_d_nm"))
					.view(v -> v.leftOuterJoin(S0_M13).on(bracket(S0_M1.itm_typ.eq(S0_M13.itm_typ).and(S0_M1.itm_typ_d_cd.eq(S0_M13.itm_typ_d_cd)))))
					.predicate(p -> p.cutoff$and(S0_M13.itm_typ_d_nm.like(bind("itm_typ_d_nm")))),
				when(boundOr("oper_nm"))
					.view(v -> v.leftOuterJoin(S0_M14).on(bracket(S0_T4.oper_cd.eq(S0_M14.oper_cd))))
					.predicate(p -> p.cutoff$and(S0_M14.oper_nm.like(bind("oper_nm")))),
				when(boundOr("oper_loc_nm"))
					.view(v -> v.leftOuterJoin(S0_M17).on(bracket(S0_T4.loc_cd.eq(S0_M17.loc_cd))))
					.predicate(p -> p.cutoff$and(S0_M17.loc_nm.like(bind("oper_loc_nm")))),
				when(boundOr("itm_grp_flg1"))
					.select(DS0C_ITM_GRP, S0_M1.itm_grp_cd1.as("itm_grp_cd1"), S0_MM_ITM1.itm_grp_nm.as("itm_grp_nm1"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM_ITM1).on(S0_M1.itm_grp_cd1.eq(S0_MM_ITM1.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP1.value()).eq(S0_MM_ITM1.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M1.itm_grp_cd1.like(bind("itm_grp_cd1"))).cutoff$and(S0_MM_ITM1.itm_grp_nm.like(bind("itm_grp_nm1")))),
				when(boundOr("itm_grp_flg2"))
					.select(DS0C_ITM_GRP, S0_M1.itm_grp_cd2.as("itm_grp_cd2"), S0_MM_ITM2.itm_grp_nm.as("itm_grp_nm2"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM_ITM2).on(S0_M1.itm_grp_cd2.eq(S0_MM_ITM2.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP2.value()).eq(S0_MM_ITM2.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M1.itm_grp_cd2.like(bind("itm_grp_cd2"))).cutoff$and(S0_MM_ITM2.itm_grp_nm.like(bind("itm_grp_nm2")))),
				when(boundOr("itm_grp_flg3"))
					.select(DS0C_ITM_GRP, S0_M1.itm_grp_cd3.as("itm_grp_cd3"), S0_MM_ITM3.itm_grp_nm.as("itm_grp_nm3"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM_ITM3).on(S0_M1.itm_grp_cd3.eq(S0_MM_ITM3.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP3.value()).eq(S0_MM_ITM3.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M1.itm_grp_cd3.like(bind("itm_grp_cd3"))).cutoff$and(S0_MM_ITM3.itm_grp_nm.like(bind("itm_grp_nm3")))),
				when(boundOr("itm_grp_flg4"))
					.select(DS0C_ITM_GRP, S0_M1.itm_grp_cd4.as("itm_grp_cd4"), S0_MM_ITM4.itm_grp_nm.as("itm_grp_nm4"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM_ITM4).on(S0_M1.itm_grp_cd4.eq(S0_MM_ITM4.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP4.value()).eq(S0_MM_ITM4.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M1.itm_grp_cd4.like(bind("itm_grp_cd4"))).cutoff$and(S0_MM_ITM4.itm_grp_nm.like(bind("itm_grp_nm4")))),
				when(boundOr("itm_grp_flg5"))
					.select(DS0C_ITM_GRP, S0_M1.itm_grp_cd5.as("itm_grp_cd5"), S0_MM_ITM5.itm_grp_nm.as("itm_grp_nm5"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM_ITM5).on(S0_M1.itm_grp_cd5.eq(S0_MM_ITM5.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP5.value()).eq(S0_MM_ITM5.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M1.itm_grp_cd5.like(bind("itm_grp_cd5"))).cutoff$and(S0_MM_ITM5.itm_grp_nm.like(bind("itm_grp_nm5")))),
				when(boundOr("itm_grp_flg6"))
					.select(DS0C_ITM_GRP, S0_M1.itm_grp_cd6.as("itm_grp_cd6"), S0_MM_ITM6.itm_grp_nm.as("itm_grp_nm6"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM_ITM6).on(S0_M1.itm_grp_cd6.eq(S0_MM_ITM6.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP6.value()).eq(S0_MM_ITM6.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M1.itm_grp_cd6.like(bind("itm_grp_cd6"))).cutoff$and(S0_MM_ITM6.itm_grp_nm.like(bind("itm_grp_nm6")))),
				when(boundOr("itm_grp_flg7"))
					.select(DS0C_ITM_GRP, S0_M1.itm_grp_cd7.as("itm_grp_cd7"), S0_MM_ITM7.itm_grp_nm.as("itm_grp_nm7"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM_ITM7).on(S0_M1.itm_grp_cd7.eq(S0_MM_ITM7.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP7.value()).eq(S0_MM_ITM7.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M1.itm_grp_cd7.like(bind("itm_grp_cd7"))).cutoff$and(S0_MM_ITM7.itm_grp_nm.like(bind("itm_grp_nm7")))),
				when(boundOr("itm_grp_flg8"))
					.select(DS0C_ITM_GRP, S0_M1.itm_grp_cd8.as("itm_grp_cd8"), S0_MM_ITM8.itm_grp_nm.as("itm_grp_nm8"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM_ITM8).on(S0_M1.itm_grp_cd8.eq(S0_MM_ITM8.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP8.value()).eq(S0_MM_ITM8.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M1.itm_grp_cd8.like(bind("itm_grp_cd8"))).cutoff$and(S0_MM_ITM8.itm_grp_nm.like(bind("itm_grp_nm8")))),
				when(boundOr("itm_grp_flg9"))
					.select(DS0C_ITM_GRP, S0_M1.itm_grp_cd9.as("itm_grp_cd9"), S0_MM_ITM9.itm_grp_nm.as("itm_grp_nm9"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM_ITM9).on(S0_M1.itm_grp_cd9.eq(S0_MM_ITM9.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP9.value()).eq(S0_MM_ITM9.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M1.itm_grp_cd9.like(bind("itm_grp_cd9"))).cutoff$and(S0_MM_ITM9.itm_grp_nm.like(bind("itm_grp_nm9")))),
				when(boundOr("itm_grp_flg10"))
					.select(DS0C_ITM_GRP, S0_M1.itm_grp_cd10.as("itm_grp_cd10"), S0_MM_ITM10.itm_grp_nm.as("itm_grp_nm10"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM_ITM10).on(S0_M1.itm_grp_cd10.eq(S0_MM_ITM10.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP10.value()).eq(S0_MM_ITM10.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M1.itm_grp_cd10.like(bind("itm_grp_cd10"))).cutoff$and(S0_MM_ITM10.itm_grp_nm.like(bind("itm_grp_nm10")))),
				when(boundOr("sppl_grp_flg1"))
					.select(DS0C_SPPL_GRP, S0_M10.bp_grp_cd1.as("sppl_grp_cd1"), S0_MM_SPPL1.bp_grp_nm.as("sppl_grp_nm1"))
					.view(DS0C_SPPL_GRP, v -> v.leftOuterJoin(S0_MM_SPPL1).on(S0_M10.bp_grp_cd1.eq(S0_MM_SPPL1.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP1.value()).eq(S0_MM_SPPL1.bp_grp_typ))))
					.predicate(DS0C_SPPL_GRP, p -> p.cutoff$and(S0_M10.bp_grp_cd1.like(bind("sppl_grp_cd1"))).cutoff$and(S0_MM_SPPL1.bp_grp_nm.like(bind("sppl_grp_nm1")))),
				when(boundOr("sppl_grp_flg2"))
					.select(DS0C_SPPL_GRP, S0_M10.bp_grp_cd2.as("sppl_grp_cd2"), S0_MM_SPPL2.bp_grp_nm.as("sppl_grp_nm2"))
					.view(DS0C_SPPL_GRP, v -> v.leftOuterJoin(S0_MM_SPPL2).on(S0_M10.bp_grp_cd2.eq(S0_MM_SPPL2.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP2.value()).eq(S0_MM_SPPL2.bp_grp_typ))))
					.predicate(DS0C_SPPL_GRP, p -> p.cutoff$and(S0_M10.bp_grp_cd2.like(bind("sppl_grp_cd2"))).cutoff$and(S0_MM_SPPL2.bp_grp_nm.like(bind("sppl_grp_nm2")))),
				when(boundOr("sppl_grp_flg3"))
					.select(DS0C_SPPL_GRP, S0_M10.bp_grp_cd3.as("sppl_grp_cd3"), S0_MM_SPPL3.bp_grp_nm.as("sppl_grp_nm3"))
					.view(DS0C_SPPL_GRP, v -> v.leftOuterJoin(S0_MM_SPPL3).on(S0_M10.bp_grp_cd3.eq(S0_MM_SPPL3.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP3.value()).eq(S0_MM_SPPL3.bp_grp_typ))))
					.predicate(DS0C_SPPL_GRP, p -> p.cutoff$and(S0_M10.bp_grp_cd3.like(bind("sppl_grp_cd3"))).cutoff$and(S0_MM_SPPL3.bp_grp_nm.like(bind("sppl_grp_nm3")))),
				when(boundOr("sppl_grp_flg4"))
					.select(DS0C_SPPL_GRP, S0_M10.bp_grp_cd4.as("sppl_grp_cd4"), S0_MM_SPPL4.bp_grp_nm.as("sppl_grp_nm4"))
					.view(DS0C_SPPL_GRP, v -> v.leftOuterJoin(S0_MM_SPPL4).on(S0_M10.bp_grp_cd4.eq(S0_MM_SPPL4.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP4.value()).eq(S0_MM_SPPL4.bp_grp_typ))))
					.predicate(DS0C_SPPL_GRP, p -> p.cutoff$and(S0_M10.bp_grp_cd4.like(bind("sppl_grp_cd4"))).cutoff$and(S0_MM_SPPL4.bp_grp_nm.like(bind("sppl_grp_nm4")))),
				when(boundOr("sppl_grp_flg5"))
					.select(DS0C_SPPL_GRP, S0_M10.bp_grp_cd5.as("sppl_grp_cd5"), S0_MM_SPPL5.bp_grp_nm.as("sppl_grp_nm5"))
					.view(DS0C_SPPL_GRP, v -> v.leftOuterJoin(S0_MM_SPPL5).on(S0_M10.bp_grp_cd5.eq(S0_MM_SPPL5.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP5.value()).eq(S0_MM_SPPL5.bp_grp_typ))))
					.predicate(DS0C_SPPL_GRP, p -> p.cutoff$and(S0_M10.bp_grp_cd5.like(bind("sppl_grp_cd5"))).cutoff$and(S0_MM_SPPL5.bp_grp_nm.like(bind("sppl_grp_nm5")))),
				when(boundOr("sppl_grp_flg6"))
					.select(DS0C_SPPL_GRP, S0_M10.bp_grp_cd6.as("sppl_grp_cd6"), S0_MM_SPPL6.bp_grp_nm.as("sppl_grp_nm6"))
					.view(DS0C_SPPL_GRP, v -> v.leftOuterJoin(S0_MM_SPPL6).on(S0_M10.bp_grp_cd6.eq(S0_MM_SPPL6.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP6.value()).eq(S0_MM_SPPL6.bp_grp_typ))))
					.predicate(DS0C_SPPL_GRP, p -> p.cutoff$and(S0_M10.bp_grp_cd6.like(bind("sppl_grp_cd6"))).cutoff$and(S0_MM_SPPL6.bp_grp_nm.like(bind("sppl_grp_nm6")))),
				when(boundOr("sppl_grp_flg7"))
					.select(DS0C_SPPL_GRP, S0_M10.bp_grp_cd7.as("sppl_grp_cd7"), S0_MM_SPPL7.bp_grp_nm.as("sppl_grp_nm7"))
					.view(DS0C_SPPL_GRP, v -> v.leftOuterJoin(S0_MM_SPPL7).on(S0_M10.bp_grp_cd7.eq(S0_MM_SPPL7.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP7.value()).eq(S0_MM_SPPL7.bp_grp_typ))))
					.predicate(DS0C_SPPL_GRP, p -> p.cutoff$and(S0_M10.bp_grp_cd7.like(bind("sppl_grp_cd7"))).cutoff$and(S0_MM_SPPL7.bp_grp_nm.like(bind("sppl_grp_nm7")))),
				when(boundOr("sppl_grp_flg8"))
					.select(DS0C_SPPL_GRP, S0_M10.bp_grp_cd8.as("sppl_grp_cd8"), S0_MM_SPPL8.bp_grp_nm.as("sppl_grp_nm8"))
					.view(DS0C_SPPL_GRP, v -> v.leftOuterJoin(S0_MM_SPPL8).on(S0_M10.bp_grp_cd8.eq(S0_MM_SPPL8.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP8.value()).eq(S0_MM_SPPL8.bp_grp_typ))))
					.predicate(DS0C_SPPL_GRP, p -> p.cutoff$and(S0_M10.bp_grp_cd8.like(bind("sppl_grp_cd8"))).cutoff$and(S0_MM_SPPL8.bp_grp_nm.like(bind("sppl_grp_nm8")))),
				when(boundOr("sppl_grp_flg9"))
					.select(DS0C_SPPL_GRP, S0_M10.bp_grp_cd9.as("sppl_grp_cd9"), S0_MM_SPPL9.bp_grp_nm.as("sppl_grp_nm9"))
					.view(DS0C_SPPL_GRP, v -> v.leftOuterJoin(S0_MM_SPPL9).on(S0_M10.bp_grp_cd9.eq(S0_MM_SPPL9.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP9.value()).eq(S0_MM_SPPL9.bp_grp_typ))))
					.predicate(DS0C_SPPL_GRP, p -> p.cutoff$and(S0_M10.bp_grp_cd9.like(bind("sppl_grp_cd9"))).cutoff$and(S0_MM_SPPL9.bp_grp_nm.like(bind("sppl_grp_nm9")))),
				when(boundOr("sppl_grp_flg10"))
					.select(DS0C_SPPL_GRP, S0_M10.bp_grp_cd10.as("sppl_grp_cd10"), S0_MM_SPPL10.bp_grp_nm.as("sppl_grp_nm10"))
					.view(DS0C_SPPL_GRP, v -> v.leftOuterJoin(S0_MM_SPPL10).on(S0_M10.bp_grp_cd10.eq(S0_MM_SPPL10.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP10.value()).eq(S0_MM_SPPL10.bp_grp_typ))))
					.predicate(DS0C_SPPL_GRP, p -> p.cutoff$and(S0_M10.bp_grp_cd10.like(bind("sppl_grp_cd10"))).cutoff$and(S0_MM_SPPL10.bp_grp_nm.like(bind("sppl_grp_nm10"))))
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
						.add(MAVM_ITM_WG_R.class, r -> toCondition(
							r.getStringNE("itm_cd"),
							r.getStringNE("itm_sub1"),
							r.getStringNE("itm_sub2"),
							r.getStringNE("itm_sub3"),
							r.getStringNE("mfg_loc_wg_cd")
						))
						.addSelect(m -> toArray(
							m.mfg_inst_unit_typ
						))
						.addMap((r, m) -> {
							r.setStringNE("mfg_inst_unit_typ", m.mfg_inst_unit_typ());
					}),
					j -> j
						.add(MAM_LOC_R.class, r -> toCondition(
							r.getStringNE("strg_loc_cd")
						))
						.addSelect(m -> toArray(
							m.loc_grp_cd,
							m.loc_nm,
							m.str_ln_tgt_flg
						))
						.addMap((r, m) -> {
							r.setStringNE("strg_loc_nm", m.loc_nm());
							r.setBooleanNE("strg_str_ln_tgt_flg", m.str_ln_tgt_flg());
							r.setStringNE("join_loc_grp_cd_", m.loc_grp_cd());
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
						.add(MAM_WG_R.class, r -> toCondition(
							r.getStringNE("mfg_loc_wg_cd")
						))
						.addSelect(m -> toArray(
							m.wg_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("mfg_loc_wg_nm", m.wg_nm());
					}),
					j -> j
						.add(MAM_SITE_R.class, r -> toCondition(
							r.getStringNE("mfg_loc_site_cd")
						))
						.addSelect(m -> toArray(
							m.site_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("mfg_loc_site_nm", m.site_nm());
					}),
					j -> j
						.add(MAM_BP_R.class, r -> toCondition(
							r.getStringNE("sppl_cd")
						))
						.addSelect(m -> toArray(
							m.bp_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("sppl_nm", m.bp_nm());
					}),
					j -> j
						.add(MAM_LOC_GRP_R.class, r -> toCondition(
							r.getStringNE("mfg_loc_grp_cd")
						))
						.addSelect(m -> toArray(
							m.loc_grp_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("mfg_loc_grp_nm", m.loc_grp_nm());
					}),
					j -> j
						.add(MAM_ITM_TYP_D_R.class, r -> toCondition(
							r.getStringNE("itm_typ"),
							r.getStringNE("itm_typ_d_cd")
						))
						.addSelect(m -> toArray(
							m.itm_typ_d_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("itm_typ_d_nm", m.itm_typ_d_nm());
					}),
					j -> j
						.add(MAM_OPER_R.class, r -> toCondition(
							r.getStringNE("oper_cd")
						))
						.addSelect(m -> toArray(
							m.oper_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("oper_nm", m.oper_nm());
					}),
					j -> j
						.add(MAM_UNIT_R.class, r -> toCondition(
							r.getStringNE("oper_unit_cd")
						))
						.addSelect(m -> toArray(
							m.unit_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("oper_unit_nm", m.unit_nm());
					}),
					j -> j
						.add(MAM_LOC_R.class, r -> toCondition(
							r.getStringNE("oper_loc_cd")
						))
						.addSelect(m -> toArray(
							m.loc_nm,
							m.str_ln_tgt_flg
						))
						.addMap((r, m) -> {
							r.setStringNE("oper_loc_nm", m.loc_nm());
							r.setBooleanNE("oper_str_ln_tgt_flg", m.str_ln_tgt_flg());
					})
				)
			);
	}
	
	/**
	 * -- MSBCL1040_MST_OPER_ORDER_Query_S02
	 */
	static MCQueryPlan MSBCL1040_MST_OPER_ORDER_S02() {
		MST_OPER_ORDER_R oper = MST_OPER_ORDER_R.create("OPER");
		
		return createQueryPlan()
				.setQuery(
					sql("MSBCL1040_MST_OPER_ORDER_Query_S02")
						.mainQuery()
						.selectDistinct(
							oper.itm_ord_no,
							oper.scheduler_frozen_flg
						)
						.from(oper)
						.where(
							value(0).eq(value(0))
							.and(oper.itm_ord_no.eq(bind("itm_ord_no")))
						)
				);
	}
}