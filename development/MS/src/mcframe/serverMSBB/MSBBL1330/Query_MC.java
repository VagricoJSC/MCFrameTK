package mcframe.serverMSBB.MSBBL1330;

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
	 * -- MSBBL1330_ARR_SCHD_Query_S01
	 */
	static MCQueryPlan MSBBL1330_ARR_SCHD_S01() {
		MST_SLS_RET_SCHD_R S0_T = MST_SLS_RET_SCHD_R.create("T");
		MST_SLS_RET_SCHD_D_R S0_T1 = MST_SLS_RET_SCHD_D_R.create("T1");
		MST_ARR_PR_R S0_T2 = MST_ARR_PR_R.create("T2");
		MST_ARR_SCHD_R S0_T3 = MST_ARR_SCHD_R.create("T3");
		MAM_LOC_R S0_LOC = MAM_LOC_R.create("LOC");
		MAM_LOC_R S0_CNSGNLOC = MAM_LOC_R.create("CNSGNLOC");
		MAM_STR_LN_R S0_LN = MAM_STR_LN_R.create("LN");
		MAM_STR_LN_R S0_CNSGNLN = MAM_STR_LN_R.create("CNSGNLN");
		MAVM_RD_DPT_R S0_DAC = MAVM_RD_DPT_R.create("DAC");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBBL1330_ARR_SCHD_Query_S01")
					.mainQuery()
					.select(
						S0_T3.trd_unit_cd,
						decode(
							S0_T3.arr_skip_flg,
							value(true),
							S0_T2.trd_unit_qty,
							S0_T3.trd_unit_qty
						).as("trd_unit_qty"),
						S0_T3.base_unit_cd,
						decode(
							S0_T3.arr_skip_flg,
							value(true),
							S0_T2.base_unit_qty,
							S0_T3.base_unit_qty
						).as("base_unit_qty"),
						S0_T3.abort_flg,
						S0_T3.sls_ret_schd_abort_flg,
						S0_T3.arr_qty,
						S0_T3.sls_ret_qty,
						S0_T3.abort_qty,
						S0_T3.sls_ret_schd_abort_qty,
						S0_T3.gd_cd,
						S0_T3.arr_loc_cd.as("loc_cd"),
						S0_LOC.loc_nm,
						S0_T3.str_ln_cd,
						S0_LN.str_ln_nm,
						cases()
							.when(S0_LOC.str_ln_tgt_flg.eq(value(true)))
								.then(
									cases()
										.when(MAC_STR$IS_NULL_VAL(S0_LN.str_ln_nm).eq(value(true)))
											.then(value(true))
										.otherwise(value(false))
							)
							.otherwise(value(false)).as("str_ln_cd_none_flg"),
						S0_T3.lot_no,
						S0_T3.sublot_no,
						S0_T3.sno1,
						S0_T3.sno2,
						S0_T3.sno3,
						S0_T3.sno4,
						S0_T3.arr_cnt_rmrks,
						S0_T3.intr_rmrks,
						S0_T3.sub_char1,
						S0_T3.sub_char2,
						S0_T3.sub_char3,
						S0_T3.arr_schd_no,
						S0_T3.itm_cd,
						S0_T3.itm_sub1,
						S0_T3.itm_sub2,
						S0_T3.itm_sub3,
						S0_LOC.str_ln_tgt_flg,
						S0_T2.arr_pr_no,
						S0_T3.ret_gd_cd.as("cnsgn_gd_cd"),
						S0_T3.ret_loc_cd.as("cnsgn_loc_cd"),
						S0_CNSGNLOC.loc_nm.as("cnsgn_loc_nm"),
						S0_T3.ret_str_ln_cd.as("cnsgn_str_ln_cd"),
						S0_CNSGNLN.str_ln_nm.as("cnsgn_str_ln_nm"),
						cases()
							.when(S0_CNSGNLOC.str_ln_tgt_flg.eq(value(true)))
								.then(
									cases()
										.when(MAC_STR$IS_NULL_VAL(S0_CNSGNLN.str_ln_nm).eq(value(true)))
											.then(value(true))
										.otherwise(value(false))
							)
							.otherwise(value(false)).as("cnsgn_str_ln_cd_none_flg")
					)
					.from(
						S0_T
						.innerJoin(S0_T1).on(
							bracket(
								S0_T.sls_ret_schd_no.eq(S0_T1.sls_ret_schd_no)
							)
						)
						.innerJoin(S0_T2).on(
							bracket(
								S0_T1.sls_ret_schd_d_no.eq(S0_T2.sls_ret_schd_d_no)
							)
						)
						.innerJoin(S0_T3).on(
							bracket(
								S0_T2.arr_pr_no.eq(S0_T3.arr_pr_no)
							)
						)
						.leftOuterJoin(S0_LOC).on(
							bracket(
								S0_T3.arr_loc_cd.eq(S0_LOC.loc_cd)
							)
						)
						.leftOuterJoin(S0_CNSGNLOC).on(
							bracket(
								S0_T3.ret_loc_cd.eq(S0_CNSGNLOC.loc_cd)
							)
						)
						.leftOuterJoin(S0_LN).on(
							bracket(
								S0_T3.str_ln_cd.eq(S0_LN.str_ln_cd)
								.and(S0_T3.arr_loc_cd.eq(S0_LN.loc_cd))
							)
						)
						.leftOuterJoin(S0_CNSGNLN).on(
							bracket(
								S0_T3.ret_str_ln_cd.eq(S0_CNSGNLN.str_ln_cd)
								.and(S0_T3.ret_loc_cd.eq(S0_CNSGNLN.loc_cd))
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
						.and(S0_T1.sls_ret_schd_no.eq(bind("srch_tgt_no")))
					)
					.orderBy(S0_T3.arr_schd_no.asc())
			)
			.setJoinInfo(
				joinInfo(
					j -> j
						.add(MAM_ITM_R.class, r -> toCondition(
							r.getStringNE("itm_cd"),
							r.getStringNE("itm_sub1"),
							r.getStringNE("itm_sub2"),
							r.getStringNE("itm_sub3")
						))
						.addSelect(m -> toArray(
							m.dec_place,
							m.lot_mng_typ,
							m.lot_no_typ,
							m.rnd_typ,
							m.sno1_mng_typ,
							m.sno2_mng_typ,
							m.sno3_mng_typ,
							m.sno4_mng_typ,
							m.stk_mng_typ,
							m.sublot_mng_typ,
							m.sublot_no_typ
						))
						.addMap((r, m) -> {
							r.setNumberNE("base_unit_dec_place", m.dec_place());
							r.setStringNE("base_unit_rnd_typ", m.rnd_typ());
							r.setStringNE("lot_mng_typ", m.lot_mng_typ());
							r.setStringNE("lot_no_typ", m.lot_no_typ());
							r.setStringNE("sublot_mng_typ", m.sublot_mng_typ());
							r.setStringNE("sublot_no_typ", m.sublot_no_typ());
							r.setStringNE("sno1_mng_typ", m.sno1_mng_typ());
							r.setStringNE("sno2_mng_typ", m.sno2_mng_typ());
							r.setStringNE("sno3_mng_typ", m.sno3_mng_typ());
							r.setStringNE("sno4_mng_typ", m.sno4_mng_typ());
							r.setStringNE("stk_mng_typ", m.stk_mng_typ());
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
						.add(MAM_STK_GD_R.class, r -> toCondition(
							r.getStringNE("cnsgn_gd_cd")
						))
						.addSelect(m -> toArray(
							m.gd_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("cnsgn_gd_nm", m.gd_nm());
					})
				)
			);
	}
	
	/**
	 * -- MSBBL1330_DLV_SLIP_D_Query_S01
	 */
	static MCQueryPlan MSBBL1330_DLV_SLIP_D_S01() {
		MST_DLV_SLIP_R S0_T1 = MST_DLV_SLIP_R.create("T1");
		MST_DLV_SLIP_D_R S0_T2 = MST_DLV_SLIP_D_R.create("T2");
		MST_SLO_D_R S0_T3 = MST_SLO_D_R.create("T3");
		MST_SHIP_ACT_D_R S0_T4 = MST_SHIP_ACT_D_R.create("T4");
		MST_SHIP_ACT_R S0_T5 = MST_SHIP_ACT_R.create("T5");
		MST_SLS_ACT_R S0_T6 = MST_SLS_ACT_R.create("T6");
		MAM_ITM_R S0_ITM = MAM_ITM_R.create("ITM");
		MAM_BP_R S0_DLV = MAM_BP_R.create("DLV");
		MAM_BP_R S0_TDLV = MAM_BP_R.create("TDLV");
		MAVM_RD_DPT_R S0_DAC = MAVM_RD_DPT_R.create("DAC");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBBL1330_DLV_SLIP_D_Query_S01")
					.mainQuery()
					.selectDistinct(
						value(false).as("abort_flg"),
						value(MSC_SRET_SCHD_STS_TYP.NON_ARR.value()).as("sret_schd_sts_typ"),
						S0_T2.itm_cd,
						S0_T2.itm_sub1,
						S0_T2.itm_sub2,
						S0_T2.itm_sub3,
						nvl(
							S0_T2.itm_nm,
							S0_ITM.itm_nm
						).as("itm_nm"),
						S0_ITM.asset_mng_typ,
						S0_T2.sundry_itm_flg,
						S0_T1.dlv_id_cd.as("dlv_cd"),
						nvl(
							S0_T1.dlv_id_nm,
							S0_DLV.bp_nm
						).as("dlv_nm"),
						S0_T1.dlv_zip_cd,
						S0_T1.dlv_addr1,
						S0_T1.dlv_addr2,
						S0_T1.dlv_addr3,
						S0_T1.dlv_addr4,
						S0_T1.dlv_cntct_dpt,
						S0_T1.dlv_cntct_psn,
						S0_T1.dlv_tel,
						S0_T1.dlv_fax,
						S0_DLV.cntry_cd,
						S0_T5.ship_to_id_cd.as("tdlv_cd"),
						nvl(
							S0_T5.ship_to_id_nm,
							S0_TDLV.bp_nm
						).as("tdlv_nm"),
						S0_DLV.prnt_lcl_cd,
						S0_T1.pri_prnt_flg,
						S0_T2.trd_unit_cd,
						S0_T2.base_unit_cd,
						S0_T2.base_unit_qty,
						value(0).as("arr_qty"),
						value(0).as("sls_ret_qty"),
						value(false).as("arr_cmpl_flg"),
						nullValue().as("trd_cur_upri"),
						value(true).as("upri_not_tgt_flg"),
						value(false).as("interim_flg"),
						nullValue().as("trd_cur_amt"),
						nullValue().as("trd_cur_inc_tax_amt"),
						nullValue().as("trd_cur_tax_amt"),
						nullValue().as("base_cur_upri"),
						nullValue().as("base_cur_amt"),
						nullValue().as("base_cur_inc_tax_amt"),
						nullValue().as("base_cur_tax_amt"),
						nullValue().as("ptax_cur_upri"),
						nullValue().as("ptax_cur_amt"),
						nullValue().as("ptax_cur_inc_tax_amt"),
						nullValue().as("ptax_cur_tax_amt"),
						S0_T2.sno1,
						S0_T2.sno2,
						S0_T2.sno3,
						S0_T2.sno4,
						S0_T2.lot_no,
						S0_T2.sublot_no,
						cases()
							.when(MAC_TRD_PTN_TYP$IS_SHIP(S0_T1.trd_ptn_typ).eq(value(true)))
								.then(value(true))
							.otherwise(S0_T3.vmi_flg).as("vmi_flg"),
						S0_T2.cst_po_d_no,
						S0_T2.cst_itm_cd,
						S0_T2.cst_itm_nm,
						S0_T2.trd_d_rmrks,
						S0_T1.slo_no,
						S0_T2.slo_d_no,
						S0_T1.dlv_slip_no.as("ref_dlv_slip_no"),
						S0_T2.dlv_slip_d_no.as("ref_dlv_slip_d_no"),
						S0_T6.ac_dt.as("base_sls_ac_dt"),
						S0_ITM.lot_mng_typ,
						S0_ITM.sublot_mng_typ,
						S0_ITM.sno1_mng_typ,
						S0_ITM.sno2_mng_typ,
						S0_ITM.sno3_mng_typ,
						S0_ITM.sno4_mng_typ,
						S0_ITM.dscnt_itm_flg,
						S0_ITM.ver_flg,
						S0_ITM.comp_spec_typ,
						S0_ITM.dec_place.as("base_unit_dec_place"),
						S0_ITM.rnd_typ.as("base_unit_rnd_typ"),
						S0_ITM.sls_upri_cng_flg.as("itm_sls_upri_cng_flg"),
						S0_ITM.bill_crryovr_times.as("itm_bill_crryovr_times"),
						S0_ITM.stk_mng_typ,
						S0_DLV.dlv_sundry_flg,
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
								S0_T2.slo_d_no.eq(S0_T3.slo_d_no)
							)
						)
						.leftOuterJoin(S0_T4).on(
							bracket(
								S0_T2.dlv_slip_no.eq(S0_T4.dlv_slip_no)
								.and(S0_T2.dlv_slip_d_no.eq(S0_T4.dlv_slip_d_no))
							)
						)
						.leftOuterJoin(S0_T5).on(
							bracket(
								S0_T4.ship_act_no.eq(S0_T5.ship_act_no)
								.and(S0_T5.ship_to_id_typ.eq(value(MSC_SHIP_TO_ID_TYP.TDLV.value())))
								.and(S0_T5.via_dlv_typ.eq(value(MAC_VIA_DLV_TYP.VIA.value())))
							)
						)
						.leftOuterJoin(S0_T6).on(
							bracket(
								S0_T1.dlv_slip_no.eq(S0_T6.dlv_slip_no)
								.and(S0_T1.dlv_slip_seq.eq(S0_T6.dlv_slip_seq))
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
						.leftOuterJoin(S0_DLV).on(
							bracket(
								S0_T1.dlv_id_cd.eq(S0_DLV.bp_cd)
							)
						)
						.leftOuterJoin(S0_TDLV).on(
							bracket(
								S0_T5.ship_to_id_cd.eq(S0_TDLV.bp_cd)
							)
						)
						.innerJoin(S0_DAC).on(
							bracket(
								S0_T1.dpt_cd.eq(S0_DAC.dpt_cd)
							)
						)
					)
					.where(
						value(1).eq(value(1))
						.and(S0_T1.dlv_slip_no.eq(bind("ship_dlv_slip_no")))
						.and(S0_T1.dlv_slip_seq.eq(bind("ship_dlv_slip_seq")))
					)
					.orderBy(S0_T2.dlv_slip_d_no.asc())
			)
			.setJoinInfo(
				joinInfo(
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
						.add(MSVT_LOT_LIST_R.class, r -> toCondition(
							r.getStringNE("itm_cd"),
							r.getStringNE("itm_sub1"),
							r.getStringNE("itm_sub2"),
							r.getStringNE("itm_sub3"),
							r.getStringNE("lot_no"),
							r.getStringNE("sublot_no")
						))
						.addSelect(m -> toArray(
							m.ver_no
						))
						.addMap((r, m) -> {
							r.setStringNE("ver_no", m.ver_no());
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
					})
				)
			);
	}
	
	/**
	 * -- MSBBL1330_DLV_SLIP_Query_S01
	 */
	static MCQueryPlan MSBBL1330_DLV_SLIP_S01() {
		MST_DLV_SLIP_R S0_T = MST_DLV_SLIP_R.create("T");
		MAM_CO_R S0_CO = MAM_CO_R.create("CO");
		MAM_DPT_R S0_DPT = MAM_DPT_R.create("DPT");
		MAVM_RD_DPT_R S0_DAC = MAVM_RD_DPT_R.create("DAC");
		MST_DLV_SLIP_R S0_W1 = MST_DLV_SLIP_R.create("W1");
		MST_SHIP_ACT_R S0_W2 = MST_SHIP_ACT_R.create("W2");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBBL1330_DLV_SLIP_Query_S01")
					.mainQuery()
					.select(
						value(false).as("vmi_flg"),
						nullValue().as("reg_dt"),
						nullValue().as("sls_ret_schd_dt"),
						nullValue().as("sls_ret_schd_no"),
						value(true).as("sync_flg"),
						S0_T.bp_cd.as("cst_cd"),
						S0_T.usr_cd.as("sls_usr_cd"),
						S0_T.dpt_cd.as("sls_dpt_cd"),
						S0_DPT.dpt_nm.as("sls_dpt_nm"),
						S0_T.usr_cd.as("cst_usr_cd"),
						S0_T.dpt_cd.as("cst_dpt_cd"),
						S0_DPT.wg_cd,
						nullValue().as("iv_no"),
						value(false).as("num_flg"),
						nullValue().as("ref_iv_no"),
						nullValue().as("rcv_schd_dt"),
						nullValue().as("trd_cur_cd"),
						nullValue().as("trd_cur_nm"),
						nullValue().as("base_cur_cd"),
						nullValue().as("base_cur_nm"),
						value(false).as("xrate_inpt_flg"),
						nullValue().as("xrate"),
						nullValue().as("ptax_cur_cd"),
						nullValue().as("ptax_cur_nm"),
						value(false).as("ptax_xrate_inpt_flg"),
						nullValue().as("ptax_xrate"),
						S0_T.cst_po_no,
						nullValue().as("lnk_ar_dpt_cd"),
						nullValue().as("ar_dpt_cd"),
						nullValue().as("ar_dpt_nm"),
						S0_T.trd_rmrks,
						nullValue().as("intr_rmrks"),
						S0_T.sub_char1,
						S0_T.sub_char2,
						S0_T.sub_char3,
						nullValue().as("trd_cur_amt_dec_place"),
						nullValue().as("trd_cur_upri_dec_place"),
						nullValue().as("base_cur_amt_dec_place"),
						nullValue().as("base_cur_upri_dec_place"),
						nullValue().as("ptax_cur_amt_dec_place"),
						nullValue().as("ptax_cur_upri_dec_place"),
						S0_T.slo_no.as("join_slo_no_")
						,S0_T.dlv_slip_no.as("ship_dlv_slip_no")
						,S0_T.dlv_slip_seq.as("ship_dlv_slip_seq")
					)
					.from(
						S0_T
						.crossJoin(S0_CO)
						.leftOuterJoin(S0_DPT).on(
							bracket(
								S0_T.dpt_cd.eq(S0_DPT.dpt_cd)
								.and(bind("today").between(S0_DPT.st_dt, S0_DPT.end_dt))
							)
						)
						.innerJoin(S0_DAC).on(
							bracket(
								S0_T.dpt_cd.eq(S0_DAC.dpt_cd)
							)
						)
					)
					.where(
						value(1).eq(value(1))
						.and(S0_T.dlv_slip_no.eq(bind("srch_tgt_no")))
						.and(S0_T.dlv_slip_seq.eq(subQuery()
							.select(max(S0_W1.dlv_slip_seq))
							.from(S0_W1
								.innerJoin(S0_W2).on(
									S0_W2.ship_act_no.eq(S0_W1.dlv_slip_act_no)
									.and(S0_W2.can_flg.eq(value(false)))
								)
							)
							.where(
								S0_W1.dlv_slip_no.eq(S0_T.dlv_slip_no)
								.and(S0_W1.trn_typ.eq(value(MSC_TRN_TYP.SHIP.value())))
								.and(S0_W1.slip_sts_typ.neq(value(MAC_SLIP_STS_TYP.CAN.value())))
								.and(S0_W1.dlv_slip_act_no.isNotNull())
							))
						)
					)
			)
			.setJoinInfo(
				joinInfo(
					j -> j
						.add(MAM_BP_R.class, r -> toCondition(
							r.getStringNE("cst_cd")
						))
						.addSelect(m -> toArray(
							m.acst_cd,
							m.ar_dpt_typ,
							m.bill_crryovr_times,
							m.bp_nm,
							m.cst_iv_flg,
							m.sls_amt_rnd_typ,
							m.sls_tax_rnd_typ,
							m.sls_upri_cng_flg
						))
						.addMap((r, m) -> {
							r.setStringNE("cst_nm", m.bp_nm());
							r.setStringNE("acst_cd", m.acst_cd());
							r.setBooleanNE("cst_iv_flg", m.cst_iv_flg());
							r.setStringNE("sls_amt_rnd_typ", m.sls_amt_rnd_typ());
							r.setStringNE("sls_tax_rnd_typ", m.sls_tax_rnd_typ());
							r.setBooleanNE("sls_upri_cng_flg", m.sls_upri_cng_flg());
							r.setStringNE("ar_dpt_typ", m.ar_dpt_typ());
							r.setNumberNE("cst_bill_crryovr_times", m.bill_crryovr_times());
					}),
					j -> j
						.add(MAM_BP_R.class, r -> toCondition(
							r.getStringNE("acst_cd")
						))
						.addSelect(m -> toArray(
							m.bcst_cd,
							m.bp_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("acst_nm", m.bp_nm());
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
						.add(MST_SLO_R.class, r -> toCondition(
							r.getStringNE("join_slo_no_")
						))
						.addSelect(m -> toArray(
							m.tterm_cd1,
							m.tterm_cd2,
							m.tterm_cd3,
							m.tterm_rmrks1,
							m.tterm_rmrks2,
							m.tterm_rmrks3
						))
						.addMap((r, m) -> {
							r.setStringNE("tterm_cd1", m.tterm_cd1());
							r.setStringNE("tterm_rmrks1", m.tterm_rmrks1());
							r.setStringNE("tterm_cd2", m.tterm_cd2());
							r.setStringNE("tterm_rmrks2", m.tterm_rmrks2());
							r.setStringNE("tterm_cd3", m.tterm_cd3());
							r.setStringNE("tterm_rmrks3", m.tterm_rmrks3());
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
	 * -- MSBBL1330_SHIP_PR_Query_S01
	 */
	static MCQueryPlan MSBBL1330_SHIP_PR_S01() {
		MST_DLV_SLIP_R S0_T1 = MST_DLV_SLIP_R.create("T1");
		MST_DLV_SLIP_D_R S0_T2 = MST_DLV_SLIP_D_R.create("T2");
		MST_SHIP_ACT_D_R S0_T3 = MST_SHIP_ACT_D_R.create("T3");
		MST_SHIP_ALLOC_STS_R S0_T4 = MST_SHIP_ALLOC_STS_R.create("T4");
		MST_SHIP_SCHD_R S0_T5 = MST_SHIP_SCHD_R.create("T5");
		MST_SHIP_PR_R S0_T6 = MST_SHIP_PR_R.create("T6");
		MAM_BP_R S0_CST = MAM_BP_R.create("CST");
		MAM_LOC_R S0_LOC = MAM_LOC_R.create("LOC");
		MAM_STR_LN_R S0_LN = MAM_STR_LN_R.create("LN");
		MAVM_RD_DPT_R S0_DAC = MAVM_RD_DPT_R.create("DAC");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBBL1330_SHIP_PR_Query_S01")
					.mainQuery()
					.select(
						S0_T3.trd_unit_cd,
						nullValue().as("trd_unit_qty"),
						S0_T3.base_unit_cd,
						S0_T3.base_unit_qty.subtract(S0_T3.ship_ret_qty).as("base_unit_qty"),
						value(false).as("abort_flg"),
						value(false).as("sls_ret_schd_abort_flg"),
						value(0).as("arr_qty"),
						value(0).as("sls_ret_qty"),
						value(0).as("abort_qty"),
						value(0).as("sls_ret_schd_abort_qty"),
						S0_T3.gd_cd,
						S0_T3.ship_loc_cd.as("loc_cd"),
						S0_LOC.loc_nm,
						S0_T3.ship_str_ln_cd.as("str_ln_cd"),
						S0_LN.str_ln_nm,
						cases()
							.when(S0_LOC.str_ln_tgt_flg.eq(value(true)))
								.then(
									cases()
										.when(MAC_STR$IS_NULL_VAL(S0_LN.str_ln_cd).eq(value(true)))
											.then(value(true))
										.otherwise(value(false))
							)
							.otherwise(value(false)).as("str_ln_cd_none_flg"),
						S0_T3.lot_no,
						S0_T3.sublot_no,
						S0_T3.sno1,
						S0_T3.sno2,
						S0_T3.sno3,
						S0_T3.sno4,
						nullValue().as("arr_cnt_rmrks"),
						S0_T3.itm_cd,
						S0_T3.itm_sub1,
						S0_T3.itm_sub2,
						S0_T3.itm_sub3,
						S0_LOC.str_ln_tgt_flg,
						S0_T3.dlv_slip_d_no.as("ref_dlv_slip_d_no")
					)
					.from(
						S0_T1
						.innerJoin(S0_T2).on(
							bracket(
								S0_T1.dlv_slip_no.eq(S0_T2.dlv_slip_no)
								.and(S0_T1.dlv_slip_seq.eq(S0_T2.dlv_slip_seq))
							)
						)
						.innerJoin(S0_T3).on(
							bracket(
								S0_T2.dlv_slip_d_no.eq(S0_T3.dlv_slip_d_no)
								.and(S0_T3.can_flg.eq(value(false)))
							)
						)
						.leftOuterJoin(S0_T4).on(
							bracket(
								S0_T3.ship_alloc_sts_no.eq(S0_T4.ship_alloc_sts_no)
							)
						)
						.leftOuterJoin(S0_T5).on(
							bracket(
								S0_T4.ship_schd_no.eq(S0_T5.ship_schd_no)
							)
						)
						.leftOuterJoin(S0_T6).on(
							bracket(
								S0_T5.ship_pr_no.eq(S0_T6.ship_pr_no)
							)
						)
						.leftOuterJoin(S0_CST).on(
							bracket(
								S0_T6.cst_cd.eq(S0_CST.bp_cd)
							)
						)
						.leftOuterJoin(S0_LOC).on(
							bracket(
								S0_T3.ship_loc_cd.eq(S0_LOC.loc_cd)
							)
						)
						.leftOuterJoin(S0_LN).on(
							bracket(
								S0_T3.ship_str_ln_cd.eq(S0_LN.str_ln_cd)
								.and(S0_T3.ship_loc_cd.eq(S0_LN.loc_cd))
							)
						)
						.innerJoin(S0_DAC).on(
							bracket(
								S0_T1.dpt_cd.eq(S0_DAC.dpt_cd)
							)
						)
					)
					.where(
						value(1).eq(value(1))
						.and(S0_T1.dlv_slip_no.eq(bind("ship_dlv_slip_no")))
						.and(S0_T1.dlv_slip_seq.eq(bind("ship_dlv_slip_seq")))
						.and(S0_T3.base_unit_qty.subtract(S0_T3.ship_ret_qty).gt(value(0)))
					)
					.orderBy(
						S0_T2.dlv_slip_d_no.asc(),
						S0_T3.ship_act_d_no.asc()
					)
			)
			.setJoinInfo(
				joinInfo(
					j -> j
						.add(MAM_ITM_R.class, r -> toCondition(
							r.getStringNE("itm_cd"),
							r.getStringNE("itm_sub1"),
							r.getStringNE("itm_sub2"),
							r.getStringNE("itm_sub3")
						))
						.addSelect(m -> toArray(
							m.dec_place,
							m.rnd_typ,
							m.lot_mng_typ,
							m.sublot_mng_typ,
							m.sno1_mng_typ,
							m.sno2_mng_typ,
							m.sno3_mng_typ,
							m.sno4_mng_typ,
							m.stk_mng_typ
						))
						.addMap((r, m) -> {
							r.setNumberNE("base_unit_dec_place", m.dec_place());
							r.setStringNE("base_unit_rnd_typ", m.rnd_typ());
							r.setStringNE("lot_mng_typ", m.lot_mng_typ());
							r.setStringNE("sublot_mng_typ", m.sublot_mng_typ());
							r.setStringNE("sno1_mng_typ", m.sno1_mng_typ());
							r.setStringNE("sno2_mng_typ", m.sno2_mng_typ());
							r.setStringNE("sno3_mng_typ", m.sno3_mng_typ());
							r.setStringNE("sno4_mng_typ", m.sno4_mng_typ());
							r.setStringNE("stk_mng_typ", m.stk_mng_typ());
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
					})
				)
			);
	}
	
	/**
	 * -- MSBBL1330_SLS_ACT_D_Query_S01
	 */
	static MCQueryPlan MSBBL1330_SLS_ACT_D_S01() {
		MST_SLS_ACT_R S0_T1 = MST_SLS_ACT_R.create("T1");
		MST_SLS_ACT_D_R S0_T2 = MST_SLS_ACT_D_R.create("T2");
		MST_SLO_D_R S0_T3 = MST_SLO_D_R.create("T3");
		MAM_ITM_R S0_ITM = MAM_ITM_R.create("ITM");
		MAM_BP_R S0_DLV = MAM_BP_R.create("DLV");
		MAM_ITM_LCL_R S0_ITMLCL = MAM_ITM_LCL_R.create("ITMLCL");
		MAM_TAX_R S0_TAX = MAM_TAX_R.create("TAX");
		MAVM_RD_DPT_R S0_DAC = MAVM_RD_DPT_R.create("DAC");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBBL1330_SLS_ACT_D_Query_S01")
					.mainQuery()
					.select(
						value(false).as("abort_flg"),
						value(MSC_SRET_SCHD_STS_TYP.NON_ARR.value()).as("sret_schd_sts_typ"),
						S0_T2.itm_cd,
						S0_T2.itm_sub1,
						S0_T2.itm_sub2,
						S0_T2.itm_sub3,
						nvl(
							S0_T2.itm_nm,
							S0_ITM.itm_nm
						).as("itm_nm"),
						decode(
							S0_ITM.sundry_itm_flg,
							value(true),
							S0_T2.iv_itm_nm,
							nvl(
								S0_ITMLCL.itm_nm,
								S0_ITM.itm_nm
							)
						).as("iv_itm_nm"),
						S0_ITM.asset_mng_typ,
						S0_ITM.sundry_itm_flg,
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
						S0_DLV.prnt_lcl_cd,
						cases()
							.when(
								S0_T1.ddlv_sls_flg.eq(value(false))
								.and(S0_T1.sls_basis_typ.eq(value(MAC_SLS_BASIS_TYP.IN_BASIS.value()))
									.or(S0_T1.sls_basis_typ.eq(value(MAC_SLS_BASIS_TYP.ARRIVAL_BASIS.value()))))
							).then(value(true))
							.otherwise(S0_T2.pri_prnt_flg).as("pri_prnt_flg"),
						S0_T2.dest_cd1,
						S0_T2.dest_cd2,
						S0_T2.dest_cd3,
						S0_T2.cntry_org_cd,
						S0_T2.trd_unit_cd,
						S0_T2.trd_unit_qty,
						S0_T2.base_unit_cd,
						S0_T2.base_unit_qty,
						value(0).as("arr_qty"),
						value(0).as("sls_ret_qty"),
						value(false).as("arr_cmpl_flg"),
						S0_T2.trd_cur_upri,
						value(true).as("upri_not_tgt_flg"),
						S0_T2.interim_flg,
						S0_T2.trd_cur_amt,
						bracket(
							S0_T2.trd_cur_amt.add(S0_T2.trd_cur_tax_amt)
						).as("trd_cur_inc_tax_amt"),
						S0_T2.trd_cur_dscnt_amt,
						S0_T2.dscnt_rsn_cd,
						S0_T2.cost_upri,
						S0_T2.cost_amt,
						value(true).as("tax_fix_flg"),
						S0_T2.tax_cd,
						S0_TAX.tax_nm,
						S0_TAX.tax_rate,
						S0_T2.trd_cur_tax_amt,
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
						S0_T2.sno1,
						S0_T2.sno2,
						S0_T2.sno3,
						S0_T2.sno4,
						S0_T2.wrk_no,
						S0_T2.loc_cd,
						S0_T2.str_ln_cd,
						S0_T2.lot_no,
						S0_T2.sublot_no,
						value(false).as("vmi_flg"),
						S0_T2.cst_po_d_no,
						S0_T2.cst_itm_cd,
						S0_T2.cst_itm_nm,
						S0_T2.wtax_rate,
						S0_T2.wtax_amt,
						S0_T2.slo_no,
						S0_T2.slo_d_no,
						S0_T1.dlv_slip_no.as("ref_dlv_slip_no"),
						S0_T2.dlv_slip_d_no.as("ref_dlv_slip_d_no"),
						S0_T1.sls_act_no.as("ref_sls_act_no"),
						S0_T2.sls_act_d_no.as("ref_sls_act_d_no"),
						S0_T1.ac_dt.as("base_sls_ac_dt"),
						S0_T2.disp_seq,
						S0_ITM.lot_mng_typ,
						S0_ITM.sublot_mng_typ,
						S0_ITM.sno1_mng_typ,
						S0_ITM.sno2_mng_typ,
						S0_ITM.sno3_mng_typ,
						S0_ITM.sno4_mng_typ,
						S0_ITM.stk_mng_typ,
						S0_ITM.dscnt_itm_flg,
						S0_ITM.ver_flg,
						S0_ITM.comp_spec_typ,
						S0_ITM.dec_place.as("base_unit_dec_place"),
						S0_ITM.rnd_typ.as("base_unit_rnd_typ"),
						S0_ITM.sls_upri_cng_flg.as("itm_sls_upri_cng_flg"),
						S0_ITM.bill_crryovr_times.as("itm_bill_crryovr_times"),
						S0_TAX.inc_tax_flg,
						S0_TAX.tax_typ,
						S0_T1.sls_act_seq.as("ref_sls_act_seq"),
						S0_T2.sls_act_d_seq.as("ref_sls_act_d_seq"),
						S0_DLV.dlv_sundry_flg,
						S0_T2.base_unit_qty.as("init_schd_qty"),
						S0_T2.trd_cur_dscnt_amt.as("init_schd_dscnt_amt"),
						decode(
							S0_TAX.inc_tax_flg,
							value(false),
							S0_T2.trd_cur_amt,
							S0_T2.trd_cur_amt.add(S0_T2.trd_cur_tax_amt)
						).as("init_schd_amt")
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
								S0_T2.slo_d_no.eq(S0_T3.slo_d_no)
								.and(S0_T3.can_flg.eq(value(false)))
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
						.leftOuterJoin(S0_DLV).on(
							bracket(
								S0_T2.dlv_cd.eq(S0_DLV.bp_cd)
							)
						)
						.leftOuterJoin(S0_ITMLCL).on(
							bracket(
								S0_T2.itm_cd.eq(S0_ITMLCL.itm_cd)
								.and(S0_T2.itm_sub1.eq(S0_ITMLCL.itm_sub1))
								.and(S0_T2.itm_sub2.eq(S0_ITMLCL.itm_sub2))
								.and(S0_T2.itm_sub3.eq(S0_ITMLCL.itm_sub3))
								.and(S0_DLV.prnt_lcl_cd.eq(S0_ITMLCL.lcl_cd))
							)
						)
						.leftOuterJoin(S0_TAX).on(
							bracket(
								S0_T2.tax_cd.eq(S0_TAX.tax_cd)
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
						.and(S0_T1.sls_act_no.eq(bind("srch_tgt_no")))
						.and(S0_T1.slip_sts_typ.eq(value(MAC_SLIP_STS_TYP.CRT.value())))
						.and(nvl(S0_T3.sls_cststk_flg, value(false)).eq(value(false)))
					)
					.orderBy(S0_T2.disp_seq.asc())
			)
			.setJoinInfo(
				joinInfo(
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
						.add(MAM_CNTRY_R.class, r -> toCondition(
							r.getStringNE("cntry_org_cd")
						))
						.addSelect(m -> toArray(
							m.cntry_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("cntry_org_nm", m.cntry_nm());
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
							r.getStringNE("dscnt_rsn_cd")
						))
						.addSelect(m -> toArray(
							m.biz_rsn_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("dscnt_rsn_nm", m.biz_rsn_nm());
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
						.add(MST_WRK_R.class, r -> toCondition(
							r.getStringNE("wrk_no")
						))
						.addSelect(m -> toArray(
							m.wrk_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("wrk_nm", m.wrk_nm());
					}),
					j -> j
						.add(MAM_LOC_R.class, r -> toCondition(
							r.getStringNE("loc_cd")
						))
						.addSelect(m -> toArray(
							m.loc_nm,
							m.site_cd,
							m.str_ln_tgt_flg
						))
						.addMap((r, m) -> {
							r.setStringNE("loc_nm", m.loc_nm());
							r.setBooleanNE("str_ln_tgt_flg", m.str_ln_tgt_flg());
							r.setStringNE("site_cd", m.site_cd());
					}),
					j -> j
						.add(MAM_STR_LN_R.class, r -> toCondition(
							r.getStringNE("loc_cd"),
							r.getStringNE("str_ln_cd")
						))
						.addSelect(m -> toArray(
							m.str_ln_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("str_ln_nm", m.str_ln_nm());
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
							m.ver_no
						))
						.addMap((r, m) -> {
							r.setStringNE("ver_no", m.ver_no());
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
							r.setNumberNE("schd_trd_unit_conv_base_qty", m.conv_base_qty());
							r.setNumberNE("schd_trd_unit_conv_qty", m.conv_qty());
					})
				)
			);
	}
	
	/**
	 * -- MSBBL1330_SLS_ACT_IO_Query_S01
	 */
	static MCQueryPlan MSBBL1330_SLS_ACT_IO_S01() {
		MST_SLS_ACT_R S0_T1 = MST_SLS_ACT_R.create("T1");
		MST_SLS_ACT_D_R S0_T2 = MST_SLS_ACT_D_R.create("T2");
		MST_SLS_ACT_IO_R S0_T3 = MST_SLS_ACT_IO_R.create("T3");
		MAM_LOC_R S0_LOC = MAM_LOC_R.create("LOC");
		MAM_STR_LN_R S0_LN = MAM_STR_LN_R.create("LN");
		MAVM_RD_DPT_R S0_DAC = MAVM_RD_DPT_R.create("DAC");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBBL1330_SLS_ACT_IO_Query_S01")
					.mainQuery()
					.select(
						S0_T3.trd_unit_cd,
						S0_T3.trd_unit_qty,
						S0_T3.base_unit_cd,
						S0_T3.base_unit_qty,
						value(false).as("abort_flg"),
						value(false).as("sls_ret_schd_abort_flg"),
						value(0).as("arr_qty"),
						value(0).as("sls_ret_qty"),
						value(0).as("abort_qty"),
						value(0).as("sls_ret_schd_abort_qty"),
						S0_T3.gd_cd,
						S0_T3.loc_cd,
						S0_LOC.loc_nm,
						S0_T3.str_ln_cd,
						S0_LN.str_ln_nm,
						cases()
							.when(S0_LOC.str_ln_tgt_flg.eq(value(true)))
								.then(
									cases()
										.when(MAC_STR$IS_NULL_VAL(S0_LN.str_ln_nm).eq(value(true)))
											.then(value(true))
										.otherwise(value(false))
							)
							.otherwise(value(false)).as("str_ln_cd_none_flg"),
						S0_T3.lot_no,
						S0_T3.sublot_no,
						S0_T3.sno1,
						S0_T3.sno2,
						S0_T3.sno3,
						S0_T3.sno4,
						nullValue().as("arr_cnt_rmrks"),
						nullValue().as("arr_schd_no"),
						S0_T2.itm_cd,
						S0_T2.itm_sub1,
						S0_T2.itm_sub2,
						S0_T2.itm_sub3,
						S0_LOC.str_ln_tgt_flg,
						S0_T2.sls_act_d_no.as("ref_sls_act_d_no")
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
						.leftOuterJoin(S0_LOC).on(
							bracket(
								S0_T3.loc_cd.eq(S0_LOC.loc_cd)
							)
						)
						.leftOuterJoin(S0_LN).on(
							bracket(
								S0_T3.str_ln_cd.eq(S0_LN.str_ln_cd)
								.and(S0_T3.loc_cd.eq(S0_LN.loc_cd))
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
						.and(S0_T1.sls_act_no.eq(bind("srch_tgt_no")))
						.and(S0_T1.slip_sts_typ.eq(value(MAC_SLIP_STS_TYP.CRT.value())))
					)
					.orderBy(
						S0_T2.sls_act_d_no.asc(),
						S0_T3.sls_act_io_no.asc()
					)
			)
			.setJoinInfo(
				joinInfo(
					j -> j
						.add(MAM_ITM_R.class, r -> toCondition(
							r.getStringNE("itm_cd"),
							r.getStringNE("itm_sub1"),
							r.getStringNE("itm_sub2"),
							r.getStringNE("itm_sub3")
						))
						.addSelect(m -> toArray(
							m.dec_place,
							m.rnd_typ,
							m.lot_mng_typ,
							m.sublot_mng_typ,
							m.sno1_mng_typ,
							m.sno2_mng_typ,
							m.sno3_mng_typ,
							m.sno4_mng_typ,
							m.stk_mng_typ
						))
						.addMap((r, m) -> {
							r.setNumberNE("base_unit_dec_place", m.dec_place());
							r.setStringNE("base_unit_rnd_typ", m.rnd_typ());
							r.setStringNE("lot_mng_typ", m.lot_mng_typ());
							r.setStringNE("sublot_mng_typ", m.sublot_mng_typ());
							r.setStringNE("sno1_mng_typ", m.sno1_mng_typ());
							r.setStringNE("sno2_mng_typ", m.sno2_mng_typ());
							r.setStringNE("sno3_mng_typ", m.sno3_mng_typ());
							r.setStringNE("sno4_mng_typ", m.sno4_mng_typ());
							r.setStringNE("stk_mng_typ", m.stk_mng_typ());
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
					})
				)
			);
	}
	
	/**
	 * -- MSBBL1330_SLS_ACT_Query_S01
	 */
	static MCQueryPlan MSBBL1330_SLS_ACT_S01() {
		MST_SLS_ACT_R S0_T = MST_SLS_ACT_R.create("T");
		MAM_CO_R S0_CO = MAM_CO_R.create("CO");
		MAM_DPT_R S0_DPT1 = MAM_DPT_R.create("DPT1");
		MAM_DPT_R S0_DPT2 = MAM_DPT_R.create("DPT2");
		MAVM_RD_DPT_R S0_DAC = MAVM_RD_DPT_R.create("DAC");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBBL1330_SLS_ACT_Query_S01")
					.mainQuery()
					.select(
						value(false).as("vmi_flg"),
						value(true).as("sync_flg"),
						S0_T.cst_cd,
						S0_T.sls_usr_cd,
						S0_T.sls_dpt_cd,
						S0_DPT1.dpt_nm.as("sls_dpt_nm"),
						S0_T.sls_usr_cd.as("cst_usr_cd"),
						S0_T.sls_dpt_cd.as("cst_dpt_cd"),
						S0_T.wg_cd,
						S0_T.iv_no.as("ref_iv_no"),
						S0_T.trd_cur_cd,
						S0_CO.base_cur_cd,
						S0_T.xrate,
						S0_CO.ptax_cur_cd,
						S0_T.ptax_xrate,
						S0_T.cst_po_no,
						S0_T.ar_dpt_cd.as("lnk_ar_dpt_cd"),
						S0_T.ar_dpt_cd,
						S0_DPT2.dpt_nm.as("ar_dpt_nm"),
						S0_T.tterm_cd1,
						S0_T.tterm_rmrks1,
						S0_T.tterm_cd2,
						S0_T.tterm_rmrks2,
						S0_T.tterm_cd3,
						S0_T.tterm_rmrks3,
						value(MAC_TRD_PTN_TYP.SLS_RTN.value()).as("trd_ptn_typ")
					)
					.from(
						S0_T
						.crossJoin(S0_CO)
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
						.innerJoin(S0_DAC).on(
							bracket(
								S0_T.sls_dpt_cd.eq(S0_DAC.dpt_cd)
							)
						)
					)
					.where(
						value(1).eq(value(1))
						.and(S0_T.sls_act_no.eq(bind("srch_tgt_no")))
						.and(S0_T.slip_sts_typ.eq(value(MAC_SLIP_STS_TYP.CRT.value())))
						.and(
							S0_T.trd_ptn_typ.in(
								value(MAC_TRD_PTN_TYP.SLS.value()),
								value(MAC_TRD_PTN_TYP.SLS_CNSGN.value())
							)
						)
					)
			)
			.setJoinInfo(
				joinInfo(
					j -> j
						.add(MAM_BP_R.class, r -> toCondition(
							r.getStringNE("cst_cd")
						))
						.addSelect(m -> toArray(
							m.acst_cd,
							m.ar_dpt_typ,
							m.bill_crryovr_times,
							m.bp_nm,
							m.cst_iv_flg,
							m.sls_amt_rnd_typ,
							m.sls_tax_rnd_typ,
							m.sls_upri_cng_flg,
							m.sls_upri_rnd_typ
						))
						.addMap((r, m) -> {
							r.setStringNE("cst_nm", m.bp_nm());
							r.setStringNE("acst_cd", m.acst_cd());
							r.setBooleanNE("cst_iv_flg", m.cst_iv_flg());
							r.setStringNE("sls_amt_rnd_typ", m.sls_amt_rnd_typ());
							r.setStringNE("sls_upri_rnd_typ", m.sls_upri_rnd_typ());
							r.setStringNE("sls_tax_rnd_typ", m.sls_tax_rnd_typ());
							r.setBooleanNE("sls_upri_cng_flg", m.sls_upri_cng_flg());
							r.setStringNE("ar_dpt_typ", m.ar_dpt_typ());
							r.setNumberNE("cst_bill_crryovr_times", m.bill_crryovr_times());
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
							m.bcst_cd,
							m.bp_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("acst_nm", m.bp_nm());
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
	 * -- MSBBL1330_SLS_RET_SCHD_D_Query_S01
	 */
	static MCQueryPlan MSBBL1330_SLS_RET_SCHD_D_S01() {
		MST_SLS_RET_SCHD_R S0_T1 = MST_SLS_RET_SCHD_R.create("T1");
		MST_SLS_RET_SCHD_D_R S0_T2 = MST_SLS_RET_SCHD_D_R.create("T2");
		MST_SLS_ACT_D_R S0_T3 = MST_SLS_ACT_D_R.create("T3");
		MAM_CO_R S0_CO = MAM_CO_R.create("CO");
		MAM_ITM_R S0_ITM = MAM_ITM_R.create("ITM");
		MAM_BP_R S0_SRET_FR = MAM_BP_R.create("SRET_FR");
		MAM_ITM_LCL_R S0_ITMLCL = MAM_ITM_LCL_R.create("ITMLCL");
		MST_ARR_PR_R S0_ARR_PR = MST_ARR_PR_R.create("ARR_PR");
		MAM_TAX_R S0_STAX = MAM_TAX_R.create("STAX");
		MAM_DPT_R S0_DPT = MAM_DPT_R.create("DPT");
		MAM_BP_R S0_CST = MAM_BP_R.create("CST");
		MAM_CUR_R S0_BCUR = MAM_CUR_R.create("BCUR");
		MAM_CUR_R S0_PCUR = MAM_CUR_R.create("PCUR");
		MAVM_RD_DPT_R S0_DAC = MAVM_RD_DPT_R.create("DAC");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBBL1330_SLS_RET_SCHD_D_Query_S01")
					.mainQuery()
					.select(
						S0_T2.abort_flg,
						cases()
							.when(
								S0_ARR_PR.arr_cmpl_flg.eq(value(false))
								.and(S0_ARR_PR.arr_qty.eq(value(0)))
								.and(S0_T2.abort_flg.eq(value(false)))
							)
								.then(value(MSC_SRET_SCHD_STS_TYP.NON_ARR.value()))
							.when(
								S0_ARR_PR.arr_cmpl_flg.eq(value(false))
								.and(value(0).lt(S0_ARR_PR.arr_qty))
								.and(S0_ARR_PR.arr_qty.lt(S0_ARR_PR.base_unit_qty))
								.and(S0_ARR_PR.arr_qty.gt(S0_ARR_PR.sls_ret_qty.add(S0_ARR_PR.sls_ret_schd_abort_qty)))
								.and(S0_T2.abort_flg.eq(value(false)))
								.and(S0_T1.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.SLS_RTN.value())))
							)
								.then(value(MSC_SRET_SCHD_STS_TYP.PART_ARR_NON_AC.value()))
							.when(
								bracket(
									bracket(
										S0_ARR_PR.arr_cmpl_flg.eq(value(false))
										.and(value(0).lt(S0_ARR_PR.arr_qty))
										.and(S0_ARR_PR.arr_qty.lt(S0_ARR_PR.base_unit_qty))
										.and(S0_ARR_PR.arr_qty.eq(S0_ARR_PR.sls_ret_qty.add(S0_ARR_PR.sls_ret_schd_abort_qty)))
										.and(S0_T2.abort_flg.eq(value(false)))
										.and(S0_T1.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.SLS_RTN.value())))
									)
									.or(
										S0_ARR_PR.arr_cmpl_flg.eq(value(false))
										.and(value(0).lt(S0_ARR_PR.arr_qty))
										.and(S0_ARR_PR.arr_qty.lt(S0_ARR_PR.base_unit_qty))
										.and(S0_T2.abort_flg.eq(value(false)))
										.and(S0_T1.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.SHIP_RTN.value())))
									)
								)
							)
								.then(value(MSC_SRET_SCHD_STS_TYP.PART_ARR.value()))
							.when(
								S0_ARR_PR.arr_cmpl_flg.eq(value(true))
								.and(S0_ARR_PR.arr_qty.gt(S0_ARR_PR.sls_ret_qty.add(S0_ARR_PR.sls_ret_schd_abort_qty)))
								.and(S0_T2.abort_flg.eq(value(false)))
								.and(S0_T1.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.SLS_RTN.value())))
							)
								.then(value(MSC_SRET_SCHD_STS_TYP.CMPL_ARR_NON_AC.value()))
							.when(S0_T2.cmpl_flg.eq(value(true)))
								.then(value(MSC_SRET_SCHD_STS_TYP.CMPL.value()))
							.otherwise(nullValue()).as("sret_schd_sts_typ"),
						S0_T2.itm_cd,
						S0_T2.itm_sub1,
						S0_T2.itm_sub2,
						S0_T2.itm_sub3,
						nvl(
							S0_T2.itm_nm,
							S0_ITM.itm_nm
						).as("itm_nm"),
						decode(
							S0_ITM.sundry_itm_flg,
							value(true),
							S0_T2.iv_itm_nm,
							nvl(
								S0_ITMLCL.itm_nm,
								S0_ITM.itm_nm
							)
						).as("iv_itm_nm"),
						S0_ITM.asset_mng_typ,
						S0_ITM.sundry_itm_flg,
						S0_T2.sret_fr_cd.as("dlv_cd"),
						nvl(
							S0_T2.sret_fr_nm,
							S0_SRET_FR.bp_nm
						).as("dlv_nm"),
						S0_T2.sret_fr_zip_cd.as("dlv_zip_cd"),
						S0_T2.sret_fr_addr1.as("dlv_addr1"),
						S0_T2.sret_fr_addr2.as("dlv_addr2"),
						S0_T2.sret_fr_addr3.as("dlv_addr3"),
						S0_T2.sret_fr_addr4.as("dlv_addr4"),
						S0_T2.sret_fr_cntct_dpt.as("dlv_cntct_dpt"),
						S0_T2.sret_fr_cntct_psn.as("dlv_cntct_psn"),
						S0_T2.sret_fr_tel.as("dlv_tel"),
						S0_T2.sret_fr_fax.as("dlv_fax"),
						S0_SRET_FR.cntry_cd,
						S0_SRET_FR.prnt_lcl_cd,
						S0_T2.pri_prnt_flg,
						S0_T2.dest_cd1,
						S0_T2.dest_cd2,
						S0_T2.dest_cd3,
						S0_T2.tdlv_cd,
						S0_T2.cntry_org_cd,
						S0_T2.trd_unit_cd,
						S0_T2.trd_unit_qty,
						S0_T2.base_unit_cd,
						S0_T2.base_unit_qty,
						S0_ARR_PR.arr_qty,
						S0_ARR_PR.sls_ret_qty,
						S0_ARR_PR.arr_cmpl_flg,
						S0_T2.trd_cur_upri,
						S0_T2.upri_not_tgt_flg,
						S0_T2.interim_flg,
						S0_T2.trd_cur_amt,
						bracket(
							S0_T2.trd_cur_amt.add(S0_T2.trd_cur_tax_amt)
						).as("trd_cur_inc_tax_amt"),
						S0_T2.trd_cur_dscnt_amt,
						S0_T2.dscnt_rsn_cd,
						S0_T2.cost_upri,
						S0_T2.cost_amt,
						S0_T2.tax_fix_flg,
						S0_T2.tax_cd,
						S0_T2.trd_cur_tax_amt,
						S0_T2.bill_crryovr_times,
						S0_T2.gd_cd,
						S0_T2.cnsgn_gd_cd,
						S0_T2.sno1,
						S0_T2.sno2,
						S0_T2.sno3,
						S0_T2.sno4,
						S0_T2.loc_cd,
						S0_T2.str_ln_cd,
						S0_T2.cnsgn_loc_cd,
						S0_T2.cnsgn_str_ln_cd,
						S0_T2.lot_no,
						S0_T2.sublot_no,
						S0_T2.ver_no,
						S0_T2.vmi_flg,
						S0_T2.cst_po_d_no,
						S0_T2.cst_itm_cd,
						S0_T2.cst_itm_nm,
						S0_T2.ret_rsn_cd,
						S0_T2.bd_dpt_cd,
						S0_DPT.dpt_nm.as("bd_dpt_nm"),
						S0_T2.wtax_rate,
						S0_T2.wtax_amt,
						S0_T2.arr_cnt_rmrks,
						S0_T2.trd_d_rmrks,
						S0_T2.intr_rmrks,
						S0_T2.sub_char1,
						S0_T2.sub_char2,
						S0_T2.sub_char3,
						S0_T2.sls_ret_schd_d_no,
						S0_T2.slo_no,
						S0_T2.slo_d_no,
						S0_T2.ref_dlv_slip_no,
						S0_T2.ref_dlv_slip_d_no,
						S0_T2.ref_sls_act_no,
						S0_T2.ref_sls_act_d_no,
						S0_T2.base_sls_ac_dt,
						S0_T2.disp_seq,
						S0_ITM.lot_mng_typ,
						S0_ITM.sublot_mng_typ,
						S0_ITM.sno1_mng_typ,
						S0_ITM.sno2_mng_typ,
						S0_ITM.sno3_mng_typ,
						S0_ITM.sno4_mng_typ,
						S0_ITM.stk_mng_typ,
						S0_ITM.dscnt_itm_flg,
						S0_ITM.ver_flg,
						S0_ITM.comp_spec_typ,
						S0_ITM.dec_place.as("base_unit_dec_place"),
						S0_ITM.rnd_typ.as("base_unit_rnd_typ"),
						S0_ITM.sls_upri_cng_flg.as("itm_sls_upri_cng_flg"),
						S0_ITM.bill_crryovr_times.as("itm_bill_crryovr_times"),
						S0_T2.ref_sls_act_seq,
						S0_T2.ref_sls_act_d_seq,
						S0_T2.sls_ret_schd_no,
						S0_ARR_PR.arr_pr_no,
						S0_ARR_PR.upd_cntr.as("arr_pr_upd_cntr"),
						S0_T2.io_schd_pr_no,
						S0_SRET_FR.dlv_sundry_flg,
						S0_T3.base_unit_qty.as("init_schd_qty"),
						S0_T3.trd_cur_dscnt_amt.as("init_schd_dscnt_amt"),
						decode(
							S0_STAX.inc_tax_flg,
							value(false),
							S0_T3.trd_cur_amt,
							S0_T3.trd_cur_amt.add(S0_T3.trd_cur_tax_amt)
						).as("init_schd_amt"),
						S0_T3.trd_unit_cd.as("join_trd_unit_cd_"),
						S0_T3.itm_cd.as("join_itm_cd_"),
						S0_T3.itm_sub1.as("join_itm_sub1_"),
						S0_T3.itm_sub2.as("join_itm_sub2_"),
						S0_T3.itm_sub3.as("join_itm_sub3_")
					)
					.from(
						S0_T1
						.innerJoin(S0_T2).on(
							bracket(
								S0_T1.sls_ret_schd_no.eq(S0_T2.sls_ret_schd_no)
							)
						)
						.leftOuterJoin(S0_T3).on(
							bracket(
								S0_T2.ref_sls_act_d_no.eq(S0_T3.sls_act_d_no)
								.and(S0_T2.ref_sls_act_d_seq.eq(S0_T3.sls_act_d_seq))
							)
						)
						.crossJoin(S0_CO)
						.leftOuterJoin(S0_ITM).on(
							bracket(
								S0_T2.itm_cd.eq(S0_ITM.itm_cd)
								.and(S0_T2.itm_sub1.eq(S0_ITM.itm_sub1))
								.and(S0_T2.itm_sub2.eq(S0_ITM.itm_sub2))
								.and(S0_T2.itm_sub3.eq(S0_ITM.itm_sub3))
							)
						)
						.leftOuterJoin(S0_SRET_FR).on(
							bracket(
								S0_T2.sret_fr_cd.eq(S0_SRET_FR.bp_cd)
							)
						)
						.leftOuterJoin(S0_ITMLCL).on(
							bracket(
								S0_T2.itm_cd.eq(S0_ITMLCL.itm_cd)
								.and(S0_T2.itm_sub1.eq(S0_ITMLCL.itm_sub1))
								.and(S0_T2.itm_sub2.eq(S0_ITMLCL.itm_sub2))
								.and(S0_T2.itm_sub3.eq(S0_ITMLCL.itm_sub3))
								.and(S0_SRET_FR.prnt_lcl_cd.eq(S0_ITMLCL.lcl_cd))
							)
						)
						.leftOuterJoin(S0_ARR_PR).on(
							bracket(
								S0_T2.sls_ret_schd_d_no.eq(S0_ARR_PR.sls_ret_schd_d_no)
							)
						)
						.leftOuterJoin(S0_STAX).on(
							bracket(
								S0_T3.tax_cd.eq(S0_STAX.tax_cd)
							)
						)
						.leftOuterJoin(S0_DPT).on(
							bracket(
								S0_T2.bd_dpt_cd.eq(S0_DPT.dpt_cd)
								.and(S0_T1.reg_dt.between(S0_DPT.st_dt, S0_DPT.end_dt))
							)
						)
						.leftOuterJoin(S0_CST).on(
							bracket(
								S0_T1.cst_cd.eq(S0_CST.bp_cd)
							)
						)
						.leftOuterJoin(S0_BCUR).on(
							bracket(
								S0_BCUR.cur_cd.eq(S0_CO.base_cur_cd)
							)
						)
						.leftOuterJoin(S0_PCUR).on(
							bracket(
								S0_PCUR.cur_cd.eq(S0_CO.ptax_cur_cd)
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
						.and(S0_T1.sls_ret_schd_no.eq(bind("srch_tgt_no")))
					)
					.orderBy(S0_T2.disp_seq.asc())
			)
			.setJoinInfo(
				joinInfo(
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
						.add(MAM_CNTRY_R.class, r -> toCondition(
							r.getStringNE("cntry_org_cd")
						))
						.addSelect(m -> toArray(
							m.cntry_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("cntry_org_nm", m.cntry_nm());
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
							r.getStringNE("tdlv_cd")
						))
						.addSelect(m -> toArray(
							m.bp_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("tdlv_nm", m.bp_nm());
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
							r.getStringNE("ret_rsn_cd")
						))
						.addSelect(m -> toArray(
							m.biz_rsn_nm,
							m.sls_acxfr_flg
						))
						.addMap((r, m) -> {
							r.setStringNE("ret_rsn_nm", m.biz_rsn_nm());
							r.setBooleanNE("sls_acxfr_flg", m.sls_acxfr_flg());
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
							r.setBooleanNE("inc_tax_flg", m.inc_tax_flg());
							r.setStringNE("tax_typ", m.tax_typ());
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
						.add(MAM_STK_GD_R.class, r -> toCondition(
							r.getStringNE("cnsgn_gd_cd")
						))
						.addSelect(m -> toArray(
							m.gd_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("cnsgn_gd_nm", m.gd_nm());
					}),
					j -> j
						.add(MST_WRK_SNO_R.class, r -> toCondition(
							r.getStringNE("sno1")
						))
						.addSelect(m -> toArray(
							m.wrk_no
						))
						.addMap((r, m) -> {
							r.setStringNE("wrk_no", m.wrk_no());
					}),
					j -> j
						.add(MST_WRK_R.class, r -> toCondition(
							r.getStringNE("wrk_no")
						))
						.addSelect(m -> toArray(
							m.wrk_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("wrk_nm", m.wrk_nm());
					}),
					j -> j
						.add(MAM_LOC_R.class, r -> toCondition(
							r.getStringNE("loc_cd")
						))
						.addSelect(m -> toArray(
							m.loc_nm,
							m.site_cd,
							m.str_ln_tgt_flg
						))
						.addMap((r, m) -> {
							r.setStringNE("loc_nm", m.loc_nm());
							r.setBooleanNE("str_ln_tgt_flg", m.str_ln_tgt_flg());
							r.setStringNE("site_cd", m.site_cd());
					}),
					j -> j
						.add(MAM_LOC_R.class, r -> toCondition(
							r.getStringNE("cnsgn_loc_cd")
						))
						.addSelect(m -> toArray(
							m.loc_nm,
							m.site_cd,
							m.str_ln_tgt_flg
						))
						.addMap((r, m) -> {
							r.setStringNE("cnsgn_loc_nm", m.loc_nm());
							r.setBooleanNE("cnsgn_str_ln_tgt_flg", m.str_ln_tgt_flg());
							r.setStringNE("cnsgn_site_cd", m.site_cd());
					}),
					j -> j
						.add(MAM_STR_LN_R.class, r -> toCondition(
							r.getStringNE("loc_cd"),
							r.getStringNE("str_ln_cd")
						))
						.addSelect(m -> toArray(
							m.str_ln_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("str_ln_nm", m.str_ln_nm());
					}),
					j -> j
						.add(MAM_STR_LN_R.class, r -> toCondition(
							r.getStringNE("cnsgn_loc_cd"),
							r.getStringNE("cnsgn_str_ln_cd")
						))
						.addSelect(m -> toArray(
							m.str_ln_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("cnsgn_str_ln_nm", m.str_ln_nm());
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
							r.getStringNE("join_trd_unit_cd_")
						))
						.addSelect(m -> toArray(
							m.conv_base_qty,
							m.conv_qty
						))
						.addMap((r, m) -> {
							r.setNumberNE("schd_trd_unit_conv_base_qty", m.conv_base_qty());
							r.setNumberNE("schd_trd_unit_conv_qty", m.conv_qty());
					})
				)
			);
	}
	
	/**
	 * -- MSBBL1330_SLS_RET_SCHD_Query_S01
	 */
	static MCQueryPlan MSBBL1330_SLS_RET_SCHD_S01() {
		MST_SLS_RET_SCHD_R S0_T = MST_SLS_RET_SCHD_R.create("T");
		MAM_CO_R S0_CO = MAM_CO_R.create("CO");
		MAM_TRD_R S0_TRD = MAM_TRD_R.create("TRD");
		MAM_DPT_R S0_DPT1 = MAM_DPT_R.create("DPT1");
		MAM_DPT_R S0_DPT2 = MAM_DPT_R.create("DPT2");
		MAVM_RD_DPT_R S0_DAC = MAVM_RD_DPT_R.create("DAC");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBBL1330_SLS_RET_SCHD_Query_S01")
					.mainQuery()
					.select(
						S0_T.trd_cd,
						S0_TRD.trd_nm,
						S0_T.reg_dt,
						S0_T.sls_ret_schd_dt,
						S0_T.sls_ret_schd_no,
						S0_T.sync_flg,
						S0_T.cst_cd,
						S0_T.sls_usr_cd,
						S0_T.sls_dpt_cd,
						S0_DPT1.dpt_nm.as("sls_dpt_nm"),
						S0_T.sls_usr_cd.as("cst_usr_cd"),
						S0_T.sls_dpt_cd.as("cst_dpt_cd"),
						S0_T.wg_cd,
						S0_T.iv_no,
						S0_T.ref_iv_no,
						S0_T.rcv_schd_dt,
						S0_T.trd_cur_cd,
						S0_CO.base_cur_cd,
						S0_T.xrate_inpt_flg,
						cases()
							.when(value(MAC_TRD_PTN_TYP.SLS_RTN.value()).eq(S0_TRD.trd_ptn_typ))
								.then(
									nvl(
										S0_T.xrate,
										MAPA_XCHNG$F_GET_SLS_XRATE_NE(
											S0_T.trd_cur_cd,
											S0_T.reg_dt
										)
									)
							)
							.otherwise(nullValue()).as("xrate"),
						S0_CO.ptax_cur_cd,
						S0_T.ptax_xrate_inpt_flg,
						cases()
							.when(
								S0_CO.ptax_cur_cd.isNotNull()
								.and(value(MAC_TRD_PTN_TYP.SLS_RTN.value()).eq(S0_TRD.trd_ptn_typ))
							)
								.then(
									nvl(
										S0_T.ptax_xrate,
										MAPA_XCHNG$F_GET_XRATE_NE(
											S0_T.trd_cur_cd,
											S0_CO.ptax_cur_cd,
											S0_CO.sls_xrate_cd,
											S0_T.reg_dt
										)
									)
							)
							.otherwise(nullValue()).as("ptax_xrate"),
						S0_T.cst_po_no,
						S0_T.ar_dpt_cd.as("lnk_ar_dpt_cd"),
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
						S0_TRD.trd_ptn_typ,
						S0_T.ins_usr_id,
						S0_T.ins_usr_nm,
						S0_T.ins_func_id,
						S0_T.ins_ts,
						S0_T.upd_usr_id,
						S0_T.upd_usr_nm,
						S0_T.upd_func_id,
						S0_T.upd_ts,
						S0_T.upd_srv_req_no,
						S0_T.upd_cntr
					)
					.from(
						S0_T
						.crossJoin(S0_CO)
						.leftOuterJoin(S0_TRD).on(
							bracket(
								S0_T.trd_cd.eq(S0_TRD.trd_cd)
							)
						)
						.leftOuterJoin(S0_DPT1).on(
							bracket(
								S0_T.sls_dpt_cd.eq(S0_DPT1.dpt_cd)
								.and(S0_T.reg_dt.between(S0_DPT1.st_dt, S0_DPT1.end_dt))
							)
						)
						.leftOuterJoin(S0_DPT2).on(
							bracket(
								S0_T.ar_dpt_cd.eq(S0_DPT2.dpt_cd)
								.and(S0_T.reg_dt.between(S0_DPT2.st_dt, S0_DPT2.end_dt))
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
						.and(S0_T.sls_ret_schd_no.eq(bind("srch_tgt_no")))
					)
			)
			.setJoinInfo(
				joinInfo(
					j -> j
						.add(MAM_BP_R.class, r -> toCondition(
							r.getStringNE("cst_cd")
						))
						.addSelect(m -> toArray(
							m.acst_cd,
							m.ar_dpt_typ,
							m.bill_crryovr_times,
							m.bp_nm,
							m.cst_iv_flg,
							m.sls_amt_rnd_typ,
							m.sls_tax_rnd_typ,
							m.sls_upri_cng_flg,
							m.sls_upri_rnd_typ
						))
						.addMap((r, m) -> {
							r.setStringNE("cst_nm", m.bp_nm());
							r.setStringNE("acst_cd", m.acst_cd());
							r.setBooleanNE("cst_iv_flg", m.cst_iv_flg());
							r.setStringNE("sls_amt_rnd_typ", m.sls_amt_rnd_typ());
							r.setStringNE("sls_upri_rnd_typ", m.sls_upri_rnd_typ());
							r.setStringNE("sls_tax_rnd_typ", m.sls_tax_rnd_typ());
							r.setBooleanNE("sls_upri_cng_flg", m.sls_upri_cng_flg());
							r.setStringNE("ar_dpt_typ", m.ar_dpt_typ());
							r.setNumberNE("cst_bill_crryovr_times", m.bill_crryovr_times());
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
							m.bcst_cd,
							m.bp_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("acst_nm", m.bp_nm());
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
}