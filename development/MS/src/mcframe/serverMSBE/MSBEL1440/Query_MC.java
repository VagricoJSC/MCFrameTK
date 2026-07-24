package mcframe.serverMSBE.MSBEL1440;

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
	 * -- MSBEL1440_MST_IV_Query_S01
	 */
	static MCQueryPlan MSBEL1440_MST_IV_S01() {
		MST_IV_R S0_T1 = MST_IV_R.create("T1");
		MST_IV_D_R S0_T2 = MST_IV_D_R.create("T2");
		MST_IV_MAP_R S0_T99 = MST_IV_MAP_R.create("T99");
		MST_SHIP_SCHD_R S0_T4 = MST_SHIP_SCHD_R.create("T4");
		MST_SHIP_ALLOC_STS_R S0_T3 = MST_SHIP_ALLOC_STS_R.create("T3");
		MST_SHIP_PR_R S0_T5 = MST_SHIP_PR_R.create("T5");
		MST_SLO_D_R S0_T7 = MST_SLO_D_R.create("T7");
		MAM_BP_R S0_M1 = MAM_BP_R.create("M1");
		MAM_LG_GRP_R S0_M2 = MAM_LG_GRP_R.create("M2");
		MAM_LG_GRP_R S0_M3 = MAM_LG_GRP_R.create("M3");
		MAM_ITM_R S0_M6 = MAM_ITM_R.create("M6");
		MAM_DPT_R S0_M19 = MAM_DPT_R.create("M19");
		MAM_SUNDRY_ITM_R S0_M20 = MAM_SUNDRY_ITM_R.create("M20");
		MSVM_DLV_ID_R S0_M21 = MSVM_DLV_ID_R.create("M21");
		MAM_ITM_LCL_R S0_M22 = MAM_ITM_LCL_R.create("M22");
		MAM_CNTRY_R S0_M26 = MAM_CNTRY_R.create("M26");
		MAVM_RD_LG_GRP_R S0_RD1 = MAVM_RD_LG_GRP_R.create("RD1");
		MAM_LOC_R S0_M27 = MAM_LOC_R.create("M27");
		MST_SHIP_ACT_R S1_W = MST_SHIP_ACT_R.create("W");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBEL1440_MST_IV_Query_S01")
					.mainQuery()
					.select(
						S0_T1.iv_no,
						S0_T1.iv_no.as("dtl_iv_no"),
						S0_T2.iv_d_no,
						S0_T2.disp_seq,
						S0_T3.ship_alloc_sts_no,
						S0_T4.ship_schd_no,
						S0_T5.ship_pr_no,
						S0_T5.slo_d_no,
						S0_T5.xfr_schd_no,
						S0_T4.pr_sts_typ,
						S0_T4.ship_schd_tm,
						S0_T4.dlv_schd_tm,
						S0_T1.trd_schd_dt,
						nvl2(
							S0_T1.tdlv_cd,
							value(MSC_SHIP_TO_ID_TYP.TDLV.value()),
							S0_T1.dlv_id_typ
						).as("ship_to_id_typ"),
						coalesce(
							S0_T1.tdlv_cd,
							S0_T1.dlv_id_cd
						).as("ship_to_id_cd"),
						nvl2(
							S0_T1.tdlv_cd,
							decode(
								S0_T1.tdlv_sundry_flg,
								value(true),
								S0_T1.tdlv_nm,
								S0_M1.bp_nm
							),
							decode(
								S0_T1.dlv_sundry_flg,
								value(true),
								S0_T1.dlv_id_nm,
								S0_M21.dlv_id_nm
							)
						).as("ship_to_id_nm"),
						nvl2(
							S0_T1.tdlv_cd,
							S0_T1.tdlv_zip_cd,
							S0_T1.dlv_zip_cd
						).as("ship_to_zip_cd"),
						nvl2(
							S0_T1.tdlv_cd,
							S0_T1.tdlv_addr1,
							S0_T1.dlv_addr1
						).as("ship_to_addr1"),
						nvl2(
							S0_T1.tdlv_cd,
							S0_T1.tdlv_addr2,
							S0_T1.dlv_addr2
						).as("ship_to_addr2"),
						nvl2(
							S0_T1.tdlv_cd,
							S0_T1.tdlv_addr3,
							S0_T1.dlv_addr3
						).as("ship_to_addr3"),
						nvl2(
							S0_T1.tdlv_cd,
							S0_T1.tdlv_addr4,
							S0_T1.dlv_addr4
						).as("ship_to_addr4"),
						nvl2(
							S0_T1.tdlv_cd,
							S0_T1.tdlv_cntct_dpt,
							S0_T1.dlv_cntct_dpt
						).as("ship_to_cntct_dpt"),
						nvl2(
							S0_T1.tdlv_cd,
							S0_T1.tdlv_cntct_psn,
							S0_T1.dlv_cntct_psn
						).as("ship_to_cntct_psn"),
						nvl2(
							S0_T1.tdlv_cd,
							S0_T1.tdlv_tel,
							S0_T1.dlv_tel
						).as("ship_to_tel"),
						nvl2(
							S0_T1.tdlv_cd,
							S0_T1.tdlv_fax,
							S0_T1.dlv_fax
						).as("ship_to_fax"),
						nvl2(
							S0_T1.tdlv_cd,
							S0_T1.tdlv_sundry_flg,
							S0_T1.dlv_sundry_flg
						).as("ship_to_sundry_flg"),
						nvl2(
							S0_T1.tdlv_cd,
							S0_T1.tdlv_lg_grp_cd,
							nvl2(
								S0_T4.dlv_cd,
								S0_T4.dlv_lg_grp_cd,
								S0_T5.ship_to_lg_grp_cd
							)
						).as("ship_to_lg_grp_cd"),
						S0_M2.lg_grp_nm.as("ship_to_lg_grp_nm"),
						S0_T1.via_dlv_typ,
						S0_T4.ship_fr_lg_grp_cd,
						S0_M3.lg_grp_nm.as("ship_fr_lg_grp_nm"),
						S0_M3.wg_cd,
						S0_M3.ship_slip_act_flg.as("dlv_slip_prnt_flg"),
						S0_M3.ship_slip_act_flg.as("ship_adv_prnt_flg"),
						nullValue().as("ship_term_cd"),
						nullValue().as("ship_term_nm"),
						nullValue().as("ship_inst_prnt_flg"),
						S0_T2.trd_cd,
						S0_T1.trd_ptn_typ,
						S0_T2.itm_cd,
						S0_T2.itm_sub1,
						S0_T2.itm_sub2,
						S0_T2.itm_sub3,
						decode(
							S0_T2.sundry_itm_flg,
							value(true),
							nvl(
								S0_T2.itm_nm,
								S0_M20.itm_nm
							),
							S0_M6.itm_nm
						).as("itm_nm"),
						decode(
							S0_T2.sundry_itm_flg,
							value(true),
							nvl(
								S0_T2.iv_itm_nm,
								S0_M20.itm_nm
							),
							nvl(
								S0_M22.itm_nm,
								S0_M6.itm_nm
							)
						).as("iv_itm_nm"),
						S0_M6.stk_mng_typ,
						S0_T2.sundry_itm_flg,
						S0_M6.dscnt_itm_flg,
						S0_T3.ent_unit_cd.as("trd_unit_cd"),
						S0_T3.ent_unit_qty.as("trd_unit_qty"),
						S0_T3.base_unit_cd,
						S0_T3.base_unit_qty,
						S0_T3.ship_act_qty.as("alloc_act_qty"),
						S0_M6.cont_fctr_unit_cd,
						S0_M6.cont_fctr_flg,
						S0_M6.std_cont_fctr,
						S0_M6.cont_fctr_dec_place,
						S0_M6.cont_fctr_rnd_typ,
						S0_T99.base_unit_qty.as("schd_qty"),
						nullValue().as("inst_qty"),
						S0_T4.iv_act_qty.as("ship_qty"),
						S0_T4.ship_ret_qty.as("ret_qty"),
						S0_T4.abort_flg,
						S0_T3.ship_loc_cd,
						S0_T3.ship_str_ln_cd,
						S0_M6.sno1_mng_typ,
						S0_M6.sno2_mng_typ,
						S0_M6.sno3_mng_typ,
						S0_M6.sno4_mng_typ,
						S0_T3.sno1,
						S0_T3.sno2,
						S0_T3.sno3,
						S0_T3.sno4,
						S0_T4.sno1.as("schd_sno1"),
						S0_T4.sno2.as("schd_sno2"),
						S0_T4.sno3.as("schd_sno3"),
						S0_T4.sno4.as("schd_sno4"),
						S0_T4.sno1_null_flg,
						S0_T4.sno2_null_flg,
						S0_T4.sno3_null_flg,
						S0_T4.sno4_null_flg,
						S0_M6.lot_mng_typ,
						S0_M6.sublot_mng_typ,
						S0_T3.lot_no,
						S0_T3.sublot_no,
						S0_M6.ver_flg,
						S0_T3.ver_no,
						S0_T4.not_lot_mix_flg,
						S0_T4.not_sublot_mix_flg,
						S0_T3.stk_arrv_bp_cd,
						S0_T3.gd_cd,
						S0_T3.quality_typ,
						S0_T3.stk_insp_typ,
						S0_T3.stk_id_typ,
						S0_T3.stk_bp_cd,
						S0_T7.cst_po_d_no,
						S0_T7.cst_itm_cd,
						S0_T7.cst_itm_nm,
						S0_T7.set_itm_grp_no,
						S0_T5.ship_inst_typ,
						S0_T5.cst_cd,
						S0_T5.dlv_id_typ,
						S0_T1.dlv_id_cd,
						nvl(
							S0_T1.dlv_id_nm,
							S0_M21.dlv_id_nm
						).as("dlv_id_nm"),
						S0_M21.cntry_cd.as("dlv_cntry_cd"),
						S0_M21.cntry_nm.as("dlv_cntry_nm"),
						S0_T1.dlv_zip_cd,
						S0_T1.dlv_addr1,
						S0_T1.dlv_addr2,
						S0_T1.dlv_addr3,
						S0_T1.dlv_addr4,
						S0_T1.dlv_cntct_dpt,
						S0_T1.dlv_cntct_psn,
						S0_T1.dlv_tel,
						S0_T1.dlv_fax,
						S0_T1.dlv_sundry_flg,
						nvl2(
							S0_T4.dlv_cd,
							S0_T4.pri_prnt_flg,
							S0_T7.pri_prnt_flg
						).as("pri_prnt_flg"),
						S0_T5.dlv_str_ln_cd,
						decode(
							S0_T5.dlv_id_typ,
							value(MSC_DLV_ID_TYP.LOC.value()),
							value(true),
							value(false)
						).as("iv_trd_flg"),
						S0_T5.loc_cd.as("ship_schd_loc_cd"),
						S0_T5.str_ln_cd.as("ship_schd_str_ln_cd"),
						S0_T2.rsn_cd,
						S0_T2.bd_dpt_cd,
						S0_M19.dpt_nm.as("bd_dpt_nm"),
						S0_M6.skip_chk_ship_flg,
						S0_T4.ship_cnt_rmrks,
						S0_T4.trd_rmrks,
						S0_T4.trd_d_rmrks,
						S0_T5.def_loc_cd,
						S0_M27.loc_nm.as("def_loc_nm"),
						S0_M27.str_ln_tgt_flg.as("def_str_ln_tgt_flg"),
						decode(
							S0_T4.ship_fr_lg_grp_cd,
							S0_M27.lg_grp_cd,
							S0_M3.ship_loc_prio_flg,
							value(false)
						).as("ship_loc_prio_flg"),
						S0_T3.alloc_scope_typ,
						nullValue().as("h_sub_char1"),
						nullValue().as("h_sub_char2"),
						nullValue().as("h_sub_char3"),
						nullValue().as("sub_char1"),
						nullValue().as("sub_char2"),
						nullValue().as("sub_char3"),
						S0_T1.ins_usr_id,
						S0_T1.ins_usr_nm,
						S0_T1.ins_func_id,
						nullValue().as("ins_func_nm"),
						S0_T1.ins_ts,
						S0_T1.upd_usr_id,
						S0_T1.upd_usr_nm,
						S0_T1.upd_func_id,
						nullValue().as("upd_func_nm"),
						S0_T1.upd_ts,
						S0_T5.upd_cntr,
						// this field is appended by sql coverter.
						S0_T7.slo_no.as("join_slo_no_"),
						// this field is appended by sql coverter.
						S0_T4.dlv_inst_rcpt_no.as("join_dlv_inst_rcpt_no_"),
						// this field is appended by sql coverter.
						S0_T5.dlv_id_cd.as("join_dlv_id_cd_"),
						value(0).as("base_unit_qty_bef")
					)
					.from(
						S0_T1
						.innerJoin(S0_T2).on(
							bracket(
								S0_T2.iv_mng_no.eq(S0_T1.iv_mng_no)
							)
						)
						.innerJoin(S0_T99).on(
							bracket(
								S0_T99.iv_d_no.eq(S0_T2.iv_d_no)
							)
						)
						.innerJoin(S0_T4).on(
							bracket(
								S0_T4.ship_schd_no.eq(S0_T99.ship_schd_no)
							)
						)
						.innerJoin(S0_T3).on(
							bracket(
								S0_T3.ship_schd_no.eq(S0_T4.ship_schd_no)
							)
						)
						.innerJoin(S0_T5).on(
							bracket(
								S0_T5.ship_pr_no.eq(S0_T4.ship_pr_no)
							)
						)
						.leftOuterJoin(S0_T7).on(
							bracket(
								S0_T7.slo_d_no.eq(S0_T5.slo_d_no)
							)
						)
						.leftOuterJoin(S0_M1).on(
							bracket(
								S0_M1.bp_cd.eq(S0_T1.tdlv_cd)
							)
						)
						.leftOuterJoin(S0_M2).on(
							bracket(
								S0_M2.lg_grp_cd.eq(nvl2(
										S0_T1.tdlv_cd,
										S0_T1.tdlv_lg_grp_cd,
										nvl2(
											S0_T4.dlv_cd,
											S0_T4.dlv_lg_grp_cd,
											S0_T5.ship_to_lg_grp_cd
										)
									)
								)
							)
						)
						.leftOuterJoin(S0_M3).on(
							bracket(
								S0_M3.lg_grp_cd.eq(S0_T4.ship_fr_lg_grp_cd)
							)
						)
						.leftOuterJoin(S0_M6).on(
							bracket(
								S0_M6.itm_cd.eq(S0_T2.itm_cd)
								.and(S0_M6.itm_sub1.eq(S0_T2.itm_sub1))
								.and(S0_M6.itm_sub2.eq(S0_T2.itm_sub2))
								.and(S0_M6.itm_sub3.eq(S0_T2.itm_sub3))
							)
						)
						.leftOuterJoin(S0_M19).on(
							bracket(
								S0_M19.dpt_cd.eq(S0_T2.bd_dpt_cd)
								.and(bind("today").between(S0_M19.st_dt, S0_M19.end_dt))
							)
						)
						.leftOuterJoin(S0_M20).on(
							bracket(
								S0_M20.itm_cd.eq(S0_T2.itm_cd)
								.and(S0_M20.itm_sub1.eq(S0_T2.itm_sub1))
								.and(S0_M20.itm_sub2.eq(S0_T2.itm_sub2))
								.and(S0_M20.itm_sub3.eq(S0_T2.itm_sub3))
								.and(S0_M20.sno1.eq(S0_T2.sno1))
								.and(S0_M20.sno2.eq(S0_T2.sno2))
								.and(S0_M20.sno3.eq(S0_T2.sno3))
								.and(S0_M20.sno4.eq(S0_T2.sno4))
							)
						)
						.leftOuterJoin(S0_M21).on(
							bracket(
								S0_M21.dlv_id_typ.eq(S0_T1.dlv_id_typ)
								.and(S0_M21.dlv_id_cd.eq(S0_T1.dlv_id_cd))
							)
						)
						.leftOuterJoin(S0_M22).on(
							bracket(
								S0_M22.itm_cd.eq(S0_T2.itm_cd)
								.and(S0_M22.itm_sub1.eq(S0_T2.itm_sub1))
								.and(S0_M22.itm_sub2.eq(S0_T2.itm_sub2))
								.and(S0_M22.itm_sub3.eq(S0_T2.itm_sub3))
								.and(S0_M22.lcl_cd.eq(S0_M21.prnt_lcl_cd))
							)
						)
						.leftOuterJoin(S0_M26).on(
							bracket(
								S0_M26.cntry_cd.eq(S0_M1.cntry_cd)
							)
						)
						.innerJoin(S0_RD1).on(
							bracket(
								S0_RD1.lg_grp_cd.eq(S0_T4.ship_fr_lg_grp_cd)
							)
						)
						.leftOuterJoin(S0_M27).on(
							bracket(
								S0_M27.loc_cd.eq(S0_T5.def_loc_cd)
							)
						)
					)
					.where(
						S0_T1.iv_no.eq(bind("iv_no"))
						.and(S0_T1.iv_ship_flg.eq(value(true)))
						.and(S0_T4.abort_flg.eq(value(false)))
						.and(S0_T3.base_unit_qty.subtract(S0_T3.ship_act_qty).gt(value(0)))
						.and(S0_T5.ship_inst_typ.eq(value(MAC_SHIP_INST_TYP.NON.value())))
						.and(S0_T4.cmpl_flg.eq(value(false)))
						.and(
							notExists(
								subQuery()
								.select(value("X"))
								.from(S1_W)
								.where(
									S1_W.iv_no.eq(S0_T1.iv_no)
									.and(S1_W.can_flg.eq(value(false)))
								)
							)
						)
					)
					.orderBy(
						S0_T2.disp_seq.asc(),
						S0_T4.ship_schd_no.asc(),
						S0_T3.ship_alloc_sts_no.asc()
					)
			)
			.setJoinInfo(
				joinInfo(
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
							m.act_cont_fctr
						))
						.addMap((r, m) -> {
							r.setNumberNE("act_cont_fctr", m.act_cont_fctr());
					}),
					j -> j
						.add(MST_SLO_R.class, r -> toCondition(
							r.getStringNE("join_slo_no_")
						))
						.addSelect(m -> toArray(
							m.assort_typ,
							m.cst_po_no,
							m.slo_no
						))
						.addMap((r, m) -> {
							r.setStringNE("slo_no", m.slo_no());
							r.setStringNE("cst_po_no", m.cst_po_no());
							r.setStringNE("assort_typ", m.assort_typ());
					}),
					j -> j
						.add(MST_DLV_INST_RCPT_R.class, r -> toCondition(
							r.getStringNE("join_dlv_inst_rcpt_no_")
						))
						.addSelect(m -> toArray(
							m.cst_dlv_inst_d_no,
							m.cst_dlv_inst_no
						))
						.addMap((r, m) -> {
							r.setStringNE("cst_dlv_inst_no", m.cst_dlv_inst_no());
							r.setStringNE("cst_dlv_inst_d_no", m.cst_dlv_inst_d_no());
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
							m.rnd_typ,
							m.unit_dim,
							m.unit_wt
						))
						.addMap((r, m) -> {
							r.setNumberNE("trd_unit_conv_base_qty", m.conv_base_qty());
							r.setNumberNE("trd_unit_conv_qty", m.conv_qty());
							r.setNumberNE("trd_unit_dec_place", m.dec_place());
							r.setStringNE("trd_unit_rnd_typ", m.rnd_typ());
							r.setNumberNE("unit_wt", m.unit_wt());
							r.setNumberNE("unit_dim", m.unit_dim());
					}),
					j -> j
						.add(MAM_UNIT_R.class, r -> toCondition(
							r.getStringNE("base_unit_cd")
						))
						.addSelect(m -> toArray(
							m.unit_cd,
							m.unit_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("base_unit_nm", m.unit_nm());
							r.setStringNE("join_unit_cd_", m.unit_cd());
					}),
					j -> j
						.add(MAVM_ITM_UNIT_R.class, r -> toCondition(
							r.getStringNE("itm_cd"),
							r.getStringNE("itm_sub1"),
							r.getStringNE("itm_sub2"),
							r.getStringNE("itm_sub3"),
							r.getStringNE("join_unit_cd_")
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
							r.getStringNE("ship_loc_cd")
						))
						.addSelect(m -> toArray(
							m.loc_nm,
							m.str_ln_tgt_flg
						))
						.addMap((r, m) -> {
							r.setStringNE("ship_loc_nm", m.loc_nm());
							r.setBooleanNE("ship_str_ln_tgt_flg", m.str_ln_tgt_flg());
					}),
					j -> j
						.add(MAM_STR_LN_R.class, r -> toCondition(
							r.getStringNE("ship_loc_cd"),
							r.getStringNE("ship_str_ln_cd")
						))
						.addSelect(m -> toArray(
							m.str_ln_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("ship_str_ln_nm", m.str_ln_nm());
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
							r.getStringNE("stk_arrv_bp_cd")
						))
						.addSelect(m -> toArray(
							m.bp_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("stk_arrv_bp_nm", m.bp_nm());
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
						.add(MAM_BIZ_RSN_R.class, r -> toCondition(
							r.getStringNE("rsn_cd")
						))
						.addSelect(m -> toArray(
							m.acxfr_gi_flg,
							m.biz_rsn_nm,
							m.sls_acxfr_flg
						))
						.addMap((r, m) -> {
							r.setStringNE("rsn_nm", m.biz_rsn_nm());
							r.setBooleanNE("sls_acxfr_flg", m.sls_acxfr_flg());
							r.setBooleanNE("acxfr_gi_flg", m.acxfr_gi_flg());
					}),
					j -> j
						.add(MAM_STR_LN_R.class, r -> toCondition(
							r.getStringNE("join_dlv_id_cd_"),
							r.getStringNE("dlv_str_ln_cd")
						))
						.addSelect(m -> toArray(
							m.str_ln_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("dlv_str_ln_nm", m.str_ln_nm());
					}),
					j -> j
						.add(MAM_BP_R.class, r -> toCondition(
							r.getStringNE("cst_cd")
						))
						.addSelect(m -> toArray(
							m.bp_nm,
							m.cst_iv_flg
						))
						.addMap((r, m) -> {
							r.setStringNE("cst_nm", m.bp_nm());
							r.setBooleanNE("cst_iv_flg", m.cst_iv_flg());
					}),
					j -> j
						.add(MAM_LOC_R.class, r -> toCondition(
							r.getStringNE("ship_schd_loc_cd")
						))
						.addSelect(m -> toArray(
							m.sppl_cd
						))
						.addMap((r, m) -> {
							r.setStringNE("ship_schd_loc_sppl_cd", m.sppl_cd());
					})
				)
			);
	}
	
	/**
	 * -- MSBEL1440_MST_SHIP_ACT_Query_S01
	 */
	static MCQueryPlan MSBEL1440_MST_SHIP_ACT_S01() {
		MST_SHIP_ACT_P_R S0_T1 = MST_SHIP_ACT_P_R.create("T1");
		MST_SHIP_ACT_R S0_T0 = MST_SHIP_ACT_R.create("T0");
		MCTempView S0_T2 = createTempView("T2");
		MST_SHIP_ALLOC_STS_R S0_T3 = MST_SHIP_ALLOC_STS_R.create("T3");
		MST_SHIP_INST_R S0_T4 = MST_SHIP_INST_R.create("T4");
		MST_SHIP_SCHD_R S0_T5 = MST_SHIP_SCHD_R.create("T5");
		MST_SHIP_PR_R S0_T6 = MST_SHIP_PR_R.create("T6");
		MST_SLO_D_R S0_T9 = MST_SLO_D_R.create("T9");
		MST_SLO_R S0_T10 = MST_SLO_R.create("T10");
		MCTempView S0_T11 = createTempView("T11");
		MST_DLV_SLIP_R S0_T15 = MST_DLV_SLIP_R.create("T15");
		MCTempView S0_T12 = createTempView("T12");
		MCTempView S0_T13 = createTempView("T13");
		MST_IV_SHIP_ACT_D_R S0_T14 = MST_IV_SHIP_ACT_D_R.create("T14");
		MST_IV_SHIP_ACT_MAP_R S0_T17 = MST_IV_SHIP_ACT_MAP_R.create("T17");
		MST_IV_D_R S0_T18 = MST_IV_D_R.create("T18");
		MST_IV_R S0_T19 = MST_IV_R.create("T19");
		MAM_ITM_R S0_M6 = MAM_ITM_R.create("M6");
		MAM_DPT_R S0_M19 = MAM_DPT_R.create("M19");
		MAM_DPT_R S0_M21 = MAM_DPT_R.create("M21");
		MAM_DPT_R S0_M23 = MAM_DPT_R.create("M23");
		MAM_SUNDRY_ITM_R S0_M25 = MAM_SUNDRY_ITM_R.create("M25");
		MSVM_DLV_ID_R S0_M26 = MSVM_DLV_ID_R.create("M26");
		MAM_ITM_LCL_R S0_M27 = MAM_ITM_LCL_R.create("M27");
		MSVM_SHIP_TO_ID_R S0_M28 = MSVM_SHIP_TO_ID_R.create("M28");
		MAM_BP_R S0_M29 = MAM_BP_R.create("M29");
		MAM_BP_R S0_M30 = MAM_BP_R.create("M30");
		MAM_LG_CTL_R S0_M32 = MAM_LG_CTL_R.create("M32");
		MAM_LG_CTL_R S0_M33 = MAM_LG_CTL_R.create("M33");
		MAVM_RD_LG_GRP_R S0_RD1 = MAVM_RD_LG_GRP_R.create("RD1");
		MST_DLV_SLIP_R S0_W1 = MST_DLV_SLIP_R.create();
		MST_SHIP_ACT_D_P_R S2_W2 = MST_SHIP_ACT_D_P_R.create("W2");
		MST_SHIP_ACT_R S3_W0 = MST_SHIP_ACT_R.create("W0");
		MST_IV_R S3_W1 = MST_IV_R.create("W1");
		MST_IV_D_R S3_W2 = MST_IV_D_R.create("W2");
		MST_IV_MAP_R S3_W3 = MST_IV_MAP_R.create("W3");
		MST_SHIP_ACT_D_R S4_W0 = MST_SHIP_ACT_D_R.create("W0");
		MST_SLS_ACT_IO_R S4_W1 = MST_SLS_ACT_IO_R.create("W1");
		MST_SLS_ACT_D_R S4_W2 = MST_SLS_ACT_D_R.create("W2");
		MST_SLS_ACT_R S4_W3 = MST_SLS_ACT_R.create("W3");
		MST_SHIP_ACT_D_R S5_W0 = MST_SHIP_ACT_D_R.create("W0");
		MST_ARR_PR_R S5_W1 = MST_ARR_PR_R.create("W1");
		MST_ARR_SCHD_R S5_W2 = MST_ARR_SCHD_R.create("W2");
		MST_ARR_ACT_R S5_W3 = MST_ARR_ACT_R.create("W3");
		MST_SHIP_ACT_R S2_W3 = MST_SHIP_ACT_R.create("W3");
		MCTempView S7_SW1 = createTempView("SW1");
		MST_IV_SHIP_ACT_MAP_R S7_W1 = MST_IV_SHIP_ACT_MAP_R.create("W1");
		
		return createQueryPlan()
			.setQuery(
				sql("MSBEL1440_MST_SHIP_ACT_Query_S01")
					.mainQuery()
					.select(
						S0_T1.ship_act_no,
						S0_T1.ship_act_rev,
						decode(
							bind("ship_act_rev"),
							nullValue(),
							value(true),
							S0_T0.ship_act_rev,
							value(true),
							value(false)
						).as("latest_flg"),
						S0_T1.can_flg,
						S0_T2.pr("ship_act_d_no"),
						S0_T1.ship_inst_no,
						S0_T2.pr("dlv_slip_no"),
						S0_T2.pr("dlv_slip_d_no"),
						S0_T1.iv_no,
						nvl(S0_T1.iv_no, S0_T19.iv_no).as("dtl_iv_no"),
						nvl(S0_T17.iv_d_no, S0_T11.pr(S3_W3.iv_d_no)).as("iv_d_no"),
						S0_M26.prnt_lcl_cd,
						S0_T2.pr("disp_seq"),
						S0_T3.ship_alloc_sts_no,
						S0_T3.ship_inst_d_no,
						S0_T5.ship_schd_no,
						S0_T6.ship_pr_no,
						S0_T9.slo_no,
						S0_T6.slo_d_no,
						S0_T6.xfr_schd_no,
						S0_T5.pr_sts_typ,
						S0_T1.ac_dt,
						S0_T1.ship_tm,
						S0_T1.dlv_tm,
						S0_T5.ship_schd_tm,
						S0_T5.dlv_schd_tm,
						S0_T1.ship_to_id_typ,
						S0_T1.ship_to_id_cd,
						decode(
							S0_T1.ship_to_sundry_flg,
							value(true),
							S0_T1.ship_to_id_nm,
							S0_M28.ship_to_id_nm
						).as("ship_to_id_nm"),
						S0_M28.cntry_cd.as("ship_to_cntry_cd"),
						S0_M28.cntry_nm.as("ship_to_cntry_nm"),
						S0_T1.ship_to_zip_cd,
						S0_T1.ship_to_addr1,
						S0_T1.ship_to_addr2,
						S0_T1.ship_to_addr3,
						S0_T1.ship_to_addr4,
						S0_T1.ship_to_cntct_dpt,
						S0_T1.ship_to_cntct_psn,
						S0_T1.ship_to_tel,
						S0_T1.ship_to_fax,
						S0_T1.ship_to_sundry_flg,
						nvl(
							S0_T6.cst_cd,
							S0_T1.cst_cd
						).as("cst_cd"),
						nvl(
							S0_M30.bp_nm,
							S0_M29.bp_nm
						).as("cst_nm"),
						nvl(
							S0_M30.cst_iv_flg,
							S0_M29.cst_iv_flg
						).as("cst_iv_flg"),
						S0_T1.ship_to_lg_grp_cd,
						S0_T1.via_dlv_typ,
						S0_T1.ship_fr_lg_grp_cd,
						S0_T1.wg_cd,
						S0_T1.rqst_usr_cd,
						S0_T1.rqst_dpt_cd,
						S0_M21.dpt_nm.as("rqst_dpt_nm"),
						S0_T1.ship_usr_cd,
						S0_T1.ship_dpt_cd,
						S0_M23.dpt_nm.as("ship_dpt_nm"),
						S0_T1.ship_term_cd,
						S0_T4.dlv_prnt_flg.as("inst_dlv_prnted_flg"),
						S0_T15.slip_prnt_flg.as("dlv_slip_prnted_flg"),
						S0_T15.ship_adv_prnt_flg.as("ship_adv_prnted_flg"),
						S0_T1.uplnd_flg,
						S0_T2.pr("trd_cd"),
						S0_T2.pr("trd_ptn_typ"),
						S0_T2.pr("itm_cd"),
						S0_T2.pr("itm_sub1"),
						S0_T2.pr("itm_sub2"),
						S0_T2.pr("itm_sub3"),
						decode(
							S0_T2.pr("sundry_itm_flg"),
							value(true),
							nvl(
								S0_T2.pr("itm_nm"),
								S0_M25.itm_nm
							),
							S0_M6.itm_nm
						).as("itm_nm"),
						decode(
							S0_T2.pr("sundry_itm_flg"),
							value(true),
							nvl(
								S0_T2.pr("iv_itm_nm"),
								S0_M25.itm_nm
							),
							nvl(
								S0_M27.itm_nm,
								S0_M6.itm_nm
							)
						).as("iv_itm_nm"),
						S0_M6.stk_mng_typ,
						S0_T2.pr("sundry_itm_flg"),
						S0_M6.dscnt_itm_flg,
						S0_T2.pr("stk_mng_typ"),
						S0_T2.pr("trd_unit_cd"),
						S0_T2.pr("trd_unit_qty"),
						S0_T2.pr("base_unit_cd"),
						S0_T2.pr("base_unit_qty"),
						S0_M6.cont_fctr_unit_cd,
						S0_M6.cont_fctr_flg,
						S0_M6.std_cont_fctr,
						S0_M6.cont_fctr_dec_place,
						S0_M6.cont_fctr_rnd_typ,
						decode(
							S0_T11.pr(S3_W3.iv_d_no),
							nullValue(),
							S0_T5.base_unit_qty,
							S0_T11.pr(S3_W3.base_unit_qty)
						).as("schd_qty"),
						S0_T5.ship_inst_qty.as("inst_qty"),
						S0_T5.ship_act_qty.as("ship_qty"),
						cases()
						.when(S0_T1.uplnd_flg.eq(value(true)).and(S0_M29.cst_iv_flg.eq(value(true))))
							.then(nvl(S0_T2.pr("ship_ret_qty"), value(0)))
						.otherwise(
							S0_T5.ship_ret_qty
						).as("ret_qty"),
						nvl(
							S0_T12.pr("sls_qty"),
							value(0)
						).as("sls_qty"),
						nvl(
							S0_T13.pr("arr_qty"),
							value(0)
						).as("arr_qty"),
						cases()
							.when(S0_T1.uplnd_flg.eq(value(true)).and(S0_T1.iv_no.isNull()))
								.then(nvl(S7_SW1.pr("iv_qty"),value(0)))
							.otherwise(
								nvl(S0_T14.base_unit_qty,value(0))
						).as("iv_qty"),
						S0_T15.sync_flg,
						S0_T5.abort_flg,
						S0_T2.pr("ship_loc_cd"),
						S0_T2.pr("ship_str_ln_cd"),
						S0_M6.sno1_mng_typ,
						S0_M6.sno2_mng_typ,
						S0_M6.sno3_mng_typ,
						S0_M6.sno4_mng_typ,
						S0_T2.pr("sno1"),
						S0_T2.pr("sno2"),
						S0_T2.pr("sno3"),
						S0_T2.pr("sno4"),
						S0_T5.sno1.as("schd_sno1"),
						S0_T5.sno2.as("schd_sno2"),
						S0_T5.sno3.as("schd_sno3"),
						S0_T5.sno4.as("schd_sno4"),
						S0_T5.sno1_null_flg,
						S0_T5.sno2_null_flg,
						S0_T5.sno3_null_flg,
						S0_T5.sno4_null_flg,
						S0_M6.lot_mng_typ,
						S0_M6.sublot_mng_typ,
						S0_T2.pr("lot_no"),
						S0_T2.pr("sublot_no"),
						S0_M6.ver_flg,
						S0_T2.pr("ver_no"),
						S0_T5.not_lot_mix_flg,
						S0_T5.not_sublot_mix_flg,
						S0_T2.pr("stk_arrv_bp_cd"),
						S0_T2.pr("gd_cd"),
						S0_T2.pr("quality_typ"),
						S0_T2.pr("stk_insp_typ"),
						S0_T2.pr("stk_id_typ"),
						S0_T2.pr("stk_bp_cd"),
						S0_T2.pr("cst_po_no"),
						S0_T2.pr("cst_po_d_no"),
						S0_T2.pr("cst_itm_cd"),
						S0_T2.pr("cst_itm_nm"),
						S0_T2.pr("cst_dlv_inst_no"),
						S0_T2.pr("cst_dlv_inst_d_no"),
						S0_T2.pr("dlv_id_typ"),
						S0_T2.pr("dlv_id_cd"),
						decode(
							S0_T2.pr("dlv_sundry_flg"),
							value(true),
							S0_T2.pr("dlv_id_nm"),
							S0_M26.dlv_id_nm
						).as("dlv_id_nm"),
						S0_M26.cntry_cd.as("dlv_cntry_cd"),
						S0_M26.cntry_nm.as("dlv_cntry_nm"),
						S0_T2.pr("dlv_str_ln_cd"),
						S0_M26.str_ln_tgt_flg.as("dlv_str_ln_tgt_flg"),
						S0_T2.pr("dlv_zip_cd"),
						S0_T2.pr("dlv_addr1"),
						S0_T2.pr("dlv_addr2"),
						S0_T2.pr("dlv_addr3"),
						S0_T2.pr("dlv_addr4"),
						S0_T2.pr("dlv_cntct_dpt"),
						S0_T2.pr("dlv_cntct_psn"),
						S0_T2.pr("dlv_tel"),
						S0_T2.pr("dlv_fax"),
						S0_T2.pr("dlv_sundry_flg"),
						S0_T2.pr("pri_prnt_flg"),
						cases()
							.when(S0_T2.pr("trd_ptn_typ").eq(value(MAC_TRD_PTN_TYP.PROV_RTN.value())))
								.then(value(false))
							.otherwise(
								nvl(
									S0_M32.iv_trd_flg,
									S0_M33.iv_trd_flg
								)
							).as("iv_trd_flg"),
						S0_M26.sppl_cd.as("dlv_sppl_cd"),
						S0_T10.assort_typ,
						S0_T9.set_itm_grp_no,
						S0_T6.ship_inst_typ,
						S0_T6.loc_cd.as("ship_schd_loc_cd"),
						S0_T6.str_ln_cd.as("ship_schd_str_ln_cd"),
						S0_T2.pr("rsn_cd"),
						S0_T2.pr("bd_dpt_cd"),
						S0_M19.dpt_nm.as("bd_dpt_nm"),
						S0_T2.pr("skip_chk_ship_flg"),
						S0_T2.pr("base_dlv_slip_no"),
						S0_T2.pr("base_prov_act_no"),
						S0_T2.pr("base_ac_dt"),
						S0_T5.ship_cnt_rmrks,
						S0_T2.pr("arr_cnt_rmrks"),
						S0_T2.pr("trd_rmrks"),
						S0_T2.pr("trd_d_rmrks"),
						S0_T1.intr_rmrks,
						S0_T1.sub_char1.as("h_sub_char1"),
						S0_T1.sub_char2.as("h_sub_char2"),
						S0_T1.sub_char3.as("h_sub_char3"),
						S0_T0.upd_cntr.as("ship_act_upd_cntr"),
						S0_T2.pr("intr_d_rmrks"),
						S0_T2.pr("sub_char1"),
						S0_T2.pr("sub_char2"),
						S0_T2.pr("sub_char3"),
						S0_T6.upd_cntr,
						S0_T1.ins_usr_id,
						S0_T1.ins_usr_nm,
						S0_T1.ins_func_id,
						nullValue().as("ins_func_nm"),
						S0_T1.ins_ts,
						S0_T1.upd_usr_id,
						S0_T1.upd_usr_nm,
						S0_T1.upd_func_id,
						nullValue().as("upd_func_nm"),
						S0_T1.upd_ts,
						S0_T1.upd_srv_req_no,
						S0_T2.pr("wms_flg"),
						S0_T2.pr("ext_ship_act_no"),
						S0_T2.pr("ext_sys_cd"),
						cases()
								.when(
									notExists(
										subQuery()
										.select(value("X"))
										.from(S0_W1)
										.where(
											S0_W1.trn_typ.eq(value(MSC_TRN_TYP.SHIP.value()))
											.and(S0_W1.dlv_slip_act_no.eq(S0_T1.ship_act_no))
										)
									)
								)
							.then(value(true))
						.otherwise(value(false)).as("disable_prnt_flg"),
						S0_T2.pr("base_unit_qty").as("base_unit_qty_bef")
					)
					.from(
						S0_T1
						.innerJoin(S0_T0).on(
							bracket(
								S0_T1.ship_act_no.eq(S0_T0.ship_act_no)
							)
						)
						.innerJoin(
							subQuery()
							.select(S2_W2.prAll())
							.from(S2_W2
								.innerJoin(S2_W3).on(
									S2_W3.ship_act_no.eq(S2_W2.ship_act_no)
								)
							)
							.where(
								value(0).eq(value(0))
								.and(S2_W2.ship_act_no.eq(bind("ship_act_no")))
								.and(S2_W2.ship_act_rev.eq(bind("ship_act_rev")))
								.and(S2_W3.can_flg.eq(value(true)).or(S2_W2.can_flg.eq(value(false))))
							).view(S0_T2)
						).on(
							bracket(
								S0_T2.pr("ship_act_no").eq(S0_T1.ship_act_no)
							)
						)
						.leftOuterJoin(S0_T3).on(
							bracket(
								S0_T3.ship_alloc_sts_no.eq(S0_T2.pr("ship_alloc_sts_no"))
							)
						)
						.leftOuterJoin(S0_T4).on(
							bracket(
								S0_T4.ship_inst_no.eq(S0_T1.ship_inst_no)
							)
						)
						.leftOuterJoin(S0_T5).on(
							bracket(
								S0_T5.ship_inst_d_no.eq(S0_T3.ship_inst_d_no)
								.or(S0_T5.ship_schd_no.eq(S0_T3.ship_schd_no))
							)
						)
						.leftOuterJoin(S0_T6).on(
							bracket(
								S0_T6.ship_pr_no.eq(S0_T5.ship_pr_no)
							)
						)
						.leftOuterJoin(S0_T9).on(
							bracket(
								S0_T9.slo_d_no.eq(S0_T6.slo_d_no)
							)
						)
						.leftOuterJoin(S0_T10).on(
							bracket(
								S0_T10.slo_no.eq(S0_T9.slo_no)
							)
						)
						.leftOuterJoin(
							subQuery()
							.select(
								S3_W3.ship_schd_no,
								S3_W1.iv_no,
								S3_W3.iv_d_no,
								S3_W3.base_unit_qty
							)
							.from(
								S3_W0
								.innerJoin(S3_W1).on(
									bracket(
										S3_W1.iv_no.eq(S3_W0.iv_no)
									)
								)
								.innerJoin(S3_W2).on(
									bracket(
										S3_W2.iv_mng_no.eq(S3_W1.iv_mng_no)
									)
								)
								.innerJoin(S3_W3).on(
									bracket(
										S3_W3.iv_d_no.eq(S3_W2.iv_d_no)
									)
								)
							)
							.where(
								S3_W0.ship_act_no.eq(bind("ship_act_no"))
							).view(S0_T11)
						).on(
							bracket(
								S0_T11.pr(S3_W3.ship_schd_no).eq(S0_T5.ship_schd_no)
							)
						)
						.leftOuterJoin(S0_T15).on(
							bracket(
								S0_T15.dlv_slip_no.eq(S0_T2.pr("dlv_slip_no"))
								.and(S0_T15.dlv_slip_seq.eq(S0_T2.pr("dlv_slip_seq")))
							)
						)
						.leftOuterJoin(
							subQuery()
							.select(
								S4_W0.ship_act_d_no,
								S4_W3.ship_act_sync_flg,
								sum(S4_W1.base_unit_qty).as("sls_qty")
							)
							.from(
								S4_W0
								.innerJoin(S4_W1).on(
									bracket(
										S4_W1.ship_act_d_no.eq(S4_W0.ship_act_d_no)
									)
								)
								.innerJoin(S4_W2).on(
									bracket(
										S4_W2.sls_act_d_no.eq(S4_W1.sls_act_d_no)
										.and(S4_W2.sls_act_d_seq.eq(S4_W1.sls_act_d_seq))
									)
								)
								.innerJoin(S4_W3).on(
									bracket(
										S4_W3.sls_act_no.eq(S4_W2.sls_act_no)
										.and(S4_W3.sls_act_seq.eq(S4_W2.sls_act_seq))
										.and(S4_W3.slip_sts_typ.eq(value(MAC_SLIP_STS_TYP.CRT.value())))
									)
								)
							)
							.where(
								S4_W0.ship_act_no.eq(bind("ship_act_no"))
							)
							.groupBy(
								S4_W0.ship_act_d_no,
								S4_W3.ship_act_sync_flg
							).view(S0_T12)
						).on(
							bracket(
								S0_T12.pr(S4_W0.ship_act_d_no).eq(S0_T2.pr("ship_act_d_no"))
							)
						)
						.leftOuterJoin(
							subQuery()
							.select(
								S5_W0.ship_act_d_no,
								sum(S5_W3.base_unit_qty).as("arr_qty")
							)
							.from(
								S5_W0
								.innerJoin(S5_W1).on(
									bracket(
										S5_W1.dlv_slip_d_no.eq(S5_W0.dlv_slip_d_no)
									)
								)
								.innerJoin(S5_W2).on(
									bracket(
										S5_W2.arr_pr_no.eq(S5_W1.arr_pr_no)
									)
								)
								.innerJoin(S5_W3).on(
									bracket(
										S5_W3.arr_schd_no.eq(S5_W2.arr_schd_no)
										.and(S5_W3.can_flg.eq(value(false)))
									)
								)
							)
							.where(
								S5_W0.ship_act_no.eq(bind("ship_act_no"))
							)
							.groupBy(S5_W0.ship_act_d_no).view(S0_T13)
						).on(
							bracket(
								S0_T13.pr(S5_W0.ship_act_d_no).eq(S0_T2.pr("ship_act_d_no"))
							)
						)
						.leftOuterJoin(S0_T14).on(
							bracket(
								S0_T14.ship_act_d_no.eq(S0_T2.pr("ship_act_d_no"))
							)
						)
						.leftOuterJoin(S0_T17).on(
								bracket(
										S0_T2.pr("ship_act_d_no").eq(S0_T17.ship_act_d_no)
										.and(S0_T17.ship_act_fix_flg.eq(value(true)))
										.and(S0_T1.iv_no.isNull())
										.and(S0_T1.via_dlv_typ.eq(value(MAC_VIA_DLV_TYP.NOT_VIA.value())))
								)
						)
						.leftOuterJoin(S0_T18).on(S0_T17.iv_d_no.eq(S0_T18.iv_d_no))
						.leftOuterJoin(S0_T19).on(S0_T18.iv_mng_no.eq(S0_T19.iv_mng_no))
						.leftOuterJoin(subQuery()
							.select(
								S7_W1.ship_act_d_no,
								sum(S7_W1.base_unit_qty).as("iv_qty")
							).from(S7_W1)
							.where(S7_W1.fix_flg.eq(value(true)))
							.groupBy(S7_W1.ship_act_d_no)
							.view(S7_SW1)).on(S0_T2.pr("ship_act_d_no").eq(S7_SW1.pr(S7_W1.ship_act_d_no))
									.and(S0_T1.iv_no.isNull()))
						.leftOuterJoin(S0_M6).on(
							bracket(
								S0_M6.itm_cd.eq(S0_T2.pr("itm_cd"))
								.and(S0_M6.itm_sub1.eq(S0_T2.pr("itm_sub1")))
								.and(S0_M6.itm_sub2.eq(S0_T2.pr("itm_sub2")))
								.and(S0_M6.itm_sub3.eq(S0_T2.pr("itm_sub3")))
							)
						)
						.leftOuterJoin(S0_M19).on(
							bracket(
								S0_M19.dpt_cd.eq(S0_T2.pr("bd_dpt_cd"))
								.and(S0_T1.ac_dt.between(S0_M19.st_dt, S0_M19.end_dt))
							)
						)
						.leftOuterJoin(S0_M21).on(
							bracket(
								S0_M21.dpt_cd.eq(S0_T1.rqst_dpt_cd)
								.and(S0_T1.ac_dt.between(S0_M21.st_dt, S0_M21.end_dt))
							)
						)
						.leftOuterJoin(S0_M23).on(
							bracket(
								S0_M23.dpt_cd.eq(S0_T1.ship_dpt_cd)
								.and(S0_T1.ac_dt.between(S0_M23.st_dt, S0_M23.end_dt))
							)
						)
						.leftOuterJoin(S0_M25).on(
							bracket(
								S0_M25.itm_cd.eq(S0_T2.pr("itm_cd"))
								.and(S0_M25.itm_sub1.eq(S0_T2.pr("itm_sub1")))
								.and(S0_M25.itm_sub2.eq(S0_T2.pr("itm_sub2")))
								.and(S0_M25.itm_sub3.eq(S0_T2.pr("itm_sub3")))
								.and(S0_M25.sno1.eq(S0_T2.pr("sno1")))
								.and(S0_M25.sno2.eq(S0_T2.pr("sno2")))
								.and(S0_M25.sno3.eq(S0_T2.pr("sno3")))
								.and(S0_M25.sno4.eq(S0_T2.pr("sno4")))
							)
						)
						.leftOuterJoin(S0_M26).on(
							bracket(
								S0_M26.dlv_id_typ.eq(S0_T2.pr("dlv_id_typ"))
								.and(S0_M26.dlv_id_cd.eq(S0_T2.pr("dlv_id_cd")))
							)
						)
						.leftOuterJoin(S0_M27).on(
							bracket(
								S0_M27.itm_cd.eq(S0_T2.pr("itm_cd"))
								.and(S0_M27.itm_sub1.eq(S0_T2.pr("itm_sub1")))
								.and(S0_M27.itm_sub2.eq(S0_T2.pr("itm_sub2")))
								.and(S0_M27.itm_sub3.eq(S0_T2.pr("itm_sub3")))
								.and(S0_M27.lcl_cd.eq(S0_M26.prnt_lcl_cd))
							)
						)
						.leftOuterJoin(S0_M28).on(
							bracket(
								S0_M28.ship_to_id_typ.eq(S0_T1.ship_to_id_typ)
								.and(S0_M28.ship_to_id_cd.eq(S0_T1.ship_to_id_cd))
							)
						)
						.leftOuterJoin(S0_M29).on(
							bracket(
								S0_M29.bp_cd.eq(S0_T1.cst_cd)
							)
						)
						.leftOuterJoin(S0_M30).on(
							bracket(
								S0_M30.bp_cd.eq(S0_T6.cst_cd)
							)
						)
						.leftOuterJoin(S0_M32).on(
							bracket(
								S0_M32.fr_lg_grp_cd.eq(S0_T1.ship_fr_lg_grp_cd)
								.and(S0_M32.to_lg_grp_cd.eq(S0_M26.lg_grp_cd))
								.and(S0_M32.ship_term_cd.eq(S0_T1.ship_term_cd))
							)
						)
						.leftOuterJoin(S0_M33).on(
							bracket(
								S0_M33.fr_lg_grp_cd.eq(S0_T1.ship_fr_lg_grp_cd)
								.and(S0_M33.to_lg_grp_cd.eq(S0_M26.lg_grp_cd))
								.and(S0_M33.ship_term_cd.eq(value(MAC_STR.NULL_VAL.value())))
							)
						)
						.innerJoin(S0_RD1).on(
							bracket(
								S0_RD1.lg_grp_cd.eq(S0_T1.ship_fr_lg_grp_cd)
							)
						)
					)
					.where(
						value(0).eq(value(0))
						.and(S0_T1.ship_act_no.eq(bind("ship_act_no")))
						.and(S0_T1.ship_act_rev.eq(bind("ship_act_rev")))
						.cutoff$and(
								S0_T1.can_flg.eq(value(false))
								.and(bind("edit_mode_flg").eq(value(true)))
							)
							.cutoff$and(
								S0_T2.pr("can_flg").eq(value(false))
								.and(bind("edit_mode_flg").eq(value(true)))
							)
							.cutoff$and(
								bracket(
									bind("ref_mode_flg").eq(value(true))
									.and(
										S0_T1.can_flg.eq(value(true))
										.and(S0_T2.pr("upd_srv_req_no").eq(S0_T1.upd_srv_req_no))
									)
								)
							)
					)
					.orderBy(S0_T2.pr("disp_seq").asc())
			)
			.setJoinInfo(
				joinInfo(
					j -> j
						.add(MST_SHIP_INST_R.class, r -> toCondition(
							r.getStringNE("ship_inst_no")
						))
						.addSelect(m -> toArray(
							m.ship_inst_tm
						))
						.addMap((r, m) -> {
							r.setDateNE("ship_inst_tm", m.ship_inst_tm());
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
							m.act_cont_fctr
						))
						.addMap((r, m) -> {
							r.setNumberNE("act_cont_fctr", m.act_cont_fctr());
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
						.add(MAM_LG_GRP_R.class, r -> toCondition(
							r.getStringNE("ship_to_lg_grp_cd")
						))
						.addSelect(m -> toArray(
							m.lg_grp_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("ship_to_lg_grp_nm", m.lg_grp_nm());
					}),
					j -> j
						.add(MAM_LG_GRP_R.class, r -> toCondition(
							r.getStringNE("ship_fr_lg_grp_cd")
						))
						.addSelect(m -> toArray(
							m.lg_grp_nm,
							m.ship_slip_act_flg
						))
						.addMap((r, m) -> {
							r.setStringNE("ship_fr_lg_grp_nm", m.lg_grp_nm());
							r.setBooleanNE("dlv_slip_prnt_flg", m.ship_slip_act_flg());
							r.setBooleanNE("ship_adv_prnt_flg", m.ship_slip_act_flg());
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
						.add(MAM_SHIP_TERM_R.class, r -> toCondition(
							r.getStringNE("ship_term_cd")
						))
						.addSelect(m -> toArray(
							m.ship_term_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("ship_term_nm", m.ship_term_nm());
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
							m.rnd_typ,
							m.unit_dim,
							m.unit_wt
						))
						.addMap((r, m) -> {
							r.setNumberNE("trd_unit_conv_base_qty", m.conv_base_qty());
							r.setNumberNE("trd_unit_conv_qty", m.conv_qty());
							r.setNumberNE("trd_unit_dec_place", m.dec_place());
							r.setStringNE("trd_unit_rnd_typ", m.rnd_typ());
							r.setNumberNE("unit_wt", m.unit_wt());
							r.setNumberNE("unit_dim", m.unit_dim());
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
							r.getStringNE("ship_loc_cd")
						))
						.addSelect(m -> toArray(
							m.loc_nm,
							m.sppl_cd,
							m.str_ln_tgt_flg
						))
						.addMap((r, m) -> {
							r.setStringNE("ship_loc_nm", m.loc_nm());
							r.setBooleanNE("ship_str_ln_tgt_flg", m.str_ln_tgt_flg());
							r.setStringNE("ship_loc_sppl_cd", m.sppl_cd());
					}),
					j -> j
						.add(MAM_STR_LN_R.class, r -> toCondition(
							r.getStringNE("ship_loc_cd"),
							r.getStringNE("ship_str_ln_cd")
						))
						.addSelect(m -> toArray(
							m.str_ln_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("ship_str_ln_nm", m.str_ln_nm());
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
							r.getStringNE("stk_arrv_bp_cd")
						))
						.addSelect(m -> toArray(
							m.bp_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("stk_arrv_bp_nm", m.bp_nm());
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
						.add(MAM_BIZ_RSN_R.class, r -> toCondition(
							r.getStringNE("rsn_cd")
						))
						.addSelect(m -> toArray(
							m.acxfr_gi_flg,
							m.biz_rsn_nm,
							m.sls_acxfr_flg
						))
						.addMap((r, m) -> {
							r.setStringNE("rsn_nm", m.biz_rsn_nm());
							r.setBooleanNE("sls_acxfr_flg", m.sls_acxfr_flg());
							r.setBooleanNE("acxfr_gi_flg", m.acxfr_gi_flg());
					}),
					j -> j
						.add(MAM_USR_R.class, r -> toCondition(
							r.getStringNE("rqst_usr_cd")
						))
						.addSelect(m -> toArray(
							m.usr_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("rqst_usr_nm", m.usr_nm());
					}),
					j -> j
						.add(MAM_USR_R.class, r -> toCondition(
							r.getStringNE("ship_usr_cd")
						))
						.addSelect(m -> toArray(
							m.usr_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("ship_usr_nm", m.usr_nm());
					}),
					j -> j
						.add(MAM_STR_LN_R.class, r -> toCondition(
							r.getStringNE("dlv_id_cd"),
							r.getStringNE("dlv_str_ln_cd")
						))
						.addSelect(m -> toArray(
							m.str_ln_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("dlv_str_ln_nm", m.str_ln_nm());
					}),
					j -> j
						.add(MAM_LOC_R.class, r -> toCondition(
							r.getStringNE("ship_schd_loc_cd")
						))
						.addSelect(m -> toArray(
							m.sppl_cd
						))
						.addMap((r, m) -> {
							r.setStringNE("ship_schd_loc_sppl_cd", m.sppl_cd());
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
	 * -- MSBEL1440_MST_SHIP_INST_Query_S01
	 */
	static MCQueryPlan MSBEL1440_MST_SHIP_INST_S01() {
		MST_SHIP_INST_R S0_T1 = MST_SHIP_INST_R.create("T1");
		MST_SHIP_INST_D_R S0_T2 = MST_SHIP_INST_D_R.create("T2");
		MST_SHIP_ALLOC_STS_R S0_T3 = MST_SHIP_ALLOC_STS_R.create("T3");
		MST_SHIP_SCHD_R S0_T4 = MST_SHIP_SCHD_R.create("T4");
		MST_SHIP_PR_R S0_T5 = MST_SHIP_PR_R.create("T5");
		MST_SLO_D_R S0_T7 = MST_SLO_D_R.create("T7");
		MCTempView S0_T11 = createTempView("T11");
		MAM_LG_GRP_R S0_M2 = MAM_LG_GRP_R.create("M2");
		MAM_ITM_R S0_M6 = MAM_ITM_R.create("M6");
		MAM_DPT_R S0_M19 = MAM_DPT_R.create("M19");
		MAM_SUNDRY_ITM_R S0_M20 = MAM_SUNDRY_ITM_R.create("M20");
		MSVM_DLV_ID_R S0_M22 = MSVM_DLV_ID_R.create("M22");
		MAM_ITM_LCL_R S0_M23 = MAM_ITM_LCL_R.create("M23");
		MSVM_SHIP_TO_ID_R S0_M25 = MSVM_SHIP_TO_ID_R.create("M25");
		MAM_LG_CTL_R S0_M27 = MAM_LG_CTL_R.create("M27");
		MAM_LG_CTL_R S0_M28 = MAM_LG_CTL_R.create("M28");
		MAVM_RD_LG_GRP_R S0_RD1 = MAVM_RD_LG_GRP_R.create("RD1");
		MAM_LOC_R S0_M29 = MAM_LOC_R.create("M29");
		MST_SHIP_INST_R S2_W0 = MST_SHIP_INST_R.create("W0");
		MST_IV_R S2_W1 = MST_IV_R.create("W1");
		MST_IV_D_R S2_W2 = MST_IV_D_R.create("W2");
		MST_IV_MAP_R S2_W3 = MST_IV_MAP_R.create("W3");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBEL1440_MST_SHIP_INST_Query_S01")
					.mainQuery()
					.select(
						S0_T1.ship_inst_no,
						S0_T2.ship_inst_d_no,
						S0_T1.iv_no,
						S0_T1.iv_no.as("dtl_iv_no"),
						S0_T11.pr(S2_W3.iv_d_no),
						S0_T3.disp_seq,
						S0_T3.ship_alloc_sts_no,
						S0_T4.ship_schd_no,
						S0_T5.ship_pr_no,
						S0_T5.slo_d_no,
						S0_T5.xfr_schd_no,
						S0_T4.pr_sts_typ,
						S0_T1.ship_schd_tm,
						S0_T1.dlv_schd_tm,
						S0_T1.ship_inst_tm,
						S0_T1.ship_to_id_typ,
						S0_T1.ship_to_id_cd,
						decode(
							S0_T1.ship_to_sundry_flg,
							value(true),
							S0_T1.ship_to_id_nm,
							S0_M25.ship_to_id_nm
						).as("ship_to_id_nm"),
						S0_M25.cntry_cd.as("ship_to_cntry_cd"),
						S0_M25.cntry_nm.as("ship_to_cntry_nm"),
						S0_T1.ship_to_zip_cd,
						S0_T1.ship_to_addr1,
						S0_T1.ship_to_addr2,
						S0_T1.ship_to_addr3,
						S0_T1.ship_to_addr4,
						S0_T1.ship_to_cntct_dpt,
						S0_T1.ship_to_cntct_psn,
						S0_T1.ship_to_tel,
						S0_T1.ship_to_fax,
						S0_T1.ship_to_sundry_flg,
						S0_T1.ship_to_lg_grp_cd,
						S0_T1.via_dlv_typ,
						S0_T1.ship_fr_lg_grp_cd,
						S0_M2.lg_grp_nm.as("ship_fr_lg_grp_nm"),
						S0_M2.ship_slip_act_flg.as("dlv_slip_prnt_flg"),
						S0_M2.ship_slip_act_flg.as("ship_adv_prnt_flg"),
						S0_T1.wg_cd,
						S0_T1.ship_term_cd,
						S0_T1.dlv_prnt_flg.as("inst_dlv_prnted_flg"),
						S0_T2.trd_cd,
						S0_T2.trd_ptn_typ,
						S0_T2.itm_cd,
						S0_T2.itm_sub1,
						S0_T2.itm_sub2,
						S0_T2.itm_sub3,
						decode(
							S0_T2.sundry_itm_flg,
							value(true),
							nvl(
								S0_T2.itm_nm,
								S0_M20.itm_nm
							),
							S0_M6.itm_nm
						).as("itm_nm"),
						decode(
							S0_T2.sundry_itm_flg,
							value(true),
							nvl(
								S0_T2.iv_itm_nm,
								S0_M20.itm_nm
							),
							nvl(
								S0_M23.itm_nm,
								S0_M6.itm_nm
							)
						).as("iv_itm_nm"),
						S0_M6.stk_mng_typ,
						S0_T2.sundry_itm_flg,
						S0_M6.dscnt_itm_flg,
						S0_T3.ent_unit_cd.as("trd_unit_cd"),
						S0_T3.ent_unit_qty.as("trd_unit_qty"),
						S0_T3.base_unit_cd,
						S0_T3.base_unit_qty,
						S0_T3.ship_act_qty.as("alloc_act_qty"),
						S0_M6.cont_fctr_flg,
						S0_M6.cont_fctr_unit_cd,
						S0_M6.std_cont_fctr,
						S0_M6.cont_fctr_dec_place,
						S0_M6.cont_fctr_rnd_typ,
						S0_T4.base_unit_qty.as("schd_qty"),
						S0_T4.ship_inst_qty.as("inst_qty"),
						S0_T4.ship_act_qty.as("ship_qty"),
						S0_T4.ship_ret_qty.as("ret_qty"),
						S0_T4.abort_flg,
						S0_T3.ship_loc_cd,
						S0_T3.ship_str_ln_cd,
						S0_M6.sno1_mng_typ,
						S0_M6.sno2_mng_typ,
						S0_M6.sno3_mng_typ,
						S0_M6.sno4_mng_typ,
						S0_T3.sno1,
						S0_T3.sno2,
						S0_T3.sno3,
						S0_T3.sno4,
						S0_T4.sno1.as("schd_sno1"),
						S0_T4.sno2.as("schd_sno2"),
						S0_T4.sno3.as("schd_sno3"),
						S0_T4.sno4.as("schd_sno4"),
						S0_T4.sno1_null_flg,
						S0_T4.sno2_null_flg,
						S0_T4.sno3_null_flg,
						S0_T4.sno4_null_flg,
						S0_M6.lot_mng_typ,
						S0_M6.sublot_mng_typ,
						S0_T3.lot_no,
						S0_T3.sublot_no,
						S0_M6.ver_flg,
						S0_T3.ver_no,
						S0_T4.not_lot_mix_flg,
						S0_T4.not_sublot_mix_flg,
						S0_T3.stk_arrv_bp_cd,
						S0_T3.gd_cd,
						S0_T3.quality_typ,
						S0_T3.stk_insp_typ,
						S0_T3.stk_id_typ,
						S0_T3.stk_bp_cd,
						S0_T7.cst_po_d_no,
						S0_T7.cst_itm_cd,
						S0_T7.cst_itm_nm,
						S0_T7.set_itm_grp_no,
						S0_T5.ship_inst_typ,
						S0_T5.cst_cd,
						S0_T5.dlv_id_typ,
						nvl(
							S0_T4.dlv_cd,
							S0_T5.dlv_id_cd
						).as("dlv_id_cd"),
						nvl2(
							S0_T4.dlv_cd,
							nvl(
								S0_T4.dlv_nm,
								S0_M22.dlv_id_nm
							),
							nvl(
								S0_T5.dlv_id_nm,
								S0_M22.dlv_id_nm
							)
						).as("dlv_id_nm"),
						S0_M22.cntry_cd.as("dlv_cntry_cd"),
						S0_M22.cntry_nm.as("dlv_cntry_nm"),
						nvl2(
							S0_T4.dlv_cd,
							S0_T4.dlv_zip_cd,
							S0_T5.dlv_zip_cd
						).as("dlv_zip_cd"),
						nvl2(
							S0_T4.dlv_cd,
							S0_T4.dlv_addr1,
							S0_T5.dlv_addr1
						).as("dlv_addr1"),
						nvl2(
							S0_T4.dlv_cd,
							S0_T4.dlv_addr2,
							S0_T5.dlv_addr2
						).as("dlv_addr2"),
						nvl2(
							S0_T4.dlv_cd,
							S0_T4.dlv_addr3,
							S0_T5.dlv_addr3
						).as("dlv_addr3"),
						nvl2(
							S0_T4.dlv_cd,
							S0_T4.dlv_addr4,
							S0_T5.dlv_addr4
						).as("dlv_addr4"),
						nvl2(
							S0_T4.dlv_cd,
							S0_T4.dlv_cntct_dpt,
							S0_T5.dlv_cntct_dpt
						).as("dlv_cntct_dpt"),
						nvl2(
							S0_T4.dlv_cd,
							S0_T4.dlv_cntct_psn,
							S0_T5.dlv_cntct_psn
						).as("dlv_cntct_psn"),
						nvl2(
							S0_T4.dlv_cd,
							S0_T4.dlv_tel,
							S0_T5.dlv_tel
						).as("dlv_tel"),
						nvl2(
							S0_T4.dlv_cd,
							S0_T4.dlv_fax,
							S0_T5.dlv_fax
						).as("dlv_fax"),
						nvl2(
							S0_T4.dlv_cd,
							S0_T4.dlv_sundry_flg,
							S0_T5.dlv_sundry_flg
						).as("dlv_sundry_flg"),
						nvl2(
							S0_T4.dlv_cd,
							S0_T4.pri_prnt_flg,
							S0_T7.pri_prnt_flg
						).as("pri_prnt_flg"),
						S0_T5.dlv_str_ln_cd,
						cases()
							.when(S0_T2.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.PROV_RTN.value())))
								.then(value(false))
							.otherwise(
								nvl(
									S0_M27.iv_trd_flg,
									S0_M28.iv_trd_flg
								)
							).as("iv_trd_flg"),
						S0_T5.loc_cd.as("ship_schd_loc_cd"),
						S0_T5.str_ln_cd.as("ship_schd_str_ln_cd"),
						S0_T2.rsn_cd,
						S0_T2.bd_dpt_cd,
						S0_M19.dpt_nm.as("bd_dpt_nm"),
						S0_M6.skip_chk_ship_flg,
						S0_T2.base_dlv_slip_no,
						S0_T2.base_prov_act_no,
						S0_T2.base_ac_dt,
						S0_T2.ship_cnt_rmrks,
						S0_T2.trd_rmrks,
						S0_T2.trd_d_rmrks,
						S0_T5.def_loc_cd,
						S0_M29.loc_nm.as("def_loc_nm"),
						S0_M29.str_ln_tgt_flg.as("def_str_ln_tgt_flg"),
						decode(
							S0_T1.ship_fr_lg_grp_cd,
							S0_M29.lg_grp_cd,
							S0_M2.ship_loc_prio_flg,
							value(false)
						).as("ship_loc_prio_flg"),
						S0_T3.alloc_scope_typ,
						nullValue().as("h_sub_char1"),
						nullValue().as("h_sub_char2"),
						nullValue().as("h_sub_char3"),
						nullValue().as("sub_char1"),
						nullValue().as("sub_char2"),
						nullValue().as("sub_char3"),
						S0_T1.ins_usr_id,
						S0_T1.ins_usr_nm,
						S0_T1.ins_func_id,
						nullValue().as("ins_func_nm"),
						S0_T1.ins_ts,
						S0_T1.upd_usr_id,
						S0_T1.upd_usr_nm,
						S0_T1.upd_func_id,
						nullValue().as("upd_func_nm"),
						S0_T1.upd_ts,
						S0_T5.upd_cntr,
						S0_T1.upd_srv_req_no,
						// this field is appended by sql coverter.
						S0_T7.slo_no.as("join_slo_no_"),
						// this field is appended by sql coverter.
						S0_T4.dlv_inst_rcpt_no.as("join_dlv_inst_rcpt_no_"),
						// this field is appended by sql coverter.
						S0_T5.dlv_id_cd.as("join_dlv_id_cd_"),
						value(0).as("base_unit_qty_bef")
					)
					.from(
						S0_T1
						.innerJoin(S0_T2).on(
							bracket(
								S0_T2.ship_inst_no.eq(S0_T1.ship_inst_no)
							)
						)
						.innerJoin(S0_T3).on(
							bracket(
								S0_T3.ship_inst_d_no.eq(S0_T2.ship_inst_d_no)
							)
						)
						.innerJoin(S0_T4).on(
							bracket(
								S0_T4.ship_inst_d_no.eq(S0_T2.ship_inst_d_no)
							)
						)
						.innerJoin(S0_T5).on(
							bracket(
								S0_T5.ship_pr_no.eq(S0_T4.ship_pr_no)
							)
						)
						.leftOuterJoin(S0_T7).on(
							bracket(
								S0_T7.slo_d_no.eq(S0_T5.slo_d_no)
							)
						)
						.leftOuterJoin(
							subQuery()
							.select(
								S2_W3.ship_schd_no,
								S2_W1.iv_no,
								S2_W3.iv_d_no,
								S2_W3.base_unit_qty
							)
							.from(
								S2_W0
								.innerJoin(S2_W1).on(
									bracket(
										S2_W1.iv_no.eq(S2_W0.iv_no)
									)
								)
								.innerJoin(S2_W2).on(
									bracket(
										S2_W2.iv_mng_no.eq(S2_W1.iv_mng_no)
									)
								)
								.innerJoin(S2_W3).on(
									bracket(
										S2_W3.iv_d_no.eq(S2_W2.iv_d_no)
									)
								)
							)
							.where(
								S2_W0.ship_inst_no.eq(bind("ship_inst_no"))
							).view(S0_T11)
						).on(
							bracket(
								S0_T11.pr(S2_W3.ship_schd_no).eq(S0_T4.ship_schd_no)
							)
						)
						.leftOuterJoin(S0_M2).on(
							bracket(
								S0_M2.lg_grp_cd.eq(S0_T1.ship_fr_lg_grp_cd)
							)
						)
						.leftOuterJoin(S0_M6).on(
							bracket(
								S0_M6.itm_cd.eq(S0_T2.itm_cd)
								.and(S0_M6.itm_sub1.eq(S0_T2.itm_sub1))
								.and(S0_M6.itm_sub2.eq(S0_T2.itm_sub2))
								.and(S0_M6.itm_sub3.eq(S0_T2.itm_sub3))
							)
						)
						.leftOuterJoin(S0_M19).on(
							bracket(
								S0_M19.dpt_cd.eq(S0_T2.bd_dpt_cd)
								.and(
									trunc(
										S0_T1.ship_inst_tm,
										MCDateFmt.DD
									).between(S0_M19.st_dt, S0_M19.end_dt)
								)
							)
						)
						.leftOuterJoin(S0_M20).on(
							bracket(
								S0_M20.itm_cd.eq(S0_T2.itm_cd)
								.and(S0_M20.itm_sub1.eq(S0_T2.itm_sub1))
								.and(S0_M20.itm_sub2.eq(S0_T2.itm_sub2))
								.and(S0_M20.itm_sub3.eq(S0_T2.itm_sub3))
								.and(S0_M20.sno1.eq(S0_T2.sno1))
								.and(S0_M20.sno2.eq(S0_T2.sno2))
								.and(S0_M20.sno3.eq(S0_T2.sno3))
								.and(S0_M20.sno4.eq(S0_T2.sno4))
							)
						)
						.leftOuterJoin(S0_M22).on(
							bracket(
								S0_M22.dlv_id_typ.eq(S0_T5.dlv_id_typ)
								.and(
									S0_M22.dlv_id_cd.eq(nvl(
											S0_T4.dlv_cd,
											S0_T5.dlv_id_cd
										)
									)
								)
							)
						)
						.leftOuterJoin(S0_M23).on(
							bracket(
								S0_M23.itm_cd.eq(S0_T2.itm_cd)
								.and(S0_M23.itm_sub1.eq(S0_T2.itm_sub1))
								.and(S0_M23.itm_sub2.eq(S0_T2.itm_sub2))
								.and(S0_M23.itm_sub3.eq(S0_T2.itm_sub3))
								.and(S0_M23.lcl_cd.eq(S0_M22.prnt_lcl_cd))
							)
						)
						.leftOuterJoin(S0_M25).on(
							bracket(
								S0_M25.ship_to_id_typ.eq(S0_T1.ship_to_id_typ)
								.and(S0_M25.ship_to_id_cd.eq(S0_T1.ship_to_id_cd))
							)
						)
						.leftOuterJoin(S0_M27).on(
							bracket(
								S0_M27.fr_lg_grp_cd.eq(S0_T1.ship_fr_lg_grp_cd)
								.and(S0_M27.to_lg_grp_cd.eq(S0_M22.lg_grp_cd))
								.and(S0_M27.ship_term_cd.eq(S0_T1.ship_term_cd))
							)
						)
						.leftOuterJoin(S0_M28).on(
							bracket(
								S0_M28.fr_lg_grp_cd.eq(S0_T1.ship_fr_lg_grp_cd)
								.and(S0_M28.to_lg_grp_cd.eq(S0_M22.lg_grp_cd))
								.and(S0_M28.ship_term_cd.eq(value(MAC_STR.NULL_VAL.value())))
							)
						)
						.innerJoin(S0_RD1).on(
							bracket(
								S0_RD1.lg_grp_cd.eq(S0_T1.ship_fr_lg_grp_cd)
							)
						)
						.leftOuterJoin(S0_M29).on(
							bracket(
								S0_M29.loc_cd.eq(S0_T5.def_loc_cd)
							)
						)
					)
					.where(
						S0_T1.ship_inst_no.eq(bind("ship_inst_no"))
						.and(S0_T2.abort_flg.eq(value(false)))
						.and(S0_T3.base_unit_qty.subtract(S0_T3.ship_act_qty).gt(value(0)))
						.and(
							S0_T4.cmpl_flg.eq(value(false))
							.or(S0_T11.pr(S2_W1.iv_no).isNull())
						)
					)
					.orderBy(S0_T3.disp_seq.asc())
			)
			.setJoinInfo(
				joinInfo(
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
							m.act_cont_fctr
						))
						.addMap((r, m) -> {
							r.setNumberNE("act_cont_fctr", m.act_cont_fctr());
					}),
					j -> j
						.add(MST_SLO_R.class, r -> toCondition(
							r.getStringNE("join_slo_no_")
						))
						.addSelect(m -> toArray(
							m.assort_typ,
							m.cst_po_no,
							m.slo_no
						))
						.addMap((r, m) -> {
							r.setStringNE("slo_no", m.slo_no());
							r.setStringNE("cst_po_no", m.cst_po_no());
							r.setStringNE("assort_typ", m.assort_typ());
					}),
					j -> j
						.add(MST_DLV_INST_RCPT_R.class, r -> toCondition(
							r.getStringNE("join_dlv_inst_rcpt_no_")
						))
						.addSelect(m -> toArray(
							m.cst_dlv_inst_d_no,
							m.cst_dlv_inst_no
						))
						.addMap((r, m) -> {
							r.setStringNE("cst_dlv_inst_no", m.cst_dlv_inst_no());
							r.setStringNE("cst_dlv_inst_d_no", m.cst_dlv_inst_d_no());
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
						.add(MAM_LG_GRP_R.class, r -> toCondition(
							r.getStringNE("ship_to_lg_grp_cd")
						))
						.addSelect(m -> toArray(
							m.lg_grp_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("ship_to_lg_grp_nm", m.lg_grp_nm());
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
						.add(MAM_SHIP_TERM_R.class, r -> toCondition(
							r.getStringNE("ship_term_cd")
						))
						.addSelect(m -> toArray(
							m.ship_term_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("ship_term_nm", m.ship_term_nm());
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
							m.rnd_typ,
							m.unit_dim,
							m.unit_wt
						))
						.addMap((r, m) -> {
							r.setNumberNE("trd_unit_conv_base_qty", m.conv_base_qty());
							r.setNumberNE("trd_unit_conv_qty", m.conv_qty());
							r.setNumberNE("trd_unit_dec_place", m.dec_place());
							r.setStringNE("trd_unit_rnd_typ", m.rnd_typ());
							r.setNumberNE("unit_wt", m.unit_wt());
							r.setNumberNE("unit_dim", m.unit_dim());
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
							r.getStringNE("ship_loc_cd")
						))
						.addSelect(m -> toArray(
							m.loc_nm,
							m.str_ln_tgt_flg
						))
						.addMap((r, m) -> {
							r.setStringNE("ship_loc_nm", m.loc_nm());
							r.setBooleanNE("ship_str_ln_tgt_flg", m.str_ln_tgt_flg());
					}),
					j -> j
						.add(MAM_STR_LN_R.class, r -> toCondition(
							r.getStringNE("ship_loc_cd"),
							r.getStringNE("ship_str_ln_cd")
						))
						.addSelect(m -> toArray(
							m.str_ln_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("ship_str_ln_nm", m.str_ln_nm());
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
							r.getStringNE("stk_arrv_bp_cd")
						))
						.addSelect(m -> toArray(
							m.bp_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("stk_arrv_bp_nm", m.bp_nm());
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
						.add(MAM_BIZ_RSN_R.class, r -> toCondition(
							r.getStringNE("rsn_cd")
						))
						.addSelect(m -> toArray(
							m.acxfr_gi_flg,
							m.biz_rsn_nm,
							m.sls_acxfr_flg
						))
						.addMap((r, m) -> {
							r.setStringNE("rsn_nm", m.biz_rsn_nm());
							r.setBooleanNE("sls_acxfr_flg", m.sls_acxfr_flg());
							r.setBooleanNE("acxfr_gi_flg", m.acxfr_gi_flg());
					}),
					j -> j
						.add(MAM_BP_R.class, r -> toCondition(
							r.getStringNE("cst_cd")
						))
						.addSelect(m -> toArray(
							m.bp_nm,
							m.cst_iv_flg
						))
						.addMap((r, m) -> {
							r.setStringNE("cst_nm", m.bp_nm());
							r.setBooleanNE("cst_iv_flg", m.cst_iv_flg());
					}),
					j -> j
						.add(MAM_STR_LN_R.class, r -> toCondition(
							r.getStringNE("join_dlv_id_cd_"),
							r.getStringNE("dlv_str_ln_cd")
						))
						.addSelect(m -> toArray(
							m.str_ln_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("dlv_str_ln_nm", m.str_ln_nm());
					}),
					j -> j
						.add(MAM_LOC_R.class, r -> toCondition(
							r.getStringNE("ship_schd_loc_cd")
						))
						.addSelect(m -> toArray(
							m.sppl_cd
						))
						.addMap((r, m) -> {
							r.setStringNE("ship_schd_loc_sppl_cd", m.sppl_cd());
					})
				)
			);
	}
	
	/**
	 * -- MSBEL1440_MST_SHIP_SCHD_Query_S01
	 */
	static MCQueryPlan MSBEL1440_MST_SHIP_SCHD_S01() {
		MSW_SHIP_SCHD_KEY_R S0_W1 = MSW_SHIP_SCHD_KEY_R.create("W1");
		MST_SHIP_ALLOC_STS_R S0_T3 = MST_SHIP_ALLOC_STS_R.create("T3");
		MST_SHIP_SCHD_R S0_T4 = MST_SHIP_SCHD_R.create("T4");
		MST_SHIP_PR_R S0_T5 = MST_SHIP_PR_R.create("T5");
		MST_SLO_D_R S0_T7 = MST_SLO_D_R.create("T7");
		MST_SLO_R S0_T8 = MST_SLO_R.create("T8");
		MAM_LG_GRP_R S0_M1 = MAM_LG_GRP_R.create("M1");
		MAM_LG_GRP_R S0_M2 = MAM_LG_GRP_R.create("M2");
		MAM_ITM_R S0_M6 = MAM_ITM_R.create("M6");
		MAM_DPT_R S0_M19 = MAM_DPT_R.create("M19");
		MAM_SUNDRY_ITM_R S0_M20 = MAM_SUNDRY_ITM_R.create("M20");
		MSVM_DLV_ID_R S0_M22 = MSVM_DLV_ID_R.create("M22");
		MAM_ITM_LCL_R S0_M23 = MAM_ITM_LCL_R.create("M23");
		MSVM_SHIP_TO_ID_R S0_M25 = MSVM_SHIP_TO_ID_R.create("M25");
		MAM_LG_CTL_R S0_M27 = MAM_LG_CTL_R.create("M27");
		MAM_LG_CTL_R S0_M28 = MAM_LG_CTL_R.create("M28");
		MAVM_RD_LG_GRP_R S0_RD1 = MAVM_RD_LG_GRP_R.create("RD1");
		MAM_LOC_R S0_M29 = MAM_LOC_R.create("M29");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBEL1440_MST_SHIP_SCHD_Query_S01")
					.mainQuery()
					.select(
						S0_T3.ship_alloc_sts_no,
						S0_T4.ship_schd_no,
						S0_T5.ship_pr_no,
						S0_T8.slo_no,
						S0_T5.slo_d_no,
						S0_T5.xfr_schd_no,
						S0_T4.pr_sts_typ,
						S0_T4.ship_schd_tm,
						S0_T4.dlv_schd_tm,
						nvl2(
							S0_T4.tdlv_cd,
							value(MSC_SHIP_TO_ID_TYP.TDLV.value()),
							S0_T5.ship_to_id_typ
						).as("ship_to_id_typ"),
						nvl(
							nvl(
								S0_T4.tdlv_cd,
								decode(
									S0_T5.ship_to_id_typ,
									value(MSC_SHIP_TO_ID_TYP.DLV.value()),
									S0_T4.dlv_cd,
									nullValue()
								)
							),
							S0_T5.ship_to_id_cd
						).as("ship_to_id_cd"),
						nvl2(
							S0_T4.tdlv_cd,
							nvl(
								S0_T4.tdlv_nm,
								S0_M25.ship_to_id_nm
							),
							decode(
								S0_T5.ship_to_id_typ,
								value(MSC_SHIP_TO_ID_TYP.DLV.value()),
								nvl2(
									S0_T4.dlv_cd,
									nvl(
										S0_T4.dlv_nm,
										S0_M25.ship_to_id_nm
									),
									nvl(
										S0_T5.ship_to_id_nm,
										S0_M25.ship_to_id_nm
									)
								),
								nvl(
									S0_T5.ship_to_id_nm,
									S0_M25.ship_to_id_nm
								)
							)
						).as("ship_to_id_nm"),
						S0_M25.cntry_cd.as("ship_to_cntry_cd"),
						S0_M25.cntry_nm.as("ship_to_cntry_nm"),
						nvl2(
							S0_T4.tdlv_cd,
							S0_T4.tdlv_zip_cd,
							decode(
								S0_T5.ship_to_id_typ,
								value(MSC_SHIP_TO_ID_TYP.DLV.value()),
								nvl2(
									S0_T4.dlv_cd,
									S0_T4.dlv_zip_cd,
									S0_T5.ship_to_zip_cd
								),
								S0_T5.ship_to_zip_cd
							)
						).as("ship_to_zip_cd"),
						nvl2(
							S0_T4.tdlv_cd,
							S0_T4.tdlv_addr1,
							decode(
								S0_T5.ship_to_id_typ,
								value(MSC_SHIP_TO_ID_TYP.DLV.value()),
								nvl2(
									S0_T4.dlv_cd,
									S0_T4.dlv_addr1,
									S0_T5.ship_to_addr1
								),
								S0_T5.ship_to_addr1
							)
						).as("ship_to_addr1"),
						nvl2(
							S0_T4.tdlv_cd,
							S0_T4.tdlv_addr2,
							decode(
								S0_T5.ship_to_id_typ,
								value(MSC_SHIP_TO_ID_TYP.DLV.value()),
								nvl2(
									S0_T4.dlv_cd,
									S0_T4.dlv_addr2,
									S0_T5.ship_to_addr2
								),
								S0_T5.ship_to_addr2
							)
						).as("ship_to_addr2"),
						nvl2(
							S0_T4.tdlv_cd,
							S0_T4.tdlv_addr3,
							decode(
								S0_T5.ship_to_id_typ,
								value(MSC_SHIP_TO_ID_TYP.DLV.value()),
								nvl2(
									S0_T4.dlv_cd,
									S0_T4.dlv_addr3,
									S0_T5.ship_to_addr3
								),
								S0_T5.ship_to_addr3
							)
						).as("ship_to_addr3"),
						nvl2(
							S0_T4.tdlv_cd,
							S0_T4.tdlv_addr4,
							decode(
								S0_T5.ship_to_id_typ,
								value(MSC_SHIP_TO_ID_TYP.DLV.value()),
								nvl2(
									S0_T4.dlv_cd,
									S0_T4.dlv_addr4,
									S0_T5.ship_to_addr4
								),
								S0_T5.ship_to_addr4
							)
						).as("ship_to_addr4"),
						nvl2(
							S0_T4.tdlv_cd,
							S0_T4.tdlv_cntct_dpt,
							decode(
								S0_T5.ship_to_id_typ,
								value(MSC_SHIP_TO_ID_TYP.DLV.value()),
								nvl2(
									S0_T4.dlv_cd,
									S0_T4.dlv_cntct_dpt,
									S0_T5.ship_to_cntct_dpt
								),
								S0_T5.ship_to_cntct_dpt
							)
						).as("ship_to_cntct_dpt"),
						nvl2(
							S0_T4.tdlv_cd,
							S0_T4.tdlv_cntct_psn,
							decode(
								S0_T5.ship_to_id_typ,
								value(MSC_SHIP_TO_ID_TYP.DLV.value()),
								nvl2(
									S0_T4.dlv_cd,
									S0_T4.dlv_cntct_psn,
									S0_T5.ship_to_cntct_psn
								),
								S0_T5.ship_to_cntct_psn
							)
						).as("ship_to_cntct_psn"),
						nvl2(
							S0_T4.tdlv_cd,
							S0_T4.tdlv_tel,
							decode(
								S0_T5.ship_to_id_typ,
								value(MSC_SHIP_TO_ID_TYP.DLV.value()),
								nvl2(
									S0_T4.dlv_cd,
									S0_T4.dlv_tel,
									S0_T5.ship_to_tel
								),
								S0_T5.ship_to_tel
							)
						).as("ship_to_tel"),
						nvl2(
							S0_T4.tdlv_cd,
							S0_T4.tdlv_fax,
							decode(
								S0_T5.ship_to_id_typ,
								value(MSC_SHIP_TO_ID_TYP.DLV.value()),
								nvl2(
									S0_T4.dlv_cd,
									S0_T4.dlv_fax,
									S0_T5.ship_to_fax
								),
								S0_T5.ship_to_fax
							)
						).as("ship_to_fax"),
						nvl2(
							S0_T4.tdlv_cd,
							S0_T4.tdlv_sundry_flg,
							decode(
								S0_T5.ship_to_id_typ,
								value(MSC_SHIP_TO_ID_TYP.DLV.value()),
								nvl2(
									S0_T4.dlv_cd,
									S0_T4.dlv_sundry_flg,
									S0_T5.ship_to_sundry_flg
								),
								S0_T5.ship_to_sundry_flg
							)
						).as("ship_to_sundry_flg"),
						nvl2(
							S0_T4.tdlv_cd,
							S0_T4.tdlv_lg_grp_cd,
							decode(
								S0_T5.ship_to_id_typ,
								value(MSC_SHIP_TO_ID_TYP.DLV.value()),
								nvl2(
									S0_T4.dlv_cd,
									S0_T4.dlv_lg_grp_cd,
									S0_T5.ship_to_lg_grp_cd
								),
								S0_T5.ship_to_lg_grp_cd
							)
						).as("ship_to_lg_grp_cd"),
						S0_M1.lg_grp_nm.as("ship_to_lg_grp_nm"),
						nvl(
							S0_T4.via_dlv_typ,
							S0_T5.via_dlv_typ
						).as("via_dlv_typ"),
						S0_T8.cst_cd,
						S0_T4.ship_fr_lg_grp_cd,
						S0_M2.lg_grp_nm.as("ship_fr_lg_grp_nm"),
						S0_M2.ship_slip_act_flg.as("dlv_slip_prnt_flg"),
						S0_M2.ship_slip_act_flg.as("ship_adv_prnt_flg"),
						S0_T4.wg_cd,
						S0_T4.ship_term_cd,
						S0_T5.trd_cd,
						S0_T5.trd_ptn_typ,
						S0_T4.itm_cd,
						S0_T4.itm_sub1,
						S0_T4.itm_sub2,
						S0_T4.itm_sub3,
						decode(
							S0_T4.sundry_itm_flg,
							value(true),
							nvl(
								S0_T4.itm_nm,
								S0_M20.itm_nm
							),
							S0_M6.itm_nm
						).as("itm_nm"),
						decode(
							S0_T4.sundry_itm_flg,
							value(true),
							nvl(
								S0_T4.iv_itm_nm,
								S0_M20.itm_nm
							),
							nvl(
								S0_M23.itm_nm,
								S0_M6.itm_nm
							)
						).as("iv_itm_nm"),
						S0_M6.stk_mng_typ,
						S0_T4.sundry_itm_flg,
						S0_M6.dscnt_itm_flg,
						S0_T3.ent_unit_cd.as("trd_unit_cd"),
						S0_T3.ent_unit_qty.as("trd_unit_qty"),
						S0_T3.base_unit_cd,
						S0_T3.base_unit_qty,
						S0_T3.ship_act_qty.as("alloc_act_qty"),
						S0_M6.cont_fctr_flg,
						S0_M6.cont_fctr_unit_cd,
						S0_M6.std_cont_fctr,
						S0_M6.cont_fctr_dec_place,
						S0_M6.cont_fctr_rnd_typ,
						S0_T4.base_unit_qty.as("schd_qty"),
						nullValue().as("inst_qty"),
						S0_T4.ship_act_qty.as("ship_qty"),
						S0_T4.ship_ret_qty.as("ret_qty"),
						S0_T4.abort_flg,
						S0_T3.ship_loc_cd,
						S0_T3.ship_str_ln_cd,
						S0_M6.sno1_mng_typ,
						S0_M6.sno2_mng_typ,
						S0_M6.sno3_mng_typ,
						S0_M6.sno4_mng_typ,
						S0_T3.sno1,
						S0_T3.sno2,
						S0_T3.sno3,
						S0_T3.sno4,
						S0_T4.sno1.as("schd_sno1"),
						S0_T4.sno2.as("schd_sno2"),
						S0_T4.sno3.as("schd_sno3"),
						S0_T4.sno4.as("schd_sno4"),
						S0_T4.sno1_null_flg,
						S0_T4.sno2_null_flg,
						S0_T4.sno3_null_flg,
						S0_T4.sno4_null_flg,
						S0_M6.lot_mng_typ,
						S0_M6.sublot_mng_typ,
						S0_T3.lot_no,
						S0_T3.sublot_no,
						S0_M6.ver_flg,
						S0_T3.ver_no,
						S0_T4.not_lot_mix_flg,
						S0_T4.not_sublot_mix_flg,
						S0_T3.stk_arrv_bp_cd,
						S0_T3.gd_cd,
						S0_T3.quality_typ,
						S0_T3.stk_insp_typ,
						S0_T3.stk_id_typ,
						S0_T3.stk_bp_cd,
						S0_T8.cst_po_no,
						S0_T7.cst_po_d_no,
						S0_T7.cst_itm_cd,
						S0_T7.cst_itm_nm,
						S0_T8.assort_typ,
						S0_T7.set_itm_grp_no,
						S0_T5.ship_inst_typ,
						S0_T5.dlv_id_typ,
						nvl(
							S0_T4.dlv_cd,
							S0_T5.dlv_id_cd
						).as("dlv_id_cd"),
						nvl2(
							S0_T4.dlv_cd,
							nvl(
								S0_T4.dlv_nm,
								S0_M22.dlv_id_nm
							),
							nvl(
								S0_T5.dlv_id_nm,
								S0_M22.dlv_id_nm
							)
						).as("dlv_id_nm"),
						S0_M22.cntry_cd.as("dlv_cntry_cd"),
						S0_M22.cntry_nm.as("dlv_cntry_nm"),
						nvl2(
							S0_T4.dlv_cd,
							S0_T4.dlv_zip_cd,
							S0_T5.dlv_zip_cd
						).as("dlv_zip_cd"),
						nvl2(
							S0_T4.dlv_cd,
							S0_T4.dlv_addr1,
							S0_T5.dlv_addr1
						).as("dlv_addr1"),
						nvl2(
							S0_T4.dlv_cd,
							S0_T4.dlv_addr2,
							S0_T5.dlv_addr2
						).as("dlv_addr2"),
						nvl2(
							S0_T4.dlv_cd,
							S0_T4.dlv_addr3,
							S0_T5.dlv_addr3
						).as("dlv_addr3"),
						nvl2(
							S0_T4.dlv_cd,
							S0_T4.dlv_addr4,
							S0_T5.dlv_addr4
						).as("dlv_addr4"),
						nvl2(
							S0_T4.dlv_cd,
							S0_T4.dlv_cntct_dpt,
							S0_T5.dlv_cntct_dpt
						).as("dlv_cntct_dpt"),
						nvl2(
							S0_T4.dlv_cd,
							S0_T4.dlv_cntct_psn,
							S0_T5.dlv_cntct_psn
						).as("dlv_cntct_psn"),
						nvl2(
							S0_T4.dlv_cd,
							S0_T4.dlv_tel,
							S0_T5.dlv_tel
						).as("dlv_tel"),
						nvl2(
							S0_T4.dlv_cd,
							S0_T4.dlv_fax,
							S0_T5.dlv_fax
						).as("dlv_fax"),
						nvl2(
							S0_T4.dlv_cd,
							S0_T4.dlv_sundry_flg,
							S0_T5.dlv_sundry_flg
						).as("dlv_sundry_flg"),
						nvl2(
							S0_T4.dlv_cd,
							S0_T4.pri_prnt_flg,
							S0_T7.pri_prnt_flg
						).as("pri_prnt_flg"),
						S0_T5.dlv_str_ln_cd,
						cases()
							.when(S0_T5.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.PROV_RTN.value())))
								.then(value(false))
							.otherwise(
								nvl(
									S0_M27.iv_trd_flg,
									S0_M28.iv_trd_flg
								)
							).as("iv_trd_flg"),
						S0_T5.loc_cd.as("ship_schd_loc_cd"),
						S0_T5.str_ln_cd.as("ship_schd_str_ln_cd"),
						S0_T5.rsn_cd,
						S0_T5.bd_dpt_cd,
						S0_M19.dpt_nm.as("bd_dpt_nm"),
						S0_M6.skip_chk_ship_flg,
						S0_T4.base_dlv_slip_no,
						S0_T4.base_prov_act_no,
						S0_T4.base_ac_dt,
						S0_T4.ship_cnt_rmrks,
						S0_T4.trd_rmrks,
						S0_T4.trd_d_rmrks,
						S0_T5.def_loc_cd,
						S0_M29.loc_nm.as("def_loc_nm"),
						S0_M29.str_ln_tgt_flg.as("def_str_ln_tgt_flg"),
						decode(
							S0_T4.ship_fr_lg_grp_cd,
							S0_M29.lg_grp_cd,
							S0_M2.ship_loc_prio_flg,
							value(false)
						).as("ship_loc_prio_flg"),
						S0_T3.alloc_scope_typ,
						nullValue().as("h_sub_char1"),
						nullValue().as("h_sub_char2"),
						nullValue().as("h_sub_char3"),
						nullValue().as("sub_char1"),
						nullValue().as("sub_char2"),
						nullValue().as("sub_char3"),
						S0_T5.upd_cntr,
						// this field is appended by sql coverter.
						S0_T4.dlv_inst_rcpt_no.as("join_dlv_inst_rcpt_no_"),
						// this field is appended by sql coverter.
						S0_T5.dlv_id_cd.as("join_dlv_id_cd_"),
						value(0).as("base_unit_qty_bef")
					)
					.from(
						S0_W1
						.innerJoin(S0_T3).on(
							bracket(
								S0_T3.ship_schd_no.eq(S0_W1.ship_schd_no)
							)
						)
						.innerJoin(S0_T4).on(
							bracket(
								S0_T4.ship_schd_no.eq(S0_T3.ship_schd_no)
							)
						)
						.innerJoin(S0_T5).on(
							bracket(
								S0_T5.ship_pr_no.eq(S0_T4.ship_pr_no)
							)
						)
						.leftOuterJoin(S0_T7).on(
							bracket(
								S0_T7.slo_d_no.eq(S0_T5.slo_d_no)
							)
						)
						.leftOuterJoin(S0_T8).on(
							bracket(
								S0_T8.slo_no.eq(S0_T7.slo_no)
							)
						)
						.leftOuterJoin(S0_M1).on(
							bracket(
								S0_M1.lg_grp_cd.eq(nvl2(
										S0_T4.tdlv_cd,
										S0_T4.tdlv_lg_grp_cd,
										decode(
											S0_T5.ship_to_id_typ,
											value(MSC_SHIP_TO_ID_TYP.DLV.value()),
											nvl2(
												S0_T4.dlv_cd,
												S0_T4.dlv_lg_grp_cd,
												S0_T5.ship_to_lg_grp_cd
											),
											S0_T5.ship_to_lg_grp_cd
										)
									)
								)
							)
						)
						.leftOuterJoin(S0_M2).on(
							bracket(
								S0_M2.lg_grp_cd.eq(S0_T4.ship_fr_lg_grp_cd)
							)
						)
						.leftOuterJoin(S0_M6).on(
							bracket(
								S0_M6.itm_cd.eq(S0_T4.itm_cd)
								.and(S0_M6.itm_sub1.eq(S0_T4.itm_sub1))
								.and(S0_M6.itm_sub2.eq(S0_T4.itm_sub2))
								.and(S0_M6.itm_sub3.eq(S0_T4.itm_sub3))
							)
						)
						.leftOuterJoin(S0_M19).on(
							bracket(
								S0_M19.dpt_cd.eq(S0_T5.bd_dpt_cd)
								.and(bind("today").between(S0_M19.st_dt, S0_M19.end_dt))
							)
						)
						.leftOuterJoin(S0_M20).on(
							bracket(
								S0_M20.itm_cd.eq(S0_T4.itm_cd)
								.and(S0_M20.itm_sub1.eq(S0_T4.itm_sub1))
								.and(S0_M20.itm_sub2.eq(S0_T4.itm_sub2))
								.and(S0_M20.itm_sub3.eq(S0_T4.itm_sub3))
								.and(S0_M20.sno1.eq(S0_T4.sno1))
								.and(S0_M20.sno2.eq(S0_T4.sno2))
								.and(S0_M20.sno3.eq(S0_T4.sno3))
								.and(S0_M20.sno4.eq(S0_T4.sno4))
							)
						)
						.leftOuterJoin(S0_M22).on(
							bracket(
								S0_M22.dlv_id_typ.eq(S0_T5.dlv_id_typ)
								.and(
									S0_M22.dlv_id_cd.eq(nvl(
											S0_T4.dlv_cd,
											S0_T5.dlv_id_cd
										)
									)
								)
							)
						)
						.leftOuterJoin(S0_M23).on(
							bracket(
								S0_M23.itm_cd.eq(S0_T4.itm_cd)
								.and(S0_M23.itm_sub1.eq(S0_T4.itm_sub1))
								.and(S0_M23.itm_sub2.eq(S0_T4.itm_sub2))
								.and(S0_M23.itm_sub3.eq(S0_T4.itm_sub3))
								.and(S0_M23.lcl_cd.eq(S0_M22.prnt_lcl_cd))
							)
						)
						.leftOuterJoin(S0_M25).on(
							bracket(
								S0_M25.ship_to_id_typ.eq(nvl2(
										S0_T4.tdlv_cd,
										value(MSC_SHIP_TO_ID_TYP.TDLV.value()),
										S0_T5.ship_to_id_typ
									)
								)
								.and(
									S0_M25.ship_to_id_cd.eq(nvl(
											nvl(
												S0_T4.tdlv_cd,
												decode(
													S0_T5.ship_to_id_typ,
													value(MSC_SHIP_TO_ID_TYP.DLV.value()),
													S0_T4.dlv_cd,
													nullValue()
												)
											),
											S0_T5.ship_to_id_cd
										)
									)
								)
							)
						)
						.leftOuterJoin(S0_M27).on(
							bracket(
								S0_M27.fr_lg_grp_cd.eq(S0_T4.ship_fr_lg_grp_cd)
								.and(S0_M27.to_lg_grp_cd.eq(S0_M22.lg_grp_cd))
								.and(S0_M27.ship_term_cd.eq(S0_T4.ship_term_cd))
							)
						)
						.leftOuterJoin(S0_M28).on(
							bracket(
								S0_M28.fr_lg_grp_cd.eq(S0_T4.ship_fr_lg_grp_cd)
								.and(S0_M28.to_lg_grp_cd.eq(S0_M22.lg_grp_cd))
								.and(S0_M28.ship_term_cd.eq(value(MAC_STR.NULL_VAL.value())))
							)
						)
						.innerJoin(S0_RD1).on(
							bracket(
								S0_RD1.lg_grp_cd.eq(S0_T4.ship_fr_lg_grp_cd)
							)
						)
						.leftOuterJoin(S0_M29).on(
							bracket(
								S0_M29.loc_cd.eq(S0_T5.def_loc_cd)
							)
						)
					)
					.where(
						S0_T5.ship_inst_typ.eq(value(MAC_SHIP_INST_TYP.NON.value()))
						.and(S0_T4.abort_flg.eq(value(false)))
						.and(S0_T3.base_unit_qty.subtract(S0_T3.ship_act_qty).gt(value(0)))
					)
					.orderBy(
						S0_T8.slo_no.asc(),
						S0_T7.disp_seq.asc(),
						S0_T4.ship_schd_no.asc(),
						S0_T3.ship_alloc_sts_no.asc()
					)
			)
			.setJoinInfo(
				joinInfo(
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
							m.act_cont_fctr
						))
						.addMap((r, m) -> {
							r.setNumberNE("act_cont_fctr", m.act_cont_fctr());
					}),
					j -> j
						.add(MST_DLV_INST_RCPT_R.class, r -> toCondition(
							r.getStringNE("join_dlv_inst_rcpt_no_")
						))
						.addSelect(m -> toArray(
							m.cst_dlv_inst_d_no,
							m.cst_dlv_inst_no
						))
						.addMap((r, m) -> {
							r.setStringNE("cst_dlv_inst_no", m.cst_dlv_inst_no());
							r.setStringNE("cst_dlv_inst_d_no", m.cst_dlv_inst_d_no());
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
						.add(MAM_SHIP_TERM_R.class, r -> toCondition(
							r.getStringNE("ship_term_cd")
						))
						.addSelect(m -> toArray(
							m.ship_term_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("ship_term_nm", m.ship_term_nm());
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
							m.rnd_typ,
							m.unit_dim,
							m.unit_wt
						))
						.addMap((r, m) -> {
							r.setNumberNE("trd_unit_conv_base_qty", m.conv_base_qty());
							r.setNumberNE("trd_unit_conv_qty", m.conv_qty());
							r.setNumberNE("trd_unit_dec_place", m.dec_place());
							r.setStringNE("trd_unit_rnd_typ", m.rnd_typ());
							r.setNumberNE("unit_wt", m.unit_wt());
							r.setNumberNE("unit_dim", m.unit_dim());
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
							r.getStringNE("ship_loc_cd")
						))
						.addSelect(m -> toArray(
							m.loc_nm,
							m.str_ln_tgt_flg
						))
						.addMap((r, m) -> {
							r.setStringNE("ship_loc_nm", m.loc_nm());
							r.setBooleanNE("ship_str_ln_tgt_flg", m.str_ln_tgt_flg());
					}),
					j -> j
						.add(MAM_STR_LN_R.class, r -> toCondition(
							r.getStringNE("ship_loc_cd"),
							r.getStringNE("ship_str_ln_cd")
						))
						.addSelect(m -> toArray(
							m.str_ln_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("ship_str_ln_nm", m.str_ln_nm());
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
							r.getStringNE("stk_arrv_bp_cd")
						))
						.addSelect(m -> toArray(
							m.bp_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("stk_arrv_bp_nm", m.bp_nm());
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
						.add(MAM_BIZ_RSN_R.class, r -> toCondition(
							r.getStringNE("rsn_cd")
						))
						.addSelect(m -> toArray(
							m.acxfr_gi_flg,
							m.biz_rsn_nm,
							m.sls_acxfr_flg
						))
						.addMap((r, m) -> {
							r.setStringNE("rsn_nm", m.biz_rsn_nm());
							r.setBooleanNE("sls_acxfr_flg", m.sls_acxfr_flg());
							r.setBooleanNE("acxfr_gi_flg", m.acxfr_gi_flg());
					}),
					j -> j
						.add(MAM_BP_R.class, r -> toCondition(
							r.getStringNE("cst_cd")
						))
						.addSelect(m -> toArray(
							m.bp_nm,
							m.cst_iv_flg
						))
						.addMap((r, m) -> {
							r.setStringNE("cst_nm", m.bp_nm());
							r.setBooleanNE("cst_iv_flg", m.cst_iv_flg());
					}),
					j -> j
						.add(MAM_STR_LN_R.class, r -> toCondition(
							r.getStringNE("join_dlv_id_cd_"),
							r.getStringNE("dlv_str_ln_cd")
						))
						.addSelect(m -> toArray(
							m.str_ln_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("dlv_str_ln_nm", m.str_ln_nm());
					}),
					j -> j
						.add(MAM_LOC_R.class, r -> toCondition(
							r.getStringNE("ship_schd_loc_cd")
						))
						.addSelect(m -> toArray(
							m.sppl_cd
						))
						.addMap((r, m) -> {
							r.setStringNE("ship_schd_loc_sppl_cd", m.sppl_cd());
					})
				)
			);
	}
}