package mcframe.serverMSBE.MSBEL1010;

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
	 * -- MSBEL1010_MST_XFR_ALLOC_STS_Query_S02
	 */
	static MCQueryPlan MSBEL1010_MST_XFR_ALLOC_STS_S02() {
		MST_XFR_ALLOC_STS_R S0_T01 = MST_XFR_ALLOC_STS_R.create("T01");
		MST_XFR_SCHD_R S0_T02 = MST_XFR_SCHD_R.create("T02");
		MAM_DPT_R S0_M21 = MAM_DPT_R.create("M21");
		MAM_ITM_R S0_M26 = MAM_ITM_R.create("M26");
		MAM_SUNDRY_ITM_R S0_M27 = MAM_SUNDRY_ITM_R.create("M27");
		MST_PROV_SCHD_R S0_T05 = MST_PROV_SCHD_R.create("T05");
		MST_PROV_SCHD_R S0_T06 = MST_PROV_SCHD_R.create("T06");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBEL1010_MST_XFR_ALLOC_STS_Query_S02")
					.mainQuery()
					.select(
						S0_T01.pr_sts_typ,
						S0_T02.itm_cd,
						S0_T02.itm_sub1,
						S0_T02.itm_sub2,
						S0_T02.itm_sub3,
						nvl(
							S0_M27.itm_nm,
							S0_M26.itm_nm
						).as("itm_nm"),
						S0_M26.lot_mng_typ,
						S0_M26.sublot_mng_typ,
						S0_M26.sno1_mng_typ,
						S0_M26.sno2_mng_typ,
						S0_M26.sno3_mng_typ,
						S0_M26.sno4_mng_typ,
						S0_M26.asset_mng_typ,
						S0_T01.alloc_flg,
						S0_T01.lot_no,
						S0_T01.sublot_no,
						S0_M26.ver_flg.as("def_ver_flg"),
						S0_T01.ver_no,
						S0_T01.trd_unit_cd,
						S0_T01.trd_unit_qty,
						S0_T01.abort_flg,
						S0_T01.inst_bndl_flg,
						S0_T01.base_unit_cd,
						S0_T01.base_unit_qty,
						S0_T01.act_qty.as("base_unit_act_qty"),
						S0_M26.pckg_unit_cd,
						S0_T02.trd_unit_cd.as("schd_unit_cd"),
						S0_T02.trd_unit_qty.as("schd_qty"),
						S0_M26.cont_fctr_flg,
						S0_M26.cont_fctr_unit_cd,
						S0_M26.cont_fctr_dec_place,
						S0_M26.cont_fctr_rnd_typ,
						S0_M26.std_cont_fctr,
						S0_T01.gi_loc_cd,
						S0_T01.gi_stk_arrv_bp_cd,
						S0_T01.gi_str_ln_cd,
						S0_T01.gr_str_ln_cd,
						S0_T01.gd_cd,
						S0_T01.quality_typ,
						S0_T01.not_lot_mix_flg,
						S0_T01.not_sublot_mix_flg,
						S0_T01.vld_dt_fr,
						S0_T01.sno1_null_flg,
						S0_T01.sno2_null_flg,
						S0_T01.sno3_null_flg,
						S0_T01.sno4_null_flg,
						S0_T01.sno1,
						S0_T01.sno2,
						S0_T01.sno3,
						S0_T01.sno4,
						S0_T01.alloc_sno1,
						S0_T01.alloc_sno2,
						S0_T01.alloc_sno3,
						S0_T01.alloc_sno4,
						S0_T01.stk_id_typ,
						S0_T01.stk_bp_cd,
						S0_T01.rsn_cd,
						S0_T01.bd_dpt_cd,
						S0_M21.dpt_nm.as("bd_dpt_nm"),
						S0_M26.skip_chk_ship_flg,
						S0_T01.prov_typ,
						S0_T01.prov_basis_typ,
						S0_T01.ret_prov_typ,
						S0_T01.ret_prov_basis_typ,
						S0_T02.base_dlv_slip_no,
						S0_T02.base_prov_act_no,
						S0_T02.base_ac_dt,
						S0_T02.trd_d_rmrks,
						S0_T01.sub_char1,
						S0_T01.sub_char2,
						S0_T01.sub_char3,
						S0_T01.xfr_alloc_sts_no,
						S0_T01.xfr_inst_d_no,
						S0_T05.prov_schd_no,
						S0_T06.prov_schd_no.as("ret_prov_schd_no"),
						S0_T02.xfr_schd_no,
						S0_T02.xfr_src_typ,
						S0_T02.xfr_src_no,
						S0_T01.dlv_slip_no,
						S0_T01.dlv_slip_d_no,
						S0_T01.io_schd_pr_no,
						S0_T01.disp_seq,
						S0_T01.upd_cntr.as("alloc_sts_upd_cntr"),
						// this field is appended by sql coverter.
						S0_T01.gr_loc_cd.as("join_gr_loc_cd_")
					)
					.from(
						S0_T01
						.innerJoin(S0_T02).on(
							bracket(
								S0_T01.xfr_schd_no.eq(S0_T02.xfr_schd_no)
							)
						)
						.leftOuterJoin(S0_M21).on(
							bracket(
								S0_T01.bd_dpt_cd.eq(S0_M21.dpt_cd)
								.and(S0_T02.rcpt_dt.between(S0_M21.st_dt, S0_M21.end_dt))
							)
						)
						.leftOuterJoin(S0_M26).on(
							bracket(
								S0_T02.itm_cd.eq(S0_M26.itm_cd)
								.and(S0_T02.itm_sub1.eq(S0_M26.itm_sub1))
								.and(S0_T02.itm_sub2.eq(S0_M26.itm_sub2))
								.and(S0_T02.itm_sub3.eq(S0_M26.itm_sub3))
							)
						)
						.leftOuterJoin(S0_M27).on(
							bracket(
								S0_T02.itm_cd.eq(S0_M27.itm_cd)
								.and(S0_T02.itm_sub1.eq(S0_M27.itm_sub1))
								.and(S0_T02.itm_sub2.eq(S0_M27.itm_sub2))
								.and(S0_T02.itm_sub3.eq(S0_M27.itm_sub3))
								.and(S0_T01.sno1.eq(S0_M27.sno1))
								.and(S0_T01.sno2.eq(S0_M27.sno2))
								.and(S0_T01.sno3.eq(S0_M27.sno3))
								.and(S0_T01.sno4.eq(S0_M27.sno4))
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
					)
					.where(
						value(0).eq(value(0))
						.and(S0_T01.pr_sts_typ.eq(value(MSC_PR_STS_TYP.NOT_INST.value())))
						.and(S0_T01.abort_flg.eq(value(false)))
						.and(S0_T01.xfr_schd_no.eq(bind("srch_tgt_no")))
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
						.add(MAM_UNIT_R.class, r -> toCondition(
							r.getStringNE("pckg_unit_cd")
						))
						.addSelect(m -> toArray(
							m.unit_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("pckg_unit_nm", m.unit_nm());
					}),
					j -> j
						.add(MAVM_ITM_UNIT_R.class, r -> toCondition(
							r.getStringNE("itm_cd"),
							r.getStringNE("itm_sub1"),
							r.getStringNE("itm_sub2"),
							r.getStringNE("itm_sub3"),
							r.getStringNE("pckg_unit_cd")
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
							m.dec_place
						))
						.addMap((r, m) -> {
							r.setNumberNE("schd_unit_dec_place", m.dec_place());
					}),
					j -> j
						.add(MAM_BP_R.class, r -> toCondition(
							r.getStringNE("gi_sppl_cd")
						))
						.addSelect(m -> toArray(
							m.onr_prsppl_flg,
							m.prov_basis_typ
						))
						.addMap((r, m) -> {
							r.setBooleanNE("gi_onr_prsppl_flg", m.onr_prsppl_flg());
							r.setStringNE("gi_prov_basis_typ", m.prov_basis_typ());
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
					})
				)
			);
	}
	
	/**
	 * -- MSBEL1010_MST_XFR_ALLOC_STS_Query_S03
	 */
	static MCQueryPlan MSBEL1010_MST_XFR_ALLOC_STS_S03() {
		MST_XFR_INST_R S0_T07 = MST_XFR_INST_R.create("T07");
		MST_XFR_INST_D_R S0_T08 = MST_XFR_INST_D_R.create("T08");
		MST_XFR_ALLOC_STS_R S0_T01 = MST_XFR_ALLOC_STS_R.create("T01");
		MST_XFR_SCHD_R S0_T02 = MST_XFR_SCHD_R.create("T02");
		MAM_LOC_R S0_M03 = MAM_LOC_R.create("M03");
		MAM_STR_LN_R S0_M04 = MAM_STR_LN_R.create("M04");
		MAM_BP_R S0_M05 = MAM_BP_R.create("M05");
		MAM_LOC_R S0_M09 = MAM_LOC_R.create("M09");
		MAM_STR_LN_R S0_M10 = MAM_STR_LN_R.create("M10");
		MAM_UNIT_R S0_M14 = MAM_UNIT_R.create("M14");
		MAM_UNIT_R S0_M15 = MAM_UNIT_R.create("M15");
		MAM_STK_GD_R S0_M16 = MAM_STK_GD_R.create("M16");
		MAM_BP_R S0_M17 = MAM_BP_R.create("M17");
		MAM_BIZ_RSN_R S0_M20 = MAM_BIZ_RSN_R.create("M20");
		MAM_DPT_R S0_M21 = MAM_DPT_R.create("M21");
		MAM_ITM_R S0_M26 = MAM_ITM_R.create("M26");
		MAM_SUNDRY_ITM_R S0_M27 = MAM_SUNDRY_ITM_R.create("M27");
		MAVM_ITM_UNIT_R S0_M29 = MAVM_ITM_UNIT_R.create("M29");
		MAVM_ITM_UNIT_R S0_M30 = MAVM_ITM_UNIT_R.create("M30");
		MAM_UNIT_R S0_M31 = MAM_UNIT_R.create("M31");
		MAM_UNIT_R S0_M32 = MAM_UNIT_R.create("M32");
		MAVM_ITM_UNIT_R S0_M33 = MAVM_ITM_UNIT_R.create("M33");
		MAM_UNIT_R S0_M34 = MAM_UNIT_R.create("M34");
		MAVM_ITM_UNIT_R S0_M35 = MAVM_ITM_UNIT_R.create("M35");
		MAM_BP_R S0_M36 = MAM_BP_R.create("M36");
		MSVT_LOT_LIST_R S0_T03 = MSVT_LOT_LIST_R.create("T03");
		MSVT_WRK_SNO_R S0_T04 = MSVT_WRK_SNO_R.create("T04");
		MST_PROV_SCHD_R S0_T05 = MST_PROV_SCHD_R.create("T05");
		MST_PROV_SCHD_R S0_T06 = MST_PROV_SCHD_R.create("T06");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBEL1010_MST_XFR_ALLOC_STS_Query_S03")
					.mainQuery()
					.select(
						S0_T01.pr_sts_typ,
						S0_T08.itm_cd,
						S0_T08.itm_sub1,
						S0_T08.itm_sub2,
						S0_T08.itm_sub3,
						nvl(
							S0_M27.itm_nm,
							S0_M26.itm_nm
						).as("itm_nm"),
						S0_T08.base_dlv_slip_no,
						S0_T08.base_prov_act_no,
						S0_T08.base_ac_dt,
						S0_M26.lot_mng_typ,
						S0_M26.sublot_mng_typ,
						S0_M26.sno1_mng_typ,
						S0_M26.sno2_mng_typ,
						S0_M26.sno3_mng_typ,
						S0_M26.sno4_mng_typ,
						S0_M26.asset_mng_typ,
						S0_T01.alloc_flg,
						S0_T01.lot_no,
						S0_T01.sublot_no,
						S0_M26.ver_flg.as("def_ver_flg"),
						S0_T01.ver_no,
						S0_T01.trd_unit_cd,
						S0_M14.unit_nm.as("trd_unit_nm"),
						S0_M29.conv_base_qty.as("trd_unit_conv_base_qty"),
						S0_M29.conv_qty.as("trd_unit_conv_qty"),
						S0_M29.dec_place.as("trd_unit_dec_place"),
						S0_M29.rnd_typ.as("trd_unit_rnd_typ"),
						S0_T01.trd_unit_qty,
						S0_T01.abort_flg,
						S0_T01.inst_bndl_flg,
						S0_T01.base_unit_cd,
						S0_M15.unit_nm.as("base_unit_nm"),
						S0_M30.dec_place.as("base_unit_dec_place"),
						S0_M30.rnd_typ.as("base_unit_rnd_typ"),
						S0_T01.base_unit_qty,
						S0_T01.act_qty.as("base_unit_act_qty"),
						S0_M26.pckg_unit_cd,
						S0_M32.unit_nm.as("pckg_unit_nm"),
						S0_M33.conv_base_qty.as("pckg_unit_conv_base_qty"),
						S0_M33.conv_qty.as("pckg_unit_conv_qty"),
						S0_M33.dec_place.as("pckg_unit_dec_place"),
						S0_T02.trd_unit_cd.as("schd_unit_cd"),
						S0_M34.unit_nm.as("schd_unit_nm"),
						S0_M35.dec_place.as("schd_unit_dec_place"),
						S0_T02.base_unit_qty.as("schd_qty"),
						S0_M26.cont_fctr_flg,
						S0_M26.cont_fctr_unit_cd,
						S0_M31.unit_nm.as("cont_fctr_unit_nm"),
						S0_M26.cont_fctr_dec_place,
						S0_M26.cont_fctr_rnd_typ,
						S0_T03.act_cont_fctr,
						S0_M26.std_cont_fctr,
						S0_T01.gi_loc_cd,
						S0_M03.loc_nm.as("gi_loc_nm"),
						S0_M03.site_cd.as("gi_site_cd"),
						S0_M03.sppl_cd.as("gi_sppl_cd"),
						S0_M36.onr_prsppl_flg.as("gi_onr_prsppl_flg"),
						S0_M36.prov_basis_typ.as("gi_prov_basis_typ"),
						S0_T01.gi_stk_arrv_bp_cd,
						S0_M05.bp_nm.as("gi_stk_arrv_bp_nm"),
						S0_M03.str_ln_tgt_flg.as("gi_str_ln_tgt_flg"),
						S0_T01.gi_str_ln_cd,
						S0_M04.str_ln_nm.as("gi_str_ln_nm"),
						S0_T01.gr_str_ln_cd,
						S0_M10.str_ln_nm.as("gr_str_ln_nm"),
						S0_T01.gd_cd,
						S0_M16.gd_nm,
						S0_T01.quality_typ,
						S0_T01.not_lot_mix_flg,
						S0_T01.not_sublot_mix_flg,
						S0_T01.vld_dt_fr,
						S0_T01.sno1_null_flg,
						S0_T01.sno2_null_flg,
						S0_T01.sno3_null_flg,
						S0_T01.sno4_null_flg,
						S0_T01.sno1,
						S0_T01.sno2,
						S0_T01.sno3,
						S0_T01.sno4,
						S0_T04.wrk_no,
						S0_T04.wrk_nm,
						S0_T01.alloc_sno1,
						S0_T01.alloc_sno2,
						S0_T01.alloc_sno3,
						S0_T01.alloc_sno4,
						S0_T01.stk_id_typ,
						S0_T01.stk_bp_cd,
						S0_M17.bp_nm.as("stk_bp_nm"),
						S0_T01.rsn_cd,
						S0_M20.biz_rsn_nm.as("rsn_nm"),
						S0_M20.acxfr_gi_flg,
						S0_T01.bd_dpt_cd,
						S0_M21.dpt_nm.as("bd_dpt_nm"),
						S0_M26.skip_chk_ship_flg,
						nvl(
							S0_T05.prov_typ,
							decode(
								S0_M03.sppl_cd, S0_M09.sppl_cd,
								nullValue(),
								nvl2(
									S0_M09.sppl_cd,
									value(MAC_PROV_TYP.ONR_PROV.value()),
									nullValue()
								)
							)
						).as("prov_typ"),
						nvl(
							S0_T05.prov_basis_typ,
							decode(
								S0_M03.sppl_cd, S0_M09.sppl_cd,
								nullValue(),
								nvl2(
									S0_M09.sppl_cd,
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
								S0_M03.sppl_cd, S0_M09.sppl_cd,
								nullValue(),
								nvl2(
									S0_M03.sppl_cd,
									value(MAC_PROV_TYP.ONR_PROV.value()),
									nullValue()
								)
							)
						).as("ret_prov_typ"),
						nvl(
							S0_T06.prov_basis_typ,
							decode(
								S0_M03.sppl_cd, S0_M09.sppl_cd,
								nullValue(),
								nvl2(
									S0_M03.sppl_cd,
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
						S0_T01.trd_d_rmrks,
						S0_T01.inst_d_rmrks,
						S0_T01.intr_d_rmrks,
						S0_T01.sub_char1,
						S0_T01.sub_char2,
						S0_T01.sub_char3,
						S0_T01.xfr_alloc_sts_no,
						S0_T07.xfr_inst_no,
						S0_T01.xfr_inst_d_no,
						S0_T05.prov_schd_no,
						S0_T06.prov_schd_no.as("ret_prov_schd_no"),
						S0_T02.xfr_schd_no,
						S0_T02.xfr_src_typ,
						S0_T02.xfr_src_no,
						S0_T01.dlv_slip_no,
						S0_T01.dlv_slip_d_no,
						S0_T01.io_schd_pr_no,
						S0_T01.disp_seq,
						S0_T01.upd_cntr.as("alloc_sts_upd_cntr"),
						S0_T01.wms_flg.as("last_wms_flg")
					)
					.from(
						S0_T07
						.innerJoin(S0_T08).on(
							bracket(
								S0_T07.xfr_inst_no.eq(S0_T08.xfr_inst_no)
							)
						)
						.innerJoin(S0_T01).on(
							bracket(
								S0_T08.xfr_inst_d_no.eq(S0_T01.xfr_inst_d_no)
							)
						)
						.leftOuterJoin(S0_T02).on(
							bracket(
								S0_T01.xfr_schd_no.eq(S0_T02.xfr_schd_no)
							)
						)
						.leftOuterJoin(S0_M03).on(
							bracket(
								S0_T01.gi_loc_cd.eq(S0_M03.loc_cd)
							)
						)
						.leftOuterJoin(S0_M04).on(
							bracket(
								S0_T01.gi_loc_cd.eq(S0_M04.loc_cd)
								.and(S0_T01.gi_str_ln_cd.eq(S0_M04.str_ln_cd))
							)
						)
						.leftOuterJoin(S0_M05).on(
							bracket(
								S0_T01.gi_stk_arrv_bp_cd.eq(S0_M05.bp_cd)
							)
						)
						.leftOuterJoin(S0_M09).on(
							bracket(
								S0_T01.gr_loc_cd.eq(S0_M09.loc_cd)
							)
						)
						.leftOuterJoin(S0_M10).on(
							bracket(
								S0_T01.gr_loc_cd.eq(S0_M10.loc_cd)
								.and(S0_T01.gr_str_ln_cd.eq(S0_M10.str_ln_cd))
							)
						)
						.leftOuterJoin(S0_M14).on(
							bracket(
								S0_T01.trd_unit_cd.eq(S0_M14.unit_cd)
							)
						)
						.leftOuterJoin(S0_M15).on(
							bracket(
								S0_T01.base_unit_cd.eq(S0_M15.unit_cd)
							)
						)
						.leftOuterJoin(S0_M16).on(
							bracket(
								S0_T01.gd_cd.eq(S0_M16.gd_cd)
							)
						)
						.leftOuterJoin(S0_M17).on(
							bracket(
								S0_T01.stk_bp_cd.eq(S0_M17.bp_cd)
							)
						)
						.leftOuterJoin(S0_M20).on(
							bracket(
								S0_T01.rsn_cd.eq(S0_M20.biz_rsn_cd)
							)
						)
						.leftOuterJoin(S0_M21).on(
							bracket(
								S0_T01.bd_dpt_cd.eq(S0_M21.dpt_cd)
								.and(S0_T07.xfr_inst_dt.between(S0_M21.st_dt, S0_M21.end_dt))
							)
						)
						.leftOuterJoin(S0_M26).on(
							bracket(
								S0_T08.itm_cd.eq(S0_M26.itm_cd)
								.and(S0_T08.itm_sub1.eq(S0_M26.itm_sub1))
								.and(S0_T08.itm_sub2.eq(S0_M26.itm_sub2))
								.and(S0_T08.itm_sub3.eq(S0_M26.itm_sub3))
							)
						)
						.leftOuterJoin(S0_M27).on(
							bracket(
								S0_T08.itm_cd.eq(S0_M27.itm_cd)
								.and(S0_T08.itm_sub1.eq(S0_M27.itm_sub1))
								.and(S0_T08.itm_sub2.eq(S0_M27.itm_sub2))
								.and(S0_T08.itm_sub3.eq(S0_M27.itm_sub3))
								.and(S0_T01.sno1.eq(S0_M27.sno1))
								.and(S0_T01.sno2.eq(S0_M27.sno2))
								.and(S0_T01.sno3.eq(S0_M27.sno3))
								.and(S0_T01.sno4.eq(S0_M27.sno4))
							)
						)
						.leftOuterJoin(S0_M29).on(
							bracket(
								S0_T08.itm_cd.eq(S0_M29.itm_cd)
								.and(S0_T08.itm_sub1.eq(S0_M29.itm_sub1))
								.and(S0_T08.itm_sub2.eq(S0_M29.itm_sub2))
								.and(S0_T08.itm_sub3.eq(S0_M29.itm_sub3))
								.and(S0_T01.trd_unit_cd.eq(S0_M29.unit_cd))
							)
						)
						.leftOuterJoin(S0_M30).on(
							bracket(
								S0_T08.itm_cd.eq(S0_M30.itm_cd)
								.and(S0_T08.itm_sub1.eq(S0_M30.itm_sub1))
								.and(S0_T08.itm_sub2.eq(S0_M30.itm_sub2))
								.and(S0_T08.itm_sub3.eq(S0_M30.itm_sub3))
								.and(S0_T01.base_unit_cd.eq(S0_M30.unit_cd))
							)
						)
						.leftOuterJoin(S0_M31).on(
							bracket(
								S0_M26.cont_fctr_unit_cd.eq(S0_M31.unit_cd)
							)
						)
						.leftOuterJoin(S0_M32).on(
							bracket(
								S0_M26.pckg_unit_cd.eq(S0_M32.unit_cd)
							)
						)
						.leftOuterJoin(S0_M33).on(
							bracket(
								S0_T08.itm_cd.eq(S0_M33.itm_cd)
								.and(S0_T08.itm_sub1.eq(S0_M33.itm_sub1))
								.and(S0_T08.itm_sub2.eq(S0_M33.itm_sub2))
								.and(S0_T08.itm_sub3.eq(S0_M33.itm_sub3))
								.and(S0_M26.pckg_unit_cd.eq(S0_M33.unit_cd))
							)
						)
						.leftOuterJoin(S0_M34).on(
							bracket(
								S0_T02.trd_unit_cd.eq(S0_M34.unit_cd)
							)
						)
						.leftOuterJoin(S0_M35).on(
							bracket(
								S0_T08.itm_cd.eq(S0_M35.itm_cd)
								.and(S0_T08.itm_sub1.eq(S0_M35.itm_sub1))
								.and(S0_T08.itm_sub2.eq(S0_M35.itm_sub2))
								.and(S0_T08.itm_sub3.eq(S0_M35.itm_sub3))
								.and(S0_T01.trd_unit_cd.eq(S0_M35.unit_cd))
							)
						)
						.leftOuterJoin(S0_M36).on(
							bracket(
								S0_M36.bp_cd.eq(S0_M03.sppl_cd)
							)
						)
						.leftOuterJoin(S0_T03).on(
							bracket(
								S0_T08.itm_cd.eq(S0_T03.itm_cd)
								.and(S0_T08.itm_sub1.eq(S0_T03.itm_sub1))
								.and(S0_T08.itm_sub2.eq(S0_T03.itm_sub2))
								.and(S0_T08.itm_sub3.eq(S0_T03.itm_sub3))
								.and(S0_T01.lot_no.eq(S0_T03.lot_no))
								.and(S0_T01.sublot_no.eq(S0_T03.sublot_no))
							)
						)
						.leftOuterJoin(S0_T04).on(
							bracket(
								S0_T01.sno1.eq(S0_T04.sno1)
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
					)
					.where(
						value(0).eq(value(0))
						.and(S0_T07.xfr_inst_no.eq(bind("srch_tgt_no")))
					)
					.orderBy(S0_T01.disp_seq.asc())
			);
	}
	
	/**
	 * -- MSBEL1010_MST_XFR_INST_Query_S01
	 */
	static MCQueryPlan MSBEL1010_MST_XFR_INST_S01() {
		MST_XFR_INST_R S0_T01 = MST_XFR_INST_R.create("T01");
		MAM_TRD_R S0_M01 = MAM_TRD_R.create("M01");
		MAM_LOC_R S0_M02 = MAM_LOC_R.create("M02");
		MAM_WG_R S0_M04 = MAM_WG_R.create("M04");
		MAM_LG_GRP_R S0_M05 = MAM_LG_GRP_R.create("M05");
		MAM_BP_R S0_M06 = MAM_BP_R.create("M06");
		MAM_USR_R S0_M07 = MAM_USR_R.create("M07");
		MAM_DPT_R S0_M08 = MAM_DPT_R.create("M08");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBEL1010_MST_XFR_INST_Query_S01")
					.mainQuery()
					.select(
						S0_T01.trd_cd,
						S0_M01.trd_nm,
						S0_T01.trd_ptn_typ,
						S0_T01.xfr_inst_no,
						S0_T01.gr_loc_cd,
						S0_M02.loc_nm.as("gr_loc_nm"),
						S0_M02.str_ln_tgt_flg.as("gr_str_ln_tgt_flg"),
						S0_M02.sppl_cd.as("gr_sppl_cd"),
						S0_M06.cur_cd.as("gr_cur_cd"),
						S0_M06.onr_prsppl_flg.as("gr_onr_prsppl_flg"),
						S0_M06.prov_basis_typ.as("gr_prov_basis_typ"),
						S0_T01.wg_cd,
						S0_M04.wg_nm,
						S0_T01.lg_grp_cd,
						S0_M05.lg_grp_nm,
						S0_M05.ship_slip_flg.as("dlv_print"),
						S0_M05.pick_list_flg.as("pick_print"),
						S0_M05.ship_inst_flg.as("inst_print"),
						S0_T01.xfr_schd_dt,
						S0_T01.xfr_inst_dt,
						S0_T01.inst_usr_cd,
						S0_M07.usr_nm.as("inst_usr_nm"),
						S0_T01.inst_dpt_cd,
						S0_M08.dpt_nm.as("inst_dpt_nm"),
						S0_T01.inst_prnt_flg,
						S0_T01.pick_prnt_flg,
						S0_T01.dlv_prnt_flg,
						S0_T01.trd_rmrks,
						S0_T01.inst_rmrks,
						S0_T01.intr_rmrks,
						S0_T01.sub_char1,
						S0_T01.sub_char2,
						S0_T01.sub_char3,
						S0_T01.ins_usr_id,
						S0_T01.ins_usr_nm,
						S0_T01.ins_func_id,
						S0_T01.upd_cntr.as("inst_upd_cntr"),
						S0_T01.upd_usr_id,
						S0_T01.upd_usr_nm,
						S0_T01.upd_func_id,
						S0_T01.ins_ts,
						S0_T01.upd_ts,
						S0_T01.upd_srv_req_no
					)
					.from(
						S0_T01
						.leftOuterJoin(S0_M01).on(
							bracket(
								S0_T01.trd_cd.eq(S0_M01.trd_cd)
							)
						)
						.leftOuterJoin(S0_M02).on(
							bracket(
								S0_T01.gr_loc_cd.eq(S0_M02.loc_cd)
							)
						)
						.leftOuterJoin(S0_M04).on(
							bracket(
								S0_T01.wg_cd.eq(S0_M04.wg_cd)
							)
						)
						.leftOuterJoin(S0_M05).on(
							bracket(
								S0_T01.lg_grp_cd.eq(S0_M05.lg_grp_cd)
							)
						)
						.leftOuterJoin(S0_M06).on(
							bracket(
								S0_M02.sppl_cd.eq(S0_M06.bp_cd)
							)
						)
						.leftOuterJoin(S0_M07).on(
							bracket(
								S0_T01.inst_usr_cd.eq(S0_M07.usr_cd)
							)
						)
						.leftOuterJoin(S0_M08).on(
							bracket(
								S0_T01.inst_dpt_cd.eq(S0_M08.dpt_cd)
								.and(S0_T01.xfr_inst_dt.between(S0_M08.st_dt, S0_M08.end_dt))
							)
						)
					)
					.where(
						value(0).eq(value(0))
						.and(S0_T01.xfr_inst_no.eq(bind("srch_tgt_no")))
					)
			);
	}
	
	/**
	 * -- MSBEL1010_MST_XFR_SCHD_Query_S01
	 */
	static MCQueryPlan MSBEL1010_MST_XFR_SCHD_S01() {
		MST_XFR_SCHD_R S0_T01 = MST_XFR_SCHD_R.create("T01");
		MAVM_RD_LG_GRP_R S0_M07 = MAVM_RD_LG_GRP_R.create("M07");
		MAM_ITM_LG_GRP_R S0_M08 = MAM_ITM_LG_GRP_R.create("M08");
		MAM_LOC_R S0_M09 = MAM_LOC_R.create("M09");
		MAVM_RD_LOC_R S0_M10 = MAVM_RD_LOC_R.create("M10");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBEL1010_MST_XFR_SCHD_Query_S01")
					.mainQuery()
					.select(
						S0_T01.trd_cd,
						S0_T01.trd_ptn_typ,
						S0_T01.gr_loc_cd,
						S0_T01.gi_wg_cd.as("wg_cd"),
						S0_T01.gr_lg_grp_cd.as("lg_grp_cd"),
						trunc(
							coalesce(
								S0_T01.gi_rqst_tm,
								S0_T01.gr_rqst_tm
							),
							MCDateFmt.DD
						).as("xfr_schd_dt"),
						S0_T01.sub_char1,
						S0_T01.sub_char2,
						S0_T01.sub_char3,
						S0_T01.ins_usr_id,
						S0_T01.ins_usr_nm,
						S0_T01.ins_func_id,
						S0_T01.upd_usr_id,
						S0_T01.upd_usr_nm,
						S0_T01.upd_func_id,
						S0_T01.ins_ts,
						S0_T01.upd_ts,
						S0_T01.upd_srv_req_no,
						// this field is appended by sql coverter.
						S0_T01.gr_wg_cd.as("join_gr_wg_cd_")
					)
					.from(
						S0_T01
						.leftOuterJoin(S0_M07).on(
							bracket(
								S0_T01.gi_lg_grp_cd.eq(S0_M07.lg_grp_cd)
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
						.and(
							S0_M07.lg_grp_cd.isNotNull()
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
							r.setStringNE("gr_sppl_cd", m.sppl_cd());
					}),
					j -> j
						.add(MAM_WG_R.class, r -> toCondition(
							r.getStringNE("join_gr_wg_cd_")
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
							m.pick_list_flg,
							m.ship_inst_flg,
							m.ship_slip_flg
						))
						.addMap((r, m) -> {
							r.setStringNE("lg_grp_nm", m.lg_grp_nm());
							r.setBooleanNE("dlv_print", m.ship_slip_flg());
							r.setBooleanNE("pick_print", m.pick_list_flg());
							r.setBooleanNE("inst_print", m.ship_inst_flg());
					}),
					j -> j
						.add(MAM_BP_R.class, r -> toCondition(
							r.getStringNE("gr_sppl_cd")
						))
						.addSelect(m -> toArray(
							m.cur_cd,
							m.onr_prsppl_flg,
							m.prov_basis_typ
						))
						.addMap((r, m) -> {
							r.setStringNE("gr_cur_cd", m.cur_cd());
							r.setBooleanNE("gr_onr_prsppl_flg", m.onr_prsppl_flg());
							r.setStringNE("gr_prov_basis_typ", m.prov_basis_typ());
					})
				)
			);
	}
}