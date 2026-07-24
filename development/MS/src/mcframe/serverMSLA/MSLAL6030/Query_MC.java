package mcframe.serverMSLA.MSLAL6030;

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
	 * -- MSLAL6030_MST_ARR_SCHD_Query_S01
	 */
	static MCQueryPlan MSLAL6030_MST_ARR_SCHD_S01() {
		MCTempView S0_V1 = createTempView("V1");
		MAM_LOC_R S0_M2 = MAM_LOC_R.create("M2");
		MAM_ITM_R S0_M6 = MAM_ITM_R.create("M6");
		MAM_SUNDRY_ITM_R S0_M7 = MAM_SUNDRY_ITM_R.create("M7");
		MAVM_ITM_UNIT_R S0_M14 = MAVM_ITM_UNIT_R.create("M14");
		MAM_UNIT_R S0_M16 = MAM_UNIT_R.create("M16");
		MAM_UNIT_R S0_M17 = MAM_UNIT_R.create("M17");
		MSW_ARR_SCHD_KEY_R S1_W1 = MSW_ARR_SCHD_KEY_R.create("W1");
		MST_ARR_SCHD_R S1_T1 = MST_ARR_SCHD_R.create("T1");
		MST_ARR_PR_R S1_T2 = MST_ARR_PR_R.create("T2");
		MSVT_LOT_LIST_R S1_T3 = MSVT_LOT_LIST_R.create("T3");
		MST_PO_D_R S1_T4 = MST_PO_D_R.create("T4");
		MST_SLS_RET_SCHD_D_R S1_T5 = MST_SLS_RET_SCHD_D_R.create("T5");
		MST_DLV_SLIP_R S1_T6 = MST_DLV_SLIP_R.create("T6");
		MST_DLV_INST_D_R S1_T7 = MST_DLV_INST_D_R.create("T7");
		MST_PRMS_RCPT_D_R S1_T8 = MST_PRMS_RCPT_D_R.create("T8");
		MCTempView S1_T9 = createTempView("T9");
		MST_PURC_SCHD_R S1_T10 = MST_PURC_SCHD_R.create("T10");
		MST_RCPT_IV_D_R S1_T11 = MST_RCPT_IV_D_R.create("T11");
		MST_PURC_DLV_SLIP_R S1_T12 = MST_PURC_DLV_SLIP_R.create("T12");
		MST_PURC_DLV_SLIP_D_R S1_T13 = MST_PURC_DLV_SLIP_D_R.create("T13");
		MSW_ARR_SCHD_KEY_R S2_W1 = MSW_ARR_SCHD_KEY_R.create("W1");
		MST_ARR_SCHD_R S2_W2 = MST_ARR_SCHD_R.create("W2");
		MST_PURC_SCHD_R S2_W3 = MST_PURC_SCHD_R.create("W3");
		MST_PURC_ACT_D_R S2_W4 = MST_PURC_ACT_D_R.create("W4");
		MST_PURC_ACT_R S2_W5 = MST_PURC_ACT_R.create("W5");
		MST_PURC_ACT_IO_R S2_W6 = MST_PURC_ACT_IO_R.create("W6");
		MST_DLV_SLIP_R S2_W7 = MST_DLV_SLIP_R.create("W7");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSLAL6030_MST_ARR_SCHD_Query_S01")
					.mainQuery()
					.select(
						S0_V1.pr(S1_T1.arr_schd_no),
						S0_V1.pr(S1_T4.po_no),
						S0_V1.pr(S1_T2.po_d_no),
						S0_V1.pr(S1_T7.dlv_inst_no),
						S0_V1.pr(S1_T1.dlv_inst_d_no),
						S0_V1.pr(S1_T8.prms_rcpt_no),
						S0_V1.pr(S1_T1.prms_rcpt_d_no),
						S0_V1.pr(S2_W4.purc_act_no),
						S0_V1.pr(S2_W4.purc_act_d_no),
						S0_V1.pr(S2_W6.purc_act_io_no),
						S0_V1.pr(S1_T1.rcpt_iv_no),
						S0_V1.pr(S1_T1.rcpt_iv_mng_no),
						S0_V1.pr(S1_T11.rcpt_iv_d_no),
						S0_V1.pr(S1_T5.sls_ret_schd_no),
						S0_V1.pr(S1_T2.sls_ret_schd_d_no),
						S0_V1.pr("dlv_slip_no"),
						S0_V1.pr(S1_T12.dlv_slip_seq),
						S0_V1.pr("dlv_slip_d_no"),
						S0_V1.pr(S1_T13.dlv_slip_d_seq),
						S0_V1.pr(S1_T1.iv_no),
						S0_V1.pr(S1_T2.iv_d_no),
						S0_V1.pr(S1_T2.trd_cd),
						S0_V1.pr(S1_T2.trd_ptn_typ),
						S0_V1.pr(S1_T1.arr_schd_tm),
						S0_V1.pr("arr_loc_cd"),
						S0_M2.loc_nm.as("arr_loc_nm"),
						S0_V1.pr("str_ln_cd").as("arr_str_ln_cd"),
						S0_V1.pr(S1_T1.itm_cd),
						S0_V1.pr(S1_T1.itm_sub1),
						S0_V1.pr(S1_T1.itm_sub2),
						S0_V1.pr(S1_T1.itm_sub3),
						decode(
							S0_V1.pr(S1_T1.sundry_itm_flg),
							value(true),
							nvl(
								S0_V1.pr(S1_T1.itm_nm),
								S0_M7.itm_nm
							),
							S0_M6.itm_nm
						).as("itm_nm"),
						S0_V1.pr(S1_T1.lot_no),
						S0_V1.pr(S1_T1.sublot_no),
						S0_V1.pr(S1_T1.ver_no),
						S0_V1.pr(S1_T1.sno1),
						S0_V1.pr(S1_T1.sno2),
						S0_V1.pr(S1_T1.sno3),
						S0_V1.pr(S1_T1.sno4),
						S0_V1.pr(S1_T1.gd_cd),
						S0_V1.pr(S1_T1.quality_typ),
						S0_V1.pr(S1_T1.stk_insp_typ),
						S0_V1.pr(S1_T1.stk_id_typ),
						S0_V1.pr(S1_T1.stk_bp_cd),
						S0_V1.pr("trd_unit_qty"),
						S0_V1.pr("trd_unit_cd"),
						MAPA_CALC$F_RND_NE(
							bracket(
								S0_M14.conv_qty.divide(S0_M14.conv_base_qty)
							),
							S0_M14.dec_place,
							S0_M14.rnd_typ
						).as("trd_unit_bnum"),
						S0_V1.pr("trd_unit_qty").multiply(S0_M14.unit_wt).as("trd_unit_wt"),
						S0_V1.pr("trd_unit_qty").multiply(S0_M14.unit_dim).as("trd_unit_dim"),
						nvl2(
							S0_M14.unit_wt,
							S0_M16.unit_cd,
							nullValue()
						).as("wt_unit_cd"),
						nvl2(
							S0_M14.unit_wt,
							S0_M16.unit_nm,
							nullValue()
						).as("wt_unit_nm"),
						nvl2(
							S0_M14.unit_dim,
							S0_M17.unit_cd,
							nullValue()
						).as("dim_unit_cd"),
						nvl2(
							S0_M14.unit_dim,
							S0_M17.unit_nm,
							nullValue()
						).as("dim_unit_nm"),
						S0_V1.pr("base_unit_qty"),
						S0_V1.pr("base_unit_cd"),
						S0_V1.pr(S1_T1.abort_flg),
						S0_V1.pr(S1_T3.vld_dt),
						S0_V1.pr(S1_T3.lmt_dt),
						S0_V1.pr(S1_T2.sppl_cd),
						S0_V1.pr(S1_T2.cst_cd),
						S0_V1.pr(S1_T6.ship_fr_lg_grp_cd).as("ship_lg_grp_cd"),
						S0_V1.pr(S1_T1.sppl_itm_cd),
						S0_V1.pr(S1_T1.sppl_itm_nm),
						S0_V1.pr(S1_T1.maker_cd),
						S0_V1.pr(S1_T1.bp_lot_no),
						S0_V1.pr("rsn_cd"),
						S0_V1.pr(S1_T1.arr_cnt_rmrks),
						decode(
							S0_M2.sppl_cd,
							nullValue(),
							value(false),
							value(true)
						).as("prov_arr_flg"),
						// this field is appended by sql coverter.
						S0_M2.lg_grp_cd.as("join_lg_grp_cd_"),
						S0_V1.pr("dlv_inst_print_d_rmrks"),
						S0_V1.pr("prms_rmrks")
					)
					.from(
						subQuery()
						.select(
							S1_T1.arr_schd_no,
							S1_T4.po_no,
							S1_T2.po_d_no,
							S1_T7.dlv_inst_no,
							S1_T1.dlv_inst_d_no,
							S1_T8.prms_rcpt_no,
							S1_T1.prms_rcpt_d_no,
							S1_T9.pr(S2_W4.purc_act_no),
							S1_T9.pr(S2_W4.purc_act_d_no),
							S1_T9.pr(S2_W6.purc_act_io_no),
							S1_T1.rcpt_iv_no,
							S1_T1.rcpt_iv_mng_no,
							S1_T11.rcpt_iv_d_no,
							S1_T5.sls_ret_schd_no,
							S1_T2.sls_ret_schd_d_no,
							cases()
								.when(S1_T2.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.SLS_RTN.value())))
									.then(nullValue())
								.when(S1_T2.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.SHIP_RTN.value())))
									.then(nullValue())
								.otherwise(S1_T1.dlv_slip_no).as("dlv_slip_no"),
								S1_T12.dlv_slip_seq,
							cases()
								.when(S1_T2.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.SLS_RTN.value())))
									.then(nullValue())
								.when(S1_T2.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.SHIP_RTN.value())))
									.then(nullValue())
								.when(S1_T1.dlv_slip_mng_d_no.isNotNull())
									.then(S1_T13.dlv_slip_d_no)
								.otherwise(S1_T2.dlv_slip_d_no).as("dlv_slip_d_no"),
								S1_T13.dlv_slip_d_seq,
							S1_T1.iv_no,
							S1_T2.iv_d_no,
							S1_T2.trd_cd,
							S1_T2.trd_ptn_typ,
							S1_T1.arr_schd_tm,
							decode(
								S1_T9.pr(S2_W6.purc_act_io_no),
								nullValue(),
								S1_T1.arr_loc_cd,
								S1_T9.pr(S2_W6.in_to_loc_cd)
							).as("arr_loc_cd"),
							decode(
								S1_T9.pr(S2_W6.purc_act_io_no),
								nullValue(),
								S1_T1.str_ln_cd,
								S1_T9.pr(S2_W6.str_ln_cd)
							).as("str_ln_cd"),
							S1_T1.itm_cd,
							S1_T1.itm_sub1,
							S1_T1.itm_sub2,
							S1_T1.itm_sub3,
							S1_T1.itm_nm,
							S1_T1.sundry_itm_flg,
							S1_T1.lot_no,
							S1_T1.sublot_no,
							S1_T1.ver_no,
							S1_T1.sno1,
							S1_T1.sno2,
							S1_T1.sno3,
							S1_T1.sno4,
							S1_T1.gd_cd,
							S1_T1.quality_typ,
							S1_T1.stk_insp_typ,
							S1_T1.stk_id_typ,
							S1_T1.stk_bp_cd,
							decode(
								S1_T9.pr(S2_W6.purc_act_io_no),
								nullValue(),
								S1_T1.trd_unit_qty,
								S1_T9.pr(S2_W6.trd_unit_qty)
							).as("trd_unit_qty"),
							decode(
								S1_T9.pr(S2_W6.purc_act_io_no),
								nullValue(),
								S1_T1.trd_unit_cd,
								S1_T9.pr(S2_W6.trd_unit_cd)
							).as("trd_unit_cd"),
							decode(
								S1_T9.pr(S2_W6.purc_act_io_no),
								nullValue(),
								S1_T1.base_unit_qty,
								S1_T9.pr(S2_W6.base_unit_qty)
							).as("base_unit_qty"),
							decode(
								S1_T9.pr(S2_W6.purc_act_io_no),
								nullValue(),
								S1_T1.base_unit_cd,
								S1_T9.pr(S2_W6.base_unit_cd)
							).as("base_unit_cd"),
							S1_T1.abort_flg,
							S1_T3.vld_dt,
							S1_T3.lmt_dt,
							S1_T2.sppl_cd,
							S1_T2.cst_cd,
							S1_T6.ship_fr_lg_grp_cd,
							S1_T1.sppl_itm_cd,
							S1_T1.sppl_itm_nm,
							S1_T1.maker_cd,
							S1_T1.bp_lot_no,
							decode(
								S1_T9.pr(S2_W6.purc_act_io_no),
								nullValue(),
								S1_T2.rsn_cd,
								S1_T9.pr(S2_W4.rsn_cd)
							).as("rsn_cd"),
							S1_T1.arr_cnt_rmrks,
							S1_T7.dlv_inst_print_d_rmrks,
							S1_T8.prms_rmrks
						)
						.from(
							S1_W1
							.innerJoin(S1_T1).on(
								bracket(
									S1_T1.arr_schd_no.eq(S1_W1.arr_schd_no)
								)
							)
							.innerJoin(S1_T2).on(
								bracket(
									S1_T2.arr_pr_no.eq(S1_T1.arr_pr_no)
								)
							)
							.leftOuterJoin(S1_T3).on(
								bracket(
									S1_T3.itm_cd.eq(S1_T1.itm_cd)
									.and(S1_T3.itm_sub1.eq(S1_T1.itm_sub1))
									.and(S1_T3.itm_sub2.eq(S1_T1.itm_sub2))
									.and(S1_T3.itm_sub3.eq(S1_T1.itm_sub3))
									.and(S1_T3.lot_no.eq(S1_T1.lot_no))
									.and(S1_T3.sublot_no.eq(S1_T1.sublot_no))
								)
							)
							.leftOuterJoin(S1_T4).on(
								bracket(
									S1_T4.po_d_no.eq(S1_T2.po_d_no)
								)
							)
							.leftOuterJoin(S1_T5).on(
								bracket(
									S1_T5.sls_ret_schd_d_no.eq(S1_T2.sls_ret_schd_d_no)
								)
							)
							.leftOuterJoin(S1_T6).on(
								bracket(
									S1_T6.dlv_slip_no.eq(S1_T1.dlv_slip_no)
									.and(S1_T6.dlv_slip_seq.eq(
										subQuery()
											.select(max(S2_W7.dlv_slip_seq))
											.from(S2_W7)
											.where(
												S2_W7.dlv_slip_no.eq(S1_T1.dlv_slip_no)
												.and(S2_W7.trn_typ.eq(value(MSC_TRN_TYP.SHIP.value())))
												.and(S2_W7.slip_sts_typ.neq(value(MAC_SLIP_STS_TYP.CAN.value())))
											)
									))
								)
							)
							.leftOuterJoin(S1_T7).on(
								bracket(
									S1_T7.dlv_inst_d_no.eq(S1_T1.dlv_inst_d_no)
								)
							)
							.leftOuterJoin(S1_T8).on(
								bracket(
									S1_T8.prms_rcpt_d_no.eq(S1_T1.prms_rcpt_d_no)
								)
							)
							.leftOuterJoin(
								subQuery()
								.select(
									S2_W2.arr_schd_no,
									S2_W4.purc_act_no,
									S2_W4.purc_act_d_no,
									S2_W6.purc_act_io_no,
									S2_W6.in_to_loc_cd,
									S2_W6.str_ln_cd,
									S2_W6.trd_unit_qty,
									S2_W6.trd_unit_cd,
									S2_W6.base_unit_qty,
									S2_W6.base_unit_cd,
									S2_W4.rsn_cd
								)
								.from(
									S2_W1
									.innerJoin(S2_W2).on(
										bracket(
											S2_W2.arr_schd_no.eq(S2_W1.arr_schd_no)
										)
									)
									.innerJoin(S2_W3).on(
										bracket(
											S2_W3.arr_schd_no.eq(S2_W2.arr_schd_no)
										)
									)
									.innerJoin(S2_W4).on(
										bracket(
											S2_W4.purc_schd_no.eq(S2_W3.purc_schd_no)
										)
									)
									.innerJoin(S2_W5).on(
										bracket(
											S2_W5.purc_act_no.eq(S2_W4.purc_act_no)
											.and(S2_W5.purc_act_seq.eq(S2_W4.purc_act_seq))
											.and(S2_W5.slip_sts_typ.eq(value(MAC_SLIP_STS_TYP.CRT.value())))
										)
									)
									.innerJoin(S2_W6).on(
										bracket(
											S2_W6.purc_act_d_no.eq(S2_W4.purc_act_d_no)
											.and(S2_W6.purc_act_d_seq.eq(S2_W4.purc_act_d_seq))
										)
									)
								)
								.where(
									S2_W2.arr_qty.eq(value(0))
									.and(S2_W3.base_unit_purc_qty.gt(value(0)))
								).view(S1_T9)
							).on(
								bracket(
									S1_T9.pr(S2_W2.arr_schd_no).eq(S1_T1.arr_schd_no)
								)
							)
							.leftOuterJoin(S1_T10).on(
								bracket(
									S1_T10.arr_schd_no.eq(S1_T1.arr_schd_no)
								)
							)
							.leftOuterJoin(S1_T11).on(
								bracket(
									S1_T11.purc_schd_no.eq(S1_T10.purc_schd_no)
								)
							)
							.leftOuterJoin(S1_T12).on(
								bracket(
									S1_T12.dlv_slip_mng_no.eq(S1_T1.dlv_slip_mng_no)
									.and(S1_T12.dlv_slip_mng_seq.eq(S1_T1.dlv_slip_mng_seq))
								)
							)
							.leftOuterJoin(S1_T13).on(
								bracket(
									S1_T13.dlv_slip_mng_d_no.eq(S1_T1.dlv_slip_mng_d_no)
									.and(S1_T13.dlv_slip_mng_d_seq.eq(S1_T1.dlv_slip_mng_d_seq))
								)
							)
						).view(S0_V1)
						.leftOuterJoin(S0_M2).on(
							bracket(
								S0_M2.loc_cd.eq(S0_V1.pr("arr_loc_cd"))
							)
						)
						.leftOuterJoin(S0_M6).on(
							bracket(
								S0_M6.itm_cd.eq(S0_V1.pr(S1_T1.itm_cd))
								.and(S0_M6.itm_sub1.eq(S0_V1.pr(S1_T1.itm_sub1)))
								.and(S0_M6.itm_sub2.eq(S0_V1.pr(S1_T1.itm_sub2)))
								.and(S0_M6.itm_sub3.eq(S0_V1.pr(S1_T1.itm_sub3)))
							)
						)
						.leftOuterJoin(S0_M7).on(
							bracket(
								S0_M7.itm_cd.eq(S0_V1.pr(S1_T1.itm_cd))
								.and(S0_M7.itm_sub1.eq(S0_V1.pr(S1_T1.itm_sub1)))
								.and(S0_M7.itm_sub2.eq(S0_V1.pr(S1_T1.itm_sub2)))
								.and(S0_M7.itm_sub3.eq(S0_V1.pr(S1_T1.itm_sub3)))
								.and(S0_M7.sno1.eq(S0_V1.pr(S1_T1.sno1)))
								.and(S0_M7.sno2.eq(S0_V1.pr(S1_T1.sno2)))
								.and(S0_M7.sno3.eq(S0_V1.pr(S1_T1.sno3)))
								.and(S0_M7.sno4.eq(S0_V1.pr(S1_T1.sno4)))
							)
						)
						.leftOuterJoin(S0_M14).on(
							bracket(
								S0_M14.itm_cd.eq(S0_V1.pr(S1_T1.itm_cd))
								.and(S0_M14.itm_sub1.eq(S0_V1.pr(S1_T1.itm_sub1)))
								.and(S0_M14.itm_sub2.eq(S0_V1.pr(S1_T1.itm_sub2)))
								.and(S0_M14.itm_sub3.eq(S0_V1.pr(S1_T1.itm_sub3)))
								.and(S0_M14.unit_cd.eq(S0_V1.pr("trd_unit_cd")))
							)
						)
						.leftOuterJoin(S0_M16).on(
							bracket(
								S0_M16.unit_cd.eq(value(MSC_IF_UNIT_CD_TYP.WT_UNIT_CD.value()))
							)
						)
						.leftOuterJoin(S0_M17).on(
							bracket(
								S0_M17.unit_cd.eq(value(MSC_IF_UNIT_CD_TYP.DIM_UNIT_CD.value()))
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
							m.trd_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("trd_nm", m.trd_nm());
					}),
					j -> j
						.add(MAM_STR_LN_R.class, r -> toCondition(
							r.getStringNE("arr_loc_cd"),
							r.getStringNE("arr_str_ln_cd")
						))
						.addSelect(m -> toArray(
							m.str_ln_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("arr_str_ln_nm", m.str_ln_nm());
					}),
					j -> j
						.add(MAM_LG_GRP_R.class, r -> toCondition(
							r.getStringNE("join_lg_grp_cd_")
						))
						.addSelect(m -> toArray(
							m.lg_grp_cd,
							m.lg_grp_nm,
							m.site_co_cd
						))
						.addMap((r, m) -> {
							r.setStringNE("arr_lg_grp_cd", m.lg_grp_cd());
							r.setStringNE("arr_lg_grp_nm", m.lg_grp_nm());
							r.setStringNE("site_co_cd", m.site_co_cd());
					}),
					j -> j
						.add(MAM_LG_GRP_R.class, r -> toCondition(
							r.getStringNE("ship_lg_grp_cd")
						))
						.addSelect(m -> toArray(
							m.lg_grp_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("ship_lg_grp_nm", m.lg_grp_nm());
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
						.add(MAM_BP_R.class, r -> toCondition(
							r.getStringNE("stk_bp_cd")
						))
						.addSelect(m -> toArray(
							m.bp_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("stk_bp_nm", m.bp_nm());
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
						.add(MAM_BIZ_RSN_R.class, r -> toCondition(
							r.getStringNE("rsn_cd")
						))
						.addSelect(m -> toArray(
							m.biz_rsn_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("rsn_nm", m.biz_rsn_nm());
					}),
					j -> j
						.add(MAM_SITE_CO_R.class, r -> toCondition(
							r.getStringNE("site_co_cd")
						))
						.addSelect(m -> toArray(
							m.site_co_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("site_co_nm", m.site_co_nm());
					})
				)
			);
	}
}