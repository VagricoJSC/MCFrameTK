package mcframe.serverMSBE.MSBEL1020;

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
	 * -- MSBEL1020_MST_XFR_ACT_D_Query_S01
	 */
	static MCQueryPlan MSBEL1020_MST_XFR_ACT_D_S01() {
		MST_XFR_ACT_D_R S0_T01 = MST_XFR_ACT_D_R.create("T01");
		MST_XFR_ACT_R S0_T02 = MST_XFR_ACT_R.create("T02");
		MST_XFR_ALLOC_STS_R S0_T04 = MST_XFR_ALLOC_STS_R.create("T04");
		MST_PROV_SCHD_R S0_T05 = MST_PROV_SCHD_R.create("T05");
		MST_PROV_SCHD_R S0_T06 = MST_PROV_SCHD_R.create("T06");
		MST_PROV_ACT_R S0_T07 = MST_PROV_ACT_R.create("T07");
		MST_PROV_ACT_R S0_T08 = MST_PROV_ACT_R.create("T08");
		MAM_LOC_R S0_M01 = MAM_LOC_R.create("M01");
		MAM_ITM_R S0_M05 = MAM_ITM_R.create("M05");
		MAM_SUNDRY_ITM_R S0_M06 = MAM_SUNDRY_ITM_R.create("M06");
		MAM_DPT_R S0_M14 = MAM_DPT_R.create("M14");
		MAM_LOC_R S0_M15 = MAM_LOC_R.create("M15");
		MST_DLV_SLIP_R S0_T11 = MST_DLV_SLIP_R.create("T10");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBEL1020_MST_XFR_ACT_D_Query_S01")
					.mainQuery()
					.select(
						S0_T04.pr_sts_typ,
						S0_T01.xfr_act_d_no,
						S0_T01.xfr_act_no,
						S0_T01.xfr_alloc_sts_no,
						S0_T01.xfr_inst_d_no,
						S0_T01.gi_loc_cd,
						S0_M01.loc_nm.as("gi_loc_nm"),
						S0_M01.str_ln_tgt_flg.as("gi_str_ln_tgt_flg"),
						S0_M01.site_cd.as("gi_site_cd"),
						S0_M01.sppl_cd.as("gi_sppl_cd"),
						S0_T01.gi_str_ln_cd,
						S0_T01.gi_stk_arrv_bp_cd,
						S0_T01.gr_str_ln_cd,
						S0_T01.itm_cd,
						S0_T01.itm_sub1,
						S0_T01.itm_sub2,
						S0_T01.itm_sub3,
						nvl(
							S0_M06.itm_nm,
							S0_M05.itm_nm
						).as("itm_nm"),
						S0_M05.asset_mng_typ,
						S0_M05.lot_mng_typ,
						S0_M05.sublot_mng_typ,
						S0_T01.lot_no,
						S0_T01.sublot_no,
						S0_M05.sno1_mng_typ,
						S0_M05.sno2_mng_typ,
						S0_M05.sno3_mng_typ,
						S0_M05.sno4_mng_typ,
						S0_M05.ver_flg,
						S0_T04.sno1,
						S0_T04.sno2,
						S0_T04.sno3,
						S0_T04.sno4,
						S0_T04.sno1_null_flg,
						S0_T04.sno2_null_flg,
						S0_T04.sno3_null_flg,
						S0_T04.sno4_null_flg,
						S0_T01.sno1.as("alloc_sno1"),
						S0_T01.sno2.as("alloc_sno2"),
						S0_T01.sno3.as("alloc_sno3"),
						S0_T01.sno4.as("alloc_sno4"),
						S0_T01.gd_cd,
						S0_T01.quality_typ,
						S0_T01.stk_insp_typ,
						S0_T01.stk_id_typ,
						S0_T01.stk_bp_cd,
						S0_T01.trd_unit_cd,
						S0_T01.trd_unit_qty.as("trd_unit_qty"),
						S0_T04.abort_flg,
						cases()
							.when(
								S0_T04.xfr_inst_d_no.eq(value(MAC_STR.NULL_VAL.value()))
								.or(S0_T04.xfr_inst_d_no.isNull())
							)
								.then(value(0))
							.otherwise(S0_T04.base_unit_qty).as("base_unit_inst_qty"),
						cases()
							.when(
								S0_T04.xfr_schd_no.eq(value(MAC_STR.NULL_VAL.value()))
								.or(S0_T04.xfr_schd_no.isNull())
							)
								.then(value(0))
							.otherwise(S0_T04.base_unit_qty).as("base_unit_schd_qty"),
						S0_T01.base_unit_qty.as("base_unit_act_qty"),
						S0_T01.base_unit_cd,
						S0_M05.cont_fctr_flg,
						S0_M05.cont_fctr_unit_cd,
						S0_M05.cont_fctr_dec_place,
						S0_M05.cont_fctr_rnd_typ,
						S0_M05.std_cont_fctr,
						S0_T01.rsn_cd,
						S0_T01.bd_dpt_cd,
						S0_M14.dpt_nm.as("bd_dpt_nm"),
						S0_T01.skip_chk_ship_flg,
						S0_T01.io_schd_pr_no,
						S0_T01.dlv_slip_no,
						S0_T01.dlv_slip_d_no,
						S0_T01.disp_seq,
						S0_T01.intr_d_rmrks,
						S0_T01.trd_d_rmrks,
						S0_T01.sub_char1,
						S0_T01.sub_char2,
						S0_T01.sub_char3,
						S0_T01.ins_usr_id,
						S0_T01.ins_usr_nm,
						S0_T01.ins_ts,
						S0_T01.ins_func_id,
						S0_T01.upd_cntr.as("act_d_upd_cntr"),
						S0_T01.upd_usr_id,
						S0_T01.upd_usr_nm,
						S0_T01.upd_ts,
						S0_T01.upd_func_id,
						S0_T01.upd_srv_req_no,
						S0_T04.upd_cntr.as("alloc_sts_upd_cntr"),
						S0_T05.prov_schd_no,
						S0_T06.prov_schd_no.as("ret_prov_schd_no"),
						nvl(
							S0_T07.prov_typ,
							decode(
								S0_M01.sppl_cd, S0_M15.sppl_cd,
								nullValue(),
								nvl2(
									S0_M15.sppl_cd,
									value(MAC_PROV_TYP.ONR_PROV.value()),
									nullValue()
								)
							)
						).as("prov_typ"),
						nvl(
							S0_T07.prov_basis_typ,
							decode(
								S0_M01.sppl_cd, S0_M15.sppl_cd,
								nullValue(),
								nvl2(
									S0_M15.sppl_cd,
									decode(
										S0_T07.prov_typ,
										value(MAC_PROV_TYP.FFR_PROV.value()),
										nullValue(),
										value(MAC_PROV_BASIS_TYP.INPT.value())
									),
									nullValue()
								)
							)
						).as("prov_basis_typ"),
						nvl(
							S0_T08.prov_typ,
							decode(
								S0_M01.sppl_cd, S0_M15.sppl_cd,
								nullValue(),
								nvl2(
									S0_M01.sppl_cd,
									value(MAC_PROV_TYP.ONR_PROV.value()),
									nullValue()
								)
							)
						).as("ret_prov_typ"),
						nvl(
							S0_T08.prov_basis_typ,
							decode(
								S0_M01.sppl_cd, S0_M15.sppl_cd,
								nullValue(),
								nvl2(
									S0_M01.sppl_cd,
									decode(
										S0_T08.prov_typ,
										value(MAC_PROV_TYP.FFR_PROV.value()),
										nullValue(),
										value(MAC_PROV_BASIS_TYP.INPT.value())
									),
									nullValue()
								)
							)
						).as("ret_prov_basis_typ"),
						S0_T07.prov_act_no,
						S0_T08.prov_act_no.as("ret_prov_act_no"),
						S0_T01.base_dlv_slip_no,
						S0_T01.base_prov_act_no,
						S0_T01.base_ac_dt,
						S0_T01.wms_flg,
						S0_T01.ext_sys_cd,
						S0_T01.ext_xfr_act_no,
						// this field is appended by sql coverter.
						S0_T04.xfr_schd_no.as("join_xfr_schd_no_"),
						// this field is appended by sql coverter.
						S0_T02.gr_loc_cd.as("join_gr_loc_cd_")
						,S0_T11.slip_prnt_flg,
						S0_T01.base_unit_qty.as("base_unit_qty_bef"),
						S0_T04.act_qty.as("base_unit_act_qty_sum")
					)
					.from(
						S0_T01
						.innerJoin(S0_T02).on(
							bracket(
								S0_T02.xfr_act_no.eq(S0_T01.xfr_act_no)
							)
						)
						.leftOuterJoin(S0_T04).on(
							bracket(
								S0_T01.xfr_alloc_sts_no.eq(S0_T04.xfr_alloc_sts_no)
							)
						)
						.leftOuterJoin(S0_T05).on(
							bracket(
								S0_T01.xfr_alloc_sts_no.eq(S0_T05.prov_src_schd_no1)
								.and(S0_T05.prov_src_schd_typ.eq(value(MSC_PROV_SRC_SCHD_TYP.XFR.value())))
								.and(S0_T05.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.PROV.value())))
							)
						)
						.leftOuterJoin(S0_T06).on(
							bracket(
								S0_T01.xfr_alloc_sts_no.eq(S0_T06.prov_src_schd_no1)
								.and(S0_T06.prov_src_schd_typ.eq(value(MSC_PROV_SRC_SCHD_TYP.XFR.value())))
								.and(S0_T06.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.PROV_RTN.value())))
							)
						)
						.leftOuterJoin(S0_T07).on(
							bracket(
								S0_T01.xfr_act_d_no.eq(S0_T07.prov_src_act_no)
								.and(S0_T07.prov_src_act_typ.eq(value(MSC_PROV_SRC_ACT_TYP.XFR.value())))
								.and(S0_T07.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.PROV.value())))
								.and(S0_T07.slip_sts_typ.eq(value(MAC_SLIP_STS_TYP.CRT.value())))
							)
						)
						.leftOuterJoin(S0_T08).on(
							bracket(
								S0_T01.xfr_act_d_no.eq(S0_T08.prov_src_act_no)
								.and(S0_T08.prov_src_act_typ.eq(value(MSC_PROV_SRC_ACT_TYP.XFR.value())))
								.and(S0_T08.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.PROV_RTN.value())))
								.and(S0_T08.slip_sts_typ.eq(value(MAC_SLIP_STS_TYP.CRT.value())))
							)
						)
						.leftOuterJoin(S0_T11).on(
							bracket(
								S0_T01.dlv_slip_no.eq(S0_T11.dlv_slip_no)
								.and(S0_T01.dlv_slip_seq.eq(S0_T11.dlv_slip_seq))
							)
						)
						.leftOuterJoin(S0_M01).on(
							bracket(
								S0_M01.loc_cd.eq(S0_T01.gi_loc_cd)
							)
						)
						.leftOuterJoin(S0_M05).on(
							bracket(
								S0_M05.itm_cd.eq(S0_T01.itm_cd)
								.and(S0_M05.itm_sub1.eq(S0_T01.itm_sub1))
								.and(S0_M05.itm_sub2.eq(S0_T01.itm_sub2))
								.and(S0_M05.itm_sub3.eq(S0_T01.itm_sub3))
							)
						)
						.leftOuterJoin(S0_M06).on(
							bracket(
								S0_M06.itm_cd.eq(S0_T01.itm_cd)
								.and(S0_M06.itm_sub1.eq(S0_T01.itm_sub1))
								.and(S0_M06.itm_sub2.eq(S0_T01.itm_sub2))
								.and(S0_M06.itm_sub3.eq(S0_T01.itm_sub3))
								.and(S0_M06.sno1.eq(S0_T01.sno1))
								.and(S0_M06.sno2.eq(S0_T01.sno2))
								.and(S0_M06.sno3.eq(S0_T01.sno3))
								.and(S0_M06.sno4.eq(S0_T01.sno4))
							)
						)
						.leftOuterJoin(S0_M14).on(
							bracket(
								S0_M14.dpt_cd.eq(S0_T01.bd_dpt_cd)
								.and(S0_T02.xfr_dt.between(S0_M14.st_dt, S0_M14.end_dt))
							)
						)
						.leftOuterJoin(S0_M15).on(
							bracket(
								S0_M15.loc_cd.eq(S0_T02.gr_loc_cd)
							)
						)
					)
					.where(
						value(0).eq(value(0))
						.and(S0_T01.xfr_act_no.eq(bind("srch_tgt_no")))
					)
					.orderBy(S0_T01.disp_seq.asc())
			)
			.setJoinInfo(
				joinInfo(
					j -> j
						.add(MST_XFR_SCHD_R.class, r -> toCondition(
							r.getStringNE("join_xfr_schd_no_")
						))
						.addSelect(m -> toArray(
							m.xfr_schd_no,
							m.xfr_src_no,
							m.xfr_src_typ
						))
						.addMap((r, m) -> {
							r.setStringNE("xfr_schd_no", m.xfr_schd_no());
							r.setStringNE("xfr_src_typ", m.xfr_src_typ());
							r.setStringNE("xfr_src_no", m.xfr_src_no());
					}),
					j -> j
						.add(MAM_STR_LN_R.class, r -> toCondition(
							r.getStringNE("gi_loc_cd"),
							r.getStringNE("gi_str_ln_cd")
						))
						.addSelect(m -> toArray(
							m.str_ln_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("gi_str_ln_nm", m.str_ln_nm());
					}),
					j -> j
						.add(MAM_BP_R.class, r -> toCondition(
							r.getStringNE("gi_stk_arrv_bp_cd")
						))
						.addSelect(m -> toArray(
							m.bp_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("gi_stk_arrv_bp_nm", m.bp_nm());
					}),
					j -> j
						.add(MAM_STR_LN_R.class, r -> toCondition(
							r.getStringNE("join_gr_loc_cd_"),
							r.getStringNE("gr_str_ln_cd")
						))
						.addSelect(m -> toArray(
							m.str_ln_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("gr_str_ln_nm", m.str_ln_nm());
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
							r.setNumberNE("trd_unit_conv_base_qty", m.conv_base_qty());
							r.setNumberNE("trd_unit_conv_qty", m.conv_qty());
							r.setNumberNE("trd_unit_dec_place", m.dec_place());
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
						.add(MAVM_ITM_UNIT_R.class, r -> toCondition(
							r.getStringNE("itm_cd"),
							r.getStringNE("itm_sub1"),
							r.getStringNE("itm_sub2"),
							r.getStringNE("itm_sub3"),
							r.getStringNE("base_unit_cd")
						))
						.addSelect(m -> toArray(
							m.conv_qty,
							m.dec_place,
							m.rnd_typ
						))
						.addMap((r, m) -> {
							r.setNumberNE("base_unit_conv_qty", m.conv_qty());
							r.setNumberNE("base_unit_dec_place", m.dec_place());
							r.setStringNE("base_unit_rnd_typ", m.rnd_typ());
					}),
					j -> j
						.add(MAM_BIZ_RSN_R.class, r -> toCondition(
							r.getStringNE("rsn_cd")
						))
						.addSelect(m -> toArray(
							m.acxfr_gi_flg,
							m.biz_rsn_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("rsn_nm", m.biz_rsn_nm());
							r.setBooleanNE("acxfr_gi_flg", m.acxfr_gi_flg());
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
						.add(MSVT_LOT_LIST_R.class, r -> toCondition(
							r.getStringNE("itm_cd"),
							r.getStringNE("itm_sub1"),
							r.getStringNE("itm_sub2"),
							r.getStringNE("itm_sub3"),
							r.getStringNE("lot_no"),
							r.getStringNE("sublot_no")
						))
						.addSelect(m -> toArray(
							m.act_cont_fctr,
							m.ver_no
						))
						.addMap((r, m) -> {
							r.setStringNE("ver_no", m.ver_no());
							r.setNumberNE("act_cont_fctr", m.act_cont_fctr());
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
	 * -- MSBEL1020_MST_XFR_ACT_Query_S01
	 */
	static MCQueryPlan MSBEL1020_MST_XFR_ACT_S01() {
		MST_XFR_ACT_R S0_T01 = MST_XFR_ACT_R.create("T01");
		MAM_DPT_R S0_M07 = MAM_DPT_R.create("M07");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBEL1020_MST_XFR_ACT_Query_S01")
					.mainQuery()
					.select(
						S0_T01.xfr_act_no,
						S0_T01.xfr_inst_no,
						S0_T01.trd_cd,
						S0_T01.trd_ptn_typ,
						S0_T01.wg_cd,
						S0_T01.lg_grp_cd,
						S0_T01.gr_loc_cd,
						S0_T01.xfr_dt,
						S0_T01.ac_dt,
						S0_T01.act_usr_cd,
						S0_T01.act_dpt_cd,
						S0_M07.dpt_nm.as("act_dpt_nm"),
						S0_T01.dlv_prnt_flg,
						S0_T01.dlv_prnt_tm,
						S0_T01.intr_rmrks,
						S0_T01.trd_rmrks,
						S0_T01.sub_char1,
						S0_T01.sub_char2,
						S0_T01.sub_char3,
						S0_T01.ins_usr_id,
						S0_T01.ins_usr_nm,
						S0_T01.ins_ts,
						S0_T01.ins_func_id,
						S0_T01.upd_cntr.as("act_upd_cntr"),
						S0_T01.upd_usr_id,
						S0_T01.upd_usr_nm,
						S0_T01.upd_ts,
						S0_T01.upd_func_id,
						S0_T01.upd_srv_req_no
					)
					.from(
						S0_T01
						.leftOuterJoin(S0_M07).on(
							bracket(
								S0_T01.act_dpt_cd.eq(S0_M07.dpt_cd)
								.and(S0_T01.xfr_dt.between(S0_M07.st_dt, S0_M07.end_dt))
							)
						)
					)
					.where(
						value(0).eq(value(0))
						.and(S0_T01.xfr_act_no.eq(bind("srch_tgt_no")))
					)
			)
			.setJoinInfo(
				joinInfo(
					j -> j
						.add(MST_XFR_INST_R.class, r -> toCondition(
							r.getStringNE("xfr_inst_no")
						))
						.addSelect(m -> toArray(
							m.upd_cntr
						))
						.addMap((r, m) -> {
							r.setNumberNE("inst_upd_cntr", m.upd_cntr());
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
						.add(MAM_LG_GRP_R.class, r -> toCondition(
							r.getStringNE("lg_grp_cd")
						))
						.addSelect(m -> toArray(
							m.lg_grp_nm,
							m.ship_slip_act_flg
						))
						.addMap((r, m) -> {
							r.setStringNE("lg_grp_nm", m.lg_grp_nm());
							r.setBooleanNE("immd_dlv_prnt_flg", m.ship_slip_act_flg());
					}),
					j -> j
						.add(MAM_LOC_R.class, r -> toCondition(
							r.getStringNE("gr_loc_cd")
						))
						.addSelect(m -> toArray(
							m.loc_nm,
							m.sppl_cd,
							m.str_ln_tgt_flg
						))
						.addMap((r, m) -> {
							r.setStringNE("gr_loc_nm", m.loc_nm());
							r.setBooleanNE("gr_str_ln_tgt_flg", m.str_ln_tgt_flg());
							r.setStringNE("sppl_cd", m.sppl_cd());
					}),
					j -> j
						.add(MAM_USR_R.class, r -> toCondition(
							r.getStringNE("act_usr_cd")
						))
						.addSelect(m -> toArray(
							m.usr_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("act_usr_nm", m.usr_nm());
					}),
					j -> j
						.add(MAM_BP_R.class, r -> toCondition(
							r.getStringNE("sppl_cd")
						))
						.addSelect(m -> toArray(
							m.cur_cd,
							m.onr_prsppl_flg,
							m.prov_basis_typ
						))
						.addMap((r, m) -> {
							r.setStringNE("cur_cd", m.cur_cd());
							r.setBooleanNE("onr_prsppl_flg", m.onr_prsppl_flg());
							r.setStringNE("prov_basis_typ", m.prov_basis_typ());
					})
				)
			);
	}
	
	/**
	 * -- MSBEL1020_MST_XFR_ALLOC_STS_Query_S01
	 */
	static MCQueryPlan MSBEL1020_MST_XFR_ALLOC_STS_S01() {
		MST_XFR_SCHD_R S0_T01 = MST_XFR_SCHD_R.create("T01");
		MAVM_RD_LG_GRP_R S0_M06 = MAVM_RD_LG_GRP_R.create("M06");
		MAM_ITM_LG_GRP_R S0_M08 = MAM_ITM_LG_GRP_R.create("M08");
		MAM_LOC_R S0_M09 = MAM_LOC_R.create("M09");
		MAVM_RD_LOC_R S0_M10 = MAVM_RD_LOC_R.create("M10");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBEL1020_MST_XFR_ALLOC_STS_Query_S01")
					.mainQuery()
					.select(
						nullValue().as("xfr_inst_no"),
						S0_T01.trd_cd,
						S0_T01.trd_ptn_typ,
						S0_T01.gr_wg_cd.as("wg_cd"),
						S0_T01.gr_lg_grp_cd.as("lg_grp_cd"),
						S0_T01.gr_loc_cd,
						nullValue().as("dlv_prnt_flg"),
						nullValue().as("dlv_prnt_tm"),
						nullValue().as("intr_rmrks"),
						nullValue().as("trd_rmrks"),
						S0_T01.sub_char1,
						S0_T01.sub_char2,
						S0_T01.sub_char3,
						S0_T01.ins_usr_id,
						S0_T01.ins_usr_nm,
						S0_T01.ins_ts,
						S0_T01.ins_func_id,
						S0_T01.upd_cntr.as("inst_upd_cntr"),
						S0_T01.upd_usr_id,
						S0_T01.upd_usr_nm,
						S0_T01.upd_ts,
						S0_T01.upd_func_id,
						S0_T01.upd_srv_req_no
					)
					.from(
						S0_T01
						.leftOuterJoin(S0_M06).on(
							bracket(
								S0_T01.gi_lg_grp_cd.eq(S0_M06.lg_grp_cd)
							)
						)
						.leftOuterJoin(S0_M08).on(
							bracket(
								S0_M08.itm_cd.eq(S0_T01.itm_cd)
								.and(S0_M08.itm_sub1.eq(S0_T01.itm_sub1))
								.and(S0_M08.itm_sub2.eq(S0_T01.itm_sub2))
								.and(S0_M08.itm_sub3.eq(S0_T01.itm_sub3))
								.and(S0_M08.lg_grp_cd.eq(S0_T01.gi_lg_grp_cd))
							)
						)
						.leftOuterJoin(S0_M09).on(
							bracket(
								S0_M09.lg_grp_cd.eq(S0_T01.gi_lg_grp_cd)
								.and(S0_M09.lg_def_flg.eq(value(true)))
								.and(S0_M09.del_flg.eq(value(false)))
							)
						)
						.leftOuterJoin(S0_M10).on(
							bracket(
								S0_M10.loc_cd.eq(coalesce(
										S0_T01.gi_loc_cd,
										S0_M08.lg_def_loc_cd,
										S0_M09.loc_cd
									)
								)
							)
						)
					)
					.where(
						value(0).eq(value(0))
						.and(S0_T01.xfr_schd_no.eq(bind("srch_tgt_no")))
						.and(MAC_SHIP_INST_TYP$IS_NON(S0_T01.ship_inst_typ).eq(value(true)))
						.and(
							S0_M06.lg_grp_cd.isNotNull()
							.or(S0_M10.loc_cd.isNotNull())
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
						.add(MAM_LG_GRP_R.class, r -> toCondition(
							r.getStringNE("lg_grp_cd")
						))
						.addSelect(m -> toArray(
							m.lg_grp_nm,
							m.ship_slip_act_flg
						))
						.addMap((r, m) -> {
							r.setStringNE("lg_grp_nm", m.lg_grp_nm());
							r.setBooleanNE("immd_dlv_prnt_flg", m.ship_slip_act_flg());
					}),
					j -> j
						.add(MAM_LOC_R.class, r -> toCondition(
							r.getStringNE("gr_loc_cd")
						))
						.addSelect(m -> toArray(
							m.loc_nm,
							m.sppl_cd,
							m.str_ln_tgt_flg
						))
						.addMap((r, m) -> {
							r.setStringNE("gr_loc_nm", m.loc_nm());
							r.setBooleanNE("gr_str_ln_tgt_flg", m.str_ln_tgt_flg());
							r.setStringNE("sppl_cd", m.sppl_cd());
					}),
					j -> j
						.add(MAM_BP_R.class, r -> toCondition(
							r.getStringNE("sppl_cd")
						))
						.addSelect(m -> toArray(
							m.cur_cd,
							m.onr_prsppl_flg,
							m.prov_basis_typ
						))
						.addMap((r, m) -> {
							r.setStringNE("cur_cd", m.cur_cd());
							r.setBooleanNE("onr_prsppl_flg", m.onr_prsppl_flg());
							r.setStringNE("prov_basis_typ", m.prov_basis_typ());
					})
				)
			);
	}
	
	/**
	 * -- MSBEL1020_MST_XFR_ALLOC_STS_Query_S02
	 */
	static MCQueryPlan MSBEL1020_MST_XFR_ALLOC_STS_S02() {
		MST_XFR_SCHD_R S0_T04 = MST_XFR_SCHD_R.create("T04");
		MST_XFR_ALLOC_STS_R S0_T01 = MST_XFR_ALLOC_STS_R.create("T01");
		MST_PROV_SCHD_R S0_T05 = MST_PROV_SCHD_R.create("T05");
		MST_PROV_SCHD_R S0_T06 = MST_PROV_SCHD_R.create("T06");
		MSVT_LOT_LIST_R S0_T07 = MSVT_LOT_LIST_R.create("T07");
		MAM_ITM_R S0_M05 = MAM_ITM_R.create("M05");
		MAM_SUNDRY_ITM_R S0_M06 = MAM_SUNDRY_ITM_R.create("M06");
		MAM_DPT_R S0_M14 = MAM_DPT_R.create("M14");
		MST_XFR_ACT_D_R S1_W01 = MST_XFR_ACT_D_R.create("W01");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBEL1020_MST_XFR_ALLOC_STS_Query_S02")
					.mainQuery()
					.select(
						S0_T01.pr_sts_typ,
						S0_T01.xfr_inst_d_no,
						S0_T01.xfr_alloc_sts_no,
						S0_T04.xfr_schd_no,
						S0_T04.xfr_src_typ,
						S0_T04.xfr_src_no,
						S0_T01.gi_loc_cd,
						S0_T01.gi_str_ln_cd,
						S0_T01.gi_stk_arrv_bp_cd,
						S0_T01.gr_loc_cd,
						S0_T01.gr_str_ln_cd,
						S0_T04.itm_cd,
						S0_T04.itm_sub1,
						S0_T04.itm_sub2,
						S0_T04.itm_sub3,
						nvl(
							S0_M06.itm_nm,
							S0_M05.itm_nm
						).as("itm_nm"),
						S0_M05.asset_mng_typ,
						S0_M05.lot_mng_typ,
						S0_M05.sublot_mng_typ,
						S0_T01.lot_no,
						S0_T01.sublot_no,
						nvl(
							S0_T07.ver_no,
							S0_T01.ver_no
						).as("ver_no"),
						S0_M05.sno1_mng_typ,
						S0_M05.sno2_mng_typ,
						S0_M05.sno3_mng_typ,
						S0_M05.sno4_mng_typ,
						S0_M05.ver_flg,
						S0_T01.sno1,
						S0_T01.sno2,
						S0_T01.sno3,
						S0_T01.sno4,
						S0_T01.sno1_null_flg,
						S0_T01.sno2_null_flg,
						S0_T01.sno3_null_flg,
						S0_T01.sno4_null_flg,
						S0_T01.alloc_sno1,
						S0_T01.alloc_sno2,
						S0_T01.alloc_sno3,
						S0_T01.alloc_sno4,
						S0_T01.gd_cd,
						S0_T01.quality_typ,
						S0_T01.stk_insp_typ,
						S0_T01.stk_id_typ,
						S0_T01.stk_bp_cd,
						S0_T01.trd_unit_cd,
						cases()
							.when(
								S0_T01.xfr_inst_d_no.eq(value(MAC_STR.NULL_VAL.value()))
								.or(S0_T01.xfr_inst_d_no.isNull())
							)
								.then(value(0))
							.otherwise(S0_T01.base_unit_qty).as("base_unit_inst_qty"),
						S0_T01.base_unit_qty.as("base_unit_schd_qty"),
						nvl(
							bracket(
								subQuery()
								.select(sum(S1_W01.base_unit_qty))
								.from(S1_W01)
								.where(
									value(0).eq(value(0))
									.and(S1_W01.xfr_alloc_sts_no.eq(S0_T01.xfr_alloc_sts_no))
									.and(S1_W01.xfr_inst_d_no.eq(S0_T01.xfr_inst_d_no))
								)
							),
							value(0)
						).as("base_unit_act_qty"),
						S0_T01.base_unit_cd,
						S0_M05.cont_fctr_flg,
						S0_M05.cont_fctr_unit_cd,
						S0_M05.cont_fctr_dec_place,
						S0_M05.cont_fctr_rnd_typ,
						S0_T07.act_cont_fctr,
						S0_M05.std_cont_fctr,
						S0_T01.rsn_cd,
						S0_T01.bd_dpt_cd,
						S0_M14.dpt_nm.as("bd_dpt_nm"),
						S0_M05.skip_chk_ship_flg,
						S0_T01.io_schd_pr_no,
						S0_T01.dlv_slip_no,
						S0_T01.dlv_slip_d_no,
						S0_T05.prov_schd_no,
						S0_T06.prov_schd_no.as("ret_prov_schd_no"),
						S0_T01.prov_typ,
						S0_T01.prov_basis_typ,
						S0_T01.ret_prov_typ,
						S0_T01.ret_prov_basis_typ,
						S0_T04.base_dlv_slip_no,
						S0_T04.base_prov_act_no,
						S0_T04.base_ac_dt,
						S0_T01.disp_seq,
						S0_T01.trd_d_rmrks,
						S0_T01.sub_char1,
						S0_T01.sub_char2,
						S0_T01.sub_char3,
						S0_T01.ins_usr_id,
						S0_T01.ins_usr_nm,
						S0_T01.ins_ts,
						S0_T01.ins_func_id,
						S0_T01.upd_cntr.as("alloc_sts_upd_cntr"),
						S0_T01.upd_usr_id,
						S0_T01.upd_usr_nm,
						S0_T01.upd_ts,
						S0_T01.upd_func_id,
						S0_T01.upd_srv_req_no,
						value(0).as("base_unit_qty_bef"),
						S0_T01.act_qty.as("base_unit_act_qty_sum")
					)
					.from(
						S0_T04
						.innerJoin(S0_T01).on(
							bracket(
								S0_T01.xfr_schd_no.eq(S0_T04.xfr_schd_no)
							)
						)
						.leftOuterJoin(S0_T05).on(
							bracket(
								S0_T01.xfr_alloc_sts_no.eq(S0_T05.prov_src_schd_no1)
								.and(S0_T05.prov_src_schd_typ.eq(value(MSC_PROV_SRC_SCHD_TYP.XFR.value())))
								.and(S0_T05.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.PROV.value())))
							)
						)
						.leftOuterJoin(S0_T06).on(
							bracket(
								S0_T01.xfr_alloc_sts_no.eq(S0_T06.prov_src_schd_no1)
								.and(S0_T06.prov_src_schd_typ.eq(value(MSC_PROV_SRC_SCHD_TYP.XFR.value())))
								.and(S0_T06.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.PROV_RTN.value())))
							)
						)
						.leftOuterJoin(S0_T07).on(
							bracket(
								S0_T04.itm_cd.eq(S0_T07.itm_cd)
								.and(S0_T04.itm_sub1.eq(S0_T07.itm_sub1))
								.and(S0_T04.itm_sub2.eq(S0_T07.itm_sub2))
								.and(S0_T04.itm_sub3.eq(S0_T07.itm_sub3))
								.and(S0_T01.lot_no.eq(S0_T07.lot_no))
								.and(S0_T01.sublot_no.eq(S0_T07.sublot_no))
							)
						)
						.leftOuterJoin(S0_M05).on(
							bracket(
								S0_M05.itm_cd.eq(S0_T04.itm_cd)
								.and(S0_M05.itm_sub1.eq(S0_T04.itm_sub1))
								.and(S0_M05.itm_sub2.eq(S0_T04.itm_sub2))
								.and(S0_M05.itm_sub3.eq(S0_T04.itm_sub3))
							)
						)
						.leftOuterJoin(S0_M06).on(
							bracket(
								S0_M06.itm_cd.eq(S0_T04.itm_cd)
								.and(S0_M06.itm_sub1.eq(S0_T04.itm_sub1))
								.and(S0_M06.itm_sub2.eq(S0_T04.itm_sub2))
								.and(S0_M06.itm_sub3.eq(S0_T04.itm_sub3))
								.and(S0_M06.sno1.eq(S0_T01.sno1))
								.and(S0_M06.sno2.eq(S0_T01.sno2))
								.and(S0_M06.sno3.eq(S0_T01.sno3))
								.and(S0_M06.sno4.eq(S0_T01.sno4))
							)
						)
						.leftOuterJoin(S0_M14).on(
							bracket(
								S0_M14.dpt_cd.eq(S0_T01.bd_dpt_cd)
								.and(S0_T04.rcpt_dt.between(S0_M14.st_dt, S0_M14.end_dt))
							)
						)
					)
					.where(
						value(0).eq(value(0))
						.and(S0_T04.xfr_schd_no.eq(bind("srch_tgt_no")))
						.and(S0_T01.cmpl_flg.eq(value(false)))
					)
					.orderBy(S0_T01.disp_seq.asc())
			)
			.setJoinInfo(
				joinInfo(
					j -> j
						.add(MAM_LOC_R.class, r -> toCondition(
							r.getStringNE("gi_loc_cd")
						))
						.addSelect(m -> toArray(
							m.loc_nm,
							m.site_cd,
							m.sppl_cd,
							m.str_ln_tgt_flg
						))
						.addMap((r, m) -> {
							r.setStringNE("gi_loc_nm", m.loc_nm());
							r.setStringNE("gi_site_cd", m.site_cd());
							r.setStringNE("gi_sppl_cd", m.sppl_cd());
							r.setBooleanNE("gi_str_ln_tgt_flg", m.str_ln_tgt_flg());
					}),
					j -> j
						.add(MAM_STR_LN_R.class, r -> toCondition(
							r.getStringNE("gi_loc_cd"),
							r.getStringNE("gi_str_ln_cd")
						))
						.addSelect(m -> toArray(
							m.str_ln_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("gi_str_ln_nm", m.str_ln_nm());
					}),
					j -> j
						.add(MAM_BP_R.class, r -> toCondition(
							r.getStringNE("gi_stk_arrv_bp_cd")
						))
						.addSelect(m -> toArray(
							m.bp_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("gi_stk_arrv_bp_nm", m.bp_nm());
					}),
					j -> j
						.add(MAM_STR_LN_R.class, r -> toCondition(
							r.getStringNE("gr_loc_cd"),
							r.getStringNE("gr_str_ln_cd")
						))
						.addSelect(m -> toArray(
							m.str_ln_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("gr_str_ln_nm", m.str_ln_nm());
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
							r.setNumberNE("trd_unit_conv_base_qty", m.conv_base_qty());
							r.setNumberNE("trd_unit_conv_qty", m.conv_qty());
							r.setNumberNE("trd_unit_dec_place", m.dec_place());
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
						.add(MAVM_ITM_UNIT_R.class, r -> toCondition(
							r.getStringNE("itm_cd"),
							r.getStringNE("itm_sub1"),
							r.getStringNE("itm_sub2"),
							r.getStringNE("itm_sub3"),
							r.getStringNE("base_unit_cd")
						))
						.addSelect(m -> toArray(
							m.conv_qty,
							m.dec_place,
							m.rnd_typ
						))
						.addMap((r, m) -> {
							r.setNumberNE("base_unit_conv_qty", m.conv_qty());
							r.setNumberNE("base_unit_dec_place", m.dec_place());
							r.setStringNE("base_unit_rnd_typ", m.rnd_typ());
					}),
					j -> j
						.add(MAM_BIZ_RSN_R.class, r -> toCondition(
							r.getStringNE("rsn_cd")
						))
						.addSelect(m -> toArray(
							m.acxfr_gi_flg,
							m.biz_rsn_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("rsn_nm", m.biz_rsn_nm());
							r.setBooleanNE("acxfr_gi_flg", m.acxfr_gi_flg());
					}),
					j -> j
						.add(MAM_LOC_R.class, r -> toCondition(
							r.getStringNE("gr_loc_cd")
						))
						.addSelect(m -> toArray(
							m.loc_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("gr_loc_nm", m.loc_nm());
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
	 * -- MSBEL1020_MST_XFR_ALLOC_STS_Query_S03
	 */
	static MCQueryPlan MSBEL1020_MST_XFR_ALLOC_STS_S03() {
		MST_XFR_INST_D_R S0_T04 = MST_XFR_INST_D_R.create("T04");
		MST_XFR_ALLOC_STS_R S0_T01 = MST_XFR_ALLOC_STS_R.create("T01");
		MST_PROV_SCHD_R S0_T05 = MST_PROV_SCHD_R.create("T05");
		MST_PROV_SCHD_R S0_T06 = MST_PROV_SCHD_R.create("T06");
		MSVT_LOT_LIST_R S0_T08 = MSVT_LOT_LIST_R.create("T08");
		MST_XFR_INST_R S0_T09 = MST_XFR_INST_R.create("T09");
		MAM_LOC_R S0_M01 = MAM_LOC_R.create("M01");
		MAM_ITM_R S0_M05 = MAM_ITM_R.create("M05");
		MAM_SUNDRY_ITM_R S0_M06 = MAM_SUNDRY_ITM_R.create("M06");
		MAM_DPT_R S0_M14 = MAM_DPT_R.create("M14");
		MAM_LOC_R S0_M15 = MAM_LOC_R.create("M15");
		MST_XFR_ACT_D_R S1_W01 = MST_XFR_ACT_D_R.create("W01");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBEL1020_MST_XFR_ALLOC_STS_Query_S03")
					.mainQuery()
					.select(
						S0_T01.pr_sts_typ,
						S0_T01.xfr_inst_d_no,
						S0_T01.xfr_alloc_sts_no,
						S0_T01.gi_loc_cd,
						S0_M01.loc_nm.as("gi_loc_nm"),
						S0_M01.site_cd.as("gi_site_cd"),
						S0_M01.sppl_cd.as("gi_sppl_cd"),
						S0_M01.str_ln_tgt_flg.as("gi_str_ln_tgt_flg"),
						S0_T01.gi_str_ln_cd,
						S0_T01.gi_stk_arrv_bp_cd,
						S0_T01.gr_loc_cd,
						S0_M15.loc_nm.as("gr_loc_nm"),
						S0_T01.gr_str_ln_cd,
						S0_T04.itm_cd,
						S0_T04.itm_sub1,
						S0_T04.itm_sub2,
						S0_T04.itm_sub3,
						nvl(
							S0_M06.itm_nm,
							S0_M05.itm_nm
						).as("itm_nm"),
						S0_M05.asset_mng_typ,
						S0_M05.lot_mng_typ,
						S0_M05.sublot_mng_typ,
						S0_T01.lot_no,
						S0_T01.sublot_no,
						nvl(
							S0_T08.ver_no,
							S0_T01.ver_no
						).as("ver_no"),
						S0_M05.sno1_mng_typ,
						S0_M05.sno2_mng_typ,
						S0_M05.sno3_mng_typ,
						S0_M05.sno4_mng_typ,
						S0_M05.ver_flg,
						S0_T01.sno1_null_flg,
						S0_T01.sno2_null_flg,
						S0_T01.sno3_null_flg,
						S0_T01.sno4_null_flg,
						S0_T01.sno1,
						S0_T01.sno2,
						S0_T01.sno3,
						S0_T01.sno4,
						S0_T01.sno1_null_flg,
						S0_T01.sno2_null_flg,
						S0_T01.sno3_null_flg,
						S0_T01.sno4_null_flg,
						S0_T01.alloc_sno1,
						S0_T01.alloc_sno2,
						S0_T01.alloc_sno3,
						S0_T01.alloc_sno4,
						S0_T01.gd_cd,
						S0_T01.quality_typ,
						S0_T01.stk_insp_typ,
						S0_T01.stk_id_typ,
						S0_T01.stk_bp_cd,
						S0_T01.trd_unit_cd,
						S0_T01.base_unit_qty.as("base_unit_inst_qty"),
						cases()
							.when(
								S0_T01.xfr_schd_no.eq(value(MAC_STR.NULL_VAL.value()))
								.or(S0_T01.xfr_schd_no.isNull())
							)
								.then(value(0))
							.otherwise(S0_T01.base_unit_qty).as("base_unit_schd_qty"),
						nvl(
							bracket(
								subQuery()
								.select(sum(S1_W01.base_unit_qty))
								.from(S1_W01)
								.where(
									value(0).eq(value(0))
									.and(S1_W01.xfr_alloc_sts_no.eq(S0_T01.xfr_alloc_sts_no))
									.and(S1_W01.xfr_inst_d_no.eq(S0_T01.xfr_inst_d_no))
								)
							),
							value(0)
						).as("base_unit_act_qty"),
						S0_T01.base_unit_cd,
						S0_M05.cont_fctr_flg,
						S0_M05.cont_fctr_unit_cd,
						S0_M05.cont_fctr_dec_place,
						S0_M05.cont_fctr_rnd_typ,
						S0_T08.act_cont_fctr,
						S0_M05.std_cont_fctr,
						S0_T01.rsn_cd,
						S0_T01.bd_dpt_cd,
						S0_M14.dpt_nm.as("bd_dpt_nm"),
						S0_M05.skip_chk_ship_flg,
						S0_T01.io_schd_pr_no,
						S0_T01.dlv_slip_no,
						S0_T01.dlv_slip_d_no,
						S0_T05.prov_schd_no,
						S0_T06.prov_schd_no.as("ret_prov_schd_no"),
						nvl(
							S0_T05.prov_typ,
							decode(
								S0_M01.sppl_cd, S0_M15.sppl_cd,
								nullValue(),
								nvl2(
									S0_M15.sppl_cd,
									value(MAC_PROV_TYP.ONR_PROV.value()),
									nullValue()
								)
							)
						).as("prov_typ"),
						nvl(
							S0_T05.prov_basis_typ,
							decode(
								S0_M01.sppl_cd, S0_M15.sppl_cd,
								nullValue(),
								nvl2(
									S0_M15.sppl_cd,
									decode(
										S0_T05.prov_typ,
										value(MAC_PROV_TYP.FFR_PROV.value()),
										nullValue(),
										value(MAC_PROV_BASIS_TYP.INPT.value())
									),
									nullValue()
								)
							)
						).as("prov_basis_typ"),
						nvl(
							S0_T06.prov_typ,
							decode(
								S0_M01.sppl_cd, S0_M15.sppl_cd,
								nullValue(),
								nvl2(
									S0_M01.sppl_cd,
									value(MAC_PROV_TYP.ONR_PROV.value()),
									nullValue()
								)
							)
						).as("ret_prov_typ"),
						nvl(
							S0_T06.prov_basis_typ,
							decode(
								S0_M01.sppl_cd, S0_M15.sppl_cd,
								nullValue(),
								nvl2(
									S0_M01.sppl_cd,
									decode(
										S0_T06.prov_typ,
										value(MAC_PROV_TYP.FFR_PROV.value()),
										nullValue(),
										value(MAC_PROV_BASIS_TYP.INPT.value())
									),
									nullValue()
								)
							)
						).as("ret_prov_basis_typ"),
						S0_T04.base_dlv_slip_no,
						S0_T04.base_prov_act_no,
						S0_T04.base_ac_dt,
						S0_T01.trd_d_rmrks,
						S0_T01.disp_seq,
						S0_T01.sub_char1,
						S0_T01.sub_char2,
						S0_T01.sub_char3,
						S0_T01.ins_usr_id,
						S0_T01.ins_usr_nm,
						S0_T01.ins_ts,
						S0_T01.ins_func_id,
						S0_T01.upd_cntr.as("alloc_sts_upd_cntr"),
						S0_T01.upd_usr_id,
						S0_T01.upd_usr_nm,
						S0_T01.upd_ts,
						S0_T01.upd_func_id,
						S0_T01.upd_srv_req_no,
						// this field is appended by sql coverter.
						S0_T01.xfr_schd_no.as("join_xfr_schd_no_"),
						value(0).as("base_unit_qty_bef"),
						S0_T01.act_qty.as("base_unit_act_qty_sum")
					)
					.from(
						S0_T04
						.innerJoin(S0_T01).on(
							bracket(
								S0_T04.xfr_inst_d_no.eq(S0_T01.xfr_inst_d_no)
							)
						)
						.leftOuterJoin(S0_T05).on(
							bracket(
								S0_T01.xfr_alloc_sts_no.eq(S0_T05.prov_src_schd_no1)
								.and(S0_T05.prov_src_schd_typ.eq(value(MSC_PROV_SRC_SCHD_TYP.XFR.value())))
								.and(S0_T05.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.PROV.value())))
							)
						)
						.leftOuterJoin(S0_T06).on(
							bracket(
								S0_T01.xfr_alloc_sts_no.eq(S0_T06.prov_src_schd_no1)
								.and(S0_T06.prov_src_schd_typ.eq(value(MSC_PROV_SRC_SCHD_TYP.XFR.value())))
								.and(S0_T06.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.PROV_RTN.value())))
							)
						)
						.leftOuterJoin(S0_T08).on(
							bracket(
								S0_T04.itm_cd.eq(S0_T08.itm_cd)
								.and(S0_T04.itm_sub1.eq(S0_T08.itm_sub1))
								.and(S0_T04.itm_sub2.eq(S0_T08.itm_sub2))
								.and(S0_T04.itm_sub3.eq(S0_T08.itm_sub3))
								.and(S0_T01.lot_no.eq(S0_T08.lot_no))
								.and(S0_T01.sublot_no.eq(S0_T08.sublot_no))
							)
						)
						.innerJoin(S0_T09).on(
							bracket(
								S0_T04.xfr_inst_no.eq(S0_T09.xfr_inst_no)
							)
						)
						.leftOuterJoin(S0_M01).on(
							bracket(
								S0_M01.loc_cd.eq(S0_T01.gi_loc_cd)
							)
						)
						.leftOuterJoin(S0_M05).on(
							bracket(
								S0_M05.itm_cd.eq(S0_T04.itm_cd)
								.and(S0_M05.itm_sub1.eq(S0_T04.itm_sub1))
								.and(S0_M05.itm_sub2.eq(S0_T04.itm_sub2))
								.and(S0_M05.itm_sub3.eq(S0_T04.itm_sub3))
							)
						)
						.leftOuterJoin(S0_M06).on(
							bracket(
								S0_M06.itm_cd.eq(S0_T04.itm_cd)
								.and(S0_M06.itm_sub1.eq(S0_T04.itm_sub1))
								.and(S0_M06.itm_sub2.eq(S0_T04.itm_sub2))
								.and(S0_M06.itm_sub3.eq(S0_T04.itm_sub3))
								.and(S0_M06.sno1.eq(S0_T01.sno1))
								.and(S0_M06.sno2.eq(S0_T01.sno2))
								.and(S0_M06.sno3.eq(S0_T01.sno3))
								.and(S0_M06.sno4.eq(S0_T01.sno4))
							)
						)
						.leftOuterJoin(S0_M14).on(
							bracket(
								S0_M14.dpt_cd.eq(S0_T01.bd_dpt_cd)
								.and(S0_T09.xfr_inst_dt.between(S0_M14.st_dt, S0_M14.end_dt))
							)
						)
						.leftOuterJoin(S0_M15).on(
							bracket(
								S0_M15.loc_cd.eq(S0_T01.gr_loc_cd)
							)
						)
					)
					.where(
						value(0).eq(value(0))
						.and(S0_T04.xfr_inst_no.eq(bind("srch_tgt_no")))
						.and(S0_T01.cmpl_flg.eq(value(false)))
					)
					.orderBy(S0_T01.disp_seq.asc())
			)
			.setJoinInfo(
				joinInfo(
					j -> j
						.add(MST_XFR_SCHD_R.class, r -> toCondition(
							r.getStringNE("join_xfr_schd_no_")
						))
						.addSelect(m -> toArray(
							m.xfr_schd_no,
							m.xfr_src_no,
							m.xfr_src_typ
						))
						.addMap((r, m) -> {
							r.setStringNE("xfr_schd_no", m.xfr_schd_no());
							r.setStringNE("xfr_src_typ", m.xfr_src_typ());
							r.setStringNE("xfr_src_no", m.xfr_src_no());
					}),
					j -> j
						.add(MAM_STR_LN_R.class, r -> toCondition(
							r.getStringNE("gi_loc_cd"),
							r.getStringNE("gi_str_ln_cd")
						))
						.addSelect(m -> toArray(
							m.str_ln_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("gi_str_ln_nm", m.str_ln_nm());
					}),
					j -> j
						.add(MAM_BP_R.class, r -> toCondition(
							r.getStringNE("gi_stk_arrv_bp_cd")
						))
						.addSelect(m -> toArray(
							m.bp_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("gi_stk_arrv_bp_nm", m.bp_nm());
					}),
					j -> j
						.add(MAM_STR_LN_R.class, r -> toCondition(
							r.getStringNE("gr_loc_cd"),
							r.getStringNE("gr_str_ln_cd")
						))
						.addSelect(m -> toArray(
							m.str_ln_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("gr_str_ln_nm", m.str_ln_nm());
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
							r.setNumberNE("trd_unit_conv_base_qty", m.conv_base_qty());
							r.setNumberNE("trd_unit_conv_qty", m.conv_qty());
							r.setNumberNE("trd_unit_dec_place", m.dec_place());
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
						.add(MAVM_ITM_UNIT_R.class, r -> toCondition(
							r.getStringNE("itm_cd"),
							r.getStringNE("itm_sub1"),
							r.getStringNE("itm_sub2"),
							r.getStringNE("itm_sub3"),
							r.getStringNE("base_unit_cd")
						))
						.addSelect(m -> toArray(
							m.conv_qty,
							m.dec_place,
							m.rnd_typ
						))
						.addMap((r, m) -> {
							r.setNumberNE("base_unit_conv_qty", m.conv_qty());
							r.setNumberNE("base_unit_dec_place", m.dec_place());
							r.setStringNE("base_unit_rnd_typ", m.rnd_typ());
					}),
					j -> j
						.add(MAM_BIZ_RSN_R.class, r -> toCondition(
							r.getStringNE("rsn_cd")
						))
						.addSelect(m -> toArray(
							m.acxfr_gi_flg,
							m.biz_rsn_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("rsn_nm", m.biz_rsn_nm());
							r.setBooleanNE("acxfr_gi_flg", m.acxfr_gi_flg());
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
	 * -- MSBEL1020_MST_XFR_INST_Query_S01
	 */
	static MCQueryPlan MSBEL1020_MST_XFR_INST_S01() {
		MST_XFR_INST_R S0_T01 = MST_XFR_INST_R.create("T01");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBEL1020_MST_XFR_INST_Query_S01")
					.mainQuery()
					.select(
						S0_T01.xfr_inst_no,
						S0_T01.trd_cd,
						S0_T01.trd_ptn_typ,
						S0_T01.wg_cd,
						S0_T01.lg_grp_cd,
						S0_T01.gr_loc_cd,
						nullValue().as("dlv_prnt_flg"),
						nullValue().as("dlv_prnt_tm"),
						nullValue().as("intr_rmrks"),
						S0_T01.trd_rmrks,
						S0_T01.sub_char1,
						S0_T01.sub_char2,
						S0_T01.sub_char3,
						S0_T01.ins_usr_id,
						S0_T01.ins_usr_nm,
						S0_T01.ins_ts,
						S0_T01.ins_func_id,
						S0_T01.upd_cntr.as("inst_upd_cntr"),
						S0_T01.upd_usr_id,
						S0_T01.upd_usr_nm,
						S0_T01.upd_ts,
						S0_T01.upd_func_id,
						S0_T01.upd_srv_req_no
					)
					.from(S0_T01)
					.where(
						value(0).eq(value(0))
						.and(S0_T01.xfr_inst_no.eq(bind("srch_tgt_no")))
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
						.add(MAM_LG_GRP_R.class, r -> toCondition(
							r.getStringNE("lg_grp_cd")
						))
						.addSelect(m -> toArray(
							m.lg_grp_nm,
							m.ship_slip_act_flg
						))
						.addMap((r, m) -> {
							r.setStringNE("lg_grp_nm", m.lg_grp_nm());
							r.setBooleanNE("immd_dlv_prnt_flg", m.ship_slip_act_flg());
					}),
					j -> j
						.add(MAM_LOC_R.class, r -> toCondition(
							r.getStringNE("gr_loc_cd")
						))
						.addSelect(m -> toArray(
							m.loc_nm,
							m.sppl_cd,
							m.str_ln_tgt_flg
						))
						.addMap((r, m) -> {
							r.setStringNE("gr_loc_nm", m.loc_nm());
							r.setBooleanNE("gr_str_ln_tgt_flg", m.str_ln_tgt_flg());
							r.setStringNE("sppl_cd", m.sppl_cd());
					}),
					j -> j
						.add(MAM_BP_R.class, r -> toCondition(
							r.getStringNE("sppl_cd")
						))
						.addSelect(m -> toArray(
							m.cur_cd,
							m.onr_prsppl_flg,
							m.prov_basis_typ
						))
						.addMap((r, m) -> {
							r.setStringNE("cur_cd", m.cur_cd());
							r.setBooleanNE("onr_prsppl_flg", m.onr_prsppl_flg());
							r.setStringNE("prov_basis_typ", m.prov_basis_typ());
					})
				)
			);
	}
}