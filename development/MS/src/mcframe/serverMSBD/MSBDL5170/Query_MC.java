package mcframe.serverMSBD.MSBDL5170;

import mcframe.commonCore.lang.MCNumber;
import mcframe.commonCore.lang.MCDate;
import mcframe.commonCore.lang.MCTimestamp;

import mcframe.serverCore.cache.MCJoinerList;

import static mcframe.commonCore.util.MCCollectionUtil.*;
import static mcframe.serverCore.cache.MCJoinerList.*;
import static mcframe.serverCore.queryapi.IFMCSQL.*;
import static mcframe.serverCore.queryapi.MCQueryExecution.*;
import static mcframe.serverMAUC.MAUCL0020.MAUCL_AppSys.*;

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
	 * -- MSBDL5170_MST_ARR_ACT_Query_S01
	 */
	public static MCQueryPlan MSBDL5170_MST_ARR_ACT_S01() {
		MST_ARR_ACT_R S0_T01 = MST_ARR_ACT_R.create("T01");
		MAM_BP_R S0_M05 = MAM_BP_R.create("M05");
		MAM_CUR_R S0_M51 = MAM_CUR_R.create("M51");
		MAM_CUR_R S0_M61 = MAM_CUR_R.create("M61");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBDL5170_MST_ARR_ACT_Query_S01")
					.mainQuery()
					.select(
						S0_T01.sppl_cd,
						S0_M05.bp_nm.as("sppl_nm"),
						S0_M05.purc_amt_rnd_typ,
						S0_M05.purc_tax_rnd_typ,
						S0_M05.purc_tax_calc_typ,
						S0_M05.purc_upri_cng_flg,
						S0_M05.prnt_lcl_cd,
						S0_M05.subcon_flg,
						S0_M05.repurc_obli_flg,
						nvl(S0_M05.outsrc_upri_typ, value(getCo().outsrc_upri_typ())).as("outsrc_upri_typ"),
						S0_M05.sppl_iv_flg,
						MAPA_BP$F_GET_BP_ADDR(
							S0_T01.sppl_cd,
							bind("addr_dt"),
							value(MAC_BP_ADDR_TYP.SPPL_CNTCT_DPT.value())
						).as("sppl_cntct_dpt"),
						MAPA_BP$F_GET_BP_ADDR(
							S0_T01.sppl_cd,
							bind("addr_dt"),
							value(MAC_BP_ADDR_TYP.SPPL_CNTCT_PSN.value())
						).as("sppl_cntct_psn"),
						MAPA_BP$F_GET_BP_ADDR(
							S0_T01.sppl_cd,
							bind("addr_dt"),
							value(MAC_BP_ADDR_TYP.SPPL_CNTCT_PSN_TITLE.value())
						).as("sppl_cntct_psn_title"),
						MAPA_BP$F_GET_BP_ADDR(
							S0_T01.sppl_cd,
							bind("addr_dt"),
							value(MAC_BP_ADDR_TYP.ZIP_CD.value())
						).as("sppl_zip_cd"),
						MAPA_BP$F_GET_BP_ADDR(
							S0_T01.sppl_cd,
							bind("addr_dt"),
							value(MAC_BP_ADDR_TYP.ADDR1.value())
						).as("sppl_addr1"),
						MAPA_BP$F_GET_BP_ADDR(
							S0_T01.sppl_cd,
							bind("addr_dt"),
							value(MAC_BP_ADDR_TYP.ADDR2.value())
						).as("sppl_addr2"),
						MAPA_BP$F_GET_BP_ADDR(
							S0_T01.sppl_cd,
							bind("addr_dt"),
							value(MAC_BP_ADDR_TYP.ADDR3.value())
						).as("sppl_addr3"),
						MAPA_BP$F_GET_BP_ADDR(
							S0_T01.sppl_cd,
							bind("addr_dt"),
							value(MAC_BP_ADDR_TYP.ADDR4.value())
						).as("sppl_addr4"),
						MAPA_BP$F_GET_BP_ADDR(
							S0_T01.sppl_cd,
							bind("addr_dt"),
							value(MAC_BP_ADDR_TYP.TEL.value())
						).as("sppl_tel"),
						MAPA_BP$F_GET_BP_ADDR(
							S0_T01.sppl_cd,
							bind("addr_dt"),
							value(MAC_BP_ADDR_TYP.FAX.value())
						).as("sppl_fax"),
						S0_M05.cntry_cd.as("sppl_cntry_cd"),
						S0_M05.asppl_cd,
						MAPA_BP$F_GET_AP_DPT_CD_NE(
							S0_M05.asppl_cd,
							bind("dpt_dt"),
							value(false)
						).as("mst_ap_dpt_cd"),
						MAPA_BP$F_GET_AP_DPT_CD_NE2(
							S0_T01.sppl_cd,
							S0_M05.asppl_cd,
							bind("dpt_dt"),
							value(false)
						).as("ap_dpt_cd"),
						bind("base_cur_cd").as("base_cur_cd"),
						S0_M51.amt_dec_place.as("base_cur_amt_dec_place"),
						S0_M51.upri_dec_place.as("base_cur_upri_dec_place"),
						bind("ptax_cur_cd").as("ptax_cur_cd"),
						S0_M61.amt_dec_place.as("ptax_cur_amt_dec_place"),
						S0_M61.upri_dec_place.as("ptax_cur_upri_dec_place"),
						S0_M05.bp_nm.as("ret_sppl_nm"),
						MAPA_BP$F_GET_BP_ADDR(
							S0_T01.sppl_cd,
							bind("addr_dt"),
							value(MAC_BP_ADDR_TYP.SPPL_CNTCT_DPT.value())
						).as("ret_sppl_cntct_dpt"),
						MAPA_BP$F_GET_BP_ADDR(
							S0_T01.sppl_cd,
							bind("addr_dt"),
							value(MAC_BP_ADDR_TYP.SPPL_CNTCT_PSN.value())
						).as("ret_sppl_cntct_psn"),
						MAPA_BP$F_GET_BP_ADDR(
							S0_T01.sppl_cd,
							bind("addr_dt"),
							value(MAC_BP_ADDR_TYP.SPPL_CNTCT_PSN_TITLE.value())
						).as("ret_sppl_cntct_psn_title"),
						MAPA_BP$F_GET_BP_ADDR(
							S0_T01.sppl_cd,
							bind("addr_dt"),
							value(MAC_BP_ADDR_TYP.ZIP_CD.value())
						).as("ret_sppl_zip_cd"),
						MAPA_BP$F_GET_BP_ADDR(
							S0_T01.sppl_cd,
							bind("addr_dt"),
							value(MAC_BP_ADDR_TYP.ADDR1.value())
						).as("ret_sppl_addr1"),
						MAPA_BP$F_GET_BP_ADDR(
							S0_T01.sppl_cd,
							bind("addr_dt"),
							value(MAC_BP_ADDR_TYP.ADDR2.value())
						).as("ret_sppl_addr2"),
						MAPA_BP$F_GET_BP_ADDR(
							S0_T01.sppl_cd,
							bind("addr_dt"),
							value(MAC_BP_ADDR_TYP.ADDR3.value())
						).as("ret_sppl_addr3"),
						MAPA_BP$F_GET_BP_ADDR(
							S0_T01.sppl_cd,
							bind("addr_dt"),
							value(MAC_BP_ADDR_TYP.ADDR4.value())
						).as("ret_sppl_addr4"),
						MAPA_BP$F_GET_BP_ADDR(
							S0_T01.sppl_cd,
							bind("addr_dt"),
							value(MAC_BP_ADDR_TYP.TEL.value())
						).as("ret_sppl_tel"),
						MAPA_BP$F_GET_BP_ADDR(
							S0_T01.sppl_cd,
							bind("addr_dt"),
							value(MAC_BP_ADDR_TYP.FAX.value())
						).as("ret_sppl_fax"),
						S0_T01.trd_unit_cd,
						S0_T01.base_unit_qty,
						S0_T01.base_unit_cd,
						// this field is appended by sql coverter.
						S0_T01.itm_cd.as("join_itm_cd_"),
						// this field is appended by sql coverter.
						S0_T01.itm_sub1.as("join_itm_sub1_"),
						// this field is appended by sql coverter.
						S0_T01.itm_sub2.as("join_itm_sub2_"),
						// this field is appended by sql coverter.
						S0_T01.itm_sub3.as("join_itm_sub3_"),
						// this field is appended by sql coverter.
						S0_M05.cur_cd.as("join_cur_cd_")
					)
					.from(
						S0_T01
						.leftOuterJoin(S0_M05).on(
							bracket(
								S0_T01.sppl_cd.eq(S0_M05.bp_cd)
							)
						)
						.leftOuterJoin(S0_M51).on(
							bracket(
								bind("base_cur_cd").eq(S0_M51.cur_cd)
							)
						)
						.leftOuterJoin(S0_M61).on(
							bracket(
								bind("ptax_cur_cd").eq(S0_M61.cur_cd)
							)
						)
					)
					.where(
						value(0).eq(value(0))
						.and(S0_T01.can_flg.eq(value(false)))
						.and(S0_T01.arr_act_no.eq(bind("srch_tgt_no")))
					)
			)
			.setJoinInfo(
				joinInfo(
					j -> j
						.add(MAM_BP_R.class, r -> toCondition(
							r.getStringNE("asppl_cd")
						))
						.addSelect(m -> toArray(
							m.bp_nm,
							m.bsppl_cd,
							m.cur_cd
						))
						.addMap((r, m) -> {
							r.setStringNE("asppl_nm", m.bp_nm());
							r.setStringNE("trd_cur_cd", m.cur_cd());
							r.setStringNE("join_bsppl_cd_", m.bsppl_cd());
					}),
					j -> j
						.add(MAM_BP_R.class, r -> toCondition(
							r.getStringNE("join_bsppl_cd_")
						))
						.addSelect(m -> toArray(
							m.pay_spot_flg
						))
						.addMap((r, m) -> {
							r.setBooleanNE("pay_spot_flg", m.pay_spot_flg());
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
							m.conv_base_qty,
							m.conv_qty,
							m.dec_place
						))
						.addMap((r, m) -> {
							r.setNumberNE("trd_unit_dec_place", m.dec_place());
							r.setNumberNE("trd_unit_dmn_qty", m.conv_base_qty());
							r.setNumberNE("trd_unit_conv_qty", m.conv_qty());
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
							m.dec_place,
							m.rnd_typ
						))
						.addMap((r, m) -> {
							r.setNumberNE("base_unit_dec_place", m.dec_place());
							r.setStringNE("base_unit_rnd_typ", m.rnd_typ());
					}),
					j -> j
						.add(MAM_CUR_R.class, r -> toCondition(
							r.getStringNE("join_cur_cd_")
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
					})
				)
			);
	}
	
	/**
	 * -- MSBDL5170_MST_ARR_ACT_Query_S02
	 */
	public static MCQueryPlan MSBDL5170_MST_ARR_ACT_S02() {
		MST_ARR_ACT_R S0_T01 = MST_ARR_ACT_R.create("T01");
		MAM_DPT_R S0_M02 = MAM_DPT_R.create("M02");
		MAM_ITM_R S0_M20 = MAM_ITM_R.create("M20");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBDL5170_MST_ARR_ACT_Query_S02")
					.mainQuery()
					.select(
						S0_T01.arr_act_no.as("ref_arr_act_no"),
						S0_T01.arr_act_rev.as("ref_arr_act_rev"),
						value(1).as("disp_seq"),
						S0_T01.arr_loc_cd.as("purc_ret_loc_cd"),
						bind("ap_dpt_cd").as("ap_dpt_cd"),
						S0_M02.dpt_nm.as("ap_dpt_nm"),
						S0_T01.str_ln_cd,
						S0_T01.itm_cd,
						S0_T01.itm_sub1,
						S0_T01.itm_sub2,
						S0_T01.itm_sub3,
						S0_T01.itm_nm,
						decode(
							S0_T01.sundry_itm_flg,
							value(true),
							S0_T01.itm_nm,
							S0_M20.itm_nm
						).as("itm_nm"),
						S0_T01.rcpt_iv_itm_nm,
						S0_T01.sundry_itm_flg,
						S0_M20.dscnt_itm_flg,
						S0_M20.arr_skip_flg,
						S0_M20.purc_upri_cng_flg.as("itm_purc_upri_cng_flg"),
						S0_M20.stk_mng_typ,
						S0_M20.asset_mng_typ,
						S0_M20.ver_flg,
						S0_T01.stk_id_typ.as("stk_id_typ"),
						S0_M20.lot_mng_typ,
						S0_M20.lot_no_typ,
						S0_M20.sublot_mng_typ,
						S0_M20.sublot_no_typ,
						S0_T01.lot_no,
						S0_T01.sublot_no,
						S0_T01.bp_lot_no,
						S0_T01.ver_no.as("ver_no"),
						S0_M20.sno1_mng_typ,
						S0_M20.sno2_mng_typ,
						S0_M20.sno3_mng_typ,
						S0_M20.sno4_mng_typ,
						S0_T01.sno1.as("sno1"),
						S0_T01.sno2.as("sno2"),
						S0_T01.sno3.as("sno3"),
						S0_T01.sno4.as("sno4"),
						S0_T01.quality_typ.as("quality_typ"),
						S0_T01.stk_insp_typ.as("stk_insp_typ"),
						S0_T01.gd_cd.as("gd_cd"),
						S0_T01.maker_cd,
						S0_T01.sppl_itm_cd,
						S0_T01.sppl_itm_nm,
						S0_T01.purc_id_typ,
						S0_T01.trd_unit_qty.as("trd_unit_qty"),
						S0_T01.trd_unit_cd.as("trd_unit_cd"),
						S0_T01.base_unit_qty.as("base_unit_qty"),
						S0_T01.base_unit_cd.as("base_unit_cd"),
						S0_M20.rnd_typ.as("base_unit_rnd_typ"),
						S0_M20.dec_place.as("base_unit_dec_place"),
						S0_T01.purc_cont_qty,
						S0_M20.cont_fctr_flg,
						S0_M20.cont_fctr_dec_place,
						S0_M20.cont_fctr_rnd_typ,
						S0_M20.std_cont_fctr,
						S0_M20.cont_fctr_unit_cd
					)
					.from(
						S0_T01
						.leftOuterJoin(S0_M02).on(
							bracket(
								bind("ap_dpt_cd").eq(S0_M02.dpt_cd)
								.and(bind("dpt_dt").between(S0_M02.st_dt, S0_M02.end_dt))
							)
						)
						.leftOuterJoin(S0_M20).on(
							bracket(
								S0_T01.itm_cd.eq(S0_M20.itm_cd)
								.and(S0_T01.itm_sub1.eq(S0_M20.itm_sub1))
								.and(S0_T01.itm_sub2.eq(S0_M20.itm_sub2))
								.and(S0_T01.itm_sub3.eq(S0_M20.itm_sub3))
							)
						)
					)
					.where(
						value(0).eq(value(0))
						.and(
							S0_T01.stk_id_typ.in(
								value(MSC_STK_ID_TYP.ACCPT_DFCT.value()),
								value(MSC_STK_ID_TYP.COSTK.value()),
								value(MSC_STK_ID_TYP.RNT_RCV.value()),
								value(MSC_STK_ID_TYP.NCV_RCV.value()),
								value(MSC_STK_ID_TYP.ONR_PROV.value())
							)
						)
						.and(S0_T01.arr_act_no.eq(bind("srch_tgt_no")))
					)
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
						.add(MAM_LOC_R.class, r -> toCondition(
							r.getStringNE("purc_ret_loc_cd")
						))
						.addSelect(m -> toArray(
							m.loc_mng_typ,
							m.loc_nm,
							m.str_ln_tgt_flg,
							m.wg_cd
						))
						.addMap((r, m) -> {
							r.setStringNE("purc_ret_loc_nm", m.loc_nm());
							r.setStringNE("purc_ret_loc_wg_cd", m.wg_cd());
							r.setStringNE("loc_mng_typ", m.loc_mng_typ());
							r.setBooleanNE("str_ln_tgt_flg", m.str_ln_tgt_flg());
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
						.add(MAM_WG_R.class, r -> toCondition(
							r.getStringNE("purc_ret_loc_wg_cd")
						))
						.addSelect(m -> toArray(
							m.wg_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("purc_ret_loc_wg_nm", m.wg_nm());
					}),
					j -> j
						.add(MAM_STR_LN_R.class, r -> toCondition(
							r.getStringNE("purc_ret_loc_cd"),
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
							r.setNumberNE("trd_unit_dmn_qty", m.conv_base_qty());
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
	 * -- MSBDL5170_MST_PURC_ACT_D_Query_S01
	 */
	public static MCQueryPlan MSBDL5170_MST_PURC_ACT_D_S01() {
		MST_PURC_ACT_D_R S0_T01 = MST_PURC_ACT_D_R.create("T01");
		MST_PURC_ACT_R S0_T00 = MST_PURC_ACT_R.create("T00");
		MAM_DPT_R S0_M02 = MAM_DPT_R.create("M02");
		MAM_TAX_R S0_M11 = MAM_TAX_R.create("M11");
		MAM_DPT_R S0_M14 = MAM_DPT_R.create("M14");
		MAM_ITM_R S0_M20 = MAM_ITM_R.create("M20");
		MAM_BP_R S0_M23 = MAM_BP_R.create("M23");
		MAM_ITM_LCL_R S0_M22 = MAM_ITM_LCL_R.create("M22");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBDL5170_MST_PURC_ACT_D_Query_S01")
					.mainQuery()
					.select(
						S0_T00.purc_act_no.as("ref_purc_act_no"),
						S0_T00.purc_act_seq.as("ref_purc_act_seq"),
						S0_T00.purc_act_rev.as("ref_purc_act_rev"),
						S0_T01.purc_act_d_no.as("ref_purc_act_d_no"),
						S0_T01.purc_act_d_seq.as("ref_purc_act_d_seq"),
						S0_T00.ac_dt.as("base_purc_ac_dt"),
						S0_T00.po_no,
						S0_T01.itm_cd,
						S0_T01.itm_sub1,
						S0_T01.itm_sub2,
						S0_T01.itm_sub3,
						decode(
							S0_T01.sundry_itm_flg,
							value(true),
							S0_T01.itm_nm,
							S0_M20.itm_nm
						).as("itm_nm"),
						decode(
							S0_M23.sppl_iv_flg,
							value(true),
							decode(
								S0_T01.sundry_itm_flg,
								value(true),
								S0_T01.iv_itm_nm,
								S0_M22.itm_nm
							),
							nullValue()
						).as("iv_itm_nm"),
						S0_M20.ver_flg,
						S0_M20.sno1_mng_typ,
						S0_M20.sno2_mng_typ,
						S0_M20.sno3_mng_typ,
						S0_M20.sno4_mng_typ,
						S0_M20.stk_mng_typ,
						S0_M20.asset_mng_typ,
						S0_T01.sno1,
						S0_T01.sno2,
						S0_T01.sno3,
						S0_T01.sno4,
						S0_M20.lot_mng_typ,
						S0_M20.lot_no_typ,
						S0_M20.sublot_mng_typ,
						S0_M20.sublot_no_typ,
						decode(
							S0_T01.lot_no,
							value(MSC_PURC_UNFIX_STR.UNFIXED.value()),
							nullValue(),
							S0_T01.lot_no
						).as("lot_no"),
						decode(
							S0_T01.sublot_no,
							value(MSC_PURC_UNFIX_STR.UNFIXED.value()),
							nullValue(),
							S0_T01.sublot_no
						).as("sublot_no"),
						S0_T01.bp_lot_no,
						S0_T01.purc_typ,
						S0_T01.purc_id_typ,
						S0_T01.quality_typ,
						S0_T01.ver_no,
						S0_T01.stk_insp_typ,
						S0_T01.stk_id_typ,
						decode(
							S0_T01.gd_cd,
							value(MSC_PURC_UNFIX_STR.UNFIXED.value()),
							nullValue(),
							S0_T01.gd_cd
						).as("gd_cd"),
						S0_T01.ap_dpt_cd,
						S0_M02.dpt_nm.as("ap_dpt_nm"),
						S0_T01.pay_crryovr_times,
						S0_T01.sundry_itm_flg,
						S0_M20.dscnt_itm_flg,
						S0_M20.arr_skip_flg,
						S0_M20.purc_upri_cng_flg.as("itm_purc_upri_cng_flg"),
						S0_T01.sppl_itm_cd,
						S0_T01.sppl_itm_nm,
						S0_T01.in_to_loc_cd.as("purc_ret_loc_cd"),
						S0_T01.maker_cd,
						S0_T01.str_ln_cd,
						S0_T01.trd_unit_qty,
						S0_T01.trd_unit_cd,
						S0_T01.base_unit_qty,
						S0_T01.base_unit_cd,
						S0_T01.interim_flg,
						cases()
							.when(MSC_STK_ID_TYP$IS_ACCPT_DFCT(S0_T01.stk_id_typ).eq(value(true)))
								.then(nullValue())
							.otherwise(S0_T01.tax_cd).as("tax_cd"),
						cases()
							.when(MSC_STK_ID_TYP$IS_ACCPT_DFCT(S0_T01.stk_id_typ).eq(value(true)))
								.then(nullValue())
							.otherwise(S0_M11.tax_nm).as("tax_nm"),
						cases()
							.when(MSC_STK_ID_TYP$IS_ACCPT_DFCT(S0_T01.stk_id_typ).eq(value(true)))
								.then(nullValue())
							.otherwise(S0_M11.tax_rate).as("tax_rate"),
						cases()
							.when(MSC_STK_ID_TYP$IS_ACCPT_DFCT(S0_T01.stk_id_typ).eq(value(true)))
								.then(nullValue())
							.otherwise(S0_M11.tax_typ).as("tax_typ"),
						cases()
							.when(MSC_STK_ID_TYP$IS_ACCPT_DFCT(S0_T01.stk_id_typ).eq(value(true)))
								.then(nullValue())
							.otherwise(S0_M11.inc_tax_flg).as("inc_tax_flg"),
						S0_T01.dscnt_rsn_cd,
						value(true).as("upri_not_tgt_flg"),
						S0_T01.trd_cur_upri,
						S0_T01.trd_cur_proc_upri,
						S0_T01.trd_cur_onr_prov_upri,
						S0_T01.trd_cur_amt,
						S0_T01.trd_cur_proc_amt,
						S0_T01.trd_cur_onr_prov_amt,
						S0_T01.trd_cur_tax_amt,
						S0_T01.trd_cur_dscnt_amt,
						S0_T01.trd_cur_amt.add(S0_T01.trd_cur_tax_amt).as("trd_cur_inc_tax_amt"),
						S0_T01.base_cur_upri,
						S0_T01.base_cur_proc_upri,
						S0_T01.base_cur_onr_prov_upri,
						S0_T01.base_cur_dscnt_amt,
						S0_T01.base_cur_amt,
						S0_T01.base_cur_proc_amt,
						S0_T01.base_cur_onr_prov_amt,
						S0_T01.base_cur_tax_amt,
						S0_T01.base_cur_amt.add(S0_T01.base_cur_tax_amt).as("base_cur_inc_tax_amt"),
						S0_T01.ptax_cur_upri,
						S0_T01.ptax_cur_proc_upri,
						S0_T01.ptax_cur_onr_prov_upri,
						S0_T01.ptax_cur_dscnt_amt,
						S0_T01.ptax_cur_proc_amt,
						S0_T01.ptax_cur_onr_prov_amt,
						S0_T01.ptax_cur_amt,
						S0_T01.ptax_cur_tax_amt,
						S0_T01.ptax_cur_amt.add(S0_T01.ptax_cur_tax_amt).as("ptax_cur_inc_tax_amt"),
						S0_T01.wtax_rate,
						S0_T01.wtax_amt,
						S0_T01.bd_itm_cd,
						S0_T01.bd_itm_sub1,
						S0_T01.bd_itm_sub2,
						S0_T01.bd_itm_sub3,
						S0_T01.bd_sno1,
						S0_T01.bd_sno2,
						S0_T01.bd_sno3,
						S0_T01.bd_sno4,
						S0_T01.bd_loc_cd,
						S0_T01.bd_lot_no,
						S0_T01.bd_sublot_no,
						S0_T01.mfg_inst_no,
						S0_T01.bd_dpt_cd,
						S0_M14.dpt_nm.as("bd_dpt_nm"),
						S0_T01.bd_wg_cd,
						S0_T01.bd_ctg_cd,
						S0_T01.bd_oper_cd,
						S0_T01.bd_po_no,
						S0_T01.bd_slo_no,
						S0_T01.bd_iv_no,
						S0_T01.disp_seq,
						S0_M20.cont_fctr_flg,
						S0_M20.std_cont_fctr.as("purc_cont_fctr"),
						S0_M20.std_cont_fctr,
						S0_M20.cont_fctr_unit_cd,
						S0_M20.cont_fctr_rnd_typ,
						S0_M20.cont_fctr_dec_place,
						S0_M20.insp_flg,
						S0_M20.ver_flg,
						// this field is appended by sql coverter.
						S0_T01.gd_cd.as("join_gd_cd_")
					)
					.from(
						S0_T01
						.leftOuterJoin(S0_T00).on(
							bracket(
								S0_T01.purc_act_no.eq(S0_T00.purc_act_no)
								.and(S0_T01.purc_act_seq.eq(S0_T00.purc_act_seq))
							)
						)
						.leftOuterJoin(S0_M02).on(
							bracket(
								S0_T01.ap_dpt_cd.eq(S0_M02.dpt_cd)
								.and(bind("dpt_dt").between(S0_M02.st_dt, S0_M02.end_dt))
							)
						)
						.leftOuterJoin(S0_M11).on(
							bracket(
								S0_T01.tax_cd.eq(S0_M11.tax_cd)
							)
						)
						.leftOuterJoin(S0_M14).on(
							bracket(
								S0_T01.bd_dpt_cd.eq(S0_M14.dpt_cd)
								.and(bind("dpt_dt").between(S0_M14.st_dt, S0_M14.end_dt))
							)
						)
						.leftOuterJoin(S0_M20).on(
							bracket(
								S0_T01.itm_cd.eq(S0_M20.itm_cd)
								.and(S0_T01.itm_sub1.eq(S0_M20.itm_sub1))
								.and(S0_T01.itm_sub2.eq(S0_M20.itm_sub2))
								.and(S0_T01.itm_sub3.eq(S0_M20.itm_sub3))
							)
						)
						.leftOuterJoin(S0_M23).on(
							bracket(
								S0_T00.sppl_cd.eq(S0_M23.bp_cd)
							)
						)
						.leftOuterJoin(S0_M22).on(
							bracket(
								S0_T01.itm_cd.eq(S0_M22.itm_cd)
								.and(S0_T01.itm_sub1.eq(S0_M22.itm_sub1))
								.and(S0_T01.itm_sub2.eq(S0_M22.itm_sub2))
								.and(S0_T01.itm_sub3.eq(S0_M22.itm_sub3))
								.and(S0_M22.lcl_cd.eq(S0_M23.prnt_lcl_cd))
							)
						)
					)
					.where(
						value(0).eq(value(0))
						.and(value(true).eq(MAC_SLIP_STS_TYP$IS_CRT(S0_T00.slip_sts_typ)))
						.and(
							S0_T01.stk_id_typ.isNull()
							.or(
								S0_T01.stk_id_typ.in(
									value(MSC_STK_ID_TYP.ACCPT_DFCT.value()),
									value(MSC_STK_ID_TYP.COSTK.value()),
									value(MSC_STK_ID_TYP.RNT_RCV.value()),
									value(MSC_STK_ID_TYP.NCV_RCV.value()),
									value(MSC_STK_ID_TYP.ONR_PROV.value())
								)
							)
						)
						.and(
							value(true).eq(MAC_TRD_PTN_TYP$IS_PURC(S0_T00.trd_ptn_typ))
							.or(value(true).eq(MAC_TRD_PTN_TYP$IS_PURC_XPNS(S0_T00.trd_ptn_typ)))
						)
						.cutoff$and(S0_T00.purc_act_no.eq(bind("purc_act_no")))
						.cutoff$and(S0_T01.purc_act_d_no.eq(bind("purc_act_d_no")))
					)
					.orderBy(S0_T01.disp_seq.asc())
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
						.add(MAM_STK_GD_R.class, r -> toCondition(
							r.getStringNE("join_gd_cd_")
						))
						.addSelect(m -> toArray(
							m.gd_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("gd_nm", m.gd_nm());
					}),
					j -> j
						.add(MAM_LOC_R.class, r -> toCondition(
							r.getStringNE("purc_ret_loc_cd")
						))
						.addSelect(m -> toArray(
							m.loc_mng_typ,
							m.loc_nm,
							m.sppl_cd,
							m.str_ln_tgt_flg,
							m.wg_cd
						))
						.addMap((r, m) -> {
							r.setStringNE("purc_ret_loc_nm", m.loc_nm());
							r.setStringNE("purc_ret_loc_wg_cd", m.wg_cd());
							r.setStringNE("purc_ret_sppl_cd", m.sppl_cd());
							r.setStringNE("loc_mng_typ", m.loc_mng_typ());
							r.setBooleanNE("str_ln_tgt_flg", m.str_ln_tgt_flg());
					}),
					j -> j
						.add(MAM_WG_R.class, r -> toCondition(
							r.getStringNE("purc_ret_loc_wg_cd")
						))
						.addSelect(m -> toArray(
							m.wg_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("purc_ret_loc_wg_nm", m.wg_nm());
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
						.add(MAM_STR_LN_R.class, r -> toCondition(
							r.getStringNE("purc_ret_loc_cd"),
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
							r.setNumberNE("trd_unit_dmn_qty", m.conv_base_qty());
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
							r.getStringNE("bd_itm_cd"),
							r.getStringNE("bd_itm_sub1"),
							r.getStringNE("bd_itm_sub2"),
							r.getStringNE("bd_itm_sub3")
						))
						.addSelect(m -> toArray(
							m.itm_nm,
							m.lot_mng_typ,
							m.lot_no_typ,
							m.sno1_mng_typ,
							m.sno2_mng_typ,
							m.sno3_mng_typ,
							m.sno4_mng_typ,
							m.sublot_mng_typ,
							m.sublot_no_typ
						))
						.addMap((r, m) -> {
							r.setStringNE("bd_itm_nm", m.itm_nm());
							r.setStringNE("bd_lot_mng_typ", m.lot_mng_typ());
							r.setStringNE("bd_lot_no_typ", m.lot_no_typ());
							r.setStringNE("bd_sublot_mng_typ", m.sublot_mng_typ());
							r.setStringNE("bd_sublot_no_typ", m.sublot_no_typ());
							r.setStringNE("bd_sno1_mng_typ", m.sno1_mng_typ());
							r.setStringNE("bd_sno2_mng_typ", m.sno2_mng_typ());
							r.setStringNE("bd_sno3_mng_typ", m.sno3_mng_typ());
							r.setStringNE("bd_sno4_mng_typ", m.sno4_mng_typ());
					}),
					j -> j
						.add(MAM_LOC_R.class, r -> toCondition(
							r.getStringNE("bd_loc_cd")
						))
						.addSelect(m -> toArray(
							m.loc_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("bd_loc_nm", m.loc_nm());
					}),
					j -> j
						.add(MAM_WG_R.class, r -> toCondition(
							r.getStringNE("bd_wg_cd")
						))
						.addSelect(m -> toArray(
							m.wg_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("bd_wg_nm", m.wg_nm());
					}),
					j -> j
						.add(MAM_COST_CTG_R.class, r -> toCondition(
							r.getStringNE("bd_ctg_cd")
						))
						.addSelect(m -> toArray(
							m.ctg_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("bd_ctg_nm", m.ctg_nm());
					}),
					j -> j
						.add(MAM_OPER_R.class, r -> toCondition(
							r.getStringNE("bd_oper_cd")
						))
						.addSelect(m -> toArray(
							m.oper_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("bd_oper_nm", m.oper_nm());
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
					})
				)
			);
	}
	
	/**
	 * -- MSBDL5170_MST_PURC_ACT_IO_Query_S01
	 */
	public static MCQueryPlan MSBDL5170_MST_PURC_ACT_IO_S01() {
		MST_PURC_ACT_IO_R S0_T01 = MST_PURC_ACT_IO_R.create("T01");
		MST_PURC_ACT_D_R S0_T02 = MST_PURC_ACT_D_R.create("T02");
		MST_PURC_ACT_R S0_T03 = MST_PURC_ACT_R.create("T03");
		MST_ARR_ACT_R S0_T04 = MST_ARR_ACT_R.create("T04");
		MST_PROV_ACT_R S0_T06 = MST_PROV_ACT_R.create("T06");
		MAM_STK_GD_R S0_M01 = MAM_STK_GD_R.create("M01");
		MAM_LOC_R S0_M04 = MAM_LOC_R.create("M04");
		MAM_WG_R S0_M19 = MAM_WG_R.create("M19");
		MAM_STR_LN_R S0_M06 = MAM_STR_LN_R.create("M06");
		MST_ARR_ACT_R S0_T05 = MST_ARR_ACT_R.create("T05");
		MAM_STK_GD_R S0_M30 = MAM_STK_GD_R.create("M30");
		MAM_LOC_R S0_M31 = MAM_LOC_R.create("M31");
		MAM_WG_R S0_M32 = MAM_WG_R.create("M32");
		MAM_STR_LN_R S0_M33 = MAM_STR_LN_R.create("M33");
		MAM_UNIT_R S0_M34 = MAM_UNIT_R.create("M34");
		MAVM_ITM_UNIT_R S0_M35 = MAVM_ITM_UNIT_R.create("M35");
		MAM_UNIT_R S0_M07 = MAM_UNIT_R.create("M07");
		MAVM_ITM_UNIT_R S0_M08 = MAVM_ITM_UNIT_R.create("M08");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBDL5170_MST_PURC_ACT_IO_Query_S01")
					.mainQuery()
					.select(
						nvl2(
							S0_T05.arr_act_no,
							S0_M31.wg_cd,
							S0_T01.in_to_loc_wg_cd
						).as("purc_ret_loc_wg_cd"),
						nvl2(
							S0_T05.arr_act_no,
							S0_M32.wg_nm,
							S0_M19.wg_nm
						).as("purc_ret_loc_wg_nm"),
						nvl2(
							S0_T05.arr_act_no,
							S0_T05.arr_loc_cd,
							S0_T01.in_to_loc_cd
						).as("purc_ret_loc_cd"),
						nvl2(
							S0_T05.arr_act_no,
							S0_M31.loc_nm,
							S0_M04.loc_nm
						).as("purc_ret_loc_nm"),
						nvl2(
							S0_T05.arr_act_no,
							S0_M31.sppl_cd,
							S0_M04.sppl_cd
						).as("purc_ret_sppl_cd"),
						nvl2(
							S0_T05.arr_act_no,
							S0_M31.str_ln_tgt_flg,
							S0_M04.str_ln_tgt_flg
						).as("str_ln_tgt_flg"),
						nvl2(
							S0_T05.arr_act_no,
							S0_T05.str_ln_cd,
							S0_T01.str_ln_cd
						).as("str_ln_cd"),
						nvl2(
							S0_T05.arr_act_no,
							S0_M33.str_ln_nm,
							S0_M06.str_ln_nm
						).as("str_ln_nm"),
						S0_T02.itm_cd,
						S0_T02.itm_sub1,
						S0_T02.itm_sub2,
						S0_T02.itm_sub3,
						S0_T01.ver_no,
						S0_T02.sno1_mng_typ,
						S0_T02.sno2_mng_typ,
						S0_T02.sno3_mng_typ,
						S0_T02.sno4_mng_typ,
						S0_T02.sno1,
						S0_T02.sno2,
						S0_T02.sno3,
						S0_T02.sno4,
						nvl2(
							S0_T05.arr_act_no,
							S0_T05.lot_no,
							decode(
								S0_T01.lot_no,
								value(MSC_PURC_UNFIX_STR.UNFIXED.value()),
								nullValue(),
								S0_T01.lot_no
							)
						).as("lot_no"),
						nvl2(
							S0_T05.arr_act_no,
							S0_T05.sublot_no,
							decode(
								S0_T01.sublot_no,
								value(MSC_PURC_UNFIX_STR.UNFIXED.value()),
								nullValue(),
								S0_T01.sublot_no
							)
						).as("sublot_no"),
						nvl2(
							S0_T05.arr_act_no,
							S0_T05.bp_lot_no,
							S0_T01.bp_lot_no
						).as("bp_lot_no"),
						S0_T01.stk_id_typ,
						S0_T01.stk_insp_typ,
						S0_T01.quality_typ,
						nvl2(
							S0_T05.arr_act_no,
							S0_T05.gd_cd,
							decode(
								S0_T01.gd_cd,
								value(MSC_PURC_UNFIX_STR.UNFIXED.value()),
								nullValue(),
								S0_T01.gd_cd
							)
						).as("gd_cd"),
						nvl2(
							S0_T05.arr_act_no,
							S0_M30.gd_nm,
							S0_M01.gd_nm
						).as("gd_nm"),
						nvl2(
							S0_T05.arr_act_no,
							S0_T05.trd_unit_cd,
							S0_T01.trd_unit_cd
						).as("trd_unit_cd"),
						nvl2(
							S0_T05.arr_act_no,
							S0_M34.unit_nm,
							S0_M07.unit_nm
						).as("trd_unit_nm"),
						nvl2(
							S0_T05.arr_act_no,
							S0_M35.dec_place,
							S0_M08.dec_place
						).as("trd_unit_dec_place"),
						nvl2(
							S0_T05.arr_act_no,
							S0_M35.conv_base_qty,
							S0_M08.conv_base_qty
						).as("trd_unit_dmn_qty"),
						nvl2(
							S0_T05.arr_act_no,
							S0_M35.conv_qty,
							S0_M08.conv_qty
						).as("trd_unit_conv_qty"),
						nvl2(
							S0_T05.arr_act_no,
							S0_M35.rnd_typ,
							S0_M08.rnd_typ
						).as("trd_unit_rnd_typ"),
						nvl2(
							S0_T05.arr_act_no,
							S0_T05.trd_unit_qty,
							S0_T01.trd_unit_qty
						).as("trd_unit_qty"),
						S0_T01.base_unit_qty,
						S0_T01.base_unit_cd,
						S0_T02.purc_act_d_no.as("ref_purc_act_d_no"),
						S0_T02.purc_act_d_seq.as("ref_purc_act_d_seq"),
						S0_T01.purc_act_io_no.as("ref_purc_act_io_no"),
						S0_T01.purc_act_io_seq.as("ref_purc_act_io_seq"),
						S0_T01.sub_char1,
						S0_T01.sub_char2,
						S0_T01.sub_char3,
						nvl2(
							S0_T05.arr_act_no,
							S0_T05.purc_cont_qty,
							S0_T04.purc_cont_qty
						).as("purc_cont_qty"),
						S0_T06.ac_dt.as("base_ac_dt")
					)
					.from(
						S0_T01
						.rightOuterJoin(S0_T02).on(
							bracket(
								S0_T02.purc_act_d_no.eq(S0_T01.purc_act_d_no)
								.and(S0_T02.purc_act_d_seq.eq(S0_T01.purc_act_d_seq))
							)
						)
						.rightOuterJoin(S0_T03).on(
							bracket(
								S0_T03.purc_act_no.eq(S0_T02.purc_act_no)
								.and(S0_T03.purc_act_seq.eq(S0_T02.purc_act_seq))
							)
						)
						.leftOuterJoin(S0_T04).on(
							bracket(
								S0_T01.arr_act_no.eq(S0_T04.arr_act_no)
								.and(S0_T04.can_flg.eq(value(false)))
							)
						)
						.leftOuterJoin(S0_T06).on(
							bracket(
								S0_T06.slip_sts_typ.eq(value(MAC_SLIP_STS_TYP.CRT.value()))
								.and(S0_T06.prov_src_act_typ.eq(value(MSC_PROV_SRC_ACT_TYP.DDLV.value())))
								.and(S0_T01.purc_act_io_no.eq(S0_T06.prov_src_act_no))
							)
						)
						.leftOuterJoin(S0_M01).on(
							bracket(
								S0_T01.gd_cd.eq(S0_M01.gd_cd)
							)
						)
						.leftOuterJoin(S0_M04).on(
							bracket(
								S0_T01.in_to_loc_cd.eq(S0_M04.loc_cd)
							)
						)
						.leftOuterJoin(S0_M19).on(
							bracket(
								S0_M04.wg_cd.eq(S0_M19.wg_cd)
							)
						)
						.leftOuterJoin(S0_M06).on(
							bracket(
								S0_T01.in_to_loc_cd.eq(S0_M06.loc_cd)
								.and(S0_T01.str_ln_cd.eq(S0_M06.str_ln_cd))
							)
						)
						.leftOuterJoin(S0_T05).on(
							bracket(
								S0_T01.purc_act_io_no.eq(S0_T05.purc_act_io_no)
								.and(S0_T05.can_flg.eq(value(false)))
							)
						)
						.leftOuterJoin(S0_M30).on(
							bracket(
								S0_T05.gd_cd.eq(S0_M30.gd_cd)
							)
						)
						.leftOuterJoin(S0_M31).on(
							bracket(
								S0_T05.arr_loc_cd.eq(S0_M31.loc_cd)
							)
						)
						.leftOuterJoin(S0_M32).on(
							bracket(
								S0_M31.wg_cd.eq(S0_M32.wg_cd)
							)
						)
						.leftOuterJoin(S0_M33).on(
							bracket(
								S0_T05.arr_loc_cd.eq(S0_M33.loc_cd)
								.and(S0_T05.str_ln_cd.eq(S0_M33.str_ln_cd))
							)
						)
						.leftOuterJoin(S0_M34).on(
							bracket(
								S0_T05.trd_unit_cd.eq(S0_M34.unit_cd)
							)
						)
						.leftOuterJoin(S0_M35).on(
							bracket(
								S0_T02.itm_cd.eq(S0_M35.itm_cd)
								.and(S0_T02.itm_sub1.eq(S0_M35.itm_sub1))
								.and(S0_T02.itm_sub2.eq(S0_M35.itm_sub2))
								.and(S0_T02.itm_sub3.eq(S0_M35.itm_sub3))
								.and(S0_T05.trd_unit_cd.eq(S0_M35.unit_cd))
							)
						)
						.leftOuterJoin(S0_M07).on(
							bracket(
								S0_T01.trd_unit_cd.eq(S0_M07.unit_cd)
							)
						)
						.leftOuterJoin(S0_M08).on(
							bracket(
								S0_T02.itm_cd.eq(S0_M08.itm_cd)
								.and(S0_T02.itm_sub1.eq(S0_M08.itm_sub1))
								.and(S0_T02.itm_sub2.eq(S0_M08.itm_sub2))
								.and(S0_T02.itm_sub3.eq(S0_M08.itm_sub3))
								.and(S0_T01.trd_unit_cd.eq(S0_M08.unit_cd))
							)
						)
					)
					.where(
						value(0).eq(value(0))
						.and(value(true).eq(MAC_SLIP_STS_TYP$IS_CRT(S0_T03.slip_sts_typ)))
						.and(
							value(true).eq(MAC_TRD_PTN_TYP$IS_PURC(S0_T03.trd_ptn_typ))
							.or(value(true).eq(MAC_TRD_PTN_TYP$IS_PURC_XPNS(S0_T03.trd_ptn_typ)))
						)
						.and(
							S0_T01.stk_id_typ.isNull()
							.or(
								S0_T01.stk_id_typ.in(
									value(MSC_STK_ID_TYP.ACCPT_DFCT.value()),
									value(MSC_STK_ID_TYP.COSTK.value()),
									value(MSC_STK_ID_TYP.RNT_RCV.value()),
									value(MSC_STK_ID_TYP.NCV_RCV.value()),
									value(MSC_STK_ID_TYP.ONR_PROV.value())
								)
							)
						)
						.cutoff$and(S0_T03.purc_act_no.eq(bind("purc_act_no")))
						.cutoff$and(S0_T02.purc_act_d_no.eq(bind("purc_act_d_no")))
					)
					.orderBy(S0_T01.purc_act_io_no.asc())
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
							m.asset_mng_typ,
							m.cont_fctr_dec_place,
							m.cont_fctr_flg,
							m.cont_fctr_rnd_typ,
							m.cont_fctr_unit_cd,
							m.insp_flg,
							m.lot_mng_typ,
							m.lot_no_typ,
							m.std_cont_fctr,
							m.stk_mng_typ,
							m.sublot_mng_typ,
							m.sublot_no_typ,
							m.ver_flg
						))
						.addMap((r, m) -> {
							r.setBooleanNE("ver_flg", m.ver_flg());
							r.setStringNE("lot_mng_typ", m.lot_mng_typ());
							r.setStringNE("lot_no_typ", m.lot_no_typ());
							r.setStringNE("stk_mng_typ", m.stk_mng_typ());
							r.setStringNE("asset_mng_typ", m.asset_mng_typ());
							r.setStringNE("sublot_mng_typ", m.sublot_mng_typ());
							r.setStringNE("sublot_no_typ", m.sublot_no_typ());
							r.setBooleanNE("cont_fctr_flg", m.cont_fctr_flg());
							r.setNumberNE("std_cont_fctr", m.std_cont_fctr());
							r.setStringNE("cont_fctr_unit_cd", m.cont_fctr_unit_cd());
							r.setStringNE("cont_fctr_rnd_typ", m.cont_fctr_rnd_typ());
							r.setNumberNE("cont_fctr_dec_place", m.cont_fctr_dec_place());
							r.setBooleanNE("insp_flg", m.insp_flg());
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
	 * -- MSBDL5170_MST_PURC_ACT_Query_S01
	 */
	public static MCQueryPlan MSBDL5170_MST_PURC_ACT_S01() {
		MST_PURC_ACT_R S0_T01 = MST_PURC_ACT_R.create("T01");
		MAVM_RD_DPT_R S0_M99 = MAVM_RD_DPT_R.create("M99");
		MST_PURC_ACT_D_R S0_T02 = MST_PURC_ACT_D_R.create("T02");
		MAM_TRD_R S0_M01 = MAM_TRD_R.create("M01");
		MAM_DPT_R S0_M02 = MAM_DPT_R.create("M02");
		MAM_BP_R S0_M05 = MAM_BP_R.create("M05");
		MAM_CUR_R S0_M51 = MAM_CUR_R.create("M51");
		MAM_CUR_R S0_M61 = MAM_CUR_R.create("M61");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBDL5170_MST_PURC_ACT_Query_S01")
					.mainQuery()
					.select(
						S0_T01.trd_ptn_typ,
						S0_T01.purc_dpt_cd,
						S0_M02.dpt_nm.as("purc_dpt_nm"),
						S0_M02.ap_dpt_flg,
						S0_T01.wg_cd,
						S0_T01.purc_usr_cd,
						S0_T01.sppl_cd,
						S0_M05.bp_nm.as("sppl_nm"),
						S0_M05.purc_tax_rnd_typ,
						S0_M05.purc_tax_calc_typ,
						S0_M05.purc_amt_rnd_typ,
						S0_M05.purc_upri_cng_flg,
						S0_M05.prnt_lcl_cd,
						S0_M05.subcon_flg,
						S0_M05.repurc_obli_flg,
						nvl(S0_M05.outsrc_upri_typ, value(getCo().outsrc_upri_typ())).as("outsrc_upri_typ"),
						S0_M05.sppl_iv_flg,
						MAPA_BP$F_GET_BP_ADDR(
							S0_T01.sppl_cd,
							bind("addr_dt"),
							value(MAC_BP_ADDR_TYP.SPPL_CNTCT_DPT.value())
						).as("sppl_cntct_dpt"),
						MAPA_BP$F_GET_BP_ADDR(
							S0_T01.sppl_cd,
							bind("addr_dt"),
							value(MAC_BP_ADDR_TYP.SPPL_CNTCT_PSN.value())
						).as("sppl_cntct_psn"),
						MAPA_BP$F_GET_BP_ADDR(
							S0_T01.sppl_cd,
							bind("addr_dt"),
							value(MAC_BP_ADDR_TYP.SPPL_CNTCT_PSN_TITLE.value())
						).as("sppl_cntct_psn_title"),
						MAPA_BP$F_GET_BP_ADDR(
							S0_T01.sppl_cd,
							bind("addr_dt"),
							value(MAC_BP_ADDR_TYP.ZIP_CD.value())
						).as("sppl_zip_cd"),
						MAPA_BP$F_GET_BP_ADDR(
							S0_T01.sppl_cd,
							bind("addr_dt"),
							value(MAC_BP_ADDR_TYP.ADDR1.value())
						).as("sppl_addr1"),
						MAPA_BP$F_GET_BP_ADDR(
							S0_T01.sppl_cd,
							bind("addr_dt"),
							value(MAC_BP_ADDR_TYP.ADDR2.value())
						).as("sppl_addr2"),
						MAPA_BP$F_GET_BP_ADDR(
							S0_T01.sppl_cd,
							bind("addr_dt"),
							value(MAC_BP_ADDR_TYP.ADDR3.value())
						).as("sppl_addr3"),
						MAPA_BP$F_GET_BP_ADDR(
							S0_T01.sppl_cd,
							bind("addr_dt"),
							value(MAC_BP_ADDR_TYP.ADDR4.value())
						).as("sppl_addr4"),
						MAPA_BP$F_GET_BP_ADDR(
							S0_T01.sppl_cd,
							bind("addr_dt"),
							value(MAC_BP_ADDR_TYP.TEL.value())
						).as("sppl_tel"),
						MAPA_BP$F_GET_BP_ADDR(
							S0_T01.sppl_cd,
							bind("addr_dt"),
							value(MAC_BP_ADDR_TYP.FAX.value())
						).as("sppl_fax"),
						S0_M05.cntry_cd.as("sppl_cntry_cd"),
						S0_M05.asppl_cd,
						MAPA_BP$F_GET_AP_DPT_CD_NE(
							S0_M05.asppl_cd,
							bind("dpt_dt"),
							value(false)
						).as("mst_ap_dpt_cd"),
						MAPA_BP$F_GET_AP_DPT_CD_NE2(
							S0_T01.sppl_cd,
							S0_M05.asppl_cd,
							bind("dpt_dt"),
							value(false)
						).as("ap_dpt_cd"),
						S0_T01.trd_cur_cd,
						bind("base_cur_cd").as("base_cur_cd"),
						S0_M51.amt_dec_place.as("base_cur_amt_dec_place"),
						S0_M51.upri_dec_place.as("base_cur_upri_dec_place"),
						bind("ptax_cur_cd").as("ptax_cur_cd"),
						S0_M61.amt_dec_place.as("ptax_cur_amt_dec_place"),
						S0_M61.upri_dec_place.as("ptax_cur_upri_dec_place"),
						S0_T01.xrate,
						S0_T01.ptax_xrate,
						S0_M05.bp_nm.as("ret_sppl_nm"),
						MAPA_BP$F_GET_BP_ADDR(
							S0_T01.sppl_cd,
							bind("addr_dt"),
							value(MAC_BP_ADDR_TYP.SPPL_CNTCT_DPT.value())
						).as("ret_sppl_cntct_dpt"),
						MAPA_BP$F_GET_BP_ADDR(
							S0_T01.sppl_cd,
							bind("addr_dt"),
							value(MAC_BP_ADDR_TYP.SPPL_CNTCT_PSN.value())
						).as("ret_sppl_cntct_psn"),
						MAPA_BP$F_GET_BP_ADDR(
							S0_T01.sppl_cd,
							bind("addr_dt"),
							value(MAC_BP_ADDR_TYP.SPPL_CNTCT_PSN_TITLE.value())
						).as("ret_sppl_cntct_psn_title"),
						MAPA_BP$F_GET_BP_ADDR(
							S0_T01.sppl_cd,
							bind("addr_dt"),
							value(MAC_BP_ADDR_TYP.ZIP_CD.value())
						).as("ret_sppl_zip_cd"),
						MAPA_BP$F_GET_BP_ADDR(
							S0_T01.sppl_cd,
							bind("addr_dt"),
							value(MAC_BP_ADDR_TYP.ADDR1.value())
						).as("ret_sppl_addr1"),
						MAPA_BP$F_GET_BP_ADDR(
							S0_T01.sppl_cd,
							bind("addr_dt"),
							value(MAC_BP_ADDR_TYP.ADDR2.value())
						).as("ret_sppl_addr2"),
						MAPA_BP$F_GET_BP_ADDR(
							S0_T01.sppl_cd,
							bind("addr_dt"),
							value(MAC_BP_ADDR_TYP.ADDR3.value())
						).as("ret_sppl_addr3"),
						MAPA_BP$F_GET_BP_ADDR(
							S0_T01.sppl_cd,
							bind("addr_dt"),
							value(MAC_BP_ADDR_TYP.ADDR4.value())
						).as("ret_sppl_addr4"),
						MAPA_BP$F_GET_BP_ADDR(
							S0_T01.sppl_cd,
							bind("addr_dt"),
							value(MAC_BP_ADDR_TYP.TEL.value())
						).as("ret_sppl_tel"),
						MAPA_BP$F_GET_BP_ADDR(
							S0_T01.sppl_cd,
							bind("addr_dt"),
							value(MAC_BP_ADDR_TYP.FAX.value())
						).as("ret_sppl_fax"),
						S0_T01.rcpt_iv_no.as("ref_rcpt_iv_no"),
						S0_T01.tterm_cd1,
						S0_T01.tterm_rmrks1,
						S0_T01.tterm_cd2,
						S0_T01.tterm_rmrks2,
						S0_T01.tterm_cd3,
						S0_T01.tterm_rmrks3,
						S0_T01.ins_usr_id,
						S0_T01.ins_usr_nm,
						S0_T01.ins_func_id,
						S0_T01.ins_ts,
						S0_T01.upd_usr_id,
						S0_T01.upd_usr_nm,
						S0_T01.upd_func_id,
						S0_T01.upd_ts
					)
					.from(
						S0_T01
						.innerJoin(S0_M99).on(
							bracket(
								S0_T01.purc_dpt_cd.eq(S0_M99.dpt_cd)
							)
						)
						.leftOuterJoin(S0_T02).on(
							bracket(
								S0_T02.purc_act_d_no.eq(bind("purc_act_d_no"))
								.and(S0_T01.purc_act_no.eq(S0_T02.purc_act_no))
								.and(S0_T01.purc_act_seq.eq(S0_T02.purc_act_seq))
							)
						)
						.leftOuterJoin(S0_M01).on(
							bracket(
								S0_T01.trd_cd.eq(S0_M01.trd_cd)
							)
						)
						.leftOuterJoin(S0_M02).on(
							bracket(
								S0_T01.purc_dpt_cd.eq(S0_M02.dpt_cd)
								.and(bind("dpt_dt").between(S0_M02.st_dt, S0_M02.end_dt))
							)
						)
						.leftOuterJoin(S0_M05).on(
							bracket(
								S0_T01.sppl_cd.eq(S0_M05.bp_cd)
							)
						)
						.leftOuterJoin(S0_M51).on(
							bracket(
								bind("base_cur_cd").eq(S0_M51.cur_cd)
							)
						)
						.leftOuterJoin(S0_M61).on(
							bracket(
								bind("ptax_cur_cd").eq(S0_M61.cur_cd)
							)
						)
					)
					.where(
						value(0).eq(value(0))
						.and(value(true).eq(MAC_SLIP_STS_TYP$IS_CRT(S0_T01.slip_sts_typ)))
						.and(
							value(true).eq(MAC_TRD_PTN_TYP$IS_PURC(S0_T01.trd_ptn_typ))
							.or(value(true).eq(MAC_TRD_PTN_TYP$IS_PURC_XPNS(S0_T01.trd_ptn_typ)))
						)
						.cutoff$and(S0_T01.purc_act_no.eq(bind("purc_act_no")))
						.cutoff$and(S0_T02.purc_act_d_no.eq(bind("purc_act_d_no")))
					)
			)
			.setJoinInfo(
				joinInfo(
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
						.add(MAM_BP_R.class, r -> toCondition(
							r.getStringNE("asppl_cd")
						))
						.addSelect(m -> toArray(
							m.bp_nm,
							m.bsppl_cd
						))
						.addMap((r, m) -> {
							r.setStringNE("asppl_nm", m.bp_nm());
							r.setStringNE("join_bsppl_cd_", m.bsppl_cd());
					}),
					j -> j
						.add(MAM_BP_R.class, r -> toCondition(
							r.getStringNE("join_bsppl_cd_")
						))
						.addSelect(m -> toArray(
							m.pay_spot_flg
						))
						.addMap((r, m) -> {
							r.setBooleanNE("pay_spot_flg", m.pay_spot_flg());
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
	 * -- MSBDL5170_MST_PURC_RET_ACT_D_Query_S01
	 */
	public static MCQueryPlan MSBDL5170_MST_PURC_RET_ACT_D_S01() {
		MST_PURC_RET_ACT_D_P_R S0_T01 = MST_PURC_RET_ACT_D_P_R.create("T01");
		MST_PURC_RET_ACT_P_R S0_T00 = MST_PURC_RET_ACT_P_R.create("T00");
		MCTempView S0_T02 = createTempView("T02");
		MST_PURC_ACT_R S0_T05 = MST_PURC_ACT_R.create("T05");
		MST_PURC_RET_SCHD_D_R S0_T03 = MST_PURC_RET_SCHD_D_R.create("T03");
		MCTempView S0_T031 = createTempView("T031");
		MSVT_WRK_SNO_R S0_T19 = MSVT_WRK_SNO_R.create("T19");
		MAM_STK_GD_R S0_M01 = MAM_STK_GD_R.create("M01");
		MAM_DPT_R S0_M02 = MAM_DPT_R.create("M02");
		MAM_BIZ_RSN_R S0_M03 = MAM_BIZ_RSN_R.create("M03");
		MAM_LOC_R S0_M04 = MAM_LOC_R.create("M04");
		MAM_BP_R S0_M05 = MAM_BP_R.create("M05");
		MAM_BP_R S0_M55 = MAM_BP_R.create("M55");
		MAM_STR_LN_R S0_M06 = MAM_STR_LN_R.create("M06");
		MAM_UNIT_R S0_M07 = MAM_UNIT_R.create("M07");
		MAVM_ITM_UNIT_R S0_M08 = MAVM_ITM_UNIT_R.create("M08");
		MAVM_ITM_UNIT_R S0_M081 = MAVM_ITM_UNIT_R.create("M081");
		MAM_UNIT_R S0_M09 = MAM_UNIT_R.create("M09");
		MAVM_ITM_UNIT_R S0_M10 = MAVM_ITM_UNIT_R.create("M10");
		MAM_TAX_R S0_M11 = MAM_TAX_R.create("M11");
		MAM_ITM_R S0_M12 = MAM_ITM_R.create("M12");
		MAM_LOC_R S0_M13 = MAM_LOC_R.create("M13");
		MAM_DPT_R S0_M14 = MAM_DPT_R.create("M14");
		MAM_WG_R S0_M15 = MAM_WG_R.create("M15");
		MAM_COST_CTG_R S0_M16 = MAM_COST_CTG_R.create("M16");
		MAM_OPER_R S0_M17 = MAM_OPER_R.create("M17");
		MAM_BP_R S0_M18 = MAM_BP_R.create("M18");
		MAM_WG_R S0_M19 = MAM_WG_R.create("M19");
		MAM_ITM_R S0_M20 = MAM_ITM_R.create("M20");
		MAM_UNIT_R S0_M21 = MAM_UNIT_R.create("M21");
		MAM_BP_R S0_M22 = MAM_BP_R.create("M22");
		MAM_ITM_LCL_R S0_M23 = MAM_ITM_LCL_R.create("M23");
		MAM_BIZ_RSN_R S0_M34 = MAM_BIZ_RSN_R.create("M34");
		MAM_TAX_R S0_M35 = MAM_TAX_R.create("M35");
		MST_PURC_ACT_D_R S1_ST1 = MST_PURC_ACT_D_R.create("ST1");
		MCTempView S2_V1 = createTempView("V1");
		MST_PURC_ACT_R S3_ST2 = MST_PURC_ACT_R.create("ST2");
		MST_PURC_RET_ACT_D_R S4_ST3 = MST_PURC_RET_ACT_D_R.create("ST3");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBDL5170_MST_PURC_RET_ACT_D_Query_S01")
					.mainQuery()
					.select(
						S0_T03.trd_unit_cd.as("schd_trd_unit_cd"),
						S0_M081.dec_place.as("schd_trd_unit_dec_place"),
						S0_M081.conv_base_qty.as("schd_trd_unit_dmn_qty"),
						S0_M081.conv_qty.as("schd_trd_unit_conv_qty"),
						S0_M081.rnd_typ.as("schd_trd_unit_rnd_typ"),
						S0_T03.trd_unit_qty.as("schd_trd_unit_qty"),
						S0_T03.base_unit_qty.as("schd_base_unit_qty"),
						S0_T03.trd_cur_upri.as("schd_trd_cur_upri"),
						S0_T03.trd_cur_dscnt_amt.as("schd_trd_cur_dscnt_amt"),
						S0_T03.trd_cur_proc_amt.as("schd_trd_cur_proc_amt"),
						S0_T03.trd_cur_onr_prov_amt.as("schd_trd_cur_onr_prov_amt"),
						S0_T03.trd_cur_proc_upri.as("schd_trd_cur_proc_upri"),
						S0_T03.trd_cur_onr_prov_upri.as("schd_trd_cur_onr_prov_upri"),
						S0_T03.trd_cur_amt.as("schd_trd_cur_amt"),
						S0_T03.trd_cur_tax_amt.as("schd_trd_cur_tax_amt"),
						S0_T01.purc_ret_act_d_no,
						S0_T01.purc_ret_act_no,
						S0_T01.purc_ret_act_rev,
						S0_T01.ref_purc_act_no,
						S0_T01.ref_purc_act_seq,
						S0_T05.purc_act_rev.as("ref_purc_act_rev"),
						S0_T01.ref_purc_act_d_no,
						S0_T01.ref_purc_act_d_seq,
						S0_T02.pr("base_purc_ac_dt"),
						S0_T01.disp_seq,
						S0_T01.mfg_inst_no,
						S0_T01.purc_ret_schd_d_no,
						S0_T01.itm_cd,
						S0_T01.itm_sub1,
						S0_T01.itm_sub2,
						S0_T01.itm_sub3,
						S0_M20.ver_flg,
						S0_T01.ver_no,
						decode(
							S0_T01.sundry_itm_flg,
							value(true),
							S0_T01.itm_nm,
							S0_M20.itm_nm
						).as("itm_nm"),
						decode(
							S0_M22.sppl_iv_flg,
							value(true),
							decode(
								S0_T01.sundry_itm_flg,
								value(true),
								S0_T01.iv_itm_nm,
								S0_M23.itm_nm
							),
							nullValue()
						).as("iv_itm_nm"),
						S0_M20.stk_mng_typ,
						S0_M20.sno1_mng_typ,
						S0_M20.sno2_mng_typ,
						S0_M20.sno3_mng_typ,
						S0_M20.sno4_mng_typ,
						S0_M20.asset_mng_typ,
						S0_T01.sno1,
						S0_T01.sno2,
						S0_T01.sno3,
						S0_T01.sno4,
						S0_T19.wrk_no,
						S0_T19.wrk_nm,
						S0_T01.lot_no,
						S0_T01.sublot_no,
						S0_T01.bp_lot_no,
						S0_T01.purc_typ,
						S0_T01.in_xfr_typ,
						S0_T01.quality_typ,
						S0_T01.stk_insp_typ,
						S0_T01.stk_id_typ,
						S0_T01.stk_arrv_bp_cd,
						S0_M55.bp_nm.as("stk_arrv_bp_nm"),
						S0_T01.gd_cd,
						S0_M01.gd_nm,
						S0_T02.pr("ap_dpt_cd"),
						S0_M02.dpt_nm.as("ap_dpt_nm"),
						S0_T02.pr("pay_crryovr_times"),
						S0_T01.ret_rsn_cd,
						S0_M03.biz_rsn_nm.as("ret_rsn_nm"),
						S0_M03.xpns_purc_flg.as("xpns_purc_flg"),
						S0_T01.po_no,
						S0_T01.sundry_itm_flg,
						S0_M20.dscnt_itm_flg,
						S0_M20.arr_skip_flg,
						S0_M20.purc_upri_cng_flg.as("itm_purc_upri_cng_flg"),
						S0_M20.ver_flg,
						S0_T01.sppl_itm_cd,
						S0_T01.sppl_itm_nm,
						S0_T01.purc_ret_loc_wg_cd,
						S0_M19.wg_nm.as("purc_ret_loc_wg_nm"),
						S0_T01.purc_ret_loc_cd,
						S0_M04.loc_nm.as("purc_ret_loc_nm"),
						S0_M04.sppl_cd.as("purc_ret_sppl_cd"),
						S0_M04.loc_mng_typ,
						S0_T01.maker_cd,
						S0_M05.bp_nm.as("maker_nm"),
						S0_M04.str_ln_tgt_flg,
						S0_T01.str_ln_cd,
						S0_M06.str_ln_nm,
						S0_T01.trd_unit_qty,
						S0_T01.trd_unit_cd,
						S0_M07.unit_nm.as("trd_unit_nm"),
						S0_M08.dec_place.as("trd_unit_dec_place"),
						S0_M08.conv_base_qty.as("trd_unit_dmn_qty"),
						S0_M08.conv_qty.as("trd_unit_conv_qty"),
						S0_M08.rnd_typ.as("trd_unit_rnd_typ"),
						S0_T01.base_unit_qty,
						S0_T01.base_unit_cd,
						S0_T03.cmpl_flg,
						S0_T03.abort_flg,
						S0_T03.base_unit_qty.as("schd_qty"),
						S0_M09.unit_nm.as("base_unit_nm"),
						S0_M10.dec_place.as("base_unit_dec_place"),
						S0_M10.rnd_typ.as("base_unit_rnd_typ"),
						S0_T031.pr("ret_qty"),
						S0_T02.pr("interim_flg"),
						S0_T02.pr("tax_cd"),
						S0_M11.tax_nm,
						S0_M11.tax_rate,
						S0_M11.tax_typ,
						S0_M11.inc_tax_flg,
						S0_M35.tax_rate.as("schd_tax_rate"),
						S0_M35.inc_tax_flg.as("schd_inc_tax_flg"),
						S0_T02.pr("upri_not_tgt_flg"),
						S0_T02.pr("purc_dtl_upd_flg"),
						S0_T02.pr("trd_cur_upri"),
						S0_T02.pr("trd_cur_dscnt_amt"),
						S0_T02.pr("trd_cur_proc_amt"),
						S0_T02.pr("trd_cur_onr_prov_amt"),
						S0_T02.pr("trd_cur_proc_upri"),
						S0_T02.pr("trd_cur_onr_prov_upri"),
						S0_T02.pr("trd_cur_amt"),
						S0_T02.pr("trd_cur_tax_amt"),
						S0_T02.pr("trd_cur_amt").add(S0_T02.pr("trd_cur_tax_amt")).as("trd_cur_inc_tax_amt"),
						S0_T02.pr("base_cur_upri"),
						S0_T02.pr("base_cur_dscnt_amt"),
						S0_T02.pr("base_cur_proc_amt"),
						S0_T02.pr("base_cur_onr_prov_amt"),
						S0_T02.pr("base_cur_proc_upri"),
						S0_T02.pr("base_cur_onr_prov_upri"),
						S0_T02.pr("base_cur_amt"),
						S0_T02.pr("base_cur_tax_amt"),
						S0_T02.pr("base_cur_amt").add(S0_T02.pr("base_cur_tax_amt")).as("base_cur_inc_tax_amt"),
						S0_T02.pr("ptax_cur_upri"),
						S0_T02.pr("ptax_cur_dscnt_amt"),
						S0_T02.pr("ptax_cur_proc_amt"),
						S0_T02.pr("ptax_cur_onr_prov_amt"),
						S0_T02.pr("ptax_cur_proc_upri"),
						S0_T02.pr("ptax_cur_onr_prov_upri"),
						S0_T02.pr("ptax_cur_amt"),
						S0_T02.pr("ptax_cur_tax_amt"),
						S0_T02.pr("ptax_cur_amt").add(S0_T02.pr("ptax_cur_tax_amt")).as("ptax_cur_inc_tax_amt"),
						S0_T02.pr("dscnt_rsn_cd"),
						S0_M34.biz_rsn_nm.as("dscnt_rsn_nm"),
						S0_T02.pr("wtax_rate"),
						S0_T02.pr("wtax_amt"),
						S0_T01.purc_id_typ,
						S0_T01.purc_cont_qty,
						S0_T02.pr("bd_itm_cd"),
						S0_T02.pr("bd_itm_sub1"),
						S0_T02.pr("bd_itm_sub2"),
						S0_T02.pr("bd_itm_sub3"),
						S0_M12.itm_nm.as("bd_itm_nm"),
						S0_M12.lot_mng_typ.as("bd_lot_mng_typ"),
						S0_M12.lot_no_typ.as("bd_lot_no_typ"),
						S0_M12.sublot_mng_typ.as("bd_sublot_mng_typ"),
						S0_M12.sublot_no_typ.as("bd_sublot_no_typ"),
						S0_M12.sno1_mng_typ.as("bd_sno1_mng_typ"),
						S0_M12.sno2_mng_typ.as("bd_sno2_mng_typ"),
						S0_M12.sno3_mng_typ.as("bd_sno3_mng_typ"),
						S0_M12.sno4_mng_typ.as("bd_sno4_mng_typ"),
						S0_T02.pr("bd_sno1"),
						S0_T02.pr("bd_sno2"),
						S0_T02.pr("bd_sno3"),
						S0_T02.pr("bd_sno4"),
						S0_T02.pr("bd_loc_cd"),
						S0_M13.loc_nm.as("bd_loc_nm"),
						S0_T02.pr("bd_lot_no"),
						S0_T02.pr("bd_sublot_no"),
						S0_T02.pr("mfg_inst_no"),
						S0_T02.pr("bd_dpt_cd"),
						S0_M14.dpt_nm.as("bd_dpt_nm"),
						S0_T02.pr("bd_wg_cd"),
						S0_M15.wg_nm.as("bd_wg_nm"),
						S0_T02.pr("bd_ctg_cd"),
						S0_M16.ctg_nm.as("bd_ctg_nm"),
						S0_T02.pr("bd_oper_cd"),
						S0_M17.oper_nm.as("bd_oper_nm"),
						S0_T02.pr("bd_po_no"),
						S0_T02.pr("bd_slo_no"),
						S0_T02.pr("bd_iv_no"),
						S0_T02.pr("bd_bp_cd"),
						S0_M18.bp_nm.as("bd_bp_nm"),
						S0_T01.intr_rmrks,
						S0_T01.purc_ret_print_d_rmrks,
						S0_T01.trd_d_rmrks,
						S0_T01.sub_char1,
						S0_T01.sub_char2,
						S0_T01.sub_char3,
						S0_T01.purc_cont_qty,
						S0_T01.sls_act_d_no,
						S0_M20.cont_fctr_flg,
						S0_M20.std_cont_fctr.as("purc_cont_fctr"),
						S0_M20.std_cont_fctr,
						S0_M20.cont_fctr_unit_cd,
						S0_M21.unit_nm.as("cont_fctr_unit_nm"),
						S0_M20.cont_fctr_rnd_typ,
						S0_M20.cont_fctr_dec_place,
						S0_M20.lot_mng_typ,
						S0_M20.sublot_mng_typ,
						S0_T03.tax_fix_flg,
						S0_M20.insp_flg
					)
					.from(
						S0_T01
						.innerJoin(S0_T00).on(
							bracket(
								S0_T01.purc_ret_act_no.eq(S0_T00.purc_ret_act_no)
								.and(S0_T01.purc_ret_act_rev.eq(S0_T00.purc_ret_act_rev))
								.and(
									S0_T00.can_flg.eq(value(true))
									.or(S0_T01.can_flg.eq(value(false)))
								)
							)
						)
						.leftOuterJoin(
							subQuery()
							.select(S1_ST1.prAll())
							.from(S1_ST1)
							.where(
								exists(
									subQuery()
									.select(value("X"))
									.from(
										subQuery()
										.select(
											S3_ST2.purc_act_no,
											max(S3_ST2.purc_act_seq).as("max_purc_act_seq")
										)
										.from(S3_ST2)
										.where(
											S3_ST2.purc_ret_act_no.eq(bind("purc_ret_act_no"))
											.and(S3_ST2.purc_ret_act_rev.eq(bind("purc_ret_act_rev")))
											.and(
												S3_ST2.slip_sts_typ.eq(value(MAC_SLIP_STS_TYP.CRT.value()))
												.or(S3_ST2.slip_sts_typ.eq(value(MAC_SLIP_STS_TYP.DIS.value())))
											)
										)
										.groupBy(S3_ST2.purc_act_no).view(S2_V1)
									)
									.where(
										S2_V1.pr(S3_ST2.purc_act_no).eq(S1_ST1.purc_act_no)
										.and(S2_V1.pr("max_purc_act_seq").eq(S1_ST1.purc_act_seq))
									)
								)
							).view(S0_T02)
						).on(
							bracket(
								S0_T01.purc_ret_act_d_no.eq(S0_T02.pr("purc_ret_act_d_no"))
							)
						)
						.leftOuterJoin(S0_T05).on(
							bracket(
								S0_T01.ref_purc_act_no.eq(S0_T05.purc_act_no)
								.and(S0_T01.ref_purc_act_seq.eq(S0_T05.purc_act_seq))
								.and(value(true).eq(MAC_SLIP_STS_TYP$IS_CRT(S0_T05.slip_sts_typ)))
							)
						)
						.leftOuterJoin(S0_T03).on(
							bracket(
								S0_T01.purc_ret_schd_d_no.eq(S0_T03.purc_ret_schd_d_no)
							)
						)
						.leftOuterJoin(
							subQuery()
							.select(
								S4_ST3.purc_ret_schd_d_no,
								sum(S4_ST3.base_unit_qty).as("ret_qty")
							)
							.from(S4_ST3)
							.where(
								S4_ST3.can_flg.eq(value(false))
							)
							.groupBy(S4_ST3.purc_ret_schd_d_no).view(S0_T031)
						).on(
							bracket(
								S0_T03.purc_ret_schd_d_no.eq(S0_T031.pr(S4_ST3.purc_ret_schd_d_no))
							)
						)
						.leftOuterJoin(S0_T19).on(
							bracket(
								S0_T01.sno1.eq(S0_T19.sno1)
							)
						)
						.leftOuterJoin(S0_M01).on(
							bracket(
								S0_T01.gd_cd.eq(S0_M01.gd_cd)
							)
						)
						.leftOuterJoin(S0_M02).on(
							bracket(
								S0_T02.pr("ap_dpt_cd").eq(S0_M02.dpt_cd)
								.and(S0_T00.ac_dt.between(S0_M02.st_dt, S0_M02.end_dt))
							)
						)
						.leftOuterJoin(S0_M03).on(
							bracket(
								S0_T01.ret_rsn_cd.eq(S0_M03.biz_rsn_cd)
							)
						)
						.leftOuterJoin(S0_M04).on(
							bracket(
								S0_T01.purc_ret_loc_cd.eq(S0_M04.loc_cd)
							)
						)
						.leftOuterJoin(S0_M05).on(
							bracket(
								S0_T01.maker_cd.eq(S0_M05.bp_cd)
							)
						)
						.leftOuterJoin(S0_M55).on(
							bracket(
								S0_T01.stk_arrv_bp_cd.eq(S0_M55.bp_cd)
							)
						)
						.leftOuterJoin(S0_M06).on(
							bracket(
								S0_T01.purc_ret_loc_cd.eq(S0_M06.loc_cd)
								.and(S0_T01.str_ln_cd.eq(S0_M06.str_ln_cd))
							)
						)
						.leftOuterJoin(S0_M07).on(
							bracket(
								S0_T01.trd_unit_cd.eq(S0_M07.unit_cd)
							)
						)
						.leftOuterJoin(S0_M08).on(
							bracket(
								S0_T01.itm_cd.eq(S0_M08.itm_cd)
								.and(S0_T01.itm_sub1.eq(S0_M08.itm_sub1))
								.and(S0_T01.itm_sub2.eq(S0_M08.itm_sub2))
								.and(S0_T01.itm_sub3.eq(S0_M08.itm_sub3))
								.and(S0_T01.trd_unit_cd.eq(S0_M08.unit_cd))
							)
						)
						.leftOuterJoin(S0_M081).on(
							bracket(
								S0_T03.itm_cd.eq(S0_M081.itm_cd)
								.and(S0_T03.itm_sub1.eq(S0_M081.itm_sub1))
								.and(S0_T03.itm_sub2.eq(S0_M081.itm_sub2))
								.and(S0_T03.itm_sub3.eq(S0_M081.itm_sub3))
								.and(S0_T03.trd_unit_cd.eq(S0_M081.unit_cd))
							)
						)
						.leftOuterJoin(S0_M09).on(
							bracket(
								S0_M09.unit_cd.eq(S0_T01.base_unit_cd)
							)
						)
						.leftOuterJoin(S0_M10).on(
							bracket(
								S0_T01.itm_cd.eq(S0_M10.itm_cd)
								.and(S0_T01.itm_sub1.eq(S0_M10.itm_sub1))
								.and(S0_T01.itm_sub2.eq(S0_M10.itm_sub2))
								.and(S0_T01.itm_sub3.eq(S0_M10.itm_sub3))
								.and(S0_T01.base_unit_cd.eq(S0_M10.unit_cd))
							)
						)
						.leftOuterJoin(S0_M11).on(
							bracket(
								S0_T02.pr("tax_cd").eq(S0_M11.tax_cd)
							)
						)
						.leftOuterJoin(S0_M12).on(
							bracket(
								S0_T02.pr("bd_itm_cd").eq(S0_M12.itm_cd)
								.and(S0_T02.pr("bd_itm_sub1").eq(S0_M12.itm_sub1))
								.and(S0_T02.pr("bd_itm_sub2").eq(S0_M12.itm_sub2))
								.and(S0_T02.pr("bd_itm_sub3").eq(S0_M12.itm_sub3))
							)
						)
						.leftOuterJoin(S0_M13).on(
							bracket(
								S0_T02.pr("bd_loc_cd").eq(S0_M13.loc_cd)
							)
						)
						.leftOuterJoin(S0_M14).on(
							bracket(
								S0_T02.pr("bd_dpt_cd").eq(S0_M14.dpt_cd)
								.and(S0_T00.ac_dt.between(S0_M14.st_dt, S0_M14.end_dt))
							)
						)
						.leftOuterJoin(S0_M15).on(
							bracket(
								S0_T02.pr("bd_wg_cd").eq(S0_M15.wg_cd)
							)
						)
						.leftOuterJoin(S0_M16).on(
							bracket(
								S0_T02.pr("bd_ctg_cd").eq(S0_M16.ctg_cd)
							)
						)
						.leftOuterJoin(S0_M17).on(
							bracket(
								S0_T02.pr("bd_oper_cd").eq(S0_M17.oper_cd)
							)
						)
						.leftOuterJoin(S0_M18).on(
							bracket(
								S0_T02.pr("bd_bp_cd").eq(S0_M18.bp_cd)
							)
						)
						.leftOuterJoin(S0_M19).on(
							bracket(
								S0_T01.purc_ret_loc_wg_cd.eq(S0_M19.wg_cd)
							)
						)
						.leftOuterJoin(S0_M20).on(
							bracket(
								S0_T01.itm_cd.eq(S0_M20.itm_cd)
								.and(S0_T01.itm_sub1.eq(S0_M20.itm_sub1))
								.and(S0_T01.itm_sub2.eq(S0_M20.itm_sub2))
								.and(S0_T01.itm_sub3.eq(S0_M20.itm_sub3))
							)
						)
						.leftOuterJoin(S0_M21).on(
							bracket(
								S0_M20.cont_fctr_unit_cd.eq(S0_M21.unit_cd)
							)
						)
						.leftOuterJoin(S0_M22).on(
							bracket(
								S0_T00.sppl_cd.eq(S0_M22.bp_cd)
							)
						)
						.leftOuterJoin(S0_M23).on(
							bracket(
								S0_T01.itm_cd.eq(S0_M23.itm_cd)
								.and(S0_T01.itm_sub1.eq(S0_M23.itm_sub1))
								.and(S0_T01.itm_sub2.eq(S0_M23.itm_sub2))
								.and(S0_T01.itm_sub3.eq(S0_M23.itm_sub3))
								.and(S0_M23.lcl_cd.eq(S0_M22.prnt_lcl_cd))
							)
						)
						.leftOuterJoin(S0_M34).on(
							bracket(
								S0_T02.pr("dscnt_rsn_cd").eq(S0_M34.biz_rsn_cd)
							)
						)
						.leftOuterJoin(S0_M35).on(
							bracket(
								S0_T03.tax_cd.eq(S0_M35.tax_cd)
							)
						)
					)
					.where(
						value(0).eq(value(0))
						.and(S0_T01.purc_ret_act_no.eq(bind("purc_ret_act_no")))
						.and(S0_T01.purc_ret_act_rev.eq(bind("purc_ret_act_rev")))
						.and(
							bracket(
								bind("tmp_can_flg").eq(value(true))
								.and(bind("tmp_latest_flg").eq(value(true)))
								.and(
									bracket(
										bind("can_flg").eq(value(true))
										.and(bind("upd_srv_req_no").eq(S0_T01.upd_srv_req_no))
									)
									.or(
										bind("can_flg").eq(value(false))
										.and(S0_T01.can_flg.eq(value(false)))
									)
								)
							)
							.or(
								bind("tmp_can_flg").eq(value(true))
								.and(bind("tmp_latest_flg").eq(value(false)))
							)
							.or(
								bind("tmp_can_flg").eq(value(false))
								.and(S0_T01.can_flg.eq(value(false)))
							)
						)
					)
					.orderBy(S0_T01.disp_seq.asc())
			);
	}
	
	/**
	 * -- MSBDL5170_MST_PURC_RET_ACT_IO_Query_S01
	 */
	public static MCQueryPlan MSBDL5170_MST_PURC_RET_ACT_IO_S01() {
		MST_PURC_RET_ACT_IO_P_R S0_T01 = MST_PURC_RET_ACT_IO_P_R.create("T01");
		MST_PURC_RET_ACT_P_R S0_T00 = MST_PURC_RET_ACT_P_R.create("T00");
		MST_PURC_RET_ACT_D_R S0_T02 = MST_PURC_RET_ACT_D_R.create("T02");
		MST_PROV_ACT_R S0_T03 = MST_PROV_ACT_R.create("T03");
		
		return createQueryPlan()
			.setQuery(
				sql("MSBDL5170_MST_PURC_RET_ACT_IO_Query_S01")
					.mainQuery()
					.select(
						S0_T01.purc_ret_act_io_no,
						S0_T01.purc_ret_act_d_no,
						S0_T01.purc_ret_act_rev,
						S0_T01.purc_ret_loc_wg_cd,
						S0_T01.purc_ret_loc_cd,
						S0_T01.str_ln_cd,
						S0_T02.itm_cd,
						S0_T02.itm_sub1,
						S0_T02.itm_sub2,
						S0_T02.itm_sub3,
						S0_T01.ver_no,
						S0_T01.lot_no,
						S0_T01.sublot_no,
						S0_T01.bp_lot_no,
						S0_T01.stk_id_typ,
						S0_T01.stk_insp_typ,
						S0_T01.quality_typ,
						S0_T01.stk_arrv_bp_cd,
						S0_T01.gd_cd,
						S0_T01.in_xfr_typ,
						S0_T01.trd_unit_cd,
						S0_T01.trd_unit_qty,
						S0_T01.base_unit_cd,
						S0_T01.base_unit_qty,
						S0_T01.pack_unit_cd,
						S0_T01.pack_unit_qty,
						S0_T01.purc_cont_qty,
						S0_T01.ref_arr_act_no,
						S0_T01.ref_arr_act_rev,
						S0_T01.ref_purc_act_io_no,
						S0_T01.ref_purc_act_io_seq,
						S0_T01.purc_ret_schd_io_no,
						S0_T01.sls_act_io_no,
						S0_T01.sub_char1,
						S0_T01.sub_char2,
						S0_T01.sub_char3,
						S0_T03.base_ac_dt
					)
					.from(
						S0_T01
						.innerJoin(S0_T00).on(
							bracket(
								S0_T01.purc_ret_act_no.eq(S0_T00.purc_ret_act_no)
								.and(S0_T01.purc_ret_act_rev.eq(S0_T00.purc_ret_act_rev))
								.and(
									S0_T00.can_flg.eq(value(true))
									.or(S0_T01.can_flg.eq(value(false)))
								)
							)
						)
						.rightOuterJoin(S0_T02).on(
							bracket(
								S0_T02.purc_ret_act_d_no.eq(S0_T01.purc_ret_act_d_no)
							)
						)
						.leftOuterJoin(S0_T03).on(
							bracket(
								S0_T03.slip_sts_typ.eq(value(MAC_SLIP_STS_TYP.CRT.value()))
								.and(S0_T03.prov_src_act_typ.eq(value(MSC_PROV_SRC_ACT_TYP.RET_DDLV.value())))
								.and(S0_T01.purc_ret_act_io_no.eq(S0_T03.prov_src_act_no))
							)
						)
					)
					.where(
						value(0).eq(value(0))
						.and(S0_T01.purc_ret_act_no.eq(bind("purc_ret_act_no")))
						.and(S0_T01.purc_ret_act_rev.eq(bind("purc_ret_act_rev")))
						.and(
							bracket(
								bind("tmp_can_flg").eq(value(true))
								.and(bind("tmp_latest_flg").eq(value(true)))
								.and(
									bracket(
										bind("can_flg").eq(value(true))
										.and(bind("upd_srv_req_no").eq(S0_T01.upd_srv_req_no))
									)
									.or(
										bind("can_flg").eq(value(false))
										.and(S0_T01.can_flg.eq(value(false)))
									)
								)
							)
							.or(
								bind("tmp_can_flg").eq(value(true))
								.and(bind("tmp_latest_flg").eq(value(false)))
							)
							.or(
								bind("tmp_can_flg").eq(value(false))
								.and(S0_T01.can_flg.eq(value(false)))
							)
						)
					)
					.orderBy(S0_T01.purc_ret_act_io_no.asc())
			)
			.setJoinInfo(
				joinInfo(
					j -> j
						.add(MST_PURC_RET_SCHD_IO_R.class, r -> toCondition(
							r.getStringNE("purc_ret_schd_io_no")
						))
						.addSelect(m -> toArray(
							m.io_schd_pr_no,
							m.purc_ret_schd_d_no
						))
						.addMap((r, m) -> {
							r.setStringNE("io_schd_pr_no", m.io_schd_pr_no());
							r.setStringNE("join_purc_ret_schd_d_no_", m.purc_ret_schd_d_no());
					}),
					j -> j
						.add(MST_PURC_RET_SCHD_D_R.class, r -> toCondition(
							r.getStringNE("join_purc_ret_schd_d_no_")
						))
						.addSelect(m -> toArray(
							m.trd_unit_cd
						))
						.addMap((r, m) -> {
							r.setStringNE("schd_trd_unit_cd", m.trd_unit_cd());
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
						.add(MAM_LOC_R.class, r -> toCondition(
							r.getStringNE("purc_ret_loc_cd")
						))
						.addSelect(m -> toArray(
							m.loc_nm,
							m.sppl_cd,
							m.str_ln_tgt_flg
						))
						.addMap((r, m) -> {
							r.setStringNE("purc_ret_loc_nm", m.loc_nm());
							r.setStringNE("purc_ret_sppl_cd", m.sppl_cd());
							r.setBooleanNE("str_ln_tgt_flg", m.str_ln_tgt_flg());
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
						.add(MAM_STR_LN_R.class, r -> toCondition(
							r.getStringNE("purc_ret_loc_cd"),
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
							r.setNumberNE("trd_unit_dmn_qty", m.conv_base_qty());
							r.setNumberNE("trd_unit_conv_qty", m.conv_qty());
							r.setStringNE("trd_unit_rnd_typ", m.rnd_typ());
					}),
					j -> j
						.add(MAVM_ITM_UNIT_R.class, r -> toCondition(
							r.getStringNE("itm_cd"),
							r.getStringNE("itm_sub1"),
							r.getStringNE("itm_sub2"),
							r.getStringNE("itm_sub3"),
							r.getStringNE("schd_trd_unit_cd")
						))
						.addSelect(m -> toArray(
							m.conv_base_qty,
							m.conv_qty,
							m.dec_place,
							m.rnd_typ
						))
						.addMap((r, m) -> {
							r.setNumberNE("schd_trd_unit_dec_place", m.dec_place());
							r.setNumberNE("schd_trd_unit_dmn_qty", m.conv_base_qty());
							r.setNumberNE("schd_trd_unit_conv_qty", m.conv_qty());
							r.setStringNE("schd_trd_unit_rnd_typ", m.rnd_typ());
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
							m.cont_fctr_dec_place,
							m.cont_fctr_flg,
							m.cont_fctr_rnd_typ,
							m.cont_fctr_unit_cd,
							m.insp_flg,
							m.lot_mng_typ,
							m.std_cont_fctr,
							m.sublot_mng_typ,
							m.ver_flg
						))
						.addMap((r, m) -> {
							r.setBooleanNE("ver_flg", m.ver_flg());
							r.setBooleanNE("cont_fctr_flg", m.cont_fctr_flg());
							r.setNumberNE("purc_cont_fctr", m.std_cont_fctr());
							r.setNumberNE("std_cont_fctr", m.std_cont_fctr());
							r.setStringNE("cont_fctr_unit_cd", m.cont_fctr_unit_cd());
							r.setStringNE("cont_fctr_rnd_typ", m.cont_fctr_rnd_typ());
							r.setNumberNE("cont_fctr_dec_place", m.cont_fctr_dec_place());
							r.setBooleanNE("insp_flg", m.insp_flg());
							r.setStringNE("lot_mng_typ", m.lot_mng_typ());
							r.setStringNE("sublot_mng_typ", m.sublot_mng_typ());
							r.setBooleanNE("ver_flg", m.ver_flg());
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
						.add(MAM_WG_R.class, r -> toCondition(
							r.getStringNE("purc_ret_loc_wg_cd")
						))
						.addSelect(m -> toArray(
							m.wg_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("purc_ret_loc_wg_nm", m.wg_nm());
					})
				)
			);
	}
	
	/**
	 * -- MSBDL5170_MST_PURC_RET_ACT_Query_S01
	 */
	public static MCQueryPlan MSBDL5170_MST_PURC_RET_ACT_S01() {
		MST_PURC_RET_ACT_P_R S0_T01 = MST_PURC_RET_ACT_P_R.create("T01");
		MST_PURC_RET_ACT_R S0_T011 = MST_PURC_RET_ACT_R.create("T011");
		MAVM_RD_DPT_R S0_M99 = MAVM_RD_DPT_R.create("M99");
		MST_PURC_ACT_R S0_T02 = MST_PURC_ACT_R.create("T02");
		MST_PURC_RET_SCHD_R S0_T03 = MST_PURC_RET_SCHD_R.create("T03");
		MAM_DPT_R S0_M02 = MAM_DPT_R.create("M02");
		MAM_BP_R S0_M05 = MAM_BP_R.create("M05");
		MAM_CUR_R S0_M07 = MAM_CUR_R.create("M07");
		MAM_CUR_R S0_M11 = MAM_CUR_R.create("M11");
		MAM_CUR_R S0_M51 = MAM_CUR_R.create("M51");
		MAM_CUR_R S0_M61 = MAM_CUR_R.create("M61");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBDL5170_MST_PURC_RET_ACT_Query_S01")
					.mainQuery()
					.select(
						S0_T01.purc_ret_act_no,
						S0_T01.purc_ret_act_rev,
						S0_T01.purc_ret_act_rev,
						S0_T011.purc_ret_act_rev.as("purc_ret_act_rev_new"),
						S0_T01.purc_ret_schd_no,
						S0_T01.trd_cd,
						S0_T01.trd_ptn_typ,
						S0_T01.ac_dt,
						S0_T02.pay_basis_dt,
						S0_T02.pay_schd_dt,
						S0_T01.purc_dpt_cd,
						S0_M02.dpt_nm.as("purc_dpt_nm"),
						S0_M02.ap_dpt_flg,
						S0_T01.wg_cd,
						S0_T01.purc_usr_cd,
						S0_T01.sppl_cd,
						S0_M05.bp_nm.as("sppl_nm"),
						S0_M05.repurc_obli_flg,
						nvl(S0_M05.outsrc_upri_typ, value(getCo().outsrc_upri_typ())).as("outsrc_upri_typ"),
						S0_M05.purc_amt_rnd_typ,
						S0_M05.purc_tax_rnd_typ,
						S0_M05.purc_tax_calc_typ,
						S0_M05.purc_upri_cng_flg,
						S0_M05.prnt_lcl_cd,
						S0_M05.subcon_flg,
						S0_M05.sppl_iv_flg,
						S0_M05.cntry_cd.as("sppl_cntry_cd"),
						S0_T01.sppl_cntct_dpt,
						S0_T01.sppl_cntct_psn,
						S0_T01.sppl_zip_cd,
						S0_T01.sppl_addr1,
						S0_T01.sppl_addr2,
						S0_T01.sppl_addr3,
						S0_T01.sppl_addr4,
						S0_T01.sppl_tel,
						S0_T01.sppl_fax,
						S0_M05.asppl_cd,
						MAPA_BP$F_GET_AP_DPT_CD_NE(
							S0_M05.asppl_cd,
							S0_T01.ac_dt,
							value(false)
						).as("mst_ap_dpt_cd"),
						MAPA_BP$F_GET_AP_DPT_CD_NE2(
							S0_T01.sppl_cd,
							S0_M05.asppl_cd,
							S0_T01.ac_dt,
							value(false)
						).as("ap_dpt_cd"),
						nvl(
							S0_T02.trd_cur_cd,
							S0_M05.cur_cd
						).as("trd_cur_cd"),
						nvl(
							S0_M07.cur_nm,
							S0_M11.cur_nm
						).as("trd_cur_nm"),
						nvl(
							S0_M07.amt_dec_place,
							S0_M11.amt_dec_place
						).as("trd_cur_amt_dec_place"),
						nvl(
							S0_M07.upri_dec_place,
							S0_M11.upri_dec_place
						).as("trd_cur_upri_dec_place"),
						bind("base_cur_cd").as("base_cur_cd"),
						S0_M51.amt_dec_place.as("base_cur_amt_dec_place"),
						S0_M51.upri_dec_place.as("base_cur_upri_dec_place"),
						bind("ptax_cur_cd").as("ptax_cur_cd"),
						S0_M61.amt_dec_place.as("ptax_cur_amt_dec_place"),
						S0_M61.upri_dec_place.as("ptax_cur_upri_dec_place"),
						S0_T02.ptax_dt,
						S0_T02.xrate_cd,
						nvl(
							S0_T02.xrate,
							S0_T03.xrate
						).as("xrate"),
						S0_T03.xrate_inpt_flg,
						nvl(
							S0_T02.ptax_xrate,
							S0_T03.ptax_xrate
						).as("ptax_xrate"),
						S0_T03.ptax_xrate_inpt_flg,
						S0_T01.ret_sppl_nm,
						S0_T01.ret_sppl_cntct_dpt,
						S0_T01.ret_sppl_cntct_psn,
						S0_T01.ret_sppl_cntct_psn_title,
						S0_T01.ret_sppl_zip_cd,
						S0_T01.ret_sppl_addr1,
						S0_T01.ret_sppl_addr2,
						S0_T01.ret_sppl_addr3,
						S0_T01.ret_sppl_addr4,
						S0_T01.ret_sppl_tel,
						S0_T01.ret_sppl_fax,
						S0_T01.purc_ret_dt,
						S0_T01.purc_ret_print_dt,
						S0_T01.purc_ret_print_flg,
						S0_T01.can_flg,
						S0_T01.rcpt_iv_no,
						S0_T01.ref_rcpt_iv_no,
						S0_T01.tterm_cd1,
						S0_T01.tterm_rmrks1,
						S0_T01.tterm_cd2,
						S0_T01.tterm_rmrks2,
						S0_T01.tterm_cd3,
						S0_T01.tterm_rmrks3,
						S0_T01.trd_rmrks,
						S0_T01.intr_rmrks,
						S0_T01.purc_ret_print_rmrks,
						S0_T01.sub_char1,
						S0_T01.sub_char2,
						S0_T01.sub_char3,
						S0_T01.ins_usr_id,
						S0_T01.ins_usr_nm,
						S0_T01.ins_func_id,
						S0_T01.ins_ts,
						S0_T011.upd_cntr.as("pr_act_upd_cntr"),
						S0_T01.upd_usr_id,
						S0_T01.upd_usr_nm,
						S0_T01.upd_func_id,
						S0_T01.upd_ts,
						S0_T01.upd_srv_req_no
					)
					.from(
						S0_T01
						.leftOuterJoin(S0_T011).on(
							bracket(
								S0_T01.purc_ret_act_no.eq(S0_T011.purc_ret_act_no)
							)
						)
						.innerJoin(S0_M99).on(
							bracket(
								S0_T01.purc_dpt_cd.eq(S0_M99.dpt_cd)
							)
						)
						.leftOuterJoin(S0_T02).on(
							bracket(
								S0_T01.purc_ret_act_no.eq(S0_T02.purc_ret_act_no)
								.and(S0_T01.purc_ret_act_rev.eq(S0_T02.purc_ret_act_rev))
								.and(bind("purc_act_seq").eq(S0_T02.purc_act_seq))
							)
						)
						.leftOuterJoin(S0_T03).on(
							bracket(
								S0_T01.purc_ret_schd_no.eq(S0_T03.purc_ret_schd_no)
							)
						)
						.leftOuterJoin(S0_M02).on(
							bracket(
								S0_T01.purc_dpt_cd.eq(S0_M02.dpt_cd)
								.and(S0_T01.ac_dt.between(S0_M02.st_dt, S0_M02.end_dt))
							)
						)
						.leftOuterJoin(S0_M05).on(
							bracket(
								S0_T01.sppl_cd.eq(S0_M05.bp_cd)
							)
						)
						.leftOuterJoin(S0_M07).on(
							bracket(
								S0_T02.trd_cur_cd.eq(S0_M07.cur_cd)
							)
						)
						.leftOuterJoin(S0_M11).on(
							bracket(
								S0_M05.cur_cd.eq(S0_M11.cur_cd)
							)
						)
						.leftOuterJoin(S0_M51).on(
							bracket(
								bind("base_cur_cd").eq(S0_M51.cur_cd)
							)
						)
						.leftOuterJoin(S0_M61).on(
							bracket(
								bind("ptax_cur_cd").eq(S0_M61.cur_cd)
							)
						)
					)
					.where(
						value(0).eq(value(0))
						.and(S0_T01.purc_ret_act_no.eq(bind("srch_tgt_no")))
						.and(S0_T01.purc_ret_act_rev.eq(bind("srch_tgt_rev")))
						.and(
							bracket(
								bind("tmp_can_flg").eq(value(true))
							)
							.or(
								bind("tmp_can_flg").eq(value(false))
								.and(S0_T011.can_flg.eq(value(false)))
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
						.add(MAM_BP_R.class, r -> toCondition(
							r.getStringNE("asppl_cd")
						))
						.addSelect(m -> toArray(
							m.bp_nm,
							m.bsppl_cd
						))
						.addMap((r, m) -> {
							r.setStringNE("asppl_nm", m.bp_nm());
							r.setStringNE("join_bsppl_cd_", m.bsppl_cd());
					}),
					j -> j
						.add(MAM_BP_R.class, r -> toCondition(
							r.getStringNE("join_bsppl_cd_")
						))
						.addSelect(m -> toArray(
							m.pay_spot_flg
						))
						.addMap((r, m) -> {
							r.setBooleanNE("pay_spot_flg", m.pay_spot_flg());
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
	 * -- MSBDL5170_MST_PURC_RET_SCHD_IO_Query_S01
	 */
	public static MCQueryPlan MSBDL5170_MST_PURC_RET_SCHD_IO_S01() {
		MST_PURC_RET_SCHD_IO_R S0_T01 = MST_PURC_RET_SCHD_IO_R.create("T01");
		MST_PURC_RET_SCHD_D_R S0_T02 = MST_PURC_RET_SCHD_D_R.create("T02");
		MST_PURC_RET_SCHD_R S0_T03 = MST_PURC_RET_SCHD_R.create("T03");
		MCTempView S0_T04 = createTempView("T04");
		MST_PURC_RET_ACT_IO_R S1_AI = MST_PURC_RET_ACT_IO_R.create("AI");
		MST_PURC_RET_ACT_D_R S1_AD = MST_PURC_RET_ACT_D_R.create("AD");
		MST_PURC_RET_ACT_R S1_A1 = MST_PURC_RET_ACT_R.create("A1");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBDL5170_MST_PURC_RET_SCHD_IO_Query_S01")
					.mainQuery()
					.select(
						S0_T02.trd_unit_cd.as("schd_trd_unit_cd"),
						S0_T01.purc_ret_schd_io_no,
						S0_T01.purc_ret_schd_d_no,
						S0_T01.purc_ret_loc_wg_cd,
						S0_T01.purc_ret_loc_cd,
						S0_T01.str_ln_cd,
						S0_T02.itm_cd,
						S0_T02.itm_sub1,
						S0_T02.itm_sub2,
						S0_T02.itm_sub3,
						S0_T01.ver_no,
						S0_T01.lot_no,
						S0_T01.sublot_no,
						S0_T01.bp_lot_no,
						S0_T01.stk_id_typ,
						S0_T01.stk_insp_typ,
						S0_T01.quality_typ,
						S0_T01.stk_arrv_bp_cd,
						S0_T01.gd_cd,
						S0_T01.in_xfr_typ,
						S0_T01.trd_unit_cd,
						S0_T01.trd_unit_qty,
						S0_T01.base_unit_cd,
						S0_T01.base_unit_qty,
						S0_T04.pr("ret_qty"),
						S0_T01.ref_arr_act_no,
						S0_T01.ref_arr_act_rev,
						S0_T01.ref_purc_act_io_no,
						S0_T01.ref_purc_act_io_seq,
						S0_T01.io_schd_pr_no,
						S0_T01.sub_char1,
						S0_T01.sub_char2,
						S0_T01.sub_char3,
						S0_T01.purc_cont_qty
					)
					.from(
						S0_T01
						.rightOuterJoin(S0_T02).on(
							bracket(
								S0_T02.purc_ret_schd_d_no.eq(S0_T01.purc_ret_schd_d_no)
							)
						)
						.rightOuterJoin(S0_T03).on(
							bracket(
								S0_T03.purc_ret_schd_no.eq(S0_T02.purc_ret_schd_no)
							)
						)
						.leftOuterJoin(
							subQuery()
							.select(
								S1_AI.purc_ret_schd_io_no,
								sum(S1_AI.base_unit_qty).as("ret_qty")
							)
							.from(
								S1_AI
								.innerJoin(S1_AD).on(
									bracket(
										S1_AI.purc_ret_act_d_no.eq(S1_AD.purc_ret_act_d_no)
										.and(S1_AD.can_flg.eq(value(false)))
									)
								)
								.innerJoin(S1_A1).on(
									bracket(
										S1_AD.purc_ret_act_no.eq(S1_A1.purc_ret_act_no)
										.and(S1_A1.can_flg.eq(value(false)))
									)
								)
							)
							.where(
								S1_AI.can_flg.eq(value(false))
							)
							.groupBy(S1_AI.purc_ret_schd_io_no).view(S0_T04)
						).on(
							bracket(
								S0_T01.purc_ret_schd_io_no.eq(S0_T04.pr(S1_AI.purc_ret_schd_io_no))
							)
						)
					)
					.where(
						value(0).eq(value(0))
						.and(S0_T03.purc_ret_schd_no.eq(bind("srch_tgt_no")))
					)
					.orderBy(S0_T01.purc_ret_schd_io_no.asc())
			)
			.setJoinInfo(
				joinInfo(
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
						.add(MAM_LOC_R.class, r -> toCondition(
							r.getStringNE("purc_ret_loc_cd")
						))
						.addSelect(m -> toArray(
							m.loc_nm,
							m.sppl_cd,
							m.str_ln_tgt_flg
						))
						.addMap((r, m) -> {
							r.setStringNE("purc_ret_loc_nm", m.loc_nm());
							r.setStringNE("purc_ret_sppl_cd", m.sppl_cd());
							r.setBooleanNE("str_ln_tgt_flg", m.str_ln_tgt_flg());
					}),
					j -> j
						.add(MAM_WG_R.class, r -> toCondition(
							r.getStringNE("purc_ret_loc_wg_cd")
						))
						.addSelect(m -> toArray(
							m.wg_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("purc_ret_loc_wg_nm", m.wg_nm());
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
						.add(MAM_STR_LN_R.class, r -> toCondition(
							r.getStringNE("purc_ret_loc_cd"),
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
							r.setNumberNE("trd_unit_dmn_qty", m.conv_base_qty());
							r.setNumberNE("trd_unit_conv_qty", m.conv_qty());
							r.setStringNE("trd_unit_rnd_typ", m.rnd_typ());
					}),
					j -> j
						.add(MAVM_ITM_UNIT_R.class, r -> toCondition(
							r.getStringNE("itm_cd"),
							r.getStringNE("itm_sub1"),
							r.getStringNE("itm_sub2"),
							r.getStringNE("itm_sub3"),
							r.getStringNE("schd_trd_unit_cd")
						))
						.addSelect(m -> toArray(
							m.conv_base_qty,
							m.conv_qty,
							m.dec_place,
							m.rnd_typ
						))
						.addMap((r, m) -> {
							r.setNumberNE("schd_trd_unit_dec_place", m.dec_place());
							r.setNumberNE("schd_trd_unit_dmn_qty", m.conv_base_qty());
							r.setNumberNE("schd_trd_unit_conv_qty", m.conv_qty());
							r.setStringNE("schd_trd_unit_rnd_typ", m.rnd_typ());
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
							m.cont_fctr_dec_place,
							m.cont_fctr_flg,
							m.cont_fctr_rnd_typ,
							m.cont_fctr_unit_cd,
							m.insp_flg,
							m.lot_mng_typ,
							m.lot_no_typ,
							m.std_cont_fctr,
							m.sublot_mng_typ,
							m.sublot_no_typ,
							m.ver_flg
						))
						.addMap((r, m) -> {
							r.setBooleanNE("ver_flg", m.ver_flg());
							r.setStringNE("lot_mng_typ", m.lot_mng_typ());
							r.setStringNE("lot_no_typ", m.lot_no_typ());
							r.setStringNE("sublot_mng_typ", m.sublot_mng_typ());
							r.setStringNE("sublot_no_typ", m.sublot_no_typ());
							r.setBooleanNE("cont_fctr_flg", m.cont_fctr_flg());
							r.setNumberNE("purc_cont_fctr", m.std_cont_fctr());
							r.setNumberNE("std_cont_fctr", m.std_cont_fctr());
							r.setStringNE("cont_fctr_unit_cd", m.cont_fctr_unit_cd());
							r.setStringNE("cont_fctr_rnd_typ", m.cont_fctr_rnd_typ());
							r.setNumberNE("cont_fctr_dec_place", m.cont_fctr_dec_place());
							r.setBooleanNE("insp_flg", m.insp_flg());
							r.setBooleanNE("ver_flg", m.ver_flg());
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
	 * -- MSBDL5170_MST_PURC_RET_SCHD_D_Query_S01
	 */
	public static MCQueryPlan MSBDL5170_MST_PURC_RET_SCHD_D_S01() {
		MST_PURC_RET_SCHD_D_R S0_T01 = MST_PURC_RET_SCHD_D_R.create("T01");
		MST_PURC_RET_SCHD_R S0_T00 = MST_PURC_RET_SCHD_R.create("T00");
		MCTempView S0_T02 = createTempView("T02");
		MAM_DPT_R S0_M02 = MAM_DPT_R.create("M02");
		MAM_DPT_R S0_M14 = MAM_DPT_R.create("M14");
		MAM_ITM_R S0_M20 = MAM_ITM_R.create("M20");
		MAM_UNIT_R S0_M21 = MAM_UNIT_R.create("M21");
		MAM_BP_R S0_M22 = MAM_BP_R.create("M22");
		MAM_ITM_LCL_R S0_M23 = MAM_ITM_LCL_R.create("M23");
		MST_PURC_RET_ACT_D_R S1_AD = MST_PURC_RET_ACT_D_R.create("AD");
		MST_PURC_RET_ACT_R S1_A1 = MST_PURC_RET_ACT_R.create("A1");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBDL5170_MST_PURC_RET_SCHD_D_Query_S01")
					.mainQuery()
					.select(
						S0_T01.trd_unit_cd.as("schd_trd_unit_cd"),
						S0_T01.trd_unit_qty.as("schd_trd_unit_qty"),
						S0_T01.base_unit_qty.as("schd_base_unit_qty"),
						S0_T01.trd_cur_upri.as("schd_trd_cur_upri"),
						S0_T01.trd_cur_dscnt_amt.as("schd_trd_cur_dscnt_amt"),
						S0_T01.trd_cur_proc_amt.as("schd_trd_cur_proc_amt"),
						S0_T01.trd_cur_onr_prov_amt.as("schd_trd_cur_onr_prov_amt"),
						S0_T01.trd_cur_proc_upri.as("schd_trd_cur_proc_upri"),
						S0_T01.trd_cur_onr_prov_upri.as("schd_trd_cur_onr_prov_upri"),
						S0_T01.trd_cur_amt.as("schd_trd_cur_amt"),
						S0_T01.trd_cur_tax_amt.as("schd_trd_cur_tax_amt"),
						S0_T01.purc_ret_schd_d_no,
						S0_T01.purc_ret_schd_no,
						S0_T01.ref_purc_act_no,
						S0_T01.ref_purc_act_seq,
						S0_T01.ref_purc_act_d_no,
						S0_T01.ref_purc_act_d_seq,
						S0_T01.base_purc_ac_dt,
						S0_T01.purc_ret_loc_wg_cd,
						S0_T01.purc_ret_loc_cd,
						S0_T01.disp_seq,
						S0_T01.itm_cd,
						S0_T01.itm_sub1,
						S0_T01.itm_sub2,
						S0_T01.itm_sub3,
						decode(
							S0_T01.sundry_itm_flg,
							value(true),
							S0_T01.itm_nm,
							S0_M20.itm_nm
						).as("itm_nm"),
						decode(
							S0_M22.sppl_iv_flg,
							value(true),
							decode(
								S0_T01.sundry_itm_flg,
								value(true),
								S0_T01.iv_itm_nm,
								S0_M23.itm_nm
							),
							nullValue()
						).as("iv_itm_nm"),
						S0_M20.sno1_mng_typ,
						S0_M20.sno2_mng_typ,
						S0_M20.sno3_mng_typ,
						S0_M20.sno4_mng_typ,
						S0_M20.stk_mng_typ,
						S0_M20.asset_mng_typ,
						S0_T01.sno1,
						S0_T01.sno2,
						S0_T01.sno3,
						S0_T01.sno4,
						S0_M20.lot_mng_typ,
						S0_M20.lot_no_typ,
						S0_M20.sublot_mng_typ,
						S0_M20.sublot_no_typ,
						S0_T01.lot_no,
						S0_T01.sublot_no,
						S0_T01.bp_lot_no,
						S0_T01.purc_typ,
						S0_T01.in_xfr_typ,
						S0_T01.quality_typ,
						S0_M20.ver_flg,
						S0_T01.ver_no,
						S0_T01.stk_insp_typ,
						S0_T01.stk_id_typ,
						S0_T01.stk_arrv_bp_cd,
						S0_T01.gd_cd,
						S0_T01.ap_dpt_cd,
						S0_M02.dpt_nm.as("ap_dpt_nm"),
						S0_T01.pay_crryovr_times,
						S0_T01.ret_rsn_cd,
						S0_T01.po_no,
						S0_T01.sundry_itm_flg,
						S0_M20.dscnt_itm_flg,
						S0_M20.arr_skip_flg,
						S0_M20.purc_upri_cng_flg.as("itm_purc_upri_cng_flg"),
						S0_M20.ver_flg,
						S0_T01.sppl_itm_cd,
						S0_T01.sppl_itm_nm,
						S0_T01.maker_cd,
						S0_T01.str_ln_cd,
						S0_T01.trd_unit_qty,
						S0_T01.trd_unit_cd,
						S0_T01.base_unit_qty,
						S0_T01.base_unit_cd,
						S0_T02.pr("ret_qty"),
						S0_T01.interim_flg,
						S0_T01.tax_cd,
						S0_T01.tax_fix_flg,
						cases()
							.when(S0_T01.tax_fix_flg.eq(value(false)))
								.then(
									MAPA_TAX$F_GET_PURC_TAX_CD(
										S0_T01.itm_cd,
										S0_T01.itm_sub1,
										S0_T01.itm_sub2,
										S0_T01.itm_sub3,
										S0_T00.sppl_cd,
										bind("dpt_dt")
									)
							)
							.otherwise(nullValue()).as("act_tax_cd"),
						S0_T01.upri_not_tgt_flg,
						S0_T01.trd_cur_upri,
						S0_T01.trd_cur_dscnt_amt,
						S0_T01.dscnt_rsn_cd,
						S0_T01.trd_cur_proc_amt,
						S0_T01.trd_cur_onr_prov_amt,
						S0_T01.trd_cur_proc_upri,
						S0_T01.trd_cur_onr_prov_upri,
						S0_T01.trd_cur_amt,
						S0_T01.trd_cur_tax_amt,
						S0_T01.trd_cur_amt.add(S0_T01.trd_cur_tax_amt).as("trd_cur_inc_tax_amt"),
						S0_T01.base_cur_tax_amt,
						S0_T01.ptax_cur_tax_amt,
						S0_T01.wtax_rate,
						S0_T01.wtax_amt,
						S0_T01.purc_id_typ,
						S0_T01.abort_flg,
						S0_T01.cmpl_flg,
						S0_T01.bd_itm_cd,
						S0_T01.bd_itm_sub1,
						S0_T01.bd_itm_sub2,
						S0_T01.bd_itm_sub3,
						S0_T01.bd_sno1,
						S0_T01.bd_sno2,
						S0_T01.bd_sno3,
						S0_T01.bd_sno4,
						S0_T01.bd_loc_cd,
						S0_T01.bd_lot_no,
						S0_T01.bd_sublot_no,
						S0_T01.mfg_inst_no,
						S0_T01.bd_dpt_cd,
						S0_M14.dpt_nm.as("bd_dpt_nm"),
						S0_T01.bd_wg_cd,
						S0_T01.bd_ctg_cd,
						S0_T01.bd_oper_cd,
						S0_T01.bd_po_no,
						S0_T01.bd_slo_no,
						S0_T01.bd_iv_no,
						S0_T01.intr_rmrks,
						S0_T01.purc_ret_print_d_rmrks,
						S0_T01.trd_d_rmrks,
						S0_T01.sub_char1,
						S0_T01.sub_char2,
						S0_T01.sub_char3,
						S0_T01.base_ac_dt,
						S0_M20.insp_flg
					)
					.from(
						S0_T01
						.rightOuterJoin(S0_T00).on(
							bracket(
								S0_T00.purc_ret_schd_no.eq(S0_T01.purc_ret_schd_no)
							)
						)
						.leftOuterJoin(
							subQuery()
							.select(
								S1_AD.purc_ret_schd_d_no,
								sum(S1_AD.base_unit_qty).as("ret_qty")
							)
							.from(
								S1_AD
								.innerJoin(S1_A1).on(
									bracket(
										S1_AD.purc_ret_act_no.eq(S1_A1.purc_ret_act_no)
										.and(S1_A1.can_flg.eq(value(false)))
									)
								)
							)
							.where(
								S1_AD.can_flg.eq(value(false))
							)
							.groupBy(S1_AD.purc_ret_schd_d_no).view(S0_T02)
						).on(
							bracket(
								S0_T01.purc_ret_schd_d_no.eq(S0_T02.pr(S1_AD.purc_ret_schd_d_no))
							)
						)
						.leftOuterJoin(S0_M02).on(
							bracket(
								S0_T01.ap_dpt_cd.eq(S0_M02.dpt_cd)
								.and(bind("dpt_dt").between(S0_M02.st_dt, S0_M02.end_dt))
							)
						)
						.leftOuterJoin(S0_M14).on(
							bracket(
								S0_T01.bd_dpt_cd.eq(S0_M14.dpt_cd)
								.and(bind("dpt_dt").between(S0_M14.st_dt, S0_M14.end_dt))
							)
						)
						.leftOuterJoin(S0_M20).on(
							bracket(
								S0_T01.itm_cd.eq(S0_M20.itm_cd)
								.and(S0_T01.itm_sub1.eq(S0_M20.itm_sub1))
								.and(S0_T01.itm_sub2.eq(S0_M20.itm_sub2))
								.and(S0_T01.itm_sub3.eq(S0_M20.itm_sub3))
							)
						)
						.leftOuterJoin(S0_M21).on(
							bracket(
								S0_M20.cont_fctr_unit_cd.eq(S0_M21.unit_cd)
							)
						)
						.leftOuterJoin(S0_M22).on(
							bracket(
								S0_T00.sppl_cd.eq(S0_M22.bp_cd)
							)
						)
						.leftOuterJoin(S0_M23).on(
							bracket(
								S0_T01.itm_cd.eq(S0_M23.itm_cd)
								.and(S0_T01.itm_sub1.eq(S0_M23.itm_sub1))
								.and(S0_T01.itm_sub2.eq(S0_M23.itm_sub2))
								.and(S0_T01.itm_sub3.eq(S0_M23.itm_sub3))
								.and(S0_M23.lcl_cd.eq(S0_M22.prnt_lcl_cd))
							)
						)
					)
					.where(
						value(0).eq(value(0))
						.and(S0_T00.purc_ret_schd_no.eq(bind("srch_tgt_no")))
					)
					.orderBy(S0_T01.disp_seq.asc())
			)
			.setJoinInfo(
				joinInfo(
					j -> j
						.add(MST_PURC_ACT_R.class, r -> toCondition(
							r.getStringNE("ref_purc_act_no"),
							r.getNumberNE("ref_purc_act_seq")
						))
						.addSelect(m -> toArray(
							m.purc_act_rev
						))
						.addMap((r, m) -> {
							r.setNumberNE("ref_purc_act_rev", m.purc_act_rev());
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
						.add(MAM_BIZ_RSN_R.class, r -> toCondition(
							r.getStringNE("ret_rsn_cd")
						))
						.addSelect(m -> toArray(
							m.biz_rsn_nm,
							m.xpns_purc_flg
						))
						.addMap((r, m) -> {
							r.setStringNE("ret_rsn_nm", m.biz_rsn_nm());
							r.setBooleanNE("xpns_purc_flg", m.xpns_purc_flg());
					}),
					j -> j
						.add(MAM_LOC_R.class, r -> toCondition(
							r.getStringNE("purc_ret_loc_cd")
						))
						.addSelect(m -> toArray(
							m.loc_mng_typ,
							m.loc_nm,
							m.sppl_cd,
							m.str_ln_tgt_flg
						))
						.addMap((r, m) -> {
							r.setStringNE("purc_ret_loc_nm", m.loc_nm());
							r.setStringNE("purc_ret_sppl_cd", m.sppl_cd());
							r.setStringNE("loc_mng_typ", m.loc_mng_typ());
							r.setBooleanNE("str_ln_tgt_flg", m.str_ln_tgt_flg());
					}),
					j -> j
						.add(MAM_WG_R.class, r -> toCondition(
							r.getStringNE("purc_ret_loc_wg_cd")
						))
						.addSelect(m -> toArray(
							m.wg_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("purc_ret_loc_wg_nm", m.wg_nm());
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
						.add(MAM_STR_LN_R.class, r -> toCondition(
							r.getStringNE("purc_ret_loc_cd"),
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
							r.getStringNE("schd_trd_unit_cd")
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
							r.getStringNE("schd_trd_unit_cd")
						))
						.addSelect(m -> toArray(
							m.conv_base_qty,
							m.conv_qty,
							m.dec_place,
							m.rnd_typ
						))
						.addMap((r, m) -> {
							r.setNumberNE("schd_trd_unit_dec_place", m.dec_place());
							r.setNumberNE("schd_trd_unit_dmn_qty", m.conv_base_qty());
							r.setNumberNE("schd_trd_unit_conv_qty", m.conv_qty());
							r.setStringNE("schd_trd_unit_rnd_typ", m.rnd_typ());
							r.setNumberNE("trd_unit_dec_place", m.dec_place());
							r.setNumberNE("trd_unit_dmn_qty", m.conv_base_qty());
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
							r.setNumberNE("schd_tax_rate", m.tax_rate());
							r.setBooleanNE("schd_inc_tax_flg", m.inc_tax_flg());
					}),
					j -> j
						.add(MAM_ITM__R.class, r -> toCondition(
							r.getStringNE("bd_itm_cd"),
							r.getStringNE("bd_itm_sub1"),
							r.getStringNE("bd_itm_sub2"),
							r.getStringNE("bd_itm_sub3")
						))
						.addSelect(m -> toArray(
							m.itm_nm,
							m.lot_mng_typ,
							m.lot_no_typ,
							m.sno1_mng_typ,
							m.sno2_mng_typ,
							m.sno3_mng_typ,
							m.sno4_mng_typ,
							m.sublot_mng_typ,
							m.sublot_no_typ
						))
						.addMap((r, m) -> {
							r.setStringNE("bd_itm_nm", m.itm_nm());
							r.setStringNE("bd_lot_mng_typ", m.lot_mng_typ());
							r.setStringNE("bd_lot_no_typ", m.lot_no_typ());
							r.setStringNE("bd_sublot_mng_typ", m.sublot_mng_typ());
							r.setStringNE("bd_sublot_no_typ", m.sublot_no_typ());
							r.setStringNE("bd_sno1_mng_typ", m.sno1_mng_typ());
							r.setStringNE("bd_sno2_mng_typ", m.sno2_mng_typ());
							r.setStringNE("bd_sno3_mng_typ", m.sno3_mng_typ());
							r.setStringNE("bd_sno4_mng_typ", m.sno4_mng_typ());
					}),
					j -> j
						.add(MAM_LOC_R.class, r -> toCondition(
							r.getStringNE("bd_loc_cd")
						))
						.addSelect(m -> toArray(
							m.loc_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("bd_loc_nm", m.loc_nm());
					}),
					j -> j
						.add(MAM_WG_R.class, r -> toCondition(
							r.getStringNE("bd_wg_cd")
						))
						.addSelect(m -> toArray(
							m.wg_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("bd_wg_nm", m.wg_nm());
					}),
					j -> j
						.add(MAM_COST_CTG_R.class, r -> toCondition(
							r.getStringNE("bd_ctg_cd")
						))
						.addSelect(m -> toArray(
							m.ctg_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("bd_ctg_nm", m.ctg_nm());
					}),
					j -> j
						.add(MAM_OPER_R.class, r -> toCondition(
							r.getStringNE("bd_oper_cd")
						))
						.addSelect(m -> toArray(
							m.oper_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("bd_oper_nm", m.oper_nm());
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
					})
				)
			);
	}
	
	/**
	 * -- MSBDL5170_MST_PURC_RET_SCHD_Query_S01
	 */
	public static MCQueryPlan MSBDL5170_MST_PURC_RET_SCHD_S01() {
		MST_PURC_RET_SCHD_R S0_T01 = MST_PURC_RET_SCHD_R.create("T01");
		MAVM_RD_DPT_R S0_M99 = MAVM_RD_DPT_R.create("M99");
		MAM_DPT_R S0_M02 = MAM_DPT_R.create("M02");
		MAM_BP_R S0_M05 = MAM_BP_R.create("M05");
		MAM_CUR_R S0_M51 = MAM_CUR_R.create("M51");
		MAM_CUR_R S0_M61 = MAM_CUR_R.create("M61");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBDL5170_MST_PURC_RET_SCHD_Query_S01")
					.mainQuery()
					.select(
						S0_T01.purc_ret_schd_no,
						S0_T01.trd_cd,
						S0_T01.trd_ptn_typ,
						S0_T01.purc_dpt_cd,
						S0_M02.dpt_nm.as("purc_dpt_nm"),
						S0_M02.ap_dpt_flg,
						S0_T01.wg_cd,
						S0_T01.purc_usr_cd,
						S0_T01.sppl_cd,
						S0_M05.bp_nm.as("sppl_nm"),
						S0_M05.purc_amt_rnd_typ,
						S0_M05.purc_tax_rnd_typ,
						S0_M05.purc_tax_calc_typ,
						S0_M05.purc_upri_cng_flg,
						S0_M05.prnt_lcl_cd,
						S0_M05.subcon_flg,
						S0_M05.repurc_obli_flg,
						nvl(S0_M05.outsrc_upri_typ, value(getCo().outsrc_upri_typ())).as("outsrc_upri_typ"),
						S0_M05.sppl_iv_flg,
						S0_M05.cntry_cd.as("sppl_cntry_cd"),
						S0_T01.sppl_cntct_dpt,
						S0_T01.sppl_cntct_psn,
						S0_T01.sppl_zip_cd,
						S0_T01.sppl_addr1,
						S0_T01.sppl_addr2,
						S0_T01.sppl_addr3,
						S0_T01.sppl_addr4,
						S0_T01.sppl_tel,
						S0_T01.sppl_fax,
						S0_M05.asppl_cd,
						MAPA_BP$F_GET_AP_DPT_CD_NE(
							S0_M05.asppl_cd,
							bind("dpt_dt"),
							value(false)
						).as("mst_ap_dpt_cd"),
						MAPA_BP$F_GET_AP_DPT_CD_NE2(
							S0_T01.sppl_cd,
							S0_M05.asppl_cd,
							bind("dpt_dt"),
							value(false)
						).as("ap_dpt_cd"),
						S0_T01.trd_cur_cd,
						bind("base_cur_cd").as("base_cur_cd"),
						S0_M51.amt_dec_place.as("base_cur_amt_dec_place"),
						S0_M51.upri_dec_place.as("base_cur_upri_dec_place"),
						bind("ptax_cur_cd").as("ptax_cur_cd"),
						S0_M61.amt_dec_place.as("ptax_cur_amt_dec_place"),
						S0_M61.upri_dec_place.as("ptax_cur_upri_dec_place"),
						S0_T01.xrate,
						S0_T01.xrate_inpt_flg,
						S0_T01.ptax_xrate,
						S0_T01.ptax_xrate_inpt_flg,
						S0_T01.ret_sppl_nm,
						S0_T01.ret_sppl_cntct_dpt,
						S0_T01.ret_sppl_cntct_psn,
						S0_T01.ret_sppl_cntct_psn_title,
						S0_T01.ret_sppl_zip_cd,
						S0_T01.ret_sppl_addr1,
						S0_T01.ret_sppl_addr2,
						S0_T01.ret_sppl_addr3,
						S0_T01.ret_sppl_addr4,
						S0_T01.ret_sppl_tel,
						S0_T01.ret_sppl_fax,
						S0_T01.reg_dt,
						S0_T01.schd_dt,
						S0_T01.rcpt_iv_no,
						S0_T01.ref_rcpt_iv_no,
						S0_T01.tterm_cd1,
						S0_T01.tterm_rmrks1,
						S0_T01.tterm_cd2,
						S0_T01.tterm_rmrks2,
						S0_T01.tterm_cd3,
						S0_T01.tterm_rmrks3,
						S0_T01.trd_rmrks,
						S0_T01.purc_ret_print_rmrks,
						S0_T01.ins_usr_id,
						S0_T01.ins_usr_nm,
						S0_T01.ins_func_id,
						S0_T01.ins_ts,
						S0_T01.upd_cntr.as("pr_schd_upd_cntr"),
						S0_T01.upd_usr_id,
						S0_T01.upd_usr_nm,
						S0_T01.upd_func_id,
						S0_T01.upd_ts
					)
					.from(
						S0_T01
						.innerJoin(S0_M99).on(
							bracket(
								S0_T01.purc_dpt_cd.eq(S0_M99.dpt_cd)
							)
						)
						.leftOuterJoin(S0_M02).on(
							bracket(
								S0_T01.purc_dpt_cd.eq(S0_M02.dpt_cd)
								.and(bind("dpt_dt").between(S0_M02.st_dt, S0_M02.end_dt))
							)
						)
						.leftOuterJoin(S0_M05).on(
							bracket(
								S0_T01.sppl_cd.eq(S0_M05.bp_cd)
							)
						)
						.leftOuterJoin(S0_M51).on(
							bracket(
								bind("base_cur_cd").eq(S0_M51.cur_cd)
							)
						)
						.leftOuterJoin(S0_M61).on(
							bracket(
								bind("ptax_cur_cd").eq(S0_M61.cur_cd)
							)
						)
					)
					.where(
						value(0).eq(value(0))
						.and(S0_T01.purc_ret_schd_no.eq(bind("srch_tgt_no")))
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
						.add(MAM_BP_R.class, r -> toCondition(
							r.getStringNE("asppl_cd")
						))
						.addSelect(m -> toArray(
							m.bp_nm,
							m.bsppl_cd
						))
						.addMap((r, m) -> {
							r.setStringNE("asppl_nm", m.bp_nm());
							r.setStringNE("join_bsppl_cd_", m.bsppl_cd());
					}),
					j -> j
						.add(MAM_BP_R.class, r -> toCondition(
							r.getStringNE("join_bsppl_cd_")
						))
						.addSelect(m -> toArray(
							m.pay_spot_flg
						))
						.addMap((r, m) -> {
							r.setBooleanNE("pay_spot_flg", m.pay_spot_flg());
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