package mcframe.serverMSBB.MSBBL1360;

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
	 * -- MSBBL1360_MST_PURC_ACT_IO_Query_S02
	 */
	static MCQueryPlan MSBBL1360_MST_PURC_ACT_IO_S02() {
		MST_PURC_ACT_R S0_T1 = MST_PURC_ACT_R.create("T1");
		MST_PURC_ACT_D_R S0_T2 = MST_PURC_ACT_D_R.create("T2");
		MST_PURC_ACT_IO_R S0_T3 = MST_PURC_ACT_IO_R.create("T3");
		MCTempView S0_T4 = createTempView("T4");
		MST_SLS_ACT_R S1_T1 = MST_SLS_ACT_R.create("T1");
		MST_SLS_ACT_D_R S1_T2 = MST_SLS_ACT_D_R.create("T2");
		MST_SLS_ACT_IO_R S1_T3 = MST_SLS_ACT_IO_R.create("T3");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBBL1360_MST_PURC_ACT_IO_Query_S02")
					.mainQuery()
					.select(
						S0_T3.purc_act_io_no,
						S0_T3.arr_act_no,
						S0_T3.base_unit_qty.subtract(
							nvl(
								S0_T4.pr("base_unit_qty"),
								value(0)
							)
						).as("base_unit_qty")
					)
					.from(
						S0_T1
						.innerJoin(S0_T2).on(
							bracket(
								S0_T1.purc_act_no.eq(S0_T2.purc_act_no)
								.and(S0_T1.purc_act_seq.eq(S0_T2.purc_act_seq))
							)
						)
						.innerJoin(S0_T3).on(
							bracket(
								S0_T2.purc_act_d_no.eq(S0_T3.purc_act_d_no)
								.and(S0_T2.purc_act_d_seq.eq(S0_T3.purc_act_d_seq))
							)
						)
						.leftOuterJoin(
							subQuery()
							.select(
								S1_T3.purc_act_io_no,
								sum(S1_T3.base_unit_qty).as("base_unit_qty")
							)
							.from(
								S1_T1
								.innerJoin(S1_T2).on(
									bracket(
										S1_T1.sls_act_no.eq(S1_T2.sls_act_no)
										.and(S1_T1.sls_act_seq.eq(S1_T2.sls_act_seq))
									)
								)
								.innerJoin(S1_T3).on(
									bracket(
										S1_T2.sls_act_d_no.eq(S1_T3.sls_act_d_no)
										.and(S1_T2.sls_act_d_seq.eq(S1_T3.sls_act_d_seq))
									)
								)
							)
							.where(
								value(0).eq(value(0))
								.and(S1_T1.slip_sts_typ.eq(value(MAC_SLIP_STS_TYP.CRT.value())))
								.cutoff$and(S1_T1.sls_act_no.neq(bind("sls_act_no")))
							)
							.groupBy(S1_T3.purc_act_io_no).view(S0_T4)
						).on(
							bracket(
								S0_T3.purc_act_io_no.eq(S0_T4.pr(S1_T3.purc_act_io_no))
							)
						)
					)
					.where(
						value(0).eq(value(0))
						.and(S0_T1.slip_sts_typ.eq(value(MAC_SLIP_STS_TYP.CRT.value())))
						.cutoff$and(S0_T1.purc_act_no.like(bind("purc_act_no")))
					)
			);
	}
	
	/**
	 * -- MSBBL1360_PURC_ACT_IO_Query_S01
	 */
	static MCQueryPlan MSBBL1360_PURC_ACT_IO_S01() {
		MST_PURC_ACT_R S0_T1 = MST_PURC_ACT_R.create("T1");
		MST_PURC_ACT_D_R S0_T2 = MST_PURC_ACT_D_R.create("T2");
		MST_PURC_ACT_IO_R S0_T3 = MST_PURC_ACT_IO_R.create("T3");
		MCTempView S0_T4 = createTempView("T4");
		MST_SLS_ACT_R S1_T1 = MST_SLS_ACT_R.create("T1");
		MST_SLS_ACT_D_R S1_T2 = MST_SLS_ACT_D_R.create("T2");
		MST_SLS_ACT_IO_R S1_T3 = MST_SLS_ACT_IO_R.create("T3");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBBL1360_PURC_ACT_IO_Query_S01")
					.mainQuery()
					.select(
						value(false).as("sync_flg"),
						S0_T3.trd_unit_cd,
						S0_T3.base_unit_cd,
						S0_T3.base_unit_qty.subtract(
							nvl(
								S0_T4.pr("base_unit_qty"),
								value(0)
							)
						).as("base_unit_qty"),
						S0_T3.base_unit_qty.as("purc_qty"),
						nvl(
							S0_T4.pr("base_unit_qty"),
							value(0)
						).as("sls_qty"),
						S0_T3.gd_cd,
						S0_T3.bp_dlv_slip_no,
						S0_T3.bp_dlv_slip_d_no,
						S0_T3.lot_no,
						S0_T3.sublot_no,
						S0_T3.bp_lot_no,
						S0_T3.ver_no,
						S0_T2.sno1,
						S0_T2.sno2,
						S0_T2.sno3,
						S0_T2.sno4,
						S0_T3.purc_act_io_no,
						S0_T2.purc_act_d_no,
						S0_T2.itm_cd,
						S0_T2.itm_sub1,
						S0_T2.itm_sub2,
						S0_T2.itm_sub3,
						S0_T3.arr_act_no.as("join_arr_act_no_")
					)
					.from(
						S0_T1
						.innerJoin(S0_T2).on(
							bracket(
								S0_T1.purc_act_no.eq(S0_T2.purc_act_no)
								.and(S0_T1.purc_act_seq.eq(S0_T2.purc_act_seq))
							)
						)
						.innerJoin(S0_T3).on(
							bracket(
								S0_T2.purc_act_d_no.eq(S0_T3.purc_act_d_no)
								.and(S0_T2.purc_act_d_seq.eq(S0_T3.purc_act_d_seq))
							)
						)
						.leftOuterJoin(
							subQuery()
							.select(
								S1_T3.purc_act_io_no,
								sum(S1_T3.base_unit_qty).as("base_unit_qty")
							)
							.from(
								S1_T1
								.innerJoin(S1_T2).on(
									bracket(
										S1_T1.sls_act_no.eq(S1_T2.sls_act_no)
										.and(S1_T1.sls_act_seq.eq(S1_T2.sls_act_seq))
									)
								)
								.innerJoin(S1_T3).on(
									bracket(
										S1_T2.sls_act_d_no.eq(S1_T3.sls_act_d_no)
										.and(S1_T2.sls_act_d_seq.eq(S1_T3.sls_act_d_seq))
									)
								)
							)
							.where(
								value(0).eq(value(0))
								.and(S1_T1.slip_sts_typ.eq(value(MAC_SLIP_STS_TYP.CRT.value())))
							)
							.groupBy(S1_T3.purc_act_io_no).view(S0_T4)
						).on(
							bracket(
								S0_T3.purc_act_io_no.eq(S0_T4.pr(S1_T3.purc_act_io_no))
							)
						)
					)
					.where(
						value(1).eq(value(1))
						.and(S0_T1.slip_sts_typ.eq(value(MAC_SLIP_STS_TYP.CRT.value())))
						.and(
							S0_T3.base_unit_qty.subtract(nvl(
									S0_T4.pr("base_unit_qty"),
									value(0)
								)).gt(value(0))
						)
						.cutoff$and(S0_T3.purc_act_d_no.like(bind("purc_act_d_no")))
					)
			)
			.setJoinInfo(
				joinInfo(
					j -> j
						.add(MST_ARR_ACT_R.class, r -> toCondition(
							r.getStringNE("join_arr_act_no_")
						))
						.addSelect(m -> toArray(
							m.purc_cont_qty,
							m.ship_fr_valid_dt
						))
						.addMap((r, m) -> {
							r.setDateNE("ship_fr_valid_dt", m.ship_fr_valid_dt());
							r.setNumberNE("purc_cont_qty", m.purc_cont_qty());
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
					}),
					j -> j
						.add(MAM_ITM_R.class, r -> toCondition(
							r.getStringNE("itm_cd"),
							r.getStringNE("itm_sub1"),
							r.getStringNE("itm_sub2"),
							r.getStringNE("itm_sub3")
						))
						.addSelect(m -> toArray(
							m.cont_fctr_dec_place,
							m.cont_fctr_flg,
							m.cont_fctr_rnd_typ,
							m.cont_fctr_unit_cd,
							m.dec_place,
							m.rnd_typ,
							m.std_cont_fctr,
							m.ver_flg
						))
						.addMap((r, m) -> {
							r.setStringNE("cont_fctr_unit_cd", m.cont_fctr_unit_cd());
							r.setNumberNE("std_cont_fctr", m.std_cont_fctr());
							r.setBooleanNE("cont_fctr_flg", m.cont_fctr_flg());
							r.setStringNE("cont_fctr_rnd_typ", m.cont_fctr_rnd_typ());
							r.setNumberNE("cont_fctr_dec_place", m.cont_fctr_dec_place());
							r.setBooleanNE("ver_flg", m.ver_flg());
							r.setNumberNE("base_unit_dec_place", m.dec_place());
							r.setStringNE("base_unit_rnd_typ", m.rnd_typ());
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
						.add(MAM_STK_GD_R.class, r -> toCondition(
							r.getStringNE("gd_cd")
						))
						.addSelect(m -> toArray(
							m.gd_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("gd_nm", m.gd_nm());
					})
				)
			);
	}
	
	/**
	 * -- MSBBL1360_PURC_SCHD_Query_S01
	 */
	static MCQueryPlan MSBBL1360_PURC_SCHD_S01() {
		MST_SLO_R S0_T1 = MST_SLO_R.create("T1");
		MST_SLO_D_R S0_T2 = MST_SLO_D_R.create("T2");
		MST_SLS_SCHD_R S0_T3 = MST_SLS_SCHD_R.create("T3");
		MST_PURC_SCHD_R S0_T4 = MST_PURC_SCHD_R.create("T4");
		MST_ARR_PR_R S0_T5 = MST_ARR_PR_R.create("T5");
		MST_PO_D_R S0_T6 = MST_PO_D_R.create("T6");
		MST_PO_R S0_T7 = MST_PO_R.create("T7");
		MST_ARR_SCHD_R S0_T8 = MST_ARR_SCHD_R.create("T8");
		MST_SHIP_PR_R S0_T9 = MST_SHIP_PR_R.create("T9");
		MST_SHIP_SCHD_R S0_T10 = MST_SHIP_SCHD_R.create("T10");
		MCTempView S0_T12 = createTempView("T12");
		MST_RCPT_IV_R S0_T11 = MST_RCPT_IV_R.create("T11");
		MST_PURC_DLV_SLIP_D_R S0_T13 = MST_PURC_DLV_SLIP_D_R.create("T13");
		MST_RCPT_IV_D_R S0_T14 = MST_RCPT_IV_D_R.create("T14");
		MAM_ITM_R S0_ITM = MAM_ITM_R.create("ITM");
		MAM_BP_R S0_DLV = MAM_BP_R.create("DLV");
		MAM_DPT_R S0_DPT = MAM_DPT_R.create("DPT");
		MAM_BP_R S0_SPPL = MAM_BP_R.create("SPPL");
		MAM_TAX_R S0_SCHDTAX = MAM_TAX_R.create("SCHDTAX");
		MAM_TAX_R S0_PSTAX = MAM_TAX_R.create("PSTAX");
		MAM_TAX_R S0_NEWTAX = MAM_TAX_R.create("NEWTAX");
		MAM_CUR_R S0_CUR = MAM_CUR_R.create("CUR");
		MAM_TAX_R S0_TAX2 = MAM_TAX_R.create("TAX2");
		MAM_TAX_R S0_NEWTAX2 = MAM_TAX_R.create("NEWTAX2");
		MAM_BIZ_RSN_R S0_RSN3 = MAM_BIZ_RSN_R.create("RSN3");
		MAM_BIZ_RSN_R S0_RSN4 = MAM_BIZ_RSN_R.create("RSN4");
		MAM_DPT_R S0_DPT2 = MAM_DPT_R.create("DPT2");
		MAM_CO_R S0_CO = MAM_CO_R.create("CO");
		MAVM_RD_DPT_R S0_DAC = MAVM_RD_DPT_R.create("DAC");
		MST_PURC_ACT_R S1_T1 = MST_PURC_ACT_R.create("T1");
		MST_PURC_ACT_D_R S1_T2 = MST_PURC_ACT_D_R.create("T2");
		MST_SLS_SCHD_R S2_T3 = MST_SLS_SCHD_R.create("T3");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBBL1360_PURC_SCHD_Query_S01")
					.mainQuery()
					.select(
						decode(
							S0_T12.pr(S1_T2.purc_act_d_no),
							nullValue(),
							value(true),
							value(false)
						).as("sync_flg"),
						decode(
							S0_T12.pr(S1_T2.purc_act_d_no),
							nullValue(),
							value(true),
							value(false)
						).as("org_sync_flg"),
						S0_T4.purc_schd_dt.as("dlv_schd_dt"),
						S0_T6.itm_cd,
						S0_T6.itm_sub1,
						S0_T6.itm_sub2,
						S0_T6.itm_sub3,
						nvl(
							S0_T6.itm_nm,
							S0_ITM.itm_nm
						).as("itm_nm"),
						S0_ITM.asset_mng_typ,
						S0_ITM.sundry_itm_flg,
						nvl(
							S0_T10.dlv_cd,
							S0_T6.dlv_cd
						).as("dlv_cd"),
						nvl2(
							S0_T10.dlv_cd,
							nvl(
								S0_T10.dlv_nm,
								S0_DLV.bp_nm
							),
							nvl(
								S0_T6.dlv_nm,
								S0_DLV.bp_nm
							)
						).as("dlv_nm"),
						nvl2(
							S0_T10.dlv_cd,
							S0_T10.dlv_zip_cd,
							S0_T6.dlv_zip_cd
						).as("dlv_zip_cd"),
						nvl2(
							S0_T10.dlv_cd,
							S0_T10.dlv_addr1,
							S0_T6.dlv_addr1
						).as("dlv_addr1"),
						nvl2(
							S0_T10.dlv_cd,
							S0_T10.dlv_addr2,
							S0_T6.dlv_addr2
						).as("dlv_addr2"),
						nvl2(
							S0_T10.dlv_cd,
							S0_T10.dlv_addr3,
							S0_T6.dlv_addr3
						).as("dlv_addr3"),
						nvl2(
							S0_T10.dlv_cd,
							S0_T10.dlv_addr4,
							S0_T6.dlv_addr4
						).as("dlv_addr4"),
						nvl2(
							S0_T10.dlv_cd,
							S0_T10.dlv_cntct_dpt,
							S0_T6.dlv_cntct_dpt
						).as("dlv_cntct_dpt"),
						nvl2(
							S0_T10.dlv_cd,
							S0_T10.dlv_cntct_psn,
							S0_T6.dlv_cntct_psn
						).as("dlv_cntct_psn"),
						nvl2(
							S0_T10.dlv_cd,
							S0_T10.dlv_tel,
							S0_T6.dlv_tel
						).as("dlv_tel"),
						nvl2(
							S0_T10.dlv_cd,
							S0_T10.dlv_fax,
							S0_T6.dlv_fax
						).as("dlv_fax"),
						S0_DLV.cntry_cd,
						nvl2(
							S0_T10.dlv_cd,
							S0_T10.pri_prnt_flg,
							S0_T2.pri_prnt_flg
						).as("pri_prnt_flg"),
						nvl2(
							S0_T10.dlv_cd,
							S0_T10.dlv_sundry_flg,
							S0_T6.dlv_sundry_flg
						).as("dlv_sundry_flg"),
						S0_T2.dest_cd1,
						S0_T2.dest_cd2,
						S0_T2.dest_cd3,
						S0_T3.trd_unit_cd,
						S0_ITM.unit_cd.as("base_unit_cd"),
						bracket(
							S0_T3.base_unit_qty.subtract(S0_T3.base_unit_sls_qty).subtract(S0_T3.base_unit_abort_qty)
						).as("base_unit_qty"),
						S0_T3.base_unit_qty.as("sls_schd_qty"),
						S0_T3.base_unit_sls_qty.as("sls_qty"),
						value(true).as("upri_not_tgt_flg"),
						S0_T2.interim_flg,
						S0_T2.tax_fix_flg,
						S0_T2.tax_cd,
						S0_T2.trd_cur_tax_amt,
						S0_T2.trd_cur_dscnt_amt,
						S0_T2.dscnt_rsn_cd,
						S0_T2.cost_upri,
						S0_T2.cost_amt,
						S0_T2.bill_crryovr_times,
						S0_T2.gd_cd,
						S0_T2.cst_po_d_no,
						S0_T2.cst_itm_cd,
						S0_T2.cst_itm_nm,
						S0_T2.sls_rsn_cd,
						S0_T2.bd_dpt_cd,
						S0_DPT.dpt_nm.as("bd_dpt_nm"),
						S0_T2.wtax_rate,
						S0_T2.trd_d_rmrks,
						S0_T12.pr(S1_T1.ac_ym).as("purc_ac_ym"),
						S0_T12.pr(S1_T1.ac_dt).as("purc_ac_dt"),
						S0_T12.pr(S1_T1.purc_dt),
						S0_T12.pr(S1_T1.purc_act_no),
						S0_T12.pr(S1_T2.purc_act_d_no),
						S0_T7.po_no,
						S0_T6.po_d_no,
						S0_T7.sppl_cd,
						S0_SPPL.bp_nm.as("sppl_nm"),
						S0_SPPL.sppl_iv_flg,
						S0_SPPL.subcon_flg,
						S0_T6.maker_cd,
						S0_T12.pr(S1_T2.bp_dlv_slip_no).as("bp_dlv_slip_no"),
						S0_T12.pr(S1_T2.bp_dlv_slip_d_no).as("bp_dlv_slip_d_no"),
						nvl(
							S0_T12.pr(S1_T2.lot_no),
							S0_T8.lot_no
						).as("lot_no"),
						nvl(
							S0_T12.pr(S1_T2.sublot_no),
							S0_T8.sublot_no
						).as("sublot_no"),
						nvl(
							S0_T12.pr(S1_T2.bp_lot_no),
							S0_T8.bp_lot_no
						).as("bp_lot_no"),
						nvl(
							S0_T12.pr(S1_T2.ver_no),
							S0_T8.ver_no
						).as("ver_no"),
						S0_ITM.cont_fctr_unit_cd,
						S0_ITM.std_cont_fctr,
						S0_T6.sno1,
						S0_T6.sno2,
						S0_T6.sno3,
						S0_T6.sno4,
						nvl(
							S0_T12.pr(S1_T1.trd_cur_cd),
							S0_T7.trd_cur_cd
						).as("purc_trd_cur_cd"),
						S0_CUR.cur_nm.as("purc_trd_cur_nm"),
						decode(
							S0_T11.rcpt_iv_no,
							nullValue(),
							S0_T7.xrate_inpt_flg,
							S0_T11.xrate_inpt_flg
						).as("purc_xrate_inpt_flg"),
						cases()
							.when(S0_T12.pr(S1_T1.xrate).isNotNull())
								.then(S0_T12.pr(S1_T1.xrate))
							.when(S0_T11.xrate_inpt_flg.eq(value(true)))
								.then(S0_T11.xrate)
							.when(
								S0_T11.rcpt_iv_no.isNull()
								.and(S0_T7.xrate_inpt_flg.eq(value(true)))
							)
								.then(S0_T7.xrate)
							.otherwise(
								MAPA_XCHNG$F_GET_PURC_XRATE_NE(
									S0_T7.trd_cur_cd,
									bind("today")
								)
							).as("purc_xrate"),
						decode(
							S0_T11.rcpt_iv_no,
							nullValue(),
							S0_T7.ptax_xrate_inpt_flg,
							S0_T11.ptax_xrate_inpt_flg
						).as("purc_ptax_xrate_inpt_flg"),
						cases()
							.when(S0_T12.pr(S1_T1.ptax_xrate).isNotNull())
								.then(S0_T12.pr(S1_T1.ptax_xrate))
							.when(S0_T11.ptax_xrate_inpt_flg.eq(value(true)))
								.then(S0_T11.ptax_xrate)
							.when(
								S0_T11.rcpt_iv_no.isNull()
								.and(S0_T7.ptax_xrate_inpt_flg.eq(value(true)))
							)
								.then(S0_T7.ptax_xrate)
							.when(S0_CO.ptax_cur_cd.isNull())
								.then(nullValue())
							.otherwise(
								MAPA_XCHNG$F_GET_XRATE_NE(
									S0_T7.trd_cur_cd,
									S0_CO.ptax_cur_cd,
									S0_CO.purc_xrate_cd,
									bind("today")
								)
							).as("purc_ptax_xrate"),
						coalesce(
							S0_T12.pr(S1_T2.upri_not_tgt_flg),
							S0_T14.upri_not_tgt_flg,
							S0_T6.upri_not_tgt_flg
						).as("purc_upri_not_tgt_flg"),
						coalesce(
							S0_T12.pr(S1_T2.trd_cur_upri),
							S0_T14.trd_cur_upri,
							S0_T6.trd_cur_upri
						).as("purc_trd_cur_upri"),
						coalesce(
							S0_T12.pr(S1_T2.interim_flg),
							S0_T14.interim_flg,
							S0_T6.interim_flg
						).as("purc_interim_flg"),
						coalesce(
							S0_T12.pr(S1_T2.trd_cur_amt),
							S0_T14.trd_cur_amt,
							S0_T6.trd_cur_amt
						).as("purc_trd_cur_amt"),
						coalesce(
							S0_T12.pr(S1_T2.trd_cur_amt),
							S0_T14.trd_cur_amt,
							S0_T6.trd_cur_amt
						).add(
							coalesce(
								S0_T12.pr(S1_T2.trd_cur_tax_amt),
								S0_T14.trd_cur_tax_amt,
								S0_T6.trd_cur_tax_amt
							)
						).as("purc_trd_cur_inc_tax_amt"),
						nvl(
							S0_T14.tax_fix_flg,
							S0_T6.tax_fix_flg
						).as("purc_tax_fix_flg"),
						coalesce(
							S0_T12.pr(S1_T2.trd_cur_dscnt_amt),
							S0_T14.trd_cur_dscnt_amt,
							S0_T6.trd_cur_dscnt_amt
						).as("purc_trd_cur_dscnt_amt"),
						coalesce(
							S0_T12.pr(S1_T2.dscnt_rsn_cd),
							S0_T14.dscnt_rsn_cd,
							S0_T6.dscnt_rsn_cd
						).as("purc_dscnt_rsn_cd"),
						S0_RSN4.biz_rsn_nm.as("purc_dscnt_rsn_nm"),
						cases()
							.when(S0_T12.pr(S1_T2.purc_act_d_no).isNotNull())
								.then(S0_T12.pr(S1_T2.tax_cd))
							.when(S0_T14.rcpt_iv_d_no.isNotNull())
								.then(S0_T14.tax_cd)
							.otherwise(S0_T6.tax_cd).as("purc_tax_cd"),
						S0_TAX2.tax_nm.as("purc_tax_nm"),
						S0_TAX2.tax_rate.as("purc_tax_rate"),
						coalesce(
							S0_T12.pr(S1_T2.trd_cur_tax_amt),
							S0_T14.trd_cur_tax_amt,
							S0_T6.trd_cur_tax_amt
						).as("purc_trd_cur_tax_amt"),
						coalesce(
							S0_T12.pr(S1_T2.wtax_rate),
							S0_T14.wtax_rate,
							S0_T6.wtax_rate
						).as("purc_wtax_rate"),
						coalesce(
							S0_T12.pr(S1_T2.wtax_amt),
							S0_T14.wtax_amt,
							S0_T6.wtax_amt
						).as("purc_wtax_amt"),
						nvl(
							S0_T12.pr(S1_T2.rsn_cd),
							S0_T6.purc_rsn_cd
						).as("purc_rsn_cd"),
						S0_RSN3.biz_rsn_nm.as("purc_rsn_nm"),
						nvl(
							S0_T12.pr(S1_T2.bd_dpt_cd),
							S0_T6.bd_dpt_cd
						).as("purc_bd_dpt_cd"),
						S0_DPT2.dpt_nm.as("purc_bd_dpt_nm"),
						S0_T12.pr(S1_T2.base_unit_qty).as("purc_qty"),
						S0_T12.pr(S1_T2.base_cur_upri).as("purc_base_cur_upri"),
						S0_T12.pr(S1_T2.base_cur_dscnt_amt).as("purc_base_cur_dscnt_amt"),
						S0_T12.pr(S1_T2.base_cur_amt).as("purc_base_cur_amt"),
						S0_T12.pr(S1_T2.base_cur_tax_amt).as("purc_base_cur_tax_amt"),
						S0_T12.pr(S1_T2.base_cur_amt).add(S0_T12.pr(S1_T2.base_cur_tax_amt)).as("purc_base_cur_inc_tax_amt"),
						S0_T12.pr(S1_T2.ptax_cur_upri).as("purc_ptax_cur_upri"),
						S0_T12.pr(S1_T2.ptax_cur_dscnt_amt).as("purc_ptax_cur_dscnt_amt"),
						S0_T12.pr(S1_T2.ptax_cur_amt).as("purc_ptax_cur_amt"),
						S0_T12.pr(S1_T2.ptax_cur_tax_amt).as("purc_ptax_cur_tax_amt"),
						S0_T12.pr(S1_T2.ptax_cur_amt).add(S0_T12.pr(S1_T2.ptax_cur_tax_amt)).as("purc_ptax_cur_inc_tax_amt"),
						S0_T4.base_unit_schd_qty.as("base_unit_purc_schd_qty"),
						S0_T4.trd_unit_schd_qty.as("trd_unit_purc_schd_qty"),
						S0_T7.po_print_rmrks,
						S0_T6.po_print_d_rmrks,
						S0_T6.outsrc_flg,
						S0_T2.slo_d_no,
						S0_T2.disp_seq,
						S0_ITM.lot_mng_typ,
						S0_ITM.sublot_mng_typ,
						S0_ITM.lot_no_typ,
						S0_ITM.sublot_no_typ,
						S0_ITM.sno1_mng_typ,
						S0_ITM.sno2_mng_typ,
						S0_ITM.sno3_mng_typ,
						S0_ITM.sno4_mng_typ,
						S0_ITM.stk_mng_typ,
						S0_ITM.dscnt_itm_flg,
						S0_ITM.dec_place.as("base_unit_dec_place"),
						S0_ITM.rnd_typ.as("base_unit_rnd_typ"),
						S0_ITM.cont_fctr_flg,
						S0_ITM.cont_fctr_rnd_typ,
						S0_ITM.cont_fctr_dec_place,
						S0_ITM.ver_flg,
						S0_ITM.bill_crryovr_times.as("itm_bill_crryovr_times"),
						S0_RSN3.xpns_purc_flg,
						S0_T2.base_unit_qty.as("init_schd_qty"),
						S0_T2.trd_cur_dscnt_amt.as("init_schd_dscnt_amt"),
						S0_T3.sls_schd_no,
						S0_T4.purc_schd_no,
						S0_T4.arr_pr_no,
						S0_T9.ship_pr_no,
						S0_ITM.mrkt_judg_flg,
						cases()
							.when(S0_T8.lot_no.isNotNull())
								.then(value(true))
							.otherwise(value(false)).as("arr_schd_lot_fix_flg"),
						S0_T5.upd_cntr.as("arr_pr_upd_cntr"),
						S0_T9.upd_cntr.as("ship_pr_upd_cntr"),
						S0_T2.trd_unit_cd.as("schd_unit_cd"),
						S0_T2.trd_unit_qty.as("schd_qty"),
						S0_T2.trd_cur_upri.as("schd_upri"),
						S0_T2.trd_cur_dscnt_amt.as("schd_dscnt_amt"),
						S0_T2.trd_cur_amt.as("schd_amt"),
						S0_T2.trd_cur_tax_amt.as("schd_tax_amt"),
						bracket(
							S0_T2.trd_cur_amt.add(S0_T2.trd_cur_tax_amt)
						).as("schd_inc_tax_amt"),
						S0_ITM.dec_place.as("schd_dec_place"),
						S0_ITM.rnd_typ.as("schd_rnd_typ"),
						S0_SCHDTAX.tax_rate.as("schd_tax_rate"),
						S0_SCHDTAX.inc_tax_flg.as("schd_inc_tax_flg"),
						decode(
							S0_SCHDTAX.inc_tax_flg,
							value(false),
							S0_T2.trd_cur_amt,
							S0_T2.trd_cur_amt.add(S0_T2.trd_cur_tax_amt)
						).as("init_schd_amt"),
						S0_SCHDTAX.tax_cd.as("schd_tax_cd"),
						S0_T6.trd_unit_cd.as("purc_trd_unit_cd"),
						S0_T6.trd_unit_qty.as("purc_trd_unit_qty"),
						S0_T6.base_unit_qty.as("purc_schd_init_qty"),
						S0_T6.trd_cur_dscnt_amt.as("purc_schd_init_dscnt_amt"),
						decode(
							S0_PSTAX.inc_tax_flg,
							value(false),
							S0_T6.trd_cur_amt,
							S0_T6.trd_cur_amt.add(S0_T6.trd_cur_tax_amt)
						).as("purc_schd_init_amt"),
						S0_SPPL.purc_amt_rnd_typ,
						S0_SPPL.purc_tax_rnd_typ,
						S0_CUR.amt_dec_place.as("purc_trd_cur_amt_dec_place"),
						S0_CUR.upri_dec_place.as("purc_trd_cur_upri_dec_place"),
						S0_PSTAX.tax_cd.as("purc_schd_tax_cd"),
						S0_PSTAX.tax_rate.as("purc_schd_tax_rate"),
						S0_PSTAX.inc_tax_flg.as("purc_schd_inc_tax_flg"),
						S0_TAX2.inc_tax_flg.as("purc_inc_tax_flg"),
						S0_NEWTAX.tax_cd.as("new_tax_cd"),
						S0_NEWTAX.tax_nm.as("new_tax_nm"),
						S0_NEWTAX.tax_rate.as("new_tax_rate"),
						S0_NEWTAX.tax_typ.as("new_tax_typ"),
						S0_NEWTAX.inc_tax_flg.as("new_inc_tax_flg"),
						S0_NEWTAX2.tax_cd.as("new_purc_tax_cd"),
						S0_NEWTAX2.tax_nm.as("new_purc_tax_nm"),
						S0_NEWTAX2.tax_rate.as("new_purc_tax_rate"),
						S0_NEWTAX2.tax_typ.as("new_purc_tax_typ"),
						S0_NEWTAX2.inc_tax_flg.as("new_purc_inc_tax_flg"),
						S0_T2.trd_unit_cd.as("init_trd_unit_cd"),
						S0_T2.trd_unit_qty.as("init_trd_unit_qty"),
						S0_T2.trd_cur_upri.as("init_trd_cur_upri"),
						S0_T2.trd_cur_dscnt_amt.as("init_trd_cur_dscnt_amt"),
						S0_T2.trd_cur_tax_amt.as("init_trd_cur_tax_amt"),
						S0_SCHDTAX.tax_rate.as("init_tax_rate"),
						S0_SCHDTAX.inc_tax_flg.as("init_inc_tax_flg"),
						S0_T12.pr(S1_T1.ptax_dt).as("ptax_dt"),
						S0_T2.itm_cd.as("join_itm_cd_"),
						S0_T2.itm_sub1.as("join_itm_sub1_"),
						S0_T2.itm_sub2.as("join_itm_sub2_"),
						S0_T2.itm_sub3.as("join_itm_sub3_"),
						S0_T6.trd_cur_amt.as("purc_schd_init_ex_amt"),
						S0_PSTAX.tax_rate.as("purc_init_tax_rate"),
						S0_PSTAX.inc_tax_flg.as("purc_init_inc_tax_flg"),
						value(0).as("base_unit_qty_bef"),
						S0_T4.base_unit_purc_qty.add(S0_T4.base_unit_accpt_dfct_qty).as("base_unit_purc_qty")
					)
					.from(
						S0_T1
						.innerJoin(S0_T2).on(
							bracket(
								S0_T1.slo_no.eq(S0_T2.slo_no)
							)
						)
						.innerJoin(S0_T3).on(
							bracket(
								S0_T2.slo_d_no.eq(S0_T3.slo_d_no)
							)
						)
						.innerJoin(S0_T4).on(
							bracket(
								S0_T3.purc_schd_no.eq(S0_T4.purc_schd_no)
							)
						)
						.innerJoin(S0_T5).on(
							bracket(
								S0_T4.arr_pr_no.eq(S0_T5.arr_pr_no)
							)
						)
						.innerJoin(S0_T6).on(
							bracket(
								S0_T5.po_d_no.eq(S0_T6.po_d_no)
							)
						)
						.innerJoin(S0_T7).on(
							bracket(
								S0_T6.po_no.eq(S0_T7.po_no)
							)
						)
						.innerJoin(S0_T8).on(
							bracket(
								S0_T4.arr_schd_no.eq(S0_T8.arr_schd_no)
							)
						)
						.innerJoin(S0_T9).on(
							bracket(
								S0_T2.slo_d_no.eq(S0_T9.slo_d_no)
							)
						)
						.innerJoin(S0_T10).on(
							bracket(
								S0_T3.ship_schd_no.eq(S0_T10.ship_schd_no)
							)
						)
						.leftOuterJoin(
							subQuery()
							.select(
								S1_T1.purc_act_no,
								S1_T1.purc_act_seq,
								S1_T1.trd_cur_cd,
								S1_T1.ac_dt,
								S1_T1.ac_ym,
								S1_T1.purc_dt,
								S1_T1.xrate,
								S1_T1.ptax_xrate,
								S1_T2.purc_schd_no,
								S1_T2.purc_act_d_no,
								S1_T2.purc_act_d_seq,
								S1_T2.lot_no,
								S1_T2.sublot_no,
								S1_T2.bp_lot_no,
								S1_T2.ver_no,
								S1_T2.upri_not_tgt_flg,
								S1_T2.trd_cur_upri,
								S1_T2.interim_flg,
								S1_T2.trd_cur_amt,
								S1_T2.trd_cur_tax_amt,
								S1_T2.trd_cur_dscnt_amt,
								S1_T2.dscnt_rsn_cd,
								S1_T2.wtax_rate,
								S1_T2.wtax_amt,
								S1_T2.base_cur_upri,
								S1_T2.base_cur_dscnt_amt,
								S1_T2.base_cur_amt,
								S1_T2.base_cur_tax_amt,
								S1_T2.ptax_cur_upri,
								S1_T2.ptax_cur_dscnt_amt,
								S1_T2.ptax_cur_amt,
								S1_T2.ptax_cur_tax_amt,
								S1_T2.tax_cd,
								S1_T2.rsn_cd,
								S1_T2.bd_dpt_cd,
								S1_T2.base_unit_qty,
								S1_T2.bp_dlv_slip_no,
								S1_T2.bp_dlv_slip_d_no,
								S1_T1.ptax_dt
							)
							.from(
								S1_T1
								.innerJoin(S1_T2).on(
									bracket(
										S1_T1.purc_act_no.eq(S1_T2.purc_act_no)
										.and(S1_T1.purc_act_seq.eq(S1_T2.purc_act_seq))
									)
								)
							)
							.where(
								value(0).eq(value(0))
								.and(S1_T1.slip_sts_typ.eq(value(MAC_SLIP_STS_TYP.CRT.value())))
								.and(
									notExists(
										subQuery()
										.select(value("X"))
										.from(S2_T3)
										.where(
											value(0).eq(value(0))
											.and(S2_T3.cmpl_flg.eq(value(true)))
											.and(S2_T3.purc_act_d_no.eq(S1_T2.purc_act_d_no))
										)
									)
								)
							).view(S0_T12)
						).on(
							bracket(
								S0_T3.purc_act_d_no.eq(S0_T12.pr(S1_T2.purc_act_d_no))
							)
						)
						.leftOuterJoin(S0_T11).on(
							bracket(
								S0_T8.rcpt_iv_mng_no.eq(S0_T11.rcpt_iv_mng_no)
							)
						)
						.leftOuterJoin(S0_T13).on(
							bracket(
								S0_T8.dlv_slip_mng_d_no.eq(S0_T13.dlv_slip_mng_d_no)
								.and(S0_T8.dlv_slip_mng_d_seq.eq(S0_T13.dlv_slip_mng_d_seq))
							)
						)
						.leftOuterJoin(S0_T14).on(
							bracket(
								S0_T3.purc_schd_no.eq(S0_T14.purc_schd_no)
							)
						)
						.leftOuterJoin(S0_ITM).on(
							bracket(
								S0_T6.itm_cd.eq(S0_ITM.itm_cd)
								.and(S0_T6.itm_sub1.eq(S0_ITM.itm_sub1))
								.and(S0_T6.itm_sub2.eq(S0_ITM.itm_sub2))
								.and(S0_T6.itm_sub3.eq(S0_ITM.itm_sub3))
							)
						)
						.leftOuterJoin(S0_DLV).on(
							bracket(
								nvl(
									S0_T10.dlv_cd,
									S0_T6.dlv_cd
								).eq(S0_DLV.bp_cd)
							)
						)
						.leftOuterJoin(S0_DPT).on(
							bracket(
								S0_T2.bd_dpt_cd.eq(S0_DPT.dpt_cd)
								.and(S0_T1.slo_dt.between(S0_DPT.st_dt, S0_DPT.end_dt))
							)
						)
						.leftOuterJoin(S0_SPPL).on(
							bracket(
								S0_T7.sppl_cd.eq(S0_SPPL.bp_cd)
							)
						)
						.leftOuterJoin(S0_SCHDTAX).on(
							bracket(
								S0_T2.tax_cd.eq(S0_SCHDTAX.tax_cd)
							)
						)
						.leftOuterJoin(S0_PSTAX).on(
							bracket(
								S0_T6.tax_cd.eq(S0_PSTAX.tax_cd)
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
						.leftOuterJoin(S0_CUR).on(
							bracket(
								nvl(
									S0_T12.pr(S1_T1.trd_cur_cd),
									S0_T7.trd_cur_cd
								).eq(S0_CUR.cur_cd)
							)
						)
						.leftOuterJoin(S0_TAX2).on(
							bracket(
								cases()
									.when(S0_T12.pr(S1_T2.purc_act_d_no).isNotNull())
										.then(S0_T12.pr(S1_T2.tax_cd))
									.when(S0_T14.rcpt_iv_d_no.isNotNull())
										.then(S0_T14.tax_cd)
									.otherwise(S0_T6.tax_cd).eq(S0_TAX2.tax_cd)
							)
						)
						.leftOuterJoin(S0_NEWTAX2).on(
							bracket(
								MAPA_TAX$F_GET_PURC_TAX_CD(
									S0_T6.itm_cd,
									S0_T6.itm_sub1,
									S0_T6.itm_sub2,
									S0_T6.itm_sub3,
									S0_T7.sppl_cd,
									bind("today")
								).eq(S0_NEWTAX2.tax_cd)
							)
						)
						.leftOuterJoin(S0_RSN3).on(
							bracket(
								nvl(
									S0_T12.pr(S1_T2.rsn_cd),
									S0_T6.purc_rsn_cd
								).eq(S0_RSN3.biz_rsn_cd)
							)
						)
						.leftOuterJoin(S0_RSN4).on(
							bracket(
								coalesce(
									S0_T12.pr(S1_T2.dscnt_rsn_cd),
									S0_T14.dscnt_rsn_cd,
									S0_T6.dscnt_rsn_cd
								).eq(S0_RSN4.biz_rsn_cd)
							)
						)
						.leftOuterJoin(S0_DPT2).on(
							bracket(
								nvl(
									S0_T12.pr(S1_T2.bd_dpt_cd),
									S0_T6.bd_dpt_cd
								).eq(S0_DPT2.dpt_cd)
								.and(
									nvl(
										S0_T12.pr(S1_T1.ac_dt),
										S0_T7.po_dt
									).between(S0_DPT2.st_dt, S0_DPT2.end_dt)
								)
							)
						)
						.crossJoin(S0_CO)
						.innerJoin(S0_DAC).on(
							bracket(
								S0_T1.sls_dpt_cd.eq(S0_DAC.dpt_cd)
							)
						)
					)
					.where(
						value(1).eq(value(1))
						.and(S0_T1.slo_no.eq(bind("srch_tgt_no")))
						.and(S0_T3.cmpl_flg.eq(value(false)))
						.and(S0_T3.sls_ac_abl_flg.eq(value(true)))
						.and(S0_T2.proc_typ.eq(value(MAC_SLO_PROC_TYP.PURC_DDLV.value())))
						.and(
							S0_SPPL.sppl_iv_flg.eq(value(false))
							.or(S0_T8.rcpt_iv_mng_no.isNotNull())
						)
						.cutoff$and(S0_T4.purc_schd_dt.lte(bind("purc_schd_dt")))
						.cutoff$and(S0_T13.purc_ddlv_dlv_slip_no.eq(bind("dlv_slip_no")))
					)
					.orderBy(S0_T2.disp_seq.asc())
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
					}),
					j -> j
						.add(MAVM_ITM_UNIT_R.class, r -> toCondition(
							r.getStringNE("join_itm_cd_"),
							r.getStringNE("join_itm_sub1_"),
							r.getStringNE("join_itm_sub2_"),
							r.getStringNE("join_itm_sub3_"),
							r.getStringNE("schd_unit_cd")
						))
						.addSelect(m -> toArray(
							m.conv_base_qty,
							m.conv_qty
						))
						.addMap((r, m) -> {
							r.setNumberNE("schd_conv_qty", m.conv_qty());
							r.setNumberNE("schd_conv_base_qty", m.conv_base_qty());
							r.setNumberNE("schd_trd_unit_conv_base_qty", m.conv_base_qty());
							r.setNumberNE("schd_trd_unit_conv_qty", m.conv_qty());
					}),
					j -> j
						.add(MAVM_ITM_UNIT_R.class, r -> toCondition(
							r.getStringNE("itm_cd"),
							r.getStringNE("itm_sub1"),
							r.getStringNE("itm_sub2"),
							r.getStringNE("itm_sub3"),
							r.getStringNE("purc_trd_unit_cd")
						))
						.addSelect(m -> toArray(
							m.conv_base_qty,
							m.conv_qty
						))
						.addMap((r, m) -> {
							r.setNumberNE("purc_s_trd_unit_conv_base_qty", m.conv_base_qty());
							r.setNumberNE("purc_s_trd_unit_conv_qty", m.conv_qty());
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
							r.getStringNE("sls_rsn_cd")
						))
						.addSelect(m -> toArray(
							m.biz_rsn_nm,
							m.sls_acxfr_flg
						))
						.addMap((r, m) -> {
							r.setStringNE("sls_rsn_nm", m.biz_rsn_nm());
							r.setBooleanNE("sls_acxfr_flg", m.sls_acxfr_flg());
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
					})
				)
			);
	}
	
	/**
	 * -- MSBBL1360_SLO_Query_S01
	 */
	static MCQueryPlan MSBBL1360_SLO_S01() {
		MST_SLO_R S0_T1 = MST_SLO_R.create("T1");
		MAM_CO_R S0_CO = MAM_CO_R.create("CO");
		MAM_BP_R S0_CST = MAM_BP_R.create("CST");
		MAM_DPT_R S0_DPT1 = MAM_DPT_R.create("DPT1");
		MAM_DPT_R S0_DPT2 = MAM_DPT_R.create("DPT2");
		MAVM_RD_DPT_R S0_DAC = MAVM_RD_DPT_R.create("DAC");
		MAM_EDI_IF_CTL_R S1_MA = MAM_EDI_IF_CTL_R.create("MA");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBBL1360_SLO_Query_S01")
					.mainQuery()
					.select(
						S0_T1.trd_cd,
						S0_T1.slo_no,
						S0_T1.qtn_no,
						S0_T1.qtn_rev,
						S0_T1.cst_cd,
						S0_CST.bp_nm.as("cst_nm"),
						S0_T1.sls_usr_cd,
						S0_T1.sls_dpt_cd,
						S0_DPT1.dpt_nm.as("sls_dpt_nm"),
						S0_T1.wg_cd,
						S0_T1.trd_cur_cd,
						S0_CO.base_cur_cd,
						S0_T1.xrate_inpt_flg,
						decode(
							S0_T1.xrate_inpt_flg,
							value(true),
							S0_T1.xrate,
							MAPA_XCHNG$F_GET_SLS_XRATE_NE(
								S0_T1.trd_cur_cd,
								bind("today")
							)
						).as("xrate"),
						S0_CO.ptax_cur_cd,
						S0_T1.ptax_xrate_inpt_flg,
						cases()
							.when(S0_T1.ptax_xrate_inpt_flg.eq(value(true)))
								.then(S0_T1.ptax_xrate)
							.when(S0_CO.ptax_cur_cd.isNull())
								.then(nullValue())
							.otherwise(
								MAPA_XCHNG$F_GET_XRATE_NE(
									S0_T1.trd_cur_cd,
									S0_CO.ptax_cur_cd,
									S0_CO.sls_xrate_cd,
									bind("today")
								)
							).as("ptax_xrate"),
						S0_T1.cst_po_no,
						S0_CST.acst_cd,
						S0_T1.ar_dpt_cd,
						S0_DPT2.dpt_nm.as("ar_dpt_nm"),
						S0_T1.trd_rmrks,
						S0_T1.tterm_cd1,
						S0_T1.tterm_rmrks1,
						S0_T1.tterm_cd2,
						S0_T1.tterm_rmrks2,
						S0_T1.tterm_cd3,
						S0_T1.tterm_rmrks3,
						S0_CST.sls_amt_rnd_typ,
						S0_CST.sls_upri_rnd_typ,
						S0_CST.sls_tax_rnd_typ,
						S0_CST.ar_dpt_typ,
						S0_CO.xrate_rnd_typ,
						S0_CO.wtax_rnd_typ,
						S0_CST.bill_crryovr_times.as("cst_bill_crryovr_times"),
						decode(
							bracket(
								subQuery()
								.select(S1_MA.bp_cd)
								.from(S1_MA)
								.where(
									S1_MA.bp_cd.eq(S0_T1.cst_cd)
									.and(bind("today").between(S1_MA.st_dt, S1_MA.end_dt))
									.and(S1_MA.if_proc_typ.eq(value(MAC_IF_PROC_TYP.ACCPT_RECV.value())))
									.and(S1_MA.del_flg.eq(value(false)))
								)
							),
							nullValue(),
							value(false),
							value(true)
						).as("edi_flg")
					)
					.from(
						S0_T1
						.crossJoin(S0_CO)
						.leftOuterJoin(S0_CST).on(
							bracket(
								S0_T1.cst_cd.eq(S0_CST.bp_cd)
							)
						)
						.leftOuterJoin(S0_DPT1).on(
							bracket(
								S0_T1.sls_dpt_cd.eq(S0_DPT1.dpt_cd)
								.and(S0_T1.slo_dt.between(S0_DPT1.st_dt, S0_DPT1.end_dt))
							)
						)
						.leftOuterJoin(S0_DPT2).on(
							bracket(
								S0_T1.ar_dpt_cd.eq(S0_DPT2.dpt_cd)
								.and(S0_T1.slo_dt.between(S0_DPT2.st_dt, S0_DPT2.end_dt))
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
						.and(S0_T1.slo_no.eq(bind("srch_tgt_no")))
						.and(S0_T1.can_flg.eq(value(false)))
						.and(S0_CST.cst_iv_flg.eq(value(false)))
						.and(
							S0_T1.aprv_flg.eq(value(false))
							.or(S0_T1.aprv_sts_typ.eq(value(MAC_APRV_STS_TYP.ACPT.value())))
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
							r.getStringNE("acst_cd")
						))
						.addSelect(m -> toArray(
							m.bp_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("acst_nm", m.bp_nm());
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
	 * -- MSBBL1360_SLS_ACT_D_Query_S01
	 */
	static MCQueryPlan MSBBL1360_SLS_ACT_D_S01() {
		MST_SLS_ACT_R S0_T1 = MST_SLS_ACT_R.create("T1");
		MST_SLS_ACT_D_R S0_T2 = MST_SLS_ACT_D_R.create("T2");
		MST_PURC_ACT_D_R S0_T3 = MST_PURC_ACT_D_R.create("T3");
		MST_PURC_ACT_R S0_T4 = MST_PURC_ACT_R.create("T4");
		MST_SLS_SCHD_R S0_T5 = MST_SLS_SCHD_R.create("T5");
		MST_SLO_D_R S0_T6 = MST_SLO_D_R.create("T6");
		MST_SHIP_PR_R S0_T7 = MST_SHIP_PR_R.create("T7");
		MST_PO_D_R S0_T8 = MST_PO_D_R.create("T8");
		MST_PO_R S0_T9 = MST_PO_R.create("T9");
		MST_ARR_PR_R S0_T10 = MST_ARR_PR_R.create("T10");
		MST_PURC_SCHD_R S0_T11 = MST_PURC_SCHD_R.create("T11");
		MST_ARR_SCHD_R S0_T12 = MST_ARR_SCHD_R.create("T12");
		MST_RCPT_IV_R S0_T13 = MST_RCPT_IV_R.create("T13");
		MAM_BP_R S0_DLV = MAM_BP_R.create("DLV");
		MAM_ITM_R S0_ITM = MAM_ITM_R.create("ITM");
		MAM_UNIT_R S0_UNIT = MAM_UNIT_R.create("UNIT");
		MAVM_ITM_UNIT_R S0_IU = MAVM_ITM_UNIT_R.create("IU");
		MAVM_ITM_UNIT_R S0_SIU = MAVM_ITM_UNIT_R.create("SIU");
		MAVM_ITM_UNIT_R S0_PSIU = MAVM_ITM_UNIT_R.create("PSIU");
		MAVM_ITM_UNIT_R S0_PIU = MAVM_ITM_UNIT_R.create("PIU");
		MAM_TAX_R S0_PSTAX = MAM_TAX_R.create("PSTAX");
		MAM_UNIT_R S0_BUNIT = MAM_UNIT_R.create("BUNIT");
		MAVM_ITM_UNIT_R S0_BIU = MAVM_ITM_UNIT_R.create("BIU");
		MAM_BP_R S0_DEST1 = MAM_BP_R.create("DEST1");
		MAM_BP_R S0_DEST2 = MAM_BP_R.create("DEST2");
		MAM_BP_R S0_DEST3 = MAM_BP_R.create("DEST3");
		MAM_CNTRY_R S0_CNTRY = MAM_CNTRY_R.create("CNTRY");
		MAM_TAX_R S0_TAX = MAM_TAX_R.create("TAX");
		MAM_TAX_R S0_STAX = MAM_TAX_R.create("STAX");
		MAM_BIZ_RSN_R S0_RSN1 = MAM_BIZ_RSN_R.create("RSN1");
		MAM_BIZ_RSN_R S0_RSN2 = MAM_BIZ_RSN_R.create("RSN2");
		MAM_STK_GD_R S0_GD = MAM_STK_GD_R.create("GD");
		MAM_LOC_R S0_LOC = MAM_LOC_R.create("LOC");
		MAM_STR_LN_R S0_LN = MAM_STR_LN_R.create("LN");
		MSVT_WRK_SNO_R S0_WSNO = MSVT_WRK_SNO_R.create("WSNO");
		MAM_DPT_R S0_DPT = MAM_DPT_R.create("DPT");
		MAM_BP_R S0_SPPL = MAM_BP_R.create("SPPL");
		MAM_BP_R S0_MAKER = MAM_BP_R.create("MAKER");
		MAM_UNIT_R S0_CUNIT = MAM_UNIT_R.create("CUNIT");
		MAM_CUR_R S0_CUR = MAM_CUR_R.create("CUR");
		MAM_TAX_R S0_TAX2 = MAM_TAX_R.create("TAX2");
		MAM_BIZ_RSN_R S0_RSN3 = MAM_BIZ_RSN_R.create("RSN3");
		MAM_BIZ_RSN_R S0_RSN4 = MAM_BIZ_RSN_R.create("RSN4");
		MAM_DPT_R S0_DPT2 = MAM_DPT_R.create("DPT2");
		MAM_EXT_SYS_R S0_EXT = MAM_EXT_SYS_R.create("EXT");
		MST_PURC_ACT_D_R S1_W1 = MST_PURC_ACT_D_R.create("W1");
		MST_PURC_ACT_R S1_W2 = MST_PURC_ACT_R.create("W2");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBBL1360_SLS_ACT_D_Query_S01")
					.mainQuery()
					.select(
						nvl(
							S0_T5.abort_flg,
							value(false)
						).as("abort_flg"),
						S0_T2.itm_cd,
						S0_T2.itm_sub1,
						S0_T2.itm_sub2,
						S0_T2.itm_sub3,
						nvl(
							S0_T2.itm_nm,
							S0_ITM.itm_nm
						).as("itm_nm"),
						S0_ITM.asset_mng_typ,
						S0_ITM.ver_flg,
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
						S0_DLV.cntry_cd,
						S0_CNTRY.cntry_nm,
						S0_T2.pri_prnt_flg,
						S0_T2.dest_cd1,
						S0_DEST1.bp_nm.as("dest_nm1"),
						S0_T2.dest_cd2,
						S0_DEST2.bp_nm.as("dest_nm2"),
						S0_T2.dest_cd3,
						S0_DEST3.bp_nm.as("dest_nm3"),
						S0_T2.trd_unit_cd,
						S0_UNIT.unit_nm.as("trd_unit_nm"),
						S0_T2.trd_unit_qty,
						S0_T2.base_unit_cd,
						S0_BUNIT.unit_nm.as("base_unit_nm"),
						S0_T2.base_unit_qty,
						S0_T5.base_unit_qty.as("sls_schd_qty"),
						S0_T5.base_unit_sls_qty.as("sls_qty"),
						S0_T2.interim_flg,
						S0_T2.trd_cur_upri,
						S0_T2.trd_cur_amt,
						bracket(
							S0_T2.trd_cur_amt.add(S0_T2.trd_cur_tax_amt)
						).as("trd_cur_inc_tax_amt"),
						S0_T2.cost_upri,
						S0_T2.cost_amt,
						nvl(
							S0_T6.tax_fix_flg,
							value(false)
						).as("tax_fix_flg"),
						S0_T2.tax_cd,
						S0_TAX.tax_nm,
						S0_TAX.tax_rate,
						S0_T2.trd_cur_tax_amt,
						S0_T2.trd_cur_dscnt_amt,
						S0_T2.dscnt_rsn_cd,
						S0_RSN1.biz_rsn_nm.as("dscnt_rsn_nm"),
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
						S0_GD.gd_nm,
						S0_T2.cst_po_d_no,
						S0_T2.cst_itm_cd,
						S0_T2.cst_itm_nm,
						S0_T2.rsn_cd.as("sls_rsn_cd"),
						S0_RSN2.biz_rsn_nm.as("sls_rsn_nm"),
						S0_T2.bd_dpt_cd,
						S0_DPT.dpt_nm.as("bd_dpt_nm"),
						S0_T2.wtax_rate,
						S0_T2.wtax_amt,
						S0_T2.ext_sys_cd,
						S0_EXT.ext_sys_nm,
						S0_T2.ext_purc_act_d_no,
						S0_T2.trd_d_rmrks,
						S0_T2.intr_rmrks,
						S0_T2.sub_char1,
						S0_T2.sub_char2,
						S0_T2.sub_char3,
						S0_T2.sls_act_d_no,
						S0_T4.ac_ym.as("purc_ac_ym"),
						S0_T4.ac_dt.as("purc_ac_dt"),
						S0_T4.purc_dt,
						S0_T2.purc_act_no,
						S0_T2.purc_act_d_no,
						S0_T2.purc_ddlv_po_no.as("po_no"),
						S0_T2.purc_ddlv_po_d_no.as("po_d_no"),
						S0_T4.sppl_cd,
						S0_SPPL.bp_nm.as("sppl_nm"),
						S0_SPPL.sppl_iv_flg,
						S0_SPPL.subcon_flg,
						S0_T3.maker_cd,
						S0_MAKER.bp_nm.as("maker_nm"),
						S0_T3.bp_dlv_slip_no,
						S0_T3.bp_dlv_slip_d_no,
						S0_T2.lot_no,
						S0_T2.sublot_no,
						S0_T3.bp_lot_no,
						S0_ITM.cont_fctr_unit_cd,
						S0_CUNIT.unit_cd.as("cont_fctr_unit_nm"),
						S0_ITM.std_cont_fctr,
						S0_ITM.cont_fctr_flg,
						S0_ITM.cont_fctr_rnd_typ,
						S0_ITM.cont_fctr_dec_place,
						S0_T2.sno1,
						S0_T2.sno2,
						S0_T2.sno3,
						S0_T2.sno4,
						S0_WSNO.wrk_no,
						S0_WSNO.wrk_nm,
						S0_T4.trd_cur_cd.as("purc_trd_cur_cd"),
						S0_CUR.cur_nm.as("purc_trd_cur_nm"),
						decode(
							S0_T13.rcpt_iv_no,
							nullValue(),
							S0_T9.xrate_inpt_flg,
							S0_T13.xrate_inpt_flg
						).as("purc_xrate_inpt_flg"),
						S0_T4.xrate.as("purc_xrate"),
						decode(
							S0_T13.rcpt_iv_no,
							nullValue(),
							S0_T9.ptax_xrate_inpt_flg,
							S0_T13.ptax_xrate_inpt_flg
						).as("purc_ptax_xrate_inpt_flg"),
						S0_T4.ptax_xrate.as("purc_ptax_xrate"),
						S0_T3.upri_not_tgt_flg.as("purc_upri_not_tgt_flg"),
						S0_T3.trd_cur_upri.as("purc_trd_cur_upri"),
						S0_T3.interim_flg.as("purc_interim_flg"),
						S0_T3.trd_cur_amt.as("purc_trd_cur_amt"),
						S0_T3.trd_cur_amt.add(S0_T3.trd_cur_tax_amt).as("purc_trd_cur_inc_tax_amt"),
						S0_T8.tax_fix_flg.as("purc_tax_fix_flg"),
						S0_T3.trd_cur_dscnt_amt.as("purc_trd_cur_dscnt_amt"),
						S0_T3.dscnt_rsn_cd.as("purc_dscnt_rsn_cd"),
						S0_RSN4.biz_rsn_nm.as("purc_dscnt_rsn_nm"),
						S0_T3.tax_cd.as("purc_tax_cd"),
						S0_TAX2.tax_nm.as("purc_tax_nm"),
						S0_TAX2.tax_rate.as("purc_tax_rate"),
						S0_T3.trd_cur_tax_amt.as("purc_trd_cur_tax_amt"),
						S0_T3.rsn_cd.as("purc_rsn_cd"),
						S0_RSN3.biz_rsn_nm.as("purc_rsn_nm"),
						S0_T3.bd_dpt_cd.as("purc_bd_dpt_cd"),
						S0_DPT2.dpt_cd.as("purc_bd_dpt_nm"),
						S0_T3.base_unit_qty.as("purc_qty"),
						S0_T11.base_unit_schd_qty.as("purc_schd_qty"),
						S0_T3.base_cur_upri.as("purc_base_cur_upri"),
						S0_T3.base_cur_dscnt_amt.as("purc_base_cur_dscnt_amt"),
						S0_T3.base_cur_amt.as("purc_base_cur_amt"),
						S0_T3.base_cur_tax_amt.as("purc_base_cur_tax_amt"),
						S0_T3.base_cur_amt.add(S0_T3.base_cur_tax_amt).as("purc_base_cur_inc_tax_amt"),
						S0_T3.ptax_cur_upri.as("purc_ptax_cur_upri"),
						S0_T3.ptax_cur_dscnt_amt.as("purc_ptax_cur_dscnt_amt"),
						S0_T3.ptax_cur_amt.as("purc_ptax_cur_amt"),
						S0_T3.ptax_cur_tax_amt.as("purc_ptax_cur_tax_amt"),
						S0_T3.ptax_cur_amt.add(S0_T3.ptax_cur_tax_amt).as("purc_ptax_cur_inc_tax_amt"),
						S0_T3.wtax_rate.as("purc_wtax_rate"),
						S0_T3.wtax_amt.as("purc_wtax_amt"),
						S0_T3.trd_unit_cd.as("purc_trd_unit_cd"),
						S0_T3.trd_unit_qty.as("purc_trd_unit_qty"),
						S0_PIU.conv_base_qty.as("purc_trd_unit_conv_base_qty"),
						S0_PIU.conv_qty.as("purc_trd_unit_conv_qty"),
						S0_PIU.dec_place.as("purc_trd_unit_dec_place"),
						S0_T3.base_unit_qty.as("purc_base_unit_qty"),
						S0_T9.po_print_rmrks,
						S0_T8.po_print_d_rmrks,
						S0_T8.outsrc_flg,
						S0_T2.dlv_slip_d_no,
						S0_T2.slo_d_no,
						S0_T2.dlv_slip_d_no,
						S0_T2.disp_seq,
						S0_ITM.lot_mng_typ,
						S0_ITM.sublot_mng_typ,
						S0_T2.sno1_mng_typ,
						S0_T2.sno2_mng_typ,
						S0_T2.sno3_mng_typ,
						S0_T2.sno4_mng_typ,
						S0_ITM.stk_mng_typ,
						S0_ITM.dscnt_itm_flg,
						S0_IU.dec_place.as("trd_unit_dec_place"),
						S0_IU.conv_base_qty.as("trd_unit_conv_base_qty"),
						S0_IU.conv_qty.as("trd_unit_conv_qty"),
						S0_IU.rnd_typ.as("trd_unit_rnd_typ"),
						S0_ITM.dec_place.as("base_unit_dec_place"),
						S0_ITM.rnd_typ.as("base_unit_rnd_typ"),
						S0_ITM.bill_crryovr_times.as("itm_bill_crryovr_times"),
						S0_LOC.str_ln_tgt_flg,
						S0_LOC.site_cd,
						S0_TAX.inc_tax_flg,
						S0_TAX.tax_typ,
						S0_DLV.dlv_sundry_flg,
						S0_RSN2.sls_acxfr_flg,
						S0_T6.base_unit_qty.as("init_schd_qty"),
						S0_T6.trd_cur_dscnt_amt.as("init_schd_dscnt_amt"),
						S0_T1.sls_act_no,
						S0_T1.sls_act_seq,
						S0_T2.sls_act_d_seq,
						S0_T2.sls_schd_no,
						S0_T11.purc_schd_no,
						S0_T7.upd_cntr.as("sls_schd_upd_cntr"),
						S0_T10.arr_pr_no,
						S0_T7.ship_pr_no,
						S0_T10.upd_cntr.as("arr_pr_upd_cntr"),
						S0_T7.upd_cntr.as("ship_pr_upd_cntr"),
						cases()
							.when(S0_T12.lot_no.isNotNull())
								.then(value(true))
							.otherwise(value(false)).as("arr_schd_lot_fix_flg"),
						decode(
							S0_STAX.inc_tax_flg,
							value(false),
							S0_T6.trd_cur_amt,
							S0_T6.trd_cur_amt.add(S0_T6.trd_cur_tax_amt)
						).as("init_schd_amt"),
						S0_SIU.conv_base_qty.as("schd_trd_unit_conv_base_qty"),
						S0_SIU.conv_qty.as("schd_trd_unit_conv_qty"),
						decode(
							S0_PSTAX.inc_tax_flg,
							value(false),
							S0_T8.trd_cur_amt,
							S0_T8.trd_cur_amt.add(S0_T8.trd_cur_tax_amt)
						).as("purc_schd_init_amt"),
						S0_T8.base_unit_qty.as("purc_schd_init_qty"),
						S0_PSIU.conv_base_qty.as("purc_s_trd_unit_conv_base_qty"),
						S0_PSIU.conv_qty.as("purc_s_trd_unit_conv_qty"),
						S0_CUR.amt_dec_place.as("purc_trd_cur_amt_dec_place"),
						S0_CUR.upri_dec_place.as("purc_trd_cur_upri_dec_place"),
						S0_SPPL.purc_amt_rnd_typ,
						S0_SPPL.purc_tax_rnd_typ,
						S0_T2.sls_dtl_upd_flg,
						S0_T6.trd_cur_tax_amt.as("init_trd_cur_tax_amt"),
						S0_T6.trd_unit_cd.as("init_trd_unit_cd"),
						S0_T6.trd_unit_qty.as("init_trd_unit_qty"),
						S0_T6.trd_cur_upri.as("init_trd_cur_upri"),
						S0_T6.trd_cur_dscnt_amt.as("init_trd_cur_dscnt_amt"),
						S0_STAX.inc_tax_flg.as("init_inc_tax_flg"),
						S0_STAX.tax_rate.as("init_tax_rate"),
						S0_T3.purc_dtl_upd_flg,
						S0_T8.trd_cur_tax_amt.as("purc_init_trd_cur_tax_amt"),
						S0_T8.trd_unit_cd.as("purc_init_trd_unit_cd"),
						S0_T8.trd_unit_qty.as("purc_init_trd_unit_qty"),
						S0_T8.trd_cur_upri.as("purc_init_trd_cur_upri"),
						S0_T8.trd_cur_dscnt_amt.as("purc_init_trd_cur_dscnt_amt"),
						S0_PSTAX.inc_tax_flg.as("purc_init_inc_tax_flg"),
						S0_PSTAX.tax_rate.as("purc_init_tax_rate"),
						S0_T4.ptax_dt.as("ptax_dt"),
						S0_T8.trd_cur_amt.as("purc_schd_init_ex_amt"),
						S0_T2.base_unit_qty.as("base_unit_qty_bef"),
						S0_T11.base_unit_purc_qty.add(S0_T11.base_unit_accpt_dfct_qty).as("base_unit_purc_qty"),
						S0_T11.base_unit_schd_qty.as("base_unit_purc_schd_qty")
					)
					.from(
						S0_T1
						.innerJoin(S0_T2).on(
							bracket(
								S0_T1.sls_act_no.eq(S0_T2.sls_act_no)
								.and(S0_T1.sls_act_seq.eq(S0_T2.sls_act_seq))
							)
						)
						.leftOuterJoin(S0_T3).on(
							bracket(
								S0_T2.purc_act_d_no.eq(S0_T3.purc_act_d_no)
								.and(
									S0_T3.purc_act_d_seq.eq(subQuery()
										.select(max(S1_W1.purc_act_d_seq))
										.from(
											S1_W1
											.innerJoin(S1_W2).on(
												S1_W1.purc_act_no.eq(S1_W2.purc_act_no)
												.and(S1_W1.purc_act_seq.eq(S1_W2.purc_act_seq))
											)
										)
										.where(
											S1_W2.slip_sts_typ.neq(value(MAC_SLIP_STS_TYP.CAN.value()))
											.and(S1_W1.purc_act_d_no.eq(S0_T2.purc_act_d_no))
										)
									)
								)
							)
						)
						.leftOuterJoin(S0_T4).on(
							bracket(
								S0_T3.purc_act_no.eq(S0_T4.purc_act_no)
								.and(S0_T3.purc_act_seq.eq(S0_T4.purc_act_seq))
							)
						)
						.leftOuterJoin(S0_T5).on(
							bracket(
								S0_T2.sls_schd_no.eq(S0_T5.sls_schd_no)
							)
						)
						.leftOuterJoin(S0_T6).on(
							bracket(
								S0_T2.slo_d_no.eq(S0_T6.slo_d_no)
							)
						)
						.leftOuterJoin(S0_T7).on(
							bracket(
								S0_T2.slo_d_no.eq(S0_T7.slo_d_no)
							)
						)
						.leftOuterJoin(S0_T8).on(
							bracket(
								S0_T3.po_d_no.eq(S0_T8.po_d_no)
							)
						)
						.leftOuterJoin(S0_T9).on(
							bracket(
								S0_T8.po_no.eq(S0_T9.po_no)
							)
						)
						.leftOuterJoin(S0_T10).on(
							bracket(
								S0_T8.po_d_no.eq(S0_T10.po_d_no)
							)
						)
						.leftOuterJoin(S0_T11).on(
							bracket(
								S0_T5.purc_schd_no.eq(S0_T11.purc_schd_no)
							)
						)
						.leftOuterJoin(S0_T12).on(
							bracket(
								S0_T11.arr_schd_no.eq(S0_T12.arr_schd_no)
							)
						)
						.leftOuterJoin(S0_T13).on(
							bracket(
								S0_T12.rcpt_iv_mng_no.eq(S0_T13.rcpt_iv_mng_no)
							)
						)
						.leftOuterJoin(S0_DLV).on(
							bracket(
								S0_T2.dlv_cd.eq(S0_DLV.bp_cd)
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
						.leftOuterJoin(S0_UNIT).on(
							bracket(
								S0_T2.trd_unit_cd.eq(S0_UNIT.unit_cd)
							)
						)
						.leftOuterJoin(S0_IU).on(
							bracket(
								S0_T2.itm_cd.eq(S0_IU.itm_cd)
								.and(S0_T2.itm_sub1.eq(S0_IU.itm_sub1))
								.and(S0_T2.itm_sub2.eq(S0_IU.itm_sub2))
								.and(S0_T2.itm_sub3.eq(S0_IU.itm_sub3))
								.and(S0_T2.trd_unit_cd.eq(S0_IU.unit_cd))
							)
						)
						.leftOuterJoin(S0_SIU).on(
							bracket(
								S0_T6.itm_cd.eq(S0_SIU.itm_cd)
								.and(S0_T6.itm_sub1.eq(S0_SIU.itm_sub1))
								.and(S0_T6.itm_sub2.eq(S0_SIU.itm_sub2))
								.and(S0_T6.itm_sub3.eq(S0_SIU.itm_sub3))
								.and(S0_T6.trd_unit_cd.eq(S0_SIU.unit_cd))
							)
						)
						.leftOuterJoin(S0_PSIU).on(
								bracket(
									S0_T8.itm_cd.eq(S0_PSIU.itm_cd)
									.and(S0_T8.itm_sub1.eq(S0_PSIU.itm_sub1))
									.and(S0_T8.itm_sub2.eq(S0_PSIU.itm_sub2))
									.and(S0_T8.itm_sub3.eq(S0_PSIU.itm_sub3))
									.and(S0_T8.trd_unit_cd.eq(S0_PSIU.unit_cd))
								)
							)
						.leftOuterJoin(S0_PIU).on(
								bracket(
									S0_T3.itm_cd.eq(S0_PIU.itm_cd)
									.and(S0_T3.itm_sub1.eq(S0_PIU.itm_sub1))
									.and(S0_T3.itm_sub2.eq(S0_PIU.itm_sub2))
									.and(S0_T3.itm_sub3.eq(S0_PIU.itm_sub3))
									.and(S0_T3.trd_unit_cd.eq(S0_PIU.unit_cd))
								)
							)
						.leftOuterJoin(S0_PSTAX).on(
							bracket(
								S0_T8.tax_cd.eq(S0_PSTAX.tax_cd)
							)
						)
						.leftOuterJoin(S0_BUNIT).on(
							bracket(
								S0_T2.base_unit_cd.eq(S0_BUNIT.unit_cd)
							)
						)
						.leftOuterJoin(S0_BIU).on(
							bracket(
								S0_T2.itm_cd.eq(S0_BIU.itm_cd)
								.and(S0_T2.itm_sub1.eq(S0_BIU.itm_sub1))
								.and(S0_T2.itm_sub2.eq(S0_BIU.itm_sub2))
								.and(S0_T2.itm_sub3.eq(S0_BIU.itm_sub3))
								.and(S0_T2.base_unit_cd.eq(S0_BIU.unit_cd))
							)
						)
						.leftOuterJoin(S0_DEST1).on(
							bracket(
								S0_T2.dest_cd1.eq(S0_DEST1.bp_cd)
							)
						)
						.leftOuterJoin(S0_DEST2).on(
							bracket(
								S0_T2.dest_cd2.eq(S0_DEST2.bp_cd)
							)
						)
						.leftOuterJoin(S0_DEST3).on(
							bracket(
								S0_T2.dest_cd3.eq(S0_DEST3.bp_cd)
							)
						)
						.leftOuterJoin(S0_CNTRY).on(
							bracket(
								S0_DLV.cntry_cd.eq(S0_CNTRY.cntry_cd)
							)
						)
						.leftOuterJoin(S0_TAX).on(
							bracket(
								S0_T2.tax_cd.eq(S0_TAX.tax_cd)
							)
						)
						.leftOuterJoin(S0_STAX).on(
							bracket(
								S0_T6.tax_cd.eq(S0_STAX.tax_cd)
							)
						)
						.leftOuterJoin(S0_RSN1).on(
							bracket(
								S0_T2.dscnt_rsn_cd.eq(S0_RSN1.biz_rsn_cd)
							)
						)
						.leftOuterJoin(S0_RSN2).on(
							bracket(
								S0_T2.rsn_cd.eq(S0_RSN2.biz_rsn_cd)
							)
						)
						.leftOuterJoin(S0_GD).on(
							bracket(
								S0_T2.gd_cd.eq(S0_GD.gd_cd)
							)
						)
						.leftOuterJoin(S0_LOC).on(
							bracket(
								S0_T2.loc_cd.eq(S0_LOC.loc_cd)
							)
						)
						.leftOuterJoin(S0_LN).on(
							bracket(
								S0_T2.loc_cd.eq(S0_LN.loc_cd)
								.and(S0_T2.str_ln_cd.eq(S0_LN.str_ln_cd))
							)
						)
						.leftOuterJoin(S0_WSNO).on(
							bracket(
								S0_T2.sno1.eq(S0_WSNO.sno1)
							)
						)
						.leftOuterJoin(S0_DPT).on(
							bracket(
								S0_T2.bd_dpt_cd.eq(S0_DPT.dpt_cd)
								.and(S0_T1.ac_dt.between(S0_DPT.st_dt, S0_DPT.end_dt))
							)
						)
						.leftOuterJoin(S0_SPPL).on(
							bracket(
								S0_T4.sppl_cd.eq(S0_SPPL.bp_cd)
							)
						)
						.leftOuterJoin(S0_MAKER).on(
							bracket(
								S0_T3.maker_cd.eq(S0_MAKER.bp_cd)
							)
						)
						.leftOuterJoin(S0_CUNIT).on(
							bracket(
								S0_ITM.cont_fctr_unit_cd.eq(S0_CUNIT.unit_cd)
							)
						)
						.leftOuterJoin(S0_CUR).on(
							bracket(
								S0_T4.trd_cur_cd.eq(S0_CUR.cur_cd)
							)
						)
						.leftOuterJoin(S0_TAX2).on(
							bracket(
								S0_T3.tax_cd.eq(S0_TAX2.tax_cd)
							)
						)
						.leftOuterJoin(S0_RSN3).on(
							bracket(
								S0_T3.rsn_cd.eq(S0_RSN3.biz_rsn_cd)
							)
						)
						.leftOuterJoin(S0_RSN4).on(
							bracket(
								S0_T3.dscnt_rsn_cd.eq(S0_RSN4.biz_rsn_cd)
							)
						)
						.leftOuterJoin(S0_DPT2).on(
							bracket(
								S0_T3.bd_dpt_cd.eq(S0_DPT2.dpt_cd)
								.and(S0_T4.ac_dt.between(S0_DPT2.st_dt, S0_DPT2.end_dt))
							)
						)
						.leftOuterJoin(S0_EXT).on(
							bracket(
								S0_T2.ext_sys_cd.eq(S0_EXT.ext_sys_cd)
							)
						)
					)
					.where(
						value(0).eq(value(0))
						.and(S0_T1.sls_act_no.eq(bind("sls_act_no")))
						.and(S0_T1.sls_act_seq.eq(bind("sls_act_seq")))
					)
					.orderBy(S0_T2.disp_seq.asc())
			);
	}
	
	/**
	 * -- MSBBL1360_SLS_ACT_IO_Query_S01
	 */
	static MCQueryPlan MSBBL1360_SLS_ACT_IO_S01() {
		MST_SLS_ACT_R S0_T1 = MST_SLS_ACT_R.create("T1");
		MST_SLS_ACT_D_R S0_T2 = MST_SLS_ACT_D_R.create("T2");
		MST_SLS_ACT_IO_R S0_T3 = MST_SLS_ACT_IO_R.create("T3");
		MST_PURC_ACT_IO_R S0_T4 = MST_PURC_ACT_IO_R.create("T4");
		MST_PURC_ACT_D_R S0_T5 = MST_PURC_ACT_D_R.create("T5");
		MST_PURC_ACT_R S0_T6 = MST_PURC_ACT_R.create("T6");
		MCTempView S0_T8 = createTempView("T8");
		MST_PURC_ACT_IO_R S1_W1 = MST_PURC_ACT_IO_R.create("W1");
		MST_PURC_ACT_D_R S1_W2 = MST_PURC_ACT_D_R.create("W2");
		MST_PURC_ACT_R S1_W3 = MST_PURC_ACT_R.create("W3");
		MST_SLS_ACT_R S2_T1 = MST_SLS_ACT_R.create("T1");
		MST_SLS_ACT_D_R S2_T2 = MST_SLS_ACT_D_R.create("T2");
		MST_SLS_ACT_IO_R S2_T3 = MST_SLS_ACT_IO_R.create("T3");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBBL1360_SLS_ACT_IO_Query_S01")
					.mainQuery()
					.select(
						S0_T3.sync_flg,
						S0_T3.trd_unit_cd,
						S0_T3.trd_unit_qty,
						S0_T3.base_unit_cd,
						S0_T3.base_unit_qty,
						S0_T4.base_unit_qty.as("purc_qty"),
						S0_T8.pr("base_unit_qty").as("sls_qty"),
						S0_T3.gd_cd,
						S0_T4.bp_dlv_slip_no,
						S0_T4.bp_dlv_slip_d_no,
						S0_T3.lot_no,
						S0_T3.sublot_no,
						S0_T4.bp_lot_no,
						S0_T3.sno1,
						S0_T3.sno2,
						S0_T3.sno3,
						S0_T3.sno4,
						S0_T3.purc_act_io_no,
						S0_T3.sls_act_io_no,
						S0_T3.sub_char1,
						S0_T3.sub_char2,
						S0_T3.sub_char3,
						S0_T2.itm_cd,
						S0_T2.itm_sub1,
						S0_T2.itm_sub2,
						S0_T2.itm_sub3,
						S0_T3.sls_act_io_seq,
						S0_T4.purc_act_io_seq,
						S0_T2.sls_act_d_no,
						S0_T3.arr_act_no.as("join_arr_act_no_")
					)
					.from(
						S0_T1
						.innerJoin(S0_T2).on(
							bracket(
								S0_T1.sls_act_no.eq(S0_T2.sls_act_no)
								.and(S0_T1.sls_act_seq.eq(S0_T2.sls_act_seq))
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
								S0_T3.purc_act_io_no.eq(S0_T4.purc_act_io_no)
								.and(
									S0_T4.purc_act_io_seq.eq(subQuery()
										.select(max(S1_W1.purc_act_io_seq))
										.from(
											S1_W1
											.innerJoin(S1_W2).on(
												S1_W1.purc_act_d_no.eq(S1_W2.purc_act_d_no)
												.and(S1_W1.purc_act_d_seq.eq(S1_W2.purc_act_d_seq))
											)
											.innerJoin(S1_W3).on(
												S1_W2.purc_act_no.eq(S1_W3.purc_act_no)
												.and(S1_W2.purc_act_seq.eq(S1_W3.purc_act_seq))
											)
										)
										.where(
											S1_W3.slip_sts_typ.neq(value(MAC_SLIP_STS_TYP.CAN.value()))
											.and(S1_W1.purc_act_io_no.eq(S0_T3.purc_act_io_no))
										)
									)
								)
							)
						)
						.leftOuterJoin(S0_T5).on(
							bracket(
								S0_T4.purc_act_d_no.eq(S0_T5.purc_act_d_no)
								.and(S0_T4.purc_act_d_seq.eq(S0_T5.purc_act_d_seq))
							)
						)
						.leftOuterJoin(S0_T6).on(
							bracket(
								S0_T5.purc_act_no.eq(S0_T6.purc_act_no)
								.and(S0_T5.purc_act_seq.eq(S0_T6.purc_act_seq))
								.and(S0_T6.slip_sts_typ.eq(value(MAC_SLIP_STS_TYP.CRT.value())))
							)
						)
						.leftOuterJoin(
							subQuery()
							.select(
								S2_T3.purc_act_io_no,
								sum(S2_T3.base_unit_qty).as("base_unit_qty")
							)
							.from(
								S2_T1
								.innerJoin(S2_T2).on(
									bracket(
										S2_T1.sls_act_no.eq(S2_T2.sls_act_no)
										.and(S2_T1.sls_act_seq.eq(S2_T2.sls_act_seq))
									)
								)
								.innerJoin(S2_T3).on(
									bracket(
										S2_T2.sls_act_d_no.eq(S2_T3.sls_act_d_no)
										.and(S2_T2.sls_act_d_seq.eq(S2_T3.sls_act_d_seq))
									)
								)
							)
							.where(
								value(0).eq(value(0))
								.and(S2_T1.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.SLS.value())))
								.and(S2_T1.slip_sts_typ.eq(value(MAC_SLIP_STS_TYP.CRT.value())))
							)
							.groupBy(S2_T3.purc_act_io_no).view(S0_T8)
						).on(
							bracket(
								S0_T8.pr(S2_T3.purc_act_io_no).eq(S0_T3.purc_act_io_no)
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
						.add(MST_ARR_ACT_R.class, r -> toCondition(
							r.getStringNE("join_arr_act_no_")
						))
						.addSelect(m -> toArray(
							m.purc_cont_qty,
							m.ship_fr_valid_dt,
							m.ver_no
						))
						.addMap((r, m) -> {
							r.setDateNE("ship_fr_valid_dt", m.ship_fr_valid_dt());
							r.setStringNE("ver_no", m.ver_no());
							r.setNumberNE("purc_cont_qty", m.purc_cont_qty());
					}),
					j -> j
						.add(MAM_ITM_R.class, r -> toCondition(
							r.getStringNE("itm_cd"),
							r.getStringNE("itm_sub1"),
							r.getStringNE("itm_sub2"),
							r.getStringNE("itm_sub3")
						))
						.addSelect(m -> toArray(
							m.cont_fctr_dec_place,
							m.cont_fctr_flg,
							m.cont_fctr_rnd_typ,
							m.cont_fctr_unit_cd,
							m.dec_place,
							m.lot_mng_typ,
							m.lot_no_typ,
							m.rnd_typ,
							m.sno1_mng_typ,
							m.sno2_mng_typ,
							m.sno3_mng_typ,
							m.sno4_mng_typ,
							m.std_cont_fctr,
							m.stk_mng_typ,
							m.sublot_mng_typ,
							m.sublot_no_typ,
							m.ver_flg
						))
						.addMap((r, m) -> {
							r.setStringNE("cont_fctr_unit_cd", m.cont_fctr_unit_cd());
							r.setNumberNE("std_cont_fctr", m.std_cont_fctr());
							r.setStringNE("lot_mng_typ", m.lot_mng_typ());
							r.setStringNE("sublot_mng_typ", m.sublot_mng_typ());
							r.setStringNE("lot_no_typ", m.lot_no_typ());
							r.setStringNE("sublot_no_typ", m.sublot_no_typ());
							r.setStringNE("sno1_mng_typ", m.sno1_mng_typ());
							r.setStringNE("sno2_mng_typ", m.sno2_mng_typ());
							r.setStringNE("sno3_mng_typ", m.sno3_mng_typ());
							r.setStringNE("sno4_mng_typ", m.sno4_mng_typ());
							r.setStringNE("stk_mng_typ", m.stk_mng_typ());
							r.setNumberNE("base_unit_dec_place", m.dec_place());
							r.setStringNE("base_unit_rnd_typ", m.rnd_typ());
							r.setBooleanNE("cont_fctr_flg", m.cont_fctr_flg());
							r.setStringNE("cont_fctr_rnd_typ", m.cont_fctr_rnd_typ());
							r.setNumberNE("cont_fctr_dec_place", m.cont_fctr_dec_place());
							r.setBooleanNE("ver_flg", m.ver_flg());
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
						.add(MAM_UNIT_R.class, r -> toCondition(
							r.getStringNE("cont_fctr_unit_cd")
						))
						.addSelect(m -> toArray(
							m.unit_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("cont_fctr_unit_nm", m.unit_nm());
					})
				)
			);
	}
	
	/**
	 * -- MSBBL1360_SLS_ACT_Query_S01
	 */
	static MCQueryPlan MSBBL1360_SLS_ACT_S01() {
		MST_SLS_ACT_R S0_T = MST_SLS_ACT_R.create("T");
		MAM_CO_R S0_CO = MAM_CO_R.create("CO");
		MAM_BP_R S0_CST = MAM_BP_R.create("CST");
		MAM_DPT_R S0_DPT1 = MAM_DPT_R.create("DPT1");
		MAM_DPT_R S0_DPT2 = MAM_DPT_R.create("DPT2");
		MCTempView S0_T1 = createTempView("T1");
		MAVM_RD_DPT_R S0_DAC = MAVM_RD_DPT_R.create("DAC");
		MST_DLV_SLIP_R S1_X = MST_DLV_SLIP_R.create("X");
		MST_SLS_ACT_R S5 = MST_SLS_ACT_R.create();
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBBL1360_SLS_ACT_Query_S01")
					.mainQuery()
					.select(
						S0_T.trd_cd,
						S0_T.ac_ym,
						S0_T.sls_act_no,
						S0_T.sls_act_rev,
						S0_T.sls_act_seq,
						S0_T.slo_no,
						S0_T.qtn_no,
						S0_T.qtn_rev,
						S0_T.dlv_slip_no,
						S0_T.sls_dt,
						S0_T.ac_dt,
						trunc(
							S0_T.dlv_tm,
							MCDateFmt.DD
						).as("dlv_dt"),
						S0_T.dlv_tm.as("dlv_hm"),
						S0_T.bill_basis_dt,
						S0_T.cst_cd,
						S0_CST.bp_nm.as("cst_nm"),
						S0_T.sls_usr_cd,
						S0_T.sls_dpt_cd,
						S0_DPT1.dpt_nm.as("sls_dpt_nm"),
						S0_T.wg_cd,
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
							.otherwise(value(false)).as("dlv_slip_prntd_flg"),
						S0_T.acst_cd,
						S0_T.ar_dpt_cd,
						S0_DPT2.dpt_nm.as("ar_dpt_nm"),
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
						S0_CST.sls_amt_rnd_typ,
						S0_CST.sls_upri_rnd_typ,
						S0_CST.sls_tax_rnd_typ,
						S0_CST.ar_dpt_typ,
						S0_CO.xrate_rnd_typ,
						S0_CO.wtax_rnd_typ,
						S0_CST.bill_crryovr_times.as("cst_bill_crryovr_times"),
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
						S0_T.slip_sts_typ,
						S0_T.edi_flg,
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
						).as("dlv_slip_seq")
					)
					.from(
						S0_T
						.crossJoin(S0_CO)
						.leftOuterJoin(S0_CST).on(
							bracket(
								S0_T.cst_cd.eq(S0_CST.bp_cd)
							)
						)
						.leftOuterJoin(S0_DPT1).on(
							bracket(
								S0_T.sls_dpt_cd.eq(S0_DPT1.dpt_cd)
								.and(S0_T.ac_dt.between(S0_DPT1.st_dt, S0_DPT1.end_dt))
							)
						)
						.leftOuterJoin(S0_DPT2).on(
							bracket(
								S0_T.ar_dpt_cd.eq(S0_DPT2.dpt_cd)
								.and(S0_T.ac_dt.between(S0_DPT2.st_dt, S0_DPT2.end_dt))
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
						.and(S0_T.sls_act_no.eq(bind("srch_tgt_no")))
						.and(S0_T.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.SLS.value())))
						.and(S0_CST.cst_iv_flg.eq(value(false)))
						.cutoff$and(
							S0_T.slip_sts_typ.eq(value(MAC_SLIP_STS_TYP.CRT.value()))
							.and(bind("latest_flg_str").eq(value(true)))
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
						.add(MST_SLO_R.class, r -> toCondition(
							r.getStringNE("slo_no")
						))
						.addSelect(m -> toArray(
							m.ptax_xrate_inpt_flg,
							m.upd_cntr,
							m.xrate_inpt_flg
						))
						.addMap((r, m) -> {
							r.setBooleanNE("xrate_inpt_flg", m.xrate_inpt_flg());
							r.setBooleanNE("ptax_xrate_inpt_flg", m.ptax_xrate_inpt_flg());
							r.setNumberNE("slo_upd_cntr", m.upd_cntr());
					})
				)
			);
	}
}