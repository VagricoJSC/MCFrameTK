package mcframe.serverMSBB.MSBBL1320;

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
	 * -- MSBBL1320_MST_ARR_ACT_Query_S01
	 */
	static MCQueryPlan MSBBL1320_MST_ARR_ACT_S01() {
		MST_ARR_ACT_R S0_ARRA = MST_ARR_ACT_R.create("ARRA");
		MST_PURC_ACT_IO_R S0_PURCAI = MST_PURC_ACT_IO_R.create("PURCAI");
		MST_PURC_ACT_D_R S0_PURCAD = MST_PURC_ACT_D_R.create("PURCAD");
		MST_PURC_ACT_R S0_PURCA = MST_PURC_ACT_R.create("PURCA");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBBL1320_MST_ARR_ACT_Query_S01")
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
	 * -- MSBBL1320_MST_PO_D_Query_S01
	 */
	static MCQueryPlan MSBBL1320_MST_PO_D_S01() {
		MST_SLS_SCHD_R S0_T1 = MST_SLS_SCHD_R.create("T1");
		MST_PURC_ACT_D_R S0_PURCD = MST_PURC_ACT_D_R.create("PURCD");
		MST_PO_D_R S0_T2 = MST_PO_D_R.create("T2");
		MST_PO_R S0_PO = MST_PO_R.create("PO");
		MAM_BP_R S0_SPPL = MAM_BP_R.create("SPPL");
		MAM_ITM_R S0_ITM = MAM_ITM_R.create("ITM");
		MAM_ITM_LCL_R S0_ITMLCL = MAM_ITM_LCL_R.create("ITMLCL");
		MAM_TAX_R S0_TAX = MAM_TAX_R.create("TAX");
		MST_PURC_SCHD_R S0_T3 = MST_PURC_SCHD_R.create("T3");
		MST_SLO_D_R S0_T4 = MST_SLO_D_R.create("T4");
		MST_ARR_SCHD_R S0_T5 = MST_ARR_SCHD_R.create("T5");
		MST_SHIP_PR_R S0_T6 = MST_SHIP_PR_R.create("T6");
		MST_ARR_PR_R S0_T7 = MST_ARR_PR_R.create("T7");
		MST_RCPT_IV_D_R S0_T8 = MST_RCPT_IV_D_R.create("T8");
		MSW_SLS_SCHD_KEY_R S0_W = MSW_SLS_SCHD_KEY_R.create("W");
		MST_PURC_ACT_D_R S1_W1 = MST_PURC_ACT_D_R.create("W1");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBBL1320_MST_PO_D_Query_S01")
					.mainQuery()
					.select(
						S0_T1.sls_schd_no,
						S0_T2.po_d_no,
						S0_T1.purc_schd_no,
						S0_T3.arr_schd_no,
						S0_T5.mfg_inst_no,
						S0_T2.itm_cd,
						S0_T2.itm_sub1,
						S0_T2.itm_sub2,
						S0_T2.itm_sub3,
						nvl(
							S0_T2.itm_nm,
							S0_ITM.itm_nm
						).as("itm_nm"),
						nvl(
							S0_T2.iv_itm_nm,
							S0_ITMLCL.itm_nm
						).as("iv_itm_nm"),
						S0_T2.sppl_itm_cd,
						S0_T2.sppl_itm_nm,
						S0_T2.sundry_itm_flg,
						S0_T2.base_unit_cd,
						S0_T8.upri_not_tgt_flg,
						nvl(
							S0_T8.interim_flg,
							S0_T2.interim_flg
						).as("interim_flg"),
						coalesce(
							S0_T8.trd_cur_upri,
							S0_PURCD.trd_cur_upri,
							S0_T2.trd_cur_upri
						).as("trd_cur_upri"),
						coalesce(
							S0_T8.trd_cur_amt,
							S0_PURCD.trd_cur_amt,
							S0_T2.trd_cur_amt
						).as("trd_cur_amt"),
						coalesce(
							S0_T8.trd_cur_tax_amt,
							S0_PURCD.trd_cur_tax_amt,
							S0_T2.trd_cur_tax_amt
						).as("trd_cur_tax_amt"),
						S0_PURCD.trd_cur_dscnt_amt
						.as("purc_trd_cur_dscnt_amt"),
						nvl(
							S0_T8.trd_cur_proc_upri,
							S0_PURCD.trd_cur_proc_upri
						).as("trd_cur_proc_upri"),
						nvl(
							S0_T8.trd_cur_onr_prov_upri,
							S0_PURCD.trd_cur_onr_prov_upri
						).as("trd_cur_onr_prov_upri"),
						nvl(
							S0_T8.trd_cur_proc_amt,
							S0_PURCD.trd_cur_proc_amt
						).as("trd_cur_proc_amt"),
						nvl(
							S0_T8.trd_cur_onr_prov_amt,
							S0_PURCD.trd_cur_onr_prov_amt
						).as("trd_cur_onr_prov_amt"),
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
								S0_T8.dscnt_rsn_cd,
								S0_T2.dscnt_rsn_cd
							)
						).as("dscnt_rsn_cd"),
						cases()
							.when(S0_PURCD.tax_cd.isNotNull())
								.then(S0_PURCD.tax_cd)
							.when(S0_T8.tax_cd.isNotNull())
								.then(
									decode(
										S0_T8.tax_fix_flg,
										value(true),
										S0_T8.tax_cd,
										MAPA_TAX$F_GET_PURC_TAX_CD(
											S0_T8.itm_cd,
											S0_T8.itm_sub1,
											S0_T8.itm_sub2,
											S0_T8.itm_sub3,
											S0_PO.sppl_cd,
											bind("today")
										)
									)
								)
							.otherwise(
								decode(
									S0_T2.tax_fix_flg,
									value(true),
									S0_T2.tax_cd,
									MAPA_TAX$F_GET_PURC_TAX_CD(
										S0_T2.itm_cd,
										S0_T2.itm_sub1,
										S0_T2.itm_sub2,
										S0_T2.itm_sub3,
										S0_PO.sppl_cd,
										bind("today")
									)
								)
						).as("tax_cd"),
						nvl(
							S0_T8.wtax_rate,
							S0_T2.wtax_rate
						).as("wtax_rate"),
						S0_T2.maker_cd,
						S0_T2.ap_dpt_cd,
						S0_T2.pay_crryovr_times,
						S0_T2.bd_itm_cd,
						S0_T2.bd_itm_sub1,
						S0_T2.bd_itm_sub2,
						S0_T2.bd_itm_sub3,
						S0_T2.bd_sno1,
						S0_T2.bd_sno2,
						S0_T2.bd_sno3,
						S0_T2.bd_sno4,
						S0_T2.bd_lot_no,
						S0_T2.bd_sublot_no,
						S0_T2.bd_ctg_cd,
						S0_T2.bd_oper_cd,
						S0_T2.bd_iv_no,
						S0_T2.bd_loc_cd,
						S0_T2.bd_po_no,
						S0_T2.bd_slo_no,
						S0_ITM.stk_mng_typ,
						S0_ITM.asset_mng_typ,
						decode(
							S0_PURCD.sync_flg,
							value(true),
							S0_PURCD.rsn_cd,
							nvl(
								S0_T8.purc_rsn_cd,
								S0_T2.purc_rsn_cd
							)
						).as("rsn_cd"),
						S0_T2.bd_dpt_cd,
						S0_T2.trd_d_rmrks,
						S0_T4.gd_cd,
						S0_T2.sno1,
						S0_T2.sno2,
						S0_T2.sno3,
						S0_T2.sno4,
						S0_T5.arr_loc_cd.as("dlv_loc_cd"),
						S0_T5.str_ln_cd,
						S0_T5.quality_typ,
						S0_T5.stk_insp_typ,
						S0_T5.stk_id_typ,
						S0_T5.stk_bp_cd,
						S0_T2.bp_lot_no,
						nvl(
							S0_T8.trd_cur_dscnt_amt,
							S0_T2.trd_cur_dscnt_amt
						).as("trd_cur_dscnt_amt"),
						S0_T2.base_unit_qty.as("po_base_unit_qty"),
						S0_SPPL.purc_amt_rnd_typ,
						S0_TAX.inc_tax_flg,
						S0_TAX.tax_rate,
						S0_SPPL.purc_tax_rnd_typ,
						S0_T6.loc_cd.as("ship_pr_loc_cd"),
						S0_T6.str_ln_cd.as("ship_pr_str_ln_cd"),
						S0_T8.rcpt_iv_d_no
					)
					.from(
						S0_T1
						.leftOuterJoin(S0_PURCD).on(
							bracket(
								S0_PURCD.purc_act_d_no.eq(S0_T1.purc_act_d_no)
								.and(
									S0_PURCD.purc_act_d_seq.eq(subQuery()
										.select(max(S1_W1.purc_act_d_seq))
										.from(S1_W1)
										.where(
											S1_W1.purc_act_d_no.eq(S0_T1.purc_act_d_no)
										)
									)
								)
							)
						)
						.innerJoin(S0_T2).on(
							S0_T2.slo_d_no.eq(S0_T1.slo_d_no)
							.and(S0_T2.po_schd_no.eq(S0_T1.po_schd_no))
						)
						.leftOuterJoin(S0_PO).on(
							bracket(
								S0_T2.po_no.eq(S0_PO.po_no)
							)
						)
						.leftOuterJoin(S0_SPPL).on(
							bracket(
								S0_PO.sppl_cd.eq(S0_SPPL.bp_cd)
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
						.leftOuterJoin(S0_ITMLCL).on(
							bracket(
								S0_T2.itm_cd.eq(S0_ITMLCL.itm_cd)
								.and(S0_T2.itm_sub1.eq(S0_ITMLCL.itm_sub1))
								.and(S0_T2.itm_sub2.eq(S0_ITMLCL.itm_sub2))
								.and(S0_T2.itm_sub3.eq(S0_ITMLCL.itm_sub3))
								.and(S0_SPPL.prnt_lcl_cd.eq(S0_ITMLCL.lcl_cd))
							)
						)
						.leftOuterJoin(S0_TAX).on(
							bracket(
								decode(
									S0_T2.tax_fix_flg,
									value(true),
									S0_T2.tax_cd,
									MAPA_TAX$F_GET_PURC_TAX_CD(
										S0_T2.itm_cd,
										S0_T2.itm_sub1,
										S0_T2.itm_sub2,
										S0_T2.itm_sub3,
										S0_PO.sppl_cd,
										bind("today")
									)
								).eq(S0_TAX.tax_cd)
							)
						)
						.innerJoin(S0_T3).on(S0_T3.purc_schd_no.eq(S0_T1.purc_schd_no))
						.innerJoin(S0_T4).on(S0_T1.slo_d_no.eq(S0_T4.slo_d_no))
						.innerJoin(S0_T5).on(S0_T3.arr_schd_no.eq(S0_T5.arr_schd_no))
						.innerJoin(S0_T6).on(S0_T6.slo_d_no.eq(S0_T1.slo_d_no))
						.innerJoin(S0_T7).on(
							S0_T2.po_d_no.eq(S0_T7.po_d_no)
							.and(S0_T5.arr_pr_no.eq(S0_T7.arr_pr_no))
						)
						.leftOuterJoin(S0_T8).on(
							S0_T1.purc_schd_no.eq(S0_T8.purc_schd_no)
						)
						.innerJoin(S0_W).on(S0_T1.sls_schd_no.eq(S0_W.sls_schd_no))
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
	 * -- MSBBL1320_MST_SHIP_PR_Query_S01
	 */
	static MCQueryPlan MSBBL1320_MST_SHIP_PR_S01() {
		MST_SHIP_PR_R S0_T = MST_SHIP_PR_R.create("T");
		MSW_SLO_D_KEY_R S0_W = MSW_SLO_D_KEY_R.create("W");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBBL1320_MST_SHIP_PR_Query_S01")
					.mainQuery()
					.select(
						S0_T.ship_pr_no,
						S0_T.slo_d_no,
						S0_T.upd_cntr
					)
					.from(
						S0_T
						.innerJoin(S0_W).on(S0_T.slo_d_no.eq(S0_W.slo_d_no))
					)
					.orderBy(S0_T.ship_pr_no.asc())
					.forUpdate(S0_T.ship_pr_no)
			);
	}
	
	/**
	 * -- MSBBL1320_MST_SLS_ACT_D_Query_S02
	 */
	static MCQueryPlan MSBBL1320_MST_SLS_ACT_D_S02() {
		MST_SLS_ACT_D_R S0_T1 = MST_SLS_ACT_D_R.create("T1");
		MST_PURC_ACT_D_R S0_T2 = MST_PURC_ACT_D_R.create("T2");
		MST_PURC_ACT_IO_R S0_T3 = MST_PURC_ACT_IO_R.create("T3");
		MST_PURC_ACT_R S0_T4 = MST_PURC_ACT_R.create("T4");
		MST_SLS_ACT_R S1_W = MST_SLS_ACT_R.create("W");
		MST_PURC_ACT_R S2_W = MST_PURC_ACT_R.create("W");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBBL1320_MST_SLS_ACT_D_Query_S02")
					.mainQuery()
					.select(
						S0_T1.purc_act_no,
						S0_T1.purc_act_d_no,
						S0_T2.purc_act_seq,
						S0_T2.purc_act_d_seq,
						S0_T3.purc_act_io_no,
						S0_T3.purc_act_io_seq,
						S0_T2.purc_schd_no,
						S0_T4.trd_ptn_typ,
						S0_T4.trd_cd
					)
					.from(
						S0_T1
						.innerJoin(S0_T2).on(
							S0_T2.purc_act_no.eq(S0_T1.purc_act_no)
							.and(S0_T2.purc_act_d_no.eq(S0_T1.purc_act_d_no))
						)
						.innerJoin(S0_T3).on(
							S0_T3.purc_act_d_no.eq(S0_T2.purc_act_d_no)
							.and(S0_T3.purc_act_d_seq.eq(S0_T2.purc_act_d_seq))
						)
						.innerJoin(S0_T4).on(
							S0_T4.purc_act_no.eq(S0_T2.purc_act_no)
							.and(S0_T4.purc_act_seq.eq(S0_T2.purc_act_seq))
						)
					)
					.where(
						S0_T1.sls_act_d_no.eq(bind("sls_act_d_no"))
						.and(
							S0_T1.sls_act_seq.eq(subQuery()
								.select(max(S1_W.sls_act_seq))
								.from(S1_W)
								.where(
									S1_W.sls_act_no.eq(S0_T1.sls_act_no)
									.and(S1_W.slip_sts_typ.eq(value(MAC_SLIP_STS_TYP.CRT.value())))
								)
							)
						)
						.and(
							S0_T2.purc_act_seq.eq(subQuery()
								.select(max(S2_W.purc_act_seq))
								.from(S2_W)
								.where(
									S2_W.purc_act_no.eq(S0_T1.purc_act_no)
									.and(S2_W.slip_sts_typ.eq(value(MAC_SLIP_STS_TYP.CRT.value())))
								)
							)
						)
					)
			);
	}
	
	/**
	 * -- MSBBL1320_MST_SLS_ACT_D_Query_S03
	 */
	static MCQueryPlan MSBBL1320_MST_SLS_ACT_D_S03() {
		MST_SLS_ACT_D_R S0_T1 = MST_SLS_ACT_D_R.create("T1");
		MST_PURC_ACT_D_R S0_T2 = MST_PURC_ACT_D_R.create("T2");
		MST_PURC_ACT_R S0_T3 = MST_PURC_ACT_R.create("T3");
		MST_SLS_ACT_R S0_T4 = MST_SLS_ACT_R.create("T4");
		MST_SLS_ACT_R S1_W = MST_SLS_ACT_R.create("W");
		MST_PURC_ACT_R S2_W = MST_PURC_ACT_R.create("W");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBBL1320_MST_SLS_ACT_D_Query_S03")
					.mainQuery()
					.select(
						S0_T1.purc_act_no,
						S0_T1.purc_act_d_no,
						S0_T2.purc_act_seq,
						S0_T2.purc_act_d_seq,
						S0_T2.purc_schd_no,
						S0_T3.trd_ptn_typ,
						S0_T3.trd_cd,
						S0_T4.trd_cur_cd
					)
					.from(
						S0_T1
						.innerJoin(S0_T2).on(
							S0_T2.purc_act_no.eq(S0_T1.purc_act_no)
							.and(S0_T2.purc_act_d_no.eq(S0_T1.purc_act_d_no))
						)
						.innerJoin(S0_T3).on(
							S0_T3.purc_act_no.eq(S0_T2.purc_act_no)
							.and(S0_T3.purc_act_seq.eq(S0_T2.purc_act_seq))
						)
						.innerJoin(S0_T4).on(
							S0_T4.sls_act_no.eq(S0_T1.sls_act_no)
							.and(S0_T4.sls_act_seq.eq(S0_T1.sls_act_seq))
						)
					)
					.where(
						S0_T1.sls_act_d_no.eq(bind("sls_act_d_no"))
						.and(
							S0_T1.sls_act_seq.eq(subQuery()
								.select(max(S1_W.sls_act_seq))
								.from(S1_W)
								.where(
									S1_W.sls_act_no.eq(S0_T1.sls_act_no)
									.and(S1_W.slip_sts_typ.eq(value(MAC_SLIP_STS_TYP.CRT.value())))
								)
							)
						)
						.and(
							S0_T2.purc_act_seq.eq(subQuery()
								.select(max(S2_W.purc_act_seq))
								.from(S2_W)
								.where(
									S2_W.purc_act_no.eq(S0_T1.purc_act_no)
									.and(S2_W.slip_sts_typ.eq(value(MAC_SLIP_STS_TYP.CRT.value())))
								)
							)
						)
					)
			);
	}
	
	/**
	 * -- MSBBL1320_MST_SLS_ACT_D_Query_S04
	 */
	static MCQueryPlan MSBBL1320_MST_SLS_ACT_D_S04() {
		MCTempView S0_V1 = createTempView("V1");
		MAM_BP_R S0_CST = MAM_BP_R.create("CST");
		MAM_BP_R S0_SPPL = MAM_BP_R.create("SPPL");
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
		MAM_BP_GRP_R S0_SPPL_GRP1 = MAM_BP_GRP_R.create("SPPL_GRP1");
		MAM_BP_GRP_R S0_SPPL_GRP2 = MAM_BP_GRP_R.create("SPPL_GRP2");
		MAM_BP_GRP_R S0_SPPL_GRP3 = MAM_BP_GRP_R.create("SPPL_GRP3");
		MAM_BP_GRP_R S0_SPPL_GRP4 = MAM_BP_GRP_R.create("SPPL_GRP4");
		MAM_BP_GRP_R S0_SPPL_GRP5 = MAM_BP_GRP_R.create("SPPL_GRP5");
		MAM_BP_GRP_R S0_SPPL_GRP6 = MAM_BP_GRP_R.create("SPPL_GRP6");
		MAM_BP_GRP_R S0_SPPL_GRP7 = MAM_BP_GRP_R.create("SPPL_GRP7");
		MAM_BP_GRP_R S0_SPPL_GRP8 = MAM_BP_GRP_R.create("SPPL_GRP8");
		MAM_BP_GRP_R S0_SPPL_GRP9 = MAM_BP_GRP_R.create("SPPL_GRP9");
		MAM_BP_GRP_R S0_SPPL_GRP10 = MAM_BP_GRP_R.create("SPPL_GRP10");
		MAM_TRD_R S0_TRD = MAM_TRD_R.create("TRD");
		MAM_USR_R S0_SLS_USR = MAM_USR_R.create("SLS_USR");
		MAM_DPT_R S0_SLS_DPT = MAM_DPT_R.create("SLS_DPT");
		MAM_WG_R S0_SLS_DPT_WG = MAM_WG_R.create("SLS_DPT_WG");
		MAM_LG_GRP_R S0_SHIP_LG_GRP = MAM_LG_GRP_R.create("SHIP_LG_GRP");
		MAM_BP_R S0_ACST = MAM_BP_R.create("ACST");
		MAM_BP_GRP_R S0_ACST_GRP1 = MAM_BP_GRP_R.create("ACST_GRP1");
		MAM_BP_GRP_R S0_ACST_GRP2 = MAM_BP_GRP_R.create("ACST_GRP2");
		MAM_BP_GRP_R S0_ACST_GRP3 = MAM_BP_GRP_R.create("ACST_GRP3");
		MAM_BP_GRP_R S0_ACST_GRP4 = MAM_BP_GRP_R.create("ACST_GRP4");
		MAM_BP_GRP_R S0_ACST_GRP5 = MAM_BP_GRP_R.create("ACST_GRP5");
		MAM_BP_GRP_R S0_ACST_GRP6 = MAM_BP_GRP_R.create("ACST_GRP6");
		MAM_BP_GRP_R S0_ACST_GRP7 = MAM_BP_GRP_R.create("ACST_GRP7");
		MAM_BP_GRP_R S0_ACST_GRP8 = MAM_BP_GRP_R.create("ACST_GRP8");
		MAM_BP_GRP_R S0_ACST_GRP9 = MAM_BP_GRP_R.create("ACST_GRP9");
		MAM_BP_GRP_R S0_ACST_GRP10 = MAM_BP_GRP_R.create("ACST_GRP10");
		MAM_BP_R S0_DLV = MAM_BP_R.create("DLV");
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
		MAVM_BP_NM_R S0_DEST1 = MAVM_BP_NM_R.create("DEST1");
		MAVM_BP_NM_R S0_DEST2 = MAVM_BP_NM_R.create("DEST2");
		MAVM_BP_NM_R S0_DEST3 = MAVM_BP_NM_R.create("DEST3");
		MAM_ITM_R S0_ITM = MAM_ITM_R.create("ITM");
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
		MSVT_WRK_SNO_R S0_WRK_SNO = MSVT_WRK_SNO_R.create("WRK_SNO");
		MAM_ITM_TYP_D_R S0_ITM_TYP_D = MAM_ITM_TYP_D_R.create("ITM_TYP_D");
		MAM_EXT_SYS_R S0_EXT = MAM_EXT_SYS_R.create("EXT");
		MST_SLS_ACT_R S1_T1 = MST_SLS_ACT_R.create("T1");
		MST_SLS_ACT_D_R S1_T2 = MST_SLS_ACT_D_R.create("T2");
		MST_SLS_SCHD_R S1_T3 = MST_SLS_SCHD_R.create("T3");
		MST_PO_R S1_T4 = MST_PO_R.create("T4");
		MST_DLV_SLIP_R S1_T5 = MST_DLV_SLIP_R.create("T5");
		MST_SLO_D_R S1_T6 = MST_SLO_D_R.create("T6");
		MST_QTN_D_R S1_T7 = MST_QTN_D_R.create("T7");
		MST_IV_D_R S1_IVD = MST_IV_D_R.create("IVD");
		MST_IV_R S1_IV = MST_IV_R.create("IV");
		MST_DLV_SLIP_D_R S1_SLIPD = MST_DLV_SLIP_D_R.create("SLIPD");
		MST_PURC_ACT_R S1_PURC = MST_PURC_ACT_R.create("PURC");
		MST_PURC_ACT_D_R S1_PURCD = MST_PURC_ACT_D_R.create("PURCD");
		MST_PURC_SCHD_R S1_PURCSCHD = MST_PURC_SCHD_R.create("PURCSCHD");
		MST_ARR_SCHD_R S1_ARRSCHD = MST_ARR_SCHD_R.create("ARRSCHD");
		MST_PURC_DLV_SLIP_D_R S1_PURCDLVSLIP = MST_PURC_DLV_SLIP_D_R.create("PURCDLVSLIP");
		MAVM_RD_DPT_R S1_DAC = MAVM_RD_DPT_R.create("DAC");
		MST_SLS_ACT_IO_R S2_T = MST_SLS_ACT_IO_R.create("T");
		MST_SLS_SCHD_R S3_W = MST_SLS_SCHD_R.create("W");
		MST_SLS_ACT_D_R S4_TT1 = MST_SLS_ACT_D_R.create("TT1");
		MST_DLV_SLIP_D_R S5_W = MST_DLV_SLIP_D_R.create("W");
		MST_SHIP_ACT_D_R S5_W2 = MST_SHIP_ACT_D_R.create("W2");
		
		MCDynamicSQLID DS0D = createDynamicSQLID("DS0D");
		
		return createQueryPlan()
			.setQuery(
				sql("MSBBL1320_MST_SLS_ACT_D_Query_S04")
					.mainQuery()
					.select(
						S0_V1.prAll(),
						S0_CST.bp_nm.as("cst_nm"),
						S0_CST.cst_iv_flg,
						S0_CST.sls_amt_rnd_typ,
						S0_CST.sls_upri_rnd_typ,
						S0_CST.sls_tax_rnd_typ,
						S0_CST.sls_upri_cng_flg.as("bp_sls_upri_cng_flg"),
						S0_CST.ar_dpt_typ,
						S0_SPPL.bp_nm.as("sppl_nm"),
						S0_EXT.ext_sys_nm,
						addDynamicSelect(DS0D)
					)
					.from(
						subQuery()
						.select(
							S1_T3.abort_flg,
							S1_T3.sls_schd_dt,
							S1_T3.purc_schd_no,
							S1_T1.sls_dt,
							S1_T1.ac_dt,
							S1_T1.bill_basis_dt,
							S1_T1.rcv_schd_dt,
							trunc(
								S1_T1.ship_tm,
								MCDateFmt.DD
							).as("ship_dt"),
							S1_T1.ship_tm.as("ship_hm"),
							trunc(
								S1_T1.dlv_tm,
								MCDateFmt.DD
							).as("dlv_dt"),
							S1_T1.dlv_tm.as("dlv_hm"),
							S1_T1.trd_cd,
							S1_T1.trd_ptn_typ,
							S1_T1.sls_basis_typ,
							S1_T1.cst_cd,
							S1_T1.sls_usr_cd,
							S1_T1.sls_dpt_cd,
							S1_T1.wg_cd,
							S1_T1.trd_cur_cd,
							decode(
								S1_T3.iv_no,
								nullValue(),
								nullValue(),
								S1_IV.xrate_inpt_flg
							).as("xrate_inpt_flg"),
							S1_T1.xrate,
							S1_T1.xrate_cd,
							S1_T1.base_cur_cd,
							S1_T1.ptax_cur_cd,
							decode(
								S1_T3.iv_no,
								nullValue(),
								nullValue(),
								S1_IV.ptax_xrate_inpt_flg
							).as("ptax_xrate_inpt_flg"),
							S1_T1.ptax_xrate,
							S1_T1.cst_po_no,
							S1_T1.dlv_slip_no,
							S1_T2.dlv_slip_d_no,
							S1_T1.ship_dlv_slip_no,
							S1_T2.ship_dlv_slip_d_no,
							S1_T2.ship_dlv_slip_multi_flg,
							S1_PURCDLVSLIP.purc_ddlv_dlv_slip_no,
							S1_PURCDLVSLIP.purc_ddlv_dlv_slip_d_no,
							S1_T1.iv_no,
							S1_T2.iv_d_no,
							S1_T1.ship_act_no,
							MAPA_DT$F_GET_AC_YM1(S1_T5.ac_dt).as("dlv_ac_ym"),
							S1_T5.ac_dt.as("dlv_ac_dt"),
							S1_T1.sls_act_no,
							S1_T1.sls_act_rev,
							S1_T1.sls_act_seq,
							S1_T1.ac_ym.as("sls_basis_ym"),
							S1_T1.ac_dt.as("sls_basis_dt"),
							S1_T2.slo_no,
							S1_T2.slo_d_no,
							S1_T2.qtn_no,
							S1_T2.qtn_rev,
							S1_T2.qtn_d_no,
							S1_T2.purc_ddlv_po_no.as("po_no"),
							S1_T4.sppl_cd,
							S1_T1.ship_lg_grp_cd,
							S1_T1.acst_cd,
							S1_T1.ar_dpt_cd,
							S1_T1.trd_rmrks,
							S1_T1.intr_rmrks,
							S1_T1.sub_char1,
							S1_T1.sub_char2,
							S1_T1.sub_char3,
							S1_T2.sls_act_d_no,
							S1_T2.sls_act_d_seq,
							S1_T2.disp_seq,
							S1_T2.sls_schd_no,
							S1_T2.dlv_cd,
							S1_T2.dlv_nm,
							S1_T2.dlv_sundry_flg,
							S1_T2.dlv_zip_cd,
							S1_T2.dlv_addr1,
							S1_T2.dlv_addr2,
							S1_T2.dlv_addr3,
							S1_T2.dlv_addr4,
							S1_T2.dlv_cntct_dpt,
							S1_T2.dlv_cntct_psn,
							S1_T2.dlv_tel,
							S1_T2.dlv_fax,
							S1_T2.pri_prnt_flg,
							S1_T2.dest_cd1,
							S1_T2.dest_cd2,
							S1_T2.dest_cd3,
							S1_T2.itm_cd,
							S1_T2.itm_sub1,
							S1_T2.itm_sub2,
							S1_T2.itm_sub3,
							S1_T2.itm_nm,
							S1_T2.sundry_itm_flg,
							S1_T2.iv_itm_nm,
							S1_T2.lot_no,
							S1_T2.sublot_no,
							S1_T2.sno1,
							S1_T2.sno2,
							S1_T2.sno3,
							S1_T2.sno4,
							S1_T2.sno1_mng_typ,
							S1_T2.sno2_mng_typ,
							S1_T2.sno3_mng_typ,
							S1_T2.sno4_mng_typ,
							S1_T2.trd_unit_cd,
							S1_T2.trd_unit_qty,
							S1_T2.base_unit_cd,
							S1_T2.base_unit_qty,
							S1_T2.base_unit_qty.as("base_unit_qty_bef"),
							S1_T3.base_unit_qty.as("sls_schd_qty"),
							S1_T3.base_unit_abort_qty.as("abort_qty"),
							S1_T3.base_unit_sls_qty.as("sls_qty"),
							S1_T2.interim_flg,
							S1_T2.trd_cur_upri,
							S1_T2.upri_not_tgt_flg,
							S1_T2.trd_cur_amt,
							bracket(
								S1_T2.trd_cur_amt.add(S1_T2.trd_cur_tax_amt)
							).as("trd_cur_inc_tax_amt"),
							S1_T2.cost_upri,
							S1_T2.cost_amt,
							nvl(
								nvl(
									S1_IVD.tax_fix_flg,
									nvl(
										S1_T6.tax_fix_flg,
										S1_T7.tax_fix_flg
									)
								),
								value(false)
							).as("tax_fix_flg"),
							S1_T2.tax_cd,
							S1_T2.trd_cur_tax_amt,
							S1_T2.trd_cur_dscnt_amt,
							S1_T2.dscnt_rsn_cd,
							S1_T2.base_cur_upri,
							S1_T2.base_cur_amt,
							bracket(
								S1_T2.base_cur_amt.add(S1_T2.base_cur_tax_amt)
							).as("base_cur_inc_tax_amt"),
							S1_T2.base_cur_tax_amt,
							S1_T2.base_cur_dscnt_amt,
							S1_T2.ptax_cur_upri,
							S1_T2.ptax_cur_amt,
							bracket(
								S1_T2.ptax_cur_amt.add(S1_T2.ptax_cur_tax_amt)
							).as("ptax_cur_inc_tax_amt"),
							S1_T2.ptax_cur_tax_amt,
							S1_T2.ptax_cur_dscnt_amt,
							S1_T2.bill_crryovr_times,
							S1_T2.gd_cd,
							S1_T2.cst_po_d_no,
							S1_T2.cst_itm_cd,
							S1_T2.cst_itm_nm,
							S1_T2.rsn_cd.as("sls_rsn_cd"),
							S1_T2.bd_dpt_cd,
							S1_T2.wtax_rate,
							S1_T2.wtax_amt,
							S1_T2.ext_sys_cd,
							S1_T2.ext_purc_act_d_no,
							S1_T2.trd_d_rmrks,
							S1_T2.intr_rmrks.as("intr_d_rmrks"),
							S1_T2.sub_char1.as("dtl_sub_char1"),
							S1_T2.sub_char2.as("dtl_sub_char2"),
							S1_T2.sub_char3.as("dtl_sub_char3"),
							S1_T6.sls_cststk_flg,
							S1_T6.ship_inst_typ,
							S1_T1.ins_usr_id,
							S1_T1.ins_usr_nm,
							S1_T1.ins_func_id,
							S1_T1.ins_ts,
							S1_T1.upd_usr_id,
							S1_T1.upd_usr_nm,
							S1_T1.upd_func_id,
							S1_T1.upd_ts,
							S1_T1.upd_srv_req_no,
							S1_T1.upd_cntr,
							bind("xrate_rnd_typ").as("xrate_rnd_typ"),
							bind("wtax_rnd_typ").as("wtax_rnd_typ"),
							bracket(
								subQuery()
								.select(count(S2_T.sls_act_io_no))
								.from(S2_T)
								.where(
									S2_T.sls_act_d_no.eq(S1_T2.sls_act_d_no)
									.and(S2_T.sls_act_d_seq.eq(S1_T2.sls_act_d_seq))
								)
							).as("sls_act_io_cnt"),
							decode(
								bracket(
									subQuery()
									.select(sign(count(S3_W.sls_schd_no)))
									.from(S3_W)
									.where(
										S1_T1.iv_no.eq(S3_W.iv_no)
										.and(S3_W.po_schd_no.isNotNull())
									)
								),
								value(0),
								value(false),
								value(true)
							).as("ddlv_iv_grp_flg"),
							decode(
								S1_T3.iv_no,
								nullValue(),
								decode(
									S1_T3.dlv_slip_d_no,
									nullValue(),
									S1_T6.base_unit_qty,
									decode(
										S1_T1.sls_basis_typ,
										value(MAC_SLS_BASIS_TYP.IN_BASIS.value()),
										S1_SLIPD.base_unit_qty,
										value(MAC_SLS_BASIS_TYP.ARRIVAL_BASIS.value()),
										S1_SLIPD.base_unit_qty,
										S1_T6.base_unit_qty
									)
								),
								S1_IVD.base_unit_qty
							).as("init_schd_qty"),
							decode(
								S1_T3.iv_no,
								nullValue(),
								decode(
									S1_T3.dlv_slip_d_no,
									nullValue(),
									S1_T6.trd_cur_dscnt_amt,
									S1_SLIPD.trd_cur_dscnt_amt
								),
								S1_IVD.trd_cur_dscnt_amt
							).as("init_schd_dscnt_amt"),
							S1_T2.sls_dtl_upd_flg,
							decode(
								S1_T3.iv_no,
								nullValue(),
								decode(
									S1_T3.dlv_slip_d_no,
									nullValue(),
									S1_T6.trd_cur_tax_amt,
									decode(
										S1_T1.sls_basis_typ,
										value(MAC_SLS_BASIS_TYP.IN_BASIS.value()),
										S1_SLIPD.trd_cur_tax_amt,
										value(MAC_SLS_BASIS_TYP.ARRIVAL_BASIS.value()),
										S1_SLIPD.trd_cur_tax_amt,
										S1_T6.trd_cur_tax_amt
									)
								),
								S1_IVD.trd_cur_tax_amt
							).as("init_trd_cur_tax_amt"),
							decode(
								S1_T3.iv_no,
								nullValue(),
								decode(
									S1_T3.dlv_slip_d_no,
									nullValue(),
									S1_T6.trd_unit_cd,
									decode(
										S1_T1.sls_basis_typ,
										value(MAC_SLS_BASIS_TYP.IN_BASIS.value()),
										S1_SLIPD.trd_unit_cd,
										value(MAC_SLS_BASIS_TYP.ARRIVAL_BASIS.value()),
										S1_SLIPD.trd_unit_cd,
										S1_T6.trd_unit_cd
									)
								),
								S1_IVD.trd_unit_cd
							).as("init_trd_unit_cd"),
							decode(
								S1_T3.iv_no,
								nullValue(),
								decode(
									S1_T3.dlv_slip_d_no,
									nullValue(),
									S1_T6.trd_unit_qty,
									decode(
										S1_T1.sls_basis_typ,
										value(MAC_SLS_BASIS_TYP.IN_BASIS.value()),
										S1_SLIPD.trd_unit_qty,
										value(MAC_SLS_BASIS_TYP.ARRIVAL_BASIS.value()),
										S1_SLIPD.trd_unit_qty,
										S1_T6.trd_unit_qty
									)
								),
								S1_IVD.trd_unit_qty
							).as("init_trd_unit_qty"),
							decode(
								S1_T3.iv_no,
								nullValue(),
								decode(
									S1_T3.dlv_slip_d_no,
									nullValue(),
									S1_T6.trd_cur_upri,
									decode(
										S1_T1.sls_basis_typ,
										value(MAC_SLS_BASIS_TYP.IN_BASIS.value()),
										S1_SLIPD.trd_cur_upri,
										value(MAC_SLS_BASIS_TYP.ARRIVAL_BASIS.value()),
										S1_SLIPD.trd_cur_upri,
										S1_T6.trd_cur_upri
									)
								),
								S1_IVD.trd_cur_upri
							).as("init_trd_cur_upri"),
							decode(
								S1_T3.iv_no,
								nullValue(),
								decode(
									S1_T3.dlv_slip_d_no,
									nullValue(),
									S1_T6.trd_cur_dscnt_amt,
									decode(
										S1_T1.sls_basis_typ,
										value(MAC_SLS_BASIS_TYP.IN_BASIS.value()),
										S1_SLIPD.trd_cur_dscnt_amt,
										value(MAC_SLS_BASIS_TYP.ARRIVAL_BASIS.value()),
										S1_SLIPD.trd_cur_dscnt_amt,
										S1_T6.trd_cur_dscnt_amt
									)
								),
								S1_IVD.trd_cur_dscnt_amt
							).as("init_trd_cur_dscnt_amt"),
							decode(
								S1_T3.iv_no,
								nullValue(),
								decode(
									S1_T3.dlv_slip_d_no,
									nullValue(),
									S1_T6.trd_unit_cd,
									S1_SLIPD.trd_unit_cd
								),
								S1_IVD.trd_unit_cd
							).as("schd_trd_unit_cd"),
							decode(
								S1_T3.iv_no,
								nullValue(),
								decode(
									S1_T3.dlv_slip_d_no,
									nullValue(),
									S1_T6.tax_cd,
									S1_SLIPD.tax_cd
								),
								S1_IVD.tax_cd
							).as("schd_tax_cd"),
							decode(
								S1_T3.iv_no,
								nullValue(),
								decode(
									S1_T3.dlv_slip_d_no,
									nullValue(),
									S1_T6.trd_cur_amt,
									S1_SLIPD.trd_cur_amt
								),
								S1_IVD.trd_cur_amt
							).as("schd_trd_cur_amt"),
							decode(
								S1_T3.iv_no,
								nullValue(),
								decode(
									S1_T3.dlv_slip_d_no,
									nullValue(),
									S1_T6.trd_cur_tax_amt,
									S1_SLIPD.trd_cur_tax_amt
								),
								S1_IVD.trd_cur_tax_amt
							).as("schd_trd_cur_tax_amt"),
							S1_T1.ac_dt.as("master_dt"),
							S1_T3.iv_no.as("iv_no_sls_schd"),
							S1_PURCD.bp_lot_no,
							S1_PURCD.bp_dlv_slip_no,
							S1_PURCD.bp_dlv_slip_d_no,
							S1_T1.ddlv_sls_flg,
							S1_T1.edi_flg,
							S1_PURC.ptax_dt,
							S1_T6.not_lot_mix_flg,
							S1_T6.not_sublot_mix_flg
						)
						.from(
							S1_T1
							.innerJoin(S1_T2).on(
								S1_T1.sls_act_no.eq(S1_T2.sls_act_no)
								.and(S1_T1.sls_act_seq.eq(S1_T2.sls_act_seq))
							)
							.leftOuterJoin(S1_T3).on(S1_T2.sls_schd_no.eq(S1_T3.sls_schd_no))
							.leftOuterJoin(S1_T4).on(S1_T2.purc_ddlv_po_no.eq(S1_T4.po_no))
							.leftOuterJoin(S1_T5).on(
								S1_T1.dlv_slip_no.eq(S1_T5.dlv_slip_no)
								.and(S1_T5.slip_sts_typ.eq(value(MAC_SLIP_STS_TYP.CRT.value())))
							)
							.leftOuterJoin(S1_T6).on(S1_T2.slo_d_no.eq(S1_T6.slo_d_no))
							.leftOuterJoin(S1_T7).on(S1_T2.qtn_d_no.eq(S1_T7.qtn_d_no))
							.leftOuterJoin(S1_IVD).on(S1_T2.iv_d_no.eq(S1_IVD.iv_d_no))
							.leftOuterJoin(S1_IV).on(S1_IV.iv_mng_no.eq(S1_IVD.iv_mng_no))
							.leftOuterJoin(S1_SLIPD).on(S1_T3.dlv_slip_d_no.eq(S1_SLIPD.dlv_slip_d_no))
							.leftOuterJoin(S1_PURC).on(
								S1_T2.purc_act_no.eq(S1_PURC.purc_act_no)
								.and(S1_PURC.slip_sts_typ.eq(value(MAC_SLIP_STS_TYP.CRT.value())))
							)
							.leftOuterJoin(S1_PURCD).on(
								S1_T2.purc_act_d_no.eq(S1_PURCD.purc_act_d_no)
								.and(S1_PURC.purc_act_no.eq(S1_PURCD.purc_act_no))
								.and(S1_PURC.purc_act_seq.eq(S1_PURCD.purc_act_seq))
							)
							.leftOuterJoin(S1_PURCSCHD).on(S1_T3.purc_schd_no.eq(S1_PURCSCHD.purc_schd_no))
							.leftOuterJoin(S1_ARRSCHD).on(S1_PURCSCHD.arr_schd_no.eq(S1_ARRSCHD.arr_schd_no))
							.leftOuterJoin(S1_PURCDLVSLIP).on(
								S1_ARRSCHD.dlv_slip_mng_d_no.eq(S1_PURCDLVSLIP.dlv_slip_mng_d_no)
								.and(S1_ARRSCHD.dlv_slip_mng_d_seq.eq(S1_PURCDLVSLIP.dlv_slip_mng_d_seq))
							)
							.innerJoin(S1_DAC).on(S1_T1.sls_dpt_cd.eq(S1_DAC.dpt_cd))
						)
						.where(
							value(0).eq(value(0))
							.and(S1_T1.slip_sts_typ.eq(value(MAC_SLIP_STS_TYP.CRT.value())))
							.and(
								exists(
									subQuery()
									.select(value("X"))
									.from(S4_TT1)
									.where(
										S4_TT1.sls_act_no.eq(S1_T1.sls_act_no)
										.and(S4_TT1.sls_act_seq.eq(S1_T1.sls_act_seq))
										.and(S4_TT1.sls_schd_no.isNotNull())
									)
								)
								.or(bind("non_schd_flg").eq(value(true)))
							)
							.and(
								S1_SLIPD.dlv_slip_d_seq.isNull()
								.or(
									S1_SLIPD.dlv_slip_d_seq.eq(subQuery()
										.select(max(S5_W.dlv_slip_d_seq))
										.from(S5_W2
											.innerJoin(S5_W).on(
												S5_W.dlv_slip_d_no.eq(S5_W2.dlv_slip_d_no)
												.and(S5_W.dlv_slip_no.eq(S5_W2.dlv_slip_no))
												.and(S5_W.dlv_slip_seq.eq(S5_W2.dlv_slip_seq))
											)
										)
										.where(
											S5_W2.dlv_slip_d_no.eq(S1_T3.dlv_slip_d_no)
											.and(S5_W2.can_flg.eq(value(false)))
										)
									)
								)
							)
							.cutoff$and(S1_T1.dlv_slip_no.like(bind("dlv_slip_no")))
							.cutoff$and(S1_T1.ship_act_no.like(bind("ship_act_no")))
							.cutoff$and(S1_T1.iv_no.like(bind("iv_no")))
							.cutoff$and(S1_T2.slo_no.like(bind("slo_no")))
							.cutoff$and(S1_T2.purc_ddlv_po_no.like(bind("po_no")))
							.cutoff$and(S1_T1.sls_act_no.like(bind("sls_act_no")))
							.cutoff$and(S1_T1.ship_tm.gte(bind("ship_hm_fr")))
							.cutoff$and(S1_T1.ship_tm.lte(bind("ship_hm_to")))
							.cutoff$and(S1_T1.dlv_tm.gte(bind("dlv_hm_fr")))
							.cutoff$and(S1_T1.dlv_tm.lte(bind("dlv_hm_to")))
							.cutoff$and(S1_T1.sls_dt.gte(bind("sls_dt_fr")))
							.cutoff$and(S1_T1.sls_dt.lte(bind("sls_dt_to")))
							.cutoff$and(S1_T1.ac_dt.gte(bind("ac_dt_fr")))
							.cutoff$and(S1_T1.ac_dt.lte(bind("ac_dt_to")))
							.cutoff$and(S1_T2.dlv_cd.like(bind("dlv_cd")))
							.cutoff$and(S1_T2.dest_cd1.like(bind("dest_cd1")))
							.cutoff$and(S1_T2.dest_cd2.like(bind("dest_cd2")))
							.cutoff$and(S1_T2.dest_cd3.like(bind("dest_cd3")))
							.cutoff$and(S1_T1.cst_cd.like(bind("cst_cd")))
							.cutoff$and(S1_T1.cst_po_no.like(bind("cst_po_no")))
							.cutoff$and(S1_T1.sls_usr_cd.like(bind("sls_usr_cd")))
							.cutoff$and(S1_T1.sls_dpt_cd.like(bind("sls_dpt_cd")))
							.cutoff$and(S1_T1.wg_cd.like(bind("wg_cd")))
							.cutoff$and(S1_T4.sppl_cd.like(bind("sppl_cd")))
							.cutoff$and(S1_T1.trd_cd.like(bind("trd_cd")))
							.cutoff$and(S1_T2.cst_itm_cd.like(bind("cst_itm_cd")))
							.cutoff$and(S1_T2.cst_itm_nm.like(bind("cst_itm_nm")))
							.cutoff$and(S1_T2.itm_cd.like(bind("itm_cd")))
							.cutoff$and(S1_T2.itm_cd.like(bind("itm_cd")))
							.cutoff$and(S1_T2.itm_sub1.like(bind("itm_sub1")))
							.cutoff$and(S1_T2.itm_sub2.like(bind("itm_sub2")))
							.cutoff$and(S1_T2.itm_sub3.like(bind("itm_sub3")))
							.cutoff$and(S1_T2.lot_no.like(bind("lot_no")))
							.cutoff$and(S1_T2.sublot_no.like(bind("sublot_no")))
							.cutoff$and(S1_T2.sno1.like(bind("sno1")))
							.cutoff$and(S1_T2.sno2.like(bind("sno2")))
							.cutoff$and(S1_T2.sno3.like(bind("sno3")))
							.cutoff$and(S1_T2.sno4.like(bind("sno4")))
							.cutoff$and(S1_T1.trd_rmrks.like(bind("trd_rmrks")))
							.cutoff$and(S1_T1.intr_rmrks.like(bind("intr_rmrks")))
							.cutoff$and(S1_T2.trd_d_rmrks.like(bind("trd_d_rmrks")))
							.cutoff$and(S1_T2.intr_rmrks.like(bind("intr_d_rmrks")))
							.cutoff$and(S1_T1.ship_lg_grp_cd.like(bind("ship_lg_grp_cd")))
							.cutoff$and(S1_T1.sub_char1.like(bind("sub_char1")))
							.cutoff$and(S1_T1.sub_char2.like(bind("sub_char2")))
							.cutoff$and(S1_T1.sub_char3.like(bind("sub_char3")))
							.cutoff$and(S1_T2.sub_char1.like(bind("dtl_sub_char1")))
							.cutoff$and(S1_T2.sub_char2.like(bind("dtl_sub_char2")))
							.cutoff$and(S1_T2.sub_char3.like(bind("dtl_sub_char3")))
							.cutoff$and(S1_T1.edi_flg.eq(bind("edi_flg_str")))
							.cutoff$and(S1_T1.ship_dlv_slip_no.like(bind("ship_dlv_slip_no")))
							.cutoff$and(S1_PURCDLVSLIP.purc_ddlv_dlv_slip_no.like(bind("purc_ddlv_dlv_slip_no")))
							.cutoff$and(S1_T2.ext_purc_act_d_no.like(bind("ext_purc_act_d_no")))
						).view(S0_V1)
						.leftOuterJoin(S0_CST).on(S0_V1.pr(S1_T1.cst_cd).eq(S0_CST.bp_cd))
						.leftOuterJoin(S0_SPPL).on(S0_V1.pr(S1_T4.sppl_cd).eq(S0_SPPL.bp_cd))
						.leftOuterJoin(S0_EXT).on(S0_V1.pr(S1_T2.ext_sys_cd).eq(S0_EXT.ext_sys_cd))
						.addDynamicView()
						.addDynamicView(DS0D)
					)
					.where(
						value(0).eq(value(0))
						.and(
							bracket(
								bind("arrv_sls_flg").eq(value(true))
								.and(S0_V1.pr(S1_T1.sls_basis_typ).eq(value(MAC_SLS_BASIS_TYP.IN_BASIS.value())))
								.and(
									S0_V1.pr(S1_T6.sls_cststk_flg).eq(value(false))
									.or(S0_V1.pr(S1_T6.sls_cststk_flg).isNull())
								)
								.and(S0_V1.pr("po_no").isNull())
								.and(S0_V1.pr("ddlv_iv_grp_flg").eq(value(false)))
								.and(S0_V1.pr(S1_T2.sls_schd_no).isNotNull())
							)
							.or(
								bind("arrv_base_sls_flg").eq(value(true))
								.and(S0_V1.pr(S1_T1.sls_basis_typ).eq(value(MAC_SLS_BASIS_TYP.ARRIVAL_BASIS.value())))
								.and(
									S0_V1.pr(S1_T6.sls_cststk_flg).eq(value(false))
									.or(S0_V1.pr(S1_T6.sls_cststk_flg).isNull())
								)
								.and(S0_V1.pr("po_no").isNull())
								.and(S0_V1.pr("ddlv_iv_grp_flg").eq(value(false)))
								.and(S0_V1.pr(S1_T2.sls_schd_no).isNotNull())
							)
							.or(
								bind("sls_cststk_flg").eq(value(true))
								.and(S0_V1.pr(S1_T6.sls_cststk_flg).eq(value(true)))
								.and(S0_V1.pr("po_no").isNull())
							)
							.or(
								bind("sls_ddlv_flg").eq(value(true))
								.and(S0_V1.pr(S1_T1.trd_ptn_typ).eq(value(MAC_TRD_PTN_TYP.SLS.value())))
								.and(
									S0_V1.pr("po_no").isNotNull()
									.or(S0_V1.pr("ddlv_iv_grp_flg").eq(value(true)))
								)
							)
							.or(
								bind("not_ship_ord_sls_flg").eq(value(true))
								.and(
										S0_V1.pr(S1_T6.sls_cststk_flg).eq(value(false))
										.or(S0_V1.pr(S1_T6.sls_cststk_flg).isNull())
								)
								.and(S0_V1.pr("po_no").isNull())
								.and(S0_V1.pr(S1_T1.sls_basis_typ).eq(value(MAC_SLS_BASIS_TYP.SHIP_BASIS.value())))
								.and(S0_V1.pr(S1_T6.ship_inst_typ).eq(value(MAC_SHIP_INST_TYP.NON.value()))
										.or(S0_V1.pr(S1_T6.ship_inst_typ).isNull())
								)
								.and(S0_V1.pr("ddlv_iv_grp_flg").eq(value(false)))
							)
							.or(
								bind("ship_ord_sls_flg").eq(value(true))
								.and(S0_V1.pr(S1_T6.sls_cststk_flg).eq(value(false)))
								.and(S0_V1.pr("po_no").isNull())
								.and(S0_V1.pr(S1_T1.sls_basis_typ).eq(value(MAC_SLS_BASIS_TYP.SHIP_BASIS.value())))
								.and(S0_V1.pr(S1_T6.ship_inst_typ).neq(value(MAC_SHIP_INST_TYP.NON.value())))
							)
							.or(
								bind("non_schd_flg").eq(value(true))
								.and(
									S0_V1.pr(S1_T1.trd_ptn_typ).in(
										value(MAC_TRD_PTN_TYP.SLS.value()),
										value(MAC_TRD_PTN_TYP.SLS_CNSGN.value())
									)
								)
								.and(
									S0_V1.pr(S1_T2.sls_schd_no).isNull()
									.or(
										S0_V1.pr(S1_T2.slo_d_no).isNull()
										.and(S0_V1.pr(S1_T1.sls_basis_typ).neq(value(MAC_SLS_BASIS_TYP.IN_BASIS.value())))
										.and(S0_V1.pr(S1_T1.sls_basis_typ).neq(value(MAC_SLS_BASIS_TYP.ARRIVAL_BASIS.value())))
									)
								)
							)
						)
						.and(
							bracket(
								bind("iv_flg").eq(value(true))
								.and(S0_CST.cst_iv_flg.eq(value(true)))
							)
							.or(
								bind("not_iv_flg").eq(value(true))
								.and(S0_CST.cst_iv_flg.eq(value(false)))
							)
						)
						.cutoff$and(S0_CST.bp_nm.like(bind("cst_nm")))
						.cutoff$and(S0_SPPL.bp_nm.like(bind("sppl_nm")))
						.addDynamicPredicate()
						.addDynamicPredicate(DS0D)
					)
					.orderBy(
						S0_V1.pr(S1_T1.sls_act_no).asc(),
						S0_V1.pr(S1_T2.disp_seq).asc()
					)
			)
			.setDynamicSQLInfo(
				when(boundOr("cst_grp_flg1"))
					.select(DS0D, S0_CST.bp_grp_cd1.as("cst_grp_cd1"))
					.groupBy(DS0D, S0_CST.bp_grp_cd1),
				when(boundOr("cst_grp_flg1", "cst_grp_cd1"))
					.predicate(DS0D, p -> p.cutoff$and(S0_CST.bp_grp_cd1.like(bind("cst_grp_cd1")))),
				when(boundOr("cst_grp_flg1"))
					.select(DS0D, S0_CST_GRP1.bp_grp_nm.as("cst_grp_nm1"))
					.groupBy(DS0D, S0_CST_GRP1.bp_grp_nm),
				when(boundOr("cst_grp_flg1", "cst_grp_nm1"))
					.view(DS0D, v -> v.leftOuterJoin(S0_CST_GRP1).on(S0_CST.bp_grp_cd1.eq(S0_CST_GRP1.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP1.value()).eq(S0_CST_GRP1.bp_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_CST_GRP1.bp_grp_nm.like(bind("cst_grp_nm1")))),
				when(boundOr("cst_grp_flg2"))
					.select(DS0D, S0_CST.bp_grp_cd2.as("cst_grp_cd2"))
					.groupBy(DS0D, S0_CST.bp_grp_cd2),
				when(boundOr("cst_grp_flg2", "cst_grp_cd2"))
					.predicate(DS0D, p -> p.cutoff$and(S0_CST.bp_grp_cd2.like(bind("cst_grp_cd2")))),
				when(boundOr("cst_grp_flg2"))
					.select(DS0D, S0_CST_GRP2.bp_grp_nm.as("cst_grp_nm2"))
					.groupBy(DS0D, S0_CST_GRP2.bp_grp_nm),
				when(boundOr("cst_grp_flg2", "cst_grp_nm2"))
					.view(DS0D, v -> v.leftOuterJoin(S0_CST_GRP2).on(S0_CST.bp_grp_cd2.eq(S0_CST_GRP2.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP2.value()).eq(S0_CST_GRP2.bp_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_CST_GRP2.bp_grp_nm.like(bind("cst_grp_nm2")))),
				when(boundOr("cst_grp_flg3"))
					.select(DS0D, S0_CST.bp_grp_cd3.as("cst_grp_cd3"))
					.groupBy(DS0D, S0_CST.bp_grp_cd3),
				when(boundOr("cst_grp_flg3", "cst_grp_cd3"))
					.predicate(DS0D, p -> p.cutoff$and(S0_CST.bp_grp_cd3.like(bind("cst_grp_cd3")))),
				when(boundOr("cst_grp_flg3"))
					.select(DS0D, S0_CST_GRP3.bp_grp_nm.as("cst_grp_nm3"))
					.groupBy(DS0D, S0_CST_GRP3.bp_grp_nm),
				when(boundOr("cst_grp_flg3", "cst_grp_nm3"))
					.view(DS0D, v -> v.leftOuterJoin(S0_CST_GRP3).on(S0_CST.bp_grp_cd3.eq(S0_CST_GRP3.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP3.value()).eq(S0_CST_GRP3.bp_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_CST_GRP3.bp_grp_nm.like(bind("cst_grp_nm3")))),
				when(boundOr("cst_grp_flg4"))
					.select(DS0D, S0_CST.bp_grp_cd4.as("cst_grp_cd4"))
					.groupBy(DS0D, S0_CST.bp_grp_cd4),
				when(boundOr("cst_grp_flg4", "cst_grp_cd4"))
					.predicate(DS0D, p -> p.cutoff$and(S0_CST.bp_grp_cd4.like(bind("cst_grp_cd4")))),
				when(boundOr("cst_grp_flg4"))
					.select(DS0D, S0_CST_GRP4.bp_grp_nm.as("cst_grp_nm4"))
					.groupBy(DS0D, S0_CST_GRP4.bp_grp_nm),
				when(boundOr("cst_grp_flg4", "cst_grp_nm4"))
					.view(DS0D, v -> v.leftOuterJoin(S0_CST_GRP4).on(S0_CST.bp_grp_cd4.eq(S0_CST_GRP4.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP4.value()).eq(S0_CST_GRP4.bp_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_CST_GRP4.bp_grp_nm.like(bind("cst_grp_nm4")))),
				when(boundOr("cst_grp_flg5"))
					.select(DS0D, S0_CST.bp_grp_cd5.as("cst_grp_cd5"))
					.groupBy(DS0D, S0_CST.bp_grp_cd5),
				when(boundOr("cst_grp_flg5", "cst_grp_cd5"))
					.predicate(DS0D, p -> p.cutoff$and(S0_CST.bp_grp_cd5.like(bind("cst_grp_cd5")))),
				when(boundOr("cst_grp_flg5"))
					.select(DS0D, S0_CST_GRP5.bp_grp_nm.as("cst_grp_nm5"))
					.groupBy(DS0D, S0_CST_GRP5.bp_grp_nm),
				when(boundOr("cst_grp_flg5", "cst_grp_nm5"))
					.view(DS0D, v -> v.leftOuterJoin(S0_CST_GRP5).on(S0_CST.bp_grp_cd5.eq(S0_CST_GRP5.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP5.value()).eq(S0_CST_GRP5.bp_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_CST_GRP5.bp_grp_nm.like(bind("cst_grp_nm5")))),
				when(boundOr("cst_grp_flg6"))
					.select(DS0D, S0_CST.bp_grp_cd6.as("cst_grp_cd6"))
					.groupBy(DS0D, S0_CST.bp_grp_cd6),
				when(boundOr("cst_grp_flg6", "cst_grp_cd6"))
					.predicate(DS0D, p -> p.cutoff$and(S0_CST.bp_grp_cd6.like(bind("cst_grp_cd6")))),
				when(boundOr("cst_grp_flg6"))
					.select(DS0D, S0_CST_GRP6.bp_grp_nm.as("cst_grp_nm6"))
					.groupBy(DS0D, S0_CST_GRP6.bp_grp_nm),
				when(boundOr("cst_grp_flg6", "cst_grp_nm6"))
					.view(DS0D, v -> v.leftOuterJoin(S0_CST_GRP6).on(S0_CST.bp_grp_cd6.eq(S0_CST_GRP6.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP6.value()).eq(S0_CST_GRP6.bp_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_CST_GRP6.bp_grp_nm.like(bind("cst_grp_nm6")))),
				when(boundOr("cst_grp_flg7"))
					.select(DS0D, S0_CST.bp_grp_cd7.as("cst_grp_cd7"))
					.groupBy(DS0D, S0_CST.bp_grp_cd7),
				when(boundOr("cst_grp_flg7", "cst_grp_cd7"))
					.predicate(DS0D, p -> p.cutoff$and(S0_CST.bp_grp_cd7.like(bind("cst_grp_cd7")))),
				when(boundOr("cst_grp_flg7"))
					.select(DS0D, S0_CST_GRP7.bp_grp_nm.as("cst_grp_nm7"))
					.groupBy(DS0D, S0_CST_GRP7.bp_grp_nm),
				when(boundOr("cst_grp_flg7", "cst_grp_nm7"))
					.view(DS0D, v -> v.leftOuterJoin(S0_CST_GRP7).on(S0_CST.bp_grp_cd7.eq(S0_CST_GRP7.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP7.value()).eq(S0_CST_GRP7.bp_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_CST_GRP7.bp_grp_nm.like(bind("cst_grp_nm7")))),
				when(boundOr("cst_grp_flg8"))
					.select(DS0D, S0_CST.bp_grp_cd8.as("cst_grp_cd8"))
					.groupBy(DS0D, S0_CST.bp_grp_cd8),
				when(boundOr("cst_grp_flg8", "cst_grp_cd8"))
					.predicate(DS0D, p -> p.cutoff$and(S0_CST.bp_grp_cd8.like(bind("cst_grp_cd8")))),
				when(boundOr("cst_grp_flg8"))
					.select(DS0D, S0_CST_GRP8.bp_grp_nm.as("cst_grp_nm8"))
					.groupBy(DS0D, S0_CST_GRP8.bp_grp_nm),
				when(boundOr("cst_grp_flg8", "cst_grp_nm8"))
					.view(DS0D, v -> v.leftOuterJoin(S0_CST_GRP8).on(S0_CST.bp_grp_cd8.eq(S0_CST_GRP8.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP8.value()).eq(S0_CST_GRP8.bp_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_CST_GRP8.bp_grp_nm.like(bind("cst_grp_nm8")))),
				when(boundOr("cst_grp_flg9"))
					.select(DS0D, S0_CST.bp_grp_cd9.as("cst_grp_cd9"))
					.groupBy(DS0D, S0_CST.bp_grp_cd9),
				when(boundOr("cst_grp_flg9", "cst_grp_cd9"))
					.predicate(DS0D, p -> p.cutoff$and(S0_CST.bp_grp_cd9.like(bind("cst_grp_cd9")))),
				when(boundOr("cst_grp_flg9"))
					.select(DS0D, S0_CST_GRP9.bp_grp_nm.as("cst_grp_nm9"))
					.groupBy(DS0D, S0_CST_GRP9.bp_grp_nm),
				when(boundOr("cst_grp_flg9", "cst_grp_nm9"))
					.view(DS0D, v -> v.leftOuterJoin(S0_CST_GRP9).on(S0_CST.bp_grp_cd9.eq(S0_CST_GRP9.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP9.value()).eq(S0_CST_GRP9.bp_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_CST_GRP9.bp_grp_nm.like(bind("cst_grp_nm9")))),
				when(boundOr("cst_grp_flg10"))
					.select(DS0D, S0_CST.bp_grp_cd10.as("cst_grp_cd10"))
					.groupBy(DS0D, S0_CST.bp_grp_cd10),
				when(boundOr("cst_grp_flg10", "cst_grp_cd10"))
					.predicate(DS0D, p -> p.cutoff$and(S0_CST.bp_grp_cd10.like(bind("cst_grp_cd10")))),
				when(boundOr("cst_grp_flg10"))
					.select(DS0D, S0_CST_GRP10.bp_grp_nm.as("cst_grp_nm10"))
					.groupBy(DS0D, S0_CST_GRP10.bp_grp_nm),
				when(boundOr("cst_grp_flg10", "cst_grp_nm10"))
					.view(DS0D, v -> v.leftOuterJoin(S0_CST_GRP10).on(S0_CST.bp_grp_cd10.eq(S0_CST_GRP10.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP10.value()).eq(S0_CST_GRP10.bp_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_CST_GRP10.bp_grp_nm.like(bind("cst_grp_nm10")))),
				when(boundOr("sppl_grp_flg1"))
					.select(DS0D, S0_SPPL.bp_grp_cd1.as("sppl_grp_cd1"))
					.groupBy(DS0D, S0_SPPL.bp_grp_cd1),
				when(boundOr("sppl_grp_flg1", "sppl_grp_cd1"))
					.predicate(DS0D, p -> p.cutoff$and(S0_SPPL.bp_grp_cd1.like(bind("sppl_grp_cd1")))),
				when(boundOr("sppl_grp_flg1"))
					.select(DS0D, S0_SPPL_GRP1.bp_grp_nm.as("sppl_grp_nm1"))
					.groupBy(DS0D, S0_SPPL_GRP1.bp_grp_nm),
				when(boundOr("sppl_grp_flg1", "sppl_grp_nm1"))
					.view(DS0D, v -> v.leftOuterJoin(S0_SPPL_GRP1).on(S0_SPPL.bp_grp_cd1.eq(S0_SPPL_GRP1.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP1.value()).eq(S0_SPPL_GRP1.bp_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_SPPL_GRP1.bp_grp_nm.like(bind("sppl_grp_nm1")))),
				when(boundOr("sppl_grp_flg2"))
					.select(DS0D, S0_SPPL.bp_grp_cd2.as("sppl_grp_cd2"))
					.groupBy(DS0D, S0_SPPL.bp_grp_cd2),
				when(boundOr("sppl_grp_flg2", "sppl_grp_cd2"))
					.predicate(DS0D, p -> p.cutoff$and(S0_SPPL.bp_grp_cd2.like(bind("sppl_grp_cd2")))),
				when(boundOr("sppl_grp_flg2"))
					.select(DS0D, S0_SPPL_GRP2.bp_grp_nm.as("sppl_grp_nm2"))
					.groupBy(DS0D, S0_SPPL_GRP2.bp_grp_nm),
				when(boundOr("sppl_grp_flg2", "sppl_grp_nm2"))
					.view(DS0D, v -> v.leftOuterJoin(S0_SPPL_GRP2).on(S0_SPPL.bp_grp_cd2.eq(S0_SPPL_GRP2.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP2.value()).eq(S0_SPPL_GRP2.bp_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_SPPL_GRP2.bp_grp_nm.like(bind("sppl_grp_nm2")))),
				when(boundOr("sppl_grp_flg3"))
					.select(DS0D, S0_SPPL.bp_grp_cd3.as("sppl_grp_cd3"))
					.groupBy(DS0D, S0_SPPL.bp_grp_cd3),
				when(boundOr("sppl_grp_flg3", "sppl_grp_cd3"))
					.predicate(DS0D, p -> p.cutoff$and(S0_SPPL.bp_grp_cd3.like(bind("sppl_grp_cd3")))),
				when(boundOr("sppl_grp_flg3"))
					.select(DS0D, S0_SPPL_GRP3.bp_grp_nm.as("sppl_grp_nm3"))
					.groupBy(DS0D, S0_SPPL_GRP3.bp_grp_nm),
				when(boundOr("sppl_grp_flg3", "sppl_grp_nm3"))
					.view(DS0D, v -> v.leftOuterJoin(S0_SPPL_GRP3).on(S0_SPPL.bp_grp_cd3.eq(S0_SPPL_GRP3.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP3.value()).eq(S0_SPPL_GRP3.bp_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_SPPL_GRP3.bp_grp_nm.like(bind("sppl_grp_nm3")))),
				when(boundOr("sppl_grp_flg4"))
					.select(DS0D, S0_SPPL.bp_grp_cd4.as("sppl_grp_cd4"))
					.groupBy(DS0D, S0_SPPL.bp_grp_cd4),
				when(boundOr("sppl_grp_flg4", "sppl_grp_cd4"))
					.predicate(DS0D, p -> p.cutoff$and(S0_SPPL.bp_grp_cd4.like(bind("sppl_grp_cd4")))),
				when(boundOr("sppl_grp_flg4"))
					.select(DS0D, S0_SPPL_GRP4.bp_grp_nm.as("sppl_grp_nm4"))
					.groupBy(DS0D, S0_SPPL_GRP4.bp_grp_nm),
				when(boundOr("sppl_grp_flg4", "sppl_grp_nm4"))
					.view(DS0D, v -> v.leftOuterJoin(S0_SPPL_GRP4).on(S0_SPPL.bp_grp_cd4.eq(S0_SPPL_GRP4.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP4.value()).eq(S0_SPPL_GRP4.bp_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_SPPL_GRP4.bp_grp_nm.like(bind("sppl_grp_nm4")))),
				when(boundOr("sppl_grp_flg5"))
					.select(DS0D, S0_SPPL.bp_grp_cd5.as("sppl_grp_cd5"))
					.groupBy(DS0D, S0_SPPL.bp_grp_cd5),
				when(boundOr("sppl_grp_flg5", "sppl_grp_cd5"))
					.predicate(DS0D, p -> p.cutoff$and(S0_SPPL.bp_grp_cd5.like(bind("sppl_grp_cd5")))),
				when(boundOr("sppl_grp_flg5"))
					.select(DS0D, S0_SPPL_GRP5.bp_grp_nm.as("sppl_grp_nm5"))
					.groupBy(DS0D, S0_SPPL_GRP5.bp_grp_nm),
				when(boundOr("sppl_grp_flg5", "sppl_grp_nm5"))
					.view(DS0D, v -> v.leftOuterJoin(S0_SPPL_GRP5).on(S0_SPPL.bp_grp_cd5.eq(S0_SPPL_GRP5.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP5.value()).eq(S0_SPPL_GRP5.bp_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_SPPL_GRP5.bp_grp_nm.like(bind("sppl_grp_nm5")))),
				when(boundOr("sppl_grp_flg6"))
					.select(DS0D, S0_SPPL.bp_grp_cd6.as("sppl_grp_cd6"))
					.groupBy(DS0D, S0_SPPL.bp_grp_cd6),
				when(boundOr("sppl_grp_flg6", "sppl_grp_cd6"))
					.predicate(DS0D, p -> p.cutoff$and(S0_SPPL.bp_grp_cd6.like(bind("sppl_grp_cd6")))),
				when(boundOr("sppl_grp_flg6"))
					.select(DS0D, S0_SPPL_GRP6.bp_grp_nm.as("sppl_grp_nm6"))
					.groupBy(DS0D, S0_SPPL_GRP6.bp_grp_nm),
				when(boundOr("sppl_grp_flg6", "sppl_grp_nm6"))
					.view(DS0D, v -> v.leftOuterJoin(S0_SPPL_GRP6).on(S0_SPPL.bp_grp_cd6.eq(S0_SPPL_GRP6.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP6.value()).eq(S0_SPPL_GRP6.bp_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_SPPL_GRP6.bp_grp_nm.like(bind("sppl_grp_nm6")))),
				when(boundOr("sppl_grp_flg7"))
					.select(DS0D, S0_SPPL.bp_grp_cd7.as("sppl_grp_cd7"))
					.groupBy(DS0D, S0_SPPL.bp_grp_cd7),
				when(boundOr("sppl_grp_flg7", "sppl_grp_cd7"))
					.predicate(DS0D, p -> p.cutoff$and(S0_SPPL.bp_grp_cd7.like(bind("sppl_grp_cd7")))),
				when(boundOr("sppl_grp_flg7"))
					.select(DS0D, S0_SPPL_GRP7.bp_grp_nm.as("sppl_grp_nm7"))
					.groupBy(DS0D, S0_SPPL_GRP7.bp_grp_nm),
				when(boundOr("sppl_grp_flg7", "sppl_grp_nm7"))
					.view(DS0D, v -> v.leftOuterJoin(S0_SPPL_GRP7).on(S0_SPPL.bp_grp_cd7.eq(S0_SPPL_GRP7.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP7.value()).eq(S0_SPPL_GRP7.bp_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_SPPL_GRP7.bp_grp_nm.like(bind("sppl_grp_nm7")))),
				when(boundOr("sppl_grp_flg8"))
					.select(DS0D, S0_SPPL.bp_grp_cd8.as("sppl_grp_cd8"))
					.groupBy(DS0D, S0_SPPL.bp_grp_cd8),
				when(boundOr("sppl_grp_flg8", "sppl_grp_cd8"))
					.predicate(DS0D, p -> p.cutoff$and(S0_SPPL.bp_grp_cd8.like(bind("sppl_grp_cd8")))),
				when(boundOr("sppl_grp_flg8"))
					.select(DS0D, S0_SPPL_GRP8.bp_grp_nm.as("sppl_grp_nm8"))
					.groupBy(DS0D, S0_SPPL_GRP8.bp_grp_nm),
				when(boundOr("sppl_grp_flg8", "sppl_grp_nm8"))
					.view(DS0D, v -> v.leftOuterJoin(S0_SPPL_GRP8).on(S0_SPPL.bp_grp_cd8.eq(S0_SPPL_GRP8.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP8.value()).eq(S0_SPPL_GRP8.bp_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_SPPL_GRP8.bp_grp_nm.like(bind("sppl_grp_nm8")))),
				when(boundOr("sppl_grp_flg9"))
					.select(DS0D, S0_SPPL.bp_grp_cd9.as("sppl_grp_cd9"))
					.groupBy(DS0D, S0_SPPL.bp_grp_cd9),
				when(boundOr("sppl_grp_flg9", "sppl_grp_cd9"))
					.predicate(DS0D, p -> p.cutoff$and(S0_SPPL.bp_grp_cd9.like(bind("sppl_grp_cd9")))),
				when(boundOr("sppl_grp_flg9"))
					.select(DS0D, S0_SPPL_GRP9.bp_grp_nm.as("sppl_grp_nm9"))
					.groupBy(DS0D, S0_SPPL_GRP9.bp_grp_nm),
				when(boundOr("sppl_grp_flg9", "sppl_grp_nm9"))
					.view(DS0D, v -> v.leftOuterJoin(S0_SPPL_GRP9).on(S0_SPPL.bp_grp_cd9.eq(S0_SPPL_GRP9.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP9.value()).eq(S0_SPPL_GRP9.bp_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_SPPL_GRP9.bp_grp_nm.like(bind("sppl_grp_nm9")))),
				when(boundOr("sppl_grp_flg10"))
					.select(DS0D, S0_SPPL.bp_grp_cd10.as("sppl_grp_cd10"))
					.groupBy(DS0D, S0_SPPL.bp_grp_cd10),
				when(boundOr("sppl_grp_flg10", "sppl_grp_cd10"))
					.predicate(DS0D, p -> p.cutoff$and(S0_SPPL.bp_grp_cd10.like(bind("sppl_grp_cd10")))),
				when(boundOr("sppl_grp_flg10"))
					.select(DS0D, S0_SPPL_GRP10.bp_grp_nm.as("sppl_grp_nm10"))
					.groupBy(DS0D, S0_SPPL_GRP10.bp_grp_nm),
				when(boundOr("sppl_grp_flg10", "sppl_grp_nm10"))
					.view(DS0D, v -> v.leftOuterJoin(S0_SPPL_GRP10).on(S0_SPPL.bp_grp_cd10.eq(S0_SPPL_GRP10.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP10.value()).eq(S0_SPPL_GRP10.bp_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_SPPL_GRP10.bp_grp_nm.like(bind("sppl_grp_nm10")))),
				when(boundOr("acst_grp_flg1", "acst_grp_flg2", "acst_grp_flg3", "acst_grp_flg4", "acst_grp_flg5", "acst_grp_flg6", "acst_grp_flg7", "acst_grp_flg8", "acst_grp_flg9", "acst_grp_flg10"))
					.view(DS0D, v -> v.leftOuterJoin(S0_ACST).on(S0_ACST.bp_cd.eq(nvl(S0_V1.pr(S1_T1.acst_cd),S0_CST.acst_cd)))),
				when(boundOr("acst_grp_flg1"))
					.select(DS0D, S0_ACST.bp_grp_cd1.as("acst_grp_cd1"))
					.groupBy(DS0D, S0_ACST.bp_grp_cd1),
				when(boundOr("acst_grp_flg1", "acst_grp_cd1"))
					.predicate(DS0D, p -> p.cutoff$and(S0_ACST.bp_grp_cd1.like(bind("acst_grp_cd1")))),
				when(boundOr("acst_grp_flg1"))
					.select(DS0D, S0_ACST_GRP1.bp_grp_nm.as("acst_grp_nm1"))
					.groupBy(DS0D, S0_ACST_GRP1.bp_grp_nm),
				when(boundOr("acst_grp_flg1", "acst_grp_nm1"))
					.view(DS0D, v -> v.leftOuterJoin(S0_ACST_GRP1).on(S0_ACST.bp_grp_cd1.eq(S0_ACST_GRP1.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP1.value()).eq(S0_ACST_GRP1.bp_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_ACST_GRP1.bp_grp_nm.like(bind("acst_grp_nm1")))),
				when(boundOr("acst_grp_flg2"))
					.select(DS0D, S0_ACST.bp_grp_cd2.as("acst_grp_cd2"))
					.groupBy(DS0D, S0_ACST.bp_grp_cd2),
				when(boundOr("acst_grp_flg2", "acst_grp_cd2"))
					.predicate(DS0D, p -> p.cutoff$and(S0_ACST.bp_grp_cd2.like(bind("acst_grp_cd2")))),
				when(boundOr("acst_grp_flg2"))
					.select(DS0D, S0_ACST_GRP2.bp_grp_nm.as("acst_grp_nm2"))
					.groupBy(DS0D, S0_ACST_GRP2.bp_grp_nm),
				when(boundOr("acst_grp_flg2", "acst_grp_nm2"))
					.view(DS0D, v -> v.leftOuterJoin(S0_ACST_GRP2).on(S0_ACST.bp_grp_cd2.eq(S0_ACST_GRP2.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP2.value()).eq(S0_ACST_GRP2.bp_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_ACST_GRP2.bp_grp_nm.like(bind("acst_grp_nm2")))),
				when(boundOr("acst_grp_flg3"))
					.select(DS0D, S0_ACST.bp_grp_cd3.as("acst_grp_cd3"))
					.groupBy(DS0D, S0_ACST.bp_grp_cd3),
				when(boundOr("acst_grp_flg3", "acst_grp_cd3"))
					.predicate(DS0D, p -> p.cutoff$and(S0_ACST.bp_grp_cd3.like(bind("acst_grp_cd3")))),
				when(boundOr("acst_grp_flg3"))
					.select(DS0D, S0_ACST_GRP3.bp_grp_nm.as("acst_grp_nm3"))
					.groupBy(DS0D, S0_ACST_GRP3.bp_grp_nm),
				when(boundOr("acst_grp_flg3", "acst_grp_nm3"))
					.view(DS0D, v -> v.leftOuterJoin(S0_ACST_GRP3).on(S0_ACST.bp_grp_cd3.eq(S0_ACST_GRP3.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP3.value()).eq(S0_ACST_GRP3.bp_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_ACST_GRP3.bp_grp_nm.like(bind("acst_grp_nm3")))),
				when(boundOr("acst_grp_flg4"))
					.select(DS0D, S0_ACST.bp_grp_cd4.as("acst_grp_cd4"))
					.groupBy(DS0D, S0_ACST.bp_grp_cd4),
				when(boundOr("acst_grp_flg4", "acst_grp_cd4"))
					.predicate(DS0D, p -> p.cutoff$and(S0_ACST.bp_grp_cd4.like(bind("acst_grp_cd4")))),
				when(boundOr("acst_grp_flg4"))
					.select(DS0D, S0_ACST_GRP4.bp_grp_nm.as("acst_grp_nm4"))
					.groupBy(DS0D, S0_ACST_GRP4.bp_grp_nm),
				when(boundOr("acst_grp_flg4", "acst_grp_nm4"))
					.view(DS0D, v -> v.leftOuterJoin(S0_ACST_GRP4).on(S0_ACST.bp_grp_cd4.eq(S0_ACST_GRP4.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP4.value()).eq(S0_ACST_GRP4.bp_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_ACST_GRP4.bp_grp_nm.like(bind("acst_grp_nm4")))),
				when(boundOr("acst_grp_flg5"))
					.select(DS0D, S0_ACST.bp_grp_cd5.as("acst_grp_cd5"))
					.groupBy(DS0D, S0_ACST.bp_grp_cd5),
				when(boundOr("acst_grp_flg5", "acst_grp_cd5"))
					.predicate(DS0D, p -> p.cutoff$and(S0_ACST.bp_grp_cd5.like(bind("acst_grp_cd5")))),
				when(boundOr("acst_grp_flg5"))
					.select(DS0D, S0_ACST_GRP5.bp_grp_nm.as("acst_grp_nm5"))
					.groupBy(DS0D, S0_ACST_GRP5.bp_grp_nm),
				when(boundOr("acst_grp_flg5", "acst_grp_nm5"))
					.view(DS0D, v -> v.leftOuterJoin(S0_ACST_GRP5).on(S0_ACST.bp_grp_cd5.eq(S0_ACST_GRP5.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP5.value()).eq(S0_ACST_GRP5.bp_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_ACST_GRP5.bp_grp_nm.like(bind("acst_grp_nm5")))),
				when(boundOr("acst_grp_flg6"))
					.select(DS0D, S0_ACST.bp_grp_cd6.as("acst_grp_cd6"))
					.groupBy(DS0D, S0_ACST.bp_grp_cd6),
				when(boundOr("acst_grp_flg6", "acst_grp_cd6"))
					.predicate(DS0D, p -> p.cutoff$and(S0_ACST.bp_grp_cd6.like(bind("acst_grp_cd6")))),
				when(boundOr("acst_grp_flg6"))
					.select(DS0D, S0_ACST_GRP6.bp_grp_nm.as("acst_grp_nm6"))
					.groupBy(DS0D, S0_ACST_GRP6.bp_grp_nm),
				when(boundOr("acst_grp_flg6", "acst_grp_nm6"))
					.view(DS0D, v -> v.leftOuterJoin(S0_ACST_GRP6).on(S0_ACST.bp_grp_cd6.eq(S0_ACST_GRP6.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP6.value()).eq(S0_ACST_GRP6.bp_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_ACST_GRP6.bp_grp_nm.like(bind("acst_grp_nm6")))),
				when(boundOr("acst_grp_flg7"))
					.select(DS0D, S0_ACST.bp_grp_cd7.as("acst_grp_cd7"))
					.groupBy(DS0D, S0_ACST.bp_grp_cd7),
				when(boundOr("acst_grp_flg7", "acst_grp_cd7"))
					.predicate(DS0D, p -> p.cutoff$and(S0_ACST.bp_grp_cd7.like(bind("acst_grp_cd7")))),
				when(boundOr("acst_grp_flg7"))
					.select(DS0D, S0_ACST_GRP7.bp_grp_nm.as("acst_grp_nm7"))
					.groupBy(DS0D, S0_ACST_GRP7.bp_grp_nm),
				when(boundOr("acst_grp_flg7", "acst_grp_nm7"))
					.view(DS0D, v -> v.leftOuterJoin(S0_ACST_GRP7).on(S0_ACST.bp_grp_cd7.eq(S0_ACST_GRP7.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP7.value()).eq(S0_ACST_GRP7.bp_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_ACST_GRP7.bp_grp_nm.like(bind("acst_grp_nm7")))),
				when(boundOr("acst_grp_flg8"))
					.select(DS0D, S0_ACST.bp_grp_cd8.as("acst_grp_cd8"))
					.groupBy(DS0D, S0_ACST.bp_grp_cd8),
				when(boundOr("acst_grp_flg8", "acst_grp_cd8"))
					.predicate(DS0D, p -> p.cutoff$and(S0_ACST.bp_grp_cd8.like(bind("acst_grp_cd8")))),
				when(boundOr("acst_grp_flg8"))
					.select(DS0D, S0_ACST_GRP8.bp_grp_nm.as("acst_grp_nm8"))
					.groupBy(DS0D, S0_ACST_GRP8.bp_grp_nm),
				when(boundOr("acst_grp_flg8", "acst_grp_nm8"))
					.view(DS0D, v -> v.leftOuterJoin(S0_ACST_GRP8).on(S0_ACST.bp_grp_cd8.eq(S0_ACST_GRP8.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP8.value()).eq(S0_ACST_GRP8.bp_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_ACST_GRP8.bp_grp_nm.like(bind("acst_grp_nm8")))),
				when(boundOr("acst_grp_flg9"))
					.select(DS0D, S0_ACST.bp_grp_cd9.as("acst_grp_cd9"))
					.groupBy(DS0D, S0_ACST.bp_grp_cd9),
				when(boundOr("acst_grp_flg9", "acst_grp_cd9"))
					.predicate(DS0D, p -> p.cutoff$and(S0_ACST.bp_grp_cd9.like(bind("acst_grp_cd9")))),
				when(boundOr("acst_grp_flg9"))
					.select(DS0D, S0_ACST_GRP9.bp_grp_nm.as("acst_grp_nm9"))
					.groupBy(DS0D, S0_ACST_GRP9.bp_grp_nm),
				when(boundOr("acst_grp_flg9", "acst_grp_nm9"))
					.view(DS0D, v -> v.leftOuterJoin(S0_ACST_GRP9).on(S0_ACST.bp_grp_cd9.eq(S0_ACST_GRP9.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP9.value()).eq(S0_ACST_GRP9.bp_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_ACST_GRP9.bp_grp_nm.like(bind("acst_grp_nm9")))),
				when(boundOr("acst_grp_flg10"))
					.select(DS0D, S0_ACST.bp_grp_cd10.as("acst_grp_cd10"))
					.groupBy(DS0D, S0_ACST.bp_grp_cd10),
				when(boundOr("acst_grp_flg10", "acst_grp_cd10"))
					.predicate(DS0D, p -> p.cutoff$and(S0_ACST.bp_grp_cd10.like(bind("acst_grp_cd10")))),
				when(boundOr("acst_grp_flg10"))
					.select(DS0D, S0_ACST_GRP10.bp_grp_nm.as("acst_grp_nm10"))
					.groupBy(DS0D, S0_ACST_GRP10.bp_grp_nm),
				when(boundOr("acst_grp_flg10", "acst_grp_nm10"))
					.view(DS0D, v -> v.leftOuterJoin(S0_ACST_GRP10).on(S0_ACST.bp_grp_cd10.eq(S0_ACST_GRP10.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP10.value()).eq(S0_ACST_GRP10.bp_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_ACST_GRP10.bp_grp_nm.like(bind("acst_grp_nm10")))),
				when(boundOr("dlv_nm", "dlv_grp_flg1", "dlv_grp_flg2", "dlv_grp_flg3", "dlv_grp_flg4", "dlv_grp_flg5", "dlv_grp_flg6", "dlv_grp_flg7", "dlv_grp_flg8", "dlv_grp_flg9", "dlv_grp_flg10"))
					.view(DS0D, v -> v.leftOuterJoin(S0_DLV).on(S0_DLV.bp_cd.eq(S0_V1.pr(S1_T2.dlv_cd))))
					.predicate(DS0D, p -> p.cutoff$and(nvl(S0_V1.pr(S1_T2.dlv_nm),S0_DLV.bp_nm).like(bind("dlv_nm")))),
				when(boundOr("dlv_grp_flg1"))
					.select(DS0D, S0_DLV.bp_grp_cd1.as("dlv_grp_cd1"))
					.groupBy(DS0D, S0_DLV.bp_grp_cd1),
				when(boundOr("dlv_grp_flg1", "dlv_grp_cd1"))
					.predicate(DS0D, p -> p.cutoff$and(S0_DLV.bp_grp_cd1.like(bind("dlv_grp_cd1")))),
				when(boundOr("dlv_grp_flg1"))
					.select(DS0D, S0_DLV_GRP1.bp_grp_nm.as("dlv_grp_nm1"))
					.groupBy(DS0D, S0_DLV_GRP1.bp_grp_nm),
				when(boundOr("dlv_grp_flg1", "dlv_grp_nm1"))
					.view(DS0D, v -> v.leftOuterJoin(S0_DLV_GRP1).on(S0_DLV.bp_grp_cd1.eq(S0_DLV_GRP1.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP1.value()).eq(S0_DLV_GRP1.bp_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_DLV_GRP1.bp_grp_nm.like(bind("dlv_grp_nm1")))),
				when(boundOr("dlv_grp_flg2"))
					.select(DS0D, S0_DLV.bp_grp_cd2.as("dlv_grp_cd2"))
					.groupBy(DS0D, S0_DLV.bp_grp_cd2),
				when(boundOr("dlv_grp_flg2", "dlv_grp_cd2"))
					.predicate(DS0D, p -> p.cutoff$and(S0_DLV.bp_grp_cd2.like(bind("dlv_grp_cd2")))),
				when(boundOr("dlv_grp_flg2"))
					.select(DS0D, S0_DLV_GRP2.bp_grp_nm.as("dlv_grp_nm2"))
					.groupBy(DS0D, S0_DLV_GRP2.bp_grp_nm),
				when(boundOr("dlv_grp_flg2", "dlv_grp_nm2"))
					.view(DS0D, v -> v.leftOuterJoin(S0_DLV_GRP2).on(S0_DLV.bp_grp_cd2.eq(S0_DLV_GRP2.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP2.value()).eq(S0_DLV_GRP2.bp_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_DLV_GRP2.bp_grp_nm.like(bind("dlv_grp_nm2")))),
				when(boundOr("dlv_grp_flg3"))
					.select(DS0D, S0_DLV.bp_grp_cd3.as("dlv_grp_cd3"))
					.groupBy(DS0D, S0_DLV.bp_grp_cd3),
				when(boundOr("dlv_grp_flg3", "dlv_grp_cd3"))
					.predicate(DS0D, p -> p.cutoff$and(S0_DLV.bp_grp_cd3.like(bind("dlv_grp_cd3")))),
				when(boundOr("dlv_grp_flg3"))
					.select(DS0D, S0_DLV_GRP3.bp_grp_nm.as("dlv_grp_nm3"))
					.groupBy(DS0D, S0_DLV_GRP3.bp_grp_nm),
				when(boundOr("dlv_grp_flg3", "dlv_grp_nm3"))
					.view(DS0D, v -> v.leftOuterJoin(S0_DLV_GRP3).on(S0_DLV.bp_grp_cd3.eq(S0_DLV_GRP3.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP3.value()).eq(S0_DLV_GRP3.bp_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_DLV_GRP3.bp_grp_nm.like(bind("dlv_grp_nm3")))),
				when(boundOr("dlv_grp_flg4"))
					.select(DS0D, S0_DLV.bp_grp_cd4.as("dlv_grp_cd4"))
					.groupBy(DS0D, S0_DLV.bp_grp_cd4),
				when(boundOr("dlv_grp_flg4", "dlv_grp_cd4"))
					.predicate(DS0D, p -> p.cutoff$and(S0_DLV.bp_grp_cd4.like(bind("dlv_grp_cd4")))),
				when(boundOr("dlv_grp_flg4"))
					.select(DS0D, S0_DLV_GRP4.bp_grp_nm.as("dlv_grp_nm4"))
					.groupBy(DS0D, S0_DLV_GRP4.bp_grp_nm),
				when(boundOr("dlv_grp_flg4", "dlv_grp_nm4"))
					.view(DS0D, v -> v.leftOuterJoin(S0_DLV_GRP4).on(S0_DLV.bp_grp_cd4.eq(S0_DLV_GRP4.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP4.value()).eq(S0_DLV_GRP4.bp_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_DLV_GRP4.bp_grp_nm.like(bind("dlv_grp_nm4")))),
				when(boundOr("dlv_grp_flg5"))
					.select(DS0D, S0_DLV.bp_grp_cd5.as("dlv_grp_cd5"))
					.groupBy(DS0D, S0_DLV.bp_grp_cd5),
				when(boundOr("dlv_grp_flg5", "dlv_grp_cd5"))
					.predicate(DS0D, p -> p.cutoff$and(S0_DLV.bp_grp_cd5.like(bind("dlv_grp_cd5")))),
				when(boundOr("dlv_grp_flg5"))
					.select(DS0D, S0_DLV_GRP5.bp_grp_nm.as("dlv_grp_nm5"))
					.groupBy(DS0D, S0_DLV_GRP5.bp_grp_nm),
				when(boundOr("dlv_grp_flg5", "dlv_grp_nm5"))
					.view(DS0D, v -> v.leftOuterJoin(S0_DLV_GRP5).on(S0_DLV.bp_grp_cd5.eq(S0_DLV_GRP5.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP5.value()).eq(S0_DLV_GRP5.bp_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_DLV_GRP5.bp_grp_nm.like(bind("dlv_grp_nm5")))),
				when(boundOr("dlv_grp_flg6"))
					.select(DS0D, S0_DLV.bp_grp_cd6.as("dlv_grp_cd6"))
					.groupBy(DS0D, S0_DLV.bp_grp_cd6),
				when(boundOr("dlv_grp_flg6", "dlv_grp_cd6"))
					.predicate(DS0D, p -> p.cutoff$and(S0_DLV.bp_grp_cd6.like(bind("dlv_grp_cd6")))),
				when(boundOr("dlv_grp_flg6"))
					.select(DS0D, S0_DLV_GRP6.bp_grp_nm.as("dlv_grp_nm6"))
					.groupBy(DS0D, S0_DLV_GRP6.bp_grp_nm),
				when(boundOr("dlv_grp_flg6", "dlv_grp_nm6"))
					.view(DS0D, v -> v.leftOuterJoin(S0_DLV_GRP6).on(S0_DLV.bp_grp_cd6.eq(S0_DLV_GRP6.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP6.value()).eq(S0_DLV_GRP6.bp_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_DLV_GRP6.bp_grp_nm.like(bind("dlv_grp_nm6")))),
				when(boundOr("dlv_grp_flg7"))
					.select(DS0D, S0_DLV.bp_grp_cd7.as("dlv_grp_cd7"))
					.groupBy(DS0D, S0_DLV.bp_grp_cd7),
				when(boundOr("dlv_grp_flg7", "dlv_grp_cd7"))
					.predicate(DS0D, p -> p.cutoff$and(S0_DLV.bp_grp_cd7.like(bind("dlv_grp_cd7")))),
				when(boundOr("dlv_grp_flg7"))
					.select(DS0D, S0_DLV_GRP7.bp_grp_nm.as("dlv_grp_nm7"))
					.groupBy(DS0D, S0_DLV_GRP7.bp_grp_nm),
				when(boundOr("dlv_grp_flg7", "dlv_grp_nm7"))
					.view(DS0D, v -> v.leftOuterJoin(S0_DLV_GRP7).on(S0_DLV.bp_grp_cd7.eq(S0_DLV_GRP7.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP7.value()).eq(S0_DLV_GRP7.bp_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_DLV_GRP7.bp_grp_nm.like(bind("dlv_grp_nm7")))),
				when(boundOr("dlv_grp_flg8"))
					.select(DS0D, S0_DLV.bp_grp_cd8.as("dlv_grp_cd8"))
					.groupBy(DS0D, S0_DLV.bp_grp_cd8),
				when(boundOr("dlv_grp_flg8", "dlv_grp_cd8"))
					.predicate(DS0D, p -> p.cutoff$and(S0_DLV.bp_grp_cd8.like(bind("dlv_grp_cd8")))),
				when(boundOr("dlv_grp_flg8"))
					.select(DS0D, S0_DLV_GRP8.bp_grp_nm.as("dlv_grp_nm8"))
					.groupBy(DS0D, S0_DLV_GRP8.bp_grp_nm),
				when(boundOr("dlv_grp_flg8", "dlv_grp_nm8"))
					.view(DS0D, v -> v.leftOuterJoin(S0_DLV_GRP8).on(S0_DLV.bp_grp_cd8.eq(S0_DLV_GRP8.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP8.value()).eq(S0_DLV_GRP8.bp_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_DLV_GRP8.bp_grp_nm.like(bind("dlv_grp_nm8")))),
				when(boundOr("dlv_grp_flg9"))
					.select(DS0D, S0_DLV.bp_grp_cd9.as("dlv_grp_cd9"))
					.groupBy(DS0D, S0_DLV.bp_grp_cd9),
				when(boundOr("dlv_grp_flg9", "dlv_grp_cd9"))
					.predicate(DS0D, p -> p.cutoff$and(S0_DLV.bp_grp_cd9.like(bind("dlv_grp_cd9")))),
				when(boundOr("dlv_grp_flg9"))
					.select(DS0D, S0_DLV_GRP9.bp_grp_nm.as("dlv_grp_nm9"))
					.groupBy(DS0D, S0_DLV_GRP9.bp_grp_nm),
				when(boundOr("dlv_grp_flg9", "dlv_grp_nm9"))
					.view(DS0D, v -> v.leftOuterJoin(S0_DLV_GRP9).on(S0_DLV.bp_grp_cd9.eq(S0_DLV_GRP9.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP9.value()).eq(S0_DLV_GRP9.bp_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_DLV_GRP9.bp_grp_nm.like(bind("dlv_grp_nm9")))),
				when(boundOr("dlv_grp_flg10"))
					.select(DS0D, S0_DLV.bp_grp_cd10.as("dlv_grp_cd10"))
					.groupBy(DS0D, S0_DLV.bp_grp_cd10),
				when(boundOr("dlv_grp_flg10", "dlv_grp_cd10"))
					.predicate(DS0D, p -> p.cutoff$and(S0_DLV.bp_grp_cd10.like(bind("dlv_grp_cd10")))),
				when(boundOr("dlv_grp_flg10"))
					.select(DS0D, S0_DLV_GRP10.bp_grp_nm.as("dlv_grp_nm10"))
					.groupBy(DS0D, S0_DLV_GRP10.bp_grp_nm),
				when(boundOr("dlv_grp_flg10", "dlv_grp_nm10"))
					.view(DS0D, v -> v.leftOuterJoin(S0_DLV_GRP10).on(S0_DLV.bp_grp_cd10.eq(S0_DLV_GRP10.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP10.value()).eq(S0_DLV_GRP10.bp_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_DLV_GRP10.bp_grp_nm.like(bind("dlv_grp_nm10")))),
				when(boundOr("itm_nm", "itm_typ", "itm_typ_d_cd", "itm_typ_d_nm", "itm_grp_flg1", "itm_grp_flg2", "itm_grp_flg3", "itm_grp_flg4", "itm_grp_flg5", "itm_grp_flg6", "itm_grp_flg7", "itm_grp_flg8", "itm_grp_flg9", "itm_grp_flg10"))
					.view(DS0D, v -> v.leftOuterJoin(S0_ITM).on(S0_ITM.itm_cd.eq(S0_V1.pr(S1_T2.itm_cd)).and(S0_ITM.itm_sub1.eq(S0_V1.pr(S1_T2.itm_sub1))).and(S0_ITM.itm_sub2.eq(S0_V1.pr(S1_T2.itm_sub2))).and(S0_ITM.itm_sub3.eq(S0_V1.pr(S1_T2.itm_sub3)))))
					.predicate(DS0D, p -> p.cutoff$and(nvl(S0_V1.pr(S1_T2.itm_nm),S0_ITM.itm_nm).like(bind("itm_nm"))).cutoff$and(S0_ITM.itm_typ.like(bind("itm_typ"))).cutoff$and(S0_ITM.itm_typ_d_cd.like(bind("itm_typ_d_cd")))),
				when(boundOr("itm_grp_flg1"))
					.select(DS0D, S0_ITM.itm_grp_cd1.as("itm_grp_cd1"))
					.groupBy(DS0D, S0_ITM.itm_grp_cd1),
				when(boundOr("itm_grp_flg1", "itm_grp_cd1"))
					.predicate(DS0D, p -> p.cutoff$and(S0_ITM.itm_grp_cd1.like(bind("itm_grp_cd1")))),
				when(boundOr("itm_grp_flg1"))
					.select(DS0D, S0_ITM_GRP1.itm_grp_nm.as("itm_grp_nm1"))
					.groupBy(DS0D, S0_ITM_GRP1.itm_grp_nm),
				when(boundOr("itm_grp_flg1", "itm_grp_nm1"))
					.view(DS0D, v -> v.leftOuterJoin(S0_ITM_GRP1).on(S0_ITM.itm_grp_cd1.eq(S0_ITM_GRP1.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP1.value()).eq(S0_ITM_GRP1.itm_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_ITM_GRP1.itm_grp_nm.like(bind("itm_grp_nm1")))),
				when(boundOr("itm_grp_flg2"))
					.select(DS0D, S0_ITM.itm_grp_cd2.as("itm_grp_cd2"))
					.groupBy(DS0D, S0_ITM.itm_grp_cd2),
				when(boundOr("itm_grp_flg2", "itm_grp_cd2"))
					.predicate(DS0D, p -> p.cutoff$and(S0_ITM.itm_grp_cd2.like(bind("itm_grp_cd2")))),
				when(boundOr("itm_grp_flg2"))
					.select(DS0D, S0_ITM_GRP2.itm_grp_nm.as("itm_grp_nm2"))
					.groupBy(DS0D, S0_ITM_GRP2.itm_grp_nm),
				when(boundOr("itm_grp_flg2", "itm_grp_nm2"))
					.view(DS0D, v -> v.leftOuterJoin(S0_ITM_GRP2).on(S0_ITM.itm_grp_cd2.eq(S0_ITM_GRP2.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP2.value()).eq(S0_ITM_GRP2.itm_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_ITM_GRP2.itm_grp_nm.like(bind("itm_grp_nm2")))),
				when(boundOr("itm_grp_flg3"))
					.select(DS0D, S0_ITM.itm_grp_cd3.as("itm_grp_cd3"))
					.groupBy(DS0D, S0_ITM.itm_grp_cd3),
				when(boundOr("itm_grp_flg3", "itm_grp_cd3"))
					.predicate(DS0D, p -> p.cutoff$and(S0_ITM.itm_grp_cd3.like(bind("itm_grp_cd3")))),
				when(boundOr("itm_grp_flg3"))
					.select(DS0D, S0_ITM_GRP3.itm_grp_nm.as("itm_grp_nm3"))
					.groupBy(DS0D, S0_ITM_GRP3.itm_grp_nm),
				when(boundOr("itm_grp_flg3", "itm_grp_nm3"))
					.view(DS0D, v -> v.leftOuterJoin(S0_ITM_GRP3).on(S0_ITM.itm_grp_cd3.eq(S0_ITM_GRP3.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP3.value()).eq(S0_ITM_GRP3.itm_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_ITM_GRP3.itm_grp_nm.like(bind("itm_grp_nm3")))),
				when(boundOr("itm_grp_flg4"))
					.select(DS0D, S0_ITM.itm_grp_cd4.as("itm_grp_cd4"))
					.groupBy(DS0D, S0_ITM.itm_grp_cd4),
				when(boundOr("itm_grp_flg4", "itm_grp_cd4"))
					.predicate(DS0D, p -> p.cutoff$and(S0_ITM.itm_grp_cd4.like(bind("itm_grp_cd4")))),
				when(boundOr("itm_grp_flg4"))
					.select(DS0D, S0_ITM_GRP4.itm_grp_nm.as("itm_grp_nm4"))
					.groupBy(DS0D, S0_ITM_GRP4.itm_grp_nm),
				when(boundOr("itm_grp_flg4", "itm_grp_nm4"))
					.view(DS0D, v -> v.leftOuterJoin(S0_ITM_GRP4).on(S0_ITM.itm_grp_cd4.eq(S0_ITM_GRP4.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP4.value()).eq(S0_ITM_GRP4.itm_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_ITM_GRP4.itm_grp_nm.like(bind("itm_grp_nm4")))),
				when(boundOr("itm_grp_flg5"))
					.select(DS0D, S0_ITM.itm_grp_cd5.as("itm_grp_cd5"))
					.groupBy(DS0D, S0_ITM.itm_grp_cd5),
				when(boundOr("itm_grp_flg5", "itm_grp_cd5"))
					.predicate(DS0D, p -> p.cutoff$and(S0_ITM.itm_grp_cd5.like(bind("itm_grp_cd5")))),
				when(boundOr("itm_grp_flg5"))
					.select(DS0D, S0_ITM_GRP5.itm_grp_nm.as("itm_grp_nm5"))
					.groupBy(DS0D, S0_ITM_GRP5.itm_grp_nm),
				when(boundOr("itm_grp_flg5", "itm_grp_nm5"))
					.view(DS0D, v -> v.leftOuterJoin(S0_ITM_GRP5).on(S0_ITM.itm_grp_cd5.eq(S0_ITM_GRP5.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP5.value()).eq(S0_ITM_GRP5.itm_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_ITM_GRP5.itm_grp_nm.like(bind("itm_grp_nm5")))),
				when(boundOr("itm_grp_flg6"))
					.select(DS0D, S0_ITM.itm_grp_cd6.as("itm_grp_cd6"))
					.groupBy(DS0D, S0_ITM.itm_grp_cd6),
				when(boundOr("itm_grp_flg6", "itm_grp_cd6"))
					.predicate(DS0D, p -> p.cutoff$and(S0_ITM.itm_grp_cd6.like(bind("itm_grp_cd6")))),
				when(boundOr("itm_grp_flg6"))
					.select(DS0D, S0_ITM_GRP6.itm_grp_nm.as("itm_grp_nm6"))
					.groupBy(DS0D, S0_ITM_GRP6.itm_grp_nm),
				when(boundOr("itm_grp_flg6", "itm_grp_nm6"))
					.view(DS0D, v -> v.leftOuterJoin(S0_ITM_GRP6).on(S0_ITM.itm_grp_cd6.eq(S0_ITM_GRP6.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP6.value()).eq(S0_ITM_GRP6.itm_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_ITM_GRP6.itm_grp_nm.like(bind("itm_grp_nm6")))),
				when(boundOr("itm_grp_flg7"))
					.select(DS0D, S0_ITM.itm_grp_cd7.as("itm_grp_cd7"))
					.groupBy(DS0D, S0_ITM.itm_grp_cd7),
				when(boundOr("itm_grp_flg7", "itm_grp_cd7"))
					.predicate(DS0D, p -> p.cutoff$and(S0_ITM.itm_grp_cd7.like(bind("itm_grp_cd7")))),
				when(boundOr("itm_grp_flg7"))
					.select(DS0D, S0_ITM_GRP7.itm_grp_nm.as("itm_grp_nm7"))
					.groupBy(DS0D, S0_ITM_GRP7.itm_grp_nm),
				when(boundOr("itm_grp_flg7", "itm_grp_nm7"))
					.view(DS0D, v -> v.leftOuterJoin(S0_ITM_GRP7).on(S0_ITM.itm_grp_cd7.eq(S0_ITM_GRP7.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP7.value()).eq(S0_ITM_GRP7.itm_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_ITM_GRP7.itm_grp_nm.like(bind("itm_grp_nm7")))),
				when(boundOr("itm_grp_flg8"))
					.select(DS0D, S0_ITM.itm_grp_cd8.as("itm_grp_cd8"))
					.groupBy(DS0D, S0_ITM.itm_grp_cd8),
				when(boundOr("itm_grp_flg8", "itm_grp_cd8"))
					.predicate(DS0D, p -> p.cutoff$and(S0_ITM.itm_grp_cd8.like(bind("itm_grp_cd8")))),
				when(boundOr("itm_grp_flg8"))
					.select(DS0D, S0_ITM_GRP8.itm_grp_nm.as("itm_grp_nm8"))
					.groupBy(DS0D, S0_ITM_GRP8.itm_grp_nm),
				when(boundOr("itm_grp_flg8", "itm_grp_nm8"))
					.view(DS0D, v -> v.leftOuterJoin(S0_ITM_GRP8).on(S0_ITM.itm_grp_cd8.eq(S0_ITM_GRP8.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP8.value()).eq(S0_ITM_GRP8.itm_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_ITM_GRP8.itm_grp_nm.like(bind("itm_grp_nm8")))),
				when(boundOr("itm_grp_flg9"))
					.select(DS0D, S0_ITM.itm_grp_cd9.as("itm_grp_cd9"))
					.groupBy(DS0D, S0_ITM.itm_grp_cd9),
				when(boundOr("itm_grp_flg9", "itm_grp_cd9"))
					.predicate(DS0D, p -> p.cutoff$and(S0_ITM.itm_grp_cd9.like(bind("itm_grp_cd9")))),
				when(boundOr("itm_grp_flg9"))
					.select(DS0D, S0_ITM_GRP9.itm_grp_nm.as("itm_grp_nm9"))
					.groupBy(DS0D, S0_ITM_GRP9.itm_grp_nm),
				when(boundOr("itm_grp_flg9", "itm_grp_nm9"))
					.view(DS0D, v -> v.leftOuterJoin(S0_ITM_GRP9).on(S0_ITM.itm_grp_cd9.eq(S0_ITM_GRP9.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP9.value()).eq(S0_ITM_GRP9.itm_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_ITM_GRP9.itm_grp_nm.like(bind("itm_grp_nm9")))),
				when(boundOr("itm_grp_flg10"))
					.select(DS0D, S0_ITM.itm_grp_cd10.as("itm_grp_cd10"))
					.groupBy(DS0D, S0_ITM.itm_grp_cd10),
				when(boundOr("itm_grp_flg10", "itm_grp_cd10"))
					.predicate(DS0D, p -> p.cutoff$and(S0_ITM.itm_grp_cd10.like(bind("itm_grp_cd10")))),
				when(boundOr("itm_grp_flg10"))
					.select(DS0D, S0_ITM_GRP10.itm_grp_nm.as("itm_grp_nm10"))
					.groupBy(DS0D, S0_ITM_GRP10.itm_grp_nm),
				when(boundOr("itm_grp_flg10", "itm_grp_nm10"))
					.view(DS0D, v -> v.leftOuterJoin(S0_ITM_GRP10).on(S0_ITM.itm_grp_cd10.eq(S0_ITM_GRP10.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP10.value()).eq(S0_ITM_GRP10.itm_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_ITM_GRP10.itm_grp_nm.like(bind("itm_grp_nm10")))),
				when(boundOr("trd_nm"))
					.view(DS0D, v -> v.leftOuterJoin(S0_TRD).on(S0_TRD.trd_cd.eq(S0_V1.pr(S1_T1.trd_cd))))
					.predicate(DS0D, p -> p.cutoff$and(S0_TRD.trd_nm.like(bind("trd_nm")))),
				when(boundOr("sls_usr_nm"))
					.view(DS0D, v -> v.leftOuterJoin(S0_SLS_USR).on(S0_SLS_USR.usr_cd.eq(S0_V1.pr(S1_T1.sls_usr_cd))))
					.predicate(DS0D, p -> p.cutoff$and(S0_SLS_USR.usr_nm.like(bind("sls_usr_nm")))),
				when(boundOr("sls_dpt_nm", "wg_cd", "wg_nm"))
					.view(DS0D, v -> v.leftOuterJoin(S0_SLS_DPT).on(S0_SLS_DPT.dpt_cd.eq(S0_V1.pr(S1_T1.sls_dpt_cd)).and(S0_V1.pr("master_dt").between(S0_SLS_DPT.st_dt, S0_SLS_DPT.end_dt))))
					.predicate(DS0D, p -> p.cutoff$and(S0_SLS_DPT.dpt_nm.like(bind("sls_dpt_nm"))).cutoff$and(nvl(S0_V1.pr(S1_T1.wg_cd),S0_SLS_DPT.wg_cd).like(bind("wg_cd")))),
				when(boundOr("wg_nm"))
					.view(DS0D, v -> v.leftOuterJoin(S0_SLS_DPT_WG).on(S0_SLS_DPT_WG.wg_cd.eq(nvl(S0_V1.pr(S1_T1.wg_cd),S0_SLS_DPT.wg_cd))))
					.predicate(DS0D, p -> p.cutoff$and(S0_SLS_DPT_WG.wg_nm.like(bind("wg_nm")))),
				when(boundOr("ship_lg_grp_nm"))
					.view(DS0D, v -> v.leftOuterJoin(S0_SHIP_LG_GRP).on(S0_SHIP_LG_GRP.lg_grp_cd.eq(S0_V1.pr(S1_T1.ship_lg_grp_cd))))
					.predicate(DS0D, p -> p.cutoff$and(S0_SHIP_LG_GRP.lg_grp_nm.like(bind("ship_lg_grp_nm")))),
				when(boundOr("dest_nm1"))
					.view(DS0D, v -> v.leftOuterJoin(S0_DEST1).on(S0_DEST1.bp_cd.eq(S0_V1.pr(S1_T2.dest_cd1))))
					.predicate(DS0D, p -> p.cutoff$and(S0_DEST1.bp_nm.like(bind("dest_nm1")))),
				when(boundOr("dest_nm2"))
					.view(DS0D, v -> v.leftOuterJoin(S0_DEST2).on(S0_DEST2.bp_cd.eq(S0_V1.pr(S1_T2.dest_cd2))))
					.predicate(DS0D, p -> p.cutoff$and(S0_DEST2.bp_nm.like(bind("dest_nm2")))),
				when(boundOr("dest_nm3"))
					.view(DS0D, v -> v.leftOuterJoin(S0_DEST3).on(S0_DEST3.bp_cd.eq(S0_V1.pr(S1_T2.dest_cd3))))
					.predicate(DS0D, p -> p.cutoff$and(S0_DEST3.bp_nm.like(bind("dest_nm3")))),
				when(boundOr("wrk_no", "wrk_nm"))
					.view(DS0D, v -> v.leftOuterJoin(S0_WRK_SNO).on(S0_WRK_SNO.sno1.eq(S0_V1.pr(S1_T2.sno1))))
					.predicate(DS0D, p -> p.cutoff$and(S0_WRK_SNO.wrk_no.like(bind("wrk_no"))).cutoff$and(S0_WRK_SNO.wrk_nm.like(bind("wrk_nm")))),
				when(boundOr("itm_typ_d_nm"))
					.view(DS0D, v -> v.leftOuterJoin(S0_ITM_TYP_D).on(S0_ITM_TYP_D.itm_typ.eq(S0_ITM.itm_typ).and(S0_ITM_TYP_D.itm_typ_d_cd.eq(S0_ITM.itm_typ_d_cd))))
					.predicate(DS0D, p -> p.cutoff$and(S0_ITM_TYP_D.itm_typ_d_nm.like(bind("itm_typ_d_nm"))))
			);
	}
	
	/**
	 * -- MSBBL1320_MST_SLS_ACT_Query_S02
	 */
	static MCQueryPlan MSBBL1320_MST_SLS_ACT_S02() {
		MCTempView S0_V1 = createTempView("V1");
		MAM_BP_R S0_CST = MAM_BP_R.create("CST");
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
		MAM_TRD_R S0_TRD = MAM_TRD_R.create("TRD");
		MAM_USR_R S0_SLS_USR = MAM_USR_R.create("SLS_USR");
		MAM_DPT_R S0_SLS_DPT = MAM_DPT_R.create("SLS_DPT");
		MAM_WG_R S0_SLS_DPT_WG = MAM_WG_R.create("SLS_DPT_WG");
		MAM_LG_GRP_R S0_SHIP_LG_GRP = MAM_LG_GRP_R.create("SHIP_LG_GRP");
		MAM_BP_R S0_ACST = MAM_BP_R.create("ACST");
		MAM_BP_GRP_R S0_ACST_GRP1 = MAM_BP_GRP_R.create("ACST_GRP1");
		MAM_BP_GRP_R S0_ACST_GRP2 = MAM_BP_GRP_R.create("ACST_GRP2");
		MAM_BP_GRP_R S0_ACST_GRP3 = MAM_BP_GRP_R.create("ACST_GRP3");
		MAM_BP_GRP_R S0_ACST_GRP4 = MAM_BP_GRP_R.create("ACST_GRP4");
		MAM_BP_GRP_R S0_ACST_GRP5 = MAM_BP_GRP_R.create("ACST_GRP5");
		MAM_BP_GRP_R S0_ACST_GRP6 = MAM_BP_GRP_R.create("ACST_GRP6");
		MAM_BP_GRP_R S0_ACST_GRP7 = MAM_BP_GRP_R.create("ACST_GRP7");
		MAM_BP_GRP_R S0_ACST_GRP8 = MAM_BP_GRP_R.create("ACST_GRP8");
		MAM_BP_GRP_R S0_ACST_GRP9 = MAM_BP_GRP_R.create("ACST_GRP9");
		MAM_BP_GRP_R S0_ACST_GRP10 = MAM_BP_GRP_R.create("ACST_GRP10");
		MST_SLS_ACT_R S1_T1 = MST_SLS_ACT_R.create("T1");
		MST_DLV_SLIP_R S1_T5 = MST_DLV_SLIP_R.create("T5");
		MAVM_RD_DPT_R S1_DAC = MAVM_RD_DPT_R.create("DAC");
		MST_SLS_ACT_D_R S2_TT1 = MST_SLS_ACT_D_R.create("TT1");
		MST_SLO_D_R S3_TT1 = MST_SLO_D_R.create("TT1");
		MST_SLS_ACT_D_R S3_TT2 = MST_SLS_ACT_D_R.create("TT2");
		MST_SLO_D_R S4_TT1 = MST_SLO_D_R.create("TT1");
		MST_SLS_ACT_D_R S4_TT2 = MST_SLS_ACT_D_R.create("TT2");
		MST_SLS_ACT_D_R S5_TT1 = MST_SLS_ACT_D_R.create("TT1");
		MST_SLS_SCHD_R S6_W = MST_SLS_SCHD_R.create("W");
		MST_SLS_ACT_D_R S7_TT1 = MST_SLS_ACT_D_R.create("TT1");
		MST_SLO_D_R S8_TT1 = MST_SLO_D_R.create("TT1");
		MST_SLS_ACT_D_R S8_TT2 = MST_SLS_ACT_D_R.create("TT2");
		MST_SLO_D_R S9_TT1 = MST_SLO_D_R.create("TT1");
		MST_SLS_ACT_D_R S9_TT2 = MST_SLS_ACT_D_R.create("TT2");
		MST_SLS_ACT_D_R S10_TT1 = MST_SLS_ACT_D_R.create("TT1");
		MST_SLO_D_R S11_TT1 = MST_SLO_D_R.create("TT1");
		MST_SLS_ACT_D_R S11_TT2 = MST_SLS_ACT_D_R.create("TT2");
		MST_SLO_D_R S12_TT1 = MST_SLO_D_R.create("TT1");
		MST_SLS_ACT_D_R S12_TT2 = MST_SLS_ACT_D_R.create("TT2");
		MST_SLS_ACT_D_R S13_TT1 = MST_SLS_ACT_D_R.create("TT1");
		MST_SLS_ACT_D_R S14_TT1 = MST_SLS_ACT_D_R.create("TT1");
		
		MCDynamicSQLID DS0D = createDynamicSQLID("DS0D");
		
		return createQueryPlan()
			.setQuery(
				sql("MSBBL1320_MST_SLS_ACT_Query_S02")
					.mainQuery()
					.select(
						S0_V1.prAll(),
						S0_CST.bp_nm.as("cst_nm"),
						S0_CST.cst_iv_flg,
						S0_CST.sls_amt_rnd_typ,
						S0_CST.sls_tax_rnd_typ,
						S0_CST.sls_upri_cng_flg.as("bp_sls_upri_cng_flg"),
						S0_CST.ar_dpt_typ,
						addDynamicSelect(DS0D)
					)
					.from(
						subQuery()
						.select(
							S1_T1.sls_dt,
							S1_T1.ac_dt,
							S1_T1.bill_basis_dt,
							S1_T1.rcv_schd_dt,
							trunc(
								S1_T1.ship_tm,
								MCDateFmt.DD
							).as("ship_dt"),
							S1_T1.ship_tm.as("ship_hm"),
							trunc(
								S1_T1.dlv_tm,
								MCDateFmt.DD
							).as("dlv_dt"),
							S1_T1.dlv_tm.as("dlv_hm"),
							S1_T1.trd_cd,
							S1_T1.trd_ptn_typ,
							S1_T1.sls_basis_typ,
							S1_T1.cst_cd,
							S1_T1.sls_usr_cd,
							S1_T1.sls_dpt_cd,
							S1_T1.wg_cd,
							S1_T1.trd_cur_cd,
							S1_T1.xrate,
							S1_T1.base_cur_cd,
							S1_T1.ptax_cur_cd,
							S1_T1.ptax_xrate,
							S1_T1.cst_po_no,
							S1_T1.dlv_slip_no,
							S1_T1.ship_dlv_slip_no,
							S1_T1.iv_no,
							S1_T1.ship_act_no,
							MAPA_DT$F_GET_AC_YM1(S1_T5.ac_dt).as("dlv_ac_ym"),
							S1_T1.sls_act_no,
							S1_T1.sls_act_rev,
							S1_T1.sls_act_seq,
							S1_T1.ac_ym.as("sls_basis_ym"),
							S1_T1.ac_dt.as("sls_basis_dt"),
							S1_T1.slo_no,
							S1_T1.qtn_no,
							S1_T1.qtn_rev,
							S1_T1.acst_cd,
							S1_T1.ar_dpt_cd,
							S1_T1.trd_rmrks,
							S1_T1.intr_rmrks,
							S1_T1.ddlv_sls_flg,
							S1_T1.ship_lg_grp_cd,
							S1_T1.sub_char1,
							S1_T1.sub_char2,
							S1_T1.sub_char3,
							S1_T1.ins_usr_id,
							S1_T1.ins_usr_nm,
							S1_T1.ins_func_id,
							S1_T1.ins_ts,
							S1_T1.upd_usr_id,
							S1_T1.upd_usr_nm,
							S1_T1.upd_func_id,
							S1_T1.upd_ts,
							S1_T1.upd_srv_req_no,
							S1_T1.ac_dt.as("master_dt"),
							S1_T1.edi_flg
						)
						.from(
							S1_T1
							.leftOuterJoin(S1_T5).on(
								S1_T1.dlv_slip_no.eq(S1_T5.dlv_slip_no)
								.and(S1_T5.slip_sts_typ.eq(value(MAC_SLIP_STS_TYP.CRT.value())))
							)
							.innerJoin(S1_DAC).on(S1_T1.sls_dpt_cd.eq(S1_DAC.dpt_cd))
						)
						.where(
							value(0).eq(value(0))
							.and(S1_T1.slip_sts_typ.eq(value(MAC_SLIP_STS_TYP.CRT.value())))
							.and(
								bracket(
									bind("arrv_sls_flg").eq(value(true))
									.and(S1_T1.sls_basis_typ.eq(value(MAC_SLS_BASIS_TYP.IN_BASIS.value())))
									.and(
										notExists(
											subQuery()
											.select(value("X"))
											.from(S2_TT1)
											.where(
												S1_T1.sls_act_no.eq(S2_TT1.sls_act_no)
												.and(S1_T1.sls_act_seq.eq(S2_TT1.sls_act_seq))
												.and(S2_TT1.purc_ddlv_po_no.isNotNull())
											)
										)
									)
									.and(
										exists(
											subQuery()
											.select(value("X"))
											.from(
												S3_TT1
												.innerJoin(S3_TT2).on(S3_TT2.slo_d_no.eq(S3_TT1.slo_d_no))
											)
											.where(
												S1_T1.sls_act_no.eq(S3_TT2.sls_act_no)
												.and(S1_T1.sls_act_seq.eq(S3_TT2.sls_act_seq))
												.and(S3_TT1.sls_cststk_flg.eq(value(false)))
											)
										)
										.or(S1_T1.slo_no.isNull())
									)
								)
								.or(
									bind("arrv_base_sls_flg").eq(value(true))
									.and(S1_T1.sls_basis_typ.eq(value(MAC_SLS_BASIS_TYP.ARRIVAL_BASIS.value())))
									.and(
										notExists(
											subQuery()
											.select(value("X"))
											.from(S2_TT1)
											.where(
												S1_T1.sls_act_no.eq(S2_TT1.sls_act_no)
												.and(S1_T1.sls_act_seq.eq(S2_TT1.sls_act_seq))
												.and(S2_TT1.purc_ddlv_po_no.isNotNull())
											)
										)
									)
									.and(
										exists(
											subQuery()
											.select(value("X"))
											.from(
												S3_TT1
												.innerJoin(S3_TT2).on(S3_TT2.slo_d_no.eq(S3_TT1.slo_d_no))
											)
											.where(
												S1_T1.sls_act_no.eq(S3_TT2.sls_act_no)
												.and(S1_T1.sls_act_seq.eq(S3_TT2.sls_act_seq))
												.and(S3_TT1.sls_cststk_flg.eq(value(false)))
											)
										)
										.or(S1_T1.slo_no.isNull())
									)
								)
								.or(
									bind("sls_cststk_flg").eq(value(true))
									.and(
										exists(
											subQuery()
											.select(value("X"))
											.from(
												S4_TT1
												.innerJoin(S4_TT2).on(S4_TT2.slo_d_no.eq(S4_TT1.slo_d_no))
											)
											.where(
												S1_T1.sls_act_no.eq(S4_TT2.sls_act_no)
												.and(S1_T1.sls_act_seq.eq(S4_TT2.sls_act_seq))
												.and(S4_TT1.sls_cststk_flg.eq(value(true)))
											)
										)
									)
								)
								.or(
									bind("sls_ddlv_flg").eq(value(true))
									.and(S1_T1.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.SLS.value())))
									.and(
										exists(
											subQuery()
											.select(value("X"))
											.from(S5_TT1)
											.where(
												S1_T1.sls_act_no.eq(S5_TT1.sls_act_no)
												.and(S1_T1.sls_act_seq.eq(S5_TT1.sls_act_seq))
												.and(S5_TT1.purc_ddlv_po_no.isNotNull())
											)
										)
										.or(
											decode(
												bracket(
													subQuery()
													.select(sign(count(S6_W.sls_schd_no)))
													.from(S6_W)
													.where(
														S1_T1.iv_no.eq(S6_W.iv_no)
														.and(S6_W.po_schd_no.isNotNull())
													)
												),
												value(0),
												value(false),
												value(true)
											).eq(value(true))
										)
									)
								)
								.or(
									bind("not_ship_ord_sls_flg").eq(value(true))
									.and(S1_T1.sls_basis_typ.eq(value(MAC_SLS_BASIS_TYP.SHIP_BASIS.value())))
									.and(
										notExists(
											subQuery()
											.select(value("X"))
											.from(S7_TT1)
											.where(
												S1_T1.sls_act_no.eq(S7_TT1.sls_act_no)
												.and(S1_T1.sls_act_seq.eq(S7_TT1.sls_act_seq))
												.and(S7_TT1.purc_ddlv_po_no.isNotNull())
											)
										)
									)
									.and(
										exists(
											subQuery()
											.select(value("X"))
											.from(
												S8_TT1
												.innerJoin(S8_TT2).on(S8_TT2.slo_d_no.eq(S8_TT1.slo_d_no))
											)
											.where(
												S1_T1.sls_act_no.eq(S8_TT2.sls_act_no)
												.and(S1_T1.sls_act_seq.eq(S8_TT2.sls_act_seq))
												.and(S8_TT1.sls_cststk_flg.eq(value(false)))
											)
										)
									)
									.and(
										exists(
											subQuery()
											.select(value("X"))
											.from(
												S9_TT1
												.innerJoin(S9_TT2).on(S9_TT2.slo_d_no.eq(S9_TT1.slo_d_no))
											)
											.where(
												S1_T1.sls_act_no.eq(S9_TT2.sls_act_no)
												.and(S1_T1.sls_act_seq.eq(S9_TT2.sls_act_seq))
												.and(S9_TT1.ship_inst_typ.eq(value(MAC_SHIP_INST_TYP.NON.value())))
											)
										)
									)
								)
								.or(
									bind("ship_ord_sls_flg").eq(value(true))
									.and(S1_T1.sls_basis_typ.eq(value(MAC_SLS_BASIS_TYP.SHIP_BASIS.value())))
									.and(
										notExists(
											subQuery()
											.select(value("X"))
											.from(S10_TT1)
											.where(
												S1_T1.sls_act_no.eq(S10_TT1.sls_act_no)
												.and(S1_T1.sls_act_seq.eq(S10_TT1.sls_act_seq))
												.and(S10_TT1.purc_ddlv_po_no.isNotNull())
											)
										)
									)
									.and(
										exists(
											subQuery()
											.select(value("X"))
											.from(
												S11_TT1
												.innerJoin(S11_TT2).on(S11_TT2.slo_d_no.eq(S11_TT1.slo_d_no))
											)
											.where(
												S1_T1.sls_act_no.eq(S11_TT2.sls_act_no)
												.and(S1_T1.sls_act_seq.eq(S11_TT2.sls_act_seq))
												.and(S11_TT1.sls_cststk_flg.eq(value(false)))
											)
										)
									)
									.and(
										exists(
											subQuery()
											.select(value("X"))
											.from(
												S12_TT1
												.innerJoin(S12_TT2).on(S12_TT2.slo_d_no.eq(S12_TT1.slo_d_no))
											)
											.where(
												S1_T1.sls_act_no.eq(S12_TT2.sls_act_no)
												.and(S1_T1.sls_act_seq.eq(S12_TT2.sls_act_seq))
												.and(S12_TT1.ship_inst_typ.neq(value(MAC_SHIP_INST_TYP.NON.value())))
											)
										)
									)
								)
								.or(
									bind("non_schd_flg").eq(value(true))
									.and(
										S1_T1.trd_ptn_typ.in(
											value(MAC_TRD_PTN_TYP.SLS.value()),
											value(MAC_TRD_PTN_TYP.SLS_CNSGN.value())
										)
									)
									.and(
										exists(
											subQuery()
											.select(value("X"))
											.from(S13_TT1)
											.where(
												S13_TT1.sls_act_no.eq(S1_T1.sls_act_no)
												.and(S13_TT1.sls_act_seq.eq(S1_T1.sls_act_seq))
												.and(
													S13_TT1.sls_schd_no.isNull()
													.or(
														S13_TT1.slo_no.isNull()
														.and(S1_T1.sls_basis_typ.neq(value(MAC_SLS_BASIS_TYP.IN_BASIS.value())))
														.and(S1_T1.sls_basis_typ.neq(value(MAC_SLS_BASIS_TYP.ARRIVAL_BASIS.value())))
													)
												)
											)
										)
									)
								)
							)
							.and(
								exists(
									subQuery()
									.select(value("X"))
									.from(S14_TT1)
									.where(
										S14_TT1.sls_act_no.eq(S1_T1.sls_act_no)
										.and(S14_TT1.sls_act_seq.eq(S1_T1.sls_act_seq))
										.and(S14_TT1.sls_schd_no.isNotNull())
									)
								)
								.or(bind("non_schd_flg").eq(value(true)))
							)
							.cutoff$and(S1_T1.dlv_slip_no.like(bind("dlv_slip_no")))
							.cutoff$and(S1_T1.ship_dlv_slip_no.like(bind("ship_dlv_slip_no")))
							.cutoff$and(S1_T1.ship_act_no.like(bind("ship_act_no")))
							.cutoff$and(S1_T1.iv_no.like(bind("iv_no")))
							.cutoff$and(S1_T1.slo_no.like(bind("slo_no")))
							.cutoff$and(S1_T1.sls_act_no.like(bind("sls_act_no")))
							.cutoff$and(S1_T1.ship_tm.gte(bind("ship_hm_fr")))
							.cutoff$and(S1_T1.ship_tm.lte(bind("ship_hm_to")))
							.cutoff$and(S1_T1.dlv_tm.gte(bind("dlv_hm_fr")))
							.cutoff$and(S1_T1.dlv_tm.lte(bind("dlv_hm_to")))
							.cutoff$and(S1_T1.sls_dt.gte(bind("sls_dt_fr")))
							.cutoff$and(S1_T1.sls_dt.lte(bind("sls_dt_to")))
							.cutoff$and(S1_T1.ac_dt.gte(bind("ac_dt_fr")))
							.cutoff$and(S1_T1.ac_dt.lte(bind("ac_dt_to")))
							.cutoff$and(S1_T1.cst_cd.like(bind("cst_cd")))
							.cutoff$and(S1_T1.cst_po_no.like(bind("cst_po_no")))
							.cutoff$and(S1_T1.sls_usr_cd.like(bind("sls_usr_cd")))
							.cutoff$and(S1_T1.sls_dpt_cd.like(bind("sls_dpt_cd")))
							.cutoff$and(S1_T1.wg_cd.like(bind("wg_cd")))
							.cutoff$and(S1_T1.trd_cd.like(bind("trd_cd")))
							.cutoff$and(S1_T1.trd_rmrks.like(bind("trd_rmrks")))
							.cutoff$and(S1_T1.intr_rmrks.like(bind("intr_rmrks")))
							.cutoff$and(S1_T1.ship_lg_grp_cd.like(bind("ship_lg_grp_cd")))
							.cutoff$and(S1_T1.sub_char1.like(bind("sub_char1")))
							.cutoff$and(S1_T1.sub_char2.like(bind("sub_char2")))
							.cutoff$and(S1_T1.sub_char3.like(bind("sub_char3")))
							.cutoff$and(S1_T1.edi_flg.eq(bind("edi_flg_str")))
						).view(S0_V1)
						.leftOuterJoin(S0_CST).on(S0_V1.pr(S1_T1.cst_cd).eq(S0_CST.bp_cd))
						.addDynamicView(DS0D)
					)
					.where(
						value(0).eq(value(0))
						.and(
							bracket(
								bind("iv_flg").eq(value(true))
								.and(S0_CST.cst_iv_flg.eq(value(true)))
							)
							.or(
								bind("not_iv_flg").eq(value(true))
								.and(S0_CST.cst_iv_flg.eq(value(false)))
							)
						)
						.cutoff$and(S0_CST.bp_nm.like(bind("cst_nm")))
						.addDynamicPredicate(DS0D)
					)
					.orderBy(S0_V1.pr(S1_T1.sls_act_no).asc())
			)
			.setDynamicSQLInfo(
				when(boundOr("cst_grp_flg1"))
					.select(DS0D, S0_CST.bp_grp_cd1.as("cst_grp_cd1"))
					.groupBy(DS0D, S0_CST.bp_grp_cd1),
				when(boundOr("cst_grp_flg1", "cst_grp_cd1"))
					.predicate(DS0D, p -> p.cutoff$and(S0_CST.bp_grp_cd1.like(bind("cst_grp_cd1")))),
				when(boundOr("cst_grp_flg1"))
					.select(DS0D, S0_CST_GRP1.bp_grp_nm.as("cst_grp_nm1"))
					.groupBy(DS0D, S0_CST_GRP1.bp_grp_nm),
				when(boundOr("cst_grp_flg1", "cst_grp_nm1"))
					.view(DS0D, v -> v.leftOuterJoin(S0_CST_GRP1).on(S0_CST.bp_grp_cd1.eq(S0_CST_GRP1.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP1.value()).eq(S0_CST_GRP1.bp_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_CST_GRP1.bp_grp_nm.like(bind("cst_grp_nm1")))),
				when(boundOr("cst_grp_flg2"))
					.select(DS0D, S0_CST.bp_grp_cd2.as("cst_grp_cd2"))
					.groupBy(DS0D, S0_CST.bp_grp_cd2),
				when(boundOr("cst_grp_flg2", "cst_grp_cd2"))
					.predicate(DS0D, p -> p.cutoff$and(S0_CST.bp_grp_cd2.like(bind("cst_grp_cd2")))),
				when(boundOr("cst_grp_flg2"))
					.select(DS0D, S0_CST_GRP2.bp_grp_nm.as("cst_grp_nm2"))
					.groupBy(DS0D, S0_CST_GRP2.bp_grp_nm),
				when(boundOr("cst_grp_flg2", "cst_grp_nm2"))
					.view(DS0D, v -> v.leftOuterJoin(S0_CST_GRP2).on(S0_CST.bp_grp_cd2.eq(S0_CST_GRP2.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP2.value()).eq(S0_CST_GRP2.bp_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_CST_GRP2.bp_grp_nm.like(bind("cst_grp_nm2")))),
				when(boundOr("cst_grp_flg3"))
					.select(DS0D, S0_CST.bp_grp_cd3.as("cst_grp_cd3"))
					.groupBy(DS0D, S0_CST.bp_grp_cd3),
				when(boundOr("cst_grp_flg3", "cst_grp_cd3"))
					.predicate(DS0D, p -> p.cutoff$and(S0_CST.bp_grp_cd3.like(bind("cst_grp_cd3")))),
				when(boundOr("cst_grp_flg3"))
					.select(DS0D, S0_CST_GRP3.bp_grp_nm.as("cst_grp_nm3"))
					.groupBy(DS0D, S0_CST_GRP3.bp_grp_nm),
				when(boundOr("cst_grp_flg3", "cst_grp_nm3"))
					.view(DS0D, v -> v.leftOuterJoin(S0_CST_GRP3).on(S0_CST.bp_grp_cd3.eq(S0_CST_GRP3.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP3.value()).eq(S0_CST_GRP3.bp_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_CST_GRP3.bp_grp_nm.like(bind("cst_grp_nm3")))),
				when(boundOr("cst_grp_flg4"))
					.select(DS0D, S0_CST.bp_grp_cd4.as("cst_grp_cd4"))
					.groupBy(DS0D, S0_CST.bp_grp_cd4),
				when(boundOr("cst_grp_flg4", "cst_grp_cd4"))
					.predicate(DS0D, p -> p.cutoff$and(S0_CST.bp_grp_cd4.like(bind("cst_grp_cd4")))),
				when(boundOr("cst_grp_flg4"))
					.select(DS0D, S0_CST_GRP4.bp_grp_nm.as("cst_grp_nm4"))
					.groupBy(DS0D, S0_CST_GRP4.bp_grp_nm),
				when(boundOr("cst_grp_flg4", "cst_grp_nm4"))
					.view(DS0D, v -> v.leftOuterJoin(S0_CST_GRP4).on(S0_CST.bp_grp_cd4.eq(S0_CST_GRP4.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP4.value()).eq(S0_CST_GRP4.bp_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_CST_GRP4.bp_grp_nm.like(bind("cst_grp_nm4")))),
				when(boundOr("cst_grp_flg5"))
					.select(DS0D, S0_CST.bp_grp_cd5.as("cst_grp_cd5"))
					.groupBy(DS0D, S0_CST.bp_grp_cd5),
				when(boundOr("cst_grp_flg5", "cst_grp_cd5"))
					.predicate(DS0D, p -> p.cutoff$and(S0_CST.bp_grp_cd5.like(bind("cst_grp_cd5")))),
				when(boundOr("cst_grp_flg5"))
					.select(DS0D, S0_CST_GRP5.bp_grp_nm.as("cst_grp_nm5"))
					.groupBy(DS0D, S0_CST_GRP5.bp_grp_nm),
				when(boundOr("cst_grp_flg5", "cst_grp_nm5"))
					.view(DS0D, v -> v.leftOuterJoin(S0_CST_GRP5).on(S0_CST.bp_grp_cd5.eq(S0_CST_GRP5.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP5.value()).eq(S0_CST_GRP5.bp_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_CST_GRP5.bp_grp_nm.like(bind("cst_grp_nm5")))),
				when(boundOr("cst_grp_flg6"))
					.select(DS0D, S0_CST.bp_grp_cd6.as("cst_grp_cd6"))
					.groupBy(DS0D, S0_CST.bp_grp_cd6),
				when(boundOr("cst_grp_flg6", "cst_grp_cd6"))
					.predicate(DS0D, p -> p.cutoff$and(S0_CST.bp_grp_cd6.like(bind("cst_grp_cd6")))),
				when(boundOr("cst_grp_flg6"))
					.select(DS0D, S0_CST_GRP6.bp_grp_nm.as("cst_grp_nm6"))
					.groupBy(DS0D, S0_CST_GRP6.bp_grp_nm),
				when(boundOr("cst_grp_flg6", "cst_grp_nm6"))
					.view(DS0D, v -> v.leftOuterJoin(S0_CST_GRP6).on(S0_CST.bp_grp_cd6.eq(S0_CST_GRP6.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP6.value()).eq(S0_CST_GRP6.bp_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_CST_GRP6.bp_grp_nm.like(bind("cst_grp_nm6")))),
				when(boundOr("cst_grp_flg7"))
					.select(DS0D, S0_CST.bp_grp_cd7.as("cst_grp_cd7"))
					.groupBy(DS0D, S0_CST.bp_grp_cd7),
				when(boundOr("cst_grp_flg7", "cst_grp_cd7"))
					.predicate(DS0D, p -> p.cutoff$and(S0_CST.bp_grp_cd7.like(bind("cst_grp_cd7")))),
				when(boundOr("cst_grp_flg7"))
					.select(DS0D, S0_CST_GRP7.bp_grp_nm.as("cst_grp_nm7"))
					.groupBy(DS0D, S0_CST_GRP7.bp_grp_nm),
				when(boundOr("cst_grp_flg7", "cst_grp_nm7"))
					.view(DS0D, v -> v.leftOuterJoin(S0_CST_GRP7).on(S0_CST.bp_grp_cd7.eq(S0_CST_GRP7.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP7.value()).eq(S0_CST_GRP7.bp_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_CST_GRP7.bp_grp_nm.like(bind("cst_grp_nm7")))),
				when(boundOr("cst_grp_flg8"))
					.select(DS0D, S0_CST.bp_grp_cd8.as("cst_grp_cd8"))
					.groupBy(DS0D, S0_CST.bp_grp_cd8),
				when(boundOr("cst_grp_flg8", "cst_grp_cd8"))
					.predicate(DS0D, p -> p.cutoff$and(S0_CST.bp_grp_cd8.like(bind("cst_grp_cd8")))),
				when(boundOr("cst_grp_flg8"))
					.select(DS0D, S0_CST_GRP8.bp_grp_nm.as("cst_grp_nm8"))
					.groupBy(DS0D, S0_CST_GRP8.bp_grp_nm),
				when(boundOr("cst_grp_flg8", "cst_grp_nm8"))
					.view(DS0D, v -> v.leftOuterJoin(S0_CST_GRP8).on(S0_CST.bp_grp_cd8.eq(S0_CST_GRP8.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP8.value()).eq(S0_CST_GRP8.bp_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_CST_GRP8.bp_grp_nm.like(bind("cst_grp_nm8")))),
				when(boundOr("cst_grp_flg9"))
					.select(DS0D, S0_CST.bp_grp_cd9.as("cst_grp_cd9"))
					.groupBy(DS0D, S0_CST.bp_grp_cd9),
				when(boundOr("cst_grp_flg9", "cst_grp_cd9"))
					.predicate(DS0D, p -> p.cutoff$and(S0_CST.bp_grp_cd9.like(bind("cst_grp_cd9")))),
				when(boundOr("cst_grp_flg9"))
					.select(DS0D, S0_CST_GRP9.bp_grp_nm.as("cst_grp_nm9"))
					.groupBy(DS0D, S0_CST_GRP9.bp_grp_nm),
				when(boundOr("cst_grp_flg9", "cst_grp_nm9"))
					.view(DS0D, v -> v.leftOuterJoin(S0_CST_GRP9).on(S0_CST.bp_grp_cd9.eq(S0_CST_GRP9.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP9.value()).eq(S0_CST_GRP9.bp_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_CST_GRP9.bp_grp_nm.like(bind("cst_grp_nm9")))),
				when(boundOr("cst_grp_flg10"))
					.select(DS0D, S0_CST.bp_grp_cd10.as("cst_grp_cd10"))
					.groupBy(DS0D, S0_CST.bp_grp_cd10),
				when(boundOr("cst_grp_flg10", "cst_grp_cd10"))
					.predicate(DS0D, p -> p.cutoff$and(S0_CST.bp_grp_cd10.like(bind("cst_grp_cd10")))),
				when(boundOr("cst_grp_flg10"))
					.select(DS0D, S0_CST_GRP10.bp_grp_nm.as("cst_grp_nm10"))
					.groupBy(DS0D, S0_CST_GRP10.bp_grp_nm),
				when(boundOr("cst_grp_flg10", "cst_grp_nm10"))
					.view(DS0D, v -> v.leftOuterJoin(S0_CST_GRP10).on(S0_CST.bp_grp_cd10.eq(S0_CST_GRP10.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP10.value()).eq(S0_CST_GRP10.bp_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_CST_GRP10.bp_grp_nm.like(bind("cst_grp_nm10")))),
				when(boundOr("acst_grp_flg1", "acst_grp_flg2", "acst_grp_flg3", "acst_grp_flg4", "acst_grp_flg5", "acst_grp_flg6", "acst_grp_flg7", "acst_grp_flg8", "acst_grp_flg9", "acst_grp_flg10"))
					.view(DS0D, v -> v.leftOuterJoin(S0_ACST).on(S0_ACST.bp_cd.eq(nvl(S0_V1.pr(S1_T1.acst_cd),S0_CST.acst_cd)))),
				when(boundOr("acst_grp_flg1"))
					.select(DS0D, S0_ACST.bp_grp_cd1.as("acst_grp_cd1"))
					.groupBy(DS0D, S0_ACST.bp_grp_cd1),
				when(boundOr("acst_grp_flg1", "acst_grp_cd1"))
					.predicate(DS0D, p -> p.cutoff$and(S0_ACST.bp_grp_cd1.like(bind("acst_grp_cd1")))),
				when(boundOr("acst_grp_flg1"))
					.select(DS0D, S0_ACST_GRP1.bp_grp_nm.as("acst_grp_nm1"))
					.groupBy(DS0D, S0_ACST_GRP1.bp_grp_nm),
				when(boundOr("acst_grp_flg1", "acst_grp_nm1"))
					.view(DS0D, v -> v.leftOuterJoin(S0_ACST_GRP1).on(S0_ACST.bp_grp_cd1.eq(S0_ACST_GRP1.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP1.value()).eq(S0_ACST_GRP1.bp_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_ACST_GRP1.bp_grp_nm.like(bind("acst_grp_nm1")))),
				when(boundOr("acst_grp_flg2"))
					.select(DS0D, S0_ACST.bp_grp_cd2.as("acst_grp_cd2"))
					.groupBy(DS0D, S0_ACST.bp_grp_cd2),
				when(boundOr("acst_grp_flg2", "acst_grp_cd2"))
					.predicate(DS0D, p -> p.cutoff$and(S0_ACST.bp_grp_cd2.like(bind("acst_grp_cd2")))),
				when(boundOr("acst_grp_flg2"))
					.select(DS0D, S0_ACST_GRP2.bp_grp_nm.as("acst_grp_nm2"))
					.groupBy(DS0D, S0_ACST_GRP2.bp_grp_nm),
				when(boundOr("acst_grp_flg2", "acst_grp_nm2"))
					.view(DS0D, v -> v.leftOuterJoin(S0_ACST_GRP2).on(S0_ACST.bp_grp_cd2.eq(S0_ACST_GRP2.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP2.value()).eq(S0_ACST_GRP2.bp_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_ACST_GRP2.bp_grp_nm.like(bind("acst_grp_nm2")))),
				when(boundOr("acst_grp_flg3"))
					.select(DS0D, S0_ACST.bp_grp_cd3.as("acst_grp_cd3"))
					.groupBy(DS0D, S0_ACST.bp_grp_cd3),
				when(boundOr("acst_grp_flg3", "acst_grp_cd3"))
					.predicate(DS0D, p -> p.cutoff$and(S0_ACST.bp_grp_cd3.like(bind("acst_grp_cd3")))),
				when(boundOr("acst_grp_flg3"))
					.select(DS0D, S0_ACST_GRP3.bp_grp_nm.as("acst_grp_nm3"))
					.groupBy(DS0D, S0_ACST_GRP3.bp_grp_nm),
				when(boundOr("acst_grp_flg3", "acst_grp_nm3"))
					.view(DS0D, v -> v.leftOuterJoin(S0_ACST_GRP3).on(S0_ACST.bp_grp_cd3.eq(S0_ACST_GRP3.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP3.value()).eq(S0_ACST_GRP3.bp_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_ACST_GRP3.bp_grp_nm.like(bind("acst_grp_nm3")))),
				when(boundOr("acst_grp_flg4"))
					.select(DS0D, S0_ACST.bp_grp_cd4.as("acst_grp_cd4"))
					.groupBy(DS0D, S0_ACST.bp_grp_cd4),
				when(boundOr("acst_grp_flg4", "acst_grp_cd4"))
					.predicate(DS0D, p -> p.cutoff$and(S0_ACST.bp_grp_cd4.like(bind("acst_grp_cd4")))),
				when(boundOr("acst_grp_flg4"))
					.select(DS0D, S0_ACST_GRP4.bp_grp_nm.as("acst_grp_nm4"))
					.groupBy(DS0D, S0_ACST_GRP4.bp_grp_nm),
				when(boundOr("acst_grp_flg4", "acst_grp_nm4"))
					.view(DS0D, v -> v.leftOuterJoin(S0_ACST_GRP4).on(S0_ACST.bp_grp_cd4.eq(S0_ACST_GRP4.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP4.value()).eq(S0_ACST_GRP4.bp_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_ACST_GRP4.bp_grp_nm.like(bind("acst_grp_nm4")))),
				when(boundOr("acst_grp_flg5"))
					.select(DS0D, S0_ACST.bp_grp_cd5.as("acst_grp_cd5"))
					.groupBy(DS0D, S0_ACST.bp_grp_cd5),
				when(boundOr("acst_grp_flg5", "acst_grp_cd5"))
					.predicate(DS0D, p -> p.cutoff$and(S0_ACST.bp_grp_cd5.like(bind("acst_grp_cd5")))),
				when(boundOr("acst_grp_flg5"))
					.select(DS0D, S0_ACST_GRP5.bp_grp_nm.as("acst_grp_nm5"))
					.groupBy(DS0D, S0_ACST_GRP5.bp_grp_nm),
				when(boundOr("acst_grp_flg5", "acst_grp_nm5"))
					.view(DS0D, v -> v.leftOuterJoin(S0_ACST_GRP5).on(S0_ACST.bp_grp_cd5.eq(S0_ACST_GRP5.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP5.value()).eq(S0_ACST_GRP5.bp_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_ACST_GRP5.bp_grp_nm.like(bind("acst_grp_nm5")))),
				when(boundOr("acst_grp_flg6"))
					.select(DS0D, S0_ACST.bp_grp_cd6.as("acst_grp_cd6"))
					.groupBy(DS0D, S0_ACST.bp_grp_cd6),
				when(boundOr("acst_grp_flg6", "acst_grp_cd6"))
					.predicate(DS0D, p -> p.cutoff$and(S0_ACST.bp_grp_cd6.like(bind("acst_grp_cd6")))),
				when(boundOr("acst_grp_flg6"))
					.select(DS0D, S0_ACST_GRP6.bp_grp_nm.as("acst_grp_nm6"))
					.groupBy(DS0D, S0_ACST_GRP6.bp_grp_nm),
				when(boundOr("acst_grp_flg6", "acst_grp_nm6"))
					.view(DS0D, v -> v.leftOuterJoin(S0_ACST_GRP6).on(S0_ACST.bp_grp_cd6.eq(S0_ACST_GRP6.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP6.value()).eq(S0_ACST_GRP6.bp_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_ACST_GRP6.bp_grp_nm.like(bind("acst_grp_nm6")))),
				when(boundOr("acst_grp_flg7"))
					.select(DS0D, S0_ACST.bp_grp_cd7.as("acst_grp_cd7"))
					.groupBy(DS0D, S0_ACST.bp_grp_cd7),
				when(boundOr("acst_grp_flg7", "acst_grp_cd7"))
					.predicate(DS0D, p -> p.cutoff$and(S0_ACST.bp_grp_cd7.like(bind("acst_grp_cd7")))),
				when(boundOr("acst_grp_flg7"))
					.select(DS0D, S0_ACST_GRP7.bp_grp_nm.as("acst_grp_nm7"))
					.groupBy(DS0D, S0_ACST_GRP7.bp_grp_nm),
				when(boundOr("acst_grp_flg7", "acst_grp_nm7"))
					.view(DS0D, v -> v.leftOuterJoin(S0_ACST_GRP7).on(S0_ACST.bp_grp_cd7.eq(S0_ACST_GRP7.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP7.value()).eq(S0_ACST_GRP7.bp_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_ACST_GRP7.bp_grp_nm.like(bind("acst_grp_nm7")))),
				when(boundOr("acst_grp_flg8"))
					.select(DS0D, S0_ACST.bp_grp_cd8.as("acst_grp_cd8"))
					.groupBy(DS0D, S0_ACST.bp_grp_cd8),
				when(boundOr("acst_grp_flg8", "acst_grp_cd8"))
					.predicate(DS0D, p -> p.cutoff$and(S0_ACST.bp_grp_cd8.like(bind("acst_grp_cd8")))),
				when(boundOr("acst_grp_flg8"))
					.select(DS0D, S0_ACST_GRP8.bp_grp_nm.as("acst_grp_nm8"))
					.groupBy(DS0D, S0_ACST_GRP8.bp_grp_nm),
				when(boundOr("acst_grp_flg8", "acst_grp_nm8"))
					.view(DS0D, v -> v.leftOuterJoin(S0_ACST_GRP8).on(S0_ACST.bp_grp_cd8.eq(S0_ACST_GRP8.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP8.value()).eq(S0_ACST_GRP8.bp_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_ACST_GRP8.bp_grp_nm.like(bind("acst_grp_nm8")))),
				when(boundOr("acst_grp_flg9"))
					.select(DS0D, S0_ACST.bp_grp_cd9.as("acst_grp_cd9"))
					.groupBy(DS0D, S0_ACST.bp_grp_cd9),
				when(boundOr("acst_grp_flg9", "acst_grp_cd9"))
					.predicate(DS0D, p -> p.cutoff$and(S0_ACST.bp_grp_cd9.like(bind("acst_grp_cd9")))),
				when(boundOr("acst_grp_flg9"))
					.select(DS0D, S0_ACST_GRP9.bp_grp_nm.as("acst_grp_nm9"))
					.groupBy(DS0D, S0_ACST_GRP9.bp_grp_nm),
				when(boundOr("acst_grp_flg9", "acst_grp_nm9"))
					.view(DS0D, v -> v.leftOuterJoin(S0_ACST_GRP9).on(S0_ACST.bp_grp_cd9.eq(S0_ACST_GRP9.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP9.value()).eq(S0_ACST_GRP9.bp_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_ACST_GRP9.bp_grp_nm.like(bind("acst_grp_nm9")))),
				when(boundOr("acst_grp_flg10"))
					.select(DS0D, S0_ACST.bp_grp_cd10.as("acst_grp_cd10"))
					.groupBy(DS0D, S0_ACST.bp_grp_cd10),
				when(boundOr("acst_grp_flg10", "acst_grp_cd10"))
					.predicate(DS0D, p -> p.cutoff$and(S0_ACST.bp_grp_cd10.like(bind("acst_grp_cd10")))),
				when(boundOr("acst_grp_flg10"))
					.select(DS0D, S0_ACST_GRP10.bp_grp_nm.as("acst_grp_nm10"))
					.groupBy(DS0D, S0_ACST_GRP10.bp_grp_nm),
				when(boundOr("acst_grp_flg10", "acst_grp_nm10"))
					.view(DS0D, v -> v.leftOuterJoin(S0_ACST_GRP10).on(S0_ACST.bp_grp_cd10.eq(S0_ACST_GRP10.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP10.value()).eq(S0_ACST_GRP10.bp_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_ACST_GRP10.bp_grp_nm.like(bind("acst_grp_nm10")))),
				when(boundOr("trd_nm"))
					.view(DS0D, v -> v.leftOuterJoin(S0_TRD).on(S0_TRD.trd_cd.eq(S0_V1.pr(S1_T1.trd_cd))))
					.predicate(DS0D, p -> p.cutoff$and(S0_TRD.trd_nm.like(bind("trd_nm")))),
				when(boundOr("sls_usr_nm"))
					.view(DS0D, v -> v.leftOuterJoin(S0_SLS_USR).on(S0_SLS_USR.usr_cd.eq(S0_V1.pr(S1_T1.sls_usr_cd))))
					.predicate(DS0D, p -> p.cutoff$and(S0_SLS_USR.usr_nm.like(bind("sls_usr_nm")))),
				when(boundOr("sls_dpt_nm", "wg_cd", "wg_nm"))
					.view(DS0D, v -> v.leftOuterJoin(S0_SLS_DPT).on(S0_SLS_DPT.dpt_cd.eq(S0_V1.pr(S1_T1.sls_dpt_cd)).and(S0_V1.pr("master_dt").between(S0_SLS_DPT.st_dt, S0_SLS_DPT.end_dt))))
					.predicate(DS0D, p -> p.cutoff$and(S0_SLS_DPT.dpt_nm.like(bind("sls_dpt_nm"))).cutoff$and(nvl(S0_V1.pr(S1_T1.wg_cd),S0_SLS_DPT.wg_cd).like(bind("wg_cd")))),
				when(boundOr("wg_nm"))
					.view(DS0D, v -> v.leftOuterJoin(S0_SLS_DPT_WG).on(S0_SLS_DPT_WG.wg_cd.eq(nvl(S0_V1.pr(S1_T1.wg_cd),S0_SLS_DPT.wg_cd))))
					.predicate(DS0D, p -> p.cutoff$and(S0_SLS_DPT_WG.wg_nm.like(bind("wg_nm")))),
				when(boundOr("ship_lg_grp_nm"))
					.view(DS0D, v -> v.leftOuterJoin(S0_SHIP_LG_GRP).on(S0_SHIP_LG_GRP.lg_grp_cd.eq(S0_V1.pr(S1_T1.ship_lg_grp_cd))))
					.predicate(DS0D, p -> p.cutoff$and(S0_SHIP_LG_GRP.lg_grp_nm.like(bind("ship_lg_grp_nm"))))
			);
	}
	
	/**
	 * -- MSBBL1320_MST_SLS_SCHD_Query_S02
	 */
	static MCQueryPlan MSBBL1320_MST_SLS_SCHD_S02() {
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
				sql("MSBBL1320_MST_SLS_SCHD_Query_S02")
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
						decode(
							S0_T1.iv_no,
							nullValue(),
							S0_SLOD.upri_not_tgt_flg,
							S0_IVD.upri_not_tgt_flg
						).as("upri_not_tgt_flg"),
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
						.add(MAVM_ITM_UNIT_R.class, r -> toCondition(
							r.getStringNE("itm_cd"),
							r.getStringNE("itm_sub1"),
							r.getStringNE("itm_sub2"),
							r.getStringNE("itm_sub3"),
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
	 * -- MSBBL1320_MST_SLS_SCHD_Query_S03
	 */
	static MCQueryPlan MSBBL1320_MST_SLS_SCHD_S03() {
		MST_SLS_SCHD_R S0_T1 = MST_SLS_SCHD_R.create("T1");
		MST_IV_R S0_IV = MST_IV_R.create("IV");
		MST_IV_D_R S0_IVD = MST_IV_D_R.create("IVD");
		MST_IV_SHIP_ACT_D_R S0_IVSHIPACTD = MST_IV_SHIP_ACT_D_R.create("IVSHIPACTD");
		MST_IV_SHIP_ACT_MAP_R S0_IVSHIPACTMAP = MST_IV_SHIP_ACT_MAP_R.create("IVSHIPACTMAP");
		MST_SHIP_ACT_D_R S0_SHIPACTD = MST_SHIP_ACT_D_R.create("SHIPACTD");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBBL1320_MST_SLS_SCHD_Query_S03")
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
						S0_T1
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
						.leftOuterJoin(S0_IVSHIPACTD).on(
							bracket(
								S0_T1.iv_no.eq(S0_IVSHIPACTD.iv_no)
								.and(S0_T1.iv_d_no.eq(S0_IVSHIPACTD.iv_d_no))
							)
						)
						.leftOuterJoin(S0_IVSHIPACTMAP).on(
								bracket(
									S0_IV.via_dlv_typ.eq(value(MAC_VIA_DLV_TYP.NOT_VIA.value()))
									.and(S0_T1.iv_d_no.eq(S0_IVSHIPACTMAP.iv_d_no))
								)
							)
						.leftOuterJoin(S0_SHIPACTD).on(
							bracket(
								S0_SHIPACTD.can_flg.eq(value(false))
								.and(
									bracket(
										S0_IV.via_dlv_typ.eq(value(MAC_VIA_DLV_TYP.NOT_VIA.value()))
										.and(S0_IVSHIPACTMAP.ship_act_d_no.eq(S0_SHIPACTD.ship_act_d_no))
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
						.and(S0_T1.sls_schd_no.eq(bind("sls_schd_no")))
					)
			);
	}
	
	/**
	 * -- MSBBL1320_MST_SLS_SCHD_Query_S04
	 */
	static MCQueryPlan MSBBL1320_MST_SLS_SCHD_S04() {
		MST_SLS_SCHD_R S0_T1 = MST_SLS_SCHD_R.create("T1");
		MSW_SLS_SCHD_KEY_R S0_W = MSW_SLS_SCHD_KEY_R.create("W");
		MST_PO_SCHD_R S0_T2 = MST_PO_SCHD_R.create("T2");
		MST_PO_R S0_T3 = MST_PO_R.create("T3");
		MAM_BP_R S0_SPPL = MAM_BP_R.create("SPPL");
		MAM_BP_R S0_ASPPL = MAM_BP_R.create("ASPPL");
		MAM_BP_R S0_BSPPL = MAM_BP_R.create("BSPPL");
		MAM_CO_R S0_CO = MAM_CO_R.create("CO");
		MST_PURC_SCHD_R S0_T4 = MST_PURC_SCHD_R.create("T4");
		MST_ARR_SCHD_R S0_T5 = MST_ARR_SCHD_R.create("T5");
		MST_RCPT_IV_R S0_T6 = MST_RCPT_IV_R.create("T6");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBBL1320_MST_SLS_SCHD_Query_S04")
					.mainQuery()
					.select(
						S0_T1.sls_schd_no,
						S0_T3.trd_cd,
						S0_T3.trd_ptn_typ,
						S0_T3.po_no,
						S0_T3.purc_dpt_cd,
						S0_T3.purc_usr_cd,
						S0_T3.wg_cd,
						S0_T3.sppl_cd,
						S0_SPPL.subcon_flg,
						S0_T3.trd_cur_cd,
						S0_T3.trd_rmrks,
						S0_T3.tterm_cd1,
						S0_T3.tterm_rmrks1,
						S0_T3.tterm_cd2,
						S0_T3.tterm_rmrks2,
						S0_T3.tterm_cd3,
						S0_T3.tterm_rmrks3,
						S0_T5.rcpt_iv_no,
						S0_T5.rcpt_iv_mng_no,
						cases()
							.when(
								S0_SPPL.sppl_iv_flg.eq(value(true))
								.and(S0_BSPPL.pay_spot_flg.eq(value(true)))
							)
								.then(S0_T6.pay_schd_dt)
							.otherwise(nullValue()).as("pay_schd_dt"),
						cases()
							.when(
								S0_SPPL.sppl_iv_flg.eq(value(true))
								.and(S0_BSPPL.pay_spot_flg.eq(value(false)))
							)
								.then(S0_T6.pay_basis_dt)
							.otherwise(nullValue()).as("pay_basis_dt"),
						cases()
							.when(S0_T6.xrate_inpt_flg.eq(value(true)))
								.then(S0_T6.xrate)
							.when(
								S0_T5.rcpt_iv_no.isNull()
								.and(S0_T3.xrate_inpt_flg.eq(value(true)))
							)
								.then(S0_T3.xrate)
							.otherwise(
								MAPA_XCHNG$F_GET_PURC_XRATE(
									S0_T3.trd_cur_cd,
									bind("today")
								)
							).as("xrate"),
						cases()
							.when(S0_T6.ptax_xrate_inpt_flg.eq(value(true)))
								.then(S0_T6.ptax_xrate)
							.when(
								S0_T5.rcpt_iv_no.isNull()
								.and(S0_T3.ptax_xrate_inpt_flg.eq(value(true)))
							)
								.then(S0_T3.ptax_xrate)
							.when(S0_CO.ptax_cur_cd.isNull())
								.then(nullValue())
							.otherwise(
								MAPA_XCHNG$F_GET_XRATE(
									S0_T3.trd_cur_cd,
									S0_CO.ptax_cur_cd,
									S0_CO.purc_xrate_cd,
									bind("today")
								)
							).as("ptax_xrate")
					)
					.from(
						S0_T1
						.innerJoin(S0_W).on(S0_T1.sls_schd_no.eq(S0_W.sls_schd_no))
						.innerJoin(S0_T2).on(S0_T1.po_schd_no.eq(S0_T2.po_schd_no))
						.innerJoin(S0_T3).on(S0_T2.po_no.eq(S0_T3.po_no))
						.leftOuterJoin(S0_SPPL).on(
							bracket(
								S0_T3.sppl_cd.eq(S0_SPPL.bp_cd)
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
						.innerJoin(S0_T4).on(S0_T1.purc_schd_no.eq(S0_T4.purc_schd_no))
						.innerJoin(S0_T5).on(S0_T4.arr_schd_no.eq(S0_T5.arr_schd_no))
						.leftOuterJoin(S0_T6).on(
							bracket(
								S0_T5.rcpt_iv_mng_no.eq(S0_T6.rcpt_iv_mng_no)
							)
						)
					)
			);
	}
	
	/**
	 * -- MSBBL1320_MST_SLS_SCHD_Query_S06
	 */
	static MCQueryPlan MSBBL1320_MST_SLS_SCHD_S06() {
		MST_SLS_SCHD_R S0_T1 = MST_SLS_SCHD_R.create("T1");
		MST_DLV_SLIP_D_R S0_SLIPD = MST_DLV_SLIP_D_R.create("SLIPD");
		MST_SHIP_ACT_D_R S0_SHIPACTD = MST_SHIP_ACT_D_R.create("SHIPACTD");
		MST_DLV_SLIP_D_R S1_W = MST_DLV_SLIP_D_R.create("W");
		MST_DLV_SLIP_R S1_W2 = MST_DLV_SLIP_R.create("W2");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBBL1320_MST_SLS_SCHD_Query_S06")
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
						S0_T1
						.leftOuterJoin(S0_SLIPD).on(
							bracket(
								S0_T1.dlv_slip_d_no.eq(S0_SLIPD.dlv_slip_d_no)
								.and(
									S0_SLIPD.dlv_slip_d_seq.eq(subQuery()
										.select(max(S1_W.dlv_slip_d_seq))
										.from(S1_W
											.innerJoin(S1_W2).on(
												S1_W2.dlv_slip_no.eq(S1_W.dlv_slip_no)
												.and(S1_W2.dlv_slip_seq.eq(S1_W.dlv_slip_seq))
											)
										)
										.where(
											S1_W.dlv_slip_d_no.eq(S0_T1.dlv_slip_d_no)
											.and(S1_W2.trn_typ.eq(value(MSC_TRN_TYP.SHIP.value())))
											.and(S1_W2.slip_sts_typ.neq(value(MAC_SLIP_STS_TYP.CAN.value())))
										)
									)
								)
							)
						)
						.leftOuterJoin(S0_SHIPACTD).on(
							bracket(
								S0_T1.dlv_slip_d_no.eq(S0_SHIPACTD.dlv_slip_d_no)
								.and(S0_SHIPACTD.can_flg.eq(value(false)))
							)
						)
					)
					.where(
						value(0).eq(value(0))
						.and(S0_T1.sls_schd_no.eq(bind("sls_schd_no")))
					)
			);
	}
	
	/**
	 * -- MSBBL1320_MST_SLS_SCHD_Query_S07
	 */
	static MCQueryPlan MSBBL1320_MST_SLS_SCHD_S07() {
		MST_SLS_SCHD_R S0_T1 = MST_SLS_SCHD_R.create("T1");
		MSW_SLS_SCHD_KEY_R S0_SCHDKEY = MSW_SLS_SCHD_KEY_R.create("SCHDKEY");
		MST_IV_D_R S0_T2 = MST_IV_D_R.create("T2");
		MST_DLV_SLIP_D_R S0_T3 = MST_DLV_SLIP_D_R.create("T3");
		MST_SLO_D_R S0_T4 = MST_SLO_D_R.create("T4");
		MST_IV_R S0_T5 = MST_IV_R.create("T5");
		MST_DLV_SLIP_R S0_T6 = MST_DLV_SLIP_R.create("T6");
		MST_SLO_R S0_T7 = MST_SLO_R.create("T7");
		MAVM_ITM_UNIT_R S0_M2 = MAVM_ITM_UNIT_R.create("M2");
		MAM_TAX_R S0_M3 = MAM_TAX_R.create("M3");
		MAM_CUR_R S0_M4 = MAM_CUR_R.create("M4");
		MAM_BP_R S0_M5 = MAM_BP_R.create("M5");
		MST_DLV_SLIP_D_R S1_ST = MST_DLV_SLIP_D_R.create("ST");
		MST_DLV_SLIP_R S1_ST2 = MST_DLV_SLIP_R.create("ST2");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBBL1320_MST_SLS_SCHD_Query_S07")
					.mainQuery()
					.select(
						nvl(
							S0_T2.trd_unit_cd,
							nvl(
								S0_T3.trd_unit_cd,
								S0_T4.trd_unit_cd
							)
						).as("trd_unit_cd"),
						nvl(
							S0_T2.trd_unit_qty,
							nvl(
								S0_T3.trd_unit_qty,
								S0_T4.trd_unit_qty
							)
						).as("trd_unit_qty"),
						nvl(
							S0_T2.trd_cur_upri,
							nvl(
								S0_T3.trd_cur_upri,
								S0_T4.trd_cur_upri
							)
						).as("trd_cur_upri"),
						nvl(
							S0_T2.trd_cur_dscnt_amt,
							nvl(
								S0_T3.trd_cur_dscnt_amt,
								S0_T4.trd_cur_dscnt_amt
							)
						).as("trd_cur_dscnt_amt"),
						nvl(
							S0_T2.trd_cur_amt,
							nvl(
								S0_T3.trd_cur_amt,
								S0_T4.trd_cur_amt
							)
						).as("trd_cur_amt"),
						nvl(
							S0_T2.trd_cur_tax_amt,
							nvl(
								S0_T3.trd_cur_tax_amt,
								S0_T4.trd_cur_tax_amt
							)
						).as("trd_cur_tax_amt"),
						S0_T1.base_unit_cd,
						S0_M2.conv_base_qty.as("trd_unit_conv_base_qty"),
						S0_M2.conv_qty.as("trd_unit_conv_qty"),
						S0_M3.tax_rate,
						S0_M3.inc_tax_flg,
						S0_M4.amt_dec_place,
						S0_M4.upri_dec_place,
						S0_M5.sls_amt_rnd_typ.as("amt_rnd_typ"),
						S0_M5.sls_tax_rnd_typ.as("tax_rnd_typ"),
						S0_T1.base_unit_qty.as("sls_schd_qty"),
						S0_T1.base_unit_sls_qty.add(S0_T1.base_unit_abort_qty).as("base_unit_cmpl_qty"),
						S0_T1.sls_schd_no
					)
					.from(
						S0_T1
						.innerJoin(S0_SCHDKEY).on(
							bracket(
								S0_T1.sls_schd_no.eq(S0_SCHDKEY.sls_schd_no)
							)
						)
						.leftOuterJoin(S0_T2).on(S0_T2.iv_d_no.eq(S0_T1.iv_d_no))
						.leftOuterJoin(S0_T3).on(
							bracket(
								S0_T1.dlv_slip_d_no.eq(S0_T3.dlv_slip_d_no)
								.and(
									S0_T3.dlv_slip_d_seq.eq(subQuery()
										.select(max(S1_ST.dlv_slip_d_seq))
										.from(
											S1_ST
											.innerJoin(S1_ST2).on(
												S1_ST.dlv_slip_no.eq(S1_ST2.dlv_slip_no)
												.and(S1_ST.dlv_slip_seq.eq(S1_ST2.dlv_slip_seq))
											)
										)
										.where(
											S1_ST.dlv_slip_d_no.eq(S0_T1.dlv_slip_d_no)
											.and(S1_ST2.trn_typ.eq(value(MSC_TRN_TYP.SHIP.value())))
											.and(S1_ST2.sync_flg.eq(value(false)))
										)
									)
								)
							)
						)
						.leftOuterJoin(S0_T4).on(S0_T4.slo_d_no.eq(S0_T1.slo_d_no))
						.leftOuterJoin(S0_T5).on(S0_T5.iv_mng_no.eq(S0_T2.iv_mng_no))
						.leftOuterJoin(S0_T6).on(
							bracket(
								S0_T6.dlv_slip_no.eq(S0_T3.dlv_slip_no)
								.and(S0_T6.dlv_slip_seq.eq(S0_T3.dlv_slip_seq))
							)
						)
						.leftOuterJoin(S0_T7).on(S0_T7.slo_no.eq(S0_T4.slo_no))
						.leftOuterJoin(S0_M2).on(
							bracket(
								nvl(
									S0_T2.itm_cd,
									nvl(
										S0_T3.itm_cd,
										S0_T4.itm_cd
									)
								).eq(S0_M2.itm_cd)
								.and(
									nvl(
										S0_T2.itm_sub1,
										nvl(
											S0_T3.itm_sub1,
											S0_T4.itm_sub1
										)
									).eq(S0_M2.itm_sub1)
								)
								.and(
									nvl(
										S0_T2.itm_sub2,
										nvl(
											S0_T3.itm_sub2,
											S0_T4.itm_sub2
										)
									).eq(S0_M2.itm_sub2)
								)
								.and(
									nvl(
										S0_T2.itm_sub3,
										nvl(
											S0_T3.itm_sub3,
											S0_T4.itm_sub3
										)
									).eq(S0_M2.itm_sub3)
								)
								.and(
									nvl(
										S0_T2.trd_unit_cd,
										nvl(
											S0_T3.trd_unit_cd,
											S0_T4.trd_unit_cd
										)
									).eq(S0_M2.unit_cd)
								)
							)
						)
						.leftOuterJoin(S0_M3).on(
							bracket(
								nvl(
									S0_T2.tax_cd,
									nvl(
										S0_T3.tax_cd,
										S0_T4.tax_cd
									)
								).eq(S0_M3.tax_cd)
							)
						)
						.leftOuterJoin(S0_M4).on(
							bracket(
								nvl(
									S0_T5.trd_cur_cd,
									nvl(
										S0_T6.trd_cur_cd,
										S0_T7.trd_cur_cd
									)
								).eq(S0_M4.cur_cd)
							)
						)
						.leftOuterJoin(S0_M5).on(
							bracket(
								nvl(
									S0_T5.ship_rqst_id_cd,
									nvl(
										S0_T6.bp_cd,
										S0_T7.cst_cd
									)
								).eq(S0_M5.bp_cd)
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
	 * -- MSBBL1320_MST_SLS_SCHD_Query_S08
	 */
	static MCQueryPlan MSBBL1320_MST_SLS_SCHD_S08() {
		MST_SLS_SCHD_R S0_T = MST_SLS_SCHD_R.create("T");
		MSW_SLS_SCHD_KEY_R S0_W = MSW_SLS_SCHD_KEY_R.create("W");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBBL1320_MST_SLS_SCHD_Query_S08")
					.mainQuery()
					.select(
						S0_T.sls_schd_no,
						S0_T.base_unit_sls_qty,
						S0_T.base_unit_qty,
						S0_T.base_unit_abort_qty,
						S0_T.upd_cntr
					)
					.from(
						S0_T
						.innerJoin(S0_W).on(S0_T.sls_schd_no.eq(S0_W.sls_schd_no))
					)
					.orderBy(S0_T.sls_schd_no.asc())
					.forUpdate(S0_T.sls_schd_no)
			);
	}
	
	/**
	 * -- MSBBL1320_MST_SLS_SCHD_Query_S09
	 */
	static MCQueryPlan MSBBL1320_MST_SLS_SCHD_S09() {
		MST_SLS_SCHD_R S0_T1 = MST_SLS_SCHD_R.create("T1");
		MSW_SLS_SCHD_KEY_R S0_SCHDKEY = MSW_SLS_SCHD_KEY_R.create("SCHDKEY");
		MST_IV_D_R S0_T2 = MST_IV_D_R.create("T2");
		MST_DLV_SLIP_D_R S0_T3 = MST_DLV_SLIP_D_R.create("T3");
		MST_SLO_D_R S0_T4 = MST_SLO_D_R.create("T4");
		MST_IV_R S0_T5 = MST_IV_R.create("T5");
		MST_DLV_SLIP_R S0_T6 = MST_DLV_SLIP_R.create("T6");
		MST_SLO_R S0_T7 = MST_SLO_R.create("T7");
		MAVM_ITM_UNIT_R S0_M2 = MAVM_ITM_UNIT_R.create("M2");
		MAM_TAX_R S0_M3 = MAM_TAX_R.create("M3");
		MAM_CUR_R S0_M4 = MAM_CUR_R.create("M4");
		MAM_BP_R S0_M5 = MAM_BP_R.create("M5");
		MST_DLV_SLIP_D_R S1_ST = MST_DLV_SLIP_D_R.create("ST");
		MST_DLV_SLIP_R S1_ST2 = MST_DLV_SLIP_R.create("ST2");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBBL1320_MST_SLS_SCHD_Query_S09")
					.mainQuery()
					.select(
						decode(
							S0_T1.iv_no,
							nullValue(),
							decode(
								S0_T1.dlv_slip_d_no,
								nullValue(),
								S0_T4.trd_unit_cd,
								decode(
									S0_T7.sls_basis_typ,
									value(MAC_SLS_BASIS_TYP.IN_BASIS.value()),
									S0_T3.trd_unit_cd,
									value(MAC_SLS_BASIS_TYP.ARRIVAL_BASIS.value()),
									S0_T3.trd_unit_cd,
									nvl(
										S0_T4.trd_unit_cd,
										S0_T3.trd_unit_cd
									)
								)
							),
							S0_T2.trd_unit_cd
						).as("trd_unit_cd"),
						decode(
							S0_T1.iv_no,
							nullValue(),
							decode(
								S0_T1.dlv_slip_d_no,
								nullValue(),
								S0_T4.trd_unit_qty,
								decode(
									S0_T7.sls_basis_typ,
									value(MAC_SLS_BASIS_TYP.IN_BASIS.value()),
									S0_T3.trd_unit_qty,
									value(MAC_SLS_BASIS_TYP.ARRIVAL_BASIS.value()),
									S0_T3.trd_unit_qty,
									nvl(
										S0_T4.trd_unit_qty,
										S0_T3.trd_unit_qty
									)
								)
							),
							S0_T2.trd_unit_qty
						).as("trd_unit_qty"),
						decode(
							S0_T1.iv_no,
							nullValue(),
							decode(
								S0_T1.dlv_slip_d_no,
								nullValue(),
								S0_T4.trd_cur_upri,
								decode(
									S0_T7.sls_basis_typ,
									value(MAC_SLS_BASIS_TYP.IN_BASIS.value()),
									S0_T3.trd_cur_upri,
									value(MAC_SLS_BASIS_TYP.ARRIVAL_BASIS.value()),
									S0_T3.trd_cur_upri,
									nvl(
										S0_T4.trd_cur_upri,
										S0_T3.trd_cur_upri
									)
								)
							),
							S0_T2.trd_cur_upri
						).as("trd_cur_upri"),
						decode(
							S0_T1.iv_no,
							nullValue(),
							decode(
								S0_T1.dlv_slip_d_no,
								nullValue(),
								S0_T4.trd_cur_dscnt_amt,
								decode(
									S0_T7.sls_basis_typ,
									value(MAC_SLS_BASIS_TYP.IN_BASIS.value()),
									S0_T3.trd_cur_dscnt_amt,
									value(MAC_SLS_BASIS_TYP.ARRIVAL_BASIS.value()),
									S0_T3.trd_cur_dscnt_amt,
									nvl(
										S0_T4.trd_cur_dscnt_amt,
										S0_T3.trd_cur_dscnt_amt
									)
								)
							),
							S0_T2.trd_cur_dscnt_amt
						).as("trd_cur_dscnt_amt"),
						decode(
							S0_T1.iv_no,
							nullValue(),
							decode(
								S0_T1.dlv_slip_d_no,
								nullValue(),
								S0_T4.trd_cur_amt,
								decode(
									S0_T7.sls_basis_typ,
									value(MAC_SLS_BASIS_TYP.IN_BASIS.value()),
									S0_T3.trd_cur_amt,
									value(MAC_SLS_BASIS_TYP.ARRIVAL_BASIS.value()),
									S0_T3.trd_cur_amt,
									nvl(
										S0_T4.trd_cur_amt,
										S0_T3.trd_cur_amt
									)
								)
							),
							S0_T2.trd_cur_amt
						).as("trd_cur_amt"),
						decode(
							S0_T1.iv_no,
							nullValue(),
							decode(
								S0_T1.dlv_slip_d_no,
								nullValue(),
								S0_T4.trd_cur_tax_amt,
								decode(
									S0_T7.sls_basis_typ,
									value(MAC_SLS_BASIS_TYP.IN_BASIS.value()),
									S0_T3.trd_cur_tax_amt,
									value(MAC_SLS_BASIS_TYP.ARRIVAL_BASIS.value()),
									S0_T3.trd_cur_tax_amt,
									nvl(
										S0_T4.trd_cur_tax_amt,
										S0_T3.trd_cur_tax_amt
									)
								)
							),
							S0_T2.trd_cur_tax_amt
						).as("trd_cur_tax_amt"),
						S0_T1.base_unit_cd,
						S0_M2.conv_base_qty.as("trd_unit_conv_base_qty"),
						S0_M2.conv_qty.as("trd_unit_conv_qty"),
						S0_M3.tax_rate,
						S0_M3.inc_tax_flg,
						S0_M4.amt_dec_place,
						S0_M4.upri_dec_place,
						S0_M5.sls_amt_rnd_typ.as("amt_rnd_typ"),
						S0_M5.sls_tax_rnd_typ.as("tax_rnd_typ"),
						S0_T1.base_unit_qty.as("sls_schd_qty"),
						S0_T1.base_unit_sls_qty.add(S0_T1.base_unit_abort_qty).as("base_unit_cmpl_qty"),
						S0_T1.sls_schd_no
					)
					.from(
						S0_T1
						.innerJoin(S0_SCHDKEY).on(
							bracket(
								S0_T1.sls_schd_no.eq(S0_SCHDKEY.sls_schd_no)
							)
						)
						.leftOuterJoin(S0_T2).on(S0_T2.iv_d_no.eq(S0_T1.iv_d_no))
						.leftOuterJoin(S0_T3).on(
							bracket(
								S0_T1.dlv_slip_d_no.eq(S0_T3.dlv_slip_d_no)
								.and(
									S0_T3.dlv_slip_d_seq.eq(subQuery()
										.select(max(S1_ST.dlv_slip_d_seq))
										.from(S1_ST
											.innerJoin(S1_ST2).on(
												S1_ST2.dlv_slip_no.eq(S1_ST.dlv_slip_no)
												.and(S1_ST2.dlv_slip_seq.eq(S1_ST.dlv_slip_seq))
											)
										)
										.where(
											S1_ST.dlv_slip_d_no.eq(S0_T1.dlv_slip_d_no)
											.and(S1_ST2.trn_typ.eq(value(MSC_TRN_TYP.SHIP.value())))
											.and(S1_ST2.slip_sts_typ.neq(value(MAC_SLIP_STS_TYP.CAN.value())))
										)
									)
								)
							)
						)
						.leftOuterJoin(S0_T4).on(S0_T4.slo_d_no.eq(S0_T1.slo_d_no))
						.leftOuterJoin(S0_T5).on(S0_T5.iv_mng_no.eq(S0_T2.iv_mng_no))
						.leftOuterJoin(S0_T6).on(
							bracket(
								S0_T6.dlv_slip_no.eq(S0_T3.dlv_slip_no)
								.and(S0_T6.dlv_slip_seq.eq(S0_T3.dlv_slip_seq))
							)
						)
						.leftOuterJoin(S0_T7).on(S0_T7.slo_no.eq(S0_T4.slo_no))
						.leftOuterJoin(S0_M2).on(
							bracket(
								decode(
									S0_T1.iv_no,
									nullValue(),
									decode(
										S0_T1.dlv_slip_d_no,
										nullValue(),
										S0_T4.itm_cd,
										decode(
											S0_T7.sls_basis_typ,
											value(MAC_SLS_BASIS_TYP.IN_BASIS.value()),
											S0_T3.itm_cd,
											value(MAC_SLS_BASIS_TYP.ARRIVAL_BASIS.value()),
											S0_T3.itm_cd,
											nvl(
												S0_T4.itm_cd,
												S0_T3.itm_cd
											)
										)
									),
									S0_T2.itm_cd
								).eq(S0_M2.itm_cd)
								.and(
									decode(
										S0_T1.iv_no,
										nullValue(),
										decode(
											S0_T1.dlv_slip_d_no,
											nullValue(),
											S0_T4.itm_sub1,
											decode(
												S0_T7.sls_basis_typ,
												value(MAC_SLS_BASIS_TYP.IN_BASIS.value()),
												S0_T3.itm_sub1,
												value(MAC_SLS_BASIS_TYP.ARRIVAL_BASIS.value()),
												S0_T3.itm_sub1,
												nvl(
													S0_T4.itm_sub1,
													S0_T3.itm_sub1
												)
											)
										),
										S0_T2.itm_sub1
									).eq(S0_M2.itm_sub1)
								)
								.and(
									decode(
										S0_T1.iv_no,
										nullValue(),
										decode(
											S0_T1.dlv_slip_d_no,
											nullValue(),
											S0_T4.itm_sub2,
											decode(
												S0_T7.sls_basis_typ,
												value(MAC_SLS_BASIS_TYP.IN_BASIS.value()),
												S0_T3.itm_sub2,
												value(MAC_SLS_BASIS_TYP.ARRIVAL_BASIS.value()),
												S0_T3.itm_sub2,
												nvl(
													S0_T4.itm_sub2,
													S0_T3.itm_sub2
												)
											)
										),
										S0_T2.itm_sub2
									).eq(S0_M2.itm_sub2)
								)
								.and(
									decode(
										S0_T1.iv_no,
										nullValue(),
										decode(
											S0_T1.dlv_slip_d_no,
											nullValue(),
											S0_T4.itm_sub3,
											decode(
												S0_T7.sls_basis_typ,
												value(MAC_SLS_BASIS_TYP.IN_BASIS.value()),
												S0_T3.itm_sub3,
												value(MAC_SLS_BASIS_TYP.ARRIVAL_BASIS.value()),
												S0_T3.itm_sub3,
												nvl(
													S0_T4.itm_sub3,
													S0_T3.itm_sub3
												)
											)
										),
										S0_T2.itm_sub3
									).eq(S0_M2.itm_sub3)
								)
								.and(
									decode(
										S0_T1.iv_no,
										nullValue(),
										decode(
											S0_T1.dlv_slip_d_no,
											nullValue(),
											S0_T4.trd_unit_cd,
											decode(
												S0_T7.sls_basis_typ,
												value(MAC_SLS_BASIS_TYP.IN_BASIS.value()),
												S0_T3.trd_unit_cd,
												value(MAC_SLS_BASIS_TYP.ARRIVAL_BASIS.value()),
												S0_T3.trd_unit_cd,
												nvl(
													S0_T4.trd_unit_cd,
													S0_T3.trd_unit_cd
												)
											)
										),
										S0_T2.trd_unit_cd
									).eq(S0_M2.unit_cd)
								)
							)
						)
						.leftOuterJoin(S0_M3).on(
							bracket(
								decode(
									S0_T1.iv_no,
									nullValue(),
									decode(
										S0_T1.dlv_slip_d_no,
										nullValue(),
										S0_T4.tax_cd,
										decode(
											S0_T7.sls_basis_typ,
											value(MAC_SLS_BASIS_TYP.IN_BASIS.value()),
											S0_T3.tax_cd,
											value(MAC_SLS_BASIS_TYP.ARRIVAL_BASIS.value()),
											S0_T3.tax_cd,
											nvl(
												S0_T4.tax_cd,
												S0_T3.tax_cd
											)
										)
									),
									S0_T2.tax_cd
								).eq(S0_M3.tax_cd)
							)
						)
						.leftOuterJoin(S0_M4).on(
							bracket(
								decode(
									S0_T1.iv_no,
									nullValue(),
									decode(
										S0_T1.dlv_slip_d_no,
										nullValue(),
										S0_T7.trd_cur_cd,
										decode(
											S0_T7.sls_basis_typ,
											value(MAC_SLS_BASIS_TYP.IN_BASIS.value()),
											S0_T6.trd_cur_cd,
											value(MAC_SLS_BASIS_TYP.ARRIVAL_BASIS.value()),
											S0_T6.trd_cur_cd,
											nvl(
												S0_T7.trd_cur_cd,
												S0_T6.trd_cur_cd
											)
										)
									),
									S0_T5.trd_cur_cd
								).eq(S0_M4.cur_cd)
							)
						)
						.leftOuterJoin(S0_M5).on(
							bracket(
								decode(
									S0_T1.iv_no,
									nullValue(),
									decode(
										S0_T1.dlv_slip_d_no,
										nullValue(),
										S0_T7.cst_cd,
										decode(
											S0_T7.sls_basis_typ,
											value(MAC_SLS_BASIS_TYP.IN_BASIS.value()),
											S0_T6.bp_cd,
											value(MAC_SLS_BASIS_TYP.ARRIVAL_BASIS.value()),
											S0_T6.bp_cd,
											nvl(
												S0_T7.cst_cd,
												S0_T6.bp_cd
											)
										)
									),
									S0_T5.ship_rqst_id_cd
								).eq(S0_M5.bp_cd)
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
	 * -- MSBBL1320_MST_SLS_SCHD_Query_S10
	 */
	static MCQueryPlan MSBBL1320_MST_SLS_SCHD_S10() {
		MCTempView S0_V1 = createTempView("V1");
		MAM_BP_R S0_CST = MAM_BP_R.create("CST");
		MAM_BP_R S0_SPPL = MAM_BP_R.create("SPPL");
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
		MAM_BP_GRP_R S0_SPPL_GRP1 = MAM_BP_GRP_R.create("SPPL_GRP1");
		MAM_BP_GRP_R S0_SPPL_GRP2 = MAM_BP_GRP_R.create("SPPL_GRP2");
		MAM_BP_GRP_R S0_SPPL_GRP3 = MAM_BP_GRP_R.create("SPPL_GRP3");
		MAM_BP_GRP_R S0_SPPL_GRP4 = MAM_BP_GRP_R.create("SPPL_GRP4");
		MAM_BP_GRP_R S0_SPPL_GRP5 = MAM_BP_GRP_R.create("SPPL_GRP5");
		MAM_BP_GRP_R S0_SPPL_GRP6 = MAM_BP_GRP_R.create("SPPL_GRP6");
		MAM_BP_GRP_R S0_SPPL_GRP7 = MAM_BP_GRP_R.create("SPPL_GRP7");
		MAM_BP_GRP_R S0_SPPL_GRP8 = MAM_BP_GRP_R.create("SPPL_GRP8");
		MAM_BP_GRP_R S0_SPPL_GRP9 = MAM_BP_GRP_R.create("SPPL_GRP9");
		MAM_BP_GRP_R S0_SPPL_GRP10 = MAM_BP_GRP_R.create("SPPL_GRP10");
		MAM_TRD_R S0_TRD = MAM_TRD_R.create("TRD");
		MAM_USR_R S0_SLS_USR = MAM_USR_R.create("SLS_USR");
		MAM_DPT_R S0_SLS_DPT = MAM_DPT_R.create("SLS_DPT");
		MAM_WG_R S0_SLS_DPT_WG = MAM_WG_R.create("SLS_DPT_WG");
		MAM_LG_GRP_R S0_SHIP_LG_GRP = MAM_LG_GRP_R.create("SHIP_LG_GRP");
		MAM_BP_R S0_ACST = MAM_BP_R.create("ACST");
		MAM_BP_GRP_R S0_ACST_GRP1 = MAM_BP_GRP_R.create("ACST_GRP1");
		MAM_BP_GRP_R S0_ACST_GRP2 = MAM_BP_GRP_R.create("ACST_GRP2");
		MAM_BP_GRP_R S0_ACST_GRP3 = MAM_BP_GRP_R.create("ACST_GRP3");
		MAM_BP_GRP_R S0_ACST_GRP4 = MAM_BP_GRP_R.create("ACST_GRP4");
		MAM_BP_GRP_R S0_ACST_GRP5 = MAM_BP_GRP_R.create("ACST_GRP5");
		MAM_BP_GRP_R S0_ACST_GRP6 = MAM_BP_GRP_R.create("ACST_GRP6");
		MAM_BP_GRP_R S0_ACST_GRP7 = MAM_BP_GRP_R.create("ACST_GRP7");
		MAM_BP_GRP_R S0_ACST_GRP8 = MAM_BP_GRP_R.create("ACST_GRP8");
		MAM_BP_GRP_R S0_ACST_GRP9 = MAM_BP_GRP_R.create("ACST_GRP9");
		MAM_BP_GRP_R S0_ACST_GRP10 = MAM_BP_GRP_R.create("ACST_GRP10");
		MAM_BP_R S0_DLV = MAM_BP_R.create("DLV");
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
		MAVM_BP_NM_R S0_DEST1 = MAVM_BP_NM_R.create("DEST1");
		MAVM_BP_NM_R S0_DEST2 = MAVM_BP_NM_R.create("DEST2");
		MAVM_BP_NM_R S0_DEST3 = MAVM_BP_NM_R.create("DEST3");
		MAM_ITM_R S0_ITM = MAM_ITM_R.create("ITM");
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
		MSVT_WRK_SNO_R S0_WRK_SNO = MSVT_WRK_SNO_R.create("WRK_SNO");
		MAM_ITM_TYP_D_R S0_ITM_TYP_D = MAM_ITM_TYP_D_R.create("ITM_TYP_D");
		MAM_EDI_IF_CTL_R S1_MA = MAM_EDI_IF_CTL_R.create("MA");
		MST_SLS_SCHD_R S2_T1 = MST_SLS_SCHD_R.create("T1");
		MST_SLO_D_R S2_SLOD = MST_SLO_D_R.create("SLOD");
		MST_IV_D_R S2_IVD = MST_IV_D_R.create("IVD");
		MST_IV_R S2_IV = MST_IV_R.create("IV");
		MST_DLV_SLIP_D_R S2_SLIPD = MST_DLV_SLIP_D_R.create("SLIPD");
		MST_DLV_SLIP_R S2_SLIP = MST_DLV_SLIP_R.create("SLIP");
		MST_SLO_R S2_SLO = MST_SLO_R.create("SLO");
		MST_SHIP_SCHD_R S2_SHIPSCHD = MST_SHIP_SCHD_R.create("SHIPSCHD");
		MCTempView S2_SAS = createTempView("SAS");
		MST_PURC_ACT_D_R S2_PURCACTD = MST_PURC_ACT_D_R.create("PURCACTD");
		MST_PURC_ACT_R S2_PURCACT = MST_PURC_ACT_R.create("PURCACT");
		MST_PURC_SCHD_R S2_PURCSCHD = MST_PURC_SCHD_R.create("PURCSCHD");
		MST_ARR_SCHD_R S2_ARRSCHD = MST_ARR_SCHD_R.create("ARRSCHD");
		MST_ARR_PR_R S2_ARRPR = MST_ARR_PR_R.create("ARRPR");
		MST_PURC_DLV_SLIP_D_R S2_PURCDLVSLIP = MST_PURC_DLV_SLIP_D_R.create("PURCDLVSLIP");
		MCTempView S2_SHIPACTD = createTempView("SHIPACTD");
		MST_SHIP_ALLOC_STS_R S3_W = MST_SHIP_ALLOC_STS_R.create("W");
		MST_SHIP_ACT_D_R S4_W = MST_SHIP_ACT_D_R.create("W");
		MST_IV_SHIP_ACT_D_R S5_W = MST_IV_SHIP_ACT_D_R.create("W");
		MST_ARR_ACT_R S6_ARRA = MST_ARR_ACT_R.create("ARRA");
		MST_PURC_ACT_IO_R S6_PURCAI = MST_PURC_ACT_IO_R.create("PURCAI");
		MST_PURC_ACT_D_R S6_PURCAD = MST_PURC_ACT_D_R.create("PURCAD");
		MST_PURC_ACT_R S6_PURCA = MST_PURC_ACT_R.create("PURCA");
		MCTempView S7_W = createTempView("W");
		MST_IV_MAP_R S8_X = MST_IV_MAP_R.create("X");
		MST_SHIP_ALLOC_STS_R S8_X1 = MST_SHIP_ALLOC_STS_R.create("X1");
		MST_SHIP_ACT_D_R S8_X2 = MST_SHIP_ACT_D_R.create("X2");
		MCTempView S9_WSAS = createTempView("WSAS");
		MST_SHIP_ALLOC_STS_R S10_W = MST_SHIP_ALLOC_STS_R.create("W");
		MST_SLS_SCHD_R S10_W2 = MST_SLS_SCHD_R.create("W2");
		MST_IV_MAP_R S11_X = MST_IV_MAP_R.create("X");
		MST_SHIP_ALLOC_STS_R S11_X1 = MST_SHIP_ALLOC_STS_R.create("X1");
		MST_SHIP_ACT_D_R S11_X2 = MST_SHIP_ACT_D_R.create("X2");
		MST_DLV_SLIP_D_R S12_W = MST_DLV_SLIP_D_R.create("W");
		MST_DLV_SLIP_R S12_W2 = MST_DLV_SLIP_R.create("W2");
		MAVM_RD_DPT_R S13_DAC = MAVM_RD_DPT_R.create("DAC");
		
		MCDynamicSQLID DS0D = createDynamicSQLID("DS0D");
		
		return createQueryPlan()
			.setQuery(
				sql("MSBBL1320_MST_SLS_SCHD_Query_S10")
					.mainQuery()
					.select(
						S0_V1.prAll(),
						S0_CST.bp_nm.as("cst_nm"),
						S0_CST.acst_cd,
						S0_CST.sls_upri_cng_flg.as("bp_sls_upri_cng_flg"),
						S0_CST.sls_amt_rnd_typ,
						S0_CST.sls_upri_rnd_typ,
						S0_CST.sls_tax_rnd_typ,
						S0_CST.cst_iv_flg,
						S0_CST.bill_crryovr_times.as("cst_bill_crryovr_times"),
						decode(
							S0_V1.pr(S2_T1.iv_no),
							nullValue(),
							decode(
								S0_V1.pr(S2_T1.slo_d_no),
								nullValue(),
								cases()
									.when(S0_CST.ar_dpt_typ.eq(value(MAC_AR_DPT_TYP.SLS.value())))
										.then(S0_V1.pr("sls_dpt_cd"))
									.when(S0_CST.ar_dpt_typ.eq(value(MAC_AR_DPT_TYP.AR.value())))
										.then(
											MAPA_BP$F_GET_AR_DPT_CD_NE(
												S0_CST.bp_cd,
												S0_V1.pr(S2_T1.sls_schd_dt),
												value(false)
											)
									)
									.otherwise(nullValue()),
								S0_V1.pr("ar_dpt_cd")
							),
							S0_V1.pr("ar_dpt_cd")
						).as("ar_dpt_cd"),
						decode(
							bracket(
								subQuery()
								.select(S1_MA.bp_cd)
								.from(S1_MA)
								.where(
									S1_MA.bp_cd.eq(S0_V1.pr("cst_cd"))
									.and(bind("today").between(S1_MA.st_dt, S1_MA.end_dt))
									.and(S1_MA.if_proc_typ.eq(value(MAC_IF_PROC_TYP.ACCPT_RECV.value())))
									.and(S1_MA.del_flg.eq(value(false)))
								)
							),
							nullValue(),
							value(false),
							value(true)
						).as("edi_flg"),
						S0_SPPL.bp_nm.as("sppl_nm"),
						MAPA_TAX$F_GET_SLS_TAX_CD(
							S0_V1.pr("itm_cd"),
							S0_V1.pr("itm_sub1"),
							S0_V1.pr("itm_sub2"),
							S0_V1.pr("itm_sub3"),
							S0_V1.pr("cst_cd"),
							bind("today")
						).as("new_tax_cd"),
						addDynamicSelect(DS0D)
					)
					.from(
						subQuery()
						.select(
							cases()
								.when(
									S2_PURCSCHD.purc_schd_no.isNotNull()
									.and(S2_PURCACTD.purc_act_no.isNull())
								)
									.then(value(true))
								.otherwise(value(false)).as("sync_flg"),
							decode(
								S2_T1.iv_no,
								nullValue(),
								decode(
									S2_T1.slo_d_no,
									nullValue(),
									S2_SLIP.trd_cd,
									S2_SLO.trd_cd
								),
								S2_IVD.trd_cd
							).as("trd_cd"),
							S2_T1.sls_schd_dt,
							S2_IV.rcv_schd_dt,
							cases()
								.when(S2_SLOD.proc_typ.eq(value(MAC_SLO_PROC_TYP.PURC_DDLV.value())))
									.then(
										trunc(
											S2_SHIPSCHD.dlv_schd_tm,
											MCDateFmt.DD
										)
								)
								.otherwise(
									trunc(
										decode(
											S2_T1.dlv_slip_d_no,
											nullValue(),
											S2_SHIPSCHD.ship_schd_tm,
											S2_SLIP.ship_tm
										),
										MCDateFmt.DD
									)
								).as("ship_dt"),
							cases()
								.when(S2_SLOD.proc_typ.eq(value(MAC_SLO_PROC_TYP.PURC_DDLV.value())))
									.then(S2_SHIPSCHD.dlv_schd_tm)
								.otherwise(
									decode(
										S2_T1.dlv_slip_d_no,
										nullValue(),
										S2_SHIPSCHD.ship_schd_tm,
										S2_SLIP.ship_tm
									)
								).as("ship_hm"),
							trunc(
								decode(
									S2_T1.dlv_slip_d_no,
									nullValue(),
									S2_SHIPSCHD.dlv_schd_tm,
									S2_SLIP.dlv_tm
								),
								MCDateFmt.DD
							).as("dlv_dt"),
							decode(
								S2_T1.dlv_slip_d_no,
								nullValue(),
								S2_SHIPSCHD.dlv_schd_tm,
								S2_SLIP.dlv_tm
							).as("dlv_hm"),
							decode(
								S2_T1.iv_no,
								nullValue(),
								decode(
									S2_T1.slo_d_no,
									nullValue(),
									S2_SLIP.bp_cd,
									S2_SLO.cst_cd
								),
								S2_IV.ship_rqst_id_cd
							).as("cst_cd"),
							decode(
								S2_T1.iv_no,
								nullValue(),
								decode(
									S2_T1.slo_d_no,
									nullValue(),
									S2_SLIP.usr_cd,
									S2_SLO.sls_usr_cd
								),
								S2_IVD.sls_usr_cd
							).as("sls_usr_cd"),
							decode(
								S2_T1.iv_no,
								nullValue(),
								decode(
									S2_T1.slo_d_no,
									nullValue(),
									S2_SLIP.dpt_cd,
									S2_SLO.sls_dpt_cd
								),
								S2_IVD.sls_dpt_cd
							).as("sls_dpt_cd"),
							decode(
								S2_T1.iv_no,
								nullValue(),
								decode(
									S2_T1.slo_d_no,
									nullValue(),
									S2_SLIP.wg_cd,
									S2_SLO.wg_cd
								),
								nullValue()
							).as("wg_cd"),
							decode(
								S2_T1.iv_no,
								nullValue(),
								decode(
									S2_T1.dlv_slip_d_no,
									nullValue(),
									S2_SLO.trd_cur_cd,
									S2_SLIP.trd_cur_cd
								),
								S2_IV.trd_cur_cd
							).as("trd_cur_cd"),
							bind("base_cur_cd").as("base_cur_cd"),
							decode(
								S2_T1.iv_no,
								nullValue(),
								S2_SLO.xrate_inpt_flg,
								S2_IV.xrate_inpt_flg
							).as("xrate_inpt_flg"),
							cases()
								.when(S2_IV.xrate_inpt_flg.eq(value(true)))
									.then(S2_IV.xrate)
								.when(
									S2_T1.iv_no.isNull()
									.and(S2_SLO.xrate_inpt_flg.eq(value(true)))
								)
									.then(S2_SLO.xrate)
								.otherwise(
									MAPA_XCHNG$F_GET_SLS_XRATE_NE(
										decode(
											S2_T1.iv_no,
											nullValue(),
											decode(
												S2_T1.dlv_slip_d_no,
												nullValue(),
												S2_SLO.trd_cur_cd,
												S2_SLIP.trd_cur_cd
											),
											S2_IV.trd_cur_cd
										),
										bind("today")
									)
								).as("xrate"),
							bind("sls_xrate_cd").as("xrate_cd"),
							bind("ptax_cur_cd").as("ptax_cur_cd"),
							decode(
								S2_T1.iv_no,
								nullValue(),
								S2_SLO.ptax_xrate_inpt_flg,
								S2_IV.ptax_xrate_inpt_flg
							).as("ptax_xrate_inpt_flg"),
							cases()
								.when(bind("ptax_cur_cd").isNotNull())
									.then(
										cases()
											.when(S2_IV.ptax_xrate_inpt_flg.eq(value(true)))
												.then(S2_IV.ptax_xrate)
											.when(
												S2_T1.iv_no.isNull()
												.and(S2_SLO.ptax_xrate_inpt_flg.eq(value(true)))
											)
												.then(S2_SLO.ptax_xrate)
											.otherwise(
												MAPA_XCHNG$F_GET_XRATE_NE(
													decode(
														S2_T1.iv_no,
														nullValue(),
														decode(
															S2_T1.dlv_slip_d_no,
															nullValue(),
															S2_SLO.trd_cur_cd,
															S2_SLIP.trd_cur_cd
														),
														S2_IV.trd_cur_cd
													),
													bind("ptax_cur_cd"),
													bind("sls_xrate_cd"),
													bind("today")
												)
											)
								)
								.otherwise(nullValue()).as("ptax_xrate"),
							decode(
								S2_T1.iv_no,
								nullValue(),
								decode(
									S2_T1.dlv_slip_d_no,
									nullValue(),
									S2_SLO.cst_po_no,
									S2_SLIP.cst_po_no
								),
								S2_IVD.cst_po_no
							).as("cst_po_no"),
							decode(
								S2_T1.iv_no,
								nullValue(),
								S2_SLIP.dlv_slip_no,
								nvl(S2_SLIP.dlv_slip_no, S2_SHIPACTD.pr("dlv_slip_no"))
							).as("ship_dlv_slip_no"),
							decode(
								S2_T1.iv_no,
								nullValue(),
								S2_T1.dlv_slip_d_no,
								nvl(S2_T1.dlv_slip_d_no, S2_SHIPACTD.pr("dlv_slip_d_no"))
							).as("ship_dlv_slip_d_no"),
							S2_PURCDLVSLIP.purc_ddlv_dlv_slip_no,
							S2_PURCDLVSLIP.purc_ddlv_dlv_slip_d_no,
							S2_T1.iv_no,
							S2_T1.iv_d_no,
							S2_IVD.disp_seq.as("ivd_disp_seq"),
							S2_SLIP.dlv_slip_act_no.as("ship_act_no"),
							S2_SLIP.ac_dt.as("dlv_ac_ym"),
							S2_SLIP.ac_dt.as("dlv_ac_dt"),
							S2_SLOD.slo_no,
							S2_T1.slo_d_no,
							S2_SLOD.disp_seq.as("slod_disp_seq"),
							S2_SLOD.qtn_no,
							S2_SLOD.qtn_rev,
							S2_SLOD.qtn_d_no,
							S2_T1.po_schd_no,
							nullValue().as("acst_cd"),
							decode(
								S2_T1.iv_no,
								nullValue(),
								decode(
									S2_T1.slo_d_no,
									nullValue(),
									nullValue(),
									S2_SLO.ar_dpt_cd
								),
								S2_IVD.ar_dpt_cd
							).as("ar_dpt_cd"),
							decode(
								S2_T1.iv_no,
								nullValue(),
								decode(
									S2_T1.dlv_slip_d_no,
									nullValue(),
									S2_SLO.trd_rmrks,
									S2_SLIP.trd_rmrks
								),
								S2_IVD.trd_rmrks
							).as("trd_rmrks"),
							decode(
								S2_T1.iv_no,
								nullValue(),
								decode(
									S2_T1.dlv_slip_d_no,
									nullValue(),
									nvl(
										S2_SHIPSCHD.dlv_cd,
										S2_SLOD.dlv_cd
									),
									S2_SLIP.dlv_id_cd
								),
								S2_IV.dlv_id_cd
							).as("dlv_cd"),
							decode(
								S2_T1.iv_no,
								nullValue(),
								decode(
									S2_T1.dlv_slip_d_no,
									nullValue(),
									nvl2(
										S2_SHIPSCHD.dlv_cd,
										S2_SHIPSCHD.dlv_nm,
										S2_SLOD.dlv_nm
									),
									S2_SLIP.dlv_id_nm
								),
								S2_IV.dlv_id_nm
							).as("dlv_nm"),
							decode(
								S2_T1.iv_no,
								nullValue(),
								decode(
									S2_T1.dlv_slip_d_no,
									nullValue(),
									nvl2(
										S2_SHIPSCHD.dlv_cd,
										S2_SHIPSCHD.dlv_sundry_flg,
										S2_SLOD.dlv_sundry_flg
									),
									S2_SLIP.dlv_sundry_flg
								),
								S2_IV.dlv_sundry_flg
							).as("dlv_sundry_flg"),
							decode(
								S2_T1.iv_no,
								nullValue(),
								decode(
									S2_T1.dlv_slip_d_no,
									nullValue(),
									nvl2(
										S2_SHIPSCHD.dlv_cd,
										S2_SHIPSCHD.dlv_zip_cd,
										S2_SLOD.dlv_zip_cd
									),
									S2_SLIP.dlv_zip_cd
								),
								S2_IV.dlv_zip_cd
							).as("dlv_zip_cd"),
							decode(
								S2_T1.iv_no,
								nullValue(),
								decode(
									S2_T1.dlv_slip_d_no,
									nullValue(),
									nvl2(
										S2_SHIPSCHD.dlv_cd,
										S2_SHIPSCHD.dlv_addr1,
										S2_SLOD.dlv_addr1
									),
									S2_SLIP.dlv_addr1
								),
								S2_IV.dlv_addr1
							).as("dlv_addr1"),
							decode(
								S2_T1.iv_no,
								nullValue(),
								decode(
									S2_T1.dlv_slip_d_no,
									nullValue(),
									nvl2(
										S2_SHIPSCHD.dlv_cd,
										S2_SHIPSCHD.dlv_addr2,
										S2_SLOD.dlv_addr2
									),
									S2_SLIP.dlv_addr2
								),
								S2_IV.dlv_addr2
							).as("dlv_addr2"),
							decode(
								S2_T1.iv_no,
								nullValue(),
								decode(
									S2_T1.dlv_slip_d_no,
									nullValue(),
									nvl2(
										S2_SHIPSCHD.dlv_cd,
										S2_SHIPSCHD.dlv_addr3,
										S2_SLOD.dlv_addr3
									),
									S2_SLIP.dlv_addr3
								),
								S2_IV.dlv_addr3
							).as("dlv_addr3"),
							decode(
								S2_T1.iv_no,
								nullValue(),
								decode(
									S2_T1.dlv_slip_d_no,
									nullValue(),
									nvl2(
										S2_SHIPSCHD.dlv_cd,
										S2_SHIPSCHD.dlv_addr4,
										S2_SLOD.dlv_addr4
									),
									S2_SLIP.dlv_addr4
								),
								S2_IV.dlv_addr4
							).as("dlv_addr4"),
							decode(
								S2_T1.iv_no,
								nullValue(),
								decode(
									S2_T1.dlv_slip_d_no,
									nullValue(),
									nvl2(
										S2_SHIPSCHD.dlv_cd,
										S2_SHIPSCHD.dlv_cntct_dpt,
										S2_SLOD.dlv_cntct_dpt
									),
									S2_SLIP.dlv_cntct_dpt
								),
								S2_IV.dlv_cntct_dpt
							).as("dlv_cntct_dpt"),
							decode(
								S2_T1.iv_no,
								nullValue(),
								decode(
									S2_T1.dlv_slip_d_no,
									nullValue(),
									nvl2(
										S2_SHIPSCHD.dlv_cd,
										S2_SHIPSCHD.dlv_cntct_psn,
										S2_SLOD.dlv_cntct_psn
									),
									S2_SLIP.dlv_cntct_psn
								),
								S2_IV.dlv_cntct_psn
							).as("dlv_cntct_psn"),
							decode(
								S2_T1.iv_no,
								nullValue(),
								decode(
									S2_T1.dlv_slip_d_no,
									nullValue(),
									nvl2(
										S2_SHIPSCHD.dlv_cd,
										S2_SHIPSCHD.dlv_tel,
										S2_SLOD.dlv_tel
									),
									S2_SLIP.dlv_tel
								),
								S2_IV.dlv_tel
							).as("dlv_tel"),
							decode(
								S2_T1.iv_no,
								nullValue(),
								decode(
									S2_T1.dlv_slip_d_no,
									nullValue(),
									nvl2(
										S2_SHIPSCHD.dlv_cd,
										S2_SHIPSCHD.dlv_fax,
										S2_SLOD.dlv_fax
									),
									S2_SLIP.dlv_fax
								),
								S2_IV.dlv_fax
							).as("dlv_fax"),
							decode(
								S2_T1.dlv_slip_d_no,
								nullValue(),
								nvl2(
									S2_SHIPSCHD.dlv_cd,
									S2_SHIPSCHD.pri_prnt_flg,
									S2_SLOD.pri_prnt_flg
								),
								S2_SLIP.pri_prnt_flg
							).as("pri_prnt_flg"),
							S2_SLOD.dest_cd1,
							S2_SLOD.dest_cd2,
							S2_SLOD.dest_cd3,
							decode(
								S2_T1.iv_no,
								nullValue(),
								decode(
									S2_T1.dlv_slip_d_no,
									nullValue(),
									S2_SLOD.itm_cd,
									S2_SLIPD.itm_cd
								),
								S2_IVD.itm_cd
							).as("itm_cd"),
							decode(
								S2_T1.iv_no,
								nullValue(),
								decode(
									S2_T1.dlv_slip_d_no,
									nullValue(),
									S2_SLOD.itm_sub1,
									S2_SLIPD.itm_sub1
								),
								S2_IVD.itm_sub1
							).as("itm_sub1"),
							decode(
								S2_T1.iv_no,
								nullValue(),
								decode(
									S2_T1.dlv_slip_d_no,
									nullValue(),
									S2_SLOD.itm_sub2,
									S2_SLIPD.itm_sub2
								),
								S2_IVD.itm_sub2
							).as("itm_sub2"),
							decode(
								S2_T1.iv_no,
								nullValue(),
								decode(
									S2_T1.dlv_slip_d_no,
									nullValue(),
									S2_SLOD.itm_sub3,
									S2_SLIPD.itm_sub3
								),
								S2_IVD.itm_sub3
							).as("itm_sub3"),
							decode(
								S2_T1.iv_no,
								nullValue(),
								decode(
									S2_T1.dlv_slip_d_no,
									nullValue(),
									S2_SLOD.itm_nm,
									S2_SLIPD.itm_nm
								),
								S2_IVD.itm_nm
							).as("itm_nm"),
							decode(
								S2_T1.iv_no,
								nullValue(),
								S2_SLOD.iv_itm_nm,
								S2_IVD.iv_itm_nm
							).as("iv_itm_nm"),
							decode(
								S2_T1.iv_no,
								nullValue(),
								decode(
									S2_T1.purc_schd_no,
									nullValue(),
									decode(
										S2_T1.dlv_slip_d_no,
										nullValue(),
										S2_SAS.pr("lot_no"),
										S2_SLIPD.lot_no
									),
									nvl(
										S2_PURCACTD.lot_no,
										S2_ARRSCHD.lot_no
									)
								),
								nullValue()
							).as("lot_no"),
							decode(
								S2_T1.iv_no,
								nullValue(),
								decode(
									S2_T1.purc_schd_no,
									nullValue(),
									decode(
										S2_T1.dlv_slip_d_no,
										nullValue(),
										S2_SAS.pr("sublot_no"),
										S2_SLIPD.sublot_no
									),
									nvl(
										S2_PURCACTD.sublot_no,
										S2_ARRSCHD.sublot_no
									)
								),
								nullValue()
							).as("sublot_no"),
							decode(
								S2_T1.iv_no,
								nullValue(),
								decode(
									S2_T1.purc_schd_no,
									nullValue(),
									decode(
										S2_T1.dlv_slip_d_no,
										nullValue(),
										S2_SAS.pr("ver_no"),
										nullValue()
									),
									nvl(
										S2_PURCACTD.ver_no,
										S2_ARRSCHD.ver_no
									)
								),
								nullValue()
							).as("ver_no"),
							decode(
								S2_T1.iv_no,
								nullValue(),
								decode(
									S2_T1.dlv_slip_d_no,
									nullValue(),
									S2_SLOD.sno1,
									S2_SLIPD.sno1
								),
								S2_IVD.sno1
							).as("sno1"),
							decode(
								S2_T1.iv_no,
								nullValue(),
								decode(
									S2_T1.dlv_slip_d_no,
									nullValue(),
									S2_SLOD.sno2,
									S2_SLIPD.sno2
								),
								S2_IVD.sno2
							).as("sno2"),
							decode(
								S2_T1.iv_no,
								nullValue(),
								decode(
									S2_T1.dlv_slip_d_no,
									nullValue(),
									S2_SLOD.sno3,
									S2_SLIPD.sno3
								),
								S2_IVD.sno3
							).as("sno3"),
							decode(
								S2_T1.iv_no,
								nullValue(),
								decode(
									S2_T1.dlv_slip_d_no,
									nullValue(),
									S2_SLOD.sno4,
									S2_SLIPD.sno4
								),
								S2_IVD.sno4
							).as("sno4"),
							decode(
								S2_T1.iv_no,
								nullValue(),
								decode(
									S2_T1.dlv_slip_d_no,
									nullValue(),
									S2_SLOD.sundry_itm_flg,
									S2_SLIPD.sundry_itm_flg
								),
								S2_IVD.sundry_itm_flg
							).as("sundry_itm_flg"),
							bracket(
								subQuery()
								.select(count(S3_W.ship_alloc_sts_no))
								.from(S3_W)
								.where(
									S3_W.ship_schd_no.eq(S2_T1.ship_schd_no)
								)
							).as("ship_alloc_sts_cnt"),
							bracket(
								subQuery()
								.select(count(S4_W.ship_act_d_no))
								.from(S4_W)
								.where(
									S4_W.dlv_slip_d_no.eq(S2_T1.dlv_slip_d_no)
									.and(S4_W.can_flg.eq(value(false)))
								)
							).as("ship_act_d_cnt"),
							bracket(
								subQuery()
								.select(count(S5_W.iv_ship_act_d_no))
								.from(S5_W)
								.where(
									S5_W.iv_d_no.eq(S2_T1.iv_d_no)
								)
							).as("iv_ship_act_d_cnt"),
							bracket(
								subQuery()
								.select(count(S6_ARRA.arr_act_no))
								.from(
									S6_ARRA
									.innerJoin(S6_PURCAI).on(S6_PURCAI.arr_act_no.eq(S6_ARRA.arr_act_no))
									.innerJoin(S6_PURCAD).on(
										S6_PURCAD.purc_act_d_no.eq(S6_PURCAI.purc_act_d_no)
										.and(S6_PURCAD.purc_act_d_seq.eq(S6_PURCAI.purc_act_d_seq))
									)
									.innerJoin(S6_PURCA).on(
										S6_PURCA.purc_act_no.eq(S6_PURCAD.purc_act_no)
										.and(S6_PURCA.purc_act_seq.eq(S6_PURCAD.purc_act_seq))
									)
								)
								.where(
									value(0).eq(value(0))
									.and(S6_PURCAD.purc_act_d_no.eq(S2_T1.purc_act_d_no))
									.and(S6_ARRA.can_flg.eq(value(false)))
									.and(S6_PURCA.slip_sts_typ.eq(value(MAC_SLIP_STS_TYP.CRT.value())))
								)
							).as("arr_act_cnt"),
							bracket(
								subQuery()
								.select(count(S7_W.pr(S8_X2.dlv_slip_d_no)))
								.from(
									subQuery()
									.selectDistinct(S8_X2.dlv_slip_d_no)
									.from(
										S8_X
										.innerJoin(S8_X1).on(S8_X.ship_schd_no.eq(S8_X1.ship_schd_no))
										.innerJoin(S8_X2).on(S8_X1.ship_alloc_sts_no.eq(S8_X2.ship_alloc_sts_no))
									)
									.where(
										value(0).eq(value(0))
										.and(S8_X1.ship_act_qty.neq(value(0)))
										.and(S8_X2.can_flg.eq(value(false)))
										.and(S8_X.iv_d_no.eq(S2_T1.iv_d_no))
									).view(S7_W)
								)
							).as("dlv_slip_d_cnt"),
							decode(
								S2_T1.iv_no,
								nullValue(),
								decode(
									S2_T1.dlv_slip_d_no,
									nullValue(),
									S2_T1.trd_unit_cd,
									S2_SLIPD.trd_unit_cd
								),
								S2_T1.trd_unit_cd
							).as("trd_unit_cd"),
							decode(
									S2_T1.iv_no,
									nullValue(),
									decode(
										S2_T1.dlv_slip_d_no,
										nullValue(),
										S2_T1.trd_unit_qty,
										S2_SLIPD.trd_unit_qty
									),
									S2_T1.trd_unit_qty
							).as("trd_unit_qty"),
							S2_T1.base_unit_cd,
							S2_T1.base_unit_qty,
							S2_T1.base_unit_qty.as("base_unit_qty_bef"),
							S2_T1.base_unit_qty.as("sls_schd_qty"),
							S2_T1.base_unit_abort_qty.as("abort_qty"),
							S2_T1.base_unit_sls_qty.as("sls_qty"),
							nvl(
								S2_IVD.interim_flg,
								decode(
									S2_T1.dlv_slip_d_no,
									nullValue(),
									S2_SLOD.interim_flg,
									S2_SLIPD.interim_flg
								)
							).as("interim_flg"),
							decode(
								S2_T1.iv_no,
								nullValue(),
								decode(
									S2_T1.dlv_slip_d_no,
									nullValue(),
									S2_SLOD.trd_cur_upri,
									S2_SLIPD.trd_cur_upri
								),
								S2_IVD.trd_cur_upri
							).as("trd_cur_upri"),
							nvl(
								S2_IVD.tax_fix_flg,
								nvl(
									S2_SLOD.tax_fix_flg,
									value(false)
								)
							).as("tax_fix_flg"),
							decode(
								S2_T1.iv_no,
								nullValue(),
								decode(
									S2_T1.dlv_slip_d_no,
									nullValue(),
									S2_SLOD.tax_cd,
									S2_SLIPD.tax_cd
								),
								S2_IVD.tax_cd
							).as("tax_cd"),
							decode(
								S2_T1.iv_no,
								nullValue(),
								decode(
									S2_T1.dlv_slip_d_no,
									nullValue(),
									S2_SLOD.tax_cd,
									S2_SLIPD.tax_cd
								),
								S2_IVD.tax_cd
							).as("schd_tax_cd"),
							decode(
								S2_T1.iv_no,
								nullValue(),
								decode(
									S2_T1.dlv_slip_d_no,
									nullValue(),
									S2_SLOD.trd_cur_dscnt_amt,
									S2_SLIPD.trd_cur_dscnt_amt
								),
								S2_IVD.trd_cur_dscnt_amt
							).as("trd_cur_dscnt_amt"),
							decode(
								S2_T1.iv_no,
								nullValue(),
								S2_SLOD.dscnt_rsn_cd,
								S2_IVD.dscnt_rsn_cd
							).as("dscnt_rsn_cd"),
							S2_SLOD.cost_upri,
							S2_SLOD.bill_crryovr_times,
							decode(
								S2_T1.iv_no,
								nullValue(),
								decode(
									S2_T1.dlv_slip_d_no,
									nullValue(),
									S2_SLOD.gd_cd,
									S2_SLIPD.gd_cd
								),
								S2_IVD.gd_cd
							).as("gd_cd"),
							decode(
								S2_T1.iv_no,
								nullValue(),
								decode(
									S2_T1.dlv_slip_d_no,
									nullValue(),
									S2_SLOD.cst_po_d_no,
									S2_SLIPD.cst_po_d_no
								),
								S2_IVD.cst_po_d_no
							).as("cst_po_d_no"),
							decode(
								S2_T1.iv_no,
								nullValue(),
								decode(
									S2_T1.dlv_slip_d_no,
									nullValue(),
									S2_SLOD.cst_itm_cd,
									S2_SLIPD.cst_itm_cd
								),
								S2_IVD.cst_itm_cd
							).as("cst_itm_cd"),
							decode(
								S2_T1.iv_no,
								nullValue(),
								decode(
									S2_T1.dlv_slip_d_no,
									nullValue(),
									S2_SLOD.cst_itm_nm,
									S2_SLIPD.cst_itm_nm
								),
								S2_IVD.cst_itm_nm
							).as("cst_itm_nm"),
							decode(
								S2_T1.iv_no,
								nullValue(),
								decode(
									S2_T1.dlv_slip_d_no,
									nullValue(),
									S2_SLOD.sls_rsn_cd,
									S2_SLIPD.rsn_cd
								),
								S2_IVD.rsn_cd
							).as("sls_rsn_cd"),
							decode(
								S2_T1.iv_no,
								nullValue(),
								decode(
									S2_T1.dlv_slip_d_no,
									nullValue(),
									S2_SLOD.bd_dpt_cd,
									S2_SLIPD.bd_dpt_cd
								),
								S2_IVD.bd_dpt_cd
							).as("bd_dpt_cd"),
							decode(
								S2_T1.iv_no,
								nullValue(),
								decode(
									S2_T1.dlv_slip_d_no,
									nullValue(),
									S2_SLOD.wtax_rate,
									S2_SLIPD.wtax_rate
								),
								S2_IVD.wtax_rate
							).as("wtax_rate"),
							decode(
								S2_T1.iv_no,
								nullValue(),
								decode(
									S2_T1.dlv_slip_d_no,
									nullValue(),
									S2_SLOD.trd_d_rmrks,
									S2_SLIPD.trd_d_rmrks
								),
								S2_IVD.trd_d_rmrks
							).as("trd_d_rmrks"),
							S2_T1.ins_usr_id,
							S2_T1.ins_usr_nm,
							S2_T1.ins_func_id,
							S2_T1.ins_ts,
							S2_T1.upd_usr_id,
							S2_T1.upd_usr_nm,
							S2_T1.upd_func_id,
							S2_T1.upd_ts,
							S2_T1.upd_srv_req_no,
							S2_T1.upd_cntr,
							S2_T1.sls_schd_no,
							bind("xrate_rnd_typ").as("xrate_rnd_typ"),
							bind("wtax_rnd_typ").as("wtax_rnd_typ"),
							decode(
								S2_T1.iv_no,
								nullValue(),
								decode(
									S2_T1.dlv_slip_d_no,
									nullValue(),
									S2_SLO.sls_basis_typ,
									decode(
										S2_SLIP.sync_flg,
										value(false),
										S2_SLIP.sls_basis_typ,
										value(MAC_SLS_BASIS_TYP.SHIP_BASIS.value())
									)
								),
								S2_IV.sls_basis_typ
							).as("sls_basis_typ"),
							S2_SLOD.sls_cststk_flg,
							nvl(
								S2_SLOD.ship_inst_typ,
								value(MAC_SHIP_INST_TYP.NON.value())
							).as("ship_inst_typ"),
							S2_T1.purc_schd_no,
							S2_ARRSCHD.rcpt_iv_mng_no,
							S2_ARRPR.sppl_cd,
							S2_T1.purc_act_d_no,
							S2_PURCACTD.purc_act_d_seq,
							decode(
								S2_T1.iv_no,
								nullValue(),
								decode(
									S2_T1.dlv_slip_d_no,
									nullValue(),
									S2_SLOD.base_unit_qty,
									S2_SLIPD.base_unit_qty
								),
								S2_IVD.base_unit_qty
							).as("init_schd_qty"),
							decode(
								S2_T1.iv_no,
								nullValue(),
								decode(
									S2_T1.dlv_slip_d_no,
									nullValue(),
									S2_SLOD.trd_cur_dscnt_amt,
									S2_SLIPD.trd_cur_dscnt_amt
								),
								S2_IVD.trd_cur_dscnt_amt
							).as("init_schd_dscnt_amt"),
							decode(
								S2_T1.iv_no,
								nullValue(),
								decode(
									S2_T1.dlv_slip_d_no,
									nullValue(),
									S2_SLOD.trd_unit_cd,
									S2_SLIPD.trd_unit_cd
								),
								S2_IVD.trd_unit_cd
							).as("schd_trd_unit_cd"),
							decode(
								S2_T1.iv_no,
								nullValue(),
								decode(
									S2_T1.dlv_slip_d_no,
									nullValue(),
									S2_SLOD.trd_unit_qty,
									S2_SLIPD.trd_unit_qty
								),
								S2_IVD.trd_unit_qty
							).as("schd_trd_unit_qty"),
							decode(
								S2_T1.iv_no,
								nullValue(),
								decode(
									S2_T1.dlv_slip_d_no,
									nullValue(),
									S2_SLOD.trd_cur_amt,
									S2_SLIPD.trd_cur_amt
								),
								S2_IVD.trd_cur_amt
							).as("schd_trd_cur_amt"),
							decode(
								S2_T1.iv_no,
								nullValue(),
								decode(
									S2_T1.dlv_slip_d_no,
									nullValue(),
									S2_SLOD.trd_cur_tax_amt,
									S2_SLIPD.trd_cur_tax_amt
								),
								S2_IVD.trd_cur_tax_amt
							).as("schd_trd_cur_tax_amt"),
							cases()
								.when(S2_ARRSCHD.lot_no.isNotNull())
									.then(value(true))
								.otherwise(value(false)).as("arr_schd_lot_fix_flg"),
							S2_SHIPSCHD.ship_fr_lg_grp_cd.as("ship_lg_grp_cd"),
							S2_T1.sls_schd_dt.as("master_dt"),
							S2_ARRSCHD.bp_lot_no,
							decode(
								S2_T1.iv_no,
								nullValue(),
								decode(
									S2_T1.dlv_slip_d_no,
									nullValue(),
									S2_SLOD.trd_unit_cd,
									S2_SLIPD.trd_unit_cd
								),
								S2_IVD.trd_unit_cd
							).as("init_trd_unit_cd"),
							decode(
								S2_T1.iv_no,
								nullValue(),
								decode(
									S2_T1.dlv_slip_d_no,
									nullValue(),
									S2_SLOD.trd_unit_qty,
									S2_SLIPD.trd_unit_qty
								),
								S2_IVD.trd_unit_qty
							).as("init_trd_unit_qty"),
							decode(
								S2_T1.iv_no,
								nullValue(),
								decode(
									S2_T1.dlv_slip_d_no,
									nullValue(),
									S2_SLOD.trd_cur_upri,
									S2_SLIPD.trd_cur_upri
								),
								S2_IVD.trd_cur_upri
							).as("init_trd_cur_upri"),
							decode(
								S2_T1.iv_no,
								nullValue(),
								decode(
									S2_T1.dlv_slip_d_no,
									nullValue(),
									S2_SLOD.trd_cur_dscnt_amt,
									S2_SLIPD.trd_cur_dscnt_amt
								),
								S2_IVD.trd_cur_dscnt_amt
							).as("init_trd_cur_dscnt_amt"),
							decode(
								S2_T1.iv_no,
								nullValue(),
								decode(
									S2_T1.dlv_slip_d_no,
									nullValue(),
									S2_SLOD.trd_cur_tax_amt,
									S2_SLIPD.trd_cur_tax_amt
								),
								S2_IVD.trd_cur_tax_amt
							).as("init_trd_cur_tax_amt"),
							S2_PURCACT.ptax_dt,
							S2_SLOD.not_lot_mix_flg,
							S2_SLOD.not_sublot_mix_flg
						)
						.from(
							S2_T1
							.leftOuterJoin(S2_SLOD).on(S2_T1.slo_d_no.eq(S2_SLOD.slo_d_no))
							.leftOuterJoin(S2_IVD).on(S2_T1.iv_d_no.eq(S2_IVD.iv_d_no))
							.leftOuterJoin(S2_IV).on(S2_T1.iv_no.eq(S2_IV.iv_no))
							.leftOuterJoin(S2_SLIPD).on(S2_T1.dlv_slip_d_no.eq(S2_SLIPD.dlv_slip_d_no))
							.leftOuterJoin(S2_SLIP).on(
								S2_SLIPD.dlv_slip_no.eq(S2_SLIP.dlv_slip_no)
								.and(S2_SLIPD.dlv_slip_seq.eq(S2_SLIP.dlv_slip_seq))
							)
							.leftOuterJoin(S2_SLO).on(
								S2_SLOD.slo_no.eq(S2_SLO.slo_no)
								.and(S2_SLO.slo_typ.eq(value(MSC_SLO_TYP.SLO.value())))
							)
							.leftOuterJoin(S2_SHIPSCHD).on(S2_T1.ship_schd_no.eq(S2_SHIPSCHD.ship_schd_no))
							.leftOuterJoin(
								subQuery()
								.select(
									S9_WSAS.pr(S10_W.ship_schd_no),
									decode(
										S9_WSAS.pr("lot_not_cnt"),
										value(1),
										S9_WSAS.pr(S10_W.lot_no),
										nullValue()
									).as("lot_no"),
									decode(
										S9_WSAS.pr("lot_not_cnt"),
										value(1),
										S9_WSAS.pr(S10_W.sublot_no),
										nullValue()
									).as("sublot_no"),
									decode(
										S9_WSAS.pr("lot_not_cnt"),
										value(1),
										S9_WSAS.pr(S10_W.ver_no),
										nullValue()
									).as("ver_no")
								)
								.from(
									subQuery()
									.select(
										S10_W.ship_schd_no,
										S10_W.lot_no,
										S10_W.sublot_no,
										S10_W.ver_no,
										count(value("X"))
											.over()
											.partitionBy(S10_W.ship_schd_no).as("lot_not_cnt")
									)
									.from(
										S10_W
										.innerJoin(S10_W2).on(S10_W.ship_schd_no.eq(S10_W2.ship_schd_no))
									)
									.where(
										value(0).eq(value(0))
										.and(S10_W2.sls_ac_abl_flg.eq(value(true)))
										.and(S10_W2.cmpl_flg.eq(value(false)))
										.and(
											S10_W2.base_unit_qty.subtract(bracket(
													S10_W2.base_unit_sls_qty.add(S10_W2.base_unit_abort_qty)
												)).gt(value(0))
										)
									)
									.groupBy(
										S10_W.ship_schd_no,
										S10_W.lot_no,
										S10_W.sublot_no,
										S10_W.ver_no
									).view(S9_WSAS)
								)
								.groupBy(
									S9_WSAS.pr(S10_W.ship_schd_no),
									decode(
										S9_WSAS.pr("lot_not_cnt"),
										value(1),
										S9_WSAS.pr(S10_W.lot_no),
										nullValue()
									),
									decode(
										S9_WSAS.pr("lot_not_cnt"),
										value(1),
										S9_WSAS.pr(S10_W.sublot_no),
										nullValue()
									),
									decode(
										S9_WSAS.pr("lot_not_cnt"),
										value(1),
										S9_WSAS.pr(S10_W.ver_no),
										nullValue()
									)
								).view(S2_SAS)
							).on(S2_T1.ship_schd_no.eq(S2_SAS.pr(S10_W.ship_schd_no)))
							.leftOuterJoin(S2_PURCACTD).on(S2_T1.purc_act_d_no.eq(S2_PURCACTD.purc_act_d_no))
							.leftOuterJoin(S2_PURCACT).on(
								S2_PURCACT.purc_act_no.eq(S2_PURCACTD.purc_act_no)
								.and(S2_PURCACT.purc_act_seq.eq(S2_PURCACTD.purc_act_seq))
							)
							.leftOuterJoin(S2_PURCSCHD).on(S2_T1.purc_schd_no.eq(S2_PURCSCHD.purc_schd_no))
							.leftOuterJoin(S2_ARRSCHD).on(S2_ARRSCHD.arr_schd_no.eq(S2_PURCSCHD.arr_schd_no))
							.leftOuterJoin(S2_ARRPR).on(S2_ARRSCHD.arr_pr_no.eq(S2_ARRPR.arr_pr_no))
							.leftOuterJoin(S2_PURCDLVSLIP).on(
								S2_ARRSCHD.dlv_slip_mng_d_no.eq(S2_PURCDLVSLIP.dlv_slip_mng_d_no)
								.and(S2_ARRSCHD.dlv_slip_mng_d_seq.eq(S2_PURCDLVSLIP.dlv_slip_mng_d_seq))
							)
						.leftOuterJoin(
								subQuery()
								.select(
									max(S11_X2.dlv_slip_no).as("dlv_slip_no"),
									max(S11_X2.dlv_slip_d_no).as("dlv_slip_d_no"),
									S11_X.iv_d_no
								)
								.from(
									S11_X
									.innerJoin(S11_X1).on(S11_X.ship_schd_no.eq(S11_X1.ship_schd_no))
									.innerJoin(S11_X2).on(S11_X1.ship_alloc_sts_no.eq(S11_X2.ship_alloc_sts_no))
								)
								.where(
									value(0).eq(value(0))
									.and(S11_X1.ship_act_qty.neq(value(0)))
									.and(S11_X2.can_flg.eq(value(false)))
								)
								.groupBy(S11_X.iv_d_no).view(S2_SHIPACTD)
							).on(S2_T1.iv_d_no.eq(S2_SHIPACTD.pr(S11_X.iv_d_no)))
						)
						.where(
							value(0).eq(value(0))
							.and(
								S2_SLIPD.dlv_slip_d_seq.isNull()
								.or(
									S2_SLIPD.dlv_slip_d_seq.eq(subQuery()
										.select(max(S12_W.dlv_slip_d_seq))
										.from(S12_W
											.innerJoin(S12_W2).on(
												S12_W2.dlv_slip_no.eq(S12_W.dlv_slip_no)
												.and(S12_W2.dlv_slip_seq.eq(S12_W.dlv_slip_seq))
											)
										)
										.where(
											S12_W.dlv_slip_d_no.eq(S2_T1.dlv_slip_d_no)
											.and(S12_W2.trn_typ.eq(value(MSC_TRN_TYP.SHIP.value())))
											.and(S12_W2.slip_sts_typ.neq(value(MAC_SLIP_STS_TYP.CAN.value())))
										)
									)
								)
							)
							.and(
								S2_PURCACT.slip_sts_typ.eq(value(MAC_SLIP_STS_TYP.CRT.value()))
								.or(S2_PURCACTD.purc_act_seq.isNull())
							)
							.and(S2_T1.sls_ac_abl_flg.eq(value(true)))
							.and(S2_T1.cmpl_flg.eq(value(false)))
							.and(
								S2_T1.base_unit_qty.subtract(bracket(
										S2_T1.base_unit_sls_qty.add(S2_T1.base_unit_abort_qty)
									)).gt(value(0))
							)
							.and(
								S2_SLO.aprv_sts_typ.isNull()
								.or(S2_SLO.aprv_flg.eq(value(false)))
								.or(S2_SLO.aprv_sts_typ.eq(value(MAC_APRV_STS_TYP.ACPT.value())))
							)
						).view(S0_V1)
						.leftOuterJoin(S0_CST).on(S0_V1.pr("cst_cd").eq(S0_CST.bp_cd))
						.leftOuterJoin(S0_SPPL).on(S0_V1.pr(S2_ARRPR.sppl_cd).eq(S0_SPPL.bp_cd))
						.addDynamicView(DS0D)
					)
					.where(
						exists(
							subQuery()
							.select(value("X"))
							.from(S13_DAC)
							.where(
								S0_V1.pr("sls_dpt_cd").eq(S13_DAC.dpt_cd)
							)
						)
						.and(
							S0_CST.cst_iv_flg.eq(value(false))
							.or(S0_V1.pr(S2_T1.iv_no).isNotNull())
						)
						.and(
							S0_V1.pr(S2_ARRPR.sppl_cd).isNull()
							.or(S0_SPPL.sppl_iv_flg.eq(value(false)))
							.or(S0_V1.pr(S2_ARRSCHD.rcpt_iv_mng_no).isNotNull())
						)
						.cutoff$and(S0_V1.pr("ship_dlv_slip_no").like(bind("ship_dlv_slip_no")))
						.cutoff$and(S0_V1.pr("purc_ddlv_dlv_slip_no").like(bind("purc_ddlv_dlv_slip_no")))
						.cutoff$and(S0_V1.pr("ship_act_no").like(bind("ship_act_no")))
						.cutoff$and(S0_V1.pr(S2_T1.iv_no).like(bind("iv_no")))
						.cutoff$and(S0_V1.pr(S2_SLOD.slo_no).like(bind("slo_no")))
						.cutoff$and(S0_V1.pr("ship_hm").gte(bind("ship_hm_fr")))
						.cutoff$and(S0_V1.pr("ship_hm").lte(bind("ship_hm_to")))
						.cutoff$and(S0_V1.pr("dlv_hm").gte(bind("dlv_hm_fr")))
						.cutoff$and(S0_V1.pr("dlv_hm").lte(bind("dlv_hm_to")))
						.cutoff$and(S0_V1.pr(S2_T1.sls_schd_dt).gte(bind("sls_schd_dt_fr")))
						.cutoff$and(S0_V1.pr(S2_T1.sls_schd_dt).lte(bind("sls_schd_dt_to")))
						.cutoff$and(S0_V1.pr("dlv_cd").like(bind("dlv_cd")))
						.cutoff$and(S0_V1.pr(S2_SLOD.dest_cd1).like(bind("dest_cd1")))
						.cutoff$and(S0_V1.pr(S2_SLOD.dest_cd2).like(bind("dest_cd2")))
						.cutoff$and(S0_V1.pr(S2_SLOD.dest_cd3).like(bind("dest_cd3")))
						.cutoff$and(S0_V1.pr("cst_cd").like(bind("cst_cd")))
						.cutoff$and(S0_CST.bp_nm.like(bind("cst_nm")))
						.cutoff$and(S0_CST.cst_iv_flg.eq(bind("cst_iv_flg_str")))
						.cutoff$and(S0_V1.pr("cst_po_no").like(bind("cst_po_no")))
						.cutoff$and(S0_V1.pr("sls_usr_cd").like(bind("sls_usr_cd")))
						.cutoff$and(S0_V1.pr("sls_dpt_cd").like(bind("sls_dpt_cd")))
						.cutoff$and(S0_V1.pr(S2_ARRPR.sppl_cd).like(bind("sppl_cd")))
						.cutoff$and(S0_SPPL.bp_nm.like(bind("sppl_nm")))
						.cutoff$and(S0_V1.pr("trd_cd").like(bind("trd_cd")))
						.cutoff$and(S0_V1.pr("cst_itm_cd").like(bind("cst_itm_cd")))
						.cutoff$and(S0_V1.pr("cst_itm_nm").like(bind("cst_itm_nm")))
						.cutoff$and(S0_V1.pr("itm_cd").like(bind("itm_cd")))
						.cutoff$and(S0_V1.pr("itm_sub1").like(bind("itm_sub1")))
						.cutoff$and(S0_V1.pr("itm_sub2").like(bind("itm_sub2")))
						.cutoff$and(S0_V1.pr("itm_sub3").like(bind("itm_sub3")))
						.cutoff$and(S0_V1.pr("sno1").like(bind("sno1")))
						.cutoff$and(S0_V1.pr("sno2").like(bind("sno2")))
						.cutoff$and(S0_V1.pr("sno3").like(bind("sno3")))
						.cutoff$and(S0_V1.pr("sno4").like(bind("sno4")))
						.cutoff$and(S0_V1.pr("ship_lg_grp_cd").like(bind("ship_lg_grp_cd")))
						.cutoff$and(S0_V1.pr("trd_rmrks").like(bind("trd_rmrks")))
						.cutoff$and(S0_V1.pr("trd_d_rmrks").like(bind("trd_d_rmrks")))
						.addDynamicPredicate(DS0D)
					)
					.orderBy(
						S0_V1.pr(S2_T1.sls_schd_dt).asc(),
						S0_V1.pr(S2_SLOD.slo_no).asc(),
						S0_V1.pr("slod_disp_seq").asc(),
						S0_V1.pr("ship_dlv_slip_no").asc(),
						S0_V1.pr("ship_dlv_slip_d_no").asc(),
						S0_V1.pr(S2_T1.iv_no).asc(),
						S0_V1.pr("ivd_disp_seq").asc()
					)
			)
			.setDynamicSQLInfo(
				when(boundOr("cst_grp_flg1"))
					.select(DS0D, S0_CST.bp_grp_cd1.as("cst_grp_cd1"))
					.groupBy(DS0D, S0_CST.bp_grp_cd1),
				when(boundOr("cst_grp_flg1", "cst_grp_cd1"))
					.predicate(DS0D, p -> p.cutoff$and(S0_CST.bp_grp_cd1.like(bind("cst_grp_cd1")))),
				when(boundOr("cst_grp_flg1"))
					.select(DS0D, S0_CST_GRP1.bp_grp_nm.as("cst_grp_nm1"))
					.groupBy(DS0D, S0_CST_GRP1.bp_grp_nm),
				when(boundOr("cst_grp_flg1", "cst_grp_nm1"))
					.view(DS0D, v -> v.leftOuterJoin(S0_CST_GRP1).on(S0_CST.bp_grp_cd1.eq(S0_CST_GRP1.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP1.value()).eq(S0_CST_GRP1.bp_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_CST_GRP1.bp_grp_nm.like(bind("cst_grp_nm1")))),
				when(boundOr("cst_grp_flg2"))
					.select(DS0D, S0_CST.bp_grp_cd2.as("cst_grp_cd2"))
					.groupBy(DS0D, S0_CST.bp_grp_cd2),
				when(boundOr("cst_grp_flg2", "cst_grp_cd2"))
					.predicate(DS0D, p -> p.cutoff$and(S0_CST.bp_grp_cd2.like(bind("cst_grp_cd2")))),
				when(boundOr("cst_grp_flg2"))
					.select(DS0D, S0_CST_GRP2.bp_grp_nm.as("cst_grp_nm2"))
					.groupBy(DS0D, S0_CST_GRP2.bp_grp_nm),
				when(boundOr("cst_grp_flg2", "cst_grp_nm2"))
					.view(DS0D, v -> v.leftOuterJoin(S0_CST_GRP2).on(S0_CST.bp_grp_cd2.eq(S0_CST_GRP2.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP2.value()).eq(S0_CST_GRP2.bp_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_CST_GRP2.bp_grp_nm.like(bind("cst_grp_nm2")))),
				when(boundOr("cst_grp_flg3"))
					.select(DS0D, S0_CST.bp_grp_cd3.as("cst_grp_cd3"))
					.groupBy(DS0D, S0_CST.bp_grp_cd3),
				when(boundOr("cst_grp_flg3", "cst_grp_cd3"))
					.predicate(DS0D, p -> p.cutoff$and(S0_CST.bp_grp_cd3.like(bind("cst_grp_cd3")))),
				when(boundOr("cst_grp_flg3"))
					.select(DS0D, S0_CST_GRP3.bp_grp_nm.as("cst_grp_nm3"))
					.groupBy(DS0D, S0_CST_GRP3.bp_grp_nm),
				when(boundOr("cst_grp_flg3", "cst_grp_nm3"))
					.view(DS0D, v -> v.leftOuterJoin(S0_CST_GRP3).on(S0_CST.bp_grp_cd3.eq(S0_CST_GRP3.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP3.value()).eq(S0_CST_GRP3.bp_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_CST_GRP3.bp_grp_nm.like(bind("cst_grp_nm3")))),
				when(boundOr("cst_grp_flg4"))
					.select(DS0D, S0_CST.bp_grp_cd4.as("cst_grp_cd4"))
					.groupBy(DS0D, S0_CST.bp_grp_cd4),
				when(boundOr("cst_grp_flg4", "cst_grp_cd4"))
					.predicate(DS0D, p -> p.cutoff$and(S0_CST.bp_grp_cd4.like(bind("cst_grp_cd4")))),
				when(boundOr("cst_grp_flg4"))
					.select(DS0D, S0_CST_GRP4.bp_grp_nm.as("cst_grp_nm4"))
					.groupBy(DS0D, S0_CST_GRP4.bp_grp_nm),
				when(boundOr("cst_grp_flg4", "cst_grp_nm4"))
					.view(DS0D, v -> v.leftOuterJoin(S0_CST_GRP4).on(S0_CST.bp_grp_cd4.eq(S0_CST_GRP4.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP4.value()).eq(S0_CST_GRP4.bp_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_CST_GRP4.bp_grp_nm.like(bind("cst_grp_nm4")))),
				when(boundOr("cst_grp_flg5"))
					.select(DS0D, S0_CST.bp_grp_cd5.as("cst_grp_cd5"))
					.groupBy(DS0D, S0_CST.bp_grp_cd5),
				when(boundOr("cst_grp_flg5", "cst_grp_cd5"))
					.predicate(DS0D, p -> p.cutoff$and(S0_CST.bp_grp_cd5.like(bind("cst_grp_cd5")))),
				when(boundOr("cst_grp_flg5"))
					.select(DS0D, S0_CST_GRP5.bp_grp_nm.as("cst_grp_nm5"))
					.groupBy(DS0D, S0_CST_GRP5.bp_grp_nm),
				when(boundOr("cst_grp_flg5", "cst_grp_nm5"))
					.view(DS0D, v -> v.leftOuterJoin(S0_CST_GRP5).on(S0_CST.bp_grp_cd5.eq(S0_CST_GRP5.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP5.value()).eq(S0_CST_GRP5.bp_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_CST_GRP5.bp_grp_nm.like(bind("cst_grp_nm5")))),
				when(boundOr("cst_grp_flg6"))
					.select(DS0D, S0_CST.bp_grp_cd6.as("cst_grp_cd6"))
					.groupBy(DS0D, S0_CST.bp_grp_cd6),
				when(boundOr("cst_grp_flg6", "cst_grp_cd6"))
					.predicate(DS0D, p -> p.cutoff$and(S0_CST.bp_grp_cd6.like(bind("cst_grp_cd6")))),
				when(boundOr("cst_grp_flg6"))
					.select(DS0D, S0_CST_GRP6.bp_grp_nm.as("cst_grp_nm6"))
					.groupBy(DS0D, S0_CST_GRP6.bp_grp_nm),
				when(boundOr("cst_grp_flg6", "cst_grp_nm6"))
					.view(DS0D, v -> v.leftOuterJoin(S0_CST_GRP6).on(S0_CST.bp_grp_cd6.eq(S0_CST_GRP6.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP6.value()).eq(S0_CST_GRP6.bp_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_CST_GRP6.bp_grp_nm.like(bind("cst_grp_nm6")))),
				when(boundOr("cst_grp_flg7"))
					.select(DS0D, S0_CST.bp_grp_cd7.as("cst_grp_cd7"))
					.groupBy(DS0D, S0_CST.bp_grp_cd7),
				when(boundOr("cst_grp_flg7", "cst_grp_cd7"))
					.predicate(DS0D, p -> p.cutoff$and(S0_CST.bp_grp_cd7.like(bind("cst_grp_cd7")))),
				when(boundOr("cst_grp_flg7"))
					.select(DS0D, S0_CST_GRP7.bp_grp_nm.as("cst_grp_nm7"))
					.groupBy(DS0D, S0_CST_GRP7.bp_grp_nm),
				when(boundOr("cst_grp_flg7", "cst_grp_nm7"))
					.view(DS0D, v -> v.leftOuterJoin(S0_CST_GRP7).on(S0_CST.bp_grp_cd7.eq(S0_CST_GRP7.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP7.value()).eq(S0_CST_GRP7.bp_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_CST_GRP7.bp_grp_nm.like(bind("cst_grp_nm7")))),
				when(boundOr("cst_grp_flg8"))
					.select(DS0D, S0_CST.bp_grp_cd8.as("cst_grp_cd8"))
					.groupBy(DS0D, S0_CST.bp_grp_cd8),
				when(boundOr("cst_grp_flg8", "cst_grp_cd8"))
					.predicate(DS0D, p -> p.cutoff$and(S0_CST.bp_grp_cd8.like(bind("cst_grp_cd8")))),
				when(boundOr("cst_grp_flg8"))
					.select(DS0D, S0_CST_GRP8.bp_grp_nm.as("cst_grp_nm8"))
					.groupBy(DS0D, S0_CST_GRP8.bp_grp_nm),
				when(boundOr("cst_grp_flg8", "cst_grp_nm8"))
					.view(DS0D, v -> v.leftOuterJoin(S0_CST_GRP8).on(S0_CST.bp_grp_cd8.eq(S0_CST_GRP8.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP8.value()).eq(S0_CST_GRP8.bp_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_CST_GRP8.bp_grp_nm.like(bind("cst_grp_nm8")))),
				when(boundOr("cst_grp_flg9"))
					.select(DS0D, S0_CST.bp_grp_cd9.as("cst_grp_cd9"))
					.groupBy(DS0D, S0_CST.bp_grp_cd9),
				when(boundOr("cst_grp_flg9", "cst_grp_cd9"))
					.predicate(DS0D, p -> p.cutoff$and(S0_CST.bp_grp_cd9.like(bind("cst_grp_cd9")))),
				when(boundOr("cst_grp_flg9"))
					.select(DS0D, S0_CST_GRP9.bp_grp_nm.as("cst_grp_nm9"))
					.groupBy(DS0D, S0_CST_GRP9.bp_grp_nm),
				when(boundOr("cst_grp_flg9", "cst_grp_nm9"))
					.view(DS0D, v -> v.leftOuterJoin(S0_CST_GRP9).on(S0_CST.bp_grp_cd9.eq(S0_CST_GRP9.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP9.value()).eq(S0_CST_GRP9.bp_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_CST_GRP9.bp_grp_nm.like(bind("cst_grp_nm9")))),
				when(boundOr("cst_grp_flg10"))
					.select(DS0D, S0_CST.bp_grp_cd10.as("cst_grp_cd10"))
					.groupBy(DS0D, S0_CST.bp_grp_cd10),
				when(boundOr("cst_grp_flg10", "cst_grp_cd10"))
					.predicate(DS0D, p -> p.cutoff$and(S0_CST.bp_grp_cd10.like(bind("cst_grp_cd10")))),
				when(boundOr("cst_grp_flg10"))
					.select(DS0D, S0_CST_GRP10.bp_grp_nm.as("cst_grp_nm10"))
					.groupBy(DS0D, S0_CST_GRP10.bp_grp_nm),
				when(boundOr("cst_grp_flg10", "cst_grp_nm10"))
					.view(DS0D, v -> v.leftOuterJoin(S0_CST_GRP10).on(S0_CST.bp_grp_cd10.eq(S0_CST_GRP10.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP10.value()).eq(S0_CST_GRP10.bp_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_CST_GRP10.bp_grp_nm.like(bind("cst_grp_nm10")))),
				when(boundOr("sppl_grp_flg1"))
					.select(DS0D, S0_SPPL.bp_grp_cd1.as("sppl_grp_cd1"))
					.groupBy(DS0D, S0_SPPL.bp_grp_cd1),
				when(boundOr("sppl_grp_flg1", "sppl_grp_cd1"))
					.predicate(DS0D, p -> p.cutoff$and(S0_SPPL.bp_grp_cd1.like(bind("sppl_grp_cd1")))),
				when(boundOr("sppl_grp_flg1"))
					.select(DS0D, S0_SPPL_GRP1.bp_grp_nm.as("sppl_grp_nm1"))
					.groupBy(DS0D, S0_SPPL_GRP1.bp_grp_nm),
				when(boundOr("sppl_grp_flg1", "sppl_grp_nm1"))
					.view(DS0D, v -> v.leftOuterJoin(S0_SPPL_GRP1).on(S0_SPPL.bp_grp_cd1.eq(S0_SPPL_GRP1.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP1.value()).eq(S0_SPPL_GRP1.bp_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_SPPL_GRP1.bp_grp_nm.like(bind("sppl_grp_nm1")))),
				when(boundOr("sppl_grp_flg2"))
					.select(DS0D, S0_SPPL.bp_grp_cd2.as("sppl_grp_cd2"))
					.groupBy(DS0D, S0_SPPL.bp_grp_cd2),
				when(boundOr("sppl_grp_flg2", "sppl_grp_cd2"))
					.predicate(DS0D, p -> p.cutoff$and(S0_SPPL.bp_grp_cd2.like(bind("sppl_grp_cd2")))),
				when(boundOr("sppl_grp_flg2"))
					.select(DS0D, S0_SPPL_GRP2.bp_grp_nm.as("sppl_grp_nm2"))
					.groupBy(DS0D, S0_SPPL_GRP2.bp_grp_nm),
				when(boundOr("sppl_grp_flg2", "sppl_grp_nm2"))
					.view(DS0D, v -> v.leftOuterJoin(S0_SPPL_GRP2).on(S0_SPPL.bp_grp_cd2.eq(S0_SPPL_GRP2.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP2.value()).eq(S0_SPPL_GRP2.bp_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_SPPL_GRP2.bp_grp_nm.like(bind("sppl_grp_nm2")))),
				when(boundOr("sppl_grp_flg3"))
					.select(DS0D, S0_SPPL.bp_grp_cd3.as("sppl_grp_cd3"))
					.groupBy(DS0D, S0_SPPL.bp_grp_cd3),
				when(boundOr("sppl_grp_flg3", "sppl_grp_cd3"))
					.predicate(DS0D, p -> p.cutoff$and(S0_SPPL.bp_grp_cd3.like(bind("sppl_grp_cd3")))),
				when(boundOr("sppl_grp_flg3"))
					.select(DS0D, S0_SPPL_GRP3.bp_grp_nm.as("sppl_grp_nm3"))
					.groupBy(DS0D, S0_SPPL_GRP3.bp_grp_nm),
				when(boundOr("sppl_grp_flg3", "sppl_grp_nm3"))
					.view(DS0D, v -> v.leftOuterJoin(S0_SPPL_GRP3).on(S0_SPPL.bp_grp_cd3.eq(S0_SPPL_GRP3.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP3.value()).eq(S0_SPPL_GRP3.bp_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_SPPL_GRP3.bp_grp_nm.like(bind("sppl_grp_nm3")))),
				when(boundOr("sppl_grp_flg4"))
					.select(DS0D, S0_SPPL.bp_grp_cd4.as("sppl_grp_cd4"))
					.groupBy(DS0D, S0_SPPL.bp_grp_cd4),
				when(boundOr("sppl_grp_flg4", "sppl_grp_cd4"))
					.predicate(DS0D, p -> p.cutoff$and(S0_SPPL.bp_grp_cd4.like(bind("sppl_grp_cd4")))),
				when(boundOr("sppl_grp_flg4"))
					.select(DS0D, S0_SPPL_GRP4.bp_grp_nm.as("sppl_grp_nm4"))
					.groupBy(DS0D, S0_SPPL_GRP4.bp_grp_nm),
				when(boundOr("sppl_grp_flg4", "sppl_grp_nm4"))
					.view(DS0D, v -> v.leftOuterJoin(S0_SPPL_GRP4).on(S0_SPPL.bp_grp_cd4.eq(S0_SPPL_GRP4.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP4.value()).eq(S0_SPPL_GRP4.bp_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_SPPL_GRP4.bp_grp_nm.like(bind("sppl_grp_nm4")))),
				when(boundOr("sppl_grp_flg5"))
					.select(DS0D, S0_SPPL.bp_grp_cd5.as("sppl_grp_cd5"))
					.groupBy(DS0D, S0_SPPL.bp_grp_cd5),
				when(boundOr("sppl_grp_flg5", "sppl_grp_cd5"))
					.predicate(DS0D, p -> p.cutoff$and(S0_SPPL.bp_grp_cd5.like(bind("sppl_grp_cd5")))),
				when(boundOr("sppl_grp_flg5"))
					.select(DS0D, S0_SPPL_GRP5.bp_grp_nm.as("sppl_grp_nm5"))
					.groupBy(DS0D, S0_SPPL_GRP5.bp_grp_nm),
				when(boundOr("sppl_grp_flg5", "sppl_grp_nm5"))
					.view(DS0D, v -> v.leftOuterJoin(S0_SPPL_GRP5).on(S0_SPPL.bp_grp_cd5.eq(S0_SPPL_GRP5.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP5.value()).eq(S0_SPPL_GRP5.bp_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_SPPL_GRP5.bp_grp_nm.like(bind("sppl_grp_nm5")))),
				when(boundOr("sppl_grp_flg6"))
					.select(DS0D, S0_SPPL.bp_grp_cd6.as("sppl_grp_cd6"))
					.groupBy(DS0D, S0_SPPL.bp_grp_cd6),
				when(boundOr("sppl_grp_flg6", "sppl_grp_cd6"))
					.predicate(DS0D, p -> p.cutoff$and(S0_SPPL.bp_grp_cd6.like(bind("sppl_grp_cd6")))),
				when(boundOr("sppl_grp_flg6"))
					.select(DS0D, S0_SPPL_GRP6.bp_grp_nm.as("sppl_grp_nm6"))
					.groupBy(DS0D, S0_SPPL_GRP6.bp_grp_nm),
				when(boundOr("sppl_grp_flg6", "sppl_grp_nm6"))
					.view(DS0D, v -> v.leftOuterJoin(S0_SPPL_GRP6).on(S0_SPPL.bp_grp_cd6.eq(S0_SPPL_GRP6.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP6.value()).eq(S0_SPPL_GRP6.bp_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_SPPL_GRP6.bp_grp_nm.like(bind("sppl_grp_nm6")))),
				when(boundOr("sppl_grp_flg7"))
					.select(DS0D, S0_SPPL.bp_grp_cd7.as("sppl_grp_cd7"))
					.groupBy(DS0D, S0_SPPL.bp_grp_cd7),
				when(boundOr("sppl_grp_flg7", "sppl_grp_cd7"))
					.predicate(DS0D, p -> p.cutoff$and(S0_SPPL.bp_grp_cd7.like(bind("sppl_grp_cd7")))),
				when(boundOr("sppl_grp_flg7"))
					.select(DS0D, S0_SPPL_GRP7.bp_grp_nm.as("sppl_grp_nm7"))
					.groupBy(DS0D, S0_SPPL_GRP7.bp_grp_nm),
				when(boundOr("sppl_grp_flg7", "sppl_grp_nm7"))
					.view(DS0D, v -> v.leftOuterJoin(S0_SPPL_GRP7).on(S0_SPPL.bp_grp_cd7.eq(S0_SPPL_GRP7.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP7.value()).eq(S0_SPPL_GRP7.bp_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_SPPL_GRP7.bp_grp_nm.like(bind("sppl_grp_nm7")))),
				when(boundOr("sppl_grp_flg8"))
					.select(DS0D, S0_SPPL.bp_grp_cd8.as("sppl_grp_cd8"))
					.groupBy(DS0D, S0_SPPL.bp_grp_cd8),
				when(boundOr("sppl_grp_flg8", "sppl_grp_cd8"))
					.predicate(DS0D, p -> p.cutoff$and(S0_SPPL.bp_grp_cd8.like(bind("sppl_grp_cd8")))),
				when(boundOr("sppl_grp_flg8"))
					.select(DS0D, S0_SPPL_GRP8.bp_grp_nm.as("sppl_grp_nm8"))
					.groupBy(DS0D, S0_SPPL_GRP8.bp_grp_nm),
				when(boundOr("sppl_grp_flg8", "sppl_grp_nm8"))
					.view(DS0D, v -> v.leftOuterJoin(S0_SPPL_GRP8).on(S0_SPPL.bp_grp_cd8.eq(S0_SPPL_GRP8.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP8.value()).eq(S0_SPPL_GRP8.bp_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_SPPL_GRP8.bp_grp_nm.like(bind("sppl_grp_nm8")))),
				when(boundOr("sppl_grp_flg9"))
					.select(DS0D, S0_SPPL.bp_grp_cd9.as("sppl_grp_cd9"))
					.groupBy(DS0D, S0_SPPL.bp_grp_cd9),
				when(boundOr("sppl_grp_flg9", "sppl_grp_cd9"))
					.predicate(DS0D, p -> p.cutoff$and(S0_SPPL.bp_grp_cd9.like(bind("sppl_grp_cd9")))),
				when(boundOr("sppl_grp_flg9"))
					.select(DS0D, S0_SPPL_GRP9.bp_grp_nm.as("sppl_grp_nm9"))
					.groupBy(DS0D, S0_SPPL_GRP9.bp_grp_nm),
				when(boundOr("sppl_grp_flg9", "sppl_grp_nm9"))
					.view(DS0D, v -> v.leftOuterJoin(S0_SPPL_GRP9).on(S0_SPPL.bp_grp_cd9.eq(S0_SPPL_GRP9.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP9.value()).eq(S0_SPPL_GRP9.bp_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_SPPL_GRP9.bp_grp_nm.like(bind("sppl_grp_nm9")))),
				when(boundOr("sppl_grp_flg10"))
					.select(DS0D, S0_SPPL.bp_grp_cd10.as("sppl_grp_cd10"))
					.groupBy(DS0D, S0_SPPL.bp_grp_cd10),
				when(boundOr("sppl_grp_flg10", "sppl_grp_cd10"))
					.predicate(DS0D, p -> p.cutoff$and(S0_SPPL.bp_grp_cd10.like(bind("sppl_grp_cd10")))),
				when(boundOr("sppl_grp_flg10"))
					.select(DS0D, S0_SPPL_GRP10.bp_grp_nm.as("sppl_grp_nm10"))
					.groupBy(DS0D, S0_SPPL_GRP10.bp_grp_nm),
				when(boundOr("sppl_grp_flg10", "sppl_grp_nm10"))
					.view(DS0D, v -> v.leftOuterJoin(S0_SPPL_GRP10).on(S0_SPPL.bp_grp_cd10.eq(S0_SPPL_GRP10.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP10.value()).eq(S0_SPPL_GRP10.bp_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_SPPL_GRP10.bp_grp_nm.like(bind("sppl_grp_nm10")))),
				when(boundOr("acst_grp_flg1", "acst_grp_flg2", "acst_grp_flg3", "acst_grp_flg4", "acst_grp_flg5", "acst_grp_flg6", "acst_grp_flg7", "acst_grp_flg8", "acst_grp_flg9", "acst_grp_flg10"))
					.view(DS0D, v -> v.leftOuterJoin(S0_ACST).on(S0_ACST.bp_cd.eq(nvl(S0_V1.pr("acst_cd"),S0_CST.acst_cd)))),
				when(boundOr("acst_grp_flg1"))
					.select(DS0D, S0_ACST.bp_grp_cd1.as("acst_grp_cd1"))
					.groupBy(DS0D, S0_ACST.bp_grp_cd1),
				when(boundOr("acst_grp_flg1", "acst_grp_cd1"))
					.predicate(DS0D, p -> p.cutoff$and(S0_ACST.bp_grp_cd1.like(bind("acst_grp_cd1")))),
				when(boundOr("acst_grp_flg1"))
					.select(DS0D, S0_ACST_GRP1.bp_grp_nm.as("acst_grp_nm1"))
					.groupBy(DS0D, S0_ACST_GRP1.bp_grp_nm),
				when(boundOr("acst_grp_flg1", "acst_grp_nm1"))
					.view(DS0D, v -> v.leftOuterJoin(S0_ACST_GRP1).on(S0_ACST.bp_grp_cd1.eq(S0_ACST_GRP1.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP1.value()).eq(S0_ACST_GRP1.bp_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_ACST_GRP1.bp_grp_nm.like(bind("acst_grp_nm1")))),
				when(boundOr("acst_grp_flg2"))
					.select(DS0D, S0_ACST.bp_grp_cd2.as("acst_grp_cd2"))
					.groupBy(DS0D, S0_ACST.bp_grp_cd2),
				when(boundOr("acst_grp_flg2", "acst_grp_cd2"))
					.predicate(DS0D, p -> p.cutoff$and(S0_ACST.bp_grp_cd2.like(bind("acst_grp_cd2")))),
				when(boundOr("acst_grp_flg2"))
					.select(DS0D, S0_ACST_GRP2.bp_grp_nm.as("acst_grp_nm2"))
					.groupBy(DS0D, S0_ACST_GRP2.bp_grp_nm),
				when(boundOr("acst_grp_flg2", "acst_grp_nm2"))
					.view(DS0D, v -> v.leftOuterJoin(S0_ACST_GRP2).on(S0_ACST.bp_grp_cd2.eq(S0_ACST_GRP2.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP2.value()).eq(S0_ACST_GRP2.bp_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_ACST_GRP2.bp_grp_nm.like(bind("acst_grp_nm2")))),
				when(boundOr("acst_grp_flg3"))
					.select(DS0D, S0_ACST.bp_grp_cd3.as("acst_grp_cd3"))
					.groupBy(DS0D, S0_ACST.bp_grp_cd3),
				when(boundOr("acst_grp_flg3", "acst_grp_cd3"))
					.predicate(DS0D, p -> p.cutoff$and(S0_ACST.bp_grp_cd3.like(bind("acst_grp_cd3")))),
				when(boundOr("acst_grp_flg3"))
					.select(DS0D, S0_ACST_GRP3.bp_grp_nm.as("acst_grp_nm3"))
					.groupBy(DS0D, S0_ACST_GRP3.bp_grp_nm),
				when(boundOr("acst_grp_flg3", "acst_grp_nm3"))
					.view(DS0D, v -> v.leftOuterJoin(S0_ACST_GRP3).on(S0_ACST.bp_grp_cd3.eq(S0_ACST_GRP3.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP3.value()).eq(S0_ACST_GRP3.bp_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_ACST_GRP3.bp_grp_nm.like(bind("acst_grp_nm3")))),
				when(boundOr("acst_grp_flg4"))
					.select(DS0D, S0_ACST.bp_grp_cd4.as("acst_grp_cd4"))
					.groupBy(DS0D, S0_ACST.bp_grp_cd4),
				when(boundOr("acst_grp_flg4", "acst_grp_cd4"))
					.predicate(DS0D, p -> p.cutoff$and(S0_ACST.bp_grp_cd4.like(bind("acst_grp_cd4")))),
				when(boundOr("acst_grp_flg4"))
					.select(DS0D, S0_ACST_GRP4.bp_grp_nm.as("acst_grp_nm4"))
					.groupBy(DS0D, S0_ACST_GRP4.bp_grp_nm),
				when(boundOr("acst_grp_flg4", "acst_grp_nm4"))
					.view(DS0D, v -> v.leftOuterJoin(S0_ACST_GRP4).on(S0_ACST.bp_grp_cd4.eq(S0_ACST_GRP4.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP4.value()).eq(S0_ACST_GRP4.bp_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_ACST_GRP4.bp_grp_nm.like(bind("acst_grp_nm4")))),
				when(boundOr("acst_grp_flg5"))
					.select(DS0D, S0_ACST.bp_grp_cd5.as("acst_grp_cd5"))
					.groupBy(DS0D, S0_ACST.bp_grp_cd5),
				when(boundOr("acst_grp_flg5", "acst_grp_cd5"))
					.predicate(DS0D, p -> p.cutoff$and(S0_ACST.bp_grp_cd5.like(bind("acst_grp_cd5")))),
				when(boundOr("acst_grp_flg5"))
					.select(DS0D, S0_ACST_GRP5.bp_grp_nm.as("acst_grp_nm5"))
					.groupBy(DS0D, S0_ACST_GRP5.bp_grp_nm),
				when(boundOr("acst_grp_flg5", "acst_grp_nm5"))
					.view(DS0D, v -> v.leftOuterJoin(S0_ACST_GRP5).on(S0_ACST.bp_grp_cd5.eq(S0_ACST_GRP5.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP5.value()).eq(S0_ACST_GRP5.bp_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_ACST_GRP5.bp_grp_nm.like(bind("acst_grp_nm5")))),
				when(boundOr("acst_grp_flg6"))
					.select(DS0D, S0_ACST.bp_grp_cd6.as("acst_grp_cd6"))
					.groupBy(DS0D, S0_ACST.bp_grp_cd6),
				when(boundOr("acst_grp_flg6", "acst_grp_cd6"))
					.predicate(DS0D, p -> p.cutoff$and(S0_ACST.bp_grp_cd6.like(bind("acst_grp_cd6")))),
				when(boundOr("acst_grp_flg6"))
					.select(DS0D, S0_ACST_GRP6.bp_grp_nm.as("acst_grp_nm6"))
					.groupBy(DS0D, S0_ACST_GRP6.bp_grp_nm),
				when(boundOr("acst_grp_flg6", "acst_grp_nm6"))
					.view(DS0D, v -> v.leftOuterJoin(S0_ACST_GRP6).on(S0_ACST.bp_grp_cd6.eq(S0_ACST_GRP6.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP6.value()).eq(S0_ACST_GRP6.bp_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_ACST_GRP6.bp_grp_nm.like(bind("acst_grp_nm6")))),
				when(boundOr("acst_grp_flg7"))
					.select(DS0D, S0_ACST.bp_grp_cd7.as("acst_grp_cd7"))
					.groupBy(DS0D, S0_ACST.bp_grp_cd7),
				when(boundOr("acst_grp_flg7", "acst_grp_cd7"))
					.predicate(DS0D, p -> p.cutoff$and(S0_ACST.bp_grp_cd7.like(bind("acst_grp_cd7")))),
				when(boundOr("acst_grp_flg7"))
					.select(DS0D, S0_ACST_GRP7.bp_grp_nm.as("acst_grp_nm7"))
					.groupBy(DS0D, S0_ACST_GRP7.bp_grp_nm),
				when(boundOr("acst_grp_flg7", "acst_grp_nm7"))
					.view(DS0D, v -> v.leftOuterJoin(S0_ACST_GRP7).on(S0_ACST.bp_grp_cd7.eq(S0_ACST_GRP7.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP7.value()).eq(S0_ACST_GRP7.bp_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_ACST_GRP7.bp_grp_nm.like(bind("acst_grp_nm7")))),
				when(boundOr("acst_grp_flg8"))
					.select(DS0D, S0_ACST.bp_grp_cd8.as("acst_grp_cd8"))
					.groupBy(DS0D, S0_ACST.bp_grp_cd8),
				when(boundOr("acst_grp_flg8", "acst_grp_cd8"))
					.predicate(DS0D, p -> p.cutoff$and(S0_ACST.bp_grp_cd8.like(bind("acst_grp_cd8")))),
				when(boundOr("acst_grp_flg8"))
					.select(DS0D, S0_ACST_GRP8.bp_grp_nm.as("acst_grp_nm8"))
					.groupBy(DS0D, S0_ACST_GRP8.bp_grp_nm),
				when(boundOr("acst_grp_flg8", "acst_grp_nm8"))
					.view(DS0D, v -> v.leftOuterJoin(S0_ACST_GRP8).on(S0_ACST.bp_grp_cd8.eq(S0_ACST_GRP8.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP8.value()).eq(S0_ACST_GRP8.bp_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_ACST_GRP8.bp_grp_nm.like(bind("acst_grp_nm8")))),
				when(boundOr("acst_grp_flg9"))
					.select(DS0D, S0_ACST.bp_grp_cd9.as("acst_grp_cd9"))
					.groupBy(DS0D, S0_ACST.bp_grp_cd9),
				when(boundOr("acst_grp_flg9", "acst_grp_cd9"))
					.predicate(DS0D, p -> p.cutoff$and(S0_ACST.bp_grp_cd9.like(bind("acst_grp_cd9")))),
				when(boundOr("acst_grp_flg9"))
					.select(DS0D, S0_ACST_GRP9.bp_grp_nm.as("acst_grp_nm9"))
					.groupBy(DS0D, S0_ACST_GRP9.bp_grp_nm),
				when(boundOr("acst_grp_flg9", "acst_grp_nm9"))
					.view(DS0D, v -> v.leftOuterJoin(S0_ACST_GRP9).on(S0_ACST.bp_grp_cd9.eq(S0_ACST_GRP9.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP9.value()).eq(S0_ACST_GRP9.bp_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_ACST_GRP9.bp_grp_nm.like(bind("acst_grp_nm9")))),
				when(boundOr("acst_grp_flg10"))
					.select(DS0D, S0_ACST.bp_grp_cd10.as("acst_grp_cd10"))
					.groupBy(DS0D, S0_ACST.bp_grp_cd10),
				when(boundOr("acst_grp_flg10", "acst_grp_cd10"))
					.predicate(DS0D, p -> p.cutoff$and(S0_ACST.bp_grp_cd10.like(bind("acst_grp_cd10")))),
				when(boundOr("acst_grp_flg10"))
					.select(DS0D, S0_ACST_GRP10.bp_grp_nm.as("acst_grp_nm10"))
					.groupBy(DS0D, S0_ACST_GRP10.bp_grp_nm),
				when(boundOr("acst_grp_flg10", "acst_grp_nm10"))
					.view(DS0D, v -> v.leftOuterJoin(S0_ACST_GRP10).on(S0_ACST.bp_grp_cd10.eq(S0_ACST_GRP10.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP10.value()).eq(S0_ACST_GRP10.bp_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_ACST_GRP10.bp_grp_nm.like(bind("acst_grp_nm10")))),
				when(boundOr("dlv_nm", "dlv_grp_flg1", "dlv_grp_flg2", "dlv_grp_flg3", "dlv_grp_flg4", "dlv_grp_flg5", "dlv_grp_flg6", "dlv_grp_flg7", "dlv_grp_flg8", "dlv_grp_flg9", "dlv_grp_flg10"))
					.view(DS0D, v -> v.leftOuterJoin(S0_DLV).on(S0_DLV.bp_cd.eq(S0_V1.pr("dlv_cd"))))
					.predicate(DS0D, p -> p.cutoff$and(nvl(S0_V1.pr("dlv_nm"),S0_DLV.bp_nm).like(bind("dlv_nm")))),
				when(boundOr("dlv_grp_flg1"))
					.select(DS0D, S0_DLV.bp_grp_cd1.as("dlv_grp_cd1"))
					.groupBy(DS0D, S0_DLV.bp_grp_cd1),
				when(boundOr("dlv_grp_flg1", "dlv_grp_cd1"))
					.predicate(DS0D, p -> p.cutoff$and(S0_DLV.bp_grp_cd1.like(bind("dlv_grp_cd1")))),
				when(boundOr("dlv_grp_flg1"))
					.select(DS0D, S0_DLV_GRP1.bp_grp_nm.as("dlv_grp_nm1"))
					.groupBy(DS0D, S0_DLV_GRP1.bp_grp_nm),
				when(boundOr("dlv_grp_flg1", "dlv_grp_nm1"))
					.view(DS0D, v -> v.leftOuterJoin(S0_DLV_GRP1).on(S0_DLV.bp_grp_cd1.eq(S0_DLV_GRP1.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP1.value()).eq(S0_DLV_GRP1.bp_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_DLV_GRP1.bp_grp_nm.like(bind("dlv_grp_nm1")))),
				when(boundOr("dlv_grp_flg2"))
					.select(DS0D, S0_DLV.bp_grp_cd2.as("dlv_grp_cd2"))
					.groupBy(DS0D, S0_DLV.bp_grp_cd2),
				when(boundOr("dlv_grp_flg2", "dlv_grp_cd2"))
					.predicate(DS0D, p -> p.cutoff$and(S0_DLV.bp_grp_cd2.like(bind("dlv_grp_cd2")))),
				when(boundOr("dlv_grp_flg2"))
					.select(DS0D, S0_DLV_GRP2.bp_grp_nm.as("dlv_grp_nm2"))
					.groupBy(DS0D, S0_DLV_GRP2.bp_grp_nm),
				when(boundOr("dlv_grp_flg2", "dlv_grp_nm2"))
					.view(DS0D, v -> v.leftOuterJoin(S0_DLV_GRP2).on(S0_DLV.bp_grp_cd2.eq(S0_DLV_GRP2.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP2.value()).eq(S0_DLV_GRP2.bp_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_DLV_GRP2.bp_grp_nm.like(bind("dlv_grp_nm2")))),
				when(boundOr("dlv_grp_flg3"))
					.select(DS0D, S0_DLV.bp_grp_cd3.as("dlv_grp_cd3"))
					.groupBy(DS0D, S0_DLV.bp_grp_cd3),
				when(boundOr("dlv_grp_flg3", "dlv_grp_cd3"))
					.predicate(DS0D, p -> p.cutoff$and(S0_DLV.bp_grp_cd3.like(bind("dlv_grp_cd3")))),
				when(boundOr("dlv_grp_flg3"))
					.select(DS0D, S0_DLV_GRP3.bp_grp_nm.as("dlv_grp_nm3"))
					.groupBy(DS0D, S0_DLV_GRP3.bp_grp_nm),
				when(boundOr("dlv_grp_flg3", "dlv_grp_nm3"))
					.view(DS0D, v -> v.leftOuterJoin(S0_DLV_GRP3).on(S0_DLV.bp_grp_cd3.eq(S0_DLV_GRP3.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP3.value()).eq(S0_DLV_GRP3.bp_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_DLV_GRP3.bp_grp_nm.like(bind("dlv_grp_nm3")))),
				when(boundOr("dlv_grp_flg4"))
					.select(DS0D, S0_DLV.bp_grp_cd4.as("dlv_grp_cd4"))
					.groupBy(DS0D, S0_DLV.bp_grp_cd4),
				when(boundOr("dlv_grp_flg4", "dlv_grp_cd4"))
					.predicate(DS0D, p -> p.cutoff$and(S0_DLV.bp_grp_cd4.like(bind("dlv_grp_cd4")))),
				when(boundOr("dlv_grp_flg4"))
					.select(DS0D, S0_DLV_GRP4.bp_grp_nm.as("dlv_grp_nm4"))
					.groupBy(DS0D, S0_DLV_GRP4.bp_grp_nm),
				when(boundOr("dlv_grp_flg4", "dlv_grp_nm4"))
					.view(DS0D, v -> v.leftOuterJoin(S0_DLV_GRP4).on(S0_DLV.bp_grp_cd4.eq(S0_DLV_GRP4.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP4.value()).eq(S0_DLV_GRP4.bp_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_DLV_GRP4.bp_grp_nm.like(bind("dlv_grp_nm4")))),
				when(boundOr("dlv_grp_flg5"))
					.select(DS0D, S0_DLV.bp_grp_cd5.as("dlv_grp_cd5"))
					.groupBy(DS0D, S0_DLV.bp_grp_cd5),
				when(boundOr("dlv_grp_flg5", "dlv_grp_cd5"))
					.predicate(DS0D, p -> p.cutoff$and(S0_DLV.bp_grp_cd5.like(bind("dlv_grp_cd5")))),
				when(boundOr("dlv_grp_flg5"))
					.select(DS0D, S0_DLV_GRP5.bp_grp_nm.as("dlv_grp_nm5"))
					.groupBy(DS0D, S0_DLV_GRP5.bp_grp_nm),
				when(boundOr("dlv_grp_flg5", "dlv_grp_nm5"))
					.view(DS0D, v -> v.leftOuterJoin(S0_DLV_GRP5).on(S0_DLV.bp_grp_cd5.eq(S0_DLV_GRP5.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP5.value()).eq(S0_DLV_GRP5.bp_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_DLV_GRP5.bp_grp_nm.like(bind("dlv_grp_nm5")))),
				when(boundOr("dlv_grp_flg6"))
					.select(DS0D, S0_DLV.bp_grp_cd6.as("dlv_grp_cd6"))
					.groupBy(DS0D, S0_DLV.bp_grp_cd6),
				when(boundOr("dlv_grp_flg6", "dlv_grp_cd6"))
					.predicate(DS0D, p -> p.cutoff$and(S0_DLV.bp_grp_cd6.like(bind("dlv_grp_cd6")))),
				when(boundOr("dlv_grp_flg6"))
					.select(DS0D, S0_DLV_GRP6.bp_grp_nm.as("dlv_grp_nm6"))
					.groupBy(DS0D, S0_DLV_GRP6.bp_grp_nm),
				when(boundOr("dlv_grp_flg6", "dlv_grp_nm6"))
					.view(DS0D, v -> v.leftOuterJoin(S0_DLV_GRP6).on(S0_DLV.bp_grp_cd6.eq(S0_DLV_GRP6.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP6.value()).eq(S0_DLV_GRP6.bp_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_DLV_GRP6.bp_grp_nm.like(bind("dlv_grp_nm6")))),
				when(boundOr("dlv_grp_flg7"))
					.select(DS0D, S0_DLV.bp_grp_cd7.as("dlv_grp_cd7"))
					.groupBy(DS0D, S0_DLV.bp_grp_cd7),
				when(boundOr("dlv_grp_flg7", "dlv_grp_cd7"))
					.predicate(DS0D, p -> p.cutoff$and(S0_DLV.bp_grp_cd7.like(bind("dlv_grp_cd7")))),
				when(boundOr("dlv_grp_flg7"))
					.select(DS0D, S0_DLV_GRP7.bp_grp_nm.as("dlv_grp_nm7"))
					.groupBy(DS0D, S0_DLV_GRP7.bp_grp_nm),
				when(boundOr("dlv_grp_flg7", "dlv_grp_nm7"))
					.view(DS0D, v -> v.leftOuterJoin(S0_DLV_GRP7).on(S0_DLV.bp_grp_cd7.eq(S0_DLV_GRP7.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP7.value()).eq(S0_DLV_GRP7.bp_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_DLV_GRP7.bp_grp_nm.like(bind("dlv_grp_nm7")))),
				when(boundOr("dlv_grp_flg8"))
					.select(DS0D, S0_DLV.bp_grp_cd8.as("dlv_grp_cd8"))
					.groupBy(DS0D, S0_DLV.bp_grp_cd8),
				when(boundOr("dlv_grp_flg8", "dlv_grp_cd8"))
					.predicate(DS0D, p -> p.cutoff$and(S0_DLV.bp_grp_cd8.like(bind("dlv_grp_cd8")))),
				when(boundOr("dlv_grp_flg8"))
					.select(DS0D, S0_DLV_GRP8.bp_grp_nm.as("dlv_grp_nm8"))
					.groupBy(DS0D, S0_DLV_GRP8.bp_grp_nm),
				when(boundOr("dlv_grp_flg8", "dlv_grp_nm8"))
					.view(DS0D, v -> v.leftOuterJoin(S0_DLV_GRP8).on(S0_DLV.bp_grp_cd8.eq(S0_DLV_GRP8.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP8.value()).eq(S0_DLV_GRP8.bp_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_DLV_GRP8.bp_grp_nm.like(bind("dlv_grp_nm8")))),
				when(boundOr("dlv_grp_flg9"))
					.select(DS0D, S0_DLV.bp_grp_cd9.as("dlv_grp_cd9"))
					.groupBy(DS0D, S0_DLV.bp_grp_cd9),
				when(boundOr("dlv_grp_flg9", "dlv_grp_cd9"))
					.predicate(DS0D, p -> p.cutoff$and(S0_DLV.bp_grp_cd9.like(bind("dlv_grp_cd9")))),
				when(boundOr("dlv_grp_flg9"))
					.select(DS0D, S0_DLV_GRP9.bp_grp_nm.as("dlv_grp_nm9"))
					.groupBy(DS0D, S0_DLV_GRP9.bp_grp_nm),
				when(boundOr("dlv_grp_flg9", "dlv_grp_nm9"))
					.view(DS0D, v -> v.leftOuterJoin(S0_DLV_GRP9).on(S0_DLV.bp_grp_cd9.eq(S0_DLV_GRP9.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP9.value()).eq(S0_DLV_GRP9.bp_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_DLV_GRP9.bp_grp_nm.like(bind("dlv_grp_nm9")))),
				when(boundOr("dlv_grp_flg10"))
					.select(DS0D, S0_DLV.bp_grp_cd10.as("dlv_grp_cd10"))
					.groupBy(DS0D, S0_DLV.bp_grp_cd10),
				when(boundOr("dlv_grp_flg10", "dlv_grp_cd10"))
					.predicate(DS0D, p -> p.cutoff$and(S0_DLV.bp_grp_cd10.like(bind("dlv_grp_cd10")))),
				when(boundOr("dlv_grp_flg10"))
					.select(DS0D, S0_DLV_GRP10.bp_grp_nm.as("dlv_grp_nm10"))
					.groupBy(DS0D, S0_DLV_GRP10.bp_grp_nm),
				when(boundOr("dlv_grp_flg10", "dlv_grp_nm10"))
					.view(DS0D, v -> v.leftOuterJoin(S0_DLV_GRP10).on(S0_DLV.bp_grp_cd10.eq(S0_DLV_GRP10.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP10.value()).eq(S0_DLV_GRP10.bp_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_DLV_GRP10.bp_grp_nm.like(bind("dlv_grp_nm10")))),
				when(boundOr("itm_nm", "itm_typ", "itm_typ_d_cd", "itm_typ_d_nm", "itm_grp_flg1", "itm_grp_flg2", "itm_grp_flg3", "itm_grp_flg4", "itm_grp_flg5", "itm_grp_flg6", "itm_grp_flg7", "itm_grp_flg8", "itm_grp_flg9", "itm_grp_flg10"))
					.view(DS0D, v -> v.leftOuterJoin(S0_ITM).on(S0_ITM.itm_cd.eq(S0_V1.pr("itm_cd")).and(S0_ITM.itm_sub1.eq(S0_V1.pr("itm_sub1"))).and(S0_ITM.itm_sub2.eq(S0_V1.pr("itm_sub2"))).and(S0_ITM.itm_sub3.eq(S0_V1.pr("itm_sub3")))))
					.predicate(DS0D, p -> p.cutoff$and(nvl(S0_V1.pr("itm_nm"),S0_ITM.itm_nm).like(bind("itm_nm"))).cutoff$and(S0_ITM.itm_typ.like(bind("itm_typ"))).cutoff$and(S0_ITM.itm_typ_d_cd.like(bind("itm_typ_d_cd")))),
				when(boundOr("itm_grp_flg1"))
					.select(DS0D, S0_ITM.itm_grp_cd1.as("itm_grp_cd1"))
					.groupBy(DS0D, S0_ITM.itm_grp_cd1),
				when(boundOr("itm_grp_flg1", "itm_grp_cd1"))
					.predicate(DS0D, p -> p.cutoff$and(S0_ITM.itm_grp_cd1.like(bind("itm_grp_cd1")))),
				when(boundOr("itm_grp_flg1"))
					.select(DS0D, S0_ITM_GRP1.itm_grp_nm.as("itm_grp_nm1"))
					.groupBy(DS0D, S0_ITM_GRP1.itm_grp_nm),
				when(boundOr("itm_grp_flg1", "itm_grp_nm1"))
					.view(DS0D, v -> v.leftOuterJoin(S0_ITM_GRP1).on(S0_ITM.itm_grp_cd1.eq(S0_ITM_GRP1.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP1.value()).eq(S0_ITM_GRP1.itm_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_ITM_GRP1.itm_grp_nm.like(bind("itm_grp_nm1")))),
				when(boundOr("itm_grp_flg2"))
					.select(DS0D, S0_ITM.itm_grp_cd2.as("itm_grp_cd2"))
					.groupBy(DS0D, S0_ITM.itm_grp_cd2),
				when(boundOr("itm_grp_flg2", "itm_grp_cd2"))
					.predicate(DS0D, p -> p.cutoff$and(S0_ITM.itm_grp_cd2.like(bind("itm_grp_cd2")))),
				when(boundOr("itm_grp_flg2"))
					.select(DS0D, S0_ITM_GRP2.itm_grp_nm.as("itm_grp_nm2"))
					.groupBy(DS0D, S0_ITM_GRP2.itm_grp_nm),
				when(boundOr("itm_grp_flg2", "itm_grp_nm2"))
					.view(DS0D, v -> v.leftOuterJoin(S0_ITM_GRP2).on(S0_ITM.itm_grp_cd2.eq(S0_ITM_GRP2.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP2.value()).eq(S0_ITM_GRP2.itm_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_ITM_GRP2.itm_grp_nm.like(bind("itm_grp_nm2")))),
				when(boundOr("itm_grp_flg3"))
					.select(DS0D, S0_ITM.itm_grp_cd3.as("itm_grp_cd3"))
					.groupBy(DS0D, S0_ITM.itm_grp_cd3),
				when(boundOr("itm_grp_flg3", "itm_grp_cd3"))
					.predicate(DS0D, p -> p.cutoff$and(S0_ITM.itm_grp_cd3.like(bind("itm_grp_cd3")))),
				when(boundOr("itm_grp_flg3"))
					.select(DS0D, S0_ITM_GRP3.itm_grp_nm.as("itm_grp_nm3"))
					.groupBy(DS0D, S0_ITM_GRP3.itm_grp_nm),
				when(boundOr("itm_grp_flg3", "itm_grp_nm3"))
					.view(DS0D, v -> v.leftOuterJoin(S0_ITM_GRP3).on(S0_ITM.itm_grp_cd3.eq(S0_ITM_GRP3.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP3.value()).eq(S0_ITM_GRP3.itm_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_ITM_GRP3.itm_grp_nm.like(bind("itm_grp_nm3")))),
				when(boundOr("itm_grp_flg4"))
					.select(DS0D, S0_ITM.itm_grp_cd4.as("itm_grp_cd4"))
					.groupBy(DS0D, S0_ITM.itm_grp_cd4),
				when(boundOr("itm_grp_flg4", "itm_grp_cd4"))
					.predicate(DS0D, p -> p.cutoff$and(S0_ITM.itm_grp_cd4.like(bind("itm_grp_cd4")))),
				when(boundOr("itm_grp_flg4"))
					.select(DS0D, S0_ITM_GRP4.itm_grp_nm.as("itm_grp_nm4"))
					.groupBy(DS0D, S0_ITM_GRP4.itm_grp_nm),
				when(boundOr("itm_grp_flg4", "itm_grp_nm4"))
					.view(DS0D, v -> v.leftOuterJoin(S0_ITM_GRP4).on(S0_ITM.itm_grp_cd4.eq(S0_ITM_GRP4.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP4.value()).eq(S0_ITM_GRP4.itm_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_ITM_GRP4.itm_grp_nm.like(bind("itm_grp_nm4")))),
				when(boundOr("itm_grp_flg5"))
					.select(DS0D, S0_ITM.itm_grp_cd5.as("itm_grp_cd5"))
					.groupBy(DS0D, S0_ITM.itm_grp_cd5),
				when(boundOr("itm_grp_flg5", "itm_grp_cd5"))
					.predicate(DS0D, p -> p.cutoff$and(S0_ITM.itm_grp_cd5.like(bind("itm_grp_cd5")))),
				when(boundOr("itm_grp_flg5"))
					.select(DS0D, S0_ITM_GRP5.itm_grp_nm.as("itm_grp_nm5"))
					.groupBy(DS0D, S0_ITM_GRP5.itm_grp_nm),
				when(boundOr("itm_grp_flg5", "itm_grp_nm5"))
					.view(DS0D, v -> v.leftOuterJoin(S0_ITM_GRP5).on(S0_ITM.itm_grp_cd5.eq(S0_ITM_GRP5.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP5.value()).eq(S0_ITM_GRP5.itm_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_ITM_GRP5.itm_grp_nm.like(bind("itm_grp_nm5")))),
				when(boundOr("itm_grp_flg6"))
					.select(DS0D, S0_ITM.itm_grp_cd6.as("itm_grp_cd6"))
					.groupBy(DS0D, S0_ITM.itm_grp_cd6),
				when(boundOr("itm_grp_flg6", "itm_grp_cd6"))
					.predicate(DS0D, p -> p.cutoff$and(S0_ITM.itm_grp_cd6.like(bind("itm_grp_cd6")))),
				when(boundOr("itm_grp_flg6"))
					.select(DS0D, S0_ITM_GRP6.itm_grp_nm.as("itm_grp_nm6"))
					.groupBy(DS0D, S0_ITM_GRP6.itm_grp_nm),
				when(boundOr("itm_grp_flg6", "itm_grp_nm6"))
					.view(DS0D, v -> v.leftOuterJoin(S0_ITM_GRP6).on(S0_ITM.itm_grp_cd6.eq(S0_ITM_GRP6.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP6.value()).eq(S0_ITM_GRP6.itm_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_ITM_GRP6.itm_grp_nm.like(bind("itm_grp_nm6")))),
				when(boundOr("itm_grp_flg7"))
					.select(DS0D, S0_ITM.itm_grp_cd7.as("itm_grp_cd7"))
					.groupBy(DS0D, S0_ITM.itm_grp_cd7),
				when(boundOr("itm_grp_flg7", "itm_grp_cd7"))
					.predicate(DS0D, p -> p.cutoff$and(S0_ITM.itm_grp_cd7.like(bind("itm_grp_cd7")))),
				when(boundOr("itm_grp_flg7"))
					.select(DS0D, S0_ITM_GRP7.itm_grp_nm.as("itm_grp_nm7"))
					.groupBy(DS0D, S0_ITM_GRP7.itm_grp_nm),
				when(boundOr("itm_grp_flg7", "itm_grp_nm7"))
					.view(DS0D, v -> v.leftOuterJoin(S0_ITM_GRP7).on(S0_ITM.itm_grp_cd7.eq(S0_ITM_GRP7.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP7.value()).eq(S0_ITM_GRP7.itm_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_ITM_GRP7.itm_grp_nm.like(bind("itm_grp_nm7")))),
				when(boundOr("itm_grp_flg8"))
					.select(DS0D, S0_ITM.itm_grp_cd8.as("itm_grp_cd8"))
					.groupBy(DS0D, S0_ITM.itm_grp_cd8),
				when(boundOr("itm_grp_flg8", "itm_grp_cd8"))
					.predicate(DS0D, p -> p.cutoff$and(S0_ITM.itm_grp_cd8.like(bind("itm_grp_cd8")))),
				when(boundOr("itm_grp_flg8"))
					.select(DS0D, S0_ITM_GRP8.itm_grp_nm.as("itm_grp_nm8"))
					.groupBy(DS0D, S0_ITM_GRP8.itm_grp_nm),
				when(boundOr("itm_grp_flg8", "itm_grp_nm8"))
					.view(DS0D, v -> v.leftOuterJoin(S0_ITM_GRP8).on(S0_ITM.itm_grp_cd8.eq(S0_ITM_GRP8.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP8.value()).eq(S0_ITM_GRP8.itm_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_ITM_GRP8.itm_grp_nm.like(bind("itm_grp_nm8")))),
				when(boundOr("itm_grp_flg9"))
					.select(DS0D, S0_ITM.itm_grp_cd9.as("itm_grp_cd9"))
					.groupBy(DS0D, S0_ITM.itm_grp_cd9),
				when(boundOr("itm_grp_flg9", "itm_grp_cd9"))
					.predicate(DS0D, p -> p.cutoff$and(S0_ITM.itm_grp_cd9.like(bind("itm_grp_cd9")))),
				when(boundOr("itm_grp_flg9"))
					.select(DS0D, S0_ITM_GRP9.itm_grp_nm.as("itm_grp_nm9"))
					.groupBy(DS0D, S0_ITM_GRP9.itm_grp_nm),
				when(boundOr("itm_grp_flg9", "itm_grp_nm9"))
					.view(DS0D, v -> v.leftOuterJoin(S0_ITM_GRP9).on(S0_ITM.itm_grp_cd9.eq(S0_ITM_GRP9.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP9.value()).eq(S0_ITM_GRP9.itm_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_ITM_GRP9.itm_grp_nm.like(bind("itm_grp_nm9")))),
				when(boundOr("itm_grp_flg10"))
					.select(DS0D, S0_ITM.itm_grp_cd10.as("itm_grp_cd10"))
					.groupBy(DS0D, S0_ITM.itm_grp_cd10),
				when(boundOr("itm_grp_flg10", "itm_grp_cd10"))
					.predicate(DS0D, p -> p.cutoff$and(S0_ITM.itm_grp_cd10.like(bind("itm_grp_cd10")))),
				when(boundOr("itm_grp_flg10"))
					.select(DS0D, S0_ITM_GRP10.itm_grp_nm.as("itm_grp_nm10"))
					.groupBy(DS0D, S0_ITM_GRP10.itm_grp_nm),
				when(boundOr("itm_grp_flg10", "itm_grp_nm10"))
					.view(DS0D, v -> v.leftOuterJoin(S0_ITM_GRP10).on(S0_ITM.itm_grp_cd10.eq(S0_ITM_GRP10.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP10.value()).eq(S0_ITM_GRP10.itm_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_ITM_GRP10.itm_grp_nm.like(bind("itm_grp_nm10")))),
				when(boundOr("trd_nm"))
					.view(DS0D, v -> v.leftOuterJoin(S0_TRD).on(S0_TRD.trd_cd.eq(S0_V1.pr("trd_cd"))))
					.predicate(DS0D, p -> p.cutoff$and(S0_TRD.trd_nm.like(bind("trd_nm")))),
				when(boundOr("sls_usr_nm"))
					.view(DS0D, v -> v.leftOuterJoin(S0_SLS_USR).on(S0_SLS_USR.usr_cd.eq(S0_V1.pr("sls_usr_cd"))))
					.predicate(DS0D, p -> p.cutoff$and(S0_SLS_USR.usr_nm.like(bind("sls_usr_nm")))),
				when(boundOr("sls_dpt_nm", "wg_cd", "wg_nm"))
					.view(DS0D, v -> v.leftOuterJoin(S0_SLS_DPT).on(S0_SLS_DPT.dpt_cd.eq(S0_V1.pr("sls_dpt_cd")).and(S0_V1.pr("master_dt").between(S0_SLS_DPT.st_dt, S0_SLS_DPT.end_dt))))
					.predicate(DS0D, p -> p.cutoff$and(S0_SLS_DPT.dpt_nm.like(bind("sls_dpt_nm"))).cutoff$and(nvl(S0_V1.pr("wg_cd"),S0_SLS_DPT.wg_cd).like(bind("wg_cd")))),
				when(boundOr("wg_nm"))
					.view(DS0D, v -> v.leftOuterJoin(S0_SLS_DPT_WG).on(S0_SLS_DPT_WG.wg_cd.eq(nvl(S0_V1.pr("wg_cd"),S0_SLS_DPT.wg_cd))))
					.predicate(DS0D, p -> p.cutoff$and(S0_SLS_DPT_WG.wg_nm.like(bind("wg_nm")))),
				when(boundOr("ship_lg_grp_nm"))
					.view(DS0D, v -> v.leftOuterJoin(S0_SHIP_LG_GRP).on(S0_SHIP_LG_GRP.lg_grp_cd.eq(S0_V1.pr("ship_lg_grp_cd"))))
					.predicate(DS0D, p -> p.cutoff$and(S0_SHIP_LG_GRP.lg_grp_nm.like(bind("ship_lg_grp_nm")))),
				when(boundOr("dest_nm1"))
					.view(DS0D, v -> v.leftOuterJoin(S0_DEST1).on(S0_DEST1.bp_cd.eq(S0_V1.pr(S2_SLOD.dest_cd1))))
					.predicate(DS0D, p -> p.cutoff$and(S0_DEST1.bp_nm.like(bind("dest_nm1")))),
				when(boundOr("dest_nm2"))
					.view(DS0D, v -> v.leftOuterJoin(S0_DEST2).on(S0_DEST2.bp_cd.eq(S0_V1.pr(S2_SLOD.dest_cd2))))
					.predicate(DS0D, p -> p.cutoff$and(S0_DEST2.bp_nm.like(bind("dest_nm2")))),
				when(boundOr("dest_nm3"))
					.view(DS0D, v -> v.leftOuterJoin(S0_DEST3).on(S0_DEST3.bp_cd.eq(S0_V1.pr(S2_SLOD.dest_cd3))))
					.predicate(DS0D, p -> p.cutoff$and(S0_DEST3.bp_nm.like(bind("dest_nm3")))),
				when(boundOr("wrk_no", "wrk_nm"))
					.view(DS0D, v -> v.leftOuterJoin(S0_WRK_SNO).on(S0_WRK_SNO.sno1.eq(S0_V1.pr("sno1"))))
					.predicate(DS0D, p -> p.cutoff$and(S0_WRK_SNO.wrk_no.like(bind("wrk_no"))).cutoff$and(S0_WRK_SNO.wrk_nm.like(bind("wrk_nm")))),
				when(boundOr("itm_typ_d_nm"))
					.view(DS0D, v -> v.leftOuterJoin(S0_ITM_TYP_D).on(S0_ITM_TYP_D.itm_typ.eq(S0_ITM.itm_typ).and(S0_ITM_TYP_D.itm_typ_d_cd.eq(S0_ITM.itm_typ_d_cd))))
					.predicate(DS0D, p -> p.cutoff$and(S0_ITM_TYP_D.itm_typ_d_nm.like(bind("itm_typ_d_nm"))))
			);
	}
	
	/**
	 * -- MSBBL1320_MST_SLS_SCHD_Query_S11
	 */
	static MCQueryPlan MSBBL1320_MST_SLS_SCHD_S11() {
		MST_SHIP_ACT_D_R S0_T3 = MST_SHIP_ACT_D_R.create("T3");
		MST_SLS_SCHD_R S0_T4 = MST_SLS_SCHD_R.create("T4");
		MSW_SLS_SCHD_KEY_R S0_W = MSW_SLS_SCHD_KEY_R.create("W");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBBL1320_MST_SLS_SCHD_Query_S11")
					.mainQuery()
					.select(
						S0_T4.sls_schd_no,
						sum(S0_T3.ship_ret_qty).as("ship_ret_qty")
					)
					.from(
						S0_W
						.innerJoin(S0_T4).on(
							bracket(
								S0_T4.sls_schd_no.eq(S0_W.sls_schd_no)
							)
						)
						.innerJoin(S0_T3).on(
							bracket(
								S0_T4.dlv_slip_d_no.eq(S0_T3.dlv_slip_d_no)
								.and(S0_T3.can_flg.eq(value(false)))
							)
						)
					)
					.groupBy(S0_T4.sls_schd_no)
			);
	}
	/**
	 * -- MSBBL1320_MST_SLS_SCHD_Query_S12
	 */
	static MCQueryPlan MSBBL1320_MST_SLS_SCHD_S12() {
		MST_SLS_SCHD_R S0_SLSSCHD = MST_SLS_SCHD_R.create("SLSSCHD");
		MST_IV_R S0_IV = MST_IV_R.create("IV");
		MST_IV_D_R S0_IVD = MST_IV_D_R.create("IVD");
		MST_IV_MAP_R S0_IVMAP = MST_IV_MAP_R.create("IVMAP");
		MST_SHIP_ALLOC_STS_R S0_SHIPALLOCSTS = MST_SHIP_ALLOC_STS_R.create("SHIPALLOCSTS");
		
		return createQueryPlan()
			.setQuery(
				sql("MSBBL1320_MST_SLS_SCHD_Query_S12")
					.mainQuery()
					.select(
						S0_SHIPALLOCSTS.sno1,
						S0_SHIPALLOCSTS.sno2,
						S0_SHIPALLOCSTS.sno3,
						S0_SHIPALLOCSTS.sno4,
						S0_IVD.gd_cd,
						S0_SHIPALLOCSTS.ship_loc_cd.as("loc_cd"),
						S0_SHIPALLOCSTS.ship_str_ln_cd.as("str_ln_cd"),
						S0_SHIPALLOCSTS.lot_no,
						S0_SHIPALLOCSTS.sublot_no,
						S0_SHIPALLOCSTS.trd_unit_cd,
						S0_SHIPALLOCSTS.trd_unit_qty,
						S0_SHIPALLOCSTS.pack_unit_cd,
						S0_SHIPALLOCSTS.pack_unit_qty,
						S0_SHIPALLOCSTS.base_unit_cd,
						S0_SHIPALLOCSTS.base_unit_qty,
						S0_SHIPALLOCSTS.ship_alloc_sts_no,
						S0_SHIPALLOCSTS.ship_schd_no
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
						.leftOuterJoin(S0_IVMAP).on(
							bracket(
								S0_SLSSCHD.iv_d_no.eq(S0_IVMAP.iv_d_no)
							)
						)
						.leftOuterJoin(S0_SHIPALLOCSTS).on(
							bracket(
								S0_IVMAP.ship_schd_no.eq(S0_SHIPALLOCSTS.ship_schd_no)
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
	 * -- MSBBL1320_MSW_SHIP_SCHD_KEY_Query_S01
	 */
	static MCQueryPlan MSBBL1320_MSW_SHIP_SCHD_KEY_S01() {
		MCTempView S0_SAS = createTempView("SAS");
		MCTempView S1_WSAS = createTempView("WSAS");
		MSW_SHIP_SCHD_KEY_R S2_W0 = MSW_SHIP_SCHD_KEY_R.create("W0");
		MST_SHIP_ALLOC_STS_R S2_W = MST_SHIP_ALLOC_STS_R.create("W");
		MST_SLS_SCHD_R S2_W2 = MST_SLS_SCHD_R.create("W2");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBBL1320_MSW_SHIP_SCHD_KEY_Query_S01")
					.mainQuery()
					.select(
						S0_SAS.pr(S2_W.ship_schd_no),
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
							S1_WSAS.pr(S2_W.ship_schd_no),
							decode(
								S1_WSAS.pr("lot_not_cnt"),
								value(1),
								S1_WSAS.pr(S2_W.lot_no),
								nullValue()
							).as("lot_no"),
							decode(
								S1_WSAS.pr("lot_not_cnt"),
								value(1),
								S1_WSAS.pr(S2_W.sublot_no),
								nullValue()
							).as("sublot_no"),
							decode(
								S1_WSAS.pr("lot_not_cnt"),
								value(1),
								S1_WSAS.pr(S2_W.ship_alloc_sts_no),
								nullValue()
							).as("ship_alloc_sts_no"),
							decode(
								S1_WSAS.pr("lot_not_cnt"),
								value(1),
								S1_WSAS.pr(S2_W.ship_loc_cd),
								nullValue()
							).as("loc_cd"),
							decode(
								S1_WSAS.pr("lot_not_cnt"),
								value(1),
								S1_WSAS.pr(S2_W.ship_str_ln_cd),
								nullValue()
							).as("str_ln_cd")
						)
						.from(
							subQuery()
							.select(
								S2_W.ship_schd_no,
								S2_W.lot_no,
								S2_W.sublot_no,
								S2_W.ship_alloc_sts_no,
								S2_W.ship_loc_cd,
								S2_W.ship_str_ln_cd,
								count(value("X"))
									.over()
									.partitionBy(S2_W.ship_schd_no).as("lot_not_cnt")
							)
							.from(
								S2_W0
								.innerJoin(S2_W).on(
									bracket(
										S2_W.ship_schd_no.eq(S2_W0.ship_schd_no)
									)
								)
								.innerJoin(S2_W2).on(S2_W.ship_schd_no.eq(S2_W2.ship_schd_no))
							)
							.where(
								value(0).eq(value(0))
								.and(S2_W2.sls_ac_abl_flg.eq(value(true)))
								.and(S2_W2.cmpl_flg.eq(value(false)))
								.and(
									S2_W2.base_unit_qty.subtract(bracket(
											S2_W2.base_unit_sls_qty.add(S2_W2.base_unit_abort_qty)
										)).gt(value(0))
								)
							)
							.groupBy(
								S2_W.ship_schd_no,
								S2_W.lot_no,
								S2_W.sublot_no,
								S2_W.ship_alloc_sts_no,
								S2_W.ship_loc_cd,
								S2_W.ship_str_ln_cd
							).view(S1_WSAS)
						)
						.groupBy(
							S1_WSAS.pr(S2_W.ship_schd_no),
							decode(
								S1_WSAS.pr("lot_not_cnt"),
								value(1),
								S1_WSAS.pr(S2_W.lot_no),
								nullValue()
							),
							decode(
								S1_WSAS.pr("lot_not_cnt"),
								value(1),
								S1_WSAS.pr(S2_W.sublot_no),
								nullValue()
							),
							decode(
								S1_WSAS.pr("lot_not_cnt"),
								value(1),
								S1_WSAS.pr(S2_W.ship_alloc_sts_no),
								nullValue()
							),
							decode(
								S1_WSAS.pr("lot_not_cnt"),
								value(1),
								S1_WSAS.pr(S2_W.ship_loc_cd),
								nullValue()
							),
							decode(
								S1_WSAS.pr("lot_not_cnt"),
								value(1),
								S1_WSAS.pr(S2_W.ship_str_ln_cd),
								nullValue()
							)
						).view(S0_SAS)
					)
			);
	}
	
	/**
	 * -- MSBBL1320_MSW_SLS_ACT_D_KEY_Query_S01
	 */
	static MCQueryPlan MSBBL1320_MSW_SLS_ACT_D_KEY_S01() {
		MCTempView S0_WSLSIO = createTempView("WSLSIO");
		MSW_SLS_ACT_D_KEY_R S1_W = MSW_SLS_ACT_D_KEY_R.create("W");
		MST_SLS_ACT_IO_R S1_SLSIO = MST_SLS_ACT_IO_R.create("SLSIO");
		MST_ARR_ACT_R S1_ARR = MST_ARR_ACT_R.create("ARR");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBBL1320_MSW_SLS_ACT_D_KEY_Query_S01")
					.mainQuery()
					.select(
						S0_WSLSIO.pr(S1_W.sls_act_d_no),
						S0_WSLSIO.pr(S1_W.sls_act_d_seq),
						decode(
							S0_WSLSIO.pr("valid_cnt"),
							value(1),
							S0_WSLSIO.pr(S1_ARR.ship_fr_valid_dt),
							nullValue()
						).as("ship_fr_valid_dt")
					)
					.from(
						subQuery()
						.select(
							S1_W.sls_act_d_no,
							S1_W.sls_act_d_seq,
							S1_ARR.ship_fr_valid_dt,
							count(value("X"))
								.over()
								.partitionBy(
									S1_W.sls_act_d_no,
									S1_W.sls_act_d_seq
								).as("valid_cnt")
						)
						.from(
							S1_W
							.innerJoin(S1_SLSIO).on(
								bracket(
									S1_W.sls_act_d_no.eq(S1_SLSIO.sls_act_d_no)
									.and(S1_W.sls_act_d_seq.eq(S1_SLSIO.sls_act_d_seq))
								)
							)
							.innerJoin(S1_ARR).on(
								bracket(
									S1_SLSIO.arr_act_no.eq(S1_ARR.arr_act_no)
								)
							)
						)
						.groupBy(
							S1_W.sls_act_d_no,
							S1_W.sls_act_d_seq,
							S1_ARR.ship_fr_valid_dt
						).view(S0_WSLSIO)
					)
					.groupBy(
						S0_WSLSIO.pr(S1_W.sls_act_d_no),
						S0_WSLSIO.pr(S1_W.sls_act_d_seq),
						decode(
							S0_WSLSIO.pr("valid_cnt"),
							value(1),
							S0_WSLSIO.pr(S1_ARR.ship_fr_valid_dt),
							nullValue()
						)
					)
			);
	}
	
	static MCJoinerList<Srch01_RsltR> MSBBL1320_Srch01_RsltR_J01() {
		return joinInfo(
			j -> j
				.add(MAM_TRD_R.class, r -> toCondition(
					r.trd_cd()
				))
				.addSelect(m -> toArray(
					m.trd_nm
				))
				.addMap((r, m) -> {
					r.trd_nm(m.trd_nm());
				}),
			j -> j
				.add(MAM_USR_R.class, r -> toCondition(
					r.sls_usr_cd()
				))
				.addSelect(m -> toArray(
					m.usr_nm
				))
				.addMap((r, m) -> {
					r.sls_usr_nm(m.usr_nm());
				}),
			j -> j
				.add(MAM_DPT_R.class, r -> toCondition(
					r.sls_dpt_cd(), r.master_dt()
				))
				.addSelect(m -> toArray(
					m.dpt_nm
				))
				.addMap((r, m) -> {
					r.sls_dpt_nm(m.dpt_nm());
				}),
			j -> j
				.add(MAM_WG_R.class, r -> toCondition(
					r.wg_cd()
				))
				.addSelect(m -> toArray(
					m.wg_nm
				))
				.addMap((r, m) -> {
					r.wg_nm(m.wg_nm());
				}),
			j -> j
				.add(MAM_CUR_R.class, r -> toCondition(
					r.trd_cur_cd()
				))
				.addSelect(m -> toArray(
					m.amt_dec_place,
					m.cur_nm,
					m.upri_dec_place
				))
				.addMap((r, m) -> {
					r.trd_cur_nm(m.cur_nm());
					r.trd_cur_amt_dec_place(m.amt_dec_place());
					r.trd_cur_upri_dec_place(m.upri_dec_place());
				}),
			j -> j
				.add(MAM_CUR_R.class, r -> toCondition(
					r.base_cur_cd()
				))
				.addSelect(m -> toArray(
					m.amt_dec_place,
					m.cur_nm,
					m.upri_dec_place
				))
				.addMap((r, m) -> {
					r.base_cur_nm(m.cur_nm());
					r.base_cur_amt_dec_place(m.amt_dec_place());
					r.base_cur_upri_dec_place(m.upri_dec_place());
				}),
			j -> j
				.add(MAM_CUR_R.class, r -> toCondition(
					r.ptax_cur_cd()
				))
				.addSelect(m -> toArray(
					m.amt_dec_place,
					m.cur_nm,
					m.upri_dec_place
				))
				.addMap((r, m) -> {
					r.ptax_cur_nm(m.cur_nm());
					r.ptax_cur_amt_dec_place(m.amt_dec_place());
					r.ptax_cur_upri_dec_place(m.upri_dec_place());
				}),
			j -> j
				.add(MAM_LG_GRP_R.class, r -> toCondition(
					r.ship_lg_grp_cd()
				))
				.addSelect(m -> toArray(
					m.lg_grp_nm
				))
				.addMap((r, m) -> {
					r.ship_lg_grp_nm(m.lg_grp_nm());
				}),
			j -> j
				.add(MAM_BP_R.class, r -> toCondition(
					r.acst_cd()
				))
				.addSelect(m -> toArray(
					m.bp_nm,
					m.bcst_cd
				))
				.addMap((r, m) -> {
					r.acst_nm(m.bp_nm());
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
				.add(MAM_DPT_R.class, r -> toCondition(
					r.ar_dpt_cd(), r.master_dt()
				))
				.addSelect(m -> toArray(
					m.dpt_nm
				))
				.addMap((r, m) -> {
					r.ar_dpt_nm(m.dpt_nm());
				}),
			j -> j
				.add(MAM_BP_R.class, r -> toCondition(
					r.dlv_cd()
				))
				.addSelect(m -> toArray(
					m.bp_nm,
					m.cntry_cd,
					m.prnt_lcl_cd
				))
				.addMap((r, m) -> {
					r.dlv_nm_bp(m.bp_nm());
					r.cntry_cd(m.cntry_cd());
					r.lcl_cd(m.prnt_lcl_cd());
					r.setStringNE("join_cntry_cd_", m.cntry_cd());
				}),
			j -> j
				.add(MAM_CNTRY_R.class, r -> toCondition(
					r.getStringNE("join_cntry_cd_")
				))
				.addSelect(m -> toArray(
					m.cntry_nm
				))
				.addMap((r, m) -> {
					r.cntry_nm(m.cntry_nm());
				}),
			j -> j
				.add(MAM_DPT_R.class, r -> toCondition(
					r.bd_dpt_cd(), r.master_dt()
				))
				.addSelect(m -> toArray(
					m.dpt_nm
				))
				.addMap((r, m) -> {
					r.bd_dpt_nm(m.dpt_nm());
				})
		);
	}
	
	static MCJoinerList<Srch01_RsltR> MSBBL1320_Srch01_RsltR_J02() {
		return joinInfo(
			j -> j
				.add(MAVM_BP_NM_R.class, r -> toCondition(
					r.dest_cd1()
				))
				.addSelect(m -> toArray(
					m.bp_nm
				))
				.addMap((r, m) -> {
					r.dest_nm1(m.bp_nm());
				}),
			j -> j
				.add(MAVM_BP_NM_R.class, r -> toCondition(
					r.dest_cd2()
				))
				.addSelect(m -> toArray(
					m.bp_nm
				))
				.addMap((r, m) -> {
					r.dest_nm2(m.bp_nm());
				}),
			j -> j
				.add(MAVM_BP_NM_R.class, r -> toCondition(
					r.dest_cd3()
				))
				.addSelect(m -> toArray(
					m.bp_nm
				))
				.addMap((r, m) -> {
					r.dest_nm3(m.bp_nm());
				}),
			j -> j
				.add(MAM_ITM_R.class, r -> toCondition(
					r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3()
				))
				.addSelect(m -> toArray(
					m.asset_mng_typ,
					m.bill_crryovr_times,
					m.dscnt_itm_flg,
					m.itm_nm,
					m.itm_typ,
					m.itm_typ_d_cd,
					m.lot_mng_typ,
					m.lot_no_ptn_cd,
					m.lot_no_typ,
					m.mrkt_judg_flg,
					m.sls_upri_cng_flg,
					m.sublot_mng_typ,
					m.sublot_no_ptn_cd,
					m.sublot_no_typ,
					m.ver_flg
				))
				.addMap((r, m) -> {
					r.itm_nm_itm(m.itm_nm());
					r.lot_mng_typ(m.lot_mng_typ());
					r.lot_no_typ(m.lot_no_typ());
					r.lot_no_ptn_cd(m.lot_no_ptn_cd());
					r.sublot_mng_typ(m.sublot_mng_typ());
					r.sublot_no_typ(m.sublot_no_typ());
					r.sublot_no_ptn_cd(m.sublot_no_ptn_cd());
					r.ver_flg(m.ver_flg());
					r.asset_mng_typ(m.asset_mng_typ());
					r.itm_typ(m.itm_typ());
					r.itm_typ_d_cd(m.itm_typ_d_cd());
					r.itm_bill_crryovr_times(m.bill_crryovr_times());
					r.itm_sls_upri_cng_flg(m.sls_upri_cng_flg());
					r.dscnt_itm_flg(m.dscnt_itm_flg());
					r.mrkt_judg_flg(m.mrkt_judg_flg());
					r.setStringNE("join_itm_typ_", m.itm_typ());
					r.setStringNE("join_itm_typ_d_cd_", m.itm_typ_d_cd());
				}),
			j -> j
				.add(MAM_ITM_TYP_D_R.class, r -> toCondition(
					r.getStringNE("join_itm_typ_"), r.getStringNE("join_itm_typ_d_cd_")
				))
				.addSelect(m -> toArray(
					m.itm_typ_d_nm
				))
				.addMap((r, m) -> {
					r.itm_typ_d_nm(m.itm_typ_d_nm());
				}),
			j -> j
				.add(MSVT_WRK_SNO_R.class, r -> toCondition(
					r.sno1()
				))
				.addSelect(m -> toArray(
					m.wrk_nm,
					m.wrk_no
				))
				.addMap((r, m) -> {
					r.wrk_no(m.wrk_no());
					r.wrk_nm(m.wrk_nm());
				}),
			j -> j
				.add(MAVM_ITM_UNIT_R.class, r -> toCondition(
					r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3(), r.trd_unit_cd()
				))
				.addSelect(m -> toArray(
					m.conv_base_qty,
					m.conv_qty,
					m.dec_place,
					m.rnd_typ,
					m.unit_cd
				))
				.addMap((r, m) -> {
					r.trd_unit_dec_place(m.dec_place());
					r.trd_unit_conv_base_qty(m.conv_base_qty());
					r.trd_unit_conv_qty(m.conv_qty());
					r.trd_unit_rnd_typ(m.rnd_typ());
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
					r.trd_unit_nm(m.unit_nm());
				}),
			j -> j
				.add(MAVM_ITM_UNIT_R.class, r -> toCondition(
					r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3(), r.base_unit_cd()
				))
				.addSelect(m -> toArray(
					m.dec_place,
					m.rnd_typ,
					m.unit_cd
				))
				.addMap((r, m) -> {
					r.base_unit_dec_place(m.dec_place());
					r.base_unit_rnd_typ(m.rnd_typ());
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
					r.base_unit_nm(m.unit_nm());
				}),
			j -> j
				.add(MAVM_ITM_UNIT_R.class, r -> toCondition(
					r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3(), r.init_trd_unit_cd()
				))
				.addSelect(m -> toArray(
					m.conv_base_qty,
					m.conv_qty
				))
				.addMap((r, m) -> {
					r.schd_trd_unit_conv_base_qty(m.conv_base_qty());
					r.schd_trd_unit_conv_qty(m.conv_qty());
				}),
			j -> j
				.add(MAM_TAX_R.class, r -> toCondition(
					r.new_tax_cd()
				))
				.addSelect(m -> toArray(
					m.inc_tax_flg,
					m.tax_nm,
					m.tax_rate,
					m.tax_typ
				))
				.addMap((r, m) -> {
					r.new_tax_nm(m.tax_nm());
					r.new_tax_rate(m.tax_rate());
					r.new_tax_typ(m.tax_typ());
					r.new_inc_tax_flg(m.inc_tax_flg());
				}),
			j -> j
				.add(MAM_TAX_R.class, r -> toCondition(
					r.tax_cd()
				))
				.addSelect(m -> toArray(
					m.inc_tax_flg,
					m.tax_nm,
					m.tax_rate,
					m.tax_typ
				))
				.addMap((r, m) -> {
					r.tax_nm(m.tax_nm());
					r.tax_rate(m.tax_rate());
					r.tax_typ(m.tax_typ());
					r.inc_tax_flg(m.inc_tax_flg());
				}),
			j -> j
				.add(MAM_TAX_R.class, r -> toCondition(
					r.schd_tax_cd()
				))
				.addSelect(m -> toArray(
					m.inc_tax_flg,
					m.tax_rate
				))
				.addMap((r, m) -> {
					r.schd_tax_rate(m.tax_rate());
					r.schd_inc_tax_flg(m.inc_tax_flg());
					r.init_inc_tax_flg(m.inc_tax_flg());
					r.init_tax_rate(m.tax_rate());
				}),
			j -> j
				.add(MAM_BIZ_RSN_R.class, r -> toCondition(
					r.dscnt_rsn_cd()
				))
				.addSelect(m -> toArray(
					m.biz_rsn_nm
				))
				.addMap((r, m) -> {
					r.dscnt_rsn_nm(m.biz_rsn_nm());
				}),
			j -> j
				.add(MAM_BIZ_RSN_R.class, r -> toCondition(
					r.sls_rsn_cd()
				))
				.addSelect(m -> toArray(
					m.biz_rsn_nm,
					m.sls_acxfr_flg
				))
				.addMap((r, m) -> {
					r.sls_rsn_nm(m.biz_rsn_nm());
					r.sls_acxfr_flg(m.sls_acxfr_flg());
				}),
			j -> j
				.add(MAM_STK_GD_R.class, r -> toCondition(
					r.gd_cd()
				))
				.addSelect(m -> toArray(
					m.gd_nm
				))
				.addMap((r, m) -> {
					r.gd_nm(m.gd_nm());
				})
		);
	}
}