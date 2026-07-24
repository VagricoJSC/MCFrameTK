package mcframe.serverMSLA.MSLAL5160;

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
	 * -- MSLAL5160_MST_ARR_ACT_Query_S01
	 */
	static MCQueryPlan MSLAL5160_MST_ARR_ACT_S01() {
		MST_ARR_ACT_R S0_ARRA = MST_ARR_ACT_R.create("ARRA");
		MST_PURC_ACT_IO_R S0_PURCAI = MST_PURC_ACT_IO_R.create("PURCAI");
		MST_PURC_ACT_D_R S0_PURCAD = MST_PURC_ACT_D_R.create("PURCAD");
		MST_PURC_ACT_R S0_PURCA = MST_PURC_ACT_R.create("PURCA");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSLAL5160_MST_ARR_ACT_Query_S01")
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
						S0_PURCAI.purc_act_io_no,
						S0_ARRA.ac_dt
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
	 * -- MSLAL5160_MST_DLV_SLIP_D_Query_S01
	 */
	static MCQueryPlan MSLAL5160_MST_DLV_SLIP_D_S01() {
		MST_DLV_SLIP_R S0_T1 = MST_DLV_SLIP_R.create("T1");
		MAM_CO_R S0_CO = MAM_CO_R.create("CO");
		MST_DLV_SLIP_D_R S0_T2 = MST_DLV_SLIP_D_R.create("T2");
		MST_SLO_D_R S0_T3 = MST_SLO_D_R.create("T3");
		MAM_ITM_R S0_M1 = MAM_ITM_R.create("M1");
		MAM_BP_R S0_CST = MAM_BP_R.create("CST");
		MAM_BP_R S0_ACST = MAM_BP_R.create("ACST");
		MAM_BP_R S0_BCST = MAM_BP_R.create("BCST");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSLAL5160_MST_DLV_SLIP_D_Query_S01")
					.mainQuery()
					.select(
						S0_T1.dlv_id_typ,
						S0_T1.dlv_id_cd.as("dlv_cd"),
						S0_T1.dlv_id_nm.as("dlv_nm"),
						S0_T1.dlv_sundry_flg,
						S0_T1.dlv_zip_cd,
						S0_T1.dlv_addr1,
						S0_T1.dlv_addr2,
						S0_T1.dlv_addr3,
						S0_T1.dlv_addr4,
						S0_T1.dlv_cntct_dpt,
						S0_T1.dlv_cntct_psn,
						S0_T1.dlv_tel,
						S0_T1.dlv_fax,
						S0_T1.pri_prnt_flg,
						S0_T3.dest_cd1,
						S0_T3.dest_cd2,
						S0_T3.dest_cd3,
						S0_T2.itm_cd,
						S0_T2.itm_sub1,
						S0_T2.itm_sub2,
						S0_T2.itm_sub3,
						S0_T2.sundry_itm_flg,
						S0_T2.itm_nm,
						S0_T2.sno1,
						S0_T2.sno2,
						S0_T2.sno3,
						S0_T2.sno4,
						S0_T2.lot_no,
						S0_T2.sublot_no,
						S0_T2.trd_unit_qty,
						S0_T2.trd_unit_cd,
						S0_T2.base_unit_qty,
						S0_T2.base_unit_cd,
						S0_T2.trd_cur_upri,
						decode(
							S0_T1.slo_no,
							nullValue(),
							value(false),
							value(true)
						).as("upri_not_tgt_flg"),
						S0_T3.interim_flg,
						S0_T2.tax_cd,
						decode(
							S0_T2.slo_d_no,
							nullValue(),
							MAPA_STD_COST$F_GET_STD_UPRI(
								S0_T2.itm_cd,
								S0_T2.itm_sub1,
								S0_T2.itm_sub2,
								S0_T2.itm_sub3,
								S0_T1.ac_dt,
								bind("wg_cd"),
								S0_CO.gm_std_upri_typ
							),
							S0_T3.cost_upri
						).as("cost_upri"),
						nvl(
							S0_T3.bill_crryovr_times,
							nvl(
								S0_M1.bill_crryovr_times,
								S0_BCST.bill_crryovr_times
							)
						).as("bill_crryovr_times"),
						S0_M1.sno1_mng_typ,
						S0_M1.sno2_mng_typ,
						S0_M1.sno3_mng_typ,
						S0_M1.sno4_mng_typ,
						S0_M1.itm_jnl_cd,
						S0_T2.cst_po_d_no,
						S0_T2.cst_itm_cd,
						S0_T2.cst_itm_nm,
						S0_T2.trd_d_rmrks,
						S0_T3.sls_rsn_cd.as("rsn_cd"),
						S0_T3.bd_dpt_cd,
						nvl2(
							S0_T3.slo_d_no,
							S0_T3.wtax_rate,
							MAPA_TAX$F_GET_WTAX_RATE(
								S0_T2.itm_cd,
								S0_T2.itm_sub1,
								S0_T2.itm_sub2,
								S0_T2.itm_sub3,
								trunc(
									S0_T1.ship_tm,
									MCDateFmt.DD
								)
							)
						).as("wtax_rate"),
						S0_T1.slo_no,
						S0_T2.slo_d_no,
						S0_T3.qtn_no,
						S0_T3.qtn_rev,
						S0_T3.qtn_d_no,
						S0_T2.trd_cur_dscnt_amt,
						S0_T3.dscnt_rsn_cd,
						S0_T2.dlv_slip_d_no,
						S0_T2.dlv_slip_d_seq,
						S0_T2.dlv_slip_seq,
						S0_T3.sls_cststk_flg
					)
					.from(
						S0_T1
						.crossJoin(S0_CO)
						.innerJoin(S0_T2).on(
							bracket(
								S0_T1.dlv_slip_no.eq(S0_T2.dlv_slip_no)
								.and(S0_T1.dlv_slip_seq.eq(S0_T2.dlv_slip_seq))
							)
						)
						.leftOuterJoin(S0_T3).on(
							bracket(
								S0_T2.slo_d_no.eq(S0_T3.slo_d_no)
							)
						)
						.leftOuterJoin(S0_M1).on(
							bracket(
								S0_T2.itm_cd.eq(S0_M1.itm_cd)
								.and(S0_T2.itm_sub1.eq(S0_M1.itm_sub1))
								.and(S0_T2.itm_sub2.eq(S0_M1.itm_sub2))
								.and(S0_T2.itm_sub3.eq(S0_M1.itm_sub3))
							)
						)
						.leftOuterJoin(S0_CST).on(
							bracket(
								S0_T1.bp_cd.eq(S0_CST.bp_cd)
							)
						)
						.leftOuterJoin(S0_ACST).on(
							bracket(
								S0_CST.acst_cd.eq(S0_ACST.bp_cd)
							)
						)
						.leftOuterJoin(S0_BCST).on(
							bracket(
								S0_ACST.bcst_cd.eq(S0_BCST.bp_cd)
							)
						)
					)
					.where(
						S0_T1.dlv_slip_no.eq(bind("dlv_slip_no"))
						.and(S0_T1.dlv_slip_seq.eq(bind("dlv_slip_seq")))
					)
					.orderBy(S0_T2.dlv_slip_d_no.asc())
			)
			.setJoinInfo(
				joinInfo(
					j -> j
						.add(MAM_TAX_R.class, r -> toCondition(
							r.getStringNE("tax_cd")
						))
						.addSelect(m -> toArray(
							m.inc_tax_flg,
							m.tax_rate,
							m.tax_typ
						))
						.addMap((r, m) -> {
							r.setBooleanNE("inc_tax_flg", m.inc_tax_flg());
							r.setNumberNE("tax_rate", m.tax_rate());
							r.setStringNE("tax_typ", m.tax_typ());
					})
				)
			);
	}
	
	/**
	 * -- MSLAL5160_MST_DLV_SLIP_Query_S01
	 */
	static MCQueryPlan MSLAL5160_MST_DLV_SLIP_S01() {
		MST_DLV_SLIP_R S0_T1 = MST_DLV_SLIP_R.create("T1");
		MAM_CO_R S0_CO = MAM_CO_R.create("CO");
		MST_SLO_R S0_T2 = MST_SLO_R.create("T2");
		MAM_BP_R S0_CST = MAM_BP_R.create("CST");
		MAM_DPT_R S0_DPT = MAM_DPT_R.create("DPT");
		MST_DLV_SLIP_R S1_W = MST_DLV_SLIP_R.create("W");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSLAL5160_MST_DLV_SLIP_Query_S01")
					.mainQuery()
					.select(
						S0_T1.trd_cd,
						S0_T1.trd_ptn_typ,
						S0_T1.ac_dt,
						S0_T1.ac_dt.as("can_ac_dt"),
						S0_T1.dpt_cd.as("sls_dpt_cd"),
						S0_T1.usr_cd.as("sls_usr_cd"),
						S0_DPT.wg_cd,
						trunc(
							S0_T1.ship_tm,
							MCDateFmt.DD
						).as("sls_dt"),
						S0_T1.ship_tm,
						S0_T1.dlv_tm,
						S0_T1.bp_cd.as("cst_cd"),
						S0_T2.tterm_cd1,
						S0_T2.tterm_rmrks1,
						S0_T2.tterm_cd2,
						S0_T2.tterm_rmrks2,
						S0_T2.tterm_cd3,
						S0_T2.tterm_rmrks3,
						decode(
							nvl(
								S0_CST.bill_basis_typ,
								S0_CO.bill_basis_typ
							),
							value(MAC_BILL_BASIS_TYP.SLS_AC.value()),
							S0_T1.ac_dt,
							greatest(
								S0_T1.ac_dt,
								trunc(
									S0_T1.dlv_tm,
									MCDateFmt.DD
								)
							)
						).as("bill_basis_dt"),
						S0_CST.acst_cd,
						cases()
							.when(S0_CST.ar_dpt_typ.eq(value(MAC_AR_DPT_TYP.SLS.value())))
								.then(S0_T1.dpt_cd)
							.when(S0_CST.ar_dpt_typ.eq(value(MAC_AR_DPT_TYP.AR.value())))
								.then(
									decode(
										S0_T1.slo_no,
										nullValue(),
										MAPA_BP$F_GET_AR_DPT_CD(
											S0_T1.bp_cd,
											S0_T1.ac_dt
										),
										S0_T2.ar_dpt_cd
									)
							)
							.otherwise(nullValue()).as("ar_dpt_cd"),
						S0_T1.cst_po_no,
						S0_T1.trd_cur_cd,
						S0_CO.base_cur_cd,
						S0_CO.sls_xrate_cd.as("xrate_cd"),
						cases()
							.when(S0_T2.xrate_inpt_flg.eq(value(true)))
								.then(S0_T2.xrate)
							.otherwise(
								MAPA_XCHNG$F_GET_SLS_XRATE(
									S0_T1.trd_cur_cd,
									trunc(
										S0_T1.ship_tm,
										MCDateFmt.DD
									)
								)
							).as("xrate"),
						S0_CO.ptax_cur_cd,
						cases()
							.when(S0_T2.ptax_xrate_inpt_flg.eq(value(true)))
								.then(S0_T2.ptax_xrate)
							.otherwise(
								MAPA_XCHNG$F_GET_XRATE(
									S0_T1.trd_cur_cd,
									nvl(
										S0_CO.ptax_cur_cd,
										S0_CO.base_cur_cd
									),
									S0_CO.sls_xrate_cd,
									trunc(
										S0_T1.ship_tm,
										MCDateFmt.DD
									)
								)
							).as("ptax_xrate"),
						S0_T1.trd_rmrks,
						S0_T1.dlv_slip_act_no.as("ship_act_no"),
						S0_T1.slo_no,
						S0_T2.qtn_no,
						S0_T2.qtn_rev,
						S0_T1.dlv_slip_no,
						S0_T1.dlv_slip_seq,
						S0_T1.dlv_slip_rev,
						S0_T1.slip_prnt_flg,
						S0_T2.sls_basis_typ
					)
					.from(
						S0_T1
						.crossJoin(S0_CO)
						.leftOuterJoin(S0_T2).on(
							bracket(
								S0_T1.slo_no.eq(S0_T2.slo_no)
							)
						)
						.leftOuterJoin(S0_CST).on(
							bracket(
								S0_T1.bp_cd.eq(S0_CST.bp_cd)
							)
						)
						.leftOuterJoin(S0_DPT).on(
							bracket(
								S0_T1.dpt_cd.eq(S0_DPT.dpt_cd)
								.and(S0_T1.ac_dt.between(S0_DPT.st_dt, S0_DPT.end_dt))
							)
						)
					)
					.where(
						S0_T1.dlv_slip_no.eq(bind("fix_dlv_slip_no"))
						.and(
							S0_T1.dlv_slip_seq.eq(subQuery()
								.select(max(S1_W.dlv_slip_seq))
								.from(S1_W)
								.where(
									S1_W.dlv_slip_no.eq(bind("fix_dlv_slip_no"))
									.and(S1_W.trn_typ.eq(value(MSC_TRN_TYP.SHIP.value())))
									.and(S1_W.slip_sts_typ.neq(value(MAC_SLIP_STS_TYP.CAN.value())))
								)
							)
						)
					)
			)
			.setJoinInfo(
				joinInfo(
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
					})
				)
			);
	}
	
	/**
	 * -- MSLAL5160_MST_IV_Query_S01
	 */
	static MCQueryPlan MSLAL5160_MST_IV_S01() {
		MST_IV_R S0_T1 = MST_IV_R.create("T1");
		MAM_CO_R S0_CO = MAM_CO_R.create("CO");
		MST_IV_D_R S0_T2 = MST_IV_D_R.create("T2");
		MST_SLO_R S0_T3 = MST_SLO_R.create("T3");
		MST_SLO_D_R S0_T4 = MST_SLO_D_R.create("T4");
		MST_SLS_SCHD_R S0_T5 = MST_SLS_SCHD_R.create("T5");
		MAM_DPT_R S0_DPT = MAM_DPT_R.create("DPT");
		MAM_BP_R S0_CST = MAM_BP_R.create("CST");
		MAM_BP_R S0_ACST = MAM_BP_R.create("ACST");
		MAM_BP_R S0_BCST = MAM_BP_R.create("BCST");
		MAM_ITM_R S0_ITM = MAM_ITM_R.create("ITM");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSLAL5160_MST_IV_Query_S01")
					.mainQuery()
					.select(
						S0_T2.trd_cd,
						S0_T1.trd_ptn_typ,
						S0_T1.ac_dt,
						S0_T1.cmpl_dt.as("sls_dt"),
						S0_T2.sls_dpt_cd,
						S0_DPT.wg_cd,
						S0_T2.sls_usr_cd,
						S0_T1.eta_dt,
						S0_T1.ship_rqst_id_cd.as("cst_cd"),
						S0_T1.iv_no,
						S0_T1.rcpt_iv_mng_no,
						S0_T1.rcpt_iv_no,
						S0_T1.tterm_cd1,
						S0_T1.tterm_rmrks1,
						S0_T1.tterm_cd2,
						S0_T1.tterm_rmrks2,
						S0_T1.tterm_cd3,
						S0_T1.tterm_rmrks3,
						S0_T1.lc_no,
						S0_T1.lc_dt,
						S0_T1.lc_rmrks,
						S0_T1.rcv_schd_dt,
						nvl(
							S0_T1.bill_basis_dt,
							S0_T1.rcv_schd_dt
						).as("bill_basis_dt"),
						S0_BCST.ar_cred_cd.as("cred_cd"),
						S0_ACST.bcst_cd,
						S0_CST.acst_cd,
						cases()
							.when(S0_CST.ar_dpt_typ.eq(value(MAC_AR_DPT_TYP.SLS.value())))
								.then(S0_T2.sls_dpt_cd)
							.when(S0_CST.ar_dpt_typ.eq(value(MAC_AR_DPT_TYP.AR.value())))
								.then(
									decode(
										S0_T2.slo_no,
										nullValue(),
										MAPA_BP$F_GET_AR_DPT_CD(
											S0_T1.ship_rqst_id_cd,
											S0_T1.ac_dt
										),
										S0_T3.ar_dpt_cd
									)
							)
							.otherwise(nullValue()).as("ar_dpt_cd"),
						S0_T2.cst_po_no,
						S0_T1.trd_cur_cd,
						S0_CO.base_cur_cd,
						S0_CO.sls_xrate_cd.as("xrate_cd"),
						cases()
							.when(S0_T1.xrate_inpt_flg.eq(value(true)))
								.then(S0_T1.xrate)
							.otherwise(
								MAPA_XCHNG$F_GET_SLS_XRATE(
									S0_T1.trd_cur_cd,
									S0_T1.cmpl_dt
								)
							).as("xrate"),
						S0_CO.ptax_cur_cd,
						cases()
							.when(S0_T1.ptax_xrate_inpt_flg.eq(value(true)))
								.then(S0_T1.ptax_xrate)
							.when(S0_CO.ptax_cur_cd.isNotNull())
								.then(
									MAPA_XCHNG$F_GET_XRATE(
										S0_T1.trd_cur_cd,
										nvl(
											S0_CO.ptax_cur_cd,
											S0_CO.base_cur_cd
										),
										S0_CO.sls_xrate_cd,
										S0_T1.cmpl_dt
									)
							)
							.otherwise(nullValue()).as("ptax_xrate"),
						S0_T2.trd_rmrks,
						S0_T2.slo_no,
						S0_T3.qtn_no,
						S0_T3.qtn_rev,
						S0_T1.dlv_id_cd.as("dlv_cd"),
						S0_T1.dlv_sundry_flg,
						S0_T1.dlv_id_nm.as("dlv_nm"),
						S0_T1.dlv_zip_cd,
						S0_T1.dlv_addr1,
						S0_T1.dlv_addr2,
						S0_T1.dlv_addr3,
						S0_T1.dlv_addr4,
						S0_T1.dlv_cntct_dpt,
						S0_T1.dlv_cntct_psn,
						S0_T1.dlv_tel,
						S0_T1.dlv_fax,
						S0_T4.dest_cd1,
						S0_T4.dest_cd2,
						S0_T4.dest_cd3,
						S0_T1.tdlv_cd,
						S0_T1.tdlv_nm,
						S0_T1.tdlv_sundry_flg,
						S0_T1.tdlv_zip_cd,
						S0_T1.tdlv_addr1,
						S0_T1.tdlv_addr2,
						S0_T1.tdlv_addr3,
						S0_T1.tdlv_addr4,
						S0_T1.tdlv_tel,
						S0_T1.tdlv_fax,
						S0_T1.tdlv_cntct_dpt,
						S0_T1.tdlv_cntct_psn,
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
							S0_ITM.itm_nm
						).as("iv_itm_nm"),
						S0_T2.cntry_org_cd,
						nvl(
							S0_T2.sno1,
							value(MAC_STR.NULL_VAL.value())
						).as("sno1"),
						nvl(
							S0_T2.sno2,
							value(MAC_STR.NULL_VAL.value())
						).as("sno2"),
						nvl(
							S0_T2.sno3,
							value(MAC_STR.NULL_VAL.value())
						).as("sno3"),
						nvl(
							S0_T2.sno4,
							value(MAC_STR.NULL_VAL.value())
						).as("sno4"),
						S0_T2.trd_unit_cd,
						S0_T2.trd_unit_qty,
						S0_T2.base_unit_cd,
						S0_T2.base_unit_qty,
						S0_T2.trd_cur_upri,
						S0_T2.interim_flg,
						decode(
							S0_T2.slo_d_no,
							nullValue(),
							MAPA_STD_COST$F_GET_STD_UPRI(
								S0_T2.itm_cd,
								S0_T2.itm_sub1,
								S0_T2.itm_sub2,
								S0_T2.itm_sub3,
								S0_T1.ac_dt,
								S0_DPT.wg_cd,
								S0_CO.gm_std_upri_typ
							),
							S0_T4.cost_upri
						).as("cost_upri"),
						nvl(
							S0_T4.bill_crryovr_times,
							nvl(
								S0_ITM.bill_crryovr_times,
								S0_BCST.bill_crryovr_times
							)
						).as("bill_crryovr_times"),
						S0_T2.sundry_itm_flg,
						S0_ITM.itm_jnl_cd,
						S0_T2.cst_po_d_no,
						S0_T2.cst_itm_cd,
						S0_T2.cst_itm_nm,
						S0_T2.trd_d_rmrks,
						S0_T2.wtax_rate,
						S0_T2.rsn_cd,
						S0_T2.bd_dpt_cd,
						S0_T2.slo_d_no,
						S0_T5.sls_schd_no,
						S0_T4.qtn_d_no,
						S0_T2.iv_d_no,
						S0_T2.trd_cur_dscnt_amt,
						S0_T2.dscnt_rsn_cd,
						S0_T1.via_dlv_typ,
						S0_T2.tax_cd,
						S0_ITM.sno1_mng_typ,
						S0_ITM.sno2_mng_typ,
						S0_ITM.sno3_mng_typ,
						S0_ITM.sno4_mng_typ,
						S0_T1.sls_basis_typ,
						S0_T1.iv_src_typ
					)
					.from(
						S0_T1
						.crossJoin(S0_CO)
						.leftOuterJoin(S0_T2).on(
							bracket(
								S0_T1.iv_mng_no.eq(S0_T2.iv_mng_no)
							)
						)
						.leftOuterJoin(S0_T3).on(
							bracket(
								S0_T2.slo_no.eq(S0_T3.slo_no)
							)
						)
						.leftOuterJoin(S0_T4).on(
							bracket(
								S0_T2.slo_d_no.eq(S0_T4.slo_d_no)
							)
						)
						.leftOuterJoin(S0_T5).on(
							bracket(
								S0_T1.iv_no.eq(S0_T5.iv_no)
								.and(S0_T2.iv_d_no.eq(S0_T5.iv_d_no))
							)
						)
						.leftOuterJoin(S0_DPT).on(
							bracket(
								S0_T2.sls_dpt_cd.eq(S0_DPT.dpt_cd)
								.and(S0_T1.ac_dt.between(S0_DPT.st_dt, S0_DPT.end_dt))
							)
						)
						.leftOuterJoin(S0_CST).on(
							bracket(
								S0_T1.ship_rqst_id_cd.eq(S0_CST.bp_cd)
							)
						)
						.leftOuterJoin(S0_ACST).on(
							bracket(
								S0_CST.acst_cd.eq(S0_ACST.bp_cd)
							)
						)
						.leftOuterJoin(S0_BCST).on(
							bracket(
								S0_ACST.bcst_cd.eq(S0_BCST.bp_cd)
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
					)
					.where(
						S0_T1.iv_no.eq(bind("fix_dlv_slip_no"))
					)
					.orderBy(S0_T2.disp_seq.asc())
			)
			.setJoinInfo(
				joinInfo(
					j -> j
						.add(MAM_TAX_R.class, r -> toCondition(
							r.getStringNE("tax_cd")
						))
						.addSelect(m -> toArray(
							m.inc_tax_flg,
							m.tax_rate,
							m.tax_typ
						))
						.addMap((r, m) -> {
							r.setBooleanNE("inc_tax_flg", m.inc_tax_flg());
							r.setNumberNE("tax_rate", m.tax_rate());
							r.setStringNE("tax_typ", m.tax_typ());
					})
				)
			);
	}
	
	/**
	 * -- MSLAL5160_MST_IV_Query_S02
	 */
	static MCQueryPlan MSLAL5160_MST_IV_S02() {
		MST_IV_R S0_T1 = MST_IV_R.create("T1");
		MAM_CO_R S0_CO = MAM_CO_R.create("CO");
		MST_IV_D_R S0_T2 = MST_IV_D_R.create("T2");
		MST_SLO_R S0_T3 = MST_SLO_R.create("T3");
		MST_SLO_D_R S0_T4 = MST_SLO_D_R.create("T4");
		MST_SLS_SCHD_R S0_T5 = MST_SLS_SCHD_R.create("T5");
		MST_IV_MAP_R S0_T6 = MST_IV_MAP_R.create("T6");
		MST_SHIP_ACT_R S0_SHIPACT = MST_SHIP_ACT_R.create("SHIPACT");
		MAM_DPT_R S0_DPT = MAM_DPT_R.create("DPT");
		MAM_BP_R S0_CST = MAM_BP_R.create("CST");
		MAM_BP_R S0_ACST = MAM_BP_R.create("ACST");
		MAM_BP_R S0_BCST = MAM_BP_R.create("BCST");
		MAM_ITM_R S0_ITM = MAM_ITM_R.create("ITM");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSLAL5160_MST_IV_Query_S02")
					.mainQuery()
					.select(
						S0_T2.trd_cd,
						S0_T1.trd_ptn_typ,
						S0_SHIPACT.ac_dt,
						trunc(
							nvl(
								S0_SHIPACT.ship_tm,
								FCPA_DATE_UTIL$F_GET_TODAY1()
							),
							MCDateFmt.DD
						).as("sls_dt"),
						S0_T2.sls_dpt_cd,
						S0_DPT.wg_cd,
						S0_T2.sls_usr_cd,
						S0_T1.eta_dt,
						S0_T1.ship_rqst_id_cd.as("cst_cd"),
						S0_T1.iv_no,
						S0_T1.rcpt_iv_mng_no,
						S0_T1.rcpt_iv_no,
						S0_T1.tterm_cd1,
						S0_T1.tterm_rmrks1,
						S0_T1.tterm_cd2,
						S0_T1.tterm_rmrks2,
						S0_T1.tterm_cd3,
						S0_T1.tterm_rmrks3,
						S0_T1.lc_no,
						S0_T1.lc_dt,
						S0_T1.lc_rmrks,
						S0_T1.rcv_schd_dt,
						nvl(
							S0_T1.bill_basis_dt,
							S0_T1.rcv_schd_dt
						).as("bill_basis_dt"),
						S0_BCST.ar_cred_cd.as("cred_cd"),
						S0_ACST.bcst_cd,
						S0_CST.acst_cd,
						cases()
							.when(S0_CST.ar_dpt_typ.eq(value(MAC_AR_DPT_TYP.SLS.value())))
								.then(S0_T2.sls_dpt_cd)
							.when(S0_CST.ar_dpt_typ.eq(value(MAC_AR_DPT_TYP.AR.value())))
								.then(
									decode(
										S0_T2.slo_no,
										nullValue(),
										MAPA_BP$F_GET_AR_DPT_CD(
											S0_T1.ship_rqst_id_cd,
											nvl(
												S0_SHIPACT.ac_dt,
												FCPA_DATE_UTIL$F_GET_TODAY1()
											)
										),
										S0_T3.ar_dpt_cd
									)
							)
							.otherwise(nullValue()).as("ar_dpt_cd"),
						S0_T2.cst_po_no,
						S0_T1.trd_cur_cd,
						S0_CO.base_cur_cd,
						S0_CO.sls_xrate_cd.as("xrate_cd"),
						cases()
							.when(S0_T1.xrate_inpt_flg.eq(value(true)))
								.then(S0_T1.xrate)
							.otherwise(
								MAPA_XCHNG$F_GET_SLS_XRATE(
									S0_T1.trd_cur_cd,
									trunc(
										nvl(
											S0_SHIPACT.ship_tm,
											FCPA_DATE_UTIL$F_GET_TODAY1()
										),
										MCDateFmt.DD
									)
								)
							).as("xrate"),
						S0_CO.ptax_cur_cd,
						cases()
							.when(S0_T1.ptax_xrate_inpt_flg.eq(value(true)))
								.then(S0_T1.ptax_xrate)
							.when(S0_CO.ptax_cur_cd.isNotNull())
								.then(
									MAPA_XCHNG$F_GET_XRATE(
										S0_T1.trd_cur_cd,
										nvl(
											S0_CO.ptax_cur_cd,
											S0_CO.base_cur_cd
										),
										S0_CO.sls_xrate_cd,
										trunc(
											nvl(
												S0_SHIPACT.ship_tm,
												FCPA_DATE_UTIL$F_GET_TODAY1()
											),
											MCDateFmt.DD
										)
									)
							)
							.otherwise(nullValue()).as("ptax_xrate"),
						S0_T2.trd_rmrks,
						S0_T2.slo_no,
						S0_T3.qtn_no,
						S0_T3.qtn_rev,
						S0_T1.dlv_id_cd.as("dlv_cd"),
						S0_T1.dlv_sundry_flg,
						S0_T1.dlv_id_nm.as("dlv_nm"),
						S0_T1.dlv_zip_cd,
						S0_T1.dlv_addr1,
						S0_T1.dlv_addr2,
						S0_T1.dlv_addr3,
						S0_T1.dlv_addr4,
						S0_T1.dlv_cntct_dpt,
						S0_T1.dlv_cntct_psn,
						S0_T1.dlv_tel,
						S0_T1.dlv_fax,
						S0_T4.dest_cd1,
						S0_T4.dest_cd2,
						S0_T4.dest_cd3,
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
							S0_ITM.itm_nm
						).as("iv_itm_nm"),
						S0_T2.cntry_org_cd,
						nvl(
							S0_T2.sno1,
							value(MAC_STR.NULL_VAL.value())
						).as("sno1"),
						nvl(
							S0_T2.sno2,
							value(MAC_STR.NULL_VAL.value())
						).as("sno2"),
						nvl(
							S0_T2.sno3,
							value(MAC_STR.NULL_VAL.value())
						).as("sno3"),
						nvl(
							S0_T2.sno4,
							value(MAC_STR.NULL_VAL.value())
						).as("sno4"),
						S0_T2.trd_unit_cd,
						S0_T2.trd_unit_qty,
						S0_T2.base_unit_cd,
						S0_T2.base_unit_qty,
						S0_T2.trd_cur_upri,
						S0_T2.interim_flg,
						decode(
							S0_T2.slo_d_no,
							nullValue(),
							MAPA_STD_COST$F_GET_STD_UPRI(
								S0_T2.itm_cd,
								S0_T2.itm_sub1,
								S0_T2.itm_sub2,
								S0_T2.itm_sub3,
								nvl(
									S0_SHIPACT.ac_dt,
									FCPA_DATE_UTIL$F_GET_TODAY1()
								),
								S0_DPT.wg_cd,
								S0_CO.gm_std_upri_typ
							),
							S0_T4.cost_upri
						).as("cost_upri"),
						nvl(
							S0_T4.bill_crryovr_times,
							nvl(
								S0_ITM.bill_crryovr_times,
								S0_BCST.bill_crryovr_times
							)
						).as("bill_crryovr_times"),
						S0_T2.sundry_itm_flg,
						S0_ITM.itm_jnl_cd,
						S0_T2.cst_po_d_no,
						S0_T2.cst_itm_cd,
						S0_T2.cst_itm_nm,
						S0_T2.trd_d_rmrks,
						S0_T2.wtax_rate,
						S0_T2.rsn_cd,
						S0_T2.bd_dpt_cd,
						S0_T2.slo_d_no,
						S0_T6.ship_schd_no,
						S0_T5.sls_schd_no,
						S0_T4.qtn_d_no,
						S0_T2.iv_d_no,
						S0_T2.trd_cur_dscnt_amt,
						S0_T2.dscnt_rsn_cd,
						S0_T1.via_dlv_typ,
						S0_T2.tax_cd,
						S0_ITM.sno1_mng_typ,
						S0_ITM.sno2_mng_typ,
						S0_ITM.sno3_mng_typ,
						S0_ITM.sno4_mng_typ,
						S0_T1.sls_basis_typ,
						S0_T1.iv_src_typ
					)
					.from(
						S0_T1
						.crossJoin(S0_CO)
						.leftOuterJoin(S0_T2).on(
							bracket(
								S0_T1.iv_mng_no.eq(S0_T2.iv_mng_no)
							)
						)
						.leftOuterJoin(S0_T3).on(
							bracket(
								S0_T2.slo_no.eq(S0_T3.slo_no)
							)
						)
						.leftOuterJoin(S0_T4).on(
							bracket(
								S0_T2.slo_d_no.eq(S0_T4.slo_d_no)
							)
						)
						.leftOuterJoin(S0_T5).on(
							bracket(
								S0_T1.iv_no.eq(S0_T5.iv_no)
								.and(S0_T2.iv_d_no.eq(S0_T5.iv_d_no))
							)
						)
						.leftOuterJoin(S0_T6).on(
							bracket(
								S0_T2.iv_d_no.eq(S0_T6.iv_d_no)
							)
						)
						.leftOuterJoin(S0_SHIPACT).on(
							bracket(
								S0_T1.iv_no.eq(S0_SHIPACT.iv_no)
								.and(S0_SHIPACT.can_flg.eq(value(false)))
							)
						)
						.leftOuterJoin(S0_DPT).on(
							bracket(
								S0_T2.sls_dpt_cd.eq(S0_DPT.dpt_cd)
								.and(
									nvl(
										S0_SHIPACT.ac_dt,
										FCPA_DATE_UTIL$F_GET_TODAY1()
									).between(S0_DPT.st_dt, S0_DPT.end_dt)
								)
							)
						)
						.leftOuterJoin(S0_CST).on(
							bracket(
								S0_T1.ship_rqst_id_cd.eq(S0_CST.bp_cd)
							)
						)
						.leftOuterJoin(S0_ACST).on(
							bracket(
								S0_CST.acst_cd.eq(S0_ACST.bp_cd)
							)
						)
						.leftOuterJoin(S0_BCST).on(
							bracket(
								S0_ACST.bcst_cd.eq(S0_BCST.bp_cd)
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
					)
					.where(
						S0_T1.iv_no.eq(bind("fix_dlv_slip_no"))
					)
					.orderBy(S0_T2.disp_seq.asc())
			)
			.setJoinInfo(
				joinInfo(
					j -> j
						.add(MAM_TAX_R.class, r -> toCondition(
							r.getStringNE("tax_cd")
						))
						.addSelect(m -> toArray(
							m.inc_tax_flg,
							m.tax_rate,
							m.tax_typ
						))
						.addMap((r, m) -> {
							r.setBooleanNE("inc_tax_flg", m.inc_tax_flg());
							r.setNumberNE("tax_rate", m.tax_rate());
							r.setStringNE("tax_typ", m.tax_typ());
					})
				)
			);
	}
	
	/**
	 * -- MSLAL5160_MST_IV_Query_S03
	 */
	static MCQueryPlan MSLAL5160_MST_IV_S03() {
		MST_IV_R S0_T1 = MST_IV_R.create("T1");
		MST_IV_D_R S0_T2 = MST_IV_D_R.create("T2");
		MST_SLS_SCHD_R S0_T3 = MST_SLS_SCHD_R.create("T3");
		MST_IV_MAP_R S0_T4 = MST_IV_MAP_R.create("T4");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSLAL5160_MST_IV_Query_S03")
					.mainQuery()
					.select(
						S0_T2.trd_cd,
						S0_T1.trd_ptn_typ,
						S0_T4.ship_schd_no,
						S0_T3.sls_schd_no,
						S0_T2.iv_d_no
					)
					.from(
						S0_T1
						.leftOuterJoin(S0_T2).on(
							bracket(
								S0_T1.iv_mng_no.eq(S0_T2.iv_mng_no)
							)
						)
						.leftOuterJoin(S0_T3).on(
							bracket(
								S0_T1.iv_no.eq(S0_T3.iv_no)
								.and(S0_T2.iv_d_no.eq(S0_T3.iv_d_no))
							)
						)
						.leftOuterJoin(S0_T4).on(
							bracket(
								S0_T2.iv_d_no.eq(S0_T4.iv_d_no)
							)
						)
					)
					.where(
						S0_T1.iv_no.eq(bind("fix_dlv_slip_no"))
					)
					.orderBy(S0_T2.disp_seq.asc())
			);
	}
	
	/**
	 * -- MSLAL5160_MST_IV_SHIP_ACT_D_Query_S01
	 */
	static MCQueryPlan MSLAL5160_MST_IV_SHIP_ACT_D_S01() {
		MST_IV_SHIP_ACT_D_R S0_T1 = MST_IV_SHIP_ACT_D_R.create("T1");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSLAL5160_MST_IV_SHIP_ACT_D_Query_S01")
					.mainQuery()
					.select(
						S0_T1.iv_ship_act_d_no,
						S0_T1.sno1,
						S0_T1.sno2,
						S0_T1.sno3,
						S0_T1.sno4,
						S0_T1.gd_cd,
						S0_T1.ship_loc_cd.as("loc_cd"),
						S0_T1.ship_str_ln_cd.as("str_ln_cd"),
						S0_T1.lot_no,
						S0_T1.sublot_no,
						S0_T1.trd_unit_cd,
						S0_T1.trd_unit_qty,
						S0_T1.base_unit_cd,
						S0_T1.base_unit_qty,
						S0_T1.pack_unit_cd,
						S0_T1.pack_unit_qty,
						S0_T1.stk_mng_typ
					)
					.from(S0_T1)
					.where(
						value(0).eq(value(0))
						.and(S0_T1.iv_no.eq(bind("iv_no")))
						.and(S0_T1.iv_d_no.eq(bind("iv_d_no")))
					)
					.orderBy(S0_T1.iv_ship_act_d_no.asc())
			);
	}
	
	/**
	 * -- MSLAL5160_MST_PO_D_Query_S01
	 */
	static MCQueryPlan MSLAL5160_MST_PO_D_S01() {
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
				sql("MSLAL5160_MST_PO_D_Query_S01")
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
							S0_PURCD.trd_cur_dscnt_amt
						).as("trd_cur_dscnt_amt"),
						decode(
							S0_PURCD.purc_dtl_upd_flg,
							value(true),
							S0_PURCD.ptax_cur_tax_amt
						).as("ptax_cur_tax_amt"),
						nvl(
							S0_T8.dscnt_rsn_cd,
							S0_T2.dscnt_rsn_cd
						).as("dscnt_rsn_cd"),
						cases()
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
						S0_T2.purc_rsn_cd.as("rsn_cd"),
						nvl(
							S0_T8.purc_rsn_cd,
							S0_T2.purc_rsn_cd
						).as("rsn_cd"),
						S0_T2.bd_dpt_cd,
						S0_T2.intr_rmrks,
						S0_T2.trd_d_rmrks,
						S0_T2.sub_char1,
						S0_T2.sub_char2,
						S0_T2.sub_char3,
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
							bracket(
								S0_T2.slo_d_no.eq(S0_T1.slo_d_no)
								.and(S0_T2.po_schd_no.eq(S0_T1.po_schd_no))
							)
						)
						.leftOuterJoin(S0_PO).on(
							bracket(
								S0_T2.po_no.eq(S0_PO.po_no)
								.and(S0_PO.can_flg.eq(value(false)))
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
						.innerJoin(S0_T3).on(
							bracket(
								S0_T3.purc_schd_no.eq(S0_T1.purc_schd_no)
							)
						)
						.innerJoin(S0_T4).on(
							bracket(
								S0_T1.slo_d_no.eq(S0_T4.slo_d_no)
							)
						)
						.innerJoin(S0_T5).on(
							bracket(
								S0_T3.arr_schd_no.eq(S0_T5.arr_schd_no)
							)
						)
						.innerJoin(S0_T6).on(
							bracket(
								S0_T6.slo_d_no.eq(S0_T1.slo_d_no)
							)
						)
						.innerJoin(S0_T7).on(
							bracket(
								S0_T2.po_d_no.eq(S0_T7.po_d_no)
								.and(S0_T5.arr_pr_no.eq(S0_T7.arr_pr_no))
							)
						)
						.leftOuterJoin(S0_T8).on(
							S0_T1.purc_schd_no.eq(S0_T8.purc_schd_no)
						)
						.innerJoin(S0_W).on(
							bracket(
								S0_T1.sls_schd_no.eq(S0_W.sls_schd_no)
							)
						)
					)
					.where(
						S0_T2.can_flg.eq(value(false))
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
	 * -- MSLAL5160_MST_SHIP_ACT_D_Query_S01
	 */
	static MCQueryPlan MSLAL5160_MST_SHIP_ACT_D_S01() {
		MST_SHIP_ACT_D_R S0_T1 = MST_SHIP_ACT_D_R.create("T1");
		MST_SHIP_ACT_R S0_T3 = MST_SHIP_ACT_R.create("T3");
		MAM_UNIT_R S0_M1 = MAM_UNIT_R.create("M1");
		MAVM_ITM_UNIT_R S0_M2 = MAVM_ITM_UNIT_R.create("M2");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSLAL5160_MST_SHIP_ACT_D_Query_S01")
					.mainQuery()
					.select(
						S0_T1.ship_act_d_no,
						S0_T1.sno1,
						S0_T1.sno2,
						S0_T1.sno3,
						S0_T1.sno4,
						S0_T1.gd_cd,
						S0_T1.ship_loc_cd.as("loc_cd"),
						S0_T1.ship_str_ln_cd.as("str_ln_cd"),
						S0_T1.lot_no,
						S0_T1.sublot_no,
						S0_T1.trd_unit_cd,
						S0_T1.trd_unit_qty,
						S0_T1.base_unit_cd,
						S0_T1.base_unit_qty,
						cases()
							.when(S0_M2.pack_flg.eq(value(true)))
								.then(S0_T1.trd_unit_cd)
							.when(S0_M2.pack_flg.eq(value(false)))
								.then(S0_T1.base_unit_cd)
							.otherwise(nullValue()).as("pack_unit_cd"),
						cases()
							.when(S0_M2.pack_flg.eq(value(true)))
								.then(S0_T1.trd_unit_qty)
							.when(S0_M2.pack_flg.eq(value(false)))
								.then(S0_T1.base_unit_qty)
							.otherwise(nullValue()).as("pack_unit_qty")
					)
					.from(
						S0_T1
						.innerJoin(S0_T3).on(
							bracket(
								S0_T1.ship_act_no.eq(S0_T3.ship_act_no)
								.and(S0_T3.can_flg.eq(value(false)))
							)
						)
						.leftOuterJoin(S0_M1).on(
							bracket(
								S0_T1.trd_unit_cd.eq(S0_M1.unit_cd)
							)
						)
						.leftOuterJoin(S0_M2).on(
							bracket(
								S0_T1.itm_cd.eq(S0_M2.itm_cd)
								.and(S0_T1.itm_sub1.eq(S0_M2.itm_sub1))
								.and(S0_T1.itm_sub2.eq(S0_M2.itm_sub2))
								.and(S0_T1.itm_sub3.eq(S0_M2.itm_sub3))
								.and(S0_T1.trd_unit_cd.eq(S0_M2.unit_cd))
							)
						)
					)
					.where(
						S0_T1.dlv_slip_d_no.eq(bind("dlv_slip_d_no"))
						.and(S0_T1.can_flg.eq(value(false)))
					)
					.orderBy(S0_T1.disp_seq.asc())
			);
	}
	
	/**
	 * -- MSLAL5160_MST_SHIP_ACT_D_Query_S02
	 */
	static MCQueryPlan MSLAL5160_MST_SHIP_ACT_D_S02() {
		MST_SHIP_ACT_D_R S0_T1 = MST_SHIP_ACT_D_R.create("T1");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSLAL5160_MST_SHIP_ACT_D_Query_S02")
					.mainQuery()
					.select(
						S0_T1.ship_act_d_no,
						S0_T1.sno1,
						S0_T1.sno2,
						S0_T1.sno3,
						S0_T1.sno4,
						S0_T1.gd_cd,
						S0_T1.ship_loc_cd.as("loc_cd"),
						S0_T1.ship_str_ln_cd.as("str_ln_cd"),
						S0_T1.lot_no,
						S0_T1.sublot_no,
						S0_T1.trd_unit_cd,
						S0_T1.trd_unit_qty,
						S0_T1.base_unit_cd,
						S0_T1.base_unit_qty,
						S0_T1.pack_unit_cd,
						S0_T1.pack_unit_qty,
						S0_T1.stk_mng_typ
					)
					.from(S0_T1)
					.where(
						S0_T1.ship_alloc_sts_no.eq(bind("ship_alloc_sts_no"))
						.and(S0_T1.can_flg.eq(value(false)))
					)
					.orderBy(S0_T1.disp_seq.asc())
			);
	}
	
	/**
	 * -- MSLAL5160_MST_SHIP_ACT_D_Query_S03
	 */
	static MCQueryPlan MSLAL5160_MST_SHIP_ACT_D_S03() {
		MST_SHIP_ACT_D_R S0_T1 = MST_SHIP_ACT_D_R.create("T1");
		MST_IV_SHIP_ACT_MAP_R S0_IVACTMAP = MST_IV_SHIP_ACT_MAP_R.create("IVACTMAP");
		MST_IV_D_R S0_IVD = MST_IV_D_R.create("IVD");
		
		return createQueryPlan()
			.setQuery(
				sql("MSLAL5160_MST_SHIP_ACT_D_Query_S03")
					.mainQuery()
					.select(
						S0_T1.ship_act_d_no,
						S0_T1.sno1,
						S0_T1.sno2,
						S0_T1.sno3,
						S0_T1.sno4,
						S0_T1.gd_cd,
						S0_T1.ship_loc_cd.as("loc_cd"),
						S0_T1.ship_str_ln_cd.as("str_ln_cd"),
						S0_T1.lot_no,
						S0_T1.sublot_no,
						S0_T1.trd_unit_cd,
						S0_T1.trd_unit_qty,
						S0_T1.base_unit_cd,
						S0_T1.base_unit_qty,
						S0_T1.pack_unit_cd,
						S0_T1.pack_unit_qty,
						S0_T1.stk_mng_typ
					)
					.from(
						S0_T1
						.innerJoin(S0_IVACTMAP).on(
							bracket(
								S0_T1.ship_act_d_no.eq(S0_IVACTMAP.ship_act_d_no)
							)
						)
						.innerJoin(S0_IVD).on(
							bracket(
								S0_IVACTMAP.iv_d_no.eq(S0_IVD.iv_d_no)
							)
						)
					)
					.where(
						S0_IVD.iv_d_no.eq(bind("iv_d_no"))
						.and(S0_T1.can_flg.eq(value(false)))
					)
					.orderBy(S0_T1.disp_seq.asc())
			);
	}
	
	/**
	 * -- MSLAL5160_MST_SLO_D_Query_S01
	 */
	static MCQueryPlan MSLAL5160_MST_SLO_D_S01() {
		MST_SLO_D_R S0_T1 = MST_SLO_D_R.create("T1");
		MAM_CO_R S0_CO = MAM_CO_R.create("CO");
		MST_SLO_R S0_T2 = MST_SLO_R.create("T2");
		MAM_ITM_R S0_M1 = MAM_ITM_R.create("M1");
		MAM_BP_R S0_CST = MAM_BP_R.create("CST");
		MAM_BP_R S0_ACST = MAM_BP_R.create("ACST");
		MAM_BP_R S0_BCST = MAM_BP_R.create("BCST");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSLAL5160_MST_SLO_D_Query_S01")
					.mainQuery()
					.select(
						S0_T1.dlv_cd,
						S0_T1.dlv_nm,
						S0_T1.dlv_sundry_flg,
						S0_T1.dlv_zip_cd,
						S0_T1.dlv_addr1,
						S0_T1.dlv_addr2,
						S0_T1.dlv_addr3,
						S0_T1.dlv_addr4,
						S0_T1.dlv_cntct_dpt,
						S0_T1.dlv_cntct_psn,
						S0_T1.dlv_tel,
						S0_T1.dlv_fax,
						S0_T1.pri_prnt_flg,
						S0_T1.dest_cd1,
						S0_T1.dest_cd2,
						S0_T1.dest_cd3,
						S0_T1.itm_cd,
						S0_T1.itm_sub1,
						S0_T1.itm_sub2,
						S0_T1.itm_sub3,
						S0_T1.sundry_itm_flg,
						S0_T1.itm_nm,
						S0_T1.iv_itm_nm,
						S0_T1.sno1,
						S0_T1.sno2,
						S0_T1.sno3,
						S0_T1.sno4,
						S0_T1.trd_unit_qty,
						S0_T1.trd_unit_cd,
						S0_T1.base_unit_qty,
						S0_T1.base_unit_cd,
						S0_T1.trd_cur_upri,
						S0_T1.interim_flg,
						S0_T1.tax_cd,
						S0_T1.cntry_org_cd,
						S0_T1.cst_po_d_no,
						S0_T1.cst_itm_cd,
						S0_T1.cst_itm_nm,
						S0_T1.trd_d_rmrks,
						S0_T1.sls_rsn_cd.as("rsn_cd"),
						S0_T1.bd_dpt_cd,
						S0_T1.wtax_rate,
						S0_T1.slo_no,
						S0_T1.slo_d_no,
						S0_T1.qtn_no,
						S0_T1.qtn_rev,
						S0_T1.qtn_d_no,
						S0_T1.trd_cur_dscnt_amt,
						S0_T1.dscnt_rsn_cd,
						S0_T1.sls_cststk_flg,
						S0_T1.tax_fix_flg,
						S0_T1.cost_upri,
						S0_T1.gd_cd,
						S0_T1.ship_inst_typ,
						nvl(
							S0_T1.bill_crryovr_times,
							nvl(
								S0_M1.bill_crryovr_times,
								S0_BCST.bill_crryovr_times
							)
						).as("bill_crryovr_times"),
						S0_M1.sno1_mng_typ,
						S0_M1.sno2_mng_typ,
						S0_M1.sno3_mng_typ,
						S0_M1.sno4_mng_typ,
						S0_M1.itm_jnl_cd
					)
					.from(
						S0_T1
						.crossJoin(S0_CO)
						.leftOuterJoin(S0_T2).on(
							bracket(
								S0_T1.slo_no.eq(S0_T2.slo_no)
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
						.leftOuterJoin(S0_CST).on(
							bracket(
								S0_T2.cst_cd.eq(S0_CST.bp_cd)
							)
						)
						.leftOuterJoin(S0_ACST).on(
							bracket(
								S0_CST.acst_cd.eq(S0_ACST.bp_cd)
							)
						)
						.leftOuterJoin(S0_BCST).on(
							bracket(
								S0_ACST.bcst_cd.eq(S0_BCST.bp_cd)
							)
						)
					)
					.where(
						S0_T1.slo_no.eq(bind("slo_no"))
						.and(S0_T1.proc_typ.eq(value(MAC_SLO_PROC_TYP.PURC_DDLV.value())))
					)
					.orderBy(S0_T1.slo_d_no.asc())
			)
			.setJoinInfo(
				joinInfo(
					j -> j
						.add(MAM_TAX_R.class, r -> toCondition(
							r.getStringNE("tax_cd")
						))
						.addSelect(m -> toArray(
							m.inc_tax_flg,
							m.tax_rate,
							m.tax_typ
						))
						.addMap((r, m) -> {
							r.setBooleanNE("inc_tax_flg", m.inc_tax_flg());
							r.setNumberNE("tax_rate", m.tax_rate());
							r.setStringNE("tax_typ", m.tax_typ());
					})
				)
			);
	}
	
	/**
	 * -- MSLAL5160_MST_SLO_Query_S01
	 */
	static MCQueryPlan MSLAL5160_MST_SLO_S01() {
		MST_SLO_R S0_T1 = MST_SLO_R.create("T1");
		MAM_CO_R S0_CO = MAM_CO_R.create("CO");
		MAM_BP_R S0_CST = MAM_BP_R.create("CST");
		MAM_DPT_R S0_DPT = MAM_DPT_R.create("DPT");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSLAL5160_MST_SLO_Query_S01")
					.mainQuery()
					.select(
						S0_T1.trd_cd,
						S0_T1.trd_ptn_typ,
						S0_T1.sls_dpt_cd,
						S0_T1.sls_usr_cd.as("sls_usr_cd"),
						S0_DPT.wg_cd,
						S0_T1.cst_cd.as("cst_cd"),
						S0_T1.tterm_cd1,
						S0_T1.tterm_rmrks1,
						S0_T1.tterm_cd2,
						S0_T1.tterm_rmrks2,
						S0_T1.tterm_cd3,
						S0_T1.tterm_rmrks3,
						S0_CST.acst_cd,
						cases()
							.when(S0_CST.ar_dpt_typ.eq(value(MAC_AR_DPT_TYP.SLS.value())))
								.then(S0_T1.sls_dpt_cd)
							.when(S0_CST.ar_dpt_typ.eq(value(MAC_AR_DPT_TYP.AR.value())))
								.then(S0_T1.ar_dpt_cd)
							.otherwise(nullValue()).as("ar_dpt_cd"),
						S0_T1.cst_po_no,
						S0_T1.trd_cur_cd,
						S0_CO.base_cur_cd,
						S0_CO.sls_xrate_cd.as("xrate_cd"),
						cases()
							.when(S0_T1.xrate_inpt_flg.eq(value(true)))
								.then(S0_T1.xrate)
							.otherwise(
								nullValue()
							).as("xrate"),
						S0_CO.ptax_cur_cd,
						cases()
							.when(S0_T1.ptax_xrate_inpt_flg.eq(value(true)))
								.then(S0_T1.ptax_xrate)
							.otherwise(
								nullValue()
							).as("ptax_xrate"),
						S0_T1.trd_rmrks,
						S0_T1.slo_no,
						S0_T1.qtn_no,
						S0_T1.qtn_rev,
						S0_T1.sls_basis_typ
					)
					.from(
						S0_T1
						.crossJoin(S0_CO)
						.leftOuterJoin(S0_CST).on(
							bracket(
								S0_T1.cst_cd.eq(S0_CST.bp_cd)
							)
						)
						.leftOuterJoin(S0_DPT).on(
							bracket(
								S0_T1.sls_dpt_cd.eq(S0_DPT.dpt_cd)
								.and(S0_T1.slo_dt.between(S0_DPT.st_dt, S0_DPT.end_dt))
							)
						)
					)
					.where(
						S0_T1.slo_no.eq(bind("fix_slo_no"))
						.and(S0_T1.can_flg.eq(value(false)))
					)
			)
			.setJoinInfo(
				joinInfo(
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
					})
				)
			);
	}
	
	/**
	 * -- MSLAL5160_MST_SLS_ACT_D_Query_S01
	 */
	static MCQueryPlan MSLAL5160_MST_SLS_ACT_D_S01() {
		MST_SLS_ACT_D_R S0_T1 = MST_SLS_ACT_D_R.create("T1");
		MST_PURC_ACT_D_R S0_T2 = MST_PURC_ACT_D_R.create("T2");
		MST_PURC_ACT_IO_R S0_T3 = MST_PURC_ACT_IO_R.create("T3");
		MST_PURC_ACT_R S0_T4 = MST_PURC_ACT_R.create("T4");
		MST_SLS_ACT_R S1_W = MST_SLS_ACT_R.create("W");
		MST_PURC_ACT_R S2_W = MST_PURC_ACT_R.create("W");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSLAL5160_MST_SLS_ACT_D_Query_S01")
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
						S0_T1.ext_purc_act_d_no.eq(bind("ext_purc_act_d_no"))
						.and(S0_T1.ext_sys_cd.eq(bind("ext_sys_cd")))
						.and(
							S0_T1.sls_act_d_seq.eq(subQuery()
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
	 * -- MSLAL5160_MST_SLS_SCHD_Query_S01
	 */
	static MCQueryPlan MSLAL5160_MST_SLS_SCHD_S01() {
		MST_SLS_SCHD_R S0_T1 = MST_SLS_SCHD_R.create("T1");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSLAL5160_MST_SLS_SCHD_Query_S01")
					.mainQuery()
					.selectDistinct(
						S0_T1.sls_schd_no,
						S0_T1.ship_schd_no
					)
					.from(S0_T1)
					.where(
						value(0).eq(value(0))
						.and(S0_T1.dlv_slip_d_no.eq(bind("dlv_slip_d_no")))
					)
			);
	}
	
	/**
	 * -- MSLAL5160_MST_SLS_SCHD_Query_S02
	 */
	static MCQueryPlan MSLAL5160_MST_SLS_SCHD_S02() {
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
				sql("MSLAL5160_MST_SLS_SCHD_Query_S02")
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
	 * -- MSLAL5160_MST_SLS_SCHD_Query_S03
	 */
	static MCQueryPlan MSLAL5160_MST_SLS_SCHD_S03() {
		MST_SLS_SCHD_R S0_T1 = MST_SLS_SCHD_R.create("T1");
		MSW_SLS_SCHD_KEY_R S0_W = MSW_SLS_SCHD_KEY_R.create("W");
		MST_PO_SCHD_R S0_T2 = MST_PO_SCHD_R.create("T2");
		MST_PO_R S0_T3 = MST_PO_R.create("T3");
		MAM_CO_R S0_CO = MAM_CO_R.create("CO");
		MST_PURC_SCHD_R S0_T4 = MST_PURC_SCHD_R.create("T4");
		MST_ARR_SCHD_R S0_T5 = MST_ARR_SCHD_R.create("T5");
		MST_RCPT_IV_R S0_RCPT = MST_RCPT_IV_R.create("RCPT");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSLAL5160_MST_SLS_SCHD_Query_S03")
					.mainQuery()
					.select(
						S0_T1.sls_schd_no,
						S0_T1.slo_d_no,
						S0_T1.sls_schd_dt,
						S0_T3.trd_cd,
						S0_T3.trd_ptn_typ,
						S0_T3.po_no,
						S0_T3.purc_dpt_cd,
						S0_T3.purc_usr_cd,
						S0_T3.wg_cd,
						S0_T3.sppl_cd,
						S0_T3.trd_cur_cd,
						S0_T3.trd_rmrks,
						S0_T3.intr_rmrks,
						S0_T3.tterm_cd1,
						S0_T3.tterm_rmrks1,
						S0_T3.tterm_cd2,
						S0_T3.tterm_rmrks2,
						S0_T3.tterm_cd3,
						S0_T3.tterm_rmrks3,
						S0_T3.sub_char1,
						S0_T3.sub_char2,
						S0_T3.sub_char3,
						S0_T5.rcpt_iv_no,
						S0_RCPT.pay_basis_dt,
						S0_RCPT.pay_schd_dt,
						S0_RCPT.rcpt_iv_mng_no,
						cases()
							.when(S0_T5.rcpt_iv_no.isNull())
								.then(
									cases()
										.when(S0_T3.xrate_inpt_flg.eq(value(true)))
											.then(S0_T3.xrate)
									.otherwise(
										MAPA_XCHNG$F_GET_PURC_XRATE(
											S0_T3.trd_cur_cd,
											bind("today")
										)
									)
								)
							.otherwise(
								cases()
									.when(S0_RCPT.xrate_inpt_flg.eq(value(true)))
										.then(S0_RCPT.xrate)
									.otherwise(
										MAPA_XCHNG$F_GET_PURC_XRATE(
											S0_T3.trd_cur_cd,
											bind("today")
										)
									)
							).as("xrate"),
						cases()
							.when(S0_T5.rcpt_iv_no.isNull())
								.then(
									cases()
										.when(S0_T3.ptax_xrate_inpt_flg.eq(value(true)))
											.then(S0_T3.ptax_xrate)
									.otherwise(
										cases()
											.when(S0_CO.ptax_cur_cd.isNotNull())
												.then(
														MAPA_XCHNG$F_GET_XRATE(
															S0_T3.trd_cur_cd,
															S0_CO.ptax_cur_cd,
															S0_CO.purc_xrate_cd,
															bind("today")
														)
												)
											.otherwise(
												nullValue()
											)
									)
								)
							.otherwise(
								cases()
									.when(S0_RCPT.ptax_xrate_inpt_flg.eq(value(true)))
										.then(S0_RCPT.ptax_xrate)
									.otherwise(
										cases()
											.when(S0_CO.ptax_cur_cd.isNotNull())
												.then(
														MAPA_XCHNG$F_GET_XRATE(
															S0_T3.trd_cur_cd,
															S0_CO.ptax_cur_cd,
															S0_CO.purc_xrate_cd,
															bind("today")
														)
												)
											.otherwise(
												nullValue()
											)
									)
							).as("ptax_xrate")
					)
					.from(
						S0_T1
						.innerJoin(S0_W).on(
							bracket(
								S0_T1.sls_schd_no.eq(S0_W.sls_schd_no)
							)
						)
						.innerJoin(S0_T2).on(
							bracket(
								S0_T1.po_schd_no.eq(S0_T2.po_schd_no)
							)
						)
						.innerJoin(S0_T3).on(
							bracket(
								S0_T2.po_no.eq(S0_T3.po_no)
							)
						)
						.crossJoin(S0_CO)
						.innerJoin(S0_T4).on(
							bracket(
								S0_T1.purc_schd_no.eq(S0_T4.purc_schd_no)
							)
						)
						.innerJoin(S0_T5).on(
							bracket(
								S0_T4.arr_schd_no.eq(S0_T5.arr_schd_no)
							)
						)
						.leftOuterJoin(S0_RCPT).on(
							bracket(
								S0_T5.rcpt_iv_no.eq(S0_RCPT.rcpt_iv_no)
							)
						)
					)
			)
			.setJoinInfo(
				joinInfo(
					j -> j
						.add(MAM_BP_R.class, r -> toCondition(
							r.getStringNE("sppl_cd")
						))
						.addSelect(m -> toArray(
							m.pay_spot_flg,
							m.sppl_iv_flg,
							m.subcon_flg
						))
						.addMap((r, m) -> {
							r.setBooleanNE("subcon_flg", m.subcon_flg());
							r.setBooleanNE("sppl_iv_flg", m.sppl_iv_flg());
							r.setBooleanNE("pay_spot_flg", m.pay_spot_flg());
					})
				)
			);
	}
}