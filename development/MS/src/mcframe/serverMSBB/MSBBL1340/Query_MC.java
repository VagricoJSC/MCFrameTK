package mcframe.serverMSBB.MSBBL1340;

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
	 * -- MSBBL1340_ARR_ACT_Query_S01
	 */
	static MCQueryPlan MSBBL1340_ARR_ACT_S01() {
		MST_ARR_ACT_R S0_T1 = MST_ARR_ACT_R.create("T1");
		MST_ARR_SCHD_R S0_T2 = MST_ARR_SCHD_R.create("T2");
		MST_ARR_PR_R S0_T3 = MST_ARR_PR_R.create("T3");
		MST_SLS_RET_SCHD_D_R S0_T4 = MST_SLS_RET_SCHD_D_R.create("T4");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBBL1340_ARR_ACT_Query_S01")
					.mainQuery()
					.selectDistinct(S0_T4.sls_ret_schd_no.as("srch_tgt_no"))
					.from(
						S0_T1
						.innerJoin(S0_T2).on(
							bracket(
								S0_T1.arr_schd_no.eq(S0_T2.arr_schd_no)
							)
						)
						.innerJoin(S0_T3).on(
							bracket(
								S0_T2.arr_pr_no.eq(S0_T3.arr_pr_no)
							)
						)
						.innerJoin(S0_T4).on(
							bracket(
								S0_T3.sls_ret_schd_d_no.eq(S0_T4.sls_ret_schd_d_no)
							)
						)
					)
					.where(
						value(1).eq(value(1))
						.and(S0_T1.arr_act_no.eq(bind("srch_tgt_no")))
					)
			);
	}
	
	/**
	 * -- MSBBL1340_ARR_ACT_Query_S02
	 */
	static MCQueryPlan MSBBL1340_ARR_ACT_S02() {
		MST_ARR_ACT_R S0_T = MST_ARR_ACT_R.create("T");
		MST_SLS_ACT_IO_R S1_T1 = MST_SLS_ACT_IO_R.create("T1");
		MST_SLS_ACT_D_R S1_T2 = MST_SLS_ACT_D_R.create("T2");
		MST_SLS_ACT_R S1_T3 = MST_SLS_ACT_R.create("T3");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBBL1340_ARR_ACT_Query_S02")
					.mainQuery()
					.select(
						value(false).as("sync_flg"),
						S0_T.arr_schd_no,
						S0_T.arr_act_no,
						S0_T.trd_unit_cd,
						S0_T.trd_unit_qty,
						S0_T.base_unit_qty.as("arr_qty"),
						S0_T.gd_cd,
						S0_T.arr_loc_cd.as("loc_cd"),
						S0_T.str_ln_cd,
						S0_T.lot_no,
						S0_T.sublot_no,
						S0_T.sno1,
						S0_T.sno2,
						S0_T.sno3,
						S0_T.sno4,
						S0_T.upd_cntr.as("arr_act_upd_cntr"),
						nvl(
							bracket(
								subQuery()
								.select(sum(S1_T1.base_unit_qty))
								.from(
									S1_T1
									.innerJoin(S1_T2).on(
										bracket(
											S1_T1.sls_act_d_no.eq(S1_T2.sls_act_d_no)
											.and(S1_T1.sls_act_d_seq.eq(S1_T2.sls_act_d_seq))
										)
									)
									.innerJoin(S1_T3).on(
										bracket(
											S1_T2.sls_act_no.eq(S1_T3.sls_act_no)
											.and(S1_T2.sls_act_seq.eq(S1_T3.sls_act_seq))
										)
									)
								)
								.where(
									value(1).eq(value(1))
									.and(S1_T3.slip_sts_typ.eq(value(MAC_SLIP_STS_TYP.CRT.value())))
									.and(S1_T3.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.SLS_RTN.value())))
									.and(S1_T1.arr_act_no.eq(S0_T.arr_act_no))
								)
							),
							value(0)
						).as("sls_ret_qty"),
						S0_T.itm_cd.as("join_itm_cd_"),
						S0_T.itm_sub1.as("join_itm_sub1_"),
						S0_T.itm_sub2.as("join_itm_sub2_"),
						S0_T.itm_sub3.as("join_itm_sub3_")
					)
					.from(S0_T)
					.where(
						value(1).eq(value(1))
						.and(S0_T.can_flg.eq(value(false)))
						.cutoff$and(S0_T.arr_schd_no.like(bind("arr_schd_no")))
					)
			)
			.setJoinInfo(
				joinInfo(
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
						.add(MAVM_ITM_UNIT_R.class, r -> toCondition(
							r.getStringNE("join_itm_cd_"),
							r.getStringNE("join_itm_sub1_"),
							r.getStringNE("join_itm_sub2_"),
							r.getStringNE("join_itm_sub3_"),
							r.getStringNE("trd_unit_cd")
						))
						.addSelect(m -> toArray(
							m.conv_base_qty,
							m.conv_qty,
							m.dec_place,
							m.rnd_typ
						))
						.addMap((r, m) -> {
							r.setNumberNE("trd_unit_dec_place", m.dec_place());
							r.setStringNE("trd_unit_rnd_typ", m.rnd_typ());
							r.setNumberNE("trd_unit_conv_base_qty", m.conv_base_qty());
							r.setNumberNE("trd_unit_conv_qty", m.conv_qty());
							r.setStringNE("trd_unit_rnd_typ", m.rnd_typ());
					}),
					j -> j
						.add(MAM_LOC_R.class, r -> toCondition(
							r.getStringNE("loc_cd")
						))
						.addSelect(m -> toArray(
							m.loc_nm,
							m.str_ln_tgt_flg
						))
						.addMap((r, m) -> {
							r.setStringNE("loc_nm", m.loc_nm());
							r.setBooleanNE("str_ln_tgt_flg", m.str_ln_tgt_flg());
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
						.add(MAM_STR_LN_R.class, r -> toCondition(
							r.getStringNE("loc_cd"),
							r.getStringNE("str_ln_cd")
						))
						.addSelect(m -> toArray(
							m.str_ln_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("str_ln_nm", m.str_ln_nm());
					})
				)
			);
	}
	
	/**
	 * -- MSBBL1340_ARR_SCHD_Query_S02
	 */
	static MCQueryPlan MSBBL1340_ARR_SCHD_S02() {
		MST_SLS_RET_SCHD_R S0_T1 = MST_SLS_RET_SCHD_R.create("T1");
		MST_SLS_RET_SCHD_D_R S0_T2 = MST_SLS_RET_SCHD_D_R.create("T2");
		MST_ARR_PR_R S0_T3 = MST_ARR_PR_R.create("T3");
		MST_ARR_SCHD_R S0_T4 = MST_ARR_SCHD_R.create("T4");
		MAVM_RD_DPT_R S0_DAC = MAVM_RD_DPT_R.create("DAC");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBBL1340_ARR_SCHD_Query_S02")
					.mainQuery()
					.select(
						value(true).as("sync_flg"),
						S0_T4.trd_unit_cd,
						S0_T4.trd_unit_qty,
						S0_T4.base_unit_cd,
						S0_T4.base_unit_qty,
						bracket(
							S0_T4.base_unit_qty.subtract(S0_T4.arr_qty).subtract(S0_T4.abort_qty)
						).as("schd_qty"),
						value(0).as("arr_qty"),
						S0_T4.gd_cd,
						S0_T4.arr_loc_cd.as("loc_cd"),
						S0_T4.str_ln_cd,
						S0_T4.lot_no,
						S0_T4.sublot_no,
						S0_T4.ver_no,
						S0_T4.sno1,
						S0_T4.sno2,
						S0_T4.sno3,
						S0_T4.sno4,
						S0_T4.itm_cd,
						S0_T4.itm_sub1,
						S0_T4.itm_sub2,
						S0_T4.itm_sub3,
						S0_T3.arr_pr_no.as("arr_pr_no"),
						S0_T3.upd_cntr.as("arr_pr_upd_cntr"),
						S0_T4.arr_schd_no,
						S0_T2.ref_sls_act_d_no.as("ref_sls_act_d_no")
					)
					.from(
						S0_T1
						.leftOuterJoin(S0_T2).on(
							bracket(
								S0_T2.sls_ret_schd_no.eq(S0_T1.sls_ret_schd_no)
							)
						)
						.leftOuterJoin(S0_T3).on(
							bracket(
								S0_T3.sls_ret_schd_d_no.eq(S0_T2.sls_ret_schd_d_no)
							)
						)
						.leftOuterJoin(S0_T4).on(
							bracket(
								S0_T4.arr_pr_no.eq(S0_T3.arr_pr_no)
							)
						)
						.innerJoin(S0_DAC).on(
							bracket(
								S0_T1.sls_dpt_cd.eq(S0_DAC.dpt_cd)
							)
						)
					)
					.where(
						value(1).eq(value(1))
						.and(S0_T2.sls_ret_schd_no.eq(bind("srch_tgt_no")))
						.and(S0_T4.sls_ret_schd_abort_flg.eq(value(false)))
						.and(S0_T3.sls_ret_cmpl_flg.eq(value(false)))
					)
			)
			.setJoinInfo(
				joinInfo(
					j -> j
						.add(MAM_ITM_R.class, r -> toCondition(
							r.getStringNE("itm_cd"),
							r.getStringNE("itm_sub1"),
							r.getStringNE("itm_sub2"),
							r.getStringNE("itm_sub3")
						))
						.addSelect(m -> toArray(
							m.dec_place,
							m.lot_mng_typ,
							m.lot_no_typ,
							m.rnd_typ,
							m.sno1_mng_typ,
							m.sno2_mng_typ,
							m.sno3_mng_typ,
							m.sno4_mng_typ,
							m.stk_mng_typ,
							m.sublot_mng_typ,
							m.sublot_no_typ,
							m.ver_flg
						))
						.addMap((r, m) -> {
							r.setNumberNE("base_unit_dec_place", m.dec_place());
							r.setStringNE("base_unit_rnd_typ", m.rnd_typ());
							r.setStringNE("lot_mng_typ", m.lot_mng_typ());
							r.setStringNE("lot_no_typ", m.lot_no_typ());
							r.setStringNE("sublot_mng_typ", m.sublot_mng_typ());
							r.setStringNE("sublot_no_typ", m.sublot_no_typ());
							r.setBooleanNE("ver_flg", m.ver_flg());
							r.setStringNE("sno1_mng_typ", m.sno1_mng_typ());
							r.setStringNE("sno2_mng_typ", m.sno2_mng_typ());
							r.setStringNE("sno3_mng_typ", m.sno3_mng_typ());
							r.setStringNE("sno4_mng_typ", m.sno4_mng_typ());
							r.setStringNE("stk_mng_typ", m.stk_mng_typ());
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
						.add(MAM_LOC_R.class, r -> toCondition(
							r.getStringNE("loc_cd")
						))
						.addSelect(m -> toArray(
							m.loc_nm,
							m.site_cd,
							m.str_ln_tgt_flg
						))
						.addMap((r, m) -> {
							r.setStringNE("loc_nm", m.loc_nm());
							r.setBooleanNE("str_ln_tgt_flg", m.str_ln_tgt_flg());
							r.setStringNE("site_cd", m.site_cd());
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
						.add(MAM_STR_LN_R.class, r -> toCondition(
							r.getStringNE("loc_cd"),
							r.getStringNE("str_ln_cd")
						))
						.addSelect(m -> toArray(
							m.str_ln_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("str_ln_nm", m.str_ln_nm());
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
							r.setNumberNE("trd_unit_dec_place", m.dec_place());
							r.setStringNE("trd_unit_rnd_typ", m.rnd_typ());
							r.setNumberNE("trd_unit_conv_base_qty", m.conv_base_qty());
							r.setNumberNE("trd_unit_conv_qty", m.conv_qty());
							r.setStringNE("trd_unit_rnd_typ", m.rnd_typ());
					})
				)
			);
	}
	
	/**
	 * -- MSBBL1340_SLS_ACT_D_Query_S01
	 */
	static MCQueryPlan MSBBL1340_SLS_ACT_D_S01() {
		MST_SLS_ACT_R S0_T1 = MST_SLS_ACT_R.create("T1");
		MST_SLS_ACT_D_R S0_T2 = MST_SLS_ACT_D_R.create("T2");
		MST_PO_R S0_T3 = MST_PO_R.create("T3");
		MST_PURC_ACT_R S0_T4 = MST_PURC_ACT_R.create("T4");
		MST_PURC_ACT_D_R S0_T5 = MST_PURC_ACT_D_R.create("T5");
		MST_SLO_D_R S0_T7 = MST_SLO_D_R.create("T7");
		MST_LOT_R S0_T8 = MST_LOT_R.create("T8");
		MAM_ITM_R S0_ITM = MAM_ITM_R.create("ITM");
		MAM_BP_R S0_DLV = MAM_BP_R.create("DLV");
		MAM_ITM_LCL_R S0_ITMLCL = MAM_ITM_LCL_R.create("ITMLCL");
		MAM_TAX_R S0_TAX = MAM_TAX_R.create("TAX");
		MAM_LOC_R S0_LOC = MAM_LOC_R.create("LOC");
		MSVT_LOT_LIST_R S0_LOT = MSVT_LOT_LIST_R.create("LOT");
		MAM_DPT_R S0_DPT = MAM_DPT_R.create("DPT");
		MAM_DPT_R S0_PURC = MAM_DPT_R.create("PURC");
		MAM_DPT_R S0_APDPT = MAM_DPT_R.create("APDPT");
		MAVM_RD_DPT_R S0_DAC = MAVM_RD_DPT_R.create("DAC");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBBL1340_SLS_ACT_D_Query_S01")
					.mainQuery()
					.select(
						S0_T2.itm_cd,
						S0_T2.itm_sub1,
						S0_T2.itm_sub2,
						S0_T2.itm_sub3,
						nvl(
							S0_T2.itm_nm,
							S0_ITM.itm_nm
						).as("itm_nm"),
						decode(
							S0_T2.sundry_itm_flg,
							value(true),
							S0_T2.iv_itm_nm,
							S0_ITMLCL.itm_nm
						).as("iv_itm_nm"),
						S0_T2.stk_mng_typ,
						S0_T2.sundry_itm_flg,
						S0_T2.dlv_cd,
						nvl(
							S0_T2.dlv_nm,
							S0_DLV.bp_nm
						).as("dlv_nm"),
						S0_T2.dlv_zip_cd,
						S0_T2.dlv_addr1,
						S0_T2.dlv_addr2,
						S0_T2.dlv_addr3,
						S0_T2.dlv_addr4,
						S0_T2.dlv_cntct_dpt,
						S0_T2.dlv_cntct_psn,
						S0_T2.dlv_tel,
						S0_T2.dlv_fax,
						cases()
							.when(
								S0_T1.ddlv_sls_flg.eq(value(false))
								.and(S0_T1.sls_basis_typ.eq(value(MAC_SLS_BASIS_TYP.IN_BASIS.value()))
									.or(S0_T1.sls_basis_typ.eq(value(MAC_SLS_BASIS_TYP.ARRIVAL_BASIS.value()))))
							).then(value(true))
							.otherwise(S0_T2.pri_prnt_flg).as("pri_prnt_flg"),
						S0_DLV.cntry_cd,
						S0_DLV.prnt_lcl_cd,
						S0_T2.dest_cd1,
						S0_T2.dest_cd2,
						S0_T2.dest_cd3,
						S0_T2.purc_act_no.as("purc_act_no"),
						S0_T2.purc_act_d_no.as("purc_act_d_no"),
						S0_T3.sppl_cd,
						S0_T3.sppl_zip_cd.as("ret_zip_cd"),
						S0_T3.sppl_addr1.as("ret_addr1"),
						S0_T3.sppl_addr2.as("ret_addr2"),
						S0_T3.sppl_addr3.as("ret_addr3"),
						S0_T3.sppl_addr4.as("ret_addr4"),
						S0_T3.sppl_cntct_dpt.as("ret_cntct_dpt"),
						S0_T3.sppl_cntct_psn.as("ret_cntct_psn"),
						MAPA_BP$F_GET_BP_ADDR(
							S0_T3.sppl_cd,
							bind("today"),
							value(MAC_BP_ADDR_TYP.SPPL_CNTCT_PSN_TITLE.value())
						).as("ret_cntct_psn_title"),
						S0_T3.sppl_tel.as("ret_tel"),
						S0_T3.sppl_fax.as("ret_fax"),
						S0_T4.purc_dpt_cd.as("ret_dpt_cd"),
						S0_PURC.dpt_nm.as("ret_dpt_nm"),
						S0_T4.purc_usr_cd.as("ret_usr_cd"),
						S0_T2.cntry_org_cd,
						S0_T2.trd_unit_cd,
						S0_T2.trd_unit_qty,
						S0_T2.base_unit_cd,
						S0_T2.base_unit_qty,
						value(0).as("schd_qty"),
						value(0).as("arr_qty"),
						value(0).as("sls_ret_qty"),
						value(0).as("abort_qty"),
						S0_T2.trd_cur_upri,
						value(true).as("upri_not_tgt_flg"),
						S0_T2.interim_flg,
						S0_T2.trd_cur_amt,
						bracket(
							S0_T2.trd_cur_amt.add(S0_T2.trd_cur_tax_amt)
						).as("trd_cur_inc_tax_amt"),
						S0_T2.trd_cur_dscnt_amt,
						S0_T2.dscnt_rsn_cd,
						S0_T2.cost_upri,
						S0_T2.cost_amt,
						value(false).as("tax_fix_flg"),
						S0_T2.tax_cd,
						S0_TAX.tax_nm,
						S0_TAX.tax_rate,
						S0_TAX.inc_tax_flg,
						S0_TAX.tax_typ,
						S0_T2.trd_cur_tax_amt,
						S0_T2.base_cur_upri,
						S0_T2.base_cur_amt,
						bracket(
							S0_T2.base_cur_amt.add(S0_T2.base_cur_tax_amt)
						).as("base_cur_inc_tax_amt"),
						S0_T2.base_cur_tax_amt,
						S0_T2.base_cur_dscnt_amt,
						S0_T2.ptax_cur_upri,
						S0_T2.ptax_cur_amt,
						bracket(
							S0_T2.ptax_cur_amt.add(S0_T2.ptax_cur_tax_amt)
						).as("ptax_cur_inc_tax_amt"),
						S0_T2.ptax_cur_tax_amt,
						S0_T2.ptax_cur_dscnt_amt,
						S0_T2.bill_crryovr_times,
						S0_T2.gd_cd,
						S0_T2.loc_cd,
						S0_LOC.loc_nm,
						S0_T2.str_ln_cd,
						cases()
							.when(S0_LOC.str_ln_tgt_flg.eq(value(true)))
								.then(
									cases()
										.when(MAC_STR$IS_NULL_VAL(S0_T2.str_ln_cd).eq(value(true)))
											.then(value(true))
										.otherwise(value(false))
							)
							.otherwise(value(false)).as("str_ln_cd_none_flg"),
						S0_T2.lot_no,
						S0_T2.sublot_no,
						decode(
							S0_ITM.ver_flg,
							value(true),
							S0_T8.ver_no,
							nullValue()
						).as("ver_no"),
						S0_T2.sno1,
						S0_T2.sno2,
						S0_T2.sno3,
						S0_T2.sno4,
						S0_T2.cst_po_d_no,
						S0_T2.cst_itm_cd,
						S0_T2.cst_itm_nm,
						S0_T2.wtax_rate,
						S0_T2.wtax_amt,
						S0_T2.slo_no,
						S0_T2.slo_d_no,
						S0_T1.sls_act_no.as("ref_sls_act_no"),
						S0_T2.sls_act_d_no.as("ref_sls_act_d_no"),
						S0_T2.disp_seq,
						S0_ITM.lot_mng_typ,
						S0_ITM.lot_no_typ,
						S0_ITM.sublot_mng_typ,
						S0_ITM.sublot_no_typ,
						S0_ITM.ver_flg,
						S0_ITM.sno1_mng_typ,
						S0_ITM.sno2_mng_typ,
						S0_ITM.sno3_mng_typ,
						S0_ITM.sno4_mng_typ,
						S0_ITM.dec_place.as("base_unit_dec_place"),
						S0_ITM.rnd_typ.as("base_unit_rnd_typ"),
						S0_ITM.sls_upri_cng_flg.as("itm_sls_upri_cng_flg"),
						S0_ITM.bill_crryovr_times.as("itm_bill_crryovr_times"),
						S0_LOC.str_ln_tgt_flg,
						S0_LOC.site_cd,
						S0_TAX.inc_tax_flg,
						S0_T1.sls_act_seq.as("ref_sls_act_seq"),
						S0_T2.sls_act_d_seq.as("ref_sls_act_d_seq"),
						S0_T2.sls_ret_schd_no,
						nullValue().as("arr_pr_no"),
						S0_T2.purc_ddlv_po_no,
						S0_T2.purc_ddlv_po_d_no,
						S0_T2.dlv_sundry_flg,
						S0_ITM.comp_spec_typ,
						S0_ITM.dscnt_itm_flg,
						S0_ITM.asset_mng_typ,
						S0_T5.ap_dpt_cd,
						S0_APDPT.dpt_nm.as("ap_dpt_nm"),
						S0_T2.base_unit_qty.as("init_schd_qty"),
						S0_T2.trd_cur_dscnt_amt.as("init_schd_dscnt_amt"),
						decode(
							S0_TAX.inc_tax_flg,
							value(false),
							S0_T2.trd_cur_amt,
							S0_T2.trd_cur_amt.add(S0_T2.trd_cur_tax_amt)
						).as("init_schd_amt"),
						nullValue().as("schd_no"),
						nvl(
							S0_T7.sls_cststk_flg,
							value(false)
						).as("sls_cststk_flg"),
						S0_T2.sls_ret_schd_d_no.as("join_sls_ret_schd_d_no_"),
						S0_T1.ac_dt.as("base_sls_ac_dt"),
						S0_T4.ac_dt.as("base_purc_ac_dt")
					)
					.from(
						S0_T1
						.innerJoin(S0_T2).on(
							bracket(
								S0_T2.sls_act_no.eq(S0_T1.sls_act_no)
								.and(S0_T2.sls_act_seq.eq(S0_T1.sls_act_seq))
							)
						)
						.leftOuterJoin(S0_T3).on(
							bracket(
								S0_T2.purc_ddlv_po_no.eq(S0_T3.po_no)
							)
						)
						.leftOuterJoin(S0_T4).on(
							bracket(
								S0_T2.purc_act_no.eq(S0_T4.purc_act_no)
								.and(S0_T2.purc_ddlv_po_no.eq(S0_T4.po_no))
								.and(S0_T4.slip_sts_typ.eq(value(MAC_SLIP_STS_TYP.CRT.value())))
							)
						)
						.leftOuterJoin(S0_T5).on(
							bracket(
								S0_T4.purc_act_no.eq(S0_T5.purc_act_no)
								.and(S0_T4.purc_act_seq.eq(S0_T5.purc_act_seq))
								.and(S0_T2.purc_act_d_no.eq(S0_T5.purc_act_d_no))
							)
						)
						.leftOuterJoin(S0_T7).on(
							bracket(
								S0_T2.slo_d_no.eq(S0_T7.slo_d_no)
								.and(S0_T7.can_flg.eq(value(false)))
							)
						)
						.leftOuterJoin(S0_T8).on(
							bracket(
								S0_T2.itm_cd.eq(S0_T8.itm_cd)
								.and(S0_T2.itm_sub1.eq(S0_T8.itm_sub1))
								.and(S0_T2.itm_sub2.eq(S0_T8.itm_sub2))
								.and(S0_T2.itm_sub3.eq(S0_T8.itm_sub3))
								.and(S0_T2.lot_no.eq(S0_T8.lot_no))
								.and(S0_T2.sublot_no.eq(S0_T8.sublot_no))
							)
						)
						.leftOuterJoin(S0_ITM).on(
							bracket(
								S0_T2.itm_cd.eq(S0_ITM.itm_cd)
								.and(S0_T2.itm_sub1.eq(S0_ITM.itm_sub1))
								.and(S0_T2.itm_sub2.eq(S0_ITM.itm_sub2))
								.and(S0_T2.itm_sub3.eq(S0_ITM.itm_sub3))
							)
						)
						.leftOuterJoin(S0_DLV).on(
							bracket(
								S0_T2.dlv_cd.eq(S0_DLV.bp_cd)
							)
						)
						.leftOuterJoin(S0_ITMLCL).on(
							bracket(
								S0_T2.itm_cd.eq(S0_ITMLCL.itm_cd)
								.and(S0_T2.itm_sub1.eq(S0_ITMLCL.itm_sub1))
								.and(S0_T2.itm_sub2.eq(S0_ITMLCL.itm_sub2))
								.and(S0_T2.itm_sub3.eq(S0_ITMLCL.itm_sub3))
								.and(S0_ITMLCL.lcl_cd.eq(S0_DLV.prnt_lcl_cd))
							)
						)
						.leftOuterJoin(S0_TAX).on(
							bracket(
								S0_T2.tax_cd.eq(S0_TAX.tax_cd)
							)
						)
						.leftOuterJoin(S0_LOC).on(
							bracket(
								S0_T2.loc_cd.eq(S0_LOC.loc_cd)
							)
						)
						.leftOuterJoin(S0_LOT).on(
							bracket(
								S0_T2.itm_cd.eq(S0_LOT.itm_cd)
								.and(S0_T2.itm_sub1.eq(S0_LOT.itm_sub1))
								.and(S0_T2.itm_sub2.eq(S0_LOT.itm_sub2))
								.and(S0_T2.itm_sub3.eq(S0_LOT.itm_sub3))
								.and(S0_T2.lot_no.eq(S0_LOT.lot_no))
								.and(S0_T2.sublot_no.eq(S0_LOT.sublot_no))
							)
						)
						.leftOuterJoin(S0_DPT).on(
							bracket(
								S0_T2.bd_dpt_cd.eq(S0_DPT.dpt_cd)
								.and(S0_T1.ac_dt.between(S0_DPT.st_dt, S0_DPT.end_dt))
							)
						)
						.leftOuterJoin(S0_PURC).on(
							bracket(
								S0_T4.purc_dpt_cd.eq(S0_PURC.dpt_cd)
								.and(S0_T1.ac_dt.between(S0_PURC.st_dt, S0_PURC.end_dt))
							)
						)
						.leftOuterJoin(S0_APDPT).on(
							bracket(
								S0_T5.ap_dpt_cd.eq(S0_APDPT.dpt_cd)
								.and(S0_T1.ac_dt.between(S0_APDPT.st_dt, S0_APDPT.end_dt))
							)
						)
						.innerJoin(S0_DAC).on(
							bracket(
								S0_T1.sls_dpt_cd.eq(S0_DAC.dpt_cd)
							)
						)
					)
					.where(
						value(1).eq(value(1))
						.and(S0_T1.sls_act_no.eq(bind("srch_tgt_no")))
						.and(
							S0_T1.trd_ptn_typ.in(
								value(MAC_TRD_PTN_TYP.SLS.value()),
								value(MAC_TRD_PTN_TYP.SLS_CNSGN.value())
							)
						)
						.and(S0_T1.slip_sts_typ.eq(value(MAC_SLIP_STS_TYP.CRT.value())))
					)
					.orderBy(S0_T2.disp_seq.asc())
			)
			.setJoinInfo(
				joinInfo(
					j -> j
						.add(MST_SLS_RET_SCHD_D_R.class, r -> toCondition(
							r.getStringNE("join_sls_ret_schd_d_no_")
						))
						.addSelect(m -> toArray(
							m.io_schd_pr_no,
							m.ref_dlv_slip_d_no
						))
						.addMap((r, m) -> {
							r.setStringNE("io_schd_pr_no", m.io_schd_pr_no());
							r.setStringNE("dlv_slip_d_no", m.ref_dlv_slip_d_no());
					}),
					j -> j
						.add(MAM_CNTRY_R.class, r -> toCondition(
							r.getStringNE("cntry_cd")
						))
						.addSelect(m -> toArray(
							m.cntry_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("cntry_nm", m.cntry_nm());
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
						.add(MAM_USR_R.class, r -> toCondition(
							r.getStringNE("ret_usr_cd")
						))
						.addSelect(m -> toArray(
							m.usr_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("ret_usr_nm", m.usr_nm());
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
					}),
					j -> j
						.add(MAM_BP_R.class, r -> toCondition(
							r.getStringNE("sppl_cd")
						))
						.addSelect(m -> toArray(
							m.bp_nm,
							m.cntry_cd,
							m.sppl_iv_flg,
							m.asppl_cd
						))
						.addMap((r, m) -> {
							r.setStringNE("sppl_nm", m.bp_nm());
							r.setStringNE("sppl_cntry_cd", m.cntry_cd());
							r.setStringNE("ret_nm", m.bp_nm());
							r.setBooleanNE("sppl_iv_flg", m.sppl_iv_flg());
							r.setStringNE("join_asppl_cd_", m.asppl_cd());
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
							r.getStringNE("sppl_cntry_cd")
						))
						.addSelect(m -> toArray(
							m.cntry_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("sppl_cntry_nm", m.cntry_nm());
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
						.add(MAM_STR_LN_R.class, r -> toCondition(
							r.getStringNE("loc_cd"),
							r.getStringNE("str_ln_cd")
						))
						.addSelect(m -> toArray(
							m.str_ln_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("str_ln_nm", m.str_ln_nm());
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
							r.setNumberNE("trd_unit_dec_place", m.dec_place());
							r.setNumberNE("trd_unit_conv_base_qty", m.conv_base_qty());
							r.setNumberNE("trd_unit_conv_qty", m.conv_qty());
							r.setStringNE("trd_unit_rnd_typ", m.rnd_typ());
							r.setNumberNE("schd_trd_unit_conv_base_qty", m.conv_base_qty());
							r.setNumberNE("schd_trd_unit_conv_qty", m.conv_qty());
					})
				)
			);
	}
	
	/**
	 * -- MSBBL1340_SLS_ACT_D_Query_S02
	 */
	static MCQueryPlan MSBBL1340_SLS_ACT_D_S02() {
		MST_SLS_ACT_R S0_T1 = MST_SLS_ACT_R.create("T1");
		MST_SLS_ACT_D_R S0_T2 = MST_SLS_ACT_D_R.create("T2");
		MST_PURC_RET_ACT_D_R S0_T5 = MST_PURC_RET_ACT_D_R.create("T5");
		MST_PURC_RET_ACT_R S0_T3 = MST_PURC_RET_ACT_R.create("T3");
		MST_PURC_ACT_R S0_T4 = MST_PURC_ACT_R.create("T4");
		MST_PURC_ACT_D_R S0_T7 = MST_PURC_ACT_D_R.create("T7");
		MST_SLS_RET_SCHD_D_R S0_T6 = MST_SLS_RET_SCHD_D_R.create("T6");
		MST_SLS_ACT_D_R S0_T8 = MST_SLS_ACT_D_R.create("T8");
		MST_LOT_R S0_T9 = MST_LOT_R.create("T9");
		MST_PURC_ACT_R S0_T10 = MST_PURC_ACT_R.create("T10");
		MST_PURC_ACT_D_R S0_T11 = MST_PURC_ACT_D_R.create("T11");
		MST_PURC_ACT_R S0_T12 = MST_PURC_ACT_R.create("T12");
		MAM_ITM_R S0_ITM = MAM_ITM_R.create("ITM");
		MAM_BP_R S0_DLV = MAM_BP_R.create("DLV");
		MAM_ITM_LCL_R S0_ITMLCL = MAM_ITM_LCL_R.create("ITMLCL");
		MAM_TAX_R S0_STAX = MAM_TAX_R.create("STAX");
		MAM_LOC_R S0_LOC = MAM_LOC_R.create("LOC");
		MSVT_LOT_LIST_R S0_LOT = MSVT_LOT_LIST_R.create("LOT");
		MAVM_ITM_UNIT_R S0_SIU = MAVM_ITM_UNIT_R.create("SIU");
		MAM_DPT_R S0_DPT = MAM_DPT_R.create("DPT");
		MAM_DPT_R S0_PURC = MAM_DPT_R.create("PURC");
		MAM_DPT_R S0_APDPT = MAM_DPT_R.create("APDPT");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBBL1340_SLS_ACT_D_Query_S02")
					.mainQuery()
					.select(
						S0_T2.itm_cd,
						S0_T2.itm_sub1,
						S0_T2.itm_sub2,
						S0_T2.itm_sub3,
						nvl(
							S0_T2.itm_nm,
							S0_ITM.itm_nm
						).as("itm_nm"),
						decode(
							S0_T2.sundry_itm_flg,
							value(true),
							S0_T2.iv_itm_nm,
							S0_ITMLCL.itm_nm
						).as("iv_itm_nm"),
						S0_T2.stk_mng_typ,
						S0_T2.sundry_itm_flg,
						S0_T2.dlv_cd,
						decode(
							S0_T2.dlv_sundry_flg,
							value(true),
							S0_T2.dlv_nm,
							S0_DLV.bp_nm
						).as("dlv_nm"),
						S0_T2.dlv_zip_cd,
						S0_T2.dlv_addr1,
						S0_T2.dlv_addr2,
						S0_T2.dlv_addr3,
						S0_T2.dlv_addr4,
						S0_T2.dlv_cntct_dpt,
						S0_T2.dlv_cntct_psn,
						S0_T2.dlv_tel,
						S0_T2.dlv_fax,
						S0_T2.pri_prnt_flg,
						S0_DLV.cntry_cd,
						S0_DLV.prnt_lcl_cd,
						S0_T2.dest_cd1,
						S0_T2.dest_cd2,
						S0_T2.dest_cd3,
						S0_T2.purc_act_no.as("purc_act_no"),
						S0_T2.purc_act_d_no.as("purc_act_d_no"),
						S0_T3.sppl_cd,
						S0_T3.ret_sppl_nm.as("ret_nm"),
						S0_T3.ret_sppl_zip_cd.as("ret_zip_cd"),
						S0_T3.ret_sppl_addr1.as("ret_addr1"),
						S0_T3.ret_sppl_addr2.as("ret_addr2"),
						S0_T3.ret_sppl_addr3.as("ret_addr3"),
						S0_T3.ret_sppl_addr4.as("ret_addr4"),
						S0_T3.ret_sppl_cntct_dpt.as("ret_cntct_dpt"),
						S0_T3.ret_sppl_cntct_psn.as("ret_cntct_psn"),
						S0_T3.ret_sppl_cntct_psn_title.as("ret_cntct_psn_title"),
						S0_T3.ret_sppl_tel.as("ret_tel"),
						S0_T3.ret_sppl_fax.as("ret_fax"),
						S0_T3.purc_dpt_cd.as("ret_dpt_cd"),
						S0_PURC.dpt_nm.as("ret_dpt_nm"),
						S0_T3.purc_usr_cd.as("ret_usr_cd"),
						S0_T12.pay_schd_dt,
						S0_T2.cntry_org_cd,
						S0_T2.trd_unit_cd,
						S0_T2.trd_unit_qty,
						S0_T2.base_unit_cd,
						S0_T2.base_unit_qty,
						value(0).as("schd_qty"),
						value(0).as("arr_qty"),
						value(0).as("sls_ret_qty"),
						value(0).as("abort_qty"),
						S0_T2.trd_cur_upri,
						S0_T2.upri_not_tgt_flg,
						S0_T2.interim_flg,
						S0_T2.trd_cur_amt,
						bracket(
							S0_T2.trd_cur_amt.add(S0_T2.trd_cur_tax_amt)
						).as("trd_cur_inc_tax_amt"),
						S0_T2.trd_cur_dscnt_amt,
						S0_T2.dscnt_rsn_cd,
						S0_T2.cost_upri,
						S0_T2.cost_amt,
						value(false).as("tax_fix_flg"),
						S0_T2.tax_cd,
						S0_T2.trd_cur_tax_amt,
						S0_T2.base_cur_upri,
						S0_T2.base_cur_amt,
						bracket(
							S0_T2.base_cur_amt.add(S0_T2.base_cur_tax_amt)
						).as("base_cur_inc_tax_amt"),
						S0_T2.base_cur_tax_amt,
						S0_T2.base_cur_dscnt_amt,
						S0_T2.ptax_cur_upri,
						S0_T2.ptax_cur_amt,
						bracket(
							S0_T2.ptax_cur_amt.add(S0_T2.ptax_cur_tax_amt)
						).as("ptax_cur_inc_tax_amt"),
						S0_T2.ptax_cur_tax_amt,
						S0_T2.ptax_cur_dscnt_amt,
						S0_T2.bill_crryovr_times,
						S0_T2.gd_cd,
						S0_T2.loc_cd,
						S0_LOC.loc_nm,
						S0_T2.str_ln_cd,
						cases()
							.when(S0_LOC.str_ln_tgt_flg.eq(value(true)))
								.then(
									cases()
										.when(MAC_STR$IS_NULL_VAL(S0_T2.str_ln_cd).eq(value(true)))
											.then(value(true))
										.otherwise(value(false))
							)
							.otherwise(value(false)).as("str_ln_cd_none_flg"),
						S0_T2.lot_no,
						S0_T2.sublot_no,
						decode(
							S0_ITM.ver_flg,
							value(true),
							S0_T9.ver_no,
							nullValue()
						).as("ver_no"),
						S0_T2.sno1,
						S0_T2.sno2,
						S0_T2.sno3,
						S0_T2.sno4,
						S0_T2.cst_po_d_no,
						S0_T2.cst_itm_cd,
						S0_T2.cst_itm_nm,
						S0_T2.rsn_cd.as("ret_rsn_cd"),
						S0_T2.bd_dpt_cd,
						S0_DPT.dpt_nm.as("bd_dpt_nm"),
						S0_T5.ret_rsn_cd.as("purc_ret_rsn_cd"),
						S0_T2.wtax_rate,
						S0_T2.wtax_amt,
						nvl(
							S0_T6.arr_cnt_rmrks,
							nullValue()
						).as("arr_cnt_rmrks"),
						S0_T2.trd_d_rmrks,
						S0_T2.intr_rmrks,
						S0_T2.sub_char1,
						S0_T2.sub_char2,
						S0_T2.sub_char3,
						S0_T2.sls_act_d_no,
						S0_T2.sls_act_d_seq,
						S0_T2.slo_no,
						S0_T2.slo_d_no,
						S0_T2.ref_sls_act_no,
						S0_T2.ref_sls_act_d_no,
						S0_T2.sls_ret_schd_d_no,
						S0_T2.disp_seq,
						S0_ITM.lot_mng_typ,
						S0_ITM.lot_no_typ,
						S0_ITM.sublot_mng_typ,
						S0_ITM.sublot_no_typ,
						S0_ITM.ver_flg,
						S0_T2.sno1_mng_typ,
						S0_T2.sno2_mng_typ,
						S0_T2.sno3_mng_typ,
						S0_T2.sno4_mng_typ,
						S0_ITM.dec_place.as("base_unit_dec_place"),
						S0_ITM.rnd_typ.as("base_unit_rnd_typ"),
						S0_LOC.str_ln_tgt_flg,
						S0_LOC.site_cd,
						S0_T2.ref_sls_act_seq,
						S0_T2.ref_sls_act_d_seq,
						S0_T2.sls_ret_schd_no,
						nullValue().as("arr_pr_no"),
						S0_T6.io_schd_pr_no,
						S0_T2.dlv_sundry_flg,
						S0_ITM.comp_spec_typ,
						S0_ITM.dscnt_itm_flg,
						S0_ITM.sls_upri_cng_flg.as("itm_sls_upri_cng_flg"),
						S0_ITM.bill_crryovr_times.as("itm_bill_crryovr_times"),
						S0_T6.ref_dlv_slip_d_no.as("dlv_slip_d_no"),
						S0_T5.purc_ret_act_d_no,
						S0_T5.purc_ret_act_no,
						S0_T5.purc_ret_act_rev,
						S0_T4.purc_act_no,
						S0_T4.purc_act_rev,
						S0_T7.ap_dpt_cd,
						S0_APDPT.dpt_nm.as("ap_dpt_nm"),
						nvl2(
							S0_T2.sls_ret_schd_no,
							S0_T6.base_unit_qty,
							S0_T8.base_unit_qty
						).as("init_schd_qty"),
						nvl2(
							S0_T2.sls_ret_schd_no,
							S0_T6.trd_cur_dscnt_amt,
							S0_T8.trd_cur_dscnt_amt
						).as("init_schd_dscnt_amt"),
						decode(
							S0_STAX.inc_tax_flg,
							value(false),
							nvl2(
								S0_T2.sls_ret_schd_no,
								S0_T6.trd_cur_amt,
								S0_T8.trd_cur_amt
							),
							nvl2(
								S0_T2.sls_ret_schd_no,
								S0_T6.trd_cur_amt,
								S0_T8.trd_cur_amt
							).add(
								nvl2(
									S0_T2.sls_ret_schd_no,
									S0_T6.trd_cur_tax_amt,
									S0_T8.trd_cur_tax_amt
								)
							)
						).as("init_schd_amt"),
						S0_SIU.conv_base_qty.as("schd_trd_unit_conv_base_qty"),
						S0_SIU.conv_qty.as("schd_trd_unit_conv_qty"),
						S0_T2.sls_ret_schd_d_no.as("schd_no"),
						S0_T2.sls_dtl_upd_flg,
						S0_T6.trd_cur_tax_amt.as("init_trd_cur_tax_amt"),
						S0_T6.trd_unit_cd.as("init_trd_unit_cd"),
						S0_T6.trd_unit_qty.as("init_trd_unit_qty"),
						S0_T6.trd_cur_upri.as("init_trd_cur_upri"),
						S0_T6.trd_cur_dscnt_amt.as("init_trd_cur_dscnt_amt"),
						S0_STAX.inc_tax_flg.as("init_inc_tax_flg"),
						S0_STAX.tax_rate.as("init_tax_rate"),
						S0_T2.purc_ddlv_po_no,
						S0_T2.base_sls_ac_dt,
						S0_T11.base_purc_ac_dt
					)
					.from(
						S0_T1
						.innerJoin(S0_T2).on(
							bracket(
								S0_T2.sls_act_no.eq(S0_T1.sls_act_no)
								.and(S0_T2.sls_act_seq.eq(S0_T1.sls_act_seq))
							)
						)
						.leftOuterJoin(S0_T5).on(
							bracket(
								S0_T2.sls_act_d_no.eq(S0_T5.sls_act_d_no)
								.and(S0_T5.can_flg.eq(value(false)))
							)
						)
						.leftOuterJoin(S0_T3).on(
							bracket(
								S0_T5.purc_ret_act_no.eq(S0_T3.purc_ret_act_no)
								.and(S0_T5.purc_ret_act_rev.eq(S0_T3.purc_ret_act_rev))
								.and(S0_T3.can_flg.eq(value(false)))
							)
						)
						.leftOuterJoin(S0_T4).on(
							bracket(
								S0_T2.purc_act_no.eq(S0_T4.purc_act_no)
								.and(S0_T4.slip_sts_typ.eq(value(MAC_SLIP_STS_TYP.CRT.value())))
							)
						)
						.leftOuterJoin(S0_T7).on(
							bracket(
								S0_T4.purc_act_no.eq(S0_T7.purc_act_no)
								.and(S0_T4.purc_act_seq.eq(S0_T7.purc_act_seq))
								.and(S0_T2.purc_act_d_no.eq(S0_T7.purc_act_d_no))
							)
						)
						.leftOuterJoin(S0_T6).on(
							bracket(
								S0_T2.sls_ret_schd_d_no.eq(S0_T6.sls_ret_schd_d_no)
							)
						)
						.leftOuterJoin(S0_T8).on(
							bracket(
								S0_T2.ref_sls_act_d_no.eq(S0_T8.sls_act_d_no)
								.and(S0_T2.ref_sls_act_d_seq.eq(S0_T8.sls_act_d_seq))
							)
						)
						.leftOuterJoin(S0_T9).on(
							bracket(
								S0_T2.itm_cd.eq(S0_T9.itm_cd)
								.and(S0_T2.itm_sub1.eq(S0_T9.itm_sub1))
								.and(S0_T2.itm_sub2.eq(S0_T9.itm_sub2))
								.and(S0_T2.itm_sub3.eq(S0_T9.itm_sub3))
								.and(S0_T2.lot_no.eq(S0_T9.lot_no))
								.and(S0_T2.sublot_no.eq(S0_T9.sublot_no))
							)
						)
						.leftOuterJoin(S0_T10).on(
							bracket(
								S0_T5.purc_ret_act_no.eq(S0_T10.purc_ret_act_no)
								.and(S0_T10.slip_sts_typ.eq(value(MAC_SLIP_STS_TYP.CRT.value())))
							)
						)
						.leftOuterJoin(S0_T11).on(
							bracket(
								S0_T10.purc_act_no.eq(S0_T11.purc_act_no)
								.and(S0_T10.purc_act_seq.eq(S0_T11.purc_act_seq))
								.and(S0_T5.purc_ret_act_d_no.eq(S0_T11.purc_ret_act_d_no))
							)
						)
						.leftOuterJoin(S0_T12).on(
								bracket(
									S0_T3.purc_ret_act_no.eq(S0_T12.purc_ret_act_no)
									.and(S0_T3.purc_ret_act_rev.eq(S0_T12.purc_ret_act_rev))
									.and(S0_T12.slip_sts_typ.eq(value(MAC_SLIP_STS_TYP.CRT.value())))
								)
							)
						.leftOuterJoin(S0_ITM).on(
							bracket(
								S0_T2.itm_cd.eq(S0_ITM.itm_cd)
								.and(S0_T2.itm_sub1.eq(S0_ITM.itm_sub1))
								.and(S0_T2.itm_sub2.eq(S0_ITM.itm_sub2))
								.and(S0_T2.itm_sub3.eq(S0_ITM.itm_sub3))
							)
						)
						.leftOuterJoin(S0_DLV).on(
							bracket(
								S0_T2.dlv_cd.eq(S0_DLV.bp_cd)
							)
						)
						.leftOuterJoin(S0_ITMLCL).on(
							bracket(
								S0_T2.itm_cd.eq(S0_ITMLCL.itm_cd)
								.and(S0_T2.itm_sub1.eq(S0_ITMLCL.itm_sub1))
								.and(S0_T2.itm_sub2.eq(S0_ITMLCL.itm_sub2))
								.and(S0_T2.itm_sub3.eq(S0_ITMLCL.itm_sub3))
								.and(S0_ITMLCL.lcl_cd.eq(S0_DLV.prnt_lcl_cd))
							)
						)
						.leftOuterJoin(S0_STAX).on(
							bracket(
								nvl2(
									S0_T2.sls_ret_schd_no,
									S0_T6.tax_cd,
									S0_T8.tax_cd
								).eq(S0_STAX.tax_cd)
							)
						)
						.leftOuterJoin(S0_LOC).on(
							bracket(
								S0_T2.loc_cd.eq(S0_LOC.loc_cd)
							)
						)
						.leftOuterJoin(S0_LOT).on(
							bracket(
								S0_T2.itm_cd.eq(S0_LOT.itm_cd)
								.and(S0_T2.itm_sub1.eq(S0_LOT.itm_sub1))
								.and(S0_T2.itm_sub2.eq(S0_LOT.itm_sub2))
								.and(S0_T2.itm_sub3.eq(S0_LOT.itm_sub3))
								.and(S0_T2.lot_no.eq(S0_LOT.lot_no))
								.and(S0_T2.sublot_no.eq(S0_LOT.sublot_no))
							)
						)
						.leftOuterJoin(S0_SIU).on(
							bracket(
								nvl2(
									S0_T2.sls_ret_schd_no,
									S0_T6.trd_unit_cd,
									S0_T8.trd_unit_cd
								).eq(S0_SIU.unit_cd)
								.and(S0_T2.itm_cd.eq(S0_SIU.itm_cd))
								.and(S0_T2.itm_sub1.eq(S0_SIU.itm_sub1))
								.and(S0_T2.itm_sub2.eq(S0_SIU.itm_sub2))
								.and(S0_T2.itm_sub3.eq(S0_SIU.itm_sub3))
							)
						)
						.leftOuterJoin(S0_DPT).on(
							bracket(
								S0_T2.bd_dpt_cd.eq(S0_DPT.dpt_cd)
								.and(S0_T1.ac_dt.between(S0_DPT.st_dt, S0_DPT.end_dt))
							)
						)
						.leftOuterJoin(S0_PURC).on(
							bracket(
								S0_T3.purc_dpt_cd.eq(S0_PURC.dpt_cd)
								.and(S0_T1.ac_dt.between(S0_PURC.st_dt, S0_PURC.end_dt))
							)
						)
						.leftOuterJoin(S0_APDPT).on(
							bracket(
								S0_T7.ap_dpt_cd.eq(S0_APDPT.dpt_cd)
								.and(S0_T1.ac_dt.between(S0_APDPT.st_dt, S0_APDPT.end_dt))
							)
						)
					)
					.where(
						value(1).eq(value(1))
						.and(S0_T1.sls_act_no.eq(bind("sls_act_no")))
						.and(S0_T1.sls_act_seq.eq(bind("sls_act_seq")))
					)
					.orderBy(S0_T2.disp_seq.asc())
			)
			.setJoinInfo(
				joinInfo(
					j -> j
						.add(MAM_CNTRY_R.class, r -> toCondition(
							r.getStringNE("cntry_cd")
						))
						.addSelect(m -> toArray(
							m.cntry_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("cntry_nm", m.cntry_nm());
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
						.add(MAM_USR_R.class, r -> toCondition(
							r.getStringNE("ret_usr_cd")
						))
						.addSelect(m -> toArray(
							m.usr_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("ret_usr_nm", m.usr_nm());
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
					}),
					j -> j
						.add(MAM_BP_R.class, r -> toCondition(
							r.getStringNE("sppl_cd")
						))
						.addSelect(m -> toArray(
							m.bp_nm,
							m.cntry_cd,
							m.sppl_iv_flg,
							m.asppl_cd
						))
						.addMap((r, m) -> {
							r.setStringNE("sppl_nm", m.bp_nm());
							r.setStringNE("sppl_cntry_cd", m.cntry_cd());
							r.setBooleanNE("sppl_iv_flg", m.sppl_iv_flg());
							r.setStringNE("join_asppl_cd_", m.asppl_cd());
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
							r.getStringNE("sppl_cntry_cd")
						))
						.addSelect(m -> toArray(
							m.cntry_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("sppl_cntry_nm", m.cntry_nm());
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
						.add(MAM_BIZ_RSN_R.class, r -> toCondition(
							r.getStringNE("ret_rsn_cd")
						))
						.addSelect(m -> toArray(
							m.biz_rsn_nm,
							m.sls_acxfr_flg
						))
						.addMap((r, m) -> {
							r.setStringNE("ret_rsn_nm", m.biz_rsn_nm());
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
						.add(MAM_BIZ_RSN_R.class, r -> toCondition(
							r.getStringNE("purc_ret_rsn_cd")
						))
						.addSelect(m -> toArray(
							m.biz_rsn_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("purc_ret_rsn_nm", m.biz_rsn_nm());
					}),
					j -> j
						.add(MAM_TAX_R.class, r -> toCondition(
							r.getStringNE("tax_cd")
						))
						.addSelect(m -> toArray(
							m.inc_tax_flg,
							m.tax_nm,
							m.tax_rate,
							m.tax_typ
						))
						.addMap((r, m) -> {
							r.setStringNE("tax_nm", m.tax_nm());
							r.setNumberNE("tax_rate", m.tax_rate());
							r.setBooleanNE("inc_tax_flg", m.inc_tax_flg());
							r.setStringNE("tax_typ", m.tax_typ());
							r.setBooleanNE("inc_tax_flg", m.inc_tax_flg());
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
						.add(MAM_STR_LN_R.class, r -> toCondition(
							r.getStringNE("loc_cd"),
							r.getStringNE("str_ln_cd")
						))
						.addSelect(m -> toArray(
							m.str_ln_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("str_ln_nm", m.str_ln_nm());
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
							r.setNumberNE("trd_unit_dec_place", m.dec_place());
							r.setNumberNE("trd_unit_conv_base_qty", m.conv_base_qty());
							r.setNumberNE("trd_unit_conv_qty", m.conv_qty());
							r.setStringNE("trd_unit_rnd_typ", m.rnd_typ());
					})
				)
			);
	}
	
	/**
	 * -- MSBBL1340_SLS_ACT_IO_Query_S01
	 */
	static MCQueryPlan MSBBL1340_SLS_ACT_IO_S01() {
		MST_SLS_ACT_R S0_T1 = MST_SLS_ACT_R.create("T1");
		MST_SLS_ACT_D_R S0_T2 = MST_SLS_ACT_D_R.create("T2");
		MST_SLS_ACT_IO_R S0_T3 = MST_SLS_ACT_IO_R.create("T3");
		MST_LOT_R S0_T4 = MST_LOT_R.create("T4");
		MAM_ITM_R S0_ITM = MAM_ITM_R.create("ITM");
		MAM_LOC_R S0_LOC = MAM_LOC_R.create("LOC");
		MAM_STR_LN_R S0_LN = MAM_STR_LN_R.create("LN");
		MAVM_RD_DPT_R S0_DAC = MAVM_RD_DPT_R.create("DAC");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBBL1340_SLS_ACT_IO_Query_S01")
					.mainQuery()
					.select(
						value(false).as("abort_flg"),
						value(true).as("sync_flg"),
						S0_T3.trd_unit_cd,
						S0_T3.trd_unit_qty,
						S0_T3.base_unit_cd,
						S0_T3.base_unit_qty,
						nullValue().as("schd_qty"),
						nullValue().as("arr_qty"),
						S0_T3.gd_cd,
						S0_T3.loc_cd,
						S0_LOC.loc_nm,
						S0_T3.str_ln_cd,
						S0_LN.str_ln_nm,
						cases()
							.when(S0_LOC.str_ln_tgt_flg.eq(value(true)))
								.then(
									cases()
										.when(MAC_STR$IS_NULL_VAL(S0_LN.str_ln_nm).eq(value(true)))
											.then(value(true))
										.otherwise(value(false))
							)
							.otherwise(value(false)).as("str_ln_cd_none_flg"),
						S0_T3.lot_no,
						S0_T3.sublot_no,
						decode(
							S0_ITM.ver_flg,
							value(true),
							S0_T4.ver_no,
							nullValue()
						).as("ver_no"),
						S0_T3.sno1,
						S0_T3.sno2,
						S0_T3.sno3,
						S0_T3.sno4,
						S0_ITM.dec_place.as("base_unit_dec_place"),
						S0_ITM.rnd_typ.as("base_unit_rnd_typ"),
						S0_ITM.lot_mng_typ,
						S0_ITM.lot_no_typ,
						S0_ITM.sublot_mng_typ,
						S0_ITM.sublot_no_typ,
						S0_ITM.ver_flg,
						S0_ITM.sno1_mng_typ,
						S0_ITM.sno2_mng_typ,
						S0_ITM.sno3_mng_typ,
						S0_ITM.sno4_mng_typ,
						S0_ITM.sno4_mng_typ,
						S0_ITM.stk_mng_typ,
						S0_T2.itm_cd,
						S0_T2.itm_sub1,
						S0_T2.itm_sub2,
						S0_T2.itm_sub3,
						S0_LOC.str_ln_tgt_flg,
						S0_LOC.site_cd,
						S0_T2.sls_act_d_no.as("ref_sls_act_d_no"),
						S0_T3.purc_act_io_no,
						S0_T3.sls_act_io_no.as("ref_sls_act_io_no"),
						S0_T3.sls_act_io_seq.as("ref_sls_act_io_seq")
					)
					.from(
						S0_T1
						.innerJoin(S0_T2).on(
							bracket(
								S0_T1.sls_act_no.eq(S0_T2.sls_act_no)
								.and(S0_T2.sls_act_seq.eq(S0_T1.sls_act_seq))
							)
						)
						.innerJoin(S0_T3).on(
							bracket(
								S0_T2.sls_act_d_no.eq(S0_T3.sls_act_d_no)
								.and(S0_T2.sls_act_d_seq.eq(S0_T3.sls_act_d_seq))
							)
						)
						.leftOuterJoin(S0_T4).on(
							bracket(
								S0_T2.itm_cd.eq(S0_T4.itm_cd)
								.and(S0_T2.itm_sub1.eq(S0_T4.itm_sub1))
								.and(S0_T2.itm_sub2.eq(S0_T4.itm_sub2))
								.and(S0_T2.itm_sub3.eq(S0_T4.itm_sub3))
								.and(S0_T3.lot_no.eq(S0_T4.lot_no))
								.and(S0_T3.sublot_no.eq(S0_T4.sublot_no))
							)
						)
						.leftOuterJoin(S0_ITM).on(
							bracket(
								S0_T2.itm_cd.eq(S0_ITM.itm_cd)
								.and(S0_T2.itm_sub1.eq(S0_ITM.itm_sub1))
								.and(S0_T2.itm_sub2.eq(S0_ITM.itm_sub2))
								.and(S0_T2.itm_sub3.eq(S0_ITM.itm_sub3))
							)
						)
						.leftOuterJoin(S0_LOC).on(
							bracket(
								S0_T3.loc_cd.eq(S0_LOC.loc_cd)
							)
						)
						.leftOuterJoin(S0_LN).on(
							bracket(
								S0_T3.str_ln_cd.eq(S0_LN.str_ln_cd)
								.and(S0_T3.loc_cd.eq(S0_LN.loc_cd))
							)
						)
						.innerJoin(S0_DAC).on(
							bracket(
								S0_T1.sls_dpt_cd.eq(S0_DAC.dpt_cd)
							)
						)
					)
					.where(
						value(1).eq(value(1))
						.and(S0_T1.sls_act_no.eq(bind("srch_tgt_no")))
						.and(
							S0_T1.trd_ptn_typ.in(
								value(MAC_TRD_PTN_TYP.SLS.value()),
								value(MAC_TRD_PTN_TYP.SLS_CNSGN.value())
							)
						)
						.and(S0_T1.slip_sts_typ.eq(value(MAC_SLIP_STS_TYP.CRT.value())))
					)
					.orderBy(
						S0_T2.sls_act_d_no.asc(),
						S0_T3.sls_act_io_no.asc()
					)
			)
			.setJoinInfo(
				joinInfo(
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
							r.setNumberNE("trd_unit_dec_place", m.dec_place());
							r.setStringNE("trd_unit_rnd_typ", m.rnd_typ());
							r.setNumberNE("trd_unit_conv_base_qty", m.conv_base_qty());
							r.setNumberNE("trd_unit_conv_qty", m.conv_qty());
							r.setStringNE("trd_unit_rnd_typ", m.rnd_typ());
					})
				)
			);
	}
	
	/**
	 * -- MSBBL1340_SLS_ACT_IO_Query_S02
	 */
	static MCQueryPlan MSBBL1340_SLS_ACT_IO_S02() {
		MST_SLS_ACT_R S0_T1 = MST_SLS_ACT_R.create("T1");
		MST_SLS_ACT_D_R S0_T2 = MST_SLS_ACT_D_R.create("T2");
		MST_SLS_ACT_IO_R S0_T3 = MST_SLS_ACT_IO_R.create("T3");
		MST_ARR_ACT_R S0_T4 = MST_ARR_ACT_R.create("T4");
		MST_ARR_SCHD_R S0_T5 = MST_ARR_SCHD_R.create("T5");
		MST_LOT_R S0_T6 = MST_LOT_R.create("T6");
		MST_ARR_PR_R S0_PR = MST_ARR_PR_R.create("PR");
		MAM_ITM_R S0_ITM = MAM_ITM_R.create("ITM");
		MAM_LOC_R S0_LOC = MAM_LOC_R.create("LOC");
		MAM_STR_LN_R S0_LN = MAM_STR_LN_R.create("LN");
		MST_PURC_RET_ACT_IO_R S0_PRET = MST_PURC_RET_ACT_IO_R.create("PRET");
		MST_PURC_RET_ACT_D_R S0_PRETD = MST_PURC_RET_ACT_D_R.create("PRETD");
		MAVM_RD_DPT_R S0_DAC = MAVM_RD_DPT_R.create("DAC");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBBL1340_SLS_ACT_IO_Query_S02")
					.mainQuery()
					.select(
						cases()
							.when(S0_T2.sls_ret_schd_d_no.isNull())
								.then(value(false))
							.otherwise(S0_T5.sls_ret_schd_abort_flg).as("abort_flg"),
						S0_T3.sync_flg,
						S0_T3.trd_unit_cd,
						S0_T3.trd_unit_qty,
						S0_T3.base_unit_cd,
						S0_T3.base_unit_qty,
						nullValue().as("schd_qty"),
						S0_T4.base_unit_qty.as("arr_qty"),
						S0_T3.gd_cd,
						S0_T3.loc_cd.as("loc_cd"),
						S0_LOC.loc_nm,
						S0_T3.str_ln_cd,
						S0_LN.str_ln_nm,
						cases()
							.when(S0_LOC.str_ln_tgt_flg.eq(value(true)))
								.then(
									cases()
										.when(MAC_STR$IS_NULL_VAL(S0_LN.str_ln_nm).eq(value(true)))
											.then(value(true))
										.otherwise(value(false))
							)
							.otherwise(value(false)).as("str_ln_cd_none_flg"),
						S0_T3.lot_no,
						S0_T3.sublot_no,
						decode(
							S0_ITM.ver_flg,
							value(true),
							S0_T6.ver_no,
							nullValue()
						).as("ver_no"),
						S0_T3.sno1,
						S0_T3.sno2,
						S0_T3.sno3,
						S0_T3.sno4,
						S0_T3.arr_act_no,
						S0_T3.purc_act_io_no,
						S0_T3.sls_act_io_no,
						S0_T3.sls_act_io_seq,
						S0_T2.sls_act_d_no,
						S0_T3.sub_char1,
						S0_T3.sub_char2,
						S0_T3.sub_char3,
						S0_T4.upd_cntr.as("arr_act_upd_cntr"),
						S0_ITM.dec_place.as("base_unit_dec_place"),
						S0_ITM.rnd_typ.as("base_unit_rnd_typ"),
						S0_ITM.lot_mng_typ,
						S0_ITM.lot_no_typ,
						S0_ITM.sublot_mng_typ,
						S0_ITM.sublot_no_typ,
						S0_ITM.ver_flg,
						S0_ITM.sno1_mng_typ,
						S0_ITM.sno2_mng_typ,
						S0_ITM.sno3_mng_typ,
						S0_ITM.sno4_mng_typ,
						S0_T2.itm_cd,
						S0_T2.itm_sub1,
						S0_T2.itm_sub2,
						S0_T2.itm_sub3,
						S0_ITM.stk_mng_typ,
						S0_LOC.str_ln_tgt_flg,
						S0_LOC.site_cd,
						S0_PRET.purc_ret_act_io_no,
						S0_PRET.purc_ret_act_d_no,
						S0_PRET.purc_ret_act_rev,
						S0_PRETD.purc_ret_act_no,
						S0_T5.arr_pr_no,
						S0_T5.arr_schd_no,
						S0_PR.upd_cntr.as("arr_pr_upd_cntr")
					)
					.from(
						S0_T1
						.innerJoin(S0_T2).on(
							bracket(
								S0_T2.sls_act_no.eq(S0_T1.sls_act_no)
								.and(S0_T2.sls_act_seq.eq(S0_T1.sls_act_seq))
							)
						)
						.innerJoin(S0_T3).on(
							bracket(
								S0_T2.sls_act_d_no.eq(S0_T3.sls_act_d_no)
								.and(S0_T2.sls_act_d_seq.eq(S0_T3.sls_act_d_seq))
							)
						)
						.leftOuterJoin(S0_T4).on(
							bracket(
								S0_T3.arr_act_no.eq(S0_T4.arr_act_no)
							)
						)
						.leftOuterJoin(S0_T5).on(
							bracket(
								S0_T4.arr_schd_no.eq(S0_T5.arr_schd_no)
							)
						)
						.leftOuterJoin(S0_T6).on(
							bracket(
								S0_T2.itm_cd.eq(S0_T6.itm_cd)
								.and(S0_T2.itm_sub1.eq(S0_T6.itm_sub1))
								.and(S0_T2.itm_sub2.eq(S0_T6.itm_sub2))
								.and(S0_T2.itm_sub3.eq(S0_T6.itm_sub3))
								.and(S0_T3.lot_no.eq(S0_T6.lot_no))
								.and(S0_T3.sublot_no.eq(S0_T6.sublot_no))
							)
						)
						.leftOuterJoin(S0_PR).on(
							bracket(
								S0_T5.arr_pr_no.eq(S0_PR.arr_pr_no)
							)
						)
						.leftOuterJoin(S0_ITM).on(
							bracket(
								S0_T2.itm_cd.eq(S0_ITM.itm_cd)
								.and(S0_T2.itm_sub1.eq(S0_ITM.itm_sub1))
								.and(S0_T2.itm_sub2.eq(S0_ITM.itm_sub2))
								.and(S0_T2.itm_sub3.eq(S0_ITM.itm_sub3))
							)
						)
						.leftOuterJoin(S0_LOC).on(
							bracket(
								S0_T3.loc_cd.eq(S0_LOC.loc_cd)
							)
						)
						.leftOuterJoin(S0_LN).on(
							bracket(
								S0_T3.str_ln_cd.eq(S0_LN.str_ln_cd)
								.and(S0_T3.loc_cd.eq(S0_LN.loc_cd))
							)
						)
						.leftOuterJoin(S0_PRET).on(
							bracket(
								S0_T3.sls_act_io_no.eq(S0_PRET.sls_act_io_no)
								.and(S0_PRET.can_flg.eq(value(false)))
							)
						)
						.leftOuterJoin(S0_PRETD).on(
							bracket(
								S0_PRET.purc_ret_act_d_no.eq(S0_PRETD.purc_ret_act_d_no)
								.and(S0_PRET.purc_ret_act_rev.eq(S0_PRETD.purc_ret_act_rev))
							)
						)
						.innerJoin(S0_DAC).on(
							bracket(
								S0_T1.sls_dpt_cd.eq(S0_DAC.dpt_cd)
							)
						)
					)
					.where(
						value(1).eq(value(1))
						.and(S0_T1.sls_act_no.eq(bind("sls_act_no")))
						.and(S0_T1.sls_act_seq.eq(bind("sls_act_seq")))
					)
					.orderBy(
						S0_T2.disp_seq.asc(),
						S0_T3.sls_act_io_no.asc()
					)
			)
			.setJoinInfo(
				joinInfo(
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
							r.setNumberNE("trd_unit_dec_place", m.dec_place());
							r.setStringNE("trd_unit_rnd_typ", m.rnd_typ());
							r.setNumberNE("trd_unit_conv_base_qty", m.conv_base_qty());
							r.setNumberNE("trd_unit_conv_qty", m.conv_qty());
							r.setStringNE("trd_unit_rnd_typ", m.rnd_typ());
					})
				)
			);
	}
	
	/**
	 * -- MSBBL1340_SLS_ACT_Query_S01
	 */
	static MCQueryPlan MSBBL1340_SLS_ACT_S01() {
		MST_SLS_ACT_R S0_T = MST_SLS_ACT_R.create("T");
		MAM_CO_R S0_CO = MAM_CO_R.create("CO");
		MAM_DPT_R S0_DPT = MAM_DPT_R.create("DPT");
		MAM_DPT_R S0_ARDPT = MAM_DPT_R.create("ARDPT");
		MAVM_RD_DPT_R S0_DAC = MAVM_RD_DPT_R.create("DAC");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBBL1340_SLS_ACT_Query_S01")
					.mainQuery()
					.select(
						S0_T.sls_dt.as("sls_ret_dt"),
						S0_T.ac_dt,
						S0_T.bill_basis_dt.as("bill_basis_dt"),
						S0_T.ac_dt.as("del_ac_dt"),
						S0_T.cst_cd,
						S0_T.sls_usr_cd,
						S0_T.sls_dpt_cd,
						S0_DPT.dpt_nm.as("sls_dpt_nm"),
						S0_T.sls_usr_cd.as("cst_usr_cd"),
						S0_T.sls_dpt_cd.as("cst_dpt_cd"),
						S0_T.wg_cd,
						S0_T.iv_no.as("ref_iv_no"),
						S0_T.trd_cur_cd,
						S0_T.base_cur_cd,
						S0_T.xrate,
						S0_T.ptax_cur_cd,
						S0_T.ptax_xrate,
						S0_T.cst_po_no,
						S0_T.acst_cd.as("acst_cd"),
						S0_T.ar_dpt_cd,
						S0_ARDPT.dpt_nm.as("ar_dpt_nm"),
						S0_T.tterm_cd1,
						S0_T.tterm_rmrks1,
						S0_T.tterm_cd2,
						S0_T.tterm_rmrks2,
						S0_T.tterm_cd3,
						S0_T.tterm_rmrks3,
						S0_CO.xrate_rnd_typ,
						S0_CO.wtax_rnd_typ
					)
					.from(
						S0_T
						.crossJoin(S0_CO)
						.leftOuterJoin(S0_DPT).on(
							bracket(
								S0_T.sls_dpt_cd.eq(S0_DPT.dpt_cd)
								.and(bind("today").between(S0_DPT.st_dt, S0_DPT.end_dt))
							)
						)
						.leftOuterJoin(S0_ARDPT).on(
							bracket(
								S0_T.ar_dpt_cd.eq(S0_ARDPT.dpt_cd)
								.and(bind("today").between(S0_ARDPT.st_dt, S0_ARDPT.end_dt))
							)
						)
						.innerJoin(S0_DAC).on(
							bracket(
								S0_T.sls_dpt_cd.eq(S0_DAC.dpt_cd)
							)
						)
					)
					.where(
						value(1).eq(value(1))
						.and(S0_T.sls_act_no.eq(bind("srch_tgt_no")))
						.and(
							S0_T.trd_ptn_typ.in(
								value(MAC_TRD_PTN_TYP.SLS.value()),
								value(MAC_TRD_PTN_TYP.SLS_CNSGN.value())
							)
						)
						.and(S0_T.slip_sts_typ.eq(value(MAC_SLIP_STS_TYP.CRT.value())))
					)
			)
			.setJoinInfo(
				joinInfo(
					j -> j
						.add(MAM_BP_R.class, r -> toCondition(
							r.getStringNE("cst_cd")
						))
						.addSelect(m -> toArray(
							m.ar_dpt_typ,
							m.bill_crryovr_times,
							m.bp_nm,
							m.cst_iv_flg,
							m.sls_amt_rnd_typ,
							m.sls_tax_rnd_typ,
							m.sls_upri_cng_flg,
							m.sls_upri_rnd_typ
						))
						.addMap((r, m) -> {
							r.setStringNE("cst_nm", m.bp_nm());
							r.setBooleanNE("cst_iv_flg", m.cst_iv_flg());
							r.setStringNE("sls_amt_rnd_typ", m.sls_amt_rnd_typ());
							r.setStringNE("sls_upri_rnd_typ", m.sls_upri_rnd_typ());
							r.setStringNE("sls_tax_rnd_typ", m.sls_tax_rnd_typ());
							r.setStringNE("ar_dpt_typ", m.ar_dpt_typ());
							r.setNumberNE("cst_bill_crryovr_times", m.bill_crryovr_times());
							r.setBooleanNE("sls_upri_cng_flg", m.sls_upri_cng_flg());
					}),
					j -> j
						.add(MAM_BP_R.class, r -> toCondition(
							r.getStringNE("acst_cd")
						))
						.addSelect(m -> toArray(
							m.bcst_cd,
							m.bp_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("acst_nm", m.bp_nm());
							r.setStringNE("join_bcst_cd_", m.bcst_cd());
					}),
					j -> j
						.add(MAM_BP_R.class, r -> toCondition(
							r.getStringNE("join_bcst_cd_")
						))
						.addSelect(m -> toArray(
							m.bill_cl_typ
						))
						.addMap((r, m) -> {
							r.setStringNE("bill_cl_typ", m.bill_cl_typ());
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
							r.setNumberNE("trd_cur_amt_dec_place", m.amt_dec_place());
							r.setNumberNE("trd_cur_upri_dec_place", m.upri_dec_place());
					}),
					j -> j
						.add(MAM_CUR_R.class, r -> toCondition(
							r.getStringNE("base_cur_cd")
						))
						.addSelect(m -> toArray(
							m.amt_dec_place,
							m.cur_nm,
							m.upri_dec_place
						))
						.addMap((r, m) -> {
							r.setStringNE("base_cur_nm", m.cur_nm());
							r.setNumberNE("base_cur_amt_dec_place", m.amt_dec_place());
							r.setNumberNE("base_cur_upri_dec_place", m.upri_dec_place());
					}),
					j -> j
						.add(MAM_CUR_R.class, r -> toCondition(
							r.getStringNE("ptax_cur_cd")
						))
						.addSelect(m -> toArray(
							m.amt_dec_place,
							m.cur_nm,
							m.upri_dec_place
						))
						.addMap((r, m) -> {
							r.setStringNE("ptax_cur_nm", m.cur_nm());
							r.setNumberNE("ptax_cur_amt_dec_place", m.amt_dec_place());
							r.setNumberNE("ptax_cur_upri_dec_place", m.upri_dec_place());
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
					})
				)
			);
	}
	
	/**
	 * -- MSBBL1340_SLS_ACT_Query_S02
	 */
	static MCQueryPlan MSBBL1340_SLS_ACT_S02() {
		MST_SLS_ACT_R S0_T = MST_SLS_ACT_R.create("T");
		MAM_CO_R S0_CO = MAM_CO_R.create("CO");
		MAM_DPT_R S0_DPT = MAM_DPT_R.create("DPT");
		MAM_DPT_R S0_ARDPT = MAM_DPT_R.create("ARDPT");
		MCTempView S0_T1 = createTempView("T1");
		MAVM_RD_DPT_R S0_DAC = MAVM_RD_DPT_R.create("DAC");
		MST_DLV_SLIP_R S1_X = MST_DLV_SLIP_R.create("X");
		MST_SLS_ACT_R S5 = MST_SLS_ACT_R.create();
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBBL1340_SLS_ACT_Query_S02")
					.mainQuery()
					.select(
						S0_T.trd_cd,
						S0_T.ac_ym,
						S0_T.sls_act_no,
						S0_T.sls_act_rev,
						S0_T.sls_act_seq,
						S0_T.dlv_slip_no,
						S0_T.sls_dt.as("sls_ret_dt"),
						S0_T.ac_dt,
						S0_T.bill_basis_dt.as("bill_basis_dt"),
						S0_T.ac_dt.as("del_ac_dt"),
						S0_T.sls_ret_schd_no,
						S0_T.cst_cd,
						S0_T.sls_usr_cd,
						S0_T.sls_dpt_cd,
						S0_DPT.dpt_nm.as("sls_dpt_nm"),
						S0_T.sls_usr_cd.as("cst_usr_cd"),
						S0_T.sls_dpt_cd.as("cst_dpt_cd"),
						S0_T.wg_cd,
						S0_T.iv_no,
						value(false).as("num_flg"),
						S0_T.ref_iv_no,
						S0_T.rcv_schd_dt,
						S0_T.trd_cur_cd,
						S0_T.base_cur_cd,
						S0_T.xrate,
						S0_T.ptax_cur_cd,
						S0_T.ptax_xrate,
						S0_T.cst_po_no,
						cases()
							.when(
								exists(
									subQuery()
									.select(value("X"))
									.from(S1_X)
									.where(
										S1_X.dlv_slip_no.eq(S0_T.dlv_slip_no)
										.and(
											S1_X.dlv_slip_seq.eq(
												S0_T.dlv_slip_seq.add(
													decode(
														S0_T.sls_act_rev,
														S0_T1.pr("max_rev"),
														decode(
															S0_T.slip_sts_typ,
															value(MAC_SLIP_STS_TYP.DIS.value()),
															value(1),
															value(0)
														),
														value(0)
													)
												)
											)
										)
										.and(S1_X.slip_prnt_flg.eq(value(true)))
									)
								)
							)
								.then(value(true))
							.otherwise(value(false)).as("dlv_slip_printed_flg"),
						S0_T.acst_cd.as("acst_cd"),
						S0_T.ar_dpt_cd,
						S0_ARDPT.dpt_nm.as("ar_dpt_nm"),
						S0_T.trd_rmrks,
						S0_T.intr_rmrks,
						S0_T.tterm_cd1,
						S0_T.tterm_rmrks1,
						S0_T.tterm_cd2,
						S0_T.tterm_rmrks2,
						S0_T.tterm_cd3,
						S0_T.tterm_rmrks3,
						S0_T.sub_char1,
						S0_T.sub_char2,
						S0_T.sub_char3,
						S0_CO.xrate_rnd_typ,
						S0_CO.wtax_rnd_typ,
						S0_T.slip_sts_typ,
						S0_T.ins_usr_id,
						S0_T.ins_usr_nm,
						S0_T.ins_func_id,
						S0_T.ins_ts,
						S0_T.upd_usr_id,
						S0_T.upd_usr_nm,
						S0_T.upd_func_id,
						S0_T.upd_ts,
						S0_T.upd_srv_req_no,
						S0_T.upd_cntr,
						bracket(
							S0_T.dlv_slip_seq.add(
								decode(
									S0_T.sls_act_rev,
									S0_T1.pr("max_rev"),
									decode(
										S0_T.slip_sts_typ,
										value(MAC_SLIP_STS_TYP.DIS.value()),
										value(1),
										value(0)
									),
									value(0)
								)
							)
						).as("dlv_slip_seq"),
						S0_T.bcst_cd.as("join_bcst_cd_")
					)
					.from(
						S0_T
						.crossJoin(S0_CO)
						.leftOuterJoin(S0_DPT).on(
							bracket(
								S0_T.sls_dpt_cd.eq(S0_DPT.dpt_cd)
								.and(bind("today").between(S0_DPT.st_dt, S0_DPT.end_dt))
							)
						)
						.leftOuterJoin(S0_ARDPT).on(
							bracket(
								S0_T.ar_dpt_cd.eq(S0_ARDPT.dpt_cd)
								.and(bind("today").between(S0_ARDPT.st_dt, S0_ARDPT.end_dt))
							)
						)
						.leftOuterJoin(
							subQuery()
							.select(
								S5.sls_act_no,
								max(S5.sls_act_rev).as("max_rev"),
								max(S5.sls_act_seq).as("max_seq")
							)
							.from(S5)
							.groupBy(S5.sls_act_no).view(S0_T1)
						).on(
							bracket(
								S0_T.sls_act_no.eq(S0_T1.pr(S5.sls_act_no))
							)
						)
						.innerJoin(S0_DAC).on(
							bracket(
								S0_T.sls_dpt_cd.eq(S0_DAC.dpt_cd)
							)
						)
					)
					.where(
						value(1).eq(value(1))
						.and(S0_T.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.SLS_RTN.value())))
						.and(S0_T.sls_act_no.eq(bind("srch_tgt_no")))
						.cutoff$and(
							bind("latest_flg_str").eq(value(true))
							.and(S0_T.slip_sts_typ.eq(value(MAC_SLIP_STS_TYP.CRT.value())))
						)
						.cutoff$and(
							S0_T.sls_act_rev.eq(bind("srch_tgt_rev"))
							.and(S0_T.slip_sts_typ.neq(value(MAC_SLIP_STS_TYP.CAN.value())))
						)
					)
			)
			.setJoinInfo(
				joinInfo(
					j -> j
						.add(MST_SLS_RET_SCHD_R.class, r -> toCondition(
							r.getStringNE("sls_ret_schd_no")
						))
						.addSelect(m -> toArray(
							m.ptax_xrate_inpt_flg,
							m.upd_cntr,
							m.xrate_inpt_flg
						))
						.addMap((r, m) -> {
							r.setBooleanNE("xrate_inpt_flg", m.xrate_inpt_flg());
							r.setBooleanNE("ptax_xrate_inpt_flg", m.ptax_xrate_inpt_flg());
							r.setNumberNE("upd_cntr_sls_ret_schd", m.upd_cntr());
					}),
					j -> j
						.add(MAM_TRD_R.class, r -> toCondition(
							r.getStringNE("trd_cd")
						))
						.addSelect(m -> toArray(
							m.trd_nm,
							m.trd_ptn_typ
						))
						.addMap((r, m) -> {
							r.setStringNE("trd_nm", m.trd_nm());
							r.setStringNE("trd_ptn_typ", m.trd_ptn_typ());
					}),
					j -> j
						.add(MAM_BP_R.class, r -> toCondition(
							r.getStringNE("cst_cd")
						))
						.addSelect(m -> toArray(
							m.ar_dpt_typ,
							m.bill_crryovr_times,
							m.bp_nm,
							m.cst_iv_flg,
							m.sls_amt_rnd_typ,
							m.sls_tax_rnd_typ,
							m.sls_upri_cng_flg,
							m.sls_upri_rnd_typ
						))
						.addMap((r, m) -> {
							r.setStringNE("cst_nm", m.bp_nm());
							r.setBooleanNE("cst_iv_flg", m.cst_iv_flg());
							r.setStringNE("sls_amt_rnd_typ", m.sls_amt_rnd_typ());
							r.setStringNE("sls_upri_rnd_typ", m.sls_upri_rnd_typ());
							r.setStringNE("sls_tax_rnd_typ", m.sls_tax_rnd_typ());
							r.setStringNE("ar_dpt_typ", m.ar_dpt_typ());
							r.setNumberNE("cst_bill_crryovr_times", m.bill_crryovr_times());
							r.setBooleanNE("sls_upri_cng_flg", m.sls_upri_cng_flg());
					}),
					j -> j
						.add(MAM_BP_R.class, r -> toCondition(
							r.getStringNE("acst_cd")
						))
						.addSelect(m -> toArray(
							m.bp_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("acst_nm", m.bp_nm());
					}),
					j -> j
						.add(MAM_BP_R.class, r -> toCondition(
							r.getStringNE("join_bcst_cd_")
						))
						.addSelect(m -> toArray(
							m.bill_cl_typ
						))
						.addMap((r, m) -> {
							r.setStringNE("bill_cl_typ", m.bill_cl_typ());
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
							r.setNumberNE("trd_cur_amt_dec_place", m.amt_dec_place());
							r.setNumberNE("trd_cur_upri_dec_place", m.upri_dec_place());
					}),
					j -> j
						.add(MAM_CUR_R.class, r -> toCondition(
							r.getStringNE("base_cur_cd")
						))
						.addSelect(m -> toArray(
							m.amt_dec_place,
							m.cur_nm,
							m.upri_dec_place
						))
						.addMap((r, m) -> {
							r.setStringNE("base_cur_nm", m.cur_nm());
							r.setNumberNE("base_cur_amt_dec_place", m.amt_dec_place());
							r.setNumberNE("base_cur_upri_dec_place", m.upri_dec_place());
					}),
					j -> j
						.add(MAM_CUR_R.class, r -> toCondition(
							r.getStringNE("ptax_cur_cd")
						))
						.addSelect(m -> toArray(
							m.amt_dec_place,
							m.cur_nm,
							m.upri_dec_place
						))
						.addMap((r, m) -> {
							r.setStringNE("ptax_cur_nm", m.cur_nm());
							r.setNumberNE("ptax_cur_amt_dec_place", m.amt_dec_place());
							r.setNumberNE("ptax_cur_upri_dec_place", m.upri_dec_place());
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
					})
				)
			);
	}
	
	/**
	 * -- MSBBL1340_SLS_RET_SCHD_D_Query_S02
	 */
	static MCQueryPlan MSBBL1340_SLS_RET_SCHD_D_S02() {
		MST_SLS_RET_SCHD_R S0_T1 = MST_SLS_RET_SCHD_R.create("T1");
		MST_SLS_RET_SCHD_D_R S0_T2 = MST_SLS_RET_SCHD_D_R.create("T2");
		MST_ARR_PR_R S0_T3 = MST_ARR_PR_R.create("T3");
		MAM_ITM_R S0_ITM = MAM_ITM_R.create("ITM");
		MAM_BP_R S0_DLV = MAM_BP_R.create("DLV");
		MAM_TAX_R S0_TAX = MAM_TAX_R.create("TAX");
		MAM_TAX_R S0_NEWTAX = MAM_TAX_R.create("NEWTAX");
		MAM_DPT_R S0_DPT = MAM_DPT_R.create("DPT");
		MAVM_RD_DPT_R S0_DAC = MAVM_RD_DPT_R.create("DAC");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBBL1340_SLS_RET_SCHD_D_Query_S02")
					.mainQuery()
					.select(
						S0_T2.itm_cd,
						S0_T2.itm_sub1,
						S0_T2.itm_sub2,
						S0_T2.itm_sub3,
						nvl(
							S0_T2.itm_nm,
							S0_ITM.itm_nm
						).as("itm_nm"),
						S0_T2.iv_itm_nm,
						S0_ITM.stk_mng_typ,
						S0_T2.sundry_itm_flg,
						S0_T2.sret_fr_cd.as("dlv_cd"),
						nvl(
							S0_T2.sret_fr_nm,
							S0_DLV.bp_nm
						).as("dlv_nm"),
						S0_T2.sret_fr_zip_cd.as("dlv_zip_cd"),
						S0_T2.sret_fr_addr1.as("dlv_addr1"),
						S0_T2.sret_fr_addr2.as("dlv_addr2"),
						S0_T2.sret_fr_addr3.as("dlv_addr3"),
						S0_T2.sret_fr_addr4.as("dlv_addr4"),
						S0_T2.sret_fr_cntct_dpt.as("dlv_cntct_dpt"),
						S0_T2.sret_fr_cntct_psn.as("dlv_cntct_psn"),
						S0_T2.sret_fr_tel.as("dlv_tel"),
						S0_T2.sret_fr_fax.as("dlv_fax"),
						S0_DLV.cntry_cd,
						S0_DLV.prnt_lcl_cd,
						S0_T2.pri_prnt_flg,
						S0_T2.dest_cd1,
						S0_T2.dest_cd2,
						S0_T2.dest_cd3,
						S0_T2.cntry_org_cd,
						S0_T2.trd_unit_cd,
						S0_T2.base_unit_cd,
						S0_T3.base_unit_qty,
						bracket(
							S0_T3.base_unit_qty.subtract(S0_T3.sls_ret_qty)
						).as("schd_qty"),
						S0_T3.arr_qty,
						S0_T3.sls_ret_qty,
						S0_T3.sls_ret_schd_abort_qty.as("abort_qty"),
						S0_T2.trd_cur_upri,
						value(true).as("upri_not_tgt_flg"),
						S0_T2.interim_flg,
						S0_T2.trd_cur_amt,
						S0_T2.trd_cur_dscnt_amt,
						S0_T2.dscnt_rsn_cd,
						S0_T2.cost_upri,
						S0_T2.tax_fix_flg,
						S0_T2.tax_cd,
						S0_TAX.tax_nm,
						S0_TAX.tax_rate,
						S0_TAX.inc_tax_flg,
						S0_TAX.tax_typ,
						S0_T2.trd_cur_tax_amt,
						S0_T2.bill_crryovr_times,
						S0_T2.gd_cd,
						S0_T2.loc_cd,
						S0_T2.str_ln_cd,
						S0_T2.lot_no,
						S0_T2.sublot_no,
						S0_ITM.ver_flg,
						S0_T2.ver_no,
						S0_T2.sno1,
						S0_T2.sno2,
						S0_T2.sno3,
						S0_T2.sno4,
						S0_T2.cst_po_d_no,
						S0_T2.cst_itm_cd,
						S0_T2.cst_itm_nm,
						S0_T2.ret_rsn_cd,
						S0_T2.bd_dpt_cd,
						S0_DPT.dpt_nm.as("bd_dpt_nm"),
						S0_T2.wtax_rate,
						S0_T2.wtax_amt,
						S0_T2.arr_cnt_rmrks,
						S0_T2.trd_d_rmrks,
						S0_T2.sls_ret_schd_d_no,
						S0_T2.ref_sls_act_no,
						S0_T2.ref_sls_act_d_no,
						S0_T2.disp_seq,
						S0_ITM.lot_mng_typ,
						S0_ITM.lot_no_typ,
						S0_ITM.sublot_mng_typ,
						S0_ITM.sublot_no_typ,
						S0_ITM.sno1_mng_typ,
						S0_ITM.sno2_mng_typ,
						S0_ITM.sno3_mng_typ,
						S0_ITM.sno4_mng_typ,
						S0_ITM.ver_flg,
						S0_ITM.dec_place.as("base_unit_dec_place"),
						S0_ITM.rnd_typ.as("base_unit_rnd_typ"),
						S0_TAX.inc_tax_flg,
						S0_T2.ref_sls_act_seq,
						S0_T2.ref_sls_act_d_seq,
						S0_T2.base_sls_ac_dt,
						S0_T1.sls_ret_schd_no,
						S0_T3.arr_pr_no,
						S0_T2.io_schd_pr_no,
						S0_T2.sret_fr_sundry_flg.as("dlv_sundry_flg"),
						S0_ITM.comp_spec_typ,
						S0_ITM.dscnt_itm_flg,
						S0_ITM.sls_upri_cng_flg.as("itm_sls_upri_cng_flg"),
						S0_ITM.bill_crryovr_times.as("itm_bill_crryovr_times"),
						S0_T2.ref_dlv_slip_d_no.as("dlv_slip_d_no"),
						S0_T2.trd_unit_cd.as("schd_trd_unit_cd"),
						S0_T2.trd_unit_qty.as("schd_trd_unit_qty"),
						S0_T2.base_unit_qty.as("init_schd_qty"),
						S0_T2.trd_cur_dscnt_amt.as("init_schd_dscnt_amt"),
						decode(
							S0_TAX.inc_tax_flg,
							value(false),
							S0_T2.trd_cur_amt,
							S0_T2.trd_cur_amt.add(S0_T2.trd_cur_tax_amt)
						).as("init_schd_amt"),
						S0_T2.sls_ret_schd_d_no.as("schd_no"),
						S0_NEWTAX.tax_cd.as("new_tax_cd"),
						S0_NEWTAX.tax_nm.as("new_tax_nm"),
						S0_NEWTAX.tax_rate.as("new_tax_rate"),
						S0_NEWTAX.tax_typ.as("new_tax_typ"),
						S0_NEWTAX.inc_tax_flg.as("new_inc_tax_flg"),
						S0_T2.slo_no,
						S0_T2.slo_d_no
					)
					.from(
						S0_T1
						.innerJoin(S0_T2).on(
							bracket(
								S0_T1.sls_ret_schd_no.eq(S0_T2.sls_ret_schd_no)
							)
						)
						.leftOuterJoin(S0_T3).on(
							bracket(
								S0_T2.sls_ret_schd_d_no.eq(S0_T3.sls_ret_schd_d_no)
							)
						)
						.leftOuterJoin(S0_ITM).on(
							bracket(
								S0_T2.itm_cd.eq(S0_ITM.itm_cd)
								.and(S0_T2.itm_sub1.eq(S0_ITM.itm_sub1))
								.and(S0_T2.itm_sub2.eq(S0_ITM.itm_sub2))
								.and(S0_T2.itm_sub3.eq(S0_ITM.itm_sub3))
							)
						)
						.leftOuterJoin(S0_DLV).on(
							bracket(
								S0_T2.sret_fr_cd.eq(S0_DLV.bp_cd)
							)
						)
						.leftOuterJoin(S0_TAX).on(
							bracket(
								S0_T2.tax_cd.eq(S0_TAX.tax_cd)
							)
						)
						.leftOuterJoin(S0_NEWTAX).on(
							bracket(
								MAPA_TAX$F_GET_SLS_TAX_CD(
									S0_T2.itm_cd,
									S0_T2.itm_sub1,
									S0_T2.itm_sub2,
									S0_T2.itm_sub3,
									S0_T1.cst_cd,
									bind("today")
								).eq(S0_NEWTAX.tax_cd)
							)
						)
						.leftOuterJoin(S0_DPT).on(
							bracket(
								S0_T2.bd_dpt_cd.eq(S0_DPT.dpt_cd)
								.and(bind("today").between(S0_DPT.st_dt, S0_DPT.end_dt))
							)
						)
						.innerJoin(S0_DAC).on(
							bracket(
								S0_T1.sls_dpt_cd.eq(S0_DAC.dpt_cd)
							)
						)
					)
					.where(
						value(1).eq(value(1))
						.and(S0_T1.sls_ret_schd_no.eq(bind("srch_tgt_no")))
						.and(
							not(
								S0_T1.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.SHIP_RTN.value()))
							)
						)
						.and(S0_T3.sls_ret_cmpl_flg.eq(value(false)))
					)
					.orderBy(S0_T2.disp_seq.asc())
			)
			.setJoinInfo(
				joinInfo(
					j -> j
						.add(MST_SLS_ACT_D_R.class, r -> toCondition(
							r.getStringNE("ref_sls_act_d_no"),
							r.getNumberNE("ref_sls_act_d_seq")
						))
						.addSelect(m -> toArray(
							m.purc_act_d_no,
							m.purc_act_no
						))
						.addMap((r, m) -> {
							r.setStringNE("purc_act_no", m.purc_act_no());
							r.setStringNE("purc_act_d_no", m.purc_act_d_no());
					}),
					j -> j
						.add(MAM_CNTRY_R.class, r -> toCondition(
							r.getStringNE("cntry_cd")
						))
						.addSelect(m -> toArray(
							m.cntry_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("cntry_nm", m.cntry_nm());
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
						.add(MAM_BIZ_RSN_R.class, r -> toCondition(
							r.getStringNE("ret_rsn_cd")
						))
						.addSelect(m -> toArray(
							m.biz_rsn_nm,
							m.sls_acxfr_flg
						))
						.addMap((r, m) -> {
							r.setStringNE("ret_rsn_nm", m.biz_rsn_nm());
							r.setBooleanNE("sls_acxfr_flg", m.sls_acxfr_flg());
					}),
					j -> j
						.add(MAM_TAX_R.class, r -> toCondition(
							r.getStringNE("tax_cd")
						))
						.addSelect(m -> toArray(
							m.inc_tax_flg,
							m.tax_rate
						))
						.addMap((r, m) -> {
							r.setNumberNE("schd_tax_rate", m.tax_rate());
							r.setBooleanNE("schd_inc_tax_flg", m.inc_tax_flg());
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
							r.getStringNE("loc_cd")
						))
						.addSelect(m -> toArray(
							m.loc_nm,
							m.site_cd,
							m.str_ln_tgt_flg
						))
						.addMap((r, m) -> {
							r.setStringNE("loc_nm", m.loc_nm());
							r.setBooleanNE("str_ln_tgt_flg", m.str_ln_tgt_flg());
							r.setStringNE("site_cd", m.site_cd());
					}),
					j -> j
						.add(MAM_STR_LN_R.class, r -> toCondition(
							r.getStringNE("loc_cd"),
							r.getStringNE("str_ln_cd")
						))
						.addSelect(m -> toArray(
							m.str_ln_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("str_ln_nm", m.str_ln_nm());
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
							r.setNumberNE("trd_unit_dec_place", m.dec_place());
							r.setNumberNE("trd_unit_conv_base_qty", m.conv_base_qty());
							r.setNumberNE("trd_unit_conv_qty", m.conv_qty());
							r.setStringNE("trd_unit_rnd_typ", m.rnd_typ());
							r.setNumberNE("schd_trd_unit_dec_place", m.dec_place());
							r.setNumberNE("schd_trd_unit_conv_base_qty", m.conv_base_qty());
							r.setNumberNE("schd_trd_unit_conv_qty", m.conv_qty());
					})
				)
			);
	}
	
	/**
	 * -- MSBBL1340_SLS_RET_SCHD_Query_S02
	 */
	static MCQueryPlan MSBBL1340_SLS_RET_SCHD_S02() {
		MST_SLS_RET_SCHD_R S0_T = MST_SLS_RET_SCHD_R.create("T");
		MAM_CO_R S0_CO = MAM_CO_R.create("CO");
		MAM_DPT_R S0_DPT = MAM_DPT_R.create("DPT");
		MAM_DPT_R S0_ARDPT = MAM_DPT_R.create("ARDPT");
		MAVM_RD_DPT_R S0_DAC = MAVM_RD_DPT_R.create("DAC");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBBL1340_SLS_RET_SCHD_Query_S02")
					.mainQuery()
					.select(
						S0_T.trd_cd,
						bind("today").as("sls_ret_dt"),
						S0_T.sls_ret_schd_no,
						S0_T.cst_cd,
						S0_T.sls_usr_cd,
						S0_T.sls_dpt_cd,
						S0_DPT.dpt_nm.as("sls_dpt_nm"),
						S0_T.sls_usr_cd.as("cst_usr_cd"),
						S0_T.sls_dpt_cd.as("cst_dpt_cd"),
						S0_T.wg_cd,
						S0_T.iv_no,
						S0_T.ref_iv_no,
						S0_T.rcv_schd_dt,
						S0_T.trd_cur_cd,
						S0_CO.base_cur_cd,
						S0_T.xrate_inpt_flg,
						cases()
							.when(
								bracket(
									S0_T.xrate_inpt_flg.eq(value(true))
									.or(S0_T.trd_cur_cd.eq(S0_CO.base_cur_cd))
								)
							)
								.then(S0_T.xrate)
							.otherwise(
								MAPA_XCHNG$F_GET_SLS_XRATE_NE(
									S0_T.trd_cur_cd,
									bind("today")
								)
							).as("xrate"),
						S0_CO.ptax_cur_cd,
						S0_T.ptax_xrate_inpt_flg,
						cases()
							.when(
								bracket(
									S0_T.ptax_xrate_inpt_flg.eq(value(true))
									.or(S0_T.trd_cur_cd.eq(S0_CO.ptax_cur_cd))
								)
							)
								.then(S0_T.ptax_xrate)
							.when(S0_CO.ptax_cur_cd.isNotNull())
								.then(
									MAPA_XCHNG$F_GET_XRATE_NE(
										S0_T.trd_cur_cd,
										S0_CO.ptax_cur_cd,
										S0_CO.sls_xrate_cd,
										bind("today")
									)
							)
							.otherwise(nullValue()).as("ptax_xrate"),
						S0_T.cst_po_no,
						S0_T.ar_dpt_cd,
						S0_ARDPT.dpt_nm.as("ar_dpt_nm"),
						S0_T.trd_rmrks,
						S0_T.tterm_cd1,
						S0_T.tterm_rmrks1,
						S0_T.tterm_cd2,
						S0_T.tterm_rmrks2,
						S0_T.tterm_cd3,
						S0_T.tterm_rmrks3,
						S0_CO.xrate_rnd_typ,
						S0_CO.wtax_rnd_typ,
						S0_T.upd_cntr.as("upd_cntr_sls_ret_schd"),
						S0_DPT.wg_cd.as("join_wg_cd_")
					)
					.from(
						S0_T
						.crossJoin(S0_CO)
						.leftOuterJoin(S0_DPT).on(
							bracket(
								S0_T.sls_dpt_cd.eq(S0_DPT.dpt_cd)
								.and(bind("today").between(S0_DPT.st_dt, S0_DPT.end_dt))
							)
						)
						.leftOuterJoin(S0_ARDPT).on(
							bracket(
								S0_T.ar_dpt_cd.eq(S0_ARDPT.dpt_cd)
								.and(bind("today").between(S0_ARDPT.st_dt, S0_ARDPT.end_dt))
							)
						)
						.innerJoin(S0_DAC).on(
							bracket(
								S0_T.sls_dpt_cd.eq(S0_DAC.dpt_cd)
							)
						)
					)
					.where(
						value(1).eq(value(1))
						.and(S0_T.sls_ret_schd_no.eq(bind("srch_tgt_no")))
						.and(
							not(
								S0_T.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.SHIP_RTN.value()))
							)
						)
					)
			)
			.setJoinInfo(
				joinInfo(
					j -> j
						.add(MAM_TRD_R.class, r -> toCondition(
							r.getStringNE("trd_cd")
						))
						.addSelect(m -> toArray(
							m.trd_nm,
							m.trd_ptn_typ
						))
						.addMap((r, m) -> {
							r.setStringNE("trd_nm", m.trd_nm());
							r.setStringNE("trd_ptn_typ", m.trd_ptn_typ());
					}),
					j -> j
						.add(MAM_BP_R.class, r -> toCondition(
							r.getStringNE("cst_cd")
						))
						.addSelect(m -> toArray(
							m.acst_cd,
							m.ar_dpt_typ,
							m.bill_crryovr_times,
							m.bp_nm,
							m.cst_iv_flg,
							m.sls_amt_rnd_typ,
							m.sls_tax_rnd_typ,
							m.sls_upri_cng_flg,
							m.sls_upri_rnd_typ
						))
						.addMap((r, m) -> {
							r.setStringNE("cst_nm", m.bp_nm());
							r.setStringNE("acst_cd", m.acst_cd());
							r.setBooleanNE("cst_iv_flg", m.cst_iv_flg());
							r.setStringNE("sls_amt_rnd_typ", m.sls_amt_rnd_typ());
							r.setStringNE("sls_upri_rnd_typ", m.sls_upri_rnd_typ());
							r.setStringNE("sls_tax_rnd_typ", m.sls_tax_rnd_typ());
							r.setStringNE("ar_dpt_typ", m.ar_dpt_typ());
							r.setNumberNE("cst_bill_crryovr_times", m.bill_crryovr_times());
							r.setBooleanNE("sls_upri_cng_flg", m.sls_upri_cng_flg());
					}),
					j -> j
						.add(MAM_BP_R.class, r -> toCondition(
							r.getStringNE("acst_cd")
						))
						.addSelect(m -> toArray(
							m.bcst_cd,
							m.bp_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("acst_nm", m.bp_nm());
							r.setStringNE("join_bcst_cd_", m.bcst_cd());
					}),
					j -> j
						.add(MAM_BP_R.class, r -> toCondition(
							r.getStringNE("join_bcst_cd_")
						))
						.addSelect(m -> toArray(
							m.bill_cl_typ
						))
						.addMap((r, m) -> {
							r.setStringNE("bill_cl_typ", m.bill_cl_typ());
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
							r.getStringNE("join_wg_cd_")
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
							r.setNumberNE("trd_cur_amt_dec_place", m.amt_dec_place());
							r.setNumberNE("trd_cur_upri_dec_place", m.upri_dec_place());
					}),
					j -> j
						.add(MAM_CUR_R.class, r -> toCondition(
							r.getStringNE("base_cur_cd")
						))
						.addSelect(m -> toArray(
							m.amt_dec_place,
							m.cur_nm,
							m.upri_dec_place
						))
						.addMap((r, m) -> {
							r.setStringNE("base_cur_nm", m.cur_nm());
							r.setNumberNE("base_cur_amt_dec_place", m.amt_dec_place());
							r.setNumberNE("base_cur_upri_dec_place", m.upri_dec_place());
					}),
					j -> j
						.add(MAM_CUR_R.class, r -> toCondition(
							r.getStringNE("ptax_cur_cd")
						))
						.addSelect(m -> toArray(
							m.amt_dec_place,
							m.cur_nm,
							m.upri_dec_place
						))
						.addMap((r, m) -> {
							r.setStringNE("ptax_cur_nm", m.cur_nm());
							r.setNumberNE("ptax_cur_amt_dec_place", m.amt_dec_place());
							r.setNumberNE("ptax_cur_upri_dec_place", m.upri_dec_place());
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
					})
				)
			);
	}
}