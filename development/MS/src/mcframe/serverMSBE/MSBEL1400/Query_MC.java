package mcframe.serverMSBE.MSBEL1400;

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
	 * -- MSBEL1400_MST_IV_Query_S01
	 */
	static MCQueryPlan MSBEL1400_MST_IV_S01() {
		MST_IV_R S0_T01 = MST_IV_R.create("T01");
		MST_IV_D_R S0_T02 = MST_IV_D_R.create("T02");
		MST_IV_MAP_R S0_T99 = MST_IV_MAP_R.create("T99");
		MST_SHIP_SCHD_R S0_T04 = MST_SHIP_SCHD_R.create("T04");
		MST_SHIP_ALLOC_STS_R S0_T03 = MST_SHIP_ALLOC_STS_R.create("T03");
		MST_SHIP_PR_R S0_T05 = MST_SHIP_PR_R.create("T05");
		MST_SLO_D_R S0_T07 = MST_SLO_D_R.create("T07");
		MAM_BP_R S0_M01 = MAM_BP_R.create("M01");
		MAM_LG_GRP_R S0_M02 = MAM_LG_GRP_R.create("M02");
		MAM_LG_GRP_R S0_M03 = MAM_LG_GRP_R.create("M03");
		MAM_ITM_R S0_M06 = MAM_ITM_R.create("M06");
		MAM_DPT_R S0_M19 = MAM_DPT_R.create("M19");
		MAM_SUNDRY_ITM_R S0_M20 = MAM_SUNDRY_ITM_R.create("M20");
		MSVM_DLV_ID_R S0_M21 = MSVM_DLV_ID_R.create("M21");
		MAM_ITM_LCL_R S0_M22 = MAM_ITM_LCL_R.create("M22");
		MAM_LG_CTL_R S0_M29 = MAM_LG_CTL_R.create("M29");
		MAM_LG_CTL_R S0_M30 = MAM_LG_CTL_R.create("M30");
		MAM_LOC_R S0_M32 = MAM_LOC_R.create("M32");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBEL1400_MST_IV_Query_S01")
					.mainQuery()
					.select(
						S0_T01.iv_no,
						S0_T02.iv_d_no,
						S0_T02.disp_seq,
						S0_T03.ship_alloc_sts_no,
						S0_T04.ship_schd_no,
						S0_T05.ship_pr_no,
						S0_T05.slo_d_no,
						S0_T05.xfr_schd_no,
						S0_T04.pr_sts_typ,
						trunc(
							S0_T04.ship_schd_tm,
							MCDateFmt.DD
						).as("ship_schd_dt"),
						S0_T04.ship_schd_tm.as("ship_schd_hm"),
						trunc(
							S0_T04.dlv_schd_tm,
							MCDateFmt.DD
						).as("dlv_schd_dt"),
						S0_T04.dlv_schd_tm.as("dlv_schd_hm"),
						S0_T01.trd_schd_dt,
						nvl2(
							S0_T01.tdlv_cd,
							value(MSC_SHIP_TO_ID_TYP.TDLV.value()),
							S0_T01.dlv_id_typ
						).as("ship_to_id_typ"),
						coalesce(
							S0_T01.tdlv_cd,
							S0_T01.dlv_id_cd
						).as("ship_to_id_cd"),
						nvl2(
							S0_T01.tdlv_cd,
							decode(
								S0_T01.tdlv_sundry_flg,
								value(true),
								S0_T01.tdlv_nm,
								S0_M01.bp_nm
							),
							decode(
								S0_T01.dlv_sundry_flg,
								value(true),
								S0_T01.dlv_id_nm,
								S0_M21.dlv_id_nm
							)
						).as("ship_to_id_nm"),
						nvl2(
							S0_T01.tdlv_cd,
							S0_T01.tdlv_zip_cd,
							S0_T01.dlv_zip_cd
						).as("ship_to_zip_cd"),
						nvl2(
							S0_T01.tdlv_cd,
							S0_T01.tdlv_addr1,
							S0_T01.dlv_addr1
						).as("ship_to_addr1"),
						nvl2(
							S0_T01.tdlv_cd,
							S0_T01.tdlv_addr2,
							S0_T01.dlv_addr2
						).as("ship_to_addr2"),
						nvl2(
							S0_T01.tdlv_cd,
							S0_T01.tdlv_addr3,
							S0_T01.dlv_addr3
						).as("ship_to_addr3"),
						nvl2(
							S0_T01.tdlv_cd,
							S0_T01.tdlv_addr4,
							S0_T01.dlv_addr4
						).as("ship_to_addr4"),
						nvl2(
							S0_T01.tdlv_cd,
							S0_T01.tdlv_cntct_dpt,
							S0_T01.dlv_cntct_dpt
						).as("ship_to_cntct_dpt"),
						nvl2(
							S0_T01.tdlv_cd,
							S0_T01.tdlv_cntct_psn,
							S0_T01.dlv_cntct_psn
						).as("ship_to_cntct_psn"),
						nvl2(
							S0_T01.tdlv_cd,
							S0_T01.tdlv_tel,
							S0_T01.dlv_tel
						).as("ship_to_tel"),
						nvl2(
							S0_T01.tdlv_cd,
							S0_T01.tdlv_fax,
							S0_T01.dlv_fax
						).as("ship_to_fax"),
						nvl2(
							S0_T01.tdlv_cd,
							S0_T01.tdlv_sundry_flg,
							S0_T01.dlv_sundry_flg
						).as("ship_to_sundry_flg"),
						nvl2(
							S0_T01.tdlv_cd,
							S0_T01.tdlv_lg_grp_cd,
							nvl2(
								S0_T04.dlv_cd,
								S0_T04.dlv_lg_grp_cd,
								S0_T05.ship_to_lg_grp_cd
							)
						).as("ship_to_lg_grp_cd"),
						S0_M02.lg_grp_nm.as("ship_to_lg_grp_nm"),
						S0_T01.via_dlv_typ,
						S0_T04.ship_fr_lg_grp_cd,
						S0_M03.lg_grp_nm.as("ship_fr_lg_grp_nm"),
						S0_M02.wg_cd,
						nullValue().as("ship_term_cd"),
						nullValue().as("ship_term_nm"),
						nullValue().as("ship_inst_prnt_flg"),
						S0_T02.trd_cd,
						S0_T01.trd_ptn_typ,
						S0_T02.itm_cd,
						S0_T02.itm_sub1,
						S0_T02.itm_sub2,
						S0_T02.itm_sub3,
						decode(
							S0_T02.sundry_itm_flg,
							value(true),
							nvl(
								S0_T02.itm_nm,
								S0_M20.itm_nm
							),
							S0_M06.itm_nm
						).as("itm_nm"),
						S0_T07.cst_itm_cd,
						S0_T07.cst_itm_nm,
						decode(
							S0_T02.sundry_itm_flg,
							value(true),
							nvl(
								S0_T02.iv_itm_nm,
								S0_M20.itm_nm
							),
							nvl(
								S0_M22.itm_nm,
								S0_M06.itm_nm
							)
						).as("iv_itm_nm"),
						S0_M06.stk_mng_typ,
						S0_T02.sundry_itm_flg,
						S0_M06.dscnt_itm_flg,
						S0_M06.stk_mng_typ,
						S0_T03.ent_unit_cd,
						S0_T03.ent_unit_qty,
						S0_T03.base_unit_cd,
						S0_M06.pckg_unit_cd,
						value(MAC_RND_TYP.RNDUP.value()).as("pckg_unit_rnd_typ"),
						S0_T04.trd_unit_cd.as("schd_unit_cd"),
						S0_T04.trd_unit_qty.as("schd_unit_qty"),
						S0_T03.base_unit_qty,
						S0_T04.ship_act_qty.as("alloc_act_qty"),
						S0_M06.cont_fctr_unit_cd,
						S0_M06.cont_fctr_flg,
						S0_M06.std_cont_fctr,
						S0_T04.trd_unit_qty.as("schd_qty"),
						nullValue().as("inst_qty"),
						nullValue().as("ship_qty"),
						S0_T04.iv_schd_qty,
						S0_T04.iv_act_qty,
						S0_T04.abort_flg,
						S0_T03.ship_loc_cd,
						S0_T03.ship_str_ln_cd,
						S0_M06.sno1_mng_typ,
						S0_M06.sno2_mng_typ,
						S0_M06.sno3_mng_typ,
						S0_M06.sno4_mng_typ,
						S0_T03.sno1.as("alloc_sno1"),
						S0_T03.sno2.as("alloc_sno2"),
						S0_T03.sno3.as("alloc_sno3"),
						S0_T03.sno4.as("alloc_sno4"),
						S0_T04.sno1,
						S0_T04.sno2,
						S0_T04.sno3,
						S0_T04.sno4,
						S0_T04.sno1_null_flg,
						S0_T04.sno2_null_flg,
						S0_T04.sno3_null_flg,
						S0_T04.sno4_null_flg,
						S0_M06.lot_mng_typ,
						S0_M06.sublot_mng_typ,
						S0_T03.lot_no,
						S0_T03.sublot_no,
						S0_M06.ver_flg,
						S0_T04.ver_no,
						S0_T03.ver_no.as("alloc_ver_no"),
						S0_T03.alloc_flg,
						S0_T03.stk_arrv_bp_cd,
						S0_T03.gd_cd,
						S0_T03.quality_typ,
						S0_T03.stk_insp_typ,
						S0_T03.stk_id_typ,
						S0_T03.stk_bp_cd,
						S0_T05.cst_cd,
						S0_T07.cst_po_d_no,
						S0_T07.cst_itm_cd,
						S0_T07.cst_itm_nm,
						S0_T07.set_itm_grp_no,
						S0_T05.ship_inst_typ,
						S0_T01.dlv_id_typ,
						S0_T01.dlv_id_cd,
						nvl(
							S0_T01.dlv_id_nm,
							S0_M21.dlv_id_nm
						).as("dlv_id_nm"),
						S0_T01.dlv_zip_cd,
						S0_T01.dlv_addr1,
						S0_T01.dlv_addr2,
						S0_T01.dlv_addr3,
						S0_T01.dlv_addr4,
						S0_T01.dlv_cntct_dpt,
						S0_T01.dlv_cntct_psn,
						S0_T01.dlv_tel,
						S0_T01.dlv_fax,
						S0_T01.dlv_sundry_flg,
						S0_T05.dlv_str_ln_cd,
						nvl2(
							S0_T04.dlv_cd,
							S0_T04.pri_prnt_flg,
							S0_T07.pri_prnt_flg
						).as("pri_prnt_flg"),
						S0_T05.alloc_grp_cd,
						decode(
							S0_T04.ship_fr_lg_grp_cd,
							S0_M32.lg_grp_cd,
							S0_T05.def_loc_cd,
							nullValue()
						).as("def_loc_cd"),
						decode(
							S0_T04.ship_fr_lg_grp_cd,
							S0_M32.lg_grp_cd,
							S0_M32.loc_nm,
							nullValue()
						).as("def_loc_nm"),
						decode(
							S0_T04.ship_fr_lg_grp_cd,
							S0_M32.lg_grp_cd,
							S0_M03.ship_loc_prio_flg,
							value(false)
						).as("ship_loc_prio_flg"),
						S0_T02.rsn_cd,
						S0_M21.lg_grp_cd.as("dlv_lg_grp_cd"),
						S0_T02.bd_dpt_cd,
						S0_M19.dpt_nm.as("bd_dpt_nm"),
						S0_T03.alloc_scope_typ,
						S0_T03.not_lot_mix_flg,
						S0_T03.not_sublot_mix_flg,
						cases()
							.when(S0_T01.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.PROV_RTN.value())))
								.then(value(false))
							.otherwise(
								nvl(
									S0_M29.iv_trd_flg,
									S0_M30.iv_trd_flg
								)
							).as("iv_trd_flg"),
						S0_M06.skip_chk_ship_flg,
						S0_T05.loc_cd.as("ship_schd_loc_cd"),
						S0_T04.ship_cnt_rmrks.as("ship_cnt_rmrks"),
						S0_T04.trd_rmrks.as("trd_rmrks"),
						S0_T04.trd_d_rmrks.as("trd_d_rmrks"),
						S0_T01.sub_char1.as("h_sub_char1"),
						S0_T01.sub_char2.as("h_sub_char2"),
						S0_T01.sub_char3.as("h_sub_char3"),
						S0_T02.sub_char1,
						S0_T02.sub_char2,
						S0_T02.sub_char3,
						S0_T01.ins_usr_id,
						S0_T01.ins_usr_nm,
						S0_T01.ins_func_id,
						nullValue().as("ins_func_nm"),
						S0_T01.ins_ts,
						S0_T01.upd_usr_id,
						S0_T01.upd_usr_nm,
						S0_T01.upd_func_id,
						nullValue().as("upd_func_nm"),
						S0_T01.upd_ts,
						S0_T04.upd_cntr.as("ship_schd_upd_cntr"),
						S0_T05.upd_cntr.as("ship_pr_upd_cntr"),
						// this field is appended by sql coverter.
						S0_T07.slo_no.as("join_slo_no_"),
						// this field is appended by sql coverter.
						S0_T04.dlv_inst_rcpt_no.as("join_dlv_inst_rcpt_no_"),
						// this field is appended by sql coverter.
						S0_T05.dlv_id_cd.as("join_dlv_id_cd_")
					)
					.from(
						S0_T01
						.innerJoin(S0_T02).on(
							bracket(
								S0_T02.iv_mng_no.eq(S0_T01.iv_mng_no)
							)
						)
						.innerJoin(S0_T99).on(
							bracket(
								S0_T99.iv_d_no.eq(S0_T02.iv_d_no)
							)
						)
						.innerJoin(S0_T04).on(
							bracket(
								S0_T04.ship_schd_no.eq(S0_T99.ship_schd_no)
							)
						)
						.innerJoin(S0_T03).on(
							bracket(
								S0_T03.ship_schd_no.eq(S0_T04.ship_schd_no)
							)
						)
						.innerJoin(S0_T05).on(
							bracket(
								S0_T05.ship_pr_no.eq(S0_T04.ship_pr_no)
							)
						)
						.leftOuterJoin(S0_T07).on(
							bracket(
								S0_T07.slo_d_no.eq(S0_T05.slo_d_no)
							)
						)
						.leftOuterJoin(S0_M01).on(
							bracket(
								S0_M01.bp_cd.eq(S0_T01.tdlv_cd)
							)
						)
						.leftOuterJoin(S0_M02).on(
							bracket(
								S0_M02.lg_grp_cd.eq(nvl2(
										S0_T01.tdlv_cd,
										S0_T01.tdlv_lg_grp_cd,
										nvl2(
											S0_T04.dlv_cd,
											S0_T04.dlv_lg_grp_cd,
											S0_T05.ship_to_lg_grp_cd
										)
									)
								)
							)
						)
						.leftOuterJoin(S0_M03).on(
							bracket(
								S0_M03.lg_grp_cd.eq(S0_T04.ship_fr_lg_grp_cd)
							)
						)
						.leftOuterJoin(S0_M06).on(
							bracket(
								S0_M06.itm_cd.eq(S0_T02.itm_cd)
								.and(S0_M06.itm_sub1.eq(S0_T02.itm_sub1))
								.and(S0_M06.itm_sub2.eq(S0_T02.itm_sub2))
								.and(S0_M06.itm_sub3.eq(S0_T02.itm_sub3))
							)
						)
						.leftOuterJoin(S0_M19).on(
							bracket(
								S0_M19.dpt_cd.eq(S0_T02.bd_dpt_cd)
								.and(FCPA_DATE_UTIL$F_MCSYSDATE_CO(value(mcframe.serverMAUC.MAUCL0020.MAUCL_AppSys.getCo().co_cd()))
										.between(S0_M19.st_dt, S0_M19.end_dt))
							)
						)
						.leftOuterJoin(S0_M20).on(
							bracket(
								S0_M20.itm_cd.eq(S0_T02.itm_cd)
								.and(S0_M20.itm_sub1.eq(S0_T02.itm_sub1))
								.and(S0_M20.itm_sub2.eq(S0_T02.itm_sub2))
								.and(S0_M20.itm_sub3.eq(S0_T02.itm_sub3))
								.and(S0_M20.sno1.eq(S0_T02.sno1))
								.and(S0_M20.sno2.eq(S0_T02.sno2))
								.and(S0_M20.sno3.eq(S0_T02.sno3))
								.and(S0_M20.sno4.eq(S0_T02.sno4))
							)
						)
						.leftOuterJoin(S0_M21).on(
							bracket(
								S0_M21.dlv_id_typ.eq(S0_T01.dlv_id_typ)
								.and(S0_M21.dlv_id_cd.eq(S0_T01.dlv_id_cd))
							)
						)
						.leftOuterJoin(S0_M22).on(
							bracket(
								S0_M22.itm_cd.eq(S0_T02.itm_cd)
								.and(S0_M22.itm_sub1.eq(S0_T02.itm_sub1))
								.and(S0_M22.itm_sub2.eq(S0_T02.itm_sub2))
								.and(S0_M22.itm_sub3.eq(S0_T02.itm_sub3))
								.and(S0_M22.lcl_cd.eq(S0_M21.prnt_lcl_cd))
							)
						)
						.leftOuterJoin(S0_M29).on(
							bracket(
								S0_M29.fr_lg_grp_cd.eq(S0_T04.ship_fr_lg_grp_cd)
								.and(S0_M29.to_lg_grp_cd.eq(S0_M21.lg_grp_cd))
								.and(S0_M29.ship_term_cd.eq(S0_T04.ship_term_cd))
							)
						)
						.leftOuterJoin(S0_M30).on(
							bracket(
								S0_M30.fr_lg_grp_cd.eq(S0_T04.ship_fr_lg_grp_cd)
								.and(S0_M30.to_lg_grp_cd.eq(S0_M21.lg_grp_cd))
								.and(S0_M30.ship_term_cd.eq(value(MAC_STR.NULL_VAL.value())))
							)
						)
						.leftOuterJoin(S0_M32).on(
							bracket(
								S0_M32.loc_cd.eq(S0_T05.def_loc_cd)
							)
						)
					)
					.where(
						value(0).eq(value(0))
						.and(S0_T01.iv_no.eq(bind("iv_no")))
						.and(S0_T01.iv_ship_flg.eq(value(true)))
						.and(S0_T04.abort_flg.eq(value(false)))
						.and(S0_T05.ship_inst_typ.neq(value(MAC_SHIP_INST_TYP.NON.value())))
						.and(S0_T04.pr_sts_typ.eq(value(MSC_PR_STS_TYP.NOT_INST.value())))
					)
					.orderBy(
						S0_T02.disp_seq.asc(),
						S0_T04.ship_schd_no.asc(),
						S0_T03.ship_alloc_sts_no.asc()
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
							r.getStringNE("alloc_sno1")
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
						.add(MST_XFR_SCHD_R.class, r -> toCondition(
							r.getStringNE("xfr_schd_no")
						))
						.addSelect(m -> toArray(
							m.prov_basis_typ,
							m.prov_typ,
							m.ret_prov_basis_typ,
							m.ret_prov_typ,
							m.xfr_src_typ
						))
						.addMap((r, m) -> {
							r.setStringNE("xfr_src_typ", m.xfr_src_typ());
							r.setStringNE("prov_typ", m.prov_typ());
							r.setStringNE("prov_basis_typ", m.prov_basis_typ());
							r.setStringNE("ret_prov_typ", m.ret_prov_typ());
							r.setStringNE("ret_prov_basis_typ", m.ret_prov_basis_typ());
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
							r.getStringNE("ent_unit_cd")
						))
						.addSelect(m -> toArray(
							m.unit_cd,
							m.unit_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("ent_unit_nm", m.unit_nm());
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
							m.conv_base_qty,
							m.conv_qty,
							m.dec_place,
							m.rnd_typ,
							m.unit_dim,
							m.unit_wt
						))
						.addMap((r, m) -> {
							r.setNumberNE("ent_unit_conv_base_qty", m.conv_base_qty());
							r.setNumberNE("ent_unit_conv_qty", m.conv_qty());
							r.setNumberNE("ent_unit_dec_place", m.dec_place());
							r.setStringNE("ent_unit_rnd_typ", m.rnd_typ());
							r.setNumberNE("unit_wt", m.unit_wt());
							r.setNumberNE("unit_dim", m.unit_dim());
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
							m.conv_base_qty,
							m.conv_qty,
							m.dec_place,
							m.rnd_typ
						))
						.addMap((r, m) -> {
							r.setNumberNE("base_unit_conv_base_qty", m.conv_base_qty());
							r.setNumberNE("base_unit_conv_qty", m.conv_qty());
							r.setNumberNE("base_unit_dec_place", m.dec_place());
							r.setStringNE("base_unit_rnd_typ", m.rnd_typ());
					}),
					j -> j
						.add(MAM_UNIT_R.class, r -> toCondition(
							r.getStringNE("cont_fctr_unit_cd")
						))
						.addSelect(m -> toArray(
							m.unit_cd,
							m.unit_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("cont_fctr_unit_nm", m.unit_nm());
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
							r.setNumberNE("cont_unit_dec_place", m.dec_place());
							r.setStringNE("cont_unit_rnd_typ", m.rnd_typ());
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
							m.biz_rsn_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("rsn_nm", m.biz_rsn_nm());
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
						.add(MAM_UNIT_R.class, r -> toCondition(
							r.getStringNE("pckg_unit_cd")
						))
						.addSelect(m -> toArray(
							m.unit_cd,
							m.unit_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("pckg_unit_nm", m.unit_nm());
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
							m.conv_base_qty,
							m.conv_qty,
							m.dec_place
						))
						.addMap((r, m) -> {
							r.setNumberNE("pckg_unit_conv_base_qty", m.conv_base_qty());
							r.setNumberNE("pckg_unit_conv_qty", m.conv_qty());
							r.setNumberNE("pckg_unit_dec_place", m.dec_place());
					}),
					j -> j
						.add(MAM_UNIT_R.class, r -> toCondition(
							r.getStringNE("schd_unit_cd")
						))
						.addSelect(m -> toArray(
							m.dec_place,
							m.rnd_typ,
							m.unit_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("schd_unit_nm", m.unit_nm());
							r.setNumberNE("schd_unit_dec_place", m.dec_place());
							r.setStringNE("schd_unit_rnd_typ", m.rnd_typ());
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
					}),
					j -> j
						.add(MAM_ALLOC_GRP_R.class, r -> toCondition(
							r.getStringNE("alloc_grp_cd")
						))
						.addSelect(m -> toArray(
							m.alloc_grp_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("alloc_grp_nm", m.alloc_grp_nm());
					})
				)
			);
	}
	
	/**
	 * -- MSBEL1400_MST_SHIP_INST_D_Query_S01
	 */
	static MCQueryPlan MSBEL1400_MST_SHIP_INST_D_S01() {
		MST_SHIP_INST_D_P_R S0_HST01 = MST_SHIP_INST_D_P_R.create("HST01");
		MST_SHIP_ALLOC_STS_P_R S0_HST02 = MST_SHIP_ALLOC_STS_P_R.create("HST02");
		MST_SHIP_INST_P_R S0_HST03 = MST_SHIP_INST_P_R.create("HST03");
		MST_SHIP_INST_R S0_T01 = MST_SHIP_INST_R.create("T01");
		MST_SHIP_SCHD_R S0_T02 = MST_SHIP_SCHD_R.create("T02");
		MST_SHIP_PR_R S0_T03 = MST_SHIP_PR_R.create("T03");
		MST_SLO_D_R S0_T05 = MST_SLO_D_R.create("T05");
		MST_SHIP_ALLOC_STS_R S0_T10 = MST_SHIP_ALLOC_STS_R.create("T10");
		MAM_ITM_R S0_M02 = MAM_ITM_R.create("M02");
		MAM_DPT_R S0_M15 = MAM_DPT_R.create("M15");
		MAM_SUNDRY_ITM_R S0_M16 = MAM_SUNDRY_ITM_R.create("M16");
		MAM_UNIT_R S0_M17 = MAM_UNIT_R.create("M17");
		MAM_UNIT_R S0_M18 = MAM_UNIT_R.create("M18");
		MAM_BP_R S0_M20 = MAM_BP_R.create("M20");
		MAM_LOC_R S0_M21 = MAM_LOC_R.create("M21");
		MAVM_ITM_UNIT_R S0_M22 = MAVM_ITM_UNIT_R.create("M22");
		MSVM_DLV_ID_R S0_M24 = MSVM_DLV_ID_R.create("M24");
		MAM_ITM_LCL_R S0_M25 = MAM_ITM_LCL_R.create("M25");
		MAM_LG_CTL_R S0_M27 = MAM_LG_CTL_R.create("M27");
		MAM_LG_CTL_R S0_M28 = MAM_LG_CTL_R.create("M28");
		MAM_LOC_R S0_M30 = MAM_LOC_R.create("M30");
		MAM_LG_GRP_R S0_M31 = MAM_LG_GRP_R.create("M31");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBEL1400_MST_SHIP_INST_D_Query_S01")
					.mainQuery()
					.select(
						S0_HST01.ship_inst_d_no,
						S0_HST02.disp_seq,
						S0_HST02.ship_alloc_sts_no,
						S0_HST02.dlv_slip_no,
						S0_HST02.dlv_slip_d_no,
						S0_T02.ship_schd_no,
						S0_T03.ship_pr_no,
						S0_T03.slo_d_no,
						S0_T03.xfr_schd_no,
						S0_T02.pr_sts_typ,
						S0_HST01.trd_cd,
						S0_HST01.trd_ptn_typ,
						S0_HST01.itm_cd,
						S0_HST01.itm_sub1,
						S0_HST01.itm_sub2,
						S0_HST01.itm_sub3,
						decode(
							S0_HST01.sundry_itm_flg,
							value(true),
							nvl(
								S0_HST01.itm_nm,
								S0_M16.itm_nm
							),
							S0_M02.itm_nm
						).as("itm_nm"),
						S0_T05.cst_itm_cd,
						S0_T05.cst_itm_nm,
						decode(
							S0_HST01.sundry_itm_flg,
							value(true),
							nvl(
								S0_HST01.iv_itm_nm,
								S0_M16.itm_nm
							),
							nvl(
								S0_M25.itm_nm,
								S0_M02.itm_nm
							)
						).as("iv_itm_nm"),
						S0_HST01.sundry_itm_flg,
						S0_M02.dscnt_itm_flg,
						S0_M02.stk_mng_typ,
						S0_T02.not_lot_mix_flg,
						S0_T02.not_sublot_mix_flg,
						S0_HST02.ent_unit_cd,
						S0_HST02.ent_unit_qty,
						S0_HST02.base_unit_cd,
						S0_HST02.base_unit_qty,
						S0_M02.pckg_unit_cd,
						S0_M17.unit_nm.as("pckg_unit_nm"),
						S0_M22.conv_base_qty.as("pckg_unit_conv_base_qty"),
						S0_M22.conv_qty.as("pckg_unit_conv_qty"),
						S0_M22.dec_place.as("pckg_unit_dec_place"),
						decode(
							S0_T02.inst_bndl_flg,
							value(false),
							value(MAC_RND_TYP.RNDUP.value()),
							S0_M22.rnd_typ
						).as("pckg_unit_rnd_typ"),
						S0_HST02.ship_act_qty,
						S0_M02.cont_fctr_flg,
						S0_M02.cont_fctr_unit_cd,
						S0_M02.std_cont_fctr,
						S0_T02.iv_schd_qty,
						S0_T02.inst_bndl_flg,
						S0_HST01.abort_flg,
						S0_HST02.alloc_flg,
						S0_HST02.ship_loc_cd,
						S0_HST02.ship_str_ln_cd,
						S0_HST01.dlv_str_ln_cd,
						S0_M02.sno1_mng_typ,
						S0_M02.sno2_mng_typ,
						S0_M02.sno3_mng_typ,
						S0_M02.sno4_mng_typ,
						S0_HST02.sno1.as("alloc_sno1"),
						S0_HST02.sno2.as("alloc_sno2"),
						S0_HST02.sno3.as("alloc_sno3"),
						S0_HST02.sno4.as("alloc_sno4"),
						S0_T02.sno1,
						S0_T02.sno2,
						S0_T02.sno3,
						S0_T02.sno4,
						S0_T02.sno1_null_flg,
						S0_T02.sno2_null_flg,
						S0_T02.sno3_null_flg,
						S0_T02.sno4_null_flg,
						S0_M02.lot_mng_typ,
						S0_M02.sublot_mng_typ,
						S0_HST02.lot_no,
						S0_HST02.sublot_no,
						S0_M02.ver_flg,
						S0_T02.ver_no,
						S0_HST02.ver_no.as("alloc_ver_no"),
						S0_HST02.stk_arrv_bp_cd,
						S0_HST02.gd_cd,
						S0_HST02.quality_typ,
						S0_HST02.stk_insp_typ,
						S0_HST02.stk_id_typ,
						S0_HST02.stk_bp_cd,
						S0_T05.cst_po_d_no,
						S0_T05.cst_itm_cd,
						S0_T05.cst_itm_nm,
						S0_T05.set_itm_grp_no,
						nvl2(
							S0_T02.dlv_cd,
							S0_T02.pri_prnt_flg,
							S0_T05.pri_prnt_flg
						).as("pri_prnt_flg"),
						S0_T03.alloc_grp_cd,
						S0_HST01.rsn_cd,
						S0_HST01.bd_dpt_cd,
						S0_M15.dpt_nm.as("bd_dpt_nm"),
						S0_T03.cst_cd,
						cases()
							.when(S0_HST01.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.PROV_RTN.value())))
								.then(value(false))
							.otherwise(
								nvl(
									S0_M27.iv_trd_flg,
									S0_M28.iv_trd_flg
								)
							).as("iv_trd_flg"),
						S0_T03.dlv_id_typ,
						nvl(
							S0_T02.dlv_cd,
							S0_T03.dlv_id_cd
						).as("dlv_id_cd"),
						decode(
							S0_T03.dlv_id_typ,
							value(MSC_DLV_ID_TYP.DLV.value()),
							nvl2(
								S0_T02.dlv_cd,
								nvl(
									S0_T02.dlv_nm,
									S0_M20.bp_nm
								),
								nvl(
									S0_T03.dlv_id_nm,
									S0_M20.bp_nm
								)
							),
							value(MSC_DLV_ID_TYP.LOC.value()),
							S0_M21.loc_nm,
							nullValue()
						).as("dlv_id_nm"),
						decode(
							S0_T03.dlv_id_typ,
							value(MSC_DLV_ID_TYP.DLV.value()),
							nvl2(
								S0_T02.dlv_cd,
								S0_T02.dlv_lg_grp_cd,
								S0_T05.dlv_lg_grp_cd
							),
							value(MSC_DLV_ID_TYP.LOC.value()),
							S0_M21.lg_grp_cd,
							nullValue()
						).as("dlv_lg_grp_cd"),
						S0_T03.ship_inst_typ,
						S0_T03.loc_cd.as("ship_schd_loc_cd"),
						S0_M02.skip_chk_ship_flg,
						S0_HST02.alloc_flg,
						S0_HST02.alloc_scope_typ,
						decode(
							S0_T01.ship_fr_lg_grp_cd,
							S0_M30.lg_grp_cd,
							S0_T03.def_loc_cd,
							nullValue()
						).as("def_loc_cd"),
						decode(
							S0_T01.ship_fr_lg_grp_cd,
							S0_M30.lg_grp_cd,
							S0_M30.loc_nm,
							nullValue()
						).as("def_loc_nm"),
						decode(
							S0_T01.ship_fr_lg_grp_cd,
							S0_M30.lg_grp_cd,
							S0_M31.ship_loc_prio_flg,
							value(false)
						).as("ship_loc_prio_flg"),
						S0_HST02.wms_flg.as("last_wms_flg"),
						S0_HST01.base_dlv_slip_no,
						S0_HST01.base_prov_act_no,
						S0_HST01.base_ac_dt,
						S0_HST01.ship_cnt_rmrks,
						S0_HST01.trd_rmrks,
						S0_HST01.trd_d_rmrks,
						S0_HST01.intr_d_rmrks,
						S0_HST01.inst_d_rmrks,
						S0_HST01.sub_char1,
						S0_HST01.sub_char2,
						S0_HST01.sub_char3,
						// this field is appended by sql coverter.
						S0_HST01.lot_no.as("join_lot_no_"),
						// this field is appended by sql coverter.
						S0_HST01.sublot_no.as("join_sublot_no_"),
						// this field is appended by sql coverter.
						S0_T05.slo_no.as("join_slo_no_"),
						// this field is appended by sql coverter.
						S0_T02.dlv_inst_rcpt_no.as("join_dlv_inst_rcpt_no_"),
						// this field is appended by sql coverter.
						S0_T03.dlv_id_cd.as("join_dlv_id_cd_")
					)
					.from(
						S0_HST01
						.innerJoin(S0_HST02).on(
							S0_HST01.ship_inst_no.eq(S0_HST02.ship_inst_no)
							.and(S0_HST01.ship_inst_rev.eq(S0_HST02.ship_inst_rev))
							.and(S0_HST01.ship_inst_d_no.eq(S0_HST02.ship_inst_d_no))
						)
						.innerJoin(S0_HST03).on(
							S0_HST01.ship_inst_no.eq(S0_HST03.ship_inst_no)
							.and(S0_HST01.ship_inst_rev.eq(S0_HST03.ship_inst_rev))
						)
						.leftOuterJoin(S0_T01).on(S0_T01.ship_inst_no.eq(S0_HST01.ship_inst_no))
						.leftOuterJoin(S0_T02).on(
							S0_T02.ship_inst_d_no.eq(S0_HST01.ship_inst_d_no)
							.or(S0_T02.ship_schd_no.eq(S0_HST02.ship_schd_no)))
						.leftOuterJoin(S0_T03).on(S0_T03.ship_pr_no.eq(S0_T02.ship_pr_no))
						.leftOuterJoin(S0_T05).on(S0_T05.slo_d_no.eq(S0_T03.slo_d_no))
						.leftOuterJoin(S0_T10).on(S0_T10.ship_alloc_sts_no.eq(S0_HST02.ship_alloc_sts_no))
						.leftOuterJoin(S0_M02).on(
							S0_M02.itm_cd.eq(S0_HST01.itm_cd)
							.and(S0_M02.itm_sub1.eq(S0_HST01.itm_sub1))
							.and(S0_M02.itm_sub2.eq(S0_HST01.itm_sub2))
							.and(S0_M02.itm_sub3.eq(S0_HST01.itm_sub3))
						)
						.leftOuterJoin(S0_M15).on(
							S0_M15.dpt_cd.eq(S0_HST01.bd_dpt_cd)
							.and(
								trunc(
									S0_T01.ship_inst_tm,
									MCDateFmt.DD
								).between(S0_M15.st_dt, S0_M15.end_dt)
							)
						)
						.leftOuterJoin(S0_M16).on(
							S0_M16.itm_cd.eq(S0_HST01.itm_cd)
							.and(S0_M16.itm_sub1.eq(S0_HST01.itm_sub1))
							.and(S0_M16.itm_sub2.eq(S0_HST01.itm_sub2))
							.and(S0_M16.itm_sub3.eq(S0_HST01.itm_sub3))
							.and(S0_M16.sno1.eq(S0_HST01.sno1))
							.and(S0_M16.sno2.eq(S0_HST01.sno2))
							.and(S0_M16.sno3.eq(S0_HST01.sno3))
							.and(S0_M16.sno4.eq(S0_HST01.sno4))
						)
						.leftOuterJoin(S0_M17).on(S0_M17.unit_cd.eq(S0_M02.pckg_unit_cd))
						.leftOuterJoin(S0_M18).on(S0_M18.unit_cd.eq(S0_T02.trd_unit_cd))
						.leftOuterJoin(S0_M20).on(
							S0_M20.bp_cd.eq(nvl(
									S0_T02.dlv_cd,
									S0_T03.dlv_id_cd
								)
							)
						)
						.leftOuterJoin(S0_M21).on(S0_M21.loc_cd.eq(S0_T03.dlv_id_cd))
						.leftOuterJoin(S0_M22).on(
							S0_M22.itm_cd.eq(S0_HST01.itm_cd)
							.and(S0_M22.itm_sub1.eq(S0_HST01.itm_sub1))
							.and(S0_M22.itm_sub2.eq(S0_HST01.itm_sub2))
							.and(S0_M22.itm_sub3.eq(S0_HST01.itm_sub3))
							.and(S0_M22.unit_cd.eq(S0_M17.unit_cd))
						)
						.leftOuterJoin(S0_M24).on(
							S0_M24.dlv_id_typ.eq(S0_T03.dlv_id_typ)
							.and(S0_M24.dlv_id_cd.eq(S0_T03.dlv_id_cd))
						)
						.leftOuterJoin(S0_M25).on(
							S0_M25.itm_cd.eq(S0_HST01.itm_cd)
							.and(S0_M25.itm_sub1.eq(S0_HST01.itm_sub1))
							.and(S0_M25.itm_sub2.eq(S0_HST01.itm_sub2))
							.and(S0_M25.itm_sub3.eq(S0_HST01.itm_sub3))
							.and(S0_M25.lcl_cd.eq(S0_M24.prnt_lcl_cd))
						)
						.leftOuterJoin(S0_M27).on(
							S0_M27.fr_lg_grp_cd.eq(S0_T02.ship_fr_lg_grp_cd)
							.and(S0_M27.to_lg_grp_cd.eq(S0_M24.lg_grp_cd))
							.and(S0_M27.ship_term_cd.eq(S0_T02.ship_term_cd))
						)
						.leftOuterJoin(S0_M28).on(
							S0_M28.fr_lg_grp_cd.eq(S0_T02.ship_fr_lg_grp_cd)
							.and(S0_M28.to_lg_grp_cd.eq(S0_M24.lg_grp_cd))
							.and(S0_M28.ship_term_cd.eq(value(MAC_STR.NULL_VAL.value())))
						)
						.leftOuterJoin(S0_M30).on(S0_M30.loc_cd.eq(S0_T03.def_loc_cd))
						.leftOuterJoin(S0_M31).on(S0_M31.lg_grp_cd.eq(S0_T01.ship_fr_lg_grp_cd))
					)
					.where(
						value(0).eq(value(0))
						.and(S0_HST01.ship_inst_no.eq(bind("ship_inst_no")))
						.and(S0_HST01.ship_inst_rev.eq(bind("ship_inst_rev")))
						.cutoff$and(
								S0_HST01.can_flg.eq(value(false))
								.and(bind("edit_mode_flg").eq(value(true)))
							)
							.cutoff$and(
								bracket(
									bind("ref_mode_flg").eq(value(true))
									.and(
										S0_HST01.can_flg.eq(value(true))
									)
								)
							)
						)
					.orderBy(pr("disp_seq").asc())
			)
			.setJoinInfo(
				joinInfo(
					j -> j
						.add(MSVT_LOT_LIST_R.class, r -> toCondition(
							r.getStringNE("itm_cd"),
							r.getStringNE("itm_sub1"),
							r.getStringNE("itm_sub2"),
							r.getStringNE("itm_sub3"),
							r.getStringNE("join_lot_no_"),
							r.getStringNE("join_sublot_no_")
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
							r.getStringNE("alloc_sno1")
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
						.add(MST_XFR_SCHD_R.class, r -> toCondition(
							r.getStringNE("xfr_schd_no")
						))
						.addSelect(m -> toArray(
							m.prov_basis_typ,
							m.prov_typ,
							m.ret_prov_basis_typ,
							m.ret_prov_typ,
							m.xfr_src_typ
						))
						.addMap((r, m) -> {
							r.setStringNE("xfr_src_typ", m.xfr_src_typ());
							r.setStringNE("prov_typ", m.prov_typ());
							r.setStringNE("prov_basis_typ", m.prov_basis_typ());
							r.setStringNE("ret_prov_typ", m.ret_prov_typ());
							r.setStringNE("ret_prov_basis_typ", m.ret_prov_basis_typ());
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
							r.getStringNE("ent_unit_cd")
						))
						.addSelect(m -> toArray(
							m.unit_cd,
							m.unit_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("ent_unit_nm", m.unit_nm());
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
							m.conv_base_qty,
							m.conv_qty,
							m.dec_place,
							m.rnd_typ,
							m.unit_dim,
							m.unit_wt
						))
						.addMap((r, m) -> {
							r.setNumberNE("ent_unit_conv_base_qty", m.conv_base_qty());
							r.setNumberNE("ent_unit_conv_qty", m.conv_qty());
							r.setNumberNE("ent_unit_dec_place", m.dec_place());
							r.setStringNE("ent_unit_rnd_typ", m.rnd_typ());
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
							m.conv_base_qty,
							m.conv_qty,
							m.dec_place,
							m.rnd_typ
						))
						.addMap((r, m) -> {
							r.setNumberNE("base_unit_conv_base_qty", m.conv_base_qty());
							r.setNumberNE("base_unit_conv_qty", m.conv_qty());
							r.setNumberNE("base_unit_dec_place", m.dec_place());
							r.setStringNE("base_unit_rnd_typ", m.rnd_typ());
					}),
					j -> j
						.add(MAM_UNIT_R.class, r -> toCondition(
							r.getStringNE("cont_fctr_unit_cd")
						))
						.addSelect(m -> toArray(
							m.unit_cd,
							m.unit_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("cont_fctr_unit_nm", m.unit_nm());
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
							r.setNumberNE("cont_unit_dec_place", m.dec_place());
							r.setStringNE("cont_unit_rnd_typ", m.rnd_typ());
					}),
					j -> j
						.add(MAM_LOC_R.class, r -> toCondition(
							r.getStringNE("ship_loc_cd")
						))
						.addSelect(m -> toArray(
							m.loc_nm,
							m.site_cd,
							m.str_ln_tgt_flg
						))
						.addMap((r, m) -> {
							r.setStringNE("ship_loc_nm", m.loc_nm());
							r.setStringNE("ship_site_cd", m.site_cd());
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
							m.biz_rsn_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("rsn_nm", m.biz_rsn_nm());
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
					}),
					j -> j
						.add(MAM_ALLOC_GRP_R.class, r -> toCondition(
							r.getStringNE("alloc_grp_cd")
						))
						.addSelect(m -> toArray(
							m.alloc_grp_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("alloc_grp_nm", m.alloc_grp_nm());
					})
				)
			);
	}
	
	/**
	 * -- MSBEL1400_MST_SHIP_INST_Query_S01
	 */
	static MCQueryPlan MSBEL1400_MST_SHIP_INST_S01() {
		MST_SHIP_INST_R S0_T1 = MST_SHIP_INST_R.create("T1");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBEL1400_MST_SHIP_INST_Query_S01")
					.mainQuery()
					.select(S0_T1.ship_inst_rev)
					.from(S0_T1)
					.where(
						value(0).eq(value(0))
						.and(S0_T1.ship_inst_no.eq(bind("ship_inst_no")))
					)
			);
	}
	
	/**
	 * -- MSBEL1400_MST_SHIP_INST_Query_S02
	 */
	static MCQueryPlan MSBEL1400_MST_SHIP_INST_S02() {
		MST_SHIP_INST_P_R S0_HST = MST_SHIP_INST_P_R.create("HST");
		MST_SHIP_INST_R S0_T01 = MST_SHIP_INST_R.create("T01");
		MAM_DPT_R S0_M04 = MAM_DPT_R.create("M04");
		MAM_LG_CTL_R S0_M07 = MAM_LG_CTL_R.create("M07");
		MAM_LG_CTL_R S0_M08 = MAM_LG_CTL_R.create("M08");
		MAM_SHIP_WK_GRP_R S0_M09 = MAM_SHIP_WK_GRP_R.create("M09");
		MAM_SHIP_WK_GRP_R S0_M10 = MAM_SHIP_WK_GRP_R.create("M10");
		MAVM_RD_LG_GRP_R S0_RD01 = MAVM_RD_LG_GRP_R.create("RD01");
		MSVM_SHIP_TO_ID_R S0_M11 = MSVM_SHIP_TO_ID_R.create("M11");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBEL1400_MST_SHIP_INST_Query_S02")
					.mainQuery()
					.select(
						S0_HST.ship_fr_lg_grp_cd,
						S0_HST.ship_inst_no,
						S0_HST.ship_inst_rev,
						S0_HST.iv_no,
						trunc(
							S0_HST.ship_schd_tm,
							MCDateFmt.DD
						).as("ship_schd_dt"),
						S0_HST.ship_schd_tm.as("ship_schd_hm"),
						trunc(
							S0_HST.dlv_schd_tm,
							MCDateFmt.DD
						).as("dlv_schd_dt"),
						S0_HST.dlv_schd_tm.as("dlv_schd_hm"),
						trunc(
							S0_HST.ship_inst_tm,
							MCDateFmt.DD
						).as("ship_inst_dt"),
						S0_HST.ship_inst_tm.as("ship_inst_hm"),
						S0_HST.ship_to_id_typ,
						S0_HST.ship_to_id_cd,
						decode(
							S0_HST.ship_to_sundry_flg,
							value(true),
							S0_HST.ship_to_id_nm,
							S0_M11.ship_to_id_nm
						).as("ship_to_id_nm"),
						S0_HST.ship_to_zip_cd,
						S0_HST.ship_to_addr1,
						S0_HST.ship_to_addr2,
						S0_HST.ship_to_addr3,
						S0_HST.ship_to_addr4,
						S0_HST.ship_to_cntct_dpt,
						S0_HST.ship_to_cntct_psn,
						S0_HST.ship_to_tel,
						S0_HST.ship_to_fax,
						S0_HST.ship_to_sundry_flg,
						S0_HST.ship_to_lg_grp_cd,
						S0_HST.inst_usr_cd,
						S0_HST.inst_dpt_cd,
						S0_M04.dpt_nm.as("inst_dpt_nm"),
						S0_HST.ship_term_cd,
						nvl(
							S0_M07.ship_wk_grp_cd,
							S0_M08.ship_wk_grp_cd
						).as("ship_wk_grp_cd"),
						decode(
							S0_M07.ship_wk_grp_cd,
							nullValue(),
							S0_M10.ship_wk_grp_nm,
							S0_M09.ship_wk_grp_nm
						).as("ship_wk_grp_nm"),
						S0_HST.ship_wk_cd,
						S0_HST.intr_rmrks,
						S0_HST.inst_rmrks,
						S0_HST.sub_char1,
						S0_HST.sub_char2,
						S0_HST.sub_char3,
						S0_HST.pick_prnt_flg,
						S0_HST.ship_inst_prnt_flg,
						S0_HST.ship_adv_prnt_flg,
						S0_HST.dlv_prnt_flg,
						S0_HST.can_flg,
						S0_HST.ins_usr_id,
						S0_HST.ins_usr_nm,
						S0_HST.ins_func_id,
						S0_HST.ins_ts,
						S0_HST.upd_usr_id,
						S0_HST.upd_usr_nm,
						S0_HST.upd_func_id,
						S0_HST.upd_ts,
						S0_HST.upd_srv_req_no,
						S0_T01.upd_cntr.as("ship_inst_upd_cntr"),
						// this field is appended by sql coverter.
						S0_T01.ship_fr_lg_grp_cd.as("join_ship_fr_lg_grp_cd_"),
						// this field is appended by sql coverter.
						S0_T01.ship_to_lg_grp_cd.as("join_ship_to_lg_grp_cd_"),
						// this field is appended by sql coverter.
						S0_T01.inst_usr_cd.as("join_inst_usr_cd_"),
						// this field is appended by sql coverter.
						S0_T01.ship_term_cd.as("join_ship_term_cd_"),
						// this field is appended by sql coverter.
						S0_T01.ship_wk_cd.as("join_ship_wk_cd_")
					)
					.from(
						S0_HST
						.innerJoin(S0_T01).on(
							bracket(
								S0_HST.ship_inst_no.eq(S0_T01.ship_inst_no)
							)
						)
						.leftOuterJoin(S0_M04).on(
							bracket(
								S0_T01.inst_dpt_cd.eq(S0_M04.dpt_cd)
								.and(S0_T01.ship_inst_tm.between(S0_M04.st_dt, S0_M04.end_dt))
							)
						)
						.leftOuterJoin(S0_M07).on(
							bracket(
								S0_T01.ship_fr_lg_grp_cd.eq(S0_M07.fr_lg_grp_cd)
								.and(S0_T01.ship_to_lg_grp_cd.eq(S0_M07.to_lg_grp_cd))
								.and(S0_M07.ship_term_cd.eq(S0_T01.ship_term_cd))
							)
						)
						.leftOuterJoin(S0_M08).on(
							bracket(
								S0_T01.ship_fr_lg_grp_cd.eq(S0_M08.fr_lg_grp_cd)
								.and(S0_T01.ship_to_lg_grp_cd.eq(S0_M08.to_lg_grp_cd))
								.and(S0_M08.ship_term_cd.eq(value(MAC_STR.NULL_VAL.value())))
							)
						)
						.leftOuterJoin(S0_M09).on(
							bracket(
								S0_M07.ship_wk_grp_cd.eq(S0_M09.ship_wk_grp_cd)
							)
						)
						.leftOuterJoin(S0_M10).on(
							bracket(
								S0_M08.ship_wk_grp_cd.eq(S0_M10.ship_wk_grp_cd)
							)
						)
						.innerJoin(S0_RD01).on(
							bracket(
								S0_RD01.lg_grp_cd.eq(S0_T01.ship_fr_lg_grp_cd)
							)
						)
						.leftOuterJoin(S0_M11).on(
							bracket(
								S0_HST.ship_to_id_typ.eq(S0_M11.ship_to_id_typ)
								.and(S0_HST.ship_to_id_cd.eq(S0_M11.ship_to_id_cd))
							)
						)
					)
					.where(
						value(0).eq(value(0))
						.and(S0_HST.ship_inst_no.eq(bind("ship_inst_no")))
						.and(S0_HST.ship_inst_rev.eq(bind("ship_inst_rev")))
						.cutoff$and(
								S0_HST.can_flg.eq(value(false))
								.and(bind("edit_mode_flg").eq(value(true)))
							)
					)
			)
			.setJoinInfo(
				joinInfo(
					j -> j
						.add(MAM_LG_GRP_R.class, r -> toCondition(
							r.getStringNE("join_ship_fr_lg_grp_cd_")
						))
						.addSelect(m -> toArray(
							m.lg_grp_nm,
							m.pick_list_flg,
							m.ship_inst_flg,
							m.ship_slip_flg
						))
						.addMap((r, m) -> {
							r.setStringNE("ship_fr_lg_grp_nm", m.lg_grp_nm());
							r.setBooleanNE("immd_dlv_prnt_flg", m.ship_slip_flg());
							r.setBooleanNE("immd_ship_adv_prnt_flg", m.ship_slip_flg());
							r.setBooleanNE("immd_pick_prnt_flg", m.pick_list_flg());
							r.setBooleanNE("immd_ship_inst_prnt_flg", m.ship_inst_flg());
					}),
					j -> j
						.add(MAM_LG_GRP_R.class, r -> toCondition(
							r.getStringNE("join_ship_to_lg_grp_cd_")
						))
						.addSelect(m -> toArray(
							m.lg_grp_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("ship_to_lg_grp_nm", m.lg_grp_nm());
					}),
					j -> j
						.add(MAM_USR_R.class, r -> toCondition(
							r.getStringNE("join_inst_usr_cd_")
						))
						.addSelect(m -> toArray(
							m.usr_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("inst_usr_nm", m.usr_nm());
					}),
					j -> j
						.add(MAM_SHIP_TERM_R.class, r -> toCondition(
							r.getStringNE("join_ship_term_cd_")
						))
						.addSelect(m -> toArray(
							m.ship_term_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("ship_term_nm", m.ship_term_nm());
					}),
					j -> j
						.add(MAM_SHIP_WK_R.class, r -> toCondition(
							r.getStringNE("join_ship_wk_cd_")
						))
						.addSelect(m -> toArray(
							m.ship_wk_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("ship_wk_nm", m.ship_wk_nm());
					})
				)
			);
	}
	
	/**
	 * -- MSBEL1400_MST_SHIP_SCHD_Query_S01
	 */
	static MCQueryPlan MSBEL1400_MST_SHIP_SCHD_S01() {
		MSW_SHIP_SCHD_KEY_R S0_W01 = MSW_SHIP_SCHD_KEY_R.create("W01");
		MST_SHIP_ALLOC_STS_R S0_T03 = MST_SHIP_ALLOC_STS_R.create("T03");
		MST_SHIP_SCHD_R S0_T04 = MST_SHIP_SCHD_R.create("T04");
		MST_SHIP_PR_R S0_T05 = MST_SHIP_PR_R.create("T05");
		MST_SLO_D_R S0_T07 = MST_SLO_D_R.create("T07");
		MST_SLO_R S0_T08 = MST_SLO_R.create("T08");
		MAM_LG_GRP_R S0_M01 = MAM_LG_GRP_R.create("M01");
		MAM_LG_GRP_R S0_M02 = MAM_LG_GRP_R.create("M02");
		MAM_ITM_R S0_M06 = MAM_ITM_R.create("M06");
		MAM_DPT_R S0_M19 = MAM_DPT_R.create("M19");
		MAM_SUNDRY_ITM_R S0_M20 = MAM_SUNDRY_ITM_R.create("M20");
		MSVM_DLV_ID_R S0_M22 = MSVM_DLV_ID_R.create("M22");
		MAM_ITM_LCL_R S0_M23 = MAM_ITM_LCL_R.create("M23");
		MSVM_SHIP_TO_ID_R S0_M25 = MSVM_SHIP_TO_ID_R.create("M25");
		MAM_LG_CTL_R S0_M31 = MAM_LG_CTL_R.create("M31");
		MAM_LG_CTL_R S0_M32 = MAM_LG_CTL_R.create("M32");
		MAM_LOC_R S0_M33 = MAM_LOC_R.create("M33");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBEL1400_MST_SHIP_SCHD_Query_S01")
					.mainQuery()
					.select(
						S0_T03.ship_alloc_sts_no,
						S0_T04.ship_schd_no,
						S0_T05.ship_pr_no,
						S0_T08.slo_no,
						S0_T05.slo_d_no,
						S0_T05.xfr_schd_no,
						nullValue().as("iv_no"),
						S0_T07.disp_seq,
						S0_T04.pr_sts_typ,
						trunc(
							S0_T04.ship_schd_tm,
							MCDateFmt.DD
						).as("ship_schd_dt"),
						S0_T04.ship_schd_tm.as("ship_schd_hm"),
						trunc(
							S0_T04.dlv_schd_tm,
							MCDateFmt.DD
						).as("dlv_schd_dt"),
						S0_T04.dlv_schd_tm.as("dlv_schd_hm"),
						S0_T05.ship_to_id_typ,
						nvl2(
							S0_T04.tdlv_cd,
							value(MSC_SHIP_TO_ID_TYP.TDLV.value()),
							S0_T05.ship_to_id_typ
						).as("ship_to_id_typ"),
						nvl(
							nvl(
								S0_T04.tdlv_cd,
								decode(
									S0_T05.ship_to_id_typ,
									value(MSC_SHIP_TO_ID_TYP.DLV.value()),
									S0_T04.dlv_cd,
									nullValue()
								)
							),
							S0_T05.ship_to_id_cd
						).as("ship_to_id_cd"),
						nvl2(
							S0_T04.tdlv_cd,
							nvl(
								S0_T04.tdlv_nm,
								S0_M25.ship_to_id_nm
							),
							decode(
								S0_T05.ship_to_id_typ,
								value(MSC_SHIP_TO_ID_TYP.DLV.value()),
								nvl2(
									S0_T04.dlv_cd,
									nvl(
										S0_T04.dlv_nm,
										S0_M25.ship_to_id_nm
									),
									nvl(
										S0_T05.ship_to_id_nm,
										S0_M25.ship_to_id_nm
									)
								),
								nvl(
									S0_T05.ship_to_id_nm,
									S0_M25.ship_to_id_nm
								)
							)
						).as("ship_to_id_nm"),
						nvl2(
							S0_T04.tdlv_cd,
							S0_T04.tdlv_zip_cd,
							decode(
								S0_T05.ship_to_id_typ,
								value(MSC_SHIP_TO_ID_TYP.DLV.value()),
								nvl2(
									S0_T04.dlv_cd,
									S0_T04.dlv_zip_cd,
									S0_T05.ship_to_zip_cd
								),
								S0_T05.ship_to_zip_cd
							)
						).as("ship_to_zip_cd"),
						nvl2(
							S0_T04.tdlv_cd,
							S0_T04.tdlv_addr1,
							decode(
								S0_T05.ship_to_id_typ,
								value(MSC_SHIP_TO_ID_TYP.DLV.value()),
								nvl2(
									S0_T04.dlv_cd,
									S0_T04.dlv_addr1,
									S0_T05.ship_to_addr1
								),
								S0_T05.ship_to_addr1
							)
						).as("ship_to_addr1"),
						nvl2(
							S0_T04.tdlv_cd,
							S0_T04.tdlv_addr2,
							decode(
								S0_T05.ship_to_id_typ,
								value(MSC_SHIP_TO_ID_TYP.DLV.value()),
								nvl2(
									S0_T04.dlv_cd,
									S0_T04.dlv_addr2,
									S0_T05.ship_to_addr2
								),
								S0_T05.ship_to_addr2
							)
						).as("ship_to_addr2"),
						nvl2(
							S0_T04.tdlv_cd,
							S0_T04.tdlv_addr3,
							decode(
								S0_T05.ship_to_id_typ,
								value(MSC_SHIP_TO_ID_TYP.DLV.value()),
								nvl2(
									S0_T04.dlv_cd,
									S0_T04.dlv_addr3,
									S0_T05.ship_to_addr3
								),
								S0_T05.ship_to_addr3
							)
						).as("ship_to_addr3"),
						nvl2(
							S0_T04.tdlv_cd,
							S0_T04.tdlv_addr4,
							decode(
								S0_T05.ship_to_id_typ,
								value(MSC_SHIP_TO_ID_TYP.DLV.value()),
								nvl2(
									S0_T04.dlv_cd,
									S0_T04.dlv_addr4,
									S0_T05.ship_to_addr4
								),
								S0_T05.ship_to_addr4
							)
						).as("ship_to_addr4"),
						nvl2(
							S0_T04.tdlv_cd,
							S0_T04.tdlv_cntct_dpt,
							decode(
								S0_T05.ship_to_id_typ,
								value(MSC_SHIP_TO_ID_TYP.DLV.value()),
								nvl2(
									S0_T04.dlv_cd,
									S0_T04.dlv_cntct_dpt,
									S0_T05.ship_to_cntct_dpt
								),
								S0_T05.ship_to_cntct_dpt
							)
						).as("ship_to_cntct_dpt"),
						nvl2(
							S0_T04.tdlv_cd,
							S0_T04.tdlv_cntct_psn,
							decode(
								S0_T05.ship_to_id_typ,
								value(MSC_SHIP_TO_ID_TYP.DLV.value()),
								nvl2(
									S0_T04.dlv_cd,
									S0_T04.dlv_cntct_psn,
									S0_T05.ship_to_cntct_psn
								),
								S0_T05.ship_to_cntct_psn
							)
						).as("ship_to_cntct_psn"),
						nvl2(
							S0_T04.tdlv_cd,
							S0_T04.tdlv_tel,
							decode(
								S0_T05.ship_to_id_typ,
								value(MSC_SHIP_TO_ID_TYP.DLV.value()),
								nvl2(
									S0_T04.dlv_cd,
									S0_T04.dlv_tel,
									S0_T05.ship_to_tel
								),
								S0_T05.ship_to_tel
							)
						).as("ship_to_tel"),
						nvl2(
							S0_T04.tdlv_cd,
							S0_T04.tdlv_fax,
							decode(
								S0_T05.ship_to_id_typ,
								value(MSC_SHIP_TO_ID_TYP.DLV.value()),
								nvl2(
									S0_T04.dlv_cd,
									S0_T04.dlv_fax,
									S0_T05.ship_to_fax
								),
								S0_T05.ship_to_fax
							)
						).as("ship_to_fax"),
						nvl2(
							S0_T04.tdlv_cd,
							S0_T04.tdlv_sundry_flg,
							decode(
								S0_T05.ship_to_id_typ,
								value(MSC_SHIP_TO_ID_TYP.DLV.value()),
								nvl2(
									S0_T04.dlv_cd,
									S0_T04.dlv_sundry_flg,
									S0_T05.ship_to_sundry_flg
								),
								S0_T05.ship_to_sundry_flg
							)
						).as("ship_to_sundry_flg"),
						nvl2(
							S0_T04.tdlv_cd,
							S0_T04.tdlv_lg_grp_cd,
							decode(
								S0_T05.ship_to_id_typ,
								value(MSC_SHIP_TO_ID_TYP.DLV.value()),
								nvl2(
									S0_T04.dlv_cd,
									S0_T04.dlv_lg_grp_cd,
									S0_T05.ship_to_lg_grp_cd
								),
								S0_T05.ship_to_lg_grp_cd
							)
						).as("ship_to_lg_grp_cd"),
						S0_M01.lg_grp_nm.as("ship_to_lg_grp_nm"),
						nvl(
							S0_T04.via_dlv_typ,
							S0_T05.via_dlv_typ
						).as("via_dlv_typ"),
						S0_T04.ship_fr_lg_grp_cd,
						S0_M02.lg_grp_nm.as("ship_fr_lg_grp_nm"),
						S0_T04.wg_cd,
						S0_T04.ship_term_cd,
						nullValue().as("ship_wk_grp_cd"),
						nullValue().as("ship_wk_grp_nm"),
						nullValue().as("ship_wk_cd"),
						nullValue().as("ship_wk_nm"),
						S0_T05.trd_cd,
						S0_T05.trd_ptn_typ,
						S0_T04.itm_cd,
						S0_T04.itm_sub1,
						S0_T04.itm_sub2,
						S0_T04.itm_sub3,
						decode(
							S0_T04.sundry_itm_flg,
							value(true),
							nvl(
								S0_T04.itm_nm,
								S0_M20.itm_nm
							),
							S0_M06.itm_nm
						).as("itm_nm"),
						S0_T07.cst_itm_cd,
						S0_T07.cst_itm_nm,
						decode(
							S0_T04.sundry_itm_flg,
							value(true),
							nvl(
								S0_T04.iv_itm_nm,
								S0_M20.itm_nm
							),
							S0_M23.itm_nm
						).as("iv_itm_nm"),
						S0_M06.stk_mng_typ,
						S0_T04.sundry_itm_flg,
						S0_M06.dscnt_itm_flg,
						S0_M06.stk_mng_typ,
						S0_T03.ent_unit_cd,
						S0_T03.ent_unit_qty,
						S0_T03.base_unit_cd,
						S0_T03.base_unit_qty,
						S0_M06.pckg_unit_cd,
						value(MAC_RND_TYP.RNDUP.value()).as("pckg_unit_rnd_typ"),
						S0_T04.trd_unit_cd.as("schd_unit_cd"),
						S0_T03.ship_act_qty.as("alloc_act_qty"),
						S0_M06.cont_fctr_flg,
						S0_M06.cont_fctr_unit_cd,
						S0_M06.std_cont_fctr,
						S0_T04.trd_unit_qty.as("schd_unit_qty"),
						nullValue().as("inst_unit_qty"),
						S0_T04.ship_act_qty.as("ship_unit_qty"),
						S0_T04.iv_schd_qty,
						S0_T04.iv_act_qty,
						S0_T04.abort_flg,
						S0_T03.ship_loc_cd,
						S0_T03.ship_str_ln_cd,
						S0_M06.sno1_mng_typ,
						S0_M06.sno2_mng_typ,
						S0_M06.sno3_mng_typ,
						S0_M06.sno4_mng_typ,
						S0_T03.sno1.as("alloc_sno1"),
						S0_T03.sno2.as("alloc_sno2"),
						S0_T03.sno3.as("alloc_sno3"),
						S0_T03.sno4.as("alloc_sno4"),
						S0_T04.sno1,
						S0_T04.sno2,
						S0_T04.sno3,
						S0_T04.sno4,
						S0_T04.sno1_null_flg,
						S0_T04.sno2_null_flg,
						S0_T04.sno3_null_flg,
						S0_T04.sno4_null_flg,
						S0_M06.lot_mng_typ,
						S0_M06.sublot_mng_typ,
						S0_T03.lot_no,
						S0_T03.sublot_no,
						S0_M06.ver_flg,
						S0_T04.ver_no,
						S0_T03.ver_no.as("alloc_ver_no"),
						S0_T03.alloc_flg,
						S0_T03.stk_arrv_bp_cd,
						S0_T03.gd_cd,
						S0_T03.quality_typ,
						S0_T03.stk_insp_typ,
						S0_T03.stk_id_typ,
						S0_T03.stk_bp_cd,
						S0_T05.cst_cd,
						S0_T08.cst_po_no,
						S0_T07.cst_po_d_no,
						S0_T07.cst_itm_cd,
						S0_T07.cst_itm_nm,
						S0_T08.assort_typ,
						S0_T07.set_itm_grp_no,
						S0_T05.ship_inst_typ,
						S0_T05.dlv_id_typ,
						nvl(
							S0_T04.dlv_cd,
							S0_T05.dlv_id_cd
						).as("dlv_id_cd"),
						nvl2(
							S0_T04.dlv_cd,
							nvl(
								S0_T04.dlv_nm,
								S0_M22.dlv_id_nm
							),
							nvl(
								S0_T05.dlv_id_nm,
								S0_M22.dlv_id_nm
							)
						).as("dlv_id_nm"),
						nvl2(
							S0_T04.dlv_cd,
							S0_T04.dlv_zip_cd,
							S0_T05.dlv_zip_cd
						).as("dlv_zip_cd"),
						nvl2(
							S0_T04.dlv_cd,
							S0_T04.dlv_addr1,
							S0_T05.dlv_addr1
						).as("dlv_addr1"),
						nvl2(
							S0_T04.dlv_cd,
							S0_T04.dlv_addr2,
							S0_T05.dlv_addr2
						).as("dlv_addr2"),
						nvl2(
							S0_T04.dlv_cd,
							S0_T04.dlv_addr3,
							S0_T05.dlv_addr3
						).as("dlv_addr3"),
						nvl2(
							S0_T04.dlv_cd,
							S0_T04.dlv_addr4,
							S0_T05.dlv_addr4
						).as("dlv_addr4"),
						nvl2(
							S0_T04.dlv_cd,
							S0_T04.dlv_cntct_dpt,
							S0_T05.dlv_cntct_dpt
						).as("dlv_cntct_dpt"),
						nvl2(
							S0_T04.dlv_cd,
							S0_T04.dlv_cntct_psn,
							S0_T05.dlv_cntct_psn
						).as("dlv_cntct_psn"),
						nvl2(
							S0_T04.dlv_cd,
							S0_T04.dlv_tel,
							S0_T05.dlv_tel
						).as("dlv_tel"),
						nvl2(
							S0_T04.dlv_cd,
							S0_T04.dlv_fax,
							S0_T05.dlv_fax
						).as("dlv_fax"),
						nvl2(
							S0_T04.dlv_cd,
							S0_T04.dlv_sundry_flg,
							S0_T05.dlv_sundry_flg
						).as("dlv_sundry_flg"),
						S0_T05.dlv_str_ln_cd,
						nvl2(
							S0_T04.dlv_cd,
							S0_T04.dlv_lg_grp_cd,
							nvl(
								S0_T07.dlv_lg_grp_cd,
								S0_M22.lg_grp_cd
							)
						).as("dlv_lg_grp_cd"),
						nvl2(
							S0_T04.dlv_cd,
							S0_T04.pri_prnt_flg,
							S0_T07.pri_prnt_flg
						).as("pri_prnt_flg"),
						S0_T05.alloc_grp_cd,
						decode(
							S0_T04.ship_fr_lg_grp_cd,
							S0_M33.lg_grp_cd,
							S0_T05.def_loc_cd,
							nullValue()
						).as("def_loc_cd"),
						decode(
							S0_T04.ship_fr_lg_grp_cd,
							S0_M33.lg_grp_cd,
							S0_M33.loc_nm,
							nullValue()
						).as("def_loc_nm"),
						decode(
							S0_T04.ship_fr_lg_grp_cd,
							S0_M33.lg_grp_cd,
							S0_M02.ship_loc_prio_flg,
							value(false)
						).as("ship_loc_prio_flg"),
						S0_T05.rsn_cd,
						S0_T05.bd_dpt_cd,
						S0_M19.dpt_nm.as("bd_dpt_nm"),
						S0_T03.alloc_scope_typ,
						S0_T03.not_lot_mix_flg,
						S0_T03.not_sublot_mix_flg,
						cases()
							.when(S0_T05.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.PROV_RTN.value())))
								.then(value(false))
							.otherwise(
								nvl(
									S0_M31.iv_trd_flg,
									S0_M32.iv_trd_flg
								)
							).as("iv_trd_flg"),
						S0_M06.skip_chk_ship_flg,
						S0_T05.loc_cd.as("ship_schd_loc_cd"),
						S0_T04.base_dlv_slip_no,
						S0_T04.base_prov_act_no,
						S0_T04.base_ac_dt,
						S0_T04.ship_cnt_rmrks,
						S0_T04.trd_rmrks,
						S0_T04.trd_d_rmrks,
						S0_T05.sub_char1.as("h_sub_char1"),
						S0_T05.sub_char2.as("h_sub_char2"),
						S0_T05.sub_char3.as("h_sub_char3"),
						S0_T04.sub_char1,
						S0_T04.sub_char2,
						S0_T04.sub_char3,
						S0_T05.ins_usr_id,
						S0_T05.ins_usr_nm,
						S0_T05.ins_func_id,
						nullValue().as("ins_func_nm"),
						S0_T05.ins_ts,
						S0_T05.upd_usr_id,
						S0_T05.upd_usr_nm,
						S0_T05.upd_func_id,
						nullValue().as("upd_func_nm"),
						S0_T05.upd_ts,
						S0_T04.upd_cntr.as("ship_schd_upd_cntr"),
						S0_T05.upd_cntr.as("ship_pr_upd_cntr"),
						// this field is appended by sql coverter.
						S0_T04.dlv_inst_rcpt_no.as("join_dlv_inst_rcpt_no_"),
						// this field is appended by sql coverter.
						S0_T05.dlv_id_cd.as("join_dlv_id_cd_")
					)
					.from(
						S0_W01
						.innerJoin(S0_T03).on(
							bracket(
								S0_T03.ship_schd_no.eq(S0_W01.ship_schd_no)
							)
						)
						.innerJoin(S0_T04).on(
							bracket(
								S0_T04.ship_schd_no.eq(S0_T03.ship_schd_no)
							)
						)
						.innerJoin(S0_T05).on(
							bracket(
								S0_T05.ship_pr_no.eq(S0_T04.ship_pr_no)
							)
						)
						.leftOuterJoin(S0_T07).on(
							bracket(
								S0_T07.slo_d_no.eq(S0_T05.slo_d_no)
							)
						)
						.leftOuterJoin(S0_T08).on(
							bracket(
								S0_T08.slo_no.eq(S0_T07.slo_no)
							)
						)
						.leftOuterJoin(S0_M01).on(
							bracket(
								S0_M01.lg_grp_cd.eq(nvl2(
										S0_T04.tdlv_cd,
										S0_T04.tdlv_lg_grp_cd,
										decode(
											S0_T05.ship_to_id_typ,
											value(MSC_SHIP_TO_ID_TYP.DLV.value()),
											nvl2(
												S0_T04.dlv_cd,
												S0_T04.dlv_lg_grp_cd,
												S0_T05.ship_to_lg_grp_cd
											),
											S0_T05.ship_to_lg_grp_cd
										)
									)
								)
							)
						)
						.leftOuterJoin(S0_M02).on(
							bracket(
								S0_M02.lg_grp_cd.eq(S0_T04.ship_fr_lg_grp_cd)
							)
						)
						.leftOuterJoin(S0_M06).on(
							bracket(
								S0_M06.itm_cd.eq(S0_T04.itm_cd)
								.and(S0_M06.itm_sub1.eq(S0_T04.itm_sub1))
								.and(S0_M06.itm_sub2.eq(S0_T04.itm_sub2))
								.and(S0_M06.itm_sub3.eq(S0_T04.itm_sub3))
							)
						)
						.leftOuterJoin(S0_M19).on(
							bracket(
								S0_M19.dpt_cd.eq(S0_T05.bd_dpt_cd)
								.and(FCPA_DATE_UTIL$F_MCSYSDATE_CO(value(mcframe.serverMAUC.MAUCL0020.MAUCL_AppSys.getCo().co_cd()))
										.between(S0_M19.st_dt, S0_M19.end_dt))
							)
						)
						.leftOuterJoin(S0_M20).on(
							bracket(
								S0_M20.itm_cd.eq(S0_T04.itm_cd)
								.and(S0_M20.itm_sub1.eq(S0_T04.itm_sub1))
								.and(S0_M20.itm_sub2.eq(S0_T04.itm_sub2))
								.and(S0_M20.itm_sub3.eq(S0_T04.itm_sub3))
								.and(S0_M20.sno1.eq(S0_T04.sno1))
								.and(S0_M20.sno2.eq(S0_T04.sno2))
								.and(S0_M20.sno3.eq(S0_T04.sno3))
								.and(S0_M20.sno4.eq(S0_T04.sno4))
							)
						)
						.leftOuterJoin(S0_M22).on(
							bracket(
								S0_M22.dlv_id_typ.eq(S0_T05.dlv_id_typ)
								.and(
									S0_M22.dlv_id_cd.eq(nvl(
											S0_T04.dlv_cd,
											S0_T05.dlv_id_cd
										)
									)
								)
							)
						)
						.leftOuterJoin(S0_M23).on(
							bracket(
								S0_M23.itm_cd.eq(S0_T04.itm_cd)
								.and(S0_M23.itm_sub1.eq(S0_T04.itm_sub1))
								.and(S0_M23.itm_sub2.eq(S0_T04.itm_sub2))
								.and(S0_M23.itm_sub3.eq(S0_T04.itm_sub3))
								.and(S0_M23.lcl_cd.eq(S0_M22.prnt_lcl_cd))
							)
						)
						.leftOuterJoin(S0_M25).on(
							bracket(
								S0_M25.ship_to_id_typ.eq(S0_T05.ship_to_id_typ)
								.and(
									S0_M25.ship_to_id_cd.eq(nvl(
											nvl(
												S0_T04.tdlv_cd,
												decode(
													S0_T05.ship_to_id_typ,
													value(MSC_SHIP_TO_ID_TYP.DLV.value()),
													S0_T04.dlv_cd,
													nullValue()
												)
											),
											S0_T05.ship_to_id_cd
										)
									)
								)
							)
						)
						.leftOuterJoin(S0_M31).on(
							bracket(
								S0_M31.fr_lg_grp_cd.eq(S0_T04.ship_fr_lg_grp_cd)
								.and(S0_M31.to_lg_grp_cd.eq(S0_M22.lg_grp_cd))
								.and(S0_M31.ship_term_cd.eq(S0_T04.ship_term_cd))
							)
						)
						.leftOuterJoin(S0_M32).on(
							bracket(
								S0_M32.fr_lg_grp_cd.eq(S0_T04.ship_fr_lg_grp_cd)
								.and(S0_M32.to_lg_grp_cd.eq(S0_M22.lg_grp_cd))
								.and(S0_M32.ship_term_cd.eq(value(MAC_STR.NULL_VAL.value())))
							)
						)
						.leftOuterJoin(S0_M33).on(
							bracket(
								S0_M33.loc_cd.eq(S0_T05.def_loc_cd)
							)
						)
					)
					.where(
						value(0).eq(value(0))
						.and(S0_T05.ship_inst_typ.neq(value(MAC_SHIP_INST_TYP.NON.value())))
						.and(S0_T04.abort_flg.eq(value(false)))
						.and(S0_T04.pr_sts_typ.eq(value(MSC_PR_STS_TYP.NOT_INST.value())))
					)
					.orderBy(
						S0_T08.slo_no.asc(),
						S0_T07.disp_seq.asc(),
						S0_T04.ship_schd_no.asc(),
						S0_T03.ship_alloc_sts_no.asc()
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
							r.getStringNE("alloc_sno1")
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
						.add(MST_XFR_SCHD_R.class, r -> toCondition(
							r.getStringNE("xfr_schd_no")
						))
						.addSelect(m -> toArray(
							m.prov_basis_typ,
							m.prov_typ,
							m.ret_prov_basis_typ,
							m.ret_prov_typ,
							m.xfr_src_typ
						))
						.addMap((r, m) -> {
							r.setStringNE("xfr_src_typ", m.xfr_src_typ());
							r.setStringNE("prov_typ", m.prov_typ());
							r.setStringNE("prov_basis_typ", m.prov_basis_typ());
							r.setStringNE("ret_prov_typ", m.ret_prov_typ());
							r.setStringNE("ret_prov_basis_typ", m.ret_prov_basis_typ());
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
							r.getStringNE("ent_unit_cd")
						))
						.addSelect(m -> toArray(
							m.unit_cd,
							m.unit_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("ent_unit_nm", m.unit_nm());
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
							m.conv_base_qty,
							m.conv_qty,
							m.dec_place,
							m.rnd_typ,
							m.unit_dim,
							m.unit_wt
						))
						.addMap((r, m) -> {
							r.setNumberNE("ent_unit_conv_base_qty", m.conv_base_qty());
							r.setNumberNE("ent_unit_conv_qty", m.conv_qty());
							r.setNumberNE("ent_unit_dec_place", m.dec_place());
							r.setStringNE("ent_unit_rnd_typ", m.rnd_typ());
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
							m.conv_base_qty,
							m.conv_qty,
							m.dec_place,
							m.rnd_typ
						))
						.addMap((r, m) -> {
							r.setNumberNE("base_unit_conv_base_qty", m.conv_base_qty());
							r.setNumberNE("base_unit_conv_qty", m.conv_qty());
							r.setNumberNE("base_unit_dec_place", m.dec_place());
							r.setStringNE("base_unit_rnd_typ", m.rnd_typ());
					}),
					j -> j
						.add(MAM_UNIT_R.class, r -> toCondition(
							r.getStringNE("cont_fctr_unit_cd")
						))
						.addSelect(m -> toArray(
							m.unit_cd,
							m.unit_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("cont_fctr_unit_nm", m.unit_nm());
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
							r.setNumberNE("cont_unit_dec_place", m.dec_place());
							r.setStringNE("cont_unit_rnd_typ", m.rnd_typ());
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
							m.biz_rsn_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("rsn_nm", m.biz_rsn_nm());
					}),
					j -> j
						.add(MAM_ALLOC_GRP_R.class, r -> toCondition(
							r.getStringNE("alloc_grp_cd")
						))
						.addSelect(m -> toArray(
							m.alloc_grp_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("alloc_grp_nm", m.alloc_grp_nm());
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
						.add(MAM_UNIT_R.class, r -> toCondition(
							r.getStringNE("pckg_unit_cd")
						))
						.addSelect(m -> toArray(
							m.unit_cd,
							m.unit_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("pckg_unit_nm", m.unit_nm());
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
							m.conv_base_qty,
							m.conv_qty,
							m.dec_place
						))
						.addMap((r, m) -> {
							r.setNumberNE("pckg_unit_conv_base_qty", m.conv_base_qty());
							r.setNumberNE("pckg_unit_conv_qty", m.conv_qty());
							r.setNumberNE("pckg_unit_dec_place", m.dec_place());
					}),
					j -> j
						.add(MAM_UNIT_R.class, r -> toCondition(
							r.getStringNE("schd_unit_cd")
						))
						.addSelect(m -> toArray(
							m.dec_place,
							m.rnd_typ,
							m.unit_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("schd_unit_nm", m.unit_nm());
							r.setNumberNE("schd_unit_dec_place", m.dec_place());
							r.setStringNE("schd_unit_rnd_typ", m.rnd_typ());
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
	 * -- MSBEL1400_MST_SHIP_SCHD_Query_S02
	 */
	static MCQueryPlan MSBEL1400_MST_SHIP_SCHD_S02() {
		MST_SHIP_SCHD_R S0_T01 = MST_SHIP_SCHD_R.create("T01");
		MSW_SHIP_SCHD_KEY_R S0_W01 = MSW_SHIP_SCHD_KEY_R.create("W01");
		MST_SHIP_PR_R S0_T02 = MST_SHIP_PR_R.create("T02");
		MST_IV_MAP_R S0_T03 = MST_IV_MAP_R.create("T03");
		MST_IV_D_R S0_T04 = MST_IV_D_R.create("T04");
		MST_IV_R S0_T05 = MST_IV_R.create("T05");
		MST_SLO_D_R S0_T06 = MST_SLO_D_R.create("T06");
		MST_SLO_R S0_T07 = MST_SLO_R.create("T07");
		MAM_BP_R S0_M01 = MAM_BP_R.create("M01");
		MAM_LG_CTL_R S1_W51 = MAM_LG_CTL_R.create("W51");
		MAM_LOC_R S1_M51 = MAM_LOC_R.create("M51");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBEL1400_MST_SHIP_SCHD_Query_S02")
					.mainQuery()
					.selectDistinct(
						nvl(
							S0_T01.via_dlv_typ,
							S0_T02.via_dlv_typ
						).as("via_dlv_typ"),
						S0_T05.iv_no,
						S0_T05.iv_ship_flg,
						S0_T02.trd_ptn_typ,
						S0_T07.iv_no.as("slo_iv_no"),
						S0_M01.cst_iv_flg,
						cases()
							.when(S0_T02.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.PROV_RTN.value())))
								.then(value(false))
							.otherwise(
								subQuery()
								.select(max(S1_W51.iv_trd_flg))
								.from(
									S1_W51
									.leftOuterJoin(S1_M51).on(
										bracket(
											S1_M51.loc_cd.eq(S0_T02.dlv_id_cd)
										)
									)
								)
								.where(
									value(0).eq(value(0))
									.and(S1_W51.fr_lg_grp_cd.eq(S0_T01.ship_fr_lg_grp_cd))
									.and(S1_W51.to_lg_grp_cd.eq(S1_M51.lg_grp_cd))
								)
							).as("iv_trd_flg")
					)
					.from(
						S0_T01
						.innerJoin(S0_W01).on(
							bracket(
								S0_W01.ship_schd_no.eq(S0_T01.ship_schd_no)
							)
						)
						.innerJoin(S0_T02).on(
							bracket(
								S0_T02.ship_pr_no.eq(S0_T01.ship_pr_no)
							)
						)
						.leftOuterJoin(S0_T03).on(
							bracket(
								S0_T03.ship_schd_no.eq(S0_T01.ship_schd_no)
							)
						)
						.leftOuterJoin(S0_T04).on(
							bracket(
								S0_T04.iv_d_no.eq(S0_T03.iv_d_no)
							)
						)
						.leftOuterJoin(S0_T05).on(
							bracket(
								S0_T05.iv_mng_no.eq(S0_T04.iv_mng_no)
							)
						)
						.leftOuterJoin(S0_T06).on(
							bracket(
								S0_T06.slo_d_no.eq(S0_T02.slo_d_no)
							)
						)
						.leftOuterJoin(S0_T07).on(
							bracket(
								S0_T07.slo_no.eq(S0_T06.slo_no)
							)
						)
						.leftOuterJoin(S0_M01).on(
							bracket(
								S0_M01.bp_cd.eq(S0_T02.cst_cd)
							)
						)
					)
					.where(
						value(0).eq(value(0))
						.and(S0_T02.ship_inst_typ.neq(value(MAC_SHIP_INST_TYP.NON.value())))
					)
			);
	}
	
	/**
	 * -- MSBEL1400_MST_SHIP_SCHD_Query_S03
	 */
	static MCQueryPlan MSBEL1400_MST_SHIP_SCHD_S03() {
		MCTempView S0_T = createTempView("T");
		MST_IV_R S1_T01 = MST_IV_R.create("T01");
		MST_IV_D_R S1_T02 = MST_IV_D_R.create("T02");
		MST_IV_MAP_R S1_T99 = MST_IV_MAP_R.create("T99");
		MST_SHIP_SCHD_R S1_T04 = MST_SHIP_SCHD_R.create("T04");
		MST_SHIP_ALLOC_STS_R S1_T03 = MST_SHIP_ALLOC_STS_R.create("T03");
		MST_SHIP_PR_R S1_T05 = MST_SHIP_PR_R.create("T05");
		MAM_BP_R S1_M01 = MAM_BP_R.create("M01");
		MAM_LG_GRP_R S1_M02 = MAM_LG_GRP_R.create("M02");
		MAM_LG_GRP_R S1_M03 = MAM_LG_GRP_R.create("M03");
		MSVM_DLV_ID_R S1_M21 = MSVM_DLV_ID_R.create("M21");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBEL1400_MST_SHIP_SCHD_Query_S03")
					.mainQuery()
					.select(
						S0_T.pr(S1_T01.iv_no),
						S0_T.pr("ship_schd_dt"),
						S0_T.pr("ship_schd_hm"),
						S0_T.pr("dlv_schd_dt"),
						S0_T.pr("dlv_schd_hm"),
						S0_T.pr("trd_schd_dt"),
						S0_T.pr("ship_to_id_typ"),
						S0_T.pr("ship_to_id_cd"),
						S0_T.pr("ship_to_id_nm"),
						S0_T.pr("ship_to_zip_cd"),
						S0_T.pr("ship_to_addr1"),
						S0_T.pr("ship_to_addr2"),
						S0_T.pr("ship_to_addr3"),
						S0_T.pr("ship_to_addr4"),
						S0_T.pr("ship_to_cntct_dpt"),
						S0_T.pr("ship_to_cntct_psn"),
						S0_T.pr("ship_to_tel"),
						S0_T.pr("ship_to_fax"),
						S0_T.pr("ship_to_sundry_flg"),
						S0_T.pr("ship_to_lg_grp_cd"),
						S0_T.pr("ship_to_lg_grp_nm"),
						S0_T.pr(S1_T01.via_dlv_typ),
						S0_T.pr(S1_T04.ship_fr_lg_grp_cd),
						S0_T.pr("ship_fr_lg_grp_nm"),
						S0_T.pr("immd_dlv_prnt_flg"),
						S0_T.pr("immd_ship_adv_prnt_flg"),
						S0_T.pr("immd_pick_prnt_flg"),
						S0_T.pr("immd_ship_inst_prnt_flg"),
						nullValue().as("ship_term_cd"),
						nullValue().as("ship_term_nm"),
						nullValue().as("ship_wk_cd"),
						nullValue().as("ship_inst_prnt_flg"),
						S0_T.pr(S1_T02.trd_cd),
						S0_T.pr(S1_T01.trd_ptn_typ),
						S0_T.pr(S1_T05.upd_cntr)
					)
					.from(
						subQuery()
						.select(
							S1_T01.iv_no,
							trunc(
								max(S1_T04.ship_schd_tm),
								MCDateFmt.DD
							).as("ship_schd_dt"),
							max(S1_T04.ship_schd_tm).as("ship_schd_hm"),
							trunc(
								max(S1_T04.dlv_schd_tm),
								MCDateFmt.DD
							).as("dlv_schd_dt"),
							max(S1_T04.dlv_schd_tm).as("dlv_schd_hm"),
							S1_T01.trd_schd_dt.as("trd_schd_dt"),
							nvl2(
								S1_T01.tdlv_cd,
								value(MSC_SHIP_TO_ID_TYP.TDLV.value()),
								S1_T01.dlv_id_typ
							).as("ship_to_id_typ"),
							nvl(
								S1_T01.tdlv_cd,
								S1_T01.dlv_id_cd
							).as("ship_to_id_cd"),
							nvl2(
								S1_T01.tdlv_cd,
								decode(
									S1_T01.tdlv_sundry_flg,
									value(true),
									S1_T01.tdlv_nm,
									S1_M01.bp_nm
								),
								decode(
									S1_T01.dlv_sundry_flg,
									value(true),
									S1_T01.dlv_id_nm,
									S1_M21.dlv_id_nm
								)
							).as("ship_to_id_nm"),
							nvl2(
								S1_T01.tdlv_cd,
								S1_T01.tdlv_zip_cd,
								S1_T01.dlv_zip_cd
							).as("ship_to_zip_cd"),
							nvl2(
								S1_T01.tdlv_cd,
								S1_T01.tdlv_addr1,
								S1_T01.dlv_addr1
							).as("ship_to_addr1"),
							nvl2(
								S1_T01.tdlv_cd,
								S1_T01.tdlv_addr2,
								S1_T01.dlv_addr2
							).as("ship_to_addr2"),
							nvl2(
								S1_T01.tdlv_cd,
								S1_T01.tdlv_addr3,
								S1_T01.dlv_addr3
							).as("ship_to_addr3"),
							nvl2(
								S1_T01.tdlv_cd,
								S1_T01.tdlv_addr4,
								S1_T01.dlv_addr4
							).as("ship_to_addr4"),
							nvl2(
								S1_T01.tdlv_cd,
								S1_T01.tdlv_cntct_dpt,
								S1_T01.dlv_cntct_dpt
							).as("ship_to_cntct_dpt"),
							nvl2(
								S1_T01.tdlv_cd,
								S1_T01.tdlv_cntct_psn,
								S1_T01.dlv_cntct_psn
							).as("ship_to_cntct_psn"),
							nvl2(
								S1_T01.tdlv_cd,
								S1_T01.tdlv_tel,
								S1_T01.dlv_tel
							).as("ship_to_tel"),
							nvl2(
								S1_T01.tdlv_cd,
								S1_T01.tdlv_fax,
								S1_T01.dlv_fax
							).as("ship_to_fax"),
							nvl2(
								S1_T01.tdlv_cd,
								S1_T01.tdlv_sundry_flg,
								S1_T01.dlv_sundry_flg
							).as("ship_to_sundry_flg"),
							nvl2(
								S1_T01.tdlv_cd,
								S1_T01.tdlv_lg_grp_cd,
								nvl2(
									S1_T04.dlv_cd,
									S1_T04.dlv_lg_grp_cd,
									S1_T05.ship_to_lg_grp_cd
								)
							).as("ship_to_lg_grp_cd"),
							S1_M02.lg_grp_nm.as("ship_to_lg_grp_nm"),
							S1_T01.via_dlv_typ,
							S1_T04.ship_fr_lg_grp_cd,
							S1_M03.lg_grp_nm.as("ship_fr_lg_grp_nm"),
							S1_M03.ship_slip_flg.as("immd_dlv_prnt_flg"),
							S1_M03.ship_slip_flg.as("immd_ship_adv_prnt_flg"),
							S1_M03.pick_list_flg.as("immd_pick_prnt_flg"),
							S1_M03.ship_inst_flg.as("immd_ship_inst_prnt_flg"),
							S1_T02.trd_cd,
							S1_T01.trd_ptn_typ,
							S1_T02.disp_seq,
							S1_T05.upd_cntr
						)
						.from(
							S1_T01
							.innerJoin(S1_T02).on(
								bracket(
									S1_T02.iv_mng_no.eq(S1_T01.iv_mng_no)
								)
							)
							.innerJoin(S1_T99).on(
								bracket(
									S1_T99.iv_d_no.eq(S1_T02.iv_d_no)
								)
							)
							.innerJoin(S1_T04).on(
								bracket(
									S1_T04.ship_schd_no.eq(S1_T99.ship_schd_no)
								)
							)
							.innerJoin(S1_T03).on(
								bracket(
									S1_T03.ship_schd_no.eq(S1_T04.ship_schd_no)
								)
							)
							.innerJoin(S1_T05).on(
								bracket(
									S1_T05.ship_pr_no.eq(S1_T04.ship_pr_no)
								)
							)
							.leftOuterJoin(S1_M01).on(
								bracket(
									S1_M01.bp_cd.eq(S1_T01.tdlv_cd)
								)
							)
							.leftOuterJoin(S1_M02).on(
								bracket(
									S1_M02.lg_grp_cd.eq(nvl2(
											S1_T01.tdlv_cd,
											S1_T01.tdlv_lg_grp_cd,
											nvl2(
												S1_T04.dlv_cd,
												S1_T04.dlv_lg_grp_cd,
												S1_T05.ship_to_lg_grp_cd
											)
										)
									)
								)
							)
							.leftOuterJoin(S1_M03).on(
								bracket(
									S1_M03.lg_grp_cd.eq(S1_T04.ship_fr_lg_grp_cd)
								)
							)
							.leftOuterJoin(S1_M21).on(
								bracket(
									S1_M21.dlv_id_typ.eq(S1_T01.dlv_id_typ)
									.and(
										S1_M21.dlv_id_cd.eq(nvl(
												S1_T04.dlv_cd,
												S1_T05.dlv_id_cd
											)
										)
									)
								)
							)
						)
						.where(
							value(0).eq(value(0))
							.and(S1_T01.iv_no.eq(bind("iv_no")))
							.and(S1_T01.iv_ship_flg.eq(value(true)))
							.and(S1_T04.abort_flg.eq(value(false)))
							.and(S1_T05.ship_inst_typ.neq(value(MAC_SHIP_INST_TYP.NON.value())))
						)
						.groupBy(
							S1_T01.iv_no,
							S1_T01.trd_schd_dt,
							nvl2(
								S1_T01.tdlv_cd,
								value(MSC_SHIP_TO_ID_TYP.TDLV.value()),
								S1_T01.dlv_id_typ
							),
							nvl(
								S1_T01.tdlv_cd,
								S1_T01.dlv_id_cd
							),
							nvl2(
								S1_T01.tdlv_cd,
								decode(
									S1_T01.tdlv_sundry_flg,
									value(true),
									S1_T01.tdlv_nm,
									S1_M01.bp_nm
								),
								decode(
									S1_T01.dlv_sundry_flg,
									value(true),
									S1_T01.dlv_id_nm,
									S1_M21.dlv_id_nm
								)
							),
							nvl2(
								S1_T01.tdlv_cd,
								S1_T01.tdlv_zip_cd,
								S1_T01.dlv_zip_cd
							),
							nvl2(
								S1_T01.tdlv_cd,
								S1_T01.tdlv_addr1,
								S1_T01.dlv_addr1
							),
							nvl2(
								S1_T01.tdlv_cd,
								S1_T01.tdlv_addr2,
								S1_T01.dlv_addr2
							),
							nvl2(
								S1_T01.tdlv_cd,
								S1_T01.tdlv_addr3,
								S1_T01.dlv_addr3
							),
							nvl2(
								S1_T01.tdlv_cd,
								S1_T01.tdlv_addr4,
								S1_T01.dlv_addr4
							),
							nvl2(
								S1_T01.tdlv_cd,
								S1_T01.tdlv_cntct_dpt,
								S1_T01.dlv_cntct_dpt
							),
							nvl2(
								S1_T01.tdlv_cd,
								S1_T01.tdlv_cntct_psn,
								S1_T01.dlv_cntct_psn
							),
							nvl2(
								S1_T01.tdlv_cd,
								S1_T01.tdlv_tel,
								S1_T01.dlv_tel
							),
							nvl2(
								S1_T01.tdlv_cd,
								S1_T01.tdlv_fax,
								S1_T01.dlv_fax
							),
							nvl2(
								S1_T01.tdlv_cd,
								S1_T01.tdlv_sundry_flg,
								S1_T01.dlv_sundry_flg
							),
							nvl2(
								S1_T01.tdlv_cd,
								S1_T01.tdlv_lg_grp_cd,
								nvl2(
									S1_T04.dlv_cd,
									S1_T04.dlv_lg_grp_cd,
									S1_T05.ship_to_lg_grp_cd
								)
							),
							S1_M02.lg_grp_nm,
							S1_T01.via_dlv_typ,
							S1_T04.ship_fr_lg_grp_cd,
							S1_M03.lg_grp_nm,
							S1_M03.ship_slip_flg,
							S1_M03.ship_slip_flg,
							S1_M03.pick_list_flg,
							S1_M03.ship_inst_flg,
							S1_T02.trd_cd,
							S1_T01.trd_ptn_typ,
							S1_T02.disp_seq,
							S1_T05.upd_cntr
						).view(S0_T)
					)
					.orderBy(S0_T.pr(S1_T02.disp_seq).asc())
			);
	}
	
	/**
	 * -- MSBEL1400_MST_SHIP_SCHD_Query_S04
	 */
	static MCQueryPlan MSBEL1400_MST_SHIP_SCHD_S04() {
		MCTempView S0_T = createTempView("T");
		MSW_SHIP_SCHD_KEY_R S1_W01 = MSW_SHIP_SCHD_KEY_R.create("W01");
		MST_SHIP_ALLOC_STS_R S1_T03 = MST_SHIP_ALLOC_STS_R.create("T03");
		MST_SHIP_SCHD_R S1_T04 = MST_SHIP_SCHD_R.create("T04");
		MST_SHIP_PR_R S1_T05 = MST_SHIP_PR_R.create("T05");
		MAM_LG_GRP_R S1_M01 = MAM_LG_GRP_R.create("M01");
		MAM_LG_GRP_R S1_M02 = MAM_LG_GRP_R.create("M02");
		MAM_SHIP_TERM_R S1_M04 = MAM_SHIP_TERM_R.create("M04");
		MAM_SHIP_WK_R S1_M05 = MAM_SHIP_WK_R.create("M05");
		MAM_LG_CTL_R S1_M06 = MAM_LG_CTL_R.create("M06");
		MAM_LG_CTL_R S1_M07 = MAM_LG_CTL_R.create("M07");
		MAM_SHIP_WK_GRP_R S1_M08 = MAM_SHIP_WK_GRP_R.create("M08");
		MAM_SHIP_WK_GRP_R S1_M09 = MAM_SHIP_WK_GRP_R.create("M09");
		MSVM_SHIP_TO_ID_R S1_M25 = MSVM_SHIP_TO_ID_R.create("M25");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBEL1400_MST_SHIP_SCHD_Query_S04")
					.mainQuery()
					.select(
						nullValue().as("iv_no"),
						S0_T.pr("ship_schd_dt"),
						S0_T.pr("ship_schd_hm"),
						S0_T.pr("dlv_schd_dt"),
						S0_T.pr("dlv_schd_hm"),
						S0_T.pr("ship_to_id_typ"),
						S0_T.pr("ship_to_id_cd"),
						S0_T.pr("ship_to_id_nm"),
						S0_T.pr("ship_to_zip_cd"),
						S0_T.pr("ship_to_addr1"),
						S0_T.pr("ship_to_addr2"),
						S0_T.pr("ship_to_addr3"),
						S0_T.pr("ship_to_addr4"),
						S0_T.pr("ship_to_cntct_dpt"),
						S0_T.pr("ship_to_cntct_psn"),
						S0_T.pr("ship_to_tel"),
						S0_T.pr("ship_to_fax"),
						S0_T.pr("ship_to_sundry_flg"),
						S0_T.pr("ship_to_lg_grp_cd"),
						S0_T.pr("ship_to_lg_grp_nm"),
						S0_T.pr("via_dlv_typ"),
						S0_T.pr(S1_T04.ship_fr_lg_grp_cd),
						S0_T.pr("ship_fr_lg_grp_nm"),
						S0_T.pr("immd_dlv_prnt_flg"),
						S0_T.pr("immd_ship_adv_prnt_flg"),
						S0_T.pr("immd_pick_prnt_flg"),
						S0_T.pr("immd_ship_inst_prnt_flg"),
						S0_T.pr(S1_T04.ship_term_cd),
						S0_T.pr(S1_M04.ship_term_nm),
						S0_T.pr("ship_wk_grp_cd"),
						S0_T.pr("ship_wk_grp_nm"),
						S0_T.pr(S1_T04.ship_wk_cd),
						S0_T.pr(S1_M05.ship_wk_nm),
						S0_T.pr(S1_T05.trd_cd),
						S0_T.pr(S1_T05.trd_ptn_typ),
						S0_T.pr(S1_T05.upd_cntr)
					)
					.from(
						subQuery()
						.select(
							S1_T04.ship_schd_no,
							trunc(
								max(S1_T04.ship_schd_tm),
								MCDateFmt.DD
							).as("ship_schd_dt"),
							max(S1_T04.ship_schd_tm).as("ship_schd_hm"),
							trunc(
								max(S1_T04.dlv_schd_tm),
								MCDateFmt.DD
							).as("dlv_schd_dt"),
							max(S1_T04.dlv_schd_tm).as("dlv_schd_hm"),
							nvl2(
								S1_T04.tdlv_cd,
								value(MSC_SHIP_TO_ID_TYP.TDLV.value()),
								S1_T05.ship_to_id_typ
							).as("ship_to_id_typ"),
							nvl(
								nvl(
									S1_T04.tdlv_cd,
									decode(
										S1_T05.ship_to_id_typ,
										value(MSC_SHIP_TO_ID_TYP.DLV.value()),
										S1_T04.dlv_cd,
										nullValue()
									)
								),
								S1_T05.ship_to_id_cd
							).as("ship_to_id_cd"),
							nvl2(
								S1_T04.tdlv_cd,
								nvl(
									S1_T04.tdlv_nm,
									S1_M25.ship_to_id_nm
								),
								decode(
									S1_T05.ship_to_id_typ,
									value(MSC_SHIP_TO_ID_TYP.DLV.value()),
									nvl2(
										S1_T04.dlv_cd,
										nvl(
											S1_T04.dlv_nm,
											S1_M25.ship_to_id_nm
										),
										nvl(
											S1_T05.ship_to_id_nm,
											S1_M25.ship_to_id_nm
										)
									),
									nvl(
										S1_T05.ship_to_id_nm,
										S1_M25.ship_to_id_nm
									)
								)
							).as("ship_to_id_nm"),
							nvl2(
								S1_T04.tdlv_cd,
								S1_T04.tdlv_zip_cd,
								decode(
									S1_T05.ship_to_id_typ,
									value(MSC_SHIP_TO_ID_TYP.DLV.value()),
									nvl2(
										S1_T04.dlv_cd,
										S1_T04.dlv_zip_cd,
										S1_T05.ship_to_zip_cd
									),
									S1_T05.ship_to_zip_cd
								)
							).as("ship_to_zip_cd"),
							nvl2(
								S1_T04.tdlv_cd,
								S1_T04.tdlv_addr1,
								decode(
									S1_T05.ship_to_id_typ,
									value(MSC_SHIP_TO_ID_TYP.DLV.value()),
									nvl2(
										S1_T04.dlv_cd,
										S1_T04.dlv_addr1,
										S1_T05.ship_to_addr1
									),
									S1_T05.ship_to_addr1
								)
							).as("ship_to_addr1"),
							nvl2(
								S1_T04.tdlv_cd,
								S1_T04.tdlv_addr2,
								decode(
									S1_T05.ship_to_id_typ,
									value(MSC_SHIP_TO_ID_TYP.DLV.value()),
									nvl2(
										S1_T04.dlv_cd,
										S1_T04.dlv_addr2,
										S1_T05.ship_to_addr2
									),
									S1_T05.ship_to_addr2
								)
							).as("ship_to_addr2"),
							nvl2(
								S1_T04.tdlv_cd,
								S1_T04.tdlv_addr3,
								decode(
									S1_T05.ship_to_id_typ,
									value(MSC_SHIP_TO_ID_TYP.DLV.value()),
									nvl2(
										S1_T04.dlv_cd,
										S1_T04.dlv_addr3,
										S1_T05.ship_to_addr3
									),
									S1_T05.ship_to_addr3
								)
							).as("ship_to_addr3"),
							nvl2(
								S1_T04.tdlv_cd,
								S1_T04.tdlv_addr4,
								decode(
									S1_T05.ship_to_id_typ,
									value(MSC_SHIP_TO_ID_TYP.DLV.value()),
									nvl2(
										S1_T04.dlv_cd,
										S1_T04.dlv_addr4,
										S1_T05.ship_to_addr4
									),
									S1_T05.ship_to_addr4
								)
							).as("ship_to_addr4"),
							nvl2(
								S1_T04.tdlv_cd,
								S1_T04.tdlv_cntct_dpt,
								decode(
									S1_T05.ship_to_id_typ,
									value(MSC_SHIP_TO_ID_TYP.DLV.value()),
									nvl2(
										S1_T04.dlv_cd,
										S1_T04.dlv_cntct_dpt,
										S1_T05.ship_to_cntct_dpt
									),
									S1_T05.ship_to_cntct_dpt
								)
							).as("ship_to_cntct_dpt"),
							nvl2(
								S1_T04.tdlv_cd,
								S1_T04.tdlv_cntct_psn,
								decode(
									S1_T05.ship_to_id_typ,
									value(MSC_SHIP_TO_ID_TYP.DLV.value()),
									nvl2(
										S1_T04.dlv_cd,
										S1_T04.dlv_cntct_psn,
										S1_T05.ship_to_cntct_psn
									),
									S1_T05.ship_to_cntct_psn
								)
							).as("ship_to_cntct_psn"),
							nvl2(
								S1_T04.tdlv_cd,
								S1_T04.tdlv_tel,
								decode(
									S1_T05.ship_to_id_typ,
									value(MSC_SHIP_TO_ID_TYP.DLV.value()),
									nvl2(
										S1_T04.dlv_cd,
										S1_T04.dlv_tel,
										S1_T05.ship_to_tel
									),
									S1_T05.ship_to_tel
								)
							).as("ship_to_tel"),
							nvl2(
								S1_T04.tdlv_cd,
								S1_T04.tdlv_fax,
								decode(
									S1_T05.ship_to_id_typ,
									value(MSC_SHIP_TO_ID_TYP.DLV.value()),
									nvl2(
										S1_T04.dlv_cd,
										S1_T04.dlv_fax,
										S1_T05.ship_to_fax
									),
									S1_T05.ship_to_fax
								)
							).as("ship_to_fax"),
							nvl2(
								S1_T04.tdlv_cd,
								S1_T04.tdlv_sundry_flg,
								decode(
									S1_T05.ship_to_id_typ,
									value(MSC_SHIP_TO_ID_TYP.DLV.value()),
									nvl2(
										S1_T04.dlv_cd,
										S1_T04.dlv_sundry_flg,
										S1_T05.ship_to_sundry_flg
									),
									S1_T05.ship_to_sundry_flg
								)
							).as("ship_to_sundry_flg"),
							nvl2(
								S1_T04.tdlv_cd,
								S1_T04.tdlv_lg_grp_cd,
								decode(
									S1_T05.ship_to_id_typ,
									value(MSC_SHIP_TO_ID_TYP.DLV.value()),
									nvl2(
										S1_T04.dlv_cd,
										S1_T04.dlv_lg_grp_cd,
										S1_T05.ship_to_lg_grp_cd
									),
									S1_T05.ship_to_lg_grp_cd
								)
							).as("ship_to_lg_grp_cd"),
							S1_M01.lg_grp_nm.as("ship_to_lg_grp_nm"),
							nvl(
								S1_T04.via_dlv_typ,
								S1_T05.via_dlv_typ
							).as("via_dlv_typ"),
							S1_T04.ship_fr_lg_grp_cd,
							S1_M02.lg_grp_nm.as("ship_fr_lg_grp_nm"),
							S1_M02.ship_slip_flg.as("immd_dlv_prnt_flg"),
							S1_M02.ship_slip_flg.as("immd_ship_adv_prnt_flg"),
							S1_M02.pick_list_flg.as("immd_pick_prnt_flg"),
							S1_M02.ship_inst_flg.as("immd_ship_inst_prnt_flg"),
							S1_T04.ship_term_cd,
							S1_M04.ship_term_nm,
							nvl(
								S1_M06.ship_wk_grp_cd,
								S1_M07.ship_wk_grp_cd
							).as("ship_wk_grp_cd"),
							decode(
								S1_M06.ship_wk_grp_cd,
								nullValue(),
								S1_M09.ship_wk_grp_nm,
								S1_M08.ship_wk_grp_nm
							).as("ship_wk_grp_nm"),
							S1_T04.ship_wk_cd,
							S1_M05.ship_wk_nm,
							S1_T05.trd_cd,
							S1_T05.trd_ptn_typ,
							S1_T05.upd_cntr
						)
						.from(
							S1_W01
							.innerJoin(S1_T03).on(
								bracket(
									S1_T03.ship_schd_no.eq(S1_W01.ship_schd_no)
								)
							)
							.innerJoin(S1_T04).on(
								bracket(
									S1_T04.ship_schd_no.eq(S1_T03.ship_schd_no)
								)
							)
							.innerJoin(S1_T05).on(
								bracket(
									S1_T05.ship_pr_no.eq(S1_T04.ship_pr_no)
								)
							)
							.leftOuterJoin(S1_M01).on(
								bracket(
									S1_M01.lg_grp_cd.eq(nvl2(
											S1_T04.tdlv_cd,
											S1_T04.tdlv_lg_grp_cd,
											decode(
												S1_T05.ship_to_id_typ,
												value(MSC_SHIP_TO_ID_TYP.DLV.value()),
												nvl2(
													S1_T04.dlv_cd,
													S1_T04.dlv_lg_grp_cd,
													S1_T05.ship_to_lg_grp_cd
												),
												S1_T05.ship_to_lg_grp_cd
											)
										)
									)
								)
							)
							.leftOuterJoin(S1_M02).on(
								bracket(
									S1_M02.lg_grp_cd.eq(S1_T04.ship_fr_lg_grp_cd)
								)
							)
							.leftOuterJoin(S1_M04).on(
								bracket(
									S1_M04.ship_term_cd.eq(S1_T04.ship_term_cd)
								)
							)
							.leftOuterJoin(S1_M05).on(
								bracket(
									S1_M05.ship_wk_cd.eq(S1_T04.ship_wk_cd)
								)
							)
							.leftOuterJoin(S1_M06).on(
								bracket(
									S1_M06.fr_lg_grp_cd.eq(S1_T04.ship_fr_lg_grp_cd)
									.and(S1_M06.to_lg_grp_cd.eq(S1_T05.ship_to_lg_grp_cd))
									.and(S1_M06.ship_term_cd.eq(S1_T04.ship_term_cd))
								)
							)
							.leftOuterJoin(S1_M07).on(
								bracket(
									S1_M07.fr_lg_grp_cd.eq(S1_T04.ship_fr_lg_grp_cd)
									.and(S1_M07.to_lg_grp_cd.eq(S1_T05.ship_to_lg_grp_cd))
									.and(S1_M07.ship_term_cd.eq(value(MAC_STR.NULL_VAL.value())))
								)
							)
							.leftOuterJoin(S1_M08).on(
								bracket(
									S1_M08.ship_wk_grp_cd.eq(S1_M06.ship_wk_grp_cd)
								)
							)
							.leftOuterJoin(S1_M09).on(
								bracket(
									S1_M09.ship_wk_grp_cd.eq(S1_M07.ship_wk_grp_cd)
								)
							)
							.leftOuterJoin(S1_M25).on(
								bracket(
									S1_M25.ship_to_id_typ.eq(S1_T05.ship_to_id_typ)
									.and(
										S1_M25.ship_to_id_cd.eq(nvl(
												nvl(
													S1_T04.tdlv_cd,
													decode(
														S1_T05.ship_to_id_typ,
														value(MSC_SHIP_TO_ID_TYP.DLV.value()),
														S1_T04.dlv_cd,
														nullValue()
													)
												),
												S1_T05.ship_to_id_cd
											)
										)
									)
								)
							)
						)
						.where(
							value(0).eq(value(0))
							.and(S1_T05.ship_inst_typ.neq(value(MAC_SHIP_INST_TYP.NON.value())))
							.and(S1_T04.abort_flg.eq(value(false)))
						)
						.groupBy(
							S1_T04.ship_schd_no,
							nvl2(
								S1_T04.tdlv_cd,
								value(MSC_SHIP_TO_ID_TYP.TDLV.value()),
								S1_T05.ship_to_id_typ
							),
							nvl(
								nvl(
									S1_T04.tdlv_cd,
									decode(
										S1_T05.ship_to_id_typ,
										value(MSC_SHIP_TO_ID_TYP.DLV.value()),
										S1_T04.dlv_cd,
										nullValue()
									)
								),
								S1_T05.ship_to_id_cd
							),
							nvl2(
								S1_T04.tdlv_cd,
								nvl(
									S1_T04.tdlv_nm,
									S1_M25.ship_to_id_nm
								),
								decode(
									S1_T05.ship_to_id_typ,
									value(MSC_SHIP_TO_ID_TYP.DLV.value()),
									nvl2(
										S1_T04.dlv_cd,
										nvl(
											S1_T04.dlv_nm,
											S1_M25.ship_to_id_nm
										),
										nvl(
											S1_T05.ship_to_id_nm,
											S1_M25.ship_to_id_nm
										)
									),
									nvl(
										S1_T05.ship_to_id_nm,
										S1_M25.ship_to_id_nm
									)
								)
							),
							nvl2(
								S1_T04.tdlv_cd,
								S1_T04.tdlv_zip_cd,
								decode(
									S1_T05.ship_to_id_typ,
									value(MSC_SHIP_TO_ID_TYP.DLV.value()),
									nvl2(
										S1_T04.dlv_cd,
										S1_T04.dlv_zip_cd,
										S1_T05.ship_to_zip_cd
									),
									S1_T05.ship_to_zip_cd
								)
							),
							nvl2(
								S1_T04.tdlv_cd,
								S1_T04.tdlv_addr1,
								decode(
									S1_T05.ship_to_id_typ,
									value(MSC_SHIP_TO_ID_TYP.DLV.value()),
									nvl2(
										S1_T04.dlv_cd,
										S1_T04.dlv_addr1,
										S1_T05.ship_to_addr1
									),
									S1_T05.ship_to_addr1
								)
							),
							nvl2(
								S1_T04.tdlv_cd,
								S1_T04.tdlv_addr2,
								decode(
									S1_T05.ship_to_id_typ,
									value(MSC_SHIP_TO_ID_TYP.DLV.value()),
									nvl2(
										S1_T04.dlv_cd,
										S1_T04.dlv_addr2,
										S1_T05.ship_to_addr2
									),
									S1_T05.ship_to_addr2
								)
							),
							nvl2(
								S1_T04.tdlv_cd,
								S1_T04.tdlv_addr3,
								decode(
									S1_T05.ship_to_id_typ,
									value(MSC_SHIP_TO_ID_TYP.DLV.value()),
									nvl2(
										S1_T04.dlv_cd,
										S1_T04.dlv_addr3,
										S1_T05.ship_to_addr3
									),
									S1_T05.ship_to_addr3
								)
							),
							nvl2(
								S1_T04.tdlv_cd,
								S1_T04.tdlv_addr4,
								decode(
									S1_T05.ship_to_id_typ,
									value(MSC_SHIP_TO_ID_TYP.DLV.value()),
									nvl2(
										S1_T04.dlv_cd,
										S1_T04.dlv_addr4,
										S1_T05.ship_to_addr4
									),
									S1_T05.ship_to_addr4
								)
							),
							nvl2(
								S1_T04.tdlv_cd,
								S1_T04.tdlv_cntct_dpt,
								decode(
									S1_T05.ship_to_id_typ,
									value(MSC_SHIP_TO_ID_TYP.DLV.value()),
									nvl2(
										S1_T04.dlv_cd,
										S1_T04.dlv_cntct_dpt,
										S1_T05.ship_to_cntct_dpt
									),
									S1_T05.ship_to_cntct_dpt
								)
							),
							nvl2(
								S1_T04.tdlv_cd,
								S1_T04.tdlv_cntct_psn,
								decode(
									S1_T05.ship_to_id_typ,
									value(MSC_SHIP_TO_ID_TYP.DLV.value()),
									nvl2(
										S1_T04.dlv_cd,
										S1_T04.dlv_cntct_psn,
										S1_T05.ship_to_cntct_psn
									),
									S1_T05.ship_to_cntct_psn
								)
							),
							nvl2(
								S1_T04.tdlv_cd,
								S1_T04.tdlv_tel,
								decode(
									S1_T05.ship_to_id_typ,
									value(MSC_SHIP_TO_ID_TYP.DLV.value()),
									nvl2(
										S1_T04.dlv_cd,
										S1_T04.dlv_tel,
										S1_T05.ship_to_tel
									),
									S1_T05.ship_to_tel
								)
							),
							nvl2(
								S1_T04.tdlv_cd,
								S1_T04.tdlv_fax,
								decode(
									S1_T05.ship_to_id_typ,
									value(MSC_SHIP_TO_ID_TYP.DLV.value()),
									nvl2(
										S1_T04.dlv_cd,
										S1_T04.dlv_fax,
										S1_T05.ship_to_fax
									),
									S1_T05.ship_to_fax
								)
							),
							nvl2(
								S1_T04.tdlv_cd,
								S1_T04.tdlv_sundry_flg,
								decode(
									S1_T05.ship_to_id_typ,
									value(MSC_SHIP_TO_ID_TYP.DLV.value()),
									nvl2(
										S1_T04.dlv_cd,
										S1_T04.dlv_sundry_flg,
										S1_T05.ship_to_sundry_flg
									),
									S1_T05.ship_to_sundry_flg
								)
							),
							nvl2(
								S1_T04.tdlv_cd,
								S1_T04.tdlv_lg_grp_cd,
								decode(
									S1_T05.ship_to_id_typ,
									value(MSC_SHIP_TO_ID_TYP.DLV.value()),
									nvl2(
										S1_T04.dlv_cd,
										S1_T04.dlv_lg_grp_cd,
										S1_T05.ship_to_lg_grp_cd
									),
									S1_T05.ship_to_lg_grp_cd
								)
							),
							S1_M01.lg_grp_nm,
							nvl(
								S1_T04.via_dlv_typ,
								S1_T05.via_dlv_typ
							),
							S1_T04.ship_fr_lg_grp_cd,
							S1_M02.lg_grp_nm,
							S1_M02.ship_slip_flg,
							S1_M02.ship_slip_flg,
							S1_M02.pick_list_flg,
							S1_M02.ship_inst_flg,
							S1_T04.ship_term_cd,
							S1_M04.ship_term_nm,
							nvl(
								S1_M06.ship_wk_grp_cd,
								S1_M07.ship_wk_grp_cd
							),
							decode(
								S1_M06.ship_wk_grp_cd,
								nullValue(),
								S1_M09.ship_wk_grp_nm,
								S1_M08.ship_wk_grp_nm
							),
							S1_T04.ship_wk_cd,
							S1_M05.ship_wk_nm,
							S1_T05.trd_cd,
							S1_T05.trd_ptn_typ,
							S1_T05.upd_cntr
						).view(S0_T)
					)
					.orderBy(S0_T.pr(S1_T04.ship_schd_no).asc())
			);
	}
}