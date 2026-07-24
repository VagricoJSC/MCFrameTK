package mcframe.serverMSBE.MSBEL1160;

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
	 * -- MSBEL1160_MST_PROV_ACT_Query_S01
	 */
	static MCQueryPlan MSBEL1160_MST_PROV_ACT_S01() {
		MST_PROV_ACT_R S0_T1 = MST_PROV_ACT_R.create("T1");
		MST_XFR_ACT_D_R S0_TT1 = MST_XFR_ACT_D_R.create("TT1");
		MST_DLV_SLIP_R S0_TT3 = MST_DLV_SLIP_R.create("TT3");
		MSVT_LOT_LIST_R S0_T2 = MSVT_LOT_LIST_R.create("T2");
		MSVT_WRK_SNO_R S0_T3 = MSVT_WRK_SNO_R.create("T3");
		MAM_TRD_R S0_M1 = MAM_TRD_R.create("M1");
		MAM_BP_R S0_M2 = MAM_BP_R.create("M2");
		MAVM_RD_LOC_R S0_M3 = MAVM_RD_LOC_R.create("M3");
		MAM_SITE_R S0_M4 = MAM_SITE_R.create("M4");
		MAM_WG_R S0_M5 = MAM_WG_R.create("M5");
		MAM_LG_GRP_R S0_M6 = MAM_LG_GRP_R.create("M6");
		MAM_STR_LN_R S0_M7 = MAM_STR_LN_R.create("M7");
		MAM_ITM_R S0_M8 = MAM_ITM_R.create("M8");
		MAM_ITM_TYP_D_R S0_M9 = MAM_ITM_TYP_D_R.create("M9");
		MAM_SUNDRY_ITM_R S0_M10 = MAM_SUNDRY_ITM_R.create("M10");
		MAM_STK_GD_R S0_M11 = MAM_STK_GD_R.create("M11");
		MAM_CUR_R S0_M12 = MAM_CUR_R.create("M12");
		MAM_TAX_R S0_M13 = MAM_TAX_R.create("M13");
		MAM_DPT_R S0_M18 = MAM_DPT_R.create("M18");
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
		MAM_EDI_IF_CTL_R M_EDI_IF_CTL = MAM_EDI_IF_CTL_R.create("M19");
		
		MCDynamicSQLID DS0C_ITM_GRP = createDynamicSQLID("DS0C_ITM_GRP");
		MCDynamicSQLID DS0C_PRSPPL_GRP = createDynamicSQLID("DS0C_PRSPPL_GRP");
		
		return createQueryPlan()
			.setQuery(
				sql("MSBEL1160_MST_PROV_ACT_Query_S01")
					.mainQuery()
					.select(
						S0_T1.prov_act_no,
						S0_T1.prov_act_seq,
						S0_T1.prov_act_rev,
						S0_T1.slip_sts_typ,
						S0_T1.prov_schd_no,
						S0_T1.prov_src_act_typ,
						S0_T1.prov_src_act_no,
						S0_T1.trd_cd,
						S0_T1.trd_ptn_typ,
						S0_T1.xfr_rsn_cd,
						S0_T1.base_unit_cd,
						S0_T1.base_unit_qty.as("act_qty"),
						S0_T1.accpt_dt,
						S0_T1.ac_dt,
						S0_T1.ac_ym,
						S0_T1.base_ac_dt,
						S0_T1.wg_cd.as("prsppl_wg_cd"),
						S0_T1.prsppl_cd,
						S0_T1.ap_dpt_cd,
						S0_M18.dpt_nm.as("ap_dpt_nm"),
						S0_T1.prov_typ,
						S0_T1.prov_basis_typ,
						S0_T1.xrate_cd,
						S0_T1.xrate,
						S0_T1.ptax_xrate,
						S0_T1.trd_cur_cd,
						S0_T1.base_cur_cd,
						S0_T1.ptax_cur_cd,
						S0_T1.tax_cd,
						S0_T1.trd_cur_upri,
						S0_T1.trd_cur_upri.as("old_trd_cur_upri"),
						S0_T1.trd_cur_amt,
						S0_T1.trd_cur_tax_amt,
						S0_T1.trd_cur_amt.add(S0_T1.trd_cur_tax_amt).as("trd_cur_inc_tax_amt"),
						S0_T1.base_cur_upri,
						S0_T1.base_cur_amt,
						S0_T1.base_cur_tax_amt,
						S0_T1.base_cur_amt.add(S0_T1.base_cur_tax_amt).as("base_cur_inc_tax_amt"),
						S0_T1.ptax_cur_upri,
						S0_T1.ptax_cur_amt,
						S0_T1.ptax_cur_tax_amt,
						S0_T1.ptax_cur_amt.add(S0_T1.ptax_cur_tax_amt).as("ptax_cur_inc_tax_amt"),
						S0_T1.wtax_rate,
						S0_T1.wtax_amt,
						S0_T1.itm_cd,
						S0_T1.itm_sub1,
						S0_T1.itm_sub2,
						S0_T1.itm_sub3,
						coalesce(
							S0_M10.itm_nm,
							S0_M8.itm_nm
						).as("itm_nm"),
						S0_M8.itm_typ,
						S0_M8.itm_typ_d_cd,
						S0_M8.sundry_itm_flg,
						S0_M8.asset_mng_typ,
						S0_T1.loc_cd.as("prsppl_loc_cd"),
						S0_M3.loc_nm.as("prsppl_loc_nm"),
						S0_T1.str_ln_cd,
						S0_T1.lot_no,
						S0_T1.sublot_no,
						S0_T1.sno1,
						S0_T1.sno2,
						S0_T1.sno3,
						S0_T1.sno4,
						S0_T1.gd_cd,
						S0_T1.stk_id_typ,
						S0_T1.intr_rmrks,
						S0_T1.trd_d_rmrks,
						S0_T1.sub_char1,
						S0_T1.sub_char2,
						S0_T1.sub_char3,
						S0_T1.ins_usr_id,
						S0_T1.ins_usr_nm,
						S0_T1.ins_ts,
						S0_T1.ins_func_id,
						S0_T1.upd_cntr.as("prov_upd_cntr"),
						S0_T1.upd_usr_id,
						S0_T1.upd_usr_nm,
						S0_T1.upd_ts,
						S0_T1.upd_func_id,
						S0_T1.upd_srv_req_no,
						S0_M8.dec_place.as("base_unit_dec_place"),
						S0_M8.rnd_typ.as("base_unit_rnd_typ"),
						S0_TT1.dlv_slip_no,
						S0_TT1.dlv_slip_d_no,
						S0_TT3.slip_prnt_flg.as("dlv_prnted_flg"),
						cases()
						.when(S0_TT3.slip_prnt_flg.eq(value(true))).then(S0_TT3.edi_flg)
						.when(M_EDI_IF_CTL.bp_cd.isNotNull()).then(value(true))
						.otherwise(value(false))
						.as("edi_flg"),
						addDynamicSelect(DS0C_PRSPPL_GRP),
						addDynamicSelect(DS0C_ITM_GRP),
						// this field is appended by sql coverter.
						S0_TT1.xfr_act_no.as("join_xfr_act_no_")
					)
					.from(
						S0_T1
						.leftOuterJoin(S0_TT1).on(
							bracket(
								S0_T1.prov_src_act_no.eq(S0_TT1.xfr_act_d_no)
							)
						)
						.leftOuterJoin(S0_TT3).on(
							bracket(
								S0_TT1.dlv_slip_no.eq(S0_TT3.dlv_slip_no)
								.and(S0_TT3.slip_sts_typ.eq(value(MAC_SLIP_STS_TYP.CRT.value())))
							)
						)
						.innerJoin(S0_M3).on(
							bracket(
								S0_T1.loc_cd.eq(S0_M3.loc_cd)
							)
						)
						.leftOuterJoin(S0_M8).on(
							bracket(
								S0_T1.itm_cd.eq(S0_M8.itm_cd)
								.and(S0_T1.itm_sub1.eq(S0_M8.itm_sub1))
								.and(S0_T1.itm_sub2.eq(S0_M8.itm_sub2))
								.and(S0_T1.itm_sub3.eq(S0_M8.itm_sub3))
							)
						)
						.leftOuterJoin(S0_M10).on(
							bracket(
								S0_T1.itm_cd.eq(S0_M10.itm_cd)
								.and(S0_T1.itm_sub1.eq(S0_M10.itm_sub1))
								.and(S0_T1.itm_sub2.eq(S0_M10.itm_sub2))
								.and(S0_T1.itm_sub3.eq(S0_M10.itm_sub3))
								.and(S0_T1.sno1.eq(S0_M10.sno1))
								.and(S0_T1.sno2.eq(S0_M10.sno2))
								.and(S0_T1.sno3.eq(S0_M10.sno3))
								.and(S0_T1.sno4.eq(S0_M10.sno4))
							)
						)
						.leftOuterJoin(S0_M18).on(
							bracket(
								S0_T1.ap_dpt_cd.eq(S0_M18.dpt_cd)
								.and(S0_T1.ac_dt.between(S0_M18.st_dt, S0_M18.end_dt))
							)
						)
						.leftOuterJoin(M_EDI_IF_CTL).on(
								bracket(
										S0_TT3.bp_cd.eq(M_EDI_IF_CTL.bp_cd)
									.and(M_EDI_IF_CTL.if_proc_typ.eq(value(MAC_IF_PROC_TYP.BILL_SEND.value())))
									.and(S0_TT3.ac_dt.between(M_EDI_IF_CTL.st_dt, M_EDI_IF_CTL.end_dt))
									.and(M_EDI_IF_CTL.not_onr_prov_flg.eq(value(false)))
									.and(M_EDI_IF_CTL.del_flg.eq(value(false)))
								)
							)
						.addDynamicView()
						.addDynamicView(DS0C_PRSPPL_GRP)
						.addDynamicView(DS0C_ITM_GRP)
					)
					.where(
						value(0).eq(value(0))
						.and(S0_T1.prov_src_act_typ.eq(value(MSC_PROV_SRC_ACT_TYP.XFR.value())))
						.and(
							S0_T1.trd_ptn_typ.in(
								bind("prov_str"),
								bind("prov_rtn_str")
							)
						)
						.and(
							S0_T1.prov_typ.in(
								bind("ffr_prov_flg_str"),
								bind("onr_prov_flg_str")
							)
						)
						.addDynamicPredicate()
						.cutoff$and(S0_TT3.slip_prnt_flg.eq(bind("dlv_prnted_str")))
						.cutoff$and(S0_T1.accpt_dt.gte(bind("accpt_dt_fr")))
						.cutoff$and(S0_T1.accpt_dt.lte(bind("accpt_dt_to")))
						.cutoff$and(S0_T1.ac_ym.gte(bind("ac_ym_fr")))
						.cutoff$and(S0_T1.ac_ym.lte(bind("ac_ym_to")))
						.cutoff$and(S0_T1.ac_dt.gte(bind("ac_dt_fr")))
						.cutoff$and(S0_T1.ac_dt.lte(bind("ac_dt_to")))
						.cutoff$and(nullValue().gte(bind("arr_act_hm_fr")))
						.cutoff$and(nullValue().lte(bind("arr_act_hm_to")))
						.cutoff$and(S0_T1.trd_cd.like(bind("trd_cd")))
						.cutoff$and(S0_T1.prsppl_cd.like(bind("prsppl_cd")))
						.cutoff$and(S0_T1.ap_dpt_cd.like(bind("ap_dpt_cd")))
						.cutoff$and(S0_M18.dpt_nm.like(bind("ap_dpt_nm")))
						.cutoff$and(S0_T1.loc_cd.like(bind("prsppl_loc_cd")))
						.cutoff$and(S0_M3.loc_nm.like(bind("prsppl_loc_nm")))
						.cutoff$and(S0_M3.site_cd.like(bind("prsppl_site_cd")))
						.cutoff$and(S0_T1.wg_cd.like(bind("prsppl_wg_cd")))
						.cutoff$and(S0_M3.lg_grp_cd.like(bind("prsppl_lg_grp_cd")))
						.cutoff$and(S0_T1.str_ln_cd.like(bind("prsppl_str_ln_cd")))
						.cutoff$and(S0_M8.itm_typ.like(bind("itm_typ")))
						.cutoff$and(S0_M8.itm_typ_d_cd.like(bind("itm_typ_d_cd")))
						.cutoff$and(S0_T1.itm_cd.like(bind("itm_cd")))
						.cutoff$and(S0_T1.itm_sub1.like(bind("itm_sub1")))
						.cutoff$and(S0_T1.itm_sub2.like(bind("itm_sub2")))
						.cutoff$and(S0_T1.itm_sub3.like(bind("itm_sub3")))
						.cutoff$and(
							coalesce(
								S0_M10.itm_nm,
								S0_M8.itm_nm
							).like(bind("itm_nm"))
						)
						.cutoff$and(S0_T1.lot_no.like(bind("lot_no")))
						.cutoff$and(S0_T1.sublot_no.like(bind("sublot_no")))
						.cutoff$and(S0_T1.sno1.like(bind("sno1")))
						.cutoff$and(S0_T1.sno2.like(bind("sno2")))
						.cutoff$and(S0_T1.sno3.like(bind("sno3")))
						.cutoff$and(S0_T1.sno4.like(bind("sno4")))
						.cutoff$and(S0_T1.gd_cd.like(bind("gd_cd")))
						.cutoff$and(S0_T1.stk_id_typ.like(bind("stk_id_typ")))
						.cutoff$and(S0_T1.prov_basis_typ.like(bind("prov_basis_typ")))
						.cutoff$and(S0_TT1.dlv_slip_no.like(bind("dlv_slip_no")))
						.cutoff$and(S0_TT1.dlv_slip_d_no.like(bind("dlv_slip_d_no")))
						.cutoff$and(S0_T1.trd_cur_cd.like(bind("trd_cur_cd")))
						.cutoff$and(bind("base_cur_cd").neq(S0_T1.trd_cur_cd))
						.cutoff$and(S0_T1.tax_cd.like(bind("tax_cd")))
						.cutoff$and(S0_T1.prov_src_act_typ.like(bind("prov_src_act_typ")))
						.cutoff$and(S0_T1.prov_src_act_no.like(bind("prov_src_act_no")))
						.cutoff$and(S0_T1.prov_act_no.like(bind("prov_act_no")))
						.cutoff$and(S0_T1.intr_rmrks.like(bind("intr_rmrks")))
						.cutoff$and(S0_T1.trd_d_rmrks.like(bind("trd_d_rmrks")))
						.cutoff$and(S0_T1.sub_char1.like(bind("sub_char1")))
						.cutoff$and(S0_T1.sub_char2.like(bind("sub_char2")))
						.cutoff$and(S0_T1.sub_char3.like(bind("sub_char3")))
						.and(
							S0_T1.slip_sts_typ.eq(value(MAC_SLIP_STS_TYP.CRT.value()))
							.or(bind("dis_can_disp_flg").eq(value(true)))
							.cutoff$and(bind("print_flg_str").eq(value(false)))
						)
						.and(
								(
									bind("on_edi_flg").eq(value(true)).and(bind("off_edi_flg").eq(value(true)))
									.and(((
											bind("ope_prnt").eq(value(false)).or(
											cases()
											.when(S0_TT3.slip_prnt_flg.eq(value(true))).then(S0_TT3.edi_flg)
											.when(M_EDI_IF_CTL.bp_cd.isNotNull()).then(value(true))
											.otherwise(value(false)).eq(value(true))
											.and(S0_TT3.slip_prnt_flg.eq(value(false))))).or(
												cases()
												.when(S0_TT3.slip_prnt_flg.eq(value(true))).then(S0_TT3.edi_flg)
												.when(M_EDI_IF_CTL.bp_cd.isNotNull()).then(value(true))
												.otherwise(value(false)).eq(value(false)))))
								)
								.or( bind("on_edi_flg").eq(value(true)).and(bind("off_edi_flg").eq(value(false))).and(
										cases()
										.when(S0_TT3.slip_prnt_flg.eq(value(true))).then(S0_TT3.edi_flg)
										.when(M_EDI_IF_CTL.bp_cd.isNotNull()).then(value(true))
										.otherwise(value(false)).eq(value(true)))
										.and(S0_TT3.slip_prnt_flg.eq(value(false)).or(bind("ope_prnt").eq(value(false)))) )
								.or( bind("on_edi_flg").eq(value(false)).and(bind("off_edi_flg").eq(value(true))).and(
										cases()
										.when(S0_TT3.slip_prnt_flg.eq(value(true))).then(S0_TT3.edi_flg)
										.when(M_EDI_IF_CTL.bp_cd.isNotNull()).then(value(true))
										.otherwise(value(false))
										.eq(value(false))) )
						)
						.addDynamicPredicate(DS0C_PRSPPL_GRP)
						.addDynamicPredicate(DS0C_ITM_GRP)
					)
					.orderBy(
						S0_T1.prov_src_act_typ.asc(),
						S0_T1.prov_act_no.asc(),
						S0_T1.prov_act_seq.asc()
					)
			)
			.setDynamicSQLInfo(
				when(boundOr("ver_no"))
					.view(v -> v.leftOuterJoin(S0_T2).on(bracket(S0_T1.itm_cd.eq(S0_T2.itm_cd).and(S0_T1.itm_sub1.eq(S0_T2.itm_sub1)).and(S0_T1.itm_sub2.eq(S0_T2.itm_sub2)).and(S0_T1.itm_sub3.eq(S0_T2.itm_sub3)).and(S0_T1.lot_no.eq(S0_T2.lot_no)).and(S0_T1.sublot_no.eq(S0_T2.sublot_no)))))
					.predicate(p -> p.cutoff$and(S0_T2.ver_no.like(bind("ver_no")))),
				when(boundOr("wrk_no", "wrk_nm"))
					.view(v -> v.leftOuterJoin(S0_T3).on(bracket(S0_T1.sno1.eq(S0_T3.sno1))))
					.predicate(p -> p.cutoff$and(S0_T3.wrk_no.like(bind("wrk_no"))).cutoff$and(S0_T3.wrk_nm.like(bind("wrk_nm")))),
				when(boundOr("trd_nm"))
					.view(v -> v.leftOuterJoin(S0_M1).on(bracket(S0_T1.trd_cd.eq(S0_M1.trd_cd))))
					.predicate(p -> p.cutoff$and(S0_M1.trd_nm.like(bind("trd_nm")))),
				when(boundOr("prsppl_grp_flg1", "prsppl_grp_flg2", "prsppl_grp_flg3", "prsppl_grp_flg4", "prsppl_grp_flg5", "prsppl_grp_flg6", "prsppl_grp_flg7", "prsppl_grp_flg8", "prsppl_grp_flg9", "prsppl_grp_flg10", "subcon_flg_str", "prsppl_nm"))
					.view(v -> v.leftOuterJoin(S0_M2).on(bracket(S0_T1.prsppl_cd.eq(S0_M2.bp_cd))))
					.predicate(p -> p.cutoff$and(S0_M2.subcon_flg.eq(bind("subcon_flg_str"))).cutoff$and(S0_M2.bp_nm.like(bind("prsppl_nm")))),
				when(boundOr("prsppl_site_nm"))
					.view(v -> v.leftOuterJoin(S0_M4).on(bracket(S0_M3.site_cd.eq(S0_M4.site_cd))))
					.predicate(p -> p.cutoff$and(S0_M4.site_nm.like(bind("prsppl_site_nm")))),
				when(boundOr("prsppl_wg_nm"))
					.view(v -> v.leftOuterJoin(S0_M5).on(bracket(S0_T1.wg_cd.eq(S0_M5.wg_cd))))
					.predicate(p -> p.cutoff$and(S0_M5.wg_nm.like(bind("prsppl_wg_nm")))),
				when(boundOr("prsppl_lg_grp_nm"))
					.view(v -> v.leftOuterJoin(S0_M6).on(bracket(S0_M3.lg_grp_cd.eq(S0_M6.lg_grp_cd))))
					.predicate(p -> p.cutoff$and(S0_M6.lg_grp_nm.like(bind("prsppl_lg_grp_nm")))),
				when(boundOr("prsppl_str_ln_nm"))
					.view(v -> v.leftOuterJoin(S0_M7).on(bracket(S0_T1.loc_cd.eq(S0_M7.loc_cd).and(S0_T1.str_ln_cd.eq(S0_M7.str_ln_cd)))))
					.predicate(p -> p.cutoff$and(S0_M7.str_ln_nm.like(bind("prsppl_str_ln_nm")))),
				when(boundOr("itm_typ_d_nm"))
					.view(v -> v.leftOuterJoin(S0_M9).on(bracket(S0_M8.itm_typ.eq(S0_M9.itm_typ).and(S0_M8.itm_typ_d_cd.eq(S0_M9.itm_typ_d_cd)))))
					.predicate(p -> p.cutoff$and(S0_M9.itm_typ_d_nm.like(bind("itm_typ_d_nm")))),
				when(boundOr("gd_nm"))
					.view(v -> v.leftOuterJoin(S0_M11).on(bracket(S0_T1.gd_cd.eq(S0_M11.gd_cd))))
					.predicate(p -> p.cutoff$and(S0_M11.gd_nm.like(bind("gd_nm")))),
				when(boundOr("trd_cur_nm"))
					.view(v -> v.leftOuterJoin(S0_M12).on(bracket(S0_T1.trd_cur_cd.eq(S0_M12.cur_cd))))
					.predicate(p -> p.cutoff$and(S0_M12.cur_nm.like(bind("trd_cur_nm")))),
				when(boundOr("tax_nm"))
					.view(v -> v.leftOuterJoin(S0_M13).on(bracket(S0_T1.tax_cd.eq(S0_M13.tax_cd))))
					.predicate(p -> p.cutoff$and(S0_M13.tax_nm.like(bind("tax_nm")))),
				when(boundOr("prsppl_grp_flg1"))
					.select(DS0C_PRSPPL_GRP, S0_M2.bp_grp_cd1.as("prsppl_grp_cd1"), S0_MM11.bp_grp_nm.as("prsppl_grp_nm1"))
					.view(DS0C_PRSPPL_GRP, v -> v.leftOuterJoin(S0_MM11).on(S0_M2.bp_grp_cd1.eq(S0_MM11.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP1.value()).eq(S0_MM11.bp_grp_typ))))
					.predicate(DS0C_PRSPPL_GRP, p -> p.cutoff$and(S0_M2.bp_grp_cd1.like(bind("prsppl_grp_cd1"))).cutoff$and(S0_MM11.bp_grp_nm.like(bind("prsppl_grp_nm1")))),
				when(boundOr("prsppl_grp_flg2"))
					.select(DS0C_PRSPPL_GRP, S0_M2.bp_grp_cd2.as("prsppl_grp_cd2"), S0_MM12.bp_grp_nm.as("prsppl_grp_nm2"))
					.view(DS0C_PRSPPL_GRP, v -> v.leftOuterJoin(S0_MM12).on(S0_M2.bp_grp_cd2.eq(S0_MM12.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP2.value()).eq(S0_MM12.bp_grp_typ))))
					.predicate(DS0C_PRSPPL_GRP, p -> p.cutoff$and(S0_M2.bp_grp_cd2.like(bind("prsppl_grp_cd2"))).cutoff$and(S0_MM12.bp_grp_nm.like(bind("prsppl_grp_nm2")))),
				when(boundOr("prsppl_grp_flg3"))
					.select(DS0C_PRSPPL_GRP, S0_M2.bp_grp_cd3.as("prsppl_grp_cd3"), S0_MM13.bp_grp_nm.as("prsppl_grp_nm3"))
					.view(DS0C_PRSPPL_GRP, v -> v.leftOuterJoin(S0_MM13).on(S0_M2.bp_grp_cd3.eq(S0_MM13.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP3.value()).eq(S0_MM13.bp_grp_typ))))
					.predicate(DS0C_PRSPPL_GRP, p -> p.cutoff$and(S0_M2.bp_grp_cd3.like(bind("prsppl_grp_cd3"))).cutoff$and(S0_MM13.bp_grp_nm.like(bind("prsppl_grp_nm3")))),
				when(boundOr("prsppl_grp_flg4"))
					.select(DS0C_PRSPPL_GRP, S0_M2.bp_grp_cd4.as("prsppl_grp_cd4"), S0_MM14.bp_grp_nm.as("prsppl_grp_nm4"))
					.view(DS0C_PRSPPL_GRP, v -> v.leftOuterJoin(S0_MM14).on(S0_M2.bp_grp_cd4.eq(S0_MM14.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP4.value()).eq(S0_MM14.bp_grp_typ))))
					.predicate(DS0C_PRSPPL_GRP, p -> p.cutoff$and(S0_M2.bp_grp_cd4.like(bind("prsppl_grp_cd4"))).cutoff$and(S0_MM14.bp_grp_nm.like(bind("prsppl_grp_nm4")))),
				when(boundOr("prsppl_grp_flg5"))
					.select(DS0C_PRSPPL_GRP, S0_M2.bp_grp_cd5.as("prsppl_grp_cd5"), S0_MM15.bp_grp_nm.as("prsppl_grp_nm5"))
					.view(DS0C_PRSPPL_GRP, v -> v.leftOuterJoin(S0_MM15).on(S0_M2.bp_grp_cd5.eq(S0_MM15.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP5.value()).eq(S0_MM15.bp_grp_typ))))
					.predicate(DS0C_PRSPPL_GRP, p -> p.cutoff$and(S0_M2.bp_grp_cd5.like(bind("prsppl_grp_cd5"))).cutoff$and(S0_MM15.bp_grp_nm.like(bind("prsppl_grp_nm5")))),
				when(boundOr("prsppl_grp_flg6"))
					.select(DS0C_PRSPPL_GRP, S0_M2.bp_grp_cd6.as("prsppl_grp_cd6"), S0_MM16.bp_grp_nm.as("prsppl_grp_nm6"))
					.view(DS0C_PRSPPL_GRP, v -> v.leftOuterJoin(S0_MM16).on(S0_M2.bp_grp_cd6.eq(S0_MM16.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP6.value()).eq(S0_MM16.bp_grp_typ))))
					.predicate(DS0C_PRSPPL_GRP, p -> p.cutoff$and(S0_M2.bp_grp_cd6.like(bind("prsppl_grp_cd6"))).cutoff$and(S0_MM16.bp_grp_nm.like(bind("prsppl_grp_nm6")))),
				when(boundOr("prsppl_grp_flg7"))
					.select(DS0C_PRSPPL_GRP, S0_M2.bp_grp_cd7.as("prsppl_grp_cd7"), S0_MM17.bp_grp_nm.as("prsppl_grp_nm7"))
					.view(DS0C_PRSPPL_GRP, v -> v.leftOuterJoin(S0_MM17).on(S0_M2.bp_grp_cd7.eq(S0_MM17.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP7.value()).eq(S0_MM17.bp_grp_typ))))
					.predicate(DS0C_PRSPPL_GRP, p -> p.cutoff$and(S0_M2.bp_grp_cd7.like(bind("prsppl_grp_cd7"))).cutoff$and(S0_MM17.bp_grp_nm.like(bind("prsppl_grp_nm7")))),
				when(boundOr("prsppl_grp_flg8"))
					.select(DS0C_PRSPPL_GRP, S0_M2.bp_grp_cd8.as("prsppl_grp_cd8"), S0_MM18.bp_grp_nm.as("prsppl_grp_nm8"))
					.view(DS0C_PRSPPL_GRP, v -> v.leftOuterJoin(S0_MM18).on(S0_M2.bp_grp_cd8.eq(S0_MM18.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP8.value()).eq(S0_MM18.bp_grp_typ))))
					.predicate(DS0C_PRSPPL_GRP, p -> p.cutoff$and(S0_M2.bp_grp_cd8.like(bind("prsppl_grp_cd8"))).cutoff$and(S0_MM18.bp_grp_nm.like(bind("prsppl_grp_nm8")))),
				when(boundOr("prsppl_grp_flg9"))
					.select(DS0C_PRSPPL_GRP, S0_M2.bp_grp_cd9.as("prsppl_grp_cd9"), S0_MM19.bp_grp_nm.as("prsppl_grp_nm9"))
					.view(DS0C_PRSPPL_GRP, v -> v.leftOuterJoin(S0_MM19).on(S0_M2.bp_grp_cd9.eq(S0_MM19.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP9.value()).eq(S0_MM19.bp_grp_typ))))
					.predicate(DS0C_PRSPPL_GRP, p -> p.cutoff$and(S0_M2.bp_grp_cd9.like(bind("prsppl_grp_cd9"))).cutoff$and(S0_MM19.bp_grp_nm.like(bind("prsppl_grp_nm9")))),
				when(boundOr("prsppl_grp_flg10"))
					.select(DS0C_PRSPPL_GRP, S0_M2.bp_grp_cd10.as("prsppl_grp_cd10"), S0_MM110.bp_grp_nm.as("prsppl_grp_nm10"))
					.view(DS0C_PRSPPL_GRP, v -> v.leftOuterJoin(S0_MM110).on(S0_M2.bp_grp_cd10.eq(S0_MM110.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP10.value()).eq(S0_MM110.bp_grp_typ))))
					.predicate(DS0C_PRSPPL_GRP, p -> p.cutoff$and(S0_M2.bp_grp_cd10.like(bind("prsppl_grp_cd10"))).cutoff$and(S0_MM110.bp_grp_nm.like(bind("prsppl_grp_nm10")))),
				when(boundOr("itm_grp_flg1"))
					.select(DS0C_ITM_GRP, S0_M8.itm_grp_cd1.as("itm_grp_cd1"), S0_MM21.itm_grp_nm.as("itm_grp_nm1"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM21).on(S0_M8.itm_grp_cd1.eq(S0_MM21.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP1.value()).eq(S0_MM21.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M8.itm_grp_cd1.like(bind("itm_grp_cd1"))).cutoff$and(S0_MM21.itm_grp_nm.like(bind("itm_grp_nm1")))),
				when(boundOr("itm_grp_flg2"))
					.select(DS0C_ITM_GRP, S0_M8.itm_grp_cd2.as("itm_grp_cd2"), S0_MM22.itm_grp_nm.as("itm_grp_nm2"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM22).on(S0_M8.itm_grp_cd2.eq(S0_MM22.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP2.value()).eq(S0_MM22.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M8.itm_grp_cd2.like(bind("itm_grp_cd2"))).cutoff$and(S0_MM22.itm_grp_nm.like(bind("itm_grp_nm2")))),
				when(boundOr("itm_grp_flg3"))
					.select(DS0C_ITM_GRP, S0_M8.itm_grp_cd3.as("itm_grp_cd3"), S0_MM23.itm_grp_nm.as("itm_grp_nm3"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM23).on(S0_M8.itm_grp_cd3.eq(S0_MM23.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP3.value()).eq(S0_MM23.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M8.itm_grp_cd3.like(bind("itm_grp_cd3"))).cutoff$and(S0_MM23.itm_grp_nm.like(bind("itm_grp_nm3")))),
				when(boundOr("itm_grp_flg4"))
					.select(DS0C_ITM_GRP, S0_M8.itm_grp_cd4.as("itm_grp_cd4"), S0_MM24.itm_grp_nm.as("itm_grp_nm4"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM24).on(S0_M8.itm_grp_cd4.eq(S0_MM24.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP4.value()).eq(S0_MM24.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M8.itm_grp_cd4.like(bind("itm_grp_cd4"))).cutoff$and(S0_MM24.itm_grp_nm.like(bind("itm_grp_nm4")))),
				when(boundOr("itm_grp_flg5"))
					.select(DS0C_ITM_GRP, S0_M8.itm_grp_cd5.as("itm_grp_cd5"), S0_MM25.itm_grp_nm.as("itm_grp_nm5"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM25).on(S0_M8.itm_grp_cd5.eq(S0_MM25.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP5.value()).eq(S0_MM25.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M8.itm_grp_cd5.like(bind("itm_grp_cd5"))).cutoff$and(S0_MM25.itm_grp_nm.like(bind("itm_grp_nm5")))),
				when(boundOr("itm_grp_flg6"))
					.select(DS0C_ITM_GRP, S0_M8.itm_grp_cd6.as("itm_grp_cd6"), S0_MM26.itm_grp_nm.as("itm_grp_nm6"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM26).on(S0_M8.itm_grp_cd6.eq(S0_MM26.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP6.value()).eq(S0_MM26.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M8.itm_grp_cd6.like(bind("itm_grp_cd6"))).cutoff$and(S0_MM26.itm_grp_nm.like(bind("itm_grp_nm6")))),
				when(boundOr("itm_grp_flg7"))
					.select(DS0C_ITM_GRP, S0_M8.itm_grp_cd7.as("itm_grp_cd7"), S0_MM27.itm_grp_nm.as("itm_grp_nm7"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM27).on(S0_M8.itm_grp_cd7.eq(S0_MM27.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP7.value()).eq(S0_MM27.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M8.itm_grp_cd7.like(bind("itm_grp_cd7"))).cutoff$and(S0_MM27.itm_grp_nm.like(bind("itm_grp_nm7")))),
				when(boundOr("itm_grp_flg8"))
					.select(DS0C_ITM_GRP, S0_M8.itm_grp_cd8.as("itm_grp_cd8"), S0_MM28.itm_grp_nm.as("itm_grp_nm8"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM28).on(S0_M8.itm_grp_cd8.eq(S0_MM28.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP8.value()).eq(S0_MM28.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M8.itm_grp_cd8.like(bind("itm_grp_cd8"))).cutoff$and(S0_MM28.itm_grp_nm.like(bind("itm_grp_nm8")))),
				when(boundOr("itm_grp_flg9"))
					.select(DS0C_ITM_GRP, S0_M8.itm_grp_cd9.as("itm_grp_cd9"), S0_MM29.itm_grp_nm.as("itm_grp_nm9"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM29).on(S0_M8.itm_grp_cd9.eq(S0_MM29.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP9.value()).eq(S0_MM29.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M8.itm_grp_cd9.like(bind("itm_grp_cd9"))).cutoff$and(S0_MM29.itm_grp_nm.like(bind("itm_grp_nm9")))),
				when(boundOr("itm_grp_flg10"))
					.select(DS0C_ITM_GRP, S0_M8.itm_grp_cd10.as("itm_grp_cd10"), S0_MM210.itm_grp_nm.as("itm_grp_nm10"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM210).on(S0_M8.itm_grp_cd10.eq(S0_MM210.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP10.value()).eq(S0_MM210.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M8.itm_grp_cd10.like(bind("itm_grp_cd10"))).cutoff$and(S0_MM210.itm_grp_nm.like(bind("itm_grp_nm10"))))
			)
			.setJoinInfo(
				joinInfo(
					j -> j
						.add(MST_PROV_SCHD_R.class, r -> toCondition(
							r.getStringNE("prov_schd_no")
						))
						.addSelect(m -> toArray(
							m.ptax_xrate_inpt_flg,
							m.tax_fix_flg,
							m.xrate_inpt_flg
						))
						.addMap((r, m) -> {
							r.setBooleanNE("tax_fix_flg", m.tax_fix_flg());
							r.setBooleanNE("xrate_inpt_flg", m.xrate_inpt_flg());
							r.setBooleanNE("ptax_xrate_inpt_flg", m.ptax_xrate_inpt_flg());
					}),
					j -> j
						.add(MST_XFR_ACT_R.class, r -> toCondition(
							r.getStringNE("join_xfr_act_no_")
						))
						.addSelect(m -> toArray(
							m.upd_cntr,
							m.xfr_act_no
						))
						.addMap((r, m) -> {
							r.setStringNE("xfr_act_no", m.xfr_act_no());
							r.setNumberNE("xfr_upd_cntr", m.upd_cntr());
					}),
					j -> j
						.add(MSVT_LOT_LIST_R.class, r -> toCondition(
							r.getStringNE("itm_cd"),
							r.getStringNE("itm_sub1"),
							r.getStringNE("itm_sub2"),
							r.getStringNE("itm_sub3"),
							r.getStringNE("lot_no"),
							r.getStringNE("sublot_no")
						))
						.addSelect(m -> toArray(
							m.ver_no
						))
						.addMap((r, m) -> {
							r.setStringNE("ver_no", m.ver_no());
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
							r.getStringNE("prsppl_cd")
						))
						.addSelect(m -> toArray(
							m.bp_nm,
							m.prov_amt_rnd_typ,
							m.prov_tax_rnd_typ
						))
						.addMap((r, m) -> {
							r.setStringNE("prsppl_nm", m.bp_nm());
							r.setStringNE("prov_amt_rnd_typ", m.prov_amt_rnd_typ());
							r.setStringNE("prov_tax_rnd_typ", m.prov_tax_rnd_typ());
					}),
					j -> j
						.add(MAM_WG_R.class, r -> toCondition(
							r.getStringNE("prsppl_wg_cd")
						))
						.addSelect(m -> toArray(
							m.wg_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("prsppl_wg_nm", m.wg_nm());
					}),
					j -> j
						.add(MAM_STR_LN_R.class, r -> toCondition(
							r.getStringNE("prsppl_loc_cd"),
							r.getStringNE("str_ln_cd")
						))
						.addSelect(m -> toArray(
							m.str_ln_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("str_ln_nm", m.str_ln_nm());
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
							r.setStringNE("tax_typ", m.tax_typ());
							r.setBooleanNE("inc_tax_flg", m.inc_tax_flg());
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
						.add(MAM_BIZ_RSN_R.class, r -> toCondition(
							r.getStringNE("xfr_rsn_cd")
						))
						.addSelect(m -> toArray(
							m.acxfr_gi_flg,
							m.biz_rsn_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("xfr_rsn_nm", m.biz_rsn_nm());
							r.setBooleanNE("acxfr_gi_flg", m.acxfr_gi_flg());
					})
				)
			);
	}
	
	/**
	 * -- MSBEL1160_MST_PROV_ACT_Query_S02
	 */
	static MCQueryPlan MSBEL1160_MST_PROV_ACT_S02() {
		MST_PROV_ACT_R S0_T1 = MST_PROV_ACT_R.create("T1");
		MST_ARR_ACT_R S0_TT1 = MST_ARR_ACT_R.create("TT1");
		MST_ARR_SCHD_R S0_TT2 = MST_ARR_SCHD_R.create("TT2");
		MST_ARR_PR_R S0_TT3 = MST_ARR_PR_R.create("TT3");
		MST_DLV_SLIP_R S0_TT4 = MST_DLV_SLIP_R.create("TT4");
		MSVT_LOT_LIST_R S0_T2 = MSVT_LOT_LIST_R.create("T2");
		MSVT_WRK_SNO_R S0_T3 = MSVT_WRK_SNO_R.create("T3");
		MAM_TRD_R S0_M1 = MAM_TRD_R.create("M1");
		MAM_BP_R S0_M2 = MAM_BP_R.create("M2");
		MAVM_RD_LOC_R S0_M3 = MAVM_RD_LOC_R.create("M3");
		MAM_SITE_R S0_M4 = MAM_SITE_R.create("M4");
		MAM_WG_R S0_M5 = MAM_WG_R.create("M5");
		MAM_LG_GRP_R S0_M6 = MAM_LG_GRP_R.create("M6");
		MAM_STR_LN_R S0_M7 = MAM_STR_LN_R.create("M7");
		MAM_ITM_R S0_M8 = MAM_ITM_R.create("M8");
		MAM_ITM_TYP_D_R S0_M9 = MAM_ITM_TYP_D_R.create("M9");
		MAM_SUNDRY_ITM_R S0_M10 = MAM_SUNDRY_ITM_R.create("M10");
		MAM_STK_GD_R S0_M11 = MAM_STK_GD_R.create("M11");
		MAM_CUR_R S0_M12 = MAM_CUR_R.create("M12");
		MAM_TAX_R S0_M13 = MAM_TAX_R.create("M13");
		MAM_DPT_R S0_M18 = MAM_DPT_R.create("M18");
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
		MAM_EDI_IF_CTL_R M_EDI_IF_CTL = MAM_EDI_IF_CTL_R.create("M19");
		
		MCDynamicSQLID DS0C_ITM_GRP = createDynamicSQLID("DS0C_ITM_GRP");
		MCDynamicSQLID DS0C_PRSPPL_GRP = createDynamicSQLID("DS0C_PRSPPL_GRP");
		
		return createQueryPlan()
			.setQuery(
				sql("MSBEL1160_MST_PROV_ACT_Query_S02")
					.mainQuery()
					.select(
						S0_T1.prov_act_no,
						S0_T1.prov_act_seq,
						S0_T1.prov_act_rev,
						S0_T1.slip_sts_typ,
						S0_T1.prov_schd_no,
						S0_T1.prov_src_act_typ,
						S0_T1.prov_src_act_no,
						S0_T1.trd_cd,
						S0_T1.trd_ptn_typ,
						S0_T1.xfr_rsn_cd,
						S0_T1.base_unit_cd,
						S0_T1.base_unit_qty.as("act_qty"),
						S0_T1.accpt_dt,
						S0_T1.ac_dt,
						S0_T1.ac_ym,
						S0_T1.base_ac_dt,
						trunc(
							S0_TT1.arr_tm,
							MCDateFmt.DD
						).as("arr_act_dt"),
						S0_TT1.arr_tm.as("arr_act_hm"),
						S0_T1.wg_cd.as("prsppl_wg_cd"),
						S0_T1.prsppl_cd,
						S0_T1.ap_dpt_cd,
						S0_M18.dpt_nm.as("ap_dpt_nm"),
						S0_T1.prov_typ,
						S0_T1.prov_basis_typ,
						S0_T1.xrate_cd,
						S0_T1.xrate,
						S0_T1.ptax_xrate,
						S0_T1.trd_cur_cd,
						S0_T1.base_cur_cd,
						S0_T1.ptax_cur_cd,
						S0_T1.tax_cd,
						S0_T1.trd_cur_upri,
						S0_T1.trd_cur_upri.as("old_trd_cur_upri"),
						S0_T1.trd_cur_amt,
						S0_T1.trd_cur_tax_amt,
						S0_T1.trd_cur_amt.add(S0_T1.trd_cur_tax_amt).as("trd_cur_inc_tax_amt"),
						S0_T1.base_cur_upri,
						S0_T1.base_cur_amt,
						S0_T1.base_cur_tax_amt,
						S0_T1.base_cur_amt.add(S0_T1.base_cur_tax_amt).as("base_cur_inc_tax_amt"),
						S0_T1.ptax_cur_upri,
						S0_T1.ptax_cur_amt,
						S0_T1.ptax_cur_tax_amt,
						S0_T1.ptax_cur_amt.add(S0_T1.ptax_cur_tax_amt).as("ptax_cur_inc_tax_amt"),
						S0_T1.wtax_rate,
						S0_T1.wtax_amt,
						S0_T1.itm_cd,
						S0_T1.itm_sub1,
						S0_T1.itm_sub2,
						S0_T1.itm_sub3,
						coalesce(
							S0_M10.itm_nm,
							S0_M8.itm_nm
						).as("itm_nm"),
						S0_M8.itm_typ,
						S0_M8.itm_typ_d_cd,
						S0_M8.sundry_itm_flg,
						S0_M8.asset_mng_typ,
						S0_T1.loc_cd.as("prsppl_loc_cd"),
						S0_M3.loc_nm.as("prsppl_loc_nm"),
						S0_T1.str_ln_cd,
						S0_T1.lot_no,
						S0_T1.sublot_no,
						S0_T1.sno1,
						S0_T1.sno2,
						S0_T1.sno3,
						S0_T1.sno4,
						S0_T1.gd_cd,
						S0_T1.stk_id_typ,
						S0_T1.intr_rmrks,
						S0_T1.trd_d_rmrks,
						S0_T1.sub_char1,
						S0_T1.sub_char2,
						S0_T1.sub_char3,
						S0_T1.ins_usr_id,
						S0_T1.ins_usr_nm,
						S0_T1.ins_ts,
						S0_T1.ins_func_id,
						S0_T1.upd_cntr.as("prov_upd_cntr"),
						S0_T1.upd_usr_id,
						S0_T1.upd_usr_nm,
						S0_T1.upd_ts,
						S0_T1.upd_func_id,
						S0_T1.upd_srv_req_no,
						S0_M8.dec_place.as("base_unit_dec_place"),
						S0_M8.rnd_typ.as("base_unit_rnd_typ"),
						S0_TT2.dlv_slip_no,
						S0_TT4.slip_prnt_flg.as("dlv_prnted_flg"),
						cases()
						.when(S0_TT4.slip_prnt_flg.eq(value(true))).then(S0_TT4.edi_flg)
						.when(M_EDI_IF_CTL.bp_cd.isNotNull()).then(value(true))
						.otherwise(value(false))
						.as("edi_flg"),
						addDynamicSelect(DS0C_PRSPPL_GRP),
						addDynamicSelect(DS0C_ITM_GRP),
						// this field is appended by sql coverter.
						S0_TT2.arr_pr_no.as("join_arr_pr_no_")
					)
					.from(
						S0_T1
						.leftOuterJoin(S0_TT1).on(
							bracket(
								S0_T1.prov_src_act_no.eq(S0_TT1.arr_act_no)
							)
						)
						.leftOuterJoin(S0_TT2).on(
							bracket(
								S0_TT1.arr_schd_no.eq(S0_TT2.arr_schd_no)
							)
						)
						.leftOuterJoin(S0_TT4).on(
							bracket(
								S0_TT2.dlv_slip_no.eq(S0_TT4.dlv_slip_no)
								.and(S0_TT4.slip_sts_typ.eq(value(MAC_SLIP_STS_TYP.CRT.value())))
							)
						)
						.innerJoin(S0_M3).on(
							bracket(
								S0_T1.loc_cd.eq(S0_M3.loc_cd)
							)
						)
						.leftOuterJoin(S0_M8).on(
							bracket(
								S0_T1.itm_cd.eq(S0_M8.itm_cd)
								.and(S0_T1.itm_sub1.eq(S0_M8.itm_sub1))
								.and(S0_T1.itm_sub2.eq(S0_M8.itm_sub2))
								.and(S0_T1.itm_sub3.eq(S0_M8.itm_sub3))
							)
						)
						.leftOuterJoin(S0_M10).on(
							bracket(
								S0_T1.itm_cd.eq(S0_M10.itm_cd)
								.and(S0_T1.itm_sub1.eq(S0_M10.itm_sub1))
								.and(S0_T1.itm_sub2.eq(S0_M10.itm_sub2))
								.and(S0_T1.itm_sub3.eq(S0_M10.itm_sub3))
								.and(S0_T1.sno1.eq(S0_M10.sno1))
								.and(S0_T1.sno2.eq(S0_M10.sno2))
								.and(S0_T1.sno3.eq(S0_M10.sno3))
								.and(S0_T1.sno4.eq(S0_M10.sno4))
							)
						)
						.leftOuterJoin(S0_M18).on(
							bracket(
								S0_T1.ap_dpt_cd.eq(S0_M18.dpt_cd)
								.and(S0_T1.ac_dt.between(S0_M18.st_dt, S0_M18.end_dt))
							)
						)
						.leftOuterJoin(M_EDI_IF_CTL).on(
								bracket(
										S0_TT4.bp_cd.eq(M_EDI_IF_CTL.bp_cd)
									.and(M_EDI_IF_CTL.if_proc_typ.eq(value(MAC_IF_PROC_TYP.BILL_SEND.value())))
									.and(S0_TT4.ac_dt.between(M_EDI_IF_CTL.st_dt, M_EDI_IF_CTL.end_dt))
									.and(M_EDI_IF_CTL.not_onr_prov_flg.eq(value(false)))
									.and(M_EDI_IF_CTL.del_flg.eq(value(false)))
								)
							)
						.addDynamicView()
						.addDynamicView(DS0C_PRSPPL_GRP)
						.addDynamicView(DS0C_ITM_GRP)
					)
					.where(
						value(0).eq(value(0))
						.and(S0_T1.prov_src_act_typ.eq(value(MSC_PROV_SRC_ACT_TYP.SHIP.value())))
						.and(
							S0_T1.trd_ptn_typ.in(
								bind("prov_str"),
								bind("prov_rtn_str")
							)
						)
						.and(
							S0_T1.prov_typ.in(
								bind("ffr_prov_flg_str"),
								bind("onr_prov_flg_str")
							)
						)
						.addDynamicPredicate()
						.cutoff$and(S0_TT4.slip_prnt_flg.eq(bind("dlv_prnted_str")))
						.cutoff$and(S0_T1.accpt_dt.gte(bind("accpt_dt_fr")))
						.cutoff$and(S0_T1.accpt_dt.lte(bind("accpt_dt_to")))
						.cutoff$and(S0_T1.ac_ym.gte(bind("ac_ym_fr")))
						.cutoff$and(S0_T1.ac_ym.lte(bind("ac_ym_to")))
						.cutoff$and(S0_T1.ac_dt.gte(bind("ac_dt_fr")))
						.cutoff$and(S0_T1.ac_dt.lte(bind("ac_dt_to")))
						.cutoff$and(S0_TT1.arr_tm.gte(bind("arr_act_hm_fr")))
						.cutoff$and(S0_TT1.arr_tm.lte(bind("arr_act_hm_to")))
						.cutoff$and(S0_T1.trd_cd.like(bind("trd_cd")))
						.cutoff$and(S0_T1.prsppl_cd.like(bind("prsppl_cd")))
						.cutoff$and(S0_T1.ap_dpt_cd.like(bind("ap_dpt_cd")))
						.cutoff$and(S0_M18.dpt_nm.like(bind("ap_dpt_nm")))
						.cutoff$and(S0_T1.loc_cd.like(bind("prsppl_loc_cd")))
						.cutoff$and(S0_M3.loc_nm.like(bind("prsppl_loc_nm")))
						.cutoff$and(S0_M3.site_cd.like(bind("prsppl_site_cd")))
						.cutoff$and(S0_T1.wg_cd.like(bind("prsppl_wg_cd")))
						.cutoff$and(S0_M3.lg_grp_cd.like(bind("prsppl_lg_grp_cd")))
						.cutoff$and(S0_T1.str_ln_cd.like(bind("prsppl_str_ln_cd")))
						.cutoff$and(S0_M8.itm_typ.like(bind("itm_typ")))
						.cutoff$and(S0_M8.itm_typ_d_cd.like(bind("itm_typ_d_cd")))
						.cutoff$and(S0_T1.itm_cd.like(bind("itm_cd")))
						.cutoff$and(S0_T1.itm_sub1.like(bind("itm_sub1")))
						.cutoff$and(S0_T1.itm_sub2.like(bind("itm_sub2")))
						.cutoff$and(S0_T1.itm_sub3.like(bind("itm_sub3")))
						.cutoff$and(
							coalesce(
								S0_M10.itm_nm,
								S0_M8.itm_nm
							).like(bind("itm_nm"))
						)
						.cutoff$and(S0_T1.lot_no.like(bind("lot_no")))
						.cutoff$and(S0_T1.sublot_no.like(bind("sublot_no")))
						.cutoff$and(S0_T1.sno1.like(bind("sno1")))
						.cutoff$and(S0_T1.sno2.like(bind("sno2")))
						.cutoff$and(S0_T1.sno3.like(bind("sno3")))
						.cutoff$and(S0_T1.sno4.like(bind("sno4")))
						.cutoff$and(S0_T1.gd_cd.like(bind("gd_cd")))
						.cutoff$and(S0_T1.stk_id_typ.like(bind("stk_id_typ")))
						.cutoff$and(S0_T1.prov_basis_typ.like(bind("prov_basis_typ")))
						.cutoff$and(S0_TT2.dlv_slip_no.like(bind("dlv_slip_no")))
						.cutoff$and(S0_T1.trd_cur_cd.like(bind("trd_cur_cd")))
						.cutoff$and(bind("base_cur_cd").neq(S0_T1.trd_cur_cd))
						.cutoff$and(S0_T1.tax_cd.like(bind("tax_cd")))
						.cutoff$and(S0_T1.prov_src_act_typ.like(bind("prov_src_act_typ")))
						.cutoff$and(S0_T1.prov_src_act_no.like(bind("prov_src_act_no")))
						.cutoff$and(S0_T1.prov_act_no.like(bind("prov_act_no")))
						.cutoff$and(S0_T1.intr_rmrks.like(bind("intr_rmrks")))
						.cutoff$and(S0_T1.trd_d_rmrks.like(bind("trd_d_rmrks")))
						.cutoff$and(S0_T1.sub_char1.like(bind("sub_char1")))
						.cutoff$and(S0_T1.sub_char2.like(bind("sub_char2")))
						.cutoff$and(S0_T1.sub_char3.like(bind("sub_char3")))
						.and(
							S0_T1.slip_sts_typ.eq(value(MAC_SLIP_STS_TYP.CRT.value()))
							.or(bind("dis_can_disp_flg").eq(value(true)))
							.cutoff$and(bind("print_flg_str").eq(value(false)))
						)
						.and(
								(
									bind("on_edi_flg").eq(value(true)).and(bind("off_edi_flg").eq(value(true)))
									.and(((
											bind("ope_prnt").eq(value(false)).or(
											cases()
											.when(S0_TT4.slip_prnt_flg.eq(value(true))).then(S0_TT4.edi_flg)
											.when(M_EDI_IF_CTL.bp_cd.isNotNull()).then(value(true))
											.otherwise(value(false)).eq(value(true))
											.and(S0_TT4.slip_prnt_flg.eq(value(false))))).or(
												cases()
												.when(S0_TT4.slip_prnt_flg.eq(value(true))).then(S0_TT4.edi_flg)
												.when(M_EDI_IF_CTL.bp_cd.isNotNull()).then(value(true))
												.otherwise(value(false)).eq(value(false)))))
								)
								.or( bind("on_edi_flg").eq(value(true)).and(bind("off_edi_flg").eq(value(false))).and(
										cases()
										.when(S0_TT4.slip_prnt_flg.eq(value(true))).then(S0_TT4.edi_flg)
										.when(M_EDI_IF_CTL.bp_cd.isNotNull()).then(value(true))
										.otherwise(value(false)).eq(value(true)))
										.and(S0_TT4.slip_prnt_flg.eq(value(false)).or(bind("ope_prnt").eq(value(false)))) )
								.or( bind("on_edi_flg").eq(value(false)).and(bind("off_edi_flg").eq(value(true))).and(
										cases()
										.when(S0_TT4.slip_prnt_flg.eq(value(true))).then(S0_TT4.edi_flg)
										.when(M_EDI_IF_CTL.bp_cd.isNotNull()).then(value(true))
										.otherwise(value(false))
										.eq(value(false))) )
						)
						.addDynamicPredicate(DS0C_PRSPPL_GRP)
						.addDynamicPredicate(DS0C_ITM_GRP)
					)
					.orderBy(
						S0_T1.prov_src_act_typ.asc(),
						S0_T1.prov_act_no.asc(),
						S0_T1.prov_act_seq.asc()
					)
			)
			.setDynamicSQLInfo(
				when(boundOr("dlv_slip_d_no"))
					.view(v -> v.leftOuterJoin(S0_TT3).on(bracket(S0_TT2.arr_pr_no.eq(S0_TT3.arr_pr_no))))
					.predicate(p -> p.cutoff$and(S0_TT3.dlv_slip_d_no.like(bind("dlv_slip_d_no")))),
				when(boundOr("ver_no"))
					.view(v -> v.leftOuterJoin(S0_T2).on(bracket(S0_T1.itm_cd.eq(S0_T2.itm_cd).and(S0_T1.itm_sub1.eq(S0_T2.itm_sub1)).and(S0_T1.itm_sub2.eq(S0_T2.itm_sub2)).and(S0_T1.itm_sub3.eq(S0_T2.itm_sub3)).and(S0_T1.lot_no.eq(S0_T2.lot_no)).and(S0_T1.sublot_no.eq(S0_T2.sublot_no)))))
					.predicate(p -> p.cutoff$and(S0_T2.ver_no.like(bind("ver_no")))),
				when(boundOr("wrk_no", "wrk_nm"))
					.view(v -> v.leftOuterJoin(S0_T3).on(bracket(S0_T1.sno1.eq(S0_T3.sno1))))
					.predicate(p -> p.cutoff$and(S0_T3.wrk_no.like(bind("wrk_no"))).cutoff$and(S0_T3.wrk_nm.like(bind("wrk_nm")))),
				when(boundOr("trd_nm"))
					.view(v -> v.leftOuterJoin(S0_M1).on(bracket(S0_T1.trd_cd.eq(S0_M1.trd_cd))))
					.predicate(p -> p.cutoff$and(S0_M1.trd_nm.like(bind("trd_nm")))),
				when(boundOr("prsppl_grp_flg1", "prsppl_grp_flg2", "prsppl_grp_flg3", "prsppl_grp_flg4", "prsppl_grp_flg5", "prsppl_grp_flg6", "prsppl_grp_flg7", "prsppl_grp_flg8", "prsppl_grp_flg9", "prsppl_grp_flg10", "subcon_flg_str", "prsppl_nm"))
					.view(v -> v.leftOuterJoin(S0_M2).on(bracket(S0_T1.prsppl_cd.eq(S0_M2.bp_cd))))
					.predicate(p -> p.cutoff$and(S0_M2.subcon_flg.eq(bind("subcon_flg_str"))).cutoff$and(S0_M2.bp_nm.like(bind("prsppl_nm")))),
				when(boundOr("prsppl_site_nm"))
					.view(v -> v.leftOuterJoin(S0_M4).on(bracket(S0_M3.site_cd.eq(S0_M4.site_cd))))
					.predicate(p -> p.cutoff$and(S0_M4.site_nm.like(bind("prsppl_site_nm")))),
				when(boundOr("prsppl_wg_nm"))
					.view(v -> v.leftOuterJoin(S0_M5).on(bracket(S0_T1.wg_cd.eq(S0_M5.wg_cd))))
					.predicate(p -> p.cutoff$and(S0_M5.wg_nm.like(bind("prsppl_wg_nm")))),
				when(boundOr("prsppl_lg_grp_nm"))
					.view(v -> v.leftOuterJoin(S0_M6).on(bracket(S0_M3.lg_grp_cd.eq(S0_M6.lg_grp_cd))))
					.predicate(p -> p.cutoff$and(S0_M6.lg_grp_nm.like(bind("prsppl_lg_grp_nm")))),
				when(boundOr("prsppl_str_ln_nm"))
					.view(v -> v.leftOuterJoin(S0_M7).on(bracket(S0_T1.loc_cd.eq(S0_M7.loc_cd).and(S0_T1.str_ln_cd.eq(S0_M7.str_ln_cd)))))
					.predicate(p -> p.cutoff$and(S0_M7.str_ln_nm.like(bind("prsppl_str_ln_nm")))),
				when(boundOr("itm_typ_d_nm"))
					.view(v -> v.leftOuterJoin(S0_M9).on(bracket(S0_M8.itm_typ.eq(S0_M9.itm_typ).and(S0_M8.itm_typ_d_cd.eq(S0_M9.itm_typ_d_cd)))))
					.predicate(p -> p.cutoff$and(S0_M9.itm_typ_d_nm.like(bind("itm_typ_d_nm")))),
				when(boundOr("gd_nm"))
					.view(v -> v.leftOuterJoin(S0_M11).on(bracket(S0_T1.gd_cd.eq(S0_M11.gd_cd))))
					.predicate(p -> p.cutoff$and(S0_M11.gd_nm.like(bind("gd_nm")))),
				when(boundOr("trd_cur_nm"))
					.view(v -> v.leftOuterJoin(S0_M12).on(bracket(S0_T1.trd_cur_cd.eq(S0_M12.cur_cd))))
					.predicate(p -> p.cutoff$and(S0_M12.cur_nm.like(bind("trd_cur_nm")))),
				when(boundOr("tax_nm"))
					.view(v -> v.leftOuterJoin(S0_M13).on(bracket(S0_T1.tax_cd.eq(S0_M13.tax_cd))))
					.predicate(p -> p.cutoff$and(S0_M13.tax_nm.like(bind("tax_nm")))),
				when(boundOr("prsppl_grp_flg1"))
					.select(DS0C_PRSPPL_GRP, S0_M2.bp_grp_cd1.as("prsppl_grp_cd1"), S0_MM11.bp_grp_nm.as("prsppl_grp_nm1"))
					.view(DS0C_PRSPPL_GRP, v -> v.leftOuterJoin(S0_MM11).on(S0_M2.bp_grp_cd1.eq(S0_MM11.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP1.value()).eq(S0_MM11.bp_grp_typ))))
					.predicate(DS0C_PRSPPL_GRP, p -> p.cutoff$and(S0_M2.bp_grp_cd1.like(bind("prsppl_grp_cd1"))).cutoff$and(S0_MM11.bp_grp_nm.like(bind("prsppl_grp_nm1")))),
				when(boundOr("prsppl_grp_flg2"))
					.select(DS0C_PRSPPL_GRP, S0_M2.bp_grp_cd2.as("prsppl_grp_cd2"), S0_MM12.bp_grp_nm.as("prsppl_grp_nm2"))
					.view(DS0C_PRSPPL_GRP, v -> v.leftOuterJoin(S0_MM12).on(S0_M2.bp_grp_cd2.eq(S0_MM12.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP2.value()).eq(S0_MM12.bp_grp_typ))))
					.predicate(DS0C_PRSPPL_GRP, p -> p.cutoff$and(S0_M2.bp_grp_cd2.like(bind("prsppl_grp_cd2"))).cutoff$and(S0_MM12.bp_grp_nm.like(bind("prsppl_grp_nm2")))),
				when(boundOr("prsppl_grp_flg3"))
					.select(DS0C_PRSPPL_GRP, S0_M2.bp_grp_cd3.as("prsppl_grp_cd3"), S0_MM13.bp_grp_nm.as("prsppl_grp_nm3"))
					.view(DS0C_PRSPPL_GRP, v -> v.leftOuterJoin(S0_MM13).on(S0_M2.bp_grp_cd3.eq(S0_MM13.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP3.value()).eq(S0_MM13.bp_grp_typ))))
					.predicate(DS0C_PRSPPL_GRP, p -> p.cutoff$and(S0_M2.bp_grp_cd3.like(bind("prsppl_grp_cd3"))).cutoff$and(S0_MM13.bp_grp_nm.like(bind("prsppl_grp_nm3")))),
				when(boundOr("prsppl_grp_flg4"))
					.select(DS0C_PRSPPL_GRP, S0_M2.bp_grp_cd4.as("prsppl_grp_cd4"), S0_MM14.bp_grp_nm.as("prsppl_grp_nm4"))
					.view(DS0C_PRSPPL_GRP, v -> v.leftOuterJoin(S0_MM14).on(S0_M2.bp_grp_cd4.eq(S0_MM14.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP4.value()).eq(S0_MM14.bp_grp_typ))))
					.predicate(DS0C_PRSPPL_GRP, p -> p.cutoff$and(S0_M2.bp_grp_cd4.like(bind("prsppl_grp_cd4"))).cutoff$and(S0_MM14.bp_grp_nm.like(bind("prsppl_grp_nm4")))),
				when(boundOr("prsppl_grp_flg5"))
					.select(DS0C_PRSPPL_GRP, S0_M2.bp_grp_cd5.as("prsppl_grp_cd5"), S0_MM15.bp_grp_nm.as("prsppl_grp_nm5"))
					.view(DS0C_PRSPPL_GRP, v -> v.leftOuterJoin(S0_MM15).on(S0_M2.bp_grp_cd5.eq(S0_MM15.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP5.value()).eq(S0_MM15.bp_grp_typ))))
					.predicate(DS0C_PRSPPL_GRP, p -> p.cutoff$and(S0_M2.bp_grp_cd5.like(bind("prsppl_grp_cd5"))).cutoff$and(S0_MM15.bp_grp_nm.like(bind("prsppl_grp_nm5")))),
				when(boundOr("prsppl_grp_flg6"))
					.select(DS0C_PRSPPL_GRP, S0_M2.bp_grp_cd6.as("prsppl_grp_cd6"), S0_MM16.bp_grp_nm.as("prsppl_grp_nm6"))
					.view(DS0C_PRSPPL_GRP, v -> v.leftOuterJoin(S0_MM16).on(S0_M2.bp_grp_cd6.eq(S0_MM16.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP6.value()).eq(S0_MM16.bp_grp_typ))))
					.predicate(DS0C_PRSPPL_GRP, p -> p.cutoff$and(S0_M2.bp_grp_cd6.like(bind("prsppl_grp_cd6"))).cutoff$and(S0_MM16.bp_grp_nm.like(bind("prsppl_grp_nm6")))),
				when(boundOr("prsppl_grp_flg7"))
					.select(DS0C_PRSPPL_GRP, S0_M2.bp_grp_cd7.as("prsppl_grp_cd7"), S0_MM17.bp_grp_nm.as("prsppl_grp_nm7"))
					.view(DS0C_PRSPPL_GRP, v -> v.leftOuterJoin(S0_MM17).on(S0_M2.bp_grp_cd7.eq(S0_MM17.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP7.value()).eq(S0_MM17.bp_grp_typ))))
					.predicate(DS0C_PRSPPL_GRP, p -> p.cutoff$and(S0_M2.bp_grp_cd7.like(bind("prsppl_grp_cd7"))).cutoff$and(S0_MM17.bp_grp_nm.like(bind("prsppl_grp_nm7")))),
				when(boundOr("prsppl_grp_flg8"))
					.select(DS0C_PRSPPL_GRP, S0_M2.bp_grp_cd8.as("prsppl_grp_cd8"), S0_MM18.bp_grp_nm.as("prsppl_grp_nm8"))
					.view(DS0C_PRSPPL_GRP, v -> v.leftOuterJoin(S0_MM18).on(S0_M2.bp_grp_cd8.eq(S0_MM18.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP8.value()).eq(S0_MM18.bp_grp_typ))))
					.predicate(DS0C_PRSPPL_GRP, p -> p.cutoff$and(S0_M2.bp_grp_cd8.like(bind("prsppl_grp_cd8"))).cutoff$and(S0_MM18.bp_grp_nm.like(bind("prsppl_grp_nm8")))),
				when(boundOr("prsppl_grp_flg9"))
					.select(DS0C_PRSPPL_GRP, S0_M2.bp_grp_cd9.as("prsppl_grp_cd9"), S0_MM19.bp_grp_nm.as("prsppl_grp_nm9"))
					.view(DS0C_PRSPPL_GRP, v -> v.leftOuterJoin(S0_MM19).on(S0_M2.bp_grp_cd9.eq(S0_MM19.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP9.value()).eq(S0_MM19.bp_grp_typ))))
					.predicate(DS0C_PRSPPL_GRP, p -> p.cutoff$and(S0_M2.bp_grp_cd9.like(bind("prsppl_grp_cd9"))).cutoff$and(S0_MM19.bp_grp_nm.like(bind("prsppl_grp_nm9")))),
				when(boundOr("prsppl_grp_flg10"))
					.select(DS0C_PRSPPL_GRP, S0_M2.bp_grp_cd10.as("prsppl_grp_cd10"), S0_MM110.bp_grp_nm.as("prsppl_grp_nm10"))
					.view(DS0C_PRSPPL_GRP, v -> v.leftOuterJoin(S0_MM110).on(S0_M2.bp_grp_cd10.eq(S0_MM110.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP10.value()).eq(S0_MM110.bp_grp_typ))))
					.predicate(DS0C_PRSPPL_GRP, p -> p.cutoff$and(S0_M2.bp_grp_cd10.like(bind("prsppl_grp_cd10"))).cutoff$and(S0_MM110.bp_grp_nm.like(bind("prsppl_grp_nm10")))),
				when(boundOr("itm_grp_flg1"))
					.select(DS0C_ITM_GRP, S0_M8.itm_grp_cd1.as("itm_grp_cd1"), S0_MM21.itm_grp_nm.as("itm_grp_nm1"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM21).on(S0_M8.itm_grp_cd1.eq(S0_MM21.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP1.value()).eq(S0_MM21.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M8.itm_grp_cd1.like(bind("itm_grp_cd1"))).cutoff$and(S0_MM21.itm_grp_nm.like(bind("itm_grp_nm1")))),
				when(boundOr("itm_grp_flg2"))
					.select(DS0C_ITM_GRP, S0_M8.itm_grp_cd2.as("itm_grp_cd2"), S0_MM22.itm_grp_nm.as("itm_grp_nm2"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM22).on(S0_M8.itm_grp_cd2.eq(S0_MM22.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP2.value()).eq(S0_MM22.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M8.itm_grp_cd2.like(bind("itm_grp_cd2"))).cutoff$and(S0_MM22.itm_grp_nm.like(bind("itm_grp_nm2")))),
				when(boundOr("itm_grp_flg3"))
					.select(DS0C_ITM_GRP, S0_M8.itm_grp_cd3.as("itm_grp_cd3"), S0_MM23.itm_grp_nm.as("itm_grp_nm3"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM23).on(S0_M8.itm_grp_cd3.eq(S0_MM23.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP3.value()).eq(S0_MM23.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M8.itm_grp_cd3.like(bind("itm_grp_cd3"))).cutoff$and(S0_MM23.itm_grp_nm.like(bind("itm_grp_nm3")))),
				when(boundOr("itm_grp_flg4"))
					.select(DS0C_ITM_GRP, S0_M8.itm_grp_cd4.as("itm_grp_cd4"), S0_MM24.itm_grp_nm.as("itm_grp_nm4"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM24).on(S0_M8.itm_grp_cd4.eq(S0_MM24.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP4.value()).eq(S0_MM24.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M8.itm_grp_cd4.like(bind("itm_grp_cd4"))).cutoff$and(S0_MM24.itm_grp_nm.like(bind("itm_grp_nm4")))),
				when(boundOr("itm_grp_flg5"))
					.select(DS0C_ITM_GRP, S0_M8.itm_grp_cd5.as("itm_grp_cd5"), S0_MM25.itm_grp_nm.as("itm_grp_nm5"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM25).on(S0_M8.itm_grp_cd5.eq(S0_MM25.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP5.value()).eq(S0_MM25.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M8.itm_grp_cd5.like(bind("itm_grp_cd5"))).cutoff$and(S0_MM25.itm_grp_nm.like(bind("itm_grp_nm5")))),
				when(boundOr("itm_grp_flg6"))
					.select(DS0C_ITM_GRP, S0_M8.itm_grp_cd6.as("itm_grp_cd6"), S0_MM26.itm_grp_nm.as("itm_grp_nm6"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM26).on(S0_M8.itm_grp_cd6.eq(S0_MM26.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP6.value()).eq(S0_MM26.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M8.itm_grp_cd6.like(bind("itm_grp_cd6"))).cutoff$and(S0_MM26.itm_grp_nm.like(bind("itm_grp_nm6")))),
				when(boundOr("itm_grp_flg7"))
					.select(DS0C_ITM_GRP, S0_M8.itm_grp_cd7.as("itm_grp_cd7"), S0_MM27.itm_grp_nm.as("itm_grp_nm7"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM27).on(S0_M8.itm_grp_cd7.eq(S0_MM27.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP7.value()).eq(S0_MM27.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M8.itm_grp_cd7.like(bind("itm_grp_cd7"))).cutoff$and(S0_MM27.itm_grp_nm.like(bind("itm_grp_nm7")))),
				when(boundOr("itm_grp_flg8"))
					.select(DS0C_ITM_GRP, S0_M8.itm_grp_cd8.as("itm_grp_cd8"), S0_MM28.itm_grp_nm.as("itm_grp_nm8"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM28).on(S0_M8.itm_grp_cd8.eq(S0_MM28.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP8.value()).eq(S0_MM28.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M8.itm_grp_cd8.like(bind("itm_grp_cd8"))).cutoff$and(S0_MM28.itm_grp_nm.like(bind("itm_grp_nm8")))),
				when(boundOr("itm_grp_flg9"))
					.select(DS0C_ITM_GRP, S0_M8.itm_grp_cd9.as("itm_grp_cd9"), S0_MM29.itm_grp_nm.as("itm_grp_nm9"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM29).on(S0_M8.itm_grp_cd9.eq(S0_MM29.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP9.value()).eq(S0_MM29.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M8.itm_grp_cd9.like(bind("itm_grp_cd9"))).cutoff$and(S0_MM29.itm_grp_nm.like(bind("itm_grp_nm9")))),
				when(boundOr("itm_grp_flg10"))
					.select(DS0C_ITM_GRP, S0_M8.itm_grp_cd10.as("itm_grp_cd10"), S0_MM210.itm_grp_nm.as("itm_grp_nm10"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM210).on(S0_M8.itm_grp_cd10.eq(S0_MM210.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP10.value()).eq(S0_MM210.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M8.itm_grp_cd10.like(bind("itm_grp_cd10"))).cutoff$and(S0_MM210.itm_grp_nm.like(bind("itm_grp_nm10"))))
			)
			.setJoinInfo(
				joinInfo(
					j -> j
						.add(MST_PROV_SCHD_R.class, r -> toCondition(
							r.getStringNE("prov_schd_no")
						))
						.addSelect(m -> toArray(
							m.ptax_xrate_inpt_flg,
							m.tax_fix_flg,
							m.xrate_inpt_flg
						))
						.addMap((r, m) -> {
							r.setBooleanNE("tax_fix_flg", m.tax_fix_flg());
							r.setBooleanNE("xrate_inpt_flg", m.xrate_inpt_flg());
							r.setBooleanNE("ptax_xrate_inpt_flg", m.ptax_xrate_inpt_flg());
					}),
					j -> j
						.add(MST_ARR_PR_R.class, r -> toCondition(
							r.getStringNE("join_arr_pr_no_")
						))
						.addSelect(m -> toArray(
							m.dlv_slip_d_no
						))
						.addMap((r, m) -> {
							r.setStringNE("dlv_slip_d_no", m.dlv_slip_d_no());
					}),
					j -> j
						.add(MSVT_LOT_LIST_R.class, r -> toCondition(
							r.getStringNE("itm_cd"),
							r.getStringNE("itm_sub1"),
							r.getStringNE("itm_sub2"),
							r.getStringNE("itm_sub3"),
							r.getStringNE("lot_no"),
							r.getStringNE("sublot_no")
						))
						.addSelect(m -> toArray(
							m.ver_no
						))
						.addMap((r, m) -> {
							r.setStringNE("ver_no", m.ver_no());
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
							r.getStringNE("prsppl_cd")
						))
						.addSelect(m -> toArray(
							m.bp_nm,
							m.prov_amt_rnd_typ,
							m.prov_tax_rnd_typ
						))
						.addMap((r, m) -> {
							r.setStringNE("prsppl_nm", m.bp_nm());
							r.setStringNE("prov_amt_rnd_typ", m.prov_amt_rnd_typ());
							r.setStringNE("prov_tax_rnd_typ", m.prov_tax_rnd_typ());
					}),
					j -> j
						.add(MAM_WG_R.class, r -> toCondition(
							r.getStringNE("prsppl_wg_cd")
						))
						.addSelect(m -> toArray(
							m.wg_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("prsppl_wg_nm", m.wg_nm());
					}),
					j -> j
						.add(MAM_STR_LN_R.class, r -> toCondition(
							r.getStringNE("prsppl_loc_cd"),
							r.getStringNE("str_ln_cd")
						))
						.addSelect(m -> toArray(
							m.str_ln_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("str_ln_nm", m.str_ln_nm());
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
							r.setStringNE("tax_typ", m.tax_typ());
							r.setBooleanNE("inc_tax_flg", m.inc_tax_flg());
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
						.add(MAM_BIZ_RSN_R.class, r -> toCondition(
							r.getStringNE("xfr_rsn_cd")
						))
						.addSelect(m -> toArray(
							m.acxfr_gi_flg,
							m.biz_rsn_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("xfr_rsn_nm", m.biz_rsn_nm());
							r.setBooleanNE("acxfr_gi_flg", m.acxfr_gi_flg());
					})
				)
			);
	}
	
	/**
	 * -- MSBEL1160_MST_PROV_ACT_Query_S03
	 */
	static MCQueryPlan MSBEL1160_MST_PROV_ACT_S03() {
		MST_PROV_ACT_R S0_T1 = MST_PROV_ACT_R.create("T1");
		MST_SHIP_ACT_D_R S0_TT1 = MST_SHIP_ACT_D_R.create("TT1");
		MST_DLV_SLIP_R S0_TT2 = MST_DLV_SLIP_R.create("TT2");
		MSVT_LOT_LIST_R S0_T2 = MSVT_LOT_LIST_R.create("T2");
		MSVT_WRK_SNO_R S0_T3 = MSVT_WRK_SNO_R.create("T3");
		MAM_TRD_R S0_M1 = MAM_TRD_R.create("M1");
		MAM_BP_R S0_M2 = MAM_BP_R.create("M2");
		MAVM_RD_LOC_R S0_M3 = MAVM_RD_LOC_R.create("M3");
		MAM_SITE_R S0_M4 = MAM_SITE_R.create("M4");
		MAM_WG_R S0_M5 = MAM_WG_R.create("M5");
		MAM_LG_GRP_R S0_M6 = MAM_LG_GRP_R.create("M6");
		MAM_STR_LN_R S0_M7 = MAM_STR_LN_R.create("M7");
		MAM_ITM_R S0_M8 = MAM_ITM_R.create("M8");
		MAM_ITM_TYP_D_R S0_M9 = MAM_ITM_TYP_D_R.create("M9");
		MAM_SUNDRY_ITM_R S0_M10 = MAM_SUNDRY_ITM_R.create("M10");
		MAM_STK_GD_R S0_M11 = MAM_STK_GD_R.create("M11");
		MAM_CUR_R S0_M12 = MAM_CUR_R.create("M12");
		MAM_TAX_R S0_M13 = MAM_TAX_R.create("M13");
		MAM_DPT_R S0_M18 = MAM_DPT_R.create("M18");
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
		MAM_EDI_IF_CTL_R M_EDI_IF_CTL = MAM_EDI_IF_CTL_R.create("M19");
		
		MCDynamicSQLID DS0C_ITM_GRP = createDynamicSQLID("DS0C_ITM_GRP");
		MCDynamicSQLID DS0C_PRSPPL_GRP = createDynamicSQLID("DS0C_PRSPPL_GRP");
		
		return createQueryPlan()
			.setQuery(
				sql("MSBEL1160_MST_PROV_ACT_Query_S03")
					.mainQuery()
					.select(
						S0_T1.prov_act_no,
						S0_T1.prov_act_seq,
						S0_T1.prov_act_rev,
						S0_T1.slip_sts_typ,
						S0_T1.prov_schd_no,
						S0_T1.prov_src_act_typ,
						S0_T1.prov_src_act_no,
						S0_T1.trd_cd,
						S0_T1.trd_ptn_typ,
						S0_T1.xfr_rsn_cd,
						S0_T1.base_unit_cd,
						S0_T1.base_unit_qty.as("act_qty"),
						S0_T1.accpt_dt,
						S0_T1.ac_dt,
						S0_T1.ac_ym,
						S0_T1.base_ac_dt,
						S0_T1.wg_cd.as("prsppl_wg_cd"),
						S0_T1.prsppl_cd,
						S0_T1.ap_dpt_cd,
						S0_M18.dpt_nm.as("ap_dpt_nm"),
						S0_T1.prov_typ,
						S0_T1.prov_basis_typ,
						S0_T1.xrate_cd,
						S0_T1.xrate,
						S0_T1.ptax_xrate,
						S0_T1.trd_cur_cd,
						S0_T1.base_cur_cd,
						S0_T1.ptax_cur_cd,
						S0_T1.tax_cd,
						S0_T1.trd_cur_upri,
						S0_T1.trd_cur_upri.as("old_trd_cur_upri"),
						S0_T1.trd_cur_amt,
						S0_T1.trd_cur_tax_amt,
						S0_T1.trd_cur_amt.add(S0_T1.trd_cur_tax_amt).as("trd_cur_inc_tax_amt"),
						S0_T1.base_cur_upri,
						S0_T1.base_cur_amt,
						S0_T1.base_cur_tax_amt,
						S0_T1.base_cur_amt.add(S0_T1.base_cur_tax_amt).as("base_cur_inc_tax_amt"),
						S0_T1.ptax_cur_upri,
						S0_T1.ptax_cur_amt,
						S0_T1.ptax_cur_tax_amt,
						S0_T1.ptax_cur_amt.add(S0_T1.ptax_cur_tax_amt).as("ptax_cur_inc_tax_amt"),
						S0_T1.wtax_rate,
						S0_T1.wtax_amt,
						S0_T1.itm_cd,
						S0_T1.itm_sub1,
						S0_T1.itm_sub2,
						S0_T1.itm_sub3,
						coalesce(
							S0_M10.itm_nm,
							S0_M8.itm_nm
						).as("itm_nm"),
						S0_M8.itm_typ,
						S0_M8.itm_typ_d_cd,
						S0_M8.sundry_itm_flg,
						S0_M8.asset_mng_typ,
						S0_T1.loc_cd.as("prsppl_loc_cd"),
						S0_M3.loc_nm.as("prsppl_loc_nm"),
						S0_T1.str_ln_cd,
						S0_T1.lot_no,
						S0_T1.sublot_no,
						S0_T1.sno1,
						S0_T1.sno2,
						S0_T1.sno3,
						S0_T1.sno4,
						S0_T1.gd_cd,
						S0_T1.stk_id_typ,
						S0_T1.intr_rmrks,
						S0_T1.trd_d_rmrks,
						S0_T1.sub_char1,
						S0_T1.sub_char2,
						S0_T1.sub_char3,
						S0_T1.ins_usr_id,
						S0_T1.ins_usr_nm,
						S0_T1.ins_ts,
						S0_T1.ins_func_id,
						S0_T1.upd_cntr.as("prov_upd_cntr"),
						S0_T1.upd_usr_id,
						S0_T1.upd_usr_nm,
						S0_T1.upd_ts,
						S0_T1.upd_func_id,
						S0_T1.upd_srv_req_no,
						S0_M8.dec_place.as("base_unit_dec_place"),
						S0_M8.rnd_typ.as("base_unit_rnd_typ"),
						S0_TT1.dlv_slip_no,
						S0_TT1.dlv_slip_d_no,
						S0_TT2.slip_prnt_flg.as("dlv_prnted_flg"),
						S0_TT1.ship_act_no,
						S0_M3.lg_grp_cd,
						cases()
						.when(S0_TT2.slip_prnt_flg.eq(value(true))).then(S0_TT2.edi_flg)
						.when(M_EDI_IF_CTL.bp_cd.isNotNull()).then(value(true))
						.otherwise(value(false))
						.as("edi_flg"),
						addDynamicSelect(DS0C_PRSPPL_GRP),
						addDynamicSelect(DS0C_ITM_GRP)
					)
					.from(
						S0_T1
						.leftOuterJoin(S0_TT1).on(
							bracket(
								S0_T1.prov_src_act_no.eq(S0_TT1.ship_act_d_no)
								.and(S0_TT1.can_flg.eq(value(false)))
							)
						)
						.leftOuterJoin(S0_TT2).on(
							bracket(
								S0_TT1.dlv_slip_no.eq(S0_TT2.dlv_slip_no)
								.and(S0_TT2.slip_sts_typ.eq(value(MAC_SLIP_STS_TYP.CRT.value())))
							)
						)
						.innerJoin(S0_M3).on(
							bracket(
								S0_T1.loc_cd.eq(S0_M3.loc_cd)
							)
						)
						.leftOuterJoin(S0_M8).on(
							bracket(
								S0_T1.itm_cd.eq(S0_M8.itm_cd)
								.and(S0_T1.itm_sub1.eq(S0_M8.itm_sub1))
								.and(S0_T1.itm_sub2.eq(S0_M8.itm_sub2))
								.and(S0_T1.itm_sub3.eq(S0_M8.itm_sub3))
							)
						)
						.leftOuterJoin(S0_M10).on(
							bracket(
								S0_T1.itm_cd.eq(S0_M10.itm_cd)
								.and(S0_T1.itm_sub1.eq(S0_M10.itm_sub1))
								.and(S0_T1.itm_sub2.eq(S0_M10.itm_sub2))
								.and(S0_T1.itm_sub3.eq(S0_M10.itm_sub3))
								.and(S0_T1.sno1.eq(S0_M10.sno1))
								.and(S0_T1.sno2.eq(S0_M10.sno2))
								.and(S0_T1.sno3.eq(S0_M10.sno3))
								.and(S0_T1.sno4.eq(S0_M10.sno4))
							)
						)
						.leftOuterJoin(S0_M18).on(
							bracket(
								S0_T1.ap_dpt_cd.eq(S0_M18.dpt_cd)
								.and(S0_T1.ac_dt.between(S0_M18.st_dt, S0_M18.end_dt))
							)
						)
						.leftOuterJoin(M_EDI_IF_CTL).on(
								bracket(
										S0_TT2.bp_cd.eq(M_EDI_IF_CTL.bp_cd)
									.and(M_EDI_IF_CTL.if_proc_typ.eq(value(MAC_IF_PROC_TYP.BILL_SEND.value())))
									.and(S0_TT2.ac_dt.between(M_EDI_IF_CTL.st_dt, M_EDI_IF_CTL.end_dt))
									.and(M_EDI_IF_CTL.not_onr_prov_flg.eq(value(false)))
									.and(M_EDI_IF_CTL.del_flg.eq(value(false)))
								)
							)
						.addDynamicView()
						.addDynamicView(DS0C_PRSPPL_GRP)
						.addDynamicView(DS0C_ITM_GRP)
					)
					.where(
						value(0).eq(value(0))
						.and(S0_T1.prov_src_act_typ.eq(value(MSC_PROV_SRC_ACT_TYP.RET_SHIP.value())))
						.and(
							S0_T1.trd_ptn_typ.in(
								bind("prov_str"),
								bind("prov_rtn_str")
							)
						)
						.and(
							S0_T1.prov_typ.in(
								bind("ffr_prov_flg_str"),
								bind("onr_prov_flg_str")
							)
						)
						.addDynamicPredicate()
						.cutoff$and(S0_TT2.slip_prnt_flg.eq(bind("dlv_prnted_str")))
						.cutoff$and(S0_T1.accpt_dt.gte(bind("accpt_dt_fr")))
						.cutoff$and(S0_T1.accpt_dt.lte(bind("accpt_dt_to")))
						.cutoff$and(S0_T1.ac_ym.gte(bind("ac_ym_fr")))
						.cutoff$and(S0_T1.ac_ym.lte(bind("ac_ym_to")))
						.cutoff$and(S0_T1.ac_dt.gte(bind("ac_dt_fr")))
						.cutoff$and(S0_T1.ac_dt.lte(bind("ac_dt_to")))
						.cutoff$and(nullValue().gte(bind("arr_act_hm_fr")))
						.cutoff$and(nullValue().lte(bind("arr_act_hm_to")))
						.cutoff$and(S0_T1.trd_cd.like(bind("trd_cd")))
						.cutoff$and(S0_T1.prsppl_cd.like(bind("prsppl_cd")))
						.cutoff$and(S0_T1.ap_dpt_cd.like(bind("ap_dpt_cd")))
						.cutoff$and(S0_M18.dpt_nm.like(bind("ap_dpt_nm")))
						.cutoff$and(S0_T1.loc_cd.like(bind("prsppl_loc_cd")))
						.cutoff$and(S0_M3.loc_nm.like(bind("prsppl_loc_nm")))
						.cutoff$and(S0_M3.site_cd.like(bind("prsppl_site_cd")))
						.cutoff$and(S0_T1.wg_cd.like(bind("prsppl_wg_cd")))
						.cutoff$and(S0_M3.lg_grp_cd.like(bind("prsppl_lg_grp_cd")))
						.cutoff$and(S0_T1.str_ln_cd.like(bind("prsppl_str_ln_cd")))
						.cutoff$and(S0_M8.itm_typ.like(bind("itm_typ")))
						.cutoff$and(S0_M8.itm_typ_d_cd.like(bind("itm_typ_d_cd")))
						.cutoff$and(S0_T1.itm_cd.like(bind("itm_cd")))
						.cutoff$and(S0_T1.itm_sub1.like(bind("itm_sub1")))
						.cutoff$and(S0_T1.itm_sub2.like(bind("itm_sub2")))
						.cutoff$and(S0_T1.itm_sub3.like(bind("itm_sub3")))
						.cutoff$and(
							coalesce(
								S0_M10.itm_nm,
								S0_M8.itm_nm
							).like(bind("itm_nm"))
						)
						.cutoff$and(S0_T1.lot_no.like(bind("lot_no")))
						.cutoff$and(S0_T1.sublot_no.like(bind("sublot_no")))
						.cutoff$and(S0_T1.sno1.like(bind("sno1")))
						.cutoff$and(S0_T1.sno2.like(bind("sno2")))
						.cutoff$and(S0_T1.sno3.like(bind("sno3")))
						.cutoff$and(S0_T1.sno4.like(bind("sno4")))
						.cutoff$and(S0_T1.gd_cd.like(bind("gd_cd")))
						.cutoff$and(S0_T1.stk_id_typ.like(bind("stk_id_typ")))
						.cutoff$and(S0_T1.prov_basis_typ.like(bind("prov_basis_typ")))
						.cutoff$and(S0_TT1.dlv_slip_no.like(bind("dlv_slip_no")))
						.cutoff$and(S0_TT1.dlv_slip_d_no.like(bind("dlv_slip_d_no")))
						.cutoff$and(S0_T1.trd_cur_cd.like(bind("trd_cur_cd")))
						.cutoff$and(bind("base_cur_cd").neq(S0_T1.trd_cur_cd))
						.cutoff$and(S0_T1.tax_cd.like(bind("tax_cd")))
						.cutoff$and(S0_T1.prov_src_act_typ.like(bind("prov_src_act_typ")))
						.cutoff$and(S0_T1.prov_src_act_no.like(bind("prov_src_act_no")))
						.cutoff$and(S0_T1.prov_act_no.like(bind("prov_act_no")))
						.cutoff$and(S0_T1.intr_rmrks.like(bind("intr_rmrks")))
						.cutoff$and(S0_T1.trd_d_rmrks.like(bind("trd_d_rmrks")))
						.cutoff$and(S0_T1.sub_char1.like(bind("sub_char1")))
						.cutoff$and(S0_T1.sub_char2.like(bind("sub_char2")))
						.cutoff$and(S0_T1.sub_char3.like(bind("sub_char3")))
						.and(
							S0_T1.slip_sts_typ.eq(value(MAC_SLIP_STS_TYP.CRT.value()))
							.or(bind("dis_can_disp_flg").eq(value(true)))
							.cutoff$and(bind("print_flg_str").eq(value(false)))
						)
						.and(
								(
									bind("on_edi_flg").eq(value(true)).and(bind("off_edi_flg").eq(value(true)))
									.and(((
											bind("ope_prnt").eq(value(false)).or(
											cases()
											.when(S0_TT2.slip_prnt_flg.eq(value(true))).then(S0_TT2.edi_flg)
											.when(M_EDI_IF_CTL.bp_cd.isNotNull()).then(value(true))
											.otherwise(value(false)).eq(value(true))
											.and(S0_TT2.slip_prnt_flg.eq(value(false))))).or(
												cases()
												.when(S0_TT2.slip_prnt_flg.eq(value(true))).then(S0_TT2.edi_flg)
												.when(M_EDI_IF_CTL.bp_cd.isNotNull()).then(value(true))
												.otherwise(value(false)).eq(value(false)))))
								)
								.or( bind("on_edi_flg").eq(value(true)).and(bind("off_edi_flg").eq(value(false))).and(
										cases()
										.when(S0_TT2.slip_prnt_flg.eq(value(true))).then(S0_TT2.edi_flg)
										.when(M_EDI_IF_CTL.bp_cd.isNotNull()).then(value(true))
										.otherwise(value(false)).eq(value(true)))
										.and(S0_TT2.slip_prnt_flg.eq(value(false)).or(bind("ope_prnt").eq(value(false)))) )
								.or( bind("on_edi_flg").eq(value(false)).and(bind("off_edi_flg").eq(value(true))).and(
										cases()
										.when(S0_TT2.slip_prnt_flg.eq(value(true))).then(S0_TT2.edi_flg)
										.when(M_EDI_IF_CTL.bp_cd.isNotNull()).then(value(true))
										.otherwise(value(false))
										.eq(value(false))) )
						)
						.addDynamicPredicate(DS0C_PRSPPL_GRP)
						.addDynamicPredicate(DS0C_ITM_GRP)
					)
					.orderBy(
						S0_T1.prov_src_act_typ.asc(),
						S0_T1.prov_act_no.asc(),
						S0_T1.prov_act_seq.asc()
					)
			)
			.setDynamicSQLInfo(
				when(boundOr("ver_no"))
					.view(v -> v.leftOuterJoin(S0_T2).on(bracket(S0_T1.itm_cd.eq(S0_T2.itm_cd).and(S0_T1.itm_sub1.eq(S0_T2.itm_sub1)).and(S0_T1.itm_sub2.eq(S0_T2.itm_sub2)).and(S0_T1.itm_sub3.eq(S0_T2.itm_sub3)).and(S0_T1.lot_no.eq(S0_T2.lot_no)).and(S0_T1.sublot_no.eq(S0_T2.sublot_no)))))
					.predicate(p -> p.cutoff$and(S0_T2.ver_no.like(bind("ver_no")))),
				when(boundOr("wrk_no", "wrk_nm"))
					.view(v -> v.leftOuterJoin(S0_T3).on(bracket(S0_T1.sno1.eq(S0_T3.sno1))))
					.predicate(p -> p.cutoff$and(S0_T3.wrk_no.like(bind("wrk_no"))).cutoff$and(S0_T3.wrk_nm.like(bind("wrk_nm")))),
				when(boundOr("trd_nm"))
					.view(v -> v.leftOuterJoin(S0_M1).on(bracket(S0_T1.trd_cd.eq(S0_M1.trd_cd))))
					.predicate(p -> p.cutoff$and(S0_M1.trd_nm.like(bind("trd_nm")))),
				when(boundOr("prsppl_grp_flg1", "prsppl_grp_flg2", "prsppl_grp_flg3", "prsppl_grp_flg4", "prsppl_grp_flg5", "prsppl_grp_flg6", "prsppl_grp_flg7", "prsppl_grp_flg8", "prsppl_grp_flg9", "prsppl_grp_flg10", "subcon_flg_str", "prsppl_nm"))
					.view(v -> v.leftOuterJoin(S0_M2).on(bracket(S0_T1.prsppl_cd.eq(S0_M2.bp_cd))))
					.predicate(p -> p.cutoff$and(S0_M2.subcon_flg.eq(bind("subcon_flg_str"))).cutoff$and(S0_M2.bp_nm.like(bind("prsppl_nm")))),
				when(boundOr("prsppl_site_nm"))
					.view(v -> v.leftOuterJoin(S0_M4).on(bracket(S0_M3.site_cd.eq(S0_M4.site_cd))))
					.predicate(p -> p.cutoff$and(S0_M4.site_nm.like(bind("prsppl_site_nm")))),
				when(boundOr("prsppl_wg_nm"))
					.view(v -> v.leftOuterJoin(S0_M5).on(bracket(S0_T1.wg_cd.eq(S0_M5.wg_cd))))
					.predicate(p -> p.cutoff$and(S0_M5.wg_nm.like(bind("prsppl_wg_nm")))),
				when(boundOr("prsppl_lg_grp_nm"))
					.view(v -> v.leftOuterJoin(S0_M6).on(bracket(S0_M3.lg_grp_cd.eq(S0_M6.lg_grp_cd))))
					.predicate(p -> p.cutoff$and(S0_M6.lg_grp_nm.like(bind("prsppl_lg_grp_nm")))),
				when(boundOr("prsppl_str_ln_nm"))
					.view(v -> v.leftOuterJoin(S0_M7).on(bracket(S0_T1.loc_cd.eq(S0_M7.loc_cd).and(S0_T1.str_ln_cd.eq(S0_M7.str_ln_cd)))))
					.predicate(p -> p.cutoff$and(S0_M7.str_ln_nm.like(bind("prsppl_str_ln_nm")))),
				when(boundOr("itm_typ_d_nm"))
					.view(v -> v.leftOuterJoin(S0_M9).on(bracket(S0_M8.itm_typ.eq(S0_M9.itm_typ).and(S0_M8.itm_typ_d_cd.eq(S0_M9.itm_typ_d_cd)))))
					.predicate(p -> p.cutoff$and(S0_M9.itm_typ_d_nm.like(bind("itm_typ_d_nm")))),
				when(boundOr("gd_nm"))
					.view(v -> v.leftOuterJoin(S0_M11).on(bracket(S0_T1.gd_cd.eq(S0_M11.gd_cd))))
					.predicate(p -> p.cutoff$and(S0_M11.gd_nm.like(bind("gd_nm")))),
				when(boundOr("trd_cur_nm"))
					.view(v -> v.leftOuterJoin(S0_M12).on(bracket(S0_T1.trd_cur_cd.eq(S0_M12.cur_cd))))
					.predicate(p -> p.cutoff$and(S0_M12.cur_nm.like(bind("trd_cur_nm")))),
				when(boundOr("tax_nm"))
					.view(v -> v.leftOuterJoin(S0_M13).on(bracket(S0_T1.tax_cd.eq(S0_M13.tax_cd))))
					.predicate(p -> p.cutoff$and(S0_M13.tax_nm.like(bind("tax_nm")))),
				when(boundOr("prsppl_grp_flg1"))
					.select(DS0C_PRSPPL_GRP, S0_M2.bp_grp_cd1.as("prsppl_grp_cd1"), S0_MM11.bp_grp_nm.as("prsppl_grp_nm1"))
					.view(DS0C_PRSPPL_GRP, v -> v.leftOuterJoin(S0_MM11).on(S0_M2.bp_grp_cd1.eq(S0_MM11.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP1.value()).eq(S0_MM11.bp_grp_typ))))
					.predicate(DS0C_PRSPPL_GRP, p -> p.cutoff$and(S0_M2.bp_grp_cd1.like(bind("prsppl_grp_cd1"))).cutoff$and(S0_MM11.bp_grp_nm.like(bind("prsppl_grp_nm1")))),
				when(boundOr("prsppl_grp_flg2"))
					.select(DS0C_PRSPPL_GRP, S0_M2.bp_grp_cd2.as("prsppl_grp_cd2"), S0_MM12.bp_grp_nm.as("prsppl_grp_nm2"))
					.view(DS0C_PRSPPL_GRP, v -> v.leftOuterJoin(S0_MM12).on(S0_M2.bp_grp_cd2.eq(S0_MM12.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP2.value()).eq(S0_MM12.bp_grp_typ))))
					.predicate(DS0C_PRSPPL_GRP, p -> p.cutoff$and(S0_M2.bp_grp_cd2.like(bind("prsppl_grp_cd2"))).cutoff$and(S0_MM12.bp_grp_nm.like(bind("prsppl_grp_nm2")))),
				when(boundOr("prsppl_grp_flg3"))
					.select(DS0C_PRSPPL_GRP, S0_M2.bp_grp_cd3.as("prsppl_grp_cd3"), S0_MM13.bp_grp_nm.as("prsppl_grp_nm3"))
					.view(DS0C_PRSPPL_GRP, v -> v.leftOuterJoin(S0_MM13).on(S0_M2.bp_grp_cd3.eq(S0_MM13.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP3.value()).eq(S0_MM13.bp_grp_typ))))
					.predicate(DS0C_PRSPPL_GRP, p -> p.cutoff$and(S0_M2.bp_grp_cd3.like(bind("prsppl_grp_cd3"))).cutoff$and(S0_MM13.bp_grp_nm.like(bind("prsppl_grp_nm3")))),
				when(boundOr("prsppl_grp_flg4"))
					.select(DS0C_PRSPPL_GRP, S0_M2.bp_grp_cd4.as("prsppl_grp_cd4"), S0_MM14.bp_grp_nm.as("prsppl_grp_nm4"))
					.view(DS0C_PRSPPL_GRP, v -> v.leftOuterJoin(S0_MM14).on(S0_M2.bp_grp_cd4.eq(S0_MM14.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP4.value()).eq(S0_MM14.bp_grp_typ))))
					.predicate(DS0C_PRSPPL_GRP, p -> p.cutoff$and(S0_M2.bp_grp_cd4.like(bind("prsppl_grp_cd4"))).cutoff$and(S0_MM14.bp_grp_nm.like(bind("prsppl_grp_nm4")))),
				when(boundOr("prsppl_grp_flg5"))
					.select(DS0C_PRSPPL_GRP, S0_M2.bp_grp_cd5.as("prsppl_grp_cd5"), S0_MM15.bp_grp_nm.as("prsppl_grp_nm5"))
					.view(DS0C_PRSPPL_GRP, v -> v.leftOuterJoin(S0_MM15).on(S0_M2.bp_grp_cd5.eq(S0_MM15.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP5.value()).eq(S0_MM15.bp_grp_typ))))
					.predicate(DS0C_PRSPPL_GRP, p -> p.cutoff$and(S0_M2.bp_grp_cd5.like(bind("prsppl_grp_cd5"))).cutoff$and(S0_MM15.bp_grp_nm.like(bind("prsppl_grp_nm5")))),
				when(boundOr("prsppl_grp_flg6"))
					.select(DS0C_PRSPPL_GRP, S0_M2.bp_grp_cd6.as("prsppl_grp_cd6"), S0_MM16.bp_grp_nm.as("prsppl_grp_nm6"))
					.view(DS0C_PRSPPL_GRP, v -> v.leftOuterJoin(S0_MM16).on(S0_M2.bp_grp_cd6.eq(S0_MM16.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP6.value()).eq(S0_MM16.bp_grp_typ))))
					.predicate(DS0C_PRSPPL_GRP, p -> p.cutoff$and(S0_M2.bp_grp_cd6.like(bind("prsppl_grp_cd6"))).cutoff$and(S0_MM16.bp_grp_nm.like(bind("prsppl_grp_nm6")))),
				when(boundOr("prsppl_grp_flg7"))
					.select(DS0C_PRSPPL_GRP, S0_M2.bp_grp_cd7.as("prsppl_grp_cd7"), S0_MM17.bp_grp_nm.as("prsppl_grp_nm7"))
					.view(DS0C_PRSPPL_GRP, v -> v.leftOuterJoin(S0_MM17).on(S0_M2.bp_grp_cd7.eq(S0_MM17.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP7.value()).eq(S0_MM17.bp_grp_typ))))
					.predicate(DS0C_PRSPPL_GRP, p -> p.cutoff$and(S0_M2.bp_grp_cd7.like(bind("prsppl_grp_cd7"))).cutoff$and(S0_MM17.bp_grp_nm.like(bind("prsppl_grp_nm7")))),
				when(boundOr("prsppl_grp_flg8"))
					.select(DS0C_PRSPPL_GRP, S0_M2.bp_grp_cd8.as("prsppl_grp_cd8"), S0_MM18.bp_grp_nm.as("prsppl_grp_nm8"))
					.view(DS0C_PRSPPL_GRP, v -> v.leftOuterJoin(S0_MM18).on(S0_M2.bp_grp_cd8.eq(S0_MM18.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP8.value()).eq(S0_MM18.bp_grp_typ))))
					.predicate(DS0C_PRSPPL_GRP, p -> p.cutoff$and(S0_M2.bp_grp_cd8.like(bind("prsppl_grp_cd8"))).cutoff$and(S0_MM18.bp_grp_nm.like(bind("prsppl_grp_nm8")))),
				when(boundOr("prsppl_grp_flg9"))
					.select(DS0C_PRSPPL_GRP, S0_M2.bp_grp_cd9.as("prsppl_grp_cd9"), S0_MM19.bp_grp_nm.as("prsppl_grp_nm9"))
					.view(DS0C_PRSPPL_GRP, v -> v.leftOuterJoin(S0_MM19).on(S0_M2.bp_grp_cd9.eq(S0_MM19.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP9.value()).eq(S0_MM19.bp_grp_typ))))
					.predicate(DS0C_PRSPPL_GRP, p -> p.cutoff$and(S0_M2.bp_grp_cd9.like(bind("prsppl_grp_cd9"))).cutoff$and(S0_MM19.bp_grp_nm.like(bind("prsppl_grp_nm9")))),
				when(boundOr("prsppl_grp_flg10"))
					.select(DS0C_PRSPPL_GRP, S0_M2.bp_grp_cd10.as("prsppl_grp_cd10"), S0_MM110.bp_grp_nm.as("prsppl_grp_nm10"))
					.view(DS0C_PRSPPL_GRP, v -> v.leftOuterJoin(S0_MM110).on(S0_M2.bp_grp_cd10.eq(S0_MM110.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP10.value()).eq(S0_MM110.bp_grp_typ))))
					.predicate(DS0C_PRSPPL_GRP, p -> p.cutoff$and(S0_M2.bp_grp_cd10.like(bind("prsppl_grp_cd10"))).cutoff$and(S0_MM110.bp_grp_nm.like(bind("prsppl_grp_nm10")))),
				when(boundOr("itm_grp_flg1"))
					.select(DS0C_ITM_GRP, S0_M8.itm_grp_cd1.as("itm_grp_cd1"), S0_MM21.itm_grp_nm.as("itm_grp_nm1"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM21).on(S0_M8.itm_grp_cd1.eq(S0_MM21.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP1.value()).eq(S0_MM21.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M8.itm_grp_cd1.like(bind("itm_grp_cd1"))).cutoff$and(S0_MM21.itm_grp_nm.like(bind("itm_grp_nm1")))),
				when(boundOr("itm_grp_flg2"))
					.select(DS0C_ITM_GRP, S0_M8.itm_grp_cd2.as("itm_grp_cd2"), S0_MM22.itm_grp_nm.as("itm_grp_nm2"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM22).on(S0_M8.itm_grp_cd2.eq(S0_MM22.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP2.value()).eq(S0_MM22.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M8.itm_grp_cd2.like(bind("itm_grp_cd2"))).cutoff$and(S0_MM22.itm_grp_nm.like(bind("itm_grp_nm2")))),
				when(boundOr("itm_grp_flg3"))
					.select(DS0C_ITM_GRP, S0_M8.itm_grp_cd3.as("itm_grp_cd3"), S0_MM23.itm_grp_nm.as("itm_grp_nm3"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM23).on(S0_M8.itm_grp_cd3.eq(S0_MM23.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP3.value()).eq(S0_MM23.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M8.itm_grp_cd3.like(bind("itm_grp_cd3"))).cutoff$and(S0_MM23.itm_grp_nm.like(bind("itm_grp_nm3")))),
				when(boundOr("itm_grp_flg4"))
					.select(DS0C_ITM_GRP, S0_M8.itm_grp_cd4.as("itm_grp_cd4"), S0_MM24.itm_grp_nm.as("itm_grp_nm4"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM24).on(S0_M8.itm_grp_cd4.eq(S0_MM24.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP4.value()).eq(S0_MM24.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M8.itm_grp_cd4.like(bind("itm_grp_cd4"))).cutoff$and(S0_MM24.itm_grp_nm.like(bind("itm_grp_nm4")))),
				when(boundOr("itm_grp_flg5"))
					.select(DS0C_ITM_GRP, S0_M8.itm_grp_cd5.as("itm_grp_cd5"), S0_MM25.itm_grp_nm.as("itm_grp_nm5"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM25).on(S0_M8.itm_grp_cd5.eq(S0_MM25.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP5.value()).eq(S0_MM25.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M8.itm_grp_cd5.like(bind("itm_grp_cd5"))).cutoff$and(S0_MM25.itm_grp_nm.like(bind("itm_grp_nm5")))),
				when(boundOr("itm_grp_flg6"))
					.select(DS0C_ITM_GRP, S0_M8.itm_grp_cd6.as("itm_grp_cd6"), S0_MM26.itm_grp_nm.as("itm_grp_nm6"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM26).on(S0_M8.itm_grp_cd6.eq(S0_MM26.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP6.value()).eq(S0_MM26.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M8.itm_grp_cd6.like(bind("itm_grp_cd6"))).cutoff$and(S0_MM26.itm_grp_nm.like(bind("itm_grp_nm6")))),
				when(boundOr("itm_grp_flg7"))
					.select(DS0C_ITM_GRP, S0_M8.itm_grp_cd7.as("itm_grp_cd7"), S0_MM27.itm_grp_nm.as("itm_grp_nm7"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM27).on(S0_M8.itm_grp_cd7.eq(S0_MM27.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP7.value()).eq(S0_MM27.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M8.itm_grp_cd7.like(bind("itm_grp_cd7"))).cutoff$and(S0_MM27.itm_grp_nm.like(bind("itm_grp_nm7")))),
				when(boundOr("itm_grp_flg8"))
					.select(DS0C_ITM_GRP, S0_M8.itm_grp_cd8.as("itm_grp_cd8"), S0_MM28.itm_grp_nm.as("itm_grp_nm8"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM28).on(S0_M8.itm_grp_cd8.eq(S0_MM28.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP8.value()).eq(S0_MM28.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M8.itm_grp_cd8.like(bind("itm_grp_cd8"))).cutoff$and(S0_MM28.itm_grp_nm.like(bind("itm_grp_nm8")))),
				when(boundOr("itm_grp_flg9"))
					.select(DS0C_ITM_GRP, S0_M8.itm_grp_cd9.as("itm_grp_cd9"), S0_MM29.itm_grp_nm.as("itm_grp_nm9"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM29).on(S0_M8.itm_grp_cd9.eq(S0_MM29.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP9.value()).eq(S0_MM29.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M8.itm_grp_cd9.like(bind("itm_grp_cd9"))).cutoff$and(S0_MM29.itm_grp_nm.like(bind("itm_grp_nm9")))),
				when(boundOr("itm_grp_flg10"))
					.select(DS0C_ITM_GRP, S0_M8.itm_grp_cd10.as("itm_grp_cd10"), S0_MM210.itm_grp_nm.as("itm_grp_nm10"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM210).on(S0_M8.itm_grp_cd10.eq(S0_MM210.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP10.value()).eq(S0_MM210.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M8.itm_grp_cd10.like(bind("itm_grp_cd10"))).cutoff$and(S0_MM210.itm_grp_nm.like(bind("itm_grp_nm10"))))
			)
			.setJoinInfo(
				joinInfo(
					j -> j
						.add(MST_PROV_SCHD_R.class, r -> toCondition(
							r.getStringNE("prov_schd_no")
						))
						.addSelect(m -> toArray(
							m.ptax_xrate_inpt_flg,
							m.tax_fix_flg,
							m.xrate_inpt_flg
						))
						.addMap((r, m) -> {
							r.setBooleanNE("tax_fix_flg", m.tax_fix_flg());
							r.setBooleanNE("xrate_inpt_flg", m.xrate_inpt_flg());
							r.setBooleanNE("ptax_xrate_inpt_flg", m.ptax_xrate_inpt_flg());
					}),
					j -> j
						.add(MSVT_LOT_LIST_R.class, r -> toCondition(
							r.getStringNE("itm_cd"),
							r.getStringNE("itm_sub1"),
							r.getStringNE("itm_sub2"),
							r.getStringNE("itm_sub3"),
							r.getStringNE("lot_no"),
							r.getStringNE("sublot_no")
						))
						.addSelect(m -> toArray(
							m.ver_no
						))
						.addMap((r, m) -> {
							r.setStringNE("ver_no", m.ver_no());
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
							r.getStringNE("prsppl_cd")
						))
						.addSelect(m -> toArray(
							m.bp_nm,
							m.prov_amt_rnd_typ,
							m.prov_tax_rnd_typ
						))
						.addMap((r, m) -> {
							r.setStringNE("prsppl_nm", m.bp_nm());
							r.setStringNE("prov_amt_rnd_typ", m.prov_amt_rnd_typ());
							r.setStringNE("prov_tax_rnd_typ", m.prov_tax_rnd_typ());
					}),
					j -> j
						.add(MAM_WG_R.class, r -> toCondition(
							r.getStringNE("prsppl_wg_cd")
						))
						.addSelect(m -> toArray(
							m.wg_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("prsppl_wg_nm", m.wg_nm());
					}),
					j -> j
						.add(MAM_STR_LN_R.class, r -> toCondition(
							r.getStringNE("prsppl_loc_cd"),
							r.getStringNE("str_ln_cd")
						))
						.addSelect(m -> toArray(
							m.str_ln_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("str_ln_nm", m.str_ln_nm());
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
							r.setStringNE("tax_typ", m.tax_typ());
							r.setBooleanNE("inc_tax_flg", m.inc_tax_flg());
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
						.add(MAM_BIZ_RSN_R.class, r -> toCondition(
							r.getStringNE("xfr_rsn_cd")
						))
						.addSelect(m -> toArray(
							m.acxfr_gi_flg,
							m.biz_rsn_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("xfr_rsn_nm", m.biz_rsn_nm());
							r.setBooleanNE("acxfr_gi_flg", m.acxfr_gi_flg());
					})
				)
			);
	}
	
	/**
	 * -- MSBEL1160_MST_PROV_ACT_Query_S04
	 */
	static MCQueryPlan MSBEL1160_MST_PROV_ACT_S04() {
		MST_PROV_ACT_R S0_T1 = MST_PROV_ACT_R.create("T1");
		MCTempView S0_TT1 = createTempView("TT1");
		MST_ARR_ACT_R S0_TT4 = MST_ARR_ACT_R.create("TT4");
		MST_DLV_SLIP_R S0_TT5 = MST_DLV_SLIP_R.create("TT5");
		MSVT_LOT_LIST_R S0_T2 = MSVT_LOT_LIST_R.create("T2");
		MSVT_WRK_SNO_R S0_T3 = MSVT_WRK_SNO_R.create("T3");
		MAM_TRD_R S0_M1 = MAM_TRD_R.create("M1");
		MAM_BP_R S0_M2 = MAM_BP_R.create("M2");
		MAVM_RD_LOC_R S0_M3 = MAVM_RD_LOC_R.create("M3");
		MAM_SITE_R S0_M4 = MAM_SITE_R.create("M4");
		MAM_WG_R S0_M5 = MAM_WG_R.create("M5");
		MAM_LG_GRP_R S0_M6 = MAM_LG_GRP_R.create("M6");
		MAM_STR_LN_R S0_M7 = MAM_STR_LN_R.create("M7");
		MAM_ITM_R S0_M8 = MAM_ITM_R.create("M8");
		MAM_ITM_TYP_D_R S0_M9 = MAM_ITM_TYP_D_R.create("M9");
		MAM_SUNDRY_ITM_R S0_M10 = MAM_SUNDRY_ITM_R.create("M10");
		MAM_STK_GD_R S0_M11 = MAM_STK_GD_R.create("M11");
		MAM_CUR_R S0_M12 = MAM_CUR_R.create("M12");
		MAM_TAX_R S0_M13 = MAM_TAX_R.create("M13");
		MAM_DPT_R S0_M18 = MAM_DPT_R.create("M18");
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
		MST_PURC_ACT_IO_R S1_PT1 = MST_PURC_ACT_IO_R.create("PT1");
		MST_PURC_ACT_D_R S1_PT2 = MST_PURC_ACT_D_R.create("PT2");
		MST_PURC_ACT_R S1_PT3 = MST_PURC_ACT_R.create("PT3");
		MST_DLV_SLIP_R S2_W1 = MST_DLV_SLIP_R.create("W1");
		MST_PROV_ACT_R S3_W1 = MST_PROV_ACT_R.create("W1");
		MAM_EDI_IF_CTL_R M_EDI_IF_CTL = MAM_EDI_IF_CTL_R.create("M19");
		
		MCDynamicSQLID DS0C_ITM_GRP = createDynamicSQLID("DS0C_ITM_GRP");
		MCDynamicSQLID DS0C_PRSPPL_GRP = createDynamicSQLID("DS0C_PRSPPL_GRP");
		
		return createQueryPlan()
			.setQuery(
				sql("MSBEL1160_MST_PROV_ACT_Query_S04")
					.mainQuery()
					.select(
						S0_T1.prov_act_no,
						S0_T1.prov_act_seq,
						S0_T1.prov_act_rev,
						S0_T1.slip_sts_typ,
						S0_T1.prov_schd_no,
						S0_T1.prov_src_act_typ,
						S0_T1.prov_src_act_no,
						S0_T1.trd_cd,
						S0_T1.trd_ptn_typ,
						S0_T1.xfr_rsn_cd,
						S0_T1.base_unit_cd,
						S0_T1.base_unit_qty.as("act_qty"),
						S0_T1.accpt_dt,
						S0_T1.ac_dt,
						S0_T1.ac_ym,
						S0_T1.base_ac_dt,
						trunc(
							S0_TT4.arr_tm,
							MCDateFmt.DD
						).as("arr_act_dt"),
						S0_TT4.arr_tm.as("arr_act_hm"),
						S0_T1.wg_cd.as("prsppl_wg_cd"),
						S0_T1.prsppl_cd,
						S0_T1.ap_dpt_cd,
						S0_M18.dpt_nm.as("ap_dpt_nm"),
						S0_T1.prov_typ,
						S0_T1.prov_basis_typ,
						S0_T1.xrate_cd,
						S0_T1.xrate,
						S0_T1.ptax_xrate,
						S0_T1.trd_cur_cd,
						S0_T1.base_cur_cd,
						S0_T1.ptax_cur_cd,
						S0_T1.tax_cd,
						S0_T1.trd_cur_upri,
						S0_T1.trd_cur_upri.as("old_trd_cur_upri"),
						S0_T1.trd_cur_amt,
						S0_T1.trd_cur_tax_amt,
						S0_T1.trd_cur_amt.add(S0_T1.trd_cur_tax_amt).as("trd_cur_inc_tax_amt"),
						S0_T1.base_cur_upri,
						S0_T1.base_cur_amt,
						S0_T1.base_cur_tax_amt,
						S0_T1.base_cur_amt.add(S0_T1.base_cur_tax_amt).as("base_cur_inc_tax_amt"),
						S0_T1.ptax_cur_upri,
						S0_T1.ptax_cur_amt,
						S0_T1.ptax_cur_tax_amt,
						S0_T1.ptax_cur_amt.add(S0_T1.ptax_cur_tax_amt).as("ptax_cur_inc_tax_amt"),
						S0_T1.wtax_rate,
						S0_T1.wtax_amt,
						S0_T1.itm_cd,
						S0_T1.itm_sub1,
						S0_T1.itm_sub2,
						S0_T1.itm_sub3,
						coalesce(
							S0_M10.itm_nm,
							S0_M8.itm_nm
						).as("itm_nm"),
						S0_M8.itm_typ,
						S0_M8.itm_typ_d_cd,
						S0_M8.sundry_itm_flg,
						S0_M8.asset_mng_typ,
						S0_T1.loc_cd.as("prsppl_loc_cd"),
						S0_M3.loc_nm.as("prsppl_loc_nm"),
						S0_T1.str_ln_cd,
						S0_T1.lot_no,
						S0_T1.sublot_no,
						S0_T1.sno1,
						S0_T1.sno2,
						S0_T1.sno3,
						S0_T1.sno4,
						S0_T1.gd_cd,
						S0_T1.stk_id_typ,
						S0_T1.intr_rmrks,
						S0_T1.trd_d_rmrks,
						S0_T1.sub_char1,
						S0_T1.sub_char2,
						S0_T1.sub_char3,
						S0_T1.ins_usr_id,
						S0_T1.ins_usr_nm,
						S0_T1.ins_ts,
						S0_T1.ins_func_id,
						S0_T1.upd_cntr.as("prov_upd_cntr"),
						S0_T1.upd_usr_id,
						S0_T1.upd_usr_nm,
						S0_T1.upd_ts,
						S0_T1.upd_func_id,
						S0_T1.upd_srv_req_no,
						S0_M8.dec_place.as("base_unit_dec_place"),
						S0_M8.rnd_typ.as("base_unit_rnd_typ"),
						S0_T1.dlv_slip_no,
						S0_T1.dlv_slip_d_no,
						S0_TT5.slip_prnt_flg.as("dlv_prnted_flg"),
						S0_TT1.pr(S1_PT1.arr_act_no),
						S0_TT1.pr(S1_PT1.purc_act_d_no),
						S0_TT1.pr(S1_PT3.purc_act_no),
						S0_TT1.pr(S1_PT3.po_no),
						cases()
						.when(S0_TT5.slip_prnt_flg.eq(value(true))).then(S0_TT5.edi_flg)
						.when(M_EDI_IF_CTL.bp_cd.isNotNull()).then(value(true))
						.otherwise(value(false))
						.as("edi_flg"),
						addDynamicSelect(DS0C_PRSPPL_GRP),
						addDynamicSelect(DS0C_ITM_GRP)
					)
					.from(
						S0_T1
						.leftOuterJoin(
							subQuery()
							.select(
								S1_PT1.arr_act_no,
								S1_PT1.purc_act_io_no,
								S1_PT1.purc_act_d_no,
								S1_PT3.purc_act_no,
								S1_PT3.po_no
							)
							.from(
								S1_PT1
								.innerJoin(S1_PT2).on(
									S1_PT1.purc_act_d_no.eq(S1_PT2.purc_act_d_no)
									.and(S1_PT1.purc_act_d_seq.eq(S1_PT2.purc_act_d_seq))
								)
								.innerJoin(S1_PT3).on(
									S1_PT2.purc_act_no.eq(S1_PT3.purc_act_no)
									.and(S1_PT2.purc_act_seq.eq(S1_PT3.purc_act_seq))
								)
							)
							.where(
								value(0).eq(value(0))
								.and(S1_PT3.slip_sts_typ.eq(value(MAC_SLIP_STS_TYP.CRT.value())))
							).view(S0_TT1)
						).on(
							bracket(
								S0_T1.prov_src_act_no.eq(S0_TT1.pr(S1_PT1.purc_act_io_no))
							)
						)
						.leftOuterJoin(S0_TT4).on(
							bracket(
								S0_TT1.pr(S1_PT1.arr_act_no).eq(S0_TT4.arr_act_no)
							)
						)
						.leftOuterJoin(S0_TT5).on(
							bracket(
								S0_T1.dlv_slip_no.eq(S0_TT5.dlv_slip_no)
								.and(
									S0_TT5.slip_sts_typ.eq(value(MAC_SLIP_STS_TYP.CRT.value()))
									.cutoff$or(
										bind("print_flg_str").eq(value(true))
										.and(
											notExists(
												subQuery()
												.select(value("X"))
												.from(S2_W1)
												.where(
													value(0).eq(value(0))
													.and(S0_TT5.dlv_slip_no.eq(S2_W1.dlv_slip_no))
													.and(S0_TT5.dlv_slip_seq.lt(S2_W1.dlv_slip_seq))
												)
											)
										)
									)
								)
							)
						)
						.innerJoin(S0_M3).on(
							bracket(
								S0_T1.loc_cd.eq(S0_M3.loc_cd)
							)
						)
						.leftOuterJoin(S0_M8).on(
							bracket(
								S0_T1.itm_cd.eq(S0_M8.itm_cd)
								.and(S0_T1.itm_sub1.eq(S0_M8.itm_sub1))
								.and(S0_T1.itm_sub2.eq(S0_M8.itm_sub2))
								.and(S0_T1.itm_sub3.eq(S0_M8.itm_sub3))
							)
						)
						.leftOuterJoin(S0_M10).on(
							bracket(
								S0_T1.itm_cd.eq(S0_M10.itm_cd)
								.and(S0_T1.itm_sub1.eq(S0_M10.itm_sub1))
								.and(S0_T1.itm_sub2.eq(S0_M10.itm_sub2))
								.and(S0_T1.itm_sub3.eq(S0_M10.itm_sub3))
								.and(S0_T1.sno1.eq(S0_M10.sno1))
								.and(S0_T1.sno2.eq(S0_M10.sno2))
								.and(S0_T1.sno3.eq(S0_M10.sno3))
								.and(S0_T1.sno4.eq(S0_M10.sno4))
							)
						)
						.leftOuterJoin(S0_M18).on(
							bracket(
								S0_T1.ap_dpt_cd.eq(S0_M18.dpt_cd)
								.and(S0_T1.ac_dt.between(S0_M18.st_dt, S0_M18.end_dt))
							)
						)
						.leftOuterJoin(M_EDI_IF_CTL).on(
								bracket(
										S0_TT5.bp_cd.eq(M_EDI_IF_CTL.bp_cd)
									.and(M_EDI_IF_CTL.if_proc_typ.eq(value(MAC_IF_PROC_TYP.BILL_SEND.value())))
									.and(S0_TT5.ac_dt.between(M_EDI_IF_CTL.st_dt, M_EDI_IF_CTL.end_dt))
									.and(M_EDI_IF_CTL.not_onr_prov_flg.eq(value(false)))
									.and(M_EDI_IF_CTL.del_flg.eq(value(false)))
								)
							)
						.addDynamicView()
						.addDynamicView(DS0C_PRSPPL_GRP)
						.addDynamicView(DS0C_ITM_GRP)
					)
					.where(
						value(0).eq(value(0))
						.and(S0_T1.prov_src_act_typ.eq(value(MSC_PROV_SRC_ACT_TYP.DDLV.value())))
						.and(
							S0_T1.trd_ptn_typ.in(
								bind("prov_str"),
								bind("prov_rtn_str")
							)
						)
						.and(
							S0_T1.prov_typ.in(
								bind("ffr_prov_flg_str"),
								bind("onr_prov_flg_str")
							)
						)
						.addDynamicPredicate()
						.cutoff$and(
							bracket(
								S0_TT5.slip_prnt_flg.eq(bind("dlv_prnted_str"))
								.or(S0_TT5.slip_prnt_flg.isNull())
								.and(bind("dlv_prnted_str").eq(value(false)))
							)
						)
						.cutoff$and(S0_T1.accpt_dt.gte(bind("accpt_dt_fr")))
						.cutoff$and(S0_T1.accpt_dt.lte(bind("accpt_dt_to")))
						.cutoff$and(S0_T1.ac_ym.gte(bind("ac_ym_fr")))
						.cutoff$and(S0_T1.ac_ym.lte(bind("ac_ym_to")))
						.cutoff$and(S0_T1.ac_dt.gte(bind("ac_dt_fr")))
						.cutoff$and(S0_T1.ac_dt.lte(bind("ac_dt_to")))
						.cutoff$and(S0_TT4.arr_tm.gte(bind("arr_act_hm_fr")))
						.cutoff$and(S0_TT4.arr_tm.lte(bind("arr_act_hm_to")))
						.cutoff$and(S0_T1.trd_cd.like(bind("trd_cd")))
						.cutoff$and(S0_T1.prsppl_cd.like(bind("prsppl_cd")))
						.cutoff$and(S0_T1.ap_dpt_cd.like(bind("ap_dpt_cd")))
						.cutoff$and(S0_M18.dpt_nm.like(bind("ap_dpt_nm")))
						.cutoff$and(S0_T1.loc_cd.like(bind("prsppl_loc_cd")))
						.cutoff$and(S0_M3.loc_nm.like(bind("prsppl_loc_nm")))
						.cutoff$and(S0_M3.site_cd.like(bind("prsppl_site_cd")))
						.cutoff$and(S0_T1.wg_cd.like(bind("prsppl_wg_cd")))
						.cutoff$and(S0_M3.lg_grp_cd.like(bind("prsppl_lg_grp_cd")))
						.cutoff$and(S0_T1.str_ln_cd.like(bind("prsppl_str_ln_cd")))
						.cutoff$and(S0_M8.itm_typ.like(bind("itm_typ")))
						.cutoff$and(S0_M8.itm_typ_d_cd.like(bind("itm_typ_d_cd")))
						.cutoff$and(S0_T1.itm_cd.like(bind("itm_cd")))
						.cutoff$and(S0_T1.itm_sub1.like(bind("itm_sub1")))
						.cutoff$and(S0_T1.itm_sub2.like(bind("itm_sub2")))
						.cutoff$and(S0_T1.itm_sub3.like(bind("itm_sub3")))
						.cutoff$and(
							coalesce(
								S0_M10.itm_nm,
								S0_M8.itm_nm
							).like(bind("itm_nm"))
						)
						.cutoff$and(S0_T1.lot_no.like(bind("lot_no")))
						.cutoff$and(S0_T1.sublot_no.like(bind("sublot_no")))
						.cutoff$and(S0_T1.sno1.like(bind("sno1")))
						.cutoff$and(S0_T1.sno2.like(bind("sno2")))
						.cutoff$and(S0_T1.sno3.like(bind("sno3")))
						.cutoff$and(S0_T1.sno4.like(bind("sno4")))
						.cutoff$and(S0_T1.gd_cd.like(bind("gd_cd")))
						.cutoff$and(S0_T1.stk_id_typ.like(bind("stk_id_typ")))
						.cutoff$and(S0_T1.prov_basis_typ.like(bind("prov_basis_typ")))
						.cutoff$and(S0_T1.dlv_slip_no.like(bind("dlv_slip_no")))
						.cutoff$and(S0_T1.dlv_slip_d_no.like(bind("dlv_slip_d_no")))
						.cutoff$and(S0_T1.trd_cur_cd.like(bind("trd_cur_cd")))
						.cutoff$and(bind("base_cur_cd").neq(S0_T1.trd_cur_cd))
						.cutoff$and(S0_T1.tax_cd.like(bind("tax_cd")))
						.cutoff$and(S0_T1.prov_src_act_typ.like(bind("prov_src_act_typ")))
						.cutoff$and(S0_T1.prov_src_act_no.like(bind("prov_src_act_no")))
						.cutoff$and(S0_T1.prov_act_no.like(bind("prov_act_no")))
						.cutoff$and(S0_T1.intr_rmrks.like(bind("intr_rmrks")))
						.cutoff$and(S0_T1.trd_d_rmrks.like(bind("trd_d_rmrks")))
						.cutoff$and(S0_T1.sub_char1.like(bind("sub_char1")))
						.cutoff$and(S0_T1.sub_char2.like(bind("sub_char2")))
						.cutoff$and(S0_T1.sub_char3.like(bind("sub_char3")))
						.and(
							S0_T1.slip_sts_typ.eq(value(MAC_SLIP_STS_TYP.CRT.value()))
							.or(bind("dis_can_disp_flg").eq(value(true)))
						)
						.cutoff$and(
							bind("print_flg_str").eq(value(true))
							.and(
								notExists(
									subQuery()
									.select(value("X"))
									.from(S3_W1)
									.where(
										value(0).eq(value(0))
										.and(S0_T1.prov_act_no.eq(S3_W1.prov_act_no))
										.and(S0_T1.prov_act_seq.lt(S3_W1.prov_act_seq))
									)
								)
							)
						)
						.and(
								(
									bind("on_edi_flg").eq(value(true)).and(bind("off_edi_flg").eq(value(true)))
									.and(((
											bind("ope_prnt").eq(value(false)).or(
											cases()
											.when(S0_TT5.slip_prnt_flg.eq(value(true))).then(S0_TT5.edi_flg)
											.when(M_EDI_IF_CTL.bp_cd.isNotNull()).then(value(true))
											.otherwise(value(false)).eq(value(true))
											.and(S0_TT5.slip_prnt_flg.eq(value(false))))).or(
												cases()
												.when(S0_TT5.slip_prnt_flg.eq(value(true))).then(S0_TT5.edi_flg)
												.when(M_EDI_IF_CTL.bp_cd.isNotNull()).then(value(true))
												.otherwise(value(false)).eq(value(false)))))
								)
								.or( bind("on_edi_flg").eq(value(true)).and(bind("off_edi_flg").eq(value(false))).and(
										cases()
										.when(S0_TT5.slip_prnt_flg.eq(value(true))).then(S0_TT5.edi_flg)
										.when(M_EDI_IF_CTL.bp_cd.isNotNull()).then(value(true))
										.otherwise(value(false)).eq(value(true)))
										.and(S0_TT5.slip_prnt_flg.eq(value(false)).or(bind("ope_prnt").eq(value(false)))) )
								.or( bind("on_edi_flg").eq(value(false)).and(bind("off_edi_flg").eq(value(true))).and(
										cases()
										.when(S0_TT5.slip_prnt_flg.eq(value(true))).then(S0_TT5.edi_flg)
										.when(M_EDI_IF_CTL.bp_cd.isNotNull()).then(value(true))
										.otherwise(value(false))
										.eq(value(false))) )
						)
						.addDynamicPredicate(DS0C_PRSPPL_GRP)
						.addDynamicPredicate(DS0C_ITM_GRP)
					)
					.orderBy(
						S0_T1.prov_src_act_typ.asc(),
						S0_T1.prov_act_no.asc(),
						S0_T1.prov_act_seq.asc()
					)
			)
			.setDynamicSQLInfo(
				when(boundOr("ver_no"))
					.view(v -> v.leftOuterJoin(S0_T2).on(bracket(S0_T1.itm_cd.eq(S0_T2.itm_cd).and(S0_T1.itm_sub1.eq(S0_T2.itm_sub1)).and(S0_T1.itm_sub2.eq(S0_T2.itm_sub2)).and(S0_T1.itm_sub3.eq(S0_T2.itm_sub3)).and(S0_T1.lot_no.eq(S0_T2.lot_no)).and(S0_T1.sublot_no.eq(S0_T2.sublot_no)))))
					.predicate(p -> p.cutoff$and(S0_T2.ver_no.like(bind("ver_no")))),
				when(boundOr("wrk_no", "wrk_nm"))
					.view(v -> v.leftOuterJoin(S0_T3).on(bracket(S0_T1.sno1.eq(S0_T3.sno1))))
					.predicate(p -> p.cutoff$and(S0_T3.wrk_no.like(bind("wrk_no"))).cutoff$and(S0_T3.wrk_nm.like(bind("wrk_nm")))),
				when(boundOr("trd_nm"))
					.view(v -> v.leftOuterJoin(S0_M1).on(bracket(S0_T1.trd_cd.eq(S0_M1.trd_cd))))
					.predicate(p -> p.cutoff$and(S0_M1.trd_nm.like(bind("trd_nm")))),
				when(boundOr("prsppl_grp_flg1", "prsppl_grp_flg2", "prsppl_grp_flg3", "prsppl_grp_flg4", "prsppl_grp_flg5", "prsppl_grp_flg6", "prsppl_grp_flg7", "prsppl_grp_flg8", "prsppl_grp_flg9", "prsppl_grp_flg10", "subcon_flg_str", "prsppl_nm"))
					.view(v -> v.leftOuterJoin(S0_M2).on(bracket(S0_T1.prsppl_cd.eq(S0_M2.bp_cd))))
					.predicate(p -> p.cutoff$and(S0_M2.subcon_flg.eq(bind("subcon_flg_str"))).cutoff$and(S0_M2.bp_nm.like(bind("prsppl_nm")))),
				when(boundOr("prsppl_site_nm"))
					.view(v -> v.leftOuterJoin(S0_M4).on(bracket(S0_M3.site_cd.eq(S0_M4.site_cd))))
					.predicate(p -> p.cutoff$and(S0_M4.site_nm.like(bind("prsppl_site_nm")))),
				when(boundOr("prsppl_wg_nm"))
					.view(v -> v.leftOuterJoin(S0_M5).on(bracket(S0_T1.wg_cd.eq(S0_M5.wg_cd))))
					.predicate(p -> p.cutoff$and(S0_M5.wg_nm.like(bind("prsppl_wg_nm")))),
				when(boundOr("prsppl_lg_grp_nm"))
					.view(v -> v.leftOuterJoin(S0_M6).on(bracket(S0_M3.lg_grp_cd.eq(S0_M6.lg_grp_cd))))
					.predicate(p -> p.cutoff$and(S0_M6.lg_grp_nm.like(bind("prsppl_lg_grp_nm")))),
				when(boundOr("prsppl_str_ln_nm"))
					.view(v -> v.leftOuterJoin(S0_M7).on(bracket(S0_T1.loc_cd.eq(S0_M7.loc_cd).and(S0_T1.str_ln_cd.eq(S0_M7.str_ln_cd)))))
					.predicate(p -> p.cutoff$and(S0_M7.str_ln_nm.like(bind("prsppl_str_ln_nm")))),
				when(boundOr("itm_typ_d_nm"))
					.view(v -> v.leftOuterJoin(S0_M9).on(bracket(S0_M8.itm_typ.eq(S0_M9.itm_typ).and(S0_M8.itm_typ_d_cd.eq(S0_M9.itm_typ_d_cd)))))
					.predicate(p -> p.cutoff$and(S0_M9.itm_typ_d_nm.like(bind("itm_typ_d_nm")))),
				when(boundOr("gd_nm"))
					.view(v -> v.leftOuterJoin(S0_M11).on(bracket(S0_T1.gd_cd.eq(S0_M11.gd_cd))))
					.predicate(p -> p.cutoff$and(S0_M11.gd_nm.like(bind("gd_nm")))),
				when(boundOr("trd_cur_nm"))
					.view(v -> v.leftOuterJoin(S0_M12).on(bracket(S0_T1.trd_cur_cd.eq(S0_M12.cur_cd))))
					.predicate(p -> p.cutoff$and(S0_M12.cur_nm.like(bind("trd_cur_nm")))),
				when(boundOr("tax_nm"))
					.view(v -> v.leftOuterJoin(S0_M13).on(bracket(S0_T1.tax_cd.eq(S0_M13.tax_cd))))
					.predicate(p -> p.cutoff$and(S0_M13.tax_nm.like(bind("tax_nm")))),
				when(boundOr("prsppl_grp_flg1"))
					.select(DS0C_PRSPPL_GRP, S0_M2.bp_grp_cd1.as("prsppl_grp_cd1"), S0_MM11.bp_grp_nm.as("prsppl_grp_nm1"))
					.view(DS0C_PRSPPL_GRP, v -> v.leftOuterJoin(S0_MM11).on(S0_M2.bp_grp_cd1.eq(S0_MM11.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP1.value()).eq(S0_MM11.bp_grp_typ))))
					.predicate(DS0C_PRSPPL_GRP, p -> p.cutoff$and(S0_M2.bp_grp_cd1.like(bind("prsppl_grp_cd1"))).cutoff$and(S0_MM11.bp_grp_nm.like(bind("prsppl_grp_nm1")))),
				when(boundOr("prsppl_grp_flg2"))
					.select(DS0C_PRSPPL_GRP, S0_M2.bp_grp_cd2.as("prsppl_grp_cd2"), S0_MM12.bp_grp_nm.as("prsppl_grp_nm2"))
					.view(DS0C_PRSPPL_GRP, v -> v.leftOuterJoin(S0_MM12).on(S0_M2.bp_grp_cd2.eq(S0_MM12.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP2.value()).eq(S0_MM12.bp_grp_typ))))
					.predicate(DS0C_PRSPPL_GRP, p -> p.cutoff$and(S0_M2.bp_grp_cd2.like(bind("prsppl_grp_cd2"))).cutoff$and(S0_MM12.bp_grp_nm.like(bind("prsppl_grp_nm2")))),
				when(boundOr("prsppl_grp_flg3"))
					.select(DS0C_PRSPPL_GRP, S0_M2.bp_grp_cd3.as("prsppl_grp_cd3"), S0_MM13.bp_grp_nm.as("prsppl_grp_nm3"))
					.view(DS0C_PRSPPL_GRP, v -> v.leftOuterJoin(S0_MM13).on(S0_M2.bp_grp_cd3.eq(S0_MM13.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP3.value()).eq(S0_MM13.bp_grp_typ))))
					.predicate(DS0C_PRSPPL_GRP, p -> p.cutoff$and(S0_M2.bp_grp_cd3.like(bind("prsppl_grp_cd3"))).cutoff$and(S0_MM13.bp_grp_nm.like(bind("prsppl_grp_nm3")))),
				when(boundOr("prsppl_grp_flg4"))
					.select(DS0C_PRSPPL_GRP, S0_M2.bp_grp_cd4.as("prsppl_grp_cd4"), S0_MM14.bp_grp_nm.as("prsppl_grp_nm4"))
					.view(DS0C_PRSPPL_GRP, v -> v.leftOuterJoin(S0_MM14).on(S0_M2.bp_grp_cd4.eq(S0_MM14.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP4.value()).eq(S0_MM14.bp_grp_typ))))
					.predicate(DS0C_PRSPPL_GRP, p -> p.cutoff$and(S0_M2.bp_grp_cd4.like(bind("prsppl_grp_cd4"))).cutoff$and(S0_MM14.bp_grp_nm.like(bind("prsppl_grp_nm4")))),
				when(boundOr("prsppl_grp_flg5"))
					.select(DS0C_PRSPPL_GRP, S0_M2.bp_grp_cd5.as("prsppl_grp_cd5"), S0_MM15.bp_grp_nm.as("prsppl_grp_nm5"))
					.view(DS0C_PRSPPL_GRP, v -> v.leftOuterJoin(S0_MM15).on(S0_M2.bp_grp_cd5.eq(S0_MM15.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP5.value()).eq(S0_MM15.bp_grp_typ))))
					.predicate(DS0C_PRSPPL_GRP, p -> p.cutoff$and(S0_M2.bp_grp_cd5.like(bind("prsppl_grp_cd5"))).cutoff$and(S0_MM15.bp_grp_nm.like(bind("prsppl_grp_nm5")))),
				when(boundOr("prsppl_grp_flg6"))
					.select(DS0C_PRSPPL_GRP, S0_M2.bp_grp_cd6.as("prsppl_grp_cd6"), S0_MM16.bp_grp_nm.as("prsppl_grp_nm6"))
					.view(DS0C_PRSPPL_GRP, v -> v.leftOuterJoin(S0_MM16).on(S0_M2.bp_grp_cd6.eq(S0_MM16.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP6.value()).eq(S0_MM16.bp_grp_typ))))
					.predicate(DS0C_PRSPPL_GRP, p -> p.cutoff$and(S0_M2.bp_grp_cd6.like(bind("prsppl_grp_cd6"))).cutoff$and(S0_MM16.bp_grp_nm.like(bind("prsppl_grp_nm6")))),
				when(boundOr("prsppl_grp_flg7"))
					.select(DS0C_PRSPPL_GRP, S0_M2.bp_grp_cd7.as("prsppl_grp_cd7"), S0_MM17.bp_grp_nm.as("prsppl_grp_nm7"))
					.view(DS0C_PRSPPL_GRP, v -> v.leftOuterJoin(S0_MM17).on(S0_M2.bp_grp_cd7.eq(S0_MM17.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP7.value()).eq(S0_MM17.bp_grp_typ))))
					.predicate(DS0C_PRSPPL_GRP, p -> p.cutoff$and(S0_M2.bp_grp_cd7.like(bind("prsppl_grp_cd7"))).cutoff$and(S0_MM17.bp_grp_nm.like(bind("prsppl_grp_nm7")))),
				when(boundOr("prsppl_grp_flg8"))
					.select(DS0C_PRSPPL_GRP, S0_M2.bp_grp_cd8.as("prsppl_grp_cd8"), S0_MM18.bp_grp_nm.as("prsppl_grp_nm8"))
					.view(DS0C_PRSPPL_GRP, v -> v.leftOuterJoin(S0_MM18).on(S0_M2.bp_grp_cd8.eq(S0_MM18.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP8.value()).eq(S0_MM18.bp_grp_typ))))
					.predicate(DS0C_PRSPPL_GRP, p -> p.cutoff$and(S0_M2.bp_grp_cd8.like(bind("prsppl_grp_cd8"))).cutoff$and(S0_MM18.bp_grp_nm.like(bind("prsppl_grp_nm8")))),
				when(boundOr("prsppl_grp_flg9"))
					.select(DS0C_PRSPPL_GRP, S0_M2.bp_grp_cd9.as("prsppl_grp_cd9"), S0_MM19.bp_grp_nm.as("prsppl_grp_nm9"))
					.view(DS0C_PRSPPL_GRP, v -> v.leftOuterJoin(S0_MM19).on(S0_M2.bp_grp_cd9.eq(S0_MM19.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP9.value()).eq(S0_MM19.bp_grp_typ))))
					.predicate(DS0C_PRSPPL_GRP, p -> p.cutoff$and(S0_M2.bp_grp_cd9.like(bind("prsppl_grp_cd9"))).cutoff$and(S0_MM19.bp_grp_nm.like(bind("prsppl_grp_nm9")))),
				when(boundOr("prsppl_grp_flg10"))
					.select(DS0C_PRSPPL_GRP, S0_M2.bp_grp_cd10.as("prsppl_grp_cd10"), S0_MM110.bp_grp_nm.as("prsppl_grp_nm10"))
					.view(DS0C_PRSPPL_GRP, v -> v.leftOuterJoin(S0_MM110).on(S0_M2.bp_grp_cd10.eq(S0_MM110.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP10.value()).eq(S0_MM110.bp_grp_typ))))
					.predicate(DS0C_PRSPPL_GRP, p -> p.cutoff$and(S0_M2.bp_grp_cd10.like(bind("prsppl_grp_cd10"))).cutoff$and(S0_MM110.bp_grp_nm.like(bind("prsppl_grp_nm10")))),
				when(boundOr("itm_grp_flg1"))
					.select(DS0C_ITM_GRP, S0_M8.itm_grp_cd1.as("itm_grp_cd1"), S0_MM21.itm_grp_nm.as("itm_grp_nm1"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM21).on(S0_M8.itm_grp_cd1.eq(S0_MM21.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP1.value()).eq(S0_MM21.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M8.itm_grp_cd1.like(bind("itm_grp_cd1"))).cutoff$and(S0_MM21.itm_grp_nm.like(bind("itm_grp_nm1")))),
				when(boundOr("itm_grp_flg2"))
					.select(DS0C_ITM_GRP, S0_M8.itm_grp_cd2.as("itm_grp_cd2"), S0_MM22.itm_grp_nm.as("itm_grp_nm2"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM22).on(S0_M8.itm_grp_cd2.eq(S0_MM22.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP2.value()).eq(S0_MM22.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M8.itm_grp_cd2.like(bind("itm_grp_cd2"))).cutoff$and(S0_MM22.itm_grp_nm.like(bind("itm_grp_nm2")))),
				when(boundOr("itm_grp_flg3"))
					.select(DS0C_ITM_GRP, S0_M8.itm_grp_cd3.as("itm_grp_cd3"), S0_MM23.itm_grp_nm.as("itm_grp_nm3"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM23).on(S0_M8.itm_grp_cd3.eq(S0_MM23.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP3.value()).eq(S0_MM23.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M8.itm_grp_cd3.like(bind("itm_grp_cd3"))).cutoff$and(S0_MM23.itm_grp_nm.like(bind("itm_grp_nm3")))),
				when(boundOr("itm_grp_flg4"))
					.select(DS0C_ITM_GRP, S0_M8.itm_grp_cd4.as("itm_grp_cd4"), S0_MM24.itm_grp_nm.as("itm_grp_nm4"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM24).on(S0_M8.itm_grp_cd4.eq(S0_MM24.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP4.value()).eq(S0_MM24.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M8.itm_grp_cd4.like(bind("itm_grp_cd4"))).cutoff$and(S0_MM24.itm_grp_nm.like(bind("itm_grp_nm4")))),
				when(boundOr("itm_grp_flg5"))
					.select(DS0C_ITM_GRP, S0_M8.itm_grp_cd5.as("itm_grp_cd5"), S0_MM25.itm_grp_nm.as("itm_grp_nm5"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM25).on(S0_M8.itm_grp_cd5.eq(S0_MM25.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP5.value()).eq(S0_MM25.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M8.itm_grp_cd5.like(bind("itm_grp_cd5"))).cutoff$and(S0_MM25.itm_grp_nm.like(bind("itm_grp_nm5")))),
				when(boundOr("itm_grp_flg6"))
					.select(DS0C_ITM_GRP, S0_M8.itm_grp_cd6.as("itm_grp_cd6"), S0_MM26.itm_grp_nm.as("itm_grp_nm6"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM26).on(S0_M8.itm_grp_cd6.eq(S0_MM26.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP6.value()).eq(S0_MM26.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M8.itm_grp_cd6.like(bind("itm_grp_cd6"))).cutoff$and(S0_MM26.itm_grp_nm.like(bind("itm_grp_nm6")))),
				when(boundOr("itm_grp_flg7"))
					.select(DS0C_ITM_GRP, S0_M8.itm_grp_cd7.as("itm_grp_cd7"), S0_MM27.itm_grp_nm.as("itm_grp_nm7"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM27).on(S0_M8.itm_grp_cd7.eq(S0_MM27.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP7.value()).eq(S0_MM27.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M8.itm_grp_cd7.like(bind("itm_grp_cd7"))).cutoff$and(S0_MM27.itm_grp_nm.like(bind("itm_grp_nm7")))),
				when(boundOr("itm_grp_flg8"))
					.select(DS0C_ITM_GRP, S0_M8.itm_grp_cd8.as("itm_grp_cd8"), S0_MM28.itm_grp_nm.as("itm_grp_nm8"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM28).on(S0_M8.itm_grp_cd8.eq(S0_MM28.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP8.value()).eq(S0_MM28.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M8.itm_grp_cd8.like(bind("itm_grp_cd8"))).cutoff$and(S0_MM28.itm_grp_nm.like(bind("itm_grp_nm8")))),
				when(boundOr("itm_grp_flg9"))
					.select(DS0C_ITM_GRP, S0_M8.itm_grp_cd9.as("itm_grp_cd9"), S0_MM29.itm_grp_nm.as("itm_grp_nm9"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM29).on(S0_M8.itm_grp_cd9.eq(S0_MM29.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP9.value()).eq(S0_MM29.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M8.itm_grp_cd9.like(bind("itm_grp_cd9"))).cutoff$and(S0_MM29.itm_grp_nm.like(bind("itm_grp_nm9")))),
				when(boundOr("itm_grp_flg10"))
					.select(DS0C_ITM_GRP, S0_M8.itm_grp_cd10.as("itm_grp_cd10"), S0_MM210.itm_grp_nm.as("itm_grp_nm10"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM210).on(S0_M8.itm_grp_cd10.eq(S0_MM210.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP10.value()).eq(S0_MM210.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M8.itm_grp_cd10.like(bind("itm_grp_cd10"))).cutoff$and(S0_MM210.itm_grp_nm.like(bind("itm_grp_nm10"))))
			)
			.setJoinInfo(
				joinInfo(
					j -> j
						.add(MST_PROV_SCHD_R.class, r -> toCondition(
							r.getStringNE("prov_schd_no")
						))
						.addSelect(m -> toArray(
							m.ptax_xrate_inpt_flg,
							m.tax_fix_flg,
							m.xrate_inpt_flg
						))
						.addMap((r, m) -> {
							r.setBooleanNE("tax_fix_flg", m.tax_fix_flg());
							r.setBooleanNE("xrate_inpt_flg", m.xrate_inpt_flg());
							r.setBooleanNE("ptax_xrate_inpt_flg", m.ptax_xrate_inpt_flg());
					}),
					j -> j
						.add(MSVT_LOT_LIST_R.class, r -> toCondition(
							r.getStringNE("itm_cd"),
							r.getStringNE("itm_sub1"),
							r.getStringNE("itm_sub2"),
							r.getStringNE("itm_sub3"),
							r.getStringNE("lot_no"),
							r.getStringNE("sublot_no")
						))
						.addSelect(m -> toArray(
							m.ver_no
						))
						.addMap((r, m) -> {
							r.setStringNE("ver_no", m.ver_no());
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
							r.getStringNE("prsppl_cd")
						))
						.addSelect(m -> toArray(
							m.bp_nm,
							m.prov_amt_rnd_typ,
							m.prov_tax_rnd_typ
						))
						.addMap((r, m) -> {
							r.setStringNE("prsppl_nm", m.bp_nm());
							r.setStringNE("prov_amt_rnd_typ", m.prov_amt_rnd_typ());
							r.setStringNE("prov_tax_rnd_typ", m.prov_tax_rnd_typ());
					}),
					j -> j
						.add(MAM_WG_R.class, r -> toCondition(
							r.getStringNE("prsppl_wg_cd")
						))
						.addSelect(m -> toArray(
							m.wg_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("prsppl_wg_nm", m.wg_nm());
					}),
					j -> j
						.add(MAM_STR_LN_R.class, r -> toCondition(
							r.getStringNE("prsppl_loc_cd"),
							r.getStringNE("str_ln_cd")
						))
						.addSelect(m -> toArray(
							m.str_ln_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("str_ln_nm", m.str_ln_nm());
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
							r.setStringNE("tax_typ", m.tax_typ());
							r.setBooleanNE("inc_tax_flg", m.inc_tax_flg());
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
						.add(MAM_BIZ_RSN_R.class, r -> toCondition(
							r.getStringNE("xfr_rsn_cd")
						))
						.addSelect(m -> toArray(
							m.acxfr_gi_flg,
							m.biz_rsn_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("xfr_rsn_nm", m.biz_rsn_nm());
							r.setBooleanNE("acxfr_gi_flg", m.acxfr_gi_flg());
					})
				)
			);
	}
	
	/**
	 * -- MSBEL1160_MST_PROV_ACT_Query_S05
	 */
	static MCQueryPlan MSBEL1160_MST_PROV_ACT_S05() {
		MST_PROV_ACT_R S0_T1 = MST_PROV_ACT_R.create("T1");
		MST_ARR_ACT_R S0_TT1 = MST_ARR_ACT_R.create("TT1");
		MST_DLV_SLIP_R S0_TT5 = MST_DLV_SLIP_R.create("TT5");
		MCTempView S0_TT8 = createTempView("TT8");
		MSVT_LOT_LIST_R S0_T2 = MSVT_LOT_LIST_R.create("T2");
		MSVT_WRK_SNO_R S0_T3 = MSVT_WRK_SNO_R.create("T3");
		MAM_TRD_R S0_M1 = MAM_TRD_R.create("M1");
		MAM_BP_R S0_M2 = MAM_BP_R.create("M2");
		MAVM_RD_LOC_R S0_M3 = MAVM_RD_LOC_R.create("M3");
		MAM_SITE_R S0_M4 = MAM_SITE_R.create("M4");
		MAM_WG_R S0_M5 = MAM_WG_R.create("M5");
		MAM_LG_GRP_R S0_M6 = MAM_LG_GRP_R.create("M6");
		MAM_STR_LN_R S0_M7 = MAM_STR_LN_R.create("M7");
		MAM_ITM_R S0_M8 = MAM_ITM_R.create("M8");
		MAM_ITM_TYP_D_R S0_M9 = MAM_ITM_TYP_D_R.create("M9");
		MAM_SUNDRY_ITM_R S0_M10 = MAM_SUNDRY_ITM_R.create("M10");
		MAM_STK_GD_R S0_M11 = MAM_STK_GD_R.create("M11");
		MAM_CUR_R S0_M12 = MAM_CUR_R.create("M12");
		MAM_TAX_R S0_M13 = MAM_TAX_R.create("M13");
		MAM_DPT_R S0_M18 = MAM_DPT_R.create("M18");
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
		MST_DLV_SLIP_R S1_W1 = MST_DLV_SLIP_R.create("W1");
		MST_PURC_ACT_IO_R S2_PT1 = MST_PURC_ACT_IO_R.create("PT1");
		MST_PURC_ACT_D_R S2_PT2 = MST_PURC_ACT_D_R.create("PT2");
		MST_PURC_ACT_R S2_PT3 = MST_PURC_ACT_R.create("PT3");
		MST_PROV_ACT_R S3_W1 = MST_PROV_ACT_R.create("W1");
		MAM_EDI_IF_CTL_R M_EDI_IF_CTL = MAM_EDI_IF_CTL_R.create("M19");
		
		MCDynamicSQLID DS0C_ITM_GRP = createDynamicSQLID("DS0C_ITM_GRP");
		MCDynamicSQLID DS0C_PRSPPL_GRP = createDynamicSQLID("DS0C_PRSPPL_GRP");
		
		return createQueryPlan()
			.setQuery(
				sql("MSBEL1160_MST_PROV_ACT_Query_S05")
					.mainQuery()
					.select(
						S0_T1.prov_act_no,
						S0_T1.prov_act_seq,
						S0_T1.prov_act_rev,
						S0_T1.slip_sts_typ,
						S0_T1.prov_schd_no,
						S0_T1.prov_src_act_typ,
						S0_T1.prov_src_act_no,
						S0_T1.trd_cd,
						S0_T1.trd_ptn_typ,
						S0_T1.xfr_rsn_cd,
						S0_T1.base_unit_cd,
						S0_T1.base_unit_qty.as("act_qty"),
						S0_T1.accpt_dt,
						S0_T1.ac_dt,
						S0_T1.ac_ym,
						S0_T1.base_ac_dt,
						trunc(
							S0_TT1.arr_tm,
							MCDateFmt.DD
						).as("arr_act_dt"),
						S0_TT1.arr_tm.as("arr_act_hm"),
						S0_T1.wg_cd.as("prsppl_wg_cd"),
						S0_T1.prsppl_cd,
						S0_T1.ap_dpt_cd,
						S0_M18.dpt_nm.as("ap_dpt_nm"),
						S0_T1.prov_typ,
						S0_T1.prov_basis_typ,
						S0_T1.xrate_cd,
						S0_T1.xrate,
						S0_T1.ptax_xrate,
						S0_T1.trd_cur_cd,
						S0_T1.base_cur_cd,
						S0_T1.ptax_cur_cd,
						S0_T1.tax_cd,
						S0_T1.trd_cur_upri,
						S0_T1.trd_cur_upri.as("old_trd_cur_upri"),
						S0_T1.trd_cur_amt,
						S0_T1.trd_cur_tax_amt,
						S0_T1.trd_cur_amt.add(S0_T1.trd_cur_tax_amt).as("trd_cur_inc_tax_amt"),
						S0_T1.base_cur_upri,
						S0_T1.base_cur_amt,
						S0_T1.base_cur_tax_amt,
						S0_T1.base_cur_amt.add(S0_T1.base_cur_tax_amt).as("base_cur_inc_tax_amt"),
						S0_T1.ptax_cur_upri,
						S0_T1.ptax_cur_amt,
						S0_T1.ptax_cur_tax_amt,
						S0_T1.ptax_cur_amt.add(S0_T1.ptax_cur_tax_amt).as("ptax_cur_inc_tax_amt"),
						S0_T1.wtax_rate,
						S0_T1.wtax_amt,
						S0_T1.itm_cd,
						S0_T1.itm_sub1,
						S0_T1.itm_sub2,
						S0_T1.itm_sub3,
						coalesce(
							S0_M10.itm_nm,
							S0_M8.itm_nm
						).as("itm_nm"),
						S0_M8.itm_typ,
						S0_M8.itm_typ_d_cd,
						S0_M8.sundry_itm_flg,
						S0_M8.asset_mng_typ,
						S0_T1.loc_cd.as("prsppl_loc_cd"),
						S0_M3.loc_nm.as("prsppl_loc_nm"),
						S0_T1.str_ln_cd,
						S0_T1.lot_no,
						S0_T1.sublot_no,
						S0_T1.sno1,
						S0_T1.sno2,
						S0_T1.sno3,
						S0_T1.sno4,
						S0_T1.gd_cd,
						S0_T1.stk_id_typ,
						S0_T1.intr_rmrks,
						S0_T1.trd_d_rmrks,
						S0_T1.sub_char1,
						S0_T1.sub_char2,
						S0_T1.sub_char3,
						S0_T1.ins_usr_id,
						S0_T1.ins_usr_nm,
						S0_T1.ins_ts,
						S0_T1.ins_func_id,
						S0_T1.upd_cntr.as("prov_upd_cntr"),
						S0_T1.upd_usr_id,
						S0_T1.upd_usr_nm,
						S0_T1.upd_ts,
						S0_T1.upd_func_id,
						S0_T1.upd_srv_req_no,
						S0_M8.dec_place.as("base_unit_dec_place"),
						S0_M8.rnd_typ.as("base_unit_rnd_typ"),
						S0_T1.dlv_slip_no,
						S0_T1.dlv_slip_d_no,
						S0_TT5.slip_prnt_flg.as("dlv_prnted_flg"),
						S0_TT8.pr(S2_PT3.purc_act_no),
						cases()
						.when(S0_TT5.slip_prnt_flg.eq(value(true))).then(S0_TT5.edi_flg)
						.when(M_EDI_IF_CTL.bp_cd.isNotNull()).then(value(true))
						.otherwise(value(false))
						.as("edi_flg"),
						addDynamicSelect(DS0C_PRSPPL_GRP),
						addDynamicSelect(DS0C_ITM_GRP),
						// this field is appended by sql coverter.
						S0_TT1.arr_schd_no.as("join_arr_schd_no_")
					)
					.from(
						S0_T1
						.leftOuterJoin(S0_TT1).on(
							bracket(
								S0_T1.prov_src_act_no.eq(S0_TT1.arr_act_no)
							)
						)
						.leftOuterJoin(S0_TT5).on(
							bracket(
								S0_T1.dlv_slip_no.eq(S0_TT5.dlv_slip_no)
								.and(
									S0_TT5.slip_sts_typ.eq(value(MAC_SLIP_STS_TYP.CRT.value()))
									.cutoff$or(
										bind("print_flg_str").eq(value(true))
										.and(
											notExists(
												subQuery()
												.select(value("X"))
												.from(S1_W1)
												.where(
													value(0).eq(value(0))
													.and(S0_TT5.dlv_slip_no.eq(S1_W1.dlv_slip_no))
													.and(S0_TT5.dlv_slip_seq.lt(S1_W1.dlv_slip_seq))
												)
											)
										)
									)
								)
							)
						)
						.leftOuterJoin(
							subQuery()
							.select(
								S2_PT1.purc_act_io_no,
								S2_PT3.purc_act_no
							)
							.from(
								S2_PT1
								.innerJoin(S2_PT2).on(
									S2_PT1.purc_act_d_no.eq(S2_PT2.purc_act_d_no)
									.and(S2_PT1.purc_act_d_seq.eq(S2_PT2.purc_act_d_seq))
								)
								.innerJoin(S2_PT3).on(
									S2_PT2.purc_act_no.eq(S2_PT3.purc_act_no)
									.and(S2_PT2.purc_act_seq.eq(S2_PT3.purc_act_seq))
								)
							)
							.where(
								value(0).eq(value(0))
								.and(S2_PT3.slip_sts_typ.eq(value(MAC_SLIP_STS_TYP.CRT.value())))
							).view(S0_TT8)
						).on(
							bracket(
								S0_T1.prov_src_act_no.eq(S0_TT1.purc_act_io_no)
							)
						)
						.innerJoin(S0_M3).on(
							bracket(
								S0_T1.loc_cd.eq(S0_M3.loc_cd)
							)
						)
						.leftOuterJoin(S0_M8).on(
							bracket(
								S0_T1.itm_cd.eq(S0_M8.itm_cd)
								.and(S0_T1.itm_sub1.eq(S0_M8.itm_sub1))
								.and(S0_T1.itm_sub2.eq(S0_M8.itm_sub2))
								.and(S0_T1.itm_sub3.eq(S0_M8.itm_sub3))
							)
						)
						.leftOuterJoin(S0_M10).on(
							bracket(
								S0_T1.itm_cd.eq(S0_M10.itm_cd)
								.and(S0_T1.itm_sub1.eq(S0_M10.itm_sub1))
								.and(S0_T1.itm_sub2.eq(S0_M10.itm_sub2))
								.and(S0_T1.itm_sub3.eq(S0_M10.itm_sub3))
								.and(S0_T1.sno1.eq(S0_M10.sno1))
								.and(S0_T1.sno2.eq(S0_M10.sno2))
								.and(S0_T1.sno3.eq(S0_M10.sno3))
								.and(S0_T1.sno4.eq(S0_M10.sno4))
							)
						)
						.leftOuterJoin(S0_M18).on(
							bracket(
								S0_T1.ap_dpt_cd.eq(S0_M18.dpt_cd)
								.and(S0_T1.ac_dt.between(S0_M18.st_dt, S0_M18.end_dt))
							)
						)
						.leftOuterJoin(M_EDI_IF_CTL).on(
								bracket(
										S0_TT5.bp_cd.eq(M_EDI_IF_CTL.bp_cd)
									.and(M_EDI_IF_CTL.if_proc_typ.eq(value(MAC_IF_PROC_TYP.BILL_SEND.value())))
									.and(S0_TT5.ac_dt.between(M_EDI_IF_CTL.st_dt, M_EDI_IF_CTL.end_dt))
									.and(M_EDI_IF_CTL.not_onr_prov_flg.eq(value(false)))
									.and(M_EDI_IF_CTL.del_flg.eq(value(false)))
								)
							)
						.addDynamicView()
						.addDynamicView(DS0C_PRSPPL_GRP)
						.addDynamicView(DS0C_ITM_GRP)
					)
					.where(
						value(0).eq(value(0))
						.and(
							S0_T1.prov_src_act_typ.in(
								value(MSC_PROV_SRC_ACT_TYP.NON_ARR_DDLV.value()),
								value(MSC_PROV_SRC_ACT_TYP.NCV_RCV_DDLV.value())
							)
						)
						.and(
							S0_T1.trd_ptn_typ.in(
								bind("prov_str"),
								bind("prov_rtn_str")
							)
						)
						.and(
							S0_T1.prov_typ.in(
								bind("ffr_prov_flg_str"),
								bind("onr_prov_flg_str")
							)
						)
						.addDynamicPredicate()
						.cutoff$and(
							bracket(
								S0_TT5.slip_prnt_flg.eq(bind("dlv_prnted_str"))
								.or(S0_TT5.slip_prnt_flg.isNull())
								.and(bind("dlv_prnted_str").eq(value(false)))
							)
						)
						.cutoff$and(S0_T1.accpt_dt.gte(bind("accpt_dt_fr")))
						.cutoff$and(S0_T1.accpt_dt.lte(bind("accpt_dt_to")))
						.cutoff$and(S0_T1.ac_ym.gte(bind("ac_ym_fr")))
						.cutoff$and(S0_T1.ac_ym.lte(bind("ac_ym_to")))
						.cutoff$and(S0_T1.ac_dt.gte(bind("ac_dt_fr")))
						.cutoff$and(S0_T1.ac_dt.lte(bind("ac_dt_to")))
						.cutoff$and(S0_TT1.arr_tm.gte(bind("arr_act_hm_fr")))
						.cutoff$and(S0_TT1.arr_tm.lte(bind("arr_act_hm_to")))
						.cutoff$and(S0_T1.trd_cd.like(bind("trd_cd")))
						.cutoff$and(S0_T1.prsppl_cd.like(bind("prsppl_cd")))
						.cutoff$and(S0_T1.ap_dpt_cd.like(bind("ap_dpt_cd")))
						.cutoff$and(S0_M18.dpt_nm.like(bind("ap_dpt_nm")))
						.cutoff$and(S0_T1.loc_cd.like(bind("prsppl_loc_cd")))
						.cutoff$and(S0_M3.loc_nm.like(bind("prsppl_loc_nm")))
						.cutoff$and(S0_M3.site_cd.like(bind("prsppl_site_cd")))
						.cutoff$and(S0_T1.wg_cd.like(bind("prsppl_wg_cd")))
						.cutoff$and(S0_M3.lg_grp_cd.like(bind("prsppl_lg_grp_cd")))
						.cutoff$and(S0_T1.str_ln_cd.like(bind("prsppl_str_ln_cd")))
						.cutoff$and(S0_M8.itm_typ.like(bind("itm_typ")))
						.cutoff$and(S0_M8.itm_typ_d_cd.like(bind("itm_typ_d_cd")))
						.cutoff$and(S0_T1.itm_cd.like(bind("itm_cd")))
						.cutoff$and(S0_T1.itm_sub1.like(bind("itm_sub1")))
						.cutoff$and(S0_T1.itm_sub2.like(bind("itm_sub2")))
						.cutoff$and(S0_T1.itm_sub3.like(bind("itm_sub3")))
						.cutoff$and(
							coalesce(
								S0_M10.itm_nm,
								S0_M8.itm_nm
							).like(bind("itm_nm"))
						)
						.cutoff$and(S0_T1.lot_no.like(bind("lot_no")))
						.cutoff$and(S0_T1.sublot_no.like(bind("sublot_no")))
						.cutoff$and(S0_T1.sno1.like(bind("sno1")))
						.cutoff$and(S0_T1.sno2.like(bind("sno2")))
						.cutoff$and(S0_T1.sno3.like(bind("sno3")))
						.cutoff$and(S0_T1.sno4.like(bind("sno4")))
						.cutoff$and(S0_T1.gd_cd.like(bind("gd_cd")))
						.cutoff$and(S0_T1.stk_id_typ.like(bind("stk_id_typ")))
						.cutoff$and(S0_T1.prov_basis_typ.like(bind("prov_basis_typ")))
						.cutoff$and(S0_T1.dlv_slip_no.like(bind("dlv_slip_no")))
						.cutoff$and(S0_T1.dlv_slip_d_no.like(bind("dlv_slip_d_no")))
						.cutoff$and(S0_T1.trd_cur_cd.like(bind("trd_cur_cd")))
						.cutoff$and(bind("base_cur_cd").neq(S0_T1.trd_cur_cd))
						.cutoff$and(S0_T1.tax_cd.like(bind("tax_cd")))
						.cutoff$and(S0_T1.prov_src_act_typ.like(bind("prov_src_act_typ")))
						.cutoff$and(S0_T1.prov_src_act_no.like(bind("prov_src_act_no")))
						.cutoff$and(S0_T1.prov_act_no.like(bind("prov_act_no")))
						.cutoff$and(S0_T1.intr_rmrks.like(bind("intr_rmrks")))
						.cutoff$and(S0_T1.trd_d_rmrks.like(bind("trd_d_rmrks")))
						.cutoff$and(S0_T1.sub_char1.like(bind("sub_char1")))
						.cutoff$and(S0_T1.sub_char2.like(bind("sub_char2")))
						.cutoff$and(S0_T1.sub_char3.like(bind("sub_char3")))
						.and(
							S0_T1.slip_sts_typ.eq(value(MAC_SLIP_STS_TYP.CRT.value()))
							.or(bind("dis_can_disp_flg").eq(value(true)))
						)
						.cutoff$and(
							bind("print_flg_str").eq(value(true))
							.and(
								notExists(
									subQuery()
									.select(value("X"))
									.from(S3_W1)
									.where(
										value(0).eq(value(0))
										.and(S0_T1.prov_act_no.eq(S3_W1.prov_act_no))
										.and(S0_T1.prov_act_seq.lt(S3_W1.prov_act_seq))
									)
								)
							)
						)
						.and(
								(
									bind("on_edi_flg").eq(value(true)).and(bind("off_edi_flg").eq(value(true)))
									.and(((
											bind("ope_prnt").eq(value(false)).or(
											cases()
											.when(S0_TT5.slip_prnt_flg.eq(value(true))).then(S0_TT5.edi_flg)
											.when(M_EDI_IF_CTL.bp_cd.isNotNull()).then(value(true))
											.otherwise(value(false)).eq(value(true))
											.and(S0_TT5.slip_prnt_flg.eq(value(false))))).or(
												cases()
												.when(S0_TT5.slip_prnt_flg.eq(value(true))).then(S0_TT5.edi_flg)
												.when(M_EDI_IF_CTL.bp_cd.isNotNull()).then(value(true))
												.otherwise(value(false)).eq(value(false)))))
								)
								.or( bind("on_edi_flg").eq(value(true)).and(bind("off_edi_flg").eq(value(false))).and(
										cases()
										.when(S0_TT5.slip_prnt_flg.eq(value(true))).then(S0_TT5.edi_flg)
										.when(M_EDI_IF_CTL.bp_cd.isNotNull()).then(value(true))
										.otherwise(value(false)).eq(value(true)))
										.and(S0_TT5.slip_prnt_flg.eq(value(false)).or(bind("ope_prnt").eq(value(false)))) )
								.or( bind("on_edi_flg").eq(value(false)).and(bind("off_edi_flg").eq(value(true))).and(
										cases()
										.when(S0_TT5.slip_prnt_flg.eq(value(true))).then(S0_TT5.edi_flg)
										.when(M_EDI_IF_CTL.bp_cd.isNotNull()).then(value(true))
										.otherwise(value(false))
										.eq(value(false))) )
						)
						.addDynamicPredicate(DS0C_PRSPPL_GRP)
						.addDynamicPredicate(DS0C_ITM_GRP)
					)
					.orderBy(
						S0_T1.prov_src_act_typ.asc(),
						S0_T1.prov_act_no.asc(),
						S0_T1.prov_act_seq.asc()
					)
			)
			.setDynamicSQLInfo(
				when(boundOr("ver_no"))
					.view(v -> v.leftOuterJoin(S0_T2).on(bracket(S0_T1.itm_cd.eq(S0_T2.itm_cd).and(S0_T1.itm_sub1.eq(S0_T2.itm_sub1)).and(S0_T1.itm_sub2.eq(S0_T2.itm_sub2)).and(S0_T1.itm_sub3.eq(S0_T2.itm_sub3)).and(S0_T1.lot_no.eq(S0_T2.lot_no)).and(S0_T1.sublot_no.eq(S0_T2.sublot_no)))))
					.predicate(p -> p.cutoff$and(S0_T2.ver_no.like(bind("ver_no")))),
				when(boundOr("wrk_no", "wrk_nm"))
					.view(v -> v.leftOuterJoin(S0_T3).on(bracket(S0_T1.sno1.eq(S0_T3.sno1))))
					.predicate(p -> p.cutoff$and(S0_T3.wrk_no.like(bind("wrk_no"))).cutoff$and(S0_T3.wrk_nm.like(bind("wrk_nm")))),
				when(boundOr("trd_nm"))
					.view(v -> v.leftOuterJoin(S0_M1).on(bracket(S0_T1.trd_cd.eq(S0_M1.trd_cd))))
					.predicate(p -> p.cutoff$and(S0_M1.trd_nm.like(bind("trd_nm")))),
				when(boundOr("prsppl_grp_flg1", "prsppl_grp_flg2", "prsppl_grp_flg3", "prsppl_grp_flg4", "prsppl_grp_flg5", "prsppl_grp_flg6", "prsppl_grp_flg7", "prsppl_grp_flg8", "prsppl_grp_flg9", "prsppl_grp_flg10", "subcon_flg_str", "prsppl_nm"))
					.view(v -> v.leftOuterJoin(S0_M2).on(bracket(S0_T1.prsppl_cd.eq(S0_M2.bp_cd))))
					.predicate(p -> p.cutoff$and(S0_M2.subcon_flg.eq(bind("subcon_flg_str"))).cutoff$and(S0_M2.bp_nm.like(bind("prsppl_nm")))),
				when(boundOr("prsppl_site_nm"))
					.view(v -> v.leftOuterJoin(S0_M4).on(bracket(S0_M3.site_cd.eq(S0_M4.site_cd))))
					.predicate(p -> p.cutoff$and(S0_M4.site_nm.like(bind("prsppl_site_nm")))),
				when(boundOr("prsppl_wg_nm"))
					.view(v -> v.leftOuterJoin(S0_M5).on(bracket(S0_T1.wg_cd.eq(S0_M5.wg_cd))))
					.predicate(p -> p.cutoff$and(S0_M5.wg_nm.like(bind("prsppl_wg_nm")))),
				when(boundOr("prsppl_lg_grp_nm"))
					.view(v -> v.leftOuterJoin(S0_M6).on(bracket(S0_M3.lg_grp_cd.eq(S0_M6.lg_grp_cd))))
					.predicate(p -> p.cutoff$and(S0_M6.lg_grp_nm.like(bind("prsppl_lg_grp_nm")))),
				when(boundOr("prsppl_str_ln_nm"))
					.view(v -> v.leftOuterJoin(S0_M7).on(bracket(S0_T1.loc_cd.eq(S0_M7.loc_cd).and(S0_T1.str_ln_cd.eq(S0_M7.str_ln_cd)))))
					.predicate(p -> p.cutoff$and(S0_M7.str_ln_nm.like(bind("prsppl_str_ln_nm")))),
				when(boundOr("itm_typ_d_nm"))
					.view(v -> v.leftOuterJoin(S0_M9).on(bracket(S0_M8.itm_typ.eq(S0_M9.itm_typ).and(S0_M8.itm_typ_d_cd.eq(S0_M9.itm_typ_d_cd)))))
					.predicate(p -> p.cutoff$and(S0_M9.itm_typ_d_nm.like(bind("itm_typ_d_nm")))),
				when(boundOr("gd_nm"))
					.view(v -> v.leftOuterJoin(S0_M11).on(bracket(S0_T1.gd_cd.eq(S0_M11.gd_cd))))
					.predicate(p -> p.cutoff$and(S0_M11.gd_nm.like(bind("gd_nm")))),
				when(boundOr("trd_cur_nm"))
					.view(v -> v.leftOuterJoin(S0_M12).on(bracket(S0_T1.trd_cur_cd.eq(S0_M12.cur_cd))))
					.predicate(p -> p.cutoff$and(S0_M12.cur_nm.like(bind("trd_cur_nm")))),
				when(boundOr("tax_nm"))
					.view(v -> v.leftOuterJoin(S0_M13).on(bracket(S0_T1.tax_cd.eq(S0_M13.tax_cd))))
					.predicate(p -> p.cutoff$and(S0_M13.tax_nm.like(bind("tax_nm")))),
				when(boundOr("prsppl_grp_flg1"))
					.select(DS0C_PRSPPL_GRP, S0_M2.bp_grp_cd1.as("prsppl_grp_cd1"), S0_MM11.bp_grp_nm.as("prsppl_grp_nm1"))
					.view(DS0C_PRSPPL_GRP, v -> v.leftOuterJoin(S0_MM11).on(S0_M2.bp_grp_cd1.eq(S0_MM11.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP1.value()).eq(S0_MM11.bp_grp_typ))))
					.predicate(DS0C_PRSPPL_GRP, p -> p.cutoff$and(S0_M2.bp_grp_cd1.like(bind("prsppl_grp_cd1"))).cutoff$and(S0_MM11.bp_grp_nm.like(bind("prsppl_grp_nm1")))),
				when(boundOr("prsppl_grp_flg2"))
					.select(DS0C_PRSPPL_GRP, S0_M2.bp_grp_cd2.as("prsppl_grp_cd2"), S0_MM12.bp_grp_nm.as("prsppl_grp_nm2"))
					.view(DS0C_PRSPPL_GRP, v -> v.leftOuterJoin(S0_MM12).on(S0_M2.bp_grp_cd2.eq(S0_MM12.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP2.value()).eq(S0_MM12.bp_grp_typ))))
					.predicate(DS0C_PRSPPL_GRP, p -> p.cutoff$and(S0_M2.bp_grp_cd2.like(bind("prsppl_grp_cd2"))).cutoff$and(S0_MM12.bp_grp_nm.like(bind("prsppl_grp_nm2")))),
				when(boundOr("prsppl_grp_flg3"))
					.select(DS0C_PRSPPL_GRP, S0_M2.bp_grp_cd3.as("prsppl_grp_cd3"), S0_MM13.bp_grp_nm.as("prsppl_grp_nm3"))
					.view(DS0C_PRSPPL_GRP, v -> v.leftOuterJoin(S0_MM13).on(S0_M2.bp_grp_cd3.eq(S0_MM13.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP3.value()).eq(S0_MM13.bp_grp_typ))))
					.predicate(DS0C_PRSPPL_GRP, p -> p.cutoff$and(S0_M2.bp_grp_cd3.like(bind("prsppl_grp_cd3"))).cutoff$and(S0_MM13.bp_grp_nm.like(bind("prsppl_grp_nm3")))),
				when(boundOr("prsppl_grp_flg4"))
					.select(DS0C_PRSPPL_GRP, S0_M2.bp_grp_cd4.as("prsppl_grp_cd4"), S0_MM14.bp_grp_nm.as("prsppl_grp_nm4"))
					.view(DS0C_PRSPPL_GRP, v -> v.leftOuterJoin(S0_MM14).on(S0_M2.bp_grp_cd4.eq(S0_MM14.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP4.value()).eq(S0_MM14.bp_grp_typ))))
					.predicate(DS0C_PRSPPL_GRP, p -> p.cutoff$and(S0_M2.bp_grp_cd4.like(bind("prsppl_grp_cd4"))).cutoff$and(S0_MM14.bp_grp_nm.like(bind("prsppl_grp_nm4")))),
				when(boundOr("prsppl_grp_flg5"))
					.select(DS0C_PRSPPL_GRP, S0_M2.bp_grp_cd5.as("prsppl_grp_cd5"), S0_MM15.bp_grp_nm.as("prsppl_grp_nm5"))
					.view(DS0C_PRSPPL_GRP, v -> v.leftOuterJoin(S0_MM15).on(S0_M2.bp_grp_cd5.eq(S0_MM15.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP5.value()).eq(S0_MM15.bp_grp_typ))))
					.predicate(DS0C_PRSPPL_GRP, p -> p.cutoff$and(S0_M2.bp_grp_cd5.like(bind("prsppl_grp_cd5"))).cutoff$and(S0_MM15.bp_grp_nm.like(bind("prsppl_grp_nm5")))),
				when(boundOr("prsppl_grp_flg6"))
					.select(DS0C_PRSPPL_GRP, S0_M2.bp_grp_cd6.as("prsppl_grp_cd6"), S0_MM16.bp_grp_nm.as("prsppl_grp_nm6"))
					.view(DS0C_PRSPPL_GRP, v -> v.leftOuterJoin(S0_MM16).on(S0_M2.bp_grp_cd6.eq(S0_MM16.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP6.value()).eq(S0_MM16.bp_grp_typ))))
					.predicate(DS0C_PRSPPL_GRP, p -> p.cutoff$and(S0_M2.bp_grp_cd6.like(bind("prsppl_grp_cd6"))).cutoff$and(S0_MM16.bp_grp_nm.like(bind("prsppl_grp_nm6")))),
				when(boundOr("prsppl_grp_flg7"))
					.select(DS0C_PRSPPL_GRP, S0_M2.bp_grp_cd7.as("prsppl_grp_cd7"), S0_MM17.bp_grp_nm.as("prsppl_grp_nm7"))
					.view(DS0C_PRSPPL_GRP, v -> v.leftOuterJoin(S0_MM17).on(S0_M2.bp_grp_cd7.eq(S0_MM17.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP7.value()).eq(S0_MM17.bp_grp_typ))))
					.predicate(DS0C_PRSPPL_GRP, p -> p.cutoff$and(S0_M2.bp_grp_cd7.like(bind("prsppl_grp_cd7"))).cutoff$and(S0_MM17.bp_grp_nm.like(bind("prsppl_grp_nm7")))),
				when(boundOr("prsppl_grp_flg8"))
					.select(DS0C_PRSPPL_GRP, S0_M2.bp_grp_cd8.as("prsppl_grp_cd8"), S0_MM18.bp_grp_nm.as("prsppl_grp_nm8"))
					.view(DS0C_PRSPPL_GRP, v -> v.leftOuterJoin(S0_MM18).on(S0_M2.bp_grp_cd8.eq(S0_MM18.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP8.value()).eq(S0_MM18.bp_grp_typ))))
					.predicate(DS0C_PRSPPL_GRP, p -> p.cutoff$and(S0_M2.bp_grp_cd8.like(bind("prsppl_grp_cd8"))).cutoff$and(S0_MM18.bp_grp_nm.like(bind("prsppl_grp_nm8")))),
				when(boundOr("prsppl_grp_flg9"))
					.select(DS0C_PRSPPL_GRP, S0_M2.bp_grp_cd9.as("prsppl_grp_cd9"), S0_MM19.bp_grp_nm.as("prsppl_grp_nm9"))
					.view(DS0C_PRSPPL_GRP, v -> v.leftOuterJoin(S0_MM19).on(S0_M2.bp_grp_cd9.eq(S0_MM19.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP9.value()).eq(S0_MM19.bp_grp_typ))))
					.predicate(DS0C_PRSPPL_GRP, p -> p.cutoff$and(S0_M2.bp_grp_cd9.like(bind("prsppl_grp_cd9"))).cutoff$and(S0_MM19.bp_grp_nm.like(bind("prsppl_grp_nm9")))),
				when(boundOr("prsppl_grp_flg10"))
					.select(DS0C_PRSPPL_GRP, S0_M2.bp_grp_cd10.as("prsppl_grp_cd10"), S0_MM110.bp_grp_nm.as("prsppl_grp_nm10"))
					.view(DS0C_PRSPPL_GRP, v -> v.leftOuterJoin(S0_MM110).on(S0_M2.bp_grp_cd10.eq(S0_MM110.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP10.value()).eq(S0_MM110.bp_grp_typ))))
					.predicate(DS0C_PRSPPL_GRP, p -> p.cutoff$and(S0_M2.bp_grp_cd10.like(bind("prsppl_grp_cd10"))).cutoff$and(S0_MM110.bp_grp_nm.like(bind("prsppl_grp_nm10")))),
				when(boundOr("itm_grp_flg1"))
					.select(DS0C_ITM_GRP, S0_M8.itm_grp_cd1.as("itm_grp_cd1"), S0_MM21.itm_grp_nm.as("itm_grp_nm1"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM21).on(S0_M8.itm_grp_cd1.eq(S0_MM21.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP1.value()).eq(S0_MM21.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M8.itm_grp_cd1.like(bind("itm_grp_cd1"))).cutoff$and(S0_MM21.itm_grp_nm.like(bind("itm_grp_nm1")))),
				when(boundOr("itm_grp_flg2"))
					.select(DS0C_ITM_GRP, S0_M8.itm_grp_cd2.as("itm_grp_cd2"), S0_MM22.itm_grp_nm.as("itm_grp_nm2"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM22).on(S0_M8.itm_grp_cd2.eq(S0_MM22.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP2.value()).eq(S0_MM22.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M8.itm_grp_cd2.like(bind("itm_grp_cd2"))).cutoff$and(S0_MM22.itm_grp_nm.like(bind("itm_grp_nm2")))),
				when(boundOr("itm_grp_flg3"))
					.select(DS0C_ITM_GRP, S0_M8.itm_grp_cd3.as("itm_grp_cd3"), S0_MM23.itm_grp_nm.as("itm_grp_nm3"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM23).on(S0_M8.itm_grp_cd3.eq(S0_MM23.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP3.value()).eq(S0_MM23.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M8.itm_grp_cd3.like(bind("itm_grp_cd3"))).cutoff$and(S0_MM23.itm_grp_nm.like(bind("itm_grp_nm3")))),
				when(boundOr("itm_grp_flg4"))
					.select(DS0C_ITM_GRP, S0_M8.itm_grp_cd4.as("itm_grp_cd4"), S0_MM24.itm_grp_nm.as("itm_grp_nm4"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM24).on(S0_M8.itm_grp_cd4.eq(S0_MM24.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP4.value()).eq(S0_MM24.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M8.itm_grp_cd4.like(bind("itm_grp_cd4"))).cutoff$and(S0_MM24.itm_grp_nm.like(bind("itm_grp_nm4")))),
				when(boundOr("itm_grp_flg5"))
					.select(DS0C_ITM_GRP, S0_M8.itm_grp_cd5.as("itm_grp_cd5"), S0_MM25.itm_grp_nm.as("itm_grp_nm5"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM25).on(S0_M8.itm_grp_cd5.eq(S0_MM25.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP5.value()).eq(S0_MM25.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M8.itm_grp_cd5.like(bind("itm_grp_cd5"))).cutoff$and(S0_MM25.itm_grp_nm.like(bind("itm_grp_nm5")))),
				when(boundOr("itm_grp_flg6"))
					.select(DS0C_ITM_GRP, S0_M8.itm_grp_cd6.as("itm_grp_cd6"), S0_MM26.itm_grp_nm.as("itm_grp_nm6"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM26).on(S0_M8.itm_grp_cd6.eq(S0_MM26.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP6.value()).eq(S0_MM26.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M8.itm_grp_cd6.like(bind("itm_grp_cd6"))).cutoff$and(S0_MM26.itm_grp_nm.like(bind("itm_grp_nm6")))),
				when(boundOr("itm_grp_flg7"))
					.select(DS0C_ITM_GRP, S0_M8.itm_grp_cd7.as("itm_grp_cd7"), S0_MM27.itm_grp_nm.as("itm_grp_nm7"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM27).on(S0_M8.itm_grp_cd7.eq(S0_MM27.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP7.value()).eq(S0_MM27.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M8.itm_grp_cd7.like(bind("itm_grp_cd7"))).cutoff$and(S0_MM27.itm_grp_nm.like(bind("itm_grp_nm7")))),
				when(boundOr("itm_grp_flg8"))
					.select(DS0C_ITM_GRP, S0_M8.itm_grp_cd8.as("itm_grp_cd8"), S0_MM28.itm_grp_nm.as("itm_grp_nm8"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM28).on(S0_M8.itm_grp_cd8.eq(S0_MM28.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP8.value()).eq(S0_MM28.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M8.itm_grp_cd8.like(bind("itm_grp_cd8"))).cutoff$and(S0_MM28.itm_grp_nm.like(bind("itm_grp_nm8")))),
				when(boundOr("itm_grp_flg9"))
					.select(DS0C_ITM_GRP, S0_M8.itm_grp_cd9.as("itm_grp_cd9"), S0_MM29.itm_grp_nm.as("itm_grp_nm9"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM29).on(S0_M8.itm_grp_cd9.eq(S0_MM29.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP9.value()).eq(S0_MM29.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M8.itm_grp_cd9.like(bind("itm_grp_cd9"))).cutoff$and(S0_MM29.itm_grp_nm.like(bind("itm_grp_nm9")))),
				when(boundOr("itm_grp_flg10"))
					.select(DS0C_ITM_GRP, S0_M8.itm_grp_cd10.as("itm_grp_cd10"), S0_MM210.itm_grp_nm.as("itm_grp_nm10"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM210).on(S0_M8.itm_grp_cd10.eq(S0_MM210.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP10.value()).eq(S0_MM210.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M8.itm_grp_cd10.like(bind("itm_grp_cd10"))).cutoff$and(S0_MM210.itm_grp_nm.like(bind("itm_grp_nm10"))))
			)
			.setJoinInfo(
				joinInfo(
					j -> j
						.add(MST_PROV_SCHD_R.class, r -> toCondition(
							r.getStringNE("prov_schd_no")
						))
						.addSelect(m -> toArray(
							m.ptax_xrate_inpt_flg,
							m.tax_fix_flg,
							m.xrate_inpt_flg
						))
						.addMap((r, m) -> {
							r.setBooleanNE("tax_fix_flg", m.tax_fix_flg());
							r.setBooleanNE("xrate_inpt_flg", m.xrate_inpt_flg());
							r.setBooleanNE("ptax_xrate_inpt_flg", m.ptax_xrate_inpt_flg());
					}),
					j -> j
						.add(MST_ARR_SCHD_R.class, r -> toCondition(
							r.getStringNE("join_arr_schd_no_")
						))
						.addSelect(m -> toArray(
							m.arr_pr_no
						))
						.addMap((r, m) -> {
							r.setStringNE("join_arr_pr_no_", m.arr_pr_no());
					}),
					j -> j
						.add(MST_ARR_PR_R.class, r -> toCondition(
							r.getStringNE("join_arr_pr_no_")
						))
						.addSelect(m -> toArray(
							m.po_d_no
						))
						.addMap((r, m) -> {
							r.setStringNE("join_po_d_no_", m.po_d_no());
					}),
					j -> j
						.add(MST_PO_D_R.class, r -> toCondition(
							r.getStringNE("join_po_d_no_")
						))
						.addSelect(m -> toArray(
							m.po_no
						))
						.addMap((r, m) -> {
							r.setStringNE("po_no", m.po_no());
					}),
					j -> j
						.add(MSVT_LOT_LIST_R.class, r -> toCondition(
							r.getStringNE("itm_cd"),
							r.getStringNE("itm_sub1"),
							r.getStringNE("itm_sub2"),
							r.getStringNE("itm_sub3"),
							r.getStringNE("lot_no"),
							r.getStringNE("sublot_no")
						))
						.addSelect(m -> toArray(
							m.ver_no
						))
						.addMap((r, m) -> {
							r.setStringNE("ver_no", m.ver_no());
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
							r.getStringNE("prsppl_cd")
						))
						.addSelect(m -> toArray(
							m.bp_nm,
							m.prov_amt_rnd_typ,
							m.prov_tax_rnd_typ
						))
						.addMap((r, m) -> {
							r.setStringNE("prsppl_nm", m.bp_nm());
							r.setStringNE("prov_amt_rnd_typ", m.prov_amt_rnd_typ());
							r.setStringNE("prov_tax_rnd_typ", m.prov_tax_rnd_typ());
					}),
					j -> j
						.add(MAM_WG_R.class, r -> toCondition(
							r.getStringNE("prsppl_wg_cd")
						))
						.addSelect(m -> toArray(
							m.wg_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("prsppl_wg_nm", m.wg_nm());
					}),
					j -> j
						.add(MAM_STR_LN_R.class, r -> toCondition(
							r.getStringNE("prsppl_loc_cd"),
							r.getStringNE("str_ln_cd")
						))
						.addSelect(m -> toArray(
							m.str_ln_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("str_ln_nm", m.str_ln_nm());
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
							r.setStringNE("tax_typ", m.tax_typ());
							r.setBooleanNE("inc_tax_flg", m.inc_tax_flg());
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
						.add(MAM_BIZ_RSN_R.class, r -> toCondition(
							r.getStringNE("xfr_rsn_cd")
						))
						.addSelect(m -> toArray(
							m.acxfr_gi_flg,
							m.biz_rsn_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("xfr_rsn_nm", m.biz_rsn_nm());
							r.setBooleanNE("acxfr_gi_flg", m.acxfr_gi_flg());
					})
				)
			);
	}
	
	/**
	 * -- MSBEL1160_MST_PROV_ACT_Query_S06
	 */
	static MCQueryPlan MSBEL1160_MST_PROV_ACT_S06() {
		MST_PROV_ACT_R S0_T1 = MST_PROV_ACT_R.create("T1");
		MST_DLV_SLIP_R S0_TT3 = MST_DLV_SLIP_R.create("TT3");
		MSVT_LOT_LIST_R S0_T2 = MSVT_LOT_LIST_R.create("T2");
		MSVT_WRK_SNO_R S0_T3 = MSVT_WRK_SNO_R.create("T3");
		MAM_TRD_R S0_M1 = MAM_TRD_R.create("M1");
		MAM_BP_R S0_M2 = MAM_BP_R.create("M2");
		MAVM_RD_LOC_R S0_M3 = MAVM_RD_LOC_R.create("M3");
		MAM_SITE_R S0_M4 = MAM_SITE_R.create("M4");
		MAM_WG_R S0_M5 = MAM_WG_R.create("M5");
		MAM_LG_GRP_R S0_M6 = MAM_LG_GRP_R.create("M6");
		MAM_STR_LN_R S0_M7 = MAM_STR_LN_R.create("M7");
		MAM_ITM_R S0_M8 = MAM_ITM_R.create("M8");
		MAM_ITM_TYP_D_R S0_M9 = MAM_ITM_TYP_D_R.create("M9");
		MAM_SUNDRY_ITM_R S0_M10 = MAM_SUNDRY_ITM_R.create("M10");
		MAM_STK_GD_R S0_M11 = MAM_STK_GD_R.create("M11");
		MAM_CUR_R S0_M12 = MAM_CUR_R.create("M12");
		MAM_TAX_R S0_M13 = MAM_TAX_R.create("M13");
		MAM_DPT_R S0_M18 = MAM_DPT_R.create("M18");
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
		MST_DLV_SLIP_R S1_W1 = MST_DLV_SLIP_R.create("W1");
		MST_PROV_ACT_R S2_W1 = MST_PROV_ACT_R.create("W1");
		MAM_EDI_IF_CTL_R M_EDI_IF_CTL = MAM_EDI_IF_CTL_R.create("M19");
		
		MCDynamicSQLID DS0C_ITM_GRP = createDynamicSQLID("DS0C_ITM_GRP");
		MCDynamicSQLID DS0C_PRSPPL_GRP = createDynamicSQLID("DS0C_PRSPPL_GRP");
		
		return createQueryPlan()
			.setQuery(
				sql("MSBEL1160_MST_PROV_ACT_Query_S06")
					.mainQuery()
					.select(
						S0_T1.prov_act_no,
						S0_T1.prov_act_seq,
						S0_T1.prov_act_rev,
						S0_T1.slip_sts_typ,
						S0_T1.prov_schd_no,
						S0_T1.prov_src_act_typ,
						S0_T1.prov_src_act_no,
						S0_T1.trd_cd,
						S0_T1.trd_ptn_typ,
						S0_T1.xfr_rsn_cd,
						S0_T1.base_unit_cd,
						S0_T1.base_unit_qty.as("act_qty"),
						S0_T1.accpt_dt,
						S0_T1.ac_dt,
						S0_T1.ac_ym,
						S0_T1.base_ac_dt,
						S0_T1.wg_cd.as("prsppl_wg_cd"),
						S0_T1.prsppl_cd,
						S0_T1.ap_dpt_cd,
						S0_M18.dpt_nm.as("ap_dpt_nm"),
						S0_T1.prov_typ,
						S0_T1.prov_basis_typ,
						S0_T1.xrate_cd,
						S0_T1.xrate,
						S0_T1.ptax_xrate,
						S0_T1.trd_cur_cd,
						S0_T1.base_cur_cd,
						S0_T1.ptax_cur_cd,
						S0_T1.tax_cd,
						S0_T1.trd_cur_upri,
						S0_T1.trd_cur_upri.as("old_trd_cur_upri"),
						S0_T1.trd_cur_amt,
						S0_T1.trd_cur_tax_amt,
						S0_T1.trd_cur_amt.add(S0_T1.trd_cur_tax_amt).as("trd_cur_inc_tax_amt"),
						S0_T1.base_cur_upri,
						S0_T1.base_cur_amt,
						S0_T1.base_cur_tax_amt,
						S0_T1.base_cur_amt.add(S0_T1.base_cur_tax_amt).as("base_cur_inc_tax_amt"),
						S0_T1.ptax_cur_upri,
						S0_T1.ptax_cur_amt,
						S0_T1.ptax_cur_tax_amt,
						S0_T1.ptax_cur_amt.add(S0_T1.ptax_cur_tax_amt).as("ptax_cur_inc_tax_amt"),
						S0_T1.wtax_rate,
						S0_T1.wtax_amt,
						S0_T1.itm_cd,
						S0_T1.itm_sub1,
						S0_T1.itm_sub2,
						S0_T1.itm_sub3,
						coalesce(
							S0_M10.itm_nm,
							S0_M8.itm_nm
						).as("itm_nm"),
						S0_M8.itm_typ,
						S0_M8.itm_typ_d_cd,
						S0_M8.sundry_itm_flg,
						S0_M8.asset_mng_typ,
						S0_T1.loc_cd.as("prsppl_loc_cd"),
						S0_M3.loc_nm.as("prsppl_loc_nm"),
						S0_T1.str_ln_cd,
						S0_T1.lot_no,
						S0_T1.sublot_no,
						S0_T1.sno1,
						S0_T1.sno2,
						S0_T1.sno3,
						S0_T1.sno4,
						S0_T1.gd_cd,
						S0_T1.stk_id_typ,
						S0_T1.intr_rmrks,
						S0_T1.trd_d_rmrks,
						S0_T1.sub_char1,
						S0_T1.sub_char2,
						S0_T1.sub_char3,
						S0_T1.ins_usr_id,
						S0_T1.ins_usr_nm,
						S0_T1.ins_ts,
						S0_T1.ins_func_id,
						S0_T1.upd_cntr.as("prov_upd_cntr"),
						S0_T1.upd_usr_id,
						S0_T1.upd_usr_nm,
						S0_T1.upd_ts,
						S0_T1.upd_func_id,
						S0_T1.upd_srv_req_no,
						S0_M8.dec_place.as("base_unit_dec_place"),
						S0_M8.rnd_typ.as("base_unit_rnd_typ"),
						S0_T1.dlv_slip_no,
						S0_T1.dlv_slip_d_no,
						S0_TT3.slip_prnt_flg.as("dlv_prnted_flg"),
						cases()
						.when(S0_TT3.slip_prnt_flg.eq(value(true))).then(S0_TT3.edi_flg)
						.when(M_EDI_IF_CTL.bp_cd.isNotNull()).then(value(true))
						.otherwise(value(false))
						.as("edi_flg"),
						addDynamicSelect(DS0C_PRSPPL_GRP),
						addDynamicSelect(DS0C_ITM_GRP)
					)
					.from(
						S0_T1
						.leftOuterJoin(S0_TT3).on(
							bracket(
								S0_T1.dlv_slip_no.eq(S0_TT3.dlv_slip_no)
								.and(
									S0_TT3.slip_sts_typ.eq(value(MAC_SLIP_STS_TYP.CRT.value()))
									.cutoff$or(
										bind("print_flg_str").eq(value(true))
										.and(
											notExists(
												subQuery()
												.select(value("X"))
												.from(S1_W1)
												.where(
													value(0).eq(value(0))
													.and(S0_TT3.dlv_slip_no.eq(S1_W1.dlv_slip_no))
													.and(S0_TT3.dlv_slip_seq.lt(S1_W1.dlv_slip_seq))
												)
											)
										)
									)
								)
							)
						)
						.innerJoin(S0_M3).on(
							bracket(
								S0_T1.loc_cd.eq(S0_M3.loc_cd)
							)
						)
						.leftOuterJoin(S0_M8).on(
							bracket(
								S0_T1.itm_cd.eq(S0_M8.itm_cd)
								.and(S0_T1.itm_sub1.eq(S0_M8.itm_sub1))
								.and(S0_T1.itm_sub2.eq(S0_M8.itm_sub2))
								.and(S0_T1.itm_sub3.eq(S0_M8.itm_sub3))
							)
						)
						.leftOuterJoin(S0_M10).on(
							bracket(
								S0_T1.itm_cd.eq(S0_M10.itm_cd)
								.and(S0_T1.itm_sub1.eq(S0_M10.itm_sub1))
								.and(S0_T1.itm_sub2.eq(S0_M10.itm_sub2))
								.and(S0_T1.itm_sub3.eq(S0_M10.itm_sub3))
								.and(S0_T1.sno1.eq(S0_M10.sno1))
								.and(S0_T1.sno2.eq(S0_M10.sno2))
								.and(S0_T1.sno3.eq(S0_M10.sno3))
								.and(S0_T1.sno4.eq(S0_M10.sno4))
							)
						)
						.leftOuterJoin(S0_M18).on(
							bracket(
								S0_T1.ap_dpt_cd.eq(S0_M18.dpt_cd)
								.and(S0_T1.ac_dt.between(S0_M18.st_dt, S0_M18.end_dt))
							)
						)
						.leftOuterJoin(M_EDI_IF_CTL).on(
								bracket(
										S0_TT3.bp_cd.eq(M_EDI_IF_CTL.bp_cd)
									.and(M_EDI_IF_CTL.if_proc_typ.eq(value(MAC_IF_PROC_TYP.BILL_SEND.value())))
									.and(S0_TT3.ac_dt.between(M_EDI_IF_CTL.st_dt, M_EDI_IF_CTL.end_dt))
									.and(M_EDI_IF_CTL.not_onr_prov_flg.eq(value(false)))
									.and(M_EDI_IF_CTL.del_flg.eq(value(false)))
								)
							)
						.addDynamicView()
						.addDynamicView(DS0C_PRSPPL_GRP)
						.addDynamicView(DS0C_ITM_GRP)
					)
					.where(
						value(0).eq(value(0))
						.and(S0_T1.prov_src_act_typ.eq(value(MSC_PROV_SRC_ACT_TYP.RET_DDLV.value())))
						.and(
							S0_T1.trd_ptn_typ.in(
								bind("prov_str"),
								bind("prov_rtn_str")
							)
						)
						.and(
							S0_T1.prov_typ.in(
								bind("ffr_prov_flg_str"),
								bind("onr_prov_flg_str")
							)
						)
						.addDynamicPredicate()
						.cutoff$and(
							bracket(
								S0_TT3.slip_prnt_flg.eq(bind("dlv_prnted_str"))
								.or(S0_TT3.slip_prnt_flg.isNull())
								.and(bind("dlv_prnted_str").eq(value(false)))
							)
						)
						.cutoff$and(S0_T1.accpt_dt.gte(bind("accpt_dt_fr")))
						.cutoff$and(S0_T1.accpt_dt.lte(bind("accpt_dt_to")))
						.cutoff$and(S0_T1.ac_ym.gte(bind("ac_ym_fr")))
						.cutoff$and(S0_T1.ac_ym.lte(bind("ac_ym_to")))
						.cutoff$and(S0_T1.ac_dt.gte(bind("ac_dt_fr")))
						.cutoff$and(S0_T1.ac_dt.lte(bind("ac_dt_to")))
						.cutoff$and(nullValue().gte(bind("arr_act_hm_fr")))
						.cutoff$and(nullValue().lte(bind("arr_act_hm_to")))
						.cutoff$and(S0_T1.trd_cd.like(bind("trd_cd")))
						.cutoff$and(S0_T1.prsppl_cd.like(bind("prsppl_cd")))
						.cutoff$and(S0_T1.ap_dpt_cd.like(bind("ap_dpt_cd")))
						.cutoff$and(S0_M18.dpt_nm.like(bind("ap_dpt_nm")))
						.cutoff$and(S0_T1.loc_cd.like(bind("prsppl_loc_cd")))
						.cutoff$and(S0_M3.loc_nm.like(bind("prsppl_loc_nm")))
						.cutoff$and(S0_M3.site_cd.like(bind("prsppl_site_cd")))
						.cutoff$and(S0_T1.wg_cd.like(bind("prsppl_wg_cd")))
						.cutoff$and(S0_M3.lg_grp_cd.like(bind("prsppl_lg_grp_cd")))
						.cutoff$and(S0_T1.str_ln_cd.like(bind("prsppl_str_ln_cd")))
						.cutoff$and(S0_M8.itm_typ.like(bind("itm_typ")))
						.cutoff$and(S0_M8.itm_typ_d_cd.like(bind("itm_typ_d_cd")))
						.cutoff$and(S0_T1.itm_cd.like(bind("itm_cd")))
						.cutoff$and(S0_T1.itm_sub1.like(bind("itm_sub1")))
						.cutoff$and(S0_T1.itm_sub2.like(bind("itm_sub2")))
						.cutoff$and(S0_T1.itm_sub3.like(bind("itm_sub3")))
						.cutoff$and(
							coalesce(
								S0_M10.itm_nm,
								S0_M8.itm_nm
							).like(bind("itm_nm"))
						)
						.cutoff$and(S0_T1.lot_no.like(bind("lot_no")))
						.cutoff$and(S0_T1.sublot_no.like(bind("sublot_no")))
						.cutoff$and(S0_T1.sno1.like(bind("sno1")))
						.cutoff$and(S0_T1.sno2.like(bind("sno2")))
						.cutoff$and(S0_T1.sno3.like(bind("sno3")))
						.cutoff$and(S0_T1.sno4.like(bind("sno4")))
						.cutoff$and(S0_T1.gd_cd.like(bind("gd_cd")))
						.cutoff$and(S0_T1.stk_id_typ.like(bind("stk_id_typ")))
						.cutoff$and(S0_T1.prov_basis_typ.like(bind("prov_basis_typ")))
						.cutoff$and(S0_T1.dlv_slip_no.like(bind("dlv_slip_no")))
						.cutoff$and(S0_T1.dlv_slip_d_no.like(bind("dlv_slip_d_no")))
						.cutoff$and(S0_T1.trd_cur_cd.like(bind("trd_cur_cd")))
						.cutoff$and(bind("base_cur_cd").neq(S0_T1.trd_cur_cd))
						.cutoff$and(S0_T1.tax_cd.like(bind("tax_cd")))
						.cutoff$and(S0_T1.prov_src_act_typ.like(bind("prov_src_act_typ")))
						.cutoff$and(S0_T1.prov_src_act_no.like(bind("prov_src_act_no")))
						.cutoff$and(S0_T1.prov_act_no.like(bind("prov_act_no")))
						.cutoff$and(S0_T1.intr_rmrks.like(bind("intr_rmrks")))
						.cutoff$and(S0_T1.trd_d_rmrks.like(bind("trd_d_rmrks")))
						.cutoff$and(S0_T1.sub_char1.like(bind("sub_char1")))
						.cutoff$and(S0_T1.sub_char2.like(bind("sub_char2")))
						.cutoff$and(S0_T1.sub_char3.like(bind("sub_char3")))
						.and(
							S0_T1.slip_sts_typ.eq(value(MAC_SLIP_STS_TYP.CRT.value()))
							.or(bind("dis_can_disp_flg").eq(value(true)))
						)
						.cutoff$and(
							bind("print_flg_str").eq(value(true))
							.and(
								notExists(
									subQuery()
									.select(value("X"))
									.from(S2_W1)
									.where(
										value(0).eq(value(0))
										.and(S0_T1.prov_act_no.eq(S2_W1.prov_act_no))
										.and(S0_T1.prov_act_seq.lt(S2_W1.prov_act_seq))
									)
								)
							)
						)
						.and(
								(
									bind("on_edi_flg").eq(value(true)).and(bind("off_edi_flg").eq(value(true)))
									.and(((
											bind("ope_prnt").eq(value(false)).or(
											cases()
											.when(S0_TT3.slip_prnt_flg.eq(value(true))).then(S0_TT3.edi_flg)
											.when(M_EDI_IF_CTL.bp_cd.isNotNull()).then(value(true))
											.otherwise(value(false)).eq(value(true))
											.and(S0_TT3.slip_prnt_flg.eq(value(false))))).or(
												cases()
												.when(S0_TT3.slip_prnt_flg.eq(value(true))).then(S0_TT3.edi_flg)
												.when(M_EDI_IF_CTL.bp_cd.isNotNull()).then(value(true))
												.otherwise(value(false)).eq(value(false)))))
								)
								.or( bind("on_edi_flg").eq(value(true)).and(bind("off_edi_flg").eq(value(false))).and(
										cases()
										.when(S0_TT3.slip_prnt_flg.eq(value(true))).then(S0_TT3.edi_flg)
										.when(M_EDI_IF_CTL.bp_cd.isNotNull()).then(value(true))
										.otherwise(value(false)).eq(value(true)))
										.and(S0_TT3.slip_prnt_flg.eq(value(false)).or(bind("ope_prnt").eq(value(false)))) )
								.or( bind("on_edi_flg").eq(value(false)).and(bind("off_edi_flg").eq(value(true))).and(
										cases()
										.when(S0_TT3.slip_prnt_flg.eq(value(true))).then(S0_TT3.edi_flg)
										.when(M_EDI_IF_CTL.bp_cd.isNotNull()).then(value(true))
										.otherwise(value(false))
										.eq(value(false))) )
						)
						.addDynamicPredicate(DS0C_PRSPPL_GRP)
						.addDynamicPredicate(DS0C_ITM_GRP)
					)
					.orderBy(
						S0_T1.prov_src_act_typ.asc(),
						S0_T1.prov_act_no.asc(),
						S0_T1.prov_act_seq.asc()
					)
			)
			.setDynamicSQLInfo(
				when(boundOr("ver_no"))
					.view(v -> v.leftOuterJoin(S0_T2).on(bracket(S0_T1.itm_cd.eq(S0_T2.itm_cd).and(S0_T1.itm_sub1.eq(S0_T2.itm_sub1)).and(S0_T1.itm_sub2.eq(S0_T2.itm_sub2)).and(S0_T1.itm_sub3.eq(S0_T2.itm_sub3)).and(S0_T1.lot_no.eq(S0_T2.lot_no)).and(S0_T1.sublot_no.eq(S0_T2.sublot_no)))))
					.predicate(p -> p.cutoff$and(S0_T2.ver_no.like(bind("ver_no")))),
				when(boundOr("wrk_no", "wrk_nm"))
					.view(v -> v.leftOuterJoin(S0_T3).on(bracket(S0_T1.sno1.eq(S0_T3.sno1))))
					.predicate(p -> p.cutoff$and(S0_T3.wrk_no.like(bind("wrk_no"))).cutoff$and(S0_T3.wrk_nm.like(bind("wrk_nm")))),
				when(boundOr("trd_nm"))
					.view(v -> v.leftOuterJoin(S0_M1).on(bracket(S0_T1.trd_cd.eq(S0_M1.trd_cd))))
					.predicate(p -> p.cutoff$and(S0_M1.trd_nm.like(bind("trd_nm")))),
				when(boundOr("prsppl_grp_flg1", "prsppl_grp_flg2", "prsppl_grp_flg3", "prsppl_grp_flg4", "prsppl_grp_flg5", "prsppl_grp_flg6", "prsppl_grp_flg7", "prsppl_grp_flg8", "prsppl_grp_flg9", "prsppl_grp_flg10", "subcon_flg_str", "prsppl_nm"))
					.view(v -> v.leftOuterJoin(S0_M2).on(bracket(S0_T1.prsppl_cd.eq(S0_M2.bp_cd))))
					.predicate(p -> p.cutoff$and(S0_M2.subcon_flg.eq(bind("subcon_flg_str"))).cutoff$and(S0_M2.bp_nm.like(bind("prsppl_nm")))),
				when(boundOr("prsppl_site_nm"))
					.view(v -> v.leftOuterJoin(S0_M4).on(bracket(S0_M3.site_cd.eq(S0_M4.site_cd))))
					.predicate(p -> p.cutoff$and(S0_M4.site_nm.like(bind("prsppl_site_nm")))),
				when(boundOr("prsppl_wg_nm"))
					.view(v -> v.leftOuterJoin(S0_M5).on(bracket(S0_T1.wg_cd.eq(S0_M5.wg_cd))))
					.predicate(p -> p.cutoff$and(S0_M5.wg_nm.like(bind("prsppl_wg_nm")))),
				when(boundOr("prsppl_lg_grp_nm"))
					.view(v -> v.leftOuterJoin(S0_M6).on(bracket(S0_M3.lg_grp_cd.eq(S0_M6.lg_grp_cd))))
					.predicate(p -> p.cutoff$and(S0_M6.lg_grp_nm.like(bind("prsppl_lg_grp_nm")))),
				when(boundOr("prsppl_str_ln_nm"))
					.view(v -> v.leftOuterJoin(S0_M7).on(bracket(S0_T1.loc_cd.eq(S0_M7.loc_cd).and(S0_T1.str_ln_cd.eq(S0_M7.str_ln_cd)))))
					.predicate(p -> p.cutoff$and(S0_M7.str_ln_nm.like(bind("prsppl_str_ln_nm")))),
				when(boundOr("itm_typ_d_nm"))
					.view(v -> v.leftOuterJoin(S0_M9).on(bracket(S0_M8.itm_typ.eq(S0_M9.itm_typ).and(S0_M8.itm_typ_d_cd.eq(S0_M9.itm_typ_d_cd)))))
					.predicate(p -> p.cutoff$and(S0_M9.itm_typ_d_nm.like(bind("itm_typ_d_nm")))),
				when(boundOr("gd_nm"))
					.view(v -> v.leftOuterJoin(S0_M11).on(bracket(S0_T1.gd_cd.eq(S0_M11.gd_cd))))
					.predicate(p -> p.cutoff$and(S0_M11.gd_nm.like(bind("gd_nm")))),
				when(boundOr("trd_cur_nm"))
					.view(v -> v.leftOuterJoin(S0_M12).on(bracket(S0_T1.trd_cur_cd.eq(S0_M12.cur_cd))))
					.predicate(p -> p.cutoff$and(S0_M12.cur_nm.like(bind("trd_cur_nm")))),
				when(boundOr("tax_nm"))
					.view(v -> v.leftOuterJoin(S0_M13).on(bracket(S0_T1.tax_cd.eq(S0_M13.tax_cd))))
					.predicate(p -> p.cutoff$and(S0_M13.tax_nm.like(bind("tax_nm")))),
				when(boundOr("prsppl_grp_flg1"))
					.select(DS0C_PRSPPL_GRP, S0_M2.bp_grp_cd1.as("prsppl_grp_cd1"), S0_MM11.bp_grp_nm.as("prsppl_grp_nm1"))
					.view(DS0C_PRSPPL_GRP, v -> v.leftOuterJoin(S0_MM11).on(S0_M2.bp_grp_cd1.eq(S0_MM11.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP1.value()).eq(S0_MM11.bp_grp_typ))))
					.predicate(DS0C_PRSPPL_GRP, p -> p.cutoff$and(S0_M2.bp_grp_cd1.like(bind("prsppl_grp_cd1"))).cutoff$and(S0_MM11.bp_grp_nm.like(bind("prsppl_grp_nm1")))),
				when(boundOr("prsppl_grp_flg2"))
					.select(DS0C_PRSPPL_GRP, S0_M2.bp_grp_cd2.as("prsppl_grp_cd2"), S0_MM12.bp_grp_nm.as("prsppl_grp_nm2"))
					.view(DS0C_PRSPPL_GRP, v -> v.leftOuterJoin(S0_MM12).on(S0_M2.bp_grp_cd2.eq(S0_MM12.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP2.value()).eq(S0_MM12.bp_grp_typ))))
					.predicate(DS0C_PRSPPL_GRP, p -> p.cutoff$and(S0_M2.bp_grp_cd2.like(bind("prsppl_grp_cd2"))).cutoff$and(S0_MM12.bp_grp_nm.like(bind("prsppl_grp_nm2")))),
				when(boundOr("prsppl_grp_flg3"))
					.select(DS0C_PRSPPL_GRP, S0_M2.bp_grp_cd3.as("prsppl_grp_cd3"), S0_MM13.bp_grp_nm.as("prsppl_grp_nm3"))
					.view(DS0C_PRSPPL_GRP, v -> v.leftOuterJoin(S0_MM13).on(S0_M2.bp_grp_cd3.eq(S0_MM13.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP3.value()).eq(S0_MM13.bp_grp_typ))))
					.predicate(DS0C_PRSPPL_GRP, p -> p.cutoff$and(S0_M2.bp_grp_cd3.like(bind("prsppl_grp_cd3"))).cutoff$and(S0_MM13.bp_grp_nm.like(bind("prsppl_grp_nm3")))),
				when(boundOr("prsppl_grp_flg4"))
					.select(DS0C_PRSPPL_GRP, S0_M2.bp_grp_cd4.as("prsppl_grp_cd4"), S0_MM14.bp_grp_nm.as("prsppl_grp_nm4"))
					.view(DS0C_PRSPPL_GRP, v -> v.leftOuterJoin(S0_MM14).on(S0_M2.bp_grp_cd4.eq(S0_MM14.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP4.value()).eq(S0_MM14.bp_grp_typ))))
					.predicate(DS0C_PRSPPL_GRP, p -> p.cutoff$and(S0_M2.bp_grp_cd4.like(bind("prsppl_grp_cd4"))).cutoff$and(S0_MM14.bp_grp_nm.like(bind("prsppl_grp_nm4")))),
				when(boundOr("prsppl_grp_flg5"))
					.select(DS0C_PRSPPL_GRP, S0_M2.bp_grp_cd5.as("prsppl_grp_cd5"), S0_MM15.bp_grp_nm.as("prsppl_grp_nm5"))
					.view(DS0C_PRSPPL_GRP, v -> v.leftOuterJoin(S0_MM15).on(S0_M2.bp_grp_cd5.eq(S0_MM15.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP5.value()).eq(S0_MM15.bp_grp_typ))))
					.predicate(DS0C_PRSPPL_GRP, p -> p.cutoff$and(S0_M2.bp_grp_cd5.like(bind("prsppl_grp_cd5"))).cutoff$and(S0_MM15.bp_grp_nm.like(bind("prsppl_grp_nm5")))),
				when(boundOr("prsppl_grp_flg6"))
					.select(DS0C_PRSPPL_GRP, S0_M2.bp_grp_cd6.as("prsppl_grp_cd6"), S0_MM16.bp_grp_nm.as("prsppl_grp_nm6"))
					.view(DS0C_PRSPPL_GRP, v -> v.leftOuterJoin(S0_MM16).on(S0_M2.bp_grp_cd6.eq(S0_MM16.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP6.value()).eq(S0_MM16.bp_grp_typ))))
					.predicate(DS0C_PRSPPL_GRP, p -> p.cutoff$and(S0_M2.bp_grp_cd6.like(bind("prsppl_grp_cd6"))).cutoff$and(S0_MM16.bp_grp_nm.like(bind("prsppl_grp_nm6")))),
				when(boundOr("prsppl_grp_flg7"))
					.select(DS0C_PRSPPL_GRP, S0_M2.bp_grp_cd7.as("prsppl_grp_cd7"), S0_MM17.bp_grp_nm.as("prsppl_grp_nm7"))
					.view(DS0C_PRSPPL_GRP, v -> v.leftOuterJoin(S0_MM17).on(S0_M2.bp_grp_cd7.eq(S0_MM17.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP7.value()).eq(S0_MM17.bp_grp_typ))))
					.predicate(DS0C_PRSPPL_GRP, p -> p.cutoff$and(S0_M2.bp_grp_cd7.like(bind("prsppl_grp_cd7"))).cutoff$and(S0_MM17.bp_grp_nm.like(bind("prsppl_grp_nm7")))),
				when(boundOr("prsppl_grp_flg8"))
					.select(DS0C_PRSPPL_GRP, S0_M2.bp_grp_cd8.as("prsppl_grp_cd8"), S0_MM18.bp_grp_nm.as("prsppl_grp_nm8"))
					.view(DS0C_PRSPPL_GRP, v -> v.leftOuterJoin(S0_MM18).on(S0_M2.bp_grp_cd8.eq(S0_MM18.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP8.value()).eq(S0_MM18.bp_grp_typ))))
					.predicate(DS0C_PRSPPL_GRP, p -> p.cutoff$and(S0_M2.bp_grp_cd8.like(bind("prsppl_grp_cd8"))).cutoff$and(S0_MM18.bp_grp_nm.like(bind("prsppl_grp_nm8")))),
				when(boundOr("prsppl_grp_flg9"))
					.select(DS0C_PRSPPL_GRP, S0_M2.bp_grp_cd9.as("prsppl_grp_cd9"), S0_MM19.bp_grp_nm.as("prsppl_grp_nm9"))
					.view(DS0C_PRSPPL_GRP, v -> v.leftOuterJoin(S0_MM19).on(S0_M2.bp_grp_cd9.eq(S0_MM19.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP9.value()).eq(S0_MM19.bp_grp_typ))))
					.predicate(DS0C_PRSPPL_GRP, p -> p.cutoff$and(S0_M2.bp_grp_cd9.like(bind("prsppl_grp_cd9"))).cutoff$and(S0_MM19.bp_grp_nm.like(bind("prsppl_grp_nm9")))),
				when(boundOr("prsppl_grp_flg10"))
					.select(DS0C_PRSPPL_GRP, S0_M2.bp_grp_cd10.as("prsppl_grp_cd10"), S0_MM110.bp_grp_nm.as("prsppl_grp_nm10"))
					.view(DS0C_PRSPPL_GRP, v -> v.leftOuterJoin(S0_MM110).on(S0_M2.bp_grp_cd10.eq(S0_MM110.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP10.value()).eq(S0_MM110.bp_grp_typ))))
					.predicate(DS0C_PRSPPL_GRP, p -> p.cutoff$and(S0_M2.bp_grp_cd10.like(bind("prsppl_grp_cd10"))).cutoff$and(S0_MM110.bp_grp_nm.like(bind("prsppl_grp_nm10")))),
				when(boundOr("itm_grp_flg1"))
					.select(DS0C_ITM_GRP, S0_M8.itm_grp_cd1.as("itm_grp_cd1"), S0_MM21.itm_grp_nm.as("itm_grp_nm1"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM21).on(S0_M8.itm_grp_cd1.eq(S0_MM21.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP1.value()).eq(S0_MM21.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M8.itm_grp_cd1.like(bind("itm_grp_cd1"))).cutoff$and(S0_MM21.itm_grp_nm.like(bind("itm_grp_nm1")))),
				when(boundOr("itm_grp_flg2"))
					.select(DS0C_ITM_GRP, S0_M8.itm_grp_cd2.as("itm_grp_cd2"), S0_MM22.itm_grp_nm.as("itm_grp_nm2"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM22).on(S0_M8.itm_grp_cd2.eq(S0_MM22.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP2.value()).eq(S0_MM22.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M8.itm_grp_cd2.like(bind("itm_grp_cd2"))).cutoff$and(S0_MM22.itm_grp_nm.like(bind("itm_grp_nm2")))),
				when(boundOr("itm_grp_flg3"))
					.select(DS0C_ITM_GRP, S0_M8.itm_grp_cd3.as("itm_grp_cd3"), S0_MM23.itm_grp_nm.as("itm_grp_nm3"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM23).on(S0_M8.itm_grp_cd3.eq(S0_MM23.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP3.value()).eq(S0_MM23.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M8.itm_grp_cd3.like(bind("itm_grp_cd3"))).cutoff$and(S0_MM23.itm_grp_nm.like(bind("itm_grp_nm3")))),
				when(boundOr("itm_grp_flg4"))
					.select(DS0C_ITM_GRP, S0_M8.itm_grp_cd4.as("itm_grp_cd4"), S0_MM24.itm_grp_nm.as("itm_grp_nm4"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM24).on(S0_M8.itm_grp_cd4.eq(S0_MM24.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP4.value()).eq(S0_MM24.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M8.itm_grp_cd4.like(bind("itm_grp_cd4"))).cutoff$and(S0_MM24.itm_grp_nm.like(bind("itm_grp_nm4")))),
				when(boundOr("itm_grp_flg5"))
					.select(DS0C_ITM_GRP, S0_M8.itm_grp_cd5.as("itm_grp_cd5"), S0_MM25.itm_grp_nm.as("itm_grp_nm5"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM25).on(S0_M8.itm_grp_cd5.eq(S0_MM25.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP5.value()).eq(S0_MM25.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M8.itm_grp_cd5.like(bind("itm_grp_cd5"))).cutoff$and(S0_MM25.itm_grp_nm.like(bind("itm_grp_nm5")))),
				when(boundOr("itm_grp_flg6"))
					.select(DS0C_ITM_GRP, S0_M8.itm_grp_cd6.as("itm_grp_cd6"), S0_MM26.itm_grp_nm.as("itm_grp_nm6"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM26).on(S0_M8.itm_grp_cd6.eq(S0_MM26.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP6.value()).eq(S0_MM26.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M8.itm_grp_cd6.like(bind("itm_grp_cd6"))).cutoff$and(S0_MM26.itm_grp_nm.like(bind("itm_grp_nm6")))),
				when(boundOr("itm_grp_flg7"))
					.select(DS0C_ITM_GRP, S0_M8.itm_grp_cd7.as("itm_grp_cd7"), S0_MM27.itm_grp_nm.as("itm_grp_nm7"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM27).on(S0_M8.itm_grp_cd7.eq(S0_MM27.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP7.value()).eq(S0_MM27.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M8.itm_grp_cd7.like(bind("itm_grp_cd7"))).cutoff$and(S0_MM27.itm_grp_nm.like(bind("itm_grp_nm7")))),
				when(boundOr("itm_grp_flg8"))
					.select(DS0C_ITM_GRP, S0_M8.itm_grp_cd8.as("itm_grp_cd8"), S0_MM28.itm_grp_nm.as("itm_grp_nm8"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM28).on(S0_M8.itm_grp_cd8.eq(S0_MM28.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP8.value()).eq(S0_MM28.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M8.itm_grp_cd8.like(bind("itm_grp_cd8"))).cutoff$and(S0_MM28.itm_grp_nm.like(bind("itm_grp_nm8")))),
				when(boundOr("itm_grp_flg9"))
					.select(DS0C_ITM_GRP, S0_M8.itm_grp_cd9.as("itm_grp_cd9"), S0_MM29.itm_grp_nm.as("itm_grp_nm9"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM29).on(S0_M8.itm_grp_cd9.eq(S0_MM29.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP9.value()).eq(S0_MM29.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M8.itm_grp_cd9.like(bind("itm_grp_cd9"))).cutoff$and(S0_MM29.itm_grp_nm.like(bind("itm_grp_nm9")))),
				when(boundOr("itm_grp_flg10"))
					.select(DS0C_ITM_GRP, S0_M8.itm_grp_cd10.as("itm_grp_cd10"), S0_MM210.itm_grp_nm.as("itm_grp_nm10"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM210).on(S0_M8.itm_grp_cd10.eq(S0_MM210.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP10.value()).eq(S0_MM210.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M8.itm_grp_cd10.like(bind("itm_grp_cd10"))).cutoff$and(S0_MM210.itm_grp_nm.like(bind("itm_grp_nm10"))))
			)
			.setJoinInfo(
				joinInfo(
					j -> j
						.add(MST_PROV_SCHD_R.class, r -> toCondition(
							r.getStringNE("prov_schd_no")
						))
						.addSelect(m -> toArray(
							m.ptax_xrate_inpt_flg,
							m.tax_fix_flg,
							m.xrate_inpt_flg
						))
						.addMap((r, m) -> {
							r.setBooleanNE("tax_fix_flg", m.tax_fix_flg());
							r.setBooleanNE("xrate_inpt_flg", m.xrate_inpt_flg());
							r.setBooleanNE("ptax_xrate_inpt_flg", m.ptax_xrate_inpt_flg());
					}),
					j -> j
						.add(MST_PURC_RET_ACT_IO_R.class, r -> toCondition(
							r.getStringNE("prov_src_act_no")
						))
						.addSelect(m -> toArray(
							m.purc_ret_act_d_no
						))
						.addMap((r, m) -> {
							r.setStringNE("purc_ret_act_d_no", m.purc_ret_act_d_no());
					}),
					j -> j
						.add(MST_PURC_RET_ACT_D_R.class, r -> toCondition(
							r.getStringNE("purc_ret_act_d_no")
						))
						.addSelect(m -> toArray(
							m.purc_ret_act_no
						))
						.addMap((r, m) -> {
							r.setStringNE("purc_ret_act_no", m.purc_ret_act_no());
					}),
					j -> j
						.add(MSVT_LOT_LIST_R.class, r -> toCondition(
							r.getStringNE("itm_cd"),
							r.getStringNE("itm_sub1"),
							r.getStringNE("itm_sub2"),
							r.getStringNE("itm_sub3"),
							r.getStringNE("lot_no"),
							r.getStringNE("sublot_no")
						))
						.addSelect(m -> toArray(
							m.ver_no
						))
						.addMap((r, m) -> {
							r.setStringNE("ver_no", m.ver_no());
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
							r.getStringNE("prsppl_cd")
						))
						.addSelect(m -> toArray(
							m.bp_nm,
							m.prov_amt_rnd_typ,
							m.prov_tax_rnd_typ
						))
						.addMap((r, m) -> {
							r.setStringNE("prsppl_nm", m.bp_nm());
							r.setStringNE("prov_amt_rnd_typ", m.prov_amt_rnd_typ());
							r.setStringNE("prov_tax_rnd_typ", m.prov_tax_rnd_typ());
					}),
					j -> j
						.add(MAM_WG_R.class, r -> toCondition(
							r.getStringNE("prsppl_wg_cd")
						))
						.addSelect(m -> toArray(
							m.wg_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("prsppl_wg_nm", m.wg_nm());
					}),
					j -> j
						.add(MAM_STR_LN_R.class, r -> toCondition(
							r.getStringNE("prsppl_loc_cd"),
							r.getStringNE("str_ln_cd")
						))
						.addSelect(m -> toArray(
							m.str_ln_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("str_ln_nm", m.str_ln_nm());
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
							r.setStringNE("tax_typ", m.tax_typ());
							r.setBooleanNE("inc_tax_flg", m.inc_tax_flg());
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
						.add(MAM_BIZ_RSN_R.class, r -> toCondition(
							r.getStringNE("xfr_rsn_cd")
						))
						.addSelect(m -> toArray(
							m.acxfr_gi_flg,
							m.biz_rsn_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("xfr_rsn_nm", m.biz_rsn_nm());
							r.setBooleanNE("acxfr_gi_flg", m.acxfr_gi_flg());
					})
				)
			);
	}
	
	/**
	 * -- MSBEL1160_MST_PROV_ACT_Query_S07
	 */
	static MCQueryPlan MSBEL1160_MST_PROV_ACT_S07() {
		MST_PROV_ACT_R S0_T1 = MST_PROV_ACT_R.create("T1");
		MST_DLV_SLIP_R S0_TT3 = MST_DLV_SLIP_R.create("TT3");
		MSVT_LOT_LIST_R S0_T2 = MSVT_LOT_LIST_R.create("T2");
		MSVT_WRK_SNO_R S0_T3 = MSVT_WRK_SNO_R.create("T3");
		MAM_TRD_R S0_M1 = MAM_TRD_R.create("M1");
		MAM_BP_R S0_M2 = MAM_BP_R.create("M2");
		MAVM_RD_LOC_R S0_M3 = MAVM_RD_LOC_R.create("M3");
		MAM_SITE_R S0_M4 = MAM_SITE_R.create("M4");
		MAM_WG_R S0_M5 = MAM_WG_R.create("M5");
		MAM_LG_GRP_R S0_M6 = MAM_LG_GRP_R.create("M6");
		MAM_STR_LN_R S0_M7 = MAM_STR_LN_R.create("M7");
		MAM_ITM_R S0_M8 = MAM_ITM_R.create("M8");
		MAM_ITM_TYP_D_R S0_M9 = MAM_ITM_TYP_D_R.create("M9");
		MAM_SUNDRY_ITM_R S0_M10 = MAM_SUNDRY_ITM_R.create("M10");
		MAM_STK_GD_R S0_M11 = MAM_STK_GD_R.create("M11");
		MAM_CUR_R S0_M12 = MAM_CUR_R.create("M12");
		MAM_TAX_R S0_M13 = MAM_TAX_R.create("M13");
		MAM_DPT_R S0_M18 = MAM_DPT_R.create("M18");
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
		MST_DLV_SLIP_R S1_W1 = MST_DLV_SLIP_R.create("W1");
		MST_PROV_ACT_R S2_W1 = MST_PROV_ACT_R.create("W1");
		MAM_EDI_IF_CTL_R M_EDI_IF_CTL = MAM_EDI_IF_CTL_R.create("M19");
		
		MCDynamicSQLID DS0C_ITM_GRP = createDynamicSQLID("DS0C_ITM_GRP");
		MCDynamicSQLID DS0C_PRSPPL_GRP = createDynamicSQLID("DS0C_PRSPPL_GRP");
		
		return createQueryPlan()
			.setQuery(
				sql("MSBEL1160_MST_PROV_ACT_Query_S07")
					.mainQuery()
					.select(
						S0_T1.prov_act_no,
						S0_T1.prov_act_seq,
						S0_T1.prov_act_rev,
						S0_T1.slip_sts_typ,
						S0_T1.prov_schd_no,
						S0_T1.prov_src_act_typ,
						S0_T1.prov_src_act_no,
						S0_T1.trd_cd,
						S0_T1.trd_ptn_typ,
						S0_T1.xfr_rsn_cd,
						S0_T1.base_unit_cd,
						S0_T1.base_unit_qty.as("act_qty"),
						S0_T1.accpt_dt,
						S0_T1.ac_dt,
						S0_T1.ac_ym,
						S0_T1.base_ac_dt,
						S0_T1.wg_cd.as("prsppl_wg_cd"),
						S0_T1.prsppl_cd,
						S0_T1.ap_dpt_cd,
						S0_M18.dpt_nm.as("ap_dpt_nm"),
						S0_T1.prov_typ,
						S0_T1.prov_basis_typ,
						S0_T1.xrate_cd,
						S0_T1.xrate,
						S0_T1.ptax_xrate,
						S0_T1.trd_cur_cd,
						S0_T1.base_cur_cd,
						S0_T1.ptax_cur_cd,
						S0_T1.tax_cd,
						S0_T1.trd_cur_upri,
						S0_T1.trd_cur_upri.as("old_trd_cur_upri"),
						S0_T1.trd_cur_amt,
						S0_T1.trd_cur_tax_amt,
						S0_T1.trd_cur_amt.add(S0_T1.trd_cur_tax_amt).as("trd_cur_inc_tax_amt"),
						S0_T1.base_cur_upri,
						S0_T1.base_cur_amt,
						S0_T1.base_cur_tax_amt,
						S0_T1.base_cur_amt.add(S0_T1.base_cur_tax_amt).as("base_cur_inc_tax_amt"),
						S0_T1.ptax_cur_upri,
						S0_T1.ptax_cur_amt,
						S0_T1.ptax_cur_tax_amt,
						S0_T1.ptax_cur_amt.add(S0_T1.ptax_cur_tax_amt).as("ptax_cur_inc_tax_amt"),
						S0_T1.wtax_rate,
						S0_T1.wtax_amt,
						S0_T1.itm_cd,
						S0_T1.itm_sub1,
						S0_T1.itm_sub2,
						S0_T1.itm_sub3,
						coalesce(
							S0_M10.itm_nm,
							S0_M8.itm_nm
						).as("itm_nm"),
						S0_M8.itm_typ,
						S0_M8.itm_typ_d_cd,
						S0_M8.sundry_itm_flg,
						S0_M8.asset_mng_typ,
						S0_T1.loc_cd.as("prsppl_loc_cd"),
						S0_M3.loc_nm.as("prsppl_loc_nm"),
						S0_T1.str_ln_cd,
						S0_T1.lot_no,
						S0_T1.sublot_no,
						S0_T1.sno1,
						S0_T1.sno2,
						S0_T1.sno3,
						S0_T1.sno4,
						S0_T1.gd_cd,
						S0_T1.stk_id_typ,
						S0_T1.intr_rmrks,
						S0_T1.trd_d_rmrks,
						S0_T1.sub_char1,
						S0_T1.sub_char2,
						S0_T1.sub_char3,
						S0_T1.ins_usr_id,
						S0_T1.ins_usr_nm,
						S0_T1.ins_ts,
						S0_T1.ins_func_id,
						S0_T1.upd_cntr.as("prov_upd_cntr"),
						S0_T1.upd_usr_id,
						S0_T1.upd_usr_nm,
						S0_T1.upd_ts,
						S0_T1.upd_func_id,
						S0_T1.upd_srv_req_no,
						S0_M8.dec_place.as("base_unit_dec_place"),
						S0_M8.rnd_typ.as("base_unit_rnd_typ"),
						S0_T1.dlv_slip_no,
						S0_T1.dlv_slip_d_no,
						S0_TT3.slip_prnt_flg.as("dlv_prnted_flg"),
						cases()
						.when(S0_TT3.slip_prnt_flg.eq(value(true))).then(S0_TT3.edi_flg)
						.when(M_EDI_IF_CTL.bp_cd.isNotNull()).then(value(true))
						.otherwise(value(false))
						.as("edi_flg"),
						addDynamicSelect(DS0C_PRSPPL_GRP),
						addDynamicSelect(DS0C_ITM_GRP)
					)
					.from(
						S0_T1
						.leftOuterJoin(S0_TT3).on(
							bracket(
								S0_T1.dlv_slip_no.eq(S0_TT3.dlv_slip_no)
								.and(
									S0_TT3.slip_sts_typ.eq(value(MAC_SLIP_STS_TYP.CRT.value()))
									.cutoff$or(
										bind("print_flg_str").eq(value(true))
										.and(
											notExists(
												subQuery()
												.select(value("X"))
												.from(S1_W1)
												.where(
													value(0).eq(value(0))
													.and(S0_TT3.dlv_slip_no.eq(S1_W1.dlv_slip_no))
													.and(S0_TT3.dlv_slip_seq.lt(S1_W1.dlv_slip_seq))
												)
											)
										)
									)
								)
							)
						)
						.innerJoin(S0_M3).on(
							bracket(
								S0_T1.loc_cd.eq(S0_M3.loc_cd)
							)
						)
						.leftOuterJoin(S0_M8).on(
							bracket(
								S0_T1.itm_cd.eq(S0_M8.itm_cd)
								.and(S0_T1.itm_sub1.eq(S0_M8.itm_sub1))
								.and(S0_T1.itm_sub2.eq(S0_M8.itm_sub2))
								.and(S0_T1.itm_sub3.eq(S0_M8.itm_sub3))
							)
						)
						.leftOuterJoin(S0_M10).on(
							bracket(
								S0_T1.itm_cd.eq(S0_M10.itm_cd)
								.and(S0_T1.itm_sub1.eq(S0_M10.itm_sub1))
								.and(S0_T1.itm_sub2.eq(S0_M10.itm_sub2))
								.and(S0_T1.itm_sub3.eq(S0_M10.itm_sub3))
								.and(S0_T1.sno1.eq(S0_M10.sno1))
								.and(S0_T1.sno2.eq(S0_M10.sno2))
								.and(S0_T1.sno3.eq(S0_M10.sno3))
								.and(S0_T1.sno4.eq(S0_M10.sno4))
							)
						)
						.leftOuterJoin(S0_M18).on(
							bracket(
								S0_T1.ap_dpt_cd.eq(S0_M18.dpt_cd)
								.and(S0_T1.ac_dt.between(S0_M18.st_dt, S0_M18.end_dt))
							)
						)
						.leftOuterJoin(M_EDI_IF_CTL).on(
								bracket(
										S0_TT3.bp_cd.eq(M_EDI_IF_CTL.bp_cd)
									.and(M_EDI_IF_CTL.if_proc_typ.eq(value(MAC_IF_PROC_TYP.BILL_SEND.value())))
									.and(S0_TT3.ac_dt.between(M_EDI_IF_CTL.st_dt, M_EDI_IF_CTL.end_dt))
									.and(M_EDI_IF_CTL.not_onr_prov_flg.eq(value(false)))
									.and(M_EDI_IF_CTL.del_flg.eq(value(false)))
								)
							)
						.addDynamicView()
						.addDynamicView(DS0C_PRSPPL_GRP)
						.addDynamicView(DS0C_ITM_GRP)
					)
					.where(
						value(0).eq(value(0))
						.and(S0_T1.prov_src_act_typ.eq(value(MSC_PROV_SRC_ACT_TYP.INPT.value())))
						.and(
							S0_T1.trd_ptn_typ.in(
								bind("prov_str"),
								bind("prov_rtn_str")
							)
						)
						.and(
							S0_T1.prov_typ.in(
								bind("ffr_prov_flg_str"),
								bind("onr_prov_flg_str")
							)
						)
						.addDynamicPredicate()
						.cutoff$and(
							bracket(
								S0_TT3.slip_prnt_flg.eq(bind("dlv_prnted_str"))
								.or(S0_TT3.slip_prnt_flg.isNull())
								.and(bind("dlv_prnted_str").eq(value(false)))
							)
						)
						.cutoff$and(S0_T1.accpt_dt.gte(bind("accpt_dt_fr")))
						.cutoff$and(S0_T1.accpt_dt.lte(bind("accpt_dt_to")))
						.cutoff$and(S0_T1.ac_ym.gte(bind("ac_ym_fr")))
						.cutoff$and(S0_T1.ac_ym.lte(bind("ac_ym_to")))
						.cutoff$and(S0_T1.ac_dt.gte(bind("ac_dt_fr")))
						.cutoff$and(S0_T1.ac_dt.lte(bind("ac_dt_to")))
						.cutoff$and(nullValue().gte(bind("arr_act_hm_fr")))
						.cutoff$and(nullValue().lte(bind("arr_act_hm_to")))
						.cutoff$and(S0_T1.trd_cd.like(bind("trd_cd")))
						.cutoff$and(S0_T1.prsppl_cd.like(bind("prsppl_cd")))
						.cutoff$and(S0_T1.ap_dpt_cd.like(bind("ap_dpt_cd")))
						.cutoff$and(S0_M18.dpt_nm.like(bind("ap_dpt_nm")))
						.cutoff$and(S0_T1.loc_cd.like(bind("prsppl_loc_cd")))
						.cutoff$and(S0_M3.loc_nm.like(bind("prsppl_loc_nm")))
						.cutoff$and(S0_M3.site_cd.like(bind("prsppl_site_cd")))
						.cutoff$and(S0_T1.wg_cd.like(bind("prsppl_wg_cd")))
						.cutoff$and(S0_M3.lg_grp_cd.like(bind("prsppl_lg_grp_cd")))
						.cutoff$and(S0_T1.str_ln_cd.like(bind("prsppl_str_ln_cd")))
						.cutoff$and(S0_M8.itm_typ.like(bind("itm_typ")))
						.cutoff$and(S0_M8.itm_typ_d_cd.like(bind("itm_typ_d_cd")))
						.cutoff$and(S0_T1.itm_cd.like(bind("itm_cd")))
						.cutoff$and(S0_T1.itm_sub1.like(bind("itm_sub1")))
						.cutoff$and(S0_T1.itm_sub2.like(bind("itm_sub2")))
						.cutoff$and(S0_T1.itm_sub3.like(bind("itm_sub3")))
						.cutoff$and(
							coalesce(
								S0_M10.itm_nm,
								S0_M8.itm_nm
							).like(bind("itm_nm"))
						)
						.cutoff$and(S0_T1.lot_no.like(bind("lot_no")))
						.cutoff$and(S0_T1.sublot_no.like(bind("sublot_no")))
						.cutoff$and(S0_T1.sno1.like(bind("sno1")))
						.cutoff$and(S0_T1.sno2.like(bind("sno2")))
						.cutoff$and(S0_T1.sno3.like(bind("sno3")))
						.cutoff$and(S0_T1.sno4.like(bind("sno4")))
						.cutoff$and(S0_T1.gd_cd.like(bind("gd_cd")))
						.cutoff$and(S0_T1.stk_id_typ.like(bind("stk_id_typ")))
						.cutoff$and(S0_T1.prov_basis_typ.like(bind("prov_basis_typ")))
						.cutoff$and(S0_T1.dlv_slip_no.like(bind("dlv_slip_no")))
						.cutoff$and(S0_T1.dlv_slip_d_no.like(bind("dlv_slip_d_no")))
						.cutoff$and(S0_T1.trd_cur_cd.like(bind("trd_cur_cd")))
						.cutoff$and(bind("base_cur_cd").neq(S0_T1.trd_cur_cd))
						.cutoff$and(S0_T1.tax_cd.like(bind("tax_cd")))
						.cutoff$and(S0_T1.prov_src_act_typ.like(bind("prov_src_act_typ")))
						.cutoff$and(S0_T1.prov_src_act_no.like(bind("prov_src_act_no")))
						.cutoff$and(S0_T1.prov_act_no.like(bind("prov_act_no")))
						.cutoff$and(S0_T1.intr_rmrks.like(bind("intr_rmrks")))
						.cutoff$and(S0_T1.trd_d_rmrks.like(bind("trd_d_rmrks")))
						.cutoff$and(S0_T1.sub_char1.like(bind("sub_char1")))
						.cutoff$and(S0_T1.sub_char2.like(bind("sub_char2")))
						.cutoff$and(S0_T1.sub_char3.like(bind("sub_char3")))
						.and(
							S0_T1.slip_sts_typ.eq(value(MAC_SLIP_STS_TYP.CRT.value()))
							.or(bind("dis_can_disp_flg").eq(value(true)))
						)
						.cutoff$and(
							bind("print_flg_str").eq(value(true))
							.and(
								notExists(
									subQuery()
									.select(value("X"))
									.from(S2_W1)
									.where(
										value(0).eq(value(0))
										.and(S0_T1.prov_act_no.eq(S2_W1.prov_act_no))
										.and(S0_T1.prov_act_seq.lt(S2_W1.prov_act_seq))
									)
								)
							)
						)
						.and(
								(
									bind("on_edi_flg").eq(value(true)).and(bind("off_edi_flg").eq(value(true)))
									.and(((
											bind("ope_prnt").eq(value(false)).or(
											cases()
											.when(S0_TT3.slip_prnt_flg.eq(value(true))).then(S0_TT3.edi_flg)
											.when(M_EDI_IF_CTL.bp_cd.isNotNull()).then(value(true))
											.otherwise(value(false)).eq(value(true))
											.and(S0_TT3.slip_prnt_flg.eq(value(false))))).or(
												cases()
												.when(S0_TT3.slip_prnt_flg.eq(value(true))).then(S0_TT3.edi_flg)
												.when(M_EDI_IF_CTL.bp_cd.isNotNull()).then(value(true))
												.otherwise(value(false)).eq(value(false)))))
								)
								.or( bind("on_edi_flg").eq(value(true)).and(bind("off_edi_flg").eq(value(false))).and(
										cases()
										.when(S0_TT3.slip_prnt_flg.eq(value(true))).then(S0_TT3.edi_flg)
										.when(M_EDI_IF_CTL.bp_cd.isNotNull()).then(value(true))
										.otherwise(value(false)).eq(value(true)))
										.and(S0_TT3.slip_prnt_flg.eq(value(false)).or(bind("ope_prnt").eq(value(false)))) )
								.or( bind("on_edi_flg").eq(value(false)).and(bind("off_edi_flg").eq(value(true))).and(
										cases()
										.when(S0_TT3.slip_prnt_flg.eq(value(true))).then(S0_TT3.edi_flg)
										.when(M_EDI_IF_CTL.bp_cd.isNotNull()).then(value(true))
										.otherwise(value(false))
										.eq(value(false))) )
						)
						.addDynamicPredicate(DS0C_PRSPPL_GRP)
						.addDynamicPredicate(DS0C_ITM_GRP)
					)
					.orderBy(
						S0_T1.prov_src_act_typ.asc(),
						S0_T1.prov_act_no.asc(),
						S0_T1.prov_act_seq.asc()
					)
			)
			.setDynamicSQLInfo(
				when(boundOr("ver_no"))
					.view(v -> v.leftOuterJoin(S0_T2).on(bracket(S0_T1.itm_cd.eq(S0_T2.itm_cd).and(S0_T1.itm_sub1.eq(S0_T2.itm_sub1)).and(S0_T1.itm_sub2.eq(S0_T2.itm_sub2)).and(S0_T1.itm_sub3.eq(S0_T2.itm_sub3)).and(S0_T1.lot_no.eq(S0_T2.lot_no)).and(S0_T1.sublot_no.eq(S0_T2.sublot_no)))))
					.predicate(p -> p.cutoff$and(S0_T2.ver_no.like(bind("ver_no")))),
				when(boundOr("wrk_no", "wrk_nm"))
					.view(v -> v.leftOuterJoin(S0_T3).on(bracket(S0_T1.sno1.eq(S0_T3.sno1))))
					.predicate(p -> p.cutoff$and(S0_T3.wrk_no.like(bind("wrk_no"))).cutoff$and(S0_T3.wrk_nm.like(bind("wrk_nm")))),
				when(boundOr("trd_nm"))
					.view(v -> v.leftOuterJoin(S0_M1).on(bracket(S0_T1.trd_cd.eq(S0_M1.trd_cd))))
					.predicate(p -> p.cutoff$and(S0_M1.trd_nm.like(bind("trd_nm")))),
				when(boundOr("prsppl_grp_flg1", "prsppl_grp_flg2", "prsppl_grp_flg3", "prsppl_grp_flg4", "prsppl_grp_flg5", "prsppl_grp_flg6", "prsppl_grp_flg7", "prsppl_grp_flg8", "prsppl_grp_flg9", "prsppl_grp_flg10", "subcon_flg_str", "prsppl_nm"))
					.view(v -> v.leftOuterJoin(S0_M2).on(bracket(S0_T1.prsppl_cd.eq(S0_M2.bp_cd))))
					.predicate(p -> p.cutoff$and(S0_M2.subcon_flg.eq(bind("subcon_flg_str"))).cutoff$and(S0_M2.bp_nm.like(bind("prsppl_nm")))),
				when(boundOr("prsppl_site_nm"))
					.view(v -> v.leftOuterJoin(S0_M4).on(bracket(S0_M3.site_cd.eq(S0_M4.site_cd))))
					.predicate(p -> p.cutoff$and(S0_M4.site_nm.like(bind("prsppl_site_nm")))),
				when(boundOr("prsppl_wg_nm"))
					.view(v -> v.leftOuterJoin(S0_M5).on(bracket(S0_T1.wg_cd.eq(S0_M5.wg_cd))))
					.predicate(p -> p.cutoff$and(S0_M5.wg_nm.like(bind("prsppl_wg_nm")))),
				when(boundOr("prsppl_lg_grp_nm"))
					.view(v -> v.leftOuterJoin(S0_M6).on(bracket(S0_M3.lg_grp_cd.eq(S0_M6.lg_grp_cd))))
					.predicate(p -> p.cutoff$and(S0_M6.lg_grp_nm.like(bind("prsppl_lg_grp_nm")))),
				when(boundOr("prsppl_str_ln_nm"))
					.view(v -> v.leftOuterJoin(S0_M7).on(bracket(S0_T1.loc_cd.eq(S0_M7.loc_cd).and(S0_T1.str_ln_cd.eq(S0_M7.str_ln_cd)))))
					.predicate(p -> p.cutoff$and(S0_M7.str_ln_nm.like(bind("prsppl_str_ln_nm")))),
				when(boundOr("itm_typ_d_nm"))
					.view(v -> v.leftOuterJoin(S0_M9).on(bracket(S0_M8.itm_typ.eq(S0_M9.itm_typ).and(S0_M8.itm_typ_d_cd.eq(S0_M9.itm_typ_d_cd)))))
					.predicate(p -> p.cutoff$and(S0_M9.itm_typ_d_nm.like(bind("itm_typ_d_nm")))),
				when(boundOr("gd_nm"))
					.view(v -> v.leftOuterJoin(S0_M11).on(bracket(S0_T1.gd_cd.eq(S0_M11.gd_cd))))
					.predicate(p -> p.cutoff$and(S0_M11.gd_nm.like(bind("gd_nm")))),
				when(boundOr("trd_cur_nm"))
					.view(v -> v.leftOuterJoin(S0_M12).on(bracket(S0_T1.trd_cur_cd.eq(S0_M12.cur_cd))))
					.predicate(p -> p.cutoff$and(S0_M12.cur_nm.like(bind("trd_cur_nm")))),
				when(boundOr("tax_nm"))
					.view(v -> v.leftOuterJoin(S0_M13).on(bracket(S0_T1.tax_cd.eq(S0_M13.tax_cd))))
					.predicate(p -> p.cutoff$and(S0_M13.tax_nm.like(bind("tax_nm")))),
				when(boundOr("prsppl_grp_flg1"))
					.select(DS0C_PRSPPL_GRP, S0_M2.bp_grp_cd1.as("prsppl_grp_cd1"), S0_MM11.bp_grp_nm.as("prsppl_grp_nm1"))
					.view(DS0C_PRSPPL_GRP, v -> v.leftOuterJoin(S0_MM11).on(S0_M2.bp_grp_cd1.eq(S0_MM11.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP1.value()).eq(S0_MM11.bp_grp_typ))))
					.predicate(DS0C_PRSPPL_GRP, p -> p.cutoff$and(S0_M2.bp_grp_cd1.like(bind("prsppl_grp_cd1"))).cutoff$and(S0_MM11.bp_grp_nm.like(bind("prsppl_grp_nm1")))),
				when(boundOr("prsppl_grp_flg2"))
					.select(DS0C_PRSPPL_GRP, S0_M2.bp_grp_cd2.as("prsppl_grp_cd2"), S0_MM12.bp_grp_nm.as("prsppl_grp_nm2"))
					.view(DS0C_PRSPPL_GRP, v -> v.leftOuterJoin(S0_MM12).on(S0_M2.bp_grp_cd2.eq(S0_MM12.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP2.value()).eq(S0_MM12.bp_grp_typ))))
					.predicate(DS0C_PRSPPL_GRP, p -> p.cutoff$and(S0_M2.bp_grp_cd2.like(bind("prsppl_grp_cd2"))).cutoff$and(S0_MM12.bp_grp_nm.like(bind("prsppl_grp_nm2")))),
				when(boundOr("prsppl_grp_flg3"))
					.select(DS0C_PRSPPL_GRP, S0_M2.bp_grp_cd3.as("prsppl_grp_cd3"), S0_MM13.bp_grp_nm.as("prsppl_grp_nm3"))
					.view(DS0C_PRSPPL_GRP, v -> v.leftOuterJoin(S0_MM13).on(S0_M2.bp_grp_cd3.eq(S0_MM13.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP3.value()).eq(S0_MM13.bp_grp_typ))))
					.predicate(DS0C_PRSPPL_GRP, p -> p.cutoff$and(S0_M2.bp_grp_cd3.like(bind("prsppl_grp_cd3"))).cutoff$and(S0_MM13.bp_grp_nm.like(bind("prsppl_grp_nm3")))),
				when(boundOr("prsppl_grp_flg4"))
					.select(DS0C_PRSPPL_GRP, S0_M2.bp_grp_cd4.as("prsppl_grp_cd4"), S0_MM14.bp_grp_nm.as("prsppl_grp_nm4"))
					.view(DS0C_PRSPPL_GRP, v -> v.leftOuterJoin(S0_MM14).on(S0_M2.bp_grp_cd4.eq(S0_MM14.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP4.value()).eq(S0_MM14.bp_grp_typ))))
					.predicate(DS0C_PRSPPL_GRP, p -> p.cutoff$and(S0_M2.bp_grp_cd4.like(bind("prsppl_grp_cd4"))).cutoff$and(S0_MM14.bp_grp_nm.like(bind("prsppl_grp_nm4")))),
				when(boundOr("prsppl_grp_flg5"))
					.select(DS0C_PRSPPL_GRP, S0_M2.bp_grp_cd5.as("prsppl_grp_cd5"), S0_MM15.bp_grp_nm.as("prsppl_grp_nm5"))
					.view(DS0C_PRSPPL_GRP, v -> v.leftOuterJoin(S0_MM15).on(S0_M2.bp_grp_cd5.eq(S0_MM15.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP5.value()).eq(S0_MM15.bp_grp_typ))))
					.predicate(DS0C_PRSPPL_GRP, p -> p.cutoff$and(S0_M2.bp_grp_cd5.like(bind("prsppl_grp_cd5"))).cutoff$and(S0_MM15.bp_grp_nm.like(bind("prsppl_grp_nm5")))),
				when(boundOr("prsppl_grp_flg6"))
					.select(DS0C_PRSPPL_GRP, S0_M2.bp_grp_cd6.as("prsppl_grp_cd6"), S0_MM16.bp_grp_nm.as("prsppl_grp_nm6"))
					.view(DS0C_PRSPPL_GRP, v -> v.leftOuterJoin(S0_MM16).on(S0_M2.bp_grp_cd6.eq(S0_MM16.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP6.value()).eq(S0_MM16.bp_grp_typ))))
					.predicate(DS0C_PRSPPL_GRP, p -> p.cutoff$and(S0_M2.bp_grp_cd6.like(bind("prsppl_grp_cd6"))).cutoff$and(S0_MM16.bp_grp_nm.like(bind("prsppl_grp_nm6")))),
				when(boundOr("prsppl_grp_flg7"))
					.select(DS0C_PRSPPL_GRP, S0_M2.bp_grp_cd7.as("prsppl_grp_cd7"), S0_MM17.bp_grp_nm.as("prsppl_grp_nm7"))
					.view(DS0C_PRSPPL_GRP, v -> v.leftOuterJoin(S0_MM17).on(S0_M2.bp_grp_cd7.eq(S0_MM17.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP7.value()).eq(S0_MM17.bp_grp_typ))))
					.predicate(DS0C_PRSPPL_GRP, p -> p.cutoff$and(S0_M2.bp_grp_cd7.like(bind("prsppl_grp_cd7"))).cutoff$and(S0_MM17.bp_grp_nm.like(bind("prsppl_grp_nm7")))),
				when(boundOr("prsppl_grp_flg8"))
					.select(DS0C_PRSPPL_GRP, S0_M2.bp_grp_cd8.as("prsppl_grp_cd8"), S0_MM18.bp_grp_nm.as("prsppl_grp_nm8"))
					.view(DS0C_PRSPPL_GRP, v -> v.leftOuterJoin(S0_MM18).on(S0_M2.bp_grp_cd8.eq(S0_MM18.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP8.value()).eq(S0_MM18.bp_grp_typ))))
					.predicate(DS0C_PRSPPL_GRP, p -> p.cutoff$and(S0_M2.bp_grp_cd8.like(bind("prsppl_grp_cd8"))).cutoff$and(S0_MM18.bp_grp_nm.like(bind("prsppl_grp_nm8")))),
				when(boundOr("prsppl_grp_flg9"))
					.select(DS0C_PRSPPL_GRP, S0_M2.bp_grp_cd9.as("prsppl_grp_cd9"), S0_MM19.bp_grp_nm.as("prsppl_grp_nm9"))
					.view(DS0C_PRSPPL_GRP, v -> v.leftOuterJoin(S0_MM19).on(S0_M2.bp_grp_cd9.eq(S0_MM19.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP9.value()).eq(S0_MM19.bp_grp_typ))))
					.predicate(DS0C_PRSPPL_GRP, p -> p.cutoff$and(S0_M2.bp_grp_cd9.like(bind("prsppl_grp_cd9"))).cutoff$and(S0_MM19.bp_grp_nm.like(bind("prsppl_grp_nm9")))),
				when(boundOr("prsppl_grp_flg10"))
					.select(DS0C_PRSPPL_GRP, S0_M2.bp_grp_cd10.as("prsppl_grp_cd10"), S0_MM110.bp_grp_nm.as("prsppl_grp_nm10"))
					.view(DS0C_PRSPPL_GRP, v -> v.leftOuterJoin(S0_MM110).on(S0_M2.bp_grp_cd10.eq(S0_MM110.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP10.value()).eq(S0_MM110.bp_grp_typ))))
					.predicate(DS0C_PRSPPL_GRP, p -> p.cutoff$and(S0_M2.bp_grp_cd10.like(bind("prsppl_grp_cd10"))).cutoff$and(S0_MM110.bp_grp_nm.like(bind("prsppl_grp_nm10")))),
				when(boundOr("itm_grp_flg1"))
					.select(DS0C_ITM_GRP, S0_M8.itm_grp_cd1.as("itm_grp_cd1"), S0_MM21.itm_grp_nm.as("itm_grp_nm1"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM21).on(S0_M8.itm_grp_cd1.eq(S0_MM21.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP1.value()).eq(S0_MM21.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M8.itm_grp_cd1.like(bind("itm_grp_cd1"))).cutoff$and(S0_MM21.itm_grp_nm.like(bind("itm_grp_nm1")))),
				when(boundOr("itm_grp_flg2"))
					.select(DS0C_ITM_GRP, S0_M8.itm_grp_cd2.as("itm_grp_cd2"), S0_MM22.itm_grp_nm.as("itm_grp_nm2"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM22).on(S0_M8.itm_grp_cd2.eq(S0_MM22.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP2.value()).eq(S0_MM22.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M8.itm_grp_cd2.like(bind("itm_grp_cd2"))).cutoff$and(S0_MM22.itm_grp_nm.like(bind("itm_grp_nm2")))),
				when(boundOr("itm_grp_flg3"))
					.select(DS0C_ITM_GRP, S0_M8.itm_grp_cd3.as("itm_grp_cd3"), S0_MM23.itm_grp_nm.as("itm_grp_nm3"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM23).on(S0_M8.itm_grp_cd3.eq(S0_MM23.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP3.value()).eq(S0_MM23.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M8.itm_grp_cd3.like(bind("itm_grp_cd3"))).cutoff$and(S0_MM23.itm_grp_nm.like(bind("itm_grp_nm3")))),
				when(boundOr("itm_grp_flg4"))
					.select(DS0C_ITM_GRP, S0_M8.itm_grp_cd4.as("itm_grp_cd4"), S0_MM24.itm_grp_nm.as("itm_grp_nm4"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM24).on(S0_M8.itm_grp_cd4.eq(S0_MM24.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP4.value()).eq(S0_MM24.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M8.itm_grp_cd4.like(bind("itm_grp_cd4"))).cutoff$and(S0_MM24.itm_grp_nm.like(bind("itm_grp_nm4")))),
				when(boundOr("itm_grp_flg5"))
					.select(DS0C_ITM_GRP, S0_M8.itm_grp_cd5.as("itm_grp_cd5"), S0_MM25.itm_grp_nm.as("itm_grp_nm5"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM25).on(S0_M8.itm_grp_cd5.eq(S0_MM25.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP5.value()).eq(S0_MM25.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M8.itm_grp_cd5.like(bind("itm_grp_cd5"))).cutoff$and(S0_MM25.itm_grp_nm.like(bind("itm_grp_nm5")))),
				when(boundOr("itm_grp_flg6"))
					.select(DS0C_ITM_GRP, S0_M8.itm_grp_cd6.as("itm_grp_cd6"), S0_MM26.itm_grp_nm.as("itm_grp_nm6"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM26).on(S0_M8.itm_grp_cd6.eq(S0_MM26.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP6.value()).eq(S0_MM26.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M8.itm_grp_cd6.like(bind("itm_grp_cd6"))).cutoff$and(S0_MM26.itm_grp_nm.like(bind("itm_grp_nm6")))),
				when(boundOr("itm_grp_flg7"))
					.select(DS0C_ITM_GRP, S0_M8.itm_grp_cd7.as("itm_grp_cd7"), S0_MM27.itm_grp_nm.as("itm_grp_nm7"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM27).on(S0_M8.itm_grp_cd7.eq(S0_MM27.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP7.value()).eq(S0_MM27.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M8.itm_grp_cd7.like(bind("itm_grp_cd7"))).cutoff$and(S0_MM27.itm_grp_nm.like(bind("itm_grp_nm7")))),
				when(boundOr("itm_grp_flg8"))
					.select(DS0C_ITM_GRP, S0_M8.itm_grp_cd8.as("itm_grp_cd8"), S0_MM28.itm_grp_nm.as("itm_grp_nm8"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM28).on(S0_M8.itm_grp_cd8.eq(S0_MM28.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP8.value()).eq(S0_MM28.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M8.itm_grp_cd8.like(bind("itm_grp_cd8"))).cutoff$and(S0_MM28.itm_grp_nm.like(bind("itm_grp_nm8")))),
				when(boundOr("itm_grp_flg9"))
					.select(DS0C_ITM_GRP, S0_M8.itm_grp_cd9.as("itm_grp_cd9"), S0_MM29.itm_grp_nm.as("itm_grp_nm9"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM29).on(S0_M8.itm_grp_cd9.eq(S0_MM29.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP9.value()).eq(S0_MM29.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M8.itm_grp_cd9.like(bind("itm_grp_cd9"))).cutoff$and(S0_MM29.itm_grp_nm.like(bind("itm_grp_nm9")))),
				when(boundOr("itm_grp_flg10"))
					.select(DS0C_ITM_GRP, S0_M8.itm_grp_cd10.as("itm_grp_cd10"), S0_MM210.itm_grp_nm.as("itm_grp_nm10"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM210).on(S0_M8.itm_grp_cd10.eq(S0_MM210.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP10.value()).eq(S0_MM210.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M8.itm_grp_cd10.like(bind("itm_grp_cd10"))).cutoff$and(S0_MM210.itm_grp_nm.like(bind("itm_grp_nm10"))))
			)
			.setJoinInfo(
				joinInfo(
					j -> j
						.add(MST_PROV_SCHD_R.class, r -> toCondition(
							r.getStringNE("prov_schd_no")
						))
						.addSelect(m -> toArray(
							m.ptax_xrate_inpt_flg,
							m.tax_fix_flg,
							m.xrate_inpt_flg
						))
						.addMap((r, m) -> {
							r.setBooleanNE("tax_fix_flg", m.tax_fix_flg());
							r.setBooleanNE("xrate_inpt_flg", m.xrate_inpt_flg());
							r.setBooleanNE("ptax_xrate_inpt_flg", m.ptax_xrate_inpt_flg());
					}),
					j -> j
						.add(MST_INPT_ACT_R.class, r -> toCondition(
							r.getStringNE("prov_src_act_no")
						))
						.addSelect(m -> toArray(
							m.mfg_act_no
						))
						.addMap((r, m) -> {
							r.setStringNE("join_mfg_act_no_", m.mfg_act_no());
					}),
					j -> j
						.add(MST_MFG_ACT_R.class, r -> toCondition(
							r.getStringNE("join_mfg_act_no_")
						))
						.addSelect(m -> toArray(
							m.mfg_act_no,
							m.mfg_inst_no
						))
						.addMap((r, m) -> {
							r.setStringNE("mfg_act_no", m.mfg_act_no());
							r.setStringNE("mfg_inst_no", m.mfg_inst_no());
					}),
					j -> j
						.add(MSVT_LOT_LIST_R.class, r -> toCondition(
							r.getStringNE("itm_cd"),
							r.getStringNE("itm_sub1"),
							r.getStringNE("itm_sub2"),
							r.getStringNE("itm_sub3"),
							r.getStringNE("lot_no"),
							r.getStringNE("sublot_no")
						))
						.addSelect(m -> toArray(
							m.ver_no
						))
						.addMap((r, m) -> {
							r.setStringNE("ver_no", m.ver_no());
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
							r.getStringNE("prsppl_cd")
						))
						.addSelect(m -> toArray(
							m.bp_nm,
							m.prov_amt_rnd_typ,
							m.prov_tax_rnd_typ
						))
						.addMap((r, m) -> {
							r.setStringNE("prsppl_nm", m.bp_nm());
							r.setStringNE("prov_amt_rnd_typ", m.prov_amt_rnd_typ());
							r.setStringNE("prov_tax_rnd_typ", m.prov_tax_rnd_typ());
					}),
					j -> j
						.add(MAM_WG_R.class, r -> toCondition(
							r.getStringNE("prsppl_wg_cd")
						))
						.addSelect(m -> toArray(
							m.wg_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("prsppl_wg_nm", m.wg_nm());
					}),
					j -> j
						.add(MAM_STR_LN_R.class, r -> toCondition(
							r.getStringNE("prsppl_loc_cd"),
							r.getStringNE("str_ln_cd")
						))
						.addSelect(m -> toArray(
							m.str_ln_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("str_ln_nm", m.str_ln_nm());
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
							r.setStringNE("tax_typ", m.tax_typ());
							r.setBooleanNE("inc_tax_flg", m.inc_tax_flg());
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
						.add(MAM_BIZ_RSN_R.class, r -> toCondition(
							r.getStringNE("xfr_rsn_cd")
						))
						.addSelect(m -> toArray(
							m.acxfr_gi_flg,
							m.biz_rsn_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("xfr_rsn_nm", m.biz_rsn_nm());
							r.setBooleanNE("acxfr_gi_flg", m.acxfr_gi_flg());
					})
				)
			);
	}
	
	/**
	 * -- MSBEL1160_MST_PROV_ACT_Query_S08
	 */
	static MCQueryPlan MSBEL1160_MST_PROV_ACT_S08() {
		MST_PROV_ACT_R S0_T1 = MST_PROV_ACT_R.create("T1");
		MSW_PROV_ACT_KEY_R S0_T2 = MSW_PROV_ACT_KEY_R.create("T2");
		MST_XFR_ACT_D_R S0_T3 = MST_XFR_ACT_D_R.create("T3");
		MST_PROV_ACT_R S1_T1 = MST_PROV_ACT_R.create("T1");
		MSW_PROV_ACT_KEY_R S1_T2 = MSW_PROV_ACT_KEY_R.create("T2");
		MST_ARR_ACT_R S1_T3 = MST_ARR_ACT_R.create("T3");
		MST_ARR_SCHD_R S1_T4 = MST_ARR_SCHD_R.create("T4");
		MST_PROV_ACT_R S2_T1 = MST_PROV_ACT_R.create("T1");
		MSW_PROV_ACT_KEY_R S2_T2 = MSW_PROV_ACT_KEY_R.create("T2");
		MST_ARR_ACT_R S2_T3 = MST_ARR_ACT_R.create("T3");
		MST_PROV_ACT_R S3_T1 = MST_PROV_ACT_R.create("T1");
		MSW_PROV_ACT_KEY_R S3_T2 = MSW_PROV_ACT_KEY_R.create("T2");
		MST_SHIP_ACT_D_R S3_T3 = MST_SHIP_ACT_D_R.create("T3");
		MST_PROV_ACT_R S4_T1 = MST_PROV_ACT_R.create("T1");
		MSW_PROV_ACT_KEY_R S4_T2 = MSW_PROV_ACT_KEY_R.create("T2");
		MST_PURC_ACT_IO_R S4_T3 = MST_PURC_ACT_IO_R.create("T3");
		MST_ARR_ACT_R S4_T4 = MST_ARR_ACT_R.create("T4");
		MST_PROV_ACT_R S5_T1 = MST_PROV_ACT_R.create("T1");
		MSW_PROV_ACT_KEY_R S5_T2 = MSW_PROV_ACT_KEY_R.create("T2");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBEL1160_MST_PROV_ACT_Query_S08")
					.mainQuery()
					.select(
						S0_T1.prov_act_no,
						S0_T1.prov_act_seq,
						S0_T1.prov_src_act_typ,
						S0_T3.dlv_slip_no,
						S0_T1.ac_dt,
						S0_T1.trd_ptn_typ,
						S0_T1.prsppl_cd,
						S0_T1.prov_typ,
						S0_T1.prov_basis_typ,
						S0_T1.tax_cd,
						S0_T1.xrate_cd,
						S0_T1.xrate,
						S0_T1.ptax_xrate,
						S0_T1.wtax_rate,
						S0_T1.trd_cur_cd,
						S0_T1.base_cur_cd,
						S0_T1.ptax_cur_cd
					)
					.from(
						S0_T1
						.innerJoin(S0_T2).on(
							bracket(
								value(0).eq(value(0))
								.and(S0_T1.prov_act_no.eq(S0_T2.prov_act_no))
								.and(S0_T1.prov_act_seq.eq(S0_T2.prov_act_seq))
							)
						)
						.innerJoin(S0_T3).on(
							bracket(
								S0_T1.prov_src_act_no.eq(S0_T3.xfr_act_d_no)
							)
						)
					)
					.where(
						value(0).eq(value(0))
						.and(S0_T1.prov_src_act_typ.eq(value(MSC_PROV_SRC_ACT_TYP.XFR.value())))
						.and(
							S0_T1.trd_ptn_typ.in(
								value(MAC_TRD_PTN_TYP.PROV.value()),
								value(MAC_TRD_PTN_TYP.PROV_RTN.value())
							)
						)
						.and(
							S0_T1.prov_typ.in(
								value(MAC_PROV_TYP.FFR_PROV.value()),
								value(MAC_PROV_TYP.ONR_PROV.value())
							)
						)
						.and(S0_T1.slip_sts_typ.eq(value(MAC_SLIP_STS_TYP.CRT.value())))
					)
					.unionAll(
						subQuery()
						.select(
							S1_T1.prov_act_no,
							S1_T1.prov_act_seq,
							S1_T1.prov_src_act_typ,
							S1_T4.dlv_slip_no,
							S1_T1.ac_dt,
							S1_T1.trd_ptn_typ,
							S1_T1.prsppl_cd,
							S1_T1.prov_typ,
							S1_T1.prov_basis_typ,
							S1_T1.tax_cd,
							S1_T1.xrate_cd,
							S1_T1.xrate,
							S1_T1.ptax_xrate,
							S1_T1.wtax_rate,
							S1_T1.trd_cur_cd,
							S1_T1.base_cur_cd,
							S1_T1.ptax_cur_cd
						)
						.from(
							S1_T1
							.innerJoin(S1_T2).on(
								bracket(
									value(0).eq(value(0))
									.and(S1_T1.prov_act_no.eq(S1_T2.prov_act_no))
									.and(S1_T1.prov_act_seq.eq(S1_T2.prov_act_seq))
								)
							)
							.innerJoin(S1_T3).on(
								bracket(
									S1_T1.prov_src_act_no.eq(S1_T3.arr_act_no)
								)
							)
							.innerJoin(S1_T4).on(
								bracket(
									S1_T3.arr_schd_no.eq(S1_T4.arr_schd_no)
								)
							)
						)
						.where(
							value(0).eq(value(0))
							.and(S1_T1.prov_src_act_typ.eq(value(MSC_PROV_SRC_ACT_TYP.SHIP.value())))
							.and(
								S1_T1.trd_ptn_typ.in(
									value(MAC_TRD_PTN_TYP.PROV.value()),
									value(MAC_TRD_PTN_TYP.PROV_RTN.value())
								)
							)
							.and(
								S1_T1.prov_typ.in(
									value(MAC_PROV_TYP.FFR_PROV.value()),
									value(MAC_PROV_TYP.ONR_PROV.value())
								)
							)
							.and(S1_T1.slip_sts_typ.eq(value(MAC_SLIP_STS_TYP.CRT.value())))
						)
						.unionAll(
							subQuery()
							.select(
								S2_T1.prov_act_no,
								S2_T1.prov_act_seq,
								S2_T1.prov_src_act_typ,
								S2_T3.dlv_slip_no,
								S2_T1.ac_dt,
								S2_T1.trd_ptn_typ,
								S2_T1.prsppl_cd,
								S2_T1.prov_typ,
								S2_T1.prov_basis_typ,
								S2_T1.tax_cd,
								S2_T1.xrate_cd,
								S2_T1.xrate,
								S2_T1.ptax_xrate,
								S2_T1.wtax_rate,
								S2_T1.trd_cur_cd,
								S2_T1.base_cur_cd,
								S2_T1.ptax_cur_cd
							)
							.from(
								S2_T1
								.innerJoin(S2_T2).on(
									bracket(
										value(0).eq(value(0))
										.and(S2_T1.prov_act_no.eq(S2_T2.prov_act_no))
										.and(S2_T1.prov_act_seq.eq(S2_T2.prov_act_seq))
									)
								)
								.innerJoin(S2_T3).on(
									bracket(
										S2_T1.prov_src_act_no.eq(S2_T3.arr_act_no)
									)
								)
							)
							.where(
								value(0).eq(value(0))
								.and(
									S2_T1.prov_src_act_typ.in(
										value(MSC_PROV_SRC_ACT_TYP.NON_ARR_DDLV.value()),
										value(MSC_PROV_SRC_ACT_TYP.NCV_RCV_DDLV.value())
									)
								)
								.and(
									S2_T1.trd_ptn_typ.in(
										value(MAC_TRD_PTN_TYP.PROV.value()),
										value(MAC_TRD_PTN_TYP.PROV_RTN.value())
									)
								)
								.and(
									S2_T1.prov_typ.in(
										value(MAC_PROV_TYP.FFR_PROV.value()),
										value(MAC_PROV_TYP.ONR_PROV.value())
									)
								)
								.and(S2_T1.slip_sts_typ.eq(value(MAC_SLIP_STS_TYP.CRT.value())))
							)
							.unionAll(
								subQuery()
								.select(
									S3_T1.prov_act_no,
									S3_T1.prov_act_seq,
									S3_T1.prov_src_act_typ,
									S3_T3.dlv_slip_no,
									S3_T1.ac_dt,
									S3_T1.trd_ptn_typ,
									S3_T1.prsppl_cd,
									S3_T1.prov_typ,
									S3_T1.prov_basis_typ,
									S3_T1.tax_cd,
									S3_T1.xrate_cd,
									S3_T1.xrate,
									S3_T1.ptax_xrate,
									S3_T1.wtax_rate,
									S3_T1.trd_cur_cd,
									S3_T1.base_cur_cd,
									S3_T1.ptax_cur_cd
								)
								.from(
									S3_T1
									.innerJoin(S3_T2).on(
										bracket(
											value(0).eq(value(0))
											.and(S3_T1.prov_act_no.eq(S3_T2.prov_act_no))
											.and(S3_T1.prov_act_seq.eq(S3_T2.prov_act_seq))
										)
									)
									.innerJoin(S3_T3).on(
										bracket(
											value(0).eq(value(0))
											.and(S3_T1.prov_src_act_no.eq(S3_T3.ship_act_d_no))
											.and(S3_T3.can_flg.eq(value(false)))
										)
									)
								)
								.where(
									value(0).eq(value(0))
									.and(S3_T1.prov_src_act_typ.eq(value(MSC_PROV_SRC_ACT_TYP.RET_SHIP.value())))
									.and(
										S3_T1.trd_ptn_typ.in(
											value(MAC_TRD_PTN_TYP.PROV.value()),
											value(MAC_TRD_PTN_TYP.PROV_RTN.value())
										)
									)
									.and(
										S3_T1.prov_typ.in(
											value(MAC_PROV_TYP.FFR_PROV.value()),
											value(MAC_PROV_TYP.ONR_PROV.value())
										)
									)
									.and(S3_T1.slip_sts_typ.eq(value(MAC_SLIP_STS_TYP.CRT.value())))
								)
								.unionAll(
									subQuery()
									.select(
										S4_T1.prov_act_no,
										S4_T1.prov_act_seq,
										S4_T1.prov_src_act_typ,
										S4_T4.dlv_slip_no,
										S4_T1.ac_dt,
										S4_T1.trd_ptn_typ,
										S4_T1.prsppl_cd,
										S4_T1.prov_typ,
										S4_T1.prov_basis_typ,
										S4_T1.tax_cd,
										S4_T1.xrate_cd,
										S4_T1.xrate,
										S4_T1.ptax_xrate,
										S4_T1.wtax_rate,
										S4_T1.trd_cur_cd,
										S4_T1.base_cur_cd,
										S4_T1.ptax_cur_cd
									)
									.from(
										S4_T1
										.innerJoin(S4_T2).on(
											bracket(
												value(0).eq(value(0))
												.and(S4_T1.prov_act_no.eq(S4_T2.prov_act_no))
												.and(S4_T1.prov_act_seq.eq(S4_T2.prov_act_seq))
											)
										)
										.innerJoin(S4_T3).on(
											bracket(
												S4_T1.prov_src_act_no.eq(S4_T3.purc_act_io_no)
											)
										)
										.innerJoin(S4_T4).on(
											bracket(
												S4_T3.arr_act_no.eq(S4_T4.arr_act_no)
											)
										)
									)
									.where(
										value(0).eq(value(0))
										.and(S4_T1.prov_src_act_typ.eq(value(MSC_PROV_SRC_ACT_TYP.DDLV.value())))
										.and(
											S4_T1.trd_ptn_typ.in(
												value(MAC_TRD_PTN_TYP.PROV.value()),
												value(MAC_TRD_PTN_TYP.PROV_RTN.value())
											)
										)
										.and(
											S4_T1.prov_typ.in(
												value(MAC_PROV_TYP.FFR_PROV.value()),
												value(MAC_PROV_TYP.ONR_PROV.value())
											)
										)
										.and(S4_T1.slip_sts_typ.eq(value(MAC_SLIP_STS_TYP.CRT.value())))
									)
									.unionAll(
										subQuery()
										.select(
											S5_T1.prov_act_no,
											S5_T1.prov_act_seq,
											S5_T1.prov_src_act_typ,
											S5_T1.dlv_slip_no,
											S5_T1.ac_dt,
											S5_T1.trd_ptn_typ,
											S5_T1.prsppl_cd,
											S5_T1.prov_typ,
											S5_T1.prov_basis_typ,
											S5_T1.tax_cd,
											S5_T1.xrate_cd,
											S5_T1.xrate,
											S5_T1.ptax_xrate,
											S5_T1.wtax_rate,
											S5_T1.trd_cur_cd,
											S5_T1.base_cur_cd,
											S5_T1.ptax_cur_cd
										)
										.from(
											S5_T1
											.innerJoin(S5_T2).on(
												bracket(
													value(0).eq(value(0))
													.and(S5_T1.prov_act_no.eq(S5_T2.prov_act_no))
													.and(S5_T1.prov_act_seq.eq(S5_T2.prov_act_seq))
												)
											)
										)
										.where(
											value(0).eq(value(0))
											.and(
												S5_T1.prov_src_act_typ.in(
													value(MSC_PROV_SRC_ACT_TYP.RET_DDLV.value()),
													value(MSC_PROV_SRC_ACT_TYP.INPT.value())
												)
											)
											.and(
												S5_T1.trd_ptn_typ.in(
													value(MAC_TRD_PTN_TYP.PROV.value()),
													value(MAC_TRD_PTN_TYP.PROV_RTN.value())
												)
											)
											.and(
												S5_T1.prov_typ.in(
													value(MAC_PROV_TYP.FFR_PROV.value()),
													value(MAC_PROV_TYP.ONR_PROV.value())
												)
											)
											.and(S5_T1.slip_sts_typ.eq(value(MAC_SLIP_STS_TYP.CRT.value())))
										)
									)
								)
							)
						)
					)
			)
			.setJoinInfo(
					joinInfo(
						j -> j
							.add(MAM_TAX_R.class, r -> toCondition(
								r.getStringNE("tax_cd")
							))
							.addSelect(m -> toArray(
								m.tax_rate
							))
							.addMap((r, m) -> {
								r.setNumberNE("tax_rate", m.tax_rate());
						})
					)
			);
	}
	
	/**
	 * -- MSBEL1160_MST_PROV_ACT_Query_S09
	 */
	static MCQueryPlan MSBEL1160_MST_PROV_ACT_S09() {
		MST_PROV_ACT_R S0_T1 = MST_PROV_ACT_R.create("T1");
		MST_XFR_ACT_D_R S0_T3 = MST_XFR_ACT_D_R.create("T3");
		MSW_DLV_SLIP_KEY_R S0_T4 = MSW_DLV_SLIP_KEY_R.create("T4");
		MST_PROV_ACT_R S1_T1 = MST_PROV_ACT_R.create("T1");
		MST_ARR_ACT_R S1_T3 = MST_ARR_ACT_R.create("T3");
		MST_ARR_SCHD_R S1_T4 = MST_ARR_SCHD_R.create("T4");
		MST_ARR_PR_R S1_T5 = MST_ARR_PR_R.create("T5");
		MSW_DLV_SLIP_KEY_R S1_T6 = MSW_DLV_SLIP_KEY_R.create("T6");
		MST_PROV_ACT_R S2_T1 = MST_PROV_ACT_R.create("T1");
		MST_ARR_ACT_R S2_T2 = MST_ARR_ACT_R.create("T2");
		MSW_DLV_SLIP_KEY_R S2_T3 = MSW_DLV_SLIP_KEY_R.create("T3");
		MST_PROV_ACT_R S3_T1 = MST_PROV_ACT_R.create("T1");
		MST_SHIP_ACT_D_R S3_T2 = MST_SHIP_ACT_D_R.create("T2");
		MSW_DLV_SLIP_KEY_R S3_T3 = MSW_DLV_SLIP_KEY_R.create("T3");
		MST_PROV_ACT_R S4_T1 = MST_PROV_ACT_R.create("T1");
		MST_PURC_ACT_IO_R S4_T2 = MST_PURC_ACT_IO_R.create("T2");
		MST_ARR_ACT_R S4_T3 = MST_ARR_ACT_R.create("T3");
		MSW_DLV_SLIP_KEY_R S4_T4 = MSW_DLV_SLIP_KEY_R.create("T4");
		MST_PROV_ACT_R S5_T1 = MST_PROV_ACT_R.create("T1");
		MSW_DLV_SLIP_KEY_R S5_T2 = MSW_DLV_SLIP_KEY_R.create("T2");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBEL1160_MST_PROV_ACT_Query_S09")
					.mainQuery()
					.select(
						S0_T3.dlv_slip_no,
						count(value("X")).as("counts")
					)
					.from(
						S0_T1
						.innerJoin(S0_T3).on(
							bracket(
								S0_T1.prov_src_act_no.eq(S0_T3.xfr_act_d_no)
							)
						)
						.innerJoin(S0_T4).on(
							bracket(
								S0_T3.dlv_slip_no.eq(S0_T4.dlv_slip_no)
							)
						)
					)
					.where(
						value(0).eq(value(0))
						.and(S0_T1.prov_src_act_typ.eq(value(MSC_PROV_SRC_ACT_TYP.XFR.value())))
						.and(
							S0_T1.trd_ptn_typ.in(
								value(MAC_TRD_PTN_TYP.PROV.value()),
								value(MAC_TRD_PTN_TYP.PROV_RTN.value())
							)
						)
						.and(
							S0_T1.prov_typ.in(
								value(MAC_PROV_TYP.FFR_PROV.value()),
								value(MAC_PROV_TYP.ONR_PROV.value())
							)
						)
						.and(S0_T1.slip_sts_typ.eq(value(MAC_SLIP_STS_TYP.CRT.value())))
					)
					.groupBy(S0_T3.dlv_slip_no)
					.unionAll(
						subQuery()
						.select(
							S1_T4.dlv_slip_no,
							count(value("X")).as("counts")
						)
						.from(
							S1_T1
							.innerJoin(S1_T3).on(
								bracket(
									S1_T1.prov_src_act_no.eq(S1_T3.arr_act_no)
								)
							)
							.innerJoin(S1_T4).on(
								bracket(
									S1_T3.arr_schd_no.eq(S1_T4.arr_schd_no)
								)
							)
							.innerJoin(S1_T5).on(
								bracket(
									S1_T4.arr_pr_no.eq(S1_T5.arr_pr_no)
								)
							)
							.innerJoin(S1_T6).on(
								bracket(
									S1_T4.dlv_slip_no.eq(S1_T6.dlv_slip_no)
								)
							)
						)
						.where(
							value(0).eq(value(0))
							.and(S1_T1.prov_src_act_typ.eq(value(MSC_PROV_SRC_ACT_TYP.SHIP.value())))
							.and(
								S1_T1.trd_ptn_typ.in(
									value(MAC_TRD_PTN_TYP.PROV.value()),
									value(MAC_TRD_PTN_TYP.PROV_RTN.value())
								)
							)
							.and(
								S1_T1.prov_typ.in(
									value(MAC_PROV_TYP.FFR_PROV.value()),
									value(MAC_PROV_TYP.ONR_PROV.value())
								)
							)
							.and(S1_T1.slip_sts_typ.eq(value(MAC_SLIP_STS_TYP.CRT.value())))
						)
						.groupBy(S1_T4.dlv_slip_no)
						.unionAll(
							subQuery()
							.select(
								S2_T2.dlv_slip_no,
								count(value("X")).as("counts")
							)
							.from(
								S2_T1
								.innerJoin(S2_T2).on(
									bracket(
										S2_T1.prov_src_act_no.eq(S2_T2.arr_act_no)
									)
								)
								.innerJoin(S2_T3).on(
									bracket(
										S2_T2.dlv_slip_no.eq(S2_T3.dlv_slip_no)
									)
								)
							)
							.where(
								value(0).eq(value(0))
								.and(
									S2_T1.prov_src_act_typ.in(
										value(MSC_PROV_SRC_ACT_TYP.NON_ARR_DDLV.value()),
										value(MSC_PROV_SRC_ACT_TYP.NCV_RCV_DDLV.value())
									)
								)
								.and(
									S2_T1.trd_ptn_typ.in(
										value(MAC_TRD_PTN_TYP.PROV.value()),
										value(MAC_TRD_PTN_TYP.PROV_RTN.value())
									)
								)
								.and(
									S2_T1.prov_typ.in(
										value(MAC_PROV_TYP.FFR_PROV.value()),
										value(MAC_PROV_TYP.ONR_PROV.value())
									)
								)
								.and(S2_T1.slip_sts_typ.eq(value(MAC_SLIP_STS_TYP.CRT.value())))
							)
							.groupBy(S2_T2.dlv_slip_no)
							.unionAll(
								subQuery()
								.select(
									S3_T2.dlv_slip_no,
									count(value("X")).as("counts")
								)
								.from(
									S3_T1
									.innerJoin(S3_T2).on(
										bracket(
											value(0).eq(value(0))
											.and(S3_T1.prov_src_act_no.eq(S3_T2.ship_act_d_no))
											.and(S3_T2.can_flg.eq(value(false)))
										)
									)
									.innerJoin(S3_T3).on(
										bracket(
											S3_T2.dlv_slip_no.eq(S3_T3.dlv_slip_no)
										)
									)
								)
								.where(
									value(0).eq(value(0))
									.and(S3_T1.prov_src_act_typ.eq(value(MSC_PROV_SRC_ACT_TYP.RET_SHIP.value())))
									.and(
										S3_T1.trd_ptn_typ.in(
											value(MAC_TRD_PTN_TYP.PROV.value()),
											value(MAC_TRD_PTN_TYP.PROV_RTN.value())
										)
									)
									.and(
										S3_T1.prov_typ.in(
											value(MAC_PROV_TYP.FFR_PROV.value()),
											value(MAC_PROV_TYP.ONR_PROV.value())
										)
									)
									.and(S3_T1.slip_sts_typ.eq(value(MAC_SLIP_STS_TYP.CRT.value())))
								)
								.groupBy(S3_T2.dlv_slip_no)
								.unionAll(
									subQuery()
									.select(
										S4_T3.dlv_slip_no,
										count(value("X")).as("counts")
									)
									.from(
										S4_T1
										.innerJoin(S4_T2).on(
											bracket(
												S4_T1.prov_src_act_no.eq(S4_T2.purc_act_io_no)
											)
										)
										.innerJoin(S4_T3).on(
											bracket(
												S4_T2.arr_act_no.eq(S4_T3.arr_act_no)
											)
										)
										.innerJoin(S4_T4).on(
											bracket(
												S4_T3.dlv_slip_no.eq(S4_T4.dlv_slip_no)
											)
										)
									)
									.where(
										value(0).eq(value(0))
										.and(S4_T1.prov_src_act_typ.eq(value(MSC_PROV_SRC_ACT_TYP.DDLV.value())))
										.and(
											S4_T1.trd_ptn_typ.in(
												value(MAC_TRD_PTN_TYP.PROV.value()),
												value(MAC_TRD_PTN_TYP.PROV_RTN.value())
											)
										)
										.and(
											S4_T1.prov_typ.in(
												value(MAC_PROV_TYP.FFR_PROV.value()),
												value(MAC_PROV_TYP.ONR_PROV.value())
											)
										)
										.and(S4_T1.slip_sts_typ.eq(value(MAC_SLIP_STS_TYP.CRT.value())))
									)
									.groupBy(S4_T3.dlv_slip_no)
									.unionAll(
										subQuery()
										.select(
											S5_T1.dlv_slip_no,
											count(value("X")).as("counts")
										)
										.from(
											S5_T1
											.innerJoin(S5_T2).on(
												bracket(
													S5_T1.dlv_slip_no.eq(S5_T2.dlv_slip_no)
												)
											)
										)
										.where(
											value(0).eq(value(0))
											.and(
												S5_T1.prov_src_act_typ.in(
													value(MSC_PROV_SRC_ACT_TYP.RET_DDLV.value()),
													value(MSC_PROV_SRC_ACT_TYP.INPT.value())
												)
											)
											.and(
												S5_T1.trd_ptn_typ.in(
													value(MAC_TRD_PTN_TYP.PROV.value()),
													value(MAC_TRD_PTN_TYP.PROV_RTN.value())
												)
											)
											.and(
												S5_T1.prov_typ.in(
													value(MAC_PROV_TYP.FFR_PROV.value()),
													value(MAC_PROV_TYP.ONR_PROV.value())
												)
											)
											.and(S5_T1.slip_sts_typ.eq(value(MAC_SLIP_STS_TYP.CRT.value())))
										)
										.groupBy(S5_T1.dlv_slip_no)
									)
								)
							)
						)
					)
			);
	}
	
	/**
	 * -- MSBEL1160_MST_PROV_SCHD_Query_S01
	 */
	static MCQueryPlan MSBEL1160_MST_PROV_SCHD_S01() {
		MST_PROV_SCHD_R S0_T1 = MST_PROV_SCHD_R.create("T1");
		MCTempView S0_T0 = createTempView("T0");
		MST_XFR_ALLOC_STS_R S0_TT1 = MST_XFR_ALLOC_STS_R.create("TT1");
		MST_XFR_SCHD_R S0_TT2 = MST_XFR_SCHD_R.create("TT2");
		MST_XFR_INST_D_R S0_TT3 = MST_XFR_INST_D_R.create("TT3");
		MSVT_WRK_SNO_R S0_T3 = MSVT_WRK_SNO_R.create("T3");
		MAM_TRD_R S0_M1 = MAM_TRD_R.create("M1");
		MAM_BP_R S0_M2 = MAM_BP_R.create("M2");
		MAVM_RD_LOC_R S0_M3 = MAVM_RD_LOC_R.create("M3");
		MAM_SITE_R S0_M4 = MAM_SITE_R.create("M4");
		MAM_WG_R S0_M5 = MAM_WG_R.create("M5");
		MAM_LG_GRP_R S0_M6 = MAM_LG_GRP_R.create("M6");
		MAM_STR_LN_R S0_M7 = MAM_STR_LN_R.create("M7");
		MAM_ITM_R S0_M8 = MAM_ITM_R.create("M8");
		MAM_ITM_TYP_D_R S0_M9 = MAM_ITM_TYP_D_R.create("M9");
		MAM_SUNDRY_ITM_R S0_M10 = MAM_SUNDRY_ITM_R.create("M10");
		MAM_STK_GD_R S0_M11 = MAM_STK_GD_R.create("M11");
		MAM_CUR_R S0_M12 = MAM_CUR_R.create("M12");
		MAM_TAX_R S0_M13 = MAM_TAX_R.create("M13");
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
		MST_PROV_ACT_R S1_T = MST_PROV_ACT_R.create("T");
		
		MCDynamicSQLID DS0C_ITM_GRP = createDynamicSQLID("DS0C_ITM_GRP");
		MCDynamicSQLID DS0C_PRSPPL_GRP = createDynamicSQLID("DS0C_PRSPPL_GRP");
		
		return createQueryPlan()
			.setQuery(
				sql("MSBEL1160_MST_PROV_SCHD_Query_S01")
					.mainQuery()
					.select(
						S0_T1.prov_schd_no,
						S0_T1.prov_src_schd_typ,
						S0_T1.prov_src_schd_no1,
						S0_T1.prov_src_schd_no2,
						S0_T1.trd_cd,
						S0_T1.trd_ptn_typ,
						S0_T1.xfr_rsn_cd,
						S0_T1.base_unit_cd,
						S0_T1.base_unit_qty.as("schd_qty"),
						S0_T0.pr("base_unit_qty").as("act_qty"),
						S0_T1.accpt_schd_dt,
						nullValue().as("arr_schd_dt"),
						S0_T1.wg_cd.as("prsppl_wg_cd"),
						S0_T1.prsppl_cd,
						S0_T1.prov_typ,
						S0_T1.prov_basis_typ,
						S0_T1.xrate_inpt_flg,
						S0_T1.xrate,
						S0_T1.ptax_xrate_inpt_flg,
						S0_T1.ptax_xrate,
						S0_T1.trd_cur_cd,
						S0_T1.tax_fix_flg,
						S0_T1.tax_cd,
						S0_T1.trd_cur_upri,
						S0_T1.trd_cur_amt,
						S0_T1.trd_cur_tax_amt,
						S0_T1.trd_cur_amt.add(S0_T1.trd_cur_tax_amt).as("trd_cur_inc_tax_amt"),
						S0_T1.wtax_rate,
						S0_T1.wtax_amt,
						S0_T1.intr_rmrks,
						S0_T1.sub_char1,
						S0_T1.sub_char2,
						S0_T1.sub_char3,
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
						coalesce(
							S0_TT3.itm_cd,
							S0_TT2.itm_cd
						).as("itm_cd"),
						coalesce(
							S0_TT3.itm_sub1,
							S0_TT2.itm_sub1
						).as("itm_sub1"),
						coalesce(
							S0_TT3.itm_sub2,
							S0_TT2.itm_sub2
						).as("itm_sub2"),
						coalesce(
							S0_TT3.itm_sub3,
							S0_TT2.itm_sub3
						).as("itm_sub3"),
						coalesce(
							S0_M10.itm_nm,
							S0_M8.itm_nm
						).as("itm_nm"),
						S0_M8.itm_typ,
						S0_M8.itm_typ_d_cd,
						S0_M8.sundry_itm_flg,
						S0_M8.asset_mng_typ,
						decode(
							S0_T1.trd_ptn_typ,
							value(MAC_TRD_PTN_TYP.PROV.value()),
							S0_TT1.gr_loc_cd,
							value(MAC_TRD_PTN_TYP.PROV_RTN.value()),
							S0_TT1.gi_loc_cd
						).as("prsppl_loc_cd"),
						S0_M3.loc_nm.as("prsppl_loc_nm"),
						decode(
							S0_T1.trd_ptn_typ,
							value(MAC_TRD_PTN_TYP.PROV.value()),
							S0_TT1.gr_str_ln_cd,
							value(MAC_TRD_PTN_TYP.PROV_RTN.value()),
							S0_TT1.gi_str_ln_cd
						).as("str_ln_cd"),
						S0_M7.str_ln_nm,
						S0_TT1.lot_no,
						S0_TT1.sublot_no,
						S0_TT1.ver_no,
						S0_TT1.alloc_sno1.as("sno1"),
						S0_TT1.alloc_sno2.as("sno2"),
						S0_TT1.alloc_sno3.as("sno3"),
						S0_TT1.alloc_sno4.as("sno4"),
						S0_TT1.gd_cd,
						S0_TT1.stk_id_typ,
						S0_TT1.dlv_slip_no,
						S0_TT1.dlv_slip_d_no,
						addDynamicSelect(DS0C_PRSPPL_GRP),
						addDynamicSelect(DS0C_ITM_GRP)
					)
					.from(
						S0_T1
						.leftOuterJoin(
							subQuery()
							.select(
								S1_T.prov_schd_no,
								sum(S1_T.base_unit_qty).as("base_unit_qty")
							)
							.from(S1_T)
							.groupBy(S1_T.prov_schd_no).view(S0_T0)
						).on(
							bracket(
								S0_T1.prov_schd_no.eq(S0_T0.pr(S1_T.prov_schd_no))
							)
						)
						.innerJoin(S0_TT1).on(
							bracket(
								S0_T1.prov_src_schd_no1.eq(S0_TT1.xfr_alloc_sts_no)
							)
						)
						.leftOuterJoin(S0_TT2).on(
							bracket(
								S0_TT1.xfr_schd_no.eq(S0_TT2.xfr_schd_no)
							)
						)
						.leftOuterJoin(S0_TT3).on(
							bracket(
								S0_TT1.xfr_inst_d_no.eq(S0_TT3.xfr_inst_d_no)
							)
						)
						.innerJoin(S0_M3).on(
							bracket(
								decode(
									S0_T1.trd_ptn_typ,
									value(MAC_TRD_PTN_TYP.PROV.value()),
									S0_TT1.gr_loc_cd,
									value(MAC_TRD_PTN_TYP.PROV_RTN.value()),
									S0_TT1.gi_loc_cd
								).eq(S0_M3.loc_cd)
							)
						)
						.leftOuterJoin(S0_M7).on(
							bracket(
								decode(
									S0_T1.trd_ptn_typ,
									value(MAC_TRD_PTN_TYP.PROV.value()),
									S0_TT1.gr_loc_cd,
									value(MAC_TRD_PTN_TYP.PROV_RTN.value()),
									S0_TT1.gi_loc_cd
								).eq(S0_M7.loc_cd)
								.and(
									decode(
										S0_T1.trd_ptn_typ,
										value(MAC_TRD_PTN_TYP.PROV.value()),
										S0_TT1.gr_str_ln_cd,
										value(MAC_TRD_PTN_TYP.PROV_RTN.value()),
										S0_TT1.gi_str_ln_cd
									).eq(S0_M7.str_ln_cd)
								)
							)
						)
						.leftOuterJoin(S0_M8).on(
							bracket(
								coalesce(
									S0_TT3.itm_cd,
									S0_TT2.itm_cd
								).eq(S0_M8.itm_cd)
								.and(
									coalesce(
										S0_TT3.itm_sub1,
										S0_TT2.itm_sub1
									).eq(S0_M8.itm_sub1)
								)
								.and(
									coalesce(
										S0_TT3.itm_sub2,
										S0_TT2.itm_sub2
									).eq(S0_M8.itm_sub2)
								)
								.and(
									coalesce(
										S0_TT3.itm_sub3,
										S0_TT2.itm_sub3
									).eq(S0_M8.itm_sub3)
								)
							)
						)
						.leftOuterJoin(S0_M10).on(
							bracket(
								coalesce(
									S0_TT3.itm_cd,
									S0_TT2.itm_cd
								).eq(S0_M10.itm_cd)
								.and(
									coalesce(
										S0_TT3.itm_sub1,
										S0_TT2.itm_sub1
									).eq(S0_M10.itm_sub1)
								)
								.and(
									coalesce(
										S0_TT3.itm_sub2,
										S0_TT2.itm_sub2
									).eq(S0_M10.itm_sub2)
								)
								.and(
									coalesce(
										S0_TT3.itm_sub3,
										S0_TT2.itm_sub3
									).eq(S0_M10.itm_sub3)
								)
								.and(S0_TT1.alloc_sno1.eq(S0_M10.sno1))
								.and(S0_TT1.alloc_sno2.eq(S0_M10.sno2))
								.and(S0_TT1.alloc_sno3.eq(S0_M10.sno3))
								.and(S0_TT1.alloc_sno4.eq(S0_M10.sno4))
							)
						)
						.addDynamicView()
						.addDynamicView(DS0C_PRSPPL_GRP)
						.addDynamicView(DS0C_ITM_GRP)
					)
					.where(
						value(0).eq(value(0))
						.and(S0_T1.prov_src_schd_typ.eq(value(MSC_PROV_SRC_SCHD_TYP.XFR.value())))
						.and(
							S0_T1.trd_ptn_typ.in(
								bind("prov_str"),
								bind("prov_rtn_str")
							)
						)
						.and(
							S0_T1.prov_typ.in(
								bind("ffr_prov_flg_str"),
								bind("onr_prov_flg_str")
							)
						)
						.addDynamicPredicate()
						.cutoff$and(S0_T1.accpt_schd_dt.gte(bind("accpt_schd_dt_fr")))
						.cutoff$and(S0_T1.accpt_schd_dt.lte(bind("accpt_schd_dt_to")))
						.cutoff$and(nullValue().gte(bind("arr_schd_hm_fr")))
						.cutoff$and(nullValue().lte(bind("arr_schd_hm_to")))
						.cutoff$and(S0_T1.trd_cd.like(bind("trd_cd")))
						.cutoff$and(S0_T1.prsppl_cd.like(bind("prsppl_cd")))
						.cutoff$and(
							decode(
								S0_T1.trd_ptn_typ,
								value(MAC_TRD_PTN_TYP.PROV.value()),
								S0_TT1.gr_loc_cd,
								value(MAC_TRD_PTN_TYP.PROV_RTN.value()),
								S0_TT1.gi_loc_cd
							).like(bind("prsppl_loc_cd"))
						)
						.cutoff$and(S0_M3.loc_nm.like(bind("prsppl_loc_nm")))
						.cutoff$and(S0_M3.site_cd.like(bind("prsppl_site_cd")))
						.cutoff$and(S0_T1.wg_cd.like(bind("prsppl_wg_cd")))
						.cutoff$and(S0_M3.lg_grp_cd.like(bind("prsppl_lg_grp_cd")))
						.cutoff$and(
							decode(
								S0_T1.trd_ptn_typ,
								value(MAC_TRD_PTN_TYP.PROV.value()),
								S0_TT1.gr_str_ln_cd,
								value(MAC_TRD_PTN_TYP.PROV_RTN.value()),
								S0_TT1.gi_str_ln_cd
							).like(bind("prsppl_str_ln_cd"))
						)
						.cutoff$and(S0_M7.str_ln_nm.like(bind("prsppl_str_ln_nm")))
						.cutoff$and(S0_M8.itm_typ.like(bind("itm_typ")))
						.cutoff$and(S0_M8.itm_typ_d_cd.like(bind("itm_typ_d_cd")))
						.cutoff$and(
							coalesce(
								S0_TT3.itm_cd,
								S0_TT2.itm_cd
							).like(bind("itm_cd"))
						)
						.cutoff$and(
							coalesce(
								S0_TT3.itm_sub1,
								S0_TT2.itm_sub1
							).like(bind("itm_sub1"))
						)
						.cutoff$and(
							coalesce(
								S0_TT3.itm_sub2,
								S0_TT2.itm_sub2
							).like(bind("itm_sub2"))
						)
						.cutoff$and(
							coalesce(
								S0_TT3.itm_sub3,
								S0_TT2.itm_sub3
							).like(bind("itm_sub3"))
						)
						.cutoff$and(
							coalesce(
								S0_M10.itm_nm,
								S0_M8.itm_nm
							).like(bind("itm_nm"))
						)
						.cutoff$and(S0_TT1.ver_no.like(bind("ver_no")))
						.cutoff$and(S0_TT1.lot_no.like(bind("lot_no")))
						.cutoff$and(S0_TT1.sublot_no.like(bind("sublot_no")))
						.cutoff$and(S0_TT1.sno1.like(bind("sno1")))
						.cutoff$and(S0_TT1.sno2.like(bind("sno2")))
						.cutoff$and(S0_TT1.sno3.like(bind("sno3")))
						.cutoff$and(S0_TT1.sno4.like(bind("sno4")))
						.cutoff$and(S0_TT1.gd_cd.like(bind("gd_cd")))
						.cutoff$and(S0_TT1.stk_id_typ.like(bind("stk_id_typ")))
						.cutoff$and(S0_T1.prov_basis_typ.like(bind("prov_basis_typ")))
						.cutoff$and(S0_TT1.dlv_slip_no.like(bind("dlv_slip_no")))
						.cutoff$and(S0_TT1.dlv_slip_d_no.like(bind("dlv_slip_d_no")))
						.cutoff$and(S0_T1.trd_cur_cd.like(bind("trd_cur_cd")))
						.cutoff$and(bind("base_cur_cd").neq(S0_T1.trd_cur_cd))
						.cutoff$and(S0_T1.tax_cd.like(bind("tax_cd")))
						.cutoff$and(S0_T1.prov_src_schd_typ.like(bind("prov_src_schd_typ")))
						.cutoff$and(S0_T1.prov_src_schd_no1.like(bind("prov_src_schd_no1")))
						.cutoff$and(S0_T1.prov_src_schd_no2.like(bind("prov_src_schd_no2")))
						.cutoff$and(S0_T1.prov_schd_no.like(bind("prov_schd_no")))
						.cutoff$and(S0_T1.intr_rmrks.like(bind("intr_rmrks")))
						.cutoff$and(S0_T1.sub_char1.like(bind("sub_char1")))
						.cutoff$and(S0_T1.sub_char2.like(bind("sub_char2")))
						.cutoff$and(S0_T1.sub_char3.like(bind("sub_char3")))
						.addDynamicPredicate(DS0C_PRSPPL_GRP)
						.addDynamicPredicate(DS0C_ITM_GRP)
					)
					.orderBy(
						S0_T1.prov_src_schd_typ.asc(),
						S0_T1.prov_schd_no.asc()
					)
			)
			.setDynamicSQLInfo(
				when(boundOr("wrk_no", "wrk_nm"))
					.view(v -> v.leftOuterJoin(S0_T3).on(bracket(S0_TT1.alloc_sno1.eq(S0_T3.sno1))))
					.predicate(p -> p.cutoff$and(S0_T3.wrk_no.like(bind("wrk_no"))).cutoff$and(S0_T3.wrk_nm.like(bind("wrk_nm")))),
				when(boundOr("trd_nm"))
					.view(v -> v.leftOuterJoin(S0_M1).on(bracket(S0_T1.trd_cd.eq(S0_M1.trd_cd))))
					.predicate(p -> p.cutoff$and(S0_M1.trd_nm.like(bind("trd_nm")))),
				when(boundOr("prsppl_grp_flg1", "prsppl_grp_flg2", "prsppl_grp_flg3", "prsppl_grp_flg4", "prsppl_grp_flg5", "prsppl_grp_flg6", "prsppl_grp_flg7", "prsppl_grp_flg8", "prsppl_grp_flg9", "prsppl_grp_flg10", "subcon_flg_str", "prsppl_nm"))
					.view(v -> v.leftOuterJoin(S0_M2).on(bracket(S0_T1.prsppl_cd.eq(S0_M2.bp_cd))))
					.predicate(p -> p.cutoff$and(S0_M2.subcon_flg.eq(bind("subcon_flg_str"))).cutoff$and(S0_M2.bp_nm.like(bind("prsppl_nm")))),
				when(boundOr("prsppl_site_nm"))
					.view(v -> v.leftOuterJoin(S0_M4).on(bracket(S0_M3.site_cd.eq(S0_M4.site_cd))))
					.predicate(p -> p.cutoff$and(S0_M4.site_nm.like(bind("prsppl_site_nm")))),
				when(boundOr("prsppl_wg_nm"))
					.view(v -> v.leftOuterJoin(S0_M5).on(bracket(S0_T1.wg_cd.eq(S0_M5.wg_cd))))
					.predicate(p -> p.cutoff$and(S0_M5.wg_nm.like(bind("prsppl_wg_nm")))),
				when(boundOr("prsppl_lg_grp_nm"))
					.view(v -> v.leftOuterJoin(S0_M6).on(bracket(S0_M3.lg_grp_cd.eq(S0_M6.lg_grp_cd))))
					.predicate(p -> p.cutoff$and(S0_M6.lg_grp_nm.like(bind("prsppl_lg_grp_nm")))),
				when(boundOr("itm_typ_d_nm"))
					.view(v -> v.leftOuterJoin(S0_M9).on(bracket(S0_M8.itm_typ.eq(S0_M9.itm_typ).and(S0_M8.itm_typ_d_cd.eq(S0_M9.itm_typ_d_cd)))))
					.predicate(p -> p.cutoff$and(S0_M9.itm_typ_d_nm.like(bind("itm_typ_d_nm")))),
				when(boundOr("gd_nm"))
					.view(v -> v.leftOuterJoin(S0_M11).on(bracket(S0_TT1.gd_cd.eq(S0_M11.gd_cd))))
					.predicate(p -> p.cutoff$and(S0_M11.gd_nm.like(bind("gd_nm")))),
				when(boundOr("trd_cur_nm"))
					.view(v -> v.leftOuterJoin(S0_M12).on(bracket(S0_T1.trd_cur_cd.eq(S0_M12.cur_cd))))
					.predicate(p -> p.cutoff$and(S0_M12.cur_nm.like(bind("trd_cur_nm")))),
				when(boundOr("tax_nm"))
					.view(v -> v.leftOuterJoin(S0_M13).on(bracket(S0_T1.tax_cd.eq(S0_M13.tax_cd))))
					.predicate(p -> p.cutoff$and(S0_M13.tax_nm.like(bind("tax_nm")))),
				when(boundOr("prsppl_grp_flg1"))
					.select(DS0C_PRSPPL_GRP, S0_M2.bp_grp_cd1.as("prsppl_grp_cd1"), S0_MM11.bp_grp_nm.as("prsppl_grp_nm1"))
					.view(DS0C_PRSPPL_GRP, v -> v.leftOuterJoin(S0_MM11).on(S0_M2.bp_grp_cd1.eq(S0_MM11.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP1.value()).eq(S0_MM11.bp_grp_typ))))
					.predicate(DS0C_PRSPPL_GRP, p -> p.cutoff$and(S0_M2.bp_grp_cd1.like(bind("prsppl_grp_cd1"))).cutoff$and(S0_MM11.bp_grp_nm.like(bind("prsppl_grp_nm1")))),
				when(boundOr("prsppl_grp_flg2"))
					.select(DS0C_PRSPPL_GRP, S0_M2.bp_grp_cd2.as("prsppl_grp_cd2"), S0_MM12.bp_grp_nm.as("prsppl_grp_nm2"))
					.view(DS0C_PRSPPL_GRP, v -> v.leftOuterJoin(S0_MM12).on(S0_M2.bp_grp_cd2.eq(S0_MM12.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP2.value()).eq(S0_MM12.bp_grp_typ))))
					.predicate(DS0C_PRSPPL_GRP, p -> p.cutoff$and(S0_M2.bp_grp_cd2.like(bind("prsppl_grp_cd2"))).cutoff$and(S0_MM12.bp_grp_nm.like(bind("prsppl_grp_nm2")))),
				when(boundOr("prsppl_grp_flg3"))
					.select(DS0C_PRSPPL_GRP, S0_M2.bp_grp_cd3.as("prsppl_grp_cd3"), S0_MM13.bp_grp_nm.as("prsppl_grp_nm3"))
					.view(DS0C_PRSPPL_GRP, v -> v.leftOuterJoin(S0_MM13).on(S0_M2.bp_grp_cd3.eq(S0_MM13.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP3.value()).eq(S0_MM13.bp_grp_typ))))
					.predicate(DS0C_PRSPPL_GRP, p -> p.cutoff$and(S0_M2.bp_grp_cd3.like(bind("prsppl_grp_cd3"))).cutoff$and(S0_MM13.bp_grp_nm.like(bind("prsppl_grp_nm3")))),
				when(boundOr("prsppl_grp_flg4"))
					.select(DS0C_PRSPPL_GRP, S0_M2.bp_grp_cd4.as("prsppl_grp_cd4"), S0_MM14.bp_grp_nm.as("prsppl_grp_nm4"))
					.view(DS0C_PRSPPL_GRP, v -> v.leftOuterJoin(S0_MM14).on(S0_M2.bp_grp_cd4.eq(S0_MM14.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP4.value()).eq(S0_MM14.bp_grp_typ))))
					.predicate(DS0C_PRSPPL_GRP, p -> p.cutoff$and(S0_M2.bp_grp_cd4.like(bind("prsppl_grp_cd4"))).cutoff$and(S0_MM14.bp_grp_nm.like(bind("prsppl_grp_nm4")))),
				when(boundOr("prsppl_grp_flg5"))
					.select(DS0C_PRSPPL_GRP, S0_M2.bp_grp_cd5.as("prsppl_grp_cd5"), S0_MM15.bp_grp_nm.as("prsppl_grp_nm5"))
					.view(DS0C_PRSPPL_GRP, v -> v.leftOuterJoin(S0_MM15).on(S0_M2.bp_grp_cd5.eq(S0_MM15.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP5.value()).eq(S0_MM15.bp_grp_typ))))
					.predicate(DS0C_PRSPPL_GRP, p -> p.cutoff$and(S0_M2.bp_grp_cd5.like(bind("prsppl_grp_cd5"))).cutoff$and(S0_MM15.bp_grp_nm.like(bind("prsppl_grp_nm5")))),
				when(boundOr("prsppl_grp_flg6"))
					.select(DS0C_PRSPPL_GRP, S0_M2.bp_grp_cd6.as("prsppl_grp_cd6"), S0_MM16.bp_grp_nm.as("prsppl_grp_nm6"))
					.view(DS0C_PRSPPL_GRP, v -> v.leftOuterJoin(S0_MM16).on(S0_M2.bp_grp_cd6.eq(S0_MM16.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP6.value()).eq(S0_MM16.bp_grp_typ))))
					.predicate(DS0C_PRSPPL_GRP, p -> p.cutoff$and(S0_M2.bp_grp_cd6.like(bind("prsppl_grp_cd6"))).cutoff$and(S0_MM16.bp_grp_nm.like(bind("prsppl_grp_nm6")))),
				when(boundOr("prsppl_grp_flg7"))
					.select(DS0C_PRSPPL_GRP, S0_M2.bp_grp_cd7.as("prsppl_grp_cd7"), S0_MM17.bp_grp_nm.as("prsppl_grp_nm7"))
					.view(DS0C_PRSPPL_GRP, v -> v.leftOuterJoin(S0_MM17).on(S0_M2.bp_grp_cd7.eq(S0_MM17.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP7.value()).eq(S0_MM17.bp_grp_typ))))
					.predicate(DS0C_PRSPPL_GRP, p -> p.cutoff$and(S0_M2.bp_grp_cd7.like(bind("prsppl_grp_cd7"))).cutoff$and(S0_MM17.bp_grp_nm.like(bind("prsppl_grp_nm7")))),
				when(boundOr("prsppl_grp_flg8"))
					.select(DS0C_PRSPPL_GRP, S0_M2.bp_grp_cd8.as("prsppl_grp_cd8"), S0_MM18.bp_grp_nm.as("prsppl_grp_nm8"))
					.view(DS0C_PRSPPL_GRP, v -> v.leftOuterJoin(S0_MM18).on(S0_M2.bp_grp_cd8.eq(S0_MM18.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP8.value()).eq(S0_MM18.bp_grp_typ))))
					.predicate(DS0C_PRSPPL_GRP, p -> p.cutoff$and(S0_M2.bp_grp_cd8.like(bind("prsppl_grp_cd8"))).cutoff$and(S0_MM18.bp_grp_nm.like(bind("prsppl_grp_nm8")))),
				when(boundOr("prsppl_grp_flg9"))
					.select(DS0C_PRSPPL_GRP, S0_M2.bp_grp_cd9.as("prsppl_grp_cd9"), S0_MM19.bp_grp_nm.as("prsppl_grp_nm9"))
					.view(DS0C_PRSPPL_GRP, v -> v.leftOuterJoin(S0_MM19).on(S0_M2.bp_grp_cd9.eq(S0_MM19.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP9.value()).eq(S0_MM19.bp_grp_typ))))
					.predicate(DS0C_PRSPPL_GRP, p -> p.cutoff$and(S0_M2.bp_grp_cd9.like(bind("prsppl_grp_cd9"))).cutoff$and(S0_MM19.bp_grp_nm.like(bind("prsppl_grp_nm9")))),
				when(boundOr("prsppl_grp_flg10"))
					.select(DS0C_PRSPPL_GRP, S0_M2.bp_grp_cd10.as("prsppl_grp_cd10"), S0_MM110.bp_grp_nm.as("prsppl_grp_nm10"))
					.view(DS0C_PRSPPL_GRP, v -> v.leftOuterJoin(S0_MM110).on(S0_M2.bp_grp_cd10.eq(S0_MM110.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP10.value()).eq(S0_MM110.bp_grp_typ))))
					.predicate(DS0C_PRSPPL_GRP, p -> p.cutoff$and(S0_M2.bp_grp_cd10.like(bind("prsppl_grp_cd10"))).cutoff$and(S0_MM110.bp_grp_nm.like(bind("prsppl_grp_nm10")))),
				when(boundOr("itm_grp_flg1"))
					.select(DS0C_ITM_GRP, S0_M8.itm_grp_cd1.as("itm_grp_cd1"), S0_MM21.itm_grp_nm.as("itm_grp_nm1"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM21).on(S0_M8.itm_grp_cd1.eq(S0_MM21.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP1.value()).eq(S0_MM21.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M8.itm_grp_cd1.like(bind("itm_grp_cd1"))).cutoff$and(S0_MM21.itm_grp_nm.like(bind("itm_grp_nm1")))),
				when(boundOr("itm_grp_flg2"))
					.select(DS0C_ITM_GRP, S0_M8.itm_grp_cd2.as("itm_grp_cd2"), S0_MM22.itm_grp_nm.as("itm_grp_nm2"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM22).on(S0_M8.itm_grp_cd2.eq(S0_MM22.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP2.value()).eq(S0_MM22.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M8.itm_grp_cd2.like(bind("itm_grp_cd2"))).cutoff$and(S0_MM22.itm_grp_nm.like(bind("itm_grp_nm2")))),
				when(boundOr("itm_grp_flg3"))
					.select(DS0C_ITM_GRP, S0_M8.itm_grp_cd3.as("itm_grp_cd3"), S0_MM23.itm_grp_nm.as("itm_grp_nm3"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM23).on(S0_M8.itm_grp_cd3.eq(S0_MM23.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP3.value()).eq(S0_MM23.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M8.itm_grp_cd3.like(bind("itm_grp_cd3"))).cutoff$and(S0_MM23.itm_grp_nm.like(bind("itm_grp_nm3")))),
				when(boundOr("itm_grp_flg4"))
					.select(DS0C_ITM_GRP, S0_M8.itm_grp_cd4.as("itm_grp_cd4"), S0_MM24.itm_grp_nm.as("itm_grp_nm4"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM24).on(S0_M8.itm_grp_cd4.eq(S0_MM24.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP4.value()).eq(S0_MM24.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M8.itm_grp_cd4.like(bind("itm_grp_cd4"))).cutoff$and(S0_MM24.itm_grp_nm.like(bind("itm_grp_nm4")))),
				when(boundOr("itm_grp_flg5"))
					.select(DS0C_ITM_GRP, S0_M8.itm_grp_cd5.as("itm_grp_cd5"), S0_MM25.itm_grp_nm.as("itm_grp_nm5"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM25).on(S0_M8.itm_grp_cd5.eq(S0_MM25.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP5.value()).eq(S0_MM25.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M8.itm_grp_cd5.like(bind("itm_grp_cd5"))).cutoff$and(S0_MM25.itm_grp_nm.like(bind("itm_grp_nm5")))),
				when(boundOr("itm_grp_flg6"))
					.select(DS0C_ITM_GRP, S0_M8.itm_grp_cd6.as("itm_grp_cd6"), S0_MM26.itm_grp_nm.as("itm_grp_nm6"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM26).on(S0_M8.itm_grp_cd6.eq(S0_MM26.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP6.value()).eq(S0_MM26.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M8.itm_grp_cd6.like(bind("itm_grp_cd6"))).cutoff$and(S0_MM26.itm_grp_nm.like(bind("itm_grp_nm6")))),
				when(boundOr("itm_grp_flg7"))
					.select(DS0C_ITM_GRP, S0_M8.itm_grp_cd7.as("itm_grp_cd7"), S0_MM27.itm_grp_nm.as("itm_grp_nm7"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM27).on(S0_M8.itm_grp_cd7.eq(S0_MM27.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP7.value()).eq(S0_MM27.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M8.itm_grp_cd7.like(bind("itm_grp_cd7"))).cutoff$and(S0_MM27.itm_grp_nm.like(bind("itm_grp_nm7")))),
				when(boundOr("itm_grp_flg8"))
					.select(DS0C_ITM_GRP, S0_M8.itm_grp_cd8.as("itm_grp_cd8"), S0_MM28.itm_grp_nm.as("itm_grp_nm8"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM28).on(S0_M8.itm_grp_cd8.eq(S0_MM28.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP8.value()).eq(S0_MM28.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M8.itm_grp_cd8.like(bind("itm_grp_cd8"))).cutoff$and(S0_MM28.itm_grp_nm.like(bind("itm_grp_nm8")))),
				when(boundOr("itm_grp_flg9"))
					.select(DS0C_ITM_GRP, S0_M8.itm_grp_cd9.as("itm_grp_cd9"), S0_MM29.itm_grp_nm.as("itm_grp_nm9"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM29).on(S0_M8.itm_grp_cd9.eq(S0_MM29.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP9.value()).eq(S0_MM29.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M8.itm_grp_cd9.like(bind("itm_grp_cd9"))).cutoff$and(S0_MM29.itm_grp_nm.like(bind("itm_grp_nm9")))),
				when(boundOr("itm_grp_flg10"))
					.select(DS0C_ITM_GRP, S0_M8.itm_grp_cd10.as("itm_grp_cd10"), S0_MM210.itm_grp_nm.as("itm_grp_nm10"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM210).on(S0_M8.itm_grp_cd10.eq(S0_MM210.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP10.value()).eq(S0_MM210.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M8.itm_grp_cd10.like(bind("itm_grp_cd10"))).cutoff$and(S0_MM210.itm_grp_nm.like(bind("itm_grp_nm10"))))
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
							r.getStringNE("prsppl_cd")
						))
						.addSelect(m -> toArray(
							m.bp_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("prsppl_nm", m.bp_nm());
					}),
					j -> j
						.add(MAM_WG_R.class, r -> toCondition(
							r.getStringNE("prsppl_wg_cd")
						))
						.addSelect(m -> toArray(
							m.wg_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("prsppl_wg_nm", m.wg_nm());
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
						.add(MAM_CUR_R.class, r -> toCondition(
							r.getStringNE("trd_cur_cd")
						))
						.addSelect(m -> toArray(
							m.cur_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("trd_cur_nm", m.cur_nm());
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
							r.setStringNE("tax_typ", m.tax_typ());
							r.setBooleanNE("inc_tax_flg", m.inc_tax_flg());
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
							r.getStringNE("xfr_rsn_cd")
						))
						.addSelect(m -> toArray(
							m.acxfr_gi_flg,
							m.biz_rsn_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("xfr_rsn_nm", m.biz_rsn_nm());
							r.setBooleanNE("acxfr_gi_flg", m.acxfr_gi_flg());
					})
				)
			);
	}
	
	/**
	 * -- MSBEL1160_MST_PROV_SCHD_Query_S02
	 */
	static MCQueryPlan MSBEL1160_MST_PROV_SCHD_S02() {
		MST_PROV_SCHD_R S0_T1 = MST_PROV_SCHD_R.create("T1");
		MCTempView S0_T0 = createTempView("T0");
		MST_SHIP_SCHD_R S0_TT1 = MST_SHIP_SCHD_R.create("TT1");
		MST_SHIP_PR_R S0_TT2 = MST_SHIP_PR_R.create("TT2");
		MST_XFR_SCHD_R S0_TT3 = MST_XFR_SCHD_R.create("TT3");
		MST_MFG_INST_R S0_TT4 = MST_MFG_INST_R.create("TT4");
		MSVT_WRK_SNO_R S0_T3 = MSVT_WRK_SNO_R.create("T3");
		MAM_TRD_R S0_M1 = MAM_TRD_R.create("M1");
		MAM_BP_R S0_M2 = MAM_BP_R.create("M2");
		MAVM_RD_LOC_R S0_M3 = MAVM_RD_LOC_R.create("M3");
		MAM_SITE_R S0_M4 = MAM_SITE_R.create("M4");
		MAM_WG_R S0_M5 = MAM_WG_R.create("M5");
		MAM_LG_GRP_R S0_M6 = MAM_LG_GRP_R.create("M6");
		MAM_STR_LN_R S0_M7 = MAM_STR_LN_R.create("M7");
		MAM_ITM_R S0_M8 = MAM_ITM_R.create("M8");
		MAM_ITM_TYP_D_R S0_M9 = MAM_ITM_TYP_D_R.create("M9");
		MAM_SUNDRY_ITM_R S0_M10 = MAM_SUNDRY_ITM_R.create("M10");
		MAM_STK_GD_R S0_M11 = MAM_STK_GD_R.create("M11");
		MAM_CUR_R S0_M12 = MAM_CUR_R.create("M12");
		MAM_TAX_R S0_M13 = MAM_TAX_R.create("M13");
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
		MST_PROV_ACT_R S1_T = MST_PROV_ACT_R.create("T");
		
		MCDynamicSQLID DS0C_ITM_GRP = createDynamicSQLID("DS0C_ITM_GRP");
		MCDynamicSQLID DS0C_PRSPPL_GRP = createDynamicSQLID("DS0C_PRSPPL_GRP");
		
		return createQueryPlan()
			.setQuery(
				sql("MSBEL1160_MST_PROV_SCHD_Query_S02")
					.mainQuery()
					.select(
						S0_T1.prov_schd_no,
						S0_T1.prov_src_schd_typ,
						S0_T1.prov_src_schd_no1,
						S0_T1.prov_src_schd_no2,
						S0_T1.trd_cd,
						S0_T1.trd_ptn_typ,
						S0_T1.xfr_rsn_cd,
						S0_T1.base_unit_cd,
						S0_T1.base_unit_qty.as("schd_qty"),
						S0_T0.pr("base_unit_qty").as("act_qty"),
						S0_T1.accpt_schd_dt,
						trunc(
							decode(
								S0_T1.trd_ptn_typ,
								value(MAC_TRD_PTN_TYP.PROV.value()),
								S0_TT1.dlv_schd_tm,
								value(MAC_TRD_PTN_TYP.PROV_RTN.value()),
								nullValue()
							),
							MCDateFmt.DD
						).as("arr_schd_dt"),
						decode(
							S0_T1.trd_ptn_typ,
							value(MAC_TRD_PTN_TYP.PROV.value()),
							S0_TT1.dlv_schd_tm,
							value(MAC_TRD_PTN_TYP.PROV_RTN.value()),
							nullValue()
						).as("arr_schd_hm"),
						S0_T1.wg_cd.as("prsppl_wg_cd"),
						S0_T1.prsppl_cd,
						S0_T1.prov_typ,
						S0_T1.prov_basis_typ,
						S0_T1.xrate_inpt_flg,
						S0_T1.xrate,
						S0_T1.ptax_xrate_inpt_flg,
						S0_T1.ptax_xrate,
						S0_T1.trd_cur_cd,
						S0_T1.tax_fix_flg,
						S0_T1.tax_cd,
						S0_T1.trd_cur_upri,
						S0_T1.trd_cur_amt,
						S0_T1.trd_cur_tax_amt,
						S0_T1.trd_cur_amt.add(S0_T1.trd_cur_tax_amt).as("trd_cur_inc_tax_amt"),
						S0_T1.wtax_rate,
						S0_T1.wtax_amt,
						S0_T1.intr_rmrks,
						S0_T1.sub_char1,
						S0_T1.sub_char2,
						S0_T1.sub_char3,
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
						S0_TT1.itm_cd,
						S0_TT1.itm_sub1,
						S0_TT1.itm_sub2,
						S0_TT1.itm_sub3,
						coalesce(
							S0_M10.itm_nm,
							S0_M8.itm_nm
						).as("itm_nm"),
						S0_M8.itm_typ,
						S0_M8.itm_typ_d_cd,
						S0_M8.sundry_itm_flg,
						S0_M8.asset_mng_typ,
						decode(
							S0_T1.trd_ptn_typ,
							value(MAC_TRD_PTN_TYP.PROV.value()),
							S0_TT2.dlv_id_cd,
							value(MAC_TRD_PTN_TYP.PROV_RTN.value()),
							S0_TT2.loc_cd
						).as("prsppl_loc_cd"),
						S0_M3.loc_nm.as("prsppl_loc_nm"),
						decode(
							S0_T1.trd_ptn_typ,
							value(MAC_TRD_PTN_TYP.PROV.value()),
							S0_TT2.dlv_str_ln_cd,
							value(MAC_TRD_PTN_TYP.PROV_RTN.value()),
							S0_TT2.str_ln_cd
						).as("str_ln_cd"),
						S0_M7.str_ln_nm,
						S0_TT1.lot_no,
						S0_TT1.sublot_no,
						S0_TT1.ver_no,
						S0_TT1.sno1,
						S0_TT1.sno2,
						S0_TT1.sno3,
						S0_TT1.sno4,
						S0_TT1.gd_cd,
						S0_TT1.stk_id_typ,
						nullValue().as("dlv_slip_no"),
						nullValue().as("dlv_slip_d_no"),
						S0_TT1.ship_fr_lg_grp_cd.as("lg_grp_cd"),
						addDynamicSelect(DS0C_PRSPPL_GRP),
						addDynamicSelect(DS0C_ITM_GRP)
					)
					.from(
						S0_T1
						.leftOuterJoin(
							subQuery()
							.select(
								S1_T.prov_schd_no,
								sum(S1_T.base_unit_qty).as("base_unit_qty")
							)
							.from(S1_T)
							.groupBy(S1_T.prov_schd_no).view(S0_T0)
						).on(
							bracket(
								S0_T1.prov_schd_no.eq(S0_T0.pr(S1_T.prov_schd_no))
							)
						)
						.innerJoin(S0_TT1).on(
							bracket(
								S0_T1.prov_src_schd_no1.eq(S0_TT1.ship_schd_no)
							)
						)
						.innerJoin(S0_TT2).on(
							bracket(
								S0_TT1.ship_pr_no.eq(S0_TT2.ship_pr_no)
							)
						)
						.leftOuterJoin(S0_TT3).on(
							bracket(
								S0_TT2.xfr_schd_no.eq(S0_TT3.xfr_schd_no)
							)
						)
						.leftOuterJoin(S0_TT4).on(
							bracket(
								S0_TT3.mfg_inst_no.eq(S0_TT4.mfg_inst_no)
							)
						)
						.innerJoin(S0_M3).on(
							bracket(
								decode(
									S0_T1.trd_ptn_typ,
									value(MAC_TRD_PTN_TYP.PROV.value()),
									S0_TT2.dlv_id_cd,
									value(MAC_TRD_PTN_TYP.PROV_RTN.value()),
									S0_TT2.loc_cd
								).eq(S0_M3.loc_cd)
							)
						)
						.leftOuterJoin(S0_M7).on(
							bracket(
								decode(
									S0_T1.trd_ptn_typ,
									value(MAC_TRD_PTN_TYP.PROV.value()),
									S0_TT2.dlv_id_cd,
									value(MAC_TRD_PTN_TYP.PROV_RTN.value()),
									S0_TT2.loc_cd
								).eq(S0_M7.loc_cd)
								.and(
									decode(
										S0_T1.trd_ptn_typ,
										value(MAC_TRD_PTN_TYP.PROV.value()),
										S0_TT2.dlv_str_ln_cd,
										value(MAC_TRD_PTN_TYP.PROV_RTN.value()),
										S0_TT2.str_ln_cd
									).eq(S0_M7.str_ln_cd)
								)
							)
						)
						.leftOuterJoin(S0_M8).on(
							bracket(
								S0_TT1.itm_cd.eq(S0_M8.itm_cd)
								.and(S0_TT1.itm_sub1.eq(S0_M8.itm_sub1))
								.and(S0_TT1.itm_sub2.eq(S0_M8.itm_sub2))
								.and(S0_TT1.itm_sub3.eq(S0_M8.itm_sub3))
							)
						)
						.leftOuterJoin(S0_M10).on(
							bracket(
								S0_TT1.itm_cd.eq(S0_M10.itm_cd)
								.and(S0_TT1.itm_sub1.eq(S0_M10.itm_sub1))
								.and(S0_TT1.itm_sub2.eq(S0_M10.itm_sub2))
								.and(S0_TT1.itm_sub3.eq(S0_M10.itm_sub3))
								.and(S0_TT1.sno1.eq(S0_M10.sno1))
								.and(S0_TT1.sno2.eq(S0_M10.sno2))
								.and(S0_TT1.sno3.eq(S0_M10.sno3))
								.and(S0_TT1.sno4.eq(S0_M10.sno4))
							)
						)
						.addDynamicView()
						.addDynamicView(DS0C_PRSPPL_GRP)
						.addDynamicView(DS0C_ITM_GRP)
					)
					.where(
						value(0).eq(value(0))
						.and(S0_T1.prov_src_schd_typ.eq(value(MSC_PROV_SRC_SCHD_TYP.SHIP.value())))
						.and(
							S0_T1.trd_ptn_typ.in(
								bind("prov_str"),
								bind("prov_rtn_str")
							)
						)
						.and(
							S0_T1.prov_typ.in(
								bind("ffr_prov_flg_str"),
								bind("onr_prov_flg_str")
							)
						)
						.addDynamicPredicate()
						.cutoff$and(S0_T1.accpt_schd_dt.gte(bind("accpt_schd_dt_fr")))
						.cutoff$and(S0_T1.accpt_schd_dt.lte(bind("accpt_schd_dt_to")))
						.cutoff$and(
							decode(
								S0_T1.trd_ptn_typ,
								value(MAC_TRD_PTN_TYP.PROV.value()),
								S0_TT1.dlv_schd_tm,
								value(MAC_TRD_PTN_TYP.PROV_RTN.value()),
								nullValue()
							).gte(bind("arr_schd_hm_fr"))
						)
						.cutoff$and(
							decode(
								S0_T1.trd_ptn_typ,
								value(MAC_TRD_PTN_TYP.PROV.value()),
								S0_TT1.dlv_schd_tm,
								value(MAC_TRD_PTN_TYP.PROV_RTN.value()),
								nullValue()
							).lte(bind("arr_schd_hm_to"))
						)
						.cutoff$and(S0_T1.trd_cd.like(bind("trd_cd")))
						.cutoff$and(S0_T1.prsppl_cd.like(bind("prsppl_cd")))
						.cutoff$and(
							decode(
								S0_T1.trd_ptn_typ,
								value(MAC_TRD_PTN_TYP.PROV.value()),
								S0_TT2.dlv_id_cd,
								value(MAC_TRD_PTN_TYP.PROV_RTN.value()),
								S0_TT2.loc_cd
							).like(bind("prsppl_loc_cd"))
						)
						.cutoff$and(S0_M3.loc_nm.like(bind("prsppl_loc_nm")))
						.cutoff$and(S0_M3.site_cd.like(bind("prsppl_site_cd")))
						.cutoff$and(S0_T1.wg_cd.like(bind("prsppl_wg_cd")))
						.cutoff$and(S0_M3.lg_grp_cd.like(bind("prsppl_lg_grp_cd")))
						.cutoff$and(
							decode(
								S0_T1.trd_ptn_typ,
								value(MAC_TRD_PTN_TYP.PROV.value()),
								S0_TT2.dlv_str_ln_cd,
								value(MAC_TRD_PTN_TYP.PROV_RTN.value()),
								S0_TT2.str_ln_cd
							).like(bind("prsppl_str_ln_cd"))
						)
						.cutoff$and(S0_M7.str_ln_nm.like(bind("prsppl_str_ln_nm")))
						.cutoff$and(S0_M8.itm_typ.like(bind("itm_typ")))
						.cutoff$and(S0_M8.itm_typ_d_cd.like(bind("itm_typ_d_cd")))
						.cutoff$and(S0_TT1.itm_cd.like(bind("itm_cd")))
						.cutoff$and(S0_TT1.itm_sub1.like(bind("itm_sub1")))
						.cutoff$and(S0_TT1.itm_sub2.like(bind("itm_sub2")))
						.cutoff$and(S0_TT1.itm_sub3.like(bind("itm_sub3")))
						.cutoff$and(
							coalesce(
								S0_M10.itm_nm,
								S0_M8.itm_nm
							).like(bind("itm_nm"))
						)
						.cutoff$and(S0_TT1.ver_no.like(bind("ver_no")))
						.cutoff$and(S0_TT1.lot_no.like(bind("lot_no")))
						.cutoff$and(S0_TT1.sublot_no.like(bind("sublot_no")))
						.cutoff$and(S0_TT1.sno1.like(bind("sno1")))
						.cutoff$and(S0_TT1.sno2.like(bind("sno2")))
						.cutoff$and(S0_TT1.sno3.like(bind("sno3")))
						.cutoff$and(S0_TT1.sno4.like(bind("sno4")))
						.cutoff$and(S0_TT1.gd_cd.like(bind("gd_cd")))
						.cutoff$and(S0_TT1.stk_id_typ.like(bind("stk_id_typ")))
						.cutoff$and(S0_T1.prov_basis_typ.like(bind("prov_basis_typ")))
						.cutoff$and(nullValue().like(bind("dlv_slip_no")))
						.cutoff$and(nullValue().like(bind("dlv_slip_d_no")))
						.cutoff$and(S0_T1.trd_cur_cd.like(bind("trd_cur_cd")))
						.cutoff$and(bind("base_cur_cd").neq(S0_T1.trd_cur_cd))
						.cutoff$and(S0_T1.tax_cd.like(bind("tax_cd")))
						.cutoff$and(S0_T1.prov_src_schd_typ.like(bind("prov_src_schd_typ")))
						.cutoff$and(S0_T1.prov_src_schd_no1.like(bind("prov_src_schd_no1")))
						.cutoff$and(S0_T1.prov_src_schd_no2.like(bind("prov_src_schd_no2")))
						.cutoff$and(S0_T1.prov_schd_no.like(bind("prov_schd_no")))
						.cutoff$and(S0_T1.intr_rmrks.like(bind("intr_rmrks")))
						.cutoff$and(S0_T1.sub_char1.like(bind("sub_char1")))
						.cutoff$and(S0_T1.sub_char2.like(bind("sub_char2")))
						.cutoff$and(S0_T1.sub_char3.like(bind("sub_char3")))
						.addDynamicPredicate(DS0C_PRSPPL_GRP)
						.addDynamicPredicate(DS0C_ITM_GRP)
					)
					.orderBy(
						S0_T1.prov_src_schd_typ.asc(),
						S0_T1.prov_schd_no.asc()
					)
			)
			.setDynamicSQLInfo(
				when(boundOr("wrk_no", "wrk_nm"))
					.view(v -> v.leftOuterJoin(S0_T3).on(bracket(S0_TT1.sno1.eq(S0_T3.sno1))))
					.predicate(p -> p.cutoff$and(S0_T3.wrk_no.like(bind("wrk_no"))).cutoff$and(S0_T3.wrk_nm.like(bind("wrk_nm")))),
				when(boundOr("trd_nm"))
					.view(v -> v.leftOuterJoin(S0_M1).on(bracket(S0_T1.trd_cd.eq(S0_M1.trd_cd))))
					.predicate(p -> p.cutoff$and(S0_M1.trd_nm.like(bind("trd_nm")))),
				when(boundOr("prsppl_grp_flg1", "prsppl_grp_flg2", "prsppl_grp_flg3", "prsppl_grp_flg4", "prsppl_grp_flg5", "prsppl_grp_flg6", "prsppl_grp_flg7", "prsppl_grp_flg8", "prsppl_grp_flg9", "prsppl_grp_flg10", "subcon_flg_str", "prsppl_nm"))
					.view(v -> v.leftOuterJoin(S0_M2).on(bracket(S0_T1.prsppl_cd.eq(S0_M2.bp_cd))))
					.predicate(p -> p.cutoff$and(S0_M2.subcon_flg.eq(bind("subcon_flg_str"))).cutoff$and(S0_M2.bp_nm.like(bind("prsppl_nm")))),
				when(boundOr("prsppl_site_nm"))
					.view(v -> v.leftOuterJoin(S0_M4).on(bracket(S0_M3.site_cd.eq(S0_M4.site_cd))))
					.predicate(p -> p.cutoff$and(S0_M4.site_nm.like(bind("prsppl_site_nm")))),
				when(boundOr("prsppl_wg_nm"))
					.view(v -> v.leftOuterJoin(S0_M5).on(bracket(S0_T1.wg_cd.eq(S0_M5.wg_cd))))
					.predicate(p -> p.cutoff$and(S0_M5.wg_nm.like(bind("prsppl_wg_nm")))),
				when(boundOr("prsppl_lg_grp_nm"))
					.view(v -> v.leftOuterJoin(S0_M6).on(bracket(S0_M3.lg_grp_cd.eq(S0_M6.lg_grp_cd))))
					.predicate(p -> p.cutoff$and(S0_M6.lg_grp_nm.like(bind("prsppl_lg_grp_nm")))),
				when(boundOr("itm_typ_d_nm"))
					.view(v -> v.leftOuterJoin(S0_M9).on(bracket(S0_M8.itm_typ.eq(S0_M9.itm_typ).and(S0_M8.itm_typ_d_cd.eq(S0_M9.itm_typ_d_cd)))))
					.predicate(p -> p.cutoff$and(S0_M9.itm_typ_d_nm.like(bind("itm_typ_d_nm")))),
				when(boundOr("gd_nm"))
					.view(v -> v.leftOuterJoin(S0_M11).on(bracket(S0_TT1.gd_cd.eq(S0_M11.gd_cd))))
					.predicate(p -> p.cutoff$and(S0_M11.gd_nm.like(bind("gd_nm")))),
				when(boundOr("trd_cur_nm"))
					.view(v -> v.leftOuterJoin(S0_M12).on(bracket(S0_T1.trd_cur_cd.eq(S0_M12.cur_cd))))
					.predicate(p -> p.cutoff$and(S0_M12.cur_nm.like(bind("trd_cur_nm")))),
				when(boundOr("tax_nm"))
					.view(v -> v.leftOuterJoin(S0_M13).on(bracket(S0_T1.tax_cd.eq(S0_M13.tax_cd))))
					.predicate(p -> p.cutoff$and(S0_M13.tax_nm.like(bind("tax_nm")))),
				when(boundOr("prsppl_grp_flg1"))
					.select(DS0C_PRSPPL_GRP, S0_M2.bp_grp_cd1.as("prsppl_grp_cd1"), S0_MM11.bp_grp_nm.as("prsppl_grp_nm1"))
					.view(DS0C_PRSPPL_GRP, v -> v.leftOuterJoin(S0_MM11).on(S0_M2.bp_grp_cd1.eq(S0_MM11.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP1.value()).eq(S0_MM11.bp_grp_typ))))
					.predicate(DS0C_PRSPPL_GRP, p -> p.cutoff$and(S0_M2.bp_grp_cd1.like(bind("prsppl_grp_cd1"))).cutoff$and(S0_MM11.bp_grp_nm.like(bind("prsppl_grp_nm1")))),
				when(boundOr("prsppl_grp_flg2"))
					.select(DS0C_PRSPPL_GRP, S0_M2.bp_grp_cd2.as("prsppl_grp_cd2"), S0_MM12.bp_grp_nm.as("prsppl_grp_nm2"))
					.view(DS0C_PRSPPL_GRP, v -> v.leftOuterJoin(S0_MM12).on(S0_M2.bp_grp_cd2.eq(S0_MM12.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP2.value()).eq(S0_MM12.bp_grp_typ))))
					.predicate(DS0C_PRSPPL_GRP, p -> p.cutoff$and(S0_M2.bp_grp_cd2.like(bind("prsppl_grp_cd2"))).cutoff$and(S0_MM12.bp_grp_nm.like(bind("prsppl_grp_nm2")))),
				when(boundOr("prsppl_grp_flg3"))
					.select(DS0C_PRSPPL_GRP, S0_M2.bp_grp_cd3.as("prsppl_grp_cd3"), S0_MM13.bp_grp_nm.as("prsppl_grp_nm3"))
					.view(DS0C_PRSPPL_GRP, v -> v.leftOuterJoin(S0_MM13).on(S0_M2.bp_grp_cd3.eq(S0_MM13.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP3.value()).eq(S0_MM13.bp_grp_typ))))
					.predicate(DS0C_PRSPPL_GRP, p -> p.cutoff$and(S0_M2.bp_grp_cd3.like(bind("prsppl_grp_cd3"))).cutoff$and(S0_MM13.bp_grp_nm.like(bind("prsppl_grp_nm3")))),
				when(boundOr("prsppl_grp_flg4"))
					.select(DS0C_PRSPPL_GRP, S0_M2.bp_grp_cd4.as("prsppl_grp_cd4"), S0_MM14.bp_grp_nm.as("prsppl_grp_nm4"))
					.view(DS0C_PRSPPL_GRP, v -> v.leftOuterJoin(S0_MM14).on(S0_M2.bp_grp_cd4.eq(S0_MM14.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP4.value()).eq(S0_MM14.bp_grp_typ))))
					.predicate(DS0C_PRSPPL_GRP, p -> p.cutoff$and(S0_M2.bp_grp_cd4.like(bind("prsppl_grp_cd4"))).cutoff$and(S0_MM14.bp_grp_nm.like(bind("prsppl_grp_nm4")))),
				when(boundOr("prsppl_grp_flg5"))
					.select(DS0C_PRSPPL_GRP, S0_M2.bp_grp_cd5.as("prsppl_grp_cd5"), S0_MM15.bp_grp_nm.as("prsppl_grp_nm5"))
					.view(DS0C_PRSPPL_GRP, v -> v.leftOuterJoin(S0_MM15).on(S0_M2.bp_grp_cd5.eq(S0_MM15.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP5.value()).eq(S0_MM15.bp_grp_typ))))
					.predicate(DS0C_PRSPPL_GRP, p -> p.cutoff$and(S0_M2.bp_grp_cd5.like(bind("prsppl_grp_cd5"))).cutoff$and(S0_MM15.bp_grp_nm.like(bind("prsppl_grp_nm5")))),
				when(boundOr("prsppl_grp_flg6"))
					.select(DS0C_PRSPPL_GRP, S0_M2.bp_grp_cd6.as("prsppl_grp_cd6"), S0_MM16.bp_grp_nm.as("prsppl_grp_nm6"))
					.view(DS0C_PRSPPL_GRP, v -> v.leftOuterJoin(S0_MM16).on(S0_M2.bp_grp_cd6.eq(S0_MM16.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP6.value()).eq(S0_MM16.bp_grp_typ))))
					.predicate(DS0C_PRSPPL_GRP, p -> p.cutoff$and(S0_M2.bp_grp_cd6.like(bind("prsppl_grp_cd6"))).cutoff$and(S0_MM16.bp_grp_nm.like(bind("prsppl_grp_nm6")))),
				when(boundOr("prsppl_grp_flg7"))
					.select(DS0C_PRSPPL_GRP, S0_M2.bp_grp_cd7.as("prsppl_grp_cd7"), S0_MM17.bp_grp_nm.as("prsppl_grp_nm7"))
					.view(DS0C_PRSPPL_GRP, v -> v.leftOuterJoin(S0_MM17).on(S0_M2.bp_grp_cd7.eq(S0_MM17.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP7.value()).eq(S0_MM17.bp_grp_typ))))
					.predicate(DS0C_PRSPPL_GRP, p -> p.cutoff$and(S0_M2.bp_grp_cd7.like(bind("prsppl_grp_cd7"))).cutoff$and(S0_MM17.bp_grp_nm.like(bind("prsppl_grp_nm7")))),
				when(boundOr("prsppl_grp_flg8"))
					.select(DS0C_PRSPPL_GRP, S0_M2.bp_grp_cd8.as("prsppl_grp_cd8"), S0_MM18.bp_grp_nm.as("prsppl_grp_nm8"))
					.view(DS0C_PRSPPL_GRP, v -> v.leftOuterJoin(S0_MM18).on(S0_M2.bp_grp_cd8.eq(S0_MM18.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP8.value()).eq(S0_MM18.bp_grp_typ))))
					.predicate(DS0C_PRSPPL_GRP, p -> p.cutoff$and(S0_M2.bp_grp_cd8.like(bind("prsppl_grp_cd8"))).cutoff$and(S0_MM18.bp_grp_nm.like(bind("prsppl_grp_nm8")))),
				when(boundOr("prsppl_grp_flg9"))
					.select(DS0C_PRSPPL_GRP, S0_M2.bp_grp_cd9.as("prsppl_grp_cd9"), S0_MM19.bp_grp_nm.as("prsppl_grp_nm9"))
					.view(DS0C_PRSPPL_GRP, v -> v.leftOuterJoin(S0_MM19).on(S0_M2.bp_grp_cd9.eq(S0_MM19.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP9.value()).eq(S0_MM19.bp_grp_typ))))
					.predicate(DS0C_PRSPPL_GRP, p -> p.cutoff$and(S0_M2.bp_grp_cd9.like(bind("prsppl_grp_cd9"))).cutoff$and(S0_MM19.bp_grp_nm.like(bind("prsppl_grp_nm9")))),
				when(boundOr("prsppl_grp_flg10"))
					.select(DS0C_PRSPPL_GRP, S0_M2.bp_grp_cd10.as("prsppl_grp_cd10"), S0_MM110.bp_grp_nm.as("prsppl_grp_nm10"))
					.view(DS0C_PRSPPL_GRP, v -> v.leftOuterJoin(S0_MM110).on(S0_M2.bp_grp_cd10.eq(S0_MM110.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP10.value()).eq(S0_MM110.bp_grp_typ))))
					.predicate(DS0C_PRSPPL_GRP, p -> p.cutoff$and(S0_M2.bp_grp_cd10.like(bind("prsppl_grp_cd10"))).cutoff$and(S0_MM110.bp_grp_nm.like(bind("prsppl_grp_nm10")))),
				when(boundOr("itm_grp_flg1"))
					.select(DS0C_ITM_GRP, S0_M8.itm_grp_cd1.as("itm_grp_cd1"), S0_MM21.itm_grp_nm.as("itm_grp_nm1"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM21).on(S0_M8.itm_grp_cd1.eq(S0_MM21.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP1.value()).eq(S0_MM21.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M8.itm_grp_cd1.like(bind("itm_grp_cd1"))).cutoff$and(S0_MM21.itm_grp_nm.like(bind("itm_grp_nm1")))),
				when(boundOr("itm_grp_flg2"))
					.select(DS0C_ITM_GRP, S0_M8.itm_grp_cd2.as("itm_grp_cd2"), S0_MM22.itm_grp_nm.as("itm_grp_nm2"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM22).on(S0_M8.itm_grp_cd2.eq(S0_MM22.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP2.value()).eq(S0_MM22.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M8.itm_grp_cd2.like(bind("itm_grp_cd2"))).cutoff$and(S0_MM22.itm_grp_nm.like(bind("itm_grp_nm2")))),
				when(boundOr("itm_grp_flg3"))
					.select(DS0C_ITM_GRP, S0_M8.itm_grp_cd3.as("itm_grp_cd3"), S0_MM23.itm_grp_nm.as("itm_grp_nm3"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM23).on(S0_M8.itm_grp_cd3.eq(S0_MM23.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP3.value()).eq(S0_MM23.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M8.itm_grp_cd3.like(bind("itm_grp_cd3"))).cutoff$and(S0_MM23.itm_grp_nm.like(bind("itm_grp_nm3")))),
				when(boundOr("itm_grp_flg4"))
					.select(DS0C_ITM_GRP, S0_M8.itm_grp_cd4.as("itm_grp_cd4"), S0_MM24.itm_grp_nm.as("itm_grp_nm4"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM24).on(S0_M8.itm_grp_cd4.eq(S0_MM24.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP4.value()).eq(S0_MM24.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M8.itm_grp_cd4.like(bind("itm_grp_cd4"))).cutoff$and(S0_MM24.itm_grp_nm.like(bind("itm_grp_nm4")))),
				when(boundOr("itm_grp_flg5"))
					.select(DS0C_ITM_GRP, S0_M8.itm_grp_cd5.as("itm_grp_cd5"), S0_MM25.itm_grp_nm.as("itm_grp_nm5"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM25).on(S0_M8.itm_grp_cd5.eq(S0_MM25.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP5.value()).eq(S0_MM25.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M8.itm_grp_cd5.like(bind("itm_grp_cd5"))).cutoff$and(S0_MM25.itm_grp_nm.like(bind("itm_grp_nm5")))),
				when(boundOr("itm_grp_flg6"))
					.select(DS0C_ITM_GRP, S0_M8.itm_grp_cd6.as("itm_grp_cd6"), S0_MM26.itm_grp_nm.as("itm_grp_nm6"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM26).on(S0_M8.itm_grp_cd6.eq(S0_MM26.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP6.value()).eq(S0_MM26.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M8.itm_grp_cd6.like(bind("itm_grp_cd6"))).cutoff$and(S0_MM26.itm_grp_nm.like(bind("itm_grp_nm6")))),
				when(boundOr("itm_grp_flg7"))
					.select(DS0C_ITM_GRP, S0_M8.itm_grp_cd7.as("itm_grp_cd7"), S0_MM27.itm_grp_nm.as("itm_grp_nm7"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM27).on(S0_M8.itm_grp_cd7.eq(S0_MM27.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP7.value()).eq(S0_MM27.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M8.itm_grp_cd7.like(bind("itm_grp_cd7"))).cutoff$and(S0_MM27.itm_grp_nm.like(bind("itm_grp_nm7")))),
				when(boundOr("itm_grp_flg8"))
					.select(DS0C_ITM_GRP, S0_M8.itm_grp_cd8.as("itm_grp_cd8"), S0_MM28.itm_grp_nm.as("itm_grp_nm8"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM28).on(S0_M8.itm_grp_cd8.eq(S0_MM28.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP8.value()).eq(S0_MM28.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M8.itm_grp_cd8.like(bind("itm_grp_cd8"))).cutoff$and(S0_MM28.itm_grp_nm.like(bind("itm_grp_nm8")))),
				when(boundOr("itm_grp_flg9"))
					.select(DS0C_ITM_GRP, S0_M8.itm_grp_cd9.as("itm_grp_cd9"), S0_MM29.itm_grp_nm.as("itm_grp_nm9"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM29).on(S0_M8.itm_grp_cd9.eq(S0_MM29.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP9.value()).eq(S0_MM29.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M8.itm_grp_cd9.like(bind("itm_grp_cd9"))).cutoff$and(S0_MM29.itm_grp_nm.like(bind("itm_grp_nm9")))),
				when(boundOr("itm_grp_flg10"))
					.select(DS0C_ITM_GRP, S0_M8.itm_grp_cd10.as("itm_grp_cd10"), S0_MM210.itm_grp_nm.as("itm_grp_nm10"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM210).on(S0_M8.itm_grp_cd10.eq(S0_MM210.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP10.value()).eq(S0_MM210.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M8.itm_grp_cd10.like(bind("itm_grp_cd10"))).cutoff$and(S0_MM210.itm_grp_nm.like(bind("itm_grp_nm10"))))
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
							r.getStringNE("prsppl_cd")
						))
						.addSelect(m -> toArray(
							m.bp_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("prsppl_nm", m.bp_nm());
					}),
					j -> j
						.add(MAM_WG_R.class, r -> toCondition(
							r.getStringNE("prsppl_wg_cd")
						))
						.addSelect(m -> toArray(
							m.wg_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("prsppl_wg_nm", m.wg_nm());
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
						.add(MAM_CUR_R.class, r -> toCondition(
							r.getStringNE("trd_cur_cd")
						))
						.addSelect(m -> toArray(
							m.cur_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("trd_cur_nm", m.cur_nm());
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
							r.setStringNE("tax_typ", m.tax_typ());
							r.setBooleanNE("inc_tax_flg", m.inc_tax_flg());
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
							r.getStringNE("xfr_rsn_cd")
						))
						.addSelect(m -> toArray(
							m.acxfr_gi_flg,
							m.biz_rsn_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("xfr_rsn_nm", m.biz_rsn_nm());
							r.setBooleanNE("acxfr_gi_flg", m.acxfr_gi_flg());
					})
				)
			);
	}
	
	/**
	 * -- MSBEL1160_MST_PROV_SCHD_Query_S03
	 */
	static MCQueryPlan MSBEL1160_MST_PROV_SCHD_S03() {
		MST_PROV_SCHD_R S0_T1 = MST_PROV_SCHD_R.create("T1");
		MCTempView S0_T0 = createTempView("T0");
		MST_ARR_SCHD_R S0_TT1 = MST_ARR_SCHD_R.create("TT1");
		MST_ARR_PR_R S0_TT2 = MST_ARR_PR_R.create("TT2");
		MSVT_WRK_SNO_R S0_T3 = MSVT_WRK_SNO_R.create("T3");
		MAM_TRD_R S0_M1 = MAM_TRD_R.create("M1");
		MAM_BP_R S0_M2 = MAM_BP_R.create("M2");
		MAVM_RD_LOC_R S0_M3 = MAVM_RD_LOC_R.create("M3");
		MAM_SITE_R S0_M4 = MAM_SITE_R.create("M4");
		MAM_WG_R S0_M5 = MAM_WG_R.create("M5");
		MAM_LG_GRP_R S0_M6 = MAM_LG_GRP_R.create("M6");
		MAM_STR_LN_R S0_M7 = MAM_STR_LN_R.create("M7");
		MAM_ITM_R S0_M8 = MAM_ITM_R.create("M8");
		MAM_ITM_TYP_D_R S0_M9 = MAM_ITM_TYP_D_R.create("M9");
		MAM_SUNDRY_ITM_R S0_M10 = MAM_SUNDRY_ITM_R.create("M10");
		MAM_STK_GD_R S0_M11 = MAM_STK_GD_R.create("M11");
		MAM_CUR_R S0_M12 = MAM_CUR_R.create("M12");
		MAM_TAX_R S0_M13 = MAM_TAX_R.create("M13");
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
		MST_PROV_ACT_R S1_T = MST_PROV_ACT_R.create("T");
		
		MCDynamicSQLID DS0C_ITM_GRP = createDynamicSQLID("DS0C_ITM_GRP");
		MCDynamicSQLID DS0C_PRSPPL_GRP = createDynamicSQLID("DS0C_PRSPPL_GRP");
		
		return createQueryPlan()
			.setQuery(
				sql("MSBEL1160_MST_PROV_SCHD_Query_S03")
					.mainQuery()
					.select(
						S0_T1.prov_schd_no,
						S0_T1.prov_src_schd_typ,
						S0_T1.prov_src_schd_no1,
						S0_T1.prov_src_schd_no2,
						S0_T1.trd_cd,
						S0_T1.trd_ptn_typ,
						S0_T1.xfr_rsn_cd,
						S0_T1.base_unit_cd,
						S0_T1.base_unit_qty.as("schd_qty"),
						S0_T0.pr("base_unit_qty").as("act_qty"),
						S0_T1.accpt_schd_dt,
						trunc(
							S0_TT1.arr_schd_tm,
							MCDateFmt.DD
						).as("arr_schd_dt"),
						S0_TT1.arr_schd_tm.as("arr_schd_hm"),
						S0_T1.wg_cd.as("prsppl_wg_cd"),
						S0_T1.prsppl_cd,
						S0_T1.prov_typ,
						S0_T1.prov_basis_typ,
						S0_T1.xrate_inpt_flg,
						S0_T1.xrate,
						S0_T1.ptax_xrate_inpt_flg,
						S0_T1.ptax_xrate,
						S0_T1.trd_cur_cd,
						S0_T1.tax_fix_flg,
						S0_T1.tax_cd,
						S0_T1.trd_cur_upri,
						S0_T1.trd_cur_amt,
						S0_T1.trd_cur_tax_amt,
						S0_T1.trd_cur_amt.add(S0_T1.trd_cur_tax_amt).as("trd_cur_inc_tax_amt"),
						S0_T1.wtax_rate,
						S0_T1.wtax_amt,
						S0_T1.intr_rmrks,
						S0_T1.sub_char1,
						S0_T1.sub_char2,
						S0_T1.sub_char3,
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
						S0_TT1.itm_cd,
						S0_TT1.itm_sub1,
						S0_TT1.itm_sub2,
						S0_TT1.itm_sub3,
						coalesce(
							S0_M10.itm_nm,
							S0_M8.itm_nm
						).as("itm_nm"),
						S0_M8.itm_typ,
						S0_M8.itm_typ_d_cd,
						S0_M8.sundry_itm_flg,
						S0_M8.asset_mng_typ,
						S0_TT1.arr_loc_cd.as("prsppl_loc_cd"),
						S0_M3.loc_nm.as("prsppl_loc_nm"),
						S0_TT1.str_ln_cd,
						S0_TT1.lot_no,
						S0_TT1.sublot_no,
						S0_TT1.ver_no,
						S0_TT1.sno1,
						S0_TT1.sno2,
						S0_TT1.sno3,
						S0_TT1.sno4,
						S0_TT1.gd_cd,
						S0_TT1.stk_id_typ,
						S0_TT1.dlv_slip_no.as("dlv_slip_no"),
						S0_TT2.dlv_slip_d_no.as("dlv_slip_d_no"),
						S0_TT2.po_d_no,
						addDynamicSelect(DS0C_PRSPPL_GRP),
						addDynamicSelect(DS0C_ITM_GRP)
					)
					.from(
						S0_T1
						.leftOuterJoin(
							subQuery()
							.select(
								S1_T.prov_schd_no,
								sum(S1_T.base_unit_qty).as("base_unit_qty")
							)
							.from(S1_T)
							.groupBy(S1_T.prov_schd_no).view(S0_T0)
						).on(
							bracket(
								S0_T1.prov_schd_no.eq(S0_T0.pr(S1_T.prov_schd_no))
							)
						)
						.innerJoin(S0_TT1).on(
							bracket(
								S0_T1.prov_src_schd_no2.eq(S0_TT1.arr_schd_no)
							)
						)
						.innerJoin(S0_TT2).on(
							bracket(
								S0_TT1.arr_pr_no.eq(S0_TT2.arr_pr_no)
							)
						)
						.innerJoin(S0_M3).on(
							bracket(
								S0_TT1.arr_loc_cd.eq(S0_M3.loc_cd)
							)
						)
						.leftOuterJoin(S0_M8).on(
							bracket(
								S0_TT1.itm_cd.eq(S0_M8.itm_cd)
								.and(S0_TT1.itm_sub1.eq(S0_M8.itm_sub1))
								.and(S0_TT1.itm_sub2.eq(S0_M8.itm_sub2))
								.and(S0_TT1.itm_sub3.eq(S0_M8.itm_sub3))
							)
						)
						.leftOuterJoin(S0_M10).on(
							bracket(
								S0_TT1.itm_cd.eq(S0_M10.itm_cd)
								.and(S0_TT1.itm_sub1.eq(S0_M10.itm_sub1))
								.and(S0_TT1.itm_sub2.eq(S0_M10.itm_sub2))
								.and(S0_TT1.itm_sub3.eq(S0_M10.itm_sub3))
								.and(S0_TT1.sno1.eq(S0_M10.sno1))
								.and(S0_TT1.sno2.eq(S0_M10.sno2))
								.and(S0_TT1.sno3.eq(S0_M10.sno3))
								.and(S0_TT1.sno4.eq(S0_M10.sno4))
							)
						)
						.addDynamicView()
						.addDynamicView(DS0C_PRSPPL_GRP)
						.addDynamicView(DS0C_ITM_GRP)
					)
					.where(
						value(0).eq(value(0))
						.and(
							S0_T1.prov_src_schd_typ.in(
								value(MSC_PROV_SRC_SCHD_TYP.SHIP.value()),
								value(MSC_PROV_SRC_SCHD_TYP.DDLV.value())
							)
						)
						.and(
							S0_T1.trd_ptn_typ.in(
								bind("prov_str"),
								bind("prov_rtn_str")
							)
						)
						.and(
							S0_T1.prov_typ.in(
								bind("ffr_prov_flg_str"),
								bind("onr_prov_flg_str")
							)
						)
						.addDynamicPredicate()
						.cutoff$and(S0_T1.accpt_schd_dt.gte(bind("accpt_schd_dt_fr")))
						.cutoff$and(S0_T1.accpt_schd_dt.lte(bind("accpt_schd_dt_to")))
						.cutoff$and(S0_TT1.arr_schd_tm.gte(bind("arr_schd_hm_fr")))
						.cutoff$and(S0_TT1.arr_schd_tm.lte(bind("arr_schd_hm_to")))
						.cutoff$and(S0_T1.trd_cd.like(bind("trd_cd")))
						.cutoff$and(S0_T1.prsppl_cd.like(bind("prsppl_cd")))
						.cutoff$and(S0_TT1.arr_loc_cd.like(bind("prsppl_loc_cd")))
						.cutoff$and(S0_M3.loc_nm.like(bind("prsppl_loc_nm")))
						.cutoff$and(S0_M3.site_cd.like(bind("prsppl_site_cd")))
						.cutoff$and(S0_T1.wg_cd.like(bind("prsppl_wg_cd")))
						.cutoff$and(S0_M3.lg_grp_cd.like(bind("prsppl_lg_grp_cd")))
						.cutoff$and(S0_TT1.str_ln_cd.like(bind("prsppl_str_ln_cd")))
						.cutoff$and(S0_M8.itm_typ.like(bind("itm_typ")))
						.cutoff$and(S0_M8.itm_typ_d_cd.like(bind("itm_typ_d_cd")))
						.cutoff$and(S0_TT1.itm_cd.like(bind("itm_cd")))
						.cutoff$and(S0_TT1.itm_sub1.like(bind("itm_sub1")))
						.cutoff$and(S0_TT1.itm_sub2.like(bind("itm_sub2")))
						.cutoff$and(S0_TT1.itm_sub3.like(bind("itm_sub3")))
						.cutoff$and(
							coalesce(
								S0_M10.itm_nm,
								S0_M8.itm_nm
							).like(bind("itm_nm"))
						)
						.cutoff$and(S0_TT1.ver_no.like(bind("ver_no")))
						.cutoff$and(S0_TT1.lot_no.like(bind("lot_no")))
						.cutoff$and(S0_TT1.sublot_no.like(bind("sublot_no")))
						.cutoff$and(S0_TT1.sno1.like(bind("sno1")))
						.cutoff$and(S0_TT1.sno2.like(bind("sno2")))
						.cutoff$and(S0_TT1.sno3.like(bind("sno3")))
						.cutoff$and(S0_TT1.sno4.like(bind("sno4")))
						.cutoff$and(S0_TT1.gd_cd.like(bind("gd_cd")))
						.cutoff$and(S0_TT1.stk_id_typ.like(bind("stk_id_typ")))
						.cutoff$and(S0_T1.prov_basis_typ.like(bind("prov_basis_typ")))
						.cutoff$and(S0_TT1.dlv_slip_no.like(bind("dlv_slip_no")))
						.cutoff$and(S0_TT2.dlv_slip_d_no.like(bind("dlv_slip_d_no")))
						.cutoff$and(S0_T1.trd_cur_cd.like(bind("trd_cur_cd")))
						.cutoff$and(bind("base_cur_cd").neq(S0_T1.trd_cur_cd))
						.cutoff$and(S0_T1.tax_cd.like(bind("tax_cd")))
						.cutoff$and(S0_T1.prov_src_schd_typ.like(bind("prov_src_schd_typ")))
						.cutoff$and(S0_T1.prov_src_schd_no1.like(bind("prov_src_schd_no1")))
						.cutoff$and(S0_T1.prov_src_schd_no2.like(bind("prov_src_schd_no2")))
						.cutoff$and(S0_T1.prov_schd_no.like(bind("prov_schd_no")))
						.cutoff$and(S0_T1.intr_rmrks.like(bind("intr_rmrks")))
						.cutoff$and(S0_T1.sub_char1.like(bind("sub_char1")))
						.cutoff$and(S0_T1.sub_char2.like(bind("sub_char2")))
						.cutoff$and(S0_T1.sub_char3.like(bind("sub_char3")))
						.addDynamicPredicate(DS0C_PRSPPL_GRP)
						.addDynamicPredicate(DS0C_ITM_GRP)
					)
					.orderBy(
						S0_T1.prov_src_schd_typ.asc(),
						S0_T1.prov_schd_no.asc()
					)
			)
			.setDynamicSQLInfo(
				when(boundOr("wrk_no", "wrk_nm"))
					.view(v -> v.leftOuterJoin(S0_T3).on(bracket(S0_TT1.sno1.eq(S0_T3.sno1))))
					.predicate(p -> p.cutoff$and(S0_T3.wrk_no.like(bind("wrk_no"))).cutoff$and(S0_T3.wrk_nm.like(bind("wrk_nm")))),
				when(boundOr("trd_nm"))
					.view(v -> v.leftOuterJoin(S0_M1).on(bracket(S0_T1.trd_cd.eq(S0_M1.trd_cd))))
					.predicate(p -> p.cutoff$and(S0_M1.trd_nm.like(bind("trd_nm")))),
				when(boundOr("prsppl_grp_flg1", "prsppl_grp_flg2", "prsppl_grp_flg3", "prsppl_grp_flg4", "prsppl_grp_flg5", "prsppl_grp_flg6", "prsppl_grp_flg7", "prsppl_grp_flg8", "prsppl_grp_flg9", "prsppl_grp_flg10", "subcon_flg_str", "prsppl_nm"))
					.view(v -> v.leftOuterJoin(S0_M2).on(bracket(S0_T1.prsppl_cd.eq(S0_M2.bp_cd))))
					.predicate(p -> p.cutoff$and(S0_M2.subcon_flg.eq(bind("subcon_flg_str"))).cutoff$and(S0_M2.bp_nm.like(bind("prsppl_nm")))),
				when(boundOr("prsppl_site_nm"))
					.view(v -> v.leftOuterJoin(S0_M4).on(bracket(S0_M3.site_cd.eq(S0_M4.site_cd))))
					.predicate(p -> p.cutoff$and(S0_M4.site_nm.like(bind("prsppl_site_nm")))),
				when(boundOr("prsppl_wg_nm"))
					.view(v -> v.leftOuterJoin(S0_M5).on(bracket(S0_T1.wg_cd.eq(S0_M5.wg_cd))))
					.predicate(p -> p.cutoff$and(S0_M5.wg_nm.like(bind("prsppl_wg_nm")))),
				when(boundOr("prsppl_lg_grp_nm"))
					.view(v -> v.leftOuterJoin(S0_M6).on(bracket(S0_M3.lg_grp_cd.eq(S0_M6.lg_grp_cd))))
					.predicate(p -> p.cutoff$and(S0_M6.lg_grp_nm.like(bind("prsppl_lg_grp_nm")))),
				when(boundOr("prsppl_str_ln_nm"))
					.view(v -> v.leftOuterJoin(S0_M7).on(bracket(S0_TT1.arr_loc_cd.eq(S0_M7.loc_cd).and(S0_TT1.str_ln_cd.eq(S0_M7.str_ln_cd)))))
					.predicate(p -> p.cutoff$and(S0_M7.str_ln_nm.like(bind("prsppl_str_ln_nm")))),
				when(boundOr("itm_typ_d_nm"))
					.view(v -> v.leftOuterJoin(S0_M9).on(bracket(S0_M8.itm_typ.eq(S0_M9.itm_typ).and(S0_M8.itm_typ_d_cd.eq(S0_M9.itm_typ_d_cd)))))
					.predicate(p -> p.cutoff$and(S0_M9.itm_typ_d_nm.like(bind("itm_typ_d_nm")))),
				when(boundOr("gd_nm"))
					.view(v -> v.leftOuterJoin(S0_M11).on(bracket(S0_TT1.gd_cd.eq(S0_M11.gd_cd))))
					.predicate(p -> p.cutoff$and(S0_M11.gd_nm.like(bind("gd_nm")))),
				when(boundOr("trd_cur_nm"))
					.view(v -> v.leftOuterJoin(S0_M12).on(bracket(S0_T1.trd_cur_cd.eq(S0_M12.cur_cd))))
					.predicate(p -> p.cutoff$and(S0_M12.cur_nm.like(bind("trd_cur_nm")))),
				when(boundOr("tax_nm"))
					.view(v -> v.leftOuterJoin(S0_M13).on(bracket(S0_T1.tax_cd.eq(S0_M13.tax_cd))))
					.predicate(p -> p.cutoff$and(S0_M13.tax_nm.like(bind("tax_nm")))),
				when(boundOr("prsppl_grp_flg1"))
					.select(DS0C_PRSPPL_GRP, S0_M2.bp_grp_cd1.as("prsppl_grp_cd1"), S0_MM11.bp_grp_nm.as("prsppl_grp_nm1"))
					.view(DS0C_PRSPPL_GRP, v -> v.leftOuterJoin(S0_MM11).on(S0_M2.bp_grp_cd1.eq(S0_MM11.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP1.value()).eq(S0_MM11.bp_grp_typ))))
					.predicate(DS0C_PRSPPL_GRP, p -> p.cutoff$and(S0_M2.bp_grp_cd1.like(bind("prsppl_grp_cd1"))).cutoff$and(S0_MM11.bp_grp_nm.like(bind("prsppl_grp_nm1")))),
				when(boundOr("prsppl_grp_flg2"))
					.select(DS0C_PRSPPL_GRP, S0_M2.bp_grp_cd2.as("prsppl_grp_cd2"), S0_MM12.bp_grp_nm.as("prsppl_grp_nm2"))
					.view(DS0C_PRSPPL_GRP, v -> v.leftOuterJoin(S0_MM12).on(S0_M2.bp_grp_cd2.eq(S0_MM12.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP2.value()).eq(S0_MM12.bp_grp_typ))))
					.predicate(DS0C_PRSPPL_GRP, p -> p.cutoff$and(S0_M2.bp_grp_cd2.like(bind("prsppl_grp_cd2"))).cutoff$and(S0_MM12.bp_grp_nm.like(bind("prsppl_grp_nm2")))),
				when(boundOr("prsppl_grp_flg3"))
					.select(DS0C_PRSPPL_GRP, S0_M2.bp_grp_cd3.as("prsppl_grp_cd3"), S0_MM13.bp_grp_nm.as("prsppl_grp_nm3"))
					.view(DS0C_PRSPPL_GRP, v -> v.leftOuterJoin(S0_MM13).on(S0_M2.bp_grp_cd3.eq(S0_MM13.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP3.value()).eq(S0_MM13.bp_grp_typ))))
					.predicate(DS0C_PRSPPL_GRP, p -> p.cutoff$and(S0_M2.bp_grp_cd3.like(bind("prsppl_grp_cd3"))).cutoff$and(S0_MM13.bp_grp_nm.like(bind("prsppl_grp_nm3")))),
				when(boundOr("prsppl_grp_flg4"))
					.select(DS0C_PRSPPL_GRP, S0_M2.bp_grp_cd4.as("prsppl_grp_cd4"), S0_MM14.bp_grp_nm.as("prsppl_grp_nm4"))
					.view(DS0C_PRSPPL_GRP, v -> v.leftOuterJoin(S0_MM14).on(S0_M2.bp_grp_cd4.eq(S0_MM14.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP4.value()).eq(S0_MM14.bp_grp_typ))))
					.predicate(DS0C_PRSPPL_GRP, p -> p.cutoff$and(S0_M2.bp_grp_cd4.like(bind("prsppl_grp_cd4"))).cutoff$and(S0_MM14.bp_grp_nm.like(bind("prsppl_grp_nm4")))),
				when(boundOr("prsppl_grp_flg5"))
					.select(DS0C_PRSPPL_GRP, S0_M2.bp_grp_cd5.as("prsppl_grp_cd5"), S0_MM15.bp_grp_nm.as("prsppl_grp_nm5"))
					.view(DS0C_PRSPPL_GRP, v -> v.leftOuterJoin(S0_MM15).on(S0_M2.bp_grp_cd5.eq(S0_MM15.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP5.value()).eq(S0_MM15.bp_grp_typ))))
					.predicate(DS0C_PRSPPL_GRP, p -> p.cutoff$and(S0_M2.bp_grp_cd5.like(bind("prsppl_grp_cd5"))).cutoff$and(S0_MM15.bp_grp_nm.like(bind("prsppl_grp_nm5")))),
				when(boundOr("prsppl_grp_flg6"))
					.select(DS0C_PRSPPL_GRP, S0_M2.bp_grp_cd6.as("prsppl_grp_cd6"), S0_MM16.bp_grp_nm.as("prsppl_grp_nm6"))
					.view(DS0C_PRSPPL_GRP, v -> v.leftOuterJoin(S0_MM16).on(S0_M2.bp_grp_cd6.eq(S0_MM16.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP6.value()).eq(S0_MM16.bp_grp_typ))))
					.predicate(DS0C_PRSPPL_GRP, p -> p.cutoff$and(S0_M2.bp_grp_cd6.like(bind("prsppl_grp_cd6"))).cutoff$and(S0_MM16.bp_grp_nm.like(bind("prsppl_grp_nm6")))),
				when(boundOr("prsppl_grp_flg7"))
					.select(DS0C_PRSPPL_GRP, S0_M2.bp_grp_cd7.as("prsppl_grp_cd7"), S0_MM17.bp_grp_nm.as("prsppl_grp_nm7"))
					.view(DS0C_PRSPPL_GRP, v -> v.leftOuterJoin(S0_MM17).on(S0_M2.bp_grp_cd7.eq(S0_MM17.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP7.value()).eq(S0_MM17.bp_grp_typ))))
					.predicate(DS0C_PRSPPL_GRP, p -> p.cutoff$and(S0_M2.bp_grp_cd7.like(bind("prsppl_grp_cd7"))).cutoff$and(S0_MM17.bp_grp_nm.like(bind("prsppl_grp_nm7")))),
				when(boundOr("prsppl_grp_flg8"))
					.select(DS0C_PRSPPL_GRP, S0_M2.bp_grp_cd8.as("prsppl_grp_cd8"), S0_MM18.bp_grp_nm.as("prsppl_grp_nm8"))
					.view(DS0C_PRSPPL_GRP, v -> v.leftOuterJoin(S0_MM18).on(S0_M2.bp_grp_cd8.eq(S0_MM18.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP8.value()).eq(S0_MM18.bp_grp_typ))))
					.predicate(DS0C_PRSPPL_GRP, p -> p.cutoff$and(S0_M2.bp_grp_cd8.like(bind("prsppl_grp_cd8"))).cutoff$and(S0_MM18.bp_grp_nm.like(bind("prsppl_grp_nm8")))),
				when(boundOr("prsppl_grp_flg9"))
					.select(DS0C_PRSPPL_GRP, S0_M2.bp_grp_cd9.as("prsppl_grp_cd9"), S0_MM19.bp_grp_nm.as("prsppl_grp_nm9"))
					.view(DS0C_PRSPPL_GRP, v -> v.leftOuterJoin(S0_MM19).on(S0_M2.bp_grp_cd9.eq(S0_MM19.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP9.value()).eq(S0_MM19.bp_grp_typ))))
					.predicate(DS0C_PRSPPL_GRP, p -> p.cutoff$and(S0_M2.bp_grp_cd9.like(bind("prsppl_grp_cd9"))).cutoff$and(S0_MM19.bp_grp_nm.like(bind("prsppl_grp_nm9")))),
				when(boundOr("prsppl_grp_flg10"))
					.select(DS0C_PRSPPL_GRP, S0_M2.bp_grp_cd10.as("prsppl_grp_cd10"), S0_MM110.bp_grp_nm.as("prsppl_grp_nm10"))
					.view(DS0C_PRSPPL_GRP, v -> v.leftOuterJoin(S0_MM110).on(S0_M2.bp_grp_cd10.eq(S0_MM110.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP10.value()).eq(S0_MM110.bp_grp_typ))))
					.predicate(DS0C_PRSPPL_GRP, p -> p.cutoff$and(S0_M2.bp_grp_cd10.like(bind("prsppl_grp_cd10"))).cutoff$and(S0_MM110.bp_grp_nm.like(bind("prsppl_grp_nm10")))),
				when(boundOr("itm_grp_flg1"))
					.select(DS0C_ITM_GRP, S0_M8.itm_grp_cd1.as("itm_grp_cd1"), S0_MM21.itm_grp_nm.as("itm_grp_nm1"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM21).on(S0_M8.itm_grp_cd1.eq(S0_MM21.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP1.value()).eq(S0_MM21.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M8.itm_grp_cd1.like(bind("itm_grp_cd1"))).cutoff$and(S0_MM21.itm_grp_nm.like(bind("itm_grp_nm1")))),
				when(boundOr("itm_grp_flg2"))
					.select(DS0C_ITM_GRP, S0_M8.itm_grp_cd2.as("itm_grp_cd2"), S0_MM22.itm_grp_nm.as("itm_grp_nm2"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM22).on(S0_M8.itm_grp_cd2.eq(S0_MM22.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP2.value()).eq(S0_MM22.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M8.itm_grp_cd2.like(bind("itm_grp_cd2"))).cutoff$and(S0_MM22.itm_grp_nm.like(bind("itm_grp_nm2")))),
				when(boundOr("itm_grp_flg3"))
					.select(DS0C_ITM_GRP, S0_M8.itm_grp_cd3.as("itm_grp_cd3"), S0_MM23.itm_grp_nm.as("itm_grp_nm3"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM23).on(S0_M8.itm_grp_cd3.eq(S0_MM23.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP3.value()).eq(S0_MM23.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M8.itm_grp_cd3.like(bind("itm_grp_cd3"))).cutoff$and(S0_MM23.itm_grp_nm.like(bind("itm_grp_nm3")))),
				when(boundOr("itm_grp_flg4"))
					.select(DS0C_ITM_GRP, S0_M8.itm_grp_cd4.as("itm_grp_cd4"), S0_MM24.itm_grp_nm.as("itm_grp_nm4"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM24).on(S0_M8.itm_grp_cd4.eq(S0_MM24.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP4.value()).eq(S0_MM24.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M8.itm_grp_cd4.like(bind("itm_grp_cd4"))).cutoff$and(S0_MM24.itm_grp_nm.like(bind("itm_grp_nm4")))),
				when(boundOr("itm_grp_flg5"))
					.select(DS0C_ITM_GRP, S0_M8.itm_grp_cd5.as("itm_grp_cd5"), S0_MM25.itm_grp_nm.as("itm_grp_nm5"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM25).on(S0_M8.itm_grp_cd5.eq(S0_MM25.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP5.value()).eq(S0_MM25.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M8.itm_grp_cd5.like(bind("itm_grp_cd5"))).cutoff$and(S0_MM25.itm_grp_nm.like(bind("itm_grp_nm5")))),
				when(boundOr("itm_grp_flg6"))
					.select(DS0C_ITM_GRP, S0_M8.itm_grp_cd6.as("itm_grp_cd6"), S0_MM26.itm_grp_nm.as("itm_grp_nm6"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM26).on(S0_M8.itm_grp_cd6.eq(S0_MM26.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP6.value()).eq(S0_MM26.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M8.itm_grp_cd6.like(bind("itm_grp_cd6"))).cutoff$and(S0_MM26.itm_grp_nm.like(bind("itm_grp_nm6")))),
				when(boundOr("itm_grp_flg7"))
					.select(DS0C_ITM_GRP, S0_M8.itm_grp_cd7.as("itm_grp_cd7"), S0_MM27.itm_grp_nm.as("itm_grp_nm7"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM27).on(S0_M8.itm_grp_cd7.eq(S0_MM27.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP7.value()).eq(S0_MM27.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M8.itm_grp_cd7.like(bind("itm_grp_cd7"))).cutoff$and(S0_MM27.itm_grp_nm.like(bind("itm_grp_nm7")))),
				when(boundOr("itm_grp_flg8"))
					.select(DS0C_ITM_GRP, S0_M8.itm_grp_cd8.as("itm_grp_cd8"), S0_MM28.itm_grp_nm.as("itm_grp_nm8"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM28).on(S0_M8.itm_grp_cd8.eq(S0_MM28.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP8.value()).eq(S0_MM28.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M8.itm_grp_cd8.like(bind("itm_grp_cd8"))).cutoff$and(S0_MM28.itm_grp_nm.like(bind("itm_grp_nm8")))),
				when(boundOr("itm_grp_flg9"))
					.select(DS0C_ITM_GRP, S0_M8.itm_grp_cd9.as("itm_grp_cd9"), S0_MM29.itm_grp_nm.as("itm_grp_nm9"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM29).on(S0_M8.itm_grp_cd9.eq(S0_MM29.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP9.value()).eq(S0_MM29.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M8.itm_grp_cd9.like(bind("itm_grp_cd9"))).cutoff$and(S0_MM29.itm_grp_nm.like(bind("itm_grp_nm9")))),
				when(boundOr("itm_grp_flg10"))
					.select(DS0C_ITM_GRP, S0_M8.itm_grp_cd10.as("itm_grp_cd10"), S0_MM210.itm_grp_nm.as("itm_grp_nm10"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM210).on(S0_M8.itm_grp_cd10.eq(S0_MM210.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP10.value()).eq(S0_MM210.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M8.itm_grp_cd10.like(bind("itm_grp_cd10"))).cutoff$and(S0_MM210.itm_grp_nm.like(bind("itm_grp_nm10"))))
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
							r.getStringNE("prsppl_cd")
						))
						.addSelect(m -> toArray(
							m.bp_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("prsppl_nm", m.bp_nm());
					}),
					j -> j
						.add(MAM_WG_R.class, r -> toCondition(
							r.getStringNE("prsppl_wg_cd")
						))
						.addSelect(m -> toArray(
							m.wg_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("prsppl_wg_nm", m.wg_nm());
					}),
					j -> j
						.add(MAM_STR_LN_R.class, r -> toCondition(
							r.getStringNE("prsppl_loc_cd"),
							r.getStringNE("str_ln_cd")
						))
						.addSelect(m -> toArray(
							m.str_ln_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("str_ln_nm", m.str_ln_nm());
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
						.add(MAM_CUR_R.class, r -> toCondition(
							r.getStringNE("trd_cur_cd")
						))
						.addSelect(m -> toArray(
							m.cur_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("trd_cur_nm", m.cur_nm());
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
							r.setStringNE("tax_typ", m.tax_typ());
							r.setBooleanNE("inc_tax_flg", m.inc_tax_flg());
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
							r.getStringNE("xfr_rsn_cd")
						))
						.addSelect(m -> toArray(
							m.acxfr_gi_flg,
							m.biz_rsn_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("xfr_rsn_nm", m.biz_rsn_nm());
							r.setBooleanNE("acxfr_gi_flg", m.acxfr_gi_flg());
					})
				)
			);
	}
	
	/**
	 * -- MSBEL1160_MST_PROV_SCHD_Query_S04
	 */
	static MCQueryPlan MSBEL1160_MST_PROV_SCHD_S04() {
		MST_PROV_SCHD_R S0_T1 = MST_PROV_SCHD_R.create("T1");
		MCTempView S0_T0 = createTempView("T0");
		MST_PURC_RET_SCHD_IO_R S0_TT1 = MST_PURC_RET_SCHD_IO_R.create("TT1");
		MST_PURC_RET_SCHD_D_R S0_TT2 = MST_PURC_RET_SCHD_D_R.create("TT2");
		MSVT_WRK_SNO_R S0_T3 = MSVT_WRK_SNO_R.create("T3");
		MAM_TRD_R S0_M1 = MAM_TRD_R.create("M1");
		MAM_BP_R S0_M2 = MAM_BP_R.create("M2");
		MAVM_RD_LOC_R S0_M3 = MAVM_RD_LOC_R.create("M3");
		MAM_SITE_R S0_M4 = MAM_SITE_R.create("M4");
		MAM_WG_R S0_M5 = MAM_WG_R.create("M5");
		MAM_LG_GRP_R S0_M6 = MAM_LG_GRP_R.create("M6");
		MAM_STR_LN_R S0_M7 = MAM_STR_LN_R.create("M7");
		MAM_ITM_R S0_M8 = MAM_ITM_R.create("M8");
		MAM_ITM_TYP_D_R S0_M9 = MAM_ITM_TYP_D_R.create("M9");
		MAM_SUNDRY_ITM_R S0_M10 = MAM_SUNDRY_ITM_R.create("M10");
		MAM_STK_GD_R S0_M11 = MAM_STK_GD_R.create("M11");
		MAM_CUR_R S0_M12 = MAM_CUR_R.create("M12");
		MAM_TAX_R S0_M13 = MAM_TAX_R.create("M13");
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
		MST_PROV_ACT_R S1_T = MST_PROV_ACT_R.create("T");
		
		MCDynamicSQLID DS0C_ITM_GRP = createDynamicSQLID("DS0C_ITM_GRP");
		MCDynamicSQLID DS0C_PRSPPL_GRP = createDynamicSQLID("DS0C_PRSPPL_GRP");
		
		return createQueryPlan()
			.setQuery(
				sql("MSBEL1160_MST_PROV_SCHD_Query_S04")
					.mainQuery()
					.select(
						S0_T1.prov_schd_no,
						S0_T1.prov_src_schd_typ,
						S0_T1.prov_src_schd_no1,
						S0_T1.prov_src_schd_no2,
						S0_T1.trd_cd,
						S0_T1.trd_ptn_typ,
						S0_T1.xfr_rsn_cd,
						S0_T1.base_unit_cd,
						S0_T1.base_unit_qty.as("schd_qty"),
						S0_T0.pr("base_unit_qty").as("act_qty"),
						S0_T1.accpt_schd_dt,
						nullValue().as("arr_schd_dt"),
						S0_T1.wg_cd.as("prsppl_wg_cd"),
						S0_T1.prsppl_cd,
						S0_T1.prov_typ,
						S0_T1.prov_basis_typ,
						S0_T1.xrate_inpt_flg,
						S0_T1.xrate,
						S0_T1.ptax_xrate_inpt_flg,
						S0_T1.ptax_xrate,
						S0_T1.trd_cur_cd,
						S0_T1.tax_fix_flg,
						S0_T1.tax_cd,
						S0_T1.trd_cur_upri,
						S0_T1.trd_cur_amt,
						S0_T1.trd_cur_tax_amt,
						S0_T1.trd_cur_amt.add(S0_T1.trd_cur_tax_amt).as("trd_cur_inc_tax_amt"),
						S0_T1.wtax_rate,
						S0_T1.wtax_amt,
						S0_T1.intr_rmrks,
						S0_T1.sub_char1,
						S0_T1.sub_char2,
						S0_T1.sub_char3,
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
						S0_TT2.itm_cd,
						S0_TT2.itm_sub1,
						S0_TT2.itm_sub2,
						S0_TT2.itm_sub3,
						coalesce(
							S0_M10.itm_nm,
							S0_M8.itm_nm
						).as("itm_nm"),
						S0_M8.itm_typ,
						S0_M8.itm_typ_d_cd,
						S0_M8.sundry_itm_flg,
						S0_M8.asset_mng_typ,
						S0_TT1.purc_ret_loc_cd.as("prsppl_loc_cd"),
						S0_M3.loc_nm.as("prsppl_loc_nm"),
						S0_TT1.str_ln_cd,
						S0_TT1.lot_no,
						S0_TT1.sublot_no,
						S0_TT1.ver_no,
						S0_TT2.sno1,
						S0_TT2.sno2,
						S0_TT2.sno3,
						S0_TT2.sno4,
						S0_TT1.gd_cd,
						S0_TT1.stk_id_typ,
						nullValue().as("dlv_slip_no"),
						nullValue().as("dlv_slip_d_no"),
						S0_TT1.purc_ret_schd_d_no,
						addDynamicSelect(DS0C_PRSPPL_GRP),
						addDynamicSelect(DS0C_ITM_GRP)
					)
					.from(
						S0_T1
						.leftOuterJoin(
							subQuery()
							.select(
								S1_T.prov_schd_no,
								sum(S1_T.base_unit_qty).as("base_unit_qty")
							)
							.from(S1_T)
							.groupBy(S1_T.prov_schd_no).view(S0_T0)
						).on(
							bracket(
								S0_T1.prov_schd_no.eq(S0_T0.pr(S1_T.prov_schd_no))
							)
						)
						.innerJoin(S0_TT1).on(
							bracket(
								S0_T1.prov_src_schd_no1.eq(S0_TT1.purc_ret_schd_io_no)
							)
						)
						.innerJoin(S0_TT2).on(
							bracket(
								S0_TT1.purc_ret_schd_d_no.eq(S0_TT2.purc_ret_schd_d_no)
							)
						)
						.innerJoin(S0_M3).on(
							bracket(
								S0_TT1.purc_ret_loc_cd.eq(S0_M3.loc_cd)
							)
						)
						.leftOuterJoin(S0_M8).on(
							bracket(
								S0_TT2.itm_cd.eq(S0_M8.itm_cd)
								.and(S0_TT2.itm_sub1.eq(S0_M8.itm_sub1))
								.and(S0_TT2.itm_sub2.eq(S0_M8.itm_sub2))
								.and(S0_TT2.itm_sub3.eq(S0_M8.itm_sub3))
							)
						)
						.leftOuterJoin(S0_M10).on(
							bracket(
								S0_TT2.itm_cd.eq(S0_M10.itm_cd)
								.and(S0_TT2.itm_sub1.eq(S0_M10.itm_sub1))
								.and(S0_TT2.itm_sub2.eq(S0_M10.itm_sub2))
								.and(S0_TT2.itm_sub3.eq(S0_M10.itm_sub3))
								.and(S0_TT2.sno1.eq(S0_M10.sno1))
								.and(S0_TT2.sno2.eq(S0_M10.sno2))
								.and(S0_TT2.sno3.eq(S0_M10.sno3))
								.and(S0_TT2.sno4.eq(S0_M10.sno4))
							)
						)
						.addDynamicView()
						.addDynamicView(DS0C_PRSPPL_GRP)
						.addDynamicView(DS0C_ITM_GRP)
					)
					.where(
						value(0).eq(value(0))
						.and(S0_T1.prov_src_schd_typ.eq(value(MSC_PROV_SRC_SCHD_TYP.RET_DDLV.value())))
						.and(
							S0_T1.trd_ptn_typ.in(
								bind("prov_str"),
								bind("prov_rtn_str")
							)
						)
						.and(
							S0_T1.prov_typ.in(
								bind("ffr_prov_flg_str"),
								bind("onr_prov_flg_str")
							)
						)
						.addDynamicPredicate()
						.cutoff$and(S0_T1.accpt_schd_dt.gte(bind("accpt_schd_dt_fr")))
						.cutoff$and(S0_T1.accpt_schd_dt.lte(bind("accpt_schd_dt_to")))
						.cutoff$and(nullValue().gte(bind("arr_schd_hm_fr")))
						.cutoff$and(nullValue().lte(bind("arr_schd_hm_to")))
						.cutoff$and(S0_T1.trd_cd.like(bind("trd_cd")))
						.cutoff$and(S0_T1.prsppl_cd.like(bind("prsppl_cd")))
						.cutoff$and(S0_TT1.purc_ret_loc_cd.like(bind("prsppl_loc_cd")))
						.cutoff$and(S0_M3.loc_nm.like(bind("prsppl_loc_nm")))
						.cutoff$and(S0_M3.site_cd.like(bind("prsppl_site_cd")))
						.cutoff$and(S0_T1.wg_cd.like(bind("prsppl_wg_cd")))
						.cutoff$and(S0_M3.lg_grp_cd.like(bind("prsppl_lg_grp_cd")))
						.cutoff$and(S0_TT1.str_ln_cd.like(bind("prsppl_str_ln_cd")))
						.cutoff$and(S0_M8.itm_typ.like(bind("itm_typ")))
						.cutoff$and(S0_M8.itm_typ_d_cd.like(bind("itm_typ_d_cd")))
						.cutoff$and(S0_TT2.itm_cd.like(bind("itm_cd")))
						.cutoff$and(S0_TT2.itm_sub1.like(bind("itm_sub1")))
						.cutoff$and(S0_TT2.itm_sub2.like(bind("itm_sub2")))
						.cutoff$and(S0_TT2.itm_sub3.like(bind("itm_sub3")))
						.cutoff$and(
							coalesce(
								S0_M10.itm_nm,
								S0_M8.itm_nm
							).like(bind("itm_nm"))
						)
						.cutoff$and(S0_TT1.ver_no.like(bind("ver_no")))
						.cutoff$and(S0_TT1.lot_no.like(bind("lot_no")))
						.cutoff$and(S0_TT1.sublot_no.like(bind("sublot_no")))
						.cutoff$and(S0_TT2.sno1.like(bind("sno1")))
						.cutoff$and(S0_TT2.sno2.like(bind("sno2")))
						.cutoff$and(S0_TT2.sno3.like(bind("sno3")))
						.cutoff$and(S0_TT2.sno4.like(bind("sno4")))
						.cutoff$and(S0_TT1.gd_cd.like(bind("gd_cd")))
						.cutoff$and(S0_TT1.stk_id_typ.like(bind("stk_id_typ")))
						.cutoff$and(S0_T1.prov_basis_typ.like(bind("prov_basis_typ")))
						.cutoff$and(nullValue().like(bind("dlv_slip_no")))
						.cutoff$and(nullValue().like(bind("dlv_slip_d_no")))
						.cutoff$and(S0_T1.trd_cur_cd.like(bind("trd_cur_cd")))
						.cutoff$and(bind("base_cur_cd").neq(S0_T1.trd_cur_cd))
						.cutoff$and(S0_T1.tax_cd.like(bind("tax_cd")))
						.cutoff$and(S0_T1.prov_src_schd_typ.like(bind("prov_src_schd_typ")))
						.cutoff$and(S0_T1.prov_src_schd_no1.like(bind("prov_src_schd_no1")))
						.cutoff$and(S0_T1.prov_src_schd_no2.like(bind("prov_src_schd_no2")))
						.cutoff$and(S0_T1.prov_schd_no.like(bind("prov_schd_no")))
						.cutoff$and(S0_T1.intr_rmrks.like(bind("intr_rmrks")))
						.cutoff$and(S0_T1.sub_char1.like(bind("sub_char1")))
						.cutoff$and(S0_T1.sub_char2.like(bind("sub_char2")))
						.cutoff$and(S0_T1.sub_char3.like(bind("sub_char3")))
						.addDynamicPredicate(DS0C_PRSPPL_GRP)
						.addDynamicPredicate(DS0C_ITM_GRP)
					)
					.orderBy(
						S0_T1.prov_src_schd_typ.asc(),
						S0_T1.prov_schd_no.asc()
					)
			)
			.setDynamicSQLInfo(
				when(boundOr("wrk_no", "wrk_nm"))
					.view(v -> v.leftOuterJoin(S0_T3).on(bracket(S0_TT2.sno1.eq(S0_T3.sno1))))
					.predicate(p -> p.cutoff$and(S0_T3.wrk_no.like(bind("wrk_no"))).cutoff$and(S0_T3.wrk_nm.like(bind("wrk_nm")))),
				when(boundOr("trd_nm"))
					.view(v -> v.leftOuterJoin(S0_M1).on(bracket(S0_T1.trd_cd.eq(S0_M1.trd_cd))))
					.predicate(p -> p.cutoff$and(S0_M1.trd_nm.like(bind("trd_nm")))),
				when(boundOr("prsppl_grp_flg1", "prsppl_grp_flg2", "prsppl_grp_flg3", "prsppl_grp_flg4", "prsppl_grp_flg5", "prsppl_grp_flg6", "prsppl_grp_flg7", "prsppl_grp_flg8", "prsppl_grp_flg9", "prsppl_grp_flg10", "subcon_flg_str", "prsppl_nm"))
					.view(v -> v.leftOuterJoin(S0_M2).on(bracket(S0_T1.prsppl_cd.eq(S0_M2.bp_cd))))
					.predicate(p -> p.cutoff$and(S0_M2.subcon_flg.eq(bind("subcon_flg_str"))).cutoff$and(S0_M2.bp_nm.like(bind("prsppl_nm")))),
				when(boundOr("prsppl_site_nm"))
					.view(v -> v.leftOuterJoin(S0_M4).on(bracket(S0_M3.site_cd.eq(S0_M4.site_cd))))
					.predicate(p -> p.cutoff$and(S0_M4.site_nm.like(bind("prsppl_site_nm")))),
				when(boundOr("prsppl_wg_nm"))
					.view(v -> v.leftOuterJoin(S0_M5).on(bracket(S0_T1.wg_cd.eq(S0_M5.wg_cd))))
					.predicate(p -> p.cutoff$and(S0_M5.wg_nm.like(bind("prsppl_wg_nm")))),
				when(boundOr("prsppl_lg_grp_nm"))
					.view(v -> v.leftOuterJoin(S0_M6).on(bracket(S0_M3.lg_grp_cd.eq(S0_M6.lg_grp_cd))))
					.predicate(p -> p.cutoff$and(S0_M6.lg_grp_nm.like(bind("prsppl_lg_grp_nm")))),
				when(boundOr("prsppl_str_ln_nm"))
					.view(v -> v.leftOuterJoin(S0_M7).on(bracket(S0_TT1.purc_ret_loc_cd.eq(S0_M7.loc_cd).and(S0_TT1.str_ln_cd.eq(S0_M7.str_ln_cd)))))
					.predicate(p -> p.cutoff$and(S0_M7.str_ln_nm.like(bind("prsppl_str_ln_nm")))),
				when(boundOr("itm_typ_d_nm"))
					.view(v -> v.leftOuterJoin(S0_M9).on(bracket(S0_M8.itm_typ.eq(S0_M9.itm_typ).and(S0_M8.itm_typ_d_cd.eq(S0_M9.itm_typ_d_cd)))))
					.predicate(p -> p.cutoff$and(S0_M9.itm_typ_d_nm.like(bind("itm_typ_d_nm")))),
				when(boundOr("gd_nm"))
					.view(v -> v.leftOuterJoin(S0_M11).on(bracket(S0_TT1.gd_cd.eq(S0_M11.gd_cd))))
					.predicate(p -> p.cutoff$and(S0_M11.gd_nm.like(bind("gd_nm")))),
				when(boundOr("trd_cur_nm"))
					.view(v -> v.leftOuterJoin(S0_M12).on(bracket(S0_T1.trd_cur_cd.eq(S0_M12.cur_cd))))
					.predicate(p -> p.cutoff$and(S0_M12.cur_nm.like(bind("trd_cur_nm")))),
				when(boundOr("tax_nm"))
					.view(v -> v.leftOuterJoin(S0_M13).on(bracket(S0_T1.tax_cd.eq(S0_M13.tax_cd))))
					.predicate(p -> p.cutoff$and(S0_M13.tax_nm.like(bind("tax_nm")))),
				when(boundOr("prsppl_grp_flg1"))
					.select(DS0C_PRSPPL_GRP, S0_M2.bp_grp_cd1.as("prsppl_grp_cd1"), S0_MM11.bp_grp_nm.as("prsppl_grp_nm1"))
					.view(DS0C_PRSPPL_GRP, v -> v.leftOuterJoin(S0_MM11).on(S0_M2.bp_grp_cd1.eq(S0_MM11.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP1.value()).eq(S0_MM11.bp_grp_typ))))
					.predicate(DS0C_PRSPPL_GRP, p -> p.cutoff$and(S0_M2.bp_grp_cd1.like(bind("prsppl_grp_cd1"))).cutoff$and(S0_MM11.bp_grp_nm.like(bind("prsppl_grp_nm1")))),
				when(boundOr("prsppl_grp_flg2"))
					.select(DS0C_PRSPPL_GRP, S0_M2.bp_grp_cd2.as("prsppl_grp_cd2"), S0_MM12.bp_grp_nm.as("prsppl_grp_nm2"))
					.view(DS0C_PRSPPL_GRP, v -> v.leftOuterJoin(S0_MM12).on(S0_M2.bp_grp_cd2.eq(S0_MM12.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP2.value()).eq(S0_MM12.bp_grp_typ))))
					.predicate(DS0C_PRSPPL_GRP, p -> p.cutoff$and(S0_M2.bp_grp_cd2.like(bind("prsppl_grp_cd2"))).cutoff$and(S0_MM12.bp_grp_nm.like(bind("prsppl_grp_nm2")))),
				when(boundOr("prsppl_grp_flg3"))
					.select(DS0C_PRSPPL_GRP, S0_M2.bp_grp_cd3.as("prsppl_grp_cd3"), S0_MM13.bp_grp_nm.as("prsppl_grp_nm3"))
					.view(DS0C_PRSPPL_GRP, v -> v.leftOuterJoin(S0_MM13).on(S0_M2.bp_grp_cd3.eq(S0_MM13.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP3.value()).eq(S0_MM13.bp_grp_typ))))
					.predicate(DS0C_PRSPPL_GRP, p -> p.cutoff$and(S0_M2.bp_grp_cd3.like(bind("prsppl_grp_cd3"))).cutoff$and(S0_MM13.bp_grp_nm.like(bind("prsppl_grp_nm3")))),
				when(boundOr("prsppl_grp_flg4"))
					.select(DS0C_PRSPPL_GRP, S0_M2.bp_grp_cd4.as("prsppl_grp_cd4"), S0_MM14.bp_grp_nm.as("prsppl_grp_nm4"))
					.view(DS0C_PRSPPL_GRP, v -> v.leftOuterJoin(S0_MM14).on(S0_M2.bp_grp_cd4.eq(S0_MM14.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP4.value()).eq(S0_MM14.bp_grp_typ))))
					.predicate(DS0C_PRSPPL_GRP, p -> p.cutoff$and(S0_M2.bp_grp_cd4.like(bind("prsppl_grp_cd4"))).cutoff$and(S0_MM14.bp_grp_nm.like(bind("prsppl_grp_nm4")))),
				when(boundOr("prsppl_grp_flg5"))
					.select(DS0C_PRSPPL_GRP, S0_M2.bp_grp_cd5.as("prsppl_grp_cd5"), S0_MM15.bp_grp_nm.as("prsppl_grp_nm5"))
					.view(DS0C_PRSPPL_GRP, v -> v.leftOuterJoin(S0_MM15).on(S0_M2.bp_grp_cd5.eq(S0_MM15.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP5.value()).eq(S0_MM15.bp_grp_typ))))
					.predicate(DS0C_PRSPPL_GRP, p -> p.cutoff$and(S0_M2.bp_grp_cd5.like(bind("prsppl_grp_cd5"))).cutoff$and(S0_MM15.bp_grp_nm.like(bind("prsppl_grp_nm5")))),
				when(boundOr("prsppl_grp_flg6"))
					.select(DS0C_PRSPPL_GRP, S0_M2.bp_grp_cd6.as("prsppl_grp_cd6"), S0_MM16.bp_grp_nm.as("prsppl_grp_nm6"))
					.view(DS0C_PRSPPL_GRP, v -> v.leftOuterJoin(S0_MM16).on(S0_M2.bp_grp_cd6.eq(S0_MM16.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP6.value()).eq(S0_MM16.bp_grp_typ))))
					.predicate(DS0C_PRSPPL_GRP, p -> p.cutoff$and(S0_M2.bp_grp_cd6.like(bind("prsppl_grp_cd6"))).cutoff$and(S0_MM16.bp_grp_nm.like(bind("prsppl_grp_nm6")))),
				when(boundOr("prsppl_grp_flg7"))
					.select(DS0C_PRSPPL_GRP, S0_M2.bp_grp_cd7.as("prsppl_grp_cd7"), S0_MM17.bp_grp_nm.as("prsppl_grp_nm7"))
					.view(DS0C_PRSPPL_GRP, v -> v.leftOuterJoin(S0_MM17).on(S0_M2.bp_grp_cd7.eq(S0_MM17.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP7.value()).eq(S0_MM17.bp_grp_typ))))
					.predicate(DS0C_PRSPPL_GRP, p -> p.cutoff$and(S0_M2.bp_grp_cd7.like(bind("prsppl_grp_cd7"))).cutoff$and(S0_MM17.bp_grp_nm.like(bind("prsppl_grp_nm7")))),
				when(boundOr("prsppl_grp_flg8"))
					.select(DS0C_PRSPPL_GRP, S0_M2.bp_grp_cd8.as("prsppl_grp_cd8"), S0_MM18.bp_grp_nm.as("prsppl_grp_nm8"))
					.view(DS0C_PRSPPL_GRP, v -> v.leftOuterJoin(S0_MM18).on(S0_M2.bp_grp_cd8.eq(S0_MM18.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP8.value()).eq(S0_MM18.bp_grp_typ))))
					.predicate(DS0C_PRSPPL_GRP, p -> p.cutoff$and(S0_M2.bp_grp_cd8.like(bind("prsppl_grp_cd8"))).cutoff$and(S0_MM18.bp_grp_nm.like(bind("prsppl_grp_nm8")))),
				when(boundOr("prsppl_grp_flg9"))
					.select(DS0C_PRSPPL_GRP, S0_M2.bp_grp_cd9.as("prsppl_grp_cd9"), S0_MM19.bp_grp_nm.as("prsppl_grp_nm9"))
					.view(DS0C_PRSPPL_GRP, v -> v.leftOuterJoin(S0_MM19).on(S0_M2.bp_grp_cd9.eq(S0_MM19.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP9.value()).eq(S0_MM19.bp_grp_typ))))
					.predicate(DS0C_PRSPPL_GRP, p -> p.cutoff$and(S0_M2.bp_grp_cd9.like(bind("prsppl_grp_cd9"))).cutoff$and(S0_MM19.bp_grp_nm.like(bind("prsppl_grp_nm9")))),
				when(boundOr("prsppl_grp_flg10"))
					.select(DS0C_PRSPPL_GRP, S0_M2.bp_grp_cd10.as("prsppl_grp_cd10"), S0_MM110.bp_grp_nm.as("prsppl_grp_nm10"))
					.view(DS0C_PRSPPL_GRP, v -> v.leftOuterJoin(S0_MM110).on(S0_M2.bp_grp_cd10.eq(S0_MM110.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP10.value()).eq(S0_MM110.bp_grp_typ))))
					.predicate(DS0C_PRSPPL_GRP, p -> p.cutoff$and(S0_M2.bp_grp_cd10.like(bind("prsppl_grp_cd10"))).cutoff$and(S0_MM110.bp_grp_nm.like(bind("prsppl_grp_nm10")))),
				when(boundOr("itm_grp_flg1"))
					.select(DS0C_ITM_GRP, S0_M8.itm_grp_cd1.as("itm_grp_cd1"), S0_MM21.itm_grp_nm.as("itm_grp_nm1"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM21).on(S0_M8.itm_grp_cd1.eq(S0_MM21.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP1.value()).eq(S0_MM21.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M8.itm_grp_cd1.like(bind("itm_grp_cd1"))).cutoff$and(S0_MM21.itm_grp_nm.like(bind("itm_grp_nm1")))),
				when(boundOr("itm_grp_flg2"))
					.select(DS0C_ITM_GRP, S0_M8.itm_grp_cd2.as("itm_grp_cd2"), S0_MM22.itm_grp_nm.as("itm_grp_nm2"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM22).on(S0_M8.itm_grp_cd2.eq(S0_MM22.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP2.value()).eq(S0_MM22.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M8.itm_grp_cd2.like(bind("itm_grp_cd2"))).cutoff$and(S0_MM22.itm_grp_nm.like(bind("itm_grp_nm2")))),
				when(boundOr("itm_grp_flg3"))
					.select(DS0C_ITM_GRP, S0_M8.itm_grp_cd3.as("itm_grp_cd3"), S0_MM23.itm_grp_nm.as("itm_grp_nm3"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM23).on(S0_M8.itm_grp_cd3.eq(S0_MM23.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP3.value()).eq(S0_MM23.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M8.itm_grp_cd3.like(bind("itm_grp_cd3"))).cutoff$and(S0_MM23.itm_grp_nm.like(bind("itm_grp_nm3")))),
				when(boundOr("itm_grp_flg4"))
					.select(DS0C_ITM_GRP, S0_M8.itm_grp_cd4.as("itm_grp_cd4"), S0_MM24.itm_grp_nm.as("itm_grp_nm4"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM24).on(S0_M8.itm_grp_cd4.eq(S0_MM24.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP4.value()).eq(S0_MM24.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M8.itm_grp_cd4.like(bind("itm_grp_cd4"))).cutoff$and(S0_MM24.itm_grp_nm.like(bind("itm_grp_nm4")))),
				when(boundOr("itm_grp_flg5"))
					.select(DS0C_ITM_GRP, S0_M8.itm_grp_cd5.as("itm_grp_cd5"), S0_MM25.itm_grp_nm.as("itm_grp_nm5"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM25).on(S0_M8.itm_grp_cd5.eq(S0_MM25.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP5.value()).eq(S0_MM25.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M8.itm_grp_cd5.like(bind("itm_grp_cd5"))).cutoff$and(S0_MM25.itm_grp_nm.like(bind("itm_grp_nm5")))),
				when(boundOr("itm_grp_flg6"))
					.select(DS0C_ITM_GRP, S0_M8.itm_grp_cd6.as("itm_grp_cd6"), S0_MM26.itm_grp_nm.as("itm_grp_nm6"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM26).on(S0_M8.itm_grp_cd6.eq(S0_MM26.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP6.value()).eq(S0_MM26.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M8.itm_grp_cd6.like(bind("itm_grp_cd6"))).cutoff$and(S0_MM26.itm_grp_nm.like(bind("itm_grp_nm6")))),
				when(boundOr("itm_grp_flg7"))
					.select(DS0C_ITM_GRP, S0_M8.itm_grp_cd7.as("itm_grp_cd7"), S0_MM27.itm_grp_nm.as("itm_grp_nm7"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM27).on(S0_M8.itm_grp_cd7.eq(S0_MM27.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP7.value()).eq(S0_MM27.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M8.itm_grp_cd7.like(bind("itm_grp_cd7"))).cutoff$and(S0_MM27.itm_grp_nm.like(bind("itm_grp_nm7")))),
				when(boundOr("itm_grp_flg8"))
					.select(DS0C_ITM_GRP, S0_M8.itm_grp_cd8.as("itm_grp_cd8"), S0_MM28.itm_grp_nm.as("itm_grp_nm8"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM28).on(S0_M8.itm_grp_cd8.eq(S0_MM28.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP8.value()).eq(S0_MM28.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M8.itm_grp_cd8.like(bind("itm_grp_cd8"))).cutoff$and(S0_MM28.itm_grp_nm.like(bind("itm_grp_nm8")))),
				when(boundOr("itm_grp_flg9"))
					.select(DS0C_ITM_GRP, S0_M8.itm_grp_cd9.as("itm_grp_cd9"), S0_MM29.itm_grp_nm.as("itm_grp_nm9"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM29).on(S0_M8.itm_grp_cd9.eq(S0_MM29.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP9.value()).eq(S0_MM29.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M8.itm_grp_cd9.like(bind("itm_grp_cd9"))).cutoff$and(S0_MM29.itm_grp_nm.like(bind("itm_grp_nm9")))),
				when(boundOr("itm_grp_flg10"))
					.select(DS0C_ITM_GRP, S0_M8.itm_grp_cd10.as("itm_grp_cd10"), S0_MM210.itm_grp_nm.as("itm_grp_nm10"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM210).on(S0_M8.itm_grp_cd10.eq(S0_MM210.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP10.value()).eq(S0_MM210.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M8.itm_grp_cd10.like(bind("itm_grp_cd10"))).cutoff$and(S0_MM210.itm_grp_nm.like(bind("itm_grp_nm10"))))
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
							r.getStringNE("prsppl_cd")
						))
						.addSelect(m -> toArray(
							m.bp_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("prsppl_nm", m.bp_nm());
					}),
					j -> j
						.add(MAM_WG_R.class, r -> toCondition(
							r.getStringNE("prsppl_wg_cd")
						))
						.addSelect(m -> toArray(
							m.wg_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("prsppl_wg_nm", m.wg_nm());
					}),
					j -> j
						.add(MAM_STR_LN_R.class, r -> toCondition(
							r.getStringNE("prsppl_loc_cd"),
							r.getStringNE("str_ln_cd")
						))
						.addSelect(m -> toArray(
							m.str_ln_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("str_ln_nm", m.str_ln_nm());
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
						.add(MAM_CUR_R.class, r -> toCondition(
							r.getStringNE("trd_cur_cd")
						))
						.addSelect(m -> toArray(
							m.cur_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("trd_cur_nm", m.cur_nm());
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
							r.setStringNE("tax_typ", m.tax_typ());
							r.setBooleanNE("inc_tax_flg", m.inc_tax_flg());
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
							r.getStringNE("xfr_rsn_cd")
						))
						.addSelect(m -> toArray(
							m.acxfr_gi_flg,
							m.biz_rsn_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("xfr_rsn_nm", m.biz_rsn_nm());
							r.setBooleanNE("acxfr_gi_flg", m.acxfr_gi_flg());
					})
				)
			);
	}
	/**
	 * -- MSBEL1160_MST_PROV_SCHD_Query_S05
	 */
	static MCQueryPlan MSBEL1160_MST_PROV_SCHD_S05() {
		MST_PROV_ACT_R T1 = MST_PROV_ACT_R.create("T1");
		MST_ARR_ACT_R T2 = MST_ARR_ACT_R.create("T2");
		MST_ARR_SCHD_R T3 = MST_ARR_SCHD_R.create("T3");
		MST_ARR_PR_R T4 = MST_ARR_PR_R.create("T4");
		MST_SHIP_ACT_D_R T5 = MST_SHIP_ACT_D_R.create("T5");
		MST_SHIP_ALLOC_STS_R T6 = MST_SHIP_ALLOC_STS_R.create("T6");
		MST_PROV_SCHD_R T7 = MST_PROV_SCHD_R.create("T7");
		return createQueryPlan()
				.setQuery(
					sql("MSBEL1160_MST_PROV_SCHD_Query_S05")
						.mainQuery()
						.select(
							T1.prov_act_no,
							max(T7.ptax_xrate_inpt_flg).as("ptax_xrate_inpt_flg"),
							max(T7.tax_fix_flg).as("tax_fix_flg"),
							max(T7.xrate_inpt_flg).as("xrate_inpt_flg")
							)
						.from(
							T1
							.innerJoin(T2).on(
									bracket(
										T1.prov_src_act_no.eq(T2.arr_act_no)
									)
								)
							.innerJoin(T3).on(
								bracket(
									T2.arr_schd_no.eq(T3.arr_schd_no)
									)
								)
							.innerJoin(T4).on(
								bracket(
									T3.arr_pr_no.eq(T4.arr_pr_no)
									)
								)
							.innerJoin(T5).on(
									bracket(
										T4.dlv_slip_d_no.eq(T5.dlv_slip_d_no)
										.and(T5.can_flg.eq(value(false)))
									)
								)
							.innerJoin(T6).on(
									bracket(
										T5.ship_alloc_sts_no.eq(T6.ship_alloc_sts_no)
									)
								)
							.innerJoin(T7).on(
									bracket(
										T6.ship_schd_no.eq(T7.prov_src_schd_no1)
										.and(T7.prov_src_schd_typ.eq(value(MSC_PROV_SRC_SCHD_TYP.SHIP.value())))
									)
								)
							)
						.where(value(0).eq(value(0))
								.and(T1.prov_act_no.eq(bind("prov_act_no")))
								)
						.groupBy(T1.prov_act_no)
			);
	}
	/**
	 * -- MSBEL1160_MST_DLV_SLIP_Query_S01
	 */
	static MCQueryPlan MSBEL1160_MST_DLV_SLIP_S01() {
		MST_DLV_SLIP_R S0_DLVSLIP = MST_DLV_SLIP_R.create("DLVSLIP");
		MST_SHIP_ACT_R S0_SHIPACT = MST_SHIP_ACT_R.create("SHIPACT");
		MCTempView S0_T0 = createTempView("T0");
		MST_IV_SHIP_ACT_MAP_R S1_IVSHIPACTMAP = MST_IV_SHIP_ACT_MAP_R.create("IVSHIPACTMAP");
		MST_IV_D_R S1_IVD = MST_IV_D_R.create("IVD");
		MST_IV_R S1_IV = MST_IV_R.create("IV");
		MST_SHIP_ACT_D_R S1_SHIPACTD = MST_SHIP_ACT_D_R.create("SHIPACTD");
		MST_SHIP_ACT_R S1_SHIPACT = MST_SHIP_ACT_R.create("SHIPACT");
		
		return createQueryPlan()
			.setQuery(
				sql("MSBEL1160_MST_DLV_SLIP_Query_S01")
					.mainQuery()
					.select(
						S0_DLVSLIP.dlv_slip_no,
						nvl(S0_SHIPACT.iv_no, S0_T0.pr(S1_IV.iv_no)).as("iv_no")
					)
					.from(
						S0_DLVSLIP
						.leftOuterJoin(S0_SHIPACT).on(
							bracket(
								S0_DLVSLIP.dlv_slip_act_no.eq(S0_SHIPACT.ship_act_no)
								.and(S0_SHIPACT.via_dlv_typ.eq(value(MAC_VIA_DLV_TYP.NOT_VIA.value())))
							)
						)
						.leftOuterJoin(
							subQuery()
							.select(
								S1_SHIPACTD.dlv_slip_no,
								S1_IV.iv_no
							)
							.from(
								S1_IV
								.innerJoin(S1_IVD).on(
									bracket(
										S1_IV.iv_mng_no.eq(S1_IVD.iv_mng_no)
									)
								)
								.innerJoin(S1_IVSHIPACTMAP).on(
									bracket(
										S1_IVD.iv_d_no.eq(S1_IVSHIPACTMAP.iv_d_no)
									)
								)
								.innerJoin(S1_SHIPACTD).on(
									bracket(
										S1_IVSHIPACTMAP.ship_act_d_no.eq(S1_SHIPACTD.ship_act_d_no)
									)
								)
								.innerJoin(S1_SHIPACT).on(
									bracket(
										S1_SHIPACTD.ship_act_no.eq(S1_SHIPACT.ship_act_no)
										.and(S1_SHIPACT.via_dlv_typ.eq(value(MAC_VIA_DLV_TYP.VIA.value())))
									)
								)
							)
							.view(S0_T0)
						).on(
							value(0).eq(value(0))
							.and(S0_T0.pr(S1_SHIPACTD.dlv_slip_no).eq(S0_DLVSLIP.dlv_slip_no))
						)
					)
					.where(
						value(0).eq(value(0))
						.and(S0_DLVSLIP.dlv_slip_no.eq(bind("dlv_slip_no")).and(S0_DLVSLIP.slip_sts_typ.eq(value(MAC_SLIP_STS_TYP.CRT.value()))))
					)
			);
	}
}