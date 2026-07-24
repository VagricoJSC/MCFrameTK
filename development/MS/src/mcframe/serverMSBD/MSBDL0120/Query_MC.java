package mcframe.serverMSBD.MSBDL0120;

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
	 * -- MSBDL0120_MST_ARR_ACT_Query_S01
	 */
	static MCQueryPlan MSBDL0120_MST_ARR_ACT_S01() {
		MSW_PO_D_KEY_R S0_T1 = MSW_PO_D_KEY_R.create("T1");
		MST_ARR_PR_R S0_T2 = MST_ARR_PR_R.create("T2");
		MST_ARR_SCHD_R S0_T3 = MST_ARR_SCHD_R.create("T3");
		MST_ARR_ACT_R S0_T4 = MST_ARR_ACT_R.create("T4");
		MAM_DPT_R S0_M6 = MAM_DPT_R.create("M6");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBDL0120_MST_ARR_ACT_Query_S01")
					.mainQuery()
					.select(
						trunc(
							S0_T4.arr_tm,
							MCDateFmt.DD
						).as("arr_dt"),
						S0_T4.arr_tm.as("arr_hm"),
						S0_T4.ac_dt,
						S0_T4.trd_unit_cd,
						S0_T4.trd_unit_qty,
						S0_T4.base_unit_qty,
						S0_T4.base_unit_cd,
						S0_T4.arr_loc_cd,
						S0_T4.str_ln_cd,
						S0_T4.lot_no,
						S0_T4.sublot_no,
						S0_T4.bp_lot_no,
						S0_T4.bp_dlv_slip_no,
						S0_T4.ship_fr_valid_dt,
						S0_T4.arr_usr_cd,
						S0_T4.arr_dpt_cd,
						S0_M6.dpt_nm.as("arr_dpt_nm"),
						S0_T2.po_d_no,
						S0_T4.arr_act_no,
						S0_T4.arr_schd_no,
						S0_T4.ins_usr_id,
						S0_T4.ins_usr_nm,
						S0_T4.ins_ts,
						S0_T4.ins_func_id,
						S0_T4.upd_usr_id,
						S0_T4.upd_usr_nm,
						S0_T4.upd_ts,
						S0_T4.upd_func_id,
						S0_T4.upd_srv_req_no,
						// this field is appended by sql coverter.
						S0_T4.itm_cd.as("join_itm_cd_"),
						// this field is appended by sql coverter.
						S0_T4.itm_sub1.as("join_itm_sub1_"),
						// this field is appended by sql coverter.
						S0_T4.itm_sub2.as("join_itm_sub2_"),
						// this field is appended by sql coverter.
						S0_T4.itm_sub3.as("join_itm_sub3_")
					)
					.from(
						S0_T1
						.innerJoin(S0_T2).on(
							bracket(
								S0_T2.po_d_no.eq(S0_T1.po_d_no)
							)
						)
						.innerJoin(S0_T3).on(
							bracket(
								S0_T3.arr_pr_no.eq(S0_T2.arr_pr_no)
							)
						)
						.innerJoin(S0_T4).on(
							bracket(
								S0_T4.arr_schd_no.eq(S0_T3.arr_schd_no)
							)
						)
						.leftOuterJoin(S0_M6).on(
							bracket(
								S0_M6.dpt_cd.eq(S0_T4.arr_dpt_cd)
								.and(S0_T4.arr_tm.between(S0_M6.st_dt, S0_M6.end_dt))
							)
						)
					)
					.where(
						value(0).eq(value(0))
						.and(S0_T4.can_flg.eq(value(false)))
					)
					.orderBy(
						S0_T2.po_d_no.asc(),
						S0_T4.arr_schd_no.asc(),
						S0_T4.arr_act_no.asc()
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
							m.dec_place,
							m.rnd_typ
						))
						.addMap((r, m) -> {
							r.setNumberNE("trd_unit_dec_place", m.dec_place());
							r.setStringNE("trd_unit_rnd_typ", m.rnd_typ());
					}),
					j -> j
						.add(MAM_LOC_R.class, r -> toCondition(
							r.getStringNE("arr_loc_cd")
						))
						.addSelect(m -> toArray(
							m.loc_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("arr_loc_nm", m.loc_nm());
					}),
					j -> j
						.add(MAM_STR_LN_R.class, r -> toCondition(
							r.getStringNE("arr_loc_cd"),
							r.getStringNE("str_ln_cd")
						))
						.addSelect(m -> toArray(
							m.str_ln_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("str_ln_nm", m.str_ln_nm());
					}),
					j -> j
						.add(MAM_USR_R.class, r -> toCondition(
							r.getStringNE("arr_usr_cd")
						))
						.addSelect(m -> toArray(
							m.usr_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("arr_usr_nm", m.usr_nm());
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
							r.getStringNE("join_itm_cd_"),
							r.getStringNE("join_itm_sub1_"),
							r.getStringNE("join_itm_sub2_"),
							r.getStringNE("join_itm_sub3_"),
							r.getStringNE("base_unit_cd")
						))
						.addSelect(m -> toArray(
							m.dec_place
						))
						.addMap((r, m) -> {
							r.setNumberNE("base_unit_dec_place", m.dec_place());
					})
				)
			);
	}
	
	/**
	 * -- MSBDL0120_MST_ARR_SCHD_Query_S01
	 */
	static MCQueryPlan MSBDL0120_MST_ARR_SCHD_S01() {
		MSW_PO_D_KEY_R S0_T1 = MSW_PO_D_KEY_R.create("T1");
		MST_ARR_PR_R S0_T2 = MST_ARR_PR_R.create("T2");
		MST_ARR_SCHD_R S0_T3 = MST_ARR_SCHD_R.create("T3");
		MST_PURC_SCHD_R S0_T4 = MST_PURC_SCHD_R.create("T4");
		MST_RCPT_IV_D_R S0_T5 = MST_RCPT_IV_D_R.create("T5");
		MST_RCPT_IV_R S0_T9 = MST_RCPT_IV_R.create("T9");
		MST_PURC_DLV_SLIP_R S0_T6 = MST_PURC_DLV_SLIP_R.create("T6");
		MST_PURC_DLV_SLIP_D_R S0_T7 = MST_PURC_DLV_SLIP_D_R.create("T7");
		MST_DLV_SLIP_R S0_T8 = MST_DLV_SLIP_R.create("T8");
		MAVM_ITM_UNIT_R S0_M6 = MAVM_ITM_UNIT_R.create("M6");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBDL0120_MST_ARR_SCHD_Query_S01")
					.mainQuery()
					.select(
						S0_T3.abort_flg.as("arr_abort_flg"),
						S0_T4.abort_flg.as("purc_abort_flg"),
						S0_T3.itm_cd,
						S0_T3.itm_sub1,
						S0_T3.itm_sub2,
						S0_T3.itm_sub3,
						S0_T3.lot_no,
						S0_T3.sublot_no,
						S0_T3.arr_schd_no,
						S0_T4.purc_schd_no,
						S0_T3.sync_flg,
						S0_T3.arr_loc_cd,
						S0_T3.str_ln_cd,
						S0_T3.bp_lot_no,
						trunc(
							S0_T3.arr_schd_tm,
							MCDateFmt.DD
						).as("arr_schd_dt"),
						S0_T3.arr_schd_tm.as("arr_schd_hm"),
						S0_T4.purc_schd_dt,
						S0_T3.trd_unit_qty.as("arr_schd_qty"),
						S0_T4.trd_unit_schd_qty.as("purc_schd_qty"),
						S0_T3.trd_unit_cd.as("schd_unit_cd"),
						S0_T3.base_unit_qty.as("base_unit_qty"),
						S0_T4.base_unit_schd_qty.as("base_unit_purc_schd_qty"),
						S0_T3.base_unit_cd,
						decode(
							S0_T3.base_unit_qty,
							S0_T5.base_unit_qty,
							value(true),
							value(false)
						).as("rcpt_iv_cmpl_flg"),
						nvl(
							S0_T5.base_unit_qty,
							value(0)
						).as("rcpt_iv_qty"),
						S0_T3.arr_qty,
						S0_T3.abort_qty.as("act_abort_qty"),
						S0_T3.purc_qty.as("purc_act_qty"),
						S0_T4.base_unit_abort_qty.as("purc_abort_qty"),
						S0_T4.base_unit_accpt_dfct_qty.as("accpt_dfct_qty"),
						S0_T3.outsrc_flg,
						S0_T3.cmpl_flg.as("arr_cmpl_flg"),
						S0_T4.cmpl_flg.as("purc_cmpl_flg"),
						S0_T3.arr_skip_flg,
						S0_T4.non_purc_flg,
						S0_T2.po_d_no,
						S0_T9.rcpt_iv_no,
						S0_T5.rcpt_iv_d_no,
						S0_T3.mfg_inst_no,
						S0_T3.purc_act_d_no,
						S0_T3.prms_rcpt_d_no,
						S0_T3.dlv_slip_no,
						S0_T6.dlv_slip_seq,
						S0_T6.dlv_slip_rev,
						S0_T7.dlv_slip_d_no,
						S0_T7.dlv_slip_d_seq,
						S0_T7.purc_ddlv_dlv_slip_no,
						S0_T7.purc_ddlv_dlv_slip_seq,
						S0_T8.dlv_slip_rev.as("purc_ddlv_dlv_slip_rev"),
						S0_T7.purc_ddlv_dlv_slip_d_no,
						S0_T6.dlv_slip_mng_no,
						S0_T6.dlv_slip_mng_seq,
						S0_T3.dlv_inst_d_no,
						S0_T3.dlv_slip_d_rmrks,
						S0_T3.ins_usr_id,
						S0_T3.ins_usr_nm,
						S0_T3.ins_ts,
						S0_T3.ins_func_id,
						S0_T3.upd_usr_id,
						S0_T3.upd_usr_nm,
						S0_T3.upd_ts,
						S0_T3.upd_func_id,
						S0_T3.upd_srv_req_no,
						S0_T2.arr_pr_no,
						S0_T2.abort_flg.as("arr_pr_abort_flg"),
						S0_T2.upd_cntr.as("arr_pr_upd_cntr")
					)
					.from(
						S0_T1
						.innerJoin(S0_T2).on(
							bracket(
								S0_T2.po_d_no.eq(S0_T1.po_d_no)
							)
						)
						.innerJoin(S0_T3).on(
							bracket(
								S0_T3.arr_pr_no.eq(S0_T2.arr_pr_no)
							)
						)
						.innerJoin(S0_T4).on(
							bracket(
								S0_T4.arr_pr_no.eq(S0_T3.arr_pr_no)
								.and(S0_T4.arr_schd_no.eq(S0_T3.arr_schd_no))
							)
						)
						.leftOuterJoin(S0_T5).on(
							bracket(
								S0_T5.purc_schd_no.eq(S0_T4.purc_schd_no)
							)
						)
						.leftOuterJoin(S0_T9).on(
							bracket(
								S0_T9.rcpt_iv_mng_no.eq(S0_T5.rcpt_iv_mng_no)
							)
						)
						.leftOuterJoin(S0_T6).on(
							bracket(
								S0_T6.dlv_slip_mng_no.eq(S0_T3.dlv_slip_mng_no)
								.and(S0_T6.dlv_slip_mng_seq.eq(S0_T3.dlv_slip_mng_seq))
								.and(value(true).eq(
													cases().
														when(S0_T6.dlv_inst_grp_no.isNotNull()
																.or(S0_T6.prms_rcpt_grp_no.isNotNull()))
														.then(value(true))
														.otherwise(decode(S0_T6.purc_dlv_slip_src_typ, value(MSC_PURC_DLV_SLIP_SRC_TYP.PO.value()), value(false), value(true)))
													)
								)
							)
						)
						.leftOuterJoin(S0_T7).on(
							bracket(
								S0_T7.dlv_slip_mng_d_no.eq(S0_T3.dlv_slip_mng_d_no)
								.and(S0_T7.dlv_slip_mng_d_seq.eq(S0_T3.dlv_slip_mng_d_seq))
								.and(S0_T7.dlv_slip_mng_no.eq(S0_T6.dlv_slip_mng_no))
								.and(S0_T7.dlv_slip_mng_seq.eq(S0_T6.dlv_slip_mng_seq))
							)
						)
						.leftOuterJoin(S0_T8).on(
							bracket(
								S0_T8.dlv_slip_no.eq(S0_T7.purc_ddlv_dlv_slip_no)
								.and(S0_T8.dlv_slip_seq.eq(S0_T7.purc_ddlv_dlv_slip_seq))
							)
						)
						.leftOuterJoin(S0_M6).on(
							bracket(
								S0_M6.itm_cd.eq(S0_T3.itm_cd)
								.and(S0_M6.itm_sub1.eq(S0_T3.itm_sub1))
								.and(S0_M6.itm_sub2.eq(S0_T3.itm_sub2))
								.and(S0_M6.itm_sub3.eq(S0_T3.itm_sub3))
								.and(S0_M6.unit_cd.eq(S0_T3.base_unit_cd))
							)
						)
					)
					.where(
						value(0).eq(value(0))
					)
					.orderBy(
						S0_T2.po_d_no.asc(),
						S0_T3.arr_schd_no.asc()
					)
			)
			.setJoinInfo(
				joinInfo(
					j -> j
						.add(MAM_LOC_R.class, r -> toCondition(
							r.getStringNE("arr_loc_cd")
						))
						.addSelect(m -> toArray(
							m.loc_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("arr_loc_nm", m.loc_nm());
					}),
					j -> j
						.add(MAM_STR_LN_R.class, r -> toCondition(
							r.getStringNE("arr_loc_cd"),
							r.getStringNE("str_ln_cd")
						))
						.addSelect(m -> toArray(
							m.str_ln_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("str_ln_nm", m.str_ln_nm());
					}),
					j -> j
						.add(MAM_UNIT_R.class, r -> toCondition(
							r.getStringNE("schd_unit_cd")
						))
						.addSelect(m -> toArray(
							m.unit_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("schd_unit_nm", m.unit_nm());
					}),
					j -> j
						.add(MAVM_ITM_UNIT_R.class, r -> toCondition(
							r.getStringNE("itm_cd"),
							r.getStringNE("itm_sub1"),
							r.getStringNE("itm_sub2"),
							r.getStringNE("itm_sub3"),
							r.getStringNE("schd_unit_cd")
						))
						.addSelect(m -> toArray(
							m.conv_base_qty,
							m.conv_qty,
							m.dec_place,
							m.rnd_typ
						))
						.addMap((r, m) -> {
							r.setNumberNE("schd_unit_conv_base_qty", m.conv_base_qty());
							r.setNumberNE("schd_unit_conv_qty", m.conv_qty());
							r.setNumberNE("schd_unit_dec_place", m.dec_place());
							r.setStringNE("schd_unit_rnd_typ", m.rnd_typ());
					}),
					j -> j
						.add(MAM_UNIT_R.class, r -> toCondition(
							r.getStringNE("base_unit_cd")
						))
						.addSelect(m -> toArray(
							m.dec_place,
							m.rnd_typ,
							m.unit_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("base_unit_nm", m.unit_nm());
							r.setNumberNE("base_unit_dec_place", m.dec_place());
							r.setStringNE("base_unit_rnd_typ", m.rnd_typ());
					}),
					j -> j
						.add(MAM_ITM_R.class, r -> toCondition(
							r.getStringNE("itm_cd"),
							r.getStringNE("itm_sub1"),
							r.getStringNE("itm_sub2"),
							r.getStringNE("itm_sub3")
						))
						.addSelect(m -> toArray(
							m.lot_mng_typ,
							m.lot_no_typ,
							m.sublot_mng_typ,
							m.sublot_no_typ
						))
						.addMap((r, m) -> {
							r.setStringNE("lot_mng_typ", m.lot_mng_typ());
							r.setStringNE("lot_no_typ", m.lot_no_typ());
							r.setStringNE("sublot_mng_typ", m.sublot_mng_typ());
							r.setStringNE("sublot_no_typ", m.sublot_no_typ());
					})
				)
			);
	}
	
	/**
	 * -- MSBDL0120_MST_DLV_INST_D_Query_S01
	 */
	static MCQueryPlan MSBDL0120_MST_DLV_INST_D_S01() {
		MSW_PO_D_KEY_R S0_T1 = MSW_PO_D_KEY_R.create("T1");
		MST_DLV_INST_R S0_T2 = MST_DLV_INST_R.create("T2");
		MST_DLV_INST_D_R S0_T3 = MST_DLV_INST_D_R.create("T3");
		MST_PO_D_R S0_T4 = MST_PO_D_R.create("T4");
		MST_RCPT_IV_D_R S0_RID = MST_RCPT_IV_D_R.create("RID");
		MST_PURC_SCHD_R S0_PS = MST_PURC_SCHD_R.create("PS");
		MST_ARR_PR_R S0_T5 = MST_ARR_PR_R.create("T5");
		MST_ARR_SCHD_R S0_T6 = MST_ARR_SCHD_R.create("T6");
		MST_PURC_SCHD_R S0_T7 = MST_PURC_SCHD_R.create("T7");
		MST_PURC_DLV_SLIP_R S0_T8 = MST_PURC_DLV_SLIP_R.create("T8");
		MST_PURC_DLV_SLIP_D_R S0_T9 = MST_PURC_DLV_SLIP_D_R.create("T9");
		MST_DLV_SLIP_R S0_T10 = MST_DLV_SLIP_R.create("T10");
		MAM_BP_R S0_M8 = MAM_BP_R.create("M8");
		MAM_BP_R S0_M11 = MAM_BP_R.create("M11");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBDL0120_MST_DLV_INST_D_Query_S01")
					.mainQuery()
					.select(
						S0_T1.po_d_no,
						S0_T4.dlv_cd,
						S0_T3.dlv_inst_d_no,
						S0_T3.dlv_inst_no,
						S0_T4.outsrc_flg,
						S0_T4.purc_id_typ,
						S0_T3.mfg_inst_no,
						S0_T3.purc_act_d_no,
						S0_T8.dlv_slip_no,
						S0_T8.dlv_slip_seq,
						S0_T8.dlv_slip_rev,
						S0_T9.purc_ddlv_dlv_slip_no,
						S0_T9.purc_ddlv_dlv_slip_seq,
						S0_T10.dlv_slip_rev.as("purc_ddlv_dlv_slip_rev"),
						trunc(
							S0_T3.dlv_rqst_tm,
							MCDateFmt.DD
						).as("dlv_rqst_dt"),
						S0_T3.dlv_rqst_tm.as("dlv_rqst_hm"),
						S0_T3.purc_schd_dt,
						S0_T3.sync_flg,
						S0_T3.in_to_loc_cd,
						S0_T3.str_ln_cd.as("in_to_str_ln_cd"),
						S0_T4.itm_cd,
						S0_T4.itm_sub1,
						S0_T4.itm_sub2,
						S0_T4.itm_sub3,
						S0_T3.trd_unit_cd,
						S0_T3.trd_unit_qty,
						S0_T3.base_unit_cd,
						S0_T3.base_unit_qty,
						S0_T6.arr_qty,
						S0_T6.abort_qty.as("act_abort_qty"),
						S0_T6.purc_qty.as("purc_act_qty"),
						S0_T7.base_unit_abort_qty.as("purc_abort_qty"),
						S0_T7.base_unit_accpt_dfct_qty.as("accpt_dfct_qty"),
						S0_T6.rcpt_iv_no,
						S0_T3.can_flg,
						S0_T3.dlv_inst_print_d_rmrks,
						S0_T3.intr_rmrks,
						S0_T3.dlv_slip_d_rmrks,
						S0_T6.cmpl_flg.as("arr_cmpl_flg"),
						S0_T7.cmpl_flg.as("purc_cmpl_flg"),
						S0_T6.arr_skip_flg,
						S0_T7.non_purc_flg,
						S0_T3.dlv_cd.as("inst_dlv_cd"),
						S0_T3.dlv_sundry_flg,
						decode(
							S0_T3.dlv_sundry_flg,
							value(true),
							S0_T3.dlv_nm,
							S0_M8.bp_nm
						).as("dlv_nm"),
						S0_T3.dlv_cntct_dpt.as("dlv_cntct_dpt"),
						S0_T3.dlv_cntct_psn.as("dlv_cntct_psn"),
						S0_T3.dlv_zip_cd.as("dlv_zip_cd"),
						S0_T3.dlv_addr1.as("dlv_addr1"),
						S0_T3.dlv_addr2.as("dlv_addr2"),
						S0_T3.dlv_addr3.as("dlv_addr3"),
						S0_T3.dlv_addr4.as("dlv_addr4"),
						S0_T3.dlv_tel.as("dlv_tel"),
						S0_T3.dlv_fax.as("dlv_fax"),
						S0_M8.cntry_cd.as("dlv_cntry_cd"),
						S0_T3.dlv_lg_grp_cd.as("dlv_lg_grp_cd"),
						S0_T3.pri_prnt_flg,
						S0_M8.tdlv_req_flg,
						S0_T3.tdlv_cd,
						S0_T3.tdlv_sundry_flg,
						decode(
							S0_T3.tdlv_sundry_flg,
							value(true),
							S0_T3.tdlv_nm,
							S0_M11.bp_nm
						).as("tdlv_nm"),
						S0_T3.tdlv_cntct_dpt.as("tdlv_cntct_dpt"),
						S0_T3.tdlv_cntct_psn.as("tdlv_cntct_psn"),
						S0_T3.tdlv_zip_cd.as("tdlv_zip_cd"),
						S0_T3.tdlv_addr1.as("tdlv_addr1"),
						S0_T3.tdlv_addr2.as("tdlv_addr2"),
						S0_T3.tdlv_addr3.as("tdlv_addr3"),
						S0_T3.tdlv_addr4.as("tdlv_addr4"),
						S0_T3.tdlv_tel.as("tdlv_tel"),
						S0_T3.tdlv_fax.as("tdlv_fax"),
						S0_M11.cntry_cd.as("tdlv_cntry_cd"),
						S0_T3.tdlv_lg_grp_cd.as("tdlv_lg_grp_cd"),
						decode(
							S0_T3.base_unit_qty,
							S0_RID.base_unit_qty,
							value(true),
							value(false)
						).as("rcpt_iv_cmpl_flg"),
						S0_RID.base_unit_qty.as("rcpt_iv_qty"),
						S0_T3.sub_char1,
						S0_T3.sub_char2,
						S0_T3.sub_char3,
						S0_T3.ins_usr_id,
						S0_T3.ins_usr_nm,
						S0_T3.ins_ts,
						S0_T3.ins_func_id,
						S0_T3.upd_usr_id,
						S0_T3.upd_usr_nm,
						S0_T3.upd_ts,
						S0_T3.upd_func_id,
						S0_T3.upd_srv_req_no,
						S0_T3.upd_cntr
					)
					.from(
						S0_T1
						.innerJoin(S0_T2).on(
							bracket(
								S0_T2.po_d_no.eq(S0_T1.po_d_no)
							)
						)
						.innerJoin(S0_T3).on(
							bracket(
								S0_T3.dlv_inst_no.eq(S0_T2.dlv_inst_no)
							)
						)
						.innerJoin(S0_T4).on(
							bracket(
								S0_T4.po_d_no.eq(S0_T1.po_d_no)
							)
						)
						.leftOuterJoin(S0_RID).on(
							bracket(
								S0_T3.dlv_inst_d_no.eq(S0_RID.ref_dlv_inst_d_no)
							)
						)
						.leftOuterJoin(S0_PS).on(
							bracket(
								S0_RID.purc_schd_no.eq(S0_PS.purc_schd_no)
							)
						)
						.leftOuterJoin(S0_T5).on(
							bracket(
								S0_T5.po_d_no.eq(S0_T1.po_d_no)
							)
						)
						.leftOuterJoin(S0_T6).on(
							bracket(
								bracket(
									S0_T6.arr_pr_no.eq(S0_T5.arr_pr_no)
									.and(S0_T6.dlv_inst_d_no.eq(S0_T3.dlv_inst_d_no))
									.and(S0_T6.prms_rcpt_d_no.isNull())
								)
								.or(
									S0_T6.arr_pr_no.eq(S0_PS.arr_pr_no)
									.and(S0_T6.arr_schd_no.eq(S0_PS.arr_schd_no))
									.and(S0_T6.prms_rcpt_d_no.isNull())
								)
							)
						)
						.leftOuterJoin(S0_T7).on(
							bracket(
								S0_T7.arr_pr_no.eq(S0_T5.arr_pr_no)
								.and(S0_T7.arr_schd_no.eq(S0_T6.arr_schd_no))
							)
						)
						.leftOuterJoin(S0_T8).on(
							bracket(S0_T8.dlv_slip_mng_no.eq(S0_T6.dlv_slip_mng_no)
							.and(S0_T8.dlv_slip_mng_seq.eq(S0_T6.dlv_slip_mng_seq))
							)
						)
						.leftOuterJoin(S0_T9).on(
							bracket(S0_T9.dlv_slip_mng_d_no.eq(S0_T6.dlv_slip_mng_d_no)
							.and(S0_T9.dlv_slip_mng_d_seq.eq(S0_T6.dlv_slip_mng_d_seq))
							)
						)
						.leftOuterJoin(S0_T10).on(
							bracket(S0_T10.dlv_slip_no.eq(S0_T9.purc_ddlv_dlv_slip_no)
							.and(S0_T10.dlv_slip_seq.eq(S0_T9.purc_ddlv_dlv_slip_seq))
							)
						)
						.leftOuterJoin(S0_M8).on(S0_T3.dlv_cd.eq(S0_M8.bp_cd))
						.leftOuterJoin(S0_M11).on(S0_T3.tdlv_cd.eq(S0_M11.bp_cd))
					)
					.where(
						value(0).eq(value(0))
						.and(
							S0_T2.can_flg.eq(value(false))
						)
						.and(
							S0_T3.can_flg.eq(value(false))
						)
					)
					.orderBy(
						S0_T2.po_d_no.asc(),
						S0_T3.dlv_inst_no.asc(),
						S0_T3.dlv_inst_d_no.asc()
					)
			)
			.setJoinInfo(
				joinInfo(
					j -> j
						.add(MAM_LOC_R.class, r -> toCondition(
							r.getStringNE("in_to_loc_cd")
						))
						.addSelect(m -> toArray(
							m.cal_cd,
							m.lg_grp_cd,
							m.loc_nm,
							m.site_cd,
							m.sppl_cd,
							m.str_ln_tgt_flg,
							m.wg_cd
						))
						.addMap((r, m) -> {
							r.setStringNE("in_to_loc_nm", m.loc_nm());
							r.setBooleanNE("in_to_str_ln_tgt_flg", m.str_ln_tgt_flg());
							r.setStringNE("in_to_loc_wg_cd", m.wg_cd());
							r.setStringNE("site_cd", m.site_cd());
							r.setStringNE("lg_grp_cd", m.lg_grp_cd());
							r.setStringNE("in_to_loc_cal_cd", m.cal_cd());
							r.setStringNE("outsrc_sppl_cd", m.sppl_cd());
					}),
					j -> j
						.add(MAM_STR_LN_R.class, r -> toCondition(
							r.getStringNE("in_to_loc_cd"),
							r.getStringNE("in_to_str_ln_cd")
						))
						.addSelect(m -> toArray(
							m.str_ln_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("in_to_str_ln_nm", m.str_ln_nm());
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
							r.setStringNE("trd_unit_rnd_typ", m.rnd_typ());
							r.setNumberNE("conv_base_qty", m.conv_base_qty());
							r.setNumberNE("conv_qty", m.conv_qty());
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
						.add(MAM_ITM_R.class, r -> toCondition(
							r.getStringNE("itm_cd"),
							r.getStringNE("itm_sub1"),
							r.getStringNE("itm_sub2"),
							r.getStringNE("itm_sub3")
						))
						.addSelect(m -> toArray(
							m.dscnt_itm_flg
						))
						.addMap((r, m) -> {
							r.setBooleanNE("dscnt_itm_flg", m.dscnt_itm_flg());
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
						.add(MAM_LG_GRP_R.class, r -> toCondition(
							r.getStringNE("dlv_lg_grp_cd")
						))
						.addSelect(m -> toArray(
							m.lg_grp_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("dlv_lg_grp_nm", m.lg_grp_nm());
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
						.add(MAM_LG_GRP_R.class, r -> toCondition(
							r.getStringNE("tdlv_lg_grp_cd")
						))
						.addSelect(m -> toArray(
							m.lg_grp_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("tdlv_lg_grp_nm", m.lg_grp_nm());
					})
				)
			);
	}
	
	/**
	 * -- MSBDL0120_MST_DLV_INST_RCPT_Query_S01
	 */
	static MCQueryPlan MSBDL0120_MST_DLV_INST_RCPT_S01() {
		MST_DLV_INST_RCPT_R S0_T1 = MST_DLV_INST_RCPT_R.create("T1");
		MST_SLO_D_R S0_T2 = MST_SLO_D_R.create("T2");
		MAM_BP_R S0_M6 = MAM_BP_R.create("M6");
		MAM_BP_R S0_M9 = MAM_BP_R.create("M9");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBDL0120_MST_DLV_INST_RCPT_Query_S01")
					.mainQuery()
					.select(
						bind("po_d_no").as("po_d_no"),
						trunc(
							S0_T1.dlv_rqst_tm,
							MCDateFmt.DD
						).as("dlv_rqst_dt"),
						S0_T1.dlv_rqst_tm.as("dlv_rqst_hm"),
						S0_T2.itm_cd,
						S0_T2.itm_sub1,
						S0_T2.itm_sub2,
						S0_T2.itm_sub3,
						S0_T1.trd_unit_cd,
						S0_T1.trd_unit_qty,
						S0_T1.base_unit_cd,
						S0_T1.base_unit_qty,
						S0_T1.dlv_cd,
						S0_T1.dlv_sundry_flg,
						decode(
							S0_T1.dlv_sundry_flg,
							value(true),
							S0_T1.dlv_nm,
							S0_M6.bp_nm
						).as("dlv_nm"),
						S0_T1.dlv_cntct_dpt,
						S0_T1.dlv_cntct_psn,
						S0_T1.dlv_zip_cd,
						S0_T1.dlv_addr1,
						S0_T1.dlv_addr2,
						S0_T1.dlv_addr3,
						S0_T1.dlv_addr4,
						S0_T1.dlv_tel,
						S0_T1.dlv_fax,
						S0_M6.cntry_cd.as("dlv_cntry_cd"),
						S0_T1.dlv_lg_grp_cd.as("dlv_lg_grp_cd"),
						S0_T1.pri_prnt_flg,
						S0_T1.tdlv_cd,
						S0_T1.tdlv_sundry_flg,
						decode(
							S0_T1.tdlv_sundry_flg,
							value(true),
							S0_T1.tdlv_nm,
							S0_M9.bp_nm
						).as("tdlv_nm"),
						S0_T1.via_dlv_typ,
						S0_T1.tdlv_cntct_dpt,
						S0_T1.tdlv_cntct_psn,
						S0_T1.tdlv_zip_cd,
						S0_T1.tdlv_addr1,
						S0_T1.tdlv_addr2,
						S0_T1.tdlv_addr3,
						S0_T1.tdlv_addr4,
						S0_T1.tdlv_tel,
						S0_T1.tdlv_fax,
						S0_M9.cntry_cd.as("tdlv_cntry_cd"),
						S0_T1.tdlv_lg_grp_cd
					)
					.from(
						S0_T1
						.innerJoin(S0_T2).on(
							bracket(
								S0_T2.slo_d_no.eq(S0_T1.slo_d_no)
							)
						)
						.leftOuterJoin(S0_M6).on(S0_T1.dlv_cd.eq(S0_M6.bp_cd))
						.leftOuterJoin(S0_M9).on(S0_T1.tdlv_cd.eq(S0_M9.bp_cd))
					)
					.where(
						value(0).eq(value(0))
						.and(S0_T1.slo_d_no.eq(bind("slo_d_no")))
						.and(S0_T1.can_flg.eq(value(false)))
						.and(S0_T2.can_flg.eq(value(false)))
						.and(S0_T2.abort_flg.eq(value(false)))
					)
					.orderBy(S0_T1.dlv_inst_rcpt_no.asc())
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
							r.setNumberNE("conv_base_qty", m.conv_base_qty());
							r.setNumberNE("conv_qty", m.conv_qty());
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
						.add(MAM_ITM_R.class, r -> toCondition(
							r.getStringNE("itm_cd"),
							r.getStringNE("itm_sub1"),
							r.getStringNE("itm_sub2"),
							r.getStringNE("itm_sub3")
						))
						.addSelect(m -> toArray(
							m.dscnt_itm_flg
						))
						.addMap((r, m) -> {
							r.setBooleanNE("dscnt_itm_flg", m.dscnt_itm_flg());
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
						.add(MAM_LG_GRP_R.class, r -> toCondition(
							r.getStringNE("dlv_lg_grp_cd")
						))
						.addSelect(m -> toArray(
							m.lg_grp_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("dlv_lg_grp_nm", m.lg_grp_nm());
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
						.add(MAM_LG_GRP_R.class, r -> toCondition(
							r.getStringNE("tdlv_lg_grp_cd")
						))
						.addSelect(m -> toArray(
							m.lg_grp_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("tdlv_lg_grp_nm", m.lg_grp_nm());
					})
				)
			);
	}
	
	/**
	 * -- MSBDL0120_MST_DLV_INST_Query_S01
	 */
	static MCQueryPlan MSBDL0120_MST_DLV_INST_S01() {
		MSW_PO_D_KEY_R S0_T1 = MSW_PO_D_KEY_R.create("T1");
		MST_DLV_INST_R S0_T2 = MST_DLV_INST_R.create("T2");
		MST_ARR_PR_R S0_T3 = MST_ARR_PR_R.create("T3");
		MST_PO_D_R S0_T4 = MST_PO_D_R.create("T4");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBDL0120_MST_DLV_INST_Query_S01")
					.mainQuery()
					.select(
						S0_T2.po_d_no,
						S0_T2.dlv_inst_no,
						S0_T2.dlv_inst_rev,
						S0_T2.dlv_inst_dt,
						S0_T2.dlv_inst_print_dt,
						S0_T2.dlv_inst_print_flg,
						S0_T2.dlv_inst_print_rmrks,
						S0_T2.can_flg,
						S0_T2.intr_rmrks,
						S0_T2.edi_flg,
						S0_T4.dlv_cd,
						S0_T4.slo_d_no,
						S0_T2.sub_char1,
						S0_T2.sub_char2,
						S0_T2.sub_char3,
						S0_T2.dlv_inst_grp_no,
						S0_T2.ins_usr_id,
						S0_T2.ins_usr_nm,
						S0_T2.ins_ts,
						S0_T2.ins_func_id,
						S0_T2.upd_usr_id,
						S0_T2.upd_usr_nm,
						S0_T2.upd_ts,
						S0_T2.upd_func_id,
						S0_T2.upd_srv_req_no,
						S0_T2.upd_cntr,
						S0_T3.arr_pr_no,
						S0_T3.upd_cntr.as("arr_pr_upd_cntr")
					)
					.from(
						S0_T1
						.innerJoin(S0_T2).on(
							bracket(
								S0_T2.po_d_no.eq(S0_T1.po_d_no)
							)
						)
						.innerJoin(S0_T3).on(
							bracket(
								S0_T3.po_d_no.eq(S0_T1.po_d_no)
							)
						)
						.innerJoin(S0_T4).on(
							bracket(
								S0_T4.po_d_no.eq(S0_T1.po_d_no)
							)
						)
					)
					.where(
						value(0).eq(value(0))
						.and(
							S0_T2.can_flg.eq(value(false))
						)
					)
					.orderBy(
						S0_T2.po_d_no.asc(),
						S0_T2.dlv_inst_no.asc()
					)
			);
	}
	
	/**
	 * -- MSBDL0120_MST_PO_D_Query_S01
	 */
	static MCQueryPlan MSBDL0120_MST_PO_D_S01() {
		MST_PO_D_R S0_T1 = MST_PO_D_R.create("T1");
		MST_PO_R S0_T2 = MST_PO_R.create("T2");
		MST_ARR_PR_R S0_T3 = MST_ARR_PR_R.create("T3");
		MST_SLO_D_R S0_T5 = MST_SLO_D_R.create("T5");
		MAM_ITM_R S0_M1 = MAM_ITM_R.create("M1");
		MAM_BP_R S0_M8 = MAM_BP_R.create("M8");
		MAM_BP_R S0_M88 = MAM_BP_R.create("M88");
		MAM_BP_R S0_M14 = MAM_BP_R.create("M14");
		MAM_ITM_LCL_R S0_M13 = MAM_ITM_LCL_R.create("M13");
		MAM_EDI_IF_CTL_R S0_M16 = MAM_EDI_IF_CTL_R.create("M16");
		MAM_EXT_SYS_R S0_M17 = MAM_EXT_SYS_R.create("M17");
		MST_DLV_INST_R S0_T7 = MST_DLV_INST_R.create("T7");
		MST_DLV_INST_R S0_T8 = MST_DLV_INST_R.create("T8");
		MAVM_RD_DPT_R S0_DAC = MAVM_RD_DPT_R.create("DAC");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBDL0120_MST_PO_D_Query_S01")
					.mainQuery()
					.select(
						S0_T1.po_d_no,
						S0_T1.po_no,
						S0_T1.in_to_loc_cd,
						MAPA_LOC$F_GET_LOC_ADDR(
							S0_T1.in_to_loc_cd,
							S0_T2.po_dt,
							value(MAC_LOC_ADDR_TYP.ZIP_CD.value()),
							nullValue()
						).as("in_to_loc_zip_cd"),
						MAPA_LOC$F_GET_LOC_ADDR(
							S0_T1.in_to_loc_cd,
							S0_T2.po_dt,
							value(MAC_LOC_ADDR_TYP.ADDR1.value()),
							nullValue()
						).as("in_to_loc_addr1"),
						MAPA_LOC$F_GET_LOC_ADDR(
							S0_T1.in_to_loc_cd,
							S0_T2.po_dt,
							value(MAC_LOC_ADDR_TYP.ADDR2.value()),
							nullValue()
						).as("in_to_loc_addr2"),
						MAPA_LOC$F_GET_LOC_ADDR(
							S0_T1.in_to_loc_cd,
							S0_T2.po_dt,
							value(MAC_LOC_ADDR_TYP.ADDR3.value()),
							nullValue()
						).as("in_to_loc_addr3"),
						MAPA_LOC$F_GET_LOC_ADDR(
							S0_T1.in_to_loc_cd,
							S0_T2.po_dt,
							value(MAC_LOC_ADDR_TYP.ADDR4.value()),
							nullValue()
						).as("in_to_loc_addr4"),
						MAPA_LOC$F_GET_LOC_ADDR(
							S0_T1.in_to_loc_cd,
							S0_T2.po_dt,
							value(MAC_LOC_ADDR_TYP.TEL.value()),
							nullValue()
						).as("in_to_loc_tel"),
						MAPA_LOC$F_GET_LOC_ADDR(
							S0_T1.in_to_loc_cd,
							S0_T2.po_dt,
							value(MAC_LOC_ADDR_TYP.FAX.value()),
							nullValue()
						).as("in_to_loc_fax"),
						S0_T1.str_ln_cd,
						S0_T1.pri_print_flg,
						S0_T1.drct_dlv_typ,
						S0_T1.dlv_cd,
						decode(
							S0_T1.dlv_sundry_flg,
							value(true),
							S0_T1.dlv_nm,
							S0_M8.bp_nm
						).as("dlv_nm"),
						S0_M8.dlv_cal_cd,
						S0_T1.dlv_sundry_flg,
						S0_M8.cntry_cd.as("dlv_cntry_cd"),
						S0_T1.dlv_zip_cd,
						S0_T1.dlv_addr1,
						S0_T1.dlv_addr2,
						S0_T1.dlv_addr3,
						S0_T1.dlv_addr4,
						S0_T1.dlv_tel,
						S0_T1.dlv_fax,
						S0_T1.dlv_cntct_dpt,
						S0_T1.dlv_cntct_psn,
						S0_T1.tdlv_cd,
						decode(
							S0_T1.tdlv_sundry_flg,
							value(true),
							S0_T1.tdlv_nm,
							S0_M88.bp_nm
						).as("tdlv_nm"),
						S0_T1.tdlv_sundry_flg,
						S0_M88.cntry_cd.as("tdlv_cntry_cd"),
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
						decode(
							S0_T1.sundry_itm_flg,
							value(true),
							S0_T1.itm_nm,
							S0_M1.itm_nm
						).as("itm_nm"),
						decode(
							S0_M14.sppl_iv_flg,
							value(true),
							decode(
								S0_T1.sundry_itm_flg,
								value(true),
								S0_T1.iv_itm_nm,
								S0_M13.itm_nm
							),
							nullValue()
						).as("iv_itm_nm"),
						S0_T1.sundry_itm_flg,
						S0_M1.dscnt_itm_flg,
						S0_T1.purc_id_typ,
						S0_T1.ver_no,
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
						S0_T1.sync_flg,
						S0_T1.purc_basis_typ,
						S0_T1.sppl_itm_cd,
						S0_T1.sppl_itm_nm,
						bracket(
								cases()
									.when(S0_T1.dlv_cd.isNotNull())
										.then(S0_T5.cst_itm_cd)
									.otherwise(nullValue())
							).as("cst_itm_cd"),
						bracket(
								cases()
									.when(S0_T1.dlv_cd.isNotNull())
										.then(S0_T5.cst_itm_nm)
									.otherwise(nullValue())
							).as("cst_itm_nm"),
						S0_T1.maker_cd,
						S0_T1.sno1,
						S0_T1.sno2,
						S0_T1.sno3,
						S0_T1.sno4,
						S0_T1.mfg_loc_cd,
						S0_T1.bom_ptn,
						S0_T1.po_schd_no,
						S0_T1.trd_unit_qty,
						S0_T1.trd_unit_cd,
						S0_T1.base_unit_qty,
						S0_T1.base_unit_cd,
						S0_M1.cont_fctr_flg,
						S0_M1.cont_fctr_dec_place,
						S0_M1.cont_fctr_rnd_typ,
						S0_M1.std_cont_fctr,
						S0_M1.cont_fctr_unit_cd,
						S0_T1.slo_no,
						S0_T1.slo_d_no,
						S0_T1.po_print_d_rmrks,
						S0_T1.outsrc_flg,
						S0_T3.dlv_inst_dt,
						S0_T3.dlv_inst_qty,
						S0_T3.dlv_inst_prms_rcpt_dt,
						S0_T3.dlv_inst_prms_refl_dt,
						S0_T3.prms_rcpt_dt,
						S0_T3.prms_refl_dt,
						S0_T3.prms_dlv_dt,
						S0_T3.prms_rcpt_qty,
						S0_T3.prms_refl_qty,
						S0_T3.dlv_inst_prms_rcpt_qty,
						S0_T3.dlv_inst_prms_refl_qty,
						S0_T3.rcpt_iv_qty,
						S0_T3.arr_pr_no,
						S0_T3.abort_flg,
						S0_T3.purc_sts_typ,
						decode(
							bracket(
								subQuery()
								.select(S0_M16.bp_cd)
								.from(S0_M16)
								.where(
									S0_M16.bp_cd.eq(S0_T2.sppl_cd)
									.and(bind("today").between(S0_M16.st_dt, S0_M16.end_dt))
									.and(S0_M16.if_proc_typ.eq(value(MAC_IF_PROC_TYP.DLV_INST_SEND.value())))
									.and(S0_M16.del_flg.eq(value(false)))
								)
							),
							nullValue(),
							value(false),
							value(true)
						).as("edi_tgt_flg"),
						bracket(
							subQuery()
							.select(S0_T8.edi_flg)
							.from(S0_T8)
							.where(
								S0_T8.dlv_inst_no.eq(subQuery()
									.select(max(S0_T7.dlv_inst_no))
									.from(S0_T7)
									.where(
										S0_T1.po_d_no.eq(S0_T7.po_d_no)
										.and(S0_T7.can_flg.eq(value(false)))
									)
								)
							)
						).as("edi_dlv_inst_flg"),
						subQuery()
						.select(S0_M17.ext_sys_typ)
						.from(
							S0_M17
							.innerJoin(S0_M16).on(
								S0_M17.ext_sys_cd.eq(S0_M16.ext_sys_cd)
								.and(S0_M17.del_flg.eq(value(false))))
							)
						.where(
							S0_M16.bp_cd.eq(S0_T2.sppl_cd)
							.and(bind("today").between(S0_M16.st_dt, S0_M16.end_dt))
							.and(S0_M16.if_proc_typ.eq(value(MAC_IF_PROC_TYP.DLV_INST_SEND.value())))
							.and(S0_M16.del_flg.eq(value(false)))
						).as("dlv_inst_ext_sys_typ"),
						S0_T3.upd_cntr.as("arr_pr_upd_cntr"),
						S0_T1.ext_po_d_no
					)
					.from(
						S0_T1
						.innerJoin(S0_T2).on(
							bracket(
								S0_T2.po_no.eq(S0_T1.po_no)
							)
						)
						.innerJoin(S0_T3).on(
							bracket(
								S0_T3.po_d_no.eq(S0_T1.po_d_no)
							)
						)
						.leftOuterJoin(S0_M1).on(
							bracket(
								S0_M1.itm_cd.eq(S0_T1.itm_cd)
								.and(S0_M1.itm_sub1.eq(S0_T1.itm_sub1))
								.and(S0_M1.itm_sub2.eq(S0_T1.itm_sub2))
								.and(S0_M1.itm_sub3.eq(S0_T1.itm_sub3))
							)
						)
						.leftOuterJoin(S0_M8).on(
							bracket(
								S0_M8.bp_cd.eq(S0_T1.dlv_cd)
							)
						)
						.leftOuterJoin(S0_M88).on(
							bracket(
								S0_M88.bp_cd.eq(S0_T1.tdlv_cd)
							)
						)
						.leftOuterJoin(S0_M14).on(
							bracket(
								S0_T2.sppl_cd.eq(S0_M14.bp_cd)
							)
						)
						.leftOuterJoin(S0_M13).on(
							bracket(
								S0_T1.itm_cd.eq(S0_M13.itm_cd)
								.and(S0_T1.itm_sub1.eq(S0_M13.itm_sub1))
								.and(S0_T1.itm_sub2.eq(S0_M13.itm_sub2))
								.and(S0_T1.itm_sub3.eq(S0_M13.itm_sub3))
								.and(S0_M13.lcl_cd.eq(S0_M14.prnt_lcl_cd))
							)
						)
						.innerJoin(S0_DAC).on(
							bracket(
								S0_DAC.dpt_cd.eq(S0_T2.purc_dpt_cd)
							)
						)
						.leftOuterJoin(S0_T5).on
							(bracket(
									S0_T5.slo_d_no.eq(S0_T1.slo_d_no)
								)
						)
					)
					.where(
						value(0).eq(value(0))
						.cutoff$and(S0_T1.po_no.eq(bind("tmp_po_no")))
					)
					.orderBy(S0_T1.disp_seq.asc())
			)
			.setJoinInfo(
				joinInfo(
					j -> j
						.add(MST_SLO_R.class, r -> toCondition(
							r.getStringNE("slo_no")
						))
						.addSelect(m -> toArray(
							m.assort_typ,
							m.cst_cd,
							m.slo_dt
						))
						.addMap((r, m) -> {
							r.setDateNE("slo_dt", m.slo_dt());
							r.setStringNE("cst_cd", m.cst_cd());
							r.setStringNE("assort_typ", m.assort_typ());
					}),
					j -> j
						.add(MST_SLO_D_R.class, r -> toCondition(
							r.getStringNE("slo_d_no")
						))
						.addSelect(m -> toArray(
							m.set_itm_grp_no
						))
						.addMap((r, m) -> {
							r.setNumberNE("set_itm_grp_no", m.set_itm_grp_no());
					}),
					j -> j
						.add(MAM_LOC_R.class, r -> toCondition(
							r.getStringNE("in_to_loc_cd")
						))
						.addSelect(m -> toArray(
							m.cal_cd,
							m.lg_grp_cd,
							m.loc_nm,
							m.site_cd,
							m.sppl_cd,
							m.str_ln_tgt_flg,
							m.wg_cd
						))
						.addMap((r, m) -> {
							r.setStringNE("in_to_loc_nm", m.loc_nm());
							r.setBooleanNE("in_to_str_ln_tgt_flg", m.str_ln_tgt_flg());
							r.setStringNE("in_to_loc_wg_cd", m.wg_cd());
							r.setStringNE("site_cd", m.site_cd());
							r.setStringNE("in_to_loc_lg_grp_cd", m.lg_grp_cd());
							r.setStringNE("in_to_loc_cal_cd", m.cal_cd());
							r.setStringNE("outsrc_sppl_cd", m.sppl_cd());
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
							m.conv_qty
						))
						.addMap((r, m) -> {
							r.setNumberNE("trd_unit_conv_base_qty", m.conv_base_qty());
							r.setNumberNE("trd_unit_conv_qty", m.conv_qty());
					}),
					j -> j
						.add(MAM_UNIT_R.class, r -> toCondition(
							r.getStringNE("trd_unit_cd")
						))
						.addSelect(m -> toArray(
							m.dec_place,
							m.unit_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("trd_unit_nm", m.unit_nm());
							r.setNumberNE("trd_unit_dec_place", m.dec_place());
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
						.add(MSVT_WRK_SNO_R.class, r -> toCondition(
							r.getStringNE("sno1")
						))
						.addSelect(m -> toArray(
							m.wrk_no
						))
						.addMap((r, m) -> {
							r.setStringNE("join_wrk_no_", m.wrk_no());
					}),
					j -> j
						.add(MST_WRK_R.class, r -> toCondition(
							r.getStringNE("join_wrk_no_")
						))
						.addSelect(m -> toArray(
							m.wrk_nm,
							m.wrk_no
						))
						.addMap((r, m) -> {
							r.setStringNE("wrk_no", m.wrk_no());
							r.setStringNE("wrk_nm", m.wrk_nm());
					})
				)
			);
	}
	
	/**
	 * -- MSBDL0120_MST_PO_Query_S01
	 */
	static MCQueryPlan MSBDL0120_MST_PO_S01() {
		MST_PO_R S0_T1 = MST_PO_R.create("T1");
		MAM_DPT_R S0_M3 = MAM_DPT_R.create("M3");
		MAM_CUR_R S0_M6 = MAM_CUR_R.create("M6");
		MAM_CUR_R S0_M7 = MAM_CUR_R.create("M7");
		MAVM_RD_DPT_R S0_M99 = MAVM_RD_DPT_R.create("M99");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBDL0120_MST_PO_Query_S01")
					.mainQuery()
					.select(
						S0_T1.po_no,
						S0_T1.po_rev,
						S0_T1.po_dt,
						S0_T1.trd_cd,
						S0_T1.aprv_flg,
						S0_T1.aprv_no,
						S0_T1.aprv_sts_typ,
						S0_T1.sppl_cd,
						S0_T1.sppl_zip_cd,
						S0_T1.sppl_addr1,
						S0_T1.sppl_addr2,
						S0_T1.sppl_addr3,
						S0_T1.sppl_addr4,
						S0_T1.sppl_tel,
						S0_T1.sppl_fax,
						S0_T1.sppl_cntct_dpt,
						S0_T1.sppl_cntct_psn,
						S0_T1.edi_flg,
						S0_T1.purc_usr_cd,
						S0_T1.purc_dpt_cd,
						S0_M3.dpt_nm.as("purc_dpt_nm"),
						S0_T1.wg_cd.as("purc_dpt_wg_cd"),
						S0_T1.trd_cur_cd,
						bind("base_cur_cd").as("base_cur_cd"),
						S0_M6.cur_nm.as("base_cur_nm"),
						S0_M6.amt_dec_place.as("base_cur_amt_dec_place"),
						S0_M6.upri_dec_place.as("base_cur_upri_dec_place"),
						bind("ptax_cur_cd").as("ptax_cur_cd"),
						S0_M7.cur_nm.as("ptax_cur_nm"),
						S0_M7.amt_dec_place.as("ptax_cur_amt_dec_place"),
						S0_M7.upri_dec_place.as("ptax_cur_upri_dec_place"),
						S0_T1.xrate,
						S0_T1.ptax_xrate,
						S0_T1.trd_rmrks,
						S0_T1.po_print_rmrks,
						S0_T1.dlv_slip_rmrks,
						S0_T1.purc_if_flg,
						S0_T1.ext_sys_cd,
						S0_T1.ext_po_no,
						S0_T1.ins_usr_id,
						S0_T1.ins_usr_nm,
						S0_T1.ins_ts,
						S0_T1.ins_func_id,
						S0_T1.upd_usr_id,
						S0_T1.upd_usr_nm,
						S0_T1.upd_ts,
						S0_T1.upd_func_id,
						S0_T1.upd_srv_req_no
					)
					.from(
						S0_T1
						.leftOuterJoin(S0_M3).on(
							bracket(
								S0_M3.dpt_cd.eq(S0_T1.purc_dpt_cd)
								.and(S0_T1.po_dt.between(S0_M3.st_dt, S0_M3.end_dt))
							)
						)
						.leftOuterJoin(S0_M6).on(
							bracket(
								bind("base_cur_cd").eq(S0_M6.cur_cd)
							)
						)
						.leftOuterJoin(S0_M7).on(
							bracket(
								bind("ptax_cur_cd").eq(S0_M7.cur_cd)
							)
						)
						.innerJoin(S0_M99).on(
							bracket(
								S0_M99.dpt_cd.eq(S0_T1.purc_dpt_cd)
							)
						)
					)
					.where(
						value(0).eq(value(0))
						.and(S0_T1.po_no.eq(bind("po_no")))
						.and(S0_T1.can_flg.eq(value(false)))
					)
			)
			.setJoinInfo(
				joinInfo(
					j -> j
						.add(MAM_BP_R.class, r -> toCondition(
							r.getStringNE("sppl_cd")
						))
						.addSelect(m -> toArray(
							m.asppl_cd,
							m.bp_nm,
							m.cntry_cd,
							m.prms_recv_flg,
							m.sppl_cal_cd,
							m.sppl_iv_flg,
							m.sppl_ship_form_cd,
							m.subcon_flg,
							m.dlv_inst_dlv_slip_flg,
							m.prms_rcpt_dlv_slip_flg
						))
						.addMap((r, m) -> {
							r.setStringNE("sppl_nm", m.bp_nm());
							r.setStringNE("sppl_cal_cd", m.sppl_cal_cd());
							r.setStringNE("sppl_cntry_cd", m.cntry_cd());
							r.setBooleanNE("sppl_iv_flg", m.sppl_iv_flg());
							r.setBooleanNE("subcon_flg", m.subcon_flg());
							r.setBooleanNE("prms_recv_flg", m.prms_recv_flg());
							r.setStringNE("asppl_cd", m.asppl_cd());
							r.setStringNE("sppl_ship_form_cd", m.sppl_ship_form_cd());
							r.setBooleanNE("dlv_inst_dlv_slip_flg", m.dlv_inst_dlv_slip_flg());
							r.setBooleanNE("prms_rcpt_dlv_slip_flg", m.prms_rcpt_dlv_slip_flg());
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
							r.getStringNE("asppl_cd")
						))
						.addSelect(m -> toArray(
							m.bp_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("asppl_nm", m.bp_nm());
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
						.add(MAM_EXT_SYS_R.class, r -> toCondition(
							r.getStringNE("ext_sys_cd")
						))
						.addSelect(m -> toArray(
							m.ext_sys_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("ext_sys_nm", m.ext_sys_nm());
					})
				)
			);
	}
	
	/**
	 * -- MSBDL0120_MST_PRMS_RCPT_D_Query_S01
	 */
	static MCQueryPlan MSBDL0120_MST_PRMS_RCPT_D_S01() {
		MSW_PO_D_KEY_R S0_T1 = MSW_PO_D_KEY_R.create("T1");
		MST_PRMS_RCPT_R S0_T2 = MST_PRMS_RCPT_R.create("T2");
		MST_PRMS_RCPT_D_R S0_T3 = MST_PRMS_RCPT_D_R.create("T3");
		MST_PO_D_R S0_T4 = MST_PO_D_R.create("T4");
		MST_RCPT_IV_D_R S0_RID = MST_RCPT_IV_D_R.create("RID");
		MST_PURC_SCHD_R S0_PS = MST_PURC_SCHD_R.create("PS");
		MST_ARR_PR_R S0_T5 = MST_ARR_PR_R.create("T5");
		MST_ARR_SCHD_R S0_T6 = MST_ARR_SCHD_R.create("T6");
		MST_PURC_SCHD_R S0_T7 = MST_PURC_SCHD_R.create("T7");
		MST_PURC_DLV_SLIP_R S0_T8 = MST_PURC_DLV_SLIP_R.create("T8");
		MST_PURC_DLV_SLIP_D_R S0_T9 = MST_PURC_DLV_SLIP_D_R.create("T9");
		MST_DLV_SLIP_R S0_T10 = MST_DLV_SLIP_R.create("T10");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBDL0120_MST_PRMS_RCPT_D_Query_S01")
					.mainQuery()
					.select(
						S0_T2.po_d_no,
						S0_T4.purc_id_typ,
						S0_T4.dlv_cd,
						S0_T3.prms_rcpt_d_no,
						S0_T3.prms_rcpt_no,
						S0_T8.dlv_slip_no,
						S0_T8.dlv_slip_seq,
						S0_T8.dlv_slip_rev,
						S0_T9.purc_ddlv_dlv_slip_no,
						S0_T9.purc_ddlv_dlv_slip_seq,
						S0_T10.dlv_slip_rev.as("purc_ddlv_dlv_slip_rev"),
						S0_T4.itm_cd,
						S0_T4.itm_sub1,
						S0_T4.itm_sub2,
						S0_T4.itm_sub3,
						S0_T3.trd_unit_qty,
						S0_T3.trd_unit_cd,
						S0_T3.base_unit_qty,
						S0_T3.base_unit_cd,
						S0_T6.arr_qty,
						S0_T6.abort_qty.as("act_abort_qty"),
						S0_T6.purc_qty.as("purc_act_qty"),
						S0_T7.base_unit_abort_qty.as("purc_abort_qty"),
						S0_T7.base_unit_accpt_dfct_qty.as("accpt_dfct_qty"),
						S0_T6.rcpt_iv_no,
						trunc(
							S0_T3.prms_dlv_tm,
							MCDateFmt.DD
						).as("prms_dlv_dt"),
						S0_T3.prms_dlv_tm.as("prms_dlv_hm"),
						S0_T3.purc_schd_dt,
						S0_T3.sync_flg,
						S0_T3.intr_rmrks,
						S0_T3.prms_rmrks,
						S0_T4.outsrc_flg,
						S0_T3.mfg_inst_no,
						S0_T3.purc_act_d_no,
						S0_T3.dlv_inst_d_no,
						S0_T3.sub_char1,
						S0_T3.sub_char2,
						S0_T3.sub_char3,
						S0_T6.cmpl_flg.as("arr_cmpl_flg"),
						S0_T7.cmpl_flg.as("purc_cmpl_flg"),
						S0_T6.arr_skip_flg,
						S0_T7.non_purc_flg,
						S0_T3.ins_usr_id,
						S0_T3.ins_usr_nm,
						S0_T3.ins_ts,
						S0_T3.ins_func_id,
						S0_T3.upd_usr_id,
						S0_T3.upd_usr_nm,
						S0_T3.upd_ts,
						S0_T3.upd_func_id,
						S0_T3.upd_srv_req_no,
						S0_T3.upd_cntr,
						decode(
							S0_T3.base_unit_qty,
							S0_RID.base_unit_qty,
							value(true),
							value(false)
						).as("rcpt_iv_cmpl_flg")
						,S0_RID.base_unit_qty.as("rcpt_iv_qty")
					)
					.from(
						S0_T1
						.innerJoin(S0_T2).on(
							bracket(
								S0_T2.po_d_no.eq(S0_T1.po_d_no)
							)
						)
						.innerJoin(S0_T3).on(
							bracket(
								S0_T3.prms_rcpt_no.eq(S0_T2.prms_rcpt_no)
							)
						)
						.innerJoin(S0_T4).on(
							bracket(
								S0_T4.po_d_no.eq(S0_T1.po_d_no)
							)
						)
						.leftOuterJoin(S0_RID).on(
							bracket(
								S0_T3.prms_rcpt_d_no.eq(S0_RID.ref_prms_rcpt_d_no)
							)
						)
						.leftOuterJoin(S0_PS).on(
							bracket(
								S0_RID.purc_schd_no.eq(S0_PS.purc_schd_no)
							)
						)
						.leftOuterJoin(S0_T5).on(
							bracket(
								S0_T5.po_d_no.eq(S0_T1.po_d_no)
							)
						)
						.leftOuterJoin(S0_T6).on(
							bracket(
								bracket(
									S0_T6.arr_pr_no.eq(S0_T5.arr_pr_no)
									.and(S0_T6.prms_rcpt_d_no.eq(S0_T3.prms_rcpt_d_no))
								)
								.or(
									S0_T6.arr_pr_no.eq(S0_PS.arr_pr_no)
									.and(S0_T6.arr_schd_no.eq(S0_PS.arr_schd_no))
								)
							)
						)
						.leftOuterJoin(S0_T7).on(
							bracket(
								S0_T7.arr_pr_no.eq(S0_T5.arr_pr_no)
								.and(S0_T7.arr_schd_no.eq(S0_T6.arr_schd_no))
							)
						)
						.leftOuterJoin(S0_T8).on(
							bracket(S0_T8.dlv_slip_mng_no.eq(S0_T6.dlv_slip_mng_no)
							.and(S0_T8.dlv_slip_mng_seq.eq(S0_T6.dlv_slip_mng_seq))
							)
						)
						.leftOuterJoin(S0_T9).on(
							bracket(S0_T9.dlv_slip_mng_d_no.eq(S0_T6.dlv_slip_mng_d_no)
							.and(S0_T9.dlv_slip_mng_d_seq.eq(S0_T6.dlv_slip_mng_d_seq))
							)
						)
						.leftOuterJoin(S0_T10).on(
							bracket(S0_T10.dlv_slip_no.eq(S0_T9.purc_ddlv_dlv_slip_no)
							.and(S0_T10.dlv_slip_seq.eq(S0_T9.purc_ddlv_dlv_slip_seq))
							)
						)
					)
					.where(
						value(0).eq(value(0))
						.and(
							S0_T2.can_flg.eq(value(false))
						)
						.and(
							S0_T3.can_flg.eq(value(false))
						)
					)
					.orderBy(
						S0_T2.po_d_no.asc(),
						S0_T3.prms_rcpt_no.asc(),
						S0_T3.prms_rcpt_d_no.asc()
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
							r.setNumberNE("conv_base_qty", m.conv_base_qty());
							r.setNumberNE("conv_qty", m.conv_qty());
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
						.add(MAM_ITM_R.class, r -> toCondition(
							r.getStringNE("itm_cd"),
							r.getStringNE("itm_sub1"),
							r.getStringNE("itm_sub2"),
							r.getStringNE("itm_sub3")
						))
						.addSelect(m -> toArray(
							m.dscnt_itm_flg
						))
						.addMap((r, m) -> {
							r.setBooleanNE("dscnt_itm_flg", m.dscnt_itm_flg());
					})
				)
			);
	}
	
	/**
	 * -- MSBDL0120_MST_PRMS_RCPT_Query_S01
	 */
	static MCQueryPlan MSBDL0120_MST_PRMS_RCPT_S01() {
		MSW_PO_D_KEY_R S0_T1 = MSW_PO_D_KEY_R.create("T1");
		MST_PRMS_RCPT_R S0_T2 = MST_PRMS_RCPT_R.create("T2");
		MST_ARR_PR_R S0_T3 = MST_ARR_PR_R.create("T3");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBDL0120_MST_PRMS_RCPT_Query_S01")
					.mainQuery()
					.select(
						S0_T2.po_d_no,
						S0_T2.prms_rcpt_no,
						S0_T2.arr_schd_refl_flg,
						S0_T2.arr_schd_refl_dt,
						S0_T2.prms_rcpt_dt,
						S0_T2.edi_flg,
						S0_T2.intr_rmrks,
						S0_T2.sub_char1,
						S0_T2.sub_char2,
						S0_T2.sub_char3,
						S0_T2.prms_rcpt_grp_no,
						S0_T2.can_flg,
						S0_T2.ins_usr_id,
						S0_T2.ins_usr_nm,
						S0_T2.ins_ts,
						S0_T2.ins_func_id,
						S0_T2.upd_usr_id,
						S0_T2.upd_usr_nm,
						S0_T2.upd_ts,
						S0_T2.upd_func_id,
						S0_T2.upd_srv_req_no,
						S0_T3.arr_pr_no,
						S0_T3.upd_cntr.as("arr_pr_upd_cntr")
					)
					.from(
						S0_T1
						.innerJoin(S0_T2).on(
							bracket(
								S0_T2.po_d_no.eq(S0_T1.po_d_no)
							)
						)
						.innerJoin(S0_T3).on(
							bracket(
								S0_T3.po_d_no.eq(S0_T1.po_d_no)
							)
						)
					)
					.where(
						value(0).eq(value(0))
						.and(
								S0_T2.can_flg.eq(value(false))
						)
					)
					.orderBy(
						S0_T2.po_d_no.asc(),
						S0_T2.prms_rcpt_no.asc()
					)
			);
	}
	
	/**
	 * -- MSBDL0120_MST_PURC_ACT_Query_S01
	 */
	static MCQueryPlan MSBDL0120_MST_PURC_ACT_S01() {
		MSW_PO_D_KEY_R S0_T1 = MSW_PO_D_KEY_R.create("T1");
		MST_ARR_PR_R S0_T2 = MST_ARR_PR_R.create("T2");
		MST_PURC_SCHD_R S0_T3 = MST_PURC_SCHD_R.create("T3");
		MST_PURC_ACT_D_R S0_T4 = MST_PURC_ACT_D_R.create("T4");
		MST_PURC_ACT_R S0_T5 = MST_PURC_ACT_R.create("T5");
		MST_PO_D_R S0_T6 = MST_PO_D_R.create("T6");
		MST_PO_R S0_T7 = MST_PO_R.create("T7");
		MAM_CUR_R S0_M10 = MAM_CUR_R.create("M10");
		MAM_CUR_R S0_M11 = MAM_CUR_R.create("M11");
		MAM_BP_R S0_M14 = MAM_BP_R.create("M14");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBDL0120_MST_PURC_ACT_Query_S01")
					.mainQuery()
					.select(
						S0_T5.purc_dt,
						S0_T7.trd_cur_cd,
						bind("base_cur_cd").as("base_cur_cd"),
						S0_M10.amt_dec_place.as("base_cur_amt_dec_place"),
						S0_M10.upri_dec_place.as("base_cur_upri_dec_place"),
						bind("ptax_cur_cd").as("ptax_cur_cd"),
						S0_M11.amt_dec_place.as("ptax_cur_amt_dec_place"),
						S0_M11.upri_dec_place.as("ptax_cur_upri_dec_place"),
						S0_T5.ac_dt,
						S0_T4.trd_unit_qty,
						S0_T4.trd_unit_cd,
						S0_T4.base_unit_cd,
						S0_T4.base_unit_qty,
						S0_T4.in_to_loc_cd.as("arr_loc_cd"),
						S0_T4.str_ln_cd,
						S0_T4.trd_cur_upri,
						decode(S0_T6.outsrc_flg, value(true), S0_M14.repurc_obli_flg, value(false)).as("repurc_obli_flg"),
						S0_T4.trd_cur_proc_upri,
						S0_T4.trd_cur_onr_prov_upri,
						S0_T4.interim_flg,
						S0_T4.trd_cur_dscnt_amt,
						S0_T4.dscnt_rsn_cd,
						S0_T4.trd_cur_proc_amt,
						S0_T4.trd_cur_onr_prov_amt,
						S0_T4.trd_cur_amt,
						S0_T4.trd_cur_amt.add(S0_T4.trd_cur_tax_amt).as("trd_cur_inc_tax_amt"),
						S0_T4.tax_cd,
						S0_T4.trd_cur_tax_amt,
						S0_T4.base_cur_proc_upri,
						S0_T4.base_cur_onr_prov_upri,
						S0_T4.base_cur_upri,
						S0_T4.base_cur_dscnt_amt,
						S0_T4.base_cur_proc_amt,
						S0_T4.base_cur_onr_prov_amt,
						S0_T4.base_cur_amt,
						S0_T4.base_cur_amt.add(S0_T4.base_cur_tax_amt).as("base_cur_inc_tax_amt"),
						S0_T4.base_cur_tax_amt,
						S0_T4.ptax_cur_proc_upri,
						S0_T4.ptax_cur_onr_prov_upri,
						S0_T4.ptax_cur_upri,
						S0_T4.ptax_cur_dscnt_amt,
						S0_T4.ptax_cur_proc_amt,
						S0_T4.ptax_cur_onr_prov_amt,
						S0_T4.ptax_cur_amt,
						S0_T4.ptax_cur_amt.add(S0_T4.ptax_cur_tax_amt).as("ptax_cur_inc_tax_amt"),
						S0_T4.ptax_cur_tax_amt,
						S0_T4.wtax_rate,
						S0_T4.wtax_amt,
						S0_T4.re_arr_flg,
						S0_T4.re_arr_sync_flg,
						S0_T4.re_arr_loc_cd,
						S0_T4.re_arr_purc_schd_dt,
						trunc(
							S0_T4.re_arr_rqst_tm,
							MCDateFmt.DD
						).as("re_arr_rqst_dt"),
						S0_T4.re_arr_rqst_tm.as("re_arr_rqst_hm"),
						S0_T4.re_arr_str_ln_cd,
						S0_T4.trd_unit_re_arr_qty,
						S0_T4.trd_d_rmrks,
						S0_T2.po_d_no,
						S0_T4.purc_schd_no,
						S0_T4.purc_act_d_no,
						S0_T4.purc_act_no,
						S0_T4.ins_usr_id,
						S0_T4.ins_usr_nm,
						S0_T4.ins_ts,
						S0_T4.ins_func_id,
						S0_T4.upd_usr_id,
						S0_T4.upd_usr_nm,
						S0_T4.upd_ts,
						S0_T4.upd_func_id,
						S0_T4.upd_srv_req_no,
						// this field is appended by sql coverter.
						S0_T4.itm_cd.as("join_itm_cd_"),
						// this field is appended by sql coverter.
						S0_T4.itm_sub1.as("join_itm_sub1_"),
						// this field is appended by sql coverter.
						S0_T4.itm_sub2.as("join_itm_sub2_"),
						// this field is appended by sql coverter.
						S0_T4.itm_sub3.as("join_itm_sub3_")
					)
					.from(
						S0_T1
						.innerJoin(S0_T2).on(
							bracket(
								S0_T2.po_d_no.eq(S0_T1.po_d_no)
							)
						)
						.innerJoin(S0_T3).on(
							bracket(
								S0_T3.arr_pr_no.eq(S0_T2.arr_pr_no)
							)
						)
						.innerJoin(S0_T4).on(
							bracket(
								S0_T4.purc_schd_no.eq(S0_T3.purc_schd_no)
							)
						)
						.innerJoin(S0_T5).on(
							bracket(
								S0_T5.purc_act_no.eq(S0_T4.purc_act_no)
								.and(S0_T5.purc_act_seq.eq(S0_T4.purc_act_seq))
							)
						)
						.innerJoin(S0_T6).on(
							bracket(
								S0_T6.po_d_no.eq(S0_T1.po_d_no)
							)
						)
						.innerJoin(S0_T7).on(
							bracket(
								S0_T7.po_no.eq(S0_T6.po_no)
							)
						)
						.leftOuterJoin(S0_M10).on(
							bracket(
								bind("base_cur_cd").eq(S0_M10.cur_cd)
							)
						)
						.leftOuterJoin(S0_M11).on(
							bracket(
								bind("ptax_cur_cd").eq(S0_M11.cur_cd)
							)
						)
						.leftOuterJoin(S0_M14).on(
								bracket(
									S0_T5.sppl_cd.eq(S0_M14.bp_cd)
								)
							)
					)
					.where(
						value(0).eq(value(0))
						.and(S0_T5.slip_sts_typ.eq(value(MAC_SLIP_STS_TYP.CRT.value())))
					)
					.orderBy(
						S0_T2.po_d_no.asc(),
						S0_T4.purc_schd_no.asc(),
						S0_T4.purc_act_no.asc(),
						S0_T4.disp_seq.asc()
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
							m.dec_place
						))
						.addMap((r, m) -> {
							r.setNumberNE("trd_unit_dec_place", m.dec_place());
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
							r.getStringNE("join_itm_cd_"),
							r.getStringNE("join_itm_sub1_"),
							r.getStringNE("join_itm_sub2_"),
							r.getStringNE("join_itm_sub3_"),
							r.getStringNE("base_unit_cd")
						))
						.addSelect(m -> toArray(
							m.dec_place
						))
						.addMap((r, m) -> {
							r.setNumberNE("base_unit_dec_place", m.dec_place());
					}),
					j -> j
						.add(MAM_LOC_R.class, r -> toCondition(
							r.getStringNE("arr_loc_cd")
						))
						.addSelect(m -> toArray(
							m.loc_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("arr_loc_nm", m.loc_nm());
					}),
					j -> j
						.add(MAM_STR_LN_R.class, r -> toCondition(
							r.getStringNE("arr_loc_cd"),
							r.getStringNE("str_ln_cd")
						))
						.addSelect(m -> toArray(
							m.str_ln_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("str_ln_nm", m.str_ln_nm());
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
						.add(MAM_TAX_R.class, r -> toCondition(
							r.getStringNE("tax_cd")
						))
						.addSelect(m -> toArray(
							m.tax_nm,
							m.tax_rate
						))
						.addMap((r, m) -> {
							r.setStringNE("tax_nm", m.tax_nm());
							r.setNumberNE("tax_rate", m.tax_rate());
					}),
					j -> j
						.add(MAM_CUR_R.class, r -> toCondition(
							r.getStringNE("trd_cur_cd")
						))
						.addSelect(m -> toArray(
							m.amt_dec_place,
							m.upri_dec_place
						))
						.addMap((r, m) -> {
							r.setNumberNE("trd_cur_amt_dec_place", m.amt_dec_place());
							r.setNumberNE("trd_cur_upri_dec_place", m.upri_dec_place());
					}),
					j -> j
						.add(MAM_LOC_R.class, r -> toCondition(
							r.getStringNE("re_arr_loc_cd")
						))
						.addSelect(m -> toArray(
							m.loc_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("re_arr_loc_nm", m.loc_nm());
					}),
					j -> j
						.add(MAM_STR_LN_R.class, r -> toCondition(
							r.getStringNE("re_arr_loc_cd"),
							r.getStringNE("re_arr_str_ln_cd")
						))
						.addSelect(m -> toArray(
							m.str_ln_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("re_arr_str_ln_nm", m.str_ln_nm());
					})
				)
			);
	}
}