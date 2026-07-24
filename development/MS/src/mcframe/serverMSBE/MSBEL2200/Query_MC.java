package mcframe.serverMSBE.MSBEL2200;

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
	 * -- MSBEL2200_MST_PURC_SCHD_Query_S01
	 */
	static MCQueryPlan MSBEL2200_MST_PURC_SCHD_S01() {
		MST_PURC_SCHD_R S0_T1 = MST_PURC_SCHD_R.create("T1");
		MST_ARR_PR_R S0_T2 = MST_ARR_PR_R.create("T2");
		MST_PO_D_R S0_T3 = MST_PO_D_R.create("T3");
		MST_PO_R S0_T4 = MST_PO_R.create("T4");
		MST_ARR_SCHD_R S0_T8 = MST_ARR_SCHD_R.create("T8");
		MST_PO_SCHD_R S0_T5 = MST_PO_SCHD_R.create("T5");
		MST_SLO_D_R S0_T7 = MST_SLO_D_R.create("T7");
		MST_PRMS_RCPT_D_R S0_T9 = MST_PRMS_RCPT_D_R.create("T9");
		MST_DLV_INST_D_R S0_T10 = MST_DLV_INST_D_R.create("T10");
		MAM_TRD_R S0_M1 = MAM_TRD_R.create("M1");
		MAM_BP_R S0_M2 = MAM_BP_R.create("M2");
		MAM_BP_R S0_M3 = MAM_BP_R.create("M3");
		MAM_LOC_R S0_M4 = MAM_LOC_R.create("M4");
		MAM_DPT_R S0_M7 = MAM_DPT_R.create("M7");
		MAM_ITM_R S0_M27 = MAM_ITM_R.create("M27");
		MAM_ITM_TYP_D_R S0_M28 = MAM_ITM_TYP_D_R.create("M28");
		MAM_ITM_LCL_R S0_M33 = MAM_ITM_LCL_R.create("M33");
		MAM_BP_GRP_R S0_MM11 = MAM_BP_GRP_R.create("MM11");
		MAM_BP_GRP_R S0_MM12 = MAM_BP_GRP_R.create("MM12");
		MAM_BP_GRP_R S0_MM13 = MAM_BP_GRP_R.create("MM13");
		MAM_BP_GRP_R S0_MM14 = MAM_BP_GRP_R.create("MM14");
		MAM_BP_GRP_R S0_MM15 = MAM_BP_GRP_R.create("MM15");
		MAM_BP_GRP_R S0_MM16 = MAM_BP_GRP_R.create("MM16");
		MAM_BP_GRP_R S0_MM17 = MAM_BP_GRP_R.create("MM17");
		MAM_BP_GRP_R S0_MM18 = MAM_BP_GRP_R.create("MM18");
		MAM_BP_GRP_R S0_MM19 = MAM_BP_GRP_R.create("MM19");
		MAM_BP_GRP_R S0_MM110 = MAM_BP_GRP_R.create("MM110");
		MAM_ITM_GRP_R S0_MM21 = MAM_ITM_GRP_R.create("MM21");
		MAM_ITM_GRP_R S0_MM22 = MAM_ITM_GRP_R.create("MM22");
		MAM_ITM_GRP_R S0_MM23 = MAM_ITM_GRP_R.create("MM23");
		MAM_ITM_GRP_R S0_MM24 = MAM_ITM_GRP_R.create("MM24");
		MAM_ITM_GRP_R S0_MM25 = MAM_ITM_GRP_R.create("MM25");
		MAM_ITM_GRP_R S0_MM26 = MAM_ITM_GRP_R.create("MM26");
		MAM_ITM_GRP_R S0_MM27 = MAM_ITM_GRP_R.create("MM27");
		MAM_ITM_GRP_R S0_MM28 = MAM_ITM_GRP_R.create("MM28");
		MAM_ITM_GRP_R S0_MM29 = MAM_ITM_GRP_R.create("MM29");
		MAM_ITM_GRP_R S0_MM210 = MAM_ITM_GRP_R.create("MM210");
		MAVM_RD_WG_R S1_DAC = MAVM_RD_WG_R.create("DAC");
		
		MCDynamicSQLID DS0C_ITM_GRP = createDynamicSQLID("DS0C_ITM_GRP");
		MCDynamicSQLID DS0C_SPPL_GRP = createDynamicSQLID("DS0C_SPPL_GRP");
		MCDynamicSQLID REP1 = createDynamicSQLID("REP1");
		
		return createQueryPlan()
			.setQuery(
				sql("MSBEL2200_MST_PURC_SCHD_Query_S01")
					.mainQuery()
					.select(
						S0_T8.pr_sts_typ,
						S0_T3.po_no,
						S0_T3.po_d_no,
						S0_T1.purc_schd_no,
						S0_T8.arr_schd_no,
						S0_T1.purc_schd_dt,
						trunc(
							S0_T8.arr_schd_tm,
							MCDateFmt.DD
						).as("arr_schd_dt"),
						S0_T8.arr_schd_tm.as("arr_schd_hm"),
						S0_T4.trd_cd,
						S0_T4.sppl_cd,
						S0_M2.bp_nm.as("sppl_nm"),
						S0_M2.purc_amt_rnd_typ,
						S0_M2.purc_tax_rnd_typ,
						S0_M2.prnt_lcl_cd,
						nvl2(
							S0_T3.dlv_cd,
							value(MSC_IN_TO_ID_TYP.SCST.value()),
							value(MSC_IN_TO_ID_TYP.LOC.value())
						).as("in_to_id_typ"),
						nvl2(
							S0_T3.dlv_cd,
							nvl(
								S0_T10.dlv_cd,
								S0_T3.dlv_cd
							),
							S0_T3.in_to_loc_cd
						).as("in_to_id_cd"),
						nvl2(
							S0_T10.dlv_cd,
							nvl(
								S0_T10.dlv_nm,
								S0_M3.bp_nm
							),
							decode(
								S0_T3.dlv_sundry_flg,
								value(true),
								S0_T3.dlv_nm,
								nvl2(
									S0_T3.dlv_cd,
									S0_M3.bp_nm,
									S0_M4.loc_nm
								)
							)
						).as("in_to_id_nm"),
						nvl2(
							S0_T10.dlv_cd,
							S0_T10.dlv_cntct_dpt,
							S0_T3.dlv_cntct_dpt
						).as("in_to_cntct_dpt"),
						nvl2(
							S0_T10.dlv_cd,
							S0_T10.dlv_cntct_psn,
							S0_T3.dlv_cntct_psn
						).as("in_to_cntct_psn"),
						nvl2(
							S0_T3.dlv_cd,
							nvl2(
								S0_T10.dlv_cd,
								S0_T10.dlv_zip_cd,
								S0_T3.dlv_zip_cd
							),
							MAPA_LOC$F_GET_LOC_ADDR(
								S0_T3.in_to_loc_cd,
								S0_T4.po_dt,
								value(MAC_BP_ADDR_TYP.ZIP_CD.value()),
								nullValue()
							)
						).as("in_to_zip_cd"),
						nvl2(
							S0_T3.dlv_cd,
							nvl2(
								S0_T10.dlv_cd,
								S0_T10.dlv_addr1,
								S0_T3.dlv_addr1
							),
							MAPA_LOC$F_GET_LOC_ADDR(
								S0_T3.in_to_loc_cd,
								S0_T4.po_dt,
								value(MAC_BP_ADDR_TYP.ADDR1.value()),
								nullValue()
							)
						).as("in_to_addr1"),
						nvl2(
							S0_T3.dlv_cd,
							nvl2(
								S0_T10.dlv_cd,
								S0_T10.dlv_addr2,
								S0_T3.dlv_addr2
							),
							MAPA_LOC$F_GET_LOC_ADDR(
								S0_T3.in_to_loc_cd,
								S0_T4.po_dt,
								value(MAC_BP_ADDR_TYP.ADDR2.value()),
								nullValue()
							)
						).as("in_to_addr2"),
						nvl2(
							S0_T3.dlv_cd,
							nvl2(
								S0_T10.dlv_cd,
								S0_T10.dlv_addr3,
								S0_T3.dlv_addr3
							),
							MAPA_LOC$F_GET_LOC_ADDR(
								S0_T3.in_to_loc_cd,
								S0_T4.po_dt,
								value(MAC_BP_ADDR_TYP.ADDR3.value()),
								nullValue()
							)
						).as("in_to_addr3"),
						nvl2(
							S0_T3.dlv_cd,
							nvl2(
								S0_T10.dlv_cd,
								S0_T10.dlv_addr4,
								S0_T3.dlv_addr4
							),
							MAPA_LOC$F_GET_LOC_ADDR(
								S0_T3.in_to_loc_cd,
								S0_T4.po_dt,
								value(MAC_BP_ADDR_TYP.ADDR4.value()),
								nullValue()
							)
						).as("in_to_addr4"),
						nvl2(
							S0_T3.dlv_cd,
							nvl2(
								S0_T10.dlv_cd,
								S0_T10.dlv_tel,
								S0_T3.dlv_tel
							),
							MAPA_LOC$F_GET_LOC_ADDR(
								S0_T3.in_to_loc_cd,
								S0_T4.po_dt,
								value(MAC_BP_ADDR_TYP.TEL.value()),
								nullValue()
							)
						).as("in_to_tel"),
						nvl2(
							S0_T3.dlv_cd,
							nvl2(
								S0_T10.dlv_cd,
								S0_T10.dlv_fax,
								S0_T3.dlv_fax
							),
							MAPA_LOC$F_GET_LOC_ADDR(
								S0_T3.in_to_loc_cd,
								S0_T4.po_dt,
								value(MAC_BP_ADDR_TYP.FAX.value()),
								nullValue()
							)
						).as("in_to_fax"),
						S0_M3.cntry_cd.as("in_to_cntry_cd"),
						S0_T4.purc_usr_cd,
						S0_T4.purc_dpt_cd,
						S0_M7.dpt_nm.as("purc_dpt_nm"),
						S0_T3.itm_cd,
						S0_T3.itm_sub1,
						S0_T3.itm_sub2,
						S0_T3.itm_sub3,
						decode(
							S0_T3.sundry_itm_flg,
							value(true),
							S0_T3.itm_nm,
							S0_M27.itm_nm
						).as("itm_nm"),
						decode(
							S0_T3.sundry_itm_flg,
							value(true),
							S0_T3.iv_itm_nm,
							S0_M33.itm_nm
						).as("iv_itm_nm"),
						S0_T3.maker_cd,
						decode(
							S0_T8.arr_skip_flg,
							value(true),
							S0_T1.base_unit_schd_qty,
							S0_T8.base_unit_qty
						).as("arr_schd_qty"),
						S0_T3.interim_flg,
						S0_T3.trd_unit_cd.as("po_trd_unit_cd"),
						S0_T3.trd_unit_qty.as("po_trd_unit_qty"),
						S0_T3.trd_cur_upri.as("po_trd_cur_upri"),
						S0_T3.trd_cur_dscnt_amt.as("po_trd_cur_dscnt_amt"),
						decode(
								S0_T3.outsrc_flg,
								value(true),
								S0_M2.repurc_obli_flg,
								value(false)
								).as("repurc_obli_flg"),
						S0_T3.trd_cur_proc_upri.as("po_trd_cur_proc_upri"),
						S0_T3.trd_cur_onr_prov_upri.as("po_trd_cur_onr_prov_upri"),
						S0_T3.trd_cur_amt.as("po_trd_cur_amt"),
						S0_T3.trd_cur_proc_amt.as("po_trd_cur_proc_amt"),
						S0_T3.trd_cur_onr_prov_amt.as("po_trd_cur_onr_prov_amt"),
						S0_T3.trd_cur_tax_amt.as("po_trd_cur_tax_amt"),
						S0_T3.trd_cur_amt.add(S0_T3.trd_cur_tax_amt).as("po_trd_cur_inc_ctax_amt"),
						S0_T3.wtax_amt.as("po_wtax_amt"),
						S0_T3.wtax_rate,
						S0_T3.tax_cd,
						S0_T4.trd_cur_cd,
						S0_T4.xrate_inpt_flg,
						S0_T4.xrate,
						S0_T4.ptax_xrate_inpt_flg,
						S0_T4.ptax_xrate,
						S0_T3.sppl_itm_cd,
						S0_T3.sppl_itm_nm,
						bracket(
								cases()
									.when(S0_T3.dlv_cd.isNotNull())
										.then(S0_T7.cst_itm_cd)
									.otherwise(nullValue())
							).as("cst_itm_cd"),
						bracket(
								cases()
									.when(S0_T3.dlv_cd.isNotNull())
										.then(S0_T7.cst_itm_nm)
									.otherwise(nullValue())
							).as("cst_itm_nm"),
						S0_T3.sno1,
						S0_T3.sno2,
						S0_T3.sno3,
						S0_T3.sno4,
						S0_T3.slo_no,
						S0_T3.slo_d_no,
						S0_T4.tterm_cd1.as("purc_tterm_cd1"),
						S0_T4.tterm_rmrks1.as("purc_tterm_rmrks1"),
						S0_T4.tterm_cd2.as("purc_tterm_cd2"),
						S0_T4.tterm_rmrks2.as("purc_tterm_rmrks2"),
						S0_T4.tterm_cd3.as("purc_tterm_cd3"),
						S0_T4.tterm_rmrks3.as("purc_tterm_rmrks3"),
						S0_T4.aprv_sts_typ,
						S0_T4.aprv_no,
						S0_T3.purc_basis_typ,
						S0_T4.trd_rmrks,
						S0_T4.po_print_rmrks,
						S0_T1.sub_char1,
						S0_T1.sub_char2,
						S0_T1.sub_char3,
						addDynamicSelect(DS0C_SPPL_GRP),
						addDynamicSelect(DS0C_ITM_GRP),
						addDynamicSelect(REP1),
						// this field is appended by sql coverter.
						S0_T7.slo_no.as("join_slo_no_"),
						// this field is appended by sql coverter.
						S0_M2.asppl_cd.as("join_asppl_cd_"),
						// this field is appended by sql coverter.
						S0_T3.base_unit_cd.as("join_base_unit_cd_")
					)
					.from(
						S0_T1
						.innerJoin(S0_T2).on(
							bracket(
								S0_T1.arr_pr_no.eq(S0_T2.arr_pr_no)
							)
						)
						.innerJoin(S0_T3).on(
							bracket(
								S0_T2.po_d_no.eq(S0_T3.po_d_no)
							)
						)
						.innerJoin(S0_T4).on(
							bracket(
								S0_T3.po_no.eq(S0_T4.po_no)
							)
						)
						.innerJoin(S0_T8).on(
							bracket(
								S0_T1.arr_schd_no.eq(S0_T8.arr_schd_no)
							)
						)
						.leftOuterJoin(S0_T5).on(
							bracket(
								S0_T3.po_schd_no.eq(S0_T5.po_schd_no)
							)
						)
						.leftOuterJoin(S0_T7).on(
							bracket(
								S0_T5.slo_d_no.eq(S0_T7.slo_d_no)
								.and(S0_T5.dlv_cd.eq(S0_T7.dlv_cd))
								.and(S0_T3.slo_d_no.eq(S0_T7.slo_d_no))
							)
						)
						.leftOuterJoin(S0_T9).on(
							bracket(
								S0_T8.prms_rcpt_d_no.eq(S0_T9.prms_rcpt_d_no)
							)
						)
						.leftOuterJoin(S0_T10).on(
							bracket(
								S0_T8.dlv_inst_d_no.eq(S0_T10.dlv_inst_d_no)
								.or(S0_T9.dlv_inst_d_no.eq(S0_T10.dlv_inst_d_no))
							)
						)
						.leftOuterJoin(S0_M2).on(
							bracket(
								S0_T4.sppl_cd.eq(S0_M2.bp_cd)
							)
						)
						.leftOuterJoin(S0_M3).on(
							bracket(
								nvl(
									S0_T10.dlv_cd,
									S0_T3.dlv_cd
								).eq(S0_M3.bp_cd)
							)
						)
						.leftOuterJoin(S0_M4).on(
							bracket(
								S0_T3.in_to_loc_cd.eq(S0_M4.loc_cd)
							)
						)
						.leftOuterJoin(S0_M7).on(
							bracket(
								S0_T4.purc_dpt_cd.eq(S0_M7.dpt_cd)
								.and(S0_T4.po_dt.between(S0_M7.st_dt, S0_M7.end_dt))
							)
						)
						.leftOuterJoin(S0_M27).on(
							bracket(
								S0_T3.itm_cd.eq(S0_M27.itm_cd)
								.and(S0_T3.itm_sub1.eq(S0_M27.itm_sub1))
								.and(S0_T3.itm_sub2.eq(S0_M27.itm_sub2))
								.and(S0_T3.itm_sub3.eq(S0_M27.itm_sub3))
							)
						)
						.leftOuterJoin(S0_M33).on(
							bracket(
								S0_T3.itm_cd.eq(S0_M33.itm_cd)
								.and(S0_T3.itm_sub1.eq(S0_M33.itm_sub1))
								.and(S0_T3.itm_sub2.eq(S0_M33.itm_sub2))
								.and(S0_T3.itm_sub3.eq(S0_M33.itm_sub3))
								.and(S0_M33.lcl_cd.eq(S0_M2.prnt_lcl_cd))
							)
						)
						.addDynamicView()
						.addDynamicView(DS0C_SPPL_GRP)
						.addDynamicView(DS0C_ITM_GRP)
						.addDynamicView(REP1)
					)
					.where(
						value(0).eq(value(0))
						.and(S0_T4.can_flg.eq(value(false)))
						.and(S0_M2.sppl_iv_flg.eq(value(true)))
						.and(S0_T1.abort_flg.eq(value(false)))
						.and(
							bind("incl_not_aprv_flg").eq(value(true))
							.or(S0_T4.aprv_sts_typ.isNull())
							.or(S0_T4.aprv_sts_typ.eq(value(MAC_APRV_STS_TYP.ACPT.value())))
						)
						.and(
							exists(
								subQuery()
								.select(value("X"))
								.from(S1_DAC)
								.where(
									S1_DAC.wg_cd.eq(S0_T4.wg_cd)
								)
							)
						)
						.cutoff$and(S0_T8.pr_sts_typ.like(bind("pr_sts_typ")))
						.cutoff$and(S0_T1.purc_schd_dt.gte(bind("purc_schd_dt_fr")))
						.cutoff$and(S0_T1.purc_schd_dt.lte(bind("purc_schd_dt_to")))
						.cutoff$and(S0_T8.arr_schd_tm.gte(bind("arr_schd_hm_fr")))
						.cutoff$and(S0_T8.arr_schd_tm.lte(bind("arr_schd_hm_to")))
						.cutoff$and(S0_T4.sppl_cd.like(bind("sppl_cd")))
						.cutoff$and(S0_M2.bp_nm.like(bind("sppl_nm")))
						.cutoff$and(
							nvl2(
								S0_T3.dlv_cd,
								value(MSC_IN_TO_ID_TYP.SCST.value()),
								value(MSC_IN_TO_ID_TYP.LOC.value())
							).like(bind("in_to_id_typ"))
						)
						.cutoff$and(
							nvl2(
								S0_T3.dlv_cd,
								nvl(
									S0_T10.dlv_cd,
									S0_T3.dlv_cd
								),
								S0_T3.in_to_loc_cd
							).like(bind("in_to_id_cd"))
						)
						.cutoff$and(
							nvl2(
								S0_T10.dlv_cd,
								nvl(
									S0_T10.dlv_nm,
									S0_M3.bp_nm
								),
								decode(
									S0_T3.dlv_sundry_flg,
									value(true),
									S0_T3.dlv_nm,
									nvl2(
										S0_T3.dlv_cd,
										S0_M3.bp_nm,
										S0_M4.loc_nm
									)
								)
							).like(bind("in_to_id_nm"))
						)
						.cutoff$and(S0_T4.trd_cd.like(bind("trd_cd")))
						.addDynamicPredicate()
						.cutoff$and(S0_T1.purc_schd_no.like(bind("purc_schd_no")))
						.cutoff$and(S0_T8.arr_schd_no.like(bind("arr_schd_no")))
						.cutoff$and(S0_T4.po_no.like(bind("po_no")))
						.cutoff$and(S0_T3.po_d_no.like(bind("po_d_no")))
						.cutoff$and(S0_T3.slo_no.like(bind("slo_no")))
						.cutoff$and(S0_T3.slo_d_no.like(bind("slo_d_no")))
						.cutoff$and(S0_M27.itm_typ.like(bind("itm_typ")))
						.cutoff$and(S0_M27.itm_typ_d_cd.like(bind("itm_typ_d_cd")))
						.cutoff$and(S0_T3.itm_cd.like(bind("itm_cd")))
						.cutoff$and(S0_T3.itm_sub1.like(bind("itm_sub1")))
						.cutoff$and(S0_T3.itm_sub2.like(bind("itm_sub2")))
						.cutoff$and(S0_T3.itm_sub3.like(bind("itm_sub3")))
						.cutoff$and(
							decode(
								S0_M27.sundry_itm_flg,
								value(true),
								S0_T3.itm_nm,
								S0_M27.itm_nm
							).like(bind("itm_nm"))
						)
						.cutoff$and(S0_T7.cst_itm_cd.like(bind("cst_itm_cd"))
								.and(S0_T3.dlv_cd.isNotNull()))
						.cutoff$and(S0_T7.cst_itm_nm.like(bind("cst_itm_nm"))
								.and(S0_T3.dlv_cd.isNotNull()))
						.cutoff$and(S0_T1.sub_char1.like(bind("sub_char1")))
						.cutoff$and(S0_T1.sub_char2.like(bind("sub_char2")))
						.cutoff$and(S0_T1.sub_char3.like(bind("sub_char3")))
						.addDynamicPredicate(DS0C_SPPL_GRP)
						.addDynamicPredicate(DS0C_ITM_GRP)
						.addDynamicPredicate(REP1)
					)
					.orderBy(
						addDynamicOrderBy(REP1)
					)
			)
			.setDynamicSQLInfo(
				when(boundOr("trd_nm"))
					.view(v -> v.leftOuterJoin(S0_M1).on(bracket(S0_T4.trd_cd.eq(S0_M1.trd_cd))))
					.predicate(p -> p.cutoff$and(S0_M1.trd_nm.like(bind("trd_nm")))),
				when(boundOr("itm_typ_d_nm"))
					.view(v -> v.leftOuterJoin(S0_M28).on(bracket(S0_M27.itm_typ.eq(S0_M28.itm_typ).and(S0_M27.itm_typ_d_cd.eq(S0_M28.itm_typ_d_cd)))))
					.predicate(p -> p.cutoff$and(S0_M28.itm_typ_d_nm.like(bind("itm_typ_d_nm")))),
				when(boundOr("sppl_grp_flg1"))
					.select(DS0C_SPPL_GRP, S0_M2.bp_grp_cd1.as("sppl_grp_cd1"), S0_MM11.bp_grp_nm.as("sppl_grp_nm1"))
					.view(DS0C_SPPL_GRP, v -> v.leftOuterJoin(S0_MM11).on(S0_M2.bp_grp_cd1.eq(S0_MM11.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP1.value()).eq(S0_MM11.bp_grp_typ))))
					.predicate(DS0C_SPPL_GRP, p -> p.cutoff$and(S0_M2.bp_grp_cd1.like(bind("sppl_grp_cd1"))).cutoff$and(S0_MM11.bp_grp_nm.like(bind("sppl_grp_nm1")))),
				when(boundOr("sppl_grp_flg2"))
					.select(DS0C_SPPL_GRP, S0_M2.bp_grp_cd2.as("sppl_grp_cd2"), S0_MM12.bp_grp_nm.as("sppl_grp_nm2"))
					.view(DS0C_SPPL_GRP, v -> v.leftOuterJoin(S0_MM12).on(S0_M2.bp_grp_cd2.eq(S0_MM12.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP2.value()).eq(S0_MM12.bp_grp_typ))))
					.predicate(DS0C_SPPL_GRP, p -> p.cutoff$and(S0_M2.bp_grp_cd2.like(bind("sppl_grp_cd2"))).cutoff$and(S0_MM12.bp_grp_nm.like(bind("sppl_grp_nm2")))),
				when(boundOr("sppl_grp_flg3"))
					.select(DS0C_SPPL_GRP, S0_M2.bp_grp_cd3.as("sppl_grp_cd3"), S0_MM13.bp_grp_nm.as("sppl_grp_nm3"))
					.view(DS0C_SPPL_GRP, v -> v.leftOuterJoin(S0_MM13).on(S0_M2.bp_grp_cd3.eq(S0_MM13.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP3.value()).eq(S0_MM13.bp_grp_typ))))
					.predicate(DS0C_SPPL_GRP, p -> p.cutoff$and(S0_M2.bp_grp_cd3.like(bind("sppl_grp_cd3"))).cutoff$and(S0_MM13.bp_grp_nm.like(bind("sppl_grp_nm3")))),
				when(boundOr("sppl_grp_flg4"))
					.select(DS0C_SPPL_GRP, S0_M2.bp_grp_cd4.as("sppl_grp_cd4"), S0_MM14.bp_grp_nm.as("sppl_grp_nm4"))
					.view(DS0C_SPPL_GRP, v -> v.leftOuterJoin(S0_MM14).on(S0_M2.bp_grp_cd4.eq(S0_MM14.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP4.value()).eq(S0_MM14.bp_grp_typ))))
					.predicate(DS0C_SPPL_GRP, p -> p.cutoff$and(S0_M2.bp_grp_cd4.like(bind("sppl_grp_cd4"))).cutoff$and(S0_MM14.bp_grp_nm.like(bind("sppl_grp_nm4")))),
				when(boundOr("sppl_grp_flg5"))
					.select(DS0C_SPPL_GRP, S0_M2.bp_grp_cd5.as("sppl_grp_cd5"), S0_MM15.bp_grp_nm.as("sppl_grp_nm5"))
					.view(DS0C_SPPL_GRP, v -> v.leftOuterJoin(S0_MM15).on(S0_M2.bp_grp_cd5.eq(S0_MM15.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP5.value()).eq(S0_MM15.bp_grp_typ))))
					.predicate(DS0C_SPPL_GRP, p -> p.cutoff$and(S0_M2.bp_grp_cd5.like(bind("sppl_grp_cd5"))).cutoff$and(S0_MM15.bp_grp_nm.like(bind("sppl_grp_nm5")))),
				when(boundOr("sppl_grp_flg6"))
					.select(DS0C_SPPL_GRP, S0_M2.bp_grp_cd6.as("sppl_grp_cd6"), S0_MM16.bp_grp_nm.as("sppl_grp_nm6"))
					.view(DS0C_SPPL_GRP, v -> v.leftOuterJoin(S0_MM16).on(S0_M2.bp_grp_cd6.eq(S0_MM16.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP6.value()).eq(S0_MM16.bp_grp_typ))))
					.predicate(DS0C_SPPL_GRP, p -> p.cutoff$and(S0_M2.bp_grp_cd6.like(bind("sppl_grp_cd6"))).cutoff$and(S0_MM16.bp_grp_nm.like(bind("sppl_grp_nm6")))),
				when(boundOr("sppl_grp_flg7"))
					.select(DS0C_SPPL_GRP, S0_M2.bp_grp_cd7.as("sppl_grp_cd7"), S0_MM17.bp_grp_nm.as("sppl_grp_nm7"))
					.view(DS0C_SPPL_GRP, v -> v.leftOuterJoin(S0_MM17).on(S0_M2.bp_grp_cd7.eq(S0_MM17.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP7.value()).eq(S0_MM17.bp_grp_typ))))
					.predicate(DS0C_SPPL_GRP, p -> p.cutoff$and(S0_M2.bp_grp_cd7.like(bind("sppl_grp_cd7"))).cutoff$and(S0_MM17.bp_grp_nm.like(bind("sppl_grp_nm7")))),
				when(boundOr("sppl_grp_flg8"))
					.select(DS0C_SPPL_GRP, S0_M2.bp_grp_cd8.as("sppl_grp_cd8"), S0_MM18.bp_grp_nm.as("sppl_grp_nm8"))
					.view(DS0C_SPPL_GRP, v -> v.leftOuterJoin(S0_MM18).on(S0_M2.bp_grp_cd8.eq(S0_MM18.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP8.value()).eq(S0_MM18.bp_grp_typ))))
					.predicate(DS0C_SPPL_GRP, p -> p.cutoff$and(S0_M2.bp_grp_cd8.like(bind("sppl_grp_cd8"))).cutoff$and(S0_MM18.bp_grp_nm.like(bind("sppl_grp_nm8")))),
				when(boundOr("sppl_grp_flg9"))
					.select(DS0C_SPPL_GRP, S0_M2.bp_grp_cd9.as("sppl_grp_cd9"), S0_MM19.bp_grp_nm.as("sppl_grp_nm9"))
					.view(DS0C_SPPL_GRP, v -> v.leftOuterJoin(S0_MM19).on(S0_M2.bp_grp_cd9.eq(S0_MM19.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP9.value()).eq(S0_MM19.bp_grp_typ))))
					.predicate(DS0C_SPPL_GRP, p -> p.cutoff$and(S0_M2.bp_grp_cd9.like(bind("sppl_grp_cd9"))).cutoff$and(S0_MM19.bp_grp_nm.like(bind("sppl_grp_nm9")))),
				when(boundOr("sppl_grp_flg10"))
					.select(DS0C_SPPL_GRP, S0_M2.bp_grp_cd10.as("sppl_grp_cd10"), S0_MM110.bp_grp_nm.as("sppl_grp_nm10"))
					.view(DS0C_SPPL_GRP, v -> v.leftOuterJoin(S0_MM110).on(S0_M2.bp_grp_cd10.eq(S0_MM110.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP10.value()).eq(S0_MM110.bp_grp_typ))))
					.predicate(DS0C_SPPL_GRP, p -> p.cutoff$and(S0_M2.bp_grp_cd10.like(bind("sppl_grp_cd10"))).cutoff$and(S0_MM110.bp_grp_nm.like(bind("sppl_grp_nm10")))),
				when(boundOr("itm_grp_flg1"))
					.select(DS0C_ITM_GRP, S0_M27.itm_grp_cd1.as("itm_grp_cd1"), S0_MM21.itm_grp_nm.as("itm_grp_nm1"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM21).on(S0_M27.itm_grp_cd1.eq(S0_MM21.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP1.value()).eq(S0_MM21.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M27.itm_grp_cd1.like(bind("itm_grp_cd1"))).cutoff$and(S0_MM21.itm_grp_nm.like(bind("itm_grp_nm1")))),
				when(boundOr("itm_grp_flg2"))
					.select(DS0C_ITM_GRP, S0_M27.itm_grp_cd2.as("itm_grp_cd2"), S0_MM22.itm_grp_nm.as("itm_grp_nm2"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM22).on(S0_M27.itm_grp_cd2.eq(S0_MM22.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP2.value()).eq(S0_MM22.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M27.itm_grp_cd2.like(bind("itm_grp_cd2"))).cutoff$and(S0_MM22.itm_grp_nm.like(bind("itm_grp_nm2")))),
				when(boundOr("itm_grp_flg3"))
					.select(DS0C_ITM_GRP, S0_M27.itm_grp_cd3.as("itm_grp_cd3"), S0_MM23.itm_grp_nm.as("itm_grp_nm3"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM23).on(S0_M27.itm_grp_cd3.eq(S0_MM23.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP3.value()).eq(S0_MM23.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M27.itm_grp_cd3.like(bind("itm_grp_cd3"))).cutoff$and(S0_MM23.itm_grp_nm.like(bind("itm_grp_nm3")))),
				when(boundOr("itm_grp_flg4"))
					.select(DS0C_ITM_GRP, S0_M27.itm_grp_cd4.as("itm_grp_cd4"), S0_MM24.itm_grp_nm.as("itm_grp_nm4"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM24).on(S0_M27.itm_grp_cd4.eq(S0_MM24.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP4.value()).eq(S0_MM24.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M27.itm_grp_cd4.like(bind("itm_grp_cd4"))).cutoff$and(S0_MM24.itm_grp_nm.like(bind("itm_grp_nm4")))),
				when(boundOr("itm_grp_flg5"))
					.select(DS0C_ITM_GRP, S0_M27.itm_grp_cd5.as("itm_grp_cd5"), S0_MM25.itm_grp_nm.as("itm_grp_nm5"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM25).on(S0_M27.itm_grp_cd5.eq(S0_MM25.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP5.value()).eq(S0_MM25.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M27.itm_grp_cd5.like(bind("itm_grp_cd5"))).cutoff$and(S0_MM25.itm_grp_nm.like(bind("itm_grp_nm5")))),
				when(boundOr("itm_grp_flg6"))
					.select(DS0C_ITM_GRP, S0_M27.itm_grp_cd6.as("itm_grp_cd6"), S0_MM26.itm_grp_nm.as("itm_grp_nm6"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM26).on(S0_M27.itm_grp_cd6.eq(S0_MM26.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP6.value()).eq(S0_MM26.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M27.itm_grp_cd6.like(bind("itm_grp_cd6"))).cutoff$and(S0_MM26.itm_grp_nm.like(bind("itm_grp_nm6")))),
				when(boundOr("itm_grp_flg7"))
					.select(DS0C_ITM_GRP, S0_M27.itm_grp_cd7.as("itm_grp_cd7"), S0_MM27.itm_grp_nm.as("itm_grp_nm7"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM27).on(S0_M27.itm_grp_cd7.eq(S0_MM27.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP7.value()).eq(S0_MM27.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M27.itm_grp_cd7.like(bind("itm_grp_cd7"))).cutoff$and(S0_MM27.itm_grp_nm.like(bind("itm_grp_nm7")))),
				when(boundOr("itm_grp_flg8"))
					.select(DS0C_ITM_GRP, S0_M27.itm_grp_cd8.as("itm_grp_cd8"), S0_MM28.itm_grp_nm.as("itm_grp_nm8"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM28).on(S0_M27.itm_grp_cd8.eq(S0_MM28.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP8.value()).eq(S0_MM28.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M27.itm_grp_cd8.like(bind("itm_grp_cd8"))).cutoff$and(S0_MM28.itm_grp_nm.like(bind("itm_grp_nm8")))),
				when(boundOr("itm_grp_flg9"))
					.select(DS0C_ITM_GRP, S0_M27.itm_grp_cd9.as("itm_grp_cd9"), S0_MM29.itm_grp_nm.as("itm_grp_nm9"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM29).on(S0_M27.itm_grp_cd9.eq(S0_MM29.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP9.value()).eq(S0_MM29.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M27.itm_grp_cd9.like(bind("itm_grp_cd9"))).cutoff$and(S0_MM29.itm_grp_nm.like(bind("itm_grp_nm9")))),
				when(boundOr("itm_grp_flg10"))
					.select(DS0C_ITM_GRP, S0_M27.itm_grp_cd10.as("itm_grp_cd10"), S0_MM210.itm_grp_nm.as("itm_grp_nm10"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM210).on(S0_M27.itm_grp_cd10.eq(S0_MM210.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP10.value()).eq(S0_MM210.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M27.itm_grp_cd10.like(bind("itm_grp_cd10"))).cutoff$and(S0_MM210.itm_grp_nm.like(bind("itm_grp_nm10"))))
			)
			.setJoinInfo(
				joinInfo(
					j -> j
						.add(MST_SLO_R.class, r -> toCondition(
							r.getStringNE("join_slo_no_")
						))
						.addSelect(m -> toArray(
							m.cst_cd,
							m.dschrg_port_cd,
							m.eta_dt,
							m.etd_dt,
							m.load_port_cd,
							m.ptax_xrate,
							m.sls_basis_typ,
							m.trd_cd,
							m.trd_cur_cd,
							m.trd_ptn_typ,
							m.trnspt_cd,
							m.tterm_cd1,
							m.tterm_cd2,
							m.tterm_cd3,
							m.tterm_rmrks1,
							m.tterm_rmrks2,
							m.tterm_rmrks3,
							m.via_port_cd,
							m.via_schd_dt,
							m.vssl_flght,
							m.xrate
						))
						.addMap((r, m) -> {
							r.setStringNE("sls_basis_typ", m.sls_basis_typ());
							r.setStringNE("trnspt_cd", m.trnspt_cd());
							r.setStringNE("vssl_flght", m.vssl_flght());
							r.setStringNE("load_port_cd", m.load_port_cd());
							r.setDateNE("etd_dt", m.etd_dt());
							r.setStringNE("dschrg_port_cd", m.dschrg_port_cd());
							r.setDateNE("eta_dt", m.eta_dt());
							r.setStringNE("via_port_cd", m.via_port_cd());
							r.setDateNE("via_schd_dt", m.via_schd_dt());
							r.setStringNE("cst_cd", m.cst_cd());
							r.setStringNE("slo_trd_cd", m.trd_cd());
							r.setStringNE("slo_cur_cd", m.trd_cur_cd());
							r.setStringNE("slo_trd_ptn_typ", m.trd_ptn_typ());
							r.setNumberNE("slo_xrate", m.xrate());
							r.setNumberNE("slo_ptax_xrate", m.ptax_xrate());
							r.setStringNE("slo_tterm_cd1", m.tterm_cd1());
							r.setStringNE("slo_tterm_rmrks1", m.tterm_rmrks1());
							r.setStringNE("slo_tterm_cd2", m.tterm_cd2());
							r.setStringNE("slo_tterm_rmrks2", m.tterm_rmrks2());
							r.setStringNE("slo_tterm_cd3", m.tterm_cd3());
							r.setStringNE("slo_tterm_rmrks3", m.tterm_rmrks3());
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
						.add(MAM_BP_R.class, r -> toCondition(
							r.getStringNE("join_asppl_cd_")
						))
						.addSelect(m -> toArray(
							m.bsppl_cd
						))
						.addMap((r, m) -> {
							r.setStringNE("join_bsppl_cd_", m.bsppl_cd());
					}),
					j -> j
						.add(MAM_BP_R.class, r -> toCondition(
							r.getStringNE("join_bsppl_cd_")
						))
						.addSelect(m -> toArray(
							m.pay_spot_flg
						))
						.addMap((r, m) -> {
							r.setBooleanNE("pay_spot_flg", m.pay_spot_flg());
					}),
					j -> j
						.add(MAM_CNTRY_R.class, r -> toCondition(
							r.getStringNE("in_to_cntry_cd")
						))
						.addSelect(m -> toArray(
							m.cntry_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("in_to_cntry_nm", m.cntry_nm());
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
						.add(MAM_TAX_R.class, r -> toCondition(
							r.getStringNE("tax_cd")
						))
						.addSelect(m -> toArray(
							m.inc_tax_flg,
							m.tax_nm,
							m.tax_rate
						))
						.addMap((r, m) -> {
							r.setBooleanNE("inc_tax_flg", m.inc_tax_flg());
							r.setStringNE("tax_nm", m.tax_nm());
							r.setNumberNE("tax_rate", m.tax_rate());
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
							r.setNumberNE("trd_amt_dec_place", m.amt_dec_place());
							r.setNumberNE("trd_upri_dec_place", m.upri_dec_place());
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
							r.getStringNE("purc_tterm_cd1")
						))
						.addSelect(m -> toArray(
							m.tterm_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("purc_tterm_nm1", m.tterm_nm());
					}),
					j -> j
						.add(MAM_TTERM_R.class, r -> toCondition(
							r.getStringNE("purc_tterm_cd2")
						))
						.addSelect(m -> toArray(
							m.tterm_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("purc_tterm_nm2", m.tterm_nm());
					}),
					j -> j
						.add(MAM_TTERM_R.class, r -> toCondition(
							r.getStringNE("purc_tterm_cd3")
						))
						.addSelect(m -> toArray(
							m.tterm_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("purc_tterm_nm3", m.tterm_nm());
					}),
					j -> j
						.add(MAM_BP_R.class, r -> toCondition(
							r.getStringNE("cst_cd")
						))
						.addSelect(m -> toArray(
							m.bp_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("cst_nm", m.bp_nm());
					}),
					j -> j
						.add(MAM_CUR_R.class, r -> toCondition(
							r.getStringNE("slo_cur_cd")
						))
						.addSelect(m -> toArray(
							m.cur_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("slo_cur_nm", m.cur_nm());
					}),
					j -> j
						.add(MAM_TTERM_R.class, r -> toCondition(
							r.getStringNE("slo_tterm_cd1")
						))
						.addSelect(m -> toArray(
							m.tterm_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("slo_tterm_nm1", m.tterm_nm());
					}),
					j -> j
						.add(MAM_TTERM_R.class, r -> toCondition(
							r.getStringNE("slo_tterm_cd2")
						))
						.addSelect(m -> toArray(
							m.tterm_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("slo_tterm_nm2", m.tterm_nm());
					}),
					j -> j
						.add(MAM_TTERM_R.class, r -> toCondition(
							r.getStringNE("slo_tterm_cd3")
						))
						.addSelect(m -> toArray(
							m.tterm_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("slo_tterm_nm3", m.tterm_nm());
					}),
					j -> j
						.add(MAM_TRD_R.class, r -> toCondition(
							r.getStringNE("slo_trd_cd")
						))
						.addSelect(m -> toArray(
							m.trd_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("slo_trd_nm", m.trd_nm());
					}),
					j -> j
						.add(MAVM_ITM_UNIT_R.class, r -> toCondition(
							r.getStringNE("itm_cd"),
							r.getStringNE("itm_sub1"),
							r.getStringNE("itm_sub2"),
							r.getStringNE("itm_sub3"),
							r.getStringNE("join_base_unit_cd_")
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
						.add(MAVM_ITM_UNIT_R.class, r -> toCondition(
							r.getStringNE("itm_cd"),
							r.getStringNE("itm_sub1"),
							r.getStringNE("itm_sub2"),
							r.getStringNE("itm_sub3"),
							r.getStringNE("po_trd_unit_cd")
						))
						.addSelect(m -> toArray(
							m.conv_base_qty,
							m.conv_qty
						))
						.addMap((r, m) -> {
							r.setNumberNE("po_trd_unit_conv_base_qty", m.conv_base_qty());
							r.setNumberNE("po_trd_unit_conv_qty", m.conv_qty());
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
					})
				)
			);
	}
	/**
	 * MSBEL2200_MST_PURC_SCHD_S01_WHERE01
	 */
	static MCDynamicSQLInfo MSBEL2200_MST_PURC_SCHD_S01_WHERE01() {
		MST_PURC_SCHD_R S0_T1 = MST_PURC_SCHD_R.create("T1");
		MST_PO_D_R S0_T3 = MST_PO_D_R.create("T3");
		MST_ARR_SCHD_R S0_T8 = MST_ARR_SCHD_R.create("T8");
		MST_RCPT_IV_MAP_R S0_T22 = MST_RCPT_IV_MAP_R.create("T22");
		MST_ARR_ACT_R W1 = MST_ARR_ACT_R.create("W1");
		MST_RCPT_IV_MAP_R W2 = MST_RCPT_IV_MAP_R.create("W2");
		MST_RCPT_IV_D_R W3 = MST_RCPT_IV_D_R.create("W3");
		MCDynamicSQLID REP1 = createDynamicSQLID("REP1");
		
		return when(null)
			.select(REP1,
				nullValue().as("arr_dt"),
				nullValue().as("arr_hm"),
				S0_T8.trd_unit_cd,
				decode(
					S0_T8.arr_skip_flg,
					value(true),
					S0_T1.trd_unit_schd_qty,
					S0_T8.trd_unit_qty
				).as("trd_unit_qty"),
				S0_T8.base_unit_cd,
				decode(
					S0_T8.arr_skip_flg,
					value(true),
					S0_T1.base_unit_schd_qty,
					S0_T8.base_unit_qty
				).as("base_unit_qty"),
				decode(
					S0_T8.arr_skip_flg,
					value(true),
					value(0),
					S0_T8.arr_qty
				).as("arr_act_qty"),
				nullValue().as("arr_act_no"),
				nullValue().as("rcpt_iv_no"),
				S0_T8.ins_usr_id,
				S0_T8.ins_usr_nm,
				S0_T8.ins_func_id,
				S0_T8.ins_ts,
				S0_T8.upd_cntr,
				S0_T8.upd_usr_id,
				S0_T8.upd_usr_nm,
				S0_T8.upd_func_id,
				S0_T8.upd_ts,
				S0_T8.upd_srv_req_no
			)
			.view(REP1, v ->
				// 入荷予定と受領インボイスマップは１対１で紐付く
				v.leftOuterJoin(S0_T22).on(
					S0_T22.arr_schd_no.eq(S0_T8.arr_schd_no)
				)
			)
			.predicate(REP1, p ->
				p.and(S0_T8.abort_flg.eq(value(false)))
				.and(
					notExists(subQuery()
						.select(value("x"))
						.from(W3)
						.where(
							W3.rcpt_iv_d_no.eq(S0_T22.rcpt_iv_d_no)
						)
					)
				)
				.and(
					notExists(subQuery()
						.select(value("x"))
						.from(W1
							.innerJoin(W2).on(
								W2.arr_act_no.eq(W1.arr_act_no)
								.and(W2.rcpt_iv_d_no.neq(value(MAC_STR.NULL_VAL.value())))
							)
						)
						.where(
							W1.arr_schd_no.eq(S0_T8.arr_schd_no)
							.and(W1.can_flg.eq(value(false)))
						)
					)
				)
			)
			.orderBy(
				S0_T3.po_d_no.asc(),
				S0_T8.arr_schd_no.asc()
			);
	}
	/**
	 * MSBEL2200_MST_PURC_SCHD_S01_WHERE02
	 */
	static MCDynamicSQLInfo MSBEL2200_MST_PURC_SCHD_S01_WHERE02() {
		MST_PO_D_R S0_T3 = MST_PO_D_R.create("T3");
		MST_ARR_SCHD_R S0_T8 = MST_ARR_SCHD_R.create("T8");
		MST_ARR_ACT_R S0_T21 = MST_ARR_ACT_R.create("T21");
		MST_RCPT_IV_MAP_R S0_T22 = MST_RCPT_IV_MAP_R.create("T22");
		MST_RCPT_IV_MAP_R S0_T23 = MST_RCPT_IV_MAP_R.create("T23");
		MST_RCPT_IV_MAP_R W1 = MST_RCPT_IV_MAP_R.create("W1");
		MST_RCPT_IV_D_R W2 = MST_RCPT_IV_D_R.create("W2");
		MCDynamicSQLID REP1 = createDynamicSQLID("REP1");
		
		return when(null)
			.select(REP1,
				trunc(
					S0_T21.arr_tm,
					MCDateFmt.DD
				).as("arr_dt"),
				S0_T21.arr_tm.as("arr_hm"),
				S0_T21.trd_unit_cd,
				// 取引単位数量は基準単位数量から算出する
				S0_T21.base_unit_cd,
				S0_T21.base_unit_qty.subtract(
					nvl(subQuery()
						.select(sum(W1.base_unit_qty))
						.from(W1)
						.where(
							W1.arr_act_no.eq(S0_T21.arr_act_no)	
							.and(W1.rcpt_iv_d_no.neq(value(MAC_STR.NULL_VAL.value())))
						), value(0))
				).as("base_unit_qty"),
				S0_T21.base_unit_qty.as("arr_act_qty"),
				S0_T21.arr_act_no,
				decode(
					S0_T22.rcpt_iv_d_no,
					value(MAC_STR.NULL_VAL.value()),
					S0_T22.rcpt_iv_no,
					nullValue()
				).as("rcpt_iv_no"),
				S0_T21.ins_usr_id,
				S0_T21.ins_usr_nm,
				S0_T21.ins_func_id,
				S0_T21.ins_ts,
				S0_T21.upd_cntr,
				S0_T21.upd_usr_id,
				S0_T21.upd_usr_nm,
				S0_T21.upd_func_id,
				S0_T21.upd_ts,
				S0_T21.upd_srv_req_no
			)
			.view(REP1, v ->
				v.innerJoin(S0_T21).on(
					S0_T21.arr_schd_no.eq(S0_T8.arr_schd_no)
					.and(S0_T21.can_flg.eq(value(false)))
				)
				// 入荷実績と受領インボイスマップは１対Ｎで紐付く
				.leftOuterJoin(S0_T22).on(
					S0_T22.arr_act_no.eq(S0_T21.arr_act_no)
				)
				// 入荷予定と受領インボイスマップは１対１で紐付く
				.leftOuterJoin(S0_T23).on(
					S0_T23.arr_schd_no.eq(S0_T8.arr_schd_no)
				)
			)
			.predicate(REP1, p ->
				// 入荷予定と紐付け済みは対象外
				p.and(
					notExists(subQuery()
						.select(value("x"))
						.from(W2)
						.where(
							W2.rcpt_iv_d_no.eq(S0_T23.rcpt_iv_d_no)
						)
					)
				)
				.cutoff$and(S0_T21.arr_tm.gte(bind("arr_hm_fr")))
				.cutoff$and(S0_T21.arr_tm.lte(bind("arr_hm_to")))
				.cutoff$and(S0_T21.arr_act_no.like(bind("arr_act_no")))
				.cutoff$and(S0_T22.rcpt_iv_no.like(bind("rcpt_iv_no")))
			)
			.orderBy(
				S0_T3.po_d_no.asc(),
				S0_T8.arr_schd_no.asc(),
				S0_T21.arr_act_no.asc()
			);
	}
}