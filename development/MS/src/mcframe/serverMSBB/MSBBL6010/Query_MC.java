package mcframe.serverMSBB.MSBBL6010;

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
	 * -- MSBBL6010_MST_DLV_SLIP_D_Query_S1
	 */
	static MCQueryPlan MSBBL6010_MST_DLV_SLIP_D_S1() {
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
				sql("MSBBL6010_MST_DLV_SLIP_D_Query_S1")
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
								S0_CST.bill_crryovr_times
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
	 * -- MSBBL6010_MST_DLV_SLIP_D_Query_S2
	 */
	static MCQueryPlan MSBBL6010_MST_DLV_SLIP_D_S2() {
		MST_DLV_SLIP_R S0_T1 = MST_DLV_SLIP_R.create("T1");
		MST_DLV_SLIP_D_R S0_T2 = MST_DLV_SLIP_D_R.create("T2");
		MST_SLS_ACT_D_R S0_T3 = MST_SLS_ACT_D_R.create("T3");
		MST_SLS_ACT_D_R S1_W = MST_SLS_ACT_D_R.create("W");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBBL6010_MST_DLV_SLIP_D_Query_S2")
					.mainQuery()
					.select(
						S0_T3.sls_act_no,
						S0_T3.sls_act_d_no,
						S0_T3.sls_act_d_seq,
						S0_T2.dlv_slip_d_no
					)
					.from(
						S0_T1
						.innerJoin(S0_T2).on(
							bracket(
								S0_T1.dlv_slip_no.eq(S0_T2.dlv_slip_no)
								.and(S0_T1.dlv_slip_seq.eq(S0_T2.dlv_slip_seq))
							)
						)
						.leftOuterJoin(S0_T3).on(
							bracket(
								S0_T2.dlv_slip_d_no.eq(S0_T3.dlv_slip_d_no)
								.and(
									S0_T3.sls_act_d_seq.eq(subQuery()
										.select(max(S1_W.sls_act_d_seq))
										.from(S1_W)
										.where(
											S1_W.dlv_slip_d_no.eq(S0_T2.dlv_slip_d_no)
										)
									)
								)
							)
						)
					)
					.where(
						S0_T1.dlv_slip_no.eq(bind("dlv_slip_no"))
						.and(S0_T1.dlv_slip_seq.eq(bind("dlv_slip_seq")))
					)
			);
	}
	
	/**
	 * -- MSBBL6010_MST_DLV_SLIP_Query_S1
	 */
	static MCQueryPlan MSBBL6010_MST_DLV_SLIP_S1() {
		MST_DLV_SLIP_R S0_T1 = MST_DLV_SLIP_R.create("T1");
		MAM_CO_R S0_CO = MAM_CO_R.create("CO");
		MST_SLO_R S0_T2 = MST_SLO_R.create("T2");
		MST_SLS_ACT_R S0_T3 = MST_SLS_ACT_R.create("T3");
		MAM_BP_R S0_CST = MAM_BP_R.create("CST");
		MAM_DPT_R S0_DPT = MAM_DPT_R.create("DPT");
		MST_DLV_SLIP_R S1_W = MST_DLV_SLIP_R.create("W");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBBL6010_MST_DLV_SLIP_Query_S1")
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
							.then(
								decode(	
									S0_T1.slo_no,
									nullValue(),
									S0_T1.dpt_cd,
									S0_T2.ar_dpt_cd
								)
							)
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
						S0_T3.sls_act_no,
						S0_T3.sls_act_seq,
						S0_T3.sls_act_rev,
						S0_T1.dlv_slip_no,
						S0_T1.dlv_slip_seq,
						S0_T1.dlv_slip_rev,
						S0_T1.slip_prnt_flg
					)
					.from(
						S0_T1
						.crossJoin(S0_CO)
						.leftOuterJoin(S0_T2).on(
							bracket(
								S0_T1.slo_no.eq(S0_T2.slo_no)
							)
						)
						.leftOuterJoin(S0_T3).on(
							bracket(
								S0_T1.dlv_slip_no.eq(S0_T3.dlv_slip_no)
								.and(S0_T3.slip_sts_typ.eq(value(MAC_SLIP_STS_TYP.CRT.value())))
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
						S0_T1.dlv_slip_no.eq(bind("dlv_slip_no"))
						.and(
							S0_T1.dlv_slip_seq.eq(subQuery()
								.select(max(S1_W.dlv_slip_seq))
								.from(S1_W)
								.where(
									S1_W.dlv_slip_no.eq(bind("dlv_slip_no"))
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
	 * -- MSBBL6010_MST_DLV_SLIP_Query_S2
	 */
	static MCQueryPlan MSBBL6010_MST_DLV_SLIP_S2() {
		MST_DLV_SLIP_R S0_T1 = MST_DLV_SLIP_R.create("T1");
		MAM_CO_R S0_CO = MAM_CO_R.create("CO");
		MST_SLS_ACT_R S0_T2 = MST_SLS_ACT_R.create("T2");
		MST_DLV_SLIP_R S1_W = MST_DLV_SLIP_R.create("W");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBBL6010_MST_DLV_SLIP_Query_S2")
					.mainQuery()
					.select(
						S0_T1.trd_cd,
						S0_T1.trd_ptn_typ,
						S0_T1.ac_dt.as("can_ac_dt"),
						S0_T2.sls_act_no,
						S0_T2.sls_act_seq,
						S0_T2.sls_act_rev,
						S0_T1.dlv_slip_no,
						S0_T1.dlv_slip_seq,
						S0_T1.slip_prnt_flg
					)
					.from(
						S0_T1
						.crossJoin(S0_CO)
						.leftOuterJoin(S0_T2).on(
							bracket(
								S0_T1.dlv_slip_no.eq(S0_T2.dlv_slip_no)
								.and(S0_T2.slip_sts_typ.eq(value(MAC_SLIP_STS_TYP.CRT.value())))
							)
						)
					)
					.where(
						S0_T1.dlv_slip_no.eq(bind("dlv_slip_no"))
						.and(
							S0_T1.dlv_slip_seq.eq(subQuery()
								.select(max(S1_W.dlv_slip_seq))
								.from(S1_W)
								.where(
									S1_W.dlv_slip_no.eq(bind("dlv_slip_no"))
								)
							)
						)
					)
			);
	}
	
	/**
	 * -- MSBBL6010_MST_DLV_SLIP_Query_S3
	 */
	static MCQueryPlan MSBBL6010_MST_DLV_SLIP_S3() {
		MST_SLS_SCHD_R S0_T1 = MST_SLS_SCHD_R.create("T1");
		MST_DLV_SLIP_D_R S0_T2 = MST_DLV_SLIP_D_R.create("T2");
		MST_DLV_SLIP_R S0_T3 = MST_DLV_SLIP_R.create("T3");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBBL6010_MST_DLV_SLIP_Query_S3")
					.mainQuery()
					.select(S0_T3.dlv_slip_no)
					.from(
						S0_T1
						.innerJoin(S0_T2).on(S0_T2.dlv_slip_d_no.eq(S0_T1.dlv_slip_d_no))
						.innerJoin(S0_T3).on(
							S0_T3.dlv_slip_no.eq(S0_T2.dlv_slip_no)
							.and(S0_T3.dlv_slip_seq.eq(S0_T2.dlv_slip_seq))
						)
					)
					.where(
						S0_T1.sls_schd_no.eq(bind("sls_schd_no"))
						.and(S0_T3.slip_sts_typ.eq(value(MAC_SLIP_STS_TYP.CRT.value())))
					)
			);
	}
	
	/**
	 * -- MSBBL6010_MST_DLV_SLIP_Query_S4
	 */
	static MCQueryPlan MSBBL6010_MST_DLV_SLIP_S4() {
		MST_DLV_SLIP_R S0_T1 = MST_DLV_SLIP_R.create("T1");
		MST_DLV_SLIP_R S0_T2 = MST_DLV_SLIP_R.create("T2");
		MST_DLV_SLIP_R S1_W = MST_DLV_SLIP_R.create("W");
		MST_DLV_SLIP_R S2_W = MST_DLV_SLIP_R.create("W");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBBL6010_MST_DLV_SLIP_Query_S4")
					.mainQuery()
					.select(S0_T2.dlv_slip_no)
					.from(
						S0_T1
						.innerJoin(S0_T2).on(
							S0_T1.dlv_slip_act_no.eq(S0_T2.dlv_slip_act_no)
							.and(S0_T2.slo_no.eq(S0_T1.slo_no))
						)
					)
					.where(
						S0_T1.dlv_slip_no.eq(bind("dlv_slip_no"))
						.and(
							S0_T1.dlv_slip_seq.eq(subQuery()
								.select(max(S1_W.dlv_slip_seq))
								.from(S1_W)
								.where(
									S1_W.dlv_slip_no.eq(bind("dlv_slip_no"))
								)
							)
						)
						.and(S0_T1.trn_typ.eq(value(MSC_TRN_TYP.SHIP.value())))
						.and(S0_T2.trn_typ.eq(value(MSC_TRN_TYP.SLS.value())))
						.and(S0_T2.dlv_slip_no.neq(bind("dlv_slip_no")))
						.and(
							S0_T2.dlv_slip_seq.eq(subQuery()
								.select(max(S2_W.dlv_slip_seq))
								.from(S2_W)
								.where(
									S2_W.dlv_slip_no.eq(S0_T2.dlv_slip_no)
								)
							)
						)
						.and(S0_T2.slip_sts_typ.eq(value(MAC_SLIP_STS_TYP.CRT.value())))
					)
			);
	}
	
	/**
	 * -- MSBBL6010_MST_IV_MAP_Query_S01
	 */
	static MCQueryPlan MSBBL6010_MST_IV_MAP_S01() {
		MST_IV_MAP_R S0_IVM = MST_IV_MAP_R.create("IVM");
		MST_IV_D_R S0_IVD = MST_IV_D_R.create("IVD");
		MST_SLS_SCHD_R S0_SLSS = MST_SLS_SCHD_R.create("SLSS");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBBL6010_MST_IV_MAP_Query_S01")
					.mainQuery()
					.select(S0_IVM.ship_schd_no)
					.from(
						S0_IVM
						.innerJoin(S0_IVD).on(S0_IVD.iv_d_no.eq(S0_IVM.iv_d_no))
						.innerJoin(S0_SLSS).on(S0_SLSS.iv_d_no.eq(S0_IVD.iv_d_no))
					)
					.where(
						value(0).eq(value(0))
						.and(S0_SLSS.sls_schd_no.eq(bind("sls_schd_no")))
					)
			);
	}
	
	/**
	 * -- MSBBL6010_MST_IV_Query_S1
	 */
	static MCQueryPlan MSBBL6010_MST_IV_S1() {
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
				sql("MSBBL6010_MST_IV_Query_S1")
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
						S0_T2.ar_dpt_cd,
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
						S0_T2.itm_nm,
						S0_T2.iv_itm_nm,
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
								S0_CST.bill_crryovr_times
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
						S0_ITM.sno4_mng_typ
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
						S0_T1.iv_no.eq(bind("iv_no"))
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
	 * -- MSBBL6010_MST_IV_Query_S2
	 */
	static MCQueryPlan MSBBL6010_MST_IV_S2() {
		MST_IV_R S0_T1 = MST_IV_R.create("T1");
		MST_IV_D_R S0_T2 = MST_IV_D_R.create("T2");
		MST_SLS_SCHD_R S0_T3 = MST_SLS_SCHD_R.create("T3");
		MST_IV_MAP_R S0_T4 = MST_IV_MAP_R.create("T4");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBBL6010_MST_IV_Query_S2")
					.mainQuery()
					.select(
						S0_T2.trd_cd,
						S0_T1.trd_ptn_typ,
						S0_T4.ship_schd_no,
						S0_T3.sls_schd_no
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
						S0_T1.iv_no.eq(bind("iv_no"))
					)
					.orderBy(S0_T2.disp_seq.asc())
			);
	}
	
	/**
	 * -- MSBBL6010_MST_IV_Query_S3
	 */
	static MCQueryPlan MSBBL6010_MST_IV_S3() {
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
				sql("MSBBL6010_MST_IV_Query_S3")
					.mainQuery()
					.select(
						S0_T2.trd_cd,
						S0_T1.trd_ptn_typ,
						S0_SHIPACT.ac_dt,
						trunc(
							S0_SHIPACT.ship_tm,
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
						S0_T2.ar_dpt_cd,
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
										S0_SHIPACT.ship_tm,
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
											S0_SHIPACT.ship_tm,
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
						S0_T2.itm_nm,
						S0_T2.iv_itm_nm,
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
								S0_SHIPACT.ac_dt,
								S0_DPT.wg_cd,
								S0_CO.gm_std_upri_typ
							),
							S0_T4.cost_upri
						).as("cost_upri"),
						nvl(
							S0_T4.bill_crryovr_times,
							nvl(
								S0_ITM.bill_crryovr_times,
								S0_CST.bill_crryovr_times
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
						S0_SHIPACT.ship_act_no
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
								.and(S0_SHIPACT.ac_dt.between(S0_DPT.st_dt, S0_DPT.end_dt))
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
						S0_T1.iv_no.eq(bind("iv_no"))
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
	 * -- MSBBL6010_MST_IV_Query_S4
	 */
	static MCQueryPlan MSBBL6010_MST_IV_S4() {
		MST_IV_R S0_IV = MST_IV_R.create("IV");
		MAM_CO_R S0_CO = MAM_CO_R.create("CO");
		MST_IV_D_R S0_IVD = MST_IV_D_R.create("IVD");
		MST_SLO_R S0_SLO = MST_SLO_R.create("SLO");
		MST_SLO_D_R S0_SLOD = MST_SLO_D_R.create("SLOD");
		MST_SLS_SCHD_R S0_SLSSCHD = MST_SLS_SCHD_R.create("SLSSCHD");
		MAM_DPT_R S0_DPT = MAM_DPT_R.create("DPT");
		MAM_BP_R S0_CST = MAM_BP_R.create("CST");
		MAM_BP_R S0_ACST = MAM_BP_R.create("ACST");
		MAM_BP_R S0_BCST = MAM_BP_R.create("BCST");
		MAM_ITM_R S0_ITM = MAM_ITM_R.create("ITM");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBBL6010_MST_IV_Query_S4")
					.mainQuery()
					.select(
						S0_IVD.trd_cd,
						S0_IV.trd_ptn_typ,
						bind("ac_dt").as("ac_dt"),
						bind("ship_dt").as("sls_dt"),
						S0_IVD.sls_dpt_cd,
						S0_DPT.wg_cd,
						S0_IVD.sls_usr_cd,
						S0_IV.eta_dt,
						S0_IV.ship_rqst_id_cd.as("cst_cd"),
						S0_IV.iv_no,
						S0_IV.rcpt_iv_mng_no,
						S0_IV.rcpt_iv_no,
						S0_IV.tterm_cd1,
						S0_IV.tterm_rmrks1,
						S0_IV.tterm_cd2,
						S0_IV.tterm_rmrks2,
						S0_IV.tterm_cd3,
						S0_IV.tterm_rmrks3,
						S0_IV.lc_no,
						S0_IV.lc_dt,
						S0_IV.lc_rmrks,
						S0_IV.rcv_schd_dt,
						nvl(
							S0_IV.bill_basis_dt,
							S0_IV.rcv_schd_dt
						).as("bill_basis_dt"),
						S0_BCST.ar_cred_cd.as("cred_cd"),
						S0_ACST.bcst_cd,
						S0_CST.acst_cd,
						S0_IVD.ar_dpt_cd,
						S0_IVD.cst_po_no,
						S0_IV.trd_cur_cd,
						S0_CO.base_cur_cd,
						S0_CO.sls_xrate_cd.as("xrate_cd"),
						cases()
							.when(S0_IV.xrate_inpt_flg.eq(value(true)))
								.then(S0_IV.xrate)
							.otherwise(
								MAPA_XCHNG$F_GET_SLS_XRATE(
									S0_IV.trd_cur_cd,
									bind("ship_dt")
								)
							).as("xrate"),
						S0_CO.ptax_cur_cd,
						cases()
							.when(S0_IV.ptax_xrate_inpt_flg.eq(value(true)))
								.then(S0_IV.ptax_xrate)
							.when(S0_CO.ptax_cur_cd.isNotNull())
								.then(
									MAPA_XCHNG$F_GET_XRATE(
										S0_IV.trd_cur_cd,
										nvl(
											S0_CO.ptax_cur_cd,
											S0_CO.base_cur_cd
										),
										S0_CO.sls_xrate_cd,
										bind("ship_dt")
									)
							)
							.otherwise(nullValue()).as("ptax_xrate"),
						S0_IVD.trd_rmrks,
						S0_IVD.slo_no,
						S0_SLO.qtn_no,
						S0_SLO.qtn_rev,
						S0_IV.dlv_id_cd.as("dlv_cd"),
						S0_IV.dlv_sundry_flg,
						S0_IV.dlv_id_nm.as("dlv_nm"),
						S0_IV.dlv_zip_cd,
						S0_IV.dlv_addr1,
						S0_IV.dlv_addr2,
						S0_IV.dlv_addr3,
						S0_IV.dlv_addr4,
						S0_IV.dlv_cntct_dpt,
						S0_IV.dlv_cntct_psn,
						S0_IV.dlv_tel,
						S0_IV.dlv_fax,
						S0_SLOD.dest_cd1,
						S0_SLOD.dest_cd2,
						S0_SLOD.dest_cd3,
						S0_IVD.itm_cd,
						S0_IVD.itm_sub1,
						S0_IVD.itm_sub2,
						S0_IVD.itm_sub3,
						S0_IVD.itm_nm,
						S0_IVD.iv_itm_nm,
						S0_IVD.cntry_org_cd,
						nvl(
							S0_IVD.sno1,
							value(MAC_STR.NULL_VAL.value())
						).as("sno1"),
						nvl(
							S0_IVD.sno2,
							value(MAC_STR.NULL_VAL.value())
						).as("sno2"),
						nvl(
							S0_IVD.sno3,
							value(MAC_STR.NULL_VAL.value())
						).as("sno3"),
						nvl(
							S0_IVD.sno4,
							value(MAC_STR.NULL_VAL.value())
						).as("sno4"),
						S0_IVD.trd_unit_cd,
						S0_IVD.trd_unit_qty,
						S0_IVD.base_unit_cd,
						S0_IVD.base_unit_qty,
						S0_IVD.trd_cur_upri,
						S0_IVD.interim_flg,
						decode(
							S0_IVD.slo_d_no,
							nullValue(),
							MAPA_STD_COST$F_GET_STD_UPRI(
								S0_IVD.itm_cd,
								S0_IVD.itm_sub1,
								S0_IVD.itm_sub2,
								S0_IVD.itm_sub3,
								bind("ac_dt"),
								S0_DPT.wg_cd,
								S0_CO.gm_std_upri_typ
							),
							S0_SLOD.cost_upri
						).as("cost_upri"),
						nvl(
							S0_SLOD.bill_crryovr_times,
							nvl(
								S0_ITM.bill_crryovr_times,
								S0_CST.bill_crryovr_times
							)
						).as("bill_crryovr_times"),
						S0_IVD.sundry_itm_flg,
						S0_ITM.itm_jnl_cd,
						S0_IVD.cst_po_d_no,
						S0_IVD.cst_itm_cd,
						S0_IVD.cst_itm_nm,
						S0_IVD.trd_d_rmrks,
						S0_IVD.wtax_rate,
						S0_IVD.rsn_cd,
						S0_IVD.bd_dpt_cd,
						S0_IVD.slo_d_no,
						S0_SLSSCHD.sls_schd_no,
						S0_SLOD.qtn_d_no,
						S0_IVD.iv_d_no,
						S0_IVD.trd_cur_dscnt_amt,
						S0_IVD.dscnt_rsn_cd,
						S0_IV.via_dlv_typ,
						S0_IVD.tax_cd,
						S0_ITM.sno1_mng_typ,
						S0_ITM.sno2_mng_typ,
						S0_ITM.sno3_mng_typ,
						S0_ITM.sno4_mng_typ
					)
					.from(
						S0_IV
						.crossJoin(S0_CO)
						.leftOuterJoin(S0_IVD).on(
							bracket(
								S0_IV.iv_mng_no.eq(S0_IVD.iv_mng_no)
							)
						)
						.leftOuterJoin(S0_SLO).on(
							bracket(
								S0_IVD.slo_no.eq(S0_SLO.slo_no)
							)
						)
						.leftOuterJoin(S0_SLOD).on(
							bracket(
								S0_IVD.slo_d_no.eq(S0_SLOD.slo_d_no)
							)
						)
						.leftOuterJoin(S0_SLSSCHD).on(
							bracket(
								S0_IV.iv_no.eq(S0_SLSSCHD.iv_no)
								.and(S0_IVD.iv_d_no.eq(S0_SLSSCHD.iv_d_no))
							)
						)
						.leftOuterJoin(S0_DPT).on(
							bracket(
								S0_IVD.sls_dpt_cd.eq(S0_DPT.dpt_cd)
								.and(bind("ac_dt").between(S0_DPT.st_dt, S0_DPT.end_dt))
							)
						)
						.leftOuterJoin(S0_CST).on(
							bracket(
								S0_IV.ship_rqst_id_cd.eq(S0_CST.bp_cd)
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
								S0_IVD.itm_cd.eq(S0_ITM.itm_cd)
								.and(S0_IVD.itm_sub1.eq(S0_ITM.itm_sub1))
								.and(S0_IVD.itm_sub2.eq(S0_ITM.itm_sub2))
								.and(S0_IVD.itm_sub3.eq(S0_ITM.itm_sub3))
							)
						)
					)
					.where(
						S0_IV.iv_no.eq(bind("iv_no"))
					)
					.orderBy(S0_IVD.disp_seq.asc())
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
	 * -- MSBBL6010_MST_IV_SHIP_ACT_D_Query_S1
	 */
	static MCQueryPlan MSBBL6010_MST_IV_SHIP_ACT_D_S1() {
		MST_IV_SHIP_ACT_D_R S0_T1 = MST_IV_SHIP_ACT_D_R.create("T1");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBBL6010_MST_IV_SHIP_ACT_D_Query_S1")
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
	 * -- MSBBL6010_MST_SHIP_ACT_D_Query_S1
	 */
	static MCQueryPlan MSBBL6010_MST_SHIP_ACT_D_S1() {
		MST_SHIP_ACT_D_R S0_T1 = MST_SHIP_ACT_D_R.create("T1");
		MST_SLS_ACT_IO_R S0_T2 = MST_SLS_ACT_IO_R.create("T2");
		MST_SHIP_ACT_R S0_T3 = MST_SHIP_ACT_R.create("T3");
		MAVM_ITM_UNIT_R S0_M2 = MAVM_ITM_UNIT_R.create("M2");
		MST_SLS_ACT_IO_R S1_W = MST_SLS_ACT_IO_R.create("W");
		
		// マスタデータの副問い合わせ
		// MAVM_ITM_UNIT_R(S0_M2)
		MCSubQuery S0_M2_pack_flg = subQuery().select(S0_M2.pack_flg).from(S0_M2).where(
				bracket(
						S0_T1.itm_cd.eq(S0_M2.itm_cd)
						.and(S0_T1.itm_sub1.eq(S0_M2.itm_sub1))
						.and(S0_T1.itm_sub2.eq(S0_M2.itm_sub2))
						.and(S0_T1.itm_sub3.eq(S0_M2.itm_sub3))
						.and(S0_T1.trd_unit_cd.eq(S0_M2.unit_cd))
						)
				);
		
		return createQueryPlan()
			.setQuery(
				sql("MSBBL6010_MST_SHIP_ACT_D_Query_S1")
					.mainQuery()
					.select(
						S0_T2.sls_act_io_no,
						S0_T2.sls_act_io_seq,
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
							.when(S0_M2_pack_flg.eq(value(true)))
								.then(S0_T1.trd_unit_cd)
							.when(S0_M2_pack_flg.eq(value(false)))
								.then(S0_T1.base_unit_cd)
							.otherwise(nullValue()).as("pack_unit_cd"),
						cases()
							.when(S0_M2_pack_flg.eq(value(true)))
								.then(S0_T1.trd_unit_qty)
							.when(S0_M2_pack_flg.eq(value(false)))
								.then(S0_T1.base_unit_qty)
							.otherwise(nullValue()).as("pack_unit_qty")
					)
					.from(
						S0_T1
						.leftOuterJoin(S0_T2).on(
							bracket(
								S0_T1.ship_act_d_no.eq(S0_T2.ship_act_d_no)
								.and(
									S0_T2.sls_act_io_seq.eq(subQuery()
										.select(max(S1_W.sls_act_io_seq))
										.from(S1_W)
										.where(
											S1_W.ship_act_d_no.eq(S0_T1.ship_act_d_no)
										)
									)
								)
							)
						)
						.innerJoin(S0_T3).on(
							bracket(
								S0_T1.ship_act_no.eq(S0_T3.ship_act_no)
								.and(S0_T3.can_flg.eq(value(false)))
							)
						)
					)
					.where(
						S0_T1.dlv_slip_d_no.eq(bind("dlv_slip_d_no"))
					)
					.orderBy(S0_T1.disp_seq.asc())
			);
	}
	
	/**
	 * -- MSBBL6010_MST_SHIP_ACT_D_Query_S2
	 */
	static MCQueryPlan MSBBL6010_MST_SHIP_ACT_D_S2() {
		MST_SHIP_ACT_D_R S0_T1 = MST_SHIP_ACT_D_R.create("T1");
		MST_SLS_ACT_IO_R S0_T2 = MST_SLS_ACT_IO_R.create("T2");
		MST_SLS_ACT_IO_R S1_W = MST_SLS_ACT_IO_R.create("W");
		MST_SHIP_ACT_D_R S2_W = MST_SHIP_ACT_D_R.create("W");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBBL6010_MST_SHIP_ACT_D_Query_S2")
					.mainQuery()
					.select(
						S0_T2.sls_act_io_no,
						S0_T2.sls_act_io_seq
					)
					.from(
						S0_T1
						.leftOuterJoin(S0_T2).on(
							bracket(
								S0_T1.ship_act_d_no.eq(S0_T2.ship_act_d_no)
								.and(
									S0_T2.sls_act_io_seq.eq(subQuery()
										.select(max(S1_W.sls_act_io_seq))
										.from(S1_W)
										.where(
											S1_W.ship_act_d_no.eq(S0_T1.ship_act_d_no)
										)
									)
								)
							)
						)
					)
					.where(
						S0_T1.dlv_slip_d_no.eq(bind("dlv_slip_d_no"))
						.and(S0_T1.can_flg.eq(value(false)))
						.and(
							S0_T1.ship_act_no.eq(subQuery()
								.select(max(S2_W.ship_act_no))
								.from(S2_W)
								.where(
									S2_W.dlv_slip_d_no.eq(S0_T1.dlv_slip_d_no)
									.and(S2_W.can_flg.eq(value(false)))
								)
							)
						)
					)
					.orderBy(S0_T1.disp_seq.asc())
			);
	}
	
	/**
	 * -- MSBBL6010_MST_SHIP_ACT_D_Query_S3
	 */
	static MCQueryPlan MSBBL6010_MST_SHIP_ACT_D_S3() {
		MST_SHIP_ACT_D_R S0_T1 = MST_SHIP_ACT_D_R.create("T1");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBBL6010_MST_SHIP_ACT_D_Query_S3")
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
	 * -- MSBBL6010_MST_SHIP_ACT_D_Query_S4
	 */
	static MCQueryPlan MSBBL6010_MST_SHIP_ACT_D_S4() {
		MST_SHIP_ACT_D_R S0_T1 = MST_SHIP_ACT_D_R.create("T1");
		MST_SHIP_ALLOC_STS_R S0_T2 = MST_SHIP_ALLOC_STS_R.create("T2");
		MST_SHIP_ACT_D_R S1_W = MST_SHIP_ACT_D_R.create("W");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBBL6010_MST_SHIP_ACT_D_Query_S4")
					.mainQuery()
					.select(S0_T2.ship_schd_no)
					.from(
						S0_T1
						.innerJoin(S0_T2).on(S0_T1.ship_alloc_sts_no.eq(S0_T2.ship_alloc_sts_no))
					)
					.where(
						value(0).eq(value(0))
						.and(S0_T1.dlv_slip_d_no.eq(bind("dlv_slip_d_no")))
						.and(
							S0_T1.ship_act_no.eq(subQuery()
								.select(max(S1_W.ship_act_no))
								.from(S1_W)
								.where(
									S1_W.dlv_slip_d_no.eq(S0_T1.dlv_slip_d_no)
								)
							)
						)
					)
			);
	}
	
	/**
	 * -- MSBBL6010_MST_SHIP_ACT_D_Query_S5
	 */
	static MCQueryPlan MSBBL6010_MST_SHIP_ACT_D_S5() {
		MST_SHIP_ACT_D_R S0_T1 = MST_SHIP_ACT_D_R.create("T1");
		MST_SHIP_ALLOC_STS_R S0_T2 = MST_SHIP_ALLOC_STS_R.create("T2");
		MST_SLS_SCHD_R S0_T3 = MST_SLS_SCHD_R.create("T3");
		MST_SHIP_SCHD_R S0_T4 = MST_SHIP_SCHD_R.create("T4");
		MST_SHIP_ACT_D_R S1_W = MST_SHIP_ACT_D_R.create("W");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBBL6010_MST_SHIP_ACT_D_Query_S5")
					.mainQuery()
					.select(
						value(MAC_DATA_CRUD_TYP.UPD.value()).as("data_crud_typ"),
						S0_T3.sls_schd_no,
						S0_T1.base_unit_qty.as("base_unit_sls_qty"),
						S0_T4.abort_flg
					)
					.from(
						S0_T1
						.innerJoin(S0_T2).on(S0_T1.ship_alloc_sts_no.eq(S0_T2.ship_alloc_sts_no))
						.innerJoin(S0_T3).on(
							S0_T3.ship_schd_no.eq(S0_T2.ship_schd_no)
							.and(S0_T3.dlv_slip_d_no.eq(S0_T1.dlv_slip_d_no))
						)
						.innerJoin(S0_T4).on(S0_T4.ship_schd_no.eq(S0_T3.ship_schd_no))
					)
					.where(
						value(0).eq(value(0))
						.and(S0_T1.dlv_slip_d_no.eq(bind("dlv_slip_d_no")))
						.and(S0_T1.can_flg.eq(value(false)))
						.and(
							S0_T1.ship_act_no.eq(subQuery()
								.select(max(S1_W.ship_act_no))
								.from(S1_W)
								.where(
									S1_W.dlv_slip_d_no.eq(S0_T1.dlv_slip_d_no)
									.and(S1_W.can_flg.eq(value(false)))
								)
							)
						)
					)
			);
	}
	
	/**
	 * -- MSBBL6010_MST_SHIP_ACT_D_Query_S6
	 */
	static MCQueryPlan MSBBL6010_MST_SHIP_ACT_D_S6() {
		MST_SHIP_ACT_D_R S0_T1 = MST_SHIP_ACT_D_R.create("T1");
		MST_SHIP_ALLOC_STS_R S0_T2 = MST_SHIP_ALLOC_STS_R.create("T2");
		MST_SHIP_ACT_D_R S1_W = MST_SHIP_ACT_D_R.create("W");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBBL6010_MST_SHIP_ACT_D_Query_S6")
					.mainQuery()
					.select(S0_T2.ship_schd_no)
					.from(
						S0_T1
						.innerJoin(S0_T2).on(S0_T2.ship_alloc_sts_no.eq(S0_T1.ship_alloc_sts_no))
					)
					.where(
						value(0).eq(value(0))
						.and(S0_T1.dlv_slip_d_no.eq(bind("dlv_slip_d_no")))
						.and(S0_T1.can_flg.eq(value(false)))
						.and(
							S0_T1.ship_act_no.eq(subQuery()
								.select(max(S1_W.ship_act_no))
								.from(S1_W)
								.where(
									S1_W.dlv_slip_d_no.eq(S0_T1.dlv_slip_d_no)
									.and(S1_W.can_flg.eq(value(false)))
								)
							)
						)
					)
			);
	}
	
	/**
	 * -- MSBBL6010_MST_SHIP_ACT_D_Query_S7
	 */
	static MCQueryPlan MSBBL6010_MST_SHIP_ACT_D_S7() {
		MST_SHIP_ACT_D_R S0_SHIPACTD = MST_SHIP_ACT_D_R.create("SHIPACTD");
		MST_IV_SHIP_ACT_MAP_R S0_IVSHIPACTMAP = MST_IV_SHIP_ACT_MAP_R.create("IVSHIPACTMAP");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBBL6010_MST_SHIP_ACT_D_Query_S7")
					.mainQuery()
					.select(
						S0_SHIPACTD.ship_act_d_no,
						S0_SHIPACTD.sno1,
						S0_SHIPACTD.sno2,
						S0_SHIPACTD.sno3,
						S0_SHIPACTD.sno4,
						S0_SHIPACTD.gd_cd,
						S0_SHIPACTD.ship_loc_cd.as("loc_cd"),
						S0_SHIPACTD.ship_str_ln_cd.as("str_ln_cd"),
						S0_SHIPACTD.lot_no,
						S0_SHIPACTD.sublot_no,
						S0_SHIPACTD.trd_unit_cd,
						S0_SHIPACTD.trd_unit_qty,
						S0_SHIPACTD.base_unit_cd,
						S0_SHIPACTD.base_unit_qty,
						S0_SHIPACTD.pack_unit_cd,
						S0_SHIPACTD.pack_unit_qty,
						S0_SHIPACTD.stk_mng_typ
					)
					.from(
						S0_SHIPACTD
						.innerJoin(S0_IVSHIPACTMAP).on(S0_SHIPACTD.ship_act_d_no.eq(S0_IVSHIPACTMAP.ship_act_d_no))
					)
					.where(
						S0_SHIPACTD.ship_alloc_sts_no.eq(bind("ship_alloc_sts_no"))
						.and(S0_IVSHIPACTMAP.iv_d_no.eq(bind("iv_d_no")))
						.and(S0_SHIPACTD.can_flg.eq(value(false)))
					)
					.orderBy(S0_SHIPACTD.disp_seq.asc())
			);
	}
	
	/**
	 * -- MSBBL6010_MST_SHIP_ALLOC_STS_Query_S1
	 */
	static MCQueryPlan MSBBL6010_MST_SHIP_ALLOC_STS_S1() {
		MST_SHIP_ALLOC_STS_R S0_T1 = MST_SHIP_ALLOC_STS_R.create("T1");
		MST_SHIP_SCHD_R S0_T2 = MST_SHIP_SCHD_R.create("T2");
		MST_SHIP_PR_R S0_T3 = MST_SHIP_PR_R.create("T3");
		MST_SLO_D_R S0_T4 = MST_SLO_D_R.create("T4");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBBL6010_MST_SHIP_ALLOC_STS_Query_S1")
					.mainQuery()
					.select(
						decode(
							S0_T3.alloc_scope_typ,
							value(MAC_ALLOC_SCOPE_TYP.LOC.value()),
							S0_T1.ship_loc_cd,
							nullValue()
						).as("stk_loc_cd"),
						decode(
							S0_T3.alloc_scope_typ,
							value(MAC_ALLOC_SCOPE_TYP.LOC.value()),
							S0_T1.ship_str_ln_cd,
							nullValue()
						).as("stk_str_ln_cd"),
						S0_T2.ship_fr_lg_grp_cd.as("stk_lg_grp_cd"),
						S0_T1.quality_typ,
						S0_T1.stk_insp_typ,
						value(MSC_STK_ID_TYP.COSTK.value()).as("stk_id_typ"),
						value(MAC_STR.NULL_VAL.value()).as("stk_arrv_bp_cd"),
						value(MAC_STR.NULL_VAL.value()).as("stk_bp_cd"),
						S0_T1.sno1,
						S0_T1.sno2,
						S0_T1.sno3,
						S0_T1.sno4,
						S0_T1.pack_unit_cd,
						sum(S0_T1.pack_unit_qty).as("pack_unit_qty"),
						S0_T1.base_unit_cd,
						sum(S0_T1.base_unit_qty).as("base_unit_qty"),
						S0_T2.vld_dt_fr,
						S0_T2.vld_dt_to,
						value(true).as("alloc_flg"),
						S0_T3.alloc_scope_typ,
						S0_T4.gd_cd,
						S0_T4.lot_no,
						S0_T4.sublot_no,
						S0_T4.ver_no
					)
					.from(
						S0_T1
						.leftOuterJoin(S0_T2).on(
							bracket(
								S0_T1.ship_schd_no.eq(S0_T2.ship_schd_no)
							)
						)
						.leftOuterJoin(S0_T3).on(
							bracket(
								S0_T2.ship_pr_no.eq(S0_T3.ship_pr_no)
							)
						)
						.leftOuterJoin(S0_T4).on(
							bracket(
								S0_T3.slo_d_no.eq(S0_T4.slo_d_no)
							)
						)
					)
					.where(
						S0_T1.ship_schd_no.eq(bind("ship_schd_no"))
					)
					.groupBy(
						decode(
							S0_T3.alloc_scope_typ,
							value(MAC_ALLOC_SCOPE_TYP.LOC.value()),
							S0_T1.ship_loc_cd,
							nullValue()
						),
						decode(
							S0_T3.alloc_scope_typ,
							value(MAC_ALLOC_SCOPE_TYP.LOC.value()),
							S0_T1.ship_str_ln_cd,
							nullValue()
						),
						S0_T2.ship_fr_lg_grp_cd,
						S0_T1.quality_typ,
						S0_T1.stk_insp_typ,
						S0_T1.sno1,
						S0_T1.sno2,
						S0_T1.sno3,
						S0_T1.sno4,
						S0_T1.trd_unit_cd,
						S0_T1.base_unit_cd,
						S0_T1.pack_unit_cd,
						S0_T1.ent_unit_cd,
						S0_T2.vld_dt_fr,
						S0_T2.vld_dt_to,
						S0_T3.alloc_scope_typ,
						S0_T4.gd_cd,
						S0_T4.lot_no,
						S0_T4.sublot_no,
						S0_T4.ver_no
					)
			);
	}
	
	/**
	 * -- MSBBL6010_MST_SHIP_PR_Query_S1
	 */
	static MCQueryPlan MSBBL6010_MST_SHIP_PR_S1() {
		MST_SHIP_SCHD_R S0_T1 = MST_SHIP_SCHD_R.create("T1");
		MST_IV_MAP_R S0_T3 = MST_IV_MAP_R.create("T3");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBBL6010_MST_SHIP_PR_Query_S1")
					.mainQuery()
					.select(
						S0_T1.ship_pr_no.as("join_ship_pr_no_"),
						S0_T3.iv_d_no.as("join_iv_d_no_")
					)
					.from(
						S0_T1
						.leftOuterJoin(S0_T3).on(
							bracket(
								S0_T3.ship_schd_no.eq(S0_T1.ship_schd_no)
							)
						)
					)
					.where(
						S0_T1.ship_schd_no.eq(bind("ship_schd_no"))
					)
			)
			.setJoinInfo(
				joinInfo(
					j -> j
						.add(MST_SHIP_PR_R.class, r -> toCondition(
							r.getStringNE("join_ship_pr_no_")
						))
						.addSelect(m -> toArray(
							m.via_dlv_typ
						))
						.addMap((r, m) -> {
							r.setStringNE("via_dlv_typ", m.via_dlv_typ());
					}),
					j -> j
						.add(MST_IV_D_R.class, r -> toCondition(
							r.getStringNE("join_iv_d_no_")
						))
						.addSelect(m -> toArray(
							m.iv_mng_no
						))
						.addMap((r, m) -> {
							r.setStringNE("join_iv_mng_no_", m.iv_mng_no());
					}),
					j -> j
						.add(MST_IV_R.class, r -> toCondition(
							r.getStringNE("join_iv_mng_no_")
						))
						.addSelect(m -> toArray(
							m.iv_no,
							m.iv_ship_flg
						))
						.addMap((r, m) -> {
							r.setStringNE("iv_no", m.iv_no());
							r.setBooleanNE("iv_ship_flg", m.iv_ship_flg());
					})
				)
			);
	}
	
	/**
	 * -- MSBBL6010_MST_SLS_ACT_D_Query_S1
	 */
	static MCQueryPlan MSBBL6010_MST_SLS_ACT_D_S1() {
		MST_SLS_ACT_D_R S0_T1 = MST_SLS_ACT_D_R.create("T1");
		MST_SLS_ACT_R S0_T2 = MST_SLS_ACT_R.create("T2");
		MSW_SLS_ACT_KEY_R S0_W = MSW_SLS_ACT_KEY_R.create("W");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBBL6010_MST_SLS_ACT_D_Query_S1")
					.mainQuery()
					.select(
						S0_T1.sls_act_d_no,
						S0_T1.sls_act_d_seq,
						S0_T1.sls_act_no,
						S0_T1.sls_act_seq,
						S0_T1.disp_seq,
						S0_T1.dlv_cd,
						S0_T1.dlv_sundry_flg,
						S0_T1.dlv_nm,
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
						S0_T1.tdlv_cd,
						S0_T1.tdlv_sundry_flg,
						S0_T1.tdlv_nm,
						S0_T1.tdlv_zip_cd,
						S0_T1.tdlv_addr1,
						S0_T1.tdlv_addr2,
						S0_T1.tdlv_addr3,
						S0_T1.tdlv_addr4,
						S0_T1.tdlv_tel,
						S0_T1.tdlv_fax,
						S0_T1.tdlv_cntct_dpt,
						S0_T1.tdlv_cntct_psn,
						S0_T1.itm_cd,
						S0_T1.itm_sub1,
						S0_T1.itm_sub2,
						S0_T1.itm_sub3,
						S0_T1.sno1,
						S0_T1.sno2,
						S0_T1.sno3,
						S0_T1.sno4,
						S0_T1.itm_nm,
						S0_T1.iv_itm_nm,
						S0_T1.cntry_org_cd,
						S0_T1.wrk_no,
						S0_T1.loc_cd,
						S0_T1.str_ln_cd,
						S0_T1.lot_no,
						S0_T1.sublot_no,
						S0_T1.gd_cd,
						S0_T1.trd_unit_cd,
						S0_T1.trd_unit_qty,
						S0_T1.base_unit_cd,
						S0_T1.base_unit_qty,
						S0_T1.trd_cur_upri,
						S0_T1.trd_cur_amt,
						S0_T1.upri_not_tgt_flg,
						S0_T1.interim_flg,
						S0_T1.tax_cd,
						S0_T1.trd_cur_tax_amt,
						S0_T1.base_cur_upri,
						S0_T1.base_cur_amt,
						S0_T1.base_cur_tax_amt,
						S0_T1.ptax_cur_upri,
						S0_T1.ptax_cur_amt,
						S0_T1.ptax_cur_tax_amt,
						S0_T1.cost_upri,
						S0_T1.cost_amt,
						S0_T1.trd_cur_dscnt_amt,
						S0_T1.base_cur_dscnt_amt,
						S0_T1.ptax_cur_dscnt_amt,
						S0_T1.dscnt_rsn_cd,
						S0_T1.bill_crryovr_times,
						S0_T1.stk_mng_typ,
						S0_T1.sundry_itm_flg,
						S0_T1.ar_typ,
						S0_T1.cst_po_d_no,
						S0_T1.cst_itm_cd,
						S0_T1.cst_itm_nm,
						S0_T1.trd_d_rmrks,
						S0_T1.intr_rmrks,
						S0_T1.rsn_cd,
						S0_T1.bd_dpt_cd,
						S0_T1.wtax_rate,
						S0_T1.wtax_amt,
						S0_T1.slo_no,
						S0_T1.slo_d_no,
						S0_T1.sls_ret_schd_no,
						S0_T1.sls_ret_schd_d_no,
						S0_T1.ship_schd_no,
						S0_T1.sls_schd_no,
						S0_T1.qtn_no,
						S0_T1.qtn_rev,
						S0_T1.qtn_d_no,
						S0_T1.purc_ddlv_po_no,
						S0_T1.purc_ddlv_po_d_no,
						S0_T1.purc_act_no,
						S0_T1.purc_act_d_no,
						S0_T1.iv_d_no,
						S0_T1.sub_char1,
						S0_T1.sub_char2,
						S0_T1.sub_char3,
						S0_T1.ref_sls_act_no,
						S0_T1.ref_sls_act_seq,
						S0_T1.ref_sls_act_d_no,
						S0_T1.ref_sls_act_d_seq,
						S0_T1.base_sls_ac_dt,
						S0_T1.dlv_slip_d_no,
						S0_T1.sno1_mng_typ,
						S0_T1.sno2_mng_typ,
						S0_T1.sno3_mng_typ,
						S0_T1.sno4_mng_typ,
						S0_T1.sls_dtl_upd_flg,
						S0_T1.ext_purc_act_d_no,
						S0_T1.ext_sys_cd,
						S0_T1.ship_dlv_slip_d_no,
						S0_T1.ship_dlv_slip_multi_flg
					)
					.from(
						S0_T1
						.innerJoin(S0_T2).on(
							bracket(
								S0_T1.sls_act_no.eq(S0_T2.sls_act_no)
								.and(S0_T1.sls_act_seq.eq(S0_T2.sls_act_seq))
							)
						)
						.innerJoin(S0_W).on(
							bracket(
								S0_T2.sls_act_no.eq(S0_W.sls_act_no)
								.and(S0_T2.slip_sts_typ.eq(value(MAC_SLIP_STS_TYP.CRT.value())))
							)
						)
					)
					.where(
						value(0).eq(value(0))
					)
					.orderBy(
						S0_T1.sls_act_no.asc(),
						S0_T1.disp_seq.asc()
					)
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
							r.setNumberNE("tax_rate", m.tax_rate());
							r.setBooleanNE("inc_tax_flg", m.inc_tax_flg());
							r.setStringNE("tax_typ", m.tax_typ());
					})
				)
			);
	}
	
	/**
	 * -- MSBBL6010_MST_SLS_ACT_D_Query_S2
	 */
	static MCQueryPlan MSBBL6010_MST_SLS_ACT_D_S2() {
		MST_SLS_ACT_D_R S0_T1 = MST_SLS_ACT_D_R.create("T1");
		MSW_SLS_ACT_D_KEY_R S0_W = MSW_SLS_ACT_D_KEY_R.create("W");
		MST_SLS_ACT_R S0_T2 = MST_SLS_ACT_R.create("T2");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBBL6010_MST_SLS_ACT_D_Query_S2")
					.mainQuery()
					.select(
						S0_T1.sls_act_d_no,
						S0_T1.sls_act_d_seq,
						S0_T1.base_unit_qty,
						S0_T2.slip_sts_typ
					)
					.from(
						S0_T1
						.innerJoin(S0_W).on(
							bracket(
								S0_T1.sls_act_d_no.eq(S0_W.sls_act_d_no)
							)
						)
						.innerJoin(S0_T2).on(
							S0_T2.sls_act_no.eq(S0_T1.sls_act_no)
							.and(S0_T2.sls_act_seq.eq(S0_T1.sls_act_seq))
							.and(
								S0_T2.slip_sts_typ.in(
									value(MAC_SLIP_STS_TYP.CRT.value()),
									value(MAC_SLIP_STS_TYP.CAN.value())
								)
							)
						)
					)
					.orderBy(
						S0_T1.sls_act_d_no.desc(),
						S0_T1.sls_act_d_seq.desc()
					)
			);
	}
	
	/**
	 * -- MSBBL6010_MST_SLS_ACT_IO_Query_S1
	 */
	static MCQueryPlan MSBBL6010_MST_SLS_ACT_IO_S1() {
		MST_SLS_ACT_IO_R S0_T1 = MST_SLS_ACT_IO_R.create("T1");
		MST_SLS_ACT_D_R S0_T2 = MST_SLS_ACT_D_R.create("T2");
		MST_SLS_ACT_R S0_T3 = MST_SLS_ACT_R.create("T3");
		MSW_SLS_ACT_KEY_R S0_W = MSW_SLS_ACT_KEY_R.create("W");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBBL6010_MST_SLS_ACT_IO_Query_S1")
					.mainQuery()
					.select(
						S0_T1.sls_act_io_no,
						S0_T1.sls_act_io_seq,
						S0_T1.sls_act_d_no,
						S0_T1.sls_act_d_seq,
						S0_T1.ship_act_d_no,
						S0_T1.iv_ship_act_d_no,
						S0_T1.arr_act_no,
						S0_T1.purc_act_io_no,
						S0_T1.gd_cd,
						S0_T1.loc_cd,
						S0_T1.str_ln_cd,
						S0_T1.lot_no,
						S0_T1.sublot_no,
						S0_T1.sno1,
						S0_T1.sno2,
						S0_T1.sno3,
						S0_T1.sno4,
						S0_T1.trd_unit_cd,
						S0_T1.trd_unit_qty,
						S0_T1.base_unit_cd,
						S0_T1.base_unit_qty,
						S0_T1.pack_unit_cd,
						S0_T1.pack_unit_qty,
						S0_T1.trd_cur_upri,
						S0_T1.trd_cur_amt,
						S0_T1.trd_cur_dscnt_amt,
						S0_T1.trd_cur_tax_amt,
						S0_T1.base_cur_upri,
						S0_T1.base_cur_amt,
						S0_T1.base_cur_dscnt_amt,
						S0_T1.base_cur_tax_amt,
						S0_T1.ptax_cur_upri,
						S0_T1.ptax_cur_amt,
						S0_T1.ptax_cur_dscnt_amt,
						S0_T1.ptax_cur_tax_amt,
						S0_T1.sync_flg,
						S0_T1.sub_char1,
						S0_T1.sub_char2,
						S0_T1.sub_char3
					)
					.from(
						S0_T1
						.innerJoin(S0_T2).on(
							bracket(
								S0_T1.sls_act_d_no.eq(S0_T2.sls_act_d_no)
								.and(S0_T1.sls_act_d_seq.eq(S0_T2.sls_act_d_seq))
							)
						)
						.innerJoin(S0_T3).on(
							bracket(
								S0_T2.sls_act_no.eq(S0_T3.sls_act_no)
								.and(S0_T2.sls_act_seq.eq(S0_T3.sls_act_seq))
								.and(S0_T3.slip_sts_typ.eq(value(MAC_SLIP_STS_TYP.CRT.value())))
							)
						)
						.innerJoin(S0_W).on(
							bracket(
								S0_T3.sls_act_no.eq(S0_W.sls_act_no)
							)
						)
					)
					.where(
						value(0).eq(value(0))
					)
					.orderBy(S0_T1.sls_act_io_no.asc())
			);
	}
	
	/**
	 * -- MSBBL6010_MST_SLS_ACT_IO_Query_S2
	 */
	static MCQueryPlan MSBBL6010_MST_SLS_ACT_IO_S2() {
		MST_SLS_ACT_IO_R S0_T1 = MST_SLS_ACT_IO_R.create("T1");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBBL6010_MST_SLS_ACT_IO_Query_S2")
					.mainQuery()
					.select(
						S0_T1.sls_act_io_no,
						S0_T1.sls_act_io_seq,
						S0_T1.ship_act_d_no,
						S0_T1.iv_ship_act_d_no
					)
					.from(S0_T1)
					.where(
						value(0).eq(value(0))
						.and(S0_T1.sls_act_d_no.eq(bind("sls_act_d_no")))
						.and(S0_T1.sls_act_d_seq.eq(bind("sls_act_d_seq")))
					)
			);
	}
	
	/**
	 * -- MSBBL6010_MST_SLS_ACT_Query_S1
	 */
	static MCQueryPlan MSBBL6010_MST_SLS_ACT_S1() {
		MST_SLS_ACT_R S0_T1 = MST_SLS_ACT_R.create("T1");
		MSW_SLS_ACT_KEY_R S0_W = MSW_SLS_ACT_KEY_R.create("W");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBBL6010_MST_SLS_ACT_Query_S1")
					.mainQuery()
					.select(
						S0_T1.sls_act_no,
						S0_T1.sls_act_seq,
						S0_T1.sls_act_rev,
						S0_T1.slip_sts_typ,
						S0_T1.trd_cd,
						S0_T1.trd_ptn_typ,
						S0_T1.ac_ym,
						S0_T1.ac_dt,
						S0_T1.sls_dpt_cd,
						S0_T1.wg_cd,
						S0_T1.sls_usr_cd,
						S0_T1.sls_dt,
						S0_T1.ship_tm,
						S0_T1.dlv_tm,
						S0_T1.cst_cd,
						S0_T1.iv_no,
						S0_T1.ref_iv_no,
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
						S0_T1.bill_basis_dt,
						S0_T1.cred_cd,
						S0_T1.bcst_cd,
						S0_T1.acst_cd,
						S0_T1.ar_dpt_cd,
						S0_T1.cst_po_no,
						S0_T1.trd_cur_cd,
						S0_T1.base_cur_cd,
						S0_T1.xrate_cd,
						S0_T1.xrate,
						S0_T1.ptax_cur_cd,
						S0_T1.ptax_xrate,
						S0_T1.trd_cur_amt,
						S0_T1.trd_cur_tax_amt,
						S0_T1.base_cur_amt,
						S0_T1.base_cur_tax_amt,
						S0_T1.trd_rmrks,
						S0_T1.intr_rmrks,
						S0_T1.ship_act_no,
						S0_T1.slo_no,
						S0_T1.sls_ret_schd_no,
						S0_T1.qtn_no,
						S0_T1.qtn_rev,
						S0_T1.dlv_slip_no,
						S0_T1.dlv_slip_seq,
						S0_T1.slip_form_cd,
						S0_T1.aprv_flg,
						S0_T1.aprv_no,
						S0_T1.aprv_sts_typ,
						S0_T1.sls_basis_typ,
						S0_T1.ddlv_sls_flg,
						S0_T1.adjst_tgt_dt,
						S0_T1.sls_adjst_typ,
						S0_T1.adjst_mtd_typ,
						S0_T1.ship_act_sync_flg,
						S0_T1.ship_lg_grp_cd,
						S0_T1.sub_char1,
						S0_T1.sub_char2,
						S0_T1.sub_char3,
						S0_T1.edi_flg,
						S0_T1.ship_dlv_slip_no
					)
					.from(
						S0_T1
						.innerJoin(S0_W).on(
							bracket(
								S0_T1.sls_act_no.eq(S0_W.sls_act_no)
							)
						)
					)
					.where(
						value(0).eq(value(0))
						.and(S0_T1.slip_sts_typ.eq(value(MAC_SLIP_STS_TYP.CRT.value())))
					)
			);
	}
	
	/**
	 * -- MSBBL6010_MST_SLS_ACT_Query_S2
	 */
	static MCQueryPlan MSBBL6010_MST_SLS_ACT_S2() {
		MST_SLS_ACT_R S0_T1 = MST_SLS_ACT_R.create("T1");
		MST_SLS_ACT_D_R S0_T2 = MST_SLS_ACT_D_R.create("T2");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBBL6010_MST_SLS_ACT_Query_S2")
					.mainQuery()
					.select(
						S0_T1.sls_act_no,
						S0_T1.sls_act_seq,
						S0_T2.sls_act_d_no,
						S0_T2.sls_act_d_seq
					)
					.from(
						S0_T1
						.innerJoin(S0_T2).on(
							S0_T1.sls_act_no.eq(S0_T2.sls_act_no)
							.and(S0_T1.sls_act_seq.eq(S0_T2.sls_act_seq))
						)
					)
					.where(
						value(0).eq(value(0))
						.and(S0_T1.iv_no.eq(bind("iv_no")))
						.and(S0_T1.slip_sts_typ.eq(value(MAC_SLIP_STS_TYP.CRT.value())))
						.and(S0_T2.iv_d_no.eq(bind("iv_d_no")))
					)
			);
	}
	
	/**
	 * -- MSBBL6010_MST_SLS_SCHD_Query_S1
	 */
	static MCQueryPlan MSBBL6010_MST_SLS_SCHD_S1() {
		MST_SLS_SCHD_R S0_T1 = MST_SLS_SCHD_R.create("T1");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBBL6010_MST_SLS_SCHD_Query_S1")
					.mainQuery()
					.select(S0_T1.sls_schd_no)
					.from(S0_T1)
					.where(
						value(0).eq(value(0))
						.and(S0_T1.dlv_slip_d_no.eq(bind("dlv_slip_d_no")))
					)
			);
	}
	
	/**
	 * -- MSBBL6010_MST_SLS_SCHD_Query_S2
	 */
	static MCQueryPlan MSBBL6010_MST_SLS_SCHD_S2() {
		MST_SLS_SCHD_R S0_T1 = MST_SLS_SCHD_R.create("T1");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBBL6010_MST_SLS_SCHD_Query_S2")
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
}