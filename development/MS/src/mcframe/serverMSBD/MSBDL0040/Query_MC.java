package mcframe.serverMSBD.MSBDL0040;

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
	 * -- MSBDL0040_MST_PO_SCHD_Query_S01
	 */
	static MCQueryPlan MSBDL0040_MST_PO_SCHD_S01() {
		MST_PO_SCHD_R S0_T1 = MST_PO_SCHD_R.create("T1");
		MAVM_RD_WG_R S0_M0 = MAVM_RD_WG_R.create("M0");
		MAM_ITM_R S0_M2 = MAM_ITM_R.create("M2");
		MAM_SUNDRY_ITM_R S0_SUNDRYITM = MAM_SUNDRY_ITM_R.create("SUNDRYITM");
		MAM_DPT_R S0_M11 = MAM_DPT_R.create("M11");
		MAM_BP_R S0_M18 = MAM_BP_R.create("M18");
		MAM_CUR_R S0_M25 = MAM_CUR_R.create("M25");
		MAM_CUR_R S0_M30 = MAM_CUR_R.create("M30");
		MAM_DPT_R S0_M36 = MAM_DPT_R.create("M36");
		MAM_ITM_LCL_R S0_M37 = MAM_ITM_LCL_R.create("M37");
		MST_ITM_MFG_INST_R S1_ST1 = MST_ITM_MFG_INST_R.create("ST1");
		MAM_DPT_R S0_M41 = MAM_DPT_R.create("M41");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBDL0040_MST_PO_SCHD_Query_S01")
					.mainQuery()
					.select(
						S0_T1.abort_flg,
						S0_T1.rqst_upd_stop_flg,
						S0_T1.reg_dt,
						S0_T1.in_to_loc_cd,
						S0_T1.drct_dlv_typ,
						S0_T1.str_ln_cd,
						S0_T1.itm_cd,
						S0_T1.itm_sub1,
						S0_T1.itm_sub2,
						S0_T1.itm_sub3,
						coalesce(
							S0_SUNDRYITM.itm_nm,
							S0_T1.itm_nm,
							S0_M2.itm_nm
						).as("itm_nm"),
						decode(
							S0_M18.sppl_iv_flg,
							value(true),
							decode(
								S0_T1.sundry_itm_flg,
								value(true),
								S0_T1.iv_itm_nm,
								S0_M37.itm_nm
							),
							nullValue()
						).as("iv_itm_nm"),
						S0_T1.sundry_itm_flg,
						S0_M2.ver_flg,
						S0_M2.asset_mng_typ,
						S0_M2.dscnt_itm_flg,
						S0_M2.purc_upri_cng_flg.as("itm_purc_upri_cng_flg"),
						S0_T1.ver_no,
						S0_T1.trd_unit_cd,
						S0_T1.trd_unit_qty,
						S0_T1.base_unit_cd,
						S0_T1.base_unit_qty,
						S0_M2.cont_fctr_flg,
						S0_M2.cont_fctr_dec_place,
						S0_M2.cont_fctr_rnd_typ,
						S0_M2.std_cont_fctr,
						S0_M2.cont_fctr_unit_cd,
						S0_T1.sppl_cd,
						S0_M18.bp_nm.as("sppl_nm"),
						S0_M18.cntry_cd.as("sppl_cntry_cd"),
						S0_M18.purc_amt_rnd_typ,
						S0_M18.purc_tax_rnd_typ,
						S0_M18.purc_upri_cng_flg.as("sppl_purc_upri_cng_flg"),
						S0_M18.sppl_cal_cd,
						S0_T1.maker_cd,
						S0_T1.sppl_itm_cd,
						S0_T1.sppl_itm_nm,
						S0_T1.po_schd_dt,
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
						S0_T1.rqst_avl_rqst_dt,
						S0_T1.purc_usr_cd,
						S0_T1.purc_dpt_cd,
						S0_M11.dpt_nm.as("purc_dpt_nm"),
						S0_T1.wg_cd.as("purc_dpt_wg_cd"),
						S0_T1.purc_upri_req_typ,
						S0_T1.upri_not_tgt_flg,
						S0_T1.tax_cd,
						S0_T1.trd_cur_cd,
						S0_T1.interim_flg,
						decode(
								S0_T1.outsrc_flg,
								value(true),
								S0_M18.repurc_obli_flg,
								value(false)
								).as("repurc_obli_flg"),
						decode(
								S0_T1.outsrc_flg,
								value(true),
								nvl(S0_M18.outsrc_upri_typ, value(getCo().outsrc_upri_typ()))
								).as("outsrc_upri_typ"),
						S0_T1.trd_cur_upri,
						S0_T1.trd_cur_amt,
						S0_T1.trd_cur_tax_amt,
						S0_T1.trd_cur_amt.add(S0_T1.trd_cur_tax_amt).as("trd_cur_inc_tax_amt"),
						S0_T1.trd_cur_proc_upri,
						S0_T1.trd_cur_proc_amt,
						S0_T1.trd_cur_onr_prov_upri,
						S0_T1.trd_cur_onr_prov_amt,
						S0_T1.xrate_inpt_flg,
						S0_T1.xrate,
						bind("base_cur_cd").as("base_cur_cd"),
						S0_M25.cur_nm.as("base_cur_nm"),
						S0_M25.amt_dec_place.as("base_cur_amt_dec_place"),
						S0_M25.upri_dec_place.as("base_cur_upri_dec_place"),
						S0_T1.ptax_xrate_inpt_flg,
						S0_T1.ptax_xrate,
						bind("ptax_cur_cd").as("ptax_cur_cd"),
						S0_M30.cur_nm.as("ptax_cur_nm"),
						S0_M30.amt_dec_place.as("ptax_cur_amt_dec_place"),
						S0_M30.upri_dec_place.as("ptax_cur_upri_dec_place"),
						S0_T1.upd_cntr.as("po_schd_upd_cntr"),
						S0_T1.sno1,
						S0_T1.sno2,
						S0_T1.sno3,
						S0_T1.sno4,
						S0_T1.purc_rsn_cd,
						S0_T1.intr_rmrks,
						S0_T1.trd_d_rmrks,
						S0_T1.po_cnt_rmrks,
						S0_T1.mfg_loc_cd,
						S0_T1.bom_ptn,
						S0_T1.outsrc_flg,
						S0_T1.outsrc_itm_ord_no,
						S0_T1.bd_dpt_cd,
						S0_M36.dpt_nm.as("bd_dpt_nm"),
						S0_T1.bd_itm_cd,
						S0_T1.bd_itm_sub1,
						S0_T1.bd_itm_sub2,
						S0_T1.bd_itm_sub3,
						S0_T1.bd_lot_no,
						S0_T1.bd_sublot_no,
						S0_T1.bd_sno1,
						S0_T1.bd_sno2,
						S0_T1.bd_sno3,
						S0_T1.bd_sno4,
						S0_T1.bd_loc_cd,
						S0_T1.bd_ctg_cd,
						S0_T1.bd_oper_cd,
						S0_T1.bd_iv_no,
						S0_T1.bd_slo_no,
						S0_T1.bd_po_no,
						S0_T1.rqst_fr_usr_cd,
						S0_T1.rqst_fr_dpt_cd,
						S0_M41.dpt_nm.as("rqst_fr_dpt_nm"),
						S0_T1.po_schd_no,
						S0_T1.po_schd_src_typ,
						S0_T1.trd_ptn_typ,
						S0_T1.upd_cntr.as("po_schd_upd_cntr"),
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
						.innerJoin(S0_M0).on(
							bracket(
								S0_T1.wg_cd.eq(S0_M0.wg_cd)
							)
						)
						.leftOuterJoin(S0_M2).on(
							bracket(
								S0_T1.itm_cd.eq(S0_M2.itm_cd)
								.and(S0_T1.itm_sub1.eq(S0_M2.itm_sub1))
								.and(S0_T1.itm_sub2.eq(S0_M2.itm_sub2))
								.and(S0_T1.itm_sub3.eq(S0_M2.itm_sub3))
							)
						)
						.leftOuterJoin(S0_SUNDRYITM).on(
							S0_T1.itm_cd.eq(S0_SUNDRYITM.itm_cd)
							.and(S0_T1.itm_sub1.eq(S0_SUNDRYITM.itm_sub1))
							.and(S0_T1.itm_sub2.eq(S0_SUNDRYITM.itm_sub2))
							.and(S0_T1.itm_sub3.eq(S0_SUNDRYITM.itm_sub3))
							.and(S0_T1.sno1.eq(S0_SUNDRYITM.sno1))
							.and(S0_T1.sno2.eq(S0_SUNDRYITM.sno2))
							.and(S0_T1.sno3.eq(S0_SUNDRYITM.sno3))
							.and(S0_T1.sno4.eq(S0_SUNDRYITM.sno4))
						)
						.leftOuterJoin(S0_M11).on(
							bracket(
								S0_T1.purc_dpt_cd.eq(S0_M11.dpt_cd)
								.and(S0_T1.reg_dt.between(S0_M11.st_dt, S0_M11.end_dt))
							)
						)
						.leftOuterJoin(S0_M18).on(
							bracket(
								S0_T1.sppl_cd.eq(S0_M18.bp_cd)
							)
						)
						.leftOuterJoin(S0_M25).on(bind("base_cur_cd").eq(S0_M25.cur_cd))
						.leftOuterJoin(S0_M30).on(bind("ptax_cur_cd").eq(S0_M30.cur_cd))
						.leftOuterJoin(S0_M36).on(
							bracket(
								S0_T1.bd_dpt_cd.eq(S0_M36.dpt_cd)
								.and(S0_T1.reg_dt.between(S0_M36.st_dt, S0_M36.end_dt))
							)
						)
						.leftOuterJoin(S0_M37).on(
							bracket(
								S0_T1.itm_cd.eq(S0_M37.itm_cd)
								.and(S0_T1.itm_sub1.eq(S0_M37.itm_sub1))
								.and(S0_T1.itm_sub2.eq(S0_M37.itm_sub2))
								.and(S0_T1.itm_sub3.eq(S0_M37.itm_sub3))
								.and(S0_M37.lcl_cd.eq(S0_M18.prnt_lcl_cd))
							)
						)
						.leftOuterJoin(S0_M41).on(
							bracket(
								S0_T1.rqst_fr_dpt_cd.eq(S0_M41.dpt_cd)
								.and(S0_T1.reg_dt.between(S0_M41.st_dt, S0_M41.end_dt))
							)
						)
					)
					.where(
						value(0).eq(value(0))
						.and(S0_T1.po_schd_no.eq(bind("split_src_po_schd_no")))
						.and(
							S0_T1.po_schd_chg_typ.in(
								value(MSC_PO_SCHD_CHG_TYP.NOT_CHG.value()),
								value(MSC_PO_SCHD_CHG_TYP.DIV_ADD.value())
							)
						)
						.and(S0_T1.dlv_cd.isNull())
						.and(S0_T1.po_schd_src_typ.neq(value(MSC_PO_SCHD_SRC_TYP.RQST.value())))
						.and(S0_T1.po_flg.eq(value(false)))
						.and(S0_T1.abort_flg.eq(value(false)))
						.and(S0_M2.dscnt_itm_flg.eq(value(false)))
						.and(
							notExists(
								subQuery()
								.select(value("X"))
								.from(S1_ST1)
								.where(
									S0_T1.outsrc_itm_ord_no.eq(S1_ST1.itm_ord_no)
									.and(S1_ST1.can_flg.eq(value(false)))
								)
							)
						)
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
							m.unit_cd
						))
						.addMap((r, m) -> {
							r.setNumberNE("trd_unit_dec_place", m.dec_place());
							r.setStringNE("trd_unit_rnd_typ", m.rnd_typ());
							r.setNumberNE("trd_unit_conv_base_qty", m.conv_base_qty());
							r.setNumberNE("trd_unit_conv_qty", m.conv_qty());
							r.setStringNE("join_unit_cd_", m.unit_cd());
					}),
					j -> j
						.add(MAM_UNIT_R.class, r -> toCondition(
							r.getStringNE("join_unit_cd_")
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
							r.getStringNE("base_unit_cd")
						))
						.addSelect(m -> toArray(
							m.unit_cd
						))
						.addMap((r, m) -> {
							r.setStringNE("join_unit_cd_", m.unit_cd());
					}),
					j -> j
						.add(MAM_UNIT_R.class, r -> toCondition(
							r.getStringNE("join_unit_cd_")
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
						.add(MAM_LOC_R.class, r -> toCondition(
							r.getStringNE("in_to_loc_cd")
						))
						.addSelect(m -> toArray(
							m.cal_cd,
							m.lg_grp_cd,
							m.loc_cd,
							m.loc_nm,
							m.site_cd,
							m.sppl_cd,
							m.str_ln_tgt_flg,
							m.wg_cd
						))
						.addMap((r, m) -> {
							r.setStringNE("in_to_loc_nm", m.loc_nm());
							r.setStringNE("in_to_loc_wg_cd", m.wg_cd());
							r.setStringNE("outsrc_sppl_cd", m.sppl_cd());
							r.setBooleanNE("str_ln_tgt_flg", m.str_ln_tgt_flg());
							r.setStringNE("in_to_loc_cal_cd", m.cal_cd());
							r.setStringNE("site_cd", m.site_cd());
							r.setStringNE("lg_grp_cd", m.lg_grp_cd());
							r.setStringNE("join_loc_cd_", m.loc_cd());
					}),
					j -> j
						.add(MAM_WG_R.class, r -> toCondition(
							r.getStringNE("in_to_loc_wg_cd")
						))
						.addSelect(m -> toArray(
							m.wg_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("in_to_loc_wg_nm", m.wg_nm());
					}),
					j -> j
						.add(MAM_STR_LN_R.class, r -> toCondition(
							r.getStringNE("join_loc_cd_"),
							r.getStringNE("str_ln_cd")
						))
						.addSelect(m -> toArray(
							m.str_ln_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("str_ln_nm", m.str_ln_nm());
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
						.add(MAM_BIZ_RSN_R.class, r -> toCondition(
							r.getStringNE("purc_rsn_cd")
						))
						.addSelect(m -> toArray(
							m.biz_rsn_nm,
							m.xpns_purc_flg
						))
						.addMap((r, m) -> {
							r.setStringNE("purc_rsn_nm", m.biz_rsn_nm());
							r.setBooleanNE("xpns_purc_flg", m.xpns_purc_flg());
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
							r.setBooleanNE("inc_tax_flg", m.inc_tax_flg());
							r.setStringNE("tax_typ", m.tax_typ());
							r.setStringNE("tax_nm", m.tax_nm());
							r.setNumberNE("tax_rate", m.tax_rate());
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
						.add(MAM_USR_R.class, r -> toCondition(
							r.getStringNE("rqst_fr_usr_cd")
						))
						.addSelect(m -> toArray(
							m.usr_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("rqst_fr_usr_nm", m.usr_nm());
					})
				)
			);
	}
	
	/**
	 * -- MSBDL0040_MST_PO_SCHD_Query_S02
	 */
	static MCQueryPlan MSBDL0040_MST_PO_SCHD_S02() {
		MST_PO_SCHD_R S0_T1 = MST_PO_SCHD_R.create("T1");
		MAVM_RD_WG_R S0_M0 = MAVM_RD_WG_R.create("M0");
		MAM_ITM_R S0_M2 = MAM_ITM_R.create("M2");
		MAM_SUNDRY_ITM_R S0_SUNDRYITM = MAM_SUNDRY_ITM_R.create("SUNDRYITM");
		MAM_DPT_R S0_M11 = MAM_DPT_R.create("M11");
		MAM_CUR_R S0_M25 = MAM_CUR_R.create("M25");
		MAM_CUR_R S0_M30 = MAM_CUR_R.create("M30");
		MAM_DPT_R S0_M36 = MAM_DPT_R.create("M36");
		MST_PO_SCHD_R S1_T4 = MST_PO_SCHD_R.create("T4");
		MAM_DPT_R S0_M41 = MAM_DPT_R.create("M41");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBDL0040_MST_PO_SCHD_Query_S02")
					.mainQuery()
					.select(
						S0_T1.abort_flg,
						S0_T1.rqst_upd_stop_flg,
						S0_T1.reg_dt,
						S0_T1.in_to_loc_cd,
						S0_T1.drct_dlv_typ,
						S0_T1.str_ln_cd,
						S0_T1.itm_cd,
						S0_T1.itm_sub1,
						S0_T1.itm_sub2,
						S0_T1.itm_sub3,
						coalesce(
							S0_SUNDRYITM.itm_nm,
							S0_T1.itm_nm,
							S0_M2.itm_nm
						).as("itm_nm"),
						S0_T1.iv_itm_nm,
						S0_T1.sundry_itm_flg,
						S0_M2.ver_flg,
						S0_M2.asset_mng_typ,
						S0_M2.dscnt_itm_flg,
						S0_M2.purc_upri_cng_flg.as("itm_purc_upri_cng_flg"),
						S0_T1.ver_no,
						S0_T1.trd_unit_cd,
						S0_T1.trd_unit_qty,
						S0_T1.base_unit_cd,
						S0_T1.base_unit_qty,
						S0_M2.cont_fctr_flg,
						S0_M2.cont_fctr_dec_place,
						S0_M2.cont_fctr_rnd_typ,
						S0_M2.std_cont_fctr,
						S0_M2.cont_fctr_unit_cd,
						S0_T1.sppl_cd,
						S0_T1.maker_cd,
						S0_T1.sppl_itm_cd,
						S0_T1.sppl_itm_nm,
						S0_T1.po_schd_dt,
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
						S0_T1.rqst_avl_rqst_dt,
						S0_T1.purc_usr_cd,
						S0_T1.purc_dpt_cd,
						S0_M11.dpt_nm.as("purc_dpt_nm"),
						S0_T1.wg_cd.as("purc_dpt_wg_cd"),
						S0_T1.purc_upri_req_typ,
						S0_T1.upri_not_tgt_flg,
						S0_T1.tax_cd,
						S0_T1.trd_cur_cd,
						S0_T1.interim_flg,
						S0_T1.trd_cur_upri,
						S0_T1.trd_cur_amt,
						S0_T1.trd_cur_tax_amt,
						S0_T1.trd_cur_amt.add(S0_T1.trd_cur_tax_amt).as("trd_cur_inc_tax_amt"),
						S0_T1.trd_cur_proc_upri,
						S0_T1.trd_cur_proc_amt,
						S0_T1.trd_cur_onr_prov_upri,
						S0_T1.trd_cur_onr_prov_amt,
						S0_T1.xrate_inpt_flg,
						S0_T1.xrate,
						bind("base_cur_cd").as("base_cur_cd"),
						S0_M25.cur_nm.as("base_cur_nm"),
						S0_M25.amt_dec_place.as("base_cur_amt_dec_place"),
						S0_M25.upri_dec_place.as("base_cur_upri_dec_place"),
						S0_T1.ptax_xrate_inpt_flg,
						S0_T1.ptax_xrate,
						bind("ptax_cur_cd").as("ptax_cur_cd"),
						S0_M30.cur_nm.as("ptax_cur_nm"),
						S0_M30.amt_dec_place.as("ptax_cur_amt_dec_place"),
						S0_M30.upri_dec_place.as("ptax_cur_upri_dec_place"),
						S0_T1.upd_cntr.as("po_schd_upd_cntr"),
						S0_T1.sno1,
						S0_T1.sno2,
						S0_T1.sno3,
						S0_T1.sno4,
						S0_T1.purc_rsn_cd,
						S0_T1.intr_rmrks,
						S0_T1.trd_d_rmrks,
						S0_T1.po_cnt_rmrks,
						S0_T1.mfg_loc_cd,
						S0_T1.bom_ptn,
						S0_T1.outsrc_flg,
						S0_T1.bd_dpt_cd,
						S0_M36.dpt_nm.as("bd_dpt_nm"),
						S0_T1.bd_itm_cd,
						S0_T1.bd_itm_sub1,
						S0_T1.bd_itm_sub2,
						S0_T1.bd_itm_sub3,
						S0_T1.bd_lot_no,
						S0_T1.bd_sublot_no,
						S0_T1.bd_sno1,
						S0_T1.bd_sno2,
						S0_T1.bd_sno3,
						S0_T1.bd_sno4,
						S0_T1.bd_loc_cd,
						S0_T1.bd_ctg_cd,
						S0_T1.bd_oper_cd,
						S0_T1.bd_iv_no,
						S0_T1.bd_slo_no,
						S0_T1.bd_po_no,
						S0_T1.rqst_fr_usr_cd,
						S0_T1.rqst_fr_dpt_cd,
						S0_M41.dpt_nm.as("rqst_fr_dpt_nm"),
						S0_T1.po_schd_no,
						S0_T1.po_schd_src_typ,
						S0_T1.trd_ptn_typ,
						S0_T1.upd_cntr.as("po_schd_upd_cntr"),
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
						.innerJoin(S0_M0).on(
							bracket(
								S0_T1.wg_cd.eq(S0_M0.wg_cd)
							)
						)
						.leftOuterJoin(S0_M2).on(
							bracket(
								S0_T1.itm_cd.eq(S0_M2.itm_cd)
								.and(S0_T1.itm_sub1.eq(S0_M2.itm_sub1))
								.and(S0_T1.itm_sub2.eq(S0_M2.itm_sub2))
								.and(S0_T1.itm_sub3.eq(S0_M2.itm_sub3))
							)
						)
						.leftOuterJoin(S0_SUNDRYITM).on(
							S0_T1.itm_cd.eq(S0_SUNDRYITM.itm_cd)
							.and(S0_T1.itm_sub1.eq(S0_SUNDRYITM.itm_sub1))
							.and(S0_T1.itm_sub2.eq(S0_SUNDRYITM.itm_sub2))
							.and(S0_T1.itm_sub3.eq(S0_SUNDRYITM.itm_sub3))
							.and(S0_T1.sno1.eq(S0_SUNDRYITM.sno1))
							.and(S0_T1.sno2.eq(S0_SUNDRYITM.sno2))
							.and(S0_T1.sno3.eq(S0_SUNDRYITM.sno3))
							.and(S0_T1.sno4.eq(S0_SUNDRYITM.sno4))
						)
						.leftOuterJoin(S0_M11).on(
							bracket(
								S0_T1.purc_dpt_cd.eq(S0_M11.dpt_cd)
								.and(S0_T1.reg_dt.between(S0_M11.st_dt, S0_M11.end_dt))
							)
						)
						.leftOuterJoin(S0_M25).on(bind("base_cur_cd").eq(S0_M25.cur_cd))
						.leftOuterJoin(S0_M30).on(bind("ptax_cur_cd").eq(S0_M30.cur_cd))
						.leftOuterJoin(S0_M36).on(
							bracket(
								S0_T1.bd_dpt_cd.eq(S0_M36.dpt_cd)
								.and(S0_T1.reg_dt.between(S0_M36.st_dt, S0_M36.end_dt))
							)
						)
						.leftOuterJoin(S0_M41).on(
								bracket(
									S0_T1.rqst_fr_dpt_cd.eq(S0_M41.dpt_cd)
									.and(S0_T1.reg_dt.between(S0_M41.st_dt, S0_M41.end_dt))
								)
						)
					)
					.where(
						value(0).eq(value(0))
						.and(S0_T1.can_flg.eq(value(true)))
						.and(S0_T1.po_schd_chg_typ.eq(value(MSC_PO_SCHD_CHG_TYP.DIV_DEL.value())))
						.cutoff$and(S0_T1.po_schd_no.eq(bind("split_src_po_schd_no")))
						.cutoff$and(
							exists(
								subQuery()
								.select(value("X"))
								.from(S1_T4)
								.where(
									S1_T4.split_src_schd_no.eq(S0_T1.po_schd_no)
									.and(S1_T4.po_schd_no.eq(bind("split_dst_po_schd_no")))
								)
							)
						)
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
							m.unit_cd
						))
						.addMap((r, m) -> {
							r.setNumberNE("trd_unit_conv_base_qty", m.conv_base_qty());
							r.setNumberNE("trd_unit_conv_qty", m.conv_qty());
							r.setStringNE("join_unit_cd_", m.unit_cd());
					}),
					j -> j
						.add(MAM_UNIT_R.class, r -> toCondition(
							r.getStringNE("join_unit_cd_")
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
							m.unit_cd
						))
						.addMap((r, m) -> {
							r.setStringNE("join_unit_cd_", m.unit_cd());
					}),
					j -> j
						.add(MAM_UNIT_R.class, r -> toCondition(
							r.getStringNE("join_unit_cd_")
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
						.add(MAM_LOC_R.class, r -> toCondition(
							r.getStringNE("in_to_loc_cd")
						))
						.addSelect(m -> toArray(
							m.cal_cd,
							m.lg_grp_cd,
							m.loc_cd,
							m.loc_nm,
							m.site_cd,
							m.sppl_cd,
							m.str_ln_tgt_flg,
							m.wg_cd
						))
						.addMap((r, m) -> {
							r.setStringNE("in_to_loc_nm", m.loc_nm());
							r.setStringNE("in_to_loc_wg_cd", m.wg_cd());
							r.setStringNE("outsrc_sppl_cd", m.sppl_cd());
							r.setBooleanNE("str_ln_tgt_flg", m.str_ln_tgt_flg());
							r.setStringNE("in_to_loc_cal_cd", m.cal_cd());
							r.setStringNE("site_cd", m.site_cd());
							r.setStringNE("lg_grp_cd", m.lg_grp_cd());
							r.setStringNE("join_loc_cd_", m.loc_cd());
					}),
					j -> j
						.add(MAM_WG_R.class, r -> toCondition(
							r.getStringNE("in_to_loc_wg_cd")
						))
						.addSelect(m -> toArray(
							m.wg_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("in_to_loc_wg_nm", m.wg_nm());
					}),
					j -> j
						.add(MAM_STR_LN_R.class, r -> toCondition(
							r.getStringNE("join_loc_cd_"),
							r.getStringNE("str_ln_cd")
						))
						.addSelect(m -> toArray(
							m.str_ln_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("str_ln_nm", m.str_ln_nm());
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
						.add(MAM_BIZ_RSN_R.class, r -> toCondition(
							r.getStringNE("purc_rsn_cd")
						))
						.addSelect(m -> toArray(
							m.biz_rsn_nm,
							m.xpns_purc_flg
						))
						.addMap((r, m) -> {
							r.setStringNE("purc_rsn_nm", m.biz_rsn_nm());
							r.setBooleanNE("xpns_purc_flg", m.xpns_purc_flg());
					}),
					j -> j
						.add(MAM_BP_R.class, r -> toCondition(
							r.getStringNE("sppl_cd")
						))
						.addSelect(m -> toArray(
							m.bp_nm,
							m.cntry_cd,
							m.purc_amt_rnd_typ,
							m.purc_tax_rnd_typ,
							m.purc_upri_cng_flg,
							m.sppl_cal_cd,
							m.repurc_obli_flg,
							m.outsrc_upri_typ
						))
						.addMap((r, m) -> {
							r.setStringNE("sppl_nm", m.bp_nm());
							r.setStringNE("sppl_cntry_cd", m.cntry_cd());
							r.setStringNE("purc_amt_rnd_typ", m.purc_amt_rnd_typ());
							r.setStringNE("purc_tax_rnd_typ", m.purc_tax_rnd_typ());
							r.setBooleanNE("sppl_purc_upri_cng_flg", m.purc_upri_cng_flg());
							r.setStringNE("sppl_cal_cd", m.sppl_cal_cd());
							if(r.getBooleanNE("outsrc_flg")) {
								r.setBooleanNE("repurc_obli_flg", m.repurc_obli_flg());
								r.setStringNE("outsrc_upri_typ", m.outsrc_upri_typ() == null ? getCo().outsrc_upri_typ() : m.outsrc_upri_typ());
							} else {
								r.setBooleanNE("repurc_obli_flg", false);
								r.setStringNE("outsrc_upri_typ", null);
							}
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
							r.setBooleanNE("inc_tax_flg", m.inc_tax_flg());
							r.setStringNE("tax_typ", m.tax_typ());
							r.setStringNE("tax_nm", m.tax_nm());
							r.setNumberNE("tax_rate", m.tax_rate());
					}),
					j -> j
						.add(MAM_ITM_R.class, r -> toCondition(
							r.getStringNE("bd_itm_cd"),
							r.getStringNE("bd_itm_sub1"),
							r.getStringNE("bd_itm_sub2"),
							r.getStringNE("bd_itm_sub3")
						))
						.addSelect(m -> toArray(
							m.itm_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("bd_itm_nm", m.itm_nm());
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
						.add(MAM_USR_R.class, r -> toCondition(
							r.getStringNE("rqst_fr_usr_cd")
						))
						.addSelect(m -> toArray(
							m.usr_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("rqst_fr_usr_nm", m.usr_nm());
					})
				)
			);
	}
	
	/**
	 * -- MSBDL0040_MST_PO_SCHD_Query_S03
	 */
	static MCQueryPlan MSBDL0040_MST_PO_SCHD_S03() {
		MST_PO_SCHD_R S0_T1 = MST_PO_SCHD_R.create("T1");
		MAVM_RD_WG_R S0_M0 = MAVM_RD_WG_R.create("M0");
		MAM_ITM_R S0_M2 = MAM_ITM_R.create("M2");
		MAM_SUNDRY_ITM_R S0_SUNDRYITM = MAM_SUNDRY_ITM_R.create("SUNDRYITM");
		MAM_DPT_R S0_M11 = MAM_DPT_R.create("M11");
		MAM_CUR_R S0_M25 = MAM_CUR_R.create("M25");
		MAM_CUR_R S0_M30 = MAM_CUR_R.create("M30");
		MAM_DPT_R S0_M36 = MAM_DPT_R.create("M36");
		MST_PO_SCHD_R S1_T4 = MST_PO_SCHD_R.create("T4");
		MAM_DPT_R S0_M41 = MAM_DPT_R.create("M41");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBDL0040_MST_PO_SCHD_Query_S03")
					.mainQuery()
					.select(
						S0_T1.abort_flg,
						S0_T1.rqst_upd_stop_flg,
						S0_T1.reg_dt,
						S0_T1.in_to_loc_cd,
						S0_T1.drct_dlv_typ,
						S0_T1.str_ln_cd,
						S0_T1.itm_cd,
						S0_T1.itm_sub1,
						S0_T1.itm_sub2,
						S0_T1.itm_sub3,
						coalesce(
							S0_SUNDRYITM.itm_nm,
							S0_T1.itm_nm,
							S0_M2.itm_nm
						).as("itm_nm"),
						S0_T1.iv_itm_nm,
						S0_T1.sundry_itm_flg,
						S0_M2.ver_flg,
						S0_M2.asset_mng_typ,
						S0_M2.dscnt_itm_flg,
						S0_M2.purc_upri_cng_flg.as("itm_purc_upri_cng_flg"),
						S0_T1.ver_no,
						S0_T1.trd_unit_cd,
						S0_T1.trd_unit_qty,
						S0_T1.base_unit_cd,
						S0_T1.base_unit_qty,
						S0_M2.cont_fctr_flg,
						S0_M2.cont_fctr_dec_place,
						S0_M2.cont_fctr_rnd_typ,
						S0_M2.std_cont_fctr,
						S0_M2.cont_fctr_unit_cd,
						S0_T1.sppl_cd,
						S0_T1.maker_cd,
						S0_T1.sppl_itm_cd,
						S0_T1.sppl_itm_nm,
						S0_T1.po_schd_dt,
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
						S0_T1.rqst_avl_rqst_dt,
						S0_T1.purc_usr_cd,
						S0_T1.purc_dpt_cd,
						S0_M11.dpt_nm.as("purc_dpt_nm"),
						S0_T1.wg_cd.as("purc_dpt_wg_cd"),
						S0_T1.purc_upri_req_typ,
						S0_T1.upri_not_tgt_flg,
						S0_T1.tax_cd,
						S0_T1.trd_cur_cd,
						S0_T1.interim_flg,
						S0_T1.trd_cur_upri,
						S0_T1.trd_cur_amt,
						S0_T1.trd_cur_tax_amt,
						S0_T1.trd_cur_amt.add(S0_T1.trd_cur_tax_amt).as("trd_cur_inc_tax_amt"),
						S0_T1.trd_cur_proc_upri,
						S0_T1.trd_cur_proc_amt,
						S0_T1.trd_cur_onr_prov_upri,
						S0_T1.trd_cur_onr_prov_amt,
						S0_T1.xrate_inpt_flg,
						S0_T1.xrate,
						bind("base_cur_cd").as("base_cur_cd"),
						S0_M25.cur_nm.as("base_cur_nm"),
						S0_M25.amt_dec_place.as("base_cur_amt_dec_place"),
						S0_M25.upri_dec_place.as("base_cur_upri_dec_place"),
						S0_T1.ptax_xrate_inpt_flg,
						S0_T1.ptax_xrate,
						bind("ptax_cur_cd").as("ptax_cur_cd"),
						S0_M30.cur_nm.as("ptax_cur_nm"),
						S0_M30.amt_dec_place.as("ptax_cur_amt_dec_place"),
						S0_M30.upri_dec_place.as("ptax_cur_upri_dec_place"),
						S0_T1.upd_cntr.as("po_schd_upd_cntr"),
						S0_T1.sno1,
						S0_T1.sno2,
						S0_T1.sno3,
						S0_T1.sno4,
						S0_T1.purc_rsn_cd,
						S0_T1.intr_rmrks,
						S0_T1.trd_d_rmrks,
						S0_T1.po_cnt_rmrks,
						S0_T1.mfg_loc_cd,
						S0_T1.bom_ptn,
						S0_T1.outsrc_flg,
						S0_T1.bd_dpt_cd,
						S0_M36.dpt_nm.as("bd_dpt_nm"),
						S0_T1.bd_itm_cd,
						S0_T1.bd_itm_sub1,
						S0_T1.bd_itm_sub2,
						S0_T1.bd_itm_sub3,
						S0_T1.bd_lot_no,
						S0_T1.bd_sublot_no,
						S0_T1.bd_sno1,
						S0_T1.bd_sno2,
						S0_T1.bd_sno3,
						S0_T1.bd_sno4,
						S0_T1.bd_loc_cd,
						S0_T1.bd_ctg_cd,
						S0_T1.bd_oper_cd,
						S0_T1.bd_iv_no,
						S0_T1.bd_slo_no,
						S0_T1.bd_po_no,
						S0_T1.rqst_fr_usr_cd,
						S0_T1.rqst_fr_dpt_cd,
						S0_M41.dpt_nm.as("rqst_fr_dpt_nm"),
						S0_T1.po_schd_no,
						S0_T1.po_schd_src_typ,
						S0_T1.trd_ptn_typ,
						S0_T1.upd_cntr.as("po_schd_upd_cntr"),
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
						.innerJoin(S0_M0).on(
							bracket(
								S0_T1.wg_cd.eq(S0_M0.wg_cd)
							)
						)
						.leftOuterJoin(S0_M2).on(
							bracket(
								S0_T1.itm_cd.eq(S0_M2.itm_cd)
								.and(S0_T1.itm_sub1.eq(S0_M2.itm_sub1))
								.and(S0_T1.itm_sub2.eq(S0_M2.itm_sub2))
								.and(S0_T1.itm_sub3.eq(S0_M2.itm_sub3))
							)
						)
						.leftOuterJoin(S0_SUNDRYITM).on(
							S0_T1.itm_cd.eq(S0_SUNDRYITM.itm_cd)
							.and(S0_T1.itm_sub1.eq(S0_SUNDRYITM.itm_sub1))
							.and(S0_T1.itm_sub2.eq(S0_SUNDRYITM.itm_sub2))
							.and(S0_T1.itm_sub3.eq(S0_SUNDRYITM.itm_sub3))
							.and(S0_T1.sno1.eq(S0_SUNDRYITM.sno1))
							.and(S0_T1.sno2.eq(S0_SUNDRYITM.sno2))
							.and(S0_T1.sno3.eq(S0_SUNDRYITM.sno3))
							.and(S0_T1.sno4.eq(S0_SUNDRYITM.sno4))
						)
						.leftOuterJoin(S0_M11).on(
							bracket(
								S0_T1.purc_dpt_cd.eq(S0_M11.dpt_cd)
								.and(S0_T1.reg_dt.between(S0_M11.st_dt, S0_M11.end_dt))
							)
						)
						.leftOuterJoin(S0_M25).on(bind("base_cur_cd").eq(S0_M25.cur_cd))
						.leftOuterJoin(S0_M30).on(bind("ptax_cur_cd").eq(S0_M30.cur_cd))
						.leftOuterJoin(S0_M36).on(
							bracket(
								S0_T1.bd_dpt_cd.eq(S0_M36.dpt_cd)
								.and(S0_T1.reg_dt.between(S0_M36.st_dt, S0_M36.end_dt))
							)
						)
						.leftOuterJoin(S0_M41).on(
								bracket(
									S0_T1.rqst_fr_dpt_cd.eq(S0_M41.dpt_cd)
									.and(S0_T1.reg_dt.between(S0_M41.st_dt, S0_M41.end_dt))
								)
						)
					)
					.where(
						value(0).eq(value(0))
						.cutoff$and(S0_T1.split_src_schd_no.eq(bind("split_src_po_schd_no")))
						.cutoff$and(
							S0_T1.split_src_schd_no.in(
								subQuery()
								.select(S1_T4.split_src_schd_no)
								.from(S1_T4)
								.where(
									S1_T4.po_schd_no.eq(bind("split_dst_po_schd_no"))
								)
							)
						)
					)
					.orderBy(S0_T1.po_schd_no.asc())
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
							r.getStringNE("cont_fctr_unit_cd")
						))
						.addSelect(m -> toArray(
							m.unit_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("cont_fctr_unit_nm", m.unit_nm());
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
							m.unit_cd
						))
						.addMap((r, m) -> {
							r.setNumberNE("trd_unit_conv_base_qty", m.conv_base_qty());
							r.setNumberNE("trd_unit_conv_qty", m.conv_qty());
							r.setStringNE("join_unit_cd_", m.unit_cd());
					}),
					j -> j
						.add(MAM_UNIT_R.class, r -> toCondition(
							r.getStringNE("join_unit_cd_")
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
							m.unit_cd
						))
						.addMap((r, m) -> {
							r.setStringNE("join_unit_cd_", m.unit_cd());
					}),
					j -> j
						.add(MAM_UNIT_R.class, r -> toCondition(
							r.getStringNE("join_unit_cd_")
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
						.add(MAM_LOC_R.class, r -> toCondition(
							r.getStringNE("in_to_loc_cd")
						))
						.addSelect(m -> toArray(
							m.cal_cd,
							m.lg_grp_cd,
							m.loc_cd,
							m.loc_nm,
							m.site_cd,
							m.sppl_cd,
							m.str_ln_tgt_flg,
							m.wg_cd
						))
						.addMap((r, m) -> {
							r.setStringNE("in_to_loc_nm", m.loc_nm());
							r.setStringNE("in_to_loc_wg_cd", m.wg_cd());
							r.setStringNE("outsrc_sppl_cd", m.sppl_cd());
							r.setBooleanNE("str_ln_tgt_flg", m.str_ln_tgt_flg());
							r.setStringNE("in_to_loc_cal_cd", m.cal_cd());
							r.setStringNE("site_cd", m.site_cd());
							r.setStringNE("lg_grp_cd", m.lg_grp_cd());
							r.setStringNE("join_loc_cd_", m.loc_cd());
					}),
					j -> j
						.add(MAM_WG_R.class, r -> toCondition(
							r.getStringNE("in_to_loc_wg_cd")
						))
						.addSelect(m -> toArray(
							m.wg_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("in_to_loc_wg_nm", m.wg_nm());
					}),
					j -> j
						.add(MAM_STR_LN_R.class, r -> toCondition(
							r.getStringNE("join_loc_cd_"),
							r.getStringNE("str_ln_cd")
						))
						.addSelect(m -> toArray(
							m.str_ln_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("str_ln_nm", m.str_ln_nm());
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
						.add(MAM_BIZ_RSN_R.class, r -> toCondition(
							r.getStringNE("purc_rsn_cd")
						))
						.addSelect(m -> toArray(
							m.biz_rsn_nm,
							m.xpns_purc_flg
						))
						.addMap((r, m) -> {
							r.setStringNE("purc_rsn_nm", m.biz_rsn_nm());
							r.setBooleanNE("xpns_purc_flg", m.xpns_purc_flg());
					}),
					j -> j
						.add(MAM_BP_R.class, r -> toCondition(
							r.getStringNE("sppl_cd")
						))
						.addSelect(m -> toArray(
							m.bp_nm,
							m.cntry_cd,
							m.purc_amt_rnd_typ,
							m.purc_tax_rnd_typ,
							m.purc_upri_cng_flg,
							m.sppl_cal_cd,
							m.repurc_obli_flg,
							m.outsrc_upri_typ
						))
						.addMap((r, m) -> {
							r.setStringNE("sppl_nm", m.bp_nm());
							r.setStringNE("sppl_cntry_cd", m.cntry_cd());
							r.setStringNE("purc_amt_rnd_typ", m.purc_amt_rnd_typ());
							r.setStringNE("purc_tax_rnd_typ", m.purc_tax_rnd_typ());
							r.setBooleanNE("sppl_purc_upri_cng_flg", m.purc_upri_cng_flg());
							r.setStringNE("sppl_cal_cd", m.sppl_cal_cd());
							if(r.getBooleanNE("outsrc_flg")) {
								r.setBooleanNE("repurc_obli_flg", m.repurc_obli_flg());
								r.setStringNE("outsrc_upri_typ", m.outsrc_upri_typ() == null ? getCo().outsrc_upri_typ() : m.outsrc_upri_typ());
							} else {
								r.setBooleanNE("repurc_obli_flg", false);
								r.setStringNE("outsrc_upri_typ", null);
							}
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
							r.setBooleanNE("inc_tax_flg", m.inc_tax_flg());
							r.setStringNE("tax_typ", m.tax_typ());
							r.setStringNE("tax_nm", m.tax_nm());
							r.setNumberNE("tax_rate", m.tax_rate());
					}),
					j -> j
						.add(MAM_ITM_R.class, r -> toCondition(
							r.getStringNE("bd_itm_cd"),
							r.getStringNE("bd_itm_sub1"),
							r.getStringNE("bd_itm_sub2"),
							r.getStringNE("bd_itm_sub3")
						))
						.addSelect(m -> toArray(
							m.itm_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("bd_itm_nm", m.itm_nm());
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
						.add(MAM_USR_R.class, r -> toCondition(
							r.getStringNE("rqst_fr_usr_cd")
						))
						.addSelect(m -> toArray(
							m.usr_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("rqst_fr_usr_nm", m.usr_nm());
					})
				)
			);
	}
}